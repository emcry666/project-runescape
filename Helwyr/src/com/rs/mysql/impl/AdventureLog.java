package com.rs.mysql.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.rs.game.player.Player;
import com.rs.mysql.GenerateQuery;

/**
 * Created by Brandon on 5/14/2016.
 */
public class AdventureLog extends GenerateQuery {
	
	public enum ALogType {
		TASK, BOSS, RARE_DROP, LEVEL_UP
	}

	/**
	 * Represents the Current Timestamp the vote was received
	 */
	String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	
    /**
     * Represents the Player object
     */
	private Player player;
	/**
	 * Represents the description of the adventure's log
	 */
	private String description;
	/**
	 * Represents the type of achievement it is
	 */
	private ALogType type;
	/**
	 * Represents the amount of items the <Player> received of the <Item>
	 */
	private int amount = 1;
    
    public AdventureLog(Player player, ALogType type, String description) {
    	this.player = player;
    	this.type = type;
    	this.description = description;
    	appendQuery();
        super.write();
    }
    
    public AdventureLog(Player player, ALogType type, String description, int amount) {
    	this.player = player;
    	this.type = type;
    	this.description = description;
    	this.amount = amount;
    	appendQuery();
    	super.write();
    }
    
    /**
     * Appends the syntax to insert into the Database.
     * @return
     */
    
    private String appendQuery() {
        sb.append("INSERT INTO adv_logs (");
        sb.append("username, amount, type, description, date_added");
        sb.append(") VALUES (");
        sb.append("'" + player.getDisplayName() + "'").append(",");
        sb.append("'" + amount + "'").append(",");
        sb.append("'" + getType(type) + "'").append(",");
        sb.append("'" + description + "'").append(",");
        sb.append("'" + timeStamp  + "'").append(")");
        return sb.toString();
    }
    
    public int getType(ALogType type) {
    	switch (type) {
    	case RARE_DROP:
			return 0;
		case BOSS:
			return 1;
		case LEVEL_UP:
			return 2;
		case TASK:
			return 3;
		default:
			break;
    	}
    	return -1;
    }


}
