/* Class590 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class590 implements Interface20 {
	static final long aLong7796 = 4611686018427387904L;
	static final long aLong7797 = 1L;
	static final long aLong7798 = 4611686018427387903L;
	static final long aLong7799 = 500L;
	int[] anIntArray7800;
	int[] anIntArray7801;
	Class14 aClass14_7802 = new Class14(128);
	public static Class390 aClass390_7803;

	public Object method127(Class159 class159) {
		throw new UnsupportedOperationException();
	}

	public int method9754(boolean bool, byte i) {
		long l = TimeUtils.getCurrentTimeMilliseconds(1516375036);
		for (Class523_Sub7 class523_sub7 = (Class523_Sub7) (bool ? aClass14_7802.method735(-380907255) : aClass14_7802.method749(1259899114)); class523_sub7 != null; class523_sub7 = (Class523_Sub7) aClass14_7802.method749(2119269868)) {
			if ((class523_sub7.aLong10404 * -2287843494007345997L & 0x3fffffffffffffffL) < l) {
				if (0L != (-2287843494007345997L * class523_sub7.aLong10404 & 0x4000000000000000L)) {
					int i_0_ = (int) (class523_sub7.aLong7065 * 1055205983951172633L);
					anIntArray7801[i_0_] = anIntArray7800[i_0_];
					class523_sub7.method8661(607052656);
					return i_0_;
				}
				class523_sub7.method8661(607052656);
			}
		}
		return -1;
	}

	public void method9755(int i) {
		for (int i_1_ = 0; i_1_ < Class669.aClass98_Sub1_Sub1_8582.method69(-1855965838); i_1_++) {
			Class159_Sub2 class159_sub2 = ((Class159_Sub2) Class669.aClass98_Sub1_Sub1_8582.getDefinition(i_1_, (byte) -76));
			if (null != class159_sub2) {
				anIntArray7800[i_1_] = 0;
				anIntArray7801[i_1_] = 0;
			}
		}
		aClass14_7802 = new Class14(128);
	}

	public int method94(Class159 class159, int i) {
		return anIntArray7801[-80020449 * class159.anInt1754];
	}

	public void method112(Class159 class159, int i, byte i_2_) {
		anIntArray7801[-80020449 * class159.anInt1754] = i;
		Class523_Sub7 class523_sub7 = ((Class523_Sub7) aClass14_7802.getFromIndex((long) (class159.anInt1754 * -80020449)));
		if (null != class523_sub7)
			class523_sub7.aLong10404 = (TimeUtils.getCurrentTimeMilliseconds(1516375036) + 500L) * 6503115775260729979L;
		else {
			class523_sub7 = new Class523_Sub7(TimeUtils.getCurrentTimeMilliseconds(1516375036) + 500L);
			aClass14_7802.method738(class523_sub7, (long) (-80020449 * class159.anInt1754));
		}
	}

	public int method9756(boolean bool) {
		long l = TimeUtils.getCurrentTimeMilliseconds(1516375036);
		for (Class523_Sub7 class523_sub7 = (Class523_Sub7) (bool ? aClass14_7802.method735(-380907255) : aClass14_7802.method749(-1776353375)); class523_sub7 != null; class523_sub7 = (Class523_Sub7) aClass14_7802.method749(1684666814)) {
			if ((class523_sub7.aLong10404 * -2287843494007345997L & 0x3fffffffffffffffL) < l) {
				if (0L != (-2287843494007345997L * class523_sub7.aLong10404 & 0x4000000000000000L)) {
					int i = (int) (class523_sub7.aLong7065 * 1055205983951172633L);
					anIntArray7801[i] = anIntArray7800[i];
					class523_sub7.method8661(607052656);
					return i;
				}
				class523_sub7.method8661(607052656);
			}
		}
		return -1;
	}

	public int method93(VarBitDefinitions class309, int i) {
		return class309.method5604(anIntArray7801[(class309.aClass159_3367.anInt1754) * -80020449], -1526130670);
	}

	public void method117(VarBitDefinitions class309, int i, int i_3_) throws Exception_Sub2 {
		int i_4_ = class309.method5602(anIntArray7801[-80020449 * (class309.aClass159_3367.anInt1754)], i, (byte) 37);
		method112(class309.aClass159_3367, i_4_, (byte) 50);
	}

	public void method9757(VarBitDefinitions class309, int i, int i_5_) {
		try {
			int i_6_ = class309.method5602(anIntArray7800[(class309.aClass159_3367.anInt1754) * -80020449], i, (byte) 113);
			method9763(class309.aClass159_3367, i_6_, -1806202437);
		} catch (Exception_Sub2 exception_sub2) {
			/* empty */
		}
	}

	public long method111(Class159 class159, byte i) {
		throw new UnsupportedOperationException();
	}

	public void method114(Class159 class159, long l) {
		throw new UnsupportedOperationException();
	}

	public void method9758(VarBitDefinitions class309, int i) {
		try {
			int i_7_ = class309.method5602(anIntArray7800[(class309.aClass159_3367.anInt1754) * -80020449], i, (byte) 65);
			method9763(class309.aClass159_3367, i_7_, -1806202437);
		} catch (Exception_Sub2 exception_sub2) {
			/* empty */
		}
	}

	public int method9759(boolean bool) {
		long l = TimeUtils.getCurrentTimeMilliseconds(1516375036);
		for (Class523_Sub7 class523_sub7 = (Class523_Sub7) (bool ? aClass14_7802.method735(-380907255) : aClass14_7802.method749(149605963)); class523_sub7 != null; class523_sub7 = (Class523_Sub7) aClass14_7802.method749(560913581)) {
			if ((class523_sub7.aLong10404 * -2287843494007345997L & 0x3fffffffffffffffL) < l) {
				if (0L != (-2287843494007345997L * class523_sub7.aLong10404 & 0x4000000000000000L)) {
					int i = (int) (class523_sub7.aLong7065 * 1055205983951172633L);
					anIntArray7801[i] = anIntArray7800[i];
					class523_sub7.method8661(607052656);
					return i;
				}
				class523_sub7.method8661(607052656);
			}
		}
		return -1;
	}

	public int method95(Class159 class159) {
		return anIntArray7801[-80020449 * class159.anInt1754];
	}

	public int method96(Class159 class159) {
		return anIntArray7801[-80020449 * class159.anInt1754];
	}

	public int method97(VarBitDefinitions class309) {
		return class309.method5604(anIntArray7801[(class309.aClass159_3367.anInt1754) * -80020449], -949178538);
	}

	public void method9760(Class159 class159, int i) {
		anIntArray7800[-80020449 * class159.anInt1754] = i;
		Class523_Sub7 class523_sub7 = ((Class523_Sub7) aClass14_7802.getFromIndex((long) (-80020449 * class159.anInt1754)));
		if (class523_sub7 != null) {
			if (4611686018427387905L != class523_sub7.aLong10404 * -2287843494007345997L)
				class523_sub7.aLong10404 = (TimeUtils.getCurrentTimeMilliseconds(1516375036) + 500L | 0x4000000000000000L) * 6503115775260729979L;
		} else {
			class523_sub7 = new Class523_Sub7(4611686018427387905L);
			aClass14_7802.method738(class523_sub7, (long) (class159.anInt1754 * -80020449));
		}
	}

	public void method128(Class159 class159, int i) {
		anIntArray7801[-80020449 * class159.anInt1754] = i;
		Class523_Sub7 class523_sub7 = ((Class523_Sub7) aClass14_7802.getFromIndex((long) (class159.anInt1754 * -80020449)));
		if (null != class523_sub7)
			class523_sub7.aLong10404 = (TimeUtils.getCurrentTimeMilliseconds(1516375036) + 500L) * 6503115775260729979L;
		else {
			class523_sub7 = new Class523_Sub7(TimeUtils.getCurrentTimeMilliseconds(1516375036) + 500L);
			aClass14_7802.method738(class523_sub7, (long) (-80020449 * class159.anInt1754));
		}
	}

	public void method125(VarBitDefinitions class309, int i) throws Exception_Sub2 {
		int i_8_ = class309.method5602(anIntArray7801[-80020449 * (class309.aClass159_3367.anInt1754)], i, (byte) 68);
		method112(class309.aClass159_3367, i_8_, (byte) -62);
	}

	public long method121(Class159 class159) {
		throw new UnsupportedOperationException();
	}

	public void method115(Class159 class159, long l) {
		throw new UnsupportedOperationException();
	}

	public void method123(Class159 class159, long l) {
		throw new UnsupportedOperationException();
	}

	public long method120(Class159 class159) {
		throw new UnsupportedOperationException();
	}

	public void method122(VarBitDefinitions class309, int i) throws Exception_Sub2 {
		int i_9_ = class309.method5602(anIntArray7801[-80020449 * (class309.aClass159_3367.anInt1754)], i, (byte) 101);
		method112(class309.aClass159_3367, i_9_, (byte) 43);
	}

	public Class590() {
		anIntArray7800 = new int[Class669.aClass98_Sub1_Sub1_8582.method69(-1575101613)];
		anIntArray7801 = new int[Class669.aClass98_Sub1_Sub1_8582.method69(-1616551156)];
	}

	public Object method129(Class159 class159) {
		throw new UnsupportedOperationException();
	}

	public void method124(Class159 class159, long l) {
		throw new UnsupportedOperationException();
	}

	public void method118(Class159 class159, Object object) {
		throw new UnsupportedOperationException();
	}

	public void method126(Class159 class159, int i) {
		anIntArray7801[-80020449 * class159.anInt1754] = i;
		Class523_Sub7 class523_sub7 = ((Class523_Sub7) aClass14_7802.getFromIndex((long) (class159.anInt1754 * -80020449)));
		if (null != class523_sub7)
			class523_sub7.aLong10404 = (TimeUtils.getCurrentTimeMilliseconds(1516375036) + 500L) * 6503115775260729979L;
		else {
			class523_sub7 = new Class523_Sub7(TimeUtils.getCurrentTimeMilliseconds(1516375036) + 500L);
			aClass14_7802.method738(class523_sub7, (long) (-80020449 * class159.anInt1754));
		}
	}

	public void method113(Class159 class159, Object object) {
		throw new UnsupportedOperationException();
	}

	public void method9761(VarBitDefinitions class309, int i) {
		try {
			int i_10_ = class309.method5602(anIntArray7800[(class309.aClass159_3367.anInt1754) * -80020449], i, (byte) 14);
			method9763(class309.aClass159_3367, i_10_, -1806202437);
		} catch (Exception_Sub2 exception_sub2) {
			/* empty */
		}
	}

	public void method9762() {
		for (int i = 0; i < Class669.aClass98_Sub1_Sub1_8582.method69(-1935942082); i++) {
			Class159_Sub2 class159_sub2 = ((Class159_Sub2) Class669.aClass98_Sub1_Sub1_8582.getDefinition(i, (byte) -119));
			if (null != class159_sub2) {
				anIntArray7800[i] = 0;
				anIntArray7801[i] = 0;
			}
		}
		aClass14_7802 = new Class14(128);
	}

	public Object method119(Class159 class159, int i) {
		throw new UnsupportedOperationException();
	}

	public void method9763(Class159 class159, int i, int i_11_) {
		anIntArray7800[-80020449 * class159.anInt1754] = i;
		Class523_Sub7 class523_sub7 = ((Class523_Sub7) aClass14_7802.getFromIndex((long) (-80020449 * class159.anInt1754)));
		if (class523_sub7 != null) {
			if (4611686018427387905L != class523_sub7.aLong10404 * -2287843494007345997L)
				class523_sub7.aLong10404 = (TimeUtils.getCurrentTimeMilliseconds(1516375036) + 500L | 0x4000000000000000L) * 6503115775260729979L;
		} else {
			class523_sub7 = new Class523_Sub7(4611686018427387905L);
			aClass14_7802.method738(class523_sub7, (long) (class159.anInt1754 * -80020449));
		}
	}

	public void method9764() {
		for (int i = 0; i < Class669.aClass98_Sub1_Sub1_8582.method69(-1833023770); i++) {
			Class159_Sub2 class159_sub2 = ((Class159_Sub2) Class669.aClass98_Sub1_Sub1_8582.getDefinition(i, (byte) 82));
			if (null != class159_sub2) {
				anIntArray7800[i] = 0;
				anIntArray7801[i] = 0;
			}
		}
		aClass14_7802 = new Class14(128);
	}

	public void method9765(Class159 class159, int i) {
		anIntArray7800[-80020449 * class159.anInt1754] = i;
		Class523_Sub7 class523_sub7 = ((Class523_Sub7) aClass14_7802.getFromIndex((long) (-80020449 * class159.anInt1754)));
		if (class523_sub7 != null) {
			if (4611686018427387905L != class523_sub7.aLong10404 * -2287843494007345997L)
				class523_sub7.aLong10404 = (TimeUtils.getCurrentTimeMilliseconds(1516375036) + 500L | 0x4000000000000000L) * 6503115775260729979L;
		} else {
			class523_sub7 = new Class523_Sub7(4611686018427387905L);
			aClass14_7802.method738(class523_sub7, (long) (class159.anInt1754 * -80020449));
		}
	}

	public void method9766() {
		for (int i = 0; i < Class669.aClass98_Sub1_Sub1_8582.method69(-1838544440); i++) {
			Class159_Sub2 class159_sub2 = ((Class159_Sub2) Class669.aClass98_Sub1_Sub1_8582.getDefinition(i, (byte) 76));
			if (null != class159_sub2) {
				anIntArray7800[i] = 0;
				anIntArray7801[i] = 0;
			}
		}
		aClass14_7802 = new Class14(128);
	}

	public void method9767(Class159 class159, int i) {
		anIntArray7800[-80020449 * class159.anInt1754] = i;
		Class523_Sub7 class523_sub7 = ((Class523_Sub7) aClass14_7802.getFromIndex((long) (-80020449 * class159.anInt1754)));
		if (class523_sub7 != null) {
			if (4611686018427387905L != class523_sub7.aLong10404 * -2287843494007345997L)
				class523_sub7.aLong10404 = (TimeUtils.getCurrentTimeMilliseconds(1516375036) + 500L | 0x4000000000000000L) * 6503115775260729979L;
		} else {
			class523_sub7 = new Class523_Sub7(4611686018427387905L);
			aClass14_7802.method738(class523_sub7, (long) (class159.anInt1754 * -80020449));
		}
	}

	public void method116(Class159 class159, Object object, int i) {
		throw new UnsupportedOperationException();
	}

	public void method9768(Class159 class159, int i) {
		anIntArray7800[-80020449 * class159.anInt1754] = i;
		Class523_Sub7 class523_sub7 = ((Class523_Sub7) aClass14_7802.getFromIndex((long) (-80020449 * class159.anInt1754)));
		if (class523_sub7 != null) {
			if (4611686018427387905L != class523_sub7.aLong10404 * -2287843494007345997L)
				class523_sub7.aLong10404 = (TimeUtils.getCurrentTimeMilliseconds(1516375036) + 500L | 0x4000000000000000L) * 6503115775260729979L;
		} else {
			class523_sub7 = new Class523_Sub7(4611686018427387905L);
			aClass14_7802.method738(class523_sub7, (long) (class159.anInt1754 * -80020449));
		}
	}

	public void method9769() {
		for (int i = 0; i < Class669.aClass98_Sub1_Sub1_8582.method69(-1783525607); i++) {
			Class159_Sub2 class159_sub2 = ((Class159_Sub2) Class669.aClass98_Sub1_Sub1_8582.getDefinition(i, (byte) 11));
			if (null != class159_sub2) {
				anIntArray7800[i] = 0;
				anIntArray7801[i] = 0;
			}
		}
		aClass14_7802 = new Class14(128);
	}

	static final void method9770(Class669 class669, int i) {
		int i_12_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_12_, -367373256);
		Class41.method1144(class250, class669, -1287758016);
	}

	static final void method9771(Class669 class669, int i) {
		int i_13_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_13_, -947851031);
		Class242 class242 = Class31.aClass242Array302[i_13_ >> 16];
		OutputStream_Sub1.method17238(class250, class242, class669, -1274755300);
	}

	static int method9772(byte[][] is, byte[][] is_14_, int[] is_15_, byte[] is_16_, int[] is_17_, int i, int i_18_, byte i_19_) {
		int i_20_ = is_15_[i];
		int i_21_ = i_20_ + is_17_[i];
		int i_22_ = is_15_[i_18_];
		int i_23_ = i_22_ + is_17_[i_18_];
		int i_24_ = i_20_;
		if (i_22_ > i_20_)
			i_24_ = i_22_;
		int i_25_ = i_21_;
		if (i_23_ < i_21_)
			i_25_ = i_23_;
		int i_26_ = is_16_[i] & 0xff;
		if ((is_16_[i_18_] & 0xff) < i_26_)
			i_26_ = is_16_[i_18_] & 0xff;
		byte[] is_27_ = is_14_[i];
		byte[] is_28_ = is[i_18_];
		int i_29_ = i_24_ - i_20_;
		int i_30_ = i_24_ - i_22_;
		for (int i_31_ = i_24_; i_31_ < i_25_; i_31_++) {
			int i_32_ = is_27_[i_29_++] + is_28_[i_30_++];
			if (i_32_ < i_26_)
				i_26_ = i_32_;
		}
		return -i_26_;
	}

	static final void method9773(Class669 class669, short i) {
		int i_33_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = client.aClass220_11301.method4110(i_33_, -1575594749);
	}

	public static int method9774(byte[] is, int i, int i_34_) {
		return Class393.method6497(is, 0, i, 1925356516);
	}

	static final void method9775(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class73.method1509(-1081629804).method82();
	}

	static final void method9776(Class669 class669, int i) throws Exception_Sub7 {
		int i_35_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5313(Class270.method4987(i_35_, -837737358), true, (byte) -118);
		client.aBool11111 = true;
	}
}
