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
public class ChertubaOfGreatSoulTemplate extends RaidBossNPCTemplate {
	public static final int ID = 25063;

	@Inject
	protected ChertubaOfGreatSoulTemplate(NPCTemplateIDProvider provider, ItemTemplateIDProvider itemProvider) {
		super(provider.createID(ID));
		this.name = "Chertuba of Great Soul";
		this.serverSideName = false;
		this.title = "Raid Boss";
		this.serverSideTitle = false;
		this.collisionRadius = 24.00;
		this.collisionHeight = 51.00;
		this.level = 35;
		this.sex = ActorSex.MALE;
		this.attackRange = 40;
		this.maxHP = 138899.136909231000000;
		this.maxMP = 402.600000000000000;
		this.hpRegeneration = 66.985980183290100;
		this.mpRegeneration = 1.800000000000000;
		this.experience = 1912395;
		this.sp = 144137;
		this.aggressive = false;
		this.rightHand = itemProvider.createID(78);
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
		attributes.physicalAttack = 327.39130;
		attributes.magicalAttack = 51.71999;
		attributes.physicalDefense = 410.18844;
		attributes.magicalDefense = 200.10000;
		attributes.attackSpeed = 253;
		attributes.castSpeed = 333;
		attributes.criticalChance = 4;
		attributes.walkSpeed = 36.00000;
		attributes.runSpeed = 170.00000;
	}
}
