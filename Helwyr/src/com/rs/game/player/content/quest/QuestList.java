package com.rs.game.player.content.quest;

import java.io.Serializable;

public class QuestList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5294311181034701877L;

	public enum Quests {
	
	COOKS_ASSISTANT(0),
	DRUIDIC_RITUAL(1),
	IMP_CATCHER(2),
	DORICS_QUEST(3),
	RUNE_MYSTERIES(4),
	THE_RESTLESS_GHOST(5),
	GOBLIN_DIPLOMACY(6),
	PIRATES_TREASURE(7),
	PRINCE_ALI_RESUCE(8),
	GUNNARS_GROUND(9),
	VAMPIRE_SLAYER(10),
	DEMON_SLAYER(11),
	NOMADS_REQUIEM(12),

	;

	private int index;
	

	/**
	 * Quests parameter index
	 * @param index
	 */
	private Quests(int index) {
		this.index = index;
	}

	/**
	 * Gets the index of the quest.
	 * @return index
	 */
	public int index() {
		return index;
	}


	/**
	 * Returns the quest value
	 * @param id
	 * @return quest
	 */
	public static Quests get(int id) {

		for (Quests quest : Quests.values()) {
			if (quest.index() == id)
				return quest;
		}

		return null;
	}
	}

}
