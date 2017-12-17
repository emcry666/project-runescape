package com.rs.game.player.controlers;

import com.rs.game.player.actions.Woodcutting;
import com.rs.game.player.actions.Woodcutting.TreeDefinitions;
import com.rs.game.player.actions.mining.Mining;
import com.rs.game.player.actions.mining.Mining.RockDefinitions;
import com.rs.game.player.content.clans.Clan;
import com.rs.game.player.content.clans.citadel.ClanCitadel;
import com.rs.game.player.content.clans.citadel.plots.PlotList.Plots;
import com.rs.game.player.content.clans.citadel.plots.impl.Loom;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public class CitadelControler extends Controler {

	private Clan clan;
	private ClanCitadel citadel;

	@Override
	public void start() {
		this.clan = (Clan) getArguments()[0];
		if(clan != null)
			this.citadel = clan.getCitadel();
		if(citadel.isMember(player)) {
			citadel.sendMessageToMembers(player.getDisplayName() + " has just joined the citadel.");
		} else {
			citadel.sendMessageToMembers("[Guest] - " + player.getDisplayName() + " has just joined the citadel.");
		}
		player.unlock();
	}

	@Override
	public boolean processButtonClick(int interfaceId, int componentId, int slotId, int slotId2, int packetId) {
		return true;
	};

	@Override
	public boolean processObjectClick1(com.rs.game.WorldObject object) {
		switch(object.getDefinitions().getName()) {
		case "Root":
			player.getActionManager().setAction(new Woodcutting(object, TreeDefinitions.ROOT_CHIPPINGS));
			player.getPackets().sendGameMessage("Woodcutting starting.");
			break;
		case "Ore":
			player.getActionManager().setAction(new Mining(object, RockDefinitions.STONE_CLIPPINGS));
			player.getPackets().sendGameMessage("Mining starting.");
			break;
		case "Loom":
			player.getClanManager().getClan().getPlotManager().get(Plots.LOOM).getAction(object).start(player);
			break;
		case "shovel":
			break;
		default:
			player.getPackets().sendGameMessage("[Unhandled Object] - ObjectId:" + object.getId() + ", " + object.getX() + ", " + object.getY() + ", " + object.getPlane() + ".");
			break;
		}
		return true;
	};

	@Override
	public boolean processObjectClick2(com.rs.game.WorldObject object) {
		return true;
	};

	@Override
	public boolean processNPCClick1(com.rs.game.npc.NPC npc) {
		return true;
	};

	@Override
	public boolean processNPCClick2(com.rs.game.npc.NPC npc) {
		return true;
	};

	@Override
	public boolean processNPCClick3(com.rs.game.npc.NPC npc) {
		return true;
	};

	@Override
	public boolean login() {
		return true;
	};

	@Override
	public boolean logout() {
		return true;
	};


	@Override
	public boolean checkWalkStep(int lastX, int lastY, int nextX, int nextY) {
		return true;
	};


	public Clan getClan() {
		return clan;
	}

	public void setClan(Clan clan) {
		this.clan = clan;
	}

}
