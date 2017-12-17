package com.rs.tools;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

import com.rs.game.player.Player;
import com.rs.utils.Logger;
import com.rs.utils.SerializableFilesManager;

public final class MacBan {

	public static CopyOnWriteArrayList<String> ipList;

	private static final String PATH = "data/bannedMACS.ser";
	private static boolean edited;

	@SuppressWarnings("unchecked")
	public static void init() {
		File file = new File(PATH);
		if (file.exists())
			try {
				ipList = (CopyOnWriteArrayList<String>) SerializableFilesManager
						.loadSerializedFile(file);
				return;
			} catch (Throwable e) {
				Logger.handle(e);
			}
		ipList = new CopyOnWriteArrayList<String>();
	}

	public static final void save() {
		if (!edited)
			return;
		try {
			SerializableFilesManager.storeSerializableClass(ipList, new File(
					PATH));
			edited = false;
			checkCurrent();
			init();
		} catch (Throwable e) {
			Logger.handle(e);
		}
	}

	public static boolean isBanned(String ip) {
		return ipList.contains(ip);
	}

	public static void ban(Player player, boolean loggedIn) {
		player.setPermBanned(true);
		if (loggedIn) {
			ipList.add(player.getMacAddress());
			player.getSession().getChannel().disconnect();
		} else {
			ipList.add(player.getMacAddress());
			SerializableFilesManager.savePlayer(player);
		}
		edited = true;
		save();
	}

	public static void banIP(String ip) {
		ipList.add(ip);
		System.out.println("[Manual IP BAN]: " + ip);
		edited = true;
		save();
	}

	public static void unbanIP(String ip) {
		ipList.remove(ip);
		System.out.println("[Manual IP UNBAN]: " + ip);
		edited = true;
		save();
	}

	public static void unban(Player player) {
		player.setPermBanned(false);
		ipList.remove(player.getMacAddress());
		edited = true;
		save();
	}

	public static void checkCurrent() {
		removeOld();
		for (String list : ipList) {
			try {
				final String FILE_PATH = "C:/xampp/htdocs/files/macs_banned.txt";
				BufferedWriter writer = new BufferedWriter(new FileWriter(
						FILE_PATH, true));
				writer.write(list);
				writer.newLine();
				writer.flush();
				writer.close();
			} catch (IOException er) {
				System.out.println("Macban Dump Error.");
			}
		}
	}

	public static void removeOld() {
		String location = "C:/xampp/htdocs/files/macs_banned.txt";
		File f1 = new File(location);
		f1.delete();
	}

	public static CopyOnWriteArrayList<String> getList() {
		return ipList;
	}

}
