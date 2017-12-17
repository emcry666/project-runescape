package com.rs.tools;

import java.io.File;
import java.io.IOException;

import com.rs.cache.Cache;
import com.rs.game.player.Player;
import com.rs.utils.SerializableFilesManager;
import com.rs.utils.Utils;

public class WealthWhipser {

	public static void main(String[] args) {
		Cache.init();
		System.out.println("Starting");
		File[] chars = new File("data/characters").listFiles();
		for (File acc : chars) {
			try {
				Player player = (Player) SerializableFilesManager.loadSerializedFile(acc);
				if(player.getSkills().getTotalLevel(player) < 70) {
					System.out.println("Deleted Account " + acc.getName());
					acc.delete();
				}
			} catch (Throwable e) {
				System.out.println("failed: " + acc.getName());
			}
		}
		System.out.println("Done.");
	}

}
