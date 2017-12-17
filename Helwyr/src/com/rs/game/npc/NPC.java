package com.rs.game.npc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.rs.Settings;
import com.rs.cache.loaders.Configs;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.engine.GameEngine;
import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.item.ItemsContainer;
import com.rs.game.npc.Drop.Rarity;
import com.rs.game.npc.combat.NPCCombat;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.npc.familiar.Familiar;
import com.rs.game.npc.pet.Pet;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.HerbCleaning;
import com.rs.game.player.actions.HerbCleaning.Herbs;
import com.rs.game.player.actions.slayer.SlayerManager;
import com.rs.game.player.content.Burying;
import com.rs.game.player.content.Burying.Bone;
import com.rs.game.player.content.FriendChatsManager;
import com.rs.game.player.content.instancing.bossInstance.BossInstance;
import com.rs.game.player.content.quest.impl.princealirescue.PrinceAliRescue;
import com.rs.game.player.controlers.Wilderness;
import com.rs.game.player.pathing.FixedTileStrategy;
import com.rs.game.player.pathing.RouteFinder;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.mysql.impl.AdventureLog;
import com.rs.mysql.impl.AdventureLog.ALogType;
import com.rs.tools.CharmDrop;
import com.rs.utils.Archiver;
import com.rs.utils.Logger;
import com.rs.utils.MapAreas;
import com.rs.utils.NPCBonuses;
import com.rs.utils.NPCCombatDefinitionsL;
import com.rs.utils.NPCDrops;
import com.rs.utils.Utils;

public class NPC extends Entity implements Serializable {

	private static final long serialVersionUID = -4794678936277614443L;

	public static int NORMAL_WALK = 0x2, WATER_WALK = 0x4, FLY_WALK = 0x8;
	private int id;
	private WorldTile respawnTile;
	private int mapAreaNameHash;
	private boolean canBeAttackFromOutOfArea;
	private boolean randomwalk;
	private int[] bonuses; // 0 stab, 1 slash, 2 crush,3 mage, 4 range, 5 stab
	// def, blahblah till 9
	private boolean spawned;
	private transient NPCCombat combat;
	public WorldTile forceWalk;

	private long lastAttackedByTarget;
	private boolean cantInteract;
	private int capDamage;
	private int lureDelay;
	private transient boolean cantSetTargetAutoRelatio;
	private transient SecondaryBar nextSecondaryBar;
	private transient double dropRateFactor;
	private boolean cantFollowUnderCombat;
	private boolean forceAgressive;
	private int forceTargetDistance;
	private boolean forceFollowClose;
	private boolean forceMultiAttacked;
	private boolean noDistanceCheck;

	// npc masks
	private transient Transformation nextTransformation;
	// name changing masks
	private String name;
	private transient boolean changedName;
	private int combatLevel;
	private transient boolean changedCombatLevel;
	private transient boolean locked;
	private boolean intelligentRouteFinder;
	private int walkType;
	private transient BossInstance bossInstance; // if its a instance npc

	public NPC(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
		this(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, false);
	}

	/*
	 * creates and adds npc
	 */
	public NPC(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea, boolean spawned) {
		super(tile);
		this.id = id;
		this.respawnTile = new WorldTile(tile);
		this.mapAreaNameHash = mapAreaNameHash;
		this.canBeAttackFromOutOfArea = canBeAttackFromOutOfArea;
		this.setSpawned(spawned);
		combatLevel = -1;
		dropRateFactor = 1;
		setHitpoints(getMaxHitpoints());
		setDirection(getRespawnDirection());
		setRandomWalk((getDefinitions().walkMask & 0x2) != 0 || forceRandomWalk(id));
		setRandomWalk(getDefinitions().walkMask);
		bonuses = NPCBonuses.getBonuses(id);
		combat = new NPCCombat(this);
		capDamage = -1;
		lureDelay = 12000;
		initEntity();
		World.addNPC(this);
		World.updateEntityRegion(this);
		loadMapRegions();
		checkMultiArea();
	}
	
	/*
	 * creates and adds npc
	 */
	public NPC(int id, WorldTile tile) {
		super(tile);
		this.id = id;
		this.respawnTile = new WorldTile(tile);
		combatLevel = -1;
		dropRateFactor = 1;
		setHitpoints(getMaxHitpoints());
		setDirection(getRespawnDirection());
		setRandomWalk(getDefinitions().walkMask);
		combat = new NPCCombat(this);
		capDamage = -1;
		lureDelay = 12000;
		initEntity();
		World.addNPC(this);
		World.updateEntityRegion(this);
		loadMapRegions();
	}

	@Override
	public boolean needMasksUpdate() {
		return super.needMasksUpdate() || nextTransformation != null || changedCombatLevel || changedName;
	}

	public void transformIntoNPC(int id) {
		setNPC(id);
		nextTransformation = new Transformation(id);
	}

	public void setNPC(int id) {
		this.id = id;
		bonuses = NPCBonuses.getBonuses(id);
	}

	@Override
	public void resetMasks() {
		super.resetMasks();
		nextTransformation = null;
		changedCombatLevel = false;
		changedName = false;
	}

	public int getAttackStyle() {
		if (bonuses[2] > 0)
			return NPCCombatDefinitions.MAGE;
		if (bonuses[1] > 0)
			return NPCCombatDefinitions.RANGE;
		return NPCCombatDefinitions.MELEE;
	}

	public void setNextNPCTransformation(int id) {
		if (getCombatDefinitions().getHitpoints() <= 10 && (getCombatDefinitions()
				.getHitpoints() < NPCCombatDefinitionsL.getNPCCombatDefinitions(id).getHitpoints())) {
			getCombatDefinitions().setHitpoints(NPCCombatDefinitionsL.getNPCCombatDefinitions(id).getHitpoints());
			this.setHitpoints(NPCCombatDefinitionsL.getNPCCombatDefinitions(id).getHitpoints());
		}
		setNPC(id);
		nextTransformation = new Transformation(id);
		if (getCustomCombatLevel() != -1)
			changedCombatLevel = true;
		if (getCustomName() != null)
			changedName = true;
	}

	public int getMapAreaNameHash() {
		return mapAreaNameHash;
	}

	public void setCanBeAttackFromOutOfArea(boolean b) {
		canBeAttackFromOutOfArea = b;
	}

	public boolean canBeAttackFromOutOfArea() {
		return canBeAttackFromOutOfArea;
	}

	public NPCDefinitions getDefinitions() {
		return NPCDefinitions.getNPCDefinitions(id);
	}

	public NPCCombatDefinitions getCombatDefinitions() {
		return NPCCombatDefinitionsL.getNPCCombatDefinitions(id);
	}

	@Override
	public int getMaxHitpoints() {
		return getCombatDefinitions().getHitpoints();
	}

	public int getId() {
		return id;
	}

	public void setRandomWalk(int forceRandomWalk) {
		this.walkType = forceRandomWalk;
	}

	public double getDropRateFactor() {
		return dropRateFactor;
	}

	public void setDropRateFactor(double dropRateFactor) {
		this.dropRateFactor = dropRateFactor;
	}


