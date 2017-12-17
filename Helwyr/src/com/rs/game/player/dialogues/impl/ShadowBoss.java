package com.rs.game.player.dialogues.impl;

import com.rs.cache.loaders.NPCDefinitions;
import com.rs.game.WorldTile;
import com.rs.game.player.Skills;
import com.rs.game.player.content.Magic;
import com.rs.game.player.dialogues.Dialogue;

public final class ShadowBoss extends Dialogue {

	private int npcId;
	
	@Override
	public void start() {
		
		npcId = (Integer) parameters[0];
		sendEntityDialogue(SEND_2_TEXT_CHAT,
				new String[] { NPCDefinitions.getNPCDefinitions(npcId).name,
						"So, you wish to challenge (name)?",
						" Fine, but it's going to cost you..." }, IS_NPC, npcId, 9827);
	}

	@Override
	public void run(int interfaceId, int componentId) {
			stage = 1;
	
		if (stage == 1) {
			sendOptionsDialogue("Pay the fee of 10M coins to fight (name)?", "<col=00CC00>Yes.</col>",
					"<col=00FFFF>No.</col>");
			stage = 2;
		}	 else if (stage == 4) {
			if (componentId == OPTION_1) {
				if (player.getInventory().containsItem(995, 10000000)) {
					player.getInventory().deleteItem(995, 10000000);
					//teleportPlayer(3824, 4760, 0);
				} else
				player.sm("Entering the boss room requires a fee of 10 million coins.");
				close();
			} else if (componentId == OPTION_2)
				close();
}
}
	
		private void teleportPlayer(int x, int y, int z) {
			player.setNextWorldTile(new WorldTile(x, y, z));
			player.stopAll();
			//player.getControlerManager().startControler("GodWars");
		}
		
		@Override
		public void finish() {

		}
	}