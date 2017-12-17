package com.rs.game.player.content;


import com.rs.game.player.Player;
import com.rs.utils.Utils;


public class WellOfFortune {


	public static void handleWell(Player player) {
		
		if (player.getBoostTime() > Utils.currentTimeMillis()) {
			player.sm("<col=FF0000>You already have an active boost of "+Utils.getPercent(player.getDropBoost())+"% that expires in "+Utils.getTimeLeft(player.getBoostTime())+".");
			return;
		}
		
		player.getTemporaryAttributtes().put("well_donate", Boolean.TRUE);
		player.getPackets().sendInputIntegerScript(true, "Enter the amount you wish to drop in the well:");
	}
	
	public static int minAmount = 10000000;
	
	public static void handleBoost(Player player, int amount) {
		if (amount < 0 || amount > Integer.MAX_VALUE)
			return;
		
		if (!player.getInventory().containsItem(995, amount)) {
			player.sm("You do not have enough coins to drop in the well.");
			return;
		}
		
		double boost = 1.00;
		long time = 0;
		
		if (amount < minAmount) {
			player.sm("The Well of Fortune refuses your donation. (Too Low!)");
			return;
		}
		
		if (amount < 100000000) {
			boost = 1.05;
			time = Utils.currentTimeMillis() + (1000* 60 * 15);
		} else if (amount < 250000000) {
			boost = 1.10;
			time = Utils.currentTimeMillis() + (1000* 60 * 30);
		} else if (amount < 500000000) {
			boost = 1.12;
			time = Utils.currentTimeMillis() + (1000* 60 * 45);
		} else if (amount < 750000000) {
			boost = 1.15;
			time = Utils.currentTimeMillis() + (1000* 60 * 60);
		} else if (amount < 100000000) {
			boost = 1.17;
			time = Utils.currentTimeMillis() + (1000* 60 * 90);
		} else if (amount < Integer.MAX_VALUE) {
			boost = 1.20;
			time = Utils.currentTimeMillis() + (1000* 60 * 120);
		}
		
		player.setDropBoost(boost);
		player.setBoostTime(time);
		player.setTotalDonatedToWell(player.getTotalDonatedToWell() + amount);
		player.getInventory().deleteItem(995, amount); 
		
		//player.sm("<col=0000FF>You've received a boosted drop rate for "+Utils.getTimeLeft(player.getBoostTime())+"!");
		player.sm("<col=0000FF>You've received a "+Utils.getPercent(boost)+"% drop boost for "+Utils.getTimeLeft(player.getBoostTime())+"!");
		player.sm("<col=0000FF>You've donated a total of "+Utils.formatNumber(player.getTotalDonatedToWell())+" gold to the Well of Fortune!");
		player.sm("<col=0000FF>Donate more to the well for a better drop boost!");
	}
}