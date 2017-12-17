package com.rs.game.player.content;

import com.rs.game.World;
import com.rs.game.player.Player;


/**
 * 
 * @author Frostbite
 *
 *<contact@frostbitersps@gmail.com><skype@frostbitersps>
 */


public class RequirementsManager {

	public static void checkCompCapeReq(Player player) {
		if(player.slayerTaskCompleted == 50 && player.dominionTowerKills >= 50 && player.completedGoldOresMined >= 2500 && player.magicLogsBurned >= 3525 && player.completedYewsCut >=  2750 && player.completedRockTailsFished >= 2500 && player.completedGodWarsKills >= 4 
				&& player.gnomeAdvancedLaps >= 125 && player.barbarianAdvancedLaps >= 125 && player.cookedRocktailSuccessfully >= 3250 && player.bunchedLividPlants >= 2700) {
			player.getInventory().addItem(20769, 1);
			player.getInventory().addItem(20752, 1);
			AchievmentMessages.compCape(player);
			player.closeInterfaces();
			player.getDialogueManager().finishDialogue();
		} else {
			player.getPackets().sendGameMessage("<col=ff0000>You are not elgible for the Completionist Cape!");
			player.getDialogueManager().finishDialogue();
			player.closeInterfaces();
		}
	}


	public static void checkTrimmedCompCapeReq(Player player) {
		if(player.slayerTaskCompleted >= 75 && player.dominionTowerKills >= 100 && player.completedGoldOresMined >= 5150 && player.magicLogsBurned >= 5000 && player.completedYewsCut >= 4350 && player.completedRockTailsFished >= 3750 && player.completedGodWarsKills >= 10 && player.gnomeAdvancedLaps >= 350 && player.barbarianAdvancedLaps >= 350 && player.cookedRocktailSuccessfully >= 4150
				&& player.adzeObtained == true && player.slainCorporealBeast == true && player.completedNomadsRequiem == true && player.achievedMaster == true && player.slainKBD == true && player.completedFightCaves == true && player.completedFightKiln == true && player.wonFightPits == true && player.bunchedLividPlants >= 4500) {
			player.getInventory().addItem(20771, 1);
			player.getInventory().addItem(20772, 1);
			AchievmentMessages.trimmedCompCape(player);
			player.closeInterfaces();
			player.getDialogueManager().finishDialogue();
		} else {
			player.getPackets().sendGameMessage("You are not elgible for the Trimmed Completionist Cape!");
			player.getDialogueManager().finishDialogue();
			player.closeInterfaces();
		}

	}


