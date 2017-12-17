package com.rs.game.player.content.wildrejuve;

import com.rs.game.player.Player;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public class WildRejuvenation {

	public static final int ATTACK = 0, DEFENCE = 1, STRENGTH = 2,
			HITPOINTS = 3, RANGE = 4, PRAYER = 5, MAGIC = 6, COOKING = 7,
			WOODCUTTING = 8, FISHING = 10, FIREMAKING = 11,
			CRAFTING = 12, SMITHING = 13, MINING = 14,
			AGILITY = 16, THIEVING = 17,
			RUNECRAFTING = 20, HUNTER = 21, SUMMONING = 23;
	private int additionalExperience;
	private Player player;

	public WildRejuvenation() {
		
	}


	public String getSkillName(int skill) {
		switch(skill) {
		case ATTACK:
		case RANGE:
		case MAGIC:
		case PRAYER:
		case SUMMONING:
		case HITPOINTS:
			return "Combat";
		case FISHING:
			return "Fishing";
		case COOKING:
			return "Cooking";
		case FIREMAKING:
			return "Firemaking";
		case AGILITY:
			return "Agility";
		case WOODCUTTING:
			return "Woodcutting";
		case SMITHING:
			return "Smithing";
		case MINING:
			return "Mining";
		case HUNTER:
			return "Hunter";
		}
		return "";
	}

	public int getBonusForSkill(int skill) {
		int bonusXp = 0;
		switch(skill) {
		case ATTACK:
		case RANGE:
		case MAGIC:
		case PRAYER:
		case SUMMONING:
		case HITPOINTS:
			return -1;
		case FISHING:
			return -1;
		case COOKING:
			return -1;
		case FIREMAKING:
			return -1;
		case AGILITY:
			return -1;
		case WOODCUTTING:
			return -1;
		case SMITHING:
			return -1;
		case MINING:
			return -1;
		case HUNTER:
			return -1;
		}
		return bonusXp;
	}

	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}

	public int getAdditionalExperience() {
		return additionalExperience;
	}

	public void setAdditionalExperience(int additionalExperience) {
		this.additionalExperience = additionalExperience;
	}



}
