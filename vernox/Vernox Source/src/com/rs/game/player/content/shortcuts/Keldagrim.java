package com.rs.game.player.content.shortcuts;

import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.player.Player;
import com.rs.game.player.RouteEvent;

public class Keldagrim {
    
    
    public static void handleObjects(Player player, WorldObject object)
    {
	switch(object.getId())
	{
	case 28094:
	    if (player != null)
	    {
		    player.setRouteEvent(new RouteEvent(object, new Runnable() {
			@Override
			public void run() {
			    // unreachable objects exception
			    player.faceObject(object);
			    if(player.getPlane() == 0)
			    {
				    player.useStairs(-1, new WorldTile(2864, 10201, 0), 0, 1);
			    }
			}
		    }, true));
		    return;
	    }
	    break;
	case 6087:
	    if (player != null)
	    {
		    player.setRouteEvent(new RouteEvent(object, new Runnable() {
			@Override
			public void run() {
			    // unreachable objects exception
			    player.faceObject(object);
			    if(player.getPlane() == 0)
			    {
				player.useStairs(-1, new WorldTile(player.getX(), player.getY(), player.getPlane() + 1), 0, 1);
			    }
			}
		    }, true));
		    return;
	    }
	    break;
	}
    }

}
