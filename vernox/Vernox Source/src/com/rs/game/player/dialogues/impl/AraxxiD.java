package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;

public class AraxxiD extends Dialogue{

    @Override
    public void start() {
	sendDialogue("Araxxor lies beyond this web! <br> "
		   +"Make sure you are well prepared for this battle!");
	
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1)
	{
	    sendOptionsDialogue("Are you sure?", "Yes", "No");
	    stage = 1;
	}
	
	else if( stage == 1)
	{
	    if(componentId == OPTION_1)
	    {
		player.getControlerManager().startControler("AraxxiInstanceController");
	    }
	    else if (componentId == OPTION_2)
	    {
		end();
	    }
	}
    }

    @Override
    public void finish() {
	// TODO Auto-generated method stub
	
    }

}
