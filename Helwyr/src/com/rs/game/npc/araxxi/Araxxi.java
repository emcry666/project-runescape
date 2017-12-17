package com.rs.game.npc.araxxi;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

public class Araxxi extends NPC {

	private static final long serialVersionUID = 8957425938871772845L;

	private  final List<Player> players = Collections.synchronizedList(new ArrayList<Player>());
	public boolean dmg = true;
	public boolean canDie = false;
	public int addHp;
	public boolean lastFight = false;
	public boolean canBeAttacked = true;
	public boolean isDoingCleave;
	public boolean isAcidic = false;


	public Araxxi(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea, boolean spawned) {
		super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		setLureDelay(Integer.MAX_VALUE);
		setRun(true);
		setIntelligentRouteFinder(true);
		setHitpoints(50000);
		setForceAgressive(true);
		setCapDamage(750);
	}


	public int getPlayersCount() {
		return players.size();
	}


	public List<Player> getPlayers() {
		return players;
	}


	public  void addPlayer(final Player player) {
		synchronized (players) {
			players.add(player);
		}
	}

	public  void removePlayer(Player player) {
		synchronized (players) {
			players.remove(player);
		}
	}


	@Override
	public void processNPC() {
		if (isDead())
			return;
		super.processNPC();
	}


	@Override
	public void handleIngoingHit(Hit hit) {
		super.handleIngoingHit(hit);

		if (hit.getSource() != null && getId() == 1) {
			int dmg = (int) (hit.getDamage());
			heal(dmg);
		}
		if (hit.getLook() == HitLook.MELEE_DAMAGE){
			if (getId() == 19464){
				hit.setDamage(hit.getDamage() / 2);
			}
			if (getId() == 19457 || getId() == 19465){//MELEE ID
				hit.setDamage(hit.getDamage()/2);
			}
			if (getId() == 19463 || getId() == 19467){//RANGE ID
				hit.setDamage(hit.getDamage());
			}
			if (getId() == 19462 || getId() == 19466){//MAGE ID
				hit.setDamage(hit.getDamage() / 3);
			}
		}


		if (hit.getLook() == HitLook.RANGE_DAMAGE){
			if (getId() == 19464){
				hit.setDamage(hit.getDamage() / 2);
			}
			if (getId() == 19457 || getId() == 19465){//MELEE ID
				hit.setDamage(hit.getDamage()/3);
			}
			if (getId() == 19463 || getId() == 19467){//RANGE ID
				hit.setDamage(hit.getDamage()/2);
			}
			if (getId() == 19462 || getId() == 19466){//MAGE ID
				hit.setDamage(hit.getDamage());
			}
		}
		if (hit.getLook() == HitLook.MAGIC_DAMAGE){
			if (getId() == 19464){
				hit.setDamage(hit.getDamage() / 2);
			}
			if (getId() == 19457 || getId() == 19465) {//MELEE ID
				hit.setDamage(hit.getDamage());
			}
			if (getId() == 19463 || getId() == 19467) {//RANGE ID
				hit.setDamage(hit.getDamage() / 3);
			}
			if (getId() == 19462 || getId() == 19466) {//MAGE ID
				hit.setDamage(hit.getDamage() / 2);
			}
		}
		if (hit.getSource() != null && !canBeAttacked) {
			hit.setDamage(0);
		}

	}

	@Override
	public void processEntity() {
		super.processEntity();
	}

	void resetCounts() {
		dmg = false;
	}

	@Override
	public double getMagePrayerMultiplier() {
		return 0.5;
	}

	@Override
	public double getRangePrayerMultiplier() {
		return 0.5;
	}

	@Override
	public double getMeleePrayerMultiplier() {
		return 0.5;
	}


	@Override
	public void sendDeath(Entity p) {
		if (getId() == 19464) {
			setNextAnimation(new Animation(24106));
			if (canDie == false) {


			} else {
				int loop;
				WorldTasksManager.schedule(new WorldTask() {
					@Override
					public void run() {
						//drop();
						reset();
						finish();
						stop();
						World.spawnObject(new WorldObject(91673, 10, 0, (getLastWorldTile())));
					}
				}, 6);
			}
		} else {
			setHitpoints(10000);
		}
	}


}