package com.rs.game.player.content;

import com.rs.game.World;
import com.rs.game.player.Player;

/**
 *
 * @author Alex <lubricant@live.com>
 */
public class RandomMessage 
{
    public static final void init() throws InterruptedException {
        for (;;) {
            for (Player all : World.getPlayers()) {
                all.getPackets().sendGameMessage("<col=FFF000>[Server Message]</col>: <col=FFF000>Prothieum has just been reborn.</col>");
                Thread.sleep(90000); // Put the seconds you want the interval to be, * 1000
                all.getPackets().sendGameMessage("<col=FFF000>[Server Message]</col>: <col=FFF000>Axter and vince are faggots.</col>");
                Thread.sleep(90000);
                all.getPackets().sendGameMessage("<col=FFF000>[Server Message]</col>: <col=FFF000>Did you know adam is sexy?</col>");
                Thread.sleep(90000);
            }
        }
    }
}
