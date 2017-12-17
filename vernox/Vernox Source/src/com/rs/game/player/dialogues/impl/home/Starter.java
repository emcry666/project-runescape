package com.rs.game.player.dialogues.impl.home;

import com.rs.game.World;
import com.rs.game.player.content.FriendsChat;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.Utils;

public class Starter extends Dialogue {

    @Override
    public void start() {
	sendOptionsDialogue("<col=FF0000>Choose a Starter</col>" , "Ironman mode" , "Normal mode (x40, x100)");
	
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (componentId == OPTION_1)
	{
	    player.isIronMan = true;
	    player.starter = 1;
	    player.setXpRateMode(2);
	    player.getAppearence().setTitle(5611);
	    player.getInventory().addItem(6099, 1);
	    player.getInventory().addItem(995, 85000);
	    player.getInventory().addItem(1725, 1);
	    player.getInventory().addItem(3105, 1);
	    player.getInventory().addItem(6568, 1);
	    player.getInventory().addItem(1321, 1);
	    player.getInventory().addItem(25743, 1);
	    player.getInventory().addItem(1155, 1);
	    player.getInventory().addItem(1103, 1);
	    player.getInventory().addItem(1075, 1);
	    player.getInventory().addItem(334, 100);
	    FriendsChat.requestJoin(player, Utils.formatPlayerNameForDisplay("Vernox"));
	    World.sendWorldMessage("<img=11><col=7e7e7e> Welcome " + player.getDisplayName() +" to Vernox! ", false);
	    end();
	}
	else if (componentId == OPTION_2)
	{
	    player.starter = 1;
	    player.getInventory().addItem(6099, 1);
	    player.getInventory().addItem(995, 85000);
	    player.getInventory().addItem(1725, 1);
	    player.getInventory().addItem(3105, 1);
	    player.getInventory().addItem(6568, 1);
	    player.getInventory().addItem(1321, 1);
	    player.getInventory().addItem(25743, 1);
	    player.getInventory().addItem(1155, 1);
	    player.getInventory().addItem(1103, 1);
	    player.getInventory().addItem(1075, 1);
	    player.getInventory().addItem(334, 100);
	    player.setXpRateMode(2);
	    FriendsChat.requestJoin(player, Utils.formatPlayerNameForDisplay("Vernox"));
	    World.sendWorldMessage("<img=6><col=00ff00>Welcome " + player.getDisplayName() +" to Vernox! ", false);
	    end();
	}
	
    }

    @Override
    public void finish() {
	// TODO Auto-generated method stub
	
    }

}
