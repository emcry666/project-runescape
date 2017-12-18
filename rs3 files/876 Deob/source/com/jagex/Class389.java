/* Class389 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Dimension;

public class Class389 {
	static Class389 aClass389_4016;
	static Class389 aClass389_4017;
	static Class389 aClass389_4018 = new Class389();

	Class389() {
		/* empty */
	}

	static {
		aClass389_4016 = new Class389();
		aClass389_4017 = new Class389();
	}

	public int method6473(int i, int i_0_, int i_1_) {
		int i_2_ = (-495986435 * Class254.anInt2742 > i_0_ ? Class254.anInt2742 * -495986435 : i_0_);
		if (aClass389_4018 == this)
			return 0;
		if (aClass389_4017 == this)
			return i_2_ - i;
		if (aClass389_4016 == this)
			return (i_2_ - i) / 2;
		return 0;
	}

	public int method6474(int i, int i_3_) {
		int i_4_ = (-495986435 * Class254.anInt2742 > i_3_ ? Class254.anInt2742 * -495986435 : i_3_);
		if (aClass389_4018 == this)
			return 0;
		if (aClass389_4017 == this)
			return i_4_ - i;
		if (aClass389_4016 == this)
			return (i_4_ - i) / 2;
		return 0;
	}

	public static void method6475(Class523_Sub39 class523_sub39, int i) {
		if (!BaseVarType.method7761(client.anInt11136 * -2020118759, (byte) 35))
			class523_sub39.method16523((byte) 23);
		else
			Class644.aClass637_Sub2_8341.method10455(class523_sub39, -2085917657);
	}

	static final void method6476(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class10.method638(class250, class669, 427554287);
	}

	static int method6477(Class611_Sub1 class611_sub1, Class611_Sub1 class611_sub1_5_, int i, boolean bool, int i_6_) {
		if (1 == i) {
			int i_7_ = -1102045477 * class611_sub1.anInt8012;
			int i_8_ = -1102045477 * class611_sub1_5_.anInt8012;
			if (!bool) {
				if (-1 == i_7_)
					i_7_ = 2001;
				if (i_8_ == -1)
					i_8_ = 2001;
			}
			return i_7_ - i_8_;
		}
		if (i == 2)
			return Class298_Sub1.method15554(class611_sub1.method16195(1864678615), class611_sub1_5_.method16195(1544162321), Class53_Sub20.aClass668_10979, (byte) -76);
		if (i == 3) {
			if (class611_sub1.aString10587.equals("-")) {
				if (class611_sub1_5_.aString10587.equals("-"))
					return 0;
				return bool ? -1 : 1;
			}
			if (class611_sub1_5_.aString10587.equals("-"))
				return bool ? 1 : -1;
			return Class298_Sub1.method15554(class611_sub1.aString10587, class611_sub1_5_.aString10587, Class53_Sub20.aClass668_10979, (byte) -43);
		}
		if (i == 4)
			return (class611_sub1.method10020((short) 229) ? class611_sub1_5_.method10020((short) 229) ? 0 : 1 : class611_sub1_5_.method10020((short) 229) ? -1 : 0);
		if (5 == i)
			return (class611_sub1.method10023(984784293) ? class611_sub1_5_.method10023(938237172) ? 0 : 1 : class611_sub1_5_.method10023(778284814) ? -1 : 0);
		if (6 == i)
			return (class611_sub1.method10024((byte) 8) ? class611_sub1_5_.method10024((byte) 81) ? 0 : 1 : class611_sub1_5_.method10024((byte) -33) ? -1 : 0);
		if (7 == i)
			return (class611_sub1.method10022((byte) -60) ? class611_sub1_5_.method10022((byte) -11) ? 0 : 1 : class611_sub1_5_.method10022((byte) -29) ? -1 : 0);
		if (i == 8) {
			int i_9_ = -1614476621 * class611_sub1.anInt10585;
			int i_10_ = -1614476621 * class611_sub1_5_.anInt10585;
			if (bool) {
				if (1000 == i_9_)
					i_9_ = -1;
				if (1000 == i_10_)
					i_10_ = -1;
			} else {
				if (i_9_ == -1)
					i_9_ = 1000;
				if (-1 == i_10_)
					i_10_ = 1000;
			}
			return i_9_ - i_10_;
		}
		return (class611_sub1.anInt10588 * 1568680265 - 1568680265 * class611_sub1_5_.anInt10588);
	}

	static void method6478(RSBuffer class523_sub34, byte i) {
		for (int i_11_ = 0; i_11_ < Class595.anInt7827 * 2004567773; i_11_++) {
			int i_12_ = class523_sub34.readUnsignedSmart(368514876);
			int i_13_ = class523_sub34.readUnsignedShort(-1131279133);
			if (65535 == i_13_)
				i_13_ = -1;
			if (null != Class595.aClass611_Sub1Array7823[i_12_])
				Class595.aClass611_Sub1Array7823[i_12_].anInt8012 = i_13_ * 1866771795;
		}
	}

	static void method6479(short i) {
		if (Class31.aClass178_303.method3035()) {
			Class31.aClass178_303.method3260(Class523_Sub18_Sub8.aCanvas11689, -1249941798);
			Class513.method8582((byte) 105);
			Dimension dimension = Class523_Sub18_Sub8.aCanvas11689.getSize();
			Class31.aClass178_303.method3041(Class523_Sub18_Sub8.aCanvas11689, dimension.width, dimension.height, 583876028);
			Class31.aClass178_303.method3044(Class523_Sub18_Sub8.aCanvas11689, -1162517916);
		} else
			Class535.method8921(Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) -34), false, (byte) -26);
		Class676_Sub1.method16781(-1240802613);
	}

	public static int method6480(int i) {
		if ((double) Class534_Sub1.aFloat7155 == 2.0)
			return 25;
		if (3.0 == (double) Class534_Sub1.aFloat7155)
			return 37;
		if ((double) Class534_Sub1.aFloat7155 == 4.0)
			return 50;
		if (6.0 == (double) Class534_Sub1.aFloat7155)
			return 75;
		if ((double) Class534_Sub1.aFloat7155 == 8.0)
			return 100;
		return 200;
	}
}
