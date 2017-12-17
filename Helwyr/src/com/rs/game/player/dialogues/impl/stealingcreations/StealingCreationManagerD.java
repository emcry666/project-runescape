package com.rs.game.player.dialogues.impl.stealingcreations;

import com.rs.game.npc.NPC;
import com.rs.game.player.content.stealingcreations.StealingCreationController;
import com.rs.game.player.dialogues.Dialogue;

public class StealingCreationManagerD extends Dialogue {

	@Override
	public void start() {
		sendNPCDialogue(getNPC().getId(), 9835, "Hello, what do you need help with?");
		stage = -1;
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (stage == -1) {
			sendOptionsDialogue("Select a Option", "Can you heal me?", "I want to leave.", "I don't need help.");
			stage = 0;
			return;
		}
		player.getInterfaceManager().closeChatBoxInterface();
		if (componentId == OPTION_1) {
			player.heal(990);
			player.sm("The mystic uses his magical powers to heal you.");
		} else if (componentId == OPTION_2) {
			if (player.getControlerManager().getControler() != null &&
					player.getControlerManager().getControler() instanceof StealingCreationController) {
				((StealingCreationController)player.getControlerManager().getControler()).getGame().remove(player);
			}
		}
		close();
	}

	@Override
	public void finish() {

	}

	public NPC getNPC() {
		return (NPC) parameters[0];
	}
}
