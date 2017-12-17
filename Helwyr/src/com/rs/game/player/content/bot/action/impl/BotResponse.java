package com.rs.game.player.content.bot.action.impl;

import com.rs.cores.GameTick;
import com.rs.game.player.content.bot.action.BotAction;

/**
 * 
 * @author K-Shan
 *
 */
public class BotResponse extends BotAction {
	
	String response;

	@Override
	public GameTick getGameTick() {
		
		response = (String) data[0];
		
		return new GameTick(1.875) {

			@Override
			public void run() {
				bot.publicChat(response);
				stopAction();
			}
			
		};
	}

	@Override
	public String getActionType() {
		return "RESPONSE";
	}

}
