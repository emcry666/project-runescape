package com.rs.game.minigames;

import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.Animation;
import com.rs.utils.Utils;

/**
 * Represents the chest on which the key is used.
 * @author 'Corey 2010 <MobbyGFX96@hotmail.co.uk>
 */

public class RotsChest {
	
	private static final int[] CHEST_REWARDS = { 11333, 989, 991, 4708, 4710, 4712, 4714,
												 4753, 4755, 4757, 4759, 4724, 4726, 4728,
												 4730, 4716, 4718, 4720, 4724, 4745, 4747,
												 4749, 4751, 4732, 4734, 4736, 4738, 2717,
												 7462, 2366, 11335, 11286, 14854, 990, 11335};
	
	private static final Item[] ROTS_RARES = {
		new Item(11286, 1),
		new Item(995, 50000000),
		new Item(14854, 1),
		new Item(14854, 1),
		new Item(14854, 1),
		new Item(990, 15),
		new Item(11335, 1)
	};
	
	public static final int Animation = 881;
	public static final int KEY = 21511;
	
	/**
	 * Represents the key being made.
	 * Using tooth halves.
	 */
	
	/**
	 * If the player can open the chest.
	 */
	public static boolean canOpen(Player p){
		if(p.getInventory().containsItem(KEY, 1)){
			return true;
		}else{
			p.sm("<col=FFFF00>This chest is locked.</col>");
			return false;
		}
	}
	
	/**
	 * When the player searches the chest.
	 */
	public static void searchChest(final Player p){
		if (canOpen(p)){
			p.sm("You unlock the chest with your key.");
			p.getInventory().deleteItem(KEY, 1);
			p.setNextAnimation(new Animation(Animation));
			p.getInventory().addItem(995, 1000000);
			p.getInventory().addItem(15271, 50);
			p.getInventory().addItem(9245, 25);
			if(Utils.random(7) == 0)
			p.getInventory().addItem(CHEST_REWARDS[Utils.random(getLength() - 1)], 1);
			p.sm("You find rare loot in the chest.");
		
		}
	}
	
	public static int getLength() {
		return CHEST_REWARDS.length;
	}
	
	/**
	 * Represents the toothHalf of the key.
	 */
	
	
}