	public static void requirementsCompCape(Player player) {
			int id = 1166;
			String list = "";
			list += "" + (player.slayerTaskCompleted >= CompletionistRequirements.SLAYER_TASKS_COMPLETED ? "<col=ff000><str>Slayer Task Completed ("+ player.getSlayerTaskCompleted() + "/" + CompletionistRequirements.SLAYER_TASKS_COMPLETED + ")<br>" : "<col=E89C0E>Slayer Task Completed ("+ player.getSlayerTaskCompleted() +"/" + CompletionistRequirements.SLAYER_TASKS_COMPLETED + ")<br>") +
					(player.dominionTowerKills >= CompletionistRequirements.DOMINION_TOWER_KILLS ? "<col=ff000><str>Dominion Tower Kills ("+ player.getDominionTowerKills()+ "/" + CompletionistRequirements.DOMINION_TOWER_KILLS + ")<br>" : "<col=E89C0E>Dominion Tower Kills (" + player.getDominionTowerKills() + "/" + CompletionistRequirements.DOMINION_TOWER_KILLS + ")<br>") +
					(player.completedGoldOresMined >= CompletionistRequirements.MINED_GOLD_ORE ? "<col=ff000><str>Gold Ores Mined (" + player.getGoldOreMined() + "/" + CompletionistRequirements.MINED_GOLD_ORE + ")<br>" : "<col=E89C0E>Gold Ores Mined (" + player.getGoldOreMined() + "/" + CompletionistRequirements.MINED_GOLD_ORE + ")<br>") + 
					(player.magicLogsBurned >= CompletionistRequirements.MAGIC_LOGS_BURNED ? "<col=ff000><str>Magic Logs Burned ("+player.getMagicLogsBurned() + "/" + CompletionistRequirements.MAGIC_LOGS_BURNED + ")<br>" : "<col=E89C0E>Magic Logs Burned (" + player.getMagicLogsBurned() + "/" + CompletionistRequirements.MAGIC_LOGS_BURNED + ")<br>") +
					(player.completedYewsCut >= CompletionistRequirements.YEWS_CHOPPED ? "<col=ff000><str>Chopped Yew (" + player.getCompletedYewsCut() + "/" + CompletionistRequirements.YEWS_CHOPPED + ")<br>" : "<col=E89C0E>Chopped Yew (" + player.getCompletedYewsCut() + "/" + CompletionistRequirements.YEWS_CHOPPED + ")<br>") + 
					(player.completedRockTailsFished >= CompletionistRequirements.ROCKTAILS_FISHED ? "<col=ff000><str>Rocktails Fished (" + player.getCompletedRockTailsFished() + "/" + CompletionistRequirements.ROCKTAILS_FISHED + ")<br>" : "<col=E89C0E>Rocktails Fished (" + player.getCompletedRockTailsFished() + "/" + CompletionistRequirements.ROCKTAILS_FISHED + ")<br>") + 
					(player.gnomeAdvancedLaps >= CompletionistRequirements.GNOME_AGILITY ? "<col=ff000><str>Advanced Gnome Course Laps ("+ player.getGnomeAdvancedLaps() + "/" + CompletionistRequirements.GNOME_AGILITY + ")<br>" : "<col=E89C0E>Advanced Gnome Course laps (" + player.getGnomeAdvancedLaps() + "/" + CompletionistRequirements.GNOME_AGILITY + ")<br>") + 
					(player.barbarianAdvancedLaps >= CompletionistRequirements.BARBARIAN_AGILITY ? "<col=ff000><str>Advanced Barbarian Course Laps (" + player.getBarbarianAdvancedLaps() + "/" + CompletionistRequirements.BARBARIAN_AGILITY + ")<br>" : "<col=E89C0E>Advanced Barbarian Course Laps (" + player.getBarbarianAdvancedLaps() + "/" + CompletionistRequirements.BARBARIAN_AGILITY + ")<br>") + 
					(player.cookedRocktailSuccessfully >= CompletionistRequirements.ROCKTAILS_COOKED ? "<col=ff000><str>Cooked Rocktail (" + player.getCookedRocktailSuccessfully() + "/" + CompletionistRequirements.ROCKTAILS_COOKED + ")<br>" : "<col=E89C0E>Cooked Rocktail (" + player.getCookedRocktailSuccessfully() + "/" + CompletionistRequirements.ROCKTAILS_COOKED + ")<br>") + 
					(player.completedSuccessfulThievs >= CompletionistRequirements.SUCCESSFUL_PICKPOCKETS ? "<col=ff000><str>Successful Pickpockets (" + player.getCompletedSuccessfulThievs() + "/" + CompletionistRequirements.SUCCESSFUL_PICKPOCKETS + ")<br>" : "<col=E89C0E>Successful Pickpockets (" + player.getCompletedSuccessfulThievs() + "/" + CompletionistRequirements.SUCCESSFUL_PICKPOCKETS + ")<br>") +
					(player.bunchedLividPlants >= CompletionistRequirements.BUNCHED_PLANTS ? "<col=ff000><str>Successful plants bunched (" + player.getLividFarmBunched() + "/" + CompletionistRequirements.BUNCHED_PLANTS + ")<br>" : "<col=E89C0E>Successful plants bunched (" + player.getLividFarmBunched() + "/" + CompletionistRequirements.BUNCHED_PLANTS + ")<br>") +
					(player.runePlatebodysCreated >= CompletionistRequirements.RUNEPLATES_MADE ? "<col=ff000><str>Rune platebodys made (" + player.getRunePlatesMade() + "/" + CompletionistRequirements.RUNEPLATES_MADE + ")<br>" : "<col=E89C0E>Rune platebodys made (" + player.getRunePlatesMade() + "/" + CompletionistRequirements.RUNEPLATES_MADE + ")<br>") +
					(player.completedNomadsRequiem == true ? "<col=ff000><str>Completed Nomad's Requiem<br>" : "<col=E89C0E>Complete Nomad's Requiem<br>") + 
					(player.getSlainQBD() == true ? "<col=ff000><str>Slain the Queen Black Dragon<br>" : "<col=E89C0E>Slay the Queen Black Dragon<br>") + 
					(player.slainKBD == true ? "<col=ff000><str>Slain the King Black Dragon<br>" : "<col=E89C0E>Slay the King Black Dragon<br>") + 
					(player.slainCorporealBeast == true ?  "<col=ff000><str>Slain Corporeal Beast<br>" : "<col=E89C0E>Slay Corporeal Beast<br>") + 
					(player.completedFightCaves == true ? "<col=ff000><str>Completed Fight Caves<br>" : "<col=E89C0E>Complete Fight Caves<br>") + (
							player.completedFightKiln ? "<col=ff000><str>Completed Fight Kiln<br>" : "<col=E89C0E>Complete Fight Kiln<br>");                                                                   				
			player.getPackets().sendIComponentText(id, 23, "Achievement Log");
			player.getPackets().sendIComponentText(id,  1, list);
			player.getPackets().sendIComponentText(id,  2,  "");
			player.getInterfaceManager().sendInterface(id);
		}

