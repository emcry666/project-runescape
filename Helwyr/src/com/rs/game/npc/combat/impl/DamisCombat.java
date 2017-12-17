package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.utils.Utils;

public class DamisCombat extends CombatScript {

	public static final String[] ATTACKS = new String[] { " ", " ", " ", " ", " " };

	@Override
	public Object[] getKeys() {
		return new Object[] { 1974 };
	}

	@Override
	public int attack(final NPC npc, Entity target) {
		int attackStyle = Utils.random(4);
		if (attackStyle == 0) {
			npc.setNextAnimation(new Animation(10502));
			delayHit(npc, 0, target, getMeleeHit(npc, getRandomMaxHit(npc, Utils.random(100, 600), NPCCombatDefinitions.MELEE, target)));
		} else if (attackStyle == 1) {
			npc.setNextAnimation(new Animation(11993));
			target.setNextGraphics(new Graphics(1194));
			delayHit(npc, 0, target, getMagicHit(npc, getRandomMaxHit(npc, Utils.random(200, 500), NPCCombatDefinitions.MAGE, target)));
			delayHit(npc, 0, target, getMagicHit(npc, getRandomMaxHit(npc, Utils.random(100, 300), NPCCombatDefinitions.MAGE, target)));

		} else if (attackStyle == 2) {
			npc.setNextAnimation(new Animation(10505));
			target.setNextGraphics(new Graphics(1154));
			delayHit(npc, 0, target, new Hit(npc, Utils.random(300, 600), HitLook.REGULAR_DAMAGE));
		} else if (attackStyle == 3) { //Smash
			npc.setNextAnimation(new Animation(10502));
			delayHit(npc, 0, target, getMeleeHit(npc, getRandomMaxHit(npc, Utils.random(200, 500), NPCCombatDefinitions.MELEE, target)));
		} else if (attackStyle == 4) { //Barrage
			Entity player = npc.getAttackedBy();
			//npc.faceEntity(player);
			npc.setNextAnimation(new Animation(11991));
			delayHit(npc, 0, target, getMeleeHit(npc, getRandomMaxHit(npc, Utils.random(400, 680), NPCCombatDefinitions.MELEE, target)));
		}
		return 5;
	}

}
