package com.rs.game.player.content;

import com.rs.cache.loaders.ClientScriptMap;
import com.rs.cache.loaders.GeneralRequirementMap;
import com.rs.game.Animation;
import com.rs.game.player.Player;
import com.rs.utils.Starter;

public final class PlayerLook {

	public static void openCharacterCustomizing(Player player) {
		player.getPackets().sendRootInterface(1028, 0);
		player.getPackets().sendUnlockIComponentOptionSlots(1028, 65, 0, 11, 0);
		player.getPackets().sendUnlockIComponentOptionSlots(1028, 128, 0, 50, 0);
		player.getPackets().sendUnlockIComponentOptionSlots(1028, 132, 0, 250, 0);
		player.getVarsManager().sendVarBit(8093, player.getAppearence().isMale() ? 0 : 1);
	}

	public static void handleCharacterCustomizingButtons(Player player, int buttonId, int slotId) {
		if (buttonId == 138) { // confirm
			player.getPackets().sendRootInterface(player.getInterfaceManager().hasRezizableScreen() ? 746 : 548, 0);
			player.getTemporaryAttributtes().remove("SelectWearDesignD");
			player.getTemporaryAttributtes().remove("ViewWearDesign");
			player.getTemporaryAttributtes().remove("ViewWearDesignD");
			player.getAppearence().generateAppearenceData();
			player.getPackets().sendOpenURL("https://discord.gg/5M2kqqA");
			player.getPackets().sendGameMessage("Please join our Discord for easier access to staff members and players!");
		} else if (buttonId == 68) {
			player.getTemporaryAttributtes().put("ViewWearDesign", (buttonId - 68));
			player.getTemporaryAttributtes().put("ViewWearDesignD", 0);
			setDesign(player, buttonId - 68, 0);
		} else if (buttonId == 69) {
			player.getTemporaryAttributtes().put("ViewWearDesign", (buttonId - 68));
			player.getTemporaryAttributtes().put("ViewWearDesignD", 0);
			setDesign(player, buttonId - 68, 0);
		} else if (buttonId == 70) {
			player.getTemporaryAttributtes().put("ViewWearDesign", (buttonId - 68));
			player.getTemporaryAttributtes().put("ViewWearDesignD", 0);
			setDesign(player, buttonId - 68, 0);
		} else if (buttonId == 71) {
			player.getTemporaryAttributtes().put("ViewWearDesign", (buttonId - 68));
			player.getTemporaryAttributtes().put("ViewWearDesignD", 0);
			setDesign(player, buttonId - 68, 0);
		} else if (buttonId == 72) {
			player.getTemporaryAttributtes().put("ViewWearDesign", (buttonId - 68));
			player.getTemporaryAttributtes().put("ViewWearDesignD", 0);
			setDesign(player, buttonId - 68, 0);
		} else if (buttonId == 73) {
			player.getTemporaryAttributtes().put("ViewWearDesign", (buttonId - 68));
			player.getTemporaryAttributtes().put("ViewWearDesignD", 0);
			setDesign(player, buttonId - 68, 0);
		} else if (buttonId == 74) {
			player.getTemporaryAttributtes().put("ViewWearDesign", (buttonId - 68));
			player.getTemporaryAttributtes().put("ViewWearDesignD", 0);
			setDesign(player, buttonId - 68, 0);
		} else if (buttonId >= 103 && buttonId <= 105) {
			Integer index = (Integer) player.getTemporaryAttributtes().get("ViewWearDesign");
			if (index == null)
				return;
			player.getTemporaryAttributtes().put("ViewWearDesignD", (buttonId - 103));
			setDesign(player, index, buttonId - 103);
		} else if (buttonId == 62 || buttonId == 63) {
			setGender(player, buttonId == 62);
		} else if (buttonId == 65) {
			setSkin(player, slotId);
		} else if (buttonId >= 116 && buttonId <= 121) {
			player.getTemporaryAttributtes().put("SelectWearDesignD", (buttonId - 116));
		} else if (buttonId == 128) {
			Integer index = (Integer) player.getTemporaryAttributtes().get("SelectWearDesignD");
			if (index == null || index == 1) {
				boolean male = player.getAppearence().isMale();
				int map1 = ClientScriptMap.getMap(male ? 3304 : 3302).getIntValue(slotId);
				if (map1 == 0)
					return;
				GeneralRequirementMap map = GeneralRequirementMap.getMap(map1);
				player.getAppearence().setHairStyle(map.getIntValue(788));
				if (!male)
					player.getAppearence().setBeardStyle(player.getAppearence().getHairStyle());
			} else if (index == 2) {
				player.getAppearence().setTopStyle(ClientScriptMap.getMap(player.getAppearence().isMale() ? 3287 : 1591).getIntValue(slotId));
				player.getAppearence().setArmsStyle(player.getAppearence().isMale() ? 26 : 65); // default
				player.getAppearence().setWristsStyle(player.getAppearence().isMale() ? 34 : 68); // default
				player.getAppearence().generateAppearenceData();
			} else if (index == 3)
				player.getAppearence().setLegsStyle(ClientScriptMap.getMap(player.getAppearence().isMale() ? 3289 : 1607).getIntValue(slotId));
			else if (index == 4)
				player.getAppearence().setBootsStyle(ClientScriptMap.getMap(player.getAppearence().isMale() ? 1136 : 1137).getIntValue(slotId));
			else if (player.getAppearence().isMale())
				player.getAppearence().setBeardStyle(ClientScriptMap.getMap(3307).getIntValue(slotId));
		} else if (buttonId == 132) {
			Integer index = (Integer) player.getTemporaryAttributtes().get("SelectWearDesignD");
			if (index == null || index == 0)
				setSkin(player, slotId);
			else {
				if (index == 1 || index == 5)
					player.getAppearence().setHairColor(ClientScriptMap.getMap(2345).getIntValue(slotId));
				else if (index == 2)
					player.getAppearence().setTopColor(ClientScriptMap.getMap(3283).getIntValue(slotId));
				else if (index == 3)
					player.getAppearence().setLegsColor(ClientScriptMap.getMap(3283).getIntValue(slotId));
				else
					player.getAppearence().setBootsColor(ClientScriptMap.getMap(3297).getIntValue(slotId));
			}
		}
	}

