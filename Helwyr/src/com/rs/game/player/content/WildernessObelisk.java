package com.rs.game.player.content;

import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import com.rs.engine.GameEngine;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.player.Player;

public class WildernessObelisk {
	private static int X_COORD = 0, Y_COORD = 1;
	private static int PILLAR_LOC = 1, OBELISK_DETAILS = 0;
	private static int TELE_LOC = 0, TIMER = 1, THIS = 0;
	
	private static int[][][][] obelisk = { //yes, we could have stored these as WorldTiles, but w/e... - marc

								{
									{
										{3156, 3620}, //obelisk,  player spawn loc 
										{0} //timer , default set to 0
									}, 
									{
										{3158, 3622},  //activation pillar locations
										{3158, 3618}, 
										{3154, 3618},  
										{3154, 3622}   
									}
								}, 
								{
									{
										{3307, 3916}, 
										{0}
									}, 
									{
										{3309, 3918}, 
										{3305, 3918}, 
										{3309, 3914}, 
										{3305, 3914}}
									}, 
								{
									{
										{3106, 3794}, 
										{0}
									},
									{
										{3108, 3792}, 
										{3108, 3796}, 
										{3104, 3792}, 
										{3104, 3796}
										}
									}, 
								{
									{
										{3219, 3656}, 
										{0}
									}, 
									{
										{3221, 3658}, 
										{3221, 3654}, 
										{3217, 3658},  
										{3217, 3654}
									}
								}, 
								{
									{
										{2980, 3866}, 
										{0}
									}, 
									{
										{2982, 3868}, 
										{2978, 3868}, 
										{2982, 3864}, 
										{2978, 3864}
									}
								}
								};
	
	public static boolean handleObject(WorldObject o, Player player) {
		if(player.isTeleBlocked()) {
			player.getPackets().sendGameMessage("You are currently teleblocked.");;
			return false;
		}
		if(65609 < o.getId() && o.getId() < 65625) {
			for(int i = 0; i < getObelisk().length; i++) { //checking obelisk locations
				for(int j = 0; j < 4; j++) { //checking pillars at obelisk
					if (getObelisk()[i][PILLAR_LOC][j][X_COORD] == o.getX() &&
						getObelisk()[i][PILLAR_LOC][j][Y_COORD] == o.getY()) {
						if(getObelisk()[i][OBELISK_DETAILS][TIMER][THIS] > 0) {
							player.getPackets().sendGameMessage("You must wait " 
									+ getObelisk()[i][OBELISK_DETAILS][TIMER][THIS] + " second" 
									+ (getObelisk()[i][OBELISK_DETAILS][TIMER][THIS] > 0 ? "s" : "") 
									+ " for the ancient obelisk to recharge.");
							return true;
						}
						int xOffset = getObelisk()[i][OBELISK_DETAILS][TELE_LOC][X_COORD] - player.getX();
						int yOffset = getObelisk()[i][OBELISK_DETAILS][TELE_LOC][Y_COORD] - player.getY();
						obeliskTeleport(player, i, xOffset, yOffset);
						for (Player p : World.getPlayers()) {
							if (p != null && p != player) {
								xOffset = getObelisk()[i][OBELISK_DETAILS][TELE_LOC][X_COORD] - p.getX();
								yOffset = getObelisk()[i][OBELISK_DETAILS][TELE_LOC][Y_COORD] - p.getY();
								if(xOffset < 4  && yOffset < 4) {
									obeliskTeleport(p, i, xOffset, yOffset);
								}
							}
						}
						return true;
					}
				}
			}
			return true;
		}
		return false;
	}
	
	public static void obeliskTeleport(Player player, Integer currentObelisk, int xOffset, int yOffset) {
		int nextObelisk = currentObelisk + 1;
		if(nextObelisk >= getObelisk().length) {
			nextObelisk = 0;
		}
		//add in the object anim/gfx and player anim
		//here when you find them.
		player.setLocation(getObelisk()[nextObelisk][OBELISK_DETAILS][TELE_LOC][X_COORD] - xOffset, 
				getObelisk()[nextObelisk][OBELISK_DETAILS][TELE_LOC][Y_COORD] - yOffset, 0);
		getObelisk()[currentObelisk][OBELISK_DETAILS][TIMER][THIS] = 10;
		GameEngine.slowExecutor.scheduleWithFixedDelay(new TimerTask() {
			boolean stop = true;
			@Override
			public void run() {
				
				for(int k = 0; k < getObelisk().length; k++) {
					if(getObelisk()[k][OBELISK_DETAILS][TIMER][THIS] > 0) {
						getObelisk()[k][OBELISK_DETAILS][TIMER][THIS]--;
						stop = false;
					}
				}
				if(stop) { //checks if there are anymore 
						   //obelisk timers to maintain, if not, the task stops
					cancel();
				}
			}
			}, 0, 1, TimeUnit.SECONDS); //every second
	}
	
	public static int[][][][] getObelisk() {
		return obelisk;
	}
}
