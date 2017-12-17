package com.rs.game.player.content.bot.action.impl;

import com.rs.Settings;
import com.rs.game.WorldTile;
import com.rs.game.player.Player;
import com.rs.game.player.content.bot.Bot;

/**
 * Used for "building" artificial intelligent players.
 * @author Emperor
 */
public final class AIPBuilder {

	/**
	 * Creates a new artificial intelligent player.
	 * @param name The name.
	 * @return The Bot object.
	 */
	public static Bot create(String name, WorldTile l) {
		return  new Bot(name, name, new WorldTile(l)).startup();
	}

	/**
	 * Makes an artificial intelligent copy of the player.
	 * @param player The player.
	 * @return The artificial intelligent player with the same name, stats,
	 * items, etc.
	 */
	/*public static Bot copy(Player player) {
		return copy(player, player.getName(), player.getLocation());
	}*/

	/**
	 * Makes an artificial intelligent copy of the player.
	 * @param player The player.
	 * @param l The location the AIP should spawn on.
	 * @return The artificial intelligent player with the same name, stats,
	 * items, etc.
	 */
	public static Bot copy(Player player, WorldTile l) {
		return copy(player, player.getName(), l);
	}

	/**
	 * Makes an artificial intelligent copy of the player.
	 * @param player The player.
	 * @param name The AIP's name.
	 * @param l The location the AIP should spawn on.
	 * @return The artificial intelligent player with the same name, stats,
	 * items, etc.
	 */
	public static Bot copy(Player player, String name, WorldTile l) {
		Bot p = new Bot(name, name, l);
		/*p.getSkills().copy(player.getSkills());
		p.getInventory().copy(player.getInventory());
		p.getEquipment().copy(player.getEquipment());
		p.getBank().copy(player.getBank());
		p.getAppearence().copy(player.getAppearence());*/
		//p.setControler(player);
		return p;
	}
}