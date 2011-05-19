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
package com.l2jserver.game.net.packet.server;

import org.jboss.netty.buffer.ChannelBuffer;

import com.l2jserver.game.net.Lineage2Connection;
import com.l2jserver.game.net.packet.AbstractServerPacket;
import com.l2jserver.game.net.packet.server.CharacterCreateFailPacket.Reason;
import com.l2jserver.model.world.L2Character;
import com.l2jserver.model.world.actor.ActorExperience;
import com.l2jserver.util.BufferUtils;

/**
 * This packet notifies the client that the chosen character has been
 * successfully selected.
 * 
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 * @see Reason
 */
public class CharacterSelectedPacket extends AbstractServerPacket {
	/**
	 * The packet OPCODE
	 */
	public static final int OPCODE = 0x0b;

	/**
	 * The selected character
	 */
	private final L2Character character;

	public CharacterSelectedPacket(L2Character character) {
		super(OPCODE);
		this.character = character;
	}

	@Override
	public void write(Lineage2Connection conn, ChannelBuffer buffer) {
		BufferUtils.writeString(buffer, character.getName());
		buffer.writeInt(character.getID().getID());
		BufferUtils.writeString(buffer, "It works!"); // title
		buffer.writeInt(conn.getSession().getPlayKey1());
		buffer.writeInt((character.getClanID() != null ? character.getClanID()
				.getID() : 0));
		buffer.writeInt(0x00); // ??
		buffer.writeInt(character.getSex().option);
		buffer.writeInt(character.getRace().id);
		buffer.writeInt(character.getCharacterClass().id);
		buffer.writeInt(0x01); // active ??
		buffer.writeInt(character.getPoint().getX());
		buffer.writeInt(character.getPoint().getY());
		buffer.writeInt(character.getPoint().getZ());

		buffer.writeDouble(20); // cur hp
		buffer.writeDouble(20); // cur mp
		buffer.writeInt(0); // sp
		buffer.writeLong(ActorExperience.LEVEL_1.experience);
		buffer.writeInt(ActorExperience.LEVEL_1.level);
		buffer.writeInt(0); // karma
		buffer.writeInt(0); // pk
		buffer.writeInt(character.getAttributes().getIntelligence());
		buffer.writeInt(character.getAttributes().getStrength());
		buffer.writeInt(character.getAttributes().getConcentration());
		buffer.writeInt(character.getAttributes().getMentality());
		buffer.writeInt(character.getAttributes().getDexterity());
		buffer.writeInt(character.getAttributes().getWitness());

		buffer.writeInt(0); // game time
		buffer.writeInt(0x00); // unk

		buffer.writeInt(character.getCharacterClass().id);

		buffer.writeInt(0x00);// unk
		buffer.writeInt(0x00);// unk
		buffer.writeInt(0x00);// unk
		buffer.writeInt(0x00);// unk

		buffer.writeBytes(new byte[64]); // unk
		buffer.writeInt(0x00);// unk
	}
}