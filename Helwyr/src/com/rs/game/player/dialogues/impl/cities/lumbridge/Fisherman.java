package com.rs.game.player.dialogues.impl.cities.lumbridge;

import com.rs.game.player.dialogues.Dialogue;

public class Fisherman extends Dialogue {

	private int npcId;

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		sendNPCDialogue(npcId, UPSET_FACE,
				"You'll need to be a memeber to enter the Fish Flingers",
				"fishing competiton. I'll gladly tell you more about it,",
				"though.");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch (stage) {
		case -1:
			sendOptionsDialogue("What would you like to say?",
					"Can I enter the competition now?",
					"About Fish Flingers...", "Show me the rewards shop.",
					"Nevermind...");
			stage = 1;
			break;
		case 1:
			switch (componentId) {
			case OPTION_1:
				player.getInterfaceManager().sendInterface(1339);
				player.getPackets().sendIComponentText(1339, 4,
						"Become a member of arrow today!");
				break;
			case OPTION_2:
				sendNPCDialogue(npcId, ASKING_FACE,
						"What would you like me to tell you?");
				stage = 2;
				break;
			case OPTION_3:
				end();
				player.getInterfaceManager().sendInterface(925);
				break;
			case OPTION_4:
				end();
				break;
			}
			break;
		case 2:
			sendOptionsDialogue("What would you like to say?",
					"What is the competition about?", " How do I catch fish?",
					"How often can I compete?",
					"Let's talk about something else...");
			stage = 3;
			break;
		case 3:
			switch (componentId) {
			case OPTION_1:
				sendNPCDialogue(
						npcId,
						PLAIN_TALKING_FACE,
						"It's chance for you to show how well you can catch fish",
						"by choosing the best tackle and habitat.");
				stage = 4;
				break;
			case OPTION_2:
				sendNPCDialogue(
						npcId,
						PLAIN_TALKING_FACE,
						"Once I've teleported you, wait in the starting area for the",
						"competition to begin. Then, walk to the waterfront where",
						"you would like to fish.");
				stage = 7;
				break;
			case OPTION_3:
				sendNPCDialogue(
						npcId,
						PLAIN_TALKING_FACE,
						"Everyone is allowed 2 entry tickets every day. We hang on",
						"to the tickets for you, so there's no need to carry them",
						"about or store them in your bank.");
				stage = 11;
				break;
			case OPTION_4:
				stage = -1;
				break;
			}
			break;
		case 4:
			sendNPCDialogue(npcId, PLAIN_TALKING_FACE,
					"Us old- timers know of a special place, Isla Anglerine,",
					"where huge schools of unusual fish seem to gather.");
			stage = 5;
			break;
		case 5:
			sendNPCDialogue(
					npcId,
					PLAIN_TALKING_FACE,
					"I'm not sure what the fish find so appealing there, but it's",
					"a fisherman's paradise!");
			stage = 6;
			break;
		case 6:
			sendNPCDialogue(
					npcId,
					PLAIN_TALKING_FACE,
					"I can teleport you to the island if you want to take part.",
					"Just say the word.");
			stage = 2;
			break;
		case 7:
			sendNPCDialogue(
					npcId,
					PLAIN_TALKING_FACE,
					"Next, select a hook and bait that you think the fish will",
					"like, add some weights to get the cast distance you need,",
					"and you're ready to cast your line.");
			stage = 8;
			break;
		case 8:
			sendNPCDialogue(
					npcId,
					PLAIN_TALKING_FACE,
					"As you catch fish you'll be shown how effective your",
					"tackle is, and you'll be able to make improvements as you",
					"learn what each fish likes.");
			stage = 9;
			break;
		case 9:
			sendNPCDialogue(
					npcId,
					HAPPY_FACE,
					"Remember, different species are different sizes. You'll",
					"need to try fishing in different areas to find the heaviest",
					"species.");
			stage = 10;
			break;
		case 10:
			sendNPCDialogue(npcId, PLAIN_TALKING_FACE,
					"It's also worth remembering that fish are adaptable",
					"creatures, so tackle that works well in one competition",
					"might not work so well in the next.");
			stage = 2;
			break;
		case 11:
			sendNPCDialogue(npcId, PLAIN_TALKING_FACE,
					"If you want to know how many you have left, or you want",
					"to claim more tickets, just let me know.");
			stage = 12;
			break;
		case 12:
			sendOptionsDialogue("What would you like to say?",
					"How many entry tickets do I have left?",
					"When can I can next claim entry tickets?",
					"Is there another way of getting entry tickets?",
					"Let's talk about something else...");
			stage = 13;
			break;
		case 13:
			switch (componentId) {
			case OPTION_1:
				sendNPCDialogue(npcId, PLAIN_TALKING_FACE,
						"You have to become a member to obtain tickets.");
				stage = 12;
				break;
			case OPTION_2:
				sendNPCDialogue(
						npcId,
						PLAIN_TALKING_FACE,
						"Enough time has passed since you last claimed entry",
						"tickets, so you can claim more as soon as you have used up",
						"the ones you have left.");
				stage = 12;
				break;
			case OPTION_3:
				sendNPCDialogue(
						npcId,
						PLAIN_TALKING_FACE,
						"Funny you should ask that. We had a fierce storm",
						"recently. The gale picked up a whole load of entry tickets",
						"and scattered them all across arrow.");
				stage = 14;
				break;
			case OPTION_4:
				stage = 2;
				break;
			}
			break;
		case 14:
			sendNPCDialogue(npcId, PLAIN_TALKING_FACE,
					"We picked up any we could find, but most of them ended",
					"up in the water.");
			stage = 15;
			break;
		case 15:
			sendNPCDialogue(npcId, PLAIN_TALKING_FACE,
					"So, you never know. You might find an entry ticket",
					"whenever you catch fish.");
			stage = 12;
			break;
		}
	}

	@Override
	public void finish() {

	}

}
