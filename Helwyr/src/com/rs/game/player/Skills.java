package com.rs.game.player;

import java.io.Serializable;

import com.rs.Settings;
import com.rs.cache.loaders.Configs;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.World;
import com.rs.game.events.Events;
import com.rs.game.events.ServerEventManager;
import com.rs.game.npc.pet.Pet;
import com.rs.game.player.content.revents.EventConstants;
import com.rs.game.player.content.revents.EventManager;
import com.rs.game.player.content.revents.EventType;
import com.rs.game.player.controlers.Wilderness;
import com.rs.mysql.impl.AdventureLog;
import com.rs.mysql.impl.AdventureLog.ALogType;
import com.rs.utils.Utils;

public class Skills implements Serializable {

	private static final long serialVersionUID = -7086829989489745985L;

	public static final double MAXIMUM_EXP = 200000000;

	public static final int ATTACK = 0, DEFENCE = 1, STRENGTH = 2,
			HITPOINTS = 3, RANGE = 4, PRAYER = 5, MAGIC = 6, COOKING = 7,
			WOODCUTTING = 8, FLETCHING = 9, FISHING = 10, FIREMAKING = 11,
			CRAFTING = 12, SMITHING = 13, MINING = 14, HERBLORE = 15,
			AGILITY = 16, THIEVING = 17, SLAYER = 18, FARMING = 19,
			RUNECRAFTING = 20, CONSTRUCTION = 22, HUNTER = 21, SUMMONING = 23,
			DUNGEONEERING = 24;

	public static final String[] SKILL_NAME = { "Attack", "Defence",
			"Strength", "Constitution", "Ranged", "Prayer", "Magic", "Cooking",
			"Woodcutting", "Fletching", "Fishing", "Firemaking", "Crafting",
			"Smithing", "Mining", "Herblore", "Agility", "Thieving", "Slayer",
			"Farming", "Runecrafting", "Hunter", "Construction", "Summoning",
			"Dungeoneering", "Divination" };

	private short level[];
	private double xp[];
	private double[] xpTracks;
	private boolean[] trackSkills;
	private byte[] trackSkillsIds;
	private boolean xpDisplay, xpPopup;
	private transient int currentCounter;
	private transient Player player;

	public void passLevels(Player p) {
		this.level = p.getSkills().level;
		this.xp = p.getSkills().xp;
	}

	public Skills() {
		level = new short[25];
		xp = new double[25];
		for (int i = 0; i < level.length; i++) {
			level[i] = 1;
			xp[i] = 0;
		}
		level[3] = 10;
		xp[3] = 1184;
		level[HERBLORE] = 3;
		xp[HERBLORE] = 250;
		xpPopup = true;
		xpTracks = new double[3];
		trackSkills = new boolean[3];
		trackSkillsIds = new byte[3];
		trackSkills[0] = true;
		for(int i = 0; i < trackSkillsIds.length; i++)
			trackSkillsIds[i] = 30;

	}

	public void reputeSkills() {
		for (int i = 0; i < level.length; i++) {
			level[i] = 1;
			xp[i] = 0;
			refresh(i);
		}
		level[3] = 10;
		xp[3] = 1184;
		level[HERBLORE] = 3;
		xp[HERBLORE] = 250;
	}

	public static int getTotalLevel(Player player) {
		int totallevel = 0;
		for(int i = 0; i <= 24; i++) {
			totallevel += player.getSkills().getLevelForXp(i);
		}
		return totallevel;
	}

	public int getTotalLevel() {
		int totallevel = 0;
		for(int i = 0; i <= 24; i++) {
			totallevel += getLevelForXp(i);
		}
		return totallevel;
	}

	public int getHighestSkillLevel() {
		int maxLevel = 1;
		for (int skill = 0; skill < level.length; skill++) {
			int level = getLevelForXp(skill);
			if (level > maxLevel)
				maxLevel = level;
		}
		return maxLevel;
	}

