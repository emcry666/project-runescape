package com.rs.game.player.content.quest.impl.princealirescue.dialogues;

import com.rs.game.player.content.quest.QuestList.Quests;
import com.rs.game.player.content.quest.State.QuestState;
import com.rs.game.player.content.quest.impl.princealirescue.PrinceAliRescue;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.game.player.dialogues.Mood;


/**
 * 
 * @author Frostbite
 *<email@frostbitersps@gmail.com><skype:frostbiterps>
 */

public class Joe extends Dialogue {

	@Override
	public int getNPCID() {
		return 916;
	}


	@Override
	public void start() {
		stage = (Integer) parameters[0];
		int progress = player.getQuestManager().get(Quests.PRINCE_ALI_RESUCE).getStage();
		QuestState state = player.getQuestManager().get(Quests.PRINCE_ALI_RESUCE).getState();
		switch(state) {
		case COMPLETED:
			break;
		case NOT_STARTED:
			stage = 1;
			break;
		case STARTED:
			if(progress != 4 || progress != 5)
			stage = 1;
			break;
		default:
			break;
		}
		switch(progress) {
		case 4:
			if(player.getInventory().containsItem(PrinceAliRescue.BEER, 3))
				stage = 2;
			break;
		case 5:
			if(player.getInventory().containsItem(PrinceAliRescue.BEER, 2)) 
				sendDialogue("You have another beer for the guard, but just the one probably still "
						+ "won't be enough to get him drunk.");
			stage = 31;

			break;
		}
		switch(stage) {
		case 1:
			sendNPCChat(Mood.NORMAL, "Hi, I'm Joe, door guard for Lady Keli.");
			stage = 2;
			break;

		case 2:
			sendOptionsDialogue(DEFAULT, "I have some beer here, fancy one?", "Tell me about the life of a guard", "What did you want to be when you were a boy?", 
					"I had better leave, i don't want trouble.");
			stage = 4;
			break;
		}
	}

