package com.rs.game.player;

import java.util.concurrent.ConcurrentHashMap;

import com.rs.Settings;
import com.rs.game.player.CosmeticsManager.CosmeticType;
import com.rs.game.player.content.clans.ClansManager;
import com.rs.utils.Logger;
import com.rs.utils.Utils;

public class InterfaceManager {

	public static final int FIXED_WINDOW_ID = 1477;
	public static final int RESIZABLE_WINDOW_ID = 1477;
	public static final int BANK_COMPONENT_ID = 488;// 876
	public static final int CENTRAL_INTERFACE_COMPONENT_ID = 521;// 876
	public static final int INVENTORY_INTERFACE_COMPONENT_ID = 120;// 876
	public static final int EDIT_MODE_COMPONENT_ID = 535;// 876
	public static final int DIALOGUE_COMPONENT_ID = 533;// 876
	public static final int INPUT_TEXT_COMPONENT_ID = 532;// 876
	public static final int FADING_COMPONENT_ID = 33;// 876
	public static final int SCREEN_BACKGROUND_COMPONENT_ID = 8;
	public static final int SCREEN_BACKGROUND_INTER_COMPONENT_ID = 410;
	public static final int GAME_SCREEN_COMPONENT_ID = 20;// 876
	public static final int WORLD_MAP_COMPONENT_ID = 26;// 876
	public static final int LEVEL_UP_COMPONENT_ID = 577;// 876
	public static final int CONFIRM_DIALOGUE_COMPONENT_ID = 882;// 876
	public static final int MINIGAME_HUD_COMPONENT_ID = 448; // overlay// 876
	public static final int PLAYER_EXAMINE_COMPONENT_ID = 495;// 876
	public static final int SKILL_PROGRESS_COMPONENT_ID = 440;// TODO not used

	public static final int TIMER_COMPONENT_ID = 462;// 876
	public static final int MINIGAME_TAB_COMPONENT_ID = 209; // tab// 876

	public static final int EXPAND_BUTTONS_COMPONENT_ID = 571;// 876

	/*
	 * 0 - skill inter 1 - active task 2 - inventory 3 - equipment 4 - prayer book 5 - abilities 9 - emotes 14 -
	 * friend list 15 - friend chat info 16 - clan 18 - chat 19 - friend chat
	 */
	public static final int SKILLS_TAB = 0, ACTIVE_TASK_TAB = 1, INVENTORY_TAB = 2, EQUIPMENT_TAB = 3, PRAYER_BOOK_TAB = 4, MAGIC_ABILITIES_TAB = 5, MELEE_ABILITIES_TAB = 6, RANGE_ABILITIES_TAB = 7, DEFENCE_ABILITIES_TAB = 8, EMOTES_TAB = 9, NOTES_TAB = 11, SUMMONING_TAB = 12, MINIGAME_TAB = 17, ALL_CHAT_TAB = 18;

	private static final int[] MENU_SLOT_COMPONENTS_ = { 3, 5, 7, 9, 11 };

	private static final int[] MENU_SUBMENU_VARS = { 18995, 18996, 18997, 18998, 18999, 19000, 19002, 19003, 19004, 19001 };

	private Player player;

	private final ConcurrentHashMap<Integer, Integer> openedinterfaces = new ConcurrentHashMap<Integer, Integer>();

	private boolean resizableScreen;
	private int rootInterface;
	private int currentMenu;

	public InterfaceManager(Player player) {
		this.player = player;
		currentMenu = -1;
	}

	public void sendWorldMapInterface(int id) {
		setWindowInterface(WORLD_MAP_COMPONENT_ID, id);
	}

	public void sendGameMapInterface(int id) {
		setWindowInterface(GAME_SCREEN_COMPONENT_ID, id);
	}

	public boolean containsGameMapInterface() {
		return containsWindowInterfaceAtParent(GAME_SCREEN_COMPONENT_ID);
	}

	public void sendExpandOptionsInterface(int id) {
		setWindowInterface(EXPAND_BUTTONS_COMPONENT_ID, id);
	}

	public void sendExpandOptionsInterface(int id, int interfaceId, int componentId, int width, int height) {
		setWindowInterface(EXPAND_BUTTONS_COMPONENT_ID, id);
		// width height parentuid borderx, bordery(always -1, 2) x y(always -24,
		// -6).
		player.getPackets().sendExecuteScript(8787, width, height, InterfaceManager.getComponentUId(interfaceId, componentId), -1, 2, -24, -6);
	}

