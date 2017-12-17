package com.rs.game.player.content;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

import com.rs.Settings;
import com.rs.cache.loaders.Configs;
import com.rs.game.World;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

public class ExperienceWell {

	/**
	 * The amount of time for the WorldTask.
	 */
	public static int taskAmount = 7200000;
	public static int taskTime = 7200000;

	/**
	 * Sends a dialogue for the amount to give.
	 *
	 * @param player The Player giving the amount.
	 */
	public static void give(Player player) {
		if (World.isWellActive()) {
			player.getPackets().sendGameMessage("The XP well is already active! Go train!");
			return;
		}
		player.getPackets().sendRunScript(109, "Progress: " + NumberFormat.getNumberInstance(Locale.US).format(World.getWellAmount()) + " GP (" + ((World.getWellAmount() * 100) / Settings.WELL_MAX_AMOUNT) + "% of Goal); Goal: " + NumberFormat.getNumberInstance(Locale.US).format(Settings.WELL_MAX_AMOUNT) + " GP");
		player.getTemporaryAttributtes().put("donate_xp_well", Boolean.TRUE);
	}

	/**
	 * Donates to the well the amount to give.
	 *
	 * @param player The Player donating.
	 * @param amount The amount to give.
	 */
	public static void donate(Player player, int amount) {
		if (amount < 0)
			return;
		if ((World.getWellAmount() + amount) > Settings.WELL_MAX_AMOUNT) {
			amount = Settings.WELL_MAX_AMOUNT - World.getWellAmount();
		}
		if (!player.getInventory().containsItem(995, amount) && player.getMoneyPouch().getCoinsAmount() < amount) {
			player.getPackets().sendGameMessage("You don't have that much money!");
			return;
		}
		if (amount < 100000) {
			player.getPackets().sendGameMessage("You must donate at least 100,000 (100K) GP!");
			return;
		}
		boolean pouch = !player.getInventory().containsItem(995, amount);
		if (!pouch)
			player.getInventory().deleteItem(995, amount);
		else {
			player.getPackets().sendRunScript(5561, 0, amount);
			player.getMoneyPouch().removeFromMoneyPouch(amount);
		}
		World.addWellAmount(player.getDisplayName(), amount);
		postDonation();
	}
	

	/**
	 * A check after donating to the well to see if the x2 XP should start.
	 */
	private static void postDonation() {
		if (World.getWellAmount() >= Settings.WELL_MAX_AMOUNT) {
			Configs.XP_RATE = (Configs.XP_RATE * 2);
			World.sendWorldMessage("<img=5><col=33B507>The Experience Well has consumed enough value to active Double Experience for 2 hours!", false);
			taskAmount = 7200000;
			setWellTask();
			World.setWellActive(true);
		}
	}

	/**
	 * Sets the task for the reset of the well.
	 */
	public static void setWellTask() {
		WorldTasksManager.schedule(new WorldTask() {
			@Override
			public void run() {
				World.setWellActive(false);
				World.resetWell();
				this.stop();
			}
		}, taskAmount);
	}

	/**
	 * Saves the progress of the well. If the x2 event is already active, this sends the amount
	 * left in milliseconds.
	 */
	public static void save() {
		File output = new File("./data/welldata.txt");

		if (output.canWrite()) {
			BufferedWriter out = null;
			try {
				out = new BufferedWriter(new FileWriter(output, false));
				if (World.isWellActive()) {
					out.write("true " + taskTime);
				} else {
					out.write("false " + World.getWellAmount());
				}
			} catch (IOException ignored) {
			} finally {
				if (out != null) {
					try {
						out.close();
					} catch (IOException ignored) {
					}
				}
			}
		}
	}


	public static void loadWell() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("./data/welldata.txt"));
		String line = null;
		while ((line = reader.readLine()) != null) {
			String[] args = line.split(" ");
			if (args[0].contains("true")) {
				World.setWellActive(true);
				taskTime = Integer.parseInt(args[1]);
				taskAmount = Integer.parseInt(args[1]);
				setWellTask();
			} else {
				World.setWellAmount(Integer.parseInt(args[1]));
			}
		}
	}

}
