/* Class302 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;

public class Class302 {
	float[] aFloatArray3331;
	public int[] anIntArray3332;
	public short[] aShortArray3333;
	int[][] anIntArrayArray3334;
	int[][] anIntArrayArray3335;
	public short[] aShortArray3336;
	public long aLong3337;

	public Class302(long l, int[] is, float[] fs, int[][] is_0_, int[][] is_1_, short[] is_2_, short[] is_3_) {
		aLong3337 = 1634705471692094829L * l;
		anIntArray3332 = is;
		aFloatArray3331 = fs;
		anIntArrayArray3334 = is_0_;
		anIntArrayArray3335 = is_1_;
		aShortArray3336 = is_2_;
		aShortArray3333 = is_3_;
	}

	public Class302(NPCDefinition class300, boolean bool) {
		if (bool) {
			anIntArray3332 = new int[class300.anIntArray3255.length];
			aFloatArray3331 = new float[class300.anIntArray3255.length];
			anIntArrayArray3334 = new int[class300.anIntArray3255.length][3];
			anIntArrayArray3335 = new int[class300.anIntArray3255.length][3];
			System.arraycopy(class300.anIntArray3255, 0, anIntArray3332, 0, anIntArray3332.length);
		} else {
			anIntArray3332 = new int[class300.anIntArray3256.length];
			aFloatArray3331 = new float[class300.anIntArray3256.length];
			anIntArrayArray3334 = new int[class300.anIntArray3256.length][3];
			anIntArrayArray3335 = new int[class300.anIntArray3256.length][3];
			System.arraycopy(class300.anIntArray3256, 0, anIntArray3332, 0, anIntArray3332.length);
		}
		if (null != class300.aShortArray3317) {
			aShortArray3336 = new short[class300.aShortArray3317.length];
			System.arraycopy(class300.aShortArray3317, 0, aShortArray3336, 0, aShortArray3336.length);
		}
		if (class300.aShortArray3263 != null) {
			aShortArray3333 = new short[class300.aShortArray3263.length];
			System.arraycopy(class300.aShortArray3263, 0, aShortArray3333, 0, aShortArray3333.length);
		}
	}

	static final void method5528(Class669 class669, int i) {
		int i_4_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_4_, -610592062);
		Class242 class242 = Class31.aClass242Array302[i_4_ >> 16];
		Class170.method2892(class250, class242, class669, ((class669.aClass523_Sub19_8569 == Class673.aClass523_Sub19_8611) ? PacketsDecoder.aClass233_2370 : PacketsDecoder.aClass233_2372), (byte) 0);
	}

	static final void method5529(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = QuickChatStringType.aClass149_8300 != null ? 1 : 0;
	}

	static final void method5530(Class669 class669, int i) {
		int i_5_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub4_10625.method13890(i_5_, 1945233588);
	}

	static void method5531(Class178 class178, byte i) {
		if (Class70.aClass708_795.method14246((byte) 13) != 0) {
			if (Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) -29) == 0) {
				for (Class523_Sub5 class523_sub5 = ((Class523_Sub5) Class70.aClass708_795.method14240(616031400)); class523_sub5 != null; class523_sub5 = ((Class523_Sub5) Class70.aClass708_795.method14244((byte) -13))) {
					Class523_Sub37.aClass53_Sub8_10677.method17182(class178, class178, -1888363909 * class523_sub5.anInt10399, class523_sub5.anInt10398 * 1682708439, -171774393 * class523_sub5.anInt10402, 152038595 * class523_sub5.anInt10400, false, false, 61633 * class523_sub5.anInt10401, Class34.aClass164_318, (class523_sub5.aBool10397 ? (Class241.player.aClass623_12183) : null), Class523_Sub11.aClass625_10427, (short) 507);
					class523_sub5.method8661(607052656);
				}
				Class676_Sub1.method16781(-1240802613);
			} else {
				if (null == Class70.aClass178_793) {
					Canvas canvas = new Canvas();
					canvas.setSize(36, 32);
					Class70.aClass178_793 = Class236.method4290(0, canvas, Class174_Sub1.aClass172_9785, Class333.anInterface25_3512, Class590.aClass390_7803, Class295.aClass399_3177, Class6.aClass397_48, Class519.aClass472_7058, 0, (byte) -119);
					Class70.aClass164_794 = (Class70.aClass178_793.method3111(Class696.method14010(Class272.aClass472_2886, (-1386279717 * Class34.anInt315), 0, 2145052977), Class166.method2672(Class523_Sub8.aClass472_10406, -1386279717 * Class34.anInt315, 0), true));
				}
				for (Class523_Sub5 class523_sub5 = ((Class523_Sub5) Class70.aClass708_795.method14240(1399639949)); null != class523_sub5; class523_sub5 = ((Class523_Sub5) Class70.aClass708_795.method14244((byte) 105))) {
					Class523_Sub37.aClass53_Sub8_10677.method17182(Class70.aClass178_793, class178, -1888363909 * class523_sub5.anInt10399, class523_sub5.anInt10398 * 1682708439, -171774393 * class523_sub5.anInt10402, 152038595 * class523_sub5.anInt10400, false, false, class523_sub5.anInt10401 * 61633, Class70.aClass164_794, (class523_sub5.aBool10397 ? (Class241.player.aClass623_12183) : null), Class523_Sub11.aClass625_10427, (short) 507);
					class523_sub5.method8661(607052656);
				}
			}
		}
	}

	static final void method5532(Class669 class669, byte i) {
		CharSequence charsequence = ((CharSequence) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]));
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = Class406.method6615(charsequence, -619741157);
	}

	public static void method5533(int i, byte i_6_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(7, (long) i);
		class523_sub27_sub7.method17962((byte) 90);
	}
}