	public void sendXPDisplay() {
		for(int i = 0; i < trackSkills.length; i++) {
			player.getPackets().sendConfigByFile(10444 + i, trackSkills[i] ? 1 : 0);
			player.getPackets().sendConfigByFile(10440 + i, trackSkillsIds[i] + 1);
			refreshCounterXp(i);
		}
	}


	public void setupXPCounter() {
		player.getInterfaceManager().sendXPDisplay(1214);
	}

	public void refreshCurrentCounter() {
		player.getPackets().sendConfig(2478, currentCounter + 1);
	}

	public void setCurrentCounter(int counter) {
		if(counter != currentCounter) {
			currentCounter = counter;
			refreshCurrentCounter();
		}
	}

	public void switchTrackCounter() {
		trackSkills[currentCounter] = !trackSkills[currentCounter];
		player.getPackets().sendConfigByFile(10444 + currentCounter, trackSkills[currentCounter] ? 1 : 0);
	}

	public void resetCounterXP() {
		xpTracks[currentCounter] = 0;
		refreshCounterXp(currentCounter);
	}

	public void setCounterSkill(int skill) {
		xpTracks[currentCounter] = 0;
		trackSkillsIds[currentCounter] = (byte) skill;
		player.getPackets().sendConfigByFile(10440 + currentCounter, trackSkillsIds[currentCounter] + 1);
		refreshCounterXp(currentCounter);
	}

	public void refreshCounterXp(int counter) {
		player.getPackets().sendConfig(counter == 0 ? 1801 : 2474 + counter, (int) (xpTracks[counter]* 10));
	}

	public void handleSetupXPCounter(int componentId) {
		if(componentId == 18)
			player.getInterfaceManager().sendXPDisplay();
		else if(componentId >= 22 && componentId <= 24)
			setCurrentCounter(componentId - 22);
		else if (componentId == 27)
			switchTrackCounter();
		else if (componentId == 61)
			resetCounterXP();
		else if (componentId >= 31 && componentId <= 57) 
			if(componentId == 33)
				setCounterSkill(4);
			else if(componentId == 34)
				setCounterSkill(2);
			else if(componentId == 35)
				setCounterSkill(3);
			else if(componentId == 42)
				setCounterSkill(18);
			else if(componentId == 49)
				setCounterSkill(11);
			else
				setCounterSkill(componentId >= 56 ? componentId - 27  : componentId - 31);

	}

	public void sendInterfaces() {
		if(xpDisplay)
			player.getInterfaceManager().sendXPDisplay();
		if(xpPopup)
			player.getInterfaceManager().sendXPPopup();
	}

	public void switchXPDisplay() {
		xpDisplay = !xpDisplay;
		if(xpDisplay)
			player.getInterfaceManager().sendXPDisplay();
		else
			player.getInterfaceManager().closeXPDisplay();
	}

	public void switchXPPopup() {
		xpPopup = !xpPopup;
		player.getPackets().sendGameMessage("XP pop-ups are now "+(xpPopup ? "en" : "dis") + "abled.");
		if(xpPopup)
			player.getInterfaceManager().sendXPPopup();
		else
			player.getInterfaceManager().closeXPPopup();
	}

	public void restoreSkills() {
		for (int skill = 0; skill < level.length; skill++) {
			level[skill] = (short) getLevelForXp(skill);
			refresh(skill);
		}
	}

	public void setPlayer(Player player) {
		this.player = player;
		//temporary
		if(xpTracks == null) {
			xpPopup = true;
			xpTracks = new double[3];
			trackSkills = new boolean[3];
			trackSkillsIds = new byte[3];
			trackSkills[0] = true;
			for(int i = 0; i < trackSkillsIds.length; i++)
				trackSkillsIds[i] = 30;
		}
	}

	public short[] getLevels() {
		return level;
	}

	public double[] getXp() {
		return xp;
	}

	public int getLevel(int skill) {
		return level[skill];
	}

	public double getXp(int skill) {
		return xp[skill];
	}

