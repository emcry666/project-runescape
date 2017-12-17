package com.rs.game.player.actions.slayer;

import com.rs.game.WorldTile;
import com.rs.game.player.Player;
import com.rs.game.player.content.Magic;

/**
 * 
 * @author Yambar_
 *
 */

public class TaskTeleport {

	public static void teleport(Player player) {
		switch (player.getSlayerManager().getCurrentTask().getName().toLowerCase()) {
		case "yak":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2323, 3797, 0));
			break;
		case "cow":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3251, 3266, 0));
			break;
		case "cyclops":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2859, 3542, 2));
			break;
		case "crawling hand":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3411, 3544, 0));
			break;
		case "giant rock crab":
		case "rock crab":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2703, 3715, 0));
			break;
		case "infernal mage":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3435, 3572, 1));
			break;
		case "blue dragon":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2922, 9803, 0));
			break;
		case "mature grotworm":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(1205, 6507, 0));
			break;
		case "lava strykewyrm":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3077, 3867, 0));
			break;
		case "gargoyle":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3434, 3550, 2));
			break;
		case "mutated jadinko baby":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3020, 9254, 0));
			break;
		case "mutated jadinko guard":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3043, 9265, 0));
			break;
		case "mutated jadinko male":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3060, 9244, 0));
			break;
		case "kalphite":
		case "kalphite worker":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3420, 9510, 0));
			break;
		case "dagannoth supreme":
		case "dagannoth prime":
		case "dagannoth rex":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2915, 4449, 0));
			break;
		case "iron dragon":
		case "steel dragon":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2710, 9464, 0));
			break;
		case "glacor":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(4190, 5717, 0));
			break;
		case "greater demon":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3089, 10095, 0));
			break;
		case "hellhound":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2856, 9850, 0));
			break;
		case "bloodveld":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3411, 3573, 1));
			break;
		case "jelly":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3424, 3557, 0));
			break;
		case "nechryael":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3440, 3565, 2));
			break;
		case "abyssal demon":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3417, 3566, 2));
			break;
		case "dark beast":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3421, 3551, 2));
			break;
		case "ganodermic beast":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(4628, 5404, 0));
			break;
		case "frost dragon":
			if (player.getSkills().getLevel(24) < 85) {
				player.sm("You need a dungeoneering level of 85 to teleport to frost dragons.");
				return;
			}
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(1658, 5257, 0));
			break;
		case "green dragon":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3334, 3676, 0));
			break;
		case "skeleton":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3253, 9916, 0));
			break;
		case "zombie":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3246, 9892, 0));
			break;
		case "ghost":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3241, 9915, 0));
			break;
		case "giant bat":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2908, 9833, 0));
			break;
		case "black demon":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2871, 9781, 0));
			break;
		case "lesser demon":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2934, 9798, 0));
			break;
		case "bronze dragon":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2741, 9492, 0));
			break;
		case "mithril dragon":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(1778, 5343, 0));
			break;
		case "adamant dragon":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(1127, 4503, 0));
			break;
		case "runite dragon":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(1127, 4503, 0));
			break;
		case "desert strykewyrm":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3381, 3166, 0));
			break;
		case "jungle strykewyrm":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2449, 2896, 0));
			break;
		case "ice strykewyrm":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3422, 5668, 0));
			break;
		case "waterfiend":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(1749, 5338, 0));
			break;
		case "brutal green dragon":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(1774, 5338, 0));
			break;
		case "skeletal wyvern":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3054, 9552, 0));
			break;
		case "cave horror":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3741, 9373, 0));
			break;
		case "jungle horror":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3680, 3013, 0));
			break;
		case "aviansie":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2864, 5291, 0));
			break;
		case "spiritual mage":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2896, 5287, 0));
			break;
		case "spiritual ranger":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2896, 5287, 0));
			break;
		case "spiritual warrior":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2896, 5287, 0));
			break;
		case "mogre":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2865, 9494, 0));
			break;
		case "jogre":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2833, 9520, 0));
			break;
		case "dust devil":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3171, 5514, 0));
			break;
		case "ice giant":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3053, 9576, 0));
			break;
		case "ice warrior":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3053, 9576, 0));
			break;
		case "chaos druid":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2933, 9849, 0));
			break;
		case "dagannoth":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2443, 10147, 0));
			break;
		case "chaos dwogre":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(1504, 4705, 0));
			break;
		case "chaos dwarf hand cannoneer":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(1504, 4705, 0));
			break;
		case "icefield":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3020, 3474, 0));
			break;
		case "hill giant":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3115, 9844, 0));
			break;
		case "tzhaar-ket":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(4702, 5129, 0));
			break;
		case "tzhaar-mej":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(4702, 5129, 0));
			break;
		case "tzhaar-xil":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(4702, 5129, 0));
			break;
		case "fire giant":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2663, 9495, 0));
			break;
		case "moss giant":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2660, 9556, 0));
			break;
		case "tormented demon":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2569, 5737, 0));
			break;
		case "aquanite":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2721, 9969, 0));
			break;
		case "cockatrice":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2792, 10033, 0));
			break;
		case "cave crawler":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2791, 9996, 0));
			break;
		case "rockslug":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2797, 10019, 0));
			break;
		case "pyrefiend":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2760, 10010, 0));
			break;
		case "basilisk":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2745, 10006, 0));
			break;
		case "turoth":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2724, 10007, 0));
			break;
		case "kurask":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2703, 9996, 0));
			break;
		case "aberrant spectre":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3435, 3551, 1));
			break;
		case "banshee":
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3433, 3564, 0));
			break;
		default:
			player.sm("You need a task to be able to teleport.");
			break;
		}
	}

}
