package com.rs.game.player.content.bot.action;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

import com.rs.cores.GameTick;
import com.rs.game.Animation;
import com.rs.game.World;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.actions.PlayerFollow;
import com.rs.game.player.content.bot.Bot;
import com.rs.game.player.content.bot.BotList;
import com.rs.game.player.pathing.RouteEvent;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Logger;
import com.rs.utils.Utils;

/**
 * 
 * @author K-Shan
 *
 */
public class BotActionHandler {

	/**
	 * Nothing is going to be saved
	 */
	private transient BotAction botAction;
	private transient Bot bot;
	private transient GameTick currentTick;
	public transient Player p2 = null;

	public void handleAction(Object actionType, Object... extras) {
		if(botAction != null)
			stopAction();
		botAction = (BotAction) (actionType instanceof BotAction ? actionType : getAction(actionType));
		if(botAction == null)
			return;
		botAction.bot = bot;
		botAction.data = extras;
		botAction.startAction();
	}

	public void stopAction() {
		if(botAction == null)
			return;
		botAction.setResponding(false);
		getCurrentTick().stop();
		botAction = null;
	}

	public void setBot(Bot bot) {
		this.bot = bot;
	}

	public Bot getBot() {
		return bot;
	}

	/**
	 * Sends an action response to the player.
	 * @param player
	 * @param messageReceived
	 */
	public void sendResponse(final Player player, final String messageReceived) {
		try {
			@SuppressWarnings("resource")
			BufferedReader r = new BufferedReader(new FileReader(new File("data/botResponse.txt")));
			while (true) {
				String line = r.readLine();
				if (line == null)
					break;
				if (line.startsWith("//") || line.equals(""))
					continue;
				String[] splitArray;
				splitArray = line.split(" - ");
				final String actionType = splitArray[1];
				String playerInput = splitArray[2];
				String[] playerInputArray = playerInput.split("- ");
				String botResponse = splitArray[splitArray.length > 3 ? 3 : 2]; // basically makes the player input the bot output
				final String[] botResponseArray = botResponse.split("- "); // splits up every response of the bot into individual strings
				for(int i = 0; i < playerInputArray.length; i++) {
					if(replace(player, messageReceived).toLowerCase().equals(actionType.equals("ATTACK_NPC") ? replaceWithMessageReceived(playerInputArray[i], messageReceived) : 
						replace(player, playerInputArray[i]).toLowerCase())) {
						final String replaceFrom = playerInputArray[i];
						final String replaceWith = actionType.equals("ATTACK_NPC") ? replaceWithMessageReceived(playerInputArray[i], messageReceived) : "";
						for(Player p : World.getLocalPlayers(player)) {
							if(p != null) {
								if(p.isBot()) {
									for(final Bot bot : BotList.getBots()) {
										if(bot != null) {
											if(bot.getUsername().equalsIgnoreCase(p.getUsername())) {
												String response = "";
												for(int j = 0; j < botResponseArray.length; j++)
													response = botResponseArray[(Utils.random(botResponseArray.length))];
												response = bot.getBotActionHandler().replace(bot, response);
												sendBotResponse(bot, response);
												if(bot.getBotActionHandler().getCurrentBotAction() == null)
													bot.getBotActionHandler().handleAction(actionType,
															actionType.equals("ATTACK_NPC") ? new Object[] { 
																	replaceFrom, replaceWith } : new Object[] { response });
												return;
											}
										}
									}
								}
							}
						}
					}
				}
			}	
			r.close();
		} catch(Throwable e) {
			e.printStackTrace();
		}
	}

	private void sendBotResponse(final Bot bot, final String response) {
		WorldTasksManager.schedule(new WorldTask() {

			@Override
			public void run() {
				bot.publicChat(response);
			}

		}, 2);
	}

	private BotAction getCurrentBotAction() {
		return botAction;
	}

	/**
	 * Replaces any annotations in the .txt document which loads the responses.
	 * @param p
	 * @param message
	 * @return
	 */
	public String replace(Player p, String message) {
		boolean isSkill = false;
		if(message.contains("@lvl"))
			isSkill = true;
		if(isSkill)
			for(int i = 0; i <= 24; i++)
				message = message.replace("@lvl"+i+"@", ""+p.getSkills().getLevel(i));
		else {
			if(message.contains("@cblvl@"))
				message = message.replace("@cblvl@", ""+p.getSkills().getCombatLevelWithSummoning());

		}
		return message;
	}

