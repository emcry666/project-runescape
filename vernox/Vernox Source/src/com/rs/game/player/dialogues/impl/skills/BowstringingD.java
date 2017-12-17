package com.rs.game.player.dialogues.impl.skills;

import com.rs.Settings;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.Animation;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Action;
import com.rs.game.player.actions.Fletching;
import com.rs.game.player.actions.Fletching.Fletch;
import com.rs.game.player.dialogues.Dialogue;

public class BowstringingD extends Action{
    public static final int KNIFE = 946, CHISLE = 1755, BOW_STRING = 1777, CROSSBOW_STRING = 9438;
	public static final int DUNGEONEERING_KNIFE = 17754, DUNGEEONEERING_BOW_STRING = 17752, DUNGEONEERING_HEADLESS = 17747;
    public static enum Bowstringing {

	/**
	 * (u)'s and completed bows
	 */

	STRUNG_SHORT_BOW(50, 1777, new int[]
	{ 841 }, new int[]
	{ 5 }, new double[]
	{ 5 }, new Animation(6678)),

	STRUNG_LONG_BOW(48, 1777, new int[]
	{ 839 }, new int[]
	{ 10 }, new double[]
	{ 10 }, new Animation(6684)),


	STRUNG_OAK_SHORT_BOW(54, 1777, new int[]
	{ 843 }, new int[]
	{ 20 }, new double[]
	{ 16.5 }, new Animation(6679)),

	STRUNG_OAK_LONG_BOW(56, 1777, new int[]
	{ 845 }, new int[]
	{ 25 }, new double[]
	{ 25 }, new Animation(6685)),


	STRUNG_WILLOW_SHORT_BOW(60, 1777, new int[]
	{ 849 }, new int[]
	{ 35 }, new double[]
	{ 33.3 }, new Animation(6680)),

	STRUNG_WILLOW_LONG_BOW(58, 1777, new int[]
	{ 847 }, new int[]
	{ 40 }, new double[]
	{ 41.5 }, new Animation(6686)),


	STRUNG_MAPLE_SHORT_BOW(64, 1777, new int[]
	{ 853 }, new int[]
	{ 50 }, new double[]
	{ 50 }, new Animation(6681)),

	STRUNG_MAPLE_LONG_BOW(62, 1777, new int[]
	{ 851 }, new int[]
	{ 55 }, new double[]
	{ 58.3 }, new Animation(6687)),

	STRUNG_YEW_SHORT_BOW(68, 1777, new int[]
	{ 857 }, new int[]
	{ 65 }, new double[]
	{ 67.5 }, new Animation(6682)),

	STRUNG_YEW_LONG_BOW(66, 1777, new int[]
	{ 855 }, new int[]
	{ 70 }, new double[]
	{ 75 }, new Animation(6688)),

	STRUNG_MAGIC_SHORT_BOW(72, 1777, new int[]
	{ 861 }, new int[]
	{ 80 }, new double[]
	{ 83.25 }, new Animation(6683)),

	STRUNG_MAGIC_LONG_BOW(70, 1777, new int[]
	{ 859 }, new int[]
	{ 85 }, new double[]
	{ 91.5 }, new Animation(6689));
	
	public static Fletch forId(int id) {
		for (Fletch fletch : Fletch.values()) {
			if (id == fletch.getId())
				return fletch;
		}
		return null;
	}

	private int[] product, level;
	private int id, selected;
	private double[] xp;
	private Animation anim;

	private Bowstringing(int id, int selected, int[] product, int level[], double[] xp, Animation anim) {
		this.id = id;
		this.product = product;
		this.selected = selected;
		this.xp = xp;
		this.anim = anim;
		this.level = level;
	}

	public int getId() {
		return id;
	}

	public int getSelected() {
		return selected;
	}

	public int[] getProduct() {
		return product;
	}

	public int[] getLevel() {
		return level;
	}

	public double[] getXp() {
		return xp;
	}

	public Animation getAnim() {
		return anim;
	}
}
    
	private Bowstringing bowstring;
	private int option, ticks;

	public BowstringingD(Bowstringing bowstring, int option, int ticks) {
		this.bowstring = bowstring;
		this.option = option;
		this.ticks = ticks;
	}

