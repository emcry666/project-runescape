package com.rs.game.minigames.duel;

import com.rs.game.player.dialogues.Dialogue;
public class HealerSurgeon extends Dialogue {
    	private int npcId;

    	@Override
    	public void start() {
    		npcId = (Integer) parameters[0];
    		sendNPCDialogue(npcId, 9827, "Hello, you look injured, can I take care of you?"
    				+ "<br>Would you like me to?");
    	}

    	@Override
    	public void run(int interfaceId, int componentId) {
    		if (stage == -1)
    		{
    			sendOptionsDialogue("Accept my assistance?", "Yes, my wounds need immediate help.", "No thank you, I choose to die.");
    			stage = 1;
    		}
    		else if(stage == 1)
    		{
    			if(componentId== OPTION_1)
    			{
    			// player.setHitpoints(5500);
    			//player.getEquipment().setEquipmentHpIncrease(player.getMaxHitpoints() - 5500);
    		    	}
    			if(componentId== OPTION_2)
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
