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
package script.template.actor.npc.monster;

import com.google.inject.Inject;
import com.l2jserver.model.id.template.provider.ItemTemplateIDProvider;
import com.l2jserver.model.id.template.provider.NPCTemplateIDProvider;
import com.l2jserver.model.template.npc.MonsterNPCTemplate;
import com.l2jserver.model.world.Actor.ActorSex;

/**
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 */
public class DeathFighterHarikTemplate extends MonsterNPCTemplate {
	public static final int ID = 25222;

	@Inject
	protected DeathFighterHarikTemplate(NPCTemplateIDProvider provider, ItemTemplateIDProvider itemProvider) {
		super(provider.createID(ID));
		this.name = "Death Fighter Harik";
		this.serverSideName = false;
		this.title = "Raid Fighter";
		this.serverSideTitle = false;
		this.collisionRadius = 12.00;
		this.collisionHeight = 31.00;
		this.level = 72;
		this.sex = ActorSex.MALE;
		this.attackRange = 40;
		this.maxHP = 61353.587358337900000;
		this.maxMP = 1410.000000000000000;
		this.hpRegeneration = 119.969286557872000;
		this.mpRegeneration = 3.000000000000000;
		this.experience = 0;
		this.sp = 0;
		this.aggressive = false;
		this.rightHand = itemProvider.createID(75);
		this.leftHand = null;
		this.enchantLevel = 0;
		this.targetable = true;
		this.showName = true;
		this.dropHerbGroup = 0;
		this.baseAttributes = true;
		
		attributes.intelligence = 21;
		attributes.strength = 40;
		attributes.concentration = 43;
		attributes.mentality = 20;
		attributes.dexterity = 30;
		attributes.witness = 20;
		attributes.physicalAttack = 9122.26537;
		attributes.magicalAttack = 13018.19544;
		attributes.physicalDefense = 458.03921;
		attributes.magicalDefense = 446.90000;
		attributes.attackSpeed = 253;
		attributes.castSpeed = 333;
		attributes.criticalChance = 4;
		attributes.walkSpeed = 27.00000;
		attributes.runSpeed = 170.00000;
	}
}
