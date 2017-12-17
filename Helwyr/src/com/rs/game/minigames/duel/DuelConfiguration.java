package com.rs.game.minigames.duel;

import java.util.EnumSet;
import java.util.Set;

import com.rs.game.item.Item;
import com.rs.game.item.ItemsContainer;
import com.rs.game.minigames.duel.ArenaControler.DuelMode;
import com.rs.game.player.Player;

/**
 * @author Tom
 * 
 */
public class DuelConfiguration {

	public enum RuleSet {
		NO_FORFEIT(0, new int[] { 29, 60 }), NO_MOVEMENT(1, new int[] { 33, 64 }), NO_RANGED(4, new int[] { 25, 56 }), NO_MELEE(
				5, new int[] { 26, 57 }), NO_MAGIC(6, new int[] { 27, 58 }), NO_DRINKS(7, new int[] { 30, 61 }), NO_FOOD(8,
				new int[] { 31, 62 }), NO_PRAYER(9, new int[] { 32, 63 }), OBSTACLES(10, new int[] { 34, 65 }), FUN_WEAPONS(12,
				new int[] { 28, 59 }), NO_SPECIAL(13, new int[] { 36, 67 }), NO_HELMET(14, new int[] { 43, 21 }), NO_CAPE(15,
				new int[] { 44, 22 }), NO_AMULET(16, new int[] { 45, 23 }), NO_WEAPON(17, new int[] { 46, 24 }), NO_BODY(18,
				new int[] { 47, 25 }), NO_SHIELD(19, new int[] { 48, 26 }), NO_LEGS(21, new int[] { 49, 27 }), NO_GLOVES(23,
				new int[] { 50, 28 }), NO_BOOTS(24, new int[] { 51, 29 }), NO_RING(26, new int[] { 52, 30 }), NO_ARROWS(27,
				new int[] { 53, 31 }), ENABLE_SUMMONING(28, new int[] { 35, 66 });

		private int state;
		private int[] components;

		private RuleSet(int state, int[] components) {
			this.state = state;
			this.components = components;
		}

		public int getValue() {
			return 1 << state;
		}

		public int getFriendlyComponent() {
			return components[0];
		}

		public int getStakedComponent() {
			return components[1];
		}

		public static RuleSet forComponent(int componentId, boolean staked) {
			for (RuleSet set : RuleSet.values()) {
				if (staked) {
					if (componentId == set.getStakedComponent())
						return set;
				} else {
					if (componentId == set.getFriendlyComponent())
						return set;
				}
			}
			return null;
		}

		public int getSlot() {
			return (state - 14);
		}
	}

	public enum AdvancedRuleSet {

		DUEL_DDS(5698, RuleSet.NO_MAGIC, RuleSet.NO_RANGED, RuleSet.NO_FOOD, RuleSet.NO_FORFEIT, RuleSet.NO_PRAYER,
				RuleSet.NO_DRINKS, RuleSet.NO_HELMET, RuleSet.NO_AMULET, RuleSet.NO_CAPE, RuleSet.NO_BODY, RuleSet.NO_LEGS,
				RuleSet.NO_BOOTS, RuleSet.NO_GLOVES, RuleSet.NO_ARROWS, RuleSet.NO_SHIELD, RuleSet.NO_RING, RuleSet.NO_MOVEMENT),

		DUEL_WHIP(4151, RuleSet.NO_MAGIC, RuleSet.NO_RANGED, RuleSet.NO_FOOD, RuleSet.NO_FORFEIT, RuleSet.NO_PRAYER,
				RuleSet.NO_DRINKS, RuleSet.NO_HELMET, RuleSet.NO_AMULET, RuleSet.NO_CAPE, RuleSet.NO_BODY, RuleSet.NO_LEGS,
				RuleSet.NO_BOOTS, RuleSet.NO_GLOVES, RuleSet.NO_ARROWS, RuleSet.NO_SHIELD, RuleSet.NO_RING),

