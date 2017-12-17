package com.rs.game.npc.combat.impl;

import java.util.ArrayList;
import java.util.Collections;
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
import com.rs.game.npc.araxxi.Araxxi;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.npc.familiar.Familiar;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

/***
 * 
 * @author HumbzianDev
 *
 */

public class AraxxorCombat extends CombatScript {

	int x, y, z;
	private boolean isDoingCleave, isDoingCobweb;
	long lastCleave = Utils.currentTimeMillis() + 15000,
		 lastCobweb = Utils.currentTimeMillis() + 15000;
	WorldTile center1;


	@Override
	public Object[] getKeys() {
		return new Object[]
				{ 19457, 19462, 19463, 19464, 19465, 16466, 19467};
	}

	private boolean getCleave(){
		return isDoingCleave;
	}

	private boolean getCobweb(){
		return isDoingCobweb;
	}

	private void sendMeleeAttack(final NPC npc, final Entity target) {
		npc.setNextAnimation(new Animation(24094));
		final Araxxi boss = (Araxxi) npc;
		WorldTasksManager.schedule(new WorldTask() {
			@Override
			public void run() {
				List<Player> players = Collections.synchronizedList(new ArrayList<Player>());
				if(target != null && (!(target instanceof Familiar)))
					players.add((Player) target);
				Entity targets[] = boss.getPlayers().toArray(new Entity[boss.getPlayersCount()]);
				for (int i=0; i < targets.length; i++) {
					if (targets[i] != target) {
						if (Utils.getDistance(target, targets[i]) <= 50) {
							players.add((Player) targets[i]);
						}
					}
				}
				for (Entity t : players) {
					int damage = getMaxHit(npc, Utils.random(250,450), NPCCombatDefinitions.MELEE, t);
					delayHit(npc, 0, t, getMeleeHit(npc, damage));
					t.setNextGraphics(new Graphics(4998));

				}
			}
		});
	}

	private void sendRange(final NPC npc, final Boolean anim, final Entity farthest) {
		if (anim) {
			npc.setNextAnimation(new Animation(24095));
		}
		final Araxxi boss = (Araxxi) npc;
		Projectile projectile = World.sendProjectile(npc, farthest, 4997, 90, 20, 10, 2, 0, 0);
		int cycleTime = Utils.projectileTimeToCycles(projectile.getEndTime  ()) - 1;
		WorldTasksManager.schedule(new WorldTask() {
			@Override
			public void run() {
				List<Player> players = Collections.synchronizedList(new ArrayList<Player>());
				if(farthest != null && (!(farthest instanceof Familiar)))
				players.add((Player) farthest);
				Entity targets[] = boss.getPlayers().toArray(new Entity[boss.getPlayersCount()]);
				for (int i=0; i < targets.length; i++) {
					if (targets[i] != farthest) {
						if (Utils.getDistance(farthest, targets[i]) <= 50) {
							players.add((Player) targets[i]);
						}
					}
				}
				for (Entity t : players) {
					int damage = getMaxHit(npc, Utils.random(250, 375), NPCCombatDefinitions.RANGE, t);
					delayHit(npc, 0, t, getRangeHit(npc, damage));
					t.setNextGraphics(new Graphics(4998));

				}
			}
		}, cycleTime);
	}

	private void sendMagic(final NPC npc, final Boolean anim, final Entity farthest) {
		if (anim) {
			npc.setNextAnimation(new Animation(24095));
		}
		final Araxxi boss = (Araxxi) npc;
		Projectile projectile = World.sendProjectile(npc, farthest, 4979, 90, 20, 10, 2, 0, 0);
		int cycleTime = Utils.projectileTimeToCycles(projectile.getEndTime  ()) - 1;
		WorldTasksManager.schedule(new WorldTask() {
			@Override
			public void run() {
				List<Player> players = Collections.synchronizedList(new ArrayList<Player>());
				if(farthest != null && (!(farthest instanceof Familiar)))
				players.add((Player) farthest);
				Entity targets[] = boss.getPlayers().toArray(new Entity[boss.getPlayersCount()]);
				for (int i=0; i < targets.length; i++) {
					if (targets[i] != farthest) {
						if (Utils.getDistance(farthest, targets[i]) <= 50) {
							players.add((Player) targets[i]);
						}
					}
				}
				for (Entity t : players) {
					int damage = getMaxHit(npc, Utils.random(250, 350), NPCCombatDefinitions.MAGE, t);
					delayHit(npc, 0, t, getMagicHit(npc, damage));
					t.setNextGraphics(new Graphics(4978));

				}
			}
		}, cycleTime);
	}



	public  void sendCobweb(final NPC npc) {
		isDoingCobweb = true;
		npc.setNextAnimation(new Animation(24075));
		npc.setNextGraphics(new Graphics(4987));
		npc.setCantInteract(true);

		if (npc.getId() != 19464){
			for (Player p : World.getPlayers()) {
				if (p.withinDistance(npc, 20))
					p.getPackets().sendGameMessage("<col=e3560e>Araxxor is Healing!</col>");
			}
		}

		if (npc.getId() == 19464){
			for (Player p : World.getPlayers()) {
				if (p.withinDistance(npc, 20))
					p.getPackets().sendGameMessage("<col=e3560e>Araxxi is Healing!</col>");
			}
		}

		WorldTasksManager.schedule(new WorldTask() {
			int loop;

			@Override
			public void run() {
				if (loop == 0) {
					npc.heal(500);
					npc.applyHit(new Hit(npc, 500, HitLook.HEALED_DAMAGE));
				} else if (loop == 2) {
					npc.heal(500);
					npc.applyHit(new Hit(npc, 500, HitLook.HEALED_DAMAGE));
				} else if (loop == 4) {
					npc.heal(500);
					npc.applyHit(new Hit(npc, 500, HitLook.HEALED_DAMAGE));
				} else if (loop == 6){
					npc.setCantInteract(false);
					lastCobweb = Utils.currentTimeMillis() + 30000;
					isDoingCobweb = false;
					stop();
				}
				loop++;
			}
		}, 0, 1);
	}