	public void sendTimerInterface() {
		setWindowInterface(TIMER_COMPONENT_ID, 1508);
	}

	public void removeTimerInterface() {
		removeWindowInterface(TIMER_COMPONENT_ID);
	}

	public void sendGameMapInterface() {
		sendGameMapInterface(1482);
	}

	public boolean containsWorldMapInterface() {
		return containsWindowInterfaceAtParent(WORLD_MAP_COMPONENT_ID);
	}

	public void removeWorldMapInterface() {
		removeWindowInterface(WORLD_MAP_COMPONENT_ID);
		sendGameMapInterface();
		refreshInterface(true);
	}

	public void setWindowInterface(int componentId, int interfaceId) {
		setWindowInterface(true, componentId, interfaceId);
	}

	public void setWindowInterface(boolean walkable, int componentId, int interfaceId) {
		setInterface(walkable, resizableScreen ? RESIZABLE_WINDOW_ID : FIXED_WINDOW_ID, componentId, interfaceId);
	}

	public void removeWindowInterface(int componentId) {
		removeInterfaceByParent(FIXED_WINDOW_ID, componentId);
	}

	public void sendDialogueInterface(int interfaceId) {
		setInterface(false, 1477, DIALOGUE_COMPONENT_ID, interfaceId);
		refreshInterface(false);
	}

	public void removeDialogueInterface() {
		removeWindowInterface(DIALOGUE_COMPONENT_ID);
		refreshInterface(true);
	}

	public boolean containsDialogueInterface() {
		return containsInterfaceAtParent(FIXED_WINDOW_ID, DIALOGUE_COMPONENT_ID);
	}

	public void sendMinigameInterface(int interfaceId) {
		setWindowInterface(MINIGAME_HUD_COMPONENT_ID, interfaceId);
	}

	public void removeMinigameInterface() {
		removeWindowInterface(MINIGAME_HUD_COMPONENT_ID);
	}

	public void sendTreasureHunter() {
		setWindowInterface(368, 1252);
	}

	public void sendInputTextInterface() {
		sendInputTextInterface(1469);
	}

	public void sendInputTextInterface(int interfaceId) {
		setWindowInterface(INPUT_TEXT_COMPONENT_ID, 1418);
		setInterface(true, 1418, 1, interfaceId);
		refreshInterface(false);
	}

	public boolean containsInputTextInterface() {
		return containsWindowInterfaceAtParent(INPUT_TEXT_COMPONENT_ID);
	}

	public void removeInputTextInterface() {
		removeWindowInterface(INPUT_TEXT_COMPONENT_ID);
		refreshInterface(true);
	}

	public void closeTreasureHunter() {
		removeWindowInterface(MINIGAME_HUD_COMPONENT_ID);
		player.getPackets().sendGameMessage("You can access the Treasure Hunter from the side panel, and you can show the button again by logging out and back in.", true);
	}

	public void sendCentralInterface(int interfaceId) {
		setInterface(false, resizableScreen ? RESIZABLE_WINDOW_ID : FIXED_WINDOW_ID, CENTRAL_INTERFACE_COMPONENT_ID, interfaceId);
		refreshInterface(false);
	}

	public boolean containsScreenInterface() {
		return containsWindowInterfaceAtParent(CENTRAL_INTERFACE_COMPONENT_ID);
	}

	public void removeCentralInterface() {
		removeWindowInterface(CENTRAL_INTERFACE_COMPONENT_ID);
		refreshInterface(true);
	}

	public void refreshInterface(boolean closing) {
		if (!player.getCutscenesManager().hasCutscene())
			player.getPackets().sendExecuteScript(closing ? 8779 : 8697);
	}

	public boolean containsBankInterface() {
		return containsWindowInterfaceAtParent(BANK_COMPONENT_ID);
	}

	public boolean containsTreasureHunterInterface() {
		if (player.getInterfaceManager().containsInterface(1253))
			return true;
		return false;
	}

	public void removeBankInterface() {
		removeWindowInterface(BANK_COMPONENT_ID);
		sendLockGameTab(InterfaceManager.INVENTORY_TAB, false); // unlocks
		// inventory
		sendLockGameTab(InterfaceManager.EQUIPMENT_TAB, false); // unlocks
		// equipment
	}

