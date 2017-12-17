package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public class ReputeMaster extends Dialogue {

	public int npcId;

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		sendNPCDialogue(npcId, NORMAL, "Hello " + player.getDisplayName() + ", What would you wish to do?");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
		case -1:
			sendOptionsDialogue(DEFAULT, "I would like to Repute", "What is Repute?", "What are the rewards for Reputing?", "Nothing, Goodbye.");
			stage = 1;
			break;

		case 1:
			switch(componentId) {
			case OPTION_1:
				sendOptionsDialogue("You really wish to repute? (RESET)", "What is repute?", "Yes, I am fearless (RESETS ALL STATS)", "No, I would like to keep my stats.");
				stage = 4;
				break;
			case OPTION_2:
				sendNPCDialogue(npcId, NORMAL, "Repute is another word for 'Prestige', Reputing allows you to reset all of your statistics for another run to max them...");
				stage = 2;
				break;
			case OPTION_3:
				sendNPCDialogue(npcId, UNSURE, "Upon reputing, You will be given a chance at a huge variety of rare, and unique items, and/or weapons, or passive abilities.");
				stage = -1;
				break;
			case OPTION_4:
				sendNPCDialogue(npcId, NORMAL, "Fare well " + player.getDisplayName() + ".");
				stage = -2;
				break;
			}
			break;

		case 2:
			sendNPCDialogue(npcId, NORMAL, "However.. Each time you repute your experience is increased, however this only stacks up to 5 times. Once you pre...");
			stage = 3;
			break;

		case 3:
			sendNPCDialogue(npcId, NORMAL, "stige, It will announce how many times you have repeated this process. The 5th time is the last stage of which your xp is increased.");
			stage = -1;
			break;

		case 4:
			switch(componentId) {
			case OPTION_1:
				sendNPCDialogue(npcId, NORMAL, "Repute is another word for 'Prestige', Reputing allows you to reset <col=ff0000>ALL</col> of your stats to level 1 for another run to max them...");
				stage = 2;
				break;
			case OPTION_2:
				sendNPCDialogue(npcId, UNSURE, "As you wish...");
				player.getReputeManager().repute();
				stage = -2;
				break;
			case OPTION_3:
				sendPlayerDialogue(ANGRY, "No! I wish to keep my statistics.");
				stage = -2;
				break;
			}
			break;

		case -2:
			close();
			break;
		}
	}

	@Override
	public void finish() {
		// TODO Auto-generated method stub

	}

}
