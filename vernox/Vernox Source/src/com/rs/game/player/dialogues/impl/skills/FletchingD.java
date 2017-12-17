package com.rs.game.player.dialogues.impl.skills;

import com.rs.game.player.actions.Fletching;
import com.rs.game.player.actions.Fletching.Fletch;
import com.rs.game.player.content.SkillsDialogue;
import com.rs.game.player.content.SkillsDialogue.SkillDialogueResult;
import com.rs.game.player.dialogues.Dialogue;

public class FletchingD extends Dialogue {

	// componentId, amount, option
	
	private Fletch items;

	@Override
	public void start() {
		items = (Fletch) parameters[0];
		SkillsDialogue.sendSkillDialogueByProduce(player, items.getId());
	}

	@Override
	public void run(int interfaceId, int componentId) {
		SkillDialogueResult result = SkillsDialogue.getResult(player);
		player.getActionManager().setAction(new Fletching(items, result.getProduce(), result.getQuantity()));
		end();
	}

	@Override
	public void finish() {
	}

}
