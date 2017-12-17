package com.rs.game.player.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.Region;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.impl.VoragoCombat;
import com.rs.game.npc.corp.CorporealBeast;
import com.rs.game.npc.familiar.Familiar;
import com.rs.game.npc.familiar.Steeltitan;
import com.rs.game.npc.fightkiln.HarAken;
import com.rs.game.npc.fightkiln.HarAkenTentacle;
import com.rs.game.npc.godwars.zaros.NexMinion;
import com.rs.game.npc.others.PestPortal;
import com.rs.game.npc.qbd.QueenBlackDragon;
import com.rs.game.npc.vorago.Vorago;
import com.rs.game.npc.vorago.VoragoHandler;
import com.rs.game.player.CombatDefinitions;
import com.rs.game.player.Equipment;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.slayer.Slayer.SlayerTask;
import com.rs.game.player.content.Combat;
import com.rs.game.player.content.Magic;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.MapAreas;
import com.rs.utils.Utils;

public class PlayerCombat extends Action {

	public static final boolean LEGACY = false;

	private Entity target;
	private int max_hit; // temporary constant
	private double base_mage_xp; // temporary constant
	private int mage_hit_gfx; // temporary constant
	private int magic_sound; // temporary constant
	private int max_poison_hit; // temporary constant
	private int freeze_time; // temporary constant
	private boolean reduceAttack; // temporary constant
	private boolean blood_spell; // temporary constant
	private boolean block_tele;
	private int spellcasterGloves;

	public PlayerCombat(Entity target) {
		this.target = target;
	}

	@Override
	public boolean start(Player player) {
		player.setNextFaceEntity(target);
		if (checkAll(player)) {
			if (player.getAppearence().getTransformedNpcId() > 0) {
				player.getAppearence().transformIntoNPC(-1);
			}
			int weaponId = (!player.secondary ? player.getEquipment().getWeaponId() : player.getEquipment().getShieldId());
			if (weaponId == -1) {
				player.secondary = !player.secondary;
				weaponId = (!player.secondary ? player.getEquipment().getWeaponId() : player.getEquipment().getShieldId());
			}
			player.needsToExitCombat = false;
			return true;
		}
		player.setNextFaceEntity(null);
		return false;
	}

	@Override
	public boolean process(Player player) {
		return checkAll(player);
	}

	private boolean forceCheckClipAsRange(Entity target) {
		return target instanceof NexMinion
				|| target instanceof HarAken
				|| target instanceof HarAkenTentacle
				|| target instanceof CorporealBeast
				|| target instanceof QueenBlackDragon
				|| target instanceof PestPortal;
	}

	@Override
	public int processWithDelay(Player player) {
		final int isRanging = isRanging(player);
		int spellId = player.getCombatDefinitions().getSpellId();
		if (spellId < 1 && hasPolyporeStaff(player)) {
			spellId = 65535;
		}
		int maxDistance = (spellId > 0 && isRanging == IS_MAGIC_WEAPON || isRanging != NOT_RANGING || hasPolyporeStaff(player)) ? 7 : 0;
		final int distanceX = player.getX() - target.getX();
		final int distanceY = player.getY() - target.getY();
		double multiplier = 1.0;
		if (player.getTemporaryAttributtes().get("miasmic_effect") == Boolean.TRUE) 
			multiplier = 1.5;
		final int size = target.getSize();
		if (!player.clipedProjectile(target, maxDistance == 0 && !forceCheckClipAsRange(target)))
			return 0;
		if (target instanceof CorporealBeast) { //Fixed CorporealBeast's Safe Spotting
			maxDistance = 7;
		}
		if (player.hasWalkSteps())
			maxDistance += 1;
		if (distanceX > size + maxDistance || distanceX < -1 - maxDistance
				|| distanceY > size + maxDistance
				|| distanceY < -1 - maxDistance)
			return 0;
		if (!player.getControlerManager().keepCombating(target))
			return -1;
		addAttackedByDelay(player);
		final int weaponId = (!player.secondary ? player.getEquipment().getWeaponId() : player.getEquipment().getShieldId());
		if (weaponId != -1) {
			final ItemDefinitions defs = ItemDefinitions.getItemDefinitions(weaponId);
			if (defs != null) {
				if (defs.getCombatRenderEmote(LEGACY) != -1)
					player.getAppearence().setRenderEmote(defs.getCombatRenderEmote(LEGACY), true);
			}
		}
		if (player.getTemporaryAttributtes().remove("RingNPC") != null) {
			player.unlock();
			player.getAppearence().transformIntoNPC(-1);
			player.setNextAnimation(new Animation(14884));
		}
		if (spellId > 0 && isRanging == IS_MAGIC_WEAPON) {
			boolean manualCast = spellId != 65535 && spellId >= 256;
			Item gloves = player.getEquipment().getItem(Equipment.SLOT_HANDS);
			spellcasterGloves = gloves != null && gloves.getDefinitions().getName().contains("Spellcaster glove") && Utils.random(30) == 0 ? spellId : -1;
			int delay = mageAttack(player, manualCast ? spellId - 256 : spellId, !manualCast);
			if (player.getNextAnimation() != null && spellcasterGloves > 0) {
				player.setNextAnimation(new Animation(14339));
				spellcasterGloves = -1;
			}
			return delay;
		} else {
			switch (isRanging) {
			case IS_MAGIC_WEAPON:
				if (spellId > 0) {
					boolean manualCast = spellId != 65535 && spellId >= 256;
					Item gloves = player.getEquipment().getItem(Equipment.SLOT_HANDS);
					spellcasterGloves = gloves != null && gloves.getDefinitions().getName().contains("Spellcaster glove") 
							&& player.getEquipment().getWeaponId() == -1 ? spellId : -1;
					final int delay = mageAttack(player, manualCast ? spellId - 256 : spellId, !manualCast);
					if (player.getNextAnimation() != null && spellcasterGloves > 0) {
						player.setNextAnimation(new Animation(14339));
						spellcasterGloves = -1;
					}
					return delay;
				} else {
					player.getPackets().sendGameMessage("You don't have a spell selected.");
					return -1;
				}
			case NOT_RANGING:
				return (int) (meleeAttack(player) * multiplier);
			case INVALID_AMMO:
				player.getPackets().sendGameMessage("This ammo is not very effective with this weapon.");
				return -1;
			case OUT_OF_AMMO:
				player.getPackets().sendGameMessage("You dont have any ammo in your backpack.");
				return -1;
			case RANGING:
			default:
				return (int) (rangeAttack(player) * multiplier);
			}
		}
	}

	private void addAttackedByDelay(Entity player) {
		target.setAttackedBy(player);
		final long currentTime = Utils.currentTimeMillis();
		target.setAttackedByDelay(currentTime + 8000);// 8seconds
		player.lastAttackedEntity = currentTime + 8000;//8 seconds
	}

	private int getRangeCombatDelay(int weaponId, int attackStyle) {
		int delay = 6;
		if (weaponId != -1) {
			final ItemDefinitions defs = ItemDefinitions.getItemDefinitions(weaponId);
			if (defs != null) {
				delay = defs.getWeaponAttackDelay();
				if (defs.isRangedWeaponDoesNotRequireAmmunitionToFunction())
					delay--;
			}
		}
		if (attackStyle == 1)
			delay--;
		else if (attackStyle == 2)
			delay++;
		return delay;
	}

	public Entity[] getMultiAttackTargets(Player player) {
		return getMultiAttackTargets(player, 1, 9);
	}

	public Entity[] getMultiAttackTargets(Player player, int maxDistance, int maxAmtTargets) {
		final List<Entity> possibleTargets = new ArrayList<Entity>();
		possibleTargets.add(target);
		if(target.isAtMultiArea()) {
			y: for (final int regionId : target.getMapRegionsIds()) {
				final Region region = World.getRegion(regionId);
				if(target instanceof Player) {
					final List<Integer> playerIndexes = region.getPlayerIndexes();
					if(playerIndexes == null)
						continue;
					for (final int playerIndex : playerIndexes) {
						final Player p2 = World.getPlayers().get(playerIndex);
						if (p2 == null || p2 == player || p2 == target
								|| p2.isDead() || !p2.hasStarted() || p2.hasFinished()
								|| !p2.isCanPvp()
								|| !p2.isAtMultiArea()
								|| !p2.withinDistance(target, maxDistance)
								|| !player.getControlerManager().canHit(p2))
							continue;
						possibleTargets.add(p2);
						if(possibleTargets.size() == maxAmtTargets)
							break y;
					}
				}else{
					final List<Integer> npcIndexes = region.getNPCsIndexes();
					if(npcIndexes == null)
						continue;
					for (final int npcIndex : npcIndexes) {
						final NPC n = World.getNPCs().get(npcIndex);
						if (n == null || n == target
								|| n == player.getFamiliar()
								|| n.isDead() || n.hasFinished()
								|| !n.isAtMultiArea()
								|| n.isPet()
								|| !n.withinDistance(target, maxDistance)
								|| !n.getDefinitions().hasAttackOption()
								|| !player.getControlerManager().canHit(n))
							continue;
						possibleTargets.add(n);
						if(possibleTargets.size() == maxAmtTargets)
							break y;
					}
				}
			}
		}
		return possibleTargets.toArray(new Entity[possibleTargets.size()]);
	}

	private int getMagicEmote(boolean isStaff, boolean secondary, int spellbook) {
		if (isStaff)
			return (spellbook == STANDARD_BOOK ? 18300 : 18379);
		return (spellbook == STANDARD_BOOK ? 18249 : 18382);
		//return spellbook == STANDARD_BOOK ? 14221 : 23989;
	}

	private int getProjectile(boolean isStaff, int index) {
		if (index == -1)
			return -1;
		if (isStaff)
			return STANDARD_PROJECTILES[index][1];
		return STANDARD_PROJECTILES[index][0];
	}

	private static final int[][] STANDARD_PROJECTILES = {
			{3600, 3601},//air
			{3602, 3603},//earth
			{3604, 3605},//water
			{3606, 3607},//fire
			{3608, 3609}//ancient
	};

	private int getIndex(int spellId, int spellbook) {
		if (spellbook == STANDARD_BOOK) {
			switch (spellId) {
			case 98:
			case 25:
			case 34:
			case 49:
			case 70:
			case 84:
			case 99://storm of arma
				return AIR;
			case 28:
			case 39:
			case 52:
			case 73:
			case 87:
				return WATER;
			case 30:
			case 42:
			case 58:
			case 77:
			case 89:
				return EARTH;
			case 32:
			case 45:
			case 63:
			case 80:
			case 91:
				return FIRE;
			default:
				return CURSES;
			}
		} else if (spellbook == ANCIENT_BOOK) {
			switch (spellId) {

			}
		}
		return -1;
	}

	private static final int AIR = 0, EARTH = 1, WATER = 2, FIRE = 3, CURSES = 4;

	private static final int ANCIENT_BOOK = 193, STANDARD_BOOK = 192;

	private void launchMagicProjectile(Player player, Entity target, boolean isStaff, int projectileId) {
		World.sendProjectile(player, target, projectileId, (isStaff ? 35 : 30), (isStaff ? 30 : 18) /*18, 18*/, 50, 40, 0, 0);
	}

	private void launchMagicProjectile(Player player, Entity target, boolean isStaff, int projectileId, int curve) {
		World.sendProjectile(player, target, projectileId, (isStaff ? 35 : 30), (isStaff ? 30 : 18), 50, 40,curve, 0);
	}