	public void processNPC() {
		if (isDead() || locked)
			return;
		if (!combat.process()) {
			if (!isForceWalking()) {
				if (!cantInteract) {
					if (!checkAgressivity()) {
						if (getFreezeDelay() < Utils.currentTimeMillis()) {
							if (hasRandomWalk()) {
								boolean can = false;
								for (int i = 0; i < 2; i++) {
									if (Math.random() * 1000.0 < 100.0) {
										can = true;
										break;
									}
								}

								if (can) {
									int moveX = (int) Math.round(Math.random() * 10.0 - 5.0);
									int moveY = (int) Math.round(Math.random() * 10.0 - 5.0);
									resetWalkSteps();
									if (getMapAreaNameHash() != -1) {
										if (!MapAreas.isAtArea(getMapAreaNameHash(), this)) {
											forceWalkRespawnTile();
											return;
										}
										addWalkSteps(getX() + moveX, getY() + moveY, 5);
									} else
										addWalkSteps(respawnTile.getX() + moveX, respawnTile.getY() + moveY, 5);
								}
							}
						}
					}
				}
			}
		}
		if (isForceWalking()) {
			if (getX() != forceWalk.getX() || getY() != forceWalk.getY()) {
				if (!hasWalkSteps()) {
					int steps = RouteFinder.findRoute(RouteFinder.WALK_ROUTEFINDER, getX(), getY(), getPlane(),
							getSize(), new FixedTileStrategy(forceWalk.getX(), forceWalk.getY()), true);
					int[] bufferX = RouteFinder.getLastPathBufferX();
					int[] bufferY = RouteFinder.getLastPathBufferY();
					for (int i = steps - 1; i >= 0; i--) {
						if (!addWalkSteps(bufferX[i], bufferY[i], 25, true))
							break;
					}
				}
				if (!hasWalkSteps()) { // failing finding route
					setNextWorldTile(new WorldTile(forceWalk)); // force
					// tele
					// to
					// the
					// forcewalk
					// place
					forceWalk = null; // so ofc reached forcewalk place
				}
			} else
				// walked till forcewalk place
				forceWalk = null;
		}
		switch (id) {
		case 16706:
			setForceAgressive(true);
			setForceMultiAttacked(true);
			setForceMultiArea(true);
			break;
		case 15425:
			setName("Teleport Master");
			break;
		}
		if (isForceWalking()) {
			if (getFreezeDelay() < Utils.currentTimeMillis()) {
				if (getX() != forceWalk.getX() || getY() != forceWalk.getY()) {
					if (!hasWalkSteps())
						addWalkSteps(forceWalk.getX(), forceWalk.getY(), getSize(), true);
					if (!hasWalkSteps()) { // failing finding route
						setNextWorldTile(new WorldTile(forceWalk)); // force
						forceWalk = null; // so ofc reached forcewalk place
					}
				} else
					// walked till forcewalk place
					forceWalk = null;
			}
		}
	}

	@Override
	public void processEntity() {
		super.processEntity();
		processNPC();
	}

	public int getRespawnDirection() {
		NPCDefinitions definitions = getDefinitions();
		if (definitions.anInt853 << 32 != 0 && definitions.respawnDirection > 0 && definitions.respawnDirection <= 8)
			return (4 + definitions.respawnDirection) << 11;
		return 0;
	}

	/*
	 * forces npc to random walk even if cache says no, used because of fake
	 * cache information
	 */

	private static boolean forceRandomWalk(int npcId) {
		switch (npcId) {
		case 11226:
			return true;
		case 2881:
		case 2882:
		case 2883:
			return true;
		case 3341:
		case 3342:
		case 3343:
			return true;
		default:
			return false;
		}
	}

	public void sendSoulSplit(final Hit hit, final Entity user) {
		final NPC target = this;
		if (hit.getDamage() > 0)
			World.sendProjectile(user, this, 2263, 11, 11, 20, 5, 0, 0);
		user.heal(hit.getDamage() / 5);
		WorldTasksManager.schedule(new WorldTask() {
			@Override
			public void run() {
				setNextGraphics(new Graphics(2264));
				if (hit.getDamage() > 0)
					World.sendProjectile(target, user, 2263, 11, 11, 20, 5, 0, 0);
			}
		}, 1);
	}

