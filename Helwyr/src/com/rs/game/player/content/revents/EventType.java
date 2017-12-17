package com.rs.game.player.content.revents;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public enum EventType {

	EXPERIENCE_EVENT(15), 
	
	EXPERIENCE_EVENT_WILDERNESS(30),
	
	BOSS_EVENT(20), 
	
	MINIGAME_EVENT(35),
	
	DAILY(25), 
	
	DROP_INCREASE(20),
	
	SKILL_EVENT(25),
	
	;

	public int time;

	EventType(int time) {
		this.time = time;
	}

	public int getTime() {
		return time;
	}

}
