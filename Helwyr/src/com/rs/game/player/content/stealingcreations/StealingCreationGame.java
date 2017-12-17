package com.rs.game.player.content.stealingcreations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.rs.engine.GameEngine;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.controlers.Controler;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class StealingCreationGame {
	
	/**
	 * TODO - 
	 * Look at barrier degrading formula
	 * Add take-item table dialogues
	 * Add enter amount dialogue
	 * 
	 * FINISHED - 
	 * Complete SC team mystic dialogue*
	 * Switching clay class types in kiln*
	 * familiars constantly spawn next to player*
	 * Make barrier attacking an action*
	 * More up to date SC timer with seconds*
	 * familiars hide in bubbles*
	 * fix pool class 2*
	 * look at pathfinding in SC*
	 * Make obstacles unusable on it's sides*
	 * Look at gathering clay formula*
	 * Add all clay familiars*
	 * Fix bubble hiding*
	 * Wear cape before game starts*
	 * reduce delays when entering/exitting barriers*
	 */

	/**
	 * Contains game area.
	 */
	private GameArea area;

	/**
	 * Contains game logic lock object.
	 */
	private Object logicLock = new Object();
	/**
	 * Contains players in blue team.
	 */
	private List<Player> blueTeam;
	/**
	 * Contains player in red team.
	 */
	private List<Player> redTeam;
	/**
	 * Contains scores.
	 */
	private Map<Player, Score> scores;

	/**
	 * Time when this game ends.
	 */
	private long endTime;
	/**
	 * Contains game state. 0 - Not started 1 - Starting 2 - Running 3 - Ending
	 * 4 - Ended
	 */
	private volatile int state;

	/**
	 * Barriers degradation tick.
	 */
	private int degradationTick;

	public StealingCreationGame(int areaSize, List<Player> blue, List<Player> red) {
		blueTeam = blue;
		redTeam = red;
		lockPeople(-1);
		scores = new HashMap<Player, Score>();
		for (Player player : blueTeam)
			scores.put(player, new Score(player.getDisplayName(), false));
		for (Player player : redTeam)
			scores.put(player, new Score(player.getDisplayName(), true));
		area = new GameArea(areaSize);
		area.calculate();
		start();
	}

	/*
	 * 0 not running 1 creating 2 game started
	 */
	/**
	 * Run's the game logic.
	 */
	public void run() {
		if (state == 2) { // stage 2 means runnning game
			if (Utils.currentTimeMillis() >= endTime) {
				stop();
				return;
			}
			synchronized (logicLock) {
				if (++degradationTick == 32) {
					playMusic();
					degradationTick = 0;
					int size = area.getSize();
					for (int x = 0; x < size; x++)
						for (int y = 0; y < size; y++)
							damageBarrier(x, y);
				}
			}
		}

	}

	public void playMusic() {
		for (Player player : blueTeam) {
			player.getMusicsManager().playMusic(578);
		}
		for (Player player : redTeam) {
			player.getMusicsManager().playMusic(578);
		}
	}

	/**
	 * Remove's given player from game.
	 */
	public void remove(Player player) {
		if (state != 2) // must be in state 2 to be removed during game lol
			return;
		synchronized (logicLock) {
			if (blueTeam.contains(player))
				blueTeam.remove(player);
			else if (redTeam.contains(player))
				redTeam.remove(player);
			player.getTemporaryAttributtes().put("SC_PENALTY", Utils.currentTimeMillis() + Helper.PENALTY_DURATION);
			Helper.sendHome(player);
			// no players on a team so game ends sooner no? ye
			if (redTeam.size() == 0 || blueTeam.size() == 0)
				stop();
		}
	}

	/**
	 * Tries to build barrier at given tile.
	 */
	public boolean buildBarrier(boolean team, int tier, int x, int y) {
		synchronized (logicLock) {
			if (area.getWallTeam(x, y) != 0)
				return false;
			displayWall(team, tier, x, y, 0);
			area.setWallTeam(x, y, team ? 2 : 1);
			area.setWallTier(x, y, tier);
			area.setWallStatus(x, y, tier * 4);
			return true;
		}
	}

	/**
	 * Tries to repair barrier at given tile.
	 */
	public boolean repairBarrier(int x, int y) {
		synchronized (logicLock) {
			if (area.getWallTeam(x, y) == 0)
				return false;

			int tier = area.getWallTier(x, y);
			int health = area.getWallStatus(x, y);
			if (health <= 0 && health >= (tier * 4))
				return false;
			int newHealth = health + 4;
			if (newHealth >= (tier * 4))
				newHealth = tier * 4;
			int newDamage = (int) (4D - (4D * ((double) newHealth / ((double) tier * 4D))));
			area.setWallStatus(x, y, newHealth);
			displayWall(area.getWallTeam(x, y) == 2 ? true : false, tier, x, y, newDamage);
			return true;
		}
	}

	/**
	 * Tries to damage barrier at given tile.
	 */
	public boolean damageBarrier(int x, int y) {
		synchronized (logicLock) {
			if (area.getWallTeam(x, y) == 0)
				return false;
			int health = area.getWallStatus(x, y);
			if (health <= 0)
				return false;
			int tier = area.getWallTier(x, y);
			int oldDamage = (int) (4D - (4D * ((double) health / ((double) tier * 4D))));
			int newHealth = health - 1;
			if (newHealth > 1) {
				int newDamage = (int) (4D - (4D * ((double) newHealth / ((double) tier * 4D))));
				area.setWallStatus(x, y, newHealth);
				if (oldDamage != newDamage)
					displayWall(area.getWallTeam(x, y) == 2 ? true : false, tier, x, y, newDamage);
			} else {
				area.setWallTeam(x, y, 0);
				area.setWallTier(x, y, 0);
				area.setWallStatus(x, y, 0);
				displayWall(false, 0, x, y, 0);
			}
			return true;
		}
	}

	/**
	 * Use's skill plot and degrades it.
	 */
	public boolean useSkillPlot(int x, int y) {
		synchronized (logicLock) {
			int type = area.getType(x, y);
			int tier = area.getTier(x, y);
			int degradation = area.getDegradation(x, y);
			if (type < 9 || type > 12 || tier < 1 || tier > 5 || degradation < 1)
				return false;
			int newDegradation = degradation - 1;
			int newLook = newDegradation > 30 ? 0 : (newDegradation > 0 ? 1 : 2);
			area.setDegradation(x, y, newDegradation);
			updateSkillPlot(x, y, newLook);
			return true;
		}
	}

	public boolean isEmpty(int x, int y) {
		return area.getDegradation(x, y) == 0;
	}

	public void updateSkillPlot(int x, int y, int look) {
		synchronized (logicLock) {
			int minX = area.getMinX() + (x << 3) + Helper.BARRIER_MIN[0];
			int minY = area.getMinY() + (y << 3) + Helper.BARRIER_MIN[1];
			int type = area.getType(x, y);
			int tier = area.getTier(x, y);
			if (type < 9 || type > 12 || tier < 1 || tier > 5)
				return;
			int[] objects = (type == 9 ? Helper.ROCK_SPOTS : (type == 10 ? Helper.TREE_SPOTS : (type == 11 ? Helper.POOL_SPOTS : Helper.SWARM_SPOTS)))[tier - 1];
			int startX = minX + Helper.PLOT_OBJECT_BASE[0];
			int startY = minY + Helper.PLOT_OBJECT_BASE[1];
			for (int testX = startX - 1; testX < (startX + 2); testX++) {
				for (int testY = startY - 1; testY < (startY + 2); testY++) {
					for (int a = 0; a < objects.length; a++) {
						WorldObject obj = World.getObjectWithId(new WorldTile(testX, testY, 0), objects[a]);
						if (obj != null) {
							if (a != look)
								World.spawnObject(new WorldObject(objects[look], obj.getType(), obj.getRotation(), obj));
							return;
						}
					}
				}
			}
		}
	}

	public void displayWall(boolean team, int tier, int x, int y, int damage) {
		synchronized (logicLock) {
			int minX = area.getMinX() + (x << 3) + Helper.BARRIER_MIN[0];
			int minY = area.getMinY() + (y << 3) + Helper.BARRIER_MIN[1];
			int maxX = area.getMinX() + (x << 3) + Helper.BARRIER_MAX[0];
			int maxY = area.getMinY() + (y << 3) + Helper.BARRIER_MAX[1];
			if (tier == 0) {
				World.spawnObject(new WorldObject(Helper.EMPTY_BARRIER1, 1, 1, new WorldTile(minX, minY, 0)));
				World.spawnObject(new WorldObject(Helper.EMPTY_BARRIER1, 1, 2, new WorldTile(minX, maxY, 0)));
				World.spawnObject(new WorldObject(Helper.EMPTY_BARRIER1, 1, 3, new WorldTile(maxX, maxY, 0)));
				World.spawnObject(new WorldObject(Helper.EMPTY_BARRIER1, 1, 0, new WorldTile(maxX, minY, 0)));
				for (x = minX + 1; x <= maxX - 1; x++) {
					World.spawnObject(new WorldObject(Helper.EMPTY_BARRIER1, 0, 1, new WorldTile(x, minY, 0)));
					World.spawnObject(new WorldObject(Helper.EMPTY_BARRIER1, 0, 3, new WorldTile(x, maxY, 0)));
				}
				for (y = minY + 1; y <= maxY - 1; y++) {
					World.spawnObject(new WorldObject(Helper.EMPTY_BARRIER1, 0, 2, new WorldTile(minX, y, 0)));
					World.spawnObject(new WorldObject(Helper.EMPTY_BARRIER1, 0, 0, new WorldTile(maxX, y, 0)));
				}
			} else {
				int wallID = team ? Helper.RED_BARRIER_WALLS[tier - 1][damage] : Helper.BLUE_BARRIER_WALLS[tier - 1][damage];
				int gate1ID = team ? Helper.RED_BARRIER_GATES[tier - 1][0] : Helper.BLUE_BARRIER_GATES[tier - 1][0];
				int gate2ID = team ? Helper.RED_BARRIER_GATES[tier - 1][1] : Helper.BLUE_BARRIER_GATES[tier - 1][1];

				World.spawnObject(new WorldObject(wallID, 0, 2, new WorldTile(minX + 0, minY + 1, 0)));
				World.spawnObject(new WorldObject(wallID, 0, 2, new WorldTile(minX + 0, minY + 4, 0)));

				World.spawnObject(new WorldObject(wallID, 0, 0, new WorldTile(maxX + 0, minY + 1, 0)));
				World.spawnObject(new WorldObject(wallID, 0, 0, new WorldTile(maxX + 0, minY + 4, 0)));

				World.spawnObject(new WorldObject(wallID, 0, 1, new WorldTile(minX + 1, minY + 0, 0)));
				World.spawnObject(new WorldObject(wallID, 0, 1, new WorldTile(minX + 4, minY + 0, 0)));

				World.spawnObject(new WorldObject(wallID, 0, 3, new WorldTile(minX + 1, maxY + 0, 0)));
				World.spawnObject(new WorldObject(wallID, 0, 3, new WorldTile(minX + 4, maxY + 0, 0)));

				// corners
				World.spawnObject(new WorldObject(wallID, 1, 1, new WorldTile(minX + 0, minY + 0, 0)));
				World.spawnObject(new WorldObject(wallID, 1, 2, new WorldTile(minX + 0, maxY + 0, 0)));
				World.spawnObject(new WorldObject(wallID, 1, 0, new WorldTile(maxX + 0, minY + 0, 0)));
				World.spawnObject(new WorldObject(wallID, 1, 3, new WorldTile(maxX + 0, maxY + 0, 0)));
				// --------

				// gates

				// west
				World.spawnObject(new WorldObject(gate1ID, 0, 2, new WorldTile(minX + 0, minY + 3, 0)));
				World.spawnObject(new WorldObject(gate2ID, 0, 2, new WorldTile(minX + 0, minY + 2, 0)));

				// east
				World.spawnObject(new WorldObject(gate2ID, 0, 0, new WorldTile(maxX + 0, minY + 3, 0)));
				World.spawnObject(new WorldObject(gate1ID, 0, 0, new WorldTile(maxX + 0, minY + 2, 0)));

				// south
				World.spawnObject(new WorldObject(gate1ID, 0, 1, new WorldTile(minX + 2, minY + 0, 0)));
				World.spawnObject(new WorldObject(gate2ID, 0, 1, new WorldTile(minX + 3, minY + 0, 0)));

				// north
				World.spawnObject(new WorldObject(gate2ID, 0, 3, new WorldTile(minX + 2, maxY + 0, 0)));
				World.spawnObject(new WorldObject(gate1ID, 0, 3, new WorldTile(minX + 3, maxY + 0, 0)));

				// --------
			}
		}

	}

	/**
	 * Update's given player score.
	 */
	public void updateScore(Player player, int dGathering, int dProcessing, int dDepositing, int dWithdrawing, int dDamaging, int dKills, int dDeaths) {
		synchronized (logicLock) {
			Score score = scores.get(player);
			if (score == null)
				return;
			score.updateGathering(dGathering);
			score.updateProcessing(dProcessing);
			score.updateDepositing(dDepositing);
			score.updateWithdrawing(dWithdrawing);
			score.updateDamaging(dDamaging);
			score.updateKilled(dKills);
			score.updateDied(dDeaths);
			Controler controler = player.getControlerManager().getControler();
			if (controler instanceof StealingCreationController)
				((StealingCreationController) controler).sendScore(score);
		}
	}

	public void sendItemToBase(Player player, Item item, boolean team, boolean BOB) {
//		Score score = getScore(player);
//		if (score == null)
//			return;
		int size = getArea().getSize();
		int[] base = Helper.findNearestBase(getArea(), player, team);
		int[] entrance;
		if ((base[0] == 0 && base[1] == 0) || (base[0] == (size - 1) && base[1] == (size - 1)))
			entrance = team ? Helper.BASE_ENTRANCE_RED : Helper.BASE_ENTRANCE_BLUE;
		else
			entrance = Helper.PLOT_ENTRANCES[Utils.random(Helper.PLOT_ENTRANCES.length)];
		String name = item.getName().toLowerCase();
		int index = Helper.getItemIndex(name);
		if (index == -1)
			return;
		WorldTile tile = new WorldTile(getArea().getMinX() + (base[0] * 8) + entrance[0], getArea().getMinY() + (base[1] * 8) + entrance[1], 0);
		objectLoop: for (WorldObject object : World.getRegion(tile.getRegionId()).getAllObjects()) {
			if (object == null || object.getId() != 39534 + index || !object.withinDistance(tile, 10))
				continue;
			int nameIndex = name.indexOf("(class");
			int clayQuality = 1;
			if (nameIndex != -1)
				clayQuality = index == 9 ? 1 : Integer.parseInt(name.substring(nameIndex).replace("(class ", "").replace(")", ""));
			//score.updateDepositing(((item.getDefinitions().isStackable() ? 1 : 30) * clayQuality) * item.getAmount());
			if (BOB)
				player.getFamiliar().getBob().getBeastItems().remove(item);
			else
				player.getInventory().deleteItem(item);
			World.addGroundItem(item, object);
			Controler controler = player.getControlerManager().getControler();
//			if (controler instanceof StealingCreationController)
//				((StealingCreationController) controler).sendScore(score);
			break objectLoop;
		}
	}

	/**
	 * Happens when game starts.
	 * 
	 * Edit*
	 */
	public void gameStartup() {
		synchronized (logicLock) {
			state = 2;
			final StealingCreationGame game = this;
			for (final Player player : blueTeam) {
				Helper.spawn(this, player, false);
				Helper.giveCape(player, false);
				WorldTasksManager.schedule(new WorldTask() {

					@Override
					public void run() {
						player.getControlerManager().startControler("StealingCreationGame", game, false);
						//Helper.giveCape(player, false);
					}
				}, 1);
			}
			for (final Player player : redTeam) {
				Helper.spawn(this, player, true);
				Helper.giveCape(player, true);
				WorldTasksManager.schedule(new WorldTask() {

					@Override
					public void run() {
						player.getControlerManager().startControler("StealingCreationGame", game, true);
						//Helper.giveCape(player, true);
					}
				}, 1);
			}
		}
	}

	/**
	 * Happens when game ends.
	 */
	public void gameShutdown() {
		synchronized (logicLock) {
			final ArrayList<Score> allScores = new ArrayList<Score>(scores.values());
			int totalBlue = Score.totalXP(allScores, false, false);
			int totalRed = Score.totalXP(allScores, true, false);
			final int winner = totalBlue > totalRed ? 1 : (totalBlue == totalRed ? 0 : 2);
			lockPeople(7);
			WorldTasksManager.schedule(new WorldTask() {
				@Override
				public void run() {
					for (Player player : blueTeam) {
						Score personal = scores.get(player);
						Helper.sendHome(player);
						Helper.displayScores(player, personal, allScores, winner, true);
						Helper.awardPoints(player, personal, winner);
					}
					for (Player player : redTeam) {
						Score personal = scores.get(player);
						Helper.sendHome(player);
						Helper.displayScores(player, personal, allScores, winner, false);
						Helper.awardPoints(player, personal, winner);

					}
					GameEngine.slowExecutor.schedule(new Runnable() {
						@Override
						public void run() {
							try {
								area.destroy();
							} catch (Throwable e) {
								e.printStackTrace();
							}
						}
					}, 1200, TimeUnit.MILLISECONDS);
				}
			}, 6);

		}
	}

	public void lockPeople(int time) {
		for (Player player : blueTeam) {
			player.lock(time);
			player.stopAll();
		}
		for (Player player : redTeam) {
			player.lock(time);
			player.stopAll();
		}
	}
	
	/**
	 * Start's game, should be called on SLOW executor.
	 */
	public synchronized void start() {
		if (state != 0)
			throw new RuntimeException("Game already running!");
		state = 1; // so it wont start again while creating area rofl
		GameEngine.slowExecutor.execute(new Runnable() {

			@Override
			public void run() {
				area.create(); // slow moethod... it should be done with slow
				// executor... this system doesnt even think
				// about it
				endTime = Utils.currentTimeMillis() + Helper.DURATION;
				gameStartup();
			}
		});
	}

	/**
	 * Stop's game, should be called on SLOW executor.
	 */
	public synchronized void stop() {
		if (state == 0)
			throw new RuntimeException("Game not running!");
		StealingCreationManager.removeGame(this);
		gameShutdown();
		state = 0;
	}

	public Score getScore(Player player) {
		return scores.get(player);
	}

	public GameArea getArea() {
		return area;
	}

	public int getState() {
		return state;
	}

	public long getEndTime() {
		return endTime;
	}

	public Object getLock() {
		return logicLock;
	}

	public List<Player> getBlueTeam() {
		return blueTeam;
	}

	public List<Player> getRedTeam() {
		return redTeam;
	}
}
