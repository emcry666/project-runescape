package com.rs.cores;

import com.rs.engine.GameEngine;

//import com.rs.game.minigames.bounty.BountyHunter;

public class MinigameThread extends Thread {

	private static int tick = 0;

	protected MinigameThread() {
		setPriority(Thread.MIN_PRIORITY);
		setName("Minigames Thread");
	}

	@Override
	public void run() {
		while (!GameEngine.getEngine().isShutdown()) {
			try {
				tick++;
				if (tick >= 10) {
					//BountyHunter.get().update();
					tick = 0;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
