package com.rs.game.player.dialogues.impl;

import com.rs.game.WorldObject;
import com.rs.game.player.content.CrystalChest;
import com.rs.game.player.dialogues.Dialogue;

public class crystalchestD extends Dialogue{

    WorldObject object;
    @Override
    public void start() {
	sendDialogue("Warning: if you do not have enough inventory space for all the treasure you find, it will be dropped at your feet.");
	
    }

    @Override
    public void run(int interfaceId, int componentId) {

	if (stage == -1)
	{
	    sendOptionsDialogue("Use the crystal key?", "Yes.", "No.");
	    stage = 1;
	}
	else if (stage == 1)
	{
	    if (componentId == OPTION_1)
	    {
		CrystalChest.openChest(player, object);
	    }
	    else if (componentId == OPTION_2)
	    {
		stage =2;
	    }
	 }
	else if (stage == 2)
	{
	    end();
	}
	
    }

    @Override
    public void finish() {
	// TODO Auto-generated method stub
	
    }

}
