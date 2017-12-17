package com.rs.game.player.dialogues.impl;

import com.rs.game.player.content.ReaperAssignment;
import com.rs.game.player.dialogues.Dialogue;

public class ReaperAssignments extends Dialogue {

	// npc 19669

		@Override
		public void start() {
			if (player.hasLearnedDeath()) {
				stage = 1;
				sendNPCDialogue(19669, CALM_TALK, "Hello mortal. I am able to give you much more challenging slayer", "assignments than your normal slayer masters. Listen closely.");
			} else {
				stage = 50;
				sendNPCDialogue(19669, CALM_TALK, "Back again I see. What is it you wish to do?");
			}
		}

		@Override
		public void run(int interfaceId, int componentId) {
			if (stage == 1) {
				stage++;
				sendNPCDialogue(19669, CALM_TALK, "These assignments are called Reaper assignments. They are completely", "separate from your normal novice slayer tasks.", "So recieving one of my tasks will not interfere with normal ones.");
			} else if (stage == 2) {
				stage++;
				sendNPCDialogue(19669, CALM_TALK, "Each day, I will give you one task which can be", "rerolled up to 3 times if you choose.");
			} else if (stage == 3) {
				stage++;
				sendNPCDialogue(19669, CALM_TALK, "Completing my task will reward a large sum of", "Slayer experience as well as Reaper points", "to be used in my rewards shop.");
			} else if (stage == 4) {
				stage++;
				sendNPCDialogue(19669, CALM_TALK, "You gain 15 points per task and that number will", "not increase at all.");
			} else if (stage == 5) {
				stage++;
				sendNPCDialogue(19669, CALM_TALK, "I will not explain this again. Are we clear on the", "terms of my assignments?");
			} else if (stage == 6) {
				stage++;
				sendOptionsDialogue(player, "What would you like to say?", "Yes we are clear.", "No, let me hear that again.");
			} else if (stage == 7) {
				stage++;
				if (componentId == OPTION_1) {
					player.setHasLearnedDeath(true);
					sendPlayerDialogue(CALM_TALK, "Yes, we are clear. I'll speak to you again", "when I am ready to recieve a task.");
					stage = -1;
				} else {
					stage = 1;
					sendPlayerDialogue(CALM_TALK, "No, could you explain that one more time please?");
				}
			} else if (stage == 50) {
				stage++;
				sendOptionsDialogue(player, "What would you like to say?", "Give me a new task.", "Reroll my current task. (Remaining: " + player.rerolls + ")", "What is my current task?");
			} else if (stage == 51) {
				stage++;
				if (componentId == OPTION_1) {
					if (player.hasBossTask()) {
						sendNPCDialogue(19669, CALM_TALK, "You already have an assignment.", player.getBossTask().getMessage());
					} else if (player.bossTaskCompleted) {
						sendNPCDialogue(19669, CALM_TALK, "You've completed my daily assignment already.", "Come again tomorrow.");
					} else {
						player.setBossTask(ReaperAssignment.create());
						sendNPCDialogue(19669, CALM_TALK, "Alright. " + player.getBossTask().getMessage());
					}
					stage = -1;
				} else if (componentId == OPTION_2) {
					if (player.hasBossTask()) {
						player.getDialogueManager().startDialogue(new Dialogue() {

							@Override
							public void start() {
								options(player.getBossTask().getMessage() + " Reroll?", "Yes", "No");
							}

							@Override
							public void run(int interfaceId, int componentId) {
								if(componentId == OPTION_1) {
									if (player.rerollTask()) {
										sendNPCDialogue(19669, CALM_TALK, "Alright. " + player.getBossTask().getMessage());
									} else {
										sendNPCDialogue(19669, CALM_TALK, "You are out of daily task rerolls. Come again tomorrow.");
									}
								} else {
									sendNPCDialogue(19669, CALM_TALK, "You don't have a task to reroll.");
								}
							}

							@Override
							public void finish() {
								// TODO Auto-generated method stub
								
							}
							
						});
					} else {
						sendNPCDialogue(19669, CALM_TALK, "You don't have a task to reroll.");
					}
					stage = -1;
				} else if (componentId == OPTION_3) {
					if (player.hasBossTask()) {
						sendNPCDialogue(19669, CALM_TALK, player.getBossTask().getMessage());
					} else {
						sendNPCDialogue(19669, CALM_TALK, "You don't have a task currently.");
					}
					stage = -1;
				}
			} else {
				end();
			}
		}

		@Override
		public void finish() {

		}

}