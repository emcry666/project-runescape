/* Class437 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class437 {
	static int anInt4900;
	static Class437[] aClass437Array4901;
	static int anInt4902;
	public float aFloat4903;
	public float aFloat4904;
	public float aFloat4905;

	public static final Class437 method6877(Class437 class437, Class437 class437_0_) {
		Class437 class437_1_ = method6884(class437);
		class437_1_.method6957(class437_0_);
		return class437_1_;
	}

	public static Class437 method6878() {
		synchronized (aClass437Array4901) {
			if (anInt4902 == 0) {
				Class437 class437 = new Class437();
				return class437;
			}
			aClass437Array4901[--anInt4902].method6887();
			Class437 class437 = aClass437Array4901[anInt4902];
			return class437;
		}
	}

	public static Class437 method6879(float f, float f_2_, float f_3_) {
		synchronized (aClass437Array4901) {
			if (anInt4902 == 0) {
				Class437 class437 = new Class437(f, f_2_, f_3_);
				return class437;
			}
			aClass437Array4901[--anInt4902].method6972(f, f_2_, f_3_);
			Class437 class437 = aClass437Array4901[anInt4902];
			return class437;
		}
	}

	public boolean method6880(Class437 class437_4_) {
		if (aFloat4903 != class437_4_.aFloat4903 || aFloat4904 != class437_4_.aFloat4904 || aFloat4905 != class437_4_.aFloat4905)
			return false;
		return true;
	}

	public static Class437 method6881(Class523_Sub34 class523_sub34) {
		synchronized (aClass437Array4901) {
			if (anInt4902 == 0) {
				Class437 class437 = new Class437(class523_sub34);
				return class437;
			}
			aClass437Array4901[--anInt4902].method6941(class523_sub34);
			Class437 class437 = aClass437Array4901[anInt4902];
			return class437;
		}
	}

	public static Class437 method6882(float f, float f_5_, float f_6_) {
		synchronized (aClass437Array4901) {
			if (anInt4902 == 0) {
				Class437 class437 = new Class437(f, f_5_, f_6_);
				return class437;
			}
			aClass437Array4901[--anInt4902].method6972(f, f_5_, f_6_);
			Class437 class437 = aClass437Array4901[anInt4902];
			return class437;
		}
	}

	public Class437() {
		/* empty */
	}

	public Class437(float f, float f_7_, float f_8_) {
		aFloat4903 = f;
		aFloat4904 = f_7_;
		aFloat4905 = f_8_;
	}

	public static void method6883(int i) {
		anInt4900 = i;
		aClass437Array4901 = new Class437[i];
		anInt4902 = 0;
	}

	Class437(Class523_Sub34 class523_sub34) {
		aFloat4903 = class523_sub34.method16293(-1488186542);
		aFloat4904 = class523_sub34.method16293(-1642927434);
		aFloat4905 = class523_sub34.method16293(-919159936);
	}

	public static Class437 method6884(Class437 class437) {
		synchronized (aClass437Array4901) {
			if (anInt4902 == 0) {
				Class437 class437_9_ = new Class437(class437);
				return class437_9_;
			}
			aClass437Array4901[--anInt4902].method6886(class437);
			Class437 class437_10_ = aClass437Array4901[anInt4902];
			return class437_10_;
		}
	}

	public static Class437 method6885(Class523_Sub34 class523_sub34) {
		synchronized (aClass437Array4901) {
			if (anInt4902 == 0) {
				Class437 class437 = new Class437(class523_sub34);
				return class437;
			}
			aClass437Array4901[--anInt4902].method6941(class523_sub34);
			Class437 class437 = aClass437Array4901[anInt4902];
			return class437;
		}
	}

	public void method6886(Class437 class437_11_) {
		method6972(class437_11_.aFloat4903, class437_11_.aFloat4904, class437_11_.aFloat4905);
	}

	public final void method6887() {
		aFloat4905 = 0.0F;
		aFloat4904 = 0.0F;
		aFloat4903 = 0.0F;
	}

	public static Class437 method6888() {
		synchronized (aClass437Array4901) {
			if (anInt4902 == 0) {
				Class437 class437 = new Class437();
				return class437;
			}
			aClass437Array4901[--anInt4902].method6887();
			Class437 class437 = aClass437Array4901[anInt4902];
			return class437;
		}
	}

	public final void method6889() {
		aFloat4903 = -aFloat4903;
		aFloat4904 = -aFloat4904;
		aFloat4905 = -aFloat4905;
	}

	public final void method6890() {
		float f = 1.0F / method6958();
		aFloat4903 *= f;
		aFloat4904 *= f;
		aFloat4905 *= f;
	}

	static {
		new Class437(0.0F, 0.0F, 0.0F);
		aClass437Array4901 = new Class437[0];
	}

	public final void method6891(Class437 class437_12_, float f) {
		aFloat4903 += class437_12_.aFloat4903 * f;
		aFloat4904 += class437_12_.aFloat4904 * f;
		aFloat4905 += class437_12_.aFloat4905 * f;
	}

	public static final Class437 method6892(Class437 class437, Class437 class437_13_) {
		Class437 class437_14_ = method6884(class437);
		class437_14_.method6961(class437_13_);
		return class437_14_;
	}

	public final void method6893(Class437 class437_15_) {
		aFloat4903 -= class437_15_.aFloat4903;
		aFloat4904 -= class437_15_.aFloat4904;
		aFloat4905 -= class437_15_.aFloat4905;
	}

	public static final Class437 method6894(Class437 class437, Class437 class437_16_) {
		Class437 class437_17_ = method6884(class437);
		class437_17_.method6897(class437_16_);
		return class437_17_;
	}

	public final float method6895(Class437 class437_18_) {
		return (aFloat4903 * class437_18_.aFloat4903 + aFloat4904 * class437_18_.aFloat4904 + aFloat4905 * class437_18_.aFloat4905);
	}

	public final void method6896() {
		aFloat4905 = 0.0F;
		aFloat4904 = 0.0F;
		aFloat4903 = 0.0F;
	}

	final void method6897(Class437 class437_19_) {
		method6972((aFloat4904 * class437_19_.aFloat4905 - aFloat4905 * class437_19_.aFloat4904), (aFloat4905 * class437_19_.aFloat4903 - aFloat4903 * class437_19_.aFloat4905), (aFloat4903 * class437_19_.aFloat4904 - aFloat4904 * class437_19_.aFloat4903));
	}

	public final void method6898() {
		if (aFloat4903 < 0.0F)
			aFloat4903 *= -1.0F;
		if (aFloat4904 < 0.0F)
			aFloat4904 *= -1.0F;
		if (aFloat4905 < 0.0F)
			aFloat4905 *= -1.0F;
	}

	public static final float method6899(Class437 class437, Class437 class437_20_) {
		return class437.method6895(class437_20_);
	}

	public final void method6900(float f) {
		aFloat4903 *= f;
		aFloat4904 *= f;
		aFloat4905 *= f;
	}

	public Class437(Class437 class437_21_) {
		aFloat4903 = class437_21_.aFloat4903;
		aFloat4904 = class437_21_.aFloat4904;
		aFloat4905 = class437_21_.aFloat4905;
	}

	public static final Class437 method6901(Class437 class437, Class437 class437_22_) {
		Class437 class437_23_ = method6884(class437);
		class437_23_.method6961(class437_22_);
		return class437_23_;
	}

	public final void method6902(float f) {
		aFloat4903 *= f;
		aFloat4904 *= f;
		aFloat4905 *= f;
	}

	final void method6903(Class437 class437_24_) {
		aFloat4903 /= class437_24_.aFloat4903;
		aFloat4904 /= class437_24_.aFloat4904;
		aFloat4905 /= class437_24_.aFloat4905;
	}

	public static final Class437 method6904(Class437 class437, Class437 class437_25_) {
		Class437 class437_26_ = method6884(class437);
		class437_26_.method6903(class437_25_);
		return class437_26_;
	}

	public final void method6905(float f) {
		aFloat4903 /= f;
		aFloat4904 /= f;
		aFloat4905 /= f;
	}

	public static final Class437 method6906(Class437 class437, float f) {
		Class437 class437_27_ = method6884(class437);
		class437_27_.method6902(f);
		return class437_27_;
	}

	public final void method6907(Class440 class440) {
		Class440 class440_28_ = Class440.method7009(aFloat4903, aFloat4904, aFloat4905, 0.0F);
		Class440 class440_29_ = Class440.method7022(class440);
		Class440 class440_30_ = Class440.method7029(class440_29_, class440_28_);
		class440_30_.method7042(class440);
		method6972(class440_30_.aFloat4909, class440_30_.aFloat4913, class440_30_.aFloat4912);
		class440_28_.method7011();
		class440_29_.method7011();
		class440_30_.method7011();
	}

	public final void method6908(Class435 class435) {
		float f = aFloat4903;
		float f_31_ = aFloat4904;
		aFloat4903 = (class435.aFloat4885 * f + class435.aFloat4888 * f_31_ + class435.aFloat4891 * aFloat4905 + class435.aFloat4894);
		aFloat4904 = (class435.aFloat4893 * f + class435.aFloat4889 * f_31_ + class435.aFloat4886 * aFloat4905 + class435.aFloat4895);
		aFloat4905 = (class435.aFloat4887 * f + class435.aFloat4884 * f_31_ + class435.aFloat4892 * aFloat4905 + class435.aFloat4896);
	}

	public final void method6909(Class435 class435) {
		float f = aFloat4903;
		float f_32_ = aFloat4904;
		aFloat4903 = (class435.aFloat4885 * f + class435.aFloat4888 * f_32_ + class435.aFloat4891 * aFloat4905);
		aFloat4904 = (class435.aFloat4893 * f + class435.aFloat4889 * f_32_ + class435.aFloat4886 * aFloat4905);
		aFloat4905 = (class435.aFloat4887 * f + class435.aFloat4884 * f_32_ + class435.aFloat4892 * aFloat4905);
	}

	public final void method6910(Class437 class437_33_, float f) {
		method6902(1.0F - f);
		method6961(method6906(class437_33_, f));
	}

	public String toString() {
		return new StringBuilder().append(aFloat4903).append(", ").append(aFloat4904).append(", ").append(aFloat4905).toString();
	}

	public static final Class437 method6911(Class437 class437, Class437 class437_34_) {
		Class437 class437_35_ = method6884(class437);
		class437_35_.method6893(class437_34_);
		return class437_35_;
	}

	final void method6912(Class437 class437_36_) {
		method6972((aFloat4904 * class437_36_.aFloat4905 - aFloat4905 * class437_36_.aFloat4904), (aFloat4905 * class437_36_.aFloat4903 - aFloat4903 * class437_36_.aFloat4905), (aFloat4903 * class437_36_.aFloat4904 - aFloat4904 * class437_36_.aFloat4903));
	}

	public static void method6913(int i) {
		anInt4900 = i;
		aClass437Array4901 = new Class437[i];
		anInt4902 = 0;
	}

	public static void method6914(int i) {
		anInt4900 = i;
		aClass437Array4901 = new Class437[i];
		anInt4902 = 0;
	}

	public final void method6915(Class435 class435) {
		float f = aFloat4903;
		float f_37_ = aFloat4904;
		aFloat4903 = (class435.aFloat4885 * f + class435.aFloat4888 * f_37_ + class435.aFloat4891 * aFloat4905);
		aFloat4904 = (class435.aFloat4893 * f + class435.aFloat4889 * f_37_ + class435.aFloat4886 * aFloat4905);
		aFloat4905 = (class435.aFloat4887 * f + class435.aFloat4884 * f_37_ + class435.aFloat4892 * aFloat4905);
	}

	public static Class437 method6916() {
		synchronized (aClass437Array4901) {
			if (anInt4902 == 0) {
				Class437 class437 = new Class437();
				return class437;
			}
			aClass437Array4901[--anInt4902].method6887();
			Class437 class437 = aClass437Array4901[anInt4902];
			return class437;
		}
	}

	public final void method6917(Class437 class437_38_) {
		aFloat4903 += class437_38_.aFloat4903;
		aFloat4904 += class437_38_.aFloat4904;
		aFloat4905 += class437_38_.aFloat4905;
	}

	public static Class437 method6918(float f, float f_39_, float f_40_) {
		synchronized (aClass437Array4901) {
			if (anInt4902 == 0) {
				Class437 class437 = new Class437(f, f_39_, f_40_);
				return class437;
			}
			aClass437Array4901[--anInt4902].method6972(f, f_39_, f_40_);
			Class437 class437 = aClass437Array4901[anInt4902];
			return class437;
		}
	}

	public final void method6919(Class435 class435) {
		float f = aFloat4903;
		float f_41_ = aFloat4904;
		aFloat4903 = (class435.aFloat4885 * f + class435.aFloat4888 * f_41_ + class435.aFloat4891 * aFloat4905 + class435.aFloat4894);
		aFloat4904 = (class435.aFloat4893 * f + class435.aFloat4889 * f_41_ + class435.aFloat4886 * aFloat4905 + class435.aFloat4895);
		aFloat4905 = (class435.aFloat4887 * f + class435.aFloat4884 * f_41_ + class435.aFloat4892 * aFloat4905 + class435.aFloat4896);
	}

	public static Class437 method6920(Class437 class437) {
		synchronized (aClass437Array4901) {
			if (anInt4902 == 0) {
				Class437 class437_42_ = new Class437(class437);
				return class437_42_;
			}
			aClass437Array4901[--anInt4902].method6886(class437);
			Class437 class437_43_ = aClass437Array4901[anInt4902];
			return class437_43_;
		}
	}

	public static Class437 method6921(Class523_Sub34 class523_sub34) {
		synchronized (aClass437Array4901) {
			if (anInt4902 == 0) {
				Class437 class437 = new Class437(class523_sub34);
				return class437;
			}
			aClass437Array4901[--anInt4902].method6941(class523_sub34);
			Class437 class437 = aClass437Array4901[anInt4902];
			return class437;
		}
	}

	public final float method6922(Class437 class437_44_) {
		return (aFloat4903 * class437_44_.aFloat4903 + aFloat4904 * class437_44_.aFloat4904 + aFloat4905 * class437_44_.aFloat4905);
	}

	public void method6923() {
		synchronized (aClass437Array4901) {
			if (anInt4902 < anInt4900 - 1)
				aClass437Array4901[anInt4902++] = this;
		}
	}

	public final void method6924(Class437 class437_45_, float f) {
		aFloat4903 += class437_45_.aFloat4903 * f;
		aFloat4904 += class437_45_.aFloat4904 * f;
		aFloat4905 += class437_45_.aFloat4905 * f;
	}

	public final void method6925() {
		aFloat4903 = -aFloat4903;
		aFloat4904 = -aFloat4904;
		aFloat4905 = -aFloat4905;
	}

	public void method6926(Class523_Sub34 class523_sub34) {
		aFloat4903 = class523_sub34.method16293(-1541914874);
		aFloat4904 = class523_sub34.method16293(-1131380255);
		aFloat4905 = class523_sub34.method16293(-1840441018);
	}

	public void method6927(float f, float f_46_, float f_47_) {
		aFloat4903 = f;
		aFloat4904 = f_46_;
		aFloat4905 = f_47_;
	}

	public void method6928(float f, float f_48_, float f_49_) {
		aFloat4903 = f;
		aFloat4904 = f_48_;
		aFloat4905 = f_49_;
	}

	public void method6929(Class437 class437_50_) {
		method6972(class437_50_.aFloat4903, class437_50_.aFloat4904, class437_50_.aFloat4905);
	}

	public void method6930(Class437 class437_51_) {
		method6972(class437_51_.aFloat4903, class437_51_.aFloat4904, class437_51_.aFloat4905);
	}

	public void method6931(Class437 class437_52_) {
		method6972(class437_52_.aFloat4903, class437_52_.aFloat4904, class437_52_.aFloat4905);
	}

	public static final Class437 method6932(Class437 class437, Class437 class437_53_) {
		Class437 class437_54_ = method6884(class437);
		class437_54_.method6893(class437_53_);
		return class437_54_;
	}

	public String method6933() {
		return new StringBuilder().append(aFloat4903).append(", ").append(aFloat4904).append(", ").append(aFloat4905).toString();
	}

	public void method6934(Class523_Sub34 class523_sub34) {
		aFloat4903 = class523_sub34.method16293(-1403605754);
		aFloat4904 = class523_sub34.method16293(-831016210);
		aFloat4905 = class523_sub34.method16293(-1537220079);
	}

	public final void method6935() {
		aFloat4905 = 0.0F;
		aFloat4904 = 0.0F;
		aFloat4903 = 0.0F;
	}

	public final void method6936() {
		aFloat4905 = 0.0F;
		aFloat4904 = 0.0F;
		aFloat4903 = 0.0F;
	}

	public boolean method6937(Class437 class437_55_) {
		if (aFloat4903 != class437_55_.aFloat4903 || aFloat4904 != class437_55_.aFloat4904 || aFloat4905 != class437_55_.aFloat4905)
			return false;
		return true;
	}

	public static final float method6938(Class437 class437, Class437 class437_56_) {
		return class437.method6895(class437_56_);
	}

	public final void method6939() {
		aFloat4903 = -aFloat4903;
		aFloat4904 = -aFloat4904;
		aFloat4905 = -aFloat4905;
	}

	public final void method6940() {
		aFloat4903 = -aFloat4903;
		aFloat4904 = -aFloat4904;
		aFloat4905 = -aFloat4905;
	}

	public void method6941(Class523_Sub34 class523_sub34) {
		aFloat4903 = class523_sub34.method16293(-1352444632);
		aFloat4904 = class523_sub34.method16293(-708312872);
		aFloat4905 = class523_sub34.method16293(-1228935183);
	}

	public final void method6942() {
		float f = 1.0F / method6958();
		aFloat4903 *= f;
		aFloat4904 *= f;
		aFloat4905 *= f;
	}

	public final void method6943(Class437 class437_57_) {
		aFloat4903 += class437_57_.aFloat4903;
		aFloat4904 += class437_57_.aFloat4904;
		aFloat4905 += class437_57_.aFloat4905;
	}

	public final void method6944(Class437 class437_58_, float f) {
		method6902(1.0F - f);
		method6961(method6906(class437_58_, f));
	}

	public final void method6945(Class437 class437_59_) {
		aFloat4903 += class437_59_.aFloat4903;
		aFloat4904 += class437_59_.aFloat4904;
		aFloat4905 += class437_59_.aFloat4905;
	}

	public final void method6946(Class437 class437_60_) {
		aFloat4903 += class437_60_.aFloat4903;
		aFloat4904 += class437_60_.aFloat4904;
		aFloat4905 += class437_60_.aFloat4905;
	}

	public final void method6947(Class437 class437_61_) {
		aFloat4903 += class437_61_.aFloat4903;
		aFloat4904 += class437_61_.aFloat4904;
		aFloat4905 += class437_61_.aFloat4905;
	}

	public static final Class437 method6948(Class437 class437, Class437 class437_62_) {
		Class437 class437_63_ = method6884(class437);
		class437_63_.method6961(class437_62_);
		return class437_63_;
	}

	public void method6949() {
		synchronized (aClass437Array4901) {
			if (anInt4902 < anInt4900 - 1)
				aClass437Array4901[anInt4902++] = this;
		}
	}

	public void method6950(Class523_Sub34 class523_sub34) {
		aFloat4903 = class523_sub34.method16293(-1102081193);
		aFloat4904 = class523_sub34.method16293(-533295567);
		aFloat4905 = class523_sub34.method16293(-1217608111);
	}

	public static final Class437 method6951(Class437 class437, Class437 class437_64_) {
		Class437 class437_65_ = method6884(class437);
		class437_65_.method6961(class437_64_);
		return class437_65_;
	}

	public static final Class437 method6952(Class437 class437, Class437 class437_66_) {
		Class437 class437_67_ = method6884(class437);
		class437_67_.method6961(class437_66_);
		return class437_67_;
	}

	public final void method6953(Class437 class437_68_) {
		aFloat4903 -= class437_68_.aFloat4903;
		aFloat4904 -= class437_68_.aFloat4904;
		aFloat4905 -= class437_68_.aFloat4905;
	}

	public final void method6954(Class437 class437_69_) {
		aFloat4903 -= class437_69_.aFloat4903;
		aFloat4904 -= class437_69_.aFloat4904;
		aFloat4905 -= class437_69_.aFloat4905;
	}

	public void method6955(Class437 class437_70_) {
		method6972(class437_70_.aFloat4903, class437_70_.aFloat4904, class437_70_.aFloat4905);
	}

	public static final Class437 method6956(Class437 class437, Class437 class437_71_) {
		Class437 class437_72_ = method6884(class437);
		class437_72_.method6893(class437_71_);
		return class437_72_;
	}

	final void method6957(Class437 class437_73_) {
		aFloat4903 *= class437_73_.aFloat4903;
		aFloat4904 *= class437_73_.aFloat4904;
		aFloat4905 *= class437_73_.aFloat4905;
	}

	public final float method6958() {
		return (float) Math.sqrt((double) (aFloat4903 * aFloat4903 + aFloat4904 * aFloat4904 + aFloat4905 * aFloat4905));
	}

	final void method6959(Class437 class437_74_) {
		method6972((aFloat4904 * class437_74_.aFloat4905 - aFloat4905 * class437_74_.aFloat4904), (aFloat4905 * class437_74_.aFloat4903 - aFloat4903 * class437_74_.aFloat4905), (aFloat4903 * class437_74_.aFloat4904 - aFloat4904 * class437_74_.aFloat4903));
	}

	public static final Class437 method6960(Class437 class437, Class437 class437_75_) {
		Class437 class437_76_ = method6884(class437);
		class437_76_.method6897(class437_75_);
		return class437_76_;
	}

	public final void method6961(Class437 class437_77_) {
		aFloat4903 += class437_77_.aFloat4903;
		aFloat4904 += class437_77_.aFloat4904;
		aFloat4905 += class437_77_.aFloat4905;
	}

	public static void method6962(int i) {
		anInt4900 = i;
		aClass437Array4901 = new Class437[i];
		anInt4902 = 0;
	}

	public final void method6963(float f) {
		aFloat4903 *= f;
		aFloat4904 *= f;
		aFloat4905 *= f;
	}

	public final float method6964() {
		return (float) Math.sqrt((double) (aFloat4903 * aFloat4903 + aFloat4904 * aFloat4904 + aFloat4905 * aFloat4905));
	}

	public final float method6965() {
		return (float) Math.sqrt((double) (aFloat4903 * aFloat4903 + aFloat4904 * aFloat4904 + aFloat4905 * aFloat4905));
	}

	public final float method6966() {
		return (float) Math.sqrt((double) (aFloat4903 * aFloat4903 + aFloat4904 * aFloat4904 + aFloat4905 * aFloat4905));
	}

	public final float method6967() {
		return (float) Math.sqrt((double) (aFloat4903 * aFloat4903 + aFloat4904 * aFloat4904 + aFloat4905 * aFloat4905));
	}

	public final void method6968() {
		if (aFloat4903 < 0.0F)
			aFloat4903 *= -1.0F;
		if (aFloat4904 < 0.0F)
			aFloat4904 *= -1.0F;
		if (aFloat4905 < 0.0F)
			aFloat4905 *= -1.0F;
	}

	public final void method6969() {
		if (aFloat4903 < 0.0F)
			aFloat4903 *= -1.0F;
		if (aFloat4904 < 0.0F)
			aFloat4904 *= -1.0F;
		if (aFloat4905 < 0.0F)
			aFloat4905 *= -1.0F;
	}

	public static final Class437 method6970(Class437 class437, Class437 class437_78_) {
		Class437 class437_79_ = method6884(class437);
		class437_79_.method6957(class437_78_);
		return class437_79_;
	}

	public final void method6971(float f) {
		aFloat4903 *= f;
		aFloat4904 *= f;
		aFloat4905 *= f;
	}

	public void method6972(float f, float f_80_, float f_81_) {
		aFloat4903 = f;
		aFloat4904 = f_80_;
		aFloat4905 = f_81_;
	}

	public final void method6973(float f) {
		aFloat4903 *= f;
		aFloat4904 *= f;
		aFloat4905 *= f;
	}

	public static final Class437 method6974(Class437 class437, Class437 class437_82_) {
		Class437 class437_83_ = method6884(class437);
		class437_83_.method6897(class437_82_);
		return class437_83_;
	}

	final void method6975(Class437 class437_84_) {
		aFloat4903 /= class437_84_.aFloat4903;
		aFloat4904 /= class437_84_.aFloat4904;
		aFloat4905 /= class437_84_.aFloat4905;
	}

	public static final Class437 method6976(Class437 class437, Class437 class437_85_) {
		Class437 class437_86_ = method6884(class437);
		class437_86_.method6903(class437_85_);
		return class437_86_;
	}

	public static final Class437 method6977(Class437 class437, Class437 class437_87_) {
		Class437 class437_88_ = method6884(class437);
		class437_88_.method6903(class437_87_);
		return class437_88_;
	}

	public static final Class437 method6978(Class437 class437, Class437 class437_89_) {
		Class437 class437_90_ = method6884(class437);
		class437_90_.method6903(class437_89_);
		return class437_90_;
	}

	public final void method6979() {
		float f = 1.0F / method6958();
		aFloat4903 *= f;
		aFloat4904 *= f;
		aFloat4905 *= f;
	}

	public final void method6980(float f) {
		aFloat4903 /= f;
		aFloat4904 /= f;
		aFloat4905 /= f;
	}

	public static final Class437 method6981(Class437 class437, Class437 class437_91_) {
		Class437 class437_92_ = method6884(class437);
		class437_92_.method6897(class437_91_);
		return class437_92_;
	}

	public final void method6982(float f) {
		aFloat4903 /= f;
		aFloat4904 /= f;
		aFloat4905 /= f;
	}

	public final void method6983() {
		aFloat4905 = 0.0F;
		aFloat4904 = 0.0F;
		aFloat4903 = 0.0F;
	}

	public final void method6984(Class437 class437_93_, float f) {
		method6902(1.0F - f);
		method6961(method6906(class437_93_, f));
	}
}
