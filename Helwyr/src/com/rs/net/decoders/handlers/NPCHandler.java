package com.rs.net.decoders.handlers;

import com.rs.Settings;
import com.rs.game.Animation;
import com.rs.game.ForceTalk;
import com.rs.game.Graphics;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.area.dungeonhandler.DungeonEventHandler;
import com.rs.game.cityhandler.CityEventHandler;
import com.rs.game.npc.NPC;
import com.rs.game.npc.familiar.Familiar;
import com.rs.game.npc.others.FireSpirit;
import com.rs.game.npc.others.LivingRock;
import com.rs.game.npc.pet.Pet;
import com.rs.game.npc.slayer.Strykewyrm;
import com.rs.game.player.Player;
import com.rs.game.player.actions.Fishing;
import com.rs.game.player.actions.Fishing.FishingSpots;
import com.rs.game.player.actions.divination.Wisp;
import com.rs.game.player.actions.hunter.Implings;
import com.rs.game.player.actions.mining.LivingMineralMining;
import com.rs.game.player.actions.mining.MiningBase;
import com.rs.game.player.actions.runecrafting.SiphonActionCreatures;
import com.rs.game.player.actions.slayer.Slayer.SlayerMaster;
import com.rs.game.player.actions.slayer.SlayerTask;
import com.rs.game.player.actions.thieving.PickPocketAction;
import com.rs.game.player.actions.thieving.PickPocketableNPC;
import com.rs.game.player.content.Drinkables;
import com.rs.game.player.content.Hunter;
import com.rs.game.player.content.ItemSets;
import com.rs.game.player.content.LividFarm;
import com.rs.game.player.content.PenguinEvent;
import com.rs.game.player.content.dungeoneering.DungeonRewardShop;
import com.rs.game.player.content.sawmill.Sawmill;
import com.rs.game.player.content.stealingcreations.StealingCreationShop;
import com.rs.game.player.dialogues.impl.BoatingDialouge;
import com.rs.game.player.dialogues.impl.FrostbiteAchievements;
import com.rs.game.player.pathing.RouteEvent;
import com.rs.io.InputStream;
import com.rs.utils.Logger;
import com.rs.utils.ShopsHandler;
import com.rs.utils.Utils;

public class NPCHandler {

	public static void handleExamine(final Player player, InputStream stream) {
		int npcIndex = stream.readUnsignedShort128();
		boolean forceRun = stream.read128Byte() == 1;
		if(forceRun)
			player.setRun(forceRun);
		final NPC npc = World.getNPCs().get(npcIndex);
		if (npc == null || npc.hasFinished()
				|| !player.getMapRegionsIds().contains(npc.getRegionId()))
			return;
		if (player.getRights() > 1) {
			player.getPackets().sendGameMessage(
					"NPC - [id=" + npc.getId() + ", loc=[" + npc.getX() + ", " + npc.getY() + ", " + npc.getPlane() + "]].");
		}
		if (npc.getId() == 733) {
			if (player.getTreasureTrailsManager().useNPC(npc))
				return;
		}
		if(npc instanceof Pet) {
			Pet pet = (Pet) npc;
			player.getPackets().sendNPCMessage(0, npc, "<col=E86100>It's a level " + pet.getDetails().getLevel() + " " + npc.getDefinitions().getName() + ".");
		} else 
			player.getPackets().sendNPCMessage(0, npc, "It's a " + npc.getDefinitions().name + ".");
		
		if (Settings.DEBUG)
			Logger.log("NPCHandler", "Examined npc: " + npcIndex + ", " + npc.getId() + " Health:" + npc.getHitpoints());
	}

