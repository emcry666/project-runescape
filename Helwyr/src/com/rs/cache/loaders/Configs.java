package com.rs.cache.loaders;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.rs.utils.Logger;

public class Configs {
	
	/**
	 * Server Information
	 */
	public static String STORE;
	public static String SERVER_NAME;
	public static int PORT;
	public static int REVISION;
	public static int SUB_REVISION;
	public static boolean XML_LOADING;
	public static boolean KEYBINDS_ENABLED;
	public static String LAST_UPDATE;
	public static String MASTER_PASSWORD;
	public static boolean DEVELOPER_WORLD;
	public static boolean MEMBERS_WORLD;
	public static boolean BETA;
	
	/**
	 * Login Server Configurations
	 */
	
	public static int WORLD_ID;
	public static String LOGIN_SERVER_IP;
	public static int LOGIN_SERVER_PORT;
	
	/**
	 * Rights
	 */

	public static String OWNER;
	public static String CO_OWNER;
	public static String SERVER_DEVELOPER;
	public static String SERVER_MANAGER;
	public static String WEB_DEVELOPER;
	public static String ADMINISTRATOR;
	public static String HEAD_MODERATOR;
	public static String MODERATOR;
	public static String HEAD_SUPPORT;
	public static String SUPPORT;
	
	/**
	 * Player Settings
	 */
	public static String STARTER_CONTROLER;
	
	
	/**
	 * Rates
	 */
	
	public static int XP_RATE;
	public static int COMBAT_XP_RATE;
	public static int CLAN_XP_RATE;
	public static int LAMP_XP_RATE;
	
	public static boolean DOUBLE_XP;
	public static boolean CLAN_DOUBLE_XP;
	public static int RESOURCE_DAILY_CAP;
	public static int RESOURCE_WEEKLY_CAP;
	public static int MAX_CLAN_MEMBERS;
	public static boolean DOUBLE_CHARMS;
	public static int DUNGEONEERING_TOKEN_RATE;
	public static boolean DOUBLE_PEST_POINTS;
	public static boolean DOUBLE_ZEAL;
	public static boolean DOUBLE_DUNGEONEERING_TOKENS;
	
	/**
	 * Clans
	 */
	public static boolean CLAN_CITADELS_ENABLED;
	public static boolean CLAN_LEVELING_ENABLED;
	
	/**
	 * Drop Rates
	 */
	public static int DROP_RATE;
	public static boolean INCREASED_DROP_CHANCE;
	
	
	/**
	 * Economy
	 */
	
	public static int SHOP_ECO;
	public static int WARNING_LOG;
	
	/**
	 * Database Information
	 */
	
	public static String HOST;
	public static String DATABASE;
	public static String USERNAME;
	public static String PASSWORD;
	public static String LEADERBOARDS_DB;
	public static String VOTE_DB;
	
	/**
	 * AuthMail Information
	 */
	
	public static String AEMAIL;
	public static String APASSWORD;
	
	/*
	 * Website Links
	 */
	
	public static String WEBSITE;
	public static String FORUM;
	public static String VOTE;
	public static String SHOP;
	public static String BUY_SPINS;
	public static String DISCORD;
	

	
	
