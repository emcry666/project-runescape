package com.rs.game.player;


/**
 * This class is used for the mask used in player updating.
 * *Do not get this confused with BodyGlowColor*
 * 
 * @author K-Shan
 *
 */
public class BodyGlow {
	
	private int duration;
	private int[] colors;
	
	public BodyGlow(int duration, int[] colors) {
		this.setDuration(duration);
		this.colors = colors;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int[] getColors() {
		return colors;
	}
	
	public void setColor(int index, byte color) {
		this.colors[index] = color;
	}

}