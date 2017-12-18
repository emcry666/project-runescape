/* Class63 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class Class63 implements Runnable {
	InetAddress anInetAddress773;
	volatile String aString774;

	public void method1425() {
		aString774 = anInetAddress773.getHostName();
	}

	public String method1426(byte i) {
		return aString774;
	}

	public void run() {
		aString774 = anInetAddress773.getHostName();
	}

	public void method1427() {
		aString774 = anInetAddress773.getHostName();
	}

	public String method1428() {
		return aString774;
	}

	Class63(int i) throws UnknownHostException {
		anInetAddress773 = InetAddress.getByAddress(new byte[] { (byte) (i >> 24 & 0xff), (byte) (i >> 16 & 0xff), (byte) (i >> 8 & 0xff), (byte) (i & 0xff) });
	}

	static boolean method1429(String string, int i) {
		if (string == null)
			return false;
		try {
			new URL(string);
		} catch (MalformedURLException malformedurlexception) {
			return false;
		}
		return true;
	}

	public static Class523_Sub27_Sub6 method1430(int i) {
		return Class36.aClass523_Sub27_Sub6_334;
	}

	public static final void method1431(String string, String string_0_, int i) {
		RSStream class116 = Class537.method8941(-1804278775);
		Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4259, class116.aClass11_1413, 1370050649);
		if (string_0_.length() > 30)
			string_0_ = string_0_.substring(0, 30);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(Class6.method555(string, (byte) 44) + Class6.method555(string_0_, (byte) -8), 730967873);
		class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string_0_, (byte) 82);
		class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string, (byte) 48);
		class116.method1974(class523_sub22, (byte) 31);
	}

	public static int[][] method1432(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, float f, boolean bool, int i_6_) {
		int[][] is = new int[i_1_][i];
		Class523_Sub31_Sub1 class523_sub31_sub1 = new Class523_Sub31_Sub1();
		class523_sub31_sub1.aBool11870 = bool;
		class523_sub31_sub1.anInt11865 = -1387674033 * i_3_;
		class523_sub31_sub1.anInt11866 = 1396233271 * i_4_;
		class523_sub31_sub1.anInt11868 = i_5_ * -563403359;
		class523_sub31_sub1.anInt11869 = (int) (f * 4096.0F) * -898699357;
		class523_sub31_sub1.method18288((byte) -65);
		Class41.method1139(i, i_1_, (short) -26625);
		for (int i_7_ = 0; i_7_ < i_1_; i_7_++)
			class523_sub31_sub1.method18283(i_7_, is[i_7_], 2095896947);
		return is;
	}
}