		DUEL_RAPIER(18349, RuleSet.NO_MAGIC, RuleSet.NO_RANGED, RuleSet.NO_FOOD, RuleSet.NO_FORFEIT, RuleSet.NO_PRAYER,
				RuleSet.NO_DRINKS, RuleSet.NO_HELMET, RuleSet.NO_AMULET, RuleSet.NO_CAPE, RuleSet.NO_BODY, RuleSet.NO_LEGS,
				RuleSet.NO_BOOTS, RuleSet.NO_GLOVES, RuleSet.NO_ARROWS, RuleSet.NO_SHIELD, RuleSet.NO_RING),

		DUEL_G_MAUL(4153, RuleSet.NO_MAGIC, RuleSet.NO_RANGED, RuleSet.NO_FOOD, RuleSet.NO_FORFEIT, RuleSet.NO_PRAYER,
				RuleSet.NO_DRINKS, RuleSet.NO_HELMET, RuleSet.NO_AMULET, RuleSet.NO_CAPE, RuleSet.NO_BODY, RuleSet.NO_LEGS,
				RuleSet.NO_BOOTS, RuleSet.NO_GLOVES, RuleSet.NO_ARROWS, RuleSet.NO_SHIELD, RuleSet.NO_RING, RuleSet.NO_MOVEMENT),

		DUEL_BOX(-1, RuleSet.NO_MAGIC, RuleSet.NO_RANGED, RuleSet.NO_FOOD, RuleSet.NO_FORFEIT, RuleSet.NO_PRAYER,
				RuleSet.NO_DRINKS, RuleSet.NO_HELMET, RuleSet.NO_AMULET, RuleSet.NO_CAPE, RuleSet.NO_BODY, RuleSet.NO_LEGS,
				RuleSet.NO_BOOTS, RuleSet.NO_GLOVES, RuleSet.NO_ARROWS, RuleSet.NO_SHIELD, RuleSet.NO_RING, RuleSet.NO_WEAPON,
				RuleSet.NO_SPECIAL, RuleSet.NO_MOVEMENT),

		DUEL_BOX_MAGE(-1, RuleSet.NO_MELEE, RuleSet.NO_RANGED, RuleSet.NO_FOOD, RuleSet.NO_FORFEIT, RuleSet.NO_PRAYER,
				RuleSet.NO_DRINKS, RuleSet.NO_HELMET, RuleSet.NO_AMULET, RuleSet.NO_CAPE, RuleSet.NO_BODY, RuleSet.NO_LEGS,
				RuleSet.NO_BOOTS, RuleSet.NO_GLOVES, RuleSet.NO_ARROWS, RuleSet.NO_SHIELD, RuleSet.NO_RING, RuleSet.NO_WEAPON,
				RuleSet.NO_SPECIAL, RuleSet.NO_MOVEMENT),

		EMPTY(-1);

		private RuleSet[] rules;
		private int weapon;

		private AdvancedRuleSet(int weapon, RuleSet... rules) {
			this.weapon = weapon;
			this.rules = rules;
		}

		public int getWeapon() {
			return weapon;
		}

		public RuleSet[] getRules() {
			return rules;
		}
	}

	private final Player player;
	private final ItemsContainer<Item> stakedItems;
	private final Set<RuleSet> rules;
	private boolean rewarded;

	public DuelConfiguration(Player player) {
		this.player = player;
		this.stakedItems = new ItemsContainer<Item>(9, false);
		this.rules = EnumSet.noneOf(RuleSet.class);
	}

	public void resetRules() {
		for (RuleSet rule : rules) {
			setRule(rule);
		}
	}

	public void setRule(RuleSet rule) {
		if (isRuleEnabled(rule)) {
			rules.remove(rule);
		} else {
			rules.add(rule);
		}

		int value = 0;
		for (RuleSet set : rules) {
			if (isRuleEnabled(set))
				value |= set.getValue();
		}

		player.getVarsManager().sendVar(286, value);
	}

