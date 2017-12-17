/* Class350_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class350_Sub1 extends Class350 {
	Class523_Sub4_Sub1[] aClass523_Sub4_Sub1Array10165;
	public static float aFloat10166;
	public static int anInt10167;
	public static Class165_Sub2[] aClass165_Sub2Array10168;
	Class265 aClass265_10169;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10170;
	public static float[] aFloatArray10171 = { 0.0F, 0.0F, 0.0F };
	Class270[] aClass270Array10172 = null;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10173;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10174;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10175;
	boolean aBool10176;

	boolean method6143() {
		return (aClass178_Sub2_3640.aBool9682 && aClass178_Sub2_3640.method15119());
	}

	boolean method6112() {
		return (aClass178_Sub2_3640.aBool9682 && aClass178_Sub2_3640.method15119());
	}

	boolean method6113() {
		return aBool10176;
	}

	void method6131() {
		/* empty */
	}

	void method6116(int i, int i_0_) {
		/* empty */
	}

	void method6115() {
		/* empty */
	}

	int method6133() {
		return 1;
	}

	void method6140(int i, Class168_Sub1 class168_sub1, Interface37 interface37, Interface23 interface23, Interface37 interface37_1_, boolean bool) {
		float f = aClass178_Sub2_3640.method15089();
		float f_2_ = (float) class168_sub1.method2875();
		float f_3_ = (float) class168_sub1.method2874();
		Interface37 interface37_4_ = interface37;
		float f_5_ = f * 2.0F / f_2_;
		float f_6_ = -f * 2.0F / f_3_;
		float[] fs = { -1.0F + f_5_, 1.0F + f_6_, 0.0F, 0.0F, -1.0F + f_5_, -3.0F + f_6_, 0.0F, 2.0F, 3.0F + f_5_, 1.0F + f_6_, 2.0F, 0.0F };
		int i_7_ = (int) f_2_;
		int i_8_ = (int) f_3_;
		int i_9_ = (bool ? aClass178_Sub2_3640.method3380(1869623545).method2875() : i_7_);
		int i_10_ = (bool ? aClass178_Sub2_3640.method3380(1813491679).method2874() : i_8_);
		Class270 class270 = aClass270Array10172[anInt10167 - 1];
		aClass265_10169.method4852(class270);
		aClass265_10169.method4750();
		aClass265_10169.method4767(aClass523_Sub4_Sub1_10173, aFloat10166, aFloatArray10171[0], aFloatArray10171[1], aFloatArray10171[2], -1022530843);
		Object object = null;
		Object object_11_ = null;
		for (int i_12_ = 0; i_12_ < anInt10167; i_12_++) {
			if (aClass165_Sub2Array10168[i_12_] != null) {
				Class523_Sub4_Sub1 class523_sub4_sub1 = aClass523_Sub4_Sub1Array10165[i_12_];
				Interface43 interface43 = aClass165_Sub2Array10168[i_12_].method15393();
				aClass265_10169.method4836(class523_sub4_sub1, i_12_ + 1, interface43, -359843259);
			}
		}
		float f_13_ = (float) i_7_ / f_2_;
		float f_14_ = (float) i_8_ / f_3_;
		float f_15_ = (float) i_9_ / f_2_;
		float f_16_ = (float) i_10_ / f_3_;
		fs[8] = (fs[8] + 1.0F) * f_13_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_14_ + 1.0F;
		fs[10] *= f_15_;
		fs[7] *= f_16_;
		aClass265_10169.method4770(aClass523_Sub4_Sub1_10175, fs, (byte) -104);
		aClass265_10169.method4836(aClass523_Sub4_Sub1_10170, 0, interface37_4_, 1664077435);
		aClass265_10169.method4767(aClass523_Sub4_Sub1_10174, 0.0F, 0.0F, 0.0F, 0.0F, -600298195);
		aClass178_Sub2_3640.method3208(0, 0, i_7_, i_8_);
	}

	void method6145(int i) {
		aClass265_10169.method4809();
	}

	int method6121() {
		return 0;
	}

	boolean method6151() {
		if (method6112()) {
			aClass265_10169 = aClass178_Sub2_3640.method15073("FilterColourRemapping");
			if (aClass265_10169 == null)
				return false;
			try {
				aClass523_Sub4_Sub1_10170 = aClass265_10169.method4783("sceneTex", 968322798);
				aClass270Array10172 = new Class270[3];
				aClass523_Sub4_Sub1Array10165 = new Class523_Sub4_Sub1[3];
				if (aClass178_Sub2_3640.aBool9687) {
					aClass270Array10172[0] = aClass265_10169.method4755("techRemap3D_1", 760427037);
					aClass270Array10172[1] = aClass265_10169.method4755("techRemap3D_2", 760427037);
					aClass270Array10172[2] = aClass265_10169.method4755("techRemap3D_3", 760427037);
					aClass523_Sub4_Sub1Array10165[0] = aClass265_10169.method4783("remapTex3D_1", -1556507954);
					aClass523_Sub4_Sub1Array10165[1] = aClass265_10169.method4783("remapTex3D_2", 1218500056);
					aClass523_Sub4_Sub1Array10165[2] = aClass265_10169.method4783("remapTex3D_3", -1149334323);
				} else {
					aClass270Array10172[0] = aClass265_10169.method4755("techRemap2D_1", 760427037);
					aClass270Array10172[1] = aClass265_10169.method4755("techRemap2D_2", 760427037);
					aClass270Array10172[2] = aClass265_10169.method4755("techRemap2D_3", 760427037);
					aClass523_Sub4_Sub1Array10165[0] = aClass265_10169.method4783("remapTex2D_1", -70917014);
					aClass523_Sub4_Sub1Array10165[1] = aClass265_10169.method4783("remapTex2D_2", 899309087);
					aClass523_Sub4_Sub1Array10165[2] = aClass265_10169.method4783("remapTex2D_3", -326332807);
				}
				aClass523_Sub4_Sub1_10173 = aClass265_10169.method4783("paramsWeightings", -1108631409);
				aClass523_Sub4_Sub1_10174 = aClass265_10169.method4783("pixelOffset", -875282994);
				aClass523_Sub4_Sub1_10175 = aClass265_10169.method4783("PosAndTexCoords", 731344700);
			} catch (Exception_Sub3_Sub1 exception_sub3_sub1) {
				return false;
			} catch (Exception_Sub3_Sub2 exception_sub3_sub2) {
				return false;
			}
			if (!aClass270Array10172[0].method4927() || !aClass270Array10172[1].method4927() || !aClass270Array10172[2].method4927())
				return false;
			aBool10176 = true;
			return true;
		}
		return false;
	}

	boolean method6142() {
		if (method6112()) {
			aClass265_10169 = aClass178_Sub2_3640.method15073("FilterColourRemapping");
			if (aClass265_10169 == null)
				return false;
			try {
				aClass523_Sub4_Sub1_10170 = aClass265_10169.method4783("sceneTex", -2091214141);
				aClass270Array10172 = new Class270[3];
				aClass523_Sub4_Sub1Array10165 = new Class523_Sub4_Sub1[3];
				if (aClass178_Sub2_3640.aBool9687) {
					aClass270Array10172[0] = aClass265_10169.method4755("techRemap3D_1", 760427037);
					aClass270Array10172[1] = aClass265_10169.method4755("techRemap3D_2", 760427037);
					aClass270Array10172[2] = aClass265_10169.method4755("techRemap3D_3", 760427037);
					aClass523_Sub4_Sub1Array10165[0] = aClass265_10169.method4783("remapTex3D_1", -1985562082);
					aClass523_Sub4_Sub1Array10165[1] = aClass265_10169.method4783("remapTex3D_2", -493540655);
					aClass523_Sub4_Sub1Array10165[2] = aClass265_10169.method4783("remapTex3D_3", -1040075760);
				} else {
					aClass270Array10172[0] = aClass265_10169.method4755("techRemap2D_1", 760427037);
					aClass270Array10172[1] = aClass265_10169.method4755("techRemap2D_2", 760427037);
					aClass270Array10172[2] = aClass265_10169.method4755("techRemap2D_3", 760427037);
					aClass523_Sub4_Sub1Array10165[0] = aClass265_10169.method4783("remapTex2D_1", -386289980);
					aClass523_Sub4_Sub1Array10165[1] = aClass265_10169.method4783("remapTex2D_2", 71733691);
					aClass523_Sub4_Sub1Array10165[2] = aClass265_10169.method4783("remapTex2D_3", -522788950);
				}
				aClass523_Sub4_Sub1_10173 = aClass265_10169.method4783("paramsWeightings", -1143799639);
				aClass523_Sub4_Sub1_10174 = aClass265_10169.method4783("pixelOffset", 230136263);
				aClass523_Sub4_Sub1_10175 = aClass265_10169.method4783("PosAndTexCoords", -124123222);
			} catch (Exception_Sub3_Sub1 exception_sub3_sub1) {
				return false;
			} catch (Exception_Sub3_Sub2 exception_sub3_sub2) {
				return false;
			}
			if (!aClass270Array10172[0].method4927() || !aClass270Array10172[1].method4927() || !aClass270Array10172[2].method4927())
				return false;
			aBool10176 = true;
			return true;
		}
		return false;
	}

	static {
		aFloat10166 = 1.0F;
		anInt10167 = 1;
		aClass165_Sub2Array10168 = new Class165_Sub2[] { null, null, null };
	}

	boolean method6124() {
		return (anInt10167 == 0 || aFloat10166 == 1.0F || (aFloatArray10171[0] + aFloatArray10171[1] + aFloatArray10171[2]) == 0.0F || (aClass165_Sub2Array10168[0] == null && aClass165_Sub2Array10168[1] == null && aClass165_Sub2Array10168[2] == null));
	}

	boolean method6125() {
		return (aClass178_Sub2_3640.aBool9682 && aClass178_Sub2_3640.method15119());
	}

	void method6130() {
		/* empty */
	}

	int method6117() {
		return 0;
	}

	void method6132(int i, int i_17_) {
		/* empty */
	}

	void method6111(int i, int i_18_) {
		/* empty */
	}

	int method6147() {
		return 0;
	}

	int method6152() {
		return 1;
	}

	void method6136(int i, Class168_Sub1 class168_sub1, Interface37 interface37, Interface23 interface23, Interface37 interface37_19_, boolean bool) {
		float f = aClass178_Sub2_3640.method15089();
		float f_20_ = (float) class168_sub1.method2875();
		float f_21_ = (float) class168_sub1.method2874();
		Interface37 interface37_22_ = interface37;
		float f_23_ = f * 2.0F / f_20_;
		float f_24_ = -f * 2.0F / f_21_;
		float[] fs = { -1.0F + f_23_, 1.0F + f_24_, 0.0F, 0.0F, -1.0F + f_23_, -3.0F + f_24_, 0.0F, 2.0F, 3.0F + f_23_, 1.0F + f_24_, 2.0F, 0.0F };
		int i_25_ = (int) f_20_;
		int i_26_ = (int) f_21_;
		int i_27_ = (bool ? aClass178_Sub2_3640.method3380(1454246188).method2875() : i_25_);
		int i_28_ = (bool ? aClass178_Sub2_3640.method3380(865766190).method2874() : i_26_);
		Class270 class270 = aClass270Array10172[anInt10167 - 1];
		aClass265_10169.method4852(class270);
		aClass265_10169.method4750();
		aClass265_10169.method4767(aClass523_Sub4_Sub1_10173, aFloat10166, aFloatArray10171[0], aFloatArray10171[1], aFloatArray10171[2], -1005184943);
		Object object = null;
		Object object_29_ = null;
		for (int i_30_ = 0; i_30_ < anInt10167; i_30_++) {
			if (aClass165_Sub2Array10168[i_30_] != null) {
				Class523_Sub4_Sub1 class523_sub4_sub1 = aClass523_Sub4_Sub1Array10165[i_30_];
				Interface43 interface43 = aClass165_Sub2Array10168[i_30_].method15393();
				aClass265_10169.method4836(class523_sub4_sub1, i_30_ + 1, interface43, 1604399423);
			}
		}
		float f_31_ = (float) i_25_ / f_20_;
		float f_32_ = (float) i_26_ / f_21_;
		float f_33_ = (float) i_27_ / f_20_;
		float f_34_ = (float) i_28_ / f_21_;
		fs[8] = (fs[8] + 1.0F) * f_31_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_32_ + 1.0F;
		fs[10] *= f_33_;
		fs[7] *= f_34_;
		aClass265_10169.method4770(aClass523_Sub4_Sub1_10175, fs, (byte) -30);
		aClass265_10169.method4836(aClass523_Sub4_Sub1_10170, 0, interface37_22_, 955977860);
		aClass265_10169.method4767(aClass523_Sub4_Sub1_10174, 0.0F, 0.0F, 0.0F, 0.0F, -1295684506);
		aClass178_Sub2_3640.method3208(0, 0, i_25_, i_26_);
	}

	void method6119(int i, Class168_Sub1 class168_sub1, Interface37 interface37, Interface23 interface23, Interface37 interface37_35_, boolean bool) {
		float f = aClass178_Sub2_3640.method15089();
		float f_36_ = (float) class168_sub1.method2875();
		float f_37_ = (float) class168_sub1.method2874();
		Interface37 interface37_38_ = interface37;
		float f_39_ = f * 2.0F / f_36_;
		float f_40_ = -f * 2.0F / f_37_;
		float[] fs = { -1.0F + f_39_, 1.0F + f_40_, 0.0F, 0.0F, -1.0F + f_39_, -3.0F + f_40_, 0.0F, 2.0F, 3.0F + f_39_, 1.0F + f_40_, 2.0F, 0.0F };
		int i_41_ = (int) f_36_;
		int i_42_ = (int) f_37_;
		int i_43_ = (bool ? aClass178_Sub2_3640.method3380(2031643162).method2875() : i_41_);
		int i_44_ = (bool ? aClass178_Sub2_3640.method3380(1901979766).method2874() : i_42_);
		Class270 class270 = aClass270Array10172[anInt10167 - 1];
		aClass265_10169.method4852(class270);
		aClass265_10169.method4750();
		aClass265_10169.method4767(aClass523_Sub4_Sub1_10173, aFloat10166, aFloatArray10171[0], aFloatArray10171[1], aFloatArray10171[2], -1033668419);
		Object object = null;
		Object object_45_ = null;
		for (int i_46_ = 0; i_46_ < anInt10167; i_46_++) {
			if (aClass165_Sub2Array10168[i_46_] != null) {
				Class523_Sub4_Sub1 class523_sub4_sub1 = aClass523_Sub4_Sub1Array10165[i_46_];
				Interface43 interface43 = aClass165_Sub2Array10168[i_46_].method15393();
				aClass265_10169.method4836(class523_sub4_sub1, i_46_ + 1, interface43, 219150751);
			}
		}
		float f_47_ = (float) i_41_ / f_36_;
		float f_48_ = (float) i_42_ / f_37_;
		float f_49_ = (float) i_43_ / f_36_;
		float f_50_ = (float) i_44_ / f_37_;
		fs[8] = (fs[8] + 1.0F) * f_47_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_48_ + 1.0F;
		fs[10] *= f_49_;
		fs[7] *= f_50_;
		aClass265_10169.method4770(aClass523_Sub4_Sub1_10175, fs, (byte) -34);
		aClass265_10169.method4836(aClass523_Sub4_Sub1_10170, 0, interface37_38_, 1319117028);
		aClass265_10169.method4767(aClass523_Sub4_Sub1_10174, 0.0F, 0.0F, 0.0F, 0.0F, -1954595321);
		aClass178_Sub2_3640.method3208(0, 0, i_41_, i_42_);
	}

	void method6118(int i) {
		aClass265_10169.method4809();
	}

	void method6139(int i) {
		aClass265_10169.method4809();
	}

	void method6135(int i, Class168_Sub1 class168_sub1, Interface37 interface37, Interface23 interface23, Interface37 interface37_51_, boolean bool) {
		float f = aClass178_Sub2_3640.method15089();
		float f_52_ = (float) class168_sub1.method2875();
		float f_53_ = (float) class168_sub1.method2874();
		Interface37 interface37_54_ = interface37;
		float f_55_ = f * 2.0F / f_52_;
		float f_56_ = -f * 2.0F / f_53_;
		float[] fs = { -1.0F + f_55_, 1.0F + f_56_, 0.0F, 0.0F, -1.0F + f_55_, -3.0F + f_56_, 0.0F, 2.0F, 3.0F + f_55_, 1.0F + f_56_, 2.0F, 0.0F };
		int i_57_ = (int) f_52_;
		int i_58_ = (int) f_53_;
		int i_59_ = (bool ? aClass178_Sub2_3640.method3380(1438181213).method2875() : i_57_);
		int i_60_ = (bool ? aClass178_Sub2_3640.method3380(1895559644).method2874() : i_58_);
		Class270 class270 = aClass270Array10172[anInt10167 - 1];
		aClass265_10169.method4852(class270);
		aClass265_10169.method4750();
		aClass265_10169.method4767(aClass523_Sub4_Sub1_10173, aFloat10166, aFloatArray10171[0], aFloatArray10171[1], aFloatArray10171[2], -584413967);
		Object object = null;
		Object object_61_ = null;
		for (int i_62_ = 0; i_62_ < anInt10167; i_62_++) {
			if (aClass165_Sub2Array10168[i_62_] != null) {
				Class523_Sub4_Sub1 class523_sub4_sub1 = aClass523_Sub4_Sub1Array10165[i_62_];
				Interface43 interface43 = aClass165_Sub2Array10168[i_62_].method15393();
				aClass265_10169.method4836(class523_sub4_sub1, i_62_ + 1, interface43, -1412005545);
			}
		}
		float f_63_ = (float) i_57_ / f_52_;
		float f_64_ = (float) i_58_ / f_53_;
		float f_65_ = (float) i_59_ / f_52_;
		float f_66_ = (float) i_60_ / f_53_;
		fs[8] = (fs[8] + 1.0F) * f_63_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_64_ + 1.0F;
		fs[10] *= f_65_;
		fs[7] *= f_66_;
		aClass265_10169.method4770(aClass523_Sub4_Sub1_10175, fs, (byte) -50);
		aClass265_10169.method4836(aClass523_Sub4_Sub1_10170, 0, interface37_54_, 197071089);
		aClass265_10169.method4767(aClass523_Sub4_Sub1_10174, 0.0F, 0.0F, 0.0F, 0.0F, -166453609);
		aClass178_Sub2_3640.method3208(0, 0, i_57_, i_58_);
	}

	int method6114() {
		return 1;
	}

	int method6138() {
		return 2;
	}

	int method6120() {
		return 2;
	}

	int method6144() {
		return 0;
	}

	public Class350_Sub1(Class178_Sub2 class178_sub2) {
		super(class178_sub2);
		aClass523_Sub4_Sub1Array10165 = null;
	}

	int method6146() {
		return 0;
	}

	boolean method6126() {
		return (anInt10167 == 0 || aFloat10166 == 1.0F || (aFloatArray10171[0] + aFloatArray10171[1] + aFloatArray10171[2]) == 0.0F || (aClass165_Sub2Array10168[0] == null && aClass165_Sub2Array10168[1] == null && aClass165_Sub2Array10168[2] == null));
	}

	boolean method6150() {
		return aBool10176;
	}

	int method6141() {
		return 2;
	}

	void method6134(int i, int i_67_) {
		/* empty */
	}

	boolean method6153() {
		return (anInt10167 == 0 || aFloat10166 == 1.0F || (aFloatArray10171[0] + aFloatArray10171[1] + aFloatArray10171[2]) == 0.0F || (aClass165_Sub2Array10168[0] == null && aClass165_Sub2Array10168[1] == null && aClass165_Sub2Array10168[2] == null));
	}

	boolean method6154() {
		return (anInt10167 == 0 || aFloat10166 == 1.0F || (aFloatArray10171[0] + aFloatArray10171[1] + aFloatArray10171[2]) == 0.0F || (aClass165_Sub2Array10168[0] == null && aClass165_Sub2Array10168[1] == null && aClass165_Sub2Array10168[2] == null));
	}

	boolean method6155() {
		return (anInt10167 == 0 || aFloat10166 == 1.0F || (aFloatArray10171[0] + aFloatArray10171[1] + aFloatArray10171[2]) == 0.0F || (aClass165_Sub2Array10168[0] == null && aClass165_Sub2Array10168[1] == null && aClass165_Sub2Array10168[2] == null));
	}
}
