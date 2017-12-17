package com.rs.game.player.content;

import com.rs.game.World;
import com.rs.game.player.Player;

/**
 * 
 * @author Frostbite
 *
 */

public class AchievmentMessages {
	
	/**
	 * Lost Items
	 */
	
	public int[] lostItems = {};
	
	public static void checkLostItems(Player player) {
		
	}
	
	
	/**
	 * Announcements for Capes
	 */
	
	public static void compCape(Player player) {
		World.sendWorldMessage("[<col=DE830B>Achievements</col>] <col=DE830B>"  + player.getUsername() + "</col><col=DE830B> has just achieved Completionist Cape!", false);
		player.getPackets().sendGameMessage("<col=ff0000>Congratulations, You have just achieved Completionist Cape!");
	}
	
	public static void trimmedCompCape(Player player) {
		World.sendWorldMessage("[<col=DE830B>Achievements</col>] <col=DE830B>"  + player.getUsername() + "</col><col=DE830B> has just achieved Trimmed Completionist Cape!", false);
		player.getPackets().sendGameMessage("<col=ff0000>Congratulations, You have just achieved Trimmed Completionist Cape!");
	}
	
	public static void maxCape(Player player) {
		World.sendWorldMessage("[<col=DE830B>Achievements</col>] <col=DE830B>"  + player.getUsername() + "</col><col=DE830B> has just achieved Max Cape!", false);
		player.getPackets().sendGameMessage("<col=ff0000>Congratulations, You have just achieved Max Cape!");
	}
	
	/**
	 * Untrimmed Completionist Cape Announcements
	 */
	
	public static void slayerTaskU(Player player) {
		World.sendWorldMessage("[<col=DE830B>Achievements</col>] <col=DE830B>"  + player.getUsername() + "</col><col=DE830B> has just completed 25 Slayer Task!", false);
		player.getPackets().sendGameMessage("<col=ff0000>Congratulations, You have just completed 50 Slayer Task!");
	}
	
	public static void nomadsRequiem(Player player) {
		World.sendWorldMessage("[<col=DE830B>Achievements</col>] <col=DE830B>"  + player.getUsername() + "</col><col=DE830B> has just completed Nomads Requiem!", false);
		player.getPackets().sendGameMessage("<col=ff0000>Congratulations, You have just completed Nomads Requiem!");
	}
	
	public static void killedQBD(Player player) {
		World.sendWorldMessage("[<col=DE830B>Achievements</col>] <col=DE830B>"  + player.getUsername() + "</col><col=DE830B> has just slain the Queen Black Dragon!", false);
		player.getPackets().sendGameMessage("<col=ff0000>Congratulations, You have just slain the Queen Black Dragon!");
	}
	
	public static void fightCavesCompleted(Player player) {
		World.sendWorldMessage("[<col=DE830B>Achievements</col>] <col=DE830B>"  + player.getUsername() + "</col><col=DE830B> has just completed Fight Caves!", false);
		player.getPackets().sendGameMessage("<col=ff0000>Congratulations, You have just completed Fight Caves!");
	}
	
	public static void obtainedAdze(Player player) {
		World.sendWorldMessage("[<col=DE830B>Achievements</col>] <col=DE830B>"  + player.getUsername() + "</col><col=DE830B> has just obtained the Inferno Adze!", false);
		player.getPackets().sendGameMessage("<col=ff0000>Congratulations, You have just obtained the Inferno Adze!");
		player.getInventory().addItem(13661, 1);
	}
	
	public static void dominionTowerKills(Player player) {
		World.sendWorldMessage("[<col=DE830B>Achievements</col>] <col=DE830B>"  + player.getUsername() + "</col><col=DE830B> has just finished 100 Dominion Tower Kills!", false);
		player.getPackets().sendGameMessage("<col=ff0000>Congratulations, You have just completed 100 Dominion Tower Kills!");
	}
	
	public static void masteredAllSkills(Player player) {
		World.sendWorldMessage("[<col=DE830B>Achievements</col>] <col=DE830B>"  + player.getUsername() + "</col><col=DE830B> has just achieved All 99s in every skill and 120 Dungeoneering!", false);
		player.getPackets().sendGameMessage("<col=ff0000>Congratulations, You have just achieved all 99s in every skill and 120 Dungeoneering!");
	}
	
	public static void corpBeastKilled(Player player) {
		World.sendWorldMessage("[<col=DE830B>Achievements</col>] <col=DE830B>"  + player.getUsername() + "</col><col=DE830B> has just slain Corporeal Beast!", false);
		player.getPackets().sendGameMessage("<col=ff0000>Congratulations, You have just slain Corporeal Beast!");
	}
	
