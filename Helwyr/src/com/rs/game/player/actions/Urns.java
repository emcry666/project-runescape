package com.rs.game.player.actions;

import java.util.HashMap;
import java.util.Map;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.Animation;
import com.rs.game.WorldObject;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.utils.Utils;

/**
 * 
 * @author Hc747 - www.hyperion-rsps.co.uk 
 */

public class Urns extends Action {

	public static final int WHEEL = 2642;
	public final Animation LOADING_ANIMATION = new Animation(883);
	public static final int SOFT_CLAY = 1761;
	
	private int quantity;
	private UrnData data;

	public static final int INGREDIENTS[] = {
		1761
		};

	public static final int PRODUCTS[][] = {
		{1787, 1789, 1791, 5352, 4438},//Pottery - index 0, length = 5
		{20349, 20355, 20361, 20367, 20373},//cooking urns - index 1, length = 5
		{20319, 20325, 20331, 20337, 20343},//fishing urns - index 2, length = 5
		{20379, 20385, 20391, 20397, 20403},//mining urns - index 3, length = 5
		{20409, 20415, 20421},//prayer urns - index 4, length = 3
		{20271, 20277, 20283, 20289},//smithing urns - index 5, length = 4
		{20295, 20301, 20307, 20313}//woodcutting urns - index 6, length = 4
		
	};

	public enum UrnData {
		UNFIRED_POT(1761, 1, 1787, 1, 6),
		UNFIRED_PIE_DISH(1761, 1, 1789, 7, 15),
		UNFIRED_BOWL(1761, 1, 1791, 8, 18),
		UNFIRED_PLANT_POT(1761, 1, 5352, 19, 20),
		UNFIRED_POT_LID(1761, 1, 4438, 1, 20),

		COOKING_CRACKED(1761, 2, 20349, 2, 12),
		COOKING_FRAGILE(1761, 2, 20355, 12, 16),
		COOKING_COOKING(1761, 2, 20361, 36, 28.6),
		COOKING_STRONG(1761, 2, 20367, 51, 35),
		COOKING_DECORATED(1761, 2, 20373, 81, 52),
		
		FISHING_CRACKED(1761, 2, 20319, 2, 12),
		FISHING_FRAGILE(1761, 2, 20325, 15, 20),
		FISHING_FISHING(1761, 2, 20331, 41, 31.2),
		FISHING_STRONG(1761, 2, 20337, 53, 36),
		FISHING_DECORATED(1761, 2, 20343, 76, 48),
		
		MINING_CRACKED(1761, 2, 20379, 1, 11.2),
		MINING_FRAGILE(1761, 2, 20385, 17, 21.2),
		MINING_FISHING(1761, 2, 20391, 32, 27.2),
		MINING_STRONG(1761, 2, 20397, 40, 30.8),
		MINING_DECORATED(1761, 2, 20403, 59, 38),
		
		PRAYER_IMPIOUS(1761, 2, 20409, 2, 12),
		PRAYER_ACCURSED(1761, 2, 20415, 26, 25),
		PRAYER_INFERNAL(1761, 2, 20421, 62, 40),

		SMITHING_CRACKED(1761, 2, 20271, 2, 15.4),
		SMITHING_FRAGILE(1761, 2, 20277, 17, 21.2),
		SMITHING_FISHING(1761, 2, 20283, 35, 28),
		SMITHING_STRONG(1761, 2, 20289, 49, 33.4),
		
		WOODCUTTING_CRACKED(1761, 2, 20295, 4, 15.4),
		WOODCUTTING_FRAGILE(1761, 2, 20301, 15, 20),
		WOODCUTTING_FISHING(1761, 2, 20307, 44, 32),
		WOODCUTTING_STRONG(1761, 2, 20313, 61, 38.8)
		
		;

		private int ingredientId, ingredientAmount, finalProduct, requiredLevel;
		private double experience;
		private String name;

		private static Map<Integer, UrnData> UrnItems = new HashMap<Integer, UrnData>();

		public static UrnData forId(int id) {
			return UrnItems.get(id);
		}

		static {
			for (UrnData Urn : UrnData.values()) {
				UrnItems.put(Urn.finalProduct, Urn);
			}
		}

