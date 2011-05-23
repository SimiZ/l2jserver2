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
public class LostWarden8Template extends RaidBossNPCTemplate {
	public static final int ID = 25709;

	@Inject
	protected LostWarden8Template(NPCTemplateIDProvider provider, ItemTemplateIDProvider itemProvider) {
		super(provider.createID(ID));
		this.name = "Lost Warden";
		this.serverSideName = false;
		this.title = "";
		this.serverSideTitle = false;
		this.collisionRadius = 51.60;
		this.collisionHeight = 57.00;
		this.level = 83;
		this.sex = ActorSex.MALE;
		this.attackRange = 40;
		this.maxHP = 618854.527530717000000;
		this.maxMP = 1777.400000000000000;
		this.hpRegeneration = 237.841799981663000;
		this.mpRegeneration = 20.000000000000000;
		this.experience = 1455513;
		this.sp = 201155;
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
		attributes.physicalAttack = 10874.37207;
		attributes.magicalAttack = 2209.19928;
		attributes.physicalDefense = 1061.58432;
		attributes.magicalDefense = 517.88000;
		attributes.attackSpeed = 253;
		attributes.castSpeed = 333;
		attributes.criticalChance = 4;
		attributes.walkSpeed = 60.00000;
		attributes.runSpeed = 200.00000;
	}
}
