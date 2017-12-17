package com.rs.game.player.content.quest.impl.restlessghost.dialogues;

import com.rs.game.player.content.quest.QuestList.Quests;
import com.rs.game.player.content.quest.State.QuestState;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.game.player.dialogues.Mood;

/**
 * Created by Austin on 7/1/2015.
 */
public class FatherAereck extends Dialogue {

    @Override
    public int getNPCID() {
        return 456;
    }

    @Override
    public void start() {
        stage = (Integer) parameters[0];
        int progress = player.getQuestManager().get(Quests.THE_RESTLESS_GHOST).getStage();
        QuestState state = player.getQuestManager().get(Quests.THE_RESTLESS_GHOST).getState();

        /*
        Quest Dialogue
         */
        switch(progress) {
            case 1:
                break;
            case 2:
                break;

        }
        switch(state) {
            case NOT_STARTED:
                sendNPCChat(Mood.NORMAL, "Welcome to the church of holy Saradomin.");
                stage = -1;
                break;
            case STARTED:
                break;
            case COMPLETED:
                break;
        }
        if (progress == 1) {
            sendNPCChat(Mood.NORMAL, "Have you got rid of the ghost yet?");
            stage = 29;
        }
        else if (progress == 2) {
            sendNPCChat(Mood.NORMAL, "Have you got rid of the ghost yet?");
            stage = 32;
        }
        /*
        Accepting (The Restless Ghost) Quest
         */
         else if(stage == -3) {
            player.getQuestManager().get(Quests.THE_RESTLESS_GHOST).setState(QuestState.STARTED);
            player.getQuestManager().get(Quests.THE_RESTLESS_GHOST).setStage(1);
            player.getQuestManager().update();
            sendNPCChat(Mood.NORMAL, "Thank you. The problem is, there is a ghost in the", "church graveyard. I would like you to get rid of it.");
            stage = 21;
        /*
        Declining (The Restless Ghost) Quest
         */
        } else if (stage == -4) {
            sendNPCChat(Mood.NORMAL, "Oh well. If you do have some spare time on your", "hands, come back and talk to me.");
            stage = -2;
            }
    }

