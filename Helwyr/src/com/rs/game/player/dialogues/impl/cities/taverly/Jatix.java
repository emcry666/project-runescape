package com.rs.game.player.dialogues.impl.cities.taverly;

import com.rs.game.player.dialogues.Dialogue;

public class Jatix extends Dialogue {
	
	private int npcId;

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		sendNPCDialogue(npcId, CONFUSED, "Sorry, but I can only serve members in this store.");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
		case -1:
			end();
			break;
		}
	}

	@Override
	public void finish() {
		// TODO Auto-generated method stub
		
	}

}
