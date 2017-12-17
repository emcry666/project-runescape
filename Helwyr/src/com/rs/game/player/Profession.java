package com.rs.game.player;

import java.io.Serializable;

import com.rs.Settings;
import com.rs.cache.loaders.Configs;
import com.rs.game.World;
import com.rs.game.npc.pet.Pet;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public class Profession implements Serializable {

	private static final long serialVersionUID = 3829457239394808788L;
	
	public static final int DIVINATION = 0, ARCHEOLOGY = 1, INVENTION = 3;
	private double MAXIMUM_EXP = 200000000;
	private Player player;
	private short plevel[];
	private double pxp[];

	
	public Profession(Player player) {
		this.player = player;
		plevel = new short[6];
		pxp = new double[6];
		for(int i = 0; i < plevel.length; i++) {
			plevel[i] = 1;
			pxp[i] = 0;
		}
	}
	
	public double addExperience(int prof, double experience) {
		if(player.isXpLocked())
			return 0d;
		double oldXp = getXPForLevel(prof);
		int oldLevel = getLevelForXp(prof);
		experience *= getBonuses(getLevel(prof), experience);
		if(pxp[prof] > MAXIMUM_EXP )
			return pxp[prof] = MAXIMUM_EXP;
		pxp[prof] += experience;
		int newLevel = getLevelForXp(prof);
		if(newLevel > oldLevel)
			sendProfNews(prof, newLevel > oldLevel, oldXp);
		return experience;
	}
	
	public double getBonuses(int level, double experience) {
		/**
		 * Double Experience Configs
		 */
		if(Configs.DOUBLE_XP)
			experience *= 2;
		else if(Settings.isWeekend())
			experience *= 1.25;
		/**
		 * Pet Experience 
		 */
		experience *= addPetExperience(experience);
		/*
		 * Experience Formula
		 */
		experience *= getXPRate(player, level, false);
		return experience;
	}
	

	public double addPetExperience(double exp) {
		Pet pet = player.getPet();
		if(pet == null)
			return 0;
		double petb = 1.0;
		for (int i = 0; i < pet.getDetails().getLevel(); i++) 
			petb += 0.05;
		exp *= petb;
		
		if(player.getPetManager().isALegendaryPet()) {
			if(Settings.HOSTED)
				player.getPet().addExperience((exp / (Pet.MAX_LEVEL / 2)));
			else 
				player.getPet().addExperience(exp);
		}
		return exp;
	}
	
	public static double getXPRate(Player player, int level, boolean combatSkill) {	
		int toLevel = 65;
		return (1.10) * ((combatSkill ? (level < toLevel ? 4d : 3d) : (level < toLevel ? 2.5d : 2d))) * ((double) level / (combatSkill ? (level < toLevel ? 1.5d : 4d) : (level < toLevel ? 2d : 4d)) + (combatSkill ? 2d : 1.25d));
	}
	
	public void sendProfNews(int skill, boolean levelUP, double oldXp) {
		if(player.getRights() > 1)
			return;
		if (!levelUP) {
			if(pxp[skill] > 50000000) { //50m
				if(getLevelForXp(oldXp, 120) != 120 && getLevelForXp(pxp[skill], 120) == 120) 
					World.sendNews(player, player.getDisplayName() + " has achieved true skill mastery in the " + Skills.SKILL_NAME[skill] + " skill.", World.WORLD_NEWS);
				else{
					int next = (int) (pxp[skill] / 50000000);
					int xpachievement = next * 50000000;
					if (oldXp < xpachievement && pxp[skill] >= xpachievement) 
						World.sendNews(player, player.getDisplayName() + " has achieved "+(next*50)+"m " + Skills.SKILL_NAME[skill] + " xp.", World.SERVER_NEWS);
				}
			}
		} else {
			int level = getLevelForXp(skill);
			millestone: if (level % 10 == 0 || level == 99) {
				for (int i = 0; i < Skills.SKILL_NAME.length; i++) {
					if (player.getSkills().getLevelForXp(i) < level)
						break millestone;
				}
				World.sendNews(player, player.getDisplayName() + " has just achieved at least level " + level + " in all skills!", level == 99 ? World.WORLD_NEWS : World.FRIEND_NEWS);
				return;
			}
			if (level == 99)
				World.sendNews(player, player.getDisplayName() + " has achieved " + level + " " + Skills.SKILL_NAME[skill] + ".", World.SERVER_NEWS);
			else if (level == 120)
				World.sendNews(player, player.getDisplayName() + " has achieved true skill mastery in the " + Skills.SKILL_NAME[skill] + " skill.", World.WORLD_NEWS);
		}
	}
	
	public static int getXPForLevel(int level) {
		int points = 0;
		int output = 0;
		for (int lvl = 1; lvl <= level; lvl++) {
			points += Math.floor(lvl + 300.0
					* Math.pow(2.0, lvl / 7.0));
			if (lvl >= level) {
				return output;
			}
			output = (int) Math.floor(points / 4);
		}
		return 0;
	}

	public static int getLevelForXp(double exp, int max) {
		int points = 0;
		int output = 0;
		for (int lvl = 1; lvl <= max; lvl++) {
			points += Math.floor(lvl + 300.0 * Math.pow(2.0, lvl / 7.0));
			output = (int) Math.floor(points / 4);
			if ((output - 1) >= exp) {
				return lvl;
			}
		}
		return max;
	}

	public int getLevelForXp(int skill) {
		double exp = pxp[skill];
		int points = 0;
		int output = 0;
		for (int lvl = 1; lvl <= 99; lvl++) {
			points += Math.floor(lvl + 300.0
					* Math.pow(2.0, lvl / 7.0));
			output = (int) Math.floor(points / 4);
			if ((output - 1) >= exp) {
				return lvl;
			}
		}
		return 99;
	}
	
	public long getTotalXP() {
		long totalxp = 0;
		for (double xp : getXp()) {
			totalxp += xp;
		}
		return totalxp;
	}
	
	public short getLevel(int proff) {
		return plevel[proff];
	}

	public void setLevel(short level[]) {
		this.plevel = level;
	}

	public double getExperience(int prof) {
		return pxp[prof];
	}
	

	public double[] getXp() {
		return pxp;
	}

	public double getXp(int skill) {
		return pxp[skill];
	}
	
	public int setExperience(int prof, int exp) {
		return (int) (pxp[prof] = exp);
	}

}
