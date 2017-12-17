/* Class431 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class431 implements Interface7 {
	Class472 aClass472_4860;
	public static int anInt4861;

	Class431(Class472 class472) {
		aClass472_4860 = class472;
	}

	public int method55() {
		if (aClass472_4860.method7652((byte) 10))
			return 100;
		return aClass472_4860.method7654(894936055);
	}

	public Class52 method53(int i) {
		return Class52.aClass52_718;
	}

	public int method56(short i) {
		if (aClass472_4860.method7652((byte) 10))
			return 100;
		return aClass472_4860.method7654(894936055);
	}

	public int method38() {
		if (aClass472_4860.method7652((byte) 10))
			return 100;
		return aClass472_4860.method7654(894936055);
	}

	public Class52 method54() {
		return Class52.aClass52_718;
	}

	static void method6787(byte i) {
		int i_0_ = 0;
		if (Class449.aClass523_Sub33_4946 != null)
			i_0_ = Class449.aClass523_Sub33_4946.aClass687_Sub42_10612.method17130(-1816107247);
		if (2 == i_0_) {
			int i_1_ = (-1308828521 * client.anInt5668 > 800 ? 800 : client.anInt5668 * -1308828521);
			int i_2_ = (Class391.anInt4023 * 60613197 > 600 ? 600 : Class391.anInt4023 * 60613197);
			Class170.anInt1833 = i_1_ * -1033164529;
			client.anInt5660 = -2061906129 * ((client.anInt5668 * -1308828521 - i_1_) / 2);
			Class254.anInt2742 = -1322449835 * i_2_;
			client.anInt5670 = 0;
		} else if (1 == i_0_) {
			int i_3_ = (-1308828521 * client.anInt5668 > 1024 ? 1024 : -1308828521 * client.anInt5668);
			int i_4_ = (60613197 * Class391.anInt4023 > 768 ? 768 : 60613197 * Class391.anInt4023);
			Class170.anInt1833 = -1033164529 * i_3_;
			client.anInt5660 = -2061906129 * ((client.anInt5668 * -1308828521 - i_3_) / 2);
			Class254.anInt2742 = i_4_ * -1322449835;
			client.anInt5670 = 0;
		} else {
			Class170.anInt1833 = -1908270119 * client.anInt5668;
			client.anInt5660 = 0;
			Class254.anInt2742 = Class391.anInt4023 * -1423353967;
			client.anInt5670 = 0;
		}
	}
}
