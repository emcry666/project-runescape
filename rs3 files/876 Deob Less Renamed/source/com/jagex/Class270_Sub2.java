/* Class270_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public final class Class270_Sub2 extends Class270 {
	byte[] aByteArray10080;
	Class265_Sub1 aClass265_Sub1_10081;
	Class178_Sub2_Sub1 aClass178_Sub2_Sub1_10082;
	long aLong10083;
	static final int anInt10084 = 0;
	static float[] aFloatArray10085 = new float[16];
	byte[] aByteArray10086;
	static final int anInt10087 = 1;
	float[][] aFloatArrayArray10088;
	long aLong10089;
	boolean aBool10090 = false;
	boolean[] aBoolArray10091;

	void method4930(Class523_Sub4_Sub1 class523_sub4_sub1, float f, float f_0_, float f_1_) {
		int i = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18526();
		int i_2_ = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18532();
		if (class523_sub4_sub1.method18067(2120390550) != Class277.aClass277_2930)
			throw new IllegalArgumentException_Sub1(class523_sub4_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray10088[0][i + 0] = f;
			aFloatArrayArray10088[0][i + 1] = f_0_;
			aFloatArrayArray10088[0][i + 2] = f_1_;
			aBoolArray10091[0] = true;
		}
		if (i_2_ >= 0) {
			i_2_ *= 4;
			aFloatArrayArray10088[1][i_2_ + 0] = f;
			aFloatArrayArray10088[1][i_2_ + 1] = f_0_;
			aFloatArrayArray10088[1][i_2_ + 2] = f_1_;
			aBoolArray10091[1] = true;
		}
	}

	Class270_Sub2(Class178_Sub2_Sub1 class178_sub2_sub1, Class264 class264) {
		aFloatArrayArray10088 = new float[2][];
		aBoolArray10091 = new boolean[2];
		aString2872 = class264.aString2848;
		if (class264.aString2846 != null) {
			aString2873 = class264.aString2846;
			aByteArray10086 = class178_sub2_sub1.method17834(aString2873);
		}
		if (class264.aString2847 != null) {
			aString2874 = class264.aString2847;
			aByteArray10080 = class178_sub2_sub1.method17834(aString2874);
		}
		class178_sub2_sub1.method15243(this);
	}

	void method4963(int i, float f, float f_3_, float f_4_) {
		int i_5_ = i >> 16;
		int i_6_ = (i & 0xffff) * 4;
		aFloatArrayArray10088[i_5_][i_6_] = f;
		aFloatArrayArray10088[i_5_][i_6_ + 1] = f_3_;
		aFloatArrayArray10088[i_5_][i_6_ + 2] = f_4_;
		aBoolArray10091[i_5_] = true;
	}

	void method4959(Class523_Sub4_Sub1 class523_sub4_sub1, int i, Interface43 interface43) {
		aClass178_Sub2_Sub1_10082.method15255(i);
		aClass178_Sub2_Sub1_10082.method15001(interface43);
	}

	void method4953(Class523_Sub4_Sub1 class523_sub4_sub1, float[] fs, int i) {
		int i_7_ = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18526();
		int i_8_ = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18532();
		if (class523_sub4_sub1.method18067(1653267728) != Class277.aClass277_2950)
			throw new IllegalArgumentException_Sub1(class523_sub4_sub1, "");
		if (i_7_ >= 0)
			method15620(i_7_, fs, i);
		if (i_8_ >= 0)
			method15624(i_8_, fs, i);
	}

	void method4968(int i, Class441 class441) {
		int i_9_ = i >> 16;
		int i_10_ = (i & 0xffff) * 4;
		System.arraycopy(class441.method7116(aFloatArray10085), 0, aFloatArrayArray10088[i_9_], i_10_, 16);
		aBoolArray10091[i_9_] = true;
	}

	void method4931(Class523_Sub4_Sub1 class523_sub4_sub1, float f, float f_11_, float f_12_, float f_13_) {
		int i = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18526();
		int i_14_ = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18532();
		if (class523_sub4_sub1.method18067(-834092669) != Class277.aClass277_3010)
			throw new IllegalArgumentException_Sub1(class523_sub4_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray10088[0][i + 0] = f;
			aFloatArrayArray10088[0][i + 1] = f_11_;
			aFloatArrayArray10088[0][i + 2] = f_12_;
			aFloatArrayArray10088[0][i + 3] = f_13_;
			aBoolArray10091[0] = true;
		}
		if (i_14_ >= 0) {
			i_14_ *= 4;
			aFloatArrayArray10088[1][i_14_ + 0] = f;
			aFloatArrayArray10088[1][i_14_ + 1] = f_11_;
			aFloatArrayArray10088[1][i_14_ + 2] = f_12_;
			aFloatArrayArray10088[1][i_14_ + 3] = f_13_;
			aBoolArray10091[1] = true;
		}
	}

	void method4941(Class523_Sub4_Sub1 class523_sub4_sub1, Class441 class441) {
		int i = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18526();
		int i_15_ = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18532();
		if (class523_sub4_sub1.method18067(696859289) != Class277.aClass277_2919)
			throw new IllegalArgumentException_Sub1(class523_sub4_sub1, "");
		if (i >= 0)
			method15620(i, class441.method7159(aFloatArray10085), 8);
		if (i_15_ >= 0)
			method15624(i_15_, class441.method7159(aFloatArray10085), 8);
	}

	void method4961(Class523_Sub4_Sub1 class523_sub4_sub1, Class441 class441) {
		int i = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18526();
		int i_16_ = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18532();
		if (class523_sub4_sub1.method18067(1249888150) != Class277.aClass277_2921)
			throw new IllegalArgumentException_Sub1(class523_sub4_sub1, "");
		if (i >= 0)
			method15620(i, class441.method7116(aFloatArray10085), 16);
		if (i_16_ >= 0)
			method15624(i_16_, class441.method7116(aFloatArray10085), 16);
	}

	void method4935(Class523_Sub4_Sub1 class523_sub4_sub1, float[] fs, int i) {
		int i_17_ = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18526();
		int i_18_ = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18532();
		if (class523_sub4_sub1.method18067(-338271573) != Class277.aClass277_2950)
			throw new IllegalArgumentException_Sub1(class523_sub4_sub1, "");
		if (i_17_ >= 0)
			method15620(i_17_, fs, i);
		if (i_18_ >= 0)
			method15624(i_18_, fs, i);
	}

	void method4951(Class523_Sub4_Sub1 class523_sub4_sub1, int i, Interface43 interface43) {
		aClass178_Sub2_Sub1_10082.method15255(i);
		aClass178_Sub2_Sub1_10082.method15001(interface43);
	}

	void method4925(int i, float f, float f_19_, float f_20_) {
		int i_21_ = i >> 16;
		int i_22_ = (i & 0xffff) * 4;
		aFloatArrayArray10088[i_21_][i_22_] = f;
		aFloatArrayArray10088[i_21_][i_22_ + 1] = f_19_;
		aFloatArrayArray10088[i_21_][i_22_ + 2] = f_20_;
		aBoolArray10091[i_21_] = true;
	}

	void method4974(int i, Class441 class441) {
		int i_23_ = i >> 16;
		int i_24_ = (i & 0xffff) * 4;
		System.arraycopy(class441.method7116(aFloatArray10085), 0, aFloatArrayArray10088[i_23_], i_24_, 16);
		aBoolArray10091[i_23_] = true;
	}

	void method4939(int i, Class441 class441) {
		int i_25_ = i >> 16;
		int i_26_ = (i & 0xffff) * 4;
		System.arraycopy(class441.method7116(aFloatArray10085), 0, aFloatArrayArray10088[i_25_], i_26_, 12);
		aBoolArray10091[i_25_] = true;
	}

	void method4964(int i, Class441 class441) {
		int i_27_ = i >> 16;
		int i_28_ = (i & 0xffff) * 4;
		System.arraycopy(class441.method7116(aFloatArray10085), 0, aFloatArrayArray10088[i_27_], i_28_, 12);
		aBoolArray10091[i_27_] = true;
	}

	void method4933(int i, Class441 class441) {
		int i_29_ = i >> 16;
		int i_30_ = (i & 0xffff) * 4;
		System.arraycopy(class441.method7116(aFloatArray10085), 0, aFloatArrayArray10088[i_29_], i_30_, 16);
		aBoolArray10091[i_29_] = true;
	}

	void method15619() {
		if (aBoolArray10091[0]) {
			aClass178_Sub2_Sub1_10082.aByteBuffer9539.clear();
			aClass178_Sub2_Sub1_10082.aByteBuffer9539.asFloatBuffer().put(aFloatArrayArray10088[0]);
			IDirect3DDevice.SetVertexShaderConstantF(aClass178_Sub2_Sub1_10082.aLong11412, 0, aClass178_Sub2_Sub1_10082.aLong9540, aFloatArrayArray10088[0].length / 4);
			aBoolArray10091[0] = false;
		}
		if (aBoolArray10091[1]) {
			aClass178_Sub2_Sub1_10082.aByteBuffer9539.clear();
			aClass178_Sub2_Sub1_10082.aByteBuffer9539.asFloatBuffer().put(aFloatArrayArray10088[1]);
			IDirect3DDevice.SetPixelShaderConstantF(aClass178_Sub2_Sub1_10082.aLong11412, 0, aClass178_Sub2_Sub1_10082.aLong9540, aFloatArrayArray10088[1].length / 4);
			aBoolArray10091[1] = false;
		}
	}

	final void method15620(int i, float[] fs, int i_31_) {
		Class698.method14050(fs, 0, aFloatArrayArray10088[0], i * 4, i_31_);
		aBoolArray10091[0] = true;
	}

	void method4929(Class523_Sub4_Sub1 class523_sub4_sub1, float f, float f_32_) {
		int i = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18526();
		int i_33_ = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18532();
		if (class523_sub4_sub1.method18067(-505144029) != Class277.aClass277_2929)
			throw new IllegalArgumentException_Sub1(class523_sub4_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray10088[0][i + 0] = f;
			aFloatArrayArray10088[0][i + 1] = f_32_;
			aBoolArray10091[0] = true;
		}
		if (i_33_ >= 0) {
			i_33_ *= 4;
			aFloatArrayArray10088[1][i_33_ + 0] = f;
			aFloatArrayArray10088[1][i_33_ + 1] = f_32_;
			aBoolArray10091[1] = true;
		}
	}

	void method4979(Class523_Sub4_Sub1 class523_sub4_sub1, float[] fs, int i) {
		int i_34_ = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18526();
		int i_35_ = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18532();
		if (class523_sub4_sub1.method18067(-36360032) != Class277.aClass277_2950)
			throw new IllegalArgumentException_Sub1(class523_sub4_sub1, "");
		if (i_34_ >= 0)
			method15620(i_34_, fs, i);
		if (i_35_ >= 0)
			method15624(i_35_, fs, i);
	}

	void method4936(Class523_Sub4_Sub1 class523_sub4_sub1, float f) {
		int i = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18526();
		int i_36_ = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18532();
		if ((class523_sub4_sub1.method18067(153403687) != Class277.aClass277_2928) && (class523_sub4_sub1.method18067(138295634) != Class277.aClass277_3021))
			throw new IllegalArgumentException_Sub1(class523_sub4_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray10088[0][i] = f;
			aBoolArray10091[0] = true;
		}
		if (i_36_ >= 0) {
			i_36_ *= 4;
			aFloatArrayArray10088[1][i_36_] = f;
			aBoolArray10091[1] = true;
		}
	}

	public void method131() {
		if (aLong10083 != 0L) {
			IUnknown.Release(aLong10083);
			aLong10083 = 0L;
		}
		if (aLong10089 != 0L) {
			IUnknown.Release(aLong10089);
			aLong10089 = 0L;
		}
		aClass178_Sub2_Sub1_10082.method14917(this);
	}

	void method4942(int i, int i_37_, Interface43 interface43) {
		aClass178_Sub2_Sub1_10082.method15255(i_37_);
		aClass178_Sub2_Sub1_10082.method15001(interface43);
	}

	public void finalize() {
		method15622();
	}

	public boolean method4927() {
		if (aBool10090)
			return true;
		aLong10083 = (aByteArray10086 == null ? 0L : IDirect3DDevice.CreateVertexShader((aClass178_Sub2_Sub1_10082.aLong11412), aByteArray10086));
		aLong10089 = (aByteArray10080 == null ? 0L : IDirect3DDevice.CreatePixelShader((aClass178_Sub2_Sub1_10082.aLong11412), aByteArray10080));
		if (aLong10083 == 0L && aLong10089 == 0L)
			return false;
		int i = -1;
		for (int i_38_ = 0; i_38_ < aClass265_Sub1_10081.method4756((byte) -40); i_38_++) {
			if (aClass265_Sub1_10081.method4749(i_38_, (byte) -9) == this) {
				i = i_38_;
				break;
			}
		}
		int i_39_ = aClass265_Sub1_10081.method4787((byte) 1);
		int i_40_ = aClass265_Sub1_10081.method4784(-1083976394);
		for (int i_41_ = 0; i_41_ < i_39_; i_41_++) {
			Class523_Sub4_Sub1 class523_sub4_sub1 = aClass265_Sub1_10081.method4788(i_41_, -838969858);
			class523_sub4_sub1.method18064(i);
		}
		for (int i_42_ = 0; i_42_ < i_40_; i_42_++) {
			Class523_Sub4_Sub1 class523_sub4_sub1 = aClass265_Sub1_10081.method4785(i_42_, 30296024);
			class523_sub4_sub1.method18064(i);
		}
		int i_43_ = 0;
		int i_44_ = 0;
		int i_45_ = aClass265_Sub1_10081.method4758(this, -6275696);
		for (int i_46_ = 0; i_46_ < i_39_ + i_40_; i_46_++) {
			Class523_Sub4_Sub1_Sub2 class523_sub4_sub1_sub2 = ((Class523_Sub4_Sub1_Sub2) (i_46_ < i_39_ ? aClass265_Sub1_10081.method4788(i_46_, 1940869707) : aClass265_Sub1_10081.method4785(i_46_ - i_39_, 1370139898)));
			Class277 class277 = class523_sub4_sub1_sub2.method18067(2091633878);
			int i_47_ = 1;
			if (class277 == Class277.aClass277_2950) {
				class277 = class523_sub4_sub1_sub2.method18068((byte) 31);
				i_47_ = class523_sub4_sub1_sub2.method18065(-723345924);
			}
			switch (class277.anInt3029 * 55481905) {
			case 9:
			case 14:
			case 19:
			case 96:
				i_47_ *= 3;
				break;
			case 10:
			case 52:
			case 62:
			case 82:
			case 122:
				break;
			default:
				i_47_ = 0;
				break;
			case 16:
			case 49:
			case 59:
			case 101:
				i_47_ *= 2;
				break;
			case 18:
			case 90:
			case 102:
			case 114:
				i_47_ *= 4;
			}
			if (class523_sub4_sub1_sub2.anIntArray12075[i_45_] >= 0) {
				int i_48_ = class523_sub4_sub1_sub2.anIntArray12075[i_45_] + i_47_;
				if (i_43_ < i_48_)
					i_43_ = i_48_;
			}
			if (class523_sub4_sub1_sub2.anIntArray12076[i_45_] >= 0) {
				int i_49_ = class523_sub4_sub1_sub2.anIntArray12076[i_45_] + i_47_;
				if (i_44_ < i_49_)
					i_44_ = i_49_;
			}
		}
		aFloatArrayArray10088[0] = new float[i_43_ * 4];
		aFloatArrayArray10088[1] = new float[i_44_ * 4];
		aBool10090 = true;
		return true;
	}

	public void method130() {
		if (aLong10083 != 0L) {
			IUnknown.Release(aLong10083);
			aLong10083 = 0L;
		}
		if (aLong10089 != 0L) {
			IUnknown.Release(aLong10089);
			aLong10089 = 0L;
		}
		aClass178_Sub2_Sub1_10082.method14917(this);
	}

	void method4940(int i, Class441 class441) {
		int i_50_ = i >> 16;
		int i_51_ = (i & 0xffff) * 4;
		System.arraycopy(class441.method7159(aFloatArray10085), 0, aFloatArrayArray10088[i_50_], i_51_, 8);
		aBoolArray10091[i_50_] = true;
	}

	public void method78() {
		if (aLong10083 != 0L) {
			IUnknown.Release(aLong10083);
			aLong10083 = 0L;
		}
		if (aLong10089 != 0L) {
			IUnknown.Release(aLong10089);
			aLong10089 = 0L;
		}
		aClass178_Sub2_Sub1_10082.method14917(this);
	}

	void method15621() {
		method15622();
	}

	void method15622() {
		if (aLong10083 != 0L) {
			aClass178_Sub2_Sub1_10082.method17839(aLong10083);
			aLong10083 = 0L;
		}
		if (aLong10089 != 0L) {
			aClass178_Sub2_Sub1_10082.method17839(aLong10089);
			aLong10089 = 0L;
		}
	}

	void method4943(Class523_Sub4_Sub1 class523_sub4_sub1, float f) {
		int i = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18526();
		int i_52_ = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18532();
		if ((class523_sub4_sub1.method18067(2084983273) != Class277.aClass277_2928) && (class523_sub4_sub1.method18067(1702161064) != Class277.aClass277_3021))
			throw new IllegalArgumentException_Sub1(class523_sub4_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray10088[0][i] = f;
			aBoolArray10091[0] = true;
		}
		if (i_52_ >= 0) {
			i_52_ *= 4;
			aFloatArrayArray10088[1][i_52_] = f;
			aBoolArray10091[1] = true;
		}
	}

	void method4948(Class523_Sub4_Sub1 class523_sub4_sub1, float f, float f_53_) {
		int i = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18526();
		int i_54_ = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18532();
		if (class523_sub4_sub1.method18067(1390814599) != Class277.aClass277_2929)
			throw new IllegalArgumentException_Sub1(class523_sub4_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray10088[0][i + 0] = f;
			aFloatArrayArray10088[0][i + 1] = f_53_;
			aBoolArray10091[0] = true;
		}
		if (i_54_ >= 0) {
			i_54_ *= 4;
			aFloatArrayArray10088[1][i_54_ + 0] = f;
			aFloatArrayArray10088[1][i_54_ + 1] = f_53_;
			aBoolArray10091[1] = true;
		}
	}

	void method4946(int i, float[] fs, int i_55_) {
		int i_56_ = i >> 16;
		int i_57_ = (i & 0xffff) * 4;
		System.arraycopy(fs, 0, aFloatArrayArray10088[i_56_], i_57_, i_55_);
		aBoolArray10091[i_56_] = true;
	}

	void method4950(Class523_Sub4_Sub1 class523_sub4_sub1, float f, float f_58_) {
		int i = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18526();
		int i_59_ = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18532();
		if (class523_sub4_sub1.method18067(1570816096) != Class277.aClass277_2929)
			throw new IllegalArgumentException_Sub1(class523_sub4_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray10088[0][i + 0] = f;
			aFloatArrayArray10088[0][i + 1] = f_58_;
			aBoolArray10091[0] = true;
		}
		if (i_59_ >= 0) {
			i_59_ *= 4;
			aFloatArrayArray10088[1][i_59_ + 0] = f;
			aFloatArrayArray10088[1][i_59_ + 1] = f_58_;
			aBoolArray10091[1] = true;
		}
	}

	void method4954(Class523_Sub4_Sub1 class523_sub4_sub1, float f, float f_60_, float f_61_) {
		int i = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18526();
		int i_62_ = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18532();
		if (class523_sub4_sub1.method18067(-72753838) != Class277.aClass277_2930)
			throw new IllegalArgumentException_Sub1(class523_sub4_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray10088[0][i + 0] = f;
			aFloatArrayArray10088[0][i + 1] = f_60_;
			aFloatArrayArray10088[0][i + 2] = f_61_;
			aBoolArray10091[0] = true;
		}
		if (i_62_ >= 0) {
			i_62_ *= 4;
			aFloatArrayArray10088[1][i_62_ + 0] = f;
			aFloatArrayArray10088[1][i_62_ + 1] = f_60_;
			aFloatArrayArray10088[1][i_62_ + 2] = f_61_;
			aBoolArray10091[1] = true;
		}
	}

	void method4934(Class523_Sub4_Sub1 class523_sub4_sub1, float f, float f_63_, float f_64_, float f_65_) {
		int i = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18526();
		int i_66_ = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18532();
		if (class523_sub4_sub1.method18067(1040898887) != Class277.aClass277_3010)
			throw new IllegalArgumentException_Sub1(class523_sub4_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray10088[0][i + 0] = f;
			aFloatArrayArray10088[0][i + 1] = f_63_;
			aFloatArrayArray10088[0][i + 2] = f_64_;
			aFloatArrayArray10088[0][i + 3] = f_65_;
			aBoolArray10091[0] = true;
		}
		if (i_66_ >= 0) {
			i_66_ *= 4;
			aFloatArrayArray10088[1][i_66_ + 0] = f;
			aFloatArrayArray10088[1][i_66_ + 1] = f_63_;
			aFloatArrayArray10088[1][i_66_ + 2] = f_64_;
			aFloatArrayArray10088[1][i_66_ + 3] = f_65_;
			aBoolArray10091[1] = true;
		}
	}

	final void method15623(int i, float[] fs, int i_67_) {
		Class698.method14050(fs, 0, aFloatArrayArray10088[0], i * 4, i_67_);
		aBoolArray10091[0] = true;
	}

	void method4981(int i, float[] fs, int i_68_) {
		int i_69_ = i >> 16;
		int i_70_ = (i & 0xffff) * 4;
		System.arraycopy(fs, 0, aFloatArrayArray10088[i_69_], i_70_, i_68_);
		aBoolArray10091[i_69_] = true;
	}

	void method4955(Class523_Sub4_Sub1 class523_sub4_sub1, Class441 class441) {
		int i = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18526();
		int i_71_ = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18532();
		if (class523_sub4_sub1.method18067(1966274719) != Class277.aClass277_2919)
			throw new IllegalArgumentException_Sub1(class523_sub4_sub1, "");
		if (i >= 0)
			method15620(i, class441.method7159(aFloatArray10085), 8);
		if (i_71_ >= 0)
			method15624(i_71_, class441.method7159(aFloatArray10085), 8);
	}

	void method4956(Class523_Sub4_Sub1 class523_sub4_sub1, Class441 class441) {
		int i = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18526();
		int i_72_ = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18532();
		if (class523_sub4_sub1.method18067(-611244325) != Class277.aClass277_2921)
			throw new IllegalArgumentException_Sub1(class523_sub4_sub1, "");
		if (i >= 0)
			method15620(i, class441.method7116(aFloatArray10085), 16);
		if (i_72_ >= 0)
			method15624(i_72_, class441.method7116(aFloatArray10085), 16);
	}

	void method4957(Class523_Sub4_Sub1 class523_sub4_sub1, Class441 class441) {
		int i = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18526();
		int i_73_ = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18532();
		if (class523_sub4_sub1.method18067(11615859) != Class277.aClass277_2921)
			throw new IllegalArgumentException_Sub1(class523_sub4_sub1, "");
		if (i >= 0)
			method15620(i, class441.method7116(aFloatArray10085), 16);
		if (i_73_ >= 0)
			method15624(i_73_, class441.method7116(aFloatArray10085), 16);
	}

	void method4958(Class523_Sub4_Sub1 class523_sub4_sub1, Class441 class441) {
		int i = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18526();
		int i_74_ = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18532();
		if (class523_sub4_sub1.method18067(85106117) != Class277.aClass277_2921)
			throw new IllegalArgumentException_Sub1(class523_sub4_sub1, "");
		if (i >= 0)
			method15620(i, class441.method7116(aFloatArray10085), 16);
		if (i_74_ >= 0)
			method15624(i_74_, class441.method7116(aFloatArray10085), 16);
	}

	void method4928(Class523_Sub4_Sub1 class523_sub4_sub1, float f, float f_75_) {
		int i = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18526();
		int i_76_ = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18532();
		if (class523_sub4_sub1.method18067(-786617737) != Class277.aClass277_2929)
			throw new IllegalArgumentException_Sub1(class523_sub4_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray10088[0][i + 0] = f;
			aFloatArrayArray10088[0][i + 1] = f_75_;
			aBoolArray10091[0] = true;
		}
		if (i_76_ >= 0) {
			i_76_ *= 4;
			aFloatArrayArray10088[1][i_76_ + 0] = f;
			aFloatArrayArray10088[1][i_76_ + 1] = f_75_;
			aBoolArray10091[1] = true;
		}
	}

	void method4947(Class523_Sub4_Sub1 class523_sub4_sub1, int i, Interface43 interface43) {
		aClass178_Sub2_Sub1_10082.method15255(i);
		aClass178_Sub2_Sub1_10082.method15001(interface43);
	}

	void method4965(Class523_Sub4_Sub1 class523_sub4_sub1, int i, Interface43 interface43) {
		aClass178_Sub2_Sub1_10082.method15255(i);
		aClass178_Sub2_Sub1_10082.method15001(interface43);
	}

	void method4962(int i, float f, float f_77_, float f_78_) {
		int i_79_ = i >> 16;
		int i_80_ = (i & 0xffff) * 4;
		aFloatArrayArray10088[i_79_][i_80_] = f;
		aFloatArrayArray10088[i_79_][i_80_ + 1] = f_77_;
		aFloatArrayArray10088[i_79_][i_80_ + 2] = f_78_;
		aBoolArray10091[i_79_] = true;
	}

	final void method15624(int i, float[] fs, int i_81_) {
		Class698.method14050(fs, 0, aFloatArrayArray10088[1], i * 4, i_81_);
		aBoolArray10091[1] = true;
	}

	void method4937(int i, float f, float f_82_, float f_83_, float f_84_) {
		int i_85_ = i >> 16;
		int i_86_ = (i & 0xffff) * 4;
		aFloatArrayArray10088[i_85_][i_86_] = f;
		aFloatArrayArray10088[i_85_][i_86_ + 1] = f_82_;
		aFloatArrayArray10088[i_85_][i_86_ + 2] = f_83_;
		aFloatArrayArray10088[i_85_][i_86_ + 3] = f_84_;
		aBoolArray10091[i_85_] = true;
	}

	void method4938(int i, Class441 class441) {
		int i_87_ = i >> 16;
		int i_88_ = (i & 0xffff) * 4;
		System.arraycopy(class441.method7116(aFloatArray10085), 0, aFloatArrayArray10088[i_87_], i_88_, 12);
		aBoolArray10091[i_87_] = true;
	}

	public boolean method4978() {
		if (aBool10090)
			return true;
		aLong10083 = (aByteArray10086 == null ? 0L : IDirect3DDevice.CreateVertexShader((aClass178_Sub2_Sub1_10082.aLong11412), aByteArray10086));
		aLong10089 = (aByteArray10080 == null ? 0L : IDirect3DDevice.CreatePixelShader((aClass178_Sub2_Sub1_10082.aLong11412), aByteArray10080));
		if (aLong10083 == 0L && aLong10089 == 0L)
			return false;
		int i = -1;
		for (int i_89_ = 0; i_89_ < aClass265_Sub1_10081.method4756((byte) -105); i_89_++) {
			if (aClass265_Sub1_10081.method4749(i_89_, (byte) -104) == this) {
				i = i_89_;
				break;
			}
		}
		int i_90_ = aClass265_Sub1_10081.method4787((byte) 1);
		int i_91_ = aClass265_Sub1_10081.method4784(-1624643206);
		for (int i_92_ = 0; i_92_ < i_90_; i_92_++) {
			Class523_Sub4_Sub1 class523_sub4_sub1 = aClass265_Sub1_10081.method4788(i_92_, -631788683);
			class523_sub4_sub1.method18064(i);
		}
		for (int i_93_ = 0; i_93_ < i_91_; i_93_++) {
			Class523_Sub4_Sub1 class523_sub4_sub1 = aClass265_Sub1_10081.method4785(i_93_, 1792034360);
			class523_sub4_sub1.method18064(i);
		}
		int i_94_ = 0;
		int i_95_ = 0;
		int i_96_ = aClass265_Sub1_10081.method4758(this, 1857665306);
		for (int i_97_ = 0; i_97_ < i_90_ + i_91_; i_97_++) {
			Class523_Sub4_Sub1_Sub2 class523_sub4_sub1_sub2 = ((Class523_Sub4_Sub1_Sub2) (i_97_ < i_90_ ? aClass265_Sub1_10081.method4788(i_97_, 1458031828) : aClass265_Sub1_10081.method4785(i_97_ - i_90_, 10117050)));
			Class277 class277 = class523_sub4_sub1_sub2.method18067(1222431464);
			int i_98_ = 1;
			if (class277 == Class277.aClass277_2950) {
				class277 = class523_sub4_sub1_sub2.method18068((byte) 24);
				i_98_ = class523_sub4_sub1_sub2.method18065(-457757596);
			}
			switch (class277.anInt3029 * 55481905) {
			case 9:
			case 14:
			case 19:
			case 96:
				i_98_ *= 3;
				break;
			case 10:
			case 52:
			case 62:
			case 82:
			case 122:
				break;
			default:
				i_98_ = 0;
				break;
			case 16:
			case 49:
			case 59:
			case 101:
				i_98_ *= 2;
				break;
			case 18:
			case 90:
			case 102:
			case 114:
				i_98_ *= 4;
			}
			if (class523_sub4_sub1_sub2.anIntArray12075[i_96_] >= 0) {
				int i_99_ = class523_sub4_sub1_sub2.anIntArray12075[i_96_] + i_98_;
				if (i_94_ < i_99_)
					i_94_ = i_99_;
			}
			if (class523_sub4_sub1_sub2.anIntArray12076[i_96_] >= 0) {
				int i_100_ = class523_sub4_sub1_sub2.anIntArray12076[i_96_] + i_98_;
				if (i_95_ < i_100_)
					i_95_ = i_100_;
			}
		}
		aFloatArrayArray10088[0] = new float[i_94_ * 4];
		aFloatArrayArray10088[1] = new float[i_95_ * 4];
		aBool10090 = true;
		return true;
	}

	void method4967(int i, Class441 class441) {
		int i_101_ = i >> 16;
		int i_102_ = (i & 0xffff) * 4;
		System.arraycopy(class441.method7159(aFloatArray10085), 0, aFloatArrayArray10088[i_101_], i_102_, 8);
		aBoolArray10091[i_101_] = true;
	}

	void method4949(Class523_Sub4_Sub1 class523_sub4_sub1, float f) {
		int i = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18526();
		int i_103_ = ((Class523_Sub4_Sub1_Sub2) class523_sub4_sub1).method18532();
		if ((class523_sub4_sub1.method18067(606596631) != Class277.aClass277_2928) && (class523_sub4_sub1.method18067(1818958874) != Class277.aClass277_3021))
			throw new IllegalArgumentException_Sub1(class523_sub4_sub1, "");
		if (i >= 0) {
			i *= 4;
			aFloatArrayArray10088[0][i] = f;
			aBoolArray10091[0] = true;
		}
		if (i_103_ >= 0) {
			i_103_ *= 4;
			aFloatArrayArray10088[1][i_103_] = f;
			aBoolArray10091[1] = true;
		}
	}

	void method4969(int i, Class441 class441) {
		int i_104_ = i >> 16;
		int i_105_ = (i & 0xffff) * 4;
		System.arraycopy(class441.method7116(aFloatArray10085), 0, aFloatArrayArray10088[i_104_], i_105_, 16);
		aBoolArray10091[i_104_] = true;
	}

	final void method15625(int i, float[] fs, int i_106_) {
		Class698.method14050(fs, 0, aFloatArrayArray10088[1], i * 4, i_106_);
		aBoolArray10091[1] = true;
	}

	void method4971(int i, Class441 class441) {
		int i_107_ = i >> 16;
		int i_108_ = (i & 0xffff) * 4;
		System.arraycopy(class441.method7116(aFloatArray10085), 0, aFloatArrayArray10088[i_107_], i_108_, 16);
		aBoolArray10091[i_107_] = true;
	}

	void method4972(int i, Class441 class441) {
		int i_109_ = i >> 16;
		int i_110_ = (i & 0xffff) * 4;
		System.arraycopy(class441.method7116(aFloatArray10085), 0, aFloatArrayArray10088[i_109_], i_110_, 16);
		aBoolArray10091[i_109_] = true;
	}

	void method4952(int i, Class441 class441) {
		int i_111_ = i >> 16;
		int i_112_ = (i & 0xffff) * 4;
		System.arraycopy(class441.method7116(aFloatArray10085), 0, aFloatArrayArray10088[i_111_], i_112_, 16);
		aBoolArray10091[i_111_] = true;
	}

	void method4973(int i, int i_113_, Interface43 interface43) {
		aClass178_Sub2_Sub1_10082.method15255(i_113_);
		aClass178_Sub2_Sub1_10082.method15001(interface43);
	}

	void method4932(int i, int i_114_, Interface43 interface43) {
		aClass178_Sub2_Sub1_10082.method15255(i_114_);
		aClass178_Sub2_Sub1_10082.method15001(interface43);
	}

	void method4966(int i, Class441 class441) {
		int i_115_ = i >> 16;
		int i_116_ = (i & 0xffff) * 4;
		System.arraycopy(class441.method7159(aFloatArray10085), 0, aFloatArrayArray10088[i_115_], i_116_, 8);
		aBoolArray10091[i_115_] = true;
	}

	public boolean method4976() {
		if (aBool10090)
			return true;
		aLong10083 = (aByteArray10086 == null ? 0L : IDirect3DDevice.CreateVertexShader((aClass178_Sub2_Sub1_10082.aLong11412), aByteArray10086));
		aLong10089 = (aByteArray10080 == null ? 0L : IDirect3DDevice.CreatePixelShader((aClass178_Sub2_Sub1_10082.aLong11412), aByteArray10080));
		if (aLong10083 == 0L && aLong10089 == 0L)
			return false;
		int i = -1;
		for (int i_117_ = 0; i_117_ < aClass265_Sub1_10081.method4756((byte) -24); i_117_++) {
			if (aClass265_Sub1_10081.method4749(i_117_, (byte) -111) == this) {
				i = i_117_;
				break;
			}
		}
		int i_118_ = aClass265_Sub1_10081.method4787((byte) 1);
		int i_119_ = aClass265_Sub1_10081.method4784(-1926939614);
		for (int i_120_ = 0; i_120_ < i_118_; i_120_++) {
			Class523_Sub4_Sub1 class523_sub4_sub1 = aClass265_Sub1_10081.method4788(i_120_, -1124516392);
			class523_sub4_sub1.method18064(i);
		}
		for (int i_121_ = 0; i_121_ < i_119_; i_121_++) {
			Class523_Sub4_Sub1 class523_sub4_sub1 = aClass265_Sub1_10081.method4785(i_121_, -1378485823);
			class523_sub4_sub1.method18064(i);
		}
		int i_122_ = 0;
		int i_123_ = 0;
		int i_124_ = aClass265_Sub1_10081.method4758(this, -522765392);
		for (int i_125_ = 0; i_125_ < i_118_ + i_119_; i_125_++) {
			Class523_Sub4_Sub1_Sub2 class523_sub4_sub1_sub2 = ((Class523_Sub4_Sub1_Sub2) (i_125_ < i_118_ ? aClass265_Sub1_10081.method4788(i_125_, 1253760901) : aClass265_Sub1_10081.method4785(i_125_ - i_118_, 1436176076)));
			Class277 class277 = class523_sub4_sub1_sub2.method18067(1837767269);
			int i_126_ = 1;
			if (class277 == Class277.aClass277_2950) {
				class277 = class523_sub4_sub1_sub2.method18068((byte) 86);
				i_126_ = class523_sub4_sub1_sub2.method18065(-851217661);
			}
			switch (class277.anInt3029 * 55481905) {
			case 9:
			case 14:
			case 19:
			case 96:
				i_126_ *= 3;
				break;
			case 10:
			case 52:
			case 62:
			case 82:
			case 122:
				break;
			default:
				i_126_ = 0;
				break;
			case 16:
			case 49:
			case 59:
			case 101:
				i_126_ *= 2;
				break;
			case 18:
			case 90:
			case 102:
			case 114:
				i_126_ *= 4;
			}
			if (class523_sub4_sub1_sub2.anIntArray12075[i_124_] >= 0) {
				int i_127_ = class523_sub4_sub1_sub2.anIntArray12075[i_124_] + i_126_;
				if (i_122_ < i_127_)
					i_122_ = i_127_;
			}
			if (class523_sub4_sub1_sub2.anIntArray12076[i_124_] >= 0) {
				int i_128_ = class523_sub4_sub1_sub2.anIntArray12076[i_124_] + i_126_;
				if (i_123_ < i_128_)
					i_123_ = i_128_;
			}
		}
		aFloatArrayArray10088[0] = new float[i_122_ * 4];
		aFloatArrayArray10088[1] = new float[i_123_ * 4];
		aBool10090 = true;
		return true;
	}

	public boolean method4977() {
		if (aBool10090)
			return true;
		aLong10083 = (aByteArray10086 == null ? 0L : IDirect3DDevice.CreateVertexShader((aClass178_Sub2_Sub1_10082.aLong11412), aByteArray10086));
		aLong10089 = (aByteArray10080 == null ? 0L : IDirect3DDevice.CreatePixelShader((aClass178_Sub2_Sub1_10082.aLong11412), aByteArray10080));
		if (aLong10083 == 0L && aLong10089 == 0L)
			return false;
		int i = -1;
		for (int i_129_ = 0; i_129_ < aClass265_Sub1_10081.method4756((byte) -74); i_129_++) {
			if (aClass265_Sub1_10081.method4749(i_129_, (byte) -16) == this) {
				i = i_129_;
				break;
			}
		}
		int i_130_ = aClass265_Sub1_10081.method4787((byte) 1);
		int i_131_ = aClass265_Sub1_10081.method4784(-1590845942);
		for (int i_132_ = 0; i_132_ < i_130_; i_132_++) {
			Class523_Sub4_Sub1 class523_sub4_sub1 = aClass265_Sub1_10081.method4788(i_132_, 1611548345);
			class523_sub4_sub1.method18064(i);
		}
		for (int i_133_ = 0; i_133_ < i_131_; i_133_++) {
			Class523_Sub4_Sub1 class523_sub4_sub1 = aClass265_Sub1_10081.method4785(i_133_, -1173617538);
			class523_sub4_sub1.method18064(i);
		}
		int i_134_ = 0;
		int i_135_ = 0;
		int i_136_ = aClass265_Sub1_10081.method4758(this, 1984883612);
		for (int i_137_ = 0; i_137_ < i_130_ + i_131_; i_137_++) {
			Class523_Sub4_Sub1_Sub2 class523_sub4_sub1_sub2 = ((Class523_Sub4_Sub1_Sub2) (i_137_ < i_130_ ? aClass265_Sub1_10081.method4788(i_137_, -1714416308) : aClass265_Sub1_10081.method4785(i_137_ - i_130_, -1057131084)));
			Class277 class277 = class523_sub4_sub1_sub2.method18067(-760531614);
			int i_138_ = 1;
			if (class277 == Class277.aClass277_2950) {
				class277 = class523_sub4_sub1_sub2.method18068((byte) 57);
				i_138_ = class523_sub4_sub1_sub2.method18065(-1519867974);
			}
			switch (class277.anInt3029 * 55481905) {
			case 9:
			case 14:
			case 19:
			case 96:
				i_138_ *= 3;
				break;
			case 10:
			case 52:
			case 62:
			case 82:
			case 122:
				break;
			default:
				i_138_ = 0;
				break;
			case 16:
			case 49:
			case 59:
			case 101:
				i_138_ *= 2;
				break;
			case 18:
			case 90:
			case 102:
			case 114:
				i_138_ *= 4;
			}
			if (class523_sub4_sub1_sub2.anIntArray12075[i_136_] >= 0) {
				int i_139_ = class523_sub4_sub1_sub2.anIntArray12075[i_136_] + i_138_;
				if (i_134_ < i_139_)
					i_134_ = i_139_;
			}
			if (class523_sub4_sub1_sub2.anIntArray12076[i_136_] >= 0) {
				int i_140_ = class523_sub4_sub1_sub2.anIntArray12076[i_136_] + i_138_;
				if (i_135_ < i_140_)
					i_135_ = i_140_;
			}
		}
		aFloatArrayArray10088[0] = new float[i_134_ * 4];
		aFloatArrayArray10088[1] = new float[i_135_ * 4];
		aBool10090 = true;
		return true;
	}

	public void method132() {
		if (aLong10083 != 0L) {
			IUnknown.Release(aLong10083);
			aLong10083 = 0L;
		}
		if (aLong10089 != 0L) {
			IUnknown.Release(aLong10089);
			aLong10089 = 0L;
		}
		aClass178_Sub2_Sub1_10082.method14917(this);
	}

	Class270_Sub2(Class178_Sub2_Sub1 class178_sub2_sub1, Class265_Sub1 class265_sub1, Class264 class264) {
		this(class178_sub2_sub1, class264);
		aClass178_Sub2_Sub1_10082 = class178_sub2_sub1;
		aClass265_Sub1_10081 = class265_sub1;
	}

	void method4960(int i, float f, float f_141_, float f_142_, float f_143_) {
		int i_144_ = i >> 16;
		int i_145_ = (i & 0xffff) * 4;
		aFloatArrayArray10088[i_144_][i_145_] = f;
		aFloatArrayArray10088[i_144_][i_145_ + 1] = f_141_;
		aFloatArrayArray10088[i_144_][i_145_ + 2] = f_142_;
		aFloatArrayArray10088[i_144_][i_145_ + 3] = f_143_;
		aBoolArray10091[i_144_] = true;
	}

	final void method15626(int i, float[] fs, int i_146_) {
		Class698.method14050(fs, 0, aFloatArrayArray10088[0], i * 4, i_146_);
		aBoolArray10091[0] = true;
	}

	final void method15627(int i, float[] fs, int i_147_) {
		Class698.method14050(fs, 0, aFloatArrayArray10088[0], i * 4, i_147_);
		aBoolArray10091[0] = true;
	}

	void method4980(int i, float[] fs, int i_148_) {
		int i_149_ = i >> 16;
		int i_150_ = (i & 0xffff) * 4;
		System.arraycopy(fs, 0, aFloatArrayArray10088[i_149_], i_150_, i_148_);
		aBoolArray10091[i_149_] = true;
	}

	final void method15628(int i, float[] fs, int i_151_) {
		Class698.method14050(fs, 0, aFloatArrayArray10088[1], i * 4, i_151_);
		aBoolArray10091[1] = true;
	}

	public boolean method4975() {
		if (aBool10090)
			return true;
		aLong10083 = (aByteArray10086 == null ? 0L : IDirect3DDevice.CreateVertexShader((aClass178_Sub2_Sub1_10082.aLong11412), aByteArray10086));
		aLong10089 = (aByteArray10080 == null ? 0L : IDirect3DDevice.CreatePixelShader((aClass178_Sub2_Sub1_10082.aLong11412), aByteArray10080));
		if (aLong10083 == 0L && aLong10089 == 0L)
			return false;
		int i = -1;
		for (int i_152_ = 0; i_152_ < aClass265_Sub1_10081.method4756((byte) 3); i_152_++) {
			if (aClass265_Sub1_10081.method4749(i_152_, (byte) -45) == this) {
				i = i_152_;
				break;
			}
		}
		int i_153_ = aClass265_Sub1_10081.method4787((byte) 1);
		int i_154_ = aClass265_Sub1_10081.method4784(-2110317202);
		for (int i_155_ = 0; i_155_ < i_153_; i_155_++) {
			Class523_Sub4_Sub1 class523_sub4_sub1 = aClass265_Sub1_10081.method4788(i_155_, 124932798);
			class523_sub4_sub1.method18064(i);
		}
		for (int i_156_ = 0; i_156_ < i_154_; i_156_++) {
			Class523_Sub4_Sub1 class523_sub4_sub1 = aClass265_Sub1_10081.method4785(i_156_, -1664419388);
			class523_sub4_sub1.method18064(i);
		}
		int i_157_ = 0;
		int i_158_ = 0;
		int i_159_ = aClass265_Sub1_10081.method4758(this, 1254089095);
		for (int i_160_ = 0; i_160_ < i_153_ + i_154_; i_160_++) {
			Class523_Sub4_Sub1_Sub2 class523_sub4_sub1_sub2 = ((Class523_Sub4_Sub1_Sub2) (i_160_ < i_153_ ? aClass265_Sub1_10081.method4788(i_160_, 643801068) : aClass265_Sub1_10081.method4785(i_160_ - i_153_, -1579975328)));
			Class277 class277 = class523_sub4_sub1_sub2.method18067(690533369);
			int i_161_ = 1;
			if (class277 == Class277.aClass277_2950) {
				class277 = class523_sub4_sub1_sub2.method18068((byte) 11);
				i_161_ = class523_sub4_sub1_sub2.method18065(-1905209321);
			}
			switch (class277.anInt3029 * 55481905) {
			case 9:
			case 14:
			case 19:
			case 96:
				i_161_ *= 3;
				break;
			case 10:
			case 52:
			case 62:
			case 82:
			case 122:
				break;
			default:
				i_161_ = 0;
				break;
			case 16:
			case 49:
			case 59:
			case 101:
				i_161_ *= 2;
				break;
			case 18:
			case 90:
			case 102:
			case 114:
				i_161_ *= 4;
			}
			if (class523_sub4_sub1_sub2.anIntArray12075[i_159_] >= 0) {
				int i_162_ = class523_sub4_sub1_sub2.anIntArray12075[i_159_] + i_161_;
				if (i_157_ < i_162_)
					i_157_ = i_162_;
			}
			if (class523_sub4_sub1_sub2.anIntArray12076[i_159_] >= 0) {
				int i_163_ = class523_sub4_sub1_sub2.anIntArray12076[i_159_] + i_161_;
				if (i_158_ < i_163_)
					i_158_ = i_163_;
			}
		}
		aFloatArrayArray10088[0] = new float[i_157_ * 4];
		aFloatArrayArray10088[1] = new float[i_158_ * 4];
		aBool10090 = true;
		return true;
	}

	final void method15629(int i, float[] fs, int i_164_) {
		Class698.method14050(fs, 0, aFloatArrayArray10088[1], i * 4, i_164_);
		aBoolArray10091[1] = true;
	}

	void method15630() {
		if (aBoolArray10091[0]) {
			aClass178_Sub2_Sub1_10082.aByteBuffer9539.clear();
			aClass178_Sub2_Sub1_10082.aByteBuffer9539.asFloatBuffer().put(aFloatArrayArray10088[0]);
			IDirect3DDevice.SetVertexShaderConstantF(aClass178_Sub2_Sub1_10082.aLong11412, 0, aClass178_Sub2_Sub1_10082.aLong9540, aFloatArrayArray10088[0].length / 4);
			aBoolArray10091[0] = false;
		}
		if (aBoolArray10091[1]) {
			aClass178_Sub2_Sub1_10082.aByteBuffer9539.clear();
			aClass178_Sub2_Sub1_10082.aByteBuffer9539.asFloatBuffer().put(aFloatArrayArray10088[1]);
			IDirect3DDevice.SetPixelShaderConstantF(aClass178_Sub2_Sub1_10082.aLong11412, 0, aClass178_Sub2_Sub1_10082.aLong9540, aFloatArrayArray10088[1].length / 4);
			aBoolArray10091[1] = false;
		}
	}

	void method15631() {
		if (aBoolArray10091[0]) {
			aClass178_Sub2_Sub1_10082.aByteBuffer9539.clear();
			aClass178_Sub2_Sub1_10082.aByteBuffer9539.asFloatBuffer().put(aFloatArrayArray10088[0]);
			IDirect3DDevice.SetVertexShaderConstantF(aClass178_Sub2_Sub1_10082.aLong11412, 0, aClass178_Sub2_Sub1_10082.aLong9540, aFloatArrayArray10088[0].length / 4);
			aBoolArray10091[0] = false;
		}
		if (aBoolArray10091[1]) {
			aClass178_Sub2_Sub1_10082.aByteBuffer9539.clear();
			aClass178_Sub2_Sub1_10082.aByteBuffer9539.asFloatBuffer().put(aFloatArrayArray10088[1]);
			IDirect3DDevice.SetPixelShaderConstantF(aClass178_Sub2_Sub1_10082.aLong11412, 0, aClass178_Sub2_Sub1_10082.aLong9540, aFloatArrayArray10088[1].length / 4);
			aBoolArray10091[1] = false;
		}
	}

	void method15632() {
		if (aLong10083 != 0L) {
			aClass178_Sub2_Sub1_10082.method17839(aLong10083);
			aLong10083 = 0L;
		}
		if (aLong10089 != 0L) {
			aClass178_Sub2_Sub1_10082.method17839(aLong10089);
			aLong10089 = 0L;
		}
	}
}