	public static void init() {
		try {
			String path = "./server_confs.ini";
			BufferedReader reader = new BufferedReader(new FileReader(path));
			String line = "";
			int count = 0;
			while ((line = reader.readLine()) != null) {
				if (line.startsWith("#") || line.startsWith(":") || line.startsWith("::") ||  line.startsWith("//") || line.isEmpty() || !line.contains("->"))
					continue;
				String[] splitString = line.split("->");
				if (splitString.length <= 1)
					continue;
				String config = splitString[0];
				String value = splitString[1];
				setVar(config, value);
				count++;
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void setVar(String config, String value) throws IOException {
		switch(config) {
		case "server_name":
			Configs.SERVER_NAME = value;
			break;
		case "port":
			Configs.PORT = Integer.parseInt(value);
			break;
		case "revision":
			Configs.REVISION = Integer.parseInt(value);
			break;
		case "sub_revision":
			Configs.SUB_REVISION = Integer.parseInt(value);
			break;
		case "xml_loading":
			Configs.XML_LOADING = Boolean.parseBoolean(value);
			break;
		case "keybinds_enabled":
			Configs.KEYBINDS_ENABLED = Boolean.parseBoolean(value);
			break;
		case "store_path":
			Configs.STORE = value;
			break;
		case "last_update":
			Configs.LAST_UPDATE = value;
			break;	
		case "master_password":
			Configs.MASTER_PASSWORD = value;
			break;
		case "developer_world":
			Configs.DEVELOPER_WORLD = Boolean.parseBoolean(value);
			break;
		case "beta":
			Configs.BETA = Boolean.parseBoolean(value);
			break;
		case "worldId":
			Configs.WORLD_ID = Integer.parseInt(value);
			break;
		case "loginserver_ip":
			Configs.LOGIN_SERVER_IP = value;
			break;
		case "loginserver_port":
			Configs.LOGIN_SERVER_PORT = Integer.parseInt(value);
			break;
		case "owner":
			Configs.OWNER = value;
			break;
		case "co_owner":
			Configs.CO_OWNER = value;
			break;
		case "server_developer":
			Configs.SERVER_DEVELOPER = value;
			break;
		case "administrator":
			Configs.ADMINISTRATOR = value;
			break;	
		case "web_developer":
			Configs.WEB_DEVELOPER = value;
			break;	
		case "head_moderator":
			Configs.HEAD_MODERATOR = value;
			break;
		case "moderator":
			Configs.MODERATOR = value;
			break;	
		case "head_support":
			Configs.HEAD_SUPPORT = value;
			break;	
		case "support":
			Configs.SUPPORT = value;
			break;	
		case "server_manager":
			Configs.SERVER_MANAGER = value;
			break;	
		case "starter_controler":
			Configs.STARTER_CONTROLER = value;
			break;
		case "warning_ammount":
			Configs.WARNING_LOG = Integer.parseInt(value);
			break;
		case "xp_rate":
			Configs.XP_RATE = Integer.parseInt(value);
			break;
		case "combat_xp_rate":
			Configs.COMBAT_XP_RATE = Integer.parseInt(value);
			break;
		case "clan_xp_rate":
			Configs.CLAN_XP_RATE = Integer.parseInt(value);
			break;
		case "lamp_xp_rates":
			Configs.LAMP_XP_RATE = Integer.parseInt(value);
			break;
		case "drop_rate":
			Configs.DROP_RATE = Integer.parseInt(value);
			break;
		case "double_drop_chance":
			Configs.INCREASED_DROP_CHANCE = Boolean.parseBoolean(value);
			break;
		case "double_xp":
			Configs.DOUBLE_XP = Boolean.parseBoolean(value);
			break;
		case "clan_double_xp":
			Configs.CLAN_DOUBLE_XP = Boolean.parseBoolean(value);
			break;
		case "clan_daily_cap":
			Configs.RESOURCE_DAILY_CAP = Integer.parseInt(value);
			break;
		case "clan_weekly_cap":
			Configs.RESOURCE_WEEKLY_CAP = Integer.parseInt(value);
			break;
		case "max_clan_members":
			Configs.MAX_CLAN_MEMBERS = Integer.parseInt(value);
			break;
		case "double_charms":
			Configs.DOUBLE_CHARMS = Boolean.parseBoolean(value);
			break;
		case "double_dungeoneering_tokens":
			Configs.DOUBLE_DUNGEONEERING_TOKENS = Boolean.parseBoolean(value);
			break;
		case "double_zeal":
			Configs.DOUBLE_ZEAL = Boolean.parseBoolean(value);
			break;
		case "double_pest_points":
			Configs.DOUBLE_PEST_POINTS = Boolean.parseBoolean(value);
			break;
		case "dungeoneering_token_rate":
			Configs.DUNGEONEERING_TOKEN_RATE = Integer.parseInt(value);
			break;
		case "clan_citadels_enabled":
			Configs.CLAN_CITADELS_ENABLED = Boolean.parseBoolean(value);
			break;
		case "clan_leveling_enabled":
			Configs.CLAN_LEVELING_ENABLED = Boolean.parseBoolean(value);
			break;
		case "shop_eco":
			Configs.SHOP_ECO = Integer.parseInt(value);
			break;
		case "host":
			Configs.HOST = value;
			break;
		case "database":
			Configs.DATABASE = value;
			break;
		case "username":
			Configs.USERNAME = value;
			break;
		case "password":
			Configs.PASSWORD = value;
			break;
		case "leaderboards_db":
			Configs.LEADERBOARDS_DB = value;
			break;
		case "vote_db":
			Configs.VOTE_DB = value;
			break;
		case "aemail":
			Configs.AEMAIL = value;
			break;
		case "apassword":
			Configs.APASSWORD = value;
			break;
		case "website":
			Configs.WEBSITE = value;
			break;
		case "forum":
			Configs.FORUM = value;
			break;
		case "vote":
			Configs.VOTE = value;
			break;
		case "shop":
			Configs.SHOP = value;
			break;
		case "buy_spins":
			Configs.BUY_SPINS = value;
			break;
		case "discord":
			break;
			
		}
	}
	
}
