package com.rs.game.player.dialogues.impl.land;

import com.rs.cache.loaders.Configs;
import com.rs.game.World;
import com.rs.game.player.Player;
import com.rs.game.player.content.land.Land;
import com.rs.game.player.content.land.LandHandler;
import com.rs.game.player.content.land.ManageLand;
import com.rs.game.player.content.land.trans.LandTransaction;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.SerializableFilesManager;
import com.rs.utils.Utils;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public class PurchaseLand extends Dialogue {

	public Land landt = null;//TODO

	public boolean ownerHasOffer = false;
	public Player originalBuyer = null;
	public Player owner = null;
	public String name = null;
	private int npcId;

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		sendNPCDialogue(npcId, NORMAL, "Hello " + player.getDisplayName() + " what would you wish to view?");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if(!Configs.DEVELOPER_WORLD) {
			close();
		}
		switch(stage) {
		case -1:
			sendOptionsDialogue(DEFAULT, "Purchase a Land", "Sell my Land", "View available land", (LandHandler.playerHasLand(player) ? "View Current Offer" : "Cancel my Offer"), "Nothing, Goodbye");
			stage = 1;
			break;

		case 1:
			switch(componentId) {
			case OPTION_1:
				sendOptionsDialogue("Purchase Land", "Entrana", "Back");
				stage = 4;
				break;
			case OPTION_2:
				if(!LandHandler.playerHasLand(player)) {
					sendNPCDialogue(npcId, ANGRY, "You do not have any land to sell! Good day!");
					stage = -2;
				} else {
					sendNPCDialogue(npcId, NORMAL, "Your Land " + LandHandler.getPlayersLand(player).getLandName() + " will sell for about " + Utils.formatNumber(LandHandler.getPlayersLand(player).getSellPrice()) + ".");
					stage = 2;
				}
				break;
			case OPTION_3:
				sendOptionsDialogue("Available Land", "Entrana", "Back");
				stage = 4;
				break;
			case OPTION_4:
				if(LandHandler.playerHasLand(player) ) {
					if(player.getRecentOffer() > 1000000000) {
						sendNPCDialogue(npcId, NORMAL, "You have an offer for " + LandHandler.getPlayersLand(player).getLandName() + " for " + Utils.formatNumber(player.getRecentOffer()) + " gp.");
						stage = 9;
					} else {
						sendNPCDialogue(npcId, NORMAL, "You do not have a current offer.");
						stage = -1;
					}
				} else {
					if(player.hasMadeOffer()) {
						sendOptionsDialogue("Cancel your offer? ", "Yes, Cancer my offer", "Do do not cancer my offer");
						stage = 11;
					} else {
						sendNPCDialogue(npcId, ANGRY, "You do not have an offer to cancel!");
						stage = -1;
					}
				}
				break;
			case OPTION_5:
				sendPlayerDialogue(NORMAL, "Nothing, Goodbye!");
				stage = -2;
				break;
			}
			break;

		case 2:
			sendOptionsDialogue("Sell your land?", "Yes, I would like to sell " + LandHandler.getPlayersLand(player).getLandName(), "No, I wish to keep it", "Back");
			stage = 3;
			break;

		case 3:
			switch(componentId) {
			case OPTION_1:
				new ManageLand(LandHandler.getPlayersLand(player), player).sellLand();;
				close();
				break;
			case OPTION_2:
				sendNPCDialogue(npcId, NORMAL, "Very well than sir.");
				stage = -2;
				break;
			case OPTION_3:
				sendOptionsDialogue(DEFAULT, "Purchase a Land", "Sell my Land", "View available land", (LandHandler.playerHasLand(player) ? "View Current Offer" : "Cancel my Offer"), "Nothing, Goodbye");
				stage = 1;
				break;
			}
			break;

		case 4:
			switch(componentId) {
			case OPTION_1:
				if(LandHandler.hasBeenPurchased(Land.ENTRANA)) {
					sendNPCDialogue(npcId, NORMAL, "Entrana has already been purchased, Would you wish to make an offer to the owner?");
					stage = 7;
				} else {
					sendNPCDialogue(npcId, NORMAL, "Entrana is currently worth " + Utils.formatNumber(Land.ENTRANA.getCost()) + ", Would you like to purchase it?");
					stage = 5;
				}
				break;
			case OPTION_2:
				sendOptionsDialogue(DEFAULT, "Purchase a Land", "Sell my Land", "View available land", (LandHandler.playerHasLand(player) ? "View Current Offer" : "Cancel my Offer"), "Nothing, Goodbye");
				stage = 1;
				break;
			}
			break;

		case 5:
			sendOptionsDialogue("Purchase Entrana?", "Yes, I would like to purchase this piece of land.", "No, I do not");
			stage = 6;
			break;

		case 6:
			switch(componentId) {
			case OPTION_1:
				purchase(Land.ENTRANA);
				close();
				break;
			case OPTION_2:
				sendOptionsDialogue(DEFAULT, "Purchase a Land", "Sell my Land", "View available land", (LandHandler.playerHasLand(player) ? "View Current Offer" : "Cancel my Offer"), "Nothing, Goodbye");
				stage = 1;
				break;
			}
			break;

		case 7:
			name = LandHandler.getLandOwner(Land.ENTRANA);
			owner = World.getPlayer(name);
			if(owner == null) {
				owner = SerializableFilesManager.loadPlayer(Utils.formatPlayerNameForProtocol(name));
				if(owner != null) {
					if(owner.getRecentOffer() > 1000000000)
						ownerHasOffer = true;
				}
			}
			if(player.hasMadeOffer()) {
				sendNPCDialogue(npcId, ANGRY, "You cannot make more than one offer!");
				stage = -1;
				return;
			}
			if(ownerHasOffer) {
				sendNPCDialogue(npcId, NORMAL, Utils.formatString(name) + " currently has an offer out for " + Land.ENTRANA);
				stage = -1;
			} else {
				sendOptionsDialogue("Make an Offer on Entrana?", "Yes, I would like to make an offer on Entrana", "No, I do not");
				stage = 8;
			}
			break;

		case 8:
			switch(componentId) {
			case OPTION_1:
				close();
				player.getPackets().sendInputIntegerScript(true, "Make an offer: (Min: 1 Billion GP)");
				player.getTemporaryAttributtes().put("offer_land", Boolean.TRUE);
				player.getTemporaryAttributtes().put("land_owner", LandHandler.getLandOwner(Land.ENTRANA));
				break;
			case OPTION_2:
				sendOptionsDialogue(DEFAULT, "Purchase a Land", "Sell my Land", "View available land", (LandHandler.playerHasLand(player) ? "View Current Offer" : "Cancel my Offer"), "Nothing, Goodbye");
				stage = 1;
				break;
			}
			break;

		case 9:
			sendOptionsDialogue("Accept " + Utils.formatNumber(player.getRecentOffer()) + " for " + LandHandler.getPlayersLand(player).getLandName() + " ?", "Yes, I will accept their offer.", "No, Decline their offer.", "I will decide later");
			stage = 10;
			break;

		case 10:
			switch(componentId) {
			case OPTION_1:
				originalBuyer = World.getPlayer(player.getRecentOfferPlayer());
				if(originalBuyer == null) {
					originalBuyer = SerializableFilesManager.loadPlayer(Utils.formatPlayerNameForProtocol(player.getRecentOfferPlayer()));
					if(originalBuyer == null) {
						player.getPackets().sendGameMessage("Unable to find your most recent buyer.");
					}
					close();
					return;
				}
				new LandTransaction(Land.ENTRANA, originalBuyer, player.getUsername(), player.getRecentOffer(), true).startTransaction();
				close();
				break;
			case OPTION_2:
				if(originalBuyer == null) {
					originalBuyer = SerializableFilesManager.loadPlayer(Utils.formatPlayerNameForProtocol(player.getRecentOfferPlayer()));
					if(originalBuyer != null && !World.containsPlayer(player.getRecentOfferPlayer())) {
						originalBuyer.setHasMadeOffer(false);
						SerializableFilesManager.savePlayer(originalBuyer);
					} else {
						player.getPackets().sendGameMessage("Unable to find buyer.");
						close();
					}
				}
				if(originalBuyer != null)
					if(World.containsPlayer(player.getRecentOfferPlayer()))//TODO ->
						originalBuyer.getPackets().sendGameMessage("<col=ff0000>" + player.getDisplayName() + " has declined your offer to purchase of " + LandHandler.getPlayersLandByUsername(player.getUsername()).getLandName() + " for " + Utils.formatNumber(player.getRecentOffer()));
				player.getPackets().sendGameMessage("<col=ff000>You have declined their offer for " + Utils.formatNumber(player.getRecentOffer()) + "!");
				player.setRecentOffer(0);
				player.setRecentOfferPlayer(null);
				originalBuyer.setHasMadeOffer(false);
				SerializableFilesManager.savePlayer(originalBuyer);
				close();
				break;
			case OPTION_3:
				sendOptionsDialogue(DEFAULT, "Purchase a Land", "Sell my Land", "View available land", (LandHandler.playerHasLand(player) ? "View Current Offer" : "Cancel my Offer"), "Nothing, Goodbye");
				stage = 1;
				break;
			}
			break;

		case 11:
			switch(componentId) {
			case OPTION_1:
				name = LandHandler.getLandOwner(Land.ENTRANA);
				owner = World.getPlayer(name);
				if(owner == null && !World.containsPlayer(name)) {
					owner = SerializableFilesManager.loadPlayer(Utils.formatPlayerNameForProtocol(name));
					if(owner != null) {
						owner.setRecentOffer(0);
						owner.setRecentOfferPlayer(null);
						SerializableFilesManager.savePlayer(owner);
					}
				}
				player.getPackets().sendGameMessage("<col=ff0000> You have canceled your offer of " + player.getMyOffer() + " for " + LandHandler.getPlayersLandByUsername(name).getLandName() + ".");
				player.setHasMadeOffer(false);
				player.setMyOffer(0);
				if(owner != null) {
					if(World.containsPlayer(name)) 
						owner.getPackets().sendGameMessage("<col=ff0000>" + player.getDisplayName() + " has canceled their offer of " + Utils.formatNumber(owner.getRecentOffer()) + " for " + LandHandler.getPlayersLand(owner));
					owner.setRecentOffer(0);
					owner.setRecentOfferPlayer(null);
				}
				close();
				break;
			case OPTION_2:
				sendOptionsDialogue(DEFAULT, "Purchase a Land", "Sell my Land", "View available land", (LandHandler.playerHasLand(player) ? "View Current Offer" : "Cancel my Offer"), "Nothing, Goodbye");
				stage = 1;
				break;
			}
			break;

		case -2:
			close();
			break;
		}
	}

	public void purchase(Land land) {
		new ManageLand(land, player).buyLand();
	}

	@Override
	public void finish() {
		// TODO Auto-generated method stub

	}

}
