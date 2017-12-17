package com.rs.game.player.content.quest.impl.runemysteries.dialogues;

import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.player.content.quest.QuestList.Quests;
import com.rs.game.player.content.quest.impl.runemysteries.RuneMysteries;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.game.player.dialogues.Mood;
import com.rs.utils.ShopsHandler;

/**
 * @Author arrow
 * @Contact<arrowrsps@gmail.com;skype:arrowrsps>
 */

public class Aubury extends Dialogue {

    @Override
    public int getNPCID() {
        return 5913;
    }

    @Override
    public void start() {
        stage = (Integer) parameters[0];
        int progress = player.getQuestManager().get(Quests.RUNE_MYSTERIES).getStage();
        if(progress == 4) {
            stage = -2;
        }
        if(progress == 5) {
            sendNPCChat(Mood.ASKING, "I suggest you take those research notes of mine back" +
                    " to the head wizard at the Wizards' Tower.");
            stage = 7;
        }
        switch(stage) {
            case 0:
                sendNPCChat(Mood.ASKING, "Do you want to buy some runes?");
                stage = -1;
                break;

            case -2:
                sendNPCChat(Mood.HAPPY, "My gratitude to you adventurer for bringing me these " +
                        "research notes. I notice that you brought me the head" +
                        " wizard a special talisman that was the key to our family " +
                        "unlocking the puzzle.");
                stage = 4;
                break;
        }
    }

    @Override
    public void run(int interfaceId, int componentId) {
        int progress = player.getQuestManager().get(Quests.RUNE_MYSTERIES).getStage();
        switch(stage) {
            case -1:
                if(progress < 3 || progress >= 5) {
                    sendOptionsDialogue(DEFAULT, "Yes please!", "Oh, it's a rune shop. No thank you, then.");
                } else {
                    sendOptionsDialogue(DEFAULT_OPTIONS_TITLE, "Yes please!", "Oh, it's a rune shop, No thank you, then.", "I have been sent here with a package for you.");
                }
                stage = 1;
                break;

            case 1:
                if (progress < 3) {
                    switch (componentId) {
                        case OPTION_1:
                            ShopsHandler.openShop(player, 6);
                            end();
                            break;
                        case OPTION_2:
                            sendNPCChat(Mood.NORMAL, "Well, if you find someone who does want runes, please" +
                                    " send them my way.");
                            stage = -2;
                            break;
                    }
                } else {
                    switch (componentId) {
                        case OPTION_1:
                            ShopsHandler.openShop(player, 6);
                            end();
                            break;
                        case OPTION_2:
                            sendNPCChat(Mood.NORMAL, "Well, if you find someone who does want runes, please" +
                                    " send them my way.");
                            stage = -2;
                            break;
                        case OPTION_3:
                            sendNPCChat(Mood.HAPPY, "Really? But... surely he can't have.. Please, let me" +
                                    " have it, it must be extremely important for him to have " +
                                    "sent a stranger.");
                            stage = 2;
                            break;
                    }
                }
                break;

            case 2:
                if(player.hasItem(RuneMysteries.RESEARCH_PACKAGE)) {
                    if (player.getInventory().getFreeSlots() > 1) {
                        sendHandedItem(RuneMysteries.RESEARCH_PACKAGE, "You hand Aubury the research package.");
                        player.getInventory().deleteItem(RuneMysteries.RESEARCH_PACKAGE, 1);
                        stage = 3;
                    } else {
                        end();
                        player.output("You do not have enough inventory space.");
                    }
                } else {
                    sendPlayerChat(Mood.SAD, "Uh... yeah... about that... I kind of don't have it with me...");
                    stage = 10;
                }
                break;

            case 3:
                sendNPCChat(Mood.HAPPY, "This... this is incredible. Please, give me a few moments " +
                        "to quickly look over this, and then talk to me again.");
                player.getQuestManager().get(Quests.RUNE_MYSTERIES).setStage(4);
                stage = -2;
                break;

            case 4:
                sendNPCChat(Mood.NORMAL, "Combined with the information I had already collected" +
                        " regarding the Rune Essence, I think we have finally" +
                        " unlocked the power to");
                stage = 5;
                break;

            case 5:
                sendNPCChat(Mood.HAPPY, "...no. I am getting ahead of myself. Please take this " +
                        "summary of my research back to the head wizard at" +
                        " the Wizards' Tower. I trust his judgement on whether " +
                        "to let you in on our little secret or not.");
                stage = 6;
                break;

            case 6:
    			sendHandedItem(RuneMysteries.RESEARCH_NOTES, "Aubury gives you his research notes.");
    			player.getQuestManager().get(Quests.RUNE_MYSTERIES).setStage(5);
    			if(player.getInventory().getFreeSlots() > 0) {
    				player.getInventory().addItem(RuneMysteries.RESEARCH_NOTES, 1);
    			} else {
    				World.addGroundItem(new Item(RuneMysteries.RESEARCH_NOTES), new WorldTile(player.getX(), player.getY(), player.getPlane()));
    			}
    			stage = -2;
    			break;

            case 7:
                if(!player.hasItem(RuneMysteries.RESEARCH_NOTES)) {
                    sendPlayerChat(Mood.SAD, "I can't... I lost them...");
                    stage = 8;
                } else {
                    sendPlayerChat(Mood.NORMAL, "Ok then, I will do that.");
                    stage = 9;
                }
                break;

            case 8:
                sendNPCChat(Mood.NORMAL, "Well, luckily I have duplicates. It's a good thing they " +
                        "are written in code, I would not want the wrong kind " +
                        "of person to get access to the information contained " +
                        "within.");
                if(player.getInventory().getFreeSlots() > 0) {
    				player.getInventory().addItem(RuneMysteries.RESEARCH_NOTES, 1);
    			} else {
    				World.addGroundItem(new Item(RuneMysteries.RESEARCH_NOTES), new WorldTile(player.getX(), player.getY(), player.getPlane()));
    			}
                stage = -2;
                break;

            case 9:
                sendNPCChat(Mood.ASKING, "Unless you were talking to me because you wished to buy some runes?");
                stage = -1;
                break;

            case 10:
                sendNPCChat(Mood.CONFUSED, "What kind of person tells me they have a delivery for " +
                        "me, but not with them? Honestly.");
                stage = 11;
                break;

            case 11:
                sendNPCChat(Mood.NORMAL, "Come back when you do.");
                stage = -2;
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
