package com.rs.game.player.controlers.bosses;

import java.util.concurrent.TimeUnit;

import javax.xml.stream.Location;

import com.rs.game.Animation;
import com.rs.game.RegionBuilder;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.npc.others.SkeletalHorror;
import com.rs.game.player.controlers.Controler;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

public class SkeletalHorrorController extends Controler {
	
	private int[] boundChuncks;
	
	private NPC horror;

	@Override
	public void start() {
		loadRoom();
	}
	
	public void loadRoom() {
		
				boundChuncks = RegionBuilder.findEmptyChunkBound(2, 2);
				RegionBuilder.copyAllPlanesMap(314, 653, boundChuncks[0], boundChuncks[1], 8);
				player.reset();
				player.getTemporaryAttributtes().put("skHorror", Boolean.TRUE);
				player.setLocation(new WorldTile(boundChuncks[0] * 8 + 10, boundChuncks[1] * 8 + 9, 0));
				player.setNextAnimation(new Animation(-1));
				sendInterfaces();
				horror = new SkeletalHorror(new WorldTile(boundChuncks[0] * 8 + 14, boundChuncks[1] * 8 + 9, 0));
			}

				
			
		
	
	
	public void respawnHorror() {
		player.getInventory().deleteItem(991, 1);
		horror = new SkeletalHorror(new WorldTile(boundChuncks[0] * 8 + 14, boundChuncks[1] * 8 + 9, 0));
	}


	
	public void destroyRoom() {
		WorldTasksManager.schedule(new WorldTask() {
			@Override
			public void run() {
				RegionBuilder.destroyMap(boundChuncks[0], boundChuncks[1], 8, 8);
				player.getControlerManager().removeControlerWithoutCheck();
				player.getTemporaryAttributtes().remove("skHorror");
				horror.sendDeath(null);
			}
		}, 1200, 1);
	}
	
	@Override
	public boolean processMagicTeleport(WorldTile toTile) {
		destroyRoom();
		return true;
	}

	@Override
	public boolean processItemTeleport(WorldTile toTile) {
		destroyRoom();
		return true;
	}

	@Override
	public boolean processObjectClick1(WorldObject object) {
		/*
		 * Exit
		 */
		if (object.getId() == 31292) {
			if (player.getInventory().containsItem(991, 1)) {
				player.getDialogueManager().startDialogue("MuddyKey", this);
			} else {
				player.setLocation(new WorldTile(1520, 4704, 0));
				destroyRoom();
			}
			return false;
		}
		return true;
	}

}
