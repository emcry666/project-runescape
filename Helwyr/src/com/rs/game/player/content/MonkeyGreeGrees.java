package com.rs.game.player.content;

import java.util.HashMap;
import java.util.Map;

import com.rs.game.player.Player;

/**
 * @author Miles Black (bobismyname)
 */

public class MonkeyGreeGrees {

	public static enum GreeGree {

		SMALL_NINJA(4024, 1480, "Ninja"), LARGE_NINJA(4025, 1481, "Ninja"), GORILLA(4026, 1482, "Gorilla"), BEARDED_GORILLA(4027, 1483, "Gorilla"), BLUE_GORILLA(4028, 1484, "Gorilla"), SMALL_ZOMBIE(4029, 1485, "Zombie"), LARGE_ZOMBIE(4030, 1486, "Zombie"), KARAMJA(4031, 1487, "Karamja");

		public static Map<Integer, GreeGree> greegrees = new HashMap<Integer, GreeGree>();

		static {
			for (final GreeGree greegree : GreeGree.values()) {
				greegrees.put(greegree.itemId, greegree);
			}
		}

		public static GreeGree forId(int id) {
			return greegrees.get(id);
		}

		private final int itemId;
		private final int npcId;
		private final String type;

		GreeGree(int itemId, int npcId, String type) {
			this.itemId = itemId;
			this.npcId = npcId;
			this.type = type;
		}

		public int getItemId() {
			return itemId;
		}

		public int getNpcId() {
			return npcId;
		}

		public String getType() {
			return type;
		}
	}

	public static void checkMovement(Player player) {
		if (player.getAppearence().getTransformedNpcId() == -1) {
			return;
		}
		if (GreeGree.forId(player.getEquipment().getWeaponId()) != null) {
			final GreeGree monkey = GreeGree.forId(player.getEquipment().getWeaponId());
			if (!isAtApeAtoll(player) && player.getAppearence().getTransformedNpcId() == monkey.getNpcId()) {
				player.getAppearence().transformIntoNPC(-1);
				player.sm("You transform back into a human.");
			}
		}
	}

	public static boolean isAtApeAtoll(Player player) {
		return (player.getX() >= 2693 && player.getX() <= 2821 && player.getY() >= 2693 && player.getY() <= 2817);
	}

	public static boolean transform(Player player, int itemId) {
		player.sm("ItemId:" + itemId);
		if (GreeGree.forId(itemId) != null) {
			final GreeGree monkey = GreeGree.forId(itemId);
			if (!isAtApeAtoll(player)) {
				player.sm("You have to be in Ape Atoll in order to transform into a monkey.");
				return true;
			}
			player.getAppearence().transformIntoNPC(monkey.getNpcId());
			player.sm("You transform into a " + monkey.getType().toLowerCase() + " monkey.");
			return true;
		}
		return false;
	}

}
