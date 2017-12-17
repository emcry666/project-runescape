package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.ForceTalk;
import com.rs.game.Graphics;
import com.rs.game.World;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;
import com.rs.game.player.Player;

public class SunfreetCombat extends CombatScript {

	@Override
	public Object[] getKeys() {
	
		return new Object[] { 15222 };
		
	}

	@Override
	public int attack(final NPC npc, final Entity target) {
		npc.setCapDamage(1000);
		final NPCCombatDefinitions defs = npc.getCombatDefinitions();
		int attackStyle = Utils.random(3);
		if(attackStyle == 2) { //range
				int distanceX = target.getX() - npc.getX();
			int distanceY = target.getY() - npc.getY();
			int size = npc.getSize();
			if (distanceX > size || distanceX < -1 || distanceY > size
					|| distanceY < -1)
				attackStyle = Utils.random(3); // set mage
			else{
				npc.setNextAnimation(new Animation(defs.getAttackEmote()));
				delayHit(
						npc,
						1,
						target,
						getMeleeHit(
								npc,
								getRandomMaxHit(npc, defs.getMaxHit(),
										NPCCombatDefinitions.MELEE, target)));
				return defs.getAttackDelay();
			}
		}
		if(attackStyle == 1) { //arrow spray
			npc.setNextAnimation(new Animation(16318));
			npc.setNextForceTalk(new ForceTalk("FIRE ARCHER!"));
			WorldTasksManager.schedule(new WorldTask() {
				@Override
				public void run() {
					target.setNextGraphics(new Graphics(439));
					npc.setNextAnimation(new Animation(16317));
					for (Entity t : npc.getPossibleTargets()) {
				if (!t.withinDistance(npc, 18))
					continue;
				int damage = getRandomMaxHit(npc, defs.getMaxHit(),
						NPCCombatDefinitions.RANGE, t);
				if (damage > 0) {
					delayHit(npc, 0, t, getMagicHit(npc, damage));
					t.setNextGraphics(new Graphics(439, 0, 100));
				}
			}
					delayHit(
							npc,
							1,
							target,
							getRangeHit(
									npc,
									getRandomMaxHit(npc, defs.getMaxHit()-2,
											NPCCombatDefinitions.RANGE, target)));
				}
			}, 3);
		}
		if(attackStyle == 3) { //fire spray
			npc.setCapDamage(500);
			npc.setNextAnimation(new Animation(16318));
			npc.setNextForceTalk(new ForceTalk("FIRE SPRAY!"));
			WorldTasksManager.schedule(new WorldTask() {
				@Override
				public void run() {
					WorldTasksManager.schedule(new WorldTask() {
						@Override
						public void run() {
							target.setNextGraphics(new Graphics(3002, 0, 100));
							npc.setNextAnimation(new Animation(16317));
							for (Entity t : npc.getPossibleTargets()) {
				if (!t.withinDistance(npc, 18))
					continue;
				int damage = getRandomMaxHit(npc, defs.getMaxHit(),
						NPCCombatDefinitions.MAGE, t);
				if (damage > 0) {
					delayHit(npc, 0, t, getMagicHit(npc, damage));
					t.setNextGraphics(new Graphics(3002, 0, 100));
				}
			}
							delayHit(
									npc,
									0,
									target,
									getMagicHit(
											npc,
											getRandomMaxHit(npc, defs.getMaxHit()-2,
													NPCCombatDefinitions.MAGE, target)));
						}
						
					}, 1);
				}
			}, 2);
		}

		return defs.getAttackDelay();
	}

}