	@Override
	public boolean start(Player player) {
		if (option >= bowstring.getProduct().length)
			return false;
		if (!process(player))
			return false;
		
		player.getPackets().sendGameMessage("You attempt to create a " + new Item(bowstring.getProduct()[option]).getDefinitions().getName().replace("(u)", "") + "...", true);
		return true;
	}

	@Override
	public boolean process(Player player) {
		if (ticks <= 0)
			return false;
		boolean stackable1 = ItemDefinitions.getItemDefinitions(bowstring.getSelected()).isStackable();
		int amount = stackable1 ? 15 : 1;
		int amount2 = bowstring.getSelected() != Fletching.DUNGEONEERING_KNIFE && ItemDefinitions.getItemDefinitions(bowstring.getId()).isStackable() ? 15 : 1;
		if (stackable1) {
			int amt1 = player.getInventory().getAmountOf(bowstring.getSelected());
			int amt2 = player.getInventory().getAmountOf(bowstring.getId());
			if (amt1 < amount) {
				amount = amt1;
				amount2 = amt1;
			}
			if (amt2 < amount2) {
				amount = amt2;
				amount2 = amt2;
			}
			if (amt1 == 0 || amt2 == 0)
				return false;
		}
		if (!player.getInventory().containsItemToolBelt(bowstring.getSelected(), amount) || !player.getInventory().containsItemToolBelt(bowstring.getId(), amount2)) {
			return false;
		}
		if (player.getSkills().getLevel(Skills.FLETCHING) < bowstring.getLevel()[option]) {
			player.getPackets().sendGameMessage("You need a level of " + bowstring.getLevel()[option] + " to fletch this.");
			return false;
		}
		return true;
	}

	public static boolean maxMakeQuantityTen(Fletch fletch) {
		return ItemDefinitions.getItemDefinitions(fletch.getId()).isStackable() && (fletch.getSelected() == CHISLE || ItemDefinitions.getItemDefinitions(fletch.getSelected()).isStackable());
	}

	@Override
	public int processWithDelay(Player player) {
		ticks--;
		player.setNextAnimation(bowstring.getAnim());

		boolean stackable1 = ItemDefinitions.getItemDefinitions(bowstring.getSelected()).isStackable();
		int amount = stackable1 ? 15 : 1;
		int amount2 = bowstring.getSelected() != Fletching.DUNGEONEERING_KNIFE && ItemDefinitions.getItemDefinitions(bowstring.getId()).isStackable() ? 15 : 1;
		int amount3 = ItemDefinitions.getItemDefinitions(bowstring == bowstring.STRUNG_LONG_BOW ? 5 : bowstring.getProduct()[option]).isStackable() ? 15 : 1;
		if (stackable1) {
			int amt1 = player.getInventory().getAmountOf(bowstring.getSelected());
			int amt2 = player.getInventory().getAmountOf(bowstring.getId());
			if (amt1 < amount) {
				amount = amt1;
				amount2 = amt1;
				amount3 = amt1;
			}
			if (amt2 < amount2) {
				amount = amt2;
				amount2 = amt2;
				amount3 = amt2;
			}
		}
		
		player.getInventory().deleteItem(bowstring.getId(), amount2);
		if (bowstring.getSelected() != KNIFE && bowstring.getSelected() != DUNGEONEERING_KNIFE && bowstring.getSelected() != CHISLE)
			player.getInventory().deleteItem(bowstring.getSelected(), amount);
		if (amount3 > 1)
			amount3 *= Settings.getCraftRate();
		player.getInventory().addItem(bowstring.getProduct()[option], amount3);
		player.getPackets().sendGameMessage("You successfully create a " + new Item(bowstring.getProduct()[option]).getDefinitions().getName().replace("(u)", "") + ".", true);
		player.getSkills().addXp(Skills.FLETCHING, bowstring.getXp()[option]);
		player.getPackets().sendGameMessage("You attempt to create a " + new Item(bowstring.getProduct()[option]).getDefinitions().getName().replace("(u)", ""), true);
		return 4;
	}

	@Override
	public void stop(final Player player) {
		setActionDelay(player, 3);
	}
	
	public static void fletch(Player player, int productId, int quantity) {
		for(Bowstringing bowstring : Bowstringing.values()) {
			for(int i = 0; i < bowstring.product.length; i++) {
				if(bowstring.product[i] == productId) {
					player.getActionManager().setAction(new BowstringingD(bowstring, i, quantity));
					break;
				}
			}
		}
	}
    
    

}
