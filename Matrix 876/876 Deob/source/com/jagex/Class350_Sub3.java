/* Class350_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class350_Sub3 extends Class350 {
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10263;
	public static float aFloat10264 = 0.25F;
	Class270 aClass270_10265;
	public static float aFloat10266;
	static final int anInt10267 = 256;
	public static float aFloat10268 = 1.0F;
	Class270 aClass270_10269;
	Class265 aClass265_10270;
	public static float aFloat10271;
	Class270 aClass270_10272;
	Class270 aClass270_10273;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10274;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10275;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10276;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10277;
	Class270 aClass270_10278;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10279;
	boolean aBool10280;

	void method6116(int i, int i_0_) {
		/* empty */
	}

	int method6121() {
		return 1;
	}

	boolean method6113() {
		return aBool10280;
	}

	boolean method6142() {
		if (method6112()) {
			aClass265_10270 = aClass178_Sub2_3640.method15073("FilterBloom");
			if (aClass265_10270 == null)
				return false;
			try {
				aClass523_Sub4_Sub1_10274 = aClass265_10270.method4783("sceneTex", -42708891);
				aClass523_Sub4_Sub1_10275 = aClass265_10270.method4783("bloomTex1", -2144970393);
				aClass523_Sub4_Sub1_10276 = aClass265_10270.method4783("params", 325150655);
				aClass523_Sub4_Sub1_10277 = aClass265_10270.method4783("sampleSize", 1157214075);
				aClass523_Sub4_Sub1_10263 = aClass265_10270.method4783("pixelOffsetAndBloomScale", 960203352);
				aClass523_Sub4_Sub1_10279 = aClass265_10270.method4783("PosAndTexCoords", 1043926193);
				aClass265_10270.method4755("test", 760427037);
				aClass270_10269 = aClass265_10270.method4755("techFullscreenTri", 760427037);
				aClass270_10265 = aClass265_10270.method4755("brightpass", 760427037);
				aClass270_10278 = aClass265_10270.method4755("blur", 760427037);
				aClass270_10272 = aClass265_10270.method4755("composite", 760427037);
				aClass270_10273 = aClass265_10270.method4755("techDefault", 760427037);
			} catch (Exception_Sub3_Sub1 exception_sub3_sub1) {
				return false;
			} catch (Exception_Sub3_Sub2 exception_sub3_sub2) {
				return false;
			}
			if (!aClass270_10269.method4927())
				return false;
			if (!aClass270_10265.method4927())
				return false;
			if (!aClass270_10278.method4927())
				return false;
			if (!aClass270_10272.method4927())
				return false;
			if (!aClass270_10273.method4927())
				return false;
			aBool10280 = true;
			return true;
		}
		return false;
	}

	int method6133() {
		return 4;
	}

	void method6115() {
		/* empty */
	}

	void method6145(int i) {
		aClass265_10270.method4809();
	}

	void method6131() {
		/* empty */
	}

	void method6132(int i, int i_1_) {
		/* empty */
	}

	boolean method6154() {
		return false;
	}

	int method6120() {
		return 0;
	}

	boolean method6124() {
		return false;
	}

	boolean method6155() {
		return false;
	}

	boolean method6143() {
		return (aClass178_Sub2_3640.aBool9682 && aClass178_Sub2_3640.method15119() && aClass178_Sub2_3640.method15061(true));
	}

	boolean method6125() {
		return (aClass178_Sub2_3640.aBool9682 && aClass178_Sub2_3640.method15119() && aClass178_Sub2_3640.method15061(true));
	}

	boolean method6112() {
		return (aClass178_Sub2_3640.aBool9682 && aClass178_Sub2_3640.method15119() && aClass178_Sub2_3640.method15061(true));
	}

	static {
		aFloat10266 = 1.0F;
		aFloat10271 = 1.0F;
	}

	void method6111(int i, int i_2_) {
		/* empty */
	}

	void method6140(int i, Class168_Sub1 class168_sub1, Interface37 interface37, Interface23 interface23, Interface37 interface37_3_, boolean bool) {
		float f = aClass178_Sub2_3640.method15089();
		float f_4_ = (float) class168_sub1.method2875();
		float f_5_ = (float) class168_sub1.method2874();
		Interface37 interface37_6_ = interface37;
		float f_7_ = f * 2.0F / f_4_;
		float f_8_ = -f * 2.0F / f_5_;
		float[] fs = { -1.0F + f_7_, 1.0F + f_8_, 0.0F, 0.0F, -1.0F + f_7_, -3.0F + f_8_, 0.0F, 2.0F, 3.0F + f_7_, 1.0F + f_8_, 2.0F, 0.0F };
		int i_9_ = (int) f_4_;
		int i_10_ = (int) f_5_;
		int i_11_ = (bool ? aClass178_Sub2_3640.method3380(1625547291).method2875() : i_9_);
		int i_12_ = (bool ? aClass178_Sub2_3640.method3380(995040835).method2874() : i_10_);
		if (i == 0) {
			i_9_ = 256;
			i_10_ = 256;
			aClass265_10270.method4852(aClass270_10265);
			aClass265_10270.method4750();
		} else if (i == 1) {
			i_9_ = 256;
			i_10_ = 256;
			i_11_ = i_9_;
			i_12_ = i_10_;
			aClass265_10270.method4852(aClass270_10278);
			aClass265_10270.method4750();
			aClass265_10270.method4867(aClass523_Sub4_Sub1_10277, aFloat10271 / f_4_, 0.0F, (byte) 55);
		} else if (i == 2) {
			i_9_ = 256;
			i_10_ = 256;
			i_11_ = i_9_;
			i_12_ = i_10_;
			aClass265_10270.method4852(aClass270_10278);
			aClass265_10270.method4750();
			aClass265_10270.method4867(aClass523_Sub4_Sub1_10277, 0.0F, aFloat10271 / f_5_, (byte) 25);
		} else if (i == 3) {
			aClass265_10270.method4852(aClass270_10272);
			interface37_6_ = interface37_3_;
			aClass265_10270.method4836(aClass523_Sub4_Sub1_10275, 1, interface37, -39650581);
			aClass265_10270.method4750();
		}
		float f_13_ = (float) i_9_ / f_4_;
		float f_14_ = (float) i_10_ / f_5_;
		float f_15_ = (float) i_11_ / f_4_;
		float f_16_ = (float) i_12_ / f_5_;
		fs[8] = (fs[8] + 1.0F) * f_13_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_14_ + 1.0F;
		fs[10] *= f_15_;
		fs[7] *= f_16_;
		aClass265_10270.method4770(aClass523_Sub4_Sub1_10279, fs, (byte) 28);
		aClass265_10270.method4836(aClass523_Sub4_Sub1_10274, 0, interface37_6_, 1018940077);
		aClass265_10270.method4767(aClass523_Sub4_Sub1_10276, aFloat10266, aFloat10264, aFloat10268, 0.0F, -447950798);
		aClass265_10270.method4767(aClass523_Sub4_Sub1_10263, 0.0F, 0.0F, 256.0F / f_4_, 256.0F / f_5_, -1705693542);
		aClass178_Sub2_3640.method3208(0, 0, i_9_, i_10_);
	}

	void method6134(int i, int i_17_) {
		/* empty */
	}

	void method6135(int i, Class168_Sub1 class168_sub1, Interface37 interface37, Interface23 interface23, Interface37 interface37_18_, boolean bool) {
		float f = aClass178_Sub2_3640.method15089();
		float f_19_ = (float) class168_sub1.method2875();
		float f_20_ = (float) class168_sub1.method2874();
		Interface37 interface37_21_ = interface37;
		float f_22_ = f * 2.0F / f_19_;
		float f_23_ = -f * 2.0F / f_20_;
		float[] fs = { -1.0F + f_22_, 1.0F + f_23_, 0.0F, 0.0F, -1.0F + f_22_, -3.0F + f_23_, 0.0F, 2.0F, 3.0F + f_22_, 1.0F + f_23_, 2.0F, 0.0F };
		int i_24_ = (int) f_19_;
		int i_25_ = (int) f_20_;
		int i_26_ = (bool ? aClass178_Sub2_3640.method3380(988227874).method2875() : i_24_);
		int i_27_ = (bool ? aClass178_Sub2_3640.method3380(889090583).method2874() : i_25_);
		if (i == 0) {
			i_24_ = 256;
			i_25_ = 256;
			aClass265_10270.method4852(aClass270_10265);
			aClass265_10270.method4750();
		} else if (i == 1) {
			i_24_ = 256;
			i_25_ = 256;
			i_26_ = i_24_;
			i_27_ = i_25_;
			aClass265_10270.method4852(aClass270_10278);
			aClass265_10270.method4750();
			aClass265_10270.method4867(aClass523_Sub4_Sub1_10277, aFloat10271 / f_19_, 0.0F, (byte) -6);
		} else if (i == 2) {
			i_24_ = 256;
			i_25_ = 256;
			i_26_ = i_24_;
			i_27_ = i_25_;
			aClass265_10270.method4852(aClass270_10278);
			aClass265_10270.method4750();
			aClass265_10270.method4867(aClass523_Sub4_Sub1_10277, 0.0F, aFloat10271 / f_20_, (byte) -19);
		} else if (i == 3) {
			aClass265_10270.method4852(aClass270_10272);
			interface37_21_ = interface37_18_;
			aClass265_10270.method4836(aClass523_Sub4_Sub1_10275, 1, interface37, -211371306);
			aClass265_10270.method4750();
		}
		float f_28_ = (float) i_24_ / f_19_;
		float f_29_ = (float) i_25_ / f_20_;
		float f_30_ = (float) i_26_ / f_19_;
		float f_31_ = (float) i_27_ / f_20_;
		fs[8] = (fs[8] + 1.0F) * f_28_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_29_ + 1.0F;
		fs[10] *= f_30_;
		fs[7] *= f_31_;
		aClass265_10270.method4770(aClass523_Sub4_Sub1_10279, fs, (byte) 0);
		aClass265_10270.method4836(aClass523_Sub4_Sub1_10274, 0, interface37_21_, -1160061504);
		aClass265_10270.method4767(aClass523_Sub4_Sub1_10276, aFloat10266, aFloat10264, aFloat10268, 0.0F, -968399997);
		aClass265_10270.method4767(aClass523_Sub4_Sub1_10263, 0.0F, 0.0F, 256.0F / f_19_, 256.0F / f_20_, -1561708473);
		aClass178_Sub2_3640.method3208(0, 0, i_24_, i_25_);
	}

	void method6136(int i, Class168_Sub1 class168_sub1, Interface37 interface37, Interface23 interface23, Interface37 interface37_32_, boolean bool) {
		float f = aClass178_Sub2_3640.method15089();
		float f_33_ = (float) class168_sub1.method2875();
		float f_34_ = (float) class168_sub1.method2874();
		Interface37 interface37_35_ = interface37;
		float f_36_ = f * 2.0F / f_33_;
		float f_37_ = -f * 2.0F / f_34_;
		float[] fs = { -1.0F + f_36_, 1.0F + f_37_, 0.0F, 0.0F, -1.0F + f_36_, -3.0F + f_37_, 0.0F, 2.0F, 3.0F + f_36_, 1.0F + f_37_, 2.0F, 0.0F };
		int i_38_ = (int) f_33_;
		int i_39_ = (int) f_34_;
		int i_40_ = (bool ? aClass178_Sub2_3640.method3380(1986396454).method2875() : i_38_);
		int i_41_ = (bool ? aClass178_Sub2_3640.method3380(1048960718).method2874() : i_39_);
		if (i == 0) {
			i_38_ = 256;
			i_39_ = 256;
			aClass265_10270.method4852(aClass270_10265);
			aClass265_10270.method4750();
		} else if (i == 1) {
			i_38_ = 256;
			i_39_ = 256;
			i_40_ = i_38_;
			i_41_ = i_39_;
			aClass265_10270.method4852(aClass270_10278);
			aClass265_10270.method4750();
			aClass265_10270.method4867(aClass523_Sub4_Sub1_10277, aFloat10271 / f_33_, 0.0F, (byte) 55);
		} else if (i == 2) {
			i_38_ = 256;
			i_39_ = 256;
			i_40_ = i_38_;
			i_41_ = i_39_;
			aClass265_10270.method4852(aClass270_10278);
			aClass265_10270.method4750();
			aClass265_10270.method4867(aClass523_Sub4_Sub1_10277, 0.0F, aFloat10271 / f_34_, (byte) 66);
		} else if (i == 3) {
			aClass265_10270.method4852(aClass270_10272);
			interface37_35_ = interface37_32_;
			aClass265_10270.method4836(aClass523_Sub4_Sub1_10275, 1, interface37, 683008871);
			aClass265_10270.method4750();
		}
		float f_42_ = (float) i_38_ / f_33_;
		float f_43_ = (float) i_39_ / f_34_;
		float f_44_ = (float) i_40_ / f_33_;
		float f_45_ = (float) i_41_ / f_34_;
		fs[8] = (fs[8] + 1.0F) * f_42_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_43_ + 1.0F;
		fs[10] *= f_44_;
		fs[7] *= f_45_;
		aClass265_10270.method4770(aClass523_Sub4_Sub1_10279, fs, (byte) -89);
		aClass265_10270.method4836(aClass523_Sub4_Sub1_10274, 0, interface37_35_, -256201744);
		aClass265_10270.method4767(aClass523_Sub4_Sub1_10276, aFloat10266, aFloat10264, aFloat10268, 0.0F, -1321737305);
		aClass265_10270.method4767(aClass523_Sub4_Sub1_10263, 0.0F, 0.0F, 256.0F / f_33_, 256.0F / f_34_, -2041719229);
		aClass178_Sub2_3640.method3208(0, 0, i_38_, i_39_);
	}

	void method6119(int i, Class168_Sub1 class168_sub1, Interface37 interface37, Interface23 interface23, Interface37 interface37_46_, boolean bool) {
		float f = aClass178_Sub2_3640.method15089();
		float f_47_ = (float) class168_sub1.method2875();
		float f_48_ = (float) class168_sub1.method2874();
		Interface37 interface37_49_ = interface37;
		float f_50_ = f * 2.0F / f_47_;
		float f_51_ = -f * 2.0F / f_48_;
		float[] fs = { -1.0F + f_50_, 1.0F + f_51_, 0.0F, 0.0F, -1.0F + f_50_, -3.0F + f_51_, 0.0F, 2.0F, 3.0F + f_50_, 1.0F + f_51_, 2.0F, 0.0F };
		int i_52_ = (int) f_47_;
		int i_53_ = (int) f_48_;
		int i_54_ = (bool ? aClass178_Sub2_3640.method3380(1183922718).method2875() : i_52_);
		int i_55_ = (bool ? aClass178_Sub2_3640.method3380(1968486387).method2874() : i_53_);
		if (i == 0) {
			i_52_ = 256;
			i_53_ = 256;
			aClass265_10270.method4852(aClass270_10265);
			aClass265_10270.method4750();
		} else if (i == 1) {
			i_52_ = 256;
			i_53_ = 256;
			i_54_ = i_52_;
			i_55_ = i_53_;
			aClass265_10270.method4852(aClass270_10278);
			aClass265_10270.method4750();
			aClass265_10270.method4867(aClass523_Sub4_Sub1_10277, aFloat10271 / f_47_, 0.0F, (byte) 82);
		} else if (i == 2) {
			i_52_ = 256;
			i_53_ = 256;
			i_54_ = i_52_;
			i_55_ = i_53_;
			aClass265_10270.method4852(aClass270_10278);
			aClass265_10270.method4750();
			aClass265_10270.method4867(aClass523_Sub4_Sub1_10277, 0.0F, aFloat10271 / f_48_, (byte) 24);
		} else if (i == 3) {
			aClass265_10270.method4852(aClass270_10272);
			interface37_49_ = interface37_46_;
			aClass265_10270.method4836(aClass523_Sub4_Sub1_10275, 1, interface37, 254037640);
			aClass265_10270.method4750();
		}
		float f_56_ = (float) i_52_ / f_47_;
		float f_57_ = (float) i_53_ / f_48_;
		float f_58_ = (float) i_54_ / f_47_;
		float f_59_ = (float) i_55_ / f_48_;
		fs[8] = (fs[8] + 1.0F) * f_56_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_57_ + 1.0F;
		fs[10] *= f_58_;
		fs[7] *= f_59_;
		aClass265_10270.method4770(aClass523_Sub4_Sub1_10279, fs, (byte) -49);
		aClass265_10270.method4836(aClass523_Sub4_Sub1_10274, 0, interface37_49_, 971556167);
		aClass265_10270.method4767(aClass523_Sub4_Sub1_10276, aFloat10266, aFloat10264, aFloat10268, 0.0F, -537188901);
		aClass265_10270.method4767(aClass523_Sub4_Sub1_10263, 0.0F, 0.0F, 256.0F / f_47_, 256.0F / f_48_, -1084197546);
		aClass178_Sub2_3640.method3208(0, 0, i_52_, i_53_);
	}

	int method6117() {
		return 1;
	}

	void method6139(int i) {
		aClass265_10270.method4809();
	}

	int method6152() {
		return 4;
	}

	int method6114() {
		return 4;
	}

	int method6138() {
		return 0;
	}

	int method6141() {
		return 0;
	}

	int method6144() {
		return 1;
	}

	public Class350_Sub3(Class178_Sub2 class178_sub2) {
		super(class178_sub2);
	}

	int method6146() {
		return 1;
	}

	int method6147() {
		return 1;
	}

	boolean method6150() {
		return aBool10280;
	}

	boolean method6151() {
		if (method6112()) {
			aClass265_10270 = aClass178_Sub2_3640.method15073("FilterBloom");
			if (aClass265_10270 == null)
				return false;
			try {
				aClass523_Sub4_Sub1_10274 = aClass265_10270.method4783("sceneTex", 40727967);
				aClass523_Sub4_Sub1_10275 = aClass265_10270.method4783("bloomTex1", -793429422);
				aClass523_Sub4_Sub1_10276 = aClass265_10270.method4783("params", 1235481869);
				aClass523_Sub4_Sub1_10277 = aClass265_10270.method4783("sampleSize", -737956002);
				aClass523_Sub4_Sub1_10263 = aClass265_10270.method4783("pixelOffsetAndBloomScale", -212060192);
				aClass523_Sub4_Sub1_10279 = aClass265_10270.method4783("PosAndTexCoords", 1017270038);
				aClass265_10270.method4755("test", 760427037);
				aClass270_10269 = aClass265_10270.method4755("techFullscreenTri", 760427037);
				aClass270_10265 = aClass265_10270.method4755("brightpass", 760427037);
				aClass270_10278 = aClass265_10270.method4755("blur", 760427037);
				aClass270_10272 = aClass265_10270.method4755("composite", 760427037);
				aClass270_10273 = aClass265_10270.method4755("techDefault", 760427037);
			} catch (Exception_Sub3_Sub1 exception_sub3_sub1) {
				return false;
			} catch (Exception_Sub3_Sub2 exception_sub3_sub2) {
				return false;
			}
			if (!aClass270_10269.method4927())
				return false;
			if (!aClass270_10265.method4927())
				return false;
			if (!aClass270_10278.method4927())
				return false;
			if (!aClass270_10272.method4927())
				return false;
			if (!aClass270_10273.method4927())
				return false;
			aBool10280 = true;
			return true;
		}
		return false;
	}

	boolean method6126() {
		return false;
	}

	boolean method6153() {
		return false;
	}

	void method6130() {
		/* empty */
	}

	void method6118(int i) {
		aClass265_10270.method4809();
	}
}
