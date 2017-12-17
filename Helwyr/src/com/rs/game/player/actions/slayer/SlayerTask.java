package com.rs.game.player.actions.slayer;

import java.io.Serializable;

import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.utils.Logger;
import com.rs.utils.Utils;


public class SlayerTask implements Serializable {

	public enum Master {
		KURADAL(1597, new Object[][] {
				// slayer level | min | max | xp | cbt level
				//slayer tower
				{ "Crawling hand", 5, 50, 120, 35.0, 3 }, 
				{ "Infernal mage", 45, 25, 60, 65.0, 40 }, 
				{ "Bloodveld", 50, 30, 100, 125.0, 65 },
				{ "Jelly", 52, 54, 80, 75.0, 60 },
				{ "Gargoyle", 75, 25, 75, 225.0, 95 }, 
				{ "Nechryael", 80, 45, 85, 141.0, 95 },
				{ "Abyssal demon", 85, 25, 130, 175.5, 130 },
				{ "Dark beast", 90, 40, 75, 225.0, 130 },
				{ "Rorarius", 91, 40, 75, 240.0, 130 },
				//taverly dungeon
				{ "Hellhound", 60, 30, 60, 85.0, 70 },
				{ "Blue dragon", 46, 10, 55, 175.0, 50 },
				{ "Black dragon", 70, 10, 55, 222.0, 75 },
				{ "Black demon", 56, 10, 55, 200.0, 75 },
				{ "Lesser demon", 1, 50, 120, 45, 50 },
				{ "Baby blue dragon", 1, 50, 120, 45, 30 },
				//brimhaven dungeon
				{ "Bronze dragon", 60, 10, 55, 185.0, 100 },
				{ "Mithril dragon", 90, 10, 55, 285.0, 126 },
				{ "Fire giant", 50, 10, 55, 105.0, 55 },
				{ "Moss giant", 1, 10, 55, 85.0, 40 },
				{ "Iron dragon", 96, 1, 50, 222.0, 120 },
				{ "Steel dragon", 96, 15, 75, 255.0, 120 }, 
				//relleka dungeon
				{ "Aquanite", 78, 10, 55, 225.0, 100 },
				{ "Kurask", 70, 10, 55, 100.0, 88 },
				{ "Turoth", 55, 10, 55, 120.0, 75 },
				{ "Basilisk", 40, 10, 55, 80.0, 30 },
				{ "Pyrefiend", 30, 10, 55, 75.0, 30 },
				{ "Rockslug", 20, 10, 55, 50.0, 15 },
				{ "Cave crawler", 10, 10, 55, 45.0, 10 },
				{ "Cockatrice", 25, 10, 55, 86.0, 25 },
				//dagannoths
				{ "Dagannoth Supreme", 95, 20, 45, 225.0, 115 }, 
				{ "Dagannoth Rex", 95, 20, 40, 225.0, 115 },
				{ "Dagannoth Prime", 95, 20, 45, 225.0, 115 }, 
				//others
				{ "Glacor", 99, 25, 75, 325.0, 138 }, 
				{ "Ganodermic beast", 95, 25, 100, 360, 130 },
				{ "Cow", 1, 20, 75, 25.0, 3 }, 
				{ "Rock crab", 1, 30, 60, 40.0, 3 },
				{ "Cyclops", 1, 20, 65, 50.0, 3 }, 
				{ "Yak", 1, 30, 150, 35.0, 3 },
				{ "Mutated jadinko male", 91, 30, 85, 235.5, 110 }, 
				{ "Mutated jadinko guard", 86, 30, 85, 220.5, 110 }, 
				{ "Mutated jadinko baby", 80, 30, 85, 125.3, 80 }, 
				{ "Mature grotworm", 1, 30, 100, 275.5, 65 },
				{ "Giant Rock crab", 20, 10, 30, 65.0, 50 }, 
				{ "Greater demon", 20, 50, 85, 50.0, 40 },
				{ "Frost dragon", 99, 10, 55, 280.0, 126 },
				{ "Aviansie", 70, 50, 120, 165, 100 },
				{ "Spiritual mage", 83, 50, 120, 186, 115 },
				{ "Spiritual warrior", 65, 50, 120, 186, 100 },
				{ "Spiritual ranger", 63, 50, 120, 186, 95 },
				{ "Dust devil", 60, 50, 120, 110, 55 },
				{ "Ice giant", 1, 50, 120, 85, 40 },
				{ "Ice warrior", 1, 50, 120, 65, 25 },
				{ "Skeleton", 1, 50, 120, 30, 3 },
				{ "Ghost", 1, 50, 120, 30, 3 },
				{ "Giant bat", 1, 50, 120, 30, 3 },
				{ "Zombie", 1, 50, 120, 30, 3 },
				{ "Chaos druid", 1, 50, 120, 45, 15 },
				{ "Chaos dwarf hand cannoneer", 1, 50, 120, 75, 100 },
				{ "Chaos dwogre", 1, 50, 120, 95, 110 },
				{ "TzHaar-ket", 50, 50, 120, 140, 90 },
				{ "TzHaar-mej", 50, 50, 120, 125, 75 },
				{ "TzHaar-xil", 50, 50, 120, 125, 75 },
				{ "TzHaar-hur", 50, 50, 120, 125, 75 },
				{ "Tormented Demon", 80, 1, 5, 550.0, 126 },
				{ "Mogre", 32, 1, 5, 110.0, 55 },
				{ "Jogre", 32, 1, 5, 110.0, 55 },
				{ "Green dragon", 20, 10, 55, 150.0, 25 },
				{ "Brutal green dragon", 20, 10, 55, 155.0, 55 },
				{ "Waterfiend", 50, 10, 55, 155.0, 50 },
				{ "Skeletal wyvern", 78, 10, 55, 185.0, 115 },
				{ "Cave horror", 58, 10, 55, 155.0, 75 },
				{ "Jungle horror", 50, 10, 55, 125.0, 65 },
				{ "Hill giant", 1, 10, 55, 45.0, 25 },
				//strykewyrms
				{ "Desert strykewyrm", 77, 25, 130, 150.5, 100 },
				{ "Jungle strykewyrm", 73, 10, 55, 175.0, 90 },
				{ "Ice strykewyrm", 93, 30, 100, 225.5, 110 },
				{ "Lava strykewyrm", 97, 30, 100, 255.5, 126 },
				});

