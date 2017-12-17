package com.rs.game.player.content.quest.impl.gunnarsground.dialogues;

import com.rs.game.player.content.quest.QuestList.Quests;
import com.rs.game.player.content.quest.State.QuestState;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.game.player.dialogues.Mood;

/**
 * @Author Frostbite
 * @Contact<frostbitersps@gmail.com;skype:frostbitersps>
 */
public class Jeffery extends Dialogue {

    /**
     * TODO add npcIds
     */

    @Override
    public void start() {
        stage = (Integer) parameters[0];
        QuestState state = player.getQuestManager().get(Quests.GUNNARS_GROUND).getState();
        switch(state) {
            case NOT_STARTED:
                sendNPCChat(Mood.ASKING, "Keep it quick. What do you want?");
                stage = -1;
                break;
            case STARTED:
                sendNPCChat(Mood.ASKING, "Keep it quick. What do you want?");
                stage = -3;
                break;
		case COMPLETED:
			break;
		default:
			break;
        }
    }

    @Override
    public void run(int interfaceId, int componentId) {
        switch (stage) {
            case -1:
                sendOptionsDialogue(DEFAULT, "I want to use the furnace.", "Er, nothing.");
                stage = 1;
                break;

            case 1:
                switch (componentId) {
                    case OPTION_1:
                        sendNPCChat(Mood.NORMAL, "You want to use my furnace? No one can use my furnace! " +
                                "Only I can use my furnace!");
                        stage = -2;
                        break;
                    case OPTION_2:
                        sendPlayerChat(Mood.CONFUSED, "Er, nothing.");
                        stage = -2;
                        break;
                }
                break;

            /**
             * Gunnars Ground Quest
             */
            case -3:
                sendOptionsDialogue(DEFAULT, "I want to use the furnace.", "Er, nothing.");
                stage = -4;
                break;

            case -4:
                switch (componentId) {
                    case OPTION_1:
                        sendNPCChat(Mood.ASKING, "You want to buy a gold ring? You want to sell a gold ring? " +
                                "You want to ask pointless questions about gold rings?");
                        stage = -5;
                        break;
                    case OPTION_2:
                        sendNPCChat(Mood.NORMAL, "You want to use my furnace? No one can use my furnace! " +
                                "Only I can use my furnace!");
                        stage = -2;
                        break;
                    case OPTION_3:
                        sendPlayerChat(Mood.CONFUSED, "Er, nothing.");
                        stage = -2;
                }
                break;

            case -5:
                sendOptionsDialogue(DEFAULT, "I was hoping you would trade me a gold ring.", "Actually, forget it.");
                stage = -6;
                break;

            case -6:
                switch (componentId) {
                    case OPTION_1:
                        sendNPCChat(Mood.CONFUSED, "Trade you? Trade you for what?");
                        stage = -7;
                        break;
                    case OPTION_2:
                        sendPlayerChat(Mood.ANGRY, "Actually, forget it.");
                        stage = -2;
                        break;
                }
                break;

            case -7:
                sendOptionsDialogue(DEFAULT, "This splendid love poem.", "Some old love poem for something.");
                stage = -8;
                break;

            case -8:
                switch (componentId) {
                    case OPTION_1:
                        break;
                    case OPTION_2:
                        sendNPCChat(Mood.WTF_FACE, "A love poem? What?");
                        stage = -9;
                        break;
                }
                break;

            case -9:
                sendNPCChat(Mood.ASKING, "Wait... that dwarf put you up to this, didn't he?");
                stage = -10;
                break;

            case -10:
                sendOptionsDialogue(DEFAULT, "Yes, he did", "I don't know any dwarf.");
                stage = -11;
                break;

            case -11:
                switch (componentId) {
                    case OPTION_1:
                        sendNPCChat(Mood.ANGRY, "That cheesy little...");
                        stage = -12;
                        break;
                    case OPTION_2:
                        break;
                }
                break;

            case -12:
                sendNPCChat(Mood.ANGRY, "He just can't leave it alone, can he? Fine! I'll trade you for " +
                        "the poem. What is it you want?");
                stage = -13;
                break;

            case -13:
            sendOptionsDialogue(DEFAULT, "Just a plain, gold ring.", "The most valuable diamond ring you have.");
                stage = -14;
                break;

            case -14:
                sendNPCChat(Mood.NORMAL, "Well, all I have is this plain, gold ring.");
                stage = -15;
                break;

            case -15:
                sendPlayerChat(Mood.SAD, "That will have to do.");
                stage = -16;
                break;

            case -16:
                sendItemDialogue(-1, "Jeffery trades you a gold ring for the poem.");//TODO find rite item id(poem & ring)
                player.getQuestManager().get(Quests.GUNNARS_GROUND).setStage(2);
                stage = -17;
                break;

            case -17:
                sendNPCChat(Mood.ANGRY, "Now, leave me in peace!");
                stage = -2;
                break;

            case -2:
                end();
                break;
        }
    }

    @Override
    public void finish() {

    }
}