	public int mageAttack(final Player player, int spellId, boolean autocast) {
		if (!autocast) {
			player.getCombatDefinitions().resetSpells(false);
			player.getActionManager().forceStop();
		}
		if (!Magic.checkCombatSpell(player, spellId, -1, true)) {
			if (autocast)
				player.getCombatDefinitions().resetSpells(true);
			return -1; // stops
		}
		if (spellId == 65535) {
			player.setNextFaceEntity(target);
			//player.setNextGraphics(new Graphics(2034));
			player.setNextAnimation(new Animation(18300/*15448*/));
			mage_hit_gfx = 2036;
			delayMagicHit(2,getMagicHit(player, getRandomMagicMaxHit(player, (5 * player.getSkills().getLevel(Skills.MAGIC)) - 180)));
			//World.sendProjectile(player, target, 2035, 60, 32, 50, 50, 0, 0);
			launchMagicProjectile(player,target,true,2035);
			return 4;
		}
		int weaponId = (!player.secondary ? player.getEquipment().getWeaponId() : player.getEquipment().getShieldId());
		if (weaponId != -1 && ItemDefinitions.getItemDefinitions(weaponId).isShield()) {
			player.secondary = !player.secondary;
			weaponId = (!player.secondary ? player.getEquipment().getWeaponId() : player.getEquipment().getShieldId());
		}
		if (weaponId == -1) {
			player.secondary = !player.secondary;
			weaponId = (!player.secondary ? player.getEquipment().getWeaponId() : player.getEquipment().getShieldId());
		}
		boolean isStaff = false;
		if (weaponId != -1 && Equipment.isTwoHandedWeapon(ItemDefinitions.getItemDefinitions(weaponId)))
			isStaff = true;
		final int emote = getMagicEmote(isStaff, player.secondary, player.getCombatDefinitions().getSpellBook());
		final int graphics = getProjectile(isStaff, getIndex(spellId, player.getCombatDefinitions().getSpellBook()));
		if (player.getCombatDefinitions().getSpellBook() == STANDARD_BOOK) {
			switch (spellId) {
			case 25: // air strike
				player.setNextAnimation(new Animation(emote));
				if (graphics != -1)
					player.setNextGraphics(new Graphics(graphics));
				mage_hit_gfx = 2700;
				base_mage_xp = 5.5;
				int baseDamage = 20;
				if (player.getEquipment().getGlovesId() == 205) {
					baseDamage = 90;
				}
				delayMagicHit(2, getMagicHit(player, getRandomMagicMaxHit(player, baseDamage)));
				launchMagicProjectile(player,target,isStaff,2699);
				return 5;
			case 28: // water strike
				if (graphics != -1)
					player.setNextGraphics(new Graphics(graphics));
				player.setNextAnimation(new Animation(emote));
				mage_hit_gfx = 2708;
				base_mage_xp = 7.5;
				baseDamage = 40;
				if (player.getEquipment().getGlovesId() == 205) 
					baseDamage = 100;
				delayMagicHit(2,
						getMagicHit(player, getRandomMagicMaxHit(player, baseDamage)));
				launchMagicProjectile(player,target,isStaff, 2703);
				return 5;
			case 36:// bind
				player.setNextGraphics(new Graphics(177));
				player.setNextAnimation(new Animation(emote));
				mage_hit_gfx = 181;
				base_mage_xp = 60.5;
				Hit magicHit = getMagicHit(player,
						getRandomMagicMaxHit(player, 20));
				delayMagicHit(2, magicHit);
				launchMagicProjectile(player,target,isStaff,178);
				long currentTime = Utils.currentTimeMillis();
				if (magicHit.getDamage() > 0
						&& target.getFrozenBlockedDelay() < currentTime)
					target.addFreezeDelay(5000, true);
				return 5;
			case 55:// snare
				player.setNextAnimation(new Animation(emote));
				player.setNextGraphics(new Graphics(177));
				mage_hit_gfx = 180;
				base_mage_xp = 91.1;
				Hit snareHit = getMagicHit(player,
						getRandomMagicMaxHit(player, 30));
				delayMagicHit(2, snareHit);
				if (snareHit.getDamage() > 0
						&& target.getFrozenBlockedDelay() < Utils
						.currentTimeMillis())
					target.addFreezeDelay(10000, true);
				launchMagicProjectile(player,target,isStaff,178);
				return 5;
			case 81:// entangle
				player.setNextGraphics(new Graphics(177));
				player.setNextAnimation(new Animation(emote));
				mage_hit_gfx = 179;
				base_mage_xp = 91.1;
				Hit entangleHit = getMagicHit(player,
						getRandomMagicMaxHit(player, 50));
				delayMagicHit(2, entangleHit);
				if (entangleHit.getDamage() > 0
						&& target.getFrozenBlockedDelay() < Utils
						.currentTimeMillis())
					target.addFreezeDelay(20000, true);
				launchMagicProjectile(player,target,isStaff,178);
				return 5;
			case 30: // earth strike
				if (graphics != -1)
					player.setNextGraphics(new Graphics(graphics));
				player.setNextAnimation(new Animation(emote));
				mage_hit_gfx = 2723;
				base_mage_xp = 9.5;
				baseDamage = 60;
				if (player.getEquipment().getGlovesId() == 205) {
					baseDamage = 110;
				}
				delayMagicHit(2,
						getMagicHit(player, getRandomMagicMaxHit(player, baseDamage)));
				launchMagicProjectile(player,target,isStaff,2718);
				return 5;
			case 32: // fire strike
				if (graphics != -1)
					player.setNextGraphics(new Graphics(graphics));
				player.setNextAnimation(new Animation(emote));
				mage_hit_gfx = 2737;
				base_mage_xp = 11.5;
				baseDamage = 80;
				if (player.getEquipment().getGlovesId() == 205) {
					baseDamage = 120;
				}
				int damage = getRandomMagicMaxHit(player, baseDamage);
				if (target instanceof NPC) {
					NPC n = (NPC) target;
					if (n.getId() == 9463 || n.getId() >= 14301 && n.getId() <= 14304 ) // ice verm && glacors
						damage *= 2;
				}
				delayMagicHit(2, getMagicHit(player, damage));
				launchMagicProjectile(player,target,isStaff,2729);
				return 5;
			case 56: //slayer dart
				player.setNextAnimation(new Animation(emote));
				mage_hit_gfx = 329;
				base_mage_xp = 30;
				baseDamage = 100 + player.getSkills().getLevel(Skills.MAGIC);
				delayMagicHit(2, getMagicHit(player, getRandomMagicMaxHit(player, baseDamage)));
				World.sendProjectile(player, target, 328, 44, 18, 50, 50, 0, 0);//44 is a good height
				return 5;
			case 34: // air bolt
				if (graphics != -1)
					player.setNextGraphics(new Graphics(graphics));
				player.setNextAnimation(new Animation(emote));
				mage_hit_gfx = 2700;
				base_mage_xp = 13.5;
				baseDamage = 90;
				if (player.getEquipment().getGlovesId() == 777) {
					baseDamage = 120;
				}
				delayMagicHit(2,
						getMagicHit(player, getRandomMagicMaxHit(player, baseDamage)));
				launchMagicProjectile(player,target,isStaff,2699);
				return 5;
			case 39: // water bolt
				if (graphics != -1)
					player.setNextGraphics(new Graphics(graphics));
				player.setNextAnimation(new Animation(emote));
				mage_hit_gfx = 2709;
				base_mage_xp = 16.5;
				baseDamage = 100;
				if (player.getEquipment().getGlovesId() == 777) {
					baseDamage = 130;
				}
				delayMagicHit(2,
						getMagicHit(player, getRandomMagicMaxHit(player, baseDamage)));
				//World.sendProjectile(player, target, 2704, 18, 18, 50, 50, 0, 0);
				launchMagicProjectile(player,target,isStaff,2704);
				return 5;
			case 42: // earth bolt
				if (graphics != -1)
					player.setNextGraphics(new Graphics(graphics));
				//player.setNextGraphics(new Graphics(2714));
				//player.setNextAnimation(new Animation(14222));
				player.setNextAnimation(new Animation(emote));
				mage_hit_gfx = 2724;
				base_mage_xp = 19.5;
				baseDamage = 110;
				if (player.getEquipment().getGlovesId() == 777) {
					baseDamage = 140;
				}
				delayMagicHit(2,
						getMagicHit(player, getRandomMagicMaxHit(player, baseDamage)));
				//World.sendProjectile(player, target, 2719, 18, 18, 50, 50, 0, 0);
				launchMagicProjectile(player,target,isStaff,2719);
				return 5;
			case 45: // fire bolt
				if (graphics != -1)
					player.setNextGraphics(new Graphics(graphics));
				//player.setNextGraphics(new Graphics(2728));
				//player.setNextAnimation(new Animation(14223));
				player.setNextAnimation(new Animation(emote));
				mage_hit_gfx = 2738;
				base_mage_xp = 22.5;
				baseDamage = 120;
				if (player.getEquipment().getGlovesId() == 777) {
					baseDamage = 150;
				}
				damage = getRandomMagicMaxHit(player, baseDamage);
				if (target instanceof NPC) {
					NPC n = (NPC) target;
					if (n.getId() == 9463 || n.getId() >= 14301 && n.getId() <= 14304 ) // ice verm && glacors
						damage *= 2;
				}
				delayMagicHit(2, getMagicHit(player, damage));
				//World.sendProjectile(player, target, 2731, 18, 18, 50, 50, 0, 0);
				launchMagicProjectile(player,target,isStaff,2731);
				return 5;
			case 49: // air blast
				if (graphics != -1)
					player.setNextGraphics(new Graphics(graphics));
				//player.setNextAnimation(new Animation(14221));
				player.setNextAnimation(new Animation(emote));
				mage_hit_gfx = 2700;
				base_mage_xp = 25.5;
				delayMagicHit(2,
						getMagicHit(player, getRandomMagicMaxHit(player, 130)));
				//World.sendProjectile(player, target, 2699, 18, 18, 50, 50, 0, 0);
				launchMagicProjectile(player,target,isStaff,2699);
				return 5;
			case 52: // water blast
				if (graphics != -1)
					player.setNextGraphics(new Graphics(graphics));
				//player.setNextGraphics(new Graphics(2701));
				//player.setNextAnimation(new Animation(14220));
				player.setNextAnimation(new Animation(emote));
				mage_hit_gfx = 2710;
				base_mage_xp = 31.5;
				delayMagicHit(2,
						getMagicHit(player, getRandomMagicMaxHit(player, 140)));
				//World.sendProjectile(player, target, 2705, 18, 18, 50, 50, 0, 0);
				launchMagicProjectile(player,target,isStaff,2705);
				return 5;
			case 58: // earth blast
				if (graphics != -1)
					player.setNextGraphics(new Graphics(graphics));
				//player.setNextGraphics(new Graphics(2715));
				//player.setNextAnimation(new Animation(14222));
				player.setNextAnimation(new Animation(emote));
				mage_hit_gfx = 2725;
				base_mage_xp = 31.5;
				delayMagicHit(2,
						getMagicHit(player, getRandomMagicMaxHit(player, 150)));
				//World.sendProjectile(player, target, 2720, 18, 18, 50, 50, 0, 0);
				launchMagicProjectile(player,target,isStaff,2720);
				return 5;
			case 63: // fire blast
				if (graphics != -1)
					player.setNextGraphics(new Graphics(graphics));
				//player.setNextGraphics(new Graphics(2728));
				//player.setNextAnimation(new Animation(14223));
				player.setNextAnimation(new Animation(emote));
				mage_hit_gfx = 2739;
				base_mage_xp = 34.5;
				damage = getRandomMagicMaxHit(player, 160);
				if (target instanceof NPC) {
					NPC n = (NPC) target;
					if (n.getId() == 9463 || n.getId() >= 14301 && n.getId() <= 14304 ) // ice verm && glacors
						damage *= 2;
				}
				delayMagicHit(2, getMagicHit(player, damage));
				//World.sendProjectile(player, target, 2733, 18, 18, 50, 50, 0, 0);
				launchMagicProjectile(player,target,isStaff,2733);
				return 5;
			case 66:// Saradomin Strike
				player.setNextAnimation(new Animation(811));
				mage_hit_gfx = 76;
				base_mage_xp = 34.5;
				delayMagicHit(2,
						getMagicHit(player, getRandomMagicMaxHit(player, 300)));
				return 5;
			case 67: // Claws of Guthix
				player.setNextAnimation(new Animation(811));
				mage_hit_gfx = 77;
				base_mage_xp = 34.5;
				delayMagicHit(2,
						getMagicHit(player, getRandomMagicMaxHit(player, 300)));
				return 5;
			case 68: // Flames of Zamorak
				player.setNextAnimation(new Animation(811));
				mage_hit_gfx = 78;
				base_mage_xp = 34.5;
				delayMagicHit(2,
						getMagicHit(player, getRandomMagicMaxHit(player, 300)));
				return 5;
			case 70: // air wave
				if (graphics != -1)
					player.setNextGraphics(new Graphics(graphics));
				//player.setNextAnimation(new Animation(14221));
				player.setNextAnimation(new Animation(emote));
				mage_hit_gfx = 2700;
				base_mage_xp = 36;
				delayMagicHit(2,
						getMagicHit(player, getRandomMagicMaxHit(player, 170)));
				//World.sendProjectile(player, target, 2699, 18, 18, 50, 50, 0, 0);
				launchMagicProjectile(player,target,isStaff,2699);
				return 5;
			case 73: // water wave
				if (graphics != -1)
					player.setNextGraphics(new Graphics(graphics));
				//player.setNextGraphics(new Graphics(2702));
				//player.setNextAnimation(new Animation(14220));
				player.setNextAnimation(new Animation(emote));
				mage_hit_gfx = 2710;
				base_mage_xp = 37.5;
				delayMagicHit(2,
						getMagicHit(player, getRandomMagicMaxHit(player, 180)));
				//World.sendProjectile(player, target, 2706, 18, 18, 50, 50, 0, 0);
				launchMagicProjectile(player,target,isStaff,2706);
				return 5;
			case 77: // earth wave
				if (graphics != -1)
					player.setNextGraphics(new Graphics(graphics));
				//player.setNextGraphics(new Graphics(2716));
				//player.setNextAnimation(new Animation(14222));
				player.setNextAnimation(new Animation(emote));
				mage_hit_gfx = 2726;
				base_mage_xp = 42.5;
				delayMagicHit(2,
						getMagicHit(player, getRandomMagicMaxHit(player, 190)));
				//World.sendProjectile(player, target, 2721, 18, 18, 50, 50, 0, 0);
				launchMagicProjectile(player,target,isStaff,2721);
				return 5;
			case 80: // fire wave
				if (graphics != -1)
					player.setNextGraphics(new Graphics(graphics));
				//player.setNextGraphics(new Graphics(2728));
				//player.setNextAnimation(new Animation(14223));
				player.setNextAnimation(new Animation(emote));
				mage_hit_gfx = 2740;
				base_mage_xp = 42.5;
				damage = getRandomMagicMaxHit(player, 200);
				if (target instanceof NPC) {
					NPC n = (NPC) target;
					if (n.getId() == 9463 || n.getId() >= 14301 && n.getId() <= 14304 ) // ice verm && glacors
						damage *= 2;
				}
				delayMagicHit(2, getMagicHit(player, damage));
				//World.sendProjectile(player, target, 2735, 18, 18, 50, 50, 0, 0);
				launchMagicProjectile(player,target,isStaff,2735);
				return 5;
			case 86: // teleblock
				if (target instanceof Player
						&& ((Player) target).getTeleBlockDelay() <= Utils
						.currentTimeMillis()) {
					player.setNextGraphics(new Graphics(1841));
					player.setNextAnimation(new Animation(10503));
					mage_hit_gfx = 1843;
					base_mage_xp = 80;
					block_tele = true;
					Hit hit = getMagicHit(player,
							getRandomMagicMaxHit(player, 30));
					delayMagicHit(2, hit);
					World.sendProjectile(player, target, 1842, 18, 18, 50, 50,0, 0);
				} else {
					player.getPackets().sendGameMessage(
							"This player is already effected by this spell.",
							true);
				}
				return 5;
			case 84:// air surge
				if (graphics != -1)
					player.setNextGraphics(new Graphics(graphics));
				//player.setNextGraphics(new Graphics(457));
				//player.setNextAnimation(new Animation(10546));
				player.setNextAnimation(new Animation(emote));
				mage_hit_gfx = 2700;
				base_mage_xp = 80;
				delayMagicHit(2,
						getMagicHit(player, getRandomMagicMaxHit(player, 220)));
				//World.sendProjectile(player, target, 462, 18, 18, 50, 50, 0, 0);
				launchMagicProjectile(player,target,isStaff,462);
				return 5;
			case 87:// water surge
				if (graphics != -1)
					player.setNextGraphics(new Graphics(graphics));
				//player.setNextGraphics(new Graphics(2701));
				//player.setNextAnimation(new Animation(10542));
				player.setNextAnimation(new Animation(emote));
				mage_hit_gfx = 2712;
				base_mage_xp = 80;
				delayMagicHit(2,
						getMagicHit(player, getRandomMagicMaxHit(player, 240)));
				//World.sendProjectile(player, target, 2707, 18, 18, 50, 50, 3, 0);
				launchMagicProjectile(player,target,isStaff,2707);
				return 5;
			case 89:// earth surge
				if (graphics != -1)
					player.setNextGraphics(new Graphics(graphics));
				//player.setNextGraphics(new Graphics(2717));
				//player.setNextAnimation(new Animation(14209));
				player.setNextAnimation(new Animation(emote));
				mage_hit_gfx = 2727;
				base_mage_xp = 80;
				delayMagicHit(2,
						getMagicHit(player, getRandomMagicMaxHit(player, 260)));
				//World.sendProjectile(player, target, 2722, 18, 18, 50, 50, 0, 0);
				launchMagicProjectile(player,target,isStaff,2722);
				return 5;
			case 91:// fire surge
				if (graphics != -1)
					player.setNextGraphics(new Graphics(graphics));
				//player.setNextGraphics(new Graphics(2728));
				//player.setNextAnimation(new Animation(2791));
				player.setNextAnimation(new Animation(emote));
				mage_hit_gfx = 2741;
				base_mage_xp = 80;
				damage = getRandomMagicMaxHit(player, 280);
				if (target instanceof NPC) {
					NPC n = (NPC) target;
					if (n.getId() == 9463 || n.getId() >= 14301 && n.getId() <= 14304 ) // ice verm && glacors
						damage *= 2;
				}
				delayMagicHit(2, getMagicHit(player, damage));
				launchMagicProjectile(player,target,isStaff,2735,3);
				launchMagicProjectile(player,target,isStaff,2736,20);
				launchMagicProjectile(player,target,isStaff,2736,110);
				//World.sendProjectile(player, target, 2735, 18, 18, 50, 50, 3, 0);
				//World.sendProjectile(player, target, 2736, 18, 18, 50, 50, 20,0);
				//World.sendProjectile(player, target, 2736, 18, 18, 50, 50, 110,0);
				return 5;
			case 99: // Storm of armadyl //Sonic and Tyler dumped
				//player.setNextGraphics(new Graphics(457));
				//player.setNextAnimation(new Animation(10546));
				if (graphics != -1)
					player.setNextGraphics(new Graphics(graphics));
				player.setNextAnimation(new Animation(emote));
				mage_hit_gfx = 1019;
				base_mage_xp = 70;
				int boost = (player.getSkills().getLevelForXp(Skills.MAGIC) - 77) * 5;
				int hit = player.getEquipment().getWeaponId() == 21777 ? getRandomMagicMaxHit(player, 200 + boost) : getRandomMagicMaxHit(player, 160 + boost);
				if (hit > 0 && target instanceof NPC) {
					NPC n = (NPC) target;
					if (n.getId() >= 14301 && n.getId() <= 14304) // glacors and glacytes
						hit *= 2.5;
				}
				if (hit > 0 && hit < boost)
					hit += boost;
				delayMagicHit(2, getMagicHit(player, hit));
				//World.sendProjectile(player, target, 1019, 18, 18, 50, 30, 0, 0);
				launchMagicProjectile(player,target,isStaff,1019);
				return player.getEquipment().getWeaponId() == 21777 ? 3 : 5;
			}
		} else if (player.getCombatDefinitions().getSpellBook() == ANCIENT_BOOK) {
			switch (spellId) {
			case 28:// Smoke Rush
				//player.setNextAnimation(new Animation(1978));
				player.setNextAnimation(new Animation(emote));
				mage_hit_gfx = 385;
				base_mage_xp = 30;
				max_poison_hit = 20;
				delayMagicHit(2,
						getMagicHit(player, getRandomMagicMaxHit(player, 150)));
				World.sendProjectile(player, target, 386, 18, 18, 50, 50, 0, 0);
				return 4;
			case 32:// Shadow Rush
				//player.setNextAnimation(new Animation(1978));
				player.setNextAnimation(new Animation(emote));
				mage_hit_gfx = 379;
				base_mage_xp = 31;
				reduceAttack = true;
				delayMagicHit(2,
						getMagicHit(player, getRandomMagicMaxHit(player, 160)));
				World.sendProjectile(player, target, 380, 18, 18, 50, 50, 0, 0);
				return 4;
			case 36: //Miasmic rush
				//player.setNextAnimation(new Animation(10513));
				player.setNextAnimation(new Animation(emote));
				player.setNextGraphics(new Graphics(1845));
				mage_hit_gfx = 1847;
				base_mage_xp = 35;
				delayMagicHit(2, getMagicHit(player, getRandomMagicMaxHit(player, 200)));
				World.sendProjectile(player, target, 1846, 43, 22, 51, 50, 16, 0);
				if (target.getTemporaryAttributtes().get("miasmic_immunity") == Boolean.TRUE) {
					return 4;
				}
				if (target instanceof Player) {
					((Player) target).getPackets().sendGameMessage("You feel slowed down.");
				}
				target.getTemporaryAttributtes().put("miasmic_immunity", Boolean.TRUE);
				target.getTemporaryAttributtes().put("miasmic_effect", Boolean.TRUE);
				final Entity t = target;
				WorldTasksManager.schedule(new WorldTask() {
					@Override
					public void run() {
						t.getTemporaryAttributtes().remove("miasmic_effect");
						WorldTasksManager.schedule(new WorldTask() {
							@Override
							public void run() {
								t.getTemporaryAttributtes().remove("miasmic_immunity");
								stop();
							}
						}, 15);
						stop();
					}
				}, 20);
				return 4;
			case 37: //Miasmic blitz
				//player.setNextAnimation(new Animation(10524));
				player.setNextAnimation(new Animation(emote));
				player.setNextGraphics(new Graphics(1850));
				mage_hit_gfx = 1851;
				base_mage_xp = 48;
				delayMagicHit(2, getMagicHit(player, getRandomMagicMaxHit(player, 280)));
				World.sendProjectile(player, target, 1852, 43, 22, 51, 50, 16, 0);
				if (target.getTemporaryAttributtes().get("miasmic_immunity") == Boolean.TRUE) {
					return 4;
				}
				if (target instanceof Player) {
					((Player) target).getPackets().sendGameMessage("You feel slowed down.");
				}
				target.getTemporaryAttributtes().put("miasmic_immunity", Boolean.TRUE);
				target.getTemporaryAttributtes().put("miasmic_effect", Boolean.TRUE);
				final Entity t0 = target;
				WorldTasksManager.schedule(new WorldTask() {
					@Override
					public void run() {
						t0.getTemporaryAttributtes().remove("miasmic_effect");
						WorldTasksManager.schedule(new WorldTask() {
							@Override
							public void run() {
								t0.getTemporaryAttributtes().remove("miasmic_immunity");
								stop();
							}
						}, 15);
						stop();
					}
				}, 60);
				return 4;
			case 38: //Miasmic burst
				//player.setNextAnimation(new Animation(10516));
				player.setNextAnimation(new Animation(emote));
				player.setNextGraphics(new Graphics(1848));
				attackTarget(getMultiAttackTargets(player), new MultiAttack() {
					private boolean nextTarget;
					@Override
					public boolean attack() {
						mage_hit_gfx = 1849;
						base_mage_xp = 42;
						int damage = getRandomMagicMaxHit(player, 240);
						delayMagicHit(2, getMagicHit(player, damage));
						if (target.getTemporaryAttributtes().get("miasmic_immunity") != Boolean.TRUE) {
							if (target instanceof Player) {
								((Player) target).getPackets().sendGameMessage("You feel slowed down.");
							}
							target.getTemporaryAttributtes().put("miasmic_immunity", Boolean.TRUE);
							target.getTemporaryAttributtes().put("miasmic_effect", Boolean.TRUE);
							final Entity t = target;
							WorldTasksManager.schedule(new WorldTask() {
								@Override
								public void run() {
									t.getTemporaryAttributtes().remove("miasmic_effect");
									WorldTasksManager.schedule(new WorldTask() {
										@Override
										public void run() {
											t.getTemporaryAttributtes().remove("miasmic_immunity");
											stop();
										}
									}, 15);
									stop();
								}
							}, 40);
						}
						if (!nextTarget) {
							if (damage == -1) {
								return false;
							}
							nextTarget = true;
						}
						return nextTarget;

					}
				});
				return 4;
			case 39: //Miasmic barrage
				//player.setNextAnimation(new Animation(10518));
				player.setNextAnimation(new Animation(emote));
				player.setNextGraphics(new Graphics(1853));
				attackTarget(getMultiAttackTargets(player), new MultiAttack() {
					private boolean nextTarget;
					@Override
					public boolean attack() {
						mage_hit_gfx = 1854;
						base_mage_xp = 54;
						int damage = getRandomMagicMaxHit(player, 320);
						delayMagicHit(2, getMagicHit(player, damage));
						if (target.getTemporaryAttributtes().get("miasmic_immunity") != Boolean.TRUE) {
							if (target instanceof Player) {
								((Player) target).getPackets().sendGameMessage("You feel slowed down.");
							}
							target.getTemporaryAttributtes().put("miasmic_immunity", Boolean.TRUE);
							target.getTemporaryAttributtes().put("miasmic_effect", Boolean.TRUE);
							final Entity t = target;
							WorldTasksManager.schedule(new WorldTask() {
								@Override
								public void run() {
									t.getTemporaryAttributtes().remove("miasmic_effect");
									WorldTasksManager.schedule(new WorldTask() {
										@Override
										public void run() {
											t.getTemporaryAttributtes().remove("miasmic_immunity");
											stop();
										}
									}, 15);
									stop();
								}
							}, 80);
						}
						if (!nextTarget) {
							if (damage == -1) {
								return false;
							}
							nextTarget = true;
						}
						return nextTarget;

					}
				});
				return 4;
			case 24:// Blood rush
				//player.setNextAnimation(new Animation(1978));
				player.setNextAnimation(new Animation(emote));
				mage_hit_gfx = 373;
				base_mage_xp = 33;
				blood_spell = true;
				delayMagicHit(2,
						getMagicHit(player, getRandomMagicMaxHit(player, 170)));
				World.sendProjectile(player, target, 374, 18, 18, 50, 50, 0, 0);
				return 4;
			case 20:// Ice rush
				player.setNextAnimation(new Animation(emote));
				mage_hit_gfx = 361;
				base_mage_xp = 34;
				if (target.getSize() <= 1)
					freeze_time = 5000;
				delayMagicHit(2,
						getMagicHit(player, getRandomMagicMaxHit(player, 180)));
				World.sendProjectile(player, target, 362, 18, 18, 50, 50, 0, 0);
				return 4;

			case 30:// Smoke burst
				//player.setNextAnimation(new Animation(1979));
				player.setNextAnimation(new Animation(emote));
				attackTarget(getMultiAttackTargets(player), new MultiAttack() {

					private boolean nextTarget; //real target is first player on array

					@Override
					public boolean attack() {
						mage_hit_gfx = 389;
						base_mage_xp = 36;
						max_poison_hit = 20;
						int damage = getRandomMagicMaxHit(player, 190);
						delayMagicHit(2, getMagicHit(player, damage));
						World.sendProjectile(player, target, 388, 18, 18, 50, 50, 0, 0);
						if(!nextTarget) {
							if(damage == -1)
								return false;
							nextTarget = true;
						}
						return nextTarget;

					}
				});
				return 4;
			case 34:// Shadow burst
				player.setNextAnimation(new Animation(emote));
				attackTarget(getMultiAttackTargets(player), new MultiAttack() {

					private boolean nextTarget; //real target is first player on array

					@Override
					public boolean attack() {
						mage_hit_gfx = 382;
						base_mage_xp = 37;
						reduceAttack = true;
						int damage = getRandomMagicMaxHit(player, 200);
						delayMagicHit(2, getMagicHit(player, damage));
						if(!nextTarget) {
							if(damage == -1)
								return false;
							nextTarget = true;
						}
						return nextTarget;

					}
				});
				return 4;
			case 26:// Blood burst
				player.setNextAnimation(new Animation(emote));
				attackTarget(getMultiAttackTargets(player), new MultiAttack() {

					private boolean nextTarget; //real target is first player on array

					@Override
					public boolean attack() {
						mage_hit_gfx = 376;
						base_mage_xp = 39;
						blood_spell = true;
						int damage = getRandomMagicMaxHit(player, 210);
						delayMagicHit(2, getMagicHit(player, damage));
						if(!nextTarget) {
							if(damage == -1)
								return false;
							nextTarget = true;
						}
						return nextTarget;

					}
				});
				return 4;
			case 22:// Ice burst
				player.setNextGraphics(new Graphics(366));
				player.setNextAnimation(new Animation(emote));
				attackTarget(getMultiAttackTargets(player), new MultiAttack() {

					private boolean nextTarget; //real target is first player on array

					@Override
					public boolean attack() {
						mage_hit_gfx = 367;
						base_mage_xp = 46;
						if (target.getSize() <= 1)
							freeze_time = 15000;
						magic_sound = 169;
						int damage = getRandomMagicMaxHit(player, 220);
						delayMagicHit(4, getMagicHit(player, damage));
						World.sendProjectile(player, target, 366, 43, 0, 120, 0, 50, 64);
						if(!nextTarget) {
							if(damage == -1)
								return false;
							nextTarget = true;
						}
						return nextTarget;

					}
				});
				return 4;
			case 29:// Smoke Blitz
				player.setNextAnimation(new Animation(emote));
				mage_hit_gfx = 387;
				base_mage_xp = 42;
				max_poison_hit = 40;
				delayMagicHit(2,
						getMagicHit(player, getRandomMagicMaxHit(player, 230)));
				World.sendProjectile(player, target, 386, 18, 18, 50, 50, 0, 0);
				return 4;
			case 33:// Shadow Blitz
				player.setNextAnimation(new Animation(emote));
				mage_hit_gfx = 381;
				base_mage_xp = 43;
				reduceAttack = true;
				delayMagicHit(2,
						getMagicHit(player, getRandomMagicMaxHit(player, 240)));
				World.sendProjectile(player, target, 380, 18, 18, 50, 50, 0, 0);
				return 4;
			case 25:// Blood Blitz
				player.setNextAnimation(new Animation(emote));
				mage_hit_gfx = 375;
				base_mage_xp = 45;
				blood_spell = true;
				delayMagicHit(2,
						getMagicHit(player, getRandomMagicMaxHit(player, 250)));
				World.sendProjectile(player, target, 374, 18, 18, 50, 50, 0, 0);
				return 4;
			case 21:// Ice Blitz
				player.setNextGraphics(new Graphics(366));
				player.setNextAnimation(new Animation(emote));
				mage_hit_gfx = 367;
				base_mage_xp = 46;
				if (target.getSize() <= 1)
					freeze_time = 15000;
				magic_sound = 169;
				delayMagicHit(2,
						getMagicHit(player, getRandomMagicMaxHit(player, 260)));
				World.sendProjectile(player, target, 368, 60, 32, 50, 50, 0, 0);
				return 4;
			case 31:// Smoke barrage
				player.setNextAnimation(new Animation(emote));
				attackTarget(getMultiAttackTargets(player), new MultiAttack() {

					private boolean nextTarget; //real target is first player on array

					@Override
					public boolean attack() {
						mage_hit_gfx = 391;
						base_mage_xp = 48;
						max_poison_hit = 40;
						int damage = getRandomMagicMaxHit(player, 270);
						delayMagicHit(2, getMagicHit(player, damage));
						World.sendProjectile(player, target, 390, 18, 18, 50, 50, 0, 0);
						if(!nextTarget) {
							if(damage == -1)
								return false;
							nextTarget = true;
						}
						return nextTarget;

					}
				});
				return 4;
			case 35:// shadow barrage
				player.setNextAnimation(new Animation(emote));
				attackTarget(getMultiAttackTargets(player), new MultiAttack() {

					private boolean nextTarget; //real target is first player on array

					@Override
					public boolean attack() {
						mage_hit_gfx = 383;
						base_mage_xp = 49;
						reduceAttack = true;
						int damage = getRandomMagicMaxHit(player, 280);
						delayMagicHit(2, getMagicHit(player, damage));
						if(!nextTarget) {
							if(damage == -1)
								return false;
							nextTarget = true;
						}
						return nextTarget;

					}
				});
				return 4;
			case 27:// blood barrage
				player.setNextAnimation(new Animation(emote));
				attackTarget(getMultiAttackTargets(player), new MultiAttack() {

					private boolean nextTarget; //real target is first player on array

					@Override
					public boolean attack() {
						mage_hit_gfx = 377;
						base_mage_xp = 51;
						/*max_poison_hit = 40;*/
						blood_spell = true;
						int damage = getRandomMagicMaxHit(player, 290);
						delayMagicHit(2, getMagicHit(player, damage));
						World.sendProjectile(player, target, 390, 18, 18, 50, 50, 0, 0);
						if(!nextTarget) {
							if(damage == -1)
								return false;
							nextTarget = true;
						}
						return nextTarget;

					}
				});
				return 4;
			case 23: // ice barrage
				player.setNextAnimation(new Animation(emote));
				playSound(171, player, target);
				attackTarget(getMultiAttackTargets(player), new MultiAttack() {

					private boolean nextTarget; //real target is first player on array

					@Override
					public boolean attack() {
						magic_sound = 168;
						long currentTime = Utils.currentTimeMillis();
						if (target.getSize() >= 2
								|| target.getFreezeDelay() >= currentTime
								|| target.getFrozenBlockedDelay() >= currentTime) {
							mage_hit_gfx = 1677;
						} else {
							mage_hit_gfx = 369;
							freeze_time = 20000;
						}
						base_mage_xp = 52;
						int damage = getRandomMagicMaxHit(player, 300);
						Hit hit = getMagicHit(player, damage);
						delayMagicHit(Utils.getDistance(player, target) > 3 ? 4 : 2, hit);
						World.sendProjectile(player, target, 368, 60, 32, 50, 50, 0, 0);
						if(!nextTarget) {
							if(damage == -1)
								return false;
							nextTarget = true;
						}
						return nextTarget;

					}
				});
				return 4;
			}

		}
		return -1; // stops atm
	}


