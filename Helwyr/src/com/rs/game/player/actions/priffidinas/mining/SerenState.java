package com.rs.game.player.actions.priffidinas.mining;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public enum SerenState {

	FULL(92713, 92714), 
	
	HALF(92714, 92715), 
	
	THIRD(92715, 92716), 
	
	DEPLETED(92716, 92713)

	;

	private int oldObject;
	private int newObject;

	SerenState(int oldObject, int newObject) {
		this.oldObject = oldObject;
		this.newObject = newObject;
	}

	public int getOldObjectId() {
		return oldObject;
	}

	public int getNewObjectId() {
		return newObject;
	}

}
