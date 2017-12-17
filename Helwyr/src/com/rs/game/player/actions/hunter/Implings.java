package com.rs.game.player.actions.hunter;

import java.util.HashMap;
import java.util.Map;

import com.rs.game.Animation;
import com.rs.game.ForceTalk;
import com.rs.game.Graphics;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.npc.NPC;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class Implings {

	public static final Animation CAPTURE_ANIMATION = new Animation(6606);

	public enum FlyingEntities {

		BABY_IMPLING(1028, 11238, 17, 25, 17, new Item[] { new Item(946, 1),
				new Item(1755, 1), new Item(1734, 1), new Item(1733, 1),
				new Item(2347, 1), new Item(1985, 1) }, null, null, null, 15),

		YOUNG_IMPLING(1029, 11240, 24, 65, 22, new Item[] { new Item(361, 1),
				new Item(1901, 1), new Item(1539, 5), new Item(1784, 4),
				new Item(1523, 1), new Item(7936, 1), new Item(5970, 1) },
				new Item[] { new Item(855, 1), new Item(1353, 1),
						new Item(2293, 1), new Item(7178, 1), new Item(247, 1),
						new Item(453, 1), new Item(1777, 1), new Item(231, 1),
						new Item(2347, 1) }, new Item[] { new Item(1097, 1),
						new Item(1157, 1), new Item(8778, 1), new Item(133, 1),
						new Item(2359, 1), }, null, 35),

		GOURMET_IMPLING(1030, 11242, 30, 113, 28, null, null, null, null, 55),

		EARTH_IMPLING(1031, 11244, 39, 177, 36, null, null, null, null, 75),

		ESSENCE_IMPLING(1032, 11246, 45, 225, 42, null, null, null, null, 95),

		ECLECTIC_IMPLING(1033, 11248, 56, 289, 50, null, null, null, null, 115),

		SPIRIT_IMPLING(7904, 15513, 63, 321, 54, null, null, null, null, 135),

		NATURE_IMPLING(1034, 11250, 69, 353, 58, null, null, null, null, 1000),

		MAGPIE_IMPLING(1035, 11252, 78, 409, 65, null, null, null, null, 1300),

		NINJA_IMPLING(6053, 11254, 94, 481, 74, null, null, null, null, 1300),

		PIRATE_IMPLING(7845, 13337, 124, 497, 76, null, null, null, null, 1400),

		DRAGON_IMPLING(6054, 11256, 150, 553, 83, null, null, null, null, 7800),

		ZOMBIE_IMPLING(7902, 15515, 198, 585, 87, null, null, null, null, 120),

		KINGLY_IMPLING(
				7903,
				15517,
				350,
				617,
				91,
				new Item[] { new Item(1705, Utils.random(3, 11)),
						new Item(1684, 3),
						new Item(1618, Utils.random(17, 34)), new Item(990, 2) },
				new Item[] { new Item(1631, 1), new Item(1615, 1),
						new Item(9341, 40 + Utils.getRandom(30)),
						new Item(9342, 57), new Item(15511, 1),
						new Item(15509, 1), new Item(15505, 1),
						new Item(15507, 1), new Item(15503, 1),
						new Item(11212, 40 + Utils.random(104)),
						new Item(9193, 62 + Utils.random(8)),
						new Item(11230, Utils.random(182, 319)),
						new Item(11232, 70),
						new Item(1306, Utils.random(1, 2)), new Item(1249, 1) },
				null, new Item[] { new Item(7158, 1), new Item(2366, 1),
						new Item(6571, 1) }, 30800),

		BUTTERFLYTEST(1, 1, 434, 617, 91, null, null, null, null, 1) {

			@Override
			public void effect(Player player) {
				// stat boost
			}
		};

		static final Map<Short, FlyingEntities> flyingEntities = new HashMap<Short, FlyingEntities>();

		static {
			for (FlyingEntities impling : FlyingEntities.values())
				flyingEntities.put((short) impling.reward, impling);
		}

		public static FlyingEntities forItem(short reward) {
			return flyingEntities.get(reward);
		}

		private int npcId, level, reward, spawn;
		private double puroExperience, rsExperience;
		private Item[] rarleyCommon, common, rare, extremelyRare;
		private Graphics graphics;

		private FlyingEntities(int npcId, int reward, double puroExperience,
				double rsExperience, int level, Graphics graphics,
				Item[] rarleyCommon, Item[] common, Item[] rare,
				Item[] extremelyRare, int spawn) {
			this.npcId = npcId;
			this.reward = reward;
			this.puroExperience = puroExperience;
			this.rsExperience = rsExperience;
			this.level = level;
			this.rarleyCommon = rarleyCommon;
			this.common = common;
			this.rare = rare;
			this.extremelyRare = extremelyRare;
			this.graphics = graphics;
			this.spawn = spawn;
		}

		private FlyingEntities(int npcId, int reward, double puroExperience,
				double rsExperience, int level, Item[] rarleyCommon,
				Item[] common, Item[] rare, Item[] extremelyRare, int spawn) {
			this.npcId = npcId;
			this.reward = reward;
			this.puroExperience = puroExperience;
			this.rsExperience = rsExperience;
			this.level = level;
			this.rarleyCommon = rarleyCommon;
			this.common = common;
			this.rare = rare;
			this.extremelyRare = extremelyRare;
			this.spawn = spawn;
		}

		public int getNpcId() {
			return npcId;
		}

		public int getSpawn() {
			return spawn;
		}

		public int getLevel() {
			return level;
		}

		public int getReward() {
			return reward;
		}

		public double getPuroExperience() {
			return puroExperience;
		}

		public double getRsExperience() {
			return rsExperience;
		}

		public Item[] getRarleyCommon() {
			return rarleyCommon;
		}

		public Item[] getCommon() {
			return common;
		}

		public Item[] getRare() {
			return rare;
		}

		public Item[] getExtremelyRare() {
			return extremelyRare;
		}

		public Graphics getGraphics() {
			return graphics;
		}

		public void effect(Player player) {

		}
	}
	
	public 	final static WorldTile[] respawn = { new WorldTile(2598, 4319, 0),
			new WorldTile(2593, 4312, 0),
			new WorldTile(2584, 4319, 0),
			new WorldTile(2582, 4321, 0),
			new WorldTile(2589, 4330, 0),
			new WorldTile(2602, 4326, 0),
			new WorldTile(2602, 4310, 0),
			new WorldTile(2588, 4304, 0),
			new WorldTile(2581, 4316, 0),
			new WorldTile(2578, 4316, 0),
			new WorldTile(2585, 4307, 0),
			new WorldTile(2599, 4306, 0),
			new WorldTile(2605, 4312, 0),
			new WorldTile(2610, 4310, 0),
			new WorldTile(2607, 4325, 0),
			new WorldTile(2599, 4335, 0),
			new WorldTile(2586, 4336, 0),
			new WorldTile(2576, 4334, 0),
			new WorldTile(2572, 4332, 0),
			new WorldTile(2573, 4317, 0),
			new WorldTile(2576, 4305, 0),
			new WorldTile(2588, 4305, 0),
			new WorldTile(2588, 4298, 0),
			new WorldTile(2601, 4298, 0),
			new WorldTile(2614, 4300, 0),
			new WorldTile(2615, 4315, 0),
			new WorldTile(2610, 4332, 0),
			new WorldTile(2598, 4342, 0),
			new WorldTile(2584, 4350, 0),
			new WorldTile(2569, 4344, 0),
			new WorldTile(2564, 4319, 0),
			new WorldTile(2564, 4304, 0),
			new WorldTile(2573, 4292, 0),
			new WorldTile(2603, 4294, 0),
			new WorldTile(2619, 4293, 0),
			new WorldTile(2620, 4306, 0),
			new WorldTile(2619, 4323, 0),
			new WorldTile(2619, 4340, 0),
			new WorldTile(2604, 4347, 0),
			new WorldTile(2620, 4351, 0),
			new WorldTile(2623, 4323, 0),
			new WorldTile(2623, 4308, 0),
			new WorldTile(2620, 4291, 0),
			new WorldTile(2604, 4289, 0),
			new WorldTile(2588, 4291, 0),
			new WorldTile(2561, 4298, 0),
			new WorldTile(2560, 4315, 0),
			new WorldTile(2561, 4332, 0) };

	public interface DynamicFormula {

		public int getExtraProbablity(Player player);

	}

	public static void captureFlyingEntity(final Player player, final NPC npc) {
		final String name2 = npc.getDefinitions().name.toUpperCase();
		final String name = name2.replaceAll(" ", "_");
		final FlyingEntities instance = FlyingEntities.valueOf(name);
		final boolean isImpling = name.toLowerCase().contains("impling");
		// if (!player.getInventory().containsItem(isImpling ? 1 : 11, 1))
		// return;
		if (player.getSkills().getLevel(Skills.HUNTER) < instance.getLevel())
			return;
		if (!player.getInventory().containsItem(11260, 1)) {
			player.sm("You must have an impling jar to catch an impling.");
			return;
		}
		if (!player.withinDistance(npc, 2)) {
			player.sm("You are to far from the impling, try to get closer.");
			return;
		}
		player.lock(2);
		player.sm("You swing your net...");
		player.setNextAnimation(CAPTURE_ANIMATION);
		WorldTasksManager.schedule(new WorldTask() {
			@Override
			public void run() {
				if (isSuccessful(player, instance.getLevel(),
						new DynamicFormula() {

							@Override
							public int getExtraProbablity(Player player) {
								/*
								 * if (player.getInventory().containsItem(11259,
								 * 1) ||
								 * player.getEquipment().getItem(3).getId() ==
								 * 11259) return 3;//magic net else if
								 * (player.getInventory().containsItem(10010, 1)
								 * || player.getEquipment().getItem(3).getId()
								 * == 10010) return 2;//regular net else
								 */
								return 1;// hands
							}
						})) {
					int bonus = 1;
					if (player.getInventory().containsItem(14102, 1) || player.getEquipment().getWeaponId() == 14102)
						bonus *= 2;
					else if (player.getInventory().containsItem(14110, 1) || player.getEquipment().getWeaponId() == 14110)
						bonus *= 1.75;
					player.getSkills().addXp(Skills.HUNTER,
							instance.getPuroExperience() * bonus);
					npc.finish();
					player.getInventory().deleteItem(11260, 1);
					player.getInventory().addItemMoneyPouch(
							new Item(instance.getReward(), 1));
					player.sm("...and you successfully caputure the "
							+ name2.toLowerCase());
					final int spawnWorldTile = Utils.random(respawn.length - 1);
					WorldTasksManager.schedule(new WorldTask() {
						int loop = 0;

						@Override
						public void run() {
							if (loop == instance.getSpawn()) {
								World.spawnNPC(instance.getNpcId(),
										respawn[spawnWorldTile], -1, true, false);
								stop();
							}
							loop++;
						}
					}, 0, 1);
				} else {
					if (isImpling) {
						npc.setNextForceTalk(new ForceTalk(
								"Tehee, you missed me!"));
						WorldTasksManager.schedule(new WorldTask() {
							@Override
							public void run() {
								WorldTile teleTile = npc;
								for (int trycount = 0; trycount < 10; trycount++) {
									teleTile = respawn[Utils.random(respawn.length - 1)];
									if (World.canMoveNPC(npc.getPlane(),
											teleTile.getX(), teleTile.getY(),
											player.getSize()))
										break;
									teleTile = npc;
								}
								npc.setNextWorldTile(teleTile);
							}
						});
					}
					player.sm("...you stumble and miss the "
							+ name2.toLowerCase());
				}
			}
		});
	}

	static int[] requiredLogs = new int[] { 1151, 1153, 1155, 1157, 1519, 1521,
			13567, 1521, 2862, 10810, 6332, 12581 };

	public static void createLoggedObject(Player player, WorldObject object,
			boolean kebbits) {
		if (!player.getInventory().containsOneItem(requiredLogs)) {
			player.sm("You need to have logs to create this trap.");
			return;
		}
		player.lock(3);
		player.getActionManager().setActionDelay(3);
		player.setNextAnimation(new Animation(5208));// all animation for
														// everything :L
		if (World.removeTemporaryObject(object, 300000, false)) {// five minute
																	// delay
			World.spawnTemporaryObject(new WorldObject(kebbits ? 19206 : -1,
					object.getType(), object.getRotation(), object), 300000,
					false);// TODO
			Item item = null;
			for (int requiredLog : requiredLogs) {
				if ((item = player.getInventory().getItems()
						.lookup(requiredLog)) != null) {
					player.getInventory().deleteItem(item);
				}
			}
		}
	}

	public static boolean isSuccessful(Player player, int dataLevel,
			DynamicFormula formula) {
		int hunterlevel = player.getSkills().getLevel(Skills.HUNTER);
		int increasedProbability = formula == null ? 1 : formula.getExtraProbablity(player);
		int level = Utils.random(hunterlevel + increasedProbability) + 1;

		int chance = level * 100 / (dataLevel * 2);

		if (Utils.random(100) < chance)
		    return false;
		
		if (dataLevel == 77 && Utils.random(2) == 2)
			return false;
		
		return true;
	}
}
