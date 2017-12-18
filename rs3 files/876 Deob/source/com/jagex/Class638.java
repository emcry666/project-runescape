/* Class638 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class638 {
	public static int[] anIntArray8306;
	public static int[] anIntArray8307;
	static int anInt8308;
	static int anInt8309 = 0;

	static void method10483() {
		if (null == anIntArray8306)
			anIntArray8306 = new int[65536];
		else
			return;
		double d = 0.7 + (Math.random() * 0.03 - 0.015);
		int i = 0;
		for (int i_0_ = 0; i_0_ < 512; i_0_++) {
			float f = ((float) (i_0_ >> 3) / 64.0F + 0.0078125F) * 360.0F;
			float f_1_ = (float) (i_0_ & 0x7) / 8.0F + 0.0625F;
			for (int i_2_ = 0; i_2_ < 128; i_2_++) {
				float f_3_ = (float) i_2_ / 128.0F;
				float f_4_ = 0.0F;
				float f_5_ = 0.0F;
				float f_6_ = 0.0F;
				float f_7_ = f / 60.0F;
				int i_8_ = (int) f_7_;
				int i_9_ = i_8_ % 6;
				float f_10_ = f_7_ - (float) i_8_;
				float f_11_ = f_3_ * (1.0F - f_1_);
				float f_12_ = (1.0F - f_1_ * f_10_) * f_3_;
				float f_13_ = f_3_ * (1.0F - f_1_ * (1.0F - f_10_));
				if (i_9_ == 0) {
					f_4_ = f_3_;
					f_5_ = f_13_;
					f_6_ = f_11_;
				} else if (1 == i_9_) {
					f_4_ = f_12_;
					f_5_ = f_3_;
					f_6_ = f_11_;
				} else if (i_9_ == 2) {
					f_4_ = f_11_;
					f_5_ = f_3_;
					f_6_ = f_13_;
				} else if (i_9_ == 3) {
					f_4_ = f_11_;
					f_5_ = f_12_;
					f_6_ = f_3_;
				} else if (4 == i_9_) {
					f_4_ = f_13_;
					f_5_ = f_11_;
					f_6_ = f_3_;
				} else if (5 == i_9_) {
					f_4_ = f_3_;
					f_5_ = f_11_;
					f_6_ = f_12_;
				}
				f_4_ = (float) Math.pow((double) f_4_, d);
				f_5_ = (float) Math.pow((double) f_5_, d);
				f_6_ = (float) Math.pow((double) f_6_, d);
				int i_14_ = (int) (256.0F * f_4_);
				int i_15_ = (int) (f_5_ * 256.0F);
				int i_16_ = (int) (256.0F * f_6_);
				int i_17_ = i_16_ + ((i_15_ << 8) + ((i_14_ << 16) + -16777216));
				anIntArray8306[i++] = i_17_;
			}
		}
	}

	static {
		anInt8308 = 0;
	}

	public static final int method10484(int i, int i_18_) {
		if (i == -2)
			return 12345678;
		if (i == -1) {
			if (i_18_ < 2)
				i_18_ = 2;
			else if (i_18_ > 126)
				i_18_ = 126;
			return i_18_;
		}
		i_18_ = i_18_ * (i & 0x7f) >> 7;
		if (i_18_ < 2)
			i_18_ = 2;
		else if (i_18_ > 126)
			i_18_ = 126;
		return (i & 0xff80) + i_18_;
	}

	public static final int method10485(int i, int i_19_, int i_20_) {
		if (i_20_ > 243)
			i_19_ >>= 4;
		else if (i_20_ > 217)
			i_19_ >>= 3;
		else if (i_20_ > 192)
			i_19_ >>= 2;
		else if (i_20_ > 179)
			i_19_ >>= 1;
		return (i_19_ >> 5 << 7) + ((i & 0xff) >> 2 << 10) + (i_20_ >> 1);
	}

	public static void method10486(boolean bool, boolean bool_21_) {
		if (bool) {
			anInt8309 -= 1410281817;
			if (0 == -157022487 * anInt8309)
				anIntArray8306 = null;
		}
		if (bool_21_) {
			anInt8308 -= -636711061;
			if (0 == anInt8308 * 1156851011)
				Class710.anIntArray8839 = null;
		}
	}

	static void method10487() {
		if (null == anIntArray8306)
			anIntArray8306 = new int[65536];
		else
			return;
		double d = 0.7 + (Math.random() * 0.03 - 0.015);
		int i = 0;
		for (int i_22_ = 0; i_22_ < 512; i_22_++) {
			float f = ((float) (i_22_ >> 3) / 64.0F + 0.0078125F) * 360.0F;
			float f_23_ = (float) (i_22_ & 0x7) / 8.0F + 0.0625F;
			for (int i_24_ = 0; i_24_ < 128; i_24_++) {
				float f_25_ = (float) i_24_ / 128.0F;
				float f_26_ = 0.0F;
				float f_27_ = 0.0F;
				float f_28_ = 0.0F;
				float f_29_ = f / 60.0F;
				int i_30_ = (int) f_29_;
				int i_31_ = i_30_ % 6;
				float f_32_ = f_29_ - (float) i_30_;
				float f_33_ = f_25_ * (1.0F - f_23_);
				float f_34_ = (1.0F - f_23_ * f_32_) * f_25_;
				float f_35_ = f_25_ * (1.0F - f_23_ * (1.0F - f_32_));
				if (i_31_ == 0) {
					f_26_ = f_25_;
					f_27_ = f_35_;
					f_28_ = f_33_;
				} else if (1 == i_31_) {
					f_26_ = f_34_;
					f_27_ = f_25_;
					f_28_ = f_33_;
				} else if (i_31_ == 2) {
					f_26_ = f_33_;
					f_27_ = f_25_;
					f_28_ = f_35_;
				} else if (i_31_ == 3) {
					f_26_ = f_33_;
					f_27_ = f_34_;
					f_28_ = f_25_;
				} else if (4 == i_31_) {
					f_26_ = f_35_;
					f_27_ = f_33_;
					f_28_ = f_25_;
				} else if (5 == i_31_) {
					f_26_ = f_25_;
					f_27_ = f_33_;
					f_28_ = f_34_;
				}
				f_26_ = (float) Math.pow((double) f_26_, d);
				f_27_ = (float) Math.pow((double) f_27_, d);
				f_28_ = (float) Math.pow((double) f_28_, d);
				int i_36_ = (int) (256.0F * f_26_);
				int i_37_ = (int) (f_27_ * 256.0F);
				int i_38_ = (int) (256.0F * f_28_);
				int i_39_ = i_38_ + ((i_37_ << 8) + ((i_36_ << 16) + -16777216));
				anIntArray8306[i++] = i_39_;
			}
		}
	}

	Class638() throws Throwable {
		throw new Error();
	}

	static void method10488() {
		if (null == Class710.anIntArray8839) {
			Class710.anIntArray8839 = new int[65536];
			anIntArray8307 = new int[65536];
			double d = 0.7 + (Math.random() * 0.03 - 0.015);
			for (int i = 0; i < 65536; i++) {
				double d_40_ = 0.0078125 + (double) (i >> 10 & 0x3f) / 64.0;
				double d_41_ = 0.0625 + (double) (i >> 7 & 0x7) / 8.0;
				double d_42_ = (double) (i & 0x7f) / 128.0;
				double d_43_ = d_42_;
				double d_44_ = d_42_;
				double d_45_ = d_42_;
				if (0.0 != d_41_) {
					double d_46_;
					if (d_42_ < 0.5)
						d_46_ = d_42_ * (1.0 + d_41_);
					else
						d_46_ = d_41_ + d_42_ - d_41_ * d_42_;
					double d_47_ = 2.0 * d_42_ - d_46_;
					double d_48_ = d_40_ + 0.3333333333333333;
					if (d_48_ > 1.0)
						d_48_--;
					double d_49_ = d_40_;
					double d_50_ = d_40_ - 0.3333333333333333;
					if (d_50_ < 0.0)
						d_50_++;
					if (d_48_ * 6.0 < 1.0)
						d_43_ = d_47_ + 6.0 * (d_46_ - d_47_) * d_48_;
					else if (d_48_ * 2.0 < 1.0)
						d_43_ = d_46_;
					else if (d_48_ * 3.0 < 2.0)
						d_43_ = 6.0 * ((d_46_ - d_47_) * (0.6666666666666666 - d_48_)) + d_47_;
					else
						d_43_ = d_47_;
					if (d_49_ * 6.0 < 1.0)
						d_44_ = d_47_ + 6.0 * (d_46_ - d_47_) * d_49_;
					else if (2.0 * d_49_ < 1.0)
						d_44_ = d_46_;
					else if (d_49_ * 3.0 < 2.0)
						d_44_ = d_47_ + 6.0 * ((0.6666666666666666 - d_49_) * (d_46_ - d_47_));
					else
						d_44_ = d_47_;
					if (d_50_ * 6.0 < 1.0)
						d_45_ = d_47_ + 6.0 * (d_46_ - d_47_) * d_50_;
					else if (2.0 * d_50_ < 1.0)
						d_45_ = d_46_;
					else if (3.0 * d_50_ < 2.0)
						d_45_ = d_47_ + ((0.6666666666666666 - d_50_) * (d_46_ - d_47_) * 6.0);
					else
						d_45_ = d_47_;
				}
				d_43_ = Math.pow(d_43_, d);
				d_44_ = Math.pow(d_44_, d);
				d_45_ = Math.pow(d_45_, d);
				int i_51_ = (int) (256.0 * d_43_);
				int i_52_ = (int) (256.0 * d_44_);
				int i_53_ = (int) (256.0 * d_45_);
				int i_54_ = (i_52_ << 8) + (i_51_ << 16) + i_53_;
				Class710.anIntArray8839[i] = i_54_ & 0xffffff;
				int i_55_ = (i_53_ << 16) + (i_52_ << 8) + i_51_;
				anIntArray8307[i] = i_55_;
			}
		}
	}

	static void method10489() {
		if (null == Class710.anIntArray8839) {
			Class710.anIntArray8839 = new int[65536];
			anIntArray8307 = new int[65536];
			double d = 0.7 + (Math.random() * 0.03 - 0.015);
			for (int i = 0; i < 65536; i++) {
				double d_56_ = 0.0078125 + (double) (i >> 10 & 0x3f) / 64.0;
				double d_57_ = 0.0625 + (double) (i >> 7 & 0x7) / 8.0;
				double d_58_ = (double) (i & 0x7f) / 128.0;
				double d_59_ = d_58_;
				double d_60_ = d_58_;
				double d_61_ = d_58_;
				if (0.0 != d_57_) {
					double d_62_;
					if (d_58_ < 0.5)
						d_62_ = d_58_ * (1.0 + d_57_);
					else
						d_62_ = d_57_ + d_58_ - d_57_ * d_58_;
					double d_63_ = 2.0 * d_58_ - d_62_;
					double d_64_ = d_56_ + 0.3333333333333333;
					if (d_64_ > 1.0)
						d_64_--;
					double d_65_ = d_56_;
					double d_66_ = d_56_ - 0.3333333333333333;
					if (d_66_ < 0.0)
						d_66_++;
					if (d_64_ * 6.0 < 1.0)
						d_59_ = d_63_ + 6.0 * (d_62_ - d_63_) * d_64_;
					else if (d_64_ * 2.0 < 1.0)
						d_59_ = d_62_;
					else if (d_64_ * 3.0 < 2.0)
						d_59_ = 6.0 * ((d_62_ - d_63_) * (0.6666666666666666 - d_64_)) + d_63_;
					else
						d_59_ = d_63_;
					if (d_65_ * 6.0 < 1.0)
						d_60_ = d_63_ + 6.0 * (d_62_ - d_63_) * d_65_;
					else if (2.0 * d_65_ < 1.0)
						d_60_ = d_62_;
					else if (d_65_ * 3.0 < 2.0)
						d_60_ = d_63_ + 6.0 * ((0.6666666666666666 - d_65_) * (d_62_ - d_63_));
					else
						d_60_ = d_63_;
					if (d_66_ * 6.0 < 1.0)
						d_61_ = d_63_ + 6.0 * (d_62_ - d_63_) * d_66_;
					else if (2.0 * d_66_ < 1.0)
						d_61_ = d_62_;
					else if (3.0 * d_66_ < 2.0)
						d_61_ = d_63_ + ((0.6666666666666666 - d_66_) * (d_62_ - d_63_) * 6.0);
					else
						d_61_ = d_63_;
				}
				d_59_ = Math.pow(d_59_, d);
				d_60_ = Math.pow(d_60_, d);
				d_61_ = Math.pow(d_61_, d);
				int i_67_ = (int) (256.0 * d_59_);
				int i_68_ = (int) (256.0 * d_60_);
				int i_69_ = (int) (256.0 * d_61_);
				int i_70_ = (i_68_ << 8) + (i_67_ << 16) + i_69_;
				Class710.anIntArray8839[i] = i_70_ & 0xffffff;
				int i_71_ = (i_69_ << 16) + (i_68_ << 8) + i_67_;
				anIntArray8307[i] = i_71_;
			}
		}
	}

	public static int method10490(int i) {
		double d = (double) (i >> 16 & 0xff) / 256.0;
		double d_72_ = (double) (i >> 8 & 0xff) / 256.0;
		double d_73_ = (double) (i & 0xff) / 256.0;
		double d_74_ = d;
		if (d_72_ < d_74_)
			d_74_ = d_72_;
		if (d_73_ < d_74_)
			d_74_ = d_73_;
		double d_75_ = d;
		if (d_72_ > d_75_)
			d_75_ = d_72_;
		if (d_73_ > d_75_)
			d_75_ = d_73_;
		double d_76_ = 0.0;
		double d_77_ = 0.0;
		double d_78_ = (d_74_ + d_75_) / 2.0;
		if (d_74_ != d_75_) {
			if (d_78_ < 0.5)
				d_77_ = (d_75_ - d_74_) / (d_74_ + d_75_);
			if (d_78_ >= 0.5)
				d_77_ = (d_75_ - d_74_) / (2.0 - d_75_ - d_74_);
			if (d_75_ == d)
				d_76_ = (d_72_ - d_73_) / (d_75_ - d_74_);
			else if (d_75_ == d_72_)
				d_76_ = (d_73_ - d) / (d_75_ - d_74_) + 2.0;
			else if (d_73_ == d_75_)
				d_76_ = (d - d_72_) / (d_75_ - d_74_) + 4.0;
		}
		d_76_ /= 6.0;
		int i_79_ = (int) (256.0 * d_76_);
		int i_80_ = (int) (256.0 * d_77_);
		int i_81_ = (int) (256.0 * d_78_);
		if (i_80_ < 0)
			i_80_ = 0;
		else if (i_80_ > 255)
			i_80_ = 255;
		if (i_81_ < 0)
			i_81_ = 0;
		else if (i_81_ > 255)
			i_81_ = 255;
		if (i_81_ > 243)
			i_80_ >>= 4;
		else if (i_81_ > 217)
			i_80_ >>= 3;
		else if (i_81_ > 192)
			i_80_ >>= 2;
		else if (i_81_ > 179)
			i_80_ >>= 1;
		return ((i_79_ & 0xff) >> 2 << 10) + (i_80_ >> 5 << 7) + (i_81_ >> 1);
	}

	public static int method10491(int i, int i_82_) {
		int i_83_ = i_82_ >>> 24;
		int i_84_ = 255 - i_83_;
		i_82_ = ((i_82_ & 0xff00ff) * i_83_ & ~0xff00ff | i_83_ * (i_82_ & 0xff00) & 0xff0000) >>> 8;
		return i_82_ + (((i & 0xff00ff) * i_84_ & ~0xff00ff | i_84_ * (i & 0xff00) & 0xff0000) >>> 8);
	}

	public static void method10492(boolean bool, boolean bool_85_) {
		if (bool) {
			anInt8309 -= 1410281817;
			if (0 == -157022487 * anInt8309)
				anIntArray8306 = null;
		}
		if (bool_85_) {
			anInt8308 -= -636711061;
			if (0 == anInt8308 * 1156851011)
				Class710.anIntArray8839 = null;
		}
	}

	public static int method10493(int i, int i_86_, int i_87_) {
		int i_88_ = 255 - i_87_;
		i_86_ = ((i_86_ & 0xff00ff) * i_87_ & ~0xff00ff | i_87_ * (i_86_ & 0xff00) & 0xff0000) >>> 8;
		return ((((i & 0xff00ff) * i_88_ & ~0xff00ff | i_88_ * (i & 0xff00) & 0xff0000) >>> 8) + i_86_);
	}

	public static int method10494(int i, int i_89_, int i_90_) {
		int i_91_ = 255 - i_90_;
		i_89_ = ((i_89_ & 0xff00ff) * i_90_ & ~0xff00ff | i_90_ * (i_89_ & 0xff00) & 0xff0000) >>> 8;
		return ((((i & 0xff00ff) * i_91_ & ~0xff00ff | i_91_ * (i & 0xff00) & 0xff0000) >>> 8) + i_89_);
	}

	public static void method10495(boolean bool, boolean bool_92_) {
		if (bool) {
			anInt8309 -= 1410281817;
			if (0 == -157022487 * anInt8309)
				anIntArray8306 = null;
		}
		if (bool_92_) {
			anInt8308 -= -636711061;
			if (0 == anInt8308 * 1156851011)
				Class710.anIntArray8839 = null;
		}
	}

	public static int method10496(int i, int i_93_, float f) {
		return Class381.method6408(i, i_93_, (int) f, -1696844738);
	}

	public static int method10497(int i, int i_94_, float f) {
		return Class381.method6408(i, i_94_, (int) f, -1808992769);
	}

	public static int method10498(int i, int i_95_, float f) {
		return Class381.method6408(i, i_95_, (int) f, -553299943);
	}

	public static final int method10499(int i, int i_96_) {
		if (i == -1)
			return 12345678;
		i_96_ = (i & 0x7f) * i_96_ >> 7;
		if (i_96_ < 2)
			i_96_ = 2;
		else if (i_96_ > 126)
			i_96_ = 126;
		return (i & 0xff80) + i_96_;
	}

	public static int method10500(int i) {
		double d = (double) (i >> 16 & 0xff) / 256.0;
		double d_97_ = (double) (i >> 8 & 0xff) / 256.0;
		double d_98_ = (double) (i & 0xff) / 256.0;
		double d_99_ = d;
		if (d_97_ < d_99_)
			d_99_ = d_97_;
		if (d_98_ < d_99_)
			d_99_ = d_98_;
		double d_100_ = d;
		if (d_97_ > d_100_)
			d_100_ = d_97_;
		if (d_98_ > d_100_)
			d_100_ = d_98_;
		double d_101_ = 0.0;
		double d_102_ = 0.0;
		double d_103_ = (d_99_ + d_100_) / 2.0;
		if (d_99_ != d_100_) {
			if (d_103_ < 0.5)
				d_102_ = (d_100_ - d_99_) / (d_99_ + d_100_);
			if (d_103_ >= 0.5)
				d_102_ = (d_100_ - d_99_) / (2.0 - d_100_ - d_99_);
			if (d_100_ == d)
				d_101_ = (d_97_ - d_98_) / (d_100_ - d_99_);
			else if (d_100_ == d_97_)
				d_101_ = (d_98_ - d) / (d_100_ - d_99_) + 2.0;
			else if (d_98_ == d_100_)
				d_101_ = (d - d_97_) / (d_100_ - d_99_) + 4.0;
		}
		d_101_ /= 6.0;
		int i_104_ = (int) (256.0 * d_101_);
		int i_105_ = (int) (256.0 * d_102_);
		int i_106_ = (int) (256.0 * d_103_);
		if (i_105_ < 0)
			i_105_ = 0;
		else if (i_105_ > 255)
			i_105_ = 255;
		if (i_106_ < 0)
			i_106_ = 0;
		else if (i_106_ > 255)
			i_106_ = 255;
		if (i_106_ > 243)
			i_105_ >>= 4;
		else if (i_106_ > 217)
			i_105_ >>= 3;
		else if (i_106_ > 192)
			i_105_ >>= 2;
		else if (i_106_ > 179)
			i_105_ >>= 1;
		return (((i_104_ & 0xff) >> 2 << 10) + (i_105_ >> 5 << 7) + (i_106_ >> 1));
	}

	public static int method10501(int i) {
		double d = (double) (i >> 16 & 0xff) / 256.0;
		double d_107_ = (double) (i >> 8 & 0xff) / 256.0;
		double d_108_ = (double) (i & 0xff) / 256.0;
		double d_109_ = d;
		if (d_107_ < d_109_)
			d_109_ = d_107_;
		if (d_108_ < d_109_)
			d_109_ = d_108_;
		double d_110_ = d;
		if (d_107_ > d_110_)
			d_110_ = d_107_;
		if (d_108_ > d_110_)
			d_110_ = d_108_;
		double d_111_ = 0.0;
		double d_112_ = 0.0;
		double d_113_ = (d_109_ + d_110_) / 2.0;
		if (d_109_ != d_110_) {
			if (d_113_ < 0.5)
				d_112_ = (d_110_ - d_109_) / (d_109_ + d_110_);
			if (d_113_ >= 0.5)
				d_112_ = (d_110_ - d_109_) / (2.0 - d_110_ - d_109_);
			if (d_110_ == d)
				d_111_ = (d_107_ - d_108_) / (d_110_ - d_109_);
			else if (d_110_ == d_107_)
				d_111_ = (d_108_ - d) / (d_110_ - d_109_) + 2.0;
			else if (d_108_ == d_110_)
				d_111_ = (d - d_107_) / (d_110_ - d_109_) + 4.0;
		}
		d_111_ /= 6.0;
		int i_114_ = (int) (256.0 * d_111_);
		int i_115_ = (int) (256.0 * d_112_);
		int i_116_ = (int) (256.0 * d_113_);
		if (i_115_ < 0)
			i_115_ = 0;
		else if (i_115_ > 255)
			i_115_ = 255;
		if (i_116_ < 0)
			i_116_ = 0;
		else if (i_116_ > 255)
			i_116_ = 255;
		if (i_116_ > 243)
			i_115_ >>= 4;
		else if (i_116_ > 217)
			i_115_ >>= 3;
		else if (i_116_ > 192)
			i_115_ >>= 2;
		else if (i_116_ > 179)
			i_115_ >>= 1;
		return (((i_114_ & 0xff) >> 2 << 10) + (i_115_ >> 5 << 7) + (i_116_ >> 1));
	}

	public static int method10502(int i, int i_117_, int i_118_) {
		int i_119_ = 255 - i_118_;
		i_117_ = ((i_117_ & 0xff00ff) * i_118_ & ~0xff00ff | i_118_ * (i_117_ & 0xff00) & 0xff0000) >>> 8;
		return ((((i & 0xff00ff) * i_119_ & ~0xff00ff | i_119_ * (i & 0xff00) & 0xff0000) >>> 8) + i_117_);
	}

	public static int method10503(int i, int i_120_, int i_121_) {
		int i_122_ = 255 - i_121_;
		i_120_ = ((i_120_ & 0xff00ff) * i_121_ & ~0xff00ff | i_121_ * (i_120_ & 0xff00) & 0xff0000) >>> 8;
		return ((((i & 0xff00ff) * i_122_ & ~0xff00ff | i_122_ * (i & 0xff00) & 0xff0000) >>> 8) + i_120_);
	}

	public static final int method10504(int i, int i_123_) {
		if (i == -1)
			return 12345678;
		i_123_ = (i & 0x7f) * i_123_ >> 7;
		if (i_123_ < 2)
			i_123_ = 2;
		else if (i_123_ > 126)
			i_123_ = 126;
		return (i & 0xff80) + i_123_;
	}

	static void method10505() {
		if (null == Class710.anIntArray8839) {
			Class710.anIntArray8839 = new int[65536];
			anIntArray8307 = new int[65536];
			double d = 0.7 + (Math.random() * 0.03 - 0.015);
			for (int i = 0; i < 65536; i++) {
				double d_124_ = 0.0078125 + (double) (i >> 10 & 0x3f) / 64.0;
				double d_125_ = 0.0625 + (double) (i >> 7 & 0x7) / 8.0;
				double d_126_ = (double) (i & 0x7f) / 128.0;
				double d_127_ = d_126_;
				double d_128_ = d_126_;
				double d_129_ = d_126_;
				if (0.0 != d_125_) {
					double d_130_;
					if (d_126_ < 0.5)
						d_130_ = d_126_ * (1.0 + d_125_);
					else
						d_130_ = d_125_ + d_126_ - d_125_ * d_126_;
					double d_131_ = 2.0 * d_126_ - d_130_;
					double d_132_ = d_124_ + 0.3333333333333333;
					if (d_132_ > 1.0)
						d_132_--;
					double d_133_ = d_124_;
					double d_134_ = d_124_ - 0.3333333333333333;
					if (d_134_ < 0.0)
						d_134_++;
					if (d_132_ * 6.0 < 1.0)
						d_127_ = d_131_ + 6.0 * (d_130_ - d_131_) * d_132_;
					else if (d_132_ * 2.0 < 1.0)
						d_127_ = d_130_;
					else if (d_132_ * 3.0 < 2.0)
						d_127_ = 6.0 * ((d_130_ - d_131_) * (0.6666666666666666 - d_132_)) + d_131_;
					else
						d_127_ = d_131_;
					if (d_133_ * 6.0 < 1.0)
						d_128_ = d_131_ + 6.0 * (d_130_ - d_131_) * d_133_;
					else if (2.0 * d_133_ < 1.0)
						d_128_ = d_130_;
					else if (d_133_ * 3.0 < 2.0)
						d_128_ = d_131_ + 6.0 * ((0.6666666666666666 - d_133_) * (d_130_ - d_131_));
					else
						d_128_ = d_131_;
					if (d_134_ * 6.0 < 1.0)
						d_129_ = d_131_ + 6.0 * (d_130_ - d_131_) * d_134_;
					else if (2.0 * d_134_ < 1.0)
						d_129_ = d_130_;
					else if (3.0 * d_134_ < 2.0)
						d_129_ = d_131_ + ((0.6666666666666666 - d_134_) * (d_130_ - d_131_) * 6.0);
					else
						d_129_ = d_131_;
				}
				d_127_ = Math.pow(d_127_, d);
				d_128_ = Math.pow(d_128_, d);
				d_129_ = Math.pow(d_129_, d);
				int i_135_ = (int) (256.0 * d_127_);
				int i_136_ = (int) (256.0 * d_128_);
				int i_137_ = (int) (256.0 * d_129_);
				int i_138_ = (i_136_ << 8) + (i_135_ << 16) + i_137_;
				Class710.anIntArray8839[i] = i_138_ & 0xffffff;
				int i_139_ = (i_137_ << 16) + (i_136_ << 8) + i_135_;
				anIntArray8307[i] = i_139_;
			}
		}
	}

	public static final int method10506(int i, int i_140_) {
		if (i == -2)
			return 12345678;
		if (i == -1) {
			if (i_140_ < 2)
				i_140_ = 2;
			else if (i_140_ > 126)
				i_140_ = 126;
			return i_140_;
		}
		i_140_ = i_140_ * (i & 0x7f) >> 7;
		if (i_140_ < 2)
			i_140_ = 2;
		else if (i_140_ > 126)
			i_140_ = 126;
		return (i & 0xff80) + i_140_;
	}

	public static final int method10507(int i, int i_141_) {
		if (i == -2)
			return 12345678;
		if (i == -1) {
			if (i_141_ < 2)
				i_141_ = 2;
			else if (i_141_ > 126)
				i_141_ = 126;
			return i_141_;
		}
		i_141_ = i_141_ * (i & 0x7f) >> 7;
		if (i_141_ < 2)
			i_141_ = 2;
		else if (i_141_ > 126)
			i_141_ = 126;
		return (i & 0xff80) + i_141_;
	}

	public static int method10508(int i) {
		double d = (double) (i >> 16 & 0xff) / 256.0;
		double d_142_ = (double) (i >> 8 & 0xff) / 256.0;
		double d_143_ = (double) (i & 0xff) / 256.0;
		double d_144_ = d;
		if (d_142_ < d_144_)
			d_144_ = d_142_;
		if (d_143_ < d_144_)
			d_144_ = d_143_;
		double d_145_ = d;
		if (d_142_ > d_145_)
			d_145_ = d_142_;
		if (d_143_ > d_145_)
			d_145_ = d_143_;
		double d_146_ = 0.0;
		double d_147_ = 0.0;
		double d_148_ = (d_144_ + d_145_) / 2.0;
		if (d_144_ != d_145_) {
			if (d_148_ < 0.5)
				d_147_ = (d_145_ - d_144_) / (d_144_ + d_145_);
			if (d_148_ >= 0.5)
				d_147_ = (d_145_ - d_144_) / (2.0 - d_145_ - d_144_);
			if (d_145_ == d)
				d_146_ = (d_142_ - d_143_) / (d_145_ - d_144_);
			else if (d_145_ == d_142_)
				d_146_ = (d_143_ - d) / (d_145_ - d_144_) + 2.0;
			else if (d_143_ == d_145_)
				d_146_ = (d - d_142_) / (d_145_ - d_144_) + 4.0;
		}
		d_146_ /= 6.0;
		int i_149_ = (int) (256.0 * d_146_);
		int i_150_ = (int) (256.0 * d_147_);
		int i_151_ = (int) (256.0 * d_148_);
		if (i_150_ < 0)
			i_150_ = 0;
		else if (i_150_ > 255)
			i_150_ = 255;
		if (i_151_ < 0)
			i_151_ = 0;
		else if (i_151_ > 255)
			i_151_ = 255;
		if (i_151_ > 243)
			i_150_ >>= 4;
		else if (i_151_ > 217)
			i_150_ >>= 3;
		else if (i_151_ > 192)
			i_150_ >>= 2;
		else if (i_151_ > 179)
			i_150_ >>= 1;
		return (((i_149_ & 0xff) >> 2 << 10) + (i_150_ >> 5 << 7) + (i_151_ >> 1));
	}

	public static final int method10509(int i, int i_152_, int i_153_) {
		if (i_153_ > 243)
			i_152_ >>= 4;
		else if (i_153_ > 217)
			i_152_ >>= 3;
		else if (i_153_ > 192)
			i_152_ >>= 2;
		else if (i_153_ > 179)
			i_152_ >>= 1;
		return (i_152_ >> 5 << 7) + ((i & 0xff) >> 2 << 10) + (i_153_ >> 1);
	}

	static final void method10510(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		if (class250.anInt2680 * -1878986101 != -1)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class250.anInt2681 * -1263698325;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	static final void method10511(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class650.method10623(class250, class669, 365525909);
	}

	public static boolean method10512(int i, byte i_154_) {
		if (i != Class191.anInt2155 * -655720215 || Class481.aClass195_5474 == null) {
			Class112.method1945(452998539);
			Class481.aClass195_5474 = Class195.aClass195_2189;
			Class191.anInt2155 = 1159354201 * i;
		}
		if (Class195.aClass195_2189 == Class481.aClass195_5474) {
			byte[] is = Class291.aClass472_3154.method7721(i, -387132909);
			if (is == null)
				return false;
			RSBuffer class523_sub34 = new RSBuffer(is);
			Class326_Sub2.method15591(class523_sub34, 666968460);
			int i_155_ = class523_sub34.readUnsignedByte(510261562);
			for (int i_156_ = 0; i_156_ < i_155_; i_156_++)
				Class191.aClass708_2159.method14236(new Class523_Sub11(class523_sub34), 321020892);
			int i_157_ = class523_sub34.readUnsignedSmart(368514876);
			Class191.aClass204Array2168 = new Class204[i_157_];
			for (int i_158_ = 0; i_158_ < i_157_; i_158_++)
				Class191.aClass204Array2168[i_158_] = new Class204(class523_sub34);
			int i_159_ = class523_sub34.readUnsignedSmart(368514876);
			Class191.aClass192Array2157 = new Class192[i_159_];
			for (int i_160_ = 0; i_160_ < i_159_; i_160_++)
				Class191.aClass192Array2157[i_160_] = new Class192(class523_sub34, i_160_);
			int i_161_ = class523_sub34.readUnsignedSmart(368514876);
			Class191.aClass190Array2158 = new Class190[i_161_];
			for (int i_162_ = 0; i_162_ < i_161_; i_162_++)
				Class191.aClass190Array2158[i_162_] = new Class190(class523_sub34);
			int i_163_ = class523_sub34.readUnsignedSmart(368514876);
			Class191.aClass206Array2166 = new Class206[i_163_];
			for (int i_164_ = 0; i_164_ < i_163_; i_164_++)
				Class191.aClass206Array2166[i_164_] = new Class206(class523_sub34);
			int i_165_ = class523_sub34.readUnsignedSmart(368514876);
			Class174.aClass194Array1855 = new Class194[i_165_];
			for (int i_166_ = 0; i_166_ < i_165_; i_166_++)
				Class174.aClass194Array1855[i_166_] = Class423.method6718(class523_sub34, (byte) 19);
			Class481.aClass195_5474 = Class195.aClass195_2190;
		}
		if (Class481.aClass195_5474 == Class195.aClass195_2190) {
			boolean bool = true;
			Class192[] class192s = Class191.aClass192Array2157;
			for (int i_167_ = 0; i_167_ < class192s.length; i_167_++) {
				Class192 class192 = class192s[i_167_];
				if (!class192.method3632(208226671))
					bool = false;
			}
			Class194[] class194s = Class174.aClass194Array1855;
			for (int i_168_ = 0; i_168_ < class194s.length; i_168_++) {
				Class194 class194 = class194s[i_168_];
				if (!class194.method3650(1346035807))
					bool = false;
			}
			Class190[] class190s = Class191.aClass190Array2158;
			for (int i_169_ = 0; i_169_ < class190s.length; i_169_++) {
				Class190 class190 = class190s[i_169_];
				if (!class190.method3605((byte) 105))
					bool = false;
			}
			if (!bool)
				return false;
			Class481.aClass195_5474 = Class195.aClass195_2188;
		}
		return true;
	}

	static final void method10513(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -2122979607 * Compression.anInt4955;
	}

	static final void method10514(Class669 class669, int i) {
		Class36.anInt354 = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) * -875055733;
	}

	static Class75[] method10515(byte i) {
		return new Class75[] { Class75.aClass75_830, Class75.aClass75_842, Class75.aClass75_834, Class75.aClass75_825, Class75.aClass75_838, Class75.aClass75_846, Class75.aClass75_836, Class75.aClass75_827, Class75.aClass75_820, Class75.aClass75_829, Class75.aClass75_843, Class75.aClass75_832, Class75.aClass75_821, Class75.aClass75_831, Class75.aClass75_818, Class75.aClass75_826, Class75.aClass75_828, Class75.aClass75_848, Class75.aClass75_817, Class75.aClass75_823, Class75.aClass75_822, Class75.aClass75_841, Class75.aClass75_819, Class75.aClass75_824, Class75.aClass75_840, Class75.aClass75_833, Class75.aClass75_816, Class75.aClass75_835, Class75.aClass75_839, Class75.aClass75_844, Class75.aClass75_845 };
	}

	static final void method10516(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_170_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_171_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1];
		Class45.method1237(i_170_, new Class523_Sub36(i_171_, 3), null, true, 581794136);
	}
}
