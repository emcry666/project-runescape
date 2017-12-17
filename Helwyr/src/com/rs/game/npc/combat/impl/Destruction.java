package com.rs.game.npc.combat.impl;

import java.util.ArrayList;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.ForceTalk;
import com.rs.game.Graphics;
import com.rs.game.World;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.utils.Utils;

public class Destruction extends CombatScript {

	@Override
	public Object[] getKeys() {
		return new Object[] { 8596 };
	}

	@Override
	public int attack(final NPC npc, final Entity target) {
		final NPCCombatDefinitions defs = npc.getCombatDefinitions();
		npc.setCapDamage(1000);
		int size = npc.getSize();
		final ArrayList<Entity> possibleTargets = npc.getPossibleTargets();
		boolean stomp = false;
		for (Entity t : possibleTargets) {
			int distanceX = t.getX() - npc.getX();
			int distanceY = t.getY() - npc.getY();
			if (distanceX < size && distanceX > -1 && distanceY < size
					&& distanceY > -1) {
				stomp = true;
				delayHit(
						npc,
						0,
						t,
						getRegularHit(
								npc,
								getRandomMaxHit(npc, defs.getMaxHit(),
										NPCCombatDefinitions.MELEE, t)));
			}
		}
		if (stomp) {
			npc.setNextGraphics(new Graphics(1834));
			return defs.getAttackDelay();
		}
		if (Utils.getRandom(5) == 0) { // Vorago random heal
			npc.heal(200);
			npc.setNextForceTalk(new ForceTalk("Your anguish fuels me!"));
		}
		if (Utils.getRandom(1) == 0) { // Vorago Attack (mage balls)
			for (Entity t : npc.getPossibleTargets()) {
				delayHit(npc, 1, t, getRegularHit(npc, getRandomMaxHit(npc, 400, NPCCombatDefinitions.MAGE, t)));
				World.sendProjectile(npc, t, 634, 41, 16, 41, 35, 16, 0);
			}
			} else {
				//npc.setNextAnimation(new Animation(7063));
				for (Entity t : npc.getPossibleTargets()) {
					delayHit(
							npc,
							1,
							t,
							getRangeHit(
									npc,
									getRandomMaxHit(npc, 750,
											NPCCombatDefinitions.RANGE, t)));
					World.sendProjectile(npc, t, 1200, 41, 16, 41, 35, 16, 0);
			}
		} 
		return defs.getAttackDelay();
	}
}