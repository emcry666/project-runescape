package com.rs.tools;

import java.io.File;
import java.io.IOException;

import com.rs.game.player.content.clans.Clan;
import com.rs.utils.SerializableFilesManager;

public class EmptyClanRemover {
	
	public static final String LOCATION = SerializableFilesManager.getClanPath();
	
	public static void main(String[] args) {
		initalize();
	}
	
	public static void initalize() {
		File[] chars = new File("data/content/clans").listFiles();
		for (File file : chars) {
			try {
				if(file == null)
					continue;
				if(file.getName().toLowerCase().contains("null"))
					continue;
				Clan clan = (Clan) SerializableFilesManager.loadSerializedFile(file);
				if(clan.getMembers().size() < 1) {
					file.delete();
				}
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}
		}
	}

}
