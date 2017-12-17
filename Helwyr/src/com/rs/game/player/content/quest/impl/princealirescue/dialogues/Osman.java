package com.rs.game.player.content.quest.impl.princealirescue.dialogues;

import com.rs.game.item.Item;
import com.rs.game.player.content.quest.QuestList.Quests;
import com.rs.game.player.content.quest.State.QuestState;
import com.rs.game.player.content.quest.impl.princealirescue.PrinceAliRescue;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.game.player.dialogues.Mood;

/**
 * @Author Frostbite
 * @Contact<frostbitersps@gmail.com;skype:frostbitersps>
 */
public class Osman extends Dialogue {

	@Override
	public int getNPCID() {
		return 5282;
	}

	@Override
	public void start() {
		stage = (Integer) parameters[0];
		int progress = player.getQuestManager().get(Quests.PRINCE_ALI_RESUCE).getStage();
		QuestState state = player.getQuestManager().get(Quests.PRINCE_ALI_RESUCE).getState();
		switch(state) {
		case COMPLETED:
			stage = 1;
			break;
		case NOT_STARTED:
			stage = 2;
			break;
		case STARTED:
			if(!player.hasItem(PrinceAliRescue.BRONZE_KEY)) {
			 if(player.getInventory().containsItem(PrinceAliRescue.KEY_PRINT, 1) && player.getInventory().containsItem(PrinceAliRescue.BRONZE_BAR, 1) && state != QuestState.COMPLETED)  {// TODO add check to make sure u talked to keli
				sendNPCChat(Mood.HAPPY, "Well done; we can make the key now.");
				stage = 19;
			 }
			 } else {
				 stage = 0;
			 }
			break;
		}
		switch(stage) {
		case 0:
			sendPlayerChat(Mood.NORMAL, "The chancellor trusts me. I have come for instructions.");
			stage = -1;
			break;
			
		case 1:
			sendNPCChat(Mood.HAPPY, "Well done. A great rescue. I will remember you if I "
					+ "have anything dangerous to do.");
			stage = -2;
			break;
			
		case 2:
			sendNPCChat(Mood.NORMAL, "Please leave me alone adventurer, I am", "a very busy man.");
			stage = -2;
			break;
		}
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch (stage) {
		case -1:
			sendNPCChat(Mood.PLAIN_TALKING, "Our prince is captive by the Lady Keli. We just need " +
					"to make the rescue. There are two things we need " +
					"you to do.");
			stage = 1;
			break;

		case 1:
			sendOptionsDialogue(DEFAULT, "What is the first thing I must do?", "What is the second thing you need?");
			stage = 2;
			break;

		case 2:
			switch (componentId) {
			case OPTION_1:
				sendNPCChat(Mood.PLAIN_TALKING, "The prince is guarded by some stupid guards and a " +
						"clever woman. The woman is our only way to get the " +
						"prince out. Only she can walk freely about the area.");
				stage = 3;
				break;
			case OPTION_2:
				sendNPCChat(Mood.NORMAL, "We need the key, or we need a copy made. If you can " +
						"get some soft clay then you can copy the key...");
				stage = 10;
				break;
			}
			break;

		case 3:
			sendNPCChat(Mood.PLAIN_TALKING, "I think you will need to die her up. One coil of rope " +
					"should do for that. Then, disguise the prince as her to " +
					"get him out without suspicion.");
			stage = 4;
			break;

		case 4:
			sendPlayerChat(Mood.ASKING, "How good must the disguise be?");
			stage = 5;
			break;

		case 5:
			sendNPCChat(Mood.PLAIN_TALKING, "Only enough to fool the guards at a distance. Get a " +
					"skirt like hers. Same colour, same style. We will only " +
					"have a short time.");
			stage = 6;
			break;

		case 6:
			sendNPCChat(Mood.PLAIN_TALKING, "Get a blond wig, too. That is up to you to make or " +
					"find. Something to colour the skin of the prince.");
			stage = 7;
			break;

		case 7:
			sendNPCChat(Mood.PLAIN_TALKING, "My daughter and top spy, Leela, can help you. She has " +
					"sent word that she has discovered where they are " +
					"keeping the prince.");
			stage = 8;
			break;

		case 8:
			sendNPCChat(Mood.PLAIN_TALKING, "It's near Draynor Village. She is lurking somewhere " +
					"near there now.");
			player.getQuestManager().get(Quests.PRINCE_ALI_RESUCE).setStage(2);
			stage = 9;
			break;

		case 9:
			sendOptionsDialogue(DEFAULT, "Explain the first thing again.", "What is the second thing you need?", "Okay, I better go find some things.");
			stage = 12;
			break;

		case 10:
			sendNPCChat(Mood.PLAIN_TALKING, "...If you can convince Lady Keli to show it to you " +
					"for a moment. She is very boastful. " +
					"It should not be too hard.");
			stage = 11;
			break;

		case 11:
			player.getQuestManager().get(Quests.PRINCE_ALI_RESUCE).setStage(2);
			end();
			//TODO (God damn INtellshit fucked my shit all up and removed the god damn case so now i need another rs account cus 
			//IDE SUCKS 100% COCKMEAT.
			break;

		case 12:
			switch(componentId) {
			case OPTION_1:
				sendNPCChat(Mood.PLAIN_TALKING, "The prince is guarded by some stupid guards and a " +
						"clever woman. The woman is our only way to get the " +
						"prince out. Only she can walk freely about the area.");
				stage = 3;
				break;
			case OPTION_2:
				sendNPCChat(Mood.NORMAL, "We need the key, or we need a copy made. If you can " +
						"get some soft clay then you can copy the key...");
				stage = 10;
				break;
			case OPTION_3:
				end();//TODO
				break;
			}
			break;

		case 13:
			/**
			 * Key
			 */
			sendNPCChat(Mood.PLAIN_TALKING, "A print of the key in soft clay and a bronze bar. " +
					"Then, collect the key from Leela.");
			stage = 14;
			break;

		case 14:
			/**
			 * Blonde wig
			 */
			if(player.getInventory().containsItem(PrinceAliRescue.DYED_WIG, 1)) {
				sendNPCChat(Mood.NORMAL, "The wig you have got; well done.");
				stage = 15;
			} else {
				sendNPCChat(Mood.PLAIN_TALKING, "You need to make a blonde wig somehow. " +
						"Leela may help.");
				stage = 15;
			}
			break;

		case 15:
			/**
			 * keli's skirt (Pink)
			 */
			if(player.getInventory().containsItem(PrinceAliRescue.PINK_SKIRT, 1)) {
				sendNPCChat(Mood.HAPPY, "You have the skirt. Good.");
				stage = 16;
			} else {
				sendNPCChat(Mood.PLAIN_TALKING, "You will need a skirt that looks the same as Keli's.");
				stage = 16;
			}
			break;

		case 16:
			/**
			 * Yellow Dye (Skin lighter)
			 */
			if(player.getInventory().containsItem(PrinceAliRescue.SKIN_PASTE, 1)) {
				sendNPCChat(Mood.HAPPY, "You have the skin paint; well done. I thought you would struggle to make that.");
				stage = 17;
			} else {
				sendNPCChat(Mood.PLAIN_TALKING, "Something to make the prince's skin appear lighter.");
				stage = 17;
			}
			break;

		case 17:
			/**
			 * Rope
			 */
			if(player.getInventory().containsItem(PrinceAliRescue.ROPE, 1)) {
				sendNPCChat(Mood.HAPPY, "Yes, you have the rope.");
				stage = 18;
			} else {
				sendNPCChat(Mood.PLAIN_TALKING, "A rope with which to die Keli up.");
				stage = 18;
			}
			break;

		case 18:
			sendNPCChat(Mood.PLAIN_TALKING, "Once you have everything, go to Leela. She must be " +
					"ready to get the prince away.");
			stage = -2;
			break;

		case 19:
			sendDialogue("Osman takes the key imprint and the bronze bar.");
			player.getInventory().deleteItem(new Item(PrinceAliRescue.KEY_PRINT));
			player.getInventory().deleteItem(new Item(PrinceAliRescue.BRONZE_BAR));
			player.getQuestManager().get(Quests.PRINCE_ALI_RESUCE).setStage(3);
			stage = 20;
			break;

		case 20:
			sendNPCChat(Mood.NORMAL, "Pick the key up from Leela.");
			stage = 21;
			break;

		case 21:
			sendOptionsDialogue(DEFAULT, "Thank you. I will try to find the other items.", "Can you tell me what I still need to get?");
			stage = 22;
			break;

		case 22:
			switch(componentId) {
			case OPTION_1:
				sendPlayerChat(Mood.NORMAL, "Thank you. I will try to find the other items.");
				stage = -2;
				break;
			case OPTION_2:
				sendNPCChat(Mood.NORMAL, "Pick the key up from Leela.");
				stage = 14;
				break;
			}
			break;
			
		case -2:
			end();
			break;


		}



	}

	@Override
	public void finish() {

	}
}
