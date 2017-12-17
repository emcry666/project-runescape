package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public class FarmingShop extends Dialogue {

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		options(DEFAULT, "Construction (Farming) Shop", "Construction (Supplies) Shop", "Nevermind");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
		case -1:
			switch(componentId) {
			case OPTION_1:
				ShopsHandler.openShop(player, 175);
				end();
				break;
			case OPTION_2:
				ShopsHandler.openShop(player, 176);
				end();
				break;
			case OPTION_3:
				player(NORMAL, "Nevermind..");
				stage = -2;
				break;
			}
			break;
			
		case -2:
			end();
			break;
		}
	}

	@Override
	public void finish() {
		// TODO Auto-generated method stub

	}

}