	public static void requirementsTrimmedCompCape(Player player) {
		int id = 1166;
		String list = "";
		list += "" + (player.slayerTaskCompleted >= TrimCompletionistRequirements.SLAYER_TASKS_COMPLETED ? "<col=ff000><str>Slayer Task Completed ("+ player.getSlayerTaskCompleted() + "/" + TrimCompletionistRequirements.SLAYER_TASKS_COMPLETED + ")<br>" : "<col=E89C0E>Slayer Task Completed ("+ player.getSlayerTaskCompleted() +"/" + TrimCompletionistRequirements.SLAYER_TASKS_COMPLETED + ")<br>") + 
				(player.dominionTowerKills >= TrimCompletionistRequirements.DOMINION_TOWER_KILLS ? "<col=ff000><str>Dominion Tower Kills ("+ player.getDominionTowerKills()+ "/" + TrimCompletionistRequirements.DOMINION_TOWER_KILLS + ")<br>" : "<col=E89C0E>Dominion Tower Kills (" + player.getDominionTowerKills() + "/" + TrimCompletionistRequirements.DOMINION_TOWER_KILLS + ")<br>") +
				(player.completedGoldOresMined >= TrimCompletionistRequirements.MINED_GOLD_ORE ? "<col=ff000><str>Gold Ores Mined (" + player.getGoldOreMined() + "/" + TrimCompletionistRequirements.MINED_GOLD_ORE + ")<br>" : "<col=E89C0E>Gold Ores Mined (" + player.getGoldOreMined() + "/" + TrimCompletionistRequirements.MINED_GOLD_ORE + ")<br>") +
				(player.magicLogsBurned >= TrimCompletionistRequirements.MAGIC_LOGS_BURNED ? "<col=ff000><str>Magic Logs Burned ("+player.getMagicLogsBurned() + "/" + TrimCompletionistRequirements.MAGIC_LOGS_BURNED + ")<br>" : "<col=E89C0E>Magic Logs Burned (" + player.getMagicLogsBurned() + "/" + TrimCompletionistRequirements.MAGIC_LOGS_BURNED + ")<br>") +
				(player.completedYewsCut >= TrimCompletionistRequirements.YEWS_CHOPPED ? "<col=ff000><str>Chopped Yew (" + player.getCompletedYewsCut() + "/" + TrimCompletionistRequirements.YEWS_CHOPPED + ")<br>" : "<col=E89C0E>Chopped Yew (" + player.getCompletedYewsCut() + "/" + TrimCompletionistRequirements.YEWS_CHOPPED + ")<br>") + 
				(player.completedRockTailsFished >= TrimCompletionistRequirements.ROCKTAILS_FISHED ? "<col=ff000><str>Rocktails Fished (" + player.getCompletedRockTailsFished() + "/" + TrimCompletionistRequirements.ROCKTAILS_FISHED + ")<br>" : "<col=E89C0E>Rocktails Fished (" + player.getCompletedRockTailsFished() + "/" + TrimCompletionistRequirements.ROCKTAILS_FISHED + ")<br>") + 
				(player.gnomeAdvancedLaps >= TrimCompletionistRequirements.GNOME_AGILITY ? "<col=ff000><str>Advanced Gnome Course Laps ("+ player.getGnomeAdvancedLaps() + "/" + TrimCompletionistRequirements.GNOME_AGILITY + ")<br>" : "<col=E89C0E>Advanced Gnome Course laps (" + player.getGnomeAdvancedLaps() + "/" + TrimCompletionistRequirements.GNOME_AGILITY + ")<br>") + 
				(player.barbarianAdvancedLaps >= TrimCompletionistRequirements.BARBARIAN_AGILITY ? "<col=ff000><str>Advanced Barbarian Course Laps (" + player.getBarbarianAdvancedLaps() + "/" + TrimCompletionistRequirements.BARBARIAN_AGILITY + ")<br>" : "<col=E89C0E>Advanced Barbarian Course Laps (" + player.getBarbarianAdvancedLaps() + "/" + TrimCompletionistRequirements.BARBARIAN_AGILITY + ")<br>") + 
				(player.cookedRocktailSuccessfully >= TrimCompletionistRequirements.ROCKTAILS_COOKED ? "<col=ff000><str>Cooked Rocktail (" + player.getCookedRocktailSuccessfully() + "/" + TrimCompletionistRequirements.ROCKTAILS_COOKED + ")<br>" : "<col=E89C0E>Cooked Rocktail (" + player.getCookedRocktailSuccessfully() + "/" + TrimCompletionistRequirements.ROCKTAILS_COOKED + ")<br>") + 
				(player.bunchedLividPlants >= TrimCompletionistRequirements.BUNCHED_PLANTS ? "<col=ff000><str>Successful plants bunched (" + player.getLividFarmBunched() + "/" + TrimCompletionistRequirements.BUNCHED_PLANTS + ")<br>" : "<col=E89C0E>Successful plants bunched (" + player.getLividFarmBunched() + "/" + TrimCompletionistRequirements.BUNCHED_PLANTS + ")<br>") +
				(player.runePlatebodysCreated >= TrimCompletionistRequirements.RUNEPLATES_MADE ? "<col=ff000><str>Rune platebodys made (" + player.getRunePlatesMade() + "/" + TrimCompletionistRequirements.RUNEPLATES_MADE + ")<br>" : "<col=E89C0E>Rune platebodys made (" + player.getRunePlatesMade() + "/" + TrimCompletionistRequirements.RUNEPLATES_MADE + ")<br>") +
				(player.completedSuccessfulThievs >= TrimCompletionistRequirements.SUCCESSFUL_PICKPOCKETS ? "<col=ff000><str>Successful Pickpockets (" + player.getCompletedSuccessfulThievs() + "/" + TrimCompletionistRequirements.SUCCESSFUL_PICKPOCKETS + ")<br>" : "<col=E89C0E>Successful Pickpockets (" + player.getCompletedSuccessfulThievs() + "/" + TrimCompletionistRequirements.SUCCESSFUL_PICKPOCKETS + ")<br>") +
				(player.completedNomadsRequiem == true ? "<col=ff000><str>Completed Nomad's Requiem<br>" : "<col=E89C0E>Complete Nomad's Requiem<br>") + 
				(player.getSlainQBD() == true ? "<col=ff000><str>Slain the Queen Black Dragon<br>" : "<col=E89C0E>Slay the Queen Black Dragon<br>") + 
				(player.slainKBD == true ? "<col=ff000><str>Slain the King Black Dragon<br>" : "<col=E89C0E>Slay the King Black Dragon<br>") +
				(player.slainCorporealBeast == true ?  "<col=ff000><str>Slain Corporeal Beast<br>" : "<col=E89C0E>Slay Corporeal Beast<br>") + 
				(player.completedFightCaves == true ? "<col=ff000><str>Completed Fight Caves<br>" : "<col=E89C0E>Complete Fight Caves<br>") + 
				(player.completedFightKiln ? "<col=ff000><str>Completed Fight Kiln<br>" : "<col=E89C0E>Complete Fight Kiln<br>");                                                                   				
		player.getPackets().sendIComponentText(id, 23, "Achievement Log");
		player.getPackets().sendIComponentText(id,  1, list);
		player.getPackets().sendIComponentText(id,  2,  "");
		player.getInterfaceManager().sendInterface(id);
	}

