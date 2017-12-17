package com.rs.game.npc.combat.impl;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.ForceTalk;
import com.rs.game.Graphics;
import com.rs.game.World;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.player.Player;
import com.rs.utils.Utils;

public class CyclossusCombat extends CombatScript {

	@Override
	public Object[] getKeys() {
		return new Object[] { 3478 };
	}

	@Override
	public int attack(final NPC npc, final Entity target) {
		final NPCCombatDefinitions defs = npc.getCombatDefinitions();
		
		if (Utils.getRandom(4) == 2) { // magical attack
			npc.setNextAnimation(new Animation(defs.getAttackEmote()));
			target.setNextGraphics(new Graphics(2000));
			Player p = (Player) target;
			int pamt = p.getPrayer().getPrayerpoints();
			p.getPrayer().drainPrayer(pamt/2);
			p.sm("Your prayer has been cut in half!");
				delayHit(
						npc,
						1,
						target,
						getMagicHit(
								npc,
								getRandomMaxHit(npc, 650,
										NPCCombatDefinitions.MAGE, target)));
				World.sendProjectile(npc, target, 2240, 41, 16, 41, 35, 16, 0);
		
		} else { // melee attack
			npc.setNextAnimation(new Animation(defs.getAttackEmote()));
			delayHit(
					npc,
					0,
					target,
					getMeleeHit(
							npc,
							getRandomMaxHit(npc, 860,
									NPCCombatDefinitions.MELEE, target)));
		}
		return defs.getAttackDelay();
	}
}
