package com.rs.game.player.actions;

import com.rs.game.Animation;
import com.rs.game.player.actions.Fletching.Fletch;

public class Bowstringing {
	public static final int KNIFE = 946, CHISLE = 1755, BOW_STRING = 1777, CROSSBOW_STRING = 9438;
	public static final int DUNGEONEERING_KNIFE = 17754, DUNGEEONEERING_BOW_STRING = 17752, DUNGEONEERING_HEADLESS = 17747;

	public static enum Fletch {

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

		private Fletch(int id, int selected, int[] product, int level[], double[] xp, Animation anim) {
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
}
