package com.rs.game.player.content;

import java.util.ArrayList;
import java.util.TimerTask;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.engine.GameEngine;
import com.rs.game.Animation;
import com.rs.game.Graphics;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.minigames.clanwars.FfaZone;
import com.rs.game.minigames.clanwars.RequestController;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.content.stealingcreations.StealingCreationController;
import com.rs.game.player.controlers.Kalaboss;
import com.rs.game.player.controlers.Wilderness;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

/*
 * content package used for static stuff
 */
public class Magic {

	/*if(!(player.getControlerManager().getControler() instanceof Wilderness)) {
		if (player.isLegendDonator()) {
			return true;
		}*/
	
	public static final int MAGIC_TELEPORT = 0, ITEM_TELEPORT = 1,
			OBJECT_TELEPORT = 2;

	public static final int AIR_RUNE = 556, WATER_RUNE = 555, EARTH_RUNE = 557, FIRE_RUNE = 554, MIND_RUNE = 558, BODY_RUNE = 559, 
			NATURE_RUNE = 561, CHAOS_RUNE = 562, DEATH_RUNE = 560, BLOOD_RUNE = 565, SOUL_RUNE = 566, ASTRAL_RUNE = 9075, LAW_RUNE = 563, STEAM_RUNE = 4694,
			MIST_RUNE = 4695, DUST_RUNE = 4696, SMOKE_RUNE = 4697, MUD_RUNE = 4698, LAVA_RUNE = 4699, ARMADYL_RUNE = 21773, ELEMENTAL_RUNE = 12850, 
			CATALYTIC_RUNE = 12851, COSMIC_RUNE = 564;


	public static int getRuneForId(int runeId) {
		if (runeId == AIR_RUNE || runeId == WATER_RUNE || runeId == EARTH_RUNE || runeId == FIRE_RUNE)
			return ELEMENTAL_RUNE;
		else if (runeId == DEATH_RUNE || runeId == MIND_RUNE || runeId == CHAOS_RUNE || runeId == BLOOD_RUNE || runeId == BODY_RUNE || runeId == NATURE_RUNE || runeId == ASTRAL_RUNE || runeId == SOUL_RUNE || runeId == LAW_RUNE)
			return CATALYTIC_RUNE;
		return -1;
	}

	
		public static final boolean hasInfiniteRunes(int runeId, int weaponId,
				int shieldId, Player player) {
			if(!(player.getControlerManager().getControler() instanceof Wilderness)) {
				if (player.isALegendDonator()) {
					return true;
				}
			}
			
			if (runeId == AIR_RUNE) {
				if (weaponId == 1381 || weaponId == 1405 ||  weaponId == 21777 || weaponId == 1397) // air
					// staff
					return true;
			} else if (runeId == WATER_RUNE) {
				if (weaponId == 1383 || shieldId == 18346 || weaponId == 1395 
						|| weaponId == 1403
						|| weaponId == 6562 || weaponId == 6563
						|| weaponId == 11736) // water staff
					return true;
			} else if (runeId == EARTH_RUNE) {
				if (weaponId == 1385 || weaponId == 1399 ||
						weaponId == 1407 || weaponId == 3053
						|| weaponId == 6562 || weaponId == 6563) // earth staff
					return true;
			} else if (runeId == FIRE_RUNE) {
				if (weaponId == 1387 || weaponId == 1393 || weaponId == 1401 || weaponId == 3053
						|| weaponId == 11736) // fire staff
					return true;
			}
			return false;
		}

	public static boolean hasSpecialRunes(Player player, int runeId, int amountRequired) {
		if (player.getControlerManager().getControler() instanceof StealingCreationController) {
			if (player.getInventory().containsItem(ELEMENTAL_RUNE, amountRequired)) {
				if (runeId == AIR_RUNE || runeId == WATER_RUNE || runeId == EARTH_RUNE || runeId == FIRE_RUNE)
					return true;
			}
			if (player.getInventory().containsItem(CATALYTIC_RUNE, amountRequired)) {
				if (runeId == MIND_RUNE || runeId == CHAOS_RUNE || runeId == DEATH_RUNE || runeId == BLOOD_RUNE || runeId == BODY_RUNE || runeId == NATURE_RUNE || runeId == ASTRAL_RUNE || runeId == SOUL_RUNE || runeId == LAW_RUNE)
					return true;
			}
		}
		return false;
	}

