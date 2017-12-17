package com.rs.game.player.dialogues.impl.clans;

import com.rs.game.player.content.clans.ClansManager;
import com.rs.game.player.dialogues.Dialogue;

/**
 * 
 * @author Anarchy
 * <Anarchyrsps@gmail.com> <Skype@Anarchyrsps>
 *
 */

public class ClanMasterScribe extends Dialogue {


	public static int npcId = 5915;

	@Override
	public void start() {
		sendNPCDialogue(npcId, 9810, "Hello, " + player.getUsername() + " What can i do for you?");
		stage = -1;

	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
		case -1:
			sendOptionsDialogue("Choose an Option.", "Create a Clan", "Access Clan Bank", "Collect a Vexillum", "Nothing, Goodbye.");
			stage = -2;
			break;

		case -2:
			if(componentId == OPTION_1) {
				sendPlayerDialogue(9810, "Create a Clan.");
				stage = 1;
			} else if(componentId == OPTION_2) {
				sendPlayerDialogue(9810, "Access to my Clan Bank.");
				stage = 2;
			} else if(componentId == OPTION_3) {
				sendPlayerDialogue(9810, "Collect a Clan Vexillum Please.");
				stage = 3;
			} else if(componentId == OPTION_4) {
				sendPlayerDialogue(9810, "Nothing, Goodbye.");
				stage = -3;
			}
			break;

		case 1:
			ClansManager manager = player.getClanManager();
			if (!(manager == null)) {
				sendDialogue("You are already in a clan!");
				stage = -3;
				return;
			} else
				player.getTemporaryAttributtes().put("setclan", Boolean.TRUE);
			player.getPackets().sendInputNameScript("Enter the clan name you'd like to have.");
			close();
			break;

		case 2:
			if(!(player.getClanManager() == null)) {
				close();
			} else
				sendDialogue("You must be in a clan to access this feature.");
			stage = -3;
			break;

		case 3:
			if (player.getClanManager() == null) {
				sendNPCDialogue(npcId, 9827, "Talk to me once you have a clan.");
				return;
			} else 
				sendNPCDialogue(npcId, 9810, "Sure, Here you go!");
			player.getInventory().addItem(20709, 1);
			stage = -3;
			break;

		case -5:
			if(componentId == OPTION_1) {//cp
				
			} else if(componentId == OPTION_2) {
				stage = -3;
			} else if(componentId == OPTION_3) {
				sendNPCDialogue(npcId, 9810, "Hello, " + player.getUsername() + " What can i do for you?");
				stage = -1;
			} else if(componentId == OPTION_4) {
				close();
			}
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

	}

}