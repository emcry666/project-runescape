package com.rs.game.npc.others;

import com.rs.game.Animation;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.player.Player;
import com.rs.utils.Utils;

@SuppressWarnings("serial")
public class DraynorDeadTree extends NPC {

	/**
	 * Represents the NPC ids of NPCs using this plugin.
	 */
	private static final int[] ID = {5208, 152, 5207};

	/**
	 * Dead Tree Animation
	 */
	private Animation treeAnimation = new Animation(73);

	/**
	 * Defence Animation
	 */

	private Animation defenceAnimation = new Animation(404);

	/**
	 * Attack Delay of Dead Tree
	 */
	private int attackDelay = 4;

	/**
	 * Random Hit the Dead Tree produces
	 */
	private int hit = Utils.random(4);


	public DraynorDeadTree(int id, WorldTile tile, int mapAreaNameHash,
		boolean canBeAttackFromOutOfArea) {
		super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
		setCantInteract(false);
	}


	@Override
	public void processNPC() {
		long currentTime = Utils.currentTimeMillis();
		for(Player player : World.getPlayers()) {
			if(player.getAttackedByDelay() + 10000 > currentTime) 
				return;
			
			if (!player.withinDistance(this, 1)) 
				return;
			
			if(attackDelay == 4) {
				setForceAgressive(true);
				faceEntity(player);
				setNextAnimation(treeAnimation);
				player.applyHit(new Hit(player, hit, HitLook.REGULAR_DAMAGE));
				player.setNextAnimation(defenceAnimation);
				attackDelay = 0;
			}
			attackDelay++;
		}
	}


}
