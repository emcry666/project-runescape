package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.DisplayNames;

/* Edit Account
 * @author Hale
 */

public class EditAccount extends Dialogue {

	public EditAccount() {
	}

	@Override
	public void start() {
		stage = 1;
		sendOptionsDialogue("Edit Account", "Set Title",
				"Set Title Hex Color", "Setdisplay", "Removedisplay");
	
		}
		
		
	@Override
	public void run(int interfaceId, int componentId) {
		if (stage == 1) {
			if (componentId == OPTION_1) {
				player.getPackets().sendRunScript(109, new Object[] { "Please enter the title you would like:" });
				player.getTemporaryAttributtes().put("customtitle", Boolean.TRUE);
				player.getInterfaceManager().closeChatBoxInterface();
				close();
			} else if (componentId == OPTION_2) {
				player.getPackets().sendRunScript(109, new Object[] { "Please enter the title color in HEX format:" });
				player.getTemporaryAttributtes().put("titlecolor", Boolean.TRUE);
				player.getInterfaceManager().closeChatBoxInterface();
				close();
			} else if (componentId == OPTION_3) {
				player.getPackets().sendRunScript(109, new Object[] { "Please enter the display name you would like:" });
				player.getTemporaryAttributtes().put("setdisplay", Boolean.TRUE);
				player.getInterfaceManager().closeChatBoxInterface();
				close();
			} else if (componentId == OPTION_4) {
				player.getInterfaceManager().closeChatBoxInterface();
				close();
				 player.getPackets().sendGameMessage("Removed Display Name: " +DisplayNames.removeDisplayName(player));
					close();
		}
	}
}

	@Override
	public void finish() {
	}

}