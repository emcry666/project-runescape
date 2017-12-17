/* Class148_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class148_Sub1 extends Class148 {
	int anInt8914;
	static int anInt8915;
	int anInt8916;
	static int anInt8917;
	int anInt8918;
	int anInt8919;
	int anInt8920;
	int anInt8921;
	static int anInt8922;
	Class178_Sub3 aClass178_Sub3_8923;
	static final int anInt8924 = 12;
	static int anInt8925;
	static int anInt8926;
	static int anInt8927;
	static int anInt8928;
	static int anInt8929;
	static int anInt8930;
	static int anInt8931;
	static final int anInt8932 = 8;
	static int anInt8933;
	int[] anIntArray8934;
	static int anInt8935;
	static int anInt8936;
	static int anInt8937;
	static int anInt8938;
	static int anInt8939;
	static int anInt8940;
	static int anInt8941;
	static int anInt8942 = 0;
	static int anInt8943 = 0;
	static int anInt8944 = 0;
	static int anInt8945 = 0;
	static int anInt8946 = 0;
	static final int anInt8947 = 4;
	static int anInt8948;
	static int anInt8949;

	public abstract void method2486(int i, int i_0_, int i_1_, int i_2_, int i_3_);

	public void method2426(int i, int i_4_, int i_5_, int i_6_) {
		anInt8921 = i;
		anInt8918 = i_4_;
		anInt8919 = i_5_;
		anInt8920 = i_6_;
	}

	public void method2425(int[] is) {
		is[0] = anInt8921;
		is[1] = anInt8918;
		is[2] = anInt8919;
		is[3] = anInt8920;
	}

	public int method2504() {
		return anInt8914;
	}

	public int method2428() {
		return anInt8916;
	}

	public int method38() {
		return anInt8921 + anInt8914 + anInt8919;
	}

	public int method2429() {
		return anInt8918 + anInt8916 + anInt8920;
	}

	public abstract void method2431(int i, int i_7_, int i_8_, int i_9_, int[] is, int i_10_, int i_11_);

	void method2487(float f, float f_12_, float f_13_, float f_14_, float f_15_, float f_16_, int i, Class145 class145, int i_17_, int i_18_) {
		if (aClass178_Sub3_8923.method15412())
			throw new IllegalStateException();
		if (method14402(f, f_12_, f_13_, f_14_, f_15_, f_16_)) {
			Class145_Sub1 class145_sub1 = (Class145_Sub1) class145;
			method14405(class145_sub1.anIntArray9521, class145_sub1.anIntArray9520, anInt8917 - i_17_, -i_18_ - (anInt8928 - anInt8927));
		}
	}

	public abstract void method2482(int i, int i_19_, Class145 class145, int i_20_, int i_21_);

	void method2449(float f, float f_22_, float f_23_, float f_24_, float f_25_, float f_26_, int i, int i_27_, int i_28_, int i_29_) {
		if (aClass178_Sub3_8923.method15412())
			throw new IllegalStateException();
		if (method14402(f, f_22_, f_23_, f_24_, f_25_, f_26_)) {
			anInt8941 = i_27_;
			if (i != 1) {
				anInt8942 = i_27_ >>> 24;
				anInt8943 = 256 - anInt8942;
				if (i == 0) {
					anInt8944 = (i_27_ & 0xff0000) >> 16;
					anInt8945 = (i_27_ & 0xff00) >> 8;
					anInt8946 = i_27_ & 0xff;
				} else if (i == 2) {
					anInt8915 = i_27_ >>> 24;
					anInt8948 = 256 - anInt8915;
					int i_30_ = (i_27_ & 0xff00ff) * anInt8948 & ~0xff00ff;
					int i_31_ = (i_27_ & 0xff00) * anInt8948 & 0xff0000;
					anInt8949 = (i_30_ | i_31_) >>> 8;
				}
			}
			method14404(i, i_28_);
		}
	}

	public abstract void method2437(int i, int i_32_, int i_33_, int i_34_, int[] is, int i_35_, int i_36_);

	public void method2464(int i, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_) {
		if (aClass178_Sub3_8923.method15412())
			throw new IllegalStateException();
		if (anIntArray8934 == null)
			anIntArray8934 = new int[4];
		aClass178_Sub3_8923.method3075(anIntArray8934);
		aClass178_Sub3_8923.method3266((aClass178_Sub3_8923.anInt9815 * -1373518821), (aClass178_Sub3_8923.anInt9810 * -695823527), i + i_38_, i_37_ + i_39_);
		int i_43_ = method38();
		int i_44_ = method2429();
		int i_45_ = (i_38_ + i_43_ - 1) / i_43_;
		int i_46_ = (i_39_ + i_44_ - 1) / i_44_;
		for (int i_47_ = 0; i_47_ < i_46_; i_47_++) {
			int i_48_ = i_47_ * i_44_;
			for (int i_49_ = 0; i_49_ < i_45_; i_49_++)
				method2436(i + i_49_ * i_43_, i_37_ + i_48_, i_40_, i_41_, i_42_);
		}
		aClass178_Sub3_8923.method3378(anIntArray8934[0], anIntArray8934[1], anIntArray8934[2], anIntArray8934[3]);
	}

	boolean method14402(float f, float f_50_, float f_51_, float f_52_, float f_53_, float f_54_) {
		int i = anInt8921 + anInt8914 + anInt8919;
		int i_55_ = anInt8918 + anInt8916 + anInt8920;
		if (i != anInt8914 || i_55_ != anInt8916) {
			float f_56_ = (f_51_ - f) / (float) i;
			float f_57_ = (f_52_ - f_50_) / (float) i;
			float f_58_ = (f_53_ - f) / (float) i_55_;
			float f_59_ = (f_54_ - f_50_) / (float) i_55_;
			float f_60_ = f_58_ * (float) anInt8918;
			float f_61_ = f_59_ * (float) anInt8918;
			float f_62_ = f_56_ * (float) anInt8921;
			float f_63_ = f_57_ * (float) anInt8921;
			float f_64_ = -f_56_ * (float) anInt8919;
			float f_65_ = -f_57_ * (float) anInt8919;
			float f_66_ = -f_58_ * (float) anInt8920;
			float f_67_ = -f_59_ * (float) anInt8920;
			f += f_62_ + f_60_;
			f_50_ += f_63_ + f_61_;
			f_51_ += f_64_ + f_60_;
			f_52_ += f_65_ + f_61_;
			f_53_ += f_62_ + f_66_;
			f_54_ += f_63_ + f_67_;
		}
		float f_68_ = f_53_ + (f_51_ - f);
		float f_69_ = f_52_ + (f_54_ - f_50_);
		float f_70_;
		float f_71_;
		if (f < f_51_) {
			f_70_ = f;
			f_71_ = f_51_;
		} else {
			f_70_ = f_51_;
			f_71_ = f;
		}
		if (f_53_ < f_70_)
			f_70_ = f_53_;
		if (f_68_ < f_70_)
			f_70_ = f_68_;
		if (f_53_ > f_71_)
			f_71_ = f_53_;
		if (f_68_ > f_71_)
			f_71_ = f_68_;
		float f_72_;
		float f_73_;
		if (f_50_ < f_52_) {
			f_72_ = f_50_;
			f_73_ = f_52_;
		} else {
			f_72_ = f_52_;
			f_73_ = f_50_;
		}
		if (f_54_ < f_72_)
			f_72_ = f_54_;
		if (f_69_ < f_72_)
			f_72_ = f_69_;
		if (f_54_ > f_73_)
			f_73_ = f_54_;
		if (f_69_ > f_73_)
			f_73_ = f_69_;
		if (f_70_ < (float) (aClass178_Sub3_8923.anInt9815 * -1373518821))
			f_70_ = (float) (aClass178_Sub3_8923.anInt9815 * -1373518821);
		if (f_71_ > (float) (aClass178_Sub3_8923.anInt9809 * -272361347))
			f_71_ = (float) (aClass178_Sub3_8923.anInt9809 * -272361347);
		if (f_72_ < (float) (aClass178_Sub3_8923.anInt9810 * -695823527))
			f_72_ = (float) (aClass178_Sub3_8923.anInt9810 * -695823527);
		if (f_73_ > (float) (aClass178_Sub3_8923.anInt9826 * 489020741))
			f_73_ = (float) (aClass178_Sub3_8923.anInt9826 * 489020741);
		f_71_ = f_70_ - f_71_;
		if (f_71_ >= 0.0F)
			return false;
		f_73_ = f_72_ - f_73_;
		if (f_73_ >= 0.0F)
			return false;
		anInt8929 = aClass178_Sub3_8923.anInt9825 * 1013077751;
		anInt8930 = (int) ((float) ((int) f_72_ * anInt8929) + f_70_);
		float f_74_ = (f_51_ - f) * (f_54_ - f_50_) - (f_52_ - f_50_) * (f_53_ - f);
		float f_75_ = (f_53_ - f) * (f_52_ - f_50_) - (f_54_ - f_50_) * (f_51_ - f);
		anInt8940 = (int) ((f_54_ - f_50_) * 4096.0F * (float) anInt8914 / f_74_);
		anInt8938 = (int) ((f_52_ - f_50_) * 4096.0F * (float) anInt8916 / f_75_);
		anInt8933 = (int) ((f_53_ - f) * 4096.0F * (float) anInt8914 / f_75_);
		anInt8922 = (int) ((f_51_ - f) * 4096.0F * (float) anInt8916 / f_74_);
		anInt8935 = (int) (f_70_ * 16.0F + 8.0F - (f + f_51_ + f_53_ + f_68_) / 4.0F * 16.0F);
		anInt8931 = (int) (f_72_ * 16.0F + 8.0F - (f_50_ + f_52_ + f_54_ + f_69_) / 4.0F * 16.0F);
		anInt8937 = (anInt8914 >> 1 << 12) + (anInt8931 * anInt8933 >> 4);
		anInt8936 = (anInt8916 >> 1 << 12) + (anInt8931 * anInt8922 >> 4);
		anInt8939 = anInt8935 * anInt8940 >> 4;
		anInt8925 = anInt8935 * anInt8938 >> 4;
		anInt8917 = (int) f_70_;
		anInt8926 = (int) f_71_;
		anInt8927 = (int) f_72_;
		anInt8928 = (int) f_73_;
		return true;
	}

	abstract void method14403(boolean bool, boolean bool_76_, boolean bool_77_, int i, int i_78_, float f, int i_79_, int i_80_, int i_81_, int i_82_, int i_83_, int i_84_, boolean bool_85_);

	abstract void method14404(int i, int i_86_);

	void method2475(float f, float f_87_, float f_88_, float f_89_, float f_90_, float f_91_, int i, Class145 class145, int i_92_, int i_93_) {
		if (aClass178_Sub3_8923.method15412())
			throw new IllegalStateException();
		if (method14402(f, f_87_, f_88_, f_89_, f_90_, f_91_)) {
			Class145_Sub1 class145_sub1 = (Class145_Sub1) class145;
			method14405(class145_sub1.anIntArray9521, class145_sub1.anIntArray9520, anInt8917 - i_92_, -i_93_ - (anInt8928 - anInt8927));
		}
	}

	abstract void method2461(int i, int i_94_, int i_95_, int i_96_, int i_97_, int i_98_, int i_99_, int i_100_);

	static {
		anInt8915 = 0;
		anInt8948 = 0;
		anInt8949 = 0;
	}

	public abstract void method2452(int i, int i_101_, int i_102_, int i_103_, int[] is, int i_104_, int i_105_);

	public abstract void method2506(int i, int i_106_, int i_107_, int i_108_, int[] is, int i_109_, int i_110_);

	public abstract void method2454(int i, int i_111_, int i_112_, int i_113_, int[] is, int i_114_, int i_115_);

	Class148_Sub1(Class178_Sub3 class178_sub3, int i, int i_116_) {
		aClass178_Sub3_8923 = class178_sub3;
		anInt8914 = i;
		anInt8916 = i_116_;
	}

	void method2427(float f, float f_117_, float f_118_, float f_119_, float f_120_, float f_121_, int i, int i_122_, int i_123_, int i_124_) {
		if (aClass178_Sub3_8923.method15412())
			throw new IllegalStateException();
		if (method14402(f, f_117_, f_118_, f_119_, f_120_, f_121_)) {
			anInt8941 = i_122_;
			if (i != 1) {
				anInt8942 = i_122_ >>> 24;
				anInt8943 = 256 - anInt8942;
				if (i == 0) {
					anInt8944 = (i_122_ & 0xff0000) >> 16;
					anInt8945 = (i_122_ & 0xff00) >> 8;
					anInt8946 = i_122_ & 0xff;
				} else if (i == 2) {
					anInt8915 = i_122_ >>> 24;
					anInt8948 = 256 - anInt8915;
					int i_125_ = (i_122_ & 0xff00ff) * anInt8948 & ~0xff00ff;
					int i_126_ = (i_122_ & 0xff00) * anInt8948 & 0xff0000;
					anInt8949 = (i_125_ | i_126_) >>> 8;
				}
			}
			method14404(i, i_123_);
		}
	}

	public void method2457(int i, int i_127_, int i_128_, int i_129_) {
		anInt8921 = i;
		anInt8918 = i_127_;
		anInt8919 = i_128_;
		anInt8920 = i_129_;
	}

	public abstract void method2483(int i, int i_130_, int i_131_, int i_132_, int[] is, int i_133_, int i_134_);

	public abstract void method2493(int i, int i_135_, int i_136_, int i_137_, int i_138_);

	public abstract void method2466(int i, int i_139_, Class145 class145, int i_140_, int i_141_);

	public void method2476(int[] is) {
		is[0] = anInt8921;
		is[1] = anInt8918;
		is[2] = anInt8919;
		is[3] = anInt8920;
	}

	public abstract void method2488(int i, int i_142_, Class145 class145, int i_143_, int i_144_);

	abstract void method2453(int i, int i_145_, int i_146_, int i_147_, int i_148_, int i_149_, int i_150_, int i_151_);

	public int method2479() {
		return anInt8916;
	}

	abstract void method14405(int[] is, int[] is_152_, int i, int i_153_);

	abstract void method14406(int i, int i_154_);

	abstract void method14407(int i, int i_155_);

	abstract void method14408(boolean bool, boolean bool_156_, boolean bool_157_, int i, int i_158_, float f, int i_159_, int i_160_, int i_161_, int i_162_, int i_163_, int i_164_, boolean bool_165_);

	public void method2472(int i, int i_166_, int i_167_, int i_168_) {
		anInt8921 = i;
		anInt8918 = i_166_;
		anInt8919 = i_167_;
		anInt8920 = i_168_;
	}

	public abstract void method2463(int i, int i_169_, int i_170_, int i_171_, int i_172_);

	public void method2442(int[] is) {
		is[0] = anInt8921;
		is[1] = anInt8918;
		is[2] = anInt8919;
		is[3] = anInt8920;
	}

	public void method2458(int[] is) {
		is[0] = anInt8921;
		is[1] = anInt8918;
		is[2] = anInt8919;
		is[3] = anInt8920;
	}

	public abstract void method2467(int i, int i_173_, Class145 class145, int i_174_, int i_175_);

	public int method2477() {
		return anInt8914;
	}

	public int method2478() {
		return anInt8916;
	}

	public abstract void method2436(int i, int i_176_, int i_177_, int i_178_, int i_179_);

	public int method2485() {
		return anInt8916;
	}

	public int method39() {
		return anInt8921 + anInt8914 + anInt8919;
	}

	public int method40() {
		return anInt8921 + anInt8914 + anInt8919;
	}

	public int method37() {
		return anInt8921 + anInt8914 + anInt8919;
	}

	public int method2474() {
		return anInt8918 + anInt8916 + anInt8920;
	}

	public int method2465() {
		return anInt8918 + anInt8916 + anInt8920;
	}

	public void method2484(int i, int i_180_, int i_181_, int i_182_, int i_183_, int i_184_, int i_185_) {
		if (aClass178_Sub3_8923.method15412())
			throw new IllegalStateException();
		if (anIntArray8934 == null)
			anIntArray8934 = new int[4];
		aClass178_Sub3_8923.method3075(anIntArray8934);
		aClass178_Sub3_8923.method3266((aClass178_Sub3_8923.anInt9815 * -1373518821), (aClass178_Sub3_8923.anInt9810 * -695823527), i + i_181_, i_180_ + i_182_);
		int i_186_ = method38();
		int i_187_ = method2429();
		int i_188_ = (i_181_ + i_186_ - 1) / i_186_;
		int i_189_ = (i_182_ + i_187_ - 1) / i_187_;
		for (int i_190_ = 0; i_190_ < i_189_; i_190_++) {
			int i_191_ = i_190_ * i_187_;
			for (int i_192_ = 0; i_192_ < i_188_; i_192_++)
				method2436(i + i_192_ * i_186_, i_180_ + i_191_, i_183_, i_184_, i_185_);
		}
		aClass178_Sub3_8923.method3378(anIntArray8934[0], anIntArray8934[1], anIntArray8934[2], anIntArray8934[3]);
	}

	public void method2424(int i, int i_193_, int i_194_, int i_195_, int i_196_, int i_197_, int i_198_) {
		if (aClass178_Sub3_8923.method15412())
			throw new IllegalStateException();
		if (anIntArray8934 == null)
			anIntArray8934 = new int[4];
		aClass178_Sub3_8923.method3075(anIntArray8934);
		aClass178_Sub3_8923.method3266((aClass178_Sub3_8923.anInt9815 * -1373518821), (aClass178_Sub3_8923.anInt9810 * -695823527), i + i_194_, i_193_ + i_195_);
		int i_199_ = method38();
		int i_200_ = method2429();
		int i_201_ = (i_194_ + i_199_ - 1) / i_199_;
		int i_202_ = (i_195_ + i_200_ - 1) / i_200_;
		for (int i_203_ = 0; i_203_ < i_202_; i_203_++) {
			int i_204_ = i_203_ * i_200_;
			for (int i_205_ = 0; i_205_ < i_201_; i_205_++)
				method2436(i + i_205_ * i_199_, i_193_ + i_204_, i_196_, i_197_, i_198_);
		}
		aClass178_Sub3_8923.method3378(anIntArray8934[0], anIntArray8934[1], anIntArray8934[2], anIntArray8934[3]);
	}

	abstract void method14409(int[] is, int[] is_206_, int i, int i_207_);

	void method2495(float f, float f_208_, float f_209_, float f_210_, float f_211_, float f_212_, int i, Class145 class145, int i_213_, int i_214_) {
		if (aClass178_Sub3_8923.method15412())
			throw new IllegalStateException();
		if (method14402(f, f_208_, f_209_, f_210_, f_211_, f_212_)) {
			Class145_Sub1 class145_sub1 = (Class145_Sub1) class145;
			method14405(class145_sub1.anIntArray9521, class145_sub1.anIntArray9520, anInt8917 - i_213_, -i_214_ - (anInt8928 - anInt8927));
		}
	}

	abstract void method14410(boolean bool, boolean bool_215_, boolean bool_216_, int i, int i_217_, float f, int i_218_, int i_219_, int i_220_, int i_221_, int i_222_, int i_223_, boolean bool_224_);
}
