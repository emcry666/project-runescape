package com.rs.game.player.content;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.item.Item;
import com.rs.game.npc.NPC;
import com.rs.game.player.Equipment;
import com.rs.game.player.Player;
import com.rs.game.player.actions.PlayerCombat;
import com.rs.utils.Utils;

public final class Combat {

	public static final int MELEE_TYPE = 0, RANGE_TYPE = 1, MAGIC_TYPE = 2, ALL_TYPE = 3;


	public static final double WEAKNESS_MULTIPLIER_STYLE = 0.7, WEAKNESS_MULTIPLIER_WEAK = 0.65,
			WEAKNESS_MULTIPLIER_NEUTRAL = 0.55, WEAKNESS_MULTIPLIER_STRONG = 0.45;

	public static final int NONE_STYLE = 0, ARROW_STYLE = 8, BOLT_STYLE = 9, THROWN_STYLE = 10;

	public static final int TYPE_AIR = 1, TYPE_WATER = 2, TYPE_EARTH = 3, TYPE_FIRE = 4;

	public static double getWeaknessMultiplier(double totalArmor, double weakArmor, double neutralArmor,
			double strongArmor) {
		return totalArmor == 0 ? WEAKNESS_MULTIPLIER_NEUTRAL
				: ((weakArmor * WEAKNESS_MULTIPLIER_WEAK + neutralArmor * WEAKNESS_MULTIPLIER_NEUTRAL
						+ strongArmor * WEAKNESS_MULTIPLIER_STRONG) / totalArmor);
	}


	public static boolean hasAntiDragProtection(Entity target) {
		if (target instanceof NPC)
			return false;
		Player p2 = (Player) target;
		int shieldId = p2.getEquipment().getShieldId();
		return shieldId == 1540 || shieldId == 11283 || shieldId == 11284;
	}

	public static boolean hasAntiDragProtection(Entity target, boolean increment) {
		if (target == null || !(target instanceof Player))
			return false;
		final Player player = (Player) target;
		final int shieldId = player.getEquipment().getShieldId();
		if (shieldId != -1) {
			final ItemDefinitions defs = ItemDefinitions
					.getItemDefinitions(shieldId);
			if (defs != null) {
				if (defs.getName().toLowerCase().contains("dragonfire shield")) {
					if (increment) {
						player.setNextAnimation(new Animation(6695));
						player.setNextGraphics(new Graphics(1164));
					}
					return true;
				}
			}
		}
		return false;
	}

	public static int getSlayerLevelForNPC(int id) {
		switch (id) {
		case 9463:
			return 93;
		default:
			return 0;
		}
	}

	public static boolean hasDarkbow(Player player) {
		int weaponId = player.getEquipment().getWeaponId();
		return (weaponId == 11235 || weaponId >= 15701 && weaponId <= 15704);
	}

	public static boolean hasAscensionCrossbow(Player player, boolean mainHand) {
		Item item = player.getEquipment().getItem(mainHand ? Equipment.SLOT_WEAPON : Equipment.SLOT_SHIELD);
		if (item != null)
			return item.getName().contains(mainHand ? "Ascension crossbow" : "Off-hand Ascension crossbow");
		return false;
	}
	
	public static int getDefenceEmote(Entity target) {
		return getDefenceEmote(target, true);
	}

	public static int getDefenceEmote(Entity target, boolean secondary) {
		if (target instanceof NPC) {
			NPC n = (NPC) target;
			return n.getCombatDefinitions().getDefenceEmote();
		} else {
			Player p = (Player) target;
			final Item weapon = p.getEquipment().getItem(Equipment.SLOT_WEAPON), shield = p
					.getEquipment().getItem(Equipment.SLOT_SHIELD);
			if (shield == null) {
				if (weapon != null)
					return weapon.getDefinitions().getCombatDefenceEmote(PlayerCombat.LEGACY);
				return 424;
			} else {
				if (!secondary) {
					if (weapon == null)
						return shield.getDefinitions().getCombatDefenceEmote(PlayerCombat.LEGACY);
					else
						return weapon.getDefinitions().getCombatDefenceEmote(PlayerCombat.LEGACY);
				}
				return shield.getDefinitions().getCombatDefenceEmote(PlayerCombat.LEGACY);
			}
		}
	}


	public static boolean rollHit(double att, double def) {
		if (att < 0) // wont happen unless low att lv plus negative bonus
			return false;
		if (def < 0) // wont happen unless low def lv plus negative bonus
			return true;
		return Utils.random((int) (att + def)) >= def;
	}

	private Combat() {
	}


	public static boolean hasDragonFire(Entity target) {
		if (target == null || !(target instanceof Player))
			return false;
		final Player player = (Player) target;
		return hasAntiDragProtection(player, false);
	}

}
