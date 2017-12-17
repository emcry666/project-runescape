package com.rs.game.player;

import com.rs.Settings;
import com.rs.game.World;
import com.rs.game.economics.capital.taxes.PlayerTaxes;
import com.rs.game.item.Item;
import com.rs.utils.SerializableFilesManager;
import com.rs.utils.Utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by JTlr Frost {@skype;frostbitersps} on 7/9/2016.
 */
public class WeekendLottery implements Serializable {

    /**
     * Represents everyone who has paid their taxes and qualify for the weekend lottery.
     */
    public static List<String> contestants = new ArrayList<>();
    /**
     * Represents amount of taxes collected for the server
     */
    public static int serverTaxAmount;

    /**
     * Represents if weekend lottery has occured.
     */
    public static boolean lotteryFinished;

    /**
     * Returns collection of users that are contested
     * @return
     */
    public static List<String> getContestants() {
        return contestants;
    }

    /**
     * Initalizes the server taxes data and generates a winner
     */
    public static void init() {
        PlayerTaxes.readTaxData();
        if (lotteryFinished == true)
            lotteryFinished = false;
        if (lotteryFinished == false
                && Settings.isWeekend() && contestants != null)
            ;
            //generateWinner();
    }

    private static boolean generateWinner() {
        if (contestants == null)
            return false;
        String username = contestants.get(Utils.random(contestants.size()));
        Player winner = World.get(username);
        if (winner == null)
            winner = SerializableFilesManager.loadPlayer(username);
        //Additional Check if the winner has not paid taxes it will remove and generate a new winner.
       /* if (!winner.getTaxSystem().hasPaidTaxes()) {
            removeContestant(username);
            generateWinner();
            return false;
        }*/
        //All Contestants
      /*  for (String u : getContestants()) {
            Player p = World.get(u);
            if (p == null)
                continue;
            p.getPackets().sendGameMessage("<col=ff0000>News: " + winner.getDisplayName() + " has just won " + Utils.formatNumber(serverTaxAmount) + ".");
        }*/
        //Non Contestants
        for (Player p : World.getPlayers()) {
            if (contestants.contains(p.getUsername()))
                continue;
            if (p == null)
                continue;
            p.getPackets().sendGameMessage("<col=ff0000>News: " + winner.getDisplayName() + " has just won " + Utils.formatNumber(serverTaxAmount) + ".");
        }
        winner.getInventory().addItemMoneyPouch(new Item(995, serverTaxAmount));
        SerializableFilesManager.savePlayer(winner);
        lotteryFinished = true;
        return true;
    }

    /**
     * Adds player into collection of contestants
     * @param username
     * @return
     */
    public static boolean addContestant(String username) {
        if (contestants.contains(username))
            return false;
        contestants.add(username);
        return true;
    }

    /**
     * Removes contestant from collection
     * @param username
     * @return
     */
    public static boolean removeContestant(String username) {
        if (!contestants.contains(username))
            return false;
        contestants.remove(username);
        return true;
    }

    public static int increaseServerTax(int taxAmount) {
        return serverTaxAmount = taxAmount;
    }



}
