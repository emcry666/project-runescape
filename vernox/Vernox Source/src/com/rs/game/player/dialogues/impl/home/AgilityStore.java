package com.rs.game.player.dialogues.impl.home;

import com.rs.game.World;
import com.rs.game.player.dialogues.Dialogue;

/**
 * 
 * @author Administrator
 *
 */

public class AgilityStore extends Dialogue {

    @Override
    public void start() {
	if (player.getAgilityPoints() >= 50) {
	    sendNPCDialogue(14362, 9827, "Hello, I got a reward for you!");
	    stage = -1;
	} else {
	    sendNPCDialogue(14362, 9827,
		    "You completed " + player.getAgilityPoints() + " laps, comeback when u have 50 laps.");
	    stage = 1;
	}

    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    if (player.getAgilityPoints() >= 50) {
		sendOptionsDialogue("Pick a reward", "Agile top", "Agile legs");
		stage = 2;
	    }
	}
	else if (stage == 1)
	{
	    end();
	}
	else if (stage == 2)
	{
	    if (componentId == OPTION_1)
	    {
		if(player.getInventory().hasFreeSlots())
		{
		    player.getInventory().addItem(14936, 1);
		    player.setAgilityPoints(player.getAgilityPoints() - 50);
		}
		else
		{
		    sendDialogue("You don't have enough space in your inventory");
		}
	    }
	    else if (componentId == OPTION_2)
	    {
		if(player.getInventory().hasFreeSlots())
		{
		    player.getInventory().addItem(14938, 1);
		    player.setAgilityPoints(player.getAgilityPoints() - 50);
		}
		else
		{
		    sendDialogue("You don't have enough space in your inventory");
		}
	    }
	}
    }

    @Override
    public void finish() {
	// TODO Auto-generated method stub

    }

}
