package com.rs.game.player.controlers;

import com.rs.game.Animation;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.player.actions.Slayer;
import com.rs.game.player.content.LightSource;
import com.rs.utils.Utils;

public class UnderGroundDungeon extends Controler {

	transient int ticks;
	boolean hasStench, requiresLightSource;
	transient boolean initial;

	@Override
	public void start() {
		init();
		setArguments(null);
	}

	private void init() {
		if (this.getArguments() != null) {
			hasStench = (boolean) this.getArguments()[0];
			requiresLightSource = (boolean) this.getArguments()[1];
		}
		ticks = 0;
		initial = true;
		sendInterfaces();
	}

	@Override
	public void sendInterfaces() {
		if (requiresLightSource) {
			boolean hasLight = LightSource.hasLightSource(player);
			player.getInterfaceManager().setOverlay(
					hasLight ? (LightSource.hasExplosiveSource(player) ? 98
							: 97) : 96, true);
			if (!hasLight)
				player.getPackets().sendBlackOut(2);
			else
				player.getPackets().sendBlackOut(0);
		}
	}

	private void checkRequriments() {
		boolean lastInitial = initial;
		if (hasStench) {
			if (!Slayer.hasNosepeg(player) && !Slayer.hasMask(player)) {
				if (initial)
					player.getPackets()
							.sendGameMessage(
									"The stench of the monsters begins to reach your nose..");
				initial = false;
			} else
				initial = true;
		}
		if (requiresLightSource) {
			if (!LightSource.hasLightSource(player)) {
				if (initial)
					player.getPackets()
							.sendGameMessage(
									"You hear tiny insects skittering over the ground...");
				initial = false;
			} else
				initial = true;
		}
		if (lastInitial != initial)
			sendInterfaces();
	}

	@Override
	public void process() {
		checkRequriments();
		if (initial)
			return;
		ticks++;
		if (hasStench) {
			if (ticks % 12 == 0) {
				player.getPackets().sendGameMessage(
						"The strench of the monsters burns your innards.");
				player.applyHit(new Hit(player, 200, HitLook.REGULAR_DAMAGE));
			}
		}
		if (requiresLightSource) {
			if (ticks % 2 == 0) {
				if (!LightSource.hasLightSource(player)) {
					if (!player.isLocked())
						player.applyHit(new Hit(player, Utils.random(10, 100),
								HitLook.REGULAR_DAMAGE));
				}
			}
		}
	}

