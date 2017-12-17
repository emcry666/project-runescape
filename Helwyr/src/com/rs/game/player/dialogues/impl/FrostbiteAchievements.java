package com.rs.game.player.dialogues.impl;

import com.rs.cache.loaders.Configs;
import com.rs.game.World;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.content.ItemConstants;
import com.rs.game.player.content.RequirementsManager;
import com.rs.game.player.dialogues.Dialogue;

/**
 * 
 * @author Frostbite
 *
 *<contact@Frostbitersps@gmail.com><skype@Frostbitersps>
 */

public class FrostbiteAchievements extends Dialogue {

	public static String FORMAT = "[<col=DE8C21>" + Configs.SERVER_NAME + " Achievement</col>] - <col=DE8C21>You have ";
	public static String WORLD_FORMAT = "[<col=DE8C21>" + Configs.SERVER_NAME + " Achievement</col>] - <col=DE8C21>";
	public static String COLOR = "<col=DE8C21>";

	public int achievementItems[] = {
			/**
			 * Firemaking
			 */
			13661,
			13660,
			13659,
			/**
			 * Black Ibis
			 */
			21480,
			21481,
			21482,
			21483
	};

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		npc(HAPPY, "Good day " + player.getDisplayName() + "</col>, What can I do for you?");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
		case -1:
			options(DEFAULT, "Who are you?", "Can you retrieve my achievement items?", "Talk about Achievement Announcement", "Talk about Achievements", "Skillcape Shop");
			stage = 1;
			break;

		case 1:
			switch(componentId) {
			case OPTION_1:
				npc(PLAIN_TALKING, "Who am I? Why I am the Frostbite Achievement Master",
						"You can retrieve lost earned valuables earned from achievements",
						"tasks, and events!");
				stage = 5;
				break;
			case OPTION_2:
				npc(HAPPY, "Sure! Give me a moment...");
				stage = 6;
				break;

			case OPTION_3:
				npc(HAPPY, "Ahh yes, The Achievement Announcement allows you to enable and disable",
						"your achievement messages and others achievement completions.");
				stage = 2;
				break;
			case OPTION_4:
				npc(HAPPY, "What would you like to know about them?");
				stage = 7;
				break;
			case OPTION_5:
				close();
				player.getDialogueManager().startDialogue("SkillcapeShop", npcId);
				break;
			}
			break;

		case 2:
			npc(ASKING, "Would you like to enable your Achievement Announcements?");
			stage = 3;
			break;

		case 3:
			options(DEFAULT, "Yes, Enable them", "No, Disable them");
			stage = 4;
			break;

		case 4:
			switch(componentId) {
			case OPTION_1:
				player.setAchievementAnnouncement(true);
				player.sm("<col=DE8C21>Your Achievement Announcements have been turned</col><col=269C0E> on</col>.");
				close();
				break;
			case OPTION_2:
				player.setAchievementAnnouncement(false);
				player.sm("<col=DE8C21>Your Achievement Announcements have been turned</col><col=FF0000> off</col>.");
				close();
				break;
			}
			break;

		case 5:
			player(UNSURE, "Thanks.. I'll keep that in mind.");
			stage = -2;
			break;

		case 6:
			checkPlayer(player);
			close();
			break;

		case 7:
			options(DEFAULT, "Check current completionist requirements", "Check current trimmed completionist requirements", "Max Cape", "Nevermind... I forgot.");
			stage = 8;
			break;

