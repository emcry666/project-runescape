package com.rs.game.minigames.duel;

import com.rs.game.WorldTile;
import com.rs.game.player.Player;
import com.rs.game.player.controlers.Controler;

/**
 * @author Tom
 * 
 */
public class LobbyControler extends Controler {

	/**
	 * Starts the controller and sends required information.
	 */
	@Override
	public void start() {
		sendInterfaces();
		player.getAppearence().generateAppearenceData();
		//player.getPackets().sendPlayerOption("Challenge", 1, false);
		moved();
	}

	/**
	 * Starts the controller when a player logs in, aslong as they're in the
	 * bounds.
	 */
	@Override
	public boolean login() {
		start();
		return false;
	}

	/**
	 * Permits the controller to not force close on logout.
	 */
	@Override
	public boolean logout() {
		return false;
	}

	/**
	 * Force closes the controller, and removes it.
	 */
	@Override
	public void forceClose() {
		remove();
	}

	/**
	 * Restricts a player from teleporting from the controller.
	 */
	@Override
	public boolean processMagicTeleport(WorldTile toTile) {
		return true;
	}

	/**
	 * Called whenever a player moves a region, if a player walks out of the
	 * bounds of the lobby, the controller will force stop.
	 */
	@Override
	public void moved() {
		if (!checkBounds(player)) {
			remove();
		}
	}

	/**
	 * Restricts a player from teleporting from the controller.
	 */
	@Override
	public boolean processItemTeleport(WorldTile toTile) {
		return true;
	}

	/**
	 * Removes the current controller whenever a player teleports out of these
	 * bounds.
	 */
	@Override
	public void magicTeleported(int type) {
		remove();
	}

	/**
	 * Removes the current controler.
	 */
	public void remove() {
		removeControler();
		player.getInterfaceManager().closeOverlay(false);
		player.getAppearence().generateAppearenceData();
		player.getPackets().sendPlayerOption("null", 1, false);
	}

	/**
	 * Sends the lobby interface overlay.
	 */
	@Override
	public void sendInterfaces() {
		if (checkBounds(player))
			player.getInterfaceManager().sendOverlay(638, false);
		else
			remove();
	}

	/**
	 * Permits if a player can use "player option 1" of a target.
	 */
	@Override
	public boolean canPlayerOption1(final Player target) {
		player.stopAll();

		if (target == null) {
			return false;
		} else if (target.getInterfaceManager().containsScreenInter() || target.isLocked()) {
			player.getPackets().sendGameMessage("The other player is busy.");
			return false;
		}

		if (player.getRights() >= 2 || target.getRights() >= 2) {
			player.sm("Administators cannot currently duel.");
			return false;
		}

		if (target.removeAttribute("DuelChallenged") != null) {
			startSession(target);
			return false;
		}

		player.getInterfaceManager().sendInterface(640);
		player.getVarsManager().sendVar(283, 67108864);
		player.putAttribute("DuelTarget", target);
		return false;
	}

	public void startSession(Player target) {
		player.getControlerManager().removeControlerWithoutCheck();
		target.getControlerManager().removeControlerWithoutCheck();

		player.getControlerManager().startControler("ArenaControler", target, target.getAttribute("DuelStaked"));
		target.getControlerManager().startControler("ArenaControler", player, target.removeAttribute("DuelStaked"));
	}

	/**
	 * Handles the button clicking for the challenge interface.
	 */
	@Override
	public boolean processButtonClick(int interfaceId, int componentId, int slotId, int packetId) {
		switch (interfaceId) {
		case 640:// Request interface
			switch (componentId) {
			case 18:// Friendly duel
				player.getTemporaryAttributtes().put("Stake", Boolean.FALSE);
				player.getVarsManager().sendVar(283, 67108864);

				return true;
			case 19:// Staked duel
				player.getTemporaryAttributtes().put("Stake", Boolean.TRUE);
				player.getVarsManager().sendVar(283, 134217728);

				return true;
			case 20:// Confirm challenge
				confirmChallenge();
				return true;
			}
			return true;
		case 430:
			switch (componentId) {
			case 37:
				player.sm("You cannot cast vengeance at this time.");
				return false;
			}
			return true;
		default:
			return true;
		}
	}

	/**
	 * Sends the duel challenge to the target.
	 */
	private void confirmChallenge() {
		player.stopAll();

		boolean stake = false;
		if (player.getAttribute("Stake") != null) {
			stake = (boolean) player.removeAttribute("Stake");
		}

		Player currentTarget = null;
		if (player.getAttribute("DuelTarget") != null) {
			currentTarget = (Player) player.removeAttribute("DuelTarget");
		}

		if (currentTarget == null || currentTarget.hasFinished() || !currentTarget.withinDistance(player, 14)) {
			player.getPackets().sendGameMessage(
					"Unable to find " + (currentTarget == null ? "your target" : currentTarget.getDisplayName()));
			return;
		}

		player.putAttribute("DuelChallenged", currentTarget);
		player.putAttribute("DuelStaked", stake);

		player.getPackets().sendGameMessage("Sending " + currentTarget.getDisplayName() + " a request...");
		currentTarget.getPackets().sendDuelChallengeRequestMessage(player, !stake);
	}

	/**
	 * Checks if a player is within the lobby bounds.
	 * 
	 * @param player
	 *            The player to check bounds for.
	 * @return If the player is within the bounds.
	 */
	public static boolean checkBounds(Player player) {
		return player.inArea(3341, 3265, 3387, 3281);
	}
}