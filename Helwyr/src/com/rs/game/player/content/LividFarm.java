package com.rs.game.player.content;

import com.rs.game.Animation;
import com.rs.game.Graphics;
import com.rs.game.player.AchievementLogger;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.utils.Utils;

public class LividFarm {
	/**
	 * Main Data
	 */
	public static int bucket = 20933, orb = 6950, logs = 1511, LADY = 7530, plant = 20704, bunchedplant = 20705, exp = 10, othskill = 5;
	/*
	 * XP Boosting rates
	 */
	public static int boostedxp = 10;

	public static boolean bunchPlants(Player player, int itemId) {
		if (itemId == 20704) {
			if (!player.getInventory().containsItem(plant, 1) || player.getLastBunch() > Utils.currentTimeMillis()) {
				return true;
			}
			final int swapped = player.getInventory().swapIds(plant, bunchedplant);
			if (swapped > 0) {
				player.getSkills().addXp(Skills.HERBLORE, othskill);
				player.sm("You have bunched the plant.");
				player.setLastBunch(Utils.currentTimeMillis() + 700);
			}
			AchievementLogger.handleFarming(player);
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param player
	 */
	public static void CheckforLogs(Player player) {
		if (player.getInventory().containsItem(logs, 28)) {
			player.getInventory().deleteItem(logs, 28);
			player.getInventory().addItemMoneyPouch(bucket, 1);
			player.lividfarm = true;
			player.getDialogueManager().startDialogue("SimpleNPCMessage", LADY, "Thanks for the logs! Now go make me plants, " + player.getDisplayName() + ".");
			player.sm("Congratulations! You can now do Livid Farm.");
		} else {
			player.sm("You have to get 28 logs to Lady Servil.");
		}
	}

	/**
	 * 
	 * @param player
	 */
	public static void deposit(Player player) {
		if (player.getInventory().containsItem(bunchedplant, 27)) {
			player.getSkills().addXp(Skills.FARMING, boostedxp);
			player.setNextAnimation(new Animation(780));
			player.getSkills().addXp(Skills.MAGIC, othskill);
			player.getSkills().addXp(Skills.CRAFTING, othskill);
			player.getInventory().deleteItem(bunchedplant, 27);
			player.getInventory().refresh();
			player.setLividpoints(player.getLividpoints() + 75);
			player.sm("You receive points, you have now: " + player.getLividpoints() + ".");
			player.getDialogueManager().startDialogue("SimpleNPCMessage", LADY, "You're so helpful, " + player.getDisplayName() + ". Thank you!");
		} else {
			player.sm("You must have 27 bunched plants to deposit.");
		}
	}

	/*
	 * Item Points handling
	 */
	public static void HighLanderSet(Player player) {
		if (player.getLividpoints() >= 2500) {
			player.setLividpoints(player.getLividpoints() - 2500);
			player.getInterfaceManager().closeChatBoxInterface();
			player.getInventory().addItemMoneyPouch(22693, 1);
			player.getInventory().addItemMoneyPouch(22703, 1);
			player.getInventory().addItemMoneyPouch(22713, 1);
			player.getInventory().refresh();
			player.sm("Your payment was succesful, current points: " + player.getLividpoints() + ".");
		} else {
			player.getInterfaceManager().closeChatBoxInterface();
			player.sm("You have no enough points. Highlander set costs 2,500 livid points.");
		}
	}

	/**
	 * 
	 * @param player
	 */
	public static void MakePlants(Player player) {
		if (player.getInventory().containsItem(bucket, 1)) {
			player.lock(3);
			player.setNextAnimation(new Animation(4853));
			player.sm("You have grown livid plant.");
			player.getInventory().addItemMoneyPouch(plant, 1);

			player.setNextAnimation(new Animation(2282));
			player.getInventory().refresh();
		} else {

		}
		if (player.getInventory().containsItem(orb, 1)) {
			player.lock(3);
			player.sm("You have grown livid plant.");
			player.getInventory().addItemMoneyPouch(plant, Utils.getRandom(3));
			player.getInventory().refresh();
			player.setNextAnimation(new Animation(778));
			player.setNextGraphics(new Graphics(2039));
		} else {
			/*
			 * This is supposed to do nothing.
			 */
		}
	}

	/**
	 * Orb: Autobunches all the plants
	 * 
	 * @param player
	 */
	public static void OrbBunch(Player player) {
		final int amount = player.getInventory().getAmountOf(plant);
		player.getInventory().deleteItem(plant, amount);
		player.getInventory().addItem(bunchedplant, amount);
		if (amount > 0) {
			player.getSkills().addXp(Skills.HERBLORE, othskill * amount);
			player.getInventory().refresh();
			player.setLastBunch(Utils.currentTimeMillis() + 700);
			player.sm("You use power of your magical orb, all your plants are bunched.");
		}
	}

	public static void OrbPayment(Player player) {
		if (player.getLividpoints() >= 2800) {
			player.setLividpoints(player.getLividpoints() - 2800);
			player.getInterfaceManager().closeChatBoxInterface();
			player.getInventory().addItemMoneyPouch(orb, 1);
			player.getInventory().refresh();
			player.sm("Your payment was succesful, current points: " + player.getLividpoints() + ".");

		} else {
			player.getInterfaceManager().closeChatBoxInterface();
			player.sm("You have no enough points. Highlander set costs 2,500 livid points.");

		}
	}

	/*
	 * Player-owned experience settings, after reaching 80+ farming.
	 */
	public static void setCrafting(Player player) {
		player.lividcraft = true;
		player.sm("You will be gaining now Crafting experience only.");
		player.lividmagic = false;
		player.lividfarming = false;
	}

	public static void setFarming(Player player) {
		player.lividcraft = false;
		player.sm("You will be gaining now Crafting experience only.");
		player.lividmagic = false;
		player.lividfarming = true;
	}

	public static void setMagic(Player player) {
		player.lividcraft = false;
		player.sm("You will be gaining now Magic experience only.");
		player.lividmagic = true;
		player.lividfarming = false;
	}

	/**
	 * 
	 * @param player
	 */
	public static void TakeLogs(Player player) {
		player.sm("You have taken a log.");
		player.getInventory().addItemMoneyPouch(logs, 1);
		player.lock(1);
		player.lividfarm = false; // <- Reseter
		player.setNextAnimation(new Animation(832));
	}

	/**
	 * 
	 * @param player
	 */
	public static void takemoreLogs(Player player) {
		player.sm("You have taken five logs.");
		player.lock(2);
		player.getInventory().addItemMoneyPouch(1511, 5);
		player.lividfarm = false; // <- Reseter
		player.setNextAnimation(new Animation(832));
	}
}
