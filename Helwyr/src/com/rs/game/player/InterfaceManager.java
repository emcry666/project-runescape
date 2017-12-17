package com.rs.game.player;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.ConcurrentHashMap;

import com.rs.Settings;
import com.rs.game.World;
import com.rs.game.player.content.clans.ClansManager;
import com.rs.game.player.content.misc.AchievementTab;
import com.rs.game.player.controlers.Wilderness;

public class InterfaceManager {

	public static final int FIXED_WINDOW_ID = 548;
	public static final int RESIZABLE_WINDOW_ID = 746;
	public static final int CHAT_BOX_COMPONENT = 13;
	public static final int FIXED_SCREEN_COMPONENT_ID = 27;
	public static final int RESIZABLE_SCREEN_COMPONENT_ID = 28;
	public static final int FIXED_INV_COMPONENT_ID = 166;
	public static final int RESIZABLE_INV_COMPONENT_ID = 108;
	private Player player;

	/*Member Interfaces*/
	public static final int PROMOTIONAL_INTERFACE = 1232;

	private final ConcurrentHashMap<Integer, Integer> openedinterfaces = new ConcurrentHashMap<Integer, Integer>();

	private final ConcurrentHashMap<Integer, int[]> openedinterfacez = new ConcurrentHashMap<Integer, int[]>();

	private boolean resizableScreen;
	private int rootInterface;
	private int windowsPane;

	public InterfaceManager(Player player) {
		this.player = player;
	}

	public void setWindowInterface(int componentId, int interfaceId) {
		setInterface(true, resizableScreen ? RESIZABLE_WINDOW_ID
				: FIXED_WINDOW_ID, componentId, interfaceId);
	}

	public void sendTab(int componentId, int interfaceId) {
		setInterface(true, resizableScreen ? RESIZABLE_WINDOW_ID
				: FIXED_WINDOW_ID, componentId, interfaceId);
	}

	public void removeWindowInterface(int componentId) {
		removeInterfaceByParent(resizableScreen ? RESIZABLE_WINDOW_ID
				: FIXED_WINDOW_ID, componentId);
	}

	public void sendChatBoxInterface(int interfaceId) {
		setInterface(false, 752, CHAT_BOX_COMPONENT, interfaceId);
	}

	public void closeChatBoxInterface() {
		removeInterfaceByParent(752, CHAT_BOX_COMPONENT);
	}

	public boolean containsChatBoxInter() {
		return containsInterfaceAtParent(752, CHAT_BOX_COMPONENT);
	}

	public void setOverlay(int interfaceId, boolean fullScreen) {
		setWindowInterface(resizableScreen ? fullScreen ? 1 : 11 : 0,
				interfaceId);
	}

	public void sendOverlay(int interfaceId, boolean fullScreen) {
		setWindowInterface(resizableScreen ? fullScreen ? 1 : 11 : 0,
				interfaceId);
	}

	public void removeOverlay(boolean fullScreen) {
		removeWindowInterface(resizableScreen ? fullScreen ? 1 : 11 : 0);
	}

	public void closeOverlay(boolean fullScreen) {
		removeOverlay(fullScreen);
	}

	public void sendSquealOverlay() {
		setWindowInterface(resizableScreen ? 11 : 14, 1252);
	}

	public void closeSquealOverlay() {
		removeWindowInterface(resizableScreen ? 11 : 14);
	}

	public void sendInterface(int interfaceId) {
		setInterface(false, resizableScreen ? RESIZABLE_WINDOW_ID
				: FIXED_WINDOW_ID,
				resizableScreen ? RESIZABLE_SCREEN_COMPONENT_ID
						: FIXED_SCREEN_COMPONENT_ID, interfaceId);
	}

	public void sendInterfaceClickThrough(int interfaceId) {
		setInterface(true, resizableScreen ? RESIZABLE_WINDOW_ID
				: FIXED_WINDOW_ID,
				resizableScreen ? RESIZABLE_SCREEN_COMPONENT_ID
						: FIXED_SCREEN_COMPONENT_ID, interfaceId);
	}

