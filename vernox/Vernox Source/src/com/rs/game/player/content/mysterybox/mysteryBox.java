package com.rs.game.player.content.mysterybox;
import com.rs.game.player.Player;
import com.rs.utils.Utils;

public class mysteryBox {
    //pvmmysterybox

	private static int array [][] = {
		{4151}, //whip 
		{11732}, //dragon boots
		{1837}, //desertboots
		{1078}, //runeplatelegs
		{989, 2},//crystal key
		{4151}, //whipagain
		{9185}, //runecbow
		{3205}, //dragonhalberd
		{4716}, //dh helm
		{4718}, // dh axe
		{4720}, //dh plate
		{4722}, //dh legs
		{4753}, //verac help
		{4755}, //verac flail
		{4757}, //verac brassard
		{4759}, //verac skirt
		{2570}, //ring of life
		{1079}, //rune legs
		{25738}, //offhand rune scim
		{25740}, //offhand dragon scim
		{25894}, //offhand dragon cbow
		{25917}, //dragon cbow
		{1052}, //cape of legends
		{2550} //ring of recoil
	}; 
	private static int r;
	
	public static void handleBox(Player p) {
	    Player player = null;
	    if(player.getInventory().hasFreeSlots()) {
		    p.getInventory().deleteItem(6199, 1);
	    p.getInventory().addItem(array[r][0], 1);
	    } else {
		 p.getInventory().addItem(array[r][0], 1);
			player.sendMessage("The content's have been added to your bank!");
		    }
	    
	    r = Utils.random(array.length);
	}
    }

