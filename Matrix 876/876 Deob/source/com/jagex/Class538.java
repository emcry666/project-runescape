/* Class538 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class538 {
	static void method8943(int i, int i_0_, int i_1_, int i_2_, int i_3_, Class521 class521, float f, float f_4_, float f_5_, float f_6_, float f_7_, byte[] is, int i_8_) {
		int i_9_ = i_0_ * i_1_;
		float[] fs = new float[i_9_];
		for (int i_10_ = 0; i_10_ < i_3_; i_10_++) {
			int i_11_ = i_8_;
			class521.method8649(i, i_0_, i_1_, i_2_, f / (float) i_0_, f_4_ / (float) i_1_, f_5_ / (float) i_2_, f_6_ * 127.0F, fs, 0);
			for (int i_12_ = 0; i_12_ < i_9_; i_12_++) {
				is[i_11_] += fs[i_12_];
				i_11_++;
			}
			f *= 2.0F;
			f_4_ *= 2.0F;
			f_5_ *= 2.0F;
			f_6_ *= f_7_;
		}
		int i_13_ = i_8_;
		for (int i_14_ = 0; i_14_ < i_9_; i_14_++) {
			is[i_13_] = (byte) (is[i_13_] + 127);
			i_13_++;
		}
	}

	static void method8944(int i, int i_15_, int i_16_, int i_17_, int i_18_, Class521 class521, float f, float f_19_, float f_20_, float f_21_, float f_22_, byte[] is, int i_23_) {
		int i_24_ = i_15_ * i_16_;
		float[] fs = new float[i_24_];
		for (int i_25_ = 0; i_25_ < i_18_; i_25_++) {
			int i_26_ = i_23_;
			class521.method8649(i, i_15_, i_16_, i_17_, f / (float) i_15_, f_19_ / (float) i_16_, f_20_ / (float) i_17_, f_21_ * 127.0F, fs, 0);
			for (int i_27_ = 0; i_27_ < i_24_; i_27_++) {
				is[i_26_] += fs[i_27_];
				i_26_++;
			}
			f *= 2.0F;
			f_19_ *= 2.0F;
			f_20_ *= 2.0F;
			f_21_ *= f_22_;
		}
		int i_28_ = i_23_;
		for (int i_29_ = 0; i_29_ < i_24_; i_29_++) {
			is[i_28_] = (byte) (is[i_28_] + 127);
			i_28_++;
		}
	}

	public static byte[] method8945(int i, int i_30_, int i_31_, int i_32_, Class521 class521, float f, float f_33_, float f_34_, float f_35_, float f_36_) {
		byte[] is = new byte[i * i_30_ * i_31_];
		method8950(i, i_30_, i_31_, i_32_, class521, f, f_33_, f_34_, f_35_, f_36_, is, 0);
		return is;
	}

	static void method8946(int i, int i_37_, int i_38_, int i_39_, Class521 class521, float f, float f_40_, float f_41_, float f_42_, float f_43_, byte[] is, int i_44_) {
		for (int i_45_ = 0; i_45_ < i_38_; i_45_++) {
			method8944(i_45_, i, i_37_, i_38_, i_39_, class521, f, f_40_, f_41_, f_42_, f_43_, is, i_44_);
			i_44_ += i * i_37_;
		}
	}

	static void method8947(int i, int i_46_, int i_47_, int i_48_, int i_49_, Class521 class521, float f, float f_50_, float f_51_, float f_52_, float f_53_, byte[] is, int i_54_) {
		int i_55_ = i_46_ * i_47_;
		float[] fs = new float[i_55_];
		for (int i_56_ = 0; i_56_ < i_49_; i_56_++) {
			int i_57_ = i_54_;
			class521.method8649(i, i_46_, i_47_, i_48_, f / (float) i_46_, f_50_ / (float) i_47_, f_51_ / (float) i_48_, f_52_ * 127.0F, fs, 0);
			for (int i_58_ = 0; i_58_ < i_55_; i_58_++) {
				is[i_57_] += fs[i_58_];
				i_57_++;
			}
			f *= 2.0F;
			f_50_ *= 2.0F;
			f_51_ *= 2.0F;
			f_52_ *= f_53_;
		}
		int i_59_ = i_54_;
		for (int i_60_ = 0; i_60_ < i_55_; i_60_++) {
			is[i_59_] = (byte) (is[i_59_] + 127);
			i_59_++;
		}
	}

	static void method8948(int i, int i_61_, int i_62_, int i_63_, Class521 class521, float f, float f_64_, float f_65_, float f_66_, float f_67_, byte[] is, int i_68_) {
		for (int i_69_ = 0; i_69_ < i_62_; i_69_++) {
			method8944(i_69_, i, i_61_, i_62_, i_63_, class521, f, f_64_, f_65_, f_66_, f_67_, is, i_68_);
			i_68_ += i * i_61_;
		}
	}

	static void method8949(int i, int i_70_, int i_71_, int i_72_, int i_73_, Class521 class521, float f, float f_74_, float f_75_, float f_76_, float f_77_, byte[] is, int i_78_) {
		int i_79_ = i_70_ * i_71_;
		float[] fs = new float[i_79_];
		for (int i_80_ = 0; i_80_ < i_73_; i_80_++) {
			int i_81_ = i_78_;
			class521.method8649(i, i_70_, i_71_, i_72_, f / (float) i_70_, f_74_ / (float) i_71_, f_75_ / (float) i_72_, f_76_ * 127.0F, fs, 0);
			for (int i_82_ = 0; i_82_ < i_79_; i_82_++) {
				is[i_81_] += fs[i_82_];
				i_81_++;
			}
			f *= 2.0F;
			f_74_ *= 2.0F;
			f_75_ *= 2.0F;
			f_76_ *= f_77_;
		}
		int i_83_ = i_78_;
		for (int i_84_ = 0; i_84_ < i_79_; i_84_++) {
			is[i_83_] = (byte) (is[i_83_] + 127);
			i_83_++;
		}
	}

	static void method8950(int i, int i_85_, int i_86_, int i_87_, Class521 class521, float f, float f_88_, float f_89_, float f_90_, float f_91_, byte[] is, int i_92_) {
		for (int i_93_ = 0; i_93_ < i_86_; i_93_++) {
			method8944(i_93_, i, i_85_, i_86_, i_87_, class521, f, f_88_, f_89_, f_90_, f_91_, is, i_92_);
			i_92_ += i * i_85_;
		}
	}

	static void method8951(int i, int i_94_, int i_95_, int i_96_, int i_97_, Class521 class521, float f, float f_98_, float f_99_, float f_100_, float f_101_, byte[] is, int i_102_) {
		int i_103_ = i_94_ * i_95_;
		float[] fs = new float[i_103_];
		for (int i_104_ = 0; i_104_ < i_97_; i_104_++) {
			int i_105_ = i_102_;
			class521.method8649(i, i_94_, i_95_, i_96_, f / (float) i_94_, f_98_ / (float) i_95_, f_99_ / (float) i_96_, f_100_ * 127.0F, fs, 0);
			for (int i_106_ = 0; i_106_ < i_103_; i_106_++) {
				is[i_105_] += fs[i_106_];
				i_105_++;
			}
			f *= 2.0F;
			f_98_ *= 2.0F;
			f_99_ *= 2.0F;
			f_100_ *= f_101_;
		}
		int i_107_ = i_102_;
		for (int i_108_ = 0; i_108_ < i_103_; i_108_++) {
			is[i_107_] = (byte) (is[i_107_] + 127);
			i_107_++;
		}
	}

	Class538() throws Throwable {
		throw new Error();
	}

	public static byte[] method8952(int i, int i_109_, int i_110_, int i_111_, Class521 class521, float f, float f_112_, float f_113_, float f_114_, float f_115_) {
		byte[] is = new byte[i * i_109_ * i_110_];
		method8950(i, i_109_, i_110_, i_111_, class521, f, f_112_, f_113_, f_114_, f_115_, is, 0);
		return is;
	}

	static void method8953(int i, int i_116_, int i_117_, int i_118_, Class521 class521, float f, float f_119_, float f_120_, float f_121_, float f_122_, byte[] is, int i_123_) {
		for (int i_124_ = 0; i_124_ < i_117_; i_124_++) {
			method8944(i_124_, i, i_116_, i_117_, i_118_, class521, f, f_119_, f_120_, f_121_, f_122_, is, i_123_);
			i_123_ += i * i_116_;
		}
	}
}
