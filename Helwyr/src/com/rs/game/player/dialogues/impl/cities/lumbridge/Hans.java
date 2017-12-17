package com.rs.game.player.dialogues.impl.cities.lumbridge;

import com.rs.game.ForceTalk;
import com.rs.game.World;
import com.rs.game.item.Item;
import com.rs.game.npc.NPC;
import com.rs.game.player.dialogues.Dialogue;

public class Hans extends Dialogue {

	private NPC npc = World.getNPC(0);
	private int npcId;

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		sendNPCDialogue(npcId, PLAIN_TALKING, "Hello. What are you doing here?");
		stage = -1;
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch (stage) {
		case -1:
			sendOptionsDialogue(DEFAULT_OPTIONS_TITLE,
					"I'm looking for whoever is in charge of this place.",
					"I have come to kill everyone in this castle!",
					"I don't know. I'm lost. Where am I?",
					"Can you tell me how long I've been here?", "Nothing.");
			stage = 1;
			break;

		case 1:
			switch (componentId) {
			case OPTION_1:
				sendNPCDialogue(npcId, PLAIN_TALKING,
						"Who, the Duke? He's in his study, on the first floor.");
				stage = -2;
				break;
			case OPTION_2:
				if (npc.getId() == 0) {
					npc.setNextForceTalk(new ForceTalk("Help! Help!"));
					end();
				}
				break;
			case OPTION_3:
				sendNPCDialogue(npcId, PLAIN_TALKING,
						"You are in Lumbridge Castle.");
				stage = -2;
				break;
			case OPTION_4:
				sendNPCDialogue(
						npcId,
						NORMAL,
						"Ahh, I see all the newcomers arriving in Lumbridge, fresh-faced and eager for adventure. I remember you...");
				stage = 2;
				break;
			case OPTION_5:
				sendPlayerDialogue(NORMAL, "Nothing.");
				stage = -2;
				break;
			}
			break;
		case 2:
			sendNPCDialogue(npcId, PLAIN_TALKING,
					"You've created your account on x.");
			stage = 3;
			break;
		case 3:
				sendNPCDialogue(npcId, PLAIN_TALKING, "I'm sorry but you are not eligable to claim any rewards at this time.");
				stage = -2;
			break;
		case 4:
			if (player.hasItem(23048) || player.hasItem(22958)) {
				sendNPCDialogue(npcId, PLAIN_TALKING, "Here you go!");
				player.getInventory().addItem(new Item(23048));
				
				player.getInventory().addItem(new Item(22958));

				player.getInventory().addItem(new Item(22959));

				player.getInventory().addItem(new Item(22960));

				player.getInventory().addItem(new Item(22961));

				player.getInventory().addItem(new Item(22962));
				stage = -2;
			}
			break;
		case -2:
			end();
			break;
		}
	}

	@Override
	public void finish() {
		// TODO Auto-generated method stub

	}
}
