package com.rs.game.player.dialogues.impl.clans;

import com.rs.game.player.content.clans.ClansManager;
import com.rs.game.player.dialogues.Dialogue;

public class ClanOwner extends Dialogue {

	@Override
	public void start() {
		sendOptionsDialogue("Choose an Option", player.getClanName() + "'s Owner Control", player.getClanName() + "'s Perks", player.getClanName() + "'s Achievements", "Open Clan Details", "Exit");
		stage = -1;
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
		case -1:
			if(componentId == OPTION_1) {
				sendOptionsDialogue("Choose an Option", "Set Clan Message", "Set Clan Message Hex Color", "Back");
				stage = -2;
			} else if(componentId == OPTION_2) {
				//ClanPerkInterface.sendInterface(player);
				close();
			} else if(componentId == OPTION_3) {
				//ClanAchievementInterface.sendInterface(player);
				close();
			} else if(componentId == OPTION_4) {
				ClansManager.openClanDetails(player);
				close();
			} else if(componentId == OPTION_5) {
				close();
			}
			break;
			
		case -2:
			if(componentId == OPTION_1) {
				player.getClanManager().setInterfaceSelected(2);
				player.getDialogueManager().startDialogue("ClanMessage");
				stage = -5;
			} else if(componentId == OPTION_2) {
				player.getClanManager().getClan().getClanMessageHex(player);
				close();
			} else if(componentId == OPTION_3) {
				sendOptionsDialogue("Choose an Option", player.getClanName() + "'s Owner Control", player.getClanName() + "'s Perks", player.getClanName() + "'s Achievements", "Open Clan Details", "Exit");
				stage = -1;
			}
			break;

		case -5:
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
