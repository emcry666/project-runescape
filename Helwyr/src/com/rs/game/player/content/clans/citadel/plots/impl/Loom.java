package com.rs.game.player.content.clans.citadel.plots.impl;

import java.io.Serializable;

import com.rs.game.Animation;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Action;
import com.rs.game.player.content.clans.Clan;
import com.rs.game.player.content.clans.citadel.plots.Plot;
import com.rs.game.player.content.clans.citadel.plots.PlotList.Plots;
import com.rs.game.player.content.clans.citadel.plots.PlotStatus;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public class Loom extends Plot {

	
	private transient Animation PLAYER_ANIMATION = new Animation(5562);
	@SuppressWarnings("unused")
	private transient int originalId = 15335;//Untouched Id
	private transient int respawnDelay = 160;
	private transient WorldObject loom;

	public Loom(Clan clan) {
		super(clan);
	}
	
	private transient final Action action = new Action() {

		@Override
		public boolean start(Player player) {
			setActionDelay(player, 1);
			return true;
		}

		@Override
		public boolean process(Player player) {
			return checkClan(player);
		}
		
		public boolean checkClan(Player player) {
			return true;
		}

		@Override
		public int processWithDelay(final Player player) {
			player.setNextAnimationNoPriority(PLAYER_ANIMATION);
			player.getPackets().sendGameMessage("You begin to use the loom...");
			if(player.getX() == loom.getX() + 3) 
				player.getPackets().sendObjectAnimation(new WorldObject(getNextWorldObjectId(), 10, 0, player.getX() - 3, player.getY(), player.getPlane()), getNextObjectAnimation());
			 else 
				player.getPackets().sendObjectAnimation(new WorldObject(getNextWorldObjectId(), 10, 2, player.getX() + 1, player.getY(), player.getPlane()), getNextObjectAnimation());
			
			WorldTasksManager.schedule(new WorldTask() {
				@Override
				public void run() {
					long time = respawnDelay * 600;
					if(player.getX() == loom.getX() + 3) 
						World.spawnTemporaryObject(new WorldObject(getNextWorldObjectId(), 10, 0, player.getX() - 3, player.getY(), player.getPlane()), time * 600);
					 else 
						World.spawnTemporaryObject(new WorldObject(getNextWorldObjectId(), 10, 2, player.getX() + 1, player.getY(), player.getPlane()), time * 600);
					
					player.getSkills().addXp(Skills.CRAFTING, 170);
					player.lock(2);
				}
			},  7);
			return -1;
		}

		@Override
		public void stop(Player player) {
			switch (getPlotStatus()) {
			case STAGE_1:
				player.getClanManager().getClan().getPlotManager().get(Plots.LOOM).setStatus(PlotStatus.STAGE_2);
				break;
			case STAGE_2:
				player.getClanManager().getClan().getPlotManager().get(Plots.LOOM).setStatus(PlotStatus.STAGE_3);
				break;
			case STAGE_3:
				player.getClanManager().getClan().getPlotManager().get(Plots.LOOM).setStatus(PlotStatus.STAGE_4);
				break;
			case STAGE_4:
				player.getClanManager().getClan().getPlotManager().get(Plots.LOOM).setStatus(PlotStatus.STAGE_1);
				break;
			default:
				break;
			}
			
		}
		
	};

	@Override
	public int getNextWorldObjectId() {
		switch (getPlotStatus()) {
		case STAGE_1:
			return 15338;
		case STAGE_2:
			return 15339;
		case STAGE_3:
			return 15340;
		case STAGE_4:
			return 15341;
		default:
			break;
		
		}
		return -1;
	}

	@Override
	public Animation getNextObjectAnimation() {
		switch (getPlotStatus()) {
		case STAGE_1:
			return new Animation(5684);
		case STAGE_2:
			return new Animation(5678);
		case STAGE_3:
			return new Animation(5621);
		case STAGE_4:
			return new Animation(5600);
		default:
			break;
			
		}
		return new Animation(-1);
	}
	
	@Override
	public Action getAction(WorldObject loom) {
		this.loom = loom;
		return action;
	}
	

	public PlotStatus getPlotStatus() {
		return this.clan.getPlotManager().get(Plots.LOOM).getStatus();
	}

	public void setPlotStatus(PlotStatus plotStatus) {
		this.clan.getPlotManager().get(Plots.LOOM).setStatus(plotStatus);
	}

}