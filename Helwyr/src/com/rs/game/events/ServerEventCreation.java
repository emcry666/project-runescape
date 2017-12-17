package com.rs.game.events;

import com.rs.game.World;
import com.rs.game.player.Player;
import com.rs.utils.Utils;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public class ServerEventCreation implements ServerEvent {

	private String eventName;
	private Player player;
	private Events event;

	/**
	 * Constructor for <Player>, <Events>
	 * @param player
	 * @param event
	 */
	
	public ServerEventCreation(Player player, Events event) {
		this.player = player;
		this.event = event;
		this.eventName = Utils.formatString(event.name());
	}
	
	/**
	 * Constructor for <Events>
	 * @param event
	 */
	
	public ServerEventCreation(Events event) {
		this.event = event;
		this.eventName = Utils.formatString(event.name());
	}
	
	/**
	 * Checks and initalizes the <Event>
	 * @return
	 */
	
	@Override
	public boolean canStartEvent() {
		if(ServerEventManager.eventStarted(event))
			return false;
		startEvent();
		return true;
	}

	/**
	 * Initalizes the <Event>
	 * @return
	 */
	
	@Override
	public boolean startEvent() {
		if(!canStartEvent() || player == null)
			return false;
		ServerEventManager.handleOnGoingEvent(event);
		World.sendWorldMessage(getEventMessage());
		return true;
	}

	/**
	 * Ends the Event
	 */
	
	@Override
	public boolean endEvent() {
		if(ServerEventManager.endEvent(event))
			World.sendWorldMessage(getEventMessage());
		return true;
	}
	
	/**
	 * Returns the <Event> starting/ending message.
	 * @return
	 */
	
	public String getEventMessage() {
		boolean eventStarted = ServerEventManager.eventStarted(event);
		return "<img=5>[<col=ffffff><shad=0000fff>Server Event</shad></col>] - " + eventName + " has just " + (eventStarted ? "started for " + ServerEventManager.EVENT_TIME + "!" : "ended!");
	}

}
