package com.rs.game.economics.capital.taxes;

import com.rs.Settings;
import com.rs.game.player.Player;
import com.rs.game.player.WeekendLottery;

import java.io.*;
import java.util.List;


/**
 * Created by JTlr Frost {@skype;frostbitersps} on 7/8/2016.
 */
public class PlayerTaxes implements Serializable {

    private static final long serialVersionUID = -6065531521523479167L;

    private Player player;
    private int[] taxData;//amount due, total amount, overage
    public int weeklyTaxAmount = Settings.WEEKLY_TAX_AMOUNT;

    public PlayerTaxes(Player player) {
        this.player = player;
        this.taxData = new int[2];
    }

    /**
     * Initalizes and notifys the player's remaining/finished taxes debt;
     *
     * @return
     */
    public boolean taxAlert() {
        if (!hasPaidTaxes())
            player.getPackets().sendGameMessage("<col=ff0000>Tax Paid: You have " + (getTotalAmountPaid() == 0 ? "not" : "")
                    + " paid " + (getTotalAmountPaid() == 0 ? " anything" : getTotalAmountPaid() + " out of " + weeklyTaxAmount + ".") + "</col>");
        return true;
    }

    public boolean payTax(int amount) {
        //Checks and removes money from money pouch and/or inventory
        if(!player.getInventory().hasEnoughCoins(amount)) {
            player.getPackets().sendGameMessage("You do not have enough coins to pay your taxes.");
            return false;
        }
        if(player.getInventory().checkMoneyAndRemove(amount)) {
            setAmountDue(getAmountDue() - amount);
            setTotalAmountPaid(getTotalAmountPaid() + amount);
            player.getPackets().sendGameMessage("Thank you for paying your taxes. You have payed a total of " + getTotalAmountPaid() + ".");
        }
        return true;
    }

    /**
     * Serializable for  @taxes.ser
     */
    public static void saveTax() {
        FileOutputStream fileOutput = null;
        ObjectOutputStream stream = null;
        try {
            fileOutput = new FileOutputStream("data/economic/taxes.ser");
            stream = new ObjectOutputStream(fileOutput);
            stream.writeObject(WeekendLottery.contestants);
            stream.writeInt(WeekendLottery.serverTaxAmount);
            stream.writeInt(WeekendLottery.lotteryFinished ? 1 : 0);
            stream.flush();
            fileOutput.flush();
            stream.close();
            fileOutput.close();
        } catch (IOException e) {
            System.out.println("Could not save taxes data.");
        }
    }

    /**
     * Re-initializes the variables after server restart @taxes.ser
     * @return
     */
    @SuppressWarnings("unchecked")
    public static List<String> readTaxData() {
        FileInputStream input = null;
        ObjectInputStream objectInput = null;
        List<String> returningObject = null;
        try {
            input = new FileInputStream("data/economic/taxes.ser");
            objectInput = new ObjectInputStream(input);
            returningObject = (List<String>) objectInput.readObject();
            WeekendLottery.contestants = returningObject;
            WeekendLottery.serverTaxAmount = objectInput.readInt();
            WeekendLottery.lotteryFinished = (objectInput.readInt() == 0 ? false : true);
            objectInput.close();
            input.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return returningObject;
    }

    public boolean hasPaidTaxes() {
        return getTotalAmountPaid() > weeklyTaxAmount;
    }

    public int getAmountDue() {
        return taxData[0];
    }

    public int setAmountDue(int taxData) {
        this.taxData[0] = taxData;
        if(this.taxData[0] < 0)
            return this.taxData[0] = 0;
        if(this.taxData[0] > weeklyTaxAmount)
            this.taxData[0] = weeklyTaxAmount;
        return this.taxData[0];
    }

    public int getTotalAmountPaid() {
        return taxData[1];
    }

    public int setTotalAmountPaid(int amount) {
        return taxData[1] = amount;
    }

    public int getOverage() {
        return taxData[2];
    }

    public int setOverage(int overage) {
        return taxData[2] = overage;
    }

    public boolean hasPaidWeeklyTaxes() {
        return getTotalAmountPaid() == weeklyTaxAmount
                && getAmountDue() == 0;
    }

    public Player setPlayer(Player player) {
        if (player == null)
            return this.player = player;
        return player;
    }

    public Player getPlayer() {
        return player;
    }


}
