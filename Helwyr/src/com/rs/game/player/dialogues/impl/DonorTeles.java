package com.rs.game.player.dialogues.impl;

import com.rs.Settings;
import com.rs.cache.loaders.Configs;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.game.WorldTile;
import com.rs.game.player.Skills;
import com.rs.game.player.content.Magic;
import com.rs.game.player.controlers.FightCaves;
import com.rs.game.player.controlers.FightKiln;
import com.rs.game.player.dialogues.Dialogue;

public class DonorTeles extends Dialogue {

	private int npcId;

	@Override
	public void start() {
		if (Settings.ECONOMY) {
			player.getPackets().sendGameMessage("Mr.Ex is in no mood to talk to you.");
			close();
			return;
		}
		npcId = (Integer) parameters[0];
		sendEntityDialogue(SEND_2_TEXT_CHAT,
				new String[] { NPCDefinitions.getNPCDefinitions(npcId).name,
						"Hello, I can teleport you all around " + Configs.SERVER_NAME + ",",
						" would you like to?" }, IS_NPC, npcId, 9827);
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (stage == -1) {
			sendEntityDialogue(SEND_1_TEXT_CHAT,
					new String[] { player.getDisplayName(), "Sure, why not." },
					IS_PLAYER, player.getIndex(), 9827);
			stage = 1;
		} else if (stage == 1) {
			sendOptionsDialogue("Where would you like to go?", "<img=9><col=ff0000> Bandos",
					"<img=9><col=FF0000> Zamorak", "<img=9><col=FF0000> Saradomin", "<img=9><col=FF0000> Armadyl", "More Options");
			stage = 2;
		} else if (stage == 2) {
			if (componentId == OPTION_1) //nex
				teleportPlayer(2863, 5354, 2);
		    else if (componentId == OPTION_2) //thun
		    	Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2925, 5334, 2));
			else if (componentId == OPTION_3) //dks
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2910, 5263, 0));
			else if (componentId == OPTION_4) //aod
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2839, 5293, 2));
			else if (componentId == OPTION_5) {
				stage = 3;
				sendOptionsDialogue("Where would you like to go?",
						"<col=66FFFF><img=1> Blink", "<col=66FFFF><img=1> Glacors", "<img=1><col=FF0000> Nex",
						"<col=66FFFF><img=1> Sunfreet", "More Options");
			}
		} else if (stage == 3) {
			if (componentId == OPTION_1) {
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(4681,
						5145, 0));
			} else if (componentId == OPTION_2)
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(4183,
						5726, 0));
			else if (componentId == OPTION_3)
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2905,
						5203, 0));
			else if (componentId == OPTION_4)
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3195,
						4569, 0));
			else if (componentId == OPTION_5) {
				stage = 4;
				sendOptionsDialogue("Where would you like to go?",
						"Mage Bank", "Bork", "Skeleton Monkeys",
						"Wests (PvP)", "More Options");
			}
		} else if (stage == 4) {
			if (componentId == OPTION_1) {
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2538,
						4715, 0));
			} else if (componentId == OPTION_2) {
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(1807, 3217, 0));
				//player.getControlerManager().startControler("Wilderness");
			} else if (componentId == OPTION_3)
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2768,
						9102, 0));
			else if (componentId == OPTION_4) {
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2984,
						3596, 0));
				player.getControlerManager().startControler("Wilderness");
			} else if (componentId == OPTION_5) {
				stage = 5;
				sendOptionsDialogue("Where would you like to go?",
						"<img=4>Taverly Dungeon", "Tormented Demons", "Corp Beast", "<img=1><col=00ffff> Frost Dragons",
						"More Options");
			}
		} else if (stage == 5) {
			if (componentId == OPTION_1) {
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2885,
						9796, 0));
				player.getControlerManager().startControler("Wilderness");
			} else if (componentId == OPTION_2)
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2570,
						5736, 0));
			else if (componentId == OPTION_3)
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2966,
						4383, 2));
			else if (componentId == OPTION_4) {
				close();
				if (player.getSkills().getLevelForXp(Skills.DUNGEONEERING) < 85) {
					player.getPackets().sendGameMessage("You need a Dungeoneering level of at least 85 to go through this portal.");
					return;
				}
				player.getPackets().sendGameMessage("Don't forget your anti-fire!");
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(1297,
						4510, 0));
			} else if (componentId == OPTION_5) {
				stage = 6;
				sendOptionsDialogue("Where would you like to go?",
						"<img=4>Slayer Tower", "<img=4>Kuradals Dungeon", "Barrows", "Avatar of Destruction",
						"More Options");
			}
		} else if (stage == 6) {
			if (componentId == OPTION_1)
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3429, 3525, 0));
			else if (componentId == OPTION_2)
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(1741, 5312, 1));
			else if (componentId == OPTION_3)
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3565, 3311, 0));
			else if (componentId == OPTION_4)
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(1959, 3239, 0));
			else if (componentId == OPTION_5) {
				sendOptionsDialogue("Where would you like to go?",
						"Kalphite Queen", "Fight Caves", "Fight Kiln", "Queen Black Dragon",
						"More Options");
				stage = 7;
			}
		} else if (stage == 7) {
			if (componentId == OPTION_1) 
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3226, 3108, 0));
			else if (componentId == OPTION_2)
				Magic.sendNormalTeleportSpell(player, 0, 0, FightCaves.OUTSIDE);
			else if (componentId == OPTION_3)
				Magic.sendNormalTeleportSpell(player, 0, 0, FightKiln.OUTSIDE);
			else if (componentId == OPTION_4) {
				close();
				if (player.getSkills().getLevelForXp(Skills.SUMMONING) < 60) {
					player.getPackets().sendGameMessage("You need a summoning level of 60 to go through this portal.");
					return;
				}
				player.getControlerManager().startControler("QueenBlackDragonControler");
			}
			/*else if (componentId == 2)
				teleportPlayer(2838, 5297, 2);
			else if (componentId == 3)
				Magic.sendNormalTeleportSpell(player, 0, 0, CastleWars.LOBBY);
			else if (componentId == 4)
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2647, 9378, 0));*/
			else if (componentId == OPTION_5) {
				sendOptionsDialogue("Where would you like to go?",
						" ", " ", " ", " ", 
						"More Options");
				stage = 2;
			}
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
