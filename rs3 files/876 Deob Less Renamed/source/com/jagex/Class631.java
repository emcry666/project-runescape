/* Class631 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class631 {
	int[] anIntArray8239;
	static Class631 aClass631_8240 = new Class631();

	Class631() {
		anIntArray8239 = new int[120];
		int i = 0;
		for (int i_0_ = 0; i_0_ < 120; i_0_++) {
			int i_1_ = 1 + i_0_;
			int i_2_ = (int) ((double) i_1_ + 300.0 * Math.pow(2.0, (double) i_1_ / 7.0));
			i += i_2_;
			anIntArray8239[i_0_] = i / 4;
		}
		method10332(-2128734397);
	}

	Class631(int[] is) {
		if (null == is)
			throw new NullPointerException();
		anIntArray8239 = is;
		method10332(-2066993044);
	}

	final void method10332(int i) {
		for (int i_3_ = 1; i_3_ < anIntArray8239.length; i_3_++) {
			if (anIntArray8239[i_3_ - 1] < 0)
				throw new IllegalArgumentException(new StringBuilder().append("Negative XP at pos:").append(i_3_ - 1).toString());
			if (anIntArray8239[i_3_] < anIntArray8239[i_3_ - 1])
				throw new IllegalArgumentException(new StringBuilder().append("XP goes backwards at pos:").append(i_3_).toString());
		}
	}

	int method10333(int i, int i_4_) {
		int i_5_ = 0;
		for (int i_6_ = 0; i_6_ < anIntArray8239.length && i >= anIntArray8239[i_6_]; i_6_++)
			i_5_ = 1 + i_6_;
		return i_5_;
	}

	final void method10334() {
		for (int i = 1; i < anIntArray8239.length; i++) {
			if (anIntArray8239[i - 1] < 0)
				throw new IllegalArgumentException(new StringBuilder().append("Negative XP at pos:").append(i - 1).toString());
			if (anIntArray8239[i] < anIntArray8239[i - 1])
				throw new IllegalArgumentException(new StringBuilder().append("XP goes backwards at pos:").append(i).toString());
		}
	}

	int method10335(int i) {
		if (i < 1)
			return 0;
		if (i > anIntArray8239.length)
			i = anIntArray8239.length;
		return anIntArray8239[i - 1];
	}

	final void method10336() {
		for (int i = 1; i < anIntArray8239.length; i++) {
			if (anIntArray8239[i - 1] < 0)
				throw new IllegalArgumentException(new StringBuilder().append("Negative XP at pos:").append(i - 1).toString());
			if (anIntArray8239[i] < anIntArray8239[i - 1])
				throw new IllegalArgumentException(new StringBuilder().append("XP goes backwards at pos:").append(i).toString());
		}
	}

	int method10337(int i) {
		if (i < 1)
			return 0;
		if (i > anIntArray8239.length)
			i = anIntArray8239.length;
		return anIntArray8239[i - 1];
	}

	int method10338(int i) {
		int i_7_ = 0;
		for (int i_8_ = 0; i_8_ < anIntArray8239.length && i >= anIntArray8239[i_8_]; i_8_++)
			i_7_ = 1 + i_8_;
		return i_7_;
	}

	int method10339(int i) {
		int i_9_ = 0;
		for (int i_10_ = 0; i_10_ < anIntArray8239.length && i >= anIntArray8239[i_10_]; i_10_++)
			i_9_ = 1 + i_10_;
		return i_9_;
	}

	int method10340(int i, int i_11_) {
		if (i < 1)
			return 0;
		if (i > anIntArray8239.length)
			i = anIntArray8239.length;
		return anIntArray8239[i - 1];
	}

	static final void method10341(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class39.method1126(class250, class242, class669, -1265743521);
	}

	static final void method10342(Class669 class669, int i) {
		int i_12_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		ItemDefinitions class12 = ((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(i_12_, (byte) -4));
		int i_13_;
		if (class12.aBool161)
			i_13_ = class12.anInt169 * -2003823303;
		else if (class12.aBool121)
			i_13_ = -2083409775 * Class61.aClass633_769.anInt8267;
		else
			i_13_ = -857721843 * Class61.aClass633_769.anInt8268;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_13_;
	}

	static final void method10343(Class669 class669, int i) throws Exception_Sub7 {
		class669.anInt8558 -= -34844996;
		float f = (float) class669.anIntArray8557[1357652815 * class669.anInt8558];
		float f_14_ = (float) (class669.anIntArray8557[1357652815 * class669.anInt8558 + 1]);
		float f_15_ = (float) (class669.anIntArray8557[1357652815 * class669.anInt8558 + 2]);
		float f_16_ = ((float) (class669.anIntArray8557[1357652815 * class669.anInt8558 + 3]) / 1000.0F);
		Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5326(Class437.method6879(f, f_14_, f_15_), f_16_, (byte) 1);
	}

	static final void method10344(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class366.method6326(class250, class242, class669, (byte) 1);
	}

	static final void method10345(Class669 class669, int i) {
		class669.anInt8579 += (-1774429083 * class669.anIntArray8577[class669.anInt8579 * 1180759405]);
	}
}
