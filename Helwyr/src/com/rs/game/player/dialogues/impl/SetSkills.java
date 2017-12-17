package com.rs.game.player.dialogues.impl;

import com.rs.game.player.Skills;
import com.rs.game.player.dialogues.Dialogue;

public class SetSkills extends Dialogue {

	@Override
	public void start() {
		
		if (player.getEquipment().wearingArmour()) {
			sendDialogue("Please remove your armour first.");
			stage = -2;
		} else {
		sendOptionsDialogue("Which skill do you wish to reset?", "Reset Attack (50M)",
				"Reset Strength (50M)", "Reset Defence (50M)", "Reset Ranged (50M)", "Next");
		stage = 1;
		}
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (stage == 1) {
			if (componentId == OPTION_1) {
				if (player.getInventory().containsItem(995, 50000000)) {
				player.getInventory().deleteItem(995, 50000000);
				player.getSkills().set(Skills.ATTACK, 1);
				player.getSkills().setXp(Skills.ATTACK, Skills.getXPForLevel(1));
				player.getAppearence().generateAppearenceData();
				close();
				} else {
					player.sm("You need at least 50 million coins to reset this skill.");
					close();
				}
		} else if (componentId == OPTION_2) {
			if (player.getInventory().containsItem(995, 50000000)) {
				player.getInventory().deleteItem(995, 50000000);
				player.getSkills().set(Skills.STRENGTH, 1);
				player.getSkills().setXp(Skills.STRENGTH, Skills.getXPForLevel(1));
				player.getAppearence().generateAppearenceData();
				close();
			} else {
				player.sm("You need at least 50 million coins to reset this skill.");
				close();
			}
		} else if (componentId == OPTION_3) {
			if (player.getInventory().containsItem(995, 50000000)) {
				player.getInventory().deleteItem(995, 50000000);
				player.getSkills().set(Skills.DEFENCE, 1);
				player.getSkills().setXp(Skills.DEFENCE, Skills.getXPForLevel(1));
				player.getAppearence().generateAppearenceData();
				close();
			} else {
				player.sm("You need at least 50 million coins to reset this skill.");
				close();
			}
		} else if (componentId == OPTION_4) {
			if (player.getInventory().containsItem(995, 50000000)) {
				player.getInventory().deleteItem(995, 50000000);
				player.getSkills().set(Skills.RANGE, 1);
				player.getSkills().setXp(Skills.RANGE, Skills.getXPForLevel(1));
				player.getAppearence().generateAppearenceData();
				close();
			} else {
				player.sm("You need at least 50 million coins to reset this skill.");
				close();
			}
			} else if (componentId == OPTION_5) {
				sendOptionsDialogue("Which skill do you wish to reset?", "Reset Prayer (25M)",
						"Reset Magic (50M)", "Reset Constitution (100M)", "Reset Summoning (25M)");
				stage = 2;
			}
			
		} else if (stage == 2) {
			if (componentId == OPTION_1) {
			if (player.getInventory().containsItem(995, 25000000)) {
				player.getInventory().deleteItem(995, 25000000);
				player.getSkills().set(Skills.PRAYER, 1);
				player.getSkills().setXp(Skills.PRAYER, Skills.getXPForLevel(1));
				player.getAppearence().generateAppearenceData();
				close();
			} else {
				player.sm("You need at least 25 million coins to reset this skill.");
				close();
			}
		} else if (componentId == OPTION_2) {
			if (player.getInventory().containsItem(995, 50000000)) {
				player.getInventory().deleteItem(995, 50000000);
				player.getSkills().set(Skills.MAGIC, 1);
				player.getSkills().setXp(Skills.MAGIC, Skills.getXPForLevel(1));
				player.getAppearence().generateAppearenceData();
				close();
			} else {
				player.sm("You need at least 50 million coins to reset this skill.");
				close();
			}
		} else if (componentId == OPTION_3) {
			if (player.getInventory().containsItem(995, 100000000)) {
				player.getInventory().deleteItem(995, 100000000);
				player.getSkills().set(Skills.HITPOINTS, 1);
				player.getSkills().setXp(Skills.HITPOINTS, Skills.getXPForLevel(10));
				player.getAppearence().generateAppearenceData();
				close();
			} else {
				player.sm("You need at least 100 million coins to reset this skill.");
				close();
			}
		} else if (componentId == OPTION_4) {
			if (player.getInventory().containsItem(995, 25000000)) {
				player.getInventory().deleteItem(995, 25000000);
				player.getSkills().set(Skills.SUMMONING, 1);
				player.getSkills().setXp(Skills.SUMMONING, Skills.getXPForLevel(1));
				player.getAppearence().generateAppearenceData();
				close();
			} else {
				player.sm("You need at least 25 million coins to reset this skill.");
				close();
			}
			}
			
		} else if (stage == -2) {
			close();
		}
	}

	@Override
	public void finish() {
	}

}