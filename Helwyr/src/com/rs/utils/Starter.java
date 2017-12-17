package com.rs.utils;

import com.rs.game.StarterMap;
import com.rs.game.player.Player;
import com.rs.game.player.content.bot.Bot;

public class Starter {

	public static final int MAX_STARTER_COUNT = 2;

	public static void appendStarter(Player player) {
		if ((player instanceof Bot)) {
			player.getInventory().addItem(1710, 1);
			player.getInventory().addItem(1115, 1);
			player.getInventory().addItem(1067, 1);
			player.getInventory().addItem(1153, 1);
			player.getInventory().addItem(1323, 1);
			player.getInventory().addItem(8845, 1);
			player.getInventory().addItem(3105, 1);
			player.getInventory().addItem(7458, 1);
			player.getInventory().addItem(841, 1);
			player.getInventory().addItem(1052, 1);
			player.getInventory().addItem(884, 1000);
			player.getInventory().addItem(556, 1000);
			player.getInventory().addItem(558, 1000);
			player.getInventory().addItem(380, 100);
			player.getInventory().addItem(995, 750000);
			player.starter = 1;
			return;
		}
		String ip = player.getSession().getIP();
		int count = StarterMap.getSingleton().getCount(ip);
		if (count > MAX_STARTER_COUNT) {
			return;
		}
		player.getBank().addItem(1540, 1, false);
		player.getBank().addItem(15707, 1, false);
		player.getDialogueManager().startDialogue("StarterChoice");
		player.getSquealOfFortune().setEarnedSpins(player.getSquealOfFortune().getEarnedSpins() + 2);
		player.getHintIconsManager().removeUnsavedHintIcon();
		player.getMusicsManager().reset();
		player.getCombatDefinitions().setAutoRelatie(false);
		player.getCombatDefinitions().refreshAutoRelatie();
		StarterMap.getSingleton().addIP(ip);
	}
}