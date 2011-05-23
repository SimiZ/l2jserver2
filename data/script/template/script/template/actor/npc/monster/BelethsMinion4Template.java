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
public class BelethsMinion4Template extends MonsterNPCTemplate {
	public static final int ID = 22441;

	@Inject
	protected BelethsMinion4Template(NPCTemplateIDProvider provider, ItemTemplateIDProvider itemProvider) {
		super(provider.createID(ID));
		this.name = "Beleth's Minion";
		this.serverSideName = false;
		this.title = "";
		this.serverSideTitle = false;
		this.collisionRadius = 22.00;
		this.collisionHeight = 43.00;
		this.level = 83;
		this.sex = ActorSex.MALE;
		this.attackRange = 40;
		this.maxHP = 56202.842001380900000;
		this.maxMP = 1777.400000000000000;
		this.hpRegeneration = 190.897045965523000;
		this.mpRegeneration = 3.000000000000000;
		this.experience = 638455;
		this.sp = 63306;
		this.aggressive = false;
		this.rightHand = itemProvider.createID(8686);
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
		attributes.physicalAttack = 9516.11506;
		attributes.magicalAttack = 6611.61494;
		attributes.physicalDefense = 595.19567;
		attributes.magicalDefense = 653.30756;
		attributes.attackSpeed = 253;
		attributes.castSpeed = 333;
		attributes.criticalChance = 4;
		attributes.walkSpeed = 60.00000;
		attributes.runSpeed = 160.00000;
	}
}
