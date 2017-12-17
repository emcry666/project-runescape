/* Class301 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public class Class301 implements Interface32 {
	int anInt3322;
	static Class209 aClass209_3323;
	boolean aBool3324;
	Interface33[] anInterface33Array3325;
	int anInt3326;
	Class92 aClass92_3327;
	Class178 aClass178_3328;
	static byte[] aByteArray3329 = { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };
	static int anInt3330;

	public boolean method206(long l) {
		return (Class248.method4401(1516375036) >= l + (long) (anInt3322 * -871205501));
	}

	public boolean method196(long l) {
		return (Class248.method4401(1516375036) >= l + (long) (anInt3322 * -871205501));
	}

	public void method201(boolean bool, int i) {
		bool = true;
		Interface33[] interface33s = anInterface33Array3325;
		for (int i_0_ = 0; i_0_ < interface33s.length; i_0_++) {
			Interface33 interface33 = interface33s[i_0_];
			if (interface33 != null)
				interface33.method213(bool || aBool3324, (short) -12097);
		}
		aBool3324 = false;
	}

	public int method192(int i) {
		int i_1_ = 0;
		Interface33[] interface33s = anInterface33Array3325;
		for (int i_2_ = 0; i_2_ < interface33s.length; i_2_++) {
			Interface33 interface33 = interface33s[i_2_];
			if (null == interface33 || interface33.method209((byte) -58))
				i_1_++;
		}
		return 100 * i_1_ / anInterface33Array3325.length;
	}

	public void method195(int i) {
		/* empty */
	}

	static void method5518() {
		aClass209_3323.method3773(-1988242491);
	}

	public int method197(int i) {
		return 40375847 * anInt3326;
	}

	static {
		aClass209_3323 = new Class209(128, 4);
	}

	public void method203(boolean bool) {
		bool = true;
		Interface33[] interface33s = anInterface33Array3325;
		for (int i = 0; i < interface33s.length; i++) {
			Interface33 interface33 = interface33s[i];
			if (interface33 != null)
				interface33.method213(bool || aBool3324, (short) 4614);
		}
		aBool3324 = false;
	}

	public void method199(boolean bool) {
		bool = true;
		Interface33[] interface33s = anInterface33Array3325;
		for (int i = 0; i < interface33s.length; i++) {
			Interface33 interface33 = interface33s[i];
			if (interface33 != null)
				interface33.method213(bool || aBool3324, (short) -8630);
		}
		aBool3324 = false;
	}

	public void method194() {
		/* empty */
	}

	public void method200() {
		if (aClass178_3328 != Class31.aClass178_303) {
			aClass178_3328 = Class31.aClass178_303;
			aBool3324 = true;
		}
		aClass178_3328.method3076(3, 0);
		Interface33[] interface33s = anInterface33Array3325;
		for (int i = 0; i < interface33s.length; i++) {
			Interface33 interface33 = interface33s[i];
			if (interface33 != null)
				interface33.method210(-1581582212);
		}
	}

	static boolean method5519() {
		boolean bool;
		try {
			Class79 class79 = new Class79();
			byte[] is = class79.method1556(aByteArray3329, 1357652815);
			Class173.method2909(is, (byte) -122);
			bool = true;
		} catch (Exception exception) {
			return false;
		}
		return bool;
	}

	Class301(Class92 class92, int i, int i_3_, Class321 class321) {
		aClass92_3327 = class92;
		anInt3322 = -1783611093 * i;
		anInt3326 = i_3_ * -254150249;
		anInterface33Array3325 = new Interface33[aClass92_3327.anInterface49Array896.length];
		for (int i_4_ = 0; i_4_ < anInterface33Array3325.length; i_4_++)
			anInterface33Array3325[i_4_] = class321.method5714((aClass92_3327.anInterface49Array896[i_4_]), 1214686797);
	}

	public int method204() {
		int i = 0;
		Interface33[] interface33s = anInterface33Array3325;
		for (int i_5_ = 0; i_5_ < interface33s.length; i_5_++) {
			Interface33 interface33 = interface33s[i_5_];
			if (null == interface33 || interface33.method209((byte) -88))
				i++;
		}
		return 100 * i / anInterface33Array3325.length;
	}

	public void method193(short i) {
		if (aClass178_3328 != Class31.aClass178_303) {
			aClass178_3328 = Class31.aClass178_303;
			aBool3324 = true;
		}
		aClass178_3328.method3076(3, 0);
		Interface33[] interface33s = anInterface33Array3325;
		for (int i_6_ = 0; i_6_ < interface33s.length; i_6_++) {
			Interface33 interface33 = interface33s[i_6_];
			if (interface33 != null)
				interface33.method210(-454821209);
		}
	}

	static void method5520() {
		aClass209_3323.method3773(-1933290203);
	}

	public int method207() {
		return 40375847 * anInt3326;
	}

	static Class148 method5521(byte[] is) {
		if (null == is)
			throw new RuntimeException("");
		Class148 class148;
		for (;;) {
			try {
				Image image = Toolkit.getDefaultToolkit().createImage(is);
				java.awt.Container container = Class458.method7486(-2075968009);
				MediaTracker mediatracker = new MediaTracker(container);
				mediatracker.addImage(image, 0);
				mediatracker.waitForAll();
				int i = image.getWidth(container);
				int i_7_ = image.getHeight(container);
				if (mediatracker.isErrorAny() || i < 0 || i_7_ < 0)
					throw new RuntimeException("");
				int[] is_8_ = new int[i_7_ * i];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, i, i_7_, is_8_, 0, i);
				pixelgrabber.grabPixels();
				class148 = Class31.aClass178_303.method3103(is_8_, 0, i, i, i_7_, -1918978939);
				break;
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
		}
		return class148;
	}

	public boolean method205(long l) {
		return (Class248.method4401(1516375036) >= l + (long) (anInt3322 * -871205501));
	}

	public static Class148 method5522(Class472 class472, int i) {
		Class148 class148 = (Class148) aClass209_3323.method3767((long) i);
		if (class148 == null) {
			if (Class308.aBool3363)
				class148 = Class31.aClass178_303.method3104(Class166.method2659(class472, i), true);
			else
				class148 = Class173.method2909(class472.method7721(i, -387132909), (byte) -95);
			aClass209_3323.method3770(class148, (long) i);
		}
		return class148;
	}

	static Class148 method5523(byte[] is) {
		if (null == is)
			throw new RuntimeException("");
		Class148 class148;
		for (;;) {
			try {
				Image image = Toolkit.getDefaultToolkit().createImage(is);
				java.awt.Container container = Class458.method7486(-2010107578);
				MediaTracker mediatracker = new MediaTracker(container);
				mediatracker.addImage(image, 0);
				mediatracker.waitForAll();
				int i = image.getWidth(container);
				int i_9_ = image.getHeight(container);
				if (mediatracker.isErrorAny() || i < 0 || i_9_ < 0)
					throw new RuntimeException("");
				int[] is_10_ = new int[i_9_ * i];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, i, i_9_, is_10_, 0, i);
				pixelgrabber.grabPixels();
				class148 = Class31.aClass178_303.method3103(is_10_, 0, i, i, i_9_, -1776343771);
				break;
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
		}
		return class148;
	}

	static boolean method5524() {
		boolean bool;
		try {
			Class79 class79 = new Class79();
			byte[] is = class79.method1556(aByteArray3329, 1357652815);
			Class173.method2909(is, (byte) -7);
			bool = true;
		} catch (Exception exception) {
			return false;
		}
		return bool;
	}

	public int method202() {
		int i = 0;
		Interface33[] interface33s = anInterface33Array3325;
		for (int i_11_ = 0; i_11_ < interface33s.length; i_11_++) {
			Interface33 interface33 = interface33s[i_11_];
			if (null == interface33 || interface33.method209((byte) -70))
				i++;
		}
		return 100 * i / anInterface33Array3325.length;
	}

	static Class148 method5525(byte[] is) {
		if (null == is)
			throw new RuntimeException("");
		Class148 class148;
		for (;;) {
			try {
				Image image = Toolkit.getDefaultToolkit().createImage(is);
				java.awt.Container container = Class458.method7486(-1819149464);
				MediaTracker mediatracker = new MediaTracker(container);
				mediatracker.addImage(image, 0);
				mediatracker.waitForAll();
				int i = image.getWidth(container);
				int i_12_ = image.getHeight(container);
				if (mediatracker.isErrorAny() || i < 0 || i_12_ < 0)
					throw new RuntimeException("");
				int[] is_13_ = new int[i_12_ * i];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, i, i_12_, is_13_, 0, i);
				pixelgrabber.grabPixels();
				class148 = Class31.aClass178_303.method3103(is_13_, 0, i, i, i_12_, -2072167281);
				break;
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
		}
		return class148;
	}

	public int method198() {
		int i = 0;
		Interface33[] interface33s = anInterface33Array3325;
		for (int i_14_ = 0; i_14_ < interface33s.length; i_14_++) {
			Interface33 interface33 = interface33s[i_14_];
			if (null == interface33 || interface33.method209((byte) -15))
				i++;
		}
		return 100 * i / anInterface33Array3325.length;
	}

	static final void method5526(Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4318, client.aClass116_11058.aClass11_1413, 1370050649);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(string.length() + 1, -1157119254);
		class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string, (byte) 34);
		client.aClass116_11058.method1974(class523_sub22, (byte) 107);
	}

	public static void method5527(byte i) {
		Class510.method8513();
	}
}
