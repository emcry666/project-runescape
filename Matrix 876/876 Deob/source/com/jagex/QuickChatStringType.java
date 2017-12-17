/* Class636 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class QuickChatStringType {
	public static QuickChatStringType QC_SLAYER_TASK;
	public static QuickChatStringType QC_ITEM;
	static QuickChatStringType QC_RANK;
	static QuickChatStringType QC_SKILL;
	static QuickChatStringType aClass636_8286;
	public static QuickChatStringType aClass636_8287;
	static QuickChatStringType QC_FRIEND_CHAT;
	static QuickChatStringType QC_MINIGAME_POINTS;
	public static QuickChatStringType QC_ITEM_TRADE;
	public static QuickChatStringType QC_EXPERIENCE;
	public int serverToClientBytes;
	public static QuickChatStringType QC_GENERAL = new QuickChatStringType(0, 2, 2, 1);
	static QuickChatStringType QC_SOULWARS;
	static QuickChatStringType QC_COMBAT_LEVEL;
	public int id;
	public int clientToServerBytes;
	static QuickChatStringType QC_COMBAT_LEVEL_AVERAGE;
	public int dataCount;
	public static Class149 aClass149_8300;

	static {
		QC_ITEM = new QuickChatStringType(1, 2, 2, 0);
		aClass636_8286 = new QuickChatStringType(2, 4, 4, 0);
		QC_SKILL = new QuickChatStringType(4, 1, 1, 1);
		QC_SLAYER_TASK = new QuickChatStringType(6, 0, 4, 2);
		aClass636_8287 = new QuickChatStringType(7, 0, 1, 1);
		QC_RANK = new QuickChatStringType(8, 0, 4, 1);
		QC_MINIGAME_POINTS = new QuickChatStringType(9, 0, 4, 1);
		QC_ITEM_TRADE = new QuickChatStringType(10, 2, 2, 0);
		QC_EXPERIENCE = new QuickChatStringType(11, 0, 1, 2);
		QC_FRIEND_CHAT = new QuickChatStringType(12, 0, 1, 0);
		QC_COMBAT_LEVEL_AVERAGE = new QuickChatStringType(13, 0, 1, 0);
		QC_SOULWARS = new QuickChatStringType(14, 0, 4, 1);
		QC_COMBAT_LEVEL = new QuickChatStringType(15, 0, 1, 0);
	}

	QuickChatStringType(int id, int clientToServerBytes, int serverToClientBytes, int dataCount) {
		this.id = id * -908979839;
		this.clientToServerBytes = clientToServerBytes * 60716293;
		this.serverToClientBytes = 1740949473 * serverToClientBytes;
		this.dataCount = dataCount * 173275855;
	}

	static final void method10445(InterfaceComponentDefinitions class250, Class242 class242, Class669 class669, byte i) {
		class250.anInt2707 = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) * -697127929;
		Login.method15991(class250, (byte) -126);
	}

	static final void method10446(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class61.method1418((byte) 106);
	}

	static final void method10447(Class669 class669, byte i) {
		class669.anInt8558 -= -17422498;
		int i_5_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_6_ = class669.anIntArray8557[1 + class669.anInt8558 * 1357652815];
		Class553.method9164(7, i_5_, i_6_, "", 221978259);
	}

	public static void method10448(byte i) {
		for (Class523_Sub27_Sub8 class523_sub27_sub8 = ((Class523_Sub27_Sub8) Class36.aClass697_339.first(-1426448868)); null != class523_sub27_sub8; class523_sub27_sub8 = ((Class523_Sub27_Sub8) Class36.aClass697_339.next(768418218))) {
			if (1060081949 * class523_sub27_sub8.anInt11719 > 1) {
				class523_sub27_sub8.anInt11719 = 0;
				Class36.aClass209_335.method3770(class523_sub27_sub8, (5220346430341563535L * (((Class523_Sub27_Sub6) (class523_sub27_sub8.aClass697_11718.aClass523_Sub27_8763.aClass523_Sub27_10551)).aLong11628)));
				class523_sub27_sub8.aClass697_11718.removeFromQueue(1739026943);
			}
		}
		Class36.anInt336 = 0;
		Class36.anInt330 = 0;
		Class36.aClass708_342.method14235((byte) -96);
		Class36.aClass14_338.method733(1750455891);
		Class36.aClass697_339.removeFromQueue(57845863);
		Class36.aBool326 = false;
	}
}
