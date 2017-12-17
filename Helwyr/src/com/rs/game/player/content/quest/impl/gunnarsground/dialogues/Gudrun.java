package com.rs.game.player.content.quest.impl.gunnarsground.dialogues;

import com.rs.game.player.content.quest.QuestList.Quests;
import com.rs.game.player.content.quest.State.QuestState;
import com.rs.game.player.content.quest.impl.gunnarsground.GunnarsGround;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.game.player.dialogues.Mood;

/**
 * @Author Frostbite
 * @Contact<frostbitersps@gmail.com;skype:frostbitersps>
 */
public class Gudrun extends Dialogue {

    /**
     * TODO edit npc ids.
     */

    int KJELL = 2343;
    int DORODON = 2344;

    @Override
    public void start() {
        stage = (Integer) parameters[0];
        int progress = player.getQuestManager().get(Quests.GUNNARS_GROUND).getStage();
            if(progress < 5) {
                sendNPCDialogue(KJELL, ANGRY, "Gudrun! You caught enough fish?");
                stage = -1;
                switch (progress ) {
                    case 5:
                        sendOptionsDialogue(DEFAULT, "So, you want me to talk to your father?", "So, you want me to kill your father?");
                        stage = 38;
                        break;
                    case 6:
                        sendNPCChat(Mood.ASKING, "What did he say?");
                        stage = 42;
                        break;
                    case 7:
                        sendNPCChat(Mood.NORMAL, "If there's anything you can do to make papa see sense," +
                                " please do it.");
                        stage = -2;
                        break;

                    case 11:
                        if(!player.hasItem(GunnarsGround.GUNNARS_GROUND)) {
                                sendNPCChat(Mood.ASKING, "What is it?");
                            stage = 47;
                        } else {
                            sendNPCChat(Mood.ASKING, "What have you got there?");
                            stage = 48;
                        }
                        break;

                    case 12:
                    case 13:
                    case 14:
                        sendNPCChat(Mood.NORMAL, "Are you ready for the recital?");
                        stage = 55;
                        break;

                    case 15:
                        sendNPCChat(Mood.HAPPY, "Papa was so impressed by Dororan's poem, he's made him the " +
                                "village poet!");
                        stage = 57;
                        break;
                }

        }
    }

