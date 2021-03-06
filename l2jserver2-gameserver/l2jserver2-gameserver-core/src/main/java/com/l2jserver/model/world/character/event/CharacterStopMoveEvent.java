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
package com.l2jserver.model.world.character.event;

import com.l2jserver.model.id.ObjectID;
import com.l2jserver.model.world.Actor;
import com.l2jserver.model.world.L2Character;
import com.l2jserver.model.world.Player;
import com.l2jserver.model.world.WorldObject;
import com.l2jserver.util.geometry.Point3D;

/**
 * Event triggered once a character moves
 * 
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 */
public class CharacterStopMoveEvent implements CharacterEvent {
	/**
	 * The character that is logging in
	 */
	private final L2Character character;
	/**
	 * The new point of the character
	 */
	private final Point3D point;

	/**
	 * Creates a new instance
	 * 
	 * @param character
	 *            the character
	 * @param point
	 *            the character point
	 */
	public CharacterStopMoveEvent(L2Character character, Point3D point) {
		this.character = character;
		this.point = point;
	}

	/**
	 * @return the point
	 */
	public Point3D getPoint() {
		return point;
	}

	@Override
	public Player getPlayer() {
		return character;
	}

	@Override
	public Actor getActor() {
		return character;
	}

	@Override
	public WorldObject getObject() {
		return character;
	}

	@Override
	public L2Character getCharacter() {
		return character;
	}

	@Override
	public ObjectID<?>[] getDispatchableObjects() {
		return new ObjectID<?>[] { character.getID() };
	}
}
