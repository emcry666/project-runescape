package com.rs.engine.system;

import java.util.concurrent.TimeUnit;

import com.rs.Launcher;
import com.rs.engine.GameEngine;
import com.rs.game.World;
import com.rs.game.player.Player;
import com.rs.utils.IPBanL;
import com.rs.utils.Logger;
import com.rs.utils.PkRank;

public class SystemUpdate implements Runnable {

	private int delay;
	private boolean restart;

	public SystemUpdate(int delay, boolean restart) {
		this.delay = delay;
		this.restart = restart;
	}

	@Override
	public void run() {
		for (Player player : World.getPlayers()) {
			if (player == null || !player.hasStarted())
				continue;
			player.getPackets().sendSystemUpdate(delay);
		}
		
		/**
		 * Create backup before the update
		 */
		
		GameEngine.getEngine().getScheduledExecutor().schedule(new Runnable() {
			@Override
			public void run() {
				try {
					for (Player player : World.getPlayers()) {
						if (player == null || !player.hasStarted())
							continue;
						player.realFinish();
					}
					IPBanL.save();
					PkRank.save();
					if (restart)
						Launcher.restart();
					else
						Launcher.shutdown();
				} catch (Throwable e) {
					Logger.handle(e);
				}
			}
		}, delay, TimeUnit.SECONDS);
	}

}
