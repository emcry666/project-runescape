package com.rs;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import com.rs.cache.Cache;
import com.rs.cache.loaders.Configs;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.cache.loaders.ItemsEquipIds;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.cache.loaders.ObjectDefinitions;
import com.rs.engine.GameEngine;
import com.rs.game.EntitySpawning;
import com.rs.game.RegionBuilder;
import com.rs.game.World;
import com.rs.game.area.dungeonhandler.DungeonEventHandler;
import com.rs.game.cityhandler.CityEventHandler;
import com.rs.game.economics.capital.taxes.PlayerTaxes;
import com.rs.game.npc.combat.CombatScriptsHandler;
import com.rs.game.player.Player;
import com.rs.game.player.content.CompletionistRequirements;
import com.rs.game.player.content.FishingSpotsHandler;
import com.rs.game.player.content.FriendChatsManager;
import com.rs.game.player.content.TrimCompletionistRequirements;
import com.rs.game.player.content.clans.ClansManager;
import com.rs.game.player.content.grandExchange.GrandExchange;
import com.rs.game.player.content.instancing.bossInstance.BossInstanceHandler;
import com.rs.game.player.content.land.LandHandler;
import com.rs.game.player.controlers.ControlerHandler;
import com.rs.game.player.cutscenes.CutscenesHandler;
import com.rs.game.player.dialogues.DialogueHandler;
import com.rs.net.ServerChannelHandler;
import com.rs.tools.EmptyClanRemover;
import com.rs.tools.MapInformationParser;
import com.rs.utils.AutoBackup;
import com.rs.utils.DTRank;
import com.rs.utils.DisplayNames;
import com.rs.utils.IPBanL;
import com.rs.utils.ItemBonuses;
import com.rs.utils.ItemExamines;
import com.rs.utils.Logger;
import com.rs.utils.MusicHints;
import com.rs.utils.NPCBonuses;
import com.rs.utils.NPCCombatDefinitionsL;
import com.rs.utils.NPCDrops;
import com.rs.utils.NPCSpawns;
import com.rs.utils.ObjectSpawns;
import com.rs.utils.PkRank;
import com.rs.utils.SerializableFilesManager;
import com.rs.utils.ShopsHandler;
import com.rs.utils.Utils;
import com.rs.utils.huffman.Huffman;

public final class Launcher {

	public static long ONLINE = System.currentTimeMillis();
	

	public static void main(String[] args) throws Exception {
		if (args.length < 4) {
			System.out.println("USE: portOffset(43593 + arg) guimode(boolean) debug(boolean) hosted(boolean)");
			return;
		}
		Cache.init();
		Configs.init();
		Logger.tag();
		Logger.info("---------------------------------------------------");
		Logger.info("------------------Launching World------------------");
		Logger.info("---------------------------------------------------");
		Logger.info("Initializing " + (Configs.MEMBERS_WORLD == true ? "Members " : "Free") + (Settings.SERVER_TYPE == 0 ? " Remake " : Settings.SERVER_TYPE == 1 ?  " PvP " : Settings.SERVER_TYPE == 3 ? " Normal " : Settings.SERVER_TYPE) + "World - " + "World " + Settings.WORLD_ID);
		Logger.info("Debugging: " + Settings.DEBUG + " | Hosting: " + Settings.HOSTED + " | Logging: " + Settings.DEBUG);
		Configs.DEVELOPER_WORLD = Boolean.parseBoolean(args[4]);
		Configs.PORT = (Configs.PORT + Integer.parseInt(args[3]));
		Settings.HOSTED = Boolean.parseBoolean(args[2]);
		Settings.DEBUG = Boolean.parseBoolean(args[1]);
		long currentTime = Utils.currentTimeMillis();
		initializeHandlers();
		initializeManagers();
		initializeEntities();
		initializeDatabases();
		initializeCore();
		initializeTasks();
		addCleanMemoryTask();
		new AutoBackup();
		Logger.log("Launcher", "Server Type: " + (Configs.DEVELOPER_WORLD ? "Developer" : "Normal") + " World.");
		Logger.log("Launcher", "Server took " + (Utils.currentTimeMillis() - currentTime)
				+ " milli seconds to launch on port " + Configs.PORT + ".");
	}
	
