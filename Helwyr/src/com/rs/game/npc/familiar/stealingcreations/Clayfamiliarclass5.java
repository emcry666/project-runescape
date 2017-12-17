package com.rs.game.npc.familiar.stealingcreations;

import com.rs.game.Animation;
import com.rs.game.Graphics;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.npc.familiar.Familiar;
import com.rs.game.npc.familiar.Familiar.SpecialAttack;
import com.rs.game.player.Player;
import com.rs.game.player.actions.Summoning.Pouches;
import com.rs.game.player.content.stealingcreations.Score;
import com.rs.game.player.content.stealingcreations.StealingCreationController;

public class Clayfamiliarclass5 extends Familiar {

	private static final long serialVersionUID = 7289857564889907408L;

	public Clayfamiliarclass5(Player owner, Pouches pouch, WorldTile tile,
			int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
		super(owner, pouch, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
	}

	@Override
	public int getBOBSize() {
		return 24;
	}

	@Override
	public int getSpecialAmount() {
		return 30;
	}

	@Override
	public SpecialAttack getSpecialAttack() {
		return SpecialAttack.CLICK;
	}

	@Override
	public String getSpecialDescription() {
		return "Deposit all items in the beast of burden's possession in exchange for points.";
	}

	@Override
	public String getSpecialName() {
		return "Clay Deposit";
	}

	@Override
	public boolean submitSpecial(Object object) {
		if (getOwner().getControlerManager().getControler() == null
				|| !(getOwner().getControlerManager().getControler() instanceof StealingCreationController)) {
			dissmissFamiliar(false);
			return false;
		}
		getOwner().setNextGraphics(new Graphics(1316));
		getOwner().setNextAnimation(new Animation(7660));
		final StealingCreationController sc = (StealingCreationController) getOwner()
				.getControlerManager().getControler();
		final Score score = sc.getGame().getScore(getOwner());
		if (score == null)
			return false;
		for (final Item item : getBob().getBeastItems().getItems()) {
			if (item == null)
				continue;
			sc.getGame().sendItemToBase(getOwner(), item, sc.getTeam(), true);
		}
		return true;
	}
}
