package com.rs.game.player.content;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.rs.Settings;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.game.World;
import com.rs.game.npc.NPC;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.utils.Utils;

public class ReaperAssignment implements Serializable {
	
	private static final long serialVersionUID = -3141072954603737341L;
	
	private int amount;
	private BossTasks task;
	
	public ReaperAssignment(BossTasks task, int amount) {
		this.task = task;
		this.amount = amount;
	}
	
	public static enum BossTasks {
		GENERAL_GRAARDOR	(6260, 5, 12, 2500),
		COMMANDER_ZILYANA	(6247, 5, 12, 2500),
		KRIL_TSUTAROTH		(6203, 5, 12, 2500),
		KREE_ARRA			(6222, 5, 12, 2500),
		NEX					(13447, 2, 4, 5000),
		KING_BLACK_DRAGON	(50, 10, 15, 3000),
		KALPHITE_QUEEN		(1158, 10, 12, 3000),
		CORPOREAL_BEAST		(8133, 2, 5, 5000),
		DAGANNOTH_REX		(2883, 8, 12, 1500),
		DAGANNOTH_PRIME		(2882, 8, 12, 1500),
		DAGANNOTH_SUPREME	(2881, 8, 12, 1500),
		CHAOS_ELEMENTAL		(3200, 8, 12, 2500),
		TORMENTED_DEMON		(8349, 8, 12, 2500);


		private static Map<Integer, BossTasks> monsters = new HashMap<Integer, BossTasks>();

		public static BossTasks forId(int id) {
			return monsters.get(id);
		}

		static {
			for (BossTasks monster : BossTasks.values()) {
				monsters.put(monster.id, monster);
			}
		}

		private int id;
		private int minAmount;
		private int maxAmount;
		private int xp;

		private BossTasks(int id, int minAmount, int maxAmount, int xp) {
			this.id = id;
			this.minAmount = minAmount;
			this.maxAmount = maxAmount;
			this.xp = xp;
		}

		public int getId() {
			return id;
		}

		public int getMinAmount() {
			return minAmount;
		}

		public int getMaxAmount() {
			return maxAmount;
		}
		
		public int getXp() {
			return xp;
		}

		public static BossTasks getRandomTask() {
			return (BossTasks) monsters.values().toArray()[Utils.random(monsters.values().size()-1)];
		}
	}
	
	public String getName() {
		return NPCDefinitions.getNPCDefinitions(task.getId()).name;
	}
	
	public void finishTask(Player player) {
		player.incrementCount("Reaper assignments completed");
		player.sendMessage("You have completed your reaper assignment. You are rewarded with "+player.getSkills().getXpReceived(Skills.SLAYER, task.getXp())+" Slayer experience and 5 Reaper points.");
		player.getSkills().addXp(Skills.SLAYER, task.getXp() * getAmount());
		player.reaperPoints += 5;
		player.bossTaskCompleted = true;
		player.setBossTask(null);
	}
	
	public void sendKill(Player player, NPC npc) {
		World.sendProjectile(npc, player, 3201, 18, 18, 15, 0, 20, 0);
		if (amount >= 1)
			amount--;
		if (amount <= 0) {
			finishTask(player);
		} else {
			player.getPackets().sendGameMessage("<col=ff0000>As "+npc.getName()+" dies, you absorb the soul. You now need "+amount+" more souls.");
		}
	}
	
	public static ReaperAssignment create() {
		BossTasks info = BossTasks.getRandomTask();
		ReaperAssignment task = new ReaperAssignment(info, Utils.random(info.getMinAmount(), info.getMaxAmount()));
		return task;
	}

	public BossTasks getTask() {
		return task;
	}

	public void setTask(BossTasks task) {
		this.task = task;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getMessage() {
		return "Your task is to kill "+amount+" "+getName()+"s.";
	}
}