package com.rs.game.npc.vorago;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.rs.game.Animation;
import com.rs.game.ForceMovement;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class VoragoMisc {

	public class VoragoChallenge extends Dialogue {

		@Override
		public void start() {
			sendNPCDialogue(17161, NORMAL, "Welcome " + player.getDisplayName() + ".");
			stage = 1;
		}

		@Override
		public void run(int interfaceId, int componentId) {
			if (stage == 1) {
				sendOptionsDialogue("Select an option", "What are you?", "Challenge", "I want to join a friend in progress!", "What are you doing here?");
				stage = 2;
			} else if (stage == 2) {
				if (componentId == OPTION_1) {
					sendPlayerDialogue(CONFUSED, "What are you?");
					stage = 3;
				} else if (componentId == OPTION_2) {
					sendPlayerDialogue(MAD, "I challenge you to a battle");
					stage = 4;
				} else if (componentId == OPTION_3) {
					sendPlayerDialogue(MAD, "I want to join a friend in progress!");
					stage = 5;
				} else if (componentId == OPTION_4) {
					sendPlayerDialogue(CONFUSED, "What are you doing here?");
					stage = 70;
				}
			} else if (stage == 4) {
				sendNPCDialogue(17161, NORMAL, "So, do we fight?");
				stage = 60;
			} else if (stage == 5) {
				if (VoragoHandler.getPlayersCount() == 0) {
					sendNPCDialogue(17161, NORMAL, "There is no fight in progress. Would you like to start one?");
					stage = 80;
				} else {
					sendNPCDialogue(17161, CONFUSED, "Very well. The current instance contains " + VoragoHandler.getPlayersCount() + " player(s)." + " It is owned by " + VoragoHandler.CHALLENGER_NAME + ". Would you like to join?");
					stage = 85;
				}
			} else if (stage == 6) {
				end();
				player.getPackets().sendGameMessage("Vorago's power forces you off the edge!");
				player.setNextWorldTile(new WorldTile(3037, 6120, 0));
				WorldTasksManager.schedule(new WorldTask() {
					int count = 0;

					@Override
					public void run() {
						if (count == 1) {
							player.setNextFaceWorldTile(new WorldTile(3037, 6125, 0));
						}
						if (count == 2) {
							player.setNextAnimation(new Animation(20389));
							player.applyHit(new Hit(player, 100, HitLook.REGULAR_DAMAGE));
						}
						if (count == 3) {
							player.setNextAnimation(new Animation(-1));
							player.getControlerManager().startControler("VoragoController");
						}
						if (count == 4) {
							player.setNextAnimation(new Animation(20401));
						}
						count++;
					}
				}, 0, 1);

			} else if (stage == 3) {
				sendNPCDialogue(17161, NORMAL, "I know only that I am of the earth, and the earth and I are one. More than those above see and know. I am here to ensure the continuation of that life.");
				stage = 100;
			} else if (stage == 60) {
				sendOptionsDialogue("Select an option:", "We fight", "Not right now");
				stage = 61;
			} else if (stage == 61) {
				if (componentId == OPTION_1) {
					sendPlayerDialogue(MAD, "We fight!");
					stage = 62;
				} else if (componentId == OPTION_2) {
					sendPlayerDialogue(SCARED, "Not right now");
					stage = 63;
				}
			} else if (stage == 62) {
				sendNPCDialogue(17161, NORMAL, "Very well...");
				stage = 99;
			} else if (stage == 63) {
				sendNPCDialogue(17161, NORMAL, "A wise decision, " + player.getDisplayName() + ".");
				stage = 100;
			} else if (stage == 70) {
				sendNPCDialogue(17161, NORMAL, "I am waiting.");
				stage = 71;
			} else if (stage == 71) {
				sendPlayerDialogue(WORRIED, "Waiting for what?");
				stage = 72;
			} else if (stage == 72) {
				sendNPCDialogue(17161, NORMAL, "Those worthy of facing me in battle.");
				stage = 73;
			} else if (stage == 73) {
				sendPlayerDialogue(NORMAL, "Worthy of facing you?");
				stage = 74;
			} else if (stage == 74) {
				sendNPCDialogue(17161, NORMAL, "Yes. I must do battle with the strongest ones of this world, to defend against what is to come.");
				stage = 75;
			} else if (stage == 75) {
				sendPlayerDialogue(NORMAL, "Who are the unworthy, then?");
				stage = 76;
			} else if (stage == 76) {
				if (player.ragokc > 0) {
					sendNPCDialogue(17161, NORMAL, "You have defeated me in the past. Consider yourself worthy.");
				} else {
					sendNPCDialogue(17161, NORMAL, "To prepare for what is to come, I must fight at the peak of my strength. " + "Those who cannot stand before my power are not worthy. " + "To fight me would be a waste of their lives and of time.");
				}
				stage = 1;
			} else if (stage == 80) {
				sendOptionsDialogue("Select an option:", "Yes", "No");
				stage = 81;
			} else if (stage == 81) {
				if (componentId == OPTION_1) {
					sendPlayerDialogue(MAD, "Yes");
					stage = 4;
				} else if (componentId == OPTION_2) {
					sendPlayerDialogue(SCARED, "Not right now");
					stage = 100;
				}
			} else if (stage == 85) {
				sendOptionsDialogue("Select an option:", "Yes", "No");
				stage = 86;
			} else if (stage == 86) {
				if (componentId == OPTION_1) {
					sendPlayerDialogue(MAD, "Yes");
					stage = 6;
				} else if (componentId == OPTION_2) {
					sendPlayerDialogue(SCARED, "Not right now");
					stage = 100;
				}
			} else if (stage == 99) {
				if (VoragoHandler.getPlayersCount() == 0) {// TODO do this better
					VoragoHandler.CHALLENGER_NAME = player.getDisplayName();
					end();
					final List<Player> players = Collections.synchronizedList(new ArrayList<Player>());
					for (Player p : World.getPlayers()) {
						if (p.getX() >= 3029 && p.getX() <= 3055 && p.getY() >= 6117 && p.getY() <= 6136) {
							players.add(p);
							if (p != player) {
								p.getTemporaryAttributtes().put("accRagoChall", false);
								p.getDialogueManager().execute(new VoragoAccChallenge(), true);
							} else {
								p.getTemporaryAttributtes().put("accRagoChall", true);
							}
						}
					}
					if (players.size() > 1) {
						WorldTasksManager.schedule(new WorldTask() {
							int count = 0;

							@Override
							public void run() {
								for (Player p : players) {
									if (p.getTemporaryAttributtes().get("accRagoChall") != null && ((boolean) p.getTemporaryAttributtes().get("accRagoChall") == true)) {
										if (count == 0) {
											p.setNextFaceWorldTile(new WorldTile(3040, 6131, 0));
										}
										if (count == 1) {
											p.setNextAnimation(new Animation(10070));
											p.applyHit(new Hit(p, (50000 / players.size()), HitLook.REGULAR_DAMAGE));
											WorldTile toTile = p.transform(0, -8, 0);
											p.setNextForceMovement(new ForceMovement(new WorldTile(p), 1, toTile, 2, ForceMovement.SOUTH));
										}
										if (count == 3) {
											p.setNextAnimation(new Animation(-1));
										}
									}
								}
								count++;
							}

						}, 6, 1);
						WorldTasksManager.schedule(new WorldTask() {

							@Override
							public void run() {
								for (Player p : players) {
									if (p.getTemporaryAttributtes().get("accRagoChall") != null && ((boolean) p.getTemporaryAttributtes().get("accRagoChall") == true)) {
										p.getControlerManager().startControler("VoragoController");
									}
								}
								VoragoHandler.beginFight();
							}

						}, 11);
					}
				} else {
					sendNPCDialogue(17161, NORMAL, "Sorry there is already a fight in progress.");
				}

			} else {
				end();
			}
		}

		@Override
		public void finish() {
			// TODO Auto-generated method stub

		}

	}

	public class VoragoAccChallenge extends Dialogue {

		@Override
		public void start() {
			sendNPCDialogue(17161, NORMAL, VoragoHandler.CHALLENGER_NAME + " has challenged me, do you wish to join them?");
		}

		@Override
		public void run(int interfaceId, int componentId) {
			switch (stage) {
			case -1:
				stage = 0;
				sendOptionsDialogue("Do you accept the challenge?", "Yes", "No");
				break;
			case 0:
				if (componentId == OPTION_1) {
					player.getTemporaryAttributtes().put("accRagoChall", true);
					end();
				} else if (componentId == OPTION_2) {
					player.getTemporaryAttributtes().put("accRagoChall", false);
					end();
				}
				break;
			default:
				end();
				break;
			}

		}

		@Override
		public void finish() {

		}
	}

}