	public boolean hasRequiriments(int... skills) {
		for(int i = 0; i < skills.length; i += 2) {
			int skillId = skills[i];
			if(skillId == CONSTRUCTION || skillId == FARMING)
				continue;
			int skillLevel = skills[i+1];
			if(getLevelForXp(skillId) < skillLevel)
				return false;

		}
		return true;
	}

	public long getTotalXP() {
		long totalxp = 0;
		for (double xp : getXp()) {
			totalxp += xp;
		}
		return totalxp;
	}

	public int getCombatLevel() {
		int attack = getLevelForXp(0);
		int defence = getLevelForXp(1);
		int strength = getLevelForXp(2);
		int hp = getLevelForXp(3);
		int prayer = getLevelForXp(5);
		int ranged = getLevelForXp(4);
		int magic = getLevelForXp(6);
		int combatLevel = 3;
		combatLevel = (int) ((defence + hp + Math.floor(prayer / 2)) * 0.25) + 1;
		double melee = (attack + strength) * 0.325;
		double ranger = Math.floor(ranged * 1.5) * 0.325;
		double mage = Math.floor(magic * 1.5) * 0.325;
		if (melee >= ranger && melee >= mage) {
			combatLevel += melee;
		} else if (ranger >= melee && ranger >= mage) {
			combatLevel += ranger;
		} else if (mage >= melee && mage >= ranger) {
			combatLevel += mage;
		}
		return combatLevel;
	}

	public void set(int skill, int newLevel) {
		level[skill] = (short) newLevel;
		refresh(skill);
	}

	public int drainLevel(int skill, int drain) {
		int drainLeft = drain - level[skill];
		if (drainLeft < 0) {
			drainLeft = 0;
		}
		level[skill] -= drain;
		if (level[skill] < 0) {
			level[skill] = 0;
		}
		refresh(skill);
		return drainLeft;
	}

	public int getCombatLevelWithSummoning() {
		return getCombatLevel() + getSummoningCombatLevel();
	}

	public int getSummoningCombatLevel() {
		return getLevelForXp(Skills.SUMMONING) / 8;
	}

	public void drainSummoning(int amt) {
		int level = getLevel(Skills.SUMMONING);
		if (level == 0)
			return;
		set(Skills.SUMMONING, amt > level ? 0 : level - amt);
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
		double exp = xp[skill];
		int points = 0;
		int output = 0;
		for (int lvl = 1; lvl <= (skill == DUNGEONEERING ? 120 : 99); lvl++) {
			points += Math.floor(lvl + 300.0
					* Math.pow(2.0, lvl / 7.0));
			output = (int) Math.floor(points / 4);
			if ((output - 1) >= exp) {
				return lvl;
			}
		}
		return skill == DUNGEONEERING ? 120 : 99;
	}

	public void init() {
		for (int skill = 0; skill < level.length; skill++)
			refresh(skill);
		sendXPDisplay();
	}

	public void refresh(int skill) {
		player.getPackets().sendSkillLevel(skill);
	}


	public int getCounterSkill(int skill) {
		switch(skill) {
		case ATTACK: return 0;
		case STRENGTH: return 1;
		case DEFENCE: return 4;
		case RANGE: return 2;
		case HITPOINTS: return 5;
		case PRAYER: return 6;
		case AGILITY: return 7;
		case HERBLORE: return 8;
		case THIEVING: return 9;
		case CRAFTING: return 10;
		case MINING: return 12;
		case SMITHING: return 13;
		case FISHING: return 14;
		case COOKING: return 15;
		case FIREMAKING: return 16;
		case WOODCUTTING: return 17;
		case SLAYER: return 19;
		case FARMING: return 20;
		case CONSTRUCTION: return 21;
		case HUNTER: return 22;
		case SUMMONING: return 23;
		case DUNGEONEERING: return 24;
		case MAGIC: return 3;
		case FLETCHING: return 18;
		case RUNECRAFTING: return 11;	
		default: return -1;
		}

	}

