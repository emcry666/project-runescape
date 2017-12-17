package com.rs.game.player.dialogues.impl;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.Animation;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Action;
import com.rs.game.player.content.SkillsDialogue;
import com.rs.game.player.content.SkillsDialogue.ItemNameFilter;
import com.rs.game.player.dialogues.Dialogue;

public class LeatherCraftingD extends Dialogue {

	public static final int[] BASE_LEATHER = { 

			1741, 1743, 1745, 2505, 2507, 2509, 24374, 22451, 22449, 22450, 29863,

	};

	public static final double[][] EXPERIENCE = {

			{ 13.8, 16.25, 18.5, 22, 25, 27, 30, 37 }, 
			{ 32, 34, 35, 36 },
			{ 62, 124, 186, 248 },
			{ 70, 140, 210, 280 },
			{ 78, 156, 234, 312 },
			{ 86, 172, 258, 334 }, 
			{ 94, 188, 282 }, 
			{ 100, 300, 1000 }, 
			{ 10, 20, 30 }, 
			{ 50, 150, 500 },
			{ 1150, 1250, 1300 }

	};

	public static int DUNG_NEEDLE;

	private int[][] LEVELS = { 

			{ 1, 7, 9, 11, 14, 18, 19, 38 },
			{ 25, 27, 28, 29 },
			{ 57, 60, 63, 64 }, 
			{ 66, 68, 71, 72 },
			{ 73, 75, 77, 78 },
			{ 79, 82, 84, 85 }, 
			{ 87, 89, 93 }, 
			{ 86, 92, 98 }, 
			{ 3, 12, 21 },
			{ 65, 72, 78 },
			{ 91, 92, 93 } 

	};

	private static final Item[][] POTENTIAL_PRODUCTS = { 

			{ new Item(1059, 1), new Item(1061, 1), new Item(1167, 1), new Item(1063, 1), new Item(1129, 3), new Item(1095, 2), new Item(25806, 1), new Item(1169, 1) },
			{ new Item(25875, 1), new Item(25821, 1), new Item(1131, 1), new Item(25808, 1) },
			{ new Item(1065, 1), new Item(1099, 2), new Item(1135, 3), new Item(25794, 4) },
			{ new Item(2487, 1), new Item(2493, 2), new Item(2499, 3), new Item(25796, 4) },
			{ new Item(2489, 1), new Item(2495, 2), new Item(2501, 3), new Item(25798, 4) }, 
			{ new Item(2491, 1), new Item(2497, 2), new Item(2503, 3), new Item(25800, 4) },
			{ new Item(24376, 1), new Item(24379, 2), new Item(24382, 3) },
			{ new Item(22482, 500), new Item(22486, 1500), new Item(22490, 5000) },
			{ new Item(22458, 300), new Item(22462, 1000), new Item(22466, 2500) },
			{ new Item(22470, 400), new Item(22474, 1200), new Item(22478, 3500) },
			{ new Item(29854, 16), new Item(29857, 42), new Item(29860, 33) } 

	};


	private static final Item[][] REQUIRED_BASE_ITEMS = { 

			null, null, null, null, null, null, null, 
			new Item[] { new Item(22452, 1), new Item(22454, 1), new Item(22456, 1) }, 
			new Item[] { new Item(22452, 1), new Item(22454, 1), new Item(22456, 1) },
			new Item[] { new Item(22452, 1), new Item(22454, 1), new Item(22456, 1) }, 
			null, null, null 

	};

	private int index;

	@Override
	public void start() {
		index = (int) parameters[0];
		int[] ids = new int[POTENTIAL_PRODUCTS[index].length];
		for (int i = 0; i < ids.length; i++)
			ids[i] = POTENTIAL_PRODUCTS[index][i].getId();
		SkillsDialogue.sendSkillsDialogue(player, SkillsDialogue.MAKE, "Choose how many you wish to make,<br>then click on the item to begin.", 28, ids, new ItemNameFilter() {

			int count = 0;

			@Override
			public String rename(String name) {
				int levelRequired = LEVELS[index][count++];
				if (player.getSkills().getLevel(Skills.CRAFTING) < levelRequired)
					name = "<col=ff0000>" + name + "<br><col=ff0000>Level " + levelRequired;
				return name;
			}
		});
	}

