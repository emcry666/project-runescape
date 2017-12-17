package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;

public class Guildmaster extends Dialogue {

	private int npcId;
	
	@Override
	public void start() {
		npcId = 8332;
		sendNPCDialogue(npcId, 9827, "Welcome to Donator Island!" );
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
		case -1:
			stage = 0;
			sendPlayerDialogue(9827, "What is there to do here?" );
		break;
		case 0:
			stage = -2;
			sendNPCDialogue(npcId, 9827, "There are skilling spots all around the island!",
					"Also, in some buildings you will find exclusive, donator-only shops.",
					"Have a drink at the pub if you'd like!");
		break;
		default:
			close();
		break;
		}

	}

	@Override
	public void finish() {
		// TODO Auto-generated method stub

	}

}
