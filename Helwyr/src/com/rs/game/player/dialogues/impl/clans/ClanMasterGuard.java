package com.rs.game.player.dialogues.impl.clans;

import com.rs.game.player.dialogues.Dialogue;

/**
 * 
 * @author Frostbite
 * <Frostbitersps@gmail.com> <Skype@Frostbitersps>
 *
 */

public class ClanMasterGuard extends Dialogue {

	public static int sendNPCDialogueId = 13633;
	
	@Override
	public void start() {
		sendNPCDialogue(sendNPCDialogueId, 9810, "Hello, " +  player.getUsername() + " What can i do for you?");
		stage = -1;
		
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
		case -1:
			sendOptionsDialogue("Choose an Option.", "Who are you?", "Collect a Clan Cloak", "Nothing, Goodbye.");
			stage = -2;
			break;
			
		case -2:
			if(componentId == OPTION_1) {
				sendPlayerDialogue(9810, "Who are you?");
				stage = 1;
			} else if(componentId == OPTION_2) {
				sendPlayerDialogue(9810, "Collect a Clan Cloak.");
				stage = 2;
			} else if(componentId == OPTION_3) {
				sendPlayerDialogue(9810, "Nothing, Goodbye.");
				stage = -3;
			}
			break;
			
		case 1:
			sendNPCDialogue(sendNPCDialogueId, 9810, "Why who am i? I am the Clan Master of Frostbite.. Creating clans since 2014. Make sure you join a clan! They provide a variety of special benefits.");
			stage = -1;
			break;
			
		case 2: 
			if (player.getClanManager() == null) {
				sendNPCDialogue(sendNPCDialogueId, 9827, "Talk to me once you have a clan.");
				stage = -3;
				return;
			} else 
			sendNPCDialogue(sendNPCDialogueId, 9810, "Sure, Here you go!");
			player.getInventory().addItem(20708, 1);
			stage = -3;
			break;
			
		case -3:
			close();
			break;
			
			default:
				close();
				break;
		}
		
	}

	@Override
	public void finish() {
		// TODO Auto-generated method stub
		
	}

}