	@Override
	public void handleIngoingHit(final Hit hit) {
		if (capDamage != -1 && hit.getDamage() > capDamage)
			hit.setDamage(capDamage);
		if (hit.getLook() != HitLook.MELEE_DAMAGE && hit.getLook() != HitLook.RANGE_DAMAGE
				&& hit.getLook() != HitLook.MAGIC_DAMAGE)
			return;
		Entity source = hit.getSource();
		if (source == null)
			return;
		if (source instanceof Player) {
			final Player p2 = (Player) source;
			if (p2.getPrayer().hasPrayersOn()) {
				if (p2.getPrayer().usingPrayer(1, 18))
					sendSoulSplit(hit, p2);
				if (hit.getDamage() == 0)
					return;
				if (!p2.getPrayer().isBoostedLeech()) {
					if (hit.getLook() == HitLook.MELEE_DAMAGE) {
						if (p2.getPrayer().usingPrayer(1, 19)) {
							p2.getPrayer().setBoostedLeech(true);
							return;
						} else if (p2.getPrayer().usingPrayer(1, 1)) { // sap
							// att
							if (Utils.getRandom(4) == 0) {
								if (p2.getPrayer().reachedMax(0)) {
									p2.getPackets().sendGameMessage(
											"Your opponent has been weakened so much that your sap curse has no effect.",
											true);
								} else {
									p2.getPrayer().increaseLeechBonus(0);
									p2.getPackets().sendGameMessage(
											"Your curse drains Attack from the enemy, boosting your Attack.", true);
								}
								p2.setNextAnimation(new Animation(12569));
								p2.setNextGraphics(new Graphics(2214));
								p2.getPrayer().setBoostedLeech(true);
								World.sendProjectile(p2, this, 2215, 35, 35, 20, 5, 0, 0);
								WorldTasksManager.schedule(new WorldTask() {
									@Override
									public void run() {
										setNextGraphics(new Graphics(2216));
									}
								}, 1);
								return;
							}
						} else {
							if (p2.getPrayer().usingPrayer(1, 10)) {
								if (Utils.getRandom(7) == 0) {
									if (p2.getPrayer().reachedMax(3)) {
										p2.getPackets().sendGameMessage(
												"Your opponent has been weakened so much that your leech curse has no effect.",
												true);
									} else {
										p2.getPrayer().increaseLeechBonus(3);
										p2.getPackets().sendGameMessage(
												"Your curse drains Attack from the enemy, boosting your Attack.", true);
									}
									p2.setNextAnimation(new Animation(12575));
									p2.getPrayer().setBoostedLeech(true);
									World.sendProjectile(p2, this, 2231, 35, 35, 20, 5, 0, 0);
									WorldTasksManager.schedule(new WorldTask() {
										@Override
										public void run() {
											setNextGraphics(new Graphics(2232));
										}
									}, 1);
									return;
								}
							}
							if (p2.getPrayer().usingPrayer(1, 14)) {
								if (Utils.getRandom(7) == 0) {
									if (p2.getPrayer().reachedMax(7)) {
										p2.getPackets().sendGameMessage(
												"Your opponent has been weakened so much that your leech curse has no effect.",
												true);
									} else {
										p2.getPrayer().increaseLeechBonus(7);
										p2.getPackets().sendGameMessage(
												"Your curse drains Strength from the enemy, boosting your Strength.",
												true);
									}
									p2.setNextAnimation(new Animation(12575));
									p2.getPrayer().setBoostedLeech(true);
									World.sendProjectile(p2, this, 2248, 35, 35, 20, 5, 0, 0);
									WorldTasksManager.schedule(new WorldTask() {
										@Override
										public void run() {
											setNextGraphics(new Graphics(2250));
										}
									}, 1);
									return;
								}
							}

						}
					}
					if (hit.getLook() == HitLook.RANGE_DAMAGE) {
						if (p2.getPrayer().usingPrayer(1, 2)) { // sap range
							if (Utils.getRandom(4) == 0) {
								if (p2.getPrayer().reachedMax(1)) {
									p2.getPackets().sendGameMessage(
											"Your opponent has been weakened so much that your sap curse has no effect.",
											true);
								} else {
									p2.getPrayer().increaseLeechBonus(1);
									p2.getPackets().sendGameMessage(
											"Your curse drains Range from the enemy, boosting your Range.", true);
								}
								p2.setNextAnimation(new Animation(12569));
								p2.setNextGraphics(new Graphics(2217));
								p2.getPrayer().setBoostedLeech(true);
								World.sendProjectile(p2, this, 2218, 35, 35, 20, 5, 0, 0);
								WorldTasksManager.schedule(new WorldTask() {
									@Override
									public void run() {
										setNextGraphics(new Graphics(2219));
									}
								}, 1);
								return;
							}
						} else if (p2.getPrayer().usingPrayer(1, 11)) {
							if (Utils.getRandom(7) == 0) {
								if (p2.getPrayer().reachedMax(4)) {
									p2.getPackets().sendGameMessage(
											"Your opponent has been weakened so much that your leech curse has no effect.",
											true);
								} else {
									p2.getPrayer().increaseLeechBonus(4);
									p2.getPackets().sendGameMessage(
											"Your curse drains Range from the enemy, boosting your Range.", true);
								}
								p2.setNextAnimation(new Animation(12575));
								p2.getPrayer().setBoostedLeech(true);
								World.sendProjectile(p2, this, 2236, 35, 35, 20, 5, 0, 0);
								WorldTasksManager.schedule(new WorldTask() {
									@Override
									public void run() {
										setNextGraphics(new Graphics(2238));
									}
								});
								return;
							}
						}
					}
					if (hit.getLook() == HitLook.MAGIC_DAMAGE) {
						if (p2.getPrayer().usingPrayer(1, 3)) { // sap mage
							if (Utils.getRandom(4) == 0) {
								if (p2.getPrayer().reachedMax(2)) {
									p2.getPackets().sendGameMessage(
											"Your opponent has been weakened so much that your sap curse has no effect.",
											true);
								} else {
									p2.getPrayer().increaseLeechBonus(2);
									p2.getPackets().sendGameMessage(
											"Your curse drains Magic from the enemy, boosting your Magic.", true);
								}
								p2.setNextAnimation(new Animation(12569));
								p2.setNextGraphics(new Graphics(2220));
								p2.getPrayer().setBoostedLeech(true);
								World.sendProjectile(p2, this, 2221, 35, 35, 20, 5, 0, 0);
								WorldTasksManager.schedule(new WorldTask() {
									@Override
									public void run() {
										setNextGraphics(new Graphics(2222));
									}
								}, 1);
								return;
							}
						} else if (p2.getPrayer().usingPrayer(1, 12)) {
							if (Utils.getRandom(7) == 0) {
								if (p2.getPrayer().reachedMax(5)) {
									p2.getPackets().sendGameMessage(
											"Your opponent has been weakened so much that your leech curse has no effect.",
											true);
								} else {
									p2.getPrayer().increaseLeechBonus(5);
									p2.getPackets().sendGameMessage(
											"Your curse drains Magic from the enemy, boosting your Magic.", true);
								}
								p2.setNextAnimation(new Animation(12575));
								p2.getPrayer().setBoostedLeech(true);
								World.sendProjectile(p2, this, 2240, 35, 35, 20, 5, 0, 0);
								WorldTasksManager.schedule(new WorldTask() {
									@Override
									public void run() {
										setNextGraphics(new Graphics(2242));
									}
								}, 1);
								return;
							}
						}
					}

					// overall

					if (p2.getPrayer().usingPrayer(1, 13)) { // leech defence
						if (Utils.getRandom(10) == 0) {
							if (p2.getPrayer().reachedMax(6)) {
								p2.getPackets().sendGameMessage(
										"Your opponent has been weakened so much that your leech curse has no effect.",
										true);
							} else {
								p2.getPrayer().increaseLeechBonus(6);
								p2.getPackets().sendGameMessage(
										"Your curse drains Defence from the enemy, boosting your Defence.", true);
							}
							p2.setNextAnimation(new Animation(12575));
							p2.getPrayer().setBoostedLeech(true);
							World.sendProjectile(p2, this, 2244, 35, 35, 20, 5, 0, 0);
							WorldTasksManager.schedule(new WorldTask() {
								@Override
								public void run() {
									setNextGraphics(new Graphics(2246));
								}
							}, 1);
							return;
						}
					}
				}
			}
		}

	}

	@Override
	public void reset() {
		super.reset();
		setDirection(getRespawnDirection());
		combat.reset();
		bonuses = NPCBonuses.getBonuses(id); // back to real bonuses
		forceWalk = null;
	}

	@Override
	public void finish() {
		if (hasFinished())
			return;
		setFinished(true);
		World.updateEntityRegion(this);
		World.removeNPC(this);
	}

	public void setRespawnTask() {
		if (bossInstance != null && bossInstance.isFinished())
			return;
		if (!hasFinished()) {
			reset();
			setLocation(respawnTile);
			finish();
		}
		long respawnDelay = getCombatDefinitions().getRespawnDelay() * 600;
		if (bossInstance != null)
			respawnDelay /= bossInstance.getSettings().getSpawnSpeed();
		GameEngine.getEngine().getScheduledExecutor().schedule(new Runnable() {
			@Override
			public void run() {
				try {
					if (bossInstance != null && bossInstance.isFinished())
						return;
					spawn();
				} catch (Throwable e) {
					Logger.handle(e);
				}
			}
		}, respawnDelay, TimeUnit.MILLISECONDS);
	}

	public void deserialize() {
		if (combat == null)
			combat = new NPCCombat(this);
		spawn();
	}

	public void spawn() {
		setFinished(false);
		World.addNPC(this);
		setLastRegionId(0);
		World.updateEntityRegion(this);
		loadMapRegions();
		checkMultiArea();
		checkSpawns();
	}

	private void checkSpawns() {
		if (getId() == 919)
			PrinceAliRescue.setLadyKeliSpawned(true);
	}

	public NPCCombat getCombat() {
		return combat;
	}

	@Override
	public void sendInstantDeath(final Entity source) {
		resetWalkSteps();
		combat.removeTarget();
		setNextAnimation(null);
		WorldTasksManager.schedule(new WorldTask() {

			@Override
			public void run() {
				if (source instanceof Player)
					((Player) source).getControlerManager().processNPCDeath(getId());
				reset();
				setLocation(respawnTile);
				finish();
				if (!isSpawned())
					setRespawnTask();
				if (source.getAttackedBy() == NPC.this) { // no need to wait
					// after u kill
					source.setAttackedByDelay(0);
					source.setAttackedBy(null);
					source.setFindTargetDelay(0);
				}
				stop();
			}
		}, 0, 0);
	}

