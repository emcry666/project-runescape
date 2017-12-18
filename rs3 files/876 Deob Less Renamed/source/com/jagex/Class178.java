/* Class178 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;
import java.awt.Dimension;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;

public abstract class Class178 {
	protected int anInt1915;
	public Class172 aClass172_1916;
	protected static final int anInt1917 = 1;
	public static final int anInt1918 = 2;
	public static final int anInt1919 = 0;
	static final int anInt1920 = 8;
	static boolean[] aBoolArray1921 = new boolean[8];
	public int anInt1922;
	public Interface25 anInterface25_1923;
	protected Hashtable aHashtable1924;
	public Interface46 anInterface46_1925;
	public Interface48 anInterface48_1926;
	public static final int anInt1927 = 0;
	public static final int anInt1928 = 3;
	public static final int anInt1929 = 2;
	public static final int anInt1930 = 5;
	protected static final int anInt1931 = 2;
	protected static final int anInt1932 = 4;
	protected static final int anInt1933 = 8;
	protected static final int anInt1934 = 16;
	protected static final int anInt1935 = 32;
	static final int anInt1936 = 4;
	public int anInt1937;
	protected Class168 aClass168_1938;
	protected Class168_Sub2 aClass168_Sub2_1939;
	public static final int anInt1940 = 1;
	int anInt1941 = 724399989;
	protected int anInt1942;
	protected int anInt1943;
	public static final int anInt1944 = 1;
	public int anInt1945;
	protected int anInt1946;
	Class168_Sub1[] aClass168_Sub1Array1947;
	public float aFloat1948;

	public abstract boolean method3017();

	Class178(Class172 class172, Interface25 interface25, Interface46 interface46, Interface48 interface48, Interface45 interface45) {
		aHashtable1924 = new Hashtable();
		aClass168_Sub1Array1947 = new Class168_Sub1[4];
		anInt1915 = 0;
		aFloat1948 = 0.0F;
		aClass172_1916 = class172;
		anInterface25_1923 = interface25;
		anInterface46_1925 = interface46;
		anInterface48_1926 = interface48;
		int i = -1;
		for (int i_0_ = 0; i_0_ < 8; i_0_++) {
			if (!aBoolArray1921[i_0_]) {
				aBoolArray1921[i_0_] = true;
				i = i_0_;
				break;
			}
		}
		if (-1 == i)
			throw new IllegalStateException("");
		anInt1922 = 2067972341 * i;
	}

	abstract void method3018(float f, float f_1_, float f_2_, float f_3_, float f_4_, float f_5_);

	public final void method3019(int i) throws Exception_Sub4 {
		method3221(0, 0);
	}

	public abstract int[] method3020(int i, int i_6_, int i_7_, int i_8_);

	public abstract void method3021();

	public abstract Class168_Sub1 method3022();

	abstract void method3023();

	public void method3024(int i) {
		aBoolArray1921[anInt1922 * -1144788131] = false;
		Enumeration enumeration = aHashtable1924.keys();
		while (enumeration.hasMoreElements()) {
			Canvas canvas = (Canvas) enumeration.nextElement();
			Class168_Sub2 class168_sub2 = (Class168_Sub2) aHashtable1924.get(canvas);
			class168_sub2.method131();
		}
		method3023();
	}

	public abstract int method3025();

	public void finalize() {
		method3024(1377173515);
	}

	public abstract boolean method3026();

	public abstract boolean method3027();

	public abstract Class168_Sub1 method3028();

	public abstract boolean method3029();

	public abstract boolean method3030();

	public abstract boolean method3031();

	public abstract boolean method3032();

	public abstract boolean method3033();

	public abstract int method3034();

	public abstract boolean method3035();

	public abstract String method3036();

	public abstract void method3037(int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_);

	public void method3038(int[] is) {
		if (null != aClass168_Sub2_1939) {
			is[0] = aClass168_Sub2_1939.method2875();
			is[1] = aClass168_Sub2_1939.method2874();
		} else {
			int[] is_15_ = is;
			is[1] = 0;
			is_15_[0] = 0;
		}
	}

	public final Class168 method3039(int i) {
		return aClass168_1938;
	}

	public abstract void method3040(float f, float f_16_, float f_17_, float[] fs);

	public final void method3041(Canvas canvas, int i, int i_18_, int i_19_) {
		if (!aHashtable1924.containsKey(canvas)) {
			Class194_Sub14.method15513(canvas, (byte) -10);
			method3042(canvas, method3048(canvas, i, i_18_), -529203365);
		}
	}

	final void method3042(Canvas canvas, Class168_Sub2 class168_sub2, int i) {
		if (class168_sub2 == null)
			throw new RuntimeException("");
		aHashtable1924.put(canvas, class168_sub2);
	}

	public abstract void method3043(int[] is);

	public final void method3044(Canvas canvas, int i) {
		Class168_Sub2 class168_sub2 = (Class168_Sub2) aHashtable1924.get(canvas);
		if (null == class168_sub2)
			throw new RuntimeException();
		if (828088099 * anInt1941 > 0 || aClass168_1938 != aClass168_Sub2_1939)
			throw new RuntimeException();
		if (null != aClass168_1938)
			aClass168_1938.method2873();
		if (anInt1941 * 828088099 < 0)
			aClass168_1938 = class168_sub2;
		aClass168_Sub2_1939 = class168_sub2;
		class168_sub2.method359();
	}

	public final void method3045(Canvas canvas, int i, int i_20_, int i_21_) {
		Class168_Sub2 class168_sub2 = (Class168_Sub2) aHashtable1924.get(canvas);
		if (class168_sub2 == null)
			throw new RuntimeException("");
		class168_sub2.method15402(i, i_20_);
	}

	static synchronized Class178 method3046(int i, Canvas canvas, Class172 class172, Interface25 interface25, Interface46 interface46, Interface48 interface48, Interface45 interface45, Class472 class472, int i_22_, int i_23_, int i_24_) {
		if (i == 0)
			return Class688_Sub4_Sub1.method18187(canvas, class172, interface25, interface46, interface48, interface45, i_23_, i_24_, 646743354);
		if (1 == i)
			return Class152.method2525(canvas, class172, interface25, interface46, interface48, interface45, i_22_);
		if (i == 5)
			return Class476.method7769(canvas, class172, interface25, interface46, interface48, interface45, class472, i_22_);
		if (3 == i)
			return Class414.method6652(canvas, class172, interface25, interface46, interface48, interface45, class472, i_22_);
		throw new IllegalArgumentException("");
	}

	public final void method3047(Class168_Sub1 class168_sub1, short i) {
		if (anInt1941 * 828088099 < 0 || aClass168_Sub1Array1947[anInt1941 * 828088099] != class168_sub1)
			throw new RuntimeException();
		aClass168_Sub1Array1947[(anInt1941 -= -724399989) * 828088099 + 1] = null;
		class168_sub1.method2873();
		if (anInt1941 * 828088099 >= 0) {
			aClass168_1938 = aClass168_Sub1Array1947[anInt1941 * 828088099];
			aClass168_Sub1Array1947[828088099 * anInt1941].method359();
		} else {
			aClass168_1938 = aClass168_Sub2_1939;
			aClass168_Sub2_1939.method359();
		}
	}

	abstract Class168_Sub2 method3048(Canvas canvas, int i, int i_25_);

	public abstract Interface23 method3049(int i, int i_26_, int i_27_);

	public abstract Interface22 method3050(int i, int i_28_, Class158 class158, Class170 class170, int i_29_);

	public abstract Interface23 method3051(int i, int i_30_);

	public abstract Class441 method3052();

	public void method3053(float f, float f_31_, float f_32_) {
		method3018(f, f_31_, f_32_, 0.0F, 1.0F, 1.0F);
	}

	public abstract void method3054();

	public abstract void method3055(Class435 class435, Class180 class180, Class430 class430);

	public abstract boolean method3056();

	public abstract boolean method3057();

	public abstract boolean method3058();

	public abstract int method3059();

	public abstract void method3060();

	public abstract void method3061(int i, int i_33_, int i_34_);

	public abstract void method3062(int i, int i_35_);

	public abstract void method3063(long l);

	public abstract Class435 method3064();

	public abstract boolean method3065();

	public abstract void method3066();

	public abstract void method3067();

	public abstract int method3068(int i, int i_36_);

	public abstract void method3069(int[] is);

	public abstract boolean method3070();

	public abstract void method3071();

	public abstract Class441 method3072();

	abstract void method3073();

	public void method3074(boolean bool) {
		/* empty */
	}

	public abstract void method3075(int[] is);

	public abstract void method3076(int i, int i_37_);

	public final void method3077(int i, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_) {
		method3083(i, i_38_, i_39_, i_40_, i_41_, 1);
	}

	public abstract Class523_Sub8 method3078(int i);

	public final void method3079(int i, int i_43_, int i_44_, int i_45_, int i_46_) {
		method3415(i, i_43_, i_44_, i_45_, 1);
	}

	public final void method3080(int i, int i_47_, int i_48_, int i_49_, int i_50_) {
		method3087(i, i_47_, i_48_, i_49_, 1);
	}

	public abstract Class142 method3081(int i, int i_51_, int[][] is, int[][] is_52_, int i_53_, int i_54_, int i_55_);

	public abstract Class142 method3082(int i, int i_56_, int[][] is, int[][] is_57_, int i_58_, int i_59_, int i_60_);

	public abstract void method3083(int i, int i_61_, int i_62_, int i_63_, int i_64_, int i_65_);

	public abstract boolean method3084();

	public final void method3085(int i, int i_66_, int i_67_, int i_68_, int i_69_) {
		method3083(i, i_66_, i_67_, i_68_, i_69_, 1);
	}

	public void method3086() {
		/* empty */
	}

	abstract void method3087(int i, int i_70_, int i_71_, int i_72_, int i_73_);

	public abstract void method3088(int i, int i_74_, int i_75_);

	public abstract void method3089(int i, int i_76_, int i_77_, int i_78_, int i_79_, int i_80_);

	public abstract void method3090(int i, int i_81_, int i_82_, int i_83_, int i_84_, int i_85_, Class145 class145, int i_86_, int i_87_);

	public abstract Class148 method3091(Class175 class175, boolean bool);

	public abstract void method3092(int i, int i_88_, int i_89_, int i_90_, int i_91_, int i_92_, Class145 class145, int i_93_, int i_94_, int i_95_, int i_96_, int i_97_);

	public abstract Class164 method3093(Class10 class10, Class175[] class175s, boolean bool);

	public abstract int method3094(int i, int i_98_, int i_99_, int i_100_, int i_101_, int i_102_);

	public boolean method3095(int i, int i_103_, Class435 class435, Class430 class430, int i_104_) {
		return method3419(i, i_103_, 0, 0, class435, class430);
	}

	public abstract void method3096(Class435 class435, Class180 class180, Class430 class430);

	public abstract boolean method3097();

	public Class523_Sub20 method3098(int i, int i_105_, int i_106_, int i_107_, int i_108_, float f) {
		return new Class523_Sub20(i, i_105_, i_106_, i_107_, i_108_, f);
	}

	public abstract void method3099(Class523_Sub8 class523_sub8);

	public abstract boolean method3100();

	public abstract void method3101();

	public abstract Class148 method3102(int[] is, int i, int i_109_, int i_110_, int i_111_, boolean bool);

	public Class148 method3103(int[] is, int i, int i_112_, int i_113_, int i_114_, int i_115_) {
		return method3102(is, i, i_112_, i_113_, i_114_, true);
	}

	public abstract Class148 method3104(Class175 class175, boolean bool);

	void method3105() {
		method3024(-61131612);
	}

	public abstract boolean method3106();

	public abstract void method3107(int i, int i_116_, int i_117_, int i_118_, int i_119_, int i_120_, int i_121_, int i_122_, int i_123_);

	public void method3108() {
		/* empty */
	}

	public abstract Class145 method3109(int i, int i_124_, int[] is, int[] is_125_);

	public abstract void method3110(int i, Class145 class145, int i_126_, int i_127_);

	public abstract Class164 method3111(Class10 class10, Class175[] class175s, boolean bool);

	public abstract Class441 method3112();

	public abstract Class435 method3113();

	public abstract void method3114(int i);

	public abstract Class167 method3115(Class179 class179, int i, int i_128_, int i_129_, int i_130_);

	public Class148 method3116(int i, int i_131_, boolean bool, int i_132_) {
		return method3136(i, i_131_, bool, false);
	}

	public abstract int method3117(int i, int i_133_);

	public abstract void method3118();

	abstract void method3119(int i, int i_134_, int i_135_, int i_136_, int i_137_);

	public abstract void method3120(Class171 class171);

	public abstract void method3121(int i, float f, float f_138_, float f_139_, float f_140_, float f_141_);

	public abstract Class435 method3122();

	abstract boolean method3123(int i, int i_142_, int i_143_, int i_144_, Class435 class435, Class430 class430);

	public abstract void method3124(Class441 class441);

	public abstract Class441 method3125();

	public abstract void method3126(float f);

	public abstract boolean method3127();

	public abstract void method3128(int i);

	public abstract void method3129(int i, int i_145_, int i_146_, int i_147_, int i_148_, int i_149_);

	public abstract void method3130(int i, int i_150_, int[] is, int[] is_151_);

	public Class523_Sub20 method3131(int i, int i_152_, int i_153_, int i_154_, int i_155_, float f) {
		return new Class523_Sub20(i, i_152_, i_153_, i_154_, i_155_, f);
	}

	public abstract void method3132(int i, Class523_Sub20[] class523_sub20s);

	public abstract Class185 method3133(int i);

	public abstract Class185 method3134(Class185 class185, Class185 class185_156_, float f, Class185 class185_157_);

	public abstract void method3135(Class185 class185);

	public abstract Class148 method3136(int i, int i_158_, boolean bool, boolean bool_159_);

	public abstract void method3137(int i, int i_160_);

	public abstract boolean method3138();

	public abstract boolean method3139();

	abstract void method3140(int i, int i_161_, int i_162_, int i_163_, int i_164_);

	public abstract Class165 method3141(int[] is);

	public abstract void method3142();

	public abstract void method3143(int i, int i_165_, int i_166_);

	public abstract boolean method3144();

	public abstract void method3145();

	public abstract boolean method3146();

	public void method3147(float f, float f_167_, float f_168_, byte i) {
		method3018(f, f_167_, f_168_, 0.0F, 1.0F, 1.0F);
	}

	public abstract void method3148(Class165 class165, float f, Class165 class165_169_, float f_170_, Class165 class165_171_, float f_172_);

	public abstract void method3149(int i, Class163 class163);

	public abstract void method3150(int i, Class163 class163);

	public abstract void method3151(int i, int i_173_, int i_174_, int i_175_);

	public abstract void method3152(float f, float f_176_, float f_177_, float[] fs);

	public abstract void method3153(float f, float f_178_, float f_179_, float[] fs);

	public int[] method3154(int i, int i_180_, int i_181_, int i_182_, int[] is, int i_183_, int i_184_, int i_185_) {
		int[] is_186_ = new int[i_181_ * i_182_];
		if (0 == i_184_)
			i_184_ = i;
		for (int i_187_ = 0; i_187_ < i_182_; i_187_++) {
			if (i_187_ < i_180_) {
				int i_188_ = i_184_ * i_187_ + i_183_;
				for (int i_189_ = 0; i_189_ < i; i_189_++)
					is_186_[i_181_ * i_187_ + i_189_] = is[i_189_ + i_188_];
				int i_190_ = is[i_188_ + (i - 1)];
				for (int i_191_ = i; i_191_ < i_181_; i_191_++)
					is_186_[i_181_ * i_187_ + i_191_] = i_190_;
			} else {
				int i_192_ = i_181_ * (i_180_ - 1);
				for (int i_193_ = 0; i_193_ < i_181_; i_193_++)
					is_186_[i_187_ * i_181_ + i_193_] = is_186_[i_193_ + i_192_];
			}
		}
		return is_186_;
	}

	public float[] method3155(int i, int i_194_, int i_195_, int i_196_, float[] fs, int i_197_, int i_198_, int i_199_, int i_200_) {
		float[] fs_201_ = new float[i_195_ * i_196_ * i_199_];
		if (i_198_ == 0)
			i_198_ = i_199_ * i;
		for (int i_202_ = 0; i_202_ < i_196_; i_202_++) {
			if (i_202_ < i_194_) {
				int i_203_ = i_202_ * i_198_ + i_197_;
				for (int i_204_ = 0; i_204_ < i; i_204_++) {
					for (int i_205_ = 0; i_205_ < i_199_; i_205_++)
						fs_201_[i_205_ + (i_204_ * i_199_ + i_199_ * (i_195_ * i_202_))] = fs[i_205_ + (i_203_ + i_199_ * i_204_)];
				}
				float[] fs_206_ = new float[i_199_];
				for (int i_207_ = 0; i_207_ < i_199_; i_207_++)
					fs_206_[i_207_] = fs[i_203_ + (i - 1) * i_199_ + i_207_];
				for (int i_208_ = i; i_208_ < i_195_; i_208_++) {
					for (int i_209_ = 0; i_209_ < i_199_; i_209_++)
						fs_201_[(i_202_ * i_195_ * i_199_ + i_199_ * i_208_ + i_209_)] = fs_206_[i_209_];
				}
			} else {
				int i_210_ = (i_194_ - 1) * i_195_ * i_199_;
				for (int i_211_ = 0; i_211_ < i_195_; i_211_++) {
					for (int i_212_ = 0; i_212_ < i_199_; i_212_++)
						fs_201_[i_212_ + (i_211_ * i_199_ + i_199_ * (i_202_ * i_195_))] = fs_201_[i_211_ * i_199_ + i_210_ + i_212_];
				}
			}
		}
		return fs_201_;
	}

	public byte[] method3156(int i, int i_213_, int i_214_, int i_215_, byte[] is, int i_216_, int i_217_, int i_218_, byte i_219_) {
		byte[] is_220_ = new byte[i_218_ * (i_214_ * i_215_)];
		if (i_217_ == 0)
			i_217_ = i * i_218_;
		for (int i_221_ = 0; i_221_ < i_215_; i_221_++) {
			if (i_221_ < i_213_) {
				int i_222_ = i_216_ + i_217_ * i_221_;
				for (int i_223_ = 0; i_223_ < i; i_223_++) {
					for (int i_224_ = 0; i_224_ < i_218_; i_224_++)
						is_220_[i_224_ + (i_214_ * i_221_ * i_218_ + i_218_ * i_223_)] = is[i_224_ + (i_222_ + i_223_ * i_218_)];
				}
				byte[] is_225_ = new byte[i_218_];
				for (int i_226_ = 0; i_226_ < i_218_; i_226_++)
					is_225_[i_226_] = is[i_218_ * (i - 1) + i_222_ + i_226_];
				for (int i_227_ = i; i_227_ < i_214_; i_227_++) {
					for (int i_228_ = 0; i_228_ < i_218_; i_228_++)
						is_220_[i_228_ + (i_214_ * i_221_ * i_218_ + i_218_ * i_227_)] = is_225_[i_228_];
				}
			} else {
				int i_229_ = i_214_ * (i_213_ - 1) * i_218_;
				for (int i_230_ = 0; i_230_ < i_214_; i_230_++) {
					for (int i_231_ = 0; i_231_ < i_218_; i_231_++)
						is_220_[(i_218_ * i_230_ + i_221_ * i_214_ * i_218_ + i_231_)] = is_220_[i_231_ + (i_229_ + i_230_ * i_218_)];
				}
			}
		}
		return is_220_;
	}

	public abstract void method3157(boolean bool);

	abstract void method3158(int i, int i_232_) throws Exception_Sub4;

	abstract void method3159(int i, int i_233_) throws Exception_Sub4;

	static synchronized Class178 method3160(int i, Canvas canvas, Class172 class172, Interface25 interface25, Interface46 interface46, Interface48 interface48, Interface45 interface45, Class472 class472, int i_234_, int i_235_, int i_236_) {
		if (i == 0)
			return Class688_Sub4_Sub1.method18187(canvas, class172, interface25, interface46, interface48, interface45, i_235_, i_236_, 333236058);
		if (1 == i)
			return Class152.method2525(canvas, class172, interface25, interface46, interface48, interface45, i_234_);
		if (i == 5)
			return Class476.method7769(canvas, class172, interface25, interface46, interface48, interface45, class472, i_234_);
		if (3 == i)
			return Class414.method6652(canvas, class172, interface25, interface46, interface48, interface45, class472, i_234_);
		throw new IllegalArgumentException("");
	}

	void method3161(int i, int i_237_, int i_238_) {
		anInt1942 = i * 2142763045;
		anInt1943 = i_237_ * -2086799823;
		float f = ((float) aClass168_1938.method2875() / (float) aClass168_1938.method2874());
		float f_239_ = ((float) (799761325 * anInt1942) / (float) (-2022726959 * anInt1943));
		if (f < f_239_) {
			anInt1946 = 829324925 * (int) (f * (float) (anInt1943 * -2022726959));
			anInt1915 = -1221307753 * anInt1943;
		} else {
			anInt1946 = -1827352199 * anInt1942;
			anInt1915 = (int) ((float) (anInt1942 * 799761325) / f) * 1140582631;
		}
		aFloat1948 = ((float) (anInt1946 * -750425387) / (float) aClass168_1938.method2875());
		anInt1945 = -1010835619 * ((799761325 * anInt1942 - anInt1946 * -750425387) / 2);
		anInt1937 = 613760699 * ((-2022726959 * anInt1943 - -733304105 * anInt1915) / 2);
	}

	public abstract void method3162(int i, int i_240_, int i_241_, int i_242_, int i_243_, int i_244_, Class145 class145, int i_245_, int i_246_, int i_247_, int i_248_, int i_249_);

	public abstract void method3163(int i);

	public abstract void method3164(int i);

	public abstract void method3165(int i);

	public abstract Class167 method3166(Class179 class179, int i, int i_250_, int i_251_, int i_252_);

	public abstract int method3167();

	public abstract int method3168();

	public abstract int method3169();

	public abstract boolean method3170();

	public abstract boolean method3171();

	public abstract boolean method3172();

	public abstract boolean method3173();

	public abstract boolean method3174();

	public abstract void method3175();

	public abstract void method3176(boolean bool);

	public abstract boolean method3177();

	public abstract boolean method3178();

	public abstract boolean method3179();

	public abstract boolean method3180();

	public abstract boolean method3181();

	public abstract String method3182();

	public abstract int method3183(int i, int i_253_);

	public abstract String method3184();

	public abstract void method3185();

	public void method3186() {
		/* empty */
	}

	public abstract int method3187();

	public abstract void method3188(boolean bool);

	public abstract void method3189(boolean bool);

	abstract void method3190(int i, int i_254_, int i_255_, int i_256_, int i_257_);

	public abstract void method3191(boolean bool);

	public abstract void method3192(float f, float f_258_);

	public abstract void method3193(int i, int i_259_, int i_260_, int i_261_, int i_262_, int i_263_);

	public abstract void method3194();

	public abstract void method3195();

	public void method3196(int[] is) {
		if (null != aClass168_Sub2_1939) {
			is[0] = aClass168_Sub2_1939.method2875();
			is[1] = aClass168_Sub2_1939.method2874();
		} else {
			int[] is_264_ = is;
			is[1] = 0;
			is_264_[0] = 0;
		}
	}

	public void method3197(int[] is) {
		if (null != aClass168_Sub2_1939) {
			is[0] = aClass168_Sub2_1939.method2875();
			is[1] = aClass168_Sub2_1939.method2874();
		} else {
			int[] is_265_ = is;
			is[1] = 0;
			is_265_[0] = 0;
		}
	}

	public abstract boolean method3198();

	public void method3199(int[] is) {
		if (null != aClass168_Sub2_1939) {
			is[0] = aClass168_Sub2_1939.method2875();
			is[1] = aClass168_Sub2_1939.method2874();
		} else {
			int[] is_266_ = is;
			is[1] = 0;
			is_266_[0] = 0;
		}
	}

	public void method3200(int[] is) {
		if (null != aClass168_Sub2_1939) {
			is[0] = aClass168_Sub2_1939.method2875();
			is[1] = aClass168_Sub2_1939.method2874();
		} else {
			int[] is_267_ = is;
			is[1] = 0;
			is_267_[0] = 0;
		}
	}

	public abstract Class435 method3201();

	public abstract boolean method3202();

	public void method3203(int[] is) {
		if (null != aClass168_Sub2_1939) {
			is[0] = aClass168_Sub2_1939.method2875();
			is[1] = aClass168_Sub2_1939.method2874();
		} else {
			int[] is_268_ = is;
			is[1] = 0;
			is_268_[0] = 0;
		}
	}

	public static Class178 method3204(int i, Canvas canvas, Class172 class172, Interface25 interface25, Interface46 interface46, Interface48 interface48, Interface45 interface45, Class472 class472, int i_269_) {
		int i_270_ = 0;
		int i_271_ = 0;
		if (null != canvas) {
			Dimension dimension = canvas.getSize();
			i_270_ = dimension.width;
			i_271_ = dimension.height;
		}
		return method3451(i, canvas, class172, interface25, interface46, interface48, interface45, class472, i_269_, i_270_, i_271_, -1611048976);
	}

	public abstract boolean method3205();

	public void method3206() {
		/* empty */
	}

	public abstract boolean method3207();

	public abstract void method3208(int i, int i_272_, int i_273_, int i_274_);

	abstract void method3209(int i, int i_275_, int i_276_, int i_277_, int i_278_);

	public abstract void method3210(int i, int i_279_, int i_280_, int i_281_);

	public abstract void method3211(int i, int i_282_, int i_283_);

	public abstract void method3212(float f, float f_284_, float f_285_, float[] fs);

	public abstract boolean method3213();

	public abstract boolean method3214();

	public abstract long method3215(int i, int i_286_);

	public abstract void method3216(long l);

	public abstract void method3217(int i, int i_287_, int[] is, int[] is_288_);

	public abstract void method3218();

	public abstract void method3219();

	public abstract void method3220(boolean bool);

	abstract void method3221(int i, int i_289_) throws Exception_Sub4;

	public abstract void method3222(int i, int i_290_, int i_291_, int i_292_);

	public abstract void method3223(int i, int i_293_, int i_294_, int i_295_);

	public abstract void method3224(int[] is);

	public abstract void method3225(int[] is);

	public abstract void method3226(float f);

	public abstract void method3227(int i, int i_296_, int i_297_, int i_298_);

	public abstract void method3228(int i, int i_299_, int i_300_, int i_301_);

	abstract boolean method3229(int i, int i_302_, int i_303_, int i_304_, Class435 class435, Class430 class430);

	public abstract void method3230(int i, int i_305_, int i_306_, int i_307_);

	public abstract void method3231(int[] is);

	public abstract void method3232(int i, int i_308_, int i_309_);

	public abstract Interface23 method3233(int i, int i_310_);

	public abstract String method3234();

	public final void method3235(Canvas canvas, int i, int i_311_) {
		if (!aHashtable1924.containsKey(canvas)) {
			Class194_Sub14.method15513(canvas, (byte) -21);
			method3042(canvas, method3048(canvas, i, i_311_), 194628470);
		}
	}

	public abstract void method3236(int[] is);

	public int[] method3237(int i, int i_312_, int i_313_, int i_314_, int[] is, int i_315_, int i_316_) {
		int[] is_317_ = new int[i_313_ * i_314_];
		if (0 == i_316_)
			i_316_ = i;
		for (int i_318_ = 0; i_318_ < i_314_; i_318_++) {
			if (i_318_ < i_312_) {
				int i_319_ = i_316_ * i_318_ + i_315_;
				for (int i_320_ = 0; i_320_ < i; i_320_++)
					is_317_[i_313_ * i_318_ + i_320_] = is[i_320_ + i_319_];
				int i_321_ = is[i_319_ + (i - 1)];
				for (int i_322_ = i; i_322_ < i_313_; i_322_++)
					is_317_[i_313_ * i_318_ + i_322_] = i_321_;
			} else {
				int i_323_ = i_313_ * (i_312_ - 1);
				for (int i_324_ = 0; i_324_ < i_313_; i_324_++)
					is_317_[i_318_ * i_313_ + i_324_] = is_317_[i_324_ + i_323_];
			}
		}
		return is_317_;
	}

	public abstract void method3238(int i, int i_325_, int i_326_, int i_327_, int i_328_, int i_329_);

	public abstract void method3239(int i, int i_330_, int i_331_, int i_332_, int i_333_, int i_334_);

	public boolean method3240() {
		return true;
	}

	abstract void method3241(int i, int i_335_, int i_336_, int i_337_, int i_338_);

	abstract void method3242(int i, int i_339_, int i_340_, int i_341_, int i_342_);

	abstract Class168_Sub2 method3243(Canvas canvas, int i, int i_343_);

	public abstract boolean method3244();

	public abstract void method3245(int i, int i_344_, int i_345_, int i_346_, int i_347_, int i_348_, int i_349_, int i_350_, int i_351_);

	public abstract Class167 method3246(Class179 class179, int i, int i_352_, int i_353_, int i_354_);

	public abstract void method3247(Class435 class435);

	public abstract Class168_Sub1 method3248();

	public abstract void method3249(int i, int i_355_, int i_356_, int i_357_, int i_358_, int i_359_, Class145 class145, int i_360_, int i_361_);

	public abstract void method3250(int i, Class163 class163);

	public abstract void method3251(boolean bool);

	public abstract boolean method3252();

	public abstract boolean method3253();

	public abstract void method3254(Class435 class435, Class180 class180, Class430 class430);

	public abstract void method3255(Class435 class435, Class180 class180, Class430 class430);

	public abstract void method3256(int i, Class163 class163);

	public abstract Class523_Sub8 method3257(int i);

	public abstract Class523_Sub8 method3258(int i);

	public abstract Class523_Sub8 method3259(int i);

	public final void method3260(Canvas canvas, int i) {
		if (aHashtable1924.containsKey(canvas)) {
			Class168_Sub2 class168_sub2 = (Class168_Sub2) aHashtable1924.get(canvas);
			class168_sub2.method131();
			aHashtable1924.remove(canvas);
		}
	}

	public abstract Class148 method3261(int i, int i_362_, boolean bool, boolean bool_363_);

	public abstract boolean method3262();

	public abstract Class148 method3263(int[] is, int i, int i_364_, int i_365_, int i_366_, boolean bool);

	public abstract Class148 method3264(int[] is, int i, int i_367_, int i_368_, int i_369_, boolean bool);

	public abstract Class148 method3265(Class175 class175, boolean bool);

	public abstract void method3266(int i, int i_370_, int i_371_, int i_372_);

	public abstract int method3267();

	public abstract Class145 method3268(int i, int i_373_, int[] is, int[] is_374_);

	public abstract void method3269(int i, Class145 class145, int i_375_, int i_376_);

	public abstract void method3270(int i, Class145 class145, int i_377_, int i_378_);

	public abstract void method3271(int i, Class145 class145, int i_379_, int i_380_);

	public abstract void method3272(int i, int i_381_, int i_382_, int i_383_, int i_384_, int i_385_);

	public abstract void method3273(int i);

	public abstract void method3274(int i);

	public abstract void method3275(int i);

	public abstract void method3276(int i);

	public abstract void method3277(int i, int i_386_, int i_387_, int i_388_, int i_389_, int i_390_, int i_391_);

	public abstract Class148 method3278(int i, int i_392_, boolean bool, boolean bool_393_);

	public abstract int method3279(int i, int i_394_);

	public abstract Class148 method3280(int i, int i_395_, int i_396_, int i_397_, boolean bool);

	public abstract int method3281(int i, int i_398_);

	public abstract int method3282(int i, int i_399_);

	public abstract void method3283();

	public abstract void method3284(int i, int i_400_, int i_401_, int i_402_, int i_403_, int i_404_);

	public abstract void method3285(int[] is);

	public abstract void method3286(int i);

	public abstract void method3287(boolean bool);

	public abstract Class441 method3288();

	public abstract Class441 method3289();

	final void method3290(Canvas canvas, Class168_Sub2 class168_sub2) {
		if (class168_sub2 == null)
			throw new RuntimeException("");
		aHashtable1924.put(canvas, class168_sub2);
	}

	public abstract Class435 method3291();

	public abstract int method3292();

	public abstract int[] method3293(int i, int i_405_, int i_406_, int i_407_);

	public abstract int method3294();

	public abstract void method3295(int i, Class523_Sub20[] class523_sub20s);

	public abstract void method3296(int i, Class523_Sub20[] class523_sub20s);

	public abstract void method3297(Class435 class435);

	public void method3298() {
		aBoolArray1921[anInt1922 * -1144788131] = false;
		Enumeration enumeration = aHashtable1924.keys();
		while (enumeration.hasMoreElements()) {
			Canvas canvas = (Canvas) enumeration.nextElement();
			Class168_Sub2 class168_sub2 = (Class168_Sub2) aHashtable1924.get(canvas);
			class168_sub2.method131();
		}
		method3023();
	}

	public static void method3299(Canvas canvas) {
		try {
			Class var_class = Class.forName("java.awt.Canvas");
			Method method = var_class.getMethod("setIgnoreRepaint", new Class[] { Boolean.TYPE });
			method.invoke(canvas, new Object[] { Boolean.TRUE });
		} catch (Exception exception) {
			/* empty */
		}
	}

	public abstract void method3300(Class435 class435);

	public abstract Class435 method3301();

	public abstract Class435 method3302();

	public abstract void method3303(int i, int i_408_, int i_409_, int i_410_, int i_411_, int i_412_, Class145 class145, int i_413_, int i_414_);

	public abstract void method3304(Class441 class441);

	public abstract Class185 method3305(Class185 class185, Class185 class185_415_, float f, Class185 class185_416_);

	public void method3306(boolean bool) {
		/* empty */
	}

	public abstract Class441 method3307();

	public abstract Class441 method3308();

	public abstract boolean method3309();

	public abstract void method3310(float f);

	public float[] method3311(int i, int i_417_, int i_418_, int i_419_, float[] fs, int i_420_, int i_421_, int i_422_) {
		float[] fs_423_ = new float[i_418_ * i_419_ * i_422_];
		if (i_421_ == 0)
			i_421_ = i_422_ * i;
		for (int i_424_ = 0; i_424_ < i_419_; i_424_++) {
			if (i_424_ < i_417_) {
				int i_425_ = i_424_ * i_421_ + i_420_;
				for (int i_426_ = 0; i_426_ < i; i_426_++) {
					for (int i_427_ = 0; i_427_ < i_422_; i_427_++)
						fs_423_[i_427_ + (i_426_ * i_422_ + i_422_ * (i_418_ * i_424_))] = fs[i_427_ + (i_425_ + i_422_ * i_426_)];
				}
				float[] fs_428_ = new float[i_422_];
				for (int i_429_ = 0; i_429_ < i_422_; i_429_++)
					fs_428_[i_429_] = fs[i_425_ + (i - 1) * i_422_ + i_429_];
				for (int i_430_ = i; i_430_ < i_418_; i_430_++) {
					for (int i_431_ = 0; i_431_ < i_422_; i_431_++)
						fs_423_[(i_424_ * i_418_ * i_422_ + i_422_ * i_430_ + i_431_)] = fs_428_[i_431_];
				}
			} else {
				int i_432_ = (i_417_ - 1) * i_418_ * i_422_;
				for (int i_433_ = 0; i_433_ < i_418_; i_433_++) {
					for (int i_434_ = 0; i_434_ < i_422_; i_434_++)
						fs_423_[i_434_ + (i_433_ * i_422_ + i_422_ * (i_424_ * i_418_))] = fs_423_[i_433_ * i_422_ + i_432_ + i_434_];
				}
			}
		}
		return fs_423_;
	}

	public abstract Class142 method3312(int i, int i_435_, int[][] is, int[][] is_436_, int i_437_, int i_438_, int i_439_);

	public abstract void method3313(int i, float f, float f_440_, float f_441_, float f_442_, float f_443_);

	static synchronized Class178 method3314(int i, Canvas canvas, Class172 class172, Interface25 interface25, Interface46 interface46, Interface48 interface48, Interface45 interface45, Class472 class472, int i_444_, int i_445_, int i_446_) {
		if (i == 0)
			return Class688_Sub4_Sub1.method18187(canvas, class172, interface25, interface46, interface48, interface45, i_445_, i_446_, 61557650);
		if (1 == i)
			return Class152.method2525(canvas, class172, interface25, interface46, interface48, interface45, i_444_);
		if (i == 5)
			return Class476.method7769(canvas, class172, interface25, interface46, interface48, interface45, class472, i_444_);
		if (3 == i)
			return Class414.method6652(canvas, class172, interface25, interface46, interface48, interface45, class472, i_444_);
		throw new IllegalArgumentException("");
	}

	public abstract void method3315(int i, float f, float f_447_, float f_448_, float f_449_, float f_450_);

	public abstract void method3316(int i, int i_451_, int i_452_);

	public abstract boolean method3317();

	public abstract void method3318(float f, float f_453_, float f_454_, float[] fs);

	public abstract Class185 method3319(Class185 class185, Class185 class185_455_, float f, Class185 class185_456_);

	public abstract int[] method3320();

	public abstract void method3321(Class185 class185);

	public abstract void method3322(int i, int i_457_, int i_458_, int i_459_);

	public abstract void method3323();

	public abstract long method3324(int i, int i_460_);

	public abstract void method3325(int i, int i_461_, int i_462_, int i_463_);

	public abstract void method3326(int i, int i_464_);

	public abstract void method3327(int i, int i_465_);

	final void method3328(Canvas canvas, Class168_Sub2 class168_sub2) {
		if (class168_sub2 == null)
			throw new RuntimeException("");
		aHashtable1924.put(canvas, class168_sub2);
	}

	public abstract boolean method3329();

	public abstract void method3330(int i, int i_466_, float f, int i_467_, int i_468_, float f_469_, int i_470_, int i_471_, float f_472_, int i_473_, int i_474_, int i_475_, int i_476_);

	public abstract boolean method3331();

	public abstract boolean method3332();

	public abstract boolean method3333();

	public abstract void method3334(int i, int i_477_);

	public abstract void method3335(float f, float f_478_);

	public abstract boolean method3336();

	public abstract void method3337(float f, float f_479_, float f_480_, float f_481_, float f_482_);

	public abstract Class148 method3338(int i, int i_483_, boolean bool, boolean bool_484_);

	public abstract Class165 method3339(int[] is);

	public abstract Class165 method3340(int[] is);

	public abstract int[] method3341();

	public final void method3342(int i, int i_485_, int i_486_, int i_487_) {
		method3119(i, i_485_, i_486_, i_487_, 1);
	}

	public abstract boolean method3343();

	public abstract void method3344();

	public abstract boolean method3345();

	public abstract void method3346();

	public abstract void method3347();

	public abstract boolean method3348();

	public abstract void method3349(int i, int i_488_, int i_489_);

	public abstract boolean method3350();

	public abstract boolean method3351();

	public abstract void method3352(int i, Class163 class163);

	public final void method3353(Class168_Sub1 class168_sub1, int i) {
		if (anInt1941 * 828088099 >= 3)
			throw new RuntimeException();
		if (anInt1941 * 828088099 >= 0)
			aClass168_Sub1Array1947[828088099 * anInt1941].method2873();
		else
			aClass168_Sub2_1939.method2873();
		aClass168_1938 = aClass168_Sub1Array1947[(anInt1941 += -724399989) * 828088099] = class168_sub1;
		class168_sub1.method359();
	}

	public final void method3354(int i, int i_490_, int i_491_, int i_492_, int i_493_, byte i_494_) {
		method3193(i, i_490_, i_491_, i_492_, i_493_, 1);
	}

	public abstract void method3355();

	public abstract void method3356(int i, int i_495_, float f, int i_496_, int i_497_, float f_498_, int i_499_, int i_500_, float f_501_, int i_502_, int i_503_, int i_504_, int i_505_);

	public abstract void method3357(int i, int i_506_, float f, int i_507_, int i_508_, float f_509_, int i_510_, int i_511_, float f_512_, int i_513_, int i_514_, int i_515_, int i_516_);

	public abstract void method3358(Class435 class435);

	public abstract void method3359(float f, float f_517_, float f_518_, float[] fs);

	public abstract void method3360(int i, int i_519_, float f, int i_520_, int i_521_, float f_522_, int i_523_, int i_524_, float f_525_, int i_526_, int i_527_, int i_528_, int i_529_);

	public abstract void method3361(float f);

	public abstract void method3362(float f, float f_530_, float f_531_, float[] fs);

	public abstract void method3363(Class185 class185);

	public abstract void method3364(float f, float f_532_, float f_533_, float[] fs);

	public abstract Interface23 method3365(int i, int i_534_, int i_535_);

	public abstract Interface23 method3366(int i, int i_536_, int i_537_);

	public abstract Class142 method3367(int i, int i_538_, int[][] is, int[][] is_539_, int i_540_, int i_541_, int i_542_);

	public abstract Class150 method3368();

	public abstract Class150 method3369();

	public abstract Class150 method3370();

	public abstract boolean method3371();

	public abstract Class150 method3372();

	public abstract void method3373(int i, float f, float f_543_, float f_544_, float f_545_, float f_546_);

	public abstract boolean method3374();

	public abstract boolean method3375();

	public abstract Class148 method3376(int i, int i_547_, int i_548_, int i_549_, boolean bool);

	public abstract boolean method3377();

	public abstract void method3378(int i, int i_550_, int i_551_, int i_552_);

	public abstract void method3379(int i, int i_553_);

	public final Class168_Sub2 method3380(int i) {
		return aClass168_Sub2_1939;
	}

	public final void method3381(int i, int i_554_, int i_555_, int i_556_, int i_557_, int i_558_) {
		method3089(i, i_554_, i_555_, i_556_, i_557_, 1);
	}

	abstract void method3382(int i, int i_559_, int i_560_, int i_561_, int i_562_);

	public abstract void method3383(Class185 class185);

	public abstract void method3384(int i, int i_563_, int i_564_, int i_565_, int i_566_, int i_567_);

	public abstract Class523_Sub8 method3385(int i);

	public abstract void method3386(int i, int i_568_, int i_569_, int i_570_, int i_571_, int i_572_);

	public final void method3387(int i, int i_573_, int i_574_, int i_575_, int i_576_) {
		method3119(i, i_573_, i_574_, i_575_, 1);
	}

	public abstract int method3388(int i, int i_577_, int i_578_, int i_579_, int i_580_, int i_581_);

	public abstract int method3389(int i, int i_582_, int i_583_, int i_584_, int i_585_, int i_586_);

	public abstract void method3390(Class523_Sub8 class523_sub8);

	public abstract void method3391(Class171 class171);

	public abstract void method3392();

	public final void method3393(Canvas canvas) {
		if (aHashtable1924.containsKey(canvas)) {
			Class168_Sub2 class168_sub2 = (Class168_Sub2) aHashtable1924.get(canvas);
			class168_sub2.method131();
			aHashtable1924.remove(canvas);
		}
	}

	public boolean method3394(int i) {
		return true;
	}

	public abstract Class185 method3395(int i);

	public abstract Class185 method3396(int i);

	public abstract void method3397(Class165 class165, float f, Class165 class165_587_, float f_588_, Class165 class165_589_, float f_590_);

	public abstract void method3398(float f, float f_591_, float f_592_, float f_593_, float f_594_);

	public abstract Class168_Sub1 method3399();

	public abstract void method3400(float f, float f_595_, float f_596_, float f_597_, float f_598_);

	public abstract Class150 method3401();

	public abstract Interface23 method3402(int i, int i_599_);

	public abstract Interface23 method3403(int i, int i_600_);

	public static Class178 method3404(int i, Canvas canvas, Class172 class172, Interface25 interface25, Interface46 interface46, Interface48 interface48, Interface45 interface45, Class472 class472, int i_601_) {
		int i_602_ = 0;
		int i_603_ = 0;
		if (null != canvas) {
			Dimension dimension = canvas.getSize();
			i_602_ = dimension.width;
			i_603_ = dimension.height;
		}
		return method3451(i, canvas, class172, interface25, interface46, interface48, interface45, class472, i_601_, i_602_, i_603_, 1662512371);
	}

	public static Class178 method3405(int i, Canvas canvas, Class172 class172, Interface25 interface25, Interface46 interface46, Interface48 interface48, Interface45 interface45, Class472 class472, int i_604_) {
		int i_605_ = 0;
		int i_606_ = 0;
		if (null != canvas) {
			Dimension dimension = canvas.getSize();
			i_605_ = dimension.width;
			i_606_ = dimension.height;
		}
		return method3451(i, canvas, class172, interface25, interface46, interface48, interface45, class472, i_604_, i_605_, i_606_, 1484128147);
	}

	public abstract void method3406(int i);

	public abstract int method3407();

	public abstract void method3408(int i, int i_607_, int i_608_, int i_609_, int i_610_, int i_611_);

	static synchronized Class178 method3409(int i, Canvas canvas, Class172 class172, Interface25 interface25, Interface46 interface46, Interface48 interface48, Interface45 interface45, Class472 class472, int i_612_, int i_613_, int i_614_) {
		if (i == 0)
			return Class688_Sub4_Sub1.method18187(canvas, class172, interface25, interface46, interface48, interface45, i_613_, i_614_, 882657557);
		if (1 == i)
			return Class152.method2525(canvas, class172, interface25, interface46, interface48, interface45, i_612_);
		if (i == 5)
			return Class476.method7769(canvas, class172, interface25, interface46, interface48, interface45, class472, i_612_);
		if (3 == i)
			return Class414.method6652(canvas, class172, interface25, interface46, interface48, interface45, class472, i_612_);
		throw new IllegalArgumentException("");
	}

	public Class148 method3410(int[] is, int i, int i_615_, int i_616_, int i_617_) {
		return method3102(is, i, i_615_, i_616_, i_617_, true);
	}

	public final void method3411(Canvas canvas) {
		if (aHashtable1924.containsKey(canvas)) {
			Class168_Sub2 class168_sub2 = (Class168_Sub2) aHashtable1924.get(canvas);
			class168_sub2.method131();
			aHashtable1924.remove(canvas);
		}
	}

	public static boolean method3412(int i) {
		return i == 1 || 3 == i || 5 == i;
	}

	public static boolean method3413(int i) {
		return i == 0 || i == 2;
	}

	public static boolean method3414(int i) {
		return i == 0 || i == 2;
	}

	abstract void method3415(int i, int i_618_, int i_619_, int i_620_, int i_621_);

	public void method3416() {
		aBoolArray1921[anInt1922 * -1144788131] = false;
		Enumeration enumeration = aHashtable1924.keys();
		while (enumeration.hasMoreElements()) {
			Canvas canvas = (Canvas) enumeration.nextElement();
			Class168_Sub2 class168_sub2 = (Class168_Sub2) aHashtable1924.get(canvas);
			class168_sub2.method131();
		}
		method3023();
	}

	public void method3417() {
		aBoolArray1921[anInt1922 * -1144788131] = false;
		Enumeration enumeration = aHashtable1924.keys();
		while (enumeration.hasMoreElements()) {
			Canvas canvas = (Canvas) enumeration.nextElement();
			Class168_Sub2 class168_sub2 = (Class168_Sub2) aHashtable1924.get(canvas);
			class168_sub2.method131();
		}
		method3023();
	}

	public abstract int[] method3418();

	abstract boolean method3419(int i, int i_622_, int i_623_, int i_624_, Class435 class435, Class430 class430);

	public abstract boolean method3420();

	public abstract boolean method3421();

	public final Class168 method3422() {
		return aClass168_1938;
	}

	public final Class168 method3423() {
		return aClass168_1938;
	}

	abstract void method3424(float f, float f_625_, float f_626_, float f_627_, float f_628_, float f_629_);

	public final Class168_Sub2 method3425() {
		return aClass168_Sub2_1939;
	}

	public abstract void method3426(int i, int i_630_, int i_631_, int i_632_, int i_633_, int i_634_, Class145 class145, int i_635_, int i_636_);

	public abstract void method3427(int i, int i_637_, int i_638_, int i_639_, int i_640_, int i_641_, int i_642_, int i_643_, int i_644_);

	public abstract void method3428(int i);

	final void method3429(Canvas canvas, Class168_Sub2 class168_sub2) {
		if (class168_sub2 == null)
			throw new RuntimeException("");
		aHashtable1924.put(canvas, class168_sub2);
	}

	public final void method3430(Canvas canvas) {
		if (aHashtable1924.containsKey(canvas)) {
			Class168_Sub2 class168_sub2 = (Class168_Sub2) aHashtable1924.get(canvas);
			class168_sub2.method131();
			aHashtable1924.remove(canvas);
		}
	}

	public final Class168_Sub2 method3431() {
		return aClass168_Sub2_1939;
	}

	static synchronized Class178 method3432(int i, Canvas canvas, Class172 class172, Interface25 interface25, Interface46 interface46, Interface48 interface48, Interface45 interface45, Class472 class472, int i_645_, int i_646_, int i_647_) {
		if (i == 0)
			return Class688_Sub4_Sub1.method18187(canvas, class172, interface25, interface46, interface48, interface45, i_646_, i_647_, 11596561);
		if (1 == i)
			return Class152.method2525(canvas, class172, interface25, interface46, interface48, interface45, i_645_);
		if (i == 5)
			return Class476.method7769(canvas, class172, interface25, interface46, interface48, interface45, class472, i_645_);
		if (3 == i)
			return Class414.method6652(canvas, class172, interface25, interface46, interface48, interface45, class472, i_645_);
		throw new IllegalArgumentException("");
	}

	public final void method3433(Canvas canvas) {
		if (aHashtable1924.containsKey(canvas)) {
			Class168_Sub2 class168_sub2 = (Class168_Sub2) aHashtable1924.get(canvas);
			class168_sub2.method131();
			aHashtable1924.remove(canvas);
		}
	}

	public final void method3434(Canvas canvas, int i, int i_648_) {
		Class168_Sub2 class168_sub2 = (Class168_Sub2) aHashtable1924.get(canvas);
		if (class168_sub2 == null)
			throw new RuntimeException("");
		class168_sub2.method15402(i, i_648_);
	}

	public final void method3435(Class168_Sub1 class168_sub1) {
		if (anInt1941 * 828088099 >= 3)
			throw new RuntimeException();
		if (anInt1941 * 828088099 >= 0)
			aClass168_Sub1Array1947[828088099 * anInt1941].method2873();
		else
			aClass168_Sub2_1939.method2873();
		aClass168_1938 = aClass168_Sub1Array1947[(anInt1941 += -724399989) * 828088099] = class168_sub1;
		class168_sub1.method359();
	}

	public final void method3436(Class168_Sub1 class168_sub1) {
		if (anInt1941 * 828088099 >= 3)
			throw new RuntimeException();
		if (anInt1941 * 828088099 >= 0)
			aClass168_Sub1Array1947[828088099 * anInt1941].method2873();
		else
			aClass168_Sub2_1939.method2873();
		aClass168_1938 = aClass168_Sub1Array1947[(anInt1941 += -724399989) * 828088099] = class168_sub1;
		class168_sub1.method359();
	}

	public final void method3437(Class168_Sub1 class168_sub1) {
		if (anInt1941 * 828088099 >= 3)
			throw new RuntimeException();
		if (anInt1941 * 828088099 >= 0)
			aClass168_Sub1Array1947[828088099 * anInt1941].method2873();
		else
			aClass168_Sub2_1939.method2873();
		aClass168_1938 = aClass168_Sub1Array1947[(anInt1941 += -724399989) * 828088099] = class168_sub1;
		class168_sub1.method359();
	}

	public final void method3438(Class168_Sub1 class168_sub1) {
		if (anInt1941 * 828088099 < 0 || aClass168_Sub1Array1947[anInt1941 * 828088099] != class168_sub1)
			throw new RuntimeException();
		aClass168_Sub1Array1947[(anInt1941 -= -724399989) * 828088099 + 1] = null;
		class168_sub1.method2873();
		if (anInt1941 * 828088099 >= 0) {
			aClass168_1938 = aClass168_Sub1Array1947[anInt1941 * 828088099];
			aClass168_Sub1Array1947[828088099 * anInt1941].method359();
		} else {
			aClass168_1938 = aClass168_Sub2_1939;
			aClass168_Sub2_1939.method359();
		}
	}

	public final void method3439(Class168_Sub1 class168_sub1) {
		if (anInt1941 * 828088099 < 0 || aClass168_Sub1Array1947[anInt1941 * 828088099] != class168_sub1)
			throw new RuntimeException();
		aClass168_Sub1Array1947[(anInt1941 -= -724399989) * 828088099 + 1] = null;
		class168_sub1.method2873();
		if (anInt1941 * 828088099 >= 0) {
			aClass168_1938 = aClass168_Sub1Array1947[anInt1941 * 828088099];
			aClass168_Sub1Array1947[828088099 * anInt1941].method359();
		} else {
			aClass168_1938 = aClass168_Sub2_1939;
			aClass168_Sub2_1939.method359();
		}
	}

	public abstract Interface22 method3440(int i, int i_649_, Class158 class158, Class170 class170, int i_650_);

	public abstract Interface22 method3441(int i, int i_651_, Class158 class158, Class170 class170, int i_652_);

	public void method3442(boolean bool) {
		/* empty */
	}

	public abstract Class150 method3443();

	public final void method3444(int i, int i_653_, int i_654_, int i_655_, int i_656_) {
		method3083(i, i_653_, i_654_, i_655_, i_656_, 1);
	}

	public final void method3445(int i, int i_657_, int i_658_, int i_659_, int i_660_) {
		method3083(i, i_657_, i_658_, i_659_, i_660_, 1);
	}

	public abstract Class441 method3446();

	public final void method3447(int i, int i_661_, int i_662_, int i_663_, int i_664_) {
		method3193(i, i_661_, i_662_, i_663_, i_664_, 1);
	}

	public final void method3448(int i, int i_665_, int i_666_, int i_667_, int i_668_) {
		method3193(i, i_665_, i_666_, i_667_, i_668_, 1);
	}

	public final void method3449(int i, int i_669_, int i_670_, int i_671_) {
		method3087(i, i_669_, i_670_, i_671_, 1);
	}

	public final void method3450(int i, int i_672_, int i_673_, int i_674_) {
		method3119(i, i_672_, i_673_, i_674_, 1);
	}

	static synchronized Class178 method3451(int i, Canvas canvas, Class172 class172, Interface25 interface25, Interface46 interface46, Interface48 interface48, Interface45 interface45, Class472 class472, int i_675_, int i_676_, int i_677_, int i_678_) {
		if (i == 0)
			return Class688_Sub4_Sub1.method18187(canvas, class172, interface25, interface46, interface48, interface45, i_676_, i_677_, -366489558);
		if (1 == i)
			return Class152.method2525(canvas, class172, interface25, interface46, interface48, interface45, i_675_);
		if (i == 5)
			return Class476.method7769(canvas, class172, interface25, interface46, interface48, interface45, class472, i_675_);
		if (3 == i)
			return Class414.method6652(canvas, class172, interface25, interface46, interface48, interface45, class472, i_675_);
		throw new IllegalArgumentException("");
	}

	public abstract void method3452(int i, int i_679_, int i_680_, int i_681_, int i_682_, int i_683_);

	public final void method3453(int i, int i_684_, int i_685_, int i_686_, int i_687_) {
		method3089(i, i_684_, i_685_, i_686_, i_687_, 1);
	}

	public Class148 method3454(int i, int i_688_, boolean bool) {
		return method3136(i, i_688_, bool, false);
	}

	public Class148 method3455(int i, int i_689_, boolean bool) {
		return method3136(i, i_689_, bool, false);
	}

	public Class148 method3456(int i, int i_690_, boolean bool) {
		return method3136(i, i_690_, bool, false);
	}

	public abstract boolean method3457();

	public Class148 method3458(int[] is, int i, int i_691_, int i_692_, int i_693_) {
		return method3102(is, i, i_691_, i_692_, i_693_, true);
	}

	public void method3459() {
		/* empty */
	}

	public abstract void method3460(int i, float f, float f_694_, float f_695_, float f_696_, float f_697_);

	public void method3461() {
		/* empty */
	}

	public abstract int method3462(int i, int i_698_);

	public boolean method3463() {
		return true;
	}

	public abstract Class435 method3464();

	abstract void method3465(float f, float f_699_, float f_700_, float f_701_, float f_702_, float f_703_);

	public abstract void method3466(int i, int i_704_, int i_705_);

	abstract void method3467(float f, float f_706_, float f_707_, float f_708_, float f_709_, float f_710_);

	abstract void method3468(float f, float f_711_, float f_712_, float f_713_, float f_714_, float f_715_);

	public int[] method3469(int i, int i_716_, int i_717_, int i_718_, int[] is, int i_719_, int i_720_) {
		int[] is_721_ = new int[i_717_ * i_718_];
		if (0 == i_720_)
			i_720_ = i;
		for (int i_722_ = 0; i_722_ < i_718_; i_722_++) {
			if (i_722_ < i_716_) {
				int i_723_ = i_720_ * i_722_ + i_719_;
				for (int i_724_ = 0; i_724_ < i; i_724_++)
					is_721_[i_717_ * i_722_ + i_724_] = is[i_724_ + i_723_];
				int i_725_ = is[i_723_ + (i - 1)];
				for (int i_726_ = i; i_726_ < i_717_; i_726_++)
					is_721_[i_717_ * i_722_ + i_726_] = i_725_;
			} else {
				int i_727_ = i_717_ * (i_716_ - 1);
				for (int i_728_ = 0; i_728_ < i_717_; i_728_++)
					is_721_[i_722_ * i_717_ + i_728_] = is_721_[i_728_ + i_727_];
			}
		}
		return is_721_;
	}

	public int[] method3470(int i, int i_729_, int i_730_, int i_731_, int[] is, int i_732_, int i_733_) {
		int[] is_734_ = new int[i_730_ * i_731_];
		if (0 == i_733_)
			i_733_ = i;
		for (int i_735_ = 0; i_735_ < i_731_; i_735_++) {
			if (i_735_ < i_729_) {
				int i_736_ = i_733_ * i_735_ + i_732_;
				for (int i_737_ = 0; i_737_ < i; i_737_++)
					is_734_[i_730_ * i_735_ + i_737_] = is[i_737_ + i_736_];
				int i_738_ = is[i_736_ + (i - 1)];
				for (int i_739_ = i; i_739_ < i_730_; i_739_++)
					is_734_[i_730_ * i_735_ + i_739_] = i_738_;
			} else {
				int i_740_ = i_730_ * (i_729_ - 1);
				for (int i_741_ = 0; i_741_ < i_730_; i_741_++)
					is_734_[i_735_ * i_730_ + i_741_] = is_734_[i_741_ + i_740_];
			}
		}
		return is_734_;
	}

	public final void method3471(int i, int i_742_, int i_743_, int i_744_, int i_745_) {
		method3089(i, i_742_, i_743_, i_744_, i_745_, 1);
	}

	public abstract void method3472(int i, int i_746_);

	public float[] method3473(int i, int i_747_, int i_748_, int i_749_, float[] fs, int i_750_, int i_751_, int i_752_) {
		float[] fs_753_ = new float[i_748_ * i_749_ * i_752_];
		if (i_751_ == 0)
			i_751_ = i_752_ * i;
		for (int i_754_ = 0; i_754_ < i_749_; i_754_++) {
			if (i_754_ < i_747_) {
				int i_755_ = i_754_ * i_751_ + i_750_;
				for (int i_756_ = 0; i_756_ < i; i_756_++) {
					for (int i_757_ = 0; i_757_ < i_752_; i_757_++)
						fs_753_[i_757_ + (i_756_ * i_752_ + i_752_ * (i_748_ * i_754_))] = fs[i_757_ + (i_755_ + i_752_ * i_756_)];
				}
				float[] fs_758_ = new float[i_752_];
				for (int i_759_ = 0; i_759_ < i_752_; i_759_++)
					fs_758_[i_759_] = fs[i_755_ + (i - 1) * i_752_ + i_759_];
				for (int i_760_ = i; i_760_ < i_748_; i_760_++) {
					for (int i_761_ = 0; i_761_ < i_752_; i_761_++)
						fs_753_[(i_754_ * i_748_ * i_752_ + i_752_ * i_760_ + i_761_)] = fs_758_[i_761_];
				}
			} else {
				int i_762_ = (i_747_ - 1) * i_748_ * i_752_;
				for (int i_763_ = 0; i_763_ < i_748_; i_763_++) {
					for (int i_764_ = 0; i_764_ < i_752_; i_764_++)
						fs_753_[i_764_ + (i_763_ * i_752_ + i_752_ * (i_754_ * i_748_))] = fs_753_[i_763_ * i_752_ + i_762_ + i_764_];
				}
			}
		}
		return fs_753_;
	}

	public byte[] method3474(int i, int i_765_, int i_766_, int i_767_, byte[] is, int i_768_, int i_769_, int i_770_) {
		byte[] is_771_ = new byte[i_770_ * (i_766_ * i_767_)];
		if (i_769_ == 0)
			i_769_ = i * i_770_;
		for (int i_772_ = 0; i_772_ < i_767_; i_772_++) {
			if (i_772_ < i_765_) {
				int i_773_ = i_768_ + i_769_ * i_772_;
				for (int i_774_ = 0; i_774_ < i; i_774_++) {
					for (int i_775_ = 0; i_775_ < i_770_; i_775_++)
						is_771_[i_775_ + (i_766_ * i_772_ * i_770_ + i_770_ * i_774_)] = is[i_775_ + (i_773_ + i_774_ * i_770_)];
				}
				byte[] is_776_ = new byte[i_770_];
				for (int i_777_ = 0; i_777_ < i_770_; i_777_++)
					is_776_[i_777_] = is[i_770_ * (i - 1) + i_773_ + i_777_];
				for (int i_778_ = i; i_778_ < i_766_; i_778_++) {
					for (int i_779_ = 0; i_779_ < i_770_; i_779_++)
						is_771_[i_779_ + (i_766_ * i_772_ * i_770_ + i_770_ * i_778_)] = is_776_[i_779_];
				}
			} else {
				int i_780_ = i_766_ * (i_765_ - 1) * i_770_;
				for (int i_781_ = 0; i_781_ < i_766_; i_781_++) {
					for (int i_782_ = 0; i_782_ < i_770_; i_782_++)
						is_771_[(i_770_ * i_781_ + i_772_ * i_766_ * i_770_ + i_782_)] = is_771_[i_782_ + (i_780_ + i_781_ * i_770_)];
				}
			}
		}
		return is_771_;
	}

	public void method3475() {
		/* empty */
	}

	static void method3476(String string, int i) {
		Class523_Sub27_Sub2.aClass700_11334 = Class700.aClass700_8775;
		Class54.aString725 = string;
	}

	static void method3477(int i, boolean bool, int i_783_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(23, (long) i);
		class523_sub27_sub7.method17963(2038507235);
		class523_sub27_sub7.anInt11653 = -1217347391 * (bool ? 1 : 0);
	}
}