	public double getXpRecieve(int skill, int exp) {
		player.getControlerManager().trackXP(skill, (int) exp);
		int playersOnline = World.getPlayers().size();
		double reputeBonus = player.getReputeManager().getRates();
		boolean combatSkill = skill == SUMMONING || (skill >= ATTACK && skill <= MAGIC);

		if (player.isXpLocked())
			return 0;

		if (player.getAuraManager().usingWisdom())
			exp *= 1.025;

		if (player.hasVotedInLast12Hours())
			exp *= 1.05;

		if(skill < 99) {
			if(player.isUltimateDonator())
				exp *= 2.25;
			else if(player.isLegendDonator())
				exp *= 2.0;
			else if(player.isSuperDonator())
				exp *= 1.50;
			else if(player.isExtremeDonator())
				exp *= 1.75;
			else if(player.isDonator())
				exp *= 1.25;
		}

		if((Utils.currentTimeMillis() - player.getLastStarSprite()) > ((player.isADonator() ? 12 : 4) * 60 * 60 * 1000)) {
			if(skill == MINING)
				exp *= 1.150;
		}

		if(combatSkill) {
			if(hasStealingCreation(player))
				exp *= 1.250;
		}

		switch(skill) {

		case MINING:
			hasItem(14099);
			exp *= 1.750;
			break;
		case WOODCUTTING:
			hasItem(14100);
			exp *= 1.750;
			break;
		case FISHING:
			hasItem(14101);
			exp *= 1.750;
			break;

		}

		if(player.getControlerManager().getControler() instanceof Wilderness) {
			if(!combatSkill)
				exp *= 1.10;

			if(EventManager.eventStarted(EventType.EXPERIENCE_EVENT_WILDERNESS)) {
				if(!combatSkill)
					exp *= 1.25;
			}
		}

		if(EventManager.eventStarted(EventType.EXPERIENCE_EVENT)) {
			if(combatSkill)
				exp *= 1.25;
			else 
				exp *= 1.15;
		}

		if(player.getReputeManager().hasReputed()) {
			exp *= reputeBonus;
		}

		if(combatSkill)
			exp *= (Configs.COMBAT_XP_RATE);
		else 
			exp *= Configs.XP_RATE;

		return exp;
	}

	public double addXpLamp(int skill, double exp) {
		player.getControlerManager().trackXP(skill, (int) exp);
		if (player.isXpLocked())
			return 0;
		exp *= Configs.LAMP_XP_RATE;
		if(exp > 400000)
			exp /= 2.5;
		if(exp > 200000)
			exp /= 2;
		if(exp > 100000)
			exp /= 1.5;
		int oldLevel = getLevelForXp(skill);
		xp[skill] += exp;
		for (int i = 0; i < trackSkills.length; i++) {
			if (trackSkills[i]) {
				if (trackSkillsIds[i] == 30 || (trackSkillsIds[i] == 29 && (skill == Skills.ATTACK || skill == Skills.DEFENCE || skill == Skills.STRENGTH || skill == Skills.MAGIC || skill == Skills.RANGE || skill == Skills.HITPOINTS)) || trackSkillsIds[i] == getCounterSkill(skill)) {
					xpTracks[i] += exp;
					refreshCounterXp(i);
				}
			}
		}

		if (xp[skill] > MAXIMUM_EXP) 
			xp[skill] = MAXIMUM_EXP;

		int newLevel = getLevelForXp(skill);
		int levelDiff = newLevel - oldLevel;
		if (newLevel > oldLevel) {
			level[skill] += levelDiff;
			player.getDialogueManager().startDialogue("LevelUp", skill);
			if (skill == SUMMONING || (skill >= ATTACK && skill <= MAGIC)) {
				player.getAppearence().generateAppearenceData();
				if (skill == HITPOINTS)
					player.heal(levelDiff * 10);
				else if (skill == PRAYER)
					player.getPrayer().restorePrayer(levelDiff * 10);
			}
		}
		refresh(skill);
		return exp;
	}

