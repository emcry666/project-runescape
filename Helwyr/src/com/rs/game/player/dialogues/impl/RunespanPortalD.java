package com.rs.game.player.dialogues.impl;

import com.rs.game.player.controlers.RunespanControler;
import com.rs.game.player.dialogues.Dialogue;

public class RunespanPortalD extends Dialogue {

	@Override
	public void start() {
		sendOptionsDialogue("Where would you like to travel to?",
				"The Runecrafting Guild",
				"Enter Runespan");
		stage = 1;
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (stage == 1) {
			if (componentId == OPTION_1) {
				player.getPackets().sendGameMessage(
						"That option isn't yet working.", true);
				close();
			} else{
				RunespanControler.enterRunespan(player, componentId == OPTION_3);
				close();
			} 
		}

	}

	@Override
	public void finish() {

	}

}
