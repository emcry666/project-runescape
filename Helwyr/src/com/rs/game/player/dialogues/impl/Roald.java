package com.rs.game.player.dialogues.impl;

import com.rs.cache.loaders.NPCDefinitions;
import com.rs.game.WorldTile;
import com.rs.game.player.dialogues.Dialogue;

public final class Roald extends Dialogue {

	private int npcId;
	
	@Override
	public void start() {
		
		npcId = (Integer) parameters[0];
		sendEntityDialogue(SEND_2_TEXT_CHAT,
				new String[] { NPCDefinitions.getNPCDefinitions(npcId).name,
						"Hello, I'm here for staff members only!",
						"Where do you want to go?" }, IS_NPC, npcId, 9827);
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (stage == -1) {
			sendEntityDialogue(SEND_1_TEXT_CHAT,
					new String[] { player.getDisplayName(), "I'd like to go to..." },
					IS_PLAYER, player.getIndex(), 9827);
			stage = 1;
		} else if (stage == 1) {
			sendOptionsDialogue("Where would you like to go?", "<col=FFFF00><img=1> Admin Zone</col>",
					"<col=CCCCCC><img=0> Mod Zone</col>", "<col=00EE33><img=10> Forum Mod Zone</col>", "<col=FF0000><img=11> Donator Zone</col>", "Nevermind.");
			stage = 2;
		} else if (stage == 2) {
			if (componentId == OPTION_1)
				teleportPlayer(2603, 3360, 0);
			else if (componentId == OPTION_2)
				teleportPlayer(2834, 3435, 0);
			else if (componentId == OPTION_3)
				teleportPlayer(2570, 2916, 0);
			else if (componentId == OPTION_4)
				teleportPlayer(2603, 3360, 0);
			}
		}
		private void teleportPlayer(int x, int y, int z) {
			player.setNextWorldTile(new WorldTile(x, y, z));
			player.stopAll();
			//player.getControlerManager().startControler("GodWars");
		}
		
		@Override
		public void finish() {

		}
	}