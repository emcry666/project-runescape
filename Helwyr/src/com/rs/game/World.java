package com.rs.game;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.rs.Launcher;
import com.rs.Settings;
import com.rs.cache.loaders.ObjectDefinitions;
import com.rs.cores.GameTick;
import com.rs.engine.GameEngine;
import com.rs.game.cityhandler.impl.Miscellania;
import com.rs.game.economics.Market;
import com.rs.game.item.FloorItem;
import com.rs.game.item.Item;
import com.rs.game.minigames.GodWarsBosses;
import com.rs.game.minigames.ShootingStars;
import com.rs.game.minigames.ZarosGodwars;
import com.rs.game.minigames.clanwars.FfaZone;
import com.rs.game.minigames.clanwars.RequestController;
import com.rs.game.minigames.duel.LobbyControler;
import com.rs.game.npc.NPC;
import com.rs.game.npc.araxxi.Araxxi;
import com.rs.game.npc.corp.CorporealBeast;
import com.rs.game.npc.dragons.KingBlackDragon;
import com.rs.game.npc.godwars.GodWarMinion;
import com.rs.game.npc.godwars.armadyl.GodwarsArmadylFaction;
import com.rs.game.npc.godwars.armadyl.KreeArra;
import com.rs.game.npc.godwars.bandos.GeneralGraardor;
import com.rs.game.npc.godwars.bandos.GodwarsBandosFaction;
import com.rs.game.npc.godwars.saradomin.CommanderZilyana;
import com.rs.game.npc.godwars.saradomin.GodwarsSaradominFaction;
import com.rs.game.npc.godwars.zammorak.GodwarsZammorakFaction;
import com.rs.game.npc.godwars.zammorak.KrilTstsaroth;
import com.rs.game.npc.godwars.zaros.Nex;
import com.rs.game.npc.godwars.zaros.NexMinion;
import com.rs.game.npc.kalph.KalphiteKing;
import com.rs.game.npc.kalph.KalphiteQueen;
import com.rs.game.npc.nomad.FlameVortex;
import com.rs.game.npc.nomad.Nomad;
import com.rs.game.npc.others.Benny;
import com.rs.game.npc.others.ChaosElemental;
import com.rs.game.npc.others.Cyclossus;
import com.rs.game.npc.others.DraynorDeadTree;
import com.rs.game.npc.others.Ducks;
import com.rs.game.npc.others.FairyGodfather;
import com.rs.game.npc.others.HunterNetNPCS;
import com.rs.game.npc.others.ItemHunterNPC;
import com.rs.game.npc.others.LivingRock;
import com.rs.game.npc.others.Lucien;
import com.rs.game.npc.others.MercenaryMage;
import com.rs.game.npc.others.PestMonsters;
import com.rs.game.npc.others.Revenant;
import com.rs.game.npc.others.RockCrabs;
import com.rs.game.npc.others.Sheep;
import com.rs.game.npc.others.TormentedDemon;
import com.rs.game.npc.others.WildyWyrm;
import com.rs.game.npc.slayer.PolyporeCreature;
import com.rs.game.npc.slayer.Strykewyrm;
import com.rs.game.npc.slayer.glacor.Glacor;
import com.rs.game.npc.sorgar.Elemental;
import com.rs.game.npc.vorago.Vorago;
import com.rs.game.npc.vorago.VoragoMinion;
import com.rs.game.player.OwnedObjectManager;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.WeekendLottery;
import com.rs.game.player.actions.PortablePlacing;
import com.rs.game.player.actions.divination.Wisp;
import com.rs.game.player.actions.divination.WispInfo;
import com.rs.game.player.actions.hunter.BoxAction.HunterNPC;
import com.rs.game.player.content.ItemConstants;
import com.rs.game.player.content.LivingRockCavern;
import com.rs.game.player.content.MonkeyGreeGrees;
import com.rs.game.player.content.PenguinEvent;
import com.rs.game.player.content.TriviaBot;
import com.rs.game.player.content.bot.Bot;
import com.rs.game.player.content.grandExchange.GrandExchange;
import com.rs.game.player.controlers.Wilderness;
import com.rs.mysql.DatabaseManager;
import com.rs.net.decoders.handlers.ButtonHandler;
import com.rs.tools.MapUtils;
import com.rs.tools.MapUtils.Structure;
import com.rs.utils.*;
import com.rs.utils.Utils.EntityDirection;

public final class World {

	public static int exiting_delay;
	public static long exiting_start;


	private static final EntityList<Player> players = new EntityList<Player>(
			Settings.PLAYERS_LIMIT);

	private static final List<LoginServer> loginServer = new ArrayList<LoginServer>(
			1);

	private static final EntityList<NPC> npcs = new EntityList<NPC>(Settings.NPCS_LIMIT);
	
	private static final Map<Integer, Region> regions = Collections.synchronizedMap(new HashMap<Integer, Region>());
	
	public static List<WorldTile> restrictedTiles = new ArrayList<WorldTile>();

	public static Market market;
	
	private static int wellAmount;
	private static boolean wellActive = false;
	

	public static int restartTimerLeft = 8;
	public static int HOURS_FOR_RESTART = 8;
	
	private static DatabaseManager database = new DatabaseManager();
	
	public static final void init() {
		// addLogicPacketsTask();
		addRestartReminder();
		addRestartTask();
		addTriviaBotTask();
		penguinEvent();
		addRestoreRunEnergyTask();
		addDrainPrayerTask();
		addRestoreHitPointsTask();
		addRestoreSkillsTask();
		addRestoreSpecialAttackTask();
		addSummoningEffectTask();
		addOwnedObjectsTask();
		LivingRockCavern.init();
		addMessageCheckTask();
		addGrowPatchesTask();
		servermessages();
		ShootingStars.init();
		serverEconomy();
		RegionBuilder.copyAllPlanesMap(248, 792, 392, 392, 8, 24);
	}

	public static void serverEconomy() {
		addRestoreShopItemsTask();
		WeekendLottery.init();
		if (market == null)
			market = SerializableFilesManager.loadEconomy();
		market.init();
	}
	
	public static final List<LoginServer> getLoginServer() {
		return loginServer;
	}

	public static void removePlayer(LoginServer login) {
		loginServer.remove(login);
	}

	public static final void addLoginSession(LoginServer login) {
		loginServer.add(login);
	}


	public static void deleteObject(WorldTile tile){
		restrictedTiles.add(tile);
	}
	
	private static void addRestartTask() {
		GameEngine.slowExecutor.schedule(new Runnable() {

			@Override
			public void run() {
				World.sendWorldMessage("<img=5>[<col=FFFFFF><shad=EB901A>Server Restart</shad></col>] - <shad=EB901A> Server is being automatically restarted.");
				World.safeShutdown(true, 180);
			}
			
		}, HOURS_FOR_RESTART, TimeUnit.HOURS);
	}
	
	public static void addRestartReminder() {
		GameEngine.slowExecutor.schedule(new Runnable() {

			@Override
			public void run() {
				restartTimerLeft -= 1;
				if(restartTimerLeft < 1)
					restartTimerLeft = 1;
				World.sendWorldMessage("<img=5>[<col=FFFFFF><shad=EB901A>Server Restart Reminder</shad></col>] - <col=FFFFFF><shad=EB901A> Server will automatically restart in " + restartTimerLeft + (restartTimerLeft == 1 ? " hour" : " hours") + ".");
			}
			
		}, 1, TimeUnit.HOURS);
	}
	
	
	public static void servermessages() {
		GameEngine.slowExecutor.scheduleWithFixedDelay(new Runnable() {
			@Override
			public void run() {
				try {
					World.sendWorldMessage(Settings.WORLD_RANDOM_NEWS[Utils.random(Settings.WORLD_RANDOM_NEWS.length)], false);
				} catch (Throwable e) {
					Logger.handle(e);
				}
			}
		}, 5, 5, TimeUnit.MINUTES);
	};
	
	private static void addGrowPatchesTask() {
		GameEngine.slowExecutor.scheduleWithFixedDelay(new Runnable() {

			@Override
			public void run() {
				try {
					for(Player player : players) {
						if(player != null && player.getFarmings() != null && !player.hasFinished())
							player.getFarmings().growAllPatches(player);
					}
				} catch (Throwable e) {

				}
			}

		}, 5, 5, TimeUnit.MINUTES);
	}


	private static void addMessageCheckTask() {
		GameEngine.slowExecutor.scheduleWithFixedDelay(new Runnable() {
			@Override
			public void run() {
				try {
					for (Player player : getPlayers()) {
						if (player.getMessageAmount() == 0)// if message != 0
							continue;
						player.resetMessageAmount();
					}
				} catch (Throwable e) {
					Logger.handle(e);
				}
			}
		}, 0, 11, TimeUnit.SECONDS);
	}
	
	public static final boolean removeObjectTemporary(final WorldObject object,
			long time) {
			removeObject(object);
			GameEngine.slowExecutor.schedule(new Runnable() {
				@Override
				public void run() {
					try {
						spawnObject(object);
					} catch (Throwable e) {
						Logger.handle(e);
					}
				}

			}, time, TimeUnit.MILLISECONDS);
			return true;
		}


	private static void addOwnedObjectsTask() {
		GameEngine.slowExecutor.scheduleWithFixedDelay(new Runnable() {
			@Override
			public void run() {
				try {
					OwnedObjectManager.processAll();
				} catch (Throwable e) {
					Logger.handle(e);
				}
			}
		}, 0, 1, TimeUnit.SECONDS);
	}

	private static void addRestoreShopItemsTask() {
		GameEngine.slowExecutor.scheduleWithFixedDelay(new Runnable() {
			@Override
			public void run() {
				try {
					//ShopsHandler.restoreShops();
				} catch (Throwable e) {
					Logger.handle(e);
				}
			}
		}, 0, 30, TimeUnit.SECONDS);
	}
	
	public static NPC getNPC(int npcId) {
		for (NPC npc : getNPCs()) {
			if (npc.getId() == npcId) {
				return npc;
			}
		}
		return null;
	}

	public static final NPC spawnNPC(int id, WorldTile tile,
			int mapAreaNameHash, boolean canBeAttackFromOutOfArea, EntityDirection faceDirection) {
		NPC returnValue = spawnNPC(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, false);
		returnValue.setDirection(faceDirection.getValue());
		return returnValue;
	}	

	private static final void addSummoningEffectTask() {
		GameEngine.slowExecutor.scheduleWithFixedDelay(new Runnable() {
			@Override
			public void run() {
				try {
					for (Player player : getPlayers()) {
						if (player == null || player.getFamiliar() == null || player.isDead()
								|| !player.hasFinished())
							continue;
						if (player.getFamiliar().getOriginalId() == 6814) {
							player.heal(20);
							player.setNextGraphics(new Graphics(1507));
						}
					}
				} catch (Throwable e) {
					Logger.handle(e);
				}
			}
		}, 0, 15, TimeUnit.SECONDS);
	}

