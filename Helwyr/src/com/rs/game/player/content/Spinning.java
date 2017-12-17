package com.rs.game.player.content;

import java.util.HashMap;
import java.util.Map;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.Animation;
import com.rs.game.WorldObject;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Action;
import com.rs.utils.Utils;


public class Spinning extends Action {

	public static final Animation SPINNING_ANIMATION = new Animation(896);
	private int quantity;
	private SpinData data;

	public static final int INGREDIENTS[] = { 
		1737, //wool, index 0
		1779, //flax, index 1
		9436, //sinew, index 2
		6051, //magic roots, index 3
		10814, //yak hair, index 4
		//oak - willow - maple - yew roots
		6043, 6045, 6047, 6049//index > 4 = index 2
		};

	public static final int PRODUCTS[][] = { 
		{1759}, //ball of wool, index 0
		{1777}, //bow string, index 1
		{9438}, //c'bow string, index 2
		{6038}, //magic string, index 3
		{954}, //rope, index 4
		};

	public enum SpinData {
		WOOL(1737, 1 , 1759, 1, 2.5),
	    FLAX(1779, 1, 1777, 1, 15),
	    SINEW(9436, 1, 9438, 10, 15),
	    MAGIC_ROOTS(6051, 1, 6038, 19, 30),
        YAK_HAIR(10814, 1 , 954, 30, 25),
        OAK_ROOTS(6043, 1, 9438, 10, 15),
        WILLOW_ROOTS(6045, 1, 9438, 10, 15),
        MAPLE_ROOTS(6047, 1, 9438, 10, 15),
        YEW_ROOTS(6049, 1, 9438, 10, 15)
        ;

		private int ingredientId, ingredientAmount, finalProduct, requiredLevel;
		private double experience;
		private String name;

		private static Map<Integer, SpinData> SpinItems = new HashMap<Integer, SpinData>();

		public static SpinData forId(int id) {
			return SpinItems.get(id);
		}

		static {
			for (SpinData SPIN : SpinData.values()) {
				SpinItems.put(SPIN.finalProduct, SPIN);
			}
		}

		private SpinData(int ingredientId, int ingredientAmount, int finalProduct,
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
					&& object.getDefinitions().name.toLowerCase().contains("spinning")) {
				player.getTemporaryAttributtes().put("SPINType", INGREDIENTS[i]);
				int index = getIndex(player);
				if (index == -1)
					return true;
				player.getDialogueManager().startDialogue("SpinningD",
						SpinData.forId(PRODUCTS[index][0]));
				return true;
			}
		}
		return false;
	}

	public static int getIndex(Player player) {
		int SPIN = (Integer) player.getTemporaryAttributtes().get(
				"SPINType");
		if (SPIN > 4)
			return 2;
		for (int i = 0; i < INGREDIENTS.length; i++)
		if (SPIN == INGREDIENTS[i])
			return i;
		return -1;
	}

	public Spinning(SpinData data, int quantity) {
		this.data = data;
		this.quantity = quantity;
	}

	@Override
	public boolean start(Player player) {
		if (!checkAll(player))
			return false;
		return true;
	}

	private boolean checkAll(Player player) {
		if (data.getFinalProduct() == 9438) {
			int[] acceptable = {9436, 6043, 6045, 6047, 6049 };
			for (int i = 0; i < acceptable.length; i++) {
				if (!player.getInventory().containsItem(acceptable[i], 1))
					continue;
				data.ingredientId = acceptable[i];
				break;
			}
		}
		if (player.getInventory().getItems().getNumberOf(data.getIngredientId()) < data
				.getIngredientAmount()) {
			player.getPackets().sendGameMessage(
					"You don't have enough "+ ItemDefinitions
					.getItemDefinitions(data.getIngredientId())
					.getName().toLowerCase() +" to make "+Utils.formatAorAn(new Item(data.getFinalProduct()))+" "
					+ItemDefinitions.getItemDefinitions(data.getFinalProduct())
					.getName().toLowerCase()+
					".");
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
				Skills.CRAFTING) < data.getRequiredLevel()) {
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
		String firstName = ItemDefinitions.getItemDefinitions(data.getIngredientId()).getName().toLowerCase();
		String name = ItemDefinitions.getItemDefinitions(data.getFinalProduct()).getName().toLowerCase();
		player.getInventory().deleteItem(data.getIngredientId(),
				data.getIngredientAmount());
		player.getInventory().addItem(data.getFinalProduct(), 1);
		player.getSkills().addXp(Skills.CRAFTING,
				data.getExperience());
		player.getPackets().sendGameMessage(
				"You spin the "+firstName+" into a "+name+".");
		quantity--;
		if (quantity <= 0)
			return -1;
		player.setNextAnimation(SPINNING_ANIMATION);
		stop(player);
		return 0;
	}

	@Override
	public void stop(final Player player) {
		setActionDelay(player, 3);
	}

}