	@Override
	public boolean processObjectClick1(final WorldObject object) {
		if (object.getId() == 31316) {
			player.useStairs(-1, new WorldTile(3360, 2971, 0), 1, 2);
			player.getControlerManager().forceStop();
			return false;
		} else if (object.getId() == 5946) {
			player.useStairs(828, new WorldTile(3168, 3171, 0), 1, 2);
			player.getControlerManager().forceStop();
			return false;
		} else if (object.getId() == 32944) {
			player.useStairs(-1, new WorldTile(3219, 9532, 2), 1, 2);
			player.getControlerManager().forceStop();
			return false;
			/*
			 * } else if (object.getId() == 31435) { return false;
			 */
		} else if (object.getId() == 15811) {
			player.useStairs(-1, new WorldTile(3749, 2973, 0), 1, 2);
			return false;
		} else if (object.getId() == 15790) {
			if (object.getX() == 3829)
				player.useStairs(-1, new WorldTile(3831, 3062, 0), 1, 2);
			if (object.getX() == 3814)
				player.useStairs(-1, new WorldTile(3816, 3062, 0), 1, 2);
			player.getControlerManager().forceStop();
			return false;
		} else if (object.getId() == 15812) {
			player.useStairs(-1, new WorldTile(3749, 2973, 0), 1, 2);
			player.getControlerManager().forceStop();
			return false;
		} else if (object.getId() == 6912) {
			player.setNextAnimation(new Animation(10578));
			player.useStairs(-1, object, 1, 2);
			player.useStairs(10579, new WorldTile(player.getX(),
					player.getY() == 9601 ? player.getY() + 2
							: player.getY() - 2, 0), 1, 2);
			return false;
		} else if (object.getId() == 6899) {
			player.setNextAnimation(new Animation(10578));
			player.useStairs(-1, object, 1, 2);
			player.useStairs(10579, new WorldTile(3219, 9618, 0), 1, 2);
			player.getControlerManager().forceStop();
			player.getPackets()
					.sendGameMessage("You squeeze through the hole.");
			return false;
		} else if (object.getId() == 6439) {
			player.useStairs(828, new WorldTile(3310, 2961, 0), 1, 2);
			player.getControlerManager().forceStop();
			return false;
		} else if (object.getId() == 31390) {
			player.useStairs(-1, new WorldTile(3318, 9355, 0), 1, 2,
					"You tumble into the darkness, arriving on a different cave level.");
			return false;
		} else if (object.getId() == 31367) {
			player.useStairs(-1, new WorldTile(3338, 9350, 0), 1, 2,
					"You tumble into the darkness, arriving on a different cave level.");
			return false;
		} else if (object.getId() == 31435) { // Polln. Slayer Dungeon Barriers
												// - Top Floor
			if (object.getX() == 3347 && object.getY() == 9374) {
				if (player.getX() == 3348) {
					player.setNextWorldTile(new WorldTile(3346, 9375, 0));
				} else if (player.getX() == 3346) {
					player.setNextWorldTile(new WorldTile(3348, 9375, 0));
				}
			}
			if (object.getX() == 3349 && object.getY() == 9420) {
				if (player.getX() == 3350) {
					player.setNextWorldTile(new WorldTile(3348, 9421, 0));
				} else if (player.getX() == 3348) {
					player.setNextWorldTile(new WorldTile(3350, 9421, 0));
				}
			}
			if (object.getX() == 3368 && object.getY() == 9420) {
				if (player.getX() == 3367) {
					player.setNextWorldTile(new WorldTile(3369, 9421, 0));
				} else if (player.getX() == 3369) {
					player.setNextWorldTile(new WorldTile(3367, 9421, 0));
				}
			}
			if (object.getX() == 3370 && object.getY() == 9374) {
				if (player.getX() == 3369) {
					player.setNextWorldTile(new WorldTile(3371, 9375, 0));
				} else if (player.getX() == 3371) {
					player.setNextWorldTile(new WorldTile(3369, 9375, 0));
				}
			}
			return false;
		} else if (object.getId() == 31436) { // Polln. Slayer Dungeon Barriers
												// - Bottom Floor
			if (object.getX() == 3276 && object.getY() == 4372) { // North West
																	// Barrier
				if (player.getY() == 4371) {
					player.setNextWorldTile(new WorldTile(3277, 4373, 0));
				} else if (player.getY() == 4373) {
					player.setNextWorldTile(new WorldTile(3277, 4371, 0));
				}
			}
			if (object.getX() == 3318 && object.getY() == 4371) { // North East
																	// Barrier
				if (player.getY() == 4370) {
					player.setNextWorldTile(new WorldTile(3319, 4372, 0));
				} else if (player.getY() == 4372) {
					player.setNextWorldTile(new WorldTile(3319, 4370, 0));
				}
			}
			if (object.getX() == 3314 && object.getY() == 4334) { // South East
																	// Barrier
				if (player.getY() == 4335) {
					player.setNextWorldTile(new WorldTile(3315, 4333, 0));
				} else if (player.getY() == 4333) {
					player.setNextWorldTile(new WorldTile(3315, 4335, 0));
				}
			}
			if (object.getX() == 3274 && object.getY() == 4334) { // South West
																	// Barrier
				if (player.getY() == 4335) {
					player.setNextWorldTile(new WorldTile(3275, 4333, 0));
				} else if (player.getY() == 4333) {
					player.setNextWorldTile(new WorldTile(3275, 4335, 0));
				}
			}
			return false;
		} else if (object.getId() == 31412) { // Polln. Slayer Dungeon Stairs -
												// Top Floor
			if (object.getX() == 3377 && object.getY() == 9367)
				; // South East Stairs
			player.setNextWorldTile(new WorldTile(3322, 4340, 0));
			if (object.getX() == 3374 && object.getY() == 9426)
				; // North East Stairs
			player.setNextWorldTile(new WorldTile(3321, 4365, 0));
			if (object.getX() == 3338 && object.getY() == 9368)
				; // South West Stairs
			player.setNextWorldTile(new WorldTile(3270, 4340, 0));
			if (object.getX() == 3340 && object.getY() == 9426)
				; // North West Stairs
			player.setNextWorldTile(new WorldTile(3276, 4368, 0));
			return false;
		} else if (object.getId() == 31417) { // Polln. Slayer Dungeon Stairs -
												// Bottom Floor
			if (object.getX() == 3318 && object.getY() == 4339)
				; // South East Stairs
			player.setNextWorldTile(new WorldTile(3376, 9368, 0));
			if (object.getX() == 3317 && object.getY() == 4364)
				; // North East Stairs
			player.setNextWorldTile(new WorldTile(3373, 9427, 0));
			if (object.getX() == 3271 && object.getY() == 4339)
				; // South West Stairs
			player.setNextWorldTile(new WorldTile(3342, 9369, 0));
			if (object.getX() == 3277 && object.getY() == 4367)
				; // North West Stairs
			player.setNextWorldTile(new WorldTile(3344, 9427, 0));
			return false;
		} else if (object.getId() == 31363) { // Polln. Slayer Dungeon Pulsing
												// Markings - Bottom Floor
			if (object.getX() == 3295 && object.getY() == 4407) { // North West
																	// Marking
				if (player.getY() == 4406 || player.getY() == 4407
						|| player.getY() == 4408) {
					player.setNextWorldTile(new WorldTile(3325, 4391, 0));
				}
			}
			if (object.getX() == 3325 && object.getY() == 4391) { // North East
																	// Marking
				if (player.getY() == 4390 || player.getY() == 4391
						|| player.getY() == 4392) {
					player.setNextWorldTile(new WorldTile(3295, 4407, 0));
				}
			}
			if (object.getX() == 3288 && object.getY() == 4293) { // South West
																	// Marking
				if (player.getX() == 3287 || player.getX() == 3288) {
					player.setNextWorldTile(new WorldTile(3294, 4293, 0));
				}
			}
			if (object.getX() == 3294 && object.getY() == 4293) { // South East
																	// Marking
				if (player.getX() == 3293 || player.getX() == 3294
						|| player.getX() == 3295) {
					player.setNextWorldTile(new WorldTile(3288, 4293, 0));
				}
				return false;
			}
		}
		return true;
	}

	@Override
	public void magicTeleported(int type) {
		player.getControlerManager().forceStop();
	}

	@Override
	public void forceClose() {
		player.getPackets().sendBlackOut(0);
		player.getInterfaceManager().removeOverlay(true);
	}

	@Override
	public boolean login() {
		init();
		return false;
	}

	@Override
	public boolean logout() {
		return false;
	}
}
