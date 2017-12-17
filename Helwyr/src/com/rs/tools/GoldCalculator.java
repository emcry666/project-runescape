package com.rs.tools;

import java.io.File;
import java.io.IOException;

import com.rs.cache.Cache;
import com.rs.game.player.Player;
import com.rs.utils.SerializableFilesManager;
import com.rs.utils.Utils;

public class GoldCalculator {

	static long total;
	static int accounts;

	public static void main(String[] args) {
		Cache.init();
		File[] chars = new File("data/characters").listFiles();
		for (File acc : chars) {
			if (Utils.invalidAccountName(acc.getName().replace(".p", ""))) {
				acc.delete();
				continue;
			}
			try {
				Player player = (Player) SerializableFilesManager.loadSerializedFile(acc);
				int moneyPouchGold = player.getMoneyPouch().getCoinsAmount();//returns coins
				int inventoryGold = player.getInventory().getCoinsAmountForCalculator();//returns coins
				int bankTotal = (player.getBank().getItem(995) == null ? 0 : player.getBank().getItem(995).getAmount());
				long totalGp = moneyPouchGold + inventoryGold + bankTotal;
				total += totalGp;
				if (totalGp > 1000000) {
					System.out.println(acc.getName() + ": " + Utils.formatNumber(totalGp) + "gp");
				}
				accounts++;
			} catch (Throwable e) {
				System.out.println("failed: " + acc.getName());
			}
		}
		System.out.println("NUMBER OF ACCOUNTS = " + accounts);
		System.out.println(Utils.formatNumber(total) + " -> TOTAL GP IN GAME.");
	}

}
