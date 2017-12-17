package com.rs.game.player;

public abstract class Manager {

	public Player player;

	public Manager(Player player) {
		player(player);
	}

	public abstract Manager init();

	public abstract Manager process();

	public Player player() {
		return player;
	}

	public Manager player(Player player) {
		this.player = player;
		return this;
	}

}