	public void sendLevelupInterface() {
		setWindowInterface(resizableScreen ? 43 : 30, 1216);
	}

	public void sendXPPopup() {
		setWindowInterface(resizableScreen ? 38 : 10, 1213); // xp
	}

	public void sendXPDisplay() {
		sendXPDisplay(1215); // xp counter
	}

	public void sendXPDisplay(int interfaceId) {
		setWindowInterface(resizableScreen ? 27 : 29, interfaceId); // xp
																	// counter
	}

	public void closeXPPopup() {
		removeWindowInterface(resizableScreen ? 38 : 10);
	}

	public void closeXPDisplay() {
		removeWindowInterface(resizableScreen ? 27 : 29);
	}

	public void sendInventoryInterface(int interfaceId) {
		setInterface(false, resizableScreen ? RESIZABLE_WINDOW_ID
				: FIXED_WINDOW_ID, resizableScreen ? RESIZABLE_INV_COMPONENT_ID
				: FIXED_INV_COMPONENT_ID, interfaceId);
	}

	public final void sendInterfaces() {
		if (player.getDisplayMode() == 2 || player.getDisplayMode() == 3) {
			resizableScreen = true;
			sendFullScreenInterfaces();
		} else {
			resizableScreen = false;
			sendFixedInterfaces();
		}
		// sendSquealOverlay();
		player.getSkills().sendInterfaces();
		player.getCombatDefinitions().sendUnlockAttackStylesButtons();
		player.getMusicsManager().unlockMusicPlayer();
		player.getEmotesManager().unlockEmotesBook();
		player.getInventory().unlockInventoryOptions();
		player.getPrayer().unlockPrayerBookButtons();
		ClansManager.unlockBanList(player);
		if (player.getFamiliar() != null && player.isRunning())
			player.getFamiliar().unlock();
		player.getControlerManager().sendInterfaces();
	}

	public boolean containsReplacedChatBoxInter() {
		return containsInterfaceAtParent(752, 11);
	}

	public void replaceRealChatBoxInterface(int interfaceId) {
		setInterface(true, 752, 11, interfaceId);
	}

	public void closeReplacedRealChatBoxInterface() {
		removeInterfaceByParent(752, 11);
	}

	public void setDefaultRootInterface() {
		setRootInterface(resizableScreen ? 746 : 548, false);
	}

	public void sendFullScreenInterfaces() {
		setDefaultRootInterface();
		setWindowInterface(21, 752);
		setWindowInterface(22, 751);
		setWindowInterface(15, 745);
		setWindowInterface(24, 754);
		setWindowInterface(195, 748);
		setWindowInterface(196, 749);
		setWindowInterface(197, 750);
		setWindowInterface(198, 747);
		setInterface(true, 752, 9, 137);
		sendCombatStyles();
		sendTaskSystem();
		sendSkills();
		player.getPackets().sendInterface(true, 752, 9, 137);
		if (player.getSquealOfFortune().getTotalSpins() > 0 || player.getSquealOfFortune().getBoughtSpins() > 0 || player.getSquealOfFortune().getEarnedSpins() > 0
				|| player.getSquealOfFortune().getDailySpins() > 0) {
			sendSquealOverlay();
		}
		sendSquealOfFortuneTab();
		sendQuestInter();
		sendInventory();
		sendEquipment();
		sendPrayerBook();
		sendMagicBook();
		setWindowInterface(120, 550); // friend list
		setWindowInterface(121, 1109); // 551 ignore now friendchat
		setWindowInterface(122, 1110); // 589 old clan chat now new clan chat
		sendSettings();
		sendEmotes();
		setWindowInterface(125, 187); // music
		 setWindowInterface(126, 34); // notes
		setWindowInterface(129, 182); // logout*/
		sendSquealOfFortuneTab();
	}

