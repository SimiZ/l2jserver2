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
public class CannibalisticStakatoChief4Template extends RaidBossNPCTemplate {
	public static final int ID = 25670;

	@Inject
	protected CannibalisticStakatoChief4Template(NPCTemplateIDProvider provider, ItemTemplateIDProvider itemProvider) {
		super(provider.createID(ID));
		this.name = "Cannibalistic Stakato Chief";
		this.serverSideName = false;
		this.title = "Shadow of Violence";
		this.serverSideTitle = false;
		this.collisionRadius = 34.00;
		this.collisionHeight = 40.00;
		this.level = 82;
		this.sex = ActorSex.MALE;
		this.attackRange = 40;
		this.maxHP = 373966.790456118000000;
		this.maxMP = 1812.000000000000000;
		this.hpRegeneration = 18.630557254141000;
		this.mpRegeneration = 3.000000000000000;
		this.experience = 4292368;
		this.sp = 580689;
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
		attributes.physicalAttack = 3043.21984;
		attributes.magicalAttack = 1220.95193;
		attributes.physicalDefense = 1086.15843;
		attributes.magicalDefense = 529.86561;
		attributes.attackSpeed = 253;
		attributes.castSpeed = 333;
		attributes.criticalChance = 4;
		attributes.walkSpeed = 40.00000;
		attributes.runSpeed = 200.00000;
	}
}