	private static final void addRestoreSpecialAttackTask() {

		GameEngine.fastExecutor.schedule(new TimerTask() {
			@Override
			public void run() {
				try {
					for (Player player : getPlayers()) {
						if (player == null || player.isDead()
								|| !player.isRunning())
							continue;
						player.getCombatDefinitions().restoreSpecialAttack();
					}
				} catch (Throwable e) {
					Logger.handle(e);
				}
			}
		}, 0, 30000);
	}
	
	/**
	 * Registers an event.
	 * 
	 * @param task
	 */
	public static void submit(final GameTick task) {
		submit(task, task.getDelay());
	}

	public static void submit(Player player, final GameTick tick) {
		submit(player, tick, tick.getDelay());
	}

	public static void submit(final Player player, final GameTick tick,
			final double delay) {
		scheduleTask(new Runnable() {
			@Override
			public void run() {
				if (!tick.isStopped())
					tick.executeTask();
				if (!tick.isStopped())
					submit(tick, tick.getDelay());
			}
		}, (long) (delay * 1000), TimeUnit.MILLISECONDS);
	}
	
	/**
	 * @param task
	 */
	private final static ScheduledExecutorService tasks = Executors.newScheduledThreadPool(1);

	/**
	 * 
	 * @param runnable
	 * @param delay
	 * @param unit
	 */
	public static void scheduleTask(final Runnable runnable, long delay, TimeUnit unit) {
		tasks.schedule(new Runnable() {
			@Override
			public void run() {
				try {
					runnable.run();
				} catch (Exception e) {
				} catch (Throwable t) {
				}
			}
		}, delay, unit);
	}

	/**
	 * 
	 * @param task
	 */
	public static void submit(final Runnable task) {
		tasks.submit(new Runnable() {
			@Override
			public void run() {
				try {
					task.run();
				} catch (Exception e) {
				} catch (Throwable t) {
				}
			}
		});
	}

	public static void submit(Bot bot, final GameTick task) {
		bot.getBotActionHandler().setCurrentTick(task);
		submit(task, task.getDelay());
	}

	/**
	 * Registers an event.
	 * 
	 * @param delay
	 */
	public static void submit(final GameTick tick, final double delay) {
		scheduleTask(new Runnable() {
			@Override
			public void run() {
				if (!tick.isStopped())
					tick.executeTask();
				else
					return;
				if (!tick.isStopped())
					submit(tick, tick.getDelay());
			}
		}, (long) (delay * 1000), TimeUnit.MILLISECONDS);
	}

	private static boolean checkAgility;

	private static final void addTriviaBotTask() {
			GameEngine.slowExecutor.scheduleWithFixedDelay(new Runnable() {
				@Override
				public void run() {
					try {
						TriviaBot.Run();
					} catch (Throwable e) {
						Logger.handle(e);
					}
				}
			}, 5, 10, TimeUnit.MINUTES);
	}
	
	public static void penguinEvent() {
		GameEngine.slowExecutor.scheduleWithFixedDelay(new TimerTask() {
			@Override
			public void run() {
				try {
					for (final Player players : World.getPlayers()) {
						if (players == null)
							continue;
						players.foundPenguin = false;
					}
					for (final NPC n : World.getNPCs()) {
						if (n == null || n.getId() != 8104)
							continue;
						n.sendDeath(n);
					}
					for (final NPC n : World.getNPCs()) {
						if (n == null || n.getId() != 8105)
							continue;
						n.sendDeath(n);
					}
					for (final NPC n : World.getNPCs()) {
						if (n == null || n.getId() != 8107)
							continue;
						n.sendDeath(n);
					}
					for (final NPC n : World.getNPCs()) {
						if (n == null || n.getId() != 8108)
							continue;
						n.sendDeath(n);
					}
					for (final NPC n : World.getNPCs()) {
						if (n == null || n.getId() != 8109)
							continue;
						n.sendDeath(n);
					}
					for (final NPC n : World.getNPCs()) {
						if (n == null || n.getId() != 8110)
							continue;
						n.sendDeath(n);
					}
					for (final NPC n : World.getNPCs()) {
						if (n == null || n.getId() != 14766)
							continue;
						n.sendDeath(n);
					}
					for (final NPC n : World.getNPCs()) {
						if (n == null || n.getId() != 14415)
							continue;
						n.sendDeath(n);
					}
					PenguinEvent.startEvent();
				} catch (final Throwable e) {
					Logger.handle(e);
				}
			}
		}, 35, 40, TimeUnit.MINUTES);
	}

	private static final void addRestoreRunEnergyTask() {
		GameEngine.fastExecutor.schedule(new TimerTask() {
			@Override
			public void run() {
				try {
					for (Player player : getPlayers()) {
						if (player == null
								|| player.isDead()
								|| !player.isRunning()
								|| (checkAgility && player.getSkills()
										.getLevel(Skills.AGILITY) < 70))
							continue;
						player.restoreRunEnergy();
					}
					checkAgility = !checkAgility;
				} catch (Throwable e) {
					Logger.handle(e);
				}
			}
		}, 0, 1000);
	}

	private static final void addDrainPrayerTask() {
		GameEngine.fastExecutor.schedule(new TimerTask() {
			@Override
			public void run() {
				try {
					for (Player player : getPlayers()) {
						if (player == null || player.isDead()
								|| !player.isRunning())
							continue;
						player.getPrayer().processPrayerDrain();
					}
				} catch (Throwable e) {
					Logger.handle(e);
				}
			}
		}, 0, 600);
	}

	private static final void addRestoreHitPointsTask() {
		GameEngine.fastExecutor.schedule(new TimerTask() {
			@Override
			public void run() {
				try {
					for (Player player : getPlayers()) {
						if (player == null || player.isDead()
								|| !player.isRunning())
							continue;
						player.restoreHitPoints();
					}
					for (NPC npc : npcs) {
						if (npc == null || npc.isDead() || npc.hasFinished())
							continue;
						npc.restoreHitPoints();
					}
				} catch (Throwable e) {
					Logger.handle(e);
				}
			}
		}, 0, 6000);
	}

	private static final void addRestoreSkillsTask() {
		GameEngine.fastExecutor.schedule(new TimerTask() {
			@Override
			public void run() {
				try {
					for (Player player : getPlayers()) {
						if (player == null || !player.isRunning())
							continue;
						int ammountTimes = player.getPrayer().usingPrayer(0, 8) ? 2
								: 1;
						if (player.isResting())
							ammountTimes += 1;
						boolean berserker = player.getPrayer()
								.usingPrayer(1, 5);
						for (int skill = 0; skill < 25; skill++) {
							if (skill == Skills.SUMMONING)
								continue;
							for (int time = 0; time < ammountTimes; time++) {
								int currentLevel = player.getSkills().getLevel(
										skill);
								int normalLevel = player.getSkills()
										.getLevelForXp(skill);
								if (currentLevel > normalLevel) {
									if (skill == Skills.ATTACK
											|| skill == Skills.STRENGTH
											|| skill == Skills.DEFENCE
											|| skill == Skills.RANGE
											|| skill == Skills.MAGIC) {
										if (berserker
												&& Utils.getRandom(100) <= 15)
											continue;
									}
									player.getSkills().set(skill,
											currentLevel - 1);
								} else if (currentLevel < normalLevel)
									player.getSkills().set(skill,
											currentLevel + 1);
								else
									break;
							}
						}
					}
				} catch (Throwable e) {
					Logger.handle(e);
				}
			}
		}, 0, 30000);

	}

	public static int getWellAmount() {
		return wellAmount;
	}

	public static void addWellAmount(String displayName, int amount) {
		wellAmount += amount;
		sendWorldMessage("<col=FF0000>" + displayName + " has contributed " + NumberFormat.getNumberInstance(Locale.US).format(amount) + " GP to the XP well! Progress now: " + ((World.getWellAmount() * 100) / Settings.WELL_MAX_AMOUNT) + "%!", false);
	}

	public static void setWellAmount(int amount) {
		wellAmount = amount;
	}

	public static void resetWell() {
		wellAmount = 0;
		sendWorldMessage("<col=FF0000>The XP well has been reset!", false);
	}

	public static boolean isWellActive() {
		return wellActive;
	}

	public static void setWellActive(boolean wellActive) {
		World.wellActive = wellActive;
	}

	public static final Map<Integer, Region> getRegions() {
		return regions;
	}

	public static final Region getRegion(int id) {
		return getRegion(id, false);
	}

	public static final Region getRegion(int id, boolean load) {
		// synchronized (lock) {
		Region region = regions.get(id);
		if (region == null) {
			region = new Region(id);
			regions.put(id, region);
		}
		if(load)
			region.checkLoadMap();
		return region;
	}

	public static boolean addPlayer(Player player) {
		if(player == null)
			return false;
		if(!players.contains(player))
			players.add(player);
		return true;
	}

	public static boolean removePlayer(Player player) {
		if(player == null)
			return false;
		if(players.contains(player))
			players.remove(player);
		if(!player.isBot())
			AntiFlood.remove(player.getSession().getIP());
		return true;
	}

	public static final void addNPC(NPC npc) {
		npcs.add(npc);
	}

	public static final void removeNPC(NPC npc) {
		npcs.remove(npc);
	}
	
