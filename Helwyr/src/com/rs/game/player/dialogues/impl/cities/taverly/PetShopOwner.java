package com.rs.game.player.dialogues.impl.cities.taverly;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

public class PetShopOwner extends Dialogue {
	
	private int npcId;

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		sendOptionsDialogue(DEFAULT, "Can I see your shop, please?", "How much is that puppy in the window?", "So, what sorts of pets are available?", "Are you interested in buying spirit shards?");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
		case -1:
			switch(componentId) {
			case OPTION_1:
				sendPlayerDialogue(NORMAL, "Can I see your shop please?");
				stage = 0;
				break;
			case OPTION_2:
				sendPlayerDialogue(NORMAL, "How much is that puppy in the window?");
				stage = 1;
				break;
			case OPTION_3:
				sendPlayerDialogue(NORMAL, "So, what sorts of pets are available?");
				stage = 4;
				break;
			case OPTION_4:
				sendPlayerDialogue(NORMAL, "Are you interested in buying spirit shards?");
				stage = 23;
				break;
			}
			break;
		case 0:
			ShopsHandler.openShop(player, 163);
			end();
			break;
		case 1:
			sendNPCDialogue(npcId, SAD, "I'm sorry, but I can't sell them to you, I'm afraid. You" ,"don't strike me as having an affinity with animals.");
			stage = 2;
			break;
		case 2:
			sendPlayerDialogue(SAD, "Awww...");
			stage = 3;
			break;
		case 3:
			end();
			break;
		case 4:
			sendNPCDialogue(npcId, PLAIN_TALKING, "Well, here we sell dogs, but we also have supplies for any", "other creatures you might want to raise.");
			stage = 5;
			break;
		case 5:
			sendPlayerDialogue(NORMAL, "Such as?");
			stage = 6;
			break;
		case 6:
			sendNPCDialogue(npcId, PLAIN_TALKING, "Well, we sell nuts. Those can be used to feed squirrels. If", "you want to capture a squirrel, you'll need to use the nuts", "on the trap you set, as the little scamps won't be fooled", "by anything else.");
			stage = 7;
			break;
		case 7:
			sendPlayerDialogue(HAPPY, "I'll bear that in mind!");
			stage = 8;
			break;
		case 8:
			sendNPCDialogue(npcId, PLAIN_TALKING, "There are also a number of birds that live in the", "woodlands of the world. If you can find their eggs then", "you can use the incubator over there to hatch it.");
			stage = 9;
			break;
		case 9:
			sendNPCDialogue(npcId, HAPPY, "So long as you are the first thing they see out of the", "shell, they will follow you anywhere.");
			stage = 10;
			break;
		case 10:
			sendNPCDialogue(npcId, PLAIN_TALKING, "After that, you just need to feed the chick ground fishing", "bait until it's old enough to eat it solid.");
			stage = 11;
			break;
		case 11:
			sendPlayerDialogue(NORMAL, "I'll make sure to keep an eye on them if I go anywhere", "dangerous.");
			stage = 12;
			break;
		case 12:
			sendNPCDialogue(npcId, PLAIN_TALKING, "There are also a number of fabulous and exotic lizards in", "Karamja. Some can be caught easily in a box trap, while", "others will need to be raised from an egg.");
			stage = 13;
			break;
		case 13:
			sendPlayerDialogue(NORMAL, "Will the incubator work for them, too?");
			stage = 14;
			break;
		case 14:
			sendNPCDialogue(npcId, HAPPY, "Of course! I'll keep an eye on all the eggs you put in there,", "so they will never end up hard-boiled.");
			stage = 15;
			break;
		case 15:
			sendPlayerDialogue(LISTENS_THEN_LAUGHS, "Thank goodness!");
			stage = 16;
			break;
		case 16:
			sendNPCDialogue(npcId, PLAIN_TALKING, "The geckos of Karamja are quite easy to trap, like", "raccoons. Both will investigate a trap happily without any", "special bait.");
			stage = 17;
			break;
		case 17:
			sendNPCDialogue(npcId, LISTENS_THEN_LAUGHS, "Monkeys are a different story, however!");
			stage = 18;
			break;
		case 18:
			sendPlayerDialogue(NORMAL, "What do you mean?");
			stage = 19;
			break;
		case 19:
			sendNPCDialogue(npcId, PLAIN_TALKING, "Well, they are clever little things and can easily get out of", "a box trap, unless they are stuck. The easiest way to do", "that is to put a banana into the workings.");
			stage = 20;
			break;
		case 20:
			sendNPCDialogue(npcId, PLAIN_TALKING, "They will hang on tight, and never let go, even when the", "trap closes!");
			stage = 21;
			break;
		case 21:
			sendPlayerDialogue(HAPPY, "Thanks a lot, you've been very helpful!");
			stage = 22;
			break;
		case 22:
			sendNPCDialogue(npcId, PLAIN_TALKING, "It's always a pleasure to help a fellow animal-lover. Come", "back and visit soon.");
			stage = 50;
			break;
		case 23:
			sendNPCDialogue(npcId, HAPPY, "I certainly am. Lots of them, too!");
			stage = 24;
			break;
		case 24:
			sendPlayerDialogue(HAPPY, "Thanks, I'll bear that in mind.");
			stage = 50;
			break;
		case 50:
			end();
			break;
		}
	}

	@Override
	public void finish() {
		// TODO Auto-generated method stub
		
	}

}
