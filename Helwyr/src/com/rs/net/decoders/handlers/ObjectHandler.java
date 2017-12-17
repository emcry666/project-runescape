package com.rs.net.decoders.handlers;

import com.rs.Settings;
import com.rs.cache.loaders.Configs;
import com.rs.cache.loaders.ObjectDefinitions;
import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.ForceMovement;
import com.rs.game.NewForceMovement;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.area.dungeonhandler.DungeonEventHandler;
import com.rs.game.area.dungeonhandler.others.AscensionDungeon;
import com.rs.game.area.dungeonhandler.others.AscensionDungeon.AscDoors;
import com.rs.game.cityhandler.CityEventHandler;
import com.rs.game.item.Item;
import com.rs.game.minigames.CastleWars;
import com.rs.game.minigames.Crucible;
import com.rs.game.minigames.CrystalChest;
import com.rs.game.minigames.FightPits;
import com.rs.game.minigames.PuroPuro;
import com.rs.game.minigames.RotsChest;
import com.rs.game.minigames.ShootingStars;
import com.rs.game.npc.vorago.Vorago;
import com.rs.game.npc.vorago.VoragoHandler;
import com.rs.game.player.ArdyFarming;
import com.rs.game.player.OwnedObjectManager;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Bonfire;
import com.rs.game.player.actions.Cooking;
import com.rs.game.player.actions.Cooking.Cookables;
import com.rs.game.player.actions.CowMilkingAction;
import com.rs.game.player.actions.PlayerCombat;
import com.rs.game.player.actions.Smithing.ForgingBar;
import com.rs.game.player.actions.Smithing.ForgingInterface;
import com.rs.game.player.actions.Summoning;
import com.rs.game.player.actions.TrapAction;
import com.rs.game.player.actions.Urns;
import com.rs.game.player.actions.Woodcutting;
import com.rs.game.player.actions.Woodcutting.TreeDefinitions;
import com.rs.game.player.actions.divination.DivinationConvert;
import com.rs.game.player.actions.divination.DivinationConvert.ConvertMode;
import com.rs.game.player.actions.divination.actions.DivineFishing;
import com.rs.game.player.actions.divination.actions.DivineHerblore;
import com.rs.game.player.actions.divination.actions.DivineHunting;
import com.rs.game.player.actions.divination.actions.DivineMining;
import com.rs.game.player.actions.divination.actions.DivineWoodcutting;
import com.rs.game.player.actions.divination.actions.DivineWoodcutting.DivineTreeDefinitions;
import com.rs.game.player.actions.farming.CompostBin;
import com.rs.game.player.actions.farming.PatchConstants;
import com.rs.game.player.actions.farming.PatchConstants.WorldPatches;
import com.rs.game.player.actions.hunter.BoxAction.HunterEquipment;
import com.rs.game.player.actions.hunter.BoxAction.HunterNPC;
import com.rs.game.player.actions.mining.EssenceMining;
import com.rs.game.player.actions.mining.EssenceMining.EssenceDefinitions;
import com.rs.game.player.actions.mining.LavaFlowMine;
import com.rs.game.player.actions.mining.Mining;
import com.rs.game.player.actions.mining.Mining.RockDefinitions;
import com.rs.game.player.actions.mining.MiningBase;
import com.rs.game.player.actions.priffidinas.mining.SerenStones;
import com.rs.game.player.actions.runecrafting.SihponActionNodes;
import com.rs.game.player.actions.thieving.Thieving;
import com.rs.game.player.content.BonesOnAltar;
import com.rs.game.player.content.BonesOnAltar.Bones;
import com.rs.game.player.content.Burying;
import com.rs.game.player.content.DragonfireShield;
import com.rs.game.player.content.GodswordCreating;
import com.rs.game.player.content.Hunter;
import com.rs.game.player.content.JewelrySmithing;
import com.rs.game.player.content.LividFarm;
import com.rs.game.player.content.Magic;
import com.rs.game.player.content.PartyRoom;
import com.rs.game.player.content.ResourceDungeons;
import com.rs.game.player.content.Runecrafting;
import com.rs.game.player.content.Spinning;
import com.rs.game.player.content.SpiritshieldCreating;
import com.rs.game.player.content.WaterFilling;
import com.rs.game.player.content.WellOfFortune;
import com.rs.game.player.content.WildernessTeleports;
import com.rs.game.player.content.agility.Agility;
import com.rs.game.player.content.agility.AgilityPyramid;
import com.rs.game.player.content.agility.ApeAtollAgility;
import com.rs.game.player.content.agility.BarbarianOutpostAgility;
import com.rs.game.player.content.agility.GnomeAgility;
import com.rs.game.player.content.agility.WildernessAgility;
import com.rs.game.player.content.construction.House;
import com.rs.game.player.content.construction.HouseConstants;
import com.rs.game.player.content.instancing.bossInstance.BossInstanceHandler;
import com.rs.game.player.content.instancing.bossInstance.BossInstanceHandler.Boss;
import com.rs.game.player.content.jobs.impl.bananaplantation.BananaCrate;
import com.rs.game.player.content.quest.QuestList.Quests;
import com.rs.game.player.content.quest.impl.piratestreasure.PiratesTreasure;
import com.rs.game.player.content.sawmill.Sawmill;
import com.rs.game.player.controlers.DungeonController;
import com.rs.game.player.controlers.Falconry;
import com.rs.game.player.controlers.FightCaves;
import com.rs.game.player.controlers.RunespanControler;
import com.rs.game.player.controlers.Wilderness;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.game.player.dialogues.impl.DragonSqShieldD;
import com.rs.game.player.dialogues.impl.MiningGuildDwarf;
import com.rs.game.player.dialogues.impl.construction.EnterHouseD;
import com.rs.game.player.pathing.RouteEvent;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.io.InputStream;
import com.rs.utils.Logger;
import com.rs.utils.PkRank;
import com.rs.utils.Utils;

public final class ObjectHandler {
	public static final double RUNESPAN_PORTAL = 38279;


	private ObjectHandler() {

	}

	public static void handleOption(final Player player, InputStream stream, int option) {
		if (!player.hasStarted() || !player.clientHasLoadedMapRegion()
				|| player.isDead())
			return;
		long currentTime = Utils.currentTimeMillis();
		if (player.getLockDelay() >= currentTime
				|| player.getEmotesManager().getNextEmoteEnd() >= currentTime)
			return;
		boolean forceRun = stream.readUnsignedByte128() == 1;
		final int id = stream.readIntLE();
		int x = stream.readUnsignedShortLE();
		int y = stream.readUnsignedShortLE128();
		int rotation = 0;
		if (player.isAtDynamicRegion()) {
			rotation = World.getRotation(player.getPlane(), x, y);
			if(rotation == 1) {
				ObjectDefinitions defs = ObjectDefinitions
						.getObjectDefinitions(id);
				y += defs.getSizeY() - 1;
			}else if(rotation == 2) {
				ObjectDefinitions defs = ObjectDefinitions
						.getObjectDefinitions(id);
				x += defs.getSizeY() - 1;
			}
		}
		final WorldTile tile = new WorldTile(x, y, player.getPlane());
		final int regionId = tile.getRegionId();
		if (!player.getMapRegionsIds().contains(regionId))
			return;
		WorldObject mapObject = World.getObjectWithId(tile, id);
		if (mapObject == null || mapObject.getId() != id) 
			return;
		if (player.isAtDynamicRegion()
				&& World.getRotation(player.getPlane(), x, y) != 0) { //temp fix
			ObjectDefinitions defs = ObjectDefinitions
					.getObjectDefinitions(id);
			if (defs.getSizeX() > 1 || defs.getSizeY() > 1) {
				for (int xs = 0; xs < defs.getSizeX() + 1
						&& (mapObject == null || mapObject.getId() != id); xs++) {
					for (int ys = 0; ys < defs.getSizeY() + 1
							&& (mapObject == null || mapObject.getId() != id); ys++) {
						tile.setLocation(x + xs, y + ys, tile.getPlane());
						mapObject = World.getObjectWithId(tile,
								id);
					}
				}
			}
			if (mapObject == null || mapObject.getId() != id)
				return;
		}
		final WorldObject object = !player.isAtDynamicRegion() ? mapObject
				: new WorldObject(id, mapObject.getType(),
						(mapObject.getRotation() + rotation % 4), x, y, player.getPlane());
		player.stopAll(false);
		switch(option) {
		case 1:
			handleOption1(player, object);
			break;
		case 2:
			handleOption2(player, object);
			break;
		case 3:
			handleOption3(player, object);
			break;
		case 4:
			handleOption4(player, object);
			break;
		case 5:
			handleOption5(player, object);
			break;
		case -1:
			handleOptionExamine(player, object);
			break;
		}
	}

