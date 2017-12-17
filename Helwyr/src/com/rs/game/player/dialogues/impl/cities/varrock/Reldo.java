package com.rs.game.player.dialogues.impl.cities.varrock;

import com.rs.game.player.content.quest.State;
import com.rs.game.player.content.quest.QuestList.Quests;
import com.rs.game.player.dialogues.Dialogue;

public class Reldo extends Dialogue {

	private int npcId;

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		sendNPCDialogue(npcId, PLAIN_TALKING, "Hello stranger.");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch (stage) {
		case -1:
			sendOptionsDialogue(DEFAULT_OPTIONS_TITLE,
					"I'm in search of a quest.",
					"Do you have anything to trade?", "What do you do?",
					"Do you know any heroic stories?");
			stage = 0;
			break;
		case 0:
			switch (componentId) {
			case OPTION_1:
				sendPlayerDialogue(NORMAL, "I'm in search of a quest.");
				stage = 1;
				break;
			case OPTION_2:
				sendPlayerDialogue(NORMAL, "Do you have anything to trade?");
				stage = 6;
				break;
			case OPTION_3:
				sendPlayerDialogue(NORMAL, "What do you do?");
				stage = 10;
				break;
			case OPTION_4:
				sendPlayerDialogue(HAPPY, "Do you know any heroic stories?");
				stage = 14;
				break;
			}
			break;
		case 1:
			sendNPCDialogue(npcId, PLAIN_TALKING,
					"Hmmm. I don't... believe there are any here...");
			stage = 2;
			break;
		case 2:
			sendNPCDialogue(npcId, PLAIN_TALKING, "Let me think actually...");
			stage = 3;
			break;
		case 3:
			sendNPCDialogue(
					npcId,
					HAPPY,
					"Ah yes. I know. If you look in a book called 'The Shield of",
					"Arrav', you'll find a quest in there.");
			stage = 4;
			break;
		case 4:
			sendNPCDialogue(
					npcId,
					CONFUSED,
					"I'm not sure where the book is mind you... but I'm sure it's",
					"around here somewhere.");
			stage = 5;
			break;
		case 5:
			sendPlayerDialogue(HAPPY, "Thank you.");
			stage = 50;
			break;
		case 6:
			sendNPCDialogue(npcId, PLAIN_TALKING, "Only knowledge.");
			stage = 7;
			break;
		case 7:
			sendPlayerDialogue(CONFUSED, "How much do you want for that then?");
			stage = 8;
			break;
		case 8:
			sendNPCDialogue(
					npcId,
					LISTENS_THEN_LAUGHS,
					"No, sorry, that was just my little joke. I'm not the trading",
					"type.");
			stage = 9;
			break;
		case 9:
			sendPlayerDialogue(NORMAL, "Ah well.");
			stage = 50;
			break;
		case 10:
			sendNPCDialogue(npcId, PLAIN_TALKING, "I am the palace librarian.");
			stage = 11;
			break;
		case 11:
			sendPlayerDialogue(NORMAL,
					"Ah. That's why you're in the library then.");
			stage = 12;
			break;
		case 12:
			sendNPCDialogue(npcId, PLAIN_TALKING, "Yes.");
			stage = 13;
			break;
		case 13:
			sendNPCDialogue(
					npcId,
					PLAIN_TALKING,
					"Although I would probably be in here even if I didn't work",
					"here. I like reading. Someday I hope to catalogue all of the",
					"information stored in these books so all may read it.");
			stage = 50;
			break;
		case 14:
			sendNPCDialogue(npcId, HAPPY, "Yes, I do.");
			stage = 15;
			break;
		case 15:
			sendNPCDialogue(
					npcId,
					NORMAL,
					"Years ago, a terrible creature slew King Roald's betrothed",
					"and terrorized the people. Varrock sent an embassy to",
					"Mortytania to open a dialogue with Drakan about it.");
			stage = 16;
			break;
		case 16:
			sendPlayerDialogue(WORRIED, "What happend?");
			stage = 17;
			break;
		case 17:
			sendNPCDialogue(
					npcId,
					UPSET,
					"It didn't end happily. Poor Gar'rth, we didn't know he was...",
					"Well, it would be unfair for me to say. That's his secret,",
					"not mine.");
			stage = 18;
			break;
		case 18:
			sendPlayerDialogue(NORMAL, "What about the terrible creature?");
			stage = 19;
			break;
		case 19:
			sendNPCDialogue(npcId, HAPPY,
					"It was brought to justice, but not before claiming many",
					"innocents.");
			stage = 20;
			break;
		case 20:
			sendPlayerDialogue(NORMAL, "Go on, tell me about Gar'rth.");
			stage = 21;
			break;
		case 21:
			sendNPCDialogue(npcId, NORMAL,
					"Another time, perhaps? I have work to do.");
			stage = 22;
			break;
		case 22:
			sendPlayerDialogue(MILDLY_ANGRY, "Hmpf!");
			stage = 50;
			break;
		case 50:
			end();
			break;
		}
	}

	@Override
	public void finish() {
		// TODO Auto-generated method stub

	}

}
