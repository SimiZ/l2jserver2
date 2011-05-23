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
package script.template.actor.npc.raidboss;

import com.google.inject.Inject;
import com.l2jserver.model.id.template.provider.ItemTemplateIDProvider;
import com.l2jserver.model.id.template.provider.NPCTemplateIDProvider;
import com.l2jserver.model.template.npc.RaidBossNPCTemplate;
import com.l2jserver.model.world.Actor.ActorSex;

/**
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 */
public class Anakazel3Template extends RaidBossNPCTemplate {
	public static final int ID = 25335;

	@Inject
	protected Anakazel3Template(NPCTemplateIDProvider provider, ItemTemplateIDProvider itemProvider) {
		super(provider.createID(ID));
		this.name = "Anakazel";
		this.serverSideName = false;
		this.title = "Invaders' Leader";
		this.serverSideTitle = false;
		this.collisionRadius = 28.00;
		this.collisionHeight = 48.00;
		this.level = 48;
		this.sex = ActorSex.MALE;
		this.attackRange = 40;
		this.maxHP = 207715.744743993000000;
		this.maxMP = 692.400000000000000;
		this.hpRegeneration = 101.830256959529000;
		this.mpRegeneration = 2.100000000000000;
		this.experience = 1586608;
		this.sp = 189699;
		this.aggressive = false;
		this.rightHand = null;
		this.leftHand = null;
		this.enchantLevel = 0;
		this.targetable = true;
		this.showName = true;
		this.dropHerbGroup = 0;
		this.baseAttributes = true;
		
		attributes.intelligence = 76;
		attributes.strength = 60;
		attributes.concentration = 57;
		attributes.mentality = 80;
		attributes.dexterity = 73;
		attributes.witness = 70;
		attributes.physicalAttack = 464.46636;
		attributes.magicalAttack = 158.43765;
		attributes.physicalDefense = 573.38409;
		attributes.magicalDefense = 279.72000;
		attributes.attackSpeed = 253;
		attributes.castSpeed = 333;
		attributes.criticalChance = 4;
		attributes.walkSpeed = 37.00000;
		attributes.runSpeed = 190.00000;
	}
}
