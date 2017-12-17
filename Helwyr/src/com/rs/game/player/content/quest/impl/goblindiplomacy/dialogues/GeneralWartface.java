package com.rs.game.player.content.quest.impl.goblindiplomacy.dialogues;

import com.rs.game.player.content.quest.QuestList.Quests;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.game.player.dialogues.Mood;
import com.rs.utils.Utils;

/**
 * @Author arrow
 * @Contact<arrowrsps@gmail.com;skype:arrowrsps>
 */
public class GeneralWartface extends Dialogue {

    public static final int BENTNOZE = 4493;

    @Override
    public int getNPCID() {
        return 4494;
    }

    @Override
    public void start() {
        stage = (Integer) parameters[0];
        int randomStage = Utils.random(0, 3);
        if(stage == 0) {
            stage = randomStage;
        }
        switch(stage) {
            case 0 :
                sendNPCChat(Mood.ANGRY, "Green armour best.");
                stage = -1;
                break;
            case 1:
                sendNPCChat(Mood.ANGRY, "We should wear green amour!");
                stage = 50;
                break;
            case 2:
                sendNPCDialogue(BENTNOZE, ANGRY, "Red armour best.");
                stage = 60;
                break;
            case 3:
                sendNPCDialogue(BENTNOZE, ANGRY, "All goblins should wear red armour!");
                stage = 65;
                break;
            case 4:
                sendPlayerChat(Mood.NORMAL, "I have some orange armour here.");
                //sendNPCChat("Grubfoot!
                //TODO cutscene.
                break;
        }
    }

