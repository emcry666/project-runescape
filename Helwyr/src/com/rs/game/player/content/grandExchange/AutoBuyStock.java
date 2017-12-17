package com.rs.game.player.content.grandExchange;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.util.HashMap;
import java.util.Set;

import com.rs.Settings;
import com.rs.cache.Cache;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.utils.Logger;
import com.rs.utils.Utils;

/**
Handles custom prices

 */

public final class AutoBuyStock {

	private static String UNPACKED_PATH = "data/items/unpackedAutoBuyStock.txt";
	private static Integer DEFAULT_AMOUNT = new Integer(100000000);
	private static final String PACKED_PATH = "data/items/autoBuyStock.p";
	private static final HashMap<Integer, Integer> handledAmounts = new HashMap<Integer, Integer>();
	private static final HashMap<Integer, Integer> handledAmountsOriginal = new HashMap<Integer, Integer>();

	public static void init() {
		if (new File(PACKED_PATH).exists()) {
			loadPackedAmounts();
		} else {
			loadUnpackedAmounts();
		}
	}

	private static void loadUnpackedAmounts() {
		Logger.log("arrow", "Loading GE Autobuy...");
		try {
			BufferedReader in = new BufferedReader(
					new FileReader(UNPACKED_PATH));
			DataOutputStream out = new DataOutputStream(new FileOutputStream(
					PACKED_PATH));
			while (true) {
				String line = in.readLine();
				if (line == null)
					break;
				if (line.startsWith("//"))
					continue;
				String[] splitedLine = line.split(" ", 2);
				int itemId = Integer.valueOf(splitedLine[0]);
				int amount = Integer.valueOf(splitedLine[1]);
				out.writeShort(itemId);
				out.writeShort(amount);
				addAmount(itemId, amount);
			}
			in.close();
			out.close();
		} catch (Throwable e) {
			Logger.handle(e);
		}
	}

	private static void loadPackedAmounts() {
		try {
			RandomAccessFile in = new RandomAccessFile(PACKED_PATH, "r");
			FileChannel channel = in.getChannel();
			ByteBuffer buffer = channel.map(MapMode.READ_ONLY, 0,
					channel.size());
			while (buffer.hasRemaining()) {
				int itemId = buffer.getShort() & 0xffff;
				int amount = buffer.getShort() & 0xffff;
				addAmount(itemId, amount);
			}
			channel.close();
			in.close();
		} catch (Throwable e) {
			Logger.handle(e);
		}
	}

	public static void addAmount(int itemId, int amount) {
			Cache.init();
			for(int item = 0; item < Utils.getItemDefinitionsSize(); item++) {
				ItemDefinitions defs = ItemDefinitions.getItemDefinitions(item);
				
				if(defs.getName().toLowerCase().contains("partyhat") || defs.getName().toLowerCase().contains("party") || defs.getName().toLowerCase().contains("torva") || defs.getName().toLowerCase().contains("virtus")
						|| defs.getName().toLowerCase().contains("pernix") || defs.getName().toLowerCase().contains("drygore") || defs.getName().toLowerCase().contains("shadow")
						|| defs.getName().toLowerCase().contains("noxious") || defs.getName().toLowerCase().contains("seismic") || defs.getName().toLowerCase().contains("sirenic") || defs.getName().toLowerCase().contains("malevolent")
						|| defs.getName().toLowerCase().contains("ragefire") || defs.getName().toLowerCase().contains("steadfast") || defs.getName().toLowerCase().contains("glaiven") || defs.getName().toLowerCase().contains("crystal")
						|| defs.getName().toLowerCase().contains("key") || defs.getName().contains("loop half") || defs.getName().toLowerCase().contains("visage") || defs.getName().toLowerCase().contains("guthan")
						|| defs.getName().toLowerCase().contains("chinchompa") || defs.getName().toLowerCase().contains("zamorakian") || defs.getName().toLowerCase().contains("zuriel") || defs.getName().toLowerCase().contains("morrigan")
						|| defs.getName().equalsIgnoreCase("magic log") || defs.getName().toLowerCase().contains("dragon bones") || defs.getName().equalsIgnoreCase("runite bar")  || defs.getName().equalsIgnoreCase("runite ore")
						|| defs.getName().equalsIgnoreCase("adamantite ore") || defs.getName().equalsIgnoreCase("adamantite bar") || defs.getName().toLowerCase().contains("spirit shield") || defs.getName().toLowerCase().contains("guthans") 
						|| defs.getName().equalsIgnoreCase("saradomin sword") || defs.getName().toLowerCase().equalsIgnoreCase("big bones")
						|| defs.getName().toLowerCase().contains("baby dragon") || defs.getName().toLowerCase().contains("dragon pickaxe") || defs.getName().toLowerCase().contains("magic log")
						|| defs.getName().toLowerCase().contains("raw") || defs.getName().toLowerCase().contains("casket") || defs.getName().toLowerCase().contains("sigil")
					    || defs.getName().toLowerCase().contains("vesta") || defs.getName().toLowerCase().contains("zamorakian spear") || defs.getName().toLowerCase().contains("hilt")
						|| defs.getName().toLowerCase().contains("master") || defs.getName().toLowerCase().contains("coal ore") || defs.getName().toLowerCase().equalsIgnoreCase("logs")
						|| defs.getName().toLowerCase().contains("vesta") || defs.getName().toLowerCase().contains("statius") || defs.getName().toLowerCase().contains("hilt") || defs.getName().toLowerCase().contains("airut")
						|| defs.getName().toLowerCase().contains("godsword") || defs.getName().toLowerCase().contains("armadyl") && !defs.getName().toLowerCase().contains("battlestaff") || defs.getName().toLowerCase().contains("snapdragon")
						|| defs.getName().toLowerCase().contains("whip") || defs.getName().toLowerCase().contains("bandos") || defs.getName().toLowerCase().contains("third-age") || defs.getName().toLowerCase().contains("third age") || defs.getName().toLowerCase().contains("3rd age")
						|| defs.getName().toLowerCase().contains("3rd") || defs.getName().toLowerCase().contains("zaryte") || defs.getName().toLowerCase().contains("subjugation") || defs.getName().toLowerCase().contains("ahrim") || defs.getName().toLowerCase().contains("verac")
						|| defs.getName().toLowerCase().contains("dharok") || defs.getName().toLowerCase().contains("karil")  || defs.getName().toLowerCase().equalsIgnoreCase("ourg bones") || defs.getName().toLowerCase().equalsIgnoreCase("mogre")
						|| defs.getName().toLowerCase().contains("(e)") || defs.getName().toLowerCase().contains("santa") || defs.getName().toLowerCase().contains("ween") || defs.getName().toLowerCase().contains("cracker")
						|| defs.getName().toLowerCase().contains("pumpkin") || defs.getName().toLowerCase().contains("(or)") || defs.getName().toLowerCase().contains("easter") || defs.getName().toLowerCase().contains("diamond")
						|| defs.getName().toLowerCase().contains("shark") || defs.getName().toLowerCase().contains("rocktail") || defs.getName().toLowerCase().contains("manta ray") || defs.getName().toLowerCase().contains("disk of returning")
						|| defs.getName().toLowerCase().contains("tetsu") || defs.getName().toLowerCase().contains("seasinger") || defs.getName().toLowerCase().contains("death lotus") || defs.getName().toLowerCase().contains("noxious") || defs.getName().toLowerCase().contains("drygore")
						|| defs.getName().toLowerCase().contains("shadow") || defs.getName().toLowerCase().contains("sirenic") || defs.getName().toLowerCase().contains("tectonic") || defs.getName().toLowerCase().contains("warpriest") || defs.getName().toLowerCase().contains("dragon rider")
						|| defs.getName().toLowerCase().contains("scythe") || defs.getName().toLowerCase().contains("ascension")
						|| defs.getName().toLowerCase().contains("superior")
						|| defs.getItemTier() > 69
						) {
					continue;
					
				}

				handledAmounts.put(item, DEFAULT_AMOUNT);
				handledAmountsOriginal.put(item, DEFAULT_AMOUNT);
			}

		handledAmounts.put(itemId, amount);
		handledAmountsOriginal.put(itemId, amount);
		addItem(itemId);
	}
	
