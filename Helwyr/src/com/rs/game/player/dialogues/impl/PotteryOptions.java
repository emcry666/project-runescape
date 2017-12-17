package com.rs.game.player.dialogues.impl;
import com.rs.game.player.actions.Urns;
import com.rs.game.player.dialogues.Dialogue;

public class PotteryOptions extends Dialogue {

	@Override
	public void start() {
		sendOptionsDialogue("Which would you like to do?", "Pottery Crafting", "Urn Crafting");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch (stage) {
		case -1:
			switch (componentId) {
			case OPTION_1:
				player.getDialogueManager().startDialogue("UrnsD", 
						Urns.UrnData.forId(Urns.PRODUCTS[0][0]),
						Urns.UrnData.forId(Urns.PRODUCTS[0][1]),
						Urns.UrnData.forId(Urns.PRODUCTS[0][2]),
						Urns.UrnData.forId(Urns.PRODUCTS[0][3]),
						Urns.UrnData.forId(Urns.PRODUCTS[0][4]));//correct lil nigga - parameters are here
				break;
			case OPTION_2:
				sendOptionsDialogue("Which type of Urn?",
						"Cooking",
						"Fishing",
						"Mining",
						"Prayer",
						"Next Page");
				stage = 1;
				break;
			}
			break;
		case 1:
			switch (componentId) {
			case OPTION_1:
				player.getDialogueManager().startDialogue("UrnsD",
						Urns.UrnData.forId(Urns.PRODUCTS[1][0]),
						Urns.UrnData.forId(Urns.PRODUCTS[1][1]),
						Urns.UrnData.forId(Urns.PRODUCTS[1][2]),
						Urns.UrnData.forId(Urns.PRODUCTS[1][3]),
						Urns.UrnData.forId(Urns.PRODUCTS[1][4]));
				break;
			case OPTION_2:
				player.getDialogueManager().startDialogue("UrnsD",
						Urns.UrnData.forId(Urns.PRODUCTS[2][0]),
						Urns.UrnData.forId(Urns.PRODUCTS[2][1]),
						Urns.UrnData.forId(Urns.PRODUCTS[2][2]),
						Urns.UrnData.forId(Urns.PRODUCTS[2][3]),
						Urns.UrnData.forId(Urns.PRODUCTS[2][4]));
				break;
			case OPTION_3:
				player.getDialogueManager().startDialogue("UrnsD",
						Urns.UrnData.forId(Urns.PRODUCTS[3][0]),
						Urns.UrnData.forId(Urns.PRODUCTS[3][1]),
						Urns.UrnData.forId(Urns.PRODUCTS[3][2]),
						Urns.UrnData.forId(Urns.PRODUCTS[3][3]),
						Urns.UrnData.forId(Urns.PRODUCTS[3][4]));
				break;
			case OPTION_4:
				player.getDialogueManager().startDialogue("UrnsD",
						Urns.UrnData.forId(Urns.PRODUCTS[4][0]),
						Urns.UrnData.forId(Urns.PRODUCTS[4][1]),
						Urns.UrnData.forId(Urns.PRODUCTS[4][2]));
				break;
			case OPTION_5:
				sendOptionsDialogue("Which type of Urn?",
						"Smithing",
						"Woodcutting",
						"Previous Page");
				stage = 2;
				break;
			}
			break;
		case 2:
			switch (componentId) {
				case OPTION_1:
					player.getDialogueManager().startDialogue("UrnsD",
							Urns.UrnData.forId(Urns.PRODUCTS[5][0]),
							Urns.UrnData.forId(Urns.PRODUCTS[5][1]),
							Urns.UrnData.forId(Urns.PRODUCTS[5][2]),
							Urns.UrnData.forId(Urns.PRODUCTS[5][3]));
					break;
				case OPTION_2:
					player.getDialogueManager().startDialogue("UrnsD",
							Urns.UrnData.forId(Urns.PRODUCTS[6][0]),
							Urns.UrnData.forId(Urns.PRODUCTS[6][1]),
							Urns.UrnData.forId(Urns.PRODUCTS[6][2]),
							Urns.UrnData.forId(Urns.PRODUCTS[6][3]));
					break;
				case OPTION_3:
					sendOptionsDialogue("Which type of Urn?",
							"Fishing",
							"Cooking",
							"Mining",
							"Smithing",
							"Next Page");
					stage = 1;
					break;
				}
			break;
		}
	}


	@Override
	public void finish() {

	}

}