	public double getXpReceived(int skill, double exp) {
		player.getControlerManager().trackXP(skill, (int) exp);
		int playersOnline = World.getPlayers().size();
		double reputeBonus = player.getReputeManager().getRates();
		boolean combatSkill = skill == SUMMONING || (skill >= ATTACK && skill <= MAGIC);

		if (player.isXpLocked())
			return 0;

		if(Configs.DOUBLE_XP) 
			exp *= 1;

		if (player.getAuraManager().usingWisdom())
			exp *= 1.025;

		if (player.hasVotedInLast12Hours())
			exp *= 1.05;

		if(player.hasIncreasedXP())
			exp *= 1.15;

		if(player.isUltimateDonator())
			exp *= 2.25;
		else if(player.isLegendDonator())
			exp *= 2.00;
		else if(player.isExtremeDonator())
			exp *= 1.75;
		else if(player.isSuperDonator())
			exp *= 1.50;
		else if(player.isDonator())
			exp *= 1.25;

		if((Utils.currentTimeMillis() - player.getLastStarSprite()) > ((player.isADonator() ? 12 : 4) * 60 * 60 * 1000)) {
			if(skill == MINING)
				exp *= 1.150;
		}

		if(combatSkill) {
			if(hasStealingCreation(player))
				exp *= 1.250;
		}


		switch(skill) {

		case MINING:
			hasItem(14099);
			exp *= 1.750;
			break;
		case WOODCUTTING:
			hasItem(14100);
			exp *= 1.750;
			break;
		case FISHING:
			hasItem(14101);
			exp *= 1.750;
			break;

		}

		if(player.getControlerManager().getControler() instanceof Wilderness) {
			if(!combatSkill)
				exp *= 1.10;

			if(EventManager.eventStarted(EventType.EXPERIENCE_EVENT_WILDERNESS)) {
				if(!combatSkill)
					exp *= 1.25;
			}
		}

		if(EventManager.eventStarted(EventType.EXPERIENCE_EVENT)) {
			if(combatSkill)
				exp *= 1.25;
			else 
				exp *= 1.15;
		}


		if(player.getReputeManager().hasReputed()) 
			exp *= reputeBonus;

		exp *= getXPRate(player, getLevelForXp(skill), combatSkill);

		return exp;

	}