	public static void handleMageMakeOverButtons(Player player, int buttonId) {
		if (buttonId == 14 || buttonId == 16 || buttonId == 15 || buttonId == 17)
			player.getTemporaryAttributtes().put("MageMakeOverGender", buttonId == 14 || buttonId == 16);
		else if (buttonId >= 20 && buttonId <= 31) {

			int skin;
			if (buttonId == 31)
				skin = 11;
			else if (buttonId == 30)
				skin = 10;
			else if (buttonId == 20)
				skin = 9;
			else if (buttonId == 21)
				skin = 8;
			else if (buttonId == 22)
				skin = 7;
			else if (buttonId == 29)
				skin = 6;
			else if (buttonId == 28)
				skin = 5;
			else if (buttonId == 27)
				skin = 4;
			else if (buttonId == 26)
				skin = 3;
			else if (buttonId == 25)
				skin = 2;
			else if (buttonId == 24)
				skin = 1;
			else
				skin = 0;
			player.getTemporaryAttributtes().put("MageMakeOverSkin", skin);
		} else if (buttonId == 33) {
			Boolean male = (Boolean) player.getTemporaryAttributtes().remove("MageMakeOverGender");
			Integer skin = (Integer) player.getTemporaryAttributtes().remove("MageMakeOverSkin");
			player.closeInterfaces();
			if (male == null || skin == null)
				return;
			if (male == player.getAppearence().isMale() && skin == player.getAppearence().getSkinColor())
				player.getDialogueManager().startDialogue("MakeOverMage", 2676, 1);
			else {
				player.getDialogueManager().startDialogue("MakeOverMage", 2676, 2);
				if (player.getAppearence().isMale() != male) {
					if (player.getEquipment().wearingArmour()) {
						player.getDialogueManager().startDialogue("SimpleMessage", "You cannot have armor on while changing your gender.");
						return;
					}
					if (male)
						player.getAppearence().resetAppearence();
					else
						player.getAppearence().female();
				}
				player.getAppearence().setSkinColor(skin);
				player.getAppearence().generateAppearenceData();
			}
		}
	}

