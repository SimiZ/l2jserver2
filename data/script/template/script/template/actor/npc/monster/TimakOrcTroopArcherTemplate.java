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
public class TimakOrcTroopArcherTemplate extends MonsterNPCTemplate {
	public static final int ID = 20770;

	@Inject
	protected TimakOrcTroopArcherTemplate(NPCTemplateIDProvider provider, ItemTemplateIDProvider itemProvider) {
		super(provider.createID(ID));
		this.name = "Timak Orc Troop Archer";
		this.serverSideName = false;
		this.title = "";
		this.serverSideTitle = false;
		this.collisionRadius = 11.00;
		this.collisionHeight = 21.50;
		this.level = 41;
		this.sex = ActorSex.MALE;
		this.attackRange = 1100;
		this.maxHP = 1008.237810000000000;
		this.maxMP = 504.800000000000000;
		this.hpRegeneration = 5.500000000000000;
		this.mpRegeneration = 2.100000000000000;
		this.experience = 5183;
		this.sp = 340;
		this.aggressive = false;
		this.rightHand = itemProvider.createID(13);
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
		attributes.physicalAttack = 187.11878;
		attributes.magicalAttack = 127.77787;
		attributes.physicalDefense = 160.69002;
		attributes.magicalDefense = 106.98923;
		attributes.attackSpeed = 253;
		attributes.castSpeed = 333;
		attributes.criticalChance = 8;
		attributes.walkSpeed = 45.00000;
		attributes.runSpeed = 174.00000;
	}
}
