package com.rs.game.player.content.land;

import com.rs.game.WorldTile;
import com.rs.utils.Utils;

public enum Land {
	
	ENTRANA(2147000000, 1124000000, "Entrana", new WorldTile(2827, 3344)),
	
	
	;
	
	public int cost;
	public int sellPrice;
	public String landName;
	public WorldTile location;
	
	Land(int cost, int sellPrice) {
		this.cost = cost;
		this.sellPrice = sellPrice;
	}
	
	Land(int cost, int sellPrice, String landName) {
		this.cost = cost;
		this.sellPrice = sellPrice;
		this.landName = landName;
	}
	
	Land(int cost, int sellPrice, String landName, WorldTile location) {
		this.cost = cost;
		this.sellPrice = sellPrice;
		this.landName = landName;
		this.location = location;
	}
	
	public int getCost() {
		return cost;
	}
	
	public int getSellPrice() {
		return sellPrice;
	}

	public String getLandName() {
		return landName;
	}
	
	public String getFormattedLandName() {
		return Utils.formatString(landName);
	}
	
	public WorldTile getLocation() {
		return location;
	}
}
