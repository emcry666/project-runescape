package com.rs.game.player.actions.divination;

import com.rs.game.Animation;
import com.rs.game.Graphics;
import com.rs.game.npc.NPC;
import com.rs.game.player.Player;
import com.rs.game.player.Profession;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Action;
import com.rs.utils.Utils;

/**
 * 
 * @author Trenton
 * 
 */
public class DivinationHarvest extends Action {

    private Wisp wisp;
    private WispInfo info;

    public DivinationHarvest(Player player, Object[] args) {
	this.wisp = (Wisp) args[0];
	this.info = (WispInfo) args[1];
    }

    public static boolean checkAll(Player player, WispInfo info) {
    	if(player.getProfession().getLevel(Profession.DIVINATION) < info.getLevel()) {
    		
    	}
	if (player.getProfession().getLevel(Profession.DIVINATION) < info.getLevel()) {
	    player.getPackets().sendGameMessage(
		    "You need a Divination level of " + info.getLevel() + " to harvest from this spring.");
	    return false;
	}
	if (player.getInventory().getFreeSlots() == 0) {
	    player.getPackets().sendGameMessage("You don't have enough space in your inventory.");
	    return false;
	}
	return true;
    }

    public NPC getWisp() {
	return wisp;
    }

    public WispInfo getInfo() {
	return info;
    }

    @Override
    public boolean start(Player player) {
	if (!checkAll(player, info)) {
	    return false;
	}
	player.setNextAnimation(new Animation(21231));
	player.faceEntity(wisp);
	return true;
    }

    @Override
    public boolean process(Player player) {
	if (wisp == null || wisp.isUsedUp())
	    return false;
	if (!checkAll(player, info)) {
	    return false;
	}
	return true;
    }

    @Override
    public void stop(Player player) {
	player.setNextAnimation(new Animation(21229));
    }

    @Override
    public int processWithDelay(Player player) {
	int energyAmt = 1;
	if (player.getProfession().getLevel(Profession.DIVINATION) > 54)
	    energyAmt = 2;
	if (player.getProfession().getLevel(Profession.DIVINATION) > 74)
	    energyAmt = 3;
	player.getInventory().addItem(info.getEnergyId(), energyAmt);
	player.getProfession().addExperience(Profession.DIVINATION, Utils.random(1, 4));
	int chance = Utils.random(2);
	if (Utils.random(30) >= 10) {
	    if (info != WispInfo.PALE && (Utils.random(30) <= 5 + (player.getProfession().getLevel(Profession.DIVINATION) - info.getLevel()))) {
		player.setNextGraphics(new Graphics(4236));
		player.getInventory().addItem(info.getEnrichedMemoryId(), 1);
	    } else {
		player.setNextGraphics(new Graphics(4235));
		if (chance != 2)
		    player.getInventory().addItem(info.getMemoryId(), 1);
	    }
	    player.incrementCount(info.name()+" memories gathered");
	} else {
	}
	return 2;
    }

}
