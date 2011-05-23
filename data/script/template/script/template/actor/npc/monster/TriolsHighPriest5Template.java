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
public class TriolsHighPriest5Template extends MonsterNPCTemplate {
	public static final int ID = 22171;

	@Inject
	protected TriolsHighPriest5Template(NPCTemplateIDProvider provider, ItemTemplateIDProvider itemProvider) {
		super(provider.createID(ID));
		this.name = "Triol's High Priest";
		this.serverSideName = false;
		this.title = "";
		this.serverSideTitle = false;
		this.collisionRadius = 8.00;
		this.collisionHeight = 19.10;
		this.level = 78;
		this.sex = ActorSex.MALE;
		this.attackRange = 40;
		this.maxHP = 3163.043215200000000;
		this.maxMP = 1955.340000000000000;
		this.hpRegeneration = 9.027000000000000;
		this.mpRegeneration = 3.182400000000000;
		this.experience = 62272;
		this.sp = 7299;
		this.aggressive = false;
		this.rightHand = itemProvider.createID(8208);
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
		attributes.physicalAttack = 1076.93138;
		attributes.magicalAttack = 781.26136;
		attributes.physicalDefense = 410.87895;
		attributes.magicalDefense = 300.66338;
		attributes.attackSpeed = 253;
		attributes.castSpeed = 333;
		attributes.criticalChance = 1;
		attributes.walkSpeed = 30.00000;
		attributes.runSpeed = 180.00000;
	}
}
