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

public class VoiceOfSerenTask implements EventTimerTask {

	public VoiceOfSerenTask() {
		initalizeTask();
	}
	
	@Override
	public int getTime() {
		return 3;
	}

	@Override
	public TimeUnit getTimeUnit() {
		return TimeUnit.HOURS;
	}

	@Override
	public void initalizeTask() {
		GameEngine.getEngine().getScheduledExecutor().scheduleWithFixedDelay(new Runnable() {

			@Override
			public void run() {
				new QueueEvent(EventType.EXPERIENCE_EVENT, EventConstants.VOICE_OF_SEREN).startEvent();
			}

		}, getTime(), getTime(), getTimeUnit());
	}


}
