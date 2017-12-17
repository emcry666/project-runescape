package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.ForceTalk;
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

public class MaxCombat extends CombatScript {

	public static final String[] ATTACKS = new String[] { " ", " ", " ", " ", "IS THIS ALL YOU'VE GOT?" };

	@Override
	public Object[] getKeys() {
		return new Object[] { 19098 };
	}

	@Override
	public int attack(final NPC npc, Entity target) {
		int attackStyle = Utils.random(7);
		if (attackStyle == 0) {
			npc.setNextAnimation(new Animation(12031));
			npc.setNextGraphics(new Graphics(2118));
			if (Utils.random(2) == 2) {
			if (target instanceof Player) {
				Player p2 = (Player) target;
				p2.setPrayerDelay(5000);// 5 seconds
			}}
			delayHit(npc, 2, target, getMeleeHit(npc, getRandomMaxHit(npc, Utils.random(360), NPCCombatDefinitions.MELEE, target)));
		} else if (attackStyle == 1) {
			npc.setNextAnimation(new Animation(1979));
			final WorldTile center = new WorldTile(target);
			World.sendGraphics(npc, new Graphics(2197), center);
			npc.setNextForceTalk(new ForceTalk("Come forth my demon!"));
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
							if (player.getEquipment().getShieldId() == 13744) {
							delayHit(npc, 0, player, new Hit(npc, Utils.random(100), HitLook.REGULAR_DAMAGE));
							} else {
							delayHit(npc, 0, player, new Hit(npc, Utils.random(300), HitLook.REGULAR_DAMAGE));
							if (count == 1 && player.withinDistance(center, 1)) {
								player.sm("The demon draws the life from you.");
							}
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
			npc.setNextAnimation(new Animation(10961));
			npc.setNextGraphics(new Graphics(1950));
			delayHit(npc, 2, target, getMeleeHit(npc, getRandomMaxHit(npc, Utils.random(200, 400), NPCCombatDefinitions.MELEE, target)), getMeleeHit(npc, getRandomMaxHit(npc, Utils.random(150, 300), NPCCombatDefinitions.MELEE, target)));
			delayHit(npc, 2, target, getMeleeHit(npc, getRandomMaxHit(npc, Utils.random(100, 150), NPCCombatDefinitions.MELEE, target)), getMeleeHit(npc, getRandomMaxHit(npc, Utils.random(10, 100), NPCCombatDefinitions.MELEE, target)));
		} else if (attackStyle == 3) { //Smash
			delayHit(npc, 2, target, getMeleeHit(npc, getRandomMaxHit(npc, Utils.random(600), NPCCombatDefinitions.MELEE, target)));
			npc.setNextAnimation(new Animation(13691));
			npc.setNextForceTalk(new ForceTalk(ATTACKS[Utils.random(ATTACKS.length)]));
		} else if (attackStyle == 4) {
			npc.setNextAnimation(new Animation(829));
			npc.heal(200);
		} else if (attackStyle == 5) { //Greataxe
			Entity player = npc.getAttackedBy();
			//npc.faceEntity(player);
			npc.setNextAnimation(new Animation(12002));
			delayHit(npc, 2, target, getMeleeHit(npc, getRandomMaxHit(npc, Utils.random(960), NPCCombatDefinitions.MELEE, target)));
		} else if (attackStyle == 6) { //DDS
			npc.setNextAnimation(new Animation(1062));
			npc.setNextGraphics(new Graphics(252, 0, 100));
			delayHit(npc, 2, target, getMeleeHit(npc, getRandomMaxHit(npc, Utils.random(350), NPCCombatDefinitions.MELEE, target)), getMeleeHit(npc, getRandomMaxHit(npc, Utils.random(350), NPCCombatDefinitions.MELEE, target)));
		}
		return 5;
	}

}
