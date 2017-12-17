package com.rs.game.player.dialogues.impl.clans;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.item.Item;
import com.rs.game.player.dialogues.Dialogue;

/**
 * 
 * @author Frostbite
 * <Frostbitersps@gmail.com> <Skype@Frostbitersps>
 *
 */

public class ClaimClanItem extends Dialogue {

	@Override
	public void start() {
		int sendNPCDialogueId = (Integer) this.parameters[0];
		int itemId = (Integer) this.parameters[1];
		if (player.getClanManager() == null) {
			sendNPCDialogue(sendNPCDialogueId, 9827, "Talk to me once you have a clan.");
			return;
		}
		sendNPCDialogue(sendNPCDialogueId, 9827, "Enjoy your " + ItemDefinitions.getItemDefinitions(itemId).getName().toLowerCase() + "!");
		player.getInventory().addItem(new Item(itemId));
	}

	@Override
	public void run(int interfaceId, int componentId) {
		close();
	}

	@Override
	public void finish() {

	}
}