	public static final boolean checkCombatSpell(Player player, int spellId,
			int set, boolean delete) {
		if (spellId == 65535)
			return true;
		if (spellId == 65536)
			return true;
		switch (player.getCombatDefinitions().getSpellBook()) {
		case 193:
			switch (spellId) {
			case 28:
				if (!checkSpellRequirements(player, 50, delete, CHAOS_RUNE, 2,
						DEATH_RUNE, 2, FIRE_RUNE, 1, AIR_RUNE, 1))
					return false;
				break;
			case 32:
				if (!checkSpellRequirements(player, 52, delete, CHAOS_RUNE, 2,
						DEATH_RUNE, 2, AIR_RUNE, 1, SOUL_RUNE, 1))
					return false;
				break;
			case 24:
				if (!checkSpellRequirements(player, 56, delete, CHAOS_RUNE, 2,
						DEATH_RUNE, 2, BLOOD_RUNE, 1))
					return false;
				break;
			case 20:
				if (!checkSpellRequirements(player, 58, delete, CHAOS_RUNE, 2,
						DEATH_RUNE, 2, WATER_RUNE, 2))
					return false;
				break;
			case 30:
				if (!checkSpellRequirements(player, 62, delete, CHAOS_RUNE, 4,
						DEATH_RUNE, 2, FIRE_RUNE, 2, AIR_RUNE, 2))
					return false;
				break;
			case 34:
				if (!checkSpellRequirements(player, 64, delete, CHAOS_RUNE, 4,
						DEATH_RUNE, 2, AIR_RUNE, 1, SOUL_RUNE, 2))
					return false;
				break;
			case 26:
				if (!checkSpellRequirements(player, 68, delete, CHAOS_RUNE, 4,
						DEATH_RUNE, 2, BLOOD_RUNE, 2))
					return false;
				break;
			case 22:
				if (!checkSpellRequirements(player, 70, delete, CHAOS_RUNE, 4,
						DEATH_RUNE, 2, WATER_RUNE, 4))
					return false;
				break;
			case 29:
				if (!checkSpellRequirements(player, 74, delete, DEATH_RUNE, 2,
						BLOOD_RUNE, 2, FIRE_RUNE, 2, AIR_RUNE, 2))
					return false;
				break;
			case 33:
				if (!checkSpellRequirements(player, 76, delete, DEATH_RUNE, 2,
						BLOOD_RUNE, 2, AIR_RUNE, 2, SOUL_RUNE, 2))
					return false;
				break;
			case 25:
				if (!checkSpellRequirements(player, 80, delete, DEATH_RUNE, 2,
						BLOOD_RUNE, 4))
					return false;
				break;
			case 21:
				if (!checkSpellRequirements(player, 82, delete, DEATH_RUNE, 2,
						BLOOD_RUNE, 2, WATER_RUNE, 3))
					return false;
				break;
			case 31:
				if (!checkSpellRequirements(player, 86, delete, DEATH_RUNE, 4,
						BLOOD_RUNE, 2, FIRE_RUNE, 4, AIR_RUNE, 4))
					return false;
				break;
			case 35:
				if (!checkSpellRequirements(player, 88, delete, DEATH_RUNE, 4,
						BLOOD_RUNE, 2, AIR_RUNE, 4, SOUL_RUNE, 3))
					return false;
				break;
			case 27:
				if (!checkSpellRequirements(player, 92, delete, DEATH_RUNE, 4,
						BLOOD_RUNE, 4, SOUL_RUNE, 1))
					return false;
				break;
			case 23:
				if (!checkSpellRequirements(player, 94, delete, DEATH_RUNE, 4,
						BLOOD_RUNE, 2, WATER_RUNE, 6))
					return false;
				break;
			case 36: //Miasmic rush.
				if (!checkSpellRequirements(player, 61, delete, CHAOS_RUNE, 2, EARTH_RUNE, 1, SOUL_RUNE, 1)) {
					return false;
				}
				int weaponId = player.getEquipment().getWeaponId();
				if (weaponId != 13867 && weaponId != 13869 && weaponId != 13941 && weaponId != 13943 && !player.isAExtremeDonator()) {
					player.getPackets().sendGameMessage("You need a Zuriel's staff to cast this spell.");
					player.getPackets().sendGameMessage("Extreme donators can cast Miasmic spells without Zuriel's staff.");
					return false;
				}
				break;
			case 38: //Miasmic burst.
				if (!checkSpellRequirements(player, 73, delete, CHAOS_RUNE, 4, EARTH_RUNE, 2, SOUL_RUNE, 2)) {
					return false;
				}
				weaponId = player.getEquipment().getWeaponId();
				if (weaponId != 13867 && weaponId != 13869 && weaponId != 13941 && weaponId != 13943 && !player.isAExtremeDonator()) {
					player.getPackets().sendGameMessage("You need a Zuriel's staff to cast this spell.");
					player.getPackets().sendGameMessage("Extreme donators can cast Miasmic spells without Zuriel's staff.");
					return false;
				}
				break;
			case 37: //Miasmic blitz.
				if (!checkSpellRequirements(player, 85, delete, BLOOD_RUNE, 2, EARTH_RUNE, 3, SOUL_RUNE, 3)) {
					return false;
				}
				weaponId = player.getEquipment().getWeaponId();
				if (weaponId != 13867 && weaponId != 13869 && weaponId != 13941 && weaponId != 13943 && !player.isAExtremeDonator()) {
					player.getPackets().sendGameMessage("You need a Zuriel's staff to cast this spell.");
					player.getPackets().sendGameMessage("Extreme donators can cast Miasmic spells without Zuriel's staff.");
					return false;
				}
				break;
			case 39: //Miasmic barrage.
				if (!checkSpellRequirements(player, 97, delete, BLOOD_RUNE, 4, EARTH_RUNE, 4, SOUL_RUNE, 4)) {
					return false;
				}
				weaponId = player.getEquipment().getWeaponId();
				if (weaponId != 13867 && weaponId != 13869 && weaponId != 13941 && weaponId != 13943 && !player.isAExtremeDonator()) {
					player.getPackets().sendGameMessage("You need a Zuriel's staff to cast this spell.");
					player.getPackets().sendGameMessage("Extreme donators can cast Miasmic spells without Zuriel's staff.");
					return false;
				}
				break;
			default:
				return false;
			}
			break;
		case 192:
			switch (spellId) {
			case 25:
				if (!checkSpellRequirements(player, 1, delete, AIR_RUNE, 1,
						MIND_RUNE, 1))
					return false;
				break;
			case 28:
				if (!checkSpellRequirements(player, 5, delete, WATER_RUNE, 1,
						AIR_RUNE, 1, MIND_RUNE, 1))
					return false;
				break;
			case 30:
				if (!checkSpellRequirements(player, 9, delete, EARTH_RUNE, 2,
						AIR_RUNE, 1, MIND_RUNE, 1))
					return false;
				break;
			case 32:
				if (!checkSpellRequirements(player, 13, delete, FIRE_RUNE, 3,
						AIR_RUNE, 2, MIND_RUNE, 1))
					return false;
				break;
			case 34: // air bolt
				if (!checkSpellRequirements(player, 17, delete, AIR_RUNE, 2,
						CHAOS_RUNE, 1))
					return false;
				break;
			case 36:// bind
				if (!checkSpellRequirements(player, 20, delete, EARTH_RUNE, 3,
						WATER_RUNE, 3, NATURE_RUNE, 2))
					return false;
				break;
			case 55: // snare
				if (!checkSpellRequirements(player, 50, delete, EARTH_RUNE, 4,
						WATER_RUNE, 4, NATURE_RUNE, 3))
					return false;
				break;
			case 81:// entangle
				if (!checkSpellRequirements(player, 79, delete, EARTH_RUNE, 5,
						WATER_RUNE, 5, NATURE_RUNE, 4))
					return false;
				break;
			case 39: // water bolt
				if (!checkSpellRequirements(player, 23, delete, WATER_RUNE, 2,
						AIR_RUNE, 2, CHAOS_RUNE, 1))
					return false;
				break;
			case 42: // earth bolt
				if (!checkSpellRequirements(player, 29, delete, EARTH_RUNE, 3,
						AIR_RUNE, 2, CHAOS_RUNE, 1))
					return false;
				break;
			case 45: // fire bolt
				if (!checkSpellRequirements(player, 35, delete, FIRE_RUNE, 4,
						AIR_RUNE, 3, CHAOS_RUNE, 1))
					return false;
				break;
			case 49: // air blast
				if (!checkSpellRequirements(player, 41, delete, AIR_RUNE, 3,
						DEATH_RUNE, 1))
					return false;
				break;
			case 52: // water blast
				if (!checkSpellRequirements(player, 47, delete, WATER_RUNE, 3,
						AIR_RUNE, 3, DEATH_RUNE, 1))
					return false;
				break;
			case 58: // earth blast
				if (!checkSpellRequirements(player, 53, delete, EARTH_RUNE, 4,
						AIR_RUNE, 3, DEATH_RUNE, 1))
					return false;
				break;
			case 63: // fire blast
				if (!checkSpellRequirements(player, 59, delete, FIRE_RUNE, 5,
						AIR_RUNE, 4, DEATH_RUNE, 1))
					return false;
				break;
			case 70: // air wave
				if (!checkSpellRequirements(player, 62, delete, AIR_RUNE, 5,
						BLOOD_RUNE, 1))
					return false;
				break;
			case 73: // water wave
				if (!checkSpellRequirements(player, 65, delete, WATER_RUNE, 7,
						AIR_RUNE, 5, BLOOD_RUNE, 1))
					return false;
				break;
			case 77: // earth wave
				if (!checkSpellRequirements(player, 70, delete, EARTH_RUNE, 7,
						AIR_RUNE, 5, BLOOD_RUNE, 1))
					return false;
				break;
			case 80: // fire wave
				if (!checkSpellRequirements(player, 75, delete, FIRE_RUNE, 7,
						AIR_RUNE, 5, BLOOD_RUNE, 1))
					return false;
				break;
			case 84:
				if (!checkSpellRequirements(player, 81, delete, AIR_RUNE, 7,
						DEATH_RUNE, 1, BLOOD_RUNE, 1))
					return false;
				break;
			case 87:
				if (!checkSpellRequirements(player, 85, delete, WATER_RUNE, 10,
						AIR_RUNE, 7, DEATH_RUNE, 1, BLOOD_RUNE, 1))
					return false;
				break;
			case 89:
				if (!checkSpellRequirements(player, 85, delete, EARTH_RUNE, 10,
						AIR_RUNE, 7, DEATH_RUNE, 1, BLOOD_RUNE, 1))
					return false;
				break;
			case 66: // Sara Strike
				if (player.getEquipment().getWeaponId() != 2415 && player.getEquipment().getWeaponId() != 29952) {
					player.getPackets()
					.sendGameMessage(
							"You need to be equipping a Saradomin staff or Staff of the Dead to cast this spell.",
							true);
					return false;
				}
				if (!checkSpellRequirements(player, 60, delete, AIR_RUNE, 4,
						FIRE_RUNE, 1, BLOOD_RUNE, 2))
					return false;
				break;
			case 67: // Guthix Claws
				if (player.getEquipment().getWeaponId() != 2416 && player.getEquipment().getWeaponId() != 29952) {
					player.getPackets()
					.sendGameMessage(
							"You need to be equipping a Guthix Staff, Staff of the Dead or Void Mace to cast this spell.",
							true);
					return false;
				}
				if (!checkSpellRequirements(player, 60, delete, AIR_RUNE, 4,
						FIRE_RUNE, 1, BLOOD_RUNE, 2))
					return false;
				break;
			case 68: // Flame of Zammy
				if (player.getEquipment().getWeaponId() != 2417 && player.getEquipment().getWeaponId() != 29952) {
					player.getPackets()
					.sendGameMessage(
							"You need to be equipping a Zamorak Staff or Staff of the Dead to cast this spell.",
							true);
					return false;
				}
				if (!checkSpellRequirements(player, 60, delete, AIR_RUNE, 4,
						FIRE_RUNE, 4, BLOOD_RUNE, 2))
					return false;
				break;
			case 91:
				if (!checkSpellRequirements(player, 85, delete, FIRE_RUNE, 10,
						AIR_RUNE, 7, DEATH_RUNE, 1, BLOOD_RUNE, 1))
					return false;
				break;
			case 86: // teleblock
				if (!checkSpellRequirements(player, 85, delete, CHAOS_RUNE, 1,
						LAW_RUNE, 1, DEATH_RUNE, 1))
					return false;
				break;
			case 99: // Storm of Armadyl
				if (!checkSpellRequirements(player, 77, delete, ARMADYL_RUNE, 1))
					return false;
				break;
			default:
				return false;
			}
			break;
		default:
			return false;
		}
		if (set >= 0) {
			if (set == 0)
				player.getCombatDefinitions().setAutoCastSpell(spellId);
			else
				player.getTemporaryAttributtes().put("tempCastSpell", spellId);
		}
		return true;
	}

