/* Class429 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class429 {
	public float aFloat4847;
	public float aFloat4848;
	public float aFloat4849;
	public float aFloat4850;

	public void method6760(float f, float f_0_, float f_1_, float f_2_) {
		aFloat4847 = f;
		aFloat4849 = f_0_;
		aFloat4848 = f_1_;
		aFloat4850 = f_2_;
	}

	public Class429(float f, float f_3_, float f_4_, float f_5_) {
		method6773(f, f_3_, f_4_, f_5_);
	}

	public final void method6761(float f) {
		aFloat4847 *= f;
		aFloat4849 *= f;
		aFloat4848 *= f;
		aFloat4850 *= f;
	}

	public final void method6762(Class441 class441) {
		float f = aFloat4847;
		float f_6_ = aFloat4849;
		float f_7_ = aFloat4848;
		float f_8_ = aFloat4850;
		aFloat4847 = (class441.aFloatArray4916[0] * f + class441.aFloatArray4916[4] * f_6_ + class441.aFloatArray4916[8] * f_7_ + class441.aFloatArray4916[12] * f_8_);
		aFloat4849 = (class441.aFloatArray4916[1] * f + class441.aFloatArray4916[5] * f_6_ + class441.aFloatArray4916[9] * f_7_ + class441.aFloatArray4916[13] * f_8_);
		aFloat4848 = (class441.aFloatArray4916[2] * f + class441.aFloatArray4916[6] * f_6_ + class441.aFloatArray4916[10] * f_7_ + class441.aFloatArray4916[14] * f_8_);
		aFloat4850 = (class441.aFloatArray4916[3] * f + class441.aFloatArray4916[7] * f_6_ + class441.aFloatArray4916[11] * f_7_ + class441.aFloatArray4916[15] * f_8_);
	}

	public void method6763(int i) {
		method6773((float) (i >> 16 & 0xff) * 0.003921569F, (float) (i >> 8 & 0xff) * 0.003921569F, (float) (i >> 0 & 0xff) * 0.003921569F, (float) (i >> 24 & 0xff) * 0.003921569F);
	}

	final void method6764() {
		aFloat4850 = 0.0F;
		aFloat4848 = 0.0F;
		aFloat4849 = 0.0F;
		aFloat4847 = 0.0F;
	}

	public final void method6765() {
		aFloat4847 = -aFloat4847;
		aFloat4849 = -aFloat4849;
		aFloat4848 = -aFloat4848;
		aFloat4850 = -aFloat4850;
	}

	public final void method6766(float f) {
		aFloat4847 *= f;
		aFloat4849 *= f;
		aFloat4848 *= f;
		aFloat4850 *= f;
	}

	final void method6767() {
		aFloat4850 = 0.0F;
		aFloat4848 = 0.0F;
		aFloat4849 = 0.0F;
		aFloat4847 = 0.0F;
	}

	public String toString() {
		return new StringBuilder().append(aFloat4847).append(",").append(aFloat4849).append(",").append(aFloat4848).append(",").append(aFloat4850).toString();
	}

	public String method6768() {
		return new StringBuilder().append(aFloat4847).append(",").append(aFloat4849).append(",").append(aFloat4848).append(",").append(aFloat4850).toString();
	}

	final void method6769() {
		aFloat4850 = 0.0F;
		aFloat4848 = 0.0F;
		aFloat4849 = 0.0F;
		aFloat4847 = 0.0F;
	}

	public void method6770(float f, float f_9_, float f_10_, float f_11_) {
		aFloat4847 = f;
		aFloat4849 = f_9_;
		aFloat4848 = f_10_;
		aFloat4850 = f_11_;
	}

	public void method6771(float f, float f_12_, float f_13_, float f_14_) {
		aFloat4847 = f;
		aFloat4849 = f_12_;
		aFloat4848 = f_13_;
		aFloat4850 = f_14_;
	}

	public void method6772(float f, float f_15_, float f_16_, float f_17_) {
		aFloat4847 = f;
		aFloat4849 = f_15_;
		aFloat4848 = f_16_;
		aFloat4850 = f_17_;
	}

	public void method6773(float f, float f_18_, float f_19_, float f_20_) {
		aFloat4847 = f;
		aFloat4849 = f_18_;
		aFloat4848 = f_19_;
		aFloat4850 = f_20_;
	}

	public void method6774(Class429 class429_21_) {
		method6773(class429_21_.aFloat4847, class429_21_.aFloat4849, class429_21_.aFloat4848, class429_21_.aFloat4850);
	}

	public void method6775(Class429 class429_22_) {
		method6773(class429_22_.aFloat4847, class429_22_.aFloat4849, class429_22_.aFloat4848, class429_22_.aFloat4850);
	}

	public void method6776(int i) {
		method6773((float) (i >> 16 & 0xff) * 0.003921569F, (float) (i >> 8 & 0xff) * 0.003921569F, (float) (i >> 0 & 0xff) * 0.003921569F, (float) (i >> 24 & 0xff) * 0.003921569F);
	}

	public void method6777(Class429 class429_23_) {
		method6773(class429_23_.aFloat4847, class429_23_.aFloat4849, class429_23_.aFloat4848, class429_23_.aFloat4850);
	}

	final void method6778() {
		aFloat4850 = 0.0F;
		aFloat4848 = 0.0F;
		aFloat4849 = 0.0F;
		aFloat4847 = 0.0F;
	}

	final void method6779() {
		aFloat4850 = 0.0F;
		aFloat4848 = 0.0F;
		aFloat4849 = 0.0F;
		aFloat4847 = 0.0F;
	}

	public Class429() {
		method6764();
	}

	final void method6780() {
		aFloat4850 = 0.0F;
		aFloat4848 = 0.0F;
		aFloat4849 = 0.0F;
		aFloat4847 = 0.0F;
	}

	final void method6781() {
		aFloat4850 = 0.0F;
		aFloat4848 = 0.0F;
		aFloat4849 = 0.0F;
		aFloat4847 = 0.0F;
	}

	public final void method6782(float f) {
		aFloat4847 *= f;
		aFloat4849 *= f;
		aFloat4848 *= f;
		aFloat4850 *= f;
	}

	public void method6783(Class429 class429_24_) {
		method6773(class429_24_.aFloat4847, class429_24_.aFloat4849, class429_24_.aFloat4848, class429_24_.aFloat4850);
	}

	public final void method6784(float f) {
		aFloat4847 *= f;
		aFloat4849 *= f;
		aFloat4848 *= f;
		aFloat4850 *= f;
	}
}
