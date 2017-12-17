package com.rs.game.player.content;

import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.area.dungeonhandler.DungeonEvent;
import com.rs.game.area.dungeonhandler.DungeonEventHandler;
import com.rs.game.npc.NPC;
import com.rs.game.player.Player;
import com.rs.utils.Utils;

public class ChaosTunnels implements DungeonEvent {

	public static void movePlayer(Player player, final int x, final int y, final int z) {
		player.setNextWorldTile(new WorldTile(x, y, z));	
	}
	public static void gameMessage(Player player, final String s) {
		player.getPackets().sendGameMessage(s);
	}


	@Override
	public boolean init() {
		registerObject(65203);
		registerObject(28782);
		registerObject(28779);
		return registerObject(77745);
	}

	@Override
	public boolean handleNPCClick(Player player, NPC npc) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean handleNPCClick2(Player player, NPC npc) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean handleObjectClick(Player player, WorldObject object) {
		switch (object.getId()) {
		/**
		 * Entrances
		 */
		case 65203:
			long inCombatTimer = Utils.currentTimeMillis();
			if(object.getX() == 3164 && object.getY() == 3561) {
				if (player.getAttackedByDelay() + 10000 > inCombatTimer) {
					gameMessage(player, "You cannot enter the rift while you're under attack.");
					return false;
				} else 
					movePlayer(player, 3293, 5479, 0);
			}
			if(object.getX() == 3176 && object.getY() == 3585) {
				if (player.getAttackedByDelay() + 10000 > inCombatTimer) {
					gameMessage(player, "You cannot enter the rift while you're under attack.");
					return false;
				} else 
					movePlayer(player, 3290, 5539, 0);
			}
			if(object.getX() == 3118 && object.getY() == 3570) {
				if (player.getAttackedByDelay() + 10000 > inCombatTimer) {
					gameMessage(player, "You cannot enter the rift while you're under attack.");
					return false;
				} else 
					movePlayer(player, 3248, 5490, 0);
			}
			if(object.getX() == 3129 && object.getY() == 3587) {
				if (player.getAttackedByDelay() + 10000 > inCombatTimer) {
					gameMessage(player, "You cannot enter the rift while you're under attack.");
					return false;
				} else 
					movePlayer(player, 3235, 5560, 0);
			}
			if(object.getX() == 3058 && object.getY() == 3550) {
				if (player.getAttackedByDelay() + 10000 > inCombatTimer) {
					gameMessage(player, "You cannot enter the rift while you're under attack.");
					return false;
				} else 
					movePlayer(player, 3183, 5470, 0);
			}

			if(object.getX() == 3165 && object.getY() == 3561) {
				movePlayer(player, 3292, 5479, 0);
				return true;
			}
			if(object.getX() == 3119 && object.getY() == 3571) {
				movePlayer(player, 3248, 5490, 0);
				return true;
			}
			if(object.getX() == 3107 && object.getY() == 3639) {
				movePlayer(player, 3234, 5559, 0);
				return true;
			}
			/**
			 * Exits
			 */
		case 28782:
			if(object.getX() == 3183 && object.getY() == 5470) {
				movePlayer(player, 3057, 3550, 0);
				return true;
			}
			if(object.getX() == 3248 && object.getY() == 5490) {
				movePlayer(player, 3119, 3572, 0);
				return true;
			}
			if(object.getX() == 3292 && object.getY() == 5479) {
				movePlayer(player, 3166, 3561, 0);
				return true;
			}
			if(object.getX() == 3291 && object.getY() == 5538) {
				movePlayer(player, 3176, 3587, 0);
				return true;
			}
			if(object.getX() == 3234 && object.getY() == 5559) {
				movePlayer(player, 3130, 3586, 0);
				return true;
			}
		case 77745:
		case 28779:
			if(object.getX() == 3254 && object.getY() == 5451) {
				movePlayer(player, 3250, 5448, 0);
			}
			if(object.getX() == 3250 && object.getY() == 5448) {
				movePlayer(player, 3254, 5451, 0);
			}
			if(object.getX() == 3241 && object.getY() == 5445) {
				movePlayer(player, 3233, 5445, 0);
			}
			if(object.getX() == 3233 && object.getY() == 5445) {
				movePlayer(player, 3241, 5445, 0);
			}
			if(object.getX() == 3259 && object.getY() == 5446) {
				movePlayer(player, 3265, 5491, 0);
			}
			if(object.getX() == 3265 && object.getY() == 5491) {
				movePlayer(player, 3259, 5446, 0);
			}
			if(object.getX() == 3260 && object.getY() == 5491) {
				movePlayer(player, 3266, 5446, 0);
			}
			if(object.getX() == 3266 && object.getY() == 5446) {
				movePlayer(player, 3260, 5491, 0);
			}
			if(object.getX() == 3241 && object.getY() == 5469) {
				movePlayer(player, 3233, 5470, 0);
			}
			if(object.getX() == 3233 && object.getY() == 5470) {
				movePlayer(player, 3241, 5469, 0);
			}
			if(object.getX() == 3235 && object.getY() == 5457) {
				movePlayer(player, 3229, 5454, 0);
			}
			if(object.getX() == 3229 && object.getY() == 5454) {
				movePlayer(player, 3235, 5457, 0);
			}
			if(object.getX() == 3280 && object.getY() == 5460) {
				movePlayer(player, 3273, 5460, 0);
			}
			if(object.getX() == 3273 && object.getY() == 5460) {
				movePlayer(player, 3280, 5460, 0);
			}
			if(object.getX() == 3283 && object.getY() == 5448) {
				movePlayer(player, 3287, 5448, 0);
			}
			if(object.getX() == 3287 && object.getY() == 5448) {
				movePlayer(player, 3283, 5448, 0);
			}
			if(object.getX() == 3244 && object.getY() == 5495) {
				movePlayer(player, 3239, 5498, 0);
			}
			if(object.getX() == 3239 && object.getY() == 5498) {
				movePlayer(player, 3244, 5495, 0);
			}
			if(object.getX() == 3232 && object.getY() == 5501) {
				movePlayer(player, 3238, 5507, 0);
			}
			if(object.getX() == 3238 && object.getY() == 5507) {
				movePlayer(player, 3232, 5501, 0);
			}
			if(object.getX() == 3218 && object.getY() == 5497) {
				movePlayer(player, 3222, 5488, 0);
			}
			if(object.getX() == 3222 && object.getY() == 5488) {
				movePlayer(player, 3218, 5497, 0);
			}
			if(object.getX() == 3218 && object.getY() == 5478) {
				movePlayer(player, 3215, 5475, 0);
			}
			if(object.getX() == 3215 && object.getY() == 5475) {
				movePlayer(player, 3218, 5478, 0);
			}
			if(object.getX() == 3224 && object.getY() == 5479) {
				movePlayer(player, 3222, 5474, 0);
			}
			if(object.getX() == 3222 && object.getY() == 5474) {
				movePlayer(player, 3224, 5479, 0);
			}
			if(object.getX() == 3208 && object.getY() == 5471) {
				movePlayer(player, 3210, 5477, 0);
			}
			if(object.getX() == 3210 && object.getY() == 5477) {
				movePlayer(player, 3208, 5471, 0);
			}
			if(object.getX() == 3214 && object.getY() == 5456) {
				movePlayer(player, 3212, 5452, 0);
			}
			if(object.getX() == 3212 && object.getY() == 5452) {
				movePlayer(player, 3214, 5456, 0);
			}
			if(object.getX() == 3204 && object.getY() == 5445) {
				movePlayer(player, 3197, 5448, 0);
			}
			if(object.getX() == 3197 && object.getY() == 5448) {
				movePlayer(player, 3204, 5445, 0);
			}
			if(object.getX() == 3189 && object.getY() == 5444) {
				movePlayer(player, 3187, 5460, 0);
			}
			if(object.getX() == 3187 && object.getY() == 5460) {
				movePlayer(player, 3189, 5444, 0);
			}
			if(object.getX() == 3192 && object.getY() == 5472) {
				movePlayer(player, 3186, 5472, 0);
			}
			if(object.getX() == 3186 && object.getY() == 5472) {
				movePlayer(player, 3192, 5472, 0);
			}
			if(object.getX() == 3185 && object.getY() == 5478) {
				movePlayer(player, 3191, 5482, 0);
			}
			if(object.getX() == 3191 && object.getY() == 5482) {
				movePlayer(player, 3185, 5478, 0);
			}
			if(object.getX() == 3171 && object.getY() == 5473) {
				movePlayer(player, 3167, 5471, 0);
			}
			if(object.getX() == 3167 && object.getY() == 5471) {
				movePlayer(player, 3171, 5473, 0);
			}
			if(object.getX() == 3171 && object.getY() == 5478) {
				movePlayer(player, 3167, 5478, 0);
			}
			if(object.getX() == 3167 && object.getY() == 5478) {
				movePlayer(player, 3171, 5478, 0);
			}
			if(object.getX() == 3168 && object.getY() == 5456) {
				movePlayer(player, 3178, 5460, 0);
			}
			if(object.getX() == 3178 && object.getY() == 5460) {
				movePlayer(player, 3168, 5456, 0);
			}
			if(object.getX() == 3191 && object.getY() == 5495) {
				movePlayer(player, 3194, 5490, 0);
			}
			if(object.getX() == 3194 && object.getY() == 5490) {
				movePlayer(player, 3191, 5495, 0);
			}
			if(object.getX() == 3141 && object.getY() == 5480) {
				movePlayer(player, 3142, 5489, 0);
			}
			if(object.getX() == 3142 && object.getY() == 5489) {
				movePlayer(player, 3141, 5480, 0);
			}
			if(object.getX() == 3142 && object.getY() == 5462) {
				movePlayer(player, 3154, 5462, 0);
			}
			if(object.getX() == 3154 && object.getY() == 5462) {
				movePlayer(player, 3142, 5462, 0);
			}
			if(object.getX() == 3143 && object.getY() == 5443) {
				movePlayer(player, 3155, 5449, 0);
			}
			if(object.getX() == 3155 && object.getY() == 5449) {
				movePlayer(player, 3143, 5443, 0);
			}
			if(object.getX() == 3307 && object.getY() == 5496) {
				movePlayer(player, 3317, 5496, 0);
			}
			if(object.getX() == 3317 && object.getY() == 5496) {
				movePlayer(player, 3307, 5496, 0);
			}
			if(object.getX() == 3318 && object.getY() == 5481) {
				movePlayer(player, 3322, 5480, 0);
			}
			if(object.getX() == 3322 && object.getY() == 5480) {
				movePlayer(player, 3318, 5481, 0);
			}
			if(object.getX() == 3299 && object.getY() == 5484) {
				movePlayer(player, 3303, 5477, 0);
			}
			if(object.getX() == 3303 && object.getY() == 5477) {
				movePlayer(player, 3299, 5484, 0);
			}
			if(object.getX() == 3286 && object.getY() == 5470) {
				movePlayer(player, 3285, 5474, 0);
			}
			if(object.getX() == 3285 && object.getY() == 5474) {
				movePlayer(player, 3286, 5470, 0);
			}
			if(object.getX() == 3290 && object.getY() == 5463) {
				movePlayer(player, 3302, 5469, 0);
			}
			if(object.getX() == 3302 && object.getY() == 5469) {
				movePlayer(player, 3290, 5463, 0);
			}
			if(object.getX() == 3296 && object.getY() == 5455) {
				movePlayer(player, 3299, 5450, 0);
			}
			if(object.getX() == 3299 && object.getY() == 5450) {
				movePlayer(player, 3296, 5455, 0);
			}
			if(object.getX() == 3280 && object.getY() == 5501) {
				movePlayer(player, 3285, 5508, 0);
			}
			if(object.getX() == 3285 && object.getY() == 5508) {
				movePlayer(player, 3280, 5501, 0);
			}
			if(object.getX() == 3300 && object.getY() == 5514) {
				movePlayer(player, 3297, 5510, 0);
			}
			if(object.getX() == 3297 && object.getY() == 5510) {
				movePlayer(player, 3300, 5514, 0);
			}
			if(object.getX() == 3289 && object.getY() == 5533) {
				movePlayer(player, 3288, 5536, 0);
			}
			if(object.getX() == 3288 && object.getY() == 5536) {
				movePlayer(player, 3289, 5533, 0);
			}
			if(object.getX() == 3285 && object.getY() == 5527) {
				movePlayer(player, 3282, 5531, 0);
			}
			if(object.getX() == 3282 && object.getY() == 5531) {
				movePlayer(player, 3285, 5527, 0);
			}
			if(object.getX() == 3325 && object.getY() == 5518) {
				movePlayer(player, 3323, 5531, 0);
			}
			if(object.getX() == 3323 && object.getY() == 5531) {
				movePlayer(player, 3325, 5518, 0);
			}
			if(object.getX() == 3299 && object.getY() == 5533) {
				movePlayer(player, 3297, 5536, 0);
			}
			if(object.getX() == 3297 && object.getY() == 5538) {
				movePlayer(player, 3299, 5533, 0);
			}
			if(object.getX() == 3321 && object.getY() == 5554) {
				movePlayer(player, 3315, 5552, 0);
			}
			if(object.getX() == 3315 && object.getY() == 5552) {
				movePlayer(player, 3321, 5554, 0);
			}
			if(object.getX() == 3291 && object.getY() == 5555) {
				movePlayer(player, 3285, 5556, 0);
			}
			if(object.getX() == 3285 && object.getY() == 5556) {
				movePlayer(player, 3291, 5555, 0);
			}
			if(object.getX() == 3266 && object.getY() == 5552) {
				movePlayer(player, 3262, 5552, 0);
			}
			if(object.getX() == 3262 && object.getY() == 5552) {
				movePlayer(player, 3266, 5552, 0);
			}
			if(object.getX() == 3256 && object.getY() == 5561) {
				movePlayer(player, 3253, 5561, 0);
			}
			if(object.getX() == 3253 && object.getY() == 5561) {
				movePlayer(player, 3256, 5561, 0);
			}
			if(object.getX() == 3249 && object.getY() == 5546) {
				movePlayer(player, 3252, 5543, 0);
			}
			if(object.getX() == 3252 && object.getY() == 5543) {
				movePlayer(player, 3249, 5546, 0);
			}
			if(object.getX() == 3261 && object.getY() == 5536) {
				movePlayer(player, 3268, 5534, 0);
			}
			if(object.getX() == 3268 && object.getY() == 5534) {
				movePlayer(player, 3261, 5536, 0);
			}
			if(object.getX() == 3243 && object.getY() == 5526) {
				movePlayer(player, 3241, 5529, 0);
			}
			if(object.getX() == 3241 && object.getY() == 5529) {
				movePlayer(player, 3243, 5526, 0);
			}
			if(object.getX() == 3230 && object.getY() == 5547) {
				movePlayer(player, 3226, 5553, 0);
			}
			if(object.getX() == 3226 && object.getY() == 5553) {
				movePlayer(player, 3230, 5547, 0);
			}
			if(object.getX() == 3206 && object.getY() == 5553) {
				movePlayer(player, 3204, 5546, 0);
			}
			if(object.getX() == 3204 && object.getY() == 5546) {
				movePlayer(player, 3206, 5553, 0);
			}
			if(object.getX() == 3211 && object.getY() == 5533) {
				movePlayer(player, 3214, 5533, 0);
			}
			if(object.getX() == 3214 && object.getY() == 5533) {
				movePlayer(player, 3211, 5533, 0);
			}
			if(object.getX() == 3208 && object.getY() == 5527) {
				movePlayer(player, 3211, 5523, 0);
			}
			if(object.getX() == 3211 && object.getY() == 5523) {
				movePlayer(player, 3208, 5527, 0);
			}
			if(object.getX() == 3201 && object.getY() == 5531) {
				movePlayer(player, 3197, 5529, 0);
			}
			if(object.getX() == 3197 && object.getY() == 5529) {
				movePlayer(player, 3201, 5531, 0);
			}
			if(object.getX() == 3202 && object.getY() == 5515) {
				movePlayer(player, 3196, 5512, 0);
			}
			if(object.getX() == 3196 && object.getY() == 5512) {
				movePlayer(player, 3202, 5515, 0);
			}
			if(object.getX() == 3190 && object.getY() == 5515) {
				movePlayer(player, 3190, 5519, 0);
			}
			if(object.getX() == 3190 && object.getY() == 5519) {
				movePlayer(player, 3190, 5515, 0);
			}
			if(object.getX() == 3185 && object.getY() == 5518) {
				movePlayer(player, 3181, 5517, 0);
			}
			if(object.getX() == 3181 && object.getY() == 5517) {
				movePlayer(player, 3185, 5518, 0);
			}
			if(object.getX() == 3187 && object.getY() == 5531) {
				movePlayer(player, 3182, 5530, 0);
			}
			if(object.getX() == 3182 && object.getY() == 5530) {
				movePlayer(player, 3187, 5531, 0);
			}
			if(object.getX() == 3169 && object.getY() == 5510) {
				movePlayer(player, 3159, 5501, 0);
			}
			if(object.getX() == 3159 && object.getY() == 5501) {
				movePlayer(player, 3169, 5510, 0);
			}
			if(object.getX() == 3165 && object.getY() == 5515) {
				movePlayer(player, 3173, 5530, 0);
			}
			if(object.getX() == 3173 && object.getY() == 5530) {
				movePlayer(player, 3165, 5515, 0);
			}
			if(object.getX() == 3156 && object.getY() == 5523) {
				movePlayer(player, 3152, 5520, 0);
			}
			if(object.getX() == 3152 && object.getY() == 5520) {
				movePlayer(player, 3156, 5523, 0);
			}
			if(object.getX() == 3148 && object.getY() == 5533) {
				movePlayer(player, 3153, 5537, 0);
			}
			if(object.getX() == 3153 && object.getY() == 5537) {
				movePlayer(player, 3148, 5533, 0);
			}
			if(object.getX() == 3143 && object.getY() == 5535) {
				movePlayer(player, 3147, 5541, 0);
			}
			if(object.getX() == 3147 && object.getY() == 5541) {
				movePlayer(player, 3143, 5535, 0);
			}
			if(object.getX() == 3168 && object.getY() == 5541) {
				movePlayer(player, 3171, 5542, 0);
			}
			if(object.getX() == 3171 && object.getY() == 5542) {
				movePlayer(player, 3168, 5541, 0);
			}
			if(object.getX() == 3190 && object.getY() == 5549) {
				movePlayer(player, 3190, 5554, 0);
				return true;
			}
			if(object.getX() == 3190 && object.getY() == 5554) {
				movePlayer(player, 3190, 5549, 0);
				return true;
			}
			if(object.getX() == 3180 && object.getY() == 5557) {
				movePlayer(player, 3174, 5558, 0);
				return true;
			}
			if(object.getX() == 3174 && object.getY() == 5558) {
				movePlayer(player, 3180, 5557, 0);
				return true;
			}
			if(object.getX() == 3162 && object.getY() == 5557) {
				movePlayer(player, 3158, 5561, 0);
				return true;
			}
			if(object.getX() == 3158 && object.getY() == 5561) {
				movePlayer(player, 3162, 5557, 0);
				return true;
			}
			if(object.getX() == 3166 && object.getY() == 5553) {
				movePlayer(player, 3162, 5545, 0);
				return true;
			}
			if(object.getX() == 3162 && object.getY() == 5545) {
				movePlayer(player, 3166, 5553, 0);
				return true;
			}
			if(object.getX() == 3142 && object.getY() == 5545) {
				movePlayer(player, 3115, 5528, 0);
				return true;
			}
			if(object.getX() == 3115 && object.getY() == 5528) {
				movePlayer(player, 3142, 5545, 0);
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean handleNPCClick3(Player player, NPC npc) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean handleObjectClick2(Player player, WorldObject object) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean handleObjectClick3(Player player, WorldObject object) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean registerNPC(int npcId) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean registerObject(int objectId) {
		return DungeonEventHandler.registerObjects(objectId, this);
	}
}
