package com.rs.game.player.content.clans;

import java.io.Serializable;

import com.rs.cache.loaders.Configs;
import com.rs.game.World;
import com.rs.game.player.Player;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public class ClanKnowledge implements Serializable {

	private static final long serialVersionUID = -6305182178905469100L;
	private int EXPERIENCE_CAP = 1000000000;
	private boolean isXPLocked;
	public int maxLevel = 25;
	private int level;
	private double xp;
	private Clan clan;
	
	/**
	 * Creates the constructor for <Clan>
	 * @param clan
	 */
	public ClanKnowledge(Clan clan) {
		this.clan = clan;
		level = 1;
	}

	/**
	 * Adds experience to @Players <Clan>
	 * @param player
	 * @param exp
	 */
	public void addExperience(Player player, double exp) {
		ClansManager manager = player.getClanManager();
		if(manager == null)
			return;
		if(isXPLocked())
			return;
		if(Configs.CLAN_DOUBLE_XP)
			exp *= 2;
		if(player.getEquipment().getCapeId() == 20708) 
			exp *= 1.025;
		if(player.getEquipment().getWeaponId() == 20709) 
			exp *= 1.010;
		int oldLevel = getLevelForXp();
		xp += exp;
		if(xp > EXPERIENCE_CAP)
			xp = EXPERIENCE_CAP;
		int newLevel = getLevelForXp();
		if (newLevel > oldLevel) 
			sendNews(manager, (newLevel == maxLevel ? true : false));
		return;
	}
	
	/**
	 * Sends news for <Clans> achievements
	 * @param manager
	 * @param maxLevel
	 */
	public void sendNews(ClansManager manager, boolean maxLevel) {
		if(manager == null)
			return;
		manager.sendGlobalMessage("<col=0840C4>" + clan.getClanName() + " has just achieved level " + getLevel() + ".");
		if(maxLevel)
			World.sendWorldMessage("<img=7><col=ffffff><shad=0840C4>" + clan.getClanName() + " has just achieved level " + getLevel() + ".");
	}

	/**
	 * Algorithm for <Clans> level
	 * @return
	 */
	public int getLevelForXp() {
		double exp = xp;
		int points = 0;
		int output = 0;
		for (int lvl = 1; lvl <= maxLevel; lvl++) {
			points += Math.floor(lvl + 300.0
					* Math.pow(2.0, lvl / 7.0));
			output = (int) Math.floor(points / 4);
			if ((output - 1) >= exp) 
				return lvl;
		}
		return maxLevel;
	}

	/**
	 * Returns the <Clan> object
	 * @return
	 */
	public Clan getClan() {
		return clan;
	}

	public void setClan(Clan clan) {
		this.clan = clan;
	}

	public boolean isXPLocked() {
		return isXPLocked;
	}

	public void setXPLocked(boolean isXPLocked) {
		this.isXPLocked = isXPLocked;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getXp() {
		return xp;
	}

	public void setXp(double xp) {
		this.xp = xp;
	}

}
