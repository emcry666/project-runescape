package com.rs.game.player.actions;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.Animation;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.GemCutting.Gem;

public class GemCutting extends Action {

	/**
	 * Enum for gems
	 * 
	 * @author Raghav
	 * 
	 */
	public enum Gem {
		OPAL(1625, 1609, 45, 1, 886),

		JADE(1627, 1611, 20, 33, 886),

		RED_TOPAZ(1629, 1613, 75, 16, 887),

		SAPPHIRE(1623, 1607, 150, 20, 888),

		EMERALD(1621, 1605, 187, 27, 889),

		RUBY(1619, 1603, 245, 34, 887),

		DIAMOND(1617, 1601, 307.5, 43, 890),

		DRAGONSTONE(1631, 1615, 337.5, 55, 885),

		ONYX(6571, 6573, 167.5, 67, 2717);

		private double experience;
		private int levelRequired;
		private int uncut, cut;

		private int emote;

		private Gem(int uncut, int cut, double experience, int levelRequired,
				int emote) {
			this.uncut = uncut;
			this.cut = cut;
			this.experience = experience;
			this.levelRequired = levelRequired;
			this.emote = emote;
		}

		public int getLevelRequired() {
			return levelRequired;
		}

		public double getExperience() {
			return experience;
		}

		public int getUncut() {
			return uncut;
		}

		public int getCut() {
			return cut;
		}

		public int getEmote() {
			return emote;
		}

	}

	public static void cut(Player player, Gem gem) {
		if (player.getInventory().getItems()
				.getNumberOf(new Item(gem.getUncut(), 1)) <= 1) // contains just
			player.getActionManager().setAction(new GemCutting(gem, 1));
		else
			player.getDialogueManager().startDialogue("GemCuttingD", gem);
	}

	private Gem gem;
	private int quantity;

	public GemCutting(Gem gem, int quantity) {
		this.gem = gem;
		this.quantity = quantity;
	}

	public boolean checkAll(Player player) {
		if (player.getSkills().getLevel(Skills.CRAFTING) < gem
				.getLevelRequired()) {
			player.getDialogueManager().startDialogue(
					"SimpleMessage",
					"You need a crafting level of " + gem.getLevelRequired()
					+ " to cut that gem.");
			return false;
		}
		if (!player.getInventory().containsOneItem(gem.getUncut())) {
			player.getDialogueManager().startDialogue(
					"SimpleMessage",
					"You don't have any "
							+ ItemDefinitions
							.getItemDefinitions(gem.getUncut())
							.getName().toLowerCase() + " to cut.");
			return false;
		}
		return true;
	}

	@Override
	public boolean start(Player player) {
		if (checkAll(player)) {
			setActionDelay(player, 1);
			player.setNextAnimation(new Animation(gem.getEmote()));
			return true;
		}
		return false;
	}

	@Override
	public boolean process(Player player) {
		return checkAll(player);
	}

	@Override
	public int processWithDelay(Player player) {
		player.getInventory().deleteItem(gem.getUncut(), 1);
		player.getInventory().addItem(gem.getCut(), 1);
		player.getSkills().addXp(Skills.CRAFTING, gem.getExperience());
		if (player.getDailyTask() != null)
			player.getDailyTask().incrementTask(player, 3, gem.getUncut(), Skills.CRAFTING);
		player.getPackets().sendGameMessage(
				"You cut the "
						+ ItemDefinitions.getItemDefinitions(gem.getUncut())
						.getName().toLowerCase() + ".", true);
		quantity--;
		if (quantity <= 0)
			return -1;
		player.setNextAnimation(new Animation(gem.getEmote())); // start the
		// emote and add
		// 2 delay
		return 0;
	}

	@Override
	public void stop(final Player player) {
		setActionDelay(player, 3);
	}

	public static boolean canCut(Player player, int itemId) {
		if (itemId == Gem.OPAL.getUncut()) {
			GemCutting.cut(player, Gem.OPAL);
			return true;
		}
		if (itemId == Gem.JADE.getUncut()) {
			GemCutting.cut(player, Gem.JADE);
			return true;
		}
		if (itemId == Gem.RED_TOPAZ.getUncut()) {
			GemCutting.cut(player, Gem.RED_TOPAZ);
			return true;
		}
		if (itemId == 1623) {
			GemCutting.cut(player, Gem.SAPPHIRE);
			return true;
		}
		if (itemId == Gem.EMERALD.getUncut()) {
			GemCutting.cut(player, Gem.EMERALD);
			return true;
		}
		if (itemId == Gem.RUBY.getUncut()) {
			GemCutting.cut(player, Gem.RUBY);
			return true;
		}
		if (itemId == Gem.DIAMOND.getUncut()) { 
			GemCutting.cut(player, Gem.DIAMOND);
			return true;
		}
		if (itemId == Gem.DRAGONSTONE.getUncut()) { 
			GemCutting.cut(player, Gem.DRAGONSTONE);
			return true;
		}
		if (itemId == Gem.ONYX.getUncut()) {
			GemCutting.cut(player, Gem.ONYX);
			return true;
		}
		return false;
	}
}