	public interface MultiAttack {

		public boolean attack();

	}
	public void attackTarget(Entity[] targets, MultiAttack perform) {
		Entity realTarget = target;
		for(Entity t : targets) {
			target = t;
			if(!perform.attack())
				break;
		}
		target = realTarget;
	}

	public int getRandomMagicMaxHit(Player player, int baseDamage) {
		int current = getMagicMaxHit(player, baseDamage);
		if (current <= 0) //Splash.
			return -1;
		int hit = Utils.random(current+1);
		if (hit > 0) {
			if (target instanceof NPC) {
				NPC n = (NPC) target;
				if (n.getId() == 9463 && hasFireCape(player)) // ice verm
					hit += 40;
			}
		}
		return hit;
	}

	public static boolean rollHit(double att, double def) {
		if (att < 0) // wont happen unless low att lv plus negative bonus
			return false;
		if (def < 0) // wont happen unless low def lv plus negative bonus
			return true;
		return Utils.random((int) (att + def)) >= def;
	}

	public int getMagicMaxHit(Player player, int baseDamage) {
		double att = player.getSkills().getLevel(Skills.MAGIC) + player.getCombatDefinitions().getBonuses()[CombatDefinitions.MAGIC_ATTACK];
		att *= player.getPrayer().getMageMultiplier();
		if (target instanceof NPC)
			att -= player.getSkills().getLevel(Skills.MAGIC) * 0.3;
		if (fullVoidEquipped(player, 11663, 11674))
			att *= 1.3;
		double def;
		if (target instanceof Player) {
			Player p2 = (Player) target;
			def = p2.getSkills().getLevel(Skills.DEFENCE)
					+ (p2.getCombatDefinitions().getBonuses()[CombatDefinitions.MAGIC_DEF] * 2.5);
			def *= p2.getPrayer().getDefenceMultiplier();
		} else {
			NPC n = (NPC) target;
			def = n.getBonuses() == null ? 0
					: n.getBonuses()[CombatDefinitions.MAGIC_DEF];
			if (def < 0)
				def = 0;
			if (def > 0)
				def *= 1.33;
		}
		double prob = att / def;
		if (prob > 0.90)
			prob = 0.90;
		else if (prob < 0.05)
			prob = 0.05;
		if (prob < Math.random() || target instanceof NPC && att < 0)
			return 0;
		max_hit = baseDamage;
		double boost = 1 + ((player.getSkills().getLevel(Skills.MAGIC) - player
				.getSkills().getLevelForXp(Skills.MAGIC)) * 0.03);
		if (boost > 1)
			max_hit *= boost;
		double magicPerc = player.getCombatDefinitions().getBonuses()[CombatDefinitions.MAGIC_DAMAGE];
		if (spellcasterGloves > 0) {
			if (baseDamage > 60 || spellcasterGloves == 28
					|| spellcasterGloves == 25) {
				magicPerc += 17;
				if (target instanceof Player) {
					Player p = (Player) target;
					p.getSkills().drainLevel(0, p.getSkills().getLevel(0) / 10);
					p.getSkills().drainLevel(1, p.getSkills().getLevel(1) / 10);
					p.getSkills().drainLevel(2, p.getSkills().getLevel(2) / 10);
					p.getPackets().sendGameMessage(
							"Your melee skills have been drained.");
					player.getPackets().sendGameMessage(
							"Your spell weakened your enemy.");
				}
				player.getPackets().sendGameMessage(
						"Your magic surged with extra power.");
			}
		}
		boost = magicPerc / 100 + 1;
		max_hit *= boost;
		return max_hit;
	}

	private void applyRoyalCrossbowEffect(Player player, Entity target, boolean sendMessage) {
		if (player == null || target == null)
			return;
		if (target instanceof Player || target instanceof CorporealBeast)
			return;
		if (player.isDead() || player.hasFinished() || !player.hasStarted() || !player.isRunning())
			return;
		if (target.isDead() || target.hasFinished() || player.getControlerManager() != null && !player.getControlerManager().canHit(target))
			return;
		if (target.getTemporaryAttributtes() == null)
			return;
		final Object bleed = target.getTemporaryAttributtes().remove("royal_bleeding");
		final boolean newEffect = bleed == null;
		if (!newEffect && (Integer) bleed > 55 || sendMessage && !newEffect)
			return;
		if (sendMessage) {
			player.getPackets().sendGameMessage("The effect of your royal crossbow causes your enemy to bleed.", true);
		}
		if (newEffect)
			target.getTemporaryAttributtes().put("royal_bleeding", 20);
		else
			target.getTemporaryAttributtes().put("royal_bleeding", (Integer) bleed + 5);
		final Integer hit = (Integer) target.getTemporaryAttributtes().get("royal_bleeding");
		if (hit != null && hit > 0)
			WorldTasksManager.schedule(new WorldTask() {
				@Override
				public void run() {
					if (player == null || target == null || hit == null) {
						this.stop();
						return;
					}
					target.applyHit(new Hit(player, hit, HitLook.REGULAR_DAMAGE));
					applyRoyalCrossbowEffect(player,target, false);
					this.stop();
				}
			},2);
	}