    @Override
    public void run(int interfaceId, int componentId) {
        switch(stage) {
            case -1:
                sendOptionsDialogue(DEFAULT, "Who's Saradomin?", "Nice place you've got here.", "I'm looking for a quest!");
                stage = 1;
                break;
            case 1:
                switch(componentId) {
                    case OPTION_1:
                        sendPlayerChat(Mood.NORMAL, "Who's Saradomin?");
                        stage = 2;
                        break;
                    case OPTION_2:
                        sendPlayerChat(Mood.NORMAL, "Nice place you've got here.");
                        stage = 19;
                        break;
                    case OPTION_3:
                        sendPlayerChat(Mood.NORMAL, "I'm looking for a quest.");
                        stage = 20;
                        break;
                }
                break;
            case 2:
                sendNPCChat(Mood.NORMAL, "Surely you have heard of the god, Saradomin?");
                stage = 3;
                break;
            case 3:
                sendNPCChat(Mood.NORMAL, "He who creates the forces of goodness and purity in", "this world? I cannot believe your ignorance!");
                stage = 4;
                break;
            case 4:
                sendNPCChat(Mood.NORMAL, "This is the god with more followers than any other! ...At", "least in this part of the world.");
                stage = 5;
                break;
            case 5:
                sendNPCChat(Mood.NORMAL, "He who created this world along with his brothers", "Guthix and Zamorak?");
                stage = 6;
                break;
            case 6:
                sendOptionsDialogue(DEFAULT, "Oh, THAT Saradomin...", "Oh, sorry. I'm not from this world.");
                stage = 7;
                break;
            case 7:
                switch(componentId) {
                    case OPTION_1:
                        sendPlayerChat(Mood.NORMAL, "Oh, THAT Saradomin...");
                        stage = 8;
                        break;
                    case OPTION_2:
                        sendPlayerChat(Mood.NORMAL, "Oh, sorry. I'm not from this world.");
                        stage = 10;
                        break;
                }
                break;
            case 8:
                sendNPCChat(Mood.NORMAL, "There... is only one Saradomin...");
                stage = 9;
                break;
            case 9:
                sendNPCChat(Mood.NORMAL, "Yeah... I, uh, thought you said something else.");
                stage = -2;
                break;
            case 10:
                sendNPCChat(Mood.NORMAL, "...");
                stage = 11;
                break;
            case 11:
                sendNPCChat(Mood.NORMAL, "That's... strange.");
                stage = 12;
                break;
            case 12:
                sendNPCChat(Mood.NORMAL, "I thought things not from this world were all... You", "know. Slime and tentacles.");
                stage = 13;
                break;
            case 13:
                sendOptionsDialogue(DEFAULT, "You don't understand. This is a computer game!", "I am - do you like my disguise?");
                stage = 14;
                break;
            case 14:
                switch(componentId) {
                    case OPTION_1:
                        sendPlayerChat(Mood.NORMAL, "You don't understand. This is a computer game!");
                        stage = 15;
                        break;
                    case OPTION_2:
                        sendPlayerChat(Mood.NORMAL, "I am - do you like my disguise?");
                        stage = 17;
                        break;
                }
                break;
            case 15:
                sendNPCChat(Mood.NORMAL, "I... beg your pardon?");
                stage = 16;
                break;
            case 16:
                sendPlayerChat(Mood.NORMAL, "Never mind.");
                stage = -2;
                break;
            case 17:
                sendNPCChat(Mood.NORMAL, "Aargh! Avaunt foul creature from another dimension!", "Avaunt! Begone in the name of Saradomin!");
                stage = 18;
                break;
            case 18:
                sendPlayerChat(Mood.NORMAL, "Ok, ok, I was only joking...");
                stage = -2;
                break;
            case 19:
                sendNPCChat(Mood.NORMAL, "It is, isn't it? It was built over 230 years ago.");
                stage = -2;
                break;
            case 20:
                sendNPCChat(Mood.NORMAL, "That's lucky, I need someone to do a quest for me.");
                stage = 21;
                break;
            case 21:
                player.getQuestManager().get(Quests.THE_RESTLESS_GHOST).sendStartOption();
                break;

            case 22:
                sendNPCChat(Mood.NORMAL, "If you need any help, my friend Father Urhney is an", "expert on ghosts.");
                stage = 23;
                break;
            case 23:
                sendNPCChat(Mood.NORMAL, "I believe he is currently living as a hermit in Lumbridge", "swamp. He has a little shack in the south-west of the", "swamps.");
                stage = 24;
                break;
            case 24:
                sendNPCChat(Mood.NORMAL, "Exit the graveyard through the south gate to reach the", "swamp. I'm sure if you told him that I sent you he'd", "be willing to help.");
                stage = 25;
                break;
            case 25:
                sendNPCChat(Mood.NORMAL, "My name is Father Aereck by the way. Pleased to", "meet you.");
                stage = 26;
                break;
            case 26:
                sendPlayerChat(Mood.NORMAL, "Likewise.");
                stage = 27;
                break;
            case 27:
                sendNPCChat(Mood.NORMAL, "Take care travelling through the swamps, I have heard", "they can be quite dangerous.");
                stage = 28;
                break;
            case 28:
                sendPlayerChat(Mood.NORMAL, "I will, thanks.");
                stage = -2;
                break;
            case 29:
                sendPlayerChat(Mood.NORMAL, "I can't find Father Urhney at the moment.");
                stage = 30;
                break;
            case 30:
                sendNPCChat(Mood.NORMAL, "Well, you can get to the swamp he lives in by going", "south through the cemetary.");
                stage = 31;
                break;
            case 31:
                sendNPCChat(Mood.NORMAL, "You'll have to go right into the western depths of the", "swamp, near the coastline. That is where his house is.");
                stage = -2;
                break;
            case 32:
                sendPlayerChat(Mood.NORMAL, "I had a talk with Father Urhney. He has given me this", "funny amulet to talk to the ghost with.");
                stage = 33;
                break;
            case 33:
                sendNPCChat(Mood.NORMAL, "I always wondered what that amulet was... Well, I hope", "it's useful. Tell me when you get rid of the ghost!");
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
