package com.rs.mysql.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.rs.cache.loaders.Configs;
import com.rs.game.player.Player;
import com.rs.game.player.Profession;
import com.rs.game.player.Skills;
import com.rs.utils.Utils;

public class Highscores implements Runnable {

	private Player player;

	public Highscores(Player player) {
		this.player = player;
	}

	private Connection connection = null;	
	private PreparedStatement ps = null;

	@Override
	public void run() {//might need to be in seperate try / catch 
		try {
			String username = Utils.formatPlayerNameForDisplay(player.getUsername());
			/**
			 * Deletes User From Database before insertion.
			 */
			connection = DriverManager.getConnection("jdbc:mysql://"+Configs.HOST+":3306/"+Configs.DATABASE, Configs.USERNAME, Configs.PASSWORD);
			ps = connection.prepareStatement("DELETE FROM hs_users WHERE username='" + username + "'");
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			/**
			 * Re inserts their new statistics
			 */
			ps = connection.prepareStatement(generateQuery(player));
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null)
					connection.close();
				connection = null;
				if (ps != null)
					ps.close();
				ps = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return;
	}

	public String generateQuery(Player player) {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String username = Utils.formatPlayerNameForDisplay(player.getUsername());
		int rights = player.getRights();
		boolean ironman = player.isIronman();
		int prestige = player.getReputeManager().getReputedTimes();
		long overall =  (player.getSkills().getTotalXP() + player.getProfession().getTotalXP());

		StringBuilder sb = new StringBuilder();

		sb.append("INSERT INTO hs_users ");
		sb.append("(username, rights, prestige, world, overall_xp, ");

		for(int i = 0; i < 26; i++) {
			sb.append(Skills.SKILL_NAME[i] + "_xp").append((i == 25 ? ")" : ","));
		}
		
		sb.append(" VALUES (");
		sb.append("'" + username + "'").append(",");
		sb.append("'" + rights + "'").append(",");
		sb.append("'" + prestige + "'").append(",");
		sb.append("'1'").append(",");
		sb.append("'" + overall + "'").append(",");

		for (int i = 0; i < 26; i++) {
			int exp = (int) (i == 25 ? player.getProfession().getLevel(Profession.DIVINATION) : player.getSkills().getXp(i));
			sb.append("'" + exp + "'").append((i == 25 ? ")" : ","));
		}
		
		
		return sb.toString();
	}

}
