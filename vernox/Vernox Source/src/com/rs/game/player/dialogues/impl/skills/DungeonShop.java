package com.rs.game.player.dialogues.impl.skills;

import com.rs.game.player.dialogues.Dialogue;

public class DungeonShop extends Dialogue {

    @Override
    public void start() {
	sendOptionsDialogue("Current Tokens : " + (int) player.getDungTokens(), "Chaotic rapier (200k)",
		"Chaotic longsword (200k)", "Chaotic maul (200k)", "Chaotic staff (200k)", "Next page");

    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    if (componentId == OPTION_1) {
		if (player.getDungTokens() >= 200000) {
		    if (player.getInventory().hasFreeSlots()) {
			player.getInventory().addItem(18349, 1);
			player.setDungTokens(player.getDungTokens() - 200000);
			player.getPackets().sendGameMessage("You bought a chaotic rapier");
			end();
		    } else {
			end();
			player.getPackets().sendGameMessage("You have not enough inventory space");
		    }
		} else {
		    end();
		    player.getPackets().sendGameMessage("You don't have enough tokens to purchase this");
		}
	    } else if (componentId == OPTION_2) {
		if (player.getDungTokens() >= 200000) {
		    if (player.getInventory().hasFreeSlots()) {
			player.getInventory().addItem(18351, 1);
			player.setDungTokens(player.getDungTokens() - 200000);
			player.getPackets().sendGameMessage("You bought a chaotic longsword");
			end();
		    } else {
			end();
			player.getPackets().sendGameMessage("You have not enough inventory space");
		    }
		} else {
		    end();
		    player.getPackets().sendGameMessage("You don't have enough tokens to purchase this");
		}
	    } else if (componentId == OPTION_3) {
		if (player.getDungTokens() >= 200000) {
		    if (player.getInventory().hasFreeSlots()) {
			player.getInventory().addItem(18353, 1);
			player.setDungTokens(player.getDungTokens() - 200000);
			player.getPackets().sendGameMessage("You bought a chaotic maul");
			end();
		    } else {
			end();
			player.getPackets().sendGameMessage("You have not enough inventory space");
		    }
		} else {
		    end();
		    player.getPackets().sendGameMessage("You don't have enough tokens to purchase this");
		}
	    } else if (componentId == OPTION_4) {
		if (player.getDungTokens() >= 200000) {
		    if (player.getInventory().hasFreeSlots()) {
			player.getInventory().addItem(18355, 1);
			player.setDungTokens(player.getDungTokens() - 200000);
			player.getPackets().sendGameMessage("You bought a chaotic staff");
			end();
		    } else {
			end();
			player.getPackets().sendGameMessage("You have not enough inventory space");
		    }
		} else {
		    end();
		    player.getPackets().sendGameMessage("You don't have enough tokens to purchase this");
		}
	    } else if (componentId == OPTION_5) {
		sendOptionsDialogue("Current Tokens : " + (int) player.getDungTokens(), "Chaotic crossbow (200k)",
			"Chaotic kiteshield (200k)", "Off-hand chaotic rapier (100k)",
			"Off-hand chaotic longsword (100k)", "Next Page");
		stage = 1;
	    }
	} else if (stage == 1) {
	    if (componentId == OPTION_1) {
		if (player.getDungTokens() >= 200000) {
		    if (player.getInventory().hasFreeSlots()) {
			player.getInventory().addItem(18357, 1);
			player.setDungTokens(player.getDungTokens() - 200000);
			player.getPackets().sendGameMessage("You bought a chaotic crossbow");
			end();
		    } else {
			end();
			player.getPackets().sendGameMessage("You have not enough inventory space");
		    }
		} else {
		    end();
		    player.getPackets().sendGameMessage("You don't have enough tokens to purchase this");
		}
	    } else if (componentId == OPTION_2) {
		if (player.getDungTokens() >= 200000) {
		    if (player.getInventory().hasFreeSlots()) {
			player.getInventory().addItem(18359, 1);
			player.setDungTokens(player.getDungTokens() - 200000);
			player.getPackets().sendGameMessage("You bought a chaotic kiteshield");
			end();
		    } else {
			end();
			player.getPackets().sendGameMessage("You have not enough inventory space");
		    }
		} else {
		    end();
		    player.getPackets().sendGameMessage("You don't have enough tokens to purchase this");
		}
	    } 
	    else if (componentId == OPTION_3) {
		if (player.getDungTokens() >= 100000) {
		    if (player.getInventory().hasFreeSlots()) {
			player.getInventory().addItem(25991, 1);
			player.setDungTokens(player.getDungTokens() - 100000);
			player.getPackets().sendGameMessage("You bought a off-hand chaotic rapier");
			end();
		    } else {
			end();
			player.getPackets().sendGameMessage("You have not enough inventory space");
		    }
		} else {
		    end();
		    player.getPackets().sendGameMessage("You don't have enough tokens to purchase this");
		}
	    } 
	    else if (componentId == OPTION_4) {
		if (player.getDungTokens() >= 100000) {
		    if (player.getInventory().hasFreeSlots()) {
			player.getInventory().addItem(25993, 1);
			player.setDungTokens(player.getDungTokens() - 100000);
			player.getPackets().sendGameMessage("You bought a off-hand chaotic longsword");
			end();
		    } else {
			end();
			player.getPackets().sendGameMessage("You have not enough inventory space");
		    }
		} else {
		    end();
		    player.getPackets().sendGameMessage("You don't have enough tokens to purchase this");
		}
	    } 
	    else if (componentId == OPTION_5)
	    {
		sendOptionsDialogue("Current Tokens : " + (int) player.getDungTokens(), "Off-hand chaotic crossbow (100k)", "Bone Crusher (34k)", "Herbicide (34k)", 
			"Charming imp (100k)");
		stage = 99;
	    }
	}
	else if (stage == 99)
	{
	    if (componentId == OPTION_2)
	    {
		if (player.getDungTokens() >= 34000) {
		    if (player.getInventory().hasFreeSlots()) {
			player.getInventory().addItem(18337, 1);
			player.setDungTokens(player.getDungTokens() - 34000);
			player.getPackets().sendGameMessage("You bought a bone crusher");
			end();
		    } else {
			end();
			player.getPackets().sendGameMessage("You have not enough inventory space");
		    }
		} else {
		    end();
		    player.getPackets().sendGameMessage("You don't have enough tokens to purchase this");
		}
	    }
	    else if (componentId == OPTION_3)
	    {
		if (player.getDungTokens() >= 34000) {
		    if (player.getInventory().hasFreeSlots()) {
			player.getInventory().addItem(19675, 1);
			player.setDungTokens(player.getDungTokens() - 34000);
			player.getPackets().sendGameMessage("You bought a herbicide");
			end();
		    } else {
			end();
			player.getPackets().sendGameMessage("You have not enough inventory space");
		    }
		} else {
		    end();
		    player.getPackets().sendGameMessage("You don't have enough tokens to purchase this");
		}
	    }
	    else if (componentId == OPTION_1)
	    {
		if (player.getDungTokens() >= 100000) {
		    if (player.getInventory().hasFreeSlots()) {
			player.getInventory().addItem(25995, 1);
			player.setDungTokens(player.getDungTokens() - 100000);
			player.getPackets().sendGameMessage("You bought a off-hand cross bow");
			end();
		    } else {
			end();
			player.getPackets().sendGameMessage("You have not enough inventory space");
		    }
		} else {
		    end();
		    player.getPackets().sendGameMessage("You don't have enough tokens to purchase this");
		}
	    }
	    else if (componentId == OPTION_4)
	    {
		if (player.getDungTokens() >= 100000) {
		    if (player.getInventory().hasFreeSlots()) {
			player.getInventory().addItem(27996, 1);
			player.setDungTokens(player.getDungTokens() - 100000);
			player.getPackets().sendGameMessage("You bought a charming imp");
			end();
		    } else {
			end();
			player.getPackets().sendGameMessage("You have not enough inventory space");
		    }
		} else {
		    end();
		    player.getPackets().sendGameMessage("You don't have enough tokens to purchase this");
		}
	    }
	    
	}

    }

    @Override
    public void finish() {
	// TODO Auto-generated method stub

    }

}
