package com.rs.game.player.actions;

import java.util.HashMap;
import java.util.Map;

import com.rs.game.Animation;
import com.rs.game.WorldObject;
import com.rs.game.item.Item;
import com.rs.game.player.Equipment;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.utils.Utils;

public class Smelting extends Action {

	public enum SmeltingBar {

		BRONZE(1, 6.2, new Item[] { new Item(436), new Item(438) }, new Item(
				2349), 0),

		BLURITE(8, 8.0, new Item[] { new Item(668) }, new Item(9467), 1),

		IRON(15, 12.5, new Item[] { new Item(440) }, new Item(2351), 2),

		SILVER(20, 13.7, new Item[] { new Item(442) }, new Item(2355), 3),

		STEEL(30, 17.5, new Item[] { new Item(440), new Item(453, 2) },
				new Item(2353), 4),

		GOLD(40, 22.5, new Item[] { new Item(444) }, new Item(2357), 5),

		MITHRIL(50, 30, new Item[] { new Item(447), new Item(453, 4) },
				new Item(2359), 6),

		ADAMANT(70, 37.5, new Item[] { new Item(449), new Item(453, 6) },
				new Item(2361), 7),

		RUNE(85, 50, new Item[] { new Item(451), new Item(453, 8) }, new Item(
				2363), 8),

		DRAGONBANE(80, 50, new Item[] { new Item(21779) }, new Item(21783, 1),
				9),

		WALLASALKIBANE(80, 50, new Item[] { new Item(21780) }, new Item(21784,
				1), 10),

		BASILISKBANE(80, 50, new Item[] { new Item(21781) },
				new Item(21785, 1), 11),

		ABYSSSALBANE(80, 50, new Item[] { new Item(21782) },
				new Item(21786, 1), 11),

		CANNON_BALLS(35, 25.6,
				new Item[] { new Item(2353, 1), new Item(4, 1) },
				new Item(2, 4), 1),
		

		NOVITE(1, 7, new Item[]
		{ new Item(17630) }, new Item(17650), Skills.SMITHING),

		BATHUS(10, 13.3, new Item[]
		{ new Item(17632) }, new Item(17652), Skills.SMITHING),

		MARMAROS(20, 19.6, new Item[]
		{ new Item(17634) }, new Item(17654), Skills.SMITHING),

		KRATONITE(30, 25.9, new Item[]
		{ new Item(17636) }, new Item(17656), Skills.SMITHING),

		FRACTITE(40, 32.2, new Item[]
		{ new Item(17638) }, new Item(17658), Skills.SMITHING),

		ZEPHYRIUM(50, 38.5, new Item[]
		{ new Item(17640) }, new Item(17660), Skills.SMITHING),

		ARGONITE(60, 44.8, new Item[]
		{ new Item(17642) }, new Item(17662), Skills.SMITHING),

		KATAGON(70, 51.1, new Item[]
		{ new Item(17644) }, new Item(17664), Skills.SMITHING),

		GORGONITE(80, 57.4, new Item[]
		{ new Item(17646) }, new Item(17666), Skills.SMITHING),

		PROMETHIUM(90, 63.7, new Item[]
		{ new Item(17648) }, new Item(17668), Skills.SMITHING),

		MOLTEN_GLASS(1, 20, new Item[]
		{ new Item(1783, 1), new Item(1781, 1) }, new Item(1775, 1), Skills.CRAFTING),

		SILVER_SICKLE(18, 50, new Item[]
		{ new Item(2355, 1), new Item(2976, 1) }, new Item(2961, 1), Skills.CRAFTING),

		HOLY_SYMBOL(16, 50, new Item[]
		{ new Item(2355, 1), new Item(1599, 1) }, new Item(1718, 1), Skills.CRAFTING),

		UNHOLY_SYMBOL(16, 50, new Item[]
		{ new Item(2355, 1), new Item(1594, 1) }, new Item(1724, 1), Skills.CRAFTING),

		UNCHARGED_TIARA(23, 52.5, new Item[]
		{ new Item(2355, 1), new Item(5523, 1) }, new Item(5525, 1), Skills.CRAFTING);

		private static Map<Integer, SmeltingBar> bars = new HashMap<Integer, SmeltingBar>();
		private static Map<Integer, SmeltingBar> forOres = new HashMap<Integer, SmeltingBar>();

		public static SmeltingBar forId(int buttonId) {
			return bars.get(buttonId);
		}

		public static SmeltingBar forOre(int oreId) {
			return forOres.get(oreId);
		}

		static {
			for (SmeltingBar bar : SmeltingBar.values()) {
				bars.put(bar.getButtonId(), bar);
			}

			for (SmeltingBar bar : SmeltingBar.values()) {
				for (Item item : bar.getItemsRequired()) {
					if (bar.getProducedBar().getId() == 2353)
						continue;
					forOres.put(item.getId(), bar);
				}
			}
		}

		private int levelRequired;
		private double experience;
		private Item[] itemsRequired;
		private int buttonId;
		private Item producedBar;

		private SmeltingBar(int levelRequired, double experience,
				Item[] itemsRequired, Item producedBar, int buttonId) {
			this.levelRequired = levelRequired;
			this.experience = experience;
			this.itemsRequired = itemsRequired;
			this.producedBar = producedBar;
			this.buttonId = buttonId;
		}

		public Item[] getItemsRequired() {
			return itemsRequired;
		}