	public static void addItem(int itemId) {
		handledAmounts.put(itemId, DEFAULT_AMOUNT);
		handledAmountsOriginal.put(itemId, DEFAULT_AMOUNT);
	}

	public static void restoreStoc(int itemId, boolean fast) {
		if (handledAmounts.get(itemId) < 0) {
			handledAmounts.put(itemId, 0);
		}
		if (fast) {
			if (handledAmounts.get(itemId) + 1000 > handledAmountsOriginal
					.get(itemId)) {
				handledAmounts.put(itemId, handledAmountsOriginal.get(itemId));
			} else {
				handledAmounts.put(itemId, handledAmounts.get(itemId) + 1000);
			}
		} else {
			if (handledAmounts.get(itemId) + 50 > handledAmountsOriginal
					.get(itemId)) {
				handledAmounts.put(itemId, handledAmountsOriginal.get(itemId));
			} else {
				handledAmounts.put(itemId, handledAmounts.get(itemId) + 50);
				;
			}
		}
	}

	public static void decreaseStock(int itemId, int amountToRemove) {
		if (!handledAmounts.containsKey(itemId)) {
			return;
		}
		// WiseOldManCash.addAmount((long) GrandExchange.getPrice(itemId) *
		// amountToRemove);
		int amountBefore = handledAmounts.get(itemId).intValue();
		int newAmount = amountBefore - amountToRemove;
		handledAmounts.put(itemId, newAmount);
	}

	public static int getStockForItem(int itemId) {
		if (!handledAmounts.containsKey(itemId)) {
			return 0;
		}
		return handledAmounts.get(itemId).intValue();
	}

	public static void updateGe() {
		HashMap<Long, Offer> offers = GrandExchange.getOffers();
		for (Offer o : offers.values()) {
			if (hasStock(o.getId()) && o.isBuying() && !o.isCompleted()
					&& o.getPrice() >= GrandExchange.getPrice(o.getId())) {
				o.updateOfferFromAutoBuy();
			}
		}
	}

	public static void needRestock() {
		Set<Integer> keys = handledAmounts.keySet();
		for (int key : keys) {
			/*
	    if (!handledAmounts.containsKey(key)) { return; }
			 */
			if (handledAmounts.get(key) == null)
				continue;
			if (handledAmounts.get(key) < handledAmountsOriginal.get(key)) {
				restoreStoc(key, isFastRestock(key));
			}
		}
	}

	public static boolean hasStock(int itemId) {
		if (!handledAmounts.containsKey(itemId)) {
			return false;
		}
		return handledAmounts.get(itemId).intValue() >= 2;
	}

	public static boolean isFastRestock(int key) {
		switch (key) {
		case 554:
		case 555:
		case 556:
		case 557:
		case 558:
		case 559:
		case 562:
		case 564:
		case 566:
		case 12155:
		case 12183:
		case 313:
		case 314:
			return true;
		}
		return false;
	}
	
}