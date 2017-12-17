package com.rs.game.events;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public interface ServerEvent {
	
	/**
	 * Checks if other <Events> are active and will begin the event if the player can
	 * initalize the event.
	 * @return
	 */
	
	public boolean canStartEvent();
	
	/**
	 * Will start the event if @canStartEvent = true;
	 * @return
	 */
	
	public boolean startEvent();
	
	/**
	 * Ends the Server event
	 * @return
	 */
	
	public boolean endEvent();
	

}
