package com.rs.game.player.content;

import com.rs.game.item.Item;
import com.rs.game.player.Player;

public class MysteryBoxes {
	
	public Item[] rareItems = new Item[] {
			
			new Item(1050, 1),
			
			new Item(1053, 1),
			
			new Item(1055, 1),
			
			new Item(1057, 1),
			
			new Item(1040, 1),
			
			new Item(1046, 1)
			
	},
			
	commonRewards = new Item[] {
			
			new Item(14484, 1),
			
			new Item(23695, 1),
			
			new Item(23698, 1),
			
			new Item(23699, 1),
			
			new Item(23679, 1)
	},
	
	
	badLuck = new Item[] {
			
			
			
	};
	
	public Item[][] commonSets = new Item[][] {
		
	};
	
	public enum MysteryBoxType {
		
		DONATION, VOTE, COMMON
		
	}
	
	public static void checkBox(MysteryBoxType type, Player player) {
		switch(type) {
		case DONATION:
			break;
		case VOTE:
			break;
		case COMMON:
			break;
		}
	}

}
