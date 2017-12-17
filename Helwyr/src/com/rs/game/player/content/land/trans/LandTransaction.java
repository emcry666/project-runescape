package com.rs.game.player.content.land.trans;

import com.rs.game.World;
import com.rs.game.player.Player;
import com.rs.game.player.content.land.Land;
import com.rs.game.player.content.land.LandHandler;
import com.rs.utils.SerializableFilesManager;
import com.rs.utils.Utils;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public class LandTransaction implements LTransaction {

	private Land land;
	private Player player;
	public Player owner;
	private String ousername;
	private int reqAmount;
	private boolean accepted;

	public LandTransaction(Land land, Player player, String owner, int reqAmount) {
		this.land = land;
		this.player = player;
		this.reqAmount = reqAmount;
		this.owner = World.getPlayer(owner);
		this.ousername = owner;
	}

	public LandTransaction(Land land, Player player, String owner, int reqAmount, boolean accepted) {
		this.land = land;
		this.player = player;
		this.reqAmount = reqAmount;
		this.owner = World.getPlayer(owner);
		this.accepted = accepted;
	}

	@Override
	public boolean startTransaction() {
		if(owner == null) {
			owner = SerializableFilesManager.loadPlayer(Utils.formatPlayerNameForProtocol(ousername));
			if(owner == null) {
				player.getPackets().sendGameMessage("Unable to find the owner of " + land.getLandName());
				return false;
			}
		}
		if(!canPurchase()) 
			return false;
		return true;
	}

	@Override
	public void completed() {
		if(land == null) {
			player.getPackets().sendGameMessage("Error: Land could not be purchased.");
			return;
		}
		if(!accepted) {
			player.getPackets().sendGameMessage("<col=00ff00>You must wait for the owner of " + land.getLandName() + " to accept your offer.");
			player.setHasMadeOffer(true);
			
			if(owner != null) {
				owner.setRecentOfferPlayer(player.getUsername());
				owner.setRecentOffer(reqAmount);
				SerializableFilesManager.savePlayer(owner);
				if(World.containsPlayer(owner.getUsername()))
					owner.getPackets().sendGameMessage("<col=ff0000>" + player.getDisplayName() + " has made an offer of " + Utils.formatNumber(reqAmount) + " to purchase " + land.getLandName() + ".");
			} else {
				owner = SerializableFilesManager.loadPlayer(Utils.formatPlayerNameForProtocol(ousername));
				if(owner == null) {
					player.getPackets().sendGameMessage("Unable to find the owner of " + land.getLandName());
					return;
				}
				owner.setRecentOfferPlayer(player.getUsername());
				owner.setRecentOffer(reqAmount);
				SerializableFilesManager.savePlayer(owner);
			}
			player.setMyOffer(reqAmount);
			SerializableFilesManager.savePlayer(player);
			World.sendWorldMessage("<img=5><col=00ff00>" + player.getDisplayName() + " has made an offer of " + Utils.formatNumber(reqAmount) + " to purchase " + land.getLandName() + ".");
			return;
		}
		if(!player.getInventory().containsItem(995, reqAmount)) {
			owner.getPackets().sendGameMessage(player.getDisplayName() + " does not have enough coins to complete this transaction.");
			player.getPackets().sendGameMessage("You do not have enough coins in your inventory to complete this transaction.");
			return;
		}
		if((owner.getInventory().getNumerOf(995) + reqAmount) > Integer.MAX_VALUE) {
			player.getPackets().sendGameMessage(owner.getDisplayName() + " cannot store any more coins in their inventory.");
			owner.getPackets().sendGameMessage("You cannot store any more coins in their inventory.");
			return;
		}
		LandHandler.removeBeenPurchased(land);
		LandHandler.purchaseLand(land, player);
		owner.getInventory().addItem(995, reqAmount);
		player.getInventory().deleteItem(995, reqAmount);
		owner.getPackets().sendGameMessage("You have sold " + land.getLandName() + " to " + player.getDisplayName() + " for " + Utils.formatNumber(reqAmount) + ".");
		player.getPackets().sendGameMessage("You have purchased " + land.getLandName() + " from " + owner.getDisplayName() + " for " + Utils.formatNumber(reqAmount) + ".");
		/**
		 * Clears the Transaction and previous ones just incase.
		 */
		owner.setHasMadeOffer(false);
		owner.setRecentOffer(-1);
		player.setHasMadeOffer(false);
		player.setRecentOffer(-1);
	}

	public boolean canPurchase() {
		if(owner == null) {
			player.getPackets().sendGameMessage("Owner could not be found.");
			return false;
		}
		if(land == null) {
			player.getPackets().sendGameMessage("Could not complete transaction.");
			return false;
		}
		if(player.getUsername().equalsIgnoreCase(LandHandler.getLandOwner(land))) {
			player.getPackets().sendGameMessage("You can not purchase your own land.");
			return false;
		}
		if(!LandHandler.hasBeenPurchased(land)) {
			player.getPackets().sendGameMessage(land.getLandName() + " has not been purchased yet.");
			return false;
		}
		if(reqAmount < 1000000000) {
			player.getPackets().sendGameMessage("This land cannot be sold for this cheap.");
			return false;
		}
		if((owner.getInventory().getNumerOf(995) + reqAmount) > Integer.MAX_VALUE) {
			player.getPackets().sendGameMessage("The owner does not have enough inventory for this transaction.");
			return false;
		}
		completed();
		return true;
	}

}
