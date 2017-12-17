package com.rs.mysql.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.rs.game.player.Player;
import com.rs.mysql.GenerateQuery;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public class Voting extends GenerateQuery {

	/**
	 * Represents the Current Timestamp the vote was received
	 */
	String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	
	/**
	 * Represents the <Player> object that is executing the update.
	 */
	private Player player;

	public Voting(Player player) {
		this.player = player;
		appendVote();
		super.write();
	}

	/**
	 * Creates and appends the sql syntax to update to database.
	 * @return
	 */
	public String appendVote() {
		sb.append("INSERT INTO mv_votes (");
		sb.append("user, callbackdate");
		sb.append(") VALUES (");
		sb.append("'" + player.getDisplayName() + "'").append(",");
		sb.append("'" + timeStamp  + "'").append(")");
		return sb.toString();
	}


}
