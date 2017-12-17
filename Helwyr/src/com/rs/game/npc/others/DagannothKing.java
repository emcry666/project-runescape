package com.rs.game.npc.others;

import com.rs.game.Entity;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;

@SuppressWarnings("serial")
public class DagannothKing extends NPC {

    public DagannothKing(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea,
	    boolean spawned) {
	super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
    }

    @Override
    public void handleIngoingHit(Hit hit) {
	if (hit.getLook() != HitLook.MELEE_DAMAGE && hit.getLook() != HitLook.RANGE_DAMAGE
		&& hit.getLook() != HitLook.MAGIC_DAMAGE)
	    return;
	if ((getId() == 2881 && hit.getLook() != HitLook.MELEE_DAMAGE)
		|| (getId() == 2882 && hit.getLook() != HitLook.RANGE_DAMAGE)
		|| (getId() == 2883 && hit.getLook() != HitLook.MAGIC_DAMAGE))
	    hit.setDamage(0);
	super.handleIngoingHit(hit);
    }

    @Override
    public void sendDeath(final Entity source) {
	super.sendDeath(source);
    }
}
