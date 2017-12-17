package com.rs.game.player.dialogues.impl;

import com.rs.game.player.actions.Urns;
import com.rs.game.player.actions.Urns.UrnData;
import com.rs.game.player.content.SkillsDialogue;
import com.rs.game.player.dialogues.Dialogue;

public class UrnsD extends Dialogue {

	@Override
	public void start() {
		int[] items = new int[parameters.length];
		for (int i = 0; i < items.length; i++)
			items[i] = ((UrnData) parameters[i]).getFinalProduct();

		SkillsDialogue
				.sendSkillsDialogue(
						player,
						SkillsDialogue.MAKE,
						"Choose how many you wish to make,<br>then click on the item to begin.",
						28, items, null);
	}

	@Override
	public void run(int interfaceId, int componentId) {
		int option = SkillsDialogue.getItemSlot(componentId);
		if (option > parameters.length) {
			end();
			return;
		}
		UrnData data = (UrnData) parameters[option];
		int quantity = SkillsDialogue.getQuantity(player);
		int invQuantity = player.getInventory().getItems()
				.getNumberOf(data.getIngredientId());
		if (quantity > invQuantity)
			quantity = invQuantity;
		player.getActionManager().setAction(new Urns(data, quantity));
		end();
	}

	@Override
	public void finish() {

	}

}
