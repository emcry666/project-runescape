package com.rs.game.player.content;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

import com.rs.game.item.Item;
import com.rs.game.player.Player;

public class RepairItems {

	public enum BrokenItems {
		// Main structure NAME(Broken itemId, degrading id, repaired
		// itemId,Price to repair
		// it)
		MORRIGAN_TOP(-1, 13872, 13870, 5000000),

		MORRIGAN_BOTTOM(-1, 13875, 13873, 5000000),

		MORRIGAN_COIF(-1, 13878, 13876, 5000000),

		STATIUS_BODY(-1, 13886, 13884, 5000000),

		STATIUS_LEGS(-1, 13892, 13890, 5000000),

		STATIUS_HELM(-1, 13896, 13898, 5000000),

		STATIUS_HAMMER(-1, 13900, 13902, 5000000),

		VESTA_BODY(-1, 13889, 13887, 5000000),

		VESTA_SKIRT(-1, 13895, 13893, 5000000),

		VESTA_LONG(-1, 13901, 13899, 5000000),

		VESTA_SPEAR(-1, 13907, 13905, 5000000),

		ZURIEL_TOP(-1, 13860, 13858, 5000000),

		ZURIEL_BOTTOM(-1, 13863, 13861, 5000000),

		ZURIEL_HOOD(-1, 13866, 13854, 5000000),

		ZURIEL_STAFF(-1, 13869, 13857, 5000000),

		GUTHANS_HELM(4908, -1, 4724, 1000000),

		GUTHANS_PLATEBODY(4920, -1, 4738, 1000000),

		GUTHANS_PLATESKIRT(4926, -1, 4730, 1000000),

		GUTHANS_WARSPEAR(4914, -1, 4726, 1000000),

		AHRIMS_HOOD(4860, -1, 4708, 1000000),

		AHRIMS_STAFF(4866, -1, 4710, 1000000),

		AHRIMS_ROBE_TOP(4872, -1, 4712, 1000000),

		AHRIMS_ROBE_SKIRT(4878, -1, 4714, 1000000),

		DHAROKS_HELM(4884, -1, 4716, 1000000),

		DHAROKS_GREATAXE(4890, -1, 4718, 1000000),

		DHAROKS_PLATEBODY(4896, -1, 4720, 1000000),

		DHAROKS_PLATELEGS(4902, -1, 4722, 1000000),

		KARILS_COIF(4932, -1, 4732, 1000000),

		KARILS_CROSSBOW(4938, -1, 4734, 1000000),

		KARILS_TOP(4944, -1, 4736, 1000000),

		KARILS_SKIRT(4950, -1, 4738, 1000000),

		TORAGS_HELM(4956, -1, 4745, 1000000),

		TORAGS_HAMMER(4962, -1, 4747, 1000000),

		TORAGS_PLATEBODY(4968, -1, 4749, 1000000),

		TORAGS_PLATELEGS(4974, -1, 4751, 1000000),

		VERACS_HELM(4980, -1, 4753, 1000000),

		VERACS_FLAIL(4968, -1, 4755, 1000000),

		VERACS_BRASSARD(4992, -1, 4757, 1000000),

		VERACS_PLATESKIRT(4998, -1, 4759, 1000000),

		TORVA_HELM(20138, 20137, 20135, 5000000),

		TORVA_PLATE(20142, 20141, 20139, 5000000),

		TORVA_LEGS(20146, 20145, 20143, 5000000),

		TORVA_GLOVES(24979, 20178, 24977, 5000000),

		TORVA_BOOTS(24985, 20184, 24983, 5000000),

		PERNIX_COWL(20150, 20149, 20147, 5000000),

		PERNIX_BODY(20154, 20153, 20151, 5000000),

		PERNIX_CHAPS(20158, 20157, 20155, 5000000),

		PERNIX_GLOVES(24976, 24975, 24974, 5000000),

		PERNIX_BOOTS(24991, 24990, 24989, 5000000),

		ZARYTE_BOW(20174, 20173, 20171, 7500000),

		VIRTUS_MASK(20162, 20161, 20159, 5000000),

		VIRTUS_TOP(20166, 20165, 20163, 5000000),

		VIRTUS_LEGS(20170, 20169, 20167, 5000000),

		VIRTUS_GLOVES(24982, 20181, 24980, 5000000),

		VIRTUS_BOOTS(24988, 20187, 24986, 5000000);

		private static Map<Integer, BrokenItems> BROKENITEMS = new HashMap<Integer, BrokenItems>();

		private static Map<Integer, BrokenItems> DEGRADEDITEMS = new HashMap<Integer, BrokenItems>();

