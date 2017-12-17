package com.rs.game.player.content.jobs.impl.miscellania.dialogues;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.content.miscellania.ThroneOfMiscellania;
import com.rs.game.player.dialogues.Dialogue;

public class FishermanFrodi extends Dialogue {

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		if(hasFish(player)) {
			npc(ASKING, "Would yer sell them fine fish of yours?");
		} else {
			player(NORMAL, "I probably shouldn't bother him, He looks rather busy...");
		}
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
		case -1:
			if(hasFish(player)) {
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
			purchaseFish(player);
			break;

		}
	}

	@Override
	public void finish() {
		// TODO Auto-generated method stub

	}

	public static boolean hasFish(Player player) {
		Item item = null;
		ItemDefinitions defs = null;
		for(int i = 0; i < player.getInventory().getItemsContainerSize(); i++) {
			item = player.getInventory().getItem(i);
			if(item == null)
				continue;
			defs = new ItemDefinitions(item.getId());
			if(defs.getName().toLowerCase().contains("raw"))
				return true;
		}
		return false;
	}
	

	public static void purchaseFish(Player player) {
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
			if(!item.getName().toLowerCase().contains("raw")) 
				continue;
			if(value == 0)//shouldn't happen
				return;
			player.getInventory().deleteItem(item);
			player.getMoneyPouch().addToMoneyPouch(value * ThroneOfMiscellania.getBonusModifier());

		}
	}
	
	public static void purchaseFish(Player player, Item item) {
		ItemDefinitions defs = null;
		int value = 0;
		for (int i = 0; i < player.getInventory().getItemsContainerSize(); i++) {
			if(item != null)
				defs = ItemDefinitions.getItemDefinitions(item.getId());
				value = defs.getValue(item.getId()) * 3;
			if(!item.getName().toLowerCase().contains("raw")) 
				return;
			if(value == 0)//shouldn't happen
				return;
			player.getInventory().deleteItem(item);
			player.getMoneyPouch().addToMoneyPouch(value * ThroneOfMiscellania.getBonusModifier());
		}
	}

}
