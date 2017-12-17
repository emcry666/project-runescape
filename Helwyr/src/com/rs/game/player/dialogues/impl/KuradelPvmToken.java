package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public class KuradelPvmToken extends Dialogue {

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		npc(NORMAL, "Ello " + player.getDisplayName() + " are you after the PvM Store?");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch (stage) {
		case -1:
			options(DEFAULT, "Yes I am", "No I am not");
			stage = 1;
			break;
			
		case 1:
			switch (componentId) {
			case OPTION_1:
				npc(HAPPY, "Very well than");
				stage = -3;
				break;
			case OPTION_2:
				npc(HAPPY, "Very well than");
				stage = -2;
				break;
			}
			break;
			
		case -3:
			end();
			ShopsHandler.openShop(player, 179);
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
