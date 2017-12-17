/**
 * 
 */
package com.rs.game.player.dialogues.impl.skills;

import com.rs.game.player.dialogues.Dialogue;

/**
 * @author Dylan || Mystic Wolf || Jul 21, 2016
 *
 */
public class CrystalTool extends Dialogue	{

	private int npcId;

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		sendNPCDialogue(npcId, 9827, "Hello, I can exchange your dust or ores into crystal items"
				+ "<br>Would you like to?");
	}

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1)
	{
		sendOptionsDialogue("Would you like to?", "Yes, I would like to exchange my items", "Naw, I'm not interested");
		stage = 1;
	}
	else if (stage == 1)
	{
	    if (componentId == OPTION_1)
	    {
		sendNPCDialogue(npcId, 9827, "Alright, pick something you would like to exchange");
		stage = 2;
	    }
	    else if(componentId == OPTION_2)
	    {
		end();
	    }
	}
	else if (stage == 2)
	{
	    sendOptionsDialogue("Exchange", "Crystal Hatchet", "Crystal Pickaxe", "Crystal Staff", "Crystal Wand", "Next Page");
	    stage = 3;
	}
	else if (stage == 3)
	{
	    if(componentId == OPTION_1)
	    {
		sendNPCDialogue(npcId, 9827, "Crystal Hatchet <br>"
			+ "Would you pay with Ores or Dust?");
		stage = 5;
	    }
	    else if (componentId == OPTION_2)
	    {
		sendNPCDialogue(npcId, 9827, "Crystal Pickaxe <br>"
			+ "Would you pay with Ores or Dust?");
		stage = 6;
	    }
	    else if (componentId == OPTION_3)
	    {
		sendNPCDialogue(npcId, 9827, "Crystal Staff <br>"
			+ "Would you pay with Ores or Dust?");
		stage = 7;
	    }
	    else if (componentId == OPTION_4)
	    {
		sendNPCDialogue(npcId, 9827, "Crystal Wand <br>"
			+ "Would you pay with Ores or Dust?");
		stage = 8;
	    }
	    else if (componentId == OPTION_5)
	    {
		sendOptionsDialogue("Exchange", "Crystal Orb", "Crystal Halberd", "Crystal Dagger & Off-hand", "Crystal Bow");
		stage = 4;
	    }
	}
	else if (stage == 4)
	{
	    if(componentId == OPTION_1)
	    {
		sendNPCDialogue(npcId, 9827, "Crystal Orb <br>"
			+ "Would you pay with Ores or Dust?");
		stage = 9;
	    }
	    else if (componentId == OPTION_2)
	    {
		sendNPCDialogue(npcId, 9827, "Crystal Halberd <br>"
			+ "Would you pay with Ores or Dust?");
		stage = 10;
	    }
	    else if (componentId == OPTION_3)
	    {
		sendNPCDialogue(npcId, 9827, "Crystal Dagger & Off-hand Dagger <br>"
			+ "Would you pay with Ores or Dust?");
		stage = 11;
	    }
	    else if (componentId == OPTION_4)
	    {
		sendNPCDialogue(npcId, 9827, "Crystal Bow <br>"
			+ "Would you pay with Ores or Dust?");
		stage = 12;
	    }
	}
	else if (stage == 5)
	{
	    sendOptionsDialogue("Crystal Hatchet", "Ores (500)", "Dust (500)");
	    stage = 13;
	}
	else if (stage == 6)
	{
	    sendOptionsDialogue("Crystal Pickaxe", "Ores (500)", "Dust (500)");
	    stage = 14;
	}
	else if (stage == 7)
	{
	    sendOptionsDialogue("Crystal Staff", "Ores (500)", "Dust (500)");
	    stage = 15;
	}
	else if (stage == 8)
	{
	    sendOptionsDialogue("Crystal Wand", "Ores (500)", "Dust (500)");
	    stage = 16;
	}
	else if (stage == 9)
	{
	    sendOptionsDialogue("Crystal Orb", "Ores (500)", "Dust (500)");
	    stage = 17;
	}
	else if (stage == 10)
	{
	    sendOptionsDialogue("Crystal Halberd", "Ores (500)", "Dust (500)");
	    stage = 18;
	}
	else if (stage == 11)
	{
	    sendOptionsDialogue("Crystal Dagger & Off-hand", "Ores (500)", "Dust (500)");
	    stage = 19;
	}
	
	else if (stage == 12)
	{
	    sendOptionsDialogue("Crystal Bow", "Ores (500)", "Dust (500)");
	    stage = 20;
	}
	
	else if (stage == 13)
	{
	    if(componentId == OPTION_1)
	    {
		if (!player.getInventory().containsItem(32262, 500))
		{
		    player.sendMessage("You don't have enough corrupted ores to exchange this item.");
		    end();
		} else {
		    player.getInventory().deleteItem(32262, 500);
		    player.getInventory().addItem(32645, 1);
		    player.sendMessage("<col=00ff00>You've succesfully exchanged 500 ores.");
		    end();
		}
	    }
	    else if (componentId == OPTION_2)
	    {
		if (!player.getInventory().containsItem(32622, 500))
		{
		    player.sendMessage("You don't have enough harmonic dust to exchange this item.");
		    end();
		} else {
		    player.getInventory().deleteItem(32622, 500);
		    player.getInventory().addItem(32645, 1);
		    player.sendMessage("<col=00ff00>You've succesfully exchanged 500 dust.");
		    end();
		}
	    }
	}
	else if (stage == 14)
	{
	    if(componentId == OPTION_1)
	    {
		if (!player.getInventory().containsItem(32262, 500))
		{
		    player.sendMessage("You don't have enough corrupted ores to exchange this item.");
		    end();
		} else {
		    player.getInventory().deleteItem(32262, 500);
		    player.getInventory().addItem(32646, 1);
		    player.sendMessage("<col=00ff00>You've succesfully exchanged 500 ores.");
		    end();
		}
	    }
	    else if (componentId == OPTION_2)
	    {
		if (!player.getInventory().containsItem(32622, 500))
		{
		    player.sendMessage("You don't have enough harmonic dust to exchange this item.");
		    end();
		} else {
		    player.getInventory().deleteItem(32622, 500);
		    player.getInventory().addItem(32646, 1);
		    player.sendMessage("<col=00ff00>You've succesfully exchanged 500 dust.");
		    end();
		}
	    }
	}
	else if (stage == 15)
	{
	    if(componentId == OPTION_1)
	    {
		if (!player.getInventory().containsItem(32262, 500))
		{
		    player.sendMessage("You don't have enough corrupted ores to exchange this item.");
		    end();
		} else {
		    player.getInventory().deleteItem(32262, 500);
		    player.getInventory().addItem(32210, 1);
		    player.sendMessage("<col=00ff00>You've succesfully exchanged 500 ores.");
		    end();
		}
	    }
	    else if (componentId == OPTION_2)
	    {
		if (!player.getInventory().containsItem(32622, 500))
		{
		    player.sendMessage("You don't have enough harmonic dust to exchange this item.");
		    end();
		} else {
		    player.getInventory().deleteItem(32622, 500);
		    player.getInventory().addItem(32210, 1);
		    player.sendMessage("<col=00ff00>You've succesfully exchanged 500 dust.");
		    end();
		}
	    }
	}
	else if (stage == 16)
	{
	    if(componentId == OPTION_1)
	    {
		if (!player.getInventory().containsItem(32262, 500))
		{
		    player.sendMessage("You don't have enough corrupted ores to exchange this item.");
		    end();
		} else {
		    player.getInventory().deleteItem(32262, 500);
		    player.getInventory().addItem(32213, 1);
		    player.sendMessage("<col=00ff00>You've succesfully exchanged 500 ores.");
		    end();
		}
	    }
	    else if (componentId == OPTION_2)
	    {
		if (!player.getInventory().containsItem(32622, 500))
		{
		    player.sendMessage("You don't have enough harmonic dust to exchange this item.");
		    end();
		} else {
		    player.getInventory().deleteItem(32622, 500);
		    player.getInventory().addItem(32213, 1);
		    player.sendMessage("<col=00ff00>You've succesfully exchanged 500 dust.");
		    end();
		}
	    }
	}
	else if (stage == 17)
	{
	    if(componentId == OPTION_1)
	    {
		if (!player.getInventory().containsItem(32262, 500))
		{
		    player.sendMessage("You don't have enough corrupted ores to exchange this item.");
		    end();
		} else {
		    player.getInventory().deleteItem(32262, 500);
		    player.getInventory().addItem(32216, 1);
		    player.sendMessage("<col=00ff00>You've succesfully exchanged 500 ores.");
		    end();
		}
	    }
	    else if (componentId == OPTION_2)
	    {
		if (!player.getInventory().containsItem(32622, 500))
		{
		    player.sendMessage("You don't have enough harmonic dust to exchange this item.");
		    end();
		} else {
		    player.getInventory().deleteItem(32622, 500);
		    player.getInventory().addItem(32216, 1);
		    player.sendMessage("<col=00ff00>You've succesfully exchanged 500 dust.");
		    end();
		}
	    }
	}
	else if (stage == 18)
	{
	    if(componentId == OPTION_1)
	    {
		if (!player.getInventory().containsItem(32262, 500))
		{
		    player.sendMessage("You don't have enough corrupted ores to exchange this item.");
		    end();
		} else {
		    player.getInventory().deleteItem(32262, 500);
		    player.getInventory().addItem(32219, 1);
		    player.sendMessage("<col=00ff00>You've succesfully exchanged 500 ores.");
		    end();
		}
	    }
	    else if (componentId == OPTION_2)
	    {
		if (!player.getInventory().containsItem(32622, 500))
		{
		    player.sendMessage("You don't have enough harmonic dust to exchange this item.");
		    end();
		} else {
		    player.getInventory().deleteItem(32622, 500);
		    player.getInventory().addItem(32219, 1);
		    player.sendMessage("<col=00ff00>You've succesfully exchanged 500 dust.");
		    end();
		}
	    }
	}
	else if (stage == 19)
	{
	    if(componentId == OPTION_1)
	    {
		if (!player.getInventory().containsItem(32262, 500))
		{
		    player.sendMessage("You don't have enough corrupted ores to exchange this item.");
		    end();
		} else {
		    player.getInventory().deleteItem(32262, 500);
		    player.getInventory().addItem(32222, 1);
		    player.getInventory().addItem(32225, 1);
		    player.sendMessage("<col=00ff00>You've succesfully exchanged 500 ores.");
		    end();
		}
	    }
	    else if (componentId == OPTION_2)
	    {
		if (!player.getInventory().containsItem(32622, 500))
		{
		    player.sendMessage("You don't have enough harmonic dust to exchange this item.");
		    end();
		} else {
		    player.getInventory().deleteItem(32622, 500);
		    player.getInventory().addItem(32222, 1);
		    player.getInventory().addItem(32225, 1);
		    player.sendMessage("<col=00ff00>You've succesfully exchanged 500 dust.");
		    end();
		}
	    }
	}
	else if (stage == 20)
	{
	    if(componentId == OPTION_1)
	    {
		if (!player.getInventory().containsItem(32262, 500))
		{
		    player.sendMessage("You don't have enough corrupted ores to exchange this item.");
		    end();
		} else {
		    player.getInventory().deleteItem(32262, 500);
		    player.getInventory().addItem(32228, 1);
		    player.sendMessage("<col=00ff00>You've succesfully exchanged 500 ores.");
		    end();
		}
	    }
	    else if (componentId == OPTION_2)
	    {
		if (!player.getInventory().containsItem(32622, 500))
		{
		    player.sendMessage("You don't have enough harmonic dust to exchange this item.");
		    end();
		} else {
		    player.getInventory().deleteItem(32622, 500);
		    player.getInventory().addItem(32228, 1);
		    player.sendMessage("<col=00ff00>You've succesfully exchanged 500 dust.");
		    end();
		}
	    }
	}
	
	
	
	
    }

    /* (non-Javadoc)
     * @see com.rs.game.player.dialogues.Dialogue#finish()
     */
    @Override
    public void finish() {
	// TODO Auto-generated method stub
	
    }

}
