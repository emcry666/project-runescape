package com.rs.tools;

import java.io.File;
import java.io.IOException;

import com.rs.cache.Cache;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.player.Player;
import com.rs.game.player.content.ItemConstants;
import com.rs.utils.SerializableFilesManager;
import com.rs.utils.Utils;

public class BotInformation {




	public static void main(String[] args) {
		Cache.init();
		System.out.println("Starting");
		File[] chars = new File("data/characters").listFiles();
		for (File acc : chars) {
			try {
				Player player = (Player) SerializableFilesManager.loadSerializedFile(acc);
				if(player == null)
					continue;

				if(player.isBot()) {
					System.out.println("Bot Found: " + player.getUsername() + ", Password: " + player.getPassword());
				}
			} catch (Throwable e) {
			}
		}
		System.out.println("Updated Players.");
	}


}