	public static final void setCombatSpell(Player player, int spellId) {
		if (player.getCombatDefinitions().getAutoCastSpell() == spellId)
			player.getCombatDefinitions().resetSpells(true);
		else
			checkCombatSpell(player, spellId, 0, false);
	}

	public static final void processLunarSpell(Player player, int spellId,
			int packetId) {
		player.stopAll(false);
		switch (spellId) {
		case 43:
			sendLunarTeleportSpell(player, 69, 80, new WorldTile(2113, 3915, 0),
					ASTRAL_RUNE, 2, LAW_RUNE, 1, EARTH_RUNE, 2);
			break;
		case 67:
			sendLunarTeleportSpell(player, 72, 85, new WorldTile(3049, 3315, 0),
					ASTRAL_RUNE, 2, LAW_RUNE, 1, AIR_RUNE, 2);
			break;
		case 47:
			sendLunarTeleportSpell(player, 72, 85, new WorldTile(2546, 3758, 0),
					ASTRAL_RUNE, 2, LAW_RUNE, 1, WATER_RUNE, 2);
			break;
		case 22:
			sendLunarTeleportSpell(player, 75, 90, new WorldTile(2519, 3571, 0),
					ASTRAL_RUNE, 2, LAW_RUNE, 2, FIRE_RUNE, 3);
			break;
		case 69:
			sendLunarTeleportSpell(player, 76, 95, new WorldTile(2664, 3382, 0),
					ASTRAL_RUNE, 2, LAW_RUNE, 2, WATER_RUNE, 5);
			break;
		case 41:
			sendLunarTeleportSpell(player, 78, 100,
					new WorldTile(2532, 3222, 0), ASTRAL_RUNE, 2, LAW_RUNE, 2,
					WATER_RUNE, 4);
			break;
		case 40:
			sendLunarTeleportSpell(player, 85, 105,
					new WorldTile(2613, 3383, 0), ASTRAL_RUNE, 3, LAW_RUNE, 3,
					WATER_RUNE, 8);
			break;
		case 44:
			sendLunarTeleportSpell(player, 87, 110,
					new WorldTile(2806, 3463, 0), ASTRAL_RUNE, 3, LAW_RUNE, 3,
					WATER_RUNE, 10);
			break;
		case 51:
			sendLunarTeleportSpell(player, 89, 115,
					new WorldTile(2961, 3918, 0), ASTRAL_RUNE, 3, LAW_RUNE, 3,
					WATER_RUNE, 8);
			break;
		case 75:
			sendLunarTeleportSpell(player, 92, 120,
					new WorldTile(2816, 3677, 0), ASTRAL_RUNE, 3, LAW_RUNE, 3,
					WATER_RUNE, 10);
			break;
		case 29: // humidify
			Magic.processHumidify(player);
			break;
		case 37:
			if (player.getSkills().getLevel(Skills.MAGIC) < 94) {
				player.getPackets().sendGameMessage(
						"Your Magic level is not high enough for this spell.");
				return;
			} else if (player.getSkills().getLevel(Skills.DEFENCE) < 40) {
				player.getPackets().sendGameMessage(
						"You need a Defence level of 40 for this spell");
				return;
			}
			Long lastVeng = (Long) player.getTemporaryAttributtes().get(
					"LAST_VENG");
			if (lastVeng != null
					&& lastVeng + 30000 > Utils.currentTimeMillis()) {
				player.getPackets()
				.sendGameMessage(
						"Players may only cast vengeance once every 30 seconds.");
				return;
			}
			if (!checkRunes(player, true, ASTRAL_RUNE, 4, DEATH_RUNE, 2,
					EARTH_RUNE, 10))
				return;
			player.setNextGraphics(new Graphics(726, 0, 100));
			player.setNextAnimation(new Animation(4410));
			player.setCastVeng(true);
			player.getTemporaryAttributtes().put("LAST_VENG",
					Utils.currentTimeMillis());
			player.getPackets().sendGameMessage("You cast a vengeance.");
			break;
		case 73:
			if (player.getSkills().getLevel(Skills.MAGIC) < 90) {
				player.getPackets().sendGameMessage(
						"Your Magic level is not high enough for this spell.");
				return;
			} else if (player.getSkills().getLevel(Skills.DEFENCE) < 40) {
				player.getPackets().sendGameMessage(
						"You need a Defence level of 40 for this spell");
				return;
			}
			Long lastDis = (Long) player.getTemporaryAttributtes().get(
					"LAST_DIS");
			if (lastDis != null && lastDis + 60000 > Utils.currentTimeMillis()) {
				player.getPackets()
				.sendGameMessage(
						"Players may only cast Disruption Shield once every minute.");
				return;
			}
			if (!checkRunes(player, true, ASTRAL_RUNE, 3, BLOOD_RUNE, 3,
					BODY_RUNE, 10))
				return;
			player.setNextGraphics(new Graphics(1320, 0, 100));
			player.setNextAnimation(new Animation(8770));
			player.getTemporaryAttributtes().put("LAST_DIS",
					Utils.currentTimeMillis());
			player.getPackets()
			.sendGameMessage("You cast a Disruption Shield.");
			break;
		}
	}
	
