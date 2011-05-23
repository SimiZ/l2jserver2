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
public class ZakensEliteArcherTemplate extends MonsterNPCTemplate {
	public static final int ID = 21607;

	@Inject
	protected ZakensEliteArcherTemplate(NPCTemplateIDProvider provider, ItemTemplateIDProvider itemProvider) {
		super(provider.createID(ID));
		this.name = "Zaken's Elite Archer";
		this.serverSideName = false;
		this.title = "";
		this.serverSideTitle = false;
		this.collisionRadius = 13.00;
		this.collisionHeight = 32.50;
		this.level = 44;
		this.sex = ActorSex.MALE;
		this.attackRange = 1100;
		this.maxHP = 1138.629240000000000;
		this.maxMP = 584.000000000000000;
		this.hpRegeneration = 5.500000000000000;
		this.mpRegeneration = 2.100000000000000;
		this.experience = 10911;
		this.sp = 746;
		this.aggressive = false;
		this.rightHand = itemProvider.createID(279);
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
		attributes.physicalAttack = 222.23112;
		attributes.magicalAttack = 151.75505;
		attributes.physicalDefense = 173.43552;
		attributes.magicalDefense = 115.47533;
		attributes.attackSpeed = 253;
		attributes.castSpeed = 333;
		attributes.criticalChance = 8;
		attributes.walkSpeed = 40.00000;
		attributes.runSpeed = 174.00000;
	}
}