		case 8:
			switch(componentId) {
			case OPTION_1:
				npc(HAPPY, "No problem " + player.getDisplayName() + "</col>, Here you are!");
				stage = -3;
				break;
			case OPTION_2:
				npc(HAPPY, "No problem " + player.getDisplayName() + "</col>, Here you are!");
				stage = -4;
				break;
			case OPTION_3:
				if (player.getSkills().getLevelForXp(Skills.ATTACK) >= 99
				&& player.getSkills().getLevelForXp(Skills.STRENGTH) >= 99
				&& player.getSkills().getLevelForXp(Skills.DEFENCE) >= 99
				&& player.getSkills().getLevelForXp(Skills.CONSTRUCTION) >= 99
				&& player.getSkills().getLevelForXp(Skills.HITPOINTS) >= 99
				&& player.getSkills().getLevelForXp(Skills.RANGE) >= 99
				&& player.getSkills().getLevelForXp(Skills.MAGIC) >= 99
				&& player.getSkills().getLevelForXp(Skills.RUNECRAFTING) >= 99
				&& player.getSkills().getLevelForXp(Skills.FISHING) >= 99
				&& player.getSkills().getLevelForXp(Skills.AGILITY) >= 99
				&& player.getSkills().getLevelForXp(Skills.COOKING) >= 99
				&& player.getSkills().getLevelForXp(Skills.PRAYER) >= 99
				&& player.getSkills().getLevelForXp(Skills.THIEVING) >= 99
				&& player.getSkills().getLevelForXp(Skills.DUNGEONEERING) >= 99
				&& player.getSkills().getLevelForXp(Skills.MINING) >= 99
				&& player.getSkills().getLevelForXp(Skills.SMITHING) >= 99
				&& player.getSkills().getLevelForXp(Skills.SUMMONING) >= 99
				&& player.getSkills().getLevelForXp(Skills.FARMING) >= 99
				&& player.getSkills().getLevelForXp(Skills.DUNGEONEERING) >= 99
				&& player.getSkills().getLevelForXp(Skills.HUNTER) >= 99
				&& player.getSkills().getLevelForXp(Skills.SLAYER) >= 99
				&& player.getSkills().getLevelForXp(Skills.CRAFTING) >= 99
				&& player.getSkills().getLevelForXp(Skills.WOODCUTTING) >= 99
				&& player.getSkills().getLevelForXp(Skills.FIREMAKING) >= 99
				&& player.getSkills().getLevelForXp(Skills.FLETCHING) >= 99
				&& player.getSkills().getLevelForXp(Skills.HERBLORE) >= 99) {
					if(player.getInventory().getFreeSlots() < 2) {
						return;
					} else {
						if(player.getMoneyPouch().getCoinsAmount() >= 5000000) {
							npc(HAPPY, "This cape will cost you 5M in coins, Would you like to purchase it?");
							stage = 9;
						} else {
							npc(SAD, "You do not have enough coins.");
							stage = -2;
						}
					}
				} else {
					npc(SAD, "You do not have the requirements for this cape..");
					stage = -2;
				}
				break;
			case OPTION_4:
				player(UNSURE, "Nevermind.. I forgot");
				stage = -2;
				break;
			}
			break;
			
		case 9:
			options(DEFAULT, "Yes", "No i would not like to");
			stage = 10;
			break;
			
		case 10:
			switch(componentId) {
			case OPTION_1:
				if(player.getMoneyPouch().getCoinsAmount() >= 5000000) {
					player.getMoneyPouch().removeFromMoneyPouch(5000000);
					if(player.getInventory().getFreeSlots() >= 2) {
						player.getInventory().addItem(20767, 1);
						player.getInventory().addItem(20751, 1);
					} else {
						player.getBank().addItem(20767, 1, false);
						player.getBank().addItem(20751, 1, false);
					}
				}
				player.getPackets().sendGameMessage("You have purchased a max cape, and it has been sent to your " + (player.getInventory().getFreeSlots() < 2 ? "inventory" : "bank") + ".");
				break;
			case OPTION_2:
				player(NORMAL, "No i would not like to");
				stage = -2;
				break;
			}
			break;


		case -2:
			close();
			break;

		case -3:
			close();
			RequirementsManager.requirementsCompCape(player);
			break;

		case -4:
			close();
			RequirementsManager.requirementsTrimmedCompCape(player);
			break;

