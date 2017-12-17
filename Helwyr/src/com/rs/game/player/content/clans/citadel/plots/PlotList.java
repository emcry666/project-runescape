package com.rs.game.player.content.clans.citadel.plots;

import java.io.Serializable;

public class PlotList implements Serializable {


	private static final long serialVersionUID = 2817886814268749197L;

	public enum Plots {

		LOOM(0),
		
		MINING(1),

		;

		private int index;


		/**
		 * Plots parameter index
		 * @param index
		 */
		private Plots(int index) {
			this.index = index;
		}

		/**
		 * Gets the index of the quest.
		 * @return index
		 */
		public int getIndex() {
			return index;
		}


		/**
		 * Returns the plot value
		 * @param id
		 * @return plot
		 */
		public static Plots get(int id) {
			for (Plots plot : Plots.values()) {
				if (plot.getIndex() == id)
					return plot;
			}
			return null;
		}
	}


}