	@Override
	public void sendDeath(Entity source) {
		final NPCCombatDefinitions defs = getCombatDefinitions();
		resetWalkSteps();
		combat.removeTarget();
		setNextAnimation(null);
		WorldTasksManager.schedule(new WorldTask() {
			int loop;
			@Override
			public void run() {
				if (loop == 0) {
					setNextAnimation(new Animation(defs.getDeathEmote()));
				} else if (loop >= defs.getDeathDelay()) {
					if (source instanceof Player)
						((Player) source).getControlerManager().processNPCDeath(NPC.this);
					drop();
					reset();
					setLocation(respawnTile);
					finish();
					if (!isSpawned())
						setRespawnTask();
					stop();
				}
				loop++;
			}
		}, 0, 1);
	}

	public int getWeaknessStyle() {
		Map<Integer, Object> data = getDefinitions().parameters;
		if (data != null) {
			Integer weakness = (Integer) data.get(2848);
			if (weakness != null)
				return weakness;
		}
		return 0;
	}

	public void drop() {
		if (getCombatDefinitions() == NPCCombatDefinitionsL.DEFAULT_DEFINITION || getMaxHitpoints() == 1 || (bossInstance != null && (bossInstance.isFinished() || bossInstance.getSettings().isPractiseMode())))
			return;
		Player killer = getMostDamageReceivedSourcePlayer();
		if (killer == null)
			return;
		if (this.changedName && name != null)
			killer.sendNPCKill(name);
		else
			killer.sendNPCKill(getDefinitions().name);
		ArrayList<Player> bossTaskKillers = getPlayerDamageSources();
		for (Player player : bossTaskKillers) {
			if (player != null && player.hasStarted() && !player.hasFinished()) {
				if (Utils.getDistance(player, this) <= 20) {
					if (player.hasBossTask()) {
						String name = player.getBossTask().getName().toLowerCase();
						if (this.getDefinitions().name.equalsIgnoreCase(name)) {
							player.getBossTask().sendKill(player, this);
						}
					}
				}
			}
		}
		sendCharms(killer);
		Player otherPlayer = killer.getSlayerManager().getSocialPlayer();
		SlayerManager manager = killer.getSlayerManager();
		if (manager.isValidTask(getName(), id)) {
			manager.checkCompletedTask(getDamageReceived(killer),otherPlayer != null ? getDamageReceived(otherPlayer) : 0);
			randomSofDrop(killer);
		}

		ArrayList<Drop> drops = NPCDrops.getDrops(id);
		if (drops == null || drops.isEmpty())
			return;
		List<Player> players = FriendChatsManager.getLootSharingPeople(killer);
		Drop finalDrop = null;
		Drop rareDrop = null;
		int roll = (Utils.random(Settings.DROP_ROLL));
		int rareroll = (Utils.random(Settings.DROP_ROLL));
		ArrayList<Drop> possibleDrops = new ArrayList<Drop>();
		ArrayList<Drop> rareDropTable = new ArrayList<Drop>();

		if (hasAccessToRareTable(killer)) {
			ArrayList<Drop> rareTable = NPCDrops.getDrops(50000);
			for (Drop rare : rareTable) {
				tabilifyDrop(rare, rareroll, rareDropTable);
			}
		}
		Archiver.writeKillLog(killer, this, this.getLastWorldTile());
		for (Drop drop : drops) {
			if (killer.getTreasureTrailsManager().hasClueScrollItem() && ItemDefinitions.getItemDefinitions(drop.getItemId()).name.toLowerCase().contains("clue scroll"))
				continue;
			if (drop.getRarity() == Rarity.ALWAYS) {
				sendDrop(killer, drop);
			} else {
				if (killer.getTemporaryAttributtes().get("rd") == Boolean.TRUE) {
					if (drop.getRarity() == Rarity.ULTRA_RARE) {
						possibleDrops.add(drop);
					} else if (drop.getRarity() == Rarity.VERY_RARE) {
						possibleDrops.add(drop);
					} else if (drop.getRarity() == Rarity.RARE) {
						possibleDrops.add(drop);
					}
				} else {
					tabilifyDrop(drop, roll, possibleDrops);
				}
			}
		}
		killer.getTemporaryAttributtes().put("rd", false);
		if (rareDropTable.size() > 0)
			rareDrop = rareDropTable.get(Utils.random(rareDropTable.size()));
		if (rareDrop != null) {
			if (killer.getEquipment().getRingId() != -1 && ItemDefinitions.getItemDefinitions(killer.getEquipment().getRingId()).getName().toLowerCase().contains("ring of wealth")) {
				killer.getPackets().sendGameMessage("<col=FACC2E>Your ring of wealth shines brightly!");
			}
			killer.incrementCount("Rare drop table drops");
			sendDrop(killer, rareDrop);
		}
		if (possibleDrops.size() > 0)
			finalDrop = possibleDrops.get(Utils.random(possibleDrops.size()));
		if (finalDrop != null)
			sendDrop(killer, finalDrop);
		handleKillCount(killer);
	}

	private void pvmToken(Player killer) {
		int chance = Utils.random(3);
		if (chance == 0) {
			if(killer.getInventory().hasFreeSlots())
				killer.getInventory().addItem(7478, Utils.random(1, 3));
		}
	}
	
	private void randomSofDrop(Player killer) {
		int chance = Utils.random(20);
		if(chance < 2)
			World.addGroundItem(new Item(24154, 1), new WorldTile(killer.getX() + 1, killer.getY(), killer.getPlane()));
		else if(chance < 6)
			World.addGroundItem(new Item(24155, 1), new WorldTile(killer.getX() + 1, killer.getY(), killer.getPlane()));
	}