	public void addXp(int skill, double exp) {
		player.getControlerManager().trackXP(skill, (int) exp);
		int playersOnline = World.getPlayers().size();
		double reputeBonus = player.getReputeManager().getRates();
		double pBonus = 1;
		boolean combatSkill = skill == SUMMONING || (skill >= ATTACK && skill <= MAGIC);

		if (player.isXpLocked())
			return;

		if(Configs.DOUBLE_XP) 
			exp *= 2;
		else if(Settings.isWeekend()) 
			exp *= 1.25;

		exp += addPetExperience(exp);

		if(ServerEventManager.eventStarted(Events.NO_XP_WASTE_EVENT))
			exp *= 1.50;

		for (int i = 0; i < playersOnline; i++) 
			pBonus += .006;
		if(pBonus < 1)
			pBonus = 1d;

		if(player.isAtHome()) {
			if(EventManager.eventStarted(EventType.EXPERIENCE_EVENT, EventConstants.VOICE_OF_SEREN))
				exp *= 1.5;
		}

		if (player.getAuraManager().usingWisdom())
			exp *= 1.025;

		if (player.hasVotedInLast12Hours())
			exp *= 1.05;

		if(player.hasIncreasedXP())
			exp *= 1.15;

		if(player.isUltimateDonator())
			exp *= 2.25;
		else if(player.isLegendDonator())
			exp *= 2.00;
		else if(player.isExtremeDonator())
			exp *= 1.75;
		else if(player.isSuperDonator())
			exp *= 1.50;
		else if(player.isDonator())
			exp *= 1.25;

		if((Utils.currentTimeMillis() - player.getLastStarSprite()) > ((player.isADonator() ? 12 : 4) * 60 * 60 * 1000)) {
			if(skill == MINING)
				exp *= 1.150;
		}

		if(combatSkill) {
			if(hasStealingCreation(player))
				exp *= 1.250;
		}



		switch(skill) {
		case MINING:
			if(hasItem(14099))
				exp *= 1.750;
			break;
		case WOODCUTTING:
			if(hasItem(14100))
				exp *= 1.750;
			break;
		case FISHING:
			if(hasItem(14101))
				exp *= 1.750;
			exp /= 1.25;
			break;
		case SLAYER:
			exp /= 1.25;
			break;
		case PRAYER:
			exp /= 1.20;
			break;
		case FARMING:
			exp *= 1.25;
			break;
		case FLETCHING:
			exp *= 2.13;
			break;
		case THIEVING:
			exp /= 1.35;
			break;
		case MAGIC:
			exp /= 1.75;
			break;
		case CRAFTING:
			exp /= 1.45;
			break;
		}

		if(player.getControlerManager().getControler() instanceof Wilderness) 
			exp *= 1.10;

		if(EventManager.eventStarted(EventType.EXPERIENCE_EVENT_WILDERNESS) && player.getControlerManager().getControler() instanceof Wilderness) 
			exp *= 1.25;

		if(EventManager.eventStarted(EventType.EXPERIENCE_EVENT)) {
			if(combatSkill)
				exp *= 1.25;
			else 
				exp *= 1.15;
		}

		if(player.getReputeManager().hasReputed()) 
			exp *= reputeBonus;

		exp *= getXPRate(player, getLevelForXp(skill), combatSkill) * pBonus;

		if(getLevel(skill) >= 99 && skill != DUNGEONEERING)
			exp /= 1.55;

		if(exp > 85000 && skill != DUNGEONEERING && !player.isAExtremeDonator())
			exp /= 1.5;
		if (exp > 125000 && skill != DUNGEONEERING && !player.isAExtremeDonator())
			exp /= 1.7;
		if (exp > 200000)
			exp /= 2.15;
		if (exp > 250000)
			exp /= 2.25;
		if (exp > 400000)
			exp /= 3.3;
		if (exp > 500000)
			exp /= 3.8;
		if (exp > 750000)
			exp /= 5;

		int oldLevel = getLevelForXp(skill);
		int oldXP = (int) xp[skill];
		xp[skill] += exp;
		for(int i = 0; i < trackSkills.length; i++) {
			if(trackSkills[i]) {
				if(trackSkillsIds[i] == 30
						|| (trackSkillsIds[i] == 29 
						&& (skill == Skills.ATTACK || skill == Skills.DEFENCE || skill == Skills.STRENGTH
						|| skill == Skills.MAGIC || skill == Skills.RANGE || skill == Skills.HITPOINTS))
						|| trackSkillsIds[i] == getCounterSkill(skill)) {
					xpTracks[i] += exp;
					refreshCounterXp(i);
				}
			}
		}

		if (xp[skill] > MAXIMUM_EXP) 
			xp[skill] = MAXIMUM_EXP;
		int oldCombatLevel = getCombatLevelWithSummoning();
		int newLevel = getLevelForXp(skill);
		int levelDiff = newLevel - oldLevel;
		if (newLevel > oldLevel) {
			level[skill] += levelDiff;
			player.getDialogueManager().startDialogue("LevelUp", skill);
			if (skill == SUMMONING || (skill >= ATTACK && skill <= MAGIC)) {
				player.getAppearence().generateAppearenceData();
				if (skill == HITPOINTS)
					player.heal(levelDiff * 10);
				else if (skill == PRAYER)
					player.getPrayer().restorePrayer(levelDiff * 10);
			}
		}
		sendNews(skill, newLevel > oldLevel, oldCombatLevel, oldXP);
		refresh(skill);
	}
	

	public double addPetExperience(double exp) {
		Pet pet = player.getPet();
		if(pet == null)
			return 0;
		double petb = 1.00;
		for (int i = 0; i < pet.getDetails().getLevel(); i++) 
			petb += 0.025;
		exp *= petb;

		if(player.getPetManager().isALegendaryPet()) 
			player.getPet().addExperience(exp);
		else 
			player.getPet().addExperience(exp / 2.5);
		return exp;
	}

