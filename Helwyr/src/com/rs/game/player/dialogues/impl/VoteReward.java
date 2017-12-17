package com.rs.game.player.dialogues.impl;

import com.rs.game.World;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.Utils;


/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public class VoteReward extends Dialogue {

	@Override
	public void start() {
		options("Choose a Reward", "x8 Squeal of Fortune Spins", "5M Coins", "Random Box", "Cancel");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(componentId) {
		case OPTION_1:
			player.getSquealOfFortune().setEarnedSpins(player.getSquealOfFortune().getEarnedSpins() + 8);
			player.getSquealOfFortune().sendSpinCounts();
			player.getInventory().deleteItem(20936, 1);
			processDonatorRoll();
			break;
		case OPTION_2:
			player.getMoneyPouch().addToMoneyPouch(5000000);
			player.getInventory().deleteItem(20936, 1);
			processDonatorRoll();
			end();
			break;
		case OPTION_3:
			if(player.getInventory().hasFreeSlots()) {
				player.getInventory().addItem(6199);
			} else {
				player.getBank().addItem(6199, 1, false);
			}
			player.getInventory().deleteItem(20936, 1);
			processDonatorRoll();
			end();
			break;
		case OPTION_4:
			end();
			break;
		}
	}

	private void processDonatorRoll() {
		int roll = Utils.random(1000);
		if(roll <= 25) {
			if(!player.isASuperDonator()) {
				player.setDonator(false);
				player.setSuperDonator(true);
				World.sendWorldMessage("<img=10><col=0000ff>" + player.getDisplayName() + " has just earned Super Dontor from voting! Remember to vote every 12 hours!");
			}
			
		} else if(roll <= 50) {
			if(!player.isADonator()) {
				player.setDonator(true);
				World.sendWorldMessage("<img=8><col=30AB0E>" + player.getDisplayName() + " has just earned Normal Dontor from voting! Remember to vote every 12 hours!");
			}
		}
	}

	@Override
	public void finish() {
	}

}
