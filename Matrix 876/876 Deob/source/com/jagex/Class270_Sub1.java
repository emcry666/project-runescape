/* Class270_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.Map;

import jaggl.OpenGL;

public class Class270_Sub1 extends Class270 {
	static final int anInt9972 = 35632;
	static boolean $assertionsDisabled = !com.jagex.Class270_Sub1.class.desiredAssertionStatus();
	static final int anInt9973 = 13;
	Class178_Sub2_Sub2 aClass178_Sub2_Sub2_9974;
	static float[] aFloatArray9975;
	int anInt9976 = 0;
	int anInt9977 = 0;
	Map aMap9978;
	boolean aBool9979;
	int[] anIntArray9980;
	static int[] anIntArray9981 = new int[2];
	static final int anInt9982 = 35633;
	String aString9983;
	Map aMap9984;
	Map aMap9985;
	Map aMap9986;
	String aString9987;
	Class265_Sub2 aClass265_Sub2_9988;
	int anInt9989 = 0;
	Map aMap9990;

	void method4959(Class523_Sub4_Sub1 class523_sub4_sub1, int i, Interface43 interface43) {
		int i_0_ = ((Class523_Sub4_Sub1_Sub1) class523_sub4_sub1).method18508();
		if (i_0_ != -1) {
			if (interface43 == null)
				interface43 = aClass178_Sub2_Sub2_9974.anInterface37_9669;
			if (i < aClass178_Sub2_Sub2_9974.anInt9680) {
				aClass178_Sub2_Sub2_9974.method15255(i);
				aClass178_Sub2_Sub2_9974.method15001(interface43);
			} else {
				OpenGL.glActiveTexture(33984 + i);
				OpenGL.glBindTexture(((Class492) interface43).anInt5544, ((Class492) interface43).anInt5542);
			}
			if (aMap9990.get(Integer.valueOf(i_0_)) == null || (((Integer) aMap9990.get(Integer.valueOf(i_0_))).intValue() != i)) {
				aMap9990.put(Integer.valueOf(i_0_), Integer.valueOf(i));
				OpenGL.glUniform1i(i_0_, i);
			}
		}
	}

	Class270_Sub1(Class178_Sub2_Sub2 class178_sub2_sub2, Class264 class264) {
		aBool9979 = false;
		anIntArray9980 = new int[13];
		aMap9978 = new HashMap();
		aMap9984 = new HashMap();
		aMap9985 = new HashMap();
		aMap9986 = new HashMap();
		aMap9990 = new HashMap();
		aString2872 = class264.aString2848;
		StringBuilder stringbuilder = new StringBuilder();
		if (class264.aString2846 != null) {
			aString2873 = class264.aString2846;
			if (class264.aClass267Array2849 != null) {
				Class267[] class267s = class264.aClass267Array2849;
				for (int i = 0; i < class267s.length; i++) {
					Class267 class267 = class267s[i];
					stringbuilder.append(new StringBuilder().append("#define ").append(class267.aString2863).append(" ").append(class267.aString2864).append('\n').toString());
				}
			}
			stringbuilder.append(new String(class178_sub2_sub2.method17910(aString2873)));
			aString9983 = stringbuilder.toString();
		}
		if (class264.aString2847 != null) {
			aString2874 = class264.aString2847;
			stringbuilder.setLength(0);
			if (class264.aClass267Array2845 != null) {
				Class267[] class267s = class264.aClass267Array2845;
				for (int i = 0; i < class267s.length; i++) {
					Class267 class267 = class267s[i];
					stringbuilder.append(new StringBuilder().append("#define ").append(class267.aString2863).append(" ").append(class267.aString2864).append('\n').toString());
				}
			}
			stringbuilder.append(new String(class178_sub2_sub2.method17910(aString2874)));
			aString9987 = stringbuilder.toString();
		}
		Class698.method14053(anIntArray9980, 0, anIntArray9980.length, -1);
	}

	int method15528(int i, String string, String string_1_) {
		if (string == null)
			return 0;
		int i_2_ = OpenGL.glCreateShader(i);
		OpenGL.glShaderSource(i_2_, string);
		OpenGL.glCompileShader(i_2_);
		OpenGL.glGetShaderiv(i_2_, 35713, anIntArray9981, 0);
		if (anIntArray9981[0] == 0) {
			OpenGL.glDeleteShader(i_2_);
			i_2_ = 0;
		}
		return i_2_;
	}

	public boolean method4927() {
		if (aBool9979)
			return true;
		aClass178_Sub2_Sub2_9974.aClass270_Sub1_11505 = null;
		anInt9977 = method15528(35633, aString9983, aString2873);
		anInt9989 = method15528(35632, aString9987, aString2874);
		if (anInt9977 == 0 || anInt9989 == 0) {
			if (anInt9977 != 0)
				OpenGL.glDeleteShader(anInt9977);
			if (anInt9989 != 0)
				OpenGL.glDeleteShader(anInt9989);
			return false;
		}
		anInt9976 = OpenGL.glCreateProgram();
		if (anInt9977 != 0)
			OpenGL.glAttachShader(anInt9976, anInt9977);
		if (anInt9989 != 0)
			OpenGL.glAttachShader(anInt9976, anInt9989);
		OpenGL.glLinkProgram(anInt9976);
		OpenGL.glGetProgramiv(anInt9976, 35714, anIntArray9981, 0);
		if (anIntArray9981[0] == 0) {
			if (anInt9977 != 0) {
				OpenGL.glDetachShader(anInt9976, anInt9977);
				OpenGL.glDeleteShader(anInt9977);
			}
			if (anInt9989 != 0) {
				OpenGL.glDetachShader(anInt9976, anInt9989);
				OpenGL.glDeleteShader(anInt9989);
			}
			OpenGL.glDeleteProgram(anInt9976);
			return false;
		}
		OpenGL.glUseProgram(anInt9976);
		int i = -1;
		for (int i_3_ = 0; i_3_ < aClass265_Sub2_9988.method4756((byte) -119); i_3_++) {
			if (aClass265_Sub2_9988.method4749(i_3_, (byte) -58) == this) {
				i = i_3_;
				break;
			}
		}
		if (i == -1)
			return false;
		for (int i_4_ = 0; i_4_ < aClass265_Sub2_9988.method4787((byte) 1); i_4_++) {
			Class523_Sub4_Sub1 class523_sub4_sub1 = aClass265_Sub2_9988.method4788(i_4_, -1834488415);
			if (class523_sub4_sub1 != null)
				class523_sub4_sub1.method18064(i);
		}
		for (int i_5_ = 0; i_5_ < aClass265_Sub2_9988.method4784(-1381789384); i_5_++) {
			Class523_Sub4_Sub1 class523_sub4_sub1 = aClass265_Sub2_9988.method4785(i_5_, -803001791);
			if (class523_sub4_sub1 != null)
				class523_sub4_sub1.method18064(i);
		}
		aString9983 = null;
		aString9987 = null;
		aBool9979 = true;
		return true;
	}

	void method4952(int i, Class441 class441) {
		OpenGL.glUniform4fv(i, 4, class441.method7134(aFloatArray9975), 0);
	}

	void method4929(Class523_Sub4_Sub1 class523_sub4_sub1, float f, float f_6_) {
		int i = ((Class523_Sub4_Sub1_Sub1) class523_sub4_sub1).method18508();
		if (i != -1) {
			if (aMap9978.get(Integer.valueOf(i)) == null || aMap9984.get(Integer.valueOf(i)) == null || ((Float) aMap9978.get(Integer.valueOf(i))).floatValue() != f || (((Float) aMap9984.get(Integer.valueOf(i))).floatValue() != f_6_)) {
				aMap9978.put(Integer.valueOf(i), Float.valueOf(f));
				aMap9984.put(Integer.valueOf(i), Float.valueOf(f_6_));
				if (class523_sub4_sub1.method18067(1962255087) != Class277.aClass277_2929)
					throw new IllegalArgumentException_Sub1(class523_sub4_sub1, "");
				OpenGL.glUniform2f(i, f, f_6_);
			}
		}
	}

	void method4930(Class523_Sub4_Sub1 class523_sub4_sub1, float f, float f_7_, float f_8_) {
		int i = ((Class523_Sub4_Sub1_Sub1) class523_sub4_sub1).method18508();
		if (i != -1) {
			if (aMap9978.get(Integer.valueOf(i)) == null || aMap9984.get(Integer.valueOf(i)) == null || aMap9985.get(Integer.valueOf(i)) == null || ((Float) aMap9978.get(Integer.valueOf(i))).floatValue() != f || (((Float) aMap9984.get(Integer.valueOf(i))).floatValue() != f_7_) || (((Float) aMap9985.get(Integer.valueOf(i))).floatValue() != f_8_)) {
				aMap9978.put(Integer.valueOf(i), Float.valueOf(f));
				aMap9984.put(Integer.valueOf(i), Float.valueOf(f_7_));
				aMap9985.put(Integer.valueOf(i), Float.valueOf(f_8_));
				if (class523_sub4_sub1.method18067(1880814314) != Class277.aClass277_2930)
					throw new IllegalArgumentException_Sub1(class523_sub4_sub1, "");
				OpenGL.glUniform3f(i, f, f_7_, f_8_);
			}
		}
	}

	void method4931(Class523_Sub4_Sub1 class523_sub4_sub1, float f, float f_9_, float f_10_, float f_11_) {
		int i = ((Class523_Sub4_Sub1_Sub1) class523_sub4_sub1).method18508();
		if (i != -1) {
			if (aMap9978.get(Integer.valueOf(i)) == null || aMap9984.get(Integer.valueOf(i)) == null || aMap9985.get(Integer.valueOf(i)) == null || aMap9986.get(Integer.valueOf(i)) == null || ((Float) aMap9978.get(Integer.valueOf(i))).floatValue() != f || (((Float) aMap9984.get(Integer.valueOf(i))).floatValue() != f_9_) || (((Float) aMap9985.get(Integer.valueOf(i))).floatValue() != f_10_) || (((Float) aMap9986.get(Integer.valueOf(i))).floatValue() != f_11_)) {
				aMap9978.put(Integer.valueOf(i), Float.valueOf(f));
				aMap9984.put(Integer.valueOf(i), Float.valueOf(f_9_));
				aMap9985.put(Integer.valueOf(i), Float.valueOf(f_10_));
				aMap9986.put(Integer.valueOf(i), Float.valueOf(f_11_));
				if (class523_sub4_sub1.method18067(-818986206) != Class277.aClass277_3010)
					throw new IllegalArgumentException_Sub1(class523_sub4_sub1, "");
				OpenGL.glUniform4f(i, f, f_9_, f_10_, f_11_);
			}
		}
	}

	void method4935(Class523_Sub4_Sub1 class523_sub4_sub1, float[] fs, int i) {
		int i_12_ = ((Class523_Sub4_Sub1_Sub1) class523_sub4_sub1).method18508();
		if (i_12_ != -1)
			OpenGL.glUniform4fv(i_12_, i, fs, 0);
	}

	void method4941(Class523_Sub4_Sub1 class523_sub4_sub1, Class441 class441) {
		if (!$assertionsDisabled && (class523_sub4_sub1.method18067(2098069970) != Class277.aClass277_2919))
			throw new AssertionError();
		int i = ((Class523_Sub4_Sub1_Sub1) class523_sub4_sub1).method18508();
		if (i != -1)
			OpenGL.glUniform2fv(i, 4, class441.method7196(aFloatArray9975), 0);
	}

	void method4961(Class523_Sub4_Sub1 class523_sub4_sub1, Class441 class441) {
		if (!$assertionsDisabled && (class523_sub4_sub1.method18067(-618261898) != Class277.aClass277_2921))
			throw new AssertionError();
		int i = ((Class523_Sub4_Sub1_Sub1) class523_sub4_sub1).method18508();
		if (i != -1)
			OpenGL.glUniform4fv(i, 4, class441.method7134(aFloatArray9975), 0);
	}

	void method4932(int i, int i_13_, Interface43 interface43) {
		aClass178_Sub2_Sub2_9974.method15255(i_13_);
		aClass178_Sub2_Sub2_9974.method15001(interface43);
		OpenGL.glUniform1i(i, i_13_);
	}

	void method4925(int i, float f, float f_14_, float f_15_) {
		OpenGL.glUniform3f(i, f, f_14_, f_15_);
	}

	void method4937(int i, float f, float f_16_, float f_17_, float f_18_) {
		OpenGL.glUniform4f(i, f, f_16_, f_17_, f_18_);
	}

	void method4946(int i, float[] fs, int i_19_) {
		OpenGL.glUniform4fv(i, i_19_, fs, 0);
	}

	void method4939(int i, Class441 class441) {
		OpenGL.glUniform3fv(i, 3, class441.method7146(aFloatArray9975), 0);
	}

	void method4940(int i, Class441 class441) {
		OpenGL.glUniform2fv(i, 4, class441.method7196(aFloatArray9975), 0);
	}

	void method4942(int i, int i_20_, Interface43 interface43) {
		aClass178_Sub2_Sub2_9974.method15255(i_20_);
		aClass178_Sub2_Sub2_9974.method15001(interface43);
		OpenGL.glUniform1i(i, i_20_);
	}

	void method4948(Class523_Sub4_Sub1 class523_sub4_sub1, float f, float f_21_) {
		int i = ((Class523_Sub4_Sub1_Sub1) class523_sub4_sub1).method18508();
		if (i != -1) {
			if (aMap9978.get(Integer.valueOf(i)) == null || aMap9984.get(Integer.valueOf(i)) == null || ((Float) aMap9978.get(Integer.valueOf(i))).floatValue() != f || (((Float) aMap9984.get(Integer.valueOf(i))).floatValue() != f_21_)) {
				aMap9978.put(Integer.valueOf(i), Float.valueOf(f));
				aMap9984.put(Integer.valueOf(i), Float.valueOf(f_21_));
				if (class523_sub4_sub1.method18067(910198657) != Class277.aClass277_2929)
					throw new IllegalArgumentException_Sub1(class523_sub4_sub1, "");
				OpenGL.glUniform2f(i, f, f_21_);
			}
		}
	}

	static {
		aFloatArray9975 = new float[16];
	}

	void method4963(int i, float f, float f_22_, float f_23_) {
		OpenGL.glUniform3f(i, f, f_22_, f_23_);
	}

	void method4934(Class523_Sub4_Sub1 class523_sub4_sub1, float f, float f_24_, float f_25_, float f_26_) {
		int i = ((Class523_Sub4_Sub1_Sub1) class523_sub4_sub1).method18508();
		if (i != -1) {
			if (aMap9978.get(Integer.valueOf(i)) == null || aMap9984.get(Integer.valueOf(i)) == null || aMap9985.get(Integer.valueOf(i)) == null || aMap9986.get(Integer.valueOf(i)) == null || ((Float) aMap9978.get(Integer.valueOf(i))).floatValue() != f || (((Float) aMap9984.get(Integer.valueOf(i))).floatValue() != f_24_) || (((Float) aMap9985.get(Integer.valueOf(i))).floatValue() != f_25_) || (((Float) aMap9986.get(Integer.valueOf(i))).floatValue() != f_26_)) {
				aMap9978.put(Integer.valueOf(i), Float.valueOf(f));
				aMap9984.put(Integer.valueOf(i), Float.valueOf(f_24_));
				aMap9985.put(Integer.valueOf(i), Float.valueOf(f_25_));
				aMap9986.put(Integer.valueOf(i), Float.valueOf(f_26_));
				if (class523_sub4_sub1.method18067(1173647566) != Class277.aClass277_3010)
					throw new IllegalArgumentException_Sub1(class523_sub4_sub1, "");
				OpenGL.glUniform4f(i, f, f_24_, f_25_, f_26_);
			}
		}
	}

	public void method130() {
		if (anInt9976 != 0) {
			aClass178_Sub2_Sub2_9974.method17899(anInt9976);
			if (anInt9977 != 0)
				aClass178_Sub2_Sub2_9974.method17898((long) anInt9977);
			if (anInt9989 != 0)
				aClass178_Sub2_Sub2_9974.method17898((long) anInt9989);
			anInt9976 = 0;
			anInt9977 = 0;
			anInt9989 = 0;
		}
	}

	void method4951(Class523_Sub4_Sub1 class523_sub4_sub1, int i, Interface43 interface43) {
		int i_27_ = ((Class523_Sub4_Sub1_Sub1) class523_sub4_sub1).method18508();
		if (i_27_ != -1) {
			if (interface43 == null)
				interface43 = aClass178_Sub2_Sub2_9974.anInterface37_9669;
			if (i < aClass178_Sub2_Sub2_9974.anInt9680) {
				aClass178_Sub2_Sub2_9974.method15255(i);
				aClass178_Sub2_Sub2_9974.method15001(interface43);
			} else {
				OpenGL.glActiveTexture(33984 + i);
				OpenGL.glBindTexture(((Class492) interface43).anInt5544, ((Class492) interface43).anInt5542);
			}
			if (aMap9990.get(Integer.valueOf(i_27_)) == null || (((Integer) aMap9990.get(Integer.valueOf(i_27_))).intValue() != i)) {
				aMap9990.put(Integer.valueOf(i_27_), Integer.valueOf(i));
				OpenGL.glUniform1i(i_27_, i);
			}
		}
	}

	void method4949(Class523_Sub4_Sub1 class523_sub4_sub1, float f) {
		int i = ((Class523_Sub4_Sub1_Sub1) class523_sub4_sub1).method18508();
		if (i != -1) {
			if (aMap9978.get(Integer.valueOf(i)) == null || (((Float) aMap9978.get(Integer.valueOf(i))).floatValue() != f)) {
				aMap9978.put(Integer.valueOf(i), Float.valueOf(f));
				if ((class523_sub4_sub1.method18067(27872276) != Class277.aClass277_2928) && (class523_sub4_sub1.method18067(1020313336) != Class277.aClass277_3021))
					throw new IllegalArgumentException_Sub1(class523_sub4_sub1, "");
				OpenGL.glUniform1f(i, f);
			}
		}
	}

	void method15529() {
		method131();
	}

	void method4936(Class523_Sub4_Sub1 class523_sub4_sub1, float f) {
		int i = ((Class523_Sub4_Sub1_Sub1) class523_sub4_sub1).method18508();
		if (i != -1) {
			if (aMap9978.get(Integer.valueOf(i)) == null || (((Float) aMap9978.get(Integer.valueOf(i))).floatValue() != f)) {
				aMap9978.put(Integer.valueOf(i), Float.valueOf(f));
				if ((class523_sub4_sub1.method18067(1848740367) != Class277.aClass277_2928) && (class523_sub4_sub1.method18067(2065280098) != Class277.aClass277_3021))
					throw new IllegalArgumentException_Sub1(class523_sub4_sub1, "");
				OpenGL.glUniform1f(i, f);
			}
		}
	}

	void method4943(Class523_Sub4_Sub1 class523_sub4_sub1, float f) {
		int i = ((Class523_Sub4_Sub1_Sub1) class523_sub4_sub1).method18508();
		if (i != -1) {
			if (aMap9978.get(Integer.valueOf(i)) == null || (((Float) aMap9978.get(Integer.valueOf(i))).floatValue() != f)) {
				aMap9978.put(Integer.valueOf(i), Float.valueOf(f));
				if ((class523_sub4_sub1.method18067(1930489623) != Class277.aClass277_2928) && (class523_sub4_sub1.method18067(1238496844) != Class277.aClass277_3021))
					throw new IllegalArgumentException_Sub1(class523_sub4_sub1, "");
				OpenGL.glUniform1f(i, f);
			}
		}
	}

	void method4962(int i, float f, float f_28_, float f_29_) {
		OpenGL.glUniform3f(i, f, f_28_, f_29_);
	}

	void method4928(Class523_Sub4_Sub1 class523_sub4_sub1, float f, float f_30_) {
		int i = ((Class523_Sub4_Sub1_Sub1) class523_sub4_sub1).method18508();
		if (i != -1) {
			if (aMap9978.get(Integer.valueOf(i)) == null || aMap9984.get(Integer.valueOf(i)) == null || ((Float) aMap9978.get(Integer.valueOf(i))).floatValue() != f || (((Float) aMap9984.get(Integer.valueOf(i))).floatValue() != f_30_)) {
				aMap9978.put(Integer.valueOf(i), Float.valueOf(f));
				aMap9984.put(Integer.valueOf(i), Float.valueOf(f_30_));
				if (class523_sub4_sub1.method18067(701666057) != Class277.aClass277_2929)
					throw new IllegalArgumentException_Sub1(class523_sub4_sub1, "");
				OpenGL.glUniform2f(i, f, f_30_);
			}
		}
	}

	void method4956(Class523_Sub4_Sub1 class523_sub4_sub1, Class441 class441) {
		if (!$assertionsDisabled && (class523_sub4_sub1.method18067(1057511112) != Class277.aClass277_2921))
			throw new AssertionError();
		int i = ((Class523_Sub4_Sub1_Sub1) class523_sub4_sub1).method18508();
		if (i != -1)
			OpenGL.glUniform4fv(i, 4, class441.method7134(aFloatArray9975), 0);
	}

	void method4954(Class523_Sub4_Sub1 class523_sub4_sub1, float f, float f_31_, float f_32_) {
		int i = ((Class523_Sub4_Sub1_Sub1) class523_sub4_sub1).method18508();
		if (i != -1) {
			if (aMap9978.get(Integer.valueOf(i)) == null || aMap9984.get(Integer.valueOf(i)) == null || aMap9985.get(Integer.valueOf(i)) == null || ((Float) aMap9978.get(Integer.valueOf(i))).floatValue() != f || (((Float) aMap9984.get(Integer.valueOf(i))).floatValue() != f_31_) || (((Float) aMap9985.get(Integer.valueOf(i))).floatValue() != f_32_)) {
				aMap9978.put(Integer.valueOf(i), Float.valueOf(f));
				aMap9984.put(Integer.valueOf(i), Float.valueOf(f_31_));
				aMap9985.put(Integer.valueOf(i), Float.valueOf(f_32_));
				if (class523_sub4_sub1.method18067(1758616166) != Class277.aClass277_2930)
					throw new IllegalArgumentException_Sub1(class523_sub4_sub1, "");
				OpenGL.glUniform3f(i, f, f_31_, f_32_);
			}
		}
	}

	Class270_Sub1(Class178_Sub2_Sub2 class178_sub2_sub2, Class265_Sub2 class265_sub2, Class264 class264) {
		this(class178_sub2_sub2, class264);
		aClass265_Sub2_9988 = class265_sub2;
		aClass178_Sub2_Sub2_9974 = class178_sub2_sub2;
	}

	int method15530(int i, String string, String string_33_) {
		if (string == null)
			return 0;
		int i_34_ = OpenGL.glCreateShader(i);
		OpenGL.glShaderSource(i_34_, string);
		OpenGL.glCompileShader(i_34_);
		OpenGL.glGetShaderiv(i_34_, 35713, anIntArray9981, 0);
		if (anIntArray9981[0] == 0) {
			OpenGL.glDeleteShader(i_34_);
			i_34_ = 0;
		}
		return i_34_;
	}

	void method4979(Class523_Sub4_Sub1 class523_sub4_sub1, float[] fs, int i) {
		int i_35_ = ((Class523_Sub4_Sub1_Sub1) class523_sub4_sub1).method18508();
		if (i_35_ != -1)
			OpenGL.glUniform4fv(i_35_, i, fs, 0);
	}

	void method4955(Class523_Sub4_Sub1 class523_sub4_sub1, Class441 class441) {
		if (!$assertionsDisabled && (class523_sub4_sub1.method18067(1458725813) != Class277.aClass277_2919))
			throw new AssertionError();
		int i = ((Class523_Sub4_Sub1_Sub1) class523_sub4_sub1).method18508();
		if (i != -1)
			OpenGL.glUniform2fv(i, 4, class441.method7196(aFloatArray9975), 0);
	}

	void method4966(int i, Class441 class441) {
		OpenGL.glUniform2fv(i, 4, class441.method7196(aFloatArray9975), 0);
	}

	public void method78() {
		if (anInt9976 != 0) {
			aClass178_Sub2_Sub2_9974.method17899(anInt9976);
			if (anInt9977 != 0)
				aClass178_Sub2_Sub2_9974.method17898((long) anInt9977);
			if (anInt9989 != 0)
				aClass178_Sub2_Sub2_9974.method17898((long) anInt9989);
			anInt9976 = 0;
			anInt9977 = 0;
			anInt9989 = 0;
		}
	}

	void method4958(Class523_Sub4_Sub1 class523_sub4_sub1, Class441 class441) {
		if (!$assertionsDisabled && (class523_sub4_sub1.method18067(1903660830) != Class277.aClass277_2921))
			throw new AssertionError();
		int i = ((Class523_Sub4_Sub1_Sub1) class523_sub4_sub1).method18508();
		if (i != -1)
			OpenGL.glUniform4fv(i, 4, class441.method7134(aFloatArray9975), 0);
	}

	void method4964(int i, Class441 class441) {
		OpenGL.glUniform3fv(i, 3, class441.method7146(aFloatArray9975), 0);
	}

	public void method131() {
		if (anInt9976 != 0) {
			aClass178_Sub2_Sub2_9974.method17899(anInt9976);
			if (anInt9977 != 0)
				aClass178_Sub2_Sub2_9974.method17898((long) anInt9977);
			if (anInt9989 != 0)
				aClass178_Sub2_Sub2_9974.method17898((long) anInt9989);
			anInt9976 = 0;
			anInt9977 = 0;
			anInt9989 = 0;
		}
	}

	void method4965(Class523_Sub4_Sub1 class523_sub4_sub1, int i, Interface43 interface43) {
		int i_36_ = ((Class523_Sub4_Sub1_Sub1) class523_sub4_sub1).method18508();
		if (i_36_ != -1) {
			if (interface43 == null)
				interface43 = aClass178_Sub2_Sub2_9974.anInterface37_9669;
			if (i < aClass178_Sub2_Sub2_9974.anInt9680) {
				aClass178_Sub2_Sub2_9974.method15255(i);
				aClass178_Sub2_Sub2_9974.method15001(interface43);
			} else {
				OpenGL.glActiveTexture(33984 + i);
				OpenGL.glBindTexture(((Class492) interface43).anInt5544, ((Class492) interface43).anInt5542);
			}
			if (aMap9990.get(Integer.valueOf(i_36_)) == null || (((Integer) aMap9990.get(Integer.valueOf(i_36_))).intValue() != i)) {
				aMap9990.put(Integer.valueOf(i_36_), Integer.valueOf(i));
				OpenGL.glUniform1i(i_36_, i);
			}
		}
	}

	void method4960(int i, float f, float f_37_, float f_38_, float f_39_) {
		OpenGL.glUniform4f(i, f, f_37_, f_38_, f_39_);
	}

	public void finalize() {
		method131();
	}

	void method4933(int i, Class441 class441) {
		OpenGL.glUniform4fv(i, 4, class441.method7134(aFloatArray9975), 0);
	}

	void method4950(Class523_Sub4_Sub1 class523_sub4_sub1, float f, float f_40_) {
		int i = ((Class523_Sub4_Sub1_Sub1) class523_sub4_sub1).method18508();
		if (i != -1) {
			if (aMap9978.get(Integer.valueOf(i)) == null || aMap9984.get(Integer.valueOf(i)) == null || ((Float) aMap9978.get(Integer.valueOf(i))).floatValue() != f || (((Float) aMap9984.get(Integer.valueOf(i))).floatValue() != f_40_)) {
				aMap9978.put(Integer.valueOf(i), Float.valueOf(f));
				aMap9984.put(Integer.valueOf(i), Float.valueOf(f_40_));
				if (class523_sub4_sub1.method18067(695078530) != Class277.aClass277_2929)
					throw new IllegalArgumentException_Sub1(class523_sub4_sub1, "");
				OpenGL.glUniform2f(i, f, f_40_);
			}
		}
	}

	void method4947(Class523_Sub4_Sub1 class523_sub4_sub1, int i, Interface43 interface43) {
		int i_41_ = ((Class523_Sub4_Sub1_Sub1) class523_sub4_sub1).method18508();
		if (i_41_ != -1) {
			if (interface43 == null)
				interface43 = aClass178_Sub2_Sub2_9974.anInterface37_9669;
			if (i < aClass178_Sub2_Sub2_9974.anInt9680) {
				aClass178_Sub2_Sub2_9974.method15255(i);
				aClass178_Sub2_Sub2_9974.method15001(interface43);
			} else {
				OpenGL.glActiveTexture(33984 + i);
				OpenGL.glBindTexture(((Class492) interface43).anInt5544, ((Class492) interface43).anInt5542);
			}
			if (aMap9990.get(Integer.valueOf(i_41_)) == null || (((Integer) aMap9990.get(Integer.valueOf(i_41_))).intValue() != i)) {
				aMap9990.put(Integer.valueOf(i_41_), Integer.valueOf(i));
				OpenGL.glUniform1i(i_41_, i);
			}
		}
	}

	void method4967(int i, Class441 class441) {
		OpenGL.glUniform2fv(i, 4, class441.method7196(aFloatArray9975), 0);
	}

	void method4968(int i, Class441 class441) {
		OpenGL.glUniform4fv(i, 4, class441.method7134(aFloatArray9975), 0);
	}

	void method4969(int i, Class441 class441) {
		OpenGL.glUniform4fv(i, 4, class441.method7134(aFloatArray9975), 0);
	}

	void method4974(int i, Class441 class441) {
		OpenGL.glUniform4fv(i, 4, class441.method7134(aFloatArray9975), 0);
	}

	void method4971(int i, Class441 class441) {
		OpenGL.glUniform4fv(i, 4, class441.method7134(aFloatArray9975), 0);
	}

	void method4972(int i, Class441 class441) {
		OpenGL.glUniform4fv(i, 4, class441.method7134(aFloatArray9975), 0);
	}

	void method4953(Class523_Sub4_Sub1 class523_sub4_sub1, float[] fs, int i) {
		int i_42_ = ((Class523_Sub4_Sub1_Sub1) class523_sub4_sub1).method18508();
		if (i_42_ != -1)
			OpenGL.glUniform4fv(i_42_, i, fs, 0);
	}

	void method4973(int i, int i_43_, Interface43 interface43) {
		aClass178_Sub2_Sub2_9974.method15255(i_43_);
		aClass178_Sub2_Sub2_9974.method15001(interface43);
		OpenGL.glUniform1i(i, i_43_);
	}

	public void method132() {
		if (anInt9976 != 0) {
			aClass178_Sub2_Sub2_9974.method17899(anInt9976);
			if (anInt9977 != 0)
				aClass178_Sub2_Sub2_9974.method17898((long) anInt9977);
			if (anInt9989 != 0)
				aClass178_Sub2_Sub2_9974.method17898((long) anInt9989);
			anInt9976 = 0;
			anInt9977 = 0;
			anInt9989 = 0;
		}
	}

	public boolean method4975() {
		if (aBool9979)
			return true;
		aClass178_Sub2_Sub2_9974.aClass270_Sub1_11505 = null;
		anInt9977 = method15528(35633, aString9983, aString2873);
		anInt9989 = method15528(35632, aString9987, aString2874);
		if (anInt9977 == 0 || anInt9989 == 0) {
			if (anInt9977 != 0)
				OpenGL.glDeleteShader(anInt9977);
			if (anInt9989 != 0)
				OpenGL.glDeleteShader(anInt9989);
			return false;
		}
		anInt9976 = OpenGL.glCreateProgram();
		if (anInt9977 != 0)
			OpenGL.glAttachShader(anInt9976, anInt9977);
		if (anInt9989 != 0)
			OpenGL.glAttachShader(anInt9976, anInt9989);
		OpenGL.glLinkProgram(anInt9976);
		OpenGL.glGetProgramiv(anInt9976, 35714, anIntArray9981, 0);
		if (anIntArray9981[0] == 0) {
			if (anInt9977 != 0) {
				OpenGL.glDetachShader(anInt9976, anInt9977);
				OpenGL.glDeleteShader(anInt9977);
			}
			if (anInt9989 != 0) {
				OpenGL.glDetachShader(anInt9976, anInt9989);
				OpenGL.glDeleteShader(anInt9989);
			}
			OpenGL.glDeleteProgram(anInt9976);
			return false;
		}
		OpenGL.glUseProgram(anInt9976);
		int i = -1;
		for (int i_44_ = 0; i_44_ < aClass265_Sub2_9988.method4756((byte) -67); i_44_++) {
			if (aClass265_Sub2_9988.method4749(i_44_, (byte) -21) == this) {
				i = i_44_;
				break;
			}
		}
		if (i == -1)
			return false;
		for (int i_45_ = 0; i_45_ < aClass265_Sub2_9988.method4787((byte) 1); i_45_++) {
			Class523_Sub4_Sub1 class523_sub4_sub1 = aClass265_Sub2_9988.method4788(i_45_, -1740603282);
			if (class523_sub4_sub1 != null)
				class523_sub4_sub1.method18064(i);
		}
		for (int i_46_ = 0; i_46_ < aClass265_Sub2_9988.method4784(-399578387); i_46_++) {
			Class523_Sub4_Sub1 class523_sub4_sub1 = aClass265_Sub2_9988.method4785(i_46_, -1453042234);
			if (class523_sub4_sub1 != null)
				class523_sub4_sub1.method18064(i);
		}
		aString9983 = null;
		aString9987 = null;
		aBool9979 = true;
		return true;
	}

	public boolean method4976() {
		if (aBool9979)
			return true;
		aClass178_Sub2_Sub2_9974.aClass270_Sub1_11505 = null;
		anInt9977 = method15528(35633, aString9983, aString2873);
		anInt9989 = method15528(35632, aString9987, aString2874);
		if (anInt9977 == 0 || anInt9989 == 0) {
			if (anInt9977 != 0)
				OpenGL.glDeleteShader(anInt9977);
			if (anInt9989 != 0)
				OpenGL.glDeleteShader(anInt9989);
			return false;
		}
		anInt9976 = OpenGL.glCreateProgram();
		if (anInt9977 != 0)
			OpenGL.glAttachShader(anInt9976, anInt9977);
		if (anInt9989 != 0)
			OpenGL.glAttachShader(anInt9976, anInt9989);
		OpenGL.glLinkProgram(anInt9976);
		OpenGL.glGetProgramiv(anInt9976, 35714, anIntArray9981, 0);
		if (anIntArray9981[0] == 0) {
			if (anInt9977 != 0) {
				OpenGL.glDetachShader(anInt9976, anInt9977);
				OpenGL.glDeleteShader(anInt9977);
			}
			if (anInt9989 != 0) {
				OpenGL.glDetachShader(anInt9976, anInt9989);
				OpenGL.glDeleteShader(anInt9989);
			}
			OpenGL.glDeleteProgram(anInt9976);
			return false;
		}
		OpenGL.glUseProgram(anInt9976);
		int i = -1;
		for (int i_47_ = 0; i_47_ < aClass265_Sub2_9988.method4756((byte) -68); i_47_++) {
			if (aClass265_Sub2_9988.method4749(i_47_, (byte) -25) == this) {
				i = i_47_;
				break;
			}
		}
		if (i == -1)
			return false;
		for (int i_48_ = 0; i_48_ < aClass265_Sub2_9988.method4787((byte) 1); i_48_++) {
			Class523_Sub4_Sub1 class523_sub4_sub1 = aClass265_Sub2_9988.method4788(i_48_, 1983299194);
			if (class523_sub4_sub1 != null)
				class523_sub4_sub1.method18064(i);
		}
		for (int i_49_ = 0; i_49_ < aClass265_Sub2_9988.method4784(-39405734); i_49_++) {
			Class523_Sub4_Sub1 class523_sub4_sub1 = aClass265_Sub2_9988.method4785(i_49_, -1674800234);
			if (class523_sub4_sub1 != null)
				class523_sub4_sub1.method18064(i);
		}
		aString9983 = null;
		aString9987 = null;
		aBool9979 = true;
		return true;
	}

	public boolean method4977() {
		if (aBool9979)
			return true;
		aClass178_Sub2_Sub2_9974.aClass270_Sub1_11505 = null;
		anInt9977 = method15528(35633, aString9983, aString2873);
		anInt9989 = method15528(35632, aString9987, aString2874);
		if (anInt9977 == 0 || anInt9989 == 0) {
			if (anInt9977 != 0)
				OpenGL.glDeleteShader(anInt9977);
			if (anInt9989 != 0)
				OpenGL.glDeleteShader(anInt9989);
			return false;
		}
		anInt9976 = OpenGL.glCreateProgram();
		if (anInt9977 != 0)
			OpenGL.glAttachShader(anInt9976, anInt9977);
		if (anInt9989 != 0)
			OpenGL.glAttachShader(anInt9976, anInt9989);
		OpenGL.glLinkProgram(anInt9976);
		OpenGL.glGetProgramiv(anInt9976, 35714, anIntArray9981, 0);
		if (anIntArray9981[0] == 0) {
			if (anInt9977 != 0) {
				OpenGL.glDetachShader(anInt9976, anInt9977);
				OpenGL.glDeleteShader(anInt9977);
			}
			if (anInt9989 != 0) {
				OpenGL.glDetachShader(anInt9976, anInt9989);
				OpenGL.glDeleteShader(anInt9989);
			}
			OpenGL.glDeleteProgram(anInt9976);
			return false;
		}
		OpenGL.glUseProgram(anInt9976);
		int i = -1;
		for (int i_50_ = 0; i_50_ < aClass265_Sub2_9988.method4756((byte) -84); i_50_++) {
			if (aClass265_Sub2_9988.method4749(i_50_, (byte) -27) == this) {
				i = i_50_;
				break;
			}
		}
		if (i == -1)
			return false;
		for (int i_51_ = 0; i_51_ < aClass265_Sub2_9988.method4787((byte) 1); i_51_++) {
			Class523_Sub4_Sub1 class523_sub4_sub1 = aClass265_Sub2_9988.method4788(i_51_, 271885282);
			if (class523_sub4_sub1 != null)
				class523_sub4_sub1.method18064(i);
		}
		for (int i_52_ = 0; i_52_ < aClass265_Sub2_9988.method4784(-1100476071); i_52_++) {
			Class523_Sub4_Sub1 class523_sub4_sub1 = aClass265_Sub2_9988.method4785(i_52_, 277565198);
			if (class523_sub4_sub1 != null)
				class523_sub4_sub1.method18064(i);
		}
		aString9983 = null;
		aString9987 = null;
		aBool9979 = true;
		return true;
	}

	public boolean method4978() {
		if (aBool9979)
			return true;
		aClass178_Sub2_Sub2_9974.aClass270_Sub1_11505 = null;
		anInt9977 = method15528(35633, aString9983, aString2873);
		anInt9989 = method15528(35632, aString9987, aString2874);
		if (anInt9977 == 0 || anInt9989 == 0) {
			if (anInt9977 != 0)
				OpenGL.glDeleteShader(anInt9977);
			if (anInt9989 != 0)
				OpenGL.glDeleteShader(anInt9989);
			return false;
		}
		anInt9976 = OpenGL.glCreateProgram();
		if (anInt9977 != 0)
			OpenGL.glAttachShader(anInt9976, anInt9977);
		if (anInt9989 != 0)
			OpenGL.glAttachShader(anInt9976, anInt9989);
		OpenGL.glLinkProgram(anInt9976);
		OpenGL.glGetProgramiv(anInt9976, 35714, anIntArray9981, 0);
		if (anIntArray9981[0] == 0) {
			if (anInt9977 != 0) {
				OpenGL.glDetachShader(anInt9976, anInt9977);
				OpenGL.glDeleteShader(anInt9977);
			}
			if (anInt9989 != 0) {
				OpenGL.glDetachShader(anInt9976, anInt9989);
				OpenGL.glDeleteShader(anInt9989);
			}
			OpenGL.glDeleteProgram(anInt9976);
			return false;
		}
		OpenGL.glUseProgram(anInt9976);
		int i = -1;
		for (int i_53_ = 0; i_53_ < aClass265_Sub2_9988.method4756((byte) -122); i_53_++) {
			if (aClass265_Sub2_9988.method4749(i_53_, (byte) -24) == this) {
				i = i_53_;
				break;
			}
		}
		if (i == -1)
			return false;
		for (int i_54_ = 0; i_54_ < aClass265_Sub2_9988.method4787((byte) 1); i_54_++) {
			Class523_Sub4_Sub1 class523_sub4_sub1 = aClass265_Sub2_9988.method4788(i_54_, -1281170773);
			if (class523_sub4_sub1 != null)
				class523_sub4_sub1.method18064(i);
		}
		for (int i_55_ = 0; i_55_ < aClass265_Sub2_9988.method4784(-1746888640); i_55_++) {
			Class523_Sub4_Sub1 class523_sub4_sub1 = aClass265_Sub2_9988.method4785(i_55_, 187108972);
			if (class523_sub4_sub1 != null)
				class523_sub4_sub1.method18064(i);
		}
		aString9983 = null;
		aString9987 = null;
		aBool9979 = true;
		return true;
	}

	void method4957(Class523_Sub4_Sub1 class523_sub4_sub1, Class441 class441) {
		if (!$assertionsDisabled && (class523_sub4_sub1.method18067(638199148) != Class277.aClass277_2921))
			throw new AssertionError();
		int i = ((Class523_Sub4_Sub1_Sub1) class523_sub4_sub1).method18508();
		if (i != -1)
			OpenGL.glUniform4fv(i, 4, class441.method7134(aFloatArray9975), 0);
	}

	void method4938(int i, Class441 class441) {
		OpenGL.glUniform3fv(i, 3, class441.method7146(aFloatArray9975), 0);
	}

	void method4981(int i, float[] fs, int i_56_) {
		OpenGL.glUniform4fv(i, i_56_, fs, 0);
	}

	void method4980(int i, float[] fs, int i_57_) {
		OpenGL.glUniform4fv(i, i_57_, fs, 0);
	}
}
