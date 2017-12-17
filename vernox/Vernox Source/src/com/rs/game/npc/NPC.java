package com.rs.game.npc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.rs.Settings;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.executor.GameExecutorManager;
import com.rs.game.Animation;
import com.rs.game.EffectsManager.EffectType;
import com.rs.game.Entity;
import com.rs.game.ForceTalk;
import com.rs.game.Graphics;
import com.rs.game.HeadIcon;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.SecondaryBar;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.map.bossInstance.BossInstance;
import com.rs.game.npc.combat.NPCCombat;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.npc.familiar.Familiar;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.SlayerManager;
import com.rs.game.player.TimersManager.RecordKey;
import com.rs.game.player.actions.HerbCleaning;
import com.rs.game.player.actions.HerbCleaning.Herbs;
import com.rs.game.player.content.Combat;
import com.rs.game.player.content.FriendsChat;
import com.rs.game.player.content.prayer.Burying.Bone;
import com.rs.game.player.controllers.Wilderness;
import com.rs.game.route.RouteFinder;
import com.rs.game.route.strategy.FixedTileStrategy;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Logger;
import com.rs.utils.MapAreas;
import com.rs.utils.NPCCombatDefinitionsL;
import com.rs.utils.NPCDrops;
import com.rs.utils.Utils;

public class NPC extends Entity implements Serializable {

	public static int NORMAL_WALK = 0x2, WATER_WALK = 0x4, FLY_WALK = 0x8;

	private static final long serialVersionUID = -4794678936277614443L;

	private int id;
	private WorldTile respawnTile;
	private int mapAreaNameHash;
	private boolean canBeAttackFromOutOfArea;
	private int walkType;
	private int[] bonuses; //melee dmg, range dmg, magic dmg, melee acc, range acc, mage acc, armour bonus, crit bonus
	private boolean spawned;
	private transient NPCCombat combat;
	public WorldTile forceWalk;

	private long lastAttackedByTarget;
	private boolean cantInteract;
	private int capDamage;
	private int lureDelay;
	private boolean cantFollowUnderCombat;
	private boolean forceAgressive;
	private int forceTargetDistance;
	private boolean forceFollowClose;
	private boolean noDistanceCheck;
	private boolean intelligentRouteFinder;

	// npc masks
	private transient Transformation nextTransformation;
	private transient SecondaryBar nextSecondaryBar;
	private transient boolean refreshHeadIcon;
	// name changing masks
	private String name;
	private transient boolean changedName;
	private int combatLevel;
	private transient boolean changedCombatLevel;
	private transient boolean locked;
	private transient double dropRateFactor;
	private transient boolean cantSetTargetAutoRelatio;
	
