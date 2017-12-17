package com.rs.game.player.dialogues.impl.cities.karamja;

import com.rs.game.player.content.CarrierTravel;
import com.rs.game.player.content.CarrierTravel.Carrier;
import com.rs.game.player.content.quest.impl.piratestreasure.PiratesTreasure;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.game.player.dialogues.impl.BoatingDialouge;
import com.rs.game.player.dialogues.impl.KaramjaTrip;

/**
 * 
 * @author Frostbite
 *
 *<contact@frostbitersps@gmail.com><skype@frostbitersps>
 */

public class CustomsOfficer extends Dialogue {

	private boolean returning;
	private Carrier ship;
	int npcId;


	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		sendNPCDialogue(npcId, PLAIN_TALKING, "Can I help you?");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
		case -1:
			options(DEFAULT, "Can I journey on this ship?", "Does Karamja have a unusal customs then?");
			stage = 1;
			break;

		case 1:
			switch(componentId) {
			case OPTION_1:
				sendNPCDialogue(npcId, PLAIN_TALKING, "You need to be searched before you can board.");
				stage = 2;
				break;
			case OPTION_2:
				sendNPCDialogue(npcId, PLAIN_TALKING, "I'm not that sort of customs officer.");
				stage = -2;
				break;
			}
			break;

		case 2:
			options(DEFAULT, "Why?", "Search away, I have nothing to hide.", "You're not putting your hands on my things!");
			stage = 3;
			break;

		case 3:
			switch(componentId) {
			case OPTION_1:
				sendNPCDialogue(npcId, PLAIN_TALKING, "Because Asgarnia has banned the import of intoxicating",
						"spirits.");
				stage = -3;
				break;
			case OPTION_2:
				sendNPCDialogue(npcId, PLAIN_TALKING, "Well you've got some odd stuff, but it's all legal. Now you",
						"need to pay a boarding charge of 30 coins.");
				stage = 5;
				break;
			case OPTION_3:
				sendNPCDialogue(npcId, PLAIN_TALKING, "You're not getting on this ship then.");
				stage = -2;
				break;
			}
			break;

		case 5:
			options(DEFAULT, "Ok.", "Oh I'll not bother then.");
			stage = 6;
			break;

		case 6:
			switch(componentId) {
			case OPTION_1:
				Object[] attributes = BoatingDialouge.getBoatForShip(npcId);
				if (attributes == null) {
					end();
					return;
				}
				ship = (Carrier) attributes[0];
				returning = (Boolean) attributes[1];
				if(player.getMoneyPouch().getCoinsAmount() >= 30) {
					CarrierTravel.sendCarrier(player, ship, returning);
					end();
				} else {
					player(SAD, "Oh dear, I don't seem to have enough money.");
				}
				break;
			case OPTION_2:
				end();
				break;
			}
			break;

		case 4:
			switch(componentId) {
			case OPTION_1:
					if(player.getInventory().containsItem(PiratesTreasure.KARAMJA_RUM, 1)) {
						player.getInventory().deleteItem(PiratesTreasure.KARAMJA_RUM, Integer.MAX_VALUE);
						player.getPackets().sendGameMessage("The customs officer confiscates your rum.");
						player.getPackets().sendGameMessage("You will need to find some way to smuggle it off the island...");
						end();
				}
				sendNPCDialogue(npcId, PLAIN_TALKING, "Well you've got some odd stuff, but it's all leagal. Now you",
						"need to pay a boarding charge of 30 coins.");
				stage = 5;
				break;
			case OPTION_2:
				sendNPCDialogue(npcId, PLAIN_TALKING, "You're not getting on this ship then.");
				stage = -2;
				break;
			}
			break;

		case -3:
			options(DEFAULT, "Search away, I have nothing to hide.", "You're not putting your hands on my things!");
			stage = 4;
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
