package com.rs.game.player.controlers.bosses;

import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.player.MusicsManager;
import com.rs.game.player.content.instancing.bossInstance.BossInstance;
import com.rs.game.player.content.instancing.bossInstance.BossInstanceHandler.Boss;
import com.rs.game.player.content.instancing.bossInstance.impl.AraxxiInstance;
import com.rs.game.player.controlers.Controler;
import com.rs.game.player.controlers.events.DeathEvent;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class AraxxiInstanceController extends Controler {

	private BossInstance instance;


	@Override
	public void start() {
		instance = (BossInstance) getArguments()[0]; //cant save this as not serializable would null :L
		getArguments()[0] = instance.getBoss(); //gotta save reference for which instance im at
		getRotsInstance().addPlayer(player);
	}

	@Override
	public void process() {
		if (instance != null && Utils.currentWorldCycle() % 120 == 0)
			instance.playMusic(player);
	}

	@Override
	public boolean login() {
		player.setNextWorldTile(new WorldTile(3699, 3418, 0));
		return true;
	}

	public BossInstance getInstance() {
		return instance;
	}


	@Override
	public boolean processObjectClick1(WorldObject object) {
		if (object.getId() == 91670) {
			player.setNextWorldTile(getRotsInstance().getTile(4561, 6264, 1));
		}
		if (object.getId() == 91667 && getRotsInstance().getBurningWeb()) {
			player.getPackets().sendGameMessage("<col=e66810>This path is currently disabled! Use the Central Path");
			return true;
		}
		if (object.getId() == 91667 && getRotsInstance().getBurningWeb()) {
			player.getPackets().sendGameMessage("<col=e66810>A web is already on fire!");
			return true;
		}
		if (object.getId() == 91668 && getRotsInstance().getBurningWeb())   {
			player.getPackets().sendGameMessage("<col=e66810>This path is currently disabled! Use the Central Path");
			return true;
		}
		if (object.getId() == 91668 && getRotsInstance().getBurningWeb()) {
			player.getPackets().sendGameMessage("<col=e66810>A web is already on fire!");
			return true;
		}
		if (object.getId() == 91669 && !getRotsInstance().getBurningWeb()) {
			getRotsInstance().burnWebCentral();
			getRotsInstance().setBurningWeb();
			return true;

		}
		if (object.getId() == 91669 && getRotsInstance().getBurningWeb()) {
			player.getPackets().sendGameMessage("<col=e66810>A web is already on fire!");
			return true;
		}
		return true;
	}



	@Override
	public boolean sendDeath() {
		getRotsInstance().removePlayer(player);
		player.lock(8);
		player.stopAll();
		WorldTasksManager.schedule(new WorldTask() {
			int loop;

			@Override
			public void run() {
				if (loop == 0) {
					player.setNextWorldTile(instance.getBoss().getOutsideTile());
					player.setNextAnimation(player.getDeathAnimation());
				}
				else if (loop == 3) {
					instance.leaveInstance(player, BossInstance.DIED);
					removeControler();
					if (instance.getSettings().getBoss() == Boss.Araxxi) {
						player.reset();
						player.setNextWorldTile(instance.getBoss().getOutsideTile());
					}
					else {

						WorldTile graveStoneLoc = instance.getBoss().getGraveStoneTile();
						if (graveStoneLoc == null)
							graveStoneLoc = instance.isPublic() ? new WorldTile(player) : instance.getBoss().getOutsideTile();
					}
				}
				else if (loop == 4) {
					player.getMusicsManager().playMusic(90);
					stop();
				}
				loop++;
			}
		}, 0, 1);
		return false;
	}

	@Override
	public boolean logout() {
		getRotsInstance().removePlayer(player);
		instance.leaveInstance(player, BossInstance.EXITED);
		if (!instance.isPublic())
			removeControler();
		return false; //false. it will remove script normaly if needed
	}

	//controller stopped for some reason or in purpose
	@Override
	public void forceClose() {
		removeControler();
		if (instance != null)
			instance.leaveInstance(player, BossInstance.EXITED);
	}

	@Override
	public boolean processMagicTeleport(WorldTile toTile) {
		removeControler();
		instance.leaveInstance(player, BossInstance.EXITED);
		return true;
	}




	@Override
	public boolean processItemTeleport(WorldTile toTile) {
		removeControler();
		instance.leaveInstance(player, BossInstance.EXITED);
		return true;
	}


	public AraxxiInstance getRotsInstance() {
		return (AraxxiInstance) getInstance();
	}


}
