package com.rs.mysql.impl;

import com.rs.game.player.content.clans.Clan;
import com.rs.mysql.GenerateQuery;

/**
 * Created by Brandon on 5/14/2016.
 */
public class Clans extends GenerateQuery {

    /**
     * Represents the Clan object
     */
    private Clan clan;

    public Clans(Clan clan) {
        this.clan = clan;
        appendQuery();
        super.write();
    }
    
    /**
     * Appends the syntax to insert into the Database.
     * @return
     */
    
    private String appendQuery() {
        String[] cols = new String[] {
                "clanName", "clanMessage", "clanLeader", "members", "timeZone", "recruiting", "clanFlag", "motto", "level", "experience"
        };
        sb.append("INSERT INTO clans (");
        for(int index = 0; index < cols.length;index++)
            sb.append(cols[index]).append((index == cols.length - 1 ? "" : ","));
        sb.append(") VALUES (");
        sb.append("'" + clan.getClanName() + "'").append(",");
        sb.append("'" + clan.getClanMessage() + "'").append(",");
        sb.append("'" + clan.getClanLeaderUsername() + "'").append(",");
        sb.append("'" + clan.getMembers() + "'").append(",");
        sb.append("'" + clan.getTimeZone() + "'").append(",");
        sb.append("'" + clan.isRecruiting() + "'").append(",");
        sb.append("'" + clan.getClanFlag() + "'").append(",");
        sb.append("'" + clan.getMotto() + "'").append(",");
        sb.append("'" + clan.getKnowledge().getLevel() + "'").append(",");
        sb.append("'" + clan.getKnowledge().getXp() + "'").append(")");
        return sb.toString();
    }


}