	private static void handleOption1(final Player player, final WorldObject object) {
		final ObjectDefinitions objectDef = object.getDefinitions();
		final int id = object.getId();
		final int x = object.getX();
		final int y = object.getY();
		final int plane = object.getPlane();
		final int destX = player.getX();
		final int destY = player.getY();
		if (id == 43529 && destX >= 2484 && destY >= 3417 && destX <= 2487 && destY <= 3422 && player.getPlane() == 3) 
			GnomeAgility.PreSwing(player, object);
		if(SihponActionNodes.siphon(player, object)) 
			return;
		if (ResourceDungeons.handleObjects(player, id))
			return;
		if (id == 1948) {
			BarbarianOutpostAgility.climbOverCrumblingWall(player, object);
			return;
		}
		if (id == 69514 || (id >= 4550 && id <= 4559)) {
			player.setRouteEvent(new RouteEvent(object, new Runnable() {
				@Override
				public void run() {
					player.faceObject(object);
					 if (id == 69514) {
						GnomeAgility.runGnomeBoard(player, object);
					} else if (id >= 4550 && id <= 4559) {
						if (!Agility.hasLevel(player, 35))
							return;
						if (object.withinDistance(player, 2)) {
							if (!Agility.hasLevel(player, 35))
								return;
							player.setNextForceMovement(new NewForceMovement(player, 1, object, 2,
									Utils.getAngle(object.getX() - player.getX(), object.getY() - player.getY())));
							player.useStairs(-1, object, 1, 2);
							player.setNextAnimation(new Animation(769));
							player.getSkills().addXp(Skills.AGILITY, 2);
						}
					}
				}
			}));
			return;
		}
		if (object.getId() == 733 || object.getId() == 64729) {
			player.setNextAnimation(new Animation(PlayerCombat
					.getWeaponAttackEmote(-1, 0, player)));
			slashWeb(player, object);
		}
		player.setRouteEvent(new RouteEvent(object, new Runnable() {
			@Override
			public void run() {
				player.stopAll();
				if (player.getRights() == 2) {
					player.sm(
							"Clicked 1 at object id : " + id + ", "
									+ object.getX() + ", " + object.getY()
									+ ", " + object.getPlane() + ", "
									+ object.getType() + ", "
									+ object.getRotation() + ", "
									+ object.getDefinitions().name);
				}
				player.faceObject(object);
				if (!player.getControlerManager().processObjectClick1(object))
					return;
				if(CityEventHandler.handleObjectClick(player, object, object.getId()))
					return;
				if(DungeonEventHandler.handleObjectClick(player, object, object.getId()))
					return;
				if (player.getTreasureTrailsManager().useObject(object))
				    return;
				if (id == 2642) {
					if (Urns.handleItemOnObject(player, new Item(1761), object)) 
						return;
				}
				/**
				 * Divination
				 */
				if (id == 90223) {
					player.getActionManager().setAction(new DivineFishing(DivineFishing.DivineFishingSpots.DIVINE_CRAYFISH, x, y, plane, object));
					return;
				}
				if (id == 90224) {
					player.getActionManager().setAction(new DivineFishing(DivineFishing.DivineFishingSpots.DIVINE_HERRING, x, y, plane, object));
					return;
				}
				if (id == 90225) {
					player.getActionManager().setAction(new DivineFishing(DivineFishing.DivineFishingSpots.DIVINE_TROUT, x, y, plane, object));
					return;
				}
				if (id == 90226) {
					player.getActionManager().setAction(new DivineFishing(DivineFishing.DivineFishingSpots.DIVINE_SALMON, x, y, plane, object));
					return;
				}
				if (id == 90227) {
					player.getActionManager().setAction(new DivineFishing(DivineFishing.DivineFishingSpots.DIVINE_LOBSTER, x, y, plane, object));
					return;
				}
				if (id == 90228) {
					player.getActionManager().setAction(new DivineFishing(DivineFishing.DivineFishingSpots.DIVINE_SWORDFISH, x, y, plane, object));
					return;
				}
				if (id == 90229) {
					player.getActionManager().setAction(new DivineFishing(DivineFishing.DivineFishingSpots.DIVINE_SHARK, x, y, plane, object));
					return;
				}
				if (id == 90230) {
					player.getActionManager().setAction(new DivineFishing(DivineFishing.DivineFishingSpots.DIVINE_CAVEFISH, x, y, plane, object));
					return;
				}
				if (id == 90231) {
					player.getActionManager().setAction(new DivineFishing(DivineFishing.DivineFishingSpots.DIVINE_ROCKTAIL, x, y, plane, object));
					return;
				}
				if (id == 87280) {
					player.getActionManager().setAction(new DivineHerblore(DivineHerblore.DivineHerbsSpots.DIVINE_HERB_I, x, y, plane, object));
					return;
				}
				if (id == 87281) {
					player.getActionManager().setAction(new DivineHerblore(DivineHerblore.DivineHerbsSpots.DIVINE_HERB_II, x, y, plane, object));
					return;
				}
				if (id == 87282) {
					player.getActionManager().setAction(new DivineHerblore(DivineHerblore.DivineHerbsSpots.DIVINE_HERB_III, x, y, plane, object));
					return;
				}
				if (id == 87270) {
					player.getActionManager().setAction(new DivineHunting(DivineHunting.DivineHuntingSpots.DIVINE_KEBBIT_BURROW, x, y, plane, object));
					return;
				}
				if (id == 87271) {
					player.getActionManager().setAction(new DivineHunting(DivineHunting.DivineHuntingSpots.DIVINE_BIRD_SNARE, x, y, plane, object));
					return;
				}
				if (id == 87272) {
					player.getActionManager().setAction(new DivineHunting(DivineHunting.DivineHuntingSpots.DIVINE_DEADFALL_TRAP, x, y, plane, object));
					return;
				}
				if (id == 87273) {
					player.getActionManager().setAction(new DivineHunting(DivineHunting.DivineHuntingSpots.DIVINE_BOX_TRAP, x, y, plane, object));
					return;
				}
				
				 if (id == 91500 || id == 91557) {
                    BossInstanceHandler.enterInstance(player, Boss.Araxxi);
				 }
				 /*
				  * Vorago Objects
				  */
				 if (object.getId() == 84828 && player.getX() > object.getX()) {
					 player.setNextWorldTile(new WorldTile(object.getX()-1, object.getY(), 0));
				 }
				
				if (object.getId() == 84960) {
					Magic.sendNormalTeleportSpell(player, 1, 0, Vorago.OUTSIDE);
					VoragoHandler.removePlayer(player);
					if (VoragoHandler.getPlayersCount() == 0) {
					    World.removeObject(object);
					    VoragoHandler.endFight();
					}
				}
				
				if (object.getId() == 84959 && VoragoHandler.getPlayers().contains(player)) {
				    Vorago rago = VoragoHandler.vorago;
				    player.getPackets().sendGameMessage("<col=ffc100>You fire the field at vorago, destabilising him.</col>");
				    //World.sendGraphics(player, new Graphics(4030), object);
				    //World.sendProjectile(player, object, rago, 4029, 20, 90, 2, 0, 0, 0);
				    World.removeObject(object);
				    if (rago.fieldCount == 4) {
					rago.special = true;
					rago.specialType = 2;
				    }
				}
				
				if (object.getId() == 84827) {
					player.setNextWorldTile(new WorldTile(object.getX()-1, object.getY(), 0));
				}
				
				if (object.getId() == 84826) {//Gaps TODO Anims
					if (player.getY() == 6102 && player.getX() == 3043) {//Gap 1
						player.setNextWorldTile(new WorldTile(3043, 6106, 0));
					} else if (player.getY() == 6106 && player.getX() == 3043) {//Gap1
						player.setNextWorldTile(new WorldTile(3043, 6102, 0));
					} else if (player.getY() == 6107 && player.getX() == 3043) {//Gap2
						player.setNextWorldTile(new WorldTile(3047, 6107, 0));
					} else if (player.getY() == 6107 && player.getX() == 3047) {//Gap2
						player.setNextWorldTile(new WorldTile(3043, 6107, 0));
					} else if (player.getY() == 6111 && player.getX() == 3047) {//Gap3
						player.setNextWorldTile(new WorldTile(3047, 6115, 0));
					} else if (player.getY() == 6115 && player.getX() == 3047) {//Gap3
						player.setNextWorldTile(new WorldTile(3047, 6111, 0));
					} else if (object.getRotation() == 1) {
						player.setNextWorldTile(new WorldTile(object.getX() + 3, player.getY(), 0));				
					} else if (object.getRotation() == 2) {
					    final Vorago n = VoragoHandler.vorago;
					    if(n == null)
					    	return;
					    if (Utils.getDistance(n, new WorldTile(3097, 6119, 0)) < 4) {
							if (player.isBehind(n)) {
								n.setCantInteract(true);
								player.addWalkSteps(object.getX(), object.getY());
								WorldTasksManager.schedule(new WorldTask() {
									int count = 0;

									@Override
									public void run() {

										if (count == 1) {
											n.getCombat().removeTarget();
										}
										if (count == 2) {
											player.faceEntity(n);
											n.setNextFaceWorldTile(new WorldTile(object.getX(), object.getY() - 30, 0));
										}
										if (count == 3) {
											player.setNextAnimation(new Animation(20311));
											n.setNextAnimation(new Animation(20376));
										}
										if (count == 20) {
											n.canDie = true;
											player.getInventory().addItem(28600, 1);
											player.setNextWorldTile(new WorldTile(object.getX() + 6, object.getY() - 7, 0));
											n.setCantInteract(false);
											stop();
										}
										count++;
									}
								}, 0, 0);
							} else {
								player.getPackets().sendGameMessage("Vorago needs to be facing away from you!");
							}
						} else {
							player.getPackets().sendGameMessage("Vorago isn't in the right place!");
						}
					}
					return; 
				}
				if (id == 82014) {
					BossInstanceHandler.enterInstance(player, Boss.Kalphite_King);
				} else if (id == 84909) // vorago graveyard exit
					player.useStairs(828, new WorldTile(2972, 3431, 0), 1, 2);
				else if(id == 17819)//vorago entrance
					player.useStairs(828, new WorldTile(3044, 6100, 0), 1, 2);
				if (id == 82049) {
					if (player.isKalphiteLairSetted())
						player.useStairs(19507, new WorldTile(3420, 9510, 0), 4, 5, null, true);
					else if (player.getInventory().containsItem(954, 1)) {
						player.getInventory().deleteItem(954, 1);
						player.setKalphiteLair();
					} else
						player.getPackets().sendGameMessage("You need a rope to climb down.");
				}
				if (object.getId() == 84715 && object.getType() == 1) {
					WorldObject other = null;
					for (int x = - 6; x < 6; x++) {
						for (int y = - 6; y < 6; y++) {
							if (x == 0 && y == 0)
								continue;
							other = World.getObjectWithId(object.transform(x, y, 0), 84715);
							if (other != null && other.getRotation() != object.getRotation()) {
								player.setNextWorldTile(new WorldTile(other));
								return;
							}
						}
					}
				}
				if (id == 84702) { // enterance to the cave ascension
					if (player.getSkills().getLevel(Skills.SLAYER) >= 81) {
						player.setNextWorldTile(new WorldTile(1095, 580, 1));
					} else {
						player.getPackets().sendGameMessage("The monsters within this dungeon require at least 81 slayer to kill.");
					}
					return;
				}
				if (object.getDefinitions().name.startsWith("Laboratory ")) {
					if (player.getSkills().getLevel(Skills.SLAYER) < 95) {
						player.sendMessage("You need at least 95 Slayer to kill a Legio.");
						return;
					}
					String name = object.getDefinitions().name.replace("Laboratory ", "");
					for (AscDoors door : AscDoors.values()) {
						if (door.name().equalsIgnoreCase(name)) {
							if (object.getDefinitions().getFirstOption().equals("Enter")) {
								player.getDialogueManager().startDialogue(new Dialogue() {
									@Override
									public void start() {
										Dialogue.sendOptionsDialogue(player, "What would you like to do?", "Spawn Legio (Requires 1 Ascension Keystone " + name + ")", "Nevermind");
									}
									@Override
									public void run(int interfaceId, int componentId) {
										switch(componentId) {
										case OPTION_1:
											AscensionDungeon.enter(player, door.ordinal());
											player.getInterfaceManager().closeChatBoxInterface();
											break;
										default:
											player.getInterfaceManager().closeChatBoxInterface();
											break;

										}
									}
									@Override
									public void finish() {
									}

								});
							} 
						}
					}
				}
				if (id == 82019) {
					player.setNextWorldTile(new WorldTile(2949, 1659, 0));
				} else if (id == 82021) {
					player.setNextWorldTile(new WorldTile(3235, 2858, 0));
				}
				if (object.getId() >= HouseConstants.HObject.WOOD_BENCH.getId() && object.getId() <= HouseConstants.HObject.GILDED_BENCH.getId()) {
					player.setRouteEvent(new RouteEvent(object, new Runnable() {
						@Override
						public void run() {
							player.getControlerManager().processObjectClick1(object);
						}
					}, true));
					return;

				}
				if(object.getId() == 84748){
					player.getDialogueManager().startDialogue("FrostbiteTeleports", 15425);
				}
				if (id == 40443) {
					LividFarm.deposit(player);
					return;
				}
				if (id == 40492 || id == 40486 || id == 40505 || id == 40534 || id == 40464 || id == 40489 || id == 40487 || id == 40532
						|| id == 40499 || id == 40533 || id == 40504) {
					LividFarm.MakePlants(player);
					return;
				}
				if (id == 48496) {
					//Dungeoneering.startDungeon(1, 6, 0, player);
					player.getDungManager().enterDungeon(true);
				}
				if (id >= 10851 && id <= 10888) {
					AgilityPyramid.pyramidCourse(player, object);
					return;
				}
				if(id == 92694 && object.getX() == 2196) {
					player.teleport(2527, 3860, 0);
					return;
				}
				/**
				 * Priff stairs
				 */
				if(object.getId() == 92436) {
					if(!(player.getX() == 2214)) {
						player.setRouteEvent(new RouteEvent(new WorldTile(2214, 3364, 2), new Runnable() {

							@Override
							public void run() {
								player.setNextWorldTile(new WorldTile(player.getX() + 2, player.getY(), player.getPlane() - 1));
							}
						}));
					} else {
						player.setNextWorldTile(new WorldTile(player.getX() + 2, player.getY(), player.getPlane() - 1));
					}
					return;
				}
				if(object.getId() == 92435) {
					if(!(player.getX() == 2215)) {
						player.setRouteEvent(new RouteEvent(new WorldTile(2215, 3364, 1), new Runnable() {
							
							@Override
							public void run() {
								player.setNextWorldTile(new WorldTile(player.getX() - 2, player.getY(), player.getPlane() + 1));
							}
						}));
					} else {
						player.setNextWorldTile(new WorldTile(player.getX() - 2, player.getY(), player.getPlane() + 1));
					}
					return;
				}
				if (id == 2564) {
					player.getDialogueManager().startDialogue("ElvenGrimorie", true);
					player.reset();
					return;
				}
				if(id == 38279) {
					player.getDialogueManager().startDialogue("RunespanPortalD");
				}
				if (object.getId() == 79519) {
				    RunespanControler.enterRunespan(player, false);
				    return;
				}
				if (object.getId() == 79520) {
				    RunespanControler.enterRunespan(player, true);
				    return;
				}
				if (id == 79770) {
				    player.setNextWorldTile(new WorldTile(player.getX(), player.getY(), 1));
				    return;
				}
				if (id == 79772) {
				    player.setNextWorldTile(new WorldTile(player.getX(), player.getY(), 2));
				    return;
				}
				if (id == 69506) 
					GnomeAgility.climbUpTree(player);
				else if (id == 43529 && destX >= 2484 && destY >= 3417 && destX <= 2487 && destY <= 3422 && player.getPlane() == 3)
					GnomeAgility.PreSwing(player, object);
				else if (id == 69526)
					GnomeAgility.walkGnomeLog(player);
				else if (id == 69383)
					GnomeAgility.climbGnomeObstacleNet(player);
				else if (id == 69508)
					GnomeAgility.climbUpGnomeTreeBranch(player);
				else if (id == 2312)
					GnomeAgility.walkGnomeRope(player);
				else if (id == 4059)
					GnomeAgility.walkBackGnomeRope(player);
				else if (id == 69507)
					GnomeAgility.climbDownGnomeTreeBranch(player);
				else if (id == 69384)
					GnomeAgility.climbGnomeObstacleNet2(player);
				else if (id == 69377 || id == 69378)
					GnomeAgility.enterGnomePipe(player, object.getX(), object.getY(), object);
				else if (id == 69389)
					GnomeAgility.jumpDown(player, object);
				else if (id == 69506)
					GnomeAgility.climbUpTree(player);
				else if (id == 12568)
					ApeAtollAgility.jumpSteppingStone(player, object);
				else if (id == 12570)
					ApeAtollAgility.climbUpTropicalTree(player, object);
				else if (id == 12573)
					ApeAtollAgility.crossMonkeyBars(player, object);
				else if (id == 12576)
					ApeAtollAgility.climbUpSkullSlope(player, object);
				else if (id == 12578)
					ApeAtollAgility.swingRope(player, object);
				else if (id == 12618)
					ApeAtollAgility.climbDownTropicalTree(player, object);
				else if (id == 12622)
					ApeAtollAgility.climbDownVine(player, object);
				else if (id == 65365)
					WildernessAgility.enterWildernessCourse(player);
				else if (id == 65367)
					WildernessAgility.exitWildernessCourse(player);
				switch (object.getId()) {


				/**
				 * Quests
				 */
				/**
				 * Pirates Treasure
				 */
				case 2071:
					if(player.getQuestManager().get(Quests.PIRATES_TREASURE).getStage() > 4 && player.getQuestManager().get(Quests.PIRATES_TREASURE).getStage() < 6) {
						if(player.getInventory().getFreeSlots() > 1) {
							player.getInventory().addItem(PiratesTreasure.KARAMJA_RUM, 1);
							player.output("You find your bottle of rum in amongst the bananas.");
							player.getQuestManager().get(Quests.PIRATES_TREASURE).setStage(6);
						}
					}
					player.output("There are alot of bananas in the crate.");
					player.lock(3);
					player.getDialogueManager().startDialogue("WydinBananaCrate");
					break;
				case 2072:
					BananaCrate.handleObjectClick(player);
					break;
				case 13291:
					int coins = (player.getSkills().getLevel(Skills.DUNGEONEERING))*10000;
					int xp = ((player.getSkills().getLevel(Skills.DUNGEONEERING))*1000)/Configs.XP_RATE;
					int tokens = (xp*45)/10;
					if (player.getInventory().containsItem(18268, 1)) {
						player.getInventory().deleteItem(18268, 1);
						player.getInventory().addItem(995, coins);
						player.getInventory().addItem(29898, tokens);
						player.getSkills().addXp(Skills.DUNGEONEERING, xp);
						player.sm("You receive " + xp*45 + " Dungeoneering XP, " + tokens + " Dungeoneering tokens, and " + coins + " coins!");
					} else {
						player.getDialogueManager().startDialogue("SimpleMessage", "Looks like I need a key to open this up...");
						return;
					}
					break;
				case 66115://Barrows spades
				case 66116:
					InventoryOptionsHandler.dig(player);
					break;
				case 5949:
					player.setNextWorldTile(new WorldTile(3221, 9556, 0));
					player.sm("You hop back over the gap.");
					break;
				case 12103:
					if (player.getSkills().getLevel(Skills.DUNGEONEERING) < 120) {
						player.sm("You require 120 Dungeoneering to cross this gap.");
						break;
					} else {
						player.setNextWorldTile(new WorldTile(3221, 9553, 0));
						player.sm("You step over the crates and hop to the other side.");
					}
					break;
				}
				if (object.getId() == 67036)
					Summoning.sendInterface(player);
				if (CastleWars.handleObjects(player, id))
					return;
				if (player.getTreasureTrailsManager().useObject(object))
				    return;
				if (TrapAction.isTrap(player, object, id) || TrapAction.isTrap(player, object))
					return;
				if (id == 6 || id == 29408 || id == 29406) {
					player.getDwarfCannon().preRotationSetup(object);
				}
				if (object.getId() == 19205)
					Hunter.createLoggedObject(player, object, true);
				if (object.getId() == 39508 || object.getId() == 39509) {
					//StealingCreationLobbyController.climbOverStile(player, object, true);
					return;
				}
				if (id == 14315) {
					player.getControlerManager().startControler("PestControlLobby", 1);
				}
				 if (id == 50552) {
					if(player.getControlerManager().getControler() instanceof DungeonController)
						player.getControlerManager().removeControlerWithoutCheck();
				    player.setNextForceMovement(new ForceMovement(object, 1, ForceMovement.NORTH));
				    player.getPackets().sendGlobalConfig(234, 0);//Party Config Interface
				    player.getControlerManager().startControler("Kalaboss");
				    player.useStairs(13760, new WorldTile(3454, 3725, 0), 2, 3);
				 }
				WorldPatches patch = WorldPatches.forId(object.getId());
				if (patch != null && player.getFarmings() != null) {
					player.getFarmings().patches[patch.getArrayIndex()].handleOption1(player);
					return;
				}
				if (object.getId() == 92885) {
					if (!player.withinDistance(object, 2))
						return;
					Bonfire.addLogs(player, object);
				}
				if (id == 40443) {
					LividFarm.deposit(player);
					return;
				}
				if (id == 40486 || id == 40505 || id == 40534 || id == 40492 || id == 40646 || id == 40489 || id == 40487 || id == 40532 || id == 40499 || id == 40533 || id == 40504) {
					LividFarm.MakePlants(player);
					return;
				}
				if (id == 40444) {
					LividFarm.TakeLogs(player);
					return;
				}
				if (id == 68107) {
					player.getControlerManager().startControler("FightKilnControler", 1);
				}
				if (id == 34395) {
					player.sm("Coming soon...");
				}
				if (id == 28715) {
					WellOfFortune.handleWell(player);
				}
				if (object.getDefinitions().name.equalsIgnoreCase("obelisk") && object.getDefinitions().getOption(1).equalsIgnoreCase("activate")) {
					WildernessTeleports.preTeleport(player, object);
				}
			 if (id == 61190 || id == 61191 || id == 61192
					|| id == 61193) {
				if (objectDef.containsOption(0, "Chop down"))
					player.getActionManager().setAction(
							new Woodcutting(object,
									TreeDefinitions.NORMAL));
			} else if (id == 5103) { // Brimhaven Dungeon Vines 1
				if (!Woodcutting.hasAxe(player)) {
					player.output("You need a hatchet to cut this vines.");
					return;
				}
				if (object.getX() == 2690 && object.getY() == 9564) {
					if (player.getX() == 2691) {
						player.setNextWorldTile(new WorldTile(2689,
								9564, 0));
					} else if (player.getX() == 2689) {
						player.setNextWorldTile(new WorldTile(2691,
								9564, 0));
					}
				}
			} else if (id == 5104) { // Brimhaven Dungeon Vines 2
				if (!Woodcutting.hasAxe(player)) {
					player.output("You need a hatchet to cut this vines.");
					return;
				}
				if (object.getX() == 2683 && object.getY() == 9569) {
					if (player.getY() == 9568) {
						player.setNextWorldTile(new WorldTile(2683,
								9570, 0));
					} else if (player.getY() == 9570) {
						player.setNextWorldTile(new WorldTile(2683,
								9568, 0));
					}
				}
			} else if (id == 5106) { // Brimhaven Dungeon Vines 3
				if (!Woodcutting.hasAxe(player)) {
					player.output("You need a hatchet to cut this vines.");
					return;
				}
				if (object.getX() == 2675 && object.getY() == 9479) {
					if (player.getX() == 2674) {
						player.setNextWorldTile(new WorldTile(2676,
								9479, 0));
					} else if (player.getX() == 2676) {
						player.setNextWorldTile(new WorldTile(2674,
								9479, 0));
					}
				}
			} else if (id == 5107) { // Brimhaven Dungeon Vines 4
				if (!Woodcutting.hasAxe(player)) {
					player.output("You need a hatchet to cut this vines.");
					return;
				}
				if (object.getX() == 2694 && object.getY() == 9482) {
					if (player.getX() == 2693) {
						player.setNextWorldTile(new WorldTile(2695,
								9482, 0));
					} else if (player.getX() == 2695) {
						player.setNextWorldTile(new WorldTile(2693,
								9482, 0));
					}
				}
			} else if (id == 5097) { // Brimhaven Upstairs
				if (object.getX() == 2635 && object.getY() == 9514) {
					player.setNextWorldTile(new WorldTile(2636, 9510, 2));
				}
			} else if (id == 5098) { // Brimhaven Downstairs
				if (object.getX() == 2635 && object.getY() == 9511) {
					player.setNextWorldTile(new WorldTile(2636, 9517, 0));
				}
			} else if (id == 5110) { // Brimhaven Dungeon Stepping Stone
				// 1
				if (object.getX() == 2649 && object.getY() == 9561) {
					player.setNextWorldTile(new WorldTile(2647, 9557, 0));
				}
			} else if (id == 5111) { // Brimhaven Dungeon Stepping Stone
				// 2
				if (object.getX() == 2647 && object.getY() == 9558) {
					player.setNextWorldTile(new WorldTile(2649, 9562, 0));
				}
			} else if (id == 5088) { // Brimhaven Dungeon Block Balance
				// 1
				if (object.getX() == 2683 && object.getY() == 9506) {
					player.setNextWorldTile(new WorldTile(2687, 9506, 0));
				}
			} else if (id == 5090) { // Brimhaven Dungeon Block Balance
				// 2
				if (object.getX() == 2685 && object.getY() == 9506) {
					player.setNextWorldTile(new WorldTile(2682, 9506, 0));
				}
			} else if (id == 5083) { // Brimhaven Dungeon Enterance
				if (object.getX() == 2743 && object.getY() == 3153) {
					player.setNextWorldTile(new WorldTile(2713, 9564, 0));
				}
			} else if (id == 5084) { // Brimhaven Dungeon Exit
				if (object.getX() == 2711 && object.getY() == 9563) {
					player.setNextWorldTile(new WorldTile(2744, 3152, 0));
				}
			}
				//Slayer Tower
				if (id == 9319) { //Spikey Chain
					player.setNextWorldTile(new WorldTile(3422, 3549, 1));
				}
				if (id == 9319 && (object.getX() == 3447 && object.getY() == 3576 && object
						.getPlane() == 1)) {
					player.setNextWorldTile(new WorldTile(3446, 3576, 2));
				}
				if (id == 38669) {
					ShootingStars.openNoticeboard(player);
				}
				if (id == 25591) {
					ShootingStars.openTelescope(player);
				}
				if (id == 2073) {
					player.getInventory().addItem(1963, 1);
					player.getPackets().sendGameMessage("You pick a banana from the tree.");
				}
				//End Slayer Tower
				if (id == 39468) {
					player.setNextWorldTile(new WorldTile(1745, 5325, 0));
				}
				if (id == 25339) {
					player.setNextWorldTile(new WorldTile(1778, 5343, 1));
				}
				if (id == 6439) { // Smoke Dungeon Rope
					player.setNextWorldTile(new WorldTile(3310, 2961, 0));
				} else if (id == 36002) { // Smoke Dungeon Well
					player.setNextWorldTile(new WorldTile(3206, 9379, 0));
				}
			 if (id == 31359) {
					player.useStairs(-1, new WorldTile(3360, 9352, 0), 1, 2);
					player.getControlerManager().startControler(
							"UnderGroundDungeon", true, true);
			 }
				if (id == 13999) { //Rope to home
					player.setNextWorldTile(new WorldTile(Settings.RESPAWN_PLAYER_LOCATION));
					player.sm("You journey back to the surface.");
				}
				//Kuradals Dungeon Start
				if (id == 47232) { //Outside to Inside
					player.setNextWorldTile(new WorldTile(1661, 5257, 0));
				}
				if (id == 47231) { //Inside to Outside
					player.setNextWorldTile(new WorldTile(1735, 5313, 1));
				}
				if (id == 47236) {
					if (player.getX() == 1650 && player.getY() == 5281 || player.getX() == 1651 && player.getY() == 5281 || player.getX() == 1650 && player.getY() == 5281) {
						player.addWalkSteps(1651, 5280, 1, false);
					}
					if (player.getX() == 1652 && player.getY() == 5280 || player.getX() == 1651 && player.getY() == 5280 || player.getX() == 1653 && player.getY() == 5280) {
						player.addWalkSteps(1651, 5281, 1, false);
					}
					if (player.getX() == 1650 && player.getY() == 5301 || player.getX() == 1650 && player.getY() == 5302 || player.getX() == 1650 && player.getY() == 5303) {
						player.addWalkSteps(1649, 5302, 1, false);
					}
					if (player.getX() == 1649 && player.getY() == 5303 || player.getX() == 1649 && player.getY() == 5302 || player.getX() == 1649 && player.getY() == 5301) {
						player.addWalkSteps(1650, 5302, 1, false);
					}
					if (player.getX() == 1626 && player.getY() == 5301 || player.getX() == 1626 && player.getY() == 5302 || player.getX() == 1626 && player.getY() == 5303) {
						player.addWalkSteps(1625, 5302, 1, false);
					}
					if (player.getX() == 1625 && player.getY() == 5301 || player.getX() == 1625 && player.getY() == 5302 || player.getX() == 1625 && player.getY() == 5303) {
						player.addWalkSteps(1626, 5302, 1, false);
					}
					if (player.getX() == 1609 && player.getY() == 5289 || player.getX() == 1610 && player.getY() == 5289 || player.getX() == 1611 && player.getY() == 5289) {
						player.addWalkSteps(1610, 5288, 1, false);
					}
					if (player.getX() == 1609 && player.getY() == 5288 || player.getX() == 1610 && player.getY() == 5288 || player.getX() == 1611 && player.getY() == 5288) {
						player.addWalkSteps(1610, 5289, 1, false);
					}
					if (player.getX() == 1606 && player.getY() == 5265 || player.getX() == 1605 && player.getY() == 5265 || player.getX() == 1604 && player.getY() == 5265) {
						player.addWalkSteps(1605, 5264, 1, false);
					}
					if (player.getX() == 1606 && player.getY() == 5264 || player.getX() == 1605 && player.getY() == 5264 || player.getX() == 1604 && player.getY() == 5264) {
						player.addWalkSteps(1605, 5265, 1, false);
					}
					if (player.getX() == 1634 && player.getY() == 5254 || player.getX() == 1634 && player.getY() == 5253 || player.getX() == 1634 && player.getY() == 5252) {
						player.addWalkSteps(1635, 5253, 1, false);
					}
					if (player.getX() == 1635 && player.getY() == 5254 || player.getX() == 1635 && player.getY() == 5253 || player.getX() == 1635 && player.getY() == 5252) {
						player.addWalkSteps(1634, 5253, 1, false);
					}
				}
				else if (id == 65365)
					WildernessAgility.GateWalk(player, object);
				else if (id == 65367)
					WildernessAgility.GateWalkOut(player, object);
				else if (id == 65734)
					WildernessAgility.climbCliff(player, object);
				else if (id == 65362)
					WildernessAgility.enterObstaclePipe(player,
							object.getX(), object.getY());
				else if (id == 64696)
					WildernessAgility.swingOnRopeSwing(player, object);
				else if (id == 64698)
					WildernessAgility.walkLog(player);
				else if (id == 64699)
					WildernessAgility.crossSteppingPalletes(player, object);

				if (id == 26427) { //sara Main Door
					player.setNextWorldTile(new WorldTile(2907, 5265, 0));
				}
				if (id == 26445) { //sara Door
					player.setNextWorldTile(new WorldTile(2920, 5274, 0));
				}
				if (id == 26444) { //sara Door
					player.setNextWorldTile(new WorldTile(2914, 5300, 1));
				}
				if (id == 26428) { //Zammy Main Door
					player.setNextWorldTile(new WorldTile(2925, 5331, 2));
				}
				if (id == 26439) { //zammy Door
					player.setNextWorldTile(new WorldTile(2885, 5345, 2));
				}
				if (id == 26426) { //Arma Main Door
					player.setNextWorldTile(new WorldTile(2839, 5296, 2));
				}
				if (id == 26303) { //Arma Door
					player.setNextWorldTile(new WorldTile(2871, 5269, 2));
				}
				if (id == 26425) { //Bandos Main Door
					player.setNextWorldTile(new WorldTile(2864, 5354, 2));
				}
				if (id == 45009) { //Bandos Main Door
					player.setNextWorldTile(new WorldTile(3358, 9429, 0));
				}
				if (id == 26384) { //Bandos Door
					player.setNextWorldTile(new WorldTile(2850, 5333, 2));
				}
				if (id == 26293) {
					player.setNextWorldTile(new WorldTile(2916, 3747, 0));
				}
				if (id == 26342) {
					player.setNextWorldTile(new WorldTile(2881, 5311, 2));
					player.getControlerManager().startControler("GodWars");
					player.sm("<col=FF0000>There is no kill count required to enter the boss room(s).");
				}
				if (id == 35390) {
					player.setNextWorldTile(new WorldTile(2908, 3712, 0));
				}
				if (id == 3748) {
					player.setNextWorldTile(new WorldTile(2920, 3674, 0));
				}
				if (id == 9305) {
					player.setNextWorldTile(new WorldTile(2898, 3674, 0));
				}
				if (id == 2273) {
					player.setNextWorldTile(new WorldTile(1520, 4704, 0));
				}
				if (id == 9306) {
					player.setNextWorldTile(new WorldTile(2913, 3686, 0));
				}
				if (id == 4495) {
					player.setNextWorldTile(new WorldTile(3417, 3541, 2));
				}
				if (id == 4496) {
					player.setNextWorldTile(new WorldTile(3412, 3541, 1));
				}
				if (id == 28716) {
					Summoning.sendInterface(player);
				}

				// Start of Runecrafting Abyss Entrances
				else if (id == 7133) { // nature rift
					player.setNextWorldTile(new WorldTile(2398, 4841, 0));
				} else if (id == 7132) { // cosmic rift
					player.setNextWorldTile(new WorldTile(2162, 4833, 0));
				} else if (id == 7141) { // blood rift
					player.setNextWorldTile(new WorldTile(2462, 4891, 1));
				} else if (id == 7129) { // fire rift
					player.setNextWorldTile(new WorldTile(2584, 4836, 0));
				} else if (id == 7130) { // earth rift
					player.setNextWorldTile(new WorldTile(2660, 4839, 0));
				} else if (id == 7131) { // body rift
					player.setNextWorldTile(new WorldTile(2527, 4833, 0));
				} else if (id == 7140) { // mind rift
					player.setNextWorldTile(new WorldTile(2794, 4830, 0));
				} else if (id == 7139) { // air rift
					player.setNextWorldTile(new WorldTile(2845, 4832, 0));
				} else if (id == 7137) { // water rift
					player.setNextWorldTile(new WorldTile(3482, 4836, 0));
				} else if (id == 7136) { // death rift
					player.setNextWorldTile(new WorldTile(2207, 4836, 0));
				} else if (id == 7135) { // law rift
					player.setNextWorldTile(new WorldTile(2464, 4834, 0));
				} else if (id == 7134) { // chaotic rift
					player.setNextWorldTile(new WorldTile(2269, 4843, 0));
					// End of Runecrafting Abyss Exits
				}
				
				if (object.getId() == 19679 || object.getId() == 19663
						|| object.getId() == 19671
						|| object.getId() == 19652) {
					Hunter.setupNetTrap(player, object);
					return;
				}
				
				HunterNPC hunterNpc = HunterNPC.forObjectId(id);
				if (hunterNpc != null) {
					if (OwnedObjectManager.removeObject(player, object)) {
						player.lock(4);
						player.setNextAnimation(hunterNpc.getEquipment()
								.getPickUpAnimation());
						Item[] items = hunterNpc.getItems();
						int bones = 0;
						if (items.length >= 2) {
							if (items[1].getName().toLowerCase()
									.contains("bones")
									&& player.getInventory().containsItem(
											18337, 1)) {
								bones = 1;
								player.getSkills().addXp(
										Skills.PRAYER,
										Burying.Bone
										.forId(items[1].getId())
										.getExperience());
							}
						}
						player.getInventory().addItem(items[0].getId(), 1);
						if (bones == 0 && items.length >= 2) {
							player.getInventory().addItem(items[1].getId(),
									1);
						}
						player.getInventory().addItem(
								hunterNpc.getEquipment().getId(), 1);
						if (hunterNpc == HunterNPC.SWAMP_LIZARD) {
							player.getInventory().addItem(954, 1);
						}
						if (hunterNpc == HunterNPC.RED_SALAMANDER) {
							player.getInventory().addItem(954, 1);
						}
						if (hunterNpc == HunterNPC.ORANGE_SALAMANDER) {
							player.getInventory().addItem(954, 1);
						}
						if (hunterNpc == HunterNPC.BLACK_SALAMANDER) {
							player.getInventory().addItem(954, 1);
						}
						player.getSkills().addXp(Skills.HUNTER,
								hunterNpc.getXp());
						player.getInventory().refresh();
					} else {
						player.getPackets().sendGameMessage(
								"This isn't your trap.");
					}
				} else if (id == HunterEquipment.BOX.getObjectId()
						|| id == 19192) {
					if (OwnedObjectManager.removeObject(player, object)) {
						player.setNextAnimation(new Animation(5208));
						player.getInventory().addItem(
								HunterEquipment.BOX.getId(), 1);
					} else
						player.getPackets().sendGameMessage(
								"This isn't your trap.");
				} else if (id == 19678 || id == 19673) { // swamp lizards
					int objectRotation = object.getRotation();
					if (OwnedObjectManager.removeObject(player, object)) {
						if (objectRotation == 0) {
							OwnedObjectManager.removeObject(
									player,
									new WorldObject(id == 19678 ? 19673
											: 19678, object.getType(),
											object.getRotation(), object
											.getX(),
											id == 19678 ? object.getY() + 1
													: object.getY() - 1,
													object.getPlane()));
						}
						if (objectRotation == 2) {
							OwnedObjectManager.removeObject(
									player,
									new WorldObject(id == 19678 ? 19673
											: 19678, object.getType(),
											object.getRotation(), object
											.getX(),
											id == 19678 ? object.getY() - 1
													: object.getY() + 1,
													object.getPlane()));
						}
						if (objectRotation == 3) {
							OwnedObjectManager.removeObject(
									player,
									new WorldObject(id == 19678 ? 19673
											: 19678, object.getType(),
											object.getRotation(),
											id == 19678 ? object.getX() - 1
													: object.getX() + 1,
													object.getY(), object
													.getPlane()));
						}
						if (objectRotation == 1) {
							OwnedObjectManager.removeObject(
									player,
									new WorldObject(id == 19678 ? 19673
											: 19678, object.getType(),
											object.getRotation(),
											id == 19678 ? object.getX() + 1
													: object.getX() - 1,
													object.getY(), object
													.getPlane()));
						}
						player.setNextAnimation(new Animation(5208));
						player.getInventory().addItem(
								HunterEquipment.NET_TRAP.getId(), 1);
						player.getInventory().addItem(954, 1);
					} else
						player.getPackets().sendGameMessage(
								"This isn't your trap.");
				} else if (id == 19670 || id == 19665) { // black
					// salamanders
					int objectRotation = object.getRotation();
					if (OwnedObjectManager.removeObject(player, object)) {
						if (objectRotation == 0) {
							OwnedObjectManager.removeObject(
									player,
									new WorldObject(id == 19670 ? 19665
											: 19670, object.getType(),
											object.getRotation(), object
											.getX(),
											id == 19670 ? object.getY() + 1
													: object.getY() - 1,
													object.getPlane()));
						}
						if (objectRotation == 2) {
							OwnedObjectManager.removeObject(
									player,
									new WorldObject(id == 19670 ? 19665
											: 19670, object.getType(),
											object.getRotation(), object
											.getX(),
											id == 19670 ? object.getY() - 1
													: object.getY() + 1,
													object.getPlane()));
						}
						if (objectRotation == 3) {
							OwnedObjectManager.removeObject(
									player,
									new WorldObject(id == 19670 ? 19665
											: 19670, object.getType(),
											object.getRotation(),
											id == 19670 ? object.getX() - 1
													: object.getX() + 1,
													object.getY(), object
													.getPlane()));
						}
						if (objectRotation == 1) {
							OwnedObjectManager.removeObject(
									player,
									new WorldObject(id == 19670 ? 19665
											: 19670, object.getType(),
											object.getRotation(),
											id == 19670 ? object.getX() + 1
													: object.getX() - 1,
													object.getY(), object
													.getPlane()));
						}
						player.setNextAnimation(new Animation(5208));
						player.getInventory().addItem(
								HunterEquipment.NET_TRAP.getId(), 1);
						player.getInventory().addItem(954, 1);
					} else
						player.getPackets().sendGameMessage(
								"This isn't your trap.");
				} else if (id == 19650 || id == 19651) { // orange
					// salamanders
					int objectRotation = object.getRotation();
					if (OwnedObjectManager.removeObject(player, object)) {
						if (objectRotation == 0) {
							OwnedObjectManager.removeObject(
									player,
									new WorldObject(id == 19650 ? 19651
											: 19650, object.getType(),
											object.getRotation(), object
											.getX(),
											id == 19650 ? object.getY() + 1
													: object.getY() - 1,
													object.getPlane()));
						}
						if (objectRotation == 2) {
							OwnedObjectManager.removeObject(
									player,
									new WorldObject(id == 19650 ? 19651
											: 19650, object.getType(),
											object.getRotation(), object
											.getX(),
											id == 19650 ? object.getY() - 1
													: object.getY() + 1,
													object.getPlane()));
						}
						if (objectRotation == 3) {
							OwnedObjectManager.removeObject(
									player,
									new WorldObject(id == 19650 ? 19651
											: 19650, object.getType(),
											object.getRotation(),
											id == 19650 ? object.getX() - 1
													: object.getX() + 1,
													object.getY(), object
													.getPlane()));
						}
						if (objectRotation == 1) {
							OwnedObjectManager.removeObject(
									player,
									new WorldObject(id == 19650 ? 19651
											: 19650, object.getType(),
											object.getRotation(),
											id == 19650 ? object.getX() + 1
													: object.getX() - 1,
													object.getY(), object
													.getPlane()));
						}
						player.setNextAnimation(new Animation(5208));
						player.getInventory().addItem(
								HunterEquipment.NET_TRAP.getId(), 1);
						player.getInventory().addItem(954, 1);
					} else
						player.getPackets().sendGameMessage(
								"This isn't your trap.");
				
				
				} else if (id == 19662 || id == 19681) { // red salamanders
					int objectRotation = object.getRotation();
					if (OwnedObjectManager.removeObject(player, object)) {
						if (objectRotation == 0) {
							OwnedObjectManager.removeObject(
									player,
									new WorldObject(id == 19662 ? 19681
											: 19662, object.getType(),
											object.getRotation(), object
											.getX(),
											id == 19662 ? object.getY() + 1
													: object.getY() - 1,
													object.getPlane()));
						}
						if (objectRotation == 2) {
							OwnedObjectManager.removeObject(
									player,
									new WorldObject(id == 19662 ? 19681
											: 19662, object.getType(),
											object.getRotation(), object
											.getX(),
											id == 19662 ? object.getY() - 1
													: object.getY() + 1,
													object.getPlane()));
						}
						if (objectRotation == 3) {
							OwnedObjectManager.removeObject(
									player,
									new WorldObject(id == 19662 ? 19681
											: 19662, object.getType(),
											object.getRotation(),
											id == 19662 ? object.getX() - 1
													: object.getX() + 1,
													object.getY(), object
													.getPlane()));
						}
						if (objectRotation == 1) {
							OwnedObjectManager.removeObject(
									player,
									new WorldObject(id == 19662 ? 19681
											: 19662, object.getType(),
											object.getRotation(),
											id == 19662 ? object.getX() + 1
													: object.getX() - 1,
													object.getY(), object
													.getPlane()));
						}
						player.setNextAnimation(new Animation(5208));
						player.getInventory().addItem(
								HunterEquipment.NET_TRAP.getId(), 1);
						player.getInventory().addItem(954, 1);
					} else
						player.getPackets().sendGameMessage(
								"This isn't your trap.");
					
				} else if (id == HunterEquipment.BRID_SNARE.getObjectId()
						|| id == 19174) {
					if (OwnedObjectManager.removeObject(player, object)) {
						player.setNextAnimation(new Animation(5207));
						player.getInventory().addItem(
								HunterEquipment.BRID_SNARE.getId(), 1);
					} else
						player.getPackets().sendGameMessage(
								"This isn't your trap.");
				}

				if (object.getId() == 57225) {
					player.getDialogueManager().startDialogue("NexEntrance");
				}
				if (object.getId() == 2503) {
					player.getDialogueManager().startDialogue("RevPortal");
				} else if (id == 2350
						&& (object.getX() == 3352 && object.getY() == 3417 && object
						.getPlane() == 0))
					player.useStairs(832, new WorldTile(3177, 5731, 0), 1, 2);
				else if (id == 2353
						&& (object.getX() == 3177 && object.getY() == 5730 && object
						.getPlane() == 0))
					player.useStairs(828, new WorldTile(3353, 3416, 0), 1, 2);
				else if (id == 34395 && x == 2857 && y == 3578)
					player.useStairs(-1, new WorldTile(2893, 10074, 0), 0, 1);
				else if (id == 32738 && x == 2892 && y == 10072)
					player.useStairs(-1, new WorldTile(2858, 3577, 0), 0, 1);
				else if (id == 34548 && x == 2610 && y == 3305)
					player.useStairs(-1, new WorldTile(2611, 3307, 1), 1, 2);
				else if (id == 34550 && x == 2610 && y == 3305)
					player.useStairs(-1, new WorldTile(2611, 3304, 0), 1, 2);
				else if (id == 11554 || id == 11552)
					player.getPackets().sendGameMessage(
							"That rock is currently unavailable.");
				if (id == 2491)
					player.getActionManager()
					.setAction(
							new EssenceMining(
									object,
									player.getSkills().getLevel(
											Skills.MINING) < 30 ? EssenceDefinitions.Rune_Essence
													: EssenceDefinitions.Pure_Essence));
				else if (id == 2478)
					Runecrafting.craftEssence(player, 556, 1, 5, false, 11, 2,
							22, 3, 34, 4, 44, 5, 55, 6, 66, 7, 77, 88, 9, 99,
							10);
				else if (id == 2479)
					Runecrafting.craftEssence(player, 558, 2, 5.5, false, 14,
							2, 28, 3, 42, 4, 56, 5, 70, 6, 84, 7, 98, 8);
				else if (id == 2480)
					Runecrafting.craftEssence(player, 555, 5, 6, false, 19, 2,
							38, 3, 57, 4, 76, 5, 95, 6);
				else if (id == 2481)
					Runecrafting.craftEssence(player, 557, 9, 6.5, false, 26,
							2, 52, 3, 78, 4);
				else if (id == 2482)
					Runecrafting.craftEssence(player, 554, 14, 7, false, 35, 2,
							70, 3);
				else if (id == 2483)
					Runecrafting.craftEssence(player, 559, 20, 7.5, false, 46,
							2, 92, 3);
				else if (id == 2484)
					Runecrafting.craftEssence(player, 564, 27, 8, true, 59, 2);
				else if (id == 2487)
					Runecrafting
					.craftEssence(player, 562, 35, 8.5, true, 74, 2);
				else if (id == 17010)
					Runecrafting.craftEssence(player, 9075, 40, 8.7, true, 82,
							2);
				else if (id == 2486)
					Runecrafting.craftEssence(player, 561, 45, 9, true, 91, 2);
				else if (id == 2485)
					Runecrafting.craftEssence(player, 563, 50, 9.5, true);
				else if (id == 2488)
					Runecrafting.craftEssence(player, 560, 65, 10, true);
				else if (id == 30624)
					Runecrafting.craftEssence(player, 565, 77, 10.5, true);
				else if (id == 57171)
					player.getActionManager().setAction(new LavaFlowMine(object));
				else if (id == 57180)
					player.getActionManager().setAction(new LavaFlowMine(object));
				else if (id == 57169)
					player.getActionManager().setAction(new LavaFlowMine(object));
				else if (id == 57179)
					player.getActionManager().setAction(new LavaFlowMine(object));
				else if (id == 57172)
					player.getActionManager().setAction(new LavaFlowMine(object));
				else if (id == 57170)
					player.getActionManager().setAction(new LavaFlowMine(object));
				else if (id == 57176)
					player.getActionManager().setAction(new LavaFlowMine(object));
				else if (id == 57177)
					player.getActionManager().setAction(new LavaFlowMine(object));
				else if (id == 2452) {
					int hatId = player.getEquipment().getHatId();
					if (hatId == Runecrafting.AIR_TIARA
							|| hatId == Runecrafting.OMNI_TIARA
							|| player.getInventory().containsItem(1438, 1))
						Runecrafting.enterAirAltar(player);
				} else if (id == 2455) {
					int hatId = player.getEquipment().getHatId();
					if (hatId == Runecrafting.EARTH_TIARA
							|| hatId == Runecrafting.OMNI_TIARA
							|| player.getInventory().containsItem(1440, 1))
						Runecrafting.enterEarthAltar(player);
				} else if (id == 2456) {
					int hatId = player.getEquipment().getHatId();
					if (hatId == Runecrafting.FIRE_TIARA
							|| hatId == Runecrafting.OMNI_TIARA
							|| player.getInventory().containsItem(1442, 1))
						Runecrafting.enterFireAltar(player);
				} else if (id == 2454) {
					int hatId = player.getEquipment().getHatId();
					if (hatId == Runecrafting.WATER_TIARA
							|| hatId == Runecrafting.OMNI_TIARA
							|| player.getInventory().containsItem(1444, 1))
						Runecrafting.enterWaterAltar(player);
				} else if (id == 2457) {
					int hatId = player.getEquipment().getHatId();
					if (hatId == Runecrafting.BODY_TIARA
							|| hatId == Runecrafting.OMNI_TIARA
							|| player.getInventory().containsItem(1446, 1))
						Runecrafting.enterBodyAltar(player);
				} else if (id == 2453) {
					int hatId = player.getEquipment().getHatId();
					if (hatId == Runecrafting.MIND_TIARA
							|| hatId == Runecrafting.OMNI_TIARA
							|| player.getInventory().containsItem(1448, 1))
						Runecrafting.enterMindAltar(player);
				} else if (id == 47120) { // zaros altar
					// recharge if needed
					if (player.getPrayer().getPrayerpoints() < player
							.getSkills().getLevelForXp(Skills.PRAYER) * 10) {
						player.lock(12);
						player.setNextAnimation(new Animation(12563));
						player.getPrayer().setPrayerpoints(
								(int) ((player.getSkills().getLevelForXp(
										Skills.PRAYER) * 10) * 1.15));
						player.getPrayer().refreshPrayerPoints();
					}
					player.getDialogueManager().startDialogue("ZarosAltar");
				} else if (id == 19222) 
					Falconry.beginFalconry(player);
				/*if (id == 38279)
				player.getDialogueManager().startDialogue("RunespanPortalD");
				player.getInventory().addItem(24227, 1000);*/
				if (id == 36786)
					player.getDialogueManager().startDialogue("Banker", 4907);
				else if (id == 42377 || id == 42378)
					player.getDialogueManager().startDialogue("Banker", 2759);
				else if (id == 42217 || id == 782 || id == 34752)
					player.getDialogueManager().startDialogue("Banker", 553);
				else if (id == 57437)
					player.getBank().openBank();
				else if (id == 42425 && object.getX() == 3220
						&& object.getY() == 3222) { // zaros portal
					player.useStairs(10256, new WorldTile(3353, 3416, 0), 4, 5,
							"And you find yourself into a digsite.");
					player.addWalkSteps(3222, 3223, -1, false);
					player.getPackets().sendGameMessage(
							"You examine portal and it aborves you...");
				} else if (id == 38698) {
					if (player.getSkills().getCombatLevel() < 30) {
					}else {
						player.setNextWorldTile(new WorldTile(2815, 5511, 0));
						player.getControlerManager().startControler("SafeFree");
					}
					/*} else if (id == 38700) {
                	if (player.getSkills().getCombatLevel() < 30) {
                		}else {
                		player.setNextWorldTile(new WorldTile(3000, 9676, 0));
                		player.getPackets().closeInterface(player.getInterfaceManager().hasRezizableScreen() ? 10 : 19, 789);
                		}*/
					/*} else if (id == 9356)
    					player.getDialogueManager().startDialogue("FightCavesDialogue", 1);*/
				} else if (id == 9356) 
					FightCaves.enterFightCaves(player);
				else if (id == 68107)
					player.getControlerManager().startControler("FightKilnControler", 1);
				else if (id == 68223)
					FightPits.enterLobby(player, false);
				else if (id == 20849)
					player.setNextWorldTile(new WorldTile(2248, 3300, 0));
				else if (id == 4954) {
					Long rotstimer = (Long) player.getTemporaryAttributtes().get("rotstimer");
					if (rotstimer != null && rotstimer + 60000 > Utils.currentTimeMillis()) {
						player.getPackets().sendGameMessage("You can only pull this lever once per minute.");
						return;
					}
					WorldTile ahspot = new WorldTile(3186, 4621, 0);
					WorldTile dhspot = new WorldTile(3188, 4618, 0);
					WorldTile vspot = new WorldTile(3184, 4618, 0);
					WorldTile tspot = new WorldTile(3184, 4622, 0);
					WorldTile gspot = new WorldTile(3188, 4622, 0);
					WorldTile kspot = new WorldTile(3186, 4624, 0);
					//player.getInventory().deleteItem(991, 1);
					player.getDialogueManager().startDialogue("SimpleNPCMessage", 2025, "You dare disturb us you fool!?.<br>We will show you the meaning of true power!");
					World.spawnNPC(2025, ahspot, -1, true, true);
					World.spawnNPC(2026, dhspot, -1, true, true);
					World.spawnNPC(2027, vspot, -1, true, true);
					World.spawnNPC(2028, tspot, -1, true, true);
					World.spawnNPC(2029, gspot, -1, true, true);
					World.spawnNPC(2030, kspot, -1, true, true);
				}

				if (((id >= 15477 && id <= 15482) || id == 93284)) {
					House.enterHousePortal(player);	
				}

				/**
				 * Start of Adrougne Farming
				 */
				else if (object.getId() == 8555 && player.allotmentA == 0) { //TODO Finish all the Ardougne crops. 
					ArdyFarming.useRakeAA(player, 713);
				} else if (object.getId() == 8555 && player.allotmentA == 1 && player.canHarvestAA == true) {

					player.setNextAnimation(new Animation(2272));
					player.getInventory().addItem(1942, 4);
					player.getSkills().addXp(Skills.FARMING, 180);
					player.canHarvestAA = false;
					player.hasHarvestedAA = false;
					player.hasPlantedAA = false;
					player.allotmentA = 0;
					player.getPackets().sendConfigByFile(713, 3);

				} else if (object.getId() == 8555 && player.canHarvestAA == true && player.allotmentA == 2) {

					player.setNextAnimation(new Animation(2272));
					player.getInventory().addItem(5982, 4);
					player.getSkills().addXp(Skills.FARMING, 400);
					player.canHarvestAA = false;
					player.hasHarvestedAA = false;
					player.hasPlantedAA = false;
					player.allotmentA = 0;
					player.getPackets().sendConfigByFile(713, 3);

				} else if (object.getId() == 8555 && player.canHarvestAA == true && player.allotmentA == 3) {

					player.setNextAnimation(new Animation(2272));
					player.getInventory().addItem(5986, 4);
					player.getSkills().addXp(Skills.FARMING, 700);
					player.canHarvestAA = false;
					player.hasHarvestedAA = false;
					player.hasPlantedAA = false;
					player.allotmentA = 0;
					player.getPackets().sendConfigByFile(713, 3);

				}

				else if (object.getId() == 8554) {
					player.getPackets().sendConfigByFile(712, 73);
				}


				else if (id == 46500 && object.getX() == 3351
						&& object.getY() == 3415) { // zaros portal
					player.useStairs(-1, new WorldTile(
							Settings.RESPAWN_PLAYER_LOCATION.getX(),
							Settings.RESPAWN_PLAYER_LOCATION.getY(),
							Settings.RESPAWN_PLAYER_LOCATION.getPlane()), 2, 3,
							"You found your way back to home.");
					player.addWalkSteps(3351, 3415, -1, false);
				} else if (id == 9293) {
					if (player.getSkills().getLevel(Skills.AGILITY) < 1) {
						player.getPackets()
						.sendGameMessage(
								"You need an agility level of 1 to use this obstacle.",
								true);
						return;
					}
					int x = player.getX() == 2886 ? 2892 : 2886;
					WorldTasksManager.schedule(new WorldTask() {
						int count = 0;



						@Override
						public void run() {
							player.setNextAnimation(new Animation(844));
							if (count++ == 1)
								stop();
						}

					}, 0, 0);
					player.setNextForceMovement(new ForceMovement(
							new WorldTile(x, 9799, 0), 3,
							player.getX() == 2886 ? 1 : 3));
					player.useStairs(-1, new WorldTile(x, 9799, 0), 3, 4);
				}else if (id == 29370 && (object.getX() == 3150 || object.getX() == 3153) && object.getY() == 9906) { // edgeville dungeon cut
					if (player.getSkills().getLevel(Skills.AGILITY) < 53) {
						player.getPackets().sendGameMessage("You need an agility level of 53 to use this obstacle.");
						return;
					}
					final boolean running = player.getRun();
					player.setRunHidden(false);
					player.lock(8);
					player.addWalkSteps(x == 3150 ?  3155 : 3149, 9906, -1, false);
					player.getPackets().sendGameMessage("You pulled yourself through the pipes.", true);
					WorldTasksManager.schedule(new WorldTask() {
						boolean secondloop;

						@Override
						public void run() {
							if (!secondloop) {
								secondloop = true;
								player.getAppearence().setRenderEmote(295);
							} else {
								player.getAppearence().setRenderEmote(2699);
								player.setRunHidden(running);
								player.getSkills().addXp(Skills.AGILITY, 7);
								stop();
							}
						}
					}, 0, 5);
				}
				//start forinthry dungeon
				else if (id == 18341 && object.getX() == 3036 && object.getY() == 10172) 
					player.useStairs(-1, new WorldTile(3039, 3765, 0), 0, 1);
				else if (id == 20599 && object.getX() == 3038 && object.getY() == 3761) 
					player.useStairs(-1, new WorldTile(3037, 10171, 0), 0, 1);
				else if (id == 18342 && object.getX() == 3075 && object.getY() == 10057) 
					player.useStairs(-1, new WorldTile(3071, 3649, 0), 0, 1);
				else if (id == 20600 && object.getX() == 3072 && object.getY() == 3648)
					player.useStairs(-1, new WorldTile(3077, 10058, 0), 0, 1);
				//nomads requiem
				else if (id == 18425)//NOMAD CHEST
					;
				else if (id == 42219)  {
					player.useStairs(-1, new WorldTile(1886, 3178, 0), 0, 1);
				} else if (id == 8689) 
					player.getActionManager().setAction(new CowMilkingAction());
				else if (id == 42220) 
					player.useStairs(-1, new WorldTile(3082, 3475, 0), 0, 1);
				//start falador mininig
				else if (id == 30942 && object.getX() == 3019 && object.getY() == 3450) 
					player.useStairs(828, new WorldTile(3020, 9850, 0), 1, 2);
				else if (id == 6226 && object.getX() == 3019 && object.getY() == 9850) 
					player.useStairs(833, new WorldTile(3018, 3450, 0), 1, 2);
				else if (id == 31002) 
					player.useStairs(833, new WorldTile(2998, 3452, 0), 1, 2);
				else if (id == 31012) 
					player.useStairs(828, new WorldTile(2996, 9845, 0), 1, 2);
				else if (id == 30943 && object.getX() == 3059 && object.getY() == 9776) 
					player.useStairs(-1, new WorldTile(3061, 3376, 0), 0, 1);
				else if (id == 30944 && object.getX() == 3059 && object.getY() == 3376) 
					player.useStairs(-1, new WorldTile(3058, 9776, 0), 0, 1);
				else if (id == 2112 && object.getX() == 3046 && object.getY() == 9756) {
					if(player.getSkills().getLevelForXp(Skills.MINING) < 60) {
						player.getDialogueManager().startDialogue("SimpleNPCMessage", MiningGuildDwarf.getClosestDwarfID(player),"Sorry, but you need level 60 Mining to go in there.");
						return;
					}
					WorldObject openedDoor = new WorldObject(object.getId(),
							object.getType(), object.getRotation() - 1,
							object.getX() , object.getY() + 1, object.getPlane());
					if (World.removeTemporaryObject(object, 1200, false)) {
						World.spawnTemporaryObject(openedDoor, 1200, false);
						player.lock(2);
						player.stopAll();
						player.addWalkSteps(
								3046, player.getY() > object.getY() ? object.getY()
										: object.getY() + 1 , -1, false);
					}
				}else if (id == 2113) {
					if(player.getSkills().getLevelForXp(Skills.MINING) < 60) {
						player.getDialogueManager().startDialogue("SimpleNPCMessage", MiningGuildDwarf.getClosestDwarfID(player),"Sorry, but you need level 60 Mining to go in there.");
						return;
					}
					player.useStairs(-1, new WorldTile(3021, 9739, 0), 0, 1);
				}else if (id == 6226  && object.getX() == 3019 && object.getY() == 9740) 
					player.useStairs(828, new WorldTile(3019, 3341, 0), 1, 2);
				else if (id == 6226  && object.getX() == 3019 && object.getY() == 9738) 
					player.useStairs(828, new WorldTile(3019, 3337, 0), 1, 2);
				else if (id == 6226  && object.getX() == 3018 && object.getY() == 9739) 
					player.useStairs(828, new WorldTile(3017, 3339, 0), 1, 2);
				else if (id == 6226  && object.getX() == 3020 && object.getY() == 9739) 
					player.useStairs(828, new WorldTile(3021, 3339, 0), 1, 2);
				else if (id == 30963)
					player.getBank().openBank();
				else if (id == 6045)
					player.getPackets().sendGameMessage("You search the cart but find nothing.");
				else if (id == 5906) {
					if (player.getSkills().getLevel(Skills.AGILITY) < 42) {
						player.getPackets().sendGameMessage("You need an agility level of 42 to use this obstacle.");
						return;
					}
					player.lock();
					WorldTasksManager.schedule(new WorldTask() {
						int count = 0;

						@Override
						public void run() {
							if(count == 0) {
								player.setNextAnimation(new Animation(2594));
								WorldTile tile = new WorldTile(object.getX() + (object.getRotation() == 2 ? -2 : +2), object.getY(), 0);
								player.setNextForceMovement(new ForceMovement(tile, 4, Utils.getMoveDirection(tile.getX() - player.getX(), tile.getY() - player.getY())));
							}else if (count == 2) {
								WorldTile tile = new WorldTile(object.getX() + (object.getRotation() == 2 ? -2 : +2), object.getY(), 0);
								player.setNextWorldTile(tile);
							}else if (count == 5) {
								player.setNextAnimation(new Animation(2590));
								WorldTile tile = new WorldTile(object.getX() + (object.getRotation() == 2 ? -5 : +5), object.getY(), 0);
								player.setNextForceMovement(new ForceMovement(tile, 4, Utils.getMoveDirection(tile.getX() - player.getX(), tile.getY() - player.getY())));
							}else if (count == 7) {
								WorldTile tile = new WorldTile(object.getX() + (object.getRotation() == 2 ? -5 : +5), object.getY(), 0);
								player.setNextWorldTile(tile);
							}else if (count == 10) {
								player.setNextAnimation(new Animation(2595));
								WorldTile tile = new WorldTile(object.getX() + (object.getRotation() == 2 ? -6 : +6), object.getY(), 0);
								player.setNextForceMovement(new ForceMovement(tile, 4, Utils.getMoveDirection(tile.getX() - player.getX(), tile.getY() - player.getY())));
							}else if (count == 12) {						 
								WorldTile tile = new WorldTile(object.getX() + (object.getRotation() == 2 ? -6 : +6), object.getY(), 0);
								player.setNextWorldTile(tile);
							}else if (count == 14) {
								stop();
								player.unlock();
							}
							count++;
						}

					}, 0, 0);
					//BarbarianOutpostAgility start
				}else if (id == 20210) 
					BarbarianOutpostAgility.enterObstaclePipe(player, object);
				else if (id == 43526)
					BarbarianOutpostAgility.swingOnRopeSwing(player, object);
				else if (id == 43595 && x == 2550 && y == 3546)
					BarbarianOutpostAgility.walkAcrossLogBalance(player, object);
				else if (id == 20211 && x == 2538 && y == 3545)
					BarbarianOutpostAgility.climbObstacleNet(player, object);
				else if (id == 2302 && x == 2535 && y == 3547)
					BarbarianOutpostAgility.walkAcrossBalancingLedge(player, object);
				else if (id == 43533)
					BarbarianOutpostAgility.runUpWall(player, object);
				else if (id == 43597) 
					BarbarianOutpostAgility.climbUpWall(player, object);
				else if (id == 43587)
					BarbarianOutpostAgility.fireSpringDevice(player, object);
				else if (id == 43527)
					BarbarianOutpostAgility.crossBalanceBeam(player, object);
				else if (id == 43531)
					BarbarianOutpostAgility.jumpOverGap(player, object);
				else if (id == 43532)
					BarbarianOutpostAgility.slideDownRoof(player, object);

				//rock living caverns
				else if (id == 45077) {
					player.lock();
					if(player.getX() != object.getX() || player.getY() != object.getY())
						player.addWalkSteps(object.getX(), object.getY(), -1, false);
					WorldTasksManager.schedule(new WorldTask() {

						private int count;
						@Override
						public void run() {
							if(count == 0) {
								player.setNextFaceWorldTile(new WorldTile(object.getX() -1, object.getY(), 0));
								player.setNextAnimation(new Animation(12216));
								player.unlock();
							}else if(count == 2) {
								player.setNextWorldTile(new WorldTile(3651, 5122, 0));
								player.setNextFaceWorldTile(new WorldTile(3651, 5121, 0));
								player.setNextAnimation(new Animation(12217));
							}else if (count == 3) {
								//TODO find emote
								//player.getPackets().sendObjectAnimation(new WorldObject(45078, 0, 3, 3651, 5123, 0), new Animation(12220));
							}else if(count == 5) {
								player.unlock();
								stop();
							}
							count++;
						}

					}, 1, 0);
				}else if (id == 45076)
					player.getActionManager().setAction(new Mining(object, RockDefinitions.LRC_Gold_Ore));
				else if (id == 5999)
					player.getActionManager().setAction(new Mining(object, RockDefinitions.LRC_Coal_Ore));
				else if (id == 45078)
					player.useStairs(2413, new WorldTile(3012, 9832, 0), 2, 2);
				else if (id == 45079)
					player.getBank().openDepositBox();
				//champion guild
				else if (id == 24357 && object.getX() == 3188 && object.getY() == 3355) 
					player.useStairs(-1, new WorldTile(3189, 3354, 1), 0, 1);
				else if (id == 24359 && object.getX() == 3188 && object.getY() == 3355) 
					player.useStairs(-1, new WorldTile(3189, 3358, 0), 0, 1);
				else if (id == 1805 && object.getX() == 3191 && object.getY() == 3363) {
					WorldObject openedDoor = new WorldObject(object.getId(),
							object.getType(), object.getRotation() - 1,
							object.getX() , object.getY(), object.getPlane());
					if (World.removeTemporaryObject(object, 1200, false)) {
						World.spawnTemporaryObject(openedDoor, 1200, false);
						player.lock(2);
						player.stopAll();
						player.addWalkSteps(
								3191, player.getY() >= object.getY() ? object.getY() - 1
										: object.getY() , -1, false);
						if(player.getY() >= object.getY())
							player.getDialogueManager().startDialogue("SimpleNPCMessage", 198, "Greetings bolt adventurer. Welcome to the guild of", "Champions.");
					}
				}
				//start of varrock dungeon
				else if (id == 29355 && object.getX() == 3230 && object.getY() == 9904) //varrock dungeon climb to bear
					player.useStairs(828, new WorldTile(3229, 3503, 0), 1, 2);
				else if (id == 24264)
					player.useStairs(833, new WorldTile(3229, 9904, 0), 1, 2);
				else if (id == 24366)
					player.useStairs(828, new WorldTile(3237, 3459, 0), 1, 2);
				else if (id == 882 && object.getX() == 3237 && object.getY() == 3458) 
					player.useStairs(833, new WorldTile(3237, 9858, 0), 1, 2);
				else if (id == 29355 && object.getX() == 3097 && object.getY() == 9867) //edge dungeon climb
					player.useStairs(828, new WorldTile(3096, 3468, 0), 1, 2);
				else if (id == 26934)
					player.useStairs(833, new WorldTile(3097, 9868, 0), 1, 2);
				else if (id == 29355 && object.getX() == 3088 && object.getY() == 9971)
					player.useStairs(828, new WorldTile(3087, 3571, 0), 1, 2);
				else if (id == 65453)
					player.useStairs(833, new WorldTile(3089, 9971, 0), 1, 2);
				else if (id == 12389 && object.getX() == 3116 && object.getY() == 3452)
					player.useStairs(833, new WorldTile(3117, 9852, 0), 1, 2);
				else if (id == 29355 && object.getX() == 3116 && object.getY() == 9852)
					player.useStairs(833, new WorldTile(3115, 3452, 0), 1, 2);
				else if (Wilderness.isDitch(id)) {// wild ditch
					player.getDialogueManager().startDialogue(
							"WildernessDitch", object);
				} else if (id == 42611) {// Magic Portal
					player.getDialogueManager().startDialogue("MagicPortal");
				} else if (object.getDefinitions().name.equalsIgnoreCase("Obelisk") && object.getY() > 3525) {
					//Who the fuck removed the controler class and the code from SONIC!!!!!!!!!!
					//That was an hour of collecting coords :fp: Now ima kill myself.
				} else if (id == 27254) {// Edgeville portal
					player.getPackets().sendGameMessage(
							"You enter the portal...");
					player.useStairs(10584, new WorldTile(3087, 3488, 0), 2, 3,
							"..and are transported to Edgeville.");
					player.addWalkSteps(1598, 4506, -1, false);
				} else if (id == 12202) {// mole entrance
					if(!player.getInventory().containsItem(952, 1)) {
						player.getPackets().sendGameMessage("You need a spade to dig this.");
						return;
					}
					if(player.getX() != object.getX() || player.getY() != object.getY()) {
						player.lock();
						player.addWalkSteps(object.getX(), object.getY());
						WorldTasksManager.schedule(new WorldTask() {
							@Override
							public void run() {
								InventoryOptionsHandler.dig(player);
							}

						}, 1);
					}else
						InventoryOptionsHandler.dig(player);
				} else if (id == 12230 && object.getX() == 1752 && object.getY() == 5136) {// mole exit 
					player.setNextWorldTile(new WorldTile(2986, 3316, 0));
				} else if (id == 15522) {// portal sign
					if (player.withinDistance(new WorldTile(1598, 4504, 0), 1)) {// PORTAL
						// 1
						player.getInterfaceManager().sendInterface(327);
						player.getPackets().sendIComponentText(327, 13,
								"Edgeville");
						player.getPackets()
						.sendIComponentText(
								327,
								14,
								"This portal will take you to edgeville. There "
										+ "you can multi pk once past the wilderness ditch.");
					}
					if (player.withinDistance(new WorldTile(1598, 4508, 0), 1)) {// PORTAL
						// 2
						player.getInterfaceManager().sendInterface(327);
						player.getPackets().sendIComponentText(327, 13,
								"Mage Bank");
						player.getPackets()
						.sendIComponentText(
								327,
								14,
								"This portal will take you to the mage bank. "
										+ "The mage bank is a 1v1 deep wilderness area.");
					}
					if (player.withinDistance(new WorldTile(1598, 4513, 0), 1)) {// PORTAL
						// 3
						player.getInterfaceManager().sendInterface(327);
						player.getPackets().sendIComponentText(327, 13,
								"Magic's Portal");
						player.getPackets()
						.sendIComponentText(
								327,
								14,
								"This portal will allow you to teleport to areas that "
										+ "will allow you to change your magic spell book.");
					}
				} else if (id == 38811 || id == 37929) {// corp beast
					if (object.getX() == 2971 && object.getY() == 4382)
						player.getInterfaceManager().sendInterface(650);
					else if (object.getX() == 2918 && object.getY() == 4382) {
						player.stopAll();
						player.setNextWorldTile(new WorldTile(
								player.getX() == 2921 ? 2917 : 2921, player
										.getY(), player.getPlane()));
					}
				} else if (id == 37928 && object.getX() == 2883
						&& object.getY() == 4370) {
					player.stopAll();
					player.setNextWorldTile(new WorldTile(3214, 3782, 0));
					player.getControlerManager().startControler("Wilderness");
				} else if (id == 38815 && object.getX() == 3209
						&& object.getY() == 3780 && object.getPlane() == 0) {
					if (player.getSkills().getLevelForXp(Skills.WOODCUTTING) < 37
							|| player.getSkills().getLevelForXp(Skills.MINING) < 45
							|| player.getSkills().getLevelForXp(
									Skills.SUMMONING) < 23
							|| player.getSkills().getLevelForXp(
									Skills.FIREMAKING) < 47
							|| player.getSkills().getLevelForXp(Skills.PRAYER) < 55) {
						player.getPackets()
						.sendGameMessage(
								"You need 23 Summoning, 37 Woodcutting, 45 Mining, 47 Firemaking and 55 Prayer to enter this dungeon.");
						return;
					}
					player.stopAll();
					player.setNextWorldTile(new WorldTile(2885, 4372, 2));
					player.getControlerManager().forceStop();
					// TODO all reqs, skills not added
				} else if(id == 48803 && player.isKalphiteLairSetted()) {
					player.setNextWorldTile(new WorldTile(3508, 9494, 0));
				} else if(id == 48802 && player.isKalphiteLairEntranceSetted()) {
					player.setNextWorldTile(new WorldTile(3483, 9510, 2));
				} else if(id == 3829) {
					if(object.getX() == 3483 && object.getY() == 9510) {
						player.useStairs(828, new WorldTile(3226, 3108, 0), 1, 2);
					}
				} else if(id == 3832) {
					if(object.getX() == 3508 && object.getY() == 9494) {
						player.useStairs(828, new WorldTile(3509, 9496, 2), 1, 2);
					}
				} else if (id == 9369) {
					player.getControlerManager().startControler("FightPits");
				} else if (id == 54019 || id == 54020 || id == 55301)
					PkRank.showRanks(player);
				else if (id == 1817 && object.getX() == 2273
						&& object.getY() == 4680) { // kbd lever
					Magic.pushLeverTeleport(player, new WorldTile(3067, 10254,
							0));
				} else if (id == 1816 && object.getX() == 3067
						&& object.getY() == 10252) { // kbd out lever
					Magic.pushLeverTeleport(player,
							new WorldTile(2273, 4681, 0));
				} else if (id == 32015 && object.getX() == 3069
						&& object.getY() == 10256) { // kbd stairs
					player.useStairs(828, new WorldTile(3017, 3848, 0), 1, 2);
					player.getControlerManager().startControler("Wilderness");
				} else if (id == 1765 && object.getX() == 3017
						&& object.getY() == 3849) { // kbd out stairs
					player.stopAll();
					player.setNextWorldTile(new WorldTile(3069, 10255, 0));
					player.getControlerManager().forceStop();
				} else if (id == 5959) {
					Magic.pushLeverTeleport(player,
							new WorldTile(2539, 4712, 0));
				} else if (id == 5960) {
					Magic.pushLeverTeleport(player,
							new WorldTile(3089, 3957, 0));
				} else if (id == 1814) {
					Magic.pushLeverTeleport(player,
							new WorldTile(3155, 3923, 0));
				} else if (id == 1815) {
					Magic.pushLeverTeleport(player,
							new WorldTile(2561, 3311, 0));
				} else if (id == 62675)
					player.getCutscenesManager().play("DTPreview");
				else if (id == 62681)
					player.getDominionTower().viewScoreBoard();
				else if (id == 62678 || id == 62679)
					player.getDominionTower().openModes();
				else if (id == 62688)
					player.getDialogueManager().startDialogue("DTClaimRewards");
				else if (id == 62677)
					player.getDominionTower().talkToFace();
				else if (id == 62680)
					player.getDominionTower().openBankChest();
				else if (id == 5055)
					player.setNextWorldTile(new WorldTile(3195, 4570, 0));
				else if (id == 48797)
					player.useStairs(-1, new WorldTile(3877, 5526, 1), 0, 1);
				else if (id == 48798)
					player.useStairs(-1, new WorldTile(3246, 3198, 0), 0, 1);
				else if (id == 48678 && x == 3858 && y == 5533)
					player.useStairs(-1, new WorldTile(3861, 5533, 0), 0, 1);
				else if (id == 48678 && x == 3858 && y == 5543)
					player.useStairs(-1, new WorldTile(3861, 5543, 0), 0, 1);
				else if (id == 48678 && x == 3858 && y == 5533)
					player.useStairs(-1, new WorldTile(3861, 5533, 0), 0, 1);
				else if (id == 48677 && x == 3858 && y == 5543)
					player.useStairs(-1, new WorldTile(3856, 5543, 1), 0, 1);
				else if (id == 48677 && x == 3858 && y == 5533)
					player.useStairs(-1, new WorldTile(3856, 5533, 1), 0, 1);
				else if (id == 48679)
					player.useStairs(-1, new WorldTile(3875, 5527, 1), 0, 1);
				else if (id == 48688)
					player.useStairs(-1, new WorldTile(3972, 5565, 0), 0, 1);
				else if (id == 48683)
					player.useStairs(-1, new WorldTile(3868, 5524, 0), 0, 1);
				else if (id == 48682)
					player.useStairs(-1, new WorldTile(3869, 5524, 0), 0, 1);
				else if (id == 62676) { // dominion exit
					player.useStairs(-1, new WorldTile(3374, 3093, 0), 0, 1);
				} else if (id == 62674) { // dominion entrance
					player.useStairs(-1, new WorldTile(3744, 6405, 0), 0, 1);
				} else if(id == 3192) {
					PkRank.showRanks(player);
				} else if (id == 65349) {
					player.useStairs(-1, new WorldTile(3044, 10325, 0), 0, 1);
				} else if (id == 32048 && object.getX() == 3043 &&  object.getY() == 10328) {
					player.useStairs(-1, new WorldTile(3045, 3927, 0), 0, 1);
				} else if(id == 26194) {
					player.getDialogueManager().startDialogue("PartyRoomLever");
				}else if (id == 61190 || id == 61191 || id == 61192 || id == 61193) {
					if (objectDef.containsOption(0, "Chop down"))
						player.getActionManager().setAction(
								new Woodcutting(object,
										TreeDefinitions.NORMAL));
				} else if(id == 20573)
					player.getControlerManager().startControler("RefugeOfFear");
				//crucible
				else if (id == 67050)
					player.useStairs(-1, new WorldTile(3359, 6110, 0), 0, 1);
				else if (id == 67053)
					player.useStairs(-1, new WorldTile(3120, 3519, 0), 0, 1);
				else if (id == 67051)
					player.getDialogueManager().startDialogue("Marv", false);
				else if (id == 67052)
					Crucible.enterCrucibleEntrance(player);
				else if (id == 9294) {
					if (object.getX() == 2879 && object.getY() == 9813) {
						if (player.getSkills().getLevel(Skills.AGILITY) < 80) {
							player.getPackets()
							.sendGameMessage(
									"You need an agility level of 80 to use this obstacle.");
							return;
						} else {
							player.useStairs(1115, new WorldTile(2878, 9812,
									0), 1, 2);
						}
					}
				} else if (id == 87530 || id == 87518) {
						player.getActionManager().setAction(
								new Woodcutting(object,
										TreeDefinitions.ELDER_TREE));
				}
				else {
					switch (object.getId()) {
					/**
					 * Mining Nulled Rocks
					 */
					
					case 2311:
						player.getActionManager().setAction(
								new Mining(object, RockDefinitions.Silver_Ore));
						break;
					
					/**
					 * End of mining nulled rocks
					 */
					case 20602:
						player.setNextWorldTile(new WorldTile(3564, 9501, 0));
						break;
					case 56867:
						player.setNextWorldTile(new WorldTile(3018, 3404, 0));
						break;
					case 11005:
						if (player.getY() >= 4956) {
							player.sm("There is no escape!");
						} else {
							player.setNextWorldTile(new WorldTile(player.getX(), player.getY() + 2, 0));
						}
						break;
					case 12352:
						if (player.getX() <= 3561) {
							player.sm("There is no escape!");
						} else {
							player.setNextWorldTile(new WorldTile(player.getX() - 2, player.getY(), 0));
						}
						break;
					}
					switch (objectDef.name.toLowerCase()) {
					case "trapdoor":
					case "manhole":
						if (objectDef.containsOption(0, "Open")) {
							WorldObject openedHole = new WorldObject(object.getId()+1,
									object.getType(), object.getRotation(), object.getX(),
									object.getY(), object.getPlane());
							//if (World.removeTemporaryObject(object, 60000, true)) {
							player.faceObject(openedHole);
							World.spawnTemporaryObject(openedHole, 60000, true);
							//}
						}
						break;
						/*case "closed chest":
						if (objectDef.containsOption(0, "Open")) {
							player.setNextAnimation(new Animation(536));
							player.lock(2);
							WorldObject openedChest = new WorldObject(object.getId()+1,
									object.getType(), object.getRotation(), object.getX(),
									object.getY(), object.getPlane());
							//if (World.removeTemporaryObject(object, 60000, true)) {
							player.faceObject(openedChest);
							World.spawnTemporaryObject(openedChest, 60000, true);
						}*/
					case "open chest":
						if (objectDef.containsOption(0, "Search")) 
							player.getPackets().sendGameMessage("You search the chest but find nothing.");
						break;
					case "spiderweb":
						if(object.getRotation() == 2) {
							player.lock(2);
							if (Utils.getRandom(1) == 0) {
								player.addWalkSteps(player.getX(), player.getY() < y ? object.getY()+2 : object.getY() - 1, -1, false);
								player.getPackets().sendGameMessage("You squeeze though the web.");
							} else
								player.getPackets().sendGameMessage(
										"You fail to squeeze though the web; perhaps you should try again.");
						}
						break;
					case "web":
						if (objectDef.containsOption(0, "Slash")) {
							player.setNextAnimation(new Animation(PlayerCombat
									.getWeaponAttackEmote(player.getEquipment()
											.getWeaponId(), player
											.getCombatDefinitions()
											.getAttackStyle(), player)));
							slashWeb(player, object);
						}
						break;
					case "anvil":
						ForgingBar bar = ForgingBar.getBar(player);
						if (bar != null)
							ForgingInterface.sendSmithingInterface(player, bar);
						else
							player.getPackets().sendGameMessage("You have no bars which you have smithing level to use."); 
						break;
					case "crashed star":
						if (objectDef.containsOption(0, "Mine"))
							ShootingStars.mine(player, object);
						break;
					case "rocks":
					case "stone":
						if (objectDef.containsOption(0, "Mine"))
							player.getPackets().sendGameMessage("That rock is currently unavailable.");
						break;
					case "seren stone":
						player.getActionManager().setAction(new SerenStones(object));
						break;
					case "tin ore rocks":
						player.getActionManager().setAction(
								new Mining(object, RockDefinitions.Tin_Ore));
						break;
					case "gold ore rocks":
						player.getActionManager().setAction(
								new Mining(object, RockDefinitions.Gold_Ore));
						break;
					case "iron ore rocks":
						player.getActionManager().setAction(
								new Mining(object, RockDefinitions.Iron_Ore));
						break;
					case "silver ore rocks":
						player.getActionManager().setAction(
								new Mining(object, RockDefinitions.Silver_Ore));
						break;
					case "coal rocks":
						player.getActionManager().setAction(
								new Mining(object, RockDefinitions.Coal_Ore));
						break;
					case "clay rocks":
						player.getActionManager().setAction(
								new Mining(object, RockDefinitions.Clay_Ore));
						break;
					case "copper ore rocks":
						player.getActionManager().setAction(
								new Mining(object, RockDefinitions.Copper_Ore));
						break;
					case "adamantite ore rocks":
						player.getActionManager().setAction(
								new Mining(object, RockDefinitions.Adamant_Ore));
						break;
					case "runite ore rocks":
						player.getActionManager().setAction(
								new Mining(object, RockDefinitions.Runite_Ore));
						break;
					case "granite rocks":
						player.getActionManager().setAction(
								new Mining(object, RockDefinitions.Granite_Ore));
						break;
					case "sandstone rocks":
						player.getActionManager().setAction(
								new Mining(object, RockDefinitions.Sandstone_Ore));
						break;
					case "mithril ore rocks":
						player.getActionManager().setAction(new Mining(object, RockDefinitions.Mithril_Ore));
						break;
					case "divine runite rock":
						player.getActionManager().setAction(new DivineMining(object, DivineMining.RockDefinitions.DIVINE_RUNE_ORE));
						break;
					case "divine adamantite rock":
						player.getActionManager().setAction(new DivineMining(object, DivineMining.RockDefinitions.DIVINE_ADAMANTITE_ORE));
						break;
					case "divine mithril rock":
						player.getActionManager().setAction(new DivineMining(object, DivineMining.RockDefinitions.DIVINE_MITHRIL_ORE));
						break;
					case "divine coal rock":
						player.getActionManager().setAction(new DivineMining(object, DivineMining.RockDefinitions.DIVINE_COAL_ORE));
						break;
					case "divine iron rock":
						player.getActionManager().setAction(new DivineMining(object, DivineMining.RockDefinitions.DIVINE_IRON_ORE));
						break;
					case "divine bronze rock":
						player.getActionManager().setAction(new DivineMining(object, DivineMining.RockDefinitions.DIVINE_BRONZE_ORE));
						break;
					case "bank deposit box":
						if (objectDef.containsOption(0, "Deposit"))
							player.getBank().openDepositBox();
						break;

					case "bank":
					case "bank chest":
					case "bank booth":
					case "counter":
						if (objectDef.containsOption(0, "Bank") || objectDef.containsOption(0, "Use"))
							player.getBank().openBank();
						break;
						// Woodcutting start
					case "tree":
						if (objectDef.containsOption(0, "Chop down"))
							player.getActionManager().setAction(
									new Woodcutting(object,
											TreeDefinitions.NORMAL));
						break;
					case "evergreen":
						if (objectDef.containsOption(0, "Chop down"))
							player.getActionManager().setAction(
									new Woodcutting(object,
											TreeDefinitions.EVERGREEN));
						break;
					case "dead tree":
						if (objectDef.containsOption(0, "Chop down"))
							player.getActionManager().setAction(
									new Woodcutting(object,
											TreeDefinitions.DEAD));
						break;
					case "oak":
						if (objectDef.containsOption(0, "Chop down"))
							player.getActionManager()
							.setAction(
									new Woodcutting(object,
											TreeDefinitions.OAK));
						break;
					case "willow":
						if (objectDef.containsOption(0, "Chop down"))
							player.getActionManager().setAction(
									new Woodcutting(object,
											TreeDefinitions.WILLOW));
						break;
					case "maple tree":
						if (objectDef.containsOption(0, "Chop down"))
							player.getActionManager().setAction(
									new Woodcutting(object,
											TreeDefinitions.MAPLE));
						break;
					case "ivy":
						if (objectDef.containsOption(0, "Chop"))
							player.getActionManager()
							.setAction(
									new Woodcutting(object,
											TreeDefinitions.IVY));
						break;
					case "yew":
						if (objectDef.containsOption(0, "Chop down"))
							player.getActionManager()
							.setAction(
									new Woodcutting(object,
											TreeDefinitions.YEW));
						break;
					case "magic tree":
						if (objectDef.containsOption(0, "Chop down"))
							player.getActionManager().setAction(
									new Woodcutting(object,
											TreeDefinitions.MAGIC));
						break;
					case "elder tree":
						if (objectDef.containsOption(0, "Chop down"))
						player.getActionManager().setAction(
								new Woodcutting(object, 
										TreeDefinitions.ELDER_TREE));
						break;
					case "cursed magic tree":
						if (objectDef.containsOption(0, "Chop down"))
							player.getActionManager().setAction(
									new Woodcutting(object,
											TreeDefinitions.CURSED_MAGIC));
						break;
					case "divine magic tree":
						if (objectDef.containsOption(0, "Chop"))
							player.getActionManager().setAction(new DivineWoodcutting(object, DivineTreeDefinitions.DIVINE_MAGIC));
						break;
					case "divine tree":
						if (objectDef.containsOption(0, "Chop"))
							player.getActionManager().setAction(new DivineWoodcutting(object, DivineTreeDefinitions.DIVINE_NORMAL));
						break;
					case "divine oak tree":
						if (objectDef.containsOption(0, "Chop"))
							player.getActionManager().setAction(new DivineWoodcutting(object, DivineTreeDefinitions.DIVINE_OAK));
						break;
					case "divine willow tree":
						if (objectDef.containsOption(0, "Chop"))
							player.getActionManager().setAction(new DivineWoodcutting(object, DivineTreeDefinitions.DIVINE_WILLOW));
						break;
					case "divine maple tree":
						if (objectDef.containsOption(0, "Chop"))
							player.getActionManager().setAction(new DivineWoodcutting(object, DivineTreeDefinitions.DIVINE_MAPLE));
						break;
					case "divine yew tree":
						if (objectDef.containsOption(0, "Chop"))
							player.getActionManager().setAction(new DivineWoodcutting(object, DivineTreeDefinitions.DIVINE_YEW));
						break;
						// Woodcutting end
					case "gate":
					case "large door":
					case "metal door":
						if (object.getType() == 0
						&& objectDef.containsOption(0, "Open"))
							if(!handleGate(player, object))
								handleDoor(player, object);
						break;
					case "door":
					case "throne room door":
						if (object.getType() == 0
						&& (objectDef.containsOption(0, "Open") || objectDef
								.containsOption(0, "Unlock")))
							handleDoor(player, object);
						break;
					case "long hall door":
						if (object.getType() == 0
						&& (objectDef.containsOption(0, "Open") || objectDef
								.containsOption(0, "Unlock")))
							handleDoor(player, object);
						break;
					case "ladder":
						handleLadder(player, object, 1);
						break;
					case "staircase":
						handleStaircases(player, object, 1);
						break;
					case "small obelisk":
						if (objectDef.containsOption(0, "Renew-points")) {
							int summonLevel = player.getSkills().getLevelForXp(Skills.SUMMONING);
							if(player.getSkills().getLevel(Skills.SUMMONING) < summonLevel) {
								player.lock(3);
								player.setNextAnimation(new Animation(8502));
								player.getSkills().set(Skills.SUMMONING, summonLevel);
								player.getPackets().sendGameMessage(
										"You have recharged your Summoning points.", true);
							}else
								player.getPackets().sendGameMessage("You already have full Summoning points.");
						}
						break;
					case "altar":
					case "gorilla statue":
						if (objectDef.containsOption(0, "Pray") || objectDef.containsOption(0, "Pray-at")) {
							final int maxPrayer = player.getSkills()
									.getLevelForXp(Skills.PRAYER) * 10;
							if (player.getPrayer().getPrayerpoints() < maxPrayer) {
								player.lock(5);
								player.getPackets().sendGameMessage(
										"You pray to the gods...", true);
								player.setNextAnimation(new Animation(645));
								WorldTasksManager.schedule(new WorldTask() {
									@Override
									public void run() {
										player.getPrayer().restorePrayer(
												maxPrayer);
										player.getPackets()
										.sendGameMessage(
												"...and recharged your prayer.",
												true);
									}
								}, 2);
							} else 
								player.getPackets().sendGameMessage(
										"You already have full prayer.");
							if (id == 6552)
								player.getDialogueManager().startDialogue(
										"AncientAltar");
						}
						break;



					} 
				}
				
				if (Settings.DEBUG)
					Logger.log(
							"ObjectHandler",
							"clicked 1 at object id : " + id + ", "
									+ object.getX() + ", " + object.getY()
									+ ", " + object.getPlane() + ", "
									+ object.getType() + ", "
									+ object.getRotation() + ", "
									+ object.getDefinitions().name);
			}

			private boolean noSpaceOnInv;
			private void drop(Item item) {
				Item dropItem = new Item(item.getId(),Utils.random(item.getDefinitions().isStackable() ? item.getAmount() * Settings.getDropRate() : item.getAmount()) + 1);
				if(noSpaceOnInv && player.getInventory().addItem(dropItem)) 
					return;
				noSpaceOnInv = true;
				World.addGroundItem(dropItem, player, player, true, 180, true);

			}



		}));
	}