		default:
			close();
			break;
		}
	}

	public static void checkPlayer(Player player) {
		handleBarbarianAgility(player);
		handleCooking(player);
		handleFiremaking(player);
		handleFishing(player);
		handleGnomeAgility(player);
		handleMining(player);
		handleThieving(player);
		handleWoodcutting(player);
		player.getPackets().sendGameMessage("You appear to have been successfully checked for achievement equipment.");
	}


	/**
	 * @handles mining
	 * @param player
	 */

	public static void handleMining(Player player) {

		/**
		 * Golden mining boots
		 */
		if(player.getGoldOreMined() >= 300) {
			if(!ItemConstants.hasItem(player, 20788)) {
				if(player.getInventory().getFreeSlots() < 1) {
					player.getPackets().sendGameMessage(COLOR + "Golden mining boots has been added into your bank!</col>");
					player.getBank().addItem(20788, 1, false);
				} else {
					player.getInventory().addItem(20788, 1);
				}
				if(player.claimedGoldSuit == 0) {
					World.sendWorldMessage(WORLD_FORMAT + player.getDisplayName() + " has just earned Golden mining boots!", false);
				}
				player.claimedGoldSuit = 1;
			}
		}

		/**
		 * Golden mining trousers
		 */
		if(player.getGoldOreMined() >= 650) {
			if(!ItemConstants.hasItem(player, 20790)) {
				if(player.getInventory().getFreeSlots() < 1) {
					player.getPackets().sendGameMessage(COLOR + "Golden mining trousers has been added into your bank!</col>");
					player.getBank().addItem(20790, 1, false);
				} else {
					player.getInventory().addItem(20790, 1);
				}
				if(player.claimedGoldSuit == 1) {
					World.sendWorldMessage(WORLD_FORMAT + player.getDisplayName() + " has just earned Golden mining trousers!", false);
				}
				player.claimedGoldSuit = 2;
			}
		}
		/**
		 * Golden mining top
		 */
		if(player.getGoldOreMined() >= 975) {
			if(!ItemConstants.hasItem(player, 20791)) {
				if(player.getInventory().getFreeSlots() < 1) {
					player.getPackets().sendGameMessage(COLOR + "Golden mining top has been added into your bank!</col>");
					player.getBank().addItem(20791, 1, false);
				} else {
					player.getInventory().addItem(20791, 1);
				}
				if(player.claimedGoldSuit == 2) {
					World.sendWorldMessage(WORLD_FORMAT + player.getDisplayName() + " has just earned Golden mining top!", false);
				}
				player.claimedGoldSuit = 3;
			}
		}

		/**
		 * Golden mining helmet
		 */
		if(player.getGoldOreMined() >= 1325) {
			if(!ItemConstants.hasItem(player, 20789)) {
				if(player.getInventory().getFreeSlots() < 1) {
					player.getPackets().sendGameMessage(COLOR + "Golden mining helment has been added into your bank!</col>");
					player.getBank().addItem(20789, 1, false);
				} else {
					player.getInventory().addItem(20789, 1);
				}
				if(player.claimedGoldSuit == 3) {
					World.sendWorldMessage(WORLD_FORMAT + player.getDisplayName() + " has just earned Golden mining helment!", false);
				}
				player.claimedGoldSuit = 4;
			}
		}
	}

		/**
		 * @handles firemaking
		 * @param player
		 */

		public static void handleFiremaking(Player player) {

			/**
			 * Ring of fire
			 */
			if(player.getMagicLogsBurned() >= 750) {
				if(!ItemConstants.hasItem(player, 13659)) {
					if(player.getInventory().getFreeSlots() < 1) {
						player.getPackets().sendGameMessage(COLOR + "Ring of Fire has been added into your bank!</col>");
						player.getBank().addItem(13659, 1, false);
					} else {
						player.getInventory().addItem(13659, 1);
					}
					if(player.claimedRingofFire == false) {
						World.sendWorldMessage(WORLD_FORMAT + player.getDisplayName() + " has just earned Ring of Fire!", false);
					}
					player.claimedRingofFire = true;
				}
			}

			/**
			 * Flame gloves
			 */
			if(player.getMagicLogsBurned() >= 1850) {
				if(!ItemConstants.hasItem(player, 13660)) {
					if(player.getInventory().getFreeSlots() < 1) {
						player.getPackets().sendGameMessage(COLOR + "Flame gloves has been added into your bank!</col>");
						player.getBank().addItem(13660, 1, false);
					} else {
						player.getInventory().addItem(13660, 1);
					}
					if(player.claimedFlameGloves == false) {
						World.sendWorldMessage(WORLD_FORMAT + player.getDisplayName() + " has just earned Flame gloves!", false);
					}
					player.claimedFlameGloves = true;
				}
			}

			/**
			 * Inferno adze
			 */
			if(player.getMagicLogsBurned() >= 3500) {
				if(!ItemConstants.hasItem(player, 13661)) {
					if(player.getInventory().getFreeSlots() < 1) {
						player.getPackets().sendGameMessage(COLOR + "Inferno adze has been added into your bank!</col>");
						player.getBank().addItem(13661, 1, false);
					} else {
						player.getInventory().addItem(13661, 1);
					}
					if(player.getAdzeObtained() == false) {
						World.sendWorldMessage(WORLD_FORMAT + player.getDisplayName() + " has just earned Inferno adze!", false);
					}
					player.adzeObtained = true;
				}
			}

		}

		/**
		 * @handles woodcutting
		 * @param player
		 */

		public static void handleWoodcutting(Player player) {

			/**
			 * Lumberjack boots
			 */
			if(player.getCompletedYewsCut() >= 300) {
				if(!ItemConstants.hasItem(player, 10933)) {
					if(player.getInventory().getFreeSlots() < 1) {
						player.getPackets().sendGameMessage(COLOR + "Lumberjack boots has been added into your bank!</col>");
						player.getBank().addItem(10933, 1, false);
					} else {
						player.getInventory().addItem(10933, 1);
					}
					if(player.claimedLumberJackSuit == 0) {
						World.sendWorldMessage(WORLD_FORMAT + player.getDisplayName() + " has just earned Lumberjack boots!", false);
					}
					player.claimedLumberJackSuit = 1;
				}
			}

			/**
			 * Lumberjack legs
			 */
			if(player.getCompletedYewsCut() >= 650) {
				if(!ItemConstants.hasItem(player, 10940)) {
					if(player.getInventory().getFreeSlots() < 1) {
						player.getPackets().sendGameMessage(COLOR + "Lumberjack legs has been added into your bank!</col>");
						player.getBank().addItem(10940, 1, false);
					} else {
						player.getInventory().addItem(10940, 1);
					}
					if(player.claimedLumberJackSuit == 1) {
						World.sendWorldMessage(WORLD_FORMAT + player.getDisplayName() + " has just earned Lumberjack legs!", false);
					}
					player.claimedLumberJackSuit = 2;
				}
			}

			/**
			 * Lumberjack top
			 */
			if(player.getCompletedYewsCut() >= 1075) {
				if(!ItemConstants.hasItem(player, 10939)) {
					if(player.getInventory().getFreeSlots() < 1) {
						player.getPackets().sendGameMessage(COLOR + "Lumberjack top has been added into your bank!</col>");
						player.getBank().addItem(10939, 1, false);
					} else {
						player.getInventory().addItem(10939, 1);
					}
					if(player.claimedLumberJackSuit == 2) {
						World.sendWorldMessage(WORLD_FORMAT + player.getDisplayName() + " has just earned Lumberjack top!", false);
					}
					player.claimedLumberJackSuit = 3;
				}
			}

			/**
			 * Lumberjack hat
			 */
			if(player.getCompletedYewsCut() >= 1450) {
				if(!ItemConstants.hasItem(player, 10941)) {
					if(player.getInventory().getFreeSlots() < 1) {
						player.getPackets().sendGameMessage(COLOR + "Lumberjack hat has been added into your bank!</col>");
						player.getBank().addItem(10941, 1, false);
					} else {
						player.getInventory().addItem(10941, 1);
					}
					if(player.claimedLumberJackSuit == 3) {
						World.sendWorldMessage(WORLD_FORMAT + player.getDisplayName() + " has just earned Lumberjack hat!", false);
					}
					player.claimedLumberJackSuit = 4;
				}
			}

		}

		/**
		 * @handles fishing
		 * @param player
		 */

		public static void handleFishing(Player player) {

			/**
			 * Fishing boots
			 */
			if(player.getCompletedRockTailsFished() >= 300) {
				if(!ItemConstants.hasItem(player, 24430)) {
					if(player.getInventory().getFreeSlots() < 1) {
						player.getPackets().sendGameMessage(COLOR + "Fishing boots has been added into your bank!</col>");
						player.getBank().addItem(24426, 1, false);
					} else {
						player.getInventory().addItem(24430, 1);
					}
					if(player.claimedFishingOutfit == 0) {
						World.sendWorldMessage(WORLD_FORMAT + player.getDisplayName() + " has just earned Fishing boots!", false);
					}
					player.claimedFishingOutfit = 1;
				}
			}

			/**
			 * Fishing Waders
			 */
			if(player.getCompletedRockTailsFished() >= 650) {
				if(!ItemConstants.hasItem(player, 24429)) {
					if(player.getInventory().getFreeSlots() < 1) {
						player.getPackets().sendGameMessage(COLOR + "Fishing waders has been added into your bank!</col>");
						player.getBank().addItem(24429, 1, false);
					} else {
						player.getInventory().addItem(24429, 1);
					}
					if(player.claimedFishingOutfit == 1) {
						World.sendWorldMessage(WORLD_FORMAT + player.getDisplayName() + " has just earned Fishing waders!", false);
					}
					player.claimedFishingOutfit = 2;
				}
			}

			/**
			 * Fishing jacket
			 */
			if(player.getCompletedRockTailsFished() >= 1075) {
				if(!ItemConstants.hasItem(player, 24428)) {
					if(player.getInventory().getFreeSlots() < 1) {
						player.getPackets().sendGameMessage(COLOR + "Fishing jacket has been added into your bank!</col>");
						player.getBank().addItem(24428, 1, false);
					} else {
						player.getInventory().addItem(24428, 1);
					}
					if(player.claimedFishingOutfit == 2) {
						World.sendWorldMessage(WORLD_FORMAT + player.getDisplayName() + " has just earned Fishing jacket!", false);
					}
					player.claimedFishingOutfit = 3;
				}
			}
			/**
			 * Fishing hat
			 */
			if(player.getCompletedRockTailsFished() >= 1450) {
				if(!ItemConstants.hasItem(player, 24427)) {
					if(player.getInventory().getFreeSlots() < 1) {
						player.getPackets().sendGameMessage(COLOR + "Fishing hat has been added into your bank!</col>");
						player.getBank().addItem(24427, 1, false);
					} else {
						player.getInventory().addItem(24427, 1);
					}
					if(player.claimedFishingOutfit == 3) {
						World.sendWorldMessage(WORLD_FORMAT + player.getDisplayName() + " has just earned Fishing hat!", false);
					}
					player.claimedFishingOutfit = 4;
				}
			}

		}

		/**
		 * @handles barbarianAgility
		 * @param player
		 */

		public static void handleBarbarianAgility(Player player) {
			/**
			 * Agile legs
			 */
			if(player.getBarbarianAdvancedLaps() >= 150) {
				if(!ItemConstants.hasItem(player, 14938)) {
					if(player.getInventory().getFreeSlots() < 1) {
						player.getPackets().sendGameMessage(COLOR + "Agile legs has been added into your bank!</col>");
						player.getBank().addItem(14938, 1, false);
					} else {
						player.getInventory().addItem(14938, 1);
					}
					if(player.claimedAgileLegs == false) {
						World.sendWorldMessage(WORLD_FORMAT + player.getDisplayName() + " has just earned Agile Legs!", false);
					}
					player.claimedAgileLegs = true;
				}
			}

		}

		/**
		 * @handles GnomeAgility
		 * @param player
		 */

		public static void handleGnomeAgility(Player player) {
			/**
			 * Agile top
			 */
			if(player.getGnomeAdvancedLaps() >= 150) {
				if(!ItemConstants.hasItem(player, 14936)) {
					if(player.getInventory().getFreeSlots() < 1) {
						player.getPackets().sendGameMessage(COLOR + "Agile tops has been added into your bank!</col>");
						player.getBank().addItem(14936, 1, false);
					} else {
						player.getInventory().addItem(14936, 1);
					}
					if(player.claimedAgileTop == false) {
						World.sendWorldMessage(WORLD_FORMAT + player.getDisplayName() + " has just earned Agile Top!", false);
					}
					player.claimedAgileTop = true;
				}
			}

		}

		/**
		 * @handles Cooking
		 * @param player
		 */

		public static void handleCooking(Player player) {
			/**
			 * Cooking gauntlets
			 */
			if(player.getCookedRocktailSuccessfully() >= 500) {
				if(!ItemConstants.hasItem(player, 775)) {
					if(player.getInventory().getFreeSlots() < 1) {
						player.getPackets().sendGameMessage(COLOR + "Cooking gauntlets has been added into your bank!</col>");
						player.getBank().addItem(775, 1, false);
					} else {
						player.getInventory().addItem(775, 1);
					}
					if(player.claimedCookingGauntlets == false) {
						World.sendWorldMessage(WORLD_FORMAT + player.getDisplayName() + " has just earned Cooking gauntlets!", false);
					}
				}
			}

		}

		/**
		 * @handles thieving
		 * @param player
		 * 
		 * 
		 */

		public static void handleThieving(Player player) {
			/**
			 * Black ibis boots
			 */
			if(player.getCompletedSuccessfulThievs() >= 300) {
				if(!ItemConstants.hasItem(player, 21483)) {
					if(player.getInventory().getFreeSlots() < 1) {
						player.getPackets().sendGameMessage(COLOR + "Black ibis boots has been added into your bank!</col>");
						player.getBank().addItem(21483, 1, false);
					} else {
						player.getInventory().addItem(21483, 1);
					}
					if(player.claimedBlackIbis == 0) {
						World.sendWorldMessage(WORLD_FORMAT + player.getDisplayName() + " has just earned Black ibis boots!", false);
					}
					player.claimedBlackIbis = 1;
				}
			}

			/**
			 * Black ibis legs
			 */
			if(player.getCompletedSuccessfulThievs() >= 600) {
				if(!ItemConstants.hasItem(player, 21481)) {
					if(player.getInventory().getFreeSlots() < 1) {
						player.getPackets().sendGameMessage(COLOR + "Black ibis legs has been added into your bank!</col>");
						player.getBank().addItem(21481, 1, false);
					} else {
						player.getInventory().addItem(21481, 1);
					}
					if(player.claimedBlackIbis == 1) {
						World.sendWorldMessage(WORLD_FORMAT + player.getDisplayName() + " has just earned Black ibis legs!", false);
					}
					player.claimedBlackIbis = 2;
				}
			}

			/**
			 * Black ibis body
			 */
			if(player.getCompletedSuccessfulThievs() >= 900) {
				if(!ItemConstants.hasItem(player, 21480)) {
					if(player.getInventory().getFreeSlots() < 1) {
						player.getPackets().sendGameMessage(COLOR + "Black ibis body has been added into your bank!</col>");
						player.getBank().addItem(21480, 1, false);

					} else {
						player.getInventory().addItem(21480, 1);
					}
					if(player.claimedBlackIbis == 2) {
						World.sendWorldMessage(WORLD_FORMAT + player.getDisplayName() + " has just earned Black ibis body!", false);
					}
					player.claimedBlackIbis = 3;
				}
			}

			/**
			 * Black ibis mask
			 */
			if(player.getCompletedSuccessfulThievs() >= 1150) {
				if(!ItemConstants.hasItem(player, 21482)) {
					if(player.getInventory().getFreeSlots() < 1) {
						player.getPackets().sendGameMessage(COLOR + "Black ibis boots has been added into your bank!</col>");
						player.getBank().addItem(21482, 1, false);
					} else {
						player.getInventory().addItem(21482, 1);
					}
					if(player.claimedBlackIbis == 3) {
						World.sendWorldMessage(WORLD_FORMAT + player.getDisplayName() + " has just earned Black ibis mask!", false);
					}
					player.claimedBlackIbis = 4;
					}
				}
			}
			
			
			/**
			 * @handles thieving
			 * @param player
			 * 
			 * 
			 */

			public static void handleFarming(Player player) {
				/**
				 * Witchdoctor legs
				 */
				if(player.getCompletedSuccessfulThievs() >= 500) {
					if(!ItemConstants.hasItem(player, 20045)) {
						if(player.getInventory().getFreeSlots() < 1) {
							player.getPackets().sendGameMessage(COLOR + "Witchdoctor legs has been added into your bank!</col>");
							player.getBank().addItem(20045, 1, false);
						} else {
							player.getInventory().addItem(20045, 1);
						}
						if(player.claimedWitchDoctor == 0) {
							World.sendWorldMessage(WORLD_FORMAT + player.getDisplayName() + " has just earned Witchdoctor legs!", false);
						}
						player.claimedWitchDoctor = 1;
					}
				}

				/**
				 * Witchdoctor top
				 */
				if(player.getCompletedSuccessfulThievs() >= 1000) {
					if(!ItemConstants.hasItem(player, 20044)) {
						if(player.getInventory().getFreeSlots() < 1) {
							player.getPackets().sendGameMessage(COLOR + "Witchdoctor robes has been added into your bank!</col>");
							player.getBank().addItem(20044, 1, false);
						} else {
							player.getInventory().addItem(20044, 1);
						}
						if(player.claimedWitchDoctor == 1) {
							World.sendWorldMessage(WORLD_FORMAT + player.getDisplayName() + " has just earned Witchdoctor robes!", false);
						}
						player.claimedWitchDoctor = 2;
					}
				}

				/**
				 * Witchdoctor mask
				 */
				if(player.getCompletedSuccessfulThievs() >= 1500) {
					if(!ItemConstants.hasItem(player, 20046)) {
						if(player.getInventory().getFreeSlots() < 1) {
							player.getPackets().sendGameMessage(COLOR + "Witchdoctor mask has been added into your bank!</col>");
							player.getBank().addItem(20046, 1, false);

						} else {
							player.getInventory().addItem(20046, 1);
						}
						if(player.claimedWitchDoctor == 2) {
							World.sendWorldMessage(WORLD_FORMAT + player.getDisplayName() + " has just earned Witchdoctor mask!", false);
						}
						player.claimedWitchDoctor = 3;
					}
				}
			}

		@Override
		public void finish() {

		}

	}
