/*package com.arrow.game.content.dialogues.impl.cities.lumbridge;

import com.arrow.cache.loaders.ItemDefinitions;
import com.arrow.game.content.dialogues.Dialogue;
import com.arrow.game.content.item.Item;
import com.arrow.utilities.Utils;



public class Bob extends Dialogue {

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		sendNPCDialogue(npcId, HAPPY, "Hello, " + player.getDisplayName() + ". My name is Bob. I repair all of your broken items.");
	}

	@Override
	public void run(int interfaceId, int option) {
		switch(stage) {
		case -1:
			sendNPCDialogue(npcId, HAPPY, "However, my service is not free, would you want me to do it anyways?");
			setStage(0);
			break;
		case 0:
			sendOptionsDialogue("Select an Option", "Yes", "No");
			setStage(1);
			break;
		case 1:
			switch(option) {
			case OPTION_1:
				sendPlayerDialogue(HAPPY, "Yes, this is just what I needed. Please do this immediately.");
				setStage(2);
				break;
			case OPTION_2:
				sendPlayerDialogue(NORMAL, "No, I would not.");
				setStage(-2);
				break;
			}
			break;
		case 2:
			if (getRepairPrice() != 0) {
				sendOptionsDialogue("Do you want to have your items repaired for " + Utils.format(getRepairPrice()) + " coins?", "Yes", "No");
				setStage(3);
			} else {
				sendNPCDialogue(npcId, SAD, "You have no broken items for me to repair. Please come back when you have business for me.");
				setStage(-2);
			}
			break;
		case 3:
			switch(option) {
			case OPTION_1:
				if (player.getInventory().removeItems(new Item(getRepairPrice()))) {
					repairAll();
					sendNPCDialogue(npcId, HAPPY, "Thanks for your business!");
					setStage(-2);
				} else {
					sendNPCDialogue(npcId, SAD, "You don't have enough money for this service, sorry!");
					setStage(-2);
				}
				break;
			case OPTION_2:
				sendPlayerDialogue(SAD, "Crap! I don't have enough money. I'll come back when I'm richer.");
				setStage(-2);
				break;
			}
			break;
		default:
			end();
			break;
		}
	}

	@Override
	public void finish() {

	}

	private Object[][] prices = new Object[][] { 
			{ "torag's", 500000 },
			{ "dharok's", 500000 },
			{ "guthan's", 400000 },
			{ "verac's", 400000 },
			{ "karil's", 300000 },
			{ "ahrim's", 300000 }, 
			{ "torva", 2500000 },
			{ "pernix", 2000000 },
			{ "virtus", 2000000 },
			{ "zaryte", 2000000 }
	};

	private int getRepairPrice() {
		int price = 0;
		for (Item item : player.getInventory().getItems().toArray()) {
			if (item == null)
				continue;
			String name = item.getName();
			if (isRepairable(item)) {
				for (int i = 0; i < prices.length; i++) {
					String firstPart = name.split(" ")[0].toLowerCase();
					if (firstPart.equalsIgnoreCase((String) prices[i][0])) {
						try {
							if (isBarrows(item) && getCharges(item) != -1) {
								price += (int) prices[i][1];
							} else if (!isBarrows(item)) {
								price += (int) prices[i][1];
							}
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
		return price;
	}

	private int getCharges(Item item) {
		String name = item.getName();
		int charges = 0;
		try {
			charges =Integer.parseInt(name.split(" ")[name.split(" ").length - 1]);
		} catch (Exception e) {
			charges = -1;
		}
		return charges;
	}

	private int getRepairId(Item item) {
		String name = item.getName();
		if (isBarrows(item) && getCharges(item) != -1) {
			String newName = name.substring(0, name.indexOf("" + getCharges(item)) - 1);
			return ItemNames.getTradeableId(newName);
		} else if (!isBarrows(item)) {
			String newName = name.substring(0, name.indexOf("(broken)") - 1);
			return ItemNames.getTradeableId(newName);
		}
		return -1;
	}

	private boolean isBarrows(Item item) {
		return item.getId() < 20000;
	}

	private void repairAll() {
		for (Item item : player.getInventory().getItems().toArray()) {
			if (item == null)
				continue;
			if (isRepairable(item)) {			
				int newId = (ItemDefinitions.getItemDefinitions(getRepairId(item)).isNoted() ? ItemDefinitions.getItemDefinitions(getRepairId(item)).getCertId() : getRepairId(item));
				item.setId(newId);
				player.getInventory().refresh();
			}
		}
	}

	private boolean isRepairable(Item item) {
		try {
			String name = item.getName();
			for (int i = 0; i < prices.length; i++) {
				if (((String) prices[i][0]).equalsIgnoreCase(name.split(" ")[0])) {
					if (isBarrows(item)) {
						if (getCharges(item) != -1)
							return true;
					} else {
						if (getRepairId(item) != -1)
							return true;
					}
				}
			}
		} catch (Exception e) {
			return false;
		}
		return false;
	}

	int npcId;

}*/