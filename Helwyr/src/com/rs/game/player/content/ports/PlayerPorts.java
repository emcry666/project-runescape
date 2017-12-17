package com.rs.game.player.content.ports;

import java.io.Serializable;

import com.rs.game.RegionBuilder;
import com.rs.game.WorldTile;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public class PlayerPorts implements Serializable {

	private static final long serialVersionUID = -4804832023100008376L;
	
	private Player player;
    public int[] boundChuncks;
    public boolean insidePort;
    
    public PlayerPorts(Player player) {
    	this.player = player;
    }
    
    public void initalizePort() {
    	if(!isInsidePort()) {
    		player.getControlerManager().startControler("PlayerPortsController", this);
    		boundChuncks = RegionBuilder.findEmptyRegionBound(12, 14);
    		RegionBuilder.copyAllPlanesMap(1534, 911, boundChuncks[0], boundChuncks[1], 12, 14);
    		WorldTasksManager.schedule(new WorldTask() {
    			@Override
    			public void run() {
    				player.setNextWorldTile(new WorldTile(boundChuncks[0] * 0 + 96, boundChuncks[1] * 0 + 110, 0));
    			}
    		});
    	}
    }
    
    public boolean isInsidePort() {
    	return insidePort;
    }

    public boolean setInsidePort(boolean value) {
    	return insidePort = value;
    }

    public int[] getBoundChuncks() {
    	return boundChuncks;
    }

    public void setPlayer(Player player) {
    	this.player = player;
    }

}
