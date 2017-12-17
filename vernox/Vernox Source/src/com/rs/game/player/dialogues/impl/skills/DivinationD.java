package com.rs.game.player.dialogues.impl.skills;

import com.rs.game.player.actions.divination.WeaveAction;
import com.rs.game.player.actions.divination.WeaveAction.Weaves;
import com.rs.game.player.content.SkillsDialogue;
import com.rs.game.player.content.SkillsDialogue.SkillDialogueResult;
import com.rs.game.player.dialogues.Dialogue;

/**
 * 
 * @author Dylan || Mystic Wolf || Jul 14, 2016
 *
 */

public class DivinationD extends Dialogue {

    @Override
	public void start() {
		Weaves weave = (Weaves) parameters[0];
		SkillsDialogue.sendSkillDialogueByProduce(player, weave.getProduceItem().getId());
	}

	@Override
	public void run(int interfaceId, int componentId) {
		SkillDialogueResult result = SkillsDialogue.getResult(player);
		end();
		Weaves weave = Weaves.getWeaveByProduce(result.getProduce());
		if(weave == null)
			return;
		player.getActionManager().setAction(new WeaveAction(weave, result.getQuantity()));
	}

	@Override
	public void finish() {
	}



}
