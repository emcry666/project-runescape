package com.rs.game.player.content.raiding;

/**
 * Created by Brandon on 5/13/2016.
 */
public interface Raid {

    public RaidType getRaidType();

    public boolean queueRaid();

    public boolean startRaid();

    public void endRaid();


}
