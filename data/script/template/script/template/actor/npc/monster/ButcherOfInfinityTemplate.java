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
public class ButcherOfInfinityTemplate extends MonsterNPCTemplate {
	public static final int ID = 22516;

	@Inject
	protected ButcherOfInfinityTemplate(NPCTemplateIDProvider provider, ItemTemplateIDProvider itemProvider) {
		super(provider.createID(ID));
		this.name = "Butcher of Infinity";
		this.serverSideName = false;
		this.title = "";
		this.serverSideTitle = false;
		this.collisionRadius = 27.00;
		this.collisionHeight = 48.50;
		this.level = 80;
		this.sex = ActorSex.MALE;
		this.attackRange = 40;
		this.maxHP = 3461.772532158410000;
		this.maxMP = 1708.800000000000000;
		this.hpRegeneration = 8.500000000000000;
		this.mpRegeneration = 3.000000000000000;
		this.experience = 55248;
		this.sp = 5826;
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
		attributes.physicalAttack = 1018.31276;
		attributes.magicalAttack = 699.49026;
		attributes.physicalDefense = 347.65631;
		attributes.magicalDefense = 254.39980;
		attributes.attackSpeed = 253;
		attributes.castSpeed = 333;
		attributes.criticalChance = 4;
		attributes.walkSpeed = 92.00000;
		attributes.runSpeed = 200.00000;
	}
}
