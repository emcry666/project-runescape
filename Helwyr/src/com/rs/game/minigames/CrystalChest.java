package com.rs.game.minigames;

import com.rs.game.player.Player;
import com.rs.game.Animation;
import com.rs.utils.Utils;

/**
 * Represents the chest on which the key is used.
 * @author 'Corey 2010 <MobbyGFX96@hotmail.co.uk>
 */

public class CrystalChest {
	
	private static final int[] CHEST_REWARDS = { 6571, 1631, 5553, 5554, 5555, 5556, 5557, 11698, 11730, 11732,
												8901, 1127, 1079, 451, 2363, 1377, 1149, 7462, 6082,
												1021, 1023, 1025, 1027, 1029, 1031, 1033, 1035, 1052, 1199,
												1359, 6739, 1275, 1303, 989, 10499, 560, 555, 565, 995, 2572 , 18830,
												2591, 2593, 2595, 2597, 2607, 2609, 2611, 2613, 2615, 2617, 2619, 2621,
												7386, 7390, 7394, 2661, 2663, 2665, 2667, 10386, 10388, 2653, 2655, 2657,
												2659, 10370, 10372, 2669, 2671, 2673, 2675, 10378, 10380, 3481, 3483, 3486,
												3488, 2639, 2641, 2643, 10446, 10448, 10450, 2579, 4067, 2677,2678,2679,2680,2681,2682,2683,2684,2685,2686,2687,2688,2689,2690,2691,2692,2693,2694,2695,2696,2697,2698
												};
	
	public static final int[] KEY_HALVES = { 985, 987 };
	public static final int KEY = 989;
	public static final int Animation = 881;
	
	/**
	 * Represents the key being made.
	 * Using tooth halves.
	 */
	public static void makeKey(Player p){
		if (p.getInventory().containsItem(toothHalf(), 1) 
				&& p.getInventory().containsItem(loopHalf(), 1)){
			p.getInventory().deleteItem(toothHalf(), 1);
			p.getInventory().deleteItem(loopHalf(), 1);
			p.getInventory().addItem(KEY, 1);
			p.sm("You succesfully make a crystal key.");
		}
	}
	
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
			p.getInventory().addItem(995, Utils.random(2000000));
			p.getInventory().addItem(CHEST_REWARDS[Utils.random(getLength() - 1)], 1);
			p.sm("You find some treasure in the chest.");
		}
	}
	
	public static int getLength() {
		return CHEST_REWARDS.length;
	}
	
	/**
	 * Represents the toothHalf of the key.
	 */
	public static int toothHalf(){
		return KEY_HALVES[0];
	}
	
	/**
	 * Represent the loop half of the key.
	 */
	public static int loopHalf(){
		return KEY_HALVES[1];
	}
	
}