	public static final void processHumidify(final Player player) {
		final int[] humidableItems = { 434, 229 };
		if (player.getSkills().getLevel(Skills.MAGIC) < 68) {
			player.getPackets().sendGameMessage(
					"You do not have the required level to cast this spell.");
			return;
		}
		if (player.getEquipment().getWeaponId() == 1383
				|| player.getEquipment().getWeaponId() == 1387) {
			if (!player.getInventory().containsItem(ASTRAL_RUNE, 1)) {
				player.getPackets()
				.sendGameMessage(
						"You do not have the required runes to cast this spell.");
				return;
			}
			GameEngine.getEngine().fastExecutor().schedule(new TimerTask() {
				int time = 0;

				@Override
				public void run() {
					if (time == 1) {
						player.getTemporaryAttributtes().put("humidifying",
								Boolean.TRUE);
						ArrayList<Integer> ammount = new ArrayList<Integer>();
						for (int a : ammount) {
							for (int i = 0; i < humidableItems.length; i++) {
								if (!player.getInventory().contains(new Item(humidableItems[i]))) {
									player.getPackets().sendGameMessage("You do not have the required items to cast this spell.");
									return;
								} else if (player.getInventory().contains(new Item(humidableItems[0]))) {
									a = player.getInventory().getNumberOf(humidableItems[0]);
									player.getInventory().removeItems(new Item(humidableItems[0], a), new Item(ASTRAL_RUNE, 1));
									player.getInventory().addItem(new Item(1761, a));
									player.setNextAnimation(new Animation(6294));
									player.setNextGraphics(new Graphics(1061));
									player.getSkills().addXp(Skills.MAGIC, 68);
								} else if (player.getInventory().contains(new Item(humidableItems[1]))) {
									a = player.getInventory().getNumberOf(humidableItems[1]);
									player.getInventory().removeItems(new Item(humidableItems[0], a), new Item(ASTRAL_RUNE, 1));
									player.getInventory().addItem(new Item(227, a));
									player.setNextAnimation(new Animation(6294));
									player.setNextGraphics(new Graphics(1061));
									player.getSkills().addXp(Skills.MAGIC, 68);
								}
							} 
						}
					} else if(time == 4) {
						player.getInterfaceManager().openGameTab(7);

					} else if (time == 11) {
						player.getTemporaryAttributtes().put("humidifying",
								Boolean.FALSE);
					}
					time++;
				}
			}, 0, 250L);
		} else {
			if (!player.getInventory().containsItem(WATER_RUNE, 3)
					|| !player.getInventory().containsItem(FIRE_RUNE, 1) || 
					!player.getInventory().containsItem(ASTRAL_RUNE, 1)) {
				player.getPackets()
				.sendGameMessage(
						"You do not have the required runes to cast this spell.");
				return;
			}
			GameEngine.getEngine().fastExecutor().schedule(new TimerTask() {
				int time = 0;

				@Override
				public void run() {
					if (time == 1) {
						player.getTemporaryAttributtes().put("humidifying",
								Boolean.TRUE);
						ArrayList<Integer> ammount = new ArrayList<Integer>();
						for (int a : ammount) {
							for (int i = 0; i < humidableItems.length; i++) {
								if (!player.getInventory().contains(new Item(humidableItems[i]))) {
									player.getPackets().sendGameMessage("You do not have the required items to cast this spell.");
									return;
								} else if (player.getInventory().contains(new Item(humidableItems[0]))) {
									a = player.getInventory().getNumberOf(humidableItems[0]);
									player.getInventory().removeItems(new Item(humidableItems[0], a), new Item(ASTRAL_RUNE, 1));
									player.getInventory().addItem(new Item(1761, a));
									player.setNextAnimation(new Animation(6294));
									player.setNextGraphics(new Graphics(1061));
									player.getSkills().addXp(Skills.MAGIC, 68);
								} else if (player.getInventory().contains(new Item(humidableItems[1]))) {
									a = player.getInventory().getNumberOf(humidableItems[1]);
									player.getInventory().removeItems(new Item(humidableItems[0], a), new Item(ASTRAL_RUNE, 1));
									player.getInventory().addItem(new Item(227, a));
									player.setNextAnimation(new Animation(6294));
									player.setNextGraphics(new Graphics(1061));
									player.getSkills().addXp(Skills.MAGIC, 68);
								}
							} 
						}
						
					} else if(time == 4) {
						player.getInterfaceManager().openGameTab(7);
						
					} else if (time == 11) {
						player.getTemporaryAttributtes().put("humidifying",
								Boolean.FALSE);
					}
					time++;
				}
			}, 0, 250L);
		}
	}

