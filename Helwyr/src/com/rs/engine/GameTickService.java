package com.rs.engine;

import java.util.ArrayList;
import java.util.List;

import com.rs.engine.synchronizer.CharacterSynchronizer;
import com.rs.game.tasks.WorldTasksManager;

public class GameTickService implements Runnable {

	/**
	 * The list of game ticks that will be pulsed in this tick service
	 */

	private List<GameTick> ticks;

	/**
	 * The world/character synchronization
	 */

	private CharacterSynchronizer worldSync;

	/**
	 * Constructs a new {@code GameTickService}
	 */

	public GameTickService() {
		ticks = new ArrayList<GameTick>();
		worldSync = new CharacterSynchronizer();
		
		/**
		 * initialize the available tick managers
		 */
		
		ticks.add(new WorldTasksManager(true));
	}

	@Override
	public void run() {
		for (GameTick tick : ticks) {
			if (tick.isRunning()) {
				tick.tick();
				tick.getTicks().getAndIncrement();
			}
		}

		/**
		 * Make sure no other threads are getting in our way
		 */

		synchronized (this) {
			worldSync.run();
		}
	}
}
