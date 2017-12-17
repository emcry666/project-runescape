package com.rs.game.player.content.stealingcreations;

import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.utils.Utils;

public class StealingCreationShop {

	public static void openInterface(final Player player) {
		refresh(player);
		player.getInterfaceManager().sendInterface(1128);
		player.getPackets().sendRunScriptBlank(5248);
		player.getPackets().sendHideIComponent(1128, 330, true);
		player.getPackets().sendIComponentText(1128, 13,
				"" + player.getStealingCreationPoints());
		player.setCloseInterfacesEvent(new Runnable() {

			@Override
			public void run() {
				resetSelection(player);
			}
		});
	}

	public static void purchase(Player player) {
		final boolean[] requestedList = (boolean[]) player
				.getTemporaryAttributtes().get("sc_shop_selected");
		if (requestedList == null) {
			player.getPackets().sendGameMessage(
					"You have nothing selected to purchase / re-charge");
			return;
		}
		int totalCost = 0;
		for (int index = 0; index < requestedList.length; index++) {
			if (requestedList[index])
				totalCost += POINTS_COST[index];
		}
		if (player.getStealingCreationPoints() < totalCost) {
			player.getPackets()
					.sendGameMessage("You don't have enough points.");
			resetSelection(player);
			return;
		} else if (player.getInventory().getFreeSlots() < requestedList.length) {
			player.getPackets().sendGameMessage(
					"You don't have enough space for the requested items.");
			resetSelection(player);
			return;
		}
		for (int index = 0; index < requestedList.length; index++) {
			if (requestedList[index]) {
				final int i = Utils.random(0, 2);
				if (index == 0 || index == 1) {
					player.getInventory().addItem(
							new Item(DEFAULT_PRODUCTS[index]));
					player.sm("You purchase a tool.");
				} else if (index == 2) {
					final int body[] = { 14094, 14114, 14118 };
					player.getInventory().addItem(body[i], 1);
					player.sm("You purchase a random body.");
				} else if (index == 3) {
					final int legs[] = { 14095, 14115, 14118 };
					player.getInventory().addItem(legs[i], 1);
					player.sm("You purchase a random leg.");
				} else if (index == 4) {
					final int head[] = { 14095, 14116, 14120 };
					player.getInventory().addItem(head[i], 1);
					player.sm("You purchase a random helmet.");
				} else if (index == 5) {
					final int weapon[] = { 14096, 14117, 14121 };
					player.getInventory().addItem(weapon[i], 1);
					player.sm("You purchase a random weapon.");
				} else if (index == 6) {
					final int shield[] = { 21526, 21528, 21529 };
					player.getInventory().addItem(shield[i], 1);
					player.sm("You purchase a random shield.");
				} else
					player.sm("Invalid Reward");
			}
		}
		player.setStealingCreationPoints(player.getStealingCreationPoints() - totalCost);
		refresh(player);
	}

	private static void refresh(Player player) {
		player.getPackets().sendConfigByFile(5505,
				player.getStealingCreationPoints());
	}

	private static void resetSelection(Player player) {
		player.getTemporaryAttributtes().remove("sc_shop_selected");
	}

	public static void select(Player player, int index) {
		boolean[] selectedList = (boolean[]) player.getTemporaryAttributtes()
				.get("sc_shop_selected");
		if (selectedList == null)
			selectedList = new boolean[7];
		if (selectedList[index])
			selectedList[index] = false;
		else
			selectedList[index] = true;
		player.getTemporaryAttributtes().put("sc_shop_selected", selectedList);
	}

	private static final int[] POINTS_COST = { 20, 20, 30, 28, 24, 26, 200 };

	private static final int[] DEFAULT_PRODUCTS = { 14098, 14106, 14094, 14095,
			14096, 14097, 21527 };
}
