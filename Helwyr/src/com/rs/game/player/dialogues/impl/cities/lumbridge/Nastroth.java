package com.rs.game.player.dialogues.impl.cities.lumbridge;

import com.rs.game.player.dialogues.Dialogue;

public class Nastroth extends Dialogue {

	public int npcId;

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		sendNPCDialogue(npcId, PLAIN_TALKING_FACE, "Greetings, adventurer.");
		stage = 1;
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch (stage) {
		case 1:
			sendNPCDialogue(npcId, PLAIN_TALKING_FACE,
					"I am Nastroth, I am here to tell the good citizens about Bounty Hunter.");
			stage = 2;
			break;
		case 2:
			sendOptionsDialogue("What's Bounty Hunter?",
					"Can you explain the rules?", "Can you take me there?",
					"Nevermind.");
			stage = 3;
			break;
		case 3:
			switch (componentId) {
			case OPTION_1:
				sendPlayerDialogue(ASKING_FACE, "What's Bounty Hunter?");
				stage = 4;
				break;
			case OPTION_2:
				sendPlayerDialogue(ASKING_FACE, "Can you explain the rules?");
				stage = 5;
				break;
			case OPTION_3:
				sendPlayerDialogue(ASKING_FACE, "Can you take me there?");
				stage = 9;
				break;
			case OPTION_4:
				sendPlayerDialogue(PLAIN_TALKING_FACE, "Nevermind.");
				stage = 10;
				break;
			}
			break;
		case 4:
			sendNPCDialogue(npcId, PLAIN_TALKING_FACE,
					"Ah you'll have to speak to my brother, I can take you to him.");
			stage = 3;
			break;
		case 5:
			sendNPCDialogue(
					npcId,
					PLAIN_TALKING_FACE,
					"The rules are simple. Upon entering you'll be assigned a suitable target. The bank is a flagged spot where you will be out of the Bounty zone - you cannot be assigned a target in this zone.");
			stage = 6;
			break;
		case 6:
			sendNPCDialogue(
					npcId,
					PLAIN_TALKING_FACE,
					"You will have a skull on your head at all times whilst inside the crater which is the wilderness [From the ditch of Edgeville all the way to the fence just before the Magic Arena], or the lobby [Which is all of Edgeville]. A skull will have a stack of coins next to it, the higher the stack - the more wealth you are carrying.");
			stage = 7;
			break;
		case 7:
			sendNPCDialogue(
					npcId,
					PLAIN_TALKING_FACE,
					"You also have an EP [Earning Potential] which will gradually increase the longer you stay in a dangerous zone. When you kill your target in addition to their loot you will recieve various artifacts depending on your EP that my brother and I collect.");
			stage = 8;
			break;
		case 8:
			sendNPCDialogue(
					npcId,
					PLAIN_TALKING_FACE,
					"If you find any - be sure to bring it to either me or my brother. We will reward you handsomely.");
			stage = 3;
			break;
		case 9:
			sendNPCDialogue(npcId, PLAIN_TALKING_FACE, "Absolutely!");
			stage = 10;
			break;
		case 10:
			end();
			// TODO DAMN ADIL player.nextLocation(new Location());
			break;
		}
	}

	@Override
	public void finish() {

	}

}
