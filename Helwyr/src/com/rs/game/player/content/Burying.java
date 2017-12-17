package com.rs.game.player.content;

import java.util.HashMap;
import java.util.Map;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.Animation;
import com.rs.game.Graphics;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

public class Burying {

	public enum Bone {
		
		NORMAL(526, 4.5),

		BURNT(528, 4.5),

		WOLF(2859, 4.5),

		MONKEY(3183, 5),
		
		MONKEY2(3179, 5),

		BAT(530, 5),

		BIG(532, 15),

		JOGRE(3125, 15),

		ZOGRE(4812, 22.5),

		SHAIKAHAN(3123, 25),

		BABY(534, 30),

		WYVERN(6812, 50),

		DRAGON(536, 72),

		FAYRG(4830, 84),

		RAURG(4832, 96),

		DAGANNOTH(6729, 125),

		OURG(4834, 140),

		AIRUT(30209, 132.5),
		
		FROST_DRAGON(18830, 180)
		,
		FROST_DRAGON_2(18832, 180)

		, IMPIOUS(20264, 4, true)

		, ACCURSED(20266, 12.5, true)

		, INFERNAL(20268, 62.5, true);

		private int id;
		private double experience;
		private boolean ash;

		private static Map<Integer, Bone> bones = new HashMap<Integer, Bone>();

		static {
			for (Bone bone : Bone.values()) {
				bones.put(bone.getId(), bone);
			}
		}

		public static Bone forId(int id) {
			return bones.get(id);
		}

		private Bone(int id, double experience, boolean ash) {
			this.id = id;
			this.experience = experience;
			this.ash = ash;
		}

		private Bone(int id, double experience) {
			this.id = id;
			this.experience = experience;
		}

		public int getId() {
			return id;
		}

		public boolean isAsh() {
			return ash;
		}

		public double getExperience() {
			return experience;
		}

		public static final Animation BURY_ANIMATION = new Animation(827);

		public static void bury(final Player player, int inventorySlot) {
			final Item item = player.getInventory().getItem(inventorySlot);
			if (item == null)
				return;
			final Bone bone = Bone.forId(item.getId());
			if (bone == null)
				return;
			final ItemDefinitions itemDef = new ItemDefinitions(item.getId());
			player.lock(2);
			switch (item.getId()) {
			case 20264:
				player.setNextAnimation(new Animation(445));
				player.setNextGraphics(new Graphics(56));
				break;
			case 20266:
				player.setNextAnimation(new Animation(445));
				player.setNextGraphics(new Graphics(47));
				break;
			case 20268:
				player.setNextAnimation(new Animation(445));
				player.setNextGraphics(new Graphics(40));
				break;
			default:
				player.setNextAnimation(BURY_ANIMATION);
				break;
			}

			player.getPackets().sendGameMessage(bone.ash ? "You scatter the ashes in the wind." : "You dig a hole in the ground...", true);
			WorldTasksManager.schedule(new WorldTask() {
				@Override
				public void run() {
					if (!bone.ash)
						player.getPackets().sendGameMessage("You bury the " + itemDef.getName().toLowerCase(), true);
					player.getInventory().deleteItem(item.getId(), 1);
					double xp = bone.getExperience() * player.getAuraManager().getPrayerMultiplier();
					player.getSkills().addXp(Skills.PRAYER, xp);
					player.incrementCount(itemDef.getName() + " buried");
					Double lastPrayer = (Double) player.getTemporaryAttributtes().get("current_prayer_xp");
					if (lastPrayer == null) {
						lastPrayer = 0.0;
					}
					double total = xp + lastPrayer;
					int amount = (int) (total / 500);
					if (amount != 0) {
						double restore = player.getAuraManager().getPrayerRestoration() * (player.getSkills().getLevelForXp(Skills.PRAYER) * 10);
						player.getPrayer().restorePrayer((int) (amount * restore));
						total -= amount * 500;
					}
					player.getTemporaryAttributtes().put("current_prayer_xp", total);
					stop();
				}

			});
		}
	}

	public static void handleNecklaces(Player player, int itemId) {
		ItemDefinitions itemDef = ItemDefinitions.getItemDefinitions(itemId);
		int prayerGain = 0;
		if (itemDef.getName().toLowerCase().contains("dragon") || itemDef.getName().toLowerCase().contains("ourg")) {
			switch (player.getEquipment().getAmuletId()) {
			case 19888:
				prayerGain = 300;
				break;
			case 19887:
			case 19886:
				prayerGain = 10;
				break;
			default:
				break;
			}
		} else if (itemDef.getName().toLowerCase().contains("big")) {
			switch (player.getEquipment().getAmuletId()) {
			case 19888:
			case 19887:
				prayerGain = 200;
				break;
			case 19886:
				prayerGain = 10;
				break;
			default:
				break;
			}
		} else if (itemDef.getName().toLowerCase().equals("bones")) {
			switch (player.getEquipment().getAmuletId()) {
			case 19888:
			case 19887:
			case 19886:
				prayerGain = 100;
				break;
			default:
				break;
			}
		}
		player.getPrayer().restorePrayer(prayerGain);
	}
}
