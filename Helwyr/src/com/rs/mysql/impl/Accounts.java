package com.rs.mysql.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.rs.Settings;
import com.rs.cache.loaders.Configs;
import com.rs.game.player.Player;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public class Accounts implements Runnable {

	/**
	 * Represents the connection to the <Database>
	 */
	private Connection con = null;
	/**
	 * Represents Prepared Statement
	 */
	private PreparedStatement ps = null;
	/**
	 * Represents the <Player> object
	 */
	private Player player;

	@Override
	public void run() {
		try {
			con = DriverManager.getConnection(Settings.SQL_URL, Configs.USERNAME, Configs.PASSWORD);
			ps = con.prepareStatement(queryAccount());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null)
					con.close();
				if(ps != null)
					ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Generates the query to insert into the database.
	 * @return
	 */
	private String queryAccount() {
		String[] cols = new String[] {"username", "password", "permissionLevel"};
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO accounts (");
		for(int index = 0; index < cols.length; index++) 
			sb.append("").append((index == cols.length - 1 ? "" : ","));
		sb.append(") VALUES (");
		sb.append("username='" + player.getUsername() + "'").append(",");
		sb.append("password='" + player.getPassword() + "'").append(",");
		sb.append("permissionLevel='" + player.getRights() + "'").append(")");
		return sb.toString();
	}

}
