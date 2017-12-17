package com.rs.game.player.content.stealingcreations;

import com.rs.game.Animation;
import com.rs.game.ForceMovement;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.item.FloorItem;
import com.rs.game.player.Player;
import com.rs.game.player.controlers.Controler;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

public class StealingCreationLobbyController extends Controler {

	public static void climbOverStile(final Player player,
			final WorldObject object, final boolean enterance) {
		player.lock(3);
		if (enterance) {
			if (!StealingCreationLobby.enterTeamLobby(player,
					object.getId() == 39509))
				return;
		} else
			StealingCreationLobby.removePlayer(player);
		player.setNextAnimation(new Animation(1560));
		final WorldTile toTile = new WorldTile(enterance ? object.getX()
				: object.getX() + 2, object.getY(), object.getPlane());
		player.setNextForceMovement(new ForceMovement(player, 0, toTile, 2,
				enterance ? ForceMovement.WEST : ForceMovement.EAST));
		WorldTasksManager.schedule(new WorldTask() {

			@Override
			public void run() {
				player.setNextWorldTile(toTile);
			}
		}, 1);
		player.getInterfaceManager().closeTaskSystem();
	}

	@Override
	public void forceClose() {
		player.getInterfaceManager().closeOverlay(false);
	}

	@Override
	public boolean login() {
		StealingCreationLobby.removePlayer(player);
		player.setLocation(Helper.EXIT);
		return true;
	}

	@Override
	public boolean logout() {
		StealingCreationLobby.removePlayer(player);
		player.setLocation(Helper.EXIT);
		return true;
	}
	
	@Override
	public boolean processButtonClick(int interfaceId, int componentId, int slotId, int packetId) {
		switch(interfaceId) {
		case 506:
			return false;
		}
		return true;
	};
	
	@Override
	public boolean processButtonClick(int interfaceId, int componentId, int slotId, int slotId2, int packetId) {
		switch(interfaceId) {
		case 506:
			return false;
		}
		return true;
	};

	@Override
	public void magicTeleported(int type) {
		StealingCreationLobby.removePlayer(player);
	}

	@Override
	public boolean processItemTeleport(WorldTile toTile) {
		player.getDialogueManager()
				.startDialogue("SimpleMessage",
						"A magical force prevents you from teleporting from the arena.");
		return false;
	}

	@Override
	public boolean processMagicTeleport(WorldTile toTile) {
		player.getDialogueManager()
				.startDialogue("SimpleMessage",
						"A magical force prevents you from teleporting from the arena.");
		return false;
	}
	
	@Override
	public boolean canUseCommands() {
		player.getDialogueManager()
		.startDialogue("SimpleMessage",
				"A magical force prevents you from using any commands inside the lobby.");
		return false;
	};
	

	@Override
	public boolean processObjectClick1(WorldObject object) {
		if ((object.getId() == 39508 || object.getId() == 39509)
				&& player.getX() <= object.getX()) {
			player.getControlerManager().forceStop();
			climbOverStile(player, object, false);
			return false;
		}
		return true;
	}

	@Override
	public void sendInterfaces() {
		player.getInterfaceManager().sendOverlay(804, false);
		StealingCreationLobby.updateTeamInterface(player, false, true);
	}

	@Override
	public void start() {
		sendInterfaces();
	}

}
