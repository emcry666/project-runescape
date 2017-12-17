package com.rs.game.player.dialogues.impl;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.item.Item;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.Archiver;

public class ConfirmEmpty extends Dialogue {

	@Override
	public void start() {
		sendDialogue("Are you sure you want to " + (player.isUltimateDonator() ? "SELL" : "EMPTY") + " your ENTIRE inventory?");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
		case -1:
			sendOptionsDialogue(DEFAULT, "Yes.", "No.");
			stage = 1;
			break;
		case 1:
			switch(componentId) {
			case OPTION_1:
				Archiver.writeEmptyLog(player, player.getInventory().getItems().toArray());
				inventoryPurchase();
				player.stopAll();
				close();
				break;
			case OPTION_2:
				close();
				break;
			}
			break;
		case -2:
			close();
			break;
		}
	}

	private void inventoryPurchase() {
		if(!player.isAUltimateDonator()) {
			player.getInventory().reset();
			return;
		}
		Item item = null;
		for (int i = 0; i < 29; i++) {
			item = player.getInventory().getItem(i);
			if(item == null)
				continue;
			ItemDefinitions definitions = ItemDefinitions.getItemDefinitions(item.getId());
			int value = definitions.getValue((definitions.isStackable() ? item.getId() - 1 : item.getId()));
			player.getInventory().deleteItem(item);
			player.getMoneyPouch().addToMoneyPouch(value * item.getAmount() / 2);
			close();
		}

	}

	@Override
	public void finish() {

	}

}
