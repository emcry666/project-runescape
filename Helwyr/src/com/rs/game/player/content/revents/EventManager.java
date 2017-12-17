package com.rs.game.player.content.revents;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.rs.game.player.content.revents.impl.DropChanceTask;
import com.rs.game.player.content.revents.impl.DropIncreaseTask;
import com.rs.game.player.content.revents.impl.DungeoneeringTask;
import com.rs.game.player.content.revents.impl.ExperienceEventTask;
import com.rs.game.player.content.revents.impl.ExperienceEventWildernessTask;
import com.rs.game.player.content.revents.impl.MinigameTask;
import com.rs.game.player.content.revents.impl.MiscellaniaTask;
import com.rs.game.player.content.revents.impl.VoiceOfSerenTask;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public class EventManager implements  Serializable {

	private static final long serialVersionUID = 8700494964869210199L;

	private static Map<EventType, EventConstants> activeEvents = new HashMap<>(); 
	
	private static Map<EventType, EventTimerTask> handledEvents = new HashMap<>();
	
	
	/**
	 * Handled Events
	 * @initalizes each event
	 */
	
	static {
		
		handledEvents.put(EventType.EXPERIENCE_EVENT, new ExperienceEventTask());
		
		handledEvents.put(EventType.EXPERIENCE_EVENT_WILDERNESS, new ExperienceEventWildernessTask());
		
		handledEvents.put(EventType.DROP_INCREASE, new DropIncreaseTask());
		
		handledEvents.put(EventType.MINIGAME_EVENT, new MinigameTask());
		
		handledEvents.put(EventType.SKILL_EVENT, new DungeoneeringTask());
		
		handledEvents.put(EventType.SKILL_EVENT, new MiscellaniaTask());
		
		handledEvents.put(EventType.EXPERIENCE_EVENT, new VoiceOfSerenTask());
		
		handledEvents.put(EventType.DROP_INCREASE, new DropChanceTask());
		
	}
	
	/**
	 * Returns <Map> Elements @activeEvents
	 * @return
	 */
	public static Map<EventType, EventConstants> getActiveEvents() {
		return activeEvents;
	}
	
	/**
	 * Returns <Map> Elements @handledEvents
	 * @return
	 */
	public static Map<EventType, EventTimerTask> getHandledEvnets() {
		return handledEvents;
	}

	/**
	 * Adds @Event into <Map>
	 * @param event
	 * @return
	 */
	public static boolean addEvent(EventType event, EventConstants minigame) {
		if(eventStarted(event, minigame)) 
			return false;
		if(!handledEvents(event))
			return false;
		
		activeEvents.put(event, minigame);
		return true;
	}

	/**
	 * Removes @Event from <Map>
	 * @param event
	 * @return
	 */
	public static boolean removeEvent(EventType event, EventConstants minigame) {
		if(!eventStarted(event, minigame)) 
			return false;
		if(!handledEvents.containsKey(event))
			return false;
		
		activeEvents.remove(event, minigame);
		return true;
	}

	/**
	 * Checks if <Map> contains @Event
	 * @param event
	 * @return
	 */
	public static boolean eventStarted(EventType event, EventConstants minigame) {
		return activeEvents.containsKey(event) && activeEvents.containsValue(minigame);
	}
	
	/**
	 * Checks if <Map> contains @Event
	 * @param event
	 * @return
	 */
	public static boolean eventStarted(EventType event) {
		return activeEvents.containsKey(event);
	}
	
	/**
	 * Checks if <Map> contains @HandledEvent
	 * @param event
	 * @return
	 */
	public static boolean handledEvents(EventType event) {
		return handledEvents.containsKey(event);
	}

}
