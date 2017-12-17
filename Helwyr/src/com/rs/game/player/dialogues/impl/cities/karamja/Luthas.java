package com.rs.game.player.dialogues.impl.cities.karamja;


import com.rs.game.player.content.jobs.JobState;
import com.rs.game.player.content.jobs.Jobs;
import com.rs.game.player.content.quest.QuestList.Quests;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.game.player.dialogues.Mood;

/**
 * @Author arrow
 * @Contact<arrowrsps@gmail.com;skype:arrowrsps>
 */
public class Luthas extends Dialogue {

    @Override
    public int getNPCID() {
        return 379;
    }

    @Override
    public void start() {
        if(player.getJobManager().get(Jobs.BANANA_PLANTATION).getStage() >= 10) {
            sendPlayerChat(Mood.HAPPY, "I've filled a crate with bananas!");
            stage = 9;
        }
        if(player.getJobManager().get(Jobs.BANANA_PLANTATION).getState() == JobState.STARTED &&
                player.getJobManager().get(Jobs.BANANA_PLANTATION).getStage() < 10) {
            sendNPCChat(Mood.ASKING, "Have you completed your task yet?");
            stage = 7;
        }
        if(player.getJobManager().get(Jobs.BANANA_PLANTATION).getState() == JobState.NOT_STARTED) {
            sendNPCChat(Mood.HAPPY, "Hello I'm Luthas, I run the banana plantation here.");
        }
    }

    @Override
    public void run(int interfaceId, int componentId) {
        switch(stage) {
            case -1:
                sendOptionsDialogue(DEFAULT, "Could you offer me employment on your plantation?", "That customs officer is annoying isn't he?");
                stage = 1;
                break;

            case 1:
                switch(componentId) {
                    case OPTION_1:
                    sendNPCChat(Mood.NORMAL, "Yes, I can sort something out. There's a crate ready to " +
                            "be loaded onto the ship.");
                        stage = 2;
                        break;
                    case OPTION_2:
                        sendNPCChat(Mood.NORMAL, "Well I know her pretty well. She doesn't cause me any " +
                                "trouble any more.");
                        stage = 4;
                        break;
                }
                break;

            case 2:
                sendNPCChat(Mood.NORMAL, "You wouldn't believe the demand for bananas from " +
                        "Wydin's shop over in Port Sarim. I think this is the " +
                        "third crate I've shipped him this month...");
                stage = 3;
                break;

            case 3:
                sendNPCChat(Mood.NORMAL, "If you could feel it up with bananas, I'll pay you 30 " +
                        "gold.");
                if(player.getQuestManager().get(Quests.PIRATES_TREASURE).getStage() > 0) {
                    player.getQuestManager().get(Quests.PIRATES_TREASURE).setStage(2);
                }
                player.getJobManager().get(Jobs.BANANA_PLANTATION).setState(JobState.STARTED);
                stage = -2;
                break;

            case 4:
                sendNPCChat(Mood.NORMAL, "She doesn't even search my export crates any more. " +
                        "She knows they only contain bananas.");
                stage = 5;
                break;

            case 5:
                sendPlayerChat(Mood.SUSPICIOUS, "Really? How interesting. Whereabouts do you send those to?");
                stage = 6;
                break;

            case 6:
                sendNPCChat(Mood.NORMAL, "There is a little shop over in Port Sarim that buys " +
                        "them up by the crate. I believe it is run by a man " +
                        "called Wydin.");
                stage = -2;
                break;

            case 7:
                sendOptionsDialogue(DEFAULT, "What did I have to do again?", "No, the crate isn't full yet.", "So where are these bananas going to be delivered to?",
                        "That customs officer is annoying ain't she?");
                stage = 8;
                break;

            case 8:
                switch(componentId) {
                    case OPTION_1:
                        sendNPCChat(Mood.NORMAL, "There's a crate ready to be loaded onto the ship. If " +
                                "you could fill it up with bananas, I'll pay you 30 gold.");
                        stage = -2;
                        break;
                    case OPTION_2:
                        sendNPCChat(Mood.NORMAL, "Well come back to me when it is.");
                        stage = -2;
                        break;
                    case OPTION_3:
                        sendNPCChat(Mood.NORMAL, "I sell them to Wydin who runs a grocery store in Port " +
                                "Sarim.");
                        stage = -2;
                        break;
                    case OPTION_4:
                        sendNPCChat(Mood.NORMAL, "Well I know her pretty well. She doesn't cause me any " +
                                "trouble any more.");
                        stage = 4;
                        break;
                }
                break;

            case 9:
                sendNPCChat(Mood.HAPPY, "Well done, here's your payment.");
                stage = 10;
                break;
            case 10:
                player.getJobManager().get(Jobs.BANANA_PLANTATION).sendReward();
                if(player.getQuestManager().get(Quests.PIRATES_TREASURE).getStage() > 2) {
                    player.getQuestManager().get(Quests.PIRATES_TREASURE).setStage(4);
                }
                player.output("Luthas hands you 30 coins.");
                sendOptionsDialogue(DEFAULT, "Will you pay me for another crate full?", "Thank you, I'll be on my way", "So where are all these bananas going to be delivered to?",
                        "That customs officer is annoying isn't she?");
                stage = 11;
                break;

            case 11:
                switch(componentId) {
                    case OPTION_1:
                        sendNPCChat(Mood.HAPPY, "Yes certainly.");
                        stage = 12;
                        break;
                    case OPTION_2:
                        sendPlayerChat(Mood.HAPPY, "Thank you, I'll be on my way.");
                        stage = -2;
                        break;
                    case OPTION_3:
                        sendNPCChat(Mood.NORMAL, "I sell them to Wydin who runs a grocery store in Port " +
                                "Sarim.");
                        stage = -2;
                        break;
                    case OPTION_4:
                        sendNPCChat(Mood.NORMAL, "Well I know her pretty well. She doesn't cause me any " +
                                "trouble any more.");
                        stage = 4;
                        break;
                }
                break;

            case 12:
                sendNPCChat(Mood.HAPPY, "If you go outside you should see the old crate has been " +
                        "loaded on to the shop, and there is another empty crate " +
                        "in its place.");
                player.getJobManager().get(Jobs.BANANA_PLANTATION).setState(JobState.STARTED);
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