	@Override
	public void run(int interfaceId, int componentId) {
		final int componentIndex = SkillsDialogue.getItemSlot(componentId);
		if (componentIndex > BASE_LEATHER.length) {
			end();
			return;
		}
		player.getActionManager().setAction(new Action() {

			int ticks;

			@Override
			public boolean start(final Player player) {
				if (!checkAll(player))
					return false;
				int leatherAmount = player.getInventory().getAmountOf(BASE_LEATHER[index]);
				int requestedAmount = SkillsDialogue.getQuantity(player);
				if (requestedAmount > leatherAmount)
					requestedAmount = leatherAmount;
				setTicks(requestedAmount);
				return true;
			}

			public void setTicks(int ticks) {
				boolean isSirenic = BASE_LEATHER[index] == 29863;
				player.getInventory().deleteItem((isSirenic ? 29864 : 1734), isSirenic ? 2 : 1);
				this.ticks = ticks;
			}

			public boolean checkAll(Player player) {
				final int levelReq = LEVELS[index][componentIndex];
				boolean isSirenic = BASE_LEATHER[index] == 29863;
				if (player.getSkills().getLevel(Skills.CRAFTING) < levelReq) {
					player.getPackets().sendGameMessage("You need a Crafting level of " + levelReq + " to craft this.");
					return false;
				}
				if (player.getInventory().getItems().getNumberOf(BASE_LEATHER[index]) < POTENTIAL_PRODUCTS[index][componentIndex].getAmount()) {
					player.getPackets().sendGameMessage("You don't have enough materials in your inventory.");
					return false;
				}
				if (!player.getInventory().containsOneItem(isSirenic ? 29864  : 1734, isSirenic ? 2 : 1)) {
					player.getPackets().sendGameMessage("You need " + (isSirenic ? "algarum thread " : "a thread ") + "in order to craft this item.");
					return false;
				}
				if (!player.getInventory().containsItemToolBelt(1733)) {
					player.getPackets().sendGameMessage("You need a needle in order to craft these materials.");
					return false;
				}
				Item[] extraItems = REQUIRED_BASE_ITEMS[index];
				if (extraItems != null) {
					Item item = extraItems[componentIndex];
					if (!player.getInventory().containsItem(item.getId(), item.getAmount())) {
						player.getPackets().sendGameMessage("You need a " + item.getName().toLowerCase() + ".");
						return false;
					}
				}
				return true;
			}

			@Override
			public boolean process(Player player) {
				return checkAll(player) && ticks > 0;
			}

			@Override
			public int processWithDelay(Player player) {
				boolean isSirenic = BASE_LEATHER[index] == 29863;
				ticks--;
				if (ticks % 4 == 0)// will use one every time AT LEAST
				player.getInventory().deleteItem((isSirenic ? 29864 : 1734), isSirenic ? 2 : 1);
				Item item = POTENTIAL_PRODUCTS[index][componentIndex];
				player.getInventory().deleteItem(new Item(BASE_LEATHER[index], item.getAmount()));
				player.getInventory().addItem(item.getId(), 1);
				player.getSkills().addXp(Skills.CRAFTING, EXPERIENCE[index][componentIndex]);
				Item[] extraItems = REQUIRED_BASE_ITEMS[index];
				if (extraItems != null)
					player.getInventory().deleteItem(extraItems[componentIndex]);
				if (player.getDailyTask() != null)
					player.getDailyTask().incrementTask(player, 3, item.getId(), Skills.CRAFTING);
				player.setNextAnimation(new Animation(1249));
				return 3;
			}

			@Override
			public void stop(Player player) {
				setActionDelay(player, 3);
			}
		});
		end();
	}

	public static int getIndex(int requestedId) {
		for (int index = 0; index < BASE_LEATHER.length; index++) {
			int baseId = BASE_LEATHER[index];
			if (requestedId == baseId)
				return index;
		}
		return -1;
	}

	@Override
	public void finish() {

	}

	public static boolean isExtraItem(int requestedId) {
		for (int index = 0; index < REQUIRED_BASE_ITEMS.length; index++) {
			Item[] items = REQUIRED_BASE_ITEMS[index];
			if (items == null)
				continue;
			for (Item item : items) {
				if (item.getId() == requestedId)
					return true;
			}
		}
		return false;
	}

}
