package com.rs.game.player.controlers;

import java.util.List;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import com.rs.Settings;
import com.rs.engine.GameEngine;
import com.rs.game.Animation;
import com.rs.game.RegionBuilder;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.npc.others.ZombiesNPC;
import com.rs.game.player.Player;
import com.rs.game.player.content.FadingScreen;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Logger;

/**
 * 
 * @author Adam
 * @since Aug, 1st.
 * 
 * What's good:
 * 
 * 
 * What needs to be changed:
 */

public class RecipeforDisaster extends Controler {
	
	/**
	 * 
	 * @author Adam
	 * 
	 */
	private static enum RecipeStages {
		LOADING, RUNNING, DESTROYING
	}

	public static boolean canpray = false;

	/**
	 * 
	 * @param player
	 */

	public static void enterRfd(Player player) {
		player.getControlerManager().startControler("RecipeforDisaster", 1);
	}

	public static NPC findNPC(int id) {
		for (final NPC npc : World.getNPCs()) {
			if (npc == null || npc.getId() != id)
				continue;
			return npc;
		}
		return null;
	}

	/**
	 * Data
	 */

	private int[] regionChucks;
	private RecipeStages stage;

	private boolean logoutAtEnd;

	/*
	 * 14281//135 14339//85
	 */

	private boolean login;

	public boolean spawned;

	/**
	 * Holds the Zombies
	 */

	private final int[] MONSTERS = { 3493, 3494, 3495, 3496, 3491 };

	/*
	 * logout or not. if didnt logout means lost, 0 logout, 1, normal, 2 tele
	 */
	public void exitCave(int type) {
		stage = RecipeStages.DESTROYING;
		final WorldTile outside = new WorldTile(Settings.RESPAWN_PLAYER_LOCATION);
		if (type == 0 || type == 2)
			player.setNextWorldTile(outside);
		else {
			player.setForceMultiArea(false);
			if (type == 1 || type == 4) {
				player.setNextWorldTile(outside);
				if (type == 4) {
					fade(player);
					player.reset();
					player.rfd5 = true;
					player.getBank().addItem(7461, 1, true);
					player.getBank().addItem(7462, 1, true);
					player.getPackets().sendGameMessage("A pair of gloves have been added to your bank.");
					canpray = false;
				}
			}
			canpray = false;
			removeControler();
		}

		GameEngine.slowExecutor.schedule(new Runnable() {
			@Override
			public void run() {
				RegionBuilder.destroyMap(regionChucks[0], regionChucks[1], 8, 8);
			}
		}, 1200, TimeUnit.MILLISECONDS);

	}

	/**
	 * Starts the game & loads the map.
	 * 
	 * @param login
	 */

	public void fade(final Player player) {
		final long time = FadingScreen.fade(player);
		GameEngine.slowExecutor.execute(new Runnable() {
			@Override
			public void run() {
				try {
					FadingScreen.unfade(player, time, new Runnable() {
						@Override
						public void run() {

						}
					});
				} catch (final Throwable e) {
					Logger.handle(e);
				}
			}

		});
	}

	@Override
	public void forceClose() {
		/*
		 * shouldnt happen
		 */
		if (stage != RecipeStages.RUNNING)
			return;
		exitCave(2);
	}

	/**
	 * 
	 * @return
	 */

	public int getCurrentWave() {
		if (getArguments() == null || getArguments().length == 0)
			return 0;
		return (Integer) getArguments()[0];
	}

	/**
	 * 
	 * @return
	 */

	public WorldTile getSpawnTile() {
		return getWorldTile(15, 19);
	}

	/*
	 * gets worldtile inside the map
	 */
	public WorldTile getWorldTile(int mapX, int mapY) {
		return new WorldTile(regionChucks[0] * 8 + mapX, regionChucks[1] * 8 + mapY, 2);
	}

	/*
	 * return false so wont remove script
	 */
	@Override
	public boolean logout() {
		/*
		 * only can happen if dungeon is loading and system update happens
		 */
		if (stage != RecipeStages.RUNNING)
			return false;
		exitCave(0);
		return false;

	}

	/**
	 * 
	 */

	@Override
	public void magicTeleported(int type) {
		exitCave(2);
	}

	@Override
	public void moved() {
		if (stage != RecipeStages.RUNNING || !login)
			return;
		login = false;
		setWaveEvent();
	}

	/**
	 * Sets the next wave.
	 */

	public void nextWave() {
		setCurrentWave(getCurrentWave() + 1);
		if (logoutAtEnd) {
			player.forceLogout();
			return;
		}
		setWaveEvent();
	}

	/**
	 * Processing.
	 */

	@Override
	public void process() {
		if (spawned) {
			final int currentWave = getCurrentWave();
			final int id = MONSTERS[currentWave - 1];
			boolean fighting = false;
			final List<Integer> npcsIndexes = World.getRegion(player.getRegionId()).getNPCsIndexes();
			if (npcsIndexes != null) {
				for (final int npcIndex : npcsIndexes) {
					final NPC npc = World.getNPCs().get(npcIndex);
					if (npc == null || npc.isDead() || npc.hasFinished() || npc.getId() != id) {
						continue;
					}
					fighting = true;
				}
			}
			if (!fighting) {
				spawned = false;
				nextWave();
			}
		}
	}

	/**
	 * Handles the buttons.
	 */