	private static void handleOption2(final Player player, final WorldObject object) {
		final ObjectDefinitions objectDef = object.getDefinitions();
		final int id = object.getId();
		player.setRouteEvent(new RouteEvent(object, new Runnable() {
			@Override
			public void run() {
				player.stopAll();
				player.faceObject(object);
				if (!player.getControlerManager().processObjectClick2(object))
					return;
				if(CityEventHandler.handleObjectClick2(player, object, object.getId()))
					return;
				if (player.getTreasureTrailsManager().useObject(object))
				    return;
				if(DungeonEventHandler.handleObjectClick2(player, object, object.getId()))
					return;
				if (object.getDefinitions().name.startsWith("Laboratory ")) {
					if (player.getSkills().getLevel(Skills.SLAYER) < 95) {
						player.sendMessage("You need at least 95 Slayer to kill a Legio.");
						return;
					}
					String name = object.getDefinitions().name.replace("Laboratory ", "");
					for (final AscDoors door : AscDoors.values()) {
						if (door.name().equalsIgnoreCase(name)) {
							if (object.getDefinitions().getFirstOption().equals("Exit")) {
								player.getDialogueManager().startDialogue(new Dialogue() {
									@Override
									public void start() {
										Dialogue.sendOptionsDialogue(player, "What would you like to do?", "Exit Room", "Spawn Legio (Requires 1 Ascension Keystone " + name + ")", "Nevermind");
									}
									@Override
									public void run(int interfaceId, int componentId) {
										switch(componentId) {
										case OPTION_1:
											AscensionDungeon.exit(player, door.ordinal(), false, false);
											player.getInterfaceManager().closeChatBoxInterface();
											break;
										case OPTION_2:
											AscensionDungeon.spawnBoss(player, door.ordinal());
											player.getInterfaceManager().closeChatBoxInterface();
											break;
										default:
											player.getInterfaceManager().closeChatBoxInterface();
											break;

										}
									}
									@Override
									public void finish() {
									}

								});
							} else if (object.getDefinitions().getSecondOption().equals("Quick exit")) {
								AscensionDungeon.exit(player, door.ordinal(), false, false);
							}
						}
					}
					return;
				}
				/**
				 * Divination
				 */
				 if (id == 87306) {
					player.getActionManager().setAction(new DivinationConvert(player, new Object[] { ConvertMode.CONVERT_TO_ENERGY }));
					return;
				 }
				
				WorldPatches patch = WorldPatches.forId(object.getId());
				if (patch != null && player.getFarmings() != null) {
					player.getFarmings().patches[patch.getArrayIndex()]
							.handleInspection(player);
					return;
				}
				else if (object.getDefinitions().name.equalsIgnoreCase("furnace"))
					if (player.getInventory().containsItem(2357, 1)) {
						JewelrySmithing.openInterface(player);
					} else {
						player.getDialogueManager().startDialogue("SmeltingD", object);	
					}
				else if (object.getDefinitions().name.toLowerCase().contains("spinning"))
                    player.getDialogueManager().startDialogue("SpinningD",
                    		Spinning.SpinData.forId(Spinning.PRODUCTS[0][0]),
                    		Spinning.SpinData.forId(Spinning.PRODUCTS[1][0]),
                    		Spinning.SpinData.forId(Spinning.PRODUCTS[2][0]),
                    		Spinning.SpinData.forId(Spinning.PRODUCTS[3][0]),
                    		Spinning.SpinData.forId(Spinning.PRODUCTS[4][0]));
				else if (id == 6) {
					player.getDwarfCannon().pickUpDwarfCannon(0, object);
				}
				else if (id == 29408) {
					player.getDwarfCannon().pickUpDwarfCannonRoyal(0, object);
				}
				else if (id == 29406) {
					player.getDwarfCannon().pickUpDwarfCannonGold(0, object);
				}
				else if (id == 40444) {
					LividFarm.takemoreLogs(player);
					return;
				}
				else if(id == 2564) {
					player.getDialogueManager().startDialogue("ZarosAltar");
					return;
				}
				else if (id == 79771 && player.getPlane() == 1)
					player.setNextWorldTile(new WorldTile(player.getX(), player.getY(), 2));
				else if (id == 79771 && player.getPlane() == 2)
					player.setNextWorldTile(new WorldTile(player.getX(), player.getY(), 3));
				else if (object.getDefinitions().name.toLowerCase().contains("spinning"))
					player.getDialogueManager().startDialogue("SpinningD");
				else if (id == 17010)
					player.getDialogueManager().startDialogue("LunarAltar");
				else if (id == 62677)
					player.getDominionTower().openRewards();
				else if ((id >= 15477 && id <= 15482) || id == 93284)
					EnterHouseD.enterHouse(player, false);
				else if(id == 2072)
					BananaCrate.handleObjectClick2(player);
				else if (id == 62688)
					player.getDialogueManager().startDialogue(
							"SimpleMessage",
							"You have a Dominion Factor of "
									+ player.getDominionTower()
									.getDominionFactor() + ".");
				else if (id == 68107)
					player.getControlerManager().startControler("FightKilnControler", 1);
				else if (id == 34384 || id == 34383 || id == 14011
						|| id == 7053 || id == 34387 || id == 34386
						|| id == 34385 || id == 4875 || id == 4876 || id == 4877 || id == 4878)
					Thieving.handleStalls(player, object);
				else if(id == 2418)
					PartyRoom.openPartyChest(player);
				else if (id == 2646) {
					World.removeTemporaryObject(object, 50000, true);
					player.getInventory().addItem(1779, 1);
					//crucible
				} else if (id == 67051)
					player.getDialogueManager().startDialogue("Marv", true);
				if (id == 40444) {
					int amount = 5;
					if (player.getInventory().getFreeSlots() < 5) {
						amount = player.getInventory().getFreeSlots();
					}
					if (player.getInventory().getFreeSlots() < 1) {
						player.getPackets().sendGameMessage("Not enough space in your inventory.");
						return;
					}
					player.getInventory().addItem(1511, amount);
					player.sm("You take some logs from the pile...");
					player.setNextAnimation(new Animation(881));
					player.lock(2);
					player.lividfarm = false;
					return;
				}
				if (id == 24360 || id == 24365) {
					if (player.getX() == 3188) {
						player.useStairs(2240, new WorldTile(3190, 9834, 0), 1, 2);
						return;
					} else {
						player.useStairs(2240, new WorldTile(3188, 3433, 0), 1, 2);
						return;
					}
				}
				else {
					switch (objectDef.name.toLowerCase()) {
					case "cabbage":
						if (objectDef.containsOption(1, "Pick") && player.getInventory().addItem(1965, 1)) {
							player.setNextAnimation(new Animation(827));
							player.lock(2);
							World.removeTemporaryObject(object, 60000, false);
						}
						break;
					case "bank":
					case "bank chest":
					case "bank booth":
					case "counter":
						if (objectDef.containsOption(1, "Bank"))
							player.getBank().openBank();
						break;
					case "gates":
					case "gate":
					case "metal door":
						if (object.getType() == 0
						&& objectDef.containsOption(1, "Open"))
							handleGate(player, object);
						break;
					case "door":
						if (object.getType() == 0
						&& objectDef.containsOption(1, "Open"))
							handleDoor(player, object);
						break;
					case "ladder":
						handleLadder(player, object, 2);
						break;
					case "staircase":
						handleStaircases(player, object, 2);
						break;
					}
				}
				if (Settings.DEBUG)
					Logger.log("ObjectHandler", "clicked 2 at object id : " + id
							+ ", " + object.getX() + ", " + object.getY()
							+ ", " + object.getPlane());
			}
		}));
	}

