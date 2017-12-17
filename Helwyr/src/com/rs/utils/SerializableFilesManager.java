package com.rs.utils;

import com.rs.cache.loaders.Configs;
import com.rs.game.economics.Market;
import com.rs.game.player.Player;
import com.rs.game.player.content.clans.Clan;
import com.rs.game.player.content.grandExchange.Offer;
import com.rs.game.player.content.grandExchange.OfferHistory;

import java.io.*;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;

public class SerializableFilesManager {

    private static final String PATH = "data/characters/";
    private static final String ECONOMIC = "data/economic/server.eco";
    private static final String BACKUP_PATH = "data/charactersBackup/";
    private static final String CLAN_PATH = "data/content/clans/";
    private static final String GE_OFFERS = "./data/exchange/grandExchangeOffers.ser";
    private static final String GE_OFFERS_HISTORY = "./data/exchange/grandExchangeOffersTrack.ser";
    private static final String GE_PRICES = "./data/exchange/grandExchangePrices.ser";


    public synchronized static final boolean containsPlayer(String username) {
        return new File(PATH + username + ".p").exists();
    }

    public synchronized static Player loadPlayer(String username) {
        try {
            return (Player) loadSerializedFile(new File(PATH + username + ".p"));
        } catch (Throwable e) {
            Logger.handle(e);
        }
        try {
            Logger.log("SerializableFilesManager", "Recovering account: "
                    + username);
            return (Player) loadSerializedFile(new File(BACKUP_PATH + username
                    + ".p"));
        } catch (Throwable e) {
            Logger.handle(e);
        }
        return null;
    }

    public static boolean createBackup(String username) {
        try {
            Utils.copyFile(new File(PATH + username + ".p"), new File(
                    BACKUP_PATH + username + ".p"));
            return true;
        } catch (Throwable e) {
            Logger.handle(e);
            return false;
        }
    }

    public synchronized static void savePlayer(Player player) {
        if (Configs.PORT > 43594)
            return;
        try {
            storeSerializableClass(player, new File(PATH + player.getUsername()
                    + ".p"));
        } catch (ConcurrentModificationException e) {
            //happens because saving and logging out same time
        } catch (Throwable e) {
            Logger.handle(e);
        }
    }


    public synchronized static boolean containsClan(String name) {
        return new File(getClanPath() + name + ".c").exists();
    }

    public synchronized static Clan loadClan(String name) {
        try {
            return (Clan) loadSerializedFile(new File(getClanPath() + name + ".c"));
        } catch (Throwable e) {
            Logger.handle(e);
        }
        return null;
    }

    public synchronized static void saveClan(Clan clan) {
        try {
            storeSerializableClass(clan, new File(getClanPath() + clan.getClanName() + ".c"));
        } catch (Throwable e) {
            Logger.handle(e);
        }
    }

    public synchronized static void deleteClan(Clan clan) {
        try {
            new File(getClanPath() + clan.getClanName() + ".c").delete();
        } catch (Throwable t) {
            Logger.handle(t);
        }
    }

    public synchronized static Market loadEconomy() {
        try {
            return (Market) loadSerializedFile(new File(getEconomic()));
        } catch (Throwable e) {
            Logger.handle(e);
        }
        return null;
    }

    public synchronized void saveEconomy(Market economical) {
        try {
            storeSerializableClass(economical, new File(getEconomic()));
        } catch (Throwable e) {
            Logger.handle(e);
        }
    }

    public synchronized static void resetEconomy() {
        try {
            new File(getEconomic()).delete();
        } catch (Throwable t) {
            Logger.handle(t);
        }
    }

    @SuppressWarnings("unchecked")
    public static synchronized HashMap<Long, Offer> loadGEOffers() {
        if (new File(GE_OFFERS).exists()) {
            try {
                return (HashMap<Long, Offer>) loadObject(GE_OFFERS);
            } catch (Throwable t) {
                Logger.handle(t);
                return null;
            }
        } else {
            return new HashMap<Long, Offer>();
        }
    }

    @SuppressWarnings("unchecked")
    public static synchronized ArrayList<OfferHistory> loadGEHistory() {
        if (new File(GE_OFFERS_HISTORY).exists()) {
            try {
                return (ArrayList<OfferHistory>) loadObject(GE_OFFERS_HISTORY);
            } catch (Throwable t) {
                Logger.handle(t);
                return null;
            }
        } else {
            return new ArrayList<OfferHistory>();
        }
    }

    @SuppressWarnings("unchecked")
    public static synchronized HashMap<Integer, Integer> loadGEPrices() {
        if (new File(GE_PRICES).exists()) {
            try {
                return (HashMap<Integer, Integer>) loadObject(GE_PRICES);
            } catch (Throwable t) {
                Logger.handle(t);
                return null;
            }
        } else {
            return new HashMap<Integer, Integer>();
        }
    }

    public static synchronized void saveGEOffers(HashMap<Long, Offer> offers) {
        try {
            SerializableFilesManager.storeObject(offers, GE_OFFERS);
        } catch (Throwable t) {
            Logger.handle(t);
        }
    }

    public static synchronized void saveGEHistory(ArrayList<OfferHistory> history) {
        try {
            SerializableFilesManager.storeObject(history, GE_OFFERS_HISTORY);
        } catch (Throwable t) {
            Logger.handle(t);
        }
    }

    public static synchronized void saveGEPrices(HashMap<Integer, Integer> prices) {
        try {
            SerializableFilesManager.storeObject(prices, GE_PRICES);
        } catch (Throwable t) {
            Logger.handle(t);
        }
    }


    private static synchronized Object loadObject(String f) throws IOException, ClassNotFoundException {
        if (!(new File(f).exists()))
            return null;
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
        Object object = in.readObject();
        in.close();
        return object;
    }

    private static synchronized void storeObject(Serializable o, String f) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
        out.writeObject(o);
        out.close();
    }


    public static final Object loadSerializedFile(File f) throws IOException,
            ClassNotFoundException {
        if (!f.exists())
            return null;
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
        Object object = in.readObject();
        in.close();
        return object;
    }

    public static final void storeSerializableClass(Serializable o, File f)
            throws IOException {

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
        out.writeObject(o);
        out.close();
    }

    public SerializableFilesManager() {

    }

    public static String getEconomic() {
        return ECONOMIC;
    }

    public static String getClanPath() {
        return CLAN_PATH;
    }

}