	private int rangeAttack(final Player player) {
		final int shieldId = player.getEquipment().getShieldId();
		final int weaponId = (!player.secondary ? player.getEquipment().getWeaponId() : player.getEquipment().getShieldId());
		final ItemDefinitions defs = ItemDefinitions.getItemDefinitions(weaponId);
		final int attackStyle = player.getCombatDefinitions().getAttackStyle();
		int combatDelay = getRangeCombatDelay(weaponId, attackStyle);
		int soundId = getSoundId(weaponId, attackStyle);
		if (player.getCombatDefinitions().isUsingSpecialAttack() && !player.secondary) {
			if (weaponId == -1)
				return combatDelay;
			if (defs == null)
				return combatDelay;
			int specAmt = defs.getSpecialAttackAmount() / 10;
			if (specAmt <= 0) {
				player.getPackets().sendGameMessage("This weapon has no special Attack, if you still see special bar please relogin.");
				player.getCombatDefinitions().desecreaseSpecialAttack(0);
				return combatDelay;
			}
			if (player.getCombatDefinitions().hasRingOfVigour())
				specAmt *= 0.9;
			if (player.getCombatDefinitions().getSpecialAttackPercentage() < specAmt) {
				player.getPackets().sendGameMessage(
						"You don't have enough power left.");
				player.getCombatDefinitions().desecreaseSpecialAttack(0);
				return combatDelay;
			}
			player.getCombatDefinitions().desecreaseSpecialAttack(specAmt);
			switch (weaponId) {
			case 19149:// zamorak bow
			case 19151:
				player.setNextAnimation(new Animation(426));
				player.setNextGraphics(new Graphics(97));
				World.sendProjectile(player, target, 100, 41, 16, 25, 35, 16, 0);
				delayHit(
						1,
						weaponId,
						attackStyle,
						true, getRangeHit(
								player,
								getRandomMaxHit(player, weaponId, attackStyle,
										true, true, 1.0, true)));
				dropAmmo(player, 1);
				break;
			case 19146:
			case 19148:// guthix bow
				player.setNextAnimation(new Animation(426));
				player.setNextGraphics(new Graphics(95));
				World.sendProjectile(player, target, 98, 41, 16, 25, 35, 16, 0);
				delayHit(
						1,
						weaponId,
						attackStyle,
						true, getRangeHit(
								player,
								getRandomMaxHit(player, weaponId, attackStyle,
										true, true, 1.0, true)));
				dropAmmo(player, 1);
				break;
			case 19143:// saradomin bow
			case 19145:
				player.setNextAnimation(new Animation(426));
				player.setNextGraphics(new Graphics(96));
				World.sendProjectile(player, target, 99, 41, 16, 25, 35, 16, 0);
				delayHit(
						1,
						weaponId,
						attackStyle,
						true, getRangeHit(
								player,
								getRandomMaxHit(player, weaponId, attackStyle,
										true, true, 1.0, true)));
				dropAmmo(player, 1);
				break;
			case 859: // magic longbow
			case 861: // magic shortbow
			case 10284: // Magic composite bow
			case 18332: // Magic longbow (sighted)
				player.setNextAnimation(new Animation(1074));
				World.sendProjectile(player, target, 249, 41, 16, 31, 35, 16, 0);
				World.sendProjectile(player, target, 249, 41, 16, 25, 35, 21, 0);
				delayHit(
						2,
						weaponId,
						attackStyle,
						true, getRangeHit(
								player,
								getRandomMaxHit(player, weaponId, attackStyle,
										true, true, 1.0, true)));
				delayHit(
						3,
						weaponId,
						attackStyle,
						true, getRangeHit(
								player,
								getRandomMaxHit(player, weaponId, attackStyle,
										true, true, 1.0, true)));
				dropAmmo(player, 2);
				break;
			case 15241: // Hand cannon
				WorldTasksManager.schedule(new WorldTask() {
					int loop = 0;

					@Override
					public void run() {
						if ((target.isDead() || player.isDead() || loop > 1)
								&& !World.getNPCs().contains(target)) {
							stop();
							return;
						}
						if (loop == 0) {
							player.setNextAnimation(new Animation(12174));
							player.setNextGraphics(new Graphics(2138));
							World.sendProjectile(player, target, 2143, 18, 18,
									50, 50, 0, 0);
							delayHit(
									1,
									weaponId,
									attackStyle,
									true, getRangeHit(
											player,
											getRandomMaxHit(player, weaponId,
													attackStyle, true, true,
													1.0, true)));
						} else if (loop == 1) {
							player.setNextAnimation(new Animation(12174));
							player.setNextGraphics(new Graphics(2138));
							World.sendProjectile(player, target, 2143, 18, 18,
									50, 50, 0, 0);
							delayHit(
									1,
									weaponId,
									attackStyle,
									true, getRangeHit(
											player,
											getRandomMaxHit(player, weaponId,
													attackStyle, true, true,
													1.0, true)));
							stop();
						}
						loop++;
					}
				}, 0, (int) 0.25);
				combatDelay = 9;
				break;
			case 11235: // dark bows
			case 15701:
			case 15702:
			case 15703:
			case 15704:
				int ammoId = player.getEquipment().getAmmoId();
				player.setNextAnimation(new Animation(getWeaponAttackEmote(
						weaponId, attackStyle, player)));
				player.setNextGraphics(new Graphics(getArrowThrowGfxId(
						weaponId, ammoId), 0, 100));
				if (ammoId == 11212) {
					int damage = getRandomMaxHit(player, weaponId, attackStyle,
							true, true, 1.5, true);
					if (damage < 80)
						damage = 80;
					int damage2 = getRandomMaxHit(player, weaponId,
							attackStyle, true, true, 1.5, true);
					if (damage2 < 80)
						damage2 = 80;
					World.sendProjectile(player, target, 1099, 41, 16, 31, 35,
							16, 0);
					World.sendProjectile(player, target, 1099, 41, 16, 25, 35,
							21, 0);
					delayHit(2, weaponId, attackStyle,
							true, getRangeHit(player, damage));
					delayHit(3, weaponId, attackStyle,
							true, getRangeHit(player, damage2));
					WorldTasksManager.schedule(new WorldTask() {
						@Override
						public void run() {
							target.setNextGraphics(new Graphics(1100, 0, 100));
						}
					}, 2);
				} else {
					int damage = getRandomMaxHit(player, weaponId, attackStyle,
							true, true, 1.3, true);
					if (damage < 50)
						damage = 50;
					int damage2 = getRandomMaxHit(player, weaponId,
							attackStyle, true, true, 1.3, true);
					if (damage2 < 50)
						damage2 = 50;
					World.sendProjectile(player, target, 1101, 41, 16, 31, 35,
							16, 0);
					World.sendProjectile(player, target, 1101, 41, 16, 25, 35,
							21, 0);
					delayHit(2, weaponId, attackStyle,
							true, getRangeHit(player, damage));
					delayHit(3, weaponId, attackStyle,
							true, getRangeHit(player, damage2));
				}
				dropAmmo(player, 2);

				break;
			case 14684: // zanik cbow
				player.setNextAnimation(new Animation(getWeaponAttackEmote(
						weaponId, attackStyle, player)));
				player.setNextGraphics(new Graphics(1714));
				World.sendProjectile(player, target, 2001, 41, 41, 41, 35, 0, 0);
				delayHit(
						2,
						weaponId,
						attackStyle,
						true, getRangeHit(
								player,
								getRandomMaxHit(player, weaponId, attackStyle,
										true, true, 1.0, true)
								+ 30
								+ Utils.getRandom(120)));
				dropAmmo(player);
				break;
			case 13954:// morrigan javelin
			case 12955:
			case 13956:
			case 13879:
			case 13880:
			case 13881:
			case 13882:
				player.setNextGraphics(new Graphics(1836));
				player.setNextAnimation(new Animation(10501));
				World.sendProjectile(player, target, 1837, 41, 41, 41, 35, 0, 0);
				final int hit = getRandomMaxHit(player, weaponId, attackStyle,
						true, true, 1.0, true);
				delayHit(2, weaponId, attackStyle, true, getRangeHit(player, hit));
				if (hit > 0) {
					final Entity finalTarget = target;
					WorldTasksManager.schedule(new WorldTask() {
						int damage = hit;

						@Override
						public void run() {
							if (finalTarget.isDead()
									|| finalTarget.hasFinished()) {
								stop();
								return;
							}
							if (damage > 50) {
								damage -= 50;
								finalTarget.applyHit(new Hit(player, 50,
										HitLook.REGULAR_DAMAGE));
							} else {
								finalTarget.applyHit(new Hit(player, damage,
										HitLook.REGULAR_DAMAGE));
								stop();
							}
						}
					}, 4, 2);
				}
				dropAmmo(player, -1);
				break;
			case 24456: // decimation
				player.setNextAnimation(new Animation(16959));
				player.setNextGraphics(new Graphics(3192));
				delayHit(
						2,
						weaponId,
						attackStyle,
						true, getRangeHit(
								player,
								getRandomMaxHit(player, weaponId, attackStyle,
										true, true, 1.75, true)));

				WorldTasksManager.schedule(new WorldTask() {
					@Override
					public void run() {
						target.setNextGraphics(new Graphics(3191, 0, 100));
					}
				}, 2);
				break;				
			case 13883:
			case 13957:// morigan thrown axe
				player.setNextGraphics(new Graphics(1838));
				player.setNextAnimation(new Animation(10504));
				World.sendProjectile(player, target, 1839, 41, 41, 41, 35, 0, 0);
				delayHit(
						2,
						weaponId,
						attackStyle,
						true, getRangeHit(
								player,
								getRandomMaxHit(player, weaponId, attackStyle,
										true, true, 1.0, true)));
				dropAmmo(player, -1);
				break;
			default:
				player.getPackets()
				.sendGameMessage(
						"This weapon has no special Attack, if you still see special bar please relogin.");
				return combatDelay;
			}
		} else {
			if (weaponId != -1) {
				final String weaponName = defs.getName().toLowerCase();
				if (weaponName.contains("throwing axe")
						|| weaponName.contains("knife")
						|| weaponName.contains("dart")
						|| weaponName.contains("javelin")
						|| weaponName.contains("throwing axe")) {
					//if (!weaponName.contains("javelin")&& !weaponName.contains("thrownaxe") &&!weaponName.contains("throwing axe") && !weaponName.contains("knife"))
					//	player.setNextGraphics(new Graphics(getKnifeThrowGfxId(weaponId), 0, 100));
					//if (weaponName.contains("throwing axe"))
					//	player.setNextGraphics(new Graphics(1836));
					World.sendProjectile(player, target,getKnifeThrowGfxId(weaponId, player), 41, 36, 41, 32, 15, 0);
					int hit = getRandomMaxHit(player, weaponId, attackStyle, true);
					delayHit(1, weaponId, attackStyle, true, getRangeHit(player, hit));
					checkSwiftGlovesEffect(player, 1, attackStyle, weaponId, hit, getKnifeThrowGfxId(weaponId, player), 41, 36, 41, 32, 15, 0);
					dropAmmo(player, -1);
					if (weaponName.contains("deathtouched dart")) {
						if (target instanceof Player) {
							Player p2 = (Player) target;
							p2.stopAll();
						} else {
							NPC n = (NPC) target;
							World.sendProjectile(player, n, 3429, 41, 36, 50, 0, 15, 0);
							n.setNextGraphics(new Graphics(3428));
							n.setCapDamage(200000);
							n.applyHit(new Hit(player, n.getHitpoints(), HitLook.CRITICAL_DAMAGE));
							player.getAppearence().generateAppearenceData();
						}	
					}
				} else if (weaponName.contains("crossbow") || weaponName.contains("quick-fire") || weaponName.contains("Quick-Fire") || weaponName.contains("c'bow")) {
					int damage = 0;
					final int ammoId = player.getEquipment().getAmmoId();
					final int distance = Utils.getDistance(player, target);
					if (ammoId != -1 && Utils.getRandom(10) == 5) {
						switch (ammoId) {
						case 9237:
							damage = getRandomMaxHit(player, weaponId,
									attackStyle, true);
							target.setNextGraphics(new Graphics(755));
							if (target instanceof Player) {
								Player p2 = (Player) target;
								p2.stopAll();
							} else {
								NPC n = (NPC) target;
								n.setTarget(null);
							}
							soundId = 2914;
							break;
						case 9242:
							max_hit = Short.MAX_VALUE;
							damage = (int) (target.getHitpoints() * 0.2);
							target.setNextGraphics(new Graphics(754));
							player.applyHit(new Hit(target, player
									.getHitpoints() > 20 ? (int) (player
											.getHitpoints() * 0.1) : 1,
											HitLook.REFLECTED_DAMAGE));
							soundId = 2912;
							break;
						case 9243:
							damage = getRandomMaxHit(player, weaponId,
									attackStyle, true, false, 1.15, true);
							target.setNextGraphics(new Graphics(751));
							soundId = 2913;
							break;
						case 9244:
							damage = getRandomMaxHit(
									player,
									weaponId,
									attackStyle,
									true,
									false,
									!Combat.hasAntiDragProtection(target, false) ? 1.45
											: 1.0, true);
							target.setNextGraphics(new Graphics(756));
							soundId = 2915;
							break;
						case 9245:
							damage = getRandomMaxHit(player, weaponId,
									attackStyle, true, false, 1.15, true);
							target.setNextGraphics(new Graphics(753));
							player.heal((int) (player.getMaxHitpoints() * 0.25));
							soundId = 2917;
							break;
						case 24336://royal
							damage = getRandomMaxHit(player, weaponId,
									attackStyle, true, false, 1.15, true);
							applyRoyalCrossbowEffect(player,target, true);
							break;
						default:
							damage = getRandomMaxHit(player, weaponId,
									attackStyle, true);
						}
					} else {
						damage = getRandomMaxHit(player, weaponId, attackStyle, true);
						checkSwiftGlovesEffect(player, distance > 3 ? 2 : 1, attackStyle, weaponId, damage, getArrowProjectileGfxId(weaponId,ammoId,player), 38, 36, 41, 32, 5, 0);
					}
					World.sendProjectile(player, target, getArrowProjectileGfxId(weaponId,ammoId,player), 38, 36, 41, 32, 5, 0);
					delayHit(distance > 3 ? 2 : 1, weaponId, attackStyle, true, getRangeHit(player, damage));
					if (weaponId != 4740)
						dropAmmo(player);
					else
						player.getEquipment().removeAmmo(ammoId, 1, player.secondary);
				} else if (weaponId == 15241) {// handcannon
					if (player.getSkills().getLevel(Skills.FIREMAKING) < 88) {
						if (Utils.random(player.getSkills().getLevel(Skills.FIREMAKING) << 1) == 0) {
							// explode
							player.setNextGraphics(new Graphics(2140));
							player.getEquipment().getItems().set(3, null);
							player.getEquipment().refresh(3);
							player.getAppearence().generateAppearenceData();
							player.applyHit(new Hit(player,
									Utils.getRandom(150) + 10,
									HitLook.REGULAR_DAMAGE));
							player.setNextAnimation(new Animation(12175));
							return combatDelay;
						}
					}
					player.setNextGraphics(new Graphics(2138));
					World.sendProjectile(player, target, 2143, 18, 18, 60,
							30, 0, 0);
					delayHit(
							1,
							weaponId,
							attackStyle,
							true, getRangeHit(
									player,
									getRandomMaxHit(player, weaponId,
											attackStyle, true)));
					dropAmmo(player, -2);
				} else if (weaponName.toLowerCase().contains("crystal bow")) {
					player.setNextAnimation(new Animation(getWeaponAttackEmote(weaponId, attackStyle, player)));
					player.setNextGraphics(new Graphics(250, 0, 100));
					World.sendProjectile(player, target, 249, 41, 36, 41, 35, 0, 0);
					int hit = getRandomMaxHit(player, weaponId, attackStyle, true);
					delayHit(2, weaponId, attackStyle, true, getRangeHit(player, hit * 1));
					checkSwiftGlovesEffect(player, 2, attackStyle, weaponId, hit, 249, 41, 36, 41, 35, 0, 0);
				} else if (weaponId == 21365) { //Bolas
					dropAmmo(player, -1);
					player.setNextAnimation(new Animation(3128));
					World.sendProjectile(player, target, 468, 41, 41, 41, 35, 0, 0);
					int delay = 15000;
					if (target instanceof Player) {
						Player p = (Player) target;
						Item weapon = p.getEquipment().getItem(3);
						boolean slashBased = weapon != null;
						if (weapon != null) {
							int slash = p.getCombatDefinitions().getBonuses()[CombatDefinitions.SLASH_ATTACK];
							for (int i = 0; i < 5; i++) {
								if (p.getCombatDefinitions().getBonuses()[i] > slash) {
									slashBased = false;
									break;
								}
							}
						}
						if (p.getInventory().containsItem(946, 1) || slashBased) {
							delay /= 2;
						}
						if (p.getPrayer().usingPrayer(0, 18) || p.getPrayer().usingPrayer(1, 8)) {
							delay /= 2;
						}
						if (delay < 5000) {
							delay = 5000;
						}
					}
					long currentTime = Utils.currentTimeMillis();
					if (getRandomMaxHit(player, weaponId, attackStyle, true) > 0 && target.getFrozenBlockedDelay() < currentTime) {
						target.addFreezeDelay(delay, true);
						WorldTasksManager.schedule(new WorldTask() {
							@Override
							public void run() {
								target.setNextGraphics(new Graphics(469, 0, 96));
							}
						}, 2);
					}
					playSound(soundId, player, target);
					return combatDelay;
				} else if (weaponId == 10034 || weaponId == 10033) {
					attackTarget(getMultiAttackTargets(player), new MultiAttack() {
						private boolean nextTarget; 

						@Override
						public boolean attack() {
							int damage = getRandomMaxHit(player, weaponId,
									attackStyle, true, true,
									weaponId == 10034 ? 1.2 : 1.0, true);
							player.setNextAnimation(new Animation(2779));
							World.sendProjectile(player, target,
									weaponId == 10034 ? 909 : 908, 41, 16, 31, 35,
											16, 0);
							delayHit(2, weaponId, attackStyle,
									true, getRangeHit(player, damage));
							WorldTasksManager.schedule(new WorldTask() {
								@Override
								public void run() {
									target.setNextGraphics(new Graphics(2739, 0,
											96 << 16));
								}
							}, 1);
							if (!nextTarget) {
								if (damage == -1)
									return false;
								nextTarget = true;
							}
							return nextTarget;

						}
					});
					dropAmmo(player, -1);
				} else { // bow/default
					final int ammoId = player.getEquipment().getAmmoId();
					World.sendProjectile(player, target,
							getArrowProjectileGfxId(weaponId, ammoId, player), 41, 36,
							20, 35, 16, 0);
					int hit = getRandomMaxHit(player, weaponId, attackStyle, true);
					delayHit(2, weaponId, attackStyle,
							true, getRangeHit(player, hit));
					checkSwiftGlovesEffect(player, 2, attackStyle, weaponId, hit, getArrowProjectileGfxId(weaponId, ammoId, player), 
							41, 36, 20, 35, 16, 0);
					if (weaponId == 11235 || weaponId == 15701
							|| weaponId == 15702 || weaponId == 15703
							|| weaponId == 15704 || weaponId == 24474 || weaponId == 24456) { // dbows
						World.sendProjectile(player, target,
								getArrowProjectileGfxId(weaponId, ammoId, player), 41,
								35, 36, 35, 21, 0);

						delayHit(
								3,
								weaponId,
								attackStyle,
								true, getRangeHit(
										player,
										getRandomMaxHit(player, weaponId,
												attackStyle, true)));
						dropAmmo(player, 2);
					} else {
						if (weaponId != -1) {
							if (!weaponName.endsWith("bow full")
									&& !weaponName.equals("zaryte bow") 
									//&& !weaponName.equals("decimation") 
									&& !weaponName.equals("boogie bow"))
								dropAmmo(player);
						}
					}
				}
				player.setNextAnimation(new Animation(getWeaponAttackEmote(
						weaponId, attackStyle, player)));
			}
		}
		playSound(soundId, player, target);
		return combatDelay;
		//return (!secondary || defs != null && (defs.isShield() || Equipment.isTwoHandedWeapon(defs)) || shieldId == -1 || ItemDefinitions.getItemDefinitions(shieldId) != null && ItemDefinitions.getItemDefinitions(shieldId).isShield() ? combatDelay : combatDelay - 2 > 0 ? combatDelay - 2 : 1);
	}

	/**
	 * Handles the swift gloves effect.
	 * @param player The player.
	 * @param hitDelay The delay before hitting the target.
	 * @param attackStyle The attack style used.
	 * @param weaponId The weapon id.
	 * @param hit The hit done.
	 * @param gfxId The gfx id.
	 * @param startHeight The start height of the original projectile.
	 * @param endHeight The end height of the original projectile.
	 * @param speed The speed of the original projectile.
	 * @param delay The delay of the original projectile.
	 * @param curve The curve of the original projectile.
	 * @param startDistanceOffset The start distance offset of the original projectile.
	 */
	private void checkSwiftGlovesEffect(Player player, int hitDelay, int attackStyle, int weaponId, int hit, int gfxId, int startHeight, int endHeight, int speed, int delay, int curve, int startDistanceOffset) {
		Item gloves = player.getEquipment().getItem(Equipment.SLOT_HANDS);
		if (gloves == null || !gloves.getDefinitions().getName().contains("Swift glove")) {
			return;
		}
		if (hit != 0 && hit < ((max_hit / 3) * 2) || new Random().nextInt(3) != 0) {
			return;
		}
		player.getPackets().sendGameMessage("You fired an extra shot.", true);
		World.sendProjectile(player, target, gfxId, startHeight - 5,
				endHeight - 5, speed, delay, curve - 5 < 0 ? 0 : curve - 5, startDistanceOffset);
		delayHit(hitDelay, weaponId, attackStyle,
				false, getRangeHit(player, getRandomMaxHit(player, weaponId, attackStyle, true)));
		if (hit > (max_hit - 10)) {
			target.addFreezeDelay(10000, false);
			target.setNextGraphics(new Graphics(181, 0, 96));
		}

	}

	public void dropAmmo(Player player, int type) {
		if (type == -2) {
			final int ammoId = player.getEquipment().getAmmoId();
			player.getEquipment().removeAmmo(ammoId, 1, player.secondary);
			player.getAppearence().generateAppearenceData();//fixes arrows etc not updating
		} else if (type == -1 || type == -3) {
			final int weaponId = (player.secondary ? player.getEquipment().getWeaponId() : player.getEquipment().getShieldId());
			if (weaponId != -1) {
				if ((type == -3 && Utils.getRandom(10) < 2) || (type != -3 && Utils.getRandom(3) > 0)) {
					if (weaponId != 25202 && weaponId != 10034 && weaponId != 10033) {
						int capeId = player.getEquipment().getCapeId();
						String name = ItemDefinitions.getItemDefinitions(capeId)
								.getName().toLowerCase();
						if (capeId != -1
								&& name.contains("ava's") || name.contains("completionist") 
								|| name.contains("master cape") 
								|| name.contains("blue cape") || name.contains("red cape")
								|| name.contains("tokhaar-kal-xil"))
							return; // nothing happens
					}
				} else {
					player.getEquipment().removeAmmo(weaponId, type, player.secondary);
					return;
				}
				player.getEquipment().removeAmmo(weaponId, type, player.secondary);
				if (weaponId != 25202 && weaponId != 10034 && weaponId != 10033) {
					World.updateGroundItem(
							new Item(weaponId, type),
							new WorldTile(target.getCoordFaceX(target.getSize()),
									target.getCoordFaceY(target.getSize()), target
									.getPlane()), player);
				}
			}
		} else {
			final int ammoId = player.getEquipment().getAmmoId();
			if (Utils.getRandom(3) > 0) {
				int capeId = player.getEquipment().getCapeId();
				String name = ItemDefinitions.getItemDefinitions(capeId)
						.getName().toLowerCase();
				if (capeId != -1
						&& name.contains("ava's") || name.contains("completionist") 
						|| name.contains("master cape") 
						|| name.contains("blue cape") || name.contains("red cape")
						|| name.contains("tokhaar-kal-xil"))
					return; // nothing happens
			} else {
				player.getEquipment().removeAmmo(ammoId, type, player.secondary);
				return;
			}
			if (ammoId != -1) {
				player.getEquipment().removeAmmo(ammoId, type, player.secondary);
				World.updateGroundItem(
						new Item(ammoId, type),
						new WorldTile(target.getCoordFaceX(target.getSize()),
								target.getCoordFaceY(target.getSize()), target
								.getPlane()), player);
			}
		}
	}

	public void dropAmmo(Player player) {
		dropAmmo(player, 1);
	}

	public int getArrowThrowGfxId(int weaponId, int arrowId) {
		ItemDefinitions defs = null;
		if (arrowId != -1) {
			defs = ItemDefinitions.getItemDefinitions(arrowId);
			if (defs.getProjectileId() != -1) {
				return defs.getProjectileId();
			}
		} else {
			if (weaponId != -1) {
				defs = ItemDefinitions.getItemDefinitions(weaponId);
				if (defs.getProjectileId() != -1) {
					return defs.getProjectileId();
				}
			}
		}
		return 19; // bronze default
	}

	public int getArrowProjectileGfxId(int weaponId, int arrowId, Player player) {
		ItemDefinitions defs = null;
		if (weaponId != -1) {
			defs = ItemDefinitions.getItemDefinitions(weaponId);
			if (defs != null) {
				if (defs.getProjectileId() != -1) {
					return defs.getProjectileId();
				}
			}
		}
		if (arrowId != -1) {
			defs = ItemDefinitions.getItemDefinitions(arrowId);
			if (defs != null) {
				if (defs.getProjectileId() != -1) {
					return defs.getProjectileId();
				}
			}
		}
		return 10;
	}

