package com.rs.engine;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import com.rs.cores.DecoderThreadFactory;
import com.rs.cores.SlowThreadFactory;
import com.rs.engine.system.SystemUpdate;

public class GameEngine extends TimerTask {
	
	/*
	 * Exoria's Game Engine.
	 * Created by Taylor Moon
	 * (Not done)
	 */
	
	/**
	 * Starts the grand exchange thread
	 */
	//public static GrandExchangeThread geThread;
	public static Timer fastExecutor;

	/**
	 * The rate at which this engine should cycle (the engine speed)
	 */
	public static final long CYCLE_RATE = 600;
	/**
	 * The tick service responsible for ticking our available processors
	 */
	private final GameTickService tickService;
	/**
	 * The engine scheduler used for scheduling thread tasks at a specific tick
	 * period
	 */
	private final Timer scheduler;
	/**
	 * The server channel executor responsible for executing threads on a
	 * channel level
	 */
	private final ExecutorService workerChannelExecutor;
	/**
	 * The server boss channel executor responsible for executing threads on a
	 * boss channel level
	 */
	private final ExecutorService bossChannelExecutor;
	/**
	 * The 'slow' executor responsible for repetitive .6 milisecond ticks
	 */
	public static ScheduledExecutorService slowExecutor;
	/**
	 * If a system update is in progress
	 */
	private boolean isUpdating;
	/**
	 * The thread saftey synchronization lock
	 */
	private Object exaust = new Object();
	/**
	 * The game engine singleton
	 */
	public static final GameEngine ENGINE = new GameEngine();

	/**
	 * Constructs a new {@code GameEngine}
	 */
	private GameEngine() {
		/**
		 * Initialize the tick service
		 */
		tickService = new GameTickService();
		//geThread = new GrandExchangeThread();
		/**
		 * Initialize the scheduler
		 */
		scheduler = new Timer("Engine Scheduler");
		/**
		 * Initialize the thread workers
		 */
		slowExecutor = Runtime.getRuntime().availableProcessors() >= 6 ? Executors
				.newScheduledThreadPool(Runtime.getRuntime()
						.availableProcessors() >= 12 ? 4 : 2,
						new SlowThreadFactory()) : Executors
				.newSingleThreadScheduledExecutor(new SlowThreadFactory());
		fastExecutor(new Timer());
		workerChannelExecutor = Runtime.getRuntime().availableProcessors() >= 6 ? Executors
				.newFixedThreadPool(Runtime.getRuntime().availableProcessors()
						- (Runtime.getRuntime().availableProcessors() >= 12 ? 7
								: 5), new DecoderThreadFactory()) : Executors
				.newSingleThreadExecutor(new DecoderThreadFactory());
		bossChannelExecutor = Executors
				.newSingleThreadExecutor(new DecoderThreadFactory());
		/**
		 * Executes Grand Exchange thread
		 */
		//geThread.start();
	}

	/**
	 * initializes this game engine and returns said initialized engine
	 * 
	 * @return The engine future
	 */
	public GameEngine initialize() {
		synchronized (exaust) {
			try {
				scheduler.schedule(this, 0, CYCLE_RATE);
			} catch (Exception e) {
				System.exit(-1);
			}
		}
		return this;
	}

	@Override
	public void run() {
		synchronized (exaust) {
			/**
			 * Submit a world wide pulse through our processors
			 */
			deliver(tickService);
		}
	}

	/**
	 * Returns the scheduler
	 * 
	 * @return The scheduler
	 */
	public Timer getScheduler() {
		return scheduler;
	}
	
	public Timer fastExecutor() {
		return fastExecutor;
	}

	public GameEngine fastExecutor(Timer fastExecutor) {
		GameEngine.fastExecutor = fastExecutor;
		return this;
	}

	/**
	 * Returns the tick service
	 * 
	 * @return The tick service
	 */
	public GameTickService getTickService() {
		return tickService;
	}

	/**
	 * Returns the scheduled executor
	 * 
	 * @return The scheduled executor
	 */
	public ScheduledExecutorService getScheduledExecutor() {
		return slowExecutor;
	}

	/**
	 * Returns the channel executor
	 * 
	 * @return The channel executor
	 */
	public ExecutorService getWorkerChannelExecutor() {
		return workerChannelExecutor;
	}

	/**
	 * Returns the boss channel executor
	 * 
	 * @return The boss channel executor
	 */
	public ExecutorService getBossChannelExecutor() {
		return bossChannelExecutor;
	}

	/**
	 * Returns the engine singleton
	 * 
	 * @return The engine singleton
	 */
	public static GameEngine getEngine() {
		return ENGINE;
	}

	/**
	 * Returns the scheduler
	 * 
	 * @return The scheduler
	 */
	public Thread deliver(Runnable event) {
		synchronized (exaust) {
			Thread thread = new Thread(event);
			thread.setName("ENGINE_THREAD");
			thread.setPriority(9);
			thread.start();
			return thread;
		}
	}

	public void initializeSystemUpdate(int delay, boolean restart) {
		deliver(new SystemUpdate(delay, restart));
		setUpdating(true);
		System.err.println("Initializing system update in " + delay
				+ " seconds. RESTART: " + restart);
	}

	/**
	 * Shuts down this game engine
	 */
	public void shutdown() {//so it will shutdown the whole gameengine? idk lol lol well test it
		synchronized (exaust) {
			slowExecutor.shutdownNow();
			scheduler.cancel();
			fastExecutor().cancel();
			bossChannelExecutor.shutdownNow();
			workerChannelExecutor.shutdownNow();
		}
	}

	/**
	 * Returns the current workers in this game engine
	 * 
	 * @return The workers
	 */
	public int getWorkers() {
		int availableProcessors = Runtime.getRuntime().availableProcessors();
		return availableProcessors >= 6 ? availableProcessors
				- (availableProcessors >= 12 ? 7 : 5) : 1;
	}

	/**
	 * If a system update is in progress
	 * 
	 * @return True if update; false otherwise
	 */
	public boolean isUpdating() {
		return isUpdating;
	}

	/**
	 * 
	 * @param isUpdating
	 */
	public void setUpdating(boolean isUpdating) {
		this.isUpdating = isUpdating;
	}

	public boolean isShutdown() {
		return isUpdating;
	}
}