	private void handleKillCount(Player killer) {
		if (this.getId() == 14301) { 
			killer.glacorkc += 1;
			killer.sm("<col=ff0000>Your Glacor killcount is " + killer.glacorkc + ".");
			pvmToken(killer);
		}
		if (this.getId() == 50) { 
			killer.kbdkc += 1;
			killer.setSlainKBD(true);
			killer.sm("<col=ff0000>Your King Black Dragon killcount is " + killer.kbdkc + ".");
			pvmToken(killer);
		}
		if (this.getId() == 3200) { 
			killer.cekc += 1;
			killer.sm("<col=ff0000>Your Chaos Elemental killcount is " + killer.cekc + ".");
			pvmToken(killer);
		}
		if (this.getId() == 19098) { 
			killer.maxkc += 1;
			killer.sm("<col=ff0000>Your Mad Max killcount is " + killer.maxkc + ".");
			pvmToken(killer);
		}
		if (this.getId() == 9176) { 
			killer.shkc += 1;
			killer.sm("<col=ff0000>Your Skeletal Horror killcount is " + killer.shkc + ".");
			pvmToken(killer);
		}
		if (this.getId() == 2882) { 
			killer.primekc += 1;
			killer.sm("<col=ff0000>Your Dagannoth Prime killcount is " + killer.primekc + ".");
			pvmToken(killer);
		}
		if (this.getId() == 1974) { 
			killer.damiskc += 1;
			killer.sm("<col=ff0000>Your Damis killcount is " + killer.damiskc + ".");
			pvmToken(killer);
		}
		if (this.getId() == 1977) { 
			killer.fareedkc += 1;
			killer.sm("<col=ff0000>Your Fareed killcount is " + killer.fareedkc + ".");
			pvmToken(killer);
		}
		if (this.getId() == 1914) { 
			killer.dessouskc += 1;
			killer.sm("<col=ff0000>Your Dessous killcount is " + killer.dessouskc + ".");
			pvmToken(killer);
		}
		if (this.getId() == 1913) { 
			killer.kamilkc += 1;
			killer.sm("<col=ff0000>Your Kamil killcount is " + killer.kamilkc + ".");
			pvmToken(killer);
		}
		if (this.getId() == 2881) { 
			killer.supremekc += 1;
			killer.sm("<col=ff0000>Your Dagannoth Supreme killcount is " + killer.supremekc + ".");
			pvmToken(killer);
		}
		if (this.getId() == 19121) { 
			killer.ragokc += 1;
			killer.sm("<col=ff0000>Your Vorago killcount is " + killer.ragokc + ".");
			if (!killer.hasRagoPet && Utils.random(200) == 5) {
				killer.setRagoPet(true);
				if (killer.getFamiliar() == null) {
					killer.getPetManager().spawnPet(29932, true);
					killer.sm("You feel as if you're being followed...");
					World.sendWorldMessage("<col=FF9900><img=7> "
							+ killer.getDisplayName()
							+ " has just recieved a Vorago Shard!", false);
				} else {
					killer.getInventory().addItem(29932, 1);
					killer.sm("Congratulations! You have earned the Vorago pet!");
					World.sendWorldMessage("<col=FF9900><img=7> "
							+ killer.getDisplayName()
							+ " has just recieved a Vorago Shard!", false);
					killer.setRagoPet(true);
				}
			}
			pvmToken(killer);
		}

		if (this.getId() == 1160) {
			killer.kqkc += 1;
			killer.sm("<col=ff0000>Your Kalphite Queen killcount is " + killer.kqkc + ".");
			if (!killer.hasKQPet && Utils.random(250) <= 8) {
				killer.getInventory().addItem(33791, 1);
				killer.sm("Congratulations! You have earned the Kalphite Grubbling pet!");
				World.sendWorldMessage("<col=FF9900><img=7> "+ killer.getDisplayName() + " has just recieved a Kalphite Grubbling Pet!", false);
			}
			pvmToken(killer);
		}
		if (this.getId() == 12841) {
			killer.kalgerkc += 1;
			killer.sm("<col=ff0000>Your Kal'Ger killcount is " + killer.kalgerkc + ".");
			pvmToken(killer);
		}
		if (this.getId() == 14696) { 
			killer.ganokc += 1;
			killer.sm("<col=ff0000>Your Ganodermic Beast killcount is " + killer.ganokc + ".");
			pvmToken(killer);
		}
		if (this.getId() == 2883) { 
			killer.rexkc += 1;
			killer.sm("<col=ff0000>Your Dagannoth Rex killcount is " + killer.rexkc + ".");
			pvmToken(killer);
		}
		if (this.getId() == 8133) { 
			killer.corpkc += 1;
			killer.setSlainCorporealBeast(true);
			killer.sm("<col=ff0000>Your Corporeal Beast killcount is " + killer.corpkc + ".");
			pvmToken(killer);
		}
		if (this.getId() == 3847) { 
			killer.krakenkc += 1;
			killer.sm("<col=ff0000>Your Kraken killcount is " + killer.krakenkc + ".");
			pvmToken(killer);
		}
		if (this.getId() == 6222) { 
			killer.armakc += 1;
			killer.sm("<col=ff0000>Your Kree'ara killcount is " + killer.armakc + ".");
			pvmToken(killer);
		}
		if (this.getId() == 7133) { 
			killer.borkkc += 1;
			killer.sm("<col=ff0000>Your Bork killcount is " + killer.borkkc + ".");
			pvmToken(killer);
		}
		if (this.getId() == 6260) { 
			killer.bandoskc += 1;
			killer.sm("<col=ff0000>Your General Graardor killcount is " + killer.bandoskc + ".");
			pvmToken(killer);
		}
		if (this.getId() == 6203) { 
			killer.zamkc += 1;
			killer.sm("<col=ff0000>Your K'ril Tsutsaroth killcount is " + killer.zamkc + ".");
			pvmToken(killer);
		}
		if (this.getId() == 6247) { 
			killer.sarakc += 1;
			killer.sm("<col=ff0000>Your Commander Zilyana killcount is " + killer.sarakc + ".");
			pvmToken(killer);
		}
		if (this.getName().toLowerCase().contains("nex")) { 
			killer.nexkc += 1;
			killer.sm("<col=ff0000>Your Nex killcount is " + killer.nexkc + ".");
			pvmToken(killer);
		}
	}

	public static void tabilifyDrop(final Drop drop, int roll, ArrayList<Drop> toTable) {
		Rarity rarity = Rarity.COMMON;

		if (roll < Settings.getCommonRate()) 
			rarity = Rarity.COMMON;

		if (roll < Settings.getUncommonRate()) 
			rarity = Rarity.UNCOMMON;

		if (roll < Settings.getRareRate()) 
			rarity = Rarity.RARE;

		if (roll < Settings.getVeryRareRate()) 
			rarity = Rarity.VERY_RARE;

		if (roll < Settings.getUltraRareRate()) 
			rarity = Rarity.ULTRA_RARE;

		if (drop.getRarity() == rarity)
			toTable.add(drop);
	}

	public static Item dropToItem(Drop drop) {
		Item item = null;
		if (drop.getMaxAmount() > 1)
			item = new Item(drop.getItemId(), Utils.random(drop.getMinAmount(), drop.getMaxAmount()));
		else
			item = new Item(drop.getItemId(), 1);
		return item;
	}

	public static void sendDropDirectlyToBank(Player player, Drop drop) {
		Item item = null;
		if (drop.getMaxAmount() > 1)
			item = new Item(drop.getItemId(), Utils.random(drop.getMinAmount(), drop.getMaxAmount()));
		else
			item = new Item(drop.getItemId(), 1);
		player.getBank().addItem(item.getId(), item.getAmount(), true);
	}

