package com.rs.game.player.dialogues.impl;

import java.util.concurrent.TimeUnit;

import com.rs.engine.GameEngine;
import com.rs.game.WorldTile;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.content.FadingScreen;
import com.rs.game.player.content.Magic;
import com.rs.game.player.content.TeleportInterface;
import com.rs.game.player.controlers.RecipeforDisaster;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.Logger;


/**
 * 
 * @author Frostbite
 *
 *<contact@Frostbitersps@gmail.com><skype@Frostbitersps>
 */

public class FrostbiteTeleports extends Dialogue {


	public int npcId;
	
	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		sendNPCDialogue(npcId, NORMAL, "Hello " + player.getDisplayName() + ", where would you like to go?");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
		case -1:
			sendOptionsDialogue(DEFAULT, "Player vs. Monster Locations", "Dungeons and Rifts", "Training Locations", "Player vs. Player Locations", "More");
			stage = 1;
			/*sendOptionsDialogue(DEFAULT, "Priffidinas Teleports", "World Teleports");
			stage = 0;*/
			break;
			
		case 0:
			switch(componentId) {
			case OPTION_1:
				options(DEFAULT, "Seren Stones", "Priffidinas Chapple", "Back");
				stage = -3;
				break;
			case OPTION_2:
				player(ASKING, "World Teleports.");
				stage = -4;
				break;
			}
			break;
			
		case -3:
			switch(componentId) {
			case OPTION_1:
				teleport(2215, 3298, 1);
				break;
			case OPTION_2:
				teleport(2197, 3348, 1);
				break;
			case OPTION_3:
				sendOptionsDialogue(DEFAULT, "Priffidinas Teleports", "World Teleports");
				stage = 0;
				break;
			}
			break;
			
		case -4:
			sendOptionsDialogue(DEFAULT, "Player vs. Monster Locations", "Dungeons and Rifts", "Training Locations", "Player vs. Player Locations", "More");
			stage = 1;
			break;
			
		case 1:
			switch(componentId) {
			case OPTION_1:
				sendNPCDialogue(npcId, NORMAL, "Good Selection, Here you are!");
				stage = 2;
				break;
			case OPTION_2:
				sendNPCDialogue(npcId, NORMAL, "Good Selection, Here you are!");
				stage = 3; 
				break;
			case OPTION_3:
				sendNPCDialogue(npcId, NORMAL, "Good Selection, Here you are!");
				stage = 4;
				break;
			case OPTION_4:
				sendNPCDialogue(npcId, NORMAL, "Good Selection, Here you are!");
				stage = 5;
				break;
			case OPTION_5:
				sendOptionsDialogue(DEFAULT, "Minigames", "Skilling Minigames", "Overall Teleports", "I was just leaving, bye.");//TODO
				stage = 15;
				break;
			}
			break;

		case 2:
			sendOptionsDialogue("Player vs. Monster", "God Wars Dungeon", "Corporeal Beast", "Queen Black Dragon", "King Black Dragon", "More");
			stage = 6;
			break;

		case 3:
			sendOptionsDialogue("Dungeons and Rifts", "Pollniveach Slayer Dungeon", "Taverly Slayer Dungeon", "Brimhaven Dungeon", "Fremennik Slayer Cave", "More");
			stage = 9;
			break;

		case 4:
			sendOptionsDialogue("Training Locations", "Rock Crabs", "Yaks", "Experiments", "Armoured Zombies", "More");
			stage = 10;
			break;

		case 5:
			sendOptionsDialogue("Player vs. Player", "Edgeville", "East Dragons", "Multi", "Mage Bank", "More");
			stage = 13;
			break;

