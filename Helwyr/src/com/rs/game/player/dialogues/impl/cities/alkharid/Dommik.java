package com.rs.game.player.dialogues.impl.cities.alkharid;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.game.player.dialogues.Mood;
import com.rs.utils.ShopsHandler;

public class Dommik extends Dialogue {

	@Override
	public int getNPCID() {
		return 545;
	}


	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		sendNPCChat(Mood.ASKING, "Would you like to buy some crafting equipment?");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
		case -1:
			sendOptionsDialogue(DEFAULT, "No thanks; I've got all the Crafting equipment I need.", "Let's see what you've got, then.");
			stage = 1;
			break;
			
		case 1:
			switch(componentId) {
			case OPTION_1:
				sendPlayerChat(Mood.NORMAL, "No thanks; I've got all the Crafting equipment I need.");
				stage = 0;
				break;
			case OPTION_2:
				sendPlayerChat(Mood.NORMAL, "Let's see what you've got, then.");
				stage = -3;
				break;
			}
			break;
			
		case 0:
			sendNPCChat(Mood.NORMAL, "Okay. Fare well on your travels.");
			stage = -2;
			break;
			
		case -2:
			end();
			break;
			
		case -3:
			end();
			ShopsHandler.openShop(player, 13);
			break;
			
		default:
			end();
			break;
		}
	}

	@Override
	public void finish() {
		// TODO Auto-generated method stub

	}

}
