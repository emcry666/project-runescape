package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.ForceTalk;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.World;
import com.rs.game.Hit.HitLook;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class BorkCombat extends CombatScript {
	
	
	@Override
	public Object[] getKeys() {
		return new Object[] { 7133 };
	}
	
	//public boolean spawnOrk = false;

	@Override
	public int attack(final NPC npc, final Entity target) {
		final NPCCombatDefinitions defs = npc.getCombatDefinitions();
		npc.setCapDamage(1000);
		npc.setForceFollowClose(false);
		if (Utils.getRandom(4) == 0) {
			switch (Utils.getRandom(1)) {
			case 0:
				npc.setNextForceTalk(new ForceTalk("Your life ends tonight!"));
				break;
			case 1:
				npc.setNextForceTalk(new ForceTalk("Pathetic human!"));
				break;
			}
		}
		if (Utils.getRandom(2) == 0) { // range magical attack
			npc.setNextAnimation(new Animation(defs.getAttackEmote()));
			for (Entity t : npc.getPossibleTargets()) {
				delayHit(
						npc,
						1,
						t,
						getRangeHit(
								npc,
								getRandomMaxHit(npc, 550,
										NPCCombatDefinitions.RANGE, t)));
				World.sendProjectile(npc, t, 1200, 41, 16, 41, 35, 16, 0);
			}
		} 
		if (Utils.getRandom(2) == 1) { // mage magical attack
				npc.setNextAnimation(new Animation(defs.getAttackEmote()));
				for (Entity t : npc.getPossibleTargets()) {
					delayHit(
							npc,
							1,
							t,
							getMagicHit(
									npc,
									getRandomMaxHit(npc, 400,
											NPCCombatDefinitions.MAGE, t)));
					World.sendProjectile(npc, t, 359, 41, 16, 41, 35, 16, 0);
				}
		}
		if (Utils.getRandom(2) == 2) { // melee attack
			npc.setNextAnimation(new Animation(defs.getAttackEmote()));
			delayHit(
					npc,
					0,
					target,
					getMeleeHit(
							npc,
							getRandomMaxHit(npc, defs.getMaxHit(),
									NPCCombatDefinitions.MELEE, target)));
		}
		return defs.getAttackDelay();
		
	
	}
}

