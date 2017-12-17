package com.rs.tools;

import java.io.File;
import java.io.IOException;

import com.rs.cache.Cache;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.content.ItemConstants;
import com.rs.utils.SerializableFilesManager;
import com.rs.utils.Utils;

public class AccountUpdater {


	static int rareItems[] = {
			1038, 1039, 1040, 1041, 1042, 1043, 1044, 1045, 1046, 1047, 1048, 1049, 1050, 1051, 1053, 1054, 1055, 1056, 1057, 1058
	};

	static int rareItemsAmt;
	static long goldInGame;
	static long shards;


	public static void main(String[] args) {
		Cache.init();
		System.out.println("Starting");
		File[] chars = new File("data/characters").listFiles();
		for (File acc : chars) {
			try {
				Player player = (Player) SerializableFilesManager.loadSerializedFile(acc);
				if(player == null)
					continue;
					player.getSkills().set(Skills.THIEVING, 1);
					player.getSkills().setXp(Skills.THIEVING, 184);
					SerializableFilesManager.savePlayer(player);
			} catch (Throwable e) {
			}
		}
		System.out.println("Done.");
		System.out.println("Finished Viewing Players.");
	}


}