	private transient BossInstance bossInstance; //if its a instance npc
	

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
		this.spawned = spawned;
		combatLevel = -1;
		dropRateFactor = 1;
		setHitpoints(getMaxHitpoints());
		setDirection(getRespawnDirection());
		//int walkType = t(id);
		setRandomWalk(getDefinitions().walkMask);
		setBonuses();
		combat = new NPCCombat(this);
		capDamage = -1;
		lureDelay = 12000;
		// npc is inited on creating instance
		initEntity();
		World.addNPC(this);
		World.updateEntityRegion(this);
		// npc is started on creating instance
		loadMapRegions();
	}

	public void setBonuses() {
		bonuses = getCacheBonuses();
	}

	private int[] getCacheBonuses() {
		int[] bonuses = new int[8];
		Map<Integer, Object> data = getDefinitions().clientScriptData;
		if(data != null) {
			Integer meleeDamage = (Integer) data.get(641);
			bonuses[0] = meleeDamage == null ? 0 : meleeDamage;
			Integer rangeDamage = (Integer) data.get(643);
			bonuses[1] = rangeDamage == null ? 0 : rangeDamage;
			Integer mageDamage = (Integer) data.get(965);
			bonuses[2] = mageDamage == null ? 0 : mageDamage;
			Integer meleeAccuracy = (Integer) data.get(29);
			bonuses[3] = meleeAccuracy == null ? 1 : meleeAccuracy;
			Integer rangeAccuracy = (Integer) data.get(4);
			bonuses[4] = rangeAccuracy == null ? 1 : rangeAccuracy;
			Integer magicAccuracy = (Integer) data.get(3);
			bonuses[5] = magicAccuracy == null ? 1 : magicAccuracy;
			Integer armourBonus = (Integer) data.get(2865);
			bonuses[6] = armourBonus == null ? 1 : armourBonus;
			Integer critBonus = (Integer) data.get(2864);
			bonuses[7] = critBonus == null ? 1 : critBonus;
		} else
			for (int idx = 0; idx < bonuses.length; idx++)
				bonuses[idx] = 1;
		return bonuses;
	}

	public void restoreBonuses() {
		int[] b = getCacheBonuses();
		for(int i = 0; i < b.length; i++) {
			if(b[i] > bonuses[i])
				bonuses[i]++;
			else if(b[i] < bonuses[i])
				bonuses[i]--;
		}
	}

	@Override
	public boolean needMasksUpdate() {
		return super.needMasksUpdate() || refreshHeadIcon || nextSecondaryBar != null || nextTransformation != null || getCustomName() != null || getCustomCombatLevel() >= 0 /*									        * changedName
		 */;
	}

	public void setNextNPCTransformation(int id) {
		setNPC(id);
		nextTransformation = new Transformation(id);
		if (getCustomCombatLevel() != -1)
			changedCombatLevel = true;
		if (getCustomName() != null)
			changedName = true;
	}

	public void setNPC(int id) {
		this.id = id;
		setBonuses();
	}

	@Override
	public void resetMasks() {
		super.resetMasks();
		nextTransformation = null;
		nextSecondaryBar = null;
		changedCombatLevel = false;
		changedName = false;
		refreshHeadIcon = false;
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

	public void processNPC() {
		if (isDead() || locked)
			return;
		if (!combat.process()) { // if not under combat
			if (!isForceWalking()) {// combat still processed for attack delay
				// go down
				// random walk
				if (!cantInteract) {
					if (!checkAgressivity()) {
						if (!isBound() && !isStunned()) {
							if (!hasWalkSteps() && (walkType & NORMAL_WALK) != 0) {
								boolean can = Math.random() > 0.9;
								if (can) {
									int moveX = Utils.random(4, 8);
									int moveY = Utils.random(4, 8);
									if(Utils.random(2) == 0)
										moveX = -moveX;
									if(Utils.random(2) == 0)
										moveY = -moveY;
									resetWalkSteps();
									if (getMapAreaNameHash() != -1) {
										if (!MapAreas.isAtArea(getMapAreaNameHash(), this)) {
											forceWalkRespawnTile();
											return;
										}
										//fly walk noclips for now, nothing uses it anyway
										if((walkType & FLY_WALK) != 0)
											addWalkSteps(getX() + moveX, getY() + moveY, 10, false);
										else
											Entity.findBasicRoute(this, new WorldTile(getX() + moveX, getY() + moveY, getPlane()), 10, true);
									} else
										if((walkType & FLY_WALK) != 0)
											addWalkSteps(respawnTile.getX() + moveX, respawnTile.getY() + moveY, 7, false);
										else
											Entity.findBasicRoute(this, respawnTile.transform(moveX, moveY, 0), 7, true);
									//	addWalkSteps(respawnTile.getX() + moveX, respawnTile.getY() + moveY, 5, (walkType & FLY_WALK) == 0);
								}

							}
						}
					}
				}
			}
		}
		if(getId() == 15775)
		{
		    setNextForceTalk(new ForceTalk("I can teleport you all around Vernox!"));
		}
		if(getId() == 13930)
		{
		    setName("Shop Manager");
		    setNextForceTalk(new ForceTalk("I'm the shop manager of Vernox!"));
		}
		if(getId() == 8480)
		{
		    setName("<col=00ff00>Beginner Slayer Master</col>");
		    setNextForceTalk(new ForceTalk("<col=00ff00>Beginning Slayer Master</col>"));
		}
		if (getId() == 14362)
		{
		    setName("Agility Scout");
		}
		if (getId() == 15772)
		{
		    setName("Player Designer");
		    setNextForceTalk(new ForceTalk("Modify your player appearence here!"));
		}
		if (isForceWalking()) {
			if (!isBound() && !isStunned()) {
				if (getX() != forceWalk.getX() || getY() != forceWalk.getY()) {
					if (!hasWalkSteps()) {
						int steps = RouteFinder.findRoute(RouteFinder.WALK_ROUTEFINDER, getX(), getY(), getPlane(), getSize(), new FixedTileStrategy(forceWalk.getX(), forceWalk.getY()), true);
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
	/*  private static int walkType(int npcId) {
	switch (npcId) {
	    case 11226:
		return RANDOM_WALK;
	    case 3341:
	    case 3342:
	    case 3343:
		return RANDOM_WALK;
	    default:
		return -1;
	}
	  }*/


	@Override
	public void handleIngoingHit(final Hit hit) {
		if (capDamage != -1 && hit.getDamage() > capDamage)
			hit.setDamage(capDamage);
		if (hit.getLook() != HitLook.MELEE_DAMAGE && hit.getLook() != HitLook.RANGE_DAMAGE && hit.getLook() != HitLook.MAGIC_DAMAGE)
			return;
		Entity source = hit.getSource();
		if (source == null)
			return;
		 if (getEffectsManager().hasActiveEffect(EffectType.BARRICADE))
				hit.setDamage(0);
		if (source instanceof Player) {
			((Player) source).getPrayer().handleHitPrayers(this, hit);
			((Player) source).getControlerManager().processIncommingHit(hit, this);
		}

	}

	@Override
	public void reset() {
		super.reset();
		setDirection(getRespawnDirection());
		combat.reset();
		setBonuses(); // back to real bonuses
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
		if(bossInstance != null && bossInstance.isFinished())
			return;
		if (!hasFinished()) {
			reset();
			setLocation(respawnTile);
			finish();
		}
		long respawnDelay = getCombatDefinitions().getRespawnDelay() * 600;
		if(bossInstance != null) 
			respawnDelay /= bossInstance.getSettings().getSpawnSpeed();
		GameExecutorManager.slowExecutor.schedule(new Runnable() {
			@Override
			public void run() {
				try {
					if(bossInstance != null && bossInstance.isFinished())
						return;
					spawn();
				} catch (Throwable e) {
					Logger.handle(e);
				}
			}
		}, respawnDelay, TimeUnit.MILLISECONDS);
	}
	
	public void setLongRespawnTask() {
		if (!hasFinished()) {
			reset();
			setLocation(respawnTile);
			finish();
		}
		GameExecutorManager.slowExecutor.schedule(new Runnable() {
			@Override
			public void run() {
				try {
					spawn();
				} catch (Throwable e) {
					Logger.handle(e);
				}
			}
		}, getCombatDefinitions().getRespawnDelay() * 2000,
		TimeUnit.MILLISECONDS);
	}

	public void setRespawnTile(WorldTile respawnTile) {
		this.respawnTile = respawnTile;
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
	}

	public NPCCombat getCombat() {
		return combat;
	}

	@Override
	public void sendDeath(final Entity source) {
		final NPCCombatDefinitions defs = getCombatDefinitions();
		resetWalkSteps();
		combat.removeTarget();
		setNextAnimation(null);
		if (!isDead())
			setHitpoints(0);
		final int deathDelay = defs.getDeathDelay() - (getId() == 50 ? 2 : 1);
		WorldTasksManager.schedule(new WorldTask() {
			int loop;

			@Override
			public void run() {
				if (loop == 0) {
					setNextAnimation(new Animation(defs.getDeathEmote()));
				} else if (loop >= deathDelay) {
					if (source instanceof Player)
						((Player) source).getControlerManager().processNPCDeath(NPC.this);
					giveXP();
					drop();
					reset();
					setLocation(respawnTile);
					finish();
					if (!isSpawned())
						setRespawnTask();
					if (source.getAttackedBy() == NPC.this) { //no need to wait after u kill
						source.setAttackedByDelay(0);
						source.setAttackedBy(null);
						source.setFindTargetDelay(0);
					}
					stop();
				}
				loop++;
			}
		}, 0, 1);
	}
	
	@Override
	public void giveXP() {
		if (getCombatDefinitions() == NPCCombatDefinitionsL.DEFAULT_DEFINITION || getMaxHitpoints() == 1)
			return;
		Combat.giveXP(this, getCombatDefinitions().getXp());
	}
	
	
	

	public void drop() {
		if (getCombatDefinitions() == NPCCombatDefinitionsL.DEFAULT_DEFINITION || getMaxHitpoints() == 1
				|| (bossInstance != null && (bossInstance.isFinished() || bossInstance.getSettings().isPractiseMode())))
			return;
		Player killer = getMostDamageReceivedSourcePlayer();
		if (killer == null)
			return;
		Player otherPlayer = killer.getSlayerManager().getSocialPlayer();
		SlayerManager manager = killer.getSlayerManager();
		if (manager.isValidTask(getName()))
			manager.checkCompletedTask(getDamageReceived(killer), otherPlayer != null ? getDamageReceived(otherPlayer) : 0);
		Drops drops = NPCDrops.getDrops(id);
		if (drops == null)
			return;
		List<Player> players = FriendsChat.getLootSharingPeople(killer);

		double dropRate = 0;

		if (players == null || players.size() == 1) 
			dropRate = Settings.getDropRate(killer);
		else{ //to be fair
			for (Player p2 : players) 
				dropRate += Settings.getDropRate(p2);
			dropRate /= players.size();
		}
		
		if (killer.getTask() != null) {
			if (getDefinitions().name.toLowerCase().equalsIgnoreCase(
					killer.getTask().getName().toLowerCase())) {
				killer.getSkills().addXp(Skills.SLAYER,
						killer.getTask().getXPAmount());
				killer.getTask().decreaseAmount();
				if (killer.getTask().getTaskAmount() < 1) {
					if (killer.getEquipment().getRingId() == 13281) {
						killer.setGrimPoints(killer.getGrimPoints() + 40);
						killer.getDialogueManager()
								.startDialogue(
										"SimpleNPCMessage",
										8461,
										"You've just finished your slayer task, you have been awarded 40 Slayer points.");
					} else {
						killer.setGrimPoints(killer.getGrimPoints() + 20);
						killer.getDialogueManager()
								.startDialogue(
										"SimpleNPCMessage",
										8461,
										"You've just finished your slayer task, you have been awarded 20 Slayer points.");
					}
					killer.setTask(null);
					return;
				}
				killer.getTask().setAmountKilled(
						killer.getTask().getAmountKilled() + 1);
				killer.getPackets().sendGameMessage(
						"You need to defeat "
								+ killer.getTask().getTaskAmount() + " "
								+ killer.getTask().getName().toLowerCase()
								+ " to complete your task.");
			}
		}
		
		int roll = Utils.random(0, 200);
		List<Drop> dropL = drops.generateDrops(killer, dropRate * dropRateFactor);
		drops.addCharms(dropL, getSize());
		int R_EASY = Utils.random(100, 300);
		int R_MEDIUM = Utils.random(300, 700);
		int R_HARD = Utils.random(700, 1000);
		//dungnpcs
		if (getId() == 10257)
		{
		    killer.setDungTokens(killer.getDungTokens() + R_EASY);
		    killer.getSkills().addXp(Skills.DUNGEONEERING, R_EASY);
		    killer.sendMessage("You received " + R_EASY + " dungeoneering tokens for this kill");
		}
		
		if (getId() == 10859)
		{
		    killer.setDungTokens(killer.getDungTokens() + R_MEDIUM);
		    killer.getSkills().addXp(Skills.DUNGEONEERING, R_MEDIUM);
		    killer.sendMessage("You received " + R_MEDIUM + " dungeoneering tokens for this kill");

		}
		
		if (getId() == 10905)
		{
		    killer.setDungTokens(killer.getDungTokens() + R_HARD);
		    killer.getSkills().addXp(Skills.DUNGEONEERING, R_HARD);
		    killer.sendMessage("You received " + R_HARD + " dungeoneering tokens for this kill");

		}
		
		if (getId() == 78)
		{
		    dropL.add(new Drop(25549, 1, 1));
		}
		else if (getId() == 59)
		{
			
		dropL.add(new Drop(25547, 1, 1));
			
		}
		
		else if (getId() == 1615)
		{	
		    if (roll > 3 && roll < 6)
		    {
			    //killer.sendMessage("[Roll] : " + roll);
			dropL.add(new Drop(30825, 1, 1));
			
		    }
		    else if (roll < 3)
		    {
			    //killer.sendMessage("[Roll] : " + roll);

			dropL.add(new Drop(30828, 1, 1));
		    }
		}

		if (players == null || players.size() == 1) {
			boolean hasBonecrusher = killer.getInventory().containsOneItem(18337);
			boolean hasHerbicide = killer.getInventory().containsOneItem(19675);
			boolean hasCharmingImp = killer.getInventory().containsOneItem(27996);
			for (Drop drop : dropL) {
				if(hasBonecrusher) {
					Bone bone = Bone.forId(drop.getItemId());
					if(bone != null && !bone.isAsh()) {
						killer.getSkills().addXp(Skills.PRAYER, bone.getExperience());
						continue;
					}
				}
				if(hasHerbicide) {
					final Herbs herb = HerbCleaning.getHerb(drop.getItemId());
					if(herb != null && killer.getSkills().getLevel(Skills.HERBLORE) >= herb.getLevel()) {
						killer.getSkills().addXp(Skills.HERBLORE, herb.getExperience()*2);
						continue;
					}
				}
				if(hasCharmingImp) {
				   if (drop.getItemId() == 12158) {
				       killer.getInventory().addItem(12158, 1);
				       continue;
				   }
				   else if (drop.getItemId() == 12159) {
				       killer.getInventory().addItem(12159, 1);
				       continue;
				   }
				   else if (drop.getItemId() == 12160) {
				       killer.getInventory().addItem(12159, 1);
				       continue;
				   }
				   else if (drop.getItemId() == 12163) {
				       killer.getInventory().addItem(12159, 1);
				       continue;
				   }  
				}
				if (killer.getTreasureTrailsManager().isScroll(drop.getItemId())) {
					if (killer.getTreasureTrailsManager().hasClueScrollItem())
						continue;
					killer.getTreasureTrailsManager().resetCurrentClue();
				}
				sendDrop(killer, drop);
			}
		} else {
			for (Drop drop : dropL) {
				Player luckyPlayer = players.get(Utils.random(players.size()));
				if (luckyPlayer.getTreasureTrailsManager().isScroll(drop.getItemId())) {
					if (luckyPlayer.getTreasureTrailsManager().hasClueScrollItem())
						continue;
					luckyPlayer.getTreasureTrailsManager().resetCurrentClue();
				}
				Item item = sendDrop(luckyPlayer, drop);
				luckyPlayer.getPackets().sendGameMessage("<col=00FF00>You received: " + item.getAmount() + " " + item.getName() + ".");
				for (Player p2 : players) {
					if (p2 == luckyPlayer)
						continue;
					p2.getPackets().sendGameMessage("<col=66FFCC>" + luckyPlayer.getDisplayName() + "</col> received: " + item.getAmount() + " " + item.getName() + ".");
					p2.getPackets().sendGameMessage("Your chance of receiving loot has improved.");
				}
			}
		}
	}

	public Item sendDrop(Player player, Drop drop) {
		String dropName = ItemDefinitions.getItemDefinitions(drop.getItemId())
			.getName().toLowerCase();
		final int size = getSize();
		if (dropName.contains("pernix") || dropName.contains("torva")
			|| dropName.contains("abyssal orb")
			|| dropName.contains("abyssal wand")
			|| dropName.contains("abyssal whip")
			|| dropName.contains("virtus")
			|| dropName.contains("torag's")
			|| dropName.contains("ahrim's")
			|| dropName.contains("dharok's")
			|| dropName.contains("verac's")
			|| dropName.contains("guthin's")
			|| dropName.contains("torags")
			|| dropName.contains("ahrims")
			|| dropName.contains("dharoks")
			|| dropName.contains("veracs")
			|| dropName.contains("guthins")
			|| dropName.contains("virtus")
			|| dropName.contains("bandos chestplate")
			|| dropName.contains("bandos tassets")
			|| dropName.contains("bandos boots")
			|| dropName.contains("black mask")
			|| dropName.contains("bandos helm")
			|| dropName.contains("hilt")
			|| dropName.contains("hati") || dropName.contains("korasi")
			|| dropName.contains("divine")
			|| (dropName.contains("saradomin")  && !dropName.contains("brew"))
			|| dropName.contains("visage")
			|| dropName.contains("zamorakian")
			|| dropName.contains("spectral")
			|| dropName.contains("elysian")
			|| dropName.contains("steadfast")
			|| dropName.contains("armadyl chest")
			|| dropName.contains("armadyl plate")
			|| dropName.contains("armadyl boots")
			|| dropName.contains("armadyl helmet")
			|| dropName.contains("armadyl gloves")
			|| dropName.contains("armadyl_chest")
			|| dropName.contains("armadyl_plate")
			|| dropName.contains("armadyl_boots")
			|| dropName.contains("armadyl_helmet")
			|| dropName.contains("armadyl_gloves")
			|| dropName.contains("armadyl_chainskirt")
			|| dropName.contains("armadyl chainskirt")
			|| dropName.contains("buckler")
			|| dropName.contains("glaiven")
			|| dropName.contains("ragefire")
			|| dropName.contains("spirit shield")
			|| dropName.contains("spirit_shield")
			|| dropName.contains("elixer")
			|| dropName.contains("fury")
			|| dropName.contains("arcane")
			|| dropName.contains("whip vine")
			|| dropName.contains("goliath")
			|| dropName.contains("swift")
			|| dropName.contains("spellcaster")
			|| dropName.contains("gorgonite")
			|| dropName.contains("promethium")
			|| dropName.contains("primal")
			|| dropName.contains("polypore_stick")
			|| dropName.contains("polypore stick")
			|| dropName.contains("ganodermic gloves")
			|| dropName.contains("ganodermic_gloves")
			|| dropName.contains("ganodermic boots")
			|| dropName.contains("ganodermic_boots")
			|| dropName.contains("vesta")
			|| dropName.contains("statius")
			|| dropName.contains("zuriel")
			|| dropName.contains("morrigan")
			|| dropName.contains("crystal_key")
			|| dropName.contains("crystal key")
			|| dropName.contains("clue")
			|| dropName.contains("clue_scroll_(elite)")
			|| dropName.contains("clue_scroll_(easy)")
			|| dropName.contains("clue_scroll_(hard)")
			|| dropName.contains("clue_scroll_(medium)")
			|| dropName.contains("deathtouched")
			|| dropName.contains("dragon_chain")
			|| dropName.contains("dragon chain")
			|| dropName.contains("dragon_full")
			|| dropName.contains("dragon full")
			|| dropName.contains("dragon_kite")
			|| dropName.contains("dragon kite")
			|| dropName.contains("dragon_rider")
			|| dropName.contains("dragon rider")
			|| dropName.contains("inferno")
			|| dropName.contains("gilded")
			//|| dropName.contains("bones")
			|| dropName.contains("chaotic")
			|| dropName.contains("seismic_wand")
			|| dropName.contains("seismic_singularity")
			|| dropName.contains("abyssal_whip")
			|| dropName.contains("drygore_mace")
			|| dropName.contains("drygore_rapier")
			|| dropName.contains("drygore_longsword")
			|| dropName.contains("Off-hand_drygore_rapier")
			|| dropName.contains("Off-hand_drygore_mace")
			|| dropName.contains("Off-hand_drygore_longsword")){
		  World.sendPrivateGraphics(player, player, new Graphics(4422), new WorldTile(getCoordFaceX(size),getCoordFaceY(size), getPlane()));
		  
		  WorldTasksManager.schedule(new WorldTask() {

			@Override
			public void run() {
				int loop = 0;
				if (loop == 1) {
				    World.sendPrivateGraphics(player, player, new Graphics(4422), new WorldTile(getCoordFaceX(size),getCoordFaceY(size), getPlane()));
				}
				if (loop == 2) {
				    World.sendPrivateGraphics(player, player, new Graphics(4422), new WorldTile(getCoordFaceX(size),getCoordFaceY(size), getPlane()));
					}
				if (loop == 3) {
				    World.sendPrivateGraphics(player, player, new Graphics(4422), new WorldTile(getCoordFaceX(size),getCoordFaceY(size), getPlane()));
					}
				if (loop == 4) {
					 stop();
					}
				 loop++;
			}
			  
		  }, 0, 1);
		  
		  player.getPackets().sendGameMessage("<col=ff8c38>A golden beam shines over one of your items.");
		World.sendWorldMessage("<col=ff8c38><img=7>News: "+ player.getDisplayName() + " has just recieved a " + dropName + " drop!"+ "</col> ", false);
		}
		boolean stackable = ItemDefinitions.getItemDefinitions(drop.getItemId()).isStackable();
		Item item = stackable ? new Item(drop.getItemId(), (drop.getMinAmount() * Settings.getDropQuantityRate()) + Utils.random(drop.getExtraAmount() * Settings.getDropQuantityRate())) : new Item(drop.getItemId(), drop.getMinAmount() + Utils.random(drop.getExtraAmount()));
		//rs doesnt do this. unless u got that autocollect imp
		/*if (item.getId() == 995)
			player.getInventory().addItemMoneyPouch(item);
		else {*/
			if (!stackable && item.getAmount() > 1) {
				for (int i = 0; i < item.getAmount(); i++)
					World.addGroundItem(new Item(item.getId(), 1), new WorldTile(getCoordFaceX(size), getCoordFaceY(size), getPlane()), player, true, 60);
			} else
				World.addGroundItem(item, new WorldTile(getCoordFaceX(size), getCoordFaceY(size), getPlane()), player, true, 60);
		//}
		return item;
	}

	@Override
	public int getSize() {
		return getDefinitions().size;
	}

	public int getMaxHit(int style) {
		int maxHit = bonuses[0];
		if (style == 1)
			maxHit = bonuses[1];
		else if (style == 2)
			maxHit = bonuses[2];
		return maxHit / 10;
	}

	@Override
	public int[] getBonuses() {
		return bonuses;
	}

	@Override
	public double getMagePrayerMultiplier() {
		return 0.5;
	}

	@Override
	public double getRangePrayerMultiplier() {
		return 0.5;
	}

	@Override
	public double getMeleePrayerMultiplier() {
		return 0.5;
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
		if (target == combat.getTarget() && !(combat.getTarget() instanceof Familiar)) {
			lastAttackedByTarget = Utils.currentTimeMillis();
			if(target instanceof Player) {
				if(((Player) target).getEffectsManager().hasActiveEffect(EffectType.INCITE))
				lastAttackedByTarget += 3000; 				//3seconds to keep agro extra. enough, even makes those who dont focus, start focusing	
			}
		}
	}

	public boolean canBeAttackedByAutoRelatie() {
		return Utils.currentTimeMillis() - lastAttackedByTarget > lureDelay;
	}

	public boolean isForceWalking() {
		return forceWalk != null;
	}

	public void setTarget(Entity entity) {
		if (isForceWalking() || cantInteract) // if force walk not gonna get target
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
						if (player == null || player.getCutscenesManager().hasCutscene() || !player.clientHasLoadedMapRegion() || player.getPlane() != getPlane() || player.isDead() || player.hasFinished() || !player.isRunning() || player.getAppearence().isHidden() || !Utils.isOnRange(getX(), getY(), size, player.getX(), player.getY(), player.getSize(), forceTargetDistance > 0 ? forceTargetDistance : agroRatio) || !clipedProjectile(player, false) || (!forceAgressive && !Wilderness.isAtWild(this) && player.getSkills().getCombatLevelWithSummoning() >= getCombatLevel() * 2))
							continue;
						possibleTarget.add(player);
						if (checkNPCs) {
							Familiar familiar = player.getFamiliar();
							if (familiar == null || familiar.isDead() || familiar.isFinished() || !Utils.isOnRange(getX(), getY(), size, familiar.getX(), familiar.getY(), familiar.getSize(), forceTargetDistance > 0 ? forceTargetDistance : agroRatio) || !clipedProjectile(familiar, false))
								continue;
							possibleTarget.add(familiar);
						}
					}
				}
			}
			if (checkNPCs) {
				List<Integer> npcsIndexes = World.getRegion(regionId).getNPCsIndexes();
				if (npcsIndexes != null) {
					for (int npcIndex : npcsIndexes) {
						NPC npc = World.getNPCs().get(npcIndex);
						if (npc == null || npc instanceof Familiar || npc.getPlane() != getPlane() || npc == this || npc.isDead() || npc.hasFinished() || !Utils.isOnRange(getX(), getY(), size, npc.getX(), npc.getY(), npc.getSize(), forceTargetDistance > 0 ? forceTargetDistance : agroRatio) || (!npc.getDefinitions().hasAttackOption()) || /*((!isAtMultiArea() || !npc.isAtMultiArea()) && npc.getAttackedBy() != this && npc.getAttackedByDelay() > Utils.currentTimeMillis()) ||*/ !clipedProjectile(npc, false) || npc.isCantInteract())
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

	@Override
	public boolean isStunImmune() {
		Map<Integer, Object> data = getDefinitions().clientScriptData;
		if(data != null) {
			Integer immune = (Integer) data.get(2892);
			return immune != null && immune == 1;
		}
		return false;
	}
	
	@Override
	public boolean isBoundImmune() {
		return isStunImmune();
	}

	@Override
	public boolean isPoisonImmune() {
		return getCombatDefinitions().isPoisonImmune();
	}

	public boolean checkAgressivity() {
		if (!forceAgressive) {
			NPCCombatDefinitions defs = getCombatDefinitions();
			if (!defs.isAgressive())
				return false;
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
		return getDefinitions().getName() + " - " + id + " - " + getX() + " " + getY() + " " + getPlane();
	}

	public boolean isForceAgressive() {
		return forceAgressive;
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


	public void setRandomWalk(int forceRandomWalk) {
		this.walkType = forceRandomWalk;
	}

	public String getCustomName() {
		return name;
	}

	public void setName(String string) {
		this.name = getDefinitions().getName().equals(string) ? null : string;
		changedName = true;
	}

	public int getCustomCombatLevel() {
		return combatLevel;
	}

	@Override
	public int getCombatLevel() {
		return combatLevel >= 0 ? combatLevel : getDefinitions().combatLevel;
	}

	@Override
	public String getName() {
		return name != null ? name : getDefinitions().getName();
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

	public boolean isIntelligentRouteFinder() {
		return intelligentRouteFinder;
	}

	public void setIntelligentRouteFinder(boolean intelligentRouteFinder) {
		this.intelligentRouteFinder = intelligentRouteFinder;
	}

	public double getDropRateFactor() {
		return dropRateFactor;
	}

	public void setDropRateFactor(double dropRateFactor) {
		this.dropRateFactor = dropRateFactor;
	}

	public SecondaryBar getNextSecondaryBar() {
		return nextSecondaryBar;
	}

	public void setNextSecondaryBar(SecondaryBar secondaryBar) {
		this.nextSecondaryBar = secondaryBar;
	}

	public boolean isCantSetTargetAutoRelatio() {
		return cantSetTargetAutoRelatio;
	}

	public void setCantSetTargetAutoRelatio(boolean cantSetTargetAutoRelatio) {
		this.cantSetTargetAutoRelatio = cantSetTargetAutoRelatio;
	}

	@Override
	public boolean canMove(int dir) {
		return true;
	}

	public int getStrengthType() {
		int type = Combat.getStyleType(getWeaknessStyle());
		if (type == Combat.MELEE_TYPE)
			return Combat.MAGIC_TYPE;
		else if (type == Combat.RANGE_TYPE)
			return Combat.MELEE_TYPE;
		else if (type == Combat.MAGIC_TYPE)
			return NPCCombatDefinitions.RANGE;
		return Combat.ALL_TYPE;
	}

	public int getWeaknessStyle() {
		Map<Integer, Object> data = getDefinitions().clientScriptData;
		if(data != null) {
			Integer weakness = (Integer) data.get(2848);
			if (weakness != null)
				return weakness;
		}
		return 0;
	}

	public double getCritChance() {
		Map<Integer, Object> data = getDefinitions().clientScriptData;
		if(data != null) {
			Integer crit = (Integer) data.get(2864);
			if (crit != null)
				return crit / 10.0;
		}
		return 5.0;
	}

	public int getAttackStyle() {
		if(bonuses[2] > 0)
			return NPCCombatDefinitions.MAGE;
		if(bonuses[1] > 0)
			return NPCCombatDefinitions.RANGE;
		return NPCCombatDefinitions.MELEE;
	}

	public int getAttackSpeed() {
		Map<Integer, Object> data = getDefinitions().clientScriptData;
		if(data != null) {
			Integer speed = (Integer) data.get(14);
			if(speed != null)
				return speed;
		}
		return 4;
	}

	public HeadIcon[] getIcons() {
		return new HeadIcon[0];
	}

	public void requestIconRefresh() {
		refreshHeadIcon = true;
	}

	public boolean isRefreshHeadIcon() {
		return refreshHeadIcon;
	}
	
	public void increaseKills(RecordKey key, boolean hm) {
		for(Entity s : getReceivedDamageSources()) {
			if(s instanceof Player)
				((Player)s).getTimersManager().increaseKills(key, hm);
		}
	}
	
	public void setBossInstance(BossInstance instance) {
		bossInstance = instance;
	}
	
	public BossInstance getBossInstance() {
		return bossInstance;
	}
}
