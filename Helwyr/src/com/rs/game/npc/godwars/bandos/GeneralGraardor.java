package com.rs.game.npc.godwars.bandos;

import java.util.List;
import java.util.concurrent.TimeUnit;

import com.rs.engine.GameEngine;
import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.minigames.GodWarsBosses;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.player.Player;
import com.rs.game.player.content.FriendChatsManager;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

@SuppressWarnings("serial")
public class GeneralGraardor extends NPC {

    public GeneralGraardor(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea,
	    boolean spawned) {
	super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
	setIntelligentRouteFinder(true);
	setLureDelay(3000);// Very small delay
	setDropRateFactor(3); // triples chances
    }

    /*
     * gotta override else setRespawnTask override doesnt work
     */
    @Override
    public void sendDeath(final Entity source) {
	final NPCCombatDefinitions defs = getCombatDefinitions();
	resetWalkSteps();
	getCombat().removeTarget();
	setNextAnimation(null);
	WorldTasksManager.schedule(new WorldTask() {
	    int loop;

	    @Override
	    public void run() {
		if (loop == 0) {
		    setNextAnimation(new Animation(defs.getDeathEmote()));
		} else if (loop >= defs.getDeathDelay()) {
		    if (source instanceof Player) {
			Player player = (Player) source;
			List<Player> players = FriendChatsManager.getLootSharingPeople(player);
			if (players != null) {
			    for (Player p : players) {
				if (p == null)
				    continue;
			    }
			}
		    }
		    drop();
		    reset();
		    setLocation(getRespawnTile());
		    finish();
		    setRespawnTask();
		    stop();
		}
		loop++;
	    }
	}, 0, 1);
    }

    @Override
    public void setRespawnTask() {
	if (!hasFinished()) {
	    reset();
	    setLocation(getRespawnTile());
	    finish();
	}
	final NPC npc = this;
	GameEngine.slowExecutor.schedule(new Runnable() {
	    @Override
	    public void run() {
		setFinished(false);
		World.addNPC(npc);
		npc.setLastRegionId(0);
		World.updateEntityRegion(npc);
		loadMapRegions();
		GodWarsBosses.respawnBandosMinions();
	    }
	}, getCombatDefinitions().getRespawnDelay() * 600, TimeUnit.MILLISECONDS);
    }
}