		case 6:
			switch(componentId) {
			case OPTION_1:
				sendOptionsDialogue(DEFAULT, "Armadyl's Eyrie", "Bando's Stronghold", "Zamorak's Fortress", "Saradomin's Encampment", "Ancient Prison");
				stage = 8;
				break;
			case OPTION_2:
				if(player.getSkills().getLevel(Skills.WOODCUTTING) >= 37 || player.getSkills().getLevel(Skills.SUMMONING) >= 23 || player.getSkills().getLevel(Skills.MINING) >= 45 || player.getSkills().getLevel(Skills.FIREMAKING)
				>= 47 || player.getSkills().getLevel(Skills.PRAYER) >= 55) {
					teleport(2885, 4372, 2);//Corporeal
				} else {
					sendDialogue("You need 37 Woodcutting, 23 Summoning, 45 Mining, 47 Firemaking, and 55 Prayer to enter the Corporeal Beast Lair.");
					stage = -2;
				}
				break;
			case OPTION_3:
				if (player.getSkills().getLevelForXp(Skills.SUMMONING) >= 60) {
					player.getControlerManager().startControler("QueenBlackDragonControler");
					close();
				} else {
					sendDialogue("You need atleast 60 Summoning to fight the Queen Black Dragon");
					stage = -2;
				}
				break;
			case OPTION_4:
				teleport(3069, 10255, 0);
				break;
			case OPTION_5:
				sendOptionsDialogue("Player vs. Monster", "Kalphite Queen", "Tormented Demons", "Dagannoth Kings", "More");
				stage = 7;
				break;
			}
			break;

		case 7:
			switch(componentId) {
			case OPTION_1:
				teleport(3507, 9494, 0);//KALPHITE
				break;
			case OPTION_2:
				teleport(2579, 5732, 0);//TDS
				break;
			case OPTION_3:
				teleport(2900, 4449, 0);//Dagannoth kings
				break;
			case OPTION_4:
				sendOptionsDialogue("Player vs. Monster", "God Wars Dungeon", "Corporeal Beast", "Queen Black Dragon", "King Black Dragon", "More");
				stage = 6;
				break;
			}
			break;

		case 8:
			switch(componentId) {
			case OPTION_1:
				teleport(2835, 5296, 0);//ARMADYL
				break;
			case OPTION_2:
				teleport(2865, 5354, 0);//BANDOS
				break;
			case OPTION_3:
				teleport(2925, 5330, 0);//ZAMORAK
				break;
			case OPTION_4:
				teleport(2923, 5255, 0);//SARADOMIN
				break;
			case OPTION_5:
				teleport(2905, 5204, 0);//ZAROS
				break;
			}
			break;

		case 9:
			switch(componentId) {
			case OPTION_1:
				teleport(3358, 9355, 0);//POLLNIVNEACH
				break;
			case OPTION_2:
				teleport(2884, 9797, 0);//TAVERLY
				break;
			case OPTION_3:
				teleport(2709, 9564, 0);//BRIMHAVEN
				break;
			case OPTION_4:
				teleport(2806, 10002, 0);//FREMENNIK
				break;
			case OPTION_5:
				sendOptionsDialogue(DEFAULT, "Ancient Caverns", "Jadinko Lair", "Glacor Cave", "Polypore Dungeon", "More");
				stage = 14;
				break;
			}
			break;

		case 10:
			switch(componentId) {
			case OPTION_1:
				sendOptionsDialogue(DEFAULT, "West Rellekka", "East Rellekka", "Waterbirth Island", "Back");
				stage = 11;
				break;
			case OPTION_2:
				teleport(2326, 3803, 0);//yaks
				break;
			case OPTION_3:
				teleport(3546, 9958, 0);//experiments
				break;
			case OPTION_4:
				teleport(3241, 9991, 0);//zombies
				break;
			case OPTION_5:
				sendOptionsDialogue(DEFAULT, "Jogres", "Bandits", "Chaos Dwarf Battlefield", "Ape Atoll", "Back");
				stage = 12;
				break;
			}
			break;

		case 11:
			switch(componentId) {
			case OPTION_1:
				teleport(2673, 3708, 0);//west
				break;
			case OPTION_2:
				teleport(2706, 3698, 0);//east
				break;
			case OPTION_3:
				teleport(2548, 3757, 0);//waterbirth
				break;
			case OPTION_4:
				sendOptionsDialogue("Training Locations", "Rock Crabs", "Pak Yaks", "Experiments", "Armoured Zombies", "More");
				stage = 10;
				break;
			}
			break;

