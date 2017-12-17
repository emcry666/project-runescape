package com.rs.game.player.dialogues.impl;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.item.Item;
import com.rs.game.npc.pet.Pet;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.Utils;

/**
 * 
 * @author Kyle Proctor
 * @contact<skype;SaviourZz><email;kylejohnproctor@gmail.com>
 */

public class LegendaryPet extends Dialogue {

	public Item item;
	
	@Override
	public void start() {
		item = (Item) parameters[0];
		options("Do what with " + item.getName().toLowerCase() + "?", "Alch The Item", "Note The Item");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if(componentId == OPTION_1) {
			int itemId = (item.getDefinitions().isNoted() ? (item.getId() - 1) : item.getId());
			int alchPrice = ItemDefinitions.getItemDefinitions(itemId).getValue(itemId);
			alchPrice = (alchPrice / (int) 2);
			alchPrice = (alchPrice * player.getInventory().getAmountOf(item.getId()));
			if(alchPrice == 0)
				return;
			player.getInventory().addItemMoneyPouch(995, alchPrice);
			player.getInventory().deleteItem(item.getId(), player.getInventory().getAmountOf(item.getId()));
			player.getPackets().sendGameMessage("<col=E86100>" + player.getPet().getName() + " has alched " + item.getName().toLowerCase() + " for " + Utils.formatNumber(alchPrice) + "gp.");
		} else {
			int notedItem = item.getId() + 1;
			ItemDefinitions defs = new ItemDefinitions(notedItem);
			if(defs.isNoted()) {
				for(int i = 0; i < player.getInventory().getItemsContainerSize(); i++) {
					if(!player.getInventory().containsItem(item.getId()))
						continue;
					player.getInventory().deleteItem(item.getId(), item.getAmount());
					player.getInventory().addItem(notedItem);
				}
				player.getPackets().sendGameMessage("<col=E86100>" + player.getPet().getName() + " notes the " + item.getName().toLowerCase() + "...");
			} else {
				player.getPackets().sendGameMessage("You are unable to note this item.");
			}
		}
		close();
	}

	@Override
	public void finish() {
		// TODO Auto-generated method stub

	}

}