	public static void handleOption1(final Player player, InputStream stream) {
		int npcIndex = stream.readUnsignedShort128();
		boolean forceRun = stream.read128Byte() == 1;
		final NPC npc = World.getNPCs().get(npcIndex);
		if (npc == null || npc.isCantInteract() || npc.isDead()
				|| npc.hasFinished()
				|| !player.getMapRegionsIds().contains(npc.getRegionId()))
			return;
		player.stopAll(false);
		if(forceRun)
			player.setRun(forceRun);
		if(SlayerMaster.startInteractionForId(player, npc.getId(), 1))
			return;
		/**
		 * Bankers
		 */
		if (npc.getDefinitions().name.contains("Banker")
				|| npc.getDefinitions().name.contains("banker")) {
			player.faceEntity(npc);
			if (!player.withinDistance(npc, 2)) {
				player.setRouteEvent(new RouteEvent(npc, new Runnable() {
					@Override
					public void run() {
						npc.faceEntity(player);
						player.getBank().openBank();
					}
				}));
			} else {
				npc.faceEntity(player);
				player.getBank().openBank();
			}
			return;
		}
		/**
		 * Grand Exchagne Clerks
		 */
		if (npc.getDefinitions().name.toLowerCase().equals(
				"grand exchange clerk")) {
			player.faceEntity(npc);
			if (!player.withinDistance(npc, 3))
				return;
			npc.faceEntity(player);
			player.getGeManager().openGrandExchange();
			player.resetWalkSteps();
			return;
		}
		/**
		 * Musicians
		 */
		if(npc.getDefinitions().name.contains("Musician")) {
			player.faceEntity(npc);
			if(!player.withinDistance(npc, 1))
				return;
			player.getDialogueManager().startDialogue("Musician", npc.getId());
			return;
		}
		/**
		 * Estate Agent
		 */
		if (npc.getDefinitions().name.toLowerCase().equals("estate agent")) {
			player.getDialogueManager().startDialogue("EstateAgent",
					npc.getId());
			;
			return;
		}
		if(SiphonActionCreatures.siphon(player, npc)) 
			return;
		player.setRouteEvent(new RouteEvent(npc, new Runnable() {
			@Override
			public void run() {
				if (npc instanceof Wisp) {
					Wisp wisp = (Wisp) npc;
					wisp.harvest(player);
				}
				npc.resetWalkSteps();
				player.faceEntity(npc);
				if(npc.getId() != 1395 || npc.getName().toLowerCase().contains("musician"))
					npc.faceEntity(player);
				if (!player.getControlerManager().processNPCClick1(npc))
					return;
				if (player.getTreasureTrailsManager().useNPC(npc))
					return;
				if(CityEventHandler.handleNPCClick(player, npc, npc.getId()))
					return;
				if(DungeonEventHandler.handleNPCClick(player, npc, npc.getId()))
					return;
				Strykewyrm.handleStomping(player, npc);
				Object[] shipAttributes = BoatingDialouge.getBoatForShip(npc
						.getId());
				if (shipAttributes != null) {
					player.getDialogueManager().startDialogue(
							"BoatingDialouge", npc.getId());
				}
				PickPocketableNPC pocket = PickPocketableNPC.get(npc.getId());
				if (pocket != null) {
					player.getActionManager().setAction(
							new PickPocketAction(npc, pocket));
					return;
				}
				if (npc.getId() == 17161) {
					player.getDialogueManager().startDialogue("VoragoChallenge");
					return;
				}
				/**
				 * Fishing
				 */
				FishingSpots spot = FishingSpots.forId(npc.getId() | 1 << 24);
				if (spot != null) {
					player.getActionManager().setAction(new Fishing(spot, npc));
					return; // its a spot, they wont face us
				} else if (npc.getId() >= 8837 && npc.getId() <= 8839) {
					player.getActionManager().setAction(
							new LivingMineralMining((LivingRock) npc));
					return;
				}
				if(npc.getId() == 19727) 
					player.getDialogueManager().startDialogue("ReputeMaster", npc.getId());
				if(npc.getId() == 15425)
					player.getDialogueManager().startDialogue("FrostbiteTeleports", 15425);
				if(npc.getId() == 19669)
					player.getDialogueManager().startDialogue("ReaperAssignments");
				if(npc.getId() == 9711)
					DungeonRewardShop.openRewardsShop(player);
				if (npc.getId() == 8228)
					StealingCreationShop.openInterface(player);
				if(npc.getId() == 1039) 
					player.getDialogueManager().startDialogue("TriviaRewards", npc.getId());
				if(npc.getId() == 8668) 
					player.getDialogueManager().startDialogue("PenguinRewards", npc.getId());
				if(npc.getId() == 6138)
					player.getDialogueManager().startDialogue("PurchaseLand", npc.getId());
				if(npc.getId() == 8035)
					player.getDialogueManager().startDialogue("FrostbiteTeleports", npc.getId());
				if (npc.getId() == 1920)
					player.getDialogueManager().startDialogue("FrostbiteAchievements",npc.getId());
				if(npc.getId() == 594)
					player.getDialogueManager().startDialogue("FarmingShop", npc.getId());
				if (npc.getId() == 8091)
					player.getDialogueManager().startDialogue("StarSpriteD");
				if (npc.getId() == 7531)
					player.getDialogueManager().startDialogue("Niles", npc.getId());
				if (npc.getId() == 1040)
					ShopsHandler.openShop(player, 1);
				if (npc.getId() == 7530)
					LividFarm.CheckforLogs(player);
				if(npc.getId() == 6524 || npc.getId() == 19919) 
					player.getDialogueManager().startDialogue("BobBarterD", npc.getId());
				if (npc.getDefinitions().name.contains("impling") && !player.isLocked())
					Implings.captureFlyingEntity(player, npc);
				if( npc.getId() == 1038)
					ShopsHandler.openShop(player, 181);
				if (npc.getId() == 13197)
					ShopsHandler.openShop(player, 180);
				if (npc.getId() == 9085)
					player.getDialogueManager().startDialogue("Kuradal");
				if (npc.getId() == 7530)
					LividFarm.CheckforLogs(player);
				if (PenguinEvent.isPenguin(npc.getId()))
					PenguinEvent.spotPenguin(player, npc);
				if (npc.getId() == 5141)
					player.getDialogueManager().startDialogue("UgiDialouge", npc);
				if (npc.getId() == 15451 && npc instanceof FireSpirit) {
					FireSpirit spirit = (FireSpirit) npc;
					spirit.giveReward(player);
				}
				if (npc.getId() == 4250) {
					player.faceEntity(npc);
					npc.faceEntity(player);
					Sawmill.openPlanksConverter(player);
					return;
				}
				 if (npc.getName().toLowerCase().contains("impling")) {
					    Hunter.captureFlyingEntity(player, npc);
					    return;	
				 }
				if (npc instanceof Pet) {
					Pet pet = (Pet) npc;
					if (pet != player.getPet()) {
						player.getPackets().sendGameMessage("This isn't your pet.");
						return;
					}
					if (player.getInventory().hasFreeSlots()) {
						player.setNextAnimation(new Animation(827));
						pet.pickup();
					}
				}
			}
		}));
	}