	public static void handleHairdresserSalonButtons(Player player, int buttonId, int slotId) {// Hair
																								// and
																								// color
																								// match
																								// button
																								// count
																								// so
																								// just
																								// loop
																								// and
																								// do
																								// ++,
																								// but
																								// cant
																								// find
																								// button
																								// ids
		if (buttonId == 6)
			player.getTemporaryAttributtes().put("hairSaloon", true);
		else if (buttonId == 7)
			player.getTemporaryAttributtes().put("hairSaloon", false);
		else if (buttonId == 18) {
			player.closeInterfaces();
		} else if (buttonId == 10) {
			Boolean hairSalon = (Boolean) player.getTemporaryAttributtes().get("hairSaloon");
			if (hairSalon != null && hairSalon)
				player.getAppearence().setHairStyle((int) ClientScriptMap.getMap(player.getAppearence().isMale() ? 2339 : 2342).getKeyForValue(slotId / 2));
			else if (player.getAppearence().isMale())
				player.getAppearence().setBeardStyle(ClientScriptMap.getMap(703).getIntValue(slotId / 2));
		} else if (buttonId == 16)
			player.getAppearence().setHairColor(ClientScriptMap.getMap(2345).getIntValue(slotId / 2));
	}

	public static void openMageMakeOver(Player player) {
		player.getInterfaceManager().sendInterface(900);
		player.getPackets().sendIComponentText(900, 33, "Confirm");
		player.getPackets().sendConfigByFile(6098, player.getAppearence().isMale() ? 0 : 1);
		player.getPackets().sendConfigByFile(6099, player.getAppearence().getSkinColor());
		player.getTemporaryAttributtes().put("MageMakeOverGender", player.getAppearence().isMale());
		player.getTemporaryAttributtes().put("MageMakeOverSkin", player.getAppearence().getSkinColor());
	}

	public static void handleThessaliasMakeOverButtons(Player player, int buttonId, int slotId) {
		if (buttonId == 6)
			player.getTemporaryAttributtes().put("ThessaliasMakeOver", 0);
		else if (buttonId == 7) {
			if (ClientScriptMap.getMap(player.getAppearence().isMale() ? 690 : 1591).getKeyForValue(player.getAppearence().getTopStyle()) >= 32) {
				player.getTemporaryAttributtes().put("ThessaliasMakeOver", 1);
			} else
				player.sm("You can't select different arms to go with that top.");
		} else if (buttonId == 8) {
			if (ClientScriptMap.getMap(player.getAppearence().isMale() ? 690 : 1591).getKeyForValue(player.getAppearence().getTopStyle()) >= 32) {
				player.getTemporaryAttributtes().put("ThessaliasMakeOver", 2);
			} else
				player.sm("You can't select different wrists to go with that top.");
		} else if (buttonId == 9)
			player.getTemporaryAttributtes().put("ThessaliasMakeOver", 3);
		else if (buttonId == 19) { // confirm
			player.closeInterfaces();
		} else if (buttonId == 12) { // set part
			Integer stage = (Integer) player.getTemporaryAttributtes().get("ThessaliasMakeOver");
			if (stage == null || stage == 0) {
				player.getAppearence().setTopStyle(ClientScriptMap.getMap(player.getAppearence().isMale() ? 690 : 1591).getIntValue(slotId / 2));
				if (!player.getAppearence().isMale())
					player.getAppearence().setBeardStyle(player.getAppearence().getTopStyle());
				player.getAppearence().setArmsStyle(player.getAppearence().isMale() ? 26 : 65); // default
				player.getAppearence().setWristsStyle(player.getAppearence().isMale() ? 34 : 68); // default
			} else if (stage == 1) // arms
				player.getAppearence().setArmsStyle(ClientScriptMap.getMap(player.getAppearence().isMale() ? 711 : 693).getIntValue(slotId / 2));
			else if (stage == 2) // wrists
				player.getAppearence().setWristsStyle(ClientScriptMap.getMap(751).getIntValue(slotId / 2));
			else
				player.getAppearence().setLegsStyle(ClientScriptMap.getMap(player.getAppearence().isMale() ? 1586 : 1607).getIntValue(slotId / 2));

		} else if (buttonId == 17) {// color
			Integer stage = (Integer) player.getTemporaryAttributtes().get("ThessaliasMakeOver");
			if (stage == null || stage == 0 || stage == 1)
				player.getAppearence().setTopColor(ClientScriptMap.getMap(3282).getIntValue(slotId / 2));
			else if (stage == 3)
				player.getAppearence().setLegsColor(ClientScriptMap.getMap(3284).getIntValue(slotId / 2));
		}
	}

