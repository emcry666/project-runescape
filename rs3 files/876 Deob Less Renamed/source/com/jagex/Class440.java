/* Class440 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class440 {
	public float aFloat4909;
	static int anInt4910;
	static Class440[] aClass440Array4911 = new Class440[0];
	public float aFloat4912;
	public float aFloat4913;
	static int anInt4914;
	public float aFloat4915;

	public final void method7008() {
		aFloat4909 = -aFloat4909;
		aFloat4913 = -aFloat4913;
		aFloat4912 = -aFloat4912;
	}

	static {
		new Class440();
	}

	static Class440 method7009(float f, float f_0_, float f_1_, float f_2_) {
		synchronized (aClass440Array4911) {
			if (anInt4914 == 0) {
				Class440 class440 = new Class440(f, f_0_, f_1_, f_2_);
				return class440;
			}
			aClass440Array4911[--anInt4914].method7014(f, f_0_, f_1_, f_2_);
			Class440 class440 = aClass440Array4911[anInt4914];
			return class440;
		}
	}

	public static Class440 method7010(Class440 class440) {
		synchronized (aClass440Array4911) {
			if (anInt4914 == 0) {
				Class440 class440_3_ = new Class440(class440);
				return class440_3_;
			}
			aClass440Array4911[--anInt4914].method7015(class440);
			Class440 class440_4_ = aClass440Array4911[anInt4914];
			return class440_4_;
		}
	}

	public void method7011() {
		synchronized (aClass440Array4911) {
			if (anInt4914 < anInt4910 - 1)
				aClass440Array4911[anInt4914++] = this;
		}
	}

	public String method7012() {
		return new StringBuilder().append(aFloat4909).append(",").append(aFloat4913).append(",").append(aFloat4912).append(",").append(aFloat4915).toString();
	}

	public Class440(float f, float f_5_, float f_6_, float f_7_) {
		method7014(f, f_5_, f_6_, f_7_);
	}

	public Class440(Class440 class440_8_) {
		method7015(class440_8_);
	}

	public Class440(float f, float f_9_, float f_10_) {
		method7018(f, f_9_, f_10_);
	}

	public void method7013(Class523_Sub34 class523_sub34) {
		aFloat4909 = class523_sub34.method16293(-1219305334);
		aFloat4913 = class523_sub34.method16293(-577693864);
		aFloat4912 = class523_sub34.method16293(-760464477);
		aFloat4915 = class523_sub34.method16293(-819064173);
	}

	void method7014(float f, float f_11_, float f_12_, float f_13_) {
		aFloat4909 = f;
		aFloat4913 = f_11_;
		aFloat4912 = f_12_;
		aFloat4915 = f_13_;
	}

	public void method7015(Class440 class440_14_) {
		aFloat4909 = class440_14_.aFloat4909;
		aFloat4913 = class440_14_.aFloat4913;
		aFloat4912 = class440_14_.aFloat4912;
		aFloat4915 = class440_14_.aFloat4915;
	}

	public void method7016(Class437 class437, float f) {
		method7017(class437.aFloat4903, class437.aFloat4904, class437.aFloat4905, f);
	}

	public void method7017(float f, float f_15_, float f_16_, float f_17_) {
		float f_18_ = (float) Math.sin((double) (f_17_ * 0.5F));
		float f_19_ = (float) Math.cos((double) (f_17_ * 0.5F));
		aFloat4909 = f * f_18_;
		aFloat4913 = f_15_ * f_18_;
		aFloat4912 = f_16_ * f_18_;
		aFloat4915 = f_19_;
	}

	public void method7018(float f, float f_20_, float f_21_) {
		method7017(0.0F, 1.0F, 0.0F, f);
		Class440 class440_22_ = method7063();
		class440_22_.method7017(1.0F, 0.0F, 0.0F, f_20_);
		method7042(class440_22_);
		class440_22_.method7017(0.0F, 0.0F, 1.0F, f_21_);
		method7042(class440_22_);
		class440_22_.method7011();
	}

	final void method7019() {
		aFloat4912 = 0.0F;
		aFloat4913 = 0.0F;
		aFloat4909 = 0.0F;
		aFloat4915 = 1.0F;
	}

	final void method7020() {
		aFloat4909 = -aFloat4909;
		aFloat4913 = -aFloat4913;
		aFloat4912 = -aFloat4912;
		aFloat4915 = -aFloat4915;
	}

	public final void method7021() {
		aFloat4909 = -aFloat4909;
		aFloat4913 = -aFloat4913;
		aFloat4912 = -aFloat4912;
	}

	public static final Class440 method7022(Class440 class440) {
		Class440 class440_23_ = method7010(class440);
		class440_23_.method7021();
		return class440_23_;
	}

	static Class440 method7023(float f, float f_24_, float f_25_, float f_26_) {
		synchronized (aClass440Array4911) {
			if (anInt4914 == 0) {
				Class440 class440 = new Class440(f, f_24_, f_25_, f_26_);
				return class440;
			}
			aClass440Array4911[--anInt4914].method7014(f, f_24_, f_25_, f_26_);
			Class440 class440 = aClass440Array4911[anInt4914];
			return class440;
		}
	}

	final void method7024(Class440 class440_27_) {
		aFloat4909 += class440_27_.aFloat4909;
		aFloat4913 += class440_27_.aFloat4913;
		aFloat4912 += class440_27_.aFloat4912;
		aFloat4915 += class440_27_.aFloat4915;
	}

	public void method7025(Class440 class440_28_) {
		aFloat4909 = class440_28_.aFloat4909;
		aFloat4913 = class440_28_.aFloat4913;
		aFloat4912 = class440_28_.aFloat4912;
		aFloat4915 = class440_28_.aFloat4915;
	}

	static final float method7026(Class440 class440, Class440 class440_29_) {
		return class440.method7081(class440_29_);
	}

	static final float method7027(Class440 class440) {
		return (float) Math.sqrt((double) method7026(class440, class440));
	}

	final void method7028(float f) {
		aFloat4909 *= f;
		aFloat4913 *= f;
		aFloat4912 *= f;
		aFloat4915 *= f;
	}

	static final Class440 method7029(Class440 class440, Class440 class440_30_) {
		Class440 class440_31_ = method7010(class440);
		class440_31_.method7042(class440_30_);
		return class440_31_;
	}

	final void method7030(float f) {
		aFloat4909 *= f;
		aFloat4913 *= f;
		aFloat4912 *= f;
		aFloat4915 *= f;
	}

	final void method7031(float f) {
		aFloat4909 *= f;
		aFloat4913 *= f;
		aFloat4912 *= f;
		aFloat4915 *= f;
	}

	public final void method7032(Class440 class440_32_, float f) {
		if (method7081(class440_32_) < 0.0F)
			method7020();
		method7030(1.0F - f);
		Class440 class440_33_ = method7049(class440_32_, f);
		method7024(class440_33_);
		class440_33_.method7011();
		method7041();
	}

	public String toString() {
		return new StringBuilder().append(aFloat4909).append(",").append(aFloat4913).append(",").append(aFloat4912).append(",").append(aFloat4915).toString();
	}

	public Class440() {
		method7019();
	}

	public void method7033(float f, float f_34_, float f_35_) {
		method7017(0.0F, 1.0F, 0.0F, f);
		Class440 class440_36_ = method7063();
		class440_36_.method7017(1.0F, 0.0F, 0.0F, f_34_);
		method7042(class440_36_);
		class440_36_.method7017(0.0F, 0.0F, 1.0F, f_35_);
		method7042(class440_36_);
		class440_36_.method7011();
	}

	public static void method7034(int i) {
		anInt4910 = i;
		aClass440Array4911 = new Class440[i];
		anInt4914 = 0;
	}

	public static Class440 method7035() {
		synchronized (aClass440Array4911) {
			if (anInt4914 == 0) {
				Class440 class440 = new Class440();
				return class440;
			}
			aClass440Array4911[--anInt4914].method7019();
			Class440 class440 = aClass440Array4911[anInt4914];
			return class440;
		}
	}

	static final float method7036(Class440 class440) {
		return (float) Math.sqrt((double) method7026(class440, class440));
	}

	public void method7037(float f, float f_37_, float f_38_, float f_39_) {
		float f_40_ = (float) Math.sin((double) (f_39_ * 0.5F));
		float f_41_ = (float) Math.cos((double) (f_39_ * 0.5F));
		aFloat4909 = f * f_40_;
		aFloat4913 = f_37_ * f_40_;
		aFloat4912 = f_38_ * f_40_;
		aFloat4915 = f_41_;
	}

	static Class440 method7038(float f, float f_42_, float f_43_, float f_44_) {
		synchronized (aClass440Array4911) {
			if (anInt4914 == 0) {
				Class440 class440 = new Class440(f, f_42_, f_43_, f_44_);
				return class440;
			}
			aClass440Array4911[--anInt4914].method7014(f, f_42_, f_43_, f_44_);
			Class440 class440 = aClass440Array4911[anInt4914];
			return class440;
		}
	}

	static Class440 method7039(float f, float f_45_, float f_46_, float f_47_) {
		synchronized (aClass440Array4911) {
			if (anInt4914 == 0) {
				Class440 class440 = new Class440(f, f_45_, f_46_, f_47_);
				return class440;
			}
			aClass440Array4911[--anInt4914].method7014(f, f_45_, f_46_, f_47_);
			Class440 class440 = aClass440Array4911[anInt4914];
			return class440;
		}
	}

	public static Class440 method7040(Class440 class440) {
		synchronized (aClass440Array4911) {
			if (anInt4914 == 0) {
				Class440 class440_48_ = new Class440(class440);
				return class440_48_;
			}
			aClass440Array4911[--anInt4914].method7015(class440);
			Class440 class440_49_ = aClass440Array4911[anInt4914];
			return class440_49_;
		}
	}

	public final void method7041() {
		float f = 1.0F / method7027(this);
		aFloat4909 *= f;
		aFloat4913 *= f;
		aFloat4912 *= f;
		aFloat4915 *= f;
	}

	public final void method7042(Class440 class440_50_) {
		method7014((class440_50_.aFloat4915 * aFloat4909 + class440_50_.aFloat4909 * aFloat4915 + class440_50_.aFloat4913 * aFloat4912 - class440_50_.aFloat4912 * aFloat4913), (class440_50_.aFloat4915 * aFloat4913 - class440_50_.aFloat4909 * aFloat4912 + class440_50_.aFloat4913 * aFloat4915 + class440_50_.aFloat4912 * aFloat4909), (class440_50_.aFloat4915 * aFloat4912 + class440_50_.aFloat4909 * aFloat4913 - class440_50_.aFloat4913 * aFloat4909 + class440_50_.aFloat4912 * aFloat4915), (class440_50_.aFloat4915 * aFloat4915 - class440_50_.aFloat4909 * aFloat4909 - class440_50_.aFloat4913 * aFloat4913 - class440_50_.aFloat4912 * aFloat4912));
	}

	void method7043(float f, float f_51_, float f_52_, float f_53_) {
		aFloat4909 = f;
		aFloat4913 = f_51_;
		aFloat4912 = f_52_;
		aFloat4915 = f_53_;
	}

	void method7044(float f, float f_54_, float f_55_, float f_56_) {
		aFloat4909 = f;
		aFloat4913 = f_54_;
		aFloat4912 = f_55_;
		aFloat4915 = f_56_;
	}

	void method7045(float f, float f_57_, float f_58_, float f_59_) {
		aFloat4909 = f;
		aFloat4913 = f_57_;
		aFloat4912 = f_58_;
		aFloat4915 = f_59_;
	}

	public void method7046(Class440 class440_60_) {
		aFloat4909 = class440_60_.aFloat4909;
		aFloat4913 = class440_60_.aFloat4913;
		aFloat4912 = class440_60_.aFloat4912;
		aFloat4915 = class440_60_.aFloat4915;
	}

	final void method7047() {
		aFloat4909 = -aFloat4909;
		aFloat4913 = -aFloat4913;
		aFloat4912 = -aFloat4912;
		aFloat4915 = -aFloat4915;
	}

	public void method7048(Class440 class440_61_) {
		aFloat4909 = class440_61_.aFloat4909;
		aFloat4913 = class440_61_.aFloat4913;
		aFloat4912 = class440_61_.aFloat4912;
		aFloat4915 = class440_61_.aFloat4915;
	}

	static final Class440 method7049(Class440 class440, float f) {
		Class440 class440_62_ = method7010(class440);
		class440_62_.method7030(f);
		return class440_62_;
	}

	public void method7050(float f, float f_63_, float f_64_, float f_65_) {
		float f_66_ = (float) Math.sin((double) (f_65_ * 0.5F));
		float f_67_ = (float) Math.cos((double) (f_65_ * 0.5F));
		aFloat4909 = f * f_66_;
		aFloat4913 = f_63_ * f_66_;
		aFloat4912 = f_64_ * f_66_;
		aFloat4915 = f_67_;
	}

	static final float method7051(Class440 class440) {
		return (float) Math.sqrt((double) method7026(class440, class440));
	}

	public static final Class440 method7052(Class440 class440) {
		Class440 class440_68_ = method7010(class440);
		class440_68_.method7021();
		return class440_68_;
	}

	final void method7053(Class440 class440_69_) {
		aFloat4909 += class440_69_.aFloat4909;
		aFloat4913 += class440_69_.aFloat4913;
		aFloat4912 += class440_69_.aFloat4912;
		aFloat4915 += class440_69_.aFloat4915;
	}

	public static Class440 method7054() {
		synchronized (aClass440Array4911) {
			if (anInt4914 == 0) {
				Class440 class440 = new Class440();
				return class440;
			}
			aClass440Array4911[--anInt4914].method7019();
			Class440 class440 = aClass440Array4911[anInt4914];
			return class440;
		}
	}

	final void method7055() {
		aFloat4912 = 0.0F;
		aFloat4913 = 0.0F;
		aFloat4909 = 0.0F;
		aFloat4915 = 1.0F;
	}

	final void method7056() {
		aFloat4909 = -aFloat4909;
		aFloat4913 = -aFloat4913;
		aFloat4912 = -aFloat4912;
		aFloat4915 = -aFloat4915;
	}

	public void method7057(float f, float f_70_, float f_71_) {
		method7017(0.0F, 1.0F, 0.0F, f);
		Class440 class440_72_ = method7063();
		class440_72_.method7017(1.0F, 0.0F, 0.0F, f_70_);
		method7042(class440_72_);
		class440_72_.method7017(0.0F, 0.0F, 1.0F, f_71_);
		method7042(class440_72_);
		class440_72_.method7011();
	}

	public void method7058(Class523_Sub34 class523_sub34) {
		aFloat4909 = class523_sub34.method16293(-1936362191);
		aFloat4913 = class523_sub34.method16293(-1777485206);
		aFloat4912 = class523_sub34.method16293(-1040838495);
		aFloat4915 = class523_sub34.method16293(-1899341925);
	}

	public final void method7059() {
		aFloat4909 = -aFloat4909;
		aFloat4913 = -aFloat4913;
		aFloat4912 = -aFloat4912;
	}

	public final void method7060() {
		aFloat4909 = -aFloat4909;
		aFloat4913 = -aFloat4913;
		aFloat4912 = -aFloat4912;
	}

	public final void method7061() {
		aFloat4909 = -aFloat4909;
		aFloat4913 = -aFloat4913;
		aFloat4912 = -aFloat4912;
	}

	static final Class440 method7062(Class440 class440, Class440 class440_73_) {
		Class440 class440_74_ = method7010(class440);
		class440_74_.method7042(class440_73_);
		return class440_74_;
	}

	public static Class440 method7063() {
		synchronized (aClass440Array4911) {
			if (anInt4914 == 0) {
				Class440 class440 = new Class440();
				return class440;
			}
			aClass440Array4911[--anInt4914].method7019();
			Class440 class440 = aClass440Array4911[anInt4914];
			return class440;
		}
	}

	public final void method7064() {
		float f = 1.0F / method7027(this);
		aFloat4909 *= f;
		aFloat4913 *= f;
		aFloat4912 *= f;
		aFloat4915 *= f;
	}

	static final float method7065(Class440 class440) {
		return (float) Math.sqrt((double) method7026(class440, class440));
	}

	final float method7066(Class440 class440_75_) {
		return (aFloat4909 * class440_75_.aFloat4909 + aFloat4913 * class440_75_.aFloat4913 + aFloat4912 * class440_75_.aFloat4912 + aFloat4915 * class440_75_.aFloat4915);
	}

	final float method7067(Class440 class440_76_) {
		return (aFloat4909 * class440_76_.aFloat4909 + aFloat4913 * class440_76_.aFloat4913 + aFloat4912 * class440_76_.aFloat4912 + aFloat4915 * class440_76_.aFloat4915);
	}

	static final float method7068(Class440 class440, Class440 class440_77_) {
		return class440.method7081(class440_77_);
	}

	public void method7069(Class437 class437, float f) {
		method7017(class437.aFloat4903, class437.aFloat4904, class437.aFloat4905, f);
	}

	final void method7070() {
		aFloat4912 = 0.0F;
		aFloat4913 = 0.0F;
		aFloat4909 = 0.0F;
		aFloat4915 = 1.0F;
	}

	static final float method7071(Class440 class440) {
		return (float) Math.sqrt((double) method7026(class440, class440));
	}

	public final void method7072(Class440 class440_78_) {
		method7014((class440_78_.aFloat4915 * aFloat4909 + class440_78_.aFloat4909 * aFloat4915 + class440_78_.aFloat4913 * aFloat4912 - class440_78_.aFloat4912 * aFloat4913), (class440_78_.aFloat4915 * aFloat4913 - class440_78_.aFloat4909 * aFloat4912 + class440_78_.aFloat4913 * aFloat4915 + class440_78_.aFloat4912 * aFloat4909), (class440_78_.aFloat4915 * aFloat4912 + class440_78_.aFloat4909 * aFloat4913 - class440_78_.aFloat4913 * aFloat4909 + class440_78_.aFloat4912 * aFloat4915), (class440_78_.aFloat4915 * aFloat4915 - class440_78_.aFloat4909 * aFloat4909 - class440_78_.aFloat4913 * aFloat4913 - class440_78_.aFloat4912 * aFloat4912));
	}

	public final void method7073(Class440 class440_79_) {
		method7014((class440_79_.aFloat4915 * aFloat4909 + class440_79_.aFloat4909 * aFloat4915 + class440_79_.aFloat4913 * aFloat4912 - class440_79_.aFloat4912 * aFloat4913), (class440_79_.aFloat4915 * aFloat4913 - class440_79_.aFloat4909 * aFloat4912 + class440_79_.aFloat4913 * aFloat4915 + class440_79_.aFloat4912 * aFloat4909), (class440_79_.aFloat4915 * aFloat4912 + class440_79_.aFloat4909 * aFloat4913 - class440_79_.aFloat4913 * aFloat4909 + class440_79_.aFloat4912 * aFloat4915), (class440_79_.aFloat4915 * aFloat4915 - class440_79_.aFloat4909 * aFloat4909 - class440_79_.aFloat4913 * aFloat4913 - class440_79_.aFloat4912 * aFloat4912));
	}

	final void method7074() {
		aFloat4909 = -aFloat4909;
		aFloat4913 = -aFloat4913;
		aFloat4912 = -aFloat4912;
		aFloat4915 = -aFloat4915;
	}

	public final void method7075(Class440 class440_80_) {
		method7014((class440_80_.aFloat4915 * aFloat4909 + class440_80_.aFloat4909 * aFloat4915 + class440_80_.aFloat4913 * aFloat4912 - class440_80_.aFloat4912 * aFloat4913), (class440_80_.aFloat4915 * aFloat4913 - class440_80_.aFloat4909 * aFloat4912 + class440_80_.aFloat4913 * aFloat4915 + class440_80_.aFloat4912 * aFloat4909), (class440_80_.aFloat4915 * aFloat4912 + class440_80_.aFloat4909 * aFloat4913 - class440_80_.aFloat4913 * aFloat4909 + class440_80_.aFloat4912 * aFloat4915), (class440_80_.aFloat4915 * aFloat4915 - class440_80_.aFloat4909 * aFloat4909 - class440_80_.aFloat4913 * aFloat4913 - class440_80_.aFloat4912 * aFloat4912));
	}

	public final void method7076(Class440 class440_81_) {
		method7014((class440_81_.aFloat4915 * aFloat4909 + class440_81_.aFloat4909 * aFloat4915 + class440_81_.aFloat4913 * aFloat4912 - class440_81_.aFloat4912 * aFloat4913), (class440_81_.aFloat4915 * aFloat4913 - class440_81_.aFloat4909 * aFloat4912 + class440_81_.aFloat4913 * aFloat4915 + class440_81_.aFloat4912 * aFloat4909), (class440_81_.aFloat4915 * aFloat4912 + class440_81_.aFloat4909 * aFloat4913 - class440_81_.aFloat4913 * aFloat4909 + class440_81_.aFloat4912 * aFloat4915), (class440_81_.aFloat4915 * aFloat4915 - class440_81_.aFloat4909 * aFloat4909 - class440_81_.aFloat4913 * aFloat4913 - class440_81_.aFloat4912 * aFloat4912));
	}

	static final Class440 method7077(Class440 class440, Class440 class440_82_) {
		Class440 class440_83_ = method7010(class440);
		class440_83_.method7042(class440_82_);
		return class440_83_;
	}

	public static void method7078(int i) {
		anInt4910 = i;
		aClass440Array4911 = new Class440[i];
		anInt4914 = 0;
	}

	static final Class440 method7079(Class440 class440, Class440 class440_84_) {
		Class440 class440_85_ = method7010(class440);
		class440_85_.method7042(class440_84_);
		return class440_85_;
	}

	public void method7080() {
		synchronized (aClass440Array4911) {
			if (anInt4914 < anInt4910 - 1)
				aClass440Array4911[anInt4914++] = this;
		}
	}

	final float method7081(Class440 class440_86_) {
		return (aFloat4909 * class440_86_.aFloat4909 + aFloat4913 * class440_86_.aFloat4913 + aFloat4912 * class440_86_.aFloat4912 + aFloat4915 * class440_86_.aFloat4915);
	}

	static final Class440 method7082(Class440 class440, float f) {
		Class440 class440_87_ = method7010(class440);
		class440_87_.method7030(f);
		return class440_87_;
	}

	public final void method7083(Class440 class440_88_, float f) {
		if (method7081(class440_88_) < 0.0F)
			method7020();
		method7030(1.0F - f);
		Class440 class440_89_ = method7049(class440_88_, f);
		method7024(class440_89_);
		class440_89_.method7011();
		method7041();
	}
}
