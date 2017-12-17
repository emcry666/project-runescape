package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class KamilCombat extends CombatScript {

	public static final String[] ATTACKS = new String[] { " ", " ", " ", " ", " " };

	@Override
	public Object[] getKeys() {
		return new Object[] { 1913 };
	}

	@Override
	public int attack(final NPC npc, Entity target) {
		int attackStyle = Utils.random(4);
		if (attackStyle == 0) {
			npc.setNextAnimation(new Animation(2066));
			delayHit(npc, 0, target, getMeleeHit(npc, getRandomMaxHit(npc, Utils.random(100, 600), NPCCombatDefinitions.MELEE, target)));
		} else if (attackStyle == 1) {
			npc.setNextAnimation(new Animation(1979));
			final WorldTile center = new WorldTile(target);
			World.sendGraphics(npc, new Graphics(1774), center);
			//npc.setNextForceTalk(new ForceTalk("!"));
			WorldTasksManager.schedule(new WorldTask() {
				int count = 0;

				@Override
				public void run() {
					for (Player player : World.getPlayers()) { // lets just loop
																// all players
																// for massive
																// moves
						if (player == null || player.isDead() || player.hasFinished())
							continue;
						if (player.withinDistance(center, 1)) {
							delayHit(npc, 0, player, new Hit(npc, Utils.random(80, 200), HitLook.REGULAR_DAMAGE));
							if (count == 1 && player.withinDistance(center, 1)) {
								player.sm("You are damaged by unstable magic from the runes..");
							}
							
						}
					}
					if (count++ == 10) {
						stop();
						return;
					}
				}
			}, 0, 0);
		} else if (attackStyle == 2) {
			npc.setNextAnimation(new Animation(811));
			target.setNextGraphics(new Graphics(1014));
			delayHit(npc, 0, target, new Hit(npc, Utils.random(300, 600), HitLook.REGULAR_DAMAGE));
		} else if (attackStyle == 3) { //Smash
			npc.setNextAnimation(new Animation(2066));
			delayHit(npc, 0, target, getMeleeHit(npc, getRandomMaxHit(npc, Utils.random(100, 600), NPCCombatDefinitions.MELEE, target)));
		} else if (attackStyle == 4) { //Barrage
			Entity player = npc.getAttackedBy();
			//npc.faceEntity(player);
			npc.setNextAnimation(new Animation(1979));
			target.setNextGraphics(new Graphics(369));
			delayHit(npc, 0, target, getMagicHit(npc, getRandomMaxHit(npc, Utils.random(200, 400), NPCCombatDefinitions.MAGE, target)));
			target.addFreezeDelay(8000);
		}
		return 5;
	}

}
