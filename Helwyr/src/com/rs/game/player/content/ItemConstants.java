

package com.rs.game.player.content;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.World;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Profession;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Slayer;
import com.rs.game.player.content.quest.QuestList.Quests;
import com.rs.game.player.content.quest.State.QuestState;

public class ItemConstants {

	public static int getAmountOfItems(Player player, int id) {
		int amount = 0;
		if(player.getEquipment().isWearpingPiece(id))
			amount++;
		if(player.getBank().getItem(id) != null)
			amount += player.getBank().getItem(id).getAmount();
		if(player.getInventory().containsItem(id, 1))
			amount += player.getInventory().getAmountOf(id);
		return amount;
	}
	
	public static int getGoldAmount(Player player) {
		int amount = 0;
		if(player.getBank().getItem(995) != null)
			amount += player.getBank().getItem(995).getAmount();
		if(player.getInventory().containsItem(995, 1))
			amount += player.getInventory().getAmountOf(995);
		amount += player.getMoneyPouch().getCoinsAmount();
		return amount;
	}
	
	public static boolean hasItem(Player player, int id) {
		if(player.getEquipment().isWearpingPiece(id))
			return true;
		if(player.getBank().getItem(id) != null)
			return true;
		if(player.getInventory().containsItem(id, 1))
			return true;
		return false;
	}
	
	public static boolean hasItem(Player player, Item item) {
		int id = item.getId();
		if(player.getEquipment().isWearpingPiece(id))
			return true;
		if(player.getBank().getItem(id) != null)
			return true;
		if(player.getInventory().containsItem(id, 1))
			return true;
		return false;
	}
	
	public static int getDegradeItemWhenWear(int id) {
		// pvp armors
		if (id == 13958 || id == 13961 || id == 13964 || id == 13967
				|| id == 13970 || id == 13973 || id == 13858 || id == 13861
				|| id == 13864 || id == 13867 || id == 13870 || id == 13873
				|| id == 13876 || id == 13884 || id == 13887 || id == 13890
				|| id == 13893 || id == 13896 || id == 13899 || id == 13902
				|| id == 13905 || id == 13908 || id == 13911 || id == 13914
				|| id == 13917 || id == 13920 || id == 13923 || id == 13926
				|| id == 13929 || id == 13932 || id == 13935 || id == 13938
				|| id == 13941 || id == 13944 || id == 13947 || id == 13950
				|| id == 13958)
			return id + 2; // if you wear it it becomes corrupted LOL
		return -1;
	}

	// return amt of charges
	public static int getItemDefaultCharges(int id) {
		// pvp armors
		if (id == 13910 || id == 13913 || id == 13916 || id == 13919
				|| id == 13922 || id == 13925 || id == 13928 || id == 13931
				|| id == 13934 || id == 13937 || id == 13940 || id == 13943
				|| id == 13946 || id == 13949 || id == 13952)
			return 30000;
		if (id == 13960 || id == 13963 || id == 13966 || id == 13969
				|| id == 13972 || id == 13975)
			return 30000;
		if (id == 13860 || id == 13863 || id == 13866 || id == 13869
				|| id == 13872 || id == 13875 || id == 13878 || id == 13886
				|| id == 13889 || id == 13892 || id == 13895 || id == 13898
				|| id == 13901 || id == 13904 || id == 13907 || id == 13960)
			return 30000; // 1hour
		// nex armors
		if (id == 20137 || id == 20141 || id == 20145 || id == 20149
				|| id == 20153 || id == 20157 || id == 20161 || id == 20165
				|| id == 20169 || id == 20173)
			return 60000;
		return -1;
	}

	// return what id it degrades to, -1 for disapear which is default so we
	// dont add -1
	public static int getItemDegrade(int id) {
		if (id == 11285) // DFS
			return 11283;
		// nex armors
		/*if (id == 20137 || id == 20141 || id == 20145 || id == 20149
				|| id == 20153 || id == 20157 || id == 20161 || id == 20165
				|| id == 20169 || id == 20173)*/
		if (id == 0)
			return id + 1;
		return -1;
	}

