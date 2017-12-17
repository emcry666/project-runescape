/* Class178_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;

public class Class178_Sub3 extends Class178 {
	int anInt9801;
	int anInt9802;
	boolean aBool9803;
	int[] anIntArray9804;
	Class441 aClass441_9805;
	int anInt9806;
	float[] aFloatArray9807;
	Class209 aClass209_9808;
	int anInt9809;
	int anInt9810;
	Class441 aClass441_9811;
	boolean aBool9812 = false;
	int anInt9813;
	Class148 aClass148_9814;
	int anInt9815;
	int anInt9816;
	int anInt9817;
	Class435 aClass435_9818;
	int anInt9819;
	int anInt9820;
	Class441 aClass441_9821;
	float[][] aFloatArrayArray9822;
	int anInt9823;
	int anInt9824;
	int anInt9825;
	int anInt9826;
	float aFloat9827;
	float aFloat9828;
	float aFloat9829;
	float aFloat9830;
	int anInt9831;
	float aFloat9832;
	float aFloat9833;
	int anInt9834;
	Class209 aClass209_9835;
	Class99[] aClass99Array9836;
	Class148 aClass148_9837;
	int anInt9838;
	int anInt9839;
	Class168_Sub1 aClass168_Sub1_9840;
	public static int anInt9841;

	public Class441 method3446() {
		Class99 class99 = method15475(Thread.currentThread());
		return class99.aClass441_1198;
	}

	Class178_Sub3(Class172 class172, Interface25 interface25, Interface46 interface46, Interface48 interface48, Interface45 interface45) {
		super(class172, interface25, interface46, interface48, interface45);
		aBool9803 = false;
		anInt9815 = 0;
		anInt9809 = 0;
		anInt9810 = 0;
		anInt9826 = 0;
		anInt9831 = -1139691531;
		anInt9816 = -798926618;
		anInt9817 = -2043275926;
		aFloatArrayArray9822 = new float[6][4];
		aFloat9833 = 1.0F;
		aFloat9832 = 0.0F;
		aClass209_9835 = new Class209(16);
		anInt9838 = 646371375;
		try {
			aClass209_9808 = new Class209(10485760, 256);
			aClass435_9818 = new Class435();
			aClass441_9811 = new Class441();
			aClass441_9805 = new Class441();
			aClass441_9821 = new Class441();
			method15426(1);
			method15425(0);
			Class226.method4166(true, true, 240723773);
			aBool9803 = true;
			anInt9802 = (int) Class248.method4401(1516375036) * 447737649;
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method3024(1118931031);
			throw new RuntimeException("");
		}
	}

	public void method3092(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, Class145 class145, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
		if (null != anIntArray9804) {
			Class145_Sub1 class145_sub1 = (Class145_Sub1) class145;
			int[] is = class145_sub1.anIntArray9521;
			int[] is_10_ = class145_sub1.anIntArray9520;
			int i_11_ = (anInt9810 * -695823527 > i_6_ ? anInt9810 * -695823527 : i_6_);
			int i_12_ = (anInt9826 * 489020741 < i_6_ + is.length ? anInt9826 * 489020741 : i_6_ + is.length);
			i_9_ <<= 8;
			i_7_ <<= 8;
			i_8_ <<= 8;
			int i_13_ = i_8_ + i_7_;
			i_9_ %= i_13_;
			i_1_ -= i;
			i_2_ -= i_0_;
			if (i_2_ + i_1_ < 0) {
				int i_14_ = (int) (Math.sqrt((double) (i_2_ * i_2_ + i_1_ * i_1_)) * 256.0);
				int i_15_ = i_14_ % i_13_;
				i_9_ = i_7_ + i_13_ - i_9_ - i_15_;
				i_9_ %= i_13_;
				if (i_9_ < 0)
					i_9_ += i_13_;
				i += i_1_;
				i_1_ = -i_1_;
				i_0_ += i_2_;
				i_2_ = -i_2_;
			}
			if (i_1_ > i_2_) {
				i_0_ <<= 16;
				i_0_ += 32768;
				i_2_ <<= 16;
				int i_16_ = (int) Math.floor(0.5 + (double) i_2_ / (double) i_1_);
				i_1_ += i;
				int i_17_ = i_3_ >>> 24;
				int i_18_ = (int) Math.sqrt((double) (65536 + (i_16_ >> 8) * (i_16_ >> 8)));
				if (i_4_ == 0 || 1 == i_4_ && 255 == i_17_) {
					while (i <= i_1_) {
						int i_19_ = i_0_ >> 16;
						int i_20_ = i_19_ - i_6_;
						if (i >= -1373518821 * anInt9815 && i < -272361347 * anInt9809 && i_19_ >= i_11_ && i_19_ < i_12_ && i_9_ < i_7_) {
							int i_21_ = is[i_20_] + i_5_;
							if (i >= i_21_ && i < is_10_[i_20_] + i_21_)
								anIntArray9804[(1013077751 * anInt9825 * i_19_ + i)] = i_3_;
						}
						i_0_ += i_16_;
						i++;
						i_9_ += i_18_;
						i_9_ %= i_13_;
					}
				} else if (i_4_ == 1) {
					i_3_ = ((i_17_ * (i_3_ & 0xff00) >> 8 & 0xff00) + (i_17_ * (i_3_ & 0xff00ff) >> 8 & 0xff00ff) + (i_17_ << 24));
					int i_22_ = 256 - i_17_;
					while (i <= i_1_) {
						int i_23_ = i_0_ >> 16;
						int i_24_ = i_23_ - i_6_;
						if (i >= anInt9815 * -1373518821 && i < anInt9809 * -272361347 && i_23_ >= i_11_ && i_23_ < i_12_ && i_9_ < i_7_) {
							int i_25_ = is[i_24_] + i_5_;
							if (i >= i_25_ && i < i_25_ + is_10_[i_24_]) {
								int i_26_ = i_23_ * (1013077751 * anInt9825) + i;
								int i_27_ = anIntArray9804[i_26_];
								i_27_ = (((i_27_ & 0xff00ff) * i_22_ >> 8 & 0xff00ff) + ((i_27_ & 0xff00) * i_22_ >> 8 & 0xff00));
								anIntArray9804[i_26_] = i_27_ + i_3_;
							}
						}
						i_0_ += i_16_;
						i++;
						i_9_ += i_18_;
						i_9_ %= i_13_;
					}
				} else if (2 == i_4_) {
					while (i <= i_1_) {
						int i_28_ = i_0_ >> 16;
						int i_29_ = i_28_ - i_6_;
						if (i >= anInt9815 * -1373518821 && i < anInt9809 * -272361347 && i_28_ >= i_11_ && i_28_ < i_12_ && i_9_ < i_7_) {
							int i_30_ = is[i_29_] + i_5_;
							if (i >= i_30_ && i < is_10_[i_29_] + i_30_) {
								int i_31_ = i_28_ * (1013077751 * anInt9825) + i;
								int i_32_ = anIntArray9804[i_31_];
								int i_33_ = i_32_ + i_3_;
								int i_34_ = (i_3_ & 0xff00ff) + (i_32_ & 0xff00ff);
								i_32_ = ((i_33_ - i_34_ & 0x10000) + (i_34_ & 0x1000100));
								anIntArray9804[i_31_] = i_33_ - i_32_ | i_32_ - (i_32_ >>> 8);
							}
						}
						i_0_ += i_16_;
						i++;
						i_9_ += i_18_;
						i_9_ %= i_13_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_1_ <<= 16;
				int i_35_ = (int) Math.floor((double) i_1_ / (double) i_2_ + 0.5);
				int i_36_ = (int) Math.sqrt((double) (65536 + (i_35_ >> 8) * (i_35_ >> 8)));
				i_2_ += i_0_;
				int i_37_ = i_3_ >>> 24;
				if (i_4_ == 0 || 1 == i_4_ && 255 == i_37_) {
					while (i_0_ <= i_2_) {
						int i_38_ = i >> 16;
						int i_39_ = i_0_ - i_6_;
						if (i_0_ >= i_11_ && i_0_ < i_12_ && i_38_ >= -1373518821 * anInt9815 && i_38_ < -272361347 * anInt9809 && i_9_ < i_7_ && i_38_ >= i_5_ + is[i_39_] && i_38_ < is_10_[i_39_] + (is[i_39_] + i_5_))
							anIntArray9804[i_38_ + i_0_ * (anInt9825 * 1013077751)] = i_3_;
						i += i_35_;
						i_0_++;
						i_9_ += i_36_;
						i_9_ %= i_13_;
					}
				} else if (i_4_ == 1) {
					i_3_ = ((i_37_ << 24) + ((i_37_ * (i_3_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_3_ & 0xff00) * i_37_ >> 8 & 0xff00)));
					int i_40_ = 256 - i_37_;
					while (i_0_ <= i_2_) {
						int i_41_ = i >> 16;
						int i_42_ = i_0_ - i_6_;
						if (i_0_ >= i_11_ && i_0_ < i_12_ && i_41_ >= anInt9815 * -1373518821 && i_41_ < anInt9809 * -272361347 && i_9_ < i_7_ && i_41_ >= is[i_42_] + i_5_ && i_41_ < i_5_ + is[i_42_] + is_10_[i_42_]) {
							int i_43_ = anInt9825 * 1013077751 * i_0_ + i_41_;
							int i_44_ = anIntArray9804[i_43_];
							i_44_ = ((i_40_ * (i_44_ & 0xff00) >> 8 & 0xff00) + (i_40_ * (i_44_ & 0xff00ff) >> 8 & 0xff00ff));
							anIntArray9804[(anInt9825 * 1013077751 * i_0_ + i_41_)] = i_44_ + i_3_;
						}
						i += i_35_;
						i_0_++;
						i_9_ += i_36_;
						i_9_ %= i_13_;
					}
				} else if (2 == i_4_) {
					while (i_0_ <= i_2_) {
						int i_45_ = i >> 16;
						int i_46_ = i_0_ - i_6_;
						if (i_0_ >= i_11_ && i_0_ < i_12_ && i_45_ >= anInt9815 * -1373518821 && i_45_ < anInt9809 * -272361347 && i_9_ < i_7_ && i_45_ >= i_5_ + is[i_46_] && i_45_ < is_10_[i_46_] + (is[i_46_] + i_5_)) {
							int i_47_ = i_0_ * (anInt9825 * 1013077751) + i_45_;
							int i_48_ = anIntArray9804[i_47_];
							int i_49_ = i_48_ + i_3_;
							int i_50_ = (i_3_ & 0xff00ff) + (i_48_ & 0xff00ff);
							i_48_ = (i_50_ & 0x1000100) + (i_49_ - i_50_ & 0x10000);
							anIntArray9804[i_47_] = i_49_ - i_48_ | i_48_ - (i_48_ >>> 8);
						}
						i += i_35_;
						i_0_++;
						i_9_ += i_36_;
						i_9_ %= i_13_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public Class167 method3166(Class179 class179, int i, int i_51_, int i_52_, int i_53_) {
		return new Class167_Sub1(this, class179, i, i_52_, i_53_, i_51_);
	}

	public void method3021() {
		/* empty */
	}

	void method3465(float f, float f_54_, float f_55_, float f_56_, float f_57_, float f_58_) {
		/* empty */
	}

	public void method3428(int i) {
		int i_59_ = i - 1258621393 * anInt9802;
		for (Class523_Sub26 class523_sub26 = (Class523_Sub26) aClass209_9808.method3777(809863981); class523_sub26 != null; class523_sub26 = (Class523_Sub26) aClass209_9808.method3795((byte) 0)) {
			if (class523_sub26.aBool10545) {
				class523_sub26.anInt10548 += i_59_;
				int i_60_ = class523_sub26.anInt10548 / 50;
				if (i_60_ > 0) {
					Class177 class177 = aClass172_1916.method2895(class523_sub26.anInt10549, -1311326012);
					float f = (float) (class177.anInt1913 * 1075916655);
					class523_sub26.method16143((int) (f * ((float) class177.aByte1885 * ((float) i_59_ / 1000.0F) / 64.0F)), (int) (f * ((float) i_59_ / 1000.0F * (float) class177.aByte1886 / 64.0F)));
					class523_sub26.anInt10548 -= i_60_ * 50;
				}
				class523_sub26.aBool10545 = false;
			}
		}
		anInt9802 = i * 447737649;
		aClass209_9835.method3772(5, (byte) -5);
		aClass209_9808.method3772(5, (byte) -25);
	}

	public int method3025() {
		return 0;
	}

	boolean method15412() {
		return aBool9812;
	}

	int[] method15413(int i) {
		Class523_Sub26 class523_sub26;
		synchronized (aClass209_9808) {
			class523_sub26 = ((Class523_Sub26) aClass209_9808.method3767((long) (i & 0xffff) | ~0x7fffffffffffffffL));
			if (null == class523_sub26) {
				Class177 class177 = aClass172_1916.method2895(i, 530545807);
				int i_61_ = class177.anInt1913 * 1075916655;
				if (!anInterface25_1923.method136(Class601.aClass601_7850, i, Class608.aClass608_7988, 0.7F, i_61_, i_61_, true, (short) -11330)) {
					int[] is = null;
					return is;
				}
				int[] is;
				if (Class593.aClass593_7813 != class177.aClass593_1884)
					is = anInterface25_1923.method138(Class601.aClass601_7850, i, 0.7F, i_61_, i_61_, true, 2076028932);
				else
					is = anInterface25_1923.method137(Class601.aClass601_7850, i, 0.7F, i_61_, i_61_, true, (byte) 0);
				class523_sub26 = new Class523_Sub26(i, i_61_, is, (class177.aClass593_1884 != Class593.aClass593_7812));
				aClass209_9808.method3764(class523_sub26, ((long) (i & 0xffff) | ~0x7fffffffffffffffL), i_61_ * i_61_, 1613857545);
			}
		}
		class523_sub26.aBool10545 = true;
		return class523_sub26.method16144();
	}

	boolean method15414(int i) {
		Class177 class177 = aClass172_1916.method2895(i, -164856440);
		return anInterface25_1923.method136(Class601.aClass601_7850, i, Class608.aClass608_7988, 0.7F, 1075916655 * class177.anInt1913, class177.anInt1913 * 1075916655, true, (short) -18280);
	}

	public void method3251(boolean bool) {
		/* empty */
	}

	Class593 method15415(int i) {
		return aClass172_1916.method2895(i, -1204457618).aClass593_1884;
	}

	public void method3054() {
		/* empty */
	}

	int method15416(int i) {
		return aClass172_1916.method2895(i, -1766191451).aShort1907 & 0xffff;
	}

	boolean method15417(int i) {
		Class177 class177 = aClass172_1916.method2895(i, 489780022);
		return 0 != class177.aByte1911 || 0 != class177.aByte1875;
	}

	public void method3391(Class171 class171) {
		method15427(anIntArray9804 != null, null != aFloatArray9807, false, class171);
	}

	public void method3090(int i, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_, Class145 class145, int i_67_, int i_68_) {
		if (anIntArray9804 != null) {
			Class145_Sub1 class145_sub1 = (Class145_Sub1) class145;
			int[] is = class145_sub1.anIntArray9521;
			int[] is_69_ = class145_sub1.anIntArray9520;
			int i_70_ = (-695823527 * anInt9810 > i_68_ ? anInt9810 * -695823527 : i_68_);
			int i_71_ = (anInt9826 * 489020741 < is.length + i_68_ ? anInt9826 * 489020741 : is.length + i_68_);
			i_63_ -= i;
			i_64_ -= i_62_;
			if (i_64_ + i_63_ < 0) {
				i += i_63_;
				i_63_ = -i_63_;
				i_62_ += i_64_;
				i_64_ = -i_64_;
			}
			if (i_63_ > i_64_) {
				i_62_ <<= 16;
				i_62_ += 32768;
				i_64_ <<= 16;
				int i_72_ = (int) Math.floor((double) i_64_ / (double) i_63_ + 0.5);
				i_63_ += i;
				if (i < anInt9815 * -1373518821) {
					i_62_ += i_72_ * (-1373518821 * anInt9815 - i);
					i = -1373518821 * anInt9815;
				}
				if (i_63_ >= -272361347 * anInt9809)
					i_63_ = anInt9809 * -272361347 - 1;
				int i_73_ = i_65_ >>> 24;
				if (0 == i_66_ || i_66_ == 1 && 255 == i_73_) {
					for (/**/; i <= i_63_; i++) {
						int i_74_ = i_62_ >> 16;
						int i_75_ = i_74_ - i_68_;
						if (i_74_ >= i_70_ && i_74_ < i_71_) {
							int i_76_ = i_67_ + is[i_75_];
							if (i >= i_76_ && i < i_76_ + is_69_[i_75_])
								anIntArray9804[i + (anInt9825 * 1013077751 * i_74_)] = i_65_;
						}
						i_62_ += i_72_;
					}
				} else if (i_66_ == 1) {
					i_65_ = ((i_73_ * (i_65_ & 0xff00) >> 8 & 0xff00) + (i_73_ * (i_65_ & 0xff00ff) >> 8 & 0xff00ff) + (i_73_ << 24));
					int i_77_ = 256 - i_73_;
					for (/**/; i <= i_63_; i++) {
						int i_78_ = i_62_ >> 16;
						int i_79_ = i_78_ - i_68_;
						if (i_78_ >= i_70_ && i_78_ < i_71_) {
							int i_80_ = is[i_79_] + i_67_;
							if (i >= i_80_ && i < is_69_[i_79_] + i_80_) {
								int i_81_ = 1013077751 * anInt9825 * i_78_ + i;
								int i_82_ = anIntArray9804[i_81_];
								i_82_ = ((i_77_ * (i_82_ & 0xff00) >> 8 & 0xff00) + (i_77_ * (i_82_ & 0xff00ff) >> 8 & 0xff00ff));
								anIntArray9804[i_81_] = i_82_ + i_65_;
							}
						}
						i_62_ += i_72_;
					}
				} else if (2 == i_66_) {
					for (/**/; i <= i_63_; i++) {
						int i_83_ = i_62_ >> 16;
						int i_84_ = i_83_ - i_68_;
						if (i_83_ >= i_70_ && i_83_ < i_71_) {
							int i_85_ = is[i_84_] + i_67_;
							if (i >= i_85_ && i < i_85_ + is_69_[i_84_]) {
								int i_86_ = i + 1013077751 * anInt9825 * i_83_;
								int i_87_ = anIntArray9804[i_86_];
								int i_88_ = i_65_ + i_87_;
								int i_89_ = (i_65_ & 0xff00ff) + (i_87_ & 0xff00ff);
								i_87_ = ((i_88_ - i_89_ & 0x10000) + (i_89_ & 0x1000100));
								anIntArray9804[i_86_] = i_88_ - i_87_ | i_87_ - (i_87_ >>> 8);
							}
						}
						i_62_ += i_72_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_63_ <<= 16;
				int i_90_ = (int) Math.floor(0.5 + (double) i_63_ / (double) i_64_);
				i_64_ += i_62_;
				if (i_62_ < i_70_) {
					i += (i_70_ - i_62_) * i_90_;
					i_62_ = i_70_;
				}
				if (i_64_ >= i_71_)
					i_64_ = i_71_ - 1;
				int i_91_ = i_65_ >>> 24;
				if (0 == i_66_ || i_66_ == 1 && i_91_ == 255) {
					for (/**/; i_62_ <= i_64_; i_62_++) {
						int i_92_ = i >> 16;
						int i_93_ = i_62_ - i_68_;
						int i_94_ = i_67_ + is[i_93_];
						if (i_92_ >= anInt9815 * -1373518821 && i_92_ < -272361347 * anInt9809 && i_92_ >= i_94_ && i_92_ < i_94_ + is_69_[i_93_])
							anIntArray9804[(i_62_ * (1013077751 * anInt9825) + i_92_)] = i_65_;
						i += i_90_;
					}
				} else if (i_66_ == 1) {
					i_65_ = ((i_91_ * (i_65_ & 0xff00) >> 8 & 0xff00) + ((i_65_ & 0xff00ff) * i_91_ >> 8 & 0xff00ff) + (i_91_ << 24));
					int i_95_ = 256 - i_91_;
					for (/**/; i_62_ <= i_64_; i_62_++) {
						int i_96_ = i >> 16;
						int i_97_ = i_62_ - i_68_;
						int i_98_ = i_67_ + is[i_97_];
						if (i_96_ >= anInt9815 * -1373518821 && i_96_ < anInt9809 * -272361347 && i_96_ >= i_98_ && i_96_ < i_98_ + is_69_[i_97_]) {
							int i_99_ = i_96_ + anInt9825 * 1013077751 * i_62_;
							int i_100_ = anIntArray9804[i_99_];
							i_100_ = (((i_100_ & 0xff00ff) * i_95_ >> 8 & 0xff00ff) + (i_95_ * (i_100_ & 0xff00) >> 8 & 0xff00));
							anIntArray9804[(1013077751 * anInt9825 * i_62_ + i_96_)] = i_100_ + i_65_;
						}
						i += i_90_;
					}
				} else if (2 == i_66_) {
					for (/**/; i_62_ <= i_64_; i_62_++) {
						int i_101_ = i >> 16;
						int i_102_ = i_62_ - i_68_;
						int i_103_ = i_67_ + is[i_102_];
						if (i_101_ >= anInt9815 * -1373518821 && i_101_ < anInt9809 * -272361347 && i_101_ >= i_103_ && i_101_ < i_103_ + is_69_[i_102_]) {
							int i_104_ = i_62_ * (1013077751 * anInt9825) + i_101_;
							int i_105_ = anIntArray9804[i_104_];
							int i_106_ = i_105_ + i_65_;
							int i_107_ = (i_105_ & 0xff00ff) + (i_65_ & 0xff00ff);
							i_105_ = (i_106_ - i_107_ & 0x10000) + (i_107_ & 0x1000100);
							anIntArray9804[i_104_] = i_106_ - i_105_ | i_105_ - (i_105_ >>> 8);
						}
						i += i_90_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public boolean method3244() {
		return true;
	}

	void method15418(int i, int i_108_, int i_109_, int i_110_, int i_111_, int i_112_, int i_113_, int i_114_) {
		if (anIntArray9804 != null && (i >= -1373518821 * anInt9815 && i < -272361347 * anInt9809)) {
			int i_115_ = i + 1013077751 * anInt9825 * i_108_;
			int i_116_ = i_110_ >>> 24;
			int i_117_ = i_112_ + i_113_;
			int i_118_ = i_114_ % i_117_;
			if (i_111_ == 0 || i_111_ == 1 && 255 == i_116_) {
				int i_119_ = 0;
				while (i_119_ < i_109_) {
					if (i_108_ + i_119_ >= anInt9810 * -695823527 && i_119_ + i_108_ < 489020741 * anInt9826 && i_118_ < i_112_)
						anIntArray9804[i_115_ + i_119_ * (anInt9825 * 1013077751)] = i_110_;
					i_119_++;
					i_118_ = ++i_118_ % i_117_;
				}
			} else if (1 == i_111_) {
				i_110_ = (i_116_ << 24) + (((i_110_ & 0xff00) * i_116_ >> 8 & 0xff00) + ((i_110_ & 0xff00ff) * i_116_ >> 8 & 0xff00ff));
				int i_120_ = 256 - i_116_;
				int i_121_ = 0;
				while (i_121_ < i_109_) {
					if (i_108_ + i_121_ >= anInt9810 * -695823527 && i_121_ + i_108_ < anInt9826 * 489020741 && i_118_ < i_112_) {
						int i_122_ = i_115_ + anInt9825 * 1013077751 * i_121_;
						int i_123_ = anIntArray9804[i_122_];
						i_123_ = ((i_120_ * (i_123_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_123_ & 0xff00) * i_120_ >> 8 & 0xff00));
						anIntArray9804[i_122_] = i_110_ + i_123_;
					}
					i_121_++;
					i_118_ = ++i_118_ % i_117_;
				}
			} else if (2 == i_111_) {
				int i_124_ = 0;
				while (i_124_ < i_109_) {
					if (i_124_ + i_108_ >= -695823527 * anInt9810 && i_108_ + i_124_ < anInt9826 * 489020741 && i_118_ < i_112_) {
						int i_125_ = i_124_ * (anInt9825 * 1013077751) + i_115_;
						int i_126_ = anIntArray9804[i_125_];
						int i_127_ = i_126_ + i_110_;
						int i_128_ = (i_126_ & 0xff00ff) + (i_110_ & 0xff00ff);
						i_126_ = (i_127_ - i_128_ & 0x10000) + (i_128_ & 0x1000100);
						anIntArray9804[i_125_] = i_127_ - i_126_ | i_126_ - (i_126_ >>> 8);
					}
					i_124_++;
					i_118_ = ++i_118_ % i_117_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public int[] method3293(int i, int i_129_, int i_130_, int i_131_) {
		if (null == anIntArray9804)
			throw new IllegalStateException("");
		int[] is = new int[i_130_ * i_131_];
		int i_132_ = 0;
		for (int i_133_ = 0; i_133_ < i_131_; i_133_++) {
			int i_134_ = (i_129_ + i_133_) * (1013077751 * anInt9825) + i;
			for (int i_135_ = 0; i_135_ < i_130_; i_135_++)
				is[i_132_++] = anIntArray9804[i_135_ + i_134_];
		}
		return is;
	}

	public boolean method3351() {
		return false;
	}

	public boolean method3032() {
		return false;
	}

	public boolean method3033() {
		return false;
	}

	public boolean method3070() {
		return false;
	}

	public boolean method3035() {
		return true;
	}

	public String method3036() {
		return "";
	}

	public int[] method3418() {
		return null;
	}

	public void method3157(boolean bool) {
		/* empty */
	}

	Class168_Sub2 method3048(Canvas canvas, int i, int i_136_) {
		return Class523_Sub10.method15945(this, canvas, i, i_136_, -249342370);
	}

	void method15419(int i, int i_137_, int[] is, float[] fs) {
		anInt9825 = 791497415 * i;
		anInt9806 = -1989523399 * i_137_;
		anIntArray9804 = is;
		aFloatArray9807 = fs;
		for (int i_138_ = 0; i_138_ < anInt9819 * 1353126165; i_138_++)
			aClass99Array9836[i_138_].method1781((short) 6126);
		method3071();
		method3067();
	}

	public Class164 method3093(Class10 class10, Class175[] class175s, boolean bool) {
		int[] is = new int[class175s.length];
		int[] is_139_ = new int[class175s.length];
		boolean bool_140_ = false;
		boolean bool_141_ = false;
		for (int i = 0; i < class175s.length; i++) {
			is[i] = class175s[i].method2944();
			is_139_[i] = class175s[i].method2945();
			if (class175s[i].method2943())
				bool_140_ = true;
			if (class175s[i].method2942())
				bool_141_ = true;
		}
		if (bool) {
			if (bool_141_) {
				if (bool_140_)
					return new Class164_Sub1(this, class10, (Class175_Sub2[]) class175s, is, is_139_);
				return new Class164_Sub5(this, class10, (Class175_Sub2[]) class175s, is, is_139_);
			}
			if (bool_140_)
				return new Class164_Sub1(this, class10, (Class175_Sub1[]) class175s, is, is_139_);
			return new Class164_Sub5(this, class10, (Class175_Sub1[]) class175s, is, is_139_);
		}
		if (bool_141_) {
			if (bool_140_)
				throw new IllegalArgumentException("");
			return new Class164_Sub2(this, class10, (Class175_Sub2[]) class175s, is, is_139_);
		}
		return new Class164_Sub3(this, class10, (Class175_Sub1[]) class175s, is, is_139_);
	}

	public Class142 method3312(int i, int i_142_, int[][] is, int[][] is_143_, int i_144_, int i_145_, int i_146_) {
		return new Class142_Sub3(this, i_145_, i_146_, i, i_142_, is, is_143_, i_144_);
	}

	public Class435 method3201() {
		return new Class435(aClass435_9818);
	}

	public void method3247(Class435 class435) {
		aClass435_9818 = class435;
		method15429();
	}

	public boolean method3056() {
		return true;
	}

	public boolean method3057() {
		return false;
	}

	public Interface22 method3440(int i, int i_147_, Class158 class158, Class170 class170, int i_148_) {
		return method15432(i, i_147_);
	}

	public int method3059() {
		return -1;
	}

	public int[] method3020(int i, int i_149_, int i_150_, int i_151_) {
		if (null == anIntArray9804)
			throw new IllegalStateException("");
		int[] is = new int[i_150_ * i_151_];
		int i_152_ = 0;
		for (int i_153_ = 0; i_153_ < i_151_; i_153_++) {
			int i_154_ = (i_149_ + i_153_) * (1013077751 * anInt9825) + i;
			for (int i_155_ = 0; i_155_ < i_150_; i_155_++)
				is[i_152_++] = anIntArray9804[i_155_ + i_154_];
		}
		return is;
	}

	public void method3060() {
		/* empty */
	}

	public long method3324(int i, int i_156_) {
		return 0L;
	}

	public void method3063(long l) {
		/* empty */
	}

	public void method3130(int i, int i_157_, int[] is, int[] is_158_) {
		method3161(i, i_157_, -2029213568);
		if (null == aClass148_9814 || aClass148_9814.method2504() != i || aClass148_9814.method2428() != i_157_) {
			aClass148_9814 = method3136(i, i_157_, true, true);
			aClass168_Sub1_9840 = null;
		}
		if (null == aClass168_Sub1_9840) {
			aClass168_Sub1_9840 = method3248();
			aClass168_Sub1_9840.method14424(0, aClass148_9814.method2430());
		}
		Class148_Sub1_Sub1 class148_sub1_sub1 = new Class148_Sub1_Sub1(this, anIntArray9804, anInt9825 * 1013077751, 719529481 * anInt9806);
		method3353(aClass168_Sub1_9840, -1070933429);
		method3076(1, -16777216);
		class148_sub1_sub1.method2461(1970564341 * anInt1945, anInt1937 * 1216763507, -750425387 * anInt1946, -733304105 * anInt1915, 1, 0, 0, 0);
		aClass148_9814.method2432(0, 0, i, i_157_, is, is_158_, 0, i);
		method3047(aClass168_Sub1_9840, (short) -8766);
	}

	public void method3066() {
		aClass168_Sub1_9840 = null;
		aClass148_9814 = null;
	}

	void method15420() {
		if (null != aFloatArray9807) {
			if (anInt9815 * -1373518821 == 0 && -272361347 * anInt9809 == 1013077751 * anInt9825 && 0 == -695823527 * anInt9810 && 489020741 * anInt9826 == 719529481 * anInt9806) {
				int i = aFloatArray9807.length;
				int i_159_ = i - (i & 0x7);
				int i_160_ = 0;
				while (i_160_ < i_159_) {
					aFloatArray9807[i_160_++] = 2.14748365E9F;
					aFloatArray9807[i_160_++] = 2.14748365E9F;
					aFloatArray9807[i_160_++] = 2.14748365E9F;
					aFloatArray9807[i_160_++] = 2.14748365E9F;
					aFloatArray9807[i_160_++] = 2.14748365E9F;
					aFloatArray9807[i_160_++] = 2.14748365E9F;
					aFloatArray9807[i_160_++] = 2.14748365E9F;
					aFloatArray9807[i_160_++] = 2.14748365E9F;
				}
				while (i_160_ < i)
					aFloatArray9807[i_160_++] = 2.14748365E9F;
			} else {
				int i = -272361347 * anInt9809 - anInt9815 * -1373518821;
				int i_161_ = anInt9826 * 489020741 - anInt9810 * -695823527;
				int i_162_ = 1013077751 * anInt9825 - i;
				int i_163_ = (anInt9810 * -695823527 * (anInt9825 * 1013077751) + anInt9815 * -1373518821);
				int i_164_ = i >> 3;
				int i_165_ = i & 0x7;
				i = i_163_ - 1;
				for (int i_166_ = -i_161_; i_166_ < 0; i_166_++) {
					if (i_164_ > 0) {
						int i_167_ = i_164_;
						do {
							aFloatArray9807[++i] = 2.14748365E9F;
							aFloatArray9807[++i] = 2.14748365E9F;
							aFloatArray9807[++i] = 2.14748365E9F;
							aFloatArray9807[++i] = 2.14748365E9F;
							aFloatArray9807[++i] = 2.14748365E9F;
							aFloatArray9807[++i] = 2.14748365E9F;
							aFloatArray9807[++i] = 2.14748365E9F;
							aFloatArray9807[++i] = 2.14748365E9F;
						} while (--i_167_ > 0);
					}
					if (i_165_ > 0) {
						int i_168_ = i_165_;
						do
							aFloatArray9807[++i] = 2.14748365E9F;
						while (--i_168_ > 0);
					}
					i += i_162_;
				}
			}
		}
	}

	public void method3287(boolean bool) {
		Class99 class99 = method15475(Thread.currentThread());
		class99.aBool1186 = bool;
	}

	public void method3067() {
		anInt9823 = 0;
		anInt9824 = 0;
		anInt9801 = 1821988621 * anInt9825;
		anInt9820 = -1729864209 * anInt9806;
		method15452();
	}

	public void method3208(int i, int i_169_, int i_170_, int i_171_) {
		anInt9823 = i * 91490795;
		anInt9824 = i_169_ * 1647470123;
		anInt9801 = 1856335131 * i_170_;
		anInt9820 = i_171_ * 289022519;
		method15452();
	}

	public void method3069(int[] is) {
		is[0] = 1383519939 * anInt9823;
		is[1] = -1740822397 * anInt9824;
		is[2] = anInt9801 * -165927661;
		is[3] = anInt9820 * -13552761;
	}

	public Class148 method3338(int i, int i_172_, boolean bool, boolean bool_173_) {
		if (bool)
			return new Class148_Sub1_Sub1(this, i, i_172_);
		return new Class148_Sub1_Sub3(this, i, i_172_);
	}

	boolean method15421() {
		return aBool9812;
	}

	public Class435 method3301() {
		return new Class435(aClass435_9818);
	}

	public void method3378(int i, int i_174_, int i_175_, int i_176_) {
		if (i < 0)
			i = 0;
		if (i_174_ < 0)
			i_174_ = 0;
		if (i_175_ > anInt9825 * 1013077751)
			i_175_ = anInt9825 * 1013077751;
		if (i_176_ > anInt9806 * 719529481)
			i_176_ = anInt9806 * 719529481;
		anInt9815 = -1225886189 * i;
		anInt9809 = i_175_ * -60284715;
		anInt9810 = i_174_ * 2023392489;
		anInt9826 = i_176_ * 624962957;
		method15452();
	}

	public void method3266(int i, int i_177_, int i_178_, int i_179_) {
		if (anInt9815 * -1373518821 < i)
			anInt9815 = -1225886189 * i;
		if (anInt9810 * -695823527 < i_177_)
			anInt9810 = 2023392489 * i_177_;
		if (-272361347 * anInt9809 > i_178_)
			anInt9809 = i_178_ * -60284715;
		if (489020741 * anInt9826 > i_179_)
			anInt9826 = 624962957 * i_179_;
		method15452();
	}

	public void method3075(int[] is) {
		is[0] = -1373518821 * anInt9815;
		is[1] = anInt9810 * -695823527;
		is[2] = anInt9809 * -272361347;
		is[3] = 489020741 * anInt9826;
	}

	public void method3076(int i, int i_180_) {
		if ((i & 0x1) != 0)
			method3193(0, 0, anInt9825 * 1013077751, anInt9806 * 719529481, i_180_, 0);
		if (0 != (i & 0x2))
			method15420();
	}

	public void method3083(int i, int i_181_, int i_182_, int i_183_, int i_184_, int i_185_) {
		method3087(i, i_181_, i_182_, i_184_, i_185_);
		method3087(i, i_183_ + i_181_ - 1, i_182_, i_184_, i_185_);
		method3119(i, 1 + i_181_, i_183_ - 2, i_184_, i_185_);
		method3119(i + i_182_ - 1, i_181_ + 1, i_183_ - 2, i_184_, i_185_);
	}

	public void method3193(int i, int i_186_, int i_187_, int i_188_, int i_189_, int i_190_) {
		if (null != anIntArray9804) {
			if (i < -1373518821 * anInt9815) {
				i_187_ -= -1373518821 * anInt9815 - i;
				i = -1373518821 * anInt9815;
			}
			if (i_186_ < anInt9810 * -695823527) {
				i_188_ -= -695823527 * anInt9810 - i_186_;
				i_186_ = -695823527 * anInt9810;
			}
			if (i_187_ + i > anInt9809 * -272361347)
				i_187_ = -272361347 * anInt9809 - i;
			if (i_186_ + i_188_ > 489020741 * anInt9826)
				i_188_ = 489020741 * anInt9826 - i_186_;
			if (i_187_ > 0 && i_188_ > 0 && i <= anInt9809 * -272361347 && i_186_ <= 489020741 * anInt9826) {
				int i_191_ = 1013077751 * anInt9825 - i_187_;
				int i_192_ = i + 1013077751 * anInt9825 * i_186_;
				int i_193_ = i_189_ >>> 24;
				if (0 == i_190_ || 1 == i_190_ && i_193_ == 255) {
					int i_194_ = i_187_ >> 3;
					int i_195_ = i_187_ & 0x7;
					i_187_ = i_192_ - 1;
					for (int i_196_ = -i_188_; i_196_ < 0; i_196_++) {
						if (i_194_ > 0) {
							i = i_194_;
							do {
								anIntArray9804[++i_187_] = i_189_;
								anIntArray9804[++i_187_] = i_189_;
								anIntArray9804[++i_187_] = i_189_;
								anIntArray9804[++i_187_] = i_189_;
								anIntArray9804[++i_187_] = i_189_;
								anIntArray9804[++i_187_] = i_189_;
								anIntArray9804[++i_187_] = i_189_;
								anIntArray9804[++i_187_] = i_189_;
							} while (--i > 0);
						}
						if (i_195_ > 0) {
							i = i_195_;
							do
								anIntArray9804[++i_187_] = i_189_;
							while (--i > 0);
						}
						i_187_ += i_191_;
					}
				} else if (i_190_ == 1) {
					i_189_ = ((((i_189_ & ~0xff00ff) >>> 8) * i_193_ & ~0xff00ff) + (i_193_ * (i_189_ & 0xff00ff) >> 8 & 0xff00ff));
					int i_197_ = 256 - i_193_;
					for (int i_198_ = 0; i_198_ < i_188_; i_198_++) {
						for (int i_199_ = -i_187_; i_199_ < 0; i_199_++) {
							int i_200_ = anIntArray9804[i_192_];
							i_200_ = ((i_197_ * ((i_200_ & ~0xff00ff) >>> 8) & ~0xff00ff) + ((i_200_ & 0xff00ff) * i_197_ >> 8 & 0xff00ff));
							anIntArray9804[i_192_++] = i_189_ + i_200_;
						}
						i_192_ += i_191_;
					}
				} else if (2 == i_190_) {
					for (int i_201_ = 0; i_201_ < i_188_; i_201_++) {
						for (int i_202_ = -i_187_; i_202_ < 0; i_202_++) {
							int i_203_ = anIntArray9804[i_192_];
							int i_204_ = i_189_ + i_203_;
							int i_205_ = (i_189_ & 0xff00ff) + (i_203_ & 0xff00ff);
							i_203_ = (i_205_ & 0x1000100) + (i_204_ - i_205_ & 0x10000);
							anIntArray9804[i_192_++] = i_204_ - i_203_ | i_203_ - (i_203_ >>> 8);
						}
						i_192_ += i_191_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method3415(int i, int i_206_, int i_207_, int i_208_, int i_209_) {
		if (anIntArray9804 != null) {
			if (i_207_ < 0)
				i_207_ = -i_207_;
			int i_210_ = i_206_ - i_207_;
			if (i_210_ < anInt9810 * -695823527)
				i_210_ = -695823527 * anInt9810;
			int i_211_ = i_206_ + i_207_ + 1;
			if (i_211_ > 489020741 * anInt9826)
				i_211_ = anInt9826 * 489020741;
			int i_212_ = i_210_;
			int i_213_ = i_207_ * i_207_;
			int i_214_ = 0;
			int i_215_ = i_206_ - i_212_;
			int i_216_ = i_215_ * i_215_;
			int i_217_ = i_216_ - i_215_;
			if (i_206_ > i_211_)
				i_206_ = i_211_;
			int i_218_ = i_208_ >>> 24;
			if (i_209_ == 0 || 1 == i_209_ && i_218_ == 255) {
				while (i_212_ < i_206_) {
					for (/**/; i_217_ <= i_213_ || i_216_ <= i_213_; i_217_ += i_214_++ + i_214_)
						i_216_ += i_214_ + i_214_;
					int i_219_ = i - i_214_ + 1;
					if (i_219_ < anInt9815 * -1373518821)
						i_219_ = anInt9815 * -1373518821;
					int i_220_ = i + i_214_;
					if (i_220_ > anInt9809 * -272361347)
						i_220_ = anInt9809 * -272361347;
					int i_221_ = i_219_ + i_212_ * (anInt9825 * 1013077751);
					for (int i_222_ = i_219_; i_222_ < i_220_; i_222_++)
						anIntArray9804[i_221_++] = i_208_;
					i_212_++;
					i_216_ -= i_215_-- + i_215_;
					i_217_ -= i_215_ + i_215_;
				}
				i_214_ = i_207_;
				i_215_ = i_212_ - i_206_;
				i_217_ = i_215_ * i_215_ + i_213_;
				i_216_ = i_217_ - i_214_;
				i_217_ -= i_215_;
				while (i_212_ < i_211_) {
					for (/**/; i_217_ > i_213_ && i_216_ > i_213_; i_216_ -= i_214_ + i_214_)
						i_217_ -= i_214_-- + i_214_;
					int i_223_ = i - i_214_;
					if (i_223_ < -1373518821 * anInt9815)
						i_223_ = anInt9815 * -1373518821;
					int i_224_ = i_214_ + i;
					if (i_224_ > -272361347 * anInt9809 - 1)
						i_224_ = anInt9809 * -272361347 - 1;
					int i_225_ = 1013077751 * anInt9825 * i_212_ + i_223_;
					for (int i_226_ = i_223_; i_226_ <= i_224_; i_226_++)
						anIntArray9804[i_225_++] = i_208_;
					i_212_++;
					i_217_ += i_215_ + i_215_;
					i_216_ += i_215_++ + i_215_;
				}
			} else if (i_209_ == 1) {
				i_208_ = (i_218_ << 24) + ((i_218_ * (i_208_ & 0xff00) >> 8 & 0xff00) + ((i_208_ & 0xff00ff) * i_218_ >> 8 & 0xff00ff));
				int i_227_ = 256 - i_218_;
				while (i_212_ < i_206_) {
					for (/**/; i_217_ <= i_213_ || i_216_ <= i_213_; i_217_ += i_214_++ + i_214_)
						i_216_ += i_214_ + i_214_;
					int i_228_ = i - i_214_ + 1;
					if (i_228_ < -1373518821 * anInt9815)
						i_228_ = -1373518821 * anInt9815;
					int i_229_ = i + i_214_;
					if (i_229_ > -272361347 * anInt9809)
						i_229_ = -272361347 * anInt9809;
					int i_230_ = i_212_ * (anInt9825 * 1013077751) + i_228_;
					for (int i_231_ = i_228_; i_231_ < i_229_; i_231_++) {
						int i_232_ = anIntArray9804[i_230_];
						i_232_ = ((i_227_ * (i_232_ & 0xff00) >> 8 & 0xff00) + (i_227_ * (i_232_ & 0xff00ff) >> 8 & 0xff00ff));
						anIntArray9804[i_230_++] = i_208_ + i_232_;
					}
					i_212_++;
					i_216_ -= i_215_-- + i_215_;
					i_217_ -= i_215_ + i_215_;
				}
				i_214_ = i_207_;
				i_215_ = -i_215_;
				i_217_ = i_213_ + i_215_ * i_215_;
				i_216_ = i_217_ - i_214_;
				i_217_ -= i_215_;
				while (i_212_ < i_211_) {
					for (/**/; i_217_ > i_213_ && i_216_ > i_213_; i_216_ -= i_214_ + i_214_)
						i_217_ -= i_214_-- + i_214_;
					int i_233_ = i - i_214_;
					if (i_233_ < anInt9815 * -1373518821)
						i_233_ = -1373518821 * anInt9815;
					int i_234_ = i + i_214_;
					if (i_234_ > -272361347 * anInt9809 - 1)
						i_234_ = anInt9809 * -272361347 - 1;
					int i_235_ = anInt9825 * 1013077751 * i_212_ + i_233_;
					for (int i_236_ = i_233_; i_236_ <= i_234_; i_236_++) {
						int i_237_ = anIntArray9804[i_235_];
						i_237_ = (((i_237_ & 0xff00ff) * i_227_ >> 8 & 0xff00ff) + ((i_237_ & 0xff00) * i_227_ >> 8 & 0xff00));
						anIntArray9804[i_235_++] = i_208_ + i_237_;
					}
					i_212_++;
					i_217_ += i_215_ + i_215_;
					i_216_ += i_215_++ + i_215_;
				}
			} else if (2 == i_209_) {
				while (i_212_ < i_206_) {
					for (/**/; i_217_ <= i_213_ || i_216_ <= i_213_; i_217_ += i_214_++ + i_214_)
						i_216_ += i_214_ + i_214_;
					int i_238_ = 1 + (i - i_214_);
					if (i_238_ < -1373518821 * anInt9815)
						i_238_ = anInt9815 * -1373518821;
					int i_239_ = i_214_ + i;
					if (i_239_ > -272361347 * anInt9809)
						i_239_ = -272361347 * anInt9809;
					int i_240_ = i_238_ + i_212_ * (anInt9825 * 1013077751);
					for (int i_241_ = i_238_; i_241_ < i_239_; i_241_++) {
						int i_242_ = anIntArray9804[i_240_];
						int i_243_ = i_208_ + i_242_;
						int i_244_ = (i_208_ & 0xff00ff) + (i_242_ & 0xff00ff);
						i_242_ = (i_244_ & 0x1000100) + (i_243_ - i_244_ & 0x10000);
						anIntArray9804[i_240_++] = i_243_ - i_242_ | i_242_ - (i_242_ >>> 8);
					}
					i_212_++;
					i_216_ -= i_215_-- + i_215_;
					i_217_ -= i_215_ + i_215_;
				}
				i_214_ = i_207_;
				i_215_ = -i_215_;
				i_217_ = i_213_ + i_215_ * i_215_;
				i_216_ = i_217_ - i_214_;
				i_217_ -= i_215_;
				while (i_212_ < i_211_) {
					for (/**/; i_217_ > i_213_ && i_216_ > i_213_; i_216_ -= i_214_ + i_214_)
						i_217_ -= i_214_-- + i_214_;
					int i_245_ = i - i_214_;
					if (i_245_ < -1373518821 * anInt9815)
						i_245_ = anInt9815 * -1373518821;
					int i_246_ = i + i_214_;
					if (i_246_ > anInt9809 * -272361347 - 1)
						i_246_ = anInt9809 * -272361347 - 1;
					int i_247_ = i_212_ * (1013077751 * anInt9825) + i_245_;
					for (int i_248_ = i_245_; i_248_ <= i_246_; i_248_++) {
						int i_249_ = anIntArray9804[i_247_];
						int i_250_ = i_208_ + i_249_;
						int i_251_ = (i_249_ & 0xff00ff) + (i_208_ & 0xff00ff);
						i_249_ = (i_250_ - i_251_ & 0x10000) + (i_251_ & 0x1000100);
						anIntArray9804[i_247_++] = i_250_ - i_249_ | i_249_ - (i_249_ >>> 8);
					}
					i_212_++;
					i_217_ += i_215_ + i_215_;
					i_216_ += i_215_++ + i_215_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public boolean method3097() {
		return false;
	}

	void method15422(int i, int i_252_, int i_253_, int i_254_, int i_255_, int i_256_, int i_257_, int i_258_) {
		if (null != anIntArray9804 && (i_252_ >= anInt9810 * -695823527 && i_252_ < anInt9826 * 489020741)) {
			int i_259_ = i + i_252_ * (anInt9825 * 1013077751);
			int i_260_ = i_254_ >>> 24;
			int i_261_ = i_256_ + i_257_;
			int i_262_ = i_258_ % i_261_;
			if (i_255_ == 0 || 1 == i_255_ && 255 == i_260_) {
				int i_263_ = 0;
				while (i_263_ < i_253_) {
					if (i + i_263_ >= anInt9815 * -1373518821 && i_263_ + i < anInt9809 * -272361347 && i_262_ < i_256_)
						anIntArray9804[i_263_ + i_259_] = i_254_;
					i_263_++;
					i_262_ = ++i_262_ % i_261_;
				}
			} else if (1 == i_255_) {
				i_254_ = ((i_260_ * (i_254_ & 0xff00) >> 8 & 0xff00) + (i_260_ * (i_254_ & 0xff00ff) >> 8 & 0xff00ff) + (i_260_ << 24));
				int i_264_ = 256 - i_260_;
				int i_265_ = 0;
				while (i_265_ < i_253_) {
					if (i + i_265_ >= -1373518821 * anInt9815 && i_265_ + i < -272361347 * anInt9809 && i_262_ < i_256_) {
						int i_266_ = anIntArray9804[i_265_ + i_259_];
						i_266_ = (((i_266_ & 0xff00) * i_264_ >> 8 & 0xff00) + (i_264_ * (i_266_ & 0xff00ff) >> 8 & 0xff00ff));
						anIntArray9804[i_265_ + i_259_] = i_266_ + i_254_;
					}
					i_265_++;
					i_262_ = ++i_262_ % i_261_;
				}
			} else if (2 == i_255_) {
				int i_267_ = 0;
				while (i_267_ < i_253_) {
					if (i + i_267_ >= anInt9815 * -1373518821 && i_267_ + i < anInt9809 * -272361347 && i_262_ < i_256_) {
						int i_268_ = anIntArray9804[i_259_ + i_267_];
						int i_269_ = i_268_ + i_254_;
						int i_270_ = (i_268_ & 0xff00ff) + (i_254_ & 0xff00ff);
						i_268_ = (i_270_ & 0x1000100) + (i_269_ - i_270_ & 0x10000);
						anIntArray9804[i_259_ + i_267_] = i_269_ - i_268_ | i_268_ - (i_268_ >>> 8);
					}
					i_267_++;
					i_262_ = ++i_262_ % i_261_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public Class145 method3109(int i, int i_271_, int[] is, int[] is_272_) {
		return new Class145_Sub1(i, i_271_, is, is_272_);
	}

	public boolean method3336() {
		return false;
	}

	public boolean method3146() {
		return false;
	}

	public void method3107(int i, int i_273_, int i_274_, int i_275_, int i_276_, int i_277_, int i_278_, int i_279_, int i_280_) {
		if (anIntArray9804 != null) {
			i_274_ -= i;
			i_275_ -= i_273_;
			if (i_275_ == 0) {
				if (i_274_ >= 0)
					method15422(i, i_273_, i_274_ + 1, i_276_, i_277_, i_278_, i_279_, i_280_);
				else {
					int i_281_ = i_279_ + i_278_;
					i_280_ %= i_281_;
					i_280_ = i_278_ + i_281_ - i_280_ - (-i_274_ + 1) % i_281_;
					i_280_ %= i_281_;
					if (i_280_ < 0)
						i_280_ += i_281_;
					method15422(i_274_ + i, i_273_, -i_274_ + 1, i_276_, i_277_, i_278_, i_279_, i_280_);
				}
			} else if (i_274_ == 0) {
				if (i_275_ >= 0)
					method15418(i, i_273_, i_275_ + 1, i_276_, i_277_, i_278_, i_279_, i_280_);
				else {
					int i_282_ = i_279_ + i_278_;
					i_280_ %= i_282_;
					i_280_ = i_278_ + i_282_ - i_280_ - (-i_275_ + 1) % i_282_;
					i_280_ %= i_282_;
					if (i_280_ < 0)
						i_280_ += i_282_;
					method15418(i, i_273_ + i_275_, 1 + -i_275_, i_276_, i_277_, i_278_, i_279_, i_280_);
				}
			} else {
				i_280_ <<= 8;
				i_278_ <<= 8;
				i_279_ <<= 8;
				int i_283_ = i_278_ + i_279_;
				i_280_ %= i_283_;
				if (i_275_ + i_274_ < 0) {
					int i_284_ = (int) (Math.sqrt((double) (i_274_ * i_274_ + i_275_ * i_275_)) * 256.0);
					int i_285_ = i_284_ % i_283_;
					i_280_ = i_283_ + i_278_ - i_280_ - i_285_;
					i_280_ %= i_283_;
					if (i_280_ < 0)
						i_280_ += i_283_;
					i += i_274_;
					i_274_ = -i_274_;
					i_273_ += i_275_;
					i_275_ = -i_275_;
				}
				if (i_274_ > i_275_) {
					i_273_ <<= 16;
					i_273_ += 32768;
					i_275_ <<= 16;
					int i_286_ = (int) Math.floor((double) i_275_ / (double) i_274_ + 0.5);
					i_274_ += i;
					int i_287_ = i_276_ >>> 24;
					int i_288_ = (int) Math.sqrt((double) (65536 + (i_286_ >> 8) * (i_286_ >> 8)));
					if (i_277_ == 0 || 1 == i_277_ && 255 == i_287_) {
						while (i <= i_274_) {
							int i_289_ = i_273_ >> 16;
							if (i >= -1373518821 * anInt9815 && i < anInt9809 * -272361347 && i_289_ >= anInt9810 * -695823527 && i_289_ < 489020741 * anInt9826 && i_280_ < i_278_)
								anIntArray9804[(anInt9825 * 1013077751 * i_289_ + i)] = i_276_;
							i_273_ += i_286_;
							i++;
							i_280_ += i_288_;
							i_280_ %= i_283_;
						}
					} else if (i_277_ == 1) {
						i_276_ = ((i_287_ * (i_276_ & 0xff00ff) >> 8 & 0xff00ff) + (i_287_ * (i_276_ & 0xff00) >> 8 & 0xff00) + (i_287_ << 24));
						int i_290_ = 256 - i_287_;
						while (i <= i_274_) {
							int i_291_ = i_273_ >> 16;
							if (i >= anInt9815 * -1373518821 && i < anInt9809 * -272361347 && i_291_ >= anInt9810 * -695823527 && i_291_ < 489020741 * anInt9826 && i_280_ < i_278_) {
								int i_292_ = i + 1013077751 * anInt9825 * i_291_;
								int i_293_ = anIntArray9804[i_292_];
								i_293_ = ((i_290_ * (i_293_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_293_ & 0xff00) * i_290_ >> 8 & 0xff00));
								anIntArray9804[i_292_] = i_293_ + i_276_;
							}
							i_273_ += i_286_;
							i++;
							i_280_ += i_288_;
							i_280_ %= i_283_;
						}
					} else if (2 == i_277_) {
						while (i <= i_274_) {
							int i_294_ = i_273_ >> 16;
							if (i >= -1373518821 * anInt9815 && i < anInt9809 * -272361347 && i_294_ >= anInt9810 * -695823527 && i_294_ < 489020741 * anInt9826 && i_280_ < i_278_) {
								int i_295_ = i + anInt9825 * 1013077751 * i_294_;
								int i_296_ = anIntArray9804[i_295_];
								int i_297_ = i_296_ + i_276_;
								int i_298_ = ((i_276_ & 0xff00ff) + (i_296_ & 0xff00ff));
								i_296_ = (i_298_ & 0x1000100) + (i_297_ - i_298_ & 0x10000);
								anIntArray9804[i_295_] = i_297_ - i_296_ | i_296_ - (i_296_ >>> 8);
							}
							i_273_ += i_286_;
							i++;
							i_280_ += i_288_;
							i_280_ %= i_283_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_274_ <<= 16;
					int i_299_ = (int) Math.floor((double) i_274_ / (double) i_275_ + 0.5);
					i_275_ += i_273_;
					int i_300_ = i_276_ >>> 24;
					int i_301_ = (int) Math.sqrt((double) ((i_299_ >> 8) * (i_299_ >> 8) + 65536));
					if (0 == i_277_ || 1 == i_277_ && 255 == i_300_) {
						while (i_273_ <= i_275_) {
							int i_302_ = i >> 16;
							if (i_273_ >= -695823527 * anInt9810 && i_273_ < 489020741 * anInt9826 && i_302_ >= anInt9815 * -1373518821 && i_302_ < -272361347 * anInt9809 && i_280_ < i_278_)
								anIntArray9804[i_302_ + i_273_ * (1013077751 * anInt9825)] = i_276_;
							i += i_299_;
							i_273_++;
							i_280_ += i_301_;
							i_280_ %= i_283_;
						}
					} else if (1 == i_277_) {
						i_276_ = ((i_300_ << 24) + (((i_276_ & 0xff00) * i_300_ >> 8 & 0xff00) + (i_300_ * (i_276_ & 0xff00ff) >> 8 & 0xff00ff)));
						int i_303_ = 256 - i_300_;
						while (i_273_ <= i_275_) {
							int i_304_ = i >> 16;
							if (i_273_ >= -695823527 * anInt9810 && i_273_ < anInt9826 * 489020741 && i_304_ >= -1373518821 * anInt9815 && i_304_ < anInt9809 * -272361347 && i_280_ < i_278_) {
								int i_305_ = 1013077751 * anInt9825 * i_273_ + i_304_;
								int i_306_ = anIntArray9804[i_305_];
								i_306_ = (((i_306_ & 0xff00) * i_303_ >> 8 & 0xff00) + (i_303_ * (i_306_ & 0xff00ff) >> 8 & 0xff00ff));
								anIntArray9804[(i_304_ + i_273_ * (anInt9825 * 1013077751))] = i_306_ + i_276_;
							}
							i += i_299_;
							i_273_++;
							i_280_ += i_301_;
							i_280_ %= i_283_;
						}
					} else if (2 == i_277_) {
						while (i_273_ <= i_275_) {
							int i_307_ = i >> 16;
							if (i_273_ >= -695823527 * anInt9810 && i_273_ < anInt9826 * 489020741 && i_307_ >= anInt9815 * -1373518821 && i_307_ < -272361347 * anInt9809 && i_280_ < i_278_) {
								int i_308_ = (i_273_ * (1013077751 * anInt9825) + i_307_);
								int i_309_ = anIntArray9804[i_308_];
								int i_310_ = i_276_ + i_309_;
								int i_311_ = ((i_276_ & 0xff00ff) + (i_309_ & 0xff00ff));
								i_309_ = (i_311_ & 0x1000100) + (i_310_ - i_311_ & 0x10000);
								anIntArray9804[i_308_] = i_310_ - i_309_ | i_309_ - (i_309_ >>> 8);
							}
							i += i_299_;
							i_273_++;
							i_280_ += i_301_;
							i_280_ %= i_283_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	void method3424(float f, float f_312_, float f_313_, float f_314_, float f_315_, float f_316_) {
		/* empty */
	}

	public void method3124(Class441 class441) {
		aClass441_9805.method7086(class441);
		method15429();
	}

	public void method3239(int i, int i_317_, int i_318_, int i_319_, int i_320_, int i_321_) {
		if (null != anIntArray9804) {
			if (i < -1373518821 * anInt9815) {
				i_318_ -= -1373518821 * anInt9815 - i;
				i = -1373518821 * anInt9815;
			}
			if (i_317_ < anInt9810 * -695823527) {
				i_319_ -= -695823527 * anInt9810 - i_317_;
				i_317_ = -695823527 * anInt9810;
			}
			if (i_318_ + i > anInt9809 * -272361347)
				i_318_ = -272361347 * anInt9809 - i;
			if (i_317_ + i_319_ > 489020741 * anInt9826)
				i_319_ = 489020741 * anInt9826 - i_317_;
			if (i_318_ > 0 && i_319_ > 0 && i <= anInt9809 * -272361347 && i_317_ <= 489020741 * anInt9826) {
				int i_322_ = 1013077751 * anInt9825 - i_318_;
				int i_323_ = i + 1013077751 * anInt9825 * i_317_;
				int i_324_ = i_320_ >>> 24;
				if (0 == i_321_ || 1 == i_321_ && i_324_ == 255) {
					int i_325_ = i_318_ >> 3;
					int i_326_ = i_318_ & 0x7;
					i_318_ = i_323_ - 1;
					for (int i_327_ = -i_319_; i_327_ < 0; i_327_++) {
						if (i_325_ > 0) {
							i = i_325_;
							do {
								anIntArray9804[++i_318_] = i_320_;
								anIntArray9804[++i_318_] = i_320_;
								anIntArray9804[++i_318_] = i_320_;
								anIntArray9804[++i_318_] = i_320_;
								anIntArray9804[++i_318_] = i_320_;
								anIntArray9804[++i_318_] = i_320_;
								anIntArray9804[++i_318_] = i_320_;
								anIntArray9804[++i_318_] = i_320_;
							} while (--i > 0);
						}
						if (i_326_ > 0) {
							i = i_326_;
							do
								anIntArray9804[++i_318_] = i_320_;
							while (--i > 0);
						}
						i_318_ += i_322_;
					}
				} else if (i_321_ == 1) {
					i_320_ = ((((i_320_ & ~0xff00ff) >>> 8) * i_324_ & ~0xff00ff) + (i_324_ * (i_320_ & 0xff00ff) >> 8 & 0xff00ff));
					int i_328_ = 256 - i_324_;
					for (int i_329_ = 0; i_329_ < i_319_; i_329_++) {
						for (int i_330_ = -i_318_; i_330_ < 0; i_330_++) {
							int i_331_ = anIntArray9804[i_323_];
							i_331_ = ((i_328_ * ((i_331_ & ~0xff00ff) >>> 8) & ~0xff00ff) + ((i_331_ & 0xff00ff) * i_328_ >> 8 & 0xff00ff));
							anIntArray9804[i_323_++] = i_320_ + i_331_;
						}
						i_323_ += i_322_;
					}
				} else if (2 == i_321_) {
					for (int i_332_ = 0; i_332_ < i_319_; i_332_++) {
						for (int i_333_ = -i_318_; i_333_ < 0; i_333_++) {
							int i_334_ = anIntArray9804[i_323_];
							int i_335_ = i_320_ + i_334_;
							int i_336_ = (i_320_ & 0xff00ff) + (i_334_ & 0xff00ff);
							i_334_ = (i_336_ & 0x1000100) + (i_335_ - i_336_ & 0x10000);
							anIntArray9804[i_323_++] = i_335_ - i_334_ | i_334_ - (i_334_ >>> 8);
						}
						i_323_ += i_322_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	byte method15423(int i) {
		return aClass172_1916.method2895(i, 317351566).aByte1889;
	}

	public void method3194() {
		/* empty */
	}

	public void method3055(Class435 class435, Class180 class180, Class430 class430) {
		Class441 class441 = method3112();
		class441.method7090(class435);
		class441.method7089(aClass441_9821);
		class180.method3531(class430, aClass441_9805, class441, aFloat9828, aFloat9830, aFloat9827, aFloat9829);
	}

	public Class523_Sub8 method3385(int i) {
		return null;
	}

	public void method3099(Class523_Sub8 class523_sub8) {
		/* empty */
	}

	public Class148 method3136(int i, int i_337_, boolean bool, boolean bool_338_) {
		if (bool)
			return new Class148_Sub1_Sub1(this, i, i_337_);
		return new Class148_Sub1_Sub3(this, i, i_337_);
	}

	public void method3472(int i, int i_339_) {
		if ((i & 0x1) != 0)
			method3193(0, 0, anInt9825 * 1013077751, anInt9806 * 719529481, i_339_, 0);
		if (0 != (i & 0x2))
			method15420();
	}

	public Class148 method3104(Class175 class175, boolean bool) {
		int i = class175.method2944();
		int i_340_ = class175.method2945();
		Class148_Sub1 class148_sub1;
		if (bool && !class175.method2943() && class175.method2942()) {
			Class175_Sub2 class175_sub2 = (Class175_Sub2) class175;
			int[] is = new int[class175_sub2.anIntArray9850.length];
			byte[] is_341_ = new byte[i_340_ * i];
			for (int i_342_ = 0; i_342_ < i_340_; i_342_++) {
				int i_343_ = i * i_342_;
				for (int i_344_ = 0; i_344_ < i; i_344_++)
					is_341_[i_343_ + i_344_] = class175_sub2.aByteArray9857[i_343_ + i_344_];
			}
			for (int i_345_ = 0; i_345_ < class175_sub2.anIntArray9850.length; i_345_++)
				is[i_345_] = class175_sub2.anIntArray9850[i_345_];
			class148_sub1 = new Class148_Sub1_Sub2(this, is_341_, is, i, i_340_);
		} else {
			int[] is = class175.method2959(false);
			if (class175.method2943())
				class148_sub1 = new Class148_Sub1_Sub1(this, is, i, i_340_);
			else
				class148_sub1 = new Class148_Sub1_Sub3(this, is, i, i_340_);
		}
		class148_sub1.method2426(class175.method2946(), class175.method2948(), class175.method2984(), class175.method2949());
		return class148_sub1;
	}

	public void method3176(boolean bool) {
		/* empty */
	}

	void method3382(int i, int i_346_, int i_347_, int i_348_, int i_349_) {
		if (anIntArray9804 != null) {
			if (i_347_ < 0)
				i_347_ = -i_347_;
			int i_350_ = i_346_ - i_347_;
			if (i_350_ < anInt9810 * -695823527)
				i_350_ = -695823527 * anInt9810;
			int i_351_ = i_346_ + i_347_ + 1;
			if (i_351_ > 489020741 * anInt9826)
				i_351_ = anInt9826 * 489020741;
			int i_352_ = i_350_;
			int i_353_ = i_347_ * i_347_;
			int i_354_ = 0;
			int i_355_ = i_346_ - i_352_;
			int i_356_ = i_355_ * i_355_;
			int i_357_ = i_356_ - i_355_;
			if (i_346_ > i_351_)
				i_346_ = i_351_;
			int i_358_ = i_348_ >>> 24;
			if (i_349_ == 0 || 1 == i_349_ && i_358_ == 255) {
				while (i_352_ < i_346_) {
					for (/**/; i_357_ <= i_353_ || i_356_ <= i_353_; i_357_ += i_354_++ + i_354_)
						i_356_ += i_354_ + i_354_;
					int i_359_ = i - i_354_ + 1;
					if (i_359_ < anInt9815 * -1373518821)
						i_359_ = anInt9815 * -1373518821;
					int i_360_ = i + i_354_;
					if (i_360_ > anInt9809 * -272361347)
						i_360_ = anInt9809 * -272361347;
					int i_361_ = i_359_ + i_352_ * (anInt9825 * 1013077751);
					for (int i_362_ = i_359_; i_362_ < i_360_; i_362_++)
						anIntArray9804[i_361_++] = i_348_;
					i_352_++;
					i_356_ -= i_355_-- + i_355_;
					i_357_ -= i_355_ + i_355_;
				}
				i_354_ = i_347_;
				i_355_ = i_352_ - i_346_;
				i_357_ = i_355_ * i_355_ + i_353_;
				i_356_ = i_357_ - i_354_;
				i_357_ -= i_355_;
				while (i_352_ < i_351_) {
					for (/**/; i_357_ > i_353_ && i_356_ > i_353_; i_356_ -= i_354_ + i_354_)
						i_357_ -= i_354_-- + i_354_;
					int i_363_ = i - i_354_;
					if (i_363_ < -1373518821 * anInt9815)
						i_363_ = anInt9815 * -1373518821;
					int i_364_ = i_354_ + i;
					if (i_364_ > -272361347 * anInt9809 - 1)
						i_364_ = anInt9809 * -272361347 - 1;
					int i_365_ = 1013077751 * anInt9825 * i_352_ + i_363_;
					for (int i_366_ = i_363_; i_366_ <= i_364_; i_366_++)
						anIntArray9804[i_365_++] = i_348_;
					i_352_++;
					i_357_ += i_355_ + i_355_;
					i_356_ += i_355_++ + i_355_;
				}
			} else if (i_349_ == 1) {
				i_348_ = (i_358_ << 24) + ((i_358_ * (i_348_ & 0xff00) >> 8 & 0xff00) + ((i_348_ & 0xff00ff) * i_358_ >> 8 & 0xff00ff));
				int i_367_ = 256 - i_358_;
				while (i_352_ < i_346_) {
					for (/**/; i_357_ <= i_353_ || i_356_ <= i_353_; i_357_ += i_354_++ + i_354_)
						i_356_ += i_354_ + i_354_;
					int i_368_ = i - i_354_ + 1;
					if (i_368_ < -1373518821 * anInt9815)
						i_368_ = -1373518821 * anInt9815;
					int i_369_ = i + i_354_;
					if (i_369_ > -272361347 * anInt9809)
						i_369_ = -272361347 * anInt9809;
					int i_370_ = i_352_ * (anInt9825 * 1013077751) + i_368_;
					for (int i_371_ = i_368_; i_371_ < i_369_; i_371_++) {
						int i_372_ = anIntArray9804[i_370_];
						i_372_ = ((i_367_ * (i_372_ & 0xff00) >> 8 & 0xff00) + (i_367_ * (i_372_ & 0xff00ff) >> 8 & 0xff00ff));
						anIntArray9804[i_370_++] = i_348_ + i_372_;
					}
					i_352_++;
					i_356_ -= i_355_-- + i_355_;
					i_357_ -= i_355_ + i_355_;
				}
				i_354_ = i_347_;
				i_355_ = -i_355_;
				i_357_ = i_353_ + i_355_ * i_355_;
				i_356_ = i_357_ - i_354_;
				i_357_ -= i_355_;
				while (i_352_ < i_351_) {
					for (/**/; i_357_ > i_353_ && i_356_ > i_353_; i_356_ -= i_354_ + i_354_)
						i_357_ -= i_354_-- + i_354_;
					int i_373_ = i - i_354_;
					if (i_373_ < anInt9815 * -1373518821)
						i_373_ = -1373518821 * anInt9815;
					int i_374_ = i + i_354_;
					if (i_374_ > -272361347 * anInt9809 - 1)
						i_374_ = anInt9809 * -272361347 - 1;
					int i_375_ = anInt9825 * 1013077751 * i_352_ + i_373_;
					for (int i_376_ = i_373_; i_376_ <= i_374_; i_376_++) {
						int i_377_ = anIntArray9804[i_375_];
						i_377_ = (((i_377_ & 0xff00ff) * i_367_ >> 8 & 0xff00ff) + ((i_377_ & 0xff00) * i_367_ >> 8 & 0xff00));
						anIntArray9804[i_375_++] = i_348_ + i_377_;
					}
					i_352_++;
					i_357_ += i_355_ + i_355_;
					i_356_ += i_355_++ + i_355_;
				}
			} else if (2 == i_349_) {
				while (i_352_ < i_346_) {
					for (/**/; i_357_ <= i_353_ || i_356_ <= i_353_; i_357_ += i_354_++ + i_354_)
						i_356_ += i_354_ + i_354_;
					int i_378_ = 1 + (i - i_354_);
					if (i_378_ < -1373518821 * anInt9815)
						i_378_ = anInt9815 * -1373518821;
					int i_379_ = i_354_ + i;
					if (i_379_ > -272361347 * anInt9809)
						i_379_ = -272361347 * anInt9809;
					int i_380_ = i_378_ + i_352_ * (anInt9825 * 1013077751);
					for (int i_381_ = i_378_; i_381_ < i_379_; i_381_++) {
						int i_382_ = anIntArray9804[i_380_];
						int i_383_ = i_348_ + i_382_;
						int i_384_ = (i_348_ & 0xff00ff) + (i_382_ & 0xff00ff);
						i_382_ = (i_384_ & 0x1000100) + (i_383_ - i_384_ & 0x10000);
						anIntArray9804[i_380_++] = i_383_ - i_382_ | i_382_ - (i_382_ >>> 8);
					}
					i_352_++;
					i_356_ -= i_355_-- + i_355_;
					i_357_ -= i_355_ + i_355_;
				}
				i_354_ = i_347_;
				i_355_ = -i_355_;
				i_357_ = i_353_ + i_355_ * i_355_;
				i_356_ = i_357_ - i_354_;
				i_357_ -= i_355_;
				while (i_352_ < i_351_) {
					for (/**/; i_357_ > i_353_ && i_356_ > i_353_; i_356_ -= i_354_ + i_354_)
						i_357_ -= i_354_-- + i_354_;
					int i_385_ = i - i_354_;
					if (i_385_ < -1373518821 * anInt9815)
						i_385_ = anInt9815 * -1373518821;
					int i_386_ = i + i_354_;
					if (i_386_ > anInt9809 * -272361347 - 1)
						i_386_ = anInt9809 * -272361347 - 1;
					int i_387_ = i_352_ * (1013077751 * anInt9825) + i_385_;
					for (int i_388_ = i_385_; i_388_ <= i_386_; i_388_++) {
						int i_389_ = anIntArray9804[i_387_];
						int i_390_ = i_348_ + i_389_;
						int i_391_ = (i_389_ & 0xff00ff) + (i_348_ & 0xff00ff);
						i_389_ = (i_390_ - i_391_ & 0x10000) + (i_391_ & 0x1000100);
						anIntArray9804[i_387_++] = i_390_ - i_389_ | i_389_ - (i_389_ >>> 8);
					}
					i_352_++;
					i_357_ += i_355_ + i_355_;
					i_356_ += i_355_++ + i_355_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public boolean method3027() {
		return false;
	}

	public Class441 method3289() {
		return new Class441(aClass441_9805);
	}

	public void method3114(int i) {
		Class167_Sub1.anInt9071 = Class167_Sub1.anInt9050 = i;
		if (anInt9819 * 1353126165 > 1)
			throw new IllegalStateException();
		method15426(anInt9819 * 1353126165);
		method15425(0);
	}

	void method3023() {
		if (aBool9803) {
			Class305.method5552(true, false, (byte) 0);
			aBool9803 = false;
		}
		aBool9812 = true;
	}

	public int method3068(int i, int i_392_) {
		i |= 0x20800;
		return i & i_392_ ^ i_392_;
	}

	public Class185 method3395(int i) {
		return null;
	}

	public void method3226(float f) {
		anInt9817 = 2063625163 * (int) (f * 65535.0F);
	}

	Class178_Sub3(Canvas canvas, Class172 class172, Interface25 interface25, Interface46 interface46, Interface48 interface48, Interface45 interface45, int i, int i_393_) {
		this(class172, interface25, interface46, interface48, interface45);
		try {
			method3041(canvas, i, i_393_, 564301898);
			method3044(canvas, -1011226072);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method3024(-1011374146);
			throw new RuntimeException("");
		}
	}

	public void method3143(int i, int i_394_, int i_395_) {
		for (int i_396_ = 0; i_396_ < aClass99Array9836.length; i_396_++) {
			Class99 class99 = aClass99Array9836[i_396_];
			class99.anInt1192 = (i & 0xffffff) * 1830757045;
			int i_397_ = class99.anInt1192 * 340278173 >>> 16 & 0xff;
			if (i_397_ < 2)
				i_397_ = 2;
			int i_398_ = 340278173 * class99.anInt1192 >> 8 & 0xff;
			if (i_398_ < 2)
				i_398_ = 2;
			int i_399_ = class99.anInt1192 * 340278173 & 0xff;
			if (i_399_ < 2)
				i_399_ = 2;
			class99.anInt1192 = 1830757045 * (i_397_ << 16 | i_398_ << 8 | i_399_);
			if (i_394_ < 0)
				class99.aBool1189 = false;
			else
				class99.aBool1189 = true;
		}
	}

	public int[] method3341() {
		return null;
	}

	public Class523_Sub20 method3131(int i, int i_400_, int i_401_, int i_402_, int i_403_, float f) {
		return null;
	}

	void method15424(int i, int i_404_, int i_405_, int i_406_, int i_407_, int i_408_, int i_409_, int i_410_) {
		if (anIntArray9804 != null && (i >= -1373518821 * anInt9815 && i < -272361347 * anInt9809)) {
			int i_411_ = i + 1013077751 * anInt9825 * i_404_;
			int i_412_ = i_406_ >>> 24;
			int i_413_ = i_408_ + i_409_;
			int i_414_ = i_410_ % i_413_;
			if (i_407_ == 0 || i_407_ == 1 && 255 == i_412_) {
				int i_415_ = 0;
				while (i_415_ < i_405_) {
					if (i_404_ + i_415_ >= anInt9810 * -695823527 && i_415_ + i_404_ < 489020741 * anInt9826 && i_414_ < i_408_)
						anIntArray9804[i_411_ + i_415_ * (anInt9825 * 1013077751)] = i_406_;
					i_415_++;
					i_414_ = ++i_414_ % i_413_;
				}
			} else if (1 == i_407_) {
				i_406_ = (i_412_ << 24) + (((i_406_ & 0xff00) * i_412_ >> 8 & 0xff00) + ((i_406_ & 0xff00ff) * i_412_ >> 8 & 0xff00ff));
				int i_416_ = 256 - i_412_;
				int i_417_ = 0;
				while (i_417_ < i_405_) {
					if (i_404_ + i_417_ >= anInt9810 * -695823527 && i_417_ + i_404_ < anInt9826 * 489020741 && i_414_ < i_408_) {
						int i_418_ = i_411_ + anInt9825 * 1013077751 * i_417_;
						int i_419_ = anIntArray9804[i_418_];
						i_419_ = ((i_416_ * (i_419_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_419_ & 0xff00) * i_416_ >> 8 & 0xff00));
						anIntArray9804[i_418_] = i_406_ + i_419_;
					}
					i_417_++;
					i_414_ = ++i_414_ % i_413_;
				}
			} else if (2 == i_407_) {
				int i_420_ = 0;
				while (i_420_ < i_405_) {
					if (i_420_ + i_404_ >= -695823527 * anInt9810 && i_404_ + i_420_ < anInt9826 * 489020741 && i_414_ < i_408_) {
						int i_421_ = i_420_ * (anInt9825 * 1013077751) + i_411_;
						int i_422_ = anIntArray9804[i_421_];
						int i_423_ = i_422_ + i_406_;
						int i_424_ = (i_422_ & 0xff00ff) + (i_406_ & 0xff00ff);
						i_422_ = (i_423_ - i_424_ & 0x10000) + (i_424_ & 0x1000100);
						anIntArray9804[i_421_] = i_423_ - i_422_ | i_422_ - (i_422_ >>> 8);
					}
					i_420_++;
					i_414_ = ++i_414_ % i_413_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	void method15425(int i) {
		aClass99Array9836[i].method1782(Thread.currentThread(), -1247566943);
	}

	void method15426(int i) {
		anInt9819 = 81573437 * i;
		aClass99Array9836 = new Class99[1353126165 * anInt9819];
		for (int i_425_ = 0; i_425_ < 1353126165 * anInt9819; i_425_++)
			aClass99Array9836[i_425_] = new Class99(this);
	}

	void method3221(int i, int i_426_) throws Exception_Sub4 {
		aClass168_Sub2_1939.method15401(i, i_426_);
		if (null != anInterface25_1923)
			anInterface25_1923.method20(2091046949);
	}

	public void method3120(Class171 class171) {
		method15427(anIntArray9804 != null, null != aFloatArray9807, false, class171);
	}

	void method15427(boolean bool, boolean bool_427_, boolean bool_428_, Class171 class171) {
		Class99 class99 = method15475(Thread.currentThread());
		for (Class522_Sub2_Sub1 class522_sub2_sub1 = ((Class522_Sub2_Sub1) class171.aClass686_1836.method13878(2138772399)); null != class522_sub2_sub1; class522_sub2_sub1 = ((Class522_Sub2_Sub1) class171.aClass686_1836.method13879(1004023750))) {
			int i = class522_sub2_sub1.anInt11564 >> 12;
			int i_429_ = class522_sub2_sub1.anInt11568 >> 12;
			int i_430_ = class522_sub2_sub1.anInt11569 >> 12;
			float f = (aClass441_9821.aFloatArray4916[14] + ((float) i_429_ * aClass441_9821.aFloatArray4916[6] + aClass441_9821.aFloatArray4916[2] * (float) i + (float) i_430_ * aClass441_9821.aFloatArray4916[10]));
			float f_431_ = (aClass441_9821.aFloatArray4916[15] + ((float) i_430_ * aClass441_9821.aFloatArray4916[11] + (aClass441_9821.aFloatArray4916[7] * (float) i_429_ + (float) i * aClass441_9821.aFloatArray4916[3])));
			if (!(f < -f_431_)) {
				float f_432_ = f * aFloat9833 / f_431_ + aFloat9832;
				if (!(f > class99.aFloat1205)) {
					float f_433_ = (aClass441_9821.aFloatArray4916[12] + (((float) i_430_ * aClass441_9821.aFloatArray4916[8]) + ((aClass441_9821.aFloatArray4916[4] * (float) i_429_) + (aClass441_9821.aFloatArray4916[0] * (float) i))));
					float f_434_ = (aClass441_9821.aFloatArray4916[13] + (((float) i_430_ * aClass441_9821.aFloatArray4916[9]) + ((aClass441_9821.aFloatArray4916[5] * (float) i_429_) + ((float) i * aClass441_9821.aFloatArray4916[1]))));
					if (!(f_433_ < -f_431_) && !(f_433_ > f_431_) && !(f_434_ < -f_431_) && !(f_434_ > f_431_)) {
						float f_435_ = (float) class522_sub2_sub1.anInt11567 / 4096.0F;
						float f_436_ = (f_433_ + f_435_ * aClass441_9805.aFloatArray4916[0]);
						float f_437_ = (f_431_ + aClass441_9805.aFloatArray4916[3] * f_435_);
						float f_438_ = aFloat9828 + f_433_ * aFloat9827 / f_431_;
						float f_439_ = aFloat9830 + f_434_ * aFloat9829 / f_431_;
						float f_440_ = f_436_ * aFloat9827 / f_437_ + aFloat9828;
						method15464(bool, bool_427_, bool_428_, class522_sub2_sub1, (int) f_438_, (int) f_439_, f_432_, (int) (f_440_ < f_438_ ? f_438_ - f_440_ : f_440_ - f_438_));
					}
				}
			}
		}
	}

	public Class167 method3115(Class179 class179, int i, int i_441_, int i_442_, int i_443_) {
		return new Class167_Sub1(this, class179, i, i_442_, i_443_, i_441_);
	}

	void method15428(boolean bool, boolean bool_444_, boolean bool_445_, int i, int i_446_, float f, int i_447_, int i_448_, short i_449_, int i_450_, int i_451_, int i_452_) {
		if (0 != i_447_ && i_448_ != 0) {
			if (i_449_ != -1) {
				Class177 class177 = aClass172_1916.method2895(i_449_, -1441983273);
				if (!class177.aBool1876) {
					if (anInt9838 * 782405937 != i_449_) {
						Class148 class148 = ((Class148) aClass209_9835.method3767((long) i_449_));
						if (null == class148) {
							int[] is = method15413(i_449_);
							if (is == null)
								return;
							int i_453_ = class177.anInt1913 * 1075916655;
							class148 = method3103(is, 0, i_453_, i_453_, i_453_, -1726847792);
							aClass209_9835.method3770(class148, (long) i_449_);
						}
						anInt9838 = i_449_ * -646371375;
						aClass148_9837 = class148;
					}
					((Class148_Sub1) aClass148_9837).method14403(bool, bool_444_, bool_445_, i - i_447_, i_446_ - i_448_, f, i_447_ << 1, i_448_ << 1, i_451_, i_450_, i_452_, 1, class177.aClass593_1884 != Class593.aClass593_7811);
					return;
				}
			}
			method15466(bool_444_, i, i_446_, f, i_447_, i_450_, i_452_);
		}
	}

	public void method3286(int i) {
		/* empty */
	}

	void method3190(int i, int i_454_, int i_455_, int i_456_, int i_457_) {
		if (null != anIntArray9804 && (i >= anInt9815 * -1373518821 && i < anInt9809 * -272361347)) {
			if (i_454_ < -695823527 * anInt9810) {
				i_455_ -= anInt9810 * -695823527 - i_454_;
				i_454_ = -695823527 * anInt9810;
			}
			if (i_455_ + i_454_ > 489020741 * anInt9826)
				i_455_ = anInt9826 * 489020741 - i_454_;
			int i_458_ = 1013077751 * anInt9825 * i_454_ + i;
			int i_459_ = i_456_ >>> 24;
			if (0 == i_457_ || i_457_ == 1 && i_459_ == 255) {
				for (int i_460_ = 0; i_460_ < i_455_; i_460_++)
					anIntArray9804[anInt9825 * 1013077751 * i_460_ + i_458_] = i_456_;
			} else if (i_457_ == 1) {
				i_456_ = (((i_456_ & 0xff00) * i_459_ >> 8 & 0xff00) + ((i_456_ & 0xff00ff) * i_459_ >> 8 & 0xff00ff) + (i_459_ << 24));
				int i_461_ = 256 - i_459_;
				for (int i_462_ = 0; i_462_ < i_455_; i_462_++) {
					int i_463_ = 1013077751 * anInt9825 * i_462_ + i_458_;
					int i_464_ = anIntArray9804[i_463_];
					i_464_ = ((i_461_ * (i_464_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_464_ & 0xff00) * i_461_ >> 8 & 0xff00));
					anIntArray9804[i_463_] = i_464_ + i_456_;
				}
			} else if (2 == i_457_) {
				for (int i_465_ = 0; i_465_ < i_455_; i_465_++) {
					int i_466_ = 1013077751 * anInt9825 * i_465_ + i_458_;
					int i_467_ = anIntArray9804[i_466_];
					int i_468_ = i_467_ + i_456_;
					int i_469_ = (i_467_ & 0xff00ff) + (i_456_ & 0xff00ff);
					i_467_ = (i_468_ - i_469_ & 0x10000) + (i_469_ & 0x1000100);
					anIntArray9804[i_466_] = i_468_ - i_467_ | i_467_ - (i_467_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public Class435 method3122() {
		return new Class435(aClass435_9818);
	}

	public long method3215(int i, int i_470_) {
		return 0L;
	}

	public int method3094(int i, int i_471_, int i_472_, int i_473_, int i_474_, int i_475_) {
		int i_476_ = 0;
		float f = ((float) i_472_ * aClass441_9821.aFloatArray4916[10] + ((float) i * aClass441_9821.aFloatArray4916[2] + aClass441_9821.aFloatArray4916[14] + (float) i_471_ * aClass441_9821.aFloatArray4916[6]));
		float f_477_ = ((float) i_475_ * aClass441_9821.aFloatArray4916[10] + ((float) i_473_ * aClass441_9821.aFloatArray4916[2] + aClass441_9821.aFloatArray4916[14] + aClass441_9821.aFloatArray4916[6] * (float) i_474_));
		float f_478_ = (aClass441_9821.aFloatArray4916[7] * (float) i_471_ + ((float) i * aClass441_9821.aFloatArray4916[3] + aClass441_9821.aFloatArray4916[15]) + (float) i_472_ * aClass441_9821.aFloatArray4916[11]);
		float f_479_ = (aClass441_9821.aFloatArray4916[15] + (float) i_473_ * aClass441_9821.aFloatArray4916[3] + aClass441_9821.aFloatArray4916[7] * (float) i_474_ + (float) i_475_ * aClass441_9821.aFloatArray4916[11]);
		if (f < -f_478_ && f_477_ < -f_479_)
			i_476_ |= 0x10;
		else if (f > f_478_ && f_477_ > f_479_)
			i_476_ |= 0x20;
		float f_480_ = (aClass441_9821.aFloatArray4916[8] * (float) i_472_ + (aClass441_9821.aFloatArray4916[4] * (float) i_471_ + (aClass441_9821.aFloatArray4916[12] + aClass441_9821.aFloatArray4916[0] * (float) i)));
		float f_481_ = ((float) i_474_ * aClass441_9821.aFloatArray4916[4] + (aClass441_9821.aFloatArray4916[12] + (float) i_473_ * aClass441_9821.aFloatArray4916[0]) + aClass441_9821.aFloatArray4916[8] * (float) i_475_);
		if (f_480_ < -f_478_ && f_481_ < -f_479_)
			i_476_ |= 0x1;
		if (f_480_ > f_478_ && f_481_ > f_479_)
			i_476_ |= 0x2;
		float f_482_ = (aClass441_9821.aFloatArray4916[1] * (float) i + aClass441_9821.aFloatArray4916[13] + aClass441_9821.aFloatArray4916[5] * (float) i_471_ + aClass441_9821.aFloatArray4916[9] * (float) i_472_);
		float f_483_ = (aClass441_9821.aFloatArray4916[13] + (float) i_473_ * aClass441_9821.aFloatArray4916[1] + aClass441_9821.aFloatArray4916[5] * (float) i_474_ + (float) i_475_ * aClass441_9821.aFloatArray4916[9]);
		if (f_482_ < -f_478_ && f_483_ < -f_479_)
			i_476_ |= 0x4;
		if (f_482_ > f_478_ && f_483_ > f_479_)
			i_476_ |= 0x8;
		return i_476_;
	}

	public Class435 method3291() {
		Class99 class99 = method15475(Thread.currentThread());
		return class99.aClass435_1199;
	}

	public Interface22 method3050(int i, int i_484_, Class158 class158, Class170 class170, int i_485_) {
		return method15432(i, i_484_);
	}

	public void method3128(int i) {
		/* empty */
	}

	public void method3349(int i, int i_486_, int i_487_) {
		for (int i_488_ = 0; i_488_ < aClass99Array9836.length; i_488_++) {
			Class99 class99 = aClass99Array9836[i_488_];
			class99.anInt1192 = (i & 0xffffff) * 1830757045;
			int i_489_ = class99.anInt1192 * 340278173 >>> 16 & 0xff;
			if (i_489_ < 2)
				i_489_ = 2;
			int i_490_ = 340278173 * class99.anInt1192 >> 8 & 0xff;
			if (i_490_ < 2)
				i_490_ = 2;
			int i_491_ = class99.anInt1192 * 340278173 & 0xff;
			if (i_491_ < 2)
				i_491_ = 2;
			class99.anInt1192 = 1830757045 * (i_489_ << 16 | i_490_ << 8 | i_491_);
			if (i_486_ < 0)
				class99.aBool1189 = false;
			else
				class99.aBool1189 = true;
		}
	}

	void method15429() {
		aClass441_9811.method7090(aClass435_9818);
		aClass441_9821.method7086(aClass441_9811);
		aClass441_9821.method7089(aClass441_9805);
		aClass441_9821.method7114(aFloatArrayArray9822[0]);
		aClass441_9821.method7111(aFloatArrayArray9822[1]);
		aClass441_9821.method7106(aFloatArrayArray9822[2]);
		aClass441_9821.method7107(aFloatArrayArray9822[3]);
		aClass441_9821.method7123(aFloatArrayArray9822[4]);
		aClass441_9821.method7184(aFloatArrayArray9822[5]);
		float f = aClass441_9805.method7105();
		float f_492_ = (aClass441_9805.aFloatArray4916[14] + aClass441_9805.aFloatArray4916[10] * (f - 255.0F));
		float f_493_ = (aClass441_9805.aFloatArray4916[14] + f * aClass441_9805.aFloatArray4916[10]);
		float f_494_ = f_493_ - f_492_;
		for (int i = 0; i < 1353126165 * anInt9819; i++) {
			Class99 class99 = aClass99Array9836[i];
			class99.aFloat1205 = f_492_;
			class99.aFloat1191 = f_494_;
		}
	}

	public void method3197(int[] is) {
		is[0] = anInt9825 * 1013077751;
		is[1] = 719529481 * anInt9806;
	}

	public Class185 method3134(Class185 class185, Class185 class185_495_, float f, Class185 class185_496_) {
		return null;
	}

	public void method3135(Class185 class185) {
		/* empty */
	}

	public void method3322(int i, int i_497_, int i_498_, int i_499_) {
		/* empty */
	}

	public void method3137(int i, int i_500_) {
		/* empty */
	}

	public boolean method3138() {
		return false;
	}

	public boolean method3139() {
		return false;
	}

	public void method3398(float f, float f_501_, float f_502_, float f_503_, float f_504_) {
		/* empty */
	}

	public Class165 method3141(int[] is) {
		return null;
	}

	public boolean method3029() {
		return false;
	}

	Class593 method15430(int i) {
		return aClass172_1916.method2895(i, -398233285).aClass593_1884;
	}

	public boolean method3144() {
		return false;
	}

	public void method3145() {
		/* empty */
	}

	public boolean method3198() {
		return false;
	}

	void method3018(float f, float f_505_, float f_506_, float f_507_, float f_508_, float f_509_) {
		/* empty */
	}

	public void method3149(int i, Class163 class163) {
		for (int i_510_ = 0; i_510_ < aClass99Array9836.length; i_510_++) {
			aClass99Array9836[i_510_].anInt1210 = aClass99Array9836[i_510_].anInt1192 * -1038647055;
			aClass99Array9836[i_510_].anInt1195 = i * -1423986471;
			aClass99Array9836[i_510_].anInt1192 = class163.anInt1776 * -759703469;
			aClass99Array9836[i_510_].anInt1196 = class163.anInt1775 * -212138725;
			aClass99Array9836[i_510_].aBool1204 = true;
		}
	}

	public void method3150(int i, Class163 class163) {
		Class99 class99 = method15475(Thread.currentThread());
		class99.anInt1195 = i * -1423986471;
		class99.anInt1192 = class163.anInt1776 * -759703469;
		class99.anInt1196 = class163.anInt1775 * -212138725;
	}

	public void method3323() {
		for (int i = 0; i < aClass99Array9836.length; i++) {
			aClass99Array9836[i].anInt1192 = aClass99Array9836[i].anInt1210 * 611807249;
			aClass99Array9836[i].aBool1204 = false;
		}
	}

	Interface22 method15431(int i, int i_511_) {
		return new Class102(i, i_511_);
	}

	public void method3153(float f, float f_512_, float f_513_, float[] fs) {
		float f_514_ = (aClass441_9821.aFloatArray4916[15] + f * aClass441_9821.aFloatArray4916[3] + f_512_ * aClass441_9821.aFloatArray4916[7] + aClass441_9821.aFloatArray4916[11] * f_513_);
		float f_515_ = (f_513_ * aClass441_9821.aFloatArray4916[8] + (f_512_ * aClass441_9821.aFloatArray4916[4] + (aClass441_9821.aFloatArray4916[12] + f * aClass441_9821.aFloatArray4916[0])));
		float f_516_ = (f_513_ * aClass441_9821.aFloatArray4916[9] + (f_512_ * aClass441_9821.aFloatArray4916[5] + (aClass441_9821.aFloatArray4916[13] + aClass441_9821.aFloatArray4916[1] * f)));
		float f_517_ = (aClass441_9811.aFloatArray4916[10] * f_513_ + (aClass441_9811.aFloatArray4916[6] * f_512_ + (aClass441_9811.aFloatArray4916[14] + f * aClass441_9811.aFloatArray4916[2])));
		fs[0] = aFloat9827 * f_515_ / f_514_ + aFloat9828;
		fs[1] = aFloat9830 + aFloat9829 * f_516_ / f_514_;
		fs[2] = f_517_;
	}

	public void method3152(float f, float f_518_, float f_519_, float[] fs) {
		float f_520_ = (f_519_ * aClass441_9821.aFloatArray4916[10] + (aClass441_9821.aFloatArray4916[14] + aClass441_9821.aFloatArray4916[2] * f + aClass441_9821.aFloatArray4916[6] * f_518_));
		float f_521_ = (f * aClass441_9821.aFloatArray4916[3] + aClass441_9821.aFloatArray4916[15] + f_518_ * aClass441_9821.aFloatArray4916[7] + aClass441_9821.aFloatArray4916[11] * f_519_);
		if (f_520_ < -f_521_ || f_520_ > f_521_) {
			float[] fs_522_ = fs;
			float[] fs_523_ = fs;
			fs[2] = Float.NaN;
			fs_523_[1] = Float.NaN;
			fs_522_[0] = Float.NaN;
		} else {
			float f_524_ = (aClass441_9821.aFloatArray4916[4] * f_518_ + (aClass441_9821.aFloatArray4916[0] * f + aClass441_9821.aFloatArray4916[12]) + f_519_ * aClass441_9821.aFloatArray4916[8]);
			if (f_524_ < -f_521_ || f_524_ > f_521_) {
				float[] fs_525_ = fs;
				float[] fs_526_ = fs;
				fs[2] = Float.NaN;
				fs_526_[1] = Float.NaN;
				fs_525_[0] = Float.NaN;
			} else {
				float f_527_ = (f_519_ * aClass441_9821.aFloatArray4916[9] + (aClass441_9821.aFloatArray4916[13] + aClass441_9821.aFloatArray4916[1] * f + f_518_ * aClass441_9821.aFloatArray4916[5]));
				if (f_527_ < -f_521_ || f_527_ > f_521_) {
					float[] fs_528_ = fs;
					float[] fs_529_ = fs;
					fs[2] = Float.NaN;
					fs_529_[1] = Float.NaN;
					fs_528_[0] = Float.NaN;
				} else {
					float f_530_ = (aClass441_9811.aFloatArray4916[14] + aClass441_9811.aFloatArray4916[2] * f + f_518_ * aClass441_9811.aFloatArray4916[6] + f_519_ * aClass441_9811.aFloatArray4916[10]);
					fs[0] = aFloat9828 + f_524_ * aFloat9827 / f_521_;
					fs[1] = aFloat9830 + f_527_ * aFloat9829 / f_521_;
					fs[2] = f_530_;
				}
			}
		}
	}

	public Class148 method3278(int i, int i_531_, boolean bool, boolean bool_532_) {
		if (bool)
			return new Class148_Sub1_Sub1(this, i, i_531_);
		return new Class148_Sub1_Sub3(this, i, i_531_);
	}

	Interface22 method15432(int i, int i_533_) {
		return new Class102(i, i_533_);
	}

	public void method3295(int i, Class523_Sub20[] class523_sub20s) {
		/* empty */
	}

	public Interface23 method3051(int i, int i_534_) {
		return new Class140(i, i_534_);
	}

	public Interface23 method3049(int i, int i_535_, int i_536_) {
		return new Class140(i, i_535_);
	}

	void method3158(int i, int i_537_) throws Exception_Sub4 {
		aClass168_Sub2_1939.method15401(i, i_537_);
		if (null != anInterface25_1923)
			anInterface25_1923.method20(1230076268);
	}

	void method3159(int i, int i_538_) throws Exception_Sub4 {
		aClass168_Sub2_1939.method15401(i, i_538_);
		if (null != anInterface25_1923)
			anInterface25_1923.method20(1188722370);
	}

	public void method3219() {
		/* empty */
	}

	public void method3283() {
		/* empty */
	}

	void method3073() {
		if (aBool9803) {
			Class305.method5552(true, false, (byte) 0);
			aBool9803 = false;
		}
		aBool9812 = true;
	}

	public void method3163(int i) {
		int i_539_ = i - 1258621393 * anInt9802;
		for (Class523_Sub26 class523_sub26 = (Class523_Sub26) aClass209_9808.method3777(809863981); class523_sub26 != null; class523_sub26 = (Class523_Sub26) aClass209_9808.method3795((byte) 0)) {
			if (class523_sub26.aBool10545) {
				class523_sub26.anInt10548 += i_539_;
				int i_540_ = class523_sub26.anInt10548 / 50;
				if (i_540_ > 0) {
					Class177 class177 = aClass172_1916.method2895(class523_sub26.anInt10549, -1172185798);
					float f = (float) (class177.anInt1913 * 1075916655);
					class523_sub26.method16143((int) (f * ((float) class177.aByte1885 * ((float) i_539_ / 1000.0F) / 64.0F)), (int) (f * ((float) i_539_ / 1000.0F * (float) class177.aByte1886 / 64.0F)));
					class523_sub26.anInt10548 -= i_540_ * 50;
				}
				class523_sub26.aBool10545 = false;
			}
		}
		anInt9802 = i * 447737649;
		aClass209_9835.method3772(5, (byte) -44);
		aClass209_9808.method3772(5, (byte) -87);
	}

	public void method3164(int i) {
		int i_541_ = i - 1258621393 * anInt9802;
		for (Class523_Sub26 class523_sub26 = (Class523_Sub26) aClass209_9808.method3777(809863981); class523_sub26 != null; class523_sub26 = (Class523_Sub26) aClass209_9808.method3795((byte) 0)) {
			if (class523_sub26.aBool10545) {
				class523_sub26.anInt10548 += i_541_;
				int i_542_ = class523_sub26.anInt10548 / 50;
				if (i_542_ > 0) {
					Class177 class177 = aClass172_1916.method2895(class523_sub26.anInt10549, 82303054);
					float f = (float) (class177.anInt1913 * 1075916655);
					class523_sub26.method16143((int) (f * ((float) class177.aByte1885 * ((float) i_541_ / 1000.0F) / 64.0F)), (int) (f * ((float) i_541_ / 1000.0F * (float) class177.aByte1886 / 64.0F)));
					class523_sub26.anInt10548 -= i_542_ * 50;
				}
				class523_sub26.aBool10545 = false;
			}
		}
		anInt9802 = i * 447737649;
		aClass209_9835.method3772(5, (byte) -11);
		aClass209_9808.method3772(5, (byte) -89);
	}

	public void method3165(int i) {
		int i_543_ = i - 1258621393 * anInt9802;
		for (Class523_Sub26 class523_sub26 = (Class523_Sub26) aClass209_9808.method3777(809863981); class523_sub26 != null; class523_sub26 = (Class523_Sub26) aClass209_9808.method3795((byte) 0)) {
			if (class523_sub26.aBool10545) {
				class523_sub26.anInt10548 += i_543_;
				int i_544_ = class523_sub26.anInt10548 / 50;
				if (i_544_ > 0) {
					Class177 class177 = aClass172_1916.method2895(class523_sub26.anInt10549, -1035975437);
					float f = (float) (class177.anInt1913 * 1075916655);
					class523_sub26.method16143((int) (f * ((float) class177.aByte1885 * ((float) i_543_ / 1000.0F) / 64.0F)), (int) (f * ((float) i_543_ / 1000.0F * (float) class177.aByte1886 / 64.0F)));
					class523_sub26.anInt10548 -= i_544_ * 50;
				}
				class523_sub26.aBool10545 = false;
			}
		}
		anInt9802 = i * 447737649;
		aClass209_9835.method3772(5, (byte) -79);
		aClass209_9808.method3772(5, (byte) -77);
	}

	void method3468(float f, float f_545_, float f_546_, float f_547_, float f_548_, float f_549_) {
		/* empty */
	}

	public int method3167() {
		return 0;
	}

	public int method3168() {
		return 0;
	}

	public void method3373(int i, float f, float f_550_, float f_551_, float f_552_, float f_553_) {
		anInt9831 = 1873346827 * (int) (65535.0F * f);
		anInt9816 = (int) (f_550_ * 65535.0F) * 854537707;
		float f_554_ = (float) Math.sqrt((double) (f_553_ * f_553_ + (f_552_ * f_552_ + f_551_ * f_551_)));
		anInt9839 = 1932822005 * (int) (f_551_ * 65535.0F / f_554_);
		anInt9813 = -1909988257 * (int) (f_552_ * 65535.0F / f_554_);
		anInt9834 = (int) (f_553_ * 65535.0F / f_554_) * -280820989;
	}

	void method15433() {
		int i = -272361347 * anInt9809 - anInt9815 * -1373518821;
		int i_555_ = 489020741 * anInt9826 - -695823527 * anInt9810;
		float f = aFloat9827 = (float) (anInt9801 * -165927661) / 2.0F;
		float f_556_ = aFloat9829 = (float) (-13552761 * anInt9820) / 2.0F;
		aFloat9828 = (float) (1383519939 * anInt9823) + f;
		aFloat9830 = f_556_ + (float) (anInt9824 * -1740822397);
		for (int i_557_ = 0; i_557_ < 1353126165 * anInt9819; i_557_++) {
			Class99 class99 = aClass99Array9836[i_557_];
			Class118 class118 = class99.aClass118_1200;
			class118.aFloat1469 = f;
			class118.aFloat1444 = f_556_;
			class118.aFloat1442 = aFloat9828 - (float) (-1373518821 * anInt9815);
			class118.aFloat1473 = aFloat9830 - (float) (-695823527 * anInt9810);
			class118.anInt1448 = i;
			class118.anInt1449 = i_555_;
		}
		int i_558_ = (anInt9825 * 1013077751 * (-695823527 * anInt9810) + -1373518821 * anInt9815);
		for (int i_559_ = anInt9810 * -695823527; i_559_ < anInt9826 * 489020741; i_559_++) {
			for (int i_560_ = 0; i_560_ < anInt9819 * 1353126165; i_560_++)
				aClass99Array9836[i_560_].aClass118_1200.anIntArray1441[i_559_ - -695823527 * anInt9810] = i_558_;
			i_558_ += anInt9825 * 1013077751;
		}
	}

	public boolean method3058() {
		return false;
	}

	boolean method15434() {
		return aBool9812;
	}

	boolean method15435() {
		return aBool9812;
	}

	int[] method15436(int i) {
		Class523_Sub26 class523_sub26;
		synchronized (aClass209_9808) {
			class523_sub26 = ((Class523_Sub26) aClass209_9808.method3767((long) (i & 0xffff) | ~0x7fffffffffffffffL));
			if (null == class523_sub26) {
				Class177 class177 = aClass172_1916.method2895(i, 70902579);
				int i_561_ = class177.anInt1913 * 1075916655;
				if (!anInterface25_1923.method136(Class601.aClass601_7850, i, Class608.aClass608_7988, 0.7F, i_561_, i_561_, true, (short) -7870)) {
					int[] is = null;
					return is;
				}
				int[] is;
				if (Class593.aClass593_7813 != class177.aClass593_1884)
					is = anInterface25_1923.method138(Class601.aClass601_7850, i, 0.7F, i_561_, i_561_, true, 1807365616);
				else
					is = anInterface25_1923.method137(Class601.aClass601_7850, i, 0.7F, i_561_, i_561_, true, (byte) 0);
				class523_sub26 = new Class523_Sub26(i, i_561_, is, (class177.aClass593_1884 != Class593.aClass593_7812));
				aClass209_9808.method3764(class523_sub26, ((long) (i & 0xffff) | ~0x7fffffffffffffffL), i_561_ * i_561_, -34193569);
			}
		}
		class523_sub26.aBool10545 = true;
		return class523_sub26.method16144();
	}

	int[] method15437(int i) {
		Class523_Sub26 class523_sub26;
		synchronized (aClass209_9808) {
			class523_sub26 = ((Class523_Sub26) aClass209_9808.method3767((long) (i & 0xffff) | ~0x7fffffffffffffffL));
			if (null == class523_sub26) {
				Class177 class177 = aClass172_1916.method2895(i, -1244267575);
				int i_562_ = class177.anInt1913 * 1075916655;
				if (!anInterface25_1923.method136(Class601.aClass601_7850, i, Class608.aClass608_7988, 0.7F, i_562_, i_562_, true, (short) -21981)) {
					int[] is = null;
					return is;
				}
				int[] is;
				if (Class593.aClass593_7813 != class177.aClass593_1884)
					is = anInterface25_1923.method138(Class601.aClass601_7850, i, 0.7F, i_562_, i_562_, true, 1973312713);
				else
					is = anInterface25_1923.method137(Class601.aClass601_7850, i, 0.7F, i_562_, i_562_, true, (byte) 0);
				class523_sub26 = new Class523_Sub26(i, i_562_, is, (class177.aClass593_1884 != Class593.aClass593_7812));
				aClass209_9808.method3764(class523_sub26, ((long) (i & 0xffff) | ~0x7fffffffffffffffL), i_562_ * i_562_, 89084372);
			}
		}
		class523_sub26.aBool10545 = true;
		return class523_sub26.method16144();
	}

	int[] method15438(int i) {
		Class523_Sub26 class523_sub26;
		synchronized (aClass209_9808) {
			class523_sub26 = ((Class523_Sub26) aClass209_9808.method3767((long) (i & 0xffff) | ~0x7fffffffffffffffL));
			if (null == class523_sub26) {
				Class177 class177 = aClass172_1916.method2895(i, -379734982);
				int i_563_ = class177.anInt1913 * 1075916655;
				if (!anInterface25_1923.method136(Class601.aClass601_7850, i, Class608.aClass608_7988, 0.7F, i_563_, i_563_, true, (short) -24967)) {
					int[] is = null;
					return is;
				}
				int[] is;
				if (Class593.aClass593_7813 != class177.aClass593_1884)
					is = anInterface25_1923.method138(Class601.aClass601_7850, i, 0.7F, i_563_, i_563_, true, 1616753397);
				else
					is = anInterface25_1923.method137(Class601.aClass601_7850, i, 0.7F, i_563_, i_563_, true, (byte) 0);
				class523_sub26 = new Class523_Sub26(i, i_563_, is, (class177.aClass593_1884 != Class593.aClass593_7812));
				aClass209_9808.method3764(class523_sub26, ((long) (i & 0xffff) | ~0x7fffffffffffffffL), i_563_ * i_563_, 645944771);
			}
		}
		class523_sub26.aBool10545 = true;
		return class523_sub26.method16144();
	}

	public void method3300(Class435 class435) {
		aClass435_9818 = class435;
		method15429();
	}

	Class593 method15439(int i) {
		return aClass172_1916.method2895(i, -1064211977).aClass593_1884;
	}

	Class593 method15440(int i) {
		return aClass172_1916.method2895(i, -2004519452).aClass593_1884;
	}

	public void method3101() {
		aClass168_Sub1_9840 = null;
		aClass148_9814 = null;
	}

	void method15441(int i) {
		aClass99Array9836[i].method1782(Thread.currentThread(), -1249344351);
	}

	byte method15442(int i) {
		return aClass172_1916.method2895(i, -455885594).aByte1889;
	}

	byte method15443(int i) {
		return aClass172_1916.method2895(i, -521341950).aByte1889;
	}

	public void method3277(int i, int i_564_, int i_565_, int i_566_, int i_567_, int i_568_, int i_569_) {
		if (anIntArray9804 != null) {
			Class99 class99 = method15475(Thread.currentThread());
			Class118 class118 = class99.aClass118_1200;
			int i_570_ = i_565_ - i;
			int i_571_ = i_566_ - i_564_;
			int i_572_ = i_570_ >= 0 ? i_570_ : -i_570_;
			int i_573_ = i_571_ >= 0 ? i_571_ : -i_571_;
			int i_574_ = i_572_;
			if (i_574_ < i_573_)
				i_574_ = i_573_;
			if (i_574_ != 0) {
				int i_575_ = (i_570_ << 16) / i_574_;
				int i_576_ = (i_571_ << 16) / i_574_;
				i_570_ += i_575_ >> 16;
				i_571_ += i_576_ >> 16;
				if (i_576_ <= i_575_)
					i_575_ = -i_575_;
				else
					i_576_ = -i_576_;
				int i_577_ = i_576_ * i_568_ >> 17;
				int i_578_ = i_568_ * i_576_ + 1 >> 17;
				int i_579_ = i_568_ * i_575_ >> 17;
				int i_580_ = i_575_ * i_568_ + 1 >> 17;
				i -= class118.method2039();
				i_564_ -= class118.method2054();
				int i_581_ = i + i_577_;
				int i_582_ = i - i_578_;
				int i_583_ = i + i_570_ - i_578_;
				int i_584_ = i_570_ + i + i_577_;
				int i_585_ = i_579_ + i_564_;
				int i_586_ = i_564_ - i_580_;
				int i_587_ = i_571_ + i_564_ - i_580_;
				int i_588_ = i_579_ + (i_564_ + i_571_);
				if (i_569_ == 0)
					class118.anInt1438 = 0;
				else if (1 == i_569_)
					class118.anInt1438 = 255 - (i_567_ >>> 24);
				else
					throw new IllegalArgumentException();
				method3287(false);
				class118.aBool1455 = (i_581_ < 0 || i_581_ > class118.anInt1448 || i_582_ < 0 || i_582_ > class118.anInt1448 || i_583_ < 0 || i_583_ > class118.anInt1448);
				class118.method2037(true, false, false, (float) i_585_, (float) i_586_, (float) i_587_, (float) i_581_, (float) i_582_, (float) i_583_, 100.0F, 100.0F, 100.0F, i_567_);
				class118.aBool1455 = (i_581_ < 0 || i_581_ > class118.anInt1448 || i_583_ < 0 || i_583_ > class118.anInt1448 || i_584_ < 0 || i_584_ > class118.anInt1448);
				class118.method2037(true, false, false, (float) i_585_, (float) i_587_, (float) i_588_, (float) i_581_, (float) i_583_, (float) i_584_, 100.0F, 100.0F, 100.0F, i_567_);
				method3287(true);
			}
		}
	}

	int method15444(int i) {
		return aClass172_1916.method2895(i, -855860218).aShort1907 & 0xffff;
	}

	boolean method15445(int i) {
		Class177 class177 = aClass172_1916.method2895(i, 493916148);
		return 0 != class177.aByte1911 || 0 != class177.aByte1875;
	}

	boolean method15446(int i) {
		Class177 class177 = aClass172_1916.method2895(i, -1070790819);
		return 0 != class177.aByte1911 || 0 != class177.aByte1875;
	}

	public boolean method3170() {
		return false;
	}

	public boolean method3171() {
		return false;
	}

	public boolean method3172() {
		return false;
	}

	public boolean method3173() {
		return false;
	}

	public String method3184() {
		return "";
	}

	public boolean method3017() {
		return false;
	}

	public void method3362(float f, float f_589_, float f_590_, float[] fs) {
		float f_591_ = (f_590_ * aClass441_9821.aFloatArray4916[10] + (aClass441_9821.aFloatArray4916[14] + aClass441_9821.aFloatArray4916[2] * f + aClass441_9821.aFloatArray4916[6] * f_589_));
		float f_592_ = (f * aClass441_9821.aFloatArray4916[3] + aClass441_9821.aFloatArray4916[15] + f_589_ * aClass441_9821.aFloatArray4916[7] + aClass441_9821.aFloatArray4916[11] * f_590_);
		if (f_591_ < -f_592_ || f_591_ > f_592_) {
			float[] fs_593_ = fs;
			float[] fs_594_ = fs;
			fs[2] = Float.NaN;
			fs_594_[1] = Float.NaN;
			fs_593_[0] = Float.NaN;
		} else {
			float f_595_ = (aClass441_9821.aFloatArray4916[4] * f_589_ + (aClass441_9821.aFloatArray4916[0] * f + aClass441_9821.aFloatArray4916[12]) + f_590_ * aClass441_9821.aFloatArray4916[8]);
			if (f_595_ < -f_592_ || f_595_ > f_592_) {
				float[] fs_596_ = fs;
				float[] fs_597_ = fs;
				fs[2] = Float.NaN;
				fs_597_[1] = Float.NaN;
				fs_596_[0] = Float.NaN;
			} else {
				float f_598_ = (f_590_ * aClass441_9821.aFloatArray4916[9] + (aClass441_9821.aFloatArray4916[13] + aClass441_9821.aFloatArray4916[1] * f + f_589_ * aClass441_9821.aFloatArray4916[5]));
				if (f_598_ < -f_592_ || f_598_ > f_592_) {
					float[] fs_599_ = fs;
					float[] fs_600_ = fs;
					fs[2] = Float.NaN;
					fs_600_[1] = Float.NaN;
					fs_599_[0] = Float.NaN;
				} else {
					float f_601_ = (aClass441_9811.aFloatArray4916[14] + aClass441_9811.aFloatArray4916[2] * f + f_589_ * aClass441_9811.aFloatArray4916[6] + f_590_ * aClass441_9811.aFloatArray4916[10]);
					fs[0] = aFloat9828 + f_595_ * aFloat9827 / f_592_;
					fs[1] = aFloat9830 + f_598_ * aFloat9829 / f_592_;
					fs[2] = f_601_;
				}
			}
		}
	}

	public boolean method3177() {
		return false;
	}

	void method3087(int i, int i_602_, int i_603_, int i_604_, int i_605_) {
		if (null != anIntArray9804 && (i_602_ >= anInt9810 * -695823527 && i_602_ < 489020741 * anInt9826)) {
			if (i < anInt9815 * -1373518821) {
				i_603_ -= -1373518821 * anInt9815 - i;
				i = -1373518821 * anInt9815;
			}
			if (i_603_ + i > -272361347 * anInt9809)
				i_603_ = -272361347 * anInt9809 - i;
			int i_606_ = i + anInt9825 * 1013077751 * i_602_;
			int i_607_ = i_604_ >>> 24;
			if (0 == i_605_ || 1 == i_605_ && 255 == i_607_) {
				for (int i_608_ = 0; i_608_ < i_603_; i_608_++)
					anIntArray9804[i_608_ + i_606_] = i_604_;
			} else if (i_605_ == 1) {
				i_604_ = ((i_607_ * (i_604_ & 0xff00) >> 8 & 0xff00) + (i_607_ * (i_604_ & 0xff00ff) >> 8 & 0xff00ff) + (i_607_ << 24));
				int i_609_ = 256 - i_607_;
				for (int i_610_ = 0; i_610_ < i_603_; i_610_++) {
					int i_611_ = anIntArray9804[i_610_ + i_606_];
					i_611_ = (((i_611_ & 0xff00ff) * i_609_ >> 8 & 0xff00ff) + (i_609_ * (i_611_ & 0xff00) >> 8 & 0xff00));
					anIntArray9804[i_610_ + i_606_] = i_604_ + i_611_;
				}
			} else if (i_605_ == 2) {
				for (int i_612_ = 0; i_612_ < i_603_; i_612_++) {
					int i_613_ = anIntArray9804[i_606_ + i_612_];
					int i_614_ = i_604_ + i_613_;
					int i_615_ = (i_613_ & 0xff00ff) + (i_604_ & 0xff00ff);
					i_613_ = (i_614_ - i_615_ & 0x10000) + (i_615_ & 0x1000100);
					anIntArray9804[i_606_ + i_612_] = i_614_ - i_613_ | i_613_ - (i_613_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	void method15447(int i) {
		anInt9819 = 81573437 * i;
		aClass99Array9836 = new Class99[1353126165 * anInt9819];
		for (int i_616_ = 0; i_616_ < 1353126165 * anInt9819; i_616_++)
			aClass99Array9836[i_616_] = new Class99(this);
	}

	public boolean method3180() {
		return true;
	}

	public boolean method3181() {
		return true;
	}

	public String method3182() {
		return "";
	}

	public void method3335(float f, float f_617_) {
		aFloat9833 = f_617_ - f;
		aFloat9832 = f + f_617_ - 1.0F;
		for (int i = 0; i < 1353126165 * anInt9819; i++) {
			Class99 class99 = aClass99Array9836[i];
			Class118 class118 = class99.aClass118_1200;
			class118.aFloat1447 = aFloat9833;
			class118.aFloat1458 = aFloat9832;
		}
	}

	public void method3359(float f, float f_618_, float f_619_, float[] fs) {
		float f_620_ = (aClass441_9821.aFloatArray4916[15] + f * aClass441_9821.aFloatArray4916[3] + f_618_ * aClass441_9821.aFloatArray4916[7] + aClass441_9821.aFloatArray4916[11] * f_619_);
		float f_621_ = (f_619_ * aClass441_9821.aFloatArray4916[8] + (f_618_ * aClass441_9821.aFloatArray4916[4] + (aClass441_9821.aFloatArray4916[12] + f * aClass441_9821.aFloatArray4916[0])));
		float f_622_ = (f_619_ * aClass441_9821.aFloatArray4916[9] + (f_618_ * aClass441_9821.aFloatArray4916[5] + (aClass441_9821.aFloatArray4916[13] + aClass441_9821.aFloatArray4916[1] * f)));
		float f_623_ = (aClass441_9811.aFloatArray4916[10] * f_619_ + (aClass441_9811.aFloatArray4916[6] * f_618_ + (aClass441_9811.aFloatArray4916[14] + f * aClass441_9811.aFloatArray4916[2])));
		fs[0] = aFloat9827 * f_621_ / f_620_ + aFloat9828;
		fs[1] = aFloat9830 + aFloat9829 * f_622_ / f_620_;
		fs[2] = f_623_;
	}

	public Class164 method3111(Class10 class10, Class175[] class175s, boolean bool) {
		int[] is = new int[class175s.length];
		int[] is_624_ = new int[class175s.length];
		boolean bool_625_ = false;
		boolean bool_626_ = false;
		for (int i = 0; i < class175s.length; i++) {
			is[i] = class175s[i].method2944();
			is_624_[i] = class175s[i].method2945();
			if (class175s[i].method2943())
				bool_625_ = true;
			if (class175s[i].method2942())
				bool_626_ = true;
		}
		if (bool) {
			if (bool_626_) {
				if (bool_625_)
					return new Class164_Sub1(this, class10, (Class175_Sub2[]) class175s, is, is_624_);
				return new Class164_Sub5(this, class10, (Class175_Sub2[]) class175s, is, is_624_);
			}
			if (bool_625_)
				return new Class164_Sub1(this, class10, (Class175_Sub1[]) class175s, is, is_624_);
			return new Class164_Sub5(this, class10, (Class175_Sub1[]) class175s, is, is_624_);
		}
		if (bool_626_) {
			if (bool_625_)
				throw new IllegalArgumentException("");
			return new Class164_Sub2(this, class10, (Class175_Sub2[]) class175s, is, is_624_);
		}
		return new Class164_Sub3(this, class10, (Class175_Sub1[]) class175s, is, is_624_);
	}

	public int[] method3320() {
		return null;
	}

	Class99 method15448(Runnable runnable) {
		for (int i = 0; i < 1353126165 * anInt9819; i++) {
			if (aClass99Array9836[i].aRunnable1187 == runnable)
				return aClass99Array9836[i];
		}
		return null;
	}

	public void method3188(boolean bool) {
		/* empty */
	}

	public void method3189(boolean bool) {
		/* empty */
	}

	int method15449(int i) {
		return (aClass172_1916.method2895(i, -1152285839).anInt1913 * 1075916655);
	}

	public void method3191(boolean bool) {
		/* empty */
	}

	Class168_Sub2 method3243(Canvas canvas, int i, int i_627_) {
		return Class523_Sub10.method15945(this, canvas, i, i_627_, 573278900);
	}

	void method15450(int i, int i_628_, int[] is, float[] fs) {
		anInt9825 = 791497415 * i;
		anInt9806 = -1989523399 * i_628_;
		anIntArray9804 = is;
		aFloatArray9807 = fs;
		for (int i_629_ = 0; i_629_ < anInt9819 * 1353126165; i_629_++)
			aClass99Array9836[i_629_].method1781((short) 20579);
		method3071();
		method3067();
	}

	void method15451(int i, int i_630_, int[] is, float[] fs) {
		anInt9825 = 791497415 * i;
		anInt9806 = -1989523399 * i_630_;
		anIntArray9804 = is;
		aFloatArray9807 = fs;
		for (int i_631_ = 0; i_631_ < anInt9819 * 1353126165; i_631_++)
			aClass99Array9836[i_631_].method1781((short) 3538);
		method3071();
		method3067();
	}

	public void method3142() {
		/* empty */
	}

	public void method3400(float f, float f_632_, float f_633_, float f_634_, float f_635_) {
		/* empty */
	}

	public void method3318(float f, float f_636_, float f_637_, float[] fs) {
		float f_638_ = (f_637_ * aClass441_9821.aFloatArray4916[10] + (aClass441_9821.aFloatArray4916[14] + aClass441_9821.aFloatArray4916[2] * f + aClass441_9821.aFloatArray4916[6] * f_636_));
		float f_639_ = (f * aClass441_9821.aFloatArray4916[3] + aClass441_9821.aFloatArray4916[15] + f_636_ * aClass441_9821.aFloatArray4916[7] + aClass441_9821.aFloatArray4916[11] * f_637_);
		if (f_638_ < -f_639_ || f_638_ > f_639_) {
			float[] fs_640_ = fs;
			float[] fs_641_ = fs;
			fs[2] = Float.NaN;
			fs_641_[1] = Float.NaN;
			fs_640_[0] = Float.NaN;
		} else {
			float f_642_ = (aClass441_9821.aFloatArray4916[4] * f_636_ + (aClass441_9821.aFloatArray4916[0] * f + aClass441_9821.aFloatArray4916[12]) + f_637_ * aClass441_9821.aFloatArray4916[8]);
			if (f_642_ < -f_639_ || f_642_ > f_639_) {
				float[] fs_643_ = fs;
				float[] fs_644_ = fs;
				fs[2] = Float.NaN;
				fs_644_[1] = Float.NaN;
				fs_643_[0] = Float.NaN;
			} else {
				float f_645_ = (f_637_ * aClass441_9821.aFloatArray4916[9] + (aClass441_9821.aFloatArray4916[13] + aClass441_9821.aFloatArray4916[1] * f + f_636_ * aClass441_9821.aFloatArray4916[5]));
				if (f_645_ < -f_639_ || f_645_ > f_639_) {
					float[] fs_646_ = fs;
					float[] fs_647_ = fs;
					fs[2] = Float.NaN;
					fs_647_[1] = Float.NaN;
					fs_646_[0] = Float.NaN;
				} else {
					float f_648_ = (aClass441_9811.aFloatArray4916[14] + aClass441_9811.aFloatArray4916[2] * f + f_636_ * aClass441_9811.aFloatArray4916[6] + f_637_ * aClass441_9811.aFloatArray4916[10]);
					fs[0] = aFloat9828 + f_642_ * aFloat9827 / f_639_;
					fs[1] = aFloat9830 + f_645_ * aFloat9829 / f_639_;
					fs[2] = f_648_;
				}
			}
		}
	}

	public void method3196(int[] is) {
		is[0] = anInt9825 * 1013077751;
		is[1] = 719529481 * anInt9806;
	}

	boolean method3123(int i, int i_649_, int i_650_, int i_651_, Class435 class435, Class430 class430) {
		Class441 class441 = method3112();
		class441.method7090(class435);
		class441.method7089(aClass441_9821);
		return class430.method6786(i, i_649_, i_650_, i_651_, class441, aFloat9828, aFloat9830, aFloat9827, aFloat9829);
	}

	void method3209(int i, int i_652_, int i_653_, int i_654_, int i_655_) {
		if (null != anIntArray9804 && (i >= anInt9815 * -1373518821 && i < anInt9809 * -272361347)) {
			if (i_652_ < -695823527 * anInt9810) {
				i_653_ -= anInt9810 * -695823527 - i_652_;
				i_652_ = -695823527 * anInt9810;
			}
			if (i_653_ + i_652_ > 489020741 * anInt9826)
				i_653_ = anInt9826 * 489020741 - i_652_;
			int i_656_ = 1013077751 * anInt9825 * i_652_ + i;
			int i_657_ = i_654_ >>> 24;
			if (0 == i_655_ || i_655_ == 1 && i_657_ == 255) {
				for (int i_658_ = 0; i_658_ < i_653_; i_658_++)
					anIntArray9804[anInt9825 * 1013077751 * i_658_ + i_656_] = i_654_;
			} else if (i_655_ == 1) {
				i_654_ = (((i_654_ & 0xff00) * i_657_ >> 8 & 0xff00) + ((i_654_ & 0xff00ff) * i_657_ >> 8 & 0xff00ff) + (i_657_ << 24));
				int i_659_ = 256 - i_657_;
				for (int i_660_ = 0; i_660_ < i_653_; i_660_++) {
					int i_661_ = 1013077751 * anInt9825 * i_660_ + i_656_;
					int i_662_ = anIntArray9804[i_661_];
					i_662_ = ((i_659_ * (i_662_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_662_ & 0xff00) * i_659_ >> 8 & 0xff00));
					anIntArray9804[i_661_] = i_662_ + i_654_;
				}
			} else if (2 == i_655_) {
				for (int i_663_ = 0; i_663_ < i_653_; i_663_++) {
					int i_664_ = 1013077751 * anInt9825 * i_663_ + i_656_;
					int i_665_ = anIntArray9804[i_664_];
					int i_666_ = i_665_ + i_654_;
					int i_667_ = (i_665_ & 0xff00ff) + (i_654_ & 0xff00ff);
					i_665_ = (i_666_ - i_667_ & 0x10000) + (i_667_ & 0x1000100);
					anIntArray9804[i_664_] = i_666_ - i_665_ | i_665_ - (i_665_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method3199(int[] is) {
		is[0] = anInt9825 * 1013077751;
		is[1] = 719529481 * anInt9806;
	}

	public Class435 method3464() {
		Class99 class99 = method15475(Thread.currentThread());
		return class99.aClass435_1199;
	}

	public boolean method3252() {
		return false;
	}

	void method3242(int i, int i_668_, int i_669_, int i_670_, int i_671_) {
		if (null != anIntArray9804 && (i >= anInt9815 * -1373518821 && i < anInt9809 * -272361347)) {
			if (i_668_ < -695823527 * anInt9810) {
				i_669_ -= anInt9810 * -695823527 - i_668_;
				i_668_ = -695823527 * anInt9810;
			}
			if (i_669_ + i_668_ > 489020741 * anInt9826)
				i_669_ = anInt9826 * 489020741 - i_668_;
			int i_672_ = 1013077751 * anInt9825 * i_668_ + i;
			int i_673_ = i_670_ >>> 24;
			if (0 == i_671_ || i_671_ == 1 && i_673_ == 255) {
				for (int i_674_ = 0; i_674_ < i_669_; i_674_++)
					anIntArray9804[anInt9825 * 1013077751 * i_674_ + i_672_] = i_670_;
			} else if (i_671_ == 1) {
				i_670_ = (((i_670_ & 0xff00) * i_673_ >> 8 & 0xff00) + ((i_670_ & 0xff00ff) * i_673_ >> 8 & 0xff00ff) + (i_673_ << 24));
				int i_675_ = 256 - i_673_;
				for (int i_676_ = 0; i_676_ < i_669_; i_676_++) {
					int i_677_ = 1013077751 * anInt9825 * i_676_ + i_672_;
					int i_678_ = anIntArray9804[i_677_];
					i_678_ = ((i_675_ * (i_678_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_678_ & 0xff00) * i_675_ >> 8 & 0xff00));
					anIntArray9804[i_677_] = i_678_ + i_670_;
				}
			} else if (2 == i_671_) {
				for (int i_679_ = 0; i_679_ < i_669_; i_679_++) {
					int i_680_ = 1013077751 * anInt9825 * i_679_ + i_672_;
					int i_681_ = anIntArray9804[i_680_];
					int i_682_ = i_681_ + i_670_;
					int i_683_ = (i_681_ & 0xff00ff) + (i_670_ & 0xff00ff);
					i_681_ = (i_682_ - i_683_ & 0x10000) + (i_683_ & 0x1000100);
					anIntArray9804[i_680_] = i_682_ - i_681_ | i_681_ - (i_681_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public boolean method3065() {
		return true;
	}

	public boolean method3343() {
		return false;
	}

	public boolean method3205() {
		return false;
	}

	public boolean method3371() {
		return false;
	}

	public void method3408(int i, int i_684_, int i_685_, int i_686_, int i_687_, int i_688_) {
		if (null != anIntArray9804) {
			if (i < -1373518821 * anInt9815) {
				i_685_ -= -1373518821 * anInt9815 - i;
				i = -1373518821 * anInt9815;
			}
			if (i_684_ < anInt9810 * -695823527) {
				i_686_ -= -695823527 * anInt9810 - i_684_;
				i_684_ = -695823527 * anInt9810;
			}
			if (i_685_ + i > anInt9809 * -272361347)
				i_685_ = -272361347 * anInt9809 - i;
			if (i_684_ + i_686_ > 489020741 * anInt9826)
				i_686_ = 489020741 * anInt9826 - i_684_;
			if (i_685_ > 0 && i_686_ > 0 && i <= anInt9809 * -272361347 && i_684_ <= 489020741 * anInt9826) {
				int i_689_ = 1013077751 * anInt9825 - i_685_;
				int i_690_ = i + 1013077751 * anInt9825 * i_684_;
				int i_691_ = i_687_ >>> 24;
				if (0 == i_688_ || 1 == i_688_ && i_691_ == 255) {
					int i_692_ = i_685_ >> 3;
					int i_693_ = i_685_ & 0x7;
					i_685_ = i_690_ - 1;
					for (int i_694_ = -i_686_; i_694_ < 0; i_694_++) {
						if (i_692_ > 0) {
							i = i_692_;
							do {
								anIntArray9804[++i_685_] = i_687_;
								anIntArray9804[++i_685_] = i_687_;
								anIntArray9804[++i_685_] = i_687_;
								anIntArray9804[++i_685_] = i_687_;
								anIntArray9804[++i_685_] = i_687_;
								anIntArray9804[++i_685_] = i_687_;
								anIntArray9804[++i_685_] = i_687_;
								anIntArray9804[++i_685_] = i_687_;
							} while (--i > 0);
						}
						if (i_693_ > 0) {
							i = i_693_;
							do
								anIntArray9804[++i_685_] = i_687_;
							while (--i > 0);
						}
						i_685_ += i_689_;
					}
				} else if (i_688_ == 1) {
					i_687_ = ((((i_687_ & ~0xff00ff) >>> 8) * i_691_ & ~0xff00ff) + (i_691_ * (i_687_ & 0xff00ff) >> 8 & 0xff00ff));
					int i_695_ = 256 - i_691_;
					for (int i_696_ = 0; i_696_ < i_686_; i_696_++) {
						for (int i_697_ = -i_685_; i_697_ < 0; i_697_++) {
							int i_698_ = anIntArray9804[i_690_];
							i_698_ = ((i_695_ * ((i_698_ & ~0xff00ff) >>> 8) & ~0xff00ff) + ((i_698_ & 0xff00ff) * i_695_ >> 8 & 0xff00ff));
							anIntArray9804[i_690_++] = i_687_ + i_698_;
						}
						i_690_ += i_689_;
					}
				} else if (2 == i_688_) {
					for (int i_699_ = 0; i_699_ < i_686_; i_699_++) {
						for (int i_700_ = -i_685_; i_700_ < 0; i_700_++) {
							int i_701_ = anIntArray9804[i_690_];
							int i_702_ = i_687_ + i_701_;
							int i_703_ = (i_687_ & 0xff00ff) + (i_701_ & 0xff00ff);
							i_701_ = (i_703_ & 0x1000100) + (i_702_ - i_703_ & 0x10000);
							anIntArray9804[i_690_++] = i_702_ - i_701_ | i_701_ - (i_701_ >>> 8);
						}
						i_690_ += i_689_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public boolean method3421() {
		return false;
	}

	public int method3294() {
		return -1;
	}

	void method15452() {
		int i = -272361347 * anInt9809 - anInt9815 * -1373518821;
		int i_704_ = 489020741 * anInt9826 - -695823527 * anInt9810;
		float f = aFloat9827 = (float) (anInt9801 * -165927661) / 2.0F;
		float f_705_ = aFloat9829 = (float) (-13552761 * anInt9820) / 2.0F;
		aFloat9828 = (float) (1383519939 * anInt9823) + f;
		aFloat9830 = f_705_ + (float) (anInt9824 * -1740822397);
		for (int i_706_ = 0; i_706_ < 1353126165 * anInt9819; i_706_++) {
			Class99 class99 = aClass99Array9836[i_706_];
			Class118 class118 = class99.aClass118_1200;
			class118.aFloat1469 = f;
			class118.aFloat1444 = f_705_;
			class118.aFloat1442 = aFloat9828 - (float) (-1373518821 * anInt9815);
			class118.aFloat1473 = aFloat9830 - (float) (-695823527 * anInt9810);
			class118.anInt1448 = i;
			class118.anInt1449 = i_704_;
		}
		int i_707_ = (anInt9825 * 1013077751 * (-695823527 * anInt9810) + -1373518821 * anInt9815);
		for (int i_708_ = anInt9810 * -695823527; i_708_ < anInt9826 * 489020741; i_708_++) {
			for (int i_709_ = 0; i_709_ < anInt9819 * 1353126165; i_709_++)
				aClass99Array9836[i_709_].aClass118_1200.anIntArray1441[i_708_ - -695823527 * anInt9810] = i_707_;
			i_707_ += anInt9825 * 1013077751;
		}
	}

	public void method3211(int i, int i_710_, int i_711_) {
		/* empty */
	}

	byte method15453(int i) {
		return aClass172_1916.method2895(i, -1071904700).aByte1889;
	}

	public boolean method3207() {
		return false;
	}

	public void method3272(int i, int i_712_, int i_713_, int i_714_, int i_715_, int i_716_) {
		method3087(i, i_712_, i_713_, i_715_, i_716_);
		method3087(i, i_714_ + i_712_ - 1, i_713_, i_715_, i_716_);
		method3119(i, 1 + i_712_, i_714_ - 2, i_715_, i_716_);
		method3119(i + i_713_ - 1, i_712_ + 1, i_714_ - 2, i_715_, i_716_);
	}

	public void method3304(Class441 class441) {
		aClass441_9805.method7086(class441);
		method15429();
	}

	public void method3185() {
		/* empty */
	}

	public void method3217(int i, int i_717_, int[] is, int[] is_718_) {
		method3161(i, i_717_, -742990751);
		if (null == aClass148_9814 || aClass148_9814.method2504() != i || aClass148_9814.method2428() != i_717_) {
			aClass148_9814 = method3136(i, i_717_, true, true);
			aClass168_Sub1_9840 = null;
		}
		if (null == aClass168_Sub1_9840) {
			aClass168_Sub1_9840 = method3248();
			aClass168_Sub1_9840.method14424(0, aClass148_9814.method2430());
		}
		Class148_Sub1_Sub1 class148_sub1_sub1 = new Class148_Sub1_Sub1(this, anIntArray9804, anInt9825 * 1013077751, 719529481 * anInt9806);
		method3353(aClass168_Sub1_9840, 462858832);
		method3076(1, -16777216);
		class148_sub1_sub1.method2461(1970564341 * anInt1945, anInt1937 * 1216763507, -750425387 * anInt1946, -733304105 * anInt1915, 1, 0, 0, 0);
		aClass148_9814.method2432(0, 0, i, i_717_, is, is_718_, 0, i);
		method3047(aClass168_Sub1_9840, (short) -31097);
	}

	public void method3218() {
		aClass168_Sub1_9840 = null;
		aClass148_9814 = null;
	}

	public boolean method3030() {
		return false;
	}

	void method15454() {
		if (null != aFloatArray9807) {
			if (anInt9815 * -1373518821 == 0 && -272361347 * anInt9809 == 1013077751 * anInt9825 && 0 == -695823527 * anInt9810 && 489020741 * anInt9826 == 719529481 * anInt9806) {
				int i = aFloatArray9807.length;
				int i_719_ = i - (i & 0x7);
				int i_720_ = 0;
				while (i_720_ < i_719_) {
					aFloatArray9807[i_720_++] = 2.14748365E9F;
					aFloatArray9807[i_720_++] = 2.14748365E9F;
					aFloatArray9807[i_720_++] = 2.14748365E9F;
					aFloatArray9807[i_720_++] = 2.14748365E9F;
					aFloatArray9807[i_720_++] = 2.14748365E9F;
					aFloatArray9807[i_720_++] = 2.14748365E9F;
					aFloatArray9807[i_720_++] = 2.14748365E9F;
					aFloatArray9807[i_720_++] = 2.14748365E9F;
				}
				while (i_720_ < i)
					aFloatArray9807[i_720_++] = 2.14748365E9F;
			} else {
				int i = -272361347 * anInt9809 - anInt9815 * -1373518821;
				int i_721_ = anInt9826 * 489020741 - anInt9810 * -695823527;
				int i_722_ = 1013077751 * anInt9825 - i;
				int i_723_ = (anInt9810 * -695823527 * (anInt9825 * 1013077751) + anInt9815 * -1373518821);
				int i_724_ = i >> 3;
				int i_725_ = i & 0x7;
				i = i_723_ - 1;
				for (int i_726_ = -i_721_; i_726_ < 0; i_726_++) {
					if (i_724_ > 0) {
						int i_727_ = i_724_;
						do {
							aFloatArray9807[++i] = 2.14748365E9F;
							aFloatArray9807[++i] = 2.14748365E9F;
							aFloatArray9807[++i] = 2.14748365E9F;
							aFloatArray9807[++i] = 2.14748365E9F;
							aFloatArray9807[++i] = 2.14748365E9F;
							aFloatArray9807[++i] = 2.14748365E9F;
							aFloatArray9807[++i] = 2.14748365E9F;
							aFloatArray9807[++i] = 2.14748365E9F;
						} while (--i_727_ > 0);
					}
					if (i_725_ > 0) {
						int i_728_ = i_725_;
						do
							aFloatArray9807[++i] = 2.14748365E9F;
						while (--i_728_ > 0);
					}
					i += i_722_;
				}
			}
		}
	}

	void method15455() {
		if (null != aFloatArray9807) {
			if (anInt9815 * -1373518821 == 0 && -272361347 * anInt9809 == 1013077751 * anInt9825 && 0 == -695823527 * anInt9810 && 489020741 * anInt9826 == 719529481 * anInt9806) {
				int i = aFloatArray9807.length;
				int i_729_ = i - (i & 0x7);
				int i_730_ = 0;
				while (i_730_ < i_729_) {
					aFloatArray9807[i_730_++] = 2.14748365E9F;
					aFloatArray9807[i_730_++] = 2.14748365E9F;
					aFloatArray9807[i_730_++] = 2.14748365E9F;
					aFloatArray9807[i_730_++] = 2.14748365E9F;
					aFloatArray9807[i_730_++] = 2.14748365E9F;
					aFloatArray9807[i_730_++] = 2.14748365E9F;
					aFloatArray9807[i_730_++] = 2.14748365E9F;
					aFloatArray9807[i_730_++] = 2.14748365E9F;
				}
				while (i_730_ < i)
					aFloatArray9807[i_730_++] = 2.14748365E9F;
			} else {
				int i = -272361347 * anInt9809 - anInt9815 * -1373518821;
				int i_731_ = anInt9826 * 489020741 - anInt9810 * -695823527;
				int i_732_ = 1013077751 * anInt9825 - i;
				int i_733_ = (anInt9810 * -695823527 * (anInt9825 * 1013077751) + anInt9815 * -1373518821);
				int i_734_ = i >> 3;
				int i_735_ = i & 0x7;
				i = i_733_ - 1;
				for (int i_736_ = -i_731_; i_736_ < 0; i_736_++) {
					if (i_734_ > 0) {
						int i_737_ = i_734_;
						do {
							aFloatArray9807[++i] = 2.14748365E9F;
							aFloatArray9807[++i] = 2.14748365E9F;
							aFloatArray9807[++i] = 2.14748365E9F;
							aFloatArray9807[++i] = 2.14748365E9F;
							aFloatArray9807[++i] = 2.14748365E9F;
							aFloatArray9807[++i] = 2.14748365E9F;
							aFloatArray9807[++i] = 2.14748365E9F;
							aFloatArray9807[++i] = 2.14748365E9F;
						} while (--i_737_ > 0);
					}
					if (i_735_ > 0) {
						int i_738_ = i_735_;
						do
							aFloatArray9807[++i] = 2.14748365E9F;
						while (--i_738_ > 0);
					}
					i += i_732_;
				}
			}
		}
	}

	public void method3220(boolean bool) {
		Class99 class99 = method15475(Thread.currentThread());
		class99.aBool1186 = bool;
	}

	public void method3344() {
		anInt9823 = 0;
		anInt9824 = 0;
		anInt9801 = 1821988621 * anInt9825;
		anInt9820 = -1729864209 * anInt9806;
		method15452();
	}

	public void method3222(int i, int i_739_, int i_740_, int i_741_) {
		anInt9823 = i * 91490795;
		anInt9824 = i_739_ * 1647470123;
		anInt9801 = 1856335131 * i_740_;
		anInt9820 = i_741_ * 289022519;
		method15452();
	}

	public void method3223(int i, int i_742_, int i_743_, int i_744_) {
		anInt9823 = i * 91490795;
		anInt9824 = i_742_ * 1647470123;
		anInt9801 = 1856335131 * i_743_;
		anInt9820 = i_744_ * 289022519;
		method15452();
	}

	public void method3224(int[] is) {
		is[0] = 1383519939 * anInt9823;
		is[1] = -1740822397 * anInt9824;
		is[2] = anInt9801 * -165927661;
		is[3] = anInt9820 * -13552761;
	}

	public void method3225(int[] is) {
		is[0] = 1383519939 * anInt9823;
		is[1] = -1740822397 * anInt9824;
		is[2] = anInt9801 * -165927661;
		is[3] = anInt9820 * -13552761;
	}

	public boolean method3100() {
		return false;
	}

	void method15456(int i) {
		anInt9819 = 81573437 * i;
		aClass99Array9836 = new Class99[1353126165 * anInt9819];
		for (int i_745_ = 0; i_745_ < 1353126165 * anInt9819; i_745_++)
			aClass99Array9836[i_745_] = new Class99(this);
	}

	public void method3227(int i, int i_746_, int i_747_, int i_748_) {
		if (i < 0)
			i = 0;
		if (i_746_ < 0)
			i_746_ = 0;
		if (i_747_ > anInt9825 * 1013077751)
			i_747_ = anInt9825 * 1013077751;
		if (i_748_ > anInt9806 * 719529481)
			i_748_ = anInt9806 * 719529481;
		anInt9815 = -1225886189 * i;
		anInt9809 = i_747_ * -60284715;
		anInt9810 = i_746_ * 2023392489;
		anInt9826 = i_748_ * 624962957;
		method15452();
	}

	public void method3228(int i, int i_749_, int i_750_, int i_751_) {
		if (i < 0)
			i = 0;
		if (i_749_ < 0)
			i_749_ = 0;
		if (i_750_ > anInt9825 * 1013077751)
			i_750_ = anInt9825 * 1013077751;
		if (i_751_ > anInt9806 * 719529481)
			i_751_ = anInt9806 * 719529481;
		anInt9815 = -1225886189 * i;
		anInt9809 = i_750_ * -60284715;
		anInt9810 = i_749_ * 2023392489;
		anInt9826 = i_751_ * 624962957;
		method15452();
	}

	public void method3210(int i, int i_752_, int i_753_, int i_754_) {
		if (anInt9815 * -1373518821 < i)
			anInt9815 = -1225886189 * i;
		if (anInt9810 * -695823527 < i_752_)
			anInt9810 = 2023392489 * i_752_;
		if (-272361347 * anInt9809 > i_753_)
			anInt9809 = i_753_ * -60284715;
		if (489020741 * anInt9826 > i_754_)
			anInt9826 = 624962957 * i_754_;
		method15452();
	}

	public void method3230(int i, int i_755_, int i_756_, int i_757_) {
		if (anInt9815 * -1373518821 < i)
			anInt9815 = -1225886189 * i;
		if (anInt9810 * -695823527 < i_755_)
			anInt9810 = 2023392489 * i_755_;
		if (-272361347 * anInt9809 > i_756_)
			anInt9809 = i_756_ * -60284715;
		if (489020741 * anInt9826 > i_757_)
			anInt9826 = 624962957 * i_757_;
		method15452();
	}

	public void method3231(int[] is) {
		is[0] = -1373518821 * anInt9815;
		is[1] = anInt9810 * -695823527;
		is[2] = anInt9809 * -272361347;
		is[3] = 489020741 * anInt9826;
	}

	public void method3236(int[] is) {
		is[0] = -1373518821 * anInt9815;
		is[1] = anInt9810 * -695823527;
		is[2] = anInt9809 * -272361347;
		is[3] = 489020741 * anInt9826;
	}

	public void method3285(int[] is) {
		is[0] = -1373518821 * anInt9815;
		is[1] = anInt9810 * -695823527;
		is[2] = anInt9809 * -272361347;
		is[3] = 489020741 * anInt9826;
	}

	public void method3043(int[] is) {
		is[0] = -1373518821 * anInt9815;
		is[1] = anInt9810 * -695823527;
		is[2] = anInt9809 * -272361347;
		is[3] = 489020741 * anInt9826;
	}

	public void method3129(int i, int i_758_, int i_759_, int i_760_, int i_761_, int i_762_) {
		method3087(i, i_758_, i_759_, i_761_, i_762_);
		method3087(i, i_760_ + i_758_ - 1, i_759_, i_761_, i_762_);
		method3119(i, 1 + i_758_, i_760_ - 2, i_761_, i_762_);
		method3119(i + i_759_ - 1, i_758_ + 1, i_760_ - 2, i_761_, i_762_);
	}

	public void method3071() {
		anInt9815 = 0;
		anInt9810 = 0;
		anInt9809 = anInt9825 * 17382275;
		anInt9826 = 1544259573 * anInt9806;
		method15452();
	}

	public void method3284(int i, int i_763_, int i_764_, int i_765_, int i_766_, int i_767_) {
		method3087(i, i_763_, i_764_, i_766_, i_767_);
		method3087(i, i_765_ + i_763_ - 1, i_764_, i_766_, i_767_);
		method3119(i, 1 + i_763_, i_765_ - 2, i_766_, i_767_);
		method3119(i + i_764_ - 1, i_763_ + 1, i_765_ - 2, i_766_, i_767_);
	}

	public void method3238(int i, int i_768_, int i_769_, int i_770_, int i_771_, int i_772_) {
		if (null != anIntArray9804) {
			if (i < -1373518821 * anInt9815) {
				i_769_ -= -1373518821 * anInt9815 - i;
				i = -1373518821 * anInt9815;
			}
			if (i_768_ < anInt9810 * -695823527) {
				i_770_ -= -695823527 * anInt9810 - i_768_;
				i_768_ = -695823527 * anInt9810;
			}
			if (i_769_ + i > anInt9809 * -272361347)
				i_769_ = -272361347 * anInt9809 - i;
			if (i_768_ + i_770_ > 489020741 * anInt9826)
				i_770_ = 489020741 * anInt9826 - i_768_;
			if (i_769_ > 0 && i_770_ > 0 && i <= anInt9809 * -272361347 && i_768_ <= 489020741 * anInt9826) {
				int i_773_ = 1013077751 * anInt9825 - i_769_;
				int i_774_ = i + 1013077751 * anInt9825 * i_768_;
				int i_775_ = i_771_ >>> 24;
				if (0 == i_772_ || 1 == i_772_ && i_775_ == 255) {
					int i_776_ = i_769_ >> 3;
					int i_777_ = i_769_ & 0x7;
					i_769_ = i_774_ - 1;
					for (int i_778_ = -i_770_; i_778_ < 0; i_778_++) {
						if (i_776_ > 0) {
							i = i_776_;
							do {
								anIntArray9804[++i_769_] = i_771_;
								anIntArray9804[++i_769_] = i_771_;
								anIntArray9804[++i_769_] = i_771_;
								anIntArray9804[++i_769_] = i_771_;
								anIntArray9804[++i_769_] = i_771_;
								anIntArray9804[++i_769_] = i_771_;
								anIntArray9804[++i_769_] = i_771_;
								anIntArray9804[++i_769_] = i_771_;
							} while (--i > 0);
						}
						if (i_777_ > 0) {
							i = i_777_;
							do
								anIntArray9804[++i_769_] = i_771_;
							while (--i > 0);
						}
						i_769_ += i_773_;
					}
				} else if (i_772_ == 1) {
					i_771_ = ((((i_771_ & ~0xff00ff) >>> 8) * i_775_ & ~0xff00ff) + (i_775_ * (i_771_ & 0xff00ff) >> 8 & 0xff00ff));
					int i_779_ = 256 - i_775_;
					for (int i_780_ = 0; i_780_ < i_770_; i_780_++) {
						for (int i_781_ = -i_769_; i_781_ < 0; i_781_++) {
							int i_782_ = anIntArray9804[i_774_];
							i_782_ = ((i_779_ * ((i_782_ & ~0xff00ff) >>> 8) & ~0xff00ff) + ((i_782_ & 0xff00ff) * i_779_ >> 8 & 0xff00ff));
							anIntArray9804[i_774_++] = i_771_ + i_782_;
						}
						i_774_ += i_773_;
					}
				} else if (2 == i_772_) {
					for (int i_783_ = 0; i_783_ < i_770_; i_783_++) {
						for (int i_784_ = -i_769_; i_784_ < 0; i_784_++) {
							int i_785_ = anIntArray9804[i_774_];
							int i_786_ = i_771_ + i_785_;
							int i_787_ = (i_771_ & 0xff00ff) + (i_785_ & 0xff00ff);
							i_785_ = (i_787_ & 0x1000100) + (i_786_ - i_787_ & 0x10000);
							anIntArray9804[i_774_++] = i_786_ - i_785_ | i_785_ - (i_785_ >>> 8);
						}
						i_774_ += i_773_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method3361(float f) {
		anInt9817 = 2063625163 * (int) (f * 65535.0F);
	}

	public boolean method3374() {
		return false;
	}

	public void method3337(float f, float f_788_, float f_789_, float f_790_, float f_791_) {
		/* empty */
	}

	int method15457(int i) {
		return (aClass172_1916.method2895(i, -1266424650).anInt1913 * 1075916655);
	}

	public int method3034() {
		return 0;
	}

	public void method3151(int i, int i_792_, int i_793_, int i_794_) {
		/* empty */
	}

	void method15458(int i, int i_795_, int i_796_, int i_797_, int i_798_, int i_799_, int i_800_, int i_801_) {
		if (anIntArray9804 != null && (i >= -1373518821 * anInt9815 && i < -272361347 * anInt9809)) {
			int i_802_ = i + 1013077751 * anInt9825 * i_795_;
			int i_803_ = i_797_ >>> 24;
			int i_804_ = i_799_ + i_800_;
			int i_805_ = i_801_ % i_804_;
			if (i_798_ == 0 || i_798_ == 1 && 255 == i_803_) {
				int i_806_ = 0;
				while (i_806_ < i_796_) {
					if (i_795_ + i_806_ >= anInt9810 * -695823527 && i_806_ + i_795_ < 489020741 * anInt9826 && i_805_ < i_799_)
						anIntArray9804[i_802_ + i_806_ * (anInt9825 * 1013077751)] = i_797_;
					i_806_++;
					i_805_ = ++i_805_ % i_804_;
				}
			} else if (1 == i_798_) {
				i_797_ = (i_803_ << 24) + (((i_797_ & 0xff00) * i_803_ >> 8 & 0xff00) + ((i_797_ & 0xff00ff) * i_803_ >> 8 & 0xff00ff));
				int i_807_ = 256 - i_803_;
				int i_808_ = 0;
				while (i_808_ < i_796_) {
					if (i_795_ + i_808_ >= anInt9810 * -695823527 && i_808_ + i_795_ < anInt9826 * 489020741 && i_805_ < i_799_) {
						int i_809_ = i_802_ + anInt9825 * 1013077751 * i_808_;
						int i_810_ = anIntArray9804[i_809_];
						i_810_ = ((i_807_ * (i_810_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_810_ & 0xff00) * i_807_ >> 8 & 0xff00));
						anIntArray9804[i_809_] = i_797_ + i_810_;
					}
					i_808_++;
					i_805_ = ++i_805_ % i_804_;
				}
			} else if (2 == i_798_) {
				int i_811_ = 0;
				while (i_811_ < i_796_) {
					if (i_811_ + i_795_ >= -695823527 * anInt9810 && i_795_ + i_811_ < anInt9826 * 489020741 && i_805_ < i_799_) {
						int i_812_ = i_811_ * (anInt9825 * 1013077751) + i_802_;
						int i_813_ = anIntArray9804[i_812_];
						int i_814_ = i_813_ + i_797_;
						int i_815_ = (i_813_ & 0xff00ff) + (i_797_ & 0xff00ff);
						i_813_ = (i_814_ - i_815_ & 0x10000) + (i_815_ & 0x1000100);
						anIntArray9804[i_812_] = i_814_ - i_813_ | i_813_ - (i_813_ >>> 8);
					}
					i_811_++;
					i_805_ = ++i_805_ % i_804_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	void method15459(int i) {
		anInt9819 = 81573437 * i;
		aClass99Array9836 = new Class99[1353126165 * anInt9819];
		for (int i_816_ = 0; i_816_ < 1353126165 * anInt9819; i_816_++)
			aClass99Array9836[i_816_] = new Class99(this);
	}

	public void method3245(int i, int i_817_, int i_818_, int i_819_, int i_820_, int i_821_, int i_822_, int i_823_, int i_824_) {
		if (anIntArray9804 != null) {
			i_818_ -= i;
			i_819_ -= i_817_;
			if (i_819_ == 0) {
				if (i_818_ >= 0)
					method15422(i, i_817_, i_818_ + 1, i_820_, i_821_, i_822_, i_823_, i_824_);
				else {
					int i_825_ = i_823_ + i_822_;
					i_824_ %= i_825_;
					i_824_ = i_822_ + i_825_ - i_824_ - (-i_818_ + 1) % i_825_;
					i_824_ %= i_825_;
					if (i_824_ < 0)
						i_824_ += i_825_;
					method15422(i_818_ + i, i_817_, -i_818_ + 1, i_820_, i_821_, i_822_, i_823_, i_824_);
				}
			} else if (i_818_ == 0) {
				if (i_819_ >= 0)
					method15418(i, i_817_, i_819_ + 1, i_820_, i_821_, i_822_, i_823_, i_824_);
				else {
					int i_826_ = i_823_ + i_822_;
					i_824_ %= i_826_;
					i_824_ = i_822_ + i_826_ - i_824_ - (-i_819_ + 1) % i_826_;
					i_824_ %= i_826_;
					if (i_824_ < 0)
						i_824_ += i_826_;
					method15418(i, i_817_ + i_819_, 1 + -i_819_, i_820_, i_821_, i_822_, i_823_, i_824_);
				}
			} else {
				i_824_ <<= 8;
				i_822_ <<= 8;
				i_823_ <<= 8;
				int i_827_ = i_822_ + i_823_;
				i_824_ %= i_827_;
				if (i_819_ + i_818_ < 0) {
					int i_828_ = (int) (Math.sqrt((double) (i_818_ * i_818_ + i_819_ * i_819_)) * 256.0);
					int i_829_ = i_828_ % i_827_;
					i_824_ = i_827_ + i_822_ - i_824_ - i_829_;
					i_824_ %= i_827_;
					if (i_824_ < 0)
						i_824_ += i_827_;
					i += i_818_;
					i_818_ = -i_818_;
					i_817_ += i_819_;
					i_819_ = -i_819_;
				}
				if (i_818_ > i_819_) {
					i_817_ <<= 16;
					i_817_ += 32768;
					i_819_ <<= 16;
					int i_830_ = (int) Math.floor((double) i_819_ / (double) i_818_ + 0.5);
					i_818_ += i;
					int i_831_ = i_820_ >>> 24;
					int i_832_ = (int) Math.sqrt((double) (65536 + (i_830_ >> 8) * (i_830_ >> 8)));
					if (i_821_ == 0 || 1 == i_821_ && 255 == i_831_) {
						while (i <= i_818_) {
							int i_833_ = i_817_ >> 16;
							if (i >= -1373518821 * anInt9815 && i < anInt9809 * -272361347 && i_833_ >= anInt9810 * -695823527 && i_833_ < 489020741 * anInt9826 && i_824_ < i_822_)
								anIntArray9804[(anInt9825 * 1013077751 * i_833_ + i)] = i_820_;
							i_817_ += i_830_;
							i++;
							i_824_ += i_832_;
							i_824_ %= i_827_;
						}
					} else if (i_821_ == 1) {
						i_820_ = ((i_831_ * (i_820_ & 0xff00ff) >> 8 & 0xff00ff) + (i_831_ * (i_820_ & 0xff00) >> 8 & 0xff00) + (i_831_ << 24));
						int i_834_ = 256 - i_831_;
						while (i <= i_818_) {
							int i_835_ = i_817_ >> 16;
							if (i >= anInt9815 * -1373518821 && i < anInt9809 * -272361347 && i_835_ >= anInt9810 * -695823527 && i_835_ < 489020741 * anInt9826 && i_824_ < i_822_) {
								int i_836_ = i + 1013077751 * anInt9825 * i_835_;
								int i_837_ = anIntArray9804[i_836_];
								i_837_ = ((i_834_ * (i_837_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_837_ & 0xff00) * i_834_ >> 8 & 0xff00));
								anIntArray9804[i_836_] = i_837_ + i_820_;
							}
							i_817_ += i_830_;
							i++;
							i_824_ += i_832_;
							i_824_ %= i_827_;
						}
					} else if (2 == i_821_) {
						while (i <= i_818_) {
							int i_838_ = i_817_ >> 16;
							if (i >= -1373518821 * anInt9815 && i < anInt9809 * -272361347 && i_838_ >= anInt9810 * -695823527 && i_838_ < 489020741 * anInt9826 && i_824_ < i_822_) {
								int i_839_ = i + anInt9825 * 1013077751 * i_838_;
								int i_840_ = anIntArray9804[i_839_];
								int i_841_ = i_840_ + i_820_;
								int i_842_ = ((i_820_ & 0xff00ff) + (i_840_ & 0xff00ff));
								i_840_ = (i_842_ & 0x1000100) + (i_841_ - i_842_ & 0x10000);
								anIntArray9804[i_839_] = i_841_ - i_840_ | i_840_ - (i_840_ >>> 8);
							}
							i_817_ += i_830_;
							i++;
							i_824_ += i_832_;
							i_824_ %= i_827_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_818_ <<= 16;
					int i_843_ = (int) Math.floor((double) i_818_ / (double) i_819_ + 0.5);
					i_819_ += i_817_;
					int i_844_ = i_820_ >>> 24;
					int i_845_ = (int) Math.sqrt((double) ((i_843_ >> 8) * (i_843_ >> 8) + 65536));
					if (0 == i_821_ || 1 == i_821_ && 255 == i_844_) {
						while (i_817_ <= i_819_) {
							int i_846_ = i >> 16;
							if (i_817_ >= -695823527 * anInt9810 && i_817_ < 489020741 * anInt9826 && i_846_ >= anInt9815 * -1373518821 && i_846_ < -272361347 * anInt9809 && i_824_ < i_822_)
								anIntArray9804[i_846_ + i_817_ * (1013077751 * anInt9825)] = i_820_;
							i += i_843_;
							i_817_++;
							i_824_ += i_845_;
							i_824_ %= i_827_;
						}
					} else if (1 == i_821_) {
						i_820_ = ((i_844_ << 24) + (((i_820_ & 0xff00) * i_844_ >> 8 & 0xff00) + (i_844_ * (i_820_ & 0xff00ff) >> 8 & 0xff00ff)));
						int i_847_ = 256 - i_844_;
						while (i_817_ <= i_819_) {
							int i_848_ = i >> 16;
							if (i_817_ >= -695823527 * anInt9810 && i_817_ < anInt9826 * 489020741 && i_848_ >= -1373518821 * anInt9815 && i_848_ < anInt9809 * -272361347 && i_824_ < i_822_) {
								int i_849_ = 1013077751 * anInt9825 * i_817_ + i_848_;
								int i_850_ = anIntArray9804[i_849_];
								i_850_ = (((i_850_ & 0xff00) * i_847_ >> 8 & 0xff00) + (i_847_ * (i_850_ & 0xff00ff) >> 8 & 0xff00ff));
								anIntArray9804[(i_848_ + i_817_ * (anInt9825 * 1013077751))] = i_850_ + i_820_;
							}
							i += i_843_;
							i_817_++;
							i_824_ += i_845_;
							i_824_ %= i_827_;
						}
					} else if (2 == i_821_) {
						while (i_817_ <= i_819_) {
							int i_851_ = i >> 16;
							if (i_817_ >= -695823527 * anInt9810 && i_817_ < anInt9826 * 489020741 && i_851_ >= anInt9815 * -1373518821 && i_851_ < -272361347 * anInt9809 && i_824_ < i_822_) {
								int i_852_ = (i_817_ * (1013077751 * anInt9825) + i_851_);
								int i_853_ = anIntArray9804[i_852_];
								int i_854_ = i_820_ + i_853_;
								int i_855_ = ((i_820_ & 0xff00ff) + (i_853_ & 0xff00ff));
								i_853_ = (i_855_ & 0x1000100) + (i_854_ - i_855_ & 0x10000);
								anIntArray9804[i_852_] = i_854_ - i_853_ | i_853_ - (i_853_ >>> 8);
							}
							i += i_843_;
							i_817_++;
							i_824_ += i_845_;
							i_824_ %= i_827_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public void method3427(int i, int i_856_, int i_857_, int i_858_, int i_859_, int i_860_, int i_861_, int i_862_, int i_863_) {
		if (anIntArray9804 != null) {
			i_857_ -= i;
			i_858_ -= i_856_;
			if (i_858_ == 0) {
				if (i_857_ >= 0)
					method15422(i, i_856_, i_857_ + 1, i_859_, i_860_, i_861_, i_862_, i_863_);
				else {
					int i_864_ = i_862_ + i_861_;
					i_863_ %= i_864_;
					i_863_ = i_861_ + i_864_ - i_863_ - (-i_857_ + 1) % i_864_;
					i_863_ %= i_864_;
					if (i_863_ < 0)
						i_863_ += i_864_;
					method15422(i_857_ + i, i_856_, -i_857_ + 1, i_859_, i_860_, i_861_, i_862_, i_863_);
				}
			} else if (i_857_ == 0) {
				if (i_858_ >= 0)
					method15418(i, i_856_, i_858_ + 1, i_859_, i_860_, i_861_, i_862_, i_863_);
				else {
					int i_865_ = i_862_ + i_861_;
					i_863_ %= i_865_;
					i_863_ = i_861_ + i_865_ - i_863_ - (-i_858_ + 1) % i_865_;
					i_863_ %= i_865_;
					if (i_863_ < 0)
						i_863_ += i_865_;
					method15418(i, i_856_ + i_858_, 1 + -i_858_, i_859_, i_860_, i_861_, i_862_, i_863_);
				}
			} else {
				i_863_ <<= 8;
				i_861_ <<= 8;
				i_862_ <<= 8;
				int i_866_ = i_861_ + i_862_;
				i_863_ %= i_866_;
				if (i_858_ + i_857_ < 0) {
					int i_867_ = (int) (Math.sqrt((double) (i_857_ * i_857_ + i_858_ * i_858_)) * 256.0);
					int i_868_ = i_867_ % i_866_;
					i_863_ = i_866_ + i_861_ - i_863_ - i_868_;
					i_863_ %= i_866_;
					if (i_863_ < 0)
						i_863_ += i_866_;
					i += i_857_;
					i_857_ = -i_857_;
					i_856_ += i_858_;
					i_858_ = -i_858_;
				}
				if (i_857_ > i_858_) {
					i_856_ <<= 16;
					i_856_ += 32768;
					i_858_ <<= 16;
					int i_869_ = (int) Math.floor((double) i_858_ / (double) i_857_ + 0.5);
					i_857_ += i;
					int i_870_ = i_859_ >>> 24;
					int i_871_ = (int) Math.sqrt((double) (65536 + (i_869_ >> 8) * (i_869_ >> 8)));
					if (i_860_ == 0 || 1 == i_860_ && 255 == i_870_) {
						while (i <= i_857_) {
							int i_872_ = i_856_ >> 16;
							if (i >= -1373518821 * anInt9815 && i < anInt9809 * -272361347 && i_872_ >= anInt9810 * -695823527 && i_872_ < 489020741 * anInt9826 && i_863_ < i_861_)
								anIntArray9804[(anInt9825 * 1013077751 * i_872_ + i)] = i_859_;
							i_856_ += i_869_;
							i++;
							i_863_ += i_871_;
							i_863_ %= i_866_;
						}
					} else if (i_860_ == 1) {
						i_859_ = ((i_870_ * (i_859_ & 0xff00ff) >> 8 & 0xff00ff) + (i_870_ * (i_859_ & 0xff00) >> 8 & 0xff00) + (i_870_ << 24));
						int i_873_ = 256 - i_870_;
						while (i <= i_857_) {
							int i_874_ = i_856_ >> 16;
							if (i >= anInt9815 * -1373518821 && i < anInt9809 * -272361347 && i_874_ >= anInt9810 * -695823527 && i_874_ < 489020741 * anInt9826 && i_863_ < i_861_) {
								int i_875_ = i + 1013077751 * anInt9825 * i_874_;
								int i_876_ = anIntArray9804[i_875_];
								i_876_ = ((i_873_ * (i_876_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_876_ & 0xff00) * i_873_ >> 8 & 0xff00));
								anIntArray9804[i_875_] = i_876_ + i_859_;
							}
							i_856_ += i_869_;
							i++;
							i_863_ += i_871_;
							i_863_ %= i_866_;
						}
					} else if (2 == i_860_) {
						while (i <= i_857_) {
							int i_877_ = i_856_ >> 16;
							if (i >= -1373518821 * anInt9815 && i < anInt9809 * -272361347 && i_877_ >= anInt9810 * -695823527 && i_877_ < 489020741 * anInt9826 && i_863_ < i_861_) {
								int i_878_ = i + anInt9825 * 1013077751 * i_877_;
								int i_879_ = anIntArray9804[i_878_];
								int i_880_ = i_879_ + i_859_;
								int i_881_ = ((i_859_ & 0xff00ff) + (i_879_ & 0xff00ff));
								i_879_ = (i_881_ & 0x1000100) + (i_880_ - i_881_ & 0x10000);
								anIntArray9804[i_878_] = i_880_ - i_879_ | i_879_ - (i_879_ >>> 8);
							}
							i_856_ += i_869_;
							i++;
							i_863_ += i_871_;
							i_863_ %= i_866_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_857_ <<= 16;
					int i_882_ = (int) Math.floor((double) i_857_ / (double) i_858_ + 0.5);
					i_858_ += i_856_;
					int i_883_ = i_859_ >>> 24;
					int i_884_ = (int) Math.sqrt((double) ((i_882_ >> 8) * (i_882_ >> 8) + 65536));
					if (0 == i_860_ || 1 == i_860_ && 255 == i_883_) {
						while (i_856_ <= i_858_) {
							int i_885_ = i >> 16;
							if (i_856_ >= -695823527 * anInt9810 && i_856_ < 489020741 * anInt9826 && i_885_ >= anInt9815 * -1373518821 && i_885_ < -272361347 * anInt9809 && i_863_ < i_861_)
								anIntArray9804[i_885_ + i_856_ * (1013077751 * anInt9825)] = i_859_;
							i += i_882_;
							i_856_++;
							i_863_ += i_884_;
							i_863_ %= i_866_;
						}
					} else if (1 == i_860_) {
						i_859_ = ((i_883_ << 24) + (((i_859_ & 0xff00) * i_883_ >> 8 & 0xff00) + (i_883_ * (i_859_ & 0xff00ff) >> 8 & 0xff00ff)));
						int i_886_ = 256 - i_883_;
						while (i_856_ <= i_858_) {
							int i_887_ = i >> 16;
							if (i_856_ >= -695823527 * anInt9810 && i_856_ < anInt9826 * 489020741 && i_887_ >= -1373518821 * anInt9815 && i_887_ < anInt9809 * -272361347 && i_863_ < i_861_) {
								int i_888_ = 1013077751 * anInt9825 * i_856_ + i_887_;
								int i_889_ = anIntArray9804[i_888_];
								i_889_ = (((i_889_ & 0xff00) * i_886_ >> 8 & 0xff00) + (i_886_ * (i_889_ & 0xff00ff) >> 8 & 0xff00ff));
								anIntArray9804[(i_887_ + i_856_ * (anInt9825 * 1013077751))] = i_889_ + i_859_;
							}
							i += i_882_;
							i_856_++;
							i_863_ += i_884_;
							i_863_ %= i_866_;
						}
					} else if (2 == i_860_) {
						while (i_856_ <= i_858_) {
							int i_890_ = i >> 16;
							if (i_856_ >= -695823527 * anInt9810 && i_856_ < anInt9826 * 489020741 && i_890_ >= anInt9815 * -1373518821 && i_890_ < -272361347 * anInt9809 && i_863_ < i_861_) {
								int i_891_ = (i_856_ * (1013077751 * anInt9825) + i_890_);
								int i_892_ = anIntArray9804[i_891_];
								int i_893_ = i_859_ + i_892_;
								int i_894_ = ((i_859_ & 0xff00ff) + (i_892_ & 0xff00ff));
								i_892_ = (i_894_ & 0x1000100) + (i_893_ - i_894_ & 0x10000);
								anIntArray9804[i_891_] = i_893_ - i_892_ | i_892_ - (i_892_ >>> 8);
							}
							i += i_882_;
							i_856_++;
							i_863_ += i_884_;
							i_863_ %= i_866_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public void method3426(int i, int i_895_, int i_896_, int i_897_, int i_898_, int i_899_, Class145 class145, int i_900_, int i_901_) {
		if (anIntArray9804 != null) {
			Class145_Sub1 class145_sub1 = (Class145_Sub1) class145;
			int[] is = class145_sub1.anIntArray9521;
			int[] is_902_ = class145_sub1.anIntArray9520;
			int i_903_ = (-695823527 * anInt9810 > i_901_ ? anInt9810 * -695823527 : i_901_);
			int i_904_ = (anInt9826 * 489020741 < is.length + i_901_ ? anInt9826 * 489020741 : is.length + i_901_);
			i_896_ -= i;
			i_897_ -= i_895_;
			if (i_897_ + i_896_ < 0) {
				i += i_896_;
				i_896_ = -i_896_;
				i_895_ += i_897_;
				i_897_ = -i_897_;
			}
			if (i_896_ > i_897_) {
				i_895_ <<= 16;
				i_895_ += 32768;
				i_897_ <<= 16;
				int i_905_ = (int) Math.floor((double) i_897_ / (double) i_896_ + 0.5);
				i_896_ += i;
				if (i < anInt9815 * -1373518821) {
					i_895_ += i_905_ * (-1373518821 * anInt9815 - i);
					i = -1373518821 * anInt9815;
				}
				if (i_896_ >= -272361347 * anInt9809)
					i_896_ = anInt9809 * -272361347 - 1;
				int i_906_ = i_898_ >>> 24;
				if (0 == i_899_ || i_899_ == 1 && 255 == i_906_) {
					for (/**/; i <= i_896_; i++) {
						int i_907_ = i_895_ >> 16;
						int i_908_ = i_907_ - i_901_;
						if (i_907_ >= i_903_ && i_907_ < i_904_) {
							int i_909_ = i_900_ + is[i_908_];
							if (i >= i_909_ && i < i_909_ + is_902_[i_908_])
								anIntArray9804[i + (anInt9825 * 1013077751 * i_907_)] = i_898_;
						}
						i_895_ += i_905_;
					}
				} else if (i_899_ == 1) {
					i_898_ = ((i_906_ * (i_898_ & 0xff00) >> 8 & 0xff00) + (i_906_ * (i_898_ & 0xff00ff) >> 8 & 0xff00ff) + (i_906_ << 24));
					int i_910_ = 256 - i_906_;
					for (/**/; i <= i_896_; i++) {
						int i_911_ = i_895_ >> 16;
						int i_912_ = i_911_ - i_901_;
						if (i_911_ >= i_903_ && i_911_ < i_904_) {
							int i_913_ = is[i_912_] + i_900_;
							if (i >= i_913_ && i < is_902_[i_912_] + i_913_) {
								int i_914_ = 1013077751 * anInt9825 * i_911_ + i;
								int i_915_ = anIntArray9804[i_914_];
								i_915_ = ((i_910_ * (i_915_ & 0xff00) >> 8 & 0xff00) + (i_910_ * (i_915_ & 0xff00ff) >> 8 & 0xff00ff));
								anIntArray9804[i_914_] = i_915_ + i_898_;
							}
						}
						i_895_ += i_905_;
					}
				} else if (2 == i_899_) {
					for (/**/; i <= i_896_; i++) {
						int i_916_ = i_895_ >> 16;
						int i_917_ = i_916_ - i_901_;
						if (i_916_ >= i_903_ && i_916_ < i_904_) {
							int i_918_ = is[i_917_] + i_900_;
							if (i >= i_918_ && i < i_918_ + is_902_[i_917_]) {
								int i_919_ = i + 1013077751 * anInt9825 * i_916_;
								int i_920_ = anIntArray9804[i_919_];
								int i_921_ = i_898_ + i_920_;
								int i_922_ = ((i_898_ & 0xff00ff) + (i_920_ & 0xff00ff));
								i_920_ = ((i_921_ - i_922_ & 0x10000) + (i_922_ & 0x1000100));
								anIntArray9804[i_919_] = i_921_ - i_920_ | i_920_ - (i_920_ >>> 8);
							}
						}
						i_895_ += i_905_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_896_ <<= 16;
				int i_923_ = (int) Math.floor(0.5 + ((double) i_896_ / (double) i_897_));
				i_897_ += i_895_;
				if (i_895_ < i_903_) {
					i += (i_903_ - i_895_) * i_923_;
					i_895_ = i_903_;
				}
				if (i_897_ >= i_904_)
					i_897_ = i_904_ - 1;
				int i_924_ = i_898_ >>> 24;
				if (0 == i_899_ || i_899_ == 1 && i_924_ == 255) {
					for (/**/; i_895_ <= i_897_; i_895_++) {
						int i_925_ = i >> 16;
						int i_926_ = i_895_ - i_901_;
						int i_927_ = i_900_ + is[i_926_];
						if (i_925_ >= anInt9815 * -1373518821 && i_925_ < -272361347 * anInt9809 && i_925_ >= i_927_ && i_925_ < i_927_ + is_902_[i_926_])
							anIntArray9804[(i_895_ * (1013077751 * anInt9825) + i_925_)] = i_898_;
						i += i_923_;
					}
				} else if (i_899_ == 1) {
					i_898_ = ((i_924_ * (i_898_ & 0xff00) >> 8 & 0xff00) + ((i_898_ & 0xff00ff) * i_924_ >> 8 & 0xff00ff) + (i_924_ << 24));
					int i_928_ = 256 - i_924_;
					for (/**/; i_895_ <= i_897_; i_895_++) {
						int i_929_ = i >> 16;
						int i_930_ = i_895_ - i_901_;
						int i_931_ = i_900_ + is[i_930_];
						if (i_929_ >= anInt9815 * -1373518821 && i_929_ < anInt9809 * -272361347 && i_929_ >= i_931_ && i_929_ < i_931_ + is_902_[i_930_]) {
							int i_932_ = i_929_ + anInt9825 * 1013077751 * i_895_;
							int i_933_ = anIntArray9804[i_932_];
							i_933_ = (((i_933_ & 0xff00ff) * i_928_ >> 8 & 0xff00ff) + (i_928_ * (i_933_ & 0xff00) >> 8 & 0xff00));
							anIntArray9804[(1013077751 * anInt9825 * i_895_ + i_929_)] = i_933_ + i_898_;
						}
						i += i_923_;
					}
				} else if (2 == i_899_) {
					for (/**/; i_895_ <= i_897_; i_895_++) {
						int i_934_ = i >> 16;
						int i_935_ = i_895_ - i_901_;
						int i_936_ = i_900_ + is[i_935_];
						if (i_934_ >= anInt9815 * -1373518821 && i_934_ < anInt9809 * -272361347 && i_934_ >= i_936_ && i_934_ < i_936_ + is_902_[i_935_]) {
							int i_937_ = i_895_ * (1013077751 * anInt9825) + i_934_;
							int i_938_ = anIntArray9804[i_937_];
							int i_939_ = i_938_ + i_898_;
							int i_940_ = (i_938_ & 0xff00ff) + (i_898_ & 0xff00ff);
							i_938_ = (i_939_ - i_940_ & 0x10000) + (i_940_ & 0x1000100);
							anIntArray9804[i_937_] = i_939_ - i_938_ | i_938_ - (i_938_ >>> 8);
						}
						i += i_923_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method3303(int i, int i_941_, int i_942_, int i_943_, int i_944_, int i_945_, Class145 class145, int i_946_, int i_947_) {
		if (anIntArray9804 != null) {
			Class145_Sub1 class145_sub1 = (Class145_Sub1) class145;
			int[] is = class145_sub1.anIntArray9521;
			int[] is_948_ = class145_sub1.anIntArray9520;
			int i_949_ = (-695823527 * anInt9810 > i_947_ ? anInt9810 * -695823527 : i_947_);
			int i_950_ = (anInt9826 * 489020741 < is.length + i_947_ ? anInt9826 * 489020741 : is.length + i_947_);
			i_942_ -= i;
			i_943_ -= i_941_;
			if (i_943_ + i_942_ < 0) {
				i += i_942_;
				i_942_ = -i_942_;
				i_941_ += i_943_;
				i_943_ = -i_943_;
			}
			if (i_942_ > i_943_) {
				i_941_ <<= 16;
				i_941_ += 32768;
				i_943_ <<= 16;
				int i_951_ = (int) Math.floor((double) i_943_ / (double) i_942_ + 0.5);
				i_942_ += i;
				if (i < anInt9815 * -1373518821) {
					i_941_ += i_951_ * (-1373518821 * anInt9815 - i);
					i = -1373518821 * anInt9815;
				}
				if (i_942_ >= -272361347 * anInt9809)
					i_942_ = anInt9809 * -272361347 - 1;
				int i_952_ = i_944_ >>> 24;
				if (0 == i_945_ || i_945_ == 1 && 255 == i_952_) {
					for (/**/; i <= i_942_; i++) {
						int i_953_ = i_941_ >> 16;
						int i_954_ = i_953_ - i_947_;
						if (i_953_ >= i_949_ && i_953_ < i_950_) {
							int i_955_ = i_946_ + is[i_954_];
							if (i >= i_955_ && i < i_955_ + is_948_[i_954_])
								anIntArray9804[i + (anInt9825 * 1013077751 * i_953_)] = i_944_;
						}
						i_941_ += i_951_;
					}
				} else if (i_945_ == 1) {
					i_944_ = ((i_952_ * (i_944_ & 0xff00) >> 8 & 0xff00) + (i_952_ * (i_944_ & 0xff00ff) >> 8 & 0xff00ff) + (i_952_ << 24));
					int i_956_ = 256 - i_952_;
					for (/**/; i <= i_942_; i++) {
						int i_957_ = i_941_ >> 16;
						int i_958_ = i_957_ - i_947_;
						if (i_957_ >= i_949_ && i_957_ < i_950_) {
							int i_959_ = is[i_958_] + i_946_;
							if (i >= i_959_ && i < is_948_[i_958_] + i_959_) {
								int i_960_ = 1013077751 * anInt9825 * i_957_ + i;
								int i_961_ = anIntArray9804[i_960_];
								i_961_ = ((i_956_ * (i_961_ & 0xff00) >> 8 & 0xff00) + (i_956_ * (i_961_ & 0xff00ff) >> 8 & 0xff00ff));
								anIntArray9804[i_960_] = i_961_ + i_944_;
							}
						}
						i_941_ += i_951_;
					}
				} else if (2 == i_945_) {
					for (/**/; i <= i_942_; i++) {
						int i_962_ = i_941_ >> 16;
						int i_963_ = i_962_ - i_947_;
						if (i_962_ >= i_949_ && i_962_ < i_950_) {
							int i_964_ = is[i_963_] + i_946_;
							if (i >= i_964_ && i < i_964_ + is_948_[i_963_]) {
								int i_965_ = i + 1013077751 * anInt9825 * i_962_;
								int i_966_ = anIntArray9804[i_965_];
								int i_967_ = i_944_ + i_966_;
								int i_968_ = ((i_944_ & 0xff00ff) + (i_966_ & 0xff00ff));
								i_966_ = ((i_967_ - i_968_ & 0x10000) + (i_968_ & 0x1000100));
								anIntArray9804[i_965_] = i_967_ - i_966_ | i_966_ - (i_966_ >>> 8);
							}
						}
						i_941_ += i_951_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_942_ <<= 16;
				int i_969_ = (int) Math.floor(0.5 + ((double) i_942_ / (double) i_943_));
				i_943_ += i_941_;
				if (i_941_ < i_949_) {
					i += (i_949_ - i_941_) * i_969_;
					i_941_ = i_949_;
				}
				if (i_943_ >= i_950_)
					i_943_ = i_950_ - 1;
				int i_970_ = i_944_ >>> 24;
				if (0 == i_945_ || i_945_ == 1 && i_970_ == 255) {
					for (/**/; i_941_ <= i_943_; i_941_++) {
						int i_971_ = i >> 16;
						int i_972_ = i_941_ - i_947_;
						int i_973_ = i_946_ + is[i_972_];
						if (i_971_ >= anInt9815 * -1373518821 && i_971_ < -272361347 * anInt9809 && i_971_ >= i_973_ && i_971_ < i_973_ + is_948_[i_972_])
							anIntArray9804[(i_941_ * (1013077751 * anInt9825) + i_971_)] = i_944_;
						i += i_969_;
					}
				} else if (i_945_ == 1) {
					i_944_ = ((i_970_ * (i_944_ & 0xff00) >> 8 & 0xff00) + ((i_944_ & 0xff00ff) * i_970_ >> 8 & 0xff00ff) + (i_970_ << 24));
					int i_974_ = 256 - i_970_;
					for (/**/; i_941_ <= i_943_; i_941_++) {
						int i_975_ = i >> 16;
						int i_976_ = i_941_ - i_947_;
						int i_977_ = i_946_ + is[i_976_];
						if (i_975_ >= anInt9815 * -1373518821 && i_975_ < anInt9809 * -272361347 && i_975_ >= i_977_ && i_975_ < i_977_ + is_948_[i_976_]) {
							int i_978_ = i_975_ + anInt9825 * 1013077751 * i_941_;
							int i_979_ = anIntArray9804[i_978_];
							i_979_ = (((i_979_ & 0xff00ff) * i_974_ >> 8 & 0xff00ff) + (i_974_ * (i_979_ & 0xff00) >> 8 & 0xff00));
							anIntArray9804[(1013077751 * anInt9825 * i_941_ + i_975_)] = i_979_ + i_944_;
						}
						i += i_969_;
					}
				} else if (2 == i_945_) {
					for (/**/; i_941_ <= i_943_; i_941_++) {
						int i_980_ = i >> 16;
						int i_981_ = i_941_ - i_947_;
						int i_982_ = i_946_ + is[i_981_];
						if (i_980_ >= anInt9815 * -1373518821 && i_980_ < anInt9809 * -272361347 && i_980_ >= i_982_ && i_980_ < i_982_ + is_948_[i_981_]) {
							int i_983_ = i_941_ * (1013077751 * anInt9825) + i_980_;
							int i_984_ = anIntArray9804[i_983_];
							int i_985_ = i_984_ + i_944_;
							int i_986_ = (i_984_ & 0xff00ff) + (i_944_ & 0xff00ff);
							i_984_ = (i_985_ - i_986_ & 0x10000) + (i_986_ & 0x1000100);
							anIntArray9804[i_983_] = i_985_ - i_984_ | i_984_ - (i_984_ >>> 8);
						}
						i += i_969_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method3249(int i, int i_987_, int i_988_, int i_989_, int i_990_, int i_991_, Class145 class145, int i_992_, int i_993_) {
		if (anIntArray9804 != null) {
			Class145_Sub1 class145_sub1 = (Class145_Sub1) class145;
			int[] is = class145_sub1.anIntArray9521;
			int[] is_994_ = class145_sub1.anIntArray9520;
			int i_995_ = (-695823527 * anInt9810 > i_993_ ? anInt9810 * -695823527 : i_993_);
			int i_996_ = (anInt9826 * 489020741 < is.length + i_993_ ? anInt9826 * 489020741 : is.length + i_993_);
			i_988_ -= i;
			i_989_ -= i_987_;
			if (i_989_ + i_988_ < 0) {
				i += i_988_;
				i_988_ = -i_988_;
				i_987_ += i_989_;
				i_989_ = -i_989_;
			}
			if (i_988_ > i_989_) {
				i_987_ <<= 16;
				i_987_ += 32768;
				i_989_ <<= 16;
				int i_997_ = (int) Math.floor((double) i_989_ / (double) i_988_ + 0.5);
				i_988_ += i;
				if (i < anInt9815 * -1373518821) {
					i_987_ += i_997_ * (-1373518821 * anInt9815 - i);
					i = -1373518821 * anInt9815;
				}
				if (i_988_ >= -272361347 * anInt9809)
					i_988_ = anInt9809 * -272361347 - 1;
				int i_998_ = i_990_ >>> 24;
				if (0 == i_991_ || i_991_ == 1 && 255 == i_998_) {
					for (/**/; i <= i_988_; i++) {
						int i_999_ = i_987_ >> 16;
						int i_1000_ = i_999_ - i_993_;
						if (i_999_ >= i_995_ && i_999_ < i_996_) {
							int i_1001_ = i_992_ + is[i_1000_];
							if (i >= i_1001_ && i < i_1001_ + is_994_[i_1000_])
								anIntArray9804[i + (anInt9825 * 1013077751 * i_999_)] = i_990_;
						}
						i_987_ += i_997_;
					}
				} else if (i_991_ == 1) {
					i_990_ = ((i_998_ * (i_990_ & 0xff00) >> 8 & 0xff00) + (i_998_ * (i_990_ & 0xff00ff) >> 8 & 0xff00ff) + (i_998_ << 24));
					int i_1002_ = 256 - i_998_;
					for (/**/; i <= i_988_; i++) {
						int i_1003_ = i_987_ >> 16;
						int i_1004_ = i_1003_ - i_993_;
						if (i_1003_ >= i_995_ && i_1003_ < i_996_) {
							int i_1005_ = is[i_1004_] + i_992_;
							if (i >= i_1005_ && i < is_994_[i_1004_] + i_1005_) {
								int i_1006_ = 1013077751 * anInt9825 * i_1003_ + i;
								int i_1007_ = anIntArray9804[i_1006_];
								i_1007_ = ((i_1002_ * (i_1007_ & 0xff00) >> 8 & 0xff00) + (i_1002_ * (i_1007_ & 0xff00ff) >> 8 & 0xff00ff));
								anIntArray9804[i_1006_] = i_1007_ + i_990_;
							}
						}
						i_987_ += i_997_;
					}
				} else if (2 == i_991_) {
					for (/**/; i <= i_988_; i++) {
						int i_1008_ = i_987_ >> 16;
						int i_1009_ = i_1008_ - i_993_;
						if (i_1008_ >= i_995_ && i_1008_ < i_996_) {
							int i_1010_ = is[i_1009_] + i_992_;
							if (i >= i_1010_ && i < i_1010_ + is_994_[i_1009_]) {
								int i_1011_ = i + 1013077751 * anInt9825 * i_1008_;
								int i_1012_ = anIntArray9804[i_1011_];
								int i_1013_ = i_990_ + i_1012_;
								int i_1014_ = ((i_990_ & 0xff00ff) + (i_1012_ & 0xff00ff));
								i_1012_ = ((i_1013_ - i_1014_ & 0x10000) + (i_1014_ & 0x1000100));
								anIntArray9804[i_1011_] = i_1013_ - i_1012_ | i_1012_ - (i_1012_ >>> 8);
							}
						}
						i_987_ += i_997_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_988_ <<= 16;
				int i_1015_ = (int) Math.floor(0.5 + ((double) i_988_ / (double) i_989_));
				i_989_ += i_987_;
				if (i_987_ < i_995_) {
					i += (i_995_ - i_987_) * i_1015_;
					i_987_ = i_995_;
				}
				if (i_989_ >= i_996_)
					i_989_ = i_996_ - 1;
				int i_1016_ = i_990_ >>> 24;
				if (0 == i_991_ || i_991_ == 1 && i_1016_ == 255) {
					for (/**/; i_987_ <= i_989_; i_987_++) {
						int i_1017_ = i >> 16;
						int i_1018_ = i_987_ - i_993_;
						int i_1019_ = i_992_ + is[i_1018_];
						if (i_1017_ >= anInt9815 * -1373518821 && i_1017_ < -272361347 * anInt9809 && i_1017_ >= i_1019_ && i_1017_ < i_1019_ + is_994_[i_1018_])
							anIntArray9804[(i_987_ * (1013077751 * anInt9825) + i_1017_)] = i_990_;
						i += i_1015_;
					}
				} else if (i_991_ == 1) {
					i_990_ = ((i_1016_ * (i_990_ & 0xff00) >> 8 & 0xff00) + ((i_990_ & 0xff00ff) * i_1016_ >> 8 & 0xff00ff) + (i_1016_ << 24));
					int i_1020_ = 256 - i_1016_;
					for (/**/; i_987_ <= i_989_; i_987_++) {
						int i_1021_ = i >> 16;
						int i_1022_ = i_987_ - i_993_;
						int i_1023_ = i_992_ + is[i_1022_];
						if (i_1021_ >= anInt9815 * -1373518821 && i_1021_ < anInt9809 * -272361347 && i_1021_ >= i_1023_ && i_1021_ < i_1023_ + is_994_[i_1022_]) {
							int i_1024_ = i_1021_ + anInt9825 * 1013077751 * i_987_;
							int i_1025_ = anIntArray9804[i_1024_];
							i_1025_ = (((i_1025_ & 0xff00ff) * i_1020_ >> 8 & 0xff00ff) + (i_1020_ * (i_1025_ & 0xff00) >> 8 & 0xff00));
							anIntArray9804[(1013077751 * anInt9825 * i_987_ + i_1021_)] = i_1025_ + i_990_;
						}
						i += i_1015_;
					}
				} else if (2 == i_991_) {
					for (/**/; i_987_ <= i_989_; i_987_++) {
						int i_1026_ = i >> 16;
						int i_1027_ = i_987_ - i_993_;
						int i_1028_ = i_992_ + is[i_1027_];
						if (i_1026_ >= anInt9815 * -1373518821 && i_1026_ < anInt9809 * -272361347 && i_1026_ >= i_1028_ && i_1026_ < i_1028_ + is_994_[i_1027_]) {
							int i_1029_ = i_987_ * (1013077751 * anInt9825) + i_1026_;
							int i_1030_ = anIntArray9804[i_1029_];
							int i_1031_ = i_1030_ + i_990_;
							int i_1032_ = (i_1030_ & 0xff00ff) + (i_990_ & 0xff00ff);
							i_1030_ = ((i_1031_ - i_1032_ & 0x10000) + (i_1032_ & 0x1000100));
							anIntArray9804[i_1029_] = i_1031_ - i_1030_ | i_1030_ - (i_1030_ >>> 8);
						}
						i += i_1015_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method3037(int i, int i_1033_, int i_1034_, int i_1035_, int i_1036_, int i_1037_, int i_1038_) {
		if (anIntArray9804 != null) {
			Class99 class99 = method15475(Thread.currentThread());
			Class118 class118 = class99.aClass118_1200;
			int i_1039_ = i_1034_ - i;
			int i_1040_ = i_1035_ - i_1033_;
			int i_1041_ = i_1039_ >= 0 ? i_1039_ : -i_1039_;
			int i_1042_ = i_1040_ >= 0 ? i_1040_ : -i_1040_;
			int i_1043_ = i_1041_;
			if (i_1043_ < i_1042_)
				i_1043_ = i_1042_;
			if (i_1043_ != 0) {
				int i_1044_ = (i_1039_ << 16) / i_1043_;
				int i_1045_ = (i_1040_ << 16) / i_1043_;
				i_1039_ += i_1044_ >> 16;
				i_1040_ += i_1045_ >> 16;
				if (i_1045_ <= i_1044_)
					i_1044_ = -i_1044_;
				else
					i_1045_ = -i_1045_;
				int i_1046_ = i_1045_ * i_1037_ >> 17;
				int i_1047_ = i_1037_ * i_1045_ + 1 >> 17;
				int i_1048_ = i_1037_ * i_1044_ >> 17;
				int i_1049_ = i_1044_ * i_1037_ + 1 >> 17;
				i -= class118.method2039();
				i_1033_ -= class118.method2054();
				int i_1050_ = i + i_1046_;
				int i_1051_ = i - i_1047_;
				int i_1052_ = i + i_1039_ - i_1047_;
				int i_1053_ = i_1039_ + i + i_1046_;
				int i_1054_ = i_1048_ + i_1033_;
				int i_1055_ = i_1033_ - i_1049_;
				int i_1056_ = i_1040_ + i_1033_ - i_1049_;
				int i_1057_ = i_1048_ + (i_1033_ + i_1040_);
				if (i_1038_ == 0)
					class118.anInt1438 = 0;
				else if (1 == i_1038_)
					class118.anInt1438 = 255 - (i_1036_ >>> 24);
				else
					throw new IllegalArgumentException();
				method3287(false);
				class118.aBool1455 = (i_1050_ < 0 || i_1050_ > class118.anInt1448 || i_1051_ < 0 || i_1051_ > class118.anInt1448 || i_1052_ < 0 || i_1052_ > class118.anInt1448);
				class118.method2037(true, false, false, (float) i_1054_, (float) i_1055_, (float) i_1056_, (float) i_1050_, (float) i_1051_, (float) i_1052_, 100.0F, 100.0F, 100.0F, i_1036_);
				class118.aBool1455 = (i_1050_ < 0 || i_1050_ > class118.anInt1448 || i_1052_ < 0 || i_1052_ > class118.anInt1448 || i_1053_ < 0 || i_1053_ > class118.anInt1448);
				class118.method2037(true, false, false, (float) i_1054_, (float) i_1056_, (float) i_1057_, (float) i_1050_, (float) i_1052_, (float) i_1053_, 100.0F, 100.0F, 100.0F, i_1036_);
				method3287(true);
			}
		}
	}

	boolean method3229(int i, int i_1058_, int i_1059_, int i_1060_, Class435 class435, Class430 class430) {
		Class441 class441 = method3112();
		class441.method7090(class435);
		class441.method7089(aClass441_9821);
		return class430.method6786(i, i_1058_, i_1059_, i_1060_, class441, aFloat9828, aFloat9830, aFloat9827, aFloat9829);
	}

	public Class185 method3133(int i) {
		return null;
	}

	public void method3062(int i, int i_1061_) {
		/* empty */
	}

	public void method3254(Class435 class435, Class180 class180, Class430 class430) {
		Class441 class441 = method3112();
		class441.method7090(class435);
		class441.method7089(aClass441_9821);
		class180.method3531(class430, aClass441_9805, class441, aFloat9828, aFloat9830, aFloat9827, aFloat9829);
	}

	public void method3255(Class435 class435, Class180 class180, Class430 class430) {
		Class441 class441 = method3112();
		class441.method7090(class435);
		class441.method7089(aClass441_9821);
		class180.method3531(class430, aClass441_9805, class441, aFloat9828, aFloat9830, aFloat9827, aFloat9829);
	}

	public Class523_Sub8 method3078(int i) {
		return null;
	}

	public Class523_Sub8 method3257(int i) {
		return null;
	}

	public Class523_Sub8 method3258(int i) {
		return null;
	}

	public Class148 method3102(int[] is, int i, int i_1062_, int i_1063_, int i_1064_, boolean bool) {
		boolean bool_1065_ = false;
		int i_1066_ = i;
		while_130_: for (int i_1067_ = 0; i_1067_ < i_1064_; i_1067_++) {
			for (int i_1068_ = 0; i_1068_ < i_1063_; i_1068_++) {
				int i_1069_ = is[i_1066_++] >>> 24;
				if (0 != i_1069_ && 255 != i_1069_) {
					bool_1065_ = true;
					break while_130_;
				}
			}
		}
		if (bool_1065_)
			return new Class148_Sub1_Sub1(this, is, i, i_1062_, i_1063_, i_1064_, bool);
		return new Class148_Sub1_Sub3(this, is, i, i_1062_, i_1063_, i_1064_, bool);
	}

	public Class148 method3264(int[] is, int i, int i_1070_, int i_1071_, int i_1072_, boolean bool) {
		boolean bool_1073_ = false;
		int i_1074_ = i;
		while_131_: for (int i_1075_ = 0; i_1075_ < i_1072_; i_1075_++) {
			for (int i_1076_ = 0; i_1076_ < i_1071_; i_1076_++) {
				int i_1077_ = is[i_1074_++] >>> 24;
				if (0 != i_1077_ && 255 != i_1077_) {
					bool_1073_ = true;
					break while_131_;
				}
			}
		}
		if (bool_1073_)
			return new Class148_Sub1_Sub1(this, is, i, i_1070_, i_1071_, i_1072_, bool);
		return new Class148_Sub1_Sub3(this, is, i, i_1070_, i_1071_, i_1072_, bool);
	}

	public Class148 method3261(int i, int i_1078_, boolean bool, boolean bool_1079_) {
		if (bool)
			return new Class148_Sub1_Sub1(this, i, i_1078_);
		return new Class148_Sub1_Sub3(this, i, i_1078_);
	}

	public void method3466(int i, int i_1080_, int i_1081_) {
		/* empty */
	}

	public Class148 method3263(int[] is, int i, int i_1082_, int i_1083_, int i_1084_, boolean bool) {
		boolean bool_1085_ = false;
		int i_1086_ = i;
		while_132_: for (int i_1087_ = 0; i_1087_ < i_1084_; i_1087_++) {
			for (int i_1088_ = 0; i_1088_ < i_1083_; i_1088_++) {
				int i_1089_ = is[i_1086_++] >>> 24;
				if (0 != i_1089_ && 255 != i_1089_) {
					bool_1085_ = true;
					break while_132_;
				}
			}
		}
		if (bool_1085_)
			return new Class148_Sub1_Sub1(this, is, i, i_1082_, i_1083_, i_1084_, bool);
		return new Class148_Sub1_Sub3(this, is, i, i_1082_, i_1083_, i_1084_, bool);
	}

	void method3119(int i, int i_1090_, int i_1091_, int i_1092_, int i_1093_) {
		if (null != anIntArray9804 && (i >= anInt9815 * -1373518821 && i < anInt9809 * -272361347)) {
			if (i_1090_ < -695823527 * anInt9810) {
				i_1091_ -= anInt9810 * -695823527 - i_1090_;
				i_1090_ = -695823527 * anInt9810;
			}
			if (i_1091_ + i_1090_ > 489020741 * anInt9826)
				i_1091_ = anInt9826 * 489020741 - i_1090_;
			int i_1094_ = 1013077751 * anInt9825 * i_1090_ + i;
			int i_1095_ = i_1092_ >>> 24;
			if (0 == i_1093_ || i_1093_ == 1 && i_1095_ == 255) {
				for (int i_1096_ = 0; i_1096_ < i_1091_; i_1096_++)
					anIntArray9804[anInt9825 * 1013077751 * i_1096_ + i_1094_] = i_1092_;
			} else if (i_1093_ == 1) {
				i_1092_ = (((i_1092_ & 0xff00) * i_1095_ >> 8 & 0xff00) + ((i_1092_ & 0xff00ff) * i_1095_ >> 8 & 0xff00ff) + (i_1095_ << 24));
				int i_1097_ = 256 - i_1095_;
				for (int i_1098_ = 0; i_1098_ < i_1091_; i_1098_++) {
					int i_1099_ = 1013077751 * anInt9825 * i_1098_ + i_1094_;
					int i_1100_ = anIntArray9804[i_1099_];
					i_1100_ = ((i_1097_ * (i_1100_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_1100_ & 0xff00) * i_1097_ >> 8 & 0xff00));
					anIntArray9804[i_1099_] = i_1100_ + i_1092_;
				}
			} else if (2 == i_1093_) {
				for (int i_1101_ = 0; i_1101_ < i_1091_; i_1101_++) {
					int i_1102_ = 1013077751 * anInt9825 * i_1101_ + i_1094_;
					int i_1103_ = anIntArray9804[i_1102_];
					int i_1104_ = i_1103_ + i_1092_;
					int i_1105_ = (i_1103_ & 0xff00ff) + (i_1092_ & 0xff00ff);
					i_1103_ = (i_1104_ - i_1105_ & 0x10000) + (i_1105_ & 0x1000100);
					anIntArray9804[i_1102_] = i_1104_ - i_1103_ | i_1103_ - (i_1103_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public Class148 method3265(Class175 class175, boolean bool) {
		int i = class175.method2944();
		int i_1106_ = class175.method2945();
		Class148_Sub1 class148_sub1;
		if (bool && !class175.method2943() && class175.method2942()) {
			Class175_Sub2 class175_sub2 = (Class175_Sub2) class175;
			int[] is = new int[class175_sub2.anIntArray9850.length];
			byte[] is_1107_ = new byte[i_1106_ * i];
			for (int i_1108_ = 0; i_1108_ < i_1106_; i_1108_++) {
				int i_1109_ = i * i_1108_;
				for (int i_1110_ = 0; i_1110_ < i; i_1110_++)
					is_1107_[i_1109_ + i_1110_] = class175_sub2.aByteArray9857[i_1109_ + i_1110_];
			}
			for (int i_1111_ = 0; i_1111_ < class175_sub2.anIntArray9850.length; i_1111_++)
				is[i_1111_] = class175_sub2.anIntArray9850[i_1111_];
			class148_sub1 = new Class148_Sub1_Sub2(this, is_1107_, is, i, i_1106_);
		} else {
			int[] is = class175.method2959(false);
			if (class175.method2943())
				class148_sub1 = new Class148_Sub1_Sub1(this, is, i, i_1106_);
			else
				class148_sub1 = new Class148_Sub1_Sub3(this, is, i, i_1106_);
		}
		class148_sub1.method2426(class175.method2946(), class175.method2948(), class175.method2984(), class175.method2949());
		return class148_sub1;
	}

	public Class148 method3091(Class175 class175, boolean bool) {
		int i = class175.method2944();
		int i_1112_ = class175.method2945();
		Class148_Sub1 class148_sub1;
		if (bool && !class175.method2943() && class175.method2942()) {
			Class175_Sub2 class175_sub2 = (Class175_Sub2) class175;
			int[] is = new int[class175_sub2.anIntArray9850.length];
			byte[] is_1113_ = new byte[i_1112_ * i];
			for (int i_1114_ = 0; i_1114_ < i_1112_; i_1114_++) {
				int i_1115_ = i * i_1114_;
				for (int i_1116_ = 0; i_1116_ < i; i_1116_++)
					is_1113_[i_1115_ + i_1116_] = class175_sub2.aByteArray9857[i_1115_ + i_1116_];
			}
			for (int i_1117_ = 0; i_1117_ < class175_sub2.anIntArray9850.length; i_1117_++)
				is[i_1117_] = class175_sub2.anIntArray9850[i_1117_];
			class148_sub1 = new Class148_Sub1_Sub2(this, is_1113_, is, i, i_1112_);
		} else {
			int[] is = class175.method2959(false);
			if (class175.method2943())
				class148_sub1 = new Class148_Sub1_Sub1(this, is, i, i_1112_);
			else
				class148_sub1 = new Class148_Sub1_Sub3(this, is, i, i_1112_);
		}
		class148_sub1.method2426(class175.method2946(), class175.method2948(), class175.method2984(), class175.method2949());
		return class148_sub1;
	}

	public Class148 method3280(int i, int i_1118_, int i_1119_, int i_1120_, boolean bool) {
		if (null == anIntArray9804)
			throw new IllegalStateException("");
		int[] is = new int[i_1119_ * i_1120_];
		int i_1121_ = anInt9825 * 1013077751 * i_1118_ + i;
		int i_1122_ = anInt9825 * 1013077751 - i_1119_;
		for (int i_1123_ = 0; i_1123_ < i_1120_; i_1123_++) {
			int i_1124_ = i_1123_ * i_1119_;
			for (int i_1125_ = 0; i_1125_ < i_1119_; i_1125_++)
				is[i_1124_ + i_1125_] = anIntArray9804[i_1121_++];
			i_1121_ += i_1122_;
		}
		if (bool)
			return new Class148_Sub1_Sub1(this, is, i_1119_, i_1120_);
		return new Class148_Sub1_Sub3(this, is, i_1119_, i_1120_);
	}

	public Class145 method3268(int i, int i_1126_, int[] is, int[] is_1127_) {
		return new Class145_Sub1(i, i_1126_, is, is_1127_);
	}

	public void method3269(int i, Class145 class145, int i_1128_, int i_1129_) {
		if (null != anIntArray9804) {
			Class145_Sub1 class145_sub1 = (Class145_Sub1) class145;
			int[] is = class145_sub1.anIntArray9521;
			int[] is_1130_ = class145_sub1.anIntArray9520;
			int i_1131_;
			if (anInt9826 * 489020741 < i_1129_ + is.length)
				i_1131_ = 489020741 * anInt9826 - i_1129_;
			else
				i_1131_ = is.length;
			int i_1132_;
			if (anInt9810 * -695823527 > i_1129_) {
				i_1132_ = anInt9810 * -695823527 - i_1129_;
				i_1129_ = anInt9810 * -695823527;
			} else
				i_1132_ = 0;
			if (i_1131_ - i_1132_ > 0) {
				int i_1133_ = anInt9825 * 1013077751 * i_1129_;
				for (int i_1134_ = i_1132_; i_1134_ < i_1131_; i_1134_++) {
					int i_1135_ = i_1128_ + is[i_1134_];
					int i_1136_ = is_1130_[i_1134_];
					if (-1373518821 * anInt9815 > i_1135_) {
						i_1136_ -= anInt9815 * -1373518821 - i_1135_;
						i_1135_ = -1373518821 * anInt9815;
					}
					if (anInt9809 * -272361347 < i_1135_ + i_1136_)
						i_1136_ = anInt9809 * -272361347 - i_1135_;
					i_1135_ += i_1133_;
					for (int i_1137_ = -i_1136_; i_1137_ < 0; i_1137_++)
						anIntArray9804[i_1135_++] = i;
					i_1133_ += anInt9825 * 1013077751;
				}
			}
		}
	}

	public void method3270(int i, Class145 class145, int i_1138_, int i_1139_) {
		if (null != anIntArray9804) {
			Class145_Sub1 class145_sub1 = (Class145_Sub1) class145;
			int[] is = class145_sub1.anIntArray9521;
			int[] is_1140_ = class145_sub1.anIntArray9520;
			int i_1141_;
			if (anInt9826 * 489020741 < i_1139_ + is.length)
				i_1141_ = 489020741 * anInt9826 - i_1139_;
			else
				i_1141_ = is.length;
			int i_1142_;
			if (anInt9810 * -695823527 > i_1139_) {
				i_1142_ = anInt9810 * -695823527 - i_1139_;
				i_1139_ = anInt9810 * -695823527;
			} else
				i_1142_ = 0;
			if (i_1141_ - i_1142_ > 0) {
				int i_1143_ = anInt9825 * 1013077751 * i_1139_;
				for (int i_1144_ = i_1142_; i_1144_ < i_1141_; i_1144_++) {
					int i_1145_ = i_1138_ + is[i_1144_];
					int i_1146_ = is_1140_[i_1144_];
					if (-1373518821 * anInt9815 > i_1145_) {
						i_1146_ -= anInt9815 * -1373518821 - i_1145_;
						i_1145_ = -1373518821 * anInt9815;
					}
					if (anInt9809 * -272361347 < i_1145_ + i_1146_)
						i_1146_ = anInt9809 * -272361347 - i_1145_;
					i_1145_ += i_1143_;
					for (int i_1147_ = -i_1146_; i_1147_ < 0; i_1147_++)
						anIntArray9804[i_1145_++] = i;
					i_1143_ += anInt9825 * 1013077751;
				}
			}
		}
	}

	public void method3271(int i, Class145 class145, int i_1148_, int i_1149_) {
		if (null != anIntArray9804) {
			Class145_Sub1 class145_sub1 = (Class145_Sub1) class145;
			int[] is = class145_sub1.anIntArray9521;
			int[] is_1150_ = class145_sub1.anIntArray9520;
			int i_1151_;
			if (anInt9826 * 489020741 < i_1149_ + is.length)
				i_1151_ = 489020741 * anInt9826 - i_1149_;
			else
				i_1151_ = is.length;
			int i_1152_;
			if (anInt9810 * -695823527 > i_1149_) {
				i_1152_ = anInt9810 * -695823527 - i_1149_;
				i_1149_ = anInt9810 * -695823527;
			} else
				i_1152_ = 0;
			if (i_1151_ - i_1152_ > 0) {
				int i_1153_ = anInt9825 * 1013077751 * i_1149_;
				for (int i_1154_ = i_1152_; i_1154_ < i_1151_; i_1154_++) {
					int i_1155_ = i_1148_ + is[i_1154_];
					int i_1156_ = is_1150_[i_1154_];
					if (-1373518821 * anInt9815 > i_1155_) {
						i_1156_ -= anInt9815 * -1373518821 - i_1155_;
						i_1155_ = -1373518821 * anInt9815;
					}
					if (anInt9809 * -272361347 < i_1155_ + i_1156_)
						i_1156_ = anInt9809 * -272361347 - i_1155_;
					i_1155_ += i_1153_;
					for (int i_1157_ = -i_1156_; i_1157_ < 0; i_1157_++)
						anIntArray9804[i_1155_++] = i;
					i_1153_ += anInt9825 * 1013077751;
				}
			}
		}
	}

	public void method3118() {
		/* empty */
	}

	public void method3273(int i) {
		Class167_Sub1.anInt9071 = Class167_Sub1.anInt9050 = i;
		if (anInt9819 * 1353126165 > 1)
			throw new IllegalStateException();
		method15426(anInt9819 * 1353126165);
		method15425(0);
	}

	public int method3117(int i, int i_1158_) {
		return i | i_1158_;
	}

	public void method3192(float f, float f_1159_) {
		aFloat9833 = f_1159_ - f;
		aFloat9832 = f + f_1159_ - 1.0F;
		for (int i = 0; i < 1353126165 * anInt9819; i++) {
			Class99 class99 = aClass99Array9836[i];
			Class118 class118 = class99.aClass118_1200;
			class118.aFloat1447 = aFloat9833;
			class118.aFloat1458 = aFloat9832;
		}
	}

	public void method3276(int i) {
		Class167_Sub1.anInt9071 = Class167_Sub1.anInt9050 = i;
		if (anInt9819 * 1353126165 > 1)
			throw new IllegalStateException();
		method15426(anInt9819 * 1353126165);
		method15425(0);
	}

	public boolean method3309() {
		return false;
	}

	public Class167 method3246(Class179 class179, int i, int i_1160_, int i_1161_, int i_1162_) {
		return new Class167_Sub1(this, class179, i, i_1161_, i_1162_, i_1160_);
	}

	public int method3279(int i, int i_1163_) {
		i |= 0x20800;
		return i & i_1163_ ^ i_1163_;
	}

	public Interface23 method3403(int i, int i_1164_) {
		return new Class140(i, i_1164_);
	}

	public int method3187() {
		return 0;
	}

	public int method3282(int i, int i_1165_) {
		return i | i_1165_;
	}

	public int method3183(int i, int i_1166_) {
		return i | i_1166_;
	}

	boolean method15460() {
		return aBool9812;
	}

	public Class142 method3367(int i, int i_1167_, int[][] is, int[][] is_1168_, int i_1169_, int i_1170_, int i_1171_) {
		return new Class142_Sub3(this, i_1170_, i_1171_, i, i_1167_, is, is_1168_, i_1169_);
	}

	public void method3061(int i, int i_1172_, int i_1173_) {
		/* empty */
	}

	public boolean method3457() {
		return false;
	}

	public Class441 method3288() {
		Class99 class99 = method15475(Thread.currentThread());
		return class99.aClass441_1198;
	}

	public Class441 method3052() {
		Class99 class99 = method15475(Thread.currentThread());
		return class99.aClass441_1198;
	}

	public boolean method3202() {
		return false;
	}

	byte method15461(int i) {
		return aClass172_1916.method2895(i, 15818314).aByte1889;
	}

	public int method3292() {
		return 0;
	}

	public int method3169() {
		return 0;
	}

	public Class523_Sub20 method3098(int i, int i_1174_, int i_1175_, int i_1176_, int i_1177_, float f) {
		return null;
	}

	public void method3321(Class185 class185) {
		/* empty */
	}

	public void method3296(int i, Class523_Sub20[] class523_sub20s) {
		/* empty */
	}

	public Class168_Sub1 method3248() {
		return new Class168_Sub1_Sub2(this);
	}

	void method15462(int i) {
		aClass99Array9836[i].method1782(Thread.currentThread(), -1637414159);
	}

	void method15463(int i) {
		aClass99Array9836[i].method1782(Thread.currentThread(), -1166406436);
	}

	public void method3216(long l) {
		/* empty */
	}

	void method15464(boolean bool, boolean bool_1178_, boolean bool_1179_, Class522_Sub2_Sub1 class522_sub2_sub1, int i, int i_1180_, float f, int i_1181_) {
		int i_1182_ = class522_sub2_sub1.anInt11571;
		int i_1183_ = i_1181_;
		i_1181_ <<= 1;
		if (i_1182_ == -1)
			method15466(bool_1178_, i, i_1180_, f, i_1183_, class522_sub2_sub1.anInt11570, 1);
		else {
			if (i_1182_ != 782405937 * anInt9838) {
				Class148 class148 = (Class148) aClass209_9835.method3767((long) i_1182_);
				if (null == class148) {
					Class177 class177 = aClass172_1916.method2895(i_1182_, -1219731256);
					int[] is = method15413(i_1182_);
					if (is != null) {
						int i_1184_ = 1075916655 * class177.anInt1913;
						class148 = method3103(is, 0, i_1184_, i_1184_, i_1184_, -2094178497);
						aClass209_9835.method3770(class148, (long) i_1182_);
					} else
						return;
				}
				anInt9838 = i_1182_ * -646371375;
				aClass148_9837 = class148;
			}
			i_1181_++;
			((Class148_Sub1) aClass148_9837).method14403(bool, bool_1178_, bool_1179_, i - i_1183_, i_1180_ - i_1183_, f, i_1181_, i_1181_, 0, class522_sub2_sub1.anInt11570, 1, 1, false);
		}
	}

	void method15465(int i) {
		anInt9819 = 81573437 * i;
		aClass99Array9836 = new Class99[1353126165 * anInt9819];
		for (int i_1185_ = 0; i_1185_ < 1353126165 * anInt9819; i_1185_++)
			aClass99Array9836[i_1185_] = new Class99(this);
	}

	public void method3126(float f) {
		anInt9817 = 2063625163 * (int) (f * 65535.0F);
	}

	void method15466(boolean bool, int i, int i_1186_, float f, int i_1187_, int i_1188_, int i_1189_) {
		if (null != anIntArray9804) {
			if (i_1187_ < 0)
				i_1187_ = -i_1187_;
			int i_1190_ = i_1186_ - i_1187_;
			if (i_1190_ < anInt9810 * -695823527)
				i_1190_ = -695823527 * anInt9810;
			int i_1191_ = i_1187_ + i_1186_ + 1;
			if (i_1191_ > anInt9826 * 489020741)
				i_1191_ = 489020741 * anInt9826;
			int i_1192_ = i_1190_;
			int i_1193_ = i_1187_ * i_1187_;
			int i_1194_ = 0;
			int i_1195_ = i_1186_ - i_1192_;
			int i_1196_ = i_1195_ * i_1195_;
			int i_1197_ = i_1196_ - i_1195_;
			if (i_1186_ > i_1191_)
				i_1186_ = i_1191_;
			int i_1198_ = i_1188_ >>> 24;
			if (i_1189_ == 0 || i_1189_ == 1 && i_1198_ == 255) {
				while (i_1192_ < i_1186_) {
					for (/**/; i_1197_ <= i_1193_ || i_1196_ <= i_1193_; i_1197_ += i_1194_++ + i_1194_)
						i_1196_ += i_1194_ + i_1194_;
					int i_1199_ = i - i_1194_ + 1;
					if (i_1199_ < anInt9815 * -1373518821)
						i_1199_ = -1373518821 * anInt9815;
					int i_1200_ = i + i_1194_;
					if (i_1200_ > -272361347 * anInt9809)
						i_1200_ = -272361347 * anInt9809;
					int i_1201_ = i_1192_ * (1013077751 * anInt9825) + i_1199_;
					for (int i_1202_ = i_1199_; i_1202_ < i_1200_; i_1202_++) {
						if (!bool || f < aFloatArray9807[i_1201_])
							anIntArray9804[i_1201_] = i_1188_;
						i_1201_++;
					}
					i_1192_++;
					i_1196_ -= i_1195_-- + i_1195_;
					i_1197_ -= i_1195_ + i_1195_;
				}
				i_1194_ = i_1187_;
				i_1195_ = i_1192_ - i_1186_;
				i_1197_ = i_1193_ + i_1195_ * i_1195_;
				i_1196_ = i_1197_ - i_1194_;
				i_1197_ -= i_1195_;
				while (i_1192_ < i_1191_) {
					for (/**/; i_1197_ > i_1193_ && i_1196_ > i_1193_; i_1196_ -= i_1194_ + i_1194_)
						i_1197_ -= i_1194_-- + i_1194_;
					int i_1203_ = i - i_1194_;
					if (i_1203_ < -1373518821 * anInt9815)
						i_1203_ = anInt9815 * -1373518821;
					int i_1204_ = i + i_1194_;
					if (i_1204_ > -272361347 * anInt9809 - 1)
						i_1204_ = -272361347 * anInt9809 - 1;
					int i_1205_ = i_1203_ + i_1192_ * (1013077751 * anInt9825);
					for (int i_1206_ = i_1203_; i_1206_ <= i_1204_; i_1206_++) {
						if (!bool || f < aFloatArray9807[i_1205_])
							anIntArray9804[i_1205_] = i_1188_;
						i_1205_++;
					}
					i_1192_++;
					i_1197_ += i_1195_ + i_1195_;
					i_1196_ += i_1195_++ + i_1195_;
				}
			} else if (i_1189_ == 1) {
				i_1188_ = (((i_1188_ & 0xff00ff) * i_1198_ >> 8 & 0xff00ff) + (i_1198_ * (i_1188_ & 0xff00) >> 8 & 0xff00) + (i_1198_ << 24));
				int i_1207_ = 256 - i_1198_;
				while (i_1192_ < i_1186_) {
					for (/**/; i_1197_ <= i_1193_ || i_1196_ <= i_1193_; i_1197_ += i_1194_++ + i_1194_)
						i_1196_ += i_1194_ + i_1194_;
					int i_1208_ = 1 + (i - i_1194_);
					if (i_1208_ < anInt9815 * -1373518821)
						i_1208_ = anInt9815 * -1373518821;
					int i_1209_ = i_1194_ + i;
					if (i_1209_ > -272361347 * anInt9809)
						i_1209_ = anInt9809 * -272361347;
					int i_1210_ = i_1208_ + anInt9825 * 1013077751 * i_1192_;
					for (int i_1211_ = i_1208_; i_1211_ < i_1209_; i_1211_++) {
						if (!bool || f < aFloatArray9807[i_1210_]) {
							int i_1212_ = anIntArray9804[i_1210_];
							i_1212_ = (((i_1212_ & 0xff00ff) * i_1207_ >> 8 & 0xff00ff) + (i_1207_ * (i_1212_ & 0xff00) >> 8 & 0xff00));
							anIntArray9804[i_1210_] = i_1212_ + i_1188_;
						}
						i_1210_++;
					}
					i_1192_++;
					i_1196_ -= i_1195_-- + i_1195_;
					i_1197_ -= i_1195_ + i_1195_;
				}
				i_1194_ = i_1187_;
				i_1195_ = -i_1195_;
				i_1197_ = i_1195_ * i_1195_ + i_1193_;
				i_1196_ = i_1197_ - i_1194_;
				i_1197_ -= i_1195_;
				while (i_1192_ < i_1191_) {
					for (/**/; i_1197_ > i_1193_ && i_1196_ > i_1193_; i_1196_ -= i_1194_ + i_1194_)
						i_1197_ -= i_1194_-- + i_1194_;
					int i_1213_ = i - i_1194_;
					if (i_1213_ < -1373518821 * anInt9815)
						i_1213_ = anInt9815 * -1373518821;
					int i_1214_ = i_1194_ + i;
					if (i_1214_ > -272361347 * anInt9809 - 1)
						i_1214_ = -272361347 * anInt9809 - 1;
					int i_1215_ = i_1192_ * (1013077751 * anInt9825) + i_1213_;
					for (int i_1216_ = i_1213_; i_1216_ <= i_1214_; i_1216_++) {
						if (!bool || f < aFloatArray9807[i_1215_]) {
							int i_1217_ = anIntArray9804[i_1215_];
							i_1217_ = ((i_1207_ * (i_1217_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1207_ * (i_1217_ & 0xff00) >> 8 & 0xff00));
							anIntArray9804[i_1215_] = i_1217_ + i_1188_;
						}
						i_1215_++;
					}
					i_1192_++;
					i_1197_ += i_1195_ + i_1195_;
					i_1196_ += i_1195_++ + i_1195_;
				}
			} else if (2 == i_1189_) {
				while (i_1192_ < i_1186_) {
					for (/**/; i_1197_ <= i_1193_ || i_1196_ <= i_1193_; i_1197_ += i_1194_++ + i_1194_)
						i_1196_ += i_1194_ + i_1194_;
					int i_1218_ = i - i_1194_ + 1;
					if (i_1218_ < anInt9815 * -1373518821)
						i_1218_ = -1373518821 * anInt9815;
					int i_1219_ = i + i_1194_;
					if (i_1219_ > anInt9809 * -272361347)
						i_1219_ = anInt9809 * -272361347;
					int i_1220_ = i_1218_ + anInt9825 * 1013077751 * i_1192_;
					for (int i_1221_ = i_1218_; i_1221_ < i_1219_; i_1221_++) {
						if (!bool || f < aFloatArray9807[i_1220_]) {
							int i_1222_ = anIntArray9804[i_1220_];
							int i_1223_ = i_1188_ + i_1222_;
							int i_1224_ = (i_1222_ & 0xff00ff) + (i_1188_ & 0xff00ff);
							i_1222_ = ((i_1223_ - i_1224_ & 0x10000) + (i_1224_ & 0x1000100));
							anIntArray9804[i_1220_] = i_1223_ - i_1222_ | i_1222_ - (i_1222_ >>> 8);
						}
						i_1220_++;
					}
					i_1192_++;
					i_1196_ -= i_1195_-- + i_1195_;
					i_1197_ -= i_1195_ + i_1195_;
				}
				i_1194_ = i_1187_;
				i_1195_ = -i_1195_;
				i_1197_ = i_1193_ + i_1195_ * i_1195_;
				i_1196_ = i_1197_ - i_1194_;
				i_1197_ -= i_1195_;
				while (i_1192_ < i_1191_) {
					for (/**/; i_1197_ > i_1193_ && i_1196_ > i_1193_; i_1196_ -= i_1194_ + i_1194_)
						i_1197_ -= i_1194_-- + i_1194_;
					int i_1225_ = i - i_1194_;
					if (i_1225_ < anInt9815 * -1373518821)
						i_1225_ = anInt9815 * -1373518821;
					int i_1226_ = i + i_1194_;
					if (i_1226_ > anInt9809 * -272361347 - 1)
						i_1226_ = anInt9809 * -272361347 - 1;
					int i_1227_ = i_1192_ * (1013077751 * anInt9825) + i_1225_;
					for (int i_1228_ = i_1225_; i_1228_ <= i_1226_; i_1228_++) {
						if (!bool || f < aFloatArray9807[i_1227_]) {
							int i_1229_ = anIntArray9804[i_1227_];
							int i_1230_ = i_1229_ + i_1188_;
							int i_1231_ = (i_1188_ & 0xff00ff) + (i_1229_ & 0xff00ff);
							i_1229_ = (i_1231_ & 0x1000100) + (i_1230_ - i_1231_ & 0x10000);
							anIntArray9804[i_1227_] = i_1230_ - i_1229_ | i_1229_ - (i_1229_ >>> 8);
						}
						i_1227_++;
					}
					i_1192_++;
					i_1197_ += i_1195_ + i_1195_;
					i_1196_ += i_1195_++ + i_1195_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	void method15467(int i) {
		anInt9819 = 81573437 * i;
		aClass99Array9836 = new Class99[1353126165 * anInt9819];
		for (int i_1232_ = 0; i_1232_ < 1353126165 * anInt9819; i_1232_++)
			aClass99Array9836[i_1232_] = new Class99(this);
	}

	public void method3203(int[] is) {
		is[0] = anInt9825 * 1013077751;
		is[1] = 719529481 * anInt9806;
	}

	public void method3200(int[] is) {
		is[0] = anInt9825 * 1013077751;
		is[1] = 719529481 * anInt9806;
	}

	Class99 method15468(Runnable runnable) {
		for (int i = 0; i < 1353126165 * anInt9819; i++) {
			if (aClass99Array9836[i].aRunnable1187 == runnable)
				return aClass99Array9836[i];
		}
		return null;
	}

	void method15469(boolean bool, boolean bool_1233_, boolean bool_1234_, Class171 class171) {
		Class99 class99 = method15475(Thread.currentThread());
		for (Class522_Sub2_Sub1 class522_sub2_sub1 = ((Class522_Sub2_Sub1) class171.aClass686_1836.method13878(2138772399)); null != class522_sub2_sub1; class522_sub2_sub1 = ((Class522_Sub2_Sub1) class171.aClass686_1836.method13879(1042960772))) {
			int i = class522_sub2_sub1.anInt11564 >> 12;
			int i_1235_ = class522_sub2_sub1.anInt11568 >> 12;
			int i_1236_ = class522_sub2_sub1.anInt11569 >> 12;
			float f = (aClass441_9821.aFloatArray4916[14] + ((float) i_1235_ * aClass441_9821.aFloatArray4916[6] + aClass441_9821.aFloatArray4916[2] * (float) i + (float) i_1236_ * aClass441_9821.aFloatArray4916[10]));
			float f_1237_ = (aClass441_9821.aFloatArray4916[15] + ((float) i_1236_ * aClass441_9821.aFloatArray4916[11] + (aClass441_9821.aFloatArray4916[7] * (float) i_1235_ + (float) i * aClass441_9821.aFloatArray4916[3])));
			if (!(f < -f_1237_)) {
				float f_1238_ = f * aFloat9833 / f_1237_ + aFloat9832;
				if (!(f > class99.aFloat1205)) {
					float f_1239_ = (aClass441_9821.aFloatArray4916[12] + (((float) i_1236_ * aClass441_9821.aFloatArray4916[8]) + ((aClass441_9821.aFloatArray4916[4] * (float) i_1235_) + (aClass441_9821.aFloatArray4916[0] * (float) i))));
					float f_1240_ = (aClass441_9821.aFloatArray4916[13] + (((float) i_1236_ * aClass441_9821.aFloatArray4916[9]) + ((aClass441_9821.aFloatArray4916[5] * (float) i_1235_) + ((float) i * aClass441_9821.aFloatArray4916[1]))));
					if (!(f_1239_ < -f_1237_) && !(f_1239_ > f_1237_) && !(f_1240_ < -f_1237_) && !(f_1240_ > f_1237_)) {
						float f_1241_ = (float) class522_sub2_sub1.anInt11567 / 4096.0F;
						float f_1242_ = (f_1239_ + f_1241_ * aClass441_9805.aFloatArray4916[0]);
						float f_1243_ = (f_1237_ + aClass441_9805.aFloatArray4916[3] * f_1241_);
						float f_1244_ = aFloat9828 + f_1239_ * aFloat9827 / f_1237_;
						float f_1245_ = aFloat9830 + f_1240_ * aFloat9829 / f_1237_;
						float f_1246_ = f_1242_ * aFloat9827 / f_1243_ + aFloat9828;
						method15464(bool, bool_1233_, bool_1234_, class522_sub2_sub1, (int) f_1244_, (int) f_1245_, f_1238_, (int) (f_1246_ < f_1244_ ? f_1244_ - f_1246_ : f_1246_ - f_1244_));
					}
				}
			}
		}
	}

	void method15470(boolean bool, boolean bool_1247_, boolean bool_1248_, Class171 class171) {
		Class99 class99 = method15475(Thread.currentThread());
		for (Class522_Sub2_Sub1 class522_sub2_sub1 = ((Class522_Sub2_Sub1) class171.aClass686_1836.method13878(2138772399)); null != class522_sub2_sub1; class522_sub2_sub1 = ((Class522_Sub2_Sub1) class171.aClass686_1836.method13879(-1015201640))) {
			int i = class522_sub2_sub1.anInt11564 >> 12;
			int i_1249_ = class522_sub2_sub1.anInt11568 >> 12;
			int i_1250_ = class522_sub2_sub1.anInt11569 >> 12;
			float f = (aClass441_9821.aFloatArray4916[14] + ((float) i_1249_ * aClass441_9821.aFloatArray4916[6] + aClass441_9821.aFloatArray4916[2] * (float) i + (float) i_1250_ * aClass441_9821.aFloatArray4916[10]));
			float f_1251_ = (aClass441_9821.aFloatArray4916[15] + ((float) i_1250_ * aClass441_9821.aFloatArray4916[11] + (aClass441_9821.aFloatArray4916[7] * (float) i_1249_ + (float) i * aClass441_9821.aFloatArray4916[3])));
			if (!(f < -f_1251_)) {
				float f_1252_ = f * aFloat9833 / f_1251_ + aFloat9832;
				if (!(f > class99.aFloat1205)) {
					float f_1253_ = (aClass441_9821.aFloatArray4916[12] + (((float) i_1250_ * aClass441_9821.aFloatArray4916[8]) + ((aClass441_9821.aFloatArray4916[4] * (float) i_1249_) + (aClass441_9821.aFloatArray4916[0] * (float) i))));
					float f_1254_ = (aClass441_9821.aFloatArray4916[13] + (((float) i_1250_ * aClass441_9821.aFloatArray4916[9]) + ((aClass441_9821.aFloatArray4916[5] * (float) i_1249_) + ((float) i * aClass441_9821.aFloatArray4916[1]))));
					if (!(f_1253_ < -f_1251_) && !(f_1253_ > f_1251_) && !(f_1254_ < -f_1251_) && !(f_1254_ > f_1251_)) {
						float f_1255_ = (float) class522_sub2_sub1.anInt11567 / 4096.0F;
						float f_1256_ = (f_1253_ + f_1255_ * aClass441_9805.aFloatArray4916[0]);
						float f_1257_ = (f_1251_ + aClass441_9805.aFloatArray4916[3] * f_1255_);
						float f_1258_ = aFloat9828 + f_1253_ * aFloat9827 / f_1251_;
						float f_1259_ = aFloat9830 + f_1254_ * aFloat9829 / f_1251_;
						float f_1260_ = f_1256_ * aFloat9827 / f_1257_ + aFloat9828;
						method15464(bool, bool_1247_, bool_1248_, class522_sub2_sub1, (int) f_1258_, (int) f_1259_, f_1252_, (int) (f_1260_ < f_1258_ ? f_1258_ - f_1260_ : f_1260_ - f_1258_));
					}
				}
			}
		}
	}

	public boolean method3345() {
		return false;
	}

	void method15471(boolean bool, boolean bool_1261_, boolean bool_1262_, int i, int i_1263_, float f, int i_1264_, int i_1265_, short i_1266_, int i_1267_, int i_1268_, int i_1269_) {
		if (0 != i_1264_ && i_1265_ != 0) {
			if (i_1266_ != -1) {
				Class177 class177 = aClass172_1916.method2895(i_1266_, -759815000);
				if (!class177.aBool1876) {
					if (anInt9838 * 782405937 != i_1266_) {
						Class148 class148 = ((Class148) aClass209_9835.method3767((long) i_1266_));
						if (null == class148) {
							int[] is = method15413(i_1266_);
							if (is == null)
								return;
							int i_1270_ = class177.anInt1913 * 1075916655;
							class148 = method3103(is, 0, i_1270_, i_1270_, i_1270_, -1657461531);
							aClass209_9835.method3770(class148, (long) i_1266_);
						}
						anInt9838 = i_1266_ * -646371375;
						aClass148_9837 = class148;
					}
					((Class148_Sub1) aClass148_9837).method14403(bool, bool_1261_, bool_1262_, i - i_1264_, i_1263_ - i_1265_, f, i_1264_ << 1, i_1265_ << 1, i_1268_, i_1267_, i_1269_, 1, class177.aClass593_1884 != Class593.aClass593_7811);
					return;
				}
			}
			method15466(bool_1261_, i, i_1263_, f, i_1264_, i_1267_, i_1269_);
		}
	}

	void method15472(boolean bool, boolean bool_1271_, boolean bool_1272_, int i, int i_1273_, float f, int i_1274_, int i_1275_, short i_1276_, int i_1277_, int i_1278_, int i_1279_) {
		if (0 != i_1274_ && i_1275_ != 0) {
			if (i_1276_ != -1) {
				Class177 class177 = aClass172_1916.method2895(i_1276_, -985333192);
				if (!class177.aBool1876) {
					if (anInt9838 * 782405937 != i_1276_) {
						Class148 class148 = ((Class148) aClass209_9835.method3767((long) i_1276_));
						if (null == class148) {
							int[] is = method15413(i_1276_);
							if (is == null)
								return;
							int i_1280_ = class177.anInt1913 * 1075916655;
							class148 = method3103(is, 0, i_1280_, i_1280_, i_1280_, -1890798230);
							aClass209_9835.method3770(class148, (long) i_1276_);
						}
						anInt9838 = i_1276_ * -646371375;
						aClass148_9837 = class148;
					}
					((Class148_Sub1) aClass148_9837).method14403(bool, bool_1271_, bool_1272_, i - i_1274_, i_1273_ - i_1275_, f, i_1274_ << 1, i_1275_ << 1, i_1278_, i_1277_, i_1279_, 1, class177.aClass593_1884 != Class593.aClass593_7811);
					return;
				}
			}
			method15466(bool_1271_, i, i_1273_, f, i_1274_, i_1277_, i_1279_);
		}
	}

	void method15473(boolean bool, int i, int i_1281_, float f, int i_1282_, int i_1283_, int i_1284_) {
		if (null != anIntArray9804) {
			if (i_1282_ < 0)
				i_1282_ = -i_1282_;
			int i_1285_ = i_1281_ - i_1282_;
			if (i_1285_ < anInt9810 * -695823527)
				i_1285_ = -695823527 * anInt9810;
			int i_1286_ = i_1282_ + i_1281_ + 1;
			if (i_1286_ > anInt9826 * 489020741)
				i_1286_ = 489020741 * anInt9826;
			int i_1287_ = i_1285_;
			int i_1288_ = i_1282_ * i_1282_;
			int i_1289_ = 0;
			int i_1290_ = i_1281_ - i_1287_;
			int i_1291_ = i_1290_ * i_1290_;
			int i_1292_ = i_1291_ - i_1290_;
			if (i_1281_ > i_1286_)
				i_1281_ = i_1286_;
			int i_1293_ = i_1283_ >>> 24;
			if (i_1284_ == 0 || i_1284_ == 1 && i_1293_ == 255) {
				while (i_1287_ < i_1281_) {
					for (/**/; i_1292_ <= i_1288_ || i_1291_ <= i_1288_; i_1292_ += i_1289_++ + i_1289_)
						i_1291_ += i_1289_ + i_1289_;
					int i_1294_ = i - i_1289_ + 1;
					if (i_1294_ < anInt9815 * -1373518821)
						i_1294_ = -1373518821 * anInt9815;
					int i_1295_ = i + i_1289_;
					if (i_1295_ > -272361347 * anInt9809)
						i_1295_ = -272361347 * anInt9809;
					int i_1296_ = i_1287_ * (1013077751 * anInt9825) + i_1294_;
					for (int i_1297_ = i_1294_; i_1297_ < i_1295_; i_1297_++) {
						if (!bool || f < aFloatArray9807[i_1296_])
							anIntArray9804[i_1296_] = i_1283_;
						i_1296_++;
					}
					i_1287_++;
					i_1291_ -= i_1290_-- + i_1290_;
					i_1292_ -= i_1290_ + i_1290_;
				}
				i_1289_ = i_1282_;
				i_1290_ = i_1287_ - i_1281_;
				i_1292_ = i_1288_ + i_1290_ * i_1290_;
				i_1291_ = i_1292_ - i_1289_;
				i_1292_ -= i_1290_;
				while (i_1287_ < i_1286_) {
					for (/**/; i_1292_ > i_1288_ && i_1291_ > i_1288_; i_1291_ -= i_1289_ + i_1289_)
						i_1292_ -= i_1289_-- + i_1289_;
					int i_1298_ = i - i_1289_;
					if (i_1298_ < -1373518821 * anInt9815)
						i_1298_ = anInt9815 * -1373518821;
					int i_1299_ = i + i_1289_;
					if (i_1299_ > -272361347 * anInt9809 - 1)
						i_1299_ = -272361347 * anInt9809 - 1;
					int i_1300_ = i_1298_ + i_1287_ * (1013077751 * anInt9825);
					for (int i_1301_ = i_1298_; i_1301_ <= i_1299_; i_1301_++) {
						if (!bool || f < aFloatArray9807[i_1300_])
							anIntArray9804[i_1300_] = i_1283_;
						i_1300_++;
					}
					i_1287_++;
					i_1292_ += i_1290_ + i_1290_;
					i_1291_ += i_1290_++ + i_1290_;
				}
			} else if (i_1284_ == 1) {
				i_1283_ = (((i_1283_ & 0xff00ff) * i_1293_ >> 8 & 0xff00ff) + (i_1293_ * (i_1283_ & 0xff00) >> 8 & 0xff00) + (i_1293_ << 24));
				int i_1302_ = 256 - i_1293_;
				while (i_1287_ < i_1281_) {
					for (/**/; i_1292_ <= i_1288_ || i_1291_ <= i_1288_; i_1292_ += i_1289_++ + i_1289_)
						i_1291_ += i_1289_ + i_1289_;
					int i_1303_ = 1 + (i - i_1289_);
					if (i_1303_ < anInt9815 * -1373518821)
						i_1303_ = anInt9815 * -1373518821;
					int i_1304_ = i_1289_ + i;
					if (i_1304_ > -272361347 * anInt9809)
						i_1304_ = anInt9809 * -272361347;
					int i_1305_ = i_1303_ + anInt9825 * 1013077751 * i_1287_;
					for (int i_1306_ = i_1303_; i_1306_ < i_1304_; i_1306_++) {
						if (!bool || f < aFloatArray9807[i_1305_]) {
							int i_1307_ = anIntArray9804[i_1305_];
							i_1307_ = (((i_1307_ & 0xff00ff) * i_1302_ >> 8 & 0xff00ff) + (i_1302_ * (i_1307_ & 0xff00) >> 8 & 0xff00));
							anIntArray9804[i_1305_] = i_1307_ + i_1283_;
						}
						i_1305_++;
					}
					i_1287_++;
					i_1291_ -= i_1290_-- + i_1290_;
					i_1292_ -= i_1290_ + i_1290_;
				}
				i_1289_ = i_1282_;
				i_1290_ = -i_1290_;
				i_1292_ = i_1290_ * i_1290_ + i_1288_;
				i_1291_ = i_1292_ - i_1289_;
				i_1292_ -= i_1290_;
				while (i_1287_ < i_1286_) {
					for (/**/; i_1292_ > i_1288_ && i_1291_ > i_1288_; i_1291_ -= i_1289_ + i_1289_)
						i_1292_ -= i_1289_-- + i_1289_;
					int i_1308_ = i - i_1289_;
					if (i_1308_ < -1373518821 * anInt9815)
						i_1308_ = anInt9815 * -1373518821;
					int i_1309_ = i_1289_ + i;
					if (i_1309_ > -272361347 * anInt9809 - 1)
						i_1309_ = -272361347 * anInt9809 - 1;
					int i_1310_ = i_1287_ * (1013077751 * anInt9825) + i_1308_;
					for (int i_1311_ = i_1308_; i_1311_ <= i_1309_; i_1311_++) {
						if (!bool || f < aFloatArray9807[i_1310_]) {
							int i_1312_ = anIntArray9804[i_1310_];
							i_1312_ = ((i_1302_ * (i_1312_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1302_ * (i_1312_ & 0xff00) >> 8 & 0xff00));
							anIntArray9804[i_1310_] = i_1312_ + i_1283_;
						}
						i_1310_++;
					}
					i_1287_++;
					i_1292_ += i_1290_ + i_1290_;
					i_1291_ += i_1290_++ + i_1290_;
				}
			} else if (2 == i_1284_) {
				while (i_1287_ < i_1281_) {
					for (/**/; i_1292_ <= i_1288_ || i_1291_ <= i_1288_; i_1292_ += i_1289_++ + i_1289_)
						i_1291_ += i_1289_ + i_1289_;
					int i_1313_ = i - i_1289_ + 1;
					if (i_1313_ < anInt9815 * -1373518821)
						i_1313_ = -1373518821 * anInt9815;
					int i_1314_ = i + i_1289_;
					if (i_1314_ > anInt9809 * -272361347)
						i_1314_ = anInt9809 * -272361347;
					int i_1315_ = i_1313_ + anInt9825 * 1013077751 * i_1287_;
					for (int i_1316_ = i_1313_; i_1316_ < i_1314_; i_1316_++) {
						if (!bool || f < aFloatArray9807[i_1315_]) {
							int i_1317_ = anIntArray9804[i_1315_];
							int i_1318_ = i_1283_ + i_1317_;
							int i_1319_ = (i_1317_ & 0xff00ff) + (i_1283_ & 0xff00ff);
							i_1317_ = ((i_1318_ - i_1319_ & 0x10000) + (i_1319_ & 0x1000100));
							anIntArray9804[i_1315_] = i_1318_ - i_1317_ | i_1317_ - (i_1317_ >>> 8);
						}
						i_1315_++;
					}
					i_1287_++;
					i_1291_ -= i_1290_-- + i_1290_;
					i_1292_ -= i_1290_ + i_1290_;
				}
				i_1289_ = i_1282_;
				i_1290_ = -i_1290_;
				i_1292_ = i_1288_ + i_1290_ * i_1290_;
				i_1291_ = i_1292_ - i_1289_;
				i_1292_ -= i_1290_;
				while (i_1287_ < i_1286_) {
					for (/**/; i_1292_ > i_1288_ && i_1291_ > i_1288_; i_1291_ -= i_1289_ + i_1289_)
						i_1292_ -= i_1289_-- + i_1289_;
					int i_1320_ = i - i_1289_;
					if (i_1320_ < anInt9815 * -1373518821)
						i_1320_ = anInt9815 * -1373518821;
					int i_1321_ = i + i_1289_;
					if (i_1321_ > anInt9809 * -272361347 - 1)
						i_1321_ = anInt9809 * -272361347 - 1;
					int i_1322_ = i_1287_ * (1013077751 * anInt9825) + i_1320_;
					for (int i_1323_ = i_1320_; i_1323_ <= i_1321_; i_1323_++) {
						if (!bool || f < aFloatArray9807[i_1322_]) {
							int i_1324_ = anIntArray9804[i_1322_];
							int i_1325_ = i_1324_ + i_1283_;
							int i_1326_ = (i_1283_ & 0xff00ff) + (i_1324_ & 0xff00ff);
							i_1324_ = (i_1326_ & 0x1000100) + (i_1325_ - i_1326_ & 0x10000);
							anIntArray9804[i_1322_] = i_1325_ - i_1324_ | i_1324_ - (i_1324_ >>> 8);
						}
						i_1322_++;
					}
					i_1287_++;
					i_1292_ += i_1290_ + i_1290_;
					i_1291_ += i_1290_++ + i_1290_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	void method15474(boolean bool, int i, int i_1327_, float f, int i_1328_, int i_1329_, int i_1330_) {
		if (null != anIntArray9804) {
			if (i_1328_ < 0)
				i_1328_ = -i_1328_;
			int i_1331_ = i_1327_ - i_1328_;
			if (i_1331_ < anInt9810 * -695823527)
				i_1331_ = -695823527 * anInt9810;
			int i_1332_ = i_1328_ + i_1327_ + 1;
			if (i_1332_ > anInt9826 * 489020741)
				i_1332_ = 489020741 * anInt9826;
			int i_1333_ = i_1331_;
			int i_1334_ = i_1328_ * i_1328_;
			int i_1335_ = 0;
			int i_1336_ = i_1327_ - i_1333_;
			int i_1337_ = i_1336_ * i_1336_;
			int i_1338_ = i_1337_ - i_1336_;
			if (i_1327_ > i_1332_)
				i_1327_ = i_1332_;
			int i_1339_ = i_1329_ >>> 24;
			if (i_1330_ == 0 || i_1330_ == 1 && i_1339_ == 255) {
				while (i_1333_ < i_1327_) {
					for (/**/; i_1338_ <= i_1334_ || i_1337_ <= i_1334_; i_1338_ += i_1335_++ + i_1335_)
						i_1337_ += i_1335_ + i_1335_;
					int i_1340_ = i - i_1335_ + 1;
					if (i_1340_ < anInt9815 * -1373518821)
						i_1340_ = -1373518821 * anInt9815;
					int i_1341_ = i + i_1335_;
					if (i_1341_ > -272361347 * anInt9809)
						i_1341_ = -272361347 * anInt9809;
					int i_1342_ = i_1333_ * (1013077751 * anInt9825) + i_1340_;
					for (int i_1343_ = i_1340_; i_1343_ < i_1341_; i_1343_++) {
						if (!bool || f < aFloatArray9807[i_1342_])
							anIntArray9804[i_1342_] = i_1329_;
						i_1342_++;
					}
					i_1333_++;
					i_1337_ -= i_1336_-- + i_1336_;
					i_1338_ -= i_1336_ + i_1336_;
				}
				i_1335_ = i_1328_;
				i_1336_ = i_1333_ - i_1327_;
				i_1338_ = i_1334_ + i_1336_ * i_1336_;
				i_1337_ = i_1338_ - i_1335_;
				i_1338_ -= i_1336_;
				while (i_1333_ < i_1332_) {
					for (/**/; i_1338_ > i_1334_ && i_1337_ > i_1334_; i_1337_ -= i_1335_ + i_1335_)
						i_1338_ -= i_1335_-- + i_1335_;
					int i_1344_ = i - i_1335_;
					if (i_1344_ < -1373518821 * anInt9815)
						i_1344_ = anInt9815 * -1373518821;
					int i_1345_ = i + i_1335_;
					if (i_1345_ > -272361347 * anInt9809 - 1)
						i_1345_ = -272361347 * anInt9809 - 1;
					int i_1346_ = i_1344_ + i_1333_ * (1013077751 * anInt9825);
					for (int i_1347_ = i_1344_; i_1347_ <= i_1345_; i_1347_++) {
						if (!bool || f < aFloatArray9807[i_1346_])
							anIntArray9804[i_1346_] = i_1329_;
						i_1346_++;
					}
					i_1333_++;
					i_1338_ += i_1336_ + i_1336_;
					i_1337_ += i_1336_++ + i_1336_;
				}
			} else if (i_1330_ == 1) {
				i_1329_ = (((i_1329_ & 0xff00ff) * i_1339_ >> 8 & 0xff00ff) + (i_1339_ * (i_1329_ & 0xff00) >> 8 & 0xff00) + (i_1339_ << 24));
				int i_1348_ = 256 - i_1339_;
				while (i_1333_ < i_1327_) {
					for (/**/; i_1338_ <= i_1334_ || i_1337_ <= i_1334_; i_1338_ += i_1335_++ + i_1335_)
						i_1337_ += i_1335_ + i_1335_;
					int i_1349_ = 1 + (i - i_1335_);
					if (i_1349_ < anInt9815 * -1373518821)
						i_1349_ = anInt9815 * -1373518821;
					int i_1350_ = i_1335_ + i;
					if (i_1350_ > -272361347 * anInt9809)
						i_1350_ = anInt9809 * -272361347;
					int i_1351_ = i_1349_ + anInt9825 * 1013077751 * i_1333_;
					for (int i_1352_ = i_1349_; i_1352_ < i_1350_; i_1352_++) {
						if (!bool || f < aFloatArray9807[i_1351_]) {
							int i_1353_ = anIntArray9804[i_1351_];
							i_1353_ = (((i_1353_ & 0xff00ff) * i_1348_ >> 8 & 0xff00ff) + (i_1348_ * (i_1353_ & 0xff00) >> 8 & 0xff00));
							anIntArray9804[i_1351_] = i_1353_ + i_1329_;
						}
						i_1351_++;
					}
					i_1333_++;
					i_1337_ -= i_1336_-- + i_1336_;
					i_1338_ -= i_1336_ + i_1336_;
				}
				i_1335_ = i_1328_;
				i_1336_ = -i_1336_;
				i_1338_ = i_1336_ * i_1336_ + i_1334_;
				i_1337_ = i_1338_ - i_1335_;
				i_1338_ -= i_1336_;
				while (i_1333_ < i_1332_) {
					for (/**/; i_1338_ > i_1334_ && i_1337_ > i_1334_; i_1337_ -= i_1335_ + i_1335_)
						i_1338_ -= i_1335_-- + i_1335_;
					int i_1354_ = i - i_1335_;
					if (i_1354_ < -1373518821 * anInt9815)
						i_1354_ = anInt9815 * -1373518821;
					int i_1355_ = i_1335_ + i;
					if (i_1355_ > -272361347 * anInt9809 - 1)
						i_1355_ = -272361347 * anInt9809 - 1;
					int i_1356_ = i_1333_ * (1013077751 * anInt9825) + i_1354_;
					for (int i_1357_ = i_1354_; i_1357_ <= i_1355_; i_1357_++) {
						if (!bool || f < aFloatArray9807[i_1356_]) {
							int i_1358_ = anIntArray9804[i_1356_];
							i_1358_ = ((i_1348_ * (i_1358_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1348_ * (i_1358_ & 0xff00) >> 8 & 0xff00));
							anIntArray9804[i_1356_] = i_1358_ + i_1329_;
						}
						i_1356_++;
					}
					i_1333_++;
					i_1338_ += i_1336_ + i_1336_;
					i_1337_ += i_1336_++ + i_1336_;
				}
			} else if (2 == i_1330_) {
				while (i_1333_ < i_1327_) {
					for (/**/; i_1338_ <= i_1334_ || i_1337_ <= i_1334_; i_1338_ += i_1335_++ + i_1335_)
						i_1337_ += i_1335_ + i_1335_;
					int i_1359_ = i - i_1335_ + 1;
					if (i_1359_ < anInt9815 * -1373518821)
						i_1359_ = -1373518821 * anInt9815;
					int i_1360_ = i + i_1335_;
					if (i_1360_ > anInt9809 * -272361347)
						i_1360_ = anInt9809 * -272361347;
					int i_1361_ = i_1359_ + anInt9825 * 1013077751 * i_1333_;
					for (int i_1362_ = i_1359_; i_1362_ < i_1360_; i_1362_++) {
						if (!bool || f < aFloatArray9807[i_1361_]) {
							int i_1363_ = anIntArray9804[i_1361_];
							int i_1364_ = i_1329_ + i_1363_;
							int i_1365_ = (i_1363_ & 0xff00ff) + (i_1329_ & 0xff00ff);
							i_1363_ = ((i_1364_ - i_1365_ & 0x10000) + (i_1365_ & 0x1000100));
							anIntArray9804[i_1361_] = i_1364_ - i_1363_ | i_1363_ - (i_1363_ >>> 8);
						}
						i_1361_++;
					}
					i_1333_++;
					i_1337_ -= i_1336_-- + i_1336_;
					i_1338_ -= i_1336_ + i_1336_;
				}
				i_1335_ = i_1328_;
				i_1336_ = -i_1336_;
				i_1338_ = i_1334_ + i_1336_ * i_1336_;
				i_1337_ = i_1338_ - i_1335_;
				i_1338_ -= i_1336_;
				while (i_1333_ < i_1332_) {
					for (/**/; i_1338_ > i_1334_ && i_1337_ > i_1334_; i_1337_ -= i_1335_ + i_1335_)
						i_1338_ -= i_1335_-- + i_1335_;
					int i_1366_ = i - i_1335_;
					if (i_1366_ < anInt9815 * -1373518821)
						i_1366_ = anInt9815 * -1373518821;
					int i_1367_ = i + i_1335_;
					if (i_1367_ > anInt9809 * -272361347 - 1)
						i_1367_ = anInt9809 * -272361347 - 1;
					int i_1368_ = i_1333_ * (1013077751 * anInt9825) + i_1366_;
					for (int i_1369_ = i_1366_; i_1369_ <= i_1367_; i_1369_++) {
						if (!bool || f < aFloatArray9807[i_1368_]) {
							int i_1370_ = anIntArray9804[i_1368_];
							int i_1371_ = i_1370_ + i_1329_;
							int i_1372_ = (i_1329_ & 0xff00ff) + (i_1370_ & 0xff00ff);
							i_1370_ = (i_1372_ & 0x1000100) + (i_1371_ - i_1372_ & 0x10000);
							anIntArray9804[i_1368_] = i_1371_ - i_1370_ | i_1370_ - (i_1370_ >>> 8);
						}
						i_1368_++;
					}
					i_1333_++;
					i_1338_ += i_1336_ + i_1336_;
					i_1337_ += i_1336_++ + i_1336_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public Class523_Sub8 method3259(int i) {
		return null;
	}

	boolean method3419(int i, int i_1373_, int i_1374_, int i_1375_, Class435 class435, Class430 class430) {
		Class441 class441 = method3112();
		class441.method7090(class435);
		class441.method7089(aClass441_9821);
		return class430.method6786(i, i_1373_, i_1374_, i_1375_, class441, aFloat9828, aFloat9830, aFloat9827, aFloat9829);
	}

	public void method3358(Class435 class435) {
		aClass435_9818 = class435;
		method15429();
	}

	public Class435 method3064() {
		return new Class435(aClass435_9818);
	}

	public void method3089(int i, int i_1376_, int i_1377_, int i_1378_, int i_1379_, int i_1380_) {
		if (null != anIntArray9804) {
			i_1377_ -= i;
			i_1378_ -= i_1376_;
			if (i_1378_ == 0) {
				if (i_1377_ >= 0)
					method3087(i, i_1376_, i_1377_ + 1, i_1379_, i_1380_);
				else
					method3087(i + i_1377_, i_1376_, 1 + -i_1377_, i_1379_, i_1380_);
			} else if (0 == i_1377_) {
				if (i_1378_ >= 0)
					method3119(i, i_1376_, 1 + i_1378_, i_1379_, i_1380_);
				else
					method3119(i, i_1378_ + i_1376_, -i_1378_ + 1, i_1379_, i_1380_);
			} else {
				if (i_1378_ + i_1377_ < 0) {
					i += i_1377_;
					i_1377_ = -i_1377_;
					i_1376_ += i_1378_;
					i_1378_ = -i_1378_;
				}
				if (i_1377_ > i_1378_) {
					i_1376_ <<= 16;
					i_1376_ += 32768;
					i_1378_ <<= 16;
					int i_1381_ = (int) Math.floor(0.5 + ((double) i_1378_ / (double) i_1377_));
					i_1377_ += i;
					if (i < anInt9815 * -1373518821) {
						i_1376_ += (anInt9815 * -1373518821 - i) * i_1381_;
						i = anInt9815 * -1373518821;
					}
					if (i_1377_ >= anInt9809 * -272361347)
						i_1377_ = -272361347 * anInt9809 - 1;
					int i_1382_ = i_1379_ >>> 24;
					if (0 == i_1380_ || i_1380_ == 1 && i_1382_ == 255) {
						for (/**/; i <= i_1377_; i++) {
							int i_1383_ = i_1376_ >> 16;
							if (i_1383_ >= -695823527 * anInt9810 && i_1383_ < anInt9826 * 489020741)
								anIntArray9804[i + (1013077751 * anInt9825 * i_1383_)] = i_1379_;
							i_1376_ += i_1381_;
						}
					} else if (i_1380_ == 1) {
						i_1379_ = ((i_1382_ * (i_1379_ & 0xff00) >> 8 & 0xff00) + ((i_1379_ & 0xff00ff) * i_1382_ >> 8 & 0xff00ff) + (i_1382_ << 24));
						int i_1384_ = 256 - i_1382_;
						for (/**/; i <= i_1377_; i++) {
							int i_1385_ = i_1376_ >> 16;
							if (i_1385_ >= -695823527 * anInt9810 && i_1385_ < 489020741 * anInt9826) {
								int i_1386_ = i_1385_ * (anInt9825 * 1013077751) + i;
								int i_1387_ = anIntArray9804[i_1386_];
								i_1387_ = (((i_1387_ & 0xff00ff) * i_1384_ >> 8 & 0xff00ff) + ((i_1387_ & 0xff00) * i_1384_ >> 8 & 0xff00));
								anIntArray9804[i_1386_] = i_1387_ + i_1379_;
							}
							i_1376_ += i_1381_;
						}
					} else if (i_1380_ == 2) {
						for (/**/; i <= i_1377_; i++) {
							int i_1388_ = i_1376_ >> 16;
							if (i_1388_ >= anInt9810 * -695823527 && i_1388_ < 489020741 * anInt9826) {
								int i_1389_ = i + i_1388_ * (1013077751 * anInt9825);
								int i_1390_ = anIntArray9804[i_1389_];
								int i_1391_ = i_1379_ + i_1390_;
								int i_1392_ = ((i_1379_ & 0xff00ff) + (i_1390_ & 0xff00ff));
								i_1390_ = ((i_1392_ & 0x1000100) + (i_1391_ - i_1392_ & 0x10000));
								anIntArray9804[i_1389_] = i_1391_ - i_1390_ | i_1390_ - (i_1390_ >>> 8);
							}
							i_1376_ += i_1381_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_1377_ <<= 16;
					int i_1393_ = (int) Math.floor((double) i_1377_ / (double) i_1378_ + 0.5);
					i_1378_ += i_1376_;
					if (i_1376_ < anInt9810 * -695823527) {
						i += (-695823527 * anInt9810 - i_1376_) * i_1393_;
						i_1376_ = anInt9810 * -695823527;
					}
					if (i_1378_ >= 489020741 * anInt9826)
						i_1378_ = anInt9826 * 489020741 - 1;
					int i_1394_ = i_1379_ >>> 24;
					if (i_1380_ == 0 || i_1380_ == 1 && 255 == i_1394_) {
						for (/**/; i_1376_ <= i_1378_; i_1376_++) {
							int i_1395_ = i >> 16;
							if (i_1395_ >= anInt9815 * -1373518821 && i_1395_ < -272361347 * anInt9809)
								anIntArray9804[(i_1376_ * (anInt9825 * 1013077751) + i_1395_)] = i_1379_;
							i += i_1393_;
						}
					} else if (i_1380_ == 1) {
						i_1379_ = ((i_1394_ * (i_1379_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_1379_ & 0xff00) * i_1394_ >> 8 & 0xff00) + (i_1394_ << 24));
						int i_1396_ = 256 - i_1394_;
						for (/**/; i_1376_ <= i_1378_; i_1376_++) {
							int i_1397_ = i >> 16;
							if (i_1397_ >= -1373518821 * anInt9815 && i_1397_ < anInt9809 * -272361347) {
								int i_1398_ = (anInt9825 * 1013077751 * i_1376_ + i_1397_);
								int i_1399_ = anIntArray9804[i_1398_];
								i_1399_ = ((i_1396_ * (i_1399_ & 0xff00) >> 8 & 0xff00) + (i_1396_ * (i_1399_ & 0xff00ff) >> 8 & 0xff00ff));
								anIntArray9804[(i_1397_ + i_1376_ * (anInt9825 * 1013077751))] = i_1399_ + i_1379_;
							}
							i += i_1393_;
						}
					} else if (i_1380_ == 2) {
						for (/**/; i_1376_ <= i_1378_; i_1376_++) {
							int i_1400_ = i >> 16;
							if (i_1400_ >= -1373518821 * anInt9815 && i_1400_ < -272361347 * anInt9809) {
								int i_1401_ = (i_1376_ * (1013077751 * anInt9825) + i_1400_);
								int i_1402_ = anIntArray9804[i_1401_];
								int i_1403_ = i_1379_ + i_1402_;
								int i_1404_ = ((i_1402_ & 0xff00ff) + (i_1379_ & 0xff00ff));
								i_1402_ = ((i_1403_ - i_1404_ & 0x10000) + (i_1404_ & 0x1000100));
								anIntArray9804[i_1401_] = i_1403_ - i_1402_ | i_1402_ - (i_1402_ >>> 8);
							}
							i += i_1393_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public Class435 method3302() {
		return new Class435(aClass435_9818);
	}

	public void method3297(Class435 class435) {
		aClass435_9818 = class435;
		method15429();
	}

	public Class441 method3125() {
		return new Class441(aClass441_9805);
	}

	public int method3281(int i, int i_1405_) {
		i |= 0x20800;
		return i & i_1405_ ^ i_1405_;
	}

	public Class441 method3072() {
		return new Class441(aClass441_9805);
	}

	public Class441 method3307() {
		return new Class441(aClass441_9805);
	}

	public Class441 method3308() {
		return new Class441(aClass441_9805);
	}

	public Class435 method3113() {
		Class99 class99 = method15475(Thread.currentThread());
		return class99.aClass435_1199;
	}

	public void method3195() {
		/* empty */
	}

	public Interface23 method3366(int i, int i_1406_, int i_1407_) {
		return new Class140(i, i_1406_);
	}

	public void method3132(int i, Class523_Sub20[] class523_sub20s) {
		/* empty */
	}

	Class99 method15475(Runnable runnable) {
		for (int i = 0; i < 1353126165 * anInt9819; i++) {
			if (aClass99Array9836[i].aRunnable1187 == runnable)
				return aClass99Array9836[i];
		}
		return null;
	}

	public boolean method3179() {
		return false;
	}

	public void method3315(int i, float f, float f_1408_, float f_1409_, float f_1410_, float f_1411_) {
		anInt9831 = 1873346827 * (int) (65535.0F * f);
		anInt9816 = (int) (f_1408_ * 65535.0F) * 854537707;
		float f_1412_ = (float) Math.sqrt((double) (f_1411_ * f_1411_ + (f_1410_ * f_1410_ + f_1409_ * f_1409_)));
		anInt9839 = 1932822005 * (int) (f_1409_ * 65535.0F / f_1412_);
		anInt9813 = -1909988257 * (int) (f_1410_ * 65535.0F / f_1412_);
		anInt9834 = (int) (f_1411_ * 65535.0F / f_1412_) * -280820989;
	}

	public void method3316(int i, int i_1413_, int i_1414_) {
		for (int i_1415_ = 0; i_1415_ < aClass99Array9836.length; i_1415_++) {
			Class99 class99 = aClass99Array9836[i_1415_];
			class99.anInt1192 = (i & 0xffffff) * 1830757045;
			int i_1416_ = class99.anInt1192 * 340278173 >>> 16 & 0xff;
			if (i_1416_ < 2)
				i_1416_ = 2;
			int i_1417_ = 340278173 * class99.anInt1192 >> 8 & 0xff;
			if (i_1417_ < 2)
				i_1417_ = 2;
			int i_1418_ = class99.anInt1192 * 340278173 & 0xff;
			if (i_1418_ < 2)
				i_1418_ = 2;
			class99.anInt1192 = 1830757045 * (i_1416_ << 16 | i_1417_ << 8 | i_1418_);
			if (i_1413_ < 0)
				class99.aBool1189 = false;
			else
				class99.aBool1189 = true;
		}
	}

	public void method3232(int i, int i_1419_, int i_1420_) {
		for (int i_1421_ = 0; i_1421_ < aClass99Array9836.length; i_1421_++) {
			Class99 class99 = aClass99Array9836[i_1421_];
			class99.anInt1192 = (i & 0xffffff) * 1830757045;
			int i_1422_ = class99.anInt1192 * 340278173 >>> 16 & 0xff;
			if (i_1422_ < 2)
				i_1422_ = 2;
			int i_1423_ = 340278173 * class99.anInt1192 >> 8 & 0xff;
			if (i_1423_ < 2)
				i_1423_ = 2;
			int i_1424_ = class99.anInt1192 * 340278173 & 0xff;
			if (i_1424_ < 2)
				i_1424_ = 2;
			class99.anInt1192 = 1830757045 * (i_1422_ << 16 | i_1423_ << 8 | i_1424_);
			if (i_1419_ < 0)
				class99.aBool1189 = false;
			else
				class99.aBool1189 = true;
		}
	}

	public void method3038(int[] is) {
		is[0] = anInt9825 * 1013077751;
		is[1] = 719529481 * anInt9806;
	}

	void method15476() {
		aClass441_9811.method7090(aClass435_9818);
		aClass441_9821.method7086(aClass441_9811);
		aClass441_9821.method7089(aClass441_9805);
		aClass441_9821.method7114(aFloatArrayArray9822[0]);
		aClass441_9821.method7111(aFloatArrayArray9822[1]);
		aClass441_9821.method7106(aFloatArrayArray9822[2]);
		aClass441_9821.method7107(aFloatArrayArray9822[3]);
		aClass441_9821.method7123(aFloatArrayArray9822[4]);
		aClass441_9821.method7184(aFloatArrayArray9822[5]);
		float f = aClass441_9805.method7105();
		float f_1425_ = (aClass441_9805.aFloatArray4916[14] + aClass441_9805.aFloatArray4916[10] * (f - 255.0F));
		float f_1426_ = (aClass441_9805.aFloatArray4916[14] + f * aClass441_9805.aFloatArray4916[10]);
		float f_1427_ = f_1426_ - f_1425_;
		for (int i = 0; i < 1353126165 * anInt9819; i++) {
			Class99 class99 = aClass99Array9836[i];
			class99.aFloat1205 = f_1425_;
			class99.aFloat1191 = f_1427_;
		}
	}

	public Class185 method3319(Class185 class185, Class185 class185_1428_, float f, Class185 class185_1429_) {
		return null;
	}

	public Class185 method3305(Class185 class185, Class185 class185_1430_, float f, Class185 class185_1431_) {
		return null;
	}

	public void method3460(int i, float f, float f_1432_, float f_1433_, float f_1434_, float f_1435_) {
		anInt9831 = 1873346827 * (int) (65535.0F * f);
		anInt9816 = (int) (f_1432_ * 65535.0F) * 854537707;
		float f_1436_ = (float) Math.sqrt((double) (f_1435_ * f_1435_ + (f_1434_ * f_1434_ + f_1433_ * f_1433_)));
		anInt9839 = 1932822005 * (int) (f_1433_ * 65535.0F / f_1436_);
		anInt9813 = -1909988257 * (int) (f_1434_ * 65535.0F / f_1436_);
		anInt9834 = (int) (f_1435_ * 65535.0F / f_1436_) * -280820989;
	}

	public void method3363(Class185 class185) {
		/* empty */
	}

	public void method3383(Class185 class185) {
		/* empty */
	}

	public Class142 method3081(int i, int i_1437_, int[][] is, int[][] is_1438_, int i_1439_, int i_1440_, int i_1441_) {
		return new Class142_Sub3(this, i_1440_, i_1441_, i, i_1437_, is, is_1438_, i_1439_);
	}

	public void method3325(int i, int i_1442_, int i_1443_, int i_1444_) {
		/* empty */
	}

	public void method3326(int i, int i_1445_) {
		/* empty */
	}

	public void method3327(int i, int i_1446_) {
		/* empty */
	}

	public String method3234() {
		return "";
	}

	public boolean method3329() {
		return false;
	}

	void method3241(int i, int i_1447_, int i_1448_, int i_1449_, int i_1450_) {
		if (null != anIntArray9804 && (i_1447_ >= anInt9810 * -695823527 && i_1447_ < 489020741 * anInt9826)) {
			if (i < anInt9815 * -1373518821) {
				i_1448_ -= -1373518821 * anInt9815 - i;
				i = -1373518821 * anInt9815;
			}
			if (i_1448_ + i > -272361347 * anInt9809)
				i_1448_ = -272361347 * anInt9809 - i;
			int i_1451_ = i + anInt9825 * 1013077751 * i_1447_;
			int i_1452_ = i_1449_ >>> 24;
			if (0 == i_1450_ || 1 == i_1450_ && 255 == i_1452_) {
				for (int i_1453_ = 0; i_1453_ < i_1448_; i_1453_++)
					anIntArray9804[i_1453_ + i_1451_] = i_1449_;
			} else if (i_1450_ == 1) {
				i_1449_ = ((i_1452_ * (i_1449_ & 0xff00) >> 8 & 0xff00) + (i_1452_ * (i_1449_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1452_ << 24));
				int i_1454_ = 256 - i_1452_;
				for (int i_1455_ = 0; i_1455_ < i_1448_; i_1455_++) {
					int i_1456_ = anIntArray9804[i_1455_ + i_1451_];
					i_1456_ = (((i_1456_ & 0xff00ff) * i_1454_ >> 8 & 0xff00ff) + (i_1454_ * (i_1456_ & 0xff00) >> 8 & 0xff00));
					anIntArray9804[i_1455_ + i_1451_] = i_1449_ + i_1456_;
				}
			} else if (i_1450_ == 2) {
				for (int i_1457_ = 0; i_1457_ < i_1448_; i_1457_++) {
					int i_1458_ = anIntArray9804[i_1451_ + i_1457_];
					int i_1459_ = i_1449_ + i_1458_;
					int i_1460_ = (i_1458_ & 0xff00ff) + (i_1449_ & 0xff00ff);
					i_1458_ = (i_1459_ - i_1460_ & 0x10000) + (i_1460_ & 0x1000100);
					anIntArray9804[i_1451_ + i_1457_] = i_1459_ - i_1458_ | i_1458_ - (i_1458_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public boolean method3331() {
		return false;
	}

	public boolean method3332() {
		return false;
	}

	public boolean method3333() {
		return false;
	}

	public boolean method3262() {
		return false;
	}

	public boolean method3127() {
		return false;
	}

	public int method3462(int i, int i_1461_) {
		i |= 0x20800;
		return i & i_1461_ ^ i_1461_;
	}

	public Class150 method3369() {
		return new Class150(0, "Pure Java", 1, "CPU", 0L, false);
	}

	public void method3310(float f) {
		anInt9817 = 2063625163 * (int) (f * 65535.0F);
	}

	public Class165 method3339(int[] is) {
		return null;
	}

	public Class165 method3340(int[] is) {
		return null;
	}

	public boolean method3253() {
		return false;
	}

	public boolean method3317() {
		return false;
	}

	public Class142 method3082(int i, int i_1462_, int[][] is, int[][] is_1463_, int i_1464_, int i_1465_, int i_1466_) {
		return new Class142_Sub3(this, i_1465_, i_1466_, i, i_1462_, is, is_1463_, i_1464_);
	}

	public boolean method3213() {
		return false;
	}

	public Class168_Sub1 method3022() {
		return new Class168_Sub1_Sub2(this);
	}

	public void method3346() {
		/* empty */
	}

	public void method3347() {
		/* empty */
	}

	public boolean method3348() {
		return false;
	}

	public boolean method3214() {
		return false;
	}

	public boolean method3106() {
		return false;
	}

	public void method3148(Class165 class165, float f, Class165 class165_1467_, float f_1468_, Class165 class165_1469_, float f_1470_) {
		/* empty */
	}

	public void method3352(int i, Class163 class163) {
		for (int i_1471_ = 0; i_1471_ < aClass99Array9836.length; i_1471_++) {
			aClass99Array9836[i_1471_].anInt1210 = aClass99Array9836[i_1471_].anInt1192 * -1038647055;
			aClass99Array9836[i_1471_].anInt1195 = i * -1423986471;
			aClass99Array9836[i_1471_].anInt1192 = class163.anInt1776 * -759703469;
			aClass99Array9836[i_1471_].anInt1196 = class163.anInt1775 * -212138725;
			aClass99Array9836[i_1471_].aBool1204 = true;
		}
	}

	public void method3250(int i, Class163 class163) {
		Class99 class99 = method15475(Thread.currentThread());
		class99.anInt1195 = i * -1423986471;
		class99.anInt1192 = class163.anInt1776 * -759703469;
		class99.anInt1196 = class163.anInt1775 * -212138725;
	}

	public void method3175() {
		for (int i = 0; i < aClass99Array9836.length; i++) {
			aClass99Array9836[i].anInt1192 = aClass99Array9836[i].anInt1210 * 611807249;
			aClass99Array9836[i].aBool1204 = false;
		}
	}

	public void method3355() {
		for (int i = 0; i < aClass99Array9836.length; i++) {
			aClass99Array9836[i].anInt1192 = aClass99Array9836[i].anInt1210 * 611807249;
			aClass99Array9836[i].aBool1204 = false;
		}
	}

	public void method3356(int i, int i_1472_, float f, int i_1473_, int i_1474_, float f_1475_, int i_1476_, int i_1477_, float f_1478_, int i_1479_, int i_1480_, int i_1481_, int i_1482_) {
		boolean bool = null != anIntArray9804;
		boolean bool_1483_ = null != aFloatArray9807;
		if (bool || bool_1483_) {
			Class99 class99 = method15475(Thread.currentThread());
			Class118 class118 = class99.aClass118_1200;
			class118.aBool1465 = false;
			i -= -1373518821 * anInt9815;
			i_1473_ -= anInt9815 * -1373518821;
			i_1476_ -= anInt9815 * -1373518821;
			i_1472_ -= -695823527 * anInt9810;
			i_1474_ -= anInt9810 * -695823527;
			i_1477_ -= -695823527 * anInt9810;
			class118.aBool1455 = (i < 0 || i > class118.anInt1448 || i_1473_ < 0 || i_1473_ > class118.anInt1448 || i_1476_ < 0 || i_1476_ > class118.anInt1448);
			int i_1484_ = i_1479_ >>> 24;
			if (0 == i_1482_ || 1 == i_1482_ && i_1484_ == 255) {
				class118.anInt1438 = 0;
				class118.aBool1437 = false;
				class118.method2031(bool, bool_1483_, false, (float) i_1472_, (float) i_1474_, (float) i_1477_, (float) i, (float) i_1473_, (float) i_1476_, f, f_1475_, f_1478_, i_1479_, i_1480_, i_1481_);
			} else if (1 == i_1482_) {
				class118.anInt1438 = 255 - i_1484_;
				class118.aBool1437 = false;
				class118.method2031(bool, bool_1483_, false, (float) i_1472_, (float) i_1474_, (float) i_1477_, (float) i, (float) i_1473_, (float) i_1476_, f, f_1475_, f_1478_, i_1479_, i_1480_, i_1481_);
			} else if (i_1482_ == 2) {
				class118.anInt1438 = 128;
				class118.aBool1437 = true;
				class118.method2031(bool, bool_1483_, false, (float) i_1472_, (float) i_1474_, (float) i_1477_, (float) i, (float) i_1473_, (float) i_1476_, f, f_1475_, f_1478_, i_1479_, i_1480_, i_1481_);
			} else
				throw new IllegalArgumentException();
			class118.aBool1465 = true;
		}
	}

	public void method3357(int i, int i_1485_, float f, int i_1486_, int i_1487_, float f_1488_, int i_1489_, int i_1490_, float f_1491_, int i_1492_, int i_1493_, int i_1494_, int i_1495_) {
		boolean bool = null != anIntArray9804;
		boolean bool_1496_ = null != aFloatArray9807;
		if (bool || bool_1496_) {
			Class99 class99 = method15475(Thread.currentThread());
			Class118 class118 = class99.aClass118_1200;
			class118.aBool1465 = false;
			i -= -1373518821 * anInt9815;
			i_1486_ -= anInt9815 * -1373518821;
			i_1489_ -= anInt9815 * -1373518821;
			i_1485_ -= -695823527 * anInt9810;
			i_1487_ -= anInt9810 * -695823527;
			i_1490_ -= -695823527 * anInt9810;
			class118.aBool1455 = (i < 0 || i > class118.anInt1448 || i_1486_ < 0 || i_1486_ > class118.anInt1448 || i_1489_ < 0 || i_1489_ > class118.anInt1448);
			int i_1497_ = i_1492_ >>> 24;
			if (0 == i_1495_ || 1 == i_1495_ && i_1497_ == 255) {
				class118.anInt1438 = 0;
				class118.aBool1437 = false;
				class118.method2031(bool, bool_1496_, false, (float) i_1485_, (float) i_1487_, (float) i_1490_, (float) i, (float) i_1486_, (float) i_1489_, f, f_1488_, f_1491_, i_1492_, i_1493_, i_1494_);
			} else if (1 == i_1495_) {
				class118.anInt1438 = 255 - i_1497_;
				class118.aBool1437 = false;
				class118.method2031(bool, bool_1496_, false, (float) i_1485_, (float) i_1487_, (float) i_1490_, (float) i, (float) i_1486_, (float) i_1489_, f, f_1488_, f_1491_, i_1492_, i_1493_, i_1494_);
			} else if (i_1495_ == 2) {
				class118.anInt1438 = 128;
				class118.aBool1437 = true;
				class118.method2031(bool, bool_1496_, false, (float) i_1485_, (float) i_1487_, (float) i_1490_, (float) i, (float) i_1486_, (float) i_1489_, f, f_1488_, f_1491_, i_1492_, i_1493_, i_1494_);
			} else
				throw new IllegalArgumentException();
			class118.aBool1465 = true;
		}
	}

	public void method3360(int i, int i_1498_, float f, int i_1499_, int i_1500_, float f_1501_, int i_1502_, int i_1503_, float f_1504_, int i_1505_, int i_1506_, int i_1507_, int i_1508_) {
		boolean bool = null != anIntArray9804;
		boolean bool_1509_ = null != aFloatArray9807;
		if (bool || bool_1509_) {
			Class99 class99 = method15475(Thread.currentThread());
			Class118 class118 = class99.aClass118_1200;
			class118.aBool1465 = false;
			i -= -1373518821 * anInt9815;
			i_1499_ -= anInt9815 * -1373518821;
			i_1502_ -= anInt9815 * -1373518821;
			i_1498_ -= -695823527 * anInt9810;
			i_1500_ -= anInt9810 * -695823527;
			i_1503_ -= -695823527 * anInt9810;
			class118.aBool1455 = (i < 0 || i > class118.anInt1448 || i_1499_ < 0 || i_1499_ > class118.anInt1448 || i_1502_ < 0 || i_1502_ > class118.anInt1448);
			int i_1510_ = i_1505_ >>> 24;
			if (0 == i_1508_ || 1 == i_1508_ && i_1510_ == 255) {
				class118.anInt1438 = 0;
				class118.aBool1437 = false;
				class118.method2031(bool, bool_1509_, false, (float) i_1498_, (float) i_1500_, (float) i_1503_, (float) i, (float) i_1499_, (float) i_1502_, f, f_1501_, f_1504_, i_1505_, i_1506_, i_1507_);
			} else if (1 == i_1508_) {
				class118.anInt1438 = 255 - i_1510_;
				class118.aBool1437 = false;
				class118.method2031(bool, bool_1509_, false, (float) i_1498_, (float) i_1500_, (float) i_1503_, (float) i, (float) i_1499_, (float) i_1502_, f, f_1501_, f_1504_, i_1505_, i_1506_, i_1507_);
			} else if (i_1508_ == 2) {
				class118.anInt1438 = 128;
				class118.aBool1437 = true;
				class118.method2031(bool, bool_1509_, false, (float) i_1498_, (float) i_1500_, (float) i_1503_, (float) i, (float) i_1499_, (float) i_1502_, f, f_1501_, f_1504_, i_1505_, i_1506_, i_1507_);
			} else
				throw new IllegalArgumentException();
			class118.aBool1465 = true;
		}
	}

	public void method3088(int i, int i_1511_, int i_1512_) {
		/* empty */
	}

	public void method3040(float f, float f_1513_, float f_1514_, float[] fs) {
		float f_1515_ = (aClass441_9821.aFloatArray4916[15] + f * aClass441_9821.aFloatArray4916[3] + f_1513_ * aClass441_9821.aFloatArray4916[7] + aClass441_9821.aFloatArray4916[11] * f_1514_);
		float f_1516_ = (f_1514_ * aClass441_9821.aFloatArray4916[8] + (f_1513_ * aClass441_9821.aFloatArray4916[4] + (aClass441_9821.aFloatArray4916[12] + f * aClass441_9821.aFloatArray4916[0])));
		float f_1517_ = (f_1514_ * aClass441_9821.aFloatArray4916[9] + (f_1513_ * aClass441_9821.aFloatArray4916[5] + (aClass441_9821.aFloatArray4916[13] + aClass441_9821.aFloatArray4916[1] * f)));
		float f_1518_ = (aClass441_9811.aFloatArray4916[10] * f_1514_ + (aClass441_9811.aFloatArray4916[6] * f_1513_ + (aClass441_9811.aFloatArray4916[14] + f * aClass441_9811.aFloatArray4916[2])));
		fs[0] = aFloat9827 * f_1516_ / f_1515_ + aFloat9828;
		fs[1] = aFloat9830 + aFloat9829 * f_1517_ / f_1515_;
		fs[2] = f_1518_;
	}

	public void method3212(float f, float f_1519_, float f_1520_, float[] fs) {
		float f_1521_ = (f_1520_ * aClass441_9821.aFloatArray4916[10] + (aClass441_9821.aFloatArray4916[14] + aClass441_9821.aFloatArray4916[2] * f + aClass441_9821.aFloatArray4916[6] * f_1519_));
		float f_1522_ = (f * aClass441_9821.aFloatArray4916[3] + aClass441_9821.aFloatArray4916[15] + f_1519_ * aClass441_9821.aFloatArray4916[7] + aClass441_9821.aFloatArray4916[11] * f_1520_);
		if (f_1521_ < -f_1522_ || f_1521_ > f_1522_) {
			float[] fs_1523_ = fs;
			float[] fs_1524_ = fs;
			fs[2] = Float.NaN;
			fs_1524_[1] = Float.NaN;
			fs_1523_[0] = Float.NaN;
		} else {
			float f_1525_ = (aClass441_9821.aFloatArray4916[4] * f_1519_ + (aClass441_9821.aFloatArray4916[0] * f + aClass441_9821.aFloatArray4916[12]) + f_1520_ * aClass441_9821.aFloatArray4916[8]);
			if (f_1525_ < -f_1522_ || f_1525_ > f_1522_) {
				float[] fs_1526_ = fs;
				float[] fs_1527_ = fs;
				fs[2] = Float.NaN;
				fs_1527_[1] = Float.NaN;
				fs_1526_[0] = Float.NaN;
			} else {
				float f_1528_ = (f_1520_ * aClass441_9821.aFloatArray4916[9] + (aClass441_9821.aFloatArray4916[13] + aClass441_9821.aFloatArray4916[1] * f + f_1519_ * aClass441_9821.aFloatArray4916[5]));
				if (f_1528_ < -f_1522_ || f_1528_ > f_1522_) {
					float[] fs_1529_ = fs;
					float[] fs_1530_ = fs;
					fs[2] = Float.NaN;
					fs_1530_[1] = Float.NaN;
					fs_1529_[0] = Float.NaN;
				} else {
					float f_1531_ = (aClass441_9811.aFloatArray4916[14] + aClass441_9811.aFloatArray4916[2] * f + f_1519_ * aClass441_9811.aFloatArray4916[6] + f_1520_ * aClass441_9811.aFloatArray4916[10]);
					fs[0] = aFloat9828 + f_1525_ * aFloat9827 / f_1522_;
					fs[1] = aFloat9830 + f_1528_ * aFloat9829 / f_1522_;
					fs[2] = f_1531_;
				}
			}
		}
	}

	public boolean method3026() {
		return false;
	}

	public void method3110(int i, Class145 class145, int i_1532_, int i_1533_) {
		if (null != anIntArray9804) {
			Class145_Sub1 class145_sub1 = (Class145_Sub1) class145;
			int[] is = class145_sub1.anIntArray9521;
			int[] is_1534_ = class145_sub1.anIntArray9520;
			int i_1535_;
			if (anInt9826 * 489020741 < i_1533_ + is.length)
				i_1535_ = 489020741 * anInt9826 - i_1533_;
			else
				i_1535_ = is.length;
			int i_1536_;
			if (anInt9810 * -695823527 > i_1533_) {
				i_1536_ = anInt9810 * -695823527 - i_1533_;
				i_1533_ = anInt9810 * -695823527;
			} else
				i_1536_ = 0;
			if (i_1535_ - i_1536_ > 0) {
				int i_1537_ = anInt9825 * 1013077751 * i_1533_;
				for (int i_1538_ = i_1536_; i_1538_ < i_1535_; i_1538_++) {
					int i_1539_ = i_1532_ + is[i_1538_];
					int i_1540_ = is_1534_[i_1538_];
					if (-1373518821 * anInt9815 > i_1539_) {
						i_1540_ -= anInt9815 * -1373518821 - i_1539_;
						i_1539_ = -1373518821 * anInt9815;
					}
					if (anInt9809 * -272361347 < i_1539_ + i_1540_)
						i_1540_ = anInt9809 * -272361347 - i_1539_;
					i_1539_ += i_1537_;
					for (int i_1541_ = -i_1540_; i_1541_ < 0; i_1541_++)
						anIntArray9804[i_1539_++] = i;
					i_1537_ += anInt9825 * 1013077751;
				}
			}
		}
	}

	public void method3364(float f, float f_1542_, float f_1543_, float[] fs) {
		float f_1544_ = (f_1543_ * aClass441_9821.aFloatArray4916[10] + (aClass441_9821.aFloatArray4916[14] + aClass441_9821.aFloatArray4916[2] * f + aClass441_9821.aFloatArray4916[6] * f_1542_));
		float f_1545_ = (f * aClass441_9821.aFloatArray4916[3] + aClass441_9821.aFloatArray4916[15] + f_1542_ * aClass441_9821.aFloatArray4916[7] + aClass441_9821.aFloatArray4916[11] * f_1543_);
		if (f_1544_ < -f_1545_ || f_1544_ > f_1545_) {
			float[] fs_1546_ = fs;
			float[] fs_1547_ = fs;
			fs[2] = Float.NaN;
			fs_1547_[1] = Float.NaN;
			fs_1546_[0] = Float.NaN;
		} else {
			float f_1548_ = (aClass441_9821.aFloatArray4916[4] * f_1542_ + (aClass441_9821.aFloatArray4916[0] * f + aClass441_9821.aFloatArray4916[12]) + f_1543_ * aClass441_9821.aFloatArray4916[8]);
			if (f_1548_ < -f_1545_ || f_1548_ > f_1545_) {
				float[] fs_1549_ = fs;
				float[] fs_1550_ = fs;
				fs[2] = Float.NaN;
				fs_1550_[1] = Float.NaN;
				fs_1549_[0] = Float.NaN;
			} else {
				float f_1551_ = (f_1543_ * aClass441_9821.aFloatArray4916[9] + (aClass441_9821.aFloatArray4916[13] + aClass441_9821.aFloatArray4916[1] * f + f_1542_ * aClass441_9821.aFloatArray4916[5]));
				if (f_1551_ < -f_1545_ || f_1551_ > f_1545_) {
					float[] fs_1552_ = fs;
					float[] fs_1553_ = fs;
					fs[2] = Float.NaN;
					fs_1553_[1] = Float.NaN;
					fs_1552_[0] = Float.NaN;
				} else {
					float f_1554_ = (aClass441_9811.aFloatArray4916[14] + aClass441_9811.aFloatArray4916[2] * f + f_1542_ * aClass441_9811.aFloatArray4916[6] + f_1543_ * aClass441_9811.aFloatArray4916[10]);
					fs[0] = aFloat9828 + f_1548_ * aFloat9827 / f_1545_;
					fs[1] = aFloat9830 + f_1551_ * aFloat9829 / f_1545_;
					fs[2] = f_1554_;
				}
			}
		}
	}

	Interface22 method15477(int i, int i_1555_) {
		return new Class102(i, i_1555_);
	}

	public boolean method3178() {
		return false;
	}

	public Interface23 method3365(int i, int i_1556_, int i_1557_) {
		return new Class140(i, i_1556_);
	}

	public void method3275(int i) {
		Class167_Sub1.anInt9071 = Class167_Sub1.anInt9050 = i;
		if (anInt9819 * 1353126165 > 1)
			throw new IllegalStateException();
		method15426(anInt9819 * 1353126165);
		method15425(0);
	}

	public Class150 method3368() {
		return new Class150(0, "Pure Java", 1, "CPU", 0L, false);
	}

	public Class150 method3401() {
		return new Class150(0, "Pure Java", 1, "CPU", 0L, false);
	}

	public Class150 method3370() {
		return new Class150(0, "Pure Java", 1, "CPU", 0L, false);
	}

	public Class150 method3443() {
		return new Class150(0, "Pure Java", 1, "CPU", 0L, false);
	}

	public Class150 method3372() {
		return new Class150(0, "Pure Java", 1, "CPU", 0L, false);
	}

	public int method3388(int i, int i_1558_, int i_1559_, int i_1560_, int i_1561_, int i_1562_) {
		int i_1563_ = 0;
		float f = ((float) i_1559_ * aClass441_9821.aFloatArray4916[10] + ((float) i * aClass441_9821.aFloatArray4916[2] + aClass441_9821.aFloatArray4916[14] + (float) i_1558_ * aClass441_9821.aFloatArray4916[6]));
		float f_1564_ = ((float) i_1562_ * aClass441_9821.aFloatArray4916[10] + ((float) i_1560_ * aClass441_9821.aFloatArray4916[2] + aClass441_9821.aFloatArray4916[14] + aClass441_9821.aFloatArray4916[6] * (float) i_1561_));
		float f_1565_ = (aClass441_9821.aFloatArray4916[7] * (float) i_1558_ + ((float) i * aClass441_9821.aFloatArray4916[3] + aClass441_9821.aFloatArray4916[15]) + (float) i_1559_ * aClass441_9821.aFloatArray4916[11]);
		float f_1566_ = (aClass441_9821.aFloatArray4916[15] + (float) i_1560_ * aClass441_9821.aFloatArray4916[3] + aClass441_9821.aFloatArray4916[7] * (float) i_1561_ + (float) i_1562_ * aClass441_9821.aFloatArray4916[11]);
		if (f < -f_1565_ && f_1564_ < -f_1566_)
			i_1563_ |= 0x10;
		else if (f > f_1565_ && f_1564_ > f_1566_)
			i_1563_ |= 0x20;
		float f_1567_ = (aClass441_9821.aFloatArray4916[8] * (float) i_1559_ + (aClass441_9821.aFloatArray4916[4] * (float) i_1558_ + (aClass441_9821.aFloatArray4916[12] + aClass441_9821.aFloatArray4916[0] * (float) i)));
		float f_1568_ = ((float) i_1561_ * aClass441_9821.aFloatArray4916[4] + (aClass441_9821.aFloatArray4916[12] + (float) i_1560_ * aClass441_9821.aFloatArray4916[0]) + aClass441_9821.aFloatArray4916[8] * (float) i_1562_);
		if (f_1567_ < -f_1565_ && f_1568_ < -f_1566_)
			i_1563_ |= 0x1;
		if (f_1567_ > f_1565_ && f_1568_ > f_1566_)
			i_1563_ |= 0x2;
		float f_1569_ = (aClass441_9821.aFloatArray4916[1] * (float) i + aClass441_9821.aFloatArray4916[13] + aClass441_9821.aFloatArray4916[5] * (float) i_1558_ + aClass441_9821.aFloatArray4916[9] * (float) i_1559_);
		float f_1570_ = (aClass441_9821.aFloatArray4916[13] + (float) i_1560_ * aClass441_9821.aFloatArray4916[1] + aClass441_9821.aFloatArray4916[5] * (float) i_1561_ + (float) i_1562_ * aClass441_9821.aFloatArray4916[9]);
		if (f_1569_ < -f_1565_ && f_1570_ < -f_1566_)
			i_1563_ |= 0x4;
		if (f_1569_ > f_1565_ && f_1570_ > f_1566_)
			i_1563_ |= 0x8;
		return i_1563_;
	}

	public void method3313(int i, float f, float f_1571_, float f_1572_, float f_1573_, float f_1574_) {
		anInt9831 = 1873346827 * (int) (65535.0F * f);
		anInt9816 = (int) (f_1571_ * 65535.0F) * 854537707;
		float f_1575_ = (float) Math.sqrt((double) (f_1574_ * f_1574_ + (f_1573_ * f_1573_ + f_1572_ * f_1572_)));
		anInt9839 = 1932822005 * (int) (f_1572_ * 65535.0F / f_1575_);
		anInt9813 = -1909988257 * (int) (f_1573_ * 65535.0F / f_1575_);
		anInt9834 = (int) (f_1574_ * 65535.0F / f_1575_) * -280820989;
	}

	public boolean method3375() {
		return false;
	}

	void method15478(boolean bool, boolean bool_1576_, boolean bool_1577_, Class522_Sub2_Sub1 class522_sub2_sub1, int i, int i_1578_, float f, int i_1579_) {
		int i_1580_ = class522_sub2_sub1.anInt11571;
		int i_1581_ = i_1579_;
		i_1579_ <<= 1;
		if (i_1580_ == -1)
			method15466(bool_1576_, i, i_1578_, f, i_1581_, class522_sub2_sub1.anInt11570, 1);
		else {
			if (i_1580_ != 782405937 * anInt9838) {
				Class148 class148 = (Class148) aClass209_9835.method3767((long) i_1580_);
				if (null == class148) {
					Class177 class177 = aClass172_1916.method2895(i_1580_, -699550898);
					int[] is = method15413(i_1580_);
					if (is != null) {
						int i_1582_ = 1075916655 * class177.anInt1913;
						class148 = method3103(is, 0, i_1582_, i_1582_, i_1582_, -2000441604);
						aClass209_9835.method3770(class148, (long) i_1580_);
					} else
						return;
				}
				anInt9838 = i_1580_ * -646371375;
				aClass148_9837 = class148;
			}
			i_1579_++;
			((Class148_Sub1) aClass148_9837).method14403(bool, bool_1576_, bool_1577_, i - i_1581_, i_1578_ - i_1581_, f, i_1579_, i_1579_, 0, class522_sub2_sub1.anInt11570, 1, 1, false);
		}
	}

	public boolean method3377() {
		return false;
	}

	public void method3121(int i, float f, float f_1583_, float f_1584_, float f_1585_, float f_1586_) {
		anInt9831 = 1873346827 * (int) (65535.0F * f);
		anInt9816 = (int) (f_1583_ * 65535.0F) * 854537707;
		float f_1587_ = (float) Math.sqrt((double) (f_1586_ * f_1586_ + (f_1585_ * f_1585_ + f_1584_ * f_1584_)));
		anInt9839 = 1932822005 * (int) (f_1584_ * 65535.0F / f_1587_);
		anInt9813 = -1909988257 * (int) (f_1585_ * 65535.0F / f_1587_);
		anInt9834 = (int) (f_1586_ * 65535.0F / f_1587_) * -280820989;
	}

	public void method3379(int i, int i_1588_) {
		if ((i & 0x1) != 0)
			method3193(0, 0, anInt9825 * 1013077751, anInt9806 * 719529481, i_1588_, 0);
		if (0 != (i & 0x2))
			method15420();
	}

	public void method3334(int i, int i_1589_) {
		if ((i & 0x1) != 0)
			method3193(0, 0, anInt9825 * 1013077751, anInt9806 * 719529481, i_1589_, 0);
		if (0 != (i & 0x2))
			method15420();
	}

	public void method3274(int i) {
		Class167_Sub1.anInt9071 = Class167_Sub1.anInt9050 = i;
		if (anInt9819 * 1353126165 > 1)
			throw new IllegalStateException();
		method15426(anInt9819 * 1353126165);
		method15425(0);
	}

	public boolean method3031() {
		return false;
	}

	void method3140(int i, int i_1590_, int i_1591_, int i_1592_, int i_1593_) {
		if (anIntArray9804 != null) {
			if (i_1591_ < 0)
				i_1591_ = -i_1591_;
			int i_1594_ = i_1590_ - i_1591_;
			if (i_1594_ < anInt9810 * -695823527)
				i_1594_ = -695823527 * anInt9810;
			int i_1595_ = i_1590_ + i_1591_ + 1;
			if (i_1595_ > 489020741 * anInt9826)
				i_1595_ = anInt9826 * 489020741;
			int i_1596_ = i_1594_;
			int i_1597_ = i_1591_ * i_1591_;
			int i_1598_ = 0;
			int i_1599_ = i_1590_ - i_1596_;
			int i_1600_ = i_1599_ * i_1599_;
			int i_1601_ = i_1600_ - i_1599_;
			if (i_1590_ > i_1595_)
				i_1590_ = i_1595_;
			int i_1602_ = i_1592_ >>> 24;
			if (i_1593_ == 0 || 1 == i_1593_ && i_1602_ == 255) {
				while (i_1596_ < i_1590_) {
					for (/**/; i_1601_ <= i_1597_ || i_1600_ <= i_1597_; i_1601_ += i_1598_++ + i_1598_)
						i_1600_ += i_1598_ + i_1598_;
					int i_1603_ = i - i_1598_ + 1;
					if (i_1603_ < anInt9815 * -1373518821)
						i_1603_ = anInt9815 * -1373518821;
					int i_1604_ = i + i_1598_;
					if (i_1604_ > anInt9809 * -272361347)
						i_1604_ = anInt9809 * -272361347;
					int i_1605_ = i_1603_ + i_1596_ * (anInt9825 * 1013077751);
					for (int i_1606_ = i_1603_; i_1606_ < i_1604_; i_1606_++)
						anIntArray9804[i_1605_++] = i_1592_;
					i_1596_++;
					i_1600_ -= i_1599_-- + i_1599_;
					i_1601_ -= i_1599_ + i_1599_;
				}
				i_1598_ = i_1591_;
				i_1599_ = i_1596_ - i_1590_;
				i_1601_ = i_1599_ * i_1599_ + i_1597_;
				i_1600_ = i_1601_ - i_1598_;
				i_1601_ -= i_1599_;
				while (i_1596_ < i_1595_) {
					for (/**/; i_1601_ > i_1597_ && i_1600_ > i_1597_; i_1600_ -= i_1598_ + i_1598_)
						i_1601_ -= i_1598_-- + i_1598_;
					int i_1607_ = i - i_1598_;
					if (i_1607_ < -1373518821 * anInt9815)
						i_1607_ = anInt9815 * -1373518821;
					int i_1608_ = i_1598_ + i;
					if (i_1608_ > -272361347 * anInt9809 - 1)
						i_1608_ = anInt9809 * -272361347 - 1;
					int i_1609_ = 1013077751 * anInt9825 * i_1596_ + i_1607_;
					for (int i_1610_ = i_1607_; i_1610_ <= i_1608_; i_1610_++)
						anIntArray9804[i_1609_++] = i_1592_;
					i_1596_++;
					i_1601_ += i_1599_ + i_1599_;
					i_1600_ += i_1599_++ + i_1599_;
				}
			} else if (i_1593_ == 1) {
				i_1592_ = ((i_1602_ << 24) + ((i_1602_ * (i_1592_ & 0xff00) >> 8 & 0xff00) + ((i_1592_ & 0xff00ff) * i_1602_ >> 8 & 0xff00ff)));
				int i_1611_ = 256 - i_1602_;
				while (i_1596_ < i_1590_) {
					for (/**/; i_1601_ <= i_1597_ || i_1600_ <= i_1597_; i_1601_ += i_1598_++ + i_1598_)
						i_1600_ += i_1598_ + i_1598_;
					int i_1612_ = i - i_1598_ + 1;
					if (i_1612_ < -1373518821 * anInt9815)
						i_1612_ = -1373518821 * anInt9815;
					int i_1613_ = i + i_1598_;
					if (i_1613_ > -272361347 * anInt9809)
						i_1613_ = -272361347 * anInt9809;
					int i_1614_ = i_1596_ * (anInt9825 * 1013077751) + i_1612_;
					for (int i_1615_ = i_1612_; i_1615_ < i_1613_; i_1615_++) {
						int i_1616_ = anIntArray9804[i_1614_];
						i_1616_ = ((i_1611_ * (i_1616_ & 0xff00) >> 8 & 0xff00) + (i_1611_ * (i_1616_ & 0xff00ff) >> 8 & 0xff00ff));
						anIntArray9804[i_1614_++] = i_1592_ + i_1616_;
					}
					i_1596_++;
					i_1600_ -= i_1599_-- + i_1599_;
					i_1601_ -= i_1599_ + i_1599_;
				}
				i_1598_ = i_1591_;
				i_1599_ = -i_1599_;
				i_1601_ = i_1597_ + i_1599_ * i_1599_;
				i_1600_ = i_1601_ - i_1598_;
				i_1601_ -= i_1599_;
				while (i_1596_ < i_1595_) {
					for (/**/; i_1601_ > i_1597_ && i_1600_ > i_1597_; i_1600_ -= i_1598_ + i_1598_)
						i_1601_ -= i_1598_-- + i_1598_;
					int i_1617_ = i - i_1598_;
					if (i_1617_ < anInt9815 * -1373518821)
						i_1617_ = -1373518821 * anInt9815;
					int i_1618_ = i + i_1598_;
					if (i_1618_ > -272361347 * anInt9809 - 1)
						i_1618_ = anInt9809 * -272361347 - 1;
					int i_1619_ = anInt9825 * 1013077751 * i_1596_ + i_1617_;
					for (int i_1620_ = i_1617_; i_1620_ <= i_1618_; i_1620_++) {
						int i_1621_ = anIntArray9804[i_1619_];
						i_1621_ = (((i_1621_ & 0xff00ff) * i_1611_ >> 8 & 0xff00ff) + ((i_1621_ & 0xff00) * i_1611_ >> 8 & 0xff00));
						anIntArray9804[i_1619_++] = i_1592_ + i_1621_;
					}
					i_1596_++;
					i_1601_ += i_1599_ + i_1599_;
					i_1600_ += i_1599_++ + i_1599_;
				}
			} else if (2 == i_1593_) {
				while (i_1596_ < i_1590_) {
					for (/**/; i_1601_ <= i_1597_ || i_1600_ <= i_1597_; i_1601_ += i_1598_++ + i_1598_)
						i_1600_ += i_1598_ + i_1598_;
					int i_1622_ = 1 + (i - i_1598_);
					if (i_1622_ < -1373518821 * anInt9815)
						i_1622_ = anInt9815 * -1373518821;
					int i_1623_ = i_1598_ + i;
					if (i_1623_ > -272361347 * anInt9809)
						i_1623_ = -272361347 * anInt9809;
					int i_1624_ = i_1622_ + i_1596_ * (anInt9825 * 1013077751);
					for (int i_1625_ = i_1622_; i_1625_ < i_1623_; i_1625_++) {
						int i_1626_ = anIntArray9804[i_1624_];
						int i_1627_ = i_1592_ + i_1626_;
						int i_1628_ = (i_1592_ & 0xff00ff) + (i_1626_ & 0xff00ff);
						i_1626_ = (i_1628_ & 0x1000100) + (i_1627_ - i_1628_ & 0x10000);
						anIntArray9804[i_1624_++] = i_1627_ - i_1626_ | i_1626_ - (i_1626_ >>> 8);
					}
					i_1596_++;
					i_1600_ -= i_1599_-- + i_1599_;
					i_1601_ -= i_1599_ + i_1599_;
				}
				i_1598_ = i_1591_;
				i_1599_ = -i_1599_;
				i_1601_ = i_1597_ + i_1599_ * i_1599_;
				i_1600_ = i_1601_ - i_1598_;
				i_1601_ -= i_1599_;
				while (i_1596_ < i_1595_) {
					for (/**/; i_1601_ > i_1597_ && i_1600_ > i_1597_; i_1600_ -= i_1598_ + i_1598_)
						i_1601_ -= i_1598_-- + i_1598_;
					int i_1629_ = i - i_1598_;
					if (i_1629_ < -1373518821 * anInt9815)
						i_1629_ = anInt9815 * -1373518821;
					int i_1630_ = i + i_1598_;
					if (i_1630_ > anInt9809 * -272361347 - 1)
						i_1630_ = anInt9809 * -272361347 - 1;
					int i_1631_ = i_1596_ * (1013077751 * anInt9825) + i_1629_;
					for (int i_1632_ = i_1629_; i_1632_ <= i_1630_; i_1632_++) {
						int i_1633_ = anIntArray9804[i_1631_];
						int i_1634_ = i_1592_ + i_1633_;
						int i_1635_ = (i_1633_ & 0xff00ff) + (i_1592_ & 0xff00ff);
						i_1633_ = (i_1634_ - i_1635_ & 0x10000) + (i_1635_ & 0x1000100);
						anIntArray9804[i_1631_++] = i_1634_ - i_1633_ | i_1633_ - (i_1633_ >>> 8);
					}
					i_1596_++;
					i_1601_ += i_1599_ + i_1599_;
					i_1600_ += i_1599_++ + i_1599_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method3384(int i, int i_1636_, int i_1637_, int i_1638_, int i_1639_, int i_1640_) {
		if (null != anIntArray9804) {
			i_1637_ -= i;
			i_1638_ -= i_1636_;
			if (i_1638_ == 0) {
				if (i_1637_ >= 0)
					method3087(i, i_1636_, i_1637_ + 1, i_1639_, i_1640_);
				else
					method3087(i + i_1637_, i_1636_, 1 + -i_1637_, i_1639_, i_1640_);
			} else if (0 == i_1637_) {
				if (i_1638_ >= 0)
					method3119(i, i_1636_, 1 + i_1638_, i_1639_, i_1640_);
				else
					method3119(i, i_1638_ + i_1636_, -i_1638_ + 1, i_1639_, i_1640_);
			} else {
				if (i_1638_ + i_1637_ < 0) {
					i += i_1637_;
					i_1637_ = -i_1637_;
					i_1636_ += i_1638_;
					i_1638_ = -i_1638_;
				}
				if (i_1637_ > i_1638_) {
					i_1636_ <<= 16;
					i_1636_ += 32768;
					i_1638_ <<= 16;
					int i_1641_ = (int) Math.floor(0.5 + ((double) i_1638_ / (double) i_1637_));
					i_1637_ += i;
					if (i < anInt9815 * -1373518821) {
						i_1636_ += (anInt9815 * -1373518821 - i) * i_1641_;
						i = anInt9815 * -1373518821;
					}
					if (i_1637_ >= anInt9809 * -272361347)
						i_1637_ = -272361347 * anInt9809 - 1;
					int i_1642_ = i_1639_ >>> 24;
					if (0 == i_1640_ || i_1640_ == 1 && i_1642_ == 255) {
						for (/**/; i <= i_1637_; i++) {
							int i_1643_ = i_1636_ >> 16;
							if (i_1643_ >= -695823527 * anInt9810 && i_1643_ < anInt9826 * 489020741)
								anIntArray9804[i + (1013077751 * anInt9825 * i_1643_)] = i_1639_;
							i_1636_ += i_1641_;
						}
					} else if (i_1640_ == 1) {
						i_1639_ = ((i_1642_ * (i_1639_ & 0xff00) >> 8 & 0xff00) + ((i_1639_ & 0xff00ff) * i_1642_ >> 8 & 0xff00ff) + (i_1642_ << 24));
						int i_1644_ = 256 - i_1642_;
						for (/**/; i <= i_1637_; i++) {
							int i_1645_ = i_1636_ >> 16;
							if (i_1645_ >= -695823527 * anInt9810 && i_1645_ < 489020741 * anInt9826) {
								int i_1646_ = i_1645_ * (anInt9825 * 1013077751) + i;
								int i_1647_ = anIntArray9804[i_1646_];
								i_1647_ = (((i_1647_ & 0xff00ff) * i_1644_ >> 8 & 0xff00ff) + ((i_1647_ & 0xff00) * i_1644_ >> 8 & 0xff00));
								anIntArray9804[i_1646_] = i_1647_ + i_1639_;
							}
							i_1636_ += i_1641_;
						}
					} else if (i_1640_ == 2) {
						for (/**/; i <= i_1637_; i++) {
							int i_1648_ = i_1636_ >> 16;
							if (i_1648_ >= anInt9810 * -695823527 && i_1648_ < 489020741 * anInt9826) {
								int i_1649_ = i + i_1648_ * (1013077751 * anInt9825);
								int i_1650_ = anIntArray9804[i_1649_];
								int i_1651_ = i_1639_ + i_1650_;
								int i_1652_ = ((i_1639_ & 0xff00ff) + (i_1650_ & 0xff00ff));
								i_1650_ = ((i_1652_ & 0x1000100) + (i_1651_ - i_1652_ & 0x10000));
								anIntArray9804[i_1649_] = i_1651_ - i_1650_ | i_1650_ - (i_1650_ >>> 8);
							}
							i_1636_ += i_1641_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_1637_ <<= 16;
					int i_1653_ = (int) Math.floor((double) i_1637_ / (double) i_1638_ + 0.5);
					i_1638_ += i_1636_;
					if (i_1636_ < anInt9810 * -695823527) {
						i += (-695823527 * anInt9810 - i_1636_) * i_1653_;
						i_1636_ = anInt9810 * -695823527;
					}
					if (i_1638_ >= 489020741 * anInt9826)
						i_1638_ = anInt9826 * 489020741 - 1;
					int i_1654_ = i_1639_ >>> 24;
					if (i_1640_ == 0 || i_1640_ == 1 && 255 == i_1654_) {
						for (/**/; i_1636_ <= i_1638_; i_1636_++) {
							int i_1655_ = i >> 16;
							if (i_1655_ >= anInt9815 * -1373518821 && i_1655_ < -272361347 * anInt9809)
								anIntArray9804[(i_1636_ * (anInt9825 * 1013077751) + i_1655_)] = i_1639_;
							i += i_1653_;
						}
					} else if (i_1640_ == 1) {
						i_1639_ = ((i_1654_ * (i_1639_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_1639_ & 0xff00) * i_1654_ >> 8 & 0xff00) + (i_1654_ << 24));
						int i_1656_ = 256 - i_1654_;
						for (/**/; i_1636_ <= i_1638_; i_1636_++) {
							int i_1657_ = i >> 16;
							if (i_1657_ >= -1373518821 * anInt9815 && i_1657_ < anInt9809 * -272361347) {
								int i_1658_ = (anInt9825 * 1013077751 * i_1636_ + i_1657_);
								int i_1659_ = anIntArray9804[i_1658_];
								i_1659_ = ((i_1656_ * (i_1659_ & 0xff00) >> 8 & 0xff00) + (i_1656_ * (i_1659_ & 0xff00ff) >> 8 & 0xff00ff));
								anIntArray9804[(i_1657_ + i_1636_ * (anInt9825 * 1013077751))] = i_1659_ + i_1639_;
							}
							i += i_1653_;
						}
					} else if (i_1640_ == 2) {
						for (/**/; i_1636_ <= i_1638_; i_1636_++) {
							int i_1660_ = i >> 16;
							if (i_1660_ >= -1373518821 * anInt9815 && i_1660_ < -272361347 * anInt9809) {
								int i_1661_ = (i_1636_ * (1013077751 * anInt9825) + i_1660_);
								int i_1662_ = anIntArray9804[i_1661_];
								int i_1663_ = i_1639_ + i_1662_;
								int i_1664_ = ((i_1662_ & 0xff00ff) + (i_1639_ & 0xff00ff));
								i_1662_ = ((i_1663_ - i_1664_ & 0x10000) + (i_1664_ & 0x1000100));
								anIntArray9804[i_1661_] = i_1663_ - i_1662_ | i_1662_ - (i_1662_ >>> 8);
							}
							i += i_1653_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public void method3452(int i, int i_1665_, int i_1666_, int i_1667_, int i_1668_, int i_1669_) {
		if (null != anIntArray9804) {
			i_1666_ -= i;
			i_1667_ -= i_1665_;
			if (i_1667_ == 0) {
				if (i_1666_ >= 0)
					method3087(i, i_1665_, i_1666_ + 1, i_1668_, i_1669_);
				else
					method3087(i + i_1666_, i_1665_, 1 + -i_1666_, i_1668_, i_1669_);
			} else if (0 == i_1666_) {
				if (i_1667_ >= 0)
					method3119(i, i_1665_, 1 + i_1667_, i_1668_, i_1669_);
				else
					method3119(i, i_1667_ + i_1665_, -i_1667_ + 1, i_1668_, i_1669_);
			} else {
				if (i_1667_ + i_1666_ < 0) {
					i += i_1666_;
					i_1666_ = -i_1666_;
					i_1665_ += i_1667_;
					i_1667_ = -i_1667_;
				}
				if (i_1666_ > i_1667_) {
					i_1665_ <<= 16;
					i_1665_ += 32768;
					i_1667_ <<= 16;
					int i_1670_ = (int) Math.floor(0.5 + ((double) i_1667_ / (double) i_1666_));
					i_1666_ += i;
					if (i < anInt9815 * -1373518821) {
						i_1665_ += (anInt9815 * -1373518821 - i) * i_1670_;
						i = anInt9815 * -1373518821;
					}
					if (i_1666_ >= anInt9809 * -272361347)
						i_1666_ = -272361347 * anInt9809 - 1;
					int i_1671_ = i_1668_ >>> 24;
					if (0 == i_1669_ || i_1669_ == 1 && i_1671_ == 255) {
						for (/**/; i <= i_1666_; i++) {
							int i_1672_ = i_1665_ >> 16;
							if (i_1672_ >= -695823527 * anInt9810 && i_1672_ < anInt9826 * 489020741)
								anIntArray9804[i + (1013077751 * anInt9825 * i_1672_)] = i_1668_;
							i_1665_ += i_1670_;
						}
					} else if (i_1669_ == 1) {
						i_1668_ = ((i_1671_ * (i_1668_ & 0xff00) >> 8 & 0xff00) + ((i_1668_ & 0xff00ff) * i_1671_ >> 8 & 0xff00ff) + (i_1671_ << 24));
						int i_1673_ = 256 - i_1671_;
						for (/**/; i <= i_1666_; i++) {
							int i_1674_ = i_1665_ >> 16;
							if (i_1674_ >= -695823527 * anInt9810 && i_1674_ < 489020741 * anInt9826) {
								int i_1675_ = i_1674_ * (anInt9825 * 1013077751) + i;
								int i_1676_ = anIntArray9804[i_1675_];
								i_1676_ = (((i_1676_ & 0xff00ff) * i_1673_ >> 8 & 0xff00ff) + ((i_1676_ & 0xff00) * i_1673_ >> 8 & 0xff00));
								anIntArray9804[i_1675_] = i_1676_ + i_1668_;
							}
							i_1665_ += i_1670_;
						}
					} else if (i_1669_ == 2) {
						for (/**/; i <= i_1666_; i++) {
							int i_1677_ = i_1665_ >> 16;
							if (i_1677_ >= anInt9810 * -695823527 && i_1677_ < 489020741 * anInt9826) {
								int i_1678_ = i + i_1677_ * (1013077751 * anInt9825);
								int i_1679_ = anIntArray9804[i_1678_];
								int i_1680_ = i_1668_ + i_1679_;
								int i_1681_ = ((i_1668_ & 0xff00ff) + (i_1679_ & 0xff00ff));
								i_1679_ = ((i_1681_ & 0x1000100) + (i_1680_ - i_1681_ & 0x10000));
								anIntArray9804[i_1678_] = i_1680_ - i_1679_ | i_1679_ - (i_1679_ >>> 8);
							}
							i_1665_ += i_1670_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_1666_ <<= 16;
					int i_1682_ = (int) Math.floor((double) i_1666_ / (double) i_1667_ + 0.5);
					i_1667_ += i_1665_;
					if (i_1665_ < anInt9810 * -695823527) {
						i += (-695823527 * anInt9810 - i_1665_) * i_1682_;
						i_1665_ = anInt9810 * -695823527;
					}
					if (i_1667_ >= 489020741 * anInt9826)
						i_1667_ = anInt9826 * 489020741 - 1;
					int i_1683_ = i_1668_ >>> 24;
					if (i_1669_ == 0 || i_1669_ == 1 && 255 == i_1683_) {
						for (/**/; i_1665_ <= i_1667_; i_1665_++) {
							int i_1684_ = i >> 16;
							if (i_1684_ >= anInt9815 * -1373518821 && i_1684_ < -272361347 * anInt9809)
								anIntArray9804[(i_1665_ * (anInt9825 * 1013077751) + i_1684_)] = i_1668_;
							i += i_1682_;
						}
					} else if (i_1669_ == 1) {
						i_1668_ = ((i_1683_ * (i_1668_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_1668_ & 0xff00) * i_1683_ >> 8 & 0xff00) + (i_1683_ << 24));
						int i_1685_ = 256 - i_1683_;
						for (/**/; i_1665_ <= i_1667_; i_1665_++) {
							int i_1686_ = i >> 16;
							if (i_1686_ >= -1373518821 * anInt9815 && i_1686_ < anInt9809 * -272361347) {
								int i_1687_ = (anInt9825 * 1013077751 * i_1665_ + i_1686_);
								int i_1688_ = anIntArray9804[i_1687_];
								i_1688_ = ((i_1685_ * (i_1688_ & 0xff00) >> 8 & 0xff00) + (i_1685_ * (i_1688_ & 0xff00ff) >> 8 & 0xff00ff));
								anIntArray9804[(i_1686_ + i_1665_ * (anInt9825 * 1013077751))] = i_1688_ + i_1668_;
							}
							i += i_1682_;
						}
					} else if (i_1669_ == 2) {
						for (/**/; i_1665_ <= i_1667_; i_1665_++) {
							int i_1689_ = i >> 16;
							if (i_1689_ >= -1373518821 * anInt9815 && i_1689_ < -272361347 * anInt9809) {
								int i_1690_ = (i_1665_ * (1013077751 * anInt9825) + i_1689_);
								int i_1691_ = anIntArray9804[i_1690_];
								int i_1692_ = i_1668_ + i_1691_;
								int i_1693_ = ((i_1691_ & 0xff00ff) + (i_1668_ & 0xff00ff));
								i_1691_ = ((i_1692_ - i_1693_ & 0x10000) + (i_1693_ & 0x1000100));
								anIntArray9804[i_1690_] = i_1692_ - i_1691_ | i_1691_ - (i_1691_ >>> 8);
							}
							i += i_1682_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public void method3386(int i, int i_1694_, int i_1695_, int i_1696_, int i_1697_, int i_1698_) {
		if (null != anIntArray9804) {
			i_1695_ -= i;
			i_1696_ -= i_1694_;
			if (i_1696_ == 0) {
				if (i_1695_ >= 0)
					method3087(i, i_1694_, i_1695_ + 1, i_1697_, i_1698_);
				else
					method3087(i + i_1695_, i_1694_, 1 + -i_1695_, i_1697_, i_1698_);
			} else if (0 == i_1695_) {
				if (i_1696_ >= 0)
					method3119(i, i_1694_, 1 + i_1696_, i_1697_, i_1698_);
				else
					method3119(i, i_1696_ + i_1694_, -i_1696_ + 1, i_1697_, i_1698_);
			} else {
				if (i_1696_ + i_1695_ < 0) {
					i += i_1695_;
					i_1695_ = -i_1695_;
					i_1694_ += i_1696_;
					i_1696_ = -i_1696_;
				}
				if (i_1695_ > i_1696_) {
					i_1694_ <<= 16;
					i_1694_ += 32768;
					i_1696_ <<= 16;
					int i_1699_ = (int) Math.floor(0.5 + ((double) i_1696_ / (double) i_1695_));
					i_1695_ += i;
					if (i < anInt9815 * -1373518821) {
						i_1694_ += (anInt9815 * -1373518821 - i) * i_1699_;
						i = anInt9815 * -1373518821;
					}
					if (i_1695_ >= anInt9809 * -272361347)
						i_1695_ = -272361347 * anInt9809 - 1;
					int i_1700_ = i_1697_ >>> 24;
					if (0 == i_1698_ || i_1698_ == 1 && i_1700_ == 255) {
						for (/**/; i <= i_1695_; i++) {
							int i_1701_ = i_1694_ >> 16;
							if (i_1701_ >= -695823527 * anInt9810 && i_1701_ < anInt9826 * 489020741)
								anIntArray9804[i + (1013077751 * anInt9825 * i_1701_)] = i_1697_;
							i_1694_ += i_1699_;
						}
					} else if (i_1698_ == 1) {
						i_1697_ = ((i_1700_ * (i_1697_ & 0xff00) >> 8 & 0xff00) + ((i_1697_ & 0xff00ff) * i_1700_ >> 8 & 0xff00ff) + (i_1700_ << 24));
						int i_1702_ = 256 - i_1700_;
						for (/**/; i <= i_1695_; i++) {
							int i_1703_ = i_1694_ >> 16;
							if (i_1703_ >= -695823527 * anInt9810 && i_1703_ < 489020741 * anInt9826) {
								int i_1704_ = i_1703_ * (anInt9825 * 1013077751) + i;
								int i_1705_ = anIntArray9804[i_1704_];
								i_1705_ = (((i_1705_ & 0xff00ff) * i_1702_ >> 8 & 0xff00ff) + ((i_1705_ & 0xff00) * i_1702_ >> 8 & 0xff00));
								anIntArray9804[i_1704_] = i_1705_ + i_1697_;
							}
							i_1694_ += i_1699_;
						}
					} else if (i_1698_ == 2) {
						for (/**/; i <= i_1695_; i++) {
							int i_1706_ = i_1694_ >> 16;
							if (i_1706_ >= anInt9810 * -695823527 && i_1706_ < 489020741 * anInt9826) {
								int i_1707_ = i + i_1706_ * (1013077751 * anInt9825);
								int i_1708_ = anIntArray9804[i_1707_];
								int i_1709_ = i_1697_ + i_1708_;
								int i_1710_ = ((i_1697_ & 0xff00ff) + (i_1708_ & 0xff00ff));
								i_1708_ = ((i_1710_ & 0x1000100) + (i_1709_ - i_1710_ & 0x10000));
								anIntArray9804[i_1707_] = i_1709_ - i_1708_ | i_1708_ - (i_1708_ >>> 8);
							}
							i_1694_ += i_1699_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_1695_ <<= 16;
					int i_1711_ = (int) Math.floor((double) i_1695_ / (double) i_1696_ + 0.5);
					i_1696_ += i_1694_;
					if (i_1694_ < anInt9810 * -695823527) {
						i += (-695823527 * anInt9810 - i_1694_) * i_1711_;
						i_1694_ = anInt9810 * -695823527;
					}
					if (i_1696_ >= 489020741 * anInt9826)
						i_1696_ = anInt9826 * 489020741 - 1;
					int i_1712_ = i_1697_ >>> 24;
					if (i_1698_ == 0 || i_1698_ == 1 && 255 == i_1712_) {
						for (/**/; i_1694_ <= i_1696_; i_1694_++) {
							int i_1713_ = i >> 16;
							if (i_1713_ >= anInt9815 * -1373518821 && i_1713_ < -272361347 * anInt9809)
								anIntArray9804[(i_1694_ * (anInt9825 * 1013077751) + i_1713_)] = i_1697_;
							i += i_1711_;
						}
					} else if (i_1698_ == 1) {
						i_1697_ = ((i_1712_ * (i_1697_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_1697_ & 0xff00) * i_1712_ >> 8 & 0xff00) + (i_1712_ << 24));
						int i_1714_ = 256 - i_1712_;
						for (/**/; i_1694_ <= i_1696_; i_1694_++) {
							int i_1715_ = i >> 16;
							if (i_1715_ >= -1373518821 * anInt9815 && i_1715_ < anInt9809 * -272361347) {
								int i_1716_ = (anInt9825 * 1013077751 * i_1694_ + i_1715_);
								int i_1717_ = anIntArray9804[i_1716_];
								i_1717_ = ((i_1714_ * (i_1717_ & 0xff00) >> 8 & 0xff00) + (i_1714_ * (i_1717_ & 0xff00ff) >> 8 & 0xff00ff));
								anIntArray9804[(i_1715_ + i_1694_ * (anInt9825 * 1013077751))] = i_1717_ + i_1697_;
							}
							i += i_1711_;
						}
					} else if (i_1698_ == 2) {
						for (/**/; i_1694_ <= i_1696_; i_1694_++) {
							int i_1718_ = i >> 16;
							if (i_1718_ >= -1373518821 * anInt9815 && i_1718_ < -272361347 * anInt9809) {
								int i_1719_ = (i_1694_ * (1013077751 * anInt9825) + i_1718_);
								int i_1720_ = anIntArray9804[i_1719_];
								int i_1721_ = i_1697_ + i_1720_;
								int i_1722_ = ((i_1720_ & 0xff00ff) + (i_1697_ & 0xff00ff));
								i_1720_ = ((i_1721_ - i_1722_ & 0x10000) + (i_1722_ & 0x1000100));
								anIntArray9804[i_1719_] = i_1721_ - i_1720_ | i_1720_ - (i_1720_ >>> 8);
							}
							i += i_1711_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public void method3162(int i, int i_1723_, int i_1724_, int i_1725_, int i_1726_, int i_1727_, Class145 class145, int i_1728_, int i_1729_, int i_1730_, int i_1731_, int i_1732_) {
		if (null != anIntArray9804) {
			Class145_Sub1 class145_sub1 = (Class145_Sub1) class145;
			int[] is = class145_sub1.anIntArray9521;
			int[] is_1733_ = class145_sub1.anIntArray9520;
			int i_1734_ = (anInt9810 * -695823527 > i_1729_ ? anInt9810 * -695823527 : i_1729_);
			int i_1735_ = (anInt9826 * 489020741 < i_1729_ + is.length ? anInt9826 * 489020741 : i_1729_ + is.length);
			i_1732_ <<= 8;
			i_1730_ <<= 8;
			i_1731_ <<= 8;
			int i_1736_ = i_1731_ + i_1730_;
			i_1732_ %= i_1736_;
			i_1724_ -= i;
			i_1725_ -= i_1723_;
			if (i_1725_ + i_1724_ < 0) {
				int i_1737_ = (int) (Math.sqrt((double) (i_1725_ * i_1725_ + i_1724_ * i_1724_)) * 256.0);
				int i_1738_ = i_1737_ % i_1736_;
				i_1732_ = i_1730_ + i_1736_ - i_1732_ - i_1738_;
				i_1732_ %= i_1736_;
				if (i_1732_ < 0)
					i_1732_ += i_1736_;
				i += i_1724_;
				i_1724_ = -i_1724_;
				i_1723_ += i_1725_;
				i_1725_ = -i_1725_;
			}
			if (i_1724_ > i_1725_) {
				i_1723_ <<= 16;
				i_1723_ += 32768;
				i_1725_ <<= 16;
				int i_1739_ = (int) Math.floor(0.5 + ((double) i_1725_ / (double) i_1724_));
				i_1724_ += i;
				int i_1740_ = i_1726_ >>> 24;
				int i_1741_ = (int) Math.sqrt((double) (65536 + (i_1739_ >> 8) * (i_1739_ >> 8)));
				if (i_1727_ == 0 || 1 == i_1727_ && 255 == i_1740_) {
					while (i <= i_1724_) {
						int i_1742_ = i_1723_ >> 16;
						int i_1743_ = i_1742_ - i_1729_;
						if (i >= -1373518821 * anInt9815 && i < -272361347 * anInt9809 && i_1742_ >= i_1734_ && i_1742_ < i_1735_ && i_1732_ < i_1730_) {
							int i_1744_ = is[i_1743_] + i_1728_;
							if (i >= i_1744_ && i < is_1733_[i_1743_] + i_1744_)
								anIntArray9804[1013077751 * anInt9825 * i_1742_ + i] = i_1726_;
						}
						i_1723_ += i_1739_;
						i++;
						i_1732_ += i_1741_;
						i_1732_ %= i_1736_;
					}
				} else if (i_1727_ == 1) {
					i_1726_ = ((i_1740_ * (i_1726_ & 0xff00) >> 8 & 0xff00) + (i_1740_ * (i_1726_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1740_ << 24));
					int i_1745_ = 256 - i_1740_;
					while (i <= i_1724_) {
						int i_1746_ = i_1723_ >> 16;
						int i_1747_ = i_1746_ - i_1729_;
						if (i >= anInt9815 * -1373518821 && i < anInt9809 * -272361347 && i_1746_ >= i_1734_ && i_1746_ < i_1735_ && i_1732_ < i_1730_) {
							int i_1748_ = is[i_1747_] + i_1728_;
							if (i >= i_1748_ && i < i_1748_ + is_1733_[i_1747_]) {
								int i_1749_ = i_1746_ * (1013077751 * anInt9825) + i;
								int i_1750_ = anIntArray9804[i_1749_];
								i_1750_ = (((i_1750_ & 0xff00ff) * i_1745_ >> 8 & 0xff00ff) + ((i_1750_ & 0xff00) * i_1745_ >> 8 & 0xff00));
								anIntArray9804[i_1749_] = i_1750_ + i_1726_;
							}
						}
						i_1723_ += i_1739_;
						i++;
						i_1732_ += i_1741_;
						i_1732_ %= i_1736_;
					}
				} else if (2 == i_1727_) {
					while (i <= i_1724_) {
						int i_1751_ = i_1723_ >> 16;
						int i_1752_ = i_1751_ - i_1729_;
						if (i >= anInt9815 * -1373518821 && i < anInt9809 * -272361347 && i_1751_ >= i_1734_ && i_1751_ < i_1735_ && i_1732_ < i_1730_) {
							int i_1753_ = is[i_1752_] + i_1728_;
							if (i >= i_1753_ && i < is_1733_[i_1752_] + i_1753_) {
								int i_1754_ = i_1751_ * (1013077751 * anInt9825) + i;
								int i_1755_ = anIntArray9804[i_1754_];
								int i_1756_ = i_1755_ + i_1726_;
								int i_1757_ = ((i_1726_ & 0xff00ff) + (i_1755_ & 0xff00ff));
								i_1755_ = ((i_1756_ - i_1757_ & 0x10000) + (i_1757_ & 0x1000100));
								anIntArray9804[i_1754_] = i_1756_ - i_1755_ | i_1755_ - (i_1755_ >>> 8);
							}
						}
						i_1723_ += i_1739_;
						i++;
						i_1732_ += i_1741_;
						i_1732_ %= i_1736_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_1724_ <<= 16;
				int i_1758_ = (int) Math.floor((double) i_1724_ / (double) i_1725_ + 0.5);
				int i_1759_ = (int) Math.sqrt((double) (65536 + (i_1758_ >> 8) * (i_1758_ >> 8)));
				i_1725_ += i_1723_;
				int i_1760_ = i_1726_ >>> 24;
				if (i_1727_ == 0 || 1 == i_1727_ && 255 == i_1760_) {
					while (i_1723_ <= i_1725_) {
						int i_1761_ = i >> 16;
						int i_1762_ = i_1723_ - i_1729_;
						if (i_1723_ >= i_1734_ && i_1723_ < i_1735_ && i_1761_ >= -1373518821 * anInt9815 && i_1761_ < -272361347 * anInt9809 && i_1732_ < i_1730_ && i_1761_ >= i_1728_ + is[i_1762_] && i_1761_ < is_1733_[i_1762_] + (is[i_1762_] + i_1728_))
							anIntArray9804[i_1761_ + i_1723_ * (anInt9825 * 1013077751)] = i_1726_;
						i += i_1758_;
						i_1723_++;
						i_1732_ += i_1759_;
						i_1732_ %= i_1736_;
					}
				} else if (i_1727_ == 1) {
					i_1726_ = ((i_1760_ << 24) + ((i_1760_ * (i_1726_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_1726_ & 0xff00) * i_1760_ >> 8 & 0xff00)));
					int i_1763_ = 256 - i_1760_;
					while (i_1723_ <= i_1725_) {
						int i_1764_ = i >> 16;
						int i_1765_ = i_1723_ - i_1729_;
						if (i_1723_ >= i_1734_ && i_1723_ < i_1735_ && i_1764_ >= anInt9815 * -1373518821 && i_1764_ < anInt9809 * -272361347 && i_1732_ < i_1730_ && i_1764_ >= is[i_1765_] + i_1728_ && (i_1764_ < i_1728_ + is[i_1765_] + is_1733_[i_1765_])) {
							int i_1766_ = anInt9825 * 1013077751 * i_1723_ + i_1764_;
							int i_1767_ = anIntArray9804[i_1766_];
							i_1767_ = ((i_1763_ * (i_1767_ & 0xff00) >> 8 & 0xff00) + (i_1763_ * (i_1767_ & 0xff00ff) >> 8 & 0xff00ff));
							anIntArray9804[(anInt9825 * 1013077751 * i_1723_ + i_1764_)] = i_1767_ + i_1726_;
						}
						i += i_1758_;
						i_1723_++;
						i_1732_ += i_1759_;
						i_1732_ %= i_1736_;
					}
				} else if (2 == i_1727_) {
					while (i_1723_ <= i_1725_) {
						int i_1768_ = i >> 16;
						int i_1769_ = i_1723_ - i_1729_;
						if (i_1723_ >= i_1734_ && i_1723_ < i_1735_ && i_1768_ >= anInt9815 * -1373518821 && i_1768_ < anInt9809 * -272361347 && i_1732_ < i_1730_ && i_1768_ >= i_1728_ + is[i_1769_] && i_1768_ < is_1733_[i_1769_] + (is[i_1769_] + i_1728_)) {
							int i_1770_ = i_1723_ * (anInt9825 * 1013077751) + i_1768_;
							int i_1771_ = anIntArray9804[i_1770_];
							int i_1772_ = i_1771_ + i_1726_;
							int i_1773_ = (i_1726_ & 0xff00ff) + (i_1771_ & 0xff00ff);
							i_1771_ = (i_1773_ & 0x1000100) + (i_1772_ - i_1773_ & 0x10000);
							anIntArray9804[i_1770_] = i_1772_ - i_1771_ | i_1771_ - (i_1771_ >>> 8);
						}
						i += i_1758_;
						i_1723_++;
						i_1732_ += i_1759_;
						i_1732_ %= i_1736_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method3096(Class435 class435, Class180 class180, Class430 class430) {
		Class441 class441 = method3112();
		class441.method7090(class435);
		class441.method7089(aClass441_9821);
		class180.method3531(class430, aClass441_9805, class441, aFloat9828, aFloat9830, aFloat9827, aFloat9829);
	}

	public int method3389(int i, int i_1774_, int i_1775_, int i_1776_, int i_1777_, int i_1778_) {
		int i_1779_ = 0;
		float f = ((float) i_1775_ * aClass441_9821.aFloatArray4916[10] + ((float) i * aClass441_9821.aFloatArray4916[2] + aClass441_9821.aFloatArray4916[14] + (float) i_1774_ * aClass441_9821.aFloatArray4916[6]));
		float f_1780_ = ((float) i_1778_ * aClass441_9821.aFloatArray4916[10] + ((float) i_1776_ * aClass441_9821.aFloatArray4916[2] + aClass441_9821.aFloatArray4916[14] + aClass441_9821.aFloatArray4916[6] * (float) i_1777_));
		float f_1781_ = (aClass441_9821.aFloatArray4916[7] * (float) i_1774_ + ((float) i * aClass441_9821.aFloatArray4916[3] + aClass441_9821.aFloatArray4916[15]) + (float) i_1775_ * aClass441_9821.aFloatArray4916[11]);
		float f_1782_ = (aClass441_9821.aFloatArray4916[15] + (float) i_1776_ * aClass441_9821.aFloatArray4916[3] + aClass441_9821.aFloatArray4916[7] * (float) i_1777_ + (float) i_1778_ * aClass441_9821.aFloatArray4916[11]);
		if (f < -f_1781_ && f_1780_ < -f_1782_)
			i_1779_ |= 0x10;
		else if (f > f_1781_ && f_1780_ > f_1782_)
			i_1779_ |= 0x20;
		float f_1783_ = (aClass441_9821.aFloatArray4916[8] * (float) i_1775_ + (aClass441_9821.aFloatArray4916[4] * (float) i_1774_ + (aClass441_9821.aFloatArray4916[12] + aClass441_9821.aFloatArray4916[0] * (float) i)));
		float f_1784_ = ((float) i_1777_ * aClass441_9821.aFloatArray4916[4] + (aClass441_9821.aFloatArray4916[12] + (float) i_1776_ * aClass441_9821.aFloatArray4916[0]) + aClass441_9821.aFloatArray4916[8] * (float) i_1778_);
		if (f_1783_ < -f_1781_ && f_1784_ < -f_1782_)
			i_1779_ |= 0x1;
		if (f_1783_ > f_1781_ && f_1784_ > f_1782_)
			i_1779_ |= 0x2;
		float f_1785_ = (aClass441_9821.aFloatArray4916[1] * (float) i + aClass441_9821.aFloatArray4916[13] + aClass441_9821.aFloatArray4916[5] * (float) i_1774_ + aClass441_9821.aFloatArray4916[9] * (float) i_1775_);
		float f_1786_ = (aClass441_9821.aFloatArray4916[13] + (float) i_1776_ * aClass441_9821.aFloatArray4916[1] + aClass441_9821.aFloatArray4916[5] * (float) i_1777_ + (float) i_1778_ * aClass441_9821.aFloatArray4916[9]);
		if (f_1785_ < -f_1781_ && f_1786_ < -f_1782_)
			i_1779_ |= 0x4;
		if (f_1785_ > f_1781_ && f_1786_ > f_1782_)
			i_1779_ |= 0x8;
		return i_1779_;
	}

	public void method3390(Class523_Sub8 class523_sub8) {
		/* empty */
	}

	public void method3256(int i, Class163 class163) {
		for (int i_1787_ = 0; i_1787_ < aClass99Array9836.length; i_1787_++) {
			aClass99Array9836[i_1787_].anInt1210 = aClass99Array9836[i_1787_].anInt1192 * -1038647055;
			aClass99Array9836[i_1787_].anInt1195 = i * -1423986471;
			aClass99Array9836[i_1787_].anInt1192 = class163.anInt1776 * -759703469;
			aClass99Array9836[i_1787_].anInt1196 = class163.anInt1775 * -212138725;
			aClass99Array9836[i_1787_].aBool1204 = true;
		}
	}

	public void method3392() {
		anInt9815 = 0;
		anInt9810 = 0;
		anInt9809 = anInt9825 * 17382275;
		anInt9826 = 1544259573 * anInt9806;
		method15452();
	}

	public int method3267() {
		return 0;
	}

	public void method3406(int i) {
		/* empty */
	}

	public Class441 method3112() {
		Class99 class99 = method15475(Thread.currentThread());
		return class99.aClass441_1198;
	}

	public Class185 method3396(int i) {
		return null;
	}

	public boolean method3084() {
		return false;
	}

	public void method3330(int i, int i_1788_, float f, int i_1789_, int i_1790_, float f_1791_, int i_1792_, int i_1793_, float f_1794_, int i_1795_, int i_1796_, int i_1797_, int i_1798_) {
		boolean bool = null != anIntArray9804;
		boolean bool_1799_ = null != aFloatArray9807;
		if (bool || bool_1799_) {
			Class99 class99 = method15475(Thread.currentThread());
			Class118 class118 = class99.aClass118_1200;
			class118.aBool1465 = false;
			i -= -1373518821 * anInt9815;
			i_1789_ -= anInt9815 * -1373518821;
			i_1792_ -= anInt9815 * -1373518821;
			i_1788_ -= -695823527 * anInt9810;
			i_1790_ -= anInt9810 * -695823527;
			i_1793_ -= -695823527 * anInt9810;
			class118.aBool1455 = (i < 0 || i > class118.anInt1448 || i_1789_ < 0 || i_1789_ > class118.anInt1448 || i_1792_ < 0 || i_1792_ > class118.anInt1448);
			int i_1800_ = i_1795_ >>> 24;
			if (0 == i_1798_ || 1 == i_1798_ && i_1800_ == 255) {
				class118.anInt1438 = 0;
				class118.aBool1437 = false;
				class118.method2031(bool, bool_1799_, false, (float) i_1788_, (float) i_1790_, (float) i_1793_, (float) i, (float) i_1789_, (float) i_1792_, f, f_1791_, f_1794_, i_1795_, i_1796_, i_1797_);
			} else if (1 == i_1798_) {
				class118.anInt1438 = 255 - i_1800_;
				class118.aBool1437 = false;
				class118.method2031(bool, bool_1799_, false, (float) i_1788_, (float) i_1790_, (float) i_1793_, (float) i, (float) i_1789_, (float) i_1792_, f, f_1791_, f_1794_, i_1795_, i_1796_, i_1797_);
			} else if (i_1798_ == 2) {
				class118.anInt1438 = 128;
				class118.aBool1437 = true;
				class118.method2031(bool, bool_1799_, false, (float) i_1788_, (float) i_1790_, (float) i_1793_, (float) i, (float) i_1789_, (float) i_1792_, f, f_1791_, f_1794_, i_1795_, i_1796_, i_1797_);
			} else
				throw new IllegalArgumentException();
			class118.aBool1465 = true;
		}
	}

	public Class168_Sub1 method3399() {
		return new Class168_Sub1_Sub2(this);
	}

	public Class168_Sub1 method3028() {
		return new Class168_Sub1_Sub2(this);
	}

	public Interface23 method3233(int i, int i_1801_) {
		return new Class140(i, i_1801_);
	}

	public Interface23 method3402(int i, int i_1802_) {
		return new Class140(i, i_1802_);
	}

	public boolean method3174() {
		return true;
	}

	public boolean method3420() {
		return false;
	}

	public boolean method3350() {
		return false;
	}

	Class99 method15479(Runnable runnable) {
		for (int i = 0; i < 1353126165 * anInt9819; i++) {
			if (aClass99Array9836[i].aRunnable1187 == runnable)
				return aClass99Array9836[i];
		}
		return null;
	}

	public Class148 method3376(int i, int i_1803_, int i_1804_, int i_1805_, boolean bool) {
		if (null == anIntArray9804)
			throw new IllegalStateException("");
		int[] is = new int[i_1804_ * i_1805_];
		int i_1806_ = anInt9825 * 1013077751 * i_1803_ + i;
		int i_1807_ = anInt9825 * 1013077751 - i_1804_;
		for (int i_1808_ = 0; i_1808_ < i_1805_; i_1808_++) {
			int i_1809_ = i_1808_ * i_1804_;
			for (int i_1810_ = 0; i_1810_ < i_1804_; i_1810_++)
				is[i_1809_ + i_1810_] = anIntArray9804[i_1806_++];
			i_1806_ += i_1807_;
		}
		if (bool)
			return new Class148_Sub1_Sub1(this, is, i_1804_, i_1805_);
		return new Class148_Sub1_Sub3(this, is, i_1804_, i_1805_);
	}

	public Interface22 method3441(int i, int i_1811_, Class158 class158, Class170 class170, int i_1812_) {
		return method15432(i, i_1811_);
	}

	void method15480(int i) {
		aClass99Array9836[i].method1782(Thread.currentThread(), -2011217670);
	}

	public void method3397(Class165 class165, float f, Class165 class165_1813_, float f_1814_, Class165 class165_1815_, float f_1816_) {
		/* empty */
	}

	void method3467(float f, float f_1817_, float f_1818_, float f_1819_, float f_1820_, float f_1821_) {
		/* empty */
	}

	public int method3407() {
		return -1;
	}

	static int method15481(Interface17 interface17, Interface12 interface12, int i) {
		int i_1822_ = 0;
		for (int i_1823_ = 0; i_1823_ < interface12.method69(-1544642307); i_1823_++) {
			Class280 class280 = (Class280) interface12.getDefinition(i_1823_, (byte) -71);
			if (class280.method5069(interface17, (short) 25819))
				i_1822_ += class280.anInt3050 * -576086769;
		}
		return i_1822_;
	}
}
