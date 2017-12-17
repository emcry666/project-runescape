package com.rs.game.area.dungeonhandler;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import com.rs.game.WorldObject;
import com.rs.game.npc.NPC;
import com.rs.game.player.Player;

/**
 * 
 * @author Anarchy
 *
 *<Anarchyrsps@gmail.com><skype@Anarchyrsps>
 */

public final class DungeonEventHandler {

	private static final Map<Integer, DungeonEvent> dungeonEvents = new HashMap<Integer, DungeonEvent>();

	private static final Logger logger = Logger.getLogger(DungeonEventHandler.class
			.getCanonicalName());

	public static final boolean registerDungeons() {
		for (File file : new File("./src/com/rs/game/area/dungeonhandler/impl/").listFiles()) {
			try {
				if (!((DungeonEvent) Class.forName("com.rs.game.area.dungeonhandler.impl."+ file.getName().replace(".java", "")).newInstance()).init()) {
					return false;
				}
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		System.out.println("[DungeonEventHandler] - Loaded " + dungeonEvents.size() + " dungeon events.");
		return true;
	}

	public static final boolean reload() throws Throwable {
		dungeonEvents.clear();
		return registerDungeons();
	}

	public static final boolean handleNPCClick(Player player, NPC npc, int npcId) {
		DungeonEvent dungeons = dungeonEvents.get(npcId);
		if (dungeons == null)
			return false;
		return dungeons.handleNPCClick(player, npc);
	}

	public static boolean handleNPCClick2(Player player, NPC npc, int npcId) {
		DungeonEvent dungeonEvent = dungeonEvents.get(npcId);
		if (dungeonEvent == null)
			return false;
		return dungeonEvent.handleNPCClick2(player, npc);
	}
	
	public static boolean handleNPCClick3(Player player, NPC npc, int npcId) {
		DungeonEvent dungeonEvent = dungeonEvents.get(npcId);
		if (dungeonEvent == null)
			return false;
		return dungeonEvent.handleNPCClick3(player, npc);
	}


	public static final boolean handleObjectClick(Player player,
			WorldObject object, int objectId) {
		DungeonEvent dungeonEvent = dungeonEvents.get(objectId);
		if (dungeonEvent == null)
			return false;
		return dungeonEvent.handleObjectClick(player, object);
	}

	public static final boolean handleObjectClick2(Player player,
			WorldObject object, int objectId) {
		DungeonEvent dungeonEvent = dungeonEvents.get(objectId);
		if (dungeonEvent == null)
			return false;
		return dungeonEvent.handleObjectClick2(player, object);
	}
	
	public static final boolean handleObjectClick3(Player player,
			WorldObject object, int objectId) {
		DungeonEvent dungeonEvent = dungeonEvents.get(objectId);
		if (dungeonEvent == null)
			return false;
		return dungeonEvent.handleObjectClick3(player, object);
	}
	
	
	public static boolean registerNPCs(int npcId, DungeonEvent dungeonEvent) {
		if (dungeonEvents.containsKey(npcId)) {
			logger.info("DungeonEvent: " + dungeonEvent.getClass().getCanonicalName()
					+ " already registered with "
					+ dungeonEvents.get(npcId).getClass().getCanonicalName() + ".");
			return false;
		}
		dungeonEvents.put(npcId, dungeonEvent);
		return true;
	}

	public static boolean registerObjects(int objectId, DungeonEvent dungeonEvent) {
		if (dungeonEvents.containsKey(objectId)) {
			logger.info("DungeonEvent: " + dungeonEvent.getClass().getCanonicalName()
					+ " already registered with "
					+ dungeonEvents.get(objectId).getClass().getCanonicalName()
					+ ".");
			return false;
		}
		dungeonEvents.put(objectId, dungeonEvent);
		return true;
	}
}