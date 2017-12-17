package com.rs.game.player.content;

import java.io.Serializable;
import java.util.List;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.item.Item;
import com.rs.game.npc.NPC;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.SlayerManager;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.ShopsHandler;
import com.rs.utils.Utils;

public class GrimReaperTasks {

	public enum Grim implements Serializable {

		DEATH(45802, new int[]
		{ 0, 0, 0 }, new int[]
		{ 15, 50 }, 
		GrimTasks.GENERAL_GRAADOR);
		private GrimTasks[] task;
		private int[] tasksRange, pointsRange;
		private int objectId;

		private Grim(int objectId, int[] pointsRange, int[] tasksRange, GrimTasks... task) {
			this.pointsRange = pointsRange;
			this.tasksRange = tasksRange;
			this.task = task;
		}

		public int getNPCId() {
			return objectId;
		}


		public GrimTasks[] getTask() {
			return task;
		}

		public int[] getTasksRange() {
			return tasksRange;
		}

		public int[] getPointsRange() {
			return pointsRange;
		}

//		public static boolean startInteractionForId(Player player, int objectId, int option) {
//			for (Grim master : Grim.values()) {
//				if (master.getNPCId() == objectId) {
//					if (option == 1)
//						player.getDialogueManager().startDialogue("GrimMasterD", master);
//					else if (option == 2)
//						player.getDialogueManager().startDialogue("QuickTaskD", master);
//					else if (option == 3)
//						ShopsHandler.openShop(player, 29);
//					else if (option == 4)
//						player.getSlayerManager().sendSlayerInterface(SlayerManager.BUY_INTERFACE);
//					return true;
//				}
//			}
//			return false;
//		}
	}

	public enum GrimTasks implements Serializable {// 79 matches out of 117
		// finished
		GENERAL_GRAADOR(1, 0.44, new String[] {});

		private String[] tips;
		private double taskFactor;
		private GrimTasks[] alternatives;
		private int levelRequried;

		private GrimTasks(int levelRequried, double taskFactor, String[] tips, GrimTasks... alternatives) {
			this.levelRequried = levelRequried;
			this.taskFactor = taskFactor;
			this.tips = tips;
			this.alternatives = alternatives;
		}

		private GrimTasks(int levelRequried, String[] tips, GrimTasks... alternatives) {
			this(levelRequried, 1, tips, alternatives);
		}

		public String[] getTips() {
			return tips;
		}

		public GrimTasks[] getAlternatives() {
			return alternatives;
		}

		public int getLevelRequried() {
			return levelRequried;
		}

		public String getName() {
			return Utils.formatPlayerNameForDisplay(toString());
		}

		public double getTaskFactor() {
			return taskFactor;
		}
	}

	public static boolean canAttackNPC(int slayerLevel, String name) {
		return slayerLevel >= getLevelRequirement(name);
	}

	public static int getLevelRequirement(String name) {
		for (GrimTasks task : GrimTasks.values()) {
			if (name.toLowerCase().contains(task.toString().replace("_", " ").toLowerCase()))
				return task.getLevelRequried();
		}
		return 1;
	}

	public static boolean hasNosepeg(Entity target) {
		if (!(target instanceof Player))
			return true;
		Player targetPlayer = (Player) target;
		int hat = targetPlayer.getEquipment().getHatId();
		return hat == 4168 || hasSlayerHelmet(target);
	}

	public static boolean hasEarmuffs(Entity target) {
		if (!(target instanceof Player))
			return true;
		Player targetPlayer = (Player) target;
		int hat = targetPlayer.getEquipment().getHatId();
		return hat == 4166 || hat == 13277 || hasSlayerHelmet(target);
	}

	public static boolean hasMask(Entity target) {
		if (!(target instanceof Player))
			return true;
		Player targetPlayer = (Player) target;
		int hat = targetPlayer.getEquipment().getHatId();
		return hat == 1506 || hat == 4164 || hat == 13277 || hasSlayerHelmet(target);
	}

	public static boolean hasWitchWoodIcon(Entity target) {
		if (!(target instanceof Player))
			return true;
		Player targetPlayer = (Player) target;
		int hat = targetPlayer.getEquipment().getAmuletId();
		return hat == 8923;
	}

	public static boolean hasSlayerHelmet(Entity target) {
		if (!(target instanceof Player))
			return true;
		Player targetPlayer = (Player) target;
		int hat = targetPlayer.getEquipment().getHatId();
		return hat == 13263 || hat == 14636 || hat == 14637 || hasFullSlayerHelmet(target);
	}