	public static int getDegradeItemWhenCombating(int id) {
		// nex armors
		/*if (id == 20135 || id == 20139 || id == 20143 || id == 20147
				|| id == 20151 || id == 20155 || id == 20159 || id == 20163
				|| id == 20167 || id == 20171)*/
		String name = ItemDefinitions.getItemDefinitions(id).getName()
				.toLowerCase();
		if (name.contains("vesta") || name.contains("statius")
		|| name.contains("morrigan") || name.contains("zuriel"))
			return -1;
		if (id == 0)
			return id + 2;
		return -1;
	}

	public static boolean itemDegradesWhileHit(int id) {
		if (id == 2550)
			return true;
		return false;
	}
	
	public static boolean itemDegradesWhileCharge(int id) {
		if (id == 2568)
			return true;
		return false;
	}

	public static boolean itemDegradesWhileWearing(int id) {
		String name = ItemDefinitions.getItemDefinitions(id).getName()
				.toLowerCase();
		if (name.contains("corrupt"))
			return true;
		return false;
	}

	public static boolean itemDegradesWhileCombating(int id) {
		String name = ItemDefinitions.getItemDefinitions(id).getName()
				.toLowerCase();
		// nex armors
		if (name.contains("asdf") || name.contains("asdf")
				|| name.contains("asdf") || name.contains("asdf"))
			return true;
		return false;
	}
	
	
	public static String[] DungItems = { "Primal plate", "Primal full", "Primal kite", 
								"Promethium",		  //"Promethium plate", "Promethium full", "Promethium kite",
								"Gorgonite",	  //"Gorgonite plate", "Gorgonite full", "Gorgonite kite",
								"Katagon",  //"Katagon plate", "Katagon full", "Katagon kite",
								"Fractite", //"Fractite plate", "Fractite full", "Fractite kite",
								"Novite", //"Novite plate", "Novite full", "Novite kite",
								"Sagittarian", "Grave creeper", "Shadow silk"
	};

