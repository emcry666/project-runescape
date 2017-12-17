package com.rs.game.player.content.land;

import com.rs.game.World;
import com.rs.game.player.Player;
import com.rs.utils.SerializableFilesManager;
import com.rs.utils.Utils;

public class ManageLand implements LandBlueprint {

	public Player player;
	public Player owner;
	public Land land;
	public int requestAmt;

	public ManageLand(Land land, Player player) {
		this.land = land;
		this.player = player;
	}

	public ManageLand(Land land, Player player, int requestAmt) {
		this.land = land;
		this.player = player;
		this.requestAmt = requestAmt;
	}

	public ManageLand(Land land) {
		this.land = land;
	}

	@Override
	public int getLandPrice() {
		return land.getCost();
	}

	@Override
	public String getLandName() {
		return Utils.formatString(land.name());
	}

	@Override
	public void buyLand() {
		if(LandHandler.hasBeenPurchased(land)) {
			player.getPackets().sendGameMessage("This land has already been purchased.");
			return;
		}
		if(!player.getInventory().containsItem(995, land.getCost())) {
			player.getPackets().sendGameMessage("You do not have enough coins to purchase this land.");
			return;
		}
		player.getInventory().deleteItem(995, land.getCost());
		LandHandler.purchaseLand(land, player);
		World.sendWorldMessage("<img=5><col=00ff00>" + player.getDisplayName() + " has just purchased " + getLandName() + " for " + Utils.formatNumber(getLandPrice()) + " !");
		LandHandler.saveLand();
	}

	@Override
	public void sellLand() {
		if(land == null) {
			player.getPackets().sendGameMessage("Unable to sell land.");
			return;
		}
		if(LandHandler.hasBeenPurchased(land) && !player.getUsername().equalsIgnoreCase(LandHandler.getLandOwner(land))) {
			player.getPackets().sendGameMessage("This land does not belong to you.");
			player.getPackets().sendGameMessage("" + LandHandler.getLandOwner(land) + " :: " + player.getUsername());
			return;
		}
		if((player.getInventory().getAmountOf(995) + land.getSellPrice()) > Integer.MAX_VALUE) {
			player.getPackets().sendGameMessage("You do not have enough space to hold all these coins.");
			return;
		}
		player.getInventory().addItem(995, land.getSellPrice());
		LandHandler.removeBeenPurchased(Land.ENTRANA);
		World.sendWorldMessage("<img=5><col=00ff00>" + player.getDisplayName() + " has just sold " + getLandName() + " for " + Utils.formatNumber(land.getSellPrice()) + " !");
		LandHandler.saveLand();
	}

	@Override
	public void requestPurchase() {
		owner = World.getPlayer(LandHandler.getLandOwner(land));
		if(owner == null) {
			owner = SerializableFilesManager.loadPlayer(Utils.formatPlayerNameForProtocol(LandHandler.getLandOwner(land)));
			if(owner == null) {
				player.getPackets().sendGameMessage("Owner of " + land.getLandName() + " could not be found.");
				return;
			}
		}
		if(player.getUsername().equalsIgnoreCase(LandHandler.getLandOwner(land))) {
			player.getPackets().sendGameMessage("You cannot request to purchase your own land.");
			return;
		}
		if(requestAmt < 1000000000) {
			player.getPackets().sendGameMessage("1,000,000,00gp is minimum for a request.");
			return;
		}
		if(World.containsPlayer(owner.getUsername())) {
			if(land.getLandName() != null)
				owner.getPackets().sendGameMessage("<col=00ff00>" + player.getUsername() + " has requested to purchase your land " + land.getLandName() + " for " + Utils.formatNumber(requestAmt) + ".");
		}
	}

}