	public void sendBankInterface(int interfaceId) {
		setInterface(false, resizableScreen ? RESIZABLE_WINDOW_ID : FIXED_WINDOW_ID, BANK_COMPONENT_ID, interfaceId);
		sendLockGameTab(InterfaceManager.INVENTORY_TAB, true); // locks
		// inventory
		sendLockGameTab(InterfaceManager.BANK_COMPONENT_ID, true); // locks
		// equipment
		refreshInterface(false);
	}

	public void sendInventoryInterface(int interfaceId) {

		setInterface(false, FIXED_WINDOW_ID, INVENTORY_INTERFACE_COMPONENT_ID, interfaceId);
		sendLockGameTab(InterfaceManager.INVENTORY_TAB, true); // locks
		// inventory
		refreshInterface(false);
	}

	public void removeInventoryInterface() {
		removeWindowInterface(INVENTORY_INTERFACE_COMPONENT_ID);
		sendLockGameTab(InterfaceManager.INVENTORY_TAB, false); // unlocks
		// inventory
		refreshInterface(true);
	}

	/*
	 * rs calls it so
	 */
	public void setFamiliarInterface(int interfaceId) {
		setWindowInterface(143, interfaceId);
		player.getInterfaceManager().sendLockGameTab(InterfaceManager.SUMMONING_TAB, false);
	}

	public void removeFamiliarInterface() {
		removeWindowInterface(143);
		player.getInterfaceManager().sendLockGameTab(InterfaceManager.SUMMONING_TAB, true);
	}

	public final void sendInterfaces() {
		if (player.isLobby()) {
			// if (player.getLoginCount() == 0) {
			// PlayerLook.openCharacterCustomizing(player);
			// } else
			sendLobbyInterfaces();
		} else {
			sendNISScreenInterfaces();
			lockDefaultTabs();
			unlockCustomizationSwitchButton();
			unlockMenu();
			unlockOptionMenu();
			unlockLogout();
			unlockScreen();
			openGameTab(2);
			player.getCombatDefinitions().sendAbilityVars();
			player.getActionbar().unlockActionBar(false);
			player.getCombatDefinitions().unlockSheatheButton();
			player.getEmotesManager().unlockEmotesBook();
			player.getPrayer().unlockPrayerBookButtons();
			player.getMusicsManager().unlockMusicPlayer(false);
			player.getNotes().unlockNotes(false);
			player.getSkills().unlockSkills(false);
			player.getInventory().unlockInventory(false);
			player.getEquipment().unlockEquipment(false);
			player.getFriendsIgnores().unlockFriendsIgnore(false);
			ClansManager.unlockClanBanList(player, false);

			// send familiar details if has familiar
			if (player.getFamiliar() != null && player.isRunning())
				player.getFamiliar().sendFollowerDetails();

			player.getTimersManager().sendInterfaces();
			player.getControlerManager().sendInterfaces();
		}
	}

	/*
	 * those are locked by default. ^^. until inter added
	 */
	private void lockDefaultTabs() {
		player.getInterfaceManager().sendLockGameTab(InterfaceManager.SUMMONING_TAB, true);
		player.getInterfaceManager().sendLockGameTab(InterfaceManager.MINIGAME_TAB, true);
	}

	// new way of doing menus
	public void unlockOptionMenu() {
		player.getPackets().sendIComponentSettings(1477, 507, 0, 24, 2);
	}

	public void sendLobbyInterfaces() {
		setRootInterface(906, false);
		setInterface(true, 906, 112, 907);
		setInterface(true, 906, 113, 910);
		setInterface(true, 906, 114, 909);
		setInterface(true, 906, 116, 912);
		setInterface(true, 906, 115, 589);
		setInterface(true, 906, 117, 911);
		setInterface(true, 906, 285, 914);
		setInterface(true, 906, 303, 915);
		setInterface(true, 906, 312, 913);
		// setInterface(true, 907, 31, 908);
	}

	public void unlockScreen() {
		player.getPackets().sendIComponentSettings(1477, 18, -1, -1, 2097152); // todo
	}

	public void unlockMenu() {
		player.getPackets().sendUnlockIComponentOptionSlots(1477, 510, 1, 1, 2); // unlocks
		// menu
		// switching
		player.getPackets().sendUnlockIComponentOptionSlots(1477, 528, 1, 1, 2); // unlocks
		// close
		// menu
		// button
	}