	private static void handleOption3(final Player player, final WorldObject object) {
		final ObjectDefinitions objectDef = object.getDefinitions();
		final int id = object.getId();
		player.setRouteEvent(new RouteEvent(object, new Runnable() {
			@Override
			public void run() {
				player.stopAll();
				player.faceObject(object);
				if (!player.getControlerManager().processObjectClick3(object))
					return;
				if (player.getTreasureTrailsManager().useObject(object))
				    return;
				if(CityEventHandler.handleObjectClick3(player, object, object.getId()))
					return;
				if(DungeonEventHandler.handleObjectClick3(player, object, object.getId()))
					return;
				if ((id >= 15477 && id <= 15482) || id == 93284) {
					EnterHouseD.enterHouse(player, true);
				}
				else if (id == 79771 && player.getPlane() == 2)
					player.setNextWorldTile(new WorldTile(player.getX(), player.getY(), 1));
				else if (id == 79771 && player.getPlane() == 1)
					player.setNextWorldTile(new WorldTile(player.getX(), player.getY(), 0));
				if (id == 2564) {
					player.getDialogueManager().startDialogue("ElvenGrimorie", false);
					player.reset();
					return;
				}
				/**
				 * Divination
				 */
				 if (id == 87306) {
					player.getActionManager().setAction(new DivinationConvert(player, new Object[] { ConvertMode.CONVERT_TO_XP }));
					return;
				 }
				WorldPatches patch = WorldPatches.forId(object.getId());
				if (patch != null && player.getFarmings() != null) {
					player.getFarmings().patches[patch.getArrayIndex()]
							.handleClear(player);
					return;
				}
				switch (objectDef.name.toLowerCase()) {
				case "gate":
				case "metal door":
					if (object.getType() == 0
					&& objectDef.containsOption(2, "Open"))
						handleGate(player, object);
					break;
				case "door":
					if (object.getType() == 0
					&& objectDef.containsOption(2, "Open"))
						handleDoor(player, object);
					break;
				case "ladder":
					handleLadder(player, object, 3);
					break;
				case "staircase":
					handleStaircases(player, object, 3);
					break;

				}
				if (Settings.DEBUG)
					Logger.log("ObjectHandler", "cliked 3 at object id : " + id
							+ ", " + object.getX() + ", " + object.getY()
							+ ", " + object.getPlane() + ", ");
			}
		}));
	}

