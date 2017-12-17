/* Class447 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;

import jaclib.ping.Ping;

public class Class447 {
	static Class30[] aClass30Array4934;
	static int anInt4935 = 0;
	static int anInt4936 = 0;
	public static Class53_Sub9 aClass53_Sub9_4937;

	Class447() throws Throwable {
		throw new Error();
	}

	public static int method7242() {
		if (anInt4935 * 28972269 == 0) {
			Class30.aClass30_277.method891(new Class425("jaclib"), -1993029467);
			if (Class30.aClass30_277.method887(910930411).method56((short) 256) != 100)
				return 1;
			if (!((Class425) Class30.aClass30_277.method887(1195318111)).method6734(-538711477) && !Class268.method4897(-1976457788)) {
				try {
					Class472.aclient5375.method8411(-1159446185);
					Class529.method8766(-1939709255);
					Ping.init();
				} catch (Exception_Sub6 exception_sub6) {
					Class268.method4905(Class29.aClass29_262, exception_sub6.aString11383, exception_sub6.anInt11384 * -259554559, exception_sub6.getCause(), -8810796);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			anInt4935 = 1305962725;
		}
		if (anInt4935 * 28972269 == 1) {
			aClass30Array4934 = Class30.method879(691933456);
			Class30.aClass30_281.method891(new Class431(Class112.aClass472_1350), -695793371);
			Class30.aClass30_267.method891(new Class425("jaggl"), -1079639849);
			Class425 class425 = new Class425("jagdx");
			if (!Class611.aString8013.startsWith("win"))
				class425.method6737((byte) 0);
			Class30.aClass30_268.method891(class425, -434639913);
			Class30.aClass30_269.method891(new Class425("sw3d"), -804279042);
			Class30.aClass30_270.method891(new Class425("hw3d"), -1989025984);
			Class30.aClass30_284.method891(new Class431(Class519.aClass472_7058), -322835556);
			Class30.aClass30_265.method891(new Class431(Class518.aClass472_7057), -1235703745);
			Class30.aClass30_273.method891(new Class431(Class217.aClass472_2302), -319171806);
			Class30.aClass30_274.method891(new Class431(Class195.aClass472_2191), -2044718699);
			Class30.aClass30_275.method891(new Class431(Class555.aClass472_7477), -2116624838);
			Class30.aClass30_286.method891(new Class431(Class598.aClass472_7841), -1650288542);
			Class30.aClass30_276.method891(new Class431(Class386.aClass472_4007), -1229422506);
			Class30.aClass30_278.method891(new Class431(Class23.aClass472_235), -287114830);
			Class30.aClass30_279.method891(new Class431(Class418.aClass472_4698), -877435074);
			Class30.aClass30_280.method891(new Class431(Class312_Sub2_Sub1.aClass472_11592), -1838773015);
			Class30.aClass30_290.method891(new Class431(Class700.aClass472_8779), -1155730278);
			Class30.aClass30_272.method891(new Class431(Class321.aClass472_3439), -1276070288);
			Class30.aClass30_283.method891(new Class431(Class229.aClass472_2363), -1776170434);
			Class30.aClass30_271.method891(new Class431(Class534_Sub1.aClass472_10801), -604461608);
			Class30.aClass30_287.method891(new Class431(Class673.aClass472_8612), -1135194808);
			Class30.aClass30_266.method891(new Class428((Class502.aClass472_5590), "huffman"), -1087211802);
			Class30.aClass30_282.method891(new Class431(Class55.aClass472_737), -1292751153);
			Class30.aClass30_288.method891(new Class431(Class515.aClass472_7045), -1238813713);
			Class30.aClass30_289.method891(new Class431(Class272.aClass472_2886), -1890176173);
			Class30.aClass30_285.method891(new Class436((Class511.aClass472_5761), 0), -475780752);
			for (int i = 0; i < aClass30Array4934.length; i++) {
				if (aClass30Array4934[i].method887(1753500718) == null)
					throw new RuntimeException();
			}
			int i = 0;
			Class30[] class30s = aClass30Array4934;
			for (int i_0_ = 0; i_0_ < class30s.length; i_0_++) {
				Class30 class30 = class30s[i_0_];
				int i_1_ = class30.method878(7714931);
				int i_2_ = class30.method887(1075975779).method56((short) 256);
				i += i_2_ * i_1_ / 100;
			}
			anInt4936 = i * -159275323;
			anInt4935 = -1683041846;
		}
		if (null == aClass30Array4934)
			return 100;
		int i = 0;
		int i_3_ = 0;
		boolean bool = true;
		Class30[] class30s = aClass30Array4934;
		for (int i_4_ = 0; i_4_ < class30s.length; i_4_++) {
			Class30 class30 = class30s[i_4_];
			int i_5_ = class30.method878(-1885343923);
			int i_6_ = class30.method887(270979175).method56((short) 256);
			if (i_6_ < 100)
				bool = false;
			i += i_5_;
			i_3_ += i_6_ * i_5_ / 100;
		}
		if (bool)
			aClass30Array4934 = null;
		i_3_ -= anInt4936 * 262727693;
		i -= anInt4936 * 262727693;
		int i_7_ = i > 0 ? i_3_ * 100 / i : 100;
		if (!bool && i_7_ > 99)
			i_7_ = 99;
		return i_7_;
	}

	public static void method7243() {
		anInt4935 = 0;
		anInt4936 = 0;
	}

	public static TwitchWebcamDevice method7244(int i, int i_8_) {
		if (Class569.aTwitchWebcamDeviceArray7648 == null)
			return null;
		for (int i_9_ = 0; i_9_ < Class569.aTwitchWebcamDeviceArray7648.length; i_9_++) {
			if ((Class569.aTwitchWebcamDeviceArray7648[i_9_].anInt1136 * -2015039365) == i)
				return Class569.aTwitchWebcamDeviceArray7648[i_9_];
		}
		return null;
	}

	public static void method7245(long[] ls, Object[] objects, byte i) {
		Class406.method6610(ls, objects, 0, ls.length - 1, (byte) 80);
	}

	static final boolean method7246(int i, int i_10_) {
		return i < 7;
	}

	public static void method7247(boolean bool, int i) {
		if (null == Class661.aClass289_8509)
			Class181.method3541(1683229132);
		if (bool)
			Class661.aClass289_8509.method5170(-2112407191);
	}
}