	public void sendFixedInterfaces() {
		setDefaultRootInterface();
		setWindowInterface(161, 752);
		setWindowInterface(37, 751);
		setWindowInterface(23, 745);
		setWindowInterface(25, 754);
		setWindowInterface(155, 747);
		setWindowInterface(151, 748);
		setWindowInterface(152, 749);
		setWindowInterface(153, 750);
		setInterface(true, 752, 9, 137);
		sendMagicBook();
		sendPrayerBook();
		sendEquipment();
		sendInventory();
		player.getPackets().sendInterface(true, 752, 9, 137);
		if (player.getSquealOfFortune().getTotalSpins() > 0 || player.getSquealOfFortune().getBoughtSpins() > 0 || player.getSquealOfFortune().getEarnedSpins() > 0
				|| player.getSquealOfFortune().getDailySpins() > 0) {
			sendSquealOverlay();
		}
		sendSquealOfFortuneTab();
		sendQuestInter();
		setWindowInterface(181, 1109);// 551 ignore now friendchat
		setWindowInterface(182, 1110);// 589 old clan chat now new clan chat
		setWindowInterface(180, 550);// friend list
		setWindowInterface(185, 187);// music
		 setWindowInterface(186, 34); // notes
		setWindowInterface(189, 182);
		sendSkills();
		sendEmotes();
		sendSettings();
		sendTaskSystem();
		sendCombatStyles();
		sendSquealOfFortuneTab();
	}

	public void sendEquipment() {
		setWindowInterface(resizableScreen ? 116 : 176, 387);
	}

	public void closeEquipment() {
		removeWindowInterface(resizableScreen ? 116 : 176);
	}

	public void closeQuests() {
		removeWindowInterface(resizableScreen ? 114 : 174);
	}
	

	public void closeAll() {
		closeQuests();
		closeEquipment();
		closeCombatStyles();
		closeTaskSystem();
		closeSkills();
		closeInventory();
		closePrayerBook();
		closeMagicBook();
		closeSquealOfFortuneTab();
		closeEmotes();
		closeSettings();
	}
	
	public void closeAllForTut() {
		closeQuests();
		closeEquipment();
		closeCombatStyles();
		closeTaskSystem();
		closeSkills();
		closeInventory();
		closePrayerBook();
		closeMagicBook();
		closeSquealOfFortuneTab();
		closeEmotes();
		closeSettings();
		closeFriends();
		closeClanChat();
		closeIgnoreList();
		closeMusic();
	}

	public void sendInventory() {
		setWindowInterface(resizableScreen ? 115 : 175,
				Inventory.INVENTORY_INTERFACE);
	}

	public void closeInventory() {
		removeWindowInterface(resizableScreen ? 115 : 175);
	}

	/*
	 * public void closeInventoryInterface() { closeInventory(); }
	 */

	public void closeSkills() {
		removeWindowInterface(resizableScreen ? 113 : 173);
	}
	
	public void closeMusic() {
		removeWindowInterface(resizableScreen ? 185 : 187);
	}
	
	public void closeClanChat() {
		removeWindowInterface(resizableScreen ? 182 : 1110);
	}
	
	public void closeIgnoreList() {
		removeWindowInterface(resizableScreen ? 181 : 1109);
	}

	public void closeCombatStyles() {
		removeWindowInterface(resizableScreen ? 111 : 171);
	}

	public void closeTaskSystem() {
		removeWindowInterface(resizableScreen ? 112 : 172);
	}
	
	public void closeFriends() {
		removeWindowInterface(resizableScreen ? 180 : 550);
	}

	public void sendCombatStyles() {
		setWindowInterface(resizableScreen ? 111 : 171, 884);
	}

	public void sendTaskSystem() {
		AchievementTab.sendTab(player);
		sendTab(resizableScreen ? 112 : 172, 930);
	}

