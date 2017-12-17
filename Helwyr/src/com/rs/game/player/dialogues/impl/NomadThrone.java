package com.rs.game.player.dialogues.impl;

import com.rs.game.player.content.quest.QuestList.Quests;
import com.rs.game.player.content.quest.State.QuestState;
import com.rs.game.player.controlers.NomadsRequiem;
import com.rs.game.player.dialogues.Dialogue;

public class NomadThrone extends Dialogue {

	private int npcId;
	private NomadsRequiem requiem;

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		requiem = (NomadsRequiem) parameters[1];
		sendNPCDialogue(npcId, 9785, 
				player.getQuestManager().get(Quests.NOMADS_REQUIEM).getState() != QuestState.COMPLETED ? "The assassin aproaches, but I wonder what compels you to seek death." : 
				"The assassin returns? Whomever perserved your life must delight in your suffering!" );
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
		case -1:
			stage = 0;
			sendNPCDialogue(npcId, 9785, "Is it out of foolish loyalty to your master, or is it merely stupidity that brings you here to face me?");
		break;
		case 0:
			stage = 1;
			sendPlayerDialogue(9827, "I'm here on my own accord, Nomad.");
		break;
		case 1:
			stage = -2;
			sendNPCDialogue(npcId, 9785, "Glad to see you have some guts, too bad it all ends here...");
		break;
		case 2:
			stage = 3;
			sendPlayerDialogue(9827, "So you think..");
		break;
		case 3:
			stage = 4;
			sendNPCDialogue(npcId, 9785, "Oh please! Don't make me laugh.");
		break;
		case 4:
			stage = 5;
			sendNPCDialogue(npcId, 9785, "Come then, tell me why you are really here.");
		break;
		case 5:
			end();
			player.getQuestManager().get(Quests.NOMADS_REQUIEM).setState(QuestState.COMPLETED);
			player.unlock();
		break;
		default:
			player.unlock();
			close();
		break;
		}
	}

	@Override
	public void finish() {
		requiem.continueThroneScene();
	}

}
