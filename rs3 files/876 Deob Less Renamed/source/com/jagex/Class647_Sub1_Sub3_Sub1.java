/* Class647_Sub1_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class647_Sub1_Sub3_Sub1 extends Class647_Sub1_Sub3 implements Interface31 {
	public int[] anIntArray11885;
	public Class72 aClass72_11886;
	public Class707_Sub1 aClass707_Sub1_11887;
	public int anInt11888 = 1926162379;
	public int anInt11889;
	int anInt11890;
	public boolean aBool11891;
	public boolean aBool11892;
	public int anInt11893;
	public int[] anIntArray11894;
	public int anInt11895;
	public int anInt11896;
	int anInt11897;
	int anInt11898;
	int anInt11899;
	Class533 aClass533_11900;
	int anInt11901;
	byte aByte11902;
	public int[] anIntArray11903;
	public int[] anIntArray11904;
	public int[] anIntArray11905;
	public int[] anIntArray11906;
	public int[] anIntArray11907;
	public int anInt11908;
	public int anInt11909;
	static final int anInt11910 = 20;
	public int[] anIntArray11911;
	public Class515[] aClass515Array11912;
	public Class707 aClass707_11913;
	static final int anInt11914 = 5;
	public int anInt11915;
	public int anInt11916;
	public int anInt11917;
	public int anInt11918;
	boolean aBool11919;
	public Class701 aClass701_11920;
	int anInt11921;
	public int anInt11922;
	public int anInt11923;
	public int anInt11924;
	public int anInt11925;
	public byte aByte11926;
	public byte aByte11927;
	public Class167[] aClass167Array11928;
	public byte aByte11929;
	int anInt11930;
	int anInt11931;
	public int anInt11932;
	public Class707_Sub2_Sub1[] aClass707_Sub2_Sub1Array11933;
	public int[] anIntArray11934;
	public int anInt11935;
	public byte aByte11936;
	public int anInt11937;
	public Class72 aClass72_11938;
	public Class72 aClass72_11939;
	public int anInt11940;
	public int anInt11941;
	int anInt11942 = -1603948693;
	public int[] anIntArray11943;
	public byte[] aByteArray11944;
	public int anInt11945;
	public int anInt11946;
	public int anInt11947;
	Class621 aClass621_11948;
	boolean aBool11949;
	public int anInt11950;
	int anInt11951;
	public Interface2 anInterface2_11952;
	Class242 aClass242_11953;
	public int anInt11954;
	int anInt11955;
	public Interface20 anInterface20_11956;
	public static Class298_Sub1 aClass298_Sub1_11957;

	public abstract int method18327();

	public int method16722() {
		Class588 class588 = method18352(351754182);
		int i;
		if (-1946390325 * class588.anInt7790 != -1)
			i = -1946390325 * class588.anInt7790;
		else if (-32768 == anInt11921 * -828031517)
			i = 200;
		else
			i = -(anInt11921 * -828031517);
		Class432 class432 = method10569();
		int i_0_ = (int) class432.aClass437_4862.aFloat4903 >> 9;
		int i_1_ = (int) class432.aClass437_4862.aFloat4905 >> 9;
		if (aClass560_10822 != null && i_0_ >= 1 && i_1_ >= 1 && i_0_ <= client.aClass505_11019.method8292((byte) 81) - 1 && i_1_ <= client.aClass505_11019.method8235(2121409767) - 1) {
			Class565 class565 = (aClass560_10822.aClass565ArrayArrayArray7508[aByte10821][i_0_][i_1_]);
			if (null != class565 && null != class565.aClass647_Sub1_Sub2_7591)
				return i + class565.aClass647_Sub1_Sub2_7591.aShort11740;
		}
		return i;
	}

	public int method18328() {
		return 643958083 * anInt11942;
	}

	boolean method18329(byte i) {
		if (-1 == 1353131583 * anInt11955)
			return false;
		return method18354(1353131583 * anInt11955, -1074082137);
	}

	public void method18330(int i) {
		anInt11942 = -1603948693 * i;
	}

	public void method18331(int i, int i_2_) {
		Class588 class588 = method18352(1647332072);
		if (0 != class588.anInt7781 * 588500635 || 0 != -1196321099 * anInt11922) {
			aClass72_11938.method1504(1470329515);
			int i_3_ = i - 1230650225 * aClass72_11938.anInt797 & 0x3fff;
			if (i_3_ > 8192)
				anInt11937 = (1230650225 * aClass72_11938.anInt797 - (16384 - i_3_)) * 116017503;
			else
				anInt11937 = 116017503 * (1230650225 * aClass72_11938.anInt797 + i_3_);
		}
	}

	public void method18332(int i, boolean bool, int i_4_) {
		Class588 class588 = method18352(24713614);
		if (bool || 0 != 588500635 * class588.anInt7781 || -1196321099 * anInt11922 != 0) {
			anInt11937 = 116017503 * (i & 0x3fff);
			aClass72_11938.method1493(-1400614241 * anInt11937, -2128624878);
		}
	}

	public int method18333(int i) {
		Class588 class588 = method18352(1823206374);
		int i_5_ = aClass72_11938.anInt797 * 1230650225;
		boolean bool;
		if (588500635 * class588.anInt7781 != 0)
			bool = aClass72_11938.method1506(-1400614241 * anInt11937, class588.anInt7781 * 588500635, class588.anInt7782 * 2006857885, -1626661910);
		else
			bool = aClass72_11938.method1506(-1400614241 * anInt11937, -1196321099 * anInt11922, -1196321099 * anInt11922, -865880228);
		int i_6_ = 1230650225 * aClass72_11938.anInt797 - i_5_;
		if (0 != i_6_)
			anInt11935 += 716126009;
		else {
			anInt11935 = 0;
			aClass72_11938.method1493(anInt11937 * -1400614241, -1334807577);
		}
		if (bool) {
			if (0 != -1037377255 * class588.anInt7783) {
				if (i_6_ > 0)
					aClass72_11939.method1506(-941991763 * class588.anInt7791, class588.anInt7783 * -1037377255, class588.anInt7784 * -1116978809, -1709967108);
				else
					aClass72_11939.method1506(-(-941991763 * class588.anInt7791), -1037377255 * class588.anInt7783, -1116978809 * class588.anInt7784, -1210244526);
			}
			if (0 != 587745541 * class588.anInt7751)
				aClass72_11886.method1506(-1578959099 * class588.anInt7788, 587745541 * class588.anInt7751, class588.anInt7787 * -1440956631, -1589592868);
		} else {
			if (0 != class588.anInt7783 * -1037377255)
				aClass72_11939.method1506(0, -1037377255 * class588.anInt7783, -1116978809 * class588.anInt7784, -2021300007);
			else
				aClass72_11939.method1493(0, -1020788721);
			if (587745541 * class588.anInt7751 != 0)
				aClass72_11886.method1506(0, class588.anInt7751 * 587745541, class588.anInt7787 * -1440956631, -969232006);
			else
				aClass72_11886.method1493(0, -755616108);
		}
		return i_6_;
	}

	public void method18334(int[] is, int[] is_7_, int i) {
		if (anIntArray11894 == null && null != is)
			anIntArray11894 = new int[Class655.aClass630_8423.disabledSlots.length];
		else if (null == is) {
			anIntArray11894 = null;
			return;
		}
		for (int i_8_ = 0; i_8_ < anIntArray11894.length; i_8_++)
			anIntArray11894[i_8_] = -1;
		for (int i_9_ = 0; i_9_ < is.length; i_9_++) {
			int i_10_ = is_7_[i_9_];
			int i_11_ = 0;
			while (i_11_ < anIntArray11894.length) {
				if ((i_10_ & 0x1) != 0)
					anIntArray11894[i_11_] = is[i_9_];
				i_11_++;
				i_10_ >>= 1;
			}
		}
	}

	public boolean method18335(int i, int i_12_, int i_13_) {
		if (anIntArray11934 == null) {
			if (i_12_ == -1)
				return true;
			anIntArray11934 = new int[Class655.aClass630_8423.disabledSlots.length];
			for (int i_14_ = 0; i_14_ < Class655.aClass630_8423.disabledSlots.length; i_14_++)
				anIntArray11934[i_14_] = -1;
		}
		Class588 class588 = method18352(1361718697);
		int i_15_ = 256;
		if (null != class588.anIntArray7779 && class588.anIntArray7779[i] > 0)
			i_15_ = class588.anIntArray7779[i];
		if (-1 == i_12_) {
			if (anIntArray11934[i] == -1)
				return true;
			int i_16_ = aClass72_11938.method1494((byte) 87);
			int i_17_ = anIntArray11934[i];
			int i_18_ = i_16_ - i_17_;
			if (i_18_ >= -i_15_ && i_18_ <= i_15_) {
				anIntArray11934[i] = -1;
				for (int i_19_ = 0; i_19_ < Class655.aClass630_8423.disabledSlots.length; i_19_++) {
					if (anIntArray11934[i_19_] != -1)
						return true;
				}
				anIntArray11934 = null;
				return true;
			}
			if (i_18_ > 0 && i_18_ <= 8192 || i_18_ <= -8192)
				anIntArray11934[i] = i_15_ + i_17_ & 0x3fff;
			else
				anIntArray11934[i] = i_17_ - i_15_ & 0x3fff;
			return false;
		}
		if (-1 == anIntArray11934[i])
			anIntArray11934[i] = aClass72_11938.method1494((byte) 95);
		int i_20_ = anIntArray11934[i];
		int i_21_ = i_12_ - i_20_;
		if (i_21_ >= -i_15_ && i_21_ <= i_15_) {
			anIntArray11934[i] = i_12_;
			return true;
		}
		if (i_21_ > 0 && i_21_ <= 8192 || i_21_ <= -8192)
			anIntArray11934[i] = i_15_ + i_20_ & 0x3fff;
		else
			anIntArray11934[i] = i_20_ - i_15_ & 0x3fff;
		return false;
	}

	public abstract Class533 method18336();

	public final void method18337(int i, int i_22_, int i_23_, int i_24_, boolean bool, int i_25_, int i_26_) {
		Class515 class515 = aClass515Array11912[i_25_];
		int i_27_ = 985865715 * class515.id;
		if (-1 != i && -1 != i_27_) {
			if (i_27_ == i) {
				GraphicsDefinitions class671 = ((GraphicsDefinitions) Class412.aClass53_Sub19_4556.getDefinition(i, (byte) 80));
				if (class671.aBool8602 && -61429051 * class671.anInt8590 != -1) {
					AnimationDefinitions class205 = ((AnimationDefinitions) (Class248.aClass53_Sub13_2492.getDefinition(-61429051 * class671.anInt8590, (byte) 93)));
					int i_28_ = 1566662983 * class205.anInt2220;
					if (i_28_ == 0)
						return;
					if (i_28_ == 2) {
						class515.aClass707_7043.method14178(2125468008);
						return;
					}
				}
			} else {
				GraphicsDefinitions class671 = ((GraphicsDefinitions) Class412.aClass53_Sub19_4556.getDefinition(i, (byte) 75));
				GraphicsDefinitions class671_29_ = ((GraphicsDefinitions) Class412.aClass53_Sub19_4556.getDefinition(i_27_, (byte) 18));
				if (-1 != class671.anInt8590 * -61429051 && -1 != class671_29_.anInt8590 * -61429051) {
					AnimationDefinitions class205 = ((AnimationDefinitions) (Class248.aClass53_Sub13_2492.getDefinition(-61429051 * class671.anInt8590, (byte) 48)));
					AnimationDefinitions class205_30_ = ((AnimationDefinitions) (Class248.aClass53_Sub13_2492.getDefinition(-61429051 * class671_29_.anInt8590, (byte) -16)));
					if (class205.priority * 1835115947 < class205_30_.priority * 1835115947)
						return;
				}
			}
		}
		int i_31_ = 0;
		if (-1 != i && !(((GraphicsDefinitions) Class412.aClass53_Sub19_4556.getDefinition(i, (byte) 43)).aBool8602))
			i_31_ = 2;
		if (i != -1 && bool)
			i_31_ = 1;
		class515.id = i * -873938117;
		class515.anInt7041 = i_24_ * -1792689941;
		class515.height = -63249911 * (i_22_ >> 16);
		class515.anInt7044 = 1328826279 * i_23_;
		class515.aClass707_7043.method14168((-1 != i ? (((GraphicsDefinitions) Class412.aClass53_Sub19_4556.getDefinition(i, (byte) 94)).anInt8590) * -61429051 : -1), i_22_ & 0xffff, i_31_, false, 1840849895);
	}

	public int method18338(int i) {
		return 643958083 * anInt11942;
	}

	void method18339(Class178 class178, Class588 class588, int i, int i_32_, int i_33_, int i_34_, byte i_35_) {
		for (int i_36_ = 0; i_36_ < aClass515Array11912.length; i_36_++) {
			byte i_37_ = 0;
			if (i_36_ == 0)
				i_37_ = (byte) 2;
			else if (1 == i_36_)
				i_37_ = (byte) 5;
			else if (i_36_ == 2)
				i_37_ = (byte) 1;
			else if (i_36_ == 3)
				i_37_ = (byte) 7;
			else if (4 == i_36_)
				i_37_ = (byte) 8;
			Class515 class515 = aClass515Array11912[i_36_];
			if (985865715 * class515.id != -1 && !class515.aClass707_7043.method14170((short) 255)) {
				GraphicsDefinitions class671 = ((GraphicsDefinitions) Class412.aClass53_Sub19_4556.getDefinition(((class515.id) * 985865715), (byte) 45));
				int i_38_ = i;
				if (-67637225 * class515.anInt7044 != 0)
					i_38_ |= 0x5;
				if (0 != 465652793 * class515.height)
					i_38_ |= 0x2;
				if (class515.anInt7041 * -1045221437 >= 0)
					i_38_ |= 0x7;
				if (-1045221437 * class515.anInt7041 >= 0 && class588.anIntArrayArray7776 != null && null != (class588.anIntArrayArray7776[class515.anInt7041 * -1045221437])) {
					Class167 class167 = (aClass167Array11928[1 + i_36_] = class671.method13703(class178, i_38_, class515.aClass707_7043, i_37_, (byte) 113));
					if (class167 != null) {
						int i_39_ = 0;
						int i_40_ = 0;
						int i_41_ = 0;
						if (null != class588.anIntArrayArray7776 && (class588.anIntArrayArray7776[-1045221437 * class515.anInt7041]) != null) {
							i_39_ += (class588.anIntArrayArray7776[class515.anInt7041 * -1045221437][0]);
							i_40_ += (class588.anIntArrayArray7776[class515.anInt7041 * -1045221437][1]);
							i_41_ += (class588.anIntArrayArray7776[class515.anInt7041 * -1045221437][2]);
						}
						if (null != class588.anIntArrayArray7768 && (class588.anIntArrayArray7768[class515.anInt7041 * -1045221437]) != null) {
							i_39_ += (class588.anIntArrayArray7768[-1045221437 * class515.anInt7041][0]);
							i_40_ += (class588.anIntArrayArray7768[class515.anInt7041 * -1045221437][1]);
							i_41_ += (class588.anIntArrayArray7768[class515.anInt7041 * -1045221437][2]);
						}
						if (i_41_ != 0 || 0 != i_39_) {
							int i_42_ = i_34_;
							if (null != anIntArray11934 && (anIntArray11934[-1045221437 * class515.anInt7041]) != -1)
								i_42_ = (anIntArray11934[class515.anInt7041 * -1045221437]);
							int i_43_ = ((class515.anInt7044 * -1082083328 + i_42_ - i_34_) & 0x3fff);
							if (0 != i_43_)
								class167.method2685(i_43_);
							int i_44_ = Class433.anIntArray4880[i_43_];
							int i_45_ = Class433.anIntArray4881[i_43_];
							int i_46_ = i_39_ * i_45_ + i_44_ * i_41_ >> 14;
							i_41_ = i_41_ * i_45_ - i_39_ * i_44_ >> 14;
							i_39_ = i_46_;
						}
						class167.method2689(i_39_, i_40_, i_41_);
						if (465652793 * class515.height != 0)
							class167.method2689(0, -(465652793 * class515.height) << 2, 0);
						class167.aBool1798 = false;
					}
				} else {
					Class167 class167 = (aClass167Array11928[i_36_ + 1] = class671.method13697(class178, i_38_, (-1082083328 * class515.anInt7044), 1360761263 * anInt11897, 887325889 * anInt11898, anInt11899 * 1882562377, class515.aClass707_7043, i_37_, 2065660459));
					if (class167 != null) {
						if (0 != class515.height * 465652793)
							class167.method2689(0, -(class515.height * 465652793) << 2, 0);
						class167.aBool1798 = false;
					}
				}
			} else
				aClass167Array11928[i_36_ + 1] = null;
		}
	}

	public final void method18340(int i, int i_47_, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_) {
		boolean bool = true;
		boolean bool_53_ = true;
		for (int i_54_ = 0; i_54_ < -113292831 * Class523_Sub11.aClass625_10427.anInt8133; i_54_++) {
			if (anIntArray11905[i_54_] > i_50_)
				bool = false;
			else
				bool_53_ = false;
		}
		int i_55_ = -1;
		int i_56_ = -1;
		int i_57_ = 0;
		if (i >= 0) {
			Class586 class586 = ((Class586) Class295.aClass53_Sub2_3176.getDefinition(i, (byte) -3));
			i_56_ = class586.anInt7741 * -532183203;
			i_57_ = 1247513563 * class586.anInt7725;
		}
		if (bool_53_) {
			if (-1 == i_56_)
				return;
			i_55_ = 0;
			int i_58_ = 0;
			if (i_56_ == 0)
				i_58_ = anIntArray11905[0];
			else if (1 == i_56_)
				i_58_ = anIntArray11904[0];
			for (int i_59_ = 1; i_59_ < -113292831 * Class523_Sub11.aClass625_10427.anInt8133; i_59_++) {
				if (i_56_ == 0) {
					if (anIntArray11905[i_59_] < i_58_) {
						i_55_ = i_59_;
						i_58_ = anIntArray11905[i_59_];
					}
				} else if (i_56_ == 1 && anIntArray11904[i_59_] < i_58_) {
					i_55_ = i_59_;
					i_58_ = anIntArray11904[i_59_];
				}
			}
			if (i_56_ == 1 && i_58_ >= i_47_)
				return;
		} else {
			if (bool)
				aByte11902 = (byte) 0;
			for (int i_60_ = 0; i_60_ < Class523_Sub11.aClass625_10427.anInt8133 * -113292831; i_60_++) {
				int i_61_ = aByte11902;
				aByte11902 = (byte) ((1 + aByte11902) % (Class523_Sub11.aClass625_10427.anInt8133 * -113292831));
				if (anIntArray11905[i_61_] <= i_50_) {
					i_55_ = i_61_;
					break;
				}
			}
		}
		if (i_55_ >= 0) {
			anIntArray11903[i_55_] = i;
			anIntArray11904[i_55_] = i_47_;
			anIntArray11906[i_55_] = i_48_;
			anIntArray11907[i_55_] = i_49_;
			anIntArray11905[i_55_] = i_50_ + i_57_ + i_51_;
		}
	}

	public final void method18341(int i, int i_62_) {
		Class547 class547 = (Class547) Class253.aClass53_Sub4_2740.getDefinition(i, (byte) -84);
		for (Class522_Sub6 class522_sub6 = (Class522_Sub6) aClass701_11920.method14087(1706431677); null != class522_sub6; class522_sub6 = (Class522_Sub6) aClass701_11920.method14088(1568037301)) {
			if (class547 == class522_sub6.aClass547_10344) {
				class522_sub6.method8652((byte) -22);
				break;
			}
		}
	}

	boolean method16702(int i) {
		return aBool11919;
	}

	public abstract int method18342(byte i);

	public final void method18343(int i) {
		anInt11941 = 0;
		anInt11946 = 0;
	}

	public void method18158(int i) {
		int i_63_ = 240 + (anInt11942 * 643958083 - 1 << 8);
		Class437 class437 = method10569().aClass437_4862;
		aShort11750 = (short) ((int) class437.aFloat4903 - i_63_ >> 9);
		aShort11751 = (short) ((int) class437.aFloat4905 - i_63_ >> 9);
		aShort11749 = (short) ((int) class437.aFloat4903 + i_63_ >> 9);
		aShort11752 = (short) (i_63_ + (int) class437.aFloat4905 >> 9);
	}

	public void method18344(int i, int i_64_) {
		anInt11942 = -1603948693 * i;
	}

	abstract int method18345();

	void method18346(int i, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_) {
		Class437 class437 = method10569().aClass437_4862;
		int i_70_ = aShort11750 + aShort11749 >> 1;
		int i_71_ = aShort11751 + aShort11752 >> 1;
		int i_72_ = Class433.anIntArray4880[i];
		int i_73_ = Class433.anIntArray4881[i];
		int i_74_ = -i_65_ / 2;
		int i_75_ = -i_66_ / 2;
		int i_76_ = i_73_ * i_74_ + i_75_ * i_72_ >> 14;
		int i_77_ = i_73_ * i_75_ - i_72_ * i_74_ >> 14;
		int i_78_ = Class467.method7601(i_76_ + (int) class437.aFloat4903, (int) class437.aFloat4905 + i_77_, i_70_, i_71_, aByte10821, (byte) 1);
		int i_79_ = i_65_ / 2;
		int i_80_ = -i_66_ / 2;
		int i_81_ = i_80_ * i_72_ + i_73_ * i_79_ >> 14;
		int i_82_ = i_73_ * i_80_ - i_79_ * i_72_ >> 14;
		int i_83_ = Class467.method7601((int) class437.aFloat4903 + i_81_, i_82_ + (int) class437.aFloat4905, i_70_, i_71_, aByte10821, (byte) 1);
		int i_84_ = -i_65_ / 2;
		int i_85_ = i_66_ / 2;
		int i_86_ = i_84_ * i_73_ + i_72_ * i_85_ >> 14;
		int i_87_ = i_85_ * i_73_ - i_72_ * i_84_ >> 14;
		int i_88_ = Class467.method7601(i_86_ + (int) class437.aFloat4903, i_87_ + (int) class437.aFloat4905, i_70_, i_71_, aByte10821, (byte) 1);
		int i_89_ = i_65_ / 2;
		int i_90_ = i_66_ / 2;
		int i_91_ = i_73_ * i_89_ + i_90_ * i_72_ >> 14;
		int i_92_ = i_90_ * i_73_ - i_72_ * i_89_ >> 14;
		int i_93_ = Class467.method7601(i_91_ + (int) class437.aFloat4903, i_92_ + (int) class437.aFloat4905, i_70_, i_71_, aByte10821, (byte) 1);
		int i_94_ = i_78_ < i_83_ ? i_78_ : i_83_;
		int i_95_ = i_88_ < i_93_ ? i_88_ : i_93_;
		int i_96_ = i_83_ < i_93_ ? i_83_ : i_93_;
		int i_97_ = i_78_ < i_88_ ? i_78_ : i_88_;
		anInt11897 = ((int) (Math.atan2((double) (i_94_ - i_95_), (double) i_66_) * 2607.5945876176133) & 0x3fff) * -46373553;
		anInt11898 = ((int) (Math.atan2((double) (i_97_ - i_96_), (double) i_65_) * 2607.5945876176133) & 0x3fff) * 2051476289;
		if (0 != anInt11897 * 1360761263 && 0 != i_67_) {
			int i_98_ = 16384 - i_67_;
			if (1360761263 * anInt11897 > 8192) {
				if (1360761263 * anInt11897 < i_98_)
					anInt11897 = -46373553 * i_98_;
			} else if (1360761263 * anInt11897 > i_67_)
				anInt11897 = i_67_ * -46373553;
		}
		if (anInt11898 * 887325889 != 0 && i_68_ != 0) {
			int i_99_ = 16384 - i_68_;
			if (887325889 * anInt11898 > 8192) {
				if (887325889 * anInt11898 < i_99_)
					anInt11898 = i_99_ * 2051476289;
			} else if (anInt11898 * 887325889 > i_68_)
				anInt11898 = 2051476289 * i_68_;
		}
		anInt11899 = -129137927 * (i_78_ + i_93_);
		if (i_88_ + i_83_ < anInt11899 * 1882562377)
			anInt11899 = (i_88_ + i_83_) * -129137927;
		anInt11899 = -129137927 * ((anInt11899 * 1882562377 >> 1) - (int) class437.aFloat4904);
	}

	void method18347(Class167 class167) {
		int i = aClass72_11939.anInt797 * 1230650225;
		int i_100_ = aClass72_11886.anInt797 * 1230650225;
		if (0 != i || i_100_ != 0) {
			int i_101_ = class167.method2804() / 2;
			class167.method2689(0, -i_101_, 0);
			class167.method2688(i & 0x3fff);
			class167.method2845(i_100_ & 0x3fff);
			class167.method2689(0, i_101_, 0);
		}
	}

	abstract int method18348(int i);

	public final void method18349(int i, int i_102_, int i_103_, int i_104_, int i_105_, int i_106_, int i_107_) {
		Class547 class547 = (Class547) Class253.aClass53_Sub4_2740.getDefinition(i, (byte) -8);
		Class522_Sub6 class522_sub6 = null;
		Class522_Sub6 class522_sub6_108_ = null;
		int i_109_ = 939987743 * class547.anInt7307;
		int i_110_ = 0;
		for (Class522_Sub6 class522_sub6_111_ = (Class522_Sub6) aClass701_11920.method14087(1706431677); null != class522_sub6_111_; class522_sub6_111_ = (Class522_Sub6) aClass701_11920.method14088(1689347595)) {
			i_110_++;
			if (class522_sub6_111_.aClass547_10344 == class547) {
				class522_sub6_111_.method15874(i_104_ + i_102_, i_105_, i_106_, i_103_, -1981224563);
				return;
			}
			if (class522_sub6_111_.aClass547_10344.anInt7306 * 1100993509 <= 1100993509 * class547.anInt7306)
				class522_sub6 = class522_sub6_111_;
			if (939987743 * class522_sub6_111_.aClass547_10344.anInt7307 > i_109_) {
				class522_sub6_108_ = class522_sub6_111_;
				i_109_ = 939987743 * class522_sub6_111_.aClass547_10344.anInt7307;
			}
		}
		if (null != class522_sub6_108_ || (i_110_ < -872637037 * Class523_Sub11.aClass625_10427.anInt8139)) {
			Class522_Sub6 class522_sub6_112_ = new Class522_Sub6(class547);
			if (class522_sub6 == null)
				aClass701_11920.method14094(class522_sub6_112_, 784570583);
			else
				Class629.method10326(class522_sub6_112_, class522_sub6, 939562051);
			class522_sub6_112_.method15874(i_104_ + i_102_, i_105_, i_106_, i_103_, -1968153247);
			if (i_110_ >= Class523_Sub11.aClass625_10427.anInt8139 * -872637037)
				class522_sub6_108_.method8652((byte) 2);
		}
	}

	public void method18350(byte i) {
		if (aClass533_11900 != null && null != aClass533_11900.aString7130) {
			aClass533_11900.anInt7134 -= -255862731;
			if (1278655005 * aClass533_11900.anInt7134 == 0)
				aClass533_11900.aString7130 = null;
		}
	}

	public void method18161() {
		int i = 240 + (anInt11942 * 643958083 - 1 << 8);
		Class437 class437 = method10569().aClass437_4862;
		aShort11750 = (short) ((int) class437.aFloat4903 - i >> 9);
		aShort11751 = (short) ((int) class437.aFloat4905 - i >> 9);
		aShort11749 = (short) ((int) class437.aFloat4903 + i >> 9);
		aShort11752 = (short) (i + (int) class437.aFloat4905 >> 9);
	}

	public abstract boolean method18351();

	public Class588 method18352(int i) {
		int i_113_ = method18348(1322016613);
		if (-1 == i_113_)
			return Class53_Sub17.aClass588_10976;
		return ((Class588) Class80.aClass53_Sub17_866.getDefinition(i_113_, (byte) 54));
	}

	public abstract Class533 method18353(byte i);

	boolean method18354(int i, int i_114_) {
		if (anInt11930 * -692046091 == i)
			return true;
		aClass242_11953 = Class221.method4132(i, null, null, true, (byte) 22);
		if (aClass242_11953 == null)
			return false;
		anInt11930 = 1181500765 * i;
		Class204.method3709(aClass242_11953.aClass250Array2457, -1730866738);
		return true;
	}

	public void method18355(int i, boolean bool) {
		Class588 class588 = method18352(367889636);
		if (bool || 0 != 588500635 * class588.anInt7781 || -1196321099 * anInt11922 != 0) {
			anInt11937 = 116017503 * (i & 0x3fff);
			aClass72_11938.method1493(-1400614241 * anInt11937, 688152062);
		}
	}

	public void method18356(int i, int i_115_, int i_116_, int i_117_, int i_118_, int i_119_, int i_120_, byte i_121_) {
		if (!method18329((byte) -59)) {
			if (-1 != i)
				client.aBoolArray11246[i] = true;
			else {
				for (int i_122_ = 0; i_122_ < 106; i_122_++)
					client.aBoolArray11246[i_122_] = true;
			}
		} else
			Class642.method10536(aClass242_11953.method4365((byte) -23), -1, i_115_, i_116_, i_117_, i_118_, i_119_, i_120_, i, false, (byte) -96);
	}

	public void method18357(int i, int i_123_, boolean bool, byte i_124_) {
		if (method18329((byte) -27))
			Class214.method3841(aClass242_11953.aClass250Array2457, -1, i, i_123_, bool, 143451369);
	}

	public int method16719() {
		if (-32768 == anInt11901 * 1025512921)
			return 0;
		return anInt11901 * 1025512921;
	}

	public int method16723() {
		Class588 class588 = method18352(-337908708);
		int i;
		if (-1946390325 * class588.anInt7790 != -1)
			i = -1946390325 * class588.anInt7790;
		else if (-32768 == anInt11921 * -828031517)
			i = 200;
		else
			i = -(anInt11921 * -828031517);
		Class432 class432 = method10569();
		int i_125_ = (int) class432.aClass437_4862.aFloat4903 >> 9;
		int i_126_ = (int) class432.aClass437_4862.aFloat4905 >> 9;
		if (aClass560_10822 != null && i_125_ >= 1 && i_126_ >= 1 && i_125_ <= client.aClass505_11019.method8292((byte) 121) - 1 && i_126_ <= client.aClass505_11019.method8235(2144965746) - 1) {
			Class565 class565 = (aClass560_10822.aClass565ArrayArrayArray7508[aByte10821][i_125_][i_126_]);
			if (null != class565 && null != class565.aClass647_Sub1_Sub2_7591)
				return i + class565.aClass647_Sub1_Sub2_7591.aShort11740;
		}
		return i;
	}

	public Class523_Sub29 method18358(byte i) {
		Class437 class437 = method10569().aClass437_4862;
		Class592 class592 = client.aClass505_11019.method8242(55538902);
		int i_127_ = class592.localX * 292859392 + (int) class437.aFloat4903;
		int i_128_ = (int) class437.aFloat4904;
		int i_129_ = 597568000 * class592.localY + (int) class437.aFloat4905;
		return new Class523_Sub29(aByte10821, i_127_, i_128_, i_129_);
	}

	public int method18359() {
		Class588 class588 = method18352(-38023249);
		int i = aClass72_11938.anInt797 * 1230650225;
		boolean bool;
		if (588500635 * class588.anInt7781 != 0)
			bool = aClass72_11938.method1506(-1400614241 * anInt11937, class588.anInt7781 * 588500635, class588.anInt7782 * 2006857885, -1468417302);
		else
			bool = aClass72_11938.method1506(-1400614241 * anInt11937, -1196321099 * anInt11922, -1196321099 * anInt11922, -963433839);
		int i_130_ = 1230650225 * aClass72_11938.anInt797 - i;
		if (0 != i_130_)
			anInt11935 += 716126009;
		else {
			anInt11935 = 0;
			aClass72_11938.method1493(anInt11937 * -1400614241, 764365620);
		}
		if (bool) {
			if (0 != -1037377255 * class588.anInt7783) {
				if (i_130_ > 0)
					aClass72_11939.method1506(-941991763 * class588.anInt7791, class588.anInt7783 * -1037377255, class588.anInt7784 * -1116978809, -1836098365);
				else
					aClass72_11939.method1506(-(-941991763 * class588.anInt7791), -1037377255 * class588.anInt7783, -1116978809 * class588.anInt7784, -1641797016);
			}
			if (0 != 587745541 * class588.anInt7751)
				aClass72_11886.method1506(-1578959099 * class588.anInt7788, 587745541 * class588.anInt7751, class588.anInt7787 * -1440956631, -1651684905);
		} else {
			if (0 != class588.anInt7783 * -1037377255)
				aClass72_11939.method1506(0, -1037377255 * class588.anInt7783, -1116978809 * class588.anInt7784, -1154009941);
			else
				aClass72_11939.method1493(0, -1611165314);
			if (587745541 * class588.anInt7751 != 0)
				aClass72_11886.method1506(0, class588.anInt7751 * 587745541, class588.anInt7787 * -1440956631, -1090499105);
			else
				aClass72_11886.method1493(0, 836101626);
		}
		return i_130_;
	}

	void method18360() {
		if (aClass621_11948 != null)
			aClass621_11948.method10123();
	}

	boolean method16715() {
		return false;
	}

	boolean method16716() {
		return aBool11919;
	}

	boolean method16741() {
		return aBool11919;
	}

	boolean method16718() {
		return aBool11919;
	}

	public void method18361() {
		if (aClass533_11900 != null && null != aClass533_11900.aString7130) {
			aClass533_11900.anInt7134 -= -255862731;
			if (1278655005 * aClass533_11900.anInt7134 == 0)
				aClass533_11900.aString7130 = null;
		}
	}

	public int method16720() {
		if (-32768 == anInt11901 * 1025512921)
			return 0;
		return anInt11901 * 1025512921;
	}

	public void finalize() {
		if (aClass621_11948 != null)
			aClass621_11948.method10123();
	}

	public void method18362(int i, int i_131_, int i_132_, int i_133_, int i_134_, int i_135_, int i_136_, int i_137_, int i_138_) {
		if (method18329((byte) -128))
			client.method17431(aClass242_11953, aClass242_11953.method4365((byte) -49), -1, i, i_131_, i_132_, i_133_, i_134_, i_135_, i_136_, i_137_);
	}

	public void method18363(int i) {
		Class588 class588 = method18352(-502671220);
		if (0 != class588.anInt7781 * 588500635 || 0 != -1196321099 * anInt11922) {
			aClass72_11938.method1504(1470329515);
			int i_139_ = i - 1230650225 * aClass72_11938.anInt797 & 0x3fff;
			if (i_139_ > 8192)
				anInt11937 = (1230650225 * aClass72_11938.anInt797 - (16384 - i_139_)) * 116017503;
			else
				anInt11937 = 116017503 * (1230650225 * aClass72_11938.anInt797 + i_139_);
		}
	}

	public void method18364(int i, boolean bool) {
		Class588 class588 = method18352(1566527221);
		if (bool || 0 != 588500635 * class588.anInt7781 || -1196321099 * anInt11922 != 0) {
			anInt11937 = 116017503 * (i & 0x3fff);
			aClass72_11938.method1493(-1400614241 * anInt11937, 1055354961);
		}
	}

	public void method18365(int i, boolean bool) {
		Class588 class588 = method18352(-318973654);
		if (bool || 0 != 588500635 * class588.anInt7781 || -1196321099 * anInt11922 != 0) {
			anInt11937 = 116017503 * (i & 0x3fff);
			aClass72_11938.method1493(-1400614241 * anInt11937, -51597128);
		}
	}

	public final void method18366() {
		anInt11941 = 0;
		anInt11946 = 0;
	}

	public int method16740(int i) {
		Class588 class588 = method18352(323210999);
		int i_140_;
		if (-1946390325 * class588.anInt7790 != -1)
			i_140_ = -1946390325 * class588.anInt7790;
		else if (-32768 == anInt11921 * -828031517)
			i_140_ = 200;
		else
			i_140_ = -(anInt11921 * -828031517);
		Class432 class432 = method10569();
		int i_141_ = (int) class432.aClass437_4862.aFloat4903 >> 9;
		int i_142_ = (int) class432.aClass437_4862.aFloat4905 >> 9;
		if (aClass560_10822 != null && i_141_ >= 1 && i_142_ >= 1 && i_141_ <= client.aClass505_11019.method8292((byte) 55) - 1 && i_142_ <= client.aClass505_11019.method8235(2135460807) - 1) {
			Class565 class565 = (aClass560_10822.aClass565ArrayArrayArray7508[aByte10821][i_141_][i_142_]);
			if (null != class565 && null != class565.aClass647_Sub1_Sub2_7591)
				return i_140_ + class565.aClass647_Sub1_Sub2_7591.aShort11740;
		}
		return i_140_;
	}

	public void method18367(int i, boolean bool) {
		Class588 class588 = method18352(1004807131);
		if (bool || 0 != 588500635 * class588.anInt7781 || -1196321099 * anInt11922 != 0) {
			anInt11937 = 116017503 * (i & 0x3fff);
			aClass72_11938.method1493(-1400614241 * anInt11937, 392304712);
		}
	}

	public int method18368() {
		Class588 class588 = method18352(793993281);
		int i = aClass72_11938.anInt797 * 1230650225;
		boolean bool;
		if (588500635 * class588.anInt7781 != 0)
			bool = aClass72_11938.method1506(-1400614241 * anInt11937, class588.anInt7781 * 588500635, class588.anInt7782 * 2006857885, -2079043932);
		else
			bool = aClass72_11938.method1506(-1400614241 * anInt11937, -1196321099 * anInt11922, -1196321099 * anInt11922, -1147806382);
		int i_143_ = 1230650225 * aClass72_11938.anInt797 - i;
		if (0 != i_143_)
			anInt11935 += 716126009;
		else {
			anInt11935 = 0;
			aClass72_11938.method1493(anInt11937 * -1400614241, 2049592);
		}
		if (bool) {
			if (0 != -1037377255 * class588.anInt7783) {
				if (i_143_ > 0)
					aClass72_11939.method1506(-941991763 * class588.anInt7791, class588.anInt7783 * -1037377255, class588.anInt7784 * -1116978809, -2031403313);
				else
					aClass72_11939.method1506(-(-941991763 * class588.anInt7791), -1037377255 * class588.anInt7783, -1116978809 * class588.anInt7784, -992720825);
			}
			if (0 != 587745541 * class588.anInt7751)
				aClass72_11886.method1506(-1578959099 * class588.anInt7788, 587745541 * class588.anInt7751, class588.anInt7787 * -1440956631, -1018775207);
		} else {
			if (0 != class588.anInt7783 * -1037377255)
				aClass72_11939.method1506(0, -1037377255 * class588.anInt7783, -1116978809 * class588.anInt7784, -1040095097);
			else
				aClass72_11939.method1493(0, 901003690);
			if (587745541 * class588.anInt7751 != 0)
				aClass72_11886.method1506(0, class588.anInt7751 * 587745541, class588.anInt7787 * -1440956631, -2028725492);
			else
				aClass72_11886.method1493(0, 724111900);
		}
		return i_143_;
	}

	public int method16743(int i) {
		if (-32768 == anInt11901 * 1025512921)
			return 0;
		return anInt11901 * 1025512921;
	}

	public void method18369(int[] is, int[] is_144_) {
		if (anIntArray11894 == null && null != is)
			anIntArray11894 = new int[Class655.aClass630_8423.disabledSlots.length];
		else if (null == is) {
			anIntArray11894 = null;
			return;
		}
		for (int i = 0; i < anIntArray11894.length; i++)
			anIntArray11894[i] = -1;
		for (int i = 0; i < is.length; i++) {
			int i_145_ = is_144_[i];
			int i_146_ = 0;
			while (i_146_ < anIntArray11894.length) {
				if ((i_145_ & 0x1) != 0)
					anIntArray11894[i_146_] = is[i];
				i_146_++;
				i_145_ >>= 1;
			}
		}
	}

	public void method18370(int[] is, int[] is_147_) {
		if (anIntArray11894 == null && null != is)
			anIntArray11894 = new int[Class655.aClass630_8423.disabledSlots.length];
		else if (null == is) {
			anIntArray11894 = null;
			return;
		}
		for (int i = 0; i < anIntArray11894.length; i++)
			anIntArray11894[i] = -1;
		for (int i = 0; i < is.length; i++) {
			int i_148_ = is_147_[i];
			int i_149_ = 0;
			while (i_149_ < anIntArray11894.length) {
				if ((i_148_ & 0x1) != 0)
					anIntArray11894[i_149_] = is[i];
				i_149_++;
				i_148_ >>= 1;
			}
		}
	}

	public boolean method18371(int i, int i_150_) {
		if (anIntArray11934 == null) {
			if (i_150_ == -1)
				return true;
			anIntArray11934 = new int[Class655.aClass630_8423.disabledSlots.length];
			for (int i_151_ = 0; i_151_ < Class655.aClass630_8423.disabledSlots.length; i_151_++)
				anIntArray11934[i_151_] = -1;
		}
		Class588 class588 = method18352(-606385284);
		int i_152_ = 256;
		if (null != class588.anIntArray7779 && class588.anIntArray7779[i] > 0)
			i_152_ = class588.anIntArray7779[i];
		if (-1 == i_150_) {
			if (anIntArray11934[i] == -1)
				return true;
			int i_153_ = aClass72_11938.method1494((byte) 25);
			int i_154_ = anIntArray11934[i];
			int i_155_ = i_153_ - i_154_;
			if (i_155_ >= -i_152_ && i_155_ <= i_152_) {
				anIntArray11934[i] = -1;
				for (int i_156_ = 0; i_156_ < Class655.aClass630_8423.disabledSlots.length; i_156_++) {
					if (anIntArray11934[i_156_] != -1)
						return true;
				}
				anIntArray11934 = null;
				return true;
			}
			if (i_155_ > 0 && i_155_ <= 8192 || i_155_ <= -8192)
				anIntArray11934[i] = i_152_ + i_154_ & 0x3fff;
			else
				anIntArray11934[i] = i_154_ - i_152_ & 0x3fff;
			return false;
		}
		if (-1 == anIntArray11934[i])
			anIntArray11934[i] = aClass72_11938.method1494((byte) 123);
		int i_157_ = anIntArray11934[i];
		int i_158_ = i_150_ - i_157_;
		if (i_158_ >= -i_152_ && i_158_ <= i_152_) {
			anIntArray11934[i] = i_150_;
			return true;
		}
		if (i_158_ > 0 && i_158_ <= 8192 || i_158_ <= -8192)
			anIntArray11934[i] = i_152_ + i_157_ & 0x3fff;
		else
			anIntArray11934[i] = i_157_ - i_152_ & 0x3fff;
		return false;
	}

	void method18372(Class178 class178, Class167[] class167s, Class435 class435, boolean bool) {
		if (!bool) {
			int i = 0;
			int i_159_ = 0;
			int i_160_ = 0;
			int i_161_ = 0;
			int i_162_ = -1;
			int i_163_ = -1;
			Class184[][] class184s = new Class184[class167s.length][];
			Class143[][] class143s = new Class143[class167s.length][];
			for (int i_164_ = 0; i_164_ < class167s.length; i_164_++) {
				if (null != class167s[i_164_]) {
					class167s[i_164_].method2732(class435);
					class184s[i_164_] = class167s[i_164_].method2733();
					class143s[i_164_] = class167s[i_164_].method2734();
					if (null != class184s[i_164_]) {
						i_162_ = i_164_;
						i_159_++;
						i += class184s[i_164_].length;
					}
					if (null != class143s[i_164_]) {
						i_163_ = i_164_;
						i_161_++;
						i_160_ += class143s[i_164_].length;
					}
				}
			}
			if ((null == aClass621_11948 || aClass621_11948.aBool8083) && (i_159_ > 0 || i_161_ > 0))
				aClass621_11948 = Class621.method10149(client.anInt11011, true);
			if (aClass621_11948 != null) {
				Object object = null;
				Class184[] class184s_165_;
				if (1 == i_159_)
					class184s_165_ = class184s[i_162_];
				else {
					class184s_165_ = new Class184[i];
					int i_166_ = 0;
					for (int i_167_ = 0; i_167_ < class167s.length; i_167_++) {
						if (class184s[i_167_] != null) {
							System.arraycopy(class184s[i_167_], 0, class184s_165_, i_166_, class184s[i_167_].length);
							i_166_ += class184s[i_167_].length;
						}
					}
				}
				Object object_168_ = null;
				Class143[] class143s_169_;
				if (i_161_ == 1)
					class143s_169_ = class143s[i_163_];
				else {
					class143s_169_ = new Class143[i_160_];
					int i_170_ = 0;
					for (int i_171_ = 0; i_171_ < class167s.length; i_171_++) {
						if (null != class143s[i_171_]) {
							System.arraycopy(class143s[i_171_], 0, class143s_169_, i_170_, class143s[i_171_].length);
							i_170_ += class143s[i_171_].length;
						}
					}
				}
				aClass621_11948.method10129(class178, (long) client.anInt11011, class184s_165_, class143s_169_, false);
				aBool11949 = true;
			}
		} else if (null != aClass621_11948)
			aClass621_11948.method10128((long) client.anInt11011);
		if (aClass621_11948 != null)
			aClass621_11948.method10133(aByte10821, aShort11750, aShort11749, aShort11751, aShort11752);
	}

	public final void method18373(int i, int i_172_, int i_173_, int i_174_, boolean bool, int i_175_) {
		Class515 class515 = aClass515Array11912[i_175_];
		int i_176_ = 985865715 * class515.id;
		if (-1 != i && -1 != i_176_) {
			if (i_176_ == i) {
				GraphicsDefinitions class671 = ((GraphicsDefinitions) Class412.aClass53_Sub19_4556.getDefinition(i, (byte) 2));
				if (class671.aBool8602 && -61429051 * class671.anInt8590 != -1) {
					AnimationDefinitions class205 = ((AnimationDefinitions) (Class248.aClass53_Sub13_2492.getDefinition(-61429051 * class671.anInt8590, (byte) -19)));
					int i_177_ = 1566662983 * class205.anInt2220;
					if (i_177_ == 0)
						return;
					if (i_177_ == 2) {
						class515.aClass707_7043.method14178(1229670013);
						return;
					}
				}
			} else {
				GraphicsDefinitions class671 = ((GraphicsDefinitions) Class412.aClass53_Sub19_4556.getDefinition(i, (byte) 26));
				GraphicsDefinitions class671_178_ = ((GraphicsDefinitions) Class412.aClass53_Sub19_4556.getDefinition(i_176_, (byte) -9));
				if (-1 != class671.anInt8590 * -61429051 && -1 != class671_178_.anInt8590 * -61429051) {
					AnimationDefinitions class205 = ((AnimationDefinitions) (Class248.aClass53_Sub13_2492.getDefinition(-61429051 * class671.anInt8590, (byte) 4)));
					AnimationDefinitions class205_179_ = ((AnimationDefinitions) (Class248.aClass53_Sub13_2492.getDefinition(-61429051 * class671_178_.anInt8590, (byte) -8)));
					if (class205.priority * 1835115947 < class205_179_.priority * 1835115947)
						return;
				}
			}
		}
		int i_180_ = 0;
		if (-1 != i && !(((GraphicsDefinitions) Class412.aClass53_Sub19_4556.getDefinition(i, (byte) -4)).aBool8602))
			i_180_ = 2;
		if (i != -1 && bool)
			i_180_ = 1;
		class515.id = i * -873938117;
		class515.anInt7041 = i_174_ * -1792689941;
		class515.height = -63249911 * (i_172_ >> 16);
		class515.anInt7044 = 1328826279 * i_173_;
		class515.aClass707_7043.method14168((-1 != i ? (((GraphicsDefinitions) Class412.aClass53_Sub19_4556.getDefinition(i, (byte) 10)).anInt8590) * -61429051 : -1), i_172_ & 0xffff, i_180_, false, 1840849895);
	}

	public final void method18374() {
		anInt11941 = 0;
		anInt11946 = 0;
	}

	public final void method18375() {
		anInt11941 = 0;
		anInt11946 = 0;
	}

	public Class588 method18376() {
		int i = method18348(1322016613);
		if (-1 == i)
			return Class53_Sub17.aClass588_10976;
		return (Class588) Class80.aClass53_Sub17_866.getDefinition(i, (byte) 14);
	}

	public final void method18377(int i, int i_181_, int i_182_, int i_183_, int i_184_, int i_185_) {
		boolean bool = true;
		boolean bool_186_ = true;
		for (int i_187_ = 0; i_187_ < -113292831 * Class523_Sub11.aClass625_10427.anInt8133; i_187_++) {
			if (anIntArray11905[i_187_] > i_184_)
				bool = false;
			else
				bool_186_ = false;
		}
		int i_188_ = -1;
		int i_189_ = -1;
		int i_190_ = 0;
		if (i >= 0) {
			Class586 class586 = ((Class586) Class295.aClass53_Sub2_3176.getDefinition(i, (byte) -37));
			i_189_ = class586.anInt7741 * -532183203;
			i_190_ = 1247513563 * class586.anInt7725;
		}
		if (bool_186_) {
			if (-1 == i_189_)
				return;
			i_188_ = 0;
			int i_191_ = 0;
			if (i_189_ == 0)
				i_191_ = anIntArray11905[0];
			else if (1 == i_189_)
				i_191_ = anIntArray11904[0];
			for (int i_192_ = 1; (i_192_ < -113292831 * Class523_Sub11.aClass625_10427.anInt8133); i_192_++) {
				if (i_189_ == 0) {
					if (anIntArray11905[i_192_] < i_191_) {
						i_188_ = i_192_;
						i_191_ = anIntArray11905[i_192_];
					}
				} else if (i_189_ == 1 && anIntArray11904[i_192_] < i_191_) {
					i_188_ = i_192_;
					i_191_ = anIntArray11904[i_192_];
				}
			}
			if (i_189_ == 1 && i_191_ >= i_181_)
				return;
		} else {
			if (bool)
				aByte11902 = (byte) 0;
			for (int i_193_ = 0; (i_193_ < Class523_Sub11.aClass625_10427.anInt8133 * -113292831); i_193_++) {
				int i_194_ = aByte11902;
				aByte11902 = (byte) ((1 + aByte11902) % (Class523_Sub11.aClass625_10427.anInt8133 * -113292831));
				if (anIntArray11905[i_194_] <= i_184_) {
					i_188_ = i_194_;
					break;
				}
			}
		}
		if (i_188_ >= 0) {
			anIntArray11903[i_188_] = i;
			anIntArray11904[i_188_] = i_181_;
			anIntArray11906[i_188_] = i_182_;
			anIntArray11907[i_188_] = i_183_;
			anIntArray11905[i_188_] = i_184_ + i_190_ + i_185_;
		}
	}

	public final void method18378(int i, int i_195_, int i_196_, int i_197_, int i_198_, int i_199_) {
		boolean bool = true;
		boolean bool_200_ = true;
		for (int i_201_ = 0; i_201_ < -113292831 * Class523_Sub11.aClass625_10427.anInt8133; i_201_++) {
			if (anIntArray11905[i_201_] > i_198_)
				bool = false;
			else
				bool_200_ = false;
		}
		int i_202_ = -1;
		int i_203_ = -1;
		int i_204_ = 0;
		if (i >= 0) {
			Class586 class586 = ((Class586) Class295.aClass53_Sub2_3176.getDefinition(i, (byte) -86));
			i_203_ = class586.anInt7741 * -532183203;
			i_204_ = 1247513563 * class586.anInt7725;
		}
		if (bool_200_) {
			if (-1 == i_203_)
				return;
			i_202_ = 0;
			int i_205_ = 0;
			if (i_203_ == 0)
				i_205_ = anIntArray11905[0];
			else if (1 == i_203_)
				i_205_ = anIntArray11904[0];
			for (int i_206_ = 1; (i_206_ < -113292831 * Class523_Sub11.aClass625_10427.anInt8133); i_206_++) {
				if (i_203_ == 0) {
					if (anIntArray11905[i_206_] < i_205_) {
						i_202_ = i_206_;
						i_205_ = anIntArray11905[i_206_];
					}
				} else if (i_203_ == 1 && anIntArray11904[i_206_] < i_205_) {
					i_202_ = i_206_;
					i_205_ = anIntArray11904[i_206_];
				}
			}
			if (i_203_ == 1 && i_205_ >= i_195_)
				return;
		} else {
			if (bool)
				aByte11902 = (byte) 0;
			for (int i_207_ = 0; (i_207_ < Class523_Sub11.aClass625_10427.anInt8133 * -113292831); i_207_++) {
				int i_208_ = aByte11902;
				aByte11902 = (byte) ((1 + aByte11902) % (Class523_Sub11.aClass625_10427.anInt8133 * -113292831));
				if (anIntArray11905[i_208_] <= i_198_) {
					i_202_ = i_208_;
					break;
				}
			}
		}
		if (i_202_ >= 0) {
			anIntArray11903[i_202_] = i;
			anIntArray11904[i_202_] = i_195_;
			anIntArray11906[i_202_] = i_196_;
			anIntArray11907[i_202_] = i_197_;
			anIntArray11905[i_202_] = i_198_ + i_204_ + i_199_;
		}
	}

	public final void method18379(int i, int i_209_, int i_210_, int i_211_, int i_212_, int i_213_) {
		Class547 class547 = (Class547) Class253.aClass53_Sub4_2740.getDefinition(i, (byte) -31);
		Class522_Sub6 class522_sub6 = null;
		Class522_Sub6 class522_sub6_214_ = null;
		int i_215_ = 939987743 * class547.anInt7307;
		int i_216_ = 0;
		for (Class522_Sub6 class522_sub6_217_ = (Class522_Sub6) aClass701_11920.method14087(1706431677); null != class522_sub6_217_; class522_sub6_217_ = (Class522_Sub6) aClass701_11920.method14088(1763607605)) {
			i_216_++;
			if (class522_sub6_217_.aClass547_10344 == class547) {
				class522_sub6_217_.method15874(i_211_ + i_209_, i_212_, i_213_, i_210_, -1599371633);
				return;
			}
			if (class522_sub6_217_.aClass547_10344.anInt7306 * 1100993509 <= 1100993509 * class547.anInt7306)
				class522_sub6 = class522_sub6_217_;
			if (939987743 * class522_sub6_217_.aClass547_10344.anInt7307 > i_215_) {
				class522_sub6_214_ = class522_sub6_217_;
				i_215_ = 939987743 * class522_sub6_217_.aClass547_10344.anInt7307;
			}
		}
		if (null != class522_sub6_214_ || (i_216_ < -872637037 * Class523_Sub11.aClass625_10427.anInt8139)) {
			Class522_Sub6 class522_sub6_218_ = new Class522_Sub6(class547);
			if (class522_sub6 == null)
				aClass701_11920.method14094(class522_sub6_218_, -881225594);
			else
				Class629.method10326(class522_sub6_218_, class522_sub6, -1129797028);
			class522_sub6_218_.method15874(i_211_ + i_209_, i_212_, i_213_, i_210_, -2002535268);
			if (i_216_ >= Class523_Sub11.aClass625_10427.anInt8139 * -872637037)
				class522_sub6_214_.method8652((byte) -95);
		}
	}

	public void method18380(int i) {
		anInt11942 = -1603948693 * i;
	}

	public abstract boolean method18381(int i);

	public void method18382(int i, boolean bool) {
		Class588 class588 = method18352(1316433037);
		if (bool || 0 != 588500635 * class588.anInt7781 || -1196321099 * anInt11922 != 0) {
			anInt11937 = 116017503 * (i & 0x3fff);
			aClass72_11938.method1493(-1400614241 * anInt11937, -10586136);
		}
	}

	public int method18383() {
		return 643958083 * anInt11942;
	}

	public int method18384() {
		return 643958083 * anInt11942;
	}

	public int method18385() {
		return 643958083 * anInt11942;
	}

	void method18386(Class167 class167, int i) {
		int i_219_ = aClass72_11939.anInt797 * 1230650225;
		int i_220_ = aClass72_11886.anInt797 * 1230650225;
		if (0 != i_219_ || i_220_ != 0) {
			int i_221_ = class167.method2804() / 2;
			class167.method2689(0, -i_221_, 0);
			class167.method2688(i_219_ & 0x3fff);
			class167.method2845(i_220_ & 0x3fff);
			class167.method2689(0, i_221_, 0);
		}
	}

	public void method18159() {
		int i = 240 + (anInt11942 * 643958083 - 1 << 8);
		Class437 class437 = method10569().aClass437_4862;
		aShort11750 = (short) ((int) class437.aFloat4903 - i >> 9);
		aShort11751 = (short) ((int) class437.aFloat4905 - i >> 9);
		aShort11749 = (short) ((int) class437.aFloat4903 + i >> 9);
		aShort11752 = (short) (i + (int) class437.aFloat4905 >> 9);
	}

	public void method18160() {
		int i = 240 + (anInt11942 * 643958083 - 1 << 8);
		Class437 class437 = method10569().aClass437_4862;
		aShort11750 = (short) ((int) class437.aFloat4903 - i >> 9);
		aShort11751 = (short) ((int) class437.aFloat4905 - i >> 9);
		aShort11749 = (short) ((int) class437.aFloat4903 + i >> 9);
		aShort11752 = (short) (i + (int) class437.aFloat4905 >> 9);
	}

	public abstract int method18387();

	void method18388(Class167 class167) {
		int i = aClass72_11939.anInt797 * 1230650225;
		int i_222_ = aClass72_11886.anInt797 * 1230650225;
		if (0 != i || i_222_ != 0) {
			int i_223_ = class167.method2804() / 2;
			class167.method2689(0, -i_223_, 0);
			class167.method2688(i & 0x3fff);
			class167.method2845(i_222_ & 0x3fff);
			class167.method2689(0, i_223_, 0);
		}
	}

	void method18389(Class178 class178, Class588 class588, int i, int i_224_, int i_225_, int i_226_) {
		for (int i_227_ = 0; i_227_ < aClass515Array11912.length; i_227_++) {
			byte i_228_ = 0;
			if (i_227_ == 0)
				i_228_ = (byte) 2;
			else if (1 == i_227_)
				i_228_ = (byte) 5;
			else if (i_227_ == 2)
				i_228_ = (byte) 1;
			else if (i_227_ == 3)
				i_228_ = (byte) 7;
			else if (4 == i_227_)
				i_228_ = (byte) 8;
			Class515 class515 = aClass515Array11912[i_227_];
			if (985865715 * class515.id != -1 && !class515.aClass707_7043.method14170((short) 255)) {
				GraphicsDefinitions class671 = ((GraphicsDefinitions) Class412.aClass53_Sub19_4556.getDefinition(((class515.id) * 985865715), (byte) -34));
				int i_229_ = i;
				if (-67637225 * class515.anInt7044 != 0)
					i_229_ |= 0x5;
				if (0 != 465652793 * class515.height)
					i_229_ |= 0x2;
				if (class515.anInt7041 * -1045221437 >= 0)
					i_229_ |= 0x7;
				if (-1045221437 * class515.anInt7041 >= 0 && class588.anIntArrayArray7776 != null && null != (class588.anIntArrayArray7776[class515.anInt7041 * -1045221437])) {
					Class167 class167 = (aClass167Array11928[1 + i_227_] = class671.method13703(class178, i_229_, class515.aClass707_7043, i_228_, (byte) 27));
					if (class167 != null) {
						int i_230_ = 0;
						int i_231_ = 0;
						int i_232_ = 0;
						if (null != class588.anIntArrayArray7776 && (class588.anIntArrayArray7776[-1045221437 * class515.anInt7041]) != null) {
							i_230_ += (class588.anIntArrayArray7776[class515.anInt7041 * -1045221437][0]);
							i_231_ += (class588.anIntArrayArray7776[class515.anInt7041 * -1045221437][1]);
							i_232_ += (class588.anIntArrayArray7776[class515.anInt7041 * -1045221437][2]);
						}
						if (null != class588.anIntArrayArray7768 && (class588.anIntArrayArray7768[class515.anInt7041 * -1045221437]) != null) {
							i_230_ += (class588.anIntArrayArray7768[-1045221437 * class515.anInt7041][0]);
							i_231_ += (class588.anIntArrayArray7768[class515.anInt7041 * -1045221437][1]);
							i_232_ += (class588.anIntArrayArray7768[class515.anInt7041 * -1045221437][2]);
						}
						if (i_232_ != 0 || 0 != i_230_) {
							int i_233_ = i_226_;
							if (null != anIntArray11934 && (anIntArray11934[-1045221437 * class515.anInt7041]) != -1)
								i_233_ = (anIntArray11934[class515.anInt7041 * -1045221437]);
							int i_234_ = ((class515.anInt7044 * -1082083328 + i_233_ - i_226_) & 0x3fff);
							if (0 != i_234_)
								class167.method2685(i_234_);
							int i_235_ = Class433.anIntArray4880[i_234_];
							int i_236_ = Class433.anIntArray4881[i_234_];
							int i_237_ = i_230_ * i_236_ + i_235_ * i_232_ >> 14;
							i_232_ = i_232_ * i_236_ - i_230_ * i_235_ >> 14;
							i_230_ = i_237_;
						}
						class167.method2689(i_230_, i_231_, i_232_);
						if (465652793 * class515.height != 0)
							class167.method2689(0, -(465652793 * class515.height) << 2, 0);
						class167.aBool1798 = false;
					}
				} else {
					Class167 class167 = (aClass167Array11928[i_227_ + 1] = class671.method13697(class178, i_229_, (-1082083328 * class515.anInt7044), 1360761263 * anInt11897, 887325889 * anInt11898, anInt11899 * 1882562377, class515.aClass707_7043, i_228_, 2009781188));
					if (class167 != null) {
						if (0 != class515.height * 465652793)
							class167.method2689(0, -(class515.height * 465652793) << 2, 0);
						class167.aBool1798 = false;
					}
				}
			} else
				aClass167Array11928[i_227_ + 1] = null;
		}
	}

	void method18390(Class178 class178, Class588 class588, int i, int i_238_, int i_239_, int i_240_) {
		for (int i_241_ = 0; i_241_ < aClass515Array11912.length; i_241_++) {
			byte i_242_ = 0;
			if (i_241_ == 0)
				i_242_ = (byte) 2;
			else if (1 == i_241_)
				i_242_ = (byte) 5;
			else if (i_241_ == 2)
				i_242_ = (byte) 1;
			else if (i_241_ == 3)
				i_242_ = (byte) 7;
			else if (4 == i_241_)
				i_242_ = (byte) 8;
			Class515 class515 = aClass515Array11912[i_241_];
			if (985865715 * class515.id != -1 && !class515.aClass707_7043.method14170((short) 255)) {
				GraphicsDefinitions class671 = ((GraphicsDefinitions) Class412.aClass53_Sub19_4556.getDefinition(((class515.id) * 985865715), (byte) 55));
				int i_243_ = i;
				if (-67637225 * class515.anInt7044 != 0)
					i_243_ |= 0x5;
				if (0 != 465652793 * class515.height)
					i_243_ |= 0x2;
				if (class515.anInt7041 * -1045221437 >= 0)
					i_243_ |= 0x7;
				if (-1045221437 * class515.anInt7041 >= 0 && class588.anIntArrayArray7776 != null && null != (class588.anIntArrayArray7776[class515.anInt7041 * -1045221437])) {
					Class167 class167 = (aClass167Array11928[1 + i_241_] = class671.method13703(class178, i_243_, class515.aClass707_7043, i_242_, (byte) 35));
					if (class167 != null) {
						int i_244_ = 0;
						int i_245_ = 0;
						int i_246_ = 0;
						if (null != class588.anIntArrayArray7776 && (class588.anIntArrayArray7776[-1045221437 * class515.anInt7041]) != null) {
							i_244_ += (class588.anIntArrayArray7776[class515.anInt7041 * -1045221437][0]);
							i_245_ += (class588.anIntArrayArray7776[class515.anInt7041 * -1045221437][1]);
							i_246_ += (class588.anIntArrayArray7776[class515.anInt7041 * -1045221437][2]);
						}
						if (null != class588.anIntArrayArray7768 && (class588.anIntArrayArray7768[class515.anInt7041 * -1045221437]) != null) {
							i_244_ += (class588.anIntArrayArray7768[-1045221437 * class515.anInt7041][0]);
							i_245_ += (class588.anIntArrayArray7768[class515.anInt7041 * -1045221437][1]);
							i_246_ += (class588.anIntArrayArray7768[class515.anInt7041 * -1045221437][2]);
						}
						if (i_246_ != 0 || 0 != i_244_) {
							int i_247_ = i_240_;
							if (null != anIntArray11934 && (anIntArray11934[-1045221437 * class515.anInt7041]) != -1)
								i_247_ = (anIntArray11934[class515.anInt7041 * -1045221437]);
							int i_248_ = ((class515.anInt7044 * -1082083328 + i_247_ - i_240_) & 0x3fff);
							if (0 != i_248_)
								class167.method2685(i_248_);
							int i_249_ = Class433.anIntArray4880[i_248_];
							int i_250_ = Class433.anIntArray4881[i_248_];
							int i_251_ = i_244_ * i_250_ + i_249_ * i_246_ >> 14;
							i_246_ = i_246_ * i_250_ - i_244_ * i_249_ >> 14;
							i_244_ = i_251_;
						}
						class167.method2689(i_244_, i_245_, i_246_);
						if (465652793 * class515.height != 0)
							class167.method2689(0, -(465652793 * class515.height) << 2, 0);
						class167.aBool1798 = false;
					}
				} else {
					Class167 class167 = (aClass167Array11928[i_241_ + 1] = class671.method13697(class178, i_243_, (-1082083328 * class515.anInt7044), 1360761263 * anInt11897, 887325889 * anInt11898, anInt11899 * 1882562377, class515.aClass707_7043, i_242_, 1708042863));
					if (class167 != null) {
						if (0 != class515.height * 465652793)
							class167.method2689(0, -(class515.height * 465652793) << 2, 0);
						class167.aBool1798 = false;
					}
				}
			} else
				aClass167Array11928[i_241_ + 1] = null;
		}
	}

	boolean method16701(int i) {
		return false;
	}

	abstract int method18391();

	abstract int method18392();

	Class647_Sub1_Sub3_Sub1(Class560 class560, int i, Class98_Sub1 class98_sub1) {
		super(class560, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, (byte) 0);
		anInt11901 = 1925939200;
		anInt11921 = 135954432;
		aBool11892 = true;
		anInt11950 = 0;
		anInt11895 = 95559637;
		anInt11896 = 0;
		anInt11890 = 0;
		aByte11902 = (byte) 0;
		anIntArray11903 = new int[Class523_Sub11.aClass625_10427.anInt8133 * -113292831];
		anIntArray11904 = new int[Class523_Sub11.aClass625_10427.anInt8133 * -113292831];
		anIntArray11905 = new int[-113292831 * Class523_Sub11.aClass625_10427.anInt8133];
		anIntArray11906 = new int[-113292831 * Class523_Sub11.aClass625_10427.anInt8133];
		anIntArray11907 = new int[Class523_Sub11.aClass625_10427.anInt8133 * -113292831];
		aClass701_11920 = new Class701();
		anInt11909 = 1843265241;
		anIntArray11911 = null;
		aClass707_Sub1_11887 = new Class707_Sub1(this, false);
		aClass707_11913 = new Class707_Sub2(this, false);
		anInt11924 = 1819254063;
		anInt11925 = 637108827;
		aByte11929 = (byte) 0;
		anInt11951 = 834874663;
		anInt11931 = 0;
		anInt11916 = 0;
		anInt11935 = 0;
		anInt11922 = 1026006272;
		aClass72_11938 = new Class72();
		aClass72_11939 = new Class72();
		aClass72_11886 = new Class72();
		anInt11941 = 0;
		anInt11945 = 0;
		anInt11946 = 0;
		anInt11947 = 0;
		aBool11949 = false;
		aBool11919 = false;
		anInt11930 = -1181500765;
		anInt11955 = 1224881729;
		anInterface20_11956 = new Class531(this);
		anIntArray11885 = new int[i];
		anIntArray11943 = new int[i];
		aByteArray11944 = new byte[i];
		aClass167Array11928 = new Class167[6];
		aClass515Array11912 = new Class515[5];
		for (int i_252_ = 0; i_252_ < 5; i_252_++)
			aClass515Array11912[i_252_] = new Class515(this);
		aClass707_Sub2_Sub1Array11933 = (new Class707_Sub2_Sub1[Class655.aClass630_8423.disabledSlots.length]);
		anInterface2_11952 = new Class4(class98_sub1);
	}

	abstract int method18393();

	void method18394(Class178 class178, Class167[] class167s, Class435 class435, boolean bool, int i) {
		if (!bool) {
			int i_253_ = 0;
			int i_254_ = 0;
			int i_255_ = 0;
			int i_256_ = 0;
			int i_257_ = -1;
			int i_258_ = -1;
			Class184[][] class184s = new Class184[class167s.length][];
			Class143[][] class143s = new Class143[class167s.length][];
			for (int i_259_ = 0; i_259_ < class167s.length; i_259_++) {
				if (null != class167s[i_259_]) {
					class167s[i_259_].method2732(class435);
					class184s[i_259_] = class167s[i_259_].method2733();
					class143s[i_259_] = class167s[i_259_].method2734();
					if (null != class184s[i_259_]) {
						i_257_ = i_259_;
						i_254_++;
						i_253_ += class184s[i_259_].length;
					}
					if (null != class143s[i_259_]) {
						i_258_ = i_259_;
						i_256_++;
						i_255_ += class143s[i_259_].length;
					}
				}
			}
			if ((null == aClass621_11948 || aClass621_11948.aBool8083) && (i_254_ > 0 || i_256_ > 0))
				aClass621_11948 = Class621.method10149(client.anInt11011, true);
			if (aClass621_11948 != null) {
				Object object = null;
				Class184[] class184s_260_;
				if (1 == i_254_)
					class184s_260_ = class184s[i_257_];
				else {
					class184s_260_ = new Class184[i_253_];
					int i_261_ = 0;
					for (int i_262_ = 0; i_262_ < class167s.length; i_262_++) {
						if (class184s[i_262_] != null) {
							System.arraycopy(class184s[i_262_], 0, class184s_260_, i_261_, class184s[i_262_].length);
							i_261_ += class184s[i_262_].length;
						}
					}
				}
				Object object_263_ = null;
				Class143[] class143s_264_;
				if (i_256_ == 1)
					class143s_264_ = class143s[i_258_];
				else {
					class143s_264_ = new Class143[i_255_];
					int i_265_ = 0;
					for (int i_266_ = 0; i_266_ < class167s.length; i_266_++) {
						if (null != class143s[i_266_]) {
							System.arraycopy(class143s[i_266_], 0, class143s_264_, i_265_, class143s[i_266_].length);
							i_265_ += class143s[i_266_].length;
						}
					}
				}
				aClass621_11948.method10129(class178, (long) client.anInt11011, class184s_260_, class143s_264_, false);
				aBool11949 = true;
			}
		} else if (null != aClass621_11948)
			aClass621_11948.method10128((long) client.anInt11011);
		if (aClass621_11948 != null)
			aClass621_11948.method10133(aByte10821, aShort11750, aShort11749, aShort11751, aShort11752);
	}

	public abstract boolean method18395();

	Class647_Sub1_Sub3_Sub1(Class560 class560, Class98_Sub1 class98_sub1) {
		this(class560, 10, class98_sub1);
	}

	public void method18396() {
		if (aClass533_11900 != null && null != aClass533_11900.aString7130) {
			aClass533_11900.anInt7134 -= -255862731;
			if (1278655005 * aClass533_11900.anInt7134 == 0)
				aClass533_11900.aString7130 = null;
		}
	}

	public abstract int method18397();

	public void method18398() {
		if (aClass533_11900 != null && null != aClass533_11900.aString7130) {
			aClass533_11900.anInt7134 -= -255862731;
			if (1278655005 * aClass533_11900.anInt7134 == 0)
				aClass533_11900.aString7130 = null;
		}
	}

	public Class592 method18399(byte i) {
		Class437 class437 = method10569().aClass437_4862;
		Class592 class592 = client.aClass505_11019.method8242(55538902);
		int i_267_ = (((int) class437.aFloat4903 >> 9) + class592.localX * 235453015);
		int i_268_ = (1704054549 * class592.localY + ((int) class437.aFloat4905 >> 9));
		return new Class592(aByte10821, i_267_, i_268_);
	}

	public abstract int method18400();

	public void method18401(String string, int i, int i_269_, int i_270_) {
		if (null == aClass533_11900)
			aClass533_11900 = new Class533();
		aClass533_11900.aString7130 = string;
		aClass533_11900.anInt7133 = i * -1236100265;
		aClass533_11900.anInt7132 = i_269_ * 1595083539;
		aClass533_11900.anInt7134 = (aClass533_11900.anInt7135 = i_270_ * 598418211) * 214358215;
	}

	boolean method18402() {
		if (-1 == 1353131583 * anInt11955)
			return false;
		return method18354(1353131583 * anInt11955, -1074082137);
	}

	public abstract int method18403(byte i);

	boolean method18404(int i) {
		if (anInt11930 * -692046091 == i)
			return true;
		aClass242_11953 = Class221.method4132(i, null, null, true, (byte) -34);
		if (aClass242_11953 == null)
			return false;
		anInt11930 = 1181500765 * i;
		Class204.method3709(aClass242_11953.aClass250Array2457, -1730866738);
		return true;
	}

	boolean method18405(int i) {
		if (anInt11930 * -692046091 == i)
			return true;
		aClass242_11953 = Class221.method4132(i, null, null, true, (byte) 27);
		if (aClass242_11953 == null)
			return false;
		anInt11930 = 1181500765 * i;
		Class204.method3709(aClass242_11953.aClass250Array2457, -1730866738);
		return true;
	}

	public void method18406(int i, int i_271_, int i_272_, int i_273_, int i_274_, int i_275_, int i_276_, int i_277_) {
		if (method18329((byte) -95))
			client.method17431(aClass242_11953, aClass242_11953.method4365((byte) -124), -1, i, i_271_, i_272_, i_273_, i_274_, i_275_, i_276_, i_277_);
	}

	public void method18407(int i, int i_278_, int i_279_, int i_280_, int i_281_, int i_282_, int i_283_) {
		if (!method18329((byte) -106)) {
			if (-1 != i)
				client.aBoolArray11246[i] = true;
			else {
				for (int i_284_ = 0; i_284_ < 106; i_284_++)
					client.aBoolArray11246[i_284_] = true;
			}
		} else
			Class642.method10536(aClass242_11953.method4365((byte) -80), -1, i_278_, i_279_, i_280_, i_281_, i_282_, i_283_, i, false, (byte) -83);
	}

	public void method18408(int i, int i_285_, int i_286_, int i_287_, int i_288_, int i_289_, int i_290_) {
		if (!method18329((byte) -59)) {
			if (-1 != i)
				client.aBoolArray11246[i] = true;
			else {
				for (int i_291_ = 0; i_291_ < 106; i_291_++)
					client.aBoolArray11246[i_291_] = true;
			}
		} else
			Class642.method10536(aClass242_11953.method4365((byte) -66), -1, i_285_, i_286_, i_287_, i_288_, i_289_, i_290_, i, false, (byte) -7);
	}

	public void method18409(int i, int i_292_, int i_293_, int i_294_, int i_295_, int i_296_, int i_297_) {
		if (!method18329((byte) -77)) {
			if (-1 != i)
				client.aBoolArray11246[i] = true;
			else {
				for (int i_298_ = 0; i_298_ < 106; i_298_++)
					client.aBoolArray11246[i_298_] = true;
			}
		} else
			Class642.method10536(aClass242_11953.method4365((byte) -16), -1, i_292_, i_293_, i_294_, i_295_, i_296_, i_297_, i, false, (byte) -28);
	}

	public void method18410(int i, int i_299_, boolean bool) {
		if (method18329((byte) -95))
			Class214.method3841(aClass242_11953.aClass250Array2457, -1, i, i_299_, bool, 143451369);
	}

	public void method18411(int i, int i_300_, boolean bool) {
		if (method18329((byte) -102))
			Class214.method3841(aClass242_11953.aClass250Array2457, -1, i, i_300_, bool, 143451369);
	}

	public void method18412(int i, int i_301_, boolean bool) {
		if (method18329((byte) -122))
			Class214.method3841(aClass242_11953.aClass250Array2457, -1, i, i_301_, bool, 143451369);
	}

	public abstract int method18413();

	boolean method18414() {
		if (-1 == 1353131583 * anInt11955)
			return false;
		return method18354(1353131583 * anInt11955, -1074082137);
	}

	public Class592 method18415() {
		Class437 class437 = method10569().aClass437_4862;
		Class592 class592 = client.aClass505_11019.method8242(55538902);
		int i = (((int) class437.aFloat4903 >> 9) + class592.localX * 235453015);
		int i_302_ = (1704054549 * class592.localY + ((int) class437.aFloat4905 >> 9));
		return new Class592(aByte10821, i, i_302_);
	}

	public void method18416(String string, int i, int i_303_, int i_304_, byte i_305_) {
		if (null == aClass533_11900)
			aClass533_11900 = new Class533();
		aClass533_11900.aString7130 = string;
		aClass533_11900.anInt7133 = i * -1236100265;
		aClass533_11900.anInt7132 = i_303_ * 1595083539;
		aClass533_11900.anInt7134 = (aClass533_11900.anInt7135 = i_304_ * 598418211) * 214358215;
	}

	static int method18417(int i, int i_306_, int i_307_) {
		if (1923531495 * Class607.aClass607_7964.anInt7982 == i || 1923531495 * Class607.aClass607_7966.anInt7982 == i)
			return Class647_Sub1_Sub4_Sub2.anIntArray12030[i_306_ & 0x3];
		return Class647_Sub1_Sub4_Sub2.anIntArray12028[i_306_ & 0x3];
	}

	public static boolean method18418(int i, int i_308_) {
		return (i >= Class607.aClass607_7973.anInt7982 * 1923531495 && i <= 1923531495 * Class607.aClass607_7978.anInt7982);
	}
}
