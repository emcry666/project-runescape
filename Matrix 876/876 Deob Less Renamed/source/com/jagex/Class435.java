/* Class435 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class435 {
	float aFloat4884;
	float aFloat4885;
	float aFloat4886;
	float aFloat4887;
	float aFloat4888;
	float aFloat4889;
	public static Class435 aClass435_4890 = new Class435();
	float aFloat4891;
	float aFloat4892;
	float aFloat4893;
	float aFloat4894;
	float aFloat4895;
	float aFloat4896;

	public void method6802(Class435 class435_0_) {
		if (class435_0_ == this)
			method6857();
		else {
			aFloat4885 = class435_0_.aFloat4885;
			aFloat4888 = class435_0_.aFloat4893;
			aFloat4891 = class435_0_.aFloat4887;
			aFloat4893 = class435_0_.aFloat4888;
			aFloat4889 = class435_0_.aFloat4889;
			aFloat4886 = class435_0_.aFloat4884;
			aFloat4887 = class435_0_.aFloat4891;
			aFloat4884 = class435_0_.aFloat4886;
			aFloat4892 = class435_0_.aFloat4892;
			aFloat4894 = -(class435_0_.aFloat4894 * aFloat4885 + class435_0_.aFloat4895 * aFloat4888 + class435_0_.aFloat4896 * aFloat4891);
			aFloat4895 = -(class435_0_.aFloat4894 * aFloat4893 + class435_0_.aFloat4895 * aFloat4889 + class435_0_.aFloat4896 * aFloat4886);
			aFloat4896 = -(class435_0_.aFloat4894 * aFloat4887 + class435_0_.aFloat4895 * aFloat4884 + class435_0_.aFloat4896 * aFloat4892);
		}
	}

	public Class435(Class435 class435_1_) {
		method6803(class435_1_);
	}

	public void method6803(Class435 class435_2_) {
		aFloat4885 = class435_2_.aFloat4885;
		aFloat4888 = class435_2_.aFloat4888;
		aFloat4891 = class435_2_.aFloat4891;
		aFloat4894 = class435_2_.aFloat4894;
		aFloat4893 = class435_2_.aFloat4893;
		aFloat4889 = class435_2_.aFloat4889;
		aFloat4886 = class435_2_.aFloat4886;
		aFloat4895 = class435_2_.aFloat4895;
		aFloat4887 = class435_2_.aFloat4887;
		aFloat4884 = class435_2_.aFloat4884;
		aFloat4892 = class435_2_.aFloat4892;
		aFloat4896 = class435_2_.aFloat4896;
	}

	public void method6804(Class432 class432) {
		method6812(class432.aClass440_4863);
		method6825(class432.aClass437_4862);
	}

	public void method6805(float f, float f_3_, float f_4_) {
		aFloat4886 = 0.0F;
		aFloat4891 = 0.0F;
		aFloat4884 = 0.0F;
		aFloat4888 = 0.0F;
		aFloat4887 = 0.0F;
		aFloat4893 = 0.0F;
		aFloat4892 = 1.0F;
		aFloat4889 = 1.0F;
		aFloat4885 = 1.0F;
		aFloat4894 = f;
		aFloat4895 = f_3_;
		aFloat4896 = f_4_;
	}

	public void method6806() {
		aFloat4896 = 0.0F;
		aFloat4895 = 0.0F;
		aFloat4894 = 0.0F;
		aFloat4886 = 0.0F;
		aFloat4891 = 0.0F;
		aFloat4884 = 0.0F;
		aFloat4888 = 0.0F;
		aFloat4887 = 0.0F;
		aFloat4893 = 0.0F;
		aFloat4892 = 1.0F;
		aFloat4889 = 1.0F;
		aFloat4885 = 1.0F;
	}

	public void method6807(double d, double d_5_, double d_6_, double d_7_, double d_8_, double d_9_, float f, float f_10_, float f_11_) {
		float f_12_ = (float) (d_7_ - d);
		float f_13_ = (float) (d_8_ - d_5_);
		float f_14_ = (float) (d_9_ - d_6_);
		float f_15_ = f_10_ * f_14_ - f_11_ * f_13_;
		float f_16_ = f_11_ * f_12_ - f * f_14_;
		float f_17_ = f * f_13_ - f_10_ * f_12_;
		float f_18_ = (float) (1.0 / Math.sqrt((double) (f_15_ * f_15_ + f_16_ * f_16_ + f_17_ * f_17_)));
		float f_19_ = (float) (1.0 / Math.sqrt((double) (f_12_ * f_12_ + f_13_ * f_13_ + f_14_ * f_14_)));
		aFloat4885 = f_15_ * f_18_;
		aFloat4888 = f_16_ * f_18_;
		aFloat4891 = f_17_ * f_18_;
		aFloat4887 = f_12_ * f_19_;
		aFloat4884 = f_13_ * f_19_;
		aFloat4892 = f_14_ * f_19_;
		aFloat4893 = aFloat4884 * aFloat4891 - aFloat4892 * aFloat4888;
		aFloat4889 = aFloat4892 * aFloat4885 - aFloat4887 * aFloat4891;
		aFloat4886 = aFloat4887 * aFloat4888 - aFloat4884 * aFloat4885;
		aFloat4894 = -(float) (d * (double) aFloat4885 + d_5_ * (double) aFloat4888 + d_6_ * (double) aFloat4891);
		aFloat4895 = -(float) (d * (double) aFloat4893 + d_5_ * (double) aFloat4889 + d_6_ * (double) aFloat4886);
		aFloat4896 = -(float) (d * (double) aFloat4887 + d_5_ * (double) aFloat4884 + d_6_ * (double) aFloat4892);
	}

	public float[] method6808(float[] fs) {
		fs[0] = aFloat4894;
		fs[1] = aFloat4895;
		fs[2] = aFloat4896;
		return fs;
	}

	public void method6809(int i, int i_20_, int i_21_, float f, float f_22_, float f_23_) {
		if (i != 0) {
			float f_24_ = Class434.aFloatArray4883[i & 0x3fff];
			float f_25_ = Class434.aFloatArray4882[i & 0x3fff];
			aFloat4892 = 1.0F;
			aFloat4886 = 0.0F;
			aFloat4891 = 0.0F;
			aFloat4884 = 0.0F;
			aFloat4887 = 0.0F;
			aFloat4885 = 2.0F * f_24_ * (float) i_20_;
			aFloat4889 = 2.0F * f_24_ * (float) i_21_;
			aFloat4893 = 2.0F * f_25_ * (float) i_20_;
			aFloat4888 = -2.0F * f_25_ * (float) i_21_;
			aFloat4894 = (float) (2 * i_20_) * (0.5F * f_25_ - 0.5F * f_24_) + f;
			aFloat4895 = (float) (2 * i_21_) * (-0.5F * f_25_ - 0.5F * f_24_) + f_22_;
			aFloat4896 = f_23_;
		} else {
			aFloat4886 = 0.0F;
			aFloat4891 = 0.0F;
			aFloat4884 = 0.0F;
			aFloat4888 = 0.0F;
			aFloat4887 = 0.0F;
			aFloat4893 = 0.0F;
			aFloat4885 = (float) (2 * i_20_);
			aFloat4889 = (float) (2 * i_21_);
			aFloat4892 = 1.0F;
			aFloat4894 = f - (float) i_20_;
			aFloat4895 = f_22_ - (float) i_21_;
			aFloat4896 = f_23_;
		}
	}

	public void method6810(Class432 class432) {
		float f = (class432.aClass440_4863.aFloat4915 * class432.aClass440_4863.aFloat4915);
		float f_26_ = (class432.aClass440_4863.aFloat4915 * class432.aClass440_4863.aFloat4909);
		float f_27_ = (class432.aClass440_4863.aFloat4915 * class432.aClass440_4863.aFloat4913);
		float f_28_ = (class432.aClass440_4863.aFloat4915 * class432.aClass440_4863.aFloat4912);
		float f_29_ = (class432.aClass440_4863.aFloat4909 * class432.aClass440_4863.aFloat4909);
		float f_30_ = (class432.aClass440_4863.aFloat4909 * class432.aClass440_4863.aFloat4913);
		float f_31_ = (class432.aClass440_4863.aFloat4909 * class432.aClass440_4863.aFloat4912);
		float f_32_ = (class432.aClass440_4863.aFloat4913 * class432.aClass440_4863.aFloat4913);
		float f_33_ = (class432.aClass440_4863.aFloat4913 * class432.aClass440_4863.aFloat4912);
		float f_34_ = (class432.aClass440_4863.aFloat4912 * class432.aClass440_4863.aFloat4912);
		aFloat4885 = f_29_ + f - f_34_ - f_32_;
		aFloat4893 = f_30_ + f_28_ + f_30_ + f_28_;
		aFloat4887 = f_31_ - f_27_ - f_27_ + f_31_;
		aFloat4888 = f_30_ - f_28_ - f_28_ + f_30_;
		aFloat4889 = f_32_ + f - f_29_ - f_34_;
		aFloat4884 = f_33_ + f_26_ + f_33_ + f_26_;
		aFloat4891 = f_31_ + f_27_ + f_31_ + f_27_;
		aFloat4886 = f_33_ - f_26_ - f_26_ + f_33_;
		aFloat4892 = f_34_ + f - f_32_ - f_29_;
		aFloat4894 = class432.aClass437_4862.aFloat4903;
		aFloat4895 = class432.aClass437_4862.aFloat4904;
		aFloat4896 = class432.aClass437_4862.aFloat4905;
	}

	public void method6811(float f, float f_35_, float f_36_) {
		aFloat4886 = 0.0F;
		aFloat4891 = 0.0F;
		aFloat4884 = 0.0F;
		aFloat4888 = 0.0F;
		aFloat4887 = 0.0F;
		aFloat4893 = 0.0F;
		aFloat4892 = 1.0F;
		aFloat4889 = 1.0F;
		aFloat4885 = 1.0F;
		aFloat4894 = f;
		aFloat4895 = f_35_;
		aFloat4896 = f_36_;
	}

	public Class435() {
		method6806();
	}

	public void method6812(Class440 class440) {
		method6813(class440.aFloat4909, class440.aFloat4913, class440.aFloat4912, class440.aFloat4915);
	}

	void method6813(float f, float f_37_, float f_38_, float f_39_) {
		float f_40_ = f * f;
		float f_41_ = f * f_37_;
		float f_42_ = f * f_38_;
		float f_43_ = f * f_39_;
		float f_44_ = f_37_ * f_37_;
		float f_45_ = f_37_ * f_38_;
		float f_46_ = f_37_ * f_39_;
		float f_47_ = f_38_ * f_38_;
		float f_48_ = f_38_ * f_39_;
		aFloat4885 = 1.0F - 2.0F * (f_44_ + f_47_);
		aFloat4888 = 2.0F * (f_41_ - f_48_);
		aFloat4891 = 2.0F * (f_42_ + f_46_);
		aFloat4893 = 2.0F * (f_41_ + f_48_);
		aFloat4889 = 1.0F - 2.0F * (f_40_ + f_47_);
		aFloat4886 = 2.0F * (f_45_ - f_43_);
		aFloat4887 = 2.0F * (f_42_ - f_46_);
		aFloat4884 = 2.0F * (f_45_ + f_43_);
		aFloat4892 = 1.0F - 2.0F * (f_40_ + f_44_);
		aFloat4896 = 0.0F;
		aFloat4895 = 0.0F;
		aFloat4894 = 0.0F;
	}

	public void method6814(float f, float f_49_, float f_50_, float f_51_) {
		float f_52_ = (float) Math.cos((double) f_51_);
		float f_53_ = (float) Math.sin((double) f_51_);
		float f_54_ = f_52_ + f * f * (1.0F - f_52_);
		float f_55_ = f_50_ * f_53_ + f_49_ * f * (1.0F - f_52_);
		float f_56_ = -f_49_ * f_53_ + f_50_ * f * (1.0F - f_52_);
		float f_57_ = -f_50_ * f_53_ + f * f_49_ * (1.0F - f_52_);
		float f_58_ = f_52_ + f_49_ * f_49_ * (1.0F - f_52_);
		float f_59_ = f * f_53_ + f_50_ * f_49_ * (1.0F - f_52_);
		float f_60_ = f_49_ * f_53_ + f * f_50_ * (1.0F - f_52_);
		float f_61_ = -f * f_53_ + f_49_ * f_50_ * (1.0F - f_52_);
		float f_62_ = f_52_ + f_50_ * f_50_ * (1.0F - f_52_);
		float f_63_ = aFloat4885;
		float f_64_ = aFloat4893;
		float f_65_ = aFloat4888;
		float f_66_ = aFloat4889;
		float f_67_ = aFloat4891;
		float f_68_ = aFloat4886;
		float f_69_ = aFloat4894;
		float f_70_ = aFloat4895;
		aFloat4885 = f_63_ * f_54_ + f_64_ * f_57_ + aFloat4887 * f_60_;
		aFloat4893 = f_63_ * f_55_ + f_64_ * f_58_ + aFloat4887 * f_61_;
		aFloat4887 = f_63_ * f_56_ + f_64_ * f_59_ + aFloat4887 * f_62_;
		aFloat4888 = f_65_ * f_54_ + f_66_ * f_57_ + aFloat4884 * f_60_;
		aFloat4889 = f_65_ * f_55_ + f_66_ * f_58_ + aFloat4884 * f_61_;
		aFloat4884 = f_65_ * f_56_ + f_66_ * f_59_ + aFloat4884 * f_62_;
		aFloat4891 = f_67_ * f_54_ + f_68_ * f_57_ + aFloat4892 * f_60_;
		aFloat4886 = f_67_ * f_55_ + f_68_ * f_58_ + aFloat4892 * f_61_;
		aFloat4892 = f_67_ * f_56_ + f_68_ * f_59_ + aFloat4892 * f_62_;
		aFloat4894 = f_69_ * f_54_ + f_70_ * f_57_ + aFloat4896 * f_60_;
		aFloat4895 = f_69_ * f_55_ + f_70_ * f_58_ + aFloat4896 * f_61_;
		aFloat4896 = f_69_ * f_56_ + f_70_ * f_59_ + aFloat4896 * f_62_;
	}

	public void method6815(float f, float f_71_, float f_72_) {
		aFloat4885 = f;
		aFloat4888 = 0.0F;
		aFloat4891 = 0.0F;
		aFloat4894 = 0.0F;
		aFloat4893 = 0.0F;
		aFloat4889 = f_71_;
		aFloat4886 = 0.0F;
		aFloat4895 = 0.0F;
		aFloat4887 = 0.0F;
		aFloat4884 = 0.0F;
		aFloat4892 = f_72_;
		aFloat4896 = 0.0F;
	}

	public void method6816(float f, float f_73_, float f_74_) {
		aFloat4885 *= f;
		aFloat4888 *= f;
		aFloat4891 *= f;
		aFloat4894 *= f;
		aFloat4893 *= f_73_;
		aFloat4889 *= f_73_;
		aFloat4886 *= f_73_;
		aFloat4895 *= f_73_;
		aFloat4887 *= f_74_;
		aFloat4884 *= f_74_;
		aFloat4892 *= f_74_;
		aFloat4896 *= f_74_;
	}

	public void method6817(float f, float f_75_, float f_76_) {
		aFloat4886 = 0.0F;
		aFloat4891 = 0.0F;
		aFloat4884 = 0.0F;
		aFloat4888 = 0.0F;
		aFloat4887 = 0.0F;
		aFloat4893 = 0.0F;
		aFloat4892 = 1.0F;
		aFloat4889 = 1.0F;
		aFloat4885 = 1.0F;
		aFloat4894 = f;
		aFloat4895 = f_75_;
		aFloat4896 = f_76_;
	}

	public void method6818(float f, float f_77_, float f_78_, float[] fs) {
		fs[0] = (aFloat4885 * f + aFloat4888 * f_77_ + aFloat4891 * f_78_ + aFloat4894);
		fs[1] = (aFloat4893 * f + aFloat4889 * f_77_ + aFloat4886 * f_78_ + aFloat4895);
		fs[2] = (aFloat4887 * f + aFloat4884 * f_77_ + aFloat4892 * f_78_ + aFloat4896);
	}

	public void method6819(float f, float f_79_, float f_80_) {
		aFloat4894 += f;
		aFloat4895 += f_79_;
		aFloat4896 += f_80_;
	}

	public void method6820(Class435 class435_81_) {
		float f = aFloat4885;
		float f_82_ = aFloat4893;
		float f_83_ = aFloat4888;
		float f_84_ = aFloat4889;
		float f_85_ = aFloat4891;
		float f_86_ = aFloat4886;
		float f_87_ = aFloat4894;
		float f_88_ = aFloat4895;
		float f_89_ = aFloat4887;
		float f_90_ = aFloat4884;
		float f_91_ = aFloat4892;
		float f_92_ = aFloat4896;
		aFloat4885 = (f * class435_81_.aFloat4885 + f_82_ * class435_81_.aFloat4888 + f_89_ * class435_81_.aFloat4891);
		aFloat4893 = (f * class435_81_.aFloat4893 + f_82_ * class435_81_.aFloat4889 + f_89_ * class435_81_.aFloat4886);
		aFloat4887 = (f * class435_81_.aFloat4887 + f_82_ * class435_81_.aFloat4884 + f_89_ * class435_81_.aFloat4892);
		aFloat4888 = (f_83_ * class435_81_.aFloat4885 + f_84_ * class435_81_.aFloat4888 + f_90_ * class435_81_.aFloat4891);
		aFloat4889 = (f_83_ * class435_81_.aFloat4893 + f_84_ * class435_81_.aFloat4889 + f_90_ * class435_81_.aFloat4886);
		aFloat4884 = (f_83_ * class435_81_.aFloat4887 + f_84_ * class435_81_.aFloat4884 + f_90_ * class435_81_.aFloat4892);
		aFloat4891 = (f_85_ * class435_81_.aFloat4885 + f_86_ * class435_81_.aFloat4888 + f_91_ * class435_81_.aFloat4891);
		aFloat4886 = (f_85_ * class435_81_.aFloat4893 + f_86_ * class435_81_.aFloat4889 + f_91_ * class435_81_.aFloat4886);
		aFloat4892 = (f_85_ * class435_81_.aFloat4887 + f_86_ * class435_81_.aFloat4884 + f_91_ * class435_81_.aFloat4892);
		aFloat4894 = (f_87_ * class435_81_.aFloat4885 + f_88_ * class435_81_.aFloat4888 + f_92_ * class435_81_.aFloat4891 + class435_81_.aFloat4894);
		aFloat4895 = (f_87_ * class435_81_.aFloat4893 + f_88_ * class435_81_.aFloat4889 + f_92_ * class435_81_.aFloat4886 + class435_81_.aFloat4895);
		aFloat4896 = (f_87_ * class435_81_.aFloat4887 + f_88_ * class435_81_.aFloat4884 + f_92_ * class435_81_.aFloat4892 + class435_81_.aFloat4896);
	}

	public void method6821(Class435 class435_93_, Class435 class435_94_) {
		aFloat4885 = (class435_93_.aFloat4885 * class435_94_.aFloat4885 + class435_93_.aFloat4893 * class435_94_.aFloat4888 + class435_93_.aFloat4887 * class435_94_.aFloat4891);
		aFloat4893 = (class435_93_.aFloat4885 * class435_94_.aFloat4893 + class435_93_.aFloat4893 * class435_94_.aFloat4889 + class435_93_.aFloat4887 * class435_94_.aFloat4886);
		aFloat4887 = (class435_93_.aFloat4885 * class435_94_.aFloat4887 + class435_93_.aFloat4893 * class435_94_.aFloat4884 + class435_93_.aFloat4887 * class435_94_.aFloat4892);
		aFloat4888 = (class435_93_.aFloat4888 * class435_94_.aFloat4885 + class435_93_.aFloat4889 * class435_94_.aFloat4888 + class435_93_.aFloat4884 * class435_94_.aFloat4891);
		aFloat4889 = (class435_93_.aFloat4888 * class435_94_.aFloat4893 + class435_93_.aFloat4889 * class435_94_.aFloat4889 + class435_93_.aFloat4884 * class435_94_.aFloat4886);
		aFloat4884 = (class435_93_.aFloat4888 * class435_94_.aFloat4887 + class435_93_.aFloat4889 * class435_94_.aFloat4884 + class435_93_.aFloat4884 * class435_94_.aFloat4892);
		aFloat4891 = (class435_93_.aFloat4891 * class435_94_.aFloat4885 + class435_93_.aFloat4886 * class435_94_.aFloat4888 + class435_93_.aFloat4892 * class435_94_.aFloat4891);
		aFloat4886 = (class435_93_.aFloat4891 * class435_94_.aFloat4893 + class435_93_.aFloat4886 * class435_94_.aFloat4889 + class435_93_.aFloat4892 * class435_94_.aFloat4886);
		aFloat4892 = (class435_93_.aFloat4891 * class435_94_.aFloat4887 + class435_93_.aFloat4886 * class435_94_.aFloat4884 + class435_93_.aFloat4892 * class435_94_.aFloat4892);
		aFloat4894 = (class435_93_.aFloat4894 * class435_94_.aFloat4885 + class435_93_.aFloat4895 * class435_94_.aFloat4888 + class435_93_.aFloat4896 * class435_94_.aFloat4891 + class435_94_.aFloat4894);
		aFloat4895 = (class435_93_.aFloat4894 * class435_94_.aFloat4893 + class435_93_.aFloat4895 * class435_94_.aFloat4889 + class435_93_.aFloat4896 * class435_94_.aFloat4886 + class435_94_.aFloat4895);
		aFloat4896 = (class435_93_.aFloat4894 * class435_94_.aFloat4887 + class435_93_.aFloat4895 * class435_94_.aFloat4884 + class435_93_.aFloat4896 * class435_94_.aFloat4892 + class435_94_.aFloat4896);
	}

	public void method6822(float f, float f_95_, float f_96_) {
		aFloat4885 *= f;
		aFloat4888 *= f;
		aFloat4891 *= f;
		aFloat4894 *= f;
		aFloat4893 *= f_95_;
		aFloat4889 *= f_95_;
		aFloat4886 *= f_95_;
		aFloat4895 *= f_95_;
		aFloat4887 *= f_96_;
		aFloat4884 *= f_96_;
		aFloat4892 *= f_96_;
		aFloat4896 *= f_96_;
	}

	public void method6823(float f, float f_97_, float f_98_, float[] fs) {
		f -= aFloat4894;
		f_97_ -= aFloat4895;
		f_98_ -= aFloat4896;
		fs[0] = (float) (int) (aFloat4885 * f + aFloat4893 * f_97_ + aFloat4887 * f_98_);
		fs[1] = (float) (int) (aFloat4888 * f + aFloat4889 * f_97_ + aFloat4884 * f_98_);
		fs[2] = (float) (int) (aFloat4891 * f + aFloat4886 * f_97_ + aFloat4892 * f_98_);
	}

	public void method6824(Class435 class435_99_) {
		if (class435_99_ == this)
			method6857();
		else {
			aFloat4885 = class435_99_.aFloat4885;
			aFloat4888 = class435_99_.aFloat4893;
			aFloat4891 = class435_99_.aFloat4887;
			aFloat4893 = class435_99_.aFloat4888;
			aFloat4889 = class435_99_.aFloat4889;
			aFloat4886 = class435_99_.aFloat4884;
			aFloat4887 = class435_99_.aFloat4891;
			aFloat4884 = class435_99_.aFloat4886;
			aFloat4892 = class435_99_.aFloat4892;
			aFloat4894 = -(class435_99_.aFloat4894 * aFloat4885 + class435_99_.aFloat4895 * aFloat4888 + class435_99_.aFloat4896 * aFloat4891);
			aFloat4895 = -(class435_99_.aFloat4894 * aFloat4893 + class435_99_.aFloat4895 * aFloat4889 + class435_99_.aFloat4896 * aFloat4886);
			aFloat4896 = -(class435_99_.aFloat4894 * aFloat4887 + class435_99_.aFloat4895 * aFloat4884 + class435_99_.aFloat4896 * aFloat4892);
		}
	}

	public void method6825(Class437 class437) {
		method6819(class437.aFloat4903, class437.aFloat4904, class437.aFloat4905);
	}

	public float[] method6826(float[] fs) {
		fs[0] = aFloat4894;
		fs[1] = aFloat4895;
		fs[2] = aFloat4896;
		return fs;
	}

	public float[] method6827(float[] fs) {
		fs[0] = aFloat4885;
		fs[1] = aFloat4893;
		fs[2] = aFloat4887;
		fs[3] = aFloat4888;
		fs[4] = aFloat4889;
		fs[5] = aFloat4884;
		fs[6] = aFloat4891;
		fs[7] = aFloat4886;
		fs[8] = aFloat4892;
		return fs;
	}

	public void method6828(float[] fs) {
		float f = fs[0];
		float f_100_ = fs[1];
		float f_101_ = fs[2];
		fs[0] = aFloat4885 * f + aFloat4893 * f_100_ + aFloat4887 * f_101_;
		fs[1] = aFloat4888 * f + aFloat4889 * f_100_ + aFloat4884 * f_101_;
		fs[2] = aFloat4891 * f + aFloat4886 * f_100_ + aFloat4892 * f_101_;
	}

	public void method6829(Class432 class432) {
		float f = (class432.aClass440_4863.aFloat4915 * class432.aClass440_4863.aFloat4915);
		float f_102_ = (class432.aClass440_4863.aFloat4915 * class432.aClass440_4863.aFloat4909);
		float f_103_ = (class432.aClass440_4863.aFloat4915 * class432.aClass440_4863.aFloat4913);
		float f_104_ = (class432.aClass440_4863.aFloat4915 * class432.aClass440_4863.aFloat4912);
		float f_105_ = (class432.aClass440_4863.aFloat4909 * class432.aClass440_4863.aFloat4909);
		float f_106_ = (class432.aClass440_4863.aFloat4909 * class432.aClass440_4863.aFloat4913);
		float f_107_ = (class432.aClass440_4863.aFloat4909 * class432.aClass440_4863.aFloat4912);
		float f_108_ = (class432.aClass440_4863.aFloat4913 * class432.aClass440_4863.aFloat4913);
		float f_109_ = (class432.aClass440_4863.aFloat4913 * class432.aClass440_4863.aFloat4912);
		float f_110_ = (class432.aClass440_4863.aFloat4912 * class432.aClass440_4863.aFloat4912);
		aFloat4885 = f_105_ + f - f_110_ - f_108_;
		aFloat4893 = f_106_ + f_104_ + f_106_ + f_104_;
		aFloat4887 = f_107_ - f_103_ - f_103_ + f_107_;
		aFloat4888 = f_106_ - f_104_ - f_104_ + f_106_;
		aFloat4889 = f_108_ + f - f_105_ - f_110_;
		aFloat4884 = f_109_ + f_102_ + f_109_ + f_102_;
		aFloat4891 = f_107_ + f_103_ + f_107_ + f_103_;
		aFloat4886 = f_109_ - f_102_ - f_102_ + f_109_;
		aFloat4892 = f_110_ + f - f_108_ - f_105_;
		aFloat4894 = class432.aClass437_4862.aFloat4903;
		aFloat4895 = class432.aClass437_4862.aFloat4904;
		aFloat4896 = class432.aClass437_4862.aFloat4905;
	}

	public void method6830(float f, float f_111_, float f_112_, float f_113_, float f_114_, float f_115_, float f_116_, float f_117_, float f_118_) {
		aFloat4885 = f;
		aFloat4888 = f_113_;
		aFloat4891 = f_116_;
		aFloat4894 = 0.0F;
		aFloat4893 = f_111_;
		aFloat4889 = f_114_;
		aFloat4886 = f_117_;
		aFloat4895 = 0.0F;
		aFloat4887 = f_112_;
		aFloat4884 = f_115_;
		aFloat4892 = f_118_;
		aFloat4896 = 0.0F;
	}

	public void method6831(Class432 class432) {
		method6812(class432.aClass440_4863);
		method6825(class432.aClass437_4862);
	}

	public void method6832(Class432 class432) {
		method6812(class432.aClass440_4863);
		method6825(class432.aClass437_4862);
	}

	public void method6833(Class432 class432) {
		method6812(class432.aClass440_4863);
		method6825(class432.aClass437_4862);
	}

	public void method6834(float f, float f_119_, float f_120_, float f_121_) {
		float f_122_ = (float) Math.cos((double) f_121_);
		float f_123_ = (float) Math.sin((double) f_121_);
		float f_124_ = f_122_ + f * f * (1.0F - f_122_);
		float f_125_ = f_120_ * f_123_ + f_119_ * f * (1.0F - f_122_);
		float f_126_ = -f_119_ * f_123_ + f_120_ * f * (1.0F - f_122_);
		float f_127_ = -f_120_ * f_123_ + f * f_119_ * (1.0F - f_122_);
		float f_128_ = f_122_ + f_119_ * f_119_ * (1.0F - f_122_);
		float f_129_ = f * f_123_ + f_120_ * f_119_ * (1.0F - f_122_);
		float f_130_ = f_119_ * f_123_ + f * f_120_ * (1.0F - f_122_);
		float f_131_ = -f * f_123_ + f_119_ * f_120_ * (1.0F - f_122_);
		float f_132_ = f_122_ + f_120_ * f_120_ * (1.0F - f_122_);
		float f_133_ = aFloat4885;
		float f_134_ = aFloat4893;
		float f_135_ = aFloat4888;
		float f_136_ = aFloat4889;
		float f_137_ = aFloat4891;
		float f_138_ = aFloat4886;
		float f_139_ = aFloat4894;
		float f_140_ = aFloat4895;
		aFloat4885 = f_133_ * f_124_ + f_134_ * f_127_ + aFloat4887 * f_130_;
		aFloat4893 = f_133_ * f_125_ + f_134_ * f_128_ + aFloat4887 * f_131_;
		aFloat4887 = f_133_ * f_126_ + f_134_ * f_129_ + aFloat4887 * f_132_;
		aFloat4888 = f_135_ * f_124_ + f_136_ * f_127_ + aFloat4884 * f_130_;
		aFloat4889 = f_135_ * f_125_ + f_136_ * f_128_ + aFloat4884 * f_131_;
		aFloat4884 = f_135_ * f_126_ + f_136_ * f_129_ + aFloat4884 * f_132_;
		aFloat4891 = f_137_ * f_124_ + f_138_ * f_127_ + aFloat4892 * f_130_;
		aFloat4886 = f_137_ * f_125_ + f_138_ * f_128_ + aFloat4892 * f_131_;
		aFloat4892 = f_137_ * f_126_ + f_138_ * f_129_ + aFloat4892 * f_132_;
		aFloat4894 = f_139_ * f_124_ + f_140_ * f_127_ + aFloat4896 * f_130_;
		aFloat4895 = f_139_ * f_125_ + f_140_ * f_128_ + aFloat4896 * f_131_;
		aFloat4896 = f_139_ * f_126_ + f_140_ * f_129_ + aFloat4896 * f_132_;
	}

	public void method6835(Class432 class432) {
		float f = (class432.aClass440_4863.aFloat4915 * class432.aClass440_4863.aFloat4915);
		float f_141_ = (class432.aClass440_4863.aFloat4915 * class432.aClass440_4863.aFloat4909);
		float f_142_ = (class432.aClass440_4863.aFloat4915 * class432.aClass440_4863.aFloat4913);
		float f_143_ = (class432.aClass440_4863.aFloat4915 * class432.aClass440_4863.aFloat4912);
		float f_144_ = (class432.aClass440_4863.aFloat4909 * class432.aClass440_4863.aFloat4909);
		float f_145_ = (class432.aClass440_4863.aFloat4909 * class432.aClass440_4863.aFloat4913);
		float f_146_ = (class432.aClass440_4863.aFloat4909 * class432.aClass440_4863.aFloat4912);
		float f_147_ = (class432.aClass440_4863.aFloat4913 * class432.aClass440_4863.aFloat4913);
		float f_148_ = (class432.aClass440_4863.aFloat4913 * class432.aClass440_4863.aFloat4912);
		float f_149_ = (class432.aClass440_4863.aFloat4912 * class432.aClass440_4863.aFloat4912);
		aFloat4885 = f_144_ + f - f_149_ - f_147_;
		aFloat4893 = f_145_ + f_143_ + f_145_ + f_143_;
		aFloat4887 = f_146_ - f_142_ - f_142_ + f_146_;
		aFloat4888 = f_145_ - f_143_ - f_143_ + f_145_;
		aFloat4889 = f_147_ + f - f_144_ - f_149_;
		aFloat4884 = f_148_ + f_141_ + f_148_ + f_141_;
		aFloat4891 = f_146_ + f_142_ + f_146_ + f_142_;
		aFloat4886 = f_148_ - f_141_ - f_141_ + f_148_;
		aFloat4892 = f_149_ + f - f_147_ - f_144_;
		aFloat4894 = class432.aClass437_4862.aFloat4903;
		aFloat4895 = class432.aClass437_4862.aFloat4904;
		aFloat4896 = class432.aClass437_4862.aFloat4905;
	}

	public void method6836(Class432 class432) {
		float f = (class432.aClass440_4863.aFloat4915 * class432.aClass440_4863.aFloat4915);
		float f_150_ = (class432.aClass440_4863.aFloat4915 * class432.aClass440_4863.aFloat4909);
		float f_151_ = (class432.aClass440_4863.aFloat4915 * class432.aClass440_4863.aFloat4913);
		float f_152_ = (class432.aClass440_4863.aFloat4915 * class432.aClass440_4863.aFloat4912);
		float f_153_ = (class432.aClass440_4863.aFloat4909 * class432.aClass440_4863.aFloat4909);
		float f_154_ = (class432.aClass440_4863.aFloat4909 * class432.aClass440_4863.aFloat4913);
		float f_155_ = (class432.aClass440_4863.aFloat4909 * class432.aClass440_4863.aFloat4912);
		float f_156_ = (class432.aClass440_4863.aFloat4913 * class432.aClass440_4863.aFloat4913);
		float f_157_ = (class432.aClass440_4863.aFloat4913 * class432.aClass440_4863.aFloat4912);
		float f_158_ = (class432.aClass440_4863.aFloat4912 * class432.aClass440_4863.aFloat4912);
		aFloat4885 = f_153_ + f - f_158_ - f_156_;
		aFloat4893 = f_154_ + f_152_ + f_154_ + f_152_;
		aFloat4887 = f_155_ - f_151_ - f_151_ + f_155_;
		aFloat4888 = f_154_ - f_152_ - f_152_ + f_154_;
		aFloat4889 = f_156_ + f - f_153_ - f_158_;
		aFloat4884 = f_157_ + f_150_ + f_157_ + f_150_;
		aFloat4891 = f_155_ + f_151_ + f_155_ + f_151_;
		aFloat4886 = f_157_ - f_150_ - f_150_ + f_157_;
		aFloat4892 = f_158_ + f - f_156_ - f_153_;
		aFloat4894 = class432.aClass437_4862.aFloat4903;
		aFloat4895 = class432.aClass437_4862.aFloat4904;
		aFloat4896 = class432.aClass437_4862.aFloat4905;
	}

	public void method6837() {
		aFloat4896 = 0.0F;
		aFloat4895 = 0.0F;
		aFloat4894 = 0.0F;
		aFloat4886 = 0.0F;
		aFloat4891 = 0.0F;
		aFloat4884 = 0.0F;
		aFloat4888 = 0.0F;
		aFloat4887 = 0.0F;
		aFloat4893 = 0.0F;
		aFloat4892 = 1.0F;
		aFloat4889 = 1.0F;
		aFloat4885 = 1.0F;
	}

	public void method6838(double d, double d_159_, double d_160_, double d_161_, double d_162_, double d_163_, float f, float f_164_, float f_165_) {
		float f_166_ = (float) (d_161_ - d);
		float f_167_ = (float) (d_162_ - d_159_);
		float f_168_ = (float) (d_163_ - d_160_);
		float f_169_ = f_164_ * f_168_ - f_165_ * f_167_;
		float f_170_ = f_165_ * f_166_ - f * f_168_;
		float f_171_ = f * f_167_ - f_164_ * f_166_;
		float f_172_ = (float) (1.0 / Math.sqrt((double) (f_169_ * f_169_ + f_170_ * f_170_ + f_171_ * f_171_)));
		float f_173_ = (float) (1.0 / Math.sqrt((double) (f_166_ * f_166_ + f_167_ * f_167_ + f_168_ * f_168_)));
		aFloat4885 = f_169_ * f_172_;
		aFloat4888 = f_170_ * f_172_;
		aFloat4891 = f_171_ * f_172_;
		aFloat4887 = f_166_ * f_173_;
		aFloat4884 = f_167_ * f_173_;
		aFloat4892 = f_168_ * f_173_;
		aFloat4893 = aFloat4884 * aFloat4891 - aFloat4892 * aFloat4888;
		aFloat4889 = aFloat4892 * aFloat4885 - aFloat4887 * aFloat4891;
		aFloat4886 = aFloat4887 * aFloat4888 - aFloat4884 * aFloat4885;
		aFloat4894 = -(float) (d * (double) aFloat4885 + d_159_ * (double) aFloat4888 + d_160_ * (double) aFloat4891);
		aFloat4895 = -(float) (d * (double) aFloat4893 + d_159_ * (double) aFloat4889 + d_160_ * (double) aFloat4886);
		aFloat4896 = -(float) (d * (double) aFloat4887 + d_159_ * (double) aFloat4884 + d_160_ * (double) aFloat4892);
	}

	public void method6839(int i, int i_174_, int i_175_, float f, float f_176_, float f_177_) {
		if (i != 0) {
			float f_178_ = Class434.aFloatArray4883[i & 0x3fff];
			float f_179_ = Class434.aFloatArray4882[i & 0x3fff];
			aFloat4892 = 1.0F;
			aFloat4886 = 0.0F;
			aFloat4891 = 0.0F;
			aFloat4884 = 0.0F;
			aFloat4887 = 0.0F;
			aFloat4885 = 2.0F * f_178_ * (float) i_174_;
			aFloat4889 = 2.0F * f_178_ * (float) i_175_;
			aFloat4893 = 2.0F * f_179_ * (float) i_174_;
			aFloat4888 = -2.0F * f_179_ * (float) i_175_;
			aFloat4894 = (float) (2 * i_174_) * (0.5F * f_179_ - 0.5F * f_178_) + f;
			aFloat4895 = (float) (2 * i_175_) * (-0.5F * f_179_ - 0.5F * f_178_) + f_176_;
			aFloat4896 = f_177_;
		} else {
			aFloat4886 = 0.0F;
			aFloat4891 = 0.0F;
			aFloat4884 = 0.0F;
			aFloat4888 = 0.0F;
			aFloat4887 = 0.0F;
			aFloat4893 = 0.0F;
			aFloat4885 = (float) (2 * i_174_);
			aFloat4889 = (float) (2 * i_175_);
			aFloat4892 = 1.0F;
			aFloat4894 = f - (float) i_174_;
			aFloat4895 = f_176_ - (float) i_175_;
			aFloat4896 = f_177_;
		}
	}

	public void method6840(int i, int i_180_, int i_181_, float f, float f_182_, float f_183_) {
		if (i != 0) {
			float f_184_ = Class434.aFloatArray4883[i & 0x3fff];
			float f_185_ = Class434.aFloatArray4882[i & 0x3fff];
			aFloat4892 = 1.0F;
			aFloat4886 = 0.0F;
			aFloat4891 = 0.0F;
			aFloat4884 = 0.0F;
			aFloat4887 = 0.0F;
			aFloat4885 = 2.0F * f_184_ * (float) i_180_;
			aFloat4889 = 2.0F * f_184_ * (float) i_181_;
			aFloat4893 = 2.0F * f_185_ * (float) i_180_;
			aFloat4888 = -2.0F * f_185_ * (float) i_181_;
			aFloat4894 = (float) (2 * i_180_) * (0.5F * f_185_ - 0.5F * f_184_) + f;
			aFloat4895 = (float) (2 * i_181_) * (-0.5F * f_185_ - 0.5F * f_184_) + f_182_;
			aFloat4896 = f_183_;
		} else {
			aFloat4886 = 0.0F;
			aFloat4891 = 0.0F;
			aFloat4884 = 0.0F;
			aFloat4888 = 0.0F;
			aFloat4887 = 0.0F;
			aFloat4893 = 0.0F;
			aFloat4885 = (float) (2 * i_180_);
			aFloat4889 = (float) (2 * i_181_);
			aFloat4892 = 1.0F;
			aFloat4894 = f - (float) i_180_;
			aFloat4895 = f_182_ - (float) i_181_;
			aFloat4896 = f_183_;
		}
	}

	public void method6841(float f, float f_186_, float f_187_) {
		aFloat4885 *= f;
		aFloat4888 *= f;
		aFloat4891 *= f;
		aFloat4894 *= f;
		aFloat4893 *= f_186_;
		aFloat4889 *= f_186_;
		aFloat4886 *= f_186_;
		aFloat4895 *= f_186_;
		aFloat4887 *= f_187_;
		aFloat4884 *= f_187_;
		aFloat4892 *= f_187_;
		aFloat4896 *= f_187_;
	}

	public void method6842(float f, float f_188_, float f_189_, float f_190_, float f_191_, float f_192_, float f_193_, float f_194_, float f_195_) {
		aFloat4885 = f;
		aFloat4888 = f_190_;
		aFloat4891 = f_193_;
		aFloat4894 = 0.0F;
		aFloat4893 = f_188_;
		aFloat4889 = f_191_;
		aFloat4886 = f_194_;
		aFloat4895 = 0.0F;
		aFloat4887 = f_189_;
		aFloat4884 = f_192_;
		aFloat4892 = f_195_;
		aFloat4896 = 0.0F;
	}

	public void method6843(Class435 class435_196_) {
		if (class435_196_ == this)
			method6857();
		else {
			aFloat4885 = class435_196_.aFloat4885;
			aFloat4888 = class435_196_.aFloat4893;
			aFloat4891 = class435_196_.aFloat4887;
			aFloat4893 = class435_196_.aFloat4888;
			aFloat4889 = class435_196_.aFloat4889;
			aFloat4886 = class435_196_.aFloat4884;
			aFloat4887 = class435_196_.aFloat4891;
			aFloat4884 = class435_196_.aFloat4886;
			aFloat4892 = class435_196_.aFloat4892;
			aFloat4894 = -(class435_196_.aFloat4894 * aFloat4885 + class435_196_.aFloat4895 * aFloat4888 + class435_196_.aFloat4896 * aFloat4891);
			aFloat4895 = -(class435_196_.aFloat4894 * aFloat4893 + class435_196_.aFloat4895 * aFloat4889 + class435_196_.aFloat4896 * aFloat4886);
			aFloat4896 = -(class435_196_.aFloat4894 * aFloat4887 + class435_196_.aFloat4895 * aFloat4884 + class435_196_.aFloat4896 * aFloat4892);
		}
	}

	public String method6844() {
		return new StringBuilder().append(aFloat4885).append(",").append(aFloat4888).append(",").append(aFloat4891).append(",").append(aFloat4894).append(" - ").append(aFloat4893).append(",").append(aFloat4889).append(",").append(aFloat4886).append(",").append(aFloat4895).append(" - ").append(aFloat4887).append(",").append(aFloat4884).append(",").append(aFloat4892).append(",").append(aFloat4896).toString();
	}

	public void method6845(Class435 class435_197_, Class435 class435_198_) {
		aFloat4885 = (class435_197_.aFloat4885 * class435_198_.aFloat4885 + class435_197_.aFloat4893 * class435_198_.aFloat4888 + class435_197_.aFloat4887 * class435_198_.aFloat4891);
		aFloat4893 = (class435_197_.aFloat4885 * class435_198_.aFloat4893 + class435_197_.aFloat4893 * class435_198_.aFloat4889 + class435_197_.aFloat4887 * class435_198_.aFloat4886);
		aFloat4887 = (class435_197_.aFloat4885 * class435_198_.aFloat4887 + class435_197_.aFloat4893 * class435_198_.aFloat4884 + class435_197_.aFloat4887 * class435_198_.aFloat4892);
		aFloat4888 = (class435_197_.aFloat4888 * class435_198_.aFloat4885 + class435_197_.aFloat4889 * class435_198_.aFloat4888 + class435_197_.aFloat4884 * class435_198_.aFloat4891);
		aFloat4889 = (class435_197_.aFloat4888 * class435_198_.aFloat4893 + class435_197_.aFloat4889 * class435_198_.aFloat4889 + class435_197_.aFloat4884 * class435_198_.aFloat4886);
		aFloat4884 = (class435_197_.aFloat4888 * class435_198_.aFloat4887 + class435_197_.aFloat4889 * class435_198_.aFloat4884 + class435_197_.aFloat4884 * class435_198_.aFloat4892);
		aFloat4891 = (class435_197_.aFloat4891 * class435_198_.aFloat4885 + class435_197_.aFloat4886 * class435_198_.aFloat4888 + class435_197_.aFloat4892 * class435_198_.aFloat4891);
		aFloat4886 = (class435_197_.aFloat4891 * class435_198_.aFloat4893 + class435_197_.aFloat4886 * class435_198_.aFloat4889 + class435_197_.aFloat4892 * class435_198_.aFloat4886);
		aFloat4892 = (class435_197_.aFloat4891 * class435_198_.aFloat4887 + class435_197_.aFloat4886 * class435_198_.aFloat4884 + class435_197_.aFloat4892 * class435_198_.aFloat4892);
		aFloat4894 = (class435_197_.aFloat4894 * class435_198_.aFloat4885 + class435_197_.aFloat4895 * class435_198_.aFloat4888 + class435_197_.aFloat4896 * class435_198_.aFloat4891 + class435_198_.aFloat4894);
		aFloat4895 = (class435_197_.aFloat4894 * class435_198_.aFloat4893 + class435_197_.aFloat4895 * class435_198_.aFloat4889 + class435_197_.aFloat4896 * class435_198_.aFloat4886 + class435_198_.aFloat4895);
		aFloat4896 = (class435_197_.aFloat4894 * class435_198_.aFloat4887 + class435_197_.aFloat4895 * class435_198_.aFloat4884 + class435_197_.aFloat4896 * class435_198_.aFloat4892 + class435_198_.aFloat4896);
	}

	public void method6846() {
		float f = aFloat4894;
		float f_199_ = aFloat4895;
		float f_200_ = aFloat4888;
		aFloat4888 = aFloat4893;
		aFloat4893 = f_200_;
		float f_201_ = aFloat4891;
		aFloat4891 = aFloat4887;
		aFloat4887 = f_201_;
		float f_202_ = aFloat4886;
		aFloat4886 = aFloat4884;
		aFloat4884 = f_202_;
		aFloat4894 = -(f * aFloat4885 + f_199_ * aFloat4888 + aFloat4896 * aFloat4891);
		aFloat4895 = -(f * aFloat4893 + f_199_ * aFloat4889 + aFloat4896 * aFloat4886);
		aFloat4896 = -(f * aFloat4887 + f_199_ * aFloat4884 + aFloat4896 * aFloat4892);
	}

	public void method6847(float f, float f_203_, float f_204_, float f_205_) {
		float f_206_ = (float) Math.cos((double) f_205_);
		float f_207_ = (float) Math.sin((double) f_205_);
		aFloat4885 = f_206_ + f * f * (1.0F - f_206_);
		aFloat4893 = f_204_ * f_207_ + f_203_ * f * (1.0F - f_206_);
		aFloat4887 = -f_203_ * f_207_ + f_204_ * f * (1.0F - f_206_);
		aFloat4888 = -f_204_ * f_207_ + f * f_203_ * (1.0F - f_206_);
		aFloat4889 = f_206_ + f_203_ * f_203_ * (1.0F - f_206_);
		aFloat4884 = f * f_207_ + f_204_ * f_203_ * (1.0F - f_206_);
		aFloat4891 = f_203_ * f_207_ + f * f_204_ * (1.0F - f_206_);
		aFloat4886 = -f * f_207_ + f_203_ * f_204_ * (1.0F - f_206_);
		aFloat4892 = f_206_ + f_204_ * f_204_ * (1.0F - f_206_);
		aFloat4896 = 0.0F;
		aFloat4895 = 0.0F;
		aFloat4894 = 0.0F;
	}

	public void method6848(float f, float f_208_, float f_209_, float f_210_) {
		float f_211_ = (float) Math.cos((double) f_210_);
		float f_212_ = (float) Math.sin((double) f_210_);
		aFloat4885 = f_211_ + f * f * (1.0F - f_211_);
		aFloat4893 = f_209_ * f_212_ + f_208_ * f * (1.0F - f_211_);
		aFloat4887 = -f_208_ * f_212_ + f_209_ * f * (1.0F - f_211_);
		aFloat4888 = -f_209_ * f_212_ + f * f_208_ * (1.0F - f_211_);
		aFloat4889 = f_211_ + f_208_ * f_208_ * (1.0F - f_211_);
		aFloat4884 = f * f_212_ + f_209_ * f_208_ * (1.0F - f_211_);
		aFloat4891 = f_208_ * f_212_ + f * f_209_ * (1.0F - f_211_);
		aFloat4886 = -f * f_212_ + f_208_ * f_209_ * (1.0F - f_211_);
		aFloat4892 = f_211_ + f_209_ * f_209_ * (1.0F - f_211_);
		aFloat4896 = 0.0F;
		aFloat4895 = 0.0F;
		aFloat4894 = 0.0F;
	}

	public void method6849(Class440 class440) {
		method6813(class440.aFloat4909, class440.aFloat4913, class440.aFloat4912, class440.aFloat4915);
	}

	void method6850(float f, float f_213_, float f_214_, float f_215_) {
		float f_216_ = f * f;
		float f_217_ = f * f_213_;
		float f_218_ = f * f_214_;
		float f_219_ = f * f_215_;
		float f_220_ = f_213_ * f_213_;
		float f_221_ = f_213_ * f_214_;
		float f_222_ = f_213_ * f_215_;
		float f_223_ = f_214_ * f_214_;
		float f_224_ = f_214_ * f_215_;
		aFloat4885 = 1.0F - 2.0F * (f_220_ + f_223_);
		aFloat4888 = 2.0F * (f_217_ - f_224_);
		aFloat4891 = 2.0F * (f_218_ + f_222_);
		aFloat4893 = 2.0F * (f_217_ + f_224_);
		aFloat4889 = 1.0F - 2.0F * (f_216_ + f_223_);
		aFloat4886 = 2.0F * (f_221_ - f_219_);
		aFloat4887 = 2.0F * (f_218_ - f_222_);
		aFloat4884 = 2.0F * (f_221_ + f_219_);
		aFloat4892 = 1.0F - 2.0F * (f_216_ + f_220_);
		aFloat4896 = 0.0F;
		aFloat4895 = 0.0F;
		aFloat4894 = 0.0F;
	}

	public void method6851(float[] fs) {
		float f = fs[0] - aFloat4894;
		float f_225_ = fs[1] - aFloat4895;
		float f_226_ = fs[2] - aFloat4896;
		fs[0] = (float) (int) (aFloat4885 * f + aFloat4893 * f_225_ + aFloat4887 * f_226_);
		fs[1] = (float) (int) (aFloat4888 * f + aFloat4889 * f_225_ + aFloat4884 * f_226_);
		fs[2] = (float) (int) (aFloat4891 * f + aFloat4886 * f_225_ + aFloat4892 * f_226_);
	}

	public void method6852(float f, float f_227_, float f_228_) {
		aFloat4885 = f;
		aFloat4888 = 0.0F;
		aFloat4891 = 0.0F;
		aFloat4894 = 0.0F;
		aFloat4893 = 0.0F;
		aFloat4889 = f_227_;
		aFloat4886 = 0.0F;
		aFloat4895 = 0.0F;
		aFloat4887 = 0.0F;
		aFloat4884 = 0.0F;
		aFloat4892 = f_228_;
		aFloat4896 = 0.0F;
	}

	public void method6853(float[] fs) {
		float f = fs[0] - aFloat4894;
		float f_229_ = fs[1] - aFloat4895;
		float f_230_ = fs[2] - aFloat4896;
		fs[0] = (float) (int) (aFloat4885 * f + aFloat4893 * f_229_ + aFloat4887 * f_230_);
		fs[1] = (float) (int) (aFloat4888 * f + aFloat4889 * f_229_ + aFloat4884 * f_230_);
		fs[2] = (float) (int) (aFloat4891 * f + aFloat4886 * f_229_ + aFloat4892 * f_230_);
	}

	public void method6854(float f, float f_231_, float f_232_) {
		aFloat4885 *= f;
		aFloat4888 *= f;
		aFloat4891 *= f;
		aFloat4894 *= f;
		aFloat4893 *= f_231_;
		aFloat4889 *= f_231_;
		aFloat4886 *= f_231_;
		aFloat4895 *= f_231_;
		aFloat4887 *= f_232_;
		aFloat4884 *= f_232_;
		aFloat4892 *= f_232_;
		aFloat4896 *= f_232_;
	}

	public void method6855(float f, float f_233_, float f_234_, float f_235_) {
		float f_236_ = (float) Math.cos((double) f_235_);
		float f_237_ = (float) Math.sin((double) f_235_);
		aFloat4885 = f_236_ + f * f * (1.0F - f_236_);
		aFloat4893 = f_234_ * f_237_ + f_233_ * f * (1.0F - f_236_);
		aFloat4887 = -f_233_ * f_237_ + f_234_ * f * (1.0F - f_236_);
		aFloat4888 = -f_234_ * f_237_ + f * f_233_ * (1.0F - f_236_);
		aFloat4889 = f_236_ + f_233_ * f_233_ * (1.0F - f_236_);
		aFloat4884 = f * f_237_ + f_234_ * f_233_ * (1.0F - f_236_);
		aFloat4891 = f_233_ * f_237_ + f * f_234_ * (1.0F - f_236_);
		aFloat4886 = -f * f_237_ + f_233_ * f_234_ * (1.0F - f_236_);
		aFloat4892 = f_236_ + f_234_ * f_234_ * (1.0F - f_236_);
		aFloat4896 = 0.0F;
		aFloat4895 = 0.0F;
		aFloat4894 = 0.0F;
	}

	public void method6856(int i, int i_238_, int i_239_, float f, float f_240_, float f_241_) {
		if (i != 0) {
			float f_242_ = Class434.aFloatArray4883[i & 0x3fff];
			float f_243_ = Class434.aFloatArray4882[i & 0x3fff];
			aFloat4892 = 1.0F;
			aFloat4886 = 0.0F;
			aFloat4891 = 0.0F;
			aFloat4884 = 0.0F;
			aFloat4887 = 0.0F;
			aFloat4885 = 2.0F * f_242_ * (float) i_238_;
			aFloat4889 = 2.0F * f_242_ * (float) i_239_;
			aFloat4893 = 2.0F * f_243_ * (float) i_238_;
			aFloat4888 = -2.0F * f_243_ * (float) i_239_;
			aFloat4894 = (float) (2 * i_238_) * (0.5F * f_243_ - 0.5F * f_242_) + f;
			aFloat4895 = (float) (2 * i_239_) * (-0.5F * f_243_ - 0.5F * f_242_) + f_240_;
			aFloat4896 = f_241_;
		} else {
			aFloat4886 = 0.0F;
			aFloat4891 = 0.0F;
			aFloat4884 = 0.0F;
			aFloat4888 = 0.0F;
			aFloat4887 = 0.0F;
			aFloat4893 = 0.0F;
			aFloat4885 = (float) (2 * i_238_);
			aFloat4889 = (float) (2 * i_239_);
			aFloat4892 = 1.0F;
			aFloat4894 = f - (float) i_238_;
			aFloat4895 = f_240_ - (float) i_239_;
			aFloat4896 = f_241_;
		}
	}

	public void method6857() {
		float f = aFloat4894;
		float f_244_ = aFloat4895;
		float f_245_ = aFloat4888;
		aFloat4888 = aFloat4893;
		aFloat4893 = f_245_;
		float f_246_ = aFloat4891;
		aFloat4891 = aFloat4887;
		aFloat4887 = f_246_;
		float f_247_ = aFloat4886;
		aFloat4886 = aFloat4884;
		aFloat4884 = f_247_;
		aFloat4894 = -(f * aFloat4885 + f_244_ * aFloat4888 + aFloat4896 * aFloat4891);
		aFloat4895 = -(f * aFloat4893 + f_244_ * aFloat4889 + aFloat4896 * aFloat4886);
		aFloat4896 = -(f * aFloat4887 + f_244_ * aFloat4884 + aFloat4896 * aFloat4892);
	}

	public void method6858(float f, float f_248_, float f_249_, float[] fs) {
		fs[0] = (aFloat4885 * f + aFloat4888 * f_248_ + aFloat4891 * f_249_ + aFloat4894);
		fs[1] = (aFloat4893 * f + aFloat4889 * f_248_ + aFloat4886 * f_249_ + aFloat4895);
		fs[2] = (aFloat4887 * f + aFloat4884 * f_248_ + aFloat4892 * f_249_ + aFloat4896);
	}

	public void method6859(Class437 class437) {
		method6819(class437.aFloat4903, class437.aFloat4904, class437.aFloat4905);
	}

	public void method6860(float f, float f_250_, float f_251_) {
		aFloat4894 += f;
		aFloat4895 += f_250_;
		aFloat4896 += f_251_;
	}

	public void method6861(Class435 class435_252_) {
		aFloat4885 = class435_252_.aFloat4885;
		aFloat4888 = class435_252_.aFloat4888;
		aFloat4891 = class435_252_.aFloat4891;
		aFloat4894 = class435_252_.aFloat4894;
		aFloat4893 = class435_252_.aFloat4893;
		aFloat4889 = class435_252_.aFloat4889;
		aFloat4886 = class435_252_.aFloat4886;
		aFloat4895 = class435_252_.aFloat4895;
		aFloat4887 = class435_252_.aFloat4887;
		aFloat4884 = class435_252_.aFloat4884;
		aFloat4892 = class435_252_.aFloat4892;
		aFloat4896 = class435_252_.aFloat4896;
	}

	public void method6862(Class437 class437) {
		method6819(class437.aFloat4903, class437.aFloat4904, class437.aFloat4905);
	}

	public void method6863(float f, float f_253_, float f_254_, float[] fs) {
		fs[0] = (aFloat4885 * f + aFloat4888 * f_253_ + aFloat4891 * f_254_ + aFloat4894);
		fs[1] = (aFloat4893 * f + aFloat4889 * f_253_ + aFloat4886 * f_254_ + aFloat4895);
		fs[2] = (aFloat4887 * f + aFloat4884 * f_253_ + aFloat4892 * f_254_ + aFloat4896);
	}

	public void method6864(float f, float f_255_, float f_256_, float[] fs) {
		fs[0] = (aFloat4885 * f + aFloat4888 * f_255_ + aFloat4891 * f_256_ + aFloat4894);
		fs[1] = (aFloat4893 * f + aFloat4889 * f_255_ + aFloat4886 * f_256_ + aFloat4895);
		fs[2] = (aFloat4887 * f + aFloat4884 * f_255_ + aFloat4892 * f_256_ + aFloat4896);
	}

	public void method6865(float f, float f_257_, float f_258_, float[] fs) {
		f -= aFloat4894;
		f_257_ -= aFloat4895;
		f_258_ -= aFloat4896;
		fs[0] = (float) (int) (aFloat4885 * f + aFloat4893 * f_257_ + aFloat4887 * f_258_);
		fs[1] = (float) (int) (aFloat4888 * f + aFloat4889 * f_257_ + aFloat4884 * f_258_);
		fs[2] = (float) (int) (aFloat4891 * f + aFloat4886 * f_257_ + aFloat4892 * f_258_);
	}

	public String toString() {
		return new StringBuilder().append(aFloat4885).append(",").append(aFloat4888).append(",").append(aFloat4891).append(",").append(aFloat4894).append(" - ").append(aFloat4893).append(",").append(aFloat4889).append(",").append(aFloat4886).append(",").append(aFloat4895).append(" - ").append(aFloat4887).append(",").append(aFloat4884).append(",").append(aFloat4892).append(",").append(aFloat4896).toString();
	}

	public void method6866(float f, float f_259_, float f_260_, float[] fs) {
		f -= aFloat4894;
		f_259_ -= aFloat4895;
		f_260_ -= aFloat4896;
		fs[0] = (float) (int) (aFloat4885 * f + aFloat4893 * f_259_ + aFloat4887 * f_260_);
		fs[1] = (float) (int) (aFloat4888 * f + aFloat4889 * f_259_ + aFloat4884 * f_260_);
		fs[2] = (float) (int) (aFloat4891 * f + aFloat4886 * f_259_ + aFloat4892 * f_260_);
	}

	public void method6867(Class435 class435_261_, Class435 class435_262_) {
		aFloat4885 = (class435_261_.aFloat4885 * class435_262_.aFloat4885 + class435_261_.aFloat4893 * class435_262_.aFloat4888 + class435_261_.aFloat4887 * class435_262_.aFloat4891);
		aFloat4893 = (class435_261_.aFloat4885 * class435_262_.aFloat4893 + class435_261_.aFloat4893 * class435_262_.aFloat4889 + class435_261_.aFloat4887 * class435_262_.aFloat4886);
		aFloat4887 = (class435_261_.aFloat4885 * class435_262_.aFloat4887 + class435_261_.aFloat4893 * class435_262_.aFloat4884 + class435_261_.aFloat4887 * class435_262_.aFloat4892);
		aFloat4888 = (class435_261_.aFloat4888 * class435_262_.aFloat4885 + class435_261_.aFloat4889 * class435_262_.aFloat4888 + class435_261_.aFloat4884 * class435_262_.aFloat4891);
		aFloat4889 = (class435_261_.aFloat4888 * class435_262_.aFloat4893 + class435_261_.aFloat4889 * class435_262_.aFloat4889 + class435_261_.aFloat4884 * class435_262_.aFloat4886);
		aFloat4884 = (class435_261_.aFloat4888 * class435_262_.aFloat4887 + class435_261_.aFloat4889 * class435_262_.aFloat4884 + class435_261_.aFloat4884 * class435_262_.aFloat4892);
		aFloat4891 = (class435_261_.aFloat4891 * class435_262_.aFloat4885 + class435_261_.aFloat4886 * class435_262_.aFloat4888 + class435_261_.aFloat4892 * class435_262_.aFloat4891);
		aFloat4886 = (class435_261_.aFloat4891 * class435_262_.aFloat4893 + class435_261_.aFloat4886 * class435_262_.aFloat4889 + class435_261_.aFloat4892 * class435_262_.aFloat4886);
		aFloat4892 = (class435_261_.aFloat4891 * class435_262_.aFloat4887 + class435_261_.aFloat4886 * class435_262_.aFloat4884 + class435_261_.aFloat4892 * class435_262_.aFloat4892);
		aFloat4894 = (class435_261_.aFloat4894 * class435_262_.aFloat4885 + class435_261_.aFloat4895 * class435_262_.aFloat4888 + class435_261_.aFloat4896 * class435_262_.aFloat4891 + class435_262_.aFloat4894);
		aFloat4895 = (class435_261_.aFloat4894 * class435_262_.aFloat4893 + class435_261_.aFloat4895 * class435_262_.aFloat4889 + class435_261_.aFloat4896 * class435_262_.aFloat4886 + class435_262_.aFloat4895);
		aFloat4896 = (class435_261_.aFloat4894 * class435_262_.aFloat4887 + class435_261_.aFloat4895 * class435_262_.aFloat4884 + class435_261_.aFloat4896 * class435_262_.aFloat4892 + class435_262_.aFloat4896);
	}

	public void method6868(float[] fs) {
		float f = fs[0];
		float f_263_ = fs[1];
		float f_264_ = fs[2];
		fs[0] = aFloat4885 * f + aFloat4893 * f_263_ + aFloat4887 * f_264_;
		fs[1] = aFloat4888 * f + aFloat4889 * f_263_ + aFloat4884 * f_264_;
		fs[2] = aFloat4891 * f + aFloat4886 * f_263_ + aFloat4892 * f_264_;
	}

	public void method6869(Class435 class435_265_) {
		if (class435_265_ == this)
			method6857();
		else {
			aFloat4885 = class435_265_.aFloat4885;
			aFloat4888 = class435_265_.aFloat4893;
			aFloat4891 = class435_265_.aFloat4887;
			aFloat4893 = class435_265_.aFloat4888;
			aFloat4889 = class435_265_.aFloat4889;
			aFloat4886 = class435_265_.aFloat4884;
			aFloat4887 = class435_265_.aFloat4891;
			aFloat4884 = class435_265_.aFloat4886;
			aFloat4892 = class435_265_.aFloat4892;
			aFloat4894 = -(class435_265_.aFloat4894 * aFloat4885 + class435_265_.aFloat4895 * aFloat4888 + class435_265_.aFloat4896 * aFloat4891);
			aFloat4895 = -(class435_265_.aFloat4894 * aFloat4893 + class435_265_.aFloat4895 * aFloat4889 + class435_265_.aFloat4896 * aFloat4886);
			aFloat4896 = -(class435_265_.aFloat4894 * aFloat4887 + class435_265_.aFloat4895 * aFloat4884 + class435_265_.aFloat4896 * aFloat4892);
		}
	}
}
