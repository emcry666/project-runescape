package com.rs.net.decoders;

import com.rs.Settings;
import com.rs.cache.loaders.Configs;
import com.rs.io.InputStream;
import com.rs.net.Session;
import com.rs.utils.Logger;

public final class ClientPacketsDecoder extends Decoder {

	public ClientPacketsDecoder(Session connection) {
		super(connection);
	}

	@Override
	public final void decode(InputStream stream) {
		int packetId = stream.readUnsignedByte();
		session.setDecoder(-1);
		switch (packetId) {
			case 14:
				decodeLogin(stream);
				break;
			case 1:
				decodeLoginServer(stream);
				break;
			case 15:
				decodeGrab(stream);
				break;
			case 21:
				session.setDecoder(2);
				break;
			default:
				if (Settings.DEBUG) {
					Logger.log(this, "PacketId " + packetId);
				}
				session.getChannel().disconnect();
				break;
		}
	}

	private final void decodeLogin(InputStream stream) {
		if (stream.getRemaining() != 0) {
			session.getChannel().disconnect();
			return;
		}
		session.setDecoder(2);
		session.setEncoder(1);
		session.getLoginPackets().sendStartUpPacket();
	}

	private final void decodeLoginServer(InputStream stream) {
		if (stream.getRemaining() != 2) {
			session.getChannel().disconnect();
			return;
		}
		int loginServerKey = stream.readUnsignedShort();
		if (loginServerKey != 13) {
			System.out.println("Disconnecting Login Server: Incorrect Login Server Key -> " + loginServerKey);
			session.getChannel().disconnect();
			return;
		}
		session.setDecoder(4);
	}
	
	private final void decodeGrab(InputStream stream) {
		int size = stream.readUnsignedByte();
		if (stream.getRemaining() < size) {
			session.getChannel().disconnect();
			return;
		}
		session.setEncoder(0);
			if (stream.readInt() != Configs.SUB_REVISION
					|| stream.readInt() != Configs.REVISION) {
				session.setDecoder(-1);
				session.getGrabPackets().sendOutdatedClientPacket();
				System.out.println("WRong revisions");
				return;
		}
		if (!stream.readString().equals(Settings.GRAB_SERVER_TOKEN)) {
			session.getChannel().disconnect();
			System.out.println("WRong server token.");
			return;
		}
		session.setDecoder(1);
		session.getGrabPackets().sendStartUpPacket();
	}

}
