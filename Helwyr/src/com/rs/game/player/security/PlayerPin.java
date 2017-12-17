package com.rs.game.player.security;

import java.io.Serializable;

import com.rs.cache.loaders.Configs;
import com.rs.game.player.Player;

public class PlayerPin implements Serializable {

	private static final long serialVersionUID = 360272660015733679L;

	public int playerPin;
	public boolean enteredPin;
	public boolean hasPin;
	public Player player;
	
	public void onLogin() {
		if(Configs.DEVELOPER_WORLD) {
			player.getPlayerPin().setEnteredPin(true);
			return;
		}
		if(player.getRights() == 2) {
			player.getPlayerPin().setEnteredPin(true);
			return;
		}
		if(!player.getPlayerPin().hasPin()) {
			player.getPlayerPin().setEnteredPin(true);
			return;
		}
		if(!(player.getLastIP() == player.getSession().getIP()) &&  player.getSession().getIP() != "127.0.0.1") {
				player.getPlayerPin().prompt();
		} else {
			player.getPlayerPin().setEnteredPin(true);
		}
	}

	public void prompt() {
		if(hasPin) {
			player.getPackets().sendInputNameScript("What is your player pin? (Min: 4 numbers)");
			player.getTemporaryAttributtes().put("req_pp", Boolean.TRUE);
		}
		player.lock();
	}

	public void promptChange() {
		player.getPackets().sendInputNameScript((hasPin() ? "Change" : "Set") +  " your Player Pin. (Min: 4 Numbers)");
		player.getTemporaryAttributtes().put("set_pp", Boolean.TRUE);
	}

	public int removePlayerPin() {
		return playerPin = -1;
	}

	public void setEnteredPin(boolean enteredPin) {
		this.enteredPin = enteredPin;
		if(enteredPin)
			player.unlock();
	}

	public boolean hasEnteredPin() {
		return enteredPin;
	}

	public int setPlayerPin(int pin) {
		return playerPin = pin;
	}

	public int getPlayerPin() {
		return playerPin;
	}

	public boolean hasPin() {
		return hasPin;
	}

	public boolean setHasPin(boolean hasPin) {
		return this.hasPin = hasPin;
	}

	public Player setPlayer(Player player) {
		return this.player = player;
	}

}
