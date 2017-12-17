package com.rs.game.player.dialogues.impl;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.Utils;

public class StealingCreationTool extends Dialogue {

	
	public static Item[] tools = new Item[] {
			new Item(14099), new Item(14100), new Item(14104), new Item(14105), new Item(14103)
			};
	
	@Override
	public void start() {
		sendOptionsDialogue("Choose a Tool", "Pickaxe", "Hatchet", "Harpoon", "Hammer", "More");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
		case -1:
			switch(componentId ) {
			case OPTION_1:
				addTool(14099);
				break;
			case OPTION_2:
				addTool(14100);
				break;
			case OPTION_3:
				addTool(14101);
				break;
			case OPTION_4:
				addTool(14104);
				break;
			case OPTION_5:
				sendOptionsDialogue("Choose a Tool", "Needle", "Fletching knife", "Back");
				stage = 2;
				break;
			}
			break;
			
		case 2:
			switch(componentId) {
			case OPTION_1:
				addTool(14105);
				break;
			case OPTION_2:
				addTool(14103);
				break;
			case OPTION_3:
				sendOptionsDialogue("Choose a Tool", "Pickaxe", "Hatchet", "Harpoon", "Hammer", "More");
				stage = -1;
				break;
			}
			break;
			
		case -2:
			close();
			break;
		}
	}
	
	public void addTool(int id) {
		ItemDefinitions defs = new ItemDefinitions(id);
		if(player.getInventory().getFreeSlots() < 1) {
			player.getBank().addItem(id, 1, false);
		} else {
			player.getInventory().addItem(new Item(id, 1));
		}
		player.getInventory().deleteItem(14106, 1);
		player.getPackets().sendGameMessage("A " + defs.getName() + " has been added to your " + (player.getInventory().getFreeSlots() < 1 ? "bank" : "inventory") + ".");
	}
	
	public static void randomTool(Player player) {
		Item tool = null;
		tool = tools[Utils.random(tools.length)];
		if(player.getInventory().getFreeSlots() < 1) {
			player.getBank().addItem(tool.getId(), 1, false);
		} else {
			player.getInventory().addItem(new Item(tool.getId()));
		}
		player.getInventory().deleteItem(14098, 1);
		player.getPackets().sendGameMessage("A " + tool.getName()+ " has been added to your " + (player.getInventory().getFreeSlots() < 1 ? "bank" : "inventory") + ".");
	
	}

	@Override
	public void finish() {
		// TODO Auto-generated method stub

	}

}