	/**
	 * Replaces the @npcName@ annotation which the npcName, if the action type is ATTACK_NPC
	 * @param replaceFrom
	 * @param replaceWith
	 * @return
	 */
	public String replaceWithMessageReceived(String replaceFrom, String replaceWith) {
		String npcName = "";
		String charsUpToNPCName = "";
		charsUpToNPCName = replaceFrom.replace(" @npcName@", "");
		npcName = replaceWith.replace(charsUpToNPCName+" ", "");
		replaceFrom = replaceFrom.replace("@npcName@", npcName);
		return replaceFrom;
	}

	public GameTick getCurrentTick() {
		return currentTick;
	}

	public void setCurrentTick(GameTick currentTick) {
		this.currentTick = currentTick;
	}

	private static final HashMap<Object, Class<BotAction>> actions = new HashMap<Object, Class<BotAction>>();

	@SuppressWarnings({ "unchecked" })
	public static final void addAll() {
		try {
			Class<BotAction>[] classes = Utils.getClasses("com.rs.game.player.content.bot.action.capital");
			for (Class<BotAction> c : classes) {
				if (c.isAnonymousClass())
					continue;
				actions.put(c.getSimpleName(), c);
			}
			addOthers();
		} catch (Throwable e) {
			Logger.handle(e);
		}
	}

	private static void addOthers() throws ClassNotFoundException {

	}

	@SuppressWarnings({ "unchecked", "unused" })
	private static void addClass(Class<?> c) throws ClassNotFoundException {
		actions.put(c.getSimpleName(), (Class<BotAction>) Class.forName(c.getCanonicalName()));
	}

	public static final void reload() {
		actions.clear();
		addAll();
	}

