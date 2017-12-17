package com.rs.game.npc.vorago;

import com.rs.game.WorldTile;
import com.rs.game.player.controllers.Controller;
import com.rs.utils.Utils;

public class VoragoController extends Controller {

	@Override
	public void start() {
		VoragoHandler.addPlayer(player);
	}
	
	@Override
	public boolean sendDeath() {
		VoragoHandler.removePlayer(player);
		return true;
	}

	@Override
	public boolean processMagicTeleport(WorldTile toTile) {
		if (Utils.getDistance(toTile, player) > 500) {
			VoragoHandler.removePlayer(player);
		}
		return true;
	}

	@Override
	public boolean processItemTeleport(WorldTile toTile) {
		if (Utils.getDistance(toTile, player) > 500) {
			VoragoHandler.removePlayer(player);
		}
		return true;
	}

	@Override
	public boolean processObjectTeleport(WorldTile toTile) {
		if (Utils.getDistance(toTile, player) > 500) {
			VoragoHandler.removePlayer(player);
		}
		return true;
	}
	
	@Override
	public boolean logout() {
		VoragoHandler.removePlayer(player);
		player.setLocation(Vorago.OUTSIDE);
		return true;
	}
	
	@Override
	public boolean login() {
		if (VoragoHandler.getPlayers().contains(player))
			VoragoHandler.removePlayer(player);
		player.setLocation(Vorago.OUTSIDE);
		return true;
	}
	
	@Override
	public void forceClose() {
		if (VoragoHandler.getPlayers().contains(player))
			VoragoHandler.removePlayer(player);
	}
}