	public static final NPC spawnNPC(int id, WorldTile tile,
			int mapAreaNameHash, boolean canBeAttackFromOutOfArea,
			boolean spawned) {
		NPC n = null;
		HunterNPC hunterNPCs = HunterNPC.forId(id);
		if (hunterNPCs != null) {
			if (id == hunterNPCs.getNpcId()) {
				if (id == 5117 || id == 5116 || id == 5114 || id == 5115) {
					n = new HunterNetNPCS(id, tile, mapAreaNameHash,
						canBeAttackFromOutOfArea, spawned);
				} else {
					n = new ItemHunterNPC(id, tile, mapAreaNameHash,
						canBeAttackFromOutOfArea, spawned);
				}
			}
		}
		else if (WispInfo.forNpcId(id) != null)
		    n = new Wisp(id, tile);
		else if(id == 46 || id == 2693 || id == 6133) 
			n = new Ducks(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
		 else if (id == 5208 || id == 152 || id == 5207) 
			n = new DraynorDeadTree(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
		 else if (id == 5925) 
			n = new Benny(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
		 else if (id == 43 || (id >= 5156 && id <= 5164) || id == 5156 || id == 1765)
			    n = new Sheep(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
		else if (id == 1266 || id == 1268 || id == 2453 || id == 2886) 
			n = new RockCrabs(id, tile, mapAreaNameHash,
					canBeAttackFromOutOfArea, spawned);
		 else if (id == 6142 || id == 6144 || id == 6145 || id == 6143)
			n = new PestMonsters(id, tile, mapAreaNameHash,
					canBeAttackFromOutOfArea, spawned);
		else if (id >= 5533 && id <= 5558)
			n = new Elemental(id, tile, mapAreaNameHash,
					canBeAttackFromOutOfArea, spawned);
		else if(id == 3304)
			n = new FairyGodfather(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
		else if (id == 17182 || id == 17183 || id == 17184)
			 n = new Vorago(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		else if (id == 19457)
			 n = new Araxxi(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		else if (id == 17158 || id == 17159 || id == 17160 || id == 17185)
			 n = new VoragoMinion(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		else if (id == 9441)
			n = new FlameVortex(id, tile, mapAreaNameHash,
					canBeAttackFromOutOfArea, spawned);
		else if (id >= 8832 && id <= 8834)
			n = new LivingRock(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		else if (id >= 13465 && id <= 13481)
			n = new Revenant(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		else if (id == 1158 || id == 1160)
			n = new KalphiteQueen(id, tile, mapAreaNameHash,
					canBeAttackFromOutOfArea, spawned);
		else if (id == 13447)
		    n = ZarosGodwars.nex = new Nex(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
		else if (id == 13451)
		    n = new NexMinion(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		else if (id == 13452)
		    n = new NexMinion(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		else if (id == 13453)
		    n = new NexMinion(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		else if (id == 13454)
		    n = new NexMinion(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		else if (id == 6261 || id == 6263 || id == 6265)
			n = GodWarsBosses.graardorMinions[(id - 6261) / 2] = new GodWarMinion(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		else if (id == 6260)
			n = new GeneralGraardor(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		else if (id == 6222)
			n = new KreeArra(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		else if (id == 6223 || id == 6225 || id == 6227)
			n = GodWarsBosses.armadylMinions[(id - 6223) / 2] = new GodWarMinion(
					id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		else if (id == 6203)
			n = new KrilTstsaroth(id, tile, mapAreaNameHash,
					canBeAttackFromOutOfArea, spawned);
		else if (id == 6204 || id == 6206 || id == 6208)
			n = GodWarsBosses.zamorakMinions[(id - 6204) / 2] = new GodWarMinion(
					id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		else if (id >= 8528 && id <= 8532)
			n = new Nomad(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		else if (id == 6215 || id == 6211 || id == 3406 || id == 6216|| id == 6214 || id == 6215|| id == 6212 || id == 6219 || id == 6221 || id == 6218)
			n = new GodwarsZammorakFaction(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		else if (id == 6254  && id == 6259)
			n = new GodwarsSaradominFaction(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		else if (id == 6246 || id == 6236 || id == 6232 || id == 6240 || id == 6241 || id == 6242 || id == 6235 || id == 6234 || id == 6243 || id == 6236 || id == 6244 || id == 6237 || id == 6246 || id == 6238 || id == 6239 || id == 6230)
			n = new GodwarsArmadylFaction(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		else if (id == 6281 || id == 6282 || id == 6275 || id == 6279|| id == 9184 || id == 6268 || id == 6270 || id == 6274 || id == 6277 || id == 6276 || id == 6278)
			n = new GodwarsBandosFaction(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		else if (id == 6260)
			n = new GeneralGraardor(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		else if (id == 6222)
			n = new KreeArra(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		else if (id == 6203)
			n = new KrilTstsaroth(id, tile, mapAreaNameHash,
					canBeAttackFromOutOfArea, spawned);
		else if (id == 16697 || id == 16698 || id == 16699)
		    n = new KalphiteKing(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		else if (id == 50 || id == 2642)
			n = new KingBlackDragon(id, tile, mapAreaNameHash,
					canBeAttackFromOutOfArea, spawned);
		else if (id >= 9462 && id <= 9467)
			n = new Strykewyrm(id, tile, mapAreaNameHash,
					canBeAttackFromOutOfArea);
		else if (id == 6247)
			n = new CommanderZilyana(id, tile, mapAreaNameHash,
					canBeAttackFromOutOfArea, spawned);
		else if (id == 8133)
			n = new CorporealBeast(id, tile, mapAreaNameHash,
					canBeAttackFromOutOfArea, spawned);
		else if (id == 2417)
		    n = new WildyWyrm(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		else if (id == 14256)
			n = new Lucien(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea,
					spawned);
		else if (id == 15172)
			n = new MercenaryMage(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea,
					spawned);
		else if (id == 8349 || id == 8450 || id == 8451)
			n = new TormentedDemon(id, tile, mapAreaNameHash,
					canBeAttackFromOutOfArea, spawned);
		else if (id == 14301)
			n = new Glacor(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
		else if (id == 3200)
			n = new ChaosElemental(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		else if (id == 3478)
			n = new Cyclossus(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		else if (id >= 14688 && id <= 14701) 
			n = new PolyporeCreature(id, tile, mapAreaNameHash,
					canBeAttackFromOutOfArea, spawned);
		else 
			n = new NPC(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea,
					spawned);
		return n;
	}

	public static final NPC spawnNPC(int id, WorldTile tile,
			int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
		return spawnNPC(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, false);
	}

	public static final void spawnPortable(final WorldObject object, long time, final Player player, int type) {
		spawnPortable(object, time, player, false, type);
	}

	public static final void spawnPortable(final WorldObject object, long time, final Player player, final boolean clip,
			final int type) {
		spawnObject(object);
		GameEngine.slowExecutor.schedule(new Runnable() {
			@Override
			public void run() {
				try {
					if (!World.isSpawnedObject(object))
						return;
					removeObject(object);
					player.getPackets()
					.sendGameMessage("Your Portable "
							+ (type == PortablePlacing.FORGE ? "Forge"
									: type == PortablePlacing.RANGE ? "Range"
											: type == PortablePlacing.SAWMILL ? "Sawmill"
													: type == PortablePlacing.WELL ? "Well" : "")
							+ "'s  duration has come to an end.");
					player.spawnedForges[type] = false;
					player.portable = 0;
				} catch (Throwable e) {
					Logger.handle(e);
				}
			}

		}, time, TimeUnit.MILLISECONDS);
	}


	/*
	 * check if the entity region changed because moved or teled then we update
	 * it
	 */
	public static final void updateEntityRegion(Entity entity) {
		if (entity.hasFinished()) {
			if (entity instanceof Player)
				getRegion(entity.getLastRegionId()).removePlayerIndex(entity.getIndex());
			else 
				getRegion(entity.getLastRegionId()).removeNPCIndex(entity.getIndex());
			return;
		}
		int regionId = entity.getRegionId();
		if (entity.getLastRegionId() != regionId) { // map region entity at
			if (entity instanceof Player) {
				if (entity.getLastRegionId() > 0)
					getRegion(entity.getLastRegionId()).removePlayerIndex(
							entity.getIndex());
				Region region = getRegion(regionId);
				region.addPlayerIndex(entity.getIndex());
				Player player = (Player) entity;
				int musicId = region.getMusicId();
				if (musicId != -1)
					player.getMusicsManager().checkMusic(musicId);
				player.getControlerManager().moved();
				if(player.hasStarted())
					checkInstancesAtMove(player, true);
			} else {
				if (entity.getLastRegionId() > 0)
					getRegion(entity.getLastRegionId()).removeNPCIndex(
							entity.getIndex());
				getRegion(regionId).addNPCIndex(entity.getIndex());
			}
			entity.checkMultiArea();
			entity.setLastRegionId(regionId);
		} else {
			if (entity instanceof Player) {
				Player player = (Player) entity;
				player.getControlerManager().moved();
				if(player.hasStarted())
					checkInstancesAtMove(player, true);
			}
			entity.checkMultiArea();
		}
	}

	private static void checkInstancesAtMove(Player player, boolean isInstance) {
		if(Miscellania.isInArea(player)) {
			player.getThrone().setHasVisited(true);
		}
		if (player.getControlerManager().getControler() == null) {
			String control = null;
			if (!(player.getControlerManager().getControler() instanceof RequestController)
					&& RequestController.inWarRequest(player))
				control = "clan_wars_request";
			else if (FfaZone.inArea(player))
				control = "clan_wars_ffa";
			else if (LobbyControler.checkBounds(player))
				control = "LobbyControler";
			if (player.getRegionId() == 13626)
				control = "Kalaboss";
			else if (!MonkeyGreeGrees.isAtApeAtoll(player) && player.getRights() < 2) {
				if (player.getEquipment().getWeaponId() == 4024) {
					ButtonHandler.sendRemove(player, 3);
					player.getAppearence().transformIntoNPC(-1);
				}
			}
			if (control != null && isInstance)
				player.getControlerManager().startControler(control);
		}
	}

	public static boolean isFloorFree(int plane, int x, int y, int size) {
		for (int tileX = x; tileX < x + size; tileX++)
			for (int tileY = y; tileY < y + size; tileY++)
				if (!isFloorFree(plane, tileX, tileY))
					return false;
		return true;
	}

	public static boolean isFloorFree(int plane, int x, int y) {
		return (getMask(plane, x, y) & (Flags.FLOOR_BLOCKSWALK
				| Flags.FLOORDECO_BLOCKSWALK | Flags.OBJ)) == 0;
	}

	public static boolean isWallsFree(int plane, int x, int y) {
		return (getMask(plane, x, y) & (Flags.CORNEROBJ_NORTHEAST
				| Flags.CORNEROBJ_NORTHWEST | Flags.CORNEROBJ_SOUTHEAST
				| Flags.CORNEROBJ_SOUTHWEST | Flags.WALLOBJ_EAST
				| Flags.WALLOBJ_NORTH | Flags.WALLOBJ_SOUTH | Flags.WALLOBJ_WEST)) == 0;
	}

	/*
	 * checks clip
	 */
	public static boolean canMoveNPC(int plane, int x, int y, int size) {
		for (int tileX = x; tileX < x + size; tileX++)
			for (int tileY = y; tileY < y + size; tileY++)
				if (getMask(plane, tileX, tileY) != 0)
					return false;
		return true;
	}
	
	public static boolean canMoveNPC(WorldTile tile, int size) {
		for (int tileX = tile.getX(); tileX < tile.getX() + size; tileX++)
			for (int tileY = tile.getY(); tileY < tile.getY() + size; tileY++)
				if (getMask(tile.getPlane(), tileX, tileY) != 0)
					return false;
		return true;
	}

	/*
	 * checks clip
	 */
	public static boolean isNotCliped(int plane, int x, int y, int size) {
		for (int tileX = x; tileX < x + size; tileX++)
			for (int tileY = y; tileY < y + size; tileY++)
				if ((getMask(plane, tileX, tileY) & 2097152) != 0)
					return false;
		return true;
	}


	public static int getMask(int plane, int x, int y) {
		WorldTile tile = new WorldTile(x, y, plane);
		int regionId = tile.getRegionId();
		Region region = getRegion(regionId);
		if (region == null)
			return -1;
		int baseLocalX = x - ((regionId >> 8) * 64);
		int baseLocalY = y - ((regionId & 0xff) * 64);
		return region.getMask(tile.getPlane(), baseLocalX, baseLocalY);
	}

	public static void setMask(int plane, int x, int y, int mask) {
		WorldTile tile = new WorldTile(x, y, plane);
		int regionId = tile.getRegionId();
		Region region = getRegion(regionId);
		if (region == null)
			return;
		int baseLocalX = x - ((regionId >> 8) * 64);
		int baseLocalY = y - ((regionId & 0xff) * 64);
		region.setMask(tile.getPlane(), baseLocalX, baseLocalY, mask);
	}

	public static int getRotation(int plane, int x, int y) {
		WorldTile tile = new WorldTile(x, y, plane);
		int regionId = tile.getRegionId();
		Region region = getRegion(regionId);
		if (region == null)
			return 0;
		return 0;
	}

	private static int getClipedOnlyMask(int plane, int x, int y) {
		WorldTile tile = new WorldTile(x, y, plane);
		int regionId = tile.getRegionId();
		Region region = getRegion(regionId);
		if (region == null)
			return -1;
		int baseLocalX = x - ((regionId >> 8) * 64);
		int baseLocalY = y - ((regionId & 0xff) * 64);
		return region
				.getMaskClipedOnly(tile.getPlane(), baseLocalX, baseLocalY);
	}

	public static void executeAfterLoadRegion(final int regionId, final Runnable event) {
		executeAfterLoadRegion(regionId, 0, event);
	}

	public static void executeAfterLoadRegion(final int regionId, long startTime, final Runnable event) {
		executeAfterLoadRegion(regionId, startTime, 10000, event);
	}

	public static void executeAfterLoadRegion(final int fromRegionX, final int fromRegionY, final int toRegionX,
			final int toRegionY, long startTime, final long expireTime, final Runnable event) {
		final long start = Utils.currentTimeMillis();
		for (int x = fromRegionX; x <= toRegionX; x++) {
			for (int y = fromRegionY; y <= toRegionY; y++) {
				int regionId = MapUtils.encode(Structure.REGION, x, y);
				World.getRegion(regionId, true); // forces check load if not
				// loaded
			}
		}
		GameEngine.fastExecutor.schedule(new TimerTask() {

			@Override
			public void run() {
				try {
					for (int x = fromRegionX; x <= toRegionX; x++) {
						for (int y = fromRegionY; y <= toRegionY; y++) {
							int regionId = MapUtils.encode(Structure.REGION, x, y);
							if (!World.isRegionLoaded(regionId) && Utils.currentTimeMillis() - start < expireTime)
								return;
						}
					}
					event.run();
					cancel();
				} catch (Throwable e) {
					e.printStackTrace();
				}
			}

		}, startTime, 600);
	}

	/*
	 * TODO make this use code from above to save lines lo, they do same
	 */
	public static void executeAfterLoadRegion(final int regionId, long startTime, final long expireTime,
			final Runnable event) {
		final long start = Utils.currentTimeMillis();
		World.getRegion(regionId, true); // forces check load if not loaded
		GameEngine.fastExecutor.schedule(new TimerTask() {

			@Override
			public void run() {
				try {
					if (!World.isRegionLoaded(regionId) && Utils.currentTimeMillis() - start < expireTime)
						return;
					event.run();
					cancel();
				} catch (Throwable e) {
					e.printStackTrace();
				}
			}

		}, startTime, 600);
	}

	/*
	 * checks clip
	 */
	public static boolean isRegionLoaded(int regionId) {
		Region region = getRegion(regionId);
		if (region == null)
			return false;
		return region.getLoadMapStage() == 2;
	}

	public static final boolean checkProjectileStep(int plane, int x, int y,
			int dir, int size) {
		int xOffset = Utils.DIRECTION_DELTA_X[dir];
		int yOffset = Utils.DIRECTION_DELTA_Y[dir];
		/*
		 * int rotation = getRotation(plane,x+xOffset,y+yOffset); if(rotation !=
		 * 0) { dir += rotation; if(dir >= Utils.DIRECTION_DELTA_X.length) dir =
		 * dir - (Utils.DIRECTION_DELTA_X.length-1); xOffset =
		 * Utils.DIRECTION_DELTA_X[dir]; yOffset = Utils.DIRECTION_DELTA_Y[dir];
		 * }
		 */
		if (size == 1) {
			int mask = getClipedOnlyMask(plane, x
					+ Utils.DIRECTION_DELTA_X[dir], y
					+ Utils.DIRECTION_DELTA_Y[dir]);
			if (xOffset == -1 && yOffset == 0)
				return (mask & 0x42240000) == 0;
			if (xOffset == 1 && yOffset == 0)
				return (mask & 0x60240000) == 0;
			if (xOffset == 0 && yOffset == -1)
				return (mask & 0x40a40000) == 0;
			if (xOffset == 0 && yOffset == 1)
				return (mask & 0x48240000) == 0;
			if (xOffset == -1 && yOffset == -1) {
				return (mask & 0x43a40000) == 0
						&& (getClipedOnlyMask(plane, x - 1, y) & 0x42240000) == 0
						&& (getClipedOnlyMask(plane, x, y - 1) & 0x40a40000) == 0;
			}
			if (xOffset == 1 && yOffset == -1) {
				return (mask & 0x60e40000) == 0
						&& (getClipedOnlyMask(plane, x + 1, y) & 0x60240000) == 0
						&& (getClipedOnlyMask(plane, x, y - 1) & 0x40a40000) == 0;
			}
			if (xOffset == -1 && yOffset == 1) {
				return (mask & 0x4e240000) == 0
						&& (getClipedOnlyMask(plane, x - 1, y) & 0x42240000) == 0
						&& (getClipedOnlyMask(plane, x, y + 1) & 0x48240000) == 0;
			}
			if (xOffset == 1 && yOffset == 1) {
				return (mask & 0x78240000) == 0
						&& (getClipedOnlyMask(plane, x + 1, y) & 0x60240000) == 0
						&& (getClipedOnlyMask(plane, x, y + 1) & 0x48240000) == 0;
			}
		} else if (size == 2) {
			if (xOffset == -1 && yOffset == 0)
				return (getClipedOnlyMask(plane, x - 1, y) & 0x43a40000) == 0
				&& (getClipedOnlyMask(plane, x - 1, y + 1) & 0x4e240000) == 0;
			if (xOffset == 1 && yOffset == 0)
				return (getClipedOnlyMask(plane, x + 2, y) & 0x60e40000) == 0
				&& (getClipedOnlyMask(plane, x + 2, y + 1) & 0x78240000) == 0;
			if (xOffset == 0 && yOffset == -1)
				return (getClipedOnlyMask(plane, x, y - 1) & 0x43a40000) == 0
				&& (getClipedOnlyMask(plane, x + 1, y - 1) & 0x60e40000) == 0;
			if (xOffset == 0 && yOffset == 1)
				return (getClipedOnlyMask(plane, x, y + 2) & 0x4e240000) == 0
				&& (getClipedOnlyMask(plane, x + 1, y + 2) & 0x78240000) == 0;
			if (xOffset == -1 && yOffset == -1)
				return (getClipedOnlyMask(plane, x - 1, y) & 0x4fa40000) == 0
				&& (getClipedOnlyMask(plane, x - 1, y - 1) & 0x43a40000) == 0
				&& (getClipedOnlyMask(plane, x, y - 1) & 0x63e40000) == 0;
			if (xOffset == 1 && yOffset == -1)
				return (getClipedOnlyMask(plane, x + 1, y - 1) & 0x63e40000) == 0
				&& (getClipedOnlyMask(plane, x + 2, y - 1) & 0x60e40000) == 0
				&& (getClipedOnlyMask(plane, x + 2, y) & 0x78e40000) == 0;
			if (xOffset == -1 && yOffset == 1)
				return (getClipedOnlyMask(plane, x - 1, y + 1) & 0x4fa40000) == 0
				&& (getClipedOnlyMask(plane, x - 1, y + 1) & 0x4e240000) == 0
				&& (getClipedOnlyMask(plane, x, y + 2) & 0x7e240000) == 0;
			if (xOffset == 1 && yOffset == 1)
				return (getClipedOnlyMask(plane, x + 1, y + 2) & 0x7e240000) == 0
				&& (getClipedOnlyMask(plane, x + 2, y + 2) & 0x78240000) == 0
				&& (getClipedOnlyMask(plane, x + 1, y + 1) & 0x78e40000) == 0;
		} else {
			if (xOffset == -1 && yOffset == 0) {
				if ((getClipedOnlyMask(plane, x - 1, y) & 0x43a40000) != 0
						|| (getClipedOnlyMask(plane, x - 1, -1 + (y + size)) & 0x4e240000) != 0)
					return false;
				for (int sizeOffset = 1; sizeOffset < size - 1; sizeOffset++)
					if ((getClipedOnlyMask(plane, x - 1, y + sizeOffset) & 0x4fa40000) != 0)
						return false;
			} else if (xOffset == 1 && yOffset == 0) {
				if ((getClipedOnlyMask(plane, x + size, y) & 0x60e40000) != 0
						|| (getClipedOnlyMask(plane, x + size, y - (-size + 1)) & 0x78240000) != 0)
					return false;
				for (int sizeOffset = 1; sizeOffset < size - 1; sizeOffset++)
					if ((getClipedOnlyMask(plane, x + size, y + sizeOffset) & 0x78e40000) != 0)
						return false;
			} else if (xOffset == 0 && yOffset == -1) {
				if ((getClipedOnlyMask(plane, x, y - 1) & 0x43a40000) != 0
						|| (getClipedOnlyMask(plane, x + size - 1, y - 1) & 0x60e40000) != 0)
					return false;
				for (int sizeOffset = 1; sizeOffset < size - 1; sizeOffset++)
					if ((getClipedOnlyMask(plane, x + sizeOffset, y - 1) & 0x63e40000) != 0)
						return false;
			} else if (xOffset == 0 && yOffset == 1) {
				if ((getClipedOnlyMask(plane, x, y + size) & 0x4e240000) != 0
						|| (getClipedOnlyMask(plane, x + (size - 1), y + size) & 0x78240000) != 0)
					return false;
				for (int sizeOffset = 1; sizeOffset < size - 1; sizeOffset++)
					if ((getClipedOnlyMask(plane, x + sizeOffset, y + size) & 0x7e240000) != 0)
						return false;
			} else if (xOffset == -1 && yOffset == -1) {
				if ((getClipedOnlyMask(plane, x - 1, y - 1) & 0x43a40000) != 0)
					return false;
				for (int sizeOffset = 1; sizeOffset < size; sizeOffset++)
					if ((getClipedOnlyMask(plane, x - 1, y + (-1 + sizeOffset)) & 0x4fa40000) != 0
					|| (getClipedOnlyMask(plane, sizeOffset - 1 + x,
							y - 1) & 0x63e40000) != 0)
						return false;
			} else if (xOffset == 1 && yOffset == -1) {
				if ((getClipedOnlyMask(plane, x + size, y - 1) & 0x60e40000) != 0)
					return false;
				for (int sizeOffset = 1; sizeOffset < size; sizeOffset++)
					if ((getClipedOnlyMask(plane, x + size, sizeOffset
							+ (-1 + y)) & 0x78e40000) != 0
							|| (getClipedOnlyMask(plane, x + sizeOffset, y - 1) & 0x63e40000) != 0)
						return false;
			} else if (xOffset == -1 && yOffset == 1) {
				if ((getClipedOnlyMask(plane, x - 1, y + size) & 0x4e240000) != 0)
					return false;
				for (int sizeOffset = 1; sizeOffset < size; sizeOffset++)
					if ((getClipedOnlyMask(plane, x - 1, y + sizeOffset) & 0x4fa40000) != 0
					|| (getClipedOnlyMask(plane, -1 + (x + sizeOffset),
							y + size) & 0x7e240000) != 0)
						return false;
			} else if (xOffset == 1 && yOffset == 1) {
				if ((getClipedOnlyMask(plane, x + size, y + size) & 0x78240000) != 0)
					return false;
				for (int sizeOffset = 1; sizeOffset < size; sizeOffset++)
					if ((getClipedOnlyMask(plane, x + sizeOffset, y + size) & 0x7e240000) != 0
					|| (getClipedOnlyMask(plane, x + size, y
							+ sizeOffset) & 0x78e40000) != 0)
						return false;
			}
		}
		return true;
	}

	public static final boolean checkWalkStep(int plane, int x, int y, int dir,
			int size) {
		int xOffset = Utils.DIRECTION_DELTA_X[dir];
		int yOffset = Utils.DIRECTION_DELTA_Y[dir];
		int rotation = getRotation(plane, x + xOffset, y + yOffset);
		if (rotation != 0) {
			for (int rotate = 0; rotate < (4 - rotation); rotate++) {
				int fakeChunckX = xOffset;
				int fakeChunckY = yOffset;
				xOffset = fakeChunckY;
				yOffset = 0 - fakeChunckX;
			}
		}

		if (size == 1) {
			int mask = getMask(plane, x + Utils.DIRECTION_DELTA_X[dir], y
					+ Utils.DIRECTION_DELTA_Y[dir]);
			if (xOffset == -1 && yOffset == 0)
				return (mask & 0x42240000) == 0;
			if (xOffset == 1 && yOffset == 0)
				return (mask & 0x60240000) == 0;
			if (xOffset == 0 && yOffset == -1)
				return (mask & 0x40a40000) == 0;
			if (xOffset == 0 && yOffset == 1)
				return (mask & 0x48240000) == 0;
			if (xOffset == -1 && yOffset == -1) {
				return (mask & 0x43a40000) == 0
						&& (getMask(plane, x - 1, y) & 0x42240000) == 0
						&& (getMask(plane, x, y - 1) & 0x40a40000) == 0;
			}
			if (xOffset == 1 && yOffset == -1) {
				return (mask & 0x60e40000) == 0
						&& (getMask(plane, x + 1, y) & 0x60240000) == 0
						&& (getMask(plane, x, y - 1) & 0x40a40000) == 0;
			}
			if (xOffset == -1 && yOffset == 1) {
				return (mask & 0x4e240000) == 0
						&& (getMask(plane, x - 1, y) & 0x42240000) == 0
						&& (getMask(plane, x, y + 1) & 0x48240000) == 0;
			}
			if (xOffset == 1 && yOffset == 1) {
				return (mask & 0x78240000) == 0
						&& (getMask(plane, x + 1, y) & 0x60240000) == 0
						&& (getMask(plane, x, y + 1) & 0x48240000) == 0;
			}
		} else if (size == 2) {
			if (xOffset == -1 && yOffset == 0)
				return (getMask(plane, x - 1, y) & 0x43a40000) == 0
				&& (getMask(plane, x - 1, y + 1) & 0x4e240000) == 0;
			if (xOffset == 1 && yOffset == 0)
				return (getMask(plane, x + 2, y) & 0x60e40000) == 0
				&& (getMask(plane, x + 2, y + 1) & 0x78240000) == 0;
			if (xOffset == 0 && yOffset == -1)
				return (getMask(plane, x, y - 1) & 0x43a40000) == 0
				&& (getMask(plane, x + 1, y - 1) & 0x60e40000) == 0;
			if (xOffset == 0 && yOffset == 1)
				return (getMask(plane, x, y + 2) & 0x4e240000) == 0
				&& (getMask(plane, x + 1, y + 2) & 0x78240000) == 0;
			if (xOffset == -1 && yOffset == -1)
				return (getMask(plane, x - 1, y) & 0x4fa40000) == 0
				&& (getMask(plane, x - 1, y - 1) & 0x43a40000) == 0
				&& (getMask(plane, x, y - 1) & 0x63e40000) == 0;
			if (xOffset == 1 && yOffset == -1)
				return (getMask(plane, x + 1, y - 1) & 0x63e40000) == 0
				&& (getMask(plane, x + 2, y - 1) & 0x60e40000) == 0
				&& (getMask(plane, x + 2, y) & 0x78e40000) == 0;
			if (xOffset == -1 && yOffset == 1)
				return (getMask(plane, x - 1, y + 1) & 0x4fa40000) == 0
				&& (getMask(plane, x - 1, y + 1) & 0x4e240000) == 0
				&& (getMask(plane, x, y + 2) & 0x7e240000) == 0;
			if (xOffset == 1 && yOffset == 1)
				return (getMask(plane, x + 1, y + 2) & 0x7e240000) == 0
				&& (getMask(plane, x + 2, y + 2) & 0x78240000) == 0
				&& (getMask(plane, x + 1, y + 1) & 0x78e40000) == 0;
		} else {
			if (xOffset == -1 && yOffset == 0) {
				if ((getMask(plane, x - 1, y) & 0x43a40000) != 0
						|| (getMask(plane, x - 1, -1 + (y + size)) & 0x4e240000) != 0)
					return false;
				for (int sizeOffset = 1; sizeOffset < size - 1; sizeOffset++)
					if ((getMask(plane, x - 1, y + sizeOffset) & 0x4fa40000) != 0)
						return false;
			} else if (xOffset == 1 && yOffset == 0) {
				if ((getMask(plane, x + size, y) & 0x60e40000) != 0
						|| (getMask(plane, x + size, y - (-size + 1)) & 0x78240000) != 0)
					return false;
				for (int sizeOffset = 1; sizeOffset < size - 1; sizeOffset++)
					if ((getMask(plane, x + size, y + sizeOffset) & 0x78e40000) != 0)
						return false;
			} else if (xOffset == 0 && yOffset == -1) {
				if ((getMask(plane, x, y - 1) & 0x43a40000) != 0
						|| (getMask(plane, x + size - 1, y - 1) & 0x60e40000) != 0)
					return false;
				for (int sizeOffset = 1; sizeOffset < size - 1; sizeOffset++)
					if ((getMask(plane, x + sizeOffset, y - 1) & 0x63e40000) != 0)
						return false;
			} else if (xOffset == 0 && yOffset == 1) {
				if ((getMask(plane, x, y + size) & 0x4e240000) != 0
						|| (getMask(plane, x + (size - 1), y + size) & 0x78240000) != 0)
					return false;
				for (int sizeOffset = 1; sizeOffset < size - 1; sizeOffset++)
					if ((getMask(plane, x + sizeOffset, y + size) & 0x7e240000) != 0)
						return false;
			} else if (xOffset == -1 && yOffset == -1) {
				if ((getMask(plane, x - 1, y - 1) & 0x43a40000) != 0)
					return false;
				for (int sizeOffset = 1; sizeOffset < size; sizeOffset++)
					if ((getMask(plane, x - 1, y + (-1 + sizeOffset)) & 0x4fa40000) != 0
					|| (getMask(plane, sizeOffset - 1 + x, y - 1) & 0x63e40000) != 0)
						return false;
			} else if (xOffset == 1 && yOffset == -1) {
				if ((getMask(plane, x + size, y - 1) & 0x60e40000) != 0)
					return false;
				for (int sizeOffset = 1; sizeOffset < size; sizeOffset++)
					if ((getMask(plane, x + size, sizeOffset + (-1 + y)) & 0x78e40000) != 0
					|| (getMask(plane, x + sizeOffset, y - 1) & 0x63e40000) != 0)
						return false;
			} else if (xOffset == -1 && yOffset == 1) {
				if ((getMask(plane, x - 1, y + size) & 0x4e240000) != 0)
					return false;
				for (int sizeOffset = 1; sizeOffset < size; sizeOffset++)
					if ((getMask(plane, x - 1, y + sizeOffset) & 0x4fa40000) != 0
					|| (getMask(plane, -1 + (x + sizeOffset), y + size) & 0x7e240000) != 0)
						return false;
			} else if (xOffset == 1 && yOffset == 1) {
				if ((getMask(plane, x + size, y + size) & 0x78240000) != 0)
					return false;
				for (int sizeOffset = 1; sizeOffset < size; sizeOffset++)
					if ((getMask(plane, x + sizeOffset, y + size) & 0x7e240000) != 0
					|| (getMask(plane, x + size, y + sizeOffset) & 0x78e40000) != 0)
						return false;
			}
		}
		return true;
	}

	public static final boolean containsPlayer(String username) {
		for (Player p2 : players) {
			if (p2 == null)
				continue;
			if (p2.getUsername().equals(username))
				return true;
		}
		return false;
	}

	public static Player getPlayer(String username) {
		for (Player player : getPlayers()) {
			if (player == null)
				continue;
			if (player.getUsername().equals(username))
				return player;
		}
		return null;
	}

	public static final Player getPlayerByDisplayName(String username) {
		String formatedUsername = Utils.formatPlayerNameForDisplay(username);
		for (Player player : getPlayers()) {
			if (player == null)
				continue;
			if (player.getUsername().equalsIgnoreCase(formatedUsername)
					|| player.getDisplayName().equalsIgnoreCase(formatedUsername))
				return player;
		}
		return null;
	}

	public static final EntityList<Player> getPlayers() {
		return players;
	}

	public static final EntityList<NPC> getNPCs() {
		return npcs;
	}

	private World() {

	}

	public static final void safeShutdown(final boolean restart, int delay) {
		if (exiting_start != 0)
			return;
		exiting_start = Utils.currentTimeMillis();
		exiting_delay = delay;
		for (Player player : World.getPlayers()) {
			if (player == null || !player.hasStarted() || player.hasFinished())
				continue;
			player.getPackets().sendSystemUpdate(delay);
		}
		GameEngine.slowExecutor.schedule(new Runnable() {
			@Override
			public void run() {
				try {
					for (Player player : World.getPlayers()) {
						if (player == null || !player.hasStarted())
							continue;
						player.realFinish();
					}
					GrandExchange.save();
					IPBanL.save();
					PkRank.save();
					if (restart)
						Launcher.restart();
					else
						Launcher.shutdown();
				} catch (Throwable e) {
					Logger.handle(e);
				}
			}
		}, delay, TimeUnit.SECONDS);
	}

	public static final WorldObject getRealObject(WorldTile tile, int slot) {
		return getRegion(tile.getRegionId()).getRealObject(tile.getPlane(), tile.getXInRegion(), tile.getYInRegion(),
				slot);
	}

	public static final WorldObject getStandartObject(WorldTile tile) {
		return getRegion(tile.getRegionId()).getStandartObject(tile.getPlane(),
				tile.getXInRegion(), tile.getYInRegion());
	}

	public static final WorldObject getObjectWithType(WorldTile tile, int type) {
		return getRegion(tile.getRegionId()).getObjectWithType(tile.getPlane(),
				tile.getXInRegion(), tile.getYInRegion(), type);
	}

	public static final WorldObject getObjectWithSlot(WorldTile tile, int slot) {
		return getRegion(tile.getRegionId()).getObjectWithSlot(tile.getPlane(),
				tile.getXInRegion(), tile.getYInRegion(), slot);
	}

	public static final boolean containsObjectWithId(WorldTile tile, int id) {
		return getRegion(tile.getRegionId()).containsObjectWithId(
				tile.getPlane(), tile.getXInRegion(), tile.getYInRegion(), id);
	}

	public static final WorldObject getObjectWithId(WorldTile tile, int id) {
		return getRegion(tile.getRegionId()).getObjectWithId(tile.getPlane(),
				tile.getXInRegion(), tile.getYInRegion(), id);
	}

	public static final WorldObject getObject(WorldTile tile) {
		return getRegion(tile.getRegionId()).getStandartObject(tile.getPlane(), tile.getXInRegion(), tile.getYInRegion());
	}

	public static final WorldObject getObject(WorldTile tile, int type) {
		return getRegion(tile.getRegionId()).getObjectWithType(tile.getPlane(), tile.getXInRegion(), tile.getYInRegion(), type);
	}


	public static final void spawnObject(WorldObject object, boolean clip) {
		getRegion(object.getRegionId()).spawnObject(object, object.getPlane(), object.getXInRegion(), object.getYInRegion(), false);
	}

	public static final void spawnObjectSpawns(WorldObject object) {
		getRegion(object.getRegionId()).spawnObject(object, object.getPlane(), object.getXInRegion(), object.getYInRegion(), true);
	}

	public static final void spawnObject(WorldObject object) {
		getRegion(object.getRegionId()).spawnObject(object, object.getPlane(), object.getXInRegion(), object.getYInRegion(), false);
	}

	public static void destroySpawnedObject(WorldObject object, boolean clip) {
		getRegion(object.getRegionId()).removeObject(object, object.getPlane(), object.getXInRegion(), object.getYInRegion());
	}

	public static void destroySpawnedObject(WorldObject object) {
		getRegion(object.getRegionId()).removeObject(object, object.getPlane(), object.getXInRegion(), object.getYInRegion());
	}

	public static final void removeObject(WorldObject object) {
		getRegion(object.getRegionId()).removeObject(object, object.getPlane(), object.getXInRegion(), object.getYInRegion());
	}

	public static final void removeObject(WorldObject object, boolean b) {
		getRegion(object.getRegionId()).removeObject(object, object.getPlane(), object.getXInRegion(), object.getYInRegion());
	}


	/*
	 * by default doesnt changeClipData
	 */
	public static final void spawnTemporaryObject(final WorldObject object, long time) {
		spawnTemporaryObject(object, time, false);
	}

	public static final void spawnTemporaryOwnedObject(final WorldObject object, long time, final Player player) {
		spawnTemporaryOwnedObject(object, time, player, false);
	}

	public static final void spawnTemporaryOwnedObject(final WorldObject object, long time, final Player player,
			final boolean clip) {
		spawnObject(object);
		GameEngine.slowExecutor.schedule(new Runnable() {
			@Override
			public void run() {
				try {
					if (!World.isSpawnedObject(object))
						return;
					removeObject(object);
					player.divine = 0;
				} catch (Throwable e) {
					Logger.handle(e);
				}
			}

		}, time, TimeUnit.MILLISECONDS);
	}


	public static final void spawnTemporaryObject(final WorldObject object, long time, final boolean clip) {
		spawnObject(object);
		GameEngine.slowExecutor.schedule(new Runnable() {
			@Override
			public void run() {
				try {
					if (!World.isSpawnedObject(object))
						return;
					removeObject(object);
				} catch (Throwable e) {
					Logger.handle(e);
				}
			}

		}, time, TimeUnit.MILLISECONDS);
	}

	public static final boolean isSpawnedObject(WorldObject object) {
		final int regionId = object.getRegionId();
		WorldObject spawnedObject = getRegion(regionId)
				.getSpawnedObject(object);
		if (spawnedObject != null && object.getId() == spawnedObject.getId())
			return true;
		return false;
	}

	public static final boolean removeTemporaryObject(final WorldObject object, long time, final boolean clip) {
		removeObject(object);
		GameEngine.slowExecutor.schedule(new Runnable() {
			@Override
			public void run() {
				try {
					spawnObject(object, false);
				} catch (Throwable e) {
					Logger.handle(e);
				}
			}
		}, time, TimeUnit.MILLISECONDS);
		return true;
	}

	public static final void spawnObjectTemporary(final WorldObject object, long time,
			final boolean checkObjectInstance, boolean checkObjectBefore) {
		final WorldObject before = checkObjectBefore ? World.getObjectWithType(object, object.getType()) : null;
		spawnObject(object);
		GameEngine.slowExecutor.schedule(new Runnable() {
			@Override
			public void run() {
				try {
					if (checkObjectInstance && World.getObjectWithId(object, object.getId()) != object)
						return;
					if (before != null)
						spawnObject(before);
					else
						removeObject(object); // this method allows to remove
					// object with just tile and type
					// actualy so the removing object
					// may be diferent and still gets
					// removed
				} catch (Throwable e) {
					Logger.handle(e);
				}
			}

		}, time, TimeUnit.MILLISECONDS);
	}

	public static final void spawnObjectTemporary(final WorldObject object,
			long time) {
		spawnObject(object);
		GameEngine.slowExecutor.schedule(new Runnable() {
			@Override
			public void run() {
				try {
					if (!World.isSpawnedObject(object))
						return;
					removeObject(object);
				} catch (Throwable e) {
					Logger.handle(e);
				}
			}

		}, time, TimeUnit.MILLISECONDS);
	}

	public static final void addGroundItem(final Item item,
			final WorldTile tile, final Player owner/* null for default */,
			final boolean underGrave, long hiddenTime/* default 3minutes */,
			boolean invisible) {
		addGroundItem(item, tile, owner, underGrave, hiddenTime, invisible, false, 180);
	}
	
	

	public static final void addGroundItem(final Item item,
			final WorldTile tile, final Player owner/* null for default */,
			final boolean underGrave, long hiddenTime/* default 3minutes */,
			boolean invisible, boolean intoGold) {
		addGroundItem(item, tile, owner, underGrave, hiddenTime, invisible, intoGold, 180);
	}

	public static final void addGroundItem(final Item item,
			final WorldTile tile, final Player owner/* null for default */,
			final boolean underGrave, long hiddenTime/* default 3minutes */,
			boolean invisible, boolean intoGold, final int publicTime) {
		if(intoGold) {
			if(!ItemConstants.isTradeable(item)) {
				int price = item.getDefinitions().getValue();
				if(price <= 0) 
					return;
				if (item.getId() == 12675 || item.getId() == 15016) {
					item.setId(995);
					item.setAmount(22000);
					return;
				}
				item.setId(995);
				item.setAmount(price);
			}
		}
		final FloorItem floorItem = new FloorItem(item, tile, owner,
				owner == null ? false : underGrave, invisible);
		final Region region = getRegion(tile.getRegionId());
		region.forceGetFloorItems().add(floorItem);
		if (invisible && hiddenTime != -1) {
			if (owner != null)
				owner.getPackets().sendGroundItem(floorItem);
			GameEngine.slowExecutor.schedule(new Runnable() {
				@Override
				public void run() {
					try {
						if (!region.forceGetFloorItems().contains(floorItem))
							return;
						int regionId = tile.getRegionId();
						if (underGrave || !ItemConstants.isTradeable(floorItem) || item.getName().contains("Dr nabanik")) {
							region.forceGetFloorItems().remove(floorItem);
							if(owner != null) {
								if (owner.getMapRegionsIds().contains(regionId) && owner.getPlane() == tile.getPlane())
									owner.getPackets().sendRemoveGroundItem(floorItem);
							}
							return;
						}

						floorItem.setInvisible(false);
						for (Player player : players) {
							if (player == null
									|| player == owner
									|| !player.hasStarted()
									|| player.hasFinished()
									|| player.getPlane() != tile.getPlane()
									|| !player.getMapRegionsIds().contains(
											regionId))
								continue;
							player.getPackets().sendGroundItem(floorItem);
						}
						removeGroundItem(floorItem, publicTime);
					} catch (Throwable e) {
						Logger.handle(e);
					}
				}
			}, hiddenTime, TimeUnit.SECONDS);
			return;
		}
		int regionId = tile.getRegionId();
		for (Player player : players) {
			if (player == null || !player.hasStarted() || player.hasFinished()
					|| player.getPlane() != tile.getPlane()
					|| !player.getMapRegionsIds().contains(regionId))
				continue;
			player.getPackets().sendGroundItem(floorItem);
		}
		removeGroundItem(floorItem, publicTime);
	}
	
	/*
	 * used for dung
	 */
	public static final boolean removeGroundItem(final FloorItem floorItem) {
		int regionId = floorItem.getTile().getRegionId();
		Region region = getRegion(regionId);
		if (!region.getGroundItemsSafe().contains(floorItem))
			return false;
		region.getGroundItemsSafe().remove(floorItem);
		for (Player player : World.getPlayers()) {
			if (player == null || !player.hasStarted() || player.hasFinished()
					|| !player.getMapRegionsIds().contains(regionId))
				continue;
			player.getPackets().sendRemoveGroundItem(floorItem);
		}
		return true;
	}

	private static final void removeGroundItem(final FloorItem floorItem, long publicTime) {
		if (publicTime < 0) {
			return;
		}
		GameEngine.slowExecutor.schedule(new Runnable() {
			@Override
			public void run() {
				try {
					int regionId = floorItem.getTile().getRegionId();
					Region region = getRegion(regionId);
					if (!region.forceGetFloorItems().contains(floorItem))
						return;
					region.forceGetFloorItems().remove(floorItem);
					for (Player player : World.getPlayers()) {
						if (player == null
								|| !player.hasStarted()
								|| player.hasFinished()
								|| player.getPlane() != floorItem.getTile()
								.getPlane()
								|| !player.getMapRegionsIds()
								.contains(regionId))
							continue;
						player.getPackets().sendRemoveGroundItem(floorItem);
					}
				} catch (Throwable e) {
					Logger.handle(e);
				}
			}
		}, publicTime, TimeUnit.SECONDS);
	}

	public static final boolean removeGroundItem(Player player,
			FloorItem floorItem) {
		return removeGroundItem(player, floorItem, true);
	}

	public static final boolean removeGroundItem(Player player, FloorItem floorItem, boolean add) {
		int regionId = floorItem.getTile().getRegionId();
		Region region = getRegion(regionId);

		if (!region.forceGetFloorItems().contains(floorItem))
			return false;

		int amount = floorItem.getAmount();

		if (floorItem.getDefinitions().isStackable()) {
			int inInventory = player.getInventory().getItems().getNumberOf(floorItem.getId());
			if (inInventory > 0) {
				if (inInventory + amount < 0) {
					amount = Integer.MAX_VALUE - inInventory;
				}
			} else {
				if (player.getInventory().getFreeSlots() < 1) {
					player.sm("You don't have enough inventory space to pick this up.");
					return false;
				}
			}
		} else {
			if (player.getInventory().getFreeSlots() < 1) {
				player.sm("You don't have enough inventory space to pick this up.");
				return false;
			}
			if (floorItem.getAmount() > player.getInventory().getFreeSlots()) {
				amount = player.getInventory().getFreeSlots();
			}
		}

		if (amount <= 0) {
			if (floorItem.getDefinitions().isStackable()) {
				player.sm("You are carrying too much of this item.");
			} else
				player.sm("You don't have enough inventory space to pick this up.");
			return false;
		}

		if (add) 
			player.getInventory().addItem(floorItem.getId(), amount);

		floorItem.setAmount(floorItem.getAmount() - amount);

		if (floorItem.getAmount() > 0) {
			return false;
		}

		region.forceGetFloorItems().remove(floorItem);

		if (floorItem.isInvisible()/* || floorItem.isGrave()*/) {
			player.getPackets().sendRemoveGroundItem(floorItem);
			return true;
		} else {
			for (Player p2 : World.getPlayers()) {
				if (p2 == null || !p2.hasStarted() || p2.hasFinished()
						|| p2.getPlane() != floorItem.getTile().getPlane()
						|| !p2.getMapRegionsIds().contains(regionId))
					continue;
				p2.getPackets().sendRemoveGroundItem(floorItem);
			}
			return true;
		}
	}

	public static final void sendObjectAnimation(WorldObject object, Animation animation) {
		sendObjectAnimation(null, object, animation);
	}

	public static final void sendObjectAnimation(Entity creator, WorldObject object, Animation animation) {
		if (creator == null) {
			for (Player player : World.getPlayers()) {
				if (player == null || !player.hasStarted()
						|| player.hasFinished() || !player.withinDistance(object))
					continue;
				player.getPackets().sendObjectAnimation(object, animation);
			}
		} else {
			for (int regionId : creator.getMapRegionsIds()) {
				List<Integer> playersIndexes = getRegion(regionId)
						.getPlayerIndexes();
				if (playersIndexes == null)
					continue;
				for (Integer playerIndex : playersIndexes) {
					Player player = players.get(playerIndex);
					if (player == null || !player.hasStarted()
							|| player.hasFinished()
							|| !player.withinDistance(object))
						continue;
					player.getPackets().sendObjectAnimation(object, animation);
				}
			}
		}
	}
	
	


	 public static final void sendGraphics(Entity creator, Graphics graphics, WorldTile tile) {
			if (creator == null) {
			    for (Player player : World.getPlayers()) {
				if (player == null || !player.hasStarted() || player.hasFinished() || !player.withinDistance(tile))
				    continue;
				player.getPackets().sendGraphics(graphics, tile);
			    }
			} else {
			    for (int regionId : creator.getMapRegionsIds()) {
				List<Integer> playersIndexes = getRegion(regionId).getPlayerIndexes();
				if (playersIndexes == null)
				    continue;
				for (Integer playerIndex : playersIndexes) {
				    Player player = players.get(playerIndex);
				    if (player == null || !player.hasStarted() || player.hasFinished() || !player.withinDistance(tile))
					continue;
				    player.getPackets().sendGraphics(graphics, tile);
				}
			    }
			}
		    }
	
	 public static final Projectile sendProjectileNew(WorldTile from, WorldTile to, int graphicId, int startHeight,
			    int endHeight, int startTime, double speed, int angle, int slope) {
			return sendProjectile(from, to, false, false, 0, graphicId, startHeight, endHeight, startTime, speed, angle,
				slope);
		    }

		    public static final Projectile sendProjectile(WorldTile from, WorldTile to, boolean adjustFlyingHeight,
			    boolean adjustSenderHeight, int senderBodyPartId, int graphicId, int startHeight, int endHeight,
			    int startTime, double speed, int angle, int slope) {
			int fromSizeX, fromSizeY;
			if (from instanceof Entity)
			    fromSizeX = fromSizeY = ((Entity) from).getSize();
			else if (from instanceof WorldObject) {
			    ObjectDefinitions defs = ((WorldObject) from).getDefinitions();
			    fromSizeX = defs.getSizeX();
			    fromSizeY = defs.getSizeY();
			} else
			    fromSizeX = fromSizeY = 1;
			int toSizeX, toSizeY;
			if (to instanceof Entity)
			    toSizeX = toSizeY = ((Entity) to).getSize();
			else if (to instanceof WorldObject) {
			    ObjectDefinitions defs = ((WorldObject) to).getDefinitions();
			    toSizeX = defs.getSizeX();
			    toSizeY = defs.getSizeY();
			} else
			    toSizeX = toSizeY = 1;

			Projectile projectile = new Projectile(from, to, adjustFlyingHeight, adjustSenderHeight, senderBodyPartId,
				graphicId, startHeight, endHeight, startTime,
				startTime + (speed == -1
					? Utils.getProjectileTimeSoulsplit(from, fromSizeX, fromSizeY, to, toSizeX, toSizeY)
					: Utils.getProjectileTimeNew(from, fromSizeX, fromSizeY, to, toSizeX, toSizeY, speed)),
				slope, angle);
			getRegion(from.getRegionId()).addProjectile(projectile);
			return projectile;
		    }

		    public static final Projectile sendProjectile(Entity shooter, WorldTile startTile, WorldTile receiver, int gfxId,
			    int startHeight, int endHeight, int speed, int startTime, int curve, int startDistanceOffset) {
			return sendProjectileNew(shooter, receiver, gfxId, startHeight, endHeight, startTime, Math.round(speed / 10),
				curve, Utils.random(5));
		    }

		    public static final Projectile sendProjectile(WorldTile shooter, Entity receiver, int gfxId, int startHeight,
			    int endHeight, int speed, int startTime, int curve, int startDistanceOffset) {
			return sendProjectileNew(shooter, receiver, gfxId, startHeight, endHeight, startTime, Math.round(speed / 10),
				curve, Utils.random(5));
		    }

		    public static final Projectile sendProjectile(Entity shooter, WorldTile receiver, int gfxId, int startHeight,
			    int endHeight, int speed, int startTime, int curve, int startDistanceOffset) {
			return sendProjectileNew(shooter, receiver, gfxId, startHeight, endHeight, startTime, Math.round(speed / 10),
				curve, Utils.random(5));
		    }

		    public static final Projectile sendProjectile(Entity shooter, Entity receiver, int gfxId, int startHeight,
			    int endHeight, int speed, int startTime, int curve, int startDistanceOffset) {
			return sendProjectileNew(shooter, receiver, gfxId, startHeight, endHeight, startTime, Math.round(speed / 10),
				curve, Utils.random(5));
		    }


	public static final boolean isDungeoneering(WorldTile tile) {
		int destX = tile.getX();
		int destY = tile.getY();
		return (destX >= 3143 && destX <= 3272 && destY >= 9533 && destY <= 9599);
	}

	public static final boolean isMultiArea(WorldTile tile) {
		int destX = tile.getX();
		int destY = tile.getY();
		int plane = tile.getPlane();
		return  (destX >= 3462 && destX <= 3511 && destY >= 9481 && destY <= 9521 && tile.getPlane() == 0) //kalphite queen lair
				|| (destX >= 4540 && destX <= 4799 && destY >= 5052 && destY <= 5183 && tile.getPlane() == 0) // thzaar city
				|| (destX >= 1721 && destX <= 1791 && destY >= 5123 && destY <= 5249) // mole
				|| (destX >= 3029 && destX <= 3374 && destY >= 3759 && destY <= 3903)//wild
				|| (destX >= 3535 && destX <= 3564 && destY >= 9486 && destY <= 9516)//RAGO
				|| (destX >= 3266 && destX <= 3338 && destY >= 9789 && destY <= 9862)//ASC
				|| (destX >= 2250 && destX <= 2280 && destY >= 4670 && destY <= 4720)
				|| (destX >= 3198 && destX <= 3380 && destY >= 3904 && destY <= 3970)
				|| (destX >= 3191 && destX <= 3326 && destY >= 3510 && destY <= 3759)
				|| (destX >= 2987 && destX <= 3006 && destY >= 3912 && destY <= 3937)
				|| (destX >= 2245 && destX <= 2295 && destY >= 4675 && destY <= 4720)
				|| (destX >= 2450 && destX <= 3520 && destY >= 9450 && destY <= 9550)
				|| (destX >= 3006 && destX <= 3071 && destY >= 3602 && destY <= 3710)
				|| (destX >= 3134 && destX <= 3192 && destY >= 3519 && destY <= 3646)
				|| (destX >= 2815 && destX <= 2966 && destY >= 5240 && destY <= 5375)//wild
				|| (destX >= 2384 && destX <= 2410 && destY >= 10264 && destY <= 10288)//thunderous
				|| (destX >= 1960 && destX <= 1974 && destY >= 3243 && destY <= 3258)//avatar
				|| (destX >= 1798 && destX <= 1817 && destY >= 3203 && destY <= 3221)//avatar
				|| (destX >= 3673 && destX <= 3680 && destY >= 2986 && destY <= 2994)//donorisland
				|| (destX >= 2506 && destX <= 2534 && destY >= 10009 && destY <= 10037)//bork
				|| (destX >= 2891 && destX <= 2938 && destY >= 4429 && destY <= 4476)//dks
				|| (destX >= 2840 && destX <= 2950 && destY >= 5190 && destY <= 5230) // godwars
				|| (destX >= 3547 && destX <= 3555 && destY >= 9690 && destY <= 9699) // zaros
				|| (destX >= 2687 && destX <= 2813 && destY >= 9086 && destY <= 9153) // ape atoll dung
				|| (destX >= 1490 && destX <= 1515 && destY >= 4696 && destY <= 4714) // chaos dwarf battlefield
				|| (destX >= 3175 && destX <= 3197 && destY >= 4609 && destY <= 4628) // rise of the six
				|| (destX >= 2237 && destX <= 2276 && destY >= 3294 && destY <= 3333) // sf
				|| (destX >= 3817 && destX <= 3832 && destY >= 4759 && destY <= 4777) // rise of the six
				|| (destX >= 1481 && destX <= 1518 && destY >= 4954 && destY <= 4985) // virtus
				|| (destX >= 3236 && destX <= 3260 && destY >= 9556 && destY <= 9590) // kalger
				|| (destX >= 2836 && destX <= 2877 && destY >= 3529 && destY <= 3554) && (plane == 3) //Cyclossus
				|| (destX >= 3535 && destX <= 3564 && destY >= 9486 && destY <= 9516)
				// godwars
				|| KingBlackDragon.atKBD(tile) // King Black Dragon lair
				//|| TormentedDemon.atTD(tile) // Tormented demon's area
				|| (destX >= 2970 && destX <= 3000 && destY >= 4365 && destY <= 4400)// corp
				|| (destX >= 3195 && destX <= 3327 && destY >= 3520
				&& destY <= 3970 || (destX >= 2376 && 5127 >= destY
				&& destX <= 2422 && 5168 <= destY))
				|| (destX >= 2374 && destY >= 5129 && destX <= 2424 && destY <= 5168) // pits
				|| (destX >= 2622 && destY >= 5696 && destX <= 2573 && destY <= 5752) // torms
				|| (destX >= 2368 && destY >= 3072 && destX <= 2431 && destY <= 3135) // castlewars
				|| (destX >= 1986 && destX <= 2045 && destY >= 4162 && destY <= 4286) || tile.getRegionId() == 16729 //glacors
				// out
				|| (destX >= 2365 && destY >= 9470 && destX <= 2436 && destY <= 9532) // castlewars
				|| (destX >= 2948 && destY >= 5537 && destX <= 3071 && destY <= 5631) // Risk
				// ffa.
				|| tile.getRegionId() == 10329
				|| (destX >= 2756 && destY >= 5537 && destX <= 2879 && destY <= 5631)	//Safe ffa
				|| (tile.getX() >= 3011 && tile.getX() <= 3132 && tile.getY() >= 10052 && tile.getY() <= 10175
				|| tile.getRegionId() == 10810 || tile.getRegionId() == 10554 || tile.getRegionId() == 10810//rock crabs
				&& (tile.getY() >= 10066 || tile.getX() >= 3094)) //fortihrny dungeon
				;
		// in

		// multi
	}

	public static final boolean isPvpArea(WorldTile tile) {
		return Wilderness.isAtWild(tile);
	}

	public static final void addGroundItem(final Item item, final WorldTile tile) {
		addGroundItem(item, tile, null, false, -1, 2, -1);
	}

	public static final void spawnTempGroundObject(final WorldObject object, final int replaceId, long time) {
		spawnObject(object, false);
		GameEngine.slowExecutor.schedule(new Runnable() {
			@Override
			public void run() {
				try {
					removeObject(object);
					addGroundItem(new Item(replaceId), object, null, false, 180);
				} catch (Throwable e) {
					Logger.handle(e);
				}
			}
		}, time, TimeUnit.MILLISECONDS);
	}

	public static final void addRespawnableGroundItem(final Item item,final WorldTile tile) {
		FloorItem floorItem = World.getRegion(tile.getRegionId())
				.getGroundItem(item.getId(), tile, null);
		if (floorItem == null) {
			floorItem = new FloorItem(item, tile, null,false, false);
			final Region region = getRegion(tile.getRegionId());
			region.forceGetFloorItems().add(floorItem);
			int regionId = tile.getRegionId();
			for (Player player : players) {
				if (player == null || !player.hasStarted() || player.hasFinished()
						|| player.getPlane() != tile.getPlane()
						|| !player.getMapRegionsIds().contains(regionId))
					continue;
				player.getPackets().sendGroundItem(floorItem);
			}
		}
	}

	public static final void addGroundItem(final Item item,
			final WorldTile tile, final Player owner, boolean invisible,
			long hiddenTime) {
		addGroundItem(item, tile, owner, invisible, hiddenTime, 2, 150);
	}

	public static final FloorItem addGroundItem(final Item item,
			final WorldTile tile, final Player owner, boolean invisible,
			long hiddenTime, int type) {
		return addGroundItem(item, tile, owner, invisible, hiddenTime, type,
				150);
	}

	public static final void turnPublic(FloorItem floorItem, int publicTime) {
		if (!floorItem.isInvisible())
			return;
		int regionId = floorItem.getTile().getRegionId();
		final Region region = getRegion(regionId);
		if (!region.getGroundItemsSafe().contains(floorItem))
			return;
		Player realOwner = floorItem.hasOwner() ? World.getPlayer(floorItem
				.getOwner()) : null;
		if (!ItemConstants.isTradeable(floorItem)) {
			region.getGroundItemsSafe().remove(floorItem);
			if (realOwner != null) {
				if (realOwner.getMapRegionsIds().contains(regionId)
						&& realOwner.getPlane() == floorItem.getTile()
						.getPlane())
					realOwner.getPackets().sendRemoveGroundItem(floorItem);
			}
			return;
		}
		floorItem.setInvisible(false);
		for (Player player : players) {
			if (player == null || player == realOwner || !player.hasStarted()
					|| player.hasFinished()
					|| player.getPlane() != floorItem.getTile().getPlane()
					|| !player.getMapRegionsIds().contains(regionId))
				continue;
			player.getPackets().sendGroundItem(floorItem);
		}
		// disapears after this time
		if (publicTime != -1)
			removeGroundItem(floorItem, publicTime);
	}

	@Deprecated
	public static final void addGroundItemForever(Item item, final WorldTile tile) {
		int regionId = tile.getRegionId();
		final FloorItem floorItem = new FloorItem(item, tile, true);
		final Region region = getRegion(tile.getRegionId());
		region.getGroundItemsSafe().add(floorItem);
		for (Player player : players) {
			if (player == null || !player.hasStarted() || player.hasFinished()
					|| player.getPlane() != floorItem.getTile().getPlane()
					|| !player.getMapRegionsIds().contains(regionId))
				continue;
			player.getPackets().sendGroundItem(floorItem);
		}
	}

	/*
	 * type 0 - gold if not tradeable type 1 - gold if destroyable type 2 - no
	 * gold
	 */
	public static final FloorItem addGroundItem(final Item item,
			final WorldTile tile, final Player owner, boolean invisible,
			long hiddenTime, int type, final int publicTime) {
		if (type != 2) {
			if ((type == 0 && !ItemConstants.isTradeable(item)) || type == 1) {

				int price = item.getDefinitions().getValue();
				if (price <= 0)
					return null;
				item.setId(995);
				item.setAmount(price);
			}
		}
		final FloorItem floorItem = new FloorItem(item, tile, owner,
				owner != null, invisible);
		final Region region = getRegion(tile.getRegionId());
		region.getGroundItemsSafe().add(floorItem);
		if (invisible) {
			if (owner != null)
				owner.getPackets().sendGroundItem(floorItem);
			// becomes visible after x time
			if (hiddenTime != -1) {
				GameEngine.slowExecutor.schedule(new Runnable() {
					@Override
					public void run() {
						try {
							turnPublic(floorItem, publicTime);
						} catch (Throwable e) {
							Logger.handle(e);
						}
					}
				}, hiddenTime, TimeUnit.SECONDS);
			}
		} else {
			// visible
			int regionId = tile.getRegionId();
			for (Player player : players) {
				if (player == null || !player.hasStarted()
						|| player.hasFinished()
						|| player.getPlane() != tile.getPlane()
						|| !player.getMapRegionsIds().contains(regionId))
					continue;
				player.getPackets().sendGroundItem(floorItem);
			}
			// disapears after this time
			if (publicTime != -1)
				removeGroundItem(floorItem, publicTime);
		}
		return floorItem;
	}

	public static final void updateGroundItem(Item item, final WorldTile tile,
			final Player owner) {
		final FloorItem floorItem = World.getRegion(tile.getRegionId())
				.getGroundItem(item.getId(), tile, owner);
		if (floorItem == null) {
			addGroundItem(item, tile, owner, true, 360);
			return;
		}
		floorItem.setAmount(floorItem.getAmount() + item.getAmount());
		owner.getPackets().sendRemoveGroundItem(floorItem);
		owner.getPackets().sendGroundItem(floorItem);

	}
	
	public static final int WORLD_NEWS = 0, SERVER_NEWS = 1, FRIEND_NEWS = 2, GAME_NEWS = 3;

	public static void sendNews(String message, int type) {
		sendNews(null, message, type); //dont use type 2(FRIEND_NEWS) with this one
	}

	/*
	 * 0 - all worlds
	 * 1 - just this world
	 * 2 - friend
	 * 3 - game news
	 */
	public static void sendNews(Player from, String message, int type) {
		String m = "<shad=000>News: " + message + "</shad></col>";
		if (type == 0)
			m = "<img=7><col=D80000>" + m;
		else if (type == 1)
			m = "<img=6><col=ff8c38>" + m;
		else if (type == 2)
			m = "<img=5><col=45b247>" + m;
		else if (type == 3)
			m = "<img=7><col=FFFF00>" + m;

		for (Player p : World.getPlayers()) {
			if (p == null || !p.isRunning() || (type == 2 && p != from && !p.getFriendsIgnores().isFriend(from.getDisplayName())))
				continue;
			p.getPackets().sendGameMessage(m, true);
		}
	}

	public static void sendWorldMessage(String message, boolean forStaff) {
		for (Player p : World.getPlayers()) {
			if (p == null || !p.isRunning() || p.isYellOff() || (forStaff && p.getRights() == 0))
				continue;
			p.getPackets().sendGameMessage(message);
		}
	}

	public static void sendWorldMessage(String message) {
		for (Player p : World.getPlayers()) {
			if (p == null || !p.isRunning() || p.isYellOff())
				continue;
			p.getPackets().sendGameMessage(message);
		}
	}

	public static final void sendProjectile(WorldObject object, WorldTile startTile,
			WorldTile endTile, int gfxId, int startHeight, int endHeight, int speed, int delay,
			int curve, int startOffset) {
		for(Player pl : players) {
			if(pl == null || !pl.withinDistance(object, 20))
				continue;
			pl.getPackets().sendProjectile(null, startTile, endTile, gfxId,
					startHeight, endHeight, speed, delay, curve, startOffset, 1);
		}
	}

	public static boolean isTileFree(int plane, int x, int y, int size) {
		for (int tileX = x; tileX < x + size; tileX++)
			for (int tileY = y; tileY < y + size; tileY++)
				if (!isFloorFree(plane, tileX, tileY) || !isWallsFree(plane, tileX, tileY))
					return false;
		return true;
	}


	public static Player get(String name) {
		return getPlayerByDisplayName(name);
	}

	public static NPC findNPC(int id) {
		NPC npc = null;
		for (NPC n : getNPCs()) {
			if (n == null)
				continue;
			if (n.getId() == id) {
				npc = n;
			}
		}
		return npc;
	}

	public static List<NPC> getLocalNPCs(WorldTile location) {
		List<NPC> localNPCs = new ArrayList<NPC>();
		for (NPC n : getNPCs())
			if (n != null)
				if (!localNPCs.contains(n))
					if (n.withinDistance(location, 14))
						localNPCs.add(n);
		return localNPCs;
	}
	
	public static List<Player> getLocalPlayers(WorldTile location) {
		List<Player> localPlayers = new ArrayList<Player>();
		for (Player n : getPlayers())
			if (n != null)
				if (!localPlayers.contains(n))
					if (n.withinDistance(location, 14))
						localPlayers.add(n);
		return localPlayers;
	}

	public static DatabaseManager getDatabase() {
		return database;
	}

	public static Market getMarket() { return market; }



}
