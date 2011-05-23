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
public class KernonsFaithfulServantKeloneTemplate extends RaidBossNPCTemplate {
	public static final int ID = 25263;

	@Inject
	protected KernonsFaithfulServantKeloneTemplate(NPCTemplateIDProvider provider, ItemTemplateIDProvider itemProvider) {
		super(provider.createID(ID));
		this.name = "Kernon's Faithful Servant Kelone";
		this.serverSideName = false;
		this.title = "Raid Boss";
		this.serverSideTitle = false;
		this.collisionRadius = 20.00;
		this.collisionHeight = 53.00;
		this.level = 67;
		this.sex = ActorSex.FEMALE;
		this.attackRange = 40;
		this.maxHP = 356634.034509353000000;
		this.maxMP = 1251.000000000000000;
		this.hpRegeneration = 113.825370829643000;
		this.mpRegeneration = 2.700000000000000;
		this.experience = 4534433;
		this.sp = 767699;
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
		attributes.physicalAttack = 1954.06059;
		attributes.magicalAttack = 645.97193;
		attributes.physicalDefense = 844.65753;
		attributes.magicalDefense = 412.06000;
		attributes.attackSpeed = 253;
		attributes.castSpeed = 333;
		attributes.criticalChance = 1;
		attributes.walkSpeed = 50.00000;
		attributes.runSpeed = 165.00000;
	}
}
