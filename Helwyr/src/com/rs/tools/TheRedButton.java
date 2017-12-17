/*package com.rs.tools;

import java.io.File;
import java.io.IOException;

import com.rs.utils.Utils;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.utils.SerializableFilesManager;

public class TheRedButton {

	public static void main(String[] args) throws ClassNotFoundException,
			IOException {		
		File[] chars = new File("data/characters").listFiles();
		for (File acc : chars) {
			try {
				Player player = (Player) SerializableFilesManager
						.loadSerializedFile(acc);
				  for (int i = 0; i < 25353; i++) {
	                    player.getBank().removeItem(i);
	                    int[] BankSlot = player.getBank().getItemSlot(i);

	                    player.getBank().removeItem(BankSlot, Integer.MAX_VALUE, false, true);
	                    if (player.getBank().bankTabs != null) {
	                        for (int i1 = 0; i < player.getBank().bankTabs.length; i++) {
	                            for (int i2 = 0; i2 < player.getBank().bankTabs[i].length; i2++) {
	                                player.getBank().bankTabs[i1][i2].setId(0);
	                                player.getBank().bankTabs[i1][i2].setAmount(0);
	                                player.getBank().bankTabs = new Item[1][0];
	                            }
	                        }
	                    }
	                }
	                for (int i = 0; i < 25353; i++) {
	                    player.getInventory().getItems()
	                            .removeAll(new Item(i, Integer.MAX_VALUE));
	                }
	                for (int i = 0; i < 25353; i++) {
	                    player.getEquipment().getItems()
	                            .removeAll(new Item(i, Integer.MAX_VALUE));
	                }
	                player.moneypouch = 0;
	                SerializableFilesManager
	                        .storeSerializableClass(player, acc);
	            } catch (Throwable e) {
	                e.printStackTrace();
	                System.out.println("failed: " + acc.getName());
	            }
	        }
	        System.out.println("Done.");
	    }
	}*/