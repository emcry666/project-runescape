package com.rs.game.player.content.raiding;

import com.rs.game.player.Player;
import com.rs.utils.Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Brandon on 5/13/2016.
 */
public class RaidManager {

    /**
     * Represents the current active raids.
     */
    public static Map<Raid, RaidType> activeRaids = new HashMap<>();
    /**
     * Represents the players inside the raids.
     */
    public static Map<Raid, Player> raidMembers = new HashMap<>();
    /**
     * Represents the players in queue for the raids.
     */
    public static List<Player> queuedPlayers = new ArrayList<>();


    /**
     * Returns @active <Raids>
     * @return
     */
    public static Map<Raid, RaidType> getActiveRaids() {
        return activeRaids;
    }

    /**
     * Returns @active raid members
     * @return
     */
    public static Map<Raid, Player> getRaidMembers() {
        return raidMembers;
    }

    /**
     * Returns @queued raid emmbers
     * @return
     */
    public static List<Player> getQueuedPlayers() {
        return queuedPlayers;
    }

    /**
     * Starts the <Raid>
     * @param raid
     * @param type
     * @return
     */
    public static boolean startRaid(Raid raid, RaidType type) {
        if(isRaidActive(raid, type))
            return false;
        activeRaids.put(raid, type);
        return true;
    }

    /**
     * Adds the @member inside the <Raid>
     * @param raid
     * @param member
     * @return
     */
    public static boolean addMemberToRaid(Raid raid, Player member) {
        if(isMemberInstanceOfRaid(member))
            return false;
        raidMembers.put(raid, member);
        queuedPlayers.remove(member);
        return true;
    }

    /**
     * Removes @member from <Raid>
     * @param @raid
     * @param member
     * @return
     */
    public static boolean removeMemberFromRaid(Player member) {
        if(!isMemberInstanceOfRaid(member))
            return false;
        raidMembers.remove(member);
        return true;
    }

    /**
     * Represents if the @member inside a <Raid>
     * @param member
     * @return
     */
    public static boolean isMemberInstanceOfRaid(Player member) {
        return raidMembers.containsValue(member);
    }

    /**
     * Represents adding the @member into <Raid> queue.
     * @param member
     * @return
     */
    public boolean joinQueue(Player member) {
        if(queuedPlayers.contains(member))
            return false;
        queuedPlayers.add(member);
        return true;
    }

    /**
     * Represents removing the @member from <Raid> queue.
     * @param member
     * @return
     */
    public boolean leaveQueue(Player member) {
        if(!queuedPlayers.contains(member))
            return false;
        queuedPlayers.remove(member);
        return true;
    }

    /**
     * Represents of the @member is in queue for the <Raid>
     * @param member
     * @return
     */
    public boolean isPlayerInQueue(Player member) {
        return queuedPlayers.contains(member);
    }

    /**
     * Ends the <Raid>
     * @param raid
     * @param type
     * @return
     */
    public static boolean endRaid(Raid raid, RaidType type) {
        if(!isRaidActive(raid, type))
            return false;
        activeRaids.remove(raid, type);
        return true;
    }

    /**
     * Checks if the <Raid> is active
     * @param raid
     * @param type
     * @return
     */
    public static boolean isRaidActive(Raid raid, RaidType type) {
        return activeRaids.containsKey(raid) && activeRaids.containsValue(type);
    }

    /**
     * Redirects the @members into the Map<Raid, Player> and loads the <Raid>
     * @param raid
     * @return
     */
    public boolean loadQueuedPlayers(Raid raid) {
        String raidType = Utils.formatString(raid.getRaidType().toString());
        for(Player queued : getQueuedPlayers()) {
            queued.getPackets().sendGameMessage("<col=00ff00>You have joined a " + raidType + "!");
            queued.getControlerManager().startControler("RaidController", this);
            addMemberToRaid(raid, queued);
        }
        return true;
    }


}
