package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.ForceTalk;
import com.rs.game.World;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.utils.Utils;

public class KrakenCombat extends CombatScript {

	@Override
	public Object[] getKeys() {
		return new Object[] { 3847 };
	}

	@Override
	public int attack(final NPC npc, final Entity target) {
		npc.setCapDamage(1000);
		final NPCCombatDefinitions defs = npc.getCombatDefinitions();
		
		
		if (Utils.getRandom(2) == 0) { // range magical attack
			npc.setNextAnimation(new Animation(defs.getAttackEmote()));
			for (Entity t : npc.getPossibleTargets()) {
				delayHit(
						npc,
						1,
						t,
						getRangeHit(
								npc,
								getRandomMaxHit(npc, 230,
										NPCCombatDefinitions.RANGE, t)));
				World.sendProjectile(npc, t, 1200, 41, 16, 41, 35, 16, 0);
			}
		} else { // melee attack
			npc.setNextAnimation(new Animation(defs.getAttackEmote()));
			delayHit(
					npc,
					0,
					target,
					getMagicHit(
							npc,
							getRandomMaxHit(npc, defs.getMaxHit(),
									NPCCombatDefinitions.MAGE, target)));
		}
		return defs.getAttackDelay();
	}
}
