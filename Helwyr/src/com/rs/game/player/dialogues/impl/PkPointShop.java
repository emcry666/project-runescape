package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;

public class PkPointShop extends Dialogue {

	int npcId = 8228;

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		sendNPCDialogue(npcId, 9827, "Welcome to the PK Points shop. What would you like to do?");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
		case -1:
			stage = 0;
			sendOptionsDialogue(DEFAULT, "Imbue Berserker Ring [30 pts]",
					"Imbue Archers' Ring [30 pts]", "Imbue Seers' Ring [30 pts]", "Armadyl godsword [100 pts]", 
							"Dragon claws [100 pts]");
			break;
		case 0:
			if(componentId == OPTION_1) {
				//stage = 1;
				if (player.pkpoints >= 30 &&
						player.getInventory().containsItem(6737, 1)){
						player.getInventory().deleteItem(6737, 1);
						player.getInventory().addItem(15220, 1);
						player.pkpoints -= 30;
						player.sm("You have "+player.pkpoints +" points left");
					} else {
						player.sm("You do not have the requirements for this.");
					}
					close();
			}else if(componentId == OPTION_2) {
				//stage = 2;
				if (player.pkpoints >= 20 &&
						player.getInventory().containsItem(6733, 1)){
						player.getInventory().deleteItem(6733, 1);
						player.getInventory().addItem(15019, 1);
						player.pkpoints -= 20;
						player.sm("You have "+player.pkpoints +" points left");
					} else {
						player.sm("You do not have the requirements for this.");
					}
					close();
			}else if(componentId == OPTION_3) {
				//stage = 2;
				if (player.pkpoints >= 20 &&
						player.getInventory().containsItem(6731, 1)){
						player.getInventory().deleteItem(6731, 1);
						player.getInventory().addItem(15018, 1);
						player.pkpoints -= 20;
						player.sm("You have "+player.pkpoints +" points left");
					} else {
						player.sm("You do not have the requirements for this.");
					}
					close();
			}else if(componentId == OPTION_4) {
				//stage = 2;
				if (player.pkpoints >= 100) {
					player.getInventory().addItem(11694, 1);
					player.pkpoints -= 100;
					player.sm("You have "+player.pkpoints +" points left");
				} else {
					player.sm("You do not have the requirements for this.");
				}
				close();
				}else if(componentId == OPTION_5) {
				//stage = 2;
					if (player.pkpoints >= 100) {
						player.getInventory().addItem(14484, 1);
						player.pkpoints -= 100;
						player.sm("You have "+player.pkpoints +" points left");
					} else {
						player.sm("You do not have the requirements for this.");
					}
					close();
			}
			break;
		default:
			close();
			break;
		}
	}

	@Override
	public void finish() {

	}

}