	public static void displayDropsFor(Player player, int npcId, int npcAmount) {
		ItemsContainer<Item> dropCollection = new ItemsContainer<Item>(506, true);
		long totalValue = 0;

		for (int i = 0; i < npcAmount; i++) {
			ArrayList<Drop> drops = NPCDrops.getDrops(npcId);
			if (drops == null || drops.isEmpty())
				return;

			Drop charm = CharmDrop.getCharmDrop(NPCDefinitions.getNPCDefinitions(npcId).name.toLowerCase());
			if (charm != null)
				dropCollection.add(dropToItem(charm));

			Drop finalDrop = null;
			Drop rareDrop = null;

			int roll = (Utils.random(Settings.DROP_ROLL));
			int rareroll = (Utils.random(Settings.DROP_ROLL));
			ArrayList<Drop> possibleDrops = new ArrayList<Drop>();
			ArrayList<Drop> rareDropTable = new ArrayList<Drop>();

			if (accessToRareTable(player, npcId)) {
				ArrayList<Drop> rareTable = NPCDrops.getDrops(50000);
				for (Drop rare : rareTable) {
					tabilifyDrop(rare, rareroll, rareDropTable);
				}
			}

			for (Drop drop : drops) {
				if (drop.getRarity() == Rarity.ALWAYS) {
					dropCollection.add(dropToItem(drop));
				} else {
					tabilifyDrop(drop, roll, possibleDrops);
				}
			}
			if (possibleDrops.size() > 0)
				finalDrop = possibleDrops.get(Utils.random(possibleDrops.size()));
			if (finalDrop != null)
				dropCollection.add(dropToItem(finalDrop));
			if (rareDropTable.size() > 0)
				rareDrop = rareDropTable.get(Utils.random(rareDropTable.size()));
			if (rareDrop != null)
				dropCollection.add(dropToItem(rareDrop));
		}

		for (Item item : dropCollection.getItems()) {
			if (item != null && item.getDefinitions() != null)
				totalValue += item.getDefinitions().getValue() - (item.getDefinitions().getValue() / 3);
		}

		player.getTemporaryAttributtes().put("viewingOtherBank", Boolean.TRUE);
		player.getInterfaceManager().sendInterface(762);
		player.getPackets().sendIComponentText(762, 47, npcAmount + " " + NPCDefinitions.getNPCDefinitions(npcId).name + " kills - Total high alch value: " + totalValue);
		player.getPackets().sendItems(95, dropCollection);
		player.getPackets().sendIComponentSettings(762, 95, 0, 516, 2622718);
	}

	public static boolean accessToRareTable(Player player, int npcId) {
		int chance = Utils.random(1000);
		chance -= NPCDefinitions.getNPCDefinitions(npcId).combatLevel / 4;
		if (player.getEquipment().getRingId() != -1 && ItemDefinitions.getItemDefinitions(player.getEquipment().getRingId()).getName().toLowerCase().contains("ring of wealth")) {
			chance -= 10;
		}
		if (chance <= 10) {
			return true;
		}
		return false;
	}

	public boolean hasAccessToRareTable(Player killer) {
		return accessToRareTable(killer, getId());
	}

	public void dropPvMToken(Player player, boolean isBoss) {
		int pvmtoken = Utils.random(5);
		if (player.getInventory().hasFreeSlots()) {
			player.getInventory().addItem(new Item(7478, (isBoss ? 5 : (Utils.random(1, 2)))));
		} else {
			World.addGroundItem(new Item(7478, (isBoss ? 5 : (Utils.random(1, 2)))),
					new WorldTile(player.getX(), player.getY(), player.getPlane()), player, false, 180, true, true);
		}
	}

	public void dropCharm(Player player, Item item) {
		if (id == 81 || id == 1767 || id == 2310 || id == 1471)
			return;
		int size = getSize();
		Item dropItem = new Item(item.getId(), Utils.random(
				item.getDefinitions().isStackable() ? item.getAmount() * Settings.getDropRate() : item.getAmount())
				+ 1);

		World.addGroundItem(dropItem, new WorldTile(getCoordFaceX(size), getCoordFaceY(size), getPlane()), player,
				false, 180, true);

	}

	public void sendCharms(Player player) {
		Pet pet = player.getPet();
		if(pet != null && player.getPetManager().isALegendaryPet()) {
			player.getInventory().addItem(CHARMS[Utils.random(CHARMS.length)]);
			return;
		}
		if (player.getInventory().containsOneItem(27996)) {
			player.getInventory().addItem(CHARMS[Utils.random(CHARMS.length)]);
			return;
		}
		dropCharm(player, CHARMS[Utils.random(CHARMS.length)]);
	}

	public void sendDrop(Player player, Drop drop) {
		int amount = Utils.random(drop.getMinAmount(), drop.getMaxAmount());
		if (drop.getMaxAmount() < 2)
			amount = 1;
		Player dropTo = player;
		if (player.lootshareEnabled() && player.getCurrentFriendChat() != null) {
			List<Player> possible = FriendChatsManager.getLootSharingPeople(player);
			dropTo = possible.get(Utils.random(possible.size()));
			for (Player p : possible) {
				if (!p.getUsername().equals(dropTo.getUsername()))
					p.sendMessage(dropTo.getDisplayName() + " has recieved: " + amount + " " + ItemDefinitions.getItemDefinitions(drop.getItemId()).getName() + ".");
				else
					p.sendMessage("<col=006600>You recieved: " + amount + " " + ItemDefinitions.getItemDefinitions(drop.getItemId()).getName() + ".");
			}
		}
		dropTo.incrementCount(ItemDefinitions.getItemDefinitions(drop.getItemId()).getName() + " drops earned", amount);
		dropTo.incrementCount(drop.getRarity().name() + " drops earned");
		if (drop.getItemId() == CharmDrop.charmIds[0] || drop.getItemId() == CharmDrop.charmIds[1] || drop.getItemId() == CharmDrop.charmIds[2] || drop.getItemId() == CharmDrop.charmIds[3]) {
			if (dropTo.getInventory().containsItem(27996, 1) && (dropTo.getInventory().addItem(drop.getItemId(), drop.getMinAmount()))) {
				dropTo.getPackets().sendGameMessage("Your charming imp picks up a " + ItemDefinitions.getItemDefinitions(drop.getItemId()).getName().toLowerCase() + ".", true);
				return;
			}
		}
		if (yellDrop(drop.getItemId()))  {
			new AdventureLog(dropTo, ALogType.RARE_DROP, Integer.toString(drop.getItemId()));
			World.sendWorldMessage("<img=4><col=00FF00>" + dropTo.getDisplayName() + " has just recieved a " + ItemDefinitions.getItemDefinitions(drop.getItemId()).getName() + " drop from " + getDefinitions().name + "!", false);
		}
		
		final int size = getSize();
		Item item;

		if (drop.getMaxAmount() > 1)
			item = new Item(drop.getItemId(), amount);
		else
			item = new Item(drop.getItemId(), 1);

		if (dropTo.getInventory().containsItem(18337, 1)) {
			Bone bone = Bone.forId(item.getId());
			if (bone != null) {
				dropTo.getSkills().addXp(Skills.PRAYER, bone.getExperience());
				Burying.handleNecklaces(dropTo, bone.getId());
				return;
			}
		}

		if (dropTo.getInventory().containsItem(19675, 1)) {
			Herbs herb = HerbCleaning.getHerb(item.getId());
			if (herb != null && (dropTo.getSkills().getLevel(Skills.HERBLORE) >= herb.getLevel())) {
				dropTo.getSkills().addXp(Skills.HERBLORE, herb.getExperience() * 2);
				return;
			}
		}

		if (dropTo.getTemporaryAttributtes().get("sendingDropsToBank") != null && dropTo.getTemporaryAttributtes().get("sendingDropsToBank") == Boolean.TRUE) {
			sendDropDirectlyToBank(dropTo, drop);
			return;
		}

		final WorldTile tile = new WorldTile(getCoordFaceX(size), getCoordFaceY(size), getPlane());

		handleBeam(tile, item, dropTo);

		Pet pet = dropTo.getPet();
		if(pet != null && dropTo.getPetManager().isALegendaryPet() && item.getId() == 995 && player.getPetManager().isALegendaryPet()) {
			player.getInventory().addItemMoneyPouch(item);
		} else {
			ItemDefinitions defs = ItemDefinitions.getItemDefinitions(item.getId());
			if(pet != null && defs.getValue(item.getId()) >= player.getLootBeamThreshhold() && player.getInventory().hasFreeSlots()
					&& player.getPetManager().isALegendaryPet() && pet.withinDistance(tile, 12)) {
				player.getInventory().addItem(item);
			} else {
				World.addGroundItem(item, new WorldTile(getCoordFaceX(size), getCoordFaceY(size), getPlane()), dropTo, true, 60);
			}
		}
	}


