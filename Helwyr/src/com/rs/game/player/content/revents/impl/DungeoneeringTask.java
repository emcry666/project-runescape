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

public class DungeoneeringTask implements EventTimerTask {

	public DungeoneeringTask() {
		initalizeTask();
	}
	
	@Override
	public int getTime() {
		return 1;
	}

	@Override
	public TimeUnit getTimeUnit() {
		return TimeUnit.HOURS;
	}

	@Override
	public void initalizeTask() {
		GameEngine.slowExecutor.scheduleWithFixedDelay(new Runnable() {

			@Override
			public void run() {
				new QueueEvent(EventType.SKILL_EVENT, EventConstants.DUNGEONEERING).startEvent();
			}

		}, getTime(), getTime(), getTimeUnit());
	}


}