	public static final BotAction getAction(Object key) {
		Class<BotAction> bA = actions.get((String) key);
		if (bA == null)
			return null;
		try {
			return bA.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void handleMessage(final Player player, final String message) {
		if(!isThisBot(player, message))
			return;
		if (message.toLowerCase().contains("train str")) {
			for (final Player p : World.getLocalPlayers(player)) {
				if (p == null)
					continue;
				if (p.isBot()) {
					WorldTasksManager.schedule(new WorldTask() {

						@Override
						public void run() {
							stop();
							p.publicChat("You're right, thanks for the suggestion.");
							p.getCombatDefinitions().setAttackStyle(1);
						}

					}, (int) 1.5);
				}
			}
		} else if(message.toLowerCase().contains("train att")) {
			for (final Player p : World.getLocalPlayers(player)) {
				if (p == null)
					continue;
				if (p.isBot()) {
					WorldTasksManager.schedule(new WorldTask() {

						@Override
						public void run() {
							stop();
							p.publicChat("Okay, will do!");
							p.getCombatDefinitions().setAttackStyle(0);
						}

					}, (int) 1.5);
				}
			}
		} else if(message.toLowerCase().contains("follow me")) {
			for (final Player p : World.getLocalPlayers(player)) {
				if (p == null)
					continue;
				if (p.isBot()) {
					if(!p.withinDistance(player, 14)) {
						p.publicChat("I can't find " + player.getDisplayName() + "...?");
						return;
					}
					WorldTasksManager.schedule(new WorldTask() {
						@Override
						public void run() {
							stop();
							p.publicChat("Okay, will do!");
							p.getActionManager().setAction(new PlayerFollow(player));
						}

					}, 2);
				}
			}
		} else if(message.toLowerCase().contains("stop follow") ||
				message.toLowerCase().contains("don't follow") ||
				message.toLowerCase().contains("dont follow")) {
			WorldTasksManager.schedule(new WorldTask() {
				@Override
				public void run() {
					for (final Player p : World.getLocalPlayers(player)) {
						if (p == null)
							continue;
						if (p.isBot()) {
							if(p.getActionManager().getAction() instanceof PlayerFollow) {
								p.publicChat("Alright, fine...");
								p.stopAll();
							} else {
								p.publicChat("I'm not following you?");
							}

						}
					}
				}

			}, 2);
			
		} else if(message.toLowerCase().contains("give money")) {
				giveAllOf(player, 995);
				
		} else if(message.toLowerCase().contains("give all")) {
				
			
		} else if(message.toLowerCase().contains("give partyh")) {
				giveItem(player, 1045);

		} else if(message.toLowerCase().contains("follow")) {
			WorldTasksManager.schedule(new WorldTask() {
				@Override
				public void run() {
					Player p2 = null;
					String[] receivedMessage;
					receivedMessage = message.split(" ");

					for (int i = 0; i < receivedMessage.length;i++) {
						if(p2 == null) {
							p2 = World.getPlayerByDisplayName(receivedMessage[i]);
						}
					}

					if(p2 == null)
						p2 = player;

					if(p2 != null) {
						for (final Player p : World.getLocalPlayers(p2)) {
							if (p == null)
								continue;
							if (p.isBot()) {
								if(!p.withinDistance(p2, 14)) {
									p.publicChat("I can't find " + player.getDisplayName() + "...?");
									return;
								}
								stop();
								p.publicChat("Okay, will follow " + p2.getUsername() + "!");
								p.getActionManager().setAction(new PlayerFollow(p2));
							}
						}
					}
				}

			}, 2);
		}
	}
	
	public static boolean giveItem(final Player player, final int itemId, final int amount) {
		WorldTasksManager.schedule(new WorldTask() {
			@Override
			public void run() {

				for (final Player p : World.getLocalPlayers(player)) {
					if (p == null)
						continue;
					if (p.isBot()) {
						if(!p.getInventory().hasFreeSlots()) {
							p.publicChat("I don't have anything in my inventory...");
							return;
						}
						if(p.getInventory().containsItem(itemId, amount)) {
							stop();
							p.setRouteEvent(new RouteEvent(player, new Runnable() {

								@Override
								public void run() {
									p.publicChat("As you wish " + player.getDisplayName() + "...");
									p.faceEntity(player);
									player.faceEntity(p);
									p.getInventory().deleteItem(itemId, amount);
									p.setNextAnimation(new Animation(881));
									player.getInventory().addItem(itemId, amount);
								}
								
							}));
						} else {
							p.publicChat("I don't have any " + new Item(itemId).getName() +"'s on me...");
						}

					}
				}
			
			}
			
		}, 3);
		return true;
	}
	
	public static boolean giveItem(final Player player, final int itemId) {
		WorldTasksManager.schedule(new WorldTask() {
			@Override
			public void run() {
				
				for (final Player p : World.getLocalPlayers(player)) {
					if (p == null)
						continue;
					if (p.isBot()) {
						if(!p.getInventory().hasFreeSlots()) {
							p.publicChat("I don't have anything in my inventory...");
							return;
						}
						if(p.getInventory().containsItem(itemId, 1)) {
							stop();
							p.setRouteEvent(new RouteEvent(player, new Runnable() {
								@Override
								public void run() {
									p.publicChat("As you wish " + player.getDisplayName() + "...");
									p.faceEntity(player);
									player.faceEntity(p);
									p.getInventory().deleteItem(itemId, 1);
									p.setNextAnimation(new Animation(881));
									player.getInventory().addItem(itemId, 1);
								}
								
							}));
						} else {
							p.publicChat("I don't have any " + new Item(itemId).getName() +"'s on me...");
						}
						
					}
				}
				
			}
			
		}, 3);
		return true;
	}
	public static boolean giveAllOf(final Player player, final int itemId) {
		WorldTasksManager.schedule(new WorldTask() {
			@Override
			public void run() {
				
				for (final Player p : World.getLocalPlayers(player)) {
					if (p == null)
						continue;
					if (p.isBot()) {
						if(!p.getInventory().hasFreeSlots()) {
							p.publicChat("I don't have anything in my inventory...");
							return;
						}
						if(p.getInventory().containsItem(itemId)) {
							stop();
							p.setRouteEvent(new RouteEvent(player, new Runnable() {
								@Override
								public void run() {
									int hadAmount = p.getInventory().getNumberOf(itemId);
									p.publicChat("As you wish " + player.getDisplayName() + ".");
									p.faceEntity(player);
									player.faceEntity(p);
									p.getInventory().deleteItem(itemId, player.getInventory().getAmountOf(itemId));
									p.setNextAnimation(new Animation(881));
									player.getInventory().addItem(itemId, hadAmount);
								}
								
							}));
						} else {
							p.publicChat("I don't have any " + new Item(itemId).getName() +"'s on me...");
						}
						
					}
				}
				
			}
			
		}, 3);
		return true;
	}

	private static boolean isThisBot(Player player, String message) {
		for (final Player p : World.getLocalPlayers(player)) {
			if (p == null)
				continue;
			if(p.isBot()) {
				if(!message.toLowerCase().contains(p.getUsername().toLowerCase()) || !message.toLowerCase().startsWith(p.getUsername().toLowerCase()))
					continue;
				else if(message.toLowerCase().contains(p.getUsername().toLowerCase()) || message.toLowerCase().startsWith(p.getUsername().toLowerCase()))
					return true;
			}
		}
		return false;
	}

}
