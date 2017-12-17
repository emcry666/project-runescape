package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

 /**
  * 
  * @author Frostbite<Abstract>
  * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
  */

public class SkillcapeShop extends Dialogue {

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		options("Choose a Shop", "Skillcape Shop", "True Mastery Shop", "Skill Hoods", "Nevermind");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
		case -1:
			switch(componentId) {
			case OPTION_1:
				ShopsHandler.openShop(player, 174);
				end();
				break;
			case OPTION_2:
				ShopsHandler.openShop(player, 182);
				end();
				break;
			case OPTION_3:
				ShopsHandler.openShop(player, 178);
				end();
				break;
			case OPTION_4:
				player(NORMAL, "Nevermind");
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
