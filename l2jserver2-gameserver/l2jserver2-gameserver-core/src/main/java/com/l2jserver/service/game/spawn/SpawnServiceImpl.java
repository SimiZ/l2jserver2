/*
 * This file is part of l2jserver2 <l2jserver2.com>.
 *
 * l2jserver2 is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * l2jserver2 is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with l2jserver2.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.l2jserver.service.game.spawn;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;
import com.l2jserver.model.world.Actor;
import com.l2jserver.model.world.Actor.ActorState;
import com.l2jserver.model.world.L2Character;
import com.l2jserver.model.world.NPC;
import com.l2jserver.model.world.PositionableObject;
import com.l2jserver.model.world.actor.event.ActorTeleportingEvent;
import com.l2jserver.model.world.event.SpawnEvent;
import com.l2jserver.model.world.event.UnspawnEvent;
import com.l2jserver.model.world.npc.event.NPCSpawnEvent;
import com.l2jserver.model.world.npc.event.NPCUnspawnEvent;
import com.l2jserver.model.world.player.event.PlayerTeleportedEvent;
import com.l2jserver.service.AbstractService;
import com.l2jserver.service.AbstractService.Depends;
import com.l2jserver.service.core.threading.AbstractTask;
import com.l2jserver.service.core.threading.AsyncFuture;
import com.l2jserver.service.core.threading.ThreadService;
import com.l2jserver.service.game.world.WorldService;
import com.l2jserver.service.game.world.event.WorldEventDispatcherService;
import com.l2jserver.util.geometry.Coordinate;
import com.l2jserver.util.geometry.Point3D;

/**
 * Default implementation for {@link SpawnService}
 * 
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 */
@Depends({ WorldService.class, ThreadService.class })
public class SpawnServiceImpl extends AbstractService implements SpawnService {
	/**
	 * The logger
	 */
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	/**
	 * The {@link WorldService}
	 */
	private final WorldService worldService;
	/**
	 * The {@link WorldService} event dispatcher
	 */
	private final WorldEventDispatcherService eventDispatcher;
	/**
	 * The {@link ThreadService}
	 */
	private final ThreadService threadService;

	/**
	 * @param worldService
	 *            the world service
	 * @param eventDispatcher
	 *            the world service event dispatcher
	 * @param threadService
	 *            the thread service
	 */
	@Inject
	public SpawnServiceImpl(WorldService worldService,
			WorldEventDispatcherService eventDispatcher,
			ThreadService threadService) {
		this.worldService = worldService;
		this.eventDispatcher = eventDispatcher;
		this.threadService = threadService;
	}

	@Override
	public void spawn(PositionableObject object, Point3D point)
			throws SpawnPointNotFoundServiceException,
			AlreadySpawnedServiceException {
		Preconditions.checkNotNull(object, "object");
		// only set the new position if needed, this could cause a lot of
		// database updates if update is done unnecessarily
		boolean updatePoint = true;
		// sanitize
		if (point == null) {
			// retrieving stored point
			point = object.getPoint();
			updatePoint = false;
		}
		if (point == null) {
			// not point in argument and no point stored, aborting
			throw new SpawnPointNotFoundServiceException();
		}

		log.debug("Spawning {} at {}", object, point);

		// set the spawning point
		if (updatePoint)
			object.setPoint(point);
		// reset actor state
		if (object instanceof Actor) {
			((Actor) object).setState(null);
		}
		// register object in the world
		if (!worldService.add(object))
			throw new AlreadySpawnedServiceException();

		// create the SpawnEvent
		SpawnEvent event = null;
		if (object instanceof NPC) {
			final NPC npc = (NPC) object;
			event = new NPCSpawnEvent(npc, point);
		} else if (object instanceof L2Character) {
			// TODO character spawn event
			event = null;
		}

		// TODO throw an exception if event is null
		if (event != null)
			// dispatch spawn event
			eventDispatcher.dispatch(event);
		// remember: broadcasting is done through events!
	}

	@Override
	public <T extends PositionableObject> AsyncFuture<T> spawn(final T object,
			final Point3D point, long time, TimeUnit unit) {
		Preconditions.checkNotNull(object, "object");
		Preconditions.checkArgument(time > 0, "time < 0");
		Preconditions.checkNotNull(unit, "unit");

		log.debug("Scheduling spawn of {} at {} in {}ms", new Object[] {
				object, point, unit.toMillis(time) });

		return threadService.async(time, unit, new AbstractTask<T>() {
			@Override
			public T call() throws Exception {
				spawn(object, point);
				return object;
			}
		});
	}

	@Override
	public void unspawn(PositionableObject object)
			throws NotSpawnedServiceException {
		Preconditions.checkNotNull(object, "object");

		if (object.getPoint() == null)
			throw new NotSpawnedServiceException();

		// unregister object in the world
		if (!worldService.remove(object))
			throw new NotSpawnedServiceException();

		log.debug("Unspawning {}", object);
		final Point3D point = object.getPoint();

		// create the SpawnEvent
		UnspawnEvent event = null;
		if (object instanceof NPC) {
			final NPC npc = (NPC) object;
			event = new NPCUnspawnEvent(npc, point);
		} else if (object instanceof L2Character) {
			// TODO character unspawn event
			event = null;
		}

		// TODO throw an exception if event is null
		if (event != null)
			// dispatch unspawn event
			eventDispatcher.dispatch(event);
	}

	@Override
	public <T extends PositionableObject> AsyncFuture<T> unspawn(
			final T object, long time, TimeUnit unit) {
		Preconditions.checkNotNull(object, "object");
		Preconditions.checkArgument(time > 0, "time <= 0");
		Preconditions.checkNotNull(unit, "unit");

		log.debug("Scheduling unspawn of {} in {}ms", object,
				unit.toMillis(time));

		return threadService.async(time, unit, new AbstractTask<T>() {
			@Override
			public T call() throws Exception {
				unspawn(object);
				return object;
			}
		});
	}

	@Override
	public void teleport(Actor actor, Coordinate coordinate)
			throws CharacterAlreadyTeleportingServiceException {
		Preconditions.checkNotNull(actor, "actor");
		Preconditions.checkNotNull(coordinate, "coordinate");

		log.debug("Teleporting {} to {}", actor, coordinate);

		if (actor instanceof L2Character) {
			if (((L2Character) actor).isTeleporting())
				throw new CharacterAlreadyTeleportingServiceException();

			((L2Character) actor).setState(ActorState.TELEPORTING);
			((L2Character) actor).setTargetLocation(coordinate.toPoint());
		} else {
			actor.setPosition(coordinate);
		}
		// dispatch teleport event
		eventDispatcher.dispatch(new ActorTeleportingEvent(actor, coordinate
				.toPoint()));
		// remember: broadcasting is done through events!
	}

	@Override
	public void finishTeleport(L2Character character)
			throws CharacterNotTeleportingServiceException {
		Preconditions.checkNotNull(character, "character");

		if (!character.isTeleporting())
			throw new CharacterNotTeleportingServiceException();

		log.debug("Finishing teleport of {}", character);

		character.setState(null);
		character.setPoint(character.getTargetLocation());

		eventDispatcher.dispatch(new PlayerTeleportedEvent(character, character
				.getTargetLocation()));

		character.setTargetLocation(null);
	}
}
