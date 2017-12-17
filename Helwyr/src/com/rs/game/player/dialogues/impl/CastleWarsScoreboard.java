package com.rs.game.player.dialogues.impl;

import com.rs.game.minigames.CastleWars;
import com.rs.game.player.dialogues.Dialogue;

public class CastleWarsScoreboard extends Dialogue {

	@Override
	public void start() {
		CastleWars.viewScoreBoard(player);

	}

	@Override
	public void run(int interfaceId, int componentId) {
		close();

	}

	@Override
	public void finish() {

	}

}
