package com.rs.game.player.dialogues.impl;

import com.rs.game.ForceTalk;
import com.rs.game.player.content.grim.GrimTask;
import com.rs.game.player.content.grim.GrimTask.Master;
import com.rs.game.player.dialogues.Dialogue;

public class GrimD extends Dialogue {

	int npcId;

	@Override
	public void finish() {
		// TODO Auto-generated method stub

	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch (stage) {
		case -1:
			if (!player.isTalkedWithGrim()) {
				stage = 0;
				sendPlayerDialogue(9827, "Who are you?");
			} else {
				stage = 10;
				sendOptionsDialogue("Grim Reaper",
						"I'd like to get another assignment.",
						"I'd like to receive a grim gem.",
						"I'd like to see your reward store.");
			}
			break;
		case 0:
			stage = 1;
			sendEntityDialogue(
					IS_NPC,
					"Death",
					16927,
					9827,
					"I'm the slayer Master of "
							+ "Vernox"
							+ ", I can assign you a Slayer task. Only if you'd like to complete it for me, as reward I give you slayer experience and slayer points aswell.");
			break;
		case 1:
			stage = 3;
			sendPlayerDialogue(9827, "Sounds great, assign me a task!");
			break;
		case 3:
			player.setTalkedWithGrim(true);
			if (player.getTask() == null) {
				GrimTask.random(player, Master.GRIM);
				sendEntityDialogue(IS_NPC, "Death", 16927, 9827,
						"Excellent, your task is to kill "
								+ player.getTask().getTaskAmount() + " "
								+ player.getTask().getName().toLowerCase()
								+ "s..");
				stage = 7;
			} else {
				sendEntityDialogue(IS_NPC, "Death", 16927, 9827,
						"It seems like you already got an assignment. ",
						"Your task is to kill "
								+ player.getTask().getTaskAmount() + " "
								+ player.getTask().getName().toLowerCase()
								+ "s.");
				stage = 4;
			}
			break;
		case 4:
			stage = 5;
			sendPlayerDialogue(9827, "Can you please give me an hint to, where I can find them?");
			break;
		case 5:
			stage = 6;
			sendEntityDialogue(IS_NPC, "Death", 16927, 9827,
					"Sorry, I don't have time today, but maybe next time.");
			break;
		case 6:
			stage = 7;
			sendPlayerDialogue(9827,
					"Well, you should look at the forums, there may be a guide.",
						"Go to Vernox's forums, type ::forums.");
			break;
		case 7: /* Offical end of Dialogue */
			end();
			break;
		case 10:
			switch (componentId) {
			case OPTION_1:
				stage = 11;
				sendPlayerDialogue(9827, "I need another assignment.");
				break;
			/*case OPTION_2:
				stage = 21;
				sendPlayerDialogue(9827, "I dont remember my task.");
				break;*/
			case OPTION_2:
				sendItemDialogue(31846, "You received Death's grim gem");
				stage = 12;
				break;
			case OPTION_3:
				player.getInterfaceManager().sendCentralInterface(164);
				player.getPackets().sendIComponentText(164, 20,
						"" + player.getGrimPoints() + "");
				player.getPackets().sendIComponentText(164, 32, "(20 points)");
				player.getPackets()
						.sendIComponentText(164, 33, "(1500 points)");
				player.getPackets().sendIComponentText(164, 34, "(35 points)");
				player.getPackets().sendIComponentText(164, 35, "(35 points)");
				player.getPackets().sendIComponentText(164, 36, "(35 points)");
				end();
				break;
			}
			break;
		case 11:
			stage = 13;
			if (player.getTask() == null) {
				sendEntityDialogue(IS_NPC, "Death", 16927, 9827,
						"Very good, you're a true warrior. Would you like to have a new task?");
			} else {
				sendEntityDialogue(IS_NPC, "Death", 16927, 9827,
						"You're not in need of a new task, you've already got one.");
				stage = 7;
			}
			break;
		case 12:
		    if (player.getInventory().hasFreeSlots()) {
		    	player.getInventory().addItem(31846, 1);
		    }
		    else
		    {
			player.getBank().addItem(31846, 1, true);
		    }
			end();
			break;
		case 13:
			stage = 15;
			sendOptionsDialogue("Would you like to?", "Yes", "No, thanks.");
			break;
		case 14:
			stage = 16;
			sendOptionsDialogue("Are you willing to change your task for 500,000 coins?",
					"Yes, please.", "No, that's too much!");
			break;
		case 15:
			switch (componentId) {
			case OPTION_1:
				stage = 17;
				sendPlayerDialogue(9827, "Yes, please.");
				break;
			case OPTION_2:
				stage = 7;
				sendPlayerDialogue(9827, "No, thanks.");
				break;
			}
			break;
		case 16:
			switch (componentId) {
			case OPTION_1:
				stage = 19;
				sendPlayerDialogue(9827, "Yes, please.");
				break;
			case OPTION_2:
				stage = 20;
				sendPlayerDialogue(9827, "No, that's way too much!");
				break;
			}
			break;
		case 17:
		    	GrimTask.random(player, Master.GRIM);
			sendEntityDialogue(IS_NPC, "Death", 16927, 9827,
					"Excellent, your new task is to kill "
							+ player.getTask().getTaskAmount() + " "
							+ player.getTask().getName().toLowerCase() + "s..");
			stage = 7;
			break;
		case 19:
			if (player.getInventory().containsItem(995, 500000)) {
				player.getInventory().deleteItem(995, 500000);
				GrimTask.random(player, Master.GRIM);
				sendEntityDialogue(IS_NPC, "Death", 16927, 9827,
						"Your new task is to kill "
								+ player.getTask().getTaskAmount() + " "
								+ player.getTask().getName().toLowerCase()
								+ "s..");
				stage = 7;
			} else {
				sendDialogue("You don't have enough coins to change your task.");
				stage = 7;
			}
			break;
		case 20:
			end();
			stage = 7;
			break;
		case 21:
			if (player.getTask() != null) {
				sendEntityDialogue(IS_NPC, "Death", 16927, 9827,
						"I remember your current task, I may forget it next time. Please remember your task next time. Your slayer task is to kill "
								+ player.getTask().getTaskAmount() + " "
								+ player.getTask().getName().toLowerCase()
								+ "s.");
			} else {
				sendEntityDialogue(IS_NPC, "Death", 16927, 9827,
						"Looks like you don't even have a slayer task.");
			}
			stage = 7;
			break;
		case 23:
			end();
			break;
		case 24:
		    	GrimTask.random(player, Master.GRIM);
			sendEntityDialogue(IS_NPC, "Death", 16927, 9827,
					"Okay, your new task is to kill "
							+ player.getTask().getTaskAmount() + " "
							+ player.getTask().getName().toLowerCase() + ".");
			stage = 23;
			break;
		}
	}

	@Override
	public void start() {
		if (!player.isTalkedWithGrim()) {
			sendEntityDialogue(IS_NPC, "Death", 16927, 9827,
					"Hello "+ player.getDisplayName() + ", how can I help you?");
		} else {
			sendEntityDialogue(IS_NPC, "Death", 16927, 9827, "You're back "
					+ player.getDisplayName() + ", how can I help you?");
		}
	}

}