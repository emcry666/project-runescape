/* Class504 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Rectangle;
import java.util.Iterator;

public class Class504 {
	int anInt5591;
	int anInt5592;
	int anInt5593;
	Class510 aClass510_5594;
	static final int anInt5595 = 512;
	Class510[] aClass510Array5596;
	int anInt5597;
	int anInt5598 = -1456621753;
	int anInt5599;
	int anInt5600;
	Class577 aClass577_5601;
	Class148 aClass148_5602;
	byte[] aByteArray5603;
	int anInt5604;
	Class510[] aClass510Array5605;
	int anInt5606;
	Class167 aClass167_5607;
	boolean aBool5608 = true;
	int anInt5609;
	boolean aBool5610;
	Class504 aClass504_5611;
	int anInt5612;
	int anInt5613;
	int anInt5614;

	public Class504 method8182() {
		return aClass504_5611;
	}

	public void method8183(int i, int i_0_, int i_1_) {
		if (aBool5610) {
			/* empty */
		}
		anInt5612 = (i * (i_0_ - 738806859 * anInt5614) / 255 + anInt5614 * 738806859) * -482245307;
	}

	public void method8184(Class178 class178, int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, boolean bool, boolean bool_10_) {
		int i_11_ = 0;
		if (aBool5610)
			i_11_ = -1327086195 * anInt5612;
		if (null != aClass504_5611) {
			Class504 class504_12_ = this;
			Class504 class504_13_ = aClass504_5611;
			if (class504_12_.hashCode() > class504_13_.hashCode()) {
				class504_12_ = aClass504_5611;
				class504_13_ = this;
				i_11_ = 255 - i_11_;
			}
			class504_12_.method8217(class178, i, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, bool, bool_10_, i_11_, (byte) 10);
			class504_13_.method8217(class178, i, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, false, bool_10_, 255 - i_11_, (byte) 103);
		} else {
			if (-785302611 * anInt5592 == -1)
				class178.method3193(i_2_, i_3_, i_4_, i_5_, ~0xffffff | i_9_, 0);
			method8217(class178, i, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, bool, bool_10_, i_11_, (byte) 1);
		}
	}

	public void method8185(int i) {
		aBool5610 = false;
		aClass504_5611 = null;
		anInt5612 = 0;
	}

	public boolean method8186(Class178 class178, int i, int i_14_, int i_15_) {
		if (i != anInt5598 * 1203453321) {
			anInt5598 = i * 1456621753;
			int i_16_ = Class375.method6383(i, 189765723);
			if (i_16_ > 512)
				i_16_ = 512;
			if (i_16_ <= 0)
				i_16_ = 1;
			if (anInt5591 * 906815829 != i_16_) {
				anInt5591 = -883176451 * i_16_;
				aClass148_5602 = null;
			}
			if (aClass510Array5605 != null) {
				anInt5597 = 0;
				int[] is = new int[aClass510Array5605.length];
				for (int i_17_ = 0; i_17_ < aClass510Array5605.length; i_17_++) {
					Class510 class510 = aClass510Array5605[i_17_];
					if (class510.method8514(-679435249 * anInt5599, 1356014141 * anInt5600, anInt5606 * -1760981309, 1203453321 * anInt5598)) {
						is[anInt5597 * -2132773241] = class510.anInt5754;
						aClass510Array5596[(anInt5597 += -1223790793) * -2132773241 - 1] = class510;
					}
				}
				Class644.method10554(is, aClass510Array5596, 0, -2132773241 * anInt5597 - 1, (byte) 71);
			}
			aBool5608 = true;
		}
		boolean bool = false;
		if (aBool5608) {
			aBool5608 = false;
			for (int i_18_ = anInt5597 * -2132773241 - 1; i_18_ >= 0; i_18_--) {
				boolean bool_19_ = aClass510Array5596[i_18_].method8515(class178, aClass510_5594);
				Class504 class504_20_ = this;
				class504_20_.aBool5608 = class504_20_.aBool5608 | !bool_19_;
				bool |= bool_19_;
			}
		}
		if (0 == i_14_ || !class178.method3031())
			aClass167_5607 = null;
		else if (aClass167_5607 == null && 848579279 * anInt5609 >= 0)
			method8189(class178, 163062790);
		if (aClass504_5611 != null && this != aClass504_5611) {
			aClass504_5611.method8185(-1366997638);
			bool |= aClass504_5611.method8186(class178, i, i_14_, -1528131168);
		}
		return bool;
	}

	public Class504 method8187(short i) {
		return aClass504_5611;
	}

	public void method8188(Class504 class504_21_) {
		if (aBool5610)
			anInt5614 = anInt5612 * 1707269767;
		else if (class504_21_ != null && class504_21_.aBool5610)
			anInt5614 = -2001451619 - class504_21_.anInt5612 * 1707269767;
		else
			anInt5614 = 0;
		aBool5610 = true;
		aClass504_5611 = class504_21_;
		anInt5612 = 0;
	}

	void method8189(Class178 class178, int i) {
		try {
			boolean bool = Class533.aClass472_7131.method7651(848579279 * anInt5609, (byte) 18);
			if (bool) {
				class178.method3460(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				Class179 class179 = Class179.method3485(Class533.aClass472_7131, anInt5609 * 848579279, 0);
				aClass167_5607 = class178.method3115(class179, 1099776, 0, 255, 1);
				byte[] is = aClass167_5607.method2820();
				if (null == is)
					aByteArray5603 = null;
				else {
					aByteArray5603 = new byte[is.length];
					System.arraycopy(is, 0, aByteArray5603, 0, is.length);
				}
			}
		} catch (Exception exception) {
			/* empty */
		}
	}

	public void method8190() {
		aBool5610 = false;
		aClass504_5611 = null;
		anInt5612 = 0;
	}

	public void method8191(Class178 class178, int i, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_) {
		method8214(class178, i, i_22_, i_23_, i_24_, i_25_, i_26_, i_27_, 0, i_29_, true, false, 2048158637);
	}

	void method8192(Class178 class178, int i, int i_31_, int i_32_, int i_33_) {
		Class435 class435 = class178.method3122();
		Class435 class435_34_ = new Class435();
		class435_34_.method6817(0.0F, 0.0F, 0.0F);
		class435_34_.method6814(0.0F, -1.0F, 0.0F, Class433.method6799(-i_31_ & 0x3fff));
		class435_34_.method6814(-1.0F, 0.0F, 0.0F, Class433.method6799(-i & 0x3fff));
		class435_34_.method6814(0.0F, 0.0F, -1.0F, Class433.method6799(-i_32_ & 0x3fff));
		class178.method3300(class435_34_);
		Class435 class435_35_ = new Class435();
		if (i_33_ != 266171037 * anInt5613) {
			aClass167_5607.method2715((byte) i_33_, aByteArray5603);
			anInt5613 = -1778080843 * i_33_;
		}
		aClass167_5607.method2708(class435_35_, null, 0);
		class178.method3300(class435);
	}

	void method8193(Class178 class178, int i, int i_36_, int i_37_, int i_38_, int i_39_) {
		Class435 class435 = class178.method3122();
		Class435 class435_40_ = new Class435();
		class435_40_.method6817(0.0F, 0.0F, 0.0F);
		class435_40_.method6814(0.0F, -1.0F, 0.0F, Class433.method6799(-i_36_ & 0x3fff));
		class435_40_.method6814(-1.0F, 0.0F, 0.0F, Class433.method6799(-i & 0x3fff));
		class435_40_.method6814(0.0F, 0.0F, -1.0F, Class433.method6799(-i_37_ & 0x3fff));
		class178.method3300(class435_40_);
		Class435 class435_41_ = new Class435();
		if (i_38_ != 266171037 * anInt5613) {
			aClass167_5607.method2715((byte) i_38_, aByteArray5603);
			anInt5613 = -1778080843 * i_38_;
		}
		aClass167_5607.method2708(class435_41_, null, 0);
		class178.method3300(class435);
	}

	public static void method8194(Class472 class472, Class172 class172, Interface25 interface25) {
		Class533.aClass472_7131 = class472;
		Class83.aClass172_873 = class172;
		Class289.anInterface25_3118 = interface25;
	}

	public static void method8195(Class472 class472, Class172 class172, Interface25 interface25) {
		Class533.aClass472_7131 = class472;
		Class83.aClass172_873 = class172;
		Class289.anInterface25_3118 = interface25;
	}

	public void method8196(int i, int i_42_) {
		if (aBool5610) {
			/* empty */
		}
		anInt5612 = (i * (i_42_ - 738806859 * anInt5614) / 255 + anInt5614 * 738806859) * -482245307;
	}

	public void method8197(Class504 class504_43_) {
		if (aBool5610)
			anInt5614 = anInt5612 * 1707269767;
		else if (class504_43_ != null && class504_43_.aBool5610)
			anInt5614 = -2001451619 - class504_43_.anInt5612 * 1707269767;
		else
			anInt5614 = 0;
		aBool5610 = true;
		aClass504_5611 = class504_43_;
		anInt5612 = 0;
	}

	public Class504(int i, Class510[] class510s, int i_44_, int i_45_, int i_46_, int i_47_, Class577 class577, int i_48_) {
		anInt5599 = i_45_ * 207473391;
		anInt5600 = 977208597 * i_46_;
		anInt5606 = 1532301803 * i_47_;
		anInt5592 = i * 62382117;
		aClass510Array5605 = class510s;
		aClass577_5601 = class577;
		if (null != class510s) {
			aClass510Array5596 = new Class510[class510s.length];
			aClass510_5594 = i_44_ >= 0 ? class510s[i_44_] : null;
		} else {
			aClass510Array5596 = null;
			aClass510_5594 = null;
		}
		anInt5609 = 1867938863 * i_48_;
	}

	public void method8198(Class178 class178, int i, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_, int i_56_) {
		method8214(class178, i, i_49_, i_50_, i_51_, i_52_, i_53_, i_54_, 0, i_56_, true, false, 2047393943);
	}

	public void method8199() {
		aBool5610 = false;
		aClass504_5611 = null;
		anInt5612 = 0;
	}

	public void method8200() {
		aBool5610 = false;
		aClass504_5611 = null;
		anInt5612 = 0;
	}

	void method8201(Class178 class178, int i, int i_57_, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_, int i_64_, boolean bool, boolean bool_65_, int i_66_) {
		int i_67_ = 255 - i_66_;
		class178.method3206();
		class178.method3186();
		if (aClass167_5607 == null) {
			class178.method3076(2, 0);
			i_62_ = i_62_ + i & 0x3fff;
			if (anInt5592 * -785302611 != -1 && 906815829 * anInt5591 != 0) {
				Class177 class177 = Class83.aClass172_873.method2895(-785302611 * anInt5592, -1823677816);
				if (aClass148_5602 == null && (Class289.anInterface25_3118.method136(Class601.aClass601_7850, -1983177481 * class177.anInt1880, (Class593.aClass593_7811 == class177.aClass593_1884 ? Class608.aClass608_7988 : Class608.aClass608_7989), 0.7F, 906815829 * anInt5591, anInt5591 * 906815829, false, (short) -25121))) {
					int[] is = (class177.aClass593_1884 == Class593.aClass593_7811 ? (Class289.anInterface25_3118.method138(Class601.aClass601_7850, class177.anInt1880 * -1983177481, 0.7F, anInt5591 * 906815829, 906815829 * anInt5591, false, 1929558355)) : (Class289.anInterface25_3118.method137(Class601.aClass601_7850, -1983177481 * class177.anInt1880, 0.7F, 906815829 * anInt5591, anInt5591 * 906815829, false, (byte) 0)));
					anInt5604 = -141736667 * is[0];
					anInt5593 = -566398123 * is[is.length - 1];
					aClass148_5602 = class178.method3103(is, 0, 1075916655 * class177.anInt1913, 1075916655 * class177.anInt1913, class177.anInt1913 * 1075916655, -1885637431);
				}
				int i_68_ = (255 == i_67_ ? (class177.aClass593_1884 == Class593.aClass593_7811 ? 1 : 0) : 1);
				if (i_68_ == 1 && bool)
					class178.method3193(i_57_, i_58_, i_59_, i_60_, i_64_, 0);
				if (aClass148_5602 != null) {
					int i_69_ = i_60_ * i_61_ / -4096;
					int i_70_;
					for (i_70_ = (i_59_ - i_60_) / 2 + i_60_ * i_62_ / 4096; i_70_ > i_60_; i_70_ -= i_60_) {
						/* empty */
					}
					for (/**/; i_70_ < 0; i_70_ += i_60_) {
						/* empty */
					}
					if (aClass577_5601 == Class577.aClass577_7698) {
						for (int i_71_ = i_70_ - i_60_; i_71_ < i_59_; i_71_ += i_60_)
							aClass148_5602.method2439(i_71_ + i_57_, i_58_ + i_69_, i_60_, i_60_, 0, i_67_ << 24 | 0xffffff, i_68_);
						if ((anInt5604 * 1953189549 & ~0xffffff) != 0)
							class178.method3354(0, 0, i_59_, i_69_ + i_58_ + 1, 1953189549 * anInt5604, (byte) 20);
						if (0 != (anInt5593 * -1192562179 & ~0xffffff))
							class178.method3354(0, i_60_ + (i_58_ + i_69_), i_59_, i_60_ - (i_60_ + (i_69_ + i_58_)), anInt5593 * -1192562179, (byte) 9);
					} else {
						for (/**/; i_69_ > i_60_; i_69_ -= i_60_) {
							/* empty */
						}
						for (/**/; i_69_ < 0; i_69_ += i_60_) {
							/* empty */
						}
						for (int i_72_ = i_70_ - i_60_; i_72_ < i_59_; i_72_ += i_60_) {
							for (int i_73_ = i_69_ - i_60_; i_73_ < i_60_; i_73_ += i_60_)
								aClass148_5602.method2439(i_72_ + i_57_, i_58_ + i_73_, i_60_, i_60_, 0, (i_67_ << 24 | 0xffffff), i_68_);
						}
					}
				}
			} else
				class178.method3193(i_57_, i_58_, i_59_, i_60_, i_67_ << 24 | i_64_, bool ? 0 : 1);
		} else if (bool_65_) {
			Class441 class441 = class178.method3125();
			Class441 class441_74_ = class178.method3125();
			class441.aFloatArray4916[2] = class441.aFloatArray4916[3];
			class441.aFloatArray4916[6] = class441.aFloatArray4916[7];
			class441.aFloatArray4916[10] = class441.aFloatArray4916[11];
			class441.aFloatArray4916[14] = class441.aFloatArray4916[15];
			class178.method3124(class441);
			method8193(class178, i_61_, i_62_, i_63_, i_66_, 1748802579);
			class178.method3124(class441_74_);
		} else {
			if (bool)
				class178.method3076(3, i_64_);
			method8193(class178, i_61_, i_62_, i_63_, i_66_, 1748802579);
		}
		for (int i_75_ = anInt5597 * -2132773241 - 1; i_75_ >= 0; i_75_--)
			aClass510Array5596[i_75_].method8517(class178, i_57_, i_58_, i_59_, i_60_, i_61_, i_62_, anInt5599 * -679435249, 1356014141 * anInt5600, -1760981309 * anInt5606, i_67_);
		class178.method3076(2, 0);
		class178.method3108();
	}

	public boolean method8202() {
		return aBool5610;
	}

	public boolean method8203() {
		return aBool5610;
	}

	public Class504 method8204() {
		return aClass504_5611;
	}

	public void method8205(Class504 class504_76_, int i) {
		if (aBool5610)
			anInt5614 = anInt5612 * 1707269767;
		else if (class504_76_ != null && class504_76_.aBool5610)
			anInt5614 = -2001451619 - class504_76_.anInt5612 * 1707269767;
		else
			anInt5614 = 0;
		aBool5610 = true;
		aClass504_5611 = class504_76_;
		anInt5612 = 0;
	}

	public Class504 method8206() {
		return aClass504_5611;
	}

	public Class504 method8207() {
		return aClass504_5611;
	}

	void method8208(Class178 class178, int i, int i_77_, int i_78_, int i_79_, int i_80_, int i_81_, int i_82_, int i_83_, int i_84_, boolean bool, boolean bool_85_, int i_86_) {
		int i_87_ = 255 - i_86_;
		class178.method3206();
		class178.method3186();
		if (aClass167_5607 == null) {
			class178.method3076(2, 0);
			i_82_ = i_82_ + i & 0x3fff;
			if (anInt5592 * -785302611 != -1 && 906815829 * anInt5591 != 0) {
				Class177 class177 = Class83.aClass172_873.method2895(-785302611 * anInt5592, 343789613);
				if (aClass148_5602 == null && (Class289.anInterface25_3118.method136(Class601.aClass601_7850, -1983177481 * class177.anInt1880, (Class593.aClass593_7811 == class177.aClass593_1884 ? Class608.aClass608_7988 : Class608.aClass608_7989), 0.7F, 906815829 * anInt5591, anInt5591 * 906815829, false, (short) -23092))) {
					int[] is = (class177.aClass593_1884 == Class593.aClass593_7811 ? (Class289.anInterface25_3118.method138(Class601.aClass601_7850, class177.anInt1880 * -1983177481, 0.7F, anInt5591 * 906815829, 906815829 * anInt5591, false, 1324427587)) : (Class289.anInterface25_3118.method137(Class601.aClass601_7850, -1983177481 * class177.anInt1880, 0.7F, 906815829 * anInt5591, anInt5591 * 906815829, false, (byte) 0)));
					anInt5604 = -141736667 * is[0];
					anInt5593 = -566398123 * is[is.length - 1];
					aClass148_5602 = class178.method3103(is, 0, 1075916655 * class177.anInt1913, 1075916655 * class177.anInt1913, class177.anInt1913 * 1075916655, -2009181456);
				}
				int i_88_ = (255 == i_87_ ? (class177.aClass593_1884 == Class593.aClass593_7811 ? 1 : 0) : 1);
				if (i_88_ == 1 && bool)
					class178.method3193(i_77_, i_78_, i_79_, i_80_, i_84_, 0);
				if (aClass148_5602 != null) {
					int i_89_ = i_80_ * i_81_ / -4096;
					int i_90_;
					for (i_90_ = (i_79_ - i_80_) / 2 + i_80_ * i_82_ / 4096; i_90_ > i_80_; i_90_ -= i_80_) {
						/* empty */
					}
					for (/**/; i_90_ < 0; i_90_ += i_80_) {
						/* empty */
					}
					if (aClass577_5601 == Class577.aClass577_7698) {
						for (int i_91_ = i_90_ - i_80_; i_91_ < i_79_; i_91_ += i_80_)
							aClass148_5602.method2439(i_91_ + i_77_, i_78_ + i_89_, i_80_, i_80_, 0, i_87_ << 24 | 0xffffff, i_88_);
						if ((anInt5604 * 1953189549 & ~0xffffff) != 0)
							class178.method3354(0, 0, i_79_, i_89_ + i_78_ + 1, 1953189549 * anInt5604, (byte) 59);
						if (0 != (anInt5593 * -1192562179 & ~0xffffff))
							class178.method3354(0, i_80_ + (i_78_ + i_89_), i_79_, i_80_ - (i_80_ + (i_89_ + i_78_)), anInt5593 * -1192562179, (byte) 32);
					} else {
						for (/**/; i_89_ > i_80_; i_89_ -= i_80_) {
							/* empty */
						}
						for (/**/; i_89_ < 0; i_89_ += i_80_) {
							/* empty */
						}
						for (int i_92_ = i_90_ - i_80_; i_92_ < i_79_; i_92_ += i_80_) {
							for (int i_93_ = i_89_ - i_80_; i_93_ < i_80_; i_93_ += i_80_)
								aClass148_5602.method2439(i_92_ + i_77_, i_78_ + i_93_, i_80_, i_80_, 0, (i_87_ << 24 | 0xffffff), i_88_);
						}
					}
				}
			} else
				class178.method3193(i_77_, i_78_, i_79_, i_80_, i_87_ << 24 | i_84_, bool ? 0 : 1);
		} else if (bool_85_) {
			Class441 class441 = class178.method3125();
			Class441 class441_94_ = class178.method3125();
			class441.aFloatArray4916[2] = class441.aFloatArray4916[3];
			class441.aFloatArray4916[6] = class441.aFloatArray4916[7];
			class441.aFloatArray4916[10] = class441.aFloatArray4916[11];
			class441.aFloatArray4916[14] = class441.aFloatArray4916[15];
			class178.method3124(class441);
			method8193(class178, i_81_, i_82_, i_83_, i_86_, 1748802579);
			class178.method3124(class441_94_);
		} else {
			if (bool)
				class178.method3076(3, i_84_);
			method8193(class178, i_81_, i_82_, i_83_, i_86_, 1748802579);
		}
		for (int i_95_ = anInt5597 * -2132773241 - 1; i_95_ >= 0; i_95_--)
			aClass510Array5596[i_95_].method8517(class178, i_77_, i_78_, i_79_, i_80_, i_81_, i_82_, anInt5599 * -679435249, 1356014141 * anInt5600, -1760981309 * anInt5606, i_87_);
		class178.method3076(2, 0);
		class178.method3108();
	}

	public Class504 method8209() {
		return aClass504_5611;
	}

	void method8210(Class178 class178) {
		try {
			boolean bool = Class533.aClass472_7131.method7651(848579279 * anInt5609, (byte) -78);
			if (bool) {
				class178.method3460(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				Class179 class179 = Class179.method3485(Class533.aClass472_7131, anInt5609 * 848579279, 0);
				aClass167_5607 = class178.method3115(class179, 1099776, 0, 255, 1);
				byte[] is = aClass167_5607.method2820();
				if (null == is)
					aByteArray5603 = null;
				else {
					aByteArray5603 = new byte[is.length];
					System.arraycopy(is, 0, aByteArray5603, 0, is.length);
				}
			}
		} catch (Exception exception) {
			/* empty */
		}
	}

	void method8211(Class178 class178) {
		try {
			boolean bool = Class533.aClass472_7131.method7651(848579279 * anInt5609, (byte) 57);
			if (bool) {
				class178.method3460(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				Class179 class179 = Class179.method3485(Class533.aClass472_7131, anInt5609 * 848579279, 0);
				aClass167_5607 = class178.method3115(class179, 1099776, 0, 255, 1);
				byte[] is = aClass167_5607.method2820();
				if (null == is)
					aByteArray5603 = null;
				else {
					aByteArray5603 = new byte[is.length];
					System.arraycopy(is, 0, aByteArray5603, 0, is.length);
				}
			}
		} catch (Exception exception) {
			/* empty */
		}
	}

	void method8212(Class178 class178) {
		try {
			boolean bool = Class533.aClass472_7131.method7651(848579279 * anInt5609, (byte) 3);
			if (bool) {
				class178.method3460(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				Class179 class179 = Class179.method3485(Class533.aClass472_7131, anInt5609 * 848579279, 0);
				aClass167_5607 = class178.method3115(class179, 1099776, 0, 255, 1);
				byte[] is = aClass167_5607.method2820();
				if (null == is)
					aByteArray5603 = null;
				else {
					aByteArray5603 = new byte[is.length];
					System.arraycopy(is, 0, aByteArray5603, 0, is.length);
				}
			}
		} catch (Exception exception) {
			/* empty */
		}
	}

	public boolean method8213(int i) {
		return aBool5610;
	}

	public void method8214(Class178 class178, int i, int i_96_, int i_97_, int i_98_, int i_99_, int i_100_, int i_101_, int i_102_, int i_103_, boolean bool, boolean bool_104_, int i_105_) {
		int i_106_ = 0;
		if (aBool5610)
			i_106_ = -1327086195 * anInt5612;
		if (null != aClass504_5611) {
			Class504 class504_107_ = this;
			Class504 class504_108_ = aClass504_5611;
			if (class504_107_.hashCode() > class504_108_.hashCode()) {
				class504_107_ = aClass504_5611;
				class504_108_ = this;
				i_106_ = 255 - i_106_;
			}
			class504_107_.method8217(class178, i, i_96_, i_97_, i_98_, i_99_, i_100_, i_101_, i_102_, i_103_, bool, bool_104_, i_106_, (byte) 64);
			class504_108_.method8217(class178, i, i_96_, i_97_, i_98_, i_99_, i_100_, i_101_, i_102_, i_103_, false, bool_104_, 255 - i_106_, (byte) 91);
		} else {
			if (-785302611 * anInt5592 == -1)
				class178.method3193(i_96_, i_97_, i_98_, i_99_, ~0xffffff | i_103_, 0);
			method8217(class178, i, i_96_, i_97_, i_98_, i_99_, i_100_, i_101_, i_102_, i_103_, bool, bool_104_, i_106_, (byte) 117);
		}
	}

	public void method8215(Class178 class178, int i, int i_109_, int i_110_, int i_111_, int i_112_, int i_113_, int i_114_, int i_115_, int i_116_) {
		method8214(class178, i, i_109_, i_110_, i_111_, i_112_, i_113_, i_114_, 0, i_116_, true, false, 2064805670);
	}

	public void method8216(Class178 class178, int i, int i_117_, int i_118_, int i_119_, int i_120_, int i_121_, int i_122_, int i_123_, int i_124_) {
		method8214(class178, i, i_117_, i_118_, i_119_, i_120_, i_121_, i_122_, 0, i_124_, true, false, 2074711615);
	}

	void method8217(Class178 class178, int i, int i_125_, int i_126_, int i_127_, int i_128_, int i_129_, int i_130_, int i_131_, int i_132_, boolean bool, boolean bool_133_, int i_134_, byte i_135_) {
		int i_136_ = 255 - i_134_;
		class178.method3206();
		class178.method3186();
		if (aClass167_5607 == null) {
			class178.method3076(2, 0);
			i_130_ = i_130_ + i & 0x3fff;
			if (anInt5592 * -785302611 != -1 && 906815829 * anInt5591 != 0) {
				Class177 class177 = Class83.aClass172_873.method2895(-785302611 * anInt5592, -1889419965);
				if (aClass148_5602 == null && (Class289.anInterface25_3118.method136(Class601.aClass601_7850, -1983177481 * class177.anInt1880, (Class593.aClass593_7811 == class177.aClass593_1884 ? Class608.aClass608_7988 : Class608.aClass608_7989), 0.7F, 906815829 * anInt5591, anInt5591 * 906815829, false, (short) -29047))) {
					int[] is = (class177.aClass593_1884 == Class593.aClass593_7811 ? (Class289.anInterface25_3118.method138(Class601.aClass601_7850, class177.anInt1880 * -1983177481, 0.7F, anInt5591 * 906815829, 906815829 * anInt5591, false, 1694544656)) : (Class289.anInterface25_3118.method137(Class601.aClass601_7850, -1983177481 * class177.anInt1880, 0.7F, 906815829 * anInt5591, anInt5591 * 906815829, false, (byte) 0)));
					anInt5604 = -141736667 * is[0];
					anInt5593 = -566398123 * is[is.length - 1];
					aClass148_5602 = class178.method3103(is, 0, 1075916655 * class177.anInt1913, 1075916655 * class177.anInt1913, class177.anInt1913 * 1075916655, -2100373239);
				}
				int i_137_ = (255 == i_136_ ? (class177.aClass593_1884 == Class593.aClass593_7811 ? 1 : 0) : 1);
				if (i_137_ == 1 && bool)
					class178.method3193(i_125_, i_126_, i_127_, i_128_, i_132_, 0);
				if (aClass148_5602 != null) {
					int i_138_ = i_128_ * i_129_ / -4096;
					int i_139_;
					for (i_139_ = (i_127_ - i_128_) / 2 + i_128_ * i_130_ / 4096; i_139_ > i_128_; i_139_ -= i_128_) {
						/* empty */
					}
					for (/**/; i_139_ < 0; i_139_ += i_128_) {
						/* empty */
					}
					if (aClass577_5601 == Class577.aClass577_7698) {
						for (int i_140_ = i_139_ - i_128_; i_140_ < i_127_; i_140_ += i_128_)
							aClass148_5602.method2439(i_140_ + i_125_, i_126_ + i_138_, i_128_, i_128_, 0, i_136_ << 24 | 0xffffff, i_137_);
						if ((anInt5604 * 1953189549 & ~0xffffff) != 0)
							class178.method3354(0, 0, i_127_, i_138_ + i_126_ + 1, 1953189549 * anInt5604, (byte) 29);
						if (0 != (anInt5593 * -1192562179 & ~0xffffff))
							class178.method3354(0, i_128_ + (i_126_ + i_138_), i_127_, i_128_ - (i_128_ + (i_138_ + i_126_)), anInt5593 * -1192562179, (byte) 31);
					} else {
						for (/**/; i_138_ > i_128_; i_138_ -= i_128_) {
							/* empty */
						}
						for (/**/; i_138_ < 0; i_138_ += i_128_) {
							/* empty */
						}
						for (int i_141_ = i_139_ - i_128_; i_141_ < i_127_; i_141_ += i_128_) {
							for (int i_142_ = i_138_ - i_128_; i_142_ < i_128_; i_142_ += i_128_)
								aClass148_5602.method2439(i_141_ + i_125_, i_126_ + i_142_, i_128_, i_128_, 0, (i_136_ << 24 | 0xffffff), i_137_);
						}
					}
				}
			} else
				class178.method3193(i_125_, i_126_, i_127_, i_128_, i_136_ << 24 | i_132_, bool ? 0 : 1);
		} else if (bool_133_) {
			Class441 class441 = class178.method3125();
			Class441 class441_143_ = class178.method3125();
			class441.aFloatArray4916[2] = class441.aFloatArray4916[3];
			class441.aFloatArray4916[6] = class441.aFloatArray4916[7];
			class441.aFloatArray4916[10] = class441.aFloatArray4916[11];
			class441.aFloatArray4916[14] = class441.aFloatArray4916[15];
			class178.method3124(class441);
			method8193(class178, i_129_, i_130_, i_131_, i_134_, 1748802579);
			class178.method3124(class441_143_);
		} else {
			if (bool)
				class178.method3076(3, i_132_);
			method8193(class178, i_129_, i_130_, i_131_, i_134_, 1748802579);
		}
		for (int i_144_ = anInt5597 * -2132773241 - 1; i_144_ >= 0; i_144_--)
			aClass510Array5596[i_144_].method8517(class178, i_125_, i_126_, i_127_, i_128_, i_129_, i_130_, anInt5599 * -679435249, 1356014141 * anInt5600, -1760981309 * anInt5606, i_136_);
		class178.method3076(2, 0);
		class178.method3108();
	}

	void method8218(Class178 class178, int i, int i_145_, int i_146_, int i_147_, int i_148_, int i_149_, int i_150_, int i_151_, int i_152_, boolean bool, boolean bool_153_, int i_154_) {
		int i_155_ = 255 - i_154_;
		class178.method3206();
		class178.method3186();
		if (aClass167_5607 == null) {
			class178.method3076(2, 0);
			i_150_ = i_150_ + i & 0x3fff;
			if (anInt5592 * -785302611 != -1 && 906815829 * anInt5591 != 0) {
				Class177 class177 = Class83.aClass172_873.method2895(-785302611 * anInt5592, -1469085456);
				if (aClass148_5602 == null && (Class289.anInterface25_3118.method136(Class601.aClass601_7850, -1983177481 * class177.anInt1880, (Class593.aClass593_7811 == class177.aClass593_1884 ? Class608.aClass608_7988 : Class608.aClass608_7989), 0.7F, 906815829 * anInt5591, anInt5591 * 906815829, false, (short) -23059))) {
					int[] is = (class177.aClass593_1884 == Class593.aClass593_7811 ? (Class289.anInterface25_3118.method138(Class601.aClass601_7850, class177.anInt1880 * -1983177481, 0.7F, anInt5591 * 906815829, 906815829 * anInt5591, false, 1743609429)) : (Class289.anInterface25_3118.method137(Class601.aClass601_7850, -1983177481 * class177.anInt1880, 0.7F, 906815829 * anInt5591, anInt5591 * 906815829, false, (byte) 0)));
					anInt5604 = -141736667 * is[0];
					anInt5593 = -566398123 * is[is.length - 1];
					aClass148_5602 = class178.method3103(is, 0, 1075916655 * class177.anInt1913, 1075916655 * class177.anInt1913, class177.anInt1913 * 1075916655, -1868890406);
				}
				int i_156_ = (255 == i_155_ ? (class177.aClass593_1884 == Class593.aClass593_7811 ? 1 : 0) : 1);
				if (i_156_ == 1 && bool)
					class178.method3193(i_145_, i_146_, i_147_, i_148_, i_152_, 0);
				if (aClass148_5602 != null) {
					int i_157_ = i_148_ * i_149_ / -4096;
					int i_158_;
					for (i_158_ = (i_147_ - i_148_) / 2 + i_148_ * i_150_ / 4096; i_158_ > i_148_; i_158_ -= i_148_) {
						/* empty */
					}
					for (/**/; i_158_ < 0; i_158_ += i_148_) {
						/* empty */
					}
					if (aClass577_5601 == Class577.aClass577_7698) {
						for (int i_159_ = i_158_ - i_148_; i_159_ < i_147_; i_159_ += i_148_)
							aClass148_5602.method2439(i_159_ + i_145_, i_146_ + i_157_, i_148_, i_148_, 0, i_155_ << 24 | 0xffffff, i_156_);
						if ((anInt5604 * 1953189549 & ~0xffffff) != 0)
							class178.method3354(0, 0, i_147_, i_157_ + i_146_ + 1, 1953189549 * anInt5604, (byte) 86);
						if (0 != (anInt5593 * -1192562179 & ~0xffffff))
							class178.method3354(0, i_148_ + (i_146_ + i_157_), i_147_, i_148_ - (i_148_ + (i_157_ + i_146_)), anInt5593 * -1192562179, (byte) 67);
					} else {
						for (/**/; i_157_ > i_148_; i_157_ -= i_148_) {
							/* empty */
						}
						for (/**/; i_157_ < 0; i_157_ += i_148_) {
							/* empty */
						}
						for (int i_160_ = i_158_ - i_148_; i_160_ < i_147_; i_160_ += i_148_) {
							for (int i_161_ = i_157_ - i_148_; i_161_ < i_148_; i_161_ += i_148_)
								aClass148_5602.method2439(i_160_ + i_145_, i_146_ + i_161_, i_148_, i_148_, 0, (i_155_ << 24 | 0xffffff), i_156_);
						}
					}
				}
			} else
				class178.method3193(i_145_, i_146_, i_147_, i_148_, i_155_ << 24 | i_152_, bool ? 0 : 1);
		} else if (bool_153_) {
			Class441 class441 = class178.method3125();
			Class441 class441_162_ = class178.method3125();
			class441.aFloatArray4916[2] = class441.aFloatArray4916[3];
			class441.aFloatArray4916[6] = class441.aFloatArray4916[7];
			class441.aFloatArray4916[10] = class441.aFloatArray4916[11];
			class441.aFloatArray4916[14] = class441.aFloatArray4916[15];
			class178.method3124(class441);
			method8193(class178, i_149_, i_150_, i_151_, i_154_, 1748802579);
			class178.method3124(class441_162_);
		} else {
			if (bool)
				class178.method3076(3, i_152_);
			method8193(class178, i_149_, i_150_, i_151_, i_154_, 1748802579);
		}
		for (int i_163_ = anInt5597 * -2132773241 - 1; i_163_ >= 0; i_163_--)
			aClass510Array5596[i_163_].method8517(class178, i_145_, i_146_, i_147_, i_148_, i_149_, i_150_, anInt5599 * -679435249, 1356014141 * anInt5600, -1760981309 * anInt5606, i_155_);
		class178.method3076(2, 0);
		class178.method3108();
	}

	public void method8219(Class178 class178, int i, int i_164_, int i_165_, int i_166_, int i_167_, int i_168_, int i_169_, int i_170_, int i_171_) {
		method8214(class178, i, i_164_, i_165_, i_166_, i_167_, i_168_, i_169_, 0, i_171_, true, false, 2098088886);
	}

	public Class504 method8220() {
		return aClass504_5611;
	}

	void method8221(Class178 class178, int i, int i_172_, int i_173_, int i_174_, int i_175_, int i_176_, int i_177_, int i_178_, int i_179_, boolean bool, boolean bool_180_, int i_181_) {
		int i_182_ = 255 - i_181_;
		class178.method3206();
		class178.method3186();
		if (aClass167_5607 == null) {
			class178.method3076(2, 0);
			i_177_ = i_177_ + i & 0x3fff;
			if (anInt5592 * -785302611 != -1 && 906815829 * anInt5591 != 0) {
				Class177 class177 = Class83.aClass172_873.method2895(-785302611 * anInt5592, -1210328771);
				if (aClass148_5602 == null && (Class289.anInterface25_3118.method136(Class601.aClass601_7850, -1983177481 * class177.anInt1880, (Class593.aClass593_7811 == class177.aClass593_1884 ? Class608.aClass608_7988 : Class608.aClass608_7989), 0.7F, 906815829 * anInt5591, anInt5591 * 906815829, false, (short) -24993))) {
					int[] is = (class177.aClass593_1884 == Class593.aClass593_7811 ? (Class289.anInterface25_3118.method138(Class601.aClass601_7850, class177.anInt1880 * -1983177481, 0.7F, anInt5591 * 906815829, 906815829 * anInt5591, false, 1912265939)) : (Class289.anInterface25_3118.method137(Class601.aClass601_7850, -1983177481 * class177.anInt1880, 0.7F, 906815829 * anInt5591, anInt5591 * 906815829, false, (byte) 0)));
					anInt5604 = -141736667 * is[0];
					anInt5593 = -566398123 * is[is.length - 1];
					aClass148_5602 = class178.method3103(is, 0, 1075916655 * class177.anInt1913, 1075916655 * class177.anInt1913, class177.anInt1913 * 1075916655, -1851393780);
				}
				int i_183_ = (255 == i_182_ ? (class177.aClass593_1884 == Class593.aClass593_7811 ? 1 : 0) : 1);
				if (i_183_ == 1 && bool)
					class178.method3193(i_172_, i_173_, i_174_, i_175_, i_179_, 0);
				if (aClass148_5602 != null) {
					int i_184_ = i_175_ * i_176_ / -4096;
					int i_185_;
					for (i_185_ = (i_174_ - i_175_) / 2 + i_175_ * i_177_ / 4096; i_185_ > i_175_; i_185_ -= i_175_) {
						/* empty */
					}
					for (/**/; i_185_ < 0; i_185_ += i_175_) {
						/* empty */
					}
					if (aClass577_5601 == Class577.aClass577_7698) {
						for (int i_186_ = i_185_ - i_175_; i_186_ < i_174_; i_186_ += i_175_)
							aClass148_5602.method2439(i_186_ + i_172_, i_173_ + i_184_, i_175_, i_175_, 0, i_182_ << 24 | 0xffffff, i_183_);
						if ((anInt5604 * 1953189549 & ~0xffffff) != 0)
							class178.method3354(0, 0, i_174_, i_184_ + i_173_ + 1, 1953189549 * anInt5604, (byte) 101);
						if (0 != (anInt5593 * -1192562179 & ~0xffffff))
							class178.method3354(0, i_175_ + (i_173_ + i_184_), i_174_, i_175_ - (i_175_ + (i_184_ + i_173_)), anInt5593 * -1192562179, (byte) 64);
					} else {
						for (/**/; i_184_ > i_175_; i_184_ -= i_175_) {
							/* empty */
						}
						for (/**/; i_184_ < 0; i_184_ += i_175_) {
							/* empty */
						}
						for (int i_187_ = i_185_ - i_175_; i_187_ < i_174_; i_187_ += i_175_) {
							for (int i_188_ = i_184_ - i_175_; i_188_ < i_175_; i_188_ += i_175_)
								aClass148_5602.method2439(i_187_ + i_172_, i_173_ + i_188_, i_175_, i_175_, 0, (i_182_ << 24 | 0xffffff), i_183_);
						}
					}
				}
			} else
				class178.method3193(i_172_, i_173_, i_174_, i_175_, i_182_ << 24 | i_179_, bool ? 0 : 1);
		} else if (bool_180_) {
			Class441 class441 = class178.method3125();
			Class441 class441_189_ = class178.method3125();
			class441.aFloatArray4916[2] = class441.aFloatArray4916[3];
			class441.aFloatArray4916[6] = class441.aFloatArray4916[7];
			class441.aFloatArray4916[10] = class441.aFloatArray4916[11];
			class441.aFloatArray4916[14] = class441.aFloatArray4916[15];
			class178.method3124(class441);
			method8193(class178, i_176_, i_177_, i_178_, i_181_, 1748802579);
			class178.method3124(class441_189_);
		} else {
			if (bool)
				class178.method3076(3, i_179_);
			method8193(class178, i_176_, i_177_, i_178_, i_181_, 1748802579);
		}
		for (int i_190_ = anInt5597 * -2132773241 - 1; i_190_ >= 0; i_190_--)
			aClass510Array5596[i_190_].method8517(class178, i_172_, i_173_, i_174_, i_175_, i_176_, i_177_, anInt5599 * -679435249, 1356014141 * anInt5600, -1760981309 * anInt5606, i_182_);
		class178.method3076(2, 0);
		class178.method3108();
	}

	public void method8222(Class504 class504_191_) {
		if (aBool5610)
			anInt5614 = anInt5612 * 1707269767;
		else if (class504_191_ != null && class504_191_.aBool5610)
			anInt5614 = -2001451619 - class504_191_.anInt5612 * 1707269767;
		else
			anInt5614 = 0;
		aBool5610 = true;
		aClass504_5611 = class504_191_;
		anInt5612 = 0;
	}

	static final void method8223(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		Class523_Sub27_Sub1 class523_sub27_sub1 = ((Class523_Sub27_Sub1) Class115.aClass53_Sub20_1412.getDefinition((class669.anIntArray8557[(class669.anInt8558 * 1357652815)]), (byte) -28));
		int i_192_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1];
		int i_193_ = -1;
		for (int i_194_ = 0; i_194_ < 2003522525 * class523_sub27_sub1.anInt11324; i_194_++) {
			if (class523_sub27_sub1.anIntArray11325[i_194_] == i_192_) {
				i_193_ = class523_sub27_sub1.anIntArray11326[i_194_];
				break;
			}
		}
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_193_;
	}

	static final void method8224(int i) {
		Iterator iterator = client.aClass14_11174.iterator();
		while (iterator.hasNext()) {
			Class523_Sub27_Sub9 class523_sub27_sub9 = (Class523_Sub27_Sub9) iterator.next();
			Class647_Sub1_Sub3_Sub4 class647_sub1_sub3_sub4 = class523_sub27_sub9.aClass647_Sub1_Sub3_Sub4_11721;
			if (client.aClass505_11019.method8241((byte) -17) != null && class647_sub1_sub3_sub4.method18579(-547786638))
				client.aClass505_11019.method8241((byte) -17).method9268(class647_sub1_sub3_sub4, true, (byte) 57);
		}
	}

	static final void method8225(int i, int i_195_, int i_196_, int i_197_, byte i_198_) {
		for (int i_199_ = 0; i_199_ < client.anInt10994 * 2032911217; i_199_++) {
			Rectangle rectangle = client.aRectangleArray11248[i_199_];
			if (rectangle.width + rectangle.x > i && rectangle.x < i + i_196_ && rectangle.y + rectangle.height > i_195_ && rectangle.y < i_197_ + i_195_)
				client.aBoolArray11246[i_199_] = true;
		}
	}

	static void method8226(int i, int i_200_, InterfaceComponentDefinitions class250, Class145 class145, int i_201_, int i_202_, byte i_203_) {
		int i_204_ = Class108.anInt1318 * 393652345;
		int[] is = Class108.anIntArray1319;
		for (int i_205_ = 0; i_205_ < i_204_; i_205_++) {
			Player class647_sub1_sub3_sub1_sub2 = client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[is[i_205_]];
			if (class647_sub1_sub3_sub1_sub2 != null && class647_sub1_sub3_sub1_sub2.method18668(-842882944) && !class647_sub1_sub3_sub1_sub2.visible.method10401(1407684609) && (class647_sub1_sub3_sub1_sub2 != Class241.player) && (class647_sub1_sub3_sub1_sub2.aByte10821 == (Class241.player.aByte10821))) {
				Class437 class437 = (class647_sub1_sub3_sub1_sub2.method10569().aClass437_4862);
				int i_206_ = (int) class437.aFloat4903 / 128 - i / 128;
				int i_207_ = (int) class437.aFloat4905 / 128 - i_200_ / 128;
				boolean bool = false;
				for (int i_208_ = 0; i_208_ < client.anInt11287 * 1563815891; i_208_++) {
					Class60 class60 = client.aClass60Array11182[i_208_];
					if (class647_sub1_sub3_sub1_sub2.username.equals(class60.aString763) && 0 != 2036106249 * class60.anInt757) {
						bool = true;
						break;
					}
				}
				boolean bool_209_ = false;
				for (int i_210_ = 0; i_210_ < 797304521 * Class365.anInt3866; i_210_++) {
					if (class647_sub1_sub3_sub1_sub2.username.equals(Class99.aClass115Array1232[i_210_].aString1407)) {
						bool_209_ = true;
						break;
					}
				}
				boolean bool_211_ = false;
				if (0 != -514698785 * (Class241.player.anInt12192) && 0 != (-514698785 * class647_sub1_sub3_sub1_sub2.anInt12192) && (-514698785 * class647_sub1_sub3_sub1_sub2.anInt12192 == -514698785 * (Class241.player.anInt12192)))
					bool_211_ = true;
				if (class647_sub1_sub3_sub1_sub2.aClass623_12183 != null && (class647_sub1_sub3_sub1_sub2.aClass623_12183.anInt8106 * -1137516987) != -1 && ((NPCDefinition) (Class174.aClass53_Sub7_1856.getDefinition(-1137516987 * (class647_sub1_sub3_sub1_sub2.aClass623_12183.anInt8106), (byte) -27))).aBool3308)
					Class203.method3705(class250, class145, i_201_, i_202_, i_206_, i_207_, Class501.aClass148Array5584[1], 928402288);
				else if (Class210.aClass210_2259 == class647_sub1_sub3_sub1_sub2.aClass210_12200)
					Class203.method3705(class250, class145, i_201_, i_202_, i_206_, i_207_, Class501.aClass148Array5584[8], -1808163881);
				else if (class647_sub1_sub3_sub1_sub2.aClass210_12200 == Class210.aClass210_2260)
					Class203.method3705(class250, class145, i_201_, i_202_, i_206_, i_207_, Class501.aClass148Array5584[6], -910880241);
				else if (bool_211_)
					Class203.method3705(class250, class145, i_201_, i_202_, i_206_, i_207_, Class501.aClass148Array5584[4], -1339952316);
				else if (class647_sub1_sub3_sub1_sub2.isInAClan)
					Class203.method3705(class250, class145, i_201_, i_202_, i_206_, i_207_, Class501.aClass148Array5584[7], 1125865232);
				else if (bool)
					Class203.method3705(class250, class145, i_201_, i_202_, i_206_, i_207_, Class501.aClass148Array5584[3], 723143580);
				else if (bool_209_)
					Class203.method3705(class250, class145, i_201_, i_202_, i_206_, i_207_, Class501.aClass148Array5584[5], 1285186373);
				else
					Class203.method3705(class250, class145, i_201_, i_202_, i_206_, i_207_, Class501.aClass148Array5584[2], 1166639824);
			}
		}
	}

	static final void method8227(Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		int i_212_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = new StringBuilder().append(string).append(Class427.method6752(i_212_, true, -623425911)).toString();
	}
}