		case 12:
			switch(componentId) {
			case OPTION_1:
				teleport(2830, 9522, 0);
				break;
			case OPTION_2:
				teleport(3166, 2983, 0);
				break;
			case OPTION_3:
				teleport(1520, 4704, 0);
				break;
			case OPTION_4:
				teleport(2798, 2793, 0);
				break;
			case OPTION_5:
				sendOptionsDialogue("Training Locations", "Rock Crabs", "Pak Yaks", "Experiments", "Armoured Zombies", "More");
				stage = 10;
				break;
			}
			break;

		case 13:
			switch(componentId) {
			case OPTION_1:
				teleport(3087, 3502, 0);//Edge
				break;
			case OPTION_2:
				teleport(3358, 3679, 0);//east
				player.getControlerManager().startControler("Wilderness");
				break;
			case OPTION_3:
				teleport(3141, 3637, 0);//multi
				player.getControlerManager().startControler("Wilderness");
				break;
			case OPTION_4:
				teleport(2539, 4716, 0);//mage bank
				break;
			case OPTION_5:
				sendOptionsDialogue(DEFAULT, "Forinthry Dungeon", "Back");
				stage = 19;
				break;
			}
			break;

		case 14:
			switch(componentId) {
			case OPTION_1:
				if(player.getSkills().getLevel(Skills.SLAYER) >= 50) {
					teleport(1735, 5312, 1);//polypore dung
				} else {
					sendDialogue("You need a slayer level of at least 50 before entering the Ancient Caverns.");
					stage = -2;
				}
				break;
			case OPTION_2:
				if(player.getSkills().getLevel(Skills.SLAYER) >= 91) {
					teleport(3012, 9275, 0);//jadinkos
				} else {
					sendDialogue("You need a Slayer level of 91 to enter the Jadinko Lair.");
					stage = -2;
				}
				break;
			case OPTION_3:
				if(player.getSkills().getLevel(Skills.SLAYER) >= 90) {
					teleport(4203, 5750, 0);
				} else {
					sendDialogue("You need a slayer level of 90 to access the Glacor Cave");
					stage = -2;
				}
				break;
			case OPTION_4:
				teleport(4621, 5458, 3);
				break;
			case OPTION_5:
				sendOptionsDialogue(DEFAULT, "Frost Dragons", "Ascension Dungeon", "Back");
				stage = 22;
				break;
			}
			break;

		case 15:
			switch(componentId) {
			case OPTION_1:
				sendNPCDialogue(npcId, NORMAL, "Good Selection, Here you are!");
				stage = 16;
				break;
			case OPTION_2:
				sendNPCDialogue(npcId, NORMAL, "Good Selection, Here you are!");
				stage = 20;
				break;
			case OPTION_3:
				close();
				TeleportInterface.openSelectSkill(player);
				break;
			case OPTION_4:
				sendPlayerDialogue(PLAIN_TALKING, "I was just leaving, bye.");
				stage = -2;
				break;
			}
			break;

		case 16:
			sendOptionsDialogue(DEFAULT, "Warrior's Guild", "TzHaar Fight Cave", "Fight Kiln", "Barrows", "More");
			stage = 17;
			break;

		case 17:
			switch(componentId) {
			case OPTION_1:
				if (player.getSkills().getLevelForXp(Skills.STRENGTH) + player.getSkills().getLevelForXp(Skills.ATTACK) < 130) {
					teleport(2876, 3542, 0);//warrior g
					player.getControlerManager().startControler("WGuildControler");
				} else {
					sendDialogue("You cannot enter the Warriors Guild");
					stage = -2;
				}
				break;
			case OPTION_2:
				teleport(4612, 5130, 0);//fight cave
				break;
			case OPTION_3:
				teleport(4744, 5169, 0);//fight kiln
				break;
			case OPTION_4:
				teleport(3565, 3310, 0);// barrows
				break;
			case OPTION_5:
				sendOptionsDialogue(DEFAULT, "Duel Arena", "Castle Wars", "Pest Control", "Soul Wars", "More");
				stage = 18;
				break;
			}
			break;

