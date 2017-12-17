package com.rs.game.player.dialogues.impl;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.World;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.Utils;

public class TriviaRewards extends Dialogue {

	private int category;

	/**
	 * High Bet
	 */
	public int[] win = { 15441, 15444, 20949, 20952, 22211, 22207 };
	public int[] loss = { 24431, 24110, 24431, 19281, 19302, 19305, 24094, 24414 };
	

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		npc(HAPPY, "Hello " + player.getDisplayName() + ", Wishing to view trivia rewards?");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
		
		case -1:
			options("Choose a Purchase", "Convert to coins", "Items", "Spins", "Exit");
			stage = 2;
			break;
		
		case 2:
			switch(componentId) {
			case OPTION_1:
				options(DEFAULT, "x1 Trivia Point (10,000gp)", "x10 Trivia Points (100,000gp)", "x15 Trivia Points (175,000gp)", "x20 Trivia Points (220,000gp)", "Back");
				stage = 3;
				break;
			case OPTION_2:
				options(DEFAULT, "Colored Items", "Cosmetic Items", "Mystery Item", "Back");
				stage = 4;
				break;
			case OPTION_3:
				options(DEFAULT, "x5 Trivia Point(s) (7 Squeal of Fortune Spins)", "x10 Trivia Point(s) (14 Squeal of Fortune Spins)",
						"x15 Trivia Point(s) (23 Squeal of Fortune Spins)", "x20 Trivia Point(s) (x31 Squeal of Fortune Spins)", "Back");
				stage = 15;
				break;
			case OPTION_4:
				close();
				break;
			}
			break;

