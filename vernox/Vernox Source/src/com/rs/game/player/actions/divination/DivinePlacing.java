package com.rs.game.player.actions.divination;

import com.rs.game.Animation;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

/**
 * 
 * @author Dylan || Mystic Wolf || Jul 14, 2016
 *
 */

public class DivinePlacing {

    public static void check(final Player owner) {
	WorldTasksManager.schedule(new WorldTask() {
	    @Override
	    public void run() {
		if(owner.divine > 1)
		    return;
		if(owner.divine == 0){
		    owner.sendMessage("Your divine has vanished.");
		    stop();
		}
		return;
	    }  
	}, 0, 0);
    }


    protected static Player p;


    public static void placeDivine(final Player owner, final int item, final int fobject, final int lobject, final int lvl, final int skillId) {
	WorldTasksManager.schedule(new WorldTask() {
	    final WorldObject divinefirststage = new WorldObject(fobject,10, 0, owner.getX() + 1, owner.getY(), owner.getPlane()); // object spawning
	    int ticks;
	    @Override
	    public void run() {
		ticks++;
		owner.faceObject(divinefirststage);
		if(ticks == 1){
		    owner.getInventory().deleteItem(item, 1);
		    owner.setNextAnimation(new Animation(21217));
		    owner.lock(3);
		    owner.faceObject(divinefirststage); 
		    World.spawnTemporaryObject(divinefirststage, 2700); 
		}
		if(ticks == 5){
		    check(owner); // lets the owner know his divine disapeared
		    final WorldObject divinefinalstage = new WorldObject(lobject,10, 0, owner.getX() + 1, owner.getY(), owner.getPlane(), owner); // object with animation that player will mine
		    World.spawnTemporaryDivineObject(divinefinalstage, 40000, owner);	// time object will stay in miliseconds
		    owner.divine = lobject;
		    owner.divines = owner;
		    p = owner;
		    stop();
		}
		return;
	    }  
	}, 0, 0);
    }
}
