package com.rs.game.player.dialogues.impl;

import com.rs.cache.loaders.NPCDefinitions;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

public class Nurmof extends Dialogue {

	private int npcId;
	
	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		sendEntityDialogue(SEND_2_TEXT_CHAT,
				new String[] { NPCDefinitions.getNPCDefinitions(npcId).name,
						"Greetings and welcome to my construction shop. Do you want",
						"to buy my premium quality supplies?"}, IS_NPC, npcId, 9827);

	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (stage == -1) {
			stage = 0;
			sendOptionsDialogue(DEFAULT,
					"Farming Supplies",
					"Other Supplies",
					"Construction?");
		}else if (stage == 0) {
			if (componentId == OPTION_1) {
				ShopsHandler.openShop(player, 71);
				close();
			} else if (componentId == OPTION_2) {
				ShopsHandler.openShop(player, 72);
				close();
			} else {
				stage = 1;
				sendEntityDialogue(SEND_1_TEXT_CHAT,
						new String[] { player.getDisplayName(),
								"Construction? What are you talking about?" }, IS_PLAYER,
						player.getIndex(), 9827);
			}
		} else if (stage == 1) {
			stage = -2;
			sendEntityDialogue(SEND_3_TEXT_CHAT,
					new String[] { NPCDefinitions.getNPCDefinitions(npcId).name,
							"You can build your own house you know! All you need to do",
							"is speak the <col=ff0000>Estate Agent</col> over there. He'll sell ye one.",
							""}, IS_NPC, npcId, 9827);
		} else 
			close();

	}

	@Override
	public void finish() {
		// TODO Auto-generated method stub

	}

}
