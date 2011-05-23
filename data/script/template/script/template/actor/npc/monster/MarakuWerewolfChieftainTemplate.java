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
public class MarakuWerewolfChieftainTemplate extends MonsterNPCTemplate {
	public static final int ID = 20364;

	@Inject
	protected MarakuWerewolfChieftainTemplate(NPCTemplateIDProvider provider, ItemTemplateIDProvider itemProvider) {
		super(provider.createID(ID));
		this.name = "Maraku Werewolf Chieftain";
		this.serverSideName = false;
		this.title = "";
		this.serverSideTitle = false;
		this.collisionRadius = 11.00;
		this.collisionHeight = 29.70;
		this.level = 14;
		this.sex = ActorSex.MALE;
		this.attackRange = 40;
		this.maxHP = 230.385480000000000;
		this.maxMP = 140.880000000000000;
		this.hpRegeneration = 2.500000000000000;
		this.mpRegeneration = 1.200000000000000;
		this.experience = 509;
		this.sp = 20;
		this.aggressive = false;
		this.rightHand = itemProvider.createID(217);
		this.leftHand = null;
		this.enchantLevel = 0;
		this.targetable = true;
		this.showName = true;
		this.dropHerbGroup = 1;
		this.baseAttributes = true;
		
		attributes.intelligence = 21;
		attributes.strength = 40;
		attributes.concentration = 43;
		attributes.mentality = 20;
		attributes.dexterity = 30;
		attributes.witness = 20;
		attributes.physicalAttack = 27.24646;
		attributes.magicalAttack = 18.60580;
		attributes.physicalDefense = 71.08179;
		attributes.magicalDefense = 47.32706;
		attributes.attackSpeed = 253;
		attributes.castSpeed = 333;
		attributes.criticalChance = 8;
		attributes.walkSpeed = 50.00000;
		attributes.runSpeed = 120.00000;
	}
}
