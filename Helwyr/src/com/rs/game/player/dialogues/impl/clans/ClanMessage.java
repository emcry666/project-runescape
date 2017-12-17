package com.rs.game.player.dialogues.impl.clans;

import com.rs.game.player.dialogues.Dialogue;


public class ClanMessage extends Dialogue {

    @Override
    public void start() {
    	player.getInterfaceManager().sendChatBoxInterface(1103);
    	player.getPackets().sendIComponentText(1103, 0, "Type in your desired clan message:");
    	player.getPackets().sendIComponentText(1103, 9, "0/80");
    	player.getPackets().sendIComponentText(1103, 8, "Save");
    }

    @Override
    public void run(int interfaceId, int componentId) {
    	close();

    }

    @Override
    public void finish() {

    }

}
