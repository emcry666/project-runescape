package com.rs.game.player.actions;

import com.rs.game.Animation;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

public class PortablePlacing {

    protected static Player player;
    public static WorldTile worldTile;
    
    public static final int FORGE = 0, RANGE = 2, SAWMILL = 3, WELL = 4; 
    

    public static void placePortable(final Player owner, final int item, final int object, final int type) {
	if(owner.getForge(type)) {
	    owner.getPackets().sendGameMessage("You already have a portable placed.");
	    return;
	}
	WorldTasksManager.schedule(new WorldTask() {
	    int ticks;
	    @Override
	    public void run() {
		ticks++;
		switch(ticks) {
		case 1:
		    owner.getInventory().deleteItem(item, 1);
		    owner.setNextAnimation(new Animation(21217));
		    final WorldObject portable = new WorldObject(object, 10, 0, owner.getX() + 1, owner.getY(), owner.getPlane()); // object spawning
		    worldTile = owner.getLastWorldTile();
		    World.spawnPortable(portable, 150000, owner, type);
		    owner.spawnedForges[type] = true;
		    owner.faceObject(portable); 
		    owner.portable = object;
		    owner.portables = owner;
		    player = owner;
		    owner.getPackets().sendGameMessage("You spawn a portable " + (type == FORGE ? "Forge" : type == RANGE ? "Range" : type == SAWMILL ? "Sawmill" : type == WELL ? "Well" : "") + ".");
		    stop();
		    break;
		}
		return;
	    }  
	}, 0, 0);
    }
    
}