		private UrnData(int ingredientId, int ingredientAmount, int finalProduct,
				int requiredLevel, double experience) {
			this.ingredientId = ingredientId;
			this.ingredientAmount = ingredientAmount;
			this.finalProduct = finalProduct;
			this.requiredLevel = requiredLevel;
			this.experience = experience;
			this.name = ItemDefinitions.getItemDefinitions(getFinalProduct())
					.getName();
		}

		public int getIngredientId() {
			return ingredientId;
		}

		public int getIngredientAmount() {
			return ingredientAmount;
		}

		public int getFinalProduct() {
			return finalProduct;
		}

		public int getRequiredLevel() {
			return requiredLevel;
		}

		public double getExperience() {
			return experience;
		}

		public String getName() {
			return name;
		}
	}

	public static boolean handleItemOnObject(Player player, Item itemUsed,
			WorldObject object) {
		for (int i = 0; i < INGREDIENTS.length; i++) {
			if (itemUsed.getId() == INGREDIENTS[i]
					&& object.getId() == WHEEL) {
				player.getTemporaryAttributtes().put("UrnType", INGREDIENTS[i]);
				int index = getIndex(player);
				if (index == -1)
					return true;//still needed as a check for items etc c:
				int urn = (Integer) player.getTemporaryAttributtes().get(
						"UrnType");
				if (urn == INGREDIENTS[0]) {  
					player.getDialogueManager().startDialogue("PotteryOptions");
					player.faceObject(object);
				return true;
				}
			}
		}
		return false;
	}

	public static int getIndex(Player player) {
		int urn = (Integer) player.getTemporaryAttributtes().get(
				"UrnType");
		if (urn == INGREDIENTS[0])
			return 0;
		return -1;
	}

	public Urns(UrnData data, int quantity) {
		this.data = data;
		this.quantity = quantity;
	}

	@Override
	public boolean start(Player player) {
		if (!checkAll(player))
			return false;
		player.setNextAnimation(LOADING_ANIMATION);
		setActionDelay(player, 3);
		return true;
	}

	private boolean checkAll(Player player) {
		String name = ItemDefinitions.getItemDefinitions(data.getFinalProduct())
				.getName().toLowerCase();
		if (player.getInventory().getItems().getNumberOf(data.getIngredientId()) < data
				.getIngredientAmount()) {
			player.getPackets().sendGameMessage(
					"You don't have enough "+ ItemDefinitions
					.getItemDefinitions(data.getIngredientId())
					.getName().toLowerCase() +" to do make a "
					+(name.contains("(unfired)") ? name.replace(" (unfired)", ".") : name.replace(" (unf)", ".")));
			return false;
		}
		if (!player.getInventory().containsOneItem(data.getIngredientId())) {
			player.getPackets().sendGameMessage(
					"You've ran out of "
							+ ItemDefinitions
							.getItemDefinitions(data.getIngredientId())
							.getName().toLowerCase() + "'s.");
			return false;
		}
		if (player.getSkills().getLevel(
				Skills.SMITHING) < data.getRequiredLevel()) {
			player.getPackets().sendGameMessage("You need a crafting level of " + data.getRequiredLevel()+ " to craft this.");
			return false;
		}
		return true;
	}

	@Override
	public boolean process(Player player) {
		return checkAll(player);
	}

	@Override
	public int processWithDelay(Player player) {
		String name = ItemDefinitions.getItemDefinitions(data.getFinalProduct())
				.getName().toLowerCase();
		player.getInventory().deleteItem(data.getIngredientId(),
				data.getIngredientAmount());
		player.getInventory().addItem(data.getFinalProduct(), 1);
		player.getSkills().addXp(Skills.CRAFTING,
				data.getExperience());
		player.getPackets().sendGameMessage(
				"You craft "+Utils.formatAorAn(new Item(data.getFinalProduct()))+" " + 
		(name.contains("(unfired)") ? name.replace(" (unfired)", ".") : name.replace(" (unf)", ".")), true);
		if (player.getDailyTask() != null)
			player.getDailyTask().incrementTask(player, 3, data.getFinalProduct(), Skills.CRAFTING);
		quantity--;
		if (quantity <= 0)
			return -1;
		player.setNextAnimation(LOADING_ANIMATION);
		stop(player);
		return 0;
	}

	@Override
	public void stop(final Player player) {
		setActionDelay(player, 3);
	}
	
	

}
