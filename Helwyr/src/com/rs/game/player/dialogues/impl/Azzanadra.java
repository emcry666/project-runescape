package com.rs.game.player.dialogues.impl;

import com.rs.game.WorldTile;
import com.rs.game.player.dialogues.Dialogue;

public final class Azzanadra extends Dialogue {

	@Override
	public void start() {
		sendDialogue("Azzandra says nothing.", "He holds out his hand, as if asking for something...");
		stage = -1;
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
		
		case -1:
			if (player.getInventory().containsOneItem(14876)) {
				sendOptionsDialogue("Give Azzandra an ancient statuette?",
						"Yes.", "No.");
				stage = 0;
			} else {
				sendDialogue("You must have an ancient statuette to give Azzandra..");
				stage = -2;
			}
			break;
			
		case 0:
			switch(componentId) {
			case OPTION_1:
				if (player.getInventory().containsItem(14876, 1)) {
					sendOptionsDialogue("Would you like to begin the encounter?", "Yes.", "No.");
					stage = 1;
				} else {
					player.sm("You need an ancient statuette to do this.");
					stage = -2;
				}
				break;
			}
			break;
			
		case 1:
			switch(componentId) {
			case OPTION_1:
				sendDialogue("Very Well...");
				player.getInventory().deleteItem(14876, 1);
				player.setNextWorldTile(new WorldTile(1500, 4956, 0));
				stage = -2;
				break;
			case OPTION_2:
				close();
				break;
			}
			break;
			
		case -2:
			close();
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