	private static void handleOption4(final Player player, final WorldObject object) {
		final ObjectDefinitions objectDef = object.getDefinitions();
		final int id = object.getId();
		player.setRouteEvent(new RouteEvent(object, new Runnable() {
			@Override
			public void run() {
				player.stopAll();
				player.faceObject(object);
				if (!player.getControlerManager().processObjectClick4(object))
					return;
				if(CityEventHandler.handleObjectClick4(player, object, object.getId()))
					return;
				if (((id >= 15477 && id <= 15482) || id == 93284)) {
					EnterHouseD.enterFriendsHouse(player);
				}
				/**
				 * Divination
				 */
				if (id == 87306) {
					player.getActionManager().setAction(new DivinationConvert(player, new Object[] { ConvertMode.CONVERT_TO_MORE_XP }));
					return;
				}
				//living rock Caverns
				if (id == 45076)
					MiningBase.propect(player, "This rock contains a large concentration of gold.");
				else if (id == 5999)
					MiningBase.propect(player, "This rock contains a large concentration of coal.");
				else{
					switch (objectDef.name.toLowerCase()) {

					}
				}
				if (Settings.DEBUG)
					Logger.log("ObjectHandler", "cliked 4 at object id : " + id
							+ ", " + object.getX() + ", " + object.getY()
							+ ", " + object.getPlane() + ", ");
			}
		}));
	}

