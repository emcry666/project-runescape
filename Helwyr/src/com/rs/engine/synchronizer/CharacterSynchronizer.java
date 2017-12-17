package com.rs.engine.synchronizer;

import com.rs.game.World;
import com.rs.game.npc.NPC;
import com.rs.game.player.Player;
import com.rs.utils.Logger;

public class CharacterSynchronizer implements Runnable {

	@Override
	public void run() {
		/**
		 * We are going to process the player and prepare it for the 'large'
		 * local player and NPC update
		 */
		for (Player player : World.getPlayers()) {
			if (player == null || !player.hasStarted() || player.hasFinished())
				continue;
			try {
				player.processEntity();
			} catch (Exception e) {
				Logger.log(this,
						"Error processing player: " + player.getDisplayName()
								+ ", disconnecting player.");
				player.forceLogout();
			}
		}
		/**
		 * We will do the same with the NPCs as we prepare them for the 'large'
		 * local NPC update
		 */
		for (NPC nPC : World.getNPCs()) {
			if (nPC == null || nPC.hasFinished())
				continue;
			nPC.processEntity();
		}
		/**
		 * After the NPCs and players have been processed they are ready to be
		 * shown in the game, we will send a packet to the client with a payload
		 * representing the NPCs and players in the processed region
		 */
		for (Player player : World.getPlayers()) {
			if (player == null || !player.hasStarted() || player.hasFinished())
				continue;
			try {
				player.getPackets().sendLocalPlayersUpdate();
				player.getPackets().sendLocalNPCsUpdate();
			} catch (Exception e) {
				Logger.log(this, "Error encoding local player update: "
						+ player.getDisplayName() + ", disconnecting player.");
				player.forceLogout();
			}
		}
		/**
		 * After the local NPC and player update is finished processing masks
		 * and appearence data we will reset the masks in order to prepare for
		 * the next engine cycle
		 */
		for (Player player : World.getPlayers()) {
			if (player == null || !player.hasStarted() || player.hasFinished())
				continue;
			try {
				player.resetMasks();
			} catch (Exception e) {
				Logger.log(
						this,
						"Error resetting player masks: "
								+ player.getDisplayName()
								+ ", disconnecting player.");
				player.forceLogout();
			}
		}
		for (NPC nPC : World.getNPCs()) {
			if (nPC == null || nPC.hasFinished())
				continue;
			nPC.resetMasks();
		}
	}

}
