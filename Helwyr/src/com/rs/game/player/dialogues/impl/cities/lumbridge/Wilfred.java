package com.rs.game.player.dialogues.impl.cities.lumbridge;

import com.rs.game.World;
import com.rs.game.player.Skills;
import com.rs.game.player.dialogues.Dialogue;

public class Wilfred extends Dialogue {

	private int npcId;

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		if (player.getSkills().getLevel(Skills.WOODCUTTING) >= 99) {
			sendNPCDialogue(
					npcId,
					HAPPY,
					"Wow! It's not often I meet somebody as accomplished as",
					"you in Woodcutting! Seeing as you're so skilled, maybe you",
					"are interested in buying a Skillcape of Woodcutting?");
		} else {
			sendOptionsDialogue(DEFAULT_OPTIONS_TITLE,
					"Tell me about different trees and axes.",
					"What is that cape you're wearing?", "Goodbye.");
			stage = 500;
		}

	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch (stage) {
		case -1:
			sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "No, thanks.",
					"Yes, please.", "Ask about something else.");
			stage = 0;
			break;
		case 0:
			switch (componentId) {
			case OPTION_1:
				sendPlayerDialogue(NORMAL, "No, thanks.");
				stage = 1;
				break;
			case OPTION_2:
				sendPlayerDialogue(HAPPY, "Yes, please.");
				stage = 2;
				break;
			case OPTION_3:
				sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "Elder trees",
						"Nevermind.");
				stage = 7;
				break;
			}
			break;
		case 1:
			sendNPCDialogue(npcId, NORMAL,
					"Okay. Come back to me if you change your mind.");
			stage = 20;
			break;
		case 2:
			sendNPCDialogue(npcId, NORMAL,
					"Anybody who has spent as much time cutting trees as you",
					"deserves the right to own one. That'll be 99,000 coins,",
					"please.");
			stage = 3;
			break;
		case 3:
				sendOptionsDialogue(DEFAULT_OPTIONS_TITLE,
						"99,000! That's too rich for me.", "No problem.");
				stage = 4;
			break;
		case 4:
			switch (componentId) {
			case OPTION_1:
				sendPlayerDialogue(NORMAL, "99,000! That's too rich for me.");
				stage = 5;
				break;
			case OPTION_2:
				sendPlayerDialogue(HAPPY, "No problem.");
				stage = 6;
				break;
			}
			break;
		case 5:
			sendNPCDialogue(npcId, NORMAL,
					"Well, go chop down a few mahogany trees and sell the",
					"timber; then you'll be able to afford one.");
			stage = 20;
			break;
		case 6:
			if (player.getInventory().getFreeSlots() == 1) {
				sendPlayerDialogue(NORMAL,
						"Sorry, I don't have enough inventory space.");
				stage = 20;
			}
			if (player.getInventory().containsItem(995, 99000)) {
				sendNPCDialogue(npcId, HAPPY,
						"Excellent! Wear that cape with pride my friend.");
				player.getInventory().deleteItem(995, 99000);
				player.getInventory().addItem(9808, 1);
				player.getInventory().addItem(9809, 1);
				stage = 20;
			} else {
				sendNPCDialogue(npcId, UPSET,
						"Sorry, but you don't have enough coins to purchase this cape.");
				stage = 20;
			}
			break;
		case 7:
			switch (componentId) {
			case OPTION_1:
				sendPlayerDialogue(NORMAL, "Can you tell me about elder trees?");
				stage = 8;
				break;
			case OPTION_2:
				sendPlayerDialogue(NORMAL, "Nevermind.");
				stage = 20;
				break;
			}
			break;
		case 8:
			sendNPCDialogue(
					npcId,
					HAPPY,
					"Certainly, I'd be happy to share what I've gathered during",
					"my years of studying trees with you.");
			stage = 9;
			break;
		case 9:
			sendNPCDialogue(npcId, NORMAL,
					"There are a handful of Elder trees that I know of and",
					"they've been around a lot longer than even I can",
					"remember.");
			stage = 10;
			break;
		case 10:
			sendNPCDialogue(npcId, NORMAL,
					"The outer bark of the main trunk is very tough but some",
					"of the higher brances are easier to cut through with",
					"enough skill.");
			stage = 11;
			break;
		case 11:
			sendNPCDialogue(
					npcId,
					NORMAL,
					"They're very slow growing and take a bit longer than most",
					"other trees to regrow.");
			stage = 12;
			break;
		case 12:
			sendNPCDialogue(npcId, NORMAL,
					"The nearest Elder tree I know of is just south",
					"east of Falador near the ivy.");
			stage = 13;
			break;
		case 13:
			sendNPCDialogue(npcId, NORMAL,
					"In the past, I've cut that elder tree down and whilst",
					"waiting for it to grow back I've chopped away at other",
					"nearby trees and the ivy.");
			stage = 14;
			break;
		case 14:
			sendNPCDialogue(
					npcId,
					NORMAL,
					"That said, if you found some other elder trees, you might",
					"find movign between them more effective giving the",
					"others you've already cut down a chance to regrow.");
			stage = 15;
			break;
		case 15:
			sendPlayerDialogue(NORMAL, "Thanks, that's been very helpful.");
			stage = 20;
			break;
		case 20:
			end();
			break;
		case 500:
			switch (componentId) {
			case OPTION_1:
				sendPlayerDialogue(NORMAL,
						"Tell me about different trees and axes.");
				stage = 510;
				break;
			case OPTION_2:
				sendPlayerDialogue(NORMAL, "What is that cape you're wearing?");
				stage = 520;
				break;
			case OPTION_3:
				sendPlayerDialogue(NORMAL, "Goodbye.");
				stage = 530;
				break;
			}
			break;
		case 510:
			sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "Oak and Willow",
					"Maple and Yew", "Magic and other trees", "Axes",
					"Go back to teaching");
			stage = 511;
			break;
		case 511:
			switch (componentId) {
			case OPTION_1:
				sendHandedItem(
						1511,
						"Almost every tree can be chopped down. Normal logs will be produced by chopping 'Trees' and Oak logs will come from chopping 'Oak Trees'. You can find Oak trees in amongst normal trees scatterd about the");
				stage = 5100;
				break;
			case OPTION_2:
				sendHandedItem(
						1517,
						"Maple logs can be gleaned from Maple trees. You'll usually find Maple trees standing alone amongst other trees.");
				stage = 5200;
				break;
			case OPTION_3:
				sendHandedItem(
						1513,
						"Magic trees are... magic. A difficult wood to work with, but worth it for the rewards. Find them in the areas south of Seers village or on the East side of the Mage arena.");
				stage = 5300;
				break;
			case OPTION_4:
				sendHandedItem(
						1351,
						"Bronze axes are easy to get, simply go visit Bob in his shop in Lumbridge, or talk to me if you have mislaid yours.");
				stage = 5400;
				break;
			case OPTION_5:
				sendOptionsDialogue(DEFAULT_OPTIONS_TITLE,
						"Tell me about different trees and axes.",
						"What is that cape you're wearing?", "Goodbye.");
				stage = 500;

				break;
			}
			break;
		case 5400:
			sendNPCDialogue(npcId, NORMAL,
					"As you progress in your combat skill you will find you",
					"can wield your woodcutting axe as a weapon, it's not",
					"very effective, but it frees up a slot for another log.");
			stage = 5401;
			break;
		case 5401:
			sendHandedItem(
					1353,
					"As your woodcutting skill increases you will find yourself able to use better axes to chop trees faster.... anything up to steel you can buy from Bob's axe shop.");
			stage = 5402;
			break;
		case 5402:
			sendHandedItem(
					1359,
					"Rune axes can be player made with very high level smithing and mining. They can also be obtained through killing one of the fearsome tree spirits, though this is very rare.");
			stage = 510;
			break;
		case 5300:
			sendNPCDialogue(npcId, NORMAL,
					"Hollow trees can be found in the Haunted Woods east",
					"of Canifis, but be careful of the leeches.");
			stage = 510;
			break;
		case 5200:
			sendHandedItem(
					1515,
					"Yew trees are few and far between. We do our best to cultivate them. Look for the tree icon on your mini map to find rare trees. Try North of Port Sarim.");
			stage = 510;
			break;
		case 5100:
			sendHandedItem(1511, "lands.");
			stage = 5101;
			break;
		case 5101:
			sendHandedItem(
					1519,
					"Willow trees will yield willow logs. You'll find willows like to grow near water, you can find some south of Draynor.");
			stage = 5102;
			break;
		case 5102:
			sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "Oak and Willow",
					"Maple and Yew", "Magic and other trees", "Axes",
					"Go back to teaching");
			stage = 511;
			break;
		case 520:
			sendNPCDialogue(
					npcId,
					NORMAL,
					"This is a Skillcape of Woodcutting. Only a person who",
					"has achieved the highest possible level in a skill can wear",
					"one.");
			stage = 530;
			break;
		case 530:
			end();
			break;
		}
	}

	@Override
	public void finish() {

	}

}
