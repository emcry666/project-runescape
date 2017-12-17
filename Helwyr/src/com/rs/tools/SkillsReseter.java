package com.rs.tools;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.utils.SerializableFilesManager;

public class SkillsReseter {

	/*public static int[] KEEP_SKILLS = { Skills.ATTACK, Skills.DEFENCE,
			Skills.STRENGTH, Skills.HITPOINTS, Skills.MAGIC, Skills.RANGE,
			Skills.PRAYER, Skills.SUMMONING };

	public static boolean resetSkill(int id) {
		for (int s : KEEP_SKILLS)
			if (s == id)
				return false;
		return true;
	}*/
	
	
	public static void main(String[] args) throws ClassNotFoundException,
			IOException {
		// Cache.init();
		File[] chars = new File("data/characters").listFiles();
		for (File acc : chars) {
			try {
				Player player = (Player) SerializableFilesManager
						.loadSerializedFile(acc);
				//int amount = player.getBank().getItem(1042).getAmount();
				//Player.checkBank(player, player.getBank().getItem(1038).getAmount());
				//Player.checkBank(player, player.getBank().getItem(1040).getAmount());
				//Player.checkBank(player, player.getBank().getItem(13740).getAmount());
				//Player.checkBank(player, player.getBank().getItem(29883).getAmount());
				//if (player.getInventory().containsOneItem(1043)) {
				int amount = player.getInventory().getNumerOf(29924);
				int bankamount = player.getBank().getItem(29924).getAmount();
				if (amount >= 25000000 || bankamount > 25000000) {
				System.out.println("Found Account With Items: " + acc.getName());

				}
				
				//System.out.println(player.getBank().getItem(29883).getAmount());
				//}
				/*player.getEquipment().getItems().removeAll(new Item(11694, Integer.MAX_VALUE));
				player.getInventory().getItems().removeAll(new Item(11694, Integer.MAX_VALUE));
				player.getBank().removeItem(11694);
				player.getEquipment().getItems().removeAll(new Item(17295, Integer.MAX_VALUE));
				player.getInventory().getItems().removeAll(new Item(17295, Integer.MAX_VALUE));
				player.getBank().removeItem(17295);
				player.getEquipment().getItems().removeAll(new Item(2996, Integer.MAX_VALUE));
				player.getInventory().getItems().removeAll(new Item(2996, Integer.MAX_VALUE));
				player.getBank().removeItem(2996);*/
				
				/*player.getInventory().getItems().removeAll(new Item(11234, Integer.MAX_VALUE));
				player.getInventory().getItems().removeAll(new Item(17295, Integer.MAX_VALUE));
				player.getInventory().getItems().removeAll(new Item(1050, Integer.MAX_VALUE));
				player.getInventory().getItems().removeAll(new Item(1038, Integer.MAX_VALUE));
				player.getInventory().getItems().removeAll(new Item(1040, Integer.MAX_VALUE));
				player.getInventory().getItems().removeAll(new Item(1042, Integer.MAX_VALUE));
				player.getInventory().getItems().removeAll(new Item(1044, Integer.MAX_VALUE));
				player.getInventory().getItems().removeAll(new Item(1046, Integer.MAX_VALUE));
				player.getInventory().getItems().removeAll(new Item(1048, Integer.MAX_VALUE));
				player.getInventory().getItems().removeAll(new Item(20147, Integer.MAX_VALUE));
				player.getInventory().getItems().removeAll(new Item(20151, Integer.MAX_VALUE));
				player.getInventory().getItems().removeAll(new Item(20155, Integer.MAX_VALUE));
				player.getInventory().getItems().removeAll(new Item(20135, Integer.MAX_VALUE));
				player.getInventory().getItems().removeAll(new Item(20139, Integer.MAX_VALUE));
				player.getInventory().getItems().removeAll(new Item(20143, Integer.MAX_VALUE));
				player.getInventory().getItems().removeAll(new Item(20159, Integer.MAX_VALUE));
				player.getInventory().getItems().removeAll(new Item(20163, Integer.MAX_VALUE));
				player.getInventory().getItems().removeAll(new Item(20167, Integer.MAX_VALUE));
				player.getBank().removeItem(11234);
				player.getBank().removeItem(17295);
				player.getBank().removeItem(1050);
				player.getBank().removeItem(1038);
				player.getBank().removeItem(1040);
				player.getBank().removeItem(1042);
				player.getBank().removeItem(1044);
				player.getBank().removeItem(1046);
				player.getBank().removeItem(1048);
				player.getBank().removeItem(20147);
				player.getBank().removeItem(20151);
				player.getBank().removeItem(20155);
				player.getBank().removeItem(20135);
				player.getBank().removeItem(20139);
				player.getBank().removeItem(20143);
				player.getBank().removeItem(20159);
				player.getBank().removeItem(20163);
				player.getBank().removeItem(20167);
				player.getEquipment().getItems().removeAll(new Item(11234, Integer.MAX_VALUE));
				player.getEquipment().getItems().removeAll(new Item(17295, Integer.MAX_VALUE));
				player.getEquipment().getItems().removeAll(new Item(1038, Integer.MAX_VALUE));
				player.getEquipment().getItems().removeAll(new Item(1040, Integer.MAX_VALUE));
				player.getEquipment().getItems().removeAll(new Item(1042, Integer.MAX_VALUE));
				player.getEquipment().getItems().removeAll(new Item(1044, Integer.MAX_VALUE));
				player.getEquipment().getItems().removeAll(new Item(1046, Integer.MAX_VALUE));
				player.getEquipment().getItems().removeAll(new Item(1048, Integer.MAX_VALUE));
				player.getEquipment().getItems().removeAll(new Item(1050, Integer.MAX_VALUE));
				player.getEquipment().getItems().removeAll(new Item(20147, Integer.MAX_VALUE));
				player.getEquipment().getItems().removeAll(new Item(20151, Integer.MAX_VALUE));
				player.getEquipment().getItems().removeAll(new Item(20155, Integer.MAX_VALUE));
				player.getEquipment().getItems().removeAll(new Item(20135, Integer.MAX_VALUE));
				player.getEquipment().getItems().removeAll(new Item(20139, Integer.MAX_VALUE));
				player.getEquipment().getItems().removeAll(new Item(20143, Integer.MAX_VALUE));
				player.getEquipment().getItems().removeAll(new Item(20159, Integer.MAX_VALUE));
				player.getEquipment().getItems().removeAll(new Item(20163, Integer.MAX_VALUE));
				player.getEquipment().getItems().removeAll(new Item(20167, Integer.MAX_VALUE));
				//player.getEquipment().getItems().removeAll(new Item(11694, Integer.MAX_VALUE));
				//player.getEquipment().deleteItem(11234, 0);
				//player.getBank().addItem(23679, 1, false);*/
				SerializableFilesManager
				.storeSerializableClass(player, acc);
			} catch (Throwable e) {
				//e.printStackTrace();
				//System.out.println("failed: " + acc.getName());
			}
		}
		System.out.println("Done.");
	}
	

	
}
