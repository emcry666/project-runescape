//package com.rs.game.player.content.grandExchange;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.HashMap;
//
//import com.rs.game.World;
//import com.rs.game.item.Item;
//import com.rs.game.item.ItemsContainer;
//import com.rs.game.player.Player;
//import com.rs.utils.Logger;
//import com.thoughtworks.xstream.XStream;
//
//public class GrandExchangeLoader {
//
//    private static GrandExchangeLoader INSTANCE;
//
//    public String fromObject(Object object) {
//	XStream xstream = new XStream();
//	return xstream.toXML(object);
//    }
//
//    public Object toObject(String xml) {
//	XStream xstream = new XStream();
//	return xstream.fromXML(xml);
//    }
//
//    @SuppressWarnings("unchecked")
//    public GrandExchangeLoader load() {
//	PreparedStatement ps = null;
//	ResultSet result = null;
//	Connection con = null;
//	try {
//	    con = World.getDatabase().getConnection();
//	    ps = con.prepareStatement("SELECT * FROM `frostbite_ge_offers`");
//	    result = ps.executeQuery();
//
//	    while (result.next()) {
//		ArrayList<OfferHistory> offers_track = new ArrayList<OfferHistory>();
//		HashMap<Integer, Integer> prices = new HashMap<Integer, Integer>();
//		if (result.getString("offers_track").length() > 3) {
//		    offers_track = (ArrayList<OfferHistory>) toObject(result
//			    .getString("offers_track"));
//		}
//		if (result.getString("prices").length() > 3) {
//		    prices = (HashMap<Integer, Integer>) toObject(result
//			    .getString("prices"));
//		}
//		GrandExchange.load(offers_track, prices);
//
//	    }
//
//	    System.out.println("Initializing "
//		    + GrandExchange.getOffers().size()
//		    + " Grand Exchange offers.");
//
//	} catch (Exception e) {
//	    e.printStackTrace();
//	    System.out.println("Unable to load the Grand Exchange from database.");
//	    Logger.handle(e);
//	} finally {
//	    try {
//		if (result != null) {
//		    result.close();
//		}
//		result = null;
//		ps.close();
//		ps = null;
//		con.close();
//		con = null;
//	    } catch (SQLException e) {
//	    }
//	}
//	return this;
//    }
//
//    @SuppressWarnings("resource")
//    public GrandExchangeLoader save() {
//	PreparedStatement ps = null;
//	Connection con = null;
//	try {
//	    con = World.getDatabase().getConnection();
//	    ps = con.prepareStatement("DELETE FROM `frostbite_ge_offers`");
//	    ps.executeUpdate();
//
//	    StringBuilder query = new StringBuilder();
//
//	    query.append("INSERT INTO `frostbite_ge_offers` (`offers_track`, `prices`) VALUES(");
//	    StringBuilder offers_track = new StringBuilder(), prices = new StringBuilder();
//
//	    if (GrandExchange.getOffersTrack().size() != 0) {
//		offers_track.append(fromObject(GrandExchange.getOffersTrack()));
//	    } else {
//		offers_track.append("-1");
//	    }
//
//	    if (GrandExchange.getPrices().size() != 0) {
//		prices.append(fromObject(GrandExchange.getPrices()));
//	    } else {
//		prices.append("-1");
//	    }
//
//	    query.append("'" + offers_track + "'").append(",");
//	    query.append("'" + prices + "'").append(")");
//
//	    ps = con.prepareStatement(query.toString());
//	    ps.executeUpdate();
//
//	} catch (Exception e) {
//	    System.out.println("Unable to save the Grand Exchange into the database.");
//	    Logger.handle(e);
//	} finally {
//	    try {
//		ps.close();
//		ps = null;
//		con.close();
//		con = null;
//	    } catch (SQLException e) {
//	    }
//	}
//	return this;
//    }
//
//    public static boolean contains(long id) {
//	PreparedStatement ps = null;
//	ResultSet result = null;
//	Connection con = null;
//	try {
//	    con = World.getDatabase().getConnection();
//	    ps = con.prepareStatement("SELECT * FROM `frostbite_grandexchange` WHERE offer_uid="
//		    + id + "");
//	    result = ps.executeQuery();
//
//	    if (result.next()) {
//		return true;
//	    }
//
//	} catch (Exception e) {
//	    e.printStackTrace();
//	} finally {
//	    try {
//		if (result != null) {
//		    result.close();
//		}
//		result = null;
//		ps.close();
//		ps = null;
//		con.close();
//		con = null;
//	    } catch (SQLException e) {
//	    }
//	}
//	return false;
//    }
//
//    public static boolean removeOffer(long uid) {
//	PreparedStatement ps = null;
//	Connection con = null;
//	try {
//	    con = World.getDatabase().getConnection();
//	    ps = con.prepareStatement("DELETE FROM `frostbite_grandexchange` WHERE offer_uid="
//		    + uid + "");
//	    ps.executeUpdate();
//	    return true;
//
//	} catch (Exception e) {
//	    e.printStackTrace();
//	} finally {
//	    try {
//		ps.close();
//		ps = null;
//		con.close();
//		con = null;
//	    } catch (SQLException e) {
//	    }
//	}
//	return false;
//    }
//
//    public static boolean updateOffer(Offer offer, boolean creating, long uid) {
//	PreparedStatement ps = null;
//	Connection con = null;
//	try {
//		
//		System.out.println("Starting Update Offer.");
//	    con = World.getDatabase().getConnection();
//
//	    StringBuilder query = new StringBuilder();
//
//	    StringBuilder receivedItems = new StringBuilder();
//
//	    if (offer.getReceivedItems().get(0) != null) {
//		receivedItems.append(
//			"" + offer.getReceivedItems().get(0).getId() + ","
//				+ offer.getReceivedItems().get(0).getAmount()
//				+ "").append(",");
//	    } else {
//		receivedItems.append("-1,-1").append(",");
//	    }
//	    if (offer.getReceivedItems().get(1) != null) {
//		receivedItems.append(
//			"" + offer.getReceivedItems().get(1).getId() + ","
//				+ offer.getReceivedItems().get(1).getAmount()
//				+ "").append(",");
//	    } else {
//		receivedItems.append("-1,-1").append(",");
//	    }
//
//	    if (contains(offer.getUid())) {
//
//		ps = con.prepareStatement("UPDATE `frostbite_grandexchange`  SET offer_item_id='"
//			+ offer.getId()
//			+ "',"
//			+ "offer_item_amount='"
//			+ offer.getAmount()
//			+ "',"
//			+ "offer_item_price='"
//			+ offer.getPrice()
//			+ "',"
//			+ "offer_isBuying='"
//			+ (offer.isBuying() ? 1 : 0)
//			+ "',"
//			+ "offer_receivedItems='"
//			+ receivedItems.substring(0, receivedItems.length() - 1)
//			+ "',"
//			+ "offer_canceled='"
//			+ (offer.isCanceled() ? 1 : 0)
//			+ "',"
//			+ "offer_totalPriceSoFar='"
//			+ offer.getTotalPriceSoFar()
//			+ "',"
//			+ "offer_totalAmmountSoFar='"
//			+ offer.getTotalAmmountSoFar()
//			+ "'"
//			+ " WHERE offer_uid='" + offer.getUid() + "'");
//		ps.executeUpdate();
//	    } else {
//
//		query.append("INSERT INTO `frostbite_grandexchange` (`player_name`,`offer_uid`, `offer_item_id`, `offer_item_amount`, `offer_item_price`, `offer_isBuying`, `offer_receivedItems`"
//			+ ", `offer_canceled`, `offer_totalPriceSoFar`, `offer_totalAmmountSoFar`) VALUES(");
//
//		query.append("'" + offer.getOwnerName() + "'").append(",");
//		query.append("'" + uid + "'").append(",");
//		query.append("'" + offer.getId() + "'").append(",");
//		query.append("'" + offer.getAmount() + "'").append(",");
//		query.append("'" + offer.getPrice() + "'").append(",");
//		query.append("'" + (offer.isBuying() ? 1 : 0) + "'")
//		.append(",");
//		query.append(
//			"'"
//				+ receivedItems.substring(0,
//					receivedItems.length() - 1) + "'")
//		.append(",");
//		query.append("'" + (offer.isCanceled() ? 1 : 0) + "'").append(
//			",");
//		query.append("'" + offer.getTotalPriceSoFar() + "'")
//		.append(",");
//		query.append("'" + offer.getTotalAmmountSoFar() + "'").append(
//			")");
//
//		ps = con.prepareStatement(query.toString());
//		ps.executeUpdate();
//	    }
//	    
//	    System.out.println("Finished Updating Offer.");
//
//	} catch (Exception e) {
//	    Logger.log("GrandExchangeLoader",
//		    "Unable to append Grand Exchange offer into the database.");
//	    Logger.handle(e);
//	} finally {
//	    try {
//		ps.close();
//		ps = null;
//		con.close();
//		con = null;
//	    } catch (SQLException e) {
//		e.printStackTrace();
//	    }
//	}
//	return true;
//    }
//
//    public static Offer getOffer(long uid, Player player, int slot) {
//	if (!contains(uid)) {
//	    return null;
//	}
//	PreparedStatement ps = null;
//	ResultSet result = null;
//	Connection con = null;
//	try {
//	    con = World.getDatabase().getConnection();
//	    ps = con.prepareStatement("SELECT * FROM `frostbite_grandexchange` WHERE offer_uid='"
//		    + uid + "' LIMIT 1");
//	    result = ps.executeQuery();
//	    if (result.next()) {
//
//		ResultSet cached = result;
//
//		String[] items = result.getString("offer_receivedItems").split(
//			",");
//
//		ItemsContainer<Item> receivedItems = new ItemsContainer<Item>(
//			2, true);
//
//		if (!items[0].equals("-1")) {
//		    receivedItems.set(0, new Item(Integer.valueOf(items[0]),
//			    Integer.valueOf(items[1])));
//		}
//		if (!items[2].equals("-1")) {
//		    receivedItems.set(1, new Item(Integer.valueOf(items[2]),
//			    Integer.valueOf(items[3])));
//		}
//
//		Offer offer = new Offer(cached.getInt("offer_item_id"),
//			cached.getInt("offer_item_amount"),
//			cached.getInt("offer_item_price"),
//			cached.getBoolean("offer_isBuying"), false, uid,
//			receivedItems, cached.getInt("offer_totalPriceSoFar"),
//			cached.getInt("offer_totalAmmountSoFar"),
//			cached.getBoolean("offer_canceled"),
//			cached.getString("player_name"));
//		offer.link(slot, player);
//
//		return offer;
//	    }
//	} catch (Exception e) {
//	    System.err.println("Error Loading the GE offer uid: " + uid);
//	    e.printStackTrace();
//	} finally {
//	    try {
//		if (result != null) {
//		    result.close();
//		}
//		result = null;
//		ps.close();
//		ps = null;
//		con.close();
//		con = null;
//	    } catch (SQLException e) {
//	    }
//	}
//	return null;
//    }
//
//    public static HashMap<Long, Offer> getPossibleOffers(Offer offer) {
//	PreparedStatement ps = null;
//	ResultSet result = null;
//	Connection con = null;
//	HashMap<Long, Offer> possibleOffers = new HashMap<Long, Offer>();
//	try {
//	    con = World.getDatabase().getConnection();
//	    ps = con.prepareStatement("SELECT * FROM `frostbite_grandexchange` WHERE offer_item_id='"
//		    + offer.getId() + "'");
//	    result = ps.executeQuery();
//	    while (result.next()) {
//
//		ResultSet cached = result;
//
//		String[] items = result.getString("offer_receivedItems").split(
//			",");
//
//		ItemsContainer<Item> receivedItems = new ItemsContainer<Item>(
//			2, true);
//
//		if (!items[0].equals("-1")) {
//		    receivedItems.add(new Item(Integer.valueOf(items[0]),
//			    Integer.valueOf(items[1])));
//		}
//		if (!items[2].equals("-1")) {
//		    receivedItems.add(new Item(Integer.valueOf(items[2]),
//			    Integer.valueOf(items[3])));
//		}
//
//		Offer possibleOffer = new Offer(cached.getInt("offer_item_id"),
//			cached.getInt("offer_item_amount"),
//			cached.getInt("offer_item_price"),
//			cached.getBoolean("offer_isBuying"), false,
//			cached.getLong("offer_uid"), receivedItems,
//			cached.getInt("offer_totalPriceSoFar"),
//			cached.getInt("offer_totalAmmountSoFar"),
//			cached.getBoolean("offer_canceled"),
//			cached.getString("player_name"));
//
//		possibleOffers.put(cached.getLong("offer_uid"), possibleOffer);
//	    }
//
//	    return possibleOffers;
//	} catch (Exception e) {
//	    System.err.println("Error Loading possible ge offers.");
//	    e.printStackTrace();
//	} finally {
//	    try {
//		if (result != null) {
//		    result.close();
//		}
//		result = null;
//		ps.close();
//		ps = null;
//		con.close();
//		con = null;
//	    } catch (SQLException e) {
//	    }
//	}
//	return null;
//    }
//
//    public static HashMap<Long, Offer> getOffers() {
//	PreparedStatement ps = null;
//	ResultSet result = null;
//	Connection con = null;
//	HashMap<Long, Offer> possibleOffers = new HashMap<Long, Offer>();
//	try {
//	    con = World.getDatabase().getConnection();
//	    ps = con.prepareStatement("SELECT * FROM `frostbite_grandexchange`");
//	    result = ps.executeQuery();
//	    while (result.next()) {
//
//		ResultSet cached = result;
//
//		String[] items = result.getString("offer_receivedItems").split(
//			",");
//
//		ItemsContainer<Item> receivedItems = new ItemsContainer<Item>(
//			2, true);
//
//		if (!items[0].equals("-1")) {
//		    receivedItems.add(new Item(Integer.valueOf(items[0]),
//			    Integer.valueOf(items[1])));
//		}
//		if (!items[2].equals("-1")) {
//		    receivedItems.add(new Item(Integer.valueOf(items[2]),
//			    Integer.valueOf(items[3])));
//		}
//
//		Offer possibleOffer = new Offer(cached.getInt("offer_item_id"),
//			cached.getInt("offer_item_amount"),
//			cached.getInt("offer_item_price"),
//			cached.getBoolean("offer_isBuying"), false,
//			cached.getLong("offer_uid"), receivedItems,
//			cached.getInt("offer_totalPriceSoFar"),
//			cached.getInt("offer_totalAmmountSoFar"),
//			cached.getBoolean("offer_canceled"),
//			cached.getString("player_name"));
//
//		possibleOffers.put(cached.getLong("offer_uid"), possibleOffer);
//	    }
//
//	    return possibleOffers;
//	} catch (Exception e) {
//	    System.err.println("Error Loading possible ge offers.");
//	    e.printStackTrace();
//	} finally {
//	    try {
//		if (result != null) {
//		    result.close();
//		}
//		result = null;
//		ps.close();
//		ps = null;
//		con.close();
//		con = null;
//	    } catch (SQLException e) {
//	    }
//	}
//	return null;
//    }
//
//    public static GrandExchangeLoader get() {
//	if (INSTANCE == null) {
//	    INSTANCE = new GrandExchangeLoader();
//	}
//	return INSTANCE;
//    }
//}