		case 3:
			switch(componentId) {
			case OPTION_1:
				if (player.getTriviaPoints() >= 1) {
					player.getBank().addItem(995, 10000, true);
					player.takeTriviaPoints(1);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 995, 10000);
					player.getPackets().sendIComponentText(1189, 4, "The coins have been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x1 Trivia Point(s) to buy this.");
					stage = -2;
				}
				break;
			case OPTION_2:
				if (player.getTriviaPoints() >= 10) {
					player.getBank().addItem(995, 100000, true);
					player.takeTriviaPoints(10);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 995, 100000);
					player.getPackets().sendIComponentText(1189, 4, "The coins have been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x10 Trivia Point(s) to buy this.");
					stage = -2;
				}
				break;
			case OPTION_3:
				if (player.getTriviaPoints() >= 15) {
					player.getBank().addItem(995, 175000, true);
					player.takeTriviaPoints(15);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 995, 175000);
					player.getPackets().sendIComponentText(1189, 4, "The coins have been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x15 Trivia Point(s) to buy this.");
					stage = -2;
				}
				break;
			case OPTION_4:
				if (player.getTriviaPoints() >= 20) {
					player.getBank().addItem(995, 220000, true);
					player.takeTriviaPoints(20);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 995, 220000);
					player.getPackets().sendIComponentText(1189, 4, "The coins have been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x20 Trivia Point(s) to buy this.");
					stage = -2;
				}
				break;
			case OPTION_5:
				options("Choose a Purchase", "Convert to coins", "Items", "Spins", "Titles", "Exit");
				stage = 2;
				break;
			}
			break;

		case 4:
			switch(componentId) {
			case OPTION_1:
				options("RECOLORED ITEMS", "Whips", "Robin hood hats", "Staff of lights", "Mages books", "More");
				stage = 5;
				break;
			case OPTION_2:
				options("ORDER OF RARITY", "Foxbox's Fox (x7500 Trivia Points)", "Foxbox's Mask (x4120 Trivia Points)", "Sled (x3750 Trivia Points)", "Camel Mask (x750 Trivia Points)", "More");
				stage = 16;
				break;
			case OPTION_3:
				options(DEFAULT, "Mystery Item (x17 Trivia Points)", "Back");
				stage = 17;
				break;
			case OPTION_4:
				options("Choose a Purchase", "Convert to coins", "Items", "Spins", "Titles", "Exit");
				stage = 2;
				break;
			}
			break;

		case 5:
			switch(componentId) {
			case OPTION_1:
				options(DEFAULT, "White Abyssal Whip (x25 Trivia Points)", "Blue Abyssal Whip (x25 Trivia Points)", "Green Abyssal Whip (x25 Trivia Points)", "Yellow Abyssal Whip (x25 Trivia Points)", "Exit");
				stage = 6;
				break;
			case OPTION_2:
				options(DEFAULT, "Red Robin Hood Hat (x20 Trivia Points)", "Yellow Robin Hood Hat (x20 Trivia Points)", "Blue Robin Hood Hat (x20 Trivia Points)", "White Robin Hood Hat (x20 Trivia Points)", "Exit");
				stage = 7;
				break;
			case OPTION_3:
				options(DEFAULT, "Red Staff of Light (x30 Trivia Points)", "Blue Staff of Light (x30 Trivia Points)", "Green Staff of Light (x30 Trivia Points)", "Exit");
				stage = 8;
				break;
			case OPTION_4:
				options(DEFAULT, "White Mages Book (x15 Trivia Points)", "Blue Mages Book (x15 Trivia Points)", "Green Mages Book (x15 Trivia Points)", "Yellow Mages Book (x15 Trivia Points)", "Exit");
				stage = 10;
				break;
			case OPTION_5:
				options(DEFAULT, "Gnome Scarfs", "Top hats", "Ancient Staffs", "Back");
				stage = 11;
				break;
			}
			break;

		case 6:
			switch(componentId) {
			case OPTION_1:
				if (player.getTriviaPoints() >= 25) {
					player.getBank().addItem(15443, 1, true);
					player.takeTriviaPoints(25);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 15443, 1);
					player.getPackets().sendIComponentText(1189, 4, "The White abyssal whip has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x25 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_2:
				if (player.getTriviaPoints() >= 25) {
					player.getBank().addItem(15442, 1, true);
					player.takeTriviaPoints(25);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 15442, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Blue abyssal whip has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x25 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_3:
				if (player.getTriviaPoints() >= 25) {
					player.getBank().addItem(15444, 1, true);
					player.takeTriviaPoints(25);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 15444, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Green abyssal whip has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x25 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_4:
				if (player.getTriviaPoints() >= 25) {
					player.getBank().addItem(15441, 1, true);
					player.takeTriviaPoints(25);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 15441, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Yellow abyssal whip has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x25 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_5:
				close();
				break;
			}
			break;

		case 7:
			switch(componentId) {
			case OPTION_1:
				if (player.getTriviaPoints() >= 20) {
					player.getBank().addItem(20949, 1, true);
					player.takeTriviaPoints(20);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 20949, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Red robin hood hat has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x20 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_2:
				if (player.getTriviaPoints() >= 20) {
					player.getBank().addItem(20950, 1, true);
					player.takeTriviaPoints(20);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 20950, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Yellow robin hood hat has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x20 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_3:
				if (player.getTriviaPoints() >= 20) {
					player.getBank().addItem(20951, 1, true);
					player.takeTriviaPoints(20);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 20951, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Blue robin hood hat has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x20 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_4:
				if (player.getTriviaPoints() >= 20) {
					player.getBank().addItem(20952, 1, true);
					player.takeTriviaPoints(20);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 20952, 1);
					player.getPackets().sendIComponentText(1189, 4, "The White robin hood hat has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x20 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_5:
				close();
				break;
			}
			break;

		case 8:
			switch(componentId) {
			case OPTION_1:
				if (player.getTriviaPoints() >= 30) {
					player.getBank().addItem(22207, 1, true);
					player.takeTriviaPoints(30);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 22207, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Red Staff of light has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x30 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_2:
				if (player.getTriviaPoints() >= 30) {
					player.getBank().addItem(22211, 1, true);
					player.takeTriviaPoints(30);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 22211, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Blue Staff of light has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x30 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_3:
				if (player.getTriviaPoints() >= 30) {
					player.getBank().addItem(22213, 1, true);
					player.takeTriviaPoints(30);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 22213, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Green Staff of light has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x30 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_4:
				close();
				break;
			}
			break;

		case 10:
			switch(componentId) {
			case OPTION_1:
				if (player.getTriviaPoints() >= 15) {
					player.getBank().addItem(24100, 1, true);
					player.takeTriviaPoints(15);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 24100, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Blue Mages book has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x15 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_2:
				if (player.getTriviaPoints() >= 15) {
					player.getBank().addItem(24102, 1, true);
					player.takeTriviaPoints(15);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 24102, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Green Mages book has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x15 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_3:
				if (player.getTriviaPoints() >= 15) {
					player.getBank().addItem(24104, 1, true);
					player.takeTriviaPoints(15);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 24104, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Yellow Mages book has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x15 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_4:
				if (player.getTriviaPoints() >= 15) {
					player.getBank().addItem(24106, 1, true);
					player.takeTriviaPoints(15);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 24106, 1);
					player.getPackets().sendIComponentText(1189, 4, "The White Mages book has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x15 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_5:
				close();
				break;
			}
			break;

		case 11:
			switch(componentId) {
			case OPTION_1:
				options(DEFAULT, "Red Gnome Scarf (x12 Trivia Points)", "Yellow Gnome Scarf (x12 Trivia Points)", "Blue Gnome Scarf (x12 Trivia Points)", "Green Gnome Scarf (x12 Trivia Points)", "Exit");
				stage = 12;
				break;
			case OPTION_2:
				options(DEFAULT, "White Top Hat (x7 Trivia Points)", "Blue Top Hat (x7 Trivia Points)", "Green Top Hat (x7 Trivia Points)", "Red Top Hat (x7 Trivia Points)", "Exit");
				stage = 13;
				break;
			case OPTION_3:
				options(DEFAULT, "Red Ancient Staff (x15 Trivia Points)", "Yellow Ancient Staff (x15 Trivia Points)", "Blue Ancient Staff (x15 Trivia Points)", "Green Ancient Staff (x15 Trivia Points)", "Exit");
				stage = 14;
				break;
			case OPTION_4:
				options("Choose a Purchase", "Convert to coins", "Items", "Spins", "Titles");
				stage = 2;
				break;
			}
			break;

		case 12:
			switch(componentId) {
			case OPTION_1:
				if (player.getTriviaPoints() >= 12) {
					player.getBank().addItem(22215, 1, true);
					player.takeTriviaPoints(12);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 22215, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Red Gnome scarf has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x12 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_2:
				if (player.getTriviaPoints() >= 12) {
					player.getBank().addItem(22216, 1, true);
					player.takeTriviaPoints(12);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 22216, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Yellow Gnome scarf has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x12 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_3:
				if (player.getTriviaPoints() >= 12) {
					player.getBank().addItem(22217, 1, true);
					player.takeTriviaPoints(12);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 22217, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Blue Gnome scarf has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x12 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_4:
				if (player.getTriviaPoints() >= 12) {
					player.getBank().addItem(22218, 1, true);
					player.takeTriviaPoints(12);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 22218, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Green Gnome scarf has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x12 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_5:
				close();
				break;
			}
			break;

		case 13:
			switch(componentId) {
			case OPTION_1:
				if (player.getTriviaPoints() >= 7) {
					player.getBank().addItem(24108, 1, true);
					player.takeTriviaPoints(7);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 24108, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Red Top hat has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x7 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_2:
				if (player.getTriviaPoints() >= 7) {
					player.getBank().addItem(24110, 1, true);
					player.takeTriviaPoints(7);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 24110, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Green Top hat has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x7 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_3:
				if (player.getTriviaPoints() >= 7) {
					player.getBank().addItem(24112, 1, true);
					player.takeTriviaPoints(7);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 24112, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Blue Top hat has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x7 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_4:
				if (player.getTriviaPoints() >= 7) {
					player.getBank().addItem(24114, 1, true);
					player.takeTriviaPoints(7);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 24114, 1);
					player.getPackets().sendIComponentText(1189, 4, "The White Top hat has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x7 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_5:
				close();
				break;
			}
			break;

		case 14:
			switch(componentId) {
			case OPTION_1:
				if (player.getTriviaPoints() >= 15) {
					player.getBank().addItem(24092, 1, true);
					player.takeTriviaPoints(15);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 24092, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Red Ancient staff has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x15 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_2:
				if (player.getTriviaPoints() >= 15) {
					player.getBank().addItem(24094, 1, true);
					player.takeTriviaPoints(15);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 24094, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Blue Ancient staff has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x15 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_3:
				if (player.getTriviaPoints() >= 15) {
					player.getBank().addItem(24096, 1, true);
					player.takeTriviaPoints(15);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 24096, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Green Ancient staff has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x15 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_4:
				if (player.getTriviaPoints() >= 15) {
					player.getBank().addItem(24098, 1, true);
					player.takeTriviaPoints(15);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 24098, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Yellow Ancient staff has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x15 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_5:
				break;
			}
			break;

		case 15:
			switch(componentId) {
			case OPTION_1:
				if (player.getTriviaPoints() >= 5) {
					player.takeTriviaPoints(5);
					player.getSquealOfFortune().setEarnedSpins(player.getSquealOfFortune().getEarnedSpins() + 7);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 24154, 1);
					player.getPackets().sendIComponentText(1189, 4, "You recieve x7 Squeal of Fortune Spins.");
					stage = -2;
				} else {
					dialogue("You need x5 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_2:
				if (player.getTriviaPoints() >= 10) {
					player.takeTriviaPoints(10);
					player.getSquealOfFortune().setEarnedSpins(player.getSquealOfFortune().getEarnedSpins() + 14);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 24154, 1);
					player.getPackets().sendIComponentText(1189, 4, "You recieve x14 Squeal of Fortune Spins.");
					stage = -2;
				} else {
					dialogue("You need x10 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_3:
				if (player.getTriviaPoints() >= 15) {
					player.takeTriviaPoints(15);
					player.getSquealOfFortune().setEarnedSpins(player.getSquealOfFortune().getEarnedSpins() + 23);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 24154, 1);
					player.getPackets().sendIComponentText(1189, 4, "You recieve x23 Squeal of Fortune Spins.");
					stage = -2;
				} else {
					dialogue("You need x15 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_4:
				if (player.getTriviaPoints() >= 20) {
					player.takeTriviaPoints(20);
					player.getSquealOfFortune().setEarnedSpins(player.getSquealOfFortune().getEarnedSpins() + 31);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 24154, 1);
					player.getPackets().sendIComponentText(1189, 4, "You recieve x31 Squeal of Fortune Spins.");
					stage = -2;
				} else {
					dialogue("You need x20 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_5:
				options("Choose a Purchase", "Convert to coins", "Items", "Spins", "Titles", "Exit");
				stage = 2;
				break;
			}
			break;

		case 16:
			switch(componentId) {
			case OPTION_1:
				if (player.getTriviaPoints() >= 7500) {
					player.takeTriviaPoints(7500);
					player.getBank().addItem(5608, 1, true);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 5608, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Foxbox's Fox has been added to your bank.");
					World.sendWorldMessage("[<col=ffffff><shad=0000ff>Rare Trivia Reward</col></shad>] - <col=ffffff><shad=0000ff>" + player.getUsername() + " hast just bought the fox!", false);
					stage = -2;
				} else {
					dialogue("You need x7500 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_2:
				if (player.getTriviaPoints() >= 4120) {
					player.takeTriviaPoints(4120);
					player.getBank().addItem(19272, 1, true);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 19272, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Foxbox's Mask has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x4120 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_3:
				if (player.getTriviaPoints() >= 3750) {
					player.takeTriviaPoints(3750);
					player.getBank().addItem(4083, 1, true);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 4083, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Sled has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x3750 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_4:
				if (player.getTriviaPoints() >= 1150) {
					player.takeTriviaPoints(1150);
					player.getBank().addItem(7003, 1, true);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 7003, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Camel Mask has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x1150 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_5:
				options(DEFAULT, "Swagger Stick (x750 Trivia Points)", "Swag Bag (x750 Trivia Points)", "Dragon Masks", "Fish Mask (x13 Trivia Points)", "Back");
				stage = 18;
				break;
			}
			break;

		case 17:
			switch(componentId) {
			case OPTION_1:
				int luck = Utils.random(0, 500);
				int winId = Utils.random(0, 5);
				int lossId = Utils.random(0, 4);
				if (player.getTriviaPoints() >= 17) {
					if(luck >= 325) {
						player.getBank().addItem(win[winId], 1, true);
						player.takeTriviaPoints(17);
						player.getInterfaceManager().closeChatBoxInterface();
						player.getInterfaceManager().sendChatBoxInterface(1189);
						player.getPackets().sendItemOnIComponent(1189, 1, win[winId], 1);
						player.getPackets().sendIComponentText(1189, 4, "You won, The " + ItemDefinitions.getItemDefinitions(win[winId]).getName() + " has been added to your bank!");
						stage = -2;
					
					} else if(luck < 325) {
						player.getBank().addItem(loss[lossId], 1, true);
						player.takeTriviaPoints(17);
						player.getInterfaceManager().closeChatBoxInterface();
						player.getInterfaceManager().sendChatBoxInterface(1189);
						player.getPackets().sendItemOnIComponent(1189, 1, loss[lossId], 1);
						player.getPackets().sendIComponentText(1189, 4, "You lost, The " + ItemDefinitions.getItemDefinitions(loss[lossId]).getName() + " has been added to your bank!");
						stage = -2;
					}
				} else {
					dialogue("You need x17 Trivia Point(s) to buy this.");
					stage = -2;
				}
				break;
			case OPTION_2:
				options(DEFAULT, "Colored Items", "Cosmetic Items", "Mystery Item", "Back");
				stage = 4;
				break;
			}
			break;

		case 18:
			switch(componentId) {
			case OPTION_1:
				if (player.getTriviaPoints() >= 750) {
					player.takeTriviaPoints(750);
					player.getBank().addItem(23671, 1, true);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 23671, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Swagger Stick has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x750 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_2:
				if (player.getTriviaPoints() >= 750) {
					player.takeTriviaPoints(750);
					player.getBank().addItem(23672, 1, true);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 23672, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Swag Bag has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x750 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_3:
				options(DEFAULT, "Frost Dragon Mask (x250 Trivia Points)", "Mithril Dragon Mask (x12 Trivia Points0", "Steel Dragon Mask (x10 Trivia Points)", "Iron Dragon Mask (x8 Trivia Points)", "More");
				stage = 19;
				break;
			case OPTION_4:
				if (player.getTriviaPoints() >= 13) {
					player.takeTriviaPoints(13);
					player.getBank().addItem(24431, 1, true);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 24431, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Fish Mask has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x13 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_5:
				options("Choose a Purchase", "Convert to coins", "Items", "Spins", "Titles", "Exit");
				stage = 2;
				break;
			}
			break;
			
		case 19:
			switch(componentId) {
			case OPTION_1:
				if (player.getTriviaPoints() >= 250) {
					player.takeTriviaPoints(250);
					player.getBank().addItem(19293, 1, true);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 19293, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Frost Dragon Mask has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x250 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_2:
				if (player.getTriviaPoints() >= 12) {
					player.takeTriviaPoints(12);
					player.getBank().addItem(19305, 1, true);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 19305, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Mithril Dragon Mask has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x12 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_3:
				if (player.getTriviaPoints() >= 10) {
					player.takeTriviaPoints(10);
					player.getBank().addItem(19302, 1, true);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 19302, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Steel Dragon Mask has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x10 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_4:
				if (player.getTriviaPoints() >= 8) {
					player.takeTriviaPoints(8);
					player.getBank().addItem(19299, 1, true);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 19299, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Iron Dragon Mask has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x8 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_5:
				options(DEFAULT, "Black Dragon Mask (x6 Trivia Points)", "Red Dragon Mask (x5 Trivia Points)", "Blue Dragon Mask (x5 Trivia Points)", "Green Dragon Mask (x5 Trivia Points)", "Back");
				stage = 20;
				break;
			}
			break;
			
		case 20:
			switch(componentId) {
			case OPTION_1:
				if (player.getTriviaPoints() >= 7) {
					player.takeTriviaPoints(7);
					player.getBank().addItem(19290, 1, true);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 19290, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Black Dragon Mask has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x7 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_2:
				if (player.getTriviaPoints() >= 5) {
					player.takeTriviaPoints(5);
					player.getBank().addItem(19287, 1, true);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 19287, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Red Dragon Mask has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x5 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_3:
				if (player.getTriviaPoints() >= 5) {
					player.takeTriviaPoints(5);
					player.getBank().addItem(19284, 1, true);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 19284, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Blue Dragon Mask has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x5 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_4:
				if (player.getTriviaPoints() >= 5) {
					player.takeTriviaPoints(5);
					player.getBank().addItem(19281, 1, true);
					player.getInterfaceManager().closeChatBoxInterface();
					player.getInterfaceManager().sendChatBoxInterface(1189);
					player.getPackets().sendItemOnIComponent(1189, 1, 19281, 1);
					player.getPackets().sendIComponentText(1189, 4, "The Green Dragon Mask has been added to your bank.");
					stage = -2;
				} else {
					dialogue("You need x5 Trivia point(s) to buy this item.");
					stage = -2;
				}
				break;
			case OPTION_5:
				options(DEFAULT, "Swagger Stick (x750 Trivia Points)", "Swag Bag (x750 Trivia Points)", "Dragon Masks", "Fish Mask (x13 Trivia Points)", "Back");//TODO - DOWN
				stage = 18;
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

}
