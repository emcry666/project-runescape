package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;

public class ElvenGrimorie extends Dialogue {


	public boolean isFirstOption;

	@Override
	public void start() {
		isFirstOption = (Boolean) parameters[0];
		if(isFirstOption) {
			options(DEFAULT, "Swap Spellbook", "Swap Prayer");
			stage = -1;
		} else {
			options(DEFAULT, "Normals", "Ancients", "Lunars");
			stage = 2;
		}
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
		case -1:
			switch(componentId) {
			case OPTION_1:
				options(DEFAULT, "Normals", "Ancients", "Lunars");
				stage = 2;
				break;
			case OPTION_2:
				close();
				player.getDialogueManager().startDialogue("ZarosAltar");
				break;
			}
			break;

		case 2:
			switch(componentId) {
			case OPTION_1:
				close();
				player.getCombatDefinitions().setSpellBook(0);
				break;
			case OPTION_2:
				close();
				player.getDialogueManager().startDialogue("AncientAltar");
				break;
			case OPTION_3:
				close();
				player.getDialogueManager().startDialogue("LunarAltar");
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