	public void sendCleave(final NPC npc, final Entity target) {
		npc.setNextAnimation(new Animation(24050));
		npc.setNextGraphics(new Graphics(4986));
		if(target instanceof Familiar)
			return;
		for (Player p : World.getPlayers()) {
			if (p.withinDistance(npc, 20))
				p.setNextWorldTile(new WorldTile(npc.getX(),npc.getY(), npc.getPlane()));
		}

		WorldTasksManager.schedule(new WorldTask() {
			int loop;

			@Override
			public void run() {
				if (loop == 2) {
					if(target.getX() >= npc.getX() -3 && target.getX() <= npc.getX() + 3
							&& target.getY() >= npc.getY() -3 && target.getY() <= npc.getY()+3)
						target.applyHit(new Hit(npc,  Utils.random(750, 950), HitLook.REGULAR_DAMAGE));

					stop();
					isDoingCleave = false;
					npc.setCantInteract(false);
				}
				loop++;
			}
		}, 0, (int) 1.3);
	}

	@Override
	public int attack(final NPC npc, final Entity target) {
		int specialInt = 7;
		final Araxxi boss = (Araxxi) npc;
		switch (npc.getId())
		{
		case 19464:
			if(!isDoingCleave && !isDoingCobweb) {
				if (target.withinDistance(npc, 4))
					sendMeleeAttack(npc, target);
				else if (Utils.random(1, 2) == 1)
					sendRange(npc, true, target);
				else
					sendMagic(npc, true, target);
			}
			if(!isDoingCobweb && !isDoingCleave && !npc.isCantInteract() && Utils.currentTimeMillis() >= lastCleave && Utils.random(specialInt) == 0){
				lastCleave = Utils.currentTimeMillis() + 15000;
				isDoingCleave = true;
				sendCleave(npc, target);
				npc.setCantInteract(true);
			}
			if(!isDoingCleave && !isDoingCobweb && !npc.isCantInteract() && Utils.currentTimeMillis() >= lastCobweb && Utils.random(specialInt) == 1){
				lastCobweb = Utils.currentTimeMillis() + 15000;
				isDoingCobweb = true;
				sendCobweb(npc);
				npc.setCantInteract(true);
			}
			break;
		case 19457://MELEE MODE
		case 19465://MELEE ACIDIC
			if(!isDoingCleave && !isDoingCobweb){
				if (target.withinDistance(npc, 4))
					sendMeleeAttack(npc, target);
				else
					sendRange(npc, true, target);
			}
			if(!isDoingCobweb && !isDoingCleave && !npc.isCantInteract() && Utils.currentTimeMillis() >= lastCleave && Utils.random(specialInt) == 0){
				lastCleave = Utils.currentTimeMillis() + 25000;
				isDoingCleave = true;
				sendCleave(npc, target);
				npc.setCantInteract(true);
			}
			if(!isDoingCleave && !isDoingCobweb && !npc.isCantInteract() && Utils.currentTimeMillis() >= lastCobweb && Utils.random(specialInt) == 1){
				lastCobweb = Utils.currentTimeMillis() + 25000;
				isDoingCobweb = true;
				sendCobweb(npc);
				npc.setCantInteract(true);
			}
			break;
		case 19463://RANGE MODE
		case 19467://RANGE ACIDIC
			if(!isDoingCleave && !isDoingCobweb){
				if (target.withinDistance(npc, 4))
					sendMeleeAttack(npc, target);
				else
					sendRange(npc, true, target);
			}
			if(!isDoingCobweb && !isDoingCleave && !npc.isCantInteract() && Utils.currentTimeMillis() >= lastCleave && Utils.random(specialInt) == 0){
				lastCleave = Utils.currentTimeMillis() + 25000;
				isDoingCleave = true;
				sendCleave(npc, target);
				npc.setCantInteract(true);
			}
			if(!isDoingCleave && !isDoingCobweb && !npc.isCantInteract() && Utils.currentTimeMillis() >= lastCobweb && Utils.random(specialInt) == 1){
				lastCobweb = Utils.currentTimeMillis() + 25000;
				isDoingCobweb = true;
				sendCobweb(npc);
				npc.setCantInteract(true);
			}
			break;

		case 19462://MAGE MODE
		case 19466://MAGE ACIDIC
			if(!isDoingCleave && !isDoingCobweb){
				if (target.withinDistance(npc, 4))
					sendMeleeAttack(npc, target);
				else
					sendMagic(npc, true, target);
			}
			if(!isDoingCobweb && !isDoingCleave && !npc.isCantInteract() && Utils.currentTimeMillis() >= lastCleave && Utils.random(specialInt) == 0){
				lastCleave = Utils.currentTimeMillis() + 25000;
				isDoingCleave = true;
				sendCleave(npc, target);
				npc.setCantInteract(true);
			}
			if(!isDoingCleave && !isDoingCobweb && !npc.isCantInteract() && Utils.currentTimeMillis() >= lastCobweb && Utils.random(specialInt) == 1){
				lastCobweb = Utils.currentTimeMillis() + 25000;
				isDoingCobweb = true;
				sendCobweb(npc);
				npc.setCantInteract(true);
			}
		}
		return 5;
	}

}