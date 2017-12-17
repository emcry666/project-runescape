package com.rs.game.player.actions.priffidinas.mining;

import com.rs.game.Animation;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.mining.MiningBase;
import com.rs.game.player.actions.mining.Mining.RockDefinitions;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public class SerenStones extends MiningBase {

	public SerenState state;
	public WorldObject rock;
	public int randomOreTime = 160;

	public SerenStones(WorldObject object) {
		this.rock = object;
	}

	@Override
	public boolean start(Player player) {
		switch(rock.getId()) {
		case 92713:
			state = SerenState.FULL;
			break;
		case 92714:
			state = SerenState.HALF;
			break;
		case 92715:
			state = SerenState.THIRD;
			break;
		case 92716:
			state = SerenState.DEPLETED;
			break;
		default:
			state = SerenState.FULL;
			break;
		}
		if (!checkAll(player))
			return false;
		player.getPackets().sendGameMessage(
				"You swing your pickaxe at the rock.", true);
		setActionDelay(player, getMiningDelay(player));
		return true;
	}

	private int getMiningDelay(Player player) {
		int summoningBonus = 0;
		int mineTimer = 0;
		if (player.getFamiliar() != null) {
			if (player.getFamiliar().getId() == 7342
					|| player.getFamiliar().getId() == 7342)
				summoningBonus += 10;
			else if (player.getFamiliar().getId() == 6832
					|| player.getFamiliar().getId() == 6831)
				summoningBonus += 1;
		}
		mineTimer = 160
				- (player.getSkills().getLevel(Skills.MINING) + summoningBonus)
				- Utils.getRandom(pickaxeTime);
		if (mineTimer < 1 + randomOreTime)
			mineTimer = 1 + Utils.getRandom(randomOreTime);
		mineTimer /= player.getAuraManager().getMininingAccurayMultiplier();
		return mineTimer;
	}

	private boolean checkAll(Player player) {
		if (!hasPickaxe(player)) {
			player.getPackets().sendGameMessage(
					"You need a pickaxe to mine this rock.");
			return false;
		}
		if (!setPickaxe(player)) {
			player.getPackets().sendGameMessage(
					"You dont have the required level to use this pickaxe.");
			return false;
		}
		if (!hasMiningLevel(player))
			return false;
		if (!player.getInventory().hasFreeSlots()) {
			player.getPackets().sendGameMessage(
					"Not enough space in your inventory.");
			return false;
		}
		return true;
	}

	private boolean hasMiningLevel(Player player) {
		if (89 > player.getSkills().getLevel(Skills.MINING)) {
			player.getPackets().sendGameMessage("You need a mining level of 89 to mine this rock.");
			return false;
		}
		return true;
	}

	@Override
	public boolean process(Player player) {
		player.setNextAnimation(new Animation(emoteId));
		addOre(player);
		return checkAll(player);
	}

	@Override
	public int processWithDelay(Player player) {
		player.lock(3);
		WorldTasksManager.schedule(new WorldTask() {

			@Override
			public void run() {
				WorldObject transform = new WorldObject(state.getNewObjectId(), 10, 0, rock.getX(), rock.getY(), rock.getPlane());
				World.spawnTemporaryObject(new WorldObject(transform), randomOreTime * 600);
			}

		}, randomOreTime / 4);
		return -1;
	}

	private void addOre(Player player) {
		int oreTime = 20;
		int weaponId = player.getEquipment().getWeaponId();
		if(weaponId == 20786 || player.getInventory().containsItem(20786))
			oreTime -= 13;
		else if(weaponId == 13661 || player.getInventory().containsItem(13661))
			oreTime -= 11;
		else if(weaponId == 15259 || player.getInventory().containsItem(15259))
			oreTime -= 8;
		else if(weaponId == 1275 || player.getInventory().containsItem(1275))
			oreTime -= 6;
		if(Utils.random(oreTime) == 0) {
			player.getInventory().addItem(32262, 1);
			player.getSkills().addXp(Skills.MINING, 87.3);
		}
	}

	@Override
	public void stop(Player player) {
		setActionDelay(player, 3);
	}


}
