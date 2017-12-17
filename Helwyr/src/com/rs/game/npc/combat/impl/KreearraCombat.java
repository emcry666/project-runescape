package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.utils.Utils;

public class KreearraCombat extends CombatScript {
	
	@Override
	public Object[] getKeys() {
		return new Object[] { 6222 };
	}

	@Override
	public int attack(NPC npc, Entity target) {
		final NPCCombatDefinitions defs = npc.getCombatDefinitions();
		if (!npc.isUnderCombat()) {
			npc.setNextAnimation(new Animation(17396));
			delayHit(
					npc,
					1,
					target,
					getMeleeHit(
							npc,
							getRandomMaxHit(npc, 260,
									NPCCombatDefinitions.MELEE, target)));
			return defs.getAttackDelay();
		}
		npc.setNextAnimation(new Animation(17397));
		for (Entity t : npc.getPossibleTargets()) {
			if (Utils.getRandom(2) == 0) {
				sendMagicAttack(npc, t);
			} else {
				delayHit(
						npc,
						1,
						t,
						getRangeHit(
								npc,
								getRandomMaxHit(npc, 720,
										NPCCombatDefinitions.RANGE, t)));
				World.sendProjectile(npc, t, 1197, 41, 16, 41, 35, 16, 0);
				WorldTile teleTile = t;
				for (int trycount = 0; trycount < 10; trycount++) {
					teleTile = new WorldTile(t, 2);
					/*
					 * if (World.canMoveNPC(t.getPlane(), teleTile.getX(),
					 * teleTile.getY(), t.getSize())) break;
					 */
				}
				if (isAtArmaChamber(teleTile)) {
					t.setNextWorldTile(teleTile);
				}
			}
		}
		return defs.getAttackDelay();
	}

	public boolean isAtArmaChamber(Entity target) {
		return (target.getX() >= 2824 && target.getX() <= 2842
				&& target.getPlane() == 2 && target.getY() <= 5308
				&& target.getY() >= 5296 && target.getPlane() == 2);
	}

	public boolean isAtArmaChamber(WorldTile tile) {
		return (tile.getX() >= 2824 && tile.getX() <= 2842
				&& tile.getPlane() == 2 && tile.getY() <= 5308
				&& tile.getY() >= 5296 && tile.getPlane() == 2);
	}

	private void sendMagicAttack(NPC npc, Entity target) {
		npc.setNextAnimation(new Animation(17397));
		for (Entity t : npc.getPossibleTargets()) {
			delayHit(
					npc,
					1,
					t,
					getMagicHit(
							npc,
							getRandomMaxHit(npc, 210,
									NPCCombatDefinitions.MAGE, t)));
			World.sendProjectile(npc, t, 1198, 41, 16, 41, 35, 16, 0);
			target.setNextGraphics(new Graphics(1196));
		}
	}
}
