package com.rs.game.player.content.revents;

import java.util.concurrent.TimeUnit;

import com.rs.cache.loaders.Configs;
import com.rs.engine.GameEngine;
import com.rs.game.World;
import com.rs.game.player.Player;
import com.rs.utils.Utils;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public class QueueEvent implements Event {

	public EventType event;
	public EventConstants minigame;

	public QueueEvent(EventType event) {
		this.event = event;
	}

	public QueueEvent(EventType event, EventConstants minigame) {
		this.event = event;
		this.minigame = minigame;
	}

	@Override
	public String getEventName() {
		return Utils.formatString(event.name());
	}

	@Override
	public void startEvent() {
		if(EventManager.addEvent(event, minigame)) {
			for (Player world : World.getPlayers()) {
				if(minigame == EventConstants.VOICE_OF_SEREN) {
					world.getPackets().sendGameMessage("<img=6><col=E723FC>Voice of Seren has been activated for " + event.getTime() + " minutes while at Priffidinas!");
				} else {
					if(minigame == null)
						world.getPackets().sendGameMessage("<img=5><col=DE9210>" + getEventName() + " has just started and will last for " + event.getTime() + " minutes!");
					else 
						world.getPackets().sendGameMessage("<img=5><col=DE9210>" + getEventName() + " has just started for " + Utils.formatString(minigame.name()) + " and will last for " + event.getTime() + " minutes!");
				}
			}
		}
		GameEngine.slowExecutor.schedule(new Runnable() {
			@Override
			public void run() {
				endEvent();
			}

		}, event.getTime(), (Configs.DEVELOPER_WORLD ? TimeUnit.SECONDS : TimeUnit.MINUTES));
	}

	@Override
	public void endEvent() {
		for (Player world : World.getPlayers()) {
			if(minigame == null)
				world.getPackets().sendGameMessage("<img=5><col=" + (minigame == EventConstants.VOICE_OF_SEREN ? "E723FC" : "DE9210>") + getEventName() + " has just ended!");
			else 
				world.getPackets().sendGameMessage("<img=5><col=DE9210>" + getEventName() + " for " + Utils.formatString(minigame.name()) + " has just ended!");
		}
		EventManager.removeEvent(event, minigame);
	}

}
