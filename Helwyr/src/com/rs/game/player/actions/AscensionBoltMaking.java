package com.rs.game.player.actions;

import com.rs.game.Animation;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public class AscensionBoltMaking extends Action {

	public int ticks;
	
	@Override
	public boolean start(Player player) {
		return checkAll(player);
	}

	public boolean checkAll(Player player) {
		if(player.getSkills().getLevel(Skills.FLETCHING) < 90) {
			player.getPackets().sendGameMessage("You need a level of 90 fletching to fletch Ascension Bolts.");
			return false;
		}
		if(player.getInventory().getAmountOf(28436) < 1) {
			player.getPackets().sendGameMessage("You do not have any Ascension Shards to create Ascension Bolts.");
			return false;
		}
		if(player.getInventory().getAmountOf(28436) < 11) {
			player.getPackets().sendGameMessage("You need 10 ascension shards to create 10 Ascension Bolts.");
			return false;
		}
		return true;
	}

	@Override
	public boolean process(Player player) {
		return checkAll(player);
	}

	@Override
	public int processWithDelay(Player player) {
		ticks++;
		player.setNextAnimation(new Animation(2717));
		WorldTasksManager.schedule(new WorldTask() {

			@Override
			public void run() {
				if(checkAll(player)) {
					int bonus = 1;
					if (player.getInventory().containsItem(14103, 1) || player.getEquipment().getWeaponId() == 14103)
						bonus *= 2;
					else if (player.getInventory().containsItem(14111, 1) || player.getEquipment().getWeaponId() == 14111)
						bonus *= 1.75;
					final double totalXp = (20.0 + bonus);
					player.getSkills().addXp(Skills.FLETCHING, totalXp);
					player.getInventory().deleteItem(28436, 10);
					player.getInventory().addItem(28465, 10);
				}
			}

		}, 4);
		if(ticks > 14)
			player.stopAll();
		return 4;
	}

	@Override
	public void stop(Player player) {
		setActionDelay(player, -1);
	}

}
