package com.rs.game.player.dialogues.impl;

import com.rs.game.Animation;
import com.rs.game.player.Skills;
import com.rs.game.player.dialogues.Dialogue;

public class PolyPoncho extends Dialogue {

	@Override
	public void start() {
		options("Crafting a Poncho ", "Fungal - 2,500 flakes", "Grifolic - 3,500 flakes", "Ganodermic - 5,000 flakes");
		stage = -1;
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (stage == -1) {
			if (componentId == OPTION_1 && player.getInventory().containsItem(22449, 2500) && player.getInventory().containsItem(22456, 1) && (player.getSkills().getLevel(Skills.CRAFTING) > 20)) {
				close();
				player.setNextAnimation(new Animation(1249));
				player.getInventory().deleteItem(22449, 2500);
				player.getInventory().deleteItem(22456, 1);
				player.getInventory().addItem(22466, 1);
				player.getSkills().addXp(Skills.CRAFTING, 80);

			} else if (componentId == OPTION_1 && !player.getInventory().containsItem(22449, 2500) || !player.getInventory().containsItem(22456, 1) || (player.getSkills().getLevel(Skills.CRAFTING) < 21)) {
				close();
				player.getDialogueManager().startDialogue("SimpleMessage", "You need 2500 Fungal flakes, a Mycelium poncho and 21 crafting to do this.");

				return;
			} else if (componentId == OPTION_2 && player.getInventory().containsItem(22450, 3500) && player.getInventory().containsItem(22456, 1) && (player.getSkills().getLevel(Skills.CRAFTING) > 77)) {
				close();
				player.setNextAnimation(new Animation(1249));
				player.getInventory().deleteItem(22450, 3500);
				player.getInventory().deleteItem(22456, 1);
				player.getInventory().addItem(22478, 1);
				player.getSkills().addXp(Skills.CRAFTING, 100);

			} else if (componentId == OPTION_2 && !player.getInventory().containsItem(22450, 3500) || !player.getInventory().containsItem(22456, 1) || (player.getSkills().getLevel(Skills.CRAFTING) < 78)) {
				close();
				player.getDialogueManager().startDialogue("SimpleMessage", "You need 3500 Grifolic flakes, a Mycelium poncho and 78 crafting to do this.");

				return;
			} else if (componentId == OPTION_3 && player.getInventory().containsItem(22451, 5000) && player.getInventory().containsItem(22456, 1) && (player.getSkills().getLevel(Skills.CRAFTING) > 97)) {
				close();
				player.setNextAnimation(new Animation(1249));
				player.getInventory().deleteItem(22451, 5000);
				player.getInventory().deleteItem(22456, 1);
				player.getInventory().addItem(22490, 1);
				player.getSkills().addXp(Skills.CRAFTING, 150);

			} else if (componentId == OPTION_3 && !player.getInventory().containsItem(22451, 5000) || !player.getInventory().containsItem(22456, 1) || (player.getSkills().getLevel(Skills.CRAFTING) < 98)) {
				close();
				player.getDialogueManager().startDialogue("SimpleMessage", "You need 5000 Ganodermic flakes, a Mycelium poncho and 98 crafting to do this.");

				return;
			}
		}

	}

	@Override
	public void finish() {

	}
}