	public static final void processAncientSpell(Player player, int spellId,
			int packetId) {
		player.stopAll(false);
		switch (spellId) {
		case 28:
		case 32:
		case 24:
		case 20:
		case 30:
		case 34:
		case 26:
		case 22:
		case 29:
		case 33:
		case 25:
		case 21:
		case 31:
		case 35:
		case 27:
		case 23:
		case 36:
		case 37:
		case 38:
		case 39:
			setCombatSpell(player, spellId);
			break;
		case 40:
			sendAncientTeleportSpell(player, 54, 64, new WorldTile(3099, 9882,
					0), LAW_RUNE, 2, FIRE_RUNE, 1, AIR_RUNE, 1);
			break;
		case 41:
			sendAncientTeleportSpell(player, 60, 70, new WorldTile(3222, 3336,
					0), LAW_RUNE, 2, SOUL_RUNE, 1);
			break;
		case 42:
			sendAncientTeleportSpell(player, 66, 76, new WorldTile(3492, 3471,
					0), LAW_RUNE, 2, BLOOD_RUNE, 1);

			break;
		case 43:
			sendAncientTeleportSpell(player, 72, 82, new WorldTile(3006, 3471,
					0), LAW_RUNE, 2, WATER_RUNE, 4);
			break;
		case 44:
			sendAncientTeleportSpell(player, 78, 88, new WorldTile(2990, 3696,
					0), LAW_RUNE, 2, FIRE_RUNE, 3, AIR_RUNE, 2);
			break;
		case 45:
			sendAncientTeleportSpell(player, 84, 94, new WorldTile(3217, 3677,
					0), LAW_RUNE, 2, SOUL_RUNE, 2);
			break;
		case 46:
			sendAncientTeleportSpell(player, 90, 100, new WorldTile(3288, 3886,
					0), LAW_RUNE, 2, BLOOD_RUNE, 2);
			break;
		case 47:
			sendAncientTeleportSpell(player, 96, 106, new WorldTile(2977, 3873,
					0), LAW_RUNE, 2, WATER_RUNE, 8);
			break;
		case 48:
			useHomeTele(player);
			break;
		}
	}
	
	public static final void sendLunarTeleportSpell(Player player, int level,
			double xp, WorldTile tile, int... runes) {
		sendTeleportSpell(player, 9606, -2, 1685, -1, level, xp, tile, 5, true,
				MAGIC_TELEPORT, runes);
	}

