package com.rs.game.player.dialogues.impl;

import com.rs.game.WorldTile;
import com.rs.game.player.content.Magic;
import com.rs.game.player.dialogues.Dialogue;

public class RevPortal extends Dialogue {

	
	@Override
	public void start() {
		//oldDice = (Integer) parameters[0];
		sendOptionsDialogue("This portal leads to Revenants, this is in the WILDERNESS!", "Take me there!", "Nevermind.");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
			case -1:
				if(componentId == OPTION_1) {
					Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3120, 10121, 0));
				} else if(componentId == OPTION_2) {
					close();
			break;
				}
				}
	}
	

	@Override
	public void finish() {
		
	}
}