	public void handleBeam(WorldTile tile, Item item, Player player) {
		int totalValue = item.getDefinitions().value * item.getAmount();

		if (player.getLootBeamThreshhold() > 0) {
			if (item.getId() >= 28445 && item.getId() <= 28462) {
				player.getPackets().sendGraphics(new Graphics(4420), tile);
				player.getPackets().sendGameMessage("<shad=000000><col=FACC2E>A golden beam shines over one of your items!");
			}
			if (totalValue > player.getLootBeamThreshhold() * 3) {
				player.getPackets().sendGraphics(new Graphics(4421), tile);
				player.getPackets().sendGameMessage("<shad=000000><col=FACC2E>A golden beam shines over one of your items!");
			} else if (totalValue > player.getLootBeamThreshhold() * 2) {
				player.getPackets().sendGraphics(new Graphics(4420), tile);
				player.getPackets().sendGameMessage("<shad=000000><col=FACC2E>A golden beam shines over one of your items!");
			} else if (totalValue > player.getLootBeamThreshhold()) {
				player.getPackets().sendGraphics(new Graphics(4419), tile);
				player.getPackets().sendGameMessage("<shad=000000><col=FACC2E>A golden beam shines over one of your items!");
			}
		}
	}

	public boolean yellDrop(int itemId) {
		if (itemId >= 33830 && itemId <= 33852)
			return true;
		if (itemId >= 28457 && itemId <= 28462)
			return true;
		if (itemId >= 26579 && itemId <= 26602)
			return true;
		if (itemId >= 20125 && itemId <= 20174)
			return true;
		if (itemId >= 13845 && itemId <= 13990)
			return true;
		if (itemId >= 14472 && itemId <= 14477)
			return true;
		if (itemId >= 24974 && itemId <= 25039)
			return true;
		switch (itemId) {
		case 25555:
		case 25481:
		case 15486:
		case 11235:
		case 6739:
		case 21777:
		case 21787:
		case 21790:
		case 21793:
		case 11732:
		case 4151:
		case 3140:
		case 14484:
		case 11702:
		case 11704:
		case 11706:
		case 11708:
		case 11718:
		case 11722:
		case 11720:
		case 11724:
		case 11726:
		case 11728:
		case 11716:
		case 11730:
			return true;
		default:
			return false;
		}
	}


	public static final Item[] ScrollIds = { new Item(2677), new Item(2678), new Item(2679), new Item(2680),
			new Item(2681) };

	public void dropItem(Player player, Item item) {

		Item dropItem = new Item(item.getId(),
				Utils.random(
						item.getDefinitions().isStackable() ? item.getAmount() * Configs.DROP_RATE : item.getAmount())
				+ 1);
		int finalItemAmount = dropItem.getAmount();
		if (dropItem.getId() != 6746 || dropItem.getId() != 20123 || dropItem.getId() != 20124
				|| dropItem.getId() != 20122 || dropItem.getId() != 20121
				|| !dropItem.getName().toLowerCase().contains("clue scroll")) {
			finalItemAmount *= 2;
			dropItem.setAmount(finalItemAmount);
		}

	}

	@Override

	public int getSize() {
		return getDefinitions().size;
	}

	private static final Item[] CHARMS = { new Item(12158, Utils.random(5, 10)), new Item(12159, Utils.random(3, 7)),
			new Item(12160, 2), new Item(12163, 2),
	};

	private static final Item[] SPINTICKETS = { new Item(24154, 1), };

	private static final Item[] RARES = { new Item(1419, 1), new Item(22321, 1), new Item(1959, 1), new Item(10723, 1),
			new Item(9921, 1), new Item(9922, 1), new Item(9923, 1), new Item(9924, 1), new Item(9925, 1),
			new Item(7592, 1), new Item(7953, 1), new Item(7954, 1), new Item(7955, 1), new Item(7956, 1),
			new Item(15353, 1), new Item(11789, 1), new Item(15352, 1), new Item(22327, 1) };

	public boolean isIntelligentRouteFinder() {
		return intelligentRouteFinder;
	}

	public void setIntelligentRouteFinder(boolean intelligentRouteFinder) {
		this.intelligentRouteFinder = intelligentRouteFinder;
	}

	public int getMaxHit() {
		return getCombatDefinitions().getMaxHit();
	}

	public int getMaxHit(int style) {
		int maxHit = bonuses[0];
		if (style == 1)
			maxHit = bonuses[1];
		else if (style == 2)
			maxHit = bonuses[2];
		return maxHit / 10;
	}

	public int[] getBonuses() {
		return bonuses;
	}

	@Override
	public double getMagePrayerMultiplier() {
		return 0;
	}

	@Override
	public double getRangePrayerMultiplier() {
		return 0;
	}

	@Override
	public double getMeleePrayerMultiplier() {
		return 0;
	}

	public WorldTile getRespawnTile() {
		return respawnTile;
	}

	public boolean isUnderCombat() {
		return combat.underCombat();
	}

	@Override
	public void setAttackedBy(Entity target) {
		super.setAttackedBy(target);
		if (target == combat.getTarget() && !(combat.getTarget() instanceof Familiar))
			lastAttackedByTarget = Utils.currentTimeMillis();
	}

	public boolean canBeAttackedByAutoRelatie() {
		return Utils.currentTimeMillis() - lastAttackedByTarget > lureDelay;
	}

	public boolean isForceWalking() {
		return forceWalk != null;
	}

	public void setTarget(Entity entity) {
		if (isForceWalking()) // if force walk not gonna get target
			return;
		combat.setTarget(entity);
		lastAttackedByTarget = Utils.currentTimeMillis();
	}

	public void removeTarget() {
		if (combat.getTarget() == null)
			return;
		combat.removeTarget();
	}

	public void forceWalkRespawnTile() {
		setForceWalk(respawnTile);
	}

	public void setForceWalk(WorldTile tile) {
		resetWalkSteps();
		forceWalk = tile;
	}

	public boolean hasForceWalk() {
		return forceWalk != null;
	}