	static void addItem(Player player, int id, int amount) {
		player.getInventory().addItem(id, amount);

	}

	static void sendWorldMessage(Player player, String wm, boolean value) {
		World.sendWorldMessage(wm, value);
	}

	static void sendMessage(Player player, String m) {
		player.getPackets().sendGameMessage(m);
	}

	static void getUsername(Player player) {
		player.getUsername();
	}


}

/**
 * 
 if(player.getCompletedOresMined() >= 2501 || definitions.getOreId() == 444 || player.achievementAnnouncement == true) {
				player.completedGoldOresMined++;
				player.getPackets().sendGameMessage("[<col=DE8C21>Achievement Manager</col>] - <col=DE8C21>You have mined (" + player.getCompletedOresMined()+ "/4850) Gold Ore!");
			} else if(player.getCompletedOresMined() <= 2500 || definitions.getOreId() == 444 || player.achievementAnnouncement == true) {
				player.completedGoldOresMined++;
				player.getPackets().sendGameMessage("[<col=DE8C21>Achievement Manager</col>] - <col=DE8C21>You have mined (" + player.getCompletedOresMined()+ "/2500) Gold Ore!");
			} else if(definitions.getOreId() == 444) {
					player.completedGoldOresMined++;
			}
 * 
 * 
 */
