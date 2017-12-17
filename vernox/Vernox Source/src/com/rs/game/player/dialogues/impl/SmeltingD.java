package com.rs.game.player.dialogues.impl;

import com.rs.game.WorldObject;
import com.rs.game.player.actions.Smelting;
import com.rs.game.player.actions.Smelting.SmeltingBar;
import com.rs.game.player.content.SkillsDialogue;
import com.rs.game.player.content.SkillsDialogue.SkillDialogueResult;
import com.rs.game.player.dialogues.Dialogue;

public class SmeltingD extends Dialogue {

	private WorldObject object;

	@Override
	public void start() {
		object = (WorldObject) parameters[0];
		SmeltingBar bar = (SmeltingBar) parameters[1];
		SkillsDialogue.sendSkillDialogueByProduce(player, bar.getProducedBar().getId());
	}

	@Override
	public void run(int interfaceId, int componentId) {
		SkillDialogueResult result = SkillsDialogue.getResult(player);
		end();
		SmeltingBar bar = SmeltingBar.getBarByProduce(result.getProduce());
		if(bar == null)
			return;
		player.getActionManager().setAction(new Smelting(bar, object, result.getQuantity()));
	}

	@Override
	public void finish() {
	}
}
