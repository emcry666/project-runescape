package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.utils.Utils;

public class Gladius extends CombatScript {

    @Override
    public Object[] getKeys() {
	return new Object[] { "Gladius" };
    }

    @Override
    public int attack(NPC npc, Entity target) {
	int attack = Utils.random(100);
	if (attack < 25) {
	    World.sendGraphics(null, new Graphics(3992), new WorldTile(npc.getX(), npc.getY(), npc.getPlane()));
	    npc.setNextGraphics(new Graphics(3992));
	    npc.setNextWorldTile(target.findClosestFreeTile());
	    target.addFreezeDelay(Utils.random(3, 9));
	    npc.setNextAnimation(new Animation(20249));
	} else {
	    Hit damage = getMagicHit(npc, getMaxHit(npc, 320, NPCCombatDefinitions.MAGE, target));
	    npc.setNextAnimation(new Animation(20252));
	    delayHitGfx(npc, World.sendProjectileNew(npc, target, 3990, 30, 30, 20, 4, 3, 3).getEndTime() / 30, new Graphics(3991), target, damage);
	}
	
	return npc.getAttackSpeed();
    }

}
