package com.rs.game.player.dialogues.impl;

import com.rs.game.World;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.Utils;

public class TzHaarMejJal extends Dialogue {

	private int npcId;

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		sendNPCDialogue(npcId, 9827, "You want help JalYt-Ket-" + player.getDisplayName() + "?");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch (stage) {
		case -1:
			stage = 0;
			sendOptionsDialogue(DEFAULT, "What is this place?", "I have this fire cape.", "Nevermind.");
			break;
		case 0:
			switch (componentId) {
			case OPTION_1:
				stage = 1;
				sendPlayerDialogue(9827, "What is this place?");
				break;
			case OPTION_2:
				stage = 11;
				sendPlayerDialogue(9827, "I have this fire cape.");
				break;
			case OPTION_3:
			default:
				stage = 20;
				sendPlayerDialogue(9827, "Nevermind.");
				break;
			}
			break;
		case 1:
			stage = 2;
			sendNPCDialogue(npcId, 9827, "This is the Fight Cave, ThzHaar-Xil made it for practice but many JalYt come here to fight, too. Just enter the cave and make sure you're prepared.");
			break;
		case 2:
			stage = 3;
			sendOptionsDialogue(DEFAULT, "Are there any rules?", "Ok thanks.");
			break;
		case 3:
			switch (componentId) {
			case OPTION_1:
				stage = 4;
				sendPlayerDialogue(9827, "Are there any rules?");
				break;
			case OPTION_2:
			default:
				stage = -2;
				sendPlayerDialogue(9827, "Ok thanks.");
				break;
			}
			break;
		case 4:
			stage = 5;
			sendNPCDialogue(npcId, 9827, "Rules? Survival is the only rule in there.");
			break;
		case 5:
			stage = 6;
			sendOptionsDialogue(DEFAULT, "Do I win anything?", "Sounds good.");
			break;
		case 6:
			switch (componentId) {
			case OPTION_1:
				stage = 7;
				sendPlayerDialogue(9827, "Do I win anything?");
				break;
			case OPTION_2:
			default:
				stage = -2;
				sendPlayerDialogue(9827, "Sounds good.");
				break;
			}
			break;
		case 7:
			stage = 8;
			sendNPCDialogue(npcId, 9827, "You ask a lot questions.<br>Might give you TokKul if you last long enough.");
			break;
		case 8:
			stage = 9;
			sendPlayerDialogue(9827, "...");
			break;
		case 9:
			stage = 10;
			sendNPCDialogue(npcId, 9827, "Before you ask, TokKul is like your coins.");
			break;
		case 10:
			stage = -2;
			sendNPCDialogue(npcId, 9827, "Gold is like you JalYt, soft and easily broken, we use hard rock forged in fire like TzHaar!");
			break;
		case 11:
			stage = 12;
			sendNPCDialogue(npcId, 9827, "So, you want a shot at the TzHur-Jad huh?");
			break;
		case 12:
			stage = 13;
			sendOptionsDialogue(DEFAULT, "Yes, sacrifice my fire cape.", "Nevermind.");
			break;
		case 13:
			switch (componentId) {
			case OPTION_1:
				//stage = 14;
				if (player.getFamiliar() != null) {
					player.sm("Please pick your follower up before doing this.");
					close();
				}
				if (!player.getInventory().containsItem(6570, 1)) {
					sendNPCDialogue(npcId, 9827, "You're going to need a fire cape first JalYt, this isn't a charity.");
					break;
				}
				player.getInventory().deleteItem(6570, 1);
				if (Utils.random(19) == 5) {
					player.getPetManager().spawnPet(21512, true);
					sendNPCDialogue(npcId, 9827, "Ha! Looks like it paid off, congratulations JalYt.");
					World.sendWorldMessage("<col=FF9900><img=7> "
							+ player.getDisplayName()
							+ " just gambled their fire cape and recieved a Pet Jad!", false);
				} else {
					sendNPCDialogue(npcId, 9827, "Bad luck. Maybe next time JalYt.");		
				}
				break;
			case OPTION_2:
				stage = -2;
				sendPlayerDialogue(9827, "I guess so...");
				break;
			}
			break;
		case 14:
			stage = 15;
			sendNPCDialogue(npcId, 9827, "That what you are...you tough and strong, no?");
			break;
		case 15:
			stage = 16;
			sendPlayerDialogue(9827, "Well, yes I suppose I am...");
			break;
		case 16:
			stage = 17;
			sendNPCDialogue(npcId, 9827, "Then you JalYt-Ket!");
			break;
		case 17:
			stage = 18;
			sendOptionsDialogue(DEFAULT, "What are you then?", "Thanks for explaining it.");
			break;
		case 18:
			switch (componentId) {
			case OPTION_1:
				stage = 19;
				sendPlayerDialogue(9827, "What are you then?");
				break;
			case OPTION_2:
			default:
				stage = -2;
				sendPlayerDialogue(9827, "Thanks for explaining it.");
				break;
			}
			break;
		case 19:
			stage = 20;
			sendNPCDialogue(npcId, 9827, "Foolish JalYt, I am TzHaar-Mej one of the mystics of this city.");
			break;
		case 20:
			stage = 21;
			sendOptionsDialogue(DEFAULT, "What other types are there?", "Ah ok then.");
			break;
		case 21:
			stage = 22;
			switch (componentId) {
			case OPTION_1:
				stage = 22;
				sendPlayerDialogue(9827, "What other types are there?");
				break;
			case OPTION_2:
			default:
				stage = -2;
				sendPlayerDialogue(9827, "Ah ok then.");
				break;
			}
			break;
		case 22:
			stage = -2;
			sendNPCDialogue(npcId, 9827, "There are the mighty TzHaar-Key who guard us, the swift TzHaar-Xil who hunt for our food, and the skilled TzHaar-Hur who creft our homes and tools.");
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