	public static final void processNormalSpell(Player player, int spellId,
			int packetId) {
		player.stopAll(false);
		switch (spellId) {
		case 25: // air strike
		case 28: // water strike
		case 30: // earth strike
		case 32: // fire strike
		case 34: // air bolt
		case 39: // water bolt
		case 42: // earth bolt
		case 45: // fire bolt
		case 49: // air blast
		case 52: // water blast
		case 58: // earth blast
		case 63: // fire blast
		case 70: // air wave
		case 73: // water wave
		case 77: // earth wave
		case 80: // fire wave
		case 99:
		case 84:
		case 87:
		case 89:
		case 91:
		case 36:
		case 55:
		case 81:
		case 66:
		case 67:
		case 68:
			setCombatSpell(player, spellId);
			break;
		case 27: // crossbow bolt enchant
			if (player.getSkills().getLevel(Skills.MAGIC) < 4) {
				player.getPackets().sendGameMessage(
						"Your Magic level is not high enough for this spell.");
				return;
			}
			player.stopAll();
			player.getInterfaceManager().sendInterface(432);
			break;
		case 24:
			useHomeTele(player);
			break;
		case 37: // mobi
			sendNormalTeleportSpell(player, 10, 19,
					new WorldTile(2413, 2848, 0), LAW_RUNE, 1, WATER_RUNE, 1,
					AIR_RUNE, 1);
			break;
		case 40: // varrock
			sendNormalTeleportSpell(player, 25, 19,
					new WorldTile(3212, 3424, 0), FIRE_RUNE, 1, AIR_RUNE, 3,
					LAW_RUNE, 1);
			break;
		case 43: // lumby
			sendNormalTeleportSpell(player, 31, 41,
					new WorldTile(3222, 3218, 0), EARTH_RUNE, 1, AIR_RUNE, 3,
					LAW_RUNE, 1);
			break;
		case 46: // fally
			sendNormalTeleportSpell(player, 37, 48,
					new WorldTile(2964, 3379, 0), WATER_RUNE, 1, AIR_RUNE, 3,
					LAW_RUNE, 1);
			break;
		case 51: // camelot
			sendNormalTeleportSpell(player, 45, 55.5, new WorldTile(2757, 3478,
					0), AIR_RUNE, 5, LAW_RUNE, 1);
			break;
		case 57: // ardy
			sendNormalTeleportSpell(player, 51, 61,
					new WorldTile(2664, 3305, 0), WATER_RUNE, 2, LAW_RUNE, 2);
			break;
		case 62: // watch
			sendNormalTeleportSpell(player, 58, 68,
					new WorldTile(2547, 3113, 2), EARTH_RUNE, 2, LAW_RUNE, 2);
			break;
		case 69: // troll
			sendNormalTeleportSpell(player, 61, 68,
					new WorldTile(2888, 3674, 0), FIRE_RUNE, 2, LAW_RUNE, 2);
			break;
		case 72: // ape
			sendNormalTeleportSpell(player, 64, 76,
					new WorldTile(2776, 9103, 0), FIRE_RUNE, 2, WATER_RUNE, 2,
					LAW_RUNE, 2, 1963, 1);
			break;
		}
	}

	public static void daemonheimTeleport(final Player player, final WorldTile tile) {
		if (!player.getControlerManager().processItemTeleport(tile))
			return;
		WorldTasksManager.schedule(new WorldTask() {
			int loop;

			@Override
			public void run() {
				WorldTile teleTile = tile;
				teleTile = new WorldTile(tile, 2);
				teleTile = tile;
				if (loop == 0) {
					player.setNextAnimation(new Animation(13652));
					player.setNextGraphics(new Graphics(2602));
				} else if (loop == 5) {
					player.setNextWorldTile(teleTile);
				} else if (loop == 6) {
					player.setNextAnimation(new Animation(13654));
					player.setNextGraphics(new Graphics(2603));
					stop();
				}
				loop++;
			}
		}, 0, 1);
	}

	private static void useHomeTele(Player player) {
		player.stopAll();
		player.getInterfaceManager().sendInterface(1092); 
	}

	public static final boolean checkSpellRequirements(Player player,
			int level, boolean delete, int... runes) {
		if (player.getSkills().getLevelForXp(Skills.MAGIC) < level) {
			player.getPackets().sendGameMessage(
					"Your Magic level is not high enough for this spell.");
			return false;
		}
		return checkRunes(player, delete, runes);
	}

	public static boolean hasStaffOfLight(int weaponId) {
		if (weaponId == 15486 || weaponId == 22207 || weaponId == 22209
				|| weaponId == 22211 || weaponId == 22213 || weaponId == 29952)
			return true;
		return false;
	}

	public static boolean checkSpellLevel(Player player, int level) {
		if (player.getSkills().getLevel(Skills.MAGIC) < level
				&& player.getSkills().getLevelForXp(Skills.MAGIC) < level) {
			player.getPackets().sendGameMessage("Your Magic level is not high enough for this spell.");
			return false;
		}
		return true;
	}


	public static final boolean checkRunes(Player player, boolean delete, boolean dungeoneering, int... values) {
		int weaponId = player.getEquipment().getWeaponId();
		int shieldId = player.getEquipment().getShieldId();
		int runesCount = 0;
		while (runesCount < values.length) {
			int runeId = values[runesCount++];
			int amount = values[runesCount++];
			if (hasInfiniteRunes(runeId, weaponId, shieldId, player))
				continue;
			else if (hasSpecialRunes(player, runeId, amount))
				continue;
			else if (dungeoneering) {
				if (player.getInventory().containsItem(runeId - 1689, amount))
					continue;
			}
			if (!player.getInventory().containsItem(runeId, amount)) {
				player.getPackets()
				.sendGameMessage("You do not have enough "
						+ ItemDefinitions.getItemDefinitions(runeId).getName().replace("rune", "Rune")
						+ "s to cast this spell.");
				return false;
			}

		}
		if (delete) {
			if (hasStaffOfLight(weaponId) && !containsRune(LAW_RUNE, values) && !containsRune(NATURE_RUNE, values)
					&& Utils.random(8) == 0) {
				player.getPackets()
				.sendGameMessage("The power of your staff of light saves some runes from being drained.", true);
				return true;
			}
			runesCount = 0;
			while (runesCount < values.length) {
				int runeId = values[runesCount++];
				int amount = values[runesCount++];
				if (hasInfiniteRunes(runeId, weaponId, shieldId, player))
					continue;
				else if (hasSpecialRunes(player, runeId, amount))
					runeId = getRuneForId(runeId);
				else if (dungeoneering) {
					int bindedRune = runeId - 1689;
					if (player.getInventory().containsItem(bindedRune, amount)) {
						player.getInventory().deleteItem(bindedRune, amount);
						continue; // won't delete the extra rune anyways.
					}
				}
				player.getInventory().deleteItem(runeId, amount);
			}
		}
		return true;
	}



