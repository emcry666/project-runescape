package com.rs.game.player.dialogues.impl;

import com.rs.game.WorldObject;
import com.rs.game.player.actions.Smithing;
import com.rs.game.player.actions.Smithing.ForgingBar;
import com.rs.game.player.content.SkillsDialogue;
import com.rs.game.player.content.SkillsDialogue.SkillDialogueResult;
import com.rs.game.player.dialogues.Dialogue;

/**
 * 
 * @author CamelCrusher
 * <skype;fdylanofsalem>
  *<email;developerdylan07@gmail.com>
 */

public class SmithingD extends Dialogue {

    private WorldObject object;


    public int type;
    public boolean dungeoneering;

    @Override
	public void start() {
		object = (WorldObject) parameters[0];
		ForgingBar bar = (ForgingBar) parameters[1];
		SkillsDialogue.sendSkillDialogueByProduce(player, bar.getProducedItem().getId());
	}

	@Override
	public void run(int interfaceId, int componentId) {
		SkillDialogueResult result = SkillsDialogue.getResult(player);
		end();
		ForgingBar bar = ForgingBar.getBarByProduce(result.getProduce());
		if(bar == null)
			return;
		player.getActionManager().setAction(new Smithing(bar, object, result.getQuantity()));
	}

	@Override
	public void finish() {
	}

    public WorldObject getObject() {
	return object;
    }

    public void setObject(WorldObject object) {
	this.object = object;
    }

}
