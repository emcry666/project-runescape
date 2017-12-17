package com.rs.game;

import com.rs.net.loginserver.LoginServerEncoder;
import com.rs.net.loginserver.Session;

public class LoginServer {

	public LoginServer(Session session) {
		this.session = session;
		World.addLoginSession(this);
	}

	private transient Session session;

	public Session getSession() {
		return session;
	}

	public LoginServerEncoder getEncoder() {
		return session.getLoginServerEncoder();
	}

}
