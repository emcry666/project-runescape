package com.rs.game.player.dialogues.impl.cities.varrock;

import com.rs.game.player.dialogues.Dialogue;

public class Hops extends Dialogue {

	private int npcId;

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		sendNPCDialogue(npcId, DRUNK, "Hops don't wanna talk now.",
				"Try different world, HIC!");
		stage = 50;
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch (stage) {
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
