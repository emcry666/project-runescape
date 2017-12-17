package com.rs.game.player;

import com.rs.cache.loaders.Configs;


/**
 * 
 * @author Frostbite
 *
 *<contact@Frostbitersps@gmail.com><skype@Frostbitersps>
 */

public class AchievementLogger {

	public static String FORMAT = "[<col=DE8C21>" + Configs.SERVER_NAME + " Achievement</col>] - <col=DE8C21>You have ";
	public static String WORLD_FORMAT = "[<col=DE8C21>" + Configs.SERVER_NAME + " Achievement</col>] - <col=DE8C21>";
	public static String COLOR = "<col=DE8C21>";


	/**
		21484 - Runecrafter robe
		21485 - Runecrafter hat
		21486 - Runecrafter skirt
		21487 - Runecrafter boots

		24206 - Wicked robe top
		24207 - Wicked robe top
		24208 - Wicked legs
		24209 - Wicked legs
		24210 - Wicked cape
		24211 - Wicked cape
		22332 - Wicked hood
	 */
	
	/**
	 * @handles slayer
	 * @param player
	 */

	public static void handleSlayer(Player player) {
		int[] slayerArray = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100, 105, 110, 115, 120, 125};
		if(player.getSlayerTaskCompleted() <= 50) {
			player.setSlayerTaskCompleted(player.getSlayerTaskCompleted() + 1);
			if(player.achievementAnnouncement == true) {
				for(int x = 0; x < slayerArray.length; x++) {
					if(slayerArray[x] == player.getGoldOreMined()) {
						player.getPackets().sendGameMessage(FORMAT + "completed (" + player.getSlayerTaskCompleted() + "/50) Slayer Tasks!");
					}
				}
			}
		}
		if(player.getSlayerTaskCompleted() > 50) {
			player.setSlayerTaskCompleted(player.getSlayerTaskCompleted() + 1);
			if(player.achievementAnnouncement == true) {
				for(int x = 0; x < slayerArray.length; x++) {
					if(slayerArray[x] == player.getSlayerTaskCompleted()) {
						player.getPackets().sendGameMessage(FORMAT + "completed (" + player.getSlayerTaskCompleted() + "/125) Slayer Tasks!");
					}
				}
			}
		}
		if(player.achievementAnnouncement == false){
			player.setSlayerTaskCompleted(player.getSlayerTaskCompleted() + 1);
		}
	}
	
	public static void handleSmithing(Player player) {
		int[] runeplatesMade = {25, 50, 75, 85, 100, 125, 150, 175, 185, 200, 225, 250, 275, 285, 300};
		if(player.getRunePlatesMade() <= 30) {
			player.setRunePlatesMade(player.getRunePlatesMade() + 1);
			if(player.achievementAnnouncement == true) {
				for(int x = 0; x < runeplatesMade.length; x++) {
					if(runeplatesMade[x] == player.getRunePlatesMade()) {
						player.getPackets().sendGameMessage(FORMAT + "completed (" + player.getRunePlatesMade() + "/30) Penguins hunted!");
					}
				}
			}
		}
		if(player.getRunePlatesMade() > 30) {
			player.setRunePlatesMade(player.getRunePlatesMade() + 1);
			if(player.achievementAnnouncement == true) {
				for(int x = 0; x < runeplatesMade.length; x++) {
					if(runeplatesMade[x] == player.getRunePlatesMade()) {
						player.getPackets().sendGameMessage(FORMAT + "completed (" + player.getRunePlatesMade() + "/100) Penguins hunted!");
					}
				}
			}
		}
		if(player.achievementAnnouncement == false){
			player.setRunePlatesMade(player.getRunePlatesMade() + 1);
		}
	}

	/**
	 * @handles mining
	 * @param player
	 */

	public static void handleMining(Player player) {
		int[] miningArray = { 300, 400, 600, 900, 1200, 1500, 1800, 2100, 2400, 2700, 3000, 3300, 3550, 3800, 4100, 4400, 4700, 4900};
		if(player.getGoldOreMined() <= 3700) {
			player.setCompletedOresMined(player.getGoldOreMined() + 1);
			if(player.achievementAnnouncement == true) {
				for(int x = 0; x < miningArray.length; x++) {
					if(miningArray[x] == player.getGoldOreMined()) {
						player.getPackets().sendGameMessage(FORMAT + "mined (" + player.getGoldOreMined() + "/3700) Gold Ore!");
					}
				}
			}
		}
		if(player.getGoldOreMined() > 3700) {
			player.setCompletedOresMined(player.getGoldOreMined() + 1);
			if(player.achievementAnnouncement == true) {
				for(int x = 0; x < miningArray.length; x++) {
					if(miningArray[x] == player.getGoldOreMined()) {
						player.getPackets().sendGameMessage(FORMAT + "mined (" + player.getGoldOreMined() + "/4900) Gold Ore!");
					}
				}
			}
		}
		if(player.achievementAnnouncement == false){
			player.setCompletedOresMined(player.getGoldOreMined() + 1);
		}
	}
	
	/**
	 * @farming
	 */
	public static void handleFarming(Player player) {
		int[] farmingArray = { 300, 400, 600, 900, 1200, 1500, 1800, 2100, 2400, 2700, 3000, 3300, 3550, 3800, 4100, 4400, 4500};
		if(player.getLividFarmBunched() <= 2700) {
			player.setLividFarmBunched(player.getLividFarmBunched() + 1);
			if(player.achievementAnnouncement == true) {
				for(int x = 0; x < farmingArray.length; x++) {
					if(farmingArray[x] == player.getLividFarmBunched()) {
						player.getPackets().sendGameMessage(FORMAT + "bunched (" + player.getLividFarmBunched() + "/2700) plants!");
					}
				}
			}
		}
		if(player.getLividFarmBunched() > 3700) {
			player.setLividFarmBunched(player.getGoldOreMined() + 1);
			if(player.achievementAnnouncement == true) {
				for(int x = 0; x < farmingArray.length; x++) {
					if(farmingArray[x] == player.getLividFarmBunched()) {
						player.getPackets().sendGameMessage(FORMAT + "bunched (" + player.getLividFarmBunched() + "/4500) plants!");
					}
				}
			}
		}
		if(player.achievementAnnouncement == false){
			player.setLividFarmBunched(player.getLividFarmBunched() + 1);
		}
	}

	/**
	 * @handles firemaking
	 * @param player
	 */

	public static void handleFiremaking(Player player) {
		int[] firemakingArray = { 300, 600, 900, 1200, 1500, 1800, 2100, 2400, 2700, 3000, 3300, 3550, 3800, 4100, 4400, 4700, 5000};
		if(player.getMagicLogsBurned() <= 3550) {
			player.setMagicLogsBurned(player.getMagicLogsBurned() + 1);
			if(player.achievementAnnouncement == true) {
				for(int x = 0; x < firemakingArray.length; x++) {
					if(firemakingArray[x] == player.getMagicLogsBurned()) {
						sendMessage(player, FORMAT + "burned (" + player.getMagicLogsBurned() + "/3550) Magic Logs!");
					}
				}
			}
		}
		if(player.getMagicLogsBurned() > 3550) {
			player.setMagicLogsBurned(player.getMagicLogsBurned() + 1);
			if(player.achievementAnnouncement == true) {
				for(int x = 0; x < firemakingArray.length; x++) {
					if(firemakingArray[x] == player.getMagicLogsBurned()) {
						sendMessage(player, FORMAT + "burned (" + player.getMagicLogsBurned() + "/5000) Magic Logs!");
					}
				}
			}
		}
		if(player.achievementAnnouncement == false) {
			player.setMagicLogsBurned(player.getMagicLogsBurned() + 1);
		}


	}

	/**
	 * @handles woodcutting
	 * @param player
	 */

	public static void handleWoodcutting(Player player) {
		int[] woodcutArray = { 300, 600, 900, 1200, 1500, 1800, 2100, 2400, 2700, 3000, 3300, 3550, 3800, 4150 };
		if(player.getCompletedYewsCut() <= 3000) {
			player.setCompletedYewsCut(player.getCompletedYewsCut() + 1);
			if(player.achievementAnnouncement == true) {
				for(int x = 0; x < woodcutArray.length; x++) {
					if(woodcutArray[x] == player.getCompletedYewsCut()) {
						sendMessage(player, FORMAT + "successfully chopped (" + player.getCompletedYewsCut() + "/3000) Yew Logs!");
					}
				}
			}
		}
		if(player.getCompletedYewsCut() > 3000) {
			player.setCompletedYewsCut(player.getCompletedYewsCut() + 1);
			if(player.achievementAnnouncement == true) {
				for(int x = 0; x < woodcutArray.length; x++) {
					if(woodcutArray[x] == player.getCompletedYewsCut()) {
						sendMessage(player, FORMAT + "successfully chopped (" + player.getCompletedYewsCut() + "/4150) Yew Logs!");
					}
				}
			}
		}
		if(player.achievementAnnouncement == false) {
			player.setCompletedYewsCut(player.getCompletedYewsCut() + 1);
		}


	}

	/**
	 * @handles fishing
	 * @param player
	 */

	public static void handleFishing(Player player) {
		int[] fishingArray = { 300, 600, 900, 1200, 1500, 1800, 2100, 2500, 2700, 3000, 3300, 3500, 3750 };
		if(player.getCompletedRockTailsFished() <= 2500){
			player.setCompletedRockTailsFished(player.getCompletedRockTailsFished() + 1);
			if(player.achievementAnnouncement == true) {
				for(int x = 0; x < fishingArray.length; x++) {
					if(fishingArray[x] == player.getCompletedRockTailsFished()) {
						sendMessage(player, FORMAT + "successfully caught (" + player.getCompletedRockTailsFished() + "/2500) Rocktails!");
					}
				}
			}
		}
		if(player.getCompletedRockTailsFished() > 2500){
			player.setCompletedRockTailsFished(player.getCompletedRockTailsFished() + 1);
			if(player.achievementAnnouncement == true) {
				for(int x = 0; x < fishingArray.length; x++) {
					if(fishingArray[x] == player.getCompletedRockTailsFished()) {
						sendMessage(player, FORMAT + "successfully caught (" + player.getCompletedRockTailsFished() + "/3750) Rocktails!");
					}
				}
			}
		}
		if(player.achievementAnnouncement == false) {
			player.setCompletedRockTailsFished(player.getCompletedRockTailsFished() + 1);
		}


	}

	/**
	 * @handles barbarianAgility
	 * @param player
	 */

	public static void handleBarbarianAgility(Player player) {
		int[] barbAgilityArray = { 25, 50, 75, 100, 125, 150, 175, 200, 225, 250, 275, 300, 325, 350 };
		if(player.getBarbarianAdvancedLaps() <= 250) {
			player.setBarbarianAdvancedlaps(player.getBarbarianAdvancedLaps() + 1);
			if(player.achievementAnnouncement == true) {
				for(int x = 0; x < barbAgilityArray.length; x++) {
					if(barbAgilityArray[x] == player.getBarbarianAdvancedLaps()) {
						sendMessage(player, FORMAT + "completed (" + player.getBarbarianAdvancedLaps() + "/250) Advanced Barbarian Outpost Agility Course Laps!");
					}
				}
			}
		}
		if(player.getBarbarianAdvancedLaps() > 250) {
			player.setBarbarianAdvancedlaps(player.getBarbarianAdvancedLaps() + 1);
			if(player.achievementAnnouncement == true) {
				for(int x = 0; x < barbAgilityArray.length; x++) {
					if(barbAgilityArray[x] == player.getBarbarianAdvancedLaps()) {
						sendMessage(player, FORMAT + "completed (" + player.getBarbarianAdvancedLaps() + "/350) Advanced Barbarian Outpost Agility Course Laps!");
					}
				}
			}
		}
		if(player.achievementAnnouncement == false) {
			player.setBarbarianAdvancedlaps(player.getBarbarianAdvancedLaps() + 1);
		}
	}

	/**
	 * @handles GnomeAgility
	 * @param player
	 */

	public static void handleGnomeAgility(Player player) {
		int[] gnomeAgilityArray = { 25, 50, 75, 100, 125, 150, 175, 200, 225, 250, 275, 300, 325, 350 };
		if(player.getGnomeAdvancedLaps() <= 250) {
			player.setGnomeAdvancedLaps(player.getGnomeAdvancedLaps() + 1);
			if(player.achievementAnnouncement == true) {
				for(int x = 0; x < gnomeAgilityArray.length; x++) {
					if(gnomeAgilityArray[x] == player.getGnomeAdvancedLaps()) {
						sendMessage(player, FORMAT + "completed (" + player.getGnomeAdvancedLaps() + "/250) Advanced Gnome Agility Course Laps!");
					}
				}
			}
		}
		if(player.getGnomeAdvancedLaps() > 250) {
			player.setGnomeAdvancedLaps(player.getGnomeAdvancedLaps() + 1);
			if(player.achievementAnnouncement == true) {
				for(int x = 0; x < gnomeAgilityArray.length; x++) {
					if(gnomeAgilityArray[x] == player.getGnomeAdvancedLaps()) {
						sendMessage(player, FORMAT + "completed (" + player.getGnomeAdvancedLaps() + "/350) Advanced Gnome Agility Course Laps!");
					}
				}
			}
		}
		if(player.achievementAnnouncement == false) {
			player.setGnomeAdvancedLaps(player.getGnomeAdvancedLaps() + 1);
		}

	}

	/**
	 * @handles Cooking
	 * @param player
	 */

	public static void handleCooking(Player player) {
		int[] cookingArray = { 300, 600, 900, 1200, 1500, 1800, 2100, 2500, 2700, 3000, 3250, 3500, 3750, 4150 };
		if(player.getCookedRocktailSuccessfully() <= 3250) {
			player.setCookedRocktailSuccessfully(player.getCookedRocktailSuccessfully() + 1);
			if(player.achievementAnnouncement == true) {
				for(int x = 0; x < cookingArray.length; x++) {
					if(cookingArray[x] == player.getCookedRocktailSuccessfully()) {
						sendMessage(player, FORMAT + "successfully cooked (" + player.getCookedRocktailSuccessfully() + "/3250) Rocktails!");
					}
				}
			}
		}
		if(player.getCookedRocktailSuccessfully() > 3250) {
			player.setCookedRocktailSuccessfully(player.getCookedRocktailSuccessfully() + 1);
			if(player.achievementAnnouncement == true) {
				for(int x = 0; x < cookingArray.length; x++) {
					if(cookingArray[x] == player.getCookedRocktailSuccessfully()) {
						sendMessage(player, FORMAT + "successfully cooked (" + player.getCookedRocktailSuccessfully() + "/4150) Rocktails!");
					}
				}
			}
		}
		if(player.achievementAnnouncement == false) {
			player.setCookedRocktailSuccessfully(player.getCookedRocktailSuccessfully() + 1);
		}
	}

	/**
	 * @handles thieving
	 * @param player
	 * 
	 * 
	 */

	public static void handleThieving(Player player) {
		int[] thievingArray = { 300, 600, 900, 1200, 1500, 1800, 2100, 2500, 2700, 3000, 3250 };
		if(player.getCompletedSuccessfulThievs() <= 1800) {
			player.setCompletedSuccessfulThievs(player.getCompletedSuccessfulThievs() + 1);
			if(player.achievementAnnouncement == true) {
				for(int x = 0; x < thievingArray.length; x++) {
					if(thievingArray[x] == player.getCompletedSuccessfulThievs()) {
						sendMessage(player, FORMAT + "successfully pickpocketed (" + player.getCompletedSuccessfulThievs() + "/1800) Npcs!");
					}
				}
			}
		}
		if(player.getCompletedSuccessfulThievs() > 1800) {
			player.setCompletedSuccessfulThievs(player.getCompletedSuccessfulThievs() + 1);
			if(player.achievementAnnouncement == true) {
				for(int x = 0; x < thievingArray.length; x++) {
					if(thievingArray[x] == player.getCompletedSuccessfulThievs()) {
						sendMessage(player, FORMAT + "successfully pickpocketed (" + player.getCompletedSuccessfulThievs() + "/3250) Npcs!");
					}
				}
			}
		}
		if(player.achievementAnnouncement == false) {
			player.setCompletedSuccessfulThievs(player.getCompletedSuccessfulThievs() + 1);
		}
	}

	public static void sendMessage(Player player, String m) {
		player.getPackets().sendGameMessage(m);
	}
}
