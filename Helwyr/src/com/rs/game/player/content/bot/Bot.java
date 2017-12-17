package com.rs.game.player.content.bot;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.rs.game.ForceTalk;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.player.Player;
import com.rs.game.player.content.bot.action.BotActionHandler;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

/**
 * 
 * @author K-Shan
 *
 */
public class Bot extends Player implements Serializable {
	
	private static final long serialVersionUID = -4864898276631259474L;

	private transient BotPackets packets;
	private transient BotActionHandler botActionHandler;

	private Player controler;
	private transient static List<Bot> player_bots = new ArrayList<>();
	
	public static List<Bot> getBots() {
		return player_bots;
	}
	
	public Bot() {
		super(null);
	}
	
	/**
	 * Server Bots
	 * @param name
	 * @param password
	 * @param location
	 */
	public Bot(String name, String password, WorldTile location) {
		super(password, location); // New player instance
		this.username = name;
	}
	
	/**
	 * User Bots
	 * @param name
	 * @param password
	 * @param botOwner
	 * @param location
	 */
	
	public Bot(String name, String password, String botOwner, WorldTile location) {
		super(password, location); // New player instance
		this.username = name;
	}

	public Bot startup() {
		packets = new BotPackets(this); // Sets the "packets" to be sent to the client
		botActionHandler = new BotActionHandler();
		botActionHandler.setBot(this);
		super.init(null, getUsername(), "", 0, 0, 0, null, null); // Initializes player fields
		super.start(); // Sends initial startup stuff
		super.setBot(true); // Declares this player a bot.
		player_bots.add(this);
		//SerializableFilesManager.savePlayer(this); // Initial save.
		return this;
	}
	
	@Override
	public void processEntity() {
		super.processEntity();
	}
	
	public BotActionHandler getBotActionHandler() {
		return botActionHandler;
	}
	
	public BotPackets getFakePacketSender() {
		return packets;
	}
	
	public boolean isOnline() {
		return World.containsPlayer(getUsername());
	}
	
	@Override
	public void publicChat(String message) {
		String formatted = Utils.fixChatMessage(message);
		final Bot bot = this;
		setNextForceTalk(new ForceTalk(formatted));
		WorldTasksManager.schedule(new WorldTask() {

			@Override
			public void run() {
				stop();
				for(Player p : World.getLocalPlayers(bot))
					if(p != null) {
							p.sm(getDisplayName()+": " +(p.getInterfaceManager().hasRezizableScreen() ? "<col=52A8C4>" : "<col=0000FF>")+ formatted);
					}
			}
			
		});
	}
	
	/**
	 * Gets the controler.
	 * @return The controler.
	 */
	public Player getControler() {
		return controler;
	}

	/**
	 * Sets the controler.
	 * @param controler The controler to set.
	 */
	public void setControler(Player controler) {
		this.controler = controler;
	}
	
	public String getInfo() {
		return "[" + getUsername() + " - " + getPassword()+" - " + getLocation() + " - " + getBotOwner() + "]";
	}

}