	public static void handleOption2(final Player player, InputStream stream) {
		int npcIndex = stream.readUnsignedShort128();
		boolean forceRun = stream.read128Byte() == 1;
		final NPC npc = World.getNPCs().get(npcIndex);
		if (npc == null || npc.isCantInteract() || npc.isDead()
				|| npc.hasFinished()
				|| !player.getMapRegionsIds().contains(npc.getRegionId()))
			return;
		player.stopAll(false);
		if(forceRun)
			player.setRun(forceRun);
		if (player.getTreasureTrailsManager().useNPC(npc))
			return;
		/**
		 * bankers
		 */
		if (npc.getDefinitions().name.contains("Banker")
				|| npc.getDefinitions().name.contains("banker")
				|| npc.getDefinitions().name.contains("odovacar")) {
			player.faceEntity(npc);
			if (!player.withinDistance(npc, 2))
				return;
			npc.faceEntity(player);
			player.getDialogueManager().startDialogue("Banker", npc.getId());
			return;
		}
		/**
		 * Grand Exchagne Clerks
		 */
		if (npc.getDefinitions().name.toLowerCase().equals(
				"grand exchange clerk")) {
			player.faceEntity(npc);
			if (!player.withinDistance(npc, 3))
				return;
			npc.faceEntity(player);
			player.getGeManager().openGrandExchange();
			player.resetWalkSteps();
			return;
		}


		player.setRouteEvent(new RouteEvent(npc, new Runnable() {
			@Override
			public void run() {
				npc.resetWalkSteps();
				player.faceEntity(npc);
				if(SlayerMaster.startInteractionForId(player, npc.getId(), 2))
					return;
				PickPocketableNPC pocket = PickPocketableNPC.get(npc.getId());
				if (pocket != null) {
					player.getActionManager().setAction(
							new PickPocketAction(npc, pocket));
					return;
				}
				/**
				 * Fishing
				 */
				FishingSpots spot = FishingSpots.forId(npc.getId() | (2 << 24));
				if (spot != null) {
					player.getActionManager().setAction(new Fishing(spot, npc));
					return;
				}

				if (npc.getId() == 4250) {
					player.faceEntity(npc);
					npc.faceEntity(player);
					Sawmill.openPlanksConverter(player);
					return;
				}
				if(npc.getId() == 1911) {
					if(!player.getInventory().hasFreeSlots())
						return;
					int poisonChance = Utils.random(4);
					if(poisonChance == 0)
						player.getPoison().makePoisoned(30);
					player.getInventory().addItem(4621, 1);
					player.setNextAnimation(new Animation(881));
					player.lock(3);
				}
				if (npc instanceof Familiar) {
					if (npc.getDefinitions().hasOption("store")) {
						if (player.getFamiliar() != npc) {
							player.getPackets().sendGameMessage(
									"That isn't your familiar.");
							return;
						}
						player.getFamiliar().store();
					} else if (npc.getDefinitions().hasOption("cure")) {
						if (player.getFamiliar() != npc) {
							player.getPackets().sendGameMessage(
									"That isn't your familiar.");
							return;
						}
						if (!player.getPoison().isPoisoned()) {
							player.getPackets().sendGameMessage(
									"Your arent poisoned or diseased.");
							return;
						} else {
							player.getFamiliar().drainSpecial(2);
							player.addPoisonImmune(120);
						}
					}
					return;
				}
				npc.faceEntity(player);
				if (!player.getControlerManager().processNPCClick2(npc))
					return;
				if(CityEventHandler.handleNPCClick2(player, npc, npc.getId()))
					return;
				if(DungeonEventHandler.handleNPCClick2(player, npc, npc.getId()))
					return;
				if(npc.getId() == 1038)
					ShopsHandler.openShop(player, 181);
				else if (npc.getId() == 1040)
					ShopsHandler.openShop(player, 1);
				else if(npc.getId() == 3705) 
					player.getDialogueManager().startDialogue("SkillcapeShop", npc.getId());
				else if(npc.getId() == 19726)
					FrostbiteAchievements.checkPlayer(player);
				else if(npc.getId() == 9711)
					DungeonRewardShop.openRewardsShop(player);
				else if(npc.getId() == 594)
					player.getDialogueManager().startDialogue("FarmingShop", npc.getId());
				if (npc instanceof Pet) {
					if (npc != player.getPet()) {
						player.getPackets().sendGameMessage("This isn't your pet!");
						return;
					}
					Pet pet = player.getPet();
					player.getPackets().sendMessage(99, "Pet [id=" + pet.getId() 
					+ ", hunger=" + pet.getDetails().getHunger()
					+ ", growth=" + pet.getDetails().getGrowth()
					+ ", stage=" + pet.getDetails().getStage() + "].", player);
				}
			}
		}));
	}

