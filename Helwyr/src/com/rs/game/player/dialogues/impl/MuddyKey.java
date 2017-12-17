package com.rs.game.player.dialogues.impl;

import com.rs.game.player.controlers.bosses.SkeletalHorrorController;
import com.rs.game.player.dialogues.Dialogue;

public class MuddyKey extends Dialogue {

	@Override
	public void start() {
		if (parameters.length > 0) {
			sendOptionsDialogue("Fight again?","Yes.", "No");
			stage = 3;
			return;
		}
		sendDialogue("You hear a loud growl as you put the key into the keyhole, are you sure you want to enter?");	
		stage = 1;
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
		case 1:
			sendOptionsDialogue("Use your key?", "Yes.", "No");
			stage = 2;
			break;
		case 2:
			if (componentId == OPTION_1) {
				player.getInventory().deleteItem(991, 1);
				player.getControlerManager().startControler("SkeletalHorrorController");
			}
			close();
			break;
		case 3:
			if (player.getControlerManager().getControler() instanceof SkeletalHorrorController) {
				((SkeletalHorrorController) player.getControlerManager().getControler()).respawnHorror();
			}
			close();
			break;
		}
	}

	@Override
	public void finish() {
		
	}
	
	

}