	@Override
	public boolean processButtonClick(int interfaceId, int componentId, int slotId, int packetId) {
		if (stage != RecipeStages.RUNNING)
			return false;
		if (interfaceId == 182 && (componentId == 6 || componentId == 13)) {
			if (!logoutAtEnd) {
				logoutAtEnd = true;
				player.sm("<col=ff0000>You will be logged out automatically at the end of this wave.");
				player.sm("<col=ff0000>If you log out sooner, you will have to repeat this wave.");
			} else
				player.forceLogout();
			return false;
		}
		return true;
	}

	/**
	 * return process normaly
	 */

	@Override
	public boolean processObjectClick1(WorldObject object) {
		if (object.getId() == 12356) {
			if (stage != RecipeStages.RUNNING)
				return false;
			exitCave(1);
			return false;
		}
		return true;
	}

	/**
	 * Death method.
	 */
	@Override
	public boolean sendDeath() {
		player.lock(7);
		player.stopAll();
		WorldTasksManager.schedule(new WorldTask() {
			int loop;

			@Override
			public void run() {
				if (loop == 0) {
					player.setNextAnimation(new Animation(836));
				} else if (loop == 1) {
					player.sm("Oh, dear you have died.");
				} else if (loop == 3) {
					player.reset();
					exitCave(1);
					player.setNextAnimation(new Animation(-1));
				} else if (loop == 4) {
					player.getPackets().sendMusicEffect(90);
					stop();
				}
				loop++;
			}
		}, 0, 1);
		return false;
	}

	/**
	 * 
	 * @param wave
	 */

	public void setCurrentWave(int wave) {
		if (getArguments() == null || getArguments().length == 0)
			this.setArguments(new Object[1]);
		getArguments()[0] = wave;
	}

	/**
	 * 
	 */
	public void setWaveEvent() {

		if (getCurrentWave() == 5)
			player.getDialogueManager().startDialogue("SimpleNPCMessage", 3491, "You DARE come here !?!?");
		GameEngine.fastExecutor.schedule(new TimerTask() {

			@Override
			public void run() {
				try {
					if (stage != RecipeStages.RUNNING)
						return;
					startWave();
				} catch (final Throwable e) {
					Logger.handle(e);
				}
			}
		}, 600);
	}

	/**
	 * Starts game
	 */
	@Override
	public void start() {
		startGame(false);
	}

	public void startGame(final boolean login) {
		fade(player);
		this.login = login;
		stage = RecipeStages.LOADING;
		player.lock(); // locks player
		canpray = true;
		GameEngine.slowExecutor.execute(new Runnable() {
			@Override
			public void run() {
				// regionChucks = RegionBuilder.findEmptyChunkBound(9, 9);
				// RegionBuilder.copyAllPlanesMap(456, 439, regionChucks[0],//
				// mhmk ima eat icecream have fun
				// regionChucks[1], 9);
				regionChucks = RegionBuilder.findEmptyChunkBound(8, 8);
				RegionBuilder.copyAllPlanesMap(235, 667, regionChucks[0], regionChucks[1], 8);// is
																								// this
																								// rightno
																								// urs
																								// is
																								// abovethes

				WorldTasksManager.schedule(new WorldTask() {
					@Override
					public void run() {
						player.setNextWorldTile(getWorldTile(10, 19));
						canpray = true;
						player.unlock();
						stage = RecipeStages.RUNNING;
					}

				}, 4);
				if (!login) {
					GameEngine.fastExecutor.schedule(new TimerTask() {

						@Override
						public void run() {
							if (stage != RecipeStages.RUNNING)
								return;
							try {
								startWave();
							} catch (final Throwable t) {
								Logger.handle(t);
							}
						}
					}, 10000);
				}
			}
		});
	}

	public void startWave() {
		final int currentWave = getCurrentWave();
		if (currentWave > MONSTERS.length) {
			win();
			return;
		}
		if (stage != RecipeStages.RUNNING)
			return;
		final int id = MONSTERS[currentWave - 1];
		final NPC npc = new ZombiesNPC(id, getSpawnTile());
		// NPC Monster = findNPC(id);
		player.getHintIconsManager().addHintIcon(npc, 0, -1, false);
		spawned = true;

		if (getCurrentWave() == 2) {
			player.rfd1 = true;
			player.getBank().addItem(7453, 1, true);
			player.getBank().addItem(7454, 1, true);
			player.getPackets().sendGameMessage("A pair of gloves have been added to your bank");
		} else if (getCurrentWave() == 3) {
			player.rfd2 = true;
			player.getBank().addItem(7455, 1, true);
			player.getBank().addItem(7456, 1, true);
			player.getPackets().sendGameMessage("A pair of gloves have been added to your bank");
		} else if (getCurrentWave() == 4) {
			player.rfd3 = true;
			player.getBank().addItem(7457, 1, true);
			player.getBank().addItem(7458, 1, true);
			player.getPackets().sendGameMessage("A pair of gloves have been added to your bank");
		} else if (getCurrentWave() == 5) {
			player.rfd4 = true;
			player.getBank().addItem(7459, 1, true);
			player.getBank().addItem(7460, 1, true);
			player.getPackets().sendGameMessage("A pair of gloves have been added to your bank");
		}
	}

	public void win() {
		if (stage != RecipeStages.RUNNING)
			return;
		exitCave(4);
	}
}
