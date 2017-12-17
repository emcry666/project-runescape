package com.rs.game.player.dialogues.impl.cities.alkharid;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.game.player.dialogues.Mood;
import com.rs.utils.ShopsHandler;

public class Ranael extends Dialogue {

	@Override
	public int getNPCID() {
		return 544;
	}

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		sendNPCChat(Mood.ASKING, "Do you want to buy any armoured skirts? Designed "
				+ "especially for ladies who like to fight.");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
		case -1:
			sendOptionsDialogue(DEFAULT, "Yes please.", "No thank you, that's not my scene.");
			stage = 0;
			break;
			
		case 0:
			switch(componentId) {
			case OPTION_1:
				sendPlayerChat(Mood.NORMAL, "Yes please.");
				stage = -3;
				break;
			case OPTION_2:
				sendPlayerChat(Mood.NORMAL, "No thank you, that's not my scene.");
				stage = -2;
				break;
			}
			break;

		case -2:
			end();
			break;
			
		case -3:
			end();
			ShopsHandler.openShop(player, 38);
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
