package com.rs.game.npc.others;

import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;

public class AscensionCreature extends NPC {

    private static final long serialVersionUID = 4633816168063797227L;

    public AscensionCreature(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea,
	    boolean spawned) {
	super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
    }

    @Override
    public void handleIngoingHit(Hit hit) {
	if (hit.getLook() == HitLook.MAGIC_DAMAGE || hit.getLook() == HitLook.MELEE_DAMAGE) {
	    hit.setDamage(hit.getDamage() / 50);
	}
	super.handleIngoingHit(hit);
    }

}
