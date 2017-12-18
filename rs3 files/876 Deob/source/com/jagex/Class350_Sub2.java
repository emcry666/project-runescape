/* Class350_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class350_Sub2 extends Class350 {
	Class270 aClass270_10241;
	Class265 aClass265_10242;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10243;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10244;
	public static float aFloat10245;
	public static float aFloat10246;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10247;
	public static float aFloat10248 = 1.0F;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10249;
	public static float aFloat10250;
	public static float aFloat10251;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10252;
	boolean aBool10253;

	boolean method6154() {
		return (aFloat10248 == 1.0F && aFloat10245 == 0.0F && aFloat10250 == 1.0F && aFloat10251 == 0.0F && aFloat10246 == 1.0F);
	}

	void method6136(int i, Class168_Sub1 class168_sub1, Interface37 interface37, Interface23 interface23, Interface37 interface37_0_, boolean bool) {
		float f = aClass178_Sub2_3640.method15089();
		float f_1_ = (float) class168_sub1.method2875();
		float f_2_ = (float) class168_sub1.method2874();
		float f_3_ = f * 2.0F / f_1_;
		float f_4_ = -f * 2.0F / f_2_;
		float[] fs = { -1.0F + f_3_, 1.0F + f_4_, 0.0F, 0.0F, -1.0F + f_3_, -3.0F + f_4_, 0.0F, 2.0F, 3.0F + f_3_, 1.0F + f_4_, 2.0F, 0.0F };
		int i_5_ = (int) f_1_;
		int i_6_ = (int) f_2_;
		int i_7_ = (bool ? aClass178_Sub2_3640.method3380(2019700155).method2875() : i_5_);
		int i_8_ = (bool ? aClass178_Sub2_3640.method3380(1480965798).method2874() : i_6_);
		aClass265_10242.method4852(aClass270_10241);
		aClass265_10242.method4750();
		float f_9_ = (float) i_5_ / f_1_;
		float f_10_ = (float) i_6_ / f_2_;
		float f_11_ = (float) i_7_ / f_1_;
		float f_12_ = (float) i_8_ / f_2_;
		fs[8] = (fs[8] + 1.0F) * f_9_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_10_ + 1.0F;
		fs[10] *= f_11_;
		fs[7] *= f_12_;
		aClass265_10242.method4770(aClass523_Sub4_Sub1_10247, fs, (byte) -57);
		aClass265_10242.method4836(aClass523_Sub4_Sub1_10243, 0, interface37, -633098919);
		aClass265_10242.method4764(aClass523_Sub4_Sub1_10244, aFloat10248, (byte) 0);
		aClass265_10242.method4767(aClass523_Sub4_Sub1_10249, aFloat10245, aFloat10250, aFloat10251, aFloat10246, -203807194);
		aClass265_10242.method4767(aClass523_Sub4_Sub1_10252, 0.0F, 0.0F, 0.0F, 0.0F, -202041512);
		aClass178_Sub2_3640.method3208(0, 0, i_5_, i_6_);
	}

	int method6147() {
		return 0;
	}

	boolean method6142() {
		if (method6112()) {
			aClass265_10242 = aClass178_Sub2_3640.method15073("FilterLevels");
			if (aClass265_10242 == null)
				return false;
			try {
				aClass523_Sub4_Sub1_10243 = aClass265_10242.method4783("sceneTex", 1399806496);
				aClass523_Sub4_Sub1_10244 = aClass265_10242.method4783("paramsGamma", 793691587);
				aClass523_Sub4_Sub1_10249 = aClass265_10242.method4783("paramsRanges", -166106);
				aClass523_Sub4_Sub1_10252 = aClass265_10242.method4783("pixelOffset", 192241194);
				aClass523_Sub4_Sub1_10247 = aClass265_10242.method4783("PosAndTexCoords", 48987421);
				aClass270_10241 = aClass265_10242.method4755("techAdjust", 760427037);
			} catch (Exception_Sub3_Sub1 exception_sub3_sub1) {
				return false;
			} catch (Exception_Sub3_Sub2 exception_sub3_sub2) {
				return false;
			}
			if (!aClass270_10241.method4927())
				return false;
			aBool10253 = true;
			return true;
		}
		return false;
	}

	void method6116(int i, int i_13_) {
		/* empty */
	}

	static {
		aFloat10245 = 0.0F;
		aFloat10250 = 1.0F;
		aFloat10251 = 0.0F;
		aFloat10246 = 1.0F;
	}

	boolean method6124() {
		return (aFloat10248 == 1.0F && aFloat10245 == 0.0F && aFloat10250 == 1.0F && aFloat10251 == 0.0F && aFloat10246 == 1.0F);
	}

	void method6140(int i, Class168_Sub1 class168_sub1, Interface37 interface37, Interface23 interface23, Interface37 interface37_14_, boolean bool) {
		float f = aClass178_Sub2_3640.method15089();
		float f_15_ = (float) class168_sub1.method2875();
		float f_16_ = (float) class168_sub1.method2874();
		float f_17_ = f * 2.0F / f_15_;
		float f_18_ = -f * 2.0F / f_16_;
		float[] fs = { -1.0F + f_17_, 1.0F + f_18_, 0.0F, 0.0F, -1.0F + f_17_, -3.0F + f_18_, 0.0F, 2.0F, 3.0F + f_17_, 1.0F + f_18_, 2.0F, 0.0F };
		int i_19_ = (int) f_15_;
		int i_20_ = (int) f_16_;
		int i_21_ = (bool ? aClass178_Sub2_3640.method3380(2037942927).method2875() : i_19_);
		int i_22_ = (bool ? aClass178_Sub2_3640.method3380(1875002231).method2874() : i_20_);
		aClass265_10242.method4852(aClass270_10241);
		aClass265_10242.method4750();
		float f_23_ = (float) i_19_ / f_15_;
		float f_24_ = (float) i_20_ / f_16_;
		float f_25_ = (float) i_21_ / f_15_;
		float f_26_ = (float) i_22_ / f_16_;
		fs[8] = (fs[8] + 1.0F) * f_23_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_24_ + 1.0F;
		fs[10] *= f_25_;
		fs[7] *= f_26_;
		aClass265_10242.method4770(aClass523_Sub4_Sub1_10247, fs, (byte) -5);
		aClass265_10242.method4836(aClass523_Sub4_Sub1_10243, 0, interface37, 2016964548);
		aClass265_10242.method4764(aClass523_Sub4_Sub1_10244, aFloat10248, (byte) 0);
		aClass265_10242.method4767(aClass523_Sub4_Sub1_10249, aFloat10245, aFloat10250, aFloat10251, aFloat10246, -1374586373);
		aClass265_10242.method4767(aClass523_Sub4_Sub1_10252, 0.0F, 0.0F, 0.0F, 0.0F, -1862801872);
		aClass178_Sub2_3640.method3208(0, 0, i_19_, i_20_);
	}

	void method6145(int i) {
		aClass265_10242.method4809();
	}

	int method6121() {
		return 0;
	}

	int method6120() {
		return 1;
	}

	int method6146() {
		return 0;
	}

	boolean method6112() {
		return (aClass178_Sub2_3640.aBool9682 && aClass178_Sub2_3640.method15119());
	}

	boolean method6143() {
		return (aClass178_Sub2_3640.aBool9682 && aClass178_Sub2_3640.method15119());
	}

	boolean method6125() {
		return (aClass178_Sub2_3640.aBool9682 && aClass178_Sub2_3640.method15119());
	}

	void method6130() {
		/* empty */
	}

	void method6131() {
		/* empty */
	}

	void method6132(int i, int i_27_) {
		/* empty */
	}

	void method6111(int i, int i_28_) {
		/* empty */
	}

	void method6134(int i, int i_29_) {
		/* empty */
	}

	void method6135(int i, Class168_Sub1 class168_sub1, Interface37 interface37, Interface23 interface23, Interface37 interface37_30_, boolean bool) {
		float f = aClass178_Sub2_3640.method15089();
		float f_31_ = (float) class168_sub1.method2875();
		float f_32_ = (float) class168_sub1.method2874();
		float f_33_ = f * 2.0F / f_31_;
		float f_34_ = -f * 2.0F / f_32_;
		float[] fs = { -1.0F + f_33_, 1.0F + f_34_, 0.0F, 0.0F, -1.0F + f_33_, -3.0F + f_34_, 0.0F, 2.0F, 3.0F + f_33_, 1.0F + f_34_, 2.0F, 0.0F };
		int i_35_ = (int) f_31_;
		int i_36_ = (int) f_32_;
		int i_37_ = (bool ? aClass178_Sub2_3640.method3380(1104837433).method2875() : i_35_);
		int i_38_ = (bool ? aClass178_Sub2_3640.method3380(1651067690).method2874() : i_36_);
		aClass265_10242.method4852(aClass270_10241);
		aClass265_10242.method4750();
		float f_39_ = (float) i_35_ / f_31_;
		float f_40_ = (float) i_36_ / f_32_;
		float f_41_ = (float) i_37_ / f_31_;
		float f_42_ = (float) i_38_ / f_32_;
		fs[8] = (fs[8] + 1.0F) * f_39_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_40_ + 1.0F;
		fs[10] *= f_41_;
		fs[7] *= f_42_;
		aClass265_10242.method4770(aClass523_Sub4_Sub1_10247, fs, (byte) 23);
		aClass265_10242.method4836(aClass523_Sub4_Sub1_10243, 0, interface37, -1764489513);
		aClass265_10242.method4764(aClass523_Sub4_Sub1_10244, aFloat10248, (byte) 0);
		aClass265_10242.method4767(aClass523_Sub4_Sub1_10249, aFloat10245, aFloat10250, aFloat10251, aFloat10246, -385784187);
		aClass265_10242.method4767(aClass523_Sub4_Sub1_10252, 0.0F, 0.0F, 0.0F, 0.0F, -216294932);
		aClass178_Sub2_3640.method3208(0, 0, i_35_, i_36_);
	}

	public Class350_Sub2(Class178_Sub2 class178_sub2) {
		super(class178_sub2);
	}

	void method6119(int i, Class168_Sub1 class168_sub1, Interface37 interface37, Interface23 interface23, Interface37 interface37_43_, boolean bool) {
		float f = aClass178_Sub2_3640.method15089();
		float f_44_ = (float) class168_sub1.method2875();
		float f_45_ = (float) class168_sub1.method2874();
		float f_46_ = f * 2.0F / f_44_;
		float f_47_ = -f * 2.0F / f_45_;
		float[] fs = { -1.0F + f_46_, 1.0F + f_47_, 0.0F, 0.0F, -1.0F + f_46_, -3.0F + f_47_, 0.0F, 2.0F, 3.0F + f_46_, 1.0F + f_47_, 2.0F, 0.0F };
		int i_48_ = (int) f_44_;
		int i_49_ = (int) f_45_;
		int i_50_ = (bool ? aClass178_Sub2_3640.method3380(2030787165).method2875() : i_48_);
		int i_51_ = (bool ? aClass178_Sub2_3640.method3380(819953419).method2874() : i_49_);
		aClass265_10242.method4852(aClass270_10241);
		aClass265_10242.method4750();
		float f_52_ = (float) i_48_ / f_44_;
		float f_53_ = (float) i_49_ / f_45_;
		float f_54_ = (float) i_50_ / f_44_;
		float f_55_ = (float) i_51_ / f_45_;
		fs[8] = (fs[8] + 1.0F) * f_52_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_53_ + 1.0F;
		fs[10] *= f_54_;
		fs[7] *= f_55_;
		aClass265_10242.method4770(aClass523_Sub4_Sub1_10247, fs, (byte) -81);
		aClass265_10242.method4836(aClass523_Sub4_Sub1_10243, 0, interface37, 50577997);
		aClass265_10242.method4764(aClass523_Sub4_Sub1_10244, aFloat10248, (byte) 0);
		aClass265_10242.method4767(aClass523_Sub4_Sub1_10249, aFloat10245, aFloat10250, aFloat10251, aFloat10246, -1222894121);
		aClass265_10242.method4767(aClass523_Sub4_Sub1_10252, 0.0F, 0.0F, 0.0F, 0.0F, -916860802);
		aClass178_Sub2_3640.method3208(0, 0, i_48_, i_49_);
	}

	void method6118(int i) {
		aClass265_10242.method4809();
	}

	void method6139(int i) {
		aClass265_10242.method4809();
	}

	int method6152() {
		return 1;
	}

	boolean method6151() {
		if (method6112()) {
			aClass265_10242 = aClass178_Sub2_3640.method15073("FilterLevels");
			if (aClass265_10242 == null)
				return false;
			try {
				aClass523_Sub4_Sub1_10243 = aClass265_10242.method4783("sceneTex", -873124816);
				aClass523_Sub4_Sub1_10244 = aClass265_10242.method4783("paramsGamma", 825138353);
				aClass523_Sub4_Sub1_10249 = aClass265_10242.method4783("paramsRanges", -1418860630);
				aClass523_Sub4_Sub1_10252 = aClass265_10242.method4783("pixelOffset", 1376301973);
				aClass523_Sub4_Sub1_10247 = aClass265_10242.method4783("PosAndTexCoords", 1148089009);
				aClass270_10241 = aClass265_10242.method4755("techAdjust", 760427037);
			} catch (Exception_Sub3_Sub1 exception_sub3_sub1) {
				return false;
			} catch (Exception_Sub3_Sub2 exception_sub3_sub2) {
				return false;
			}
			if (!aClass270_10241.method4927())
				return false;
			aBool10253 = true;
			return true;
		}
		return false;
	}

	int method6133() {
		return 1;
	}

	int method6141() {
		return 1;
	}

	int method6144() {
		return 0;
	}

	int method6117() {
		return 0;
	}

	boolean method6153() {
		return (aFloat10248 == 1.0F && aFloat10245 == 0.0F && aFloat10250 == 1.0F && aFloat10251 == 0.0F && aFloat10246 == 1.0F);
	}

	int method6114() {
		return 1;
	}

	boolean method6150() {
		return aBool10253;
	}

	void method6115() {
		/* empty */
	}

	boolean method6126() {
		return (aFloat10248 == 1.0F && aFloat10245 == 0.0F && aFloat10250 == 1.0F && aFloat10251 == 0.0F && aFloat10246 == 1.0F);
	}

	int method6138() {
		return 1;
	}

	boolean method6113() {
		return aBool10253;
	}

	boolean method6155() {
		return (aFloat10248 == 1.0F && aFloat10245 == 0.0F && aFloat10250 == 1.0F && aFloat10251 == 0.0F && aFloat10246 == 1.0F);
	}
}
