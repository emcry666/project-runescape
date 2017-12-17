package com.rs.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.rs.cache.loaders.Configs;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.net.ServerChannelHandler;

public final class Logger {
	
	public static void log(String message) {
		System.out.println("[" + date() + "] -> " + message);
	}

	public static void parent(String message) {
		System.out.println("\t\t- " + message);
	}

	public static void info(String message) {
		System.out.println("[" + date() + "] -> " + message);
	}

	public static void error(String message) {
		System.err.println("[" + date() + "] -> " + message);
	}

	public static void error(Exception message) {
		System.err.println("[" + date() + "] -> ("
				+ message.getStackTrace()[0].getClassName() + ") Reason: "
				+ message.getMessage() + " at line: "
				+ message.getStackTrace()[0].getLineNumber());
		message.printStackTrace();
	}

	public static void error(Throwable message) {
		System.err.println("[" + date() + "] -> ("
				+ message.getStackTrace()[0].getClassName() + ") Reason: "
				+ message.getMessage() + " at line: "
				+ message.getStackTrace()[0].getLineNumber());
		message.printStackTrace();
	}
	
	public static void tag() {
		System.out.println("" + "\n--------------------------------------------------------------------------------" + "\n                                " + Configs.SERVER_NAME + "                             	"
				+ "\n                         Created by JTlr Frost                        	" + "\n--------------------------------------------------------------------------------");
	}
	
	public static void logIP(Player player, String message) {
		try {
			BufferedWriter bf = new BufferedWriter(new FileWriter("./data/logs/iplogs/" + player.getUsername() + ".txt", true));
			bf.write("[" + DateFormat.getDateTimeInstance().format(new Date()) + " " + Calendar.getInstance().getTimeZone().getDisplayName() + "] " + message + "");
			bf.newLine();
			bf.flush();
			bf.close();
		} catch (IOException ignored) {
		}
	}

	public static void handle(Throwable throwable) {
		System.out.println("ERROR! THREAD NAME: "
				+ Thread.currentThread().getName());
		throwable.printStackTrace();
	}

	public static void debug(long processTime) {
		log(Logger.class, "---DEBUG--- start");
		log(Logger.class, "WorldProcessTime: " + processTime);
		log(Logger.class,
				"WorldRunningTasks: " + WorldTasksManager.getTasksCount());
		log(Logger.class,
				"ConnectedChannels: "
						+ ServerChannelHandler.getConnectedChannelsSize());
		log(Logger.class, "---DEBUG--- end");
	}

	public static void log(Object classInstance, Object message) {
		log(classInstance.getClass().getSimpleName(), message);
	}

	public static void log(String className, Object message) {
		String text = "[" + className + "]" + " " + message.toString();
		System.out.println(text);
	}

	public static String currentTime(String dateFormat) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		return sdf.format(cal.getTime());
	}
	
	public static void write(String PATH, String TEXT) {
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter(PATH, true));
			writer.write(TEXT);
			writer.newLine();
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void report(Player player, String report, boolean bug) {
		String format = "[" + f_date() + "] - ";
		write("data/logs/reports/" + (bug ? "bugs" : "suggestions") + "/" + player.getUsername() + ".txt", format + report);
		player.getPackets().sendGameMessage("Thank-you for your " + (bug ? "report" : "suggestions") +  ", a staff member will look at it shortly.");
	}
	
	public static String f_date() {
		try {
			SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy' - 'HH-mm-ss");
			Date now = new Date();
			String parsed = format.format(now);
			return parsed;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public static String date() {
		try {
			SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
			Date now = new Date();
			String parsed = format.format(now);
			return parsed;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
	
	private Logger() {

	}

}
