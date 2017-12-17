package com.rs.net.loginserver;

import com.rs.io.InputStream;
import com.rs.net.Session;
import com.rs.net.decoders.Decoder;


public class LoginServerDecoder extends Decoder {

	public LoginServerDecoder(Session session) {
		super(session);
	}

	@Override
	public void decode(InputStream stream) {
		int packetId = stream.readUnsignedByte();
		switch (packetId) {

		}
	}

}