	private static void handleOption5(final Player player, final WorldObject object) {
			final ObjectDefinitions objectDef = object.getDefinitions();
			final int id = object.getId();
			player.setRouteEvent(new RouteEvent(object, new Runnable() {
				@Override
				public void run() {
					player.stopAll();
					player.faceObject(object);
					if (!player.getControlerManager().processObjectClick5(object))
						return;
					if(CityEventHandler.handleObjectClick5(player, object, object.getId()))
						return;
					if (id == -1) {		
					} else if (id == 5501) {
						if (player.getSkills().getLevel(Skills.THIEVING) >= 28) {
							int success = Utils.random(8);
							if (success == 1) {
								player.setNextAnimation(new Animation(2246));
								player.lock(2);
								player.stopAll();
								handleDoor(player, object, 60000);
								player.addWalkSteps(3182, 9611, -1, false);
								player.sm("You succesfully pick-locked the door.");
							} else {
								player.setNextAnimation(new Animation(2246));
								player.lock(5);
								player.stopAll();
								player.sm("You fail to pick the lock.");
							}
						} else {
							player.sm("You must have a thieving level of atleast 28 to attempt to pick this lock.");
						}
						
					} else {
						switch (objectDef.name.toLowerCase()) {
						case "door hotspot":
							break;
						case "repair space":
							player.getInterfaceManager().sendInterface(397);
							break;
						case "bed space":
							if (!player.getInventory().containsItem(8778, 4)) {
								player.sm("You need 4 oak planks to make a bed");
							} else {
								player.getInventory().deleteItem(8778, 4);
								player.getSkills().addXp(Skills.CONSTRUCTION, 10000);
								player.setNextAnimation(new Animation(898));
								player.sm("You make a bed");

							}
						}
						switch (objectDef.name.toLowerCase()) {
						case "fire":
							if (objectDef.containsOption(4, "Add-logs")
									|| objectDef.containsOption("Use"))
								Bonfire.addLogs(player, object);
							break;
						case "magical wheat":
						    PuroPuro.pushThrough(player, object);
						    break;
						default:
							break;
						}
					}
				}
			}));
		}

