package com.rs.mysql.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import com.rs.game.World;
import com.rs.game.item.Item;
import com.rs.game.item.ItemsContainer;
import com.rs.game.player.Player;
import com.rs.game.player.content.grandExchange.Offer;
import com.rs.utils.Logger;


public class Exchange {

	private static Exchange INSTANCE;


	public static boolean contains(long id) {
		PreparedStatement ps = null;
		ResultSet result = null;
		Connection con = null;
		try {
			con = World.getDatabase().getConnection();
			ps = con.prepareStatement("SELECT * FROM `grandexchange` WHERE offer_uid="
				+ id + "");
			result = ps.executeQuery();

			if (result.next()) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (result != null) {
					result.close();
				}
				if(ps != null)
					ps.close();
				ps = null;
				if(con != null)
					con.close();
				con = null;
			} catch (SQLException e) {
			}
		}
		return false;
	}

	public static boolean removeOffer(long uid) {
		PreparedStatement ps = null;
		Connection con = null;
		try {
			con = World.getDatabase().getConnection();
			ps = con.prepareStatement("DELETE FROM `grandexchange` WHERE offer_uid="
				+ uid + "");
			ps.executeUpdate();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps != null)
					ps.close();
				ps = null;
				if(con != null)
					con.close();
				con = null;
			} catch (SQLException e) {
			}
		}
		return false;
	}

	public static boolean updateOffer(Offer offer, boolean creating, long uid) {
		PreparedStatement ps = null;
		Connection con = null;
		try {
			con = World.getDatabase().getConnection();

			StringBuilder query = new StringBuilder();

			StringBuilder receivedItems = new StringBuilder();

			if (offer.getReceivedItems().get(0) != null) {
				receivedItems.append(
					"" + offer.getReceivedItems().get(0).getId() + ","
						+ offer.getReceivedItems().get(0).getAmount()
						+ "").append(",");
			} else {
				receivedItems.append("-1,-1").append(",");
			}
			if (offer.getReceivedItems().get(1) != null) {
				receivedItems.append(
					"" + offer.getReceivedItems().get(1).getId() + ","
						+ offer.getReceivedItems().get(1).getAmount()
						+ "").append(",");
			} else {
				receivedItems.append("-1,-1").append(",");
			}

			if (contains(offer.getUid())) {

				ps = con.prepareStatement("UPDATE `grandexchange`  SET offer_item_id='"
					+ offer.getId()
					+ "',"
					+ "offer_item_amount='"
					+ offer.getAmount()
					+ "',"
					+ "offer_item_price='"
					+ offer.getPrice()
					+ "',"
					+ "offer_item_name='"
					+ offer.getName()
					+ "',"
					+ "offer_isBuying='"
					+ (offer.isBuying() ? 1 : 0)
					+ "',"
					+ "offer_receivedItems='"
					+ receivedItems.substring(0, receivedItems.length() - 1)
					+ "',"
					+ "offer_canceled='"
					+ (offer.isCanceled() ? 1 : 0)
					+ "',"
					+ "offer_totalPriceSoFar='"
					+ offer.getTotalPriceSoFar()
					+ "',"
					+ "offer_totalAmmountSoFar='"
					+ offer.getTotalAmmountSoFar()
					+ "'"
					+ " WHERE offer_uid='" + offer.getUid() + "'");
				ps.executeUpdate();
			} else {

				query.append("INSERT INTO `grandexchange` (`player_name`,`offer_uid`, `offer_item_id`, `offer_item_amount`, `offer_item_price`, `offer_item_name`, `offer_isBuying`, `offer_receivedItems`"
					+ ", `offer_canceled`, `offer_totalPriceSoFar`, `offer_totalAmmountSoFar`) VALUES(");

				query.append("'" + offer.getOwnerName() + "'").append(",");
				query.append("'" + uid + "'").append(",");
				query.append("'" + offer.getId() + "'").append(",");
				query.append("'" + offer.getAmount() + "'").append(",");
				query.append("'" + offer.getPrice() + "'").append(",");
				query.append("'" + offer.getName() + "'").append(",");
				query.append("'" + (offer.isBuying() ? 1 : 0) + "'")
				.append(",");
				query.append(
					"'"
						+ receivedItems.substring(0,
							receivedItems.length() - 1) + "'")
							.append(",");
				query.append("'" + (offer.isCanceled() ? 1 : 0) + "'").append(
					",");
				query.append("'" + offer.getTotalPriceSoFar() + "'")
				.append(",");
				query.append("'" + offer.getTotalAmmountSoFar() + "'").append(
					")");

				ps = con.prepareStatement(query.toString());
				ps.executeUpdate();
			}

		} catch (Exception e) {
			Logger.log("GrandExchangeLoader",
				"Unable to append Grand Exchange offer into the database.");
			Logger.handle(e);
		} finally {
			try {
				if(ps != null)
					ps.close();
				ps = null;
				if(con != null)
					con.close();
				con = null;
			} catch (SQLException e) {

			}
		}
		return true;
	}

	public static Offer getOffer(long uid, Player player, int slot) {
		if (!contains(uid)) {
			return null;
		}
		PreparedStatement ps = null;
		ResultSet result = null;
		Connection con = null;
		try {
			con = World.getDatabase().getConnection();
			ps = con.prepareStatement("SELECT * FROM `grandexchange` WHERE offer_uid='"
				+ uid + "' LIMIT 1");
			result = ps.executeQuery();
			if (result.next()) {

				ResultSet cached = result;

				String[] items = result.getString("offer_receivedItems").split(
					",");

				ItemsContainer<Item> receivedItems = new ItemsContainer<Item>(
					2, true);

				if (!items[0].equals("-1")) {
					receivedItems.set(0, new Item(Integer.valueOf(items[0]),
						Integer.valueOf(items[1])));
				}
				if (!items[2].equals("-1")) {
					receivedItems.set(1, new Item(Integer.valueOf(items[2]),
						Integer.valueOf(items[3])));
				}

				Offer offer = new Offer(cached.getInt("offer_item_id"),
					cached.getInt("offer_item_amount"),
					cached.getInt("offer_item_price"),
					cached.getString("offer_item_name"),
					cached.getBoolean("offer_isBuying"), false, uid,
					receivedItems, cached.getInt("offer_totalPriceSoFar"),
					cached.getInt("offer_totalAmmountSoFar"),
					cached.getBoolean("offer_canceled"),
					cached.getString("player_name"));
				offer.link(slot, player);

				return offer;
			}
		} catch (Exception e) {
			System.err.println("Error Loading the GE offer uid: " + uid);
			e.printStackTrace();
		} finally {
			try {
				if (result != null) {
					result.close();
					result = null;
				}
				if(ps != null)
					ps.close();
				ps = null;
				if(con != null)
					con.close();
				con = null;
			} catch (SQLException e) {
			}
		}
		return null;
	}

	public static HashMap<Long, Offer> getPossibleOffers(Offer offer) {
		PreparedStatement ps = null;
		ResultSet result = null;
		Connection con = null;
		HashMap<Long, Offer> possibleOffers = new HashMap<Long, Offer>();
		try {
			con = World.getDatabase().getConnection();
			ps = con.prepareStatement("SELECT * FROM `grandexchange` WHERE offer_item_id='"
				+ offer.getId() + "'");
			result = ps.executeQuery();
			while (result.next()) {

				ResultSet cached = result;

				String[] items = result.getString("offer_receivedItems").split(
					",");

				ItemsContainer<Item> receivedItems = new ItemsContainer<Item>(
					2, true);

				if (!items[0].equals("-1")) {
					receivedItems.add(new Item(Integer.valueOf(items[0]),
						Integer.valueOf(items[1])));
				}
				if (!items[2].equals("-1")) {
					receivedItems.add(new Item(Integer.valueOf(items[2]),
						Integer.valueOf(items[3])));
				}

				Offer possibleOffer = new Offer(cached.getInt("offer_item_id"),
					cached.getInt("offer_item_amount"),
					cached.getInt("offer_item_price"),
					cached.getString("offer_item_name"),
					cached.getBoolean("offer_isBuying"), false,
					cached.getLong("offer_uid"), receivedItems,
					cached.getInt("offer_totalPriceSoFar"),
					cached.getInt("offer_totalAmmountSoFar"),
					cached.getBoolean("offer_canceled"),
					cached.getString("player_name"));

				possibleOffers.put(cached.getLong("offer_uid"), possibleOffer);
			}

			return possibleOffers;
		} catch (Exception e) {
			System.err.println("Error Loading possible ge offers.");
			e.printStackTrace();
		} finally {
			try {
				if (result != null) {
					result.close();
				}
				result = null;
				ps.close();
				ps = null;
				con.close();
			} catch (SQLException e) {
			}
		}
		return null;
	}

	public static HashMap<Long, Offer> getOffers() {
		PreparedStatement ps = null;
		ResultSet result = null;
		Connection con = null;
		HashMap<Long, Offer> possibleOffers = new HashMap<Long, Offer>();
		try {
			con = World.getDatabase().getConnection();
			ps = con.prepareStatement("SELECT * FROM `grandexchange`");
			result = ps.executeQuery();
			while (result.next()) {

				ResultSet cached = result;

				String[] items = result.getString("offer_receivedItems").split(
					",");

				ItemsContainer<Item> receivedItems = new ItemsContainer<Item>(
					2, true);

				if (!items[0].equals("-1")) {
					receivedItems.add(new Item(Integer.valueOf(items[0]),
						Integer.valueOf(items[1])));
				}
				if (!items[2].equals("-1")) {
					receivedItems.add(new Item(Integer.valueOf(items[2]),
						Integer.valueOf(items[3])));
				}

				Offer possibleOffer = new Offer(cached.getInt("offer_item_id"),
					cached.getInt("offer_item_amount"),
					cached.getInt("offer_item_price"),
					cached.getString("offer_item_name"),
					cached.getBoolean("offer_isBuying"), false,
					cached.getLong("offer_uid"), receivedItems,
					cached.getInt("offer_totalPriceSoFar"),
					cached.getInt("offer_totalAmmountSoFar"),
					cached.getBoolean("offer_canceled"),
					cached.getString("player_name"));

				possibleOffers.put(cached.getLong("offer_uid"), possibleOffer);
			}

			return possibleOffers;
		} catch (Exception e) {
			System.err.println("Error Loading possible ge offers.");
			e.printStackTrace();
		} finally {
			try {
				if (result != null) {
					result.close();
				}
				result = null;
				ps.close();
				ps = null;
				con.close();
			} catch (SQLException e) {
			}
		}
		return null;
	}

	public static Exchange get() {
		if (INSTANCE == null) {
			INSTANCE = new Exchange();
		}
		return INSTANCE;
	}
}
