package com.rs.game.player.dialogues.impl.clans;

import com.rs.game.player.dialogues.Dialogue;


public class ClanMotto extends Dialogue {

    @Override
    public void start() {
    	player.getInterfaceManager().sendChatBoxInterface(1103);
    }

    @Override
    public void run(int interfaceId, int componentId) {
    	close();

    }

    @Override
    public void finish() {

    }

}
