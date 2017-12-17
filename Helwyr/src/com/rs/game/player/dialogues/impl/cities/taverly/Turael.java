package com.rs.game.player.dialogues.impl.cities.taverly;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

public class Turael extends Dialogue {
	
	private int npcId;

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		sendNPCDialogue(npcId, PLAIN_TALKING, "'Ello, and what are you after, then?");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
		case -1:
			sendOptionsDialogue(DEFAULT, "I need another assignment.", "Do you have anything for trade?", "I am here to discuss any rewards I might be eligible for.", "Err...nothing...");
			stage = 0;
			break;
		case 0:
			switch(componentId) {
			case OPTION_1:
				//GIVE SLAYER ASSIGNMENT HERE
				end();
				break;
			case OPTION_2:
				ShopsHandler.openShop(player, 54);
				end();
				break;
			case OPTION_3:
				end();
				break;
			case OPTION_4:
				end();
				break;
			}
			break;
		}
	}

	@Override
	public void finish() {
		// TODO Auto-generated method stub
		
	}

}