	private static void initializeHandlers() {
		Logger.info("---------------------------------------------------");
		Logger.info("---------------Initializing Handlers---------------");
		Logger.info("---------------------------------------------------");
		Logger.info("Initializing Banned Addresses...");
		IPBanL.init();
		Logger.info("Initializing PKRank...");
		PkRank.init();
		Logger.info("Initializing Dominion Tower...");
		DTRank.init();
		Logger.info("Initializing Music Hints...");
		MusicHints.init();
		Logger.info("Initializing Item Bonuses...");
		ItemBonuses.init();
		Logger.info("Initializing Display Names...");
		DisplayNames.init();
		Logger.info("Initializing Shops...");
		ShopsHandler.loadShops();
		Logger.info("Initializing Item Examines...");
		ItemExamines.init();
		Logger.info("Initializing Item EquipIds...");
		ItemsEquipIds.init();
		Logger.info("Initializing Land...");
		LandHandler.readLand();
		Logger.info("Initializing Fishing Spots...");
		FishingSpotsHandler.init();
		Logger.info("Initializing Combat Scripts...");
		CombatScriptsHandler.init();
		Logger.info("Initializing Dialogues...");
		DialogueHandler.init();
		Logger.info("Initializing Controllers...");
		ControlerHandler.init();
		Logger.info("Initializing Cutscenes...");
		CutscenesHandler.init();
		Logger.info("Initializing Instancing...");
		BossInstanceHandler.init();
		Logger.info("Initializing City Events...");
		CityEventHandler.registerCitys();
		Logger.info("Initializing Player Achievements...");
		CompletionistRequirements.init();
		TrimCompletionistRequirements.init();
		Logger.info("Initializing Dungeon Events...");
		DungeonEventHandler.registerDungeons();
	}
	
	private static void initializeManagers() {
		Logger.info("---------------------------------------------------");
		Logger.info("---------------Initializing Managers---------------");
		Logger.info("---------------------------------------------------");
		Logger.info("Initializing Clans...");
		ClansManager.init();
		Logger.info("Initializing FriendsChatManager...");
		FriendChatsManager.init();
		Logger.info("Initializing Grand Exchange...");
		GrandExchange.init();
	}
	
	private static void initializeEntities() {
		Logger.info("--------------------------------------------------");
		Logger.info("----------------Initializing Entities---------------");
		Logger.info("---------------------------------------------------");
		Logger.info("Initializing World Objects...");
		ObjectSpawns.init();
		Logger.info("Initializing NPCs...");
		NPCSpawns.init();
		Logger.info("Initializing Entity Spawning...");
		EntitySpawning.init();
		Logger.info("Initializing NPC Bonuses...");
		NPCBonuses.init();
		Logger.info("Initializing NPCDrops...");
		NPCDrops.init();
		Logger.info("Initializing NPCCombatDefinitions...");
		NPCCombatDefinitionsL.init();
	}
	
	private static void initializeDatabases() {
		Logger.info("---------------------------------------------------");
		Logger.info("---------------Initializing Database---------------");
		Logger.info("---------------------------------------------------");
		Logger.info("Initializing MySQL Service...");
		//new Motivote<Reward>(new RewardHandler(), "http://helwyr.com/vote/", "1e242bc8").start();
	}

	private static void initializeCore() {
		Logger.info("---------------------------------------------------");
		Logger.info("-----------------Initializing Core-----------------");
		Logger.info("---------------------------------------------------");
		Logger.info("Initalizing Game Engine...");
		GameEngine.getEngine().initialize();
		Logger.info("Initializing World...");
		World.init();
		Logger.info("Initializing Encryption...");
		Huffman.init();
		Logger.info("Initializing Regions...");
		RegionBuilder.init();
		Logger.info("Initializing Map Information Parser...");
		MapInformationParser.init();
		try {
			Logger.info("Initializing ServerChannelHandler...");
			ServerChannelHandler.init();
		} catch (Throwable e) {
			Logger.handle(e);
			Logger.log("Launcher", "Failed initing Server Channel Handler. Shutting down...");
			System.exit(1);
			return;
		}
		Runtime.getRuntime().addShutdownHook(ShutDownHook.get());
	}
	
