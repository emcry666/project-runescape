package com.rs.game.area.dungeonhandler.impl;

import com.rs.game.Animation;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.area.dungeonhandler.DungeonEvent;
import com.rs.game.area.dungeonhandler.DungeonEventHandler;
import com.rs.game.npc.NPC;
import com.rs.game.player.Player;

public class PolyporeDungeon implements DungeonEvent {

	@Override
	public boolean init() {
		registerObject(64359);
		registerObject(64361);
		registerObject(64362);
		return registerObject(64360);
	}

	@Override
	public boolean handleNPCClick(Player player, NPC npc) {
		return false;
	}

	@Override
	public boolean handleNPCClick2(Player player, NPC npc) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean handleNPCClick3(Player palyer, NPC npc) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean handleObjectClick(Player player, WorldObject object) {
		if(object.getId() == 64360) {
			stairs(player, 4629, 5451, 2);
			
		} else if(object.getId() == 64361 && object.getX() == 4629 && object.getY() == 5452) {
			stairs(player, 4629, 5454, 3);
			
		} else if(object.getId() == 64359 && object.getX() == 4632 && object.getY() == 5409) {
			stairs(player, 4632, 5409, 2);

		} else if(object.getId() == 64359 && object.getX() == 4652 && object.getY() == 5388) {
			stairs(player, 4652, 5386, 0);

		} else if(object.getId() == 64359 && object.getX() == 4642 && object.getY() == 5389) {
			stairs(player, 4642, 5390, 1);

		} else if(object.getId() == 64359 && object.getX() == 4632 && object.getY() == 5443) {
			stairs(player, 4632, 5441, 1);
			
		} else if(object.getId() == 64362) { //vine
			stairs(player, 4652, 5389, 1);

		} else if(object.getId() == 64359 && object.getX() == 4632 && object.getY() == 5443) {
			stairs(player, 4632, 5441, 1);
			
		} else if(object.getId() == 64361 && object.getX() == 4632 && object.getY() == 5442) {
			stairs(player, 4632, 5444, 2);
			
		} else if(object.getId() == 64361 && object.getX() == 4633 && object.getY() == 5409) {
			stairs(player, 4631, 5409, 3);
			
		} else if(object.getId() == 64361 && object.getX() == 4643 && object.getY() == 5389) {
			stairs(player, 4641, 5390, 2);
		}
		return false;
	}

	@Override
	public boolean handleObjectClick2(Player player, WorldObject object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean handleObjectClick3(Player player, WorldObject object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean registerNPC(int npcId) {
		return DungeonEventHandler.registerNPCs(npcId, this);
	}

	@Override
	public boolean registerObject(int objectId) {
		return DungeonEventHandler.registerObjects(objectId, this);
	}

	void nextTile(Player player, int x, int y, int h) {
		player.lock(3);
		player.setNextWorldTile(new WorldTile(x, y, h));
	}

	void animation(Player player, int anim) {
		player.setNextAnimation(new Animation(anim));
	}


	void stairs(Player player, int x, int y, int h) {
		player.useStairs(828, new WorldTile(x, y, h), 1, 2);
	}


}
