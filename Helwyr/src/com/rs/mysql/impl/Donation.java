package com.rs.mysql.impl;

import java.sql.ResultSet;

import com.rs.cache.loaders.Configs;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.World;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.mysql.Database;
import com.rs.utils.Utils;

public class Donation implements Runnable {

	private Player player;

	@Override
	public void run() {
		try {
			Database db = new Database(Configs.HOST, Configs.USERNAME, Configs.PASSWORD, Configs.DATABASE);

			if (!db.init()) {
				System.err.println("[Donation] Failed to connect to database!");
				return;
			}

			String name = player.getUsername().replace("_", " ");
			ResultSet rs = db.executeQuery("SELECT * FROM payments WHERE player_name='"+name+"' AND claimed=0");

			while(rs.next()) {
				String item_name = rs.getString("item_name");
				int item_number = rs.getInt("item_number");
				double amount = rs.getDouble("amount");
				int quantity = rs.getInt("quantity");

				ResultSet result = db.executeQuery("SELECT * FROM products WHERE item_id="+item_number+" LIMIT 1");

				if (result == null || !result.next()
						|| !result.getString("item_name").equalsIgnoreCase(item_name)
						|| result.getDouble("item_price") != amount
						|| quantity < 1 || quantity > Integer.MAX_VALUE) {
					System.out.println("[Donation] Invalid purchase for "+name+" (item: "+item_name+", id: "+item_number+")");
					continue;
				}
				player.donatorcredits += amount;
				Item product = itemNameToItem(item_name);
				if(product != null && !handleItems(item_number)) 
					addItem(product);
				 else 
					handleItems(item_number);
				player.getPackets().sendGameMessage("<col=ff0000>Thank you for your donation! You now have x" + player.donatorcredits + " donator credits!");
				rs.updateInt("claimed", 1);
				rs.updateRow();
			}

			db.destroyAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean handleItems(int productId) {
		switch (productId) {
		case 13://Normal Donator
			player.setDonator(true);
			World.sendWorldMessage( "<img=8>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ player.getDisplayName() + " has just donated for Donator!", false);
			player.getPackets().sendGameMessage("Thank you for donating, You are now a Donator.");
			return true;
		case 14://super
			player.setDonator(false);
			player.setSuperDonator(true);
			if(!player.getInventory().hasFreeSlots()) {
				player.getBank().addItem(12681, 1, false);
			} else {
				player.getInventory().addItem(12681, 1);
			}
			World.sendWorldMessage( "<img=10>[<col=ffffff><shad=0C9CCC>Donation</col></shad>] <col=ffffff><shad=0C9CCC>"+ player.getDisplayName() + " has just donated for Super Donator!", false);
			player.getPackets().sendGameMessage("Thank you for donating, You are now a Super Donator.");
			return true;
		case 15://extreme
			player.setDonator(false);
			player.setSuperDonator(false);
			player.setExtremeDonator(true);
			if(!player.getInventory().hasFreeSlots()) {
				player.getBank().addItem(12681, 1, false);
			} else {
				player.getInventory().addItem(12681, 1);
			}
			World.sendWorldMessage( "<img=9>[<col=ffffff><shad=ff0000>Donation</col></shad>] <col=ffffff><shad=ff0000>"+ player.getDisplayName() + " has just donated for Extreme Donator!", false);
			player.getPackets().sendGameMessage("Thank you for donating, You are now an Extremne Donator.");
			return true;
		case 22://legendary
			player.setDonator(false);
			player.setSuperDonator(false);
			player.setExtremeDonator(false);
			player.setLegendDonator(true);
			World.sendWorldMessage( "<img=9>[<col=ffffff><shad=99FFFF>Donation</col></shad>] <col=ffffff><shad=99FFFF>"+ player.getDisplayName() + " has just donated for Legendary Donator!", false);
			player.getPackets().sendGameMessage("Thank you for donating, You are now a Legendary Donator.");
			return true;
		case 23://ultimate
			player.setDonator(false);
			player.setSuperDonator(false);
			player.setExtremeDonator(false);
			player.setLegendDonator(false);
			player.setUltimateDonator(true);
			World.sendWorldMessage( "<img=9>[<col=ffffff><shad=ED7818>Donation</col></shad>] <col=ffffff><shad=ED7818>"+ player.getDisplayName() + " has just donated for Ultimate Donator!", false);
			player.getPackets().sendGameMessage("Thank you for donating, You are now an Ultimate Donator.");
			return true;
		case 24://mythic
			player.setDonator(false);
			player.setSuperDonator(false);
			player.setExtremeDonator(false);
			player.setLegendDonator(false);
			player.setUltimateDonator(false);
			player.setMythicDonator(true);
			World.sendWorldMessage( "<img=9>[<col=ffffff><shad=7E00CC>Donation</col></shad>] <col=ffffff><shad=7E00CC>"+ player.getDisplayName() + " has just donated for Mythic Donator!", false);
			player.getPackets().sendGameMessage("Thank you for donating, You are now a Mythic Donator.");
			return true;
		}
		return false;
	}

	public Item itemNameToItem(String itemName) {
		Item item = null;
		String name = itemName.toLowerCase().replace("[", "(")
				.replace("]", ")").replaceAll(",", "'");
		if (name.contains("Sacred clay")) 
			return null;
		for (int i = 0; i < Utils.getItemDefinitionsSize(); i++) {
			ItemDefinitions def = ItemDefinitions
					.getItemDefinitions(i);
			if (def.getName().toLowerCase().equalsIgnoreCase(name))  
				item = new Item(i);
		}
		return item;
	}
	
	public boolean addItem(Item item) {
		if(player.getInventory().getFreeSlots() > item.getAmount() - 1)
			player.getInventory().addItem(item);
		else
			player.getBank().addItem(item.getId(), item.getAmount(), false);
		World.sendWorldMessage("<img=7><col=ffffff><shad=ff0000>" + player.getDisplayName() + " has just donated for " + Utils.formatString(item.getName()) + "!");
		return true;
	}

	public Donation(Player player) {
		this.player = player;
	}
}
