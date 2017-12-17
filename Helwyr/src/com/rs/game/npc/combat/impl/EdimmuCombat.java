package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.World;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.utils.Utils;

public class EdimmuCombat extends CombatScript {

	@Override
	public Object[] getKeys() {
		return new Object[] { 10704 };
	}

	@Override
	public int attack(final NPC npc, final Entity target) {
	
		final NPCCombatDefinitions defs = npc.getCombatDefinitions();
		
		
		if (Utils.getRandom(2) == 0) {
			npc.setNextAnimation(new Animation(defs.getAttackEmote()));
			World.sendProjectile(npc, target, defs.getAttackProjectile(),
					41, 16, 41, 35, 16, 0);
				delayHit(npc, 1, target, getRangeHit(npc, getRandomMaxHit(npc, defs.getMaxHit(), NPCCombatDefinitions.MAGE, target)));
			
		} else {
			npc.setNextAnimation(new Animation(defs.getAttackEmote()));
			World.sendProjectile(npc, target, defs.getAttackProjectile(),
					41, 16, 41, 35, 16, 0);
			delayHit(npc, 0, target, getMagicHit(npc, getRandomMaxHit(npc, defs.getMaxHit(), NPCCombatDefinitions.RANGE, target)));
		}
		return defs.getAttackDelay();
	}
}