	public void unlockLogout() {
		player.getPackets().sendUnlockIComponentOptionSlots(1477, 76, 0, 1, 0);
	}

	public void unlockCustomizationSwitchButton() {
		player.getPackets().sendIComponentSettings(1477, 30, 1, 1, 2);
	}

	public void setDefaultRootInterface() {
		setRootInterface(FIXED_WINDOW_ID, false);
	}

	public void sendMagicAbilities() {
		sendMagicAbilities(1461);
		player.getCombatDefinitions().unlockMagicAbilities();
	}

	public void sendMagicAbilities(int interfaceId) {
		setWindowInterface(221, interfaceId); // mage spellbook
	}

	public void sendMeleeAbilities() {
		boolean legacyMode = player.getCombatDefinitions().getCombatMode() == CombatDefinitions.LEGACY_COMBAT_MODE;
		setWindowInterface(199, legacyMode ? 1503 : 1460);
		if (!legacyMode)
			player.getCombatDefinitions().unlockMeleeAbilities();
	}

	public void sendRangedAbilities() {
		setWindowInterface(210, 1452); // range abilities
		player.getCombatDefinitions().unlockRangeAbilities();
	}

	public void sendDefenceAbilities() {
		setWindowInterface(232, 1449); // defence abilities
		player.getCombatDefinitions().unlockDefenceAbilities();
	}

	public void sendNISScreenInterfaces() {
		setDefaultRootInterface();
		sendGameMapInterface();// Game Map

		sendMagicAbilities();
		sendMeleeAbilities();
		sendRangedAbilities();
		sendDefenceAbilities();
		sendEpochTimer();
		setWindowInterface(253, 1466);
		// setWindowInterface(230, 506);
		setWindowInterface(91, 1473);
		setWindowInterface(166, 1464);
		setWindowInterface(188, 1458);
		setWindowInterface(286, 550);
		setWindowInterface(330, 1427);
		setWindowInterface(297, 1110);
		setWindowInterface(80, 590);
		setWindowInterface(275, 1416);
		setWindowInterface(319, 1417);
		setWindowInterface(341, 231);
		// setWindowInterface(274, 930);
		setWindowInterface(43, 1431);
		setWindowInterface(486, 568);
		// setWindowInterface(35, 1430);
		setWindowInterface(73, 1465);
		setInterface(true, 1465, 10, 1504);
		setInterface(true, 1465, 12, 1506);
		setInterface(true, 1465, 11, 1505);
		setWindowInterface(591, 1433);
		setWindowInterface(427, 1483);
		setWindowInterface(444, 745);
		setWindowInterface(423, 1485);
		setWindowInterface(470, 1213);
		setWindowInterface(508, 1448);
		setWindowInterface(415, 557);
		// setWindowInterface(481, 1484);
		setWindowInterface(102, 137);
		setWindowInterface(112, 1467);
		setWindowInterface(121, 1472);
		setWindowInterface(130, 1471);
		setWindowInterface(139, 1470);
		setWindowInterface(148, 464);
		setWindowInterface(352, 228);
		setWindowInterface(157, 1529);
		setWindowInterface(458, 182);
		setWindowInterface(580, 1488);
		setWindowInterface(49, 1430);// action bar
		setWindowInterface(884, 1252);// treasure hunter
		setWindowInterface(264, 1220);// tasks
		setWindowInterface(308, 1519); // group chat
		setWindowInterface(1019, 190);// quest list
		setInterface(true, 1253, 118, 1701);

		setWindowInterface(362, 1588); // wont open for me
		setWindowInterface(375, 1678);// wont open for me
		setWindowInterface(54, 1670);// wont open for me
		setWindowInterface(59, 1671);// wont open for me
		setWindowInterface(64, 1672);// wont open for me
		setWindowInterface(31, 1680);// wont open for me
		setWindowInterface(478, 1639);// wont open for me
		setWindowInterface(118, 1701); // wont open for me

		// setWindowInterface(333, 1215); // xp counter

	}

	private void sendEpochTimer() {
		setWindowInterface(466, 635); // time
		player.getPackets().sendExecuteScript(7486, (int) (Utils.currentTimeMillis() / 60000), (635 << 16) + 1);
	}