		public static Master forId(int id) {
			for (Master master : Master.values()) {
				if (master.id == id) {
					return master;
				}
			}
			return null;
		}

		private int id;

		private Object[][] data;

		private Master(int id, Object[][] data) {
			this.id = id;
			this.data = data;
		}

		public int getId() {
			return id;
		}

	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -3935672307271551069L;


	private Master master;
	private int taskId;
	private int taskAmount;

	private int amountKilled;

	public SlayerTask(Master master, int taskId, int taskAmount) {
		this.master = master;
		this.taskId = taskId;
		this.taskAmount = taskAmount;
	}

	public void decreaseAmount() {
		taskAmount--;
	}

	/**
	 * @return the amountKilled
	 */
	public int getAmountKilled() {
		return amountKilled;
	}

	public Master getMaster() {
		return master;
	}

	public String getName() {
		return (String) master.data[taskId][0];
	}

	public int getTaskAmount() {
		return taskAmount;
	}

	public int getTaskId() {
		return taskId;
	}

	public int getXPAmount() {
		Object obj = master.data[taskId][4];
		if (obj instanceof Double) {
			return (int) Math.round((Double) obj);
		}
		if (obj instanceof Integer) {
			return (Integer) obj;
		}
		return 0;
	}

	/**
	 * @param amountKilled
	 *            the amountKilled to set
	 */
	public void setAmountKilled(int amountKilled) {
		this.amountKilled = amountKilled;
	}

	public static void slayerShop(Player player) {
		player.getInterfaceManager().sendInterface(164);
		player.getPackets().sendIComponentText(164, 20, player.getSlayerPoints() + "");
		player.getPackets().sendIComponentText(164, 32, "(20 points)");
		player.getPackets().sendIComponentText(164, 33, "(1500 points)");
		player.getPackets().sendIComponentText(164, 34, "(35 points)");
		player.getPackets().sendIComponentText(164, 35, "(35 points)");
		player.getPackets().sendIComponentText(164, 36, "(35 points)");
	}
}