	public static final boolean checkRunes(Player player, boolean delete,
			int... runes) {
		int weaponId = player.getEquipment().getWeaponId();
		int shieldId = player.getEquipment().getShieldId();
		int runesCount = 0;
		while (runesCount < runes.length) {
			int runeId = runes[runesCount++];
			int ammount = runes[runesCount++];
			if (hasInfiniteRunes(runeId, weaponId, shieldId, player))
				return true;
			if (hasStaffOfLight(weaponId) && Utils.getRandom(8) == 0
					&& runeId != 21773)// 1 in eight chance of keeping runes
				continue;
			if (hasSpecialRunes(player, runeId, ammount))
				continue;
			if (!player.getInventory().containsItem(runeId, ammount)) {
				player.getPackets().sendGameMessage(
						"You do not have enough "
								+ ItemDefinitions.getItemDefinitions(runeId)
								.getName().replace("rune", "Rune")
								+ "s to cast this spell.");
				return false;
			}
		}
		if (delete) {
			runesCount = 0;
			while (runesCount < runes.length) {
				int runeId = runes[runesCount++];
				int ammount = runes[runesCount++];
				if (hasInfiniteRunes(runeId, weaponId, shieldId, player))
					continue;
				player.getInventory().deleteItem(runeId, ammount);
			}
		}
		return true;
	}

	private static boolean containsRune(int rune, int[] integer) {
		for (int id : integer) {
			if (rune == id)
				return true;
		}
		return false;
	}

	public static final void sendAncientTeleportSpell(Player player, int level,
			double xp, WorldTile tile, int... runes) {
		sendTeleportSpell(player, 1979, -1, 1681, -1, level, xp, tile, 5, true,
				MAGIC_TELEPORT, runes);
	}

	public boolean processMagicTeleport(WorldTile toTile) {
		//player.sm("You are unable to teleport at this time...");
		return false;
	}

	public static final void sendNormalTeleportSpell(Player player, int level,
			double xp, WorldTile tile, int... runes) {
		if (Utils.currentTimeMillis() - player.getTeleBlockDelay() < 300000) {
			player.sm("<col=FF0000>You are currently blocked from teleporting!");
			return;
		}
		sendTeleportSpell(player, 8939, 8941, 1576, 1577, level, xp, tile, 3,
				true, MAGIC_TELEPORT, runes);
	}

	public static final boolean sendItemTeleportSpell(Player player, boolean randomize, int upEmoteId, int upGraphicId, int delay, WorldTile tile) {
		if (Utils.currentTimeMillis() - player.getTeleBlockDelay() < 300000) {
			player.sm("<col=FF0000>You are currently blocked from teleporting!");
			return false;
		}
		return sendTeleportSpell(player, upEmoteId, -2, upGraphicId, -1, 0, 0,
				tile, delay, randomize, ITEM_TELEPORT);
	}

	public static void pushLeverTeleport(final Player player,
			final WorldTile tile) {
		if (!player.getControlerManager().processObjectTeleport(tile))
			return;
		player.setNextAnimation(new Animation(2140));
		player.lock();
		WorldTasksManager.schedule(new WorldTask() {
			@Override
			public void run() {
				player.unlock();
				Magic.sendObjectTeleportSpell(player, false, tile);
			}
		}, 1);
	}

	public static final void sendObjectTeleportSpell(Player player,
			boolean randomize, WorldTile tile) {
		sendTeleportSpell(player, 8939, 8941, 1576, 1577, 0, 0, tile, 3,
				randomize, OBJECT_TELEPORT);
	}

	public static final void sendDelayedObjectTeleportSpell(Player player,
			int delay, boolean randomize, WorldTile tile) {
		sendTeleportSpell(player, 8939, 8941, 1576, 1577, 0, 0, tile, delay,
				randomize, OBJECT_TELEPORT);
	}

	public static final boolean sendTeleportSpell(final Player player,
			int upEmoteId, final int downEmoteId, int upGraphicId,
			final int downGraphicId, int level, final double xp,
			final WorldTile tile, int delay, final boolean randomize,
			final int teleType, int... runes) {
		long currentTime = Utils.currentTimeMillis();
		if (player.getLockDelay() > currentTime)
			return false;
		if (player.getSkills().getLevel(Skills.MAGIC) < level) {
			player.getPackets().sendGameMessage(
					"Your Magic level is not high enough for this spell.");
			return false;
		}
		if (!checkRunes(player, false, runes))
			return false;
		if (teleType == MAGIC_TELEPORT) {
			if (!player.getControlerManager().processMagicTeleport(tile))
				return false;
		} else if (teleType == ITEM_TELEPORT) {
			if (!player.getControlerManager().processItemTeleport(tile))
				return false;
		} else if (teleType == OBJECT_TELEPORT) {
			if (!player.getControlerManager().processObjectTeleport(tile))
				return false;
		}
		checkRunes(player, true, runes);
		player.stopAll();
		if (upEmoteId != -1)
			player.setNextAnimation(new Animation(upEmoteId));
		if (upGraphicId != -1)
			player.setNextGraphics(new Graphics(upGraphicId));
		if (teleType == MAGIC_TELEPORT)
			player.getPackets().sendSound(5527, 0, 2);
		player.lock(3 + delay);
		WorldTasksManager.schedule(new WorldTask() {

			boolean removeDamage;

			@Override
			public void run() {
				if(!removeDamage) {
					WorldTile teleTile = tile;
					if (randomize) {
						// attemps to randomize tile by 4x4 area
						for (int trycount = 0; trycount < 10; trycount++) {
							teleTile = new WorldTile(tile, 2);
							if (World.canMoveNPC(tile.getPlane(), teleTile.getX(),
									teleTile.getY(), player.getSize()))
								break;
							teleTile = tile;
						}
					}
					player.setNextWorldTile(teleTile);
					player.getControlerManager().magicTeleported(teleType);
					if (player.getControlerManager().getControler() == null)
						teleControlersCheck(player, teleTile);
					if (xp != 0)
						player.getSkills().addXp(Skills.MAGIC, xp);
					if (downEmoteId != -1)
						player.setNextAnimation(new Animation(
								downEmoteId == -2 ? -1 : downEmoteId));
					if (downGraphicId != -1)
						player.setNextGraphics(new Graphics(downGraphicId));
					if (teleType == MAGIC_TELEPORT) {
						player.getPackets().sendSound(5524, 0, 2);
						player.setNextFaceWorldTile(new WorldTile(teleTile.getX(),
								teleTile.getY() - 1, teleTile.getPlane()));
						player.setDirection(6);
					}
					removeDamage = true;
				}else {
					player.resetReceivedDamage();
					stop();
				}
			}
		}, delay, 0);
		return true;
	}

