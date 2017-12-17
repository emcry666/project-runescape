package com.rs;

import com.rs.game.World;
import com.rs.game.player.Player;
import com.rs.game.player.content.grandExchange.GrandExchange;
import com.rs.utils.ShopsHandler;

public class ShutDownHook extends Thread {

	private static final ShutDownHook INSTANCE = new ShutDownHook();

	private ShutDownHook() {
	}

	@Override
	public void run() {
		try {
			System.out.println("================= Shutting down the server. ================");
			System.out.println("============ Preparing players for shutdown... =============");
			for (Player player : World.getPlayers()) {
				if (player == null || !player.hasStarted() || player.hasFinished())
					continue;
				player.realFinish();
			}
			System.out.println("=============== Finished saving all players. ===============");
			System.out.println("============= Saving Grand Exchange Offers... ==============");
			GrandExchange.save();
			System.out.println("==================== Server terminated. ====================");
		} catch (Exception e) {
			System.out.println("================ Error while shutting down. ================");
			e.printStackTrace();
		}

	}

	public static ShutDownHook get() {
		return INSTANCE;
	}
}
