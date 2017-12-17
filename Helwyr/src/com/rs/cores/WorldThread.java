package com.rs.cores;

import com.rs.Settings;
import com.rs.engine.GameEngine;
import com.rs.game.World;
import com.rs.game.npc.NPC;
import com.rs.game.player.Player;
import com.rs.game.player.content.bot.Bot;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Logger;
import com.rs.utils.Utils;

public final class WorldThread extends Thread {

	public static volatile long WORLD_CYCLE;

	protected WorldThread() {
		setPriority(Thread.MAX_PRIORITY);
		setName("World Thread");
	}

	@Override
	public final void run() {
		while (!GameEngine.getEngine().isShutdown()) {
			WORLD_CYCLE++;
			long currentTime = Utils.currentTimeMillis();
			WorldTasksManager.processTasks();
			try {
				for (Player player : World.getPlayers()) {
					if (!player.hasStarted() || player.hasFinished())
						continue;
					if (!(player instanceof Bot) && currentTime - player.getPacketsDecoderPing() > Settings.MAX_PACKETS_DECODER_PING_DELAY
							&& player.getSession().getChannel().isOpen())
						player.getSession().getChannel().close();
					player.processEntity();
					player.processEntity();
				}
				for (NPC npc : World.getNPCs()) {
					if (npc == null || npc.hasFinished())
						continue;
					npc.processEntity();
				}
			} catch (Throwable e) {
				Logger.handle(e);
			}
			try {
				for (Player player : World.getPlayers()) {
					if (!player.hasStarted() || player.hasFinished())
						continue;
					player.processEntity();
				}
				for (NPC npc : World.getNPCs()) {
					if (npc == null || npc.hasFinished())
						continue;
					npc.processEntity();
				}
			} catch (Throwable e) {
				Logger.handle(e);
			}
			try {
				for (Player player : World.getPlayers()) {
					if (!player.hasStarted() || player.hasFinished())
						continue;
					player.resetMasks();
				}
				for (NPC npc : World.getNPCs()) {
					if (npc == null || npc.hasFinished())
						continue;
					npc.resetMasks();
				}
			} catch (Throwable e) {
				Logger.handle(e);
			}

			try {
				for (Player player : World.getPlayers()) {
					if (!player.hasStarted() || player.hasFinished())
						continue;
					if (!player.getSession().getChannel().isConnected())
						player.finish(); // requests finish, wont do anything if
				}
			} catch (Throwable e) {
				Logger.handle(e);
			}
			long sleepTime = Settings.WORLD_CYCLE_TIME + currentTime - Utils.currentTimeMillis();
			if (sleepTime <= 0)
				continue;
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				Logger.handle(e);
			}
		}
	}

}
