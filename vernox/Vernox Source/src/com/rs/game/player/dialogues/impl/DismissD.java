package com.rs.game.player.dialogues.impl;

import com.rs.game.npc.familiar.Familiar;
import com.rs.game.npc.familiar.impl.BeastOfBurden;
import com.rs.game.player.Player;
import com.rs.game.player.dialogues.Dialogue;

public class DismissD extends Dialogue {

	@Override
	public void start() {
		sendOptionsDialogue(player.getPet() != null ? "Pickup Pet?" : "Dismiss Familiar?", "Yes.", "No.");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (stage == -1 && componentId == OPTION_1) {
			if (player.getFamiliar() != null) {
				player.getFamiliar().sendDeath(player);
			} else if (player.getPet() != null) {
				stage = 0;
				sendPlayerDialogue(9827, "Come here! I'm picking you up");
				return;
			}
		} else if (stage == 0 && player.getPet() != null) {
		    if (player.getInventory().hasFreeSlots())
		    {
		    player.getPet().pickup();
		    } else {
			player.sendMessage("You don't have enough inventory space.");
		    }
		}
		end();
	}
	

	private transient Player owner;


	@Override
	public void finish() {
	    // TODO Auto-generated method stub
	    
	}
}
