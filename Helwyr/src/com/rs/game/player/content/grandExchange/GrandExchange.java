package com.rs.game.player.content.grandExchange;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.player.Player;
import com.rs.mysql.impl.Exchange;
import com.rs.utils.SerializableFilesManager;
import com.rs.utils.Utils;

public class GrandExchange {

	private static final Object LOCK = new Object();
	// offer uid
	 private static HashMap<Long, Offer> OFFERS;
	    private static ArrayList<OfferHistory> OFFERS_TRACK;
	    private static HashMap<Integer, Integer> PRICES;

	private static boolean edited;

	public static void init() {
		OFFERS = SerializableFilesManager.loadGEOffers();
		OFFERS_TRACK = SerializableFilesManager.loadGEHistory();
		PRICES = SerializableFilesManager.loadGEPrices();
	    AutoBuyStock.init();
	}

	public static void load(ArrayList<OfferHistory> offer_track,
			HashMap<Integer, Integer> prices) {
		OFFERS_TRACK = offer_track;
		PRICES = prices;
	}

	public static ArrayList<OfferHistory> getOffersTrack() {
		return OFFERS_TRACK;
	}

	public static HashMap<Integer, Integer> getPrices() {
		return PRICES;
	}

	public static void reset(boolean track, boolean price) {
		if (track)
			OFFERS_TRACK.clear();
		if (price)
			PRICES.clear();
		recalcPrices();
	}

	public static void recalcPrices() {
		ArrayList<OfferHistory> track = new ArrayList<OfferHistory>(
				OFFERS_TRACK);
		HashMap<Integer, BigInteger> averagePrice = new HashMap<Integer, BigInteger>();
		HashMap<Integer, BigInteger> averageQuantity = new HashMap<Integer, BigInteger>();
		for (OfferHistory o : track) {
			BigInteger price = averagePrice.get(o.getId());
			if (price != null) {
				BigInteger quantity = averageQuantity.get(o.getId());
				averagePrice.put(o.getId(),
						price.add(BigInteger.valueOf(o.getPrice())));
				averageQuantity.put(o.getId(),
						quantity.add(BigInteger.valueOf(o.getQuantity())));
			} else {
				averagePrice.put(o.getId(), BigInteger.valueOf(o.getPrice()));
				averageQuantity.put(o.getId(),
						BigInteger.valueOf(o.getQuantity()));
			}
		}

		for (int id : averagePrice.keySet()) {
			BigInteger price = averagePrice.get(id);
			BigInteger quantity = averageQuantity.get(id);

			long oldPrice = getPrice(id);
			long newPrice = price.divide(quantity).longValue();
			long min = (long) (oldPrice * 0.8D) - 100;
			long max = (long) (oldPrice * 1.2D) + 100;
			if (newPrice < min)
				newPrice = min;
			else if (newPrice > max)
				newPrice = max;

			if (newPrice < 1)
				newPrice = 1;
			else if (newPrice > Integer.MAX_VALUE)
				newPrice = Integer.MAX_VALUE;

			if (id == 1464)
				newPrice = 100000000;
			if (id == 12183)
				newPrice = 25;

			ItemDefinitions defs = new ItemDefinitions(id);
			
			if (newPrice < defs.getValue()) {
				newPrice = defs.getValue();
			}

			PRICES.put(id, (int) newPrice);
		}
		savePrices();
	}


    public static void savePrices() {
    	SerializableFilesManager.saveGEPrices(new HashMap<Integer, Integer>(PRICES));
    }

    private static void saveOffersTrack() {
    	SerializableFilesManager.saveGEHistory(new ArrayList<OfferHistory>(OFFERS_TRACK));
    }

	public static final void save() {
		if (!edited)
			return;
		edited = false;
		savePrices();
		saveOffersTrack();
		SerializableFilesManager.saveGEOffers(new HashMap<Long, Offer>(OFFERS));
	}

	public static void linkOffers(Player player) {
		boolean itemsWaiting = false;
		for (int slot = 0; slot < player.getGeManager().getOfferUIds().length; slot++) {
			Offer offer = getOffer(player, slot);
			if (offer == null)
				continue;
			offer.link(slot, player);
			offer.update();
			if (!itemsWaiting && offer.hasItemsWaiting()) {
				itemsWaiting = true;
				player.getPackets()
						.sendGameMessage(
								"You have items from the Grand Exchange waiting in your collection box.");
			}
		}
	}

	public static Offer getOffer(Player player, int slot) {
		synchronized (LOCK) {
			long uid = player.getGeManager().getOfferUIds()[slot];
			if (uid == 0)
				return null;
			Offer offer = OFFERS.get(uid);
			if (offer == null) {
				player.getGeManager().getOfferUIds()[slot] = 0; // offer
				return null;
			}
			return offer;
		}

	}

	public static void sendOffer(Player player, int slot, int itemId,
			int amount, int price, boolean buy) {
		if(price < 2)
			return;
		synchronized (LOCK) {
			Offer offer = new Offer(itemId, amount, price, buy, false,
					getUId(), player.getUsername());
			//Exchange.updateOffer(offer, true, offer.getUid());
			player.getGeManager().getOfferUIds()[slot] = createOffer(offer);
			offer.link(slot, player);
			findBuyerSeller(offer);
		}
	}

