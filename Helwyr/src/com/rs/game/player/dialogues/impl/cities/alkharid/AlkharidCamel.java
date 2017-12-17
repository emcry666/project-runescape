package com.rs.game.player.dialogues.impl.cities.alkharid;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.game.player.dialogues.Mood;
import com.rs.utils.Utils;

public class AlkharidCamel extends Dialogue {
	
	String[] ollieActions = {"The camel turns its head and glares at you.", "The camel tries to stamp on your foot, but you pull it back quickly",
					"The camel spits at you, and you jump back hurriedly."},
			playerJudgements = {"If I go near that camel, it'll probably bite my hand off.", "I wonder if that camel has fleas...", 
				"Mmm... Looks like that camel would make a nice kebab."};

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		sendPlayerChat(Mood.NORMAL, "" + playerJudgements[Utils.random(playerJudgements.length)]);
	}

	@Override
	public void run(int interfaceId, int componentId) {
		end();
		player.getPackets().sendGameMessage("" + ollieActions[Utils.random(ollieActions.length)]);
	}

	@Override
	public void finish() {
		// TODO Auto-generated method stub

	}

}