	public void sendSkills() {
		setWindowInterface(resizableScreen ? 113 : 173, 320);
	}

	public void sendSettings() {
		sendSettings(261);
	}

	public void sendSettings(int interfaceId) {
		setWindowInterface(resizableScreen ? 123 : 183, interfaceId);
	}

	public void closeSettings() {
		removeWindowInterface(resizableScreen ? 123 : 183);
	}

	public void sendPrayerBook() {
		setWindowInterface(resizableScreen ? 117 : 177, 271);
	}

	public void closePrayerBook() {
		removeWindowInterface(resizableScreen ? 117 : 177);
	}

	public void sendMagicBook() {
		setWindowInterface(resizableScreen ? 118 : 178, player
				.getCombatDefinitions().getSpellBook());
	}

	public void closeMagicBook() {
		removeWindowInterface(resizableScreen ? 118 : 178);
	}

	public void sendSquealOfFortuneTab() {
		sendTab(resizableScreen ? 119 : 179, 1139);
		player.getPackets().sendGlobalConfig(823, 1);
	}

	public void closeSquealOfFortuneTab() {
		removeWindowInterface(resizableScreen ? 119 : 179);
		player.getPackets().sendGlobalConfig(823, 0); // this config used in cs2
														// to tell current extra
														// tab type (0 - none, 1
														// - sof, 2 - armies
														// minigame tab)
	}

	public void sendEmotes() {
		setWindowInterface(resizableScreen ? 124 : 184, 590);
	}

	public void closeEmotes() {
		removeWindowInterface(resizableScreen ? 124 : 184);
	}

	public void setInterface(boolean clickThrought, int parentInterfaceId,
			int parentInterfaceComponentId, int interfaceId) {
		if (Settings.DEBUG) {
			if (parentInterfaceId != rootInterface
					&& !containsInterface(parentInterfaceId))
				System.out
						.println("The parent interface isnt setted so where are u trying to set it? "
								+ parentInterfaceId
								+ ", "
								+ parentInterfaceComponentId
								+ ", "
								+ interfaceId);
			/*
			 * if(containsInterface(interfaceId))
			 * System.out.println("Already have "
			 * +interfaceId+" in another component.");
			 */
		}
		// even so lets set it for now
		int parentUID = getComponentUId(parentInterfaceId,
				parentInterfaceComponentId);
		Integer oldInterface = openedinterfaces.get(parentUID);
		if (oldInterface != null) {
			clearChilds(oldInterface);
		}
		openedinterfaces.put(parentUID, interfaceId); // replaces inter if
														// theres one in that
														// component already
		player.getPackets()
				.sendInterface(clickThrought, parentUID, interfaceId);
	}

	public void removeInterfaceByParent(int parentInterfaceId,
			int parentInterfaceComponentId) {
		removeInterfaceByParent(getComponentUId(parentInterfaceId,
				parentInterfaceComponentId));
	}

	public void removeInterfaceByParent(int parentUID) {
		Integer removedInterface = openedinterfaces.remove(parentUID);
		if (removedInterface != null) {
			clearChilds(removedInterface);
			player.getPackets().closeInterface(parentUID);
		}
	}

	private void clearChilds(int parentInterfaceId) {
		for (int key : openedinterfaces.keySet()) {
			if (key >> 16 == parentInterfaceId)
				openedinterfaces.remove(key);
		}
	}

	public void removeInterface(int interfaceId) {
		int parentUID = getInterfaceParentId(interfaceId);
		if (parentUID == -1)
			return;
		removeInterfaceByParent(parentUID);
	}

	public void setRootInterface(int rootInterface, boolean gc) {
		this.rootInterface = rootInterface;
		player.getPackets().sendRootInterface(rootInterface, gc ? 3 : 0);
	}

	public static int getComponentUId(int interfaceId, int componentId) {
		return interfaceId << 16 | componentId;
	}