	public static void handleOption3(final Player player, InputStream stream) {
		int npcIndex = stream.readUnsignedShort128();
		boolean forceRun = stream.read128Byte() == 1;
		final NPC npc = World.getNPCs().get(npcIndex);
		if (npc == null || npc.isCantInteract() || npc.isDead()
				|| npc.hasFinished()
				|| !player.getMapRegionsIds().contains(npc.getRegionId()))
			return;
		player.stopAll(false);
		if(forceRun)
			player.setRun(forceRun);
		if(SlayerMaster.startInteractionForId(player, npc.getId(), 3))
			return;
		player.setRouteEvent(new RouteEvent(npc, new Runnable() {
			@Override
			public void run() {
				npc.resetWalkSteps();
				if (!player.getControlerManager().processNPCClick3(npc))
					return;
				if(CityEventHandler.handleNPCClick3(player, npc, npc.getId()))
					return;
				if(DungeonEventHandler.handleNPCClick3(player, npc, npc.getId()))
					return;
				player.faceEntity(npc);
				/**
				 * Grand Exchagne Clerks
				 */
				if (npc.getDefinitions().name.toLowerCase().equals(
						"grand exchange clerk")) {
					player.faceEntity(npc);
					if (!player.withinDistance(npc, 3))
						return;
					npc.faceEntity(player);
					player.getGeManager().openHistory();
					player.resetWalkSteps();
					return;
				}
				if (npc.getId() >= 8837 && npc.getId() <= 8839) {
					MiningBase.propect(player, "You examine the remains...", "The remains contain traces of living minerals.");
					return;

				}
				npc.faceEntity(player);
				if (SlayerMaster.startInteractionForId(player, npc.getId(), 3)) 
					ShopsHandler.openShop(player, 61);
				if(npc.getId() == 3705) 
					player.getDialogueManager().startDialogue("SkillcapeShop", npc.getId());
				if(npc.getId() == 6524 || npc.getId() == 19919) {
					Drinkables.decantPotsInv(player);
				}
				if (npc.getId() == 9085) {
					ShopsHandler.openShop(player, 54);
				}
				if (npc.getId() == 5532) {
					npc.setNextForceTalk(new ForceTalk("Senventior Disthinte Molesko!"));
					player.getControlerManager().startControler("SorceressGarden");
				} 
			}
		}));
	}

