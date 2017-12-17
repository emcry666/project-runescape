package com.rs.game.player.content.raiding;

/**
 * Created by Brandon on 5/13/2016.
 */
public class RaidInstance implements Raid {

    private RaidType type;
    private int size;

    public RaidInstance(RaidType type, int size) {
        this.type = type;
        this.size = size;
    }

    public RaidInstance(RaidType type) {
        this.type = type;
    }

    @Override
    public RaidType getRaidType() {
        return type;
    }

    @Override
    public boolean queueRaid() {
        return false;
    }

    @Override
    public boolean startRaid() {
        return false;
    }

    @Override
    public void endRaid() {

    }
}