	public boolean isValid(Player target, DuelMode duelMode) {
		if (isRuleEnabled(RuleSet.NO_MELEE) && isRuleEnabled(RuleSet.NO_RANGED) && isRuleEnabled(RuleSet.NO_MAGIC)) {
			player.getPackets().sendGameMessage("You have to be able to use atleast one combat style in a duel.", true);
			return false;
		} else if (player.getEquipment().getAuraId() == 22298) {
			player.sm("You can't use this aura in a duel.");
			return false;
		} else if (!isRuleEnabled(RuleSet.ENABLE_SUMMONING) && (player.getFamiliar() != null || target.getFamiliar() != null)) {
			player.getPackets().sendGameMessage("Summoning has been disabled during this duel!");
			target.getPackets().sendGameMessage("Summoning has been disabled during this duel!");
			return false;
		} else if (isRuleEnabled(RuleSet.NO_MOVEMENT) && isRuleEnabled(RuleSet.OBSTACLES)) {
			player.getPackets().sendGameMessage("You cannot have obstacles enabled with no movement.");
			target.getPackets().sendGameMessage("You cannot have obstacles enabled with no movement.");
			return false;
		} else if (!duelMode.equals(DuelMode.STANDARD)) {
			AdvancedRuleSet ruleSet = duelMode.getSet();

			if (player.getEquipment().getWeaponId() != ruleSet.getWeapon()) {
				player.getPackets().sendGameMessage("You're not wearing the correct weapon for this mode.");
				target.getPackets().sendGameMessage("Your partner is not wearing the correct weapon for this mode.");
				return false;
			} else if (target.getEquipment().getWeaponId() != ruleSet.getWeapon()) {
				target.getPackets().sendGameMessage("You're not wearing the correct weapon for this mode.");
				player.getPackets().sendGameMessage("Your partner is not wearing the correct weapon for this mode.");
				return false;
			}
		}

		int count = 0;
		for (RuleSet rule : RuleSet.values()) {
			int slot = rule.getSlot();
			if (slot < 0 || slot > 14)
				continue;

			Item item = player.getEquipment().getItem(slot);
			if (isRuleEnabled(rule) && item != null) {
				if (rule.equals(RuleSet.NO_ARROWS)) {
					if (!(item.getDefinitions().isStackable() && player.getInventory().getItems().containsOne(item)))
						count++;
				} else {
					count += 1;
				}
			}
		}

		int freeSlots = player.getInventory().getFreeSlots() - count;
		if (freeSlots < 0) {
			player.getPackets().sendGameMessage("You do not have enough inventory space to remove all the equipment.");
			target.getPackets().sendGameMessage("Your opponent does not have enough space to remove all the equipment.");
			return false;
		}

		for (int index = 0; index < stakedItems.getSize(); index++) {
			if (stakedItems.get(index) != null) {
				freeSlots -= 1;
			}
		}

		if (freeSlots < 0) {
			player.getPackets().sendGameMessage("You do not have enough room in your inventory for this stake.");
			target.getPackets().sendGameMessage("Your opponent does not have enough room in his inventory for this stake.");
			return false;
		}

		boolean checkItems = checkItems(target);
		if (!checkItems) {
			player.getPackets().sendGameMessage("You do not have enough room in your inventory for this stake.");
			target.getPackets().sendGameMessage("Your opponent does not have enough room in his inventory for this stake.");
		}

		return checkItems;
	}

	private boolean checkItems(Player target) {

		/* Check your configuration. */
		int coins = stakedItems.getNumberOf(995);
		if ((player.getInventory().getNumerOf(995) + coins) < 0) {
			return false;
		}

		/* Check target configuration. */
		coins = target.getDuelConfig().getStakedItems().getNumberOf(995);
		if (player.getInventory().getNumerOf(995) + coins < 0) {
			return false;
		}

		return true;
	}

	public boolean isRuleEnabled(RuleSet rule) {
		return rules.contains(rule);
	}

	private void clearRules() {
		rules.clear();
	}

	private void clearItems() {
		stakedItems.clear();
	}

	public void reset() {
		clearRules();
		clearItems();
		setRewarded(false);
	}

	public ItemsContainer<Item> getStakedItems() {
		return stakedItems;
	}

	public boolean isRewarded() {
		return rewarded;
	}

	public void setRewarded(boolean rewarded) {
		this.rewarded = rewarded;
	}
}