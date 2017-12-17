package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;

public class GrimReq extends Dialogue {

    @Override
    public void start() {
	sendEntityDialogue(IS_NPC, "Death", 16927, 9790,
		"You don't meet the requirements for my tasks!");
	
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1)
	{
	    sendPlayerDialogue(9753, "But.. but? what are the requirements?");
	    stage = 1;
	}
	else if( stage == 1)
	{
		sendEntityDialogue(IS_NPC, "Death", 16927, 9789,
			"You need atleast a slayer level of 70 and a combat level of 100");
		stage = 2;
	}
	else if (stage == 2)
	{
	    sendPlayerDialogue(9779, "Alright, thanks for the information");
	    stage = 3;
	}
	else if (stage == 3)
	{
	    end();
	}
	
    }

    @Override
    public void finish() {
	// TODO Auto-generated method stub
	
    }

}
