package com.rs.game.player.actions.divination;

import com.rs.game.Animation;
import com.rs.game.Graphics;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Action;
import com.rs.game.player.actions.divination.HarvestAction.Wisps;
import com.rs.utils.Utils;

/**
 * 
 * @author Dylan || Mystic Wolf || Jul 14, 2016
 *
 */
public class ConvertAction extends Action {


	private static final int[] MEMORIES = {
		/*Enriched Memories*/29406, 29405, 29404, 29403, 29402, 29401, 29400, 29399, 29398, 29397, 29396,
		/*Regular Memories*/29395, 29394, 29393, 29392, 29391, 29390, 29389, 29388, 29387, 29386, 29385, 29384 };
	private static final int[] ENERGY = {
		29324,29323, 29322, 29321, 29320, 29319, 29318, 29317, 29316, 29315, 29314, 29313,
	};

	private int type, nextMemory;
	private boolean enriched;

	public ConvertAction(int type) {
		this.type = type;
	}

	@Override
	public boolean start(Player player) {
		player.getInterfaceManager().removeCentralInterface();
		checkAvailableMemory(player);
		return nextMemory != -1;
	}

	@Override
	public boolean process(Player player) {
		checkAvailableMemory(player);
		return nextMemory != -1;
	}

	@Override
	public int processWithDelay(Player player) {
		Animation convertAnim = new Animation(type == 6 ? 21234 : 21232);
		Graphics convertGFX = new Graphics(type == 1 ? 4239 : 4240);
	    for (Wisps w : Wisps.values())
	    {
		if (type == 1)
		{
		    player.getInventory().addItem(w.energyId, Utils.random(2, 5));
		    player.getInventory().deleteItem(w.memoryId, 1);
		    player.setNextAnimation(convertAnim);
		    player.setNextGraphics(convertGFX);
		    player.getSkills().addXp(Skills.DIVINATION, w.getXP() * 2);
		}
		else if (type == 6)
		{
		    player.getInventory().deleteItem(w.memoryId, 1);
		    player.setNextAnimation(convertAnim);
		    player.setNextGraphics(convertGFX);
		    player.getSkills().addXp(Skills.DIVINATION, w.getXP() * 4); 
		}
		else if (type == 7)
		{
		    if (player.getInventory().containsItem(w.getEnergyId(), 1) && player.getInventory().containsItem(w.getMemoryId(), 1))
		    {
			player.getInventory().deleteItem(w.memoryId, 1);
			player.getInventory().deleteItem(w.energyId, 5);
			player.setNextAnimation(convertAnim);
			player.setNextGraphics(convertGFX);
			player.getSkills().addXp(Skills.DIVINATION, w.getXP() * 8); 
		    } else {
			player.sendMessage("You don't have the right items to do this action.");
		    }
		}
	    }
	    	return 3;
	}

	@Override
	public void stop(Player player) {
		setActionDelay(player, 3);
	}

	public static int getNextMemory(Player player) {
		for (int nextMemory = 0; nextMemory < MEMORIES.length; nextMemory++) {
			if (player.getInventory().containsItem(MEMORIES[nextMemory], 1))
				return nextMemory;
		}
		return -1;
	}
	
	public static int getEnergyForMemory(int nextMemory) {
		return ENERGY[nextMemory >= 11 ? nextMemory - 11 : nextMemory];
	}

	private void checkAvailableMemory(Player player) {
		nextMemory = getNextMemory(player);
		setEnriched(nextMemory < 11);
	}

	/**
	 * @return the enriched
	 */
	public boolean isEnriched() {
	    return enriched;
	}

	/**
	 * @param enriched the enriched to set
	 */
	public void setEnriched(boolean enriched) {
	    this.enriched = enriched;
	}
}
