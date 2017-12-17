package com.rs.game.player.controlers;

import com.rs.game.Entity;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

public class StartTutorial extends Controler {

	private static final int QUEST_GUIDE_NPC = 949;

	@Override
	public void start() {
		refreshStage();
		player.getPackets().sendMusicEffect(13);
	 player.getMusicsManager().forcePlayMusic(239); //Brain Battle
	}

	public NPC findNPC(int id) {
		// as it may be far away
		for (NPC npc : World.getNPCs()) {
			if (npc == null || npc.getId() != id)
				continue;
			return npc;
		}
		return null;
	}

	/*
	 * return remove controler
	 */
	@Override
	public boolean login() {
		start();
		return true;
	}

	/*
	 * return remove controler
	 */
	@Override
	public boolean logout() {
		return false;
	}

	@Override
	public boolean processMagicTeleport(WorldTile toTile) {
		return false;
	}

	@Override
	public boolean keepCombating(Entity target) {
		return false;
	}

	@Override
	public boolean canAttack(Entity target) {
		return false;
	}

	@Override
	public boolean canHit(Entity target) {
		return false;
	}

	@Override
	public boolean processItemTeleport(WorldTile toTile) {
		return false;
	}

	@Override
	public boolean processObjectTeleport(WorldTile toTile) {
		return false;
	}

@Override
	public void process() {
		if (getStage() == 1 && player.getPrayer().isAncientCurses())
			updateProgress();
	}

	@Override
	public boolean processObjectClick1(WorldObject object) {
		int id = object.getId();
		if ((id == 47120 && getStage() == 1)
				|| (Wilderness.isDitch(id) && getStage() == 2))
			return true;
		return false;
	}

	@Override
	public boolean processObjectClick2(WorldObject object) {
		return false;
	}

	@Override
	public boolean processObjectClick3(WorldObject object) {
		return false;
	}

	public void refreshStage() {
		int stage = getStage();
		if (stage == 0) {
			NPC guide = findNPC(QUEST_GUIDE_NPC);
			if (guide != null)
				player.getHintIconsManager().addHintIcon(guide, 0, -1, false);
		} else if (stage == 1) {
			player.getHintIconsManager().addHintIcon(3102, 3504, 0, 100, 0, 0,
					-1, false);
		} else if (stage == 2) {
			player.getHintIconsManager().addHintIcon(3092, 3521, 0, 0, 0, 0,
					-1, false);
		}
		sendInterfaces();
	}

	

	public void updateProgress() {
		setStage(getStage() + 1);
		if (getStage() == 2) {
			player.getDialogueManager().startDialogue("QuestGuide",
					QUEST_GUIDE_NPC, this);
		}
		refreshStage();
	}

	@Override
	public boolean processNPCClick1(NPC npc) {
		if (npc.getId() == QUEST_GUIDE_NPC) {
			player.getDialogueManager().startDialogue("QuestGuide",
					QUEST_GUIDE_NPC, this);
		}
		return false;
	}

	public void setStage(int stage) {
		getArguments()[0] = stage;
	}

	public int getStage() {
		if (getArguments() == null)
			setArguments(new Object[] { 0 }); // index 0 = stage
		return (Integer) getArguments()[0];
	}
@Override
	public void forceClose() {
		
		player.getHintIconsManager().removeUnsavedHintIcon();
		player.getMusicsManager().reset();
		

		WorldTasksManager.schedule(new WorldTask() {
			@Override
			public void run() {
				player.getInterfaceManager().sendInterfaces();
				player.getInterfaceManager()
						.closeReplacedRealChatBoxInterface();
				player.getDialogueManager().startDialogue("QuestGuide",
						QUEST_GUIDE_NPC, null);
			}
		});
	}
}