	public static int getKnifeThrowGfxId(int weaponId, Player player) {
		final ItemDefinitions defs = ItemDefinitions.getItemDefinitions(weaponId);
		if (defs != null) {
			if (defs.isShield()) {
				final ItemDefinitions d = ItemDefinitions.getItemDefinitions(player.getEquipment().getWeaponId());
				if (d != null && d.id != -1 && d.getProjectileId() != -1) {
					return d.getProjectileId();
				}
			}
			return defs.getProjectileId();
		}
		return 19;
	}

	public void applyDragonfireShieldAttack(Player player) {
		if (target == null)
			return;
		if (!Combat.hasDragonFire(player))
			return;
		player.setNextAnimation(new Animation(6696));
		player.setNextGraphics(new Graphics(1165));
		delayMagicHit(2, getMagicHit(player, getRandomMagicMaxHit(player, 50)));
		World.sendProjectile(player, target, 1166, 18,18, 50, 40, 0, 0);
		mage_hit_gfx = 1167;
	}

	private int meleeAttack(final Player player) {
		int weaponId = (!player.secondary ? player.getEquipment().getWeaponId() : player.getEquipment().getShieldId());
		if (weaponId != -1 && ItemDefinitions.getItemDefinitions(weaponId).isShield()) {
			player.secondary = !player.secondary;
			weaponId = (!player.secondary ? player.getEquipment().getWeaponId() : player.getEquipment().getShieldId());
		}
		if (weaponId == -1) {
			player.secondary = !player.secondary;
			weaponId = (!player.secondary ? player.getEquipment().getWeaponId() : player.getEquipment().getShieldId());
		}
		final int shieldId = player.getEquipment().getShieldId();
		final ItemDefinitions defs = ItemDefinitions.getItemDefinitions(weaponId);
		int attackStyle = player.getCombatDefinitions().getAttackStyle();
		int combatDelay = getMeleeCombatDelay(player, weaponId);
		int soundId = getSoundId(weaponId, attackStyle);
		if (weaponId == -1) {
			Item gloves = player.getEquipment().getItem(Equipment.SLOT_HANDS);
			if (gloves != null && gloves.getDefinitions().getName().contains("Goliath gloves")) {
				weaponId = -2;
			}
		}
		applyDragonfireShieldAttack(player);
		if (player.getCombatDefinitions().isUsingSpecialAttack() && !player.secondary) {
			if(!specialExecute(player)) 
				return combatDelay;
			if (weaponId == 4153) {
				player.setNextAnimation(new Animation(1667));
				player.setNextGraphics(new Graphics(340, 0, 96 << 16));
				delayNormalHit(weaponId,attackStyle,getMeleeHit(
						player,getRandomMaxHit(player, weaponId, attackStyle,false, true, 1.1, true)));
				return 0;
			}
			switch (weaponId) {
			case 15442:// whip start
			case 15443:
			case 15444:
			case 15441:
			case 4151:
			case 23691:
				//case 4566:
				player.setNextAnimation(new Animation(11971));
				target.setNextGraphics(new Graphics(2108, 0, 100));
				if (target instanceof Player) {
					Player p2 = (Player) target;
					p2.setRunEnergy(p2.getRunEnergy() > 25 ? p2.getRunEnergy() - 25
							: 0);
				}
				delayNormalHit(
						weaponId,
						attackStyle,
						getMeleeHit(
								player,
								getRandomMaxHit(player, weaponId, attackStyle,
										false, true, 1.2, true)));
				break;
			case 11730: // sara sword
			case 23690:
				player.setNextAnimation(new Animation(11993));
				target.setNextGraphics(new Graphics(1194));
				delayNormalHit(
						weaponId,
						attackStyle,
						getMeleeHit(player, 50 + Utils.getRandom(100)),
						getMeleeHit(
								player,
								getRandomMaxHit(player, weaponId, attackStyle,
										false, true, 1.1, true)));
				soundId = 3853;
				break;
				/*case 11283:
				player.setNextAnimation(new Animation(6696));
				player.DFS--;
				target.setNextGraphics(new Graphics(1194));
				delayNormalHit(
						shieldId,
						attackStyle,
						getMagicHit(player, 50 + Utils.getRandom(100)),
						getMagicHit(
								player,
								getRandomMaxHit(player, shieldId, attackStyle,
										false, true, 1.1, true)));
				break;*/
			case 1249://d spear
			case 1263:
			case 3176:
			case 5716:
			case 5730:
			case 13770:
			case 13772:
			case 13774:
			case 13776:
				player.setNextAnimation(new Animation(12017));
				player.stopAll();
				target.setNextGraphics(new Graphics(80, 5, 60));
				if (!target.addWalkSteps(target.getX() - player.getX() + target.getX(), target.getY() - player.getY() + target.getY(), 1))
					player.setNextFaceEntity(target);
				target.setNextFaceEntity(player);
				WorldTasksManager.schedule(new WorldTask() {
					@Override
					public void run() {
						target.setNextFaceEntity(null);
						player.setNextFaceEntity(null);
					}
				});

				if (target instanceof Player) {
					final Player other = (Player) target;
					other.lock();
					other.addFoodDelay(3000);
					other.setDisableEquip(true);
					WorldTasksManager.schedule(new WorldTask() {
						@Override
						public void run() {
							other.setDisableEquip(false);
							other.unlock();
						}
					}, 5);
				} else {
					NPC n = (NPC) target;
					n.setFreezeDelay(3000);
					n.resetCombat();
					n.setRandomWalk(false);
				}
				break;
			case 11698: // sgs
			case 23681:
				player.setNextAnimation(new Animation(12019));
				player.setNextGraphics(new Graphics(2109));
				int sgsdamage = getRandomMaxHit(player, weaponId, attackStyle,
						false, true, 1.1, true);
				player.heal(sgsdamage / 2);
				player.getPrayer().restorePrayer((sgsdamage / 4) * 10);
				delayNormalHit(weaponId, attackStyle,
						getMeleeHit(player, sgsdamage));
				break;
			case 11696: // bgs
			case 23680:
				player.setNextAnimation(new Animation(11991));
				player.setNextGraphics(new Graphics(2114));
				int damage = getRandomMaxHit(player, weaponId, attackStyle,
						false, true, 1.2, true);
				delayNormalHit(weaponId, attackStyle,
						getMeleeHit(player, damage));
				if (target instanceof Player) {
					Player targetPlayer = ((Player) target);
					int amountLeft;
					if ((amountLeft = targetPlayer.getSkills().drainLevel(
							Skills.DEFENCE, damage / 10)) > 0) {
						if ((amountLeft = targetPlayer.getSkills().drainLevel(
								Skills.STRENGTH, amountLeft)) > 0) {
							if ((amountLeft = targetPlayer.getSkills()
									.drainLevel(Skills.PRAYER, amountLeft)) > 0) {
								if ((amountLeft = targetPlayer.getSkills()
										.drainLevel(Skills.ATTACK, amountLeft)) > 0) {
									if ((amountLeft = targetPlayer.getSkills()
											.drainLevel(Skills.MAGIC,
													amountLeft)) > 0) {
										if (targetPlayer.getSkills()
												.drainLevel(Skills.RANGE,
														amountLeft) > 0) {
											break;
										}
									}
								}
							}
						}
					}
				}
				break;
			case 11694: // ags
			case 23679:
				player.setNextAnimation(new Animation(11989));
				player.setNextGraphics(new Graphics(2113));
				delayNormalHit(
						weaponId,
						attackStyle,
						getMeleeHit(
								player,
								getRandomMaxHit(player, weaponId, attackStyle,
										false, true, 1.375, true)));
				break;
			case 13899: // vls
			case 13901:
				player.setNextAnimation(new Animation(10502));
				delayNormalHit(
						weaponId,
						attackStyle,
						getMeleeHit(
								player,
								getRandomMaxHit(player, weaponId, attackStyle,
										false, true, 1.20, true)));
				break;
			case 13902: // statius hammer
			case 13904:
				player.setNextAnimation(new Animation(10505));
				player.setNextGraphics(new Graphics(1840));
				final Hit shit = getMeleeHit(player, getRandomMaxHit(player, weaponId, attackStyle, false, true, 1.25, true));
				delayNormalHit(
						weaponId,
						attackStyle,
						shit);
				if (target instanceof Player) {
					Player targetPlayer = ((Player) target);
					if ((targetPlayer.getSkills().drainLevel(
							Skills.DEFENCE, shit.getDamage() / 10)) > 0) {
						break;
					}
				}/* else if (target instanceof NPC) {
					NPC targetNPC = ((NPC) target);
					if (targetNPC.getBonuses()[1] > 0)
						return 1;
					for (int i = 6; i < 10; i++) {
						//if (targetNPC.drainLevel(i, shit.getDamage() / 30) != -100000)
						if (targetNPC.drainLevel(i, shit.getDamage()) != 0)
							World.sendWorldMessage("<col=ff0000>Name: "+targetNPC.getName()+", Bonus["+i+"]: "+targetNPC.getBonuses()[i]);
					}
				}*/
				break;
			case 13905: // vesta spear
			case 13907:

				player.setNextAnimation(new Animation(10499));
				player.setNextGraphics(new Graphics(1835));
				delayNormalHit(
						weaponId,
						attackStyle,
						getMeleeHit(
								player,
								getRandomMaxHit(player, weaponId, attackStyle,
										false, true, 1.1, true)));
				break;
			case 19784: // korasi sword
			case 18786:
				player.setNextAnimation(new Animation(14788));
				player.setNextGraphics(new Graphics(1729));
				int korasiDamage = getMaxHit(player, weaponId, attackStyle, false, true, 1);
				int dualDamage = getMaxHit(player, weaponId, attackStyle, false, true, 1);
				double multiplier = 0.5 + Math.random();
				max_hit = (int) (korasiDamage * 1.5);
				max_hit = (int) (dualDamage * 1.65);
				korasiDamage *= multiplier;
				dualDamage *= multiplier;
				if (player.getEquipment().getShieldId() == 31639) {
					delayNormalHit(weaponId, attackStyle, getMagicHit(player, dualDamage));
				} else {
					delayNormalHit(weaponId, attackStyle, getMagicHit(player, korasiDamage));
				}
				break;			
			case 24457: //obliteration
				player.setNextAnimation(new Animation(16960));
				player.setNextGraphics(new Graphics(3189));
				delayNormalHit(
						weaponId,
						attackStyle,
						getMagicHit(
								player,
								getRandomMaxHit(player, weaponId, attackStyle,
										false, true, 1.5, true)));
				break;	
			case 24455:// Annihilation
				player.setNextAnimation(new Animation(16961));
				player.setNextGraphics(new Graphics(44));
				delayNormalHit(
						weaponId,
						attackStyle,
						getMeleeHit(
								player,
								getRandomMaxHit(player, weaponId, attackStyle,
										false, true, 1.5, true)));

				break;				
			case 11700:
				int zgsdamage = getRandomMaxHit(player, weaponId, attackStyle,
						false, true, 1.0, true);
				player.setNextAnimation(new Animation(7070));
				player.setNextGraphics(new Graphics(1221));
				if (zgsdamage != 0 && target.getSize() <= 1) { // freezes small
					// npcs
					target.setNextGraphics(new Graphics(2104));
					target.addFreezeDelay(18000); // 18seconds
				}
				delayNormalHit(weaponId, attackStyle,
						getMeleeHit(player, zgsdamage));
				break;
			case 27770://chaotic claws
			case 26705://14484: // d claws
			case 23695:
			case 14486: // d claws lent
			case 14484:
				if (player.getEquipment().getShieldId() == 31639) {
					player.setNextAnimation(new Animation(10961));
					player.setNextGraphics(new Graphics(1950));
					int[] hits = new int[] { 0, 1 };
					int hit = getRandomMaxHit(player, weaponId, attackStyle, false,
							true, 1.0, true);
					if (hit > 0) {
						hits = new int[] { hit, hit / 2, (hit / 2) / 2,
								(hit / 2) - ((hit / 2) / 2) };
					} else {
						hit = getRandomMaxHit(player, weaponId, attackStyle, false,
								true, 1.0, true);
						if (hit > 0) {
							hits = new int[] { 0, hit, hit / 2, hit - (hit / 2) };
						} else {
							hit = getRandomMaxHit(player, weaponId, attackStyle,
									false, true, 1.0, true);
							if (hit > 0) {
								hits = new int[] { 0, 0, hit / 2, (hit / 2) + 10 };
							} else {
								hit = getRandomMaxHit(player, weaponId,
										attackStyle, false, true, 1.0, true);
								if (hit > 0) {
									hits = new int[] { 0, 0, 0, (int) (hit * 1.5) };
								} else {
									hits = new int[] { 0, 0, 0, Utils.getRandom(7) };
								}
							}
						}
					}

					for (int i = 0; i < hits.length; i++) {
						if (i > 1) {
							delayHit(1, weaponId, attackStyle,
									true, getMeleeHit(player, hits[i]));
						} else {
							delayNormalHit(weaponId, attackStyle,
									getMeleeHit(player, hits[i]));
						}
					}
				} else {
					player.sm("You must be wearing an off-hand dragon claw to use this");
				}
				break;
			case 10887: // anchor
				player.setNextAnimation(new Animation(5870));
				player.setNextGraphics(new Graphics(1027));
				delayNormalHit(
						weaponId,
						attackStyle,
						getMeleeHit(
								player,
								getRandomMaxHit(player, weaponId, attackStyle,
										false, false, 1.0, true)));
				break;
			case 1305: // dragon long
				player.setNextAnimation(new Animation(12033));
				player.setNextGraphics(new Graphics(2117));
				delayNormalHit(
						weaponId,
						attackStyle,
						getMeleeHit(
								player,
								getRandomMaxHit(player, weaponId, attackStyle,
										false, true, 1.25, true)));
				break;
			case 3204: // d hally
				player.setNextAnimation(new Animation(1665));
				player.setNextGraphics(new Graphics(282));
				if (target.getSize() < 3) {// giant npcs wont get stuned cuz of
					// a stupid hit
					target.setNextGraphics(new Graphics(254, 0, 100));
					target.setNextGraphics(new Graphics(80));
				}
				delayNormalHit(
						weaponId,
						attackStyle,
						getMeleeHit(
								player,
								getRandomMaxHit(player, weaponId, attackStyle,
										false, true, 1.1, true)));
				if (target.getSize() > 1)
					delayHit(
							1,
							weaponId,
							attackStyle,
							true, getMeleeHit(
									player,
									getRandomMaxHit(player, weaponId,
											attackStyle, false, true, 1.1, true)));
				break;
			case 4587: // dragon sci
				player.setNextAnimation(new Animation(12031));
				player.setNextGraphics(new Graphics(2118));
				Hit hit1 = getMeleeHit(
						player,
						getRandomMaxHit(player, weaponId, attackStyle, false,
								true, 1.0, true));
				if (target instanceof Player) {
					Player p2 = (Player) target;
					if (hit1.getDamage() > 0)
						p2.setPrayerDelay(5000);// 5 seconds
				}
				delayNormalHit(weaponId, attackStyle, hit1);
				soundId = 2540;
				break;
			case 1215: // dragon dagger
			case 5698: // dds
			case 5680: //dd p+
			case 1231: //dd
				player.setNextAnimation(new Animation(1062));
				player.setNextGraphics(new Graphics(252, 0, 100));
				delayNormalHit(
						weaponId,
						attackStyle,
						getMeleeHit(
								player,
								getRandomMaxHit(player, weaponId, attackStyle,
										false, true, 1.15, true)),
						getMeleeHit(
								player,
								getRandomMaxHit(player, weaponId, attackStyle,
										false, true, 1.15, true)));
				soundId = 2537;
				break;
			case 1434: // dragon mace
				player.setNextAnimation(new Animation(1060));
				player.setNextGraphics(new Graphics(251));
				delayNormalHit(
						weaponId,
						attackStyle,
						getMeleeHit(
								player,
								getRandomMaxHit(player, weaponId, attackStyle,
										false, true, 1.45, true)));
				soundId = 2541;
				break;
			default:
				player.getPackets()
				.sendGameMessage(
						"This weapon has no special Attack, if you still see special bar please relogin.");
				return combatDelay;
			}
		} else {
			if (weaponId == -2 && new Random().nextInt(25) == 0) {
				player.setNextAnimation(new Animation(14417));
				final int attack = attackStyle;
				attackTarget(getMultiAttackTargets(player, 5, Integer.MAX_VALUE), new MultiAttack() {

					private boolean nextTarget;

					@Override
					public boolean attack() {
						target.addFreezeDelay(10000, true);
						target.setNextGraphics(new Graphics(181, 0, 96));
						final Entity t = target;
						WorldTasksManager.schedule(new WorldTask() {
							@Override
							public void run() {
								final int damage = getRandomMaxHit(player, -2, attack, false, false, 1.0, false);
								t.applyHit(new Hit(player, damage, HitLook.REGULAR_DAMAGE));

								stop();
							}
						}, 1);
						if (target instanceof Player) {
							Player p = (Player) target;
							for (int i = 0; i < 7; i++) {
								if (i != 3 && i != 5) {
									p.getSkills().drainLevel(i, 7);
								}
							}
							p.getPackets().sendGameMessage("Your stats have been drained!");
						}
						if (!nextTarget) {
							nextTarget = true;
						}
						return nextTarget;

					}
				});
				return combatDelay;
			}
			delayNormalHit(
					weaponId,
					attackStyle,
					getMeleeHit(
							player,
							getRandomMaxHit(player, weaponId, attackStyle,
									false)));
			player.setNextAnimation(new Animation(getWeaponAttackEmote(
					weaponId, attackStyle, player)));
		}
		playSound(soundId, player, target);
		return combatDelay;
		//return (!secondary || defs != null && (defs.isShield() || Equipment.isTwoHandedWeapon(defs)) || shieldId == -1 || ItemDefinitions.getItemDefinitions(shieldId) != null && ItemDefinitions.getItemDefinitions(shieldId).isShield() ? combatDelay : combatDelay - 2 > 0 ? combatDelay - 2 : 1);
	}

	public static int getWeaponAttackEmote(int weaponId, int attackStyle, Player player) {
		final ItemDefinitions weapon = (weaponId == -1 ? null : ItemDefinitions.getItemDefinitions(weaponId));
		final Item shield = player.getEquipment().getItem(Equipment.SLOT_SHIELD);
		final boolean hasOffhand = player.getEquipment() != null && player.getEquipment().getShieldId() != -1;
		if (weapon != null) {
			if (Equipment.isTwoHandedWeapon(weapon)) {
				if (weapon.getMainhandEmote(LEGACY) != -1) {
					return weapon.getMainhandEmote(LEGACY);
				}
			}
			if (player.secondary || !hasOffhand) {
				if (weapon.getMainhandEmote(LEGACY) != -1) {
					return weapon.getMainhandEmote(LEGACY);
				}
			} else if (!player.secondary) {
				if (shield != null && shield.getDefinitions() != null) {
					if (shield.getDefinitions().getOffhandEmote(LEGACY) != -1) {
						return shield.getDefinitions().getOffhandEmote(LEGACY);
					} else {
						if (weapon.isShield()) {
							final ItemDefinitions d = ItemDefinitions.getItemDefinitions(player.getEquipment().getWeaponId());
							if (d != null && d.id != -1) {
								if (d.getMainhandEmote(LEGACY) != -1) {
									return d.getMainhandEmote(LEGACY);
								}
							}
						}
						if (weapon.getMainhandEmote(LEGACY) != -1) {
							return weapon.getMainhandEmote(LEGACY);
						}
						//return (attackStyle == 1 ? 423 : 422);
					}
				} else {
					if (weapon.getMainhandEmote(LEGACY) != -1) {
						return weapon.getMainhandEmote(LEGACY);
					}
					//return (attackStyle == 1 ? 423 : 422);
				}
			}
		} else {
			if (player.secondary) {
				return (attackStyle == 1 ? 423 : 422);
			} else {
				if (shield != null && shield.getDefinitions() != null) {
					if (shield.getDefinitions().getOffhandEmote(LEGACY) != -1) {
						return shield.getDefinitions().getOffhandEmote(LEGACY);
					} else {
						return (attackStyle == 1 ? 423 : 422);
					}
				}
			}
		}
		return (attackStyle == 1 ? 423 : 422);
	}

