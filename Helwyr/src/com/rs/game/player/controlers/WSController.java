package com.rs.game.player.controlers;

import com.rs.game.WorldTile;
import com.rs.game.player.content.wsminigame.WSMinigame;

import javax.sound.sampled.Control;

/**
 * Created by JTlr Frost {@skype;frostbitersps} on 7/14/2016.
 */
public class WSController extends Controler {

    private WSMinigame wsMinigame;

    @Override
    public void start() {
    }


    @Override
    public boolean processItemTeleport(WorldTile toTile) {
        return false;
    }

    @Override
    public boolean processMagicTeleport(WorldTile toTile) {
        return false;
    }

    @Override
    public boolean processDragonStoneTeleport(WorldTile toTile) {
        return false;
    }

    @Override
    public boolean processObjectTeleport(WorldTile toTile) {
        return false;
    }
}
