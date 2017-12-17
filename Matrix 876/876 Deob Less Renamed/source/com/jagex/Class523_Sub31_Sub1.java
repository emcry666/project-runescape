/* Class523_Sub31_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class523_Sub31_Sub1 extends Class523_Sub31 {
	static final int anInt11857 = 0;
	short[] aShortArray11858;
	static final int anInt11859 = 4;
	static final int anInt11860 = 1638;
	static final boolean aBool11861 = true;
	int anInt11862;
	byte[] aByteArray11863 = new byte[512];
	short[] aShortArray11864;
	int anInt11865;
	int anInt11866;
	static final int anInt11867 = 4;
	int anInt11868;
	int anInt11869;
	boolean aBool11870;
	static final int anInt11871 = 8;

	Class523_Sub31_Sub1() {
		super(0, true);
		anInt11862 = 0;
		anInt11865 = -1255728836;
		anInt11866 = 1289965788;
		anInt11868 = 2041353860;
		anInt11869 = 1104235762;
		aBool11870 = true;
	}

	void method18283(int i, int[] is, int i_0_) {
		int i_1_ = Class41.anIntArray561[i] * (-1489297017 * anInt11866);
		if (1 == anInt11868 * 242351713) {
			int i_2_ = aShortArray11864[0];
			int i_3_ = aShortArray11858[0] << 12;
			int i_4_ = anInt11866 * -1489297017 * i_3_ >> 12;
			int i_5_ = i_3_ * (1483444399 * anInt11865) >> 12;
			int i_6_ = i_3_ * i_1_ >> 12;
			int i_7_ = i_6_ >> 12;
			int i_8_ = i_7_ + 1;
			if (i_8_ >= i_4_)
				i_8_ = 0;
			i_6_ &= 0xfff;
			int i_9_ = Class401.anIntArray4154[i_6_];
			int i_10_ = aByteArray11863[i_7_ & 0xff] & 0xff;
			int i_11_ = aByteArray11863[i_8_ & 0xff] & 0xff;
			if (aBool11870) {
				for (int i_12_ = 0; i_12_ < 1287694253 * Class41.anInt558; i_12_++) {
					int i_13_ = (1483444399 * anInt11865 * Class41.anIntArray560[i_12_]);
					int i_14_ = method18284(i_3_ * i_13_ >> 12, i_6_, i_10_, i_11_, i_9_, i_5_, 1936217061);
					i_14_ = i_14_ * i_2_ >> 12;
					is[i_12_] = 2048 + (i_14_ >> 1);
				}
			} else {
				for (int i_15_ = 0; i_15_ < Class41.anInt558 * 1287694253; i_15_++) {
					int i_16_ = (Class41.anIntArray560[i_15_] * (anInt11865 * 1483444399));
					int i_17_ = method18284(i_3_ * i_16_ >> 12, i_6_, i_10_, i_11_, i_9_, i_5_, -1540953874);
					is[i_15_] = i_2_ * i_17_ >> 12;
				}
			}
		} else {
			int i_18_ = aShortArray11864[0];
			if (i_18_ > 8 || i_18_ < -8) {
				int i_19_ = aShortArray11858[0] << 12;
				int i_20_ = anInt11866 * -1489297017 * i_19_ >> 12;
				int i_21_ = i_19_ * (anInt11865 * 1483444399) >> 12;
				int i_22_ = i_19_ * i_1_ >> 12;
				int i_23_ = i_22_ >> 12;
				int i_24_ = 1 + i_23_;
				if (i_24_ >= i_20_)
					i_24_ = 0;
				i_22_ &= 0xfff;
				int i_25_ = Class401.anIntArray4154[i_22_];
				int i_26_ = aByteArray11863[i_23_ & 0xff] & 0xff;
				int i_27_ = aByteArray11863[i_24_ & 0xff] & 0xff;
				for (int i_28_ = 0; i_28_ < 1287694253 * Class41.anInt558; i_28_++) {
					int i_29_ = (Class41.anIntArray560[i_28_] * (anInt11865 * 1483444399));
					int i_30_ = method18284(i_29_ * i_19_ >> 12, i_22_, i_26_, i_27_, i_25_, i_21_, 1065784517);
					is[i_28_] = i_30_ * i_18_ >> 12;
				}
			}
			for (int i_31_ = 1; i_31_ < 242351713 * anInt11868; i_31_++) {
				i_18_ = aShortArray11864[i_31_];
				if (i_18_ > 8 || i_18_ < -8) {
					int i_32_ = aShortArray11858[i_31_] << 12;
					int i_33_ = -1489297017 * anInt11866 * i_32_ >> 12;
					int i_34_ = 1483444399 * anInt11865 * i_32_ >> 12;
					int i_35_ = i_1_ * i_32_ >> 12;
					int i_36_ = i_35_ >> 12;
					int i_37_ = 1 + i_36_;
					if (i_37_ >= i_33_)
						i_37_ = 0;
					i_35_ &= 0xfff;
					int i_38_ = Class401.anIntArray4154[i_35_];
					int i_39_ = aByteArray11863[i_36_ & 0xff] & 0xff;
					int i_40_ = aByteArray11863[i_37_ & 0xff] & 0xff;
					if (aBool11870 && anInt11868 * 242351713 - 1 == i_31_) {
						for (int i_41_ = 0; i_41_ < Class41.anInt558 * 1287694253; i_41_++) {
							int i_42_ = (1483444399 * anInt11865 * Class41.anIntArray560[i_41_]);
							int i_43_ = method18284(i_42_ * i_32_ >> 12, i_35_, i_39_, i_40_, i_38_, i_34_, 133574962);
							i_43_ = is[i_41_] + (i_18_ * i_43_ >> 12);
							is[i_41_] = (i_43_ >> 1) + 2048;
						}
					} else {
						for (int i_44_ = 0; i_44_ < 1287694253 * Class41.anInt558; i_44_++) {
							int i_45_ = (Class41.anIntArray560[i_44_] * (anInt11865 * 1483444399));
							int i_46_ = method18284(i_45_ * i_32_ >> 12, i_35_, i_39_, i_40_, i_38_, i_34_, 1741221510);
							is[i_44_] += i_18_ * i_46_ >> 12;
						}
					}
				}
			}
		}
	}

	int method18284(int i, int i_47_, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_) {
		int i_53_ = i >> 12;
		int i_54_ = i_53_ + 1;
		if (i_54_ >= i_51_)
			i_54_ = 0;
		i &= 0xfff;
		i_53_ &= 0xff;
		i_54_ &= 0xff;
		int i_55_ = i - 4096;
		int i_56_ = i_47_ - 4096;
		int i_57_ = Class401.anIntArray4154[i];
		int i_58_ = aByteArray11863[i_53_ + i_48_] & 0x3;
		int i_59_;
		if (i_58_ <= 1)
			i_59_ = 0 == i_58_ ? i + i_47_ : i_47_ - i;
		else
			i_59_ = 2 == i_58_ ? i - i_47_ : -i - i_47_;
		i_58_ = aByteArray11863[i_48_ + i_54_] & 0x3;
		int i_60_;
		if (i_58_ <= 1)
			i_60_ = 0 == i_58_ ? i_55_ + i_47_ : i_47_ - i_55_;
		else
			i_60_ = i_58_ == 2 ? i_55_ - i_47_ : -i_55_ - i_47_;
		int i_61_ = ((i_60_ - i_59_) * i_57_ >> 12) + i_59_;
		i_58_ = aByteArray11863[i_53_ + i_49_] & 0x3;
		if (i_58_ <= 1)
			i_59_ = 0 == i_58_ ? i + i_56_ : i_56_ - i;
		else
			i_59_ = 2 == i_58_ ? i - i_56_ : -i - i_56_;
		i_58_ = aByteArray11863[i_54_ + i_49_] & 0x3;
		if (i_58_ <= 1)
			i_60_ = i_58_ == 0 ? i_55_ + i_56_ : i_56_ - i_55_;
		else
			i_60_ = i_58_ == 2 ? i_55_ - i_56_ : -i_55_ - i_56_;
		int i_62_ = i_59_ + ((i_60_ - i_59_) * i_57_ >> 12);
		return i_61_ + ((i_62_ - i_61_) * i_50_ >> 12);
	}

	public static int[][] method18285(int i, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_, float f, boolean bool) {
		int[][] is = new int[i_63_][i];
		Class523_Sub31_Sub1 class523_sub31_sub1 = new Class523_Sub31_Sub1();
		class523_sub31_sub1.aBool11870 = bool;
		class523_sub31_sub1.anInt11865 = -1387674033 * i_65_;
		class523_sub31_sub1.anInt11866 = 1396233271 * i_66_;
		class523_sub31_sub1.anInt11868 = i_67_ * -563403359;
		class523_sub31_sub1.anInt11869 = (int) (f * 4096.0F) * -898699357;
		class523_sub31_sub1.method18288((byte) -38);
		Class41.method1139(i, i_63_, (short) -21258);
		for (int i_68_ = 0; i_68_ < i_63_; i_68_++)
			class523_sub31_sub1.method18283(i_68_, is[i_68_], -69917916);
		return is;
	}

	void method18286(int i) {
		if (anInt11869 * 700496907 > 0) {
			aShortArray11864 = new short[242351713 * anInt11868];
			aShortArray11858 = new short[anInt11868 * 242351713];
			for (int i_69_ = 0; i_69_ < anInt11868 * 242351713; i_69_++) {
				aShortArray11864[i_69_] = (short) (int) (Math.pow((double) ((float) (anInt11869 * 700496907) / 4096.0F), (double) i_69_) * 4096.0);
				aShortArray11858[i_69_] = (short) (int) Math.pow(2.0, (double) i_69_);
			}
		} else if (aShortArray11864 != null && aShortArray11864.length == anInt11868 * 242351713) {
			aShortArray11858 = new short[242351713 * anInt11868];
			for (int i_70_ = 0; i_70_ < 242351713 * anInt11868; i_70_++)
				aShortArray11858[i_70_] = (short) (int) Math.pow(2.0, (double) i_70_);
		}
	}

	public static int[][] method18287(int i, int i_71_, int i_72_, int i_73_, int i_74_, int i_75_, float f, boolean bool) {
		int[][] is = new int[i_71_][i];
		Class523_Sub31_Sub1 class523_sub31_sub1 = new Class523_Sub31_Sub1();
		class523_sub31_sub1.aBool11870 = bool;
		class523_sub31_sub1.anInt11865 = -1387674033 * i_73_;
		class523_sub31_sub1.anInt11866 = 1396233271 * i_74_;
		class523_sub31_sub1.anInt11868 = i_75_ * -563403359;
		class523_sub31_sub1.anInt11869 = (int) (f * 4096.0F) * -898699357;
		class523_sub31_sub1.method18288((byte) 37);
		Class41.method1139(i, i_71_, (short) -4852);
		for (int i_76_ = 0; i_76_ < i_71_; i_76_++)
			class523_sub31_sub1.method18283(i_76_, is[i_76_], 224480420);
		return is;
	}

	void method18288(byte i) {
		aByteArray11863 = Class41.method1140(anInt11862 * 609032491, (byte) -4);
		method18286(1207555600);
		for (int i_77_ = anInt11868 * 242351713 - 1; i_77_ >= 1; i_77_--) {
			short i_78_ = aShortArray11864[i_77_];
			if (i_78_ > 8 || i_78_ < -8)
				break;
			anInt11868 -= -563403359;
		}
	}

	public static int[] method18289(int i, int i_79_, int i_80_, int i_81_, int i_82_, float f, boolean bool) {
		int[] is = new int[i];
		Class523_Sub31_Sub1 class523_sub31_sub1 = new Class523_Sub31_Sub1();
		class523_sub31_sub1.anInt11862 = -864625277 * i_79_;
		class523_sub31_sub1.aBool11870 = bool;
		class523_sub31_sub1.anInt11865 = -1387674033 * i_80_;
		class523_sub31_sub1.anInt11866 = 1396233271 * i_81_;
		class523_sub31_sub1.anInt11868 = -563403359 * i_82_;
		class523_sub31_sub1.anInt11869 = -898699357 * (int) (4096.0F * f);
		class523_sub31_sub1.method18288((byte) 17);
		Class41.method1139(i, 1, (short) -3470);
		class523_sub31_sub1.method18283(0, is, 867694874);
		return is;
	}

	void method18290() {
		aByteArray11863 = Class41.method1140(anInt11862 * 609032491, (byte) -110);
		method18286(2034295598);
		for (int i = anInt11868 * 242351713 - 1; i >= 1; i--) {
			short i_83_ = aShortArray11864[i];
			if (i_83_ > 8 || i_83_ < -8)
				break;
			anInt11868 -= -563403359;
		}
	}

	public static int[] method18291(int i, int i_84_, int i_85_, int i_86_, int i_87_, float f, boolean bool) {
		int[] is = new int[i];
		Class523_Sub31_Sub1 class523_sub31_sub1 = new Class523_Sub31_Sub1();
		class523_sub31_sub1.anInt11862 = -864625277 * i_84_;
		class523_sub31_sub1.aBool11870 = bool;
		class523_sub31_sub1.anInt11865 = -1387674033 * i_85_;
		class523_sub31_sub1.anInt11866 = 1396233271 * i_86_;
		class523_sub31_sub1.anInt11868 = -563403359 * i_87_;
		class523_sub31_sub1.anInt11869 = -898699357 * (int) (4096.0F * f);
		class523_sub31_sub1.method18288((byte) -73);
		Class41.method1139(i, 1, (short) -27690);
		class523_sub31_sub1.method18283(0, is, 261546635);
		return is;
	}

	public static int[][] method18292(int i, int i_88_, int i_89_, int i_90_, int i_91_, int i_92_, float f, boolean bool) {
		int[][] is = new int[i_88_][i];
		Class523_Sub31_Sub1 class523_sub31_sub1 = new Class523_Sub31_Sub1();
		class523_sub31_sub1.aBool11870 = bool;
		class523_sub31_sub1.anInt11865 = -1387674033 * i_90_;
		class523_sub31_sub1.anInt11866 = 1396233271 * i_91_;
		class523_sub31_sub1.anInt11868 = i_92_ * -563403359;
		class523_sub31_sub1.anInt11869 = (int) (f * 4096.0F) * -898699357;
		class523_sub31_sub1.method18288((byte) 35);
		Class41.method1139(i, i_88_, (short) -21926);
		for (int i_93_ = 0; i_93_ < i_88_; i_93_++)
			class523_sub31_sub1.method18283(i_93_, is[i_93_], 1551422096);
		return is;
	}

	public static int[] method18293(int i, int i_94_, int i_95_, int i_96_, int i_97_, float f, boolean bool) {
		int[] is = new int[i];
		Class523_Sub31_Sub1 class523_sub31_sub1 = new Class523_Sub31_Sub1();
		class523_sub31_sub1.anInt11862 = -864625277 * i_94_;
		class523_sub31_sub1.aBool11870 = bool;
		class523_sub31_sub1.anInt11865 = -1387674033 * i_95_;
		class523_sub31_sub1.anInt11866 = 1396233271 * i_96_;
		class523_sub31_sub1.anInt11868 = -563403359 * i_97_;
		class523_sub31_sub1.anInt11869 = -898699357 * (int) (4096.0F * f);
		class523_sub31_sub1.method18288((byte) 30);
		Class41.method1139(i, 1, (short) -10546);
		class523_sub31_sub1.method18283(0, is, 1871427112);
		return is;
	}

	public static int[][] method18294(int i, int i_98_, int i_99_, int i_100_, int i_101_, int i_102_, float f, boolean bool) {
		int[][] is = new int[i_98_][i];
		Class523_Sub31_Sub1 class523_sub31_sub1 = new Class523_Sub31_Sub1();
		class523_sub31_sub1.aBool11870 = bool;
		class523_sub31_sub1.anInt11865 = -1387674033 * i_100_;
		class523_sub31_sub1.anInt11866 = 1396233271 * i_101_;
		class523_sub31_sub1.anInt11868 = i_102_ * -563403359;
		class523_sub31_sub1.anInt11869 = (int) (f * 4096.0F) * -898699357;
		class523_sub31_sub1.method18288((byte) 24);
		Class41.method1139(i, i_98_, (short) -6897);
		for (int i_103_ = 0; i_103_ < i_98_; i_103_++)
			class523_sub31_sub1.method18283(i_103_, is[i_103_], 218983024);
		return is;
	}

	int method18295(int i, int i_104_, int i_105_, int i_106_, int i_107_, int i_108_) {
		int i_109_ = i >> 12;
		int i_110_ = i_109_ + 1;
		if (i_110_ >= i_108_)
			i_110_ = 0;
		i &= 0xfff;
		i_109_ &= 0xff;
		i_110_ &= 0xff;
		int i_111_ = i - 4096;
		int i_112_ = i_104_ - 4096;
		int i_113_ = Class401.anIntArray4154[i];
		int i_114_ = aByteArray11863[i_109_ + i_105_] & 0x3;
		int i_115_;
		if (i_114_ <= 1)
			i_115_ = 0 == i_114_ ? i + i_104_ : i_104_ - i;
		else
			i_115_ = 2 == i_114_ ? i - i_104_ : -i - i_104_;
		i_114_ = aByteArray11863[i_105_ + i_110_] & 0x3;
		int i_116_;
		if (i_114_ <= 1)
			i_116_ = 0 == i_114_ ? i_111_ + i_104_ : i_104_ - i_111_;
		else
			i_116_ = i_114_ == 2 ? i_111_ - i_104_ : -i_111_ - i_104_;
		int i_117_ = ((i_116_ - i_115_) * i_113_ >> 12) + i_115_;
		i_114_ = aByteArray11863[i_109_ + i_106_] & 0x3;
		if (i_114_ <= 1)
			i_115_ = 0 == i_114_ ? i + i_112_ : i_112_ - i;
		else
			i_115_ = 2 == i_114_ ? i - i_112_ : -i - i_112_;
		i_114_ = aByteArray11863[i_110_ + i_106_] & 0x3;
		if (i_114_ <= 1)
			i_116_ = i_114_ == 0 ? i_111_ + i_112_ : i_112_ - i_111_;
		else
			i_116_ = i_114_ == 2 ? i_111_ - i_112_ : -i_111_ - i_112_;
		int i_118_ = i_115_ + ((i_116_ - i_115_) * i_113_ >> 12);
		return i_117_ + ((i_118_ - i_117_) * i_107_ >> 12);
	}
}
