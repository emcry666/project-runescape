package com.rs.game.player.content.revents.impl;

import java.util.concurrent.TimeUnit;

import com.rs.engine.GameEngine;
import com.rs.game.player.content.revents.EventConstants;
import com.rs.game.player.content.revents.EventTimerTask;
import com.rs.game.player.content.revents.EventType;
import com.rs.game.player.content.revents.QueueEvent;

public class MinigameTask implements EventTimerTask {

	public MinigameTask() {
		initalizeTask();
	}
	
	@Override
	public int getTime() {
		return 4;
	}

	@Override
	public TimeUnit getTimeUnit() {
		return TimeUnit.HOURS;
	}

	@Override
	public void initalizeTask() {
		GameEngine.getEngine().getScheduledExecutor().scheduleAtFixedRate(new Runnable() {

			@Override
			public void run() {
				new QueueEvent(EventType.MINIGAME_EVENT, EventConstants.values()[1]).startEvent();
			}
			
		}, getTime(), getTime(), getTimeUnit());
	}

}