	public void resetVariables(boolean changeHand, Player player) {
		base_mage_xp = 0;
		mage_hit_gfx = 0;
		magic_sound = 0;
		max_poison_hit = 0;
		freeze_time = 0;
		reduceAttack = false;
		blood_spell = false;
		block_tele = false;
		if (changeHand && player != null)
			player.secondary = !player.secondary;
	}

	public void playSound(int soundId, Player player, Entity target) {
		if (soundId == -1)
			return;
		player.getPackets().sendSound(soundId, 0, 1);
		if (target instanceof Player) {
			Player p2 = (Player) target;
			if (p2 != null)
				p2.getPackets().sendSound(soundId, 0, 1);
		}
	}

	public int getRandomMaxHit(Player player, int weaponId, int attackStyle, boolean ranging) {
		return getRandomMaxHit(player, weaponId, attackStyle, ranging, true, 1.0D, false);
	}

	public int getRandomMaxHit(Player player, int weaponId, int attackStyle,
			boolean ranging, boolean defenceAffects, double specMultiplier,
			boolean usingSpec) {
		max_hit = getMaxHit(player, weaponId, attackStyle, ranging, usingSpec,
				specMultiplier);
		if (defenceAffects) {
			double att = player.getSkills().getLevel(ranging ? 4 : 0)
					+ player.getCombatDefinitions().getBonuses()[ranging ? 4 : CombatDefinitions.getMeleeBonusStyle(weaponId, attackStyle)];
			if (weaponId == -2) {
				att += 82;
			}
			att *= ranging ? player.getPrayer().getRangeMultiplier() : player
					.getPrayer().getAttackMultiplier();
			if (fullVoidEquipped(player, ranging ? (new int[] { 11664, 11675 })
					: (new int[] { 11665, 11676 })))
				att *= 1.1;
			
			if (ranging)
				att *= player.getAuraManager().getRangeAccuracyMultiplier();
			if (!ranging)
				att *= player.getAuraManager().getAttackAccuracyMultiplier();
			double def = 0;
			if (target instanceof Player) {
				Player p2 = (Player) target;
				def = (double) p2.getSkills().getLevel(Skills.DEFENCE)
						+ (2 * p2.getCombatDefinitions().getBonuses()[ranging ? 9
								: CombatDefinitions
								.getMeleeDefenceBonus(CombatDefinitions
										.getMeleeBonusStyle(weaponId,
												attackStyle))]);

				def *= p2.getPrayer().getDefenceMultiplier();
				if (!ranging) {
					if (p2.getFamiliar() instanceof Steeltitan)
						def *= 1.15;
					if (p2.getEquipment().getAuraId() == 22897)
						def *= player.getAuraManager().getDefenceAccuracyMultiplier();
				}
			} else {
				NPC n = (NPC) target;
				def = n.getBonuses() != null ? n.getBonuses()[ranging ? 9
						: CombatDefinitions
						.getMeleeDefenceBonus(CombatDefinitions
								.getMeleeBonusStyle(weaponId,
										attackStyle))] : 0;
				def *= 2;
				if(n.getId() == 1160 && fullVeracsEquipped(player))
					def *= 0.6;
			}
			if (usingSpec) {
				double multiplier = /* 0.25 + */getSpecialAccuracyModifier(player);
				att *= multiplier;
			}
			if(def < 0) {
				def = -def;
				att += def;
			}
			double prob = att / def;

			if (prob > 0.90) // max, 90% prob hit so even lvl 138 can miss at
				// lvl 3
				prob = 0.90;
			else if (prob < 0.05) // minimun 5% so even lvl 3 can hit lvl 138
				prob = 0.05;
			if (prob < Math.random())
				return 0;
		}
		int hit = Utils.random(max_hit+1);
		int ringId = player.getEquipment().getRingId();
		if (target instanceof NPC) {
			NPC n = (NPC) target;
			if (n.getId() == 9463 && hasFireCape(player)) {
				hit += 40;
			}
			String weaponName = ItemDefinitions.getItemDefinitions(weaponId)
					.getName().toLowerCase();
			if (n.getId() == 8133 && !weaponName.contains("spear")) {
				hit *= 0.5;
			}
			if (n.getId() == 8133 && weaponName.contains("spear")) {
				hit *= 1.25;
			}
			/*if (n.getId() == 8133 && weaponId == 11716 ||
				n.getId() == 8133 && weaponId == 23683 ||
				n.getId() == 8133 && weaponId == 13905 ||
				n.getId() == 8133 && weaponId == 13929 ||
				n.getId() == 8133 && weaponId == 17143 ||
				n.getId() == 8133 && weaponId == 17145 ||
				n.getId() == 8133 && weaponId == 17149) {
			hit *= 1.5;
			}*/
			if (fullBattlemageEquipped(player) || fullVanguardEquipped(player) || fullTricksterEquipped(player))
				hit *= 1.15;//this is the correct damage boost for these sets and 
			/*if (Slayer.hasSlayerHelmet(player) && player.getSlayerManager() != null && player.getSlayerManager().npcIsTask(n.getName()))
				hit *= 1.125;//correct damage boost is 12.5%. This accounts for using the ranged combat style.
*/		}
		if (player.getAuraManager().usingEquilibrium()) {
			int perc25MaxHit = (int) (max_hit * 0.25);
			hit -= perc25MaxHit;
			max_hit -= perc25MaxHit;
			if (hit < 0)
				hit = 0;
			if (hit < perc25MaxHit)
				hit += perc25MaxHit;

		}
		return hit;
	}

	private final int getMaxHit(Player player, int weaponId,
			int attackStyle, boolean ranging, boolean usingSpec,
			double specMultiplier) {
		if (!ranging) {
			double strengthLvl = player.getSkills().getLevel(Skills.STRENGTH);
			int xpStyle = CombatDefinitions.getXpStyle(weaponId, attackStyle);
			double styleBonus = xpStyle == Skills.STRENGTH ? 3 : xpStyle == CombatDefinitions.SHARED ? 1 : 0;
			double otherBonus = 1;
			if (fullDharokEquipped(player)) {
				double hp = player.getHitpoints();
				double maxhp = player.getMaxHitpoints();
				double d = hp / maxhp;
				otherBonus = 2 - d;
			}
			double effectiveStrength = 8 + Math.floor((strengthLvl * player.getPrayer().getStrengthMultiplier()) + styleBonus);
			if (fullVoidEquipped(player, 11665, 11676)) 
				effectiveStrength = Math.floor(effectiveStrength*1.1);
			if (player.getEquipment().getAuraId() == 22897)
				effectiveStrength = Math.floor(effectiveStrength*player.getAuraManager().getStrengthAccuracyMultiplier());
			if (target instanceof NPC) {
				SlayerTask task = player.getSlayerManager().getCurrentTask();
				if (task != null) {
					if (SlayHelmet(player)
							&& isSlayerTask(((NPC) target).getName(), player))
						effectiveStrength = Math
								.floor(effectiveStrength * 1.15);
				}
			}
			double strengthBonus = player.getCombatDefinitions().getBonuses()[CombatDefinitions.STRENGTH_BONUS];
			if (weaponId == -2) {
				strengthBonus += 82;
			}
			double baseDamage = 5 + effectiveStrength * (1 + (strengthBonus / 64));
			return (int) Math.floor(baseDamage * specMultiplier * otherBonus);
		} else {
			if(weaponId == 24338 && (target instanceof Player || target instanceof CorporealBeast)) {
				player.getPackets().sendGameMessage("The royal crossbow feels weak and unresponsive against "+(target instanceof Player ? "other players." : "the corporeal beast."));
				return 60;
			}
			double rangedLvl = player.getSkills().getLevel(Skills.RANGE);
			double styleBonus = attackStyle == 0 ? 3 : attackStyle == 1 ? 0 : 1;
			double effectiveStrenght = Math.floor(rangedLvl	* player.getPrayer().getRangeMultiplier()) + styleBonus;

			if (fullVoidEquipped(player, 11664, 11675))
				effectiveStrenght += Math.floor((player.getSkills().getLevelForXp(
						Skills.RANGE) / 5) + 1.6);
			if (target instanceof NPC) {
				SlayerTask task = player.getSlayerManager().getCurrentTask();
				if (task != null) {
					if (SlayHelmet(player)
							&& isSlayerTask(((NPC) target).getName(), player))
						effectiveStrenght += Math.floor((player.getSkills()
								.getLevelForXp(Skills.RANGE) / 5) + 1.6);
				}
			}
			double strengthBonus = player.getCombatDefinitions().getBonuses()[CombatDefinitions.RANGED_STR_BONUS];
			double baseDamage = 5 + (((effectiveStrenght + 8) * (strengthBonus + 64)) / 64);
			return (int) Math.floor(baseDamage * specMultiplier);
		}
	}


	private double getSpecialAccuracyModifier(Player player) {
		Item weapon = player.getEquipment().getItem(Equipment.SLOT_WEAPON);
		if (weapon == null)
			return 1;
		String name = weapon.getDefinitions().getName().toLowerCase();
		if (name.contains("whip") || name.contains("dragon longsword")
				|| name.contains("dragon scimitar")
				|| name.contains("dragon dagger"))
			return 1.1;
		if (name.contains("anchor") || name.contains("magic longbow"))
			return 2;
		if (name.contains("dragon claws") || name.contains("chaotic claws") || name.contains("armadyl godsword") || name.contains("annihilation"))
			return 2;
		return 1;
	}


	public boolean hasFireCape(Player player) {
		int capeId = player.getEquipment().getCapeId();
		return capeId == 6570 || capeId == 20769 || capeId == 20771 || capeId == 23659 || capeId == 23701 || capeId == 23702;
	}

	public static final boolean fullSlayerHelmEquipped(Player player) {
		int helmId = player.getEquipment().getHatId();
		return ItemDefinitions.getItemDefinitions(helmId).getName().toLowerCase()
				.contains("full slayer helmet");
	}

	public static final boolean slayerHelmEquipped(Player player) {
		int helmId = player.getEquipment().getHatId();
		return ItemDefinitions.getItemDefinitions(helmId).getName().toLowerCase()
				.contains("slayer helmet");
	}

	public static final boolean slayerMeleeBoost(Player player) {
		int helmId = player.getEquipment().getHatId();
		return ItemDefinitions.getItemDefinitions(helmId).getName().toLowerCase()
				.contains("black mask");
	}

	public static final boolean slayerRangedBoost(Player player) {
		int helmId = player.getEquipment().getHatId();
		return ItemDefinitions.getItemDefinitions(helmId).getName().toLowerCase()
				.contains("focus sight");
	}

	public static final boolean slayerMageBoost(Player player) {
		int helmId = player.getEquipment().getHatId();
		return ItemDefinitions.getItemDefinitions(helmId).getName().toLowerCase()
				.contains("hexcrest");
	}

	public static final boolean fullVanguardEquipped(Player player) {
		int helmId = player.getEquipment().getHatId();
		int chestId = player.getEquipment().getChestId();
		int legsId = player.getEquipment().getLegsId();
		int bootsId = player.getEquipment().getBootsId();
		int glovesId = player.getEquipment().getGlovesId();
		if (helmId == -1 || chestId == -1 || legsId == -1 || bootsId == -1 || glovesId == -1)
			return false;
		return ItemDefinitions.getItemDefinitions(helmId).getName().toLowerCase()
				.contains("vanguard")
				&& ItemDefinitions.getItemDefinitions(chestId).getName().toLowerCase()
				.contains("vanguard")
				&& ItemDefinitions.getItemDefinitions(legsId).getName().toLowerCase()
				.contains("vanguard")
				&& ItemDefinitions.getItemDefinitions(bootsId).getName().toLowerCase()
				.contains("vanguard")
				&& ItemDefinitions.getItemDefinitions(glovesId).getName().toLowerCase()
				.contains("vanguard");
	}

	public static final boolean fullTricksterEquipped(Player player) {
		int helmId = player.getEquipment().getHatId();
		int chestId = player.getEquipment().getChestId();
		int legsId = player.getEquipment().getLegsId();
		int bootsId = player.getEquipment().getBootsId();
		int glovesId = player.getEquipment().getGlovesId();
		if (helmId == -1 || chestId == -1 || legsId == -1
				|| bootsId == -1 || glovesId == -1)
			return false;
		return ItemDefinitions.getItemDefinitions(helmId).getName().toLowerCase()
				.contains("trickster")
				&& ItemDefinitions.getItemDefinitions(chestId).getName().toLowerCase()
				.contains("trickster")
				&& ItemDefinitions.getItemDefinitions(legsId).getName().toLowerCase()
				.contains("trickster")
				&& ItemDefinitions.getItemDefinitions(bootsId).getName().toLowerCase()
				.contains("trickster")
				&& ItemDefinitions.getItemDefinitions(glovesId).getName().toLowerCase()
				.contains("trickster");
	}

	public static final boolean fullBattlemageEquipped(Player player) {
		int helmId = player.getEquipment().getHatId();
		int chestId = player.getEquipment().getChestId();
		int legsId = player.getEquipment().getLegsId();
		int bootsId = player.getEquipment().getBootsId();
		int glovesId = player.getEquipment().getGlovesId();
		if (helmId == -1 || chestId == -1 || legsId == -1
				|| bootsId == -1 || glovesId == -1)
			return false;
		return ItemDefinitions.getItemDefinitions(helmId).getName().toLowerCase()
				.contains("battle-mage")
				&& ItemDefinitions.getItemDefinitions(chestId).getName().toLowerCase()
				.contains("battle-mage")
				&& ItemDefinitions.getItemDefinitions(legsId).getName().toLowerCase()
				.contains("battle-mage")
				&& ItemDefinitions.getItemDefinitions(bootsId).getName().toLowerCase()
				.contains("battle-mage")
				&& ItemDefinitions.getItemDefinitions(glovesId).getName().toLowerCase()
				.contains("battle-mage");
	}

	public static final boolean usingGoliathGloves(Player player) {
		String name = player.getEquipment().getItem(Equipment.SLOT_SHIELD) != null ? player
				.getEquipment().getItem(Equipment.SLOT_SHIELD).getDefinitions()
				.getName().toLowerCase()
				: "";
				if (player.getEquipment().getItem((Equipment.SLOT_HANDS)) != null) {
					if (player.getEquipment().getItem(Equipment.SLOT_HANDS)
							.getDefinitions().getName().toLowerCase()
							.contains("goliath")
							&& player.getEquipment().getWeaponId() == -1) {
						if (name.contains("defender")
								&& name.contains("dragonfire shield"))
							return true;
						return true;
					}
				}
				return false;
	}

	public static final boolean fullVeracsEquipped(Player player) {
		int helmId = player.getEquipment().getHatId();
		int chestId = player.getEquipment().getChestId();
		int legsId = player.getEquipment().getLegsId();
		int weaponId = player.getEquipment().getWeaponId();
		if (helmId == -1 || chestId == -1 || legsId == -1 || weaponId == -1)
			return false;
		return ItemDefinitions.getItemDefinitions(helmId).getName()
				.contains("Verac's")
				&& ItemDefinitions.getItemDefinitions(chestId).getName()
				.contains("Verac's")
				&& ItemDefinitions.getItemDefinitions(legsId).getName()
				.contains("Verac's")
				&& ItemDefinitions.getItemDefinitions(weaponId).getName()
				.contains("Verac's");
	}

	public static final boolean fullDharokEquipped(Player player) {
		int helmId = player.getEquipment().getHatId();
		int chestId = player.getEquipment().getChestId();
		int legsId = player.getEquipment().getLegsId();
		int weaponId = player.getEquipment().getWeaponId();
		if (helmId == -1 || chestId == -1 || legsId == -1 || weaponId == -1)
			return false;
		return ItemDefinitions.getItemDefinitions(helmId).getName()
				.contains("Dharok's")
				&& ItemDefinitions.getItemDefinitions(chestId).getName()
				.contains("Dharok's")
				&& ItemDefinitions.getItemDefinitions(legsId).getName()
				.contains("Dharok's")
				&& ItemDefinitions.getItemDefinitions(weaponId).getName()
				.contains("Dharok's");
	}

	public static final boolean fullGuthansEquipped(Player player) {
		int helmId = player.getEquipment().getHatId();
		int chestId = player.getEquipment().getChestId();
		int legsId = player.getEquipment().getLegsId();
		int weaponId = player.getEquipment().getWeaponId();
		if (helmId == -1 || chestId == -1 || legsId == -1 || weaponId == -1)
			return false;
		return ItemDefinitions.getItemDefinitions(helmId).getName()
				.contains("Guthan's")
				&& ItemDefinitions.getItemDefinitions(chestId).getName()
				.contains("Guthan's")
				&& ItemDefinitions.getItemDefinitions(legsId).getName()
				.contains("Guthan's")
				&& ItemDefinitions.getItemDefinitions(weaponId).getName()
				.contains("Guthan's");
	}

	public static final boolean SlayHelmet(Player player) {
		int helmId = player.getEquipment().getHatId();
		if (helmId == -1)
			return false;
		if (helmId == 13263)
			return true;
		if (helmId == 15492)
			return true;
		if (helmId == 12681)
			return true;
		return false;
	}

	public static final boolean isSlayerTask(String npcName, Player player) {
		SlayerTask task = player.getSlayerManager().getCurrentTask();
		if (task == null) {
			return false;
		}
		String taskName = task.getName().toLowerCase().replaceAll(" ", "_");
		npcName = npcName.toLowerCase().replaceAll(" ", "_");
		if (npcName.contains(taskName) || taskName.contains(npcName)) {
			return true;
		}
		return false;
	}
	
	public static final boolean fullVoidEquipped(Player player, int... helmid) {
		boolean hasDeflector = player.getEquipment().getShieldId() == 19712;
		if (player.getEquipment().getGlovesId() != 8842) {
			if (hasDeflector)
				hasDeflector = false;
			else
				return false;
		}
		int legsId = player.getEquipment().getLegsId();
		boolean hasLegs = legsId != -1
				&& (legsId == 8840 || legsId == 19786 || legsId == 19788 || legsId == 19790);
		if (!hasLegs) {
			if (hasDeflector)
				hasDeflector = false;
			else
				return false;
		}
		int torsoId = player.getEquipment().getChestId();
		boolean hasTorso = torsoId != -1
				&& (torsoId == 8839 || torsoId == 10611 || torsoId == 19785
				|| torsoId == 19787 || torsoId == 19789);
		if (!hasTorso) {
			if (hasDeflector)
				hasDeflector = false;
			else
				return false;
		}
		if (hasDeflector)
			return true;
		int helmId = player.getEquipment().getHatId();
		if (helmId == -1)
			return false;
		boolean hasHelm = false;
		for (int id : helmid) {
			if (helmId == id) {
				hasHelm = true;
				break;
			}
		}
		if (!hasHelm)
			return false;
		return true;
	}