	public void sendConfirmDialogue() {
		setWindowInterface(false, CONFIRM_DIALOGUE_COMPONENT_ID, 26);
	}

	public void closeConfirmDialogue() {
		removeWindowInterface(CONFIRM_DIALOGUE_COMPONENT_ID);
	}

	public void sendLockGameTab(int tab, boolean lock) {
		player.getPackets().sendExecuteScriptReverse(8862, lock ? 0 : 1, tab);
	}

	public void sendMinigameTab(int interfaceId) {
		setWindowInterface(MINIGAME_TAB_COMPONENT_ID, interfaceId);
		sendLockGameTab(MINIGAME_TAB, false);
	}

	/*
	 * used for instance for clan citadel
	 */
	public void closeMinigameTab() {
		removeWindowInterface(MINIGAME_TAB_COMPONENT_ID);
		sendLockGameTab(MINIGAME_TAB, true);
	}

	public void sendSettings() {
		sendSettings(261);
	}

	/*
	 * outdated from rs2 inters pretty much
	 */
	public void sendSettings(int interfaceId) {
		setWindowInterface(resizableScreen ? 123 : 183, interfaceId);
	}

	public void sendMagicBook() {

	}

	public void setInterface(boolean clickThrought, int parentInterfaceId, int parentInterfaceComponentId, int interfaceId) {
		if (Settings.DEBUG) {
			if (parentInterfaceId != rootInterface && !containsInterface(parentInterfaceId))
				System.out.println("The parent interface isnt setted so where are u trying to set it? " + parentInterfaceId + ", " + parentInterfaceComponentId + ", " + interfaceId);
			/*
			 * if(containsInterface(interfaceId)) System.out.println(
			 * "Already have "+interfaceId+" in another component.");
			 */
		}
		// even so lets set it for now
		int parentUID = getComponentUId(parentInterfaceId, parentInterfaceComponentId);
		int oldParentUID = getInterfaceParentId(interfaceId);

		Integer oldInterface = openedinterfaces.get(parentUID);
		if (oldInterface != null)
			clearChilds(oldInterface);

		openedinterfaces.put(parentUID, interfaceId); // replaces inter if
		// theres one in that
		// component already
		if (oldParentUID != -1 && oldParentUID != parentUID) {
			openedinterfaces.remove(oldParentUID, interfaceId);
			// player.getPackets().moveInterface(oldParentUID, parentUID);
		} else
			player.getPackets().sendInterface(clickThrought, parentUID, interfaceId);
	}

