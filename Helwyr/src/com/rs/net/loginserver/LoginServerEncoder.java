package com.rs.net.loginserver;

import com.rs.Settings;
import com.rs.io.OutputStream;

public class LoginServerEncoder extends Encoder {

	public LoginServerEncoder(Session session) {
		super(session);
	}

	public void sendHandshake() {
		final OutputStream stream = new OutputStream();
		stream.writeSmart(1);
		stream.writeShort(Settings.WORLD_ID);
		stream.writeShort(1);
		session.write(stream);

	}

	public void sendSystemUpdate(boolean restart, int delay) {
		final OutputStream stream = new OutputStream();
		stream.writeSmart(5);
		if (restart) 
			stream.writeByte(1);
		 else 
			stream.writeByte(0);
		stream.writeShort(delay);
		session.write(stream);
	}

}
