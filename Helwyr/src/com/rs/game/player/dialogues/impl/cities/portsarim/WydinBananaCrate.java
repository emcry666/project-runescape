package com.rs.game.player.dialogues.impl.cities.portsarim;

import com.rs.game.player.dialogues.Dialogue;

/**
 * @Author Frostbite
 * @Contact<frostbitersps@gmail.com;skype:frostbitersps>
 */
public class WydinBananaCrate extends Dialogue {
    @Override
    public void start() {
        sendOptionsDialogue("Do you want to take a banana?",
                    "Yes.", "No.");
    }

    @Override
    public void run(int interfaceId, int componentId) {
            switch(stage) {
                case -1:
                    switch (componentId) {
                        case OPTION_1:
                            end();
                            if(player.getInventory().getFreeSlots() > 1) {
                                player.getInventory().addItem(1963, 1);
                                player.output("You take a banana.");
                            } else {
                                player.output("You do not have enough inventory space.");
                                end();
                            }
                            break;
                        case OPTION_2:
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