    @Override
    public void run(int interfaceId, int componentId) {
        switch (stage) {
            case -1:
                sendNPCChat(Mood.ANGRY, "Yes! I have plenty of fish!");
                stage = 1;
                break;

            case 1:
                sendNPCDialogue(KJELL, ANGRY, "Your father needs many fish to feed the freemen!");
                stage = 2;
                break;

            case 2:
                sendNPCChat(Mood.ANGRY, "I know!");
                stage = 3;
                break;

            case 3:
                sendNPCDialogue(KJELL, ANGRY, "Maybe you sneak off to the outlander city again? Buy " +
                        "fish in market, instead of catching them?");
                stage = 4;
                break;

            case 4:
                sendNPCChat(Mood.ANGRY, "Shut up! I'm much better at fishing than you.");
                stage = 5;
                break;

            case 5:
                sendNPCDialogue(KJELL, ANGRY, "You are not!");
                stage = 6;
                break;

            case 6:
                sendNPCChat(Mood.ANGRY, "Just guard the hut like the chieftain told you to!");
                stage = 7;
                break;

            case 7:
                sendNPCDialogue(KJELL, ANGRY, "Fine!");
                stage = 8;
                break;

            case 8:
                sendNPCChat(Mood.SLIGHTLY_ANGRY, "Stupid barbarian.");
                stage = 9;
                break;

            case 9:
                sendNPCChat(Mood.SAD, "Sorry about that, stranger. Did you want something?");
                stage = 10;
                break;

            case 10:
                sendPlayerChat(Mood.ASKING, "Are you Gudrun?");
                stage = 11;
                break;

            case 11:
                sendNPCChat(Mood.NORMAL, "Yes.");
                stage = 12;
                break;

            case 12:
                sendPlayerChat(Mood.HAPPY, "This is for you.");
                stage = 13;
                break;

            case 13:
                sendItemDialogue(GunnarsGround.ENGRAVED_RING, "You show Gudrun the ring.");
                stage = 14;
                break;

            case 14:
                sendNPCChat(Mood.HAPPY, "It's lovely! There's something written on it:");
                stage = 15;
                break;

            case 15:
                sendNPCChat(Mood.HAPPY, "'Gudrun the Fair, Gudrun the Fiery.' Is it about me?");
                stage = 16;
                break;

            case 16:
                sendOptionsDialogue(DEFAULT, "Yes.", "Presumable.");
                stage = 17;
                break;

            case 17:
                switch (componentId) {
                    case OPTION_1:
                    case OPTION_2:
                        sendNPCChat(Mood.HAPPY, "This is a beautiful gift, stranger. Thank you.");
                        stage = 18;
                        break;
                }
                break;

            case 18:
                sendOptionsDialogue(DEFAULT, "The ring isn't from me!", "It should belong to someone just as beautiful.");
                stage = 19;
                break;

            case 19:
                switch (componentId) {
                    case OPTION_1:
                        sendNPCChat(Mood.WTF_FACE, "Oh! Who is it from?");
                        stage = 24;
                        break;
                    case OPTION_2:
                        sendNPCChat(Mood.HAPPY, "That's very flattering! You look like an adventurer, though?");
                        stage = 20;
                        break;
                }
                break;

            case 20:
                sendOptionsDialogue(DEFAULT, "That's right.", "Some call me that.");
                stage = 21;
                break;

            case 21:
                switch (componentId) {
                    case OPTION_1:
                        sendPlayerChat(Mood.NORMAL, "That's right.");
                        stage = 22;
                        break;
                    case OPTION_2:
                        sendPlayerChat(Mood.NORMAL, "Some call me that.");
                        stage = 22;
                        break;
                }
                break;

            case 22:
                sendNPCChat(Mood.NORMAL, "I'm sorry, I could never get involved with an adventurer.");
                stage = 23;
                break;

            case 23:
                sendNPCChat(Mood.WTF_FACE, "Oh! Who is it from?");
                stage = 24;
                break;

            case 24:
                sendOptionsDialogue(DEFAULT, "A great poet.", "A secret admirer.", "A short suitor.");
                stage = 25;
                break;

            case 25:
                switch (componentId) {
                    case OPTION_1:
                        sendNPCChat(Mood.HAPPY, "A tale-teller? A bard? My people have great respect for " +
                                "poets.");
                        stage = 26;
                        break;
                    case OPTION_2:
                        sendNPCChat(Mood.HAPPY, "Does that really happen? How exciting!");
                        stage = 26;
                        break;
                    case OPTION_3:
                        sendNPCChat(Mood.CONFUSED, "What?");
                        stage = 27;
                        break;
                }
                break;

            case 26:
                sendNPCChat(Mood.ASKING, "This man, he is from outside the village?");
                stage = 30;
                break;

            case 27:
                sendPlayerChat(Mood.NORMAL, "A petite paramour.");
                stage = 28;
                break;

            case 28:
                sendNPCChat(Mood.CONFUSED,"What?");
                stage = 29;
                break;

            case 29:
                sendPlayerChat(Mood.NORMAL, "A concise courter!");
                stage = 26;
                break;

            case 30:
                sendPlayerChat(Mood.NORMAL, "Yes.");
                stage = 31;
                break;

            case 31:
                sendNPCChat(Mood.HAPPY, "I would love to leave the village and be romanced by " +
                        "exotic, handsome, outlander men. There's a problem, " +
                        "though.");
                stage = 32;
                break;

            case 32:
                sendPlayerChat(Mood.ASKING, "What's that?");
                stage = 34;
                break;

            case 34:
                sendNPCChat(Mood.SAD, "My papa, the chieftain. He would never let an outerlander " +
                        "pursue me.");
                stage = 35;
                break;

            case 35:
                sendPlayerChat(Mood.ASKING, "Why not?");
                stage = 36;
                break;

            case 36:
                sendNPCChat(Mood.NORMAL, "He thinks all your people are our enemies.");
                stage = 37;
                break;

            case 37:
                sendOptionsDialogue(DEFAULT, "So, you want me to talk to your father?", "So, you want me to kill your father?");
                stage = 38;
                break;

            case 38:
                switch (componentId) {
                    case OPTION_1:
                        sendNPCChat(Mood.SAD, "I've tried to reason with him, but he's impossible! Maybe " +
                                "he'll listen to you. I know some of the others feel the " +
                                "same, but they're loyal to papa.");
                        player.getInventory().deleteItem(GunnarsGround.ENGRAVED_RING, 1);
                        player.getQuestManager().get(Quests.GUNNARS_GROUND).setStage(5);
                        stage = 40;
                        break;
                    case OPTION_2:
                        sendNPCChat(Mood.WTF_FACE, "What? No! Maybe... you could just try talking to him.");
                        stage = 39;
                        break;

                    case 39:
                        sendNPCChat(Mood.SAD, "I've tried to reason with him, but he's impossible! Maybe " +
                                "he'll listen to you. I know some of the others feel the " +
                                "same, but they're loyal to papa.");
                        player.getInventory().deleteItem(GunnarsGround.ENGRAVED_RING, 1);
                        player.getQuestManager().get(Quests.GUNNARS_GROUND).setStage(5);
                        stage = 40;
                        break;

                    case 40:
                        sendOptionsDialogue(DEFAULT, "Where is he?", "I'll see what I can do.");
                        stage = 41;
                        break;

                    case 41:
                        switch (componentId) {
                            case OPTION_1:
                                sendNPCChat(Mood.NORMAL, "In the longhouse at the north end of the village, drinking " +
                                        "and shouting.");
                                stage = -2;
                                break;
                            case OPTION_2:
                                sendPlayerChat(Mood.NORMAL, "I'll see what I can do.");
                                stage = -2;
                                break;
                        }
                        break;

                    case 42:
                        sendPlayerChat(Mood.NORMAL, "He mentioned someone called Gunnar, and what you should " +
                                "think about his feelings.");
                        stage = 43;
                        break;

                    case 43:
                        sendNPCChat(Mood.ANGRY, "By the eyeballs of Guthix! Always Gunnar!");
                        stage = 44;
                        break;

                    case 44:
                        sendOptionsDialogue(DEFAULT, "Who is Gunnar?", "What should we do now?");
                        stage = 45;
                        break;

                    case 45:
                        sendNPCChat(Mood.ANGRY, "He was my great-grandpapa! He founded this village a " +
                                "hundred years ago.");
                        stage = 46;
                        break;

                    case 46:
                        sendOptionsDialogue(DEFAULT, "I don't know, maybe your mystery man will know.");
                        player.getQuestManager().get(Quests.GUNNARS_GROUND).setStage(7);
                        stage = -2;
                        break;

                    case 47:
                        sendPlayerChat(Mood.SAD, "I meant to bring you a poem, but I seem to have " +
                                "mislaid it.");
                        stage = -2;
                        break;

                    case 48:
                        sendPlayerChat(Mood.HAPPY, "Another gift from your mysterious suitor.");
                        stage = 49;
                        break;

                    case 49:
                        sendNPCChat(Mood.ASKING, "A scroll?");
                        stage = 50;
                        break;

                    case 50:
                        sendNPCChat(Mood.NORMAL, "It's a poem; a story to convince your father to settle " +
                                "down. You could recite it to him.");
                        stage = 51;
                        break;

                    case 51:
                        sendNPCChat(Mood.HAPPY, "Let me see that.");
                        stage = 52;
                        break;

                    case 52:
                        sendItemDialogue(GunnarsGround.GUNNARS_GROUND, "You show Gudrun the poem.");
                        stage = 53;
                        break;

                    case 53:
                        sendNPCChat(Mood.NORMAL, "'Gunnar's Ground.'");
                        stage = 54;
                        break;

                    case 54:
                        sendNPCChat(Mood.HAPPY, "Yes! I think this could work. I'll go to the longhouse right " +
                                "away!");
                        player.getQuestManager().get(Quests.GUNNARS_GROUND).setStage(12);
                        player.getInventory().deleteItem(GunnarsGround.GUNNARS_GROUND, 1);
                        stage = -3;
                        break;

                    case 55:
                        sendOptionsDialogue(DEFAULT, "Yes.", "Not right now.");
                        stage = 56;
                        break;

                    case 56:
                        switch (componentId) {
                            case OPTION_1:
                                //TODO Starts cutscene.
                                end();
                                break;
                            case OPTION_2:
                                sendPlayerChat(Mood.NORMAL, "Not right now.");
                                stage = -2;
                                break;
                        }
                        break;

                    case 57:
                        sendNPCDialogue(DORODON, HAPPY, "I'm more than a little surprised! He even gave me a house to live in!");
                        stage = 58;
                        break;

                    case 58:
                        sendNPCChat(Mood.HAPPY, "Our people's tradition is that the tribe provides lodging " +
                                "for the poet.");
                        stage = 59;
                        break;

                    case 59:
                        sendNPCDialogue(DORODON, HAPPY, "It's huge!");
                        stage = 60;
                        break;

                    case 60:
                        sendNPCChat(Mood.HAPPY, "It's not in the village. It's easy of here: across the river " +
                                "and north of the road on the way to Varrock. It's a big " +
                                "house with roses outside.");
                        stage = 61;
                        break;

                    case 61:
                        sendNPCDialogue(DORODON, HAPPY, "I think Gunthor wants me to keep close, but not too close. " +
                                "Oh, I found something there for you!");
                        stage = 62;
                        break;

                    case 62:
                        sendNPCDialogue(DORODON, HAPPY, "Whoever lived there before left a dozen pairs of boots in " +
                                "the attic.");
                        stage = 63;
                        break;

                    case 63:
                        sendNPCDialogue(DORODON, NORMAL, "I picked out a pair for you to thank you for all your help.");
                        stage = 64;
                        break;

                    case 64:
                        sendNPCDialogue(DORODON, HAPPY, "Underneath them all was this magic lamp. You should have " +
                                "it aswell!");
                        stage = 65;
                        break;

                    case 65:
                        sendNPCChat(Mood.HAPPY, "We're going to the new house. You should come and visit!");
                        stage = 66;
                        break;

                    case 66:
                        sendNPCDialogue(DORODON, HAPPY, "Yes, we'll see you there!");
                        stage = 67;
                        break;

                    case 67:
                        sendOptionsDialogue(DEFAULT, "I'll see you soon.", "I'll consider dropping in.");
                        stage = 68;
                        break;

                    case 68:
                        switch (componentId) {
                            case OPTION_1:
                            case OPTION_2:
                                sendNPCDialogue(DORODON, HAPPY, "Goodbye!");
                                stage = 69;
                                break;
                        }
                        break;

                    case 69:
                        sendNPCChat(Mood.HAPPY, "Goodbye!");
                        stage = -4;
                        break;


                    case -4:
                        //TODO fadescreen
                        end();
                        player.getQuestManager().get(Quests.GUNNARS_GROUND).setStage(16);
                        player.getQuestManager().get(Quests.GUNNARS_GROUND).setState(QuestState.COMPLETED);
                        player.getQuestManager().get(Quests.GUNNARS_GROUND).finish();
                        break;

                    case -3:
                        //Starts Gunnar's Ground cutscene.
                        break;

                    case -2:
                        end();
                        break;
                }
                break;

        }
    }

    @Override
    public void finish() {

    }
}
