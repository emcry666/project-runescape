package com.rs.game.area.dungeonhandler;

import com.rs.game.WorldObject;
import com.rs.game.npc.NPC;
import com.rs.game.player.Player;

/**
 * 
 * @author Frostbite
 *
 *<Frostbitersps@gmail.com><skype@Frostbitersps>
 */
public interface DungeonEvent {

	public boolean init();

	public boolean handleNPCClick(Player player, NPC npc);

	public boolean handleNPCClick2(Player player, NPC npc);
	
	public boolean handleNPCClick3(Player palyer, NPC npc);

	public boolean handleObjectClick(Player player, WorldObject object);
	
	public boolean handleObjectClick2(Player player, WorldObject object);
	
	public boolean handleObjectClick3(Player player, WorldObject object);
	
	public boolean registerNPC(int npcId);

	public boolean registerObject(int objectId);
	

}