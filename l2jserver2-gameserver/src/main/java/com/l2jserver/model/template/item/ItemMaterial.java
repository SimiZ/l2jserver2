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
package com.l2jserver.model.template.item;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ItemMaterialType")
public enum ItemMaterial {
	COTTON, WOOD, PAPER, FISH, ORIHARUKON, HORN, ADAMANTAITE, CHRYSOLITE, MITHRIL, COBWEB, RUNE_XP, CLOTH, SCALE_OF_DRAGON, BONE, GOLD, LEATHER, FINE_STEEL, SILVER, DYESTUFF, CRYSTAL, RUNE_REMOVE_PENALTY, STEEL, BRONZE, RUNE_SP, LIQUID, BLOOD_STEEL, DAMASCUS;
}