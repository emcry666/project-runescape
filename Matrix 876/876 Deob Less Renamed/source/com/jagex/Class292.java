/* Class292 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import com.jagex.twitchtv.TwitchEventLiveStreams;

public class Class292 {
	public static Class292 aClass292_3156;
	int anInt3157;
	public static Class292 aClass292_3158 = new Class292(0);
	public static TwitchEventLiveStreams aTwitchEventLiveStreams3159;

	Class292(int i) {
		anInt3157 = -362146091 * i;
	}

	static {
		aClass292_3156 = new Class292(1);
	}

	static void method5236(int i) {
		Class569.aBool7641 = false;
		Class3.anIntArray33 = null;
		Class569.anIntArray7644 = null;
		Class569.aLinkedList7645.clear();
		Class569.aLinkedList7646.clear();
		Class31.aClass178_303.method3066();
	}

	static final void method5237(Class669 class669, int i) {
		class669.anInt8558 -= 2121349901;
		Class254.aClass217_2743.sendMusic(class669.anIntArray8557[1357652815 * class669.anInt8558], class669.anIntArray8557[1357652815 * class669.anInt8558 + 1], (byte) -33);
	}

	static final void method5238(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub42_10612.method17130(137020049);
	}

	static final void method5239(Class669 class669, int i) {
		Class647_Sub1_Sub3_Sub1_Sub1 class647_sub1_sub3_sub1_sub1 = ((Class647_Sub1_Sub3_Sub1_Sub1) class669.aClass647_Sub1_Sub3_Sub1_8552);
		String string = class647_sub1_sub3_sub1_sub1.aString12169;
		NPCDefinition class300 = class647_sub1_sub3_sub1_sub1.aClass300_12175;
		if (class300.anIntArray3286 != null) {
			class300 = class300.method5490(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, (byte) 17);
			if (class300 == null)
				string = "";
			else
				string = class300.aString3314;
		}
		if (null == string)
			string = "";
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = string;
	}

	public static final void method5240(byte i) {
		String string = (null != Class676.aString8636 ? Class676.aString8636 : Class436.method6875((byte) -19));
		Class331.method5825(string, false, client.aBool10996, 1064427752);
	}
}
