package com.rs.game.player.actions;

import com.rs.game.Animation;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public class Crafting extends Action {

	public static final int NEEDLE = 1733;

	/**
	 * 
	 * @author Frostbite<Abstract>
	 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
	 *
	 */

	public static final int LEATHER = 1061;
	public static final int HARD_LEATHER = 1743;
	public static final int GREEN_DRAGON_LEATHER = 1745;
	public static final int BLUE_DRAGON_LEATHER = 1751;
	public static final int RED_DRAGON_LEATHER = 2507;
	public static final int BLACK_DRAGON_LEATHER = 2509;
	public static final int ROYAL_DRAGON_LEATHER = 24374;

	public static final int YAK_HIDE = 10818;
	public static final int BATWING = 25549;
	public static final int IMP_HIDE = 25545;
	public static final int SPIDER_SILK = 25547;
	public static final int CARASPACE = 25551;
	public static final int SNAKESKIN = 6289;

	public enum LeatherCrafting {

		/**
		 * Leather
		 */

		LEATHER_GLOVES(1, 13.8, new Item[] { new Item(LEATHER), }, new Item(1059)),

		LEATHER_BOOTS(7, 16.3, new Item[] { new Item(LEATHER), }, new Item(1061)),

		LEATHER_COWL(9, 18.5, new Item[] { new Item(LEATHER) }, new Item(1167)),

		LEATHER_VAMBRACES(11, 22.0, new Item[] { new Item(LEATHER) }, new Item(1063)),

		LEATHER_BODY(14, 25.0, new Item[] { new Item(LEATHER) }, new Item(1129)),

		LEATHER_CHAPS(18, 27.0, new Item[] { new Item(LEATHER) }, new Item(1095)),

		LEATHER_SHIELD(19, 30.0, new Item[] { new Item(LEATHER) }, new Item(25806)),

		HARD_LEATHER_GLOVES(25, 13.8, new Item[] { new Item(HARD_LEATHER), }, new Item(25875)),

		HARD_LEATHER_BOOTS(27, 34.0, new Item[] { new Item(HARD_LEATHER) }, new Item(25821)),

		HARD_LEATHER_BODY(28, 35.0, new Item[] { new Item(HARD_LEATHER) }, new Item(1131)),

		COIF(38, 37.0, new Item[] { new Item(LEATHER) }, new Item(1169)),

		/**
		 * Imp Hide
		 */

		IMP_HIDE_GLOVES(10, 10.0, new Item[] { new Item(IMP_HIDE) }, new Item(25851)),

		IMP_HIDE_BOOTS(11, 10.0, new Item[] { new Item(IMP_HIDE) }, new Item(25853)),

		IMP_HIDE_HOOD(12, 20.0, new Item[] { new Item(IMP_HIDE, 2) }, new Item(25845)),

		IMP_HIDE_LEGS(13, 20.0, new Item[] { new Item(IMP_HIDE, 2) }, new Item(25849)),

		IMP_HIDE_TOP(14, 30.5, new Item[] { new Item(IMP_HIDE, 3) }, new Item(25847)),

		IMP_HIDE_BOOK(15, 30.0, new Item[] { new Item(IMP_HIDE, 2) }, new Item(25662)),

		IMP_HIDE_WAND(16, 30.0, new Item[] { new Item(IMP_HIDE, 2) }, new Item(25642)),

		IMP_HIDE_SHIELD(17, 40.0, new Item[] { new Item(IMP_HIDE, 2) }, new Item(25855)),

		/**
		 * Spider Silk
		 */

		SPIDER_SILK_GLOVES(20, 12.0, new Item[] { new Item(SPIDER_SILK) }, new Item(25843)),

		SPIDER_SILK_BOOTS(21, 12.5, new Item[] { new Item(SPIDER_SILK) }, new Item(25841)),

		SPIDER_SILK_HOOD(22, 25.0, new Item[] { new Item(SPIDER_SILK, 2) }, new Item(25835)),

		SPIDER_SILK_LEGS(23, 25.0, new Item[] { new Item(SPIDER_SILK, 2) }, new Item(25839)),

		SPIDER_SILK_TOP(24, 35.5, new Item[] { new Item(SPIDER_SILK, 3) }, new Item(25837)),

		SPIDER_SILK_ORB(25, 25.0, new Item[] { new Item(SPIDER_SILK, 2) }, new Item(25802)),

		SPIDER_SILK_WAND(26, 25.0, new Item[] { new Item(SPIDER_SILK, 2) }, new Item(25650)),

		/**
		 * Carapace
		 */

		CARASPACE_GLOVES(30, 12.0, new Item[] { new Item(CARASPACE) }, new Item(25865)),

		CARASPACE_BOOTS(31, 12.0, new Item[] { new Item(CARASPACE) }, new Item(25863)),

		CARASPACE_HOOD(33, 24.0, new Item[] { new Item(CARASPACE, 2) }, new Item(25857)),

		CARASPACE_LEGS(34, 24.0, new Item[] { new Item(CARASPACE, 2) }, new Item(25861)),

		CARASPACE_TOP(35, 36.0, new Item[] { new Item(CARASPACE, 3) }, new Item(25859)),


		/**
		 * Batwing
		 */

		BATWING_GLOVES(50, 50.0, new Item[] { new Item(BATWING) }, new Item(25829)),

		BATWING_BOOTS(52, 50.0, new Item[] { new Item(BATWING) }, new Item(25833)),

		BATWING_HOOD(54, 50.0, new Item[] { new Item(BATWING, 2) }, new Item(25825)),

		BATWING_LEGS(55, 100.0, new Item[] { new Item(BATWING, 2) }, new Item(25831)),

		BATWING_TOP(56, 150.0, new Item[] { new Item(BATWING, 3) }, new Item(25827)),

		BATWING_SHIELD(56, 200.0, new Item[] { new Item(BATWING, 4) }, new Item(25802)),

		BATWING_BOOK(59, 200.0, new Item[] { new Item(BATWING, 4) }, new Item(25660)),

		BATWING_WAND(61, 200.0, new Item[] { new Item(BATWING, 4) }, new Item(25648)),

		/**
		 * Snake Skin
		 */

		SNAKESKIN_BOOTS(45, 30.0, new Item[] { new Item(SNAKESKIN, 6) }, new Item(6328)),

		SNAKESKIN_VAMBRACES(47, 35.0, new Item[] { new Item(SNAKESKIN, 8) }, new Item(6330)),

		SNAKESKIN_BANDANA(48, 45.0, new Item[] { new Item(SNAKESKIN, 5) }, new Item(6326)),

		SNAKESKIN_CHAPS(51, 50.0, new Item[] { new Item(SNAKESKIN, 12) }, new Item(6324)),

		SNAKESKIN_BODY(53, 55.0, new Item[] { new Item(SNAKESKIN, 15) }, new Item(6322)),

		/**
		 * Green D'hide
		 */

		GREEN_DHIDE_VAMBRACES(57, 62.0, new Item[] { new Item(GREEN_DRAGON_LEATHER) }, new Item(1065)),

		GREEN_DHIDE_CHAPS(60, 124.0, new Item[] { new Item(GREEN_DRAGON_LEATHER, 2) }, new Item(1099)),

		GREEN_DHIDE_BODY(63, 186.0, new Item[] { new Item(GREEN_DRAGON_LEATHER, 3) }, new Item(1135)),

		GREEN_DHIDE_SHIELD(64, 248.0, new Item[] { new Item(GREEN_DRAGON_LEATHER, 4) }, new Item(25794)),

		/**
		 * Blue D'hide
		 */

		BLUE_DHIDE_VAMBRACES(66, 70.0, new Item[] { new Item(BLUE_DRAGON_LEATHER) }, new Item(2487)),

		BLUE_DHIDE_CHAPS(68, 140.0, new Item[] { new Item(BLUE_DRAGON_LEATHER, 2) }, new Item(2493)),

		BLUE_DHIDE_BODY(71, 210.0, new Item[] { new Item(BLUE_DRAGON_LEATHER, 3) }, new Item(2499)),

		BLUE_DHIDE_SHIELD(72, 280.0, new Item[] { new Item(BLUE_DRAGON_LEATHER, 4) }, new Item(25796)),

		/**
		 * Red D'hide
		 */

		RED_DHIDE_VAMBRACES(73, 78.0, new Item[] { new Item(RED_DRAGON_LEATHER) }, new Item(2489)),

		RED_DHIDE_CHAPS(75, 156.0, new Item[] { new Item(RED_DRAGON_LEATHER, 2) }, new Item(2495)),

		RED_DHIDE_BODY(77, 234.0, new Item[] { new Item(RED_DRAGON_LEATHER, 3) }, new Item(2501)),

		RED_DHIDE_SHIELD(78, 312.0, new Item[] { new Item(RED_DRAGON_LEATHER, 4) }, new Item(25798)),

		/**
		 * Black D'hide
		 */

		BLACK_DHIDE_VAMBRACES(79, 86.0, new Item[] { new Item(BLACK_DRAGON_LEATHER) }, new Item(2491)),

		BLACK_DHIDE_CHAPS(82, 172.0, new Item[] { new Item(BLACK_DRAGON_LEATHER, 2) }, new Item(2498)),

		BLACK_DHIDE_BODY(84, 358.0, new Item[] { new Item(BLACK_DRAGON_LEATHER, 3) }, new Item(2504)),

		BLACK_DHIDE_SHIELD(85, 344.0, new Item[] { new Item(BLACK_DRAGON_LEATHER, 4) }, new Item(25800)),

		/**
		 * Royal D'hide
		 */

		ROYAL_DHIDE_VAMBRACES(87, 94.0, new Item[] { new Item(ROYAL_DRAGON_LEATHER) }, new Item(24376)),

		ROYAL_DHIDE_CHAPS(89, 188.0, new Item[] { new Item(ROYAL_DRAGON_LEATHER, 2) }, new Item(24379)),

		ROYAL_DHIDE_BODY(93, 282.0, new Item[] { new Item(ROYAL_DRAGON_LEATHER, 3) }, new Item(24382)),

		/*
		 * Yak-hide
		 */

		YAK_LEGS(43, 32.0, new Item[] { new Item(YAK_HIDE) }, new Item(10822)),

		YAK_TOP(46, 32.0, new Item[] { new Item(YAK_HIDE, 2) }, new Item(10824)),

		/**
		 * Enhanced Armour
		 */

		SPIKY_VAMBRACES(32, 5.8, new Item[] { new Item(10113), new Item(1063) }, new Item(10077)),

		GREEN_SPIKY_VAMBRACES(32, 5.8, new Item[] { new Item(10113), new Item(1065) }, new Item(10079)),

		BLUE_SPIKY_VAMBRACES(32, 5.8, new Item[] { new Item(10113), new Item(2487) }, new Item(10081)),

		RED_SPIKY_VAMBRACES(32, 5.8, new Item[] { new Item(10113), new Item(2489) }, new Item(10083)),

		BLACK_SPIKY_VAMPRACES(32, 5.8, new Item[] { new Item(10113), new Item(2491) }, new Item(10085)),

		ROYAL_SPIKY_VAMBRACES(32, 5.8, new Item[] { new Item(10113), new Item(24376) }, new Item(25553)),

		STUDDED_CHAPS(44, 42.0, new Item[] { new Item(2370) }, new Item(1097)),

		STUDDED_BODY(41, 40.0, new Item[] { new Item(2370) }, new Item(1133)),

		STUDDED_LEATHER_GLOVES(42, 40.0, new Item[] { new Item(2370), new Item(1059) }, new Item(25877)),

		STUDDED_LEATHER_BOOTS(43, 40.0, new Item[] { new Item(2370), new Item(1061) }, new Item(25823)),

		STUDDED_LEATHER_SHIELD(45, 43.0, new Item[] { new Item(2370), new Item(25806) }, new Item(25810)),

		;

		public static LeatherCrafting getLeatherByProduce(int id) {
			for (LeatherCrafting leather : LeatherCrafting.values()) {
				if (leather.getProducedItem().getId() == id)
					return leather;
			}
			return null;
		}

		public static LeatherCrafting getLeather(int id) {
			for (LeatherCrafting leather : LeatherCrafting.values()) {
				for (Item item : leather.getItemsRequired())
					if (item.getId() == id)
						return leather;
			}
			return null;
		}

		public static LeatherCrafting getLeather(Player player) {
			for (LeatherCrafting leather : LeatherCrafting.values()) {
				for (Item item : leather.getItemsRequired())
					if (player.getInventory().containsItem(item.getId(), item.getAmount()))
						return leather;
			}
			return null;
		}

		private int levelRequired;
		private double experience;
		private Item[] leatherRequired;
		private Item producedItem;

		private LeatherCrafting(int levelRequired, double experience, Item[] itemsRequired, Item producedItem) {
			this.levelRequired = levelRequired;
			this.experience = experience;
			this.leatherRequired = itemsRequired;
			this.producedItem = producedItem;
		}

		public Item[] getItemsRequired() {
			return leatherRequired;
		}

		public int getLevelRequired() {
			return levelRequired;
		}

		public Item getProducedItem() {
			return producedItem;
		}

		public double getExperience() {
			return experience;
		}

	}

	public LeatherCrafting leather;
	public int ticks;

	public Crafting(int slotId, int ticks) {
		this.leather = LeatherCrafting.getLeather(slotId);
		this.ticks = ticks;
	}

	@Override
	public boolean start(Player player) {
		if (leather == null || player == null) {
			return false;
		}
		if (!player.getToolbelt().containsItem(NEEDLE)) {
			player.getPackets().sendGameMessage(
					"You need a needle to create a " + leather.getProducedItem().getDefinitions().getName() + ".");
			return false;
		}
		if (leather.getItemsRequired().length > 1) {
			if (!player.getInventory().containsItemToolBelt(leather.getItemsRequired()[0].getId(),
					leather.getItemsRequired()[0].getAmount())) {
				player.getPackets()
				.sendGameMessage("You need " + leather.getItemsRequired()[0].getAmount() + " "
						+ leather.getItemsRequired()[0].getDefinitions().getName() + "'s to create a "
						+ leather.getProducedItem().getDefinitions().getName() + ".");
				return false;
			}
		}
		if (player.getSkills().getLevel(Skills.CRAFTING) < leather.getLevelRequired()) {
			player.getPackets().sendGameMessage("You need a Crafting level of at least " + leather.getLevelRequired()
			+ " to create " + leather.getProducedItem().getDefinitions().getName());
			return false;
		}
		return true;
	}

	@Override
	public boolean process(Player player) {
		if (leather == null || player == null) {
			return false;
		}
		if (!player.getToolbelt().containsItem(NEEDLE)) {
			player.getPackets().sendGameMessage(
					"You need a needle to craft a " + leather.getProducedItem().getDefinitions().getName() + ".");
			return false;
		}
		if (!player.getInventory().containsItem(1734, 1)) {
			player.getPackets().sendGameMessage(
					"You need thread to craft a " + leather.getProducedItem().getDefinitions().getName() + ".");
			return false;
		}
		if (leather.getItemsRequired().length > 1) {
			if (!player.getInventory().containsItem(leather.getItemsRequired()[0].getId(),
					leather.getItemsRequired()[0].getAmount())) {
				player.getPackets()
				.sendGameMessage("You need " + leather.getItemsRequired()[0].getAmount() + " "
						+ leather.getItemsRequired()[0].getDefinitions().getName() + "'s to create a "
						+ leather.getProducedItem().getDefinitions().getName() + ".");
				return false;
			}
			if (!player.getInventory().containsItem(leather.getItemsRequired()[1].getId(),
					leather.getItemsRequired()[1].getAmount())) {
				player.getPackets()
				.sendGameMessage("You need " + leather.getItemsRequired()[1].getAmount() + " "
						+ leather.getItemsRequired()[1].getDefinitions().getName() + "'s to create a "
						+ leather.getProducedItem().getDefinitions().getName() + ".");
				return false;
			}
		}
		if (player.getSkills().getLevel(Skills.CRAFTING) < leather.getLevelRequired()) {
			player.getPackets().sendGameMessage("You need a Crafting level of at least " + leather.getLevelRequired()
			+ " to craft a " + leather.getProducedItem().getDefinitions().getName());
			return false;
		}
		return true;
	}

	@Override
	public int processWithDelay(Player player) {
		ticks--;
		player.setNextAnimation(new Animation(1249));
		double xp = leather.getExperience();
		player.getSkills().addXp(Skills.CRAFTING, xp);
		for (Item required : leather.getItemsRequired()) {
			if (required.getId() == 4 || required.getId() == 2976 || required.getId() == 1594
					|| required.getId() == 1599 || required.getId() == 5523)
				continue;
			player.getInventory().deleteItem(required.getId(), required.getAmount());
		}
		int amount = leather.getProducedItem().getAmount();
		player.getInventory().addItem(leather.getProducedItem().getId(), amount);
		player.getPackets().sendGameMessage(
				"You have successfully crafted " + leather.getProducedItem().getDefinitions().getName() + ".", true);
		if (ticks > 0) {
			return 3;
		}
		return -1;
	}

	@Override
	public void stop(Player player) {
		setActionDelay(player, 3);
	}
}
