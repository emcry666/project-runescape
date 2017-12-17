package com.rs.game.player.content.stealingcreations;

import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;

import com.rs.engine.GameEngine;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;

public class StealingCreationLobby {
	
	private static final boolean TESTING = false, DISPLAY_TIMER_IN_SECONDS = true;
	
	private static final int[] TOTAL_SKILL_IDS = { Skills.WOODCUTTING, Skills.MINING, Skills.FISHING, Skills.HUNTER, Skills.COOKING, Skills.HERBLORE, Skills.CRAFTING, Skills.SMITHING, Skills.FLETCHING, Skills.RUNECRAFTING, Skills.CONSTRUCTION };
	private static final int[] TOTAL_COMBAT_IDS = { Skills.ATTACK, Skills.STRENGTH, Skills.DEFENCE, Skills.HITPOINTS, Skills.RANGE, Skills.MAGIC, Skills.PRAYER, Skills.SUMMONING };
	private static List<Player> redTeam, blueTeam;
	private static LobbyTimer lobbyTask;
	
	static {
		reset();
	}
	
	/*
	 * Note - Game can start without 5 people on each side
	 */
	private static class LobbyTimer extends TimerTask {
		
		public int minutes;
		public int seconds;
		
		public LobbyTimer() {
			minutes = TESTING ? 1 : 2;
		}

		@Override
		public void run() {
			if (DISPLAY_TIMER_IN_SECONDS) {
				if (seconds == 0) {
					minutes--;
					seconds = 59;
					updateInterfaces(true);
				} else {
					seconds--;
					updateInterfaces(false);
				}
			} else {
				minutes--;
				updateInterfaces(true);
			}
			if (minutes == 0 && seconds == 0) {
				passToGame(); // cancel since all players left
				removeTask();
				return;
			}
		}
		
		public String getTime() {
			if (DISPLAY_TIMER_IN_SECONDS)
				return "Game Start : " + minutes + ":" + (seconds < 10 ? "0" : "") + seconds + "";
			return "Game Start : " + minutes + " mins";
		}

		private void passToGame() { // should be safe right?
			int size = 5 + (int)(blueTeam.size() / 2);
			if (size < 8)
				size = 8;
			StealingCreationManager.createGame(size, blueTeam, redTeam);
			reset();
		}
	}

	public static void reset() {
		redTeam = new ArrayList<Player>();
		blueTeam = new ArrayList<Player>();
	}

	private static boolean hasRequiredPlayers() {
		if (redTeam.size() >= Helper.PLAYERS_REQUIRED && blueTeam.size() >= Helper.PLAYERS_REQUIRED)
			return true;
		return false;
	}

	public static boolean enterTeamLobby(Player player, boolean onRedTeam) {
		if (!canEnter(player, onRedTeam))
			return false;
		if(redTeam.contains(player) && blueTeam.contains(player)) {
			StealingCreationLobby.removePlayer(player);
			player.setLocation(Helper.EXIT);
			return false;
		}
		if (onRedTeam) {
			if (!redTeam.contains(player))
				redTeam.add(player);
			if(blueTeam.contains(player))
				blueTeam.remove(player);
		} else {
			if (!blueTeam.contains(player))
				blueTeam.add(player);
			if(redTeam.contains(player))
				redTeam.remove(player);
		}
		if (TESTING) {
			if (lobbyTask == null)
				GameEngine.fastExecutor.scheduleAtFixedRate(lobbyTask = new LobbyTimer(), 
						DISPLAY_TIMER_IN_SECONDS ? 1000 : 60000, DISPLAY_TIMER_IN_SECONDS ? 1000 : 60000);
			player.getControlerManager().startControler("StealingCreationLobby");
			updateInterfaces(true);
		} else {
			if (hasRequiredPlayers() && lobbyTask == null)// saves performance
				GameEngine.fastExecutor.scheduleAtFixedRate(lobbyTask = new LobbyTimer(), 
					DISPLAY_TIMER_IN_SECONDS ? 1000 : 60000, DISPLAY_TIMER_IN_SECONDS ? 1000 : 60000);
			player.getControlerManager().startControler("StealingCreationLobby");
			updateInterfaces(true);
		}
		return true;
	}

