package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;

public class Niles extends Dialogue {

	private int npcId;

	@Override
	public void finish() {

	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (stage == -1) {
			sendOptionsDialogue("Chose an Option", "How many livid points do I have?", "Can I exchange points for rewards?", "Nothing, Nevermind.");
			stage = 0;
		} else if (stage == 0) {
			if (componentId == OPTION_1) {
				sendNPCDialogue(npcId, 9827, "You currently have " + player.getLividpoints() + " livid points.");
				stage = -1;
			} else if (componentId == OPTION_2) {
				sendNPCDialogue(npcId, 9827, "Sure, we have a lot to offer!");
				stage = 1;
			} else
				end();
		} else if (stage == 1) {
			sendOptionsDialogue("Choose a Reward", "Full Lunar Set (1500)", "Tribal Mask - Green (1250)", "Tribal Mask - Orange (1250)", "Tribal Mask - White (1250)", "None");
			stage = 2;
		} else if (stage == 2) {
			if (componentId == OPTION_1) {
				if (player.getLividpoints() >= 1500) {
					player.setLividpoints(player.getLividpoints() - 1500);
					player.getInventory().addItem(9096, 1);
					player.getInventory().addItem(9097, 1);
					player.getInventory().addItem(9098, 1);
					player.getInventory().addItem(9099, 1);
					player.getInventory().addItem(9100, 1);
					player.getInventory().addItem(9101, 1);
					player.getInventory().addItem(9102, 1);
					player.getInventory().addItem(9104, 1);
					sendNPCDialogue(npcId, 9827, "Pleasure doing business with you!");
					stage = 69;
				} else {
					sendNPCDialogue(npcId, 9827, "You do not have enough points for this...");
					stage = 69;
				}
			} else if (componentId == OPTION_2) {
				if (player.getLividpoints() >= 1250) {
					player.setLividpoints(player.getLividpoints() - 1250);
					player.getInventory().addItem(6335, 1);
					sendNPCDialogue(npcId, 9827, "Pleasure doing business with you!");
					stage = 69;
				} else {
					sendNPCDialogue(npcId, 9827, "You do not have enough points for this...");
					stage = 69;
				}
			} else if (componentId == OPTION_3) {
				if (player.getLividpoints() >= 1250) {
					player.setLividpoints(player.getLividpoints() - 1250);
					player.getInventory().addItem(6337, 1);
					sendNPCDialogue(npcId, 9827, "Pleasure doing business with you!");
					stage = 69;
				} else {
					sendNPCDialogue(npcId, 9827, "You do not have enough points for this...");
					stage = 69;
				}
			} else if (componentId == OPTION_4) {
				if (player.getLividpoints() >= 1250) {
					player.setLividpoints(player.getLividpoints() - 1250);
					player.getInventory().addItem(6339, 1);
					sendNPCDialogue(npcId, 9827, "Pleasure doing business with you!");
					stage = 69;
				} else {
					sendNPCDialogue(npcId, 9827, "You do not have enough points for this...");
					stage = 69;
				}
			} else
				end();
		} else if (stage == 69) {
			end();
		}
	}

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		sendNPCDialogue(npcId, 9827, "Welcome to the Livid Farm!", "Come check out our rewards!");
		stage = -1;
	}

}
