package com.rs.game.player.content.revents.impl;

import java.util.concurrent.TimeUnit;

import com.rs.engine.GameEngine;
import com.rs.game.player.content.revents.EventTimerTask;
import com.rs.game.player.content.revents.EventType;
import com.rs.game.player.content.revents.QueueEvent;

public class ExperienceEventWildernessTask implements EventTimerTask {

	public ExperienceEventWildernessTask() {
		initalizeTask();
	}
	
	@Override
	public int getTime() {
		return 35;
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
				new QueueEvent(EventType.EXPERIENCE_EVENT_WILDERNESS).startEvent();
				
			}

		}, getTime(), getTime(), getTimeUnit());
	}


}
