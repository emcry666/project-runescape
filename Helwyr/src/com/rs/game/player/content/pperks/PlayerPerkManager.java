package com.rs.game.player.content.pperks;

import java.io.Serializable;
import java.util.Vector;

import com.rs.game.player.Player;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public class PlayerPerkManager implements Serializable {

	private static final long serialVersionUID = 2995657158069467668L;
	private Vector<PlayerPerks> playerPerks = new Vector<>();
	private Player player;
	
	/**
	 * Checks if the @player has <Perk>
	 * @param perk
	 * @return
	 */
	public boolean hasPerk(PlayerPerks perk) {
		return playerPerks.contains(perk);
	}
	
	/**
	 * Unlocks the <Perk> for @playerPerks
	 * @param perk
	 * @return
	 */
	public boolean unlockPerk(PlayerPerks perk) {
		if(playerPerks.contains(perk))
			return false;
		playerPerks.add(perk);
		return true;
	}
	
	/**
	 * Removes the <Perk> from @playerPerks
	 * @param perk
	 * @return
	 */
	public boolean lockPerk(PlayerPerks perk) {
		if(!playerPerks.contains(perk))
			return false;
		playerPerks.remove(perk);
		return true;
	}
	
	public Vector<PlayerPerks> getPlayerPerks() {
		return playerPerks;
	}
	
	public void setPlayerPerks(Vector<PlayerPerks> playerPerks) {
		this.playerPerks = playerPerks;
	}
	
	
	public Player getPlayer() {
		return player;
	}
	
	public Player setPlayer(Player player) {
		return this.player = player;
	}

}
