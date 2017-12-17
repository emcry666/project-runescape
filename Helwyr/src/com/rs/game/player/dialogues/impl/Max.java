package com.rs.game.player.dialogues.impl;

import com.rs.cache.loaders.NPCDefinitions;
import com.rs.game.WorldTile;
import com.rs.game.player.Skills;
import com.rs.game.player.content.Magic;
import com.rs.game.player.dialogues.Dialogue;

public final class Max extends Dialogue {

	private int npcId;
	
	@Override
	public void start() {
		
		npcId = (Integer) parameters[0];
		sendEntityDialogue(SEND_2_TEXT_CHAT,
				new String[] { NPCDefinitions.getNPCDefinitions(npcId).name,
						"Hello, I provide skilling teleports!",
						" Where do you want to go?" }, IS_NPC, npcId, 9827);
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (stage == -1) {
			sendEntityDialogue(SEND_1_TEXT_CHAT,
					new String[] { player.getDisplayName(), "I'd like to go to..." },
					IS_PLAYER, player.getIndex(), 9827);
			stage = 1;
		} else if (stage == 1) {
			sendOptionsDialogue("Where would you like to go?", "<col=00CC00>Woodcutting</col>",
					"<col=00FFFF>Fishing</col>", "<col=ff0000>Hunter</col>", "<col=FFFF00>Mining</col>", "More Options");
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
			else if (componentId == OPTION_5) {
				stage = 3;
				sendOptionsDialogue("Where would you like to go?",
						"<col=00FF00>Construction", "<col=0000FF>Agility", "<col=FFFF00>Runecrafting",
						"<col=00FFFF>Summoning", "<col=CC3300><img=1> Challenge Max");
			}
		} else if (stage == 3) {
			if (componentId == OPTION_1) {
				teleportPlayer(3305, 3502, 0);
			} else if (componentId == OPTION_2)
				teleportPlayer(2470, 3436, 0);
			else if (componentId == OPTION_3)
				sendDialogue("You can runecraft by using the teleports ::air ::fire ::chaos ::nature ::death and ::blood");
			else if (componentId == OPTION_4)
				teleportPlayer(3179, 5707, 0);
			else if (componentId == OPTION_5) {
				stage = 4;
				sendOptionsDialogue("Would you like to challenge Max to battle? (This is not instanced)",
						"<col=00FF00>Yes.", "<col=0000FF>No.");
			}
			}	 else if (stage == 4) {
						if (componentId == OPTION_1) {
							player.getSkills();
							if (Skills.getTotalLevel(player) >= 2475) {
								teleportPlayer(3824, 4760, 0);
							} else
							player.sm("You need to have a total level of at least 2475 to challenge Max to a battle.");
							close();
						} else if (componentId == OPTION_2)
							close();
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