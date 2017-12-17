package com.rs.game.player.content.repute;

import java.io.Serializable;

import com.rs.game.World;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.utils.Utils;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public class ReputeManager implements Serializable {

	private static final long serialVersionUID = -9160476209348308631L;

	private Player player;
	private int reputedTimes;
	private boolean hasReputed;

	Item[] lowItems = new Item[] {

			new Item(18831, Utils.random(100, 200)),

			new Item(537, Utils.random(100)),

			new Item(535, Utils.random(25)),

			new Item(6739, Utils.random(1, 2)),

			new Item(452, Utils.random(200, 250)),

			new Item(450, Utils.random(100, 200)),

			new Item(1514, Utils.random(150, 250)),

			new Item(1518, Utils.random(250, 500)),

			new Item(1620, Utils.random(150, 200)),

			new Item(1632, Utils.random(100, 200)),

			new Item(995, Utils.random(35000000, 75000000))

	},

			commonItems = new Item[] {


					new Item(13744, 1),

					new Item(13742, 1),

					new Item(11696, 1),

					new Item(11704, 1),

					new Item(11724, 1),

					new Item(11726, 1),

					new Item(11728, 1),

					new Item(21777, 1),

					new Item(11702, 1),

					new Item(11718, 1),

					new Item(11720, 1),

					new Item(11722, 1),

					new Item(13450, 1),

					new Item(11700, 1),

					new Item(11698, 1),

					new Item(23681, 1),


	},

			rareItems = new Item[] {

					new Item(20135, 1),

					new Item(20139, 1),

					new Item(20143, 1),

					/*new Item(29995, 1),

					new Item(29994, 1),

					new Item(29993, 1),*/

					new Item(13742, 1),

					new Item(13740, 1),

					new Item(20159, 1),

					new Item(20163, 1),

					new Item(20167, 1),

					new Item(20147, 1),

					new Item(20151, 1),

					new Item(20155, 1),
					
					new Item(14484, 1)




	},

			veryRare = new Item[] {

					new Item(1050, 1),

					new Item(1053, 1),

					new Item(1055, 1),
					
					new Item(1057, 1),

	},
			
			godLikeRare = new Item[] {
				
					new Item(1048, 1),
					
					new Item(1046, 1),
					
					new Item(1044, 1),
					
					new Item(1042, 1), 
					
					new Item(1040, 1),
					
					new Item(1038, 1),	
					
			};


	public ReputeManager(Player player) {
		this.player = player;
	}


	/**
	 * Initalizes repute for <Player>
	 * @return
	 */
	public boolean repute() {
		if(!checkPlayer())
			return false;
		if(getReputedTimes() == 5)
			return false;
		player.getSkills().reputeSkills();
		setReputedTimes(getReputedTimes() + 1);
		World.sendWorldMessage("<img=5><col=ffffff><shad=1DDBDE>" + player.getDisplayName() + " has just reputed, and have reputed " + getReputedTimes() + " " + (getReputedTimes() == 1 ? "time" : "times") + "!", false);//TODO
		giveReward();
		if(!hasReputed)
			setHasReputed(true);
		return true;
	}


	/**
	 * Checks if <Player> is elg. to repute.
	 * @return
	 */
	private boolean checkPlayer() {
		if(player.getRights() == 2)
			return true;
		if(player.getEquipment().isWearingItems()) {
			player.getPackets().sendGameMessage("You must remove all of your equipment before reputing.");
			return false;
		}
		for (int i = 0; i < 25; i++) {
			if(player.getSkills().getLevel(i) < 99) {
				player.getPackets().sendGameMessage("You must have 99 in all skills in order to Repute.");
				return false;
			}
		}
		return true;
	}

	/**
	 * Gives <Player> their reward
	 */
	public void giveReward() {
		int roll = Utils.random(1000);
		Item reward = null;
		
		/**
		 * Rare Reward
		 */
		
		if(roll <= 12) {
			reward = godLikeRare[Utils.random(godLikeRare.length)];
			if(player.getInventory().getFreeSlots() < 1) {
				player.getBank().addItem(reward.getId(), reward.getAmount(), true);
			} else {
				player.getInventory().addItem(reward.getId(), reward.getAmount());
			}
			World.sendWorldMessage("<img=5><col=ffffff><shad=1DDBDE>" + player.getDisplayName() + " has been rewarded with a " + reward.getName() + " for reputing!", false);
			player.getPackets().sendGameMessage("<col=ff0000>You have been given x" + reward.getAmount() + " of " + reward.getName());
			return;
			
		} else if(roll <= 50) {
			reward = veryRare[Utils.random(veryRare.length)];
			if(player.getInventory().getFreeSlots() < 1) {
				player.getBank().addItem(reward.getId(), reward.getAmount(), true);
			} else {
				player.getInventory().addItem(reward.getId(), reward.getAmount());
			}
			World.sendWorldMessage("<img=5><col=ffffff><shad=1DDBDE>" + player.getDisplayName() + " has been rewarded with a " + reward.getName() + " for reputing!", false);
			player.getPackets().sendGameMessage("<col=ff0000>You have been given x" + reward.getAmount() + " of " + reward.getName());
			return;
			
			/**
			 * Donators
			 */
			
		} else if(roll <= 125 && !player.isASuperDonator()) {
			player.setSuperDonator(true);
			World.sendWorldMessage("<img=5><col=ffffff><shad=1DDBDE>" + player.getDisplayName() + " has been rewarded with Super Donator for reputing!", false);
			player.getPackets().sendGameMessage("<col=ff0000>You have been Super Donator for Reputing");
			return;

		} else if(roll <= 205 && !player.isDonator()) {
			player.setDonator(true);
			World.sendWorldMessage("<img=5><col=ffffff><shad=1DDBDE>" + player.getDisplayName() + " has been rewarded with Regular Donator for reputing!", false);
			player.getPackets().sendGameMessage("<col=ff0000>You have been Regular Donator for Reputing");
			return;
			
			/*
			 * Rare Rewards
			 */
			
			
		} else if(roll <= 275) {
			reward = rareItems[Utils.random(rareItems.length)];
			if(player.getInventory().getFreeSlots() < 2) {
				player.getBank().addItem(reward.getId(), reward.getAmount(), true);
			} else {
				
				player.getInventory().addItem(reward.getId(), reward.getAmount());
			}
			World.sendWorldMessage("<img=5><col=ffffff><shad=1DDBDE>" + player.getDisplayName() + " has been rewarded with a " + reward.getName() + " for reputing!", false);
			player.getPackets().sendGameMessage("<col=ff0000>You have been given x" + reward.getAmount() + " of " + reward.getName() + ".");
			return;

			/**
			 * Common Rewards
			 */
			
		} else if(roll <= 750) {
			reward = commonItems[Utils.random(commonItems.length)];
			if(player.getInventory().getFreeSlots() < 2) {
				player.getBank().addItem(reward.getId(), reward.getAmount(), true);
			} else {
				player.getInventory().addItem(reward.getId(), reward.getAmount());
			}
			World.sendWorldMessage("<img=5><col=ffffff><shad=1DDBDE>" + player.getDisplayName() + " has been rewarded with a " + reward.getName() + " for reputing!", false);
			player.getPackets().sendGameMessage("<col=ff0000>You have been given x" + reward.getAmount() + " of " + reward.getName() + ".");
			return;

			/**
			 * Low Key Rewards
			 */
			
		} else {
			for (int i = 0; i < lowItems.length; i++) {
				reward = lowItems[i];
				if(player.getInventory().getFreeSlots() < 11) {
					player.getBank().addItem(reward.getId(), reward.getAmount(), true);
				} else {
					player.getInventory().addItem(reward.getId(), reward.getAmount());
				}
				player.getPackets().sendGameMessage("You have been given x" + reward.getAmount() + " of " + reward.getName());
			}
		}
	}

	public double getRates() {
		double rate = 1;
		switch(getReputedTimes()) {
		case 1:
			rate = 1.25;
			break;
		case 2:
			rate = 1.50;
			break;
		case 3:
			rate = 1.75;
			break;
		case 4:
			rate = 2.0;
			break;
		case 5:
			rate = 2.25;
			break;
		}
		return rate;
	}


	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}


	public int getReputedTimes() {
		return reputedTimes;
	}


	public void setReputedTimes(int reputedTimes) {
		this.reputedTimes = reputedTimes;
	}


	public boolean hasReputed() {
		return hasReputed;
	}


	public void setHasReputed(boolean hasReputed) {
		this.hasReputed = hasReputed;
	}

}
