package com.rs.game.player.content.instancing.bossInstance;

import java.util.concurrent.TimeUnit;

import com.rs.engine.GameEngine;
import com.rs.game.RegionBuilder;
import com.rs.game.WorldTile;
import com.rs.utils.Logger;


public class MapInstance {

	public static enum Stages {
		LOADING, RUNNING, DESTROYING
	}
	
	private Stages stage;
	private int[] instancePos;
	private int[] originalPos;
	private int ratioX, ratioY;
	
	public MapInstance(int x, int y) {
		this(x, y, 1, 1);
	}
	
	public MapInstance(int x, int y, int ratioX, int ratioY) {
		originalPos = new int[] {x, y};
		this.ratioX = ratioX;
		this.ratioY = ratioY;
	}
	
	
	public void load(final Runnable run) {
		stage = Stages.LOADING;
		GameEngine.getEngine().getScheduledExecutor().execute(new Runnable() {
			@Override
			public void run() {
				try {
					// finds empty map bounds
					if(instancePos == null)
						instancePos = RegionBuilder.findEmptyChunkBound(ratioX * 8, ratioY * 8);
					// copys real map into the empty map
					RegionBuilder.copyAllPlanesMap(originalPos[0], originalPos[1], instancePos[0], instancePos[1], ratioX * 8, ratioY * 8);
					if(run != null)
						run.run();
					stage = Stages.RUNNING;
				}catch(Throwable e) {
					Logger.handle(e);
				}
			}
		});
	}
	
	public void destroy(final Runnable run) {
		stage = Stages.RUNNING;
		GameEngine.getEngine().getScheduledExecutor().schedule(new Runnable() {
			@Override
			public void run() {
				try {
					RegionBuilder.destroyMap(instancePos[0], instancePos[1], ratioX * 8, ratioY * 8);
					if(run != null)
						run.run();
				}catch(Throwable e) {
					Logger.handle(e);
				}
			}
		}, 1800, TimeUnit.MILLISECONDS);
	}
	
	public WorldTile getTile(int x, int y) {
		return new WorldTile(instancePos[0] * 8 + x, instancePos[1] * 8 + y, 0);
	}
	
	public int[] getOriginalPos() {
		return originalPos;
	}
	
	public int getRatioX() {
		return ratioX;
	}
	
	public int getRatioY() {
		return ratioY;
	}
	
	public Stages getStage() {
		return stage;
	}
	
}
