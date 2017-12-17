package com.rs.game.npc.others;

import com.rs.game.ForceTalk;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.utils.Utils;

@SuppressWarnings("serial")
public class Benny extends NPC {

	int ticks;
	String[] varrockMessages = {"Read all about it!", 
			"Extra Extra! Read all about it!", "Varrock Herald, on sale here!",
			"Varrock Herald, now only 50 gold!", "Buy your Varrock Herald now!"};

	public Benny(int id, WorldTile tile, int mapAreaNameHash,
			boolean canBeAttackFromOutOfArea) {
		super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
		setCantInteract(false);
	}

	@Override
	public void processNPC() {
		if(ticks == 10) {
			int randomMessages = Utils.random(varrockMessages.length);
			setNextForceTalk(new ForceTalk(varrockMessages[randomMessages]));
			ticks = 0;
		}
		ticks++;
	}




}