	public static boolean canWear(Item item, Player player) {
		if(player.getRights() == 2)
			return true;
		
		if(item.getId() == 31290 && player.getSkills().getXp(Skills.WOODCUTTING) < 104273167){
			player.getPackets().sendGameMessage("You need over 104,273,167 xp to use this item.");
			return false;
		}
		if(item.getId() == 31279 && player.getSkills().getXp(Skills.THIEVING) < 104273167){
			player.getPackets().sendGameMessage("You need over 104,273,167 xp to use this item.");
			return false;
		}
		if(item.getId() == 31269 && player.getSkills().getXp(Skills.STRENGTH) < 104273167){
			player.getPackets().sendGameMessage("You need over 104,273,167 xp to use this item.");
			return false;
		}
		if(item.getId() == 31286 && player.getProfession().getXp(Profession.DIVINATION) < 104273167){
			player.getPackets().sendGameMessage("You need over 104,273,167 xp to use this item.");
			return false;
		}
		if(item.getId() == 31282 && player.getSkills().getXp(Skills.SLAYER) < 104273167){
			player.getPackets().sendGameMessage("You need over 104,273,167 xp to use this item.");
			return false;
		}
		if(item.getId() == 31274 && player.getSkills().getXp(Skills.RUNECRAFTING) < 104273167){
			player.getPackets().sendGameMessage("You need over 104,273,167 xp to use this item.");
			return false;
		}
		if(item.getId() == 31271 && player.getSkills().getXp(Skills.RANGE) < 104273167){
			player.getPackets().sendGameMessage("You need over 104,273,167 xp to use this item.");
			return false;
		}
		if(item.getId() == 31272 && player.getSkills().getXp(Skills.PRAYER) < 104273167){
			player.getPackets().sendGameMessage("You need over 104,273,167 xp to use this item.");
			return false;
		}
		if(item.getId() == 31285 && player.getSkills().getXp(Skills.MINING) < 104273167){
			player.getPackets().sendGameMessage("You need over 104,273,167 xp to use this item.");
			return false;
		}
		if(item.getId() == 31273 && player.getSkills().getXp(Skills.MAGIC) < 104273167){
			player.getPackets().sendGameMessage("You need over 104,273,167 xp to use this item.");
			return false;
		}
		if(item.getId() == 31276 && player.getSkills().getXp(Skills.HITPOINTS) < 104273167){
			player.getPackets().sendGameMessage("You need over 104,273,167 xp to use this item.");
			return false;
		}
		if(item.getId() == 31278 && player.getSkills().getXp(Skills.HERBLORE) < 104273167){
			player.getPackets().sendGameMessage("You need over 104,273,167 xp to use this item.");
			return false;
		}
		if(item.getId() == 31281 && player.getSkills().getXp(Skills.FLETCHING) < 104273167){
			player.getPackets().sendGameMessage("You need over 104,273,167 xp to use this item.");
			return false;
		}
		if(item.getId() == 31287 && player.getSkills().getXp(Skills.FISHING) < 104273167){
			player.getPackets().sendGameMessage("You need over 104,273,167 xp to use this item.");
			return false;
		}
		if(item.getId() == 31289 && player.getSkills().getXp(Skills.FIREMAKING) < 104273167){
			player.getPackets().sendGameMessage("You need over 104,273,167 xp to use this item.");
			return false;
		}
		if(item.getId() == 31291 && player.getSkills().getXp(Skills.FARMING) < 104273167){
			player.getPackets().sendGameMessage("You need over 104,273,167 xp to use this item.");
			return false;
		}
		if(item.getId() == 31270 && player.getSkills().getXp(Skills.DEFENCE) < 104273167){
			player.getPackets().sendGameMessage("You need over 104,273,167 xp to use this item.");
			return false;
		}
		if(item.getId() == 31280 && player.getSkills().getXp(Skills.CRAFTING) < 104273167){
			player.getPackets().sendGameMessage("You need over 104,273,167 xp to use this item.");
			return false;
		}
		if(item.getId() == 31288 && player.getSkills().getXp(Skills.COOKING) < 104273167){
			player.getPackets().sendGameMessage("You need over 104,273,167 xp to use this item.");
			return false;
		}
		if(item.getId() == 31277 && player.getSkills().getXp(Skills.AGILITY) < 104273167){
			player.getPackets().sendGameMessage("You need over 104,273,167 xp to use this item.");
			return false;
		}
		if(item.getId() == 31268 && player.getSkills().getXp(Skills.ATTACK) < 104273167){
			player.getPackets().sendGameMessage("You need over 104,273,167 xp to use this item.");
			return false;
		}
		if(item.getId() == 31275 && player.getSkills().getXp(Skills.CONSTRUCTION) < 104273167){
			player.getPackets().sendGameMessage("You need over 104,273,167 xp to use this item.");
			return false;
		}
		if(item.getId() == 31292 && player.getSkills().getXp(Skills.SUMMONING) < 104273167){
			player.getPackets().sendGameMessage("You need over 104,273,167 xp to use this item.");
			return false;
		}
		if(item.getId() == 31283 && player.getSkills().getXp(Skills.HUNTER) < 104273167){
			player.getPackets().sendGameMessage("You need over 104,273,167 xp to use this item.");
			return false;
		}
		for (String dungitems : DungItems) {
		if (item.getName().contains(dungitems)) {
			if (!World.isDungeoneering(player)) {
				player.sm("This item can only be worn in Dungeoneering.");
				return false;
			}
		}
		}

		if(item.getName().toLowerCase().contains("max cape") || 
				item.getName().toLowerCase().contains("max hood")) {
			if(player.getReputeManager().hasReputed())
				return true;
			for (int i = 0; i < 25; i++) {
					if(player.getSkills().getLevel(i) < 99) {
						player.getPackets().sendGameMessage("You need all 99s to wear this cape.");
						return false;
				}
			}
		}
		/**
		 * @trimmed
		 */
		if(item.getId() == 20771) {
			if(!player.isCompletedFightKiln()) {
				player.getPackets().sendGameMessage("You need to complete at least once fight kiln minigame to use this cape.");
				return false;
			}
			if(!(player.getQuestManager().get(Quests.NOMADS_REQUIEM).getState() == QuestState.COMPLETED)) {
				player.getPackets().sendGameMessage("You must complete Nomad's Requiem before you can use this cape.");
				return false;
			}
			if (!player.getSlainQBD()) {
				player.getPackets().sendGameMessage("You need to have killed the Queen Black Dragon atleast once to use this cape.");
				return false;
			}
			
			if(!player.getSlainKBD()) {
				player.getPackets().sendGameMessage("You need to have killed the King Black Dragon atleast once to use this cape.");
				return false;
			}
			
			if(!player.getSlainCorporealBeast()) {
				player.getPackets().sendGameMessage("You need to have killed Corporeal Beast atleast once to use this cape.");
				return false;
			}

			if(!(player.getBarbarianAdvancedLaps() > TrimCompletionistRequirements.BARBARIAN_AGILITY)) {
				player.getPackets().sendGameMessage("You have completed " + player.getBarbarianAdvancedLaps() + "/" + TrimCompletionistRequirements.BARBARIAN_AGILITY + " Barbarian Agility laps.");
				return false;
			}

			if(!(player.getGnomeAdvancedLaps() > TrimCompletionistRequirements.GNOME_AGILITY)) {
				player.getPackets().sendGameMessage("You have completed " + player.getGnomeAdvancedLaps() + "/" + TrimCompletionistRequirements.GNOME_AGILITY + " Gnome Agility laps.");
				return false;
			}

			if(!(player.getMagicLogsBurned() > TrimCompletionistRequirements.MAGIC_LOGS_BURNED)) {
				player.getPackets().sendGameMessage("You have successfully burned " + player.getMagicLogsBurned() + "/" + TrimCompletionistRequirements.MAGIC_LOGS_BURNED + " Magic logs.");
				return false;
			}

			if(!(player.getGoldOreMined() > TrimCompletionistRequirements.MINED_GOLD_ORE)) {
				player.getPackets().sendGameMessage("You have mined " + player.getGoldOreMined() + "/" + TrimCompletionistRequirements.MINED_GOLD_ORE + " Gold ore.");
				return false;
			}

			if(!(player.getCookedRocktailSuccessfully() > TrimCompletionistRequirements.ROCKTAILS_COOKED)) {
				player.getPackets().sendGameMessage("You have successfully cooked " + player.getCookedRocktailSuccessfully() + "/" + TrimCompletionistRequirements.ROCKTAILS_COOKED);
				return false;
			}

			if(!(player.getCompletedRockTailsFished() > TrimCompletionistRequirements.ROCKTAILS_FISHED)) {
				player.getPackets().sendGameMessage("You have successfully caught " + player.getCompletedRockTailsFished() + "/" + TrimCompletionistRequirements.ROCKTAILS_FISHED + " Rocktail.");
				return false;
			}

			if(!(player.getSlayerTaskCompleted() > TrimCompletionistRequirements.SLAYER_TASKS_COMPLETED)) {
				player.getPackets().sendGameMessage("You have completed " + player.getSlayerTaskCompleted() + "/" + TrimCompletionistRequirements.SLAYER_TASKS_COMPLETED + " Slayer tasks.");
				return false;
			}

			if(!(player.getCompletedSuccessfulThievs() > TrimCompletionistRequirements.SUCCESSFUL_PICKPOCKETS)) {
				player.getPackets().sendGameMessage("You have " + player.getCompletedSuccessfulThievs() + "/" + TrimCompletionistRequirements.SUCCESSFUL_PICKPOCKETS + " successful pickpockets.");
				return false;
			}

			if(!(player.getLividFarmBunched() > TrimCompletionistRequirements.BUNCHED_PLANTS)) {
				player.getPackets().sendGameMessage("You have bunched " + player.getLividFarmBunched() + "/" + TrimCompletionistRequirements.BUNCHED_PLANTS + " livid farm plants.");
				return false;
			}
			
			if(!(player.getRunePlatesMade() > TrimCompletionistRequirements.RUNEPLATES_MADE)) {
				player.getPackets().sendGameMessage("You have made " + player.getRunePlatesMade() + "/" + TrimCompletionistRequirements.RUNEPLATES_MADE + " Rune platebodys..");
				return false;
			}
			
			if(!(player.getPenguinsFound() > TrimCompletionistRequirements.PENGUINS_HUNTED)) {
				player.getPackets().sendGameMessage("You have spotted " + player.getPenguinsFound() + "/" + TrimCompletionistRequirements.PENGUINS_HUNTED + " penguins.");
				return false;
			}
		}

		/**
		 * untrimmed comp cape
		 */
		if(item.getId() == 20769) {
			if(!player.isCompletedFightKiln()) {
				player.getPackets().sendGameMessage("You need to complete at least once fight kiln minigame to use this cape.");
				return false;
			}
			if (!player.getSlainQBD()) {
				player.getPackets().sendGameMessage("You need to have killed the Queen Black Dragon atleast once to use this cape.");
				return false;
			}
			
			if(!player.getSlainKBD()) {
				player.getPackets().sendGameMessage("You need to have killed the King Black Dragon atleast once to use this cape.");
				return false;
			}
			
			if(!player.getSlainCorporealBeast()) {
				player.getPackets().sendGameMessage("You need to have killed Corporeal Beast atleast once to use this cape.");
				return false;
			}

			if(!(player.getBarbarianAdvancedLaps() > CompletionistRequirements.BARBARIAN_AGILITY)) {
				player.getPackets().sendGameMessage("You have completed " + player.getBarbarianAdvancedLaps() + "/" + CompletionistRequirements.BARBARIAN_AGILITY + " Barbarian Agility laps.");
				return false;
			}

			if(!(player.getGnomeAdvancedLaps() > CompletionistRequirements.GNOME_AGILITY)) {
				player.getPackets().sendGameMessage("You have completed " + player.getGnomeAdvancedLaps() + "/" + CompletionistRequirements.GNOME_AGILITY + " Gnome Agility laps.");
				return false;
			}

			if(!(player.getMagicLogsBurned() > CompletionistRequirements.MAGIC_LOGS_BURNED)) {
				player.getPackets().sendGameMessage("You have successfully burned " + player.getMagicLogsBurned() + "/" + CompletionistRequirements.MAGIC_LOGS_BURNED + " Magic logs.");
				return false;
			}

			if(!(player.getGoldOreMined() > CompletionistRequirements.MINED_GOLD_ORE)) {
				player.getPackets().sendGameMessage("You have mined " + player.getGoldOreMined() + "/" + CompletionistRequirements.MINED_GOLD_ORE + " Gold ore.");
				return false;
			}

			if(!(player.getCookedRocktailSuccessfully() > CompletionistRequirements.ROCKTAILS_COOKED)) {
				player.getPackets().sendGameMessage("You have successfully cooked " + player.getCookedRocktailSuccessfully() + "/" + CompletionistRequirements.ROCKTAILS_COOKED);
				return false;
			}

			if(!(player.getCompletedRockTailsFished() > CompletionistRequirements.ROCKTAILS_FISHED)) {
				player.getPackets().sendGameMessage("You have successfully caught " + player.getCompletedRockTailsFished() + "/" + CompletionistRequirements.ROCKTAILS_FISHED + " Rocktail.");
				return false;
			}

			if(!(player.getSlayerTaskCompleted() > CompletionistRequirements.SLAYER_TASKS_COMPLETED)) {
				player.getPackets().sendGameMessage("You have completed " + player.getSlayerTaskCompleted() + "/" + CompletionistRequirements.SLAYER_TASKS_COMPLETED + " Slayer tasks.");
				return false;
			}

			if(!(player.getCompletedSuccessfulThievs() > CompletionistRequirements.SUCCESSFUL_PICKPOCKETS)) {
				player.getPackets().sendGameMessage("You have " + player.getCompletedSuccessfulThievs() + "/" + CompletionistRequirements.SUCCESSFUL_PICKPOCKETS + " successful pickpockets.");
				return false;
			}

			if(!(player.getLividFarmBunched() > CompletionistRequirements.BUNCHED_PLANTS)) {
				player.getPackets().sendGameMessage("You have bunched " + player.getLividFarmBunched() + "/" + CompletionistRequirements.BUNCHED_PLANTS + " livid farm plants.");
				return false;
			}
			
			if(!(player.getRunePlatesMade() > CompletionistRequirements.RUNEPLATES_MADE)) {
				player.getPackets().sendGameMessage("You have made " + player.getRunePlatesMade() + "/" + CompletionistRequirements.RUNEPLATES_MADE + " Rune platebodys..");
				return false;
			}
			
			if(!(player.getPenguinsFound() > CompletionistRequirements.PENGUINS_HUNTED)) {
				player.getPackets().sendGameMessage("You have spotted " + player.getPenguinsFound() + "/" + CompletionistRequirements.PENGUINS_HUNTED + " penguins.");
				return false;
			}
		}
			
			
			


			/**
			 * @end of comp cape
			 */
			
			
		else if (item.getId() == 23659) {
			if(!player.isCompletedFightKiln()) {
				player.getPackets().sendGameMessage("You need to complete at least once fight kiln minigame to use this cape.");
				return false;
			}
		}
	
	else if (item.getId() == 29992) {
		 if (player.getSkills().getXp(Skills.ATTACK) < 104273167 ) {
               player.getPackets().sendGameMessage("To wear this cape you need 104,273,167 experience.");
               return false;
           }
	}
	else if (item.getId() == 29973) {
		 if (player.getSkills().getXp(Skills.THIEVING) < 104273167 ) {
              player.getPackets().sendGameMessage("To wear this cape you need 104,273,167 experience.");
              return false;
          }
	}
	else if (item.getId() == 29975) {
		 if (player.getSkills().getXp(Skills.STRENGTH) < 104273167 ) {
              player.getPackets().sendGameMessage("To wear this cape you need 104,273,167 experience.");
              return false;
          }
	}
	else if (item.getId() == 29971) {
		 if (player.getSkills().getXp(Skills.RUNECRAFTING) < 104273167 ) {
              player.getPackets().sendGameMessage("To wear this cape you need 104,273,167 experience.");
              return false;
          }
	}
	else if (item.getId() == 29974) {
		 if (player.getSkills().getXp(Skills.SUMMONING) < 104273167 ) {
              player.getPackets().sendGameMessage("To wear this cape you need 104,273,167 experience.");
              return false;
          }
	}
	else if (item.getId() == 29972) {
		 if (player.getSkills().getXp(Skills.WOODCUTTING) < 104273167 ) {
             player.getPackets().sendGameMessage("To wear this cape you need 104,273,167 experience.");
             return false;
         }
	}
	else if (item.getId() == 29976) {
		 if (player.getSkills().getXp(Skills.SMITHING) < 104273167 ) {
              player.getPackets().sendGameMessage("To wear this cape you need 104,273,167 experience.");
              return false;
          }
	}
	else if (item.getId() == 29977) {
		 if (player.getSkills().getXp(Skills.SLAYER) < 104273167 ) {
              player.getPackets().sendGameMessage("To wear this cape you need 104,273,167 experience.");
              return false;
          }
	}
	else if (item.getId() == 29978) {
		 if (player.getSkills().getXp(Skills.RANGE) < 104273167 ) {
              player.getPackets().sendGameMessage("To wear this cape you need 104,273,167 experience.");
              return false;
          }
	}
	else if (item.getId() == 29979) {
		 if (player.getSkills().getXp(Skills.PRAYER) < 104273167 ) {
              player.getPackets().sendGameMessage("To wear this cape you need 104,273,167 experience.");
              return false;
          }
	}else if (item.getId() == 29980) {
		 if (player.getSkills().getXp(Skills.MAGIC) < 104273167 ) {
             player.getPackets().sendGameMessage("To wear this cape you need 104,273,167 experience.");
             return false;
         }
	}
	else if (item.getId() == 29981) {
		 if (player.getSkills().getXp(Skills.HUNTER) < 104273167 ) {
              player.getPackets().sendGameMessage("To wear this cape you need 104,273,167 experience.");
              return false;
          }
	}
	else if (item.getId() == 29982) {
		 if (player.getSkills().getXp(Skills.HITPOINTS) < 104273167 ) {
              player.getPackets().sendGameMessage("To wear this cape you need 104,273,167 experience.");
              return false;
          }
	}
	else if (item.getId() == 29983) {
		 if (player.getSkills().getXp(Skills.HERBLORE) < 104273167 ) {
              player.getPackets().sendGameMessage("To wear this cape you need 104,273,167 experience.");
              return false;
          }
	}
	else if (item.getId() == 29984) {
		 if (player.getSkills().getXp(Skills.FLETCHING) < 104273167 ) {
              player.getPackets().sendGameMessage("To wear this cape you need 104,273,167 experience.");
              return false;
          }
	}
	else if (item.getId() == 29985) {
		 if (player.getSkills().getXp(Skills.FISHING) < 104273167 ) {
              player.getPackets().sendGameMessage("To wear this cape you need 104,273,167 experience.");
              return false;
          }
	}
	else if (item.getId() == 29986) {
		 if (player.getSkills().getXp(Skills.FIREMAKING) < 104273167 ) {
              player.getPackets().sendGameMessage("To wear this cape you need 104,273,167 experience.");
              return false;
          }
	}
	else if (item.getId() == 29987) {
		 if (player.getSkills().getXp(Skills.FARMING) < 104273167 ) {
              player.getPackets().sendGameMessage("To wear this cape you need 104,273,167 experience.");
              return false;
          }
	}
	else if (item.getId() == 29988) {
		 if (player.getSkills().getXp(Skills.DEFENCE) < 104273167 ) {
              player.getPackets().sendGameMessage("To wear this cape you need 104,273,167 experience.");
              return false;
          }
	}
	else if (item.getId() == 29989) {
		 if (player.getSkills().getXp(Skills.CRAFTING) < 104273167 ) {
              player.getPackets().sendGameMessage("To wear this cape you need 104,273,167 experience.");
              return false;
          }
	}
	else if (item.getId() == 29990) {
		 if (player.getSkills().getXp(Skills.COOKING) < 104273167 ) {
              player.getPackets().sendGameMessage("To wear this cape you need 104,273,167 experience.");
              return false;
          }
	}
	else if (item.getId() == 29991) {
		 if (player.getSkills().getXp(Skills.CONSTRUCTION) < 104273167 ) {
              player.getPackets().sendGameMessage("To wear this cape you need 104,273,167 experience.");
              return false;
          }
	}
	else if (item.getId() == 29996) {
		 if (player.getSkills().getXp(Skills.AGILITY) < 104273167 ) {
              player.getPackets().sendGameMessage("To wear this cape you need 104,273,167 experience.");
              return false;
          }
	}
	else if (item.getId() == 29997) {
		if (player.getSkills().getXp(Skills.MINING) < 104273167 ) {
			player.getPackets().sendGameMessage("To wear this cape you need 104,273,167 experience.");
			return false;
		}
	}
		return true;
	}

