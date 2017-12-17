package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

public class Miner extends Dialogue {

	int npcId;

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		sendNPCDialogue(npcId, 9827, "Welcome to Lava-flow mine.");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch (stage) {
		case -1:
			stage = 0;
			sendOptionsDialogue(DEFAULT,
					"Exchange pieces.", "Nevermind.");
			break;
		case 0:
			if (componentId == OPTION_2) {
				stage = 1;
				sendPlayerDialogue(9827, "Nevermind.");
			} else {
				stage = 2;
				sendPlayerDialogue(9827, "I would like to excange my pieces wich i collected from lava.");
			}
			break;
		case 1:
			stage = -2;
			sendNPCDialogue(npcId, 9827,
					"Well, please return if you change your mind.");
			break;
		case 2:
			stage = 3;
			sendNPCDialogue(
					npcId,
					9828,
					"Sure. I think you should get golden arrmours. They gives good bonus mining xp!");
			break;
		case 3:
			stage = 4;
			sendOptionsDialogue(DEFAULT,
					"Show me the shop, show me!",
					"Pff... I can train my mining whithout it...");
			break;
		case 4:
			if (componentId == OPTION_2) {
				close();
			} else {
				stage = 5;
				{
				ShopsHandler.openShop(player, 61);
			}
			close();
			break;
			}
		case 5:
			stage = 6;
			close();
			break;
		case 6:
			close();
		default:
			close();
			break;
		}
	}

	@Override
	public void finish() {

	}

}