	public static boolean hasFullSlayerHelmet(Entity target) {
		if (!(target instanceof Player))
			return true;
		Player targetPlayer = (Player) target;
		int hat = targetPlayer.getEquipment().getHatId();
		return hat == 15492 || hat == 15496 || hat == 15497 || (hat >= 22528 && hat <= 22550);
	}

	public static boolean hasReflectiveEquipment(Entity target) {
		if (!(target instanceof Player))
			return true;
		Player targetPlayer = (Player) target;
		int shieldId = targetPlayer.getEquipment().getShieldId();
		return shieldId == 4156;
	}

	public static boolean hasSpinyHelmet(Entity target) {
		if (!(target instanceof Player))
			return true;
		Player targetPlayer = (Player) target;
		int hat = targetPlayer.getEquipment().getHatId();
		return hat == 4551 || hasSlayerHelmet(target);
	}

	public static boolean isUsingBell(final Player player) {
		player.lock(3);
		player.setNextAnimation(new Animation(6083));
		List<WorldObject> objects = World.getRegion(player.getRegionId()).getAllObjects();
		if (objects == null)
			return false;
		for (final WorldObject object : objects) {
			if (!object.withinDistance(player, 3) || object.getId() != 22545)
				continue;
			player.getPackets().sendGameMessage("The bell re-sounds loudly throughout the cavern.");
			WorldTasksManager.schedule(new WorldTask() {

				@Override
				public void run() {
					NPC npc = World.spawnNPC(5751, player, -1, true);
					npc.getCombat().setTarget(player);
					WorldObject o = new WorldObject(object);
					o.setId(22544);
					World.spawnObjectTemporary(o, 30000);
				}
			}, 1);
			return true;
		}
		return false;
	}

	public static boolean isBlackMask(int requestedId) {
		return requestedId >= 8901 && requestedId <= 8920;
	}

	private static final int[] SLAYER_HELMET_PARTS =
	{ 8921, 4166, 4164, 4551, 4168 };
	private static final int[] FULL_SLAYER_HELMET_PARTS =
	{ 13263, 15490, 15488 };

	public static boolean createSlayerHelmet(Player player, int itemUsed, int itemUsedWith) {
		if (itemUsed == itemUsedWith)
			return false;
		boolean firstCycle = false, secondCycle = false, full = false;
		for (int parts : SLAYER_HELMET_PARTS) {
			if (itemUsed == parts)
				firstCycle = true;
			if (itemUsedWith == parts)
				secondCycle = true;
		}
		if (!firstCycle || !secondCycle) {
			firstCycle = false;
			secondCycle = false;
			for (int parts : FULL_SLAYER_HELMET_PARTS) {
				if (itemUsed == parts)
					firstCycle = true;
				if (itemUsedWith == parts)
					secondCycle = true;
			}
			full = true;
		}
		if (firstCycle && secondCycle) {
			if (!player.getSlayerManager().hasLearnedSlayerHelmet()) {
				player.getPackets().sendGameMessage("You don't know what to do with these parts. You should talk to an expert, perhaps they know how to assemble these parts.");
				return false;
			} else if (player.getSkills().getLevel(Skills.CRAFTING) < 55) {
				player.getPackets().sendGameMessage("You need a Crafting level of 55 in order to assemble a slayer helmet.");
				return false;
			}
			for (int parts : (full ? FULL_SLAYER_HELMET_PARTS : SLAYER_HELMET_PARTS))
				if (!player.getInventory().containsItem(parts, 1))
					return false;
			for (int parts : (full ? FULL_SLAYER_HELMET_PARTS : SLAYER_HELMET_PARTS))
				player.getInventory().deleteItem(parts, 1);
			player.getInventory().addItem(new Item(full ? 15492 : FULL_SLAYER_HELMET_PARTS[0], 1));
			player.getPackets().sendGameMessage(full ? "You attach two parts to your slayer helmet." : "You combine all parts of the helmet.");
			return true;
		}
		return false;
	}

	public static void dissasembleSlayerHelmet(Player player, boolean full) {
		if (!(player.getInventory().getFreeSlots() >= (full ? 2 : 4))) {
			player.getPackets().sendGameMessage("You don't have enough space in your inventory to dissassemble the helmet.");
			return;
		}
		player.getInventory().deleteItem(full ? 15492 : 13263, 1);
		if (full) {
			for (int parts : FULL_SLAYER_HELMET_PARTS)
				player.getInventory().addItemDrop(parts, 1);
		} else {
			for (int parts : SLAYER_HELMET_PARTS)
				player.getInventory().addItemDrop(parts, 1);
		}
	}

	public static boolean isSlayerHelmet(Item item) {
		return item.getName().toLowerCase().contains("slayer helm");
	}
}