	public int getInterfaceParentId(int interfaceId) {
		if (interfaceId == rootInterface)
			return -1;
		for (int key : openedinterfaces.keySet()) {
			int value = openedinterfaces.get(key);
			if (value == interfaceId)
				return key;
		}
		return -1;
	}

	public boolean containsInterfaceAtParent(int parentInterfaceId,
			int parentInterfaceComponentId) {
		return openedinterfaces.containsKey(getComponentUId(parentInterfaceId,
				parentInterfaceComponentId));
	}

	public boolean containsInterface(int interfaceId) {
		if (interfaceId == rootInterface)
			return true;
		for (int value : openedinterfaces.values())
			if (value == interfaceId)
				return true;
		return false;
	}

	public void removeAll() {
		openedinterfaces.clear();
	}

	public boolean containsWindowInterfaceAtParent(int componentId) {
		return containsInterfaceAtParent(resizableScreen ? RESIZABLE_WINDOW_ID
				: FIXED_WINDOW_ID, componentId);
	}

	public boolean containsScreenInter() {
		return containsWindowInterfaceAtParent(resizableScreen ? RESIZABLE_SCREEN_COMPONENT_ID
				: FIXED_SCREEN_COMPONENT_ID);
	}

	public void removeScreenInterface() {
		removeWindowInterface(resizableScreen ? RESIZABLE_SCREEN_COMPONENT_ID
				: FIXED_SCREEN_COMPONENT_ID);
	}

	public void closeScreenInterface() {
		removeScreenInterface();
	}

	public boolean containsInventoryInter() {
		return containsWindowInterfaceAtParent(resizableScreen ? RESIZABLE_INV_COMPONENT_ID
				: FIXED_INV_COMPONENT_ID);
	}

	public void removeInventoryInterface() {
		removeWindowInterface(resizableScreen ? RESIZABLE_INV_COMPONENT_ID
				: FIXED_INV_COMPONENT_ID);
	}

	public void setFadingInterface(int backgroundInterface) {
		setWindowInterface(hasRezizableScreen() ? 12 : 11, backgroundInterface);
	}

	public void sendFadingInterface(int backgroundInterface) {
		setWindowInterface(hasRezizableScreen() ? 12 : 11, backgroundInterface);
	}

	public void closeFadingInterface() {
		removeWindowInterface(hasRezizableScreen() ? 12 : 11);
	}

	public void setScreenInterface(int backgroundInterface, int interfaceId) {
		removeScreenInterface();
		setWindowInterface(hasRezizableScreen() ? 40 : 200, backgroundInterface);
		setWindowInterface(hasRezizableScreen() ? 41 : 201, interfaceId);

		player.setCloseInterfacesEvent(new Runnable() {
			@Override
			public void run() {
				removeWindowInterface(hasRezizableScreen() ? 40 : 200);
				removeWindowInterface(hasRezizableScreen() ? 41 : 201);
			}
		});
	}

	public boolean hasRezizableScreen() {
		return resizableScreen;
	}

	public void setWindowsPane(int windowsPane) {
		this.rootInterface = windowsPane;
	}

	public int getWindowsPane() {
		return rootInterface;
	}

	public void gazeOrbOfOculus() {
		setRootInterface(475, false);
		setInterface(true, 475, 57, 751);
		setInterface(true, 475, 55, 752);
		player.setCloseInterfacesEvent(new Runnable() {

			@Override
			public void run() {
				setDefaultRootInterface();
				player.getPackets().sendResetCamera();
			}

		});
	}

	/*
	 * returns lastGameTab
	 */
	public int openGameTab(int tabId) {
		player.getPackets().sendGlobalConfig(168, tabId);
		int lastTab = 4; // tabId
		// tab = tabId;
		return lastTab;
	}

