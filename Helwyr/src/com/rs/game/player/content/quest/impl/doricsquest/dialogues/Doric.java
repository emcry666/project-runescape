package com.rs.game.player.content.quest.impl.doricsquest.dialogues;


import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.player.content.quest.Quest;
import com.rs.game.player.content.quest.QuestList.Quests;
import com.rs.game.player.content.quest.State.QuestState;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.game.player.dialogues.Mood;

public class Doric extends Dialogue {
	
	
	@Override
	public int getNPCID() {
		return 284;
	}
	
	/**
	 * Represents the pickaxe item.
	 */
	private static final Item PICKAXE = new Item(1265, 1);

	/**
	 * Represents the requirement items.
	 */
	private static final Item[] REQUIREMENTS = new Item[] {new Item(436, 4), new Item(434, 6), new Item(440, 2)};

	@Override
	public void start() {
		stage = (Integer) parameters[0];
		switch(stage) {
		/*
		 * Default.
		 */
		case 0:
			sendPlayerChat(Mood.NORMAL, "Hello traveller, what brings you to my humble smithy?");
			stage = 0;
			break;
		/*
		 * Decline
		 */
		case -4:
			end();
			break;
		/*
		 * Accept.
		 */
		case -3:
			sendNPCChat(Mood.NORMAL, "Excellent.");
			stage = 16;
			break;
		}
		final Quest quest = player.getQuestManager().get(Quests.DORICS_QUEST);
		if (quest.getState() == QuestState.NOT_STARTED) {
			sendNPCChat(Mood.ASKING, "Hello traveller, what brings you to my humble smithy?");
			stage = 0;
		}
		if (quest.getState() == QuestState.STARTED) {
			sendNPCChat(Mood.ASKING, "Have you got my materials yet, traveller?");
			stage = 100;
		}
		if (quest.getState() == QuestState.COMPLETED) {
			sendNPCChat(Mood.ASKING, "Hello traveller, how is your metalworking coming along?");
			stage = 500;
		}
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch (stage) {
		case 0:
			sendOptionsDialogue("Select an Option", "I wanted to use your anvils.", "I want to use your whetstone.", "Mind your own business, shortstuff!", "I was just checking out the landscape.", "What do you make here?");
			stage = 1;
			break;
		case 1:
			switch (componentId) {
			case OPTION_1:
				sendPlayerChat(Mood.NORMAL, "I wanted to use your anvils.");
				stage = 10;
				break;
			case OPTION_2:
				sendPlayerChat(Mood.NORMAL, "I want to use your whetsone.");
				stage = 20;
				break;
			case OPTION_3:
				sendPlayerChat(Mood.NORMAL, "Mind your own business, shortstuff!");
				stage = 30;
				break;
			case OPTION_4:
				sendPlayerChat(Mood.NORMAL, "I was just checking out the landscape.");
				stage = 40;
				break;
			case OPTION_5:
				sendPlayerChat(Mood.NORMAL, "What do you make here?");
				stage = 50;
				break;

			}
			break;
		case 10:
			sendNPCChat(Mood.NORMAL, "My anvils get enough work with my own use. I make", "pickaxes, and it takes a lot of hard work. If you could", "get me some more materials, then I could let you use", "them.");
			stage = 11;
			break;
		case 11:
			sendOptionsDialogue("Select an Option", "Yes, I will get you the materials.", "No, hitting rocks if for the boring people, sorry.");
			stage = 12;
			break;
		case 12:
			switch (componentId) {
			case OPTION_1:
				sendPlayerChat(Mood.NORMAL, "Yes I will get you the materials.");
				stage = 15;
				break;
			case OPTION_2:
				sendPlayerChat(Mood.NORMAL, "No, hitting rocks is for the boring people, sorry.");
				stage = 13;
				break;
			}
			break;
		case 13:
			sendNPCChat(Mood.NORMAL, "That is your choice. Nice to meet you anyway.");
			stage = 14;
			break;
		case 14:
			end();
			break;
		case 15:
			sendNPCChat(Mood.NORMAL, "Clay is what I use more than anything, to make casts.", "Could you get me 6 clay, 4 copper ore, and 2 iron ore,", "please? I could pay a little, and let you use my anvils.", "Take this pickaxe with you just in case you need it.");
			stage = 16;
			break;
		case 16:
			player.getQuestManager().get(Quests.DORICS_QUEST).setStage(1);
			player.getQuestManager().get(Quests.DORICS_QUEST).setState(QuestState.STARTED);
			player.reset();
			if (!player.getInventory().hasFreeSlots()) {
				World.addGroundItem(PICKAXE, new WorldTile(player));
			}
			sendPlayerChat(Mood.NORMAL, "Certainly, I'll be right back!");
			stage = 17;
			break;
		case 17:
			end();
			break;
		case 20:
			sendNPCChat(Mood.NORMAL, "The whetstone is for more advanced smithing, but I", "could let you use it as well as my anvils if you could", "get me some more materials.");
			stage = 11;
			break;
		case 30:
			sendNPCChat(Mood.NORMAL, "How nice to meet someone with such pleasant manners.", "Do come again when you need to shout at someone", "smaller than you!");
			stage = 31;
			break;
		case 31:
			end();
			break;
		case 40:
			sendNPCChat(Mood.NORMAL, "Hope you like it. I do enjoy the solitude of my little", "home. If you get time, please say hi to my friends in", "the Dwarven Mine.");
			stage = 41;
			break;
		case 41:
			sendPlayerChat(Mood.NORMAL, "Will do!");
			stage = 42;
			break;
		case 42:
			end();
			break;
		case 50:
			sendNPCChat(Mood.NORMAL, "I make pickaxes. I am the best maker of pickaxes in the", "whole of Arrow.");
			stage = 51;
			break;
		case 51:
			sendPlayerChat(Mood.NORMAL, "Do you have any to sell?");
			stage = 52;
			break;
		case 52:
			sendNPCChat(Mood.NORMAL, "Sorry, but I've got a running order with Nurmof.");
			stage = 53;
			break;
		case 53:
			sendPlayerChat(Mood.NORMAL, "Ah, fair enough.");
			stage = 54;
			break;
		case 54:
			end();
			break;
		case 100:
			if (player.getInventory().containsItem(434, 6) && player.getInventory().containsItem(440, 2) && player.getInventory().containsItem(436, 4)) {
				sendPlayerChat(Mood.NORMAL, "I have everything you need.");
				stage = 200;
			} else {
				sendPlayerChat(Mood.NORMAL, "Sorry, I don't have them all yet.");
				stage = 101;
			}
			break;
		case 101:
			sendNPCChat(Mood.NORMAL, "Not to worry, stick at it. Remember, I need 6 clay, 4", "copper ore, and 2 iron ore.");
			stage = 102;
			break;
		case 102:
			sendOptionsDialogue("Select an Option", "Where can I find those?", "Certainly, I'll be right back.");
			stage = 103;
			break;
		case 103:
			switch (componentId) {
			case OPTION_1:
				sendPlayerChat(Mood.NORMAL, "Where can I find those?");
				stage = 110;
				break;
			case OPTION_2:
				sendPlayerChat(Mood.NORMAL, "Certainly, I'll be right back.");
				stage = 113;
				break;

			}
			break;
		case 110:
			sendNPCChat(Mood.NORMAL, "You'll be able to find all those ores in the rocks just", "inside the Dwarven Mine. Head east from here and", "you'll find the entrance in the side of Ice Mountain.");
			stage = 111;
			break;
		case 111:
			end();
			break;
		case 113:
			end();
			break;
		case 200:
			sendNPCChat(Mood.NORMAL, "Many thanks. Pass them here, please. I can spare you", "some coins for your trouble, and please use my anvils", "anytime you want.");
			stage = 201;
			break;
		case 201:
			sendHandedItem(436, "You hand the clay, copper, and iron to Doric.");
			stage = 202;
			break;
		case 202:
			if (player.getInventory().removeItems(REQUIREMENTS)) {
				end();
				player.getQuestManager().get(Quests.DORICS_QUEST).finish();
			}
			break;
		case 500:
			sendPlayerChat(Mood.NORMAL, "Not too bad, Doric.");
			stage = 501;
			break;
		case 501:
			sendNPCChat(Mood.NORMAL, "Good, the love of metal is a thing close to my heart.");
			stage = 502;
			break;
		case 502:
			end();
			break;
		case 503:
			player.getQuestManager().get(Quests.DORICS_QUEST).sendStartOption();
			end();
			break;
		}
	}

	@Override
	public void finish() {
		
	}

}
