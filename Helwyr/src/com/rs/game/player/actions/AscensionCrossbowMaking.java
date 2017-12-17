package com.rs.game.player.actions;

import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public class AscensionCrossbowMaking extends Action {

	/**
	 * Indicates the items required to make the asc crossbow.
	 */
	public Item item = null;
	
	@Override
	public boolean start(Player player) {
		return checkAll(player);
	}
	
	public boolean checkAll(Player player) {
		if(player.getSkills().getLevel(Skills.FLETCHING) < 90) {
			player.getPackets().sendGameMessage("You need a level of 90 fletching to fletch Ascension Bolts.");
			return false;
		}
		if(!player.getInventory().containsItem(25917, 1)) {
			player.getPackets().sendGameMessage("You need a Dragon C'bow in order to create an Ascension Crossbow.");
			return false;
		}
		for (int i = 0; i < 7; i++) {
			int index = 28456;
			item = new Item(++index);
			if(item == null)
				continue;
			if(player.getInventory().containsItem(item)) 
				continue;
			else
				player.getPackets().sendGameMessage("You need a " + item.getName().toLowerCase() + " in order to create an Ascension Crossbow.");
			return false;
		}
		item = new Item(28436);
		if(!player.getInventory().containsItem(item.getId(), 100)) {
			player.getPackets().sendGameMessage("You need 100 of " + item.getName().toLowerCase() + " to make an Ascension Crossbow.");
			return false;
		}
		return true;
	}

	@Override
	public boolean process(Player player) {
		return checkAll(player);
	}

	@Override
	public int processWithDelay(Player player) {
		return 4;
	}

	@Override
	public void stop(Player player) {
		setActionDelay(player, -1);
	}

}