	@Override
	public void run(int interfaceId, int componentId) {
		int progress = player.getQuestManager().get(Quests.PRINCE_ALI_RESUCE).getStage();
		switch(stage) {
		case 2:
			sendPlayerChat(Mood.ASKING, "Hi, Who are you guarding here?");
			stage = 3;
			break;

		case 3:
			sendNPCChat(Mood.NORMAL, "Can't say, all very secret. You should get out of here. "
					+ "I am not supposed to talk while I guard.");
			stage = -2;
			break;

		case 4:
			switch(componentId) {
			case OPTION_1:
				sendNPCChat(Mood.HAPPY, "Ah, that would be lovely, just one now, "
						+ "just to wet my throat.");
				stage = 21;
				break;
			case OPTION_2:
				sendNPCChat(Mood.NORMAL, "Well, the hours are good.....");
				stage = 5;
				break;
			case OPTION_3:
				sendNPCChat(Mood.NORMAL, "Well, I loved to sit by the lake, with my toes in the "
						+ "water and shoot the fish with my bow and arrow.");
				stage = 15;
				break;
			case OPTION_4:
				sendNPCChat(Mood.HAPPY, "Thanks, I appreciate that. Talking on duty can be"
						+ " punishable by having your mouth stitched up. "
						+ "These are tough people, no mistake.");
				stage = -2;
				break;
			}
			break;

		case 5:
			sendNPCChat(Mood.NORMAL, ".... But most of those hours are a drag. If only I had "
					+ "spent more time in Knight school when I was a young "
					+ "boy. Maybe I wouldn't be here now, scared of Keli.");
			stage = 6;
			break;

		case 6:
			sendOptionsDialogue(DEFAULT, "Hey, chill out, I won't cause you trouble.", "What did you want to be when you were a boy?",
					"I had better leave i don't want trouble.");
			stage = 7;
			break;

		case 7:
			switch(componentId) {
			case OPTION_1:
				sendNPCChat(Mood.ANGRY, "You never relax with these people, but it's a good "
						+ "career for a young man and some of the shouting I "
						+ "rather like.");
				stage = 8;
				break;
			case OPTION_2:
				sendNPCChat(Mood.NORMAL, "Well, I loved to sit by the lake, with my toes in the "
						+ "water and shoot the fish with my bow and arrow.");
				stage = 15;
				break;
			case OPTION_3:
				sendNPCChat(Mood.HAPPY, "Thanks, I appreciate that. Talking on duty can be"
						+ " punishable by having your mouth stitched up. "
						+ "These are tough people, no mistake.");
				stage = -2;
				break;
			}
			break;

		case 8:
			sendNPCChat(Mood.ANGRY_YELLING, "RESISTANCE IS USELESS!");
			stage = 9;
			break;

		case 9:
			sendOptionsDialogue(DEFAULT, "So what do you buy with these great wages?", "Tell me about the life of a guard.", 
					"Would you be interested in making a little more money?", "I had better leave, I don't want trouble.");
			stage = 10;
			break;

		case 10:
			switch(componentId) {
			case OPTION_1:
				sendNPCChat(Mood.NORMAL, "Really, after working here, there's only time for a drink "
						+ "or three. All us guards go to the same bar and drink "
						+ "ourselves stupid.");
				stage = 11;
				break;
			case OPTION_2:
				sendNPCChat(Mood.NORMAL, "Well, the hours are good.....");
				stage = 5;
				break;
			case OPTION_3:
				sendNPCChat(Mood.ANGRY, "WHAT?! Are you trying to bribe me? I may not be a "
						+ "great guard, but I am loyal. How DARE you try to "
						+ "bribe me!");
				stage = 19;
				break;
			case OPTION_4:
				sendNPCChat(Mood.HAPPY, "Thanks, I appreciate that. Talking on duty can be"
						+ " punishable by having your mouth stitched up. "
						+ "These are tough people, no mistake.");
				stage = -2;
				break;
			}
			break;

		case 11:
			sendNPCChat(Mood.NORMAL, "It's what I enjoy these days, that fade into "
					+ "unconciousness. I can't resist the fight of "
					+ "a really cold beer.");
			stage = 12;
			break;

		case 12:
			sendOptionsDialogue(DEFAULT, "Tell me about the life of a guard.", "What did you want to be when you were a boy?",
					"I had better leave, I don't want trouble.");
			stage = 14;
			break;

		case 14:
			switch(componentId) {
			case OPTION_1:
				sendNPCChat(Mood.NORMAL, "Well, the hours are good.....");
				stage = 5;
				break;
			case OPTION_2:
				sendNPCChat(Mood.NORMAL, "Well, I loved to sit by the lake, with my toes in the "
						+ "water and shoot the fish with my bow and arrow.");
				stage = 15;
				break;
			case OPTION_3:
				sendNPCChat(Mood.HAPPY, "Thanks, I appreciate that. Talking on duty can be"
						+ " punishable by having your mouth stitched up. "
						+ "These are tough people, no mistake.");
				stage = -2;
				break;
			}
			break;

		case 15:
			sendPlayerChat(Mood.CONFUSED, "That was a strange hobby for a little boy.");
			stage = 16;
			break;

		case 16:
			sendNPCChat(Mood.NORMAL, "It kept us from goblin hunting, which was what most "
					+ "boys did. What are you here for?");
			stage = 17;
			break;

		case 17:
			sendOptionsDialogue(DEFAULT, "Chill out, I won't cause you trouble.", "Tell me about the life of a guard.", 
					"I had better leave, I don't want trouble.");
			stage = 18;
			break;

		case 18:
			switch(componentId) {
			case OPTION_1:
				sendNPCChat(Mood.ANGRY, "You never relax with these people, but it's a good "
						+ "career for a young man and some of the shouting I "
						+ "rather like.");
				stage = 8;
				break;
			case OPTION_2:
				sendNPCChat(Mood.NORMAL, "Well, the hours are good.....");
				stage = 5;
				break;
			case OPTION_3:
				sendNPCChat(Mood.HAPPY, "Thanks, I appreciate that. Talking on duty can be"
						+ " punishable by having your mouth stitched up. "
						+ "These are tough people, no mistake.");
				stage = -2;
				break;
			}
			break;

		case 19:
			sendNPCChat(Mood.CONFUSED, "No, no, you got the wrong idea, totally. I just "
					+ "wondered if you wanted some part-time bodyguard "
					+ "work.");
			stage = 20;
			break;

		case 20:
			sendNPCChat(Mood.NORMAL, "Oh. Sorry. No, I don't need money. As long as you "
					+ "were not offering me a bribe.");
			stage = 12;
			break;

		case 21:
			sendPlayerChat(Mood.HAPPY, "Of course, it must be tough being here without a drink.");
			stage = 22;
			break;

		case 22:
			sendDialogue("You hand a beer to the guard, he drinks it in seconds.");
			stage = 23;
			break;

		case 23:
			player.getInventory().deleteItem(PrinceAliRescue.BEER, 1);
			player.getQuestManager().get(Quests.PRINCE_ALI_RESUCE).setStage(5);
			sendNPCChat(Mood.HAPPY, "That was perfect, I can't thank you enough.");
			stage = 24;
			break;

		case 24:
			sendPlayerChat(Mood.ASKING, "How are you? Still ok? Not too drunk?");
			stage = 25;
			break;

		case 25:
			sendPlayerChat(Mood.ASKING, "Would you care for another, my friend?");
			stage = 26;
			break;

		case 26:
			sendNPCChat(Mood.NORMAL, "I better not, I don't want to be drunk on duty.");
			stage = 27;
			break;

		case 27:
			sendPlayerChat(Mood.NORMAL, "Here, just keep these for later, "
					+ "I hate to see a thirsty guard.");
			stage = 28;
			break;

		case 28:
			sendDialogue("You hand the two more beers to the guard. "
					+ "He takes a sip of one, and then drinks them both.");
			player.getInventory().deleteItem(PrinceAliRescue.BEER, 2);
			player.getQuestManager().get(Quests.PRINCE_ALI_RESUCE).setStage(6);;
			stage = 29;
			break;

		case 29:
			sendNPCChat(Mood.DRUNK, "Franksh, that wash just what I need to shtay on guard. "
					+ "No more beersh, I don't want to get drunk.");
			stage = 30;
			break;

		case 30:
			sendDialogue("The guard is drunk, and no longer is a problem.");
			stage = -2;
			break;
			
		case 31:
			sendOptionsDialogue(DEFAULT, "I have some beer here, fancy one?", "Tell me about the life of a guard", "What did you want to be when you were a boy?", 
					"I had better leave, i don't want trouble.");
			stage = 4;
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
