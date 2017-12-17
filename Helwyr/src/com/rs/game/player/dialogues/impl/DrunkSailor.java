package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;

public class DrunkSailor extends Dialogue {

	int npcId = 7116;

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		sendNPCDialogue(npcId, 9827, "Fuhhhkk.. Where am I?");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
		case -1:
			stage = 0;
			sendOptionsDialogue(DEFAULT, "Donator Island.", "Are you drunk?");
			break;
		case 0:
			if(componentId == OPTION_2) {
				stage = 1;
				sendPlayerDialogue(9827, "Are you drunk?");
			}else {
				stage = 2;
				sendPlayerDialogue(9827, "Donator Island.");
			}
			break;
		case 1:
			stage = -2;
			sendNPCDialogue(npcId, 9827, "The fuck does it look like!? I can't even stand up!");
			break;
		case 2:
			stage = 3;
			sendNPCDialogue(npcId, 9827, "Oh, that's right! Now let me be...");
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
