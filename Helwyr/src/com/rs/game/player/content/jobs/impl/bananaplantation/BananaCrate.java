package com.rs.game.player.content.jobs.impl.bananaplantation;

import com.rs.game.player.Player;
import com.rs.game.player.content.jobs.JobState;
import com.rs.game.player.content.jobs.Jobs;
import com.rs.game.player.content.quest.QuestList.Quests;
import com.rs.game.player.content.quest.impl.piratestreasure.PiratesTreasure;

/**
 * @Author Frostbite
 * @Contact<frostbitersps@gmail.com;skype:frostbitersps>
 */
public class BananaCrate {


    /**
     * Inspects Crate
     * @param player
     */
    public static void handleObjectClick(final Player player) {
        if(player.getJobManager().get(Jobs.BANANA_PLANTATION).getState() == JobState.STARTED) {
            int size = player.getJobManager().get(Jobs.BANANA_PLANTATION).getStage();
            if(size >= 10)
                player.output("This crate is full of bananas.");
            else
                player.output("The crate " + (size < 1 ? "is " : "has " + size) + (size < 1 ? "completely empty" : " bananas") + " inside.");
        } else {
            player.output("This crate looks completely empty.");
        }
    }


    /**
     * Fill's crate with bananas
     * @param player
     */
    public static void handleObjectClick2(final Player player) {
        int size = player.getJobManager().get(Jobs.BANANA_PLANTATION).getStage();
        if(size >= 10) {
            player.getDialogueManager().startDialogue("SimpleMessage", "This crate is already full.");
            return;
        }
        if(player.getJobManager().get(Jobs.BANANA_PLANTATION).getState() != JobState.STARTED) {
            player.output("I don't know what goes in these crates...");
            return;
        }
        if(player.getJobManager().get(Jobs.BANANA_PLANTATION).getState() == JobState.STARTED) {
            if(!player.getInventory().containsItem(1963, 1)) {
                player.output("You do not have any bananas.");
                return;
            }
            int loop = 10;
            while (loop >= 0) {
                if (player.getInventory().containsItem(1963, 1)) {
                    player.getInventory().deleteItem(1963, 1);
                    player.getJobManager().get(Jobs.BANANA_PLANTATION).setStage(player.getJobManager().get(Jobs.BANANA_PLANTATION).getStage() + 1);
                }
                if(player.getJobManager().get(Jobs.BANANA_PLANTATION).getStage() == 10) {
                    player.getDialogueManager().startDialogue("SimpleMessage", "You fill the crate with bananas.");
                }
                loop--;
            }
        }
    }

    /**
     * Handles Rum on Crate
     * @param player
     */
    public static void stashRum(final Player player) {
        if (player.getJobManager().get(Jobs.BANANA_PLANTATION).getState() == JobState.STARTED) {
            if (player.getQuestManager().get(Quests.PIRATES_TREASURE).getStage() < 3) {
                player.getInventory().deleteItem(PiratesTreasure.KARAMJA_RUM, 1);
                player.getDialogueManager().startDialogue("SimpleMessage", "You stash the rum in the crate.");
                player.getQuestManager().get(Quests.PIRATES_TREASURE).setStage(3);
            } else {
                player.output("There is already some rum in there...");
            }
        } else {
            player.output("I don't know what goes in these crates...");
        }
    }

    /**
     * Handles Bananas on Crate
     * @param player
     */
    public static void packBananas(final Player player) {
        if (player.getJobManager().get(Jobs.BANANA_PLANTATION).getState() == JobState.STARTED) {
            if (player.getJobManager().get(Jobs.BANANA_PLANTATION).getStage() < 10) {
                if (player.getJobManager().get(Jobs.BANANA_PLANTATION).getStage() >= 10) {
                    player.getDialogueManager().startDialogue("SimpleMessage", "You fill the crate with bananas.");
                    return;
                }
                if (player.getInventory().containsItem(1963, 1)) {
                    player.getInventory().deleteItem(1963, 1);
                    player.getJobManager().get(Jobs.BANANA_PLANTATION).setStage(player.getJobManager().get(Jobs.BANANA_PLANTATION).getStage() + 1);
                    player.getDialogueManager().startDialogue("SimpleMessage", "You pack a banana into the crate.");
                }
            }
        } else {
            player.output("I don't know what goes in these crates...");
        }
    }

}
