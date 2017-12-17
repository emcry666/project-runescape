package com.rs.game.npc.kalphite;

import com.rs.game.Animation;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

/**
 * 
 * @author Dylan Doldersum || Mystic Wolf
 * Mar 29, 2016
 */

public class KalphiteHiveHandler {

    
    public static void KKEntrance(Player player, WorldObject object)
    {
	WorldTasksManager.schedule(new WorldTask(){
	    int timer;
	    @Override
	    public void run() {
		if (timer == 0)
		{
		    player.lock();
		    player.setNextAnimation(new Animation(19506));
		}
		else if(timer == 1)
		{
		}
		else if(timer == 2)
		{
		    player.setNextAnimation(new Animation(-1));
		    player.setNextWorldTile(new WorldTile(2949, 1659, 0));
		}
		else if(timer == 3)
		{
		    player.unlock();
		}
		
		timer++;
	    }
	    
	},0, 1);
    }
    
    public static void ExitKK(Player player, WorldObject object)
    {
	WorldTasksManager.schedule(new WorldTask(){
	    int timer;
	    @Override
	    public void run() {
		if (timer == 0)
		{
		    player.lock();
		    player.setNextAnimation(new Animation(19499));
		}
		else if(timer == 1)
		{
		}
		else if(timer == 2)
		{
		    player.setNextAnimation(new Animation(-1));
		    player.setNextWorldTile(new WorldTile(3235, 2858, 0));
		}
		else if(timer == 3)
		{
		    player.unlock();
		}
		
		timer++;
	    }
	    
	},0, 1);
    }
    
    public static void BlockedTunnel(Player player, WorldObject object)
    {
	WorldTasksManager.schedule(new WorldTask(){
	    int timer;
	    @Override
	    public void run() {
		if (timer == 0)
		{
		    player.lock();
		    player.setNextAnimation(new Animation(19497));
		}
		else if(timer == 1)
		{
		}
		else if(timer == 2)
		{
		    player.setNextAnimation(new Animation(-1));
		    player.setNextWorldTile(new WorldTile(2967, 1659, 0));
		}
		else if(timer == 3)
		{
		    player.unlock();
		}
		
		timer++;
	    }
	    
	},0, 1);
    }
}
