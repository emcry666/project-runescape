//package com.rs.game.player.content;
//
//import java.io.Serializable;
//
//import com.rs.game.npc.NPC;
//import com.rs.game.player.Player;
//import com.rs.game.player.Skills;
//import com.rs.utils.Utils;
//
//public class SlayerTask implements Serializable {
//
//	/**
//	 * SlayerTasks used for getting a random task and storing players task data
//	 * @author Yamz
//	 * @author Peng
//	 */
//	private static final long serialVersionUID = -3607393670178894416L;
//
//	public enum Task {
//		CRAWLING_HAND("Crawling hand", 1, 9.4, 10, 50), 
//		LESSER_DEMON("Lesser demon", 1, 86.6, 10, 50), 
//		BLUE_DRAGON("Blue dragon", 1, 93.8, 10, 50), 
//		HELLHOUND("Hellhound", 1, 93.6, 10, 50), 
//		GREATER_DEMON("Greater demon", 1, 135.4, 10, 50), 
//		BLACK_DEMON("Black demon", 1, 294.4, 10, 50), 
//		BANSHEE("Banshee", 15, 15.5, 10, 50),
//		BLOODVELD("Bloodveld", 50, 88.4, 10, 50),  
//		GARGOYLE("Gargoyle", 75, 197.4, 10, 50), 
//		NECHRYAEL("Nechryael", 80, 251.6, 10, 50), 
//		ABYSSAL_DEMON("Abyssal demon", 85, 277.8, 10, 100), 
//		DARK_BEAST("Dark beast", 90, 331.4, 10, 100);
//
//		String name;
//		int level, minAmount, maxAmount;
//		double xp;
//
//		/**
//		 * 
//		 * @param name
//		 *            monster name displayed when getting the task or checking
//		 *            with gem
//		 * @param level
//		 *            level required for getting the monster as a task
//		 * @param xp
//		 *            exp given for killing the monster on task (multiplied
//		 *            after so use runewiki exp)
//		 * @param minAmount
//		 *            lowestamount of monsters to get as a task
//		 * @param maxAmount
//		 *            highest ^
//		 */
//		private Task(String name, int level, double xp, int minAmount,
//				int maxAmount) {
//			this.name = name;
//			this.level = level;
//			this.minAmount = minAmount;
//			this.maxAmount = maxAmount;
//			this.xp = xp;
//		}
//		
//		double getXp() {
//			return this.xp;
//		}
//
//		int getLevel() {
//			return this.level;
//		}
//
//		String getName() {
//			return this.name;
//		}
//	}
//
//	public enum monsterSet {
//		Beginner(1, new Task[] { Task.CRAWLING_HAND,Task.BANSHEE, }),
//
//		Easy(35, new Task[] { Task.LESSER_DEMON, Task.BANSHEE }),
//
//		Medium(50, new Task[] { Task.BLOODVELD, Task.BLUE_DRAGON,
//				Task.GREATER_DEMON  }),
//
//		Hard(75, new Task[] { Task.GARGOYLE, Task.NECHRYAEL,
//				Task.ABYSSAL_DEMON, Task.BLACK_DEMON,
//				Task.GREATER_DEMON, Task.HELLHOUND,
//				Task.BLUE_DRAGON }),
//
//		Expert(90, new Task[] { Task.DARK_BEAST,
//				Task.ABYSSAL_DEMON, Task.BLACK_DEMON,
//				Task.NECHRYAEL, Task.GARGOYLE });
//
//		int level;
//		Task[] tasks;
//
//		private monsterSet(int level, Task[] tasks) {
//			this.level = level;
//			this.tasks = tasks;
//		}
//
//		Task[] getTasks() {
//			return this.tasks;
//		}
//	}
//
//	Task task;
//	int amountKilled;
//	int taskAmount;
//
//	public SlayerTask(Task task) {
//		this.task = task;
//		amountKilled = 0;
//		taskAmount = Utils.random(task.minAmount, task.maxAmount);
//	}
//
//	public void resetTask(Player player) {
//		this.task = null;
//		amountKilled = -1;
//		taskAmount = -1;
//		player.sm("<col=ff0000>You have completed your slayer task. Return to a slayer master for another.");
//	}
//
//	public void checkNPC(NPC npc, Player player) {
//		if (npc.getName().toLowerCase().contains(SlayerTask.getTask(player).getName().toLowerCase())) {
//			player.getSkills().addXp(Skills.SLAYER, npc.getCombatLevel() * 10);
//			amountKilled++;
//		}
//		if (SlayerTask.getTask(player).getAmountKilled() == SlayerTask.getTask(player).getTaskAmount()) {
//			SlayerTask.getTask(player).resetTask(player);
//		}
//	}
//	
//	
//	public static SlayerTask getTask(Player player) {
//		int level = player.getSkills().getLevel(Skills.SLAYER);
//		Task task;
//		if (level >= 90) {
//			while (true) {
//				task = monsterSet.Expert.getTasks()[Utils
//						.random(monsterSet.Expert.getTasks().length - 1)];
//				if (level >= task.getLevel()) {
//					return new SlayerTask(task);
//				}
//			}
//		} else if (level >= 75) {
//			while (true) {
//				task = monsterSet.Hard.getTasks()[Utils.random(monsterSet.Hard
//						.getTasks().length - 1)];
//				if (level >= task.getLevel()) {
//					return new SlayerTask(task);
//				}
//			}
//		} else if (level >= 50) {
//			while (true) {
//				task = monsterSet.Medium.getTasks()[Utils
//						.random(monsterSet.Medium.getTasks().length - 1)];
//				if (level >= task.getLevel()) {
//					return new SlayerTask(task);
//				}
//			}
//		} else if (level >= 35) {
//			while (true) {
//				task = monsterSet.Easy.getTasks()[Utils.random(monsterSet.Easy
//						.getTasks().length - 1)];
//				if (level >= task.getLevel()) {
//					return new SlayerTask(task);
//				}
//			}
//		} else {
//			while (true) {
//				task = monsterSet.Beginner.getTasks()[Utils
//						.random(monsterSet.Beginner.getTasks().length - 1)];
//				if (level >= task.getLevel()) {
//					return new SlayerTask(task);
//				}
//			}
//		}
//
//	}
//
//	public double getXPAmount() {
//		return this.task.getXp();
//	}
//
//	public int getTaskAmount() {
//		return this.taskAmount;
//	}
//
//	public void decreaseAmount() {
//		this.taskAmount--;
//	}
//	
//	public int getAmountLeft() {
//		return this.taskAmount - this.getAmountKilled();
//	}
//
//	public int getAmountKilled() {
//		return this.amountKilled;
//	}
//
//	public void setAmountKilled(int amountKilled) {
//		this.amountKilled = amountKilled;
//	}
//
//	public String getName() {
//		return this.task.getName();
//	}
//
//}