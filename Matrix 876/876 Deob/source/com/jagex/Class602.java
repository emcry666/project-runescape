/* Class602 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Arrays;

public class Class602 implements Interface13 {
	public int anInt7852;
	static final int anInt7853 = 6;
	public int anInt7854;
	Class609 aClass609_7855;
	Interface12 anInterface12_7856;
	byte[] aByteArray7857;
	public int anInt7858;
	public String aString7859 = "null";
	int anInt7860;
	byte[] aByteArray7861;
	public int anInt7862;
	short[] aShortArray7863;
	public static short[] aShortArray7864 = new short[256];
	public Class594 aClass594_7865;
	byte[] aByteArray7866;
	int[] anIntArray7867;
	byte aByte7868;
	public String[] aStringArray7869;
	byte aByte7870 = 0;
	public int anInt7871 = 94492435;
	public int anInt7872 = 1327769823;
	public int anInt7873;
	public int anInt7874;
	byte aByte7875;
	int anInt7876;
	public boolean aBool7877;
	short[] aShortArray7878;
	public int anInt7879;
	public int anInt7880;
	public boolean aBool7881;
	int[][] anIntArrayArray7882;
	public boolean aBool7883;
	int anInt7884;
	int anInt7885;
	int anInt7886;
	byte aByte7887;
	int[] anIntArray7888;
	public int anInt7889;
	public int anInt7890;
	public boolean aBool7891;
	public int anInt7892;
	public boolean aBool7893;
	int anInt7894;
	public boolean aBool7895;
	public int anInt7896;
	byte aByte7897;
	int anInt7898;
	public int anInt7899;
	int anInt7900;
	int anInt7901;
	int anInt7902;
	boolean aBool7903;
	int anInt7904;
	public boolean aBool7905;
	public int anInt7906;
	public int anInt7907;
	public boolean aBool7908;
	byte[] aByteArray7909;
	int[] anIntArray7910;
	int anInt7911;
	public int[] anIntArray7912;
	public int anInt7913;
	int anInt7914;
	int anInt7915;
	short[] aShortArray7916;
	public int anInt7917;
	public int[] anIntArray7918;
	public boolean aBool7919;
	public boolean aBool7920;
	public boolean aBool7921;
	public boolean aBool7922;
	Class14 aClass14_7923;
	public boolean aBool7924;
	public int[] anIntArray7925;
	public int anInt7926;
	public int anInt7927;
	public boolean aBool7928;
	short[] aShortArray7929;
	public int anInt7930;
	public Class430 aClass430_7931;
	static final int anInt7932 = 127007;
	public static Class98_Sub1_Sub2 aClass98_Sub1_Sub2_7933;
	public static int anInt7934;

	public void method77() {
		method9890(-1759297857);
		if (aBool7903)
			anInt7852 = 0;
		if (!aClass609_7855.aBool7994 && aBool7922) {
			aStringArray7869 = null;
			anIntArray7925 = null;
		}
	}

	public int method9888(int i) {
		if (anIntArray7888 == null)
			return -1;
		return anIntArray7888[i];
	}

	public void method74(byte i) {
		method9890(-1759297857);
		if (aBool7903)
			anInt7852 = 0;
		if (!aClass609_7855.aBool7994 && aBool7922) {
			aStringArray7869 = null;
			anIntArray7925 = null;
		}
	}

	public int method9889(int i, int i_0_) {
		if (aClass14_7923 == null)
			return i_0_;
		Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass14_7923.getFromIndex((long) i);
		if (null == class523_sub24)
			return i_0_;
		return -677457577 * class523_sub24.anInt10542;
	}

	void method9890(int i) {
		if (anInt7874 * -344567467 == -1) {
			anInt7874 = 0;
			if (null != aByteArray7857 && 1 == aByteArray7857.length && (1923531495 * Class607.aClass607_7970.anInt7982 == aByteArray7857[0]))
				anInt7874 = -819518467;
			for (int i_1_ = 0; i_1_ < 5; i_1_++) {
				if (aStringArray7869[i_1_] != null) {
					anInt7874 = -819518467;
					break;
				}
			}
		}
		if (anInt7862 * 591624555 == -1)
			anInt7862 = (972673777 * anInt7852 != 0 ? 1 : 0) * 757525315;
		if (method9935((byte) 0) || aBool7924 || null != anIntArray7912)
			aBool7928 = true;
		if (anInt7874 * -344567467 <= 0 && aClass594_7865 != Class594.aClass594_7816) {
			/* empty */
		}
	}

	public final boolean method9891(int i, byte i_2_) {
		if (null == anIntArrayArray7882)
			return true;
		boolean bool = true;
		for (int i_3_ = 0; i_3_ < aByteArray7857.length; i_3_++) {
			if (aByteArray7857[i_3_] == i) {
				for (int i_4_ = 0; i_4_ < anIntArrayArray7882[i_3_].length; i_4_++) {
					if (!aClass609_7855.method9996((anIntArrayArray7882[i_3_][i_4_]), (byte) 0))
						bool = false;
				}
			}
		}
		return bool;
	}

	public final boolean method9892(Class650 class650, int i) {
		if (anIntArrayArray7882 == null)
			return true;
		boolean bool = true;
		for (int i_5_ = 0; i_5_ < anIntArrayArray7882.length; i_5_++) {
			for (int i_6_ = 0; i_6_ < anIntArrayArray7882[i_5_].length; i_6_++) {
				boolean bool_7_ = aClass609_7855.method9996((anIntArrayArray7882[i_5_][i_6_]), (byte) 0);
				bool &= bool_7_;
				if (!bool_7_)
					class650.anInt8380 = anIntArrayArray7882[i_5_][i_6_] * -1938569789;
			}
		}
		return bool;
	}

	public final Class602 method9893(Interface19 interface19, Interface17 interface17, int i) {
		int i_8_ = -1;
		if (-1 != -1520549181 * anInt7914) {
			VarBitDefinitions class309 = interface19.method106(-1520549181 * anInt7914, -814506691);
			if (class309 != null)
				i_8_ = interface17.method93(class309, 449210170);
		} else if (-612414895 * anInt7911 != -1) {
			Class159 class159 = interface19.method110(VarDomainType.PLAYER_CONFIGS, -612414895 * anInt7911, 1657625672);
			if (class159 != null)
				i_8_ = interface17.method94(class159, 1562556213);
		}
		if (i_8_ < 0 || i_8_ >= anIntArray7912.length - 1) {
			int i_9_ = anIntArray7912[anIntArray7912.length - 1];
			if (-1 != i_9_)
				return (Class602) anInterface12_7856.getDefinition(i_9_, (byte) 50);
			return null;
		}
		if (anIntArray7912[i_8_] == -1)
			return null;
		return ((Class602) anInterface12_7856.getDefinition(anIntArray7912[i_8_], (byte) 22));
	}

	public final synchronized Class167 method9894(Class178 class178, int i, int i_10_, int i_11_, Class142 class142, Class142 class142_12_, int i_13_, int i_14_, int i_15_, Class707 class707, Class591 class591, int i_16_) {
		if (Class523_Sub29.method16177(i_10_, -1794078215))
			i_10_ = Class607.aClass607_7968.anInt7982 * 1923531495;
		long l = (long) ((i_10_ << 3) + (-2005438859 * anInt7854 << 10) + i_11_);
		int i_17_ = i;
		l |= (long) (class178.anInt1922 * -1144788131 << 29);
		if (class591 != null)
			l |= class591.aLong7806 * -6335477633115279013L << 32;
		if (null != class707)
			i |= class707.method14173(1281596635);
		if (aByte7875 == 3)
			i |= 0x7;
		else {
			if (0 != aByte7875 || 0 != anInt7894 * -1856650691)
				i |= 0x2;
			if (0 != 573920485 * anInt7902)
				i |= 0x1;
			if (0 != anInt7860 * 821236879)
				i |= 0x4;
		}
		if (1923531495 * Class607.aClass607_7970.anInt7982 == i_10_ && i_11_ > 3)
			i |= 0x5;
		Class167 class167;
		synchronized (aClass609_7855.aClass209_7991) {
			class167 = (Class167) aClass609_7855.aClass209_7991.method3767(l);
		}
		if (class167 == null || class178.method3068(class167.method2683(), i) != 0) {
			if (null != class167)
				i = class178.method3117(i, class167.method2683());
			class167 = method9895(class178, i, i_10_, i_11_, class591, 2116665353);
			if (null == class167)
				return null;
			synchronized (aClass609_7855.aClass209_7991) {
				aClass609_7855.aClass209_7991.method3770(class167, l);
			}
		}
		boolean bool = false;
		if (null != class707) {
			class167 = class167.method2681((byte) 1, i, true);
			bool = true;
			class707.method14229(class167, i_11_ & 0x3, 2073304183);
		}
		if (1923531495 * Class607.aClass607_7970.anInt7982 == i_10_ && i_11_ > 3) {
			if (!bool) {
				class167 = class167.method2681((byte) 3, i, true);
				bool = true;
			}
			class167.method2685(2048);
		}
		if (0 != aByte7875) {
			if (!bool) {
				class167 = class167.method2681((byte) 3, i, true);
				bool = true;
			}
			class167.method2692(aByte7875, 909976687 * anInt7904, class142, class142_12_, i_13_, i_14_, i_15_);
		}
		if (0 != 573920485 * anInt7902 || -1856650691 * anInt7894 != 0 || 0 != 821236879 * anInt7860) {
			if (!bool) {
				class167 = class167.method2681((byte) 3, i, true);
				bool = true;
			}
			class167.method2689(573920485 * anInt7902, -1856650691 * anInt7894, 821236879 * anInt7860);
		}
		if (bool)
			class167.method2769(i_17_);
		return class167;
	}

	Class167 method9895(Class178 class178, int i, int i_18_, int i_19_, Class591 class591, int i_20_) {
		int i_21_ = 603908989 * anInt7885 + 64;
		int i_22_ = -566092303 * anInt7886 + 850;
		int i_23_ = i;
		boolean bool = (aBool7908 || (1923531495 * Class607.aClass607_7965.anInt7982 == i_18_ && i_19_ > 3));
		if (bool)
			i |= 0x10;
		if (i_19_ == 0) {
			if (128 != anInt7915 * -1424671883 || -24187593 * anInt7884 != 0)
				i |= 0x1;
			if (anInt7898 * -1503565583 != 128 || 0 != 1589785863 * anInt7901)
				i |= 0x4;
		} else
			i |= 0xd;
		if (-251086643 * anInt7876 != 128 || 1793184279 * anInt7900 != 0)
			i |= 0x2;
		if (aShortArray7878 != null)
			i |= 0x4000;
		if (null != aShortArray7863)
			i |= 0x8000;
		if (aByte7870 != 0)
			i |= 0x80000;
		Class167 class167 = null;
		if (aByteArray7857 != null) {
			int i_24_ = -1;
			for (int i_25_ = 0; i_25_ < aByteArray7857.length; i_25_++) {
				if (aByteArray7857[i_25_] == i_18_) {
					i_24_ = i_25_;
					break;
				}
			}
			if (i_24_ == -1)
				return null;
			int[] is = (null != class591 && class591.anIntArray7805 != null ? class591.anIntArray7805 : anIntArrayArray7882[i_24_]);
			int i_26_ = is.length;
			if (i_26_ > 0) {
				long l = (long) (-1144788131 * class178.anInt1922);
				for (int i_27_ = 0; i_27_ < i_26_; i_27_++)
					l = (long) is[i_27_] + l * 67783L;
				synchronized (aClass609_7855.aClass209_7997) {
					class167 = ((Class167) aClass609_7855.aClass209_7997.method3767(l));
				}
				if (class167 != null) {
					if (i_21_ != class167.method2722())
						i |= 0x1000;
					if (i_22_ != class167.method2723())
						i |= 0x2000;
				}
				if (null == class167 || class178.method3068(class167.method2683(), i) != 0) {
					int i_28_ = i | 0x1f01f;
					if (null != class167)
						i_28_ = class178.method3117(i_28_, class167.method2683());
					Class179 class179 = null;
					synchronized (aClass609_7855.aClass179Array7996) {
						for (int i_29_ = 0; i_29_ < i_26_; i_29_++) {
							byte[] is_30_ = aClass609_7855.method9995(is[i_29_], 2030699955);
							if (is_30_ == null) {
								Class167 class167_31_ = null;
								return class167_31_;
							}
							class179 = new Class179(is_30_);
							if (class179.anInt1952 < 13)
								class179.method3494(2);
							if (i_26_ > 1)
								aClass609_7855.aClass179Array7996[i_29_] = class179;
						}
						if (i_26_ > 1)
							class179 = new Class179((aClass609_7855.aClass179Array7996), i_26_);
					}
					class167 = class178.method3115(class179, i_28_, 649879523 * (aClass609_7855.anInt7995), i_21_, i_22_);
					synchronized (aClass609_7855.aClass209_7997) {
						aClass609_7855.aClass209_7997.method3770(class167, l);
					}
				}
			}
		}
		if (null == class167)
			return null;
		Class167 class167_32_ = class167.method2681((byte) 0, i, true);
		if (i_21_ != class167.method2722())
			class167_32_.method2827(i_21_);
		if (i_22_ != class167.method2723())
			class167_32_.method2721(i_22_);
		if (bool)
			class167_32_.method2690();
		if (Class607.aClass607_7968.anInt7982 * 1923531495 == i_18_ && i_19_ > 3) {
			class167_32_.method2755(2048);
			class167_32_.method2689(180, 0, -180);
		}
		i_19_ &= 0x3;
		if (1 == i_19_)
			class167_32_.method2755(4096);
		else if (i_19_ == 2)
			class167_32_.method2755(8192);
		else if (i_19_ == 3)
			class167_32_.method2755(12288);
		if (aShortArray7878 != null) {
			short[] is;
			if (null != class591 && null != class591.aShortArray7804)
				is = class591.aShortArray7804;
			else
				is = aShortArray7929;
			for (int i_33_ = 0; i_33_ < aShortArray7878.length; i_33_++) {
				if (null != aByteArray7909 && i_33_ < aByteArray7909.length)
					class167_32_.method2725(aShortArray7878[i_33_], (aShortArray7864[aByteArray7909[i_33_] & 0xff]));
				else
					class167_32_.method2725(aShortArray7878[i_33_], is[i_33_]);
			}
		}
		if (null != aShortArray7863) {
			short[] is;
			if (class591 != null && null != class591.aShortArray7807)
				is = class591.aShortArray7807;
			else
				is = aShortArray7916;
			for (int i_34_ = 0; i_34_ < aShortArray7863.length; i_34_++)
				class167_32_.method2826(aShortArray7863[i_34_], is[i_34_]);
		}
		if (aByte7870 != 0)
			class167_32_.method2839(aByte7897, aByte7868, aByte7887, aByte7870 & 0xff);
		if (anInt7915 * -1424671883 != 128 || 128 != anInt7876 * -251086643 || -1503565583 * anInt7898 != 128)
			class167_32_.method2691(-1424671883 * anInt7915, -251086643 * anInt7876, -1503565583 * anInt7898);
		if (0 != anInt7884 * -24187593 || 0 != 1793184279 * anInt7900 || 0 != 1589785863 * anInt7901)
			class167_32_.method2689(-24187593 * anInt7884, 1793184279 * anInt7900, 1589785863 * anInt7901);
		class167_32_.method2769(i_23_);
		return class167_32_;
	}

	void method9896(RSBuffer class523_sub34, int i, int i_35_) {
		if (i == 1) {
			int i_36_ = class523_sub34.readUnsignedByte(-56872153);
			aByteArray7857 = new byte[i_36_];
			anIntArrayArray7882 = new int[i_36_][];
			for (int i_37_ = 0; i_37_ < i_36_; i_37_++) {
				aByteArray7857[i_37_] = class523_sub34.readByte((short) -5069);
				int i_38_ = class523_sub34.readUnsignedByte(294553059);
				anIntArrayArray7882[i_37_] = new int[i_38_];
				for (int i_39_ = 0; i_39_ < i_38_; i_39_++)
					anIntArrayArray7882[i_37_][i_39_] = class523_sub34.readBigSmart((byte) -70);
			}
		} else if (i == 2)
			aString7859 = class523_sub34.readString(-723161835).intern();
		else if (14 == i)
			anInt7871 = class523_sub34.readUnsignedByte(185836435) * 94492435;
		else if (15 == i)
			anInt7872 = class523_sub34.readUnsignedByte(145393168) * 1327769823;
		else if (17 == i)
			anInt7852 = 0;
		else if (i != 18) {
			if (i == 19)
				anInt7874 = class523_sub34.readUnsignedByte(2045694750) * -819518467;
			else if (i == 21)
				aByte7875 = (byte) 1;
			else if (i == 22)
				aBool7877 = true;
			else if (23 == i)
				anInt7873 = -54447949;
			else if (i == 24) {
				int i_40_ = class523_sub34.readBigSmart((byte) -84);
				if (i_40_ != -1)
					anIntArray7867 = new int[] { i_40_ };
			} else if (27 == i)
				anInt7852 = 557637137;
			else if (28 == i)
				anInt7907 = ((class523_sub34.readUnsignedByte(2019819310) << 2) * 174912875);
			else if (29 == i)
				anInt7885 = class523_sub34.readByte((short) -17105) * -320789035;
			else if (39 == i)
				anInt7886 = class523_sub34.readByte((short) 395) * 919207765;
			else if (i >= 30 && i < 35)
				aStringArray7869[i - 30] = class523_sub34.readString(-939730697).intern();
			else if (40 == i) {
				int i_41_ = class523_sub34.readUnsignedByte(466741673);
				aShortArray7878 = new short[i_41_];
				aShortArray7929 = new short[i_41_];
				for (int i_42_ = 0; i_42_ < i_41_; i_42_++) {
					aShortArray7878[i_42_] = (short) class523_sub34.readUnsignedShort(-1904583313);
					aShortArray7929[i_42_] = (short) class523_sub34.readUnsignedShort(-1856078614);
				}
			} else if (i == 41) {
				int i_43_ = class523_sub34.readUnsignedByte(-359915781);
				aShortArray7863 = new short[i_43_];
				aShortArray7916 = new short[i_43_];
				for (int i_44_ = 0; i_44_ < i_43_; i_44_++) {
					aShortArray7863[i_44_] = (short) class523_sub34.readUnsignedShort(-2065278504);
					aShortArray7916[i_44_] = (short) class523_sub34.readUnsignedShort(-1453681261);
				}
			} else if (42 == i) {
				int i_45_ = class523_sub34.readUnsignedByte(-1695540891);
				aByteArray7909 = new byte[i_45_];
				for (int i_46_ = 0; i_46_ < i_45_; i_46_++)
					aByteArray7909[i_46_] = class523_sub34.readByte((short) -21256);
			} else if (i == 44) {
				int i_47_ = class523_sub34.readUnsignedShort(-495262270);
				int i_48_ = 0;
				for (int i_49_ = i_47_; i_49_ > 0; i_49_ >>= 1)
					i_48_++;
				aByteArray7861 = new byte[i_48_];
				byte i_50_ = 0;
				for (int i_51_ = 0; i_51_ < i_48_; i_51_++) {
					if ((i_47_ & 1 << i_51_) > 0) {
						aByteArray7861[i_51_] = i_50_;
						i_50_++;
					} else
						aByteArray7861[i_51_] = (byte) -1;
				}
			} else if (45 == i) {
				int i_52_ = class523_sub34.readUnsignedShort(-419391584);
				int i_53_ = 0;
				for (int i_54_ = i_52_; i_54_ > 0; i_54_ >>= 1)
					i_53_++;
				aByteArray7866 = new byte[i_53_];
				byte i_55_ = 0;
				for (int i_56_ = 0; i_56_ < i_53_; i_56_++) {
					if ((i_52_ & 1 << i_56_) > 0) {
						aByteArray7866[i_56_] = i_55_;
						i_55_++;
					} else
						aByteArray7866[i_56_] = (byte) -1;
				}
			} else if (62 == i)
				aBool7908 = true;
			else if (64 == i)
				aBool7895 = false;
			else if (65 == i)
				anInt7915 = class523_sub34.readUnsignedShort(-153978699) * 360938717;
			else if (66 == i)
				anInt7876 = class523_sub34.readUnsignedShort(-1523866966) * -1720323067;
			else if (67 == i)
				anInt7898 = class523_sub34.readUnsignedShort(-1412162097) * -1337423855;
			else if (69 == i)
				class523_sub34.readUnsignedByte(-370782517);
			else if (70 == i)
				anInt7884 = ((class523_sub34.readShort(-708952608) << 2) * -2103814009);
			else if (i == 71)
				anInt7900 = ((class523_sub34.readShort(-505212545) << 2) * 939951527);
			else if (i == 72)
				anInt7901 = ((class523_sub34.readShort(-1629410840) << 2) * 1615145143);
			else if (i == 73)
				aBool7905 = true;
			else if (i == 74)
				aBool7903 = true;
			else if (75 == i)
				anInt7862 = class523_sub34.readUnsignedByte(-1760897381) * 757525315;
			else if (77 == i || 92 == i) {
				anInt7914 = class523_sub34.readUnsignedShort(-816965295) * 665517547;
				if (65535 == anInt7914 * -1520549181)
					anInt7914 = -665517547;
				anInt7911 = class523_sub34.readUnsignedShort(-144214900) * 463355569;
				if (-612414895 * anInt7911 == 65535)
					anInt7911 = -463355569;
				int i_57_ = -1;
				if (92 == i)
					i_57_ = class523_sub34.readBigSmart((byte) -71);
				int i_58_ = class523_sub34.readUnsignedByte(1979987927);
				anIntArray7912 = new int[i_58_ + 2];
				for (int i_59_ = 0; i_59_ <= i_58_; i_59_++)
					anIntArray7912[i_59_] = class523_sub34.readBigSmart((byte) -128);
				anIntArray7912[i_58_ + 1] = i_57_;
			} else if (i == 78) {
				anInt7899 = class523_sub34.readUnsignedShort(-169989834) * 1140254429;
				anInt7913 = class523_sub34.readUnsignedByte(-1596277627) * -444782429;
			} else if (79 == i) {
				anInt7896 = class523_sub34.readUnsignedShort(-963185833) * 806316897;
				anInt7917 = class523_sub34.readUnsignedShort(-1265137340) * 1003283367;
				anInt7913 = class523_sub34.readUnsignedByte(1211874443) * -444782429;
				int i_60_ = class523_sub34.readUnsignedByte(-592449767);
				anIntArray7918 = new int[i_60_];
				for (int i_61_ = 0; i_61_ < i_60_; i_61_++)
					anIntArray7918[i_61_] = class523_sub34.readUnsignedShort(-1078968663);
			} else if (i == 81) {
				aByte7875 = (byte) 2;
				anInt7904 = class523_sub34.readUnsignedByte(-1186908455) * -1598386432;
			} else if (82 == i)
				aBool7920 = true;
			else if (88 == i)
				aBool7921 = false;
			else if (89 == i)
				aBool7919 = false;
			else if (91 == i)
				aBool7922 = true;
			else if (93 == i) {
				aByte7875 = (byte) 3;
				anInt7904 = class523_sub34.readUnsignedShort(-771439245) * -1633633649;
			} else if (94 == i)
				aByte7875 = (byte) 4;
			else if (i == 95) {
				aByte7875 = (byte) 5;
				anInt7904 = class523_sub34.readShort(-1563895340) * -1633633649;
			} else if (i == 97)
				aBool7891 = true;
			else if (98 == i)
				aBool7924 = true;
			else if (99 == i || 100 == i) {
				class523_sub34.readUnsignedByte(-752563749);
				class523_sub34.readUnsignedShort(-536539378);
			} else if (i == 101)
				anInt7892 = class523_sub34.readUnsignedByte(591743882) * 1555449389;
			else if (102 == i)
				anInt7890 = class523_sub34.readUnsignedShort(-1531257424) * 708070921;
			else if (103 == i)
				anInt7873 = 0;
			else if (i == 104)
				anInt7889 = class523_sub34.readUnsignedByte(1469754281) * -1886938889;
			else if (105 == i)
				aBool7893 = true;
			else if (i == 106) {
				int i_62_ = class523_sub34.readUnsignedByte(-115694967);
				int i_63_ = 0;
				anIntArray7867 = new int[i_62_];
				anIntArray7910 = new int[i_62_];
				for (int i_64_ = 0; i_64_ < i_62_; i_64_++) {
					anIntArray7867[i_64_] = class523_sub34.readBigSmart((byte) -65);
					i_63_ += anIntArray7910[i_64_] = class523_sub34.readUnsignedByte(-572149872);
				}
				for (int i_65_ = 0; i_65_ < i_62_; i_65_++)
					anIntArray7910[i_65_] = 65535 * anIntArray7910[i_65_] / i_63_;
			} else if (107 == i)
				anInt7906 = class523_sub34.readUnsignedShort(-1068656456) * -597858793;
			else if (i >= 150 && i < 155) {
				aStringArray7869[i - 150] = class523_sub34.readString(-116138009).intern();
				if (!aClass609_7855.aBool7994)
					aStringArray7869[i - 150] = null;
			} else if (i == 160) {
				int i_66_ = class523_sub34.readUnsignedByte(752669752);
				anIntArray7925 = new int[i_66_];
				for (int i_67_ = 0; i_67_ < i_66_; i_67_++)
					anIntArray7925[i_67_] = class523_sub34.readUnsignedShort(-1794993674);
			} else if (162 == i) {
				aByte7875 = (byte) 3;
				anInt7904 = class523_sub34.readUnsignedInt((byte) -108) * -1633633649;
			} else if (i == 163) {
				aByte7897 = class523_sub34.readByte((short) -18659);
				aByte7868 = class523_sub34.readByte((short) -8827);
				aByte7887 = class523_sub34.readByte((short) -15900);
				aByte7870 = class523_sub34.readByte((short) -6537);
			} else if (i == 164)
				anInt7902 = class523_sub34.readShort(1952584204) * 1975535853;
			else if (i == 165)
				anInt7894 = class523_sub34.readShort(-1451505657) * -1510382315;
			else if (i == 166)
				anInt7860 = class523_sub34.readShort(138183653) * -559183249;
			else if (i == 167)
				anInt7930 = class523_sub34.readUnsignedShort(-321001982) * -123728821;
			else if (i != 168 && i != 169) {
				if (170 == i)
					anInt7879 = class523_sub34.readUnsignedSmart(368514876) * 951657801;
				else if (i == 171)
					anInt7880 = class523_sub34.readUnsignedSmart(368514876) * -834008189;
				else if (173 == i) {
					anInt7926 = class523_sub34.readUnsignedShort(-752778912) * 2112581933;
					anInt7927 = class523_sub34.readUnsignedShort(-1404004600) * 829009735;
				} else if (177 == i)
					aBool7928 = true;
				else if (178 == i)
					anInt7858 = class523_sub34.readUnsignedByte(1476993691) * 66852735;
				else if (186 == i)
					aClass594_7865 = ((Class594) Class334.method5910(Class270.method4982(-743257270), class523_sub34.readUnsignedByte(-321463364), 1060475969));
				else if (i != 188) {
					if (189 == i)
						aBool7881 = true;
					else if (i >= 190 && i < 196) {
						if (anIntArray7888 == null) {
							anIntArray7888 = new int[6];
							Arrays.fill(anIntArray7888, -1);
						}
						anIntArray7888[i - 190] = class523_sub34.readUnsignedShort(-408133312);
					} else if (i == 196)
						Class334.method5910(Class221.method4133(1163360091), class523_sub34.readUnsignedByte(-818706784), -51583012);
					else if (i == 197)
						Class334.method5910(Class385.method6450(-1519914498), class523_sub34.readUnsignedByte(-1996726701), -1608317604);
					else if (i != 198 && i != 199) {
						if (200 == i)
							aBool7883 = true;
						else if (i == 201) {
							aClass430_7931 = new Class430();
							aClass430_7931.aFloat4855 = (float) class523_sub34.method16487((byte) -120);
							aClass430_7931.aFloat4859 = (float) class523_sub34.method16487((byte) -87);
							aClass430_7931.aFloat4853 = (float) class523_sub34.method16487((byte) -89);
							aClass430_7931.aFloat4854 = (float) class523_sub34.method16487((byte) -5);
							aClass430_7931.aFloat4851 = (float) class523_sub34.method16487((byte) 11);
							aClass430_7931.aFloat4856 = (float) class523_sub34.method16487((byte) -80);
						} else if (249 == i) {
							int i_68_ = class523_sub34.readUnsignedByte(1027994130);
							if (null == aClass14_7923) {
								int i_69_ = Class628.method10313(i_68_, 37671095);
								aClass14_7923 = new Class14(i_69_);
							}
							for (int i_70_ = 0; i_70_ < i_68_; i_70_++) {
								boolean bool = (class523_sub34.readUnsignedByte(590223259) == 1);
								int i_71_ = class523_sub34.read24BitInt(-2067934430);
								Class523 class523;
								if (bool)
									class523 = new Class523_Sub28(class523_sub34.readString(145043215).intern());
								else
									class523 = new Class523_Sub24(class523_sub34.readUnsignedInt((byte) -93));
								aClass14_7923.method738(class523, (long) i_71_);
							}
						}
					}
				}
			}
		}
	}

	public int method9897(int i, int i_72_, int i_73_) {
		if (aClass14_7923 == null)
			return i_72_;
		Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass14_7923.getFromIndex((long) i);
		if (null == class523_sub24)
			return i_72_;
		return -677457577 * class523_sub24.anInt10542;
	}

	public String method9898(int i, String string, int i_74_) {
		if (null == aClass14_7923)
			return string;
		Class523_Sub28 class523_sub28 = (Class523_Sub28) aClass14_7923.getFromIndex((long) i);
		if (class523_sub28 == null)
			return string;
		return (String) class523_sub28.anObject10554;
	}

	public boolean method9899(byte i) {
		if (anIntArray7912 == null)
			return 547234165 * anInt7899 != -1 || anIntArray7918 != null;
		for (int i_75_ = 0; i_75_ < anIntArray7912.length; i_75_++) {
			if (-1 != anIntArray7912[i_75_]) {
				Class602 class602_76_ = ((Class602) anInterface12_7856.getDefinition(anIntArray7912[i_75_], (byte) -44));
				if (547234165 * class602_76_.anInt7899 != -1 || null != class602_76_.anIntArray7918)
					return true;
			}
		}
		return false;
	}

	Class602(int i, Class609 class609, Interface12 interface12) {
		anInt7852 = 1115274274;
		anInt7874 = 819518467;
		aByte7875 = (byte) 0;
		anInt7904 = 1633633649;
		aBool7877 = false;
		anInt7873 = 54447949;
		anInt7879 = -1236545088;
		anInt7880 = 0;
		anIntArray7867 = null;
		anIntArray7910 = null;
		aBool7883 = false;
		anInt7907 = -1690477888;
		anInt7885 = 0;
		anInt7886 = 0;
		anInt7906 = 597858793;
		anInt7890 = -708070921;
		aBool7891 = false;
		anInt7892 = 0;
		aBool7893 = false;
		aBool7908 = false;
		aBool7895 = true;
		anInt7915 = -1044484480;
		anInt7876 = -1158020480;
		anInt7898 = 608438400;
		anInt7884 = 0;
		anInt7900 = 0;
		anInt7901 = 0;
		anInt7902 = 0;
		anInt7894 = 0;
		anInt7860 = 0;
		aBool7905 = false;
		aBool7903 = false;
		anInt7862 = -757525315;
		anInt7930 = 0;
		anInt7914 = -665517547;
		anInt7911 = -463355569;
		anInt7899 = -1140254429;
		anInt7913 = 0;
		anInt7858 = 0;
		anInt7889 = -133079543;
		anInt7896 = 0;
		anInt7917 = 0;
		aBool7919 = true;
		aBool7920 = false;
		aBool7921 = true;
		aBool7922 = false;
		aBool7924 = false;
		anInt7926 = -344904448;
		anInt7927 = 1773094656;
		aBool7928 = false;
		aBool7881 = false;
		aClass594_7865 = Class594.aClass594_7818;
		anInt7854 = 2014605789 * i;
		aClass609_7855 = class609;
		anInterface12_7856 = interface12;
		aStringArray7869 = (String[]) aClass609_7855.aStringArray7992.clone();
	}

	public boolean method9900(int i) {
		return anIntArray7867 != null && anIntArray7867.length > 1;
	}

	public boolean method9901() {
		return anIntArray7867 != null && anIntArray7867.length > 1;
	}

	public int[] method9902(int i) {
		return anIntArray7867;
	}

	public boolean method9903(int i, int i_77_) {
		if (anIntArray7867 != null && i != -1) {
			for (int i_78_ = 0; i_78_ < anIntArray7867.length; i_78_++) {
				if (anIntArray7867[i_78_] == i)
					return true;
			}
		}
		return false;
	}

	public int method9904(int i, byte i_79_) {
		if (anIntArray7888 == null)
			return -1;
		return anIntArray7888[i];
	}

	void method9905(RSBuffer class523_sub34, int i) {
		if (i == 1) {
			int i_80_ = class523_sub34.readUnsignedByte(1861909017);
			aByteArray7857 = new byte[i_80_];
			anIntArrayArray7882 = new int[i_80_][];
			for (int i_81_ = 0; i_81_ < i_80_; i_81_++) {
				aByteArray7857[i_81_] = class523_sub34.readByte((short) -7343);
				int i_82_ = class523_sub34.readUnsignedByte(570362074);
				anIntArrayArray7882[i_81_] = new int[i_82_];
				for (int i_83_ = 0; i_83_ < i_82_; i_83_++)
					anIntArrayArray7882[i_81_][i_83_] = class523_sub34.readBigSmart((byte) -9);
			}
		} else if (i == 2)
			aString7859 = class523_sub34.readString(-1507150956).intern();
		else if (14 == i)
			anInt7871 = class523_sub34.readUnsignedByte(-1899674174) * 94492435;
		else if (15 == i)
			anInt7872 = class523_sub34.readUnsignedByte(-1733758473) * 1327769823;
		else if (17 == i)
			anInt7852 = 0;
		else if (i != 18) {
			if (i == 19)
				anInt7874 = class523_sub34.readUnsignedByte(592477422) * -819518467;
			else if (i == 21)
				aByte7875 = (byte) 1;
			else if (i == 22)
				aBool7877 = true;
			else if (23 == i)
				anInt7873 = -54447949;
			else if (i == 24) {
				int i_84_ = class523_sub34.readBigSmart((byte) -56);
				if (i_84_ != -1)
					anIntArray7867 = new int[] { i_84_ };
			} else if (27 == i)
				anInt7852 = 557637137;
			else if (28 == i)
				anInt7907 = ((class523_sub34.readUnsignedByte(1281424741) << 2) * 174912875);
			else if (29 == i)
				anInt7885 = class523_sub34.readByte((short) -440) * -320789035;
			else if (39 == i)
				anInt7886 = class523_sub34.readByte((short) -1052) * 919207765;
			else if (i >= 30 && i < 35)
				aStringArray7869[i - 30] = class523_sub34.readString(-2097848005).intern();
			else if (40 == i) {
				int i_85_ = class523_sub34.readUnsignedByte(1673058980);
				aShortArray7878 = new short[i_85_];
				aShortArray7929 = new short[i_85_];
				for (int i_86_ = 0; i_86_ < i_85_; i_86_++) {
					aShortArray7878[i_86_] = (short) class523_sub34.readUnsignedShort(-358647117);
					aShortArray7929[i_86_] = (short) class523_sub34.readUnsignedShort(-1116694035);
				}
			} else if (i == 41) {
				int i_87_ = class523_sub34.readUnsignedByte(2068582463);
				aShortArray7863 = new short[i_87_];
				aShortArray7916 = new short[i_87_];
				for (int i_88_ = 0; i_88_ < i_87_; i_88_++) {
					aShortArray7863[i_88_] = (short) class523_sub34.readUnsignedShort(-1191974882);
					aShortArray7916[i_88_] = (short) class523_sub34.readUnsignedShort(-552285875);
				}
			} else if (42 == i) {
				int i_89_ = class523_sub34.readUnsignedByte(-204385436);
				aByteArray7909 = new byte[i_89_];
				for (int i_90_ = 0; i_90_ < i_89_; i_90_++)
					aByteArray7909[i_90_] = class523_sub34.readByte((short) -28506);
			} else if (i == 44) {
				int i_91_ = class523_sub34.readUnsignedShort(-1741582693);
				int i_92_ = 0;
				for (int i_93_ = i_91_; i_93_ > 0; i_93_ >>= 1)
					i_92_++;
				aByteArray7861 = new byte[i_92_];
				byte i_94_ = 0;
				for (int i_95_ = 0; i_95_ < i_92_; i_95_++) {
					if ((i_91_ & 1 << i_95_) > 0) {
						aByteArray7861[i_95_] = i_94_;
						i_94_++;
					} else
						aByteArray7861[i_95_] = (byte) -1;
				}
			} else if (45 == i) {
				int i_96_ = class523_sub34.readUnsignedShort(-780713480);
				int i_97_ = 0;
				for (int i_98_ = i_96_; i_98_ > 0; i_98_ >>= 1)
					i_97_++;
				aByteArray7866 = new byte[i_97_];
				byte i_99_ = 0;
				for (int i_100_ = 0; i_100_ < i_97_; i_100_++) {
					if ((i_96_ & 1 << i_100_) > 0) {
						aByteArray7866[i_100_] = i_99_;
						i_99_++;
					} else
						aByteArray7866[i_100_] = (byte) -1;
				}
			} else if (62 == i)
				aBool7908 = true;
			else if (64 == i)
				aBool7895 = false;
			else if (65 == i)
				anInt7915 = class523_sub34.readUnsignedShort(-1812977853) * 360938717;
			else if (66 == i)
				anInt7876 = class523_sub34.readUnsignedShort(-2067393308) * -1720323067;
			else if (67 == i)
				anInt7898 = class523_sub34.readUnsignedShort(-2137954903) * -1337423855;
			else if (69 == i)
				class523_sub34.readUnsignedByte(-1955887646);
			else if (70 == i)
				anInt7884 = ((class523_sub34.readShort(1305903110) << 2) * -2103814009);
			else if (i == 71)
				anInt7900 = ((class523_sub34.readShort(-247719735) << 2) * 939951527);
			else if (i == 72)
				anInt7901 = ((class523_sub34.readShort(1270935871) << 2) * 1615145143);
			else if (i == 73)
				aBool7905 = true;
			else if (i == 74)
				aBool7903 = true;
			else if (75 == i)
				anInt7862 = class523_sub34.readUnsignedByte(1264062461) * 757525315;
			else if (77 == i || 92 == i) {
				anInt7914 = class523_sub34.readUnsignedShort(-1271156382) * 665517547;
				if (65535 == anInt7914 * -1520549181)
					anInt7914 = -665517547;
				anInt7911 = class523_sub34.readUnsignedShort(-577814956) * 463355569;
				if (-612414895 * anInt7911 == 65535)
					anInt7911 = -463355569;
				int i_101_ = -1;
				if (92 == i)
					i_101_ = class523_sub34.readBigSmart((byte) -100);
				int i_102_ = class523_sub34.readUnsignedByte(-1088147646);
				anIntArray7912 = new int[i_102_ + 2];
				for (int i_103_ = 0; i_103_ <= i_102_; i_103_++)
					anIntArray7912[i_103_] = class523_sub34.readBigSmart((byte) -3);
				anIntArray7912[i_102_ + 1] = i_101_;
			} else if (i == 78) {
				anInt7899 = class523_sub34.readUnsignedShort(-950755383) * 1140254429;
				anInt7913 = class523_sub34.readUnsignedByte(89015645) * -444782429;
			} else if (79 == i) {
				anInt7896 = class523_sub34.readUnsignedShort(-1433629828) * 806316897;
				anInt7917 = class523_sub34.readUnsignedShort(-2015876707) * 1003283367;
				anInt7913 = class523_sub34.readUnsignedByte(1555298102) * -444782429;
				int i_104_ = class523_sub34.readUnsignedByte(-2052867750);
				anIntArray7918 = new int[i_104_];
				for (int i_105_ = 0; i_105_ < i_104_; i_105_++)
					anIntArray7918[i_105_] = class523_sub34.readUnsignedShort(-1061726034);
			} else if (i == 81) {
				aByte7875 = (byte) 2;
				anInt7904 = class523_sub34.readUnsignedByte(1656454094) * -1598386432;
			} else if (82 == i)
				aBool7920 = true;
			else if (88 == i)
				aBool7921 = false;
			else if (89 == i)
				aBool7919 = false;
			else if (91 == i)
				aBool7922 = true;
			else if (93 == i) {
				aByte7875 = (byte) 3;
				anInt7904 = class523_sub34.readUnsignedShort(-2023739762) * -1633633649;
			} else if (94 == i)
				aByte7875 = (byte) 4;
			else if (i == 95) {
				aByte7875 = (byte) 5;
				anInt7904 = class523_sub34.readShort(-761575735) * -1633633649;
			} else if (i == 97)
				aBool7891 = true;
			else if (98 == i)
				aBool7924 = true;
			else if (99 == i || 100 == i) {
				class523_sub34.readUnsignedByte(597935242);
				class523_sub34.readUnsignedShort(-967546959);
			} else if (i == 101)
				anInt7892 = class523_sub34.readUnsignedByte(520481946) * 1555449389;
			else if (102 == i)
				anInt7890 = class523_sub34.readUnsignedShort(-860095855) * 708070921;
			else if (103 == i)
				anInt7873 = 0;
			else if (i == 104)
				anInt7889 = class523_sub34.readUnsignedByte(1855889683) * -1886938889;
			else if (105 == i)
				aBool7893 = true;
			else if (i == 106) {
				int i_106_ = class523_sub34.readUnsignedByte(-1022460414);
				int i_107_ = 0;
				anIntArray7867 = new int[i_106_];
				anIntArray7910 = new int[i_106_];
				for (int i_108_ = 0; i_108_ < i_106_; i_108_++) {
					anIntArray7867[i_108_] = class523_sub34.readBigSmart((byte) -61);
					i_107_ += anIntArray7910[i_108_] = class523_sub34.readUnsignedByte(-853092751);
				}
				for (int i_109_ = 0; i_109_ < i_106_; i_109_++)
					anIntArray7910[i_109_] = 65535 * anIntArray7910[i_109_] / i_107_;
			} else if (107 == i)
				anInt7906 = class523_sub34.readUnsignedShort(-1730411416) * -597858793;
			else if (i >= 150 && i < 155) {
				aStringArray7869[i - 150] = class523_sub34.readString(-54223267).intern();
				if (!aClass609_7855.aBool7994)
					aStringArray7869[i - 150] = null;
			} else if (i == 160) {
				int i_110_ = class523_sub34.readUnsignedByte(-932724333);
				anIntArray7925 = new int[i_110_];
				for (int i_111_ = 0; i_111_ < i_110_; i_111_++)
					anIntArray7925[i_111_] = class523_sub34.readUnsignedShort(-1619490902);
			} else if (162 == i) {
				aByte7875 = (byte) 3;
				anInt7904 = class523_sub34.readUnsignedInt((byte) -54) * -1633633649;
			} else if (i == 163) {
				aByte7897 = class523_sub34.readByte((short) -12888);
				aByte7868 = class523_sub34.readByte((short) -22850);
				aByte7887 = class523_sub34.readByte((short) -3746);
				aByte7870 = class523_sub34.readByte((short) -4168);
			} else if (i == 164)
				anInt7902 = class523_sub34.readShort(-212305637) * 1975535853;
			else if (i == 165)
				anInt7894 = class523_sub34.readShort(1470644567) * -1510382315;
			else if (i == 166)
				anInt7860 = class523_sub34.readShort(291521945) * -559183249;
			else if (i == 167)
				anInt7930 = class523_sub34.readUnsignedShort(-10131234) * -123728821;
			else if (i != 168 && i != 169) {
				if (170 == i)
					anInt7879 = class523_sub34.readUnsignedSmart(368514876) * 951657801;
				else if (i == 171)
					anInt7880 = class523_sub34.readUnsignedSmart(368514876) * -834008189;
				else if (173 == i) {
					anInt7926 = class523_sub34.readUnsignedShort(-2011220793) * 2112581933;
					anInt7927 = class523_sub34.readUnsignedShort(-1161194969) * 829009735;
				} else if (177 == i)
					aBool7928 = true;
				else if (178 == i)
					anInt7858 = class523_sub34.readUnsignedByte(317166163) * 66852735;
				else if (186 == i)
					aClass594_7865 = ((Class594) Class334.method5910(Class270.method4982(-743257270), class523_sub34.readUnsignedByte(1394488141), 649257724));
				else if (i != 188) {
					if (189 == i)
						aBool7881 = true;
					else if (i >= 190 && i < 196) {
						if (anIntArray7888 == null) {
							anIntArray7888 = new int[6];
							Arrays.fill(anIntArray7888, -1);
						}
						anIntArray7888[i - 190] = class523_sub34.readUnsignedShort(-495272676);
					} else if (i == 196)
						Class334.method5910(Class221.method4133(-1721780088), class523_sub34.readUnsignedByte(-225067421), -419633444);
					else if (i == 197)
						Class334.method5910(Class385.method6450(-1522791297), class523_sub34.readUnsignedByte(-965456904), -1970026938);
					else if (i != 198 && i != 199) {
						if (200 == i)
							aBool7883 = true;
						else if (i == 201) {
							aClass430_7931 = new Class430();
							aClass430_7931.aFloat4855 = (float) class523_sub34.method16487((byte) -20);
							aClass430_7931.aFloat4859 = (float) class523_sub34.method16487((byte) -43);
							aClass430_7931.aFloat4853 = (float) class523_sub34.method16487((byte) -14);
							aClass430_7931.aFloat4854 = (float) class523_sub34.method16487((byte) -15);
							aClass430_7931.aFloat4851 = (float) class523_sub34.method16487((byte) -19);
							aClass430_7931.aFloat4856 = (float) class523_sub34.method16487((byte) -1);
						} else if (249 == i) {
							int i_112_ = class523_sub34.readUnsignedByte(1976214294);
							if (null == aClass14_7923) {
								int i_113_ = Class628.method10313(i_112_, -517726905);
								aClass14_7923 = new Class14(i_113_);
							}
							for (int i_114_ = 0; i_114_ < i_112_; i_114_++) {
								boolean bool = (class523_sub34.readUnsignedByte(-974428050) == 1);
								int i_115_ = class523_sub34.read24BitInt(924619771);
								Class523 class523;
								if (bool)
									class523 = new Class523_Sub28(class523_sub34.readString(-74031726).intern());
								else
									class523 = new Class523_Sub24(class523_sub34.readUnsignedInt((byte) -98));
								aClass14_7923.method738(class523, (long) i_115_);
							}
						}
					}
				}
			}
		}
	}

	public void method75(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(1663016148);
			if (0 == i)
				break;
			method9896(class523_sub34, i, 1042939431);
		}
	}

	public void method76(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-1783186711);
			if (0 == i)
				break;
			method9896(class523_sub34, i, 1042939431);
		}
	}

	public void method60(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-257725951);
			if (0 == i)
				break;
			method9896(class523_sub34, i, 1042939431);
		}
	}

	public void method63(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(49453466);
			if (0 == i)
				break;
			method9896(class523_sub34, i, 1042939431);
		}
	}

	public void readValues(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-1694875962);
			if (0 == i)
				break;
			method9896(class523_sub34, i, 1042939431);
		}
	}

	public void method58(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(1542020698);
			if (0 == i)
				break;
			method9896(class523_sub34, i, 1042939431);
		}
	}

	public void method78() {
		method9890(-1759297857);
		if (aBool7903)
			anInt7852 = 0;
		if (!aClass609_7855.aBool7994 && aBool7922) {
			aStringArray7869 = null;
			anIntArray7925 = null;
		}
	}

	public void method79() {
		method9890(-1759297857);
		if (aBool7903)
			anInt7852 = 0;
		if (!aClass609_7855.aBool7994 && aBool7922) {
			aStringArray7869 = null;
			anIntArray7925 = null;
		}
	}

	public final Class602 method9906(Interface19 interface19, Interface17 interface17) {
		int i = -1;
		if (-1 != -1520549181 * anInt7914) {
			VarBitDefinitions class309 = interface19.method106(-1520549181 * anInt7914, 288087293);
			if (class309 != null)
				i = interface17.method93(class309, 24013635);
		} else if (-612414895 * anInt7911 != -1) {
			Class159 class159 = interface19.method110(VarDomainType.PLAYER_CONFIGS, -612414895 * anInt7911, 2065079636);
			if (class159 != null)
				i = interface17.method94(class159, -876331849);
		}
		if (i < 0 || i >= anIntArray7912.length - 1) {
			int i_116_ = anIntArray7912[anIntArray7912.length - 1];
			if (-1 != i_116_)
				return ((Class602) anInterface12_7856.getDefinition(i_116_, (byte) -3));
			return null;
		}
		if (anIntArray7912[i] == -1)
			return null;
		return ((Class602) anInterface12_7856.getDefinition(anIntArray7912[i], (byte) -39));
	}

	public void method73() {
		method9890(-1759297857);
		if (aBool7903)
			anInt7852 = 0;
		if (!aClass609_7855.aBool7994 && aBool7922) {
			aStringArray7869 = null;
			anIntArray7925 = null;
		}
	}

	void method9907(RSBuffer class523_sub34, int i) {
		if (i == 1) {
			int i_117_ = class523_sub34.readUnsignedByte(-789449174);
			aByteArray7857 = new byte[i_117_];
			anIntArrayArray7882 = new int[i_117_][];
			for (int i_118_ = 0; i_118_ < i_117_; i_118_++) {
				aByteArray7857[i_118_] = class523_sub34.readByte((short) -18226);
				int i_119_ = class523_sub34.readUnsignedByte(-1094308481);
				anIntArrayArray7882[i_118_] = new int[i_119_];
				for (int i_120_ = 0; i_120_ < i_119_; i_120_++)
					anIntArrayArray7882[i_118_][i_120_] = class523_sub34.readBigSmart((byte) -118);
			}
		} else if (i == 2)
			aString7859 = class523_sub34.readString(-707250836).intern();
		else if (14 == i)
			anInt7871 = class523_sub34.readUnsignedByte(-1987722782) * 94492435;
		else if (15 == i)
			anInt7872 = class523_sub34.readUnsignedByte(244283988) * 1327769823;
		else if (17 == i)
			anInt7852 = 0;
		else if (i != 18) {
			if (i == 19)
				anInt7874 = class523_sub34.readUnsignedByte(-359020512) * -819518467;
			else if (i == 21)
				aByte7875 = (byte) 1;
			else if (i == 22)
				aBool7877 = true;
			else if (23 == i)
				anInt7873 = -54447949;
			else if (i == 24) {
				int i_121_ = class523_sub34.readBigSmart((byte) -8);
				if (i_121_ != -1)
					anIntArray7867 = new int[] { i_121_ };
			} else if (27 == i)
				anInt7852 = 557637137;
			else if (28 == i)
				anInt7907 = (class523_sub34.readUnsignedByte(407167332) << 2) * 174912875;
			else if (29 == i)
				anInt7885 = class523_sub34.readByte((short) -31069) * -320789035;
			else if (39 == i)
				anInt7886 = class523_sub34.readByte((short) -24149) * 919207765;
			else if (i >= 30 && i < 35)
				aStringArray7869[i - 30] = class523_sub34.readString(402370298).intern();
			else if (40 == i) {
				int i_122_ = class523_sub34.readUnsignedByte(-893333918);
				aShortArray7878 = new short[i_122_];
				aShortArray7929 = new short[i_122_];
				for (int i_123_ = 0; i_123_ < i_122_; i_123_++) {
					aShortArray7878[i_123_] = (short) class523_sub34.readUnsignedShort(-1993577715);
					aShortArray7929[i_123_] = (short) class523_sub34.readUnsignedShort(-1845407301);
				}
			} else if (i == 41) {
				int i_124_ = class523_sub34.readUnsignedByte(-744597548);
				aShortArray7863 = new short[i_124_];
				aShortArray7916 = new short[i_124_];
				for (int i_125_ = 0; i_125_ < i_124_; i_125_++) {
					aShortArray7863[i_125_] = (short) class523_sub34.readUnsignedShort(-1407010273);
					aShortArray7916[i_125_] = (short) class523_sub34.readUnsignedShort(-1316613533);
				}
			} else if (42 == i) {
				int i_126_ = class523_sub34.readUnsignedByte(-1249918651);
				aByteArray7909 = new byte[i_126_];
				for (int i_127_ = 0; i_127_ < i_126_; i_127_++)
					aByteArray7909[i_127_] = class523_sub34.readByte((short) -17944);
			} else if (i == 44) {
				int i_128_ = class523_sub34.readUnsignedShort(-764446955);
				int i_129_ = 0;
				for (int i_130_ = i_128_; i_130_ > 0; i_130_ >>= 1)
					i_129_++;
				aByteArray7861 = new byte[i_129_];
				byte i_131_ = 0;
				for (int i_132_ = 0; i_132_ < i_129_; i_132_++) {
					if ((i_128_ & 1 << i_132_) > 0) {
						aByteArray7861[i_132_] = i_131_;
						i_131_++;
					} else
						aByteArray7861[i_132_] = (byte) -1;
				}
			} else if (45 == i) {
				int i_133_ = class523_sub34.readUnsignedShort(-761025285);
				int i_134_ = 0;
				for (int i_135_ = i_133_; i_135_ > 0; i_135_ >>= 1)
					i_134_++;
				aByteArray7866 = new byte[i_134_];
				byte i_136_ = 0;
				for (int i_137_ = 0; i_137_ < i_134_; i_137_++) {
					if ((i_133_ & 1 << i_137_) > 0) {
						aByteArray7866[i_137_] = i_136_;
						i_136_++;
					} else
						aByteArray7866[i_137_] = (byte) -1;
				}
			} else if (62 == i)
				aBool7908 = true;
			else if (64 == i)
				aBool7895 = false;
			else if (65 == i)
				anInt7915 = class523_sub34.readUnsignedShort(-447415849) * 360938717;
			else if (66 == i)
				anInt7876 = class523_sub34.readUnsignedShort(-2064492296) * -1720323067;
			else if (67 == i)
				anInt7898 = class523_sub34.readUnsignedShort(-1241649676) * -1337423855;
			else if (69 == i)
				class523_sub34.readUnsignedByte(-200474708);
			else if (70 == i)
				anInt7884 = ((class523_sub34.readShort(444463759) << 2) * -2103814009);
			else if (i == 71)
				anInt7900 = ((class523_sub34.readShort(1297842855) << 2) * 939951527);
			else if (i == 72)
				anInt7901 = ((class523_sub34.readShort(-992062069) << 2) * 1615145143);
			else if (i == 73)
				aBool7905 = true;
			else if (i == 74)
				aBool7903 = true;
			else if (75 == i)
				anInt7862 = class523_sub34.readUnsignedByte(1257236817) * 757525315;
			else if (77 == i || 92 == i) {
				anInt7914 = class523_sub34.readUnsignedShort(-1703379497) * 665517547;
				if (65535 == anInt7914 * -1520549181)
					anInt7914 = -665517547;
				anInt7911 = class523_sub34.readUnsignedShort(-547760817) * 463355569;
				if (-612414895 * anInt7911 == 65535)
					anInt7911 = -463355569;
				int i_138_ = -1;
				if (92 == i)
					i_138_ = class523_sub34.readBigSmart((byte) -108);
				int i_139_ = class523_sub34.readUnsignedByte(-2041384662);
				anIntArray7912 = new int[i_139_ + 2];
				for (int i_140_ = 0; i_140_ <= i_139_; i_140_++)
					anIntArray7912[i_140_] = class523_sub34.readBigSmart((byte) -54);
				anIntArray7912[i_139_ + 1] = i_138_;
			} else if (i == 78) {
				anInt7899 = class523_sub34.readUnsignedShort(-660033127) * 1140254429;
				anInt7913 = class523_sub34.readUnsignedByte(-1898079029) * -444782429;
			} else if (79 == i) {
				anInt7896 = class523_sub34.readUnsignedShort(-1697557634) * 806316897;
				anInt7917 = class523_sub34.readUnsignedShort(-586610289) * 1003283367;
				anInt7913 = class523_sub34.readUnsignedByte(-2062792432) * -444782429;
				int i_141_ = class523_sub34.readUnsignedByte(-846315896);
				anIntArray7918 = new int[i_141_];
				for (int i_142_ = 0; i_142_ < i_141_; i_142_++)
					anIntArray7918[i_142_] = class523_sub34.readUnsignedShort(-330322570);
			} else if (i == 81) {
				aByte7875 = (byte) 2;
				anInt7904 = class523_sub34.readUnsignedByte(936954867) * -1598386432;
			} else if (82 == i)
				aBool7920 = true;
			else if (88 == i)
				aBool7921 = false;
			else if (89 == i)
				aBool7919 = false;
			else if (91 == i)
				aBool7922 = true;
			else if (93 == i) {
				aByte7875 = (byte) 3;
				anInt7904 = class523_sub34.readUnsignedShort(-452582052) * -1633633649;
			} else if (94 == i)
				aByte7875 = (byte) 4;
			else if (i == 95) {
				aByte7875 = (byte) 5;
				anInt7904 = class523_sub34.readShort(1049763900) * -1633633649;
			} else if (i == 97)
				aBool7891 = true;
			else if (98 == i)
				aBool7924 = true;
			else if (99 == i || 100 == i) {
				class523_sub34.readUnsignedByte(-1036691018);
				class523_sub34.readUnsignedShort(-1093756858);
			} else if (i == 101)
				anInt7892 = class523_sub34.readUnsignedByte(981102227) * 1555449389;
			else if (102 == i)
				anInt7890 = class523_sub34.readUnsignedShort(-792343763) * 708070921;
			else if (103 == i)
				anInt7873 = 0;
			else if (i == 104)
				anInt7889 = class523_sub34.readUnsignedByte(298691251) * -1886938889;
			else if (105 == i)
				aBool7893 = true;
			else if (i == 106) {
				int i_143_ = class523_sub34.readUnsignedByte(-399371488);
				int i_144_ = 0;
				anIntArray7867 = new int[i_143_];
				anIntArray7910 = new int[i_143_];
				for (int i_145_ = 0; i_145_ < i_143_; i_145_++) {
					anIntArray7867[i_145_] = class523_sub34.readBigSmart((byte) 0);
					i_144_ += anIntArray7910[i_145_] = class523_sub34.readUnsignedByte(830989528);
				}
				for (int i_146_ = 0; i_146_ < i_143_; i_146_++)
					anIntArray7910[i_146_] = 65535 * anIntArray7910[i_146_] / i_144_;
			} else if (107 == i)
				anInt7906 = class523_sub34.readUnsignedShort(-1609397590) * -597858793;
			else if (i >= 150 && i < 155) {
				aStringArray7869[i - 150] = class523_sub34.readString(282384445).intern();
				if (!aClass609_7855.aBool7994)
					aStringArray7869[i - 150] = null;
			} else if (i == 160) {
				int i_147_ = class523_sub34.readUnsignedByte(-1595356272);
				anIntArray7925 = new int[i_147_];
				for (int i_148_ = 0; i_148_ < i_147_; i_148_++)
					anIntArray7925[i_148_] = class523_sub34.readUnsignedShort(-471379234);
			} else if (162 == i) {
				aByte7875 = (byte) 3;
				anInt7904 = class523_sub34.readUnsignedInt((byte) -3) * -1633633649;
			} else if (i == 163) {
				aByte7897 = class523_sub34.readByte((short) -1020);
				aByte7868 = class523_sub34.readByte((short) -5823);
				aByte7887 = class523_sub34.readByte((short) -3087);
				aByte7870 = class523_sub34.readByte((short) -8150);
			} else if (i == 164)
				anInt7902 = class523_sub34.readShort(-1662209791) * 1975535853;
			else if (i == 165)
				anInt7894 = class523_sub34.readShort(-917190560) * -1510382315;
			else if (i == 166)
				anInt7860 = class523_sub34.readShort(1213679042) * -559183249;
			else if (i == 167)
				anInt7930 = class523_sub34.readUnsignedShort(-1796558680) * -123728821;
			else if (i != 168 && i != 169) {
				if (170 == i)
					anInt7879 = class523_sub34.readUnsignedSmart(368514876) * 951657801;
				else if (i == 171)
					anInt7880 = class523_sub34.readUnsignedSmart(368514876) * -834008189;
				else if (173 == i) {
					anInt7926 = class523_sub34.readUnsignedShort(-1627127575) * 2112581933;
					anInt7927 = class523_sub34.readUnsignedShort(-2029870276) * 829009735;
				} else if (177 == i)
					aBool7928 = true;
				else if (178 == i)
					anInt7858 = class523_sub34.readUnsignedByte(2135819596) * 66852735;
				else if (186 == i)
					aClass594_7865 = ((Class594) Class334.method5910(Class270.method4982(-743257270), class523_sub34.readUnsignedByte(1179185389), 1979739806));
				else if (i != 188) {
					if (189 == i)
						aBool7881 = true;
					else if (i >= 190 && i < 196) {
						if (anIntArray7888 == null) {
							anIntArray7888 = new int[6];
							Arrays.fill(anIntArray7888, -1);
						}
						anIntArray7888[i - 190] = class523_sub34.readUnsignedShort(-1111039595);
					} else if (i == 196)
						Class334.method5910(Class221.method4133(1693511241), class523_sub34.readUnsignedByte(-1980300589), 1956306395);
					else if (i == 197)
						Class334.method5910(Class385.method6450(-708040264), class523_sub34.readUnsignedByte(198139819), 979216808);
					else if (i != 198 && i != 199) {
						if (200 == i)
							aBool7883 = true;
						else if (i == 201) {
							aClass430_7931 = new Class430();
							aClass430_7931.aFloat4855 = (float) class523_sub34.method16487((byte) -126);
							aClass430_7931.aFloat4859 = (float) class523_sub34.method16487((byte) -14);
							aClass430_7931.aFloat4853 = (float) class523_sub34.method16487((byte) -102);
							aClass430_7931.aFloat4854 = (float) class523_sub34.method16487((byte) -54);
							aClass430_7931.aFloat4851 = (float) class523_sub34.method16487((byte) -97);
							aClass430_7931.aFloat4856 = (float) class523_sub34.method16487((byte) -81);
						} else if (249 == i) {
							int i_149_ = class523_sub34.readUnsignedByte(-223106402);
							if (null == aClass14_7923) {
								int i_150_ = Class628.method10313(i_149_, -1104060234);
								aClass14_7923 = new Class14(i_150_);
							}
							for (int i_151_ = 0; i_151_ < i_149_; i_151_++) {
								boolean bool = (class523_sub34.readUnsignedByte(991045867) == 1);
								int i_152_ = class523_sub34.read24BitInt(293792964);
								Class523 class523;
								if (bool)
									class523 = new Class523_Sub28(class523_sub34.readString(-625445888).intern());
								else
									class523 = new Class523_Sub24(class523_sub34.readUnsignedInt((byte) -6));
								aClass14_7923.method738(class523, (long) i_152_);
							}
						}
					}
				}
			}
		}
	}

	Class167 method9908(Class178 class178, int i, int i_153_, int i_154_, Class591 class591) {
		int i_155_ = 603908989 * anInt7885 + 64;
		int i_156_ = -566092303 * anInt7886 + 850;
		int i_157_ = i;
		boolean bool = (aBool7908 || (1923531495 * Class607.aClass607_7965.anInt7982 == i_153_ && i_154_ > 3));
		if (bool)
			i |= 0x10;
		if (i_154_ == 0) {
			if (128 != anInt7915 * -1424671883 || -24187593 * anInt7884 != 0)
				i |= 0x1;
			if (anInt7898 * -1503565583 != 128 || 0 != 1589785863 * anInt7901)
				i |= 0x4;
		} else
			i |= 0xd;
		if (-251086643 * anInt7876 != 128 || 1793184279 * anInt7900 != 0)
			i |= 0x2;
		if (aShortArray7878 != null)
			i |= 0x4000;
		if (null != aShortArray7863)
			i |= 0x8000;
		if (aByte7870 != 0)
			i |= 0x80000;
		Class167 class167 = null;
		if (aByteArray7857 != null) {
			int i_158_ = -1;
			for (int i_159_ = 0; i_159_ < aByteArray7857.length; i_159_++) {
				if (aByteArray7857[i_159_] == i_153_) {
					i_158_ = i_159_;
					break;
				}
			}
			if (i_158_ == -1)
				return null;
			int[] is = (null != class591 && class591.anIntArray7805 != null ? class591.anIntArray7805 : anIntArrayArray7882[i_158_]);
			int i_160_ = is.length;
			if (i_160_ > 0) {
				long l = (long) (-1144788131 * class178.anInt1922);
				for (int i_161_ = 0; i_161_ < i_160_; i_161_++)
					l = (long) is[i_161_] + l * 67783L;
				synchronized (aClass609_7855.aClass209_7997) {
					class167 = ((Class167) aClass609_7855.aClass209_7997.method3767(l));
				}
				if (class167 != null) {
					if (i_155_ != class167.method2722())
						i |= 0x1000;
					if (i_156_ != class167.method2723())
						i |= 0x2000;
				}
				if (null == class167 || class178.method3068(class167.method2683(), i) != 0) {
					int i_162_ = i | 0x1f01f;
					if (null != class167)
						i_162_ = class178.method3117(i_162_, class167.method2683());
					Class179 class179 = null;
					synchronized (aClass609_7855.aClass179Array7996) {
						for (int i_163_ = 0; i_163_ < i_160_; i_163_++) {
							byte[] is_164_ = aClass609_7855.method9995(is[i_163_], 2019975286);
							if (is_164_ == null) {
								Class167 class167_165_ = null;
								return class167_165_;
							}
							class179 = new Class179(is_164_);
							if (class179.anInt1952 < 13)
								class179.method3494(2);
							if (i_160_ > 1)
								aClass609_7855.aClass179Array7996[i_163_] = class179;
						}
						if (i_160_ > 1)
							class179 = new Class179((aClass609_7855.aClass179Array7996), i_160_);
					}
					class167 = class178.method3115(class179, i_162_, 649879523 * (aClass609_7855.anInt7995), i_155_, i_156_);
					synchronized (aClass609_7855.aClass209_7997) {
						aClass609_7855.aClass209_7997.method3770(class167, l);
					}
				}
			}
		}
		if (null == class167)
			return null;
		Class167 class167_166_ = class167.method2681((byte) 0, i, true);
		if (i_155_ != class167.method2722())
			class167_166_.method2827(i_155_);
		if (i_156_ != class167.method2723())
			class167_166_.method2721(i_156_);
		if (bool)
			class167_166_.method2690();
		if (Class607.aClass607_7968.anInt7982 * 1923531495 == i_153_ && i_154_ > 3) {
			class167_166_.method2755(2048);
			class167_166_.method2689(180, 0, -180);
		}
		i_154_ &= 0x3;
		if (1 == i_154_)
			class167_166_.method2755(4096);
		else if (i_154_ == 2)
			class167_166_.method2755(8192);
		else if (i_154_ == 3)
			class167_166_.method2755(12288);
		if (aShortArray7878 != null) {
			short[] is;
			if (null != class591 && null != class591.aShortArray7804)
				is = class591.aShortArray7804;
			else
				is = aShortArray7929;
			for (int i_167_ = 0; i_167_ < aShortArray7878.length; i_167_++) {
				if (null != aByteArray7909 && i_167_ < aByteArray7909.length)
					class167_166_.method2725(aShortArray7878[i_167_], (aShortArray7864[(aByteArray7909[i_167_] & 0xff)]));
				else
					class167_166_.method2725(aShortArray7878[i_167_], is[i_167_]);
			}
		}
		if (null != aShortArray7863) {
			short[] is;
			if (class591 != null && null != class591.aShortArray7807)
				is = class591.aShortArray7807;
			else
				is = aShortArray7916;
			for (int i_168_ = 0; i_168_ < aShortArray7863.length; i_168_++)
				class167_166_.method2826(aShortArray7863[i_168_], is[i_168_]);
		}
		if (aByte7870 != 0)
			class167_166_.method2839(aByte7897, aByte7868, aByte7887, aByte7870 & 0xff);
		if (anInt7915 * -1424671883 != 128 || 128 != anInt7876 * -251086643 || -1503565583 * anInt7898 != 128)
			class167_166_.method2691(-1424671883 * anInt7915, -251086643 * anInt7876, -1503565583 * anInt7898);
		if (0 != anInt7884 * -24187593 || 0 != 1793184279 * anInt7900 || 0 != 1589785863 * anInt7901)
			class167_166_.method2689(-24187593 * anInt7884, 1793184279 * anInt7900, 1589785863 * anInt7901);
		class167_166_.method2769(i_157_);
		return class167_166_;
	}

	public boolean method9909() {
		if (anIntArray7912 == null)
			return 547234165 * anInt7899 != -1 || anIntArray7918 != null;
		for (int i = 0; i < anIntArray7912.length; i++) {
			if (-1 != anIntArray7912[i]) {
				Class602 class602_169_ = (Class602) anInterface12_7856.getDefinition(anIntArray7912[i], (byte) -63);
				if (547234165 * class602_169_.anInt7899 != -1 || null != class602_169_.anIntArray7918)
					return true;
			}
		}
		return false;
	}

	void method9910() {
		if (anInt7874 * -344567467 == -1) {
			anInt7874 = 0;
			if (null != aByteArray7857 && 1 == aByteArray7857.length && (1923531495 * Class607.aClass607_7970.anInt7982 == aByteArray7857[0]))
				anInt7874 = -819518467;
			for (int i = 0; i < 5; i++) {
				if (aStringArray7869[i] != null) {
					anInt7874 = -819518467;
					break;
				}
			}
		}
		if (anInt7862 * 591624555 == -1)
			anInt7862 = (972673777 * anInt7852 != 0 ? 1 : 0) * 757525315;
		if (method9935((byte) 0) || aBool7924 || null != anIntArray7912)
			aBool7928 = true;
		if (anInt7874 * -344567467 <= 0 && aClass594_7865 != Class594.aClass594_7816) {
			/* empty */
		}
	}

	public final boolean method9911(int i) {
		if (null == anIntArrayArray7882)
			return true;
		boolean bool = true;
		for (int i_170_ = 0; i_170_ < aByteArray7857.length; i_170_++) {
			if (aByteArray7857[i_170_] == i) {
				for (int i_171_ = 0; i_171_ < anIntArrayArray7882[i_170_].length; i_171_++) {
					if (!aClass609_7855.method9996((anIntArrayArray7882[i_170_][i_171_]), (byte) 0))
						bool = false;
				}
			}
		}
		return bool;
	}

	public final boolean method9912(Class650 class650) {
		if (anIntArrayArray7882 == null)
			return true;
		boolean bool = true;
		for (int i = 0; i < anIntArrayArray7882.length; i++) {
			for (int i_172_ = 0; i_172_ < anIntArrayArray7882[i].length; i_172_++) {
				boolean bool_173_ = aClass609_7855.method9996(anIntArrayArray7882[i][i_172_], (byte) 0);
				bool &= bool_173_;
				if (!bool_173_)
					class650.anInt8380 = anIntArrayArray7882[i][i_172_] * -1938569789;
			}
		}
		return bool;
	}

	public final boolean method9913(Class650 class650) {
		if (anIntArrayArray7882 == null)
			return true;
		boolean bool = true;
		for (int i = 0; i < anIntArrayArray7882.length; i++) {
			for (int i_174_ = 0; i_174_ < anIntArrayArray7882[i].length; i_174_++) {
				boolean bool_175_ = aClass609_7855.method9996(anIntArrayArray7882[i][i_174_], (byte) 0);
				bool &= bool_175_;
				if (!bool_175_)
					class650.anInt8380 = anIntArrayArray7882[i][i_174_] * -1938569789;
			}
		}
		return bool;
	}

	public final boolean method9914(Class650 class650) {
		if (anIntArrayArray7882 == null)
			return true;
		boolean bool = true;
		for (int i = 0; i < anIntArrayArray7882.length; i++) {
			for (int i_176_ = 0; i_176_ < anIntArrayArray7882[i].length; i_176_++) {
				boolean bool_177_ = aClass609_7855.method9996(anIntArrayArray7882[i][i_176_], (byte) 0);
				bool &= bool_177_;
				if (!bool_177_)
					class650.anInt8380 = anIntArrayArray7882[i][i_176_] * -1938569789;
			}
		}
		return bool;
	}

	public boolean method9915() {
		return anIntArray7867 != null;
	}

	public final synchronized Class5 method9916(Class178 class178, int i, int i_178_, int i_179_, Class142 class142, Class142 class142_180_, int i_181_, int i_182_, int i_183_, boolean bool, Class591 class591) {
		if (Class523_Sub29.method16177(i_178_, -1155859671))
			i_178_ = 1923531495 * Class607.aClass607_7968.anInt7982;
		long l = (long) (i_179_ + ((-2005438859 * anInt7854 << 10) + (i_178_ << 3)));
		l |= (long) (-1144788131 * class178.anInt1922 << 29);
		if (null != class591)
			l |= class591.aLong7806 * -6335477633115279013L << 32;
		int i_184_ = i;
		if (aByte7875 == 3)
			i_184_ |= 0x7;
		else {
			if (aByte7875 != 0 || anInt7894 * -1856650691 != 0)
				i_184_ |= 0x2;
			if (0 != anInt7902 * 573920485)
				i_184_ |= 0x1;
			if (0 != anInt7860 * 821236879)
				i_184_ |= 0x4;
		}
		if (bool)
			i_184_ |= 0x40000;
		boolean bool_185_ = 0 != aByte7875 && (class142 != null || class142_180_ != null);
		boolean bool_186_ = (0 != anInt7902 * 573920485 || 0 != -1856650691 * anInt7894 || 821236879 * anInt7860 != 0);
		Class5 class5;
		synchronized (aClass609_7855.aClass209_7993) {
			class5 = (Class5) aClass609_7855.aClass209_7993.method3767(l);
		}
		Class167 class167 = (Class167) (class5 != null ? class5.anObject37 : null);
		Class523_Sub27_Sub4 class523_sub27_sub4 = null;
		if (class167 == null || class178.method3068(class167.method2683(), i_184_) != 0) {
			if (null != class167)
				i_184_ = class178.method3117(i_184_, class167.method2683());
			int i_187_ = i_184_;
			if (i_178_ == Class607.aClass607_7970.anInt7982 * 1923531495 && i_179_ > 3)
				i_187_ |= 0x5;
			class167 = method9895(class178, i_187_, i_178_, i_179_, class591, 2119290336);
			if (class167 == null)
				return null;
			if (i_178_ == 1923531495 * Class607.aClass607_7970.anInt7982 && i_179_ > 3)
				class167.method2685(2048);
			if (bool && !bool_185_ && !bool_186_)
				class523_sub27_sub4 = class167.method2710(null);
			class167.method2769(i_184_);
			class5 = new Class5(class167, class523_sub27_sub4);
			synchronized (aClass609_7855.aClass209_7993) {
				aClass609_7855.aClass209_7993.method3770(class5, l);
			}
		} else {
			class523_sub27_sub4 = (Class523_Sub27_Sub4) class5.anObject36;
			if (bool && null == class523_sub27_sub4 && !bool_185_ && !bool_186_)
				class523_sub27_sub4 = (Class523_Sub27_Sub4) (class5.anObject36 = class167.method2710(null));
		}
		if (bool_185_ || bool_186_) {
			class167 = class167.method2681((byte) 0, i_184_, true);
			if (bool_185_)
				class167.method2692(aByte7875, anInt7904 * 909976687, class142, class142_180_, i_181_, i_182_, i_183_);
			if (bool_186_)
				class167.method2689(anInt7902 * 573920485, -1856650691 * anInt7894, anInt7860 * 821236879);
			if (bool)
				class523_sub27_sub4 = class167.method2710(null);
			class167.method2769(i);
		} else
			class167 = class167.method2681((byte) 0, i, true);
		aClass609_7855.aClass5_7998.anObject37 = class167;
		aClass609_7855.aClass5_7998.anObject36 = class523_sub27_sub4;
		return aClass609_7855.aClass5_7998;
	}

	public final synchronized Class167 method9917(Class178 class178, int i, int i_188_, int i_189_, Class142 class142, Class142 class142_190_, int i_191_, int i_192_, int i_193_, Class707 class707, Class591 class591) {
		if (Class523_Sub29.method16177(i_188_, -1877421607))
			i_188_ = Class607.aClass607_7968.anInt7982 * 1923531495;
		long l = (long) ((i_188_ << 3) + (-2005438859 * anInt7854 << 10) + i_189_);
		int i_194_ = i;
		l |= (long) (class178.anInt1922 * -1144788131 << 29);
		if (class591 != null)
			l |= class591.aLong7806 * -6335477633115279013L << 32;
		if (null != class707)
			i |= class707.method14173(2067444223);
		if (aByte7875 == 3)
			i |= 0x7;
		else {
			if (0 != aByte7875 || 0 != anInt7894 * -1856650691)
				i |= 0x2;
			if (0 != 573920485 * anInt7902)
				i |= 0x1;
			if (0 != anInt7860 * 821236879)
				i |= 0x4;
		}
		if (1923531495 * Class607.aClass607_7970.anInt7982 == i_188_ && i_189_ > 3)
			i |= 0x5;
		Class167 class167;
		synchronized (aClass609_7855.aClass209_7991) {
			class167 = (Class167) aClass609_7855.aClass209_7991.method3767(l);
		}
		if (class167 == null || class178.method3068(class167.method2683(), i) != 0) {
			if (null != class167)
				i = class178.method3117(i, class167.method2683());
			class167 = method9895(class178, i, i_188_, i_189_, class591, 2107255585);
			if (null == class167)
				return null;
			synchronized (aClass609_7855.aClass209_7991) {
				aClass609_7855.aClass209_7991.method3770(class167, l);
			}
		}
		boolean bool = false;
		if (null != class707) {
			class167 = class167.method2681((byte) 1, i, true);
			bool = true;
			class707.method14229(class167, i_189_ & 0x3, 1679530434);
		}
		if (1923531495 * Class607.aClass607_7970.anInt7982 == i_188_ && i_189_ > 3) {
			if (!bool) {
				class167 = class167.method2681((byte) 3, i, true);
				bool = true;
			}
			class167.method2685(2048);
		}
		if (0 != aByte7875) {
			if (!bool) {
				class167 = class167.method2681((byte) 3, i, true);
				bool = true;
			}
			class167.method2692(aByte7875, 909976687 * anInt7904, class142, class142_190_, i_191_, i_192_, i_193_);
		}
		if (0 != 573920485 * anInt7902 || -1856650691 * anInt7894 != 0 || 0 != 821236879 * anInt7860) {
			if (!bool) {
				class167 = class167.method2681((byte) 3, i, true);
				bool = true;
			}
			class167.method2689(573920485 * anInt7902, -1856650691 * anInt7894, 821236879 * anInt7860);
		}
		if (bool)
			class167.method2769(i_194_);
		return class167;
	}

	Class167 method9918(Class178 class178, int i, int i_195_, int i_196_, Class591 class591) {
		int i_197_ = 603908989 * anInt7885 + 64;
		int i_198_ = -566092303 * anInt7886 + 850;
		int i_199_ = i;
		boolean bool = (aBool7908 || (1923531495 * Class607.aClass607_7965.anInt7982 == i_195_ && i_196_ > 3));
		if (bool)
			i |= 0x10;
		if (i_196_ == 0) {
			if (128 != anInt7915 * -1424671883 || -24187593 * anInt7884 != 0)
				i |= 0x1;
			if (anInt7898 * -1503565583 != 128 || 0 != 1589785863 * anInt7901)
				i |= 0x4;
		} else
			i |= 0xd;
		if (-251086643 * anInt7876 != 128 || 1793184279 * anInt7900 != 0)
			i |= 0x2;
		if (aShortArray7878 != null)
			i |= 0x4000;
		if (null != aShortArray7863)
			i |= 0x8000;
		if (aByte7870 != 0)
			i |= 0x80000;
		Class167 class167 = null;
		if (aByteArray7857 != null) {
			int i_200_ = -1;
			for (int i_201_ = 0; i_201_ < aByteArray7857.length; i_201_++) {
				if (aByteArray7857[i_201_] == i_195_) {
					i_200_ = i_201_;
					break;
				}
			}
			if (i_200_ == -1)
				return null;
			int[] is = (null != class591 && class591.anIntArray7805 != null ? class591.anIntArray7805 : anIntArrayArray7882[i_200_]);
			int i_202_ = is.length;
			if (i_202_ > 0) {
				long l = (long) (-1144788131 * class178.anInt1922);
				for (int i_203_ = 0; i_203_ < i_202_; i_203_++)
					l = (long) is[i_203_] + l * 67783L;
				synchronized (aClass609_7855.aClass209_7997) {
					class167 = ((Class167) aClass609_7855.aClass209_7997.method3767(l));
				}
				if (class167 != null) {
					if (i_197_ != class167.method2722())
						i |= 0x1000;
					if (i_198_ != class167.method2723())
						i |= 0x2000;
				}
				if (null == class167 || class178.method3068(class167.method2683(), i) != 0) {
					int i_204_ = i | 0x1f01f;
					if (null != class167)
						i_204_ = class178.method3117(i_204_, class167.method2683());
					Class179 class179 = null;
					synchronized (aClass609_7855.aClass179Array7996) {
						for (int i_205_ = 0; i_205_ < i_202_; i_205_++) {
							byte[] is_206_ = aClass609_7855.method9995(is[i_205_], 2073908236);
							if (is_206_ == null) {
								Class167 class167_207_ = null;
								return class167_207_;
							}
							class179 = new Class179(is_206_);
							if (class179.anInt1952 < 13)
								class179.method3494(2);
							if (i_202_ > 1)
								aClass609_7855.aClass179Array7996[i_205_] = class179;
						}
						if (i_202_ > 1)
							class179 = new Class179((aClass609_7855.aClass179Array7996), i_202_);
					}
					class167 = class178.method3115(class179, i_204_, 649879523 * (aClass609_7855.anInt7995), i_197_, i_198_);
					synchronized (aClass609_7855.aClass209_7997) {
						aClass609_7855.aClass209_7997.method3770(class167, l);
					}
				}
			}
		}
		if (null == class167)
			return null;
		Class167 class167_208_ = class167.method2681((byte) 0, i, true);
		if (i_197_ != class167.method2722())
			class167_208_.method2827(i_197_);
		if (i_198_ != class167.method2723())
			class167_208_.method2721(i_198_);
		if (bool)
			class167_208_.method2690();
		if (Class607.aClass607_7968.anInt7982 * 1923531495 == i_195_ && i_196_ > 3) {
			class167_208_.method2755(2048);
			class167_208_.method2689(180, 0, -180);
		}
		i_196_ &= 0x3;
		if (1 == i_196_)
			class167_208_.method2755(4096);
		else if (i_196_ == 2)
			class167_208_.method2755(8192);
		else if (i_196_ == 3)
			class167_208_.method2755(12288);
		if (aShortArray7878 != null) {
			short[] is;
			if (null != class591 && null != class591.aShortArray7804)
				is = class591.aShortArray7804;
			else
				is = aShortArray7929;
			for (int i_209_ = 0; i_209_ < aShortArray7878.length; i_209_++) {
				if (null != aByteArray7909 && i_209_ < aByteArray7909.length)
					class167_208_.method2725(aShortArray7878[i_209_], (aShortArray7864[(aByteArray7909[i_209_] & 0xff)]));
				else
					class167_208_.method2725(aShortArray7878[i_209_], is[i_209_]);
			}
		}
		if (null != aShortArray7863) {
			short[] is;
			if (class591 != null && null != class591.aShortArray7807)
				is = class591.aShortArray7807;
			else
				is = aShortArray7916;
			for (int i_210_ = 0; i_210_ < aShortArray7863.length; i_210_++)
				class167_208_.method2826(aShortArray7863[i_210_], is[i_210_]);
		}
		if (aByte7870 != 0)
			class167_208_.method2839(aByte7897, aByte7868, aByte7887, aByte7870 & 0xff);
		if (anInt7915 * -1424671883 != 128 || 128 != anInt7876 * -251086643 || -1503565583 * anInt7898 != 128)
			class167_208_.method2691(-1424671883 * anInt7915, -251086643 * anInt7876, -1503565583 * anInt7898);
		if (0 != anInt7884 * -24187593 || 0 != 1793184279 * anInt7900 || 0 != 1589785863 * anInt7901)
			class167_208_.method2689(-24187593 * anInt7884, 1793184279 * anInt7900, 1589785863 * anInt7901);
		class167_208_.method2769(i_199_);
		return class167_208_;
	}

	public boolean method9919(int i) {
		if (anIntArray7867 != null && i != -1) {
			for (int i_211_ = 0; i_211_ < anIntArray7867.length; i_211_++) {
				if (anIntArray7867[i_211_] == i)
					return true;
			}
		}
		return false;
	}

	public void readValues(RSBuffer class523_sub34, int i) {
		for (;;) {
			int i_212_ = class523_sub34.readUnsignedByte(-1192645330);
			if (0 == i_212_)
				break;
			method9896(class523_sub34, i_212_, 1042939431);
		}
	}

	public final Class602 method9920(Interface19 interface19, Interface17 interface17) {
		int i = -1;
		if (-1 != -1520549181 * anInt7914) {
			VarBitDefinitions class309 = interface19.method106(-1520549181 * anInt7914, -111907057);
			if (class309 != null)
				i = interface17.method93(class309, 165285363);
		} else if (-612414895 * anInt7911 != -1) {
			Class159 class159 = interface19.method110(VarDomainType.PLAYER_CONFIGS, -612414895 * anInt7911, 1488339852);
			if (class159 != null)
				i = interface17.method94(class159, 329588660);
		}
		if (i < 0 || i >= anIntArray7912.length - 1) {
			int i_213_ = anIntArray7912[anIntArray7912.length - 1];
			if (-1 != i_213_)
				return ((Class602) anInterface12_7856.getDefinition(i_213_, (byte) 81));
			return null;
		}
		if (anIntArray7912[i] == -1)
			return null;
		return ((Class602) anInterface12_7856.getDefinition(anIntArray7912[i], (byte) -16));
	}

	public int method9921(short i) {
		if (null != anIntArray7867) {
			if (anIntArray7867.length > 1) {
				int i_214_ = (int) (Math.random() * 65535.0);
				for (int i_215_ = 0; i_215_ < anIntArray7867.length; i_215_++) {
					if (i_214_ <= anIntArray7910[i_215_])
						return anIntArray7867[i_215_];
					i_214_ -= anIntArray7910[i_215_];
				}
			} else
				return anIntArray7867[0];
		}
		return -1;
	}

	public final synchronized Class5 method9922(Class178 class178, int i, int i_216_, int i_217_, Class142 class142, Class142 class142_218_, int i_219_, int i_220_, int i_221_, boolean bool, Class591 class591, int i_222_) {
		if (Class523_Sub29.method16177(i_216_, -1358210340))
			i_216_ = 1923531495 * Class607.aClass607_7968.anInt7982;
		long l = (long) (i_217_ + ((-2005438859 * anInt7854 << 10) + (i_216_ << 3)));
		l |= (long) (-1144788131 * class178.anInt1922 << 29);
		if (null != class591)
			l |= class591.aLong7806 * -6335477633115279013L << 32;
		int i_223_ = i;
		if (aByte7875 == 3)
			i_223_ |= 0x7;
		else {
			if (aByte7875 != 0 || anInt7894 * -1856650691 != 0)
				i_223_ |= 0x2;
			if (0 != anInt7902 * 573920485)
				i_223_ |= 0x1;
			if (0 != anInt7860 * 821236879)
				i_223_ |= 0x4;
		}
		if (bool)
			i_223_ |= 0x40000;
		boolean bool_224_ = 0 != aByte7875 && (class142 != null || class142_218_ != null);
		boolean bool_225_ = (0 != anInt7902 * 573920485 || 0 != -1856650691 * anInt7894 || 821236879 * anInt7860 != 0);
		Class5 class5;
		synchronized (aClass609_7855.aClass209_7993) {
			class5 = (Class5) aClass609_7855.aClass209_7993.method3767(l);
		}
		Class167 class167 = (Class167) (class5 != null ? class5.anObject37 : null);
		Class523_Sub27_Sub4 class523_sub27_sub4 = null;
		if (class167 == null || class178.method3068(class167.method2683(), i_223_) != 0) {
			if (null != class167)
				i_223_ = class178.method3117(i_223_, class167.method2683());
			int i_226_ = i_223_;
			if (i_216_ == Class607.aClass607_7970.anInt7982 * 1923531495 && i_217_ > 3)
				i_226_ |= 0x5;
			class167 = method9895(class178, i_226_, i_216_, i_217_, class591, 2049484378);
			if (class167 == null)
				return null;
			if (i_216_ == 1923531495 * Class607.aClass607_7970.anInt7982 && i_217_ > 3)
				class167.method2685(2048);
			if (bool && !bool_224_ && !bool_225_)
				class523_sub27_sub4 = class167.method2710(null);
			class167.method2769(i_223_);
			class5 = new Class5(class167, class523_sub27_sub4);
			synchronized (aClass609_7855.aClass209_7993) {
				aClass609_7855.aClass209_7993.method3770(class5, l);
			}
		} else {
			class523_sub27_sub4 = (Class523_Sub27_Sub4) class5.anObject36;
			if (bool && null == class523_sub27_sub4 && !bool_224_ && !bool_225_)
				class523_sub27_sub4 = (Class523_Sub27_Sub4) (class5.anObject36 = class167.method2710(null));
		}
		if (bool_224_ || bool_225_) {
			class167 = class167.method2681((byte) 0, i_223_, true);
			if (bool_224_)
				class167.method2692(aByte7875, anInt7904 * 909976687, class142, class142_218_, i_219_, i_220_, i_221_);
			if (bool_225_)
				class167.method2689(anInt7902 * 573920485, -1856650691 * anInt7894, anInt7860 * 821236879);
			if (bool)
				class523_sub27_sub4 = class167.method2710(null);
			class167.method2769(i);
		} else
			class167 = class167.method2681((byte) 0, i, true);
		aClass609_7855.aClass5_7998.anObject37 = class167;
		aClass609_7855.aClass5_7998.anObject36 = class523_sub27_sub4;
		return aClass609_7855.aClass5_7998;
	}

	public int method9923(int i, int i_227_) {
		if (aClass14_7923 == null)
			return i_227_;
		Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass14_7923.getFromIndex((long) i);
		if (null == class523_sub24)
			return i_227_;
		return -677457577 * class523_sub24.anInt10542;
	}

	public int method9924(int i) {
		if (anIntArray7888 == null)
			return -1;
		return anIntArray7888[i];
	}

	public String method9925(int i, String string) {
		if (null == aClass14_7923)
			return string;
		Class523_Sub28 class523_sub28 = (Class523_Sub28) aClass14_7923.getFromIndex((long) i);
		if (class523_sub28 == null)
			return string;
		return (String) class523_sub28.anObject10554;
	}

	public String method9926(int i, String string) {
		if (null == aClass14_7923)
			return string;
		Class523_Sub28 class523_sub28 = (Class523_Sub28) aClass14_7923.getFromIndex((long) i);
		if (class523_sub28 == null)
			return string;
		return (String) class523_sub28.anObject10554;
	}

	public boolean method9927() {
		return anIntArray7867 != null;
	}

	public boolean method9928() {
		return anIntArray7867 != null;
	}

	void method9929(RSBuffer class523_sub34, int i) {
		if (i == 1) {
			int i_228_ = class523_sub34.readUnsignedByte(-1061951615);
			aByteArray7857 = new byte[i_228_];
			anIntArrayArray7882 = new int[i_228_][];
			for (int i_229_ = 0; i_229_ < i_228_; i_229_++) {
				aByteArray7857[i_229_] = class523_sub34.readByte((short) -3621);
				int i_230_ = class523_sub34.readUnsignedByte(-2039360017);
				anIntArrayArray7882[i_229_] = new int[i_230_];
				for (int i_231_ = 0; i_231_ < i_230_; i_231_++)
					anIntArrayArray7882[i_229_][i_231_] = class523_sub34.readBigSmart((byte) -21);
			}
		} else if (i == 2)
			aString7859 = class523_sub34.readString(664746529).intern();
		else if (14 == i)
			anInt7871 = class523_sub34.readUnsignedByte(141671973) * 94492435;
		else if (15 == i)
			anInt7872 = class523_sub34.readUnsignedByte(-1765584014) * 1327769823;
		else if (17 == i)
			anInt7852 = 0;
		else if (i != 18) {
			if (i == 19)
				anInt7874 = class523_sub34.readUnsignedByte(1169755839) * -819518467;
			else if (i == 21)
				aByte7875 = (byte) 1;
			else if (i == 22)
				aBool7877 = true;
			else if (23 == i)
				anInt7873 = -54447949;
			else if (i == 24) {
				int i_232_ = class523_sub34.readBigSmart((byte) -48);
				if (i_232_ != -1)
					anIntArray7867 = new int[] { i_232_ };
			} else if (27 == i)
				anInt7852 = 557637137;
			else if (28 == i)
				anInt7907 = ((class523_sub34.readUnsignedByte(1737381871) << 2) * 174912875);
			else if (29 == i)
				anInt7885 = class523_sub34.readByte((short) -4632) * -320789035;
			else if (39 == i)
				anInt7886 = class523_sub34.readByte((short) -13098) * 919207765;
			else if (i >= 30 && i < 35)
				aStringArray7869[i - 30] = class523_sub34.readString(601374115).intern();
			else if (40 == i) {
				int i_233_ = class523_sub34.readUnsignedByte(517762331);
				aShortArray7878 = new short[i_233_];
				aShortArray7929 = new short[i_233_];
				for (int i_234_ = 0; i_234_ < i_233_; i_234_++) {
					aShortArray7878[i_234_] = (short) class523_sub34.readUnsignedShort(-1946520046);
					aShortArray7929[i_234_] = (short) class523_sub34.readUnsignedShort(-760010180);
				}
			} else if (i == 41) {
				int i_235_ = class523_sub34.readUnsignedByte(1891986871);
				aShortArray7863 = new short[i_235_];
				aShortArray7916 = new short[i_235_];
				for (int i_236_ = 0; i_236_ < i_235_; i_236_++) {
					aShortArray7863[i_236_] = (short) class523_sub34.readUnsignedShort(-297329040);
					aShortArray7916[i_236_] = (short) class523_sub34.readUnsignedShort(-163533372);
				}
			} else if (42 == i) {
				int i_237_ = class523_sub34.readUnsignedByte(-507794209);
				aByteArray7909 = new byte[i_237_];
				for (int i_238_ = 0; i_238_ < i_237_; i_238_++)
					aByteArray7909[i_238_] = class523_sub34.readByte((short) -2971);
			} else if (i == 44) {
				int i_239_ = class523_sub34.readUnsignedShort(-2140493693);
				int i_240_ = 0;
				for (int i_241_ = i_239_; i_241_ > 0; i_241_ >>= 1)
					i_240_++;
				aByteArray7861 = new byte[i_240_];
				byte i_242_ = 0;
				for (int i_243_ = 0; i_243_ < i_240_; i_243_++) {
					if ((i_239_ & 1 << i_243_) > 0) {
						aByteArray7861[i_243_] = i_242_;
						i_242_++;
					} else
						aByteArray7861[i_243_] = (byte) -1;
				}
			} else if (45 == i) {
				int i_244_ = class523_sub34.readUnsignedShort(-1867622117);
				int i_245_ = 0;
				for (int i_246_ = i_244_; i_246_ > 0; i_246_ >>= 1)
					i_245_++;
				aByteArray7866 = new byte[i_245_];
				byte i_247_ = 0;
				for (int i_248_ = 0; i_248_ < i_245_; i_248_++) {
					if ((i_244_ & 1 << i_248_) > 0) {
						aByteArray7866[i_248_] = i_247_;
						i_247_++;
					} else
						aByteArray7866[i_248_] = (byte) -1;
				}
			} else if (62 == i)
				aBool7908 = true;
			else if (64 == i)
				aBool7895 = false;
			else if (65 == i)
				anInt7915 = class523_sub34.readUnsignedShort(-1829751053) * 360938717;
			else if (66 == i)
				anInt7876 = class523_sub34.readUnsignedShort(-2040348456) * -1720323067;
			else if (67 == i)
				anInt7898 = class523_sub34.readUnsignedShort(-2050121807) * -1337423855;
			else if (69 == i)
				class523_sub34.readUnsignedByte(-1096224065);
			else if (70 == i)
				anInt7884 = ((class523_sub34.readShort(1862209726) << 2) * -2103814009);
			else if (i == 71)
				anInt7900 = ((class523_sub34.readShort(1730554784) << 2) * 939951527);
			else if (i == 72)
				anInt7901 = ((class523_sub34.readShort(938447776) << 2) * 1615145143);
			else if (i == 73)
				aBool7905 = true;
			else if (i == 74)
				aBool7903 = true;
			else if (75 == i)
				anInt7862 = class523_sub34.readUnsignedByte(474407522) * 757525315;
			else if (77 == i || 92 == i) {
				anInt7914 = class523_sub34.readUnsignedShort(-1565704144) * 665517547;
				if (65535 == anInt7914 * -1520549181)
					anInt7914 = -665517547;
				anInt7911 = class523_sub34.readUnsignedShort(-171301675) * 463355569;
				if (-612414895 * anInt7911 == 65535)
					anInt7911 = -463355569;
				int i_249_ = -1;
				if (92 == i)
					i_249_ = class523_sub34.readBigSmart((byte) -7);
				int i_250_ = class523_sub34.readUnsignedByte(730500590);
				anIntArray7912 = new int[i_250_ + 2];
				for (int i_251_ = 0; i_251_ <= i_250_; i_251_++)
					anIntArray7912[i_251_] = class523_sub34.readBigSmart((byte) -35);
				anIntArray7912[i_250_ + 1] = i_249_;
			} else if (i == 78) {
				anInt7899 = class523_sub34.readUnsignedShort(-1694994579) * 1140254429;
				anInt7913 = class523_sub34.readUnsignedByte(775856244) * -444782429;
			} else if (79 == i) {
				anInt7896 = class523_sub34.readUnsignedShort(-1332882682) * 806316897;
				anInt7917 = class523_sub34.readUnsignedShort(-1866384347) * 1003283367;
				anInt7913 = class523_sub34.readUnsignedByte(403745141) * -444782429;
				int i_252_ = class523_sub34.readUnsignedByte(-1649917130);
				anIntArray7918 = new int[i_252_];
				for (int i_253_ = 0; i_253_ < i_252_; i_253_++)
					anIntArray7918[i_253_] = class523_sub34.readUnsignedShort(-1406953190);
			} else if (i == 81) {
				aByte7875 = (byte) 2;
				anInt7904 = class523_sub34.readUnsignedByte(-405454316) * -1598386432;
			} else if (82 == i)
				aBool7920 = true;
			else if (88 == i)
				aBool7921 = false;
			else if (89 == i)
				aBool7919 = false;
			else if (91 == i)
				aBool7922 = true;
			else if (93 == i) {
				aByte7875 = (byte) 3;
				anInt7904 = class523_sub34.readUnsignedShort(-1823103606) * -1633633649;
			} else if (94 == i)
				aByte7875 = (byte) 4;
			else if (i == 95) {
				aByte7875 = (byte) 5;
				anInt7904 = class523_sub34.readShort(1153653403) * -1633633649;
			} else if (i == 97)
				aBool7891 = true;
			else if (98 == i)
				aBool7924 = true;
			else if (99 == i || 100 == i) {
				class523_sub34.readUnsignedByte(1711937504);
				class523_sub34.readUnsignedShort(-729109704);
			} else if (i == 101)
				anInt7892 = class523_sub34.readUnsignedByte(144726902) * 1555449389;
			else if (102 == i)
				anInt7890 = class523_sub34.readUnsignedShort(-2023749127) * 708070921;
			else if (103 == i)
				anInt7873 = 0;
			else if (i == 104)
				anInt7889 = class523_sub34.readUnsignedByte(368062879) * -1886938889;
			else if (105 == i)
				aBool7893 = true;
			else if (i == 106) {
				int i_254_ = class523_sub34.readUnsignedByte(1278437751);
				int i_255_ = 0;
				anIntArray7867 = new int[i_254_];
				anIntArray7910 = new int[i_254_];
				for (int i_256_ = 0; i_256_ < i_254_; i_256_++) {
					anIntArray7867[i_256_] = class523_sub34.readBigSmart((byte) -125);
					i_255_ += anIntArray7910[i_256_] = class523_sub34.readUnsignedByte(1400355671);
				}
				for (int i_257_ = 0; i_257_ < i_254_; i_257_++)
					anIntArray7910[i_257_] = 65535 * anIntArray7910[i_257_] / i_255_;
			} else if (107 == i)
				anInt7906 = class523_sub34.readUnsignedShort(-610179793) * -597858793;
			else if (i >= 150 && i < 155) {
				aStringArray7869[i - 150] = class523_sub34.readString(253061677).intern();
				if (!aClass609_7855.aBool7994)
					aStringArray7869[i - 150] = null;
			} else if (i == 160) {
				int i_258_ = class523_sub34.readUnsignedByte(-1533018501);
				anIntArray7925 = new int[i_258_];
				for (int i_259_ = 0; i_259_ < i_258_; i_259_++)
					anIntArray7925[i_259_] = class523_sub34.readUnsignedShort(-587064964);
			} else if (162 == i) {
				aByte7875 = (byte) 3;
				anInt7904 = class523_sub34.readUnsignedInt((byte) -51) * -1633633649;
			} else if (i == 163) {
				aByte7897 = class523_sub34.readByte((short) -5581);
				aByte7868 = class523_sub34.readByte((short) -17682);
				aByte7887 = class523_sub34.readByte((short) -2587);
				aByte7870 = class523_sub34.readByte((short) -17841);
			} else if (i == 164)
				anInt7902 = class523_sub34.readShort(1845605353) * 1975535853;
			else if (i == 165)
				anInt7894 = class523_sub34.readShort(-1293034031) * -1510382315;
			else if (i == 166)
				anInt7860 = class523_sub34.readShort(-1415750948) * -559183249;
			else if (i == 167)
				anInt7930 = class523_sub34.readUnsignedShort(-643669027) * -123728821;
			else if (i != 168 && i != 169) {
				if (170 == i)
					anInt7879 = class523_sub34.readUnsignedSmart(368514876) * 951657801;
				else if (i == 171)
					anInt7880 = class523_sub34.readUnsignedSmart(368514876) * -834008189;
				else if (173 == i) {
					anInt7926 = class523_sub34.readUnsignedShort(-136472324) * 2112581933;
					anInt7927 = class523_sub34.readUnsignedShort(-1372460755) * 829009735;
				} else if (177 == i)
					aBool7928 = true;
				else if (178 == i)
					anInt7858 = class523_sub34.readUnsignedByte(481007226) * 66852735;
				else if (186 == i)
					aClass594_7865 = ((Class594) Class334.method5910(Class270.method4982(-743257270), class523_sub34.readUnsignedByte(-159838538), 1194604553));
				else if (i != 188) {
					if (189 == i)
						aBool7881 = true;
					else if (i >= 190 && i < 196) {
						if (anIntArray7888 == null) {
							anIntArray7888 = new int[6];
							Arrays.fill(anIntArray7888, -1);
						}
						anIntArray7888[i - 190] = class523_sub34.readUnsignedShort(-81865646);
					} else if (i == 196)
						Class334.method5910(Class221.method4133(-1420348202), class523_sub34.readUnsignedByte(1750734553), 283312408);
					else if (i == 197)
						Class334.method5910(Class385.method6450(1305123668), class523_sub34.readUnsignedByte(399710344), -1162469116);
					else if (i != 198 && i != 199) {
						if (200 == i)
							aBool7883 = true;
						else if (i == 201) {
							aClass430_7931 = new Class430();
							aClass430_7931.aFloat4855 = (float) class523_sub34.method16487((byte) -85);
							aClass430_7931.aFloat4859 = (float) class523_sub34.method16487((byte) -111);
							aClass430_7931.aFloat4853 = (float) class523_sub34.method16487((byte) -116);
							aClass430_7931.aFloat4854 = (float) class523_sub34.method16487((byte) -100);
							aClass430_7931.aFloat4851 = (float) class523_sub34.method16487((byte) -124);
							aClass430_7931.aFloat4856 = (float) class523_sub34.method16487((byte) 15);
						} else if (249 == i) {
							int i_260_ = class523_sub34.readUnsignedByte(481864561);
							if (null == aClass14_7923) {
								int i_261_ = Class628.method10313(i_260_, -460593682);
								aClass14_7923 = new Class14(i_261_);
							}
							for (int i_262_ = 0; i_262_ < i_260_; i_262_++) {
								boolean bool = (class523_sub34.readUnsignedByte(-335773248) == 1);
								int i_263_ = class523_sub34.read24BitInt(-496511079);
								Class523 class523;
								if (bool)
									class523 = new Class523_Sub28(class523_sub34.readString(-1876763374).intern());
								else
									class523 = new Class523_Sub24(class523_sub34.readUnsignedInt((byte) -21));
								aClass14_7923.method738(class523, (long) i_263_);
							}
						}
					}
				}
			}
		}
	}

	public boolean method9930() {
		return anIntArray7867 != null && anIntArray7867.length > 1;
	}

	public boolean method9931() {
		return anIntArray7867 != null && anIntArray7867.length > 1;
	}

	public final synchronized Class5 method9932(Class178 class178, int i, int i_264_, int i_265_, Class142 class142, Class142 class142_266_, int i_267_, int i_268_, int i_269_, boolean bool, Class591 class591) {
		if (Class523_Sub29.method16177(i_264_, -1437088341))
			i_264_ = 1923531495 * Class607.aClass607_7968.anInt7982;
		long l = (long) (i_265_ + ((-2005438859 * anInt7854 << 10) + (i_264_ << 3)));
		l |= (long) (-1144788131 * class178.anInt1922 << 29);
		if (null != class591)
			l |= class591.aLong7806 * -6335477633115279013L << 32;
		int i_270_ = i;
		if (aByte7875 == 3)
			i_270_ |= 0x7;
		else {
			if (aByte7875 != 0 || anInt7894 * -1856650691 != 0)
				i_270_ |= 0x2;
			if (0 != anInt7902 * 573920485)
				i_270_ |= 0x1;
			if (0 != anInt7860 * 821236879)
				i_270_ |= 0x4;
		}
		if (bool)
			i_270_ |= 0x40000;
		boolean bool_271_ = 0 != aByte7875 && (class142 != null || class142_266_ != null);
		boolean bool_272_ = (0 != anInt7902 * 573920485 || 0 != -1856650691 * anInt7894 || 821236879 * anInt7860 != 0);
		Class5 class5;
		synchronized (aClass609_7855.aClass209_7993) {
			class5 = (Class5) aClass609_7855.aClass209_7993.method3767(l);
		}
		Class167 class167 = (Class167) (class5 != null ? class5.anObject37 : null);
		Class523_Sub27_Sub4 class523_sub27_sub4 = null;
		if (class167 == null || class178.method3068(class167.method2683(), i_270_) != 0) {
			if (null != class167)
				i_270_ = class178.method3117(i_270_, class167.method2683());
			int i_273_ = i_270_;
			if (i_264_ == Class607.aClass607_7970.anInt7982 * 1923531495 && i_265_ > 3)
				i_273_ |= 0x5;
			class167 = method9895(class178, i_273_, i_264_, i_265_, class591, 2042982655);
			if (class167 == null)
				return null;
			if (i_264_ == 1923531495 * Class607.aClass607_7970.anInt7982 && i_265_ > 3)
				class167.method2685(2048);
			if (bool && !bool_271_ && !bool_272_)
				class523_sub27_sub4 = class167.method2710(null);
			class167.method2769(i_270_);
			class5 = new Class5(class167, class523_sub27_sub4);
			synchronized (aClass609_7855.aClass209_7993) {
				aClass609_7855.aClass209_7993.method3770(class5, l);
			}
		} else {
			class523_sub27_sub4 = (Class523_Sub27_Sub4) class5.anObject36;
			if (bool && null == class523_sub27_sub4 && !bool_271_ && !bool_272_)
				class523_sub27_sub4 = (Class523_Sub27_Sub4) (class5.anObject36 = class167.method2710(null));
		}
		if (bool_271_ || bool_272_) {
			class167 = class167.method2681((byte) 0, i_270_, true);
			if (bool_271_)
				class167.method2692(aByte7875, anInt7904 * 909976687, class142, class142_266_, i_267_, i_268_, i_269_);
			if (bool_272_)
				class167.method2689(anInt7902 * 573920485, -1856650691 * anInt7894, anInt7860 * 821236879);
			if (bool)
				class523_sub27_sub4 = class167.method2710(null);
			class167.method2769(i);
		} else
			class167 = class167.method2681((byte) 0, i, true);
		aClass609_7855.aClass5_7998.anObject37 = class167;
		aClass609_7855.aClass5_7998.anObject36 = class523_sub27_sub4;
		return aClass609_7855.aClass5_7998;
	}

	public int method9933() {
		if (null != anIntArray7867) {
			if (anIntArray7867.length > 1) {
				int i = (int) (Math.random() * 65535.0);
				for (int i_274_ = 0; i_274_ < anIntArray7867.length; i_274_++) {
					if (i <= anIntArray7910[i_274_])
						return anIntArray7867[i_274_];
					i -= anIntArray7910[i_274_];
				}
			} else
				return anIntArray7867[0];
		}
		return -1;
	}

	Class167 method9934(Class178 class178, int i, int i_275_, int i_276_, Class591 class591) {
		int i_277_ = 603908989 * anInt7885 + 64;
		int i_278_ = -566092303 * anInt7886 + 850;
		int i_279_ = i;
		boolean bool = (aBool7908 || (1923531495 * Class607.aClass607_7965.anInt7982 == i_275_ && i_276_ > 3));
		if (bool)
			i |= 0x10;
		if (i_276_ == 0) {
			if (128 != anInt7915 * -1424671883 || -24187593 * anInt7884 != 0)
				i |= 0x1;
			if (anInt7898 * -1503565583 != 128 || 0 != 1589785863 * anInt7901)
				i |= 0x4;
		} else
			i |= 0xd;
		if (-251086643 * anInt7876 != 128 || 1793184279 * anInt7900 != 0)
			i |= 0x2;
		if (aShortArray7878 != null)
			i |= 0x4000;
		if (null != aShortArray7863)
			i |= 0x8000;
		if (aByte7870 != 0)
			i |= 0x80000;
		Class167 class167 = null;
		if (aByteArray7857 != null) {
			int i_280_ = -1;
			for (int i_281_ = 0; i_281_ < aByteArray7857.length; i_281_++) {
				if (aByteArray7857[i_281_] == i_275_) {
					i_280_ = i_281_;
					break;
				}
			}
			if (i_280_ == -1)
				return null;
			int[] is = (null != class591 && class591.anIntArray7805 != null ? class591.anIntArray7805 : anIntArrayArray7882[i_280_]);
			int i_282_ = is.length;
			if (i_282_ > 0) {
				long l = (long) (-1144788131 * class178.anInt1922);
				for (int i_283_ = 0; i_283_ < i_282_; i_283_++)
					l = (long) is[i_283_] + l * 67783L;
				synchronized (aClass609_7855.aClass209_7997) {
					class167 = ((Class167) aClass609_7855.aClass209_7997.method3767(l));
				}
				if (class167 != null) {
					if (i_277_ != class167.method2722())
						i |= 0x1000;
					if (i_278_ != class167.method2723())
						i |= 0x2000;
				}
				if (null == class167 || class178.method3068(class167.method2683(), i) != 0) {
					int i_284_ = i | 0x1f01f;
					if (null != class167)
						i_284_ = class178.method3117(i_284_, class167.method2683());
					Class179 class179 = null;
					synchronized (aClass609_7855.aClass179Array7996) {
						for (int i_285_ = 0; i_285_ < i_282_; i_285_++) {
							byte[] is_286_ = aClass609_7855.method9995(is[i_285_], 2128353967);
							if (is_286_ == null) {
								Class167 class167_287_ = null;
								return class167_287_;
							}
							class179 = new Class179(is_286_);
							if (class179.anInt1952 < 13)
								class179.method3494(2);
							if (i_282_ > 1)
								aClass609_7855.aClass179Array7996[i_285_] = class179;
						}
						if (i_282_ > 1)
							class179 = new Class179((aClass609_7855.aClass179Array7996), i_282_);
					}
					class167 = class178.method3115(class179, i_284_, 649879523 * (aClass609_7855.anInt7995), i_277_, i_278_);
					synchronized (aClass609_7855.aClass209_7997) {
						aClass609_7855.aClass209_7997.method3770(class167, l);
					}
				}
			}
		}
		if (null == class167)
			return null;
		Class167 class167_288_ = class167.method2681((byte) 0, i, true);
		if (i_277_ != class167.method2722())
			class167_288_.method2827(i_277_);
		if (i_278_ != class167.method2723())
			class167_288_.method2721(i_278_);
		if (bool)
			class167_288_.method2690();
		if (Class607.aClass607_7968.anInt7982 * 1923531495 == i_275_ && i_276_ > 3) {
			class167_288_.method2755(2048);
			class167_288_.method2689(180, 0, -180);
		}
		i_276_ &= 0x3;
		if (1 == i_276_)
			class167_288_.method2755(4096);
		else if (i_276_ == 2)
			class167_288_.method2755(8192);
		else if (i_276_ == 3)
			class167_288_.method2755(12288);
		if (aShortArray7878 != null) {
			short[] is;
			if (null != class591 && null != class591.aShortArray7804)
				is = class591.aShortArray7804;
			else
				is = aShortArray7929;
			for (int i_289_ = 0; i_289_ < aShortArray7878.length; i_289_++) {
				if (null != aByteArray7909 && i_289_ < aByteArray7909.length)
					class167_288_.method2725(aShortArray7878[i_289_], (aShortArray7864[(aByteArray7909[i_289_] & 0xff)]));
				else
					class167_288_.method2725(aShortArray7878[i_289_], is[i_289_]);
			}
		}
		if (null != aShortArray7863) {
			short[] is;
			if (class591 != null && null != class591.aShortArray7807)
				is = class591.aShortArray7807;
			else
				is = aShortArray7916;
			for (int i_290_ = 0; i_290_ < aShortArray7863.length; i_290_++)
				class167_288_.method2826(aShortArray7863[i_290_], is[i_290_]);
		}
		if (aByte7870 != 0)
			class167_288_.method2839(aByte7897, aByte7868, aByte7887, aByte7870 & 0xff);
		if (anInt7915 * -1424671883 != 128 || 128 != anInt7876 * -251086643 || -1503565583 * anInt7898 != 128)
			class167_288_.method2691(-1424671883 * anInt7915, -251086643 * anInt7876, -1503565583 * anInt7898);
		if (0 != anInt7884 * -24187593 || 0 != 1793184279 * anInt7900 || 0 != 1589785863 * anInt7901)
			class167_288_.method2689(-24187593 * anInt7884, 1793184279 * anInt7900, 1589785863 * anInt7901);
		class167_288_.method2769(i_279_);
		return class167_288_;
	}

	public boolean method9935(byte i) {
		return anIntArray7867 != null;
	}

	static final void method9936(InterfaceComponentDefinitions class250, Class242 class242, Class669 class669, short i) {
		int i_291_ = ((class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) - 1);
		if (i_291_ < 0 || i_291_ > 9)
			class669.anInt8560 -= 1235970069;
		else
			class250.method4485(i_291_, (String) (class669.anObjectArray8559[((class669.anInt8560 -= 1235970069) * 240723773)]), (short) 23651);
	}

	static final void method9937(Class669 class669, int i) {
		class669.anInt8558 -= 2121349901;
		int i_292_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_293_ = class669.anIntArray8557[1 + 1357652815 * class669.anInt8558];
		int i_294_ = class669.anIntArray8557[2 + class669.anInt8558 * 1357652815];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = client.aClass220_11301.method4107(i_292_, -2085527715).method4059(i_293_, i_294_, 2019624587) == null ? 0 : 1;
	}

	public static int method9938(long l) {
		Class17.method776(l);
		return Class91.aCalendar893.get(1);
	}

	static void method9939(Class669 class669, int i) {
		class669.anInt8560 -= -1823027158;
		String string = ((String) class669.anObjectArray8559[class669.anInt8560 * 240723773]);
		String string_295_ = ((String) class669.anObjectArray8559[1 + class669.anInt8560 * 240723773]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class39.method1127(string, string_295_, -1991898003);
	}

	public static void method9940(byte i) {
		InputStream_Sub1.method17232(true, (byte) 54);
	}
}
