package com.rs.game.player.dialogues.impl.cities.draynor;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

/**
 * 
 * @author Frostbite
 *
 *<contact@frostbitersps@gmail.com><skype@frostbitersps>
 */

public class Fortunato extends Dialogue {

	private int npcId;

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		npc(npcId, NORMAL, "Can I help you at all?");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
		case -1:
			options(DEFAULT, "Yes, what are you selling?", "Not at the moment.");
			stage = 1;
			break;
			
		case 1:
			switch(componentId) {
			case OPTION_1:
				ShopsHandler.openShop(player, 97);
				break;
			case OPTION_2:
				npc(npcId, ANGRY, "Then move along, you filthy ragamuffin, I have " + 
						"customers to serve!");
				break;
			}
			break;
		
			
			
		case -2:
			end();
			break;

		default:
			end();
			break;
		}
	}

	@Override
	public void finish() {
		// TODO Auto-generated method stub

	}

}
