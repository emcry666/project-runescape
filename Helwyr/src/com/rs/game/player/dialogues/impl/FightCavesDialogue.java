package com.rs.game.player.dialogues.impl;

import com.rs.game.player.controlers.FightCavesHardMode;
import com.rs.game.player.dialogues.Dialogue;

public class FightCavesDialogue extends Dialogue {
	
	@Override
	public void start() {
		sendOptionsDialogue("Choose your difficulty",
				"Normal",
				"Hard");
				//"High level entrance into the Runespan");
		//stage = 1;
	}
	
	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
		case 0:
			switch(componentId) {
			case OPTION_1:
				//stage = 1;
				player.getControlerManager().startControler("FightCaves", 0);
				close();
			break;
			case OPTION_2:
				//stage = 1;
				FightCavesHardMode.enterFightCavesHardMode(player);
				close();
			break;
			}
		break;
		
		}
	}

	@Override
	public void finish() {
		
	}
}