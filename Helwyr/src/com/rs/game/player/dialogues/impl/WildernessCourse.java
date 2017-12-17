package com.rs.game.player.dialogues.impl;

import com.rs.game.WorldTile;
import com.rs.game.player.content.Magic;
import com.rs.game.player.dialogues.Dialogue;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public class WildernessCourse extends Dialogue {

	@Override
	public void start() {
		sendOptionsDialogue("Teleport to wildeness course?", "Yes, teleport me", "No, I wish to stay");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if(stage == -1) {
			if(componentId == OPTION_1) {
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2998, 3932));
				player.getControlerManager().startControler("Wilderness");
			} else {
				close();
			}
			close();
		}
	}

	@Override
	public void finish() {
		
	}

}
