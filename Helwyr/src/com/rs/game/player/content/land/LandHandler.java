package com.rs.game.player.content.land;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.rs.game.player.Player;
import com.rs.utils.Logger;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public class LandHandler  {


	public static Map<Land, String> purchasedLands = new HashMap<>();

	/**
	 * Returns @purchasedLands from <Map>
	 * @return
	 */
	public static Map<Land, String> getPurchasedLand() {
		return purchasedLands;
	}

	/**
	 * Retrieves if the @land has been purchased from <Map> 
	 * @param land
	 * @return
	 */
	public static boolean hasBeenPurchased(Land land) {
		return purchasedLands.containsKey(land);
	}

	/**
	 * Checks if player has a land registered in their name.
	 * @param player
	 * @return
	 */
	public static boolean playerHasLand(Player player) {
		return purchasedLands.containsValue(player.getUsername());
	}

	/**
	 * Returns the land of the <Player> param.
	 * @param player
	 * @return
	 */
	public static Land getPlayersLand(Player player) {
		Land land = null;
		for(Map.Entry<Land, String> entry : purchasedLands.entrySet()) {
			Land lando = entry.getKey();
			String owner = entry.getValue();
			if(owner.equalsIgnoreCase(player.getUsername())) {
				land = lando;
				break;
			}
		}
		return land;
	}
	
	/**
	 * Returns the land of the <Player> param.
	 * @param player
	 * @return
	 */
	public static Land getPlayersLandByUsername(String username) {
		Land land = null;
		for(Map.Entry<Land, String> entry : purchasedLands.entrySet()) {
			Land lando = entry.getKey();
			String owner = entry.getValue();
			if(owner.equalsIgnoreCase(username)) {
				land = lando;
				break;
			}
		}
		return land;
	}

	/**
	 * Get land owner object
	 * @param land
	 * @return
	 */
	public static String getLandOwner(Land land) {
		return purchasedLands.get(land);
	}

	/**
	 * Sets a land as owned, puts into <Map>
	 * @param land
	 * @return
	 */
	public static boolean purchaseLand(Land land, Player owner) {
		if(purchasedLands.containsKey(land)) {
			owner.getPackets().sendGameMessage("This land has already been purchased.");
			return false;
		}
		purchasedLands.put(land, owner.getUsername());
		return true;
	}

	/**
	 * Allows a land from being purchased again @removes from <Map>
	 * @param land
	 * @return
	 */
	public static boolean removeBeenPurchased(Land land) {
		if(!purchasedLands.containsKey(land))
			return false;
		purchasedLands.remove(land);
		return true;
	}
	
	/**
	 * Teleports the <Player> to their land.
	 * @param player
	 */
	public static void teleportPlayerToLand(Player player) {
		player.teleport(LandHandler.getPlayersLand(player).getLocation());
		player.output("Welcome to " + LandHandler.getPlayersLand(player).getLandName().toLowerCase() + "!");
	}


	public static void saveLand() {
		FileOutputStream fileOutput = null;
		ObjectOutputStream saveObject = null;
		try {
			fileOutput = new FileOutputStream("data/land.ser");
			saveObject = new ObjectOutputStream(fileOutput);
			saveObject.writeObject(purchasedLands);
			saveObject.flush();
			fileOutput.flush();
			saveObject.close();
			fileOutput.close();
		} catch (IOException e) {
			System.out.println("Could not save land data.");
		}
	}

	@SuppressWarnings("unchecked")
	public static HashMap<Land, String> readLand() {
		FileInputStream input = null;
		ObjectInputStream objectInput = null;
		HashMap<Land, String> returningObject = null;
		try {
			input = new FileInputStream("data/land.ser");
			objectInput = new ObjectInputStream(input);
			returningObject = (HashMap<Land, String>) objectInput.readObject();
			purchasedLands = returningObject;
			objectInput.close();
			input.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return returningObject;
	}

}


