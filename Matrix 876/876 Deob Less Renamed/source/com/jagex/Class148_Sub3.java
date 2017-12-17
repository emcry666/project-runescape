/* Class148_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class148_Sub3 extends Class148 {
	boolean aBool9787;
	int anInt9788;
	Interface22 anInterface22_9789;
	int anInt9790;
	int anInt9791;
	int anInt9792;
	Interface37 anInterface37_9793;
	int anInt9794;
	boolean aBool9795;
	int anInt9796;
	Class178_Sub2 aClass178_Sub2_9797;
	boolean aBool9798 = false;
	boolean aBool9799;
	boolean aBool9800;

	public Interface22 method2471() {
		return anInterface22_9789;
	}

	Class148_Sub3(Class178_Sub2 class178_sub2, int i, int i_0_, int[] is, int i_1_, int i_2_) {
		anInt9796 = 0;
		anInt9794 = 0;
		anInt9792 = 0;
		anInt9788 = 0;
		aClass178_Sub2_9797 = class178_sub2;
		anInt9790 = i;
		anInt9791 = i_0_;
		anInterface22_9789 = null;
		anInterface37_9793 = class178_sub2.method14996(i, i_0_, false, is, i_1_, i_2_);
		anInterface37_9793.method239(true, true);
		aBool9795 = anInterface37_9793.method1() != i;
		aBool9787 = anInterface37_9793.method82() != i_0_;
		aBool9799 = !aBool9795 && anInterface37_9793.method217();
		aBool9800 = !aBool9787 && anInterface37_9793.method217();
	}

	public void method2454(int i, int i_3_, int i_4_, int i_5_, int[] is, int i_6_, int i_7_) {
		anInterface37_9793.method221(i, i_3_, i_4_, i_5_, is, i_6_, i_7_);
	}

	Class148_Sub3(Class178_Sub2 class178_sub2, Interface37 interface37, int i, int i_8_) {
		anInt9796 = 0;
		anInt9794 = 0;
		anInt9792 = 0;
		anInt9788 = 0;
		aClass178_Sub2_9797 = class178_sub2;
		anInt9790 = i;
		anInt9791 = i_8_;
		anInterface37_9793 = interface37;
		anInterface22_9789 = null;
		aBool9795 = anInterface37_9793.method1() != i;
		aBool9787 = anInterface37_9793.method82() != i_8_;
		aBool9799 = !aBool9795 && anInterface37_9793.method217();
		aBool9800 = !aBool9787 && anInterface37_9793.method217();
	}

	public int method2429() {
		return anInt9791 + anInt9796 + anInt9792;
	}

	public void method2434(int i, int i_9_, int i_10_) {
		int[] is = aClass178_Sub2_9797.method3293(i, i_9_, anInt9790, anInt9791);
		int[] is_11_ = new int[anInt9790 * anInt9791];
		anInterface37_9793.method223(0, 0, anInt9790, anInt9791, is_11_, 0);
		if (i_10_ == 0) {
			for (int i_12_ = 0; i_12_ < anInt9791; i_12_++) {
				int i_13_ = i_12_ * anInt9790;
				for (int i_14_ = 0; i_14_ < anInt9790; i_14_++)
					is_11_[i_13_ + i_14_] = (is_11_[i_13_ + i_14_] & 0xffffff | is[i_13_ + i_14_] << 8 & ~0xffffff);
			}
		} else if (i_10_ == 1) {
			for (int i_15_ = 0; i_15_ < anInt9791; i_15_++) {
				int i_16_ = i_15_ * anInt9790;
				for (int i_17_ = 0; i_17_ < anInt9790; i_17_++)
					is_11_[i_16_ + i_17_] = (is_11_[i_16_ + i_17_] & 0xffffff | is[i_16_ + i_17_] << 16 & ~0xffffff);
			}
		} else if (i_10_ == 2) {
			for (int i_18_ = 0; i_18_ < anInt9791; i_18_++) {
				int i_19_ = i_18_ * anInt9790;
				for (int i_20_ = 0; i_20_ < anInt9790; i_20_++)
					is_11_[i_19_ + i_20_] = (is_11_[i_19_ + i_20_] & 0xffffff | is[i_19_ + i_20_] << 24 & ~0xffffff);
			}
		} else if (i_10_ == 3) {
			for (int i_21_ = 0; i_21_ < anInt9791; i_21_++) {
				int i_22_ = i_21_ * anInt9790;
				for (int i_23_ = 0; i_23_ < anInt9790; i_23_++)
					is_11_[i_22_ + i_23_] = (is_11_[i_22_ + i_23_] & 0xffffff | (is[i_22_ + i_23_] != 0 ? -16777216 : 0));
			}
		}
		method2431(0, 0, anInt9790, anInt9791, is_11_, 0, anInt9790);
	}

	public int method2474() {
		return anInt9791 + anInt9796 + anInt9792;
	}

	public void method2425(int[] is) {
		is[0] = anInt9794;
		is[1] = anInt9796;
		is[2] = anInt9788;
		is[3] = anInt9792;
	}

	public int method2504() {
		return anInt9790;
	}

	public void method2483(int i, int i_24_, int i_25_, int i_26_, int[] is, int i_27_, int i_28_) {
		anInterface37_9793.method221(i, i_24_, i_25_, i_26_, is, i_27_, i_28_);
	}

	public int method2428() {
		return anInt9791;
	}

	void method2453(int i, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_) {
		if (aClass178_Sub2_9797.method14942() != Class348.aClass348_3636) {
			if (aBool9798) {
				i_30_ = i_30_ * anInt9790 / method38();
				i_31_ = i_31_ * anInt9791 / method2429();
				i += anInt9794 * i_30_ / anInt9790;
				i_29_ += anInt9796 * i_31_ / anInt9791;
			}
			aClass178_Sub2_9797.aClass356_9639.method6244((float) i, (float) i_29_, (float) (i + i_30_), (float) (i_29_ + i_31_), anInterface37_9793.method261(0.0F), anInterface37_9793.method218(0.0F), anInterface37_9793.method261((float) anInt9790), anInterface37_9793.method218((float) anInt9791), anInterface37_9793, i_33_);
		} else {
			aClass178_Sub2_9797.method14971();
			aClass178_Sub2_9797.method15018(i_34_);
			Class327 class327 = aClass178_Sub2_9797.aClass327_9613;
			class327.anInterface37_3464 = anInterface37_9793;
			class327.method5751(i_32_, i_33_);
			if (aBool9798) {
				i_30_ = i_30_ * anInt9790 / method38();
				i_31_ = i_31_ * anInt9791 / method2429();
				i += anInt9794 * i_30_ / anInt9790;
				i_29_ += anInt9796 * i_31_ / anInt9791;
			}
			float f = (float) aClass178_Sub2_9797.method3039(1509865441).method2875();
			float f_36_ = (float) aClass178_Sub2_9797.method3039(2090544752).method2874();
			class327.aClass441_3466.method7093((float) i_30_ * 2.0F / f, (float) i_31_ * 2.0F / f_36_, 1.0F, 1.0F);
			class327.aClass441_3466.aFloatArray4916[12] = (((float) i + aClass178_Sub2_9797.method15089()) * 2.0F / f - 1.0F);
			class327.aClass441_3466.aFloatArray4916[13] = (((float) i_29_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_36_) - 1.0F;
			class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
			class327.aClass441_3467.method7093(anInterface37_9793.method261((float) anInt9790), anInterface37_9793.method218((float) anInt9791), 1.0F, 1.0F);
			class327.anInterface36_3468 = aClass178_Sub2_9797.anInterface36_9691;
			class327.anInt3463 = 0;
			class327.aClass345_3471 = aClass178_Sub2_9797.aClass345_9694;
			class327.method5753();
		}
	}

	public void method2488(int i, int i_37_, Class145 class145, int i_38_, int i_39_) {
		aClass178_Sub2_9797.method14971();
		Class327 class327 = aClass178_Sub2_9797.aClass327_9613;
		class327.anInterface37_3464 = anInterface37_9793;
		class327.method5751(1, -1);
		i += anInt9794;
		i_37_ += anInt9796;
		float f = (float) aClass178_Sub2_9797.method3039(2136092320).method2875();
		float f_40_ = (float) aClass178_Sub2_9797.method3039(1796684859).method2874();
		class327.aClass441_3466.method7093((float) anInt9790 * 2.0F / f, (float) anInt9791 * 2.0F / f_40_, 1.0F, 1.0F);
		class327.aClass441_3466.aFloatArray4916[12] = (((float) i + aClass178_Sub2_9797.method15089()) * 2.0F / f - 1.0F);
		class327.aClass441_3466.aFloatArray4916[13] = (((float) i_37_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_40_) - 1.0F;
		class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
		class327.aClass441_3467.method7093(anInterface37_9793.method261((float) anInt9790), anInterface37_9793.method218((float) anInt9791), 1.0F, 1.0F);
		class327.anInterface36_3468 = aClass178_Sub2_9797.anInterface36_9691;
		class327.anInt3463 = 0;
		class327.aClass345_3471 = aClass178_Sub2_9797.aClass345_9694;
		Interface37 interface37 = ((Class145_Sub2) class145).anInterface37_9740;
		class327.anInterface37_3469 = interface37;
		class327.aClass441_3465.method7093(interface37.method261((float) anInt9790), interface37.method218((float) anInt9791), 1.0F, 1.0F);
		class327.aClass441_3465.aFloatArray4916[12] = interface37.method261((float) (i - i_38_));
		class327.aClass441_3465.aFloatArray4916[13] = interface37.method218((float) (i_37_ - i_39_));
		class327.method5754();
	}

	public void method2431(int i, int i_41_, int i_42_, int i_43_, int[] is, int i_44_, int i_45_) {
		anInterface37_9793.method221(i, i_41_, i_42_, i_43_, is, i_44_, i_45_);
	}

	public void method2432(int i, int i_46_, int i_47_, int i_48_, int[] is, int[] is_49_, int i_50_, int i_51_) {
		anInterface37_9793.method235(i, i_46_, i_47_, i_48_, is, is_49_, i_50_);
	}

	Class148_Sub3(Class178_Sub2 class178_sub2, Interface37 interface37) {
		this(class178_sub2, interface37, interface37.method1(), interface37.method82());
	}

	public void method2482(int i, int i_52_, Class145 class145, int i_53_, int i_54_) {
		aClass178_Sub2_9797.method14971();
		Class327 class327 = aClass178_Sub2_9797.aClass327_9613;
		class327.anInterface37_3464 = anInterface37_9793;
		class327.method5751(1, -1);
		i += anInt9794;
		i_52_ += anInt9796;
		float f = (float) aClass178_Sub2_9797.method3039(1717378283).method2875();
		float f_55_ = (float) aClass178_Sub2_9797.method3039(1942323672).method2874();
		class327.aClass441_3466.method7093((float) anInt9790 * 2.0F / f, (float) anInt9791 * 2.0F / f_55_, 1.0F, 1.0F);
		class327.aClass441_3466.aFloatArray4916[12] = (((float) i + aClass178_Sub2_9797.method15089()) * 2.0F / f - 1.0F);
		class327.aClass441_3466.aFloatArray4916[13] = (((float) i_52_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_55_) - 1.0F;
		class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
		class327.aClass441_3467.method7093(anInterface37_9793.method261((float) anInt9790), anInterface37_9793.method218((float) anInt9791), 1.0F, 1.0F);
		class327.anInterface36_3468 = aClass178_Sub2_9797.anInterface36_9691;
		class327.anInt3463 = 0;
		class327.aClass345_3471 = aClass178_Sub2_9797.aClass345_9694;
		Interface37 interface37 = ((Class145_Sub2) class145).anInterface37_9740;
		class327.anInterface37_3469 = interface37;
		class327.aClass441_3465.method7093(interface37.method261((float) anInt9790), interface37.method218((float) anInt9791), 1.0F, 1.0F);
		class327.aClass441_3465.aFloatArray4916[12] = interface37.method261((float) (i - i_53_));
		class327.aClass441_3465.aFloatArray4916[13] = interface37.method218((float) (i_52_ - i_54_));
		class327.method5754();
	}

	void method2461(int i, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_) {
		if (aClass178_Sub2_9797.method14942() != Class348.aClass348_3636) {
			if (aBool9798) {
				i_57_ = i_57_ * anInt9790 / method38();
				i_58_ = i_58_ * anInt9791 / method2429();
				i += anInt9794 * i_57_ / anInt9790;
				i_56_ += anInt9796 * i_58_ / anInt9791;
			}
			aClass178_Sub2_9797.aClass356_9639.method6244((float) i, (float) i_56_, (float) (i + i_57_), (float) (i_56_ + i_58_), anInterface37_9793.method261(0.0F), anInterface37_9793.method218(0.0F), anInterface37_9793.method261((float) anInt9790), anInterface37_9793.method218((float) anInt9791), anInterface37_9793, i_60_);
		} else {
			aClass178_Sub2_9797.method14971();
			aClass178_Sub2_9797.method15018(i_61_);
			Class327 class327 = aClass178_Sub2_9797.aClass327_9613;
			class327.anInterface37_3464 = anInterface37_9793;
			class327.method5751(i_59_, i_60_);
			if (aBool9798) {
				i_57_ = i_57_ * anInt9790 / method38();
				i_58_ = i_58_ * anInt9791 / method2429();
				i += anInt9794 * i_57_ / anInt9790;
				i_56_ += anInt9796 * i_58_ / anInt9791;
			}
			float f = (float) aClass178_Sub2_9797.method3039(1446068954).method2875();
			float f_63_ = (float) aClass178_Sub2_9797.method3039(1600992600).method2874();
			class327.aClass441_3466.method7093((float) i_57_ * 2.0F / f, (float) i_58_ * 2.0F / f_63_, 1.0F, 1.0F);
			class327.aClass441_3466.aFloatArray4916[12] = (((float) i + aClass178_Sub2_9797.method15089()) * 2.0F / f - 1.0F);
			class327.aClass441_3466.aFloatArray4916[13] = (((float) i_56_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_63_) - 1.0F;
			class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
			class327.aClass441_3467.method7093(anInterface37_9793.method261((float) anInt9790), anInterface37_9793.method218((float) anInt9791), 1.0F, 1.0F);
			class327.anInterface36_3468 = aClass178_Sub2_9797.anInterface36_9691;
			class327.anInt3463 = 0;
			class327.aClass345_3471 = aClass178_Sub2_9797.aClass345_9694;
			class327.method5753();
		}
	}

	public void method2464(int i, int i_64_, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_) {
		if (aClass178_Sub2_9797.method14942() != Class348.aClass348_3636) {
			int i_70_ = i_64_ + i_66_;
			int i_71_ = i + i_65_;
			int i_72_ = method38();
			int i_73_ = method2429();
			int i_74_ = i_64_ + anInt9796;
			for (int i_75_ = i_74_ + anInt9791; i_75_ <= i_70_; i_75_ += i_73_) {
				int i_76_ = i + anInt9794;
				for (int i_77_ = i_76_ + anInt9790; i_77_ <= i_71_; i_77_ += i_72_) {
					aClass178_Sub2_9797.aClass356_9639.method6244((float) i_76_, (float) i_74_, (float) (i_76_ + anInt9790), (float) (i_74_ + anInt9791), 0.0F, 0.0F, anInterface37_9793.method220(), anInterface37_9793.method227(), anInterface37_9793, i_68_);
					i_76_ += i_72_;
				}
				if (i_76_ < i_71_) {
					int i_78_ = i_71_ - i_76_;
					aClass178_Sub2_9797.aClass356_9639.method6244((float) i_76_, (float) i_74_, (float) (i_76_ + i_78_), (float) (i_74_ + anInt9791), 0.0F, 0.0F, ((float) i_78_ / (float) anInt9790 * anInterface37_9793.method220()), anInterface37_9793.method227(), anInterface37_9793, i_68_);
				}
				i_74_ += i_73_;
			}
			if (i_74_ < i_70_) {
				int i_79_ = i_70_ - i_74_;
				float f = ((float) i_79_ / (float) anInt9791 * anInterface37_9793.method227());
				int i_80_ = i + anInt9794;
				for (int i_81_ = i_80_ + anInt9790; i_81_ <= i_71_; i_81_ += i_72_) {
					aClass178_Sub2_9797.aClass356_9639.method6244((float) i_80_, (float) i_74_, (float) (i_80_ + anInt9790), (float) (i_74_ + i_79_), 0.0F, 0.0F, anInterface37_9793.method220(), f, anInterface37_9793, i_68_);
					i_80_ += i_72_;
				}
				if (i_80_ < i_71_) {
					int i_82_ = i_71_ - i_80_;
					aClass178_Sub2_9797.aClass356_9639.method6244((float) i_80_, (float) i_74_, (float) (i_80_ + i_82_), (float) (i_74_ + i_79_), 0.0F, 0.0F, ((float) i_82_ / (float) anInt9790 * anInterface37_9793.method220()), f, anInterface37_9793, i_68_);
				}
			}
		} else {
			aClass178_Sub2_9797.method14971();
			aClass178_Sub2_9797.method15018(i_69_);
			Class327 class327 = aClass178_Sub2_9797.aClass327_9613;
			class327.anInterface37_3464 = anInterface37_9793;
			class327.method5751(i_67_, i_68_);
			float f = (float) aClass178_Sub2_9797.method3039(1387397339).method2875();
			float f_83_ = (float) aClass178_Sub2_9797.method3039(1839090838).method2874();
			class327.anInterface36_3468 = aClass178_Sub2_9797.anInterface36_9691;
			class327.anInt3463 = 0;
			class327.aClass345_3471 = aClass178_Sub2_9797.aClass345_9694;
			boolean bool = aBool9800 && anInt9796 == 0 && anInt9792 == 0;
			boolean bool_84_ = aBool9799 && anInt9794 == 0 && anInt9788 == 0;
			if (bool_84_ & bool) {
				class327.aClass441_3466.method7093((float) i_65_ * 2.0F / f, ((float) i_66_ * 2.0F / f_83_), 1.0F, 1.0F);
				class327.aClass441_3466.aFloatArray4916[12] = (((float) i + aClass178_Sub2_9797.method15089()) * 2.0F / f) - 1.0F;
				class327.aClass441_3466.aFloatArray4916[13] = (((float) i_64_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_83_) - 1.0F;
				class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
				class327.aClass441_3467.method7093(anInterface37_9793.method261((float) i_65_), anInterface37_9793.method218((float) i_66_), 1.0F, 1.0F);
				class327.method5753();
			} else if (bool_84_) {
				int i_85_ = i_64_ + i_66_;
				int i_86_ = method2429();
				class327.aClass441_3467.method7093(anInterface37_9793.method261((float) i_65_), anInterface37_9793.method218((float) anInt9791), 1.0F, 1.0F);
				int i_87_ = i_64_ + anInt9796;
				for (int i_88_ = i_87_ + anInt9791; i_88_ <= i_85_; i_88_ += i_86_) {
					class327.aClass441_3466.method7093(((float) i_65_ * 2.0F / f), ((float) anInt9791 * 2.0F / f_83_), 1.0F, 1.0F);
					class327.aClass441_3466.aFloatArray4916[12] = (((float) i + aClass178_Sub2_9797.method15089()) * 2.0F / f) - 1.0F;
					class327.aClass441_3466.aFloatArray4916[13] = (((float) i_87_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_83_) - 1.0F;
					class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
					class327.method5753();
					i_87_ += i_86_;
				}
				if (i_87_ < i_85_) {
					int i_89_ = i_85_ - i_87_;
					class327.aClass441_3467.method7093(anInterface37_9793.method261((float) i_65_), anInterface37_9793.method218((float) i_89_), 1.0F, 1.0F);
					class327.aClass441_3466.method7093(((float) i_65_ * 2.0F / f), ((float) i_89_ * 2.0F / f_83_), 1.0F, 1.0F);
					class327.aClass441_3466.aFloatArray4916[12] = (((float) i + aClass178_Sub2_9797.method15089()) * 2.0F / f) - 1.0F;
					class327.aClass441_3466.aFloatArray4916[13] = (((float) i_87_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_83_) - 1.0F;
					class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
					class327.method5753();
				}
			} else if (bool) {
				int i_90_ = i + i_65_;
				int i_91_ = method38();
				class327.aClass441_3467.method7093(anInterface37_9793.method261((float) anInt9790), anInterface37_9793.method218((float) i_66_), 1.0F, 1.0F);
				int i_92_ = i + anInt9794;
				for (int i_93_ = i_92_ + anInt9790; i_93_ <= i_90_; i_93_ += i_91_) {
					class327.aClass441_3466.method7093(((float) anInt9790 * 2.0F / f), ((float) i_66_ * 2.0F / f_83_), 1.0F, 1.0F);
					class327.aClass441_3466.aFloatArray4916[12] = (((float) i_92_ + aClass178_Sub2_9797.method15089()) * 2.0F / f) - 1.0F;
					class327.aClass441_3466.aFloatArray4916[13] = (((float) i_64_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_83_) - 1.0F;
					class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
					class327.method5753();
					i_92_ += i_91_;
				}
				if (i_92_ < i_90_) {
					int i_94_ = i_90_ - i_92_;
					class327.aClass441_3467.method7093(anInterface37_9793.method261((float) i_94_), anInterface37_9793.method218((float) i_66_), 1.0F, 1.0F);
					class327.aClass441_3466.method7093(((float) i_94_ * 2.0F / f), ((float) i_66_ * 2.0F / f_83_), 1.0F, 1.0F);
					class327.aClass441_3466.aFloatArray4916[12] = (((float) i_92_ + aClass178_Sub2_9797.method15089()) * 2.0F / f) - 1.0F;
					class327.aClass441_3466.aFloatArray4916[13] = (((float) i_64_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_83_) - 1.0F;
					class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
					class327.method5753();
				}
			} else {
				int i_95_ = i_64_ + i_66_;
				int i_96_ = i + i_65_;
				int i_97_ = method38();
				int i_98_ = method2429();
				int i_99_ = i_64_ + anInt9796;
				for (int i_100_ = i_99_ + anInt9791; i_100_ <= i_95_; i_100_ += i_98_) {
					class327.aClass441_3467.method7093(anInterface37_9793.method261((float) anInt9790), anInterface37_9793.method218((float) anInt9791), 1.0F, 1.0F);
					int i_101_ = i + anInt9794;
					for (int i_102_ = i_101_ + anInt9790; i_102_ <= i_96_; i_102_ += i_97_) {
						class327.aClass441_3466.method7093(((float) anInt9790 * 2.0F / f), ((float) anInt9791 * 2.0F / f_83_), 1.0F, 1.0F);
						class327.aClass441_3466.aFloatArray4916[12] = (((float) i_101_ + aClass178_Sub2_9797.method15089()) * 2.0F / f - 1.0F);
						class327.aClass441_3466.aFloatArray4916[13] = (((float) i_99_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_83_) - 1.0F;
						class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
						class327.method5753();
						i_101_ += i_97_;
					}
					if (i_101_ < i_96_) {
						int i_103_ = i_96_ - i_101_;
						class327.aClass441_3467.method7093(anInterface37_9793.method261((float) i_103_), anInterface37_9793.method218((float) anInt9791), 1.0F, 1.0F);
						class327.aClass441_3466.method7093(((float) i_103_ * 2.0F / f), ((float) anInt9791 * 2.0F / f_83_), 1.0F, 1.0F);
						class327.aClass441_3466.aFloatArray4916[12] = (((float) i_101_ + aClass178_Sub2_9797.method15089()) * 2.0F / f - 1.0F);
						class327.aClass441_3466.aFloatArray4916[13] = (((float) i_99_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_83_) - 1.0F;
						class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
						class327.method5753();
					}
					i_99_ += i_98_;
				}
				if (i_99_ < i_95_) {
					int i_104_ = i_95_ - i_99_;
					class327.aClass441_3467.method7093(anInterface37_9793.method261((float) anInt9790), anInterface37_9793.method218((float) i_104_), 1.0F, 1.0F);
					int i_105_ = i + anInt9794;
					for (int i_106_ = i_105_ + anInt9790; i_106_ <= i_96_; i_106_ += i_97_) {
						class327.aClass441_3466.method7093(((float) anInt9790 * 2.0F / f), ((float) i_104_ * 2.0F / f_83_), 1.0F, 1.0F);
						class327.aClass441_3466.aFloatArray4916[12] = (((float) i_105_ + aClass178_Sub2_9797.method15089()) * 2.0F / f - 1.0F);
						class327.aClass441_3466.aFloatArray4916[13] = (((float) i_99_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_83_) - 1.0F;
						class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
						class327.method5753();
						i_105_ += i_97_;
					}
					if (i_105_ < i_96_) {
						int i_107_ = i_96_ - i_105_;
						class327.aClass441_3467.method7093(anInterface37_9793.method261((float) i_107_), anInterface37_9793.method218((float) i_104_), 1.0F, 1.0F);
						class327.aClass441_3466.method7093(((float) i_107_ * 2.0F / f), ((float) i_104_ * 2.0F / f_83_), 1.0F, 1.0F);
						class327.aClass441_3466.aFloatArray4916[12] = (((float) i_105_ + aClass178_Sub2_9797.method15089()) * 2.0F / f - 1.0F);
						class327.aClass441_3466.aFloatArray4916[13] = (((float) i_99_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_83_) - 1.0F;
						class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
						class327.method5753();
					}
				}
			}
		}
	}

	public int method38() {
		return anInt9790 + anInt9794 + anInt9788;
	}

	void method2475(float f, float f_108_, float f_109_, float f_110_, float f_111_, float f_112_, int i, Class145 class145, int i_113_, int i_114_) {
		aClass178_Sub2_9797.method14971();
		Class327 class327 = aClass178_Sub2_9797.aClass327_9613;
		class327.anInterface37_3464 = anInterface37_9793;
		class327.method5751(1, -1);
		float f_115_ = (float) aClass178_Sub2_9797.method3039(1721957189).method2875();
		float f_116_ = (float) aClass178_Sub2_9797.method3039(2134202335).method2874();
		class327.aClass441_3466.method7085();
		if (aBool9798) {
			float f_117_ = (float) anInt9790 / (float) method38();
			float f_118_ = (float) anInt9791 / (float) method2429();
			class327.aClass441_3466.aFloatArray4916[0] = (f_109_ - f) * f_117_;
			class327.aClass441_3466.aFloatArray4916[1] = (f_110_ - f_108_) * f_117_;
			class327.aClass441_3466.aFloatArray4916[4] = (f_111_ - f) * f_118_;
			class327.aClass441_3466.aFloatArray4916[5] = (f_112_ - f_108_) * f_118_;
			class327.aClass441_3466.aFloatArray4916[12] = ((f + (float) anInt9794) * f_117_ + aClass178_Sub2_9797.method15089());
			class327.aClass441_3466.aFloatArray4916[13] = ((f_108_ + (float) anInt9796) * f_118_ + aClass178_Sub2_9797.method15089());
		} else {
			class327.aClass441_3466.aFloatArray4916[0] = f_109_ - f;
			class327.aClass441_3466.aFloatArray4916[1] = f_110_ - f_108_;
			class327.aClass441_3466.aFloatArray4916[4] = f_111_ - f;
			class327.aClass441_3466.aFloatArray4916[5] = f_112_ - f_108_;
			class327.aClass441_3466.aFloatArray4916[12] = f + aClass178_Sub2_9797.method15089();
			class327.aClass441_3466.aFloatArray4916[13] = f_108_ + aClass178_Sub2_9797.method15089();
		}
		Class441 class441 = aClass178_Sub2_9797.aClass441_9560;
		class441.method7085();
		class441.aFloatArray4916[0] = 2.0F / f_115_;
		class441.aFloatArray4916[5] = 2.0F / f_116_;
		class441.aFloatArray4916[12] = -1.0F;
		class441.aFloatArray4916[13] = -1.0F;
		class441.aFloatArray4916[14] = -1.0F;
		class327.aClass441_3466.method7089(class441);
		class327.aClass441_3467.method7093(anInterface37_9793.method261((float) anInt9790), anInterface37_9793.method218((float) anInt9791), 1.0F, 1.0F);
		class327.anInterface36_3468 = aClass178_Sub2_9797.anInterface36_9691;
		class327.anInt3463 = 0;
		class327.aClass345_3471 = aClass178_Sub2_9797.aClass345_9694;
		Interface37 interface37 = ((Class145_Sub2) class145).anInterface37_9740;
		class327.anInterface37_3469 = interface37;
		class327.aClass441_3465.method7085();
		class327.aClass441_3465.aFloatArray4916[0] = (f_109_ - f) * interface37.method261(1.0F);
		class327.aClass441_3465.aFloatArray4916[1] = (f_110_ - f_108_) * interface37.method261(1.0F);
		class327.aClass441_3465.aFloatArray4916[4] = (f_111_ - f) * interface37.method218(1.0F);
		class327.aClass441_3465.aFloatArray4916[5] = (f_112_ - f_108_) * interface37.method218(1.0F);
		class327.aClass441_3465.aFloatArray4916[12] = (f - (float) i_113_) * interface37.method261(1.0F);
		class327.aClass441_3465.aFloatArray4916[13] = (f_108_ - (float) i_114_) * interface37.method218(1.0F);
		class327.method5754();
	}

	public void method2452(int i, int i_119_, int i_120_, int i_121_, int[] is, int i_122_, int i_123_) {
		anInterface37_9793.method221(i, i_119_, i_120_, i_121_, is, i_122_, i_123_);
	}

	public void method2506(int i, int i_124_, int i_125_, int i_126_, int[] is, int i_127_, int i_128_) {
		anInterface37_9793.method221(i, i_124_, i_125_, i_126_, is, i_127_, i_128_);
	}

	public void method2460(int i, int i_129_, int i_130_, int i_131_, int i_132_, int i_133_) {
		anInterface37_9793.method225(i, i_129_, i_130_, i_131_, i_132_, i_133_);
	}

	public void method2437(int i, int i_134_, int i_135_, int i_136_, int[] is, int i_137_, int i_138_) {
		anInterface37_9793.method221(i, i_134_, i_135_, i_136_, is, i_137_, i_138_);
	}

	public void method2493(int i, int i_139_, int i_140_, int i_141_, int i_142_) {
		if (aClass178_Sub2_9797.method14942() != Class348.aClass348_3636) {
			i += anInt9794;
			i_139_ += anInt9796;
			aClass178_Sub2_9797.aClass356_9639.method6244((float) i, (float) i_139_, (float) (i + anInt9790), (float) (i_139_ + anInt9791), 0.0F, 0.0F, anInterface37_9793.method220(), anInterface37_9793.method227(), anInterface37_9793, i_141_);
		} else {
			aClass178_Sub2_9797.method14971();
			aClass178_Sub2_9797.method15018(i_142_);
			Class327 class327 = aClass178_Sub2_9797.aClass327_9613;
			class327.anInterface37_3464 = anInterface37_9793;
			class327.method5751(i_140_, i_141_);
			i += anInt9794;
			i_139_ += anInt9796;
			float f = (float) aClass178_Sub2_9797.method3039(1949965469).method2875();
			float f_143_ = (float) aClass178_Sub2_9797.method3039(1569094857).method2874();
			class327.aClass441_3466.method7093((float) anInt9790 * 2.0F / f, ((float) anInt9791 * 2.0F / f_143_), 1.0F, 1.0F);
			class327.aClass441_3466.aFloatArray4916[12] = (((float) i + aClass178_Sub2_9797.method15089()) * 2.0F / f - 1.0F);
			class327.aClass441_3466.aFloatArray4916[13] = (((float) i_139_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_143_) - 1.0F;
			class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
			class327.aClass441_3467.method7093(anInterface37_9793.method261((float) anInt9790), anInterface37_9793.method218((float) anInt9791), 1.0F, 1.0F);
			class327.anInterface36_3468 = aClass178_Sub2_9797.anInterface36_9691;
			class327.anInt3463 = 0;
			class327.aClass345_3471 = aClass178_Sub2_9797.aClass345_9694;
			class327.method5753();
		}
	}

	public void method2456(int i, int i_144_, int i_145_, int i_146_, int[] is, int[] is_147_, int i_148_, int i_149_) {
		anInterface37_9793.method235(i, i_144_, i_145_, i_146_, is, is_147_, i_148_);
	}

	public void method2441(int i, int i_150_, int i_151_, int i_152_, int[] is, int[] is_153_, int i_154_, int i_155_) {
		anInterface37_9793.method235(i, i_150_, i_151_, i_152_, is, is_153_, i_154_);
	}

	Class148_Sub3(Class178_Sub2 class178_sub2, int i, int i_156_, boolean bool, boolean bool_157_) {
		anInt9796 = 0;
		anInt9794 = 0;
		anInt9792 = 0;
		anInt9788 = 0;
		aClass178_Sub2_9797 = class178_sub2;
		anInt9790 = i;
		anInt9791 = i_156_;
		if (bool_157_) {
			Interface41 interface41 = class178_sub2.method14999((bool ? Class158.aClass158_1743 : Class158.aClass158_1752), Class170.aClass170_1822, i, i_156_);
			anInterface22_9789 = interface41.method279(0);
			anInterface37_9793 = interface41;
		} else {
			anInterface37_9793 = class178_sub2.method15083((bool ? Class158.aClass158_1743 : Class158.aClass158_1752), Class170.aClass170_1822, i, i_156_);
			anInterface22_9789 = null;
		}
		anInterface37_9793.method239(true, true);
		aBool9795 = anInterface37_9793.method1() != i;
		aBool9787 = anInterface37_9793.method82() != i_156_;
		aBool9799 = !aBool9795 && anInterface37_9793.method217();
		aBool9800 = !aBool9787 && anInterface37_9793.method217();
	}

	public void method2486(int i, int i_158_, int i_159_, int i_160_, int i_161_) {
		if (aClass178_Sub2_9797.method14942() != Class348.aClass348_3636) {
			i += anInt9794;
			i_158_ += anInt9796;
			aClass178_Sub2_9797.aClass356_9639.method6244((float) i, (float) i_158_, (float) (i + anInt9790), (float) (i_158_ + anInt9791), 0.0F, 0.0F, anInterface37_9793.method220(), anInterface37_9793.method227(), anInterface37_9793, i_160_);
		} else {
			aClass178_Sub2_9797.method14971();
			aClass178_Sub2_9797.method15018(i_161_);
			Class327 class327 = aClass178_Sub2_9797.aClass327_9613;
			class327.anInterface37_3464 = anInterface37_9793;
			class327.method5751(i_159_, i_160_);
			i += anInt9794;
			i_158_ += anInt9796;
			float f = (float) aClass178_Sub2_9797.method3039(2115706483).method2875();
			float f_162_ = (float) aClass178_Sub2_9797.method3039(2100999004).method2874();
			class327.aClass441_3466.method7093((float) anInt9790 * 2.0F / f, ((float) anInt9791 * 2.0F / f_162_), 1.0F, 1.0F);
			class327.aClass441_3466.aFloatArray4916[12] = (((float) i + aClass178_Sub2_9797.method15089()) * 2.0F / f - 1.0F);
			class327.aClass441_3466.aFloatArray4916[13] = (((float) i_158_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_162_) - 1.0F;
			class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
			class327.aClass441_3467.method7093(anInterface37_9793.method261((float) anInt9790), anInterface37_9793.method218((float) anInt9791), 1.0F, 1.0F);
			class327.anInterface36_3468 = aClass178_Sub2_9797.anInterface36_9691;
			class327.anInt3463 = 0;
			class327.aClass345_3471 = aClass178_Sub2_9797.aClass345_9694;
			class327.method5753();
		}
	}

	public void method2481(int i, int i_163_, int i_164_, int i_165_, int i_166_, int i_167_) {
		anInterface37_9793.method225(i, i_163_, i_164_, i_165_, i_166_, i_167_);
	}

	public void method2462(int i, int i_168_, int i_169_) {
		int[] is = aClass178_Sub2_9797.method3293(i, i_168_, anInt9790, anInt9791);
		int[] is_170_ = new int[anInt9790 * anInt9791];
		anInterface37_9793.method223(0, 0, anInt9790, anInt9791, is_170_, 0);
		if (i_169_ == 0) {
			for (int i_171_ = 0; i_171_ < anInt9791; i_171_++) {
				int i_172_ = i_171_ * anInt9790;
				for (int i_173_ = 0; i_173_ < anInt9790; i_173_++)
					is_170_[i_172_ + i_173_] = (is_170_[i_172_ + i_173_] & 0xffffff | is[i_172_ + i_173_] << 8 & ~0xffffff);
			}
		} else if (i_169_ == 1) {
			for (int i_174_ = 0; i_174_ < anInt9791; i_174_++) {
				int i_175_ = i_174_ * anInt9790;
				for (int i_176_ = 0; i_176_ < anInt9790; i_176_++)
					is_170_[i_175_ + i_176_] = (is_170_[i_175_ + i_176_] & 0xffffff | is[i_175_ + i_176_] << 16 & ~0xffffff);
			}
		} else if (i_169_ == 2) {
			for (int i_177_ = 0; i_177_ < anInt9791; i_177_++) {
				int i_178_ = i_177_ * anInt9790;
				for (int i_179_ = 0; i_179_ < anInt9790; i_179_++)
					is_170_[i_178_ + i_179_] = (is_170_[i_178_ + i_179_] & 0xffffff | is[i_178_ + i_179_] << 24 & ~0xffffff);
			}
		} else if (i_169_ == 3) {
			for (int i_180_ = 0; i_180_ < anInt9791; i_180_++) {
				int i_181_ = i_180_ * anInt9790;
				for (int i_182_ = 0; i_182_ < anInt9790; i_182_++)
					is_170_[i_181_ + i_182_] = (is_170_[i_181_ + i_182_] & 0xffffff | (is[i_181_ + i_182_] != 0 ? -16777216 : 0));
			}
		}
		method2431(0, 0, anInt9790, anInt9791, is_170_, 0, anInt9790);
	}

	void method2427(float f, float f_183_, float f_184_, float f_185_, float f_186_, float f_187_, int i, int i_188_, int i_189_, int i_190_) {
		if (aClass178_Sub2_9797.method14942() != Class348.aClass348_3636)
			aClass178_Sub2_9797.aClass356_9639.method6269(f, f_183_, f_184_, f_185_, f_186_, f_187_, f_184_ + f_186_ - f, f_185_ + f_187_ - f_183_, 0.0F, 0.0F, anInterface37_9793.method220(), 0.0F, 0.0F, anInterface37_9793.method227(), anInterface37_9793.method220(), anInterface37_9793.method227(), anInterface37_9793, i_188_);
		else {
			aClass178_Sub2_9797.method14971();
			aClass178_Sub2_9797.method15018(i_189_);
			if (aBool9798) {
				float f_191_ = (float) method38();
				float f_192_ = (float) method2429();
				float f_193_ = (f_184_ - f) / f_191_;
				float f_194_ = (f_185_ - f_183_) / f_191_;
				float f_195_ = (f_186_ - f) / f_192_;
				float f_196_ = (f_187_ - f_183_) / f_192_;
				float f_197_ = f_195_ * (float) anInt9796;
				float f_198_ = f_196_ * (float) anInt9796;
				float f_199_ = f_193_ * (float) anInt9794;
				float f_200_ = f_194_ * (float) anInt9794;
				float f_201_ = -f_193_ * (float) anInt9788;
				float f_202_ = -f_194_ * (float) anInt9788;
				float f_203_ = -f_195_ * (float) anInt9792;
				float f_204_ = -f_196_ * (float) anInt9792;
				f = f + f_199_ + f_197_;
				f_183_ = f_183_ + f_200_ + f_198_;
				f_184_ = f_184_ + f_201_ + f_197_;
				f_185_ = f_185_ + f_202_ + f_198_;
				f_186_ = f_186_ + f_199_ + f_203_;
				f_187_ = f_187_ + f_200_ + f_204_;
			}
			Class327 class327 = aClass178_Sub2_9797.aClass327_9613;
			class327.anInterface37_3464 = anInterface37_9793;
			class327.method5751(i, i_188_);
			float f_205_ = (float) aClass178_Sub2_9797.method3039(1615959590).method2875();
			float f_206_ = (float) aClass178_Sub2_9797.method3039(1904819614).method2874();
			class327.aClass441_3466.method7085();
			class327.aClass441_3466.aFloatArray4916[0] = (f_184_ - f) * 2.0F / f_205_;
			class327.aClass441_3466.aFloatArray4916[1] = (f_185_ - f_183_) * 2.0F / f_206_;
			class327.aClass441_3466.aFloatArray4916[4] = (f_186_ - f) * 2.0F / f_205_;
			class327.aClass441_3466.aFloatArray4916[5] = (f_187_ - f_183_) * 2.0F / f_206_;
			class327.aClass441_3466.aFloatArray4916[12] = ((f + aClass178_Sub2_9797.method15089()) * 2.0F / f_205_ - 1.0F);
			class327.aClass441_3466.aFloatArray4916[13] = ((f_183_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_206_ - 1.0F);
			class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
			class327.aClass441_3467.method7093(anInterface37_9793.method261((float) anInt9790), anInterface37_9793.method218((float) anInt9791), 1.0F, 1.0F);
			class327.anInterface36_3468 = aClass178_Sub2_9797.anInterface36_9691;
			class327.anInt3463 = 0;
			class327.aClass345_3471 = aClass178_Sub2_9797.aClass345_9694;
			class327.method5753();
		}
	}

	public void method2426(int i, int i_207_, int i_208_, int i_209_) {
		anInt9794 = i;
		anInt9796 = i_207_;
		anInt9788 = i_208_;
		anInt9792 = i_209_;
		aBool9798 = (anInt9794 != 0 || anInt9796 != 0 || anInt9788 != 0 || anInt9792 != 0);
	}

	void method2495(float f, float f_210_, float f_211_, float f_212_, float f_213_, float f_214_, int i, Class145 class145, int i_215_, int i_216_) {
		aClass178_Sub2_9797.method14971();
		Class327 class327 = aClass178_Sub2_9797.aClass327_9613;
		class327.anInterface37_3464 = anInterface37_9793;
		class327.method5751(1, -1);
		float f_217_ = (float) aClass178_Sub2_9797.method3039(1609933122).method2875();
		float f_218_ = (float) aClass178_Sub2_9797.method3039(1919759823).method2874();
		class327.aClass441_3466.method7085();
		if (aBool9798) {
			float f_219_ = (float) anInt9790 / (float) method38();
			float f_220_ = (float) anInt9791 / (float) method2429();
			class327.aClass441_3466.aFloatArray4916[0] = (f_211_ - f) * f_219_;
			class327.aClass441_3466.aFloatArray4916[1] = (f_212_ - f_210_) * f_219_;
			class327.aClass441_3466.aFloatArray4916[4] = (f_213_ - f) * f_220_;
			class327.aClass441_3466.aFloatArray4916[5] = (f_214_ - f_210_) * f_220_;
			class327.aClass441_3466.aFloatArray4916[12] = ((f + (float) anInt9794) * f_219_ + aClass178_Sub2_9797.method15089());
			class327.aClass441_3466.aFloatArray4916[13] = ((f_210_ + (float) anInt9796) * f_220_ + aClass178_Sub2_9797.method15089());
		} else {
			class327.aClass441_3466.aFloatArray4916[0] = f_211_ - f;
			class327.aClass441_3466.aFloatArray4916[1] = f_212_ - f_210_;
			class327.aClass441_3466.aFloatArray4916[4] = f_213_ - f;
			class327.aClass441_3466.aFloatArray4916[5] = f_214_ - f_210_;
			class327.aClass441_3466.aFloatArray4916[12] = f + aClass178_Sub2_9797.method15089();
			class327.aClass441_3466.aFloatArray4916[13] = f_210_ + aClass178_Sub2_9797.method15089();
		}
		Class441 class441 = aClass178_Sub2_9797.aClass441_9560;
		class441.method7085();
		class441.aFloatArray4916[0] = 2.0F / f_217_;
		class441.aFloatArray4916[5] = 2.0F / f_218_;
		class441.aFloatArray4916[12] = -1.0F;
		class441.aFloatArray4916[13] = -1.0F;
		class441.aFloatArray4916[14] = -1.0F;
		class327.aClass441_3466.method7089(class441);
		class327.aClass441_3467.method7093(anInterface37_9793.method261((float) anInt9790), anInterface37_9793.method218((float) anInt9791), 1.0F, 1.0F);
		class327.anInterface36_3468 = aClass178_Sub2_9797.anInterface36_9691;
		class327.anInt3463 = 0;
		class327.aClass345_3471 = aClass178_Sub2_9797.aClass345_9694;
		Interface37 interface37 = ((Class145_Sub2) class145).anInterface37_9740;
		class327.anInterface37_3469 = interface37;
		class327.aClass441_3465.method7085();
		class327.aClass441_3465.aFloatArray4916[0] = (f_211_ - f) * interface37.method261(1.0F);
		class327.aClass441_3465.aFloatArray4916[1] = (f_212_ - f_210_) * interface37.method261(1.0F);
		class327.aClass441_3465.aFloatArray4916[4] = (f_213_ - f) * interface37.method218(1.0F);
		class327.aClass441_3465.aFloatArray4916[5] = (f_214_ - f_210_) * interface37.method218(1.0F);
		class327.aClass441_3465.aFloatArray4916[12] = (f - (float) i_215_) * interface37.method261(1.0F);
		class327.aClass441_3465.aFloatArray4916[13] = (f_210_ - (float) i_216_) * interface37.method218(1.0F);
		class327.method5754();
	}

	public void method2466(int i, int i_221_, Class145 class145, int i_222_, int i_223_) {
		aClass178_Sub2_9797.method14971();
		Class327 class327 = aClass178_Sub2_9797.aClass327_9613;
		class327.anInterface37_3464 = anInterface37_9793;
		class327.method5751(1, -1);
		i += anInt9794;
		i_221_ += anInt9796;
		float f = (float) aClass178_Sub2_9797.method3039(1700587063).method2875();
		float f_224_ = (float) aClass178_Sub2_9797.method3039(1915619301).method2874();
		class327.aClass441_3466.method7093((float) anInt9790 * 2.0F / f, (float) anInt9791 * 2.0F / f_224_, 1.0F, 1.0F);
		class327.aClass441_3466.aFloatArray4916[12] = (((float) i + aClass178_Sub2_9797.method15089()) * 2.0F / f - 1.0F);
		class327.aClass441_3466.aFloatArray4916[13] = (((float) i_221_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_224_) - 1.0F;
		class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
		class327.aClass441_3467.method7093(anInterface37_9793.method261((float) anInt9790), anInterface37_9793.method218((float) anInt9791), 1.0F, 1.0F);
		class327.anInterface36_3468 = aClass178_Sub2_9797.anInterface36_9691;
		class327.anInt3463 = 0;
		class327.aClass345_3471 = aClass178_Sub2_9797.aClass345_9694;
		Interface37 interface37 = ((Class145_Sub2) class145).anInterface37_9740;
		class327.anInterface37_3469 = interface37;
		class327.aClass441_3465.method7093(interface37.method261((float) anInt9790), interface37.method218((float) anInt9791), 1.0F, 1.0F);
		class327.aClass441_3465.aFloatArray4916[12] = interface37.method261((float) (i - i_222_));
		class327.aClass441_3465.aFloatArray4916[13] = interface37.method218((float) (i_221_ - i_223_));
		class327.method5754();
	}

	public void method2467(int i, int i_225_, Class145 class145, int i_226_, int i_227_) {
		aClass178_Sub2_9797.method14971();
		Class327 class327 = aClass178_Sub2_9797.aClass327_9613;
		class327.anInterface37_3464 = anInterface37_9793;
		class327.method5751(1, -1);
		i += anInt9794;
		i_225_ += anInt9796;
		float f = (float) aClass178_Sub2_9797.method3039(1768432669).method2875();
		float f_228_ = (float) aClass178_Sub2_9797.method3039(1497850203).method2874();
		class327.aClass441_3466.method7093((float) anInt9790 * 2.0F / f, (float) anInt9791 * 2.0F / f_228_, 1.0F, 1.0F);
		class327.aClass441_3466.aFloatArray4916[12] = (((float) i + aClass178_Sub2_9797.method15089()) * 2.0F / f - 1.0F);
		class327.aClass441_3466.aFloatArray4916[13] = (((float) i_225_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_228_) - 1.0F;
		class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
		class327.aClass441_3467.method7093(anInterface37_9793.method261((float) anInt9790), anInterface37_9793.method218((float) anInt9791), 1.0F, 1.0F);
		class327.anInterface36_3468 = aClass178_Sub2_9797.anInterface36_9691;
		class327.anInt3463 = 0;
		class327.aClass345_3471 = aClass178_Sub2_9797.aClass345_9694;
		Interface37 interface37 = ((Class145_Sub2) class145).anInterface37_9740;
		class327.anInterface37_3469 = interface37;
		class327.aClass441_3465.method7093(interface37.method261((float) anInt9790), interface37.method218((float) anInt9791), 1.0F, 1.0F);
		class327.aClass441_3465.aFloatArray4916[12] = interface37.method261((float) (i - i_226_));
		class327.aClass441_3465.aFloatArray4916[13] = interface37.method218((float) (i_225_ - i_227_));
		class327.method5754();
	}

	public int method2478() {
		return anInt9791;
	}

	void method2449(float f, float f_229_, float f_230_, float f_231_, float f_232_, float f_233_, int i, int i_234_, int i_235_, int i_236_) {
		if (aClass178_Sub2_9797.method14942() != Class348.aClass348_3636)
			aClass178_Sub2_9797.aClass356_9639.method6269(f, f_229_, f_230_, f_231_, f_232_, f_233_, f_230_ + f_232_ - f, f_231_ + f_233_ - f_229_, 0.0F, 0.0F, anInterface37_9793.method220(), 0.0F, 0.0F, anInterface37_9793.method227(), anInterface37_9793.method220(), anInterface37_9793.method227(), anInterface37_9793, i_234_);
		else {
			aClass178_Sub2_9797.method14971();
			aClass178_Sub2_9797.method15018(i_235_);
			if (aBool9798) {
				float f_237_ = (float) method38();
				float f_238_ = (float) method2429();
				float f_239_ = (f_230_ - f) / f_237_;
				float f_240_ = (f_231_ - f_229_) / f_237_;
				float f_241_ = (f_232_ - f) / f_238_;
				float f_242_ = (f_233_ - f_229_) / f_238_;
				float f_243_ = f_241_ * (float) anInt9796;
				float f_244_ = f_242_ * (float) anInt9796;
				float f_245_ = f_239_ * (float) anInt9794;
				float f_246_ = f_240_ * (float) anInt9794;
				float f_247_ = -f_239_ * (float) anInt9788;
				float f_248_ = -f_240_ * (float) anInt9788;
				float f_249_ = -f_241_ * (float) anInt9792;
				float f_250_ = -f_242_ * (float) anInt9792;
				f = f + f_245_ + f_243_;
				f_229_ = f_229_ + f_246_ + f_244_;
				f_230_ = f_230_ + f_247_ + f_243_;
				f_231_ = f_231_ + f_248_ + f_244_;
				f_232_ = f_232_ + f_245_ + f_249_;
				f_233_ = f_233_ + f_246_ + f_250_;
			}
			Class327 class327 = aClass178_Sub2_9797.aClass327_9613;
			class327.anInterface37_3464 = anInterface37_9793;
			class327.method5751(i, i_234_);
			float f_251_ = (float) aClass178_Sub2_9797.method3039(2066644829).method2875();
			float f_252_ = (float) aClass178_Sub2_9797.method3039(1809574233).method2874();
			class327.aClass441_3466.method7085();
			class327.aClass441_3466.aFloatArray4916[0] = (f_230_ - f) * 2.0F / f_251_;
			class327.aClass441_3466.aFloatArray4916[1] = (f_231_ - f_229_) * 2.0F / f_252_;
			class327.aClass441_3466.aFloatArray4916[4] = (f_232_ - f) * 2.0F / f_251_;
			class327.aClass441_3466.aFloatArray4916[5] = (f_233_ - f_229_) * 2.0F / f_252_;
			class327.aClass441_3466.aFloatArray4916[12] = ((f + aClass178_Sub2_9797.method15089()) * 2.0F / f_251_ - 1.0F);
			class327.aClass441_3466.aFloatArray4916[13] = ((f_229_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_252_ - 1.0F);
			class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
			class327.aClass441_3467.method7093(anInterface37_9793.method261((float) anInt9790), anInterface37_9793.method218((float) anInt9791), 1.0F, 1.0F);
			class327.anInterface36_3468 = aClass178_Sub2_9797.anInterface36_9691;
			class327.anInt3463 = 0;
			class327.aClass345_3471 = aClass178_Sub2_9797.aClass345_9694;
			class327.method5753();
		}
	}

	public Interface22 method2470() {
		return anInterface22_9789;
	}

	public void method2459(int i, int i_253_, int i_254_, int i_255_, int[] is, int[] is_256_, int i_257_, int i_258_) {
		anInterface37_9793.method235(i, i_253_, i_254_, i_255_, is, is_256_, i_257_);
	}

	public void method2472(int i, int i_259_, int i_260_, int i_261_) {
		anInt9794 = i;
		anInt9796 = i_259_;
		anInt9788 = i_260_;
		anInt9792 = i_261_;
		aBool9798 = (anInt9794 != 0 || anInt9796 != 0 || anInt9788 != 0 || anInt9792 != 0);
	}

	public int method2465() {
		return anInt9791 + anInt9796 + anInt9792;
	}

	public void method2442(int[] is) {
		is[0] = anInt9794;
		is[1] = anInt9796;
		is[2] = anInt9788;
		is[3] = anInt9792;
	}

	public void method2458(int[] is) {
		is[0] = anInt9794;
		is[1] = anInt9796;
		is[2] = anInt9788;
		is[3] = anInt9792;
	}

	public void method2476(int[] is) {
		is[0] = anInt9794;
		is[1] = anInt9796;
		is[2] = anInt9788;
		is[3] = anInt9792;
	}

	public int method2477() {
		return anInt9790;
	}

	public void method2436(int i, int i_262_, int i_263_, int i_264_, int i_265_) {
		if (aClass178_Sub2_9797.method14942() != Class348.aClass348_3636) {
			i += anInt9794;
			i_262_ += anInt9796;
			aClass178_Sub2_9797.aClass356_9639.method6244((float) i, (float) i_262_, (float) (i + anInt9790), (float) (i_262_ + anInt9791), 0.0F, 0.0F, anInterface37_9793.method220(), anInterface37_9793.method227(), anInterface37_9793, i_264_);
		} else {
			aClass178_Sub2_9797.method14971();
			aClass178_Sub2_9797.method15018(i_265_);
			Class327 class327 = aClass178_Sub2_9797.aClass327_9613;
			class327.anInterface37_3464 = anInterface37_9793;
			class327.method5751(i_263_, i_264_);
			i += anInt9794;
			i_262_ += anInt9796;
			float f = (float) aClass178_Sub2_9797.method3039(1768622071).method2875();
			float f_266_ = (float) aClass178_Sub2_9797.method3039(2067073846).method2874();
			class327.aClass441_3466.method7093((float) anInt9790 * 2.0F / f, ((float) anInt9791 * 2.0F / f_266_), 1.0F, 1.0F);
			class327.aClass441_3466.aFloatArray4916[12] = (((float) i + aClass178_Sub2_9797.method15089()) * 2.0F / f - 1.0F);
			class327.aClass441_3466.aFloatArray4916[13] = (((float) i_262_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_266_) - 1.0F;
			class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
			class327.aClass441_3467.method7093(anInterface37_9793.method261((float) anInt9790), anInterface37_9793.method218((float) anInt9791), 1.0F, 1.0F);
			class327.anInterface36_3468 = aClass178_Sub2_9797.anInterface36_9691;
			class327.anInt3463 = 0;
			class327.aClass345_3471 = aClass178_Sub2_9797.aClass345_9694;
			class327.method5753();
		}
	}

	public int method2479() {
		return anInt9791;
	}

	public int method2485() {
		return anInt9791;
	}

	public int method39() {
		return anInt9790 + anInt9794 + anInt9788;
	}

	public int method40() {
		return anInt9790 + anInt9794 + anInt9788;
	}

	public int method37() {
		return anInt9790 + anInt9794 + anInt9788;
	}

	public Interface22 method2430() {
		return anInterface22_9789;
	}

	public void method2463(int i, int i_267_, int i_268_, int i_269_, int i_270_) {
		if (aClass178_Sub2_9797.method14942() != Class348.aClass348_3636) {
			i += anInt9794;
			i_267_ += anInt9796;
			aClass178_Sub2_9797.aClass356_9639.method6244((float) i, (float) i_267_, (float) (i + anInt9790), (float) (i_267_ + anInt9791), 0.0F, 0.0F, anInterface37_9793.method220(), anInterface37_9793.method227(), anInterface37_9793, i_269_);
		} else {
			aClass178_Sub2_9797.method14971();
			aClass178_Sub2_9797.method15018(i_270_);
			Class327 class327 = aClass178_Sub2_9797.aClass327_9613;
			class327.anInterface37_3464 = anInterface37_9793;
			class327.method5751(i_268_, i_269_);
			i += anInt9794;
			i_267_ += anInt9796;
			float f = (float) aClass178_Sub2_9797.method3039(1642139696).method2875();
			float f_271_ = (float) aClass178_Sub2_9797.method3039(1934445985).method2874();
			class327.aClass441_3466.method7093((float) anInt9790 * 2.0F / f, ((float) anInt9791 * 2.0F / f_271_), 1.0F, 1.0F);
			class327.aClass441_3466.aFloatArray4916[12] = (((float) i + aClass178_Sub2_9797.method15089()) * 2.0F / f - 1.0F);
			class327.aClass441_3466.aFloatArray4916[13] = (((float) i_267_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_271_) - 1.0F;
			class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
			class327.aClass441_3467.method7093(anInterface37_9793.method261((float) anInt9790), anInterface37_9793.method218((float) anInt9791), 1.0F, 1.0F);
			class327.anInterface36_3468 = aClass178_Sub2_9797.anInterface36_9691;
			class327.anInt3463 = 0;
			class327.aClass345_3471 = aClass178_Sub2_9797.aClass345_9694;
			class327.method5753();
		}
	}

	public void method2484(int i, int i_272_, int i_273_, int i_274_, int i_275_, int i_276_, int i_277_) {
		if (aClass178_Sub2_9797.method14942() != Class348.aClass348_3636) {
			int i_278_ = i_272_ + i_274_;
			int i_279_ = i + i_273_;
			int i_280_ = method38();
			int i_281_ = method2429();
			int i_282_ = i_272_ + anInt9796;
			for (int i_283_ = i_282_ + anInt9791; i_283_ <= i_278_; i_283_ += i_281_) {
				int i_284_ = i + anInt9794;
				for (int i_285_ = i_284_ + anInt9790; i_285_ <= i_279_; i_285_ += i_280_) {
					aClass178_Sub2_9797.aClass356_9639.method6244((float) i_284_, (float) i_282_, (float) (i_284_ + anInt9790), (float) (i_282_ + anInt9791), 0.0F, 0.0F, anInterface37_9793.method220(), anInterface37_9793.method227(), anInterface37_9793, i_276_);
					i_284_ += i_280_;
				}
				if (i_284_ < i_279_) {
					int i_286_ = i_279_ - i_284_;
					aClass178_Sub2_9797.aClass356_9639.method6244((float) i_284_, (float) i_282_, (float) (i_284_ + i_286_), (float) (i_282_ + anInt9791), 0.0F, 0.0F, ((float) i_286_ / (float) anInt9790 * anInterface37_9793.method220()), anInterface37_9793.method227(), anInterface37_9793, i_276_);
				}
				i_282_ += i_281_;
			}
			if (i_282_ < i_278_) {
				int i_287_ = i_278_ - i_282_;
				float f = ((float) i_287_ / (float) anInt9791 * anInterface37_9793.method227());
				int i_288_ = i + anInt9794;
				for (int i_289_ = i_288_ + anInt9790; i_289_ <= i_279_; i_289_ += i_280_) {
					aClass178_Sub2_9797.aClass356_9639.method6244((float) i_288_, (float) i_282_, (float) (i_288_ + anInt9790), (float) (i_282_ + i_287_), 0.0F, 0.0F, anInterface37_9793.method220(), f, anInterface37_9793, i_276_);
					i_288_ += i_280_;
				}
				if (i_288_ < i_279_) {
					int i_290_ = i_279_ - i_288_;
					aClass178_Sub2_9797.aClass356_9639.method6244((float) i_288_, (float) i_282_, (float) (i_288_ + i_290_), (float) (i_282_ + i_287_), 0.0F, 0.0F, ((float) i_290_ / (float) anInt9790 * anInterface37_9793.method220()), f, anInterface37_9793, i_276_);
				}
			}
		} else {
			aClass178_Sub2_9797.method14971();
			aClass178_Sub2_9797.method15018(i_277_);
			Class327 class327 = aClass178_Sub2_9797.aClass327_9613;
			class327.anInterface37_3464 = anInterface37_9793;
			class327.method5751(i_275_, i_276_);
			float f = (float) aClass178_Sub2_9797.method3039(2118613712).method2875();
			float f_291_ = (float) aClass178_Sub2_9797.method3039(1967598707).method2874();
			class327.anInterface36_3468 = aClass178_Sub2_9797.anInterface36_9691;
			class327.anInt3463 = 0;
			class327.aClass345_3471 = aClass178_Sub2_9797.aClass345_9694;
			boolean bool = aBool9800 && anInt9796 == 0 && anInt9792 == 0;
			boolean bool_292_ = aBool9799 && anInt9794 == 0 && anInt9788 == 0;
			if (bool_292_ & bool) {
				class327.aClass441_3466.method7093((float) i_273_ * 2.0F / f, ((float) i_274_ * 2.0F / f_291_), 1.0F, 1.0F);
				class327.aClass441_3466.aFloatArray4916[12] = (((float) i + aClass178_Sub2_9797.method15089()) * 2.0F / f) - 1.0F;
				class327.aClass441_3466.aFloatArray4916[13] = (((float) i_272_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_291_) - 1.0F;
				class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
				class327.aClass441_3467.method7093(anInterface37_9793.method261((float) i_273_), anInterface37_9793.method218((float) i_274_), 1.0F, 1.0F);
				class327.method5753();
			} else if (bool_292_) {
				int i_293_ = i_272_ + i_274_;
				int i_294_ = method2429();
				class327.aClass441_3467.method7093(anInterface37_9793.method261((float) i_273_), anInterface37_9793.method218((float) anInt9791), 1.0F, 1.0F);
				int i_295_ = i_272_ + anInt9796;
				for (int i_296_ = i_295_ + anInt9791; i_296_ <= i_293_; i_296_ += i_294_) {
					class327.aClass441_3466.method7093(((float) i_273_ * 2.0F / f), ((float) anInt9791 * 2.0F / f_291_), 1.0F, 1.0F);
					class327.aClass441_3466.aFloatArray4916[12] = (((float) i + aClass178_Sub2_9797.method15089()) * 2.0F / f) - 1.0F;
					class327.aClass441_3466.aFloatArray4916[13] = (((float) i_295_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_291_) - 1.0F;
					class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
					class327.method5753();
					i_295_ += i_294_;
				}
				if (i_295_ < i_293_) {
					int i_297_ = i_293_ - i_295_;
					class327.aClass441_3467.method7093(anInterface37_9793.method261((float) i_273_), anInterface37_9793.method218((float) i_297_), 1.0F, 1.0F);
					class327.aClass441_3466.method7093(((float) i_273_ * 2.0F / f), ((float) i_297_ * 2.0F / f_291_), 1.0F, 1.0F);
					class327.aClass441_3466.aFloatArray4916[12] = (((float) i + aClass178_Sub2_9797.method15089()) * 2.0F / f) - 1.0F;
					class327.aClass441_3466.aFloatArray4916[13] = (((float) i_295_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_291_) - 1.0F;
					class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
					class327.method5753();
				}
			} else if (bool) {
				int i_298_ = i + i_273_;
				int i_299_ = method38();
				class327.aClass441_3467.method7093(anInterface37_9793.method261((float) anInt9790), anInterface37_9793.method218((float) i_274_), 1.0F, 1.0F);
				int i_300_ = i + anInt9794;
				for (int i_301_ = i_300_ + anInt9790; i_301_ <= i_298_; i_301_ += i_299_) {
					class327.aClass441_3466.method7093(((float) anInt9790 * 2.0F / f), ((float) i_274_ * 2.0F / f_291_), 1.0F, 1.0F);
					class327.aClass441_3466.aFloatArray4916[12] = (((float) i_300_ + aClass178_Sub2_9797.method15089()) * 2.0F / f) - 1.0F;
					class327.aClass441_3466.aFloatArray4916[13] = (((float) i_272_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_291_) - 1.0F;
					class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
					class327.method5753();
					i_300_ += i_299_;
				}
				if (i_300_ < i_298_) {
					int i_302_ = i_298_ - i_300_;
					class327.aClass441_3467.method7093(anInterface37_9793.method261((float) i_302_), anInterface37_9793.method218((float) i_274_), 1.0F, 1.0F);
					class327.aClass441_3466.method7093(((float) i_302_ * 2.0F / f), ((float) i_274_ * 2.0F / f_291_), 1.0F, 1.0F);
					class327.aClass441_3466.aFloatArray4916[12] = (((float) i_300_ + aClass178_Sub2_9797.method15089()) * 2.0F / f) - 1.0F;
					class327.aClass441_3466.aFloatArray4916[13] = (((float) i_272_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_291_) - 1.0F;
					class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
					class327.method5753();
				}
			} else {
				int i_303_ = i_272_ + i_274_;
				int i_304_ = i + i_273_;
				int i_305_ = method38();
				int i_306_ = method2429();
				int i_307_ = i_272_ + anInt9796;
				for (int i_308_ = i_307_ + anInt9791; i_308_ <= i_303_; i_308_ += i_306_) {
					class327.aClass441_3467.method7093(anInterface37_9793.method261((float) anInt9790), anInterface37_9793.method218((float) anInt9791), 1.0F, 1.0F);
					int i_309_ = i + anInt9794;
					for (int i_310_ = i_309_ + anInt9790; i_310_ <= i_304_; i_310_ += i_305_) {
						class327.aClass441_3466.method7093(((float) anInt9790 * 2.0F / f), ((float) anInt9791 * 2.0F / f_291_), 1.0F, 1.0F);
						class327.aClass441_3466.aFloatArray4916[12] = (((float) i_309_ + aClass178_Sub2_9797.method15089()) * 2.0F / f - 1.0F);
						class327.aClass441_3466.aFloatArray4916[13] = (((float) i_307_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_291_) - 1.0F;
						class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
						class327.method5753();
						i_309_ += i_305_;
					}
					if (i_309_ < i_304_) {
						int i_311_ = i_304_ - i_309_;
						class327.aClass441_3467.method7093(anInterface37_9793.method261((float) i_311_), anInterface37_9793.method218((float) anInt9791), 1.0F, 1.0F);
						class327.aClass441_3466.method7093(((float) i_311_ * 2.0F / f), ((float) anInt9791 * 2.0F / f_291_), 1.0F, 1.0F);
						class327.aClass441_3466.aFloatArray4916[12] = (((float) i_309_ + aClass178_Sub2_9797.method15089()) * 2.0F / f - 1.0F);
						class327.aClass441_3466.aFloatArray4916[13] = (((float) i_307_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_291_) - 1.0F;
						class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
						class327.method5753();
					}
					i_307_ += i_306_;
				}
				if (i_307_ < i_303_) {
					int i_312_ = i_303_ - i_307_;
					class327.aClass441_3467.method7093(anInterface37_9793.method261((float) anInt9790), anInterface37_9793.method218((float) i_312_), 1.0F, 1.0F);
					int i_313_ = i + anInt9794;
					for (int i_314_ = i_313_ + anInt9790; i_314_ <= i_304_; i_314_ += i_305_) {
						class327.aClass441_3466.method7093(((float) anInt9790 * 2.0F / f), ((float) i_312_ * 2.0F / f_291_), 1.0F, 1.0F);
						class327.aClass441_3466.aFloatArray4916[12] = (((float) i_313_ + aClass178_Sub2_9797.method15089()) * 2.0F / f - 1.0F);
						class327.aClass441_3466.aFloatArray4916[13] = (((float) i_307_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_291_) - 1.0F;
						class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
						class327.method5753();
						i_313_ += i_305_;
					}
					if (i_313_ < i_304_) {
						int i_315_ = i_304_ - i_313_;
						class327.aClass441_3467.method7093(anInterface37_9793.method261((float) i_315_), anInterface37_9793.method218((float) i_312_), 1.0F, 1.0F);
						class327.aClass441_3466.method7093(((float) i_315_ * 2.0F / f), ((float) i_312_ * 2.0F / f_291_), 1.0F, 1.0F);
						class327.aClass441_3466.aFloatArray4916[12] = (((float) i_313_ + aClass178_Sub2_9797.method15089()) * 2.0F / f - 1.0F);
						class327.aClass441_3466.aFloatArray4916[13] = (((float) i_307_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_291_) - 1.0F;
						class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
						class327.method5753();
					}
				}
			}
		}
	}

	public void method2424(int i, int i_316_, int i_317_, int i_318_, int i_319_, int i_320_, int i_321_) {
		if (aClass178_Sub2_9797.method14942() != Class348.aClass348_3636) {
			int i_322_ = i_316_ + i_318_;
			int i_323_ = i + i_317_;
			int i_324_ = method38();
			int i_325_ = method2429();
			int i_326_ = i_316_ + anInt9796;
			for (int i_327_ = i_326_ + anInt9791; i_327_ <= i_322_; i_327_ += i_325_) {
				int i_328_ = i + anInt9794;
				for (int i_329_ = i_328_ + anInt9790; i_329_ <= i_323_; i_329_ += i_324_) {
					aClass178_Sub2_9797.aClass356_9639.method6244((float) i_328_, (float) i_326_, (float) (i_328_ + anInt9790), (float) (i_326_ + anInt9791), 0.0F, 0.0F, anInterface37_9793.method220(), anInterface37_9793.method227(), anInterface37_9793, i_320_);
					i_328_ += i_324_;
				}
				if (i_328_ < i_323_) {
					int i_330_ = i_323_ - i_328_;
					aClass178_Sub2_9797.aClass356_9639.method6244((float) i_328_, (float) i_326_, (float) (i_328_ + i_330_), (float) (i_326_ + anInt9791), 0.0F, 0.0F, ((float) i_330_ / (float) anInt9790 * anInterface37_9793.method220()), anInterface37_9793.method227(), anInterface37_9793, i_320_);
				}
				i_326_ += i_325_;
			}
			if (i_326_ < i_322_) {
				int i_331_ = i_322_ - i_326_;
				float f = ((float) i_331_ / (float) anInt9791 * anInterface37_9793.method227());
				int i_332_ = i + anInt9794;
				for (int i_333_ = i_332_ + anInt9790; i_333_ <= i_323_; i_333_ += i_324_) {
					aClass178_Sub2_9797.aClass356_9639.method6244((float) i_332_, (float) i_326_, (float) (i_332_ + anInt9790), (float) (i_326_ + i_331_), 0.0F, 0.0F, anInterface37_9793.method220(), f, anInterface37_9793, i_320_);
					i_332_ += i_324_;
				}
				if (i_332_ < i_323_) {
					int i_334_ = i_323_ - i_332_;
					aClass178_Sub2_9797.aClass356_9639.method6244((float) i_332_, (float) i_326_, (float) (i_332_ + i_334_), (float) (i_326_ + i_331_), 0.0F, 0.0F, ((float) i_334_ / (float) anInt9790 * anInterface37_9793.method220()), f, anInterface37_9793, i_320_);
				}
			}
		} else {
			aClass178_Sub2_9797.method14971();
			aClass178_Sub2_9797.method15018(i_321_);
			Class327 class327 = aClass178_Sub2_9797.aClass327_9613;
			class327.anInterface37_3464 = anInterface37_9793;
			class327.method5751(i_319_, i_320_);
			float f = (float) aClass178_Sub2_9797.method3039(2017223566).method2875();
			float f_335_ = (float) aClass178_Sub2_9797.method3039(1581683179).method2874();
			class327.anInterface36_3468 = aClass178_Sub2_9797.anInterface36_9691;
			class327.anInt3463 = 0;
			class327.aClass345_3471 = aClass178_Sub2_9797.aClass345_9694;
			boolean bool = aBool9800 && anInt9796 == 0 && anInt9792 == 0;
			boolean bool_336_ = aBool9799 && anInt9794 == 0 && anInt9788 == 0;
			if (bool_336_ & bool) {
				class327.aClass441_3466.method7093((float) i_317_ * 2.0F / f, ((float) i_318_ * 2.0F / f_335_), 1.0F, 1.0F);
				class327.aClass441_3466.aFloatArray4916[12] = (((float) i + aClass178_Sub2_9797.method15089()) * 2.0F / f) - 1.0F;
				class327.aClass441_3466.aFloatArray4916[13] = (((float) i_316_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_335_) - 1.0F;
				class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
				class327.aClass441_3467.method7093(anInterface37_9793.method261((float) i_317_), anInterface37_9793.method218((float) i_318_), 1.0F, 1.0F);
				class327.method5753();
			} else if (bool_336_) {
				int i_337_ = i_316_ + i_318_;
				int i_338_ = method2429();
				class327.aClass441_3467.method7093(anInterface37_9793.method261((float) i_317_), anInterface37_9793.method218((float) anInt9791), 1.0F, 1.0F);
				int i_339_ = i_316_ + anInt9796;
				for (int i_340_ = i_339_ + anInt9791; i_340_ <= i_337_; i_340_ += i_338_) {
					class327.aClass441_3466.method7093(((float) i_317_ * 2.0F / f), ((float) anInt9791 * 2.0F / f_335_), 1.0F, 1.0F);
					class327.aClass441_3466.aFloatArray4916[12] = (((float) i + aClass178_Sub2_9797.method15089()) * 2.0F / f) - 1.0F;
					class327.aClass441_3466.aFloatArray4916[13] = (((float) i_339_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_335_) - 1.0F;
					class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
					class327.method5753();
					i_339_ += i_338_;
				}
				if (i_339_ < i_337_) {
					int i_341_ = i_337_ - i_339_;
					class327.aClass441_3467.method7093(anInterface37_9793.method261((float) i_317_), anInterface37_9793.method218((float) i_341_), 1.0F, 1.0F);
					class327.aClass441_3466.method7093(((float) i_317_ * 2.0F / f), ((float) i_341_ * 2.0F / f_335_), 1.0F, 1.0F);
					class327.aClass441_3466.aFloatArray4916[12] = (((float) i + aClass178_Sub2_9797.method15089()) * 2.0F / f) - 1.0F;
					class327.aClass441_3466.aFloatArray4916[13] = (((float) i_339_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_335_) - 1.0F;
					class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
					class327.method5753();
				}
			} else if (bool) {
				int i_342_ = i + i_317_;
				int i_343_ = method38();
				class327.aClass441_3467.method7093(anInterface37_9793.method261((float) anInt9790), anInterface37_9793.method218((float) i_318_), 1.0F, 1.0F);
				int i_344_ = i + anInt9794;
				for (int i_345_ = i_344_ + anInt9790; i_345_ <= i_342_; i_345_ += i_343_) {
					class327.aClass441_3466.method7093(((float) anInt9790 * 2.0F / f), ((float) i_318_ * 2.0F / f_335_), 1.0F, 1.0F);
					class327.aClass441_3466.aFloatArray4916[12] = (((float) i_344_ + aClass178_Sub2_9797.method15089()) * 2.0F / f) - 1.0F;
					class327.aClass441_3466.aFloatArray4916[13] = (((float) i_316_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_335_) - 1.0F;
					class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
					class327.method5753();
					i_344_ += i_343_;
				}
				if (i_344_ < i_342_) {
					int i_346_ = i_342_ - i_344_;
					class327.aClass441_3467.method7093(anInterface37_9793.method261((float) i_346_), anInterface37_9793.method218((float) i_318_), 1.0F, 1.0F);
					class327.aClass441_3466.method7093(((float) i_346_ * 2.0F / f), ((float) i_318_ * 2.0F / f_335_), 1.0F, 1.0F);
					class327.aClass441_3466.aFloatArray4916[12] = (((float) i_344_ + aClass178_Sub2_9797.method15089()) * 2.0F / f) - 1.0F;
					class327.aClass441_3466.aFloatArray4916[13] = (((float) i_316_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_335_) - 1.0F;
					class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
					class327.method5753();
				}
			} else {
				int i_347_ = i_316_ + i_318_;
				int i_348_ = i + i_317_;
				int i_349_ = method38();
				int i_350_ = method2429();
				int i_351_ = i_316_ + anInt9796;
				for (int i_352_ = i_351_ + anInt9791; i_352_ <= i_347_; i_352_ += i_350_) {
					class327.aClass441_3467.method7093(anInterface37_9793.method261((float) anInt9790), anInterface37_9793.method218((float) anInt9791), 1.0F, 1.0F);
					int i_353_ = i + anInt9794;
					for (int i_354_ = i_353_ + anInt9790; i_354_ <= i_348_; i_354_ += i_349_) {
						class327.aClass441_3466.method7093(((float) anInt9790 * 2.0F / f), ((float) anInt9791 * 2.0F / f_335_), 1.0F, 1.0F);
						class327.aClass441_3466.aFloatArray4916[12] = (((float) i_353_ + aClass178_Sub2_9797.method15089()) * 2.0F / f - 1.0F);
						class327.aClass441_3466.aFloatArray4916[13] = (((float) i_351_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_335_) - 1.0F;
						class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
						class327.method5753();
						i_353_ += i_349_;
					}
					if (i_353_ < i_348_) {
						int i_355_ = i_348_ - i_353_;
						class327.aClass441_3467.method7093(anInterface37_9793.method261((float) i_355_), anInterface37_9793.method218((float) anInt9791), 1.0F, 1.0F);
						class327.aClass441_3466.method7093(((float) i_355_ * 2.0F / f), ((float) anInt9791 * 2.0F / f_335_), 1.0F, 1.0F);
						class327.aClass441_3466.aFloatArray4916[12] = (((float) i_353_ + aClass178_Sub2_9797.method15089()) * 2.0F / f - 1.0F);
						class327.aClass441_3466.aFloatArray4916[13] = (((float) i_351_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_335_) - 1.0F;
						class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
						class327.method5753();
					}
					i_351_ += i_350_;
				}
				if (i_351_ < i_347_) {
					int i_356_ = i_347_ - i_351_;
					class327.aClass441_3467.method7093(anInterface37_9793.method261((float) anInt9790), anInterface37_9793.method218((float) i_356_), 1.0F, 1.0F);
					int i_357_ = i + anInt9794;
					for (int i_358_ = i_357_ + anInt9790; i_358_ <= i_348_; i_358_ += i_349_) {
						class327.aClass441_3466.method7093(((float) anInt9790 * 2.0F / f), ((float) i_356_ * 2.0F / f_335_), 1.0F, 1.0F);
						class327.aClass441_3466.aFloatArray4916[12] = (((float) i_357_ + aClass178_Sub2_9797.method15089()) * 2.0F / f - 1.0F);
						class327.aClass441_3466.aFloatArray4916[13] = (((float) i_351_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_335_) - 1.0F;
						class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
						class327.method5753();
						i_357_ += i_349_;
					}
					if (i_357_ < i_348_) {
						int i_359_ = i_348_ - i_357_;
						class327.aClass441_3467.method7093(anInterface37_9793.method261((float) i_359_), anInterface37_9793.method218((float) i_356_), 1.0F, 1.0F);
						class327.aClass441_3466.method7093(((float) i_359_ * 2.0F / f), ((float) i_356_ * 2.0F / f_335_), 1.0F, 1.0F);
						class327.aClass441_3466.aFloatArray4916[12] = (((float) i_357_ + aClass178_Sub2_9797.method15089()) * 2.0F / f - 1.0F);
						class327.aClass441_3466.aFloatArray4916[13] = (((float) i_351_ + aClass178_Sub2_9797.method15089()) * 2.0F / f_335_) - 1.0F;
						class327.aClass441_3466.aFloatArray4916[14] = -1.0F;
						class327.method5753();
					}
				}
			}
		}
	}

	public void method2457(int i, int i_360_, int i_361_, int i_362_) {
		anInt9794 = i;
		anInt9796 = i_360_;
		anInt9788 = i_361_;
		anInt9792 = i_362_;
		aBool9798 = (anInt9794 != 0 || anInt9796 != 0 || anInt9788 != 0 || anInt9792 != 0);
	}

	public void method2433(int i, int i_363_, int i_364_, int i_365_, int i_366_, int i_367_) {
		anInterface37_9793.method225(i, i_363_, i_364_, i_365_, i_366_, i_367_);
	}

	void method2487(float f, float f_368_, float f_369_, float f_370_, float f_371_, float f_372_, int i, Class145 class145, int i_373_, int i_374_) {
		aClass178_Sub2_9797.method14971();
		Class327 class327 = aClass178_Sub2_9797.aClass327_9613;
		class327.anInterface37_3464 = anInterface37_9793;
		class327.method5751(1, -1);
		float f_375_ = (float) aClass178_Sub2_9797.method3039(1950653236).method2875();
		float f_376_ = (float) aClass178_Sub2_9797.method3039(2112255744).method2874();
		class327.aClass441_3466.method7085();
		if (aBool9798) {
			float f_377_ = (float) anInt9790 / (float) method38();
			float f_378_ = (float) anInt9791 / (float) method2429();
			class327.aClass441_3466.aFloatArray4916[0] = (f_369_ - f) * f_377_;
			class327.aClass441_3466.aFloatArray4916[1] = (f_370_ - f_368_) * f_377_;
			class327.aClass441_3466.aFloatArray4916[4] = (f_371_ - f) * f_378_;
			class327.aClass441_3466.aFloatArray4916[5] = (f_372_ - f_368_) * f_378_;
			class327.aClass441_3466.aFloatArray4916[12] = ((f + (float) anInt9794) * f_377_ + aClass178_Sub2_9797.method15089());
			class327.aClass441_3466.aFloatArray4916[13] = ((f_368_ + (float) anInt9796) * f_378_ + aClass178_Sub2_9797.method15089());
		} else {
			class327.aClass441_3466.aFloatArray4916[0] = f_369_ - f;
			class327.aClass441_3466.aFloatArray4916[1] = f_370_ - f_368_;
			class327.aClass441_3466.aFloatArray4916[4] = f_371_ - f;
			class327.aClass441_3466.aFloatArray4916[5] = f_372_ - f_368_;
			class327.aClass441_3466.aFloatArray4916[12] = f + aClass178_Sub2_9797.method15089();
			class327.aClass441_3466.aFloatArray4916[13] = f_368_ + aClass178_Sub2_9797.method15089();
		}
		Class441 class441 = aClass178_Sub2_9797.aClass441_9560;
		class441.method7085();
		class441.aFloatArray4916[0] = 2.0F / f_375_;
		class441.aFloatArray4916[5] = 2.0F / f_376_;
		class441.aFloatArray4916[12] = -1.0F;
		class441.aFloatArray4916[13] = -1.0F;
		class441.aFloatArray4916[14] = -1.0F;
		class327.aClass441_3466.method7089(class441);
		class327.aClass441_3467.method7093(anInterface37_9793.method261((float) anInt9790), anInterface37_9793.method218((float) anInt9791), 1.0F, 1.0F);
		class327.anInterface36_3468 = aClass178_Sub2_9797.anInterface36_9691;
		class327.anInt3463 = 0;
		class327.aClass345_3471 = aClass178_Sub2_9797.aClass345_9694;
		Interface37 interface37 = ((Class145_Sub2) class145).anInterface37_9740;
		class327.anInterface37_3469 = interface37;
		class327.aClass441_3465.method7085();
		class327.aClass441_3465.aFloatArray4916[0] = (f_369_ - f) * interface37.method261(1.0F);
		class327.aClass441_3465.aFloatArray4916[1] = (f_370_ - f_368_) * interface37.method261(1.0F);
		class327.aClass441_3465.aFloatArray4916[4] = (f_371_ - f) * interface37.method218(1.0F);
		class327.aClass441_3465.aFloatArray4916[5] = (f_372_ - f_368_) * interface37.method218(1.0F);
		class327.aClass441_3465.aFloatArray4916[12] = (f - (float) i_373_) * interface37.method261(1.0F);
		class327.aClass441_3465.aFloatArray4916[13] = (f_368_ - (float) i_374_) * interface37.method218(1.0F);
		class327.method5754();
	}
}