	public static void openThessaliasMakeOver(final Player player) {
		if (player.getEquipment().wearingArmour()) {
			player.getDialogueManager().startDialogue("SimpleNPCMessage", 548, "You're not able to try on my clothes with all that armour. Take it off and then speak to me again.");
			return;
		}
		player.setNextAnimation(new Animation(11623));
		player.getInterfaceManager().sendInterface(729);
		player.getPackets().sendIComponentText(729, 21, "Free!");
		player.getTemporaryAttributtes().put("ThessaliasMakeOver", 0);
		player.getPackets().sendUnlockIComponentOptionSlots(729, 12, 0, 100, 0);
		player.getPackets().sendUnlockIComponentOptionSlots(729, 17, 0, ClientScriptMap.getMap(3282).getSize() * 2, 0);
		player.setCloseInterfacesEvent(new Runnable() {

			@Override
			public void run() {
				player.getDialogueManager().startDialogue("SimpleNPCMessage", 548, "A marvellous choice. You look splendid!");
				player.setNextAnimation(new Animation(-1));
				player.getAppearence().getAppeareanceData();
				player.getTemporaryAttributtes().remove("ThessaliasMakeOver");
			}

		});
	}

	public static void openHairdresserSalon(final Player player) {
		if (player.getEquipment().getHatId() != -1) {
			player.getDialogueManager().startDialogue("SimpleNPCMessage", 598, "I'm afraid I can't see your head at the moment. Please remove your headgear first.");
			return;
		}
		if (player.getEquipment().getWeaponId() != -1 || player.getEquipment().getShieldId() != -1) {
			player.getDialogueManager().startDialogue("SimpleNPCMessage", 598, "I don't feel comfortable cutting hair when you are wielding something. Please remove what you are holding first.");
			return;
		}
		player.setNextAnimation(new Animation(11623));
		player.getInterfaceManager().sendInterface(309);
		player.getPackets().sendUnlockIComponentOptionSlots(309, 10, 0, ClientScriptMap.getMap(player.getAppearence().isMale() ? 2339 : 2342).getSize() * 2, 0);
		player.getPackets().sendUnlockIComponentOptionSlots(309, 16, 0, ClientScriptMap.getMap(2345).getSize() * 2, 0);
		player.getPackets().sendIComponentText(309, 20, "Free!");
		player.getTemporaryAttributtes().put("hairSaloon", true);
		player.setCloseInterfacesEvent(new Runnable() {

			@Override
			public void run() {
				player.getDialogueManager().startDialogue("SimpleNPCMessage", 598, "An excellent choice, " + (player.getAppearence().isMale() ? "sir" : "lady") + ".");
				player.setNextAnimation(new Animation(-1));
				player.getAppearence().getAppeareanceData();
				player.getTemporaryAttributtes().remove("hairSaloon");
			}

		});
	}

	public static void setGender(Player player, boolean male) {
		if (male == player.getAppearence().isMale())
			return;
		if (!male)
			player.getAppearence().female();
		else
			player.getAppearence().male();
		Integer index1 = (Integer) player.getTemporaryAttributtes().get("ViewWearDesign");
		Integer index2 = (Integer) player.getTemporaryAttributtes().get("ViewWearDesignD");
		setDesign(player, index1 != null ? index1 : 0, index2 != null ? index2 : 0);
		player.getAppearence().generateAppearenceData();
		player.getVarsManager().sendVarBit(8093, male ? 0 : 1);
	}

	public static void setSkin(Player player, int index) {
		player.getAppearence().setSkinColor(ClientScriptMap.getMap(748).getIntValue(index));
	}

	public static void setDesign(Player player, int index1, int index2) {
		int map1 = ClientScriptMap.getMap(3278).getIntValue(index1);
		if (map1 == 0)
			return;
		boolean male = player.getAppearence().isMale();
		int map2Id = GeneralRequirementMap.getMap(map1).getIntValue((male ? 1169 : 1175) + index2);
		if (map2Id == 0)
			return;
		GeneralRequirementMap map = GeneralRequirementMap.getMap(map2Id);
		for (int i = 1182; i <= 1186; i++) {
			int value = map.getIntValue(i);
			if (value == -1)
				continue;
			player.getAppearence().setLook(i - 1180, value);
		}
		for (int i = 1187; i <= 1190; i++) {
			int value = map.getIntValue(i);
			if (value == -1)
				continue;
			player.getAppearence().setColor(i - 1186, value);
		}
		if (!player.getAppearence().isMale())
			player.getAppearence().setBeardStyle(player.getAppearence().getHairStyle());

	}
	

	private PlayerLook() {

	}

}
