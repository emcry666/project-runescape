package com.rs.game.player.content.revents.impl;

import java.util.concurrent.TimeUnit;

import com.rs.engine.GameEngine;
import com.rs.game.player.content.revents.EventConstants;
import com.rs.game.player.content.revents.EventTimerTask;
import com.rs.game.player.content.revents.EventType;
import com.rs.game.player.content.revents.QueueEvent;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public class DropIncreaseTask implements EventTimerTask {

	public DropIncreaseTask() {
		initalizeTask();
	}
	
	@Override
	public int getTime() {
		return 390;
	}

	@Override
	public TimeUnit getTimeUnit() {
		return TimeUnit.MINUTES;
	}

	@Override
	public void initalizeTask() {
		GameEngine.slowExecutor.scheduleWithFixedDelay(new Runnable() {

			@Override
			public void run() {
				new QueueEvent(EventType.DROP_INCREASE, EventConstants.DROP_CHANCE).startEvent();
			}

		}, getTime(), getTime(), getTimeUnit());
	}

}
