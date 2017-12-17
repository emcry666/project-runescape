package com.rs.game.player.content.clans.citadel.plots;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.rs.game.player.content.clans.Clan;
import com.rs.game.player.content.clans.citadel.plots.PlotList.Plots;
import com.rs.game.player.content.clans.citadel.plots.impl.Loom;

public class PlotManager implements Serializable  {
	
	private static final long serialVersionUID = -7373338795410190285L;
	
	
	private List<Plot> plots = new ArrayList<Plot>(Plots.values().length);
	private Clan clan;
	
	public PlotManager(Clan clan) {
		this.clan = clan;
		init();
	}
	
	public void add(Plots plots, Plot plot) {
		getPlots().add(plots.getIndex(), plot);
	}

	public Plot get(Plots plots) {
		return getPlots().get(plots.getIndex());
	}

	public PlotManager init() {
		add(Plots.LOOM, new Loom(clan));
		return this;
	}
	
	
	public Clan getClan() {
		return clan;
	}
	
	public void setClan(Clan clan) {
		this.clan = clan;
	}

	public List<Plot> getPlots() {
		return plots;
	}

	public void setPlots(List<Plot> plots) {
		this.plots = plots;
	}
	
}
