package com.rs.game.player.content.mysterybox;
import com.rs.game.player.Player;
import com.rs.utils.Utils;

public class SkillingMysteryBox {

	private static int array [][] = {
		{1512, 200}, //regular logs
		{1522, 175}, //oak logs
		{1520, 150}, //willow logs
		{1518, 125}, //maple logs
		{1516, 100}, //yew Hlogs
		{1514, 75}, //magic logs
		{1618, 25}, //uncutdiamonds
		{1620, 50}, //uncutruby
		{1622, 50}, //uncutemeralds
		{1624, 50}, //uncutsapphire
		{1626, 50}, //uncutopal
		{6571, 1}, //uncutOynx
		{2354, 100}, //steelbar
		{2358, 100}, //goldbar
		{2362, 50}, //adamantbar
		{2364, 50}, //runebar
		{452, 50}, //runeore
		{200, 40}, //grimyguam
		{206, 25} // grimy landatyme
	}; 
	private static int r;
	
	public static void handleBox(Player p) {
	    p.getInventory().deleteItem(18768, 1);
	    p.getInventory().addItem(array[r][0], 1);
	    r = Utils.random(array.length);
	
	}
    }
