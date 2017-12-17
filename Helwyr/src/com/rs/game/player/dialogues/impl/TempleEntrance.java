package com.rs.game.player.dialogues.impl;

import com.rs.game.WorldTile;
import com.rs.game.player.dialogues.Dialogue;

public class TempleEntrance extends Dialogue {

	@Override
	public void start() {
		sendDialogue("Passing this gate costs 50,000 Dungeoneering tokens. Pay the fee?");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (stage == -1) {
			stage = 0;
			sendOptionsDialogue(DEFAULT,
					"Yes.", "No.");
		} else if (stage == 0) {
			if (componentId == OPTION_1) {
				if (player.getInventory().containsItem(29898, 50000)) {
				player.setNextWorldTile(new WorldTile(player.getX() + 2, player.getY(), player.getPlane()));
				player.getInventory().deleteItem(29898, 50000);
				close();
				} else {
					player.getDialogueManager().startDialogue("SimpleMessage", "You do not have enough tokens to enter!");
				}
				//end();
			}
			if (componentId == OPTION_2) {
				close();
			}
		}
	}

	@Override
	public void finish() {

	}

}