		static {
			for (final BrokenItems brokenitems : BrokenItems.values()) {
				if (brokenitems.getBrokenId() != -1)
					BROKENITEMS.put(brokenitems.getBrokenId(), brokenitems);
				if (brokenitems.getDegradedId() != -1)
					DEGRADEDITEMS.put(brokenitems.getDegradedId(), brokenitems);
			}
		}

		public static BrokenItems forBrokenId(int id) {
			return BROKENITEMS.get(id);
		}

		public static BrokenItems forDegradedId(int id) {
			return DEGRADEDITEMS.get(id);
		}

		private final int brokenId, degradedId, fixedId;

		private final int price;

		private BrokenItems(int brokenId, int degradedId, int fixedId, int price) {
			this.brokenId = brokenId;
			this.degradedId = degradedId;
			this.fixedId = fixedId;
			this.price = price;
		}

		public int getBrokenId() {
			return brokenId;
		}

		public int getDegradedId() {
			return degradedId;
		}

		public int getFixedId() {
			return fixedId;
		}

		public int getFullRepairPrice() {
			return price;
		}

		public int getPrice(Player player, int itemId) {
			return itemId == degradedId ? getDegradedPrice(player, this) : price;
		}

	}

	public static void CheckPrice(Player player, int itemId, int amount) {
		BrokenItems brokenitems = BrokenItems.forBrokenId(itemId);
		if (brokenitems == null)
			brokenitems = BrokenItems.forDegradedId(itemId);
		final int price = brokenitems.getPrice(player, itemId);
		player.getDialogueManager().startDialogue("SimpleNPCMessage", 945, "These items will cost you " + getFormattedNumber(price * amount) + " coins.");
		return;
	}

	public static int getDegradedPrice(Player player, BrokenItems brokenitems) {
		final double charges = player.getCharges().getCharges(brokenitems.getDegradedId());
		final int maxPrice = brokenitems.getFullRepairPrice();
		if (charges == 0)
			return maxPrice;
		int discount = (int) (maxPrice * (charges / getTotalCharges(brokenitems.getDegradedId())));
		if (discount > maxPrice)
			discount = maxPrice;
		return maxPrice - discount;
	}

	private static String getFormattedNumber(int amount) {
		return new DecimalFormat("#,###,##0").format(amount).toString();
	}

	// return amt of charges
	public static double getTotalCharges(int id) {
		// pvp armors
		if (id >= 13910 && id <= 13952)
			return 1500;
		if (id >= 13960 && id <= 13975)
			return 3000;
		if ((id >= 14094 && id <= 14121) || (id >= 21527 && id <= 21530))
			return 1800;
		if (id >= 13860 && id <= 13960)
			return 30000; // 5 hours
		// nex armors
		if (id >= 20137 && id <= 20173)
			return 60000;
		return 1;// keep it positive for getDegradedPrice
	}

	public static void Repair(Player player, int itemId, int amount) {
		BrokenItems brokenitems = BrokenItems.forBrokenId(itemId);
		if (brokenitems == null)
			brokenitems = BrokenItems.forDegradedId(itemId);
		final Item item = new Item(itemId, 1);
		final int price = brokenitems.getPrice(player, itemId);
		if (amount == 1) {
			if (player.getMoneyPouch().getCoinsAmount() >= price * amount) {
				player.getInventory().deleteItem(itemId, 1);
				player.getMoneyPouch().removeFromMoneyPouch(price * amount);
				player.getInventory().addItem(brokenitems.getFixedId(), 1);
				player.getDialogueManager().startDialogue("SimpleMessage", "You have repaired your item(" + item.getName() + ") for " + getFormattedNumber(price) + " coins.");
				return;
			} else {
				player.getDialogueManager().startDialogue("SimpleMessage", "You dont have enough money to repair this item." + "You need " + getFormattedNumber(price) + " coins.");
				return;
			}
		} else {
			if (player.getMoneyPouch().getCoinsAmount() >= price * amount) {
				player.getInventory().deleteItem(itemId, amount);
				player.getMoneyPouch().removeFromMoneyPouch(price * amount);
				player.getInventory().addItem(brokenitems.getFixedId(), amount);
				player.getDialogueManager().startDialogue("SimpleMessage", "You have repaired your items(" + amount + " X " + item.getName() + ") for " + getFormattedNumber(price * amount) + " coins.");
				return;
			} else {
				player.getDialogueManager().startDialogue("SimpleMessage", "You dont have enough money to repair these items." + "You need " + getFormattedNumber(price * amount) + " coins.");
				return;
			}
		}
	}

}