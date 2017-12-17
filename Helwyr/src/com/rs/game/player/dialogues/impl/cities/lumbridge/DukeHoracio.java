package com.rs.game.player.dialogues.impl.cities.lumbridge;


import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.player.content.quest.QuestList.Quests;
import com.rs.game.player.content.quest.State.QuestState;
import com.rs.game.player.content.quest.impl.runemysteries.RuneMysteries;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.game.player.dialogues.Mood;

public class DukeHoracio extends Dialogue {

	@Override
	public int getNPCID() {
		return 741;
	}

	@Override
	public void start() {
		stage = (Integer) parameters[0];
		int progress = player.getQuestManager().get(Quests.RUNE_MYSTERIES).getStage();
		switch(stage) {
		case -3:
			sendNPCChat(Mood.HAPPY, "Thank you very much, stranger. I am sure the head " +
					"wizard will reward you for such an interesting find.");
			stage = 5;
			break;

		case -4:
			sendNPCChat(Mood.SAD, "As you wish, stranger, although I have this strange" +
					" feeling that it is important. Unfortunately, I cannot " +
					"leave my castle unattended.");
			stage = -2;
			break;

		case 0:
			sendNPCChat(Mood.PLAIN_TALKING, "Greetings. Welcome to my castle.");
			stage = -1;
			break;
		}
	}


	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
		case -1:
				sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "Have you any quests for me?", "Where can I find money?");
				stage = 1;
			break;

		case 1:
			switch(componentId) {
			case OPTION_1:
				if(player.getQuestManager().get(Quests.RUNE_MYSTERIES).getStage() > 0 &&
						player.hasItem(RuneMysteries.AIR_TALISMAN)) {
					sendNPCChat(Mood.ASKING, "The only task remotely approaching a quest is the " +
							"delivery of that talisman I gave you to the head wizard " +
							"of the Wizards' Tower,");
					stage = 10;

				} else if(player.getQuestManager().get(Quests.RUNE_MYSTERIES).getStage() > 0 && !player.hasItem(RuneMysteries.AIR_TALISMAN)) {
					sendNPCChat(Mood.ASKING, "Did you speak to the head wizard for me yet, " +
							"adventurer?");
					stage = 6;
				} else {
					sendNPCChat(Mood.QUESTIONING, "Well, it's not really a quest but I recently discovered " +
							" this strange talisman.");
					stage = 2;
				}
				break;
			case OPTION_2:
				sendNPCChat(Mood.PLAIN_TALKING, "I've heard that the blacksmiths are prosperous amongst" +
						" the peasantry. Maybe you could try your hand at " + "that?");
				stage = -2;
				break;
			}
			break;

		case 2:
			sendNPCChat(Mood.ASKING, "It seems to be mystical and I have never seen anything " +
					"like it before. Would you take it to the head wizard at");
			stage = 3;
			break;

		case 3:
			sendNPCChat(Mood.ASKING, " the Wizards' Tower for me? It's just south-west of here " +
					"and should not take you very long at all. I would be " +
					"awfully grateful.");
			stage = 4;
			break;

		case 4:
			end();
			player.getQuestManager().get(Quests.RUNE_MYSTERIES).sendStartOption();
			break;

		case 5:
			if(player.getInventory().getFreeSlots() > 1) {
				sendHandedItem(RuneMysteries.AIR_TALISMAN, "The Duke hands you an air talisman.");
				if(player.getInventory().getFreeSlots() > 0) {
					player.getInventory().addItem(RuneMysteries.AIR_TALISMAN, 1);
				} else {
					World.addGroundItem(new Item(RuneMysteries.AIR_TALISMAN), new WorldTile(player.getX(), player.getY(), player.getPlane()));
				}
				player.getQuestManager().get(Quests.RUNE_MYSTERIES).setState(QuestState.STARTED);
				player.getQuestManager().get(Quests.RUNE_MYSTERIES).setStage(1);
				player.getPackets().sendGameMessage("Quest State: " + player.getQuestManager().get(Quests.RUNE_MYSTERIES).getStage());
				stage = -2;
			} else {
				sendDialogue("You do not have enough inventory space.");
				stage = -2;
			}
			break;

		case 6:
			if(!player.hasItem(RuneMysteries.AIR_TALISMAN)) {
				sendPlayerChat(Mood.SAD, "No, I lost that talisman that you gave me.");
				stage = 7;
			}
			break;

		case 7:
			sendNPCChat(Mood.NORMAL, "Ah, that would explain it. One of my servants found this" +
					" outside, and it seemed too much of a coincidence that " +
					" more than one strange");
			stage = 8;
			break;

		case 8:
			sendNPCChat(Mood.NORMAL, "object would appear on my land in such short period " +
					"of time. Please take this to head wizard at the " +
					"Wizards' Tower, south-west of here, and don't lose it this time.");
			if(player.getInventory().getFreeSlots() > 1) {
			}
			stage = 5;
			break;

		case 10:
			sendNPCChat(Mood.NORMAL, "south-west of here. I suggest you deliver it to him as" +
					" soon as possible. I have the oddest feeling that it is " +
					"important...");
			stage = -2;
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

	}

}
