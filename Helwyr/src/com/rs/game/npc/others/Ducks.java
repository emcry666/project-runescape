package com.rs.game.npc.others;

import com.rs.game.ForceTalk;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.utils.Utils;

/**
 * @Author Frostbite
 * @Contact<frostbitersps@gmail.com;skype:frostbitersps>
 */
@SuppressWarnings("serial")
public class Ducks extends NPC {

	public int ticks = 0;
	
    public static final String[] noises = {
        "Quack!", "Quack?"
    };

    public Ducks(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
        super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
    }

    @Override
    public void processNPC() {
        if(Utils.random(15) <= 3) {
            String noise = noises[Utils.random(noises.length)];
            setNextForceTalk(new ForceTalk(noise));
        }
    }
}
