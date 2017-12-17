package com.rs.utils;

import com.rs.game.World;
import com.rs.game.economics.capital.Production;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.content.Shop;

import java.io.*;
import java.util.*;

/**
 * Created by JTlr Frost {@skype;frostbitersps} on 7/17/2016.
 */
public class ShopsHandler {

    private static final HashMap<Integer, Shop> handledShops = new HashMap<Integer, Shop>();
    private static File DIRECTORY = new File("data/economic/shops");
    private static File[] SHOP_FILES = DIRECTORY.listFiles();
    private static final String EXTENSION = ".json";

    public static void loadShops() {
        Arrays.stream(SHOP_FILES).forEach(shop -> {
            String fileName = DIRECTORY + "/" + shop.getName();
            try (BufferedReader buffer = new BufferedReader(new FileReader(fileName))) {
                String line;
                List<Item> its = new ArrayList<>();
                int key = -1, currency = -1;
                boolean isGeneralStore = false;
                while ((line = buffer.readLine()) != null) {
                    if (line.startsWith("/") || line.startsWith("#") || line.isEmpty())
                        continue;
                    if (line.startsWith("key=")) {
                        key = Integer.parseInt(line.replace("key=", ""));
                    } else if (line.startsWith("general=")) {
                        isGeneralStore = Boolean.parseBoolean(line.replace("general=", ""));
                    } else if (line.startsWith("currency=")) {
                        currency = Integer.parseInt(line.replace("currency=", ""));
                    } else if (line.contains("::")) {
                        String[] split = line.split("::");
                        String split1 = line.split("-> ")[1];
                        int itemId = Integer.parseInt(split1.substring(0, split1.indexOf(":")));
                        int itemAmount = Integer.parseInt(split[1]);
                        Item item = new Item(itemId, itemAmount);
                        //demandAndSupply(item);//shows and calculates the shops quality
                        if (item != null)
                            its.add(item);
                    }
                }
                Item[] items = new Item[its.size()];
                Iterator<Item> itemIterator = its.iterator();
                for (int i = 0; i < its.size(); i++)
                    items[i] = itemIterator.next();
                handledShops.put(key, new Shop(shop.getName().replace(EXTENSION, ""), currency, items, isGeneralStore));
            } catch (IOException | NumberFormatException e) {
                e.printStackTrace();
            }
        });
    }


    public static void demandAndSupply(Item item) {
        /*Production production = World.getMarket().getProduction();
        Production.StockIdentifier stock = production.getStockIdentifierByItem(item);*/
    }

    public static boolean openShop(Player player, int key) {
        Shop shop = getShop(key);
        if (shop == null)
            return false;
        shop.addPlayer(player);
        return true;
    }

    public static Shop getShop(int key) {
        return handledShops.get(key);
    }


}
