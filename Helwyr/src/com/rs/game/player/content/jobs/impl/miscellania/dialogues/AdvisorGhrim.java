package com.rs.game.player.content.jobs.impl.miscellania.dialogues;

import com.rs.game.player.dialogues.Dialogue;

public class AdvisorGhrim extends Dialogue {

	public double reputation;
	
	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		reputation = player.getThrone().getReputation();
		npc((reputation == 100 ? HAPPY : NORMAL), (reputation == 100 ? "Greetings, Your Royal Highness." : "Greeting, " + player.getDisplayName() + "."));
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
		case -1:
			options(DEFAULT, "How is the Kingdom faring?", "How do I manage the kingdom?", "What am I meant to be doing again?");
			stage = 1;
			break;
			
		case 1:
			switch(componentId) {
			case OPTION_1:
				npc((reputation == 100 ? HAPPY : NORMAL), "Your subjuects are content, " + (reputation == 100 ? "Your Highness" : player.getDisplayName()) + ".");
				stage = 2;
				break;
			case OPTION_2:
				break;
			case OPTION_3:
				break;
			}
			break;
			
		case 2:
			npc((reputation < 50 ? SAD : HAPPY), "Your current approval rating is at " + reputation + "%. Would you like", 
					"to collect the resources gathered by your subjuects?");
			stage = 3;
			break;
			
		case 3:
			options(DEFAULT, "Yes", "No");
			stage = 4;
			break;
			
		case 4:
			switch(componentId) {
			case OPTION_1:
				player.getThrone().openResources();
				close();
				break;
			case OPTION_2:
				player(NORMAL, "No, thank you.");
				stage = 5;
				break;
			}
			break;
			
		case 5:
			npc(NORMAL, "Very well, " + (reputation == 100 ? "Your Highness" : player.getDisplayName()) + ".");
			stage = 6;
			break;
			
		case 6:
			npc(NORMAL, "This is how your subjects are distributing their effort.");
			stage = -3;
			break;
			
		case -3:
			close();
			player.getThrone().displayInterface();
			//TODO King of Miscellania interface
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
