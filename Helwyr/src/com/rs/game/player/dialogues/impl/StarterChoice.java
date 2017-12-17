package com.rs.game.player.dialogues.impl;

import com.rs.game.item.Item;
import com.rs.game.player.content.PlayerLook;
import com.rs.game.player.dialogues.Dialogue;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public class StarterChoice extends Dialogue {

	@Override
	public void start() {
		options("Choose your Starter", "Normal Starter", "No Starter (45 Minute 25% Exp Increase)", "No Starter(Increased Money)");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		
		switch(stage) {
		case -1:
			switch(componentId) {
			case OPTION_1:
				new StarterPack().giveStarter();
				break;
			case OPTION_2:
				player.claimedStarter = true;
				player.sm("You now have 115% experience increase for the next 45 minutes.");
				player.setHasIncreasedXp(2700000);
				player.getInventory().addItem(995, 100000);
				player.getInventory().addItem(10499, 1);
				end();
				break;
			case OPTION_3:
				player.getInventory().addItem(995, 2500000);//2.5m
				player.getInventory().addItem(10499, 1);
				player.claimedStarter = true;
				end();
				break;
			}
			break;

		case -2:
			player.claimedStarter = true;
			end();
			break;

		}
	}

	@Override
	public void finish() {
		player.unlock();
		PlayerLook.openCharacterCustomizing(player);
	}


	class StarterPack {


		public void giveStarter() {

			Item[] starterItems = new Item[] {

					new Item(1755), new Item(1267), new Item(1349), new Item(590), new Item(946),  //tools
					
					new Item(11820, 1), new Item(11818, 1), new Item(1323), new Item(8845), new Item(7947, 250), new Item(2437, 50), new Item(2441, 50), new Item(2443, 50), //set 1

					new Item(841), new Item(851), new Item(884, 250), new Item(890, 250), new Item(10499), new Item(11864), //set 2
					
					new Item(1405), new Item(558, 250), new Item(554, 500), new Item(557, 250), new Item(11960), new Item(1712),new Item(7454), new Item(3105), new Item(1052), 

			};

			for (int i = 0; i < starterItems.length; i++) {
				Item item = null;
				item = starterItems[i];
				if(player.getInventory().hasFreeSlots())
					player.getInventory().addItem(item);
				else 
					player.getBank().addItem(item.getId(), item.getAmount(), false);
			}
			player.getMoneyPouch().addToMoneyPouch(150000);
			player.unlock();
			player.claimedStarter = true;
			end();
		}

	}


}