		public int getLevelRequired() {
			return levelRequired;
		}

		public Item getProducedBar() {
			return producedBar;
		}

		public double getExperience() {
			return experience;
		}

		public int getButtonId() {
			return buttonId;
		}
	}

	public SmeltingBar bar;
	public WorldObject object;
	public int ticks;

	public Smelting(int slotId, WorldObject object, int ticks) {
		this.object = object;
		this.bar = SmeltingBar.forId(slotId);
		this.ticks = ticks;
	}

	public Smelting(SmeltingBar bar, WorldObject object, int ticks) {
		this.object = object;
		this.bar = bar;
		this.ticks = ticks;
	}

	@Override
	public boolean start(Player player) {
		if (bar == null || player == null || object == null) {
			return false;
		}
		if (!player.getInventory().containsItem(
				bar.getItemsRequired()[0].getId(),
				bar.getItemsRequired()[0].getAmount())) {
			player.getDialogueManager().startDialogue(
					"SimpleMessage",
					"You need "
							+ bar.getItemsRequired()[0].getDefinitions()
									.getName() + " to create a "
							+ bar.getProducedBar().getDefinitions().getName()
							+ ".");
			return false;
		}
		if (bar.getItemsRequired().length > 1) {
			if (!player.getInventory().containsItemToolBelt(
					bar.getItemsRequired()[1].getId(),
					bar.getItemsRequired()[1].getAmount())) {
				player.getDialogueManager().startDialogue(
						"SimpleMessage",
						"You need "
								+ bar.getItemsRequired()[1].getDefinitions()
										.getName()
								+ " to create a "
								+ bar.getProducedBar().getDefinitions()
										.getName() + ".");
				return false;
			}
		}
		if (player.getSkills().getLevel(Skills.SMITHING) < bar
				.getLevelRequired()) {
			player.getDialogueManager().startDialogue(
					"SimpleMessage",
					"You need a Smithing level of at least "
							+ bar.getLevelRequired() + " to smelt "
							+ bar.getProducedBar().getDefinitions().getName());
			return false;
		}
		player.sm("You place the required ores and attempt to create a bar of "
				+ bar.getProducedBar().getDefinitions().getName().toLowerCase()
						.replace(" bar", "") + ".");
		return true;
	}

	@Override
	public boolean process(Player player) {
		if (bar == null || player == null || object == null) {
			return false;
		}
		if (!player.getInventory().containsItem(
				bar.getItemsRequired()[0].getId(),
				bar.getItemsRequired()[0].getAmount())) {
			player.getDialogueManager().startDialogue(
					"SimpleMessage",
					"You need "
							+ bar.getItemsRequired()[0].getDefinitions()
									.getName() + " to create a "
							+ bar.getProducedBar().getDefinitions().getName()
							+ ".");
			return false;
		}
		if (bar.getItemsRequired().length > 1) {
			if (!player.getInventory().containsItem(
					bar.getItemsRequired()[1].getId(),
					bar.getItemsRequired()[1].getAmount())) {
				player.getDialogueManager().startDialogue(
						"SimpleMessage",
						"You need "
								+ bar.getItemsRequired()[1].getDefinitions()
										.getName()
								+ " to create a "
								+ bar.getProducedBar().getDefinitions()
										.getName() + ".");
				return false;
			}
		}
		if (player.getSkills().getLevel(Skills.SMITHING) < bar
				.getLevelRequired()) {
			player.getDialogueManager().startDialogue(
					"SimpleMessage",
					"You need a Smithing level of at least "
							+ bar.getLevelRequired() + " to smelt "
							+ bar.getProducedBar().getDefinitions().getName());
			return false;
		}
		player.faceObject(object);
		return true;
	}

	public boolean isSuccessFull(Player player) {
		if (bar == SmeltingBar.IRON) {
			if (player.getEquipment().getItem(Equipment.SLOT_RING) != null
					&& player.getEquipment().getItem(Equipment.SLOT_RING)
							.getId() == 2568) {
				return true;
			} else {
				return Utils.getRandom(100) <= (player.getSkills().getLevel(
						Skills.SMITHING) >= 45 ? 80 : 50);
			}
		}
		return true;
	}

	@Override
	public int processWithDelay(Player player) {
		ticks--;
		player.setNextAnimation(new Animation(3243));
		if (bar == SmeltingBar.GOLD
				&& player.getEquipment().getGlovesId() == 776)
			player.getSkills().addXp(Skills.SMITHING, bar.getExperience() * 2);
		else
			player.getSkills().addXp(Skills.SMITHING, bar.getExperience());
		for (Item required : bar.getItemsRequired()) {
			if (required.getName().toLowerCase().contains("mould"))
				continue;
			player.getInventory().deleteItem(required.getId(),
					required.getAmount());
		}
		if (isSuccessFull(player)) {
			if (player.getDailyTask() != null)
				player.getDailyTask().incrementTask(player, 3, bar.getProducedBar().getId(), Skills.SMITHING);
			player.getInventory().addItemMoneyPouch(bar.getProducedBar());
			player.sm("You retrieve a bar of "
					+ bar.getProducedBar().getDefinitions().getName()
							.toLowerCase().replace(" bar", "") + ".");
		} else {
			player.sm("The ore is too impure and you fail to refine it.");
		}
		if (ticks > 0) {
			return 1;
		}
		return -1;
	}

	@Override
	public void stop(Player player) {
		this.setActionDelay(player, 3);
	}
}
