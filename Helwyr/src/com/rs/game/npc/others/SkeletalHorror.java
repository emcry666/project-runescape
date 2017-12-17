package com.rs.game.npc.others;

import javax.xml.stream.Location;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

@SuppressWarnings("serial")
public class SkeletalHorror extends NPC {

	public SkeletalHorror(WorldTile tile) {
		super(-1, tile, -1, true);
	}
	
	@Override
	public void sendDeath(final Entity source) {
		final NPCCombatDefinitions defs = getCombatDefinitions();
		WorldTasksManager.schedule(new WorldTask() {
			int loop;

			@Override
			public void run() {
				if (loop == 0) {
					setNextAnimation(new Animation(defs.getDeathEmote()));
				} else if (loop == 3) {
					drop();
				} else if (loop == 4) {
					reset();
					setLocation(getRespawnTile());
					finish();
					stop();
				}
				loop++;
			}
		});
	}

}
