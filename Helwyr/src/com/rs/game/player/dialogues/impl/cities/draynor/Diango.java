package com.rs.game.player.dialogues.impl.cities.draynor;

import com.rs.game.item.Item;
import com.rs.game.item.ItemsContainer;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

/**
 * 
 * @author Frostbite
 *
 *<contact@frostbitersps@gmail.com><skype@frostbitersps>
 */

public class Diango extends Dialogue {

	private int npcId;

	private ItemsContainer<Item> items;
	/**
	 * Represents Diangos Interface
	 */
	public int COLLECT_INTERFACE = 554;

	/**
	 * Represents Holiday Event Items
	 */
	private Item[] holidayEventItems = { new Item(4151)

	};

	int[] holidayItems = { 4151

	};

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		stage = (Integer) parameters[1];
		switch(stage) {
		case 0:
			npc(npcId, HAPPY, "Howdy there, partner.");
			stage = -4;
			break;
		case 3:
			player(PLAIN_TALKING, "I'd like to check my items, please.");
			stage = 14;
			break;
		}

	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
		case -4:
			npc(npcId, HAPPY, "Want to see my spinning plates or kites? Want to check", 
					"out my range of party items? Or did you want an item", 
					"back?");
			stage = -1;
			break;

		case -1:
			options(DEFAULT, "Spinning plates?", "Wow, a kite!", "Party items, you say?", "I'd like to check my items, please.");
			stage = 1;
			break;

		case 1:
			switch(componentId) {
			case OPTION_1:
				npc(npcId, HAPPY, "That's right - there's a funny story behind them. Their", 
						"shipment was held up by thieves.");
				stage = 2;
				break;
			case OPTION_2:
				npc(npcId, HAPPY, "You're not the first to say that...");
				stage = 3;
				break;
			case OPTION_3:
				npc(npcId, HAPPY, "Yep! in a partnership with my pal Party Pete, we've",
						"decided to launch a whole range of partyware to help", 
						"celebrate with Royal Wedding of the King Black Dragon and",
						"the Kalphite Queen. Confetti, bubble makears, fireworks,");
				stage = 7;
				break;
			case OPTION_4:
				npc(npcId, HAPPY, "Sure thing, let me just see what you're missing.");
				stage = 14;
				break;
			}
			break;

		case 2:
			npc(npcId, LISTENS_THEN_LAUGHS, "The crate was marked 'Dragon Plates'.",
					"Apparently they thought it was some kind of armour,",
					"when really it's just a plate with a dragon on it!");
			stage = -3;
			break;

		case 3:
			player(ASKING, "Can I have one, please?");
			stage = 4;
			break;

		case 4:
			npc(npcId, NORMAL, "Well, I suppose I did order more than I need... It's yours",
					"for the bargain price of 100 coins.");
			stage = 5;
			break;

		case 5:
			options(DEFAULT, "That's a bargain! I'll take one.", "No, thanks, I don't want one.");
			stage = 6;
			break;

		case 6:
			switch(componentId) {
			case OPTION_1:
				ShopsHandler.openShop(player, 98);
				end();
				break;
			case OPTION_2:
				end();
				break;
			}
			break;

		case 7:
			npc(npcId, HAPPY, "firecrackers. We even have commemorative mug!");
			stage = 8;
			break;

		case 8:
			player(ASKING, "King Black Dragon and Kalphite... Wait, what?");
			stage = 9;
			break;

		case 9:
			npc(npcId, NORMAL, "Er, well, that's what i was told; perhaps our providers got",
					"it wrong. mind you, it wouldn't be the first time. like, this",
					"once, we were due to recieve a shipment of dragon mail,",
					"and we got a pile of slightly singed letters instead.");
			stage = 10;
			break;

		case 10:
			npc(npcId, NORMAL, "Anyway, we've got all those items on scale, and I even have",
					"a suitable bouquet available on members' worlds for those",
					"who want to emulate the happy bride!");
			stage = 11;
			break;

		case 11:
			player(ASKING, "She had a bouquet? The Kalphite Queen? Big bug, beedy-",
					"eyed, occasionally flies about when it's not laying eggs...",
					"Are we talking about the same creature?");
			stage = 12;
			break;

		case 12:
			npc(npcId, PLAIN_TALKING, "Listen, partner, I'm not the only writing the advertising", //TODO
					"pitch here.I got the goods and been told what to say in",
					"order to sell them. It's not the most convincing pitch I've",
					"ever had to do, but if you ask me, the products don't");
			stage = 13;
			break;

		case 13:
			npc(npcId, PLAIN_TALKING, "need a pitch. They speak for themselves. Have a",
					"butcher's.");
			stage = -3;
			break;

		case 14:
			end();
			//handleMissingItems();
			break;

		case -3:
			ShopsHandler.openShop(player, 98);
			end();
			break;

		case -2:
			break;
		default:
			end();
			break;
		}
	}

	@Override
	public void finish() {
		// TODO Auto-generated method stub

	}

	public void handleMissingItems() {
		player.getInterfaceManager().sendInterface(COLLECT_INTERFACE);
		player.getPackets().sendItems(90, items);
	}

	public int[] getHItems() {
		return holidayItems;
	}

	public ItemsContainer<Item> getItems() {
		return items;
	}

}
