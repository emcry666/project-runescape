package com.rs.game.player.dialogues.impl.vorago;

import com.rs.game.player.dialogues.Dialogue;

import com.rs.game.npc.vorago.VoragoHandler;

public class VoragoAccChallenge extends Dialogue {

	@Override
	public void start() {
		sendNPCDialogue(17161, NORMAL, VoragoHandler.CHALLENGER_NAME + " has challenged me, do you wish to join them?");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch (stage) {
		case -1:
			stage = 0;
			sendOptionsDialogue("Do you accept the challenge?", "Yes", "No");
			break;
		case 0:
			if (componentId == OPTION_1) {
				player.getTemporaryAttributtes().put("accRagoChall", true);
				end();
			} else if (componentId == OPTION_2) {
				player.getTemporaryAttributtes().put("accRagoChall", false);
				end();
			}
			break;
		default:
			end();
			break;
		}

	}

	@Override
	public void finish() {

	}
	
}