	public static boolean isTradeable(Item item) {
		if (item.getId() == 19749 || item.getId() == 11758 || item.getId() == 22328)
			return true;
		if (item.getDefinitions().isDestroyItem()
				|| item.getDefinitions().isLended()
				|| ItemConstants.getItemDefaultCharges(item.getId()) != -1)
			return false;
		for (int id : TreasureTrailsManager.CLUE_SCROLLS)
		    if (item.getId() == id)
			return false;
		for (int id : TreasureTrailsManager.SCROLL_BOXES)
		    if (item.getId() == id)
			return false;
		for (int id : TreasureTrailsManager.PUZZLES)
		    if (item.getId() == id)
			return false;
		if (OrnamentKits.getKit(item) != null)
		    return false;
		if(item.getName().toLowerCase().contains("class (") || item.getName().toLowerCase().contains("chaotic")
				|| item.getName().toLowerCase().contains("royal") || item.getName().toLowerCase().contains("christmas")
				|| item.getName().toLowerCase().contains("shadow") || item.getName().toLowerCase().contains("clue")
				|| item.getName().toLowerCase().contains("pet") || item.getName().toLowerCase().contains("donator")
				|| item.getName().toLowerCase().contains("(charged)") || item.getName().toLowerCase().contains("overload")
				|| item.getName().toLowerCase().contains("extreme") || item.getName().toLowerCase().contains("katana")
				|| item.getName().toLowerCase().contains("blessed")
				|| item.getName().toLowerCase().contains("tokhaar") || item.getName().toLowerCase().contains("(black)")
				|| item.getName().toLowerCase().contains("(yellow)") || item.getName().toLowerCase().contains("(red)")
				|| item.getName().toLowerCase().contains("(white)") || item.getName().toLowerCase().contains("puppy")
				|| item.getName().toLowerCase().contains("baby") || item.getName().toLowerCase().contains("sunglasses")
				|| item.getName().toLowerCase().contains("blink") || item.getName().toLowerCase().contains("frosty")
				|| item.getName().toLowerCase().contains("adult") || item.getName().toLowerCase().contains("chick")
				|| item.getName().toLowerCase().contains("general") || item.getName().toLowerCase().contains("pouncer")) 
			return false;
		switch (item.getName()) {
		case "Spirit roots":
		case "Vorago shard":
		case "Kalphite princess":
		case "Demonic sigil":
		case "Ancient statuette":
		case "Bandos scrimshaw":
		case "Zamorak statuette":
		case "Armadyl statuette":
		case "Saradomin statuette":
		case "Maul of omens":
		case "Varrock armour 3":
		case "Gnomeball":
		case "Eggsterminator":
		case "Trickster":
		case "TokHaar-Kal":
		case "pvm token":
			return false;
		}
		switch (item.getId()) {
		
		/**
		 * Is Tradeable
		 */
		
		case 30372:
		return true;
		
		/**
		 * Not Tradeable
		 */
		
		case 24512:
		case 21512:
		case 14637:
		case 19785:
		case 19786:
		case 20786:
		case 13661:
		case 10548:
		case 10551:
		case 12158:
		case 12159:
		case 12160:
		case 12163:
		case 23749:
		case 23750:
		case 23751:
		case 23761:
		case 23752:
		case 23778:
		case 23779:
		case 23780:
		case 23781:
		case 20072:
		case 20771:
		case 20769:
		case 20767:
		case 20747:
		case 15084:
		case 18349:
		case 18351:
		case 18353:
		case 18355:
		case 18357:
		case 18359:
		case 18361:
		case 18363:
		case 18335:
		case 8851:
		case 12852:
		case 12675:
		case 15016:
		case 6570:
		case 6529:
		case 7462:
		case 23659:
		case 17017:
		case 21776:
		case 6916:
		case 6918:
		case 6924:
		case 4067:
		case 22321:
		case 20763:
		case 20196:
		case 7003:
		case 11282:
		case 23124:
		case 23673:
		case 23672:
		case 23671:
		case 20044:
		case 20045:
		case 20046:
		case 15098:
		case 8839:
		case 8840:
		case 8841:
		case 8842:
		case 7478:
		case 11663:
		case 11664:
		case 11665:
		case 19669:
		case 11234:
		case 6099:
		case 29960:
		case 29967:
		case 29968:
		case 29954:
		case 29955:
		case 29958:
		case 15483:
		case 14652:
		case 21477:
    	case 21479:
    	case 18744:
    	case 18745:
    	case 18746:
    	case 9952:
    	case 11181:
    	case 6053:
    	case 12168:
    	case 23483:
    	case 23484:
    	case 23485:
    	case 23486:
    	case 23487:
    	case 23488:
    	case 15300:
    	case 15301:
    	case 15302:
    	case 15303:
    	case 1452:
    	case 1453:
    	case 7980:
    	case 19748:
    	case 12681:
    	case 22989:
    	case 15086:
    	case 15088:
    	case 15090:
    	case 15092:
    	case 15094:
    	case 15096:
    	case 15100:
    	case 18268:
    	case 29898:
    	case 29899:
        case 23854:
        case 22300: 
        case 22298: 
	case 29999: 
	case 8995: 
	case 8956: 
	case 8952: 
	case 8991: 
	case 23030: 
	case 24317: 
	case 8864: 
	case 21486: 
	case 21484: 
	case 21485: 
	case 4509: 
	case 4510: 
	case 6618: 
	case 6625: 
			return false;
		default:
			return true;
		}
	}

}
