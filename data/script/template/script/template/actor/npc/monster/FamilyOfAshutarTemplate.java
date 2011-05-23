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
public class FamilyOfAshutarTemplate extends MonsterNPCTemplate {
	public static final int ID = 25317;

	@Inject
	protected FamilyOfAshutarTemplate(NPCTemplateIDProvider provider, ItemTemplateIDProvider itemProvider) {
		super(provider.createID(ID));
		this.name = "Family of Ashutar";
		this.serverSideName = false;
		this.title = "Raid Fighter";
		this.serverSideTitle = false;
		this.collisionRadius = 11.00;
		this.collisionHeight = 20.00;
		this.level = 80;
		this.sex = ActorSex.MALE;
		this.attackRange = 40;
		this.maxHP = 37741.436536621400000;
		this.maxMP = 1994.708000000000000;
		this.hpRegeneration = 80.581333368984700;
		this.mpRegeneration = 3.180000000000000;
		this.experience = 0;
		this.sp = 0;
		this.aggressive = false;
		this.rightHand = null;
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
		attributes.physicalAttack = 3642.58983;
		attributes.magicalAttack = 4799.50286;
		attributes.physicalDefense = 581.33612;
		attributes.magicalDefense = 567.18480;
		attributes.attackSpeed = 253;
		attributes.castSpeed = 333;
		attributes.criticalChance = 1;
		attributes.walkSpeed = 90.00000;
		attributes.runSpeed = 190.00000;
	}
}
