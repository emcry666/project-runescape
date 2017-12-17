/* Class430 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class430 {
	public float aFloat4851;
	static float[] aFloatArray4852 = new float[8];
	public float aFloat4853;
	public float aFloat4854;
	public float aFloat4855;
	public float aFloat4856;
	static float[] aFloatArray4857;
	static float[] aFloatArray4858 = new float[8];
	public float aFloat4859;

	public boolean method6785(int i, int i_0_, int i_1_, int i_2_, Class441 class441, float f, float f_3_, float f_4_, float f_5_) {
		boolean bool = false;
		float f_6_ = 3.4028235E38F;
		float f_7_ = -3.4028235E38F;
		float f_8_ = 3.4028235E38F;
		float f_9_ = -3.4028235E38F;
		aFloatArray4852[0] = aFloat4855;
		aFloatArray4858[0] = aFloat4859;
		aFloatArray4857[0] = aFloat4853;
		aFloatArray4852[1] = aFloat4854;
		aFloatArray4858[1] = aFloat4859;
		aFloatArray4857[1] = aFloat4853;
		aFloatArray4852[2] = aFloat4855;
		aFloatArray4858[2] = aFloat4851;
		aFloatArray4857[2] = aFloat4853;
		aFloatArray4852[3] = aFloat4854;
		aFloatArray4858[3] = aFloat4851;
		aFloatArray4857[3] = aFloat4853;
		aFloatArray4852[4] = aFloat4855;
		aFloatArray4858[4] = aFloat4859;
		aFloatArray4857[4] = aFloat4856;
		aFloatArray4852[5] = aFloat4854;
		aFloatArray4858[5] = aFloat4859;
		aFloatArray4857[5] = aFloat4856;
		aFloatArray4852[6] = aFloat4855;
		aFloatArray4858[6] = aFloat4851;
		aFloatArray4857[6] = aFloat4856;
		aFloatArray4852[7] = aFloat4854;
		aFloatArray4858[7] = aFloat4851;
		aFloatArray4857[7] = aFloat4856;
		for (int i_10_ = 0; i_10_ < 8; i_10_++) {
			float f_11_ = aFloatArray4852[i_10_];
			float f_12_ = aFloatArray4858[i_10_];
			float f_13_ = aFloatArray4857[i_10_];
			float f_14_ = (class441.aFloatArray4916[2] * f_11_ + class441.aFloatArray4916[6] * f_12_ + class441.aFloatArray4916[10] * f_13_ + class441.aFloatArray4916[14]);
			float f_15_ = (class441.aFloatArray4916[3] * f_11_ + class441.aFloatArray4916[7] * f_12_ + class441.aFloatArray4916[11] * f_13_ + class441.aFloatArray4916[15]);
			if (f_14_ >= -f_15_) {
				float f_16_ = (class441.aFloatArray4916[0] * f_11_ + class441.aFloatArray4916[4] * f_12_ + class441.aFloatArray4916[8] * f_13_ + class441.aFloatArray4916[12]);
				float f_17_ = (class441.aFloatArray4916[1] * f_11_ + class441.aFloatArray4916[5] * f_12_ + class441.aFloatArray4916[9] * f_13_ + class441.aFloatArray4916[13]);
				float f_18_ = f + f_4_ * f_16_ / f_15_;
				float f_19_ = f_3_ + f_5_ * f_17_ / f_15_;
				if (f_18_ < f_6_)
					f_6_ = f_18_;
				if (f_18_ > f_7_)
					f_7_ = f_18_;
				if (f_19_ < f_8_)
					f_8_ = f_19_;
				if (f_19_ > f_9_)
					f_9_ = f_19_;
				bool = true;
			}
		}
		int i_20_ = i + i_1_;
		int i_21_ = i_0_ + i_2_;
		if (bool && (float) i_20_ > f_6_ && (float) i < f_7_ && (float) i_21_ > f_8_ && (float) i_0_ < f_9_)
			return true;
		return false;
	}

	public boolean method6786(int i, int i_22_, int i_23_, int i_24_, Class441 class441, float f, float f_25_, float f_26_, float f_27_) {
		boolean bool = false;
		float f_28_ = 3.4028235E38F;
		float f_29_ = -3.4028235E38F;
		float f_30_ = 3.4028235E38F;
		float f_31_ = -3.4028235E38F;
		aFloatArray4852[0] = aFloat4855;
		aFloatArray4858[0] = aFloat4859;
		aFloatArray4857[0] = aFloat4853;
		aFloatArray4852[1] = aFloat4854;
		aFloatArray4858[1] = aFloat4859;
		aFloatArray4857[1] = aFloat4853;
		aFloatArray4852[2] = aFloat4855;
		aFloatArray4858[2] = aFloat4851;
		aFloatArray4857[2] = aFloat4853;
		aFloatArray4852[3] = aFloat4854;
		aFloatArray4858[3] = aFloat4851;
		aFloatArray4857[3] = aFloat4853;
		aFloatArray4852[4] = aFloat4855;
		aFloatArray4858[4] = aFloat4859;
		aFloatArray4857[4] = aFloat4856;
		aFloatArray4852[5] = aFloat4854;
		aFloatArray4858[5] = aFloat4859;
		aFloatArray4857[5] = aFloat4856;
		aFloatArray4852[6] = aFloat4855;
		aFloatArray4858[6] = aFloat4851;
		aFloatArray4857[6] = aFloat4856;
		aFloatArray4852[7] = aFloat4854;
		aFloatArray4858[7] = aFloat4851;
		aFloatArray4857[7] = aFloat4856;
		for (int i_32_ = 0; i_32_ < 8; i_32_++) {
			float f_33_ = aFloatArray4852[i_32_];
			float f_34_ = aFloatArray4858[i_32_];
			float f_35_ = aFloatArray4857[i_32_];
			float f_36_ = (class441.aFloatArray4916[2] * f_33_ + class441.aFloatArray4916[6] * f_34_ + class441.aFloatArray4916[10] * f_35_ + class441.aFloatArray4916[14]);
			float f_37_ = (class441.aFloatArray4916[3] * f_33_ + class441.aFloatArray4916[7] * f_34_ + class441.aFloatArray4916[11] * f_35_ + class441.aFloatArray4916[15]);
			if (f_36_ >= -f_37_) {
				float f_38_ = (class441.aFloatArray4916[0] * f_33_ + class441.aFloatArray4916[4] * f_34_ + class441.aFloatArray4916[8] * f_35_ + class441.aFloatArray4916[12]);
				float f_39_ = (class441.aFloatArray4916[1] * f_33_ + class441.aFloatArray4916[5] * f_34_ + class441.aFloatArray4916[9] * f_35_ + class441.aFloatArray4916[13]);
				float f_40_ = f + f_26_ * f_38_ / f_37_;
				float f_41_ = f_25_ + f_27_ * f_39_ / f_37_;
				if (f_40_ < f_28_)
					f_28_ = f_40_;
				if (f_40_ > f_29_)
					f_29_ = f_40_;
				if (f_41_ < f_30_)
					f_30_ = f_41_;
				if (f_41_ > f_31_)
					f_31_ = f_41_;
				bool = true;
			}
		}
		int i_42_ = i + i_23_;
		int i_43_ = i_22_ + i_24_;
		if (bool && (float) i_42_ > f_28_ && (float) i < f_29_ && (float) i_43_ > f_30_ && (float) i_22_ < f_31_)
			return true;
		return false;
	}

	static {
		aFloatArray4857 = new float[8];
	}
}