		case 18:
			switch(componentId) {
			case OPTION_1:
				teleport(3366, 3268, 0);// duel
				break;
			case OPTION_2:
				teleport(2448, 3090, 0);//cw
				break;
			case OPTION_3:
				teleport(2651, 2676, 0);//pest c
				break;
			case OPTION_4:
				teleport(3081, 3476, 0);//soul wars
				break;
			case OPTION_5:
				sendOptionsDialogue(DEFAULT, "Clan Wars", "Recipe for Disaster", "Dominion Tower", "Back");
				stage = 23;
				break;
			}
			break;

		case 19:
			switch(componentId) {
			case OPTION_1:
				teleport(3077, 10058, 0);
				player.getControlerManager().startControler("Wilderness");
				break;
			case OPTION_2:
				sendOptionsDialogue(DEFAULT, "Player vs. Monster Locations", "Dungeons and Rifts", "Training Locations", "Player vs. Player Locations", "I was just leaving, bye.");
				stage = 1;
				break;
			}
			break;

		case 20:
			sendOptionsDialogue(DEFAULT, "Puro Puro", "Runespan", "Livid Farm", "Nevermind.");
			stage = 21;
			break;

		case 21:
			switch(componentId) {
			case OPTION_1:
				close();
				player.getControlerManager().startControler("PuroPuro");
				break;
			case OPTION_2:
				teleport(3102, 3155, 3);
				break;
			case OPTION_3:
				teleport(2111, 3938, 0);
				break;
			case OPTION_4:
				sendPlayerDialogue(UNSURE, "Nevermind.");
				stage = -2;
				break;
			}
			break;

		case 22:
			switch(componentId) {
			case OPTION_1:
				if(player.getSkills().getLevel(Skills.DUNGEONEERING) >= 85) {
					Magic.resourcesTeleport(player, 1297, 4510, 0);
					stage = -2;
				} else {
					player.getDialogueManager().startDialogue("SimpleMessage", "You need a Dungeoneering level of 85 to enter this resource dungeon.");
					stage = -2;
				}
				break;
			case OPTION_2:
				if(player.getSkills().getLevel(Skills.SLAYER) < 91) {
					player.getPackets().sendGameMessage("You need a Slayer level of at least 91 to enter the Ascension Dungeon.");
					return;
				}
				teleport(1095, 580, 1);
				break;
			case OPTION_3:
				sendOptionsDialogue(DEFAULT, "Player vs. Monster Locations", "Dungeons and Rifts", "Training Locations", "Player vs. Player Locations", "More");
				stage = 1;
				break;
			}
			break;
			
		case 23:
			switch(componentId) {
			case OPTION_1:
				teleport(2992, 9679, 0);
				break;
			case OPTION_2:
				RecipeforDisaster.enterRfd(player);
				break;
			case OPTION_3:
				teleport(3743, 6422, 0);
				break;
			case OPTION_4:
				sendOptionsDialogue(DEFAULT, "Warrior's Guild", "TzHaar Fight Cave", "Fight Kiln", "Barrows", "More");
				stage = 17;
				break;
			}
			break;

		case -2:
			close();
			break;


		default:
			close();
			break;
		}
	}

	@Override
	public void finish() {

	}

	public static void fade(final Player player) {
		final long time = FadingScreen.fade(player);
		GameEngine.slowExecutor.schedule(new Runnable() {
			@Override
			public void run() {
				try {
					FadingScreen.unfade(player, time, new Runnable() {
						@Override
						public void run() {
							player.lock(3);
						}
					});
				} catch (Throwable e) {
					Logger.handle(e);
				}
			}

		}, 3, TimeUnit.SECONDS);
	}


	public void teleport(int x, int y, int h) {
		fade(player);
		Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(x, y, h));
		close();
	}

}