	public void removeInterfaceByParent(int parentInterfaceId, int parentInterfaceComponentId) {
		removeInterfaceByParent(getComponentUId(parentInterfaceId, parentInterfaceComponentId));
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

	public boolean containsInterfaceAtParent(int parentInterfaceId, int parentInterfaceComponentId) {
		return openedinterfaces.containsKey(getComponentUId(parentInterfaceId, parentInterfaceComponentId));
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
		return containsInterfaceAtParent(resizableScreen ? RESIZABLE_WINDOW_ID : FIXED_WINDOW_ID, componentId);
	}

	public boolean containsInventoryInter() {
		return containsWindowInterfaceAtParent(INVENTORY_INTERFACE_COMPONENT_ID);
	}

	public void sendFadingInterface(int backgroundInterface) {
		setWindowInterface(FADING_COMPONENT_ID, backgroundInterface);
	}

	public void removeFadingInterface() {
		removeWindowInterface(FADING_COMPONENT_ID);
	}

	public void setScreenInterface(int backgroundInterface, int interfaceId) {
		setScreenInterface(true, backgroundInterface, interfaceId);
	}

	public void setScreenInterface(boolean walkable, int backgroundInterface, int interfaceId) {
		removeCentralInterface();
		setWindowInterface(walkable, SCREEN_BACKGROUND_COMPONENT_ID, backgroundInterface);
		setWindowInterface(walkable, SCREEN_BACKGROUND_INTER_COMPONENT_ID, interfaceId);

		player.setCloseInterfacesEvent(new Runnable() {
			@Override
			public void run() {
				removeScreenInterfaceBG();
			}
		});
	}

	public void sendBlackScreen(int interfaceId) {
		setWindowInterface(SCREEN_BACKGROUND_COMPONENT_ID, interfaceId);
	}

	public void setFairyRingInterface(boolean walkable, int interfaceId) {
		removeCentralInterface();
		setWindowInterface(walkable, SCREEN_BACKGROUND_INTER_COMPONENT_ID, interfaceId);

		player.setCloseInterfacesEvent(new Runnable() {
			@Override
			public void run() {
				removeScreenInterfaceBG();
			}
		});
	}

	public void removeScreenInterfaceBG() {
		removeWindowInterface(SCREEN_BACKGROUND_COMPONENT_ID);
		removeWindowInterface(SCREEN_BACKGROUND_INTER_COMPONENT_ID);
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

	public void openEditMode() {
		player.stopAll();
		setWindowInterface(InterfaceManager.EDIT_MODE_COMPONENT_ID, 1475); // Edit
		// menu
		setEditMode(true);
		player.setCloseInterfacesEvent(new Runnable() {
			@Override
			public void run() {
				removeWindowInterface(InterfaceManager.EDIT_MODE_COMPONENT_ID);
				setEditMode(false);
			}
		});
	}

	private void setEditMode(boolean editMode) {
		player.getPackets().sendCSVarInteger(3477, editMode ? 1 : 0);
	}

	public void gazeOrbOfOculus() {
		player.stopAll();
		setFairyRingInterface(true, 475);
		player.getPackets().sendGameMessage("The Orb of Oculus is not working correctly at the moment.");
	}

	/*
	 * returns lastGameTab
	 */
	public void openGameTab(int tabId) {
		player.getPackets().sendExecuteScript(8310, tabId);
	}

	public void switchMenu(int subMenu) {
		if (!isMenuOpen())
			return;
		openMenu(currentMenu, subMenu);
	}

	public void openExtras() {
		if (player.isUnderCombat()) {
			player.getPackets().sendGameMessage("You can't do that while in combat.");
			return;
		}
		sendCentralInterface(1139);
	}

	public void openRibbonSetup() {
		if (player.isUnderCombat()) {
			player.getPackets().sendGameMessage("You can't do that while in combat.");
			return;
		}
		sendCentralInterface(567);
	}

	public void openRS3Helper() {
		if (player.isUnderCombat()) {
			player.getPackets().sendGameMessage("You can't do that while in combat.");
			return;
		}
		sendCentralInterface(1496);
	}

	public void openMenu(int menu, int subMenu) {
		if (menu == currentMenu && player.getSubMenus()[menu] + 1 == subMenu) {
			closeMenu();
			return;
		}
		if (player.isLocked()) {
			closeMenu();
			return;
		}
		if (player.isUnderCombat()) {
			closeMenu();
			player.getPackets().sendGameMessage("You can't do that while in combat.");
			return;
		}
		setMenu(menu);
		player.getSubMenus()[menu] = subMenu - 1;

		player.getVarsManager().forceSendVarBit(18994, menu);
		player.getVarsManager().forceSendVarBit(MENU_SUBMENU_VARS[menu], subMenu);

		if (Settings.DEBUG)
			Logger.log(InterfaceManager.class, "Menu: " + menu + ", " + subMenu);

		if (menu == 0) { // hero
			if (subMenu == 1) { // Summary
				setMenuInterface(0, 320);
				setMenuInterface(1, 1446);
				player.getPackets().sendIComponentText(1446, 94, player.getDisplayName());
				player.getSkills().unlockSkills(true);
			} else if (subMenu == 2) { // Skills
				setMenuInterface(0, 1218);
				setInterface(true, 1218, 61, 1217);
				// sendCSVarInteger(1753, 8);?
			} else if (subMenu == 3) { // Loadout
				setMenuInterface(0, 1474);
				setMenuInterface(1, 1463);
				setMenuInterface(2, 1462);
				player.getPackets().sendIComponentText(1463, 11, player.getDisplayName());
				player.getInventory().unlockInventory(true);
				player.getEquipment().unlockEquipment(true);
				player.getEquipment().refreshEquipmentInterfaceBonuses();
			} else if (subMenu == 4) {// Presets
				setMenuInterface(0, 579);
				setMenuInterface(1, 627);
				setMenuInterface(2, 577);
				player.getInventory().unlockInventory(true);
				player.getEquipment().unlockEquipment(true);
				player.getEquipment().refreshEquipmentInterfaceBonuses();
			} else if (subMenu == 5) { // Achievements
				setMenuInterface(0, 917);
				setMenuInterface(1, 1056);
				// ndCSVarInteger(1423, 63);
				// sendCSVarInteger(1424, 57);
				/*
				 * sendCSVarInteger(2017, 12); sendCSVarInteger(2018, 0); sendCSVarInteger(1963, -1);
				 * sendCSVarInteger(1964, -1); sendCSVarInteger(1966, -1); sendCSVarInteger(1965, -1); Runscripts:
				 * [8862, 2, 1] Runscripts: [8862, 3, 1]
				 */

			} else if (subMenu == 6) {
				setMenuInterface(0, 1628);
			}
		} else if (menu == 1) { // Customizations
			if (subMenu == 1) { // wardrobe
				setMenuInterface(0, 1311);
				player.getCosmeticsManager().open(CosmeticType.WARDROBE);
				/*
				 * Runscripts: [8862, 2, 0] Runscripts: [8862, 3, 0] sendCSVarInteger(2017, 12);
				 * sendCSVarInteger(2018, 0); sendCSVarInteger(2699, -1); Runscripts: [6874]
				 */
			} else if (subMenu == 2) {// Animations
				setMenuInterface(0, 1311);
				player.getCosmeticsManager().open(CosmeticType.ANIMATION);
			} else if (subMenu == 3) {// appearance
				setMenuInterface(0, 1311);
				player.getCosmeticsManager().open(CosmeticType.APPEARENCE);
			} else if (subMenu == 4) {// titles
				setMenuInterface(0, 1311);
				player.getCosmeticsManager().open(CosmeticType.TITLE);
			} else if (subMenu == 5) {// pets
				setMenuInterface(0, 1311);
				player.getCosmeticsManager().open(CosmeticType.PET);
			}
		} else if (menu == 2) {// powers
			if (subMenu == 1) { // melee
				setMenuInterface(0, 1450);
				setMenuInterface(1, 1454);
				setMenuInterface(2, 1435);
				setMenuInterface(3, 1436);
				player.getActionbar().unlockActionBar(true);
			} else if (subMenu == 2) { // ranged
				setMenuInterface(0, 1456);
				setMenuInterface(1, 1454);
				setMenuInterface(2, 1445);
				setMenuInterface(3, 1436);
				player.getActionbar().unlockActionBar(true);
			} else if (subMenu == 3) { // magic
				setMenuInterface(0, 1459);
				setMenuInterface(1, 1454);
				setMenuInterface(2, 1437);
				setMenuInterface(3, 1436);
				player.getActionbar().unlockActionBar(true);
			} else if (subMenu == 4) { // defensive
				setWindowInterface(292, 1215);
				setMenuInterface(0, 1453);
				setMenuInterface(0, 1453);
				setMenuInterface(1, 1454);
				setMenuInterface(2, 1434);
				setMenuInterface(3, 1436);
				player.getActionbar().unlockActionBar(true);
			} else if (subMenu == 5) { // prayers
				setMenuInterface(0, 1457);
				setMenuInterface(1, 1454);
				setMenuInterface(2, 1439);
				setMenuInterface(3, 1436);
				player.getActionbar().unlockActionBar(true);
			} else if (subMenu == 6) { // combat settings
				/*
				 * sendCSVarInteger(1951, -1); sendCSVarInteger(1952, -1); Runscripts: [8194, 2, 6]
				 * sendCSVarInteger(2911, 2);
				 */
				setMenuInterface(0, 327);
				setMenuInterface(1, 1436);
				player.getActionbar().unlockActionBar(true);
			}
		} else if (menu == 3) {// Adventures
			if (subMenu == 1) {// featured
				// setMenuInterface(0, 1816);
			} else if (subMenu == 2) {// quests
				setMenuInterface(0, 1782);
				setMenuInterface(1, 1783);
				setMenuInterface(2, 1500);
			} else if (subMenu == 3) {// challenges
				setMenuInterface(0, 1343);
				setMenuInterface(1, 1056);
			} else if (subMenu == 4) {// minigames
				setMenuInterface(0, 1344);
			} else if (subMenu == 5) {// path
				setMenuInterface(0, 639);
				setMenuInterface(1, 400);
			} else if (subMenu == 6) {// beasts
				setMenuInterface(0, 753);
			}
		} else if (menu == 4) {// community
			if (subMenu == 1) {// vote now
				setMenuInterface(0, 1029);
			} else if (subMenu == 2) {// hiscores
				setMenuInterface(0, 1419);
			} else if (subMenu == 3) {// social
				setMenuInterface(0, 1440);
				setMenuInterface(1, 1109);
				setMenuInterface(2, 1438);
				setMenuInterface(3, 1441);
				setMenuInterface(4, 34);
				player.getFriendsIgnores().unlockFriendsIgnore(true);
				player.getPackets().sendIComponentSettings(1438, 7, 0, 19, 2); // chat
				// color
				ClansManager.unlockClanBanList(player, true);
			} else if (subMenu == 4) {// grouping
				setMenuInterface(0, 1524);
				setMenuInterface(1, 1528);
			} else if (subMenu == 5) {// twitch
				setMenuInterface(0, 232);
			} else if (subMenu == 6) {// seasonal
				setMenuInterface(0, 1784);
				setMenuInterface(1, 1809);
				setInterface(true, 1809, 1, 1700);
				setInterface(true, 1809, 2, 1808);
				setInterface(true, 1809, 3, 1810);
				setInterface(true, 1809, 4, 1807);
			}
		} else if (menu == 7) {// extras
			if (subMenu == 1) {
				setMenuInterface(0, 1607);
			}
		} else if (menu == 8) {// runemetrics
			if (subMenu == 1) {// welcome
				setMenuInterface(0, 1740);
			} else if (subMenu == 2) {// metrics
				setMenuInterface(0, 1681);
				setMenuInterface(1, 1739);
				setMenuInterface(2, 1682);
				setMenuInterface(3, 1738);
			} else if (subMenu == 3) {// graphs
				setMenuInterface(0, 1733);
				setMenuInterface(1, 1737);
				setMenuInterface(2, 1736);
			} else if (subMenu == 4) {// drops
				setMenuInterface(0, 1679);
				setMenuInterface(1, 1735);
				setMenuInterface(2, 1734);
			}
		} else if (menu == 9) {// settings
			if (subMenu == 1) {// gameplay
				setMenuInterface(0, 1443);
				setInterface(true, 1443, 69, 1663);
			} else if (subMenu == 2) {// interface
				setMenuInterface(0, 1442);
				player.getPackets().sendIComponentSettings(1442, 130, 0, 2, 2); // unlocks
			} else if (subMenu == 3) {// controls
				setMenuInterface(0, 1444);
			} else if (subMenu == 4) {// graphic settings
				setMenuInterface(0, 1426);
				setInterface(true, 1426, 0, 742);
			} else if (subMenu == 5) { // audio settings
				setMenuInterface(0, 187);
				setMenuInterface(1, 429);
				player.getMusicsManager().refreshMusicInterface(true);
				player.getMusicsManager().unlockMusicPlayer(true);
			} else if (subMenu == 6) {
				setMenuInterface(0, 327);
				player.getActionbar().unlockActionBar(true);
			}
		}
	}

	private void setMenuInterface(int slot, int id) {
		setInterface(true, 1448, MENU_SLOT_COMPONENTS_[slot], id);
		player.getPackets().sendHideIComponent(1448, MENU_SLOT_COMPONENTS_[slot], false);
	}

	public boolean isMenuOpen() {
		return currentMenu != -1;
	}

	public void closeMenu() {
		setMenu(-1);
	}

	private void setMenu(int menu) {
		currentMenu = menu;
		if (player.getVarsManager().getBitValue(CosmeticsManager.COSMETIC_TYPE_MENU_VARBIT) != 0)
			player.getCosmeticsManager().close();
		player.getPackets().sendCSVarInteger(2911, menu);
		for (int slot : MENU_SLOT_COMPONENTS_)
			if (containsInterfaceAtParent(1448, slot))
				removeInterfaceByParent(1448, slot);
		player.getPackets().sendHideIComponent(1448, 1, menu != -1);

	}

	public static int getNextStatus(int status) {
		return status == 2 ? 0 : (status + 1);
	}

	public void sendCustom(Player player) {
		player.getPackets().sendUnlockIComponentOptionSlots(190, 15, 0, 201, 0, 1, 2, 3);
		player.getPackets().sendConfig(31, 10);
		player.getPackets().sendConfig(160, 1);
		// player.getPackets().sendIComponentText(190, 27, "Quest Points: " +
		// player.getQuestManager().getQuestPoints() + "/10");
	}
}