	public static void handleOption4(final Player player, InputStream stream) {
		int npcIndex = stream.readUnsignedShort128();
		boolean forceRun = stream.read128Byte() == 1;
		final NPC npc = World.getNPCs().get(npcIndex);
		if (npc == null || npc.isCantInteract() || npc.isDead() || npc.hasFinished() || !player.getMapRegionsIds().contains(npc.getRegionId()))
			return;
		if (npc.getDefinitions().name.toLowerCase().equals("grand exchange clerk")) {
			player.faceEntity(npc);
			if (!player.withinDistance(npc, 3))
				return;
			npc.faceEntity(player);
			ItemSets.openSets(player);
			return;
		}
		player.stopAll(false);
		if (forceRun)
			player.setRun(forceRun);
		player.setRouteEvent(new RouteEvent(npc, new Runnable() {
			@Override
			public void run() {
				npc.resetWalkSteps();
				if (!player.getControlerManager().processNPCClick4(npc))
					return;
				if (CityEventHandler.handleNPCClick4(player, npc, npc.getId()))
					return;
				player.faceEntity(npc);
				npc.faceEntity(player);
				if (npc.getId() == 9085) {
					SlayerTask.slayerShop(player);
				}
				if (npc.getId() == 5913) {
					npc.setNextForceTalk(new ForceTalk("Senventior disthine molenko!"));
					npc.setNextAnimation(new Animation(1818));
					npc.faceEntity(player);
					World.sendProjectile(npc, player, 110, 1, 1, 1, 1, 1, 1);
					player.setNextGraphics(new Graphics(110));
					player.setNextWorldTile(new WorldTile(2910, 4832, 0));
				}
				if(npc.getId() == 6524) {
					Drinkables.decantPotsInv(player);
				} 
			}

		}));
		if (Settings.DEBUG) {
			System.out.println("Clicked 4 at npc id : " + npc.getId() + ", " + npc.getX() + ", " + npc.getY() + ", " + npc.getPlane());
		}
	}
}