	private final static WorldTile[] TABS = { new WorldTile(3217, 3426, 0),
			new WorldTile(3222, 3218, 0), new WorldTile(2965, 3379, 0),
			new WorldTile(2758, 3478, 0), new WorldTile(2660, 3306, 0) };

	public static boolean useTabTeleport(final Player player, final int itemId) {
		if (itemId < 8007 || itemId > 8007 + TABS.length - 1)
			return false;
		if (useTeleTab(player, TABS[itemId - 8007]))
			player.getInventory().deleteItem(itemId, 1);
		return true;
	}

	public static boolean useTeleTab(final Player player, final WorldTile tile) {
		if (!player.getControlerManager().processItemTeleport(tile))
			return false;
		player.lock();
		player.setNextAnimation(new Animation(9597));
		player.setNextGraphics(new Graphics(1680));
		WorldTasksManager.schedule(new WorldTask() {
			int stage;

			@Override
			public void run() {
				if (stage == 0) {
					player.setNextAnimation(new Animation(4731));
					stage = 1;
				} else if(stage == 1){
					WorldTile teleTile = tile;
					// attemps to randomize tile by 4x4 area
					for (int trycount = 0; trycount < 10; trycount++) {
						teleTile = new WorldTile(tile, 2);
						if (World.canMoveNPC(tile.getPlane(), teleTile.getX(),
								teleTile.getY(), player.getSize()))
							break;
						teleTile = tile;
					}
					player.setNextWorldTile(teleTile);
					player.getControlerManager().magicTeleported(ITEM_TELEPORT);
					if (player.getControlerManager().getControler() == null)
						teleControlersCheck(player, teleTile);
					player.setNextFaceWorldTile(new WorldTile(teleTile.getX(),
							teleTile.getY() - 1, teleTile.getPlane()));
					player.setDirection(6);
					player.setNextAnimation(new Animation(-1));
					stage = 2;
				}else if (stage == 2) {
					player.resetReceivedDamage();
					player.unlock();
					stop();
				}

			}
		}, 2, 1);
		return true;
	}

	public static void resourcesTeleport(final Player player, final int x, final int y, final int h) {
		player.lock();
		WorldTasksManager.schedule(new WorldTask() {
			int loop;

			@Override
			public void run() {
				if (loop == 0) {
					player.setNextAnimation(new Animation(13288));
					player.setNextGraphics(new Graphics(2516));
				} else if (loop == 1) {
					player.setNextWorldTile(new WorldTile(x, y, h));
					player.setNextAnimation(new Animation(13285));
					player.setNextGraphics(new Graphics(2517));
					player.unlock();
				}
				loop++;
			}
		}, 0, 1);
	}

	public static final void useVecnaSkull(Player player) {
		player.stopAll(false);
		Long lastVecna = player.getLastVecnaSkull();
		if (lastVecna != null && lastVecna + 15000 > Utils.currentTimeMillis()) {
			player.getPackets()
			.sendGameMessage(
					"The skull has not yet regained "
							+ "its mysterious aura. You will need to wait another "
							+ (lastVecna != null
							&& lastVecna + 7000 > Utils
							.currentTimeMillis() ? "7"
									: (lastVecna != null
									&& lastVecna + 6000 > Utils
									.currentTimeMillis() ? "6"
											: (lastVecna != null
											&& lastVecna + 5000 > Utils
											.currentTimeMillis() ? "5"
													: (lastVecna != null
													&& lastVecna + 4000 > Utils
													.currentTimeMillis() ? "4"
															: (lastVecna != null
															&& lastVecna + 3000 > Utils
															.currentTimeMillis() ? "3"
																	: (lastVecna != null
																	&& lastVecna + 2000 > Utils
																	.currentTimeMillis() ? "2"
																			: "1"))))))
							+ " seconds.");
			return;
		}
		player.setLastVecnaSkull(Utils.currentTimeMillis());
		player.setNextGraphics(new Graphics(738, 0, 100));
		player.setNextAnimation(new Animation(10530));
		player.getPackets()
		.sendGameMessage(
				"The skull feeds off the life around you, boosting your magical ability.");
		int actualLevel = player.getSkills().getLevel(Skills.MAGIC);
		int realLevel = player.getSkills().getLevelForXp(Skills.MAGIC);
		int level = actualLevel > realLevel ? realLevel : actualLevel;
		player.getSkills().set(Skills.MAGIC, level + 6);
	}

	public static void teleControlersCheck(Player player, WorldTile teleTile) {
		if (Kalaboss.isAtKalaboss(teleTile))
			player.getControlerManager().startControler("Kalaboss");
		else if (Wilderness.isAtWild(teleTile))
			player.getControlerManager().startControler("Wilderness");
		else if (RequestController.inWarRequest(player))
			player.getControlerManager().startControler("clan_wars_request");
		else if (FfaZone.inArea(player))
			player.getControlerManager().startControler("clan_wars_ffa");
	}

	private Magic() {

	}

}