    @Override
    public void run(int interfaceId, int componentId) {
        int progress = player.getQuestManager().get(Quests.GOBLIN_DIPLOMACY).getStage();
    switch(stage) {
        case -1:
            sendNPCDialogue(BENTNOZE, ANGRY, "No no red every time.");
            stage = 1;
            break;

        case 1:
            sendNPCChat(Mood.ANGRY, "Go away human, we busy.");
            stage = 2;
            break;

        case 2:
            if(progress > 0) {
                    sendOptionsDialogue(DEFAULT, "Why are you arguing about the colour of your armour?", "Wouldn't you prefer peace?", "Where am I meant to get orange armour?");
            stage = 25;
            } else {
                sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "Why are you arguing about the colour of your armour?",
                        "Wouldn't you prefer peace?", "Do you want me to pick an armour colour for you?");
                stage = 3;
            }
            break;

        case 3:
            switch(componentId) {
                case OPTION_1:
                    sendNPCDialogue(BENTNOZE, PLAIN_TALKING, "We decide to celebrate goblin new century by changing " +
                            "colour of our armour, brown get boring after a bit. " +
                            " We want change.");
                    stage = 17;
                    break;
                case OPTION_2:
                    sendNPCChat(Mood.PLAIN_TALKING, "Yeah peace is good as long as it peace wearing green " +
                            "armour.");
                    stage = 14;
                    break;
                case OPTION_3:
                    sendNPCChat(Mood.HAPPY, "Yes as long as you pick green.");
                    stage = 4;
                    break;
            }
            break;

        case 4:
            sendNPCDialogue(BENTNOZE, ANGRY, "No you have to pick red!");
            stage = 5;
            break;

        case 5:
            sendOptionsDialogue(DEFAULT, "You should wear red", "You should wear green", "What about a different colour?");
            stage = 6;
            break;

        case 6:
            switch(componentId) {
                case OPTION_1:
                    sendNPCDialogue(BENTNOZE, PLAIN_TALKING, "See? Even stupid human think red best. Nowe we all" +
                            " wear red!");
                    stage = 7;
                    break;
                case OPTION_2:
                    sendNPCChat(Mood.HAPPY, "Green! We all wear green now, human has decided!");
                   stage = 9;
                    break;
                case OPTION_3:
                    sendNPCDialogue(BENTNOZE, CONFUSED, "That would mean me wrong... but at least Wartface " +
                            " not right!");
                    stage = 20;
                    break;
            }
            break;

        case 7:
            sendNPCChat(Mood.ANGRY_YELLING, "Human not know anything! If we wear red then whole " +
                    "village be ugly like YOU!");
            stage = 8;
            break;

        case 8:
            sendNPCDialogue(BENTNOZE, PLAIN_TALKING, "Go away human. You not helping.");
            stage = -2;
            break;

        case 9:
            sendNPCDialogue(BENTNOZE, ASKING, "Why we have to do what human say? He not boss of" +
                    " us!");
            stage = 10;
            break;

        case 10:
            sendNPCChat(Mood.ANGRY, "No but he agree with me!");
            stage = 11;
            break;

        case 11:
            sendNPCDialogue(BENTNOZE, MAD, "That prove you a filthy human-lover!");
            stage = 12;
            break;

        case 12:
            sendNPCChat(Mood.SLIGHTLY_ANGRY, "Me hate humans! This human just happen to be right!");
            stage = 13;
            break;

        case 13:
            sendNPCDialogue(BENTNOZE, MILDLY_ANGRY_FACE, "Go away human. You not know anything.");
            stage = -2;
            break;

        case 14:
            sendNPCDialogue(BENTNOZE, PLAIN_TALKING, "But green too much like skin. Nearly make you look " +
                    "naked!");
            stage = 15;
            break;

        case 15:
            sendOptionsDialogue(DEFAULT, "Why are you arguing about the colour of your armour?", "Do you want me to pick an armour colour for you?");
            stage = 16;
            break;

        case 16:
            switch(componentId) {
                case OPTION_1:
                    sendNPCDialogue(BENTNOZE, PLAIN_TALKING, "We decide to celebrate goblin new century by changing " +
                            "colour of our armour, brown get boring after a bit. " +
                            " We want change.");
                    stage = 17;
                    break;
                case OPTION_2:
                    sendOptionsDialogue(DEFAULT, "You should wear red", "You should wear green", "What about a different colour?");
                    stage = 6;
                    break;
            }
            break;

        case 17:
            sendNPCChat(Mood.PLAIN_TALKING, "Problem is they want different change to us.");
            stage = 18;
            break;

        case 18:
            sendOptionsDialogue(DEFAULT, "Wouldn't you prefer peace?", "Do you want me to pick an armour colour for you?");
            stage = 19;
            break;

        case 19:
            switch(componentId) {
                case OPTION_1:
                    sendNPCChat(Mood.PLAIN_TALKING, "Yeah peace is good as long as it peace wearing green " +
                            "armour.");
                    stage = 14;
                    break;
                case OPTION_2:
                    sendOptionsDialogue(DEFAULT, "You should wear red", "You should wear green", "What about a different colour?");
                    stage = 6;
                    break;
            }
            break;

        case 20:
            sendNPCChat(Mood.CONFUSED, "Me dunno what that look like. Have to see armour " +
                   "before we decide.");
             stage = 21;
           break;

        case 21:
            sendNPCDialogue(BENTNOZE, ASKING, "Human! You bring us armour in new colour!");
            stage = 22;
            break;

        case 22:
            sendNPCChat(Mood.ASKING, "What colour we try?");
            stage = 23;
            break;

        case 23:
            sendNPCDialogue(BENTNOZE, PLAIN_TALKING, "Orange armour might be good.");
            stage = 24;
            break;

        case 24:
            player.getQuestManager().get(Quests.GOBLIN_DIPLOMACY).sendStartOption();
            break;

        case 25:
            switch(componentId) {
                case OPTION_1:
                    sendNPCDialogue(BENTNOZE, PLAIN_TALKING, "Well first you get goblin armour...");
                    stage = 26;
                    break;
                case OPTION_2:
                    sendNPCDialogue(BENTNOZE, NORMAL, "You go north of here into wilderness. There you find " +
                            "many ways to die!");
                    stage = 31;
                    break;
            }
            break;

        case 26:
            sendNPCChat(Mood.NORMAL, "...And then you dye it orange!");
            stage = 27;
            break;

        case 27:
            sendNPCDialogue(BENTNOZE, PLAIN_TALKING, "Even human should be able to work that out!");
            stage = 28;
            break;

        case 28:
            sendOptionsDialogue(DEFAULT, "But where do I get goblin armour?", "But where do I get dye?");
            stage = 29;
            break;

        case 29:
            switch(componentId) {
                case OPTION_1:
                    sendNPCChat(Mood.NORMAL, "There some spare armour around village somewhere." +
                            " You can take that.");
                    stage = 30;
                    break;
                case OPTION_2:
                    break;
            }
            break;

        case 30:
            sendNPCDialogue(BENTNOZE, NORMAL, "It in crates somewhere. Can't remember which crates " +
                    "now.");
            stage = -2;
            break;

        case 31:
            sendPlayerChat(Mood.ASKING, "No, D-Y-E, not D-I-E.");
            stage = 32;
            break;

        case 32:
            sendNPCChat(Mood.PLAIN_TALKING, "Stupid Bentnoze, you not know how to spell!");
            stage = 33;
            break;

        case 33:
            sendNPCDialogue(BENTNOZE, ANGRY, "Shut up Wartface!");
            stage = 34;
            break;

        case 34:
            sendPlayerChat(Mood.ASKING, "Do you know where I can get dye though?");
            stage = 35;
            break;

        case 35:
            sendNPCDialogue(BENTNOZE, CONFUSED, "Me not know where dye come from.");
            stage = 36;
            break;

        case 36:
            sendPlayerChat(Mood.ASKING, "Well where did you get your red and green dye from?");
            stage = 37;
            break;

        case 37:
            sendNPCChat(Mood.NORMAL, "Some goblin or other, he steal it. Say he steal it from " +
                    "old witch in Draynor village.");
            stage = 38;
            break;

        case 38:
            sendNPCDialogue(BENTNOZE, ASKING, "Maybe you can get more dye from her?");
            stage = -2;
            break;

        case -2:
            end();
            break;

        /**
         * Random Dialogues upon start.
         */

        case 50:
            sendNPCDialogue(BENTNOZE, ASKING, "Green armour? Are you stupid?");
            stage = 51;
            break;

        case 51:
            sendNPCChat(Mood.ANGRY_YELLING, "You stupid! Only stupid goblins think red armour " +
                    "better!");
            stage = 52;
            break;

        case 52:
            sendNPCDialogue(BENTNOZE, ANGRY, "No they don't! Me think red armour better!");
            stage = 53;
            break;

        case 53:
            sendNPCChat(Mood.ANGRY, "That because you stupid!");
            stage = 54;
            break;

        case 54:
            sendNPCDialogue(BENTNOZE, MAD, "Me not stupid!");
            stage = 55;
            break;

        case 55:
            sendNPCChat(Mood.ASKING, "Then why you not like green armour?");
            stage = 56;
            break;

        case 56:
            sendNPCDialogue(BENTNOZE, ANGRY, "Because red armour better!");
            stage = 57;
            break;

        case 57:
            sendNPCChat(Mood.ANGRY, "Only stupid goblins think that! You stupid!");
            stage = 2;
            break;

        /*
         * Another random dialogue...
         */

        case 60:
            sendNPCChat(Mood.ANGRY, "No it has to be green!");
            stage = 61;
            break;

        case 61:
            sendNPCDialogue(BENTNOZE, PLAIN_TALKING, "Go away human, we busy.");
            stage = 2;
            break;

        /*
         * And another...
         */

        case 65:
            sendNPCChat(Mood.ANGRY, "No red! Red armour makes you look fat.");
            stage = 66;
            break;

        case 66:
            sendNPCDialogue(BENTNOZE, ANGRY, "Everything makes YOU look fat!");
            stage = 67;
            break;

        case 67:
            sendNPCChat(Mood.MAD, "Shut up!");
            stage = 68;
            break;

        case 68:
            sendNPCDialogue(BENTNOZE, ANGRY, "Fatty!");
            stage = 69;
            break;

        case 69:
            sendNPCChat(Mood.ANGRY_YELLING, "SHUT UP!");
            stage = 70;
            break;

        case 70:
            sendNPCDialogue(BENTNOZE, ASKING, "Even this human think you look fat! Don't you, human?");
            stage = 71;
            break;

        case 71:
            sendPlayerChat(Mood.CONFUSED, "Um...");
            stage = 72;
            break;

        case 72:
            sendOptionsDialogue(DEFAULT, "Yes, Wartface looks fat", "No, he doesn't look fat");
            stage = 73;
            break;

        case 73:
            switch(componentId) {
                case OPTION_1:
                    sendNPCDialogue(BENTNOZE, GOOFY_LAUGH, "Ha ha! See, fatty? Even human think you fat!");
                    stage = 74;
                    break;
                case OPTION_2:
                    sendNPCDialogue(BENTNOZE, ANGRY, "Shut up human! Wartface fat and human stupid!");
                    stage = 75;
                    break;
            }
            break;

        case 74:
            sendNPCChat(Mood.ANGRY, "Me not care what human think! Human ugly!");
            stage = 2;
            break;

        case 75:
            sendNPCChat(Mood.ANGRY, "Shut up Bentnoze!");
            stage = 2;
            break;


     }
    }

    @Override
    public void finish() {

    }
}