	private static void initializeTasks() {
		Logger.info("---------------------------------------------------");
		Logger.info("----------------Initializing Tasks-----------------");
		Logger.info("---------------------------------------------------");
		addAccountsSavingTask();
		addCleanMemoryTask();
		//addUpdatePlayersOnlineTask();
	}
	
	private static void addUpdatePlayersOnlineTask() {
		if (!Settings.HOSTED)
			return;
		Logger.info("---------------------------------------------------");
		Logger.info("--------------Updating Players Online--------------");
		Logger.info("---------------------------------------------------");
		GameEngine.getEngine().getScheduledExecutor().scheduleWithFixedDelay(new Runnable() {
			@Override
			public void run() {
				try {
					setWebsitePlayersOnline(World.getPlayers().size());
				} catch (Throwable e) {
					Logger.handle(e);
				}
			}
		}, 30, 30, TimeUnit.SECONDS);
	}

	private static void setWebsitePlayersOnline(int amount) throws IOException {
		URL url = new URL("http://helwyr.com/assets/players.php?auth=gJt-49l0!&world=1&players=" + amount);
		url.openStream().close();

	}

	private static void addCleanMemoryTask() {
		Logger.info("---------------------------------------------------");
		Logger.info("------------------Cleaning Memory------------------");
		Logger.info("---------------------------------------------------");
		GameEngine.getEngine().getScheduledExecutor().scheduleWithFixedDelay(new Runnable() {
			@Override
			public void run() {
				try {
					cleanMemory(Runtime.getRuntime().freeMemory() < Settings.MIN_FREE_MEM_ALLOWED);
				} catch (Throwable e) {
					Logger.handle(e);
				}
			}
		}, 0, 10, TimeUnit.MINUTES);
	}

	private static void addAccountsSavingTask() {
		GameEngine.getEngine().getScheduledExecutor().scheduleWithFixedDelay(new Runnable() {
			@Override
			public void run() {
				try {
					saveFiles();
				} catch (Throwable e) {
					Logger.handle(e);
				}

			}
		}, 10, 10, TimeUnit.MINUTES);
	}

	public static void saveFiles() {
		Logger.info("---------------------------------------------------");
		Logger.info("-------------------Saving Files--------------------");
		Logger.info("---------------------------------------------------");
		for (Player player : World.getPlayers()) {
			if (player == null || !player.hasStarted() || player.hasFinished())
				continue;
			SerializableFilesManager.savePlayer(player);
		}
		EmptyClanRemover.initalize();
		DisplayNames.save();
		IPBanL.save();
		PkRank.save();
		DTRank.save();
		LandHandler.saveLand();
		PlayerTaxes.saveTax();
	}

	public static void cleanMemory(boolean force) {
		if (force) {
			ItemDefinitions.clearItemsDefinitions();
			NPCDefinitions.clearNPCDefinitions();
			ObjectDefinitions.clearObjectDefinitions();
		}
		GameEngine.getEngine().getScheduler().purge();
		System.gc();
	}

	public static void shutdown() {
		Logger.info("---------------------------------------------------");
		Logger.info("-------------------Shutting Down-------------------");
		Logger.info("---------------------------------------------------");
		try {
			closeServices();
		} finally {
			System.exit(0);
		}
	}

	public static void closeServices() {
		ServerChannelHandler.shutdown();
		GameEngine.getEngine().shutdown();
		if (Settings.HOSTED) {
			try {
				// setWebsitePlayersOnline(0);
			} catch (Throwable e) {
				Logger.handle(e);
			}
		}
	}

	public static void restart() {
		Logger.info("---------------------------------------------------");
		Logger.info("---------------Restarting Game Server--------------");
		Logger.info("---------------------------------------------------");
		closeServices();
		System.gc();
		try {
			Runtime.getRuntime().exec("cmd /c start restarter.bat");
			System.exit(0);
		} catch (Throwable e) {
			Logger.handle(e);
		}

	}

	private Launcher() {

	}

}
