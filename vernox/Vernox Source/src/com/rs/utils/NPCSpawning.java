package com.rs.utils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.utils.Utils.EntityDirection;

/**
 * 
 * @author Dylan Doldersum || Mystic Wolf
 * Mar 29, 2016 17161 - 3038 6128 0
 */

public class NPCSpawning {

	/**
	 * Contains the custom npc spawning
	 */

	public static void spawnNPCS() {
    	    /**
    	     * Npcs
    	     */
		//World.spawnNPC(13930, new WorldTile(2967, 3378, 0), -1, true, true); //Ariane
		for (int i =0; i <= 3; i++)
		{
		    World.spawnNPC(15841, new WorldTile(2859 - i, 3531, 3), -1, false, EntityDirection.NORTH); 
		}	
		    World.spawnNPC(14362, new WorldTile(2849, 3530, 3), -1, false, EntityDirection.NORTH);
		    World.spawnNPC(15772, new WorldTile(2850, 3530, 3), -1, false, EntityDirection.NORTH);

		
		//Grand exchange
		    World.spawnNPC(2240, new WorldTile(2851, 3530, 3), -1, false, EntityDirection.NORTH); 
		    //monkeyknifefighters
		    World.spawnNPC(13212, new WorldTile(2757, 2801, 0), -1, false, EntityDirection.SOUTH);
		    World.spawnNPC(13212, new WorldTile(2755, 2797, 0), -1, false, EntityDirection.SOUTH);
		    World.spawnNPC(13212, new WorldTile(2753, 2797, 0), -1, false, EntityDirection.SOUTH);
		    World.spawnNPC(13212, new WorldTile(2749, 2800, 0), -1, false, EntityDirection.SOUTH);
		    World.spawnNPC(13212, new WorldTile(2753, 2797, 0), -1, false, EntityDirection.SOUTH);
		//teleporter
		    World.spawnNPC(15775, new WorldTile(2857, 3551, 3), -1, false, EntityDirection.SOUTH);
		    World.spawnNPC(961, new WorldTile(2838, 3533, 3), -1, false, EntityDirection.EAST);//healersurgeon
		    //World.spawnNPC(16180, new WorldTile(2858, 3551, 3), -1, false, EntityDirection.SOUTH);
		    //World.spawnNPC(528, new WorldTile(2868, 3551, 3), -1, false, EntityDirection.SOUTH);
		    World.spawnNPC(18516, new WorldTile(2875, 3547, 3), -1, false, EntityDirection.WEST);
		    World.spawnNPC(13930, new WorldTile(2867, 3541, 3), -1, false, EntityDirection.NORTH);
		    World.spawnNPC(8480, new WorldTile(2847, 3544, 3), -1, false, false);

		/**
		 * objects
		 */
		for (int i =0; i <= 3; i++)
		{
		World.spawnObject(new WorldObject(782, 10, 0, 2859 - i, 3532, 3));
		World.spawnObject(new WorldObject(172, 10, 2, 2862 - i, 3533, 3));
		}
		//thieving
		World.spawnObject(new WorldObject(4874, 10, 1, 2867, 3551, 3));
		World.spawnObject(new WorldObject(4876, 10, 1, 2865, 3551, 3));
		World.spawnObject(new WorldObject(4877, 10, 1, 2863, 3551, 3));

		
		World.spawnObject(new WorldObject(782, 10, 1, 2855, 3530, 3));
		World.spawnObject(new WorldObject(782, 10, 1, 2855, 3531, 3));
		World.spawnObject(new WorldObject(6836, 10, 2, 2855, 3532, 3));
		
		World.spawnObject(new WorldObject(45310, 10, 2, 2874, 3533, 3));
		World.spawnObject(new WorldObject(66554, 10, 2, 2873, 3533, 3));
 
		World.spawnObject(new WorldObject(4172, 10, 2, 2875, 3539, 3));
		World.spawnObject(new WorldObject(66540, 10, 2, 2874, 3539, 3));
		
		World.spawnObject(new WorldObject(409, 10, 0, 2847, 3532, 3));
		World.spawnObject(new WorldObject(15478, 10, 1, 2838, 3540, 3));
		

	}

	/**
	 * The NPC classes.
	 */
	private static final Map<Integer, Class<?>> CUSTOM_NPCS = new HashMap<Integer, Class<?>>();

	public static void npcSpawn() {
		int size = 0;
		boolean ignore = false;
		try {
			for (String string : FileUtilities
					.readFile("data/npcs/spawns.txt")) {
				if (string.startsWith("//") || string.equals("")) {
					continue;
				}
				if (string.contains("/*")) {
					ignore = true;
					continue;
				}
				if (ignore) {
					if (string.contains("*/")) {
						ignore = false;
					}
					continue;
				}
				String[] spawn = string.split(" ");
				@SuppressWarnings("unused")
				int id = Integer.parseInt(spawn[0]), x = Integer
						.parseInt(spawn[1]), y = Integer.parseInt(spawn[2]), z = Integer
						.parseInt(spawn[3]), faceDir = Integer
						.parseInt(spawn[4]);
				NPC npc = null;
				Class<?> npcHandler = CUSTOM_NPCS.get(id);
				if (npcHandler == null) {
					npc = new NPC(id, new WorldTile(x, y, z), -1, true, false);
				} else {
					npc = (NPC) npcHandler.getConstructor(int.class)
							.newInstance(id);
				}
				if (npc != null) {
					WorldTile spawnLoc = new WorldTile(x, y, z);
					npc.setLocation(spawnLoc);
					World.spawnNPC(npc.getId(), spawnLoc, -1, true, false);
					size++;
				}
			}
		} catch (NumberFormatException e1) {
			e1.printStackTrace();
		} catch (IllegalArgumentException e1) {
			e1.printStackTrace();
		} catch (SecurityException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			e1.printStackTrace();
		} catch (NoSuchMethodException e1) {
			e1.printStackTrace();
		}
		System.err.println("Loaded " + size + " custom npc spawns!");
	}

}