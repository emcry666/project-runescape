package com.rs.game.player.content;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CompletionistRequirements {
	
	public static int SLAYER_TASKS_COMPLETED,
	MINED_GOLD_ORE,
	MAGIC_LOGS_BURNED,
	YEWS_CHOPPED,
	ROCKTAILS_FISHED,
	BARBARIAN_AGILITY,
	GNOME_AGILITY,
	ROCKTAILS_COOKED,
	SUCCESSFUL_PICKPOCKETS,
	BUNCHED_PLANTS,
	RUNEPLATES_MADE,
	PENGUINS_HUNTED,
	
	
	DOMINION_TOWER_KILLS;
	
	public static void init() {
		try {
			System.out.println("[Acheivement] -> : Loading Completionist Achievements...");
			BufferedReader reader = new BufferedReader(new FileReader("./data/content/completionist.ini"));
			String line = "";
			int count = 0;
			while ((line = reader.readLine()) != null) {
				if (line.startsWith("#") || line.startsWith("//") || line.isEmpty() || !line.contains("="))
					continue;
				String[] splitString = line.split("=");
				if (splitString.length <= 1)
					continue;
				String config = splitString[0];
				String value = splitString[1];
				setVar(config, value);
				count++;
			}
			reader.close();
			System.out.println("[Achievement] -> : Loaded " + count + " Achievements...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void setVar(String config, String value) throws IOException {
		switch(config) {
		
		/**
		 * Completionist Cape
		 */
		case "slayerTasks":
			SLAYER_TASKS_COMPLETED = Integer.parseInt(value);
			break;
			
		case "goldOreMined":
			MINED_GOLD_ORE = Integer.parseInt(value);
			break;
			
		case "magicLogsBurned":
			MAGIC_LOGS_BURNED = Integer.parseInt(value);
			break;
			
		case "yewsChopped":
			YEWS_CHOPPED = Integer.parseInt(value);
			break;
			
		case "rocktailsFished":
			ROCKTAILS_FISHED = Integer.parseInt(value);
			break;
			
		case "advBarbarianLaps":
			BARBARIAN_AGILITY = Integer.parseInt(value);
			break;
			
		case "advGnomeAgility":
			GNOME_AGILITY = Integer.parseInt(value);
			break;
			
		case "rocktailsCooked":
			ROCKTAILS_COOKED = Integer.parseInt(value);
			break;
			
		case "successPickpockets":
			SUCCESSFUL_PICKPOCKETS = Integer.parseInt(value);
			break;
			
		case "bunchedPlants":
			BUNCHED_PLANTS = Integer.parseInt(value);
			break;
			
		case "rune_platebodys_made":
			RUNEPLATES_MADE = Integer.parseInt(value);
			break;
			
		case "penguins_hunted":
			PENGUINS_HUNTED = Integer.parseInt(value);
			break;
			
		case "dominion_tower_kills":
			DOMINION_TOWER_KILLS = Integer.parseInt(value);
			break;
			
			
		}
		
	}

}
