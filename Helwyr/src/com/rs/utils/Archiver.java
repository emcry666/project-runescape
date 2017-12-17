package com.rs.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.rs.Settings;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.npc.NPC;
import com.rs.game.player.Player;
import com.rs.game.player.content.bot.Bot;

public class Archiver {
	
	public static void createLogFile(Player player) {
		File dir = new File("data/logs/" + player.getUsername());
		if (dir.exists()) {
			return;
		} else {
			dir.mkdir();
			System.out.println("Created a log archive for \"" + Utils.formatPlayerNameForDisplay(player.getUsername()) + "\".");
		}
	}
	
	public static void createLogs(Player player) {
		File creation = new File("data/logs/" + player.getUsername() + "/creation.txt");
		File login = new File("data/logs/" + player.getUsername() + "/login.txt");
		File logout = new File("data/logs/" + player.getUsername() + "/logout.txt");
		File commands = new File("data/logs/" + player.getUsername() + "/commands.txt");
		File chat = new File("data/logs/" + player.getUsername() + "/chat.txt");
		File trade = new File("data/logs/" + player.getUsername() + "/trade.txt");
		File drop = new File("data/logs/" + player.getUsername() + "/drop.txt");
		File pickup = new File("data/logs/" + player.getUsername() + "/pickup.txt");
		File empty = new File("data/logs/" + player.getUsername() + "/empty.txt");
		File kills = new File("data/logs/" + player.getUsername() + "/npc-kills.txt");
		File deaths = new File("data/logs/" + player.getUsername() + "/deaths.txt");
		if (creation.exists()) {
			return;
		} else {
			try {
				creation.createNewFile();
				login.createNewFile();
				logout.createNewFile();
				commands.createNewFile();
				chat.createNewFile();
				trade.createNewFile();
				drop.createNewFile();
				pickup.createNewFile();
				empty.createNewFile();
				kills.createNewFile();
				deaths.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void writeCreationLog(Player player) {
		if((player instanceof Bot))
			return;
		File creation = new File("data/logs/" + player.getUsername() + "/creation.txt");
		try {
			if (!creation.exists()) {
				creation.createNewFile();
			}
			BufferedWriter writer = new BufferedWriter(new FileWriter(creation, true));
			writer.write(format(getDate()) + player.getSession().getIP() + "");
			writer.newLine();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeLoginLog(Player player) {
		if (Settings.isOwner(player) || player instanceof Bot)
			return;
		File login = new File("data/logs/" + player.getUsername() + "/login.txt");
		try {
			if (!login.exists()) {
				login.createNewFile();
			}
			BufferedWriter writer =  new BufferedWriter(new FileWriter(login, true));
			writer.write(format(getDate()) + player.getSession().getIP() + " RIGHTS = " + getRightsType(player, player.getRights()));
			writer.newLine();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeLogoutLog(Player player) {
		if (Settings.isOwner(player) || player instanceof Bot)
			return;
		File logout = new File("data/logs/" + player.getUsername() + "/logout.txt");
		try {
			if (!logout.exists()) {
				logout.createNewFile();
			}
			BufferedWriter writer =  new BufferedWriter(new FileWriter(logout, true));
			writer.write(format(getDate()) + player.getSession().getIP() + " RIGHTS = " + getRightsType(player, player.getRights()));
			writer.newLine();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeCommandsLog(Player player, String[] cmd) {
		File commands = new File("data/logs/" + player.getUsername() + "/commands.txt");
		try {
			if (!commands.exists()) {
				commands.createNewFile();
			}
			BufferedWriter writer =  new BufferedWriter(new FileWriter(commands, true));
			String commandSuffix = "";
			for (int i = 1; i < cmd.length; i++) {
				commandSuffix += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
			}
			writer.write(format(getDate()) + format(player.getSession().getIP()) + cmd[0] + " " + commandSuffix);
			writer.newLine();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void writePunishmentLog(Player player, String[] cmd) {
		if (player.getRights() >= 1 || player.isSupporter()) {
		File punishments = new File("data/logs/" + player.getUsername() + "/punishments.txt");
		try {
			if (!punishments.exists()) {
				punishments.createNewFile();
			}
			BufferedWriter writer =  new BufferedWriter(new FileWriter(punishments, true));
			String commandSuffix = "";
			for (int i = 1; i < cmd.length; i++) {
				commandSuffix += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
			}
			writer.write(format(getDate()) + format(player.getSession().getIP()) + cmd[0] + " " + commandSuffix);
			writer.newLine();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
			}
		}
	}
	
	public static void writeChatLog(Player player, String message, int chatType) {
		File chat = new File("data/logs/" + player.getUsername() + "/chat.txt");
		try {
			if (!chat.exists()) 
				chat.createNewFile();
			BufferedWriter writer =  new BufferedWriter(new FileWriter(chat, true));
			writer.write(format(getDate()) + format(player.getSession().getIP()) + format(getChatType(chatType)) + message);
			writer.newLine();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeTradeLog(Player player, Player target, Item[] playerItems, Item[] targetItems) {
		if (Settings.isOwner(player) || player instanceof Bot)
			return;
		File trade = new File("data/logs/" + player.getUsername() + "/trade.txt");
		try {
			if (!trade.exists()) {
				trade.createNewFile();
			}
			BufferedWriter writer =  new BufferedWriter(new FileWriter(trade, true));
			String p1 = player.getUsername() + " (" + player.getSession().getIP() + ") ";
			String p2 = target.getUsername() + " (" + target.getSession().getIP() + ") ";
			writer.write(format(getDate()) + p1 + " traded with " + p2);
			String[] space = {
				"",
				"	",
				"		",
				"			",
			};
			writer.newLine();
			writer.write(space[1] + "INPUT FROM - " + p1);
			writer.newLine();
			for (Item item : playerItems) {
				if (item == null) {
					continue;
				}
				writer.write(space[2] + item.getAmount() + "x " + item.getName() + " - ID = " + item.getId());
				writer.newLine();
			}
			writer.newLine();
			writer.write(space[1] + "INPUT FROM - " + p2);
			for (Item item : targetItems) {
				if (item == null) {
					continue;
				}
				writer.write(space[2] + item.getAmount() + "x " + item.getName() + " - ID = " + item.getId());
				writer.newLine();
			}
			writer.newLine();
			writer.write("*END*");
			writer.newLine();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeDropLog(Player player, Item item, WorldTile loc) {
		if (Settings.isOwner(player) || player instanceof Bot)
			return;
		File drop = new File("data/logs/" + player.getUsername() + "/drop.txt");
		try {
			if (!drop.exists()) {
				drop.createNewFile();
			}
			BufferedWriter writer = new BufferedWriter(new FileWriter(drop, true));
			if (item == null) {
				writer.close();
				return;
			}
			String itemData = item.getAmount() + "x " + item.getName() + " - ID = " + item.getId();
			String location = format(loc.getX() + ", " + loc.getY() + ", " + loc.getPlane());
			writer.write(format(getDate()) + format(player.getSession().getIP()) + "dropped " + itemData + " at " + location);
			writer.newLine();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void writePickupLog(Player player, Item item, WorldTile loc) {
		if (Settings.isOwner(player) || player instanceof Bot)
			return;
		File pickup = new File("data/logs/" + player.getUsername() + "/pickup.txt");
		try {
			if (!pickup.exists()) {
				pickup.createNewFile();
			}
			BufferedWriter writer =  new BufferedWriter(new FileWriter(pickup, true));
			if (item == null) {
				writer.close();
				return;
			}
			String itemData = item.getAmount() + "x " + item.getName() + " - ID = " + item.getId();
			String location = format(loc.getX() + ", " + loc.getY() + ", " + loc.getPlane());
			writer.write(format(getDate()) + format(player.getSession().getIP()) + "picked up " + itemData + " at " + location);
			writer.newLine();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeEmptyLog(Player player, Item[] items) {
		if (Settings.isOwner(player) || player instanceof Bot)
			return;
		File empty = new File("data/logs/" + player.getUsername() + "/empty.txt");
		try {
			if (!empty.exists()) {
				empty.createNewFile();
			}
			BufferedWriter writer = new BufferedWriter(new FileWriter(empty, true));
			String[] space = {
				"",
				"	",
				"		",
				"			",
			};
			writer.write(format(getDate()) + format(player.getSession().getIP()) + "EMPTIED ITEMS:");
			for (Item item : items) {
				if (item == null) {
					continue;
				}
				writer.newLine();
				writer.write(space[1] + item.getAmount() + "x " + item.getName() + " - ID = " + item.getId());
			}
			writer.newLine();
			writer.write("*END*");
			writer.newLine();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeKillLog(Player player, NPC npc, WorldTile loc) {
		if (Settings.isOwner(player) || player instanceof Bot)
			return;
		if(player instanceof Bot)
			return;
		File kills = new File("data/logs/" + player.getUsername() + "/npc-kills.txt");
		try {
			if (!kills.exists()) {
				kills.createNewFile();
			}
			String npcData = npc.getName() + " - ID = " + npc.getId();
			String location = format(loc.getX() + ", " + loc.getY() + ", " + loc.getPlane());
			BufferedWriter writer = new BufferedWriter(new FileWriter(kills, true));
				writer.write(format(getDate()) + format(player.getSession().getIP()) + "killed " + npcData + " at " + location);
			writer.newLine();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeDeathsLog(Player player, WorldTile loc) {
		if (Settings.isOwner(player) || player instanceof Bot)
			return;
		File kills = new File("data/logs/" + player.getUsername() + "/deaths.txt");
		try {
			if (!kills.exists()) {
				kills.createNewFile();
			}
			String location = format(loc.getX() + ", " + loc.getY() + ", " + loc.getPlane());
			BufferedWriter writer = new BufferedWriter(new FileWriter(kills, true));
			writer.write(format(getDate()) + format(player.getSession().getIP()) + "died at " + location);
			writer.newLine();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void writePlayersOnline(Player player) {
		File playersOnline = new File("data/playersOnline.txt");
		try {
			if (!playersOnline.exists()) {
				playersOnline.createNewFile();
			}
			BufferedWriter writer =  new BufferedWriter(new FileWriter(playersOnline, true));
			writer.write(format(getDate()) + player.getUsername() + " - There were " + "" + World.getPlayers().size() + " players online.");
			writer.newLine();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static String getChatType(int value) {
		switch (value) {
		
		case 0:
			return "PUBLIC";
			
		case 1:
			return "PRIVATE";
			
		default:
			return "PUBLIC";
		
		}
	}
	
	private static String getRightsType(Player player, int rights) {
		if (Settings.isOwner(player) || player instanceof Bot)
			return "DEV";
		switch (rights) {
		
		case 0:
			if (player.isSupporter()) {
				return "SUPPORT";
			}
			return "PLAYER";
			
		case 1:
			return "MOD";
			
		case 2:
			return "ADMIN";
			
		default:
			return "PLAYER";
			
		}
	}
	
	private static String format(String text) {
		String finalized = "[" + text + "] ";
		return finalized;
	}
	
	private static String getDate() {
		Date current = new Date();
		SimpleDateFormat format = new SimpleDateFormat("E MM.dd.yyyy 'at' hh:mm:ss a zzz");
		return format.format(current);
	}

}