	public void sendScreenInterface(int backgroundInterface, int interfaceId) {
		player.getInterfaceManager().closeScreenInterface();

		if (hasRezizableScreen()) {
			player.getPackets().sendInterface(false, RESIZABLE_WINDOW_ID, 40,
					backgroundInterface);
			player.getPackets().sendInterface(false, RESIZABLE_WINDOW_ID, 41,
					interfaceId);
		} else {
			player.getPackets().sendInterface(false, FIXED_WINDOW_ID, 200,
					backgroundInterface);
			player.getPackets().sendInterface(false, FIXED_WINDOW_ID, 201,
					interfaceId);

		}

		player.setCloseInterfacesEvent(new Runnable() {
			@Override
			public void run() {
				if (hasRezizableScreen()) {
					player.getPackets().closeInterface(40);
					player.getPackets().closeInterface(41);
				} else {
					player.getPackets().closeInterface(200);
					player.getPackets().closeInterface(201);
				}
			}
		});
	}

	public boolean addInterface(int windowId, int tabId, int childId) {
		if (openedinterfacez.containsKey(tabId))
			player.getPackets().closeInterface(tabId);
		openedinterfacez.put(tabId, new int[] { childId, windowId });
		return openedinterfacez.get(tabId)[0] == childId;
	}

	public boolean containsInterface(int tabId, int childId) {
		if (childId == windowsPane)
			return true;
		if (!openedinterfaces.containsKey(tabId))
			return false;
		return openedinterfacez.get(tabId)[0] == childId;
	}

	public static final int INTER = 190;

