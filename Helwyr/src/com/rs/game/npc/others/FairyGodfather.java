package com.rs.game.npc.others;

import com.rs.cache.loaders.Configs;
import com.rs.game.ForceTalk;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.utils.Utils;

@SuppressWarnings("serial")
public class FairyGodfather extends NPC {

	int ticks;
	String[] messages = {"View the finest shops in all of " + Configs.SERVER_NAME + "!", "View just about any shop in "+ Configs.SERVER_NAME+ " with just a simple click!"};

	public FairyGodfather(int id, WorldTile tile, int mapAreaNameHash,
			boolean canBeAttackFromOutOfArea) {
		super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
		setCantInteract(false);
	}

	@Override
	public void processNPC() {
		if(ticks == 15) {
			int randomMessages = Utils.random(messages.length);
			setNextForceTalk(new ForceTalk(messages[randomMessages]));
			ticks = 0;
		}
		ticks++;
	}




}