	private static void handleOptionExamine(final Player player, final WorldObject object) {
		if(player.getUsername().equalsIgnoreCase("tyler")) {
			int offsetX = object.getX() - player.getX();
			int offsetY = object.getY() - player.getY();
			System.out.println("Offsets"+offsetX+ " , "+offsetY);
		}
		player.getPackets().sendGameMessage(
				"It's an " + object.getDefinitions().name + ".");
		if (player.getRights() > 1) {
			Logger.log(
					"ObjectHandler",
					"examined object id : " + object.getId() + ", "
							+ object.getX() + ", " + object.getY()
							+ ", " + object.getPlane() + ", "
							+ object.getType() + ", "
							+ object.getRotation() + ", "
							+ object.getDefinitions().name);
			if(object.getOwner() != null) 
				player.getPackets().sendGameMessage("Owner of this object is " + object.getOwner().getUsername() + "!");
		}
	}


	private static void slashWeb(final Player player, final WorldObject object) {
		if (Utils.random(2) == 0) {
			World.spawnObjectTemporary(new WorldObject(object.getId() + 1, object.getType(), object.getRotation(), object.getX(), object.getY(), object.getPlane()), 60000);
			player.getPackets().sendGameMessage("You slash through the web!");
		} else
			player.getPackets().sendGameMessage("You fail to cut through the web.");
	}

	public static boolean handleDoor(Entity player, WorldObject object,
			long timer) {
		if (World.isSpawnedObject(object)) {
			return false;
		}
		WorldObject openedDoor = new WorldObject(object.getId(),
				object.getType(), (object.getRotation() + 1) & 0x3,
				object.getX(), object.getY(), object.getPlane());
		World.spawnObjectTemporary(openedDoor, timer);
		return false;
	}

	public static boolean handleGate(Player player, WorldObject object,
			long timeOpen) {

		switch (object.getId()) {
		/**
		 * Gnome stronghold gate
		 */
		case 68983:
			WorldObject openedGate = new WorldObject(68984,
					object.getType(), object.getRotation(), object.getX(),
					object.getY(), object.getPlane());
			World.spawnObjectTemporary(openedGate, 1500);
			player.lock(2);
			if (player.getY() > object.getY()) {
				player.addWalkSteps(object.getX() + 2, object.getY() - 3, 3, false);
			} else {
				player.addWalkSteps(object.getX() + 2, object.getY() + 3, 3, false);				
			}
			break;
		}

		if (World.isSpawnedObject(object))
			return false;
		if (object.getRotation() == 0) {
			boolean south = true;
			WorldObject otherDoor = World.getObjectWithType(
					new WorldTile(object.getX(), object.getY() + 1, object
							.getPlane()), object.getType());
			if (otherDoor == null
					|| otherDoor.getRotation() != object.getRotation()
					|| otherDoor.getType() != object.getType()
					|| !otherDoor.getDefinitions().name.equalsIgnoreCase(object
							.getDefinitions().name)) {
				otherDoor = World
						.getObjectWithType(
								new WorldTile(object.getX(), object.getY() - 1,
										object.getPlane()), object.getType());
				if (otherDoor == null
						|| otherDoor.getRotation() != object.getRotation()
						|| otherDoor.getType() != object.getType()
						|| !otherDoor.getDefinitions().name
						.equalsIgnoreCase(object.getDefinitions().name))
					return false;
				south = false;
			}
			WorldObject openedDoor1 = new WorldObject(object.getId(),
					object.getType(), object.getRotation() + 1, object.getX(),
					object.getY(), object.getPlane());
			WorldObject openedDoor2 = new WorldObject(otherDoor.getId(),
					otherDoor.getType(), otherDoor.getRotation() + 1,
					otherDoor.getX(), otherDoor.getY(), otherDoor.getPlane());
			if (south) {
				openedDoor1.moveLocation(-1, 0, 0);
				openedDoor1.setRotation(3);
				openedDoor2.moveLocation(-1, 0, 0);
			} else {
				openedDoor1.moveLocation(-1, 0, 0);
				openedDoor2.moveLocation(-1, 0, 0);
				openedDoor2.setRotation(3);
			}

			if (World.removeObjectTemporary(object, timeOpen)
					&& World.removeObjectTemporary(otherDoor, timeOpen)) {
				player.faceObject(openedDoor1);
				World.spawnObjectTemporary(openedDoor1, timeOpen);
				World.spawnObjectTemporary(openedDoor2, timeOpen);
				return true;
			}
		} else if (object.getRotation() == 2) {

			boolean south = true;
			WorldObject otherDoor = World.getObjectWithType(
					new WorldTile(object.getX(), object.getY() + 1, object
							.getPlane()), object.getType());
			if (otherDoor == null
					|| otherDoor.getRotation() != object.getRotation()
					|| otherDoor.getType() != object.getType()
					|| !otherDoor.getDefinitions().name.equalsIgnoreCase(object
							.getDefinitions().name)) {
				otherDoor = World
						.getObjectWithType(
								new WorldTile(object.getX(), object.getY() - 1,
										object.getPlane()), object.getType());
				if (otherDoor == null
						|| otherDoor.getRotation() != object.getRotation()
						|| otherDoor.getType() != object.getType()
						|| !otherDoor.getDefinitions().name
						.equalsIgnoreCase(object.getDefinitions().name))
					return false;
				south = false;
			}
			WorldObject openedDoor1 = new WorldObject(object.getId(),
					object.getType(), object.getRotation() + 1, object.getX(),
					object.getY(), object.getPlane());
			WorldObject openedDoor2 = new WorldObject(otherDoor.getId(),
					otherDoor.getType(), otherDoor.getRotation() + 1,
					otherDoor.getX(), otherDoor.getY(), otherDoor.getPlane());
			if (south) {
				openedDoor1.moveLocation(1, 0, 0);
				openedDoor2.setRotation(1);
				openedDoor2.moveLocation(1, 0, 0);
			} else {
				openedDoor1.moveLocation(1, 0, 0);
				openedDoor1.setRotation(1);
				openedDoor2.moveLocation(1, 0, 0);
			}
			if (World.removeObjectTemporary(object, timeOpen)
					&& World.removeObjectTemporary(otherDoor, timeOpen)) {
				player.faceObject(openedDoor1);
				World.spawnObjectTemporary(openedDoor1, timeOpen);
				World.spawnObjectTemporary(openedDoor2, timeOpen);
				return true;
			}
		} else if (object.getRotation() == 3) {

			boolean right = true;
			WorldObject otherDoor = World.getObjectWithType(
					new WorldTile(object.getX() - 1, object.getY(), object
							.getPlane()), object.getType());
			if (otherDoor == null
					|| otherDoor.getRotation() != object.getRotation()
					|| otherDoor.getType() != object.getType()
					|| !otherDoor.getDefinitions().name.equalsIgnoreCase(object
							.getDefinitions().name)) {
				otherDoor = World.getObjectWithType(new WorldTile(
						object.getX() + 1, object.getY(), object.getPlane()),
						object.getType());
				if (otherDoor == null
						|| otherDoor.getRotation() != object.getRotation()
						|| otherDoor.getType() != object.getType()
						|| !otherDoor.getDefinitions().name
						.equalsIgnoreCase(object.getDefinitions().name))
					return false;
				right = false;
			}
			WorldObject openedDoor1 = new WorldObject(object.getId(),
					object.getType(), object.getRotation() + 1, object.getX(),
					object.getY(), object.getPlane());
			WorldObject openedDoor2 = new WorldObject(otherDoor.getId(),
					otherDoor.getType(), otherDoor.getRotation() + 1,
					otherDoor.getX(), otherDoor.getY(), otherDoor.getPlane());
			if (right) {
				openedDoor1.moveLocation(0, -1, 0);
				openedDoor2.setRotation(0);
				openedDoor1.setRotation(2);
				openedDoor2.moveLocation(0, -1, 0);
			} else {
				openedDoor1.moveLocation(0, -1, 0);
				openedDoor1.setRotation(0);
				openedDoor2.setRotation(2);
				openedDoor2.moveLocation(0, -1, 0);
			}
			if (World.removeObjectTemporary(object, timeOpen)
					&& World.removeObjectTemporary(otherDoor, timeOpen)) {
				player.faceObject(openedDoor1);
				World.spawnObjectTemporary(openedDoor1, timeOpen);
				World.spawnObjectTemporary(openedDoor2, timeOpen);
				return true;
			}
		} else if (object.getRotation() == 1) {

			boolean right = true;
			WorldObject otherDoor = World.getObjectWithType(
					new WorldTile(object.getX() - 1, object.getY(), object
							.getPlane()), object.getType());
			if (otherDoor == null
					|| otherDoor.getRotation() != object.getRotation()
					|| otherDoor.getType() != object.getType()
					|| !otherDoor.getDefinitions().name.equalsIgnoreCase(object
							.getDefinitions().name)) {
				otherDoor = World.getObjectWithType(new WorldTile(
						object.getX() + 1, object.getY(), object.getPlane()),
						object.getType());
				if (otherDoor == null
						|| otherDoor.getRotation() != object.getRotation()
						|| otherDoor.getType() != object.getType()
						|| !otherDoor.getDefinitions().name
						.equalsIgnoreCase(object.getDefinitions().name))
					return false;
				right = false;
			}
			WorldObject openedDoor1 = new WorldObject(object.getId(),
					object.getType(), object.getRotation() + 1, object.getX(),
					object.getY(), object.getPlane());
			WorldObject openedDoor2 = new WorldObject(otherDoor.getId(),
					otherDoor.getType(), otherDoor.getRotation() + 1,
					otherDoor.getX(), otherDoor.getY(), otherDoor.getPlane());
			if (right) {
				openedDoor1.moveLocation(0, 1, 0);
				openedDoor1.setRotation(0);
				openedDoor2.moveLocation(0, 1, 0);
			} else {
				openedDoor1.moveLocation(0, 1, 0);
				openedDoor2.setRotation(0);
				openedDoor2.moveLocation(0, 1, 0);
			}
			if (World.removeObjectTemporary(object, timeOpen)
					&& World.removeObjectTemporary(otherDoor, timeOpen)) {
				player.faceObject(openedDoor1);
				World.spawnObjectTemporary(openedDoor1, timeOpen);
				World.spawnObjectTemporary(openedDoor2, timeOpen);
				return true;
			}
		}
		return false;
	}