	public ArrayList<Entity> getPossibleTargets(boolean checkNPCs, boolean checkPlayers) {
		int size = getSize();
		int agroRatio = getCombatDefinitions().getAgroRatio();
		ArrayList<Entity> possibleTarget = new ArrayList<Entity>();
		for (int regionId : getMapRegionsIds()) {
			if (checkPlayers) {
				List<Integer> playerIndexes = World.getRegion(regionId).getPlayerIndexes();
				if (playerIndexes != null) {
					for (int playerIndex : playerIndexes) {
						Player player = World.getPlayers().get(playerIndex);
						if (player == null || player.isDead() || player.hasFinished() || !player.isRunning()
								|| player.getAppearence().isHidden()
								|| !Utils.isOnRange(getX(), getY(), size, player.getX(), player.getY(),
										player.getSize(), forceTargetDistance > 0 ? forceTargetDistance : agroRatio)
								|| (!forceMultiAttacked && (!isAtMultiArea() || !player.isAtMultiArea())
										&& (player.getAttackedBy() != this
										&& (player.getAttackedByDelay() > Utils.currentTimeMillis()
												|| player.getFindTargetDelay() > Utils.currentTimeMillis())))
								|| !clipedProjectile(player, false) || (!forceAgressive && !Wilderness.isAtWild(this)
										&& player.getSkills().getCombatLevelWithSummoning() >= getCombatLevel() * 2))
							continue;
						possibleTarget.add(player);
					}
				}
			}
			if (checkNPCs) {
				List<Integer> npcsIndexes = World.getRegion(regionId).getNPCsIndexes();
				if (npcsIndexes != null) {
					for (int npcIndex : npcsIndexes) {
						NPC npc = World.getNPCs().get(npcIndex);
						if (npc == null || npc == this || npc.isDead() || npc.hasFinished()
								|| !Utils.isOnRange(getX(), getY(), size, npc.getX(), npc.getY(), npc.getSize(),
										forceTargetDistance > 0 ? forceTargetDistance : agroRatio)
								|| !npc.getDefinitions().hasAttackOption()
								|| ((!isAtMultiArea() || !npc.isAtMultiArea()) && npc.getAttackedBy() != this
								&& npc.getAttackedByDelay() > Utils.currentTimeMillis())
								|| !clipedProjectile(npc, false))
							continue;
						possibleTarget.add(npc);
					}
				}
			}
		}
		return possibleTarget;
	}

	public ArrayList<Entity> getPossibleTargets() {
		return getPossibleTargets(false, true);
	}

	public boolean checkAgressivity() {
		if (!(Wilderness.isAtWild(this) && getDefinitions().hasAttackOption())) {
			if (!forceAgressive) {
				NPCCombatDefinitions defs = getCombatDefinitions();
				if (defs.getAgressivenessType() == NPCCombatDefinitions.PASSIVE)
					return false;
			}
		}
		ArrayList<Entity> possibleTarget = getPossibleTargets();
		if (!possibleTarget.isEmpty()) {
			Entity target = possibleTarget.get(Utils.random(possibleTarget.size()));
			setTarget(target);
			target.setAttackedBy(target);
			target.setFindTargetDelay(Utils.currentTimeMillis() + 10000);
			return true;
		}
		return false;
	}

	public boolean isCantInteract() {
		return cantInteract;
	}

	public void setCantInteract(boolean cantInteract) {
		this.cantInteract = cantInteract;
		if (cantInteract)
			combat.reset();
	}

	public int getCapDamage() {
		return capDamage;
	}

	public void setCapDamage(int capDamage) {
		this.capDamage = capDamage;
	}

	public int getLureDelay() {
		return lureDelay;
	}

	public void setLureDelay(int lureDelay) {
		this.lureDelay = lureDelay;
	}

	public boolean isCantFollowUnderCombat() {
		return cantFollowUnderCombat;
	}

	public void setCantFollowUnderCombat(boolean canFollowUnderCombat) {
		this.cantFollowUnderCombat = canFollowUnderCombat;
	}

	public Transformation getNextTransformation() {
		return nextTransformation;
	}

	@Override
	public String toString() {
		return getDefinitions().name + " - " + id + " - " + getX() + " " + getY() + " " + getPlane();
	}

	public boolean isForceAgressive() {
		return forceAgressive;
	}

	public void setCantSetTargetAutoRelatio(boolean cantSetTargetAutoRelatio) {
		this.cantSetTargetAutoRelatio = cantSetTargetAutoRelatio;
	}

	public void setForceAgressive(boolean forceAgressive) {
		this.forceAgressive = forceAgressive;
	}

	public int getForceTargetDistance() {
		return forceTargetDistance;
	}

	public void setForceTargetDistance(int forceTargetDistance) {
		this.forceTargetDistance = forceTargetDistance;
	}

	public boolean isForceFollowClose() {
		return forceFollowClose;
	}

	public void setForceFollowClose(boolean forceFollowClose) {
		this.forceFollowClose = forceFollowClose;
	}

	public boolean isForceMultiAttacked() {
		return forceMultiAttacked;
	}

	public void setForceMultiAttacked(boolean forceMultiAttacked) {
		this.forceMultiAttacked = forceMultiAttacked;
	}

	public boolean hasRandomWalk() {
		return randomwalk;
	}

	public void setRandomWalk(boolean forceRandomWalk) {
		this.randomwalk = forceRandomWalk;
	}

	public String getCustomName() {
		return name;
	}

	public void setName(String string) {
		this.name = getDefinitions().name.equals(string) ? null : string;
		changedName = true;
	}

	public int getCustomCombatLevel() {
		return combatLevel;
	}

	public int getCombatLevel() {
		return combatLevel >= 0 ? combatLevel : getDefinitions().combatLevel;
	}

	public String getName() {
		return name != null ? name : getDefinitions().name;
	}

	public void setCombatLevel(int level) {
		combatLevel = getDefinitions().combatLevel == level ? -1 : level;
		changedCombatLevel = true;
	}

	public boolean hasChangedName() {
		return changedName;
	}

	public boolean hasChangedCombatLevel() {
		return changedCombatLevel;
	}

	public WorldTile getMiddleWorldTile() {
		int size = getSize();
		return new WorldTile(getCoordFaceX(size), getCoordFaceY(size), getPlane());
	}

	public boolean isSpawned() {
		return spawned;
	}

	public void setSpawned(boolean spawned) {
		this.spawned = spawned;
	}

	public boolean isNoDistanceCheck() {
		return noDistanceCheck;
	}

	public void setNoDistanceCheck(boolean noDistanceCheck) {
		this.noDistanceCheck = noDistanceCheck;
	}

	public boolean withinDistance(Player tile, int distance) {
		return super.withinDistance(tile, distance);
	}

	/**
	 * Gets the locked.
	 * 
	 * @return The locked.
	 */
	public boolean isLocked() {
		return locked;
	}

	/**
	 * Sets the locked.
	 * 
	 * @param locked
	 *            The locked to set.
	 */
	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public void setBossInstance(BossInstance instance) {
		bossInstance = instance;
	}

	public BossInstance getBossInstance() {
		return bossInstance;
	}

	public boolean isUnderAttack() {
		return combat.underCombat();
	}

	public int getAttackSpeed() {
		Map<Integer, Object> data = getDefinitions().parameters;
		if (data != null) {
			Integer speed = (Integer) data.get(14);
			if (speed != null)
				return speed;
		}
		return 4;
	}

	@Override
	public boolean canMove(int dir) {
		// TODO Auto-generated method stub
		return false;
	}

	public SecondaryBar getNextSecondaryBar() {
		return nextSecondaryBar;
	}

	public void setNextSecondaryBar(SecondaryBar nextSecondaryBar) {
		this.nextSecondaryBar = nextSecondaryBar;
	}

	public boolean isCantSetTargetAutoRelatio() {
		return cantSetTargetAutoRelatio;
	}

	public boolean isPet() {
		return this instanceof Pet;
	}
}
