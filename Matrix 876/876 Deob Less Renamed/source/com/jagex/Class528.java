/* Class528 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class528 {
	public int[] anIntArray7098;
	public int anInt7099;
	public int[] anIntArray7100;

	public Class528(int i) {
		anInt7099 = 118674555 * i;
		anIntArray7098 = new int[1153952435 * anInt7099];
		anIntArray7100 = new int[anInt7099 * 1153952435];
	}

	public static Class528 method8730(Class472 class472, String string, boolean bool) {
		int i = class472.method7646(string, (byte) -9);
		if (i == -1)
			return new Class528(0);
		byte[] is = class472.method7688(i, 1, 411288156);
		if (null == is)
			return new Class528(0);
		Class523_Sub34 class523_sub34 = new Class523_Sub34(is);
		int i_0_ = class523_sub34.readUnsignedShort(-1824193902);
		Class528 class528 = new Class528(i_0_);
		int i_1_ = 0;
		while (i_1_ < 1153952435 * class528.anInt7099) {
			int i_2_ = class523_sub34.readUnsignedInt((byte) -119);
			int i_3_ = class523_sub34.readUnsignedShort(-1909968678);
			int i_4_ = class523_sub34.readUnsignedByte(1027067870);
			if (bool || 1 != i_4_) {
				class528.anIntArray7098[i_1_] = i_2_;
				class528.anIntArray7100[i_1_] = i_3_;
				i_1_++;
			} else
				class528.anInt7099 -= 118674555;
		}
		return class528;
	}

	public static Class528 method8731(Class472 class472, String string, boolean bool) {
		int i = class472.method7646(string, (byte) -27);
		if (i == -1)
			return new Class528(0);
		byte[] is = class472.method7688(i, 1, 547500154);
		if (null == is)
			return new Class528(0);
		Class523_Sub34 class523_sub34 = new Class523_Sub34(is);
		int i_5_ = class523_sub34.readUnsignedShort(-1695115810);
		Class528 class528 = new Class528(i_5_);
		int i_6_ = 0;
		while (i_6_ < 1153952435 * class528.anInt7099) {
			int i_7_ = class523_sub34.readUnsignedInt((byte) -94);
			int i_8_ = class523_sub34.readUnsignedShort(-1497397855);
			int i_9_ = class523_sub34.readUnsignedByte(-1068632884);
			if (bool || 1 != i_9_) {
				class528.anIntArray7098[i_6_] = i_7_;
				class528.anIntArray7100[i_6_] = i_8_;
				i_6_++;
			} else
				class528.anInt7099 -= 118674555;
		}
		return class528;
	}

	static final void method8732(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class461.aClass218_5122.method3966(-1462991552).method82();
	}

	public static void method8733(int i) {
		if (Class308.anInterface32Array3355 != null) {
			Interface32[] interface32s = Class308.anInterface32Array3355;
			for (int i_10_ = 0; i_10_ < interface32s.length; i_10_++) {
				Interface32 interface32 = interface32s[i_10_];
				interface32.method193((short) -11257);
			}
		}
	}

	public static void method8734(long[] ls, int[] is, int i) {
		Class328_Sub3.method15695(ls, is, 0, ls.length - 1, -1486567546);
	}
}