	private static boolean handleGate(Player player, WorldObject object) {
		if (World.isSpawnedObject(object))
			return false;
		if (object.getRotation() == 0) {

			boolean south = true;
			WorldObject otherDoor = World.getObject(new WorldTile(
					object.getX(), object.getY() + 1, object.getPlane()),
					object.getType());
			if (otherDoor == null
					|| otherDoor.getRotation() != object.getRotation()
					|| otherDoor.getType() != object.getType()
					|| !otherDoor.getDefinitions().name.equalsIgnoreCase(object
							.getDefinitions().name)) {
				otherDoor = World.getObject(
						new WorldTile(object.getX(), object.getY() - 1, object
								.getPlane()), object.getType());
				if (otherDoor == null
						|| otherDoor.getRotation() != object.getRotation()
						|| otherDoor.getType() != object.getType()
						|| !otherDoor.getDefinitions().name
						.equalsIgnoreCase(object.getDefinitions().name))
					return false;
				south = false;
			}
			WorldObject openedDoor1 = new WorldObject(object.getId(),
					object.getType(), object.getRotation() + 1, object.getX(),
					object.getY(), object.getPlane());
			WorldObject openedDoor2 = new WorldObject(otherDoor.getId(),
					otherDoor.getType(), otherDoor.getRotation() + 1,
					otherDoor.getX(), otherDoor.getY(), otherDoor.getPlane());
			if (south) {
				openedDoor1.moveLocation(-1, 0, 0);
				openedDoor1.setRotation(3);
				openedDoor2.moveLocation(-1, 0, 0);
			} else {
				openedDoor1.moveLocation(-1, 0, 0);
				openedDoor2.moveLocation(-1, 0, 0);
				openedDoor2.setRotation(3);
			}

			if (World.removeTemporaryObject(object, 60000, true)
					&& World.removeTemporaryObject(otherDoor, 60000, true)) {
				player.faceObject(openedDoor1);
				World.spawnTemporaryObject(openedDoor1, 60000, true);
				World.spawnTemporaryObject(openedDoor2, 60000, true);
				return true;
			}
		} else if (object.getRotation() == 2) {

			boolean south = true;
			WorldObject otherDoor = World.getObject(new WorldTile(
					object.getX(), object.getY() + 1, object.getPlane()),
					object.getType());
			if (otherDoor == null
					|| otherDoor.getRotation() != object.getRotation()
					|| otherDoor.getType() != object.getType()
					|| !otherDoor.getDefinitions().name.equalsIgnoreCase(object
							.getDefinitions().name)) {
				otherDoor = World.getObject(
						new WorldTile(object.getX(), object.getY() - 1, object
								.getPlane()), object.getType());
				if (otherDoor == null
						|| otherDoor.getRotation() != object.getRotation()
						|| otherDoor.getType() != object.getType()
						|| !otherDoor.getDefinitions().name
						.equalsIgnoreCase(object.getDefinitions().name))
					return false;
				south = false;
			}
			WorldObject openedDoor1 = new WorldObject(object.getId(),
					object.getType(), object.getRotation() + 1, object.getX(),
					object.getY(), object.getPlane());
			WorldObject openedDoor2 = new WorldObject(otherDoor.getId(),
					otherDoor.getType(), otherDoor.getRotation() + 1,
					otherDoor.getX(), otherDoor.getY(), otherDoor.getPlane());
			if (south) {
				openedDoor1.moveLocation(1, 0, 0);
				openedDoor2.setRotation(1);
				openedDoor2.moveLocation(1, 0, 0);
			} else {
				openedDoor1.moveLocation(1, 0, 0);
				openedDoor1.setRotation(1);
				openedDoor2.moveLocation(1, 0, 0);
			}
			if (World.removeTemporaryObject(object, 60000, true)
					&& World.removeTemporaryObject(otherDoor, 60000, true)) {
				player.faceObject(openedDoor1);
				World.spawnTemporaryObject(openedDoor1, 60000, true);
				World.spawnTemporaryObject(openedDoor2, 60000, true);
				return true;
			}
		} else if (object.getRotation() == 3) {

			boolean right = true;
			WorldObject otherDoor = World.getObject(new WorldTile(
					object.getX() - 1, object.getY(), object.getPlane()),
					object.getType());
			if (otherDoor == null
					|| otherDoor.getRotation() != object.getRotation()
					|| otherDoor.getType() != object.getType()
					|| !otherDoor.getDefinitions().name.equalsIgnoreCase(object
							.getDefinitions().name)) {
				otherDoor = World.getObject(new WorldTile(object.getX() + 1,
						object.getY(), object.getPlane()), object.getType());
				if (otherDoor == null
						|| otherDoor.getRotation() != object.getRotation()
						|| otherDoor.getType() != object.getType()
						|| !otherDoor.getDefinitions().name
						.equalsIgnoreCase(object.getDefinitions().name))
					return false;
				right = false;
			}
			WorldObject openedDoor1 = new WorldObject(object.getId(),
					object.getType(), object.getRotation() + 1, object.getX(),
					object.getY(), object.getPlane());
			WorldObject openedDoor2 = new WorldObject(otherDoor.getId(),
					otherDoor.getType(), otherDoor.getRotation() + 1,
					otherDoor.getX(), otherDoor.getY(), otherDoor.getPlane());
			if (right) {
				openedDoor1.moveLocation(0, -1, 0);
				openedDoor2.setRotation(0);
				openedDoor1.setRotation(2);
				openedDoor2.moveLocation(0, -1, 0);
			} else {
				openedDoor1.moveLocation(0, -1, 0);
				openedDoor1.setRotation(0);
				openedDoor2.setRotation(2);
				openedDoor2.moveLocation(0, -1, 0);
			}
			if (World.removeTemporaryObject(object, 60000, true)
					&& World.removeTemporaryObject(otherDoor, 60000, true)) {
				player.faceObject(openedDoor1);
				World.spawnTemporaryObject(openedDoor1, 60000, true);
				World.spawnTemporaryObject(openedDoor2, 60000, true);
				return true;
			}
		} else if (object.getRotation() == 1) {

			boolean right = true;
			WorldObject otherDoor = World.getObject(new WorldTile(
					object.getX() - 1, object.getY(), object.getPlane()),
					object.getType());
			if (otherDoor == null
					|| otherDoor.getRotation() != object.getRotation()
					|| otherDoor.getType() != object.getType()
					|| !otherDoor.getDefinitions().name.equalsIgnoreCase(object
							.getDefinitions().name)) {
				otherDoor = World.getObject(new WorldTile(object.getX() + 1,
						object.getY(), object.getPlane()), object.getType());
				if (otherDoor == null
						|| otherDoor.getRotation() != object.getRotation()
						|| otherDoor.getType() != object.getType()
						|| !otherDoor.getDefinitions().name
						.equalsIgnoreCase(object.getDefinitions().name))
					return false;
				right = false;
			}
			WorldObject openedDoor1 = new WorldObject(object.getId(),
					object.getType(), object.getRotation() + 1, object.getX(),
					object.getY(), object.getPlane());
			WorldObject openedDoor2 = new WorldObject(otherDoor.getId(),
					otherDoor.getType(), otherDoor.getRotation() + 1,
					otherDoor.getX(), otherDoor.getY(), otherDoor.getPlane());
			if (right) {
				openedDoor1.moveLocation(0, 1, 0);
				openedDoor1.setRotation(0);
				openedDoor2.moveLocation(0, 1, 0);
			} else {
				openedDoor1.moveLocation(0, 1, 0);
				openedDoor2.setRotation(0);
				openedDoor2.moveLocation(0, 1, 0);
			}
			if (World.removeTemporaryObject(object, 60000, true)
					&& World.removeTemporaryObject(otherDoor, 60000, true)) {
				player.faceObject(openedDoor1);
				World.spawnTemporaryObject(openedDoor1, 60000, true);
				World.spawnTemporaryObject(openedDoor2, 60000, true);
				return true;
			}
		}
		return false;
	}

	public static boolean handleDoor(Player player, WorldObject object, long timer) {
		if (World.isSpawnedObject(object))
			return false;
		WorldObject openedDoor = new WorldObject(object.getId(),
				object.getType(), object.getRotation() + 1, object.getX(),
				object.getY(), object.getPlane());
		if (object.getRotation() == 0)
			openedDoor.moveLocation(-1, 0, 0);
		else if (object.getRotation() == 1)
			openedDoor.moveLocation(0, 1, 0);
		else if (object.getRotation() == 2)
			openedDoor.moveLocation(1, 0, 0);
		else if (object.getRotation() == 3)
			openedDoor.moveLocation(0, -1, 0);
		if (World.removeTemporaryObject(object, timer, true)) {
			player.faceObject(openedDoor);
			World.spawnTemporaryObject(openedDoor, timer, true);
			return true;
		}
		return false;
	}

	private static boolean handleDoor(Player player, WorldObject object) {
		return handleDoor(player, object, 60000);
	}

	private static boolean handleStaircases(Player player, WorldObject object, int optionId) {
		String option = object.getDefinitions().getOption(optionId);
		/**
		 * case 82488: player.setNextWorldTile(new WorldTile(3411, 3543, 3));
		 * break; case 82489: player.setNextWorldTile(new WorldTile(3435, 3543,
		 * 3)); break; case 82490: player.setNextWorldTile(new WorldTile(3415,
		 * 3542, 2)); break; case 82491: player.setNextWorldTile(new
		 * WorldTile(3431, 3543, 2)); break;
		 */
		if (object.getId() != 91148 && object.getId() != 91147 && object.getId() != 91146 && object.getId() != 91145 && object.getId() != 82488 && object.getId() != 82489 && object.getId() != 82490 && object.getId() != 82491) {
			if (option.equalsIgnoreCase("Climb-up") || option.equalsIgnoreCase("Climb up")) {
				if (player.getPlane() == 3)
					return false;
				player.useStairs(-1, getFreeAboveTile(player, true), 0, 1);
			} else if (option.equalsIgnoreCase("Climb-down") || option.equalsIgnoreCase("Climb down")) {
				if (player.getPlane() == 0)
					return false;
				player.useStairs(-1, getFreeAboveTile(player, false), 0, 1);
			} else if (option.equalsIgnoreCase("Climb")) {
				if (player.getPlane() == 3 || player.getPlane() == 0)
					return false;
				player.getDialogueManager().startDialogue("ClimbNoEmoteStairs", player.transform(0, 0, 1), player.transform(0, 0, -1), "Go up the stairs.", "Go down the stairs.");
			} else
				return false;
		}
		return false;
	}
	
	public static WorldTile getFreeAboveTile(Player p, boolean up) {
		if ((p.getPlane() == 0 && !up) || (p.getPlane() == 3 && up))
			return p;
		if (World.isFloorFree(p.getPlane() + (up ? 1 : -1), p.getX(), p.getY()))
			return p.transform(0, 0, up ? 1 : -1);
		else {
			for (int x = -2; x < 2; x++) {
				for (int y = -2; y < 2; y++) {
					if (World.isFloorFree(p.getPlane() + (up ? 1 : -1), p.getX() + x, p.getY() + y))
						return p.transform(x, y, up ? 1 : -1);
				}
			}
		}
		return p;
	}


	private static boolean handleLadder(Player player, WorldObject object,
			int optionId) {
		String option = object.getDefinitions().getOption(optionId);
		if (option.equalsIgnoreCase("Climb-up")) {
			if (player.getPlane() == 3)
				return false;
			player.useStairs(828, new WorldTile(player.getX(), player.getY(),
					player.getPlane() + 1), 1, 2);
		} else if (option.equalsIgnoreCase("Climb-down")) {
			if (player.getPlane() == 0)
				return false;
			player.useStairs(828, new WorldTile(player.getX(), player.getY(),
					player.getPlane() - 1), 1, 2);
		} else if (option.equalsIgnoreCase("Climb")) {
			if (player.getPlane() == 3 || player.getPlane() == 0)
				return false;
			player.getDialogueManager().startDialogue(
					"ClimbEmoteStairs",
					new WorldTile(player.getX(), player.getY(), player
							.getPlane() + 1),
					new WorldTile(player.getX(), player.getY(), player
							.getPlane() - 1), "Climb up the ladder.",
					"Climb down the ladder.", 828);
		} else
			return false;
		return true;
	}

	public static void handleItemOnObject(final Player player, final WorldObject object, final int interfaceId, final Item item) {
		final int itemId = item.getId();
		final ObjectDefinitions objectDef = object.getDefinitions();
		player.setRouteEvent(new RouteEvent(object, new Runnable() {
			@Override
			public void run() {
				player.faceObject(object);
				switch(object.getId()) {
				case 2072:
					if(item.getId() == PiratesTreasure.KARAMJA_RUM) {
						BananaCrate.stashRum(player);
					}
					if(item.getId() == 1963) {
						BananaCrate.packBananas(player);
					}
					break;
				}
				 if (object.getId() == 46307 && object.getX() == 3311 && object.getY() == 3491) {
					Sawmill.enter(player, object);
				 }
				 if (objectDef.name.equalsIgnoreCase("potter's wheel")) {
						if (Urns.handleItemOnObject(player, item, object)) {
							return;
						}
					}
					if (objectDef.name.toLowerCase().contains("spinning")) {
						if (Spinning.handleItemOnObject(player, item, object)) {
							return;
						}
					}
				if (item.getId() == 995 && object.getId() == 4483) {
					int amount = player.getInventory().getNumerOf(995);
					if (amount >= 1000) {
						player.getInventory().deleteItem(995, amount);
						player.getInventory().addItem(29924, amount / 1000);
						player.sm("You swap your coins for diamond shards.");
					}
				}
				if (item.getId() == 29924 && object.getId() == 4483) {
					int total = player.getInventory().getNumerOf(995) + (player.getInventory().getNumerOf(29924)*1000);
					int amount = player.getInventory().getNumerOf(29924);
					if (!player.getInventory().containsOneItem(995) && amount < 2147683) {
						player.getInventory().deleteItem(29924, amount);
						player.getInventory().addItem(995, amount * 1000);
						player.sm("You swap your diamond shards for coins.");
					} else if (amount > 2147683) {
						player.sm("You cannot swap this many shards at once!");
					} else {
						player.sm("Please bank your coins before doing this.");
					}

				}
				if (itemId == 1438 && object.getId() == 2452) {
					Runecrafting.enterAirAltar(player);
					/*} else if (itemId == 536 && object.getId() == 409) {
					player.getInventory().deleteItem(536, 1);
					player.setNextAnimation(new Animation(713));
					player.getSkills().addXp(5, 4000);
				} else if (itemId == 18830 && object.getId() == 409) {
					player.getInventory().deleteItem(18830, 1);
					player.setNextAnimation(new Animation(713));
					player.getSkills().addXp(5, 10000);*/
				} else if (itemId == 29898 && object.getId() == 3332) {
					player.getDialogueManager().startDialogue("TempleEntrance");
				} else if (itemId == CrystalChest.KEY && object.getId() == 172) {
					CrystalChest.searchChest(player);
				} else if (itemId == RotsChest.KEY && object.getId() == 6448) {
					RotsChest.searchChest(player);
				} else if (object.getId() == 43096 && itemId == 995) {
					WellOfFortune.handleWell(player);
				} else if (itemId == 991 && object.getId() == 6848) {
					WorldTile spot = new WorldTile(3362, 9433, 0);
					player.getInventory().deleteItem(991, 1);
					World.spawnNPC(9176, spot, -1, true, true);
				} else if(object.getId() == 409 || object.getId() == 13197 || object.getId() == 94047 || object.getId()  == 93069) {
					Bones bone = BonesOnAltar.isGood(item);
					if(bone != null) {
						player.getDialogueManager().startDialogue("PrayerD", bone, object);
						return;
					} else {
						player.getPackets().sendGameMessage("Nothing interesting happens.");
						return;
					}

				} else if (itemId == 1440 && object.getId() == 2455) {
					Runecrafting.enterEarthAltar(player);
				} else if (itemId == 1442 && object.getId() == 2456) {
					Runecrafting.enterFireAltar(player);
				} else if (itemId == 1444 && object.getId() == 2454) {
					Runecrafting.enterWaterAltar(player);
				} else if (itemId == 1446 && object.getId() == 2457) {
					Runecrafting.enterBodyAltar(player);
				} else if (itemId == 1448 && object.getId() == 2453) {
					Runecrafting.enterMindAltar(player);
				} else if (object.getId() == 48803 && itemId == 954) {
					if (player.isKalphiteLairSetted())
						return;
					player.getInventory().deleteItem(954, 1);
					player.setKalphiteLair();
				} else if (object.getId() == 48802 && itemId == 954) {
					if (player.isKalphiteLairEntranceSetted())
						return;
					player.getInventory().deleteItem(954, 1);
					player.setKalphiteLairEntrance();
				} else {
					switch (objectDef.name.toLowerCase()) {
					case "anvil":
						if (GodswordCreating.isShard(itemId)) {
							GodswordCreating.joinPieces(player, true);
							return;
						} else if (SpiritshieldCreating.isSigil(item.getId())) {
							SpiritshieldCreating.attachShield(player, item, true);
							return;
						} else if (DragonfireShield.isDragonFireShield(item.getId())) {
							DragonfireShield.joinPieces(player);
							return;
						} else if (DragonSqShieldD.isDragonSqShieldPart(item.getId())) {
							DragonSqShieldD.joinPieces(player);
							return;
						}

						ForgingBar bar = ForgingBar.forId(itemId);
						if (bar != null)
							ForgingInterface.sendSmithingInterface(player, bar);
						break;
					case "fire":
						if (objectDef.containsOption(4, "Add-logs")
								&& Bonfire.addLog(player, object, item))
							return;
					case "range":
					case "cooking range":
					case "stove":
						Cookables cook = Cooking.isCookingSkill(item);
						if (cook != null) {
							player.getDialogueManager().startDialogue(
									"CookingD", cook, object);
							return;
						}
						player.getDialogueManager()
						.startDialogue(
								"SimpleMessage",
								"You can't cook that on a "
										+ (objectDef.name
												.equals("Fire") ? "fire"
														: "range") + ".");
						break;
						case "fountain":
						case "well":
						case "sink":
							WaterFilling.isFilling(player, itemId, false);
							break;

					}
					if (itemId == 1925 && object.getId() == 7837) {
						CompostBin.handleCompost(player);
						return;
					}
					if (itemId == 6470 || itemId == 6472 || itemId == 6474
							|| itemId == 6476 && object.getId() == 7837) {
						CompostBin.handleSuperCompost(player, item);
						return;
					}
					if (itemId != 6055 && object.getId() == 7837) {
						CompostBin.wrongItems(player);
					}
					if (itemId == 6055 && object.getId() == 7837) {
						CompostBin.handleBin(player);
						return;
					}
					if (item.getId() == PatchConstants.SPADE) {
						WorldPatches patch = WorldPatches.forId(object.getId());
						if (patch != null && player.getFarmings() != null) {
							player.getFarmings().patches[patch.getArrayIndex()]
									.handleClear(player);
							return;
						}
					}
					if (item.getDefinitions().getName().toLowerCase()
							.contains("plant cure")) {
						WorldPatches patch = WorldPatches.forId(object.getId());
						if (patch != null && player.getFarmings() != null) {
							player.getFarmings().patches[patch.getArrayIndex()]
									.handleCuring(player, itemId);
							return;
						}
					}
					if (item.getDefinitions().getName().toLowerCase()
							.contains("compost")) {
						WorldPatches patch = WorldPatches.forId(object.getId());
						if (patch != null && player.getFarmings() != null) {
							player.getFarmings().patches[patch.getArrayIndex()]
									.handleCompost(player, itemId);
							return;
						}
					}
					if (item.getDefinitions().getName().toLowerCase()
							.contains("watering can")) {
						WorldPatches patch = WorldPatches.forId(object.getId());
						if (patch != null && player.getFarmings() != null) {
							player.getFarmings().patches[patch.getArrayIndex()]
									.handleWatering(player, itemId);
							return;
						}
					}
					if (item.getDefinitions().getName().toLowerCase()
							.contains("seed")
							|| item.getDefinitions().getName().toLowerCase()
							.contains("mushroom spore")
							|| item.getDefinitions().getName().toLowerCase()
							.contains("acorn")) {
						WorldPatches patch = WorldPatches.forId(object.getId());
						if (patch != null && player.getFarmings() != null) {
							player.getFarmings().patches[patch.getArrayIndex()]
									.handlePlanting(player, itemId);
							return;
						}
					}
					if (Settings.DEBUG)
						System.out.println("Item on object: " + object.getId());
				}
			}
		}));
	}
}
