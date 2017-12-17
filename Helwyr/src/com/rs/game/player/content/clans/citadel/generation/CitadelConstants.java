package com.rs.game.player.content.clans.citadel.generation;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public enum CitadelConstants {

    FULL_CITADEL(488, 512),
    
    FULL_CITADEL_RATIO(488, 512, new int[] { 16, 16 }),

    ;

    private int rx, ry;
    public int[] ratio;

    public int getRx() {
	return rx;
    }

    public int getRy() {
	return ry;
    }

    CitadelConstants(int rx, int ry) {
	this.rx = rx;
	this.ry = ry;
    }

    CitadelConstants(int rx, int ry, int[] ratio) {
	this.rx = rx;
	this.ry = ry;
	this.ratio = ratio;
    }

}
