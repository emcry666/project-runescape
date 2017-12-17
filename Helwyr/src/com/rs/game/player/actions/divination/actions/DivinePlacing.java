package com.rs.game.player.actions.divination.actions;

import com.rs.game.Animation;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

public class DivinePlacing {

    protected static Player player;
    private static WorldTile worldTile;
    
    public static void check(final Player owner) {
	WorldTasksManager.schedule(new WorldTask() {
	    @Override
	    public void run() {
		if(owner.divine > 1)
		    return;
		if(owner.divine == 0){
		    owner.getPackets().sendGameMessage("Your divine has vanished.");
		    stop();
		}
		return;
	    }  
	}, 0, 0);
    }



    public static void placeDivine(final Player owner, final int item, final int fobject, final int lobject, final int lvl, final int skillId) {
	WorldTasksManager.schedule(new WorldTask() {
	    int ticks;
	    @Override
	    public void run() {
		ticks++;
		if(ticks == 1){
		    owner.getInventory().deleteItem(item, 1);
		    owner.setNextAnimation(new Animation(21217));
		    final WorldObject divinefirststage = new WorldObject(fobject,10, 0, owner.getX() + 1, owner.getY(), owner.getPlane()); // object spawning
		    worldTile = owner.getLastWorldTile();
		    owner.faceObject(divinefirststage); 
		    World.spawnTemporaryObject(divinefirststage, 2700); 
		}
		if(ticks == 5){
		    check(owner); 
		    final WorldObject divinefinalstage = new WorldObject(lobject, 10, 0, worldTile.getX() + 1, worldTile.getY(), worldTile.getPlane(), owner); // object with animation that player will mine
		    World.spawnTemporaryOwnedObject(divinefinalstage, 40000, owner);
		    owner.divine = lobject;
		    owner.divines = owner;
		    player = owner;
		    stop();
		}
		return;
	    }  
	}, 0, 0);
    }
}
