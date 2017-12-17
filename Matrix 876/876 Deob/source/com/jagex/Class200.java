/* Class200 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class200 implements Interface58 {
	Class217 this$0;
	public static Class613 aClass613_2205;

	Class200(Class217 class217) {
		this$0 = class217;
	}

	public void method376(Object object, float[] fs, Object[] objects, byte i) {
		Class489 class489 = (Class489) object;
		Class437 class437 = class489.method8035(-133871212);
		float f = class489.method7959((byte) 10);
		float f_0_ = class489.method7962(-343868806);
		Class437 class437_1_ = this$0.method3856(-1512329761);
		Class437 class437_2_ = Class437.method6932(class437, class437_1_);
		float f_3_ = 0.0F;
		float f_4_ = class437_2_.method6958();
		if (f_4_ >= f_0_)
			f_3_ = 0.0F;
		else {
			float f_5_ = ((Float) objects[0]).floatValue();
			float f_6_ = ((Float) objects[1]).floatValue();
			if (class437_1_.aFloat4903 > class437.aFloat4903 - f_5_ / 2.0F && class437_1_.aFloat4903 < class437.aFloat4903 + f_5_ / 2.0F && class437_1_.aFloat4905 > class437.aFloat4905 - f_6_ / 2.0F && (class437_1_.aFloat4905 < class437.aFloat4905 + f_6_ / 2.0F)) {
				float f_7_ = Math.abs(class437_1_.aFloat4903 - (class437.aFloat4903 + f_5_ / 2.0F));
				float f_8_ = Math.abs(class437_1_.aFloat4903 - (class437.aFloat4903 - f_5_ / 2.0F));
				float f_9_ = Math.abs(class437_1_.aFloat4905 - (class437.aFloat4903 + f_6_ / 2.0F));
				float f_10_ = Math.abs(class437_1_.aFloat4905 - (class437.aFloat4903 - f_6_ / 2.0F));
				float f_11_ = f_0_ - f;
				float f_12_ = Math.min(f_7_, f_8_);
				float f_13_ = Math.min(f_9_, f_10_);
				float f_14_ = f_12_ * (1.0F / f_11_);
				float f_15_ = 1.0F / f_11_ * f_13_;
				f_14_ = Math.min(Math.max(f_14_, 0.0F), 1.0F);
				f_15_ = Math.min(Math.max(f_15_, 0.0F), 1.0F);
				f_3_ = Math.min(f_14_, f_15_);
			}
		}
		fs[0] = f_3_;
		fs[1] = f_3_;
	}

	public void method378(Object object, float[] fs, Object[] objects) {
		Class489 class489 = (Class489) object;
		Class437 class437 = class489.method8035(1644289045);
		float f = class489.method7959((byte) -34);
		float f_16_ = class489.method7962(188844583);
		Class437 class437_17_ = this$0.method3856(-707772057);
		Class437 class437_18_ = Class437.method6932(class437, class437_17_);
		float f_19_ = 0.0F;
		float f_20_ = class437_18_.method6958();
		if (f_20_ >= f_16_)
			f_19_ = 0.0F;
		else {
			float f_21_ = ((Float) objects[0]).floatValue();
			float f_22_ = ((Float) objects[1]).floatValue();
			if (class437_17_.aFloat4903 > class437.aFloat4903 - f_21_ / 2.0F && class437_17_.aFloat4903 < class437.aFloat4903 + f_21_ / 2.0F && class437_17_.aFloat4905 > class437.aFloat4905 - f_22_ / 2.0F && (class437_17_.aFloat4905 < class437.aFloat4905 + f_22_ / 2.0F)) {
				float f_23_ = Math.abs(class437_17_.aFloat4903 - (class437.aFloat4903 + f_21_ / 2.0F));
				float f_24_ = Math.abs(class437_17_.aFloat4903 - (class437.aFloat4903 - f_21_ / 2.0F));
				float f_25_ = Math.abs(class437_17_.aFloat4905 - (class437.aFloat4903 + f_22_ / 2.0F));
				float f_26_ = Math.abs(class437_17_.aFloat4905 - (class437.aFloat4903 - f_22_ / 2.0F));
				float f_27_ = f_16_ - f;
				float f_28_ = Math.min(f_23_, f_24_);
				float f_29_ = Math.min(f_25_, f_26_);
				float f_30_ = f_28_ * (1.0F / f_27_);
				float f_31_ = 1.0F / f_27_ * f_29_;
				f_30_ = Math.min(Math.max(f_30_, 0.0F), 1.0F);
				f_31_ = Math.min(Math.max(f_31_, 0.0F), 1.0F);
				f_19_ = Math.min(f_30_, f_31_);
			}
		}
		fs[0] = f_19_;
		fs[1] = f_19_;
	}

	public void method377(Object object, float[] fs, Object[] objects) {
		Class489 class489 = (Class489) object;
		Class437 class437 = class489.method8035(-1462825547);
		float f = class489.method7959((byte) -72);
		float f_32_ = class489.method7962(629113233);
		Class437 class437_33_ = this$0.method3856(496053318);
		Class437 class437_34_ = Class437.method6932(class437, class437_33_);
		float f_35_ = 0.0F;
		float f_36_ = class437_34_.method6958();
		if (f_36_ >= f_32_)
			f_35_ = 0.0F;
		else {
			float f_37_ = ((Float) objects[0]).floatValue();
			float f_38_ = ((Float) objects[1]).floatValue();
			if (class437_33_.aFloat4903 > class437.aFloat4903 - f_37_ / 2.0F && class437_33_.aFloat4903 < class437.aFloat4903 + f_37_ / 2.0F && class437_33_.aFloat4905 > class437.aFloat4905 - f_38_ / 2.0F && (class437_33_.aFloat4905 < class437.aFloat4905 + f_38_ / 2.0F)) {
				float f_39_ = Math.abs(class437_33_.aFloat4903 - (class437.aFloat4903 + f_37_ / 2.0F));
				float f_40_ = Math.abs(class437_33_.aFloat4903 - (class437.aFloat4903 - f_37_ / 2.0F));
				float f_41_ = Math.abs(class437_33_.aFloat4905 - (class437.aFloat4903 + f_38_ / 2.0F));
				float f_42_ = Math.abs(class437_33_.aFloat4905 - (class437.aFloat4903 - f_38_ / 2.0F));
				float f_43_ = f_32_ - f;
				float f_44_ = Math.min(f_39_, f_40_);
				float f_45_ = Math.min(f_41_, f_42_);
				float f_46_ = f_44_ * (1.0F / f_43_);
				float f_47_ = 1.0F / f_43_ * f_45_;
				f_46_ = Math.min(Math.max(f_46_, 0.0F), 1.0F);
				f_47_ = Math.min(Math.max(f_47_, 0.0F), 1.0F);
				f_35_ = Math.min(f_46_, f_47_);
			}
		}
		fs[0] = f_35_;
		fs[1] = f_35_;
	}

	public void method379(Object object, float[] fs, Object[] objects) {
		Class489 class489 = (Class489) object;
		Class437 class437 = class489.method8035(-1533212660);
		float f = class489.method7959((byte) 86);
		float f_48_ = class489.method7962(834382826);
		Class437 class437_49_ = this$0.method3856(1942708477);
		Class437 class437_50_ = Class437.method6932(class437, class437_49_);
		float f_51_ = 0.0F;
		float f_52_ = class437_50_.method6958();
		if (f_52_ >= f_48_)
			f_51_ = 0.0F;
		else {
			float f_53_ = ((Float) objects[0]).floatValue();
			float f_54_ = ((Float) objects[1]).floatValue();
			if (class437_49_.aFloat4903 > class437.aFloat4903 - f_53_ / 2.0F && class437_49_.aFloat4903 < class437.aFloat4903 + f_53_ / 2.0F && class437_49_.aFloat4905 > class437.aFloat4905 - f_54_ / 2.0F && (class437_49_.aFloat4905 < class437.aFloat4905 + f_54_ / 2.0F)) {
				float f_55_ = Math.abs(class437_49_.aFloat4903 - (class437.aFloat4903 + f_53_ / 2.0F));
				float f_56_ = Math.abs(class437_49_.aFloat4903 - (class437.aFloat4903 - f_53_ / 2.0F));
				float f_57_ = Math.abs(class437_49_.aFloat4905 - (class437.aFloat4903 + f_54_ / 2.0F));
				float f_58_ = Math.abs(class437_49_.aFloat4905 - (class437.aFloat4903 - f_54_ / 2.0F));
				float f_59_ = f_48_ - f;
				float f_60_ = Math.min(f_55_, f_56_);
				float f_61_ = Math.min(f_57_, f_58_);
				float f_62_ = f_60_ * (1.0F / f_59_);
				float f_63_ = 1.0F / f_59_ * f_61_;
				f_62_ = Math.min(Math.max(f_62_, 0.0F), 1.0F);
				f_63_ = Math.min(Math.max(f_63_, 0.0F), 1.0F);
				f_51_ = Math.min(f_62_, f_63_);
			}
		}
		fs[0] = f_51_;
		fs[1] = f_51_;
	}

	public static void method3689(int i) {
		Class659.aClass207_8504.method3740(-715323100);
	}

	static final void method3690(Class669 class669, int i) {
		Class625.method10223(class669.anIntArray8557[((class669.anInt8558 -= 2138772399) * 1357652815)], (short) -9266);
	}
}