	public static void abortOffer(Player player, int slot) {
		synchronized (LOCK) {
			Offer offer = getOffer(player, slot);
			if (offer == null)
				return;
			edited = true;
			if (offer.cancel() && offer.forceRemove())
				deleteOffer(player, slot); // shouldnt here happen anyway
		}
	}

	public static void collectItems(Player player, int slot, int invSlot,
			int option) {
		synchronized (LOCK) {
			Offer offer = getOffer(player, slot);
			if (offer == null)
				return;
			edited = true;
			if (offer.collectItems(invSlot, option) && offer.forceRemove()) {
				deleteOffer(player, slot); // should happen after none left and
				// offer completed
				if (offer.getTotalAmmountSoFar() != 0) {
					OfferHistory o = new OfferHistory(offer.getId(),
							offer.getTotalAmmountSoFar(),
							offer.getTotalPriceSoFar(), offer.isBuying(),
							player.getUsername());
					OFFERS_TRACK.add(o);
					player.getGeManager().addOfferHistory(o);
				}
			}
		}
	}

	private static void deleteOffer(Player player, int slot) {
		player.getGeManager().cancelOffer(); // sends back to original screen if
		OFFERS.remove(player.getGeManager().getOfferUIds()[slot]);
		//Exchange.removeOffer(player.getGeManager().getOfferUIds()[slot]);
		player.getGeManager().getOfferUIds()[slot] = 0;
	}
	
	public static void deleteRares() {
	}

	private static void findBuyerSeller(Offer offer) {
		while (!offer.isCompleted()) {
			Offer bestOffer = null;
			for (Offer o : OFFERS.values()) {
				if (o.isBuying() == offer.isBuying()
						|| o.getId() != offer.getId()
						|| o.isCompleted()
						|| (offer.isBuying() && o.getPrice() > offer.getPrice())
						|| (!offer.isBuying() && o.getPrice() < offer
								.getPrice()) || offer.isOfferTooHigh(o))
					continue;
				if (bestOffer == null
						|| (offer.isBuying() && o.getPrice() < bestOffer
								.getPrice())
						|| (!offer.isBuying() && o.getPrice() > bestOffer
								.getPrice()))
					bestOffer = o;
			}
			if (bestOffer == null
					&& offer.isBuying()
					&& offer.getPrice() >= GrandExchange
							.getPrice(offer.getId())
					&& isAutoBuy(offer.getId())) {
				int amountToAutoBuy = offer.getAmount();
				if (AutoBuyStock.getStockForItem(offer.getId()) < offer
						.getAmount()) {
					amountToAutoBuy = AutoBuyStock.getStockForItem(offer
							.getId());
				}
				Offer autoBuyOffer = new Offer(offer.getId(), amountToAutoBuy,
						GrandExchange.getPrice(offer.getId()), false, true,
						getUId(), "AutoBuyStock");
				AutoBuyStock.decreaseStock(autoBuyOffer.getId(),
						amountToAutoBuy);
				bestOffer = autoBuyOffer;
			}

			if (bestOffer == null)
				break;
			offer.updateOffer(bestOffer);
		}
		offer.update();
	}
	

	private static long createOffer(Offer offer) {
		edited = true;
		long uid = offer.getUid();
		OFFERS.put(uid, offer);
		return uid;
	}

	private static long getUId() {
		while (true) {
			long uid = Utils.RANDOM.nextLong();
			/*
			 * if (OFFERS.containsKey(uid)) continue;
			 */
			if (OFFERS.containsKey(uid))
				continue;
			return uid;
		}
	}

	public static boolean isAutoBuy(int itemId) {
		if (AutoBuyStock.hasStock(itemId)) {
			return true;
		}
		return false;

	}

	public static int getPrice(int itemId) {
		ItemDefinitions defs = ItemDefinitions.getItemDefinitions(itemId);
		if (defs.isNoted())
			itemId = defs.getCertId();
		else if (defs.isLended())
			itemId = defs.getLendId();
		Integer price = defs.getValue(itemId);
		return price != null && price != 0 ? price : defs.getValue(itemId);
	}

	// in order not to keep player saved on memory in offers after player leaves
	// <.<
	public static void unlinkOffers(Player player) {
		for (int slot = 0; slot < player.getGeManager().getOfferUIds().length; slot++) {
			Offer offer = getOffer(player, slot);
			if (offer == null)
				continue;
			offer.unlink();
		}
	}

	public static void setItemPrice(int itemId, int price) {
		PRICES.put(itemId, price);
	}

	public static List<OfferHistory> getHistory() {
		return OFFERS_TRACK;
	}

	public static HashMap<Long, Offer> getOffers() {
		return OFFERS;
	}
	
	public static String getDisabledMessage() {
	    return "<col=880000>The Grand Exchange and it's features are currently unavalible.</col>";
	}

}
