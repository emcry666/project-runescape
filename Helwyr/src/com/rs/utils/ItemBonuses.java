
package com.rs.utils;

import java.util.concurrent.ConcurrentHashMap;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.player.Equipment;

public final class ItemBonuses {

	private final static ConcurrentHashMap<Integer, int[]> ITEM_BONUSES = new ConcurrentHashMap<Integer, int[]>();

	public static final void init() {
		loadItemBonuses();
	}

	public static final int[] getItemBonuses(final int itemId) {
		return ITEM_BONUSES.get(itemId);
	}
	
	private static final int STAB_ATTACK = 0, SLASH_ATTACK = 1, CRUSH_ATTACK = 2, MAGIC_ATTACK = 3, RANGE_ATTACK = 4,
			STAB_DEFENCE = 5, SLASH_DEFENCE = 6, CRUSH_DEFENCE = 7, MAGIC_DEFENCE = 8, RANGE_DEFENCE = 9,
			SUMMONING_DEFENCE = 10, ABSORB_MELEE = 11, ABSORB_MAGIC = 12, ABSORB_RANGE = 13, 
			STRENGTH = 14, RANGED_STRENGTH = 15, PRAYER = 16, MAGIC_DAMAGE = 17;

	private static final void loadItemBonuses() {
		for (int index = 0; index < Utils.getItemDefinitionsSize(); index++) {
			final ItemDefinitions defs = ItemDefinitions.getItemDefinitions(index);
			if (defs == null)
				continue;
			int id = index;
			int[] bonuses = new int[18];
			for (int slot = 0; slot < bonuses.length; slot++) {
				int value = 0;
				switch (slot) {
				case STAB_ATTACK:
				case SLASH_ATTACK:
				case CRUSH_ATTACK:
					if (defs.isMeleeWeapon()) {
						if (defs.getEquipSlot() == Equipment.SLOT_WEAPON) {
							if (Equipment.isTwoHandedWeapon(defs))
								value = (int)(0.015 * (defs.getMeleeDamage() + defs.getMeleeAccuracy()) / 2);
							else
								value = (int)(0.01984 * (defs.getMeleeDamage() + defs.getMeleeAccuracy()) / 2);//0.012
						} else if (defs.getEquipSlot() == Equipment.SLOT_SHIELD) {
							value = (int)(0.00616 * (defs.getMeleeDamage() + defs.getMeleeAccuracy()) / 2);//0.01
						}
					} else {
						if (defs.isMeleeArmour() || defs.isMiscEquipment() || defs.getEquipSlot() == Equipment.SLOT_AMULET)
							value = (int)(0.01 * (defs.getMeleeDamage() + defs.getMeleeAccuracy() + defs.getItemTier()) / 2);
						else
							value = 0;
					}
					break;
				case RANGE_ATTACK:
					if (defs.isRangedWeapon() || defs.isRangedWeaponDoesNotRequireAmmunitionToFunction()) {
						if (defs.getEquipSlot() == Equipment.SLOT_WEAPON) {
							if (Equipment.isTwoHandedWeapon(defs))
								value = (int)(0.15 * defs.getRangedAccuracy());
							else {
								if (!defs.isRangedWeaponDoesNotRequireAmmunitionToFunction())
									value = (int)(0.1584 * (defs.getRangedDamage() + defs.getRangedAccuracy()) / 2);
								else if (defs.isRangedWeaponDoesNotRequireAmmunitionToFunction())
									value = (int)(0.01584 * (defs.getRangedDamage() + defs.getRangedAccuracy()) / 2);
							}
						} else if (defs.getEquipSlot() == Equipment.SLOT_SHIELD) {
							if (!defs.isRangedWeaponDoesNotRequireAmmunitionToFunction())
								value = (int)(0.0616 * (defs.getRangedDamage() + defs.getRangedAccuracy()) / 2);
							else if (defs.isRangedWeaponDoesNotRequireAmmunitionToFunction())
								value = (int)(0.00616 * (defs.getRangedDamage() + defs.getRangedAccuracy()) / 2);
						}
					} else {
						if (defs.isRangedArmour() || defs.isMiscEquipment() || defs.getEquipSlot() == Equipment.SLOT_AMULET)
							value = (int)(0.01 * (defs.getRangedDamage() + defs.getRangedAccuracy() + defs.getItemTier()) / 2);
						else
							value = 0;
					}
					break;
				case MAGIC_ATTACK:
					if (defs.isMagicWeapon()) {
						if (defs.getEquipSlot() == Equipment.SLOT_WEAPON) {
							if (Equipment.isTwoHandedWeapon(defs))
								value = (int)(0.19 * (defs.getMagicAccuracy() + defs.getItemTier()) / 2);
							else
								value = (int)(0.11284 * (defs.getMagicAccuracy() + defs.getItemTier()) / 2);
						} else if (defs.getEquipSlot() == Equipment.SLOT_SHIELD) {
							value = (int)(0.0616 * (defs.getMagicAccuracy() + defs.getItemTier()) / 2);
						}
					} else {
						if (defs.isMagicArmour() || defs.isMiscEquipment() || defs.getEquipSlot() == Equipment.SLOT_AMULET)
							value = (int)(0.01 * (defs.getMagicAccuracy() + defs.getItemTier()));
						else
							value = 0;
					}
					break;
				case RANGED_STRENGTH:
					if (defs.isRangedWeapon()) {
						if (defs.getEquipSlot() == Equipment.SLOT_WEAPON) {
							if (Equipment.isTwoHandedWeapon(defs))
								value = (int)(0.018 * (defs.getRangedDamage() + defs.getItemTier()) / 2);
							else if (defs.isRangedWeaponDoesNotRequireAmmunitionToFunction())
								value = (int)(0.013 * (defs.getRangedDamage() + defs.getItemTier()) / 2);
							else
								value = 0;
						} else if (defs.getEquipSlot() == Equipment.SLOT_SHIELD) {
							if (defs.isRangedWeaponDoesNotRequireAmmunitionToFunction())
								value = (int)(0.01 * (defs.getRangedDamage() + defs.getItemTier()) / 2);
							else
								value = 0;
						}
					} else if (defs.getEquipSlot() == Equipment.SLOT_ARROWS) {
						value = (int)(0.018 * (defs.getRangedDamage() + defs.getItemTier()) / 2);
					} else {
							if (defs.isRangedArmour() || defs.isMiscEquipment() || defs.getEquipSlot() == Equipment.SLOT_AMULET)
								value = (int)(0.03 * (defs.getRangedDamage() + (defs.getItemTier())));
							else
								value = 0;
					}
					break;
				case STRENGTH:
					if (defs.isMeleeWeapon()) {
						if (defs.getEquipSlot() == Equipment.SLOT_WEAPON) { 
							if (Equipment.isTwoHandedWeapon(defs))
								value = (int)(0.0195 * (defs.getMeleeDamage() + defs.getItemTier()) / 2);
							else
								value = (int)(0.022 * (defs.getMeleeDamage() + defs.getItemTier()) / 2);
						} else if (defs.getEquipSlot() == Equipment.SLOT_SHIELD) {
							value = (int)(0.00656 * (defs.getMeleeDamage() + defs.getItemTier()) / 2);
						}
					} else {
							if (defs.isMeleeArmour() || defs.isMiscEquipment() || defs.getEquipSlot() == Equipment.SLOT_AMULET)
								value = (int)(0.03 * (defs.getMeleeDamage() + (defs.getItemTier())));
							else
								value = 0;
					}
					break;
				case MAGIC_DAMAGE:
					if (defs.isMagicWeapon()) {
						if (defs.getEquipSlot() == Equipment.SLOT_WEAPON) {
							if (Equipment.isTwoHandedWeapon(defs))
								value = (int)(0.01 * (defs.getMagicDamage()) / 3);
							else
								value = (int)(0.01 * (defs.getMagicDamage()) / 6);
						} else if (defs.getEquipSlot() == Equipment.SLOT_SHIELD) {
							value = (int)(0.01 * (defs.getMagicDamage()) / 8);
						}
					} else {
						if (defs.isMiscEquipment())
							value = (int)(0.03 * (defs.getMagicDamage() + (defs.getItemTier())));
						if (defs.getEquipSlot() == Equipment.SLOT_AMULET || (defs.isMagicArmour() && id != 19617))
							value = (int)(0.14 * (defs.getMagicDamage() + (defs.getItemTier())));
						else
							value = 0;
					}
					break;
				case STAB_DEFENCE:
				case SLASH_DEFENCE:
				case CRUSH_DEFENCE:
						switch (defs.getEquipSlot()) {
						case Equipment.SLOT_HAT:
							value = (int)(0.01 * defs.getArmorBonus());
							if (defs.isRangedArmour())
								value*=0.1;
							else if (defs.isMagicArmour())
								value/=1.5;
							break;
						case Equipment.SLOT_CHEST:
							value = (int)(0.04 * defs.getArmorBonus());
							if (defs.isRangedArmour())
								value*=0.2;
							else if (defs.isMagicArmour())
								value/=2;
							break;
						case Equipment.SLOT_LEGS:
							value = (int)(0.02 * defs.getArmorBonus());
							if (defs.isRangedArmour())
								value*=0.1;
							else if (defs.isMagicArmour())
								value/=1.8;
							break;
						case Equipment.SLOT_SHIELD:
							value = (int)(0.02 * defs.getArmorBonus());
							if (defs.isRangedArmour())
								value*=0.1;
							else if (defs.isMagicArmour())
								value/=1.7;
							break;
						case Equipment.SLOT_FEET:
						case Equipment.SLOT_HANDS:
							value = (int)(0.016 * defs.getArmorBonus());
							if (defs.isRangedArmour())
								value*=0.1;
							else if (defs.isMagicArmour())
								value/=1.4;
							break;
							default:
								value = (int)(0.01 * defs.getArmorBonus());
								if (defs.isRangedArmour())
									value*=0.1;
								else if (defs.isMagicArmour())
									value/=2;
								break;
						}
						break;
				case RANGE_DEFENCE:
					switch (defs.getEquipSlot()) {
					case Equipment.SLOT_HAT:
						value = (int)(0.01 * defs.getArmorBonus());
						if (defs.isMagicArmour())
							value*=0.3;
						else if (defs.isMeleeArmour())
							value/=1.5;
						else if (defs.isRangedArmour())
							value/=2;
						break;
					case Equipment.SLOT_CHEST:
						value = (int)(0.04 * defs.getArmorBonus());
						if (defs.isMagicArmour())
							value*=0.8;
						else if (defs.isMeleeArmour())
							value/=1.1;
						else if (defs.isRangedArmour())
							value/=2;
						break;
					case Equipment.SLOT_LEGS:
						value = (int)(0.02 * defs.getArmorBonus());
						if (defs.isMagicArmour())
							value*=0.5;
						else if (defs.isMeleeArmour())
							value/=1.3;
						else if (defs.isRangedArmour())
							value/=2;
						break;
					case Equipment.SLOT_SHIELD:
						value = (int)(0.02 * defs.getArmorBonus());
						if (defs.isMagicArmour())
							value*=0.4;
						else if (defs.isMeleeArmour())
							value/=1.4;
						else if (defs.isRangedArmour())
							value/=2;
						break;
					case Equipment.SLOT_FEET:
					case Equipment.SLOT_HANDS:
						value = (int)(0.016 * defs.getArmorBonus());
						if (defs.isMagicArmour())
							value*=0.2;
						else if (defs.isMeleeArmour())
							value/=1.8;
						else if (defs.isRangedArmour())
							value/=2;
						break;
						default:
							value = (int)(0.01 * defs.getArmorBonus());
							if (defs.isMagicArmour())
								value*=0.3;
							else if (defs.isMeleeArmour())
								value/=2;
							else if (defs.isRangedArmour())
								value/=2;
							break;
					}
					break;
				case MAGIC_DEFENCE:
					switch (defs.getEquipSlot()) {
					case Equipment.SLOT_HAT:
						value = (int)(0.01 * defs.getArmorBonus());
						if (defs.isMeleeArmour())
							value*=0.1;
						else if (defs.isRangedArmour())
							value/=1.5;
						else if (defs.isMagicArmour())
							value/=2;
						break;
					case Equipment.SLOT_CHEST:
						value = (int)(0.04 * defs.getArmorBonus());
						if (defs.isMeleeArmour())
							value*=0.2;
						else if (defs.isRangedArmour())
							value/=1.0;
						else if (defs.isMagicArmour())
							value/=2;
						break;
					case Equipment.SLOT_LEGS:
						value = (int)(0.02 * defs.getArmorBonus());
						if (defs.isMeleeArmour())
							value*=0.1;
						else if (defs.isRangedArmour())
							value/=1.2;
						else if (defs.isMagicArmour())
							value/=2;
						break;
					case Equipment.SLOT_SHIELD:
						value = (int)(0.02 * defs.getArmorBonus());
						if (defs.isMeleeArmour())
							value*=0.1;
						else if (defs.isRangedArmour())
							value/=1.3;
						else if (defs.isMagicArmour())
							value/=2;
						break;
					case Equipment.SLOT_FEET:
					case Equipment.SLOT_HANDS:
						value = (int)(0.016 * defs.getArmorBonus());
						if (defs.isMeleeArmour())
							value*=0.1;
						else if (defs.isRangedArmour())
							value/=1.6;
						else if (defs.isMagicArmour())
							value/=2;
						break;
						default:
							value = (int)(0.01 * defs.getArmorBonus());
							if (defs.isMeleeArmour())
								value*=0.1;
							else if (defs.isRangedArmour())
								value/=1.8;
							else if (defs.isMagicArmour())
								value/=1.8;
							break;
					}
					break;
				case SUMMONING_DEFENCE:
					value = defs.getSummoningDef();
					break;
				case ABSORB_MELEE:
					value = defs.getAbsorbMeleeBonus();
					break;
				case ABSORB_RANGE:
					value = defs.getAbsorbRangeBonus();
					break;
				case ABSORB_MAGIC:
					value = defs.getAbsorbMageBonus();
					break;
				case PRAYER:
					value = defs.getPrayerBonus();
					break;
				default:
					value = 0;
					break;
				}
				bonuses[slot] = value;
			}
			ITEM_BONUSES.put(id, bonuses);
		}
	}

	private ItemBonuses() {

	}
}
