/* Class614 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class614 implements Interface75 {
	int anInt8019;
	public static Class614 aClass614_8020;
	static String[] aStringArray8021;
	public static Class614 aClass614_8022;
	int anInt8023;
	static int anInt8024;
	static Class614 aClass614_8025 = new Class614(1, 0);

	public static Class614[] method10056(byte i) {
		return (new Class614[] { aClass614_8020, aClass614_8025, aClass614_8022 });
	}

	Class614(int i, int i_0_) {
		anInt8019 = i * 851179653;
		anInt8023 = -128495751 * i_0_;
	}

	public int method82() {
		return anInt8023 * -1044452663;
	}

	static {
		aClass614_8022 = new Class614(2, 1);
		aClass614_8020 = new Class614(0, 2);
	}

	public int method6() {
		return anInt8023 * -1044452663;
	}

	public int method101() {
		return anInt8023 * -1044452663;
	}

	public static Class614[] method10057() {
		return (new Class614[] { aClass614_8020, aClass614_8025, aClass614_8022 });
	}

	static final void method10058(Class669 class669, int i) {
		client.aClass250_11197 = null;
		client.aClass250_11198 = null;
	}

	static final void method10059(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub10_10619.method16831(1333828415) ? 1 : 0;
	}

	static final void method10060(Class250 class250, Class242 class242, Class669 class669, int i) {
		class250.aStringArray2626 = null;
	}

	static final void method10061(long l) {
		Class437 class437 = (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.method10569().aClass437_4862);
		int i = -1492355445 * client.anInt11087 + (int) class437.aFloat4903;
		int i_1_ = client.anInt11089 * 978919341 + (int) class437.aFloat4905;
		if (Class21.anInt215 * 1996014845 - i < -2000 || 1996014845 * Class21.anInt215 - i > 2000 || Class194_Sub8.anInt9906 * 1035887883 - i_1_ < -2000 || Class194_Sub8.anInt9906 * 1035887883 - i_1_ > 2000) {
			Class21.anInt215 = -464488363 * i;
			Class194_Sub8.anInt9906 = i_1_ * 1879522979;
		}
		if (i != 1996014845 * Class21.anInt215) {
			int i_2_ = i - Class21.anInt215 * 1996014845;
			int i_3_ = (int) ((long) i_2_ * l / 320L);
			if (i_2_ > 0) {
				if (i_3_ == 0)
					i_3_ = 1;
				else if (i_3_ > i_2_)
					i_3_ = i_2_;
			} else if (0 == i_3_)
				i_3_ = -1;
			else if (i_3_ < i_2_)
				i_3_ = i_2_;
			Class21.anInt215 += i_3_ * -464488363;
		}
		if (i_1_ != Class194_Sub8.anInt9906 * 1035887883) {
			int i_4_ = i_1_ - 1035887883 * Class194_Sub8.anInt9906;
			int i_5_ = (int) (l * (long) i_4_ / 320L);
			if (i_4_ > 0) {
				if (i_5_ == 0)
					i_5_ = 1;
				else if (i_5_ > i_4_)
					i_5_ = i_4_;
			} else if (0 == i_5_)
				i_5_ = -1;
			else if (i_5_ < i_4_)
				i_5_ = i_4_;
			Class194_Sub8.anInt9906 += i_5_ * 1879522979;
		}
		client.aFloat11129 += client.aFloat11177 * (float) l / 6.0F;
		client.aFloat11214 += client.aFloat11106 * (float) l / 6.0F;
		Class452.method7315((byte) -34);
	}

	static final void method10062(Class178 class178, int i, int i_6_, int i_7_, int i_8_, int i_9_) {
		class178.method3378(i, i_6_, i + i_7_, i_6_ + i_8_);
		class178.method3354(i, i_6_, i_7_, i_8_, -16777216, (byte) 95);
		if (Class534_Sub1.anInt10795 * -1547856073 >= 100) {
			float f = ((float) Class534_Sub1.anInt7138 / (float) Class534_Sub1.anInt7160);
			int i_10_ = i_7_;
			int i_11_ = i_8_;
			if (f < 1.0F)
				i_11_ = (int) ((float) i_7_ * f);
			else
				i_10_ = (int) ((float) i_8_ / f);
			i += (i_7_ - i_10_) / 2;
			i_6_ += (i_8_ - i_11_) / 2;
			if (null == Class523_Sub27_Sub1.aClass148_11328 || Class523_Sub27_Sub1.aClass148_11328.method2504() != i_10_ || Class523_Sub27_Sub1.aClass148_11328.method2428() != i_11_) {
				Class534_Sub1.aClass209_7184 = Class534_Sub1.aClass209_7183;
				Class534_Sub1.method8823(Class534_Sub1.anInt7168, (Class534_Sub1.anInt7159 + Class534_Sub1.anInt7138), (Class534_Sub1.anInt7168 + Class534_Sub1.anInt7160), Class534_Sub1.anInt7159, i, i_6_, i_10_ + i, i_11_ + i_6_);
				Class534_Sub1.method8824(class178, false, false, client.aBool11157, true);
				class178.method3206();
				Class523_Sub27_Sub1.aClass148_11328 = class178.method3376(i, i_6_, i_10_, i_11_, true);
			}
			Class523_Sub27_Sub1.aClass148_11328.method2435(i, i_6_);
			int i_12_ = (i_10_ * (1888193785 * Class686.anInt8669) / Class534_Sub1.anInt7160);
			int i_13_ = (i_11_ * (Class239.anInt2446 * -1957152281) / Class534_Sub1.anInt7138);
			int i_14_ = ((Class333_Sub2.anInt10000 * -1465459211 * i_10_ / Class534_Sub1.anInt7160) + i);
			int i_15_ = (i_6_ + i_11_ - (i_11_ * (1137866751 * Class322_Sub1.anInt10068) / Class534_Sub1.anInt7138) - i_13_);
			int i_16_ = -1996554240;
			if (Class681.aClass681_8641 == client.aClass681_11284)
				i_16_ = -1996488705;
			class178.method3193(i_14_, i_15_, i_12_, i_13_, i_16_, 1);
			class178.method3083(i_14_, i_15_, i_12_, i_13_, i_16_, 0);
			for (Class523_Sub32 class523_sub32 = ((Class523_Sub32) Class534_Sub1.aClass708_7194.method14240(1468678881)); null != class523_sub32; class523_sub32 = ((Class523_Sub32) Class534_Sub1.aClass708_7194.method14244((byte) 65))) {
				Class239 class239 = (Class239) (Class534_Sub1.aClass53_Sub1_7206.getDefinition(class523_sub32.anInt10578 * -1039292053, (byte) -55));
				if (Class535.method8920(class239, 1135056152)) {
					Class25 class25 = (Class25) (Class534_Sub1.aHashMap10786.get(Integer.valueOf(class523_sub32.anInt10578 * -1039292053)));
					if (null == class25)
						class25 = (Class25) (Class534_Sub1.aHashMap10787.get(Integer.valueOf(class239.anInt2443 * 1444609703)));
					if (class25 != null) {
						int i_17_;
						if (2071802553 * class25.anInt245 > 1552389189 * Class534_Sub1.anInt10789 / 2)
							i_17_ = ((Class534_Sub1.anInt10789 * 722251963 - class25.anInt245 * 28673607) / (Class534_Sub1.anInt10789 * 1552389189));
						else
							i_17_ = (class25.anInt245 * 28673607 / (Class534_Sub1.anInt10789 * 1552389189));
						int i_18_ = ((i_10_ * (class523_sub32.anInt10580 * -1808941705) / Class534_Sub1.anInt7160) + i);
						int i_19_ = (((Class534_Sub1.anInt7138 - -1727058043 * class523_sub32.anInt10581) * i_11_ / Class534_Sub1.anInt7138) + i_6_);
						class178.method3354(i_18_ - 2, i_19_ - 2, 4, 4, i_17_ << 24 | 0xffff00, (byte) 105);
					}
				}
			}
			Class534_Sub1.aClass209_7183.method3772(5, (byte) -87);
		}
	}
}
