package com.rs.game.player.content.clans.citadel.generation;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public enum PlotConstants {

	MINING_PLOT(490, 510),

	KILN_PLOT(-1, -1),

	SUMMONING_PLOT(-1, -1),

	COOKING_PLOT(-1, -1),

	FURNACE_PLOT(508, 510),

	LOOM_PLOT(508, 506),

	WOODCUTTING_PLOT(490, 506),

	;

	public int rx, ry;

	public int getRx() {
		return rx;
	}

	public int getRy() {
		return ry;
	}

	PlotConstants(int rx, int ry) {
		this.rx = rx;
		this.ry = ry;
		//ratio = 1,2;
	}

}