	public void delayNormalHit(int weaponId, int attackStyle, Hit... hits) {
		delayHit(0, weaponId, attackStyle, true, hits);
	}

	//TODO ADJUST SPIRIT SHIELDS
	//TODO ascendri bolts & hydrix shit
	//TODO fix incompatible combat style prevention
	//TODO fix dfs charging
	//TODO 2h crossbow variants
	//TODO fix render emote updating with switching (buttonhandler -> sendwear)
	//TODO add negative stat bonuses for equipment

	public final Hit getMeleeHit(Player player, int damage) {
		int amuletId = player.getEquipment().getAmuletId();
		if (amuletId == 32704 || amuletId == 32695 || amuletId == 32698 || amuletId == 32701) {
			int heal = (int) (damage * 0.15);
			if (damage > 0 && player.getHitpoints() < player.getMaxHitpoints() && Utils.getRandom(50) <= 5) {
				player.applyHit(new Hit(player, heal, HitLook.HEALED_DAMAGE));
			}
		}
		if (fullGuthansEquipped(player)) {
			final double hp = player.getHitpoints();
			final double maxhp = player.getMaxHitpoints();
			if (hp != maxhp) {
				final double chance = Math.random() * 500;
				if (chance <= 100 && damage > 0) {
					final int heal = (int) (damage * 0.45);
					player.heal(heal);
					player.setNextGraphics(new Graphics(398, 0, 0));
				}
			}
		}
		return new Hit(player, damage, HitLook.MELEE_DAMAGE);
	}	

	public final Hit getRangeHit(Player player, int damage) {
		int amuletId = player.getEquipment().getAmuletId();
		if (amuletId == 32704 || amuletId == 32695 || amuletId == 32698 || amuletId == 32701) {
			int heal = (int) (damage * 0.15);
			if (damage > 0 && player.getHitpoints() < player.getMaxHitpoints() && Utils.getRandom(50) <= 5) {
				player.applyHit(new Hit(player, heal, HitLook.HEALED_DAMAGE));
			}
		}
		return new Hit(player, damage, HitLook.RANGE_DAMAGE);
	}

	public final Hit getMagicHit(Player player, int damage) {
		int amuletId = player.getEquipment().getAmuletId();
		if (amuletId == 32704 || amuletId == 32695 || amuletId == 32698 || amuletId == 32701) {
			int heal = (int) (damage * 0.15);
			if (damage > 0 && player.getHitpoints() < player.getMaxHitpoints() && Utils.getRandom(50) <= 5) {
				player.applyHit(new Hit(player, heal, HitLook.HEALED_DAMAGE));
			}
		}
		return new Hit(player, damage, HitLook.MAGIC_DAMAGE);
	}

	public final void delayMagicHit(int delay, final Hit... hits) {
		delayHit(delay, -1, -1, true, hits);
	}

	private final void delayHit(int delay, final int weaponId, final int attackStyle, boolean changeHand, final Hit... hits) {
		addAttackedByDelay(hits[0].getSource());

		final Entity target = this.target;
		final int max_hit = this.max_hit;
		final double base_mage_xp = this.base_mage_xp;
		final int mage_hit_gfx = this.mage_hit_gfx;
		final int magic_sound = this.magic_sound;
		final int max_poison_hit = this.max_poison_hit;
		final int freeze_time = this.freeze_time;
		final boolean blood_spell = this.blood_spell;
		final boolean block_tele = this.block_tele;
		resetVariables(changeHand, (Player) hits[0].getSource());

		for (Hit hit : hits) {
			Player player = (Player) hit.getSource();
			if(target instanceof Player) {
				Player p2 = (Player) target;
				if (player.getPrayer().usingPrayer(1, 18)) 
					p2.sendSoulSplit(hit, player);
			}
			int damage = hit.getDamage() > target.getHitpoints() ? target
					.getHitpoints() : hit.getDamage();
					if (hit.getLook() == HitLook.RANGE_DAMAGE
							|| hit.getLook() == HitLook.MELEE_DAMAGE) {
						double combatXp = damage / 2.5;
						if (combatXp > 0) {
							player.getAuraManager().checkSuccefulHits(hit.getDamage());
							if (hit.getLook() == HitLook.RANGE_DAMAGE) {
								if (attackStyle == 2) {
									player.getSkills()
									.addXp(Skills.RANGE, combatXp / 2);
									player.getSkills().addXp(Skills.DEFENCE,
											combatXp / 2);
								} else
									player.getSkills().addXp(Skills.RANGE, combatXp);

							} else {
								int xpStyle = CombatDefinitions.getXpStyle(weaponId,
										attackStyle);
								if (xpStyle != CombatDefinitions.SHARED)
									player.getSkills().addXp(xpStyle, combatXp);
								else {
									player.getSkills().addXp(Skills.ATTACK,
											combatXp / 3);
									player.getSkills().addXp(Skills.STRENGTH,
											combatXp / 3);
									player.getSkills().addXp(Skills.DEFENCE,
											combatXp / 3);
								}
							}
							double hpXp = damage / 7.5;
							if (hpXp > 0)
								player.getSkills().addXp(Skills.HITPOINTS, hpXp);
						}
					} else if (hit.getLook() == HitLook.MAGIC_DAMAGE) {
						if (mage_hit_gfx != 0 && damage > 0) {
							if (freeze_time > 0) {
								target.addFreezeDelay(freeze_time, freeze_time == 0);
								if (freeze_time > 0)
									if (target instanceof Player) {
										((Player) target).stopAll(false);
									}
								target.addFrozenBlockedDelay(freeze_time
										+ (4 * 1000));//four seconds of no freeze
							}
						} else if (damage < 0) {
							damage = 0;
						}
						double combatXp = base_mage_xp * 1 + (damage / 5);

						if (combatXp > 0) {
							player.getAuraManager().checkSuccefulHits(hit.getDamage());
							if (player.getCombatDefinitions().isDefensiveCasting()
									|| (hasPolyporeStaff(player) && player.getCombatDefinitions().getAttackStyle() == 1)) {
								int defenceXp = (int) (damage / 7.5);
								if (defenceXp > 0) {
									combatXp -= defenceXp;
									player.getSkills().addXp(Skills.DEFENCE,
											defenceXp / 7.5);
								}
							}
							player.getSkills().addXp(Skills.MAGIC, combatXp);
							double hpXp = damage / 7.5;
							if (hpXp > 0)
								player.getSkills().addXp(Skills.HITPOINTS, hpXp);
						}
					}
		}

		WorldTasksManager.schedule(new WorldTask() {

			@Override
			public void run() {
				for (Hit hit : hits) {
					boolean splash = false;
					Player player = (Player) hit.getSource();
					if (player == null || !player.isRunning() || player.isDead() || player.hasFinished()
							|| target.isDead() || target.hasFinished() || target == null)
						return;
					if (hit.getDamage() > -1) {
						target.applyHit(hit); // also reduces damage if needed, pray
						// and special items affect here
					} else {
						splash = true;
						hit.setDamage(0);
					}
					doDefenceEmote(player);
					int damage = hit.getDamage() > target.getHitpoints() ? target
							.getHitpoints() : hit.getDamage();
							if ((damage >= max_hit * 0.90)
									&& (hit.getLook() == HitLook.MAGIC_DAMAGE
									|| hit.getLook() == HitLook.RANGE_DAMAGE || hit.getLook() == HitLook.MELEE_DAMAGE))
								hit.setCriticalMark();
							if (hit.getLook() == HitLook.RANGE_DAMAGE
									|| hit.getLook() == HitLook.MELEE_DAMAGE) {
								double combatXp = damage / 2.5;
								if (combatXp > 0) {
									if (hit.getLook() == HitLook.RANGE_DAMAGE) {
										if (weaponId != -1) {
											String name = ItemDefinitions
													.getItemDefinitions(weaponId)
													.getName();
											if (name.contains("(p++)")) {
												if (Utils.getRandom(8) == 0)
													target.getPoison().makePoisoned(48);
											} else if (name.contains("(p+)")) {
												if (Utils.getRandom(8) == 0)
													target.getPoison().makePoisoned(38);
											} else if (name.contains("(p)")) {
												if (Utils.getRandom(8) == 0)
													target.getPoison().makePoisoned(28);
											}
										}
									} else {
										if (weaponId != -1) {
											String name = ItemDefinitions
													.getItemDefinitions(weaponId)
													.getName();
											if (name.contains("(p++)")) {
												if (Utils.getRandom(8) == 0)
													target.getPoison().makePoisoned(68);
											} else if (name.contains("(p+)")) {
												if (Utils.getRandom(8) == 0)
													target.getPoison().makePoisoned(58);
											} else if (name.contains("(p)")) {
												if (Utils.getRandom(8) == 0)
													target.getPoison().makePoisoned(48);
											}
											if (target instanceof Player) {
												if (((Player) target).getPolDelay() >= Utils
														.currentTimeMillis())
													target.setNextGraphics(new Graphics(
															2320));
											}
										}
									}
								}
							} else if (hit.getLook() == HitLook.MAGIC_DAMAGE) {
								if (splash) {
									target.setNextGraphics(new Graphics(85, 0, 96));
									playSound(227, player, target);
								} else {
									if (mage_hit_gfx != 0) {
										target.setNextGraphics(new Graphics(
												mage_hit_gfx, 0, mage_hit_gfx == 369
												|| mage_hit_gfx == 1843 || (mage_hit_gfx > 1844 && mage_hit_gfx < 1855) ? 0
														: 96));
										if (blood_spell)
											player.heal(damage / 4);
										if (block_tele) {
											if (target instanceof Player) {
												Player targetPlayer = (Player) target;
												targetPlayer.setTeleBlockDelay((targetPlayer.getPrayer().usingPrayer(0, 17)
														|| targetPlayer.getPrayer().usingPrayer(1,7) ? 100000
																: 300000));
												targetPlayer.getPackets().sendGameMessage("You have been teleblocked.",true);
											}
										}
									}
									if (magic_sound > 0)
										playSound(magic_sound, player, target);
								}
							}
							if (max_poison_hit > 0 && Utils.getRandom(10) == 0) {
								if (!target.getPoison().isPoisoned())
									target.getPoison().makePoisoned(max_poison_hit);
							}
							if (target instanceof Player) {
								Player p2 = (Player) target;
								p2.closeInterfaces();
								if (p2.getCombatDefinitions().isAutoRelatie() && !p2.getActionManager().hasSkillWorking() && !p2.hasWalkSteps()) 
									p2.getActionManager().setAction(new PlayerCombat(player));
							} else {
								NPC n = (NPC) target;
								if (!n.isUnderCombat() || n.canBeAttackedByAutoRelatie())
									n.setTarget(player);
							}
				}
			}
		}, delay);
	}

	private int getSoundId(int weaponId, int attackStyle) {
		if (weaponId != -1) {
			String weaponName = ItemDefinitions.getItemDefinitions(weaponId).getName().toLowerCase();
			if (weaponName.contains("dart") || weaponName.contains("knife"))
				return 2707;
		}
		return -1;
	}

	private void doDefenceEmote(Player attacker) {
		target.setNextAnimationNoPriority(new Animation(Combat.getDefenceEmote(target, attacker.secondary)));//TODO proper boolean check
	}

	public int getMeleeCombatDelay(Player player, int weaponId) {
		int delay = 3;
		if (weaponId != -1) {
			final ItemDefinitions defs = ItemDefinitions.getItemDefinitions(weaponId);
			if (defs != null) {
				delay = defs.getWeaponAttackDelay();
				delay--;
			}
		}
		return delay < 1 ? 1 : delay;
	}

	@Override
	public void stop(final Player player) {
		player.setNextFaceEntity(null);
		player.needsToExitCombat = true;
	}

	private boolean checkAll(Player player) {
		if (player.isDead() || player.hasFinished() || target.isDead()
				|| target.hasFinished()) {
			return false;
		}
		if (target instanceof NPC) {
			final int slayerLevel = Combat.getSlayerLevelForNPC(((NPC) target).getDefinitions().getId());
			if (slayerLevel > player.getSkills().getLevel(
					Skills.SLAYER)) {
				player.getPackets().sendGameMessage(
						"You need a slayer level of atleast "
								+ slayerLevel + " to fight this.");
				return false;
			}
		}
		final int distanceX = player.getX() - target.getX();
		final int distanceY = player.getY() - target.getY();
		final int size = target.getSize();
		int maxDistance = 16;
		if (player.getPlane() != target.getPlane()
				|| distanceX > size + maxDistance
				|| distanceX < -1 - maxDistance
				|| distanceY > size + maxDistance
				|| distanceY < -1 - maxDistance) {
			return false;
		}
		if (player.getEquipment().getWeaponId() == 12845) {
			player.sm("The stone is too heavy to attack with!");
			return false;
		}
		if (player.getEmotesManager().getNextEmoteEnd() > Utils
				.currentTimeMillis())
			return false;
		if (player.getFreezeDelay() >= Utils.currentTimeMillis()) {
			if (player.withinDistance(target, 0))// done
				return false;
			return true;
		}
		if (target instanceof Player) {
			Player p2 = (Player) target;
			if (!player.isCanPvp() || !p2.isCanPvp())
				return false;
		} else {
			final NPC n = (NPC) target;
			if (n.isCantInteract()) {
				if (n.getId() == 17184) {// Vorago in bring him down
					Vorago rago = VoragoHandler.vorago;
					int maxCount = 20 * (VoragoHandler.getPlayersCount());
					double A = Math.floor(maxCount / 5);
					rago.bringDownCount++;
					if (player.getTemporaryAttributtes().get("siphoningRago") != null && ((boolean) player.getTemporaryAttributtes().get("siphoningRago") == false)) {
						player.getTemporaryAttributtes().put("siphoningRago", true);
						player.setNextAnimation(new Animation(20394));
						player.setNextFaceEntity(n);
					} else {
						int i;
						if (rago.bringDownCount <= A) {
							i = 1;
						} else if (rago.bringDownCount > A && rago.bringDownCount <= 2 * A) {
							i = 2;
						} else if (rago.bringDownCount > 2 * A && rago.bringDownCount <= 3 * A) {
							i = 3;
						} else if (rago.bringDownCount > 3 * A && rago.bringDownCount <= 4 * A) {
							i = 4;
						} else if (rago.bringDownCount > 4 * A && rago.bringDownCount <= 5 * A) {
							i = 5;
						} else {
							rago.isDown = false;
							VoragoCombat.sendBringHimDown(n);
							i = 6;
							for (Player p : VoragoHandler.getPlayers()) {
								p.setNextAnimation(new Animation(20394 + i));
								p.getTemporaryAttributtes().put("siphoningRago", false);
							}
						}
						player.setNextAnimation(new Animation(20394 + i));

					}

					return false;
				} else {
					return false;
				}
			}
			if (n instanceof Familiar) {
				Familiar familiar = (Familiar) n;
				if (!familiar.canAttack(target))
					return false;
			} else {
				if (!n.canBeAttackFromOutOfArea() && !MapAreas.isAtArea(n.getMapAreaNameHash(), player)) {
					return false;
				}
				if (n.getId() == 14578) {
					if (player.getEquipment().getWeaponId() != 2402	&& player.getCombatDefinitions().getAutoCastSpell() <= 0 && !hasPolyporeStaff(player)) {
						player.getPackets().sendGameMessage("I'd better wield Silverlight first.");
						return false;
					}
				} else if (n.getId() == 6222 || n.getId() == 6223
						|| n.getId() == 6225 || n.getId() == 6227) {
					if (isRanging(player) == NOT_RANGING) {
						player.getPackets().sendGameMessage(
								"I can't reach that!");
						return false;
					}
				}
			}
		}
		if (!(target instanceof NPC && ((NPC) target).isForceMultiAttacked())) {

			if (!target.isAtMultiArea() || !player.isAtMultiArea()) {
				if (player.getAttackedBy() != target
						&& player.getAttackedByDelay() > Utils
						.currentTimeMillis()) {
					return false;
				}
				if (target.getAttackedBy() != player
						&& target.getAttackedByDelay() > Utils
						.currentTimeMillis()) {
					return false;
				}
			}
		}
		final int isRanging = isRanging(player);
		final int spellId = player.getCombatDefinitions().getSpellId();
		//TODO implement new pathing system
		if (distanceX < size && distanceX > -1 && distanceY < size
				&& distanceY > -1 && !target.hasWalkSteps()) {
			player.resetWalkSteps();
			if (!player.addWalkSteps(target.getX() + size, target.getY())) {
				player.resetWalkSteps();
				if (!player.addWalkSteps(target.getX() - 1, target.getY())) {
					player.resetWalkSteps();
					if (!player.addWalkSteps(target.getX(), target.getY() + size))  {
						player.resetWalkSteps();
						if (!player.addWalkSteps(target.getX(), target.getY() - 1))
							return false;
					}
				}
			}
			return true;
		} else if (isRanging == NOT_RANGING && target.getSize() == 1
				&& spellId <= 0
				&& !hasPolyporeStaff(player)
				&& Math.abs(player.getX() - target.getX()) == 1
				&& Math.abs(player.getY() - target.getY()) == 1
				&& !target.hasWalkSteps()) {
			if (!player.addWalkSteps(target.getX(), player.getY(), 1))
				player.addWalkSteps(player.getX(), target.getY(), 1);
			return true;
		}
		maxDistance = (spellId > 0 && isRanging == IS_MAGIC_WEAPON || isRanging != NOT_RANGING || hasPolyporeStaff(player)) ? 7 : 0;
		if ((!player.clipedProjectile(target, maxDistance == 0 && !forceCheckClipAsRange(target)))
				|| distanceX > size + maxDistance
				|| distanceX < -1 - maxDistance
				|| distanceY > size + maxDistance
				|| distanceY < -1 - maxDistance) {
			if (!player.hasWalkSteps()) {
				player.resetWalkSteps();
				player.addWalkStepsInteract(target.getX(), target.getY(),
						player.getRun() ? 2 : 1, size, true);
			}
			//TODO routing
			return true;
		} else {
			player.resetWalkSteps();
		}
		if (player.getPolDelay() >= Utils.currentTimeMillis()
				&& (player.getEquipment().getWeaponId() != 15486
				&& player.getEquipment().getWeaponId() != 22207
				&& player.getEquipment().getWeaponId() != 22209
				&& player.getEquipment().getWeaponId() != 22211 && player
				.getEquipment().getWeaponId() != 22213))
			player.setPolDelay(0);
		player.getTemporaryAttributtes().put("last_target", target);
		if (target != null)
			target.getTemporaryAttributtes().put("last_attacker", player);
		if (player.getCombatDefinitions().isInstantAttack()) {
			player.getCombatDefinitions().setInstantAttack(false);
			if (player.getCombatDefinitions().getAutoCastSpell() > 0 && isRanging == IS_MAGIC_WEAPON)
				return true;
			if (player.getCombatDefinitions().isUsingSpecialAttack() && !player.secondary) {
				if (!specialExecute(player))
					return true;
				player.getActionManager().setActionDelay(0);
				final int weaponId = player.getEquipment().getWeaponId();
				final int attackStyle = player.getCombatDefinitions().getAttackStyle();
				switch(weaponId) {
				case 4153:
					player.setNextAnimation(new Animation(1667));
					player.setNextGraphics(new Graphics(340, 0, 96 << 16));
					delayNormalHit(
							weaponId,
							attackStyle,
							getMeleeHit(
									player,
									getRandomMaxHit(player, weaponId, attackStyle,
											false, true, 1.1, true)));
					break;
				}
				player.getActionManager().setActionDelay(4);
			}
			return true;
		}
		return true;
	}

