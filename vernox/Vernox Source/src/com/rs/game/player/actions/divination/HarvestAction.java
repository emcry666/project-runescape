package com.rs.game.player.actions.divination;

import com.rs.game.Animation;
import com.rs.game.Graphics;
import com.rs.game.npc.NPC;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Action;
import com.rs.utils.Utils;

/**
 * 
 * @author Dylan || Mystic Wolf || Jul 14, 2016
 *
 */

public class HarvestAction extends Action {

    public enum Wisps
    { 
	//int npcId, int energyId, int memoryId, int level, double xp
	PALE_ENERGY(18150, 29313, 29384, 1, 1),
	FLICKERING_ENERGY(18151, 29314, 29385, 10, 2),
	BRIGHT_ENERGY(18153, 29315, 29386, 20, 3),
	GLOWING_ENERGY(18155, 29316, 29387, 30, 4),
	SPARKLING_ENERGY(18157, 29317, 29388, 40, 5),
	GLEAMING_ENERGY(18159, 29318, 29389, 50, 6),
	VIBRANT_ENERGY(18161, 29319, 29390, 60, 7),
	LUSTROUS_ENERGY(18163, 29320, 29391, 70, 8),
	BRILLIANT_ENERGY(18165, 29321, 29392, 80, 9),
	RADIANT_ENERGY(18167, 29322, 29393, 85, 10),
	LUMINOUS_ENERGY(18169, 29323, 29394, 90, 11),
	INCANDESCENT_ENERGY(18171, 29315, 29395, 95, 12);

	public int npcId;
	public int energyId;
	public int memoryId;
	public int level;
	public double xp;

	private Wisps(int npcId, int energyId, int memoryId, int level, double xp)
	{
	    this.npcId = npcId;
	    this.energyId = energyId;
	    this.memoryId = memoryId;
	    this.level = level;
	    this.xp = xp;
	}

	public int getLevel() {
	    return level;
	}
	
	public int getNpcId() {
	    return npcId;
	}
	public double getXP() {
	    return xp;
	}
	public int getId() {
	    return npcId;
	}

	public int getEnergyId() {
	    return energyId;
	}

	public int getMemoryId() {
	    return memoryId;
	}


    }



    private static final Animation HARVEST_ANIMATION = new Animation(21231);

    private Wisp wisp;
    private NPC wisps;
    private boolean enriched;

    public HarvestAction(Wisp wisp) {
	this.wisp = wisp;
	this.setEnriched(wisp.getDefinitions().getName().contains("Enriched"));
    }

    @Override
    public boolean start(Player player) {
	if(!check(player))
	    return false;
	setActionDelay(player, 2);
	player.setNextAnimation(HARVEST_ANIMATION);
	return true;
    }
    
    
    public HarvestAction(Wisp wisp, NPC wisps)
    {
	this.wisp = wisp;
	this.wisps = wisps;
    }

    @Override
    public boolean process(Player player) {
	return check(player);
    }

    @Override
    public int processWithDelay(Player player) { 
	    int gfxId = 4235;
	    for (Wisps w : Wisps.values())
	    {
		    if(player.getSkills().getLevel(Skills.DIVINATION) >= w.getLevel())
		    {
			player.setNextGraphics(new Graphics(gfxId));
			player.getInventory().addItem(w.getMemoryId(), 1);
			player.getSkills().addXp(Skills.DIVINATION, w.getXP());
			if (Utils.random(3) == 1)
			{
			    player.getInventory().addItem(w.getEnergyId(), Utils.random(1, 2));
			}
		    }
		    else
		    {
			player.sendMessage("You don't have the right level to do this.");
		}
	    }

	return 2;
    }

    @Override
    public void stop(Player player) {
	player.setNextAnimation(new Animation(21229));
    }


    public boolean check(Player player) {
	return wisp.getLifeTime() > 0;
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