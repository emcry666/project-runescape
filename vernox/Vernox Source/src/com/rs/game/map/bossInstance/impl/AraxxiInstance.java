package com.rs.game.map.bossInstance.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.rs.executor.GameExecutorManager;
import com.rs.game.Animation;
import com.rs.game.Graphics;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.map.bossInstance.BossInstance;
import com.rs.game.map.bossInstance.InstanceSettings;
import com.rs.game.npc.spiders.Araxxi;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class AraxxiInstance extends BossInstance {

	private  final List<Player> players = Collections.synchronizedList(new ArrayList<Player>());
	private  int webId = 0;
	private  boolean burnedWeb;
	private  long timer;
	private  boolean burningWeb;
	public int phase = 1;
	public boolean dmg = true;
	public boolean canDie = false;
	public boolean changedRamp = false;
	public boolean startedMove = false;
	public int addHp;
	public long exit = Utils.currentTimeMillis() + 60000;
	public boolean lastFight = false;
	public boolean canBeAttacked = true;
	public boolean isDoingCleave;
	public boolean isAcidic = false;
	boolean phase4Started = false;
	boolean phase2Started = false;
	boolean timerStarted = false;
	boolean transformed = false;

	Araxxi araxxi = (Araxxi) World.spawnNPC(19457, new WorldTile(0, 0, 0), -1, true);


	public AraxxiInstance(Player owner, InstanceSettings settings) {
		super(owner, settings);
	}

	@Override
	public int[] getMapPos() {
		return new int[] { 560, 776 };
	}

	public int getPlayersCount() {
		return players.size();
	}


	public List<Player> getPlayers() {
		return players;
	}

	public  void thirdPhase(){
		WorldTasksManager.schedule(new WorldTask() {
			int loop;
			WorldTile face = getTile(4555, 6264, 1);
			@Override
			public void run() {
				if (loop == 4) {
					araxxi.setNextFaceWorldTile(face);
					araxxi.setNextAnimation(new Animation(24050));
				} else if (loop == 5) {
					breakRamp();
				} else if (loop == 7){
					AraxxorTeleport();
					araxxi.setForceFollowClose(false);
					for (Player p : getPlayers()) {
						p.getPackets().sendGameMessage("<col=1fe12c>Jump over the gap!</col>");
					}

					stop();
				}
				loop++;
			}
		}, 0, 1);
	}


	public  void AraxxorTeleport(){

		WorldTasksManager.schedule(new WorldTask() {
			int loop;

			@Override
			public void run() {
				if (loop == 0) {
					araxxi.setHitpoints(50000);
					araxxi.setNextGraphics(new Graphics(4984));
					araxxi.setNextAnimation(new Animation(24056)); 
				} else if (loop == 3) {
					araxxi.setNextGraphics(new Graphics(4984));
					araxxi.setNextWorldTile(getTile(4565, 6265, 1));
					araxxi.setNextAnimation(new Animation(24076));
				} else if (loop == 5){
					phase = 3;
					araxxi.setCantInteract(false);
					stop();
				}
				loop++;
			}
		}, 0, 1);

	}


	public  void addPlayer(final Player player) {
		players.add(player);
		araxxi.addPlayer(player);
		synchronized (players) {
			if (players.size() == 1){
				processAraxx();
				beginFight();
			}
		}
	}

	public  void removePlayer(Player player) {
		synchronized (players) {
			players.remove(player);
			araxxi.removePlayer(player);
			if (players.size() == 0){
				araxxi.finish();
			}
		}
	}


	public void teleportPlayers(){
		for (Player p : getPlayers()) {
			p.setNextWorldTile(getTile(4591, 6259, 1));
		}
	}

	public void processAraxx(){
		GameExecutorManager.slowExecutor.scheduleWithFixedDelay(new Runnable() {
			@Override
			public void run() {

				if (araxxi == null){
					return;
				}
				if (getPhase() == 1 && araxxi.getX() >= getTile(4526, 6264, 1).getX() && phase2Started == false) {
					phase2Started = true;
					if (araxxi.getId() == 19457){
						araxxi.setNextNPCTransformation(19465);
					}
					if (araxxi.getId() == 19463){
						araxxi.setNextNPCTransformation(19467);
					}
					if (araxxi.getId() == 19462){
						araxxi.setNextNPCTransformation(19466);
					}
					araxxi.setHitpoints(120000);
					for (Player p : getPlayers()) {
						p.getPackets().sendGameMessage("<col=e3560e>Make your way up the ramp and continue fighting Araxxor!</col>");
					}
					phase = 2;
				}
				if (getPhase() == 2 && araxxi.getX() >= getTile(4536,1,1).getX() && araxxi.getHitpoints() <= 10000 && startedMove == false) {
					startedMove = true;
					araxxi.setCantInteract(true);
					thirdPhase();
				}
				if (getPhase() == 2 && araxxi.getX() >= getTile(4536,1,1).getX() && changedRamp == false) {
					changedRamp = true;
					changeRamp();
				}
				if (getPhase() == 3 && araxxi.getX() >= getTile(4500,1,1).getX() && araxxi.getHitpoints() <= 3000 && phase4Started == false){
					phase4Started = true;
					phase = 4;
					araxxi.setCantInteract(true);
					forceMove();
				}
			}
		}, 0, 1, TimeUnit.SECONDS);
	}


	public boolean getStartedMove(){
		return startedMove;
	}

	public boolean getChangedRamp (){
		return changedRamp;
	}

	public int getPhase() {
		return phase;
	}


	public long getExit(){
		return exit;
	}

	public void forceMove(){
		WorldTasksManager.schedule(new WorldTask() {
			int loop;
			@Override
			public void run() {
				if (loop == 0) {
					araxxi.setNextGraphics(new Graphics(4984));
					araxxi.setNextAnimation(new Animation(24056)); 
				} else if (loop == 3) {
					teleportPlayers();
					araxxi.setNextGraphics(new Graphics(4984));
					araxxi.setNextAnimation(new Animation(24076)); 
					araxxi.setNextWorldTile(getTile(4587, 6268, 1));
				} else if (loop == 5) {
					araxxi.setNextAnimation(new Animation(24062));
					araxxi.setNextGraphics(new Graphics(5000));
					araxxi.setNextWorldTile(getTile(4587, 6268, 1));

				} else if (loop == 11){
					if (getPlayersCount() >= 2){
						araxxi.setHitpoints(130000);
					}
					if (getPlayersCount() == 1){
						araxxi.setHitpoints(100000);
					}
					araxxi.setNextNPCTransformation(19464);
					araxxi.setNextWorldTile(getTile(4587, 6268, 1));
					araxxi.setCantInteract(false);
					araxxi.canDie = true;

					stop();
				}
				loop++;
			}
		}, 0, 1);
	}


	public void webTimer(){
		for (Player p : getPlayers()) {
			p.getPackets().sendGameMessage("<col=1fe12c>The web will burn down in 60 seconds!</col>");
		}

		WorldTasksManager.schedule(new WorldTask() {
			int loop;

			@Override
			public void run() {
				if (loop == 0) {

				} else if (loop == 5) {
					if (Utils.currentTimeMillis() == timer - 30000){
						for (Player p : getPlayers()) {
							p.getPackets().sendGameMessage("<col=1fe12c>The web will burn down in 30 seconds!</col>");
						}
					}


					if (Utils.currentTimeMillis() >= timer){
						removeWeb();
						araxxi.setForceFollowClose(true);
						for (Player p : getPlayers()) {
							p.getPackets().sendGameMessage("<col=e3560e>Proceed down the Path!</col>");
						}
					}
				} else if (loop == 10) {
					if (Utils.currentTimeMillis() == timer - 30000){
						for (Player p : getPlayers()) {
							p.getPackets().sendGameMessage("<col=1fe12c>The web will burn down in 30 seconds!</col>");
						}
					}


					if (Utils.currentTimeMillis() >= timer){
						removeWeb();
						araxxi.setForceFollowClose(true);
						for (Player p : getPlayers()) {
							p.getPackets().sendGameMessage("<col=e3560e>Proceed down the Path!</col>");
						}
					}
				} else if (loop == 15) {
					if (Utils.currentTimeMillis() == timer - 30000){
						for (Player p : getPlayers()) {
							p.getPackets().sendGameMessage("<col=1fe12c>The web will burn down in 30 seconds!</col>");
						}
					}


					if (Utils.currentTimeMillis() >= timer){
						removeWeb();
						araxxi.setForceFollowClose(true);
						for (Player p : getPlayers()) {
							p.getPackets().sendGameMessage("<col=e3560e>Proceed down the Path!</col>");
						}
					}
				} else if (loop == 20) {
					if (Utils.currentTimeMillis() == timer - 30000){
						for (Player p : getPlayers()) {
							p.getPackets().sendGameMessage("<col=1fe12c>The web will burn down in 30 seconds!</col>");
						}
					}


					if (Utils.currentTimeMillis() >= timer){
						removeWeb();
						araxxi.setForceFollowClose(true);
						for (Player p : getPlayers()) {
							p.getPackets().sendGameMessage("<col=e3560e>Proceed down the Path!</col>");
						}
					}
				} else if (loop == 25) {
					if (Utils.currentTimeMillis() == timer - 30000){
						for (Player p : getPlayers()) {
							p.getPackets().sendGameMessage("<col=1fe12c>The web will burn down in 30 seconds!</col>");
						}
					}


					if (Utils.currentTimeMillis() >= timer){
						removeWeb();
						araxxi.setForceFollowClose(true);
						for (Player p : getPlayers()) {
							p.getPackets().sendGameMessage("<col=e3560e>Proceed down the Path!</col>");
						}
					}
				} else if (loop == 30) {
					if (Utils.currentTimeMillis() == timer - 30000){
						for (Player p : getPlayers()) {
							p.getPackets().sendGameMessage("<col=1fe12c>The web will burn down in 30 seconds!</col>");
						}
					}


					if (Utils.currentTimeMillis() >= timer){
						removeWeb();
						araxxi.setForceFollowClose(true);
						for (Player p : getPlayers()) {
							p.getPackets().sendGameMessage("<col=e3560e>Proceed down the Path!</col>");
						}
					}
				} else if (loop == 35) {
					if (Utils.currentTimeMillis() == timer - 30000){
						for (Player p : getPlayers()) {
							p.getPackets().sendGameMessage("<col=1fe12c>The web will burn down in 30 seconds!</col>");
						}
					}


					if (Utils.currentTimeMillis() >= timer){
						removeWeb();
						araxxi.setForceFollowClose(true);
						for (Player p : getPlayers()) {
							p.getPackets().sendGameMessage("<col=e3560e>Proceed down the Path!</col>");
						}
					}
				} else if (loop == 40) {
					if (Utils.currentTimeMillis() == timer - 30000){
						for (Player p : getPlayers()) {
							p.getPackets().sendGameMessage("<col=1fe12c>The web will burn down in 30 seconds!</col>");
						}
					}


					if (Utils.currentTimeMillis() >= timer){
						removeWeb();
						araxxi.setForceFollowClose(true);
						for (Player p : getPlayers()) {
							p.getPackets().sendGameMessage("<col=e3560e>Proceed down the Path!</col>");
						}
					}
				}else if (loop == 50){
					if (Utils.currentTimeMillis() == timer - 30000){
						for (Player p : getPlayers()) {
							p.getPackets().sendGameMessage("<col=1fe12c>The web will burn down in 30 seconds!</col>");
						}
					}


					if (Utils.currentTimeMillis() >= timer){
						removeWeb();
						araxxi.setForceFollowClose(true);
						for (Player p : getPlayers()) {
							p.getPackets().sendGameMessage("<col=e3560e>Proceed down the Path!</col>");
						}
					}
				} else if (loop == 60) {  

					stop();
				}
				loop++;
			}
		}, 0, 1);

	}

	public void setTimer(){
		timer = Utils.currentTimeMillis() + 60000;
	}

	public void burnedWeb(){
		burnedWeb = true;
	}

	public boolean getBurnedWeb(){
		return burnedWeb;
	}

	public void removeWeb(){
		if (webId == 1){
			removeWebLeft();
			burnedWeb();
		}
		else if (webId == 2){
			removeWebRight();
			burnedWeb();
		}
		else if (webId == 3){
			removeWebCentral();
			burnedWeb();
		}
		return;
	}

	public void changeRamp(){
		World.spawnObject(new WorldObject(91521, 10, 0, (getTile(4536, 6260, 1))));
	}


	public void resetRamp(){
		World.spawnObject(new WorldObject(-1, 10, 0, (getTile(4555, 6261, 1))));
		World.spawnObject(new WorldObject(91520, 10, 0, (getTile(4536, 6260, 1))));
		burnedWeb = false;
		burningWeb = false;
	}

	public boolean getBurningWeb(){
		return burningWeb;
	}

	public void setBurningWeb(){
		burningWeb = true;
	}

	public void resetBurningWeb(){
		burningWeb = false;
	}

	public void breakRamp(){
		World.spawnObject(new WorldObject(91526, 10, 0, (getTile(4536, 6260, 1))));
		World.spawnObject(new WorldObject(91670, 10, 0, (getTile(4555, 6261, 1))));
	}


	public void burnWebLeft(){
		World.spawnObject(new WorldObject(91505, 10, 0, (getTile(4504, 6272, 1))));
		setBurningWeb();
		setTimer();
		webId = 1;
		webTimer();
	}


	public void burnWebRight(){
		World.spawnObject(new WorldObject(91507, 10, 0, (getTile(4507, 6248, 1))));
		setBurningWeb();
		setTimer();
		webId = 2;
		webTimer();
	}


	public void burnWebCentral(){
		World.spawnObject(new WorldObject(91506, 10, 2, (getTile(4512, 6257, 1))));
		setBurningWeb();
		setTimer();
		webId = 3;
		webTimer();
	}

	public int getWebId(){
		return webId;
	}


	public  void removeWebLeft(){
		World.spawnObject(new WorldObject(-1, 10, 0, getTile(4504, 6272, 1)));
		World.spawnObject(new WorldObject(-1, 10, 0, getTile(4504, 6275, 1)));
		World.spawnObject(new WorldObject(-1, 10, 0, getTile(4505, 6274, 1)));
		World.spawnObject(new WorldObject(-1, 10, 0, getTile(4506, 6273, 1)));
		World.spawnObject(new WorldObject(-1, 10, 0, getTile(4507, 6273, 1)));
		World.spawnObject(new WorldObject(-1, 10, 0, getTile(4508, 6272, 1)));
		World.spawnObject(new WorldObject(-1, 10, 0, getTile(4509, 6272, 1)));
	}


	public  void removeWebRight(){
		World.spawnObject(new WorldObject(-1, 10, 0, getTile(4507, 6248, 1)));
		World.spawnObject(new WorldObject(-1, 10, 0, getTile(4505, 6250, 1)));
		World.spawnObject(new WorldObject(-1, 10, 0, getTile(4506, 6251, 1)));
		World.spawnObject(new WorldObject(-1, 10, 0, getTile(4507, 6252, 1)));
		World.spawnObject(new WorldObject(-1, 10, 0, getTile(4508, 6253, 1)));
		World.spawnObject(new WorldObject(-1, 10, 0, getTile(4509, 6254, 1)));
		World.spawnObject(new WorldObject(-1, 10, 0, getTile(4510, 6255, 1)));
	}


	public  void removeWebCentral(){
		World.spawnObject(new WorldObject(-1, 10, 0, getTile(4512, 6257, 1)));
		World.spawnObject(new WorldObject(-1, 10, 0, getTile(4511, 6261, 1)));
		World.spawnObject(new WorldObject(-1, 10, 0, getTile(4512, 6259, 1)));
		World.spawnObject(new WorldObject(-1, 10, 0, getTile(4512, 6260, 1)));
		World.spawnObject(new WorldObject(-1, 10, 0, getTile(4512, 6261, 1)));
		World.spawnObject(new WorldObject(-1, 10, 0, getTile(4512, 6262, 1)));
		World.spawnObject(new WorldObject(-1, 10, 0, getTile(4512, 6263, 1)));
		World.spawnObject(new WorldObject(-1, 10, 0, getTile(4512, 6264, 1)));
		World.spawnObject(new WorldObject(-1, 10, 0, getTile(4512, 6265, 1)));
		World.spawnObject(new WorldObject(-1, 10, 0, getTile(4512, 6266, 1)));
		World.spawnObject(new WorldObject(-1, 10, 0, getTile(4512, 6267, 1)));
		World.spawnObject(new WorldObject(-1, 10, 0, getTile(4512, 6268, 1)));
		World.spawnObject(new WorldObject(-1, 10, 0, getTile(4512, 6269, 1)));
	}


	public  void addWebLeft(){
		World.spawnObject(new WorldObject(0, 10, 0, getTile(4509, 6271, 1)));
		World.spawnObject(new WorldObject(0, 10, 0, getTile(4504, 6275, 1)));
		World.spawnObject(new WorldObject(0, 10, 0, getTile(4506, 6273, 1)));
		World.spawnObject(new WorldObject(0, 10, 0, getTile(4507, 6273, 1)));
		World.spawnObject(new WorldObject(0, 10, 0, getTile(4508, 6272, 1)));
		World.spawnObject(new WorldObject(0, 10, 0, getTile(4509, 6272, 1)));
		World.spawnObject(new WorldObject(91508, 10, 0, getTile(4504, 6272, 1)));

	}

	public  void addWebRight(){
		World.spawnObject(new WorldObject(91512, 10, 0, getTile(4507, 6248, 1)));
		World.spawnObject(new WorldObject(0, 10, 0, getTile(4505, 6250, 1)));
		World.spawnObject(new WorldObject(0, 10, 0, getTile(4506, 6251, 1)));
		World.spawnObject(new WorldObject(0, 10, 0, getTile(4507, 6252, 1)));
		World.spawnObject(new WorldObject(0, 10, 0, getTile(4508, 6253, 1)));
		World.spawnObject(new WorldObject(0, 10, 0, getTile(4509, 6254, 1)));
		World.spawnObject(new WorldObject(0, 10, 0, getTile(4510, 6255, 1)));
	}


	public  void addWebCentral(){
		World.spawnObject(new WorldObject(91509, 10, 0, getTile(4511, 6261, 1)));
		World.spawnObject(new WorldObject(91669, 10, 0, getTile(4512, 6259, 1)));
		World.spawnObject(new WorldObject(91669, 10, 0, getTile(4512, 6260, 1)));
		World.spawnObject(new WorldObject(91669, 10, 0, getTile(4512, 6261, 1)));
		World.spawnObject(new WorldObject(91669, 10, 0, getTile(4512, 6262, 1)));
		World.spawnObject(new WorldObject(91669, 10, 0, getTile(4512, 6263, 1)));
		World.spawnObject(new WorldObject(91669, 10, 0, getTile(4512, 6264, 1)));
		World.spawnObject(new WorldObject(91669, 10, 0, getTile(4512, 6265, 1)));
		World.spawnObject(new WorldObject(91669, 10, 0, getTile(4512, 6266, 1)));
		World.spawnObject(new WorldObject(91669, 10, 0, getTile(4512, 6267, 1)));
		World.spawnObject(new WorldObject(91669, 10, 0, getTile(4512, 6268, 1)));
		World.spawnObject(new WorldObject(91669, 10, 0, getTile(4512, 6269, 1)));
	}


	@Override
	public int[] getMapSize() {
		return new int[] { 3, 3 };
	}

	@Override
	public void leaveInstance(Player player, int type) {
		super.leaveInstance(player, type);
	}

	public void beginFight() {
		resetRamp();
		int randomizer = Utils.random(3);

		if (randomizer == 0 && araxxi.getId() == 19457){
			araxxi.setNextNPCTransformation(19463);
		}
		if (randomizer == 1 && araxxi.getId() == 19457){
			araxxi.setNextNPCTransformation(19462);
		}
		if (randomizer == 2 && araxxi.getId() == 19457){
			araxxi.setNextNPCTransformation(19457);
		}
		WorldTasksManager.schedule(new WorldTask() {
			private int count = 0;
			@Override
			public void run() {
				if (count == 1) {
					phase = 1;
					araxxi.setNextAnimation(new Animation(24076));
					araxxi.setNextGraphics(new Graphics(4984));
					araxxi.setNextWorldTile(getTile(4505, 6263, 1));
					addWebLeft();
					addWebRight();
					addWebCentral();
				}
				if (count == 4) {
					if (araxxi != null)
						araxxi.setCantInteract(false);
					else 
						araxxi.finish();						}
				count++;
			}
		}, 0, 1);
	}


	@Override
	public void loadMapInstance() {

	}
}
