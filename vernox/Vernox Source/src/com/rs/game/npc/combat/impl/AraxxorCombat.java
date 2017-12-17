package com.rs.game.npc.combat.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Projectile;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.minigames.AraxxiFight;
import com.rs.game.Hit.HitLook;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.npc.spiders.Araxxi;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

/***
 * 
 * @author Jas-Humbzian
 *
 */

public class AraxxorCombat extends CombatScript {
    static Araxxi araxxi;
    static int x;
    static int y;
    private boolean isDoingCleave;
    private boolean isDoingCobweb;
    long lastCleave;
    long lastCobweb;
    static int z;
    WorldTile center1;


    @Override
    public Object[] getKeys() {
	return new Object[]
		{ 19457, 19462, 19463, 19464, 19465, 16466, 19467};
    }






    private void sendMeleeAttack(NPC npc, Entity target) {
	npc.setNextAnimation(new Animation(24094));


	WorldTasksManager.schedule(new WorldTask() {
	    @Override
	    public void run() {
		List<Player> players = Collections.synchronizedList(new ArrayList<Player>());
		players.add((Player) target);
		Entity targets[] = AraxxiFight.getPlayers().toArray(new Entity[AraxxiFight.getPlayersCount()]);
		for (int i=0; i < targets.length; i++) {
		    if (targets[i] != target) {
			if (Utils.getDistance(target, targets[i]) <= 50) {
			    players.add((Player) targets[i]);
			}
		    }
		}
		for (Entity t : players) {
		    int damage = getMaxHit(npc, 3500, NPCCombatDefinitions.MELEE, t);
		    delayHit(npc, 0, t, getMeleeHit(npc, damage));
		    t.setNextGraphics(new Graphics(4998));

		}
	    }
	});
    }


    private boolean getCleave(){
	return isDoingCleave;
    }

    private boolean getCobweb(){
	return isDoingCobweb;
    }

    private void sendMagic(NPC npc, Boolean anim, Entity farthest) {
	if (anim) {
	    npc.setNextAnimation(new Animation(24095));
	}
	Projectile projectile = World.sendProjectile(npc, farthest, 4997, 90, 20, 10, 2, 0, 0);
	int cycleTime = Utils.projectileTimeToCycles(projectile.getEndTime ()) - 1;
	WorldTasksManager.schedule(new WorldTask() {
	    @Override
	    public void run() {
		List<Player> players = Collections.synchronizedList(new ArrayList<Player>());
		players.add((Player) farthest);
		Entity targets[] = AraxxiFight.getPlayers().toArray(new Entity[AraxxiFight.getPlayersCount()]);
		for (int i=0; i < targets.length; i++) {
		    if (targets[i] != farthest) {
			if (Utils.getDistance(farthest, targets[i]) <= 50) {
			    players.add((Player) targets[i]);
			}
		    }
		}
		for (Entity t : players) {
		    int damage = getMaxHit(npc, 3500, NPCCombatDefinitions.MAGE, t);
		    delayHit(npc, 0, t, getMagicHit(npc, damage));
		    t.setNextGraphics(new Graphics(4998));

		}
	    }
	}, cycleTime);
    }



    public void sendCobweb(NPC npc) {



	isDoingCobweb = true;
	npc.setNextAnimation(new Animation(24075));
	npc.setNextGraphics(new Graphics(4987));
	npc.setCantInteract(true);


	if (npc.getId() != 19464){
	    for (Player p : AraxxiFight.getPlayers()) {
		p.getPackets().sendGameMessage("<col=e3560e>Araxxo r is Healing!</col>");
	    }
	}

	if (npc.getId() == 19464){
	    for (Player p : AraxxiFight.getPlayers()) {
		p.getPackets().sendGameMessage("<col=e3560e>Araxxi is Healing!</col>");
	    }
	}

	WorldTasksManager.schedule(new WorldTask() {
	    int loop;

	    @Override
	    public void run() {
		if (loop == 0) {
		    npc.heal(5000);
		    npc.heal(5000);
		} else if (loop == 2) {
		    npc.heal(5000);
		} else if (loop == 4) {
		    npc.heal(5000);
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

    public void sendCleave(NPC npc, Entity target) {


	npc.setNextAnimation(new Animation(24050));
	npc.setNextGraphics(new Graphics(4986));
	isDoingCleave = true;

	for (Player p : AraxxiFight.getPlayers()) {
	    p.setNextWorldTile(new WorldTile(npc.getX(),npc.getY(), npc.getPlane()));
	}





	WorldTasksManager.schedule(new WorldTask() {
	    int loop;

	    @Override
	    public void run() {
		if (loop == 2) {



		    if(target.getX() >= npc.getX()-3 && target.getX() <= npc.getX()+3
			    && target.getY() >= npc.getY()-3 && target.getY() <= npc.getY()+3)
			target.applyHit(new Hit(npc, Utils.random(4000, 6000), HitLook.REGULAR_DAMAGE));








		    stop();
		    isDoingCleave = false;
		    lastCleave = Utils.currentTimeMillis() + 13000;
		}
		loop++;
	    }
	}, 0, 1);



    }






    private void sendRange(NPC npc, Boolean anim, Entity farthest) {
	if (anim) {
	    npc.setNextAnimation(new Animation(24095));
	}
	Projectile projectile = World.sendProjectile(npc, farthest, 4979, 90, 20, 10, 2, 0, 0);
	int cycleTime = Utils.projectileTimeToCycles(projectile.getEndTime ()) - 1;
	WorldTasksManager.schedule(new WorldTask() {
	    @Override
	    public void run() {
		List<Player> players = Collections.synchronizedList(new ArrayList<Player>());
		players.add((Player) farthest);
		Entity targets[] = AraxxiFight.getPlayers().toArray(new Entity[AraxxiFight.getPlayersCount()]);
		for (int i=0; i < targets.length; i++) {
		    if (targets[i] != farthest) {
			if (Utils.getDistance(farthest, targets[i]) <= 50) {
			    players.add((Player) targets[i]);
			}
		    }
		}
		for (Entity t : players) {
		    int damage = getMaxHit(npc, 3500, NPCCombatDefinitions.RANGE, t);
		    delayHit(npc, 0, t, getRangeHit(npc, damage));
		    t.setNextGraphics(new Graphics(4978));

		}
	    }
	}, cycleTime);
    }






    @Override
    public int attack(final NPC npc, final Entity target) {
	final Araxxi boss = (Araxxi) npc;




	int styletype = Utils.random(150);










	if (styletype <= 40) 
	    sendMagic(npc, true, target);


	else if (styletype <= 80 && styletype >= 41) 
	    sendRange(npc, true, target);


	else if (styletype <=120 && styletype >= 81 ) 
	    sendMeleeAttack(npc, target);


	else if (getCleave() == false && Utils.currentTimeMillis() >= lastCleave && styletype <= 140 && styletype >= 121) 
	    sendCleave(npc, target);


	else if (getCobweb() == false && Utils.currentTimeMillis() >= lastCobweb && styletype >= 141 ) {
	    sendCobweb(npc);
	}









	return 4;
    }

}