/* Class388 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Desktop;
import java.net.URI;

public class Class388 implements Interface49 {
	public int anInt4011;
	public Class380 aClass380_4012;
	public int anInt4013;
	public Class389 aClass389_4014;
	public int anInt4015;

	public Class394 method351() {
		return Class394.aClass394_4049;
	}

	public Class394 method353(int i) {
		return Class394.aClass394_4049;
	}

	Class388(int i, Class380 class380, Class389 class389, int i_0_, int i_1_) {
		anInt4015 = 1689618639 * i;
		aClass380_4012 = class380;
		aClass389_4014 = class389;
		anInt4011 = 1890878453 * i_0_;
		anInt4013 = -1110334339 * i_1_;
	}

	public Class394 method352() {
		return Class394.aClass394_4049;
	}

	public Class394 method354() {
		return Class394.aClass394_4049;
	}

	public static Class388 method6469(Class523_Sub34 class523_sub34) {
		int i = class523_sub34.readBigSmart((byte) -53);
		Class380 class380 = (Class228.method4175(1447991805)[class523_sub34.readUnsignedByte(124410742)]);
		Class389 class389 = (Class25.method843(-1703137411)[class523_sub34.readUnsignedByte(614406498)]);
		int i_2_ = class523_sub34.readShort(1174189042);
		int i_3_ = class523_sub34.readShort(1646719937);
		return new Class388(i, class380, class389, i_2_, i_3_);
	}

	public static void method6470(String string, boolean bool, String string_4_, boolean bool_5_, int i) {
		if (bool) {
			do {
				if (!bool_5_ && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
					try {
						Desktop.getDesktop().browse(new URI(string));
					} catch (Exception exception) {
						break;
					}
					return;
				}
			} while (false);
			if (Class501.aString5578.startsWith("win") && !bool_5_)
				Class333.method5847(string, 0, 1347740193);
			else if (Class501.aString5578.startsWith("mac"))
				Class571.method9619(string, 1, string_4_, -1876290030);
			else
				Class333.method5847(string, 2, 1788753730);
		} else
			Class333.method5847(string, 3, 1777769881);
	}

	static final void method6471(Class669 class669, int i) {
		if (!Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5341((byte) 98).method5253((byte) -125))
			throw new RuntimeException();
		Class688_Sub4 class688_sub4 = (Class688_Sub4) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5465((byte) 83);
		class688_sub4.method17147(Class162.aClass444_1770, -1, 0.0F, 1104154794);
		client.aBool11111 = true;
	}

	public static long method6472(CharSequence charsequence, int i) {
		int i_6_ = charsequence.length();
		long l = 0L;
		for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
			l = (l << 5) - l + (long) charsequence.charAt(i_7_);
		return l;
	}
}
