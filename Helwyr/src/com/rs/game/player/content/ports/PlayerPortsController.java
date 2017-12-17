package com.rs.game.player.content.ports;

import com.rs.game.player.controlers.Controler;

public class PlayerPortsController extends Controler {

    private PlayerPorts playerPorts;
    
    @Override
    public void start() {
	playerPorts = (PlayerPorts) getArguments()[0];
    }

    public PlayerPorts getPlayerPorts() {
	return playerPorts;
    }

    public void setPlayerPorts(PlayerPorts playerPorts) {
	this.playerPorts = playerPorts;
    }

}
