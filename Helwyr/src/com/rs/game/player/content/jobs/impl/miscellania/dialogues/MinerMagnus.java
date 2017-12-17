package com.rs.game.player.content.jobs.impl.miscellania.dialogues;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.content.miscellania.ThroneOfMiscellania;
import com.rs.game.player.dialogues.Dialogue;

public class MinerMagnus extends Dialogue {

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		if(hasOre(player)) {
			npc(ASKING, "Would yer sell them fine ore of yours?");
		} else {
			player(NORMAL, "I probably shouldn't bother him, He looks rather busy...");
		}
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
		case -1:
			if(hasOre(player)) {
				options(DEFAULT, "Yes", "No");
				stage = 1;
			} else {
				close();
			}
			break;
		case 1:
			switch(componentId) {
			case OPTION_1:
				npc(HAPPY, "There yer go " + player.getDisplayName() + "!");
				stage = -3;
				break;
			case OPTION_2:
				close();
				break;
			}
			break;
		case -2:
			close();
			break;
		case -3:
			close();
			purchaseOre(player);
			break;

		}
	}

	@Override
	public void finish() {
		// TODO Auto-generated method stub

	}

	public static boolean hasOre(Player player) {
		Item item = null;
		ItemDefinitions defs = null;
		for(int i = 0; i < player.getInventory().getItemsContainerSize(); i++) {
			item = player.getInventory().getItem(i);
			if(item == null)
				continue;
			defs = new ItemDefinitions(item.getId());
			if(defs.getName().toLowerCase().contains("coal"))
				return true;
		}
		return false;
	}
	

	public static void purchaseOre(Player player) {
		Item item = null;
		ItemDefinitions defs = null;
		int value = 0;
		for (int i = 0; i < player.getInventory().getItemsContainerSize(); i++) {
			item = player.getInventory().getItem(i);
			if(item == null)
				continue;
			if(item != null)
				defs = ItemDefinitions.getItemDefinitions(item.getId());
				value = defs.getValue(item.getId()) * 3;
			if(!item.getName().toLowerCase().contains("coal")) 
				continue;
			if(value == 0)//shouldn't happen
				return;
			player.getInventory().deleteItem(item);
			player.getMoneyPouch().addToMoneyPouch(value * ThroneOfMiscellania.getBonusModifier());

		}
	}
	
	public static void purchaseOre(Player player, Item item) {
		ItemDefinitions defs = null;
		int value = 0;
		for (int i = 0; i < player.getInventory().getItemsContainerSize(); i++) {
			if(item != null)
				defs = ItemDefinitions.getItemDefinitions(item.getId());
				value = defs.getValue(item.getId()) * 3;
			if(!item.getName().toLowerCase().contains("coal")) 
				return;
			if(value == 0)//shouldn't happen
				return;
			player.getInventory().deleteItem(item);
			player.getMoneyPouch().addToMoneyPouch(value * ThroneOfMiscellania.getBonusModifier());
		}
	}

}
