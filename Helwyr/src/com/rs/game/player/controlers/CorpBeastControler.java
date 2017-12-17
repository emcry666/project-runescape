package com.rs.game.player.controlers;

import com.rs.Settings;
import com.rs.game.Animation;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

public class CorpBeastControler extends Controler {

	@Override
	public void start() {

	}

	@Override
	public boolean processObjectClick1(WorldObject object) {
		if (object.getId() == 37929 || object.getId() == 38811) {
			removeControler();
			player.stopAll();
			player.setNextWorldTile(new WorldTile(2970, 4384, player.getPlane()));
			return false;
		}
		return true;
	}

	@Override
	public void magicTeleported(int type) {
		removeControler();
	}


	@Override
	public boolean login() {
		return false; // so doesnt remove script
	}

	@Override
	public boolean logout() {
		return false; // so doesnt remove script
	}

}
