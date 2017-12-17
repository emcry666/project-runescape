package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;

public class DrunkGuy extends Dialogue {

	int npcId = 2203;

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		sendNPCDialogue(npcId, 9827, "W... Welcome to the... Uh, Donator Island.. You want a drink?");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
		case -1:
			stage = 0;
			sendOptionsDialogue(DEFAULT, "Yes, please.", "No, thank you.");
			break;
		case 0:
			if(componentId == OPTION_2) {
				stage = 1;
				sendPlayerDialogue(9827, "No, thank you.");
			}else {
				stage = 2;
				sendPlayerDialogue(9827, "Yes, please.");
			}
			break;
		case 1:
			stage = -2;
			sendNPCDialogue(npcId, 9827, "Very well. Come back if you change your mind.");
			break;
		case 2:
			stage = 3;
			sendNPCDialogue(npcId, 9827, "That's the spirit! Turn up mother fucker!");
			player.getInventory().addItem(1917, 1);
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
