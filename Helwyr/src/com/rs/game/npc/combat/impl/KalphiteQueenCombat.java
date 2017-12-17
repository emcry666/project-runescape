package com.rs.game.npc.combat.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.Projectile;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class KalphiteQueenCombat extends CombatScript {

	
	@Override
	public Object[] getKeys() {
		return new Object[] { "Kalphite Queen" };
	}
	
	public static void attackMageTarget(final List<Player> arrayList, Entity fromEntity, final NPC startTile, Entity t,
		    final int projectile, final int gfx) {
		final Entity target = t == null ? getTarget(arrayList, fromEntity, startTile) : t;
		final NPC npc = (NPC) fromEntity;
		if (target == null)
		    return;
		if (target instanceof Player)
		    arrayList.add((Player) target);
		Projectile proj = World.sendProjectileNew(fromEntity, target, projectile, fromEntity == startTile ? 70 : 20, 20,
			30, 6, 0, 0);
		int endTime = Utils.projectileTimeToCycles(proj.getEndTime()) - 1;
		delayHit(startTile, endTime, target,
			getMagicHit(startTile, getMaxHit(startTile, npc.getMaxHit(), NPCCombatDefinitions.MAGE, target)));
		WorldTasksManager.schedule(new WorldTask() {

		    @Override
		    public void run() {
			target.setNextGraphics(new Graphics(gfx));
			attackMageTarget(arrayList, target, startTile, null, projectile, gfx);
		    }
		}, endTime);
	    }

	    private static void attackMageTarget(final List<Player> arrayList, Entity fromEntity, final NPC npc, Entity t) {
		final Entity target = t == null ? getTarget(arrayList, fromEntity, npc) : t;
		if (target == null)
		    return;
		if (target instanceof Player)
		    arrayList.add((Player) target);
		Projectile proj = fromEntity == npc ? World.sendProjectileNew(npc, target, 5048,
			npc.getId() == 1158 || npc.getId() == 16707 ? 58 : 68, 30, 53, 1, 20, 50)
			: World.sendProjectileNew(fromEntity, target, 5048, 30, 30, 30, 3, 0, 0);
		int endTime = Utils.projectileTimeToCycles(proj.getEndTime()) - 1;
		WorldTasksManager.schedule(new WorldTask() {

		    @Override
		    public void run() {
			int damage = Utils.random(npc.getMaxHit(NPCCombatDefinitions.MAGE));
			target.applyHit(new Hit(npc, damage, HitLook.MAGIC_DAMAGE));
			target.setNextGraphics(new Graphics(5049, 0, 100));
			attackMageTarget(arrayList, target, npc, null);
		    }
		}, endTime);
	    }
	
	    public static Player getTarget(List<Player> list, final Entity fromEntity, NPC startTile) {
	    	if (fromEntity == null)
	    	    return null;
	    	ArrayList<Player> added = new ArrayList<Player>();
	    	for (Entity entity : startTile.getPossibleTargets()) {
	    	    if (!(entity instanceof Player))
	    		continue;
	    	    Player player = (Player) entity;
	    	    if (player == null || list.contains(player) || !player.withinDistance(fromEntity)
	    		    || !player.withinDistance(startTile))
	    		continue;
	    	    added.add(player);
	    	}
	    	if (added.isEmpty())
	    	    return null;
	    	Collections.sort(added, new Comparator<Player>() {

	    	    @Override
	    	    public int compare(Player o1, Player o2) {
	    		if (o1 == null)
	    		    return 1;
	    		if (o2 == null)
	    		    return -1;
	    		if (Utils.getDistance(o1, fromEntity) > Utils.getDistance(o2, fromEntity))
	    		    return 1;
	    		else if (Utils.getDistance(o1, fromEntity) < Utils.getDistance(o2, fromEntity))
	    		    return -1;
	    		else
	    		    return 0;
	    	    }
	    	});
	    	return added.get(0);

	        }
	
	@Override
	public int attack(final NPC npc, final Entity target) {
		final NPCCombatDefinitions defs = npc.getCombatDefinitions();
		int attackStyle = Utils.random(3);
		if(attackStyle == 0) {
			int distanceX = target.getX() - npc.getX();
			int distanceY = target.getY() - npc.getY();
			int size = npc.getSize();
			if (distanceX > size || distanceX < -1 || distanceY > size
					|| distanceY < -1)
				attackStyle = Utils.random(2); // set mage
			else{
				npc.setNextAnimation(new Animation(defs.getAttackEmote()));
				delayHit(
						npc,
						0,
						target,
						getMeleeHit(
								npc,
								getRandomMaxHit(npc, defs.getMaxHit(),
										NPCCombatDefinitions.MELEE, target)));
				return defs.getAttackDelay();
			}
		}
		npc.setNextAnimation(new Animation(npc.getId() == 1158 ? 6240 : 6234));
		if(attackStyle == 1) { //range easy one
			for (final Entity t : npc.getPossibleTargets()) {
				delayHit(npc, 2, t, getRangeHit(npc, getRandomMaxHit(npc, defs.getMaxHit(), NPCCombatDefinitions.RANGE, t)));
				World.sendProjectile(npc, t, 288, 46, 31, 50, 30, 16, 0);
			}
		}else{
			npc.setNextGraphics(new Graphics(npc.getId() == 1158 ? 278 : 279));
			WorldTasksManager.schedule(new WorldTask() {

				@Override
				public void run() {
					attackMageTarget(new ArrayList<Player>(), npc, npc, target);
				}
				
			});
		}
		return defs.getAttackDelay();
	}
}
