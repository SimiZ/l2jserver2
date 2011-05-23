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
public class BladeOtisTemplate extends MonsterNPCTemplate {
	public static final int ID = 18562;

	@Inject
	protected BladeOtisTemplate(NPCTemplateIDProvider provider, ItemTemplateIDProvider itemProvider) {
		super(provider.createID(ID));
		this.name = "Blade Otis";
		this.serverSideName = false;
		this.title = "Kaneus";
		this.serverSideTitle = false;
		this.collisionRadius = 14.00;
		this.collisionHeight = 35.10;
		this.level = 43;
		this.sex = ActorSex.MALE;
		this.attackRange = 40;
		this.maxHP = 132634.618317353000000;
		this.maxMP = 2787.000000000000000;
		this.hpRegeneration = 23.236178398400000;
		this.mpRegeneration = 11.550000000000000;
		this.experience = 784383;
		this.sp = 58093;
		this.aggressive = false;
		this.rightHand = itemProvider.createID(131);
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
		attributes.physicalAttack = 361.02734;
		attributes.magicalAttack = 246.53487;
		attributes.physicalDefense = 270.61467;
		attributes.magicalDefense = 297.03612;
		attributes.attackSpeed = 253;
		attributes.castSpeed = 333;
		attributes.criticalChance = 4;
		attributes.walkSpeed = 25.00000;
		attributes.runSpeed = 155.00000;
	}
}