	public static boolean specialExecute(Player player) {
		final int weaponId = player.getEquipment().getWeaponId();
		player.getCombatDefinitions().switchUsingSpecialAttack();
		if (weaponId == -1)
			return false;
		final ItemDefinitions defs = ItemDefinitions.getItemDefinitions(weaponId);
		if (defs == null)
			return false;
		int specAmt = defs.getSpecialAttackAmount() / 10;
		if (specAmt <= 0) {
			player.getPackets()
			.sendGameMessage(
					"This weapon has no special Attack, if you still see special bar please relogin.");
			player.getCombatDefinitions().desecreaseSpecialAttack(0);
			return false;
		}
		if (player.getCombatDefinitions().hasRingOfVigour())
			specAmt *= 0.9;
		if (player.getCombatDefinitions().getSpecialAttackPercentage() < specAmt) {
			player.getPackets().sendGameMessage(
					"You don't have enough power left.");
			player.getCombatDefinitions().desecreaseSpecialAttack(0);
			return false;
		}
		player.getCombatDefinitions().desecreaseSpecialAttack(specAmt);
		return true;
	}

	public static final int NOT_RANGING = 0, INVALID_AMMO = 1, RANGING = 2, OUT_OF_AMMO = 3, IS_MAGIC_WEAPON = 4;

	public static final int isRanging(Player player) {
		int weaponId = (!player.secondary ? player.getEquipment().getWeaponId() : player.getEquipment().getShieldId());
		if (weaponId != -1 && ItemDefinitions.getItemDefinitions(weaponId).isShield()) {
			player.secondary = !player.secondary;
			weaponId = (!player.secondary ? player.getEquipment().getWeaponId() : player.getEquipment().getShieldId());
		}
		if (weaponId == -1) {
			player.secondary = !player.secondary;
			weaponId = (!player.secondary ? player.getEquipment().getWeaponId() : player.getEquipment().getShieldId());
			if (weaponId == -1)
				return NOT_RANGING;
		}
		if (weaponId == 20171 || weaponId == 25202 || weaponId == 21365 || weaponId == 19830 || weaponId == 24474)
			return RANGING;
		final ItemDefinitions defs = ItemDefinitions.getItemDefinitions(weaponId);
		if (defs == null)
			return NOT_RANGING;
		if (defs.isMagicWeapon())
			return IS_MAGIC_WEAPON;
		if (!defs.isRangedWeapon())
			return NOT_RANGING;
		if (defs.isRangedWeaponDoesNotRequireAmmunitionToFunction())
			return RANGING;
		final int ammoId = player.getEquipment().getAmmoId();
		if (ammoId == -1)
			return OUT_OF_AMMO;
		switch (weaponId) {
		case 15241: // Hand cannon
			switch (ammoId) {
			case 15243://hand cannon shot
				return RANGING;
			default:
				return INVALID_AMMO;
			}
		case 839: // longbow
		case 841: // shortbow
			switch (ammoId) {
			case 882://bronze
			case 883://bronze p
			case 5616://bronze p+
			case 5622://bronze p++
			case 884://iron
			case 885://iron p
			case 5617://iron p+
			case 5623://iron p++
				return RANGING;
			default:
				return INVALID_AMMO;
			}
		case 843: // oak longbow
		case 845: // oak shortbow
			switch (ammoId) {
			case 882://bronze
			case 883://bronze p
			case 5616://bronze p+
			case 5622://bronze p++
			case 884://iron
			case 885://iron p
			case 5617://iron p+
			case 5623://iron p++
			case 886://steel
			case 887://steel p
			case 5618://steel p+
			case 5624://steel p++
				return RANGING;
			default:
				return INVALID_AMMO;
			}
		case 847: // willow longbow
		case 849: // willow shortbow
		case 13541: // Willow composite bow
			switch (ammoId) {
			case 882://bronze
			case 883://bronze p
			case 5616://bronze p+
			case 5622://bronze p++
			case 884://iron
			case 885://iron p
			case 5617://iron p+
			case 5623://iron p++
			case 886://steel
			case 887://steel p
			case 5618://steel p+
			case 5624://steel p++
			case 888://mithril
			case 889://mithril p
			case 5619://mithril p+
			case 5625://mithril p++
			case 7552://mithril
			case 7553://mithril
				return RANGING;
			default:
				return INVALID_AMMO;
			}
		case 851: // maple longbow
		case 853: // maple shortbow
		case 18331: // Maple longbow (sighted)
			switch (ammoId) {
			case 882://bronze
			case 883://bronze p
			case 5616://bronze p+
			case 5622://bronze p++
			case 884://iron
			case 885://iron p
			case 5617://iron p+
			case 5623://iron p++
			case 886://steel
			case 887://steel p
			case 5618://steel p+
			case 5624://steel p++
			case 888://mithril
			case 889://mithril p
			case 5619://mithril p+
			case 5625://mithril p++
			case 7552://mithril
			case 7553://mithril
			case 890://adamant
			case 891://adamant p
			case 5620://adamant p+
			case 5626://adamant p++
				return RANGING;
			default:
				return INVALID_AMMO;
			}
		case 2883:// ogre bow
			switch (ammoId) {
			case 2866: // ogre arrow
				return RANGING;
			default:
				return INVALID_AMMO;
			}
		case 4827:// Comp ogre bow
			switch (ammoId) {
			case 2866:// ogre arrow
			case 4773:// bronze brutal
			case 4778:// iron brutal
			case 4783:// steel brutal
			case 4788:// black brutal
			case 4793:// mithril brutal
			case 4798:// adamant brutal
			case 4803:// rune brutal
				return RANGING;
			default:
				return INVALID_AMMO;
			}
		case 855:// yew longbow
		case 857:// yew shortbow
		case 10281:// Yew composite bow
		case 14121:// Sacred clay bow
		case 859:// magic longbow
		case 861:// magic shortbow
		case 10284:// Magic composite bow
		case 18332:// Magic longbow (sighted)
		case 6724:// seercull
			switch (ammoId) {
			case 882://bronze
			case 883://bronze p
			case 5616://bronze p+
			case 5622://bronze p++
			case 884://iron
			case 885://iron p
			case 5617://iron p+
			case 5623://iron p++
			case 886://steel
			case 887://steel p
			case 5618://steel p+
			case 5624://steel p++
			case 888://mithril
			case 889://mithril p
			case 5619://mithril p+
			case 5625://mithril p++
			case 7552://mithril
			case 7553://mithril
			case 890://adamant
			case 891://adamant p
			case 5620://adamant p+
			case 5626://adamant p++
			case 892://rune
			case 893://rune p
			case 5621://rune p+
			case 5627://rune p++
			case 4160://broad arrows
				return RANGING;
			default:
				return INVALID_AMMO;
			}
		case 11235:// dark bows
		case 15701:// dark bows
		case 15702:// dark bows
		case 15703:// dark bows
		case 15704:// dark bows
		case 24456://decimation
			switch (ammoId) {
			case 882://bronze
			case 883://bronze p
			case 5616://bronze p+
			case 5622://bronze p++
			case 884://iron
			case 885://iron p
			case 5617://iron p+
			case 5623://iron p++
			case 886://steel
			case 887://steel p
			case 5618://steel p+
			case 5624://steel p++
			case 888://mithril
			case 889://mithril p
			case 5619://mithril p+
			case 5625://mithril p++
			case 7552://mithril
			case 7553://mithril
			case 890://adamant
			case 891://adamant p
			case 5620://adamant p+
			case 5626://adamant p++
			case 892://rune
			case 893://rune p
			case 5621://rune p+
			case 5627://rune p++
			case 11212://dragon
			case 11227://dragon p
			case 11228://dragon p+
			case 11229://dragon p++
			case 4160://broad arrows
				return RANGING;
			default:
				return INVALID_AMMO;
			}
		case 31733://regular noxious longbow
		case 31734://regular noxious longbow
		case 31735://regular noxious longbow
		case 33336://barrows noxious longbow
		case 33337://barrows noxious longbow
		case 33402://shadow noxious longbow
		case 33403://shadow noxious longbow
		case 33468://third-age noxious longbow
		case 33469://third-age noxious longbow
			switch (ammoId) {
			case 882://bronze
			case 883://bronze p
			case 5616://bronze p+
			case 5622://bronze p++
			case 884://iron
			case 885://iron p
			case 5617://iron p+
			case 5623://iron p++
			case 886://steel
			case 887://steel p
			case 5618://steel p+
			case 5624://steel p++
			case 888://mithril
			case 889://mithril p
			case 5619://mithril p+
			case 5625://mithril p++
			case 7552://mithril
			case 7553://mithril
			case 890://adamant
			case 891://adamant p
			case 5620://adamant p+
			case 5626://adamant p++
			case 892://rune
			case 893://rune p
			case 5621://rune p+
			case 5627://rune p++
			case 11212://dragon
			case 11227://dragon p
			case 11228://dragon p+
			case 11229://dragon p++
			case 4160://broad arrows
			case 34235://wild arrows
			case 31737://araxyte arrows
				return RANGING;
			default:
				return INVALID_AMMO;
			}
		case 34158://third-age noxious longbow
			switch (ammoId) {
			case 882://bronze
			case 883://bronze p
			case 5616://bronze p+
			case 5622://bronze p++
			case 884://iron
			case 885://iron p
			case 5617://iron p+
			case 5623://iron p++
			case 886://steel
			case 887://steel p
			case 5618://steel p+
			case 5624://steel p++
			case 888://mithril
			case 889://mithril p
			case 5619://mithril p+
			case 5625://mithril p++
			case 7552://mithril
			case 7553://mithril
			case 890://adamant
			case 891://adamant p
			case 5620://adamant p+
			case 5626://adamant p++
			case 892://rune
			case 893://rune p
			case 5621://rune p+
			case 5627://rune p++
			case 11212://dragon
			case 11227://dragon p
			case 11228://dragon p+
			case 11229://dragon p++
			case 4160://broad arrows
			case 34235://wild arrows
				return RANGING;
			default:
				return INVALID_AMMO;
			}
		case 19143: // saradomin bow
			switch (ammoId) {
			case 19152: // saradomin arrow
				return RANGING;
			default:
				return INVALID_AMMO;
			}
		case 19146: // guthix bow
			switch (ammoId) {
			case 19157: // guthix arrow
				return RANGING;
			default:
				return INVALID_AMMO;
			}
		case 19149: // zamorak bow
			switch (ammoId) {
			case 19162: // zamorak arrow
				return RANGING;
			default:
				return INVALID_AMMO;
			}
		case 24338: // Royal crossbow
			switch (ammoId) {
			case 24336: // royal bolts
				return RANGING;
			default:
				return INVALID_AMMO;
			}
		case 24303: // Coral crossbow
			switch (ammoId) {
			case 24304: // Coral bolts
				return RANGING;
			default:
				return INVALID_AMMO;
			}
		case 4734: // karil crossbow
		case 25895://karils pistols
		case 25918://karils pistols
			switch (ammoId) {
			case 4740: // bolt rack
				return RANGING;
			default:
				return INVALID_AMMO;
			}
		case 10156: // hunters crossbow
			switch (ammoId) {
			case 10158: // Kebbit bolts
			case 10159: // Long kebbit bolts
				return RANGING;
			default:
				return INVALID_AMMO;
			}
		case 8880: // Dorgeshuun c'bow
			switch (ammoId) {
			case 877: // bronze bolts
			case 9140: // iron bolts
			case 8882: // bone bolts
				return RANGING;
			default:
				return INVALID_AMMO;
			}
		case 14684: // zanik crossbow
			switch (ammoId) {
			case 877: // bronze bolts
			case 9140: // iron bolts
			case 9141: // steel bolts
			case 13083: // black bolts
			case 9142:// mithril bolts
			case 9143: // adam bolts
			case 9145: // silver bolts
			case 8882: // bone bolts
				return RANGING;
			default:
				return INVALID_AMMO;
			}
		case 767: // phoenix crossbow
		case 837: // crossbow
			switch (ammoId) {
			case 877: // bronze bolts
				return RANGING;
			default:
				return INVALID_AMMO;
			}
		case 9174: // bronze crossbow
		case 25881:
			switch (ammoId) {
			case 877: // bronze bolts
			case 9236: // Opal bolts (e)
				return RANGING;
			default:
				return INVALID_AMMO;
			}
		case 9176: // blurite crossbow
			switch (ammoId) {
			case 877: // bronze bolts
			case 9140: // iron bolts
			case 9141: // steel bolts
			case 13083: // black bolts
			case 9236: // Opal bolts (e)
			case 9238: // Pearl bolts (e)
			case 9239: // Topaz bolts (e)
			case 9139: // Blurite bolts
			case 9237: // Jade bolts (e)
				return RANGING;
			default:
				return INVALID_AMMO;
			}
		case 9177: // iron crossbow
		case 25883:
			switch (ammoId) {
			case 877: // bronze bolts
			case 9140: // iron bolts
			case 9236: // Opal bolts (e)
			case 9238: // Pearl bolts (e)
				return RANGING;
			default:
				return INVALID_AMMO;
			}
		case 9179: // steel crossbow
		case 25885:
			switch (ammoId) {
			case 877: // bronze bolts
			case 9140: // iron bolts
			case 9141: // steel bolts
			case 9236: // Opal bolts (e)
			case 9238: // Pearl bolts (e)
			case 9239: // Topaz bolts (e)
				return RANGING;
			default:
				return INVALID_AMMO;
			}
		case 13081: // black crossbow
		case 33498:
			switch (ammoId) {
			case 877: // bronze bolts
			case 9140: // iron bolts
			case 9141: // steel bolts
			case 13083: // black bolts
			case 9236: // Opal bolts (e)
			case 9238: // Pearl bolts (e)
			case 9239: // Topaz bolts (e)
				return RANGING;
			default:
				return INVALID_AMMO;
			}
		case 9181: // Mith crossbow
		case 25887:
			switch (ammoId) {
			case 877: // bronze bolts
			case 9140: // iron bolts
			case 9141: // steel bolts
			case 13083: // black bolts
			case 9142:// mithril bolts
			case 9145: // silver bolts
			case 9236: // Opal bolts (e)
			case 9238: // Pearl bolts (e)
			case 9239: // Topaz bolts (e)
			case 9240: // Sapphire bolts (e)
			case 9241: // Emerald bolts (e)
				return RANGING;
			default:
				return INVALID_AMMO;
			}
		case 9183: // adam c bow
		case 25889:
			switch (ammoId) {
			case 877:// bronze bolts
			case 9140:// iron bolts
			case 9141:// steel bolts
			case 13083:// black bolts
			case 9142:// mithril bolts
			case 9143:// adam bolts
			case 9145:// silver bolts wtf
			case 9236:// Opal bolts (e)
			case 9238:// Pearl bolts (e)
			case 9239:// Topaz bolts (e)
			case 9240:// Sapphire bolts (e)
			case 9241:// Emerald bolts (e)
			case 9242:// Ruby bolts (e)
			case 9243:// Diamond bolts (e)
			case 13280://broad bolts
				return RANGING;
			default:
				return INVALID_AMMO;
			}
		case 9185:// rune c bow
		case 25891:
		case 25955://off-hand chaotic crossbow
		case 18357://chaotic crossbow
		case 34087://lucky chaotic crossbow
		case 34089://lucky off-hand chaotic crossbow
		case 25995://off-hand chaotic crossbow
		case 25894://off-hand dragon crossbow
		case 27065://off-hand dragon crossbow
		case 25917://dragon crossbow
		case 27066://dragon crossbow
		case 25037://armadyl crossbow
		case 25038://armadyl crossbow
		case 25039://armadyl crossbow
		case 30818://lucky armadyl crossbow
		case 30823://lucky armadyl crossbow
			switch (ammoId) {
			case 877: // bronze bolts
			case 9140: // iron bolts
			case 9141: // steel bolts
			case 13083: // black bolts
			case 9142:// mithril bolts
			case 9143: // adam bolts
			case 9144: // rune bolts
			case 9341: //dragonbolts
			case 9342: //onyx bolts
			case 9339: //ruby bolts
			case 9338: //emerald bolts
			case 9337: //sapphire bolts
			case 9336: //topaz bolts
			case 879: //opal bolts
			case 880: //pearl bolts
			case 9340: //diamond bolts
			case 9145: // silver bolts wtf
			case 9236: // Opal bolts (e)
			case 9238: // Pearl bolts (e)
			case 9239: // Topaz bolts (e)
			case 9240: // Sapphire bolts (e)
			case 9241: // Emerald bolts (e)
			case 9242: // Ruby bolts (e)
			case 9243: // Diamond bolts (e)
			case 9244: // Dragon bolts (e)
			case 9245: // Onyx bolts (e)
			case 24116: //Bakriminel bolts
			case 13280://broad bolts
				return RANGING;
			default:
				return INVALID_AMMO;
			}
		case 28437://ascension crossbow
		case 28438://ascension crossbow
		case 28439://ascension crossbow
		case 28441://off-hand ascension crossbow
		case 28442://off-hand ascension crossbow
		case 28443://off-hand ascension crossbow
		case 33318://barrows ascension crossbow
		case 33319://barrows ascension crossbow
		case 33321://off-hand barrows ascension crossbow
		case 33322://off-hand barrows ascension crossbow
		case 33384://shadow ascension crossbow
		case 33385://shadow ascension crossbow
		case 33387://off-hand shadow ascension crossbow
		case 33388://off-hand shadow ascension crossbow
		case 33450://third-age ascension crossbow
		case 33451://third-age ascension crossbow
		case 33453://off-hand third-age ascension crossbow
		case 33454://off-hand third-age ascension crossbow
			switch (ammoId) {
			case 877: // bronze bolts
			case 9140: // iron bolts
			case 9141: // steel bolts
			case 13083: // black bolts
			case 9142:// mithril bolts
			case 9143: // adam bolts
			case 9144: // rune bolts
			case 9341: //dragonbolts
			case 9342: //onyx bolts
			case 9339: //ruby bolts
			case 9338: //emerald bolts
			case 9337: //sapphire bolts
			case 9336: //topaz bolts
			case 879: //opal bolts
			case 880: //pearl bolts
			case 9340: //diamond bolts
			case 9145: // silver bolts wtf
			case 9236: // Opal bolts (e)
			case 9238: // Pearl bolts (e)
			case 9239: // Topaz bolts (e)
			case 9240: // Sapphire bolts (e)
			case 9241: // Emerald bolts (e)
			case 9242: // Ruby bolts (e)
			case 9243: // Diamond bolts (e)
			case 9244: // Dragon bolts (e)
			case 9245: // Onyx bolts (e)
			case 24116: //Bakriminel bolts
			case 13280://broad bolts
			case 28465://ascension bolts
				return RANGING;
			default:
				return INVALID_AMMO;
			}
		default:
			return NOT_RANGING;
		}
	}

	/**
	 * Checks if the player is wielding polypore staff.
	 * @param player The player.
	 * @return {@code True} if so.
	 */
	private static boolean hasPolyporeStaff(Player player) {
		int weaponId = player.getEquipment().getWeaponId();
		return weaponId == 22494 || weaponId == 22496;
	}

	public Entity getTarget() {
		return target;
	}

}