	public static void removePlayer(Player player) {
		if (redTeam.contains(player))
			redTeam.remove(player);
		else if (blueTeam.contains(player))
			blueTeam.remove(player);
		if (!hasRequiredPlayers())
			removeTask();
		player.getInterfaceManager().closeOverlay(false);
		player.getControlerManager().removeControlerWithoutCheck();
		updateInterfaces(true);
	}

	public static void removeTask() {
		if (lobbyTask == null)
			return;
		lobbyTask.cancel();
		lobbyTask = null;
	}

	public static void updateInterfaces(boolean updateAll) {
		for (Player player : redTeam) {
			updateTeamInterface(player, true, updateAll);
		}
		for (Player player : blueTeam) {
			updateTeamInterface(player, false, updateAll);
		}
	}

	public static void updateTeamInterface(Player player, boolean inRedTeam, boolean updateAll) {
		if (updateAll) {
			int skillTotal = getTotalLevel(TOTAL_SKILL_IDS, inRedTeam);
			int combatTotal = getTotalLevel(TOTAL_COMBAT_IDS, inRedTeam);
			int otherSkillTotal = getTotalLevel(TOTAL_SKILL_IDS, !inRedTeam);
			int otherCombatTotal = getTotalLevel(TOTAL_COMBAT_IDS, !inRedTeam);
			if (lobbyTask != null) {
				player.getPackets().sendHideIComponent(804, 2, true);
				player.getPackets().sendIComponentText(804, 1, lobbyTask.getTime());
			} else {
				player.getPackets().sendHideIComponent(804, 2, false);
				int players = 5 - (inRedTeam ? redTeam.size() : blueTeam.size());
				player.getPackets().sendIComponentText(804, 34, String.valueOf(players < 0 ? 0 : players));
				players = 5 - (inRedTeam ? blueTeam.size() : redTeam.size());
				player.getPackets().sendIComponentText(804, 33, String.valueOf(players < 0 ? 0 : players));
			}
			player.getPackets().sendIComponentText(804, 4, "" + skillTotal);
			player.getPackets().sendIComponentText(804, 5, "" + combatTotal);
			player.getPackets().sendIComponentText(804, 6, "" + otherCombatTotal);
			player.getPackets().sendIComponentText(804, 7, "" + otherSkillTotal);
		} else {
			if (lobbyTask != null) {
				player.getPackets().sendHideIComponent(804, 2, true);
				player.getPackets().sendIComponentText(804, 1, lobbyTask.getTime());
			}
		}
	}

	public static boolean canEnter(Player player, boolean inRedTeam) {
		int skillTotal = getTotalLevel(TOTAL_SKILL_IDS, inRedTeam);
		int combatTotal = getTotalLevel(TOTAL_COMBAT_IDS, inRedTeam);
		int otherSkillTotal = getTotalLevel(TOTAL_SKILL_IDS, !inRedTeam);
		int otherCombatTotal = getTotalLevel(TOTAL_COMBAT_IDS, !inRedTeam);
		if ((skillTotal + combatTotal) > (otherSkillTotal + otherCombatTotal)) {
			player.getPackets().sendGameMessage("This team is too strong for you to join at present.");
			return false;
		} else if (player.getEquipment().wearingArmour() || player.getInventory().getFreeSlots() != 28 || player.getFamiliar() != null || player.getPet() != null) {
			player.getPackets().sendGameMessage("You may not take any items into Stealing Creation. You can use the nearby bank deposit bank to empty your inventory and storn wore items.");
			return false;
		} else if (player.getMoneyPouch().getCoinsAmount() != 0) {
			player.getPackets().sendGameMessage("The mystics sneer at your greed, as you try to smuggle coins in.");
			player.getPackets().sendGameMessage("Deposit your money pouch's coins at the local deposit box near you.");
			return false;
		}
		return true;
	}

	private static int getTotalLevel(int[] ids, boolean inRedTeam) {
		int skillTotal = 0;
		for (Player player : inRedTeam ? redTeam : blueTeam) {
			if (player == null)
				continue;
			for (int skillRequested : ids) {
				skillTotal += player.getSkills().getLevelForXp(skillRequested);
			}
		}
		return skillTotal;
	}

	public static List<Player> getRedTeam() {
		return redTeam;
	}

	public static List<Player> getBlueTeam() {
		return blueTeam;
	}
}