	public static void gnomeAgilityCompleted(Player player) {
		World.sendWorldMessage("[<col=DE830B>Achievements</col>] <col=DE830B>"  + player.getUsername() + "</col><col=DE830B> has just completed 125 Advanced Gnome Agility Course laps!", false);
		player.getPackets().sendGameMessage("<col=ff0000>Congratulations, You have just compelted 250 Gnome Agility laps!");
	}
	
	public static void barbarianAgilityCompleted(Player player) {
		World.sendWorldMessage("[<col=DE830B>Achievements</col>] <col=DE830B>"  + player.getUsername() + "</col><col=DE830B> has just completed 125 Advanced Barbarian Agility Course laps!", false);
		player.getPackets().sendGameMessage("<col=ff0000>Congratulations, You have just compelted 250 advanced Barbarian Agility Course laps!");
	}
	
	public static void godWarsKillsCompleted(Player player) {
		World.sendWorldMessage("[<col=DE830B>Achievements</col>] <col=DE830B>"  + player.getUsername() + "</col><col=DE830B> has just slain all of the God Wars Dungeon Bosses 5 times!", false);
		player.getPackets().sendGameMessage("<col=ff0000>Congratulations, You have just slain every God Wars Dungeon boss 5 times!");
	}
	
	public static void completedFightKiln(Player player) {
		World.sendWorldMessage("[<col=DE830B>Achievements</col>] <col=DE830B>"  + player.getUsername() + "</col><col=DE830B> has just completed Fight Kiln!", false);
		player.getPackets().sendGameMessage("<col=ff0000>Congratulatons, You have just completed Fight Kiln!");
	}
	
	/**
	 * Trimmed Completionist Cape
	 */
	
	public static void oresMined(Player player) {
		World.sendWorldMessage("[<col=DE830B>Achievements</col>] <col=DE830B>"  + player.getUsername() + "</col><col=DE830B> has just mined (2500/2500) Gold Ore!", false);
		player.getPackets().sendGameMessage("<col=ff0000>Congratulations, You have just mined (2500/2500) Gold Ore!");
	}
	
	public static void fishedCaught(Player player) {
		World.sendWorldMessage("[<col=DE830B>Achievements</col>] <col=DE830B>"  + player.getUsername() + "</col><col=DE830B> has just caught (1500/1500) Rocktail!", false);
		player.getPackets().sendGameMessage("<col=ff0000>Congratulations, You have just caught (1500/1500) Rocktail!");
	}
	
	public static void logsCut(Player player) {
		World.sendWorldMessage("[<col=DE830B>Achievements</col>] <col=DE830B>"  + player.getUsername() + "</col><col=DE830B> has just achieved (3000/3000) Yew Logs Cut!", false);
		player.getPackets().sendGameMessage("<col=ff0000>Congratulations, You have just chopped 3000 Yew Logs!");
	}
	
	public static void slayerTaskCompletedT(Player player) {
		World.sendWorldMessage("[<col=DE830B>Achievements</col>] <col=DE830B>"  + player.getUsername() + "</col><col=DE830B> has just completed 75 Slayer Task!", false);
		player.getPackets().sendGameMessage("<col=ff0000>Congratulations, You have just completed 75 Slayer Task!");
	}
	
	public static void magicLogsBurned(Player player) {
		World.sendWorldMessage("[<col=DE830B>Achievements</col>] <col=DE830B>"  + player.getUsername() + "</col><col=DE830B> has just burned (5000/5000) Magic Logs!", false);
		player.getPackets().sendGameMessage("<col=ff0000>Congratulations, You have just burned (5000/5000) Magic Logs!");
	}
	
	public AchievmentMessages() {
		
	}

}

/**
 * <col=ff0000> RED
 * <col=DE830B> ORANGE
 */



/**
 * Completionist Cape
 * 
 * 25 Slayer Task Completed
 * Completed Nomads Requiem
 * Killed Queen Black Dragon
 * Won Fight Caves
 * Obtained inferno Adze
 * Dominion Tower Kills (100/100)
 * All 99's and 120 Dungeoneering
 * Slayed Corporeal Beast
 * 125 Laps Around Gnome Agility Course (Advanced)
 * 125 Laps around Barbarian Agility Course (Advanced)
 * 5 Kills of each Godwars Dungeon Boss
 * Completed FightKiln
 */


/**
 * Trimmed Completionist Cape
 * 
 * Gold Ore Mined (2500/2500)
 * Rocktails Fished (1500/1500)
 * Yews Cut (3000/3000)
 * 75 Slayer Task Completed
 * Burn (5000/5000) Magic Logs
 * 
 */
