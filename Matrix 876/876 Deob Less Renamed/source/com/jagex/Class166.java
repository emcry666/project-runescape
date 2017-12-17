/* Class166 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class166 {
	static final int anInt1793 = 0;
	static final int anInt1794 = 1;
	static final int anInt1795 = 0;

	public static Class175[] method2657(Class472 class472, int i, int i_0_) {
		byte[] is = class472.method7688(i, i_0_, 219270927);
		if (is == null)
			return null;
		return method2661(is);
	}

	public static Class175 method2658(Class472 class472, int i, int i_1_) {
		byte[] is = class472.method7688(i, i_1_, 1677712155);
		if (is == null)
			return null;
		return method2661(is)[0];
	}

	public static Class175 method2659(Class472 class472, int i) {
		byte[] is = class472.method7721(i, -387132909);
		if (is == null)
			return null;
		return method2661(is)[0];
	}

	public static Class175 method2660(Class472 class472, int i, int i_2_) {
		byte[] is = class472.method7688(i, i_2_, -125282528);
		if (is == null)
			return null;
		return method2661(is)[0];
	}

	Class166() throws Throwable {
		throw new Error();
	}

	public static Class175[] method2661(byte[] is) {
		Class523_Sub34 class523_sub34 = new Class523_Sub34(is);
		class523_sub34.anInt10661 = (is.length - 2) * 189765723;
		int i = class523_sub34.readUnsignedShort(-1673225326);
		int i_3_ = i >> 15;
		int i_4_ = i & 0x7fff;
		if (i_3_ == 0) {
			Class175_Sub2[] class175_sub2s = new Class175_Sub2[i_4_];
			for (int i_5_ = 0; i_5_ < i_4_; i_5_++)
				class175_sub2s[i_5_] = new Class175_Sub2();
			class523_sub34.anInt10661 = (is.length - 7 - i_4_ * 8) * 189765723;
			int i_6_ = class523_sub34.readUnsignedShort(-110360972);
			int i_7_ = class523_sub34.readUnsignedShort(-852499334);
			int i_8_ = (class523_sub34.readUnsignedByte(-1843511527) & 0xff) + 1;
			for (int i_9_ = 0; i_9_ < i_4_; i_9_++)
				class175_sub2s[i_9_].anInt9852 = class523_sub34.readUnsignedShort(-1204680437);
			for (int i_10_ = 0; i_10_ < i_4_; i_10_++)
				class175_sub2s[i_10_].anInt9851 = class523_sub34.readUnsignedShort(-929526909);
			for (int i_11_ = 0; i_11_ < i_4_; i_11_++)
				class175_sub2s[i_11_].anInt9854 = class523_sub34.readUnsignedShort(-1479130794);
			for (int i_12_ = 0; i_12_ < i_4_; i_12_++)
				class175_sub2s[i_12_].anInt9853 = class523_sub34.readUnsignedShort(-718300154);
			for (int i_13_ = 0; i_13_ < i_4_; i_13_++) {
				Class175_Sub2 class175_sub2 = class175_sub2s[i_13_];
				class175_sub2.anInt9855 = i_6_ - class175_sub2.anInt9854 - class175_sub2.anInt9852;
				class175_sub2.anInt9856 = i_7_ - class175_sub2.anInt9853 - class175_sub2.anInt9851;
			}
			class523_sub34.anInt10661 = (is.length - 7 - i_4_ * 8 - (i_8_ - 1) * 3) * 189765723;
			int[] is_14_ = new int[i_8_];
			for (int i_15_ = 1; i_15_ < i_8_; i_15_++) {
				is_14_[i_15_] = class523_sub34.read24BitInt(-1207311508);
				if (is_14_[i_15_] == 0)
					is_14_[i_15_] = 1;
			}
			for (int i_16_ = 0; i_16_ < i_4_; i_16_++)
				class175_sub2s[i_16_].anIntArray9850 = is_14_;
			class523_sub34.anInt10661 = 0;
			for (int i_17_ = 0; i_17_ < i_4_; i_17_++) {
				Class175_Sub2 class175_sub2 = class175_sub2s[i_17_];
				int i_18_ = class175_sub2.anInt9854 * class175_sub2.anInt9853;
				class175_sub2.aByteArray9857 = new byte[i_18_];
				int i_19_ = class523_sub34.readUnsignedByte(1822535168);
				if ((i_19_ & 0x2) == 0) {
					if ((i_19_ & 0x1) == 0) {
						for (int i_20_ = 0; i_20_ < i_18_; i_20_++)
							class175_sub2.aByteArray9857[i_20_] = class523_sub34.readByte((short) -11091);
					} else {
						for (int i_21_ = 0; i_21_ < class175_sub2.anInt9854; i_21_++) {
							for (int i_22_ = 0; i_22_ < class175_sub2.anInt9853; i_22_++)
								class175_sub2.aByteArray9857[i_21_ + i_22_ * class175_sub2.anInt9854] = class523_sub34.readByte((short) -1231);
						}
					}
				} else {
					boolean bool = false;
					class175_sub2.aByteArray9858 = new byte[i_18_];
					if ((i_19_ & 0x1) == 0) {
						for (int i_23_ = 0; i_23_ < i_18_; i_23_++)
							class175_sub2.aByteArray9857[i_23_] = class523_sub34.readByte((short) -21136);
						for (int i_24_ = 0; i_24_ < i_18_; i_24_++) {
							byte i_25_ = (class175_sub2.aByteArray9858[i_24_] = class523_sub34.readByte((short) -26361));
							bool = bool | i_25_ != -1;
						}
					} else {
						for (int i_26_ = 0; i_26_ < class175_sub2.anInt9854; i_26_++) {
							for (int i_27_ = 0; i_27_ < class175_sub2.anInt9853; i_27_++)
								class175_sub2.aByteArray9857[i_26_ + i_27_ * class175_sub2.anInt9854] = class523_sub34.readByte((short) -3529);
						}
						for (int i_28_ = 0; i_28_ < class175_sub2.anInt9854; i_28_++) {
							for (int i_29_ = 0; i_29_ < class175_sub2.anInt9853; i_29_++) {
								byte i_30_ = (class175_sub2.aByteArray9858[i_28_ + i_29_ * (class175_sub2.anInt9854)] = class523_sub34.readByte((short) -19878));
								bool = bool | i_30_ != -1;
							}
						}
					}
					if (!bool)
						class175_sub2.aByteArray9858 = null;
				}
			}
			return class175_sub2s;
		}
		Class175_Sub1[] class175_sub1s = new Class175_Sub1[i_4_];
		class523_sub34.anInt10661 = 0;
		int i_31_ = class523_sub34.readUnsignedByte(-2046612730);
		if (i_31_ == 0) {
			boolean bool = class523_sub34.readUnsignedByte(57780008) == 1;
			int i_32_ = class523_sub34.readUnsignedShort(-1260246326);
			int i_33_ = class523_sub34.readUnsignedShort(-1028230929);
			for (int i_34_ = 0; i_34_ < i_4_; i_34_++) {
				int[] is_35_ = new int[i_32_ * i_33_];
				for (int i_36_ = 0; i_36_ < i_32_ * i_33_; i_36_++) {
					is_35_[i_36_] = ~0xffffff | class523_sub34.read24BitInt(-1551748095);
					if (is_35_[i_36_] == -65281)
						is_35_[i_36_] = 0;
				}
				if (bool) {
					for (int i_37_ = 0; i_37_ < i_32_ * i_33_; i_37_++) {
						is_35_[i_37_] &= 0xffffff;
						is_35_[i_37_] |= class523_sub34.readUnsignedByte(237278656) << 24;
					}
				}
				class175_sub1s[i_34_] = new Class175_Sub1(i_32_, i_33_, is_35_);
			}
		} else {
			if (i_31_ == 1)
				throw new UnsupportedOperationException();
			throw new RuntimeException();
		}
		return class175_sub1s;
	}

	public static Class175[] method2662(Class472 class472, int i) {
		byte[] is = class472.method7721(i, -387132909);
		if (is == null)
			return null;
		return method2661(is);
	}

	public static Class175 method2663(Class472 class472, int i, int i_38_) {
		byte[] is = class472.method7688(i, i_38_, 699336258);
		if (is == null)
			return null;
		return method2661(is)[0];
	}

	public static Class175 method2664(Class472 class472, int i, int i_39_) {
		byte[] is = class472.method7688(i, i_39_, 1762652243);
		if (is == null)
			return null;
		return method2661(is)[0];
	}

	public static Class175 method2665(Class472 class472, int i) {
		byte[] is = class472.method7721(i, -387132909);
		if (is == null)
			return null;
		return method2661(is)[0];
	}

	public static Class175[] method2666(Class472 class472, int i, int i_40_) {
		byte[] is = class472.method7688(i, i_40_, 1277769158);
		if (is == null)
			return null;
		return method2661(is);
	}

	public static Class175[] method2667(byte[] is) {
		Class523_Sub34 class523_sub34 = new Class523_Sub34(is);
		class523_sub34.anInt10661 = (is.length - 2) * 189765723;
		int i = class523_sub34.readUnsignedShort(-1795335912);
		int i_41_ = i >> 15;
		int i_42_ = i & 0x7fff;
		if (i_41_ == 0) {
			Class175_Sub2[] class175_sub2s = new Class175_Sub2[i_42_];
			for (int i_43_ = 0; i_43_ < i_42_; i_43_++)
				class175_sub2s[i_43_] = new Class175_Sub2();
			class523_sub34.anInt10661 = (is.length - 7 - i_42_ * 8) * 189765723;
			int i_44_ = class523_sub34.readUnsignedShort(-1842175246);
			int i_45_ = class523_sub34.readUnsignedShort(-593207597);
			int i_46_ = (class523_sub34.readUnsignedByte(1016494058) & 0xff) + 1;
			for (int i_47_ = 0; i_47_ < i_42_; i_47_++)
				class175_sub2s[i_47_].anInt9852 = class523_sub34.readUnsignedShort(-1992629194);
			for (int i_48_ = 0; i_48_ < i_42_; i_48_++)
				class175_sub2s[i_48_].anInt9851 = class523_sub34.readUnsignedShort(-1284262781);
			for (int i_49_ = 0; i_49_ < i_42_; i_49_++)
				class175_sub2s[i_49_].anInt9854 = class523_sub34.readUnsignedShort(-367816534);
			for (int i_50_ = 0; i_50_ < i_42_; i_50_++)
				class175_sub2s[i_50_].anInt9853 = class523_sub34.readUnsignedShort(-1307359455);
			for (int i_51_ = 0; i_51_ < i_42_; i_51_++) {
				Class175_Sub2 class175_sub2 = class175_sub2s[i_51_];
				class175_sub2.anInt9855 = (i_44_ - class175_sub2.anInt9854 - class175_sub2.anInt9852);
				class175_sub2.anInt9856 = (i_45_ - class175_sub2.anInt9853 - class175_sub2.anInt9851);
			}
			class523_sub34.anInt10661 = (is.length - 7 - i_42_ * 8 - (i_46_ - 1) * 3) * 189765723;
			int[] is_52_ = new int[i_46_];
			for (int i_53_ = 1; i_53_ < i_46_; i_53_++) {
				is_52_[i_53_] = class523_sub34.read24BitInt(-356775548);
				if (is_52_[i_53_] == 0)
					is_52_[i_53_] = 1;
			}
			for (int i_54_ = 0; i_54_ < i_42_; i_54_++)
				class175_sub2s[i_54_].anIntArray9850 = is_52_;
			class523_sub34.anInt10661 = 0;
			for (int i_55_ = 0; i_55_ < i_42_; i_55_++) {
				Class175_Sub2 class175_sub2 = class175_sub2s[i_55_];
				int i_56_ = class175_sub2.anInt9854 * class175_sub2.anInt9853;
				class175_sub2.aByteArray9857 = new byte[i_56_];
				int i_57_ = class523_sub34.readUnsignedByte(-1750447852);
				if ((i_57_ & 0x2) == 0) {
					if ((i_57_ & 0x1) == 0) {
						for (int i_58_ = 0; i_58_ < i_56_; i_58_++)
							class175_sub2.aByteArray9857[i_58_] = class523_sub34.readByte((short) -24811);
					} else {
						for (int i_59_ = 0; i_59_ < class175_sub2.anInt9854; i_59_++) {
							for (int i_60_ = 0; i_60_ < class175_sub2.anInt9853; i_60_++)
								class175_sub2.aByteArray9857[i_59_ + i_60_ * class175_sub2.anInt9854] = class523_sub34.readByte((short) -15357);
						}
					}
				} else {
					boolean bool = false;
					class175_sub2.aByteArray9858 = new byte[i_56_];
					if ((i_57_ & 0x1) == 0) {
						for (int i_61_ = 0; i_61_ < i_56_; i_61_++)
							class175_sub2.aByteArray9857[i_61_] = class523_sub34.readByte((short) -20235);
						for (int i_62_ = 0; i_62_ < i_56_; i_62_++) {
							byte i_63_ = (class175_sub2.aByteArray9858[i_62_] = class523_sub34.readByte((short) -28922));
							bool = bool | i_63_ != -1;
						}
					} else {
						for (int i_64_ = 0; i_64_ < class175_sub2.anInt9854; i_64_++) {
							for (int i_65_ = 0; i_65_ < class175_sub2.anInt9853; i_65_++)
								class175_sub2.aByteArray9857[i_64_ + i_65_ * class175_sub2.anInt9854] = class523_sub34.readByte((short) -28109);
						}
						for (int i_66_ = 0; i_66_ < class175_sub2.anInt9854; i_66_++) {
							for (int i_67_ = 0; i_67_ < class175_sub2.anInt9853; i_67_++) {
								byte i_68_ = (class175_sub2.aByteArray9858[i_66_ + i_67_ * (class175_sub2.anInt9854)] = class523_sub34.readByte((short) -23434));
								bool = bool | i_68_ != -1;
							}
						}
					}
					if (!bool)
						class175_sub2.aByteArray9858 = null;
				}
			}
			return class175_sub2s;
		}
		Class175_Sub1[] class175_sub1s = new Class175_Sub1[i_42_];
		class523_sub34.anInt10661 = 0;
		int i_69_ = class523_sub34.readUnsignedByte(930219170);
		if (i_69_ == 0) {
			boolean bool = class523_sub34.readUnsignedByte(1602521601) == 1;
			int i_70_ = class523_sub34.readUnsignedShort(-433877499);
			int i_71_ = class523_sub34.readUnsignedShort(-578655525);
			for (int i_72_ = 0; i_72_ < i_42_; i_72_++) {
				int[] is_73_ = new int[i_70_ * i_71_];
				for (int i_74_ = 0; i_74_ < i_70_ * i_71_; i_74_++) {
					is_73_[i_74_] = ~0xffffff | class523_sub34.read24BitInt(-1258856242);
					if (is_73_[i_74_] == -65281)
						is_73_[i_74_] = 0;
				}
				if (bool) {
					for (int i_75_ = 0; i_75_ < i_70_ * i_71_; i_75_++) {
						is_73_[i_75_] &= 0xffffff;
						is_73_[i_75_] |= class523_sub34.readUnsignedByte(-162498272) << 24;
					}
				}
				class175_sub1s[i_72_] = new Class175_Sub1(i_70_, i_71_, is_73_);
			}
		} else {
			if (i_69_ == 1)
				throw new UnsupportedOperationException();
			throw new RuntimeException();
		}
		return class175_sub1s;
	}

	public static Class175[] method2668(Class472 class472, int i, int i_76_) {
		byte[] is = class472.method7688(i, i_76_, -1758658525);
		if (is == null)
			return null;
		return method2661(is);
	}

	public static Class175[] method2669(byte[] is) {
		Class523_Sub34 class523_sub34 = new Class523_Sub34(is);
		class523_sub34.anInt10661 = (is.length - 2) * 189765723;
		int i = class523_sub34.readUnsignedShort(-768075822);
		int i_77_ = i >> 15;
		int i_78_ = i & 0x7fff;
		if (i_77_ == 0) {
			Class175_Sub2[] class175_sub2s = new Class175_Sub2[i_78_];
			for (int i_79_ = 0; i_79_ < i_78_; i_79_++)
				class175_sub2s[i_79_] = new Class175_Sub2();
			class523_sub34.anInt10661 = (is.length - 7 - i_78_ * 8) * 189765723;
			int i_80_ = class523_sub34.readUnsignedShort(-572505461);
			int i_81_ = class523_sub34.readUnsignedShort(-1156615871);
			int i_82_ = (class523_sub34.readUnsignedByte(-345670015) & 0xff) + 1;
			for (int i_83_ = 0; i_83_ < i_78_; i_83_++)
				class175_sub2s[i_83_].anInt9852 = class523_sub34.readUnsignedShort(-294150929);
			for (int i_84_ = 0; i_84_ < i_78_; i_84_++)
				class175_sub2s[i_84_].anInt9851 = class523_sub34.readUnsignedShort(-1776042709);
			for (int i_85_ = 0; i_85_ < i_78_; i_85_++)
				class175_sub2s[i_85_].anInt9854 = class523_sub34.readUnsignedShort(-1338982538);
			for (int i_86_ = 0; i_86_ < i_78_; i_86_++)
				class175_sub2s[i_86_].anInt9853 = class523_sub34.readUnsignedShort(-1048750038);
			for (int i_87_ = 0; i_87_ < i_78_; i_87_++) {
				Class175_Sub2 class175_sub2 = class175_sub2s[i_87_];
				class175_sub2.anInt9855 = (i_80_ - class175_sub2.anInt9854 - class175_sub2.anInt9852);
				class175_sub2.anInt9856 = (i_81_ - class175_sub2.anInt9853 - class175_sub2.anInt9851);
			}
			class523_sub34.anInt10661 = (is.length - 7 - i_78_ * 8 - (i_82_ - 1) * 3) * 189765723;
			int[] is_88_ = new int[i_82_];
			for (int i_89_ = 1; i_89_ < i_82_; i_89_++) {
				is_88_[i_89_] = class523_sub34.read24BitInt(407778642);
				if (is_88_[i_89_] == 0)
					is_88_[i_89_] = 1;
			}
			for (int i_90_ = 0; i_90_ < i_78_; i_90_++)
				class175_sub2s[i_90_].anIntArray9850 = is_88_;
			class523_sub34.anInt10661 = 0;
			for (int i_91_ = 0; i_91_ < i_78_; i_91_++) {
				Class175_Sub2 class175_sub2 = class175_sub2s[i_91_];
				int i_92_ = class175_sub2.anInt9854 * class175_sub2.anInt9853;
				class175_sub2.aByteArray9857 = new byte[i_92_];
				int i_93_ = class523_sub34.readUnsignedByte(682437372);
				if ((i_93_ & 0x2) == 0) {
					if ((i_93_ & 0x1) == 0) {
						for (int i_94_ = 0; i_94_ < i_92_; i_94_++)
							class175_sub2.aByteArray9857[i_94_] = class523_sub34.readByte((short) -14183);
					} else {
						for (int i_95_ = 0; i_95_ < class175_sub2.anInt9854; i_95_++) {
							for (int i_96_ = 0; i_96_ < class175_sub2.anInt9853; i_96_++)
								class175_sub2.aByteArray9857[i_95_ + i_96_ * class175_sub2.anInt9854] = class523_sub34.readByte((short) -18596);
						}
					}
				} else {
					boolean bool = false;
					class175_sub2.aByteArray9858 = new byte[i_92_];
					if ((i_93_ & 0x1) == 0) {
						for (int i_97_ = 0; i_97_ < i_92_; i_97_++)
							class175_sub2.aByteArray9857[i_97_] = class523_sub34.readByte((short) -16932);
						for (int i_98_ = 0; i_98_ < i_92_; i_98_++) {
							byte i_99_ = (class175_sub2.aByteArray9858[i_98_] = class523_sub34.readByte((short) -27560));
							bool = bool | i_99_ != -1;
						}
					} else {
						for (int i_100_ = 0; i_100_ < class175_sub2.anInt9854; i_100_++) {
							for (int i_101_ = 0; i_101_ < class175_sub2.anInt9853; i_101_++)
								class175_sub2.aByteArray9857[i_100_ + i_101_ * class175_sub2.anInt9854] = class523_sub34.readByte((short) -18609);
						}
						for (int i_102_ = 0; i_102_ < class175_sub2.anInt9854; i_102_++) {
							for (int i_103_ = 0; i_103_ < class175_sub2.anInt9853; i_103_++) {
								byte i_104_ = (class175_sub2.aByteArray9858[i_102_ + i_103_ * (class175_sub2.anInt9854)] = class523_sub34.readByte((short) -17327));
								bool = bool | i_104_ != -1;
							}
						}
					}
					if (!bool)
						class175_sub2.aByteArray9858 = null;
				}
			}
			return class175_sub2s;
		}
		Class175_Sub1[] class175_sub1s = new Class175_Sub1[i_78_];
		class523_sub34.anInt10661 = 0;
		int i_105_ = class523_sub34.readUnsignedByte(-824631206);
		if (i_105_ == 0) {
			boolean bool = class523_sub34.readUnsignedByte(1065439456) == 1;
			int i_106_ = class523_sub34.readUnsignedShort(-692368592);
			int i_107_ = class523_sub34.readUnsignedShort(-1161848820);
			for (int i_108_ = 0; i_108_ < i_78_; i_108_++) {
				int[] is_109_ = new int[i_106_ * i_107_];
				for (int i_110_ = 0; i_110_ < i_106_ * i_107_; i_110_++) {
					is_109_[i_110_] = ~0xffffff | class523_sub34.read24BitInt(932438556);
					if (is_109_[i_110_] == -65281)
						is_109_[i_110_] = 0;
				}
				if (bool) {
					for (int i_111_ = 0; i_111_ < i_106_ * i_107_; i_111_++) {
						is_109_[i_111_] &= 0xffffff;
						is_109_[i_111_] |= class523_sub34.readUnsignedByte(280464623) << 24;
					}
				}
				class175_sub1s[i_108_] = new Class175_Sub1(i_106_, i_107_, is_109_);
			}
		} else {
			if (i_105_ == 1)
				throw new UnsupportedOperationException();
			throw new RuntimeException();
		}
		return class175_sub1s;
	}

	public static Class175[] method2670(Class472 class472, int i, int i_112_) {
		byte[] is = class472.method7688(i, i_112_, -1164758058);
		if (is == null)
			return null;
		return method2661(is);
	}

	public static Class175[] method2671(Class472 class472, int i) {
		byte[] is = class472.method7721(i, -387132909);
		if (is == null)
			return null;
		return method2661(is);
	}

	public static Class175[] method2672(Class472 class472, int i, int i_113_) {
		byte[] is = class472.method7688(i, i_113_, -473090791);
		if (is == null)
			return null;
		return method2661(is);
	}

	public static Class175[] method2673(Class472 class472, int i, int i_114_) {
		byte[] is = class472.method7688(i, i_114_, 1267901169);
		if (is == null)
			return null;
		return method2661(is);
	}
}
