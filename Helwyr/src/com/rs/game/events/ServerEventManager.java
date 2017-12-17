package com.rs.game.events;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import com.rs.engine.GameEngine;
import com.rs.game.player.Player;
import com.rs.utils.Utils;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public class ServerEventManager {

	/**
	 * Represents how long each server event last for
	 */
	
	public static final int EVENT_TIME = 1;
	
	/**
	 * Represents the Time Unit for Server Managers
	 */
	
	public static final TimeUnit TIME_UNIT = TimeUnit.HOURS;
	
	/**
	 * Collection for the events that are being handled
	 */
	
	public static HashMap<Events, ServerEventCreation> events = new HashMap<>();
	
	/**
	 * Returns @events
	 */
	public static HashMap<Events, ServerEventCreation> getEvents() {
		return events;
	}
	
	/**
	 * Checks if <Events> contains @param <Event>
	 * @param event
	 * @return
	 */
	public static boolean eventStarted(Events event) {
		return events.containsKey(event);
	}
	
	/**
	 * Initalizes the current event
	 * @return
	 */
	public static boolean startEvent(Player player, Events event) {
		String eventName = Utils.formatString(event.name());
		if(events.containsKey(event)) {
			player.output(eventName + " is currently already active!");
			return false;
		}
		new ServerEventCreation(player, event).canStartEvent();
		return true;
	}
	
	/**
	 * Initalizes the @task for ending the <Event>
	 * @param event
	 */
	
	public static void handleOnGoingEvent(Events event) {
		GameEngine.slowExecutor.schedule(new Runnable() {
			@Override
			public void run() {
				new ServerEventCreation(event).endEvent();
			}
		}, ServerEventManager.EVENT_TIME, ServerEventManager.TIME_UNIT);
	}
	
	/**
	 * Ends the current @param <Events>
	 * @param event
	 * @return
	 */
	public static boolean endEvent(Events event) {
		if(!events.containsKey(event))
			return false;
		events.remove(event);
		return true;
	}
	
	
}