	public static double getXPRate(Player player, int level, boolean combatSkill) {	
		int toLevel = 60;
		return (1.28) * ((combatSkill ? (level < toLevel ? 4d : 3d) : (level < toLevel ? 2.5d : 2d))) * ((double) level / (combatSkill ? (level < toLevel ? 1.5d : 4d) : (level < toLevel ? 2d : 4d)) + (combatSkill ? 2d : 1.25d));
	}

	public void sendNews(int skill, boolean levelUP, int combatLevelBefore, double oldXp) {
		boolean combatSkill = skill == SUMMONING || (skill >= ATTACK && skill <= MAGIC);
		if(player.getRights() > 1)
			return;
		if (!levelUP) {
			if(xp[skill] > 50000000) { //50m
				if(getLevelForXp(oldXp, 120) != 120 && getLevelForXp(xp[skill], 120) == 120) 
					World.sendNews(player, player.getDisplayName() + " has achieved true skill mastery in the " + Skills.SKILL_NAME[skill] + " skill.", World.WORLD_NEWS);
				else{
					int next = (int) (xp[skill] / 50000000);
					int xpachievement = next * 50000000;
					if (oldXp < xpachievement && xp[skill] >= xpachievement) 
						World.sendNews(player, player.getDisplayName() + " has achieved "+(next*50)+"m " + Skills.SKILL_NAME[skill] + " xp.", World.SERVER_NEWS);
				}
			}
		} else {
			if (combatSkill && combatLevelBefore != 138 && getCombatLevelWithSummoning() == 138) {
				World.sendNews(player, player.getDisplayName() + " has achieved level 138 combat.", World.SERVER_NEWS);
				return;
			}
			int level = getLevelForXp(skill);
			millestone: if (level % 10 == 0 || level == 99) {
				for (int i = 0; i < Skills.SKILL_NAME.length; i++) {
					if (player.getSkills().getLevelForXp(i) < level)
						break millestone;
				}
				World.sendNews(player, player.getDisplayName() + " has just achieved at least level " + level + " in all skills!", level == 99 ? World.WORLD_NEWS : World.FRIEND_NEWS);
				return;
			}
			if (level == 99) {
				World.sendNews(player, player.getDisplayName() + " has achieved " + level + " " + Skills.SKILL_NAME[skill] + ".", World.SERVER_NEWS);
				new AdventureLog(player, ALogType.LEVEL_UP, Skills.SKILL_NAME[skill], level);
			} else if (level == 120) {
				World.sendNews(player, player.getDisplayName() + " has achieved true skill mastery in the " + Skills.SKILL_NAME[skill] + " skill.", World.WORLD_NEWS);
				new AdventureLog(player, ALogType.LEVEL_UP, Skills.SKILL_NAME[skill], level);
			}
		}
	}

	public static final boolean hasStealingCreation(Player player) {
		int helmId = player.getEquipment().getHatId();
		int chestId = player.getEquipment().getChestId();
		int legsId = player.getEquipment().getLegsId();
		int weaponId = player.getEquipment().getWeaponId();
		if (helmId == -1 || chestId == -1 || legsId == -1 || weaponId == -1)
			return false;
		return ItemDefinitions.getItemDefinitions(helmId).getName()
				.contains("class (")
				&& ItemDefinitions.getItemDefinitions(chestId).getName()
				.contains("class (")
				&& ItemDefinitions.getItemDefinitions(legsId).getName()
				.contains("class (")
				&& ItemDefinitions.getItemDefinitions(weaponId).getName()
				.contains("class (");
	}

	public void addSkillXpRefresh(int skill, double xp) {
		this.xp[skill] += xp;
		level[skill] = (short) getLevelForXp(skill);
	}

	public void resetSkillNoRefresh(int skill) {
		xp[skill] = 0;
		level[skill] = 1;
	}

	public void setXp(int skill, double exp) {
		xp[skill] = exp;
		refresh(skill);
	}

	public boolean hasItem(int id) {
		return player.getInventory().containsItem(id);
	}

}
