package com.rs.game.player.content;

public class DungeoneeringNPCS {


	public enum DungeoneeringData {
		
		SoulGazer(10705, 120, 3000, 400),
		Eddimu(10704, 100, 2250, 350),
		Novite(10400, 1, 100, 40),
		Bathus(10451, 20, 200, 80),
		Katagon(10879, 60, 600, 160),
		Gorgonite(10900, 80, 1600, 200),
		Promethium(10517, 90, 1800, 240),
		Primal(10533, 99, 2000, 300),
		Primal2(10530, 99, 2000, 300),
		Ranger(10363, 95, 2100, 310),
		Warmonger(12841, 1, 10000, 1000);
		
		private int npcid, level, tokens, exp;
		
		DungeoneeringData(int npcid, int level, int tokens, int exp) {
			this.npcid = npcid;
			this.level = level;
			this.tokens = tokens;
			this.exp = exp;
		}
		
		public int getNpcId() {
			return npcid;
		}
		
		public int getLevel() {
			return level;
		}
		
		public int getTokens() {
			return tokens;
		}
		
		public int getExp() {
			return exp;
		}
		
		public int[] dungNPCs = { 10705, 10704, 10533, 10517, 10451, 10879 };
		
	}
}