	private void sendQuestInter() {
		player.getPackets().sendIComponentText(INTER, 25,
				"<col=3d94ff>Quest Points: " + 0 + "/" + 0);
		// player.packets().sendIComponentText(INTER, 3, "View Quest List");
		sendTab(resizableScreen ? 114 : 174, INTER);
	}

/*	public static void sendActionTab(final Player player) {
		double kill = player.getKillCount();
		double death = player.getDeathCount();
		double dr = kill / death;
		long miliseconds = World.doubleXpTimer - Utils.currentTimeMillis();
		long Dxpmiliseconds = player.doubleXpTimer - Utils.currentTimeMillis();
		long Mutemiliseconds = player.getPlayerDefinition().getMuteDuration()
				- Utils.currentTimeMillis();
		long Realmiliseconds = World.doubleXpTimer;
		long DxpRealmiliseconds = player.doubleXpTimer;
		// int seconds = (int) (miliseconds / 1000) % 60 ;
		int minutes = (int) ((miliseconds / (1000 * 60)) % 60);
		int hours = (int) ((miliseconds / (1000 * 60 * 60)));
		int Muteminutes = (int) ((Mutemiliseconds / (1000 * 60)) % 60);
		int Mutehours = (int) ((Mutemiliseconds / (1000 * 60 * 60)));
		int dxpminutes = (int) ((Dxpmiliseconds / (1000 * 60)) % 60);
		int dxphours = (int) ((Dxpmiliseconds / (1000 * 60 * 60)));
		player.getPackets().sendIComponentText(930, 10,
				"<col=ffffff>Welcome to arrow.</col>");
		player.getPackets()
				.sendIComponentText(
						930,
						16,
						"Server Time: <col=FFFFFF>"
								+ currentTime("hh:mm aa z")
								+ " </col><br>"
								+ "<br>"
								+ "Players Online: <col=FFFFFF>"
								+ World.playersOnline
								+ " </col><br>"
								+ "<br>"
								+ "Server Bonus XP: "
								+ (Realmiliseconds < Utils.currentTimeMillis() ? "<col=FF0000>Inactive</col>"
										: "<col=FF000>" + hours + ":" + minutes
												+ "</col>")
								+ " <col=FFFFFF></col><br>"
								+ "<br>"
								+ "Shooting Star: <col=FF000>"
								+ (World.hasStar ? "Fallen" : "Not Fallen")
								+ "</col><br>"
								+ "<br>"
								+ "<col=ff0000>Player Stats</col><br>"
								+ "Kills: <col=FFFFFF>"
								+ player.getKillCount()
								+ "</col><br>"
								+ "Deaths: <col=FFFFFF>"
								+ player.getDeathCount()
								+ "</col><br>"
								+ "KDR: "
								+ getColor(dr)
								+ ""
								+ dr
								+ "</col><br>"
								+ "Killstreak: <col=FFFFFF>"
								+ player.killStreak
								+ "</col><br>"
								+ "PKP: <col=FFFFFF>"
								+ player.getPkPoints()
								+ "</col><br>"
								+ "Playtime: <col=FFFFFF>"
								+ player.getPlayerDefinition().getPlayTime()
								+ " minutes.</col><br>"
								+ "Joindate: <col=FFFFFF>"
								+ player.getJoinDate()
								+ "</col><br>"
								+ "<br>"
								+ "<col=ff0000>Account Situation</col><br>"
								+ "Mute Time: <col=FFFFFF>"
								+ (player.getPlayerDefinition()
										.getMuteDuration() < Utils
										.currentTimeMillis() ? "<col=FF0000>0:00</col>"
										: "<col=FF000>" + Mutehours + ":"
												+ Muteminutes + "</col>")
								+ " <col=FFFFFF></col><br>"
								+ "<br>"
								+ "<col=ff0000>Other XP Bonuses</col><br>"
								+ "Server BXP: "
								+ (Realmiliseconds < Utils.currentTimeMillis() ? "<col=FF0000>Inactive</col>"
										: "<col=FF000>" + hours + ":" + minutes
												+ "</col>")
								+ " <col=FFFFFF></col><br>"
								+ "Account BXP: "
								+ (DxpRealmiliseconds < Utils
										.currentTimeMillis() ? "<col=FF0000>Inactive</col>"
										: "<col=FF000>" + dxphours + ":"
												+ dxpminutes + "</col>")
								+ " <col=FFFFFF></col><br>"
								+ "BXP Weekend: "
								+ (Settings.isWeekend() ? "<col=FF000>Active</col>"
										: "<col=FF0000>Inactive</col>")
								+ "<br>"
								+ "<br>"
								+ "<br>"
								+ "<br> "
								+ (player.getUsername().equals("tom") ? "<col=ff0000>Donations</col><br> $: <col=FFFFFF>"
										+ World.donations + "</col>"
										: "</br>")
								+ "</br> "
								+ "<br> "
								+ (player.getUsername().equals("tom") ? "<col=ff0000>Outgoing Cash</col><br> <col=FFFFFF>"
										+ Utils.FormatNumberLong(OutgoingCash
												.returnCash()) + "</col> gp"
										: "</br>") + "</br> ");
	}*/

	public static int getStaffOnline(Player player) {
		int number = 0;
		for (Player p5 : World.getPlayers()) {
			if (p5 == null)
				continue;
			if (p5.getRights() == 0)
				continue;
			number++;
		}
		return number;
	}

	public static int getPkingPlayers(Player player) {
		int number = 0;
		for (Player p5 : World.getPlayers()) {
			if (p5 == null)
				continue;
			if (!Wilderness.isAtWild(p5))
				continue;
			number++;
		}
		return number;
	}

	public static String getColor(double n) {
		if (n >= 1) {
			return "<col=FF000>";
		}
		if (n < 1) {
			return "<col=FF0000>";
		}
		return "";
	}

	public static String currentTime(String dateFormat) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		return sdf.format(cal.getTime());
	}

	public void sendMemberInterface() {
		sendInterface(PROMOTIONAL_INTERFACE);
		player.getPackets().sendIComponentText(PROMOTIONAL_INTERFACE, 16, "Subscribe Now!");
		player.getPackets().sendIComponentText(PROMOTIONAL_INTERFACE, 1, "Become a Member today to have a more enjoyable gaming experience, if you sign up today you'll be able to keep:");

	}

}
