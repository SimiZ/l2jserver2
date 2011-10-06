/*
 * This file is part of l2jserver <l2jserver.com>.
 *
 * l2jserver is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * l2jserver is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with l2jserver.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.l2jserver.service.game.effect;

import com.l2jserver.model.world.L2Character;
import com.l2jserver.service.Service;

/**
 * The effect service will handle. This service will be backed by a thread that
 * will execute the effect.
 * 
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 */
public interface EffectService extends Service {
	/**
	 * Adds a new effect to an given <tt>character</tt>. The effect will last
	 * <tt>duration</tt> milliseconds.
	 * 
	 * @param character
	 *            the character
	 * @param duration
	 *            the effect duration in milliseconds
	 */
	void addEffect(L2Character character, long duration);
}