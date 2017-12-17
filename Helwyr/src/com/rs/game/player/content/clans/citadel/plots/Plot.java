package com.rs.game.player.content.clans.citadel.plots;

import java.io.Serializable;

import com.rs.game.Animation;
import com.rs.game.WorldObject;
import com.rs.game.player.actions.Action;
import com.rs.game.player.content.clans.Clan;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public abstract class Plot implements Serializable {

	private static final long serialVersionUID = 7931577698166571513L;


	protected Clan clan;
	protected PlotStatus status = PlotStatus.STAGE_1;
	
	public abstract int getNextWorldObjectId();
	
	public abstract Animation getNextObjectAnimation();
	
	public abstract Action getAction(WorldObject object);

	public Plot(Clan clan) {
		this.clan = clan;
	}
	
	public Clan getClan() {
		return clan;
	}

	public void setClan(Clan clan) {
		this.clan = clan;
	}

	public PlotStatus getStatus() {
		return status;
	}

	public void setStatus(PlotStatus status) {
		this.status = status;
	}


}
