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
package com.l2jserver.model.world.actor.calculator;

import com.l2jserver.model.template.ActorTemplate;
import com.l2jserver.model.world.Actor;
import com.l2jserver.model.world.actor.stat.BaseStats;
import com.l2jserver.model.world.actor.stat.StatType;

/**
 * Calculates the character base physical attack
 * 
 * <pre>
 * ctx.result = c.getTemplate().getBasePhysicalAttack();
 * ctx.result *= BaseStats.STR.calculateBonus(c.getStats().getStrength())
 * 		* ((100.0 - 11 + c.getLevel()) / 100.0);
 * </pre>
 * 
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 */
public class PhysicalAttackBonusCalculator extends ActorFormula {
	/**
	 * Creates a new instance
	 */
	public PhysicalAttackBonusCalculator() {
		super(0x100, StatType.POWER_ATTACK);
	}

	@Override
	protected double calculate(Actor a, ActorTemplate t, double value) {
		return value * BaseStats.STR.calculateBonus(a.getStats().getStrength())
				* ((100.0 - 11 + a.getLevel()) / 100.0);
	}
}
