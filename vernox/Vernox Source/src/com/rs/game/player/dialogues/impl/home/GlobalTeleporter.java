package com.rs.game.player.dialogues.impl.home;

import com.rs.game.WorldTile;
import com.rs.game.player.Skills;
import com.rs.game.player.content.Magic;
import com.rs.game.player.dialogues.Dialogue;

/**
 * 
 * @author Dylan Doldersum || Mystic Wolf
 * Mar 29, 2016
 */
public class GlobalTeleporter extends Dialogue {
	private int npcId;

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		sendNPCDialogue(npcId, 9827, "Hello, I can teleport you around Vernox."
				+ "<br>Would you like to?");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (stage == -1)
		{
			sendOptionsDialogue("Would you like to?", "Yes, I would like to travel around Vernox", "I would like to have a teleport crystal", "Naw, I'm not interested");
			stage = 1;
		}
		else if(stage == 1)
		{
			if(componentId== OPTION_1)
			{
				sendOptionsDialogue("Where would you like to go?", "Training", "Skilling", "Dungeons", "Bosses", "Next Page");
				stage = 2;
			}
			else if (componentId == OPTION_2)
			{
			    if(player.getInventory().hasFreeSlots()) {
			    player.getInventory().addItem(6099, 1);
				player.sendMessage("The teleport crystal is added to your inventory.");
			    } else {
				player.getBank().addItem(6099, 1, true);
				player.sendMessage("The teleport crystal is added to your bank.");
			    }
			    end();
			}
			else if (componentId == OPTION_3)
			{
				player.closeInterfaces();
				end();
			}
		}
		else if(stage == 2)
		{
			if (componentId == OPTION_1)
			{
				sendOptionsDialogue("Training areas", "Rock crabs", "Cows", "Yaks", "Goblins", "Next Page");
				stage = 3;
			}
			else if(componentId == OPTION_2)
			{
				sendOptionsDialogue("Skilling areas", "Fishing", "Mining", "Woodcutting", "Agility", "Next Page");
				stage = 4;
			}
			else if(componentId == OPTION_3)
			{
				sendOptionsDialogue("Dungeons", "Taverley Dungeon", "Brimhaven Dungeon", "Fremmenik Dungeon", "Ancient Cavern", "Next page");
				stage = 5;
			}
			else if(componentId == OPTION_4)
			{
				sendOptionsDialogue("Bosses", "God Wars Dungeon", "Kalphite Queen", "King black dragon", "Queen black dragon", "Next Page");
				stage = 6;
			}
			else if(componentId == OPTION_5)
			{	
				sendOptionsDialogue("Where would you like to go?", "Slayer", "PK Areas", "Minigames");
				stage = 7;
			}
		}
		else if (stage == 3)
		{
		    if (componentId == OPTION_1)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(2673, 3709, 0));//cows
			}
			else if (componentId == OPTION_2)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(3258, 3274, 0));//cows
			}
			else if (componentId == OPTION_3)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(2324, 3796, 0));//yaks
			}
			else if (componentId == OPTION_4)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(3259, 3228, 0));//goblins
			}
			else if(componentId == OPTION_5)
			{
				sendOptionsDialogue("Training Areas", "Trolls", "Kalphites", "Tortoises");
				stage = 30;
			}
		}
		else if (stage == 4)
		{
			if (componentId == OPTION_1)
			{
				sendOptionsDialogue("Fishing areas", "Draynor Fishing", "Catherby Fishing", "Fishing Guild", "Living rock caverns");
				stage = 8;
			}
			else if (componentId == OPTION_2)
			{
				sendOptionsDialogue("Mining areas", "Varrock mine", "Al-kharid mine", "Dwarven mine", "Rune Essence Mine");
				stage = 9;
			}
			else if (componentId == OPTION_3)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(2726, 3485, 0));
			}
			else if (componentId == OPTION_4)
			{
				sendOptionsDialogue("Agility Areas", "Gnome Agility", "Barbarian Agility", "Wilderness Agility");
				stage = 10;
			}
			else if (componentId == OPTION_5)
			{
				sendOptionsDialogue("Skilling Teleports", "Dungeoneering", "Divination", "Farming", "Summoning");
				stage = 12;
			}
		}
		else if (stage == 5)
		{
			if (componentId == OPTION_1)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(2885, 9798, 0));
			}
			else if (componentId == OPTION_2)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(2745, 3152, 0));
			}
			else if (componentId == OPTION_3)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(2806, 10002, 0));
			}
			else if (componentId == OPTION_4)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(1763, 5365, 1));
			}
			else if(componentId == OPTION_5)
			{
				sendOptionsDialogue("Dungeons", "Forinthry Dungeon", "Moss Le'Harmless", "Skeletal Wyvern Dungeon", "Polypore Dungeon", "Next Page");
				stage = 11;
			}
		}
		else if (stage == 6)
		{
			if (componentId == OPTION_1)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(2907, 3708, 0));//godwars
			}
			else if (componentId == OPTION_2)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(3233, 2858, 0));
			}
			else if (componentId == OPTION_3)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(3051, 3519, 0));
			}
			else if (componentId == OPTION_4)
			{
				end();
				if (player.getSkills().getLevelForXp(Skills.SUMMONING) < 60) 
				{
					player.getPackets().sendGameMessage("You need a summoning level of 60 to go through this portal.");
					return;
				}
				player.getControlerManager().startControler("QueenBlackDragonControler");
			}
			else if (componentId == OPTION_5)
			{
				sendOptionsDialogue("Bosses", "Corporal Beast", "Tormented Demons", "Wilderness Wyrm", "Dagganoth Kings", "Next Page");
				stage = 23;
			}
				
		}
		else if (stage == 7)
		{
			if (componentId == OPTION_1)
			{
				sendOptionsDialogue("Slayer", "Slayer Masters", "Slayer Tower");
				stage = 33;
			}
			else if (componentId == OPTION_2)
			{
				sendOptionsDialogue("PK Areas", "Edgeville", "Wests", "Easts", "Mage Bank", "Chaos Elemental");
				stage = 26;
			}
			else if (componentId == OPTION_3)
			{
			    sendOptionsDialogue("Minigames", "Pest Control", "Barrows", "Duel Arena", "Fight Pits", "Next Page");
			    stage = 28;
			}
		}
		else if (stage == 8)
		{
			if (componentId == OPTION_1)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(3089, 3230, 0));
			}
			else if (componentId == OPTION_2)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(2835, 3435, 0));
			}
			else if (componentId == OPTION_3)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(2593, 3420, 0));
			}
			else if (componentId == OPTION_4)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(3015, 9832, 0));
			}
		}
		else if (stage == 9)
		{
			if (componentId == OPTION_1)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(3284, 3365, 0));
			}
			else if (componentId == OPTION_2)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(3299, 3311, 0));
			}
			else if (componentId == OPTION_3)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(3058, 9776, 0));
			}
			else if (componentId == OPTION_4)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(2910, 4835, 0));
			}

		}
		else if (stage == 10)
		{
			if (componentId == OPTION_1)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(2474, 3437, 0));
			}
			else if (componentId == OPTION_2)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(2552, 3561, 0));
			}
			else if (componentId == OPTION_3)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(2998, 3912, 0));
			}

		}
		else if (stage == 11)
		{
			if (componentId == OPTION_1)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(3071, 3649, 0));
			}
			else if (componentId == OPTION_2)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(3747, 9373, 0));
			}   
			else if (componentId == OPTION_3)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0, new WorldTile(3007, 9550, 0));
			}  
			else if (componentId == OPTION_4)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0, new WorldTile(4646, 5405, 0));
			}  
			else if (componentId == OPTION_5)
			{
				sendOptionsDialogue("Dungeons", "Glacor Dungeon", "Jadinko's Lair", "Strykewyrms", "Pollnivneach Dungeon", "Next Page");
				stage = 24;
			}  
		}
		else if (stage == 12)
		{
			if (componentId == OPTION_1)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(3449, 3714, 0));
			}
			else if (componentId == OPTION_2)
			{
				sendOptionsDialogue("Divination Areas", "Draynor", "Falador", "Varrock", "Seer's Village", "Next Page");
				stage = 13;
			}  
			else if (componentId == OPTION_3)
			{
				sendOptionsDialogue("Farming Teleports", "Major Patches", "Wood Tree Patches", "Fruit Tree Patches", "Bush Patches", "More" );
				stage = 15;
			}
			if (componentId == OPTION_4)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(2925, 3448, 0));//summoning
			}
		}
		else if (stage == 13)
		{
			if (componentId == OPTION_1)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(3119, 3216, 0));	
			}
			else if (componentId == OPTION_2)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(2987, 3404, 0));			
			}
			else if (componentId == OPTION_3)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(3308, 3413, 0));	
			}
			else if (componentId == OPTION_4)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(2745, 3409, 0));	
			}
			else if (componentId == OPTION_5)
			{
				sendOptionsDialogue("Divination Areas", "Fremennik", "Mobilising Armies", "Canifis", "Dragontooth Island", "Poison Waste");
				stage = 14;
			}
		}
		else if (stage == 14)
		{
			if (componentId == OPTION_1)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(2763, 3601, 0));	
			}
			else if (componentId == OPTION_2)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(2419, 2860, 0));	
			}
			else if (componentId == OPTION_3)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(3472, 3530, 0));	
			}
			else if (componentId == OPTION_4)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(3798, 3550, 0));	
			}
			else if (componentId == OPTION_5)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(2285, 3052, 0));
			}
		}
		else if (stage == 15)
		{
			if (componentId == OPTION_1) 
			{ 
				sendOptionsDialogue("Major Patches", "Catherby", "Ardougne",  "Canifis", "Falador" );
				stage = 16;
			} 
			else if (componentId == OPTION_2) 
			{
				sendOptionsDialogue("Wood Tree Patches", "Lumbridge", "Varrock", "Falador", "Tree Gnome", "Taverly" );
				stage = 17;
			} 
			else if (componentId == OPTION_3) 
			{
				sendOptionsDialogue("Fruit Tree Patches", "Gnome Stronghold", "Catherby", "Gnome Maze", "Brimhaven", "Lleyta" );
				stage = 18;
			} 
			else if (componentId == OPTION_4) 
			{
				sendOptionsDialogue("Bush Patches", "Champion's Guild", "Rimmington", "Ardougne", "Etceteria");
				stage = 19;
			} 
			else if (componentId == OPTION_5) 
			{
				sendOptionsDialogue("Farming Teleports", "Hop Patches", "Misc Patches");
				stage = 20;
			}
		}
		else if (stage == 16)
		{
			if (componentId == OPTION_1)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0, new WorldTile(2806, 3463, 0));
			}
			else if (componentId == OPTION_2)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0, new WorldTile(2664, 3374, 0));
			}
			else if (componentId == OPTION_3)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0, new WorldTile(3599, 3523, 0));
			}
			else if (componentId == OPTION_4)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0, new WorldTile(3052, 3304, 0));	
			}
		}
		else if (stage == 17)
		{
			if (componentId == OPTION_1)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0, new WorldTile(3196, 3231, 0));
			}
			else if (componentId == OPTION_2)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0, new WorldTile(3229, 3456, 0));
			}
			else if (componentId == OPTION_3)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0, new WorldTile(3001, 3373, 0));
			}
			else if (componentId == OPTION_4)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0, new WorldTile(2436, 3413, 0));
			}
			else if (componentId == OPTION_5)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0, new WorldTile(2927, 3429, 0));
			}
		}
		else if (stage == 18)
		{
			if (componentId == OPTION_1)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0, new WorldTile(2475, 3444, 0));
			}
			else if (componentId == OPTION_2)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0, new WorldTile(2860, 3432, 0));
			}
			else if (componentId == OPTION_3)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0, new WorldTile(2498, 3178, 0));
			}
			else if (componentId == OPTION_4)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0, new WorldTile(2764, 3211, 0));
			}
			else if (componentId == OPTION_5)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0, new WorldTile(2346, 3161, 0));
			}
		}
		else if (stage == 19)
		{
			if (componentId == OPTION_1)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0, new WorldTile(3182, 3356, 0));
			}
			else if (componentId == OPTION_2)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0, new WorldTile(2940, 3220, 0));
			}
			else if (componentId == OPTION_3)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0, new WorldTile(2630, 3313, 0));
			}
			else if (componentId == OPTION_4)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0, new WorldTile(2593, 3864, 0));
			}
		}
		else if (stage == 20)
		{
			if (componentId == OPTION_1) 
			{ 
				sendOptionsDialogue("Hop Patches", "Lumbridge", "McGrubor", "Yanille", "Entrana" );
				stage = 21;
			} 
			else if (componentId == OPTION_2) 
			{
				sendOptionsDialogue("Misc Patches", "Belladonna", "Cactus", "Mushroom", "Calqut Tree", "Trollheim Herb" );
				stage = 22;
			}
		}
		else if (stage == 21)
		{
			if (componentId == OPTION_1)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0, new WorldTile(3229, 3310, 0));
			}
			else if (componentId == OPTION_2)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0, new WorldTile(2667, 3522, 0));
			}
			else if (componentId == OPTION_3)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0, new WorldTile(2576, 3101, 0));
			}
			else if (componentId == OPTION_4)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0, new WorldTile(2810, 3333, 0));
			}
		}
		else if (stage == 22)
		{
			if (componentId == OPTION_1)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0, new WorldTile(3088, 3363, 0));
			}
			else if (componentId == OPTION_2)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0, new WorldTile(3316, 3201, 0));
			}
			else if (componentId == OPTION_3)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0, new WorldTile(3452, 3470, 0));
			}
			else if (componentId == OPTION_4)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0, new WorldTile(2798, 3099, 0));
			}
			else if (componentId == OPTION_5)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0, new WorldTile(2813, 3679, 0));
			}
		}
		else if (stage == 23)
		{
			if (componentId == OPTION_1)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0, new WorldTile(2966, 4383, 2));
			}
			else if (componentId == OPTION_2)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0, new WorldTile(2562, 5739, 0));
			}
			else if (componentId == OPTION_3)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0, new WorldTile(3170, 3872, 0));
			}
			else if (componentId == OPTION_4)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0, new WorldTile(2545, 10143, 0));
			}
			else if (componentId == OPTION_5)
			{
				sendOptionsDialogue("Bosses", "Vorago", "Coming soon..");
				stage= 31;
			}
		}
		else if (stage == 24)
		{
			if (componentId == OPTION_1)
			{
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(4182, 5731, 0));
			}
			else if (componentId == OPTION_2)
			{
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3023, 9224, 0));
			}
			else if (componentId == OPTION_3)
			{
				sendOptionsDialogue("Strykewyrms", "Ice Strykewyrms", "Desert Strykewyrms", "Jungle Strykewyrms" );
				stage = 25;
			}
			else if (componentId == OPTION_4)
			{
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3359, 9370, 0));
			}
			else if (componentId == OPTION_5)
			{
				sendOptionsDialogue("Dungeons", "Dorgesh Kaan Dungeon", "Lumbridge Swamps", "Lumbridge Catacombs");
				stage = 29;

			}
		}
		else if(stage == 25) 
		{
			if(componentId == OPTION_1) 
			{
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3424, 5667, 0));

			} 
			else if(componentId == OPTION_2) 
			{
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3373, 3160, 0));

			} 
			else if(componentId == OPTION_3) 
			{
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2459, 2901, 0));
			}
		}
		else if (stage == 26)
		{
			if (componentId == OPTION_1)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(3087, 3501, 0));
			}
			else if (componentId == OPTION_2)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(2983, 3593, 0));
			}
			else if (componentId == OPTION_3)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(3318, 3704, 0));
			}
			else if (componentId == OPTION_4)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(2538, 4716, 0));
			}
		}
		else if (stage == 27)//slayer masters
		{
			if (componentId == OPTION_1)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(2449, 4435, 0));
			}
			else if (componentId == OPTION_2)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(3351, 3003, 0));
			}
			else if (componentId == OPTION_3)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(2870, 2970, 1));
			}
			else if (componentId == OPTION_4)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(1735, 5314, 1));
			}
			else if (componentId == OPTION_5)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(2202, 3325, 0));
			}
		}
		else if (stage == 28)
		{
			if (componentId == OPTION_1)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(2666, 2653, 0)); //pc
			}
			else if (componentId == OPTION_2)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(3565, 3314, 0));//barrows
			}
			else if (componentId == OPTION_3)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(3348, 3232, 0));//duel
			}
			else if (componentId == OPTION_4)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(2438, 5173, 0));//fight pits	
			}
			else if (componentId == OPTION_5)
			{
			    sendOptionsDialogue("Minigames", "Godwars", "Puro-Puro"," Clan Wars", "Runespan", "Next Page");
			    stage = 32;
			}
		}
		else if (stage == 29)
		{
		    if (componentId == OPTION_1)
		    {
			Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(2712, 5192, 0));//duel
		    }
		    else if (componentId == OPTION_2)
		    {
			Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(3223, 9597, 0));//duel
		    }
		    else if (componentId == OPTION_3)
		    {
			Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(3972, 5565, 0));//catacombs
		    }
		}
		else if (stage == 30)
		{
		    if (componentId == OPTION_1)
		    {
			Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(2881, 3579, 0, 0));//trolls
		    }
		    else  if (componentId == OPTION_2)
		    {
			Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(3424, 9509, 0, 0));//trolls
		    }
		    else  if (componentId == OPTION_3)
		    {
			Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(2321, 3100, 0, 0));//tortoises
		    }
		}
		else if (stage == 31)
		{
			if (componentId == OPTION_1)
			{
			Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(3038, 6127, 0));//vorago
				}	
		}
			else if (stage == 32)
			{
			    if (componentId == OPTION_1)
			    {
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(2915, 3747, 0));//godwars
			    }
			    if (componentId == OPTION_2)
			    {
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(2428, 4441, 0));//puro
			    }
			    if (componentId == OPTION_3)
			    {
				Magic.sendLunarTeleportSpell(player, 0, 0.0D,new WorldTile(2961, 9675, 0));//clan
			    }
			    if (componentId == OPTION_4)
			    {
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(3106, 3160, 0));//runespan
			    }
			    if (componentId == OPTION_5)
			    {
				sendOptionsDialogue("Next Page");
				stage = 36;
			    }
			}
			else if (stage == 33)
			{
			    if (componentId == OPTION_1)
			    {
				sendOptionsDialogue("Slayer Masters", "Chaeldar <col=CA0000>75</col>", "Sumona<col=CA0000>90</col> <col=000000>35</col>", "Duradel<col=CA0000>100</col> <col=000000>50</col>", "Kuradel<col=CA0000>110</col> <col=000000>75</col>", "Morvran<col=CA0000>120</col> <col=000000>85</col>");
				stage = 27;
			    }

			    if (componentId == OPTION_2)
			    {
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(3424, 3521, 0));
			    }
			}
			else if (stage == 36)//minigames3page
			{
			    if (componentId == OPTION_1)
			    {
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(3120, 3519, 0));//crucible
			    }
			}
	}
	@Override
	public void finish() {
		// TODO Auto-generated method stub

	}

}
