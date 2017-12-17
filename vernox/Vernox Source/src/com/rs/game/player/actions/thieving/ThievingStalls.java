package com.rs.game.player.actions.thieving;

import com.rs.game.Animation;
import com.rs.game.Graphics;
import com.rs.game.WorldObject;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.utils.Utils;

public class ThievingStalls {
    
    /**
	 * The npc stun animation.
	 */
	private static final Animation
	PICKPOCKETING_ANIMATION = new Animation(881),
	DOUBLE_LOOT_ANIMATION = new Animation(5074);
	
	private static final Graphics 
	DOUBLE_LOOT_GFX = new Graphics(873);
	
	private static String LOOT_MSG = "You've succesfully steal from the stall";
	private static String DOUBLE_LOOT_MSG = "Your lighting-fast reactions allow you to steal double loot.";

    public static void Steal(Player player, WorldObject object)
    {
	int r = Utils.random(25);
	switch(object.getId())
	{
	case 4874:
	    if(!player.getInventory().hasFreeSlots())
	    {
		player.sendMessage("You don't have enough inventory space.");
	    }else{
		player.getInventory().addItem(1637, 1);
		player.getSkills().addXp(Skills.THIEVING, 20);
		player.setNextAnimation(PICKPOCKETING_ANIMATION);
		player.sendMessage(LOOT_MSG);
		player.lock(3);
		if (r == 1)
		{
		    player.getInventory().addItem(1637, 2);
		    player.getSkills().addXp(Skills.THIEVING, 30);
		    player.setNextAnimation(DOUBLE_LOOT_ANIMATION);
		    player.setNextGraphics(DOUBLE_LOOT_GFX);
		    player.sendMessage(DOUBLE_LOOT_MSG);
		    player.lock(3);
		}
	    }
	    break;
	case 4876:
	    if (player.getSkills().getLevel(Skills.THIEVING) >= 60)
	    {
		    if(!player.getInventory().hasFreeSlots())
		    {
			player.sendMessage("You don't have enough inventory space.");
		    }else{
        	    player.getInventory().addItem(950, 1);
        	    player.getSkills().addXp(Skills.THIEVING, 40);
        	    player.setNextAnimation(PICKPOCKETING_ANIMATION);
        	    player.sendMessage(LOOT_MSG);
        	    player.lock(3);
        	    if (r == 1)
        	    {
        		player.getInventory().addItem(950, 2);
        		player.getSkills().addXp(Skills.THIEVING, 50);
        		player.setNextAnimation(DOUBLE_LOOT_ANIMATION);
        		player.setNextGraphics(DOUBLE_LOOT_GFX);
        		player.sendMessage(DOUBLE_LOOT_MSG);
        		player.lock(3);
        	    }
		    }
	    } else {
		player.sendMessage("You need a thieving level of 60 to steal from this stall.");
	    }
	    break;
	case 4877:
	    if (player.getSkills().getLevel(Skills.THIEVING) >= 80)
	    {
		    if(!player.getInventory().hasFreeSlots())
		    {
			player.sendMessage("You don't have enough inventory space.");
		    }else{
        	    player.getInventory().addItem(1391, 1);
        	    player.getSkills().addXp(Skills.THIEVING, 80);
        	    player.setNextAnimation(PICKPOCKETING_ANIMATION);
        	    player.sendMessage(LOOT_MSG);
        	    player.lock(3);
        	    if (r == 1)
        	    {
        		player.getInventory().addItem(1391, 2);
        		player.getSkills().addXp(Skills.THIEVING, 160);
        		player.setNextAnimation(DOUBLE_LOOT_ANIMATION);
        		player.setNextGraphics(DOUBLE_LOOT_GFX);
        		player.sendMessage(DOUBLE_LOOT_MSG);
        		player.lock(3);
        	    }
		    }
	    } else {
		player.sendMessage("You need a thieving level of 80 to steal from this stall.");
	    }
	    break;
	}
    }
}
