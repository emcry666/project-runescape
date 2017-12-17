package com.rs.game.player.content.revents;

import java.util.concurrent.TimeUnit;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public interface EventTimerTask {
	
	public int getTime();
	
	public TimeUnit getTimeUnit();
	
	public void initalizeTask();
	
}
