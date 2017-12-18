/* Class167_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaclib.memory.Stream;

import jaggl.OpenGL;

public class Class167_Sub3 extends Class167 {
	int anInt9443;
	static final int anInt9444 = 7;
	static long[] aLongArray9445;
	static final int anInt9446 = 2;
	static final int anInt9447 = 4;
	static final int anInt9448 = 8;
	Class184[] aClass184Array9449;
	short[] aShortArray9450;
	int anInt9451;
	static final int anInt9452 = 1;
	float[] aFloatArray9453;
	byte aByte9454;
	short aShort9455;
	boolean aBool9456 = false;
	Class131 aClass131_9457;
	int anInt9458;
	int anInt9459;
	int[] anIntArray9460;
	int[] anIntArray9461;
	static final int anInt9462 = 16;
	int[][] anIntArrayArray9463;
	short[] aShortArray9464;
	boolean aBool9465;
	short[] aShortArray9466;
	short[] aShortArray9467;
	short[] aShortArray9468;
	boolean aBool9469 = false;
	Class151 aClass151_9470;
	short aShort9471;
	float[] aFloatArray9472;
	short[] aShortArray9473;
	int anInt9474;
	int[][] anIntArrayArray9475;
	byte[] aByteArray9476;
	Interface15 anInterface15_9477;
	short[] aShortArray9478;
	Class133[] aClass133Array9479;
	int[][] anIntArrayArray9480;
	Class131 aClass131_9481;
	short[] aShortArray9482;
	static int[] anIntArray9483;
	Class131 aClass131_9484;
	Class131 aClass131_9485;
	Class178_Sub1 aClass178_Sub1_9486;
	byte[] aByteArray9487;
	Interface18 anInterface18_9488;
	short[] aShortArray9489;
	boolean aBool9490;
	short aShort9491;
	int anInt9492;
	short[] aShortArray9493;
	short aShort9494;
	short aShort9495;
	int[] anIntArray9496;
	short aShort9497;
	short aShort9498;
	int anInt9499 = 0;
	boolean aBool9500;
	short aShort9501;
	int[] anIntArray9502;
	int[] anIntArray9503;
	short[] aShortArray9504;
	short aShort9505;
	Class143[] aClass143Array9506;
	int anInt9507;
	Class161[] aClass161Array9508;
	Class119 aClass119_9509;
	static final int anInt9510 = 4;
	int anInt9511;
	static float[] aFloatArray9512 = new float[2];
	static int[] anIntArray9513 = new int[8];
	static int[] anIntArray9514 = new int[8];
	int anInt9515;
	static int anInt9516;
	static int anInt9517;
	static int anInt9518;
	static boolean aBool9519;

	void method2765() {
		/* empty */
	}

	Class167_Sub3(Class178_Sub1 class178_sub1, Class179 class179, int i, int i_0_, int i_1_, int i_2_) {
		anInt9459 = 0;
		anInt9511 = 0;
		anInt9515 = 0;
		anInt9474 = 0;
		aBool9490 = true;
		aBool9465 = false;
		aBool9500 = false;
		aClass178_Sub1_9486 = class178_sub1;
		anInt9451 = i;
		anInt9458 = i_2_;
		if (Class127.method2156(i, i_2_))
			aClass131_9481 = new Class131(null, 5126, 3, 0);
		if (Class127.method2189(i, i_2_))
			aClass131_9457 = new Class131(null, 5126, 2, 0);
		if (Class127.method2157(i, i_2_))
			aClass131_9485 = new Class131(null, 5126, 3, 0);
		if (Class127.method2159(i, i_2_))
			aClass131_9484 = new Class131(null, 5121, 4, 0);
		if (Class127.method2158(i, i_2_))
			aClass119_9509 = new Class119();
		Class172 class172 = class178_sub1.aClass172_1916;
		Interface46 interface46 = class178_sub1.anInterface46_1925;
		int[] is = new int[class179.anInt1964];
		anIntArray9503 = new int[class179.anInt1991 + 1];
		for (int i_3_ = 0; i_3_ < class179.anInt1964; i_3_++) {
			if (class179.aByteArray1971 == null || class179.aByteArray1971[i_3_] != 2) {
				if (class179.aShortArray1959 != null && class179.aShortArray1959[i_3_] != -1) {
					Class177 class177 = class172.method2895((class179.aShortArray1959[i_3_] & 0xffff), -837482416);
					if (((anInt9458 & 0x40) == 0 || !class177.aBool1876) && class177.aBool1909)
						continue;
				}
				is[anInt9515++] = i_3_;
				anIntArray9503[class179.aShortArray1949[i_3_]]++;
				anIntArray9503[class179.aShortArray1966[i_3_]]++;
				anIntArray9503[class179.aShortArray1967[i_3_]]++;
			}
		}
		anInt9474 = anInt9515;
		long[] ls = new long[anInt9515];
		boolean bool = (anInt9451 & 0x100) != 0;
		for (int i_4_ = 0; i_4_ < anInt9515; i_4_++) {
			int i_5_ = is[i_4_];
			Class177 class177 = null;
			int i_6_ = 0;
			int i_7_ = 0;
			int i_8_ = 0;
			int i_9_ = 0;
			if (class179.aClass176Array1997 != null) {
				boolean bool_10_ = false;
				for (int i_11_ = 0; i_11_ < class179.aClass176Array1997.length; i_11_++) {
					Class176 class176 = class179.aClass176Array1997[i_11_];
					if (i_5_ == class176.anInt1858 * -421198465) {
						Class386 class386 = interface46.method344((class176.anInt1861 * 837482349), (byte) -85);
						if (class386.aBool4006)
							bool_10_ = true;
						if (class386.anInt4000 * -1163385649 != -1) {
							Class177 class177_12_ = class172.method2895((class386.anInt4000 * -1163385649), -898081895);
							if (class177_12_.aClass593_1884 == Class593.aClass593_7811)
								aBool9456 = true;
						}
					}
				}
				if (bool_10_) {
					ls[i_4_] = 9223372036854775807L;
					anInt9474--;
					continue;
				}
			}
			if (class179.aClass184Array1995 != null) {
				boolean bool_13_ = false;
				for (int i_14_ = 0; i_14_ < class179.aClass184Array1995.length; i_14_++) {
					Class184 class184 = class179.aClass184Array1995[i_14_];
					if (i_5_ == class184.anInt2123 * 914118525) {
						Class400 class400 = (aClass178_Sub1_9486.anInterface48_1926.method348(class184.anInt2112 * -1864996007, 2003145818));
						if (class400.aBool4119)
							bool_13_ = true;
					}
				}
				if (bool_13_) {
					ls[i_4_] = 9223372036854775807L;
					anInt9474--;
					continue;
				}
			}
			int i_15_ = -1;
			if (class179.aShortArray1959 != null) {
				i_15_ = class179.aShortArray1959[i_5_];
				if (i_15_ != -1) {
					class177 = class172.method2895(i_15_ & 0xffff, -1693773986);
					if ((anInt9458 & 0x40) == 0 || !class177.aBool1876) {
						i_8_ = class177.aByte1905;
						i_9_ = class177.aByte1906;
						if (class177.aByte1885 != 0 || class177.aByte1886 != 0)
							aBool9469 = true;
					} else {
						i_15_ = -1;
						class177 = null;
					}
				}
			}
			boolean bool_16_ = ((class179.aByteArray1975 != null && class179.aByteArray1975[i_5_] != 0) || (class177 != null && class177.aClass593_1884 != Class593.aClass593_7813));
			if ((bool || bool_16_) && class179.aByteArray1972 != null)
				i_6_ += class179.aByteArray1972[i_5_] << 17;
			if (bool_16_)
				i_6_ += 65536;
			i_6_ += (i_8_ & 0xff) << 8;
			i_6_ += i_9_ & 0xff;
			i_7_ += (i_15_ & 0xffff) << 16;
			i_7_ += i_4_ & 0xffff;
			ls[i_4_] = ((long) i_6_ << 32) + (long) i_7_;
			aBool9456 |= bool_16_;
			Class167_Sub3 class167_sub3_17_ = this;
			class167_sub3_17_.aBool9469 = (class167_sub3_17_.aBool9469 | (class177 != null && (class177.aByte1885 != 0 || class177.aByte1886 != 0)));
		}
		Class528.method8734(ls, is, -1515977151);
		anInt9499 = class179.anInt1953;
		anInt9459 = class179.anInt1991;
		anIntArray9460 = class179.anIntArray1981;
		anIntArray9461 = class179.anIntArray1973;
		anIntArray9496 = class179.anIntArray1957;
		aShortArray9466 = class179.aShortArray1965;
		Class139[] class139s = new Class139[anInt9459];
		aClass184Array9449 = class179.aClass184Array1995;
		aClass143Array9506 = class179.aClass143Array1996;
		if (class179.aClass176Array1997 != null) {
			anInt9507 = class179.aClass176Array1997.length;
			aClass161Array9508 = new Class161[anInt9507];
			aClass133Array9479 = new Class133[anInt9507];
			for (int i_18_ = 0; i_18_ < anInt9507; i_18_++) {
				Class176 class176 = class179.aClass176Array1997[i_18_];
				Class386 class386 = interface46.method344(class176.anInt1861 * 837482349, (byte) -29);
				int i_19_ = -1;
				for (int i_20_ = 0; i_20_ < anInt9515; i_20_++) {
					if (is[i_20_] == class176.anInt1858 * -421198465) {
						i_19_ = i_20_;
						break;
					}
				}
				if (i_19_ == -1)
					throw new RuntimeException();
				int i_21_ = ((Class710.anIntArray8839[(class179.aShortArray1974[class176.anInt1858 * -421198465]) & 0xffff]) & 0xffffff);
				i_21_ = i_21_ | 255 - (class179.aByteArray1975 != null ? (class179.aByteArray1975[class176.anInt1858 * -421198465]) : 0) << 24;
				aClass161Array9508[i_18_] = new Class161(i_19_, (class179.aShortArray1949[class176.anInt1858 * -421198465]), (class179.aShortArray1966[class176.anInt1858 * -421198465]), (class179.aShortArray1967[class176.anInt1858 * -421198465]), class386.anInt4004 * 2141519961, class386.anInt3999 * 1591166335, class386.anInt4000 * -1163385649, class386.anInt4005 * 1353343391, class386.anInt4003 * -56714871, class386.aBool4006, class386.aBool4001, class176.anInt1860 * 1648924969);
				aClass133Array9479[i_18_] = new Class133(i_21_);
			}
		}
		int i_22_ = anInt9515 * 3;
		aShortArray9493 = new short[i_22_];
		aShortArray9467 = new short[i_22_];
		aShortArray9468 = new short[i_22_];
		aByteArray9487 = new byte[i_22_];
		aFloatArray9453 = new float[i_22_];
		aFloatArray9472 = new float[i_22_];
		aShortArray9489 = new short[anInt9515];
		aByteArray9476 = new byte[anInt9515];
		aShortArray9450 = new short[anInt9515];
		aShortArray9478 = new short[anInt9515];
		aShortArray9464 = new short[anInt9515];
		aShortArray9473 = new short[anInt9515];
		if (class179.aShortArray1979 != null)
			aShortArray9482 = new short[anInt9515];
		aShort9495 = (short) i_0_;
		aShort9455 = (short) i_1_;
		aShortArray9504 = new short[i_22_];
		aLongArray9445 = new long[i_22_];
		int i_23_ = 0;
		for (int i_24_ = 0; i_24_ < class179.anInt1991; i_24_++) {
			int i_25_ = anIntArray9503[i_24_];
			anIntArray9503[i_24_] = i_23_;
			i_23_ += i_25_;
			class139s[i_24_] = new Class139();
		}
		anIntArray9503[class179.anInt1991] = i_23_;
		Class183 class183 = method2679(class179, is, anInt9515);
		Class138[] class138s = new Class138[class179.anInt1964];
		for (int i_26_ = 0; i_26_ < class179.anInt1964; i_26_++) {
			short i_27_ = class179.aShortArray1949[i_26_];
			short i_28_ = class179.aShortArray1966[i_26_];
			short i_29_ = class179.aShortArray1967[i_26_];
			int i_30_ = anIntArray9460[i_28_] - anIntArray9460[i_27_];
			int i_31_ = anIntArray9461[i_28_] - anIntArray9461[i_27_];
			int i_32_ = anIntArray9496[i_28_] - anIntArray9496[i_27_];
			int i_33_ = anIntArray9460[i_29_] - anIntArray9460[i_27_];
			int i_34_ = anIntArray9461[i_29_] - anIntArray9461[i_27_];
			int i_35_ = anIntArray9496[i_29_] - anIntArray9496[i_27_];
			int i_36_ = i_31_ * i_35_ - i_34_ * i_32_;
			int i_37_ = i_32_ * i_33_ - i_35_ * i_30_;
			int i_38_;
			for (i_38_ = i_30_ * i_34_ - i_33_ * i_31_; (i_36_ > 8192 || i_37_ > 8192 || i_38_ > 8192 || i_36_ < -8192 || i_37_ < -8192 || i_38_ < -8192); i_38_ >>= 1) {
				i_36_ >>= 1;
				i_37_ >>= 1;
			}
			int i_39_ = (int) Math.sqrt((double) (i_36_ * i_36_ + i_37_ * i_37_ + i_38_ * i_38_));
			if (i_39_ <= 0)
				i_39_ = 1;
			i_36_ = i_36_ * 256 / i_39_;
			i_37_ = i_37_ * 256 / i_39_;
			i_38_ = i_38_ * 256 / i_39_;
			byte i_40_ = (class179.aByteArray1971 == null ? (byte) 0 : class179.aByteArray1971[i_26_]);
			if (i_40_ == 0) {
				Class139 class139 = class139s[i_27_];
				class139.anInt1655 += i_36_;
				class139.anInt1653 += i_37_;
				class139.anInt1654 += i_38_;
				class139.anInt1652++;
				class139 = class139s[i_28_];
				class139.anInt1655 += i_36_;
				class139.anInt1653 += i_37_;
				class139.anInt1654 += i_38_;
				class139.anInt1652++;
				class139 = class139s[i_29_];
				class139.anInt1655 += i_36_;
				class139.anInt1653 += i_37_;
				class139.anInt1654 += i_38_;
				class139.anInt1652++;
			} else if (i_40_ == 1) {
				Class138 class138 = class138s[i_26_] = new Class138();
				class138.anInt1650 = i_36_;
				class138.anInt1649 = i_37_;
				class138.anInt1651 = i_38_;
			}
		}
		for (int i_41_ = 0; i_41_ < anInt9515; i_41_++) {
			int i_42_ = is[i_41_];
			int i_43_ = class179.aShortArray1974[i_42_] & 0xffff;
			int i_44_ = (class179.aByteArray1975 != null ? class179.aByteArray1975[i_42_] & 0xff : 0);
			short i_45_ = (class179.aShortArray1959 == null ? (short) -1 : class179.aShortArray1959[i_42_]);
			if (i_45_ != -1 && (anInt9458 & 0x40) != 0 && class172.method2895(i_45_, -1145249966).aBool1876)
				i_45_ = (short) -1;
			float f = 0.0F;
			float f_46_ = 0.0F;
			float f_47_ = 0.0F;
			float f_48_ = 0.0F;
			float f_49_ = 0.0F;
			float f_50_ = 0.0F;
			long l;
			long l_51_;
			long l_52_;
			if (i_45_ != -1) {
				int i_53_ = (class179.aShortArray1989 != null ? class179.aShortArray1989[i_42_] : -1);
				if (i_53_ == 32766) {
					int i_54_ = class179.aByteArray1968[i_42_] & 0xff;
					int i_55_ = class179.aByteArray1969[i_42_] & 0xff;
					int i_56_ = class179.aByteArray1990[i_42_] & 0xff;
					i_54_ += (class179.anIntArray1958[class179.aShortArray1949[i_42_]]);
					l_52_ = (long) i_54_;
					i_55_ += (class179.anIntArray1958[class179.aShortArray1966[i_42_]]);
					l_51_ = (long) i_54_;
					i_56_ += (class179.anIntArray1958[class179.aShortArray1967[i_42_]]);
					l = (long) i_54_;
					f = class179.aFloatArray1962[i_54_];
					f_46_ = class179.aFloatArray1963[i_54_];
					f_47_ = class179.aFloatArray1962[i_55_];
					f_48_ = class179.aFloatArray1963[i_55_];
					f_49_ = class179.aFloatArray1962[i_56_];
					f_50_ = class179.aFloatArray1963[i_56_];
				} else if (i_53_ == -1) {
					f = 0.0F;
					f_46_ = 1.0F;
					l_52_ = 65535L;
					f_47_ = 1.0F;
					f_48_ = 1.0F;
					l_51_ = 131071L;
					f_49_ = 0.0F;
					f_50_ = 0.0F;
					l = 196607L;
				} else {
					i_53_ &= 0xffff;
					int i_57_ = 0;
					int i_58_ = 0;
					int i_59_ = 0;
					byte i_60_ = class179.aByteArray1983[i_53_];
					if (i_60_ == 0) {
						short i_61_ = class179.aShortArray1949[i_42_];
						short i_62_ = class179.aShortArray1966[i_42_];
						short i_63_ = class179.aShortArray1967[i_42_];
						short i_64_ = class179.aShortArray1977[i_53_];
						short i_65_ = class179.aShortArray1985[i_53_];
						short i_66_ = class179.aShortArray1986[i_53_];
						float f_67_ = (float) class179.anIntArray1981[i_64_];
						float f_68_ = (float) class179.anIntArray1973[i_64_];
						float f_69_ = (float) class179.anIntArray1957[i_64_];
						float f_70_ = (float) class179.anIntArray1981[i_65_] - f_67_;
						float f_71_ = (float) class179.anIntArray1973[i_65_] - f_68_;
						float f_72_ = (float) class179.anIntArray1957[i_65_] - f_69_;
						float f_73_ = (float) class179.anIntArray1981[i_66_] - f_67_;
						float f_74_ = (float) class179.anIntArray1973[i_66_] - f_68_;
						float f_75_ = (float) class179.anIntArray1957[i_66_] - f_69_;
						float f_76_ = (float) class179.anIntArray1981[i_61_] - f_67_;
						float f_77_ = (float) class179.anIntArray1973[i_61_] - f_68_;
						float f_78_ = (float) class179.anIntArray1957[i_61_] - f_69_;
						float f_79_ = (float) class179.anIntArray1981[i_62_] - f_67_;
						float f_80_ = (float) class179.anIntArray1973[i_62_] - f_68_;
						float f_81_ = (float) class179.anIntArray1957[i_62_] - f_69_;
						float f_82_ = (float) class179.anIntArray1981[i_63_] - f_67_;
						float f_83_ = (float) class179.anIntArray1973[i_63_] - f_68_;
						float f_84_ = (float) class179.anIntArray1957[i_63_] - f_69_;
						float f_85_ = f_71_ * f_75_ - f_72_ * f_74_;
						float f_86_ = f_72_ * f_73_ - f_70_ * f_75_;
						float f_87_ = f_70_ * f_74_ - f_71_ * f_73_;
						float f_88_ = f_74_ * f_87_ - f_75_ * f_86_;
						float f_89_ = f_75_ * f_85_ - f_73_ * f_87_;
						float f_90_ = f_73_ * f_86_ - f_74_ * f_85_;
						float f_91_ = 1.0F / (f_88_ * f_70_ + f_89_ * f_71_ + f_90_ * f_72_);
						f = ((f_88_ * f_76_ + f_89_ * f_77_ + f_90_ * f_78_) * f_91_);
						f_47_ = (f_88_ * f_79_ + f_89_ * f_80_ + f_90_ * f_81_) * f_91_;
						f_49_ = (f_88_ * f_82_ + f_89_ * f_83_ + f_90_ * f_84_) * f_91_;
						f_88_ = f_71_ * f_87_ - f_72_ * f_86_;
						f_89_ = f_72_ * f_85_ - f_70_ * f_87_;
						f_90_ = f_70_ * f_86_ - f_71_ * f_85_;
						f_91_ = 1.0F / (f_88_ * f_73_ + f_89_ * f_74_ + f_90_ * f_75_);
						f_46_ = (f_88_ * f_76_ + f_89_ * f_77_ + f_90_ * f_78_) * f_91_;
						f_48_ = (f_88_ * f_79_ + f_89_ * f_80_ + f_90_ * f_81_) * f_91_;
						f_50_ = (f_88_ * f_82_ + f_89_ * f_83_ + f_90_ * f_84_) * f_91_;
					} else {
						short i_92_ = class179.aShortArray1949[i_42_];
						short i_93_ = class179.aShortArray1966[i_42_];
						short i_94_ = class179.aShortArray1967[i_42_];
						int i_95_ = class183.anIntArray2106[i_53_];
						int i_96_ = class183.anIntArray2107[i_53_];
						int i_97_ = class183.anIntArray2108[i_53_];
						float[] fs = class183.aFloatArrayArray2109[i_53_];
						byte i_98_ = class179.aByteArray1994[i_53_];
						float f_99_ = (float) class179.anIntArray1960[i_53_] / 256.0F;
						if (i_60_ == 1) {
							float f_100_ = ((float) class179.anIntArray1955[i_53_] / 1024.0F);
							method2841(class179.anIntArray1981[i_92_], class179.anIntArray1973[i_92_], class179.anIntArray1957[i_92_], i_95_, i_96_, i_97_, fs, f_100_, i_98_, f_99_, aFloatArray9512);
							f = aFloatArray9512[0];
							f_46_ = aFloatArray9512[1];
							method2841(class179.anIntArray1981[i_93_], class179.anIntArray1973[i_93_], class179.anIntArray1957[i_93_], i_95_, i_96_, i_97_, fs, f_100_, i_98_, f_99_, aFloatArray9512);
							f_47_ = aFloatArray9512[0];
							f_48_ = aFloatArray9512[1];
							method2841(class179.anIntArray1981[i_94_], class179.anIntArray1973[i_94_], class179.anIntArray1957[i_94_], i_95_, i_96_, i_97_, fs, f_100_, i_98_, f_99_, aFloatArray9512);
							f_49_ = aFloatArray9512[0];
							f_50_ = aFloatArray9512[1];
							float f_101_ = f_100_ / 2.0F;
							if ((i_98_ & 0x1) == 0) {
								if (f_47_ - f > f_101_) {
									f_47_ -= f_100_;
									i_58_ = 1;
								} else if (f - f_47_ > f_101_) {
									f_47_ += f_100_;
									i_58_ = 2;
								}
								if (f_49_ - f > f_101_) {
									f_49_ -= f_100_;
									i_59_ = 1;
								} else if (f - f_49_ > f_101_) {
									f_49_ += f_100_;
									i_59_ = 2;
								}
							} else {
								if (f_48_ - f_46_ > f_101_) {
									f_48_ -= f_100_;
									i_58_ = 1;
								} else if (f_46_ - f_48_ > f_101_) {
									f_48_ += f_100_;
									i_58_ = 2;
								}
								if (f_50_ - f_46_ > f_101_) {
									f_50_ -= f_100_;
									i_59_ = 1;
								} else if (f_46_ - f_50_ > f_101_) {
									f_50_ += f_100_;
									i_59_ = 2;
								}
							}
						} else if (i_60_ == 2) {
							float f_102_ = ((float) class179.anIntArray1970[i_53_] / 256.0F);
							float f_103_ = ((float) class179.anIntArray1992[i_53_] / 256.0F);
							int i_104_ = (class179.anIntArray1981[i_93_] - class179.anIntArray1981[i_92_]);
							int i_105_ = (class179.anIntArray1973[i_93_] - class179.anIntArray1973[i_92_]);
							int i_106_ = (class179.anIntArray1957[i_93_] - class179.anIntArray1957[i_92_]);
							int i_107_ = (class179.anIntArray1981[i_94_] - class179.anIntArray1981[i_92_]);
							int i_108_ = (class179.anIntArray1973[i_94_] - class179.anIntArray1973[i_92_]);
							int i_109_ = (class179.anIntArray1957[i_94_] - class179.anIntArray1957[i_92_]);
							int i_110_ = i_105_ * i_109_ - i_108_ * i_106_;
							int i_111_ = i_106_ * i_107_ - i_109_ * i_104_;
							int i_112_ = i_104_ * i_108_ - i_107_ * i_105_;
							float f_113_ = (64.0F / (float) class179.anIntArray1987[i_53_]);
							float f_114_ = (64.0F / (float) class179.anIntArray1988[i_53_]);
							float f_115_ = (64.0F / (float) class179.anIntArray1955[i_53_]);
							float f_116_ = (((float) i_110_ * fs[0] + (float) i_111_ * fs[1] + (float) i_112_ * fs[2]) / f_113_);
							float f_117_ = (((float) i_110_ * fs[3] + (float) i_111_ * fs[4] + (float) i_112_ * fs[5]) / f_114_);
							float f_118_ = (((float) i_110_ * fs[6] + (float) i_111_ * fs[7] + (float) i_112_ * fs[8]) / f_115_);
							i_57_ = method2674(f_116_, f_117_, f_118_);
							method2698(class179.anIntArray1981[i_92_], class179.anIntArray1973[i_92_], class179.anIntArray1957[i_92_], i_95_, i_96_, i_97_, i_57_, fs, i_98_, f_99_, f_102_, f_103_, aFloatArray9512);
							f = aFloatArray9512[0];
							f_46_ = aFloatArray9512[1];
							method2698(class179.anIntArray1981[i_93_], class179.anIntArray1973[i_93_], class179.anIntArray1957[i_93_], i_95_, i_96_, i_97_, i_57_, fs, i_98_, f_99_, f_102_, f_103_, aFloatArray9512);
							f_47_ = aFloatArray9512[0];
							f_48_ = aFloatArray9512[1];
							method2698(class179.anIntArray1981[i_94_], class179.anIntArray1973[i_94_], class179.anIntArray1957[i_94_], i_95_, i_96_, i_97_, i_57_, fs, i_98_, f_99_, f_102_, f_103_, aFloatArray9512);
							f_49_ = aFloatArray9512[0];
							f_50_ = aFloatArray9512[1];
						} else if (i_60_ == 3) {
							method2675(class179.anIntArray1981[i_92_], class179.anIntArray1973[i_92_], class179.anIntArray1957[i_92_], i_95_, i_96_, i_97_, fs, i_98_, f_99_, aFloatArray9512);
							f = aFloatArray9512[0];
							f_46_ = aFloatArray9512[1];
							method2675(class179.anIntArray1981[i_93_], class179.anIntArray1973[i_93_], class179.anIntArray1957[i_93_], i_95_, i_96_, i_97_, fs, i_98_, f_99_, aFloatArray9512);
							f_47_ = aFloatArray9512[0];
							f_48_ = aFloatArray9512[1];
							method2675(class179.anIntArray1981[i_94_], class179.anIntArray1973[i_94_], class179.anIntArray1957[i_94_], i_95_, i_96_, i_97_, fs, i_98_, f_99_, aFloatArray9512);
							f_49_ = aFloatArray9512[0];
							f_50_ = aFloatArray9512[1];
							if ((i_98_ & 0x1) == 0) {
								if (f_47_ - f > 0.5F) {
									f_47_--;
									i_58_ = 1;
								} else if (f - f_47_ > 0.5F) {
									f_47_++;
									i_58_ = 2;
								}
								if (f_49_ - f > 0.5F) {
									f_49_--;
									i_59_ = 1;
								} else if (f - f_49_ > 0.5F) {
									f_49_++;
									i_59_ = 2;
								}
							} else {
								if (f_48_ - f_46_ > 0.5F) {
									f_48_--;
									i_58_ = 1;
								} else if (f_46_ - f_48_ > 0.5F) {
									f_48_++;
									i_58_ = 2;
								}
								if (f_50_ - f_46_ > 0.5F) {
									f_50_--;
									i_59_ = 1;
								} else if (f_46_ - f_50_ > 0.5F) {
									f_50_++;
									i_59_ = 2;
								}
							}
						}
					}
					l_52_ = (long) (i_57_ << 16 | i_53_);
					l_51_ = (long) (i_58_ << 19) | l_52_;
					l = (long) (i_59_ << 19) | l_52_;
				}
			} else {
				l = 0L;
				l_51_ = 0L;
				l_52_ = 0L;
			}
			byte i_119_ = (class179.aByteArray1971 != null ? class179.aByteArray1971[i_42_] : (byte) 0);
			if (i_119_ == 0) {
				long l_120_ = (long) ((i_43_ << 8) + i_44_);
				short i_121_ = class179.aShortArray1949[i_42_];
				short i_122_ = class179.aShortArray1966[i_42_];
				short i_123_ = class179.aShortArray1967[i_42_];
				Class139 class139 = class139s[i_121_];
				aShortArray9450[i_41_] = method14864(class179, i_121_, l_120_ | l_52_ << 24, class139.anInt1655, class139.anInt1653, class139.anInt1654, class139.anInt1652, f, f_46_);
				class139 = class139s[i_122_];
				aShortArray9478[i_41_] = method14864(class179, i_122_, l_120_ | l_51_ << 24, class139.anInt1655, class139.anInt1653, class139.anInt1654, class139.anInt1652, f_47_, f_48_);
				class139 = class139s[i_123_];
				aShortArray9464[i_41_] = method14864(class179, i_123_, l_120_ | l << 24, class139.anInt1655, class139.anInt1653, class139.anInt1654, class139.anInt1652, f_49_, f_50_);
			} else if (i_119_ == 1) {
				Class138 class138 = class138s[i_42_];
				long l_124_ = (((long) (class138.anInt1650 & ~0x7fffffff) << 9) + ((long) (class138.anInt1649 + 256) << 32) + ((long) (class138.anInt1651 + 256) << 24) + (long) (i_43_ << 8) + (long) i_44_);
				aShortArray9450[i_41_] = method14864(class179, class179.aShortArray1949[i_42_], l_124_ | l_52_ << 41, class138.anInt1650, class138.anInt1649, class138.anInt1651, 0, f, f_46_);
				aShortArray9478[i_41_] = method14864(class179, class179.aShortArray1966[i_42_], l_124_ | l_52_ << 41, class138.anInt1650, class138.anInt1649, class138.anInt1651, 0, f_47_, f_48_);
				aShortArray9464[i_41_] = method14864(class179, class179.aShortArray1967[i_42_], l_124_ | l_52_ << 41, class138.anInt1650, class138.anInt1649, class138.anInt1651, 0, f_49_, f_50_);
			}
			if (class179.aByteArray1975 != null)
				aByteArray9476[i_41_] = class179.aByteArray1975[i_42_];
			if (class179.aShortArray1979 != null)
				aShortArray9482[i_41_] = class179.aShortArray1979[i_42_];
			aShortArray9489[i_41_] = class179.aShortArray1974[i_42_];
			aShortArray9473[i_41_] = i_45_;
		}
		int i_125_ = 0;
		short i_126_ = -10000;
		for (int i_127_ = 0; i_127_ < anInt9474; i_127_++) {
			short i_128_ = aShortArray9473[i_127_];
			if (i_128_ != i_126_) {
				i_125_++;
				i_126_ = i_128_;
			}
		}
		anIntArray9502 = new int[i_125_ + 1];
		i_125_ = 0;
		i_126_ = (short) -10000;
		for (int i_129_ = 0; i_129_ < anInt9474; i_129_++) {
			short i_130_ = aShortArray9473[i_129_];
			if (i_130_ != i_126_) {
				anIntArray9502[i_125_++] = i_129_;
				i_126_ = i_130_;
			}
		}
		anIntArray9502[i_125_] = anInt9474;
		aLongArray9445 = null;
		aShortArray9493 = method14865(aShortArray9493, anInt9511);
		aShortArray9467 = method14865(aShortArray9467, anInt9511);
		aShortArray9468 = method14865(aShortArray9468, anInt9511);
		aByteArray9487 = method14878(aByteArray9487, anInt9511);
		aFloatArray9453 = method14866(aFloatArray9453, anInt9511);
		aFloatArray9472 = method14866(aFloatArray9472, anInt9511);
		if (class179.anIntArray1956 != null && Class127.method2174(i, anInt9458))
			anIntArrayArray9463 = class179.method3510(false);
		if (class179.aClass176Array1997 != null && Class127.method2175(i, anInt9458))
			anIntArrayArray9480 = class179.method3489();
		if (class179.anIntArray1993 != null && Class127.method2201(i, anInt9458)) {
			int i_131_ = 0;
			int[] is_132_ = new int[256];
			for (int i_133_ = 0; i_133_ < anInt9515; i_133_++) {
				int i_134_ = class179.anIntArray1993[is[i_133_]];
				if (i_134_ >= 0) {
					is_132_[i_134_]++;
					if (i_134_ > i_131_)
						i_131_ = i_134_;
				}
			}
			anIntArrayArray9475 = new int[i_131_ + 1][];
			for (int i_135_ = 0; i_135_ <= i_131_; i_135_++) {
				anIntArrayArray9475[i_135_] = new int[is_132_[i_135_]];
				is_132_[i_135_] = 0;
			}
			for (int i_136_ = 0; i_136_ < anInt9515; i_136_++) {
				int i_137_ = class179.anIntArray1993[is[i_136_]];
				if (i_137_ >= 0)
					anIntArrayArray9475[i_137_][is_132_[i_137_]++] = i_136_;
			}
		}
	}

	short method14864(Class179 class179, int i, long l, int i_138_, int i_139_, int i_140_, int i_141_, float f, float f_142_) {
		int i_143_ = anIntArray9503[i];
		int i_144_ = anIntArray9503[i + 1];
		int i_145_ = 0;
		for (int i_146_ = i_143_; i_146_ < i_144_; i_146_++) {
			if (aShortArray9504[i_146_] == 0) {
				i_145_ = i_146_;
				break;
			}
			int i_147_ = (aShortArray9504[i_146_] & 0xffff) - 1;
			if (aLongArray9445[i_146_] == l)
				return (short) i_147_;
		}
		aShortArray9504[i_145_] = (short) (anInt9511 + 1);
		aLongArray9445[i_145_] = l;
		aShortArray9493[anInt9511] = (short) i_138_;
		aShortArray9467[anInt9511] = (short) i_139_;
		aShortArray9468[anInt9511] = (short) i_140_;
		aByteArray9487[anInt9511] = (byte) i_141_;
		aFloatArray9453[anInt9511] = f;
		aFloatArray9472[anInt9511] = f_142_;
		return (short) anInt9511++;
	}

	public void method2771(int i, int i_148_, int i_149_) {
		for (int i_150_ = 0; i_150_ < anInt9459; i_150_++) {
			if (i != 0)
				anIntArray9460[i_150_] += i;
			if (i_148_ != 0)
				anIntArray9461[i_150_] += i_148_;
			if (i_149_ != 0)
				anIntArray9496[i_150_] += i_149_;
		}
		if (aClass131_9481 != null)
			aClass131_9481.anInterface15_1558 = null;
		aBool9465 = false;
	}

	static short[] method14865(short[] is, int i) {
		short[] is_151_ = new short[i];
		System.arraycopy(is, 0, is_151_, 0, i);
		return is_151_;
	}

	static float[] method14866(float[] fs, int i) {
		float[] fs_152_ = new float[i];
		System.arraycopy(fs, 0, fs_152_, 0, i);
		return fs_152_;
	}

	void method14867(Class441 class441) {
		if (aClass161Array9508 != null) {
			Class441 class441_153_ = aClass178_Sub1_9486.aClass441_9362;
			aClass178_Sub1_9486.method14636();
			aClass178_Sub1_9486.method3287(!aBool9456);
			aClass178_Sub1_9486.method14682(false);
			aClass178_Sub1_9486.method14664(aClass178_Sub1_9486.aClass131_9370, null, null, (aClass178_Sub1_9486.aClass131_9425));
			for (int i = 0; i < anInt9507; i++) {
				Class161 class161 = aClass161Array9508[i];
				Class133 class133 = aClass133Array9479[i];
				if (!class161.aBool1767 || !aClass178_Sub1_9486.method3146()) {
					float f = ((float) (anIntArray9460[class161.anInt1768] + anIntArray9460[class161.anInt1761] + anIntArray9460[class161.anInt1762]) * 0.3333333F);
					float f_154_ = ((float) (anIntArray9461[class161.anInt1768] + anIntArray9461[class161.anInt1761] + anIntArray9461[class161.anInt1762]) * 0.3333333F);
					float f_155_ = ((float) (anIntArray9496[class161.anInt1768] + anIntArray9496[class161.anInt1761] + anIntArray9496[class161.anInt1762]) * 0.3333333F);
					float f_156_ = (class441.aFloatArray4916[0] * f + class441.aFloatArray4916[4] * f_154_ + class441.aFloatArray4916[8] * f_155_ + class441.aFloatArray4916[12]);
					float f_157_ = (class441.aFloatArray4916[1] * f + class441.aFloatArray4916[5] * f_154_ + class441.aFloatArray4916[9] * f_155_ + class441.aFloatArray4916[13]);
					float f_158_ = (class441.aFloatArray4916[2] * f + class441.aFloatArray4916[6] * f_154_ + class441.aFloatArray4916[10] * f_155_ + class441.aFloatArray4916[14]);
					float f_159_ = ((float) (1.0 / Math.sqrt((double) (f_156_ * f_156_ + f_157_ * f_157_ + f_158_ * f_158_))) * (float) class161.anInt1769);
					class441_153_.method7118(class133.anInt1574, class133.anInt1576 * class161.aShort1766 >> 7, class133.anInt1573 * class161.aShort1765 >> 7, f_156_ + (float) class133.anInt1575 - f_156_ * f_159_, f_157_ + (float) class133.anInt1572 - f_157_ * f_159_, f_158_ - f_158_ * f_159_);
					aClass178_Sub1_9486.method14824(class441_153_);
					int i_160_ = class133.anInt1577;
					OpenGL.glColor4ub((byte) (i_160_ >> 16), (byte) (i_160_ >> 8), (byte) i_160_, (byte) (i_160_ >> 24));
					aClass178_Sub1_9486.method14670(class161.aShort1763);
					aClass178_Sub1_9486.method14687(class161.aByte1760);
					aClass178_Sub1_9486.method14665(7, 0, 4);
				}
			}
			aClass178_Sub1_9486.method3287(true);
			aClass178_Sub1_9486.method14638();
		}
	}

	public void method2769(int i) {
		anInt9451 = i;
		if (aClass151_9470 != null && (anInt9451 & 0x10000) == 0) {
			aShortArray9493 = aClass151_9470.aShortArray1729;
			aShortArray9467 = aClass151_9470.aShortArray1726;
			aShortArray9468 = aClass151_9470.aShortArray1728;
			aByteArray9487 = aClass151_9470.aByteArray1727;
			aClass151_9470 = null;
		}
		aBool9490 = true;
		method14882();
	}

	public void method2684() {
		if (anInt9511 > 0 && anInt9474 > 0) {
			method14876(false);
			if ((aByte9454 & 0x10) == 0 && aClass119_9509.anInterface18_1474 == null)
				method14868(false);
			method14882();
		}
	}

	public void method2748(int i) {
		int i_161_ = Class433.anIntArray4880[i];
		int i_162_ = Class433.anIntArray4881[i];
		for (int i_163_ = 0; i_163_ < anInt9459; i_163_++) {
			int i_164_ = ((anIntArray9496[i_163_] * i_161_ + anIntArray9460[i_163_] * i_162_) >> 14);
			anIntArray9496[i_163_] = (anIntArray9496[i_163_] * i_162_ - anIntArray9460[i_163_] * i_161_) >> 14;
			anIntArray9460[i_163_] = i_164_;
		}
		if (aClass131_9481 != null)
			aClass131_9481.anInterface15_1558 = null;
		aBool9465 = false;
	}

	void method14868(boolean bool) {
		if ((aClass178_Sub1_9486.aClass523_Sub34_Sub1_9321.aByteArray10658).length < anInt9474 * 6)
			aClass178_Sub1_9486.aClass523_Sub34_Sub1_9321 = new Class523_Sub34_Sub1((anInt9474 + 100) * 6);
		else
			aClass178_Sub1_9486.aClass523_Sub34_Sub1_9321.anInt10661 = 0;
		Class523_Sub34_Sub1 class523_sub34_sub1 = aClass178_Sub1_9486.aClass523_Sub34_Sub1_9321;
		if (aClass178_Sub1_9486.aBool9393) {
			for (int i = 0; i < anInt9474; i++) {
				class523_sub34_sub1.writeShort(aShortArray9450[i], (byte) -116);
				class523_sub34_sub1.writeShort(aShortArray9478[i], (byte) -19);
				class523_sub34_sub1.writeShort(aShortArray9464[i], (byte) -54);
			}
		} else {
			for (int i = 0; i < anInt9474; i++) {
				class523_sub34_sub1.method16262(aShortArray9450[i], -1365912169);
				class523_sub34_sub1.method16262(aShortArray9478[i], -1180290420);
				class523_sub34_sub1.method16262(aShortArray9464[i], -454876568);
			}
		}
		if (class523_sub34_sub1.anInt10661 * 2349011 != 0) {
			if (bool) {
				if (anInterface18_9488 == null)
					anInterface18_9488 = (aClass178_Sub1_9486.method14660(5123, class523_sub34_sub1.aByteArray10658, class523_sub34_sub1.anInt10661 * 2349011, true));
				else
					anInterface18_9488.method100(5123, class523_sub34_sub1.aByteArray10658, class523_sub34_sub1.anInt10661 * 2349011);
				aClass119_9509.anInterface18_1474 = anInterface18_9488;
			} else
				aClass119_9509.anInterface18_1474 = (aClass178_Sub1_9486.method14660(5123, class523_sub34_sub1.aByteArray10658, class523_sub34_sub1.anInt10661 * 2349011, false));
			if (!bool)
				aBool9490 = true;
		}
	}

	public void method2764(int i, int i_165_, Class142 class142, Class142 class142_166_, int i_167_, int i_168_, int i_169_) {
		if (!aBool9465)
			method14870();
		int i_170_ = i_167_ + aShort9471;
		int i_171_ = i_167_ + aShort9497;
		int i_172_ = i_169_ + aShort9498;
		int i_173_ = i_169_ + aShort9491;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_170_ >= 0 && ((i_171_ + class142.anInt1682 * 341909049 >> class142.anInt1680 * -1193058675) < class142.anInt1683 * 692304099) && i_172_ >= 0 && ((i_173_ + class142.anInt1682 * 341909049 >> class142.anInt1680 * -1193058675) < class142.anInt1681 * 452998539))) {
			if (i == 4 || i == 5) {
				if (class142_166_ == null || (i_170_ < 0 || ((i_171_ + class142_166_.anInt1682 * 341909049 >> class142_166_.anInt1680 * -1193058675) >= class142_166_.anInt1683 * 692304099) || i_172_ < 0 || ((i_173_ + class142_166_.anInt1682 * 341909049 >> class142_166_.anInt1680 * -1193058675) >= class142_166_.anInt1681 * 452998539)))
					return;
			} else {
				i_170_ >>= class142.anInt1680 * -1193058675;
				i_171_ = (i_171_ + (class142.anInt1682 * 341909049 - 1) >> class142.anInt1680 * -1193058675);
				i_172_ >>= class142.anInt1680 * -1193058675;
				i_173_ = (i_173_ + (class142.anInt1682 * 341909049 - 1) >> class142.anInt1680 * -1193058675);
				if (class142.method2321(i_170_, i_172_, 2100655428) == i_168_ && (class142.method2321(i_171_, i_172_, 1652422554) == i_168_) && (class142.method2321(i_170_, i_173_, 1765176920) == i_168_) && (class142.method2321(i_171_, i_173_, 1572509347) == i_168_))
					return;
			}
			if (i == 1) {
				for (int i_174_ = 0; i_174_ < anInt9459; i_174_++)
					anIntArray9461[i_174_] = (anIntArray9461[i_174_] + class142.method2327((anIntArray9460[i_174_] + i_167_), (anIntArray9496[i_174_] + i_169_), 1063337856) - i_168_);
			} else if (i == 2) {
				int i_175_ = aShort9494;
				if (i_175_ == 0)
					return;
				for (int i_176_ = 0; i_176_ < anInt9459; i_176_++) {
					int i_177_ = (anIntArray9461[i_176_] << 16) / i_175_;
					if (i_177_ < i_165_)
						anIntArray9461[i_176_] = (anIntArray9461[i_176_] + (class142.method2327((anIntArray9460[i_176_] + i_167_), (anIntArray9496[i_176_] + i_169_), -142926754) - i_168_) * (i_165_ - i_177_) / i_165_);
				}
			} else if (i == 3) {
				int i_178_ = (i_165_ & 0xff) * 16;
				int i_179_ = (i_165_ >> 8 & 0xff) * 16;
				int i_180_ = (i_165_ >> 16 & 0xff) << 6;
				int i_181_ = (i_165_ >> 24 & 0xff) << 6;
				if (i_167_ - (i_178_ >> 1) < 0 || (i_167_ + (i_178_ >> 1) + class142.anInt1682 * 341909049 >= (class142.anInt1683 * 692304099 << class142.anInt1680 * -1193058675)) || i_169_ - (i_179_ >> 1) < 0 || (i_169_ + (i_179_ >> 1) + class142.anInt1682 * 341909049 >= (class142.anInt1681 * 452998539 << class142.anInt1680 * -1193058675)))
					return;
				method2693(class142, i_167_, i_168_, i_169_, i_178_, i_179_, i_180_, i_181_);
			} else if (i == 4) {
				int i_182_ = aShort9505 - aShort9494;
				for (int i_183_ = 0; i_183_ < anInt9459; i_183_++)
					anIntArray9461[i_183_] = (anIntArray9461[i_183_] + (class142_166_.method2327((anIntArray9460[i_183_] + i_167_), (anIntArray9496[i_183_] + i_169_), -25293871) - i_168_) + i_182_);
			} else if (i == 5) {
				int i_184_ = aShort9505 - aShort9494;
				for (int i_185_ = 0; i_185_ < anInt9459; i_185_++) {
					int i_186_ = anIntArray9460[i_185_] + i_167_;
					int i_187_ = anIntArray9496[i_185_] + i_169_;
					int i_188_ = class142.method2327(i_186_, i_187_, 428484506);
					int i_189_ = class142_166_.method2327(i_186_, i_187_, -919189835);
					int i_190_ = i_188_ - i_189_ - i_165_;
					anIntArray9461[i_185_] = ((anIntArray9461[i_185_] << 8) / i_184_ * i_190_ >> 8) - (i_168_ - i_188_);
				}
			}
			if (aClass131_9481 != null)
				aClass131_9481.anInterface15_1558 = null;
			aBool9465 = false;
		}
	}

	public boolean method2731() {
		return aBool9469;
	}

	void method14869(Class441 class441) {
		if (aClass161Array9508 != null) {
			Class441 class441_191_ = aClass178_Sub1_9486.aClass441_9362;
			aClass178_Sub1_9486.method14636();
			aClass178_Sub1_9486.method3287(!aBool9456);
			aClass178_Sub1_9486.method14682(false);
			aClass178_Sub1_9486.method14664(aClass178_Sub1_9486.aClass131_9370, null, null, (aClass178_Sub1_9486.aClass131_9425));
			for (int i = 0; i < anInt9507; i++) {
				Class161 class161 = aClass161Array9508[i];
				Class133 class133 = aClass133Array9479[i];
				if (!class161.aBool1767 || !aClass178_Sub1_9486.method3146()) {
					float f = ((float) (anIntArray9460[class161.anInt1768] + anIntArray9460[class161.anInt1761] + anIntArray9460[class161.anInt1762]) * 0.3333333F);
					float f_192_ = ((float) (anIntArray9461[class161.anInt1768] + anIntArray9461[class161.anInt1761] + anIntArray9461[class161.anInt1762]) * 0.3333333F);
					float f_193_ = ((float) (anIntArray9496[class161.anInt1768] + anIntArray9496[class161.anInt1761] + anIntArray9496[class161.anInt1762]) * 0.3333333F);
					float f_194_ = (class441.aFloatArray4916[0] * f + class441.aFloatArray4916[4] * f_192_ + class441.aFloatArray4916[8] * f_193_ + class441.aFloatArray4916[12]);
					float f_195_ = (class441.aFloatArray4916[1] * f + class441.aFloatArray4916[5] * f_192_ + class441.aFloatArray4916[9] * f_193_ + class441.aFloatArray4916[13]);
					float f_196_ = (class441.aFloatArray4916[2] * f + class441.aFloatArray4916[6] * f_192_ + class441.aFloatArray4916[10] * f_193_ + class441.aFloatArray4916[14]);
					float f_197_ = ((float) (1.0 / Math.sqrt((double) (f_194_ * f_194_ + f_195_ * f_195_ + f_196_ * f_196_))) * (float) class161.anInt1769);
					class441_191_.method7118(class133.anInt1574, class133.anInt1576 * class161.aShort1766 >> 7, class133.anInt1573 * class161.aShort1765 >> 7, f_194_ + (float) class133.anInt1575 - f_194_ * f_197_, f_195_ + (float) class133.anInt1572 - f_195_ * f_197_, f_196_ - f_196_ * f_197_);
					aClass178_Sub1_9486.method14824(class441_191_);
					int i_198_ = class133.anInt1577;
					OpenGL.glColor4ub((byte) (i_198_ >> 16), (byte) (i_198_ >> 8), (byte) i_198_, (byte) (i_198_ >> 24));
					aClass178_Sub1_9486.method14670(class161.aShort1763);
					aClass178_Sub1_9486.method14687(class161.aByte1760);
					aClass178_Sub1_9486.method14665(7, 0, 4);
				}
			}
			aClass178_Sub1_9486.method3287(true);
			aClass178_Sub1_9486.method14638();
		}
	}

	public void method2735(Class167 class167, int i, int i_199_, int i_200_, boolean bool) {
		Class167_Sub3 class167_sub3_201_ = (Class167_Sub3) class167;
		if (anInt9515 != 0 && class167_sub3_201_.anInt9515 != 0) {
			int i_202_ = class167_sub3_201_.anInt9459;
			int[] is = class167_sub3_201_.anIntArray9460;
			int[] is_203_ = class167_sub3_201_.anIntArray9461;
			int[] is_204_ = class167_sub3_201_.anIntArray9496;
			short[] is_205_ = class167_sub3_201_.aShortArray9493;
			short[] is_206_ = class167_sub3_201_.aShortArray9467;
			short[] is_207_ = class167_sub3_201_.aShortArray9468;
			byte[] is_208_ = class167_sub3_201_.aByteArray9487;
			short[] is_209_;
			short[] is_210_;
			short[] is_211_;
			byte[] is_212_;
			if (aClass151_9470 != null) {
				is_209_ = aClass151_9470.aShortArray1729;
				is_210_ = aClass151_9470.aShortArray1726;
				is_211_ = aClass151_9470.aShortArray1728;
				is_212_ = aClass151_9470.aByteArray1727;
			} else {
				is_209_ = null;
				is_210_ = null;
				is_211_ = null;
				is_212_ = null;
			}
			short[] is_213_;
			short[] is_214_;
			short[] is_215_;
			byte[] is_216_;
			if (class167_sub3_201_.aClass151_9470 != null) {
				is_213_ = class167_sub3_201_.aClass151_9470.aShortArray1729;
				is_214_ = class167_sub3_201_.aClass151_9470.aShortArray1726;
				is_215_ = class167_sub3_201_.aClass151_9470.aShortArray1728;
				is_216_ = class167_sub3_201_.aClass151_9470.aByteArray1727;
			} else {
				is_213_ = null;
				is_214_ = null;
				is_215_ = null;
				is_216_ = null;
			}
			int[] is_217_ = class167_sub3_201_.anIntArray9503;
			short[] is_218_ = class167_sub3_201_.aShortArray9504;
			if (!class167_sub3_201_.aBool9465)
				class167_sub3_201_.method14870();
			int i_219_ = class167_sub3_201_.aShort9494;
			int i_220_ = class167_sub3_201_.aShort9505;
			int i_221_ = class167_sub3_201_.aShort9471;
			int i_222_ = class167_sub3_201_.aShort9497;
			int i_223_ = class167_sub3_201_.aShort9498;
			int i_224_ = class167_sub3_201_.aShort9491;
			for (int i_225_ = 0; i_225_ < anInt9459; i_225_++) {
				int i_226_ = anIntArray9461[i_225_] - i_199_;
				if (i_226_ >= i_219_ && i_226_ <= i_220_) {
					int i_227_ = anIntArray9460[i_225_] - i;
					if (i_227_ >= i_221_ && i_227_ <= i_222_) {
						int i_228_ = anIntArray9496[i_225_] - i_200_;
						if (i_228_ >= i_223_ && i_228_ <= i_224_) {
							int i_229_ = -1;
							int i_230_ = anIntArray9503[i_225_];
							int i_231_ = anIntArray9503[i_225_ + 1];
							for (int i_232_ = i_230_; (i_232_ < i_231_ && aShortArray9504[i_232_] != 0); i_232_++) {
								i_229_ = (aShortArray9504[i_232_] & 0xffff) - 1;
								if (aByteArray9487[i_229_] != 0)
									break;
							}
							if (i_229_ != -1) {
								for (int i_233_ = 0; i_233_ < i_202_; i_233_++) {
									if (i_227_ == is[i_233_] && i_228_ == is_204_[i_233_] && i_226_ == is_203_[i_233_]) {
										int i_234_ = -1;
										i_230_ = is_217_[i_233_];
										i_231_ = is_217_[i_233_ + 1];
										for (int i_235_ = i_230_; (i_235_ < i_231_ && is_218_[i_235_] != 0); i_235_++) {
											i_234_ = (is_218_[i_235_] & 0xffff) - 1;
											if (is_208_[i_234_] != 0)
												break;
										}
										if (i_234_ != -1) {
											if (is_209_ == null) {
												aClass151_9470 = new Class151();
												is_209_ = aClass151_9470.aShortArray1729 = (Class246.method4386(aShortArray9493, -1799469711));
												is_210_ = aClass151_9470.aShortArray1726 = (Class246.method4386(aShortArray9467, -410352318));
												is_211_ = aClass151_9470.aShortArray1728 = (Class246.method4386(aShortArray9468, -1821896619));
												is_212_ = aClass151_9470.aByteArray1727 = (Class60.method1408(aByteArray9487, -967717877));
											}
											if (is_213_ == null) {
												Class151 class151 = (class167_sub3_201_.aClass151_9470 = new Class151());
												is_213_ = class151.aShortArray1729 = (Class246.method4386(is_205_, -590705790));
												is_214_ = class151.aShortArray1726 = (Class246.method4386(is_206_, -1916864656));
												is_215_ = class151.aShortArray1728 = (Class246.method4386(is_207_, -1870186170));
												is_216_ = class151.aByteArray1727 = (Class60.method1408(is_208_, -1713039309));
											}
											short i_236_ = aShortArray9493[i_229_];
											short i_237_ = aShortArray9467[i_229_];
											short i_238_ = aShortArray9468[i_229_];
											byte i_239_ = aByteArray9487[i_229_];
											i_230_ = is_217_[i_233_];
											i_231_ = is_217_[i_233_ + 1];
											for (int i_240_ = i_230_; i_240_ < i_231_; i_240_++) {
												int i_241_ = is_218_[i_240_] - 1;
												if (i_241_ == -1)
													break;
												if (is_216_[i_241_] != 0) {
													is_213_[i_241_] += i_236_;
													is_214_[i_241_] += i_237_;
													is_215_[i_241_] += i_238_;
													is_216_[i_241_] += i_239_;
												}
											}
											i_236_ = is_205_[i_234_];
											i_237_ = is_206_[i_234_];
											i_238_ = is_207_[i_234_];
											i_239_ = is_208_[i_234_];
											i_230_ = anIntArray9503[i_225_];
											i_231_ = anIntArray9503[i_225_ + 1];
											for (int i_242_ = i_230_; (i_242_ < i_231_ && (aShortArray9504[i_242_] != 0)); i_242_++) {
												int i_243_ = ((aShortArray9504[i_242_] & 0xffff) - 1);
												if (is_212_[i_243_] != 0) {
													is_209_[i_243_] += i_236_;
													is_210_[i_243_] += i_237_;
													is_211_[i_243_] += i_238_;
													is_212_[i_243_] += i_239_;
												}
											}
											if (aClass131_9485 == null && aClass131_9484 != null)
												aClass131_9484.anInterface15_1558 = null;
											if (aClass131_9485 != null)
												aClass131_9485.anInterface15_1558 = null;
											if ((class167_sub3_201_.aClass131_9485) == null && (class167_sub3_201_.aClass131_9484) != null)
												class167_sub3_201_.aClass131_9484.anInterface15_1558 = null;
											if ((class167_sub3_201_.aClass131_9485) != null)
												class167_sub3_201_.aClass131_9485.anInterface15_1558 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void method2688(int i) {
		int i_244_ = Class433.anIntArray4880[i];
		int i_245_ = Class433.anIntArray4881[i];
		for (int i_246_ = 0; i_246_ < anInt9459; i_246_++) {
			int i_247_ = ((anIntArray9461[i_246_] * i_244_ + anIntArray9460[i_246_] * i_245_) >> 14);
			anIntArray9461[i_246_] = (anIntArray9461[i_246_] * i_245_ - anIntArray9460[i_246_] * i_244_) >> 14;
			anIntArray9460[i_246_] = i_247_;
		}
		if (aClass131_9481 != null)
			aClass131_9481.anInterface15_1558 = null;
		aBool9465 = false;
	}

	public void method2689(int i, int i_248_, int i_249_) {
		for (int i_250_ = 0; i_250_ < anInt9459; i_250_++) {
			if (i != 0)
				anIntArray9460[i_250_] += i;
			if (i_248_ != 0)
				anIntArray9461[i_250_] += i_248_;
			if (i_249_ != 0)
				anIntArray9496[i_250_] += i_249_;
		}
		if (aClass131_9481 != null)
			aClass131_9481.anInterface15_1558 = null;
		aBool9465 = false;
	}

	public byte[] method2820() {
		return aByteArray9476;
	}

	public void method2691(int i, int i_251_, int i_252_) {
		for (int i_253_ = 0; i_253_ < anInt9459; i_253_++) {
			if (i != 128)
				anIntArray9460[i_253_] = anIntArray9460[i_253_] * i >> 7;
			if (i_251_ != 128)
				anIntArray9461[i_253_] = anIntArray9461[i_253_] * i_251_ >> 7;
			if (i_252_ != 128)
				anIntArray9496[i_253_] = anIntArray9496[i_253_] * i_252_ >> 7;
		}
		if (aClass131_9481 != null)
			aClass131_9481.anInterface15_1558 = null;
		aBool9465 = false;
	}

	public void method2692(int i, int i_254_, Class142 class142, Class142 class142_255_, int i_256_, int i_257_, int i_258_) {
		if (!aBool9465)
			method14870();
		int i_259_ = i_256_ + aShort9471;
		int i_260_ = i_256_ + aShort9497;
		int i_261_ = i_258_ + aShort9498;
		int i_262_ = i_258_ + aShort9491;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_259_ >= 0 && ((i_260_ + class142.anInt1682 * 341909049 >> class142.anInt1680 * -1193058675) < class142.anInt1683 * 692304099) && i_261_ >= 0 && ((i_262_ + class142.anInt1682 * 341909049 >> class142.anInt1680 * -1193058675) < class142.anInt1681 * 452998539))) {
			if (i == 4 || i == 5) {
				if (class142_255_ == null || (i_259_ < 0 || ((i_260_ + class142_255_.anInt1682 * 341909049 >> class142_255_.anInt1680 * -1193058675) >= class142_255_.anInt1683 * 692304099) || i_261_ < 0 || ((i_262_ + class142_255_.anInt1682 * 341909049 >> class142_255_.anInt1680 * -1193058675) >= class142_255_.anInt1681 * 452998539)))
					return;
			} else {
				i_259_ >>= class142.anInt1680 * -1193058675;
				i_260_ = (i_260_ + (class142.anInt1682 * 341909049 - 1) >> class142.anInt1680 * -1193058675);
				i_261_ >>= class142.anInt1680 * -1193058675;
				i_262_ = (i_262_ + (class142.anInt1682 * 341909049 - 1) >> class142.anInt1680 * -1193058675);
				if (class142.method2321(i_259_, i_261_, 1827372282) == i_257_ && (class142.method2321(i_260_, i_261_, 1834318961) == i_257_) && (class142.method2321(i_259_, i_262_, 1953919018) == i_257_) && (class142.method2321(i_260_, i_262_, 2090820018) == i_257_))
					return;
			}
			if (i == 1) {
				for (int i_263_ = 0; i_263_ < anInt9459; i_263_++)
					anIntArray9461[i_263_] = (anIntArray9461[i_263_] + class142.method2327((anIntArray9460[i_263_] + i_256_), (anIntArray9496[i_263_] + i_258_), 1638233987) - i_257_);
			} else if (i == 2) {
				int i_264_ = aShort9494;
				if (i_264_ == 0)
					return;
				for (int i_265_ = 0; i_265_ < anInt9459; i_265_++) {
					int i_266_ = (anIntArray9461[i_265_] << 16) / i_264_;
					if (i_266_ < i_254_)
						anIntArray9461[i_265_] = (anIntArray9461[i_265_] + (class142.method2327((anIntArray9460[i_265_] + i_256_), (anIntArray9496[i_265_] + i_258_), 1685187914) - i_257_) * (i_254_ - i_266_) / i_254_);
				}
			} else if (i == 3) {
				int i_267_ = (i_254_ & 0xff) * 16;
				int i_268_ = (i_254_ >> 8 & 0xff) * 16;
				int i_269_ = (i_254_ >> 16 & 0xff) << 6;
				int i_270_ = (i_254_ >> 24 & 0xff) << 6;
				if (i_256_ - (i_267_ >> 1) < 0 || (i_256_ + (i_267_ >> 1) + class142.anInt1682 * 341909049 >= (class142.anInt1683 * 692304099 << class142.anInt1680 * -1193058675)) || i_258_ - (i_268_ >> 1) < 0 || (i_258_ + (i_268_ >> 1) + class142.anInt1682 * 341909049 >= (class142.anInt1681 * 452998539 << class142.anInt1680 * -1193058675)))
					return;
				method2693(class142, i_256_, i_257_, i_258_, i_267_, i_268_, i_269_, i_270_);
			} else if (i == 4) {
				int i_271_ = aShort9505 - aShort9494;
				for (int i_272_ = 0; i_272_ < anInt9459; i_272_++)
					anIntArray9461[i_272_] = (anIntArray9461[i_272_] + (class142_255_.method2327((anIntArray9460[i_272_] + i_256_), (anIntArray9496[i_272_] + i_258_), -1860966051) - i_257_) + i_271_);
			} else if (i == 5) {
				int i_273_ = aShort9505 - aShort9494;
				for (int i_274_ = 0; i_274_ < anInt9459; i_274_++) {
					int i_275_ = anIntArray9460[i_274_] + i_256_;
					int i_276_ = anIntArray9496[i_274_] + i_258_;
					int i_277_ = class142.method2327(i_275_, i_276_, 915304080);
					int i_278_ = class142_255_.method2327(i_275_, i_276_, 1008905709);
					int i_279_ = i_277_ - i_278_ - i_254_;
					anIntArray9461[i_274_] = ((anIntArray9461[i_274_] << 8) / i_273_ * i_279_ >> 8) - (i_257_ - i_277_);
				}
			}
			if (aClass131_9481 != null)
				aClass131_9481.anInterface15_1558 = null;
			aBool9465 = false;
		}
	}

	void method14870() {
		int i = 32767;
		int i_280_ = 32767;
		int i_281_ = 32767;
		int i_282_ = -32768;
		int i_283_ = -32768;
		int i_284_ = -32768;
		int i_285_ = 0;
		int i_286_ = 0;
		for (int i_287_ = 0; i_287_ < anInt9459; i_287_++) {
			int i_288_ = anIntArray9460[i_287_];
			int i_289_ = anIntArray9461[i_287_];
			int i_290_ = anIntArray9496[i_287_];
			if (i_288_ < i)
				i = i_288_;
			if (i_288_ > i_282_)
				i_282_ = i_288_;
			if (i_289_ < i_280_)
				i_280_ = i_289_;
			if (i_289_ > i_283_)
				i_283_ = i_289_;
			if (i_290_ < i_281_)
				i_281_ = i_290_;
			if (i_290_ > i_284_)
				i_284_ = i_290_;
			int i_291_ = i_288_ * i_288_ + i_290_ * i_290_;
			if (i_291_ > i_285_)
				i_285_ = i_291_;
			i_291_ = i_288_ * i_288_ + i_290_ * i_290_ + i_289_ * i_289_;
			if (i_291_ > i_286_)
				i_286_ = i_291_;
		}
		aShort9471 = (short) i;
		aShort9497 = (short) i_282_;
		aShort9494 = (short) i_280_;
		aShort9505 = (short) i_283_;
		aShort9498 = (short) i_281_;
		aShort9491 = (short) i_284_;
		anInt9492 = (int) (Math.sqrt((double) i_285_) + 0.99);
		anInt9443 = (int) (Math.sqrt((double) i_286_) + 0.99);
		aBool9465 = true;
	}

	public void method2719() {
		if (!aBool9500) {
			if (!aBool9465)
				method14870();
			aShort9501 = aShort9494;
			aBool9500 = true;
		}
	}

	public int method2711() {
		if (!aBool9465)
			method14870();
		return anInt9492;
	}

	public int method2834() {
		if (!aBool9465)
			method14870();
		return anInt9443;
	}

	public int method2712() {
		if (!aBool9465)
			method14870();
		return aShort9471;
	}

	public int method2713() {
		if (!aBool9465)
			method14870();
		return aShort9497;
	}

	public int method2804() {
		if (!aBool9465)
			method14870();
		return aShort9494;
	}

	public void method2833(int i, int i_292_, int i_293_) {
		for (int i_294_ = 0; i_294_ < anInt9459; i_294_++) {
			if (i != 0)
				anIntArray9460[i_294_] += i;
			if (i_292_ != 0)
				anIntArray9461[i_294_] += i_292_;
			if (i_293_ != 0)
				anIntArray9496[i_294_] += i_293_;
		}
		if (aClass131_9481 != null)
			aClass131_9481.anInterface15_1558 = null;
		aBool9465 = false;
	}

	public Class523_Sub27_Sub4 method2710(Class523_Sub27_Sub4 class523_sub27_sub4) {
		if (anInt9511 == 0)
			return null;
		if (!aBool9465)
			method14870();
		int i;
		int i_295_;
		if (aClass178_Sub1_9486.anInt9372 > 0) {
			i = (aShort9471 - (aShort9505 * aClass178_Sub1_9486.anInt9372 >> 8) >> aClass178_Sub1_9486.anInt9287);
			i_295_ = aShort9497 - (aShort9494 * aClass178_Sub1_9486.anInt9372 >> 8) >> aClass178_Sub1_9486.anInt9287;
		} else {
			i = (aShort9471 - (aShort9494 * aClass178_Sub1_9486.anInt9372 >> 8) >> aClass178_Sub1_9486.anInt9287);
			i_295_ = aShort9497 - (aShort9505 * aClass178_Sub1_9486.anInt9372 >> 8) >> aClass178_Sub1_9486.anInt9287;
		}
		int i_296_;
		int i_297_;
		if (aClass178_Sub1_9486.anInt9366 > 0) {
			i_296_ = aShort9498 - (aShort9505 * aClass178_Sub1_9486.anInt9366 >> 8) >> aClass178_Sub1_9486.anInt9287;
			i_297_ = aShort9491 - (aShort9494 * aClass178_Sub1_9486.anInt9366 >> 8) >> aClass178_Sub1_9486.anInt9287;
		} else {
			i_296_ = aShort9498 - (aShort9494 * aClass178_Sub1_9486.anInt9366 >> 8) >> aClass178_Sub1_9486.anInt9287;
			i_297_ = aShort9491 - (aShort9505 * aClass178_Sub1_9486.anInt9366 >> 8) >> aClass178_Sub1_9486.anInt9287;
		}
		int i_298_ = i_295_ - i + 1;
		int i_299_ = i_297_ - i_296_ + 1;
		Class523_Sub27_Sub4_Sub1 class523_sub27_sub4_sub1 = (Class523_Sub27_Sub4_Sub1) class523_sub27_sub4;
		Class523_Sub27_Sub4_Sub1 class523_sub27_sub4_sub1_300_;
		if (class523_sub27_sub4_sub1 != null && class523_sub27_sub4_sub1.method18496(i_298_, i_299_)) {
			class523_sub27_sub4_sub1_300_ = class523_sub27_sub4_sub1;
			class523_sub27_sub4_sub1_300_.method18495();
		} else
			class523_sub27_sub4_sub1_300_ = new Class523_Sub27_Sub4_Sub1(aClass178_Sub1_9486, i_298_, i_299_);
		class523_sub27_sub4_sub1_300_.method18505(i, i_296_, i_295_, i_297_);
		method14885(class523_sub27_sub4_sub1_300_);
		return class523_sub27_sub4_sub1_300_;
	}

	public int method2717() {
		if (!aBool9465)
			method14870();
		return aShort9491;
	}

	public boolean method2829() {
		return aBool9456;
	}

	public int method2766() {
		if (!aBool9465)
			method14870();
		return aShort9497;
	}

	public int method2726() {
		return aShort9495;
	}

	public void method2721(int i) {
		aShort9455 = (short) i;
		if (aClass131_9484 != null)
			aClass131_9484.anInterface15_1558 = null;
		if (aClass131_9485 != null)
			aClass131_9485.anInterface15_1558 = null;
	}

	public int method2722() {
		return aShort9495;
	}

	public int method2723() {
		return aShort9455;
	}

	public int method2743() {
		return anInt9451;
	}

	public void method2725(short i, short i_301_) {
		for (int i_302_ = 0; i_302_ < anInt9515; i_302_++) {
			if (aShortArray9489[i_302_] == i)
				aShortArray9489[i_302_] = i_301_;
		}
		if (aClass161Array9508 != null) {
			for (int i_303_ = 0; i_303_ < anInt9507; i_303_++) {
				Class161 class161 = aClass161Array9508[i_303_];
				Class133 class133 = aClass133Array9479[i_303_];
				class133.anInt1577 = (class133.anInt1577 & ~0xffffff | ((Class710.anIntArray8839[aShortArray9489[class161.anInt1764] & 0xffff]) & 0xffffff));
			}
		}
		if (aClass131_9484 != null)
			aClass131_9484.anInterface15_1558 = null;
	}

	void method2767() {
		/* empty */
	}

	public void method2826(short i, short i_304_) {
		Class172 class172 = aClass178_Sub1_9486.aClass172_1916;
		for (int i_305_ = 0; i_305_ < anInt9515; i_305_++) {
			if (aShortArray9473[i_305_] == i)
				aShortArray9473[i_305_] = i_304_;
		}
		byte i_306_ = 0;
		byte i_307_ = 0;
		if (i != -1) {
			Class177 class177 = class172.method2895(i & 0xffff, -2132447908);
			i_306_ = class177.aByte1912;
			i_307_ = class177.aByte1883;
		}
		byte i_308_ = 0;
		byte i_309_ = 0;
		if (i_304_ != -1) {
			Class177 class177 = class172.method2895(i_304_ & 0xffff, -1240513974);
			i_308_ = class177.aByte1912;
			i_309_ = class177.aByte1883;
			if (class177.aByte1885 != 0 || class177.aByte1886 != 0)
				aBool9469 = true;
		}
		if (i_306_ != i_308_ | i_307_ != i_309_) {
			if (aClass161Array9508 != null) {
				for (int i_310_ = 0; i_310_ < anInt9507; i_310_++) {
					Class161 class161 = aClass161Array9508[i_310_];
					Class133 class133 = aClass133Array9479[i_310_];
					class133.anInt1577 = (class133.anInt1577 & ~0xffffff | ((Class710.anIntArray8839[aShortArray9489[class161.anInt1764] & 0xffff]) & 0xffffff));
				}
			}
			if (aClass131_9484 != null)
				aClass131_9484.anInterface15_1558 = null;
		}
	}

	public void method2690() {
		for (int i = 0; i < anInt9459; i++)
			anIntArray9496[i] = -anIntArray9496[i];
		for (int i = 0; i < anInt9511; i++)
			aShortArray9468[i] = (short) -aShortArray9468[i];
		for (int i = 0; i < anInt9515; i++) {
			short i_311_ = aShortArray9450[i];
			aShortArray9450[i] = aShortArray9464[i];
			aShortArray9464[i] = i_311_;
		}
		if (aClass131_9485 == null && aClass131_9484 != null)
			aClass131_9484.anInterface15_1558 = null;
		if (aClass131_9485 != null)
			aClass131_9485.anInterface15_1558 = null;
		if (aClass131_9481 != null)
			aClass131_9481.anInterface15_1558 = null;
		if (aClass119_9509 != null)
			aClass119_9509.anInterface18_1474 = null;
		aBool9465 = false;
	}

	public boolean method2727() {
		if (aShortArray9473 == null)
			return true;
		for (int i = 0; i < aShortArray9473.length; i++) {
			if (aShortArray9473[i] != -1) {
				Class177 class177 = (aClass178_Sub1_9486.aClass172_1916.method2895(aShortArray9473[i] & 0xffff, -2144343246));
				if (class177.aBool1881 && !aClass178_Sub1_9486.aClass154_9382.method2530(Class601.aClass601_7850, class177, -1))
					return false;
			}
		}
		return true;
	}

	public boolean method2730() {
		return aBool9456;
	}

	void method14871(Class441 class441) {
		if (aClass161Array9508 != null) {
			Class441 class441_312_ = aClass178_Sub1_9486.aClass441_9362;
			aClass178_Sub1_9486.method14636();
			aClass178_Sub1_9486.method3287(!aBool9456);
			aClass178_Sub1_9486.method14682(false);
			aClass178_Sub1_9486.method14664(aClass178_Sub1_9486.aClass131_9370, null, null, (aClass178_Sub1_9486.aClass131_9425));
			for (int i = 0; i < anInt9507; i++) {
				Class161 class161 = aClass161Array9508[i];
				Class133 class133 = aClass133Array9479[i];
				if (!class161.aBool1767 || !aClass178_Sub1_9486.method3146()) {
					float f = ((float) (anIntArray9460[class161.anInt1768] + anIntArray9460[class161.anInt1761] + anIntArray9460[class161.anInt1762]) * 0.3333333F);
					float f_313_ = ((float) (anIntArray9461[class161.anInt1768] + anIntArray9461[class161.anInt1761] + anIntArray9461[class161.anInt1762]) * 0.3333333F);
					float f_314_ = ((float) (anIntArray9496[class161.anInt1768] + anIntArray9496[class161.anInt1761] + anIntArray9496[class161.anInt1762]) * 0.3333333F);
					float f_315_ = (class441.aFloatArray4916[0] * f + class441.aFloatArray4916[4] * f_313_ + class441.aFloatArray4916[8] * f_314_ + class441.aFloatArray4916[12]);
					float f_316_ = (class441.aFloatArray4916[1] * f + class441.aFloatArray4916[5] * f_313_ + class441.aFloatArray4916[9] * f_314_ + class441.aFloatArray4916[13]);
					float f_317_ = (class441.aFloatArray4916[2] * f + class441.aFloatArray4916[6] * f_313_ + class441.aFloatArray4916[10] * f_314_ + class441.aFloatArray4916[14]);
					float f_318_ = ((float) (1.0 / Math.sqrt((double) (f_315_ * f_315_ + f_316_ * f_316_ + f_317_ * f_317_))) * (float) class161.anInt1769);
					class441_312_.method7118(class133.anInt1574, class133.anInt1576 * class161.aShort1766 >> 7, class133.anInt1573 * class161.aShort1765 >> 7, f_315_ + (float) class133.anInt1575 - f_315_ * f_318_, f_316_ + (float) class133.anInt1572 - f_316_ * f_318_, f_317_ - f_317_ * f_318_);
					aClass178_Sub1_9486.method14824(class441_312_);
					int i_319_ = class133.anInt1577;
					OpenGL.glColor4ub((byte) (i_319_ >> 16), (byte) (i_319_ >> 8), (byte) i_319_, (byte) (i_319_ >> 24));
					aClass178_Sub1_9486.method14670(class161.aShort1763);
					aClass178_Sub1_9486.method14687(class161.aByte1760);
					aClass178_Sub1_9486.method14665(7, 0, 4);
				}
			}
			aClass178_Sub1_9486.method3287(true);
			aClass178_Sub1_9486.method14638();
		}
	}

	void method2694() {
		/* empty */
	}

	void method2703() {
		/* empty */
	}

	boolean method2702() {
		if (anIntArrayArray9463 == null)
			return false;
		for (int i = 0; i < anInt9499; i++) {
			anIntArray9460[i] <<= 4;
			anIntArray9461[i] <<= 4;
			anIntArray9496[i] <<= 4;
		}
		anInt9516 = 0;
		anInt9517 = 0;
		anInt9518 = 0;
		return true;
	}

	public int method2847() {
		if (!aBool9465)
			method14870();
		return aShort9505;
	}

	void method2705(int i, int i_320_, int i_321_, int i_322_) {
		if (i == 0) {
			int i_323_ = 0;
			anInt9516 = 0;
			anInt9517 = 0;
			anInt9518 = 0;
			for (int i_324_ = 0; i_324_ < anInt9459; i_324_++) {
				anInt9516 += anIntArray9460[i_324_];
				anInt9517 += anIntArray9461[i_324_];
				anInt9518 += anIntArray9496[i_324_];
				i_323_++;
			}
			if (i_323_ > 0) {
				anInt9516 = anInt9516 / i_323_ + i_320_;
				anInt9517 = anInt9517 / i_323_ + i_321_;
				anInt9518 = anInt9518 / i_323_ + i_322_;
			} else {
				anInt9516 = i_320_;
				anInt9517 = i_321_;
				anInt9518 = i_322_;
			}
		} else if (i == 1) {
			for (int i_325_ = 0; i_325_ < anInt9459; i_325_++) {
				anIntArray9460[i_325_] += i_320_;
				anIntArray9461[i_325_] += i_321_;
				anIntArray9496[i_325_] += i_322_;
			}
		} else if (i == 2) {
			for (int i_326_ = 0; i_326_ < anInt9459; i_326_++) {
				anIntArray9460[i_326_] -= anInt9516;
				anIntArray9461[i_326_] -= anInt9517;
				anIntArray9496[i_326_] -= anInt9518;
				if (i_322_ != 0) {
					int i_327_ = Class433.anIntArray4880[i_322_];
					int i_328_ = Class433.anIntArray4881[i_322_];
					int i_329_ = ((anIntArray9461[i_326_] * i_327_ + anIntArray9460[i_326_] * i_328_ + 16383) >> 14);
					anIntArray9461[i_326_] = (anIntArray9461[i_326_] * i_328_ - anIntArray9460[i_326_] * i_327_ + 16383) >> 14;
					anIntArray9460[i_326_] = i_329_;
				}
				if (i_320_ != 0) {
					int i_330_ = Class433.anIntArray4880[i_320_];
					int i_331_ = Class433.anIntArray4881[i_320_];
					int i_332_ = ((anIntArray9461[i_326_] * i_331_ - anIntArray9496[i_326_] * i_330_ + 16383) >> 14);
					anIntArray9496[i_326_] = (anIntArray9461[i_326_] * i_330_ + anIntArray9496[i_326_] * i_331_ + 16383) >> 14;
					anIntArray9461[i_326_] = i_332_;
				}
				if (i_321_ != 0) {
					int i_333_ = Class433.anIntArray4880[i_321_];
					int i_334_ = Class433.anIntArray4881[i_321_];
					int i_335_ = ((anIntArray9496[i_326_] * i_333_ + anIntArray9460[i_326_] * i_334_ + 16383) >> 14);
					anIntArray9496[i_326_] = (anIntArray9496[i_326_] * i_334_ - anIntArray9460[i_326_] * i_333_ + 16383) >> 14;
					anIntArray9460[i_326_] = i_335_;
				}
				anIntArray9460[i_326_] += anInt9516;
				anIntArray9461[i_326_] += anInt9517;
				anIntArray9496[i_326_] += anInt9518;
			}
		} else if (i == 3) {
			for (int i_336_ = 0; i_336_ < anInt9459; i_336_++) {
				anIntArray9460[i_336_] -= anInt9516;
				anIntArray9461[i_336_] -= anInt9517;
				anIntArray9496[i_336_] -= anInt9518;
				anIntArray9460[i_336_] = anIntArray9460[i_336_] * i_320_ / 128;
				anIntArray9461[i_336_] = anIntArray9461[i_336_] * i_321_ / 128;
				anIntArray9496[i_336_] = anIntArray9496[i_336_] * i_322_ / 128;
				anIntArray9460[i_336_] += anInt9516;
				anIntArray9461[i_336_] += anInt9517;
				anIntArray9496[i_336_] += anInt9518;
			}
		} else if (i == 5) {
			for (int i_337_ = 0; i_337_ < anInt9515; i_337_++) {
				int i_338_ = (aByteArray9476[i_337_] & 0xff) + i_320_ * 8;
				if (i_338_ < 0)
					i_338_ = 0;
				else if (i_338_ > 255)
					i_338_ = 255;
				aByteArray9476[i_337_] = (byte) i_338_;
			}
			if (aClass131_9484 != null)
				aClass131_9484.anInterface15_1558 = null;
			if (aClass161Array9508 != null) {
				for (int i_339_ = 0; i_339_ < anInt9507; i_339_++) {
					Class161 class161 = aClass161Array9508[i_339_];
					Class133 class133 = aClass133Array9479[i_339_];
					class133.anInt1577 = (class133.anInt1577 & 0xffffff | (255 - (aByteArray9476[class161.anInt1764] & 0xff) << 24));
				}
			}
		} else if (i == 7) {
			for (int i_340_ = 0; i_340_ < anInt9515; i_340_++) {
				int i_341_ = aShortArray9489[i_340_] & 0xffff;
				int i_342_ = i_341_ >> 10 & 0x3f;
				int i_343_ = i_341_ >> 7 & 0x7;
				int i_344_ = i_341_ & 0x7f;
				i_342_ = i_342_ + i_320_ & 0x3f;
				i_343_ += i_321_ / 4;
				if (i_343_ < 0)
					i_343_ = 0;
				else if (i_343_ > 7)
					i_343_ = 7;
				i_344_ += i_322_;
				if (i_344_ < 0)
					i_344_ = 0;
				else if (i_344_ > 127)
					i_344_ = 127;
				aShortArray9489[i_340_] = (short) (i_342_ << 10 | i_343_ << 7 | i_344_);
			}
			if (aClass131_9484 != null)
				aClass131_9484.anInterface15_1558 = null;
			if (aClass161Array9508 != null) {
				for (int i_345_ = 0; i_345_ < anInt9507; i_345_++) {
					Class161 class161 = aClass161Array9508[i_345_];
					Class133 class133 = aClass133Array9479[i_345_];
					class133.anInt1577 = (class133.anInt1577 & ~0xffffff | ((Class710.anIntArray8839[aShortArray9489[class161.anInt1764] & 0xffff]) & 0xffffff));
				}
			}
		} else if (i == 8) {
			for (int i_346_ = 0; i_346_ < anInt9507; i_346_++) {
				Class133 class133 = aClass133Array9479[i_346_];
				class133.anInt1575 += i_320_;
				class133.anInt1572 += i_321_;
			}
		} else if (i == 10) {
			for (int i_347_ = 0; i_347_ < anInt9507; i_347_++) {
				Class133 class133 = aClass133Array9479[i_347_];
				class133.anInt1576 = class133.anInt1576 * i_320_ >> 7;
				class133.anInt1573 = class133.anInt1573 * i_321_ >> 7;
			}
		} else if (i == 9) {
			for (int i_348_ = 0; i_348_ < anInt9507; i_348_++) {
				Class133 class133 = aClass133Array9479[i_348_];
				class133.anInt1574 = class133.anInt1574 + i_320_ & 0x3fff;
			}
		}
	}

	void method2856(int i, int[] is, int i_349_, int i_350_, int i_351_, int i_352_, boolean bool) {
		int i_353_ = is.length;
		if (i == 0) {
			i_349_ <<= 4;
			i_350_ <<= 4;
			i_351_ <<= 4;
			int i_354_ = 0;
			anInt9516 = 0;
			anInt9517 = 0;
			anInt9518 = 0;
			for (int i_355_ = 0; i_355_ < i_353_; i_355_++) {
				int i_356_ = is[i_355_];
				if (i_356_ < anIntArrayArray9463.length) {
					int[] is_357_ = anIntArrayArray9463[i_356_];
					for (int i_358_ = 0; i_358_ < is_357_.length; i_358_++) {
						int i_359_ = is_357_[i_358_];
						anInt9516 += anIntArray9460[i_359_];
						anInt9517 += anIntArray9461[i_359_];
						anInt9518 += anIntArray9496[i_359_];
						i_354_++;
					}
				}
			}
			if (i_354_ > 0) {
				anInt9516 = anInt9516 / i_354_ + i_349_;
				anInt9517 = anInt9517 / i_354_ + i_350_;
				anInt9518 = anInt9518 / i_354_ + i_351_;
			} else {
				anInt9516 = i_349_;
				anInt9517 = i_350_;
				anInt9518 = i_351_;
			}
		} else if (i == 1) {
			i_349_ <<= 4;
			i_350_ <<= 4;
			i_351_ <<= 4;
			for (int i_360_ = 0; i_360_ < i_353_; i_360_++) {
				int i_361_ = is[i_360_];
				if (i_361_ < anIntArrayArray9463.length) {
					int[] is_362_ = anIntArrayArray9463[i_361_];
					for (int i_363_ = 0; i_363_ < is_362_.length; i_363_++) {
						int i_364_ = is_362_[i_363_];
						anIntArray9460[i_364_] += i_349_;
						anIntArray9461[i_364_] += i_350_;
						anIntArray9496[i_364_] += i_351_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_365_ = 0; i_365_ < i_353_; i_365_++) {
				int i_366_ = is[i_365_];
				if (i_366_ < anIntArrayArray9463.length) {
					int[] is_367_ = anIntArrayArray9463[i_366_];
					if ((i_352_ & 0x1) == 0) {
						for (int i_368_ = 0; i_368_ < is_367_.length; i_368_++) {
							int i_369_ = is_367_[i_368_];
							anIntArray9460[i_369_] -= anInt9516;
							anIntArray9461[i_369_] -= anInt9517;
							anIntArray9496[i_369_] -= anInt9518;
							if (i_351_ != 0) {
								int i_370_ = Class433.anIntArray4880[i_351_];
								int i_371_ = Class433.anIntArray4881[i_351_];
								int i_372_ = (anIntArray9461[i_369_] * i_370_ + anIntArray9460[i_369_] * i_371_ + 16383) >> 14;
								anIntArray9461[i_369_] = (anIntArray9461[i_369_] * i_371_ - anIntArray9460[i_369_] * i_370_ + 16383) >> 14;
								anIntArray9460[i_369_] = i_372_;
							}
							if (i_349_ != 0) {
								int i_373_ = Class433.anIntArray4880[i_349_];
								int i_374_ = Class433.anIntArray4881[i_349_];
								int i_375_ = (anIntArray9461[i_369_] * i_374_ - anIntArray9496[i_369_] * i_373_ + 16383) >> 14;
								anIntArray9496[i_369_] = (anIntArray9461[i_369_] * i_373_ + anIntArray9496[i_369_] * i_374_ + 16383) >> 14;
								anIntArray9461[i_369_] = i_375_;
							}
							if (i_350_ != 0) {
								int i_376_ = Class433.anIntArray4880[i_350_];
								int i_377_ = Class433.anIntArray4881[i_350_];
								int i_378_ = (anIntArray9496[i_369_] * i_376_ + anIntArray9460[i_369_] * i_377_ + 16383) >> 14;
								anIntArray9496[i_369_] = (anIntArray9496[i_369_] * i_377_ - anIntArray9460[i_369_] * i_376_ + 16383) >> 14;
								anIntArray9460[i_369_] = i_378_;
							}
							anIntArray9460[i_369_] += anInt9516;
							anIntArray9461[i_369_] += anInt9517;
							anIntArray9496[i_369_] += anInt9518;
						}
					} else {
						for (int i_379_ = 0; i_379_ < is_367_.length; i_379_++) {
							int i_380_ = is_367_[i_379_];
							anIntArray9460[i_380_] -= anInt9516;
							anIntArray9461[i_380_] -= anInt9517;
							anIntArray9496[i_380_] -= anInt9518;
							if (i_349_ != 0) {
								int i_381_ = Class433.anIntArray4880[i_349_];
								int i_382_ = Class433.anIntArray4881[i_349_];
								int i_383_ = (anIntArray9461[i_380_] * i_382_ - anIntArray9496[i_380_] * i_381_ + 16383) >> 14;
								anIntArray9496[i_380_] = (anIntArray9461[i_380_] * i_381_ + anIntArray9496[i_380_] * i_382_ + 16383) >> 14;
								anIntArray9461[i_380_] = i_383_;
							}
							if (i_351_ != 0) {
								int i_384_ = Class433.anIntArray4880[i_351_];
								int i_385_ = Class433.anIntArray4881[i_351_];
								int i_386_ = (anIntArray9461[i_380_] * i_384_ + anIntArray9460[i_380_] * i_385_ + 16383) >> 14;
								anIntArray9461[i_380_] = (anIntArray9461[i_380_] * i_385_ - anIntArray9460[i_380_] * i_384_ + 16383) >> 14;
								anIntArray9460[i_380_] = i_386_;
							}
							if (i_350_ != 0) {
								int i_387_ = Class433.anIntArray4880[i_350_];
								int i_388_ = Class433.anIntArray4881[i_350_];
								int i_389_ = (anIntArray9496[i_380_] * i_387_ + anIntArray9460[i_380_] * i_388_ + 16383) >> 14;
								anIntArray9496[i_380_] = (anIntArray9496[i_380_] * i_388_ - anIntArray9460[i_380_] * i_387_ + 16383) >> 14;
								anIntArray9460[i_380_] = i_389_;
							}
							anIntArray9460[i_380_] += anInt9516;
							anIntArray9461[i_380_] += anInt9517;
							anIntArray9496[i_380_] += anInt9518;
						}
					}
				}
			}
			if (bool) {
				for (int i_390_ = 0; i_390_ < i_353_; i_390_++) {
					int i_391_ = is[i_390_];
					if (i_391_ < anIntArrayArray9463.length) {
						int[] is_392_ = anIntArrayArray9463[i_391_];
						for (int i_393_ = 0; i_393_ < is_392_.length; i_393_++) {
							int i_394_ = is_392_[i_393_];
							int i_395_ = anIntArray9503[i_394_];
							int i_396_ = anIntArray9503[i_394_ + 1];
							for (int i_397_ = i_395_; (i_397_ < i_396_ && aShortArray9504[i_397_] != 0); i_397_++) {
								int i_398_ = (aShortArray9504[i_397_] & 0xffff) - 1;
								if (i_351_ != 0) {
									int i_399_ = Class433.anIntArray4880[i_351_];
									int i_400_ = Class433.anIntArray4881[i_351_];
									int i_401_ = ((aShortArray9467[i_398_] * i_399_ + aShortArray9493[i_398_] * i_400_ + 16383) >> 14);
									aShortArray9467[i_398_] = (short) (((aShortArray9467[i_398_] * i_400_) - (aShortArray9493[i_398_] * i_399_) + 16383) >> 14);
									aShortArray9493[i_398_] = (short) i_401_;
								}
								if (i_349_ != 0) {
									int i_402_ = Class433.anIntArray4880[i_349_];
									int i_403_ = Class433.anIntArray4881[i_349_];
									int i_404_ = ((aShortArray9467[i_398_] * i_403_ - aShortArray9468[i_398_] * i_402_ + 16383) >> 14);
									aShortArray9468[i_398_] = (short) (((aShortArray9467[i_398_] * i_402_) + (aShortArray9468[i_398_] * i_403_) + 16383) >> 14);
									aShortArray9467[i_398_] = (short) i_404_;
								}
								if (i_350_ != 0) {
									int i_405_ = Class433.anIntArray4880[i_350_];
									int i_406_ = Class433.anIntArray4881[i_350_];
									int i_407_ = ((aShortArray9468[i_398_] * i_405_ + aShortArray9493[i_398_] * i_406_ + 16383) >> 14);
									aShortArray9468[i_398_] = (short) (((aShortArray9468[i_398_] * i_406_) - (aShortArray9493[i_398_] * i_405_) + 16383) >> 14);
									aShortArray9493[i_398_] = (short) i_407_;
								}
							}
						}
					}
				}
				if (aClass131_9485 == null && aClass131_9484 != null)
					aClass131_9484.anInterface15_1558 = null;
				if (aClass131_9485 != null)
					aClass131_9485.anInterface15_1558 = null;
			}
		} else if (i == 3) {
			for (int i_408_ = 0; i_408_ < i_353_; i_408_++) {
				int i_409_ = is[i_408_];
				if (i_409_ < anIntArrayArray9463.length) {
					int[] is_410_ = anIntArrayArray9463[i_409_];
					for (int i_411_ = 0; i_411_ < is_410_.length; i_411_++) {
						int i_412_ = is_410_[i_411_];
						anIntArray9460[i_412_] -= anInt9516;
						anIntArray9461[i_412_] -= anInt9517;
						anIntArray9496[i_412_] -= anInt9518;
						anIntArray9460[i_412_] = anIntArray9460[i_412_] * i_349_ >> 7;
						anIntArray9461[i_412_] = anIntArray9461[i_412_] * i_350_ >> 7;
						anIntArray9496[i_412_] = anIntArray9496[i_412_] * i_351_ >> 7;
						anIntArray9460[i_412_] += anInt9516;
						anIntArray9461[i_412_] += anInt9517;
						anIntArray9496[i_412_] += anInt9518;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9475 != null) {
				for (int i_413_ = 0; i_413_ < i_353_; i_413_++) {
					int i_414_ = is[i_413_];
					if (i_414_ < anIntArrayArray9475.length) {
						int[] is_415_ = anIntArrayArray9475[i_414_];
						for (int i_416_ = 0; i_416_ < is_415_.length; i_416_++) {
							int i_417_ = is_415_[i_416_];
							int i_418_ = (aByteArray9476[i_417_] & 0xff) + i_349_ * 8;
							if (i_418_ < 0)
								i_418_ = 0;
							else if (i_418_ > 255)
								i_418_ = 255;
							aByteArray9476[i_417_] = (byte) i_418_;
						}
						if (is_415_.length > 0 && aClass131_9484 != null)
							aClass131_9484.anInterface15_1558 = null;
					}
				}
				if (aClass161Array9508 != null) {
					for (int i_419_ = 0; i_419_ < anInt9507; i_419_++) {
						Class161 class161 = aClass161Array9508[i_419_];
						Class133 class133 = aClass133Array9479[i_419_];
						class133.anInt1577 = (class133.anInt1577 & 0xffffff | 255 - (aByteArray9476[class161.anInt1764] & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9475 != null) {
				for (int i_420_ = 0; i_420_ < i_353_; i_420_++) {
					int i_421_ = is[i_420_];
					if (i_421_ < anIntArrayArray9475.length) {
						int[] is_422_ = anIntArrayArray9475[i_421_];
						for (int i_423_ = 0; i_423_ < is_422_.length; i_423_++) {
							int i_424_ = is_422_[i_423_];
							int i_425_ = aShortArray9489[i_424_] & 0xffff;
							int i_426_ = i_425_ >> 10 & 0x3f;
							int i_427_ = i_425_ >> 7 & 0x7;
							int i_428_ = i_425_ & 0x7f;
							i_426_ = i_426_ + i_349_ & 0x3f;
							i_427_ += i_350_ / 4;
							if (i_427_ < 0)
								i_427_ = 0;
							else if (i_427_ > 7)
								i_427_ = 7;
							i_428_ += i_351_;
							if (i_428_ < 0)
								i_428_ = 0;
							else if (i_428_ > 127)
								i_428_ = 127;
							aShortArray9489[i_424_] = (short) (i_426_ << 10 | i_427_ << 7 | i_428_);
						}
						if (is_422_.length > 0 && aClass131_9484 != null)
							aClass131_9484.anInterface15_1558 = null;
					}
				}
				if (aClass161Array9508 != null) {
					for (int i_429_ = 0; i_429_ < anInt9507; i_429_++) {
						Class161 class161 = aClass161Array9508[i_429_];
						Class133 class133 = aClass133Array9479[i_429_];
						class133.anInt1577 = (class133.anInt1577 & ~0xffffff | (Class710.anIntArray8839[(aShortArray9489[class161.anInt1764] & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9480 != null) {
				for (int i_430_ = 0; i_430_ < i_353_; i_430_++) {
					int i_431_ = is[i_430_];
					if (i_431_ < anIntArrayArray9480.length) {
						int[] is_432_ = anIntArrayArray9480[i_431_];
						for (int i_433_ = 0; i_433_ < is_432_.length; i_433_++) {
							Class133 class133 = aClass133Array9479[is_432_[i_433_]];
							class133.anInt1575 += i_349_;
							class133.anInt1572 += i_350_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9480 != null) {
				for (int i_434_ = 0; i_434_ < i_353_; i_434_++) {
					int i_435_ = is[i_434_];
					if (i_435_ < anIntArrayArray9480.length) {
						int[] is_436_ = anIntArrayArray9480[i_435_];
						for (int i_437_ = 0; i_437_ < is_436_.length; i_437_++) {
							Class133 class133 = aClass133Array9479[is_436_[i_437_]];
							class133.anInt1576 = class133.anInt1576 * i_349_ >> 7;
							class133.anInt1573 = class133.anInt1573 * i_350_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9480 != null) {
				for (int i_438_ = 0; i_438_ < i_353_; i_438_++) {
					int i_439_ = is[i_438_];
					if (i_439_ < anIntArrayArray9480.length) {
						int[] is_440_ = anIntArrayArray9480[i_439_];
						for (int i_441_ = 0; i_441_ < is_440_.length; i_441_++) {
							Class133 class133 = aClass133Array9479[is_440_[i_441_]];
							class133.anInt1574 = class133.anInt1574 + i_349_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	void method2819() {
		for (int i = 0; i < anInt9499; i++) {
			anIntArray9460[i] = anIntArray9460[i] + 7 >> 4;
			anIntArray9461[i] = anIntArray9461[i] + 7 >> 4;
			anIntArray9496[i] = anIntArray9496[i] + 7 >> 4;
		}
		if (aClass131_9481 != null)
			aClass131_9481.anInterface15_1558 = null;
		aBool9465 = false;
	}

	public void method2707(Class435 class435, int i, boolean bool) {
		if (aShortArray9466 != null) {
			Class435 class435_442_ = class435;
			if (bool) {
				class435_442_ = aClass178_Sub1_9486.aClass435_9331;
				class435_442_.method6824(class435);
			}
			float[] fs = new float[3];
			for (int i_443_ = 0; i_443_ < anInt9459; i_443_++) {
				if ((i & aShortArray9466[i_443_]) != 0) {
					class435_442_.method6858((float) anIntArray9460[i_443_], (float) anIntArray9461[i_443_], (float) anIntArray9496[i_443_], fs);
					anIntArray9460[i_443_] = (int) fs[0];
					anIntArray9461[i_443_] = (int) fs[1];
					anIntArray9496[i_443_] = (int) fs[2];
				}
			}
		}
	}

	public Class143[] method2734() {
		return aClass143Array9506;
	}

	public void method2762(int i, int i_444_, Class142 class142, Class142 class142_445_, int i_446_, int i_447_, int i_448_) {
		if (!aBool9465)
			method14870();
		int i_449_ = i_446_ + aShort9471;
		int i_450_ = i_446_ + aShort9497;
		int i_451_ = i_448_ + aShort9498;
		int i_452_ = i_448_ + aShort9491;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_449_ >= 0 && ((i_450_ + class142.anInt1682 * 341909049 >> class142.anInt1680 * -1193058675) < class142.anInt1683 * 692304099) && i_451_ >= 0 && ((i_452_ + class142.anInt1682 * 341909049 >> class142.anInt1680 * -1193058675) < class142.anInt1681 * 452998539))) {
			if (i == 4 || i == 5) {
				if (class142_445_ == null || (i_449_ < 0 || ((i_450_ + class142_445_.anInt1682 * 341909049 >> class142_445_.anInt1680 * -1193058675) >= class142_445_.anInt1683 * 692304099) || i_451_ < 0 || ((i_452_ + class142_445_.anInt1682 * 341909049 >> class142_445_.anInt1680 * -1193058675) >= class142_445_.anInt1681 * 452998539)))
					return;
			} else {
				i_449_ >>= class142.anInt1680 * -1193058675;
				i_450_ = (i_450_ + (class142.anInt1682 * 341909049 - 1) >> class142.anInt1680 * -1193058675);
				i_451_ >>= class142.anInt1680 * -1193058675;
				i_452_ = (i_452_ + (class142.anInt1682 * 341909049 - 1) >> class142.anInt1680 * -1193058675);
				if (class142.method2321(i_449_, i_451_, 2045842301) == i_447_ && (class142.method2321(i_450_, i_451_, 1889873282) == i_447_) && (class142.method2321(i_449_, i_452_, 1539990451) == i_447_) && (class142.method2321(i_450_, i_452_, 2091177414) == i_447_))
					return;
			}
			if (i == 1) {
				for (int i_453_ = 0; i_453_ < anInt9459; i_453_++)
					anIntArray9461[i_453_] = (anIntArray9461[i_453_] + class142.method2327((anIntArray9460[i_453_] + i_446_), (anIntArray9496[i_453_] + i_448_), -563159995) - i_447_);
			} else if (i == 2) {
				int i_454_ = aShort9494;
				if (i_454_ == 0)
					return;
				for (int i_455_ = 0; i_455_ < anInt9459; i_455_++) {
					int i_456_ = (anIntArray9461[i_455_] << 16) / i_454_;
					if (i_456_ < i_444_)
						anIntArray9461[i_455_] = (anIntArray9461[i_455_] + (class142.method2327((anIntArray9460[i_455_] + i_446_), (anIntArray9496[i_455_] + i_448_), -149186276) - i_447_) * (i_444_ - i_456_) / i_444_);
				}
			} else if (i == 3) {
				int i_457_ = (i_444_ & 0xff) * 16;
				int i_458_ = (i_444_ >> 8 & 0xff) * 16;
				int i_459_ = (i_444_ >> 16 & 0xff) << 6;
				int i_460_ = (i_444_ >> 24 & 0xff) << 6;
				if (i_446_ - (i_457_ >> 1) < 0 || (i_446_ + (i_457_ >> 1) + class142.anInt1682 * 341909049 >= (class142.anInt1683 * 692304099 << class142.anInt1680 * -1193058675)) || i_448_ - (i_458_ >> 1) < 0 || (i_448_ + (i_458_ >> 1) + class142.anInt1682 * 341909049 >= (class142.anInt1681 * 452998539 << class142.anInt1680 * -1193058675)))
					return;
				method2693(class142, i_446_, i_447_, i_448_, i_457_, i_458_, i_459_, i_460_);
			} else if (i == 4) {
				int i_461_ = aShort9505 - aShort9494;
				for (int i_462_ = 0; i_462_ < anInt9459; i_462_++)
					anIntArray9461[i_462_] = (anIntArray9461[i_462_] + (class142_445_.method2327((anIntArray9460[i_462_] + i_446_), (anIntArray9496[i_462_] + i_448_), 976238852) - i_447_) + i_461_);
			} else if (i == 5) {
				int i_463_ = aShort9505 - aShort9494;
				for (int i_464_ = 0; i_464_ < anInt9459; i_464_++) {
					int i_465_ = anIntArray9460[i_464_] + i_446_;
					int i_466_ = anIntArray9496[i_464_] + i_448_;
					int i_467_ = class142.method2327(i_465_, i_466_, -1791171952);
					int i_468_ = class142_445_.method2327(i_465_, i_466_, -789458446);
					int i_469_ = i_467_ - i_468_ - i_444_;
					anIntArray9461[i_464_] = ((anIntArray9461[i_464_] << 8) / i_463_ * i_469_ >> 8) - (i_447_ - i_467_);
				}
			}
			if (aClass131_9481 != null)
				aClass131_9481.anInterface15_1558 = null;
			aBool9465 = false;
		}
	}

	public void method2732(Class435 class435) {
		Class441 class441 = aClass178_Sub1_9486.aClass441_9332;
		class441.method7090(class435);
		if (aClass184Array9449 != null) {
			for (int i = 0; i < aClass184Array9449.length; i++) {
				Class184 class184 = aClass184Array9449[i];
				Class184 class184_470_ = class184;
				if (class184.aClass184_2111 != null)
					class184_470_ = class184.aClass184_2111;
				class184_470_.anInt2117 = ((int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) anIntArray9460[(class184.anInt2113 * 1717084103)]) + (class441.aFloatArray4916[4] * (float) (anIntArray9461[(class184.anInt2113 * 1717084103)])) + (class441.aFloatArray4916[8] * (float) (anIntArray9496[(class184.anInt2113 * 1717084103)])))) * 1979506107);
				class184_470_.anInt2118 = (int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) (anIntArray9460[class184.anInt2113 * 1717084103])) + (class441.aFloatArray4916[5] * (float) anIntArray9461[(class184.anInt2113 * 1717084103)]) + (class441.aFloatArray4916[9] * (float) (anIntArray9496[(class184.anInt2113 * 1717084103)])))) * 546606927;
				class184_470_.anInt2119 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9460[(class184.anInt2113 * 1717084103)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9461[(class184.anInt2113 * 1717084103)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9496[(class184.anInt2113 * 1717084103)])))) * 1120011767);
				class184_470_.anInt2120 = (int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) (anIntArray9460[class184.anInt2114 * -615332511])) + (class441.aFloatArray4916[4] * (float) anIntArray9461[(class184.anInt2114 * -615332511)]) + (class441.aFloatArray4916[8] * (float) (anIntArray9496[(class184.anInt2114 * -615332511)])))) * 942705911;
				class184_470_.anInt2121 = (int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) (anIntArray9460[class184.anInt2114 * -615332511])) + (class441.aFloatArray4916[5] * (float) anIntArray9461[(class184.anInt2114 * -615332511)]) + (class441.aFloatArray4916[9] * (float) (anIntArray9496[(class184.anInt2114 * -615332511)])))) * 607651075;
				class184_470_.anInt2122 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9460[(class184.anInt2114 * -615332511)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9461[(class184.anInt2114 * -615332511)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9496[(class184.anInt2114 * -615332511)])))) * 2070256909);
				class184_470_.anInt2125 = (int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) (anIntArray9460[class184.anInt2115 * -648014401])) + (class441.aFloatArray4916[4] * (float) anIntArray9461[(class184.anInt2115 * -648014401)]) + (class441.aFloatArray4916[8] * (float) (anIntArray9496[(class184.anInt2115 * -648014401)])))) * 528708299;
				class184_470_.anInt2124 = (int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) (anIntArray9460[class184.anInt2115 * -648014401])) + (class441.aFloatArray4916[5] * (float) anIntArray9461[(class184.anInt2115 * -648014401)]) + (class441.aFloatArray4916[9] * (float) (anIntArray9496[(class184.anInt2115 * -648014401)])))) * 588958573;
				class184_470_.anInt2110 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9460[(class184.anInt2115 * -648014401)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9461[(class184.anInt2115 * -648014401)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9496[(class184.anInt2115 * -648014401)])))) * -342864097);
			}
		}
		if (aClass143Array9506 != null) {
			for (int i = 0; i < aClass143Array9506.length; i++) {
				Class143 class143 = aClass143Array9506[i];
				Class143 class143_471_ = class143;
				if (class143.aClass143_1687 != null)
					class143_471_ = class143.aClass143_1687;
				if (class143.aClass441_1692 != null)
					class143.aClass441_1692.method7086(class441);
				else
					class143.aClass441_1692 = new Class441(class441);
				class143_471_.anInt1689 = (int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) (anIntArray9460[class143.anInt1688 * -256753261])) + (class441.aFloatArray4916[4] * (float) anIntArray9461[(class143.anInt1688 * -256753261)]) + (class441.aFloatArray4916[8] * (float) (anIntArray9496[(class143.anInt1688 * -256753261)])))) * 246585729;
				class143_471_.anInt1690 = ((int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) anIntArray9460[(class143.anInt1688 * -256753261)]) + (class441.aFloatArray4916[5] * (float) (anIntArray9461[(class143.anInt1688 * -256753261)])) + (class441.aFloatArray4916[9] * (float) (anIntArray9496[(class143.anInt1688 * -256753261)])))) * 1541286973);
				class143_471_.anInt1691 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9460[(class143.anInt1688 * -256753261)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9461[(class143.anInt1688 * -256753261)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9496[(class143.anInt1688 * -256753261)])))) * -1727847879);
			}
		}
	}

	public boolean method2709(int i, int i_472_, Class435 class435, boolean bool, int i_473_) {
		Class441 class441 = aClass178_Sub1_9486.aClass441_9332;
		class441.method7090(class435);
		class441.method7089(aClass178_Sub1_9486.aClass441_9365);
		boolean bool_474_ = false;
		int i_475_ = 2147483647;
		int i_476_ = -2147483648;
		int i_477_ = 2147483647;
		int i_478_ = -2147483648;
		if (!aBool9465)
			method14870();
		int i_479_ = aShort9497 - aShort9471 >> 1;
		int i_480_ = aShort9505 - aShort9494 >> 1;
		int i_481_ = aShort9491 - aShort9498 >> 1;
		int i_482_ = aShort9471 + i_479_;
		int i_483_ = aShort9494 + i_480_;
		int i_484_ = aShort9498 + i_481_;
		int i_485_ = i_482_ - (i_479_ << i_473_);
		int i_486_ = i_483_ - (i_480_ << i_473_);
		int i_487_ = i_484_ - (i_481_ << i_473_);
		int i_488_ = i_482_ + (i_479_ << i_473_);
		int i_489_ = i_483_ + (i_480_ << i_473_);
		int i_490_ = i_484_ + (i_481_ << i_473_);
		anIntArray9513[0] = i_485_;
		anIntArray9514[0] = i_486_;
		anIntArray9483[0] = i_487_;
		anIntArray9513[1] = i_488_;
		anIntArray9514[1] = i_486_;
		anIntArray9483[1] = i_487_;
		anIntArray9513[2] = i_485_;
		anIntArray9514[2] = i_489_;
		anIntArray9483[2] = i_487_;
		anIntArray9513[3] = i_488_;
		anIntArray9514[3] = i_489_;
		anIntArray9483[3] = i_487_;
		anIntArray9513[4] = i_485_;
		anIntArray9514[4] = i_486_;
		anIntArray9483[4] = i_490_;
		anIntArray9513[5] = i_488_;
		anIntArray9514[5] = i_486_;
		anIntArray9483[5] = i_490_;
		anIntArray9513[6] = i_485_;
		anIntArray9514[6] = i_489_;
		anIntArray9483[6] = i_490_;
		anIntArray9513[7] = i_488_;
		anIntArray9514[7] = i_489_;
		anIntArray9483[7] = i_490_;
		for (int i_491_ = 0; i_491_ < 8; i_491_++) {
			int i_492_ = anIntArray9513[i_491_];
			int i_493_ = anIntArray9514[i_491_];
			int i_494_ = anIntArray9483[i_491_];
			float f = (class441.aFloatArray4916[2] * (float) i_492_ + class441.aFloatArray4916[6] * (float) i_493_ + class441.aFloatArray4916[10] * (float) i_494_ + class441.aFloatArray4916[14]);
			float f_495_ = (class441.aFloatArray4916[3] * (float) i_492_ + class441.aFloatArray4916[7] * (float) i_493_ + class441.aFloatArray4916[11] * (float) i_494_ + class441.aFloatArray4916[15]);
			if (f >= -f_495_) {
				float f_496_ = (class441.aFloatArray4916[0] * (float) i_492_ + class441.aFloatArray4916[4] * (float) i_493_ + class441.aFloatArray4916[8] * (float) i_494_ + class441.aFloatArray4916[12]);
				float f_497_ = (class441.aFloatArray4916[1] * (float) i_492_ + class441.aFloatArray4916[5] * (float) i_493_ + class441.aFloatArray4916[9] * (float) i_494_ + class441.aFloatArray4916[13]);
				int i_498_ = (int) (aClass178_Sub1_9486.aFloat9274 + (aClass178_Sub1_9486.aFloat9363 * f_496_ / f_495_));
				int i_499_ = (int) (aClass178_Sub1_9486.aFloat9284 + (aClass178_Sub1_9486.aFloat9326 * f_497_ / f_495_));
				if (i_498_ < i_475_)
					i_475_ = i_498_;
				if (i_498_ > i_476_)
					i_476_ = i_498_;
				if (i_499_ < i_477_)
					i_477_ = i_499_;
				if (i_499_ > i_478_)
					i_478_ = i_499_;
				bool_474_ = true;
			}
		}
		if (bool_474_ && i > i_475_ && i < i_476_ && i_472_ > i_477_ && i_472_ < i_478_) {
			if (bool)
				return true;
			if (aClass178_Sub1_9486.anIntArray9294.length < anInt9511) {
				aClass178_Sub1_9486.anIntArray9294 = new int[anInt9511];
				aClass178_Sub1_9486.anIntArray9431 = new int[anInt9511];
			}
			int[] is = aClass178_Sub1_9486.anIntArray9294;
			int[] is_500_ = aClass178_Sub1_9486.anIntArray9431;
			for (int i_501_ = 0; i_501_ < anInt9459; i_501_++) {
				int i_502_ = anIntArray9460[i_501_];
				int i_503_ = anIntArray9461[i_501_];
				int i_504_ = anIntArray9496[i_501_];
				float f = (class441.aFloatArray4916[2] * (float) i_502_ + class441.aFloatArray4916[6] * (float) i_503_ + class441.aFloatArray4916[10] * (float) i_504_ + class441.aFloatArray4916[14]);
				float f_505_ = (class441.aFloatArray4916[3] * (float) i_502_ + class441.aFloatArray4916[7] * (float) i_503_ + class441.aFloatArray4916[11] * (float) i_504_ + class441.aFloatArray4916[15]);
				if (f >= -f_505_) {
					float f_506_ = (class441.aFloatArray4916[0] * (float) i_502_ + class441.aFloatArray4916[4] * (float) i_503_ + class441.aFloatArray4916[8] * (float) i_504_ + class441.aFloatArray4916[12]);
					float f_507_ = (class441.aFloatArray4916[1] * (float) i_502_ + class441.aFloatArray4916[5] * (float) i_503_ + class441.aFloatArray4916[9] * (float) i_504_ + class441.aFloatArray4916[13]);
					int i_508_ = anIntArray9503[i_501_];
					int i_509_ = anIntArray9503[i_501_ + 1];
					for (int i_510_ = i_508_; i_510_ < i_509_ && aShortArray9504[i_510_] != 0; i_510_++) {
						int i_511_ = (aShortArray9504[i_510_] & 0xffff) - 1;
						is[i_511_] = (int) (aClass178_Sub1_9486.aFloat9274 + (aClass178_Sub1_9486.aFloat9363 * f_506_ / f_505_));
						is_500_[i_511_] = (int) (aClass178_Sub1_9486.aFloat9284 + (aClass178_Sub1_9486.aFloat9326 * f_507_ / f_505_));
					}
				} else {
					int i_512_ = anIntArray9503[i_501_];
					int i_513_ = anIntArray9503[i_501_ + 1];
					for (int i_514_ = i_512_; i_514_ < i_513_ && aShortArray9504[i_514_] != 0; i_514_++) {
						int i_515_ = (aShortArray9504[i_514_] & 0xffff) - 1;
						is[i_515_] = -999999;
					}
				}
			}
			for (int i_516_ = 0; i_516_ < anInt9515; i_516_++) {
				if (is[aShortArray9450[i_516_] & 0xffff] != -999999 && is[aShortArray9478[i_516_] & 0xffff] != -999999 && is[aShortArray9464[i_516_] & 0xffff] != -999999 && method14872(i, i_472_, is_500_[aShortArray9450[i_516_] & 0xffff], is_500_[aShortArray9478[i_516_] & 0xffff], is_500_[aShortArray9464[i_516_] & 0xffff], is[aShortArray9450[i_516_] & 0xffff], is[aShortArray9478[i_516_] & 0xffff], is[aShortArray9464[i_516_] & 0xffff]))
					return true;
			}
		}
		return false;
	}

	boolean method14872(int i, int i_517_, int i_518_, int i_519_, int i_520_, int i_521_, int i_522_, int i_523_) {
		if (i_517_ < i_518_ && i_517_ < i_519_ && i_517_ < i_520_)
			return false;
		if (i_517_ > i_518_ && i_517_ > i_519_ && i_517_ > i_520_)
			return false;
		if (i < i_521_ && i < i_522_ && i < i_523_)
			return false;
		if (i > i_521_ && i > i_522_ && i > i_523_)
			return false;
		return true;
	}

	public int method2813() {
		return aShort9455;
	}

	boolean method14873(int i, int i_524_, int i_525_, int i_526_, int i_527_, int i_528_, int i_529_, int i_530_) {
		if (i_524_ < i_525_ && i_524_ < i_526_ && i_524_ < i_527_)
			return false;
		if (i_524_ > i_525_ && i_524_ > i_526_ && i_524_ > i_527_)
			return false;
		if (i < i_528_ && i < i_529_ && i < i_530_)
			return false;
		if (i > i_528_ && i > i_529_ && i > i_530_)
			return false;
		return true;
	}

	public void method2708(Class435 class435, Class180 class180, int i) {
		if ((i & 0x2) != 0)
			OpenGL.glPolygonMode(1032, 6913);
		if (anInt9511 != 0) {
			Class441 class441 = aClass178_Sub1_9486.aClass441_9292;
			Class441 class441_531_ = aClass178_Sub1_9486.aClass441_9332;
			Class441 class441_532_ = aClass178_Sub1_9486.aClass441_9333;
			class441_531_.method7090(class435);
			class441_532_.method7086(class441_531_);
			class441_532_.method7089(aClass178_Sub1_9486.aClass441_9365);
			if (!aBool9465)
				method14870();
			float[] fs = aClass178_Sub1_9486.aFloatArray9322;
			class441_531_.method7185(0.0F, (float) aShort9494, 0.0F, fs);
			float f = fs[0];
			float f_533_ = fs[1];
			float f_534_ = fs[2];
			class441_531_.method7185(0.0F, (float) aShort9505, 0.0F, fs);
			float f_535_ = fs[0];
			float f_536_ = fs[1];
			float f_537_ = fs[2];
			for (int i_538_ = 0; i_538_ < 6; i_538_++) {
				float[] fs_539_ = aClass178_Sub1_9486.aFloatArrayArray9415[i_538_];
				float f_540_ = (fs_539_[0] * f + fs_539_[1] * f_533_ + fs_539_[2] * f_534_ + fs_539_[3] + (float) anInt9492);
				float f_541_ = (fs_539_[0] * f_535_ + fs_539_[1] * f_536_ + fs_539_[2] * f_537_ + fs_539_[3] + (float) anInt9492);
				if (f_540_ < 0.0F && f_541_ < 0.0F)
					return;
			}
			if (class180 != null) {
				boolean bool = false;
				boolean bool_542_ = true;
				int i_543_ = aShort9471 + aShort9497 >> 1;
				int i_544_ = aShort9498 + aShort9491 >> 1;
				int i_545_ = i_543_;
				short i_546_ = aShort9494;
				int i_547_ = i_544_;
				float f_548_ = (class441_532_.aFloatArray4916[0] * (float) i_545_ + class441_532_.aFloatArray4916[4] * (float) i_546_ + class441_532_.aFloatArray4916[8] * (float) i_547_ + class441_532_.aFloatArray4916[12]);
				float f_549_ = (class441_532_.aFloatArray4916[1] * (float) i_545_ + class441_532_.aFloatArray4916[5] * (float) i_546_ + class441_532_.aFloatArray4916[9] * (float) i_547_ + class441_532_.aFloatArray4916[13]);
				float f_550_ = (class441_532_.aFloatArray4916[2] * (float) i_545_ + class441_532_.aFloatArray4916[6] * (float) i_546_ + class441_532_.aFloatArray4916[10] * (float) i_547_ + class441_532_.aFloatArray4916[14]);
				float f_551_ = (class441_532_.aFloatArray4916[3] * (float) i_545_ + class441_532_.aFloatArray4916[7] * (float) i_546_ + class441_532_.aFloatArray4916[11] * (float) i_547_ + class441_532_.aFloatArray4916[15]);
				if (f_550_ >= -f_551_) {
					class180.anInt1999 = (int) (aClass178_Sub1_9486.aFloat9274 + (aClass178_Sub1_9486.aFloat9363 * f_548_ / f_551_));
					class180.anInt2002 = (int) (aClass178_Sub1_9486.aFloat9284 + (aClass178_Sub1_9486.aFloat9326 * f_549_ / f_551_));
				} else
					bool = true;
				i_545_ = i_543_;
				i_546_ = aShort9505;
				i_547_ = i_544_;
				float f_552_ = (class441_532_.aFloatArray4916[0] * (float) i_545_ + class441_532_.aFloatArray4916[4] * (float) i_546_ + class441_532_.aFloatArray4916[8] * (float) i_547_ + class441_532_.aFloatArray4916[12]);
				float f_553_ = (class441_532_.aFloatArray4916[1] * (float) i_545_ + class441_532_.aFloatArray4916[5] * (float) i_546_ + class441_532_.aFloatArray4916[9] * (float) i_547_ + class441_532_.aFloatArray4916[13]);
				float f_554_ = (class441_532_.aFloatArray4916[2] * (float) i_545_ + class441_532_.aFloatArray4916[6] * (float) i_546_ + class441_532_.aFloatArray4916[10] * (float) i_547_ + class441_532_.aFloatArray4916[14]);
				float f_555_ = (class441_532_.aFloatArray4916[3] * (float) i_545_ + class441_532_.aFloatArray4916[7] * (float) i_546_ + class441_532_.aFloatArray4916[11] * (float) i_547_ + class441_532_.aFloatArray4916[15]);
				if (f_554_ >= -f_555_) {
					class180.anInt1998 = (int) (aClass178_Sub1_9486.aFloat9274 + (aClass178_Sub1_9486.aFloat9363 * f_552_ / f_555_));
					class180.anInt2003 = (int) (aClass178_Sub1_9486.aFloat9284 + (aClass178_Sub1_9486.aFloat9326 * f_553_ / f_555_));
				} else
					bool = true;
				if (bool) {
					if (f_550_ < -f_551_ && f_554_ < -f_555_)
						bool_542_ = false;
					else if (f_550_ < -f_551_) {
						float f_556_ = (f_550_ + f_551_) / (f_554_ + f_555_) - 1.0F;
						float f_557_ = f_548_ + f_556_ * (f_552_ - f_548_);
						float f_558_ = f_549_ + f_556_ * (f_553_ - f_549_);
						float f_559_ = f_551_ + f_556_ * (f_555_ - f_551_);
						class180.anInt1999 = (int) (aClass178_Sub1_9486.aFloat9274 + (aClass178_Sub1_9486.aFloat9363 * f_557_ / f_559_));
						class180.anInt2002 = (int) (aClass178_Sub1_9486.aFloat9284 + (aClass178_Sub1_9486.aFloat9326 * f_558_ / f_559_));
					} else if (f_554_ < -f_555_) {
						float f_560_ = (f_554_ + f_555_) / (f_550_ + f_551_) - 1.0F;
						float f_561_ = f_552_ + f_560_ * (f_548_ - f_552_);
						float f_562_ = f_553_ + f_560_ * (f_549_ - f_553_);
						float f_563_ = f_555_ + f_560_ * (f_551_ - f_555_);
						class180.anInt1998 = (int) (aClass178_Sub1_9486.aFloat9274 + (aClass178_Sub1_9486.aFloat9363 * f_561_ / f_563_));
						class180.anInt2003 = (int) (aClass178_Sub1_9486.aFloat9284 + (aClass178_Sub1_9486.aFloat9326 * f_562_ / f_563_));
					}
				}
				if (bool_542_) {
					if (f_550_ / f_551_ > f_554_ / f_555_) {
						float f_564_ = (f_548_ + (class441.aFloatArray4916[0] * (float) anInt9492) + class441.aFloatArray4916[12]);
						float f_565_ = (f_551_ + (class441.aFloatArray4916[3] * (float) anInt9492) + class441.aFloatArray4916[15]);
						class180.anInt2001 = (int) (aClass178_Sub1_9486.aFloat9274 - (float) class180.anInt1999 + (aClass178_Sub1_9486.aFloat9363 * f_564_ / f_565_));
					} else {
						float f_566_ = (f_552_ + (class441.aFloatArray4916[0] * (float) anInt9492) + class441.aFloatArray4916[12]);
						float f_567_ = (f_555_ + (class441.aFloatArray4916[3] * (float) anInt9492) + class441.aFloatArray4916[15]);
						class180.anInt2001 = (int) (aClass178_Sub1_9486.aFloat9274 - (float) class180.anInt1998 + (aClass178_Sub1_9486.aFloat9363 * f_566_ / f_567_));
					}
					class180.aBool2000 = true;
				}
			}
			aClass178_Sub1_9486.method14619();
			aClass178_Sub1_9486.method14637(class441_531_);
			method14874();
			aClass178_Sub1_9486.method14638();
			class441_531_.method7089(aClass178_Sub1_9486.aClass441_9316);
			method14875(class441_531_);
			if ((i & 0x2) != 0)
				OpenGL.glPolygonMode(1028, 6914);
		}
	}

	void method14874() {
		if (anInt9474 != 0) {
			if (aByte9454 != 0)
				method14876(true);
			method14876(false);
			if (aClass119_9509 != null) {
				if (aClass119_9509.anInterface18_1474 == null)
					method14868((aByte9454 & 0x10) != 0);
				if (aClass119_9509.anInterface18_1474 != null) {
					aClass178_Sub1_9486.method14682(aClass131_9485 != null);
					aClass178_Sub1_9486.method14664(aClass131_9481, aClass131_9485, aClass131_9484, aClass131_9457);
					int i = anIntArray9502.length - 1;
					for (int i_568_ = 0; i_568_ < i; i_568_++) {
						int i_569_ = anIntArray9502[i_568_];
						int i_570_ = anIntArray9502[i_568_ + 1];
						int i_571_ = (aShortArray9473[i_569_] == -1 ? -1 : aShortArray9473[i_569_] & 0xffff);
						aClass178_Sub1_9486.method14836(i_571_, aClass131_9485 != null);
						aClass178_Sub1_9486.method14652((aClass119_9509.anInterface18_1474), 4, i_569_ * 3, (i_570_ - i_569_) * 3);
					}
				}
			}
			method14882();
		}
	}

	void method14875(Class441 class441) {
		if (aClass161Array9508 != null) {
			Class441 class441_572_ = aClass178_Sub1_9486.aClass441_9362;
			aClass178_Sub1_9486.method14636();
			aClass178_Sub1_9486.method3287(!aBool9456);
			aClass178_Sub1_9486.method14682(false);
			aClass178_Sub1_9486.method14664(aClass178_Sub1_9486.aClass131_9370, null, null, (aClass178_Sub1_9486.aClass131_9425));
			for (int i = 0; i < anInt9507; i++) {
				Class161 class161 = aClass161Array9508[i];
				Class133 class133 = aClass133Array9479[i];
				if (!class161.aBool1767 || !aClass178_Sub1_9486.method3146()) {
					float f = ((float) (anIntArray9460[class161.anInt1768] + anIntArray9460[class161.anInt1761] + anIntArray9460[class161.anInt1762]) * 0.3333333F);
					float f_573_ = ((float) (anIntArray9461[class161.anInt1768] + anIntArray9461[class161.anInt1761] + anIntArray9461[class161.anInt1762]) * 0.3333333F);
					float f_574_ = ((float) (anIntArray9496[class161.anInt1768] + anIntArray9496[class161.anInt1761] + anIntArray9496[class161.anInt1762]) * 0.3333333F);
					float f_575_ = (class441.aFloatArray4916[0] * f + class441.aFloatArray4916[4] * f_573_ + class441.aFloatArray4916[8] * f_574_ + class441.aFloatArray4916[12]);
					float f_576_ = (class441.aFloatArray4916[1] * f + class441.aFloatArray4916[5] * f_573_ + class441.aFloatArray4916[9] * f_574_ + class441.aFloatArray4916[13]);
					float f_577_ = (class441.aFloatArray4916[2] * f + class441.aFloatArray4916[6] * f_573_ + class441.aFloatArray4916[10] * f_574_ + class441.aFloatArray4916[14]);
					float f_578_ = ((float) (1.0 / Math.sqrt((double) (f_575_ * f_575_ + f_576_ * f_576_ + f_577_ * f_577_))) * (float) class161.anInt1769);
					class441_572_.method7118(class133.anInt1574, class133.anInt1576 * class161.aShort1766 >> 7, class133.anInt1573 * class161.aShort1765 >> 7, f_575_ + (float) class133.anInt1575 - f_575_ * f_578_, f_576_ + (float) class133.anInt1572 - f_576_ * f_578_, f_577_ - f_577_ * f_578_);
					aClass178_Sub1_9486.method14824(class441_572_);
					int i_579_ = class133.anInt1577;
					OpenGL.glColor4ub((byte) (i_579_ >> 16), (byte) (i_579_ >> 8), (byte) i_579_, (byte) (i_579_ >> 24));
					aClass178_Sub1_9486.method14670(class161.aShort1763);
					aClass178_Sub1_9486.method14687(class161.aByte1760);
					aClass178_Sub1_9486.method14665(7, 0, 4);
				}
			}
			aClass178_Sub1_9486.method3287(true);
			aClass178_Sub1_9486.method14638();
		}
	}

	public void method2724(int i) {
		int i_580_ = Class433.anIntArray4880[i];
		int i_581_ = Class433.anIntArray4881[i];
		for (int i_582_ = 0; i_582_ < anInt9459; i_582_++) {
			int i_583_ = ((anIntArray9461[i_582_] * i_581_ - anIntArray9496[i_582_] * i_580_) >> 14);
			anIntArray9496[i_582_] = (anIntArray9461[i_582_] * i_580_ + anIntArray9496[i_582_] * i_581_) >> 14;
			anIntArray9461[i_582_] = i_583_;
		}
		if (aClass131_9481 != null)
			aClass131_9481.anInterface15_1558 = null;
		aBool9465 = false;
	}

	void method14876(boolean bool) {
		boolean bool_584_ = (aClass131_9484 != null && aClass131_9484.anInterface15_1558 == null);
		boolean bool_585_ = (aClass131_9485 != null && aClass131_9485.anInterface15_1558 == null);
		boolean bool_586_ = (aClass131_9481 != null && aClass131_9481.anInterface15_1558 == null);
		boolean bool_587_ = (aClass131_9457 != null && aClass131_9457.anInterface15_1558 == null);
		if (bool) {
			bool_584_ = bool_584_ & (aByte9454 & 0x2) != 0;
			bool_585_ = bool_585_ & (aByte9454 & 0x4) != 0;
			bool_586_ = bool_586_ & (aByte9454 & 0x1) != 0;
			bool_587_ = bool_587_ & (aByte9454 & 0x8) != 0;
		}
		byte i = 0;
		byte i_588_ = 0;
		byte i_589_ = 0;
		byte i_590_ = 0;
		byte i_591_ = 0;
		if (bool_586_) {
			i_588_ = i;
			i += 12;
		}
		if (bool_584_) {
			i_589_ = i;
			i += 4;
		}
		if (bool_585_) {
			i_590_ = i;
			i += 12;
		}
		if (bool_587_) {
			i_591_ = i;
			i += 8;
		}
		if (i != 0) {
			if ((aClass178_Sub1_9486.aClass523_Sub34_Sub1_9321.aByteArray10658).length < anInt9511 * i)
				aClass178_Sub1_9486.aClass523_Sub34_Sub1_9321 = new Class523_Sub34_Sub1((anInt9511 + 100) * i);
			else
				aClass178_Sub1_9486.aClass523_Sub34_Sub1_9321.anInt10661 = 0;
			Class523_Sub34_Sub1 class523_sub34_sub1 = aClass178_Sub1_9486.aClass523_Sub34_Sub1_9321;
			if (bool_586_) {
				if (aClass178_Sub1_9486.aBool9393) {
					for (int i_592_ = 0; i_592_ < anInt9459; i_592_++) {
						int i_593_ = Stream.floatToRawIntBits((float) anIntArray9460[i_592_]);
						int i_594_ = Stream.floatToRawIntBits((float) anIntArray9461[i_592_]);
						int i_595_ = Stream.floatToRawIntBits((float) anIntArray9496[i_592_]);
						int i_596_ = anIntArray9503[i_592_];
						int i_597_ = anIntArray9503[i_592_ + 1];
						for (int i_598_ = i_596_; i_598_ < i_597_ && aShortArray9504[i_598_] != 0; i_598_++) {
							int i_599_ = (aShortArray9504[i_598_] & 0xffff) - 1;
							class523_sub34_sub1.anInt10661 = i_599_ * i * 189765723;
							class523_sub34_sub1.writeInt(i_593_, -1731662892);
							class523_sub34_sub1.writeInt(i_594_, -1047474972);
							class523_sub34_sub1.writeInt(i_595_, -973430400);
						}
					}
				} else {
					for (int i_600_ = 0; i_600_ < anInt9459; i_600_++) {
						int i_601_ = Stream.floatToRawIntBits((float) anIntArray9460[i_600_]);
						int i_602_ = Stream.floatToRawIntBits((float) anIntArray9461[i_600_]);
						int i_603_ = Stream.floatToRawIntBits((float) anIntArray9496[i_600_]);
						int i_604_ = anIntArray9503[i_600_];
						int i_605_ = anIntArray9503[i_600_ + 1];
						for (int i_606_ = i_604_; i_606_ < i_605_ && aShortArray9504[i_606_] != 0; i_606_++) {
							int i_607_ = (aShortArray9504[i_606_] & 0xffff) - 1;
							class523_sub34_sub1.anInt10661 = i_607_ * i * 189765723;
							class523_sub34_sub1.method16265(i_601_, (short) 6181);
							class523_sub34_sub1.method16265(i_602_, (short) 15849);
							class523_sub34_sub1.method16265(i_603_, (short) 28880);
						}
					}
				}
			}
			if (bool_584_) {
				if (aClass131_9485 == null) {
					short[] is;
					short[] is_608_;
					short[] is_609_;
					byte[] is_610_;
					if (aClass151_9470 != null) {
						is = aClass151_9470.aShortArray1729;
						is_608_ = aClass151_9470.aShortArray1726;
						is_609_ = aClass151_9470.aShortArray1728;
						is_610_ = aClass151_9470.aByteArray1727;
					} else {
						is = aShortArray9493;
						is_608_ = aShortArray9467;
						is_609_ = aShortArray9468;
						is_610_ = aByteArray9487;
					}
					float f = aClass178_Sub1_9486.aFloatArray9277[0];
					float f_611_ = aClass178_Sub1_9486.aFloatArray9277[1];
					float f_612_ = aClass178_Sub1_9486.aFloatArray9277[2];
					float f_613_ = aClass178_Sub1_9486.aFloat9359;
					float f_614_ = (aClass178_Sub1_9486.aFloat9343 * 768.0F / (float) aShort9455);
					float f_615_ = (aClass178_Sub1_9486.aFloat9250 * 768.0F / (float) aShort9455);
					for (int i_616_ = 0; i_616_ < anInt9515; i_616_++) {
						int i_617_ = method14879(aShortArray9489[i_616_], aShortArray9473[i_616_], aShort9495, aByteArray9476[i_616_]);
						float f_618_ = ((float) (i_617_ >>> 24) * aClass178_Sub1_9486.aFloat9356);
						float f_619_ = ((float) (i_617_ >> 16 & 0xff) * aClass178_Sub1_9486.aFloat9357);
						float f_620_ = ((float) (i_617_ >> 8 & 0xff) * aClass178_Sub1_9486.aFloat9268);
						int i_621_ = aShortArray9450[i_616_] & 0xffff;
						short i_622_ = (short) is_610_[i_621_];
						float f_623_;
						if (i_622_ == 0)
							f_623_ = ((f * (float) is[i_621_] + f_611_ * (float) is_608_[i_621_] + f_612_ * (float) is_609_[i_621_]) * 0.0026041667F);
						else
							f_623_ = ((f * (float) is[i_621_] + f_611_ * (float) is_608_[i_621_] + f_612_ * (float) is_609_[i_621_]) / (float) (i_622_ * 256));
						float f_624_ = f_613_ + f_623_ * (f_623_ < 0.0F ? f_615_ : f_614_);
						int i_625_ = (int) (f_618_ * f_624_);
						if (i_625_ < 0)
							i_625_ = 0;
						else if (i_625_ > 255)
							i_625_ = 255;
						int i_626_ = (int) (f_619_ * f_624_);
						if (i_626_ < 0)
							i_626_ = 0;
						else if (i_626_ > 255)
							i_626_ = 255;
						int i_627_ = (int) (f_620_ * f_624_);
						if (i_627_ < 0)
							i_627_ = 0;
						else if (i_627_ > 255)
							i_627_ = 255;
						class523_sub34_sub1.anInt10661 = (i_589_ + i_621_ * i) * 189765723;
						class523_sub34_sub1.writeByte(i_625_, -2126359071);
						class523_sub34_sub1.writeByte(i_626_, -831775934);
						class523_sub34_sub1.writeByte(i_627_, 471480594);
						class523_sub34_sub1.writeByte(255 - ((aByteArray9476[i_616_]) & 0xff), 709986465);
						i_621_ = aShortArray9478[i_616_] & 0xffff;
						i_622_ = (short) is_610_[i_621_];
						if (i_622_ == 0)
							f_623_ = ((f * (float) is[i_621_] + f_611_ * (float) is_608_[i_621_] + f_612_ * (float) is_609_[i_621_]) * 0.0026041667F);
						else
							f_623_ = ((f * (float) is[i_621_] + f_611_ * (float) is_608_[i_621_] + f_612_ * (float) is_609_[i_621_]) / (float) (i_622_ * 256));
						f_624_ = f_613_ + f_623_ * (f_623_ < 0.0F ? f_615_ : f_614_);
						i_625_ = (int) (f_618_ * f_624_);
						if (i_625_ < 0)
							i_625_ = 0;
						else if (i_625_ > 255)
							i_625_ = 255;
						i_626_ = (int) (f_619_ * f_624_);
						if (i_626_ < 0)
							i_626_ = 0;
						else if (i_626_ > 255)
							i_626_ = 255;
						i_627_ = (int) (f_620_ * f_624_);
						if (i_627_ < 0)
							i_627_ = 0;
						else if (i_627_ > 255)
							i_627_ = 255;
						class523_sub34_sub1.anInt10661 = (i_589_ + i_621_ * i) * 189765723;
						class523_sub34_sub1.writeByte(i_625_, 1822036817);
						class523_sub34_sub1.writeByte(i_626_, 239154306);
						class523_sub34_sub1.writeByte(i_627_, -2084765936);
						class523_sub34_sub1.writeByte(255 - ((aByteArray9476[i_616_]) & 0xff), 1826061291);
						i_621_ = aShortArray9464[i_616_] & 0xffff;
						i_622_ = (short) is_610_[i_621_];
						if (i_622_ == 0)
							f_623_ = ((f * (float) is[i_621_] + f_611_ * (float) is_608_[i_621_] + f_612_ * (float) is_609_[i_621_]) * 0.0026041667F);
						else
							f_623_ = ((f * (float) is[i_621_] + f_611_ * (float) is_608_[i_621_] + f_612_ * (float) is_609_[i_621_]) / (float) (i_622_ * 256));
						f_624_ = f_613_ + f_623_ * (f_623_ < 0.0F ? f_615_ : f_614_);
						i_625_ = (int) (f_618_ * f_624_);
						if (i_625_ < 0)
							i_625_ = 0;
						else if (i_625_ > 255)
							i_625_ = 255;
						i_626_ = (int) (f_619_ * f_624_);
						if (i_626_ < 0)
							i_626_ = 0;
						else if (i_626_ > 255)
							i_626_ = 255;
						i_627_ = (int) (f_620_ * f_624_);
						if (i_627_ < 0)
							i_627_ = 0;
						else if (i_627_ > 255)
							i_627_ = 255;
						class523_sub34_sub1.anInt10661 = (i_589_ + i_621_ * i) * 189765723;
						class523_sub34_sub1.writeByte(i_625_, 617439343);
						class523_sub34_sub1.writeByte(i_626_, -411661263);
						class523_sub34_sub1.writeByte(i_627_, -1900333376);
						class523_sub34_sub1.writeByte(255 - ((aByteArray9476[i_616_]) & 0xff), -1747093746);
					}
				} else {
					for (int i_628_ = 0; i_628_ < anInt9515; i_628_++) {
						int i_629_ = method14879(aShortArray9489[i_628_], aShortArray9473[i_628_], aShort9495, aByteArray9476[i_628_]);
						class523_sub34_sub1.anInt10661 = ((i_589_ + (aShortArray9450[i_628_] & 0xffff) * i) * 189765723);
						class523_sub34_sub1.writeInt(i_629_, -929320894);
						class523_sub34_sub1.anInt10661 = ((i_589_ + (aShortArray9478[i_628_] & 0xffff) * i) * 189765723);
						class523_sub34_sub1.writeInt(i_629_, -2106666854);
						class523_sub34_sub1.anInt10661 = ((i_589_ + (aShortArray9464[i_628_] & 0xffff) * i) * 189765723);
						class523_sub34_sub1.writeInt(i_629_, -941592045);
					}
				}
			}
			if (bool_585_) {
				short[] is;
				short[] is_630_;
				short[] is_631_;
				byte[] is_632_;
				if (aClass151_9470 != null) {
					is = aClass151_9470.aShortArray1729;
					is_630_ = aClass151_9470.aShortArray1726;
					is_631_ = aClass151_9470.aShortArray1728;
					is_632_ = aClass151_9470.aByteArray1727;
				} else {
					is = aShortArray9493;
					is_630_ = aShortArray9467;
					is_631_ = aShortArray9468;
					is_632_ = aByteArray9487;
				}
				float f = 3.0F / (float) aShort9455;
				float f_633_ = 3.0F / (float) (aShort9455 + aShort9455 / 2);
				class523_sub34_sub1.anInt10661 = i_590_ * 189765723;
				if (aClass178_Sub1_9486.aBool9393) {
					for (int i_634_ = 0; i_634_ < anInt9511; i_634_++) {
						int i_635_ = is_632_[i_634_] & 0xff;
						if (i_635_ == 0) {
							class523_sub34_sub1.method18112((float) is[i_634_] * f_633_);
							class523_sub34_sub1.method18112((float) is_630_[i_634_] * f_633_);
							class523_sub34_sub1.method18112((float) is_631_[i_634_] * f_633_);
						} else {
							float f_636_ = f / (float) i_635_;
							class523_sub34_sub1.method18112((float) is[i_634_] * f_636_);
							class523_sub34_sub1.method18112((float) is_630_[i_634_] * f_636_);
							class523_sub34_sub1.method18112((float) is_631_[i_634_] * f_636_);
						}
						class523_sub34_sub1.anInt10661 += (i - 12) * 189765723;
					}
				} else {
					for (int i_637_ = 0; i_637_ < anInt9511; i_637_++) {
						int i_638_ = is_632_[i_637_] & 0xff;
						if (i_638_ == 0) {
							class523_sub34_sub1.method18110((float) is[i_637_] * f_633_);
							class523_sub34_sub1.method18110((float) is_630_[i_637_] * f_633_);
							class523_sub34_sub1.method18110((float) is_631_[i_637_] * f_633_);
						} else {
							float f_639_ = f / (float) i_638_;
							class523_sub34_sub1.method18110((float) is[i_637_] * f_639_);
							class523_sub34_sub1.method18110((float) is_630_[i_637_] * f_639_);
							class523_sub34_sub1.method18110((float) is_631_[i_637_] * f_639_);
						}
						class523_sub34_sub1.anInt10661 += (i - 12) * 189765723;
					}
				}
			}
			if (bool_587_) {
				class523_sub34_sub1.anInt10661 = i_591_ * 189765723;
				if (aClass178_Sub1_9486.aBool9393) {
					for (int i_640_ = 0; i_640_ < anInt9511; i_640_++) {
						class523_sub34_sub1.method18112(aFloatArray9453[i_640_]);
						class523_sub34_sub1.method18112(aFloatArray9472[i_640_]);
						class523_sub34_sub1.anInt10661 += (i - 8) * 189765723;
					}
				} else {
					for (int i_641_ = 0; i_641_ < anInt9511; i_641_++) {
						class523_sub34_sub1.method18110(aFloatArray9453[i_641_]);
						class523_sub34_sub1.method18110(aFloatArray9472[i_641_]);
						class523_sub34_sub1.anInt10661 += (i - 8) * 189765723;
					}
				}
			}
			class523_sub34_sub1.anInt10661 = i * anInt9511 * 189765723;
			Interface15 interface15;
			if (bool) {
				if (anInterface15_9477 == null)
					anInterface15_9477 = (aClass178_Sub1_9486.method14717(i, class523_sub34_sub1.aByteArray10658, class523_sub34_sub1.anInt10661 * 2349011, true));
				else
					anInterface15_9477.method84(i, (class523_sub34_sub1.aByteArray10658), (class523_sub34_sub1.anInt10661 * 2349011));
				interface15 = anInterface15_9477;
				aByte9454 = (byte) 0;
			} else {
				interface15 = (aClass178_Sub1_9486.method14717(i, class523_sub34_sub1.aByteArray10658, class523_sub34_sub1.anInt10661 * 2349011, false));
				aBool9490 = true;
			}
			if (bool_586_) {
				aClass131_9481.anInterface15_1558 = interface15;
				aClass131_9481.aByte1555 = i_588_;
			}
			if (bool_587_) {
				aClass131_9457.anInterface15_1558 = interface15;
				aClass131_9457.aByte1555 = i_591_;
			}
			if (bool_584_) {
				aClass131_9484.anInterface15_1558 = interface15;
				aClass131_9484.aByte1555 = i_589_;
			}
			if (bool_585_) {
				aClass131_9485.anInterface15_1558 = interface15;
				aClass131_9485.aByte1555 = i_590_;
			}
		}
	}

	public Class167 method2681(byte i, int i_642_, boolean bool) {
		boolean bool_643_ = false;
		Class167_Sub3 class167_sub3_644_;
		Class167_Sub3 class167_sub3_645_;
		if (i > 0 && i <= 8) {
			class167_sub3_645_ = aClass178_Sub1_9486.aClass167_Sub3Array9422[i - 1];
			class167_sub3_644_ = aClass178_Sub1_9486.aClass167_Sub3Array9358[i - 1];
			bool_643_ = true;
		} else
			class167_sub3_644_ = class167_sub3_645_ = new Class167_Sub3(aClass178_Sub1_9486);
		return method14880(class167_sub3_644_, class167_sub3_645_, i_642_, bool_643_, bool);
	}

	static final int method14877(int i, int i_646_) {
		i_646_ = i_646_ * (i & 0x7f) >> 7;
		if (i_646_ < 2)
			i_646_ = 2;
		else if (i_646_ > 126)
			i_646_ = 126;
		return (i & 0xff80) + i_646_;
	}

	static {
		anIntArray9483 = new int[8];
	}

	public void method2678(Class167 class167, int i, int i_647_, int i_648_, boolean bool) {
		Class167_Sub3 class167_sub3_649_ = (Class167_Sub3) class167;
		if (anInt9515 != 0 && class167_sub3_649_.anInt9515 != 0) {
			int i_650_ = class167_sub3_649_.anInt9459;
			int[] is = class167_sub3_649_.anIntArray9460;
			int[] is_651_ = class167_sub3_649_.anIntArray9461;
			int[] is_652_ = class167_sub3_649_.anIntArray9496;
			short[] is_653_ = class167_sub3_649_.aShortArray9493;
			short[] is_654_ = class167_sub3_649_.aShortArray9467;
			short[] is_655_ = class167_sub3_649_.aShortArray9468;
			byte[] is_656_ = class167_sub3_649_.aByteArray9487;
			short[] is_657_;
			short[] is_658_;
			short[] is_659_;
			byte[] is_660_;
			if (aClass151_9470 != null) {
				is_657_ = aClass151_9470.aShortArray1729;
				is_658_ = aClass151_9470.aShortArray1726;
				is_659_ = aClass151_9470.aShortArray1728;
				is_660_ = aClass151_9470.aByteArray1727;
			} else {
				is_657_ = null;
				is_658_ = null;
				is_659_ = null;
				is_660_ = null;
			}
			short[] is_661_;
			short[] is_662_;
			short[] is_663_;
			byte[] is_664_;
			if (class167_sub3_649_.aClass151_9470 != null) {
				is_661_ = class167_sub3_649_.aClass151_9470.aShortArray1729;
				is_662_ = class167_sub3_649_.aClass151_9470.aShortArray1726;
				is_663_ = class167_sub3_649_.aClass151_9470.aShortArray1728;
				is_664_ = class167_sub3_649_.aClass151_9470.aByteArray1727;
			} else {
				is_661_ = null;
				is_662_ = null;
				is_663_ = null;
				is_664_ = null;
			}
			int[] is_665_ = class167_sub3_649_.anIntArray9503;
			short[] is_666_ = class167_sub3_649_.aShortArray9504;
			if (!class167_sub3_649_.aBool9465)
				class167_sub3_649_.method14870();
			int i_667_ = class167_sub3_649_.aShort9494;
			int i_668_ = class167_sub3_649_.aShort9505;
			int i_669_ = class167_sub3_649_.aShort9471;
			int i_670_ = class167_sub3_649_.aShort9497;
			int i_671_ = class167_sub3_649_.aShort9498;
			int i_672_ = class167_sub3_649_.aShort9491;
			for (int i_673_ = 0; i_673_ < anInt9459; i_673_++) {
				int i_674_ = anIntArray9461[i_673_] - i_647_;
				if (i_674_ >= i_667_ && i_674_ <= i_668_) {
					int i_675_ = anIntArray9460[i_673_] - i;
					if (i_675_ >= i_669_ && i_675_ <= i_670_) {
						int i_676_ = anIntArray9496[i_673_] - i_648_;
						if (i_676_ >= i_671_ && i_676_ <= i_672_) {
							int i_677_ = -1;
							int i_678_ = anIntArray9503[i_673_];
							int i_679_ = anIntArray9503[i_673_ + 1];
							for (int i_680_ = i_678_; (i_680_ < i_679_ && aShortArray9504[i_680_] != 0); i_680_++) {
								i_677_ = (aShortArray9504[i_680_] & 0xffff) - 1;
								if (aByteArray9487[i_677_] != 0)
									break;
							}
							if (i_677_ != -1) {
								for (int i_681_ = 0; i_681_ < i_650_; i_681_++) {
									if (i_675_ == is[i_681_] && i_676_ == is_652_[i_681_] && i_674_ == is_651_[i_681_]) {
										int i_682_ = -1;
										i_678_ = is_665_[i_681_];
										i_679_ = is_665_[i_681_ + 1];
										for (int i_683_ = i_678_; (i_683_ < i_679_ && is_666_[i_683_] != 0); i_683_++) {
											i_682_ = (is_666_[i_683_] & 0xffff) - 1;
											if (is_656_[i_682_] != 0)
												break;
										}
										if (i_682_ != -1) {
											if (is_657_ == null) {
												aClass151_9470 = new Class151();
												is_657_ = aClass151_9470.aShortArray1729 = (Class246.method4386(aShortArray9493, -78966098));
												is_658_ = aClass151_9470.aShortArray1726 = (Class246.method4386(aShortArray9467, -782338919));
												is_659_ = aClass151_9470.aShortArray1728 = (Class246.method4386(aShortArray9468, 416015827));
												is_660_ = aClass151_9470.aByteArray1727 = (Class60.method1408(aByteArray9487, -524999508));
											}
											if (is_661_ == null) {
												Class151 class151 = (class167_sub3_649_.aClass151_9470 = new Class151());
												is_661_ = class151.aShortArray1729 = (Class246.method4386(is_653_, -1094943116));
												is_662_ = class151.aShortArray1726 = (Class246.method4386(is_654_, -1729044162));
												is_663_ = class151.aShortArray1728 = (Class246.method4386(is_655_, 68312864));
												is_664_ = class151.aByteArray1727 = (Class60.method1408(is_656_, -612226348));
											}
											short i_684_ = aShortArray9493[i_677_];
											short i_685_ = aShortArray9467[i_677_];
											short i_686_ = aShortArray9468[i_677_];
											byte i_687_ = aByteArray9487[i_677_];
											i_678_ = is_665_[i_681_];
											i_679_ = is_665_[i_681_ + 1];
											for (int i_688_ = i_678_; i_688_ < i_679_; i_688_++) {
												int i_689_ = is_666_[i_688_] - 1;
												if (i_689_ == -1)
													break;
												if (is_664_[i_689_] != 0) {
													is_661_[i_689_] += i_684_;
													is_662_[i_689_] += i_685_;
													is_663_[i_689_] += i_686_;
													is_664_[i_689_] += i_687_;
												}
											}
											i_684_ = is_653_[i_682_];
											i_685_ = is_654_[i_682_];
											i_686_ = is_655_[i_682_];
											i_687_ = is_656_[i_682_];
											i_678_ = anIntArray9503[i_673_];
											i_679_ = anIntArray9503[i_673_ + 1];
											for (int i_690_ = i_678_; (i_690_ < i_679_ && (aShortArray9504[i_690_] != 0)); i_690_++) {
												int i_691_ = ((aShortArray9504[i_690_] & 0xffff) - 1);
												if (is_660_[i_691_] != 0) {
													is_657_[i_691_] += i_684_;
													is_658_[i_691_] += i_685_;
													is_659_[i_691_] += i_686_;
													is_660_[i_691_] += i_687_;
												}
											}
											if (aClass131_9485 == null && aClass131_9484 != null)
												aClass131_9484.anInterface15_1558 = null;
											if (aClass131_9485 != null)
												aClass131_9485.anInterface15_1558 = null;
											if ((class167_sub3_649_.aClass131_9485) == null && (class167_sub3_649_.aClass131_9484) != null)
												class167_sub3_649_.aClass131_9484.anInterface15_1558 = null;
											if ((class167_sub3_649_.aClass131_9485) != null)
												class167_sub3_649_.aClass131_9485.anInterface15_1558 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void method2737(Class167 class167, int i, int i_692_, int i_693_, boolean bool) {
		Class167_Sub3 class167_sub3_694_ = (Class167_Sub3) class167;
		if (anInt9515 != 0 && class167_sub3_694_.anInt9515 != 0) {
			int i_695_ = class167_sub3_694_.anInt9459;
			int[] is = class167_sub3_694_.anIntArray9460;
			int[] is_696_ = class167_sub3_694_.anIntArray9461;
			int[] is_697_ = class167_sub3_694_.anIntArray9496;
			short[] is_698_ = class167_sub3_694_.aShortArray9493;
			short[] is_699_ = class167_sub3_694_.aShortArray9467;
			short[] is_700_ = class167_sub3_694_.aShortArray9468;
			byte[] is_701_ = class167_sub3_694_.aByteArray9487;
			short[] is_702_;
			short[] is_703_;
			short[] is_704_;
			byte[] is_705_;
			if (aClass151_9470 != null) {
				is_702_ = aClass151_9470.aShortArray1729;
				is_703_ = aClass151_9470.aShortArray1726;
				is_704_ = aClass151_9470.aShortArray1728;
				is_705_ = aClass151_9470.aByteArray1727;
			} else {
				is_702_ = null;
				is_703_ = null;
				is_704_ = null;
				is_705_ = null;
			}
			short[] is_706_;
			short[] is_707_;
			short[] is_708_;
			byte[] is_709_;
			if (class167_sub3_694_.aClass151_9470 != null) {
				is_706_ = class167_sub3_694_.aClass151_9470.aShortArray1729;
				is_707_ = class167_sub3_694_.aClass151_9470.aShortArray1726;
				is_708_ = class167_sub3_694_.aClass151_9470.aShortArray1728;
				is_709_ = class167_sub3_694_.aClass151_9470.aByteArray1727;
			} else {
				is_706_ = null;
				is_707_ = null;
				is_708_ = null;
				is_709_ = null;
			}
			int[] is_710_ = class167_sub3_694_.anIntArray9503;
			short[] is_711_ = class167_sub3_694_.aShortArray9504;
			if (!class167_sub3_694_.aBool9465)
				class167_sub3_694_.method14870();
			int i_712_ = class167_sub3_694_.aShort9494;
			int i_713_ = class167_sub3_694_.aShort9505;
			int i_714_ = class167_sub3_694_.aShort9471;
			int i_715_ = class167_sub3_694_.aShort9497;
			int i_716_ = class167_sub3_694_.aShort9498;
			int i_717_ = class167_sub3_694_.aShort9491;
			for (int i_718_ = 0; i_718_ < anInt9459; i_718_++) {
				int i_719_ = anIntArray9461[i_718_] - i_692_;
				if (i_719_ >= i_712_ && i_719_ <= i_713_) {
					int i_720_ = anIntArray9460[i_718_] - i;
					if (i_720_ >= i_714_ && i_720_ <= i_715_) {
						int i_721_ = anIntArray9496[i_718_] - i_693_;
						if (i_721_ >= i_716_ && i_721_ <= i_717_) {
							int i_722_ = -1;
							int i_723_ = anIntArray9503[i_718_];
							int i_724_ = anIntArray9503[i_718_ + 1];
							for (int i_725_ = i_723_; (i_725_ < i_724_ && aShortArray9504[i_725_] != 0); i_725_++) {
								i_722_ = (aShortArray9504[i_725_] & 0xffff) - 1;
								if (aByteArray9487[i_722_] != 0)
									break;
							}
							if (i_722_ != -1) {
								for (int i_726_ = 0; i_726_ < i_695_; i_726_++) {
									if (i_720_ == is[i_726_] && i_721_ == is_697_[i_726_] && i_719_ == is_696_[i_726_]) {
										int i_727_ = -1;
										i_723_ = is_710_[i_726_];
										i_724_ = is_710_[i_726_ + 1];
										for (int i_728_ = i_723_; (i_728_ < i_724_ && is_711_[i_728_] != 0); i_728_++) {
											i_727_ = (is_711_[i_728_] & 0xffff) - 1;
											if (is_701_[i_727_] != 0)
												break;
										}
										if (i_727_ != -1) {
											if (is_702_ == null) {
												aClass151_9470 = new Class151();
												is_702_ = aClass151_9470.aShortArray1729 = (Class246.method4386(aShortArray9493, 383984694));
												is_703_ = aClass151_9470.aShortArray1726 = (Class246.method4386(aShortArray9467, -1541602820));
												is_704_ = aClass151_9470.aShortArray1728 = (Class246.method4386(aShortArray9468, 428765762));
												is_705_ = aClass151_9470.aByteArray1727 = (Class60.method1408(aByteArray9487, -796517322));
											}
											if (is_706_ == null) {
												Class151 class151 = (class167_sub3_694_.aClass151_9470 = new Class151());
												is_706_ = class151.aShortArray1729 = (Class246.method4386(is_698_, 342949016));
												is_707_ = class151.aShortArray1726 = (Class246.method4386(is_699_, -341685631));
												is_708_ = class151.aShortArray1728 = (Class246.method4386(is_700_, -1058660901));
												is_709_ = class151.aByteArray1727 = (Class60.method1408(is_701_, -1714333223));
											}
											short i_729_ = aShortArray9493[i_722_];
											short i_730_ = aShortArray9467[i_722_];
											short i_731_ = aShortArray9468[i_722_];
											byte i_732_ = aByteArray9487[i_722_];
											i_723_ = is_710_[i_726_];
											i_724_ = is_710_[i_726_ + 1];
											for (int i_733_ = i_723_; i_733_ < i_724_; i_733_++) {
												int i_734_ = is_711_[i_733_] - 1;
												if (i_734_ == -1)
													break;
												if (is_709_[i_734_] != 0) {
													is_706_[i_734_] += i_729_;
													is_707_[i_734_] += i_730_;
													is_708_[i_734_] += i_731_;
													is_709_[i_734_] += i_732_;
												}
											}
											i_729_ = is_698_[i_727_];
											i_730_ = is_699_[i_727_];
											i_731_ = is_700_[i_727_];
											i_732_ = is_701_[i_727_];
											i_723_ = anIntArray9503[i_718_];
											i_724_ = anIntArray9503[i_718_ + 1];
											for (int i_735_ = i_723_; (i_735_ < i_724_ && (aShortArray9504[i_735_] != 0)); i_735_++) {
												int i_736_ = ((aShortArray9504[i_735_] & 0xffff) - 1);
												if (is_705_[i_736_] != 0) {
													is_702_[i_736_] += i_729_;
													is_703_[i_736_] += i_730_;
													is_704_[i_736_] += i_731_;
													is_705_[i_736_] += i_732_;
												}
											}
											if (aClass131_9485 == null && aClass131_9484 != null)
												aClass131_9484.anInterface15_1558 = null;
											if (aClass131_9485 != null)
												aClass131_9485.anInterface15_1558 = null;
											if ((class167_sub3_694_.aClass131_9485) == null && (class167_sub3_694_.aClass131_9484) != null)
												class167_sub3_694_.aClass131_9484.anInterface15_1558 = null;
											if ((class167_sub3_694_.aClass131_9485) != null)
												class167_sub3_694_.aClass131_9485.anInterface15_1558 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void method2738(Class167 class167, int i, int i_737_, int i_738_, boolean bool) {
		Class167_Sub3 class167_sub3_739_ = (Class167_Sub3) class167;
		if (anInt9515 != 0 && class167_sub3_739_.anInt9515 != 0) {
			int i_740_ = class167_sub3_739_.anInt9459;
			int[] is = class167_sub3_739_.anIntArray9460;
			int[] is_741_ = class167_sub3_739_.anIntArray9461;
			int[] is_742_ = class167_sub3_739_.anIntArray9496;
			short[] is_743_ = class167_sub3_739_.aShortArray9493;
			short[] is_744_ = class167_sub3_739_.aShortArray9467;
			short[] is_745_ = class167_sub3_739_.aShortArray9468;
			byte[] is_746_ = class167_sub3_739_.aByteArray9487;
			short[] is_747_;
			short[] is_748_;
			short[] is_749_;
			byte[] is_750_;
			if (aClass151_9470 != null) {
				is_747_ = aClass151_9470.aShortArray1729;
				is_748_ = aClass151_9470.aShortArray1726;
				is_749_ = aClass151_9470.aShortArray1728;
				is_750_ = aClass151_9470.aByteArray1727;
			} else {
				is_747_ = null;
				is_748_ = null;
				is_749_ = null;
				is_750_ = null;
			}
			short[] is_751_;
			short[] is_752_;
			short[] is_753_;
			byte[] is_754_;
			if (class167_sub3_739_.aClass151_9470 != null) {
				is_751_ = class167_sub3_739_.aClass151_9470.aShortArray1729;
				is_752_ = class167_sub3_739_.aClass151_9470.aShortArray1726;
				is_753_ = class167_sub3_739_.aClass151_9470.aShortArray1728;
				is_754_ = class167_sub3_739_.aClass151_9470.aByteArray1727;
			} else {
				is_751_ = null;
				is_752_ = null;
				is_753_ = null;
				is_754_ = null;
			}
			int[] is_755_ = class167_sub3_739_.anIntArray9503;
			short[] is_756_ = class167_sub3_739_.aShortArray9504;
			if (!class167_sub3_739_.aBool9465)
				class167_sub3_739_.method14870();
			int i_757_ = class167_sub3_739_.aShort9494;
			int i_758_ = class167_sub3_739_.aShort9505;
			int i_759_ = class167_sub3_739_.aShort9471;
			int i_760_ = class167_sub3_739_.aShort9497;
			int i_761_ = class167_sub3_739_.aShort9498;
			int i_762_ = class167_sub3_739_.aShort9491;
			for (int i_763_ = 0; i_763_ < anInt9459; i_763_++) {
				int i_764_ = anIntArray9461[i_763_] - i_737_;
				if (i_764_ >= i_757_ && i_764_ <= i_758_) {
					int i_765_ = anIntArray9460[i_763_] - i;
					if (i_765_ >= i_759_ && i_765_ <= i_760_) {
						int i_766_ = anIntArray9496[i_763_] - i_738_;
						if (i_766_ >= i_761_ && i_766_ <= i_762_) {
							int i_767_ = -1;
							int i_768_ = anIntArray9503[i_763_];
							int i_769_ = anIntArray9503[i_763_ + 1];
							for (int i_770_ = i_768_; (i_770_ < i_769_ && aShortArray9504[i_770_] != 0); i_770_++) {
								i_767_ = (aShortArray9504[i_770_] & 0xffff) - 1;
								if (aByteArray9487[i_767_] != 0)
									break;
							}
							if (i_767_ != -1) {
								for (int i_771_ = 0; i_771_ < i_740_; i_771_++) {
									if (i_765_ == is[i_771_] && i_766_ == is_742_[i_771_] && i_764_ == is_741_[i_771_]) {
										int i_772_ = -1;
										i_768_ = is_755_[i_771_];
										i_769_ = is_755_[i_771_ + 1];
										for (int i_773_ = i_768_; (i_773_ < i_769_ && is_756_[i_773_] != 0); i_773_++) {
											i_772_ = (is_756_[i_773_] & 0xffff) - 1;
											if (is_746_[i_772_] != 0)
												break;
										}
										if (i_772_ != -1) {
											if (is_747_ == null) {
												aClass151_9470 = new Class151();
												is_747_ = aClass151_9470.aShortArray1729 = (Class246.method4386(aShortArray9493, -1314372038));
												is_748_ = aClass151_9470.aShortArray1726 = (Class246.method4386(aShortArray9467, -944997299));
												is_749_ = aClass151_9470.aShortArray1728 = (Class246.method4386(aShortArray9468, -333474382));
												is_750_ = aClass151_9470.aByteArray1727 = (Class60.method1408(aByteArray9487, -1640663847));
											}
											if (is_751_ == null) {
												Class151 class151 = (class167_sub3_739_.aClass151_9470 = new Class151());
												is_751_ = class151.aShortArray1729 = (Class246.method4386(is_743_, -1986489235));
												is_752_ = class151.aShortArray1726 = (Class246.method4386(is_744_, 382319832));
												is_753_ = class151.aShortArray1728 = (Class246.method4386(is_745_, -2142782498));
												is_754_ = class151.aByteArray1727 = (Class60.method1408(is_746_, -1700110929));
											}
											short i_774_ = aShortArray9493[i_767_];
											short i_775_ = aShortArray9467[i_767_];
											short i_776_ = aShortArray9468[i_767_];
											byte i_777_ = aByteArray9487[i_767_];
											i_768_ = is_755_[i_771_];
											i_769_ = is_755_[i_771_ + 1];
											for (int i_778_ = i_768_; i_778_ < i_769_; i_778_++) {
												int i_779_ = is_756_[i_778_] - 1;
												if (i_779_ == -1)
													break;
												if (is_754_[i_779_] != 0) {
													is_751_[i_779_] += i_774_;
													is_752_[i_779_] += i_775_;
													is_753_[i_779_] += i_776_;
													is_754_[i_779_] += i_777_;
												}
											}
											i_774_ = is_743_[i_772_];
											i_775_ = is_744_[i_772_];
											i_776_ = is_745_[i_772_];
											i_777_ = is_746_[i_772_];
											i_768_ = anIntArray9503[i_763_];
											i_769_ = anIntArray9503[i_763_ + 1];
											for (int i_780_ = i_768_; (i_780_ < i_769_ && (aShortArray9504[i_780_] != 0)); i_780_++) {
												int i_781_ = ((aShortArray9504[i_780_] & 0xffff) - 1);
												if (is_750_[i_781_] != 0) {
													is_747_[i_781_] += i_774_;
													is_748_[i_781_] += i_775_;
													is_749_[i_781_] += i_776_;
													is_750_[i_781_] += i_777_;
												}
											}
											if (aClass131_9485 == null && aClass131_9484 != null)
												aClass131_9484.anInterface15_1558 = null;
											if (aClass131_9485 != null)
												aClass131_9485.anInterface15_1558 = null;
											if ((class167_sub3_739_.aClass131_9485) == null && (class167_sub3_739_.aClass131_9484) != null)
												class167_sub3_739_.aClass131_9484.anInterface15_1558 = null;
											if ((class167_sub3_739_.aClass131_9485) != null)
												class167_sub3_739_.aClass131_9485.anInterface15_1558 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void method2781(short i, short i_782_) {
		for (int i_783_ = 0; i_783_ < anInt9515; i_783_++) {
			if (aShortArray9489[i_783_] == i)
				aShortArray9489[i_783_] = i_782_;
		}
		if (aClass161Array9508 != null) {
			for (int i_784_ = 0; i_784_ < anInt9507; i_784_++) {
				Class161 class161 = aClass161Array9508[i_784_];
				Class133 class133 = aClass133Array9479[i_784_];
				class133.anInt1577 = (class133.anInt1577 & ~0xffffff | ((Class710.anIntArray8839[aShortArray9489[class161.anInt1764] & 0xffff]) & 0xffffff));
			}
		}
		if (aClass131_9484 != null)
			aClass131_9484.anInterface15_1558 = null;
	}

	public void method2805(Class167 class167, int i, int i_785_, int i_786_, boolean bool) {
		Class167_Sub3 class167_sub3_787_ = (Class167_Sub3) class167;
		if (anInt9515 != 0 && class167_sub3_787_.anInt9515 != 0) {
			int i_788_ = class167_sub3_787_.anInt9459;
			int[] is = class167_sub3_787_.anIntArray9460;
			int[] is_789_ = class167_sub3_787_.anIntArray9461;
			int[] is_790_ = class167_sub3_787_.anIntArray9496;
			short[] is_791_ = class167_sub3_787_.aShortArray9493;
			short[] is_792_ = class167_sub3_787_.aShortArray9467;
			short[] is_793_ = class167_sub3_787_.aShortArray9468;
			byte[] is_794_ = class167_sub3_787_.aByteArray9487;
			short[] is_795_;
			short[] is_796_;
			short[] is_797_;
			byte[] is_798_;
			if (aClass151_9470 != null) {
				is_795_ = aClass151_9470.aShortArray1729;
				is_796_ = aClass151_9470.aShortArray1726;
				is_797_ = aClass151_9470.aShortArray1728;
				is_798_ = aClass151_9470.aByteArray1727;
			} else {
				is_795_ = null;
				is_796_ = null;
				is_797_ = null;
				is_798_ = null;
			}
			short[] is_799_;
			short[] is_800_;
			short[] is_801_;
			byte[] is_802_;
			if (class167_sub3_787_.aClass151_9470 != null) {
				is_799_ = class167_sub3_787_.aClass151_9470.aShortArray1729;
				is_800_ = class167_sub3_787_.aClass151_9470.aShortArray1726;
				is_801_ = class167_sub3_787_.aClass151_9470.aShortArray1728;
				is_802_ = class167_sub3_787_.aClass151_9470.aByteArray1727;
			} else {
				is_799_ = null;
				is_800_ = null;
				is_801_ = null;
				is_802_ = null;
			}
			int[] is_803_ = class167_sub3_787_.anIntArray9503;
			short[] is_804_ = class167_sub3_787_.aShortArray9504;
			if (!class167_sub3_787_.aBool9465)
				class167_sub3_787_.method14870();
			int i_805_ = class167_sub3_787_.aShort9494;
			int i_806_ = class167_sub3_787_.aShort9505;
			int i_807_ = class167_sub3_787_.aShort9471;
			int i_808_ = class167_sub3_787_.aShort9497;
			int i_809_ = class167_sub3_787_.aShort9498;
			int i_810_ = class167_sub3_787_.aShort9491;
			for (int i_811_ = 0; i_811_ < anInt9459; i_811_++) {
				int i_812_ = anIntArray9461[i_811_] - i_785_;
				if (i_812_ >= i_805_ && i_812_ <= i_806_) {
					int i_813_ = anIntArray9460[i_811_] - i;
					if (i_813_ >= i_807_ && i_813_ <= i_808_) {
						int i_814_ = anIntArray9496[i_811_] - i_786_;
						if (i_814_ >= i_809_ && i_814_ <= i_810_) {
							int i_815_ = -1;
							int i_816_ = anIntArray9503[i_811_];
							int i_817_ = anIntArray9503[i_811_ + 1];
							for (int i_818_ = i_816_; (i_818_ < i_817_ && aShortArray9504[i_818_] != 0); i_818_++) {
								i_815_ = (aShortArray9504[i_818_] & 0xffff) - 1;
								if (aByteArray9487[i_815_] != 0)
									break;
							}
							if (i_815_ != -1) {
								for (int i_819_ = 0; i_819_ < i_788_; i_819_++) {
									if (i_813_ == is[i_819_] && i_814_ == is_790_[i_819_] && i_812_ == is_789_[i_819_]) {
										int i_820_ = -1;
										i_816_ = is_803_[i_819_];
										i_817_ = is_803_[i_819_ + 1];
										for (int i_821_ = i_816_; (i_821_ < i_817_ && is_804_[i_821_] != 0); i_821_++) {
											i_820_ = (is_804_[i_821_] & 0xffff) - 1;
											if (is_794_[i_820_] != 0)
												break;
										}
										if (i_820_ != -1) {
											if (is_795_ == null) {
												aClass151_9470 = new Class151();
												is_795_ = aClass151_9470.aShortArray1729 = (Class246.method4386(aShortArray9493, -1095523165));
												is_796_ = aClass151_9470.aShortArray1726 = (Class246.method4386(aShortArray9467, -561766713));
												is_797_ = aClass151_9470.aShortArray1728 = (Class246.method4386(aShortArray9468, -1266789956));
												is_798_ = aClass151_9470.aByteArray1727 = (Class60.method1408(aByteArray9487, -1726400659));
											}
											if (is_799_ == null) {
												Class151 class151 = (class167_sub3_787_.aClass151_9470 = new Class151());
												is_799_ = class151.aShortArray1729 = (Class246.method4386(is_791_, -1633078843));
												is_800_ = class151.aShortArray1726 = (Class246.method4386(is_792_, -541337435));
												is_801_ = class151.aShortArray1728 = (Class246.method4386(is_793_, -1897724857));
												is_802_ = class151.aByteArray1727 = (Class60.method1408(is_794_, -778846758));
											}
											short i_822_ = aShortArray9493[i_815_];
											short i_823_ = aShortArray9467[i_815_];
											short i_824_ = aShortArray9468[i_815_];
											byte i_825_ = aByteArray9487[i_815_];
											i_816_ = is_803_[i_819_];
											i_817_ = is_803_[i_819_ + 1];
											for (int i_826_ = i_816_; i_826_ < i_817_; i_826_++) {
												int i_827_ = is_804_[i_826_] - 1;
												if (i_827_ == -1)
													break;
												if (is_802_[i_827_] != 0) {
													is_799_[i_827_] += i_822_;
													is_800_[i_827_] += i_823_;
													is_801_[i_827_] += i_824_;
													is_802_[i_827_] += i_825_;
												}
											}
											i_822_ = is_791_[i_820_];
											i_823_ = is_792_[i_820_];
											i_824_ = is_793_[i_820_];
											i_825_ = is_794_[i_820_];
											i_816_ = anIntArray9503[i_811_];
											i_817_ = anIntArray9503[i_811_ + 1];
											for (int i_828_ = i_816_; (i_828_ < i_817_ && (aShortArray9504[i_828_] != 0)); i_828_++) {
												int i_829_ = ((aShortArray9504[i_828_] & 0xffff) - 1);
												if (is_798_[i_829_] != 0) {
													is_795_[i_829_] += i_822_;
													is_796_[i_829_] += i_823_;
													is_797_[i_829_] += i_824_;
													is_798_[i_829_] += i_825_;
												}
											}
											if (aClass131_9485 == null && aClass131_9484 != null)
												aClass131_9484.anInterface15_1558 = null;
											if (aClass131_9485 != null)
												aClass131_9485.anInterface15_1558 = null;
											if ((class167_sub3_787_.aClass131_9485) == null && (class167_sub3_787_.aClass131_9484) != null)
												class167_sub3_787_.aClass131_9484.anInterface15_1558 = null;
											if ((class167_sub3_787_.aClass131_9485) != null)
												class167_sub3_787_.aClass131_9485.anInterface15_1558 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public Class184[] method2733() {
		return aClass184Array9449;
	}

	public int method2742() {
		return anInt9451;
	}

	Class167_Sub3(Class178_Sub1 class178_sub1) {
		anInt9459 = 0;
		anInt9511 = 0;
		anInt9515 = 0;
		anInt9474 = 0;
		aBool9490 = true;
		aBool9465 = false;
		aBool9500 = false;
		aClass178_Sub1_9486 = class178_sub1;
		aClass131_9481 = new Class131(null, 5126, 3, 0);
		aClass131_9457 = new Class131(null, 5126, 2, 0);
		aClass131_9485 = new Class131(null, 5126, 3, 0);
		aClass131_9484 = new Class131(null, 5121, 4, 0);
		aClass119_9509 = new Class119();
	}

	public void method2744(int i) {
		anInt9451 = i;
		if (aClass151_9470 != null && (anInt9451 & 0x10000) == 0) {
			aShortArray9493 = aClass151_9470.aShortArray1729;
			aShortArray9467 = aClass151_9470.aShortArray1726;
			aShortArray9468 = aClass151_9470.aShortArray1728;
			aByteArray9487 = aClass151_9470.aByteArray1727;
			aClass151_9470 = null;
		}
		aBool9490 = true;
		method14882();
	}

	public void method2745(int i) {
		anInt9451 = i;
		if (aClass151_9470 != null && (anInt9451 & 0x10000) == 0) {
			aShortArray9493 = aClass151_9470.aShortArray1729;
			aShortArray9467 = aClass151_9470.aShortArray1726;
			aShortArray9468 = aClass151_9470.aShortArray1728;
			aByteArray9487 = aClass151_9470.aByteArray1727;
			aClass151_9470 = null;
		}
		aBool9490 = true;
		method14882();
	}

	public void method2824() {
		if (anInt9511 > 0 && anInt9474 > 0) {
			method14876(false);
			if ((aByte9454 & 0x10) == 0 && aClass119_9509.anInterface18_1474 == null)
				method14868(false);
			method14882();
		}
	}

	public void method2761(int i) {
		int i_830_ = Class433.anIntArray4880[i];
		int i_831_ = Class433.anIntArray4881[i];
		for (int i_832_ = 0; i_832_ < anInt9459; i_832_++) {
			int i_833_ = ((anIntArray9496[i_832_] * i_830_ + anIntArray9460[i_832_] * i_831_) >> 14);
			anIntArray9496[i_832_] = (anIntArray9496[i_832_] * i_831_ - anIntArray9460[i_832_] * i_830_) >> 14;
			anIntArray9460[i_832_] = i_833_;
		}
		if (aClass131_9481 != null)
			aClass131_9481.anInterface15_1558 = null;
		aBool9465 = false;
	}

	public void method2845(int i) {
		int i_834_ = Class433.anIntArray4880[i];
		int i_835_ = Class433.anIntArray4881[i];
		for (int i_836_ = 0; i_836_ < anInt9459; i_836_++) {
			int i_837_ = ((anIntArray9461[i_836_] * i_835_ - anIntArray9496[i_836_] * i_834_) >> 14);
			anIntArray9496[i_836_] = (anIntArray9461[i_836_] * i_834_ + anIntArray9496[i_836_] * i_835_) >> 14;
			anIntArray9461[i_836_] = i_837_;
		}
		if (aClass131_9481 != null)
			aClass131_9481.anInterface15_1558 = null;
		aBool9465 = false;
	}

	public void method2749(int i) {
		int i_838_ = Class433.anIntArray4880[i];
		int i_839_ = Class433.anIntArray4881[i];
		for (int i_840_ = 0; i_840_ < anInt9459; i_840_++) {
			int i_841_ = ((anIntArray9496[i_840_] * i_838_ + anIntArray9460[i_840_] * i_839_) >> 14);
			anIntArray9496[i_840_] = (anIntArray9496[i_840_] * i_839_ - anIntArray9460[i_840_] * i_838_) >> 14;
			anIntArray9460[i_840_] = i_841_;
		}
		for (int i_842_ = 0; i_842_ < anInt9511; i_842_++) {
			int i_843_ = ((aShortArray9468[i_842_] * i_838_ + aShortArray9493[i_842_] * i_839_) >> 14);
			aShortArray9468[i_842_] = (short) ((aShortArray9468[i_842_] * i_839_ - aShortArray9493[i_842_] * i_838_) >> 14);
			aShortArray9493[i_842_] = (short) i_843_;
		}
		if (aClass131_9485 == null && aClass131_9484 != null)
			aClass131_9484.anInterface15_1558 = null;
		if (aClass131_9485 != null)
			aClass131_9485.anInterface15_1558 = null;
		if (aClass131_9481 != null)
			aClass131_9481.anInterface15_1558 = null;
		aBool9465 = false;
	}

	public void method2750(int i) {
		int i_844_ = Class433.anIntArray4880[i];
		int i_845_ = Class433.anIntArray4881[i];
		for (int i_846_ = 0; i_846_ < anInt9459; i_846_++) {
			int i_847_ = ((anIntArray9496[i_846_] * i_844_ + anIntArray9460[i_846_] * i_845_) >> 14);
			anIntArray9496[i_846_] = (anIntArray9496[i_846_] * i_845_ - anIntArray9460[i_846_] * i_844_) >> 14;
			anIntArray9460[i_846_] = i_847_;
		}
		for (int i_848_ = 0; i_848_ < anInt9511; i_848_++) {
			int i_849_ = ((aShortArray9468[i_848_] * i_844_ + aShortArray9493[i_848_] * i_845_) >> 14);
			aShortArray9468[i_848_] = (short) ((aShortArray9468[i_848_] * i_845_ - aShortArray9493[i_848_] * i_844_) >> 14);
			aShortArray9493[i_848_] = (short) i_849_;
		}
		if (aClass131_9485 == null && aClass131_9484 != null)
			aClass131_9484.anInterface15_1558 = null;
		if (aClass131_9485 != null)
			aClass131_9485.anInterface15_1558 = null;
		if (aClass131_9481 != null)
			aClass131_9481.anInterface15_1558 = null;
		aBool9465 = false;
	}

	public void method2751(int i) {
		int i_850_ = Class433.anIntArray4880[i];
		int i_851_ = Class433.anIntArray4881[i];
		for (int i_852_ = 0; i_852_ < anInt9459; i_852_++) {
			int i_853_ = ((anIntArray9461[i_852_] * i_851_ - anIntArray9496[i_852_] * i_850_) >> 14);
			anIntArray9496[i_852_] = (anIntArray9461[i_852_] * i_850_ + anIntArray9496[i_852_] * i_851_) >> 14;
			anIntArray9461[i_852_] = i_853_;
		}
		if (aClass131_9481 != null)
			aClass131_9481.anInterface15_1558 = null;
		aBool9465 = false;
	}

	public byte[] method2798() {
		return aByteArray9476;
	}

	public void method2753(int i) {
		int i_854_ = Class433.anIntArray4880[i];
		int i_855_ = Class433.anIntArray4881[i];
		for (int i_856_ = 0; i_856_ < anInt9459; i_856_++) {
			int i_857_ = ((anIntArray9461[i_856_] * i_855_ - anIntArray9496[i_856_] * i_854_) >> 14);
			anIntArray9496[i_856_] = (anIntArray9461[i_856_] * i_854_ + anIntArray9496[i_856_] * i_855_) >> 14;
			anIntArray9461[i_856_] = i_857_;
		}
		if (aClass131_9481 != null)
			aClass131_9481.anInterface15_1558 = null;
		aBool9465 = false;
	}

	public void method2740() {
		for (int i = 0; i < anInt9459; i++)
			anIntArray9496[i] = -anIntArray9496[i];
		for (int i = 0; i < anInt9511; i++)
			aShortArray9468[i] = (short) -aShortArray9468[i];
		for (int i = 0; i < anInt9515; i++) {
			short i_858_ = aShortArray9450[i];
			aShortArray9450[i] = aShortArray9464[i];
			aShortArray9464[i] = i_858_;
		}
		if (aClass131_9485 == null && aClass131_9484 != null)
			aClass131_9484.anInterface15_1558 = null;
		if (aClass131_9485 != null)
			aClass131_9485.anInterface15_1558 = null;
		if (aClass131_9481 != null)
			aClass131_9481.anInterface15_1558 = null;
		if (aClass119_9509 != null)
			aClass119_9509.anInterface18_1474 = null;
		aBool9465 = false;
	}

	public int method2716() {
		if (!aBool9465)
			method14870();
		return aShort9498;
	}

	public void method2756() {
		for (int i = 0; i < anInt9459; i++)
			anIntArray9496[i] = -anIntArray9496[i];
		for (int i = 0; i < anInt9511; i++)
			aShortArray9468[i] = (short) -aShortArray9468[i];
		for (int i = 0; i < anInt9515; i++) {
			short i_859_ = aShortArray9450[i];
			aShortArray9450[i] = aShortArray9464[i];
			aShortArray9464[i] = i_859_;
		}
		if (aClass131_9485 == null && aClass131_9484 != null)
			aClass131_9484.anInterface15_1558 = null;
		if (aClass131_9485 != null)
			aClass131_9485.anInterface15_1558 = null;
		if (aClass131_9481 != null)
			aClass131_9481.anInterface15_1558 = null;
		if (aClass119_9509 != null)
			aClass119_9509.anInterface18_1474 = null;
		aBool9465 = false;
	}

	public int method2683() {
		return anInt9451;
	}

	public void method2758() {
		for (int i = 0; i < anInt9459; i++)
			anIntArray9496[i] = -anIntArray9496[i];
		for (int i = 0; i < anInt9511; i++)
			aShortArray9468[i] = (short) -aShortArray9468[i];
		for (int i = 0; i < anInt9515; i++) {
			short i_860_ = aShortArray9450[i];
			aShortArray9450[i] = aShortArray9464[i];
			aShortArray9464[i] = i_860_;
		}
		if (aClass131_9485 == null && aClass131_9484 != null)
			aClass131_9484.anInterface15_1558 = null;
		if (aClass131_9485 != null)
			aClass131_9485.anInterface15_1558 = null;
		if (aClass131_9481 != null)
			aClass131_9481.anInterface15_1558 = null;
		if (aClass119_9509 != null)
			aClass119_9509.anInterface18_1474 = null;
		aBool9465 = false;
	}

	public void method2836() {
		for (int i = 0; i < anInt9459; i++)
			anIntArray9496[i] = -anIntArray9496[i];
		for (int i = 0; i < anInt9511; i++)
			aShortArray9468[i] = (short) -aShortArray9468[i];
		for (int i = 0; i < anInt9515; i++) {
			short i_861_ = aShortArray9450[i];
			aShortArray9450[i] = aShortArray9464[i];
			aShortArray9464[i] = i_861_;
		}
		if (aClass131_9485 == null && aClass131_9484 != null)
			aClass131_9484.anInterface15_1558 = null;
		if (aClass131_9485 != null)
			aClass131_9485.anInterface15_1558 = null;
		if (aClass131_9481 != null)
			aClass131_9481.anInterface15_1558 = null;
		if (aClass119_9509 != null)
			aClass119_9509.anInterface18_1474 = null;
		aBool9465 = false;
	}

	public void method2760(int i, int i_862_, int i_863_) {
		for (int i_864_ = 0; i_864_ < anInt9459; i_864_++) {
			if (i != 128)
				anIntArray9460[i_864_] = anIntArray9460[i_864_] * i >> 7;
			if (i_862_ != 128)
				anIntArray9461[i_864_] = anIntArray9461[i_864_] * i_862_ >> 7;
			if (i_863_ != 128)
				anIntArray9496[i_864_] = anIntArray9496[i_864_] * i_863_ >> 7;
		}
		if (aClass131_9481 != null)
			aClass131_9481.anInterface15_1558 = null;
		aBool9465 = false;
	}

	public void method2832(int i, int i_865_, int i_866_) {
		for (int i_867_ = 0; i_867_ < anInt9459; i_867_++) {
			if (i != 128)
				anIntArray9460[i_867_] = anIntArray9460[i_867_] * i >> 7;
			if (i_865_ != 128)
				anIntArray9461[i_867_] = anIntArray9461[i_867_] * i_865_ >> 7;
			if (i_866_ != 128)
				anIntArray9496[i_867_] = anIntArray9496[i_867_] * i_866_ >> 7;
		}
		if (aClass131_9481 != null)
			aClass131_9481.anInterface15_1558 = null;
		aBool9465 = false;
	}

	public void method2783(Class435 class435, Class180 class180, int i) {
		if ((i & 0x2) != 0)
			OpenGL.glPolygonMode(1032, 6913);
		if (anInt9511 != 0) {
			Class441 class441 = aClass178_Sub1_9486.aClass441_9292;
			Class441 class441_868_ = aClass178_Sub1_9486.aClass441_9332;
			Class441 class441_869_ = aClass178_Sub1_9486.aClass441_9333;
			class441_868_.method7090(class435);
			class441_869_.method7086(class441_868_);
			class441_869_.method7089(aClass178_Sub1_9486.aClass441_9365);
			if (!aBool9465)
				method14870();
			float[] fs = aClass178_Sub1_9486.aFloatArray9322;
			class441_868_.method7185(0.0F, (float) aShort9494, 0.0F, fs);
			float f = fs[0];
			float f_870_ = fs[1];
			float f_871_ = fs[2];
			class441_868_.method7185(0.0F, (float) aShort9505, 0.0F, fs);
			float f_872_ = fs[0];
			float f_873_ = fs[1];
			float f_874_ = fs[2];
			for (int i_875_ = 0; i_875_ < 6; i_875_++) {
				float[] fs_876_ = aClass178_Sub1_9486.aFloatArrayArray9415[i_875_];
				float f_877_ = (fs_876_[0] * f + fs_876_[1] * f_870_ + fs_876_[2] * f_871_ + fs_876_[3] + (float) anInt9492);
				float f_878_ = (fs_876_[0] * f_872_ + fs_876_[1] * f_873_ + fs_876_[2] * f_874_ + fs_876_[3] + (float) anInt9492);
				if (f_877_ < 0.0F && f_878_ < 0.0F)
					return;
			}
			if (class180 != null) {
				boolean bool = false;
				boolean bool_879_ = true;
				int i_880_ = aShort9471 + aShort9497 >> 1;
				int i_881_ = aShort9498 + aShort9491 >> 1;
				int i_882_ = i_880_;
				short i_883_ = aShort9494;
				int i_884_ = i_881_;
				float f_885_ = (class441_869_.aFloatArray4916[0] * (float) i_882_ + class441_869_.aFloatArray4916[4] * (float) i_883_ + class441_869_.aFloatArray4916[8] * (float) i_884_ + class441_869_.aFloatArray4916[12]);
				float f_886_ = (class441_869_.aFloatArray4916[1] * (float) i_882_ + class441_869_.aFloatArray4916[5] * (float) i_883_ + class441_869_.aFloatArray4916[9] * (float) i_884_ + class441_869_.aFloatArray4916[13]);
				float f_887_ = (class441_869_.aFloatArray4916[2] * (float) i_882_ + class441_869_.aFloatArray4916[6] * (float) i_883_ + class441_869_.aFloatArray4916[10] * (float) i_884_ + class441_869_.aFloatArray4916[14]);
				float f_888_ = (class441_869_.aFloatArray4916[3] * (float) i_882_ + class441_869_.aFloatArray4916[7] * (float) i_883_ + class441_869_.aFloatArray4916[11] * (float) i_884_ + class441_869_.aFloatArray4916[15]);
				if (f_887_ >= -f_888_) {
					class180.anInt1999 = (int) (aClass178_Sub1_9486.aFloat9274 + (aClass178_Sub1_9486.aFloat9363 * f_885_ / f_888_));
					class180.anInt2002 = (int) (aClass178_Sub1_9486.aFloat9284 + (aClass178_Sub1_9486.aFloat9326 * f_886_ / f_888_));
				} else
					bool = true;
				i_882_ = i_880_;
				i_883_ = aShort9505;
				i_884_ = i_881_;
				float f_889_ = (class441_869_.aFloatArray4916[0] * (float) i_882_ + class441_869_.aFloatArray4916[4] * (float) i_883_ + class441_869_.aFloatArray4916[8] * (float) i_884_ + class441_869_.aFloatArray4916[12]);
				float f_890_ = (class441_869_.aFloatArray4916[1] * (float) i_882_ + class441_869_.aFloatArray4916[5] * (float) i_883_ + class441_869_.aFloatArray4916[9] * (float) i_884_ + class441_869_.aFloatArray4916[13]);
				float f_891_ = (class441_869_.aFloatArray4916[2] * (float) i_882_ + class441_869_.aFloatArray4916[6] * (float) i_883_ + class441_869_.aFloatArray4916[10] * (float) i_884_ + class441_869_.aFloatArray4916[14]);
				float f_892_ = (class441_869_.aFloatArray4916[3] * (float) i_882_ + class441_869_.aFloatArray4916[7] * (float) i_883_ + class441_869_.aFloatArray4916[11] * (float) i_884_ + class441_869_.aFloatArray4916[15]);
				if (f_891_ >= -f_892_) {
					class180.anInt1998 = (int) (aClass178_Sub1_9486.aFloat9274 + (aClass178_Sub1_9486.aFloat9363 * f_889_ / f_892_));
					class180.anInt2003 = (int) (aClass178_Sub1_9486.aFloat9284 + (aClass178_Sub1_9486.aFloat9326 * f_890_ / f_892_));
				} else
					bool = true;
				if (bool) {
					if (f_887_ < -f_888_ && f_891_ < -f_892_)
						bool_879_ = false;
					else if (f_887_ < -f_888_) {
						float f_893_ = (f_887_ + f_888_) / (f_891_ + f_892_) - 1.0F;
						float f_894_ = f_885_ + f_893_ * (f_889_ - f_885_);
						float f_895_ = f_886_ + f_893_ * (f_890_ - f_886_);
						float f_896_ = f_888_ + f_893_ * (f_892_ - f_888_);
						class180.anInt1999 = (int) (aClass178_Sub1_9486.aFloat9274 + (aClass178_Sub1_9486.aFloat9363 * f_894_ / f_896_));
						class180.anInt2002 = (int) (aClass178_Sub1_9486.aFloat9284 + (aClass178_Sub1_9486.aFloat9326 * f_895_ / f_896_));
					} else if (f_891_ < -f_892_) {
						float f_897_ = (f_891_ + f_892_) / (f_887_ + f_888_) - 1.0F;
						float f_898_ = f_889_ + f_897_ * (f_885_ - f_889_);
						float f_899_ = f_890_ + f_897_ * (f_886_ - f_890_);
						float f_900_ = f_892_ + f_897_ * (f_888_ - f_892_);
						class180.anInt1998 = (int) (aClass178_Sub1_9486.aFloat9274 + (aClass178_Sub1_9486.aFloat9363 * f_898_ / f_900_));
						class180.anInt2003 = (int) (aClass178_Sub1_9486.aFloat9284 + (aClass178_Sub1_9486.aFloat9326 * f_899_ / f_900_));
					}
				}
				if (bool_879_) {
					if (f_887_ / f_888_ > f_891_ / f_892_) {
						float f_901_ = (f_885_ + (class441.aFloatArray4916[0] * (float) anInt9492) + class441.aFloatArray4916[12]);
						float f_902_ = (f_888_ + (class441.aFloatArray4916[3] * (float) anInt9492) + class441.aFloatArray4916[15]);
						class180.anInt2001 = (int) (aClass178_Sub1_9486.aFloat9274 - (float) class180.anInt1999 + (aClass178_Sub1_9486.aFloat9363 * f_901_ / f_902_));
					} else {
						float f_903_ = (f_889_ + (class441.aFloatArray4916[0] * (float) anInt9492) + class441.aFloatArray4916[12]);
						float f_904_ = (f_892_ + (class441.aFloatArray4916[3] * (float) anInt9492) + class441.aFloatArray4916[15]);
						class180.anInt2001 = (int) (aClass178_Sub1_9486.aFloat9274 - (float) class180.anInt1998 + (aClass178_Sub1_9486.aFloat9363 * f_903_ / f_904_));
					}
					class180.aBool2000 = true;
				}
			}
			aClass178_Sub1_9486.method14619();
			aClass178_Sub1_9486.method14637(class441_868_);
			method14874();
			aClass178_Sub1_9486.method14638();
			class441_868_.method7089(aClass178_Sub1_9486.aClass441_9316);
			method14875(class441_868_);
			if ((i & 0x2) != 0)
				OpenGL.glPolygonMode(1028, 6914);
		}
	}

	static byte[] method14878(byte[] is, int i) {
		byte[] is_905_ = new byte[i];
		System.arraycopy(is, 0, is_905_, 0, i);
		return is_905_;
	}

	void method2774() {
		for (int i = 0; i < anInt9499; i++) {
			anIntArray9460[i] = anIntArray9460[i] + 7 >> 4;
			anIntArray9461[i] = anIntArray9461[i] + 7 >> 4;
			anIntArray9496[i] = anIntArray9496[i] + 7 >> 4;
		}
		if (aClass131_9481 != null)
			aClass131_9481.anInterface15_1558 = null;
		aBool9465 = false;
	}

	boolean method2770() {
		if (anIntArrayArray9463 == null)
			return false;
		for (int i = 0; i < anInt9499; i++) {
			anIntArray9460[i] <<= 4;
			anIntArray9461[i] <<= 4;
			anIntArray9496[i] <<= 4;
		}
		anInt9516 = 0;
		anInt9517 = 0;
		anInt9518 = 0;
		return true;
	}

	void method2851() {
		/* empty */
	}

	int method14879(int i, short i_906_, int i_907_, byte i_908_) {
		int i_909_ = Class710.anIntArray8839[method14877(i, i_907_)];
		if (i_906_ != -1) {
			Class177 class177 = aClass178_Sub1_9486.aClass172_1916.method2895(i_906_ & 0xffff, 292819061);
			int i_910_ = class177.aByte1912 & 0xff;
			if (i_910_ != 0) {
				int i_911_;
				if (i_907_ < 0)
					i_911_ = 0;
				else if (i_907_ > 127)
					i_911_ = 16777215;
				else
					i_911_ = 131586 * i_907_;
				if (i_910_ == 256)
					i_909_ = i_911_;
				else {
					int i_912_ = i_910_;
					int i_913_ = 256 - i_910_;
					i_909_ = ((((i_911_ & 0xff00ff) * i_912_ + (i_909_ & 0xff00ff) * i_913_) & ~0xff00ff) + (((i_911_ & 0xff00) * i_912_ + (i_909_ & 0xff00) * i_913_) & 0xff0000)) >> 8;
				}
			}
			int i_914_ = class177.aByte1883 & 0xff;
			if (i_914_ != 0) {
				i_914_ += 256;
				int i_915_ = ((i_909_ & 0xff0000) >> 16) * i_914_;
				if (i_915_ > 65535)
					i_915_ = 65535;
				int i_916_ = ((i_909_ & 0xff00) >> 8) * i_914_;
				if (i_916_ > 65535)
					i_916_ = 65535;
				int i_917_ = (i_909_ & 0xff) * i_914_;
				if (i_917_ > 65535)
					i_917_ = 65535;
				i_909_ = (i_915_ << 8 & 0xff0000) + (i_916_ & 0xff00) + (i_917_ >> 8);
			}
		}
		return i_909_ << 8 | 255 - (i_908_ & 0xff);
	}

	boolean method2768() {
		if (anIntArrayArray9463 == null)
			return false;
		for (int i = 0; i < anInt9499; i++) {
			anIntArray9460[i] <<= 4;
			anIntArray9461[i] <<= 4;
			anIntArray9496[i] <<= 4;
		}
		anInt9516 = 0;
		anInt9517 = 0;
		anInt9518 = 0;
		return true;
	}

	void method2840() {
		/* empty */
	}

	Class167 method14880(Class167_Sub3 class167_sub3_918_, Class167_Sub3 class167_sub3_919_, int i, boolean bool, boolean bool_920_) {
		class167_sub3_918_.aByte9454 = (byte) 0;
		class167_sub3_918_.anInt9451 = i;
		class167_sub3_918_.anInt9458 = anInt9458;
		class167_sub3_918_.aShort9495 = aShort9495;
		class167_sub3_918_.aShort9455 = aShort9455;
		class167_sub3_918_.anInt9499 = anInt9499;
		class167_sub3_918_.anInt9459 = anInt9459;
		class167_sub3_918_.anInt9511 = anInt9511;
		class167_sub3_918_.anInt9515 = anInt9515;
		class167_sub3_918_.anInt9474 = anInt9474;
		class167_sub3_918_.anInt9507 = anInt9507;
		if ((i & 0x100) != 0)
			class167_sub3_918_.aBool9456 = true;
		else
			class167_sub3_918_.aBool9456 = aBool9456;
		class167_sub3_918_.aBool9469 = aBool9469;
		boolean bool_921_ = Class127.method2145(i, anInt9458);
		boolean bool_922_ = Class127.method2169(i, anInt9458);
		boolean bool_923_ = Class127.method2193(i, anInt9458);
		boolean bool_924_ = bool_921_ | bool_922_ | bool_923_;
		if (bool_924_) {
			if (bool_921_) {
				if (class167_sub3_919_.anIntArray9460 == null || class167_sub3_919_.anIntArray9460.length < anInt9499)
					class167_sub3_918_.anIntArray9460 = class167_sub3_919_.anIntArray9460 = new int[anInt9499];
				else
					class167_sub3_918_.anIntArray9460 = class167_sub3_919_.anIntArray9460;
			} else
				class167_sub3_918_.anIntArray9460 = anIntArray9460;
			if (bool_922_) {
				if (class167_sub3_919_.anIntArray9461 == null || class167_sub3_919_.anIntArray9461.length < anInt9499)
					class167_sub3_918_.anIntArray9461 = class167_sub3_919_.anIntArray9461 = new int[anInt9499];
				else
					class167_sub3_918_.anIntArray9461 = class167_sub3_919_.anIntArray9461;
			} else
				class167_sub3_918_.anIntArray9461 = anIntArray9461;
			if (bool_923_) {
				if (class167_sub3_919_.anIntArray9496 == null || class167_sub3_919_.anIntArray9496.length < anInt9499)
					class167_sub3_918_.anIntArray9496 = class167_sub3_919_.anIntArray9496 = new int[anInt9499];
				else
					class167_sub3_918_.anIntArray9496 = class167_sub3_919_.anIntArray9496;
			} else
				class167_sub3_918_.anIntArray9496 = anIntArray9496;
			for (int i_925_ = 0; i_925_ < anInt9499; i_925_++) {
				if (bool_921_)
					class167_sub3_918_.anIntArray9460[i_925_] = anIntArray9460[i_925_];
				if (bool_922_)
					class167_sub3_918_.anIntArray9461[i_925_] = anIntArray9461[i_925_];
				if (bool_923_)
					class167_sub3_918_.anIntArray9496[i_925_] = anIntArray9496[i_925_];
			}
		} else {
			class167_sub3_918_.anIntArray9460 = anIntArray9460;
			class167_sub3_918_.anIntArray9461 = anIntArray9461;
			class167_sub3_918_.anIntArray9496 = anIntArray9496;
		}
		if (Class127.method2162(i, anInt9458)) {
			if (bool)
				class167_sub3_918_.aByte9454 |= 0x1;
			class167_sub3_918_.aClass131_9481 = class167_sub3_919_.aClass131_9481;
			class167_sub3_918_.aClass131_9481.aByte1555 = aClass131_9481.aByte1555;
			class167_sub3_918_.aClass131_9481.anInterface15_1558 = aClass131_9481.anInterface15_1558;
		} else if (Class127.method2156(i, anInt9458))
			class167_sub3_918_.aClass131_9481 = aClass131_9481;
		else
			class167_sub3_918_.aClass131_9481 = null;
		if (Class127.method2150(i, anInt9458)) {
			if (class167_sub3_919_.aShortArray9489 == null || class167_sub3_919_.aShortArray9489.length < anInt9515)
				class167_sub3_918_.aShortArray9489 = class167_sub3_919_.aShortArray9489 = new short[anInt9515];
			else
				class167_sub3_918_.aShortArray9489 = class167_sub3_919_.aShortArray9489;
			for (int i_926_ = 0; i_926_ < anInt9515; i_926_++)
				class167_sub3_918_.aShortArray9489[i_926_] = aShortArray9489[i_926_];
		} else
			class167_sub3_918_.aShortArray9489 = aShortArray9489;
		if (Class127.method2194(i, anInt9458)) {
			if (class167_sub3_919_.aByteArray9476 == null || class167_sub3_919_.aByteArray9476.length < anInt9515)
				class167_sub3_918_.aByteArray9476 = class167_sub3_919_.aByteArray9476 = new byte[anInt9515];
			else
				class167_sub3_918_.aByteArray9476 = class167_sub3_919_.aByteArray9476;
			for (int i_927_ = 0; i_927_ < anInt9515; i_927_++)
				class167_sub3_918_.aByteArray9476[i_927_] = aByteArray9476[i_927_];
		} else
			class167_sub3_918_.aByteArray9476 = aByteArray9476;
		if (Class127.method2147(i, anInt9458)) {
			if (bool)
				class167_sub3_918_.aByte9454 |= 0x2;
			class167_sub3_918_.aClass131_9484 = class167_sub3_919_.aClass131_9484;
			class167_sub3_918_.aClass131_9484.aByte1555 = aClass131_9484.aByte1555;
			class167_sub3_918_.aClass131_9484.anInterface15_1558 = aClass131_9484.anInterface15_1558;
		} else if (Class127.method2159(i, anInt9458))
			class167_sub3_918_.aClass131_9484 = aClass131_9484;
		else
			class167_sub3_918_.aClass131_9484 = null;
		if (Class127.method2149(i, anInt9458)) {
			if (class167_sub3_919_.aShortArray9493 == null || class167_sub3_919_.aShortArray9493.length < anInt9511) {
				int i_928_ = anInt9511;
				class167_sub3_918_.aShortArray9493 = class167_sub3_919_.aShortArray9493 = new short[i_928_];
				class167_sub3_918_.aShortArray9467 = class167_sub3_919_.aShortArray9467 = new short[i_928_];
				class167_sub3_918_.aShortArray9468 = class167_sub3_919_.aShortArray9468 = new short[i_928_];
			} else {
				class167_sub3_918_.aShortArray9493 = class167_sub3_919_.aShortArray9493;
				class167_sub3_918_.aShortArray9467 = class167_sub3_919_.aShortArray9467;
				class167_sub3_918_.aShortArray9468 = class167_sub3_919_.aShortArray9468;
			}
			if (aClass151_9470 != null) {
				if (class167_sub3_919_.aClass151_9470 == null)
					class167_sub3_919_.aClass151_9470 = new Class151();
				Class151 class151 = (class167_sub3_918_.aClass151_9470 = class167_sub3_919_.aClass151_9470);
				if (class151.aShortArray1729 == null || class151.aShortArray1729.length < anInt9511) {
					int i_929_ = anInt9511;
					class151.aShortArray1729 = new short[i_929_];
					class151.aShortArray1726 = new short[i_929_];
					class151.aShortArray1728 = new short[i_929_];
					class151.aByteArray1727 = new byte[i_929_];
				}
				for (int i_930_ = 0; i_930_ < anInt9511; i_930_++) {
					class167_sub3_918_.aShortArray9493[i_930_] = aShortArray9493[i_930_];
					class167_sub3_918_.aShortArray9467[i_930_] = aShortArray9467[i_930_];
					class167_sub3_918_.aShortArray9468[i_930_] = aShortArray9468[i_930_];
					class151.aShortArray1729[i_930_] = aClass151_9470.aShortArray1729[i_930_];
					class151.aShortArray1726[i_930_] = aClass151_9470.aShortArray1726[i_930_];
					class151.aShortArray1728[i_930_] = aClass151_9470.aShortArray1728[i_930_];
					class151.aByteArray1727[i_930_] = aClass151_9470.aByteArray1727[i_930_];
				}
			} else {
				for (int i_931_ = 0; i_931_ < anInt9511; i_931_++) {
					class167_sub3_918_.aShortArray9493[i_931_] = aShortArray9493[i_931_];
					class167_sub3_918_.aShortArray9467[i_931_] = aShortArray9467[i_931_];
					class167_sub3_918_.aShortArray9468[i_931_] = aShortArray9468[i_931_];
				}
			}
			class167_sub3_918_.aByteArray9487 = aByteArray9487;
		} else {
			class167_sub3_918_.aClass151_9470 = aClass151_9470;
			class167_sub3_918_.aShortArray9493 = aShortArray9493;
			class167_sub3_918_.aShortArray9467 = aShortArray9467;
			class167_sub3_918_.aShortArray9468 = aShortArray9468;
			class167_sub3_918_.aByteArray9487 = aByteArray9487;
		}
		if (Class127.method2237(i, anInt9458)) {
			if (bool)
				class167_sub3_918_.aByte9454 |= 0x4;
			class167_sub3_918_.aClass131_9485 = class167_sub3_919_.aClass131_9485;
			class167_sub3_918_.aClass131_9485.aByte1555 = aClass131_9485.aByte1555;
			class167_sub3_918_.aClass131_9485.anInterface15_1558 = aClass131_9485.anInterface15_1558;
		} else if (Class127.method2157(i, anInt9458))
			class167_sub3_918_.aClass131_9485 = aClass131_9485;
		else
			class167_sub3_918_.aClass131_9485 = null;
		if (Class127.method2152(i, anInt9458)) {
			if (class167_sub3_919_.aFloatArray9453 == null || class167_sub3_919_.aFloatArray9453.length < anInt9515) {
				int i_932_ = anInt9511;
				class167_sub3_918_.aFloatArray9453 = class167_sub3_919_.aFloatArray9453 = new float[i_932_];
				class167_sub3_918_.aFloatArray9472 = class167_sub3_919_.aFloatArray9472 = new float[i_932_];
			} else {
				class167_sub3_918_.aFloatArray9453 = class167_sub3_919_.aFloatArray9453;
				class167_sub3_918_.aFloatArray9472 = class167_sub3_919_.aFloatArray9472;
			}
			for (int i_933_ = 0; i_933_ < anInt9511; i_933_++) {
				class167_sub3_918_.aFloatArray9453[i_933_] = aFloatArray9453[i_933_];
				class167_sub3_918_.aFloatArray9472[i_933_] = aFloatArray9472[i_933_];
			}
		} else {
			class167_sub3_918_.aFloatArray9453 = aFloatArray9453;
			class167_sub3_918_.aFloatArray9472 = aFloatArray9472;
		}
		if (Class127.method2165(i, anInt9458)) {
			if (bool)
				class167_sub3_918_.aByte9454 |= 0x8;
			class167_sub3_918_.aClass131_9457 = class167_sub3_919_.aClass131_9457;
			class167_sub3_918_.aClass131_9457.aByte1555 = aClass131_9457.aByte1555;
			class167_sub3_918_.aClass131_9457.anInterface15_1558 = aClass131_9457.anInterface15_1558;
		} else if (Class127.method2189(i, anInt9458))
			class167_sub3_918_.aClass131_9457 = aClass131_9457;
		else
			class167_sub3_918_.aClass131_9457 = null;
		if (Class127.method2153(i, anInt9458)) {
			if (class167_sub3_919_.aShortArray9450 == null || class167_sub3_919_.aShortArray9450.length < anInt9515) {
				int i_934_ = anInt9515;
				class167_sub3_918_.aShortArray9450 = class167_sub3_919_.aShortArray9450 = new short[i_934_];
				class167_sub3_918_.aShortArray9478 = class167_sub3_919_.aShortArray9478 = new short[i_934_];
				class167_sub3_918_.aShortArray9464 = class167_sub3_919_.aShortArray9464 = new short[i_934_];
			} else {
				class167_sub3_918_.aShortArray9450 = class167_sub3_919_.aShortArray9450;
				class167_sub3_918_.aShortArray9478 = class167_sub3_919_.aShortArray9478;
				class167_sub3_918_.aShortArray9464 = class167_sub3_919_.aShortArray9464;
			}
			for (int i_935_ = 0; i_935_ < anInt9515; i_935_++) {
				class167_sub3_918_.aShortArray9450[i_935_] = aShortArray9450[i_935_];
				class167_sub3_918_.aShortArray9478[i_935_] = aShortArray9478[i_935_];
				class167_sub3_918_.aShortArray9464[i_935_] = aShortArray9464[i_935_];
			}
		} else {
			class167_sub3_918_.aShortArray9450 = aShortArray9450;
			class167_sub3_918_.aShortArray9478 = aShortArray9478;
			class167_sub3_918_.aShortArray9464 = aShortArray9464;
		}
		if (Class127.method2183(i, anInt9458)) {
			if (bool)
				class167_sub3_918_.aByte9454 |= 0x10;
			class167_sub3_918_.aClass119_9509 = class167_sub3_919_.aClass119_9509;
			class167_sub3_918_.aClass119_9509.anInterface18_1474 = aClass119_9509.anInterface18_1474;
		} else if (Class127.method2158(i, anInt9458))
			class167_sub3_918_.aClass119_9509 = aClass119_9509;
		else
			class167_sub3_918_.aClass119_9509 = null;
		if (Class127.method2154(i, anInt9458)) {
			if (class167_sub3_919_.aShortArray9473 == null || class167_sub3_919_.aShortArray9473.length < anInt9515) {
				int i_936_ = anInt9515;
				class167_sub3_918_.aShortArray9473 = class167_sub3_919_.aShortArray9473 = new short[i_936_];
			} else
				class167_sub3_918_.aShortArray9473 = class167_sub3_919_.aShortArray9473;
			for (int i_937_ = 0; i_937_ < anInt9515; i_937_++)
				class167_sub3_918_.aShortArray9473[i_937_] = aShortArray9473[i_937_];
		} else
			class167_sub3_918_.aShortArray9473 = aShortArray9473;
		if (Class127.method2155(i, anInt9458)) {
			if (class167_sub3_919_.aClass133Array9479 == null || class167_sub3_919_.aClass133Array9479.length < anInt9507) {
				int i_938_ = anInt9507;
				class167_sub3_918_.aClass133Array9479 = class167_sub3_919_.aClass133Array9479 = new Class133[i_938_];
				for (int i_939_ = 0; i_939_ < anInt9507; i_939_++)
					class167_sub3_918_.aClass133Array9479[i_939_] = aClass133Array9479[i_939_].method2264();
			} else {
				class167_sub3_918_.aClass133Array9479 = class167_sub3_919_.aClass133Array9479;
				for (int i_940_ = 0; i_940_ < anInt9507; i_940_++)
					class167_sub3_918_.aClass133Array9479[i_940_].method2262(aClass133Array9479[i_940_]);
			}
		} else
			class167_sub3_918_.aClass133Array9479 = aClass133Array9479;
		class167_sub3_918_.aClass161Array9508 = aClass161Array9508;
		if (aBool9465) {
			class167_sub3_918_.anInt9443 = anInt9443;
			class167_sub3_918_.anInt9492 = anInt9492;
			class167_sub3_918_.aShort9471 = aShort9471;
			class167_sub3_918_.aShort9497 = aShort9497;
			class167_sub3_918_.aShort9494 = aShort9494;
			class167_sub3_918_.aShort9505 = aShort9505;
			class167_sub3_918_.aShort9498 = aShort9498;
			class167_sub3_918_.aShort9491 = aShort9491;
			class167_sub3_918_.aBool9465 = true;
		} else
			class167_sub3_918_.aBool9465 = false;
		if (aBool9500) {
			class167_sub3_918_.aShort9501 = aShort9501;
			class167_sub3_918_.aBool9500 = true;
		} else
			class167_sub3_918_.aBool9500 = false;
		class167_sub3_918_.anIntArrayArray9463 = anIntArrayArray9463;
		class167_sub3_918_.anIntArrayArray9475 = anIntArrayArray9475;
		class167_sub3_918_.anIntArrayArray9480 = anIntArrayArray9480;
		class167_sub3_918_.aShortArray9504 = aShortArray9504;
		class167_sub3_918_.anIntArray9503 = anIntArray9503;
		class167_sub3_918_.aShortArray9466 = aShortArray9466;
		class167_sub3_918_.aShortArray9482 = aShortArray9482;
		class167_sub3_918_.anIntArray9502 = anIntArray9502;
		class167_sub3_918_.aClass184Array9449 = aClass184Array9449;
		class167_sub3_918_.aClass143Array9506 = aClass143Array9506;
		return class167_sub3_918_;
	}

	void method2704() {
		for (int i = 0; i < anInt9499; i++) {
			anIntArray9460[i] = anIntArray9460[i] + 7 >> 4;
			anIntArray9461[i] = anIntArray9461[i] + 7 >> 4;
			anIntArray9496[i] = anIntArray9496[i] + 7 >> 4;
		}
		if (aClass131_9481 != null)
			aClass131_9481.anInterface15_1558 = null;
		aBool9465 = false;
	}

	Class167 method14881(Class167_Sub3 class167_sub3_941_, Class167_Sub3 class167_sub3_942_, int i, boolean bool, boolean bool_943_) {
		class167_sub3_941_.aByte9454 = (byte) 0;
		class167_sub3_941_.anInt9451 = i;
		class167_sub3_941_.anInt9458 = anInt9458;
		class167_sub3_941_.aShort9495 = aShort9495;
		class167_sub3_941_.aShort9455 = aShort9455;
		class167_sub3_941_.anInt9499 = anInt9499;
		class167_sub3_941_.anInt9459 = anInt9459;
		class167_sub3_941_.anInt9511 = anInt9511;
		class167_sub3_941_.anInt9515 = anInt9515;
		class167_sub3_941_.anInt9474 = anInt9474;
		class167_sub3_941_.anInt9507 = anInt9507;
		if ((i & 0x100) != 0)
			class167_sub3_941_.aBool9456 = true;
		else
			class167_sub3_941_.aBool9456 = aBool9456;
		class167_sub3_941_.aBool9469 = aBool9469;
		boolean bool_944_ = Class127.method2145(i, anInt9458);
		boolean bool_945_ = Class127.method2169(i, anInt9458);
		boolean bool_946_ = Class127.method2193(i, anInt9458);
		boolean bool_947_ = bool_944_ | bool_945_ | bool_946_;
		if (bool_947_) {
			if (bool_944_) {
				if (class167_sub3_942_.anIntArray9460 == null || class167_sub3_942_.anIntArray9460.length < anInt9499)
					class167_sub3_941_.anIntArray9460 = class167_sub3_942_.anIntArray9460 = new int[anInt9499];
				else
					class167_sub3_941_.anIntArray9460 = class167_sub3_942_.anIntArray9460;
			} else
				class167_sub3_941_.anIntArray9460 = anIntArray9460;
			if (bool_945_) {
				if (class167_sub3_942_.anIntArray9461 == null || class167_sub3_942_.anIntArray9461.length < anInt9499)
					class167_sub3_941_.anIntArray9461 = class167_sub3_942_.anIntArray9461 = new int[anInt9499];
				else
					class167_sub3_941_.anIntArray9461 = class167_sub3_942_.anIntArray9461;
			} else
				class167_sub3_941_.anIntArray9461 = anIntArray9461;
			if (bool_946_) {
				if (class167_sub3_942_.anIntArray9496 == null || class167_sub3_942_.anIntArray9496.length < anInt9499)
					class167_sub3_941_.anIntArray9496 = class167_sub3_942_.anIntArray9496 = new int[anInt9499];
				else
					class167_sub3_941_.anIntArray9496 = class167_sub3_942_.anIntArray9496;
			} else
				class167_sub3_941_.anIntArray9496 = anIntArray9496;
			for (int i_948_ = 0; i_948_ < anInt9499; i_948_++) {
				if (bool_944_)
					class167_sub3_941_.anIntArray9460[i_948_] = anIntArray9460[i_948_];
				if (bool_945_)
					class167_sub3_941_.anIntArray9461[i_948_] = anIntArray9461[i_948_];
				if (bool_946_)
					class167_sub3_941_.anIntArray9496[i_948_] = anIntArray9496[i_948_];
			}
		} else {
			class167_sub3_941_.anIntArray9460 = anIntArray9460;
			class167_sub3_941_.anIntArray9461 = anIntArray9461;
			class167_sub3_941_.anIntArray9496 = anIntArray9496;
		}
		if (Class127.method2162(i, anInt9458)) {
			if (bool)
				class167_sub3_941_.aByte9454 |= 0x1;
			class167_sub3_941_.aClass131_9481 = class167_sub3_942_.aClass131_9481;
			class167_sub3_941_.aClass131_9481.aByte1555 = aClass131_9481.aByte1555;
			class167_sub3_941_.aClass131_9481.anInterface15_1558 = aClass131_9481.anInterface15_1558;
		} else if (Class127.method2156(i, anInt9458))
			class167_sub3_941_.aClass131_9481 = aClass131_9481;
		else
			class167_sub3_941_.aClass131_9481 = null;
		if (Class127.method2150(i, anInt9458)) {
			if (class167_sub3_942_.aShortArray9489 == null || class167_sub3_942_.aShortArray9489.length < anInt9515)
				class167_sub3_941_.aShortArray9489 = class167_sub3_942_.aShortArray9489 = new short[anInt9515];
			else
				class167_sub3_941_.aShortArray9489 = class167_sub3_942_.aShortArray9489;
			for (int i_949_ = 0; i_949_ < anInt9515; i_949_++)
				class167_sub3_941_.aShortArray9489[i_949_] = aShortArray9489[i_949_];
		} else
			class167_sub3_941_.aShortArray9489 = aShortArray9489;
		if (Class127.method2194(i, anInt9458)) {
			if (class167_sub3_942_.aByteArray9476 == null || class167_sub3_942_.aByteArray9476.length < anInt9515)
				class167_sub3_941_.aByteArray9476 = class167_sub3_942_.aByteArray9476 = new byte[anInt9515];
			else
				class167_sub3_941_.aByteArray9476 = class167_sub3_942_.aByteArray9476;
			for (int i_950_ = 0; i_950_ < anInt9515; i_950_++)
				class167_sub3_941_.aByteArray9476[i_950_] = aByteArray9476[i_950_];
		} else
			class167_sub3_941_.aByteArray9476 = aByteArray9476;
		if (Class127.method2147(i, anInt9458)) {
			if (bool)
				class167_sub3_941_.aByte9454 |= 0x2;
			class167_sub3_941_.aClass131_9484 = class167_sub3_942_.aClass131_9484;
			class167_sub3_941_.aClass131_9484.aByte1555 = aClass131_9484.aByte1555;
			class167_sub3_941_.aClass131_9484.anInterface15_1558 = aClass131_9484.anInterface15_1558;
		} else if (Class127.method2159(i, anInt9458))
			class167_sub3_941_.aClass131_9484 = aClass131_9484;
		else
			class167_sub3_941_.aClass131_9484 = null;
		if (Class127.method2149(i, anInt9458)) {
			if (class167_sub3_942_.aShortArray9493 == null || class167_sub3_942_.aShortArray9493.length < anInt9511) {
				int i_951_ = anInt9511;
				class167_sub3_941_.aShortArray9493 = class167_sub3_942_.aShortArray9493 = new short[i_951_];
				class167_sub3_941_.aShortArray9467 = class167_sub3_942_.aShortArray9467 = new short[i_951_];
				class167_sub3_941_.aShortArray9468 = class167_sub3_942_.aShortArray9468 = new short[i_951_];
			} else {
				class167_sub3_941_.aShortArray9493 = class167_sub3_942_.aShortArray9493;
				class167_sub3_941_.aShortArray9467 = class167_sub3_942_.aShortArray9467;
				class167_sub3_941_.aShortArray9468 = class167_sub3_942_.aShortArray9468;
			}
			if (aClass151_9470 != null) {
				if (class167_sub3_942_.aClass151_9470 == null)
					class167_sub3_942_.aClass151_9470 = new Class151();
				Class151 class151 = (class167_sub3_941_.aClass151_9470 = class167_sub3_942_.aClass151_9470);
				if (class151.aShortArray1729 == null || class151.aShortArray1729.length < anInt9511) {
					int i_952_ = anInt9511;
					class151.aShortArray1729 = new short[i_952_];
					class151.aShortArray1726 = new short[i_952_];
					class151.aShortArray1728 = new short[i_952_];
					class151.aByteArray1727 = new byte[i_952_];
				}
				for (int i_953_ = 0; i_953_ < anInt9511; i_953_++) {
					class167_sub3_941_.aShortArray9493[i_953_] = aShortArray9493[i_953_];
					class167_sub3_941_.aShortArray9467[i_953_] = aShortArray9467[i_953_];
					class167_sub3_941_.aShortArray9468[i_953_] = aShortArray9468[i_953_];
					class151.aShortArray1729[i_953_] = aClass151_9470.aShortArray1729[i_953_];
					class151.aShortArray1726[i_953_] = aClass151_9470.aShortArray1726[i_953_];
					class151.aShortArray1728[i_953_] = aClass151_9470.aShortArray1728[i_953_];
					class151.aByteArray1727[i_953_] = aClass151_9470.aByteArray1727[i_953_];
				}
			} else {
				for (int i_954_ = 0; i_954_ < anInt9511; i_954_++) {
					class167_sub3_941_.aShortArray9493[i_954_] = aShortArray9493[i_954_];
					class167_sub3_941_.aShortArray9467[i_954_] = aShortArray9467[i_954_];
					class167_sub3_941_.aShortArray9468[i_954_] = aShortArray9468[i_954_];
				}
			}
			class167_sub3_941_.aByteArray9487 = aByteArray9487;
		} else {
			class167_sub3_941_.aClass151_9470 = aClass151_9470;
			class167_sub3_941_.aShortArray9493 = aShortArray9493;
			class167_sub3_941_.aShortArray9467 = aShortArray9467;
			class167_sub3_941_.aShortArray9468 = aShortArray9468;
			class167_sub3_941_.aByteArray9487 = aByteArray9487;
		}
		if (Class127.method2237(i, anInt9458)) {
			if (bool)
				class167_sub3_941_.aByte9454 |= 0x4;
			class167_sub3_941_.aClass131_9485 = class167_sub3_942_.aClass131_9485;
			class167_sub3_941_.aClass131_9485.aByte1555 = aClass131_9485.aByte1555;
			class167_sub3_941_.aClass131_9485.anInterface15_1558 = aClass131_9485.anInterface15_1558;
		} else if (Class127.method2157(i, anInt9458))
			class167_sub3_941_.aClass131_9485 = aClass131_9485;
		else
			class167_sub3_941_.aClass131_9485 = null;
		if (Class127.method2152(i, anInt9458)) {
			if (class167_sub3_942_.aFloatArray9453 == null || class167_sub3_942_.aFloatArray9453.length < anInt9515) {
				int i_955_ = anInt9511;
				class167_sub3_941_.aFloatArray9453 = class167_sub3_942_.aFloatArray9453 = new float[i_955_];
				class167_sub3_941_.aFloatArray9472 = class167_sub3_942_.aFloatArray9472 = new float[i_955_];
			} else {
				class167_sub3_941_.aFloatArray9453 = class167_sub3_942_.aFloatArray9453;
				class167_sub3_941_.aFloatArray9472 = class167_sub3_942_.aFloatArray9472;
			}
			for (int i_956_ = 0; i_956_ < anInt9511; i_956_++) {
				class167_sub3_941_.aFloatArray9453[i_956_] = aFloatArray9453[i_956_];
				class167_sub3_941_.aFloatArray9472[i_956_] = aFloatArray9472[i_956_];
			}
		} else {
			class167_sub3_941_.aFloatArray9453 = aFloatArray9453;
			class167_sub3_941_.aFloatArray9472 = aFloatArray9472;
		}
		if (Class127.method2165(i, anInt9458)) {
			if (bool)
				class167_sub3_941_.aByte9454 |= 0x8;
			class167_sub3_941_.aClass131_9457 = class167_sub3_942_.aClass131_9457;
			class167_sub3_941_.aClass131_9457.aByte1555 = aClass131_9457.aByte1555;
			class167_sub3_941_.aClass131_9457.anInterface15_1558 = aClass131_9457.anInterface15_1558;
		} else if (Class127.method2189(i, anInt9458))
			class167_sub3_941_.aClass131_9457 = aClass131_9457;
		else
			class167_sub3_941_.aClass131_9457 = null;
		if (Class127.method2153(i, anInt9458)) {
			if (class167_sub3_942_.aShortArray9450 == null || class167_sub3_942_.aShortArray9450.length < anInt9515) {
				int i_957_ = anInt9515;
				class167_sub3_941_.aShortArray9450 = class167_sub3_942_.aShortArray9450 = new short[i_957_];
				class167_sub3_941_.aShortArray9478 = class167_sub3_942_.aShortArray9478 = new short[i_957_];
				class167_sub3_941_.aShortArray9464 = class167_sub3_942_.aShortArray9464 = new short[i_957_];
			} else {
				class167_sub3_941_.aShortArray9450 = class167_sub3_942_.aShortArray9450;
				class167_sub3_941_.aShortArray9478 = class167_sub3_942_.aShortArray9478;
				class167_sub3_941_.aShortArray9464 = class167_sub3_942_.aShortArray9464;
			}
			for (int i_958_ = 0; i_958_ < anInt9515; i_958_++) {
				class167_sub3_941_.aShortArray9450[i_958_] = aShortArray9450[i_958_];
				class167_sub3_941_.aShortArray9478[i_958_] = aShortArray9478[i_958_];
				class167_sub3_941_.aShortArray9464[i_958_] = aShortArray9464[i_958_];
			}
		} else {
			class167_sub3_941_.aShortArray9450 = aShortArray9450;
			class167_sub3_941_.aShortArray9478 = aShortArray9478;
			class167_sub3_941_.aShortArray9464 = aShortArray9464;
		}
		if (Class127.method2183(i, anInt9458)) {
			if (bool)
				class167_sub3_941_.aByte9454 |= 0x10;
			class167_sub3_941_.aClass119_9509 = class167_sub3_942_.aClass119_9509;
			class167_sub3_941_.aClass119_9509.anInterface18_1474 = aClass119_9509.anInterface18_1474;
		} else if (Class127.method2158(i, anInt9458))
			class167_sub3_941_.aClass119_9509 = aClass119_9509;
		else
			class167_sub3_941_.aClass119_9509 = null;
		if (Class127.method2154(i, anInt9458)) {
			if (class167_sub3_942_.aShortArray9473 == null || class167_sub3_942_.aShortArray9473.length < anInt9515) {
				int i_959_ = anInt9515;
				class167_sub3_941_.aShortArray9473 = class167_sub3_942_.aShortArray9473 = new short[i_959_];
			} else
				class167_sub3_941_.aShortArray9473 = class167_sub3_942_.aShortArray9473;
			for (int i_960_ = 0; i_960_ < anInt9515; i_960_++)
				class167_sub3_941_.aShortArray9473[i_960_] = aShortArray9473[i_960_];
		} else
			class167_sub3_941_.aShortArray9473 = aShortArray9473;
		if (Class127.method2155(i, anInt9458)) {
			if (class167_sub3_942_.aClass133Array9479 == null || class167_sub3_942_.aClass133Array9479.length < anInt9507) {
				int i_961_ = anInt9507;
				class167_sub3_941_.aClass133Array9479 = class167_sub3_942_.aClass133Array9479 = new Class133[i_961_];
				for (int i_962_ = 0; i_962_ < anInt9507; i_962_++)
					class167_sub3_941_.aClass133Array9479[i_962_] = aClass133Array9479[i_962_].method2264();
			} else {
				class167_sub3_941_.aClass133Array9479 = class167_sub3_942_.aClass133Array9479;
				for (int i_963_ = 0; i_963_ < anInt9507; i_963_++)
					class167_sub3_941_.aClass133Array9479[i_963_].method2262(aClass133Array9479[i_963_]);
			}
		} else
			class167_sub3_941_.aClass133Array9479 = aClass133Array9479;
		class167_sub3_941_.aClass161Array9508 = aClass161Array9508;
		if (aBool9465) {
			class167_sub3_941_.anInt9443 = anInt9443;
			class167_sub3_941_.anInt9492 = anInt9492;
			class167_sub3_941_.aShort9471 = aShort9471;
			class167_sub3_941_.aShort9497 = aShort9497;
			class167_sub3_941_.aShort9494 = aShort9494;
			class167_sub3_941_.aShort9505 = aShort9505;
			class167_sub3_941_.aShort9498 = aShort9498;
			class167_sub3_941_.aShort9491 = aShort9491;
			class167_sub3_941_.aBool9465 = true;
		} else
			class167_sub3_941_.aBool9465 = false;
		if (aBool9500) {
			class167_sub3_941_.aShort9501 = aShort9501;
			class167_sub3_941_.aBool9500 = true;
		} else
			class167_sub3_941_.aBool9500 = false;
		class167_sub3_941_.anIntArrayArray9463 = anIntArrayArray9463;
		class167_sub3_941_.anIntArrayArray9475 = anIntArrayArray9475;
		class167_sub3_941_.anIntArrayArray9480 = anIntArrayArray9480;
		class167_sub3_941_.aShortArray9504 = aShortArray9504;
		class167_sub3_941_.anIntArray9503 = anIntArray9503;
		class167_sub3_941_.aShortArray9466 = aShortArray9466;
		class167_sub3_941_.aShortArray9482 = aShortArray9482;
		class167_sub3_941_.anIntArray9502 = anIntArray9502;
		class167_sub3_941_.aClass184Array9449 = aClass184Array9449;
		class167_sub3_941_.aClass143Array9506 = aClass143Array9506;
		return class167_sub3_941_;
	}

	void method2835() {
		for (int i = 0; i < anInt9499; i++) {
			anIntArray9460[i] = anIntArray9460[i] + 7 >> 4;
			anIntArray9461[i] = anIntArray9461[i] + 7 >> 4;
			anIntArray9496[i] = anIntArray9496[i] + 7 >> 4;
		}
		if (aClass131_9481 != null)
			aClass131_9481.anInterface15_1558 = null;
		aBool9465 = false;
	}

	public void method2821(int i, int i_964_, int i_965_, int i_966_) {
		for (int i_967_ = 0; i_967_ < anInt9515; i_967_++) {
			int i_968_ = aShortArray9489[i_967_] & 0xffff;
			int i_969_ = i_968_ >> 10 & 0x3f;
			int i_970_ = i_968_ >> 7 & 0x7;
			int i_971_ = i_968_ & 0x7f;
			if (i != -1)
				i_969_ += (i - i_969_) * i_966_ >> 7;
			if (i_964_ != -1)
				i_970_ += (i_964_ - i_970_) * i_966_ >> 7;
			if (i_965_ != -1)
				i_971_ += (i_965_ - i_971_) * i_966_ >> 7;
			aShortArray9489[i_967_] = (short) (i_969_ << 10 | i_970_ << 7 | i_971_);
		}
		if (aClass161Array9508 != null) {
			for (int i_972_ = 0; i_972_ < anInt9507; i_972_++) {
				Class161 class161 = aClass161Array9508[i_972_];
				Class133 class133 = aClass133Array9479[i_972_];
				class133.anInt1577 = (class133.anInt1577 & ~0xffffff | ((Class710.anIntArray8839[aShortArray9489[class161.anInt1764] & 0xffff]) & 0xffffff));
			}
		}
		if (aClass131_9484 != null)
			aClass131_9484.anInterface15_1558 = null;
	}

	void method2729() {
		for (int i = 0; i < anInt9499; i++) {
			anIntArray9460[i] = anIntArray9460[i] + 7 >> 4;
			anIntArray9461[i] = anIntArray9461[i] + 7 >> 4;
			anIntArray9496[i] = anIntArray9496[i] + 7 >> 4;
		}
		if (aClass131_9481 != null)
			aClass131_9481.anInterface15_1558 = null;
		aBool9465 = false;
	}

	public void method2817(short i, short i_973_) {
		Class172 class172 = aClass178_Sub1_9486.aClass172_1916;
		for (int i_974_ = 0; i_974_ < anInt9515; i_974_++) {
			if (aShortArray9473[i_974_] == i)
				aShortArray9473[i_974_] = i_973_;
		}
		byte i_975_ = 0;
		byte i_976_ = 0;
		if (i != -1) {
			Class177 class177 = class172.method2895(i & 0xffff, -1482600193);
			i_975_ = class177.aByte1912;
			i_976_ = class177.aByte1883;
		}
		byte i_977_ = 0;
		byte i_978_ = 0;
		if (i_973_ != -1) {
			Class177 class177 = class172.method2895(i_973_ & 0xffff, -566351134);
			i_977_ = class177.aByte1912;
			i_978_ = class177.aByte1883;
			if (class177.aByte1885 != 0 || class177.aByte1886 != 0)
				aBool9469 = true;
		}
		if (i_975_ != i_977_ | i_976_ != i_978_) {
			if (aClass161Array9508 != null) {
				for (int i_979_ = 0; i_979_ < anInt9507; i_979_++) {
					Class161 class161 = aClass161Array9508[i_979_];
					Class133 class133 = aClass133Array9479[i_979_];
					class133.anInt1577 = (class133.anInt1577 & ~0xffffff | ((Class710.anIntArray8839[aShortArray9489[class161.anInt1764] & 0xffff]) & 0xffffff));
				}
			}
			if (aClass131_9484 != null)
				aClass131_9484.anInterface15_1558 = null;
		}
	}

	void method14882() {
		if (aBool9490) {
			aBool9490 = false;
			if (aClass184Array9449 == null && aClass143Array9506 == null && aClass161Array9508 == null && !Class127.method2166(anInt9451, anInt9458)) {
				boolean bool = false;
				boolean bool_980_ = false;
				boolean bool_981_ = false;
				if (anIntArray9460 != null && !Class127.method2167(anInt9451, anInt9458)) {
					if (aClass131_9481 == null || aClass131_9481.anInterface15_1558 != null) {
						if (!aBool9465)
							method14870();
						bool = true;
					} else
						aBool9490 = true;
				}
				if (anIntArray9461 != null && !Class127.method2168(anInt9451, anInt9458)) {
					if (aClass131_9481 == null || aClass131_9481.anInterface15_1558 != null) {
						if (!aBool9465)
							method14870();
						bool_980_ = true;
					} else
						aBool9490 = true;
				}
				if (anIntArray9496 != null && !Class127.method2213(anInt9451, anInt9458)) {
					if (aClass131_9481 == null || aClass131_9481.anInterface15_1558 != null) {
						if (!aBool9465)
							method14870();
						bool_981_ = true;
					} else
						aBool9490 = true;
				}
				if (bool)
					anIntArray9460 = null;
				if (bool_980_)
					anIntArray9461 = null;
				if (bool_981_)
					anIntArray9496 = null;
			}
			if (aShortArray9504 != null && anIntArray9460 == null && anIntArray9461 == null && anIntArray9496 == null) {
				aShortArray9504 = null;
				anIntArray9503 = null;
			}
			if (aByteArray9487 != null && !Class127.method2170(anInt9451, anInt9458)) {
				if (aClass131_9485 != null) {
					if (aClass131_9485.anInterface15_1558 != null) {
						aShortArray9468 = null;
						aShortArray9467 = null;
						aShortArray9493 = null;
						aByteArray9487 = null;
					} else
						aBool9490 = true;
				} else if (aClass131_9484 == null || aClass131_9484.anInterface15_1558 != null) {
					aShortArray9468 = null;
					aShortArray9467 = null;
					aShortArray9493 = null;
					aByteArray9487 = null;
				} else
					aBool9490 = true;
			}
			if (aShortArray9489 != null && !Class127.method2171(anInt9451, anInt9458)) {
				if (aClass131_9484 == null || aClass131_9484.anInterface15_1558 != null)
					aShortArray9489 = null;
				else
					aBool9490 = true;
			}
			if (aByteArray9476 != null && !Class127.method2242(anInt9451, anInt9458)) {
				if (aClass131_9484 == null || aClass131_9484.anInterface15_1558 != null)
					aByteArray9476 = null;
				else
					aBool9490 = true;
			}
			if (aFloatArray9453 != null && !Class127.method2172(anInt9451, anInt9458)) {
				if (aClass131_9457 == null || aClass131_9457.anInterface15_1558 != null) {
					aFloatArray9472 = null;
					aFloatArray9453 = null;
				} else
					aBool9490 = true;
			}
			if (aShortArray9473 != null && !Class127.method2177(anInt9451, anInt9458)) {
				if (aClass131_9484 == null || aClass131_9484.anInterface15_1558 != null)
					aShortArray9473 = null;
				else
					aBool9490 = true;
			}
			if (aShortArray9450 != null && !Class127.method2176(anInt9451, anInt9458)) {
				if ((aClass119_9509 == null || aClass119_9509.anInterface18_1474 != null) && (aClass131_9484 == null || aClass131_9484.anInterface15_1558 != null)) {
					aShortArray9464 = null;
					aShortArray9478 = null;
					aShortArray9450 = null;
				} else
					aBool9490 = true;
			}
			if (anIntArrayArray9475 != null && !Class127.method2201(anInt9451, anInt9458)) {
				anIntArrayArray9475 = null;
				aShortArray9482 = null;
			}
			if (anIntArrayArray9463 != null && !Class127.method2174(anInt9451, anInt9458)) {
				anIntArrayArray9463 = null;
				aShortArray9466 = null;
			}
			if (anIntArrayArray9480 != null && !Class127.method2175(anInt9451, anInt9458))
				anIntArrayArray9480 = null;
			if (anIntArray9502 != null && (anInt9451 & 0x800) == 0 && (anInt9451 & 0x40000) == 0)
				anIntArray9502 = null;
		}
	}

	public void method2682(int i) {
		int i_982_ = Class433.anIntArray4880[i];
		int i_983_ = Class433.anIntArray4881[i];
		for (int i_984_ = 0; i_984_ < anInt9459; i_984_++) {
			int i_985_ = ((anIntArray9461[i_984_] * i_982_ + anIntArray9460[i_984_] * i_983_) >> 14);
			anIntArray9461[i_984_] = (anIntArray9461[i_984_] * i_983_ - anIntArray9460[i_984_] * i_982_) >> 14;
			anIntArray9460[i_984_] = i_985_;
		}
		if (aClass131_9481 != null)
			aClass131_9481.anInterface15_1558 = null;
		aBool9465 = false;
	}

	void method2777(int i, int[] is, int i_986_, int i_987_, int i_988_, int i_989_, boolean bool) {
		int i_990_ = is.length;
		if (i == 0) {
			i_986_ <<= 4;
			i_987_ <<= 4;
			i_988_ <<= 4;
			int i_991_ = 0;
			anInt9516 = 0;
			anInt9517 = 0;
			anInt9518 = 0;
			for (int i_992_ = 0; i_992_ < i_990_; i_992_++) {
				int i_993_ = is[i_992_];
				if (i_993_ < anIntArrayArray9463.length) {
					int[] is_994_ = anIntArrayArray9463[i_993_];
					for (int i_995_ = 0; i_995_ < is_994_.length; i_995_++) {
						int i_996_ = is_994_[i_995_];
						anInt9516 += anIntArray9460[i_996_];
						anInt9517 += anIntArray9461[i_996_];
						anInt9518 += anIntArray9496[i_996_];
						i_991_++;
					}
				}
			}
			if (i_991_ > 0) {
				anInt9516 = anInt9516 / i_991_ + i_986_;
				anInt9517 = anInt9517 / i_991_ + i_987_;
				anInt9518 = anInt9518 / i_991_ + i_988_;
			} else {
				anInt9516 = i_986_;
				anInt9517 = i_987_;
				anInt9518 = i_988_;
			}
		} else if (i == 1) {
			i_986_ <<= 4;
			i_987_ <<= 4;
			i_988_ <<= 4;
			for (int i_997_ = 0; i_997_ < i_990_; i_997_++) {
				int i_998_ = is[i_997_];
				if (i_998_ < anIntArrayArray9463.length) {
					int[] is_999_ = anIntArrayArray9463[i_998_];
					for (int i_1000_ = 0; i_1000_ < is_999_.length; i_1000_++) {
						int i_1001_ = is_999_[i_1000_];
						anIntArray9460[i_1001_] += i_986_;
						anIntArray9461[i_1001_] += i_987_;
						anIntArray9496[i_1001_] += i_988_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_1002_ = 0; i_1002_ < i_990_; i_1002_++) {
				int i_1003_ = is[i_1002_];
				if (i_1003_ < anIntArrayArray9463.length) {
					int[] is_1004_ = anIntArrayArray9463[i_1003_];
					if ((i_989_ & 0x1) == 0) {
						for (int i_1005_ = 0; i_1005_ < is_1004_.length; i_1005_++) {
							int i_1006_ = is_1004_[i_1005_];
							anIntArray9460[i_1006_] -= anInt9516;
							anIntArray9461[i_1006_] -= anInt9517;
							anIntArray9496[i_1006_] -= anInt9518;
							if (i_988_ != 0) {
								int i_1007_ = Class433.anIntArray4880[i_988_];
								int i_1008_ = Class433.anIntArray4881[i_988_];
								int i_1009_ = ((anIntArray9461[i_1006_] * i_1007_ + anIntArray9460[i_1006_] * i_1008_ + 16383) >> 14);
								anIntArray9461[i_1006_] = (anIntArray9461[i_1006_] * i_1008_ - anIntArray9460[i_1006_] * i_1007_ + 16383) >> 14;
								anIntArray9460[i_1006_] = i_1009_;
							}
							if (i_986_ != 0) {
								int i_1010_ = Class433.anIntArray4880[i_986_];
								int i_1011_ = Class433.anIntArray4881[i_986_];
								int i_1012_ = ((anIntArray9461[i_1006_] * i_1011_ - anIntArray9496[i_1006_] * i_1010_ + 16383) >> 14);
								anIntArray9496[i_1006_] = (anIntArray9461[i_1006_] * i_1010_ + anIntArray9496[i_1006_] * i_1011_ + 16383) >> 14;
								anIntArray9461[i_1006_] = i_1012_;
							}
							if (i_987_ != 0) {
								int i_1013_ = Class433.anIntArray4880[i_987_];
								int i_1014_ = Class433.anIntArray4881[i_987_];
								int i_1015_ = ((anIntArray9496[i_1006_] * i_1013_ + anIntArray9460[i_1006_] * i_1014_ + 16383) >> 14);
								anIntArray9496[i_1006_] = (anIntArray9496[i_1006_] * i_1014_ - anIntArray9460[i_1006_] * i_1013_ + 16383) >> 14;
								anIntArray9460[i_1006_] = i_1015_;
							}
							anIntArray9460[i_1006_] += anInt9516;
							anIntArray9461[i_1006_] += anInt9517;
							anIntArray9496[i_1006_] += anInt9518;
						}
					} else {
						for (int i_1016_ = 0; i_1016_ < is_1004_.length; i_1016_++) {
							int i_1017_ = is_1004_[i_1016_];
							anIntArray9460[i_1017_] -= anInt9516;
							anIntArray9461[i_1017_] -= anInt9517;
							anIntArray9496[i_1017_] -= anInt9518;
							if (i_986_ != 0) {
								int i_1018_ = Class433.anIntArray4880[i_986_];
								int i_1019_ = Class433.anIntArray4881[i_986_];
								int i_1020_ = ((anIntArray9461[i_1017_] * i_1019_ - anIntArray9496[i_1017_] * i_1018_ + 16383) >> 14);
								anIntArray9496[i_1017_] = (anIntArray9461[i_1017_] * i_1018_ + anIntArray9496[i_1017_] * i_1019_ + 16383) >> 14;
								anIntArray9461[i_1017_] = i_1020_;
							}
							if (i_988_ != 0) {
								int i_1021_ = Class433.anIntArray4880[i_988_];
								int i_1022_ = Class433.anIntArray4881[i_988_];
								int i_1023_ = ((anIntArray9461[i_1017_] * i_1021_ + anIntArray9460[i_1017_] * i_1022_ + 16383) >> 14);
								anIntArray9461[i_1017_] = (anIntArray9461[i_1017_] * i_1022_ - anIntArray9460[i_1017_] * i_1021_ + 16383) >> 14;
								anIntArray9460[i_1017_] = i_1023_;
							}
							if (i_987_ != 0) {
								int i_1024_ = Class433.anIntArray4880[i_987_];
								int i_1025_ = Class433.anIntArray4881[i_987_];
								int i_1026_ = ((anIntArray9496[i_1017_] * i_1024_ + anIntArray9460[i_1017_] * i_1025_ + 16383) >> 14);
								anIntArray9496[i_1017_] = (anIntArray9496[i_1017_] * i_1025_ - anIntArray9460[i_1017_] * i_1024_ + 16383) >> 14;
								anIntArray9460[i_1017_] = i_1026_;
							}
							anIntArray9460[i_1017_] += anInt9516;
							anIntArray9461[i_1017_] += anInt9517;
							anIntArray9496[i_1017_] += anInt9518;
						}
					}
				}
			}
			if (bool) {
				for (int i_1027_ = 0; i_1027_ < i_990_; i_1027_++) {
					int i_1028_ = is[i_1027_];
					if (i_1028_ < anIntArrayArray9463.length) {
						int[] is_1029_ = anIntArrayArray9463[i_1028_];
						for (int i_1030_ = 0; i_1030_ < is_1029_.length; i_1030_++) {
							int i_1031_ = is_1029_[i_1030_];
							int i_1032_ = anIntArray9503[i_1031_];
							int i_1033_ = anIntArray9503[i_1031_ + 1];
							for (int i_1034_ = i_1032_; (i_1034_ < i_1033_ && aShortArray9504[i_1034_] != 0); i_1034_++) {
								int i_1035_ = (aShortArray9504[i_1034_] & 0xffff) - 1;
								if (i_988_ != 0) {
									int i_1036_ = Class433.anIntArray4880[i_988_];
									int i_1037_ = Class433.anIntArray4881[i_988_];
									int i_1038_ = (aShortArray9467[i_1035_] * i_1036_ + aShortArray9493[i_1035_] * i_1037_ + 16383) >> 14;
									aShortArray9467[i_1035_] = (short) (((aShortArray9467[i_1035_] * i_1037_) - (aShortArray9493[i_1035_] * i_1036_) + 16383) >> 14);
									aShortArray9493[i_1035_] = (short) i_1038_;
								}
								if (i_986_ != 0) {
									int i_1039_ = Class433.anIntArray4880[i_986_];
									int i_1040_ = Class433.anIntArray4881[i_986_];
									int i_1041_ = (aShortArray9467[i_1035_] * i_1040_ - aShortArray9468[i_1035_] * i_1039_ + 16383) >> 14;
									aShortArray9468[i_1035_] = (short) (((aShortArray9467[i_1035_] * i_1039_) + (aShortArray9468[i_1035_] * i_1040_) + 16383) >> 14);
									aShortArray9467[i_1035_] = (short) i_1041_;
								}
								if (i_987_ != 0) {
									int i_1042_ = Class433.anIntArray4880[i_987_];
									int i_1043_ = Class433.anIntArray4881[i_987_];
									int i_1044_ = (aShortArray9468[i_1035_] * i_1042_ + aShortArray9493[i_1035_] * i_1043_ + 16383) >> 14;
									aShortArray9468[i_1035_] = (short) (((aShortArray9468[i_1035_] * i_1043_) - (aShortArray9493[i_1035_] * i_1042_) + 16383) >> 14);
									aShortArray9493[i_1035_] = (short) i_1044_;
								}
							}
						}
					}
				}
				if (aClass131_9485 == null && aClass131_9484 != null)
					aClass131_9484.anInterface15_1558 = null;
				if (aClass131_9485 != null)
					aClass131_9485.anInterface15_1558 = null;
			}
		} else if (i == 3) {
			for (int i_1045_ = 0; i_1045_ < i_990_; i_1045_++) {
				int i_1046_ = is[i_1045_];
				if (i_1046_ < anIntArrayArray9463.length) {
					int[] is_1047_ = anIntArrayArray9463[i_1046_];
					for (int i_1048_ = 0; i_1048_ < is_1047_.length; i_1048_++) {
						int i_1049_ = is_1047_[i_1048_];
						anIntArray9460[i_1049_] -= anInt9516;
						anIntArray9461[i_1049_] -= anInt9517;
						anIntArray9496[i_1049_] -= anInt9518;
						anIntArray9460[i_1049_] = anIntArray9460[i_1049_] * i_986_ >> 7;
						anIntArray9461[i_1049_] = anIntArray9461[i_1049_] * i_987_ >> 7;
						anIntArray9496[i_1049_] = anIntArray9496[i_1049_] * i_988_ >> 7;
						anIntArray9460[i_1049_] += anInt9516;
						anIntArray9461[i_1049_] += anInt9517;
						anIntArray9496[i_1049_] += anInt9518;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9475 != null) {
				for (int i_1050_ = 0; i_1050_ < i_990_; i_1050_++) {
					int i_1051_ = is[i_1050_];
					if (i_1051_ < anIntArrayArray9475.length) {
						int[] is_1052_ = anIntArrayArray9475[i_1051_];
						for (int i_1053_ = 0; i_1053_ < is_1052_.length; i_1053_++) {
							int i_1054_ = is_1052_[i_1053_];
							int i_1055_ = ((aByteArray9476[i_1054_] & 0xff) + i_986_ * 8);
							if (i_1055_ < 0)
								i_1055_ = 0;
							else if (i_1055_ > 255)
								i_1055_ = 255;
							aByteArray9476[i_1054_] = (byte) i_1055_;
						}
						if (is_1052_.length > 0 && aClass131_9484 != null)
							aClass131_9484.anInterface15_1558 = null;
					}
				}
				if (aClass161Array9508 != null) {
					for (int i_1056_ = 0; i_1056_ < anInt9507; i_1056_++) {
						Class161 class161 = aClass161Array9508[i_1056_];
						Class133 class133 = aClass133Array9479[i_1056_];
						class133.anInt1577 = (class133.anInt1577 & 0xffffff | 255 - (aByteArray9476[class161.anInt1764] & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9475 != null) {
				for (int i_1057_ = 0; i_1057_ < i_990_; i_1057_++) {
					int i_1058_ = is[i_1057_];
					if (i_1058_ < anIntArrayArray9475.length) {
						int[] is_1059_ = anIntArrayArray9475[i_1058_];
						for (int i_1060_ = 0; i_1060_ < is_1059_.length; i_1060_++) {
							int i_1061_ = is_1059_[i_1060_];
							int i_1062_ = aShortArray9489[i_1061_] & 0xffff;
							int i_1063_ = i_1062_ >> 10 & 0x3f;
							int i_1064_ = i_1062_ >> 7 & 0x7;
							int i_1065_ = i_1062_ & 0x7f;
							i_1063_ = i_1063_ + i_986_ & 0x3f;
							i_1064_ += i_987_ / 4;
							if (i_1064_ < 0)
								i_1064_ = 0;
							else if (i_1064_ > 7)
								i_1064_ = 7;
							i_1065_ += i_988_;
							if (i_1065_ < 0)
								i_1065_ = 0;
							else if (i_1065_ > 127)
								i_1065_ = 127;
							aShortArray9489[i_1061_] = (short) (i_1063_ << 10 | i_1064_ << 7 | i_1065_);
						}
						if (is_1059_.length > 0 && aClass131_9484 != null)
							aClass131_9484.anInterface15_1558 = null;
					}
				}
				if (aClass161Array9508 != null) {
					for (int i_1066_ = 0; i_1066_ < anInt9507; i_1066_++) {
						Class161 class161 = aClass161Array9508[i_1066_];
						Class133 class133 = aClass133Array9479[i_1066_];
						class133.anInt1577 = (class133.anInt1577 & ~0xffffff | (Class710.anIntArray8839[(aShortArray9489[class161.anInt1764] & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9480 != null) {
				for (int i_1067_ = 0; i_1067_ < i_990_; i_1067_++) {
					int i_1068_ = is[i_1067_];
					if (i_1068_ < anIntArrayArray9480.length) {
						int[] is_1069_ = anIntArrayArray9480[i_1068_];
						for (int i_1070_ = 0; i_1070_ < is_1069_.length; i_1070_++) {
							Class133 class133 = aClass133Array9479[is_1069_[i_1070_]];
							class133.anInt1575 += i_986_;
							class133.anInt1572 += i_987_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9480 != null) {
				for (int i_1071_ = 0; i_1071_ < i_990_; i_1071_++) {
					int i_1072_ = is[i_1071_];
					if (i_1072_ < anIntArrayArray9480.length) {
						int[] is_1073_ = anIntArrayArray9480[i_1072_];
						for (int i_1074_ = 0; i_1074_ < is_1073_.length; i_1074_++) {
							Class133 class133 = aClass133Array9479[is_1073_[i_1074_]];
							class133.anInt1576 = class133.anInt1576 * i_986_ >> 7;
							class133.anInt1573 = class133.anInt1573 * i_987_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9480 != null) {
				for (int i_1075_ = 0; i_1075_ < i_990_; i_1075_++) {
					int i_1076_ = is[i_1075_];
					if (i_1076_ < anIntArrayArray9480.length) {
						int[] is_1077_ = anIntArrayArray9480[i_1076_];
						for (int i_1078_ = 0; i_1078_ < is_1077_.length; i_1078_++) {
							Class133 class133 = aClass133Array9479[is_1077_[i_1078_]];
							class133.anInt1574 = class133.anInt1574 + i_986_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	void method2795(int i, int i_1079_, int i_1080_, int i_1081_) {
		if (i == 0) {
			int i_1082_ = 0;
			anInt9516 = 0;
			anInt9517 = 0;
			anInt9518 = 0;
			for (int i_1083_ = 0; i_1083_ < anInt9459; i_1083_++) {
				anInt9516 += anIntArray9460[i_1083_];
				anInt9517 += anIntArray9461[i_1083_];
				anInt9518 += anIntArray9496[i_1083_];
				i_1082_++;
			}
			if (i_1082_ > 0) {
				anInt9516 = anInt9516 / i_1082_ + i_1079_;
				anInt9517 = anInt9517 / i_1082_ + i_1080_;
				anInt9518 = anInt9518 / i_1082_ + i_1081_;
			} else {
				anInt9516 = i_1079_;
				anInt9517 = i_1080_;
				anInt9518 = i_1081_;
			}
		} else if (i == 1) {
			for (int i_1084_ = 0; i_1084_ < anInt9459; i_1084_++) {
				anIntArray9460[i_1084_] += i_1079_;
				anIntArray9461[i_1084_] += i_1080_;
				anIntArray9496[i_1084_] += i_1081_;
			}
		} else if (i == 2) {
			for (int i_1085_ = 0; i_1085_ < anInt9459; i_1085_++) {
				anIntArray9460[i_1085_] -= anInt9516;
				anIntArray9461[i_1085_] -= anInt9517;
				anIntArray9496[i_1085_] -= anInt9518;
				if (i_1081_ != 0) {
					int i_1086_ = Class433.anIntArray4880[i_1081_];
					int i_1087_ = Class433.anIntArray4881[i_1081_];
					int i_1088_ = ((anIntArray9461[i_1085_] * i_1086_ + anIntArray9460[i_1085_] * i_1087_ + 16383) >> 14);
					anIntArray9461[i_1085_] = (anIntArray9461[i_1085_] * i_1087_ - anIntArray9460[i_1085_] * i_1086_ + 16383) >> 14;
					anIntArray9460[i_1085_] = i_1088_;
				}
				if (i_1079_ != 0) {
					int i_1089_ = Class433.anIntArray4880[i_1079_];
					int i_1090_ = Class433.anIntArray4881[i_1079_];
					int i_1091_ = ((anIntArray9461[i_1085_] * i_1090_ - anIntArray9496[i_1085_] * i_1089_ + 16383) >> 14);
					anIntArray9496[i_1085_] = (anIntArray9461[i_1085_] * i_1089_ + anIntArray9496[i_1085_] * i_1090_ + 16383) >> 14;
					anIntArray9461[i_1085_] = i_1091_;
				}
				if (i_1080_ != 0) {
					int i_1092_ = Class433.anIntArray4880[i_1080_];
					int i_1093_ = Class433.anIntArray4881[i_1080_];
					int i_1094_ = ((anIntArray9496[i_1085_] * i_1092_ + anIntArray9460[i_1085_] * i_1093_ + 16383) >> 14);
					anIntArray9496[i_1085_] = (anIntArray9496[i_1085_] * i_1093_ - anIntArray9460[i_1085_] * i_1092_ + 16383) >> 14;
					anIntArray9460[i_1085_] = i_1094_;
				}
				anIntArray9460[i_1085_] += anInt9516;
				anIntArray9461[i_1085_] += anInt9517;
				anIntArray9496[i_1085_] += anInt9518;
			}
		} else if (i == 3) {
			for (int i_1095_ = 0; i_1095_ < anInt9459; i_1095_++) {
				anIntArray9460[i_1095_] -= anInt9516;
				anIntArray9461[i_1095_] -= anInt9517;
				anIntArray9496[i_1095_] -= anInt9518;
				anIntArray9460[i_1095_] = anIntArray9460[i_1095_] * i_1079_ / 128;
				anIntArray9461[i_1095_] = anIntArray9461[i_1095_] * i_1080_ / 128;
				anIntArray9496[i_1095_] = anIntArray9496[i_1095_] * i_1081_ / 128;
				anIntArray9460[i_1095_] += anInt9516;
				anIntArray9461[i_1095_] += anInt9517;
				anIntArray9496[i_1095_] += anInt9518;
			}
		} else if (i == 5) {
			for (int i_1096_ = 0; i_1096_ < anInt9515; i_1096_++) {
				int i_1097_ = (aByteArray9476[i_1096_] & 0xff) + i_1079_ * 8;
				if (i_1097_ < 0)
					i_1097_ = 0;
				else if (i_1097_ > 255)
					i_1097_ = 255;
				aByteArray9476[i_1096_] = (byte) i_1097_;
			}
			if (aClass131_9484 != null)
				aClass131_9484.anInterface15_1558 = null;
			if (aClass161Array9508 != null) {
				for (int i_1098_ = 0; i_1098_ < anInt9507; i_1098_++) {
					Class161 class161 = aClass161Array9508[i_1098_];
					Class133 class133 = aClass133Array9479[i_1098_];
					class133.anInt1577 = (class133.anInt1577 & 0xffffff | (255 - (aByteArray9476[class161.anInt1764] & 0xff) << 24));
				}
			}
		} else if (i == 7) {
			for (int i_1099_ = 0; i_1099_ < anInt9515; i_1099_++) {
				int i_1100_ = aShortArray9489[i_1099_] & 0xffff;
				int i_1101_ = i_1100_ >> 10 & 0x3f;
				int i_1102_ = i_1100_ >> 7 & 0x7;
				int i_1103_ = i_1100_ & 0x7f;
				i_1101_ = i_1101_ + i_1079_ & 0x3f;
				i_1102_ += i_1080_ / 4;
				if (i_1102_ < 0)
					i_1102_ = 0;
				else if (i_1102_ > 7)
					i_1102_ = 7;
				i_1103_ += i_1081_;
				if (i_1103_ < 0)
					i_1103_ = 0;
				else if (i_1103_ > 127)
					i_1103_ = 127;
				aShortArray9489[i_1099_] = (short) (i_1101_ << 10 | i_1102_ << 7 | i_1103_);
			}
			if (aClass131_9484 != null)
				aClass131_9484.anInterface15_1558 = null;
			if (aClass161Array9508 != null) {
				for (int i_1104_ = 0; i_1104_ < anInt9507; i_1104_++) {
					Class161 class161 = aClass161Array9508[i_1104_];
					Class133 class133 = aClass133Array9479[i_1104_];
					class133.anInt1577 = (class133.anInt1577 & ~0xffffff | ((Class710.anIntArray8839[aShortArray9489[class161.anInt1764] & 0xffff]) & 0xffffff));
				}
			}
		} else if (i == 8) {
			for (int i_1105_ = 0; i_1105_ < anInt9507; i_1105_++) {
				Class133 class133 = aClass133Array9479[i_1105_];
				class133.anInt1575 += i_1079_;
				class133.anInt1572 += i_1080_;
			}
		} else if (i == 10) {
			for (int i_1106_ = 0; i_1106_ < anInt9507; i_1106_++) {
				Class133 class133 = aClass133Array9479[i_1106_];
				class133.anInt1576 = class133.anInt1576 * i_1079_ >> 7;
				class133.anInt1573 = class133.anInt1573 * i_1080_ >> 7;
			}
		} else if (i == 9) {
			for (int i_1107_ = 0; i_1107_ < anInt9507; i_1107_++) {
				Class133 class133 = aClass133Array9479[i_1107_];
				class133.anInt1574 = class133.anInt1574 + i_1079_ & 0x3fff;
			}
		}
	}

	public int method2718() {
		if (!aBool9500)
			method2719();
		return aShort9501;
	}

	public Class143[] method2728() {
		return aClass143Array9506;
	}

	public int method2796() {
		if (!aBool9465)
			method14870();
		return anInt9443;
	}

	public int method2736() {
		if (!aBool9465)
			method14870();
		return aShort9505;
	}

	public boolean method2802(int i, int i_1108_, Class435 class435, boolean bool, int i_1109_) {
		Class441 class441 = aClass178_Sub1_9486.aClass441_9332;
		class441.method7090(class435);
		class441.method7089(aClass178_Sub1_9486.aClass441_9365);
		boolean bool_1110_ = false;
		int i_1111_ = 2147483647;
		int i_1112_ = -2147483648;
		int i_1113_ = 2147483647;
		int i_1114_ = -2147483648;
		if (!aBool9465)
			method14870();
		int i_1115_ = aShort9497 - aShort9471 >> 1;
		int i_1116_ = aShort9505 - aShort9494 >> 1;
		int i_1117_ = aShort9491 - aShort9498 >> 1;
		int i_1118_ = aShort9471 + i_1115_;
		int i_1119_ = aShort9494 + i_1116_;
		int i_1120_ = aShort9498 + i_1117_;
		int i_1121_ = i_1118_ - (i_1115_ << i_1109_);
		int i_1122_ = i_1119_ - (i_1116_ << i_1109_);
		int i_1123_ = i_1120_ - (i_1117_ << i_1109_);
		int i_1124_ = i_1118_ + (i_1115_ << i_1109_);
		int i_1125_ = i_1119_ + (i_1116_ << i_1109_);
		int i_1126_ = i_1120_ + (i_1117_ << i_1109_);
		anIntArray9513[0] = i_1121_;
		anIntArray9514[0] = i_1122_;
		anIntArray9483[0] = i_1123_;
		anIntArray9513[1] = i_1124_;
		anIntArray9514[1] = i_1122_;
		anIntArray9483[1] = i_1123_;
		anIntArray9513[2] = i_1121_;
		anIntArray9514[2] = i_1125_;
		anIntArray9483[2] = i_1123_;
		anIntArray9513[3] = i_1124_;
		anIntArray9514[3] = i_1125_;
		anIntArray9483[3] = i_1123_;
		anIntArray9513[4] = i_1121_;
		anIntArray9514[4] = i_1122_;
		anIntArray9483[4] = i_1126_;
		anIntArray9513[5] = i_1124_;
		anIntArray9514[5] = i_1122_;
		anIntArray9483[5] = i_1126_;
		anIntArray9513[6] = i_1121_;
		anIntArray9514[6] = i_1125_;
		anIntArray9483[6] = i_1126_;
		anIntArray9513[7] = i_1124_;
		anIntArray9514[7] = i_1125_;
		anIntArray9483[7] = i_1126_;
		for (int i_1127_ = 0; i_1127_ < 8; i_1127_++) {
			int i_1128_ = anIntArray9513[i_1127_];
			int i_1129_ = anIntArray9514[i_1127_];
			int i_1130_ = anIntArray9483[i_1127_];
			float f = (class441.aFloatArray4916[2] * (float) i_1128_ + class441.aFloatArray4916[6] * (float) i_1129_ + class441.aFloatArray4916[10] * (float) i_1130_ + class441.aFloatArray4916[14]);
			float f_1131_ = (class441.aFloatArray4916[3] * (float) i_1128_ + class441.aFloatArray4916[7] * (float) i_1129_ + class441.aFloatArray4916[11] * (float) i_1130_ + class441.aFloatArray4916[15]);
			if (f >= -f_1131_) {
				float f_1132_ = (class441.aFloatArray4916[0] * (float) i_1128_ + class441.aFloatArray4916[4] * (float) i_1129_ + class441.aFloatArray4916[8] * (float) i_1130_ + class441.aFloatArray4916[12]);
				float f_1133_ = (class441.aFloatArray4916[1] * (float) i_1128_ + class441.aFloatArray4916[5] * (float) i_1129_ + class441.aFloatArray4916[9] * (float) i_1130_ + class441.aFloatArray4916[13]);
				int i_1134_ = (int) (aClass178_Sub1_9486.aFloat9274 + (aClass178_Sub1_9486.aFloat9363 * f_1132_ / f_1131_));
				int i_1135_ = (int) (aClass178_Sub1_9486.aFloat9284 + (aClass178_Sub1_9486.aFloat9326 * f_1133_ / f_1131_));
				if (i_1134_ < i_1111_)
					i_1111_ = i_1134_;
				if (i_1134_ > i_1112_)
					i_1112_ = i_1134_;
				if (i_1135_ < i_1113_)
					i_1113_ = i_1135_;
				if (i_1135_ > i_1114_)
					i_1114_ = i_1135_;
				bool_1110_ = true;
			}
		}
		if (bool_1110_ && i > i_1111_ && i < i_1112_ && i_1108_ > i_1113_ && i_1108_ < i_1114_) {
			if (bool)
				return true;
			if (aClass178_Sub1_9486.anIntArray9294.length < anInt9511) {
				aClass178_Sub1_9486.anIntArray9294 = new int[anInt9511];
				aClass178_Sub1_9486.anIntArray9431 = new int[anInt9511];
			}
			int[] is = aClass178_Sub1_9486.anIntArray9294;
			int[] is_1136_ = aClass178_Sub1_9486.anIntArray9431;
			for (int i_1137_ = 0; i_1137_ < anInt9459; i_1137_++) {
				int i_1138_ = anIntArray9460[i_1137_];
				int i_1139_ = anIntArray9461[i_1137_];
				int i_1140_ = anIntArray9496[i_1137_];
				float f = (class441.aFloatArray4916[2] * (float) i_1138_ + class441.aFloatArray4916[6] * (float) i_1139_ + class441.aFloatArray4916[10] * (float) i_1140_ + class441.aFloatArray4916[14]);
				float f_1141_ = (class441.aFloatArray4916[3] * (float) i_1138_ + class441.aFloatArray4916[7] * (float) i_1139_ + class441.aFloatArray4916[11] * (float) i_1140_ + class441.aFloatArray4916[15]);
				if (f >= -f_1141_) {
					float f_1142_ = (class441.aFloatArray4916[0] * (float) i_1138_ + class441.aFloatArray4916[4] * (float) i_1139_ + class441.aFloatArray4916[8] * (float) i_1140_ + class441.aFloatArray4916[12]);
					float f_1143_ = (class441.aFloatArray4916[1] * (float) i_1138_ + class441.aFloatArray4916[5] * (float) i_1139_ + class441.aFloatArray4916[9] * (float) i_1140_ + class441.aFloatArray4916[13]);
					int i_1144_ = anIntArray9503[i_1137_];
					int i_1145_ = anIntArray9503[i_1137_ + 1];
					for (int i_1146_ = i_1144_; i_1146_ < i_1145_ && aShortArray9504[i_1146_] != 0; i_1146_++) {
						int i_1147_ = (aShortArray9504[i_1146_] & 0xffff) - 1;
						is[i_1147_] = (int) (aClass178_Sub1_9486.aFloat9274 + (aClass178_Sub1_9486.aFloat9363 * f_1142_ / f_1141_));
						is_1136_[i_1147_] = (int) (aClass178_Sub1_9486.aFloat9284 + (aClass178_Sub1_9486.aFloat9326 * f_1143_ / f_1141_));
					}
				} else {
					int i_1148_ = anIntArray9503[i_1137_];
					int i_1149_ = anIntArray9503[i_1137_ + 1];
					for (int i_1150_ = i_1148_; i_1150_ < i_1149_ && aShortArray9504[i_1150_] != 0; i_1150_++) {
						int i_1151_ = (aShortArray9504[i_1150_] & 0xffff) - 1;
						is[i_1151_] = -999999;
					}
				}
			}
			for (int i_1152_ = 0; i_1152_ < anInt9515; i_1152_++) {
				if (is[aShortArray9450[i_1152_] & 0xffff] != -999999 && is[aShortArray9478[i_1152_] & 0xffff] != -999999 && is[aShortArray9464[i_1152_] & 0xffff] != -999999 && method14872(i, i_1108_, is_1136_[aShortArray9450[i_1152_] & 0xffff], is_1136_[aShortArray9478[i_1152_] & 0xffff], is_1136_[aShortArray9464[i_1152_] & 0xffff], is[aShortArray9450[i_1152_] & 0xffff], is[aShortArray9478[i_1152_] & 0xffff], is[aShortArray9464[i_1152_] & 0xffff]))
					return true;
			}
		}
		return false;
	}

	public void method2786(Class435 class435) {
		Class441 class441 = aClass178_Sub1_9486.aClass441_9332;
		class441.method7090(class435);
		if (aClass184Array9449 != null) {
			for (int i = 0; i < aClass184Array9449.length; i++) {
				Class184 class184 = aClass184Array9449[i];
				Class184 class184_1153_ = class184;
				if (class184.aClass184_2111 != null)
					class184_1153_ = class184.aClass184_2111;
				class184_1153_.anInt2117 = ((int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) anIntArray9460[(class184.anInt2113 * 1717084103)]) + (class441.aFloatArray4916[4] * (float) (anIntArray9461[(class184.anInt2113 * 1717084103)])) + (class441.aFloatArray4916[8] * (float) (anIntArray9496[(class184.anInt2113 * 1717084103)])))) * 1979506107);
				class184_1153_.anInt2118 = (int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) (anIntArray9460[class184.anInt2113 * 1717084103])) + (class441.aFloatArray4916[5] * (float) anIntArray9461[(class184.anInt2113 * 1717084103)]) + (class441.aFloatArray4916[9] * (float) (anIntArray9496[(class184.anInt2113 * 1717084103)])))) * 546606927;
				class184_1153_.anInt2119 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9460[(class184.anInt2113 * 1717084103)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9461[(class184.anInt2113 * 1717084103)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9496[(class184.anInt2113 * 1717084103)])))) * 1120011767);
				class184_1153_.anInt2120 = (int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) (anIntArray9460[class184.anInt2114 * -615332511])) + (class441.aFloatArray4916[4] * (float) anIntArray9461[(class184.anInt2114 * -615332511)]) + (class441.aFloatArray4916[8] * (float) (anIntArray9496[(class184.anInt2114 * -615332511)])))) * 942705911;
				class184_1153_.anInt2121 = (int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) (anIntArray9460[class184.anInt2114 * -615332511])) + (class441.aFloatArray4916[5] * (float) anIntArray9461[(class184.anInt2114 * -615332511)]) + (class441.aFloatArray4916[9] * (float) (anIntArray9496[(class184.anInt2114 * -615332511)])))) * 607651075;
				class184_1153_.anInt2122 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9460[(class184.anInt2114 * -615332511)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9461[(class184.anInt2114 * -615332511)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9496[(class184.anInt2114 * -615332511)])))) * 2070256909);
				class184_1153_.anInt2125 = (int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) (anIntArray9460[class184.anInt2115 * -648014401])) + (class441.aFloatArray4916[4] * (float) anIntArray9461[(class184.anInt2115 * -648014401)]) + (class441.aFloatArray4916[8] * (float) (anIntArray9496[(class184.anInt2115 * -648014401)])))) * 528708299;
				class184_1153_.anInt2124 = (int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) (anIntArray9460[class184.anInt2115 * -648014401])) + (class441.aFloatArray4916[5] * (float) anIntArray9461[(class184.anInt2115 * -648014401)]) + (class441.aFloatArray4916[9] * (float) (anIntArray9496[(class184.anInt2115 * -648014401)])))) * 588958573;
				class184_1153_.anInt2110 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9460[(class184.anInt2115 * -648014401)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9461[(class184.anInt2115 * -648014401)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9496[(class184.anInt2115 * -648014401)])))) * -342864097);
			}
		}
		if (aClass143Array9506 != null) {
			for (int i = 0; i < aClass143Array9506.length; i++) {
				Class143 class143 = aClass143Array9506[i];
				Class143 class143_1154_ = class143;
				if (class143.aClass143_1687 != null)
					class143_1154_ = class143.aClass143_1687;
				if (class143.aClass441_1692 != null)
					class143.aClass441_1692.method7086(class441);
				else
					class143.aClass441_1692 = new Class441(class441);
				class143_1154_.anInt1689 = (int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) (anIntArray9460[class143.anInt1688 * -256753261])) + (class441.aFloatArray4916[4] * (float) anIntArray9461[(class143.anInt1688 * -256753261)]) + (class441.aFloatArray4916[8] * (float) (anIntArray9496[(class143.anInt1688 * -256753261)])))) * 246585729;
				class143_1154_.anInt1690 = ((int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) anIntArray9460[(class143.anInt1688 * -256753261)]) + (class441.aFloatArray4916[5] * (float) (anIntArray9461[(class143.anInt1688 * -256753261)])) + (class441.aFloatArray4916[9] * (float) (anIntArray9496[(class143.anInt1688 * -256753261)])))) * 1541286973);
				class143_1154_.anInt1691 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9460[(class143.anInt1688 * -256753261)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9461[(class143.anInt1688 * -256753261)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9496[(class143.anInt1688 * -256753261)])))) * -1727847879);
			}
		}
	}

	public void method2852(Class435 class435) {
		Class441 class441 = aClass178_Sub1_9486.aClass441_9332;
		class441.method7090(class435);
		if (aClass184Array9449 != null) {
			for (int i = 0; i < aClass184Array9449.length; i++) {
				Class184 class184 = aClass184Array9449[i];
				Class184 class184_1155_ = class184;
				if (class184.aClass184_2111 != null)
					class184_1155_ = class184.aClass184_2111;
				class184_1155_.anInt2117 = ((int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) anIntArray9460[(class184.anInt2113 * 1717084103)]) + (class441.aFloatArray4916[4] * (float) (anIntArray9461[(class184.anInt2113 * 1717084103)])) + (class441.aFloatArray4916[8] * (float) (anIntArray9496[(class184.anInt2113 * 1717084103)])))) * 1979506107);
				class184_1155_.anInt2118 = (int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) (anIntArray9460[class184.anInt2113 * 1717084103])) + (class441.aFloatArray4916[5] * (float) anIntArray9461[(class184.anInt2113 * 1717084103)]) + (class441.aFloatArray4916[9] * (float) (anIntArray9496[(class184.anInt2113 * 1717084103)])))) * 546606927;
				class184_1155_.anInt2119 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9460[(class184.anInt2113 * 1717084103)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9461[(class184.anInt2113 * 1717084103)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9496[(class184.anInt2113 * 1717084103)])))) * 1120011767);
				class184_1155_.anInt2120 = (int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) (anIntArray9460[class184.anInt2114 * -615332511])) + (class441.aFloatArray4916[4] * (float) anIntArray9461[(class184.anInt2114 * -615332511)]) + (class441.aFloatArray4916[8] * (float) (anIntArray9496[(class184.anInt2114 * -615332511)])))) * 942705911;
				class184_1155_.anInt2121 = (int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) (anIntArray9460[class184.anInt2114 * -615332511])) + (class441.aFloatArray4916[5] * (float) anIntArray9461[(class184.anInt2114 * -615332511)]) + (class441.aFloatArray4916[9] * (float) (anIntArray9496[(class184.anInt2114 * -615332511)])))) * 607651075;
				class184_1155_.anInt2122 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9460[(class184.anInt2114 * -615332511)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9461[(class184.anInt2114 * -615332511)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9496[(class184.anInt2114 * -615332511)])))) * 2070256909);
				class184_1155_.anInt2125 = (int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) (anIntArray9460[class184.anInt2115 * -648014401])) + (class441.aFloatArray4916[4] * (float) anIntArray9461[(class184.anInt2115 * -648014401)]) + (class441.aFloatArray4916[8] * (float) (anIntArray9496[(class184.anInt2115 * -648014401)])))) * 528708299;
				class184_1155_.anInt2124 = (int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) (anIntArray9460[class184.anInt2115 * -648014401])) + (class441.aFloatArray4916[5] * (float) anIntArray9461[(class184.anInt2115 * -648014401)]) + (class441.aFloatArray4916[9] * (float) (anIntArray9496[(class184.anInt2115 * -648014401)])))) * 588958573;
				class184_1155_.anInt2110 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9460[(class184.anInt2115 * -648014401)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9461[(class184.anInt2115 * -648014401)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9496[(class184.anInt2115 * -648014401)])))) * -342864097);
			}
		}
		if (aClass143Array9506 != null) {
			for (int i = 0; i < aClass143Array9506.length; i++) {
				Class143 class143 = aClass143Array9506[i];
				Class143 class143_1156_ = class143;
				if (class143.aClass143_1687 != null)
					class143_1156_ = class143.aClass143_1687;
				if (class143.aClass441_1692 != null)
					class143.aClass441_1692.method7086(class441);
				else
					class143.aClass441_1692 = new Class441(class441);
				class143_1156_.anInt1689 = (int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) (anIntArray9460[class143.anInt1688 * -256753261])) + (class441.aFloatArray4916[4] * (float) anIntArray9461[(class143.anInt1688 * -256753261)]) + (class441.aFloatArray4916[8] * (float) (anIntArray9496[(class143.anInt1688 * -256753261)])))) * 246585729;
				class143_1156_.anInt1690 = ((int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) anIntArray9460[(class143.anInt1688 * -256753261)]) + (class441.aFloatArray4916[5] * (float) (anIntArray9461[(class143.anInt1688 * -256753261)])) + (class441.aFloatArray4916[9] * (float) (anIntArray9496[(class143.anInt1688 * -256753261)])))) * 1541286973);
				class143_1156_.anInt1691 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9460[(class143.anInt1688 * -256753261)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9461[(class143.anInt1688 * -256753261)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9496[(class143.anInt1688 * -256753261)])))) * -1727847879);
			}
		}
	}

	public void method2782(Class435 class435, int i, boolean bool) {
		if (aShortArray9466 != null) {
			Class435 class435_1157_ = class435;
			if (bool) {
				class435_1157_ = aClass178_Sub1_9486.aClass435_9331;
				class435_1157_.method6824(class435);
			}
			float[] fs = new float[3];
			for (int i_1158_ = 0; i_1158_ < anInt9459; i_1158_++) {
				if ((i & aShortArray9466[i_1158_]) != 0) {
					class435_1157_.method6858((float) anIntArray9460[i_1158_], (float) anIntArray9461[i_1158_], (float) anIntArray9496[i_1158_], fs);
					anIntArray9460[i_1158_] = (int) fs[0];
					anIntArray9461[i_1158_] = (int) fs[1];
					anIntArray9496[i_1158_] = (int) fs[2];
				}
			}
		}
	}

	public void method2687() {
		if (!aBool9500) {
			if (!aBool9465)
				method14870();
			aShort9501 = aShort9494;
			aBool9500 = true;
		}
	}

	public void method2790() {
		if (!aBool9500) {
			if (!aBool9465)
				method14870();
			aShort9501 = aShort9494;
			aBool9500 = true;
		}
	}

	public void method2680() {
		if (!aBool9500) {
			if (!aBool9465)
				method14870();
			aShort9501 = aShort9494;
			aBool9500 = true;
		}
	}

	public int method2792() {
		if (!aBool9465)
			method14870();
		return anInt9492;
	}

	public int method2793() {
		if (!aBool9465)
			method14870();
		return anInt9492;
	}

	public int method2773() {
		if (!aBool9465)
			method14870();
		return anInt9492;
	}

	public int method2752() {
		if (!aBool9465)
			method14870();
		return anInt9492;
	}

	public void method2784(Class435 class435, Class180 class180, int i) {
		if ((i & 0x2) != 0)
			OpenGL.glPolygonMode(1032, 6913);
		if (anInt9511 != 0) {
			Class441 class441 = aClass178_Sub1_9486.aClass441_9292;
			Class441 class441_1159_ = aClass178_Sub1_9486.aClass441_9332;
			Class441 class441_1160_ = aClass178_Sub1_9486.aClass441_9333;
			class441_1159_.method7090(class435);
			class441_1160_.method7086(class441_1159_);
			class441_1160_.method7089(aClass178_Sub1_9486.aClass441_9365);
			if (!aBool9465)
				method14870();
			float[] fs = aClass178_Sub1_9486.aFloatArray9322;
			class441_1159_.method7185(0.0F, (float) aShort9494, 0.0F, fs);
			float f = fs[0];
			float f_1161_ = fs[1];
			float f_1162_ = fs[2];
			class441_1159_.method7185(0.0F, (float) aShort9505, 0.0F, fs);
			float f_1163_ = fs[0];
			float f_1164_ = fs[1];
			float f_1165_ = fs[2];
			for (int i_1166_ = 0; i_1166_ < 6; i_1166_++) {
				float[] fs_1167_ = aClass178_Sub1_9486.aFloatArrayArray9415[i_1166_];
				float f_1168_ = (fs_1167_[0] * f + fs_1167_[1] * f_1161_ + fs_1167_[2] * f_1162_ + fs_1167_[3] + (float) anInt9492);
				float f_1169_ = (fs_1167_[0] * f_1163_ + fs_1167_[1] * f_1164_ + fs_1167_[2] * f_1165_ + fs_1167_[3] + (float) anInt9492);
				if (f_1168_ < 0.0F && f_1169_ < 0.0F)
					return;
			}
			if (class180 != null) {
				boolean bool = false;
				boolean bool_1170_ = true;
				int i_1171_ = aShort9471 + aShort9497 >> 1;
				int i_1172_ = aShort9498 + aShort9491 >> 1;
				int i_1173_ = i_1171_;
				short i_1174_ = aShort9494;
				int i_1175_ = i_1172_;
				float f_1176_ = (class441_1160_.aFloatArray4916[0] * (float) i_1173_ + class441_1160_.aFloatArray4916[4] * (float) i_1174_ + class441_1160_.aFloatArray4916[8] * (float) i_1175_ + class441_1160_.aFloatArray4916[12]);
				float f_1177_ = (class441_1160_.aFloatArray4916[1] * (float) i_1173_ + class441_1160_.aFloatArray4916[5] * (float) i_1174_ + class441_1160_.aFloatArray4916[9] * (float) i_1175_ + class441_1160_.aFloatArray4916[13]);
				float f_1178_ = (class441_1160_.aFloatArray4916[2] * (float) i_1173_ + class441_1160_.aFloatArray4916[6] * (float) i_1174_ + class441_1160_.aFloatArray4916[10] * (float) i_1175_ + class441_1160_.aFloatArray4916[14]);
				float f_1179_ = (class441_1160_.aFloatArray4916[3] * (float) i_1173_ + class441_1160_.aFloatArray4916[7] * (float) i_1174_ + class441_1160_.aFloatArray4916[11] * (float) i_1175_ + class441_1160_.aFloatArray4916[15]);
				if (f_1178_ >= -f_1179_) {
					class180.anInt1999 = (int) (aClass178_Sub1_9486.aFloat9274 + (aClass178_Sub1_9486.aFloat9363 * f_1176_ / f_1179_));
					class180.anInt2002 = (int) (aClass178_Sub1_9486.aFloat9284 + (aClass178_Sub1_9486.aFloat9326 * f_1177_ / f_1179_));
				} else
					bool = true;
				i_1173_ = i_1171_;
				i_1174_ = aShort9505;
				i_1175_ = i_1172_;
				float f_1180_ = (class441_1160_.aFloatArray4916[0] * (float) i_1173_ + class441_1160_.aFloatArray4916[4] * (float) i_1174_ + class441_1160_.aFloatArray4916[8] * (float) i_1175_ + class441_1160_.aFloatArray4916[12]);
				float f_1181_ = (class441_1160_.aFloatArray4916[1] * (float) i_1173_ + class441_1160_.aFloatArray4916[5] * (float) i_1174_ + class441_1160_.aFloatArray4916[9] * (float) i_1175_ + class441_1160_.aFloatArray4916[13]);
				float f_1182_ = (class441_1160_.aFloatArray4916[2] * (float) i_1173_ + class441_1160_.aFloatArray4916[6] * (float) i_1174_ + class441_1160_.aFloatArray4916[10] * (float) i_1175_ + class441_1160_.aFloatArray4916[14]);
				float f_1183_ = (class441_1160_.aFloatArray4916[3] * (float) i_1173_ + class441_1160_.aFloatArray4916[7] * (float) i_1174_ + class441_1160_.aFloatArray4916[11] * (float) i_1175_ + class441_1160_.aFloatArray4916[15]);
				if (f_1182_ >= -f_1183_) {
					class180.anInt1998 = (int) (aClass178_Sub1_9486.aFloat9274 + (aClass178_Sub1_9486.aFloat9363 * f_1180_ / f_1183_));
					class180.anInt2003 = (int) (aClass178_Sub1_9486.aFloat9284 + (aClass178_Sub1_9486.aFloat9326 * f_1181_ / f_1183_));
				} else
					bool = true;
				if (bool) {
					if (f_1178_ < -f_1179_ && f_1182_ < -f_1183_)
						bool_1170_ = false;
					else if (f_1178_ < -f_1179_) {
						float f_1184_ = (f_1178_ + f_1179_) / (f_1182_ + f_1183_) - 1.0F;
						float f_1185_ = f_1176_ + f_1184_ * (f_1180_ - f_1176_);
						float f_1186_ = f_1177_ + f_1184_ * (f_1181_ - f_1177_);
						float f_1187_ = f_1179_ + f_1184_ * (f_1183_ - f_1179_);
						class180.anInt1999 = (int) (aClass178_Sub1_9486.aFloat9274 + (aClass178_Sub1_9486.aFloat9363 * f_1185_ / f_1187_));
						class180.anInt2002 = (int) (aClass178_Sub1_9486.aFloat9284 + (aClass178_Sub1_9486.aFloat9326 * f_1186_ / f_1187_));
					} else if (f_1182_ < -f_1183_) {
						float f_1188_ = (f_1182_ + f_1183_) / (f_1178_ + f_1179_) - 1.0F;
						float f_1189_ = f_1180_ + f_1188_ * (f_1176_ - f_1180_);
						float f_1190_ = f_1181_ + f_1188_ * (f_1177_ - f_1181_);
						float f_1191_ = f_1183_ + f_1188_ * (f_1179_ - f_1183_);
						class180.anInt1998 = (int) (aClass178_Sub1_9486.aFloat9274 + (aClass178_Sub1_9486.aFloat9363 * f_1189_ / f_1191_));
						class180.anInt2003 = (int) (aClass178_Sub1_9486.aFloat9284 + (aClass178_Sub1_9486.aFloat9326 * f_1190_ / f_1191_));
					}
				}
				if (bool_1170_) {
					if (f_1178_ / f_1179_ > f_1182_ / f_1183_) {
						float f_1192_ = (f_1176_ + (class441.aFloatArray4916[0] * (float) anInt9492) + class441.aFloatArray4916[12]);
						float f_1193_ = (f_1179_ + (class441.aFloatArray4916[3] * (float) anInt9492) + class441.aFloatArray4916[15]);
						class180.anInt2001 = (int) (aClass178_Sub1_9486.aFloat9274 - (float) class180.anInt1999 + (aClass178_Sub1_9486.aFloat9363 * f_1192_ / f_1193_));
					} else {
						float f_1194_ = (f_1180_ + (class441.aFloatArray4916[0] * (float) anInt9492) + class441.aFloatArray4916[12]);
						float f_1195_ = (f_1183_ + (class441.aFloatArray4916[3] * (float) anInt9492) + class441.aFloatArray4916[15]);
						class180.anInt2001 = (int) (aClass178_Sub1_9486.aFloat9274 - (float) class180.anInt1998 + (aClass178_Sub1_9486.aFloat9363 * f_1194_ / f_1195_));
					}
					class180.aBool2000 = true;
				}
			}
			aClass178_Sub1_9486.method14619();
			aClass178_Sub1_9486.method14637(class441_1159_);
			method14874();
			aClass178_Sub1_9486.method14638();
			class441_1159_.method7089(aClass178_Sub1_9486.aClass441_9316);
			method14875(class441_1159_);
			if ((i & 0x2) != 0)
				OpenGL.glPolygonMode(1028, 6914);
		}
	}

	public int method2797() {
		if (!aBool9465)
			method14870();
		return aShort9471;
	}

	public Class143[] method2714() {
		return aClass143Array9506;
	}

	public int method2799() {
		if (!aBool9465)
			method14870();
		return aShort9497;
	}

	public int method2800() {
		if (!aBool9465)
			method14870();
		return aShort9497;
	}

	boolean method2816() {
		if (anIntArrayArray9463 == null)
			return false;
		for (int i = 0; i < anInt9499; i++) {
			anIntArray9460[i] <<= 4;
			anIntArray9461[i] <<= 4;
			anIntArray9496[i] <<= 4;
		}
		anInt9516 = 0;
		anInt9517 = 0;
		anInt9518 = 0;
		return true;
	}

	void method2757() {
		/* empty */
	}

	public int method2803() {
		if (!aBool9465)
			method14870();
		return aShort9505;
	}

	public int method2811() {
		if (!aBool9465)
			method14870();
		return aShort9505;
	}

	public int method2801() {
		if (!aBool9465)
			method14870();
		return aShort9497;
	}

	public int method2806() {
		if (!aBool9465)
			method14870();
		return aShort9498;
	}

	public int method2807() {
		if (!aBool9465)
			method14870();
		return aShort9498;
	}

	public int method2676() {
		if (!aBool9465)
			method14870();
		return aShort9494;
	}

	public void method2809(int i) {
		aShort9455 = (short) i;
		if (aClass131_9484 != null)
			aClass131_9484.anInterface15_1558 = null;
		if (aClass131_9485 != null)
			aClass131_9485.anInterface15_1558 = null;
	}

	public void method2810(int i) {
		aShort9455 = (short) i;
		if (aClass131_9484 != null)
			aClass131_9484.anInterface15_1558 = null;
		if (aClass131_9485 != null)
			aClass131_9485.anInterface15_1558 = null;
	}

	public void method2839(int i, int i_1196_, int i_1197_, int i_1198_) {
		for (int i_1199_ = 0; i_1199_ < anInt9515; i_1199_++) {
			int i_1200_ = aShortArray9489[i_1199_] & 0xffff;
			int i_1201_ = i_1200_ >> 10 & 0x3f;
			int i_1202_ = i_1200_ >> 7 & 0x7;
			int i_1203_ = i_1200_ & 0x7f;
			if (i != -1)
				i_1201_ += (i - i_1201_) * i_1198_ >> 7;
			if (i_1196_ != -1)
				i_1202_ += (i_1196_ - i_1202_) * i_1198_ >> 7;
			if (i_1197_ != -1)
				i_1203_ += (i_1197_ - i_1203_) * i_1198_ >> 7;
			aShortArray9489[i_1199_] = (short) (i_1201_ << 10 | i_1202_ << 7 | i_1203_);
		}
		if (aClass161Array9508 != null) {
			for (int i_1204_ = 0; i_1204_ < anInt9507; i_1204_++) {
				Class161 class161 = aClass161Array9508[i_1204_];
				Class133 class133 = aClass133Array9479[i_1204_];
				class133.anInt1577 = (class133.anInt1577 & ~0xffffff | ((Class710.anIntArray8839[aShortArray9489[class161.anInt1764] & 0xffff]) & 0xffffff));
			}
		}
		if (aClass131_9484 != null)
			aClass131_9484.anInterface15_1558 = null;
	}

	public int method2812() {
		return aShort9495;
	}

	public void method2872(int i) {
		aShort9495 = (short) i;
		if (aClass131_9484 != null)
			aClass131_9484.anInterface15_1558 = null;
	}

	public int method2787() {
		if (!aBool9465)
			method14870();
		return aShort9491;
	}

	public void method2815(short i, short i_1205_) {
		for (int i_1206_ = 0; i_1206_ < anInt9515; i_1206_++) {
			if (aShortArray9489[i_1206_] == i)
				aShortArray9489[i_1206_] = i_1205_;
		}
		if (aClass161Array9508 != null) {
			for (int i_1207_ = 0; i_1207_ < anInt9507; i_1207_++) {
				Class161 class161 = aClass161Array9508[i_1207_];
				Class133 class133 = aClass133Array9479[i_1207_];
				class133.anInt1577 = (class133.anInt1577 & ~0xffffff | ((Class710.anIntArray8839[aShortArray9489[class161.anInt1764] & 0xffff]) & 0xffffff));
			}
		}
		if (aClass131_9484 != null)
			aClass131_9484.anInterface15_1558 = null;
	}

	public boolean method2828() {
		if (aShortArray9473 == null)
			return true;
		for (int i = 0; i < aShortArray9473.length; i++) {
			if (aShortArray9473[i] != -1) {
				Class177 class177 = aClass178_Sub1_9486.aClass172_1916.method2895(aShortArray9473[i] & 0xffff, -585140153);
				if (class177.aBool1881 && !aClass178_Sub1_9486.aClass154_9382.method2530(Class601.aClass601_7850, class177, -1))
					return false;
			}
		}
		return true;
	}

	public void method2715(byte i, byte[] is) {
		if (is == null) {
			for (int i_1208_ = 0; i_1208_ < anInt9515; i_1208_++)
				aByteArray9476[i_1208_] = i;
		} else {
			for (int i_1209_ = 0; i_1209_ < anInt9515; i_1209_++) {
				int i_1210_ = 255 - ((255 - (is[i_1209_] & 0xff)) * (255 - (i & 0xff)) / 255);
				aByteArray9476[i_1209_] = (byte) i_1210_;
			}
		}
		if (aClass131_9484 != null)
			aClass131_9484.anInterface15_1558 = null;
	}

	public void method2818(short i, short i_1211_) {
		Class172 class172 = aClass178_Sub1_9486.aClass172_1916;
		for (int i_1212_ = 0; i_1212_ < anInt9515; i_1212_++) {
			if (aShortArray9473[i_1212_] == i)
				aShortArray9473[i_1212_] = i_1211_;
		}
		byte i_1213_ = 0;
		byte i_1214_ = 0;
		if (i != -1) {
			Class177 class177 = class172.method2895(i & 0xffff, -2099289579);
			i_1213_ = class177.aByte1912;
			i_1214_ = class177.aByte1883;
		}
		byte i_1215_ = 0;
		byte i_1216_ = 0;
		if (i_1211_ != -1) {
			Class177 class177 = class172.method2895(i_1211_ & 0xffff, -1918371393);
			i_1215_ = class177.aByte1912;
			i_1216_ = class177.aByte1883;
			if (class177.aByte1885 != 0 || class177.aByte1886 != 0)
				aBool9469 = true;
		}
		if (i_1213_ != i_1215_ | i_1214_ != i_1216_) {
			if (aClass161Array9508 != null) {
				for (int i_1217_ = 0; i_1217_ < anInt9507; i_1217_++) {
					Class161 class161 = aClass161Array9508[i_1217_];
					Class133 class133 = aClass133Array9479[i_1217_];
					class133.anInt1577 = (class133.anInt1577 & ~0xffffff | ((Class710.anIntArray8839[aShortArray9489[class161.anInt1764] & 0xffff]) & 0xffffff));
				}
			}
			if (aClass131_9484 != null)
				aClass131_9484.anInterface15_1558 = null;
		}
	}

	public void method2794(int i, int i_1218_, int i_1219_, int i_1220_) {
		for (int i_1221_ = 0; i_1221_ < anInt9515; i_1221_++) {
			int i_1222_ = aShortArray9489[i_1221_] & 0xffff;
			int i_1223_ = i_1222_ >> 10 & 0x3f;
			int i_1224_ = i_1222_ >> 7 & 0x7;
			int i_1225_ = i_1222_ & 0x7f;
			if (i != -1)
				i_1223_ += (i - i_1223_) * i_1220_ >> 7;
			if (i_1218_ != -1)
				i_1224_ += (i_1218_ - i_1224_) * i_1220_ >> 7;
			if (i_1219_ != -1)
				i_1225_ += (i_1219_ - i_1225_) * i_1220_ >> 7;
			aShortArray9489[i_1221_] = (short) (i_1223_ << 10 | i_1224_ << 7 | i_1225_);
		}
		if (aClass161Array9508 != null) {
			for (int i_1226_ = 0; i_1226_ < anInt9507; i_1226_++) {
				Class161 class161 = aClass161Array9508[i_1226_];
				Class133 class133 = aClass133Array9479[i_1226_];
				class133.anInt1577 = (class133.anInt1577 & ~0xffffff | ((Class710.anIntArray8839[aShortArray9489[class161.anInt1764] & 0xffff]) & 0xffffff));
			}
		}
		if (aClass131_9484 != null)
			aClass131_9484.anInterface15_1558 = null;
	}

	public void method2843(int i, int i_1227_, int i_1228_, int i_1229_) {
		for (int i_1230_ = 0; i_1230_ < anInt9515; i_1230_++) {
			int i_1231_ = aShortArray9489[i_1230_] & 0xffff;
			int i_1232_ = i_1231_ >> 10 & 0x3f;
			int i_1233_ = i_1231_ >> 7 & 0x7;
			int i_1234_ = i_1231_ & 0x7f;
			if (i != -1)
				i_1232_ += (i - i_1232_) * i_1229_ >> 7;
			if (i_1227_ != -1)
				i_1233_ += (i_1227_ - i_1233_) * i_1229_ >> 7;
			if (i_1228_ != -1)
				i_1234_ += (i_1228_ - i_1234_) * i_1229_ >> 7;
			aShortArray9489[i_1230_] = (short) (i_1232_ << 10 | i_1233_ << 7 | i_1234_);
		}
		if (aClass161Array9508 != null) {
			for (int i_1235_ = 0; i_1235_ < anInt9507; i_1235_++) {
				Class161 class161 = aClass161Array9508[i_1235_];
				Class133 class133 = aClass133Array9479[i_1235_];
				class133.anInt1577 = (class133.anInt1577 & ~0xffffff | ((Class710.anIntArray8839[aShortArray9489[class161.anInt1764] & 0xffff]) & 0xffffff));
			}
		}
		if (aClass131_9484 != null)
			aClass131_9484.anInterface15_1558 = null;
	}

	void method14883() {
		if (anInt9474 != 0) {
			if (aByte9454 != 0)
				method14876(true);
			method14876(false);
			if (aClass119_9509 != null) {
				if (aClass119_9509.anInterface18_1474 == null)
					method14868((aByte9454 & 0x10) != 0);
				if (aClass119_9509.anInterface18_1474 != null) {
					aClass178_Sub1_9486.method14682(aClass131_9485 != null);
					aClass178_Sub1_9486.method14664(aClass131_9481, aClass131_9485, aClass131_9484, aClass131_9457);
					int i = anIntArray9502.length - 1;
					for (int i_1236_ = 0; i_1236_ < i; i_1236_++) {
						int i_1237_ = anIntArray9502[i_1236_];
						int i_1238_ = anIntArray9502[i_1236_ + 1];
						int i_1239_ = (aShortArray9473[i_1237_] == -1 ? -1 : aShortArray9473[i_1237_] & 0xffff);
						aClass178_Sub1_9486.method14836(i_1239_, aClass131_9485 != null);
						aClass178_Sub1_9486.method14652((aClass119_9509.anInterface18_1474), 4, i_1237_ * 3, ((i_1238_ - i_1237_) * 3));
					}
				}
			}
			method14882();
		}
	}

	public void method2822(int i, int i_1240_, int i_1241_, int i_1242_) {
		for (int i_1243_ = 0; i_1243_ < anInt9515; i_1243_++) {
			int i_1244_ = aShortArray9489[i_1243_] & 0xffff;
			int i_1245_ = i_1244_ >> 10 & 0x3f;
			int i_1246_ = i_1244_ >> 7 & 0x7;
			int i_1247_ = i_1244_ & 0x7f;
			if (i != -1)
				i_1245_ += (i - i_1245_) * i_1242_ >> 7;
			if (i_1240_ != -1)
				i_1246_ += (i_1240_ - i_1246_) * i_1242_ >> 7;
			if (i_1241_ != -1)
				i_1247_ += (i_1241_ - i_1247_) * i_1242_ >> 7;
			aShortArray9489[i_1243_] = (short) (i_1245_ << 10 | i_1246_ << 7 | i_1247_);
		}
		if (aClass161Array9508 != null) {
			for (int i_1248_ = 0; i_1248_ < anInt9507; i_1248_++) {
				Class161 class161 = aClass161Array9508[i_1248_];
				Class133 class133 = aClass133Array9479[i_1248_];
				class133.anInt1577 = (class133.anInt1577 & ~0xffffff | ((Class710.anIntArray8839[aShortArray9489[class161.anInt1764] & 0xffff]) & 0xffffff));
			}
		}
		if (aClass131_9484 != null)
			aClass131_9484.anInterface15_1558 = null;
	}

	public Class184[] method2823() {
		return aClass184Array9449;
	}

	void method14884() {
		if (aBool9490) {
			aBool9490 = false;
			if (aClass184Array9449 == null && aClass143Array9506 == null && aClass161Array9508 == null && !Class127.method2166(anInt9451, anInt9458)) {
				boolean bool = false;
				boolean bool_1249_ = false;
				boolean bool_1250_ = false;
				if (anIntArray9460 != null && !Class127.method2167(anInt9451, anInt9458)) {
					if (aClass131_9481 == null || aClass131_9481.anInterface15_1558 != null) {
						if (!aBool9465)
							method14870();
						bool = true;
					} else
						aBool9490 = true;
				}
				if (anIntArray9461 != null && !Class127.method2168(anInt9451, anInt9458)) {
					if (aClass131_9481 == null || aClass131_9481.anInterface15_1558 != null) {
						if (!aBool9465)
							method14870();
						bool_1249_ = true;
					} else
						aBool9490 = true;
				}
				if (anIntArray9496 != null && !Class127.method2213(anInt9451, anInt9458)) {
					if (aClass131_9481 == null || aClass131_9481.anInterface15_1558 != null) {
						if (!aBool9465)
							method14870();
						bool_1250_ = true;
					} else
						aBool9490 = true;
				}
				if (bool)
					anIntArray9460 = null;
				if (bool_1249_)
					anIntArray9461 = null;
				if (bool_1250_)
					anIntArray9496 = null;
			}
			if (aShortArray9504 != null && anIntArray9460 == null && anIntArray9461 == null && anIntArray9496 == null) {
				aShortArray9504 = null;
				anIntArray9503 = null;
			}
			if (aByteArray9487 != null && !Class127.method2170(anInt9451, anInt9458)) {
				if (aClass131_9485 != null) {
					if (aClass131_9485.anInterface15_1558 != null) {
						aShortArray9468 = null;
						aShortArray9467 = null;
						aShortArray9493 = null;
						aByteArray9487 = null;
					} else
						aBool9490 = true;
				} else if (aClass131_9484 == null || aClass131_9484.anInterface15_1558 != null) {
					aShortArray9468 = null;
					aShortArray9467 = null;
					aShortArray9493 = null;
					aByteArray9487 = null;
				} else
					aBool9490 = true;
			}
			if (aShortArray9489 != null && !Class127.method2171(anInt9451, anInt9458)) {
				if (aClass131_9484 == null || aClass131_9484.anInterface15_1558 != null)
					aShortArray9489 = null;
				else
					aBool9490 = true;
			}
			if (aByteArray9476 != null && !Class127.method2242(anInt9451, anInt9458)) {
				if (aClass131_9484 == null || aClass131_9484.anInterface15_1558 != null)
					aByteArray9476 = null;
				else
					aBool9490 = true;
			}
			if (aFloatArray9453 != null && !Class127.method2172(anInt9451, anInt9458)) {
				if (aClass131_9457 == null || aClass131_9457.anInterface15_1558 != null) {
					aFloatArray9472 = null;
					aFloatArray9453 = null;
				} else
					aBool9490 = true;
			}
			if (aShortArray9473 != null && !Class127.method2177(anInt9451, anInt9458)) {
				if (aClass131_9484 == null || aClass131_9484.anInterface15_1558 != null)
					aShortArray9473 = null;
				else
					aBool9490 = true;
			}
			if (aShortArray9450 != null && !Class127.method2176(anInt9451, anInt9458)) {
				if ((aClass119_9509 == null || aClass119_9509.anInterface18_1474 != null) && (aClass131_9484 == null || aClass131_9484.anInterface15_1558 != null)) {
					aShortArray9464 = null;
					aShortArray9478 = null;
					aShortArray9450 = null;
				} else
					aBool9490 = true;
			}
			if (anIntArrayArray9475 != null && !Class127.method2201(anInt9451, anInt9458)) {
				anIntArrayArray9475 = null;
				aShortArray9482 = null;
			}
			if (anIntArrayArray9463 != null && !Class127.method2174(anInt9451, anInt9458)) {
				anIntArrayArray9463 = null;
				aShortArray9466 = null;
			}
			if (anIntArrayArray9480 != null && !Class127.method2175(anInt9451, anInt9458))
				anIntArrayArray9480 = null;
			if (anIntArray9502 != null && (anInt9451 & 0x800) == 0 && (anInt9451 & 0x40000) == 0)
				anIntArray9502 = null;
		}
	}

	void method14885(Class523_Sub27_Sub4_Sub1 class523_sub27_sub4_sub1) {
		if (aClass178_Sub1_9486.anIntArray9294.length < anInt9511) {
			aClass178_Sub1_9486.anIntArray9294 = new int[anInt9511];
			aClass178_Sub1_9486.anIntArray9431 = new int[anInt9511];
		}
		int[] is = aClass178_Sub1_9486.anIntArray9294;
		int[] is_1251_ = aClass178_Sub1_9486.anIntArray9431;
		for (int i = 0; i < anInt9459; i++) {
			int i_1252_ = (((anIntArray9460[i] - (anIntArray9461[i] * aClass178_Sub1_9486.anInt9372 >> 8)) >> aClass178_Sub1_9486.anInt9287) - class523_sub27_sub4_sub1.anInt12053);
			int i_1253_ = (((anIntArray9496[i] - (anIntArray9461[i] * aClass178_Sub1_9486.anInt9366 >> 8)) >> aClass178_Sub1_9486.anInt9287) - class523_sub27_sub4_sub1.anInt12054);
			int i_1254_ = anIntArray9503[i];
			int i_1255_ = anIntArray9503[i + 1];
			for (int i_1256_ = i_1254_; i_1256_ < i_1255_ && aShortArray9504[i_1256_] != 0; i_1256_++) {
				int i_1257_ = (aShortArray9504[i_1256_] & 0xffff) - 1;
				is[i_1257_] = i_1252_;
				is_1251_[i_1257_] = i_1253_;
			}
		}
		for (int i = 0; i < anInt9474; i++) {
			if (aByteArray9476 == null || aByteArray9476[i] <= 128) {
				int i_1258_ = aShortArray9450[i] & 0xffff;
				int i_1259_ = aShortArray9478[i] & 0xffff;
				int i_1260_ = aShortArray9464[i] & 0xffff;
				int i_1261_ = is[i_1258_];
				int i_1262_ = is[i_1259_];
				int i_1263_ = is[i_1260_];
				int i_1264_ = is_1251_[i_1258_];
				int i_1265_ = is_1251_[i_1259_];
				int i_1266_ = is_1251_[i_1260_];
				if (((i_1261_ - i_1262_) * (i_1265_ - i_1266_) - (i_1265_ - i_1264_) * (i_1263_ - i_1262_)) > 0)
					class523_sub27_sub4_sub1.method18503(i_1264_, i_1265_, i_1266_, i_1261_, i_1262_, i_1263_);
			}
		}
	}

	public Class523_Sub27_Sub4 method2788(Class523_Sub27_Sub4 class523_sub27_sub4) {
		if (anInt9511 == 0)
			return null;
		if (!aBool9465)
			method14870();
		int i;
		int i_1267_;
		if (aClass178_Sub1_9486.anInt9372 > 0) {
			i = (aShort9471 - (aShort9505 * aClass178_Sub1_9486.anInt9372 >> 8) >> aClass178_Sub1_9486.anInt9287);
			i_1267_ = aShort9497 - (aShort9494 * aClass178_Sub1_9486.anInt9372 >> 8) >> aClass178_Sub1_9486.anInt9287;
		} else {
			i = (aShort9471 - (aShort9494 * aClass178_Sub1_9486.anInt9372 >> 8) >> aClass178_Sub1_9486.anInt9287);
			i_1267_ = aShort9497 - (aShort9505 * aClass178_Sub1_9486.anInt9372 >> 8) >> aClass178_Sub1_9486.anInt9287;
		}
		int i_1268_;
		int i_1269_;
		if (aClass178_Sub1_9486.anInt9366 > 0) {
			i_1268_ = aShort9498 - (aShort9505 * aClass178_Sub1_9486.anInt9366 >> 8) >> aClass178_Sub1_9486.anInt9287;
			i_1269_ = aShort9491 - (aShort9494 * aClass178_Sub1_9486.anInt9366 >> 8) >> aClass178_Sub1_9486.anInt9287;
		} else {
			i_1268_ = aShort9498 - (aShort9494 * aClass178_Sub1_9486.anInt9366 >> 8) >> aClass178_Sub1_9486.anInt9287;
			i_1269_ = aShort9491 - (aShort9505 * aClass178_Sub1_9486.anInt9366 >> 8) >> aClass178_Sub1_9486.anInt9287;
		}
		int i_1270_ = i_1267_ - i + 1;
		int i_1271_ = i_1269_ - i_1268_ + 1;
		Class523_Sub27_Sub4_Sub1 class523_sub27_sub4_sub1 = (Class523_Sub27_Sub4_Sub1) class523_sub27_sub4;
		Class523_Sub27_Sub4_Sub1 class523_sub27_sub4_sub1_1272_;
		if (class523_sub27_sub4_sub1 != null && class523_sub27_sub4_sub1.method18496(i_1270_, i_1271_)) {
			class523_sub27_sub4_sub1_1272_ = class523_sub27_sub4_sub1;
			class523_sub27_sub4_sub1_1272_.method18495();
		} else
			class523_sub27_sub4_sub1_1272_ = new Class523_Sub27_Sub4_Sub1(aClass178_Sub1_9486, i_1270_, i_1271_);
		class523_sub27_sub4_sub1_1272_.method18505(i, i_1268_, i_1267_, i_1269_);
		method14885(class523_sub27_sub4_sub1_1272_);
		return class523_sub27_sub4_sub1_1272_;
	}

	public Class143[] method2686() {
		return aClass143Array9506;
	}

	public void method2776(Class435 class435, int i, boolean bool) {
		if (aShortArray9466 != null) {
			Class435 class435_1273_ = class435;
			if (bool) {
				class435_1273_ = aClass178_Sub1_9486.aClass435_9331;
				class435_1273_.method6824(class435);
			}
			float[] fs = new float[3];
			for (int i_1274_ = 0; i_1274_ < anInt9459; i_1274_++) {
				if ((i & aShortArray9466[i_1274_]) != 0) {
					class435_1273_.method6858((float) anIntArray9460[i_1274_], (float) anIntArray9461[i_1274_], (float) anIntArray9496[i_1274_], fs);
					anIntArray9460[i_1274_] = (int) fs[0];
					anIntArray9461[i_1274_] = (int) fs[1];
					anIntArray9496[i_1274_] = (int) fs[2];
				}
			}
		}
	}

	void method14886() {
		if (anInt9474 != 0) {
			if (aByte9454 != 0)
				method14876(true);
			method14876(false);
			if (aClass119_9509 != null) {
				if (aClass119_9509.anInterface18_1474 == null)
					method14868((aByte9454 & 0x10) != 0);
				if (aClass119_9509.anInterface18_1474 != null) {
					aClass178_Sub1_9486.method14682(aClass131_9485 != null);
					aClass178_Sub1_9486.method14664(aClass131_9481, aClass131_9485, aClass131_9484, aClass131_9457);
					int i = anIntArray9502.length - 1;
					for (int i_1275_ = 0; i_1275_ < i; i_1275_++) {
						int i_1276_ = anIntArray9502[i_1275_];
						int i_1277_ = anIntArray9502[i_1275_ + 1];
						int i_1278_ = (aShortArray9473[i_1276_] == -1 ? -1 : aShortArray9473[i_1276_] & 0xffff);
						aClass178_Sub1_9486.method14836(i_1278_, aClass131_9485 != null);
						aClass178_Sub1_9486.method14652((aClass119_9509.anInterface18_1474), 4, i_1276_ * 3, ((i_1277_ - i_1276_) * 3));
					}
				}
			}
			method14882();
		}
	}

	public boolean method2830() {
		return aBool9456;
	}

	void method2720(int i, int[] is, int i_1279_, int i_1280_, int i_1281_, boolean bool, int i_1282_, int[] is_1283_) {
		int i_1284_ = is.length;
		if (i == 0) {
			i_1279_ <<= 4;
			i_1280_ <<= 4;
			i_1281_ <<= 4;
			int i_1285_ = 0;
			anInt9516 = 0;
			anInt9517 = 0;
			anInt9518 = 0;
			for (int i_1286_ = 0; i_1286_ < i_1284_; i_1286_++) {
				int i_1287_ = is[i_1286_];
				if (i_1287_ < anIntArrayArray9463.length) {
					int[] is_1288_ = anIntArrayArray9463[i_1287_];
					for (int i_1289_ = 0; i_1289_ < is_1288_.length; i_1289_++) {
						int i_1290_ = is_1288_[i_1289_];
						if (aShortArray9466 == null || (i_1282_ & aShortArray9466[i_1290_]) != 0) {
							anInt9516 += anIntArray9460[i_1290_];
							anInt9517 += anIntArray9461[i_1290_];
							anInt9518 += anIntArray9496[i_1290_];
							i_1285_++;
						}
					}
				}
			}
			if (i_1285_ > 0) {
				anInt9516 = anInt9516 / i_1285_ + i_1279_;
				anInt9517 = anInt9517 / i_1285_ + i_1280_;
				anInt9518 = anInt9518 / i_1285_ + i_1281_;
				aBool9519 = true;
			} else {
				anInt9516 = i_1279_;
				anInt9517 = i_1280_;
				anInt9518 = i_1281_;
			}
		} else if (i == 1) {
			if (is_1283_ != null) {
				int i_1291_ = ((is_1283_[0] * i_1279_ + is_1283_[1] * i_1280_ + is_1283_[2] * i_1281_ + 8192) >> 14);
				int i_1292_ = ((is_1283_[3] * i_1279_ + is_1283_[4] * i_1280_ + is_1283_[5] * i_1281_ + 8192) >> 14);
				int i_1293_ = ((is_1283_[6] * i_1279_ + is_1283_[7] * i_1280_ + is_1283_[8] * i_1281_ + 8192) >> 14);
				i_1279_ = i_1291_;
				i_1280_ = i_1292_;
				i_1281_ = i_1293_;
			}
			i_1279_ <<= 4;
			i_1280_ <<= 4;
			i_1281_ <<= 4;
			for (int i_1294_ = 0; i_1294_ < i_1284_; i_1294_++) {
				int i_1295_ = is[i_1294_];
				if (i_1295_ < anIntArrayArray9463.length) {
					int[] is_1296_ = anIntArrayArray9463[i_1295_];
					for (int i_1297_ = 0; i_1297_ < is_1296_.length; i_1297_++) {
						int i_1298_ = is_1296_[i_1297_];
						if (aShortArray9466 == null || (i_1282_ & aShortArray9466[i_1298_]) != 0) {
							anIntArray9460[i_1298_] += i_1279_;
							anIntArray9461[i_1298_] += i_1280_;
							anIntArray9496[i_1298_] += i_1281_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1283_ != null) {
				int i_1299_ = is_1283_[9] << 4;
				int i_1300_ = is_1283_[10] << 4;
				int i_1301_ = is_1283_[11] << 4;
				int i_1302_ = is_1283_[12] << 4;
				int i_1303_ = is_1283_[13] << 4;
				int i_1304_ = is_1283_[14] << 4;
				if (aBool9519) {
					int i_1305_ = ((is_1283_[0] * anInt9516 + is_1283_[3] * anInt9517 + is_1283_[6] * anInt9518 + 8192) >> 14);
					int i_1306_ = ((is_1283_[1] * anInt9516 + is_1283_[4] * anInt9517 + is_1283_[7] * anInt9518 + 8192) >> 14);
					int i_1307_ = ((is_1283_[2] * anInt9516 + is_1283_[5] * anInt9517 + is_1283_[8] * anInt9518 + 8192) >> 14);
					i_1305_ += i_1302_;
					i_1306_ += i_1303_;
					i_1307_ += i_1304_;
					anInt9516 = i_1305_;
					anInt9517 = i_1306_;
					anInt9518 = i_1307_;
					aBool9519 = false;
				}
				int[] is_1308_ = new int[9];
				int i_1309_ = Class433.anIntArray4881[i_1279_];
				int i_1310_ = Class433.anIntArray4880[i_1279_];
				int i_1311_ = Class433.anIntArray4881[i_1280_];
				int i_1312_ = Class433.anIntArray4880[i_1280_];
				int i_1313_ = Class433.anIntArray4881[i_1281_];
				int i_1314_ = Class433.anIntArray4880[i_1281_];
				int i_1315_ = i_1310_ * i_1313_ + 8192 >> 14;
				int i_1316_ = i_1310_ * i_1314_ + 8192 >> 14;
				is_1308_[0] = i_1311_ * i_1313_ + i_1312_ * i_1316_ + 8192 >> 14;
				is_1308_[1] = -i_1311_ * i_1314_ + i_1312_ * i_1315_ + 8192 >> 14;
				is_1308_[2] = i_1312_ * i_1309_ + 8192 >> 14;
				is_1308_[3] = i_1309_ * i_1314_ + 8192 >> 14;
				is_1308_[4] = i_1309_ * i_1313_ + 8192 >> 14;
				is_1308_[5] = -i_1310_;
				is_1308_[6] = -i_1312_ * i_1313_ + i_1311_ * i_1316_ + 8192 >> 14;
				is_1308_[7] = i_1312_ * i_1314_ + i_1311_ * i_1315_ + 8192 >> 14;
				is_1308_[8] = i_1311_ * i_1309_ + 8192 >> 14;
				int i_1317_ = ((is_1308_[0] * -anInt9516 + is_1308_[1] * -anInt9517 + is_1308_[2] * -anInt9518 + 8192) >> 14);
				int i_1318_ = ((is_1308_[3] * -anInt9516 + is_1308_[4] * -anInt9517 + is_1308_[5] * -anInt9518 + 8192) >> 14);
				int i_1319_ = ((is_1308_[6] * -anInt9516 + is_1308_[7] * -anInt9517 + is_1308_[8] * -anInt9518 + 8192) >> 14);
				int i_1320_ = i_1317_ + anInt9516;
				int i_1321_ = i_1318_ + anInt9517;
				int i_1322_ = i_1319_ + anInt9518;
				int[] is_1323_ = new int[9];
				for (int i_1324_ = 0; i_1324_ < 3; i_1324_++) {
					for (int i_1325_ = 0; i_1325_ < 3; i_1325_++) {
						int i_1326_ = 0;
						for (int i_1327_ = 0; i_1327_ < 3; i_1327_++)
							i_1326_ += (is_1308_[i_1324_ * 3 + i_1327_] * is_1283_[i_1325_ * 3 + i_1327_]);
						is_1323_[i_1324_ * 3 + i_1325_] = i_1326_ + 8192 >> 14;
					}
				}
				int i_1328_ = ((is_1308_[0] * i_1302_ + is_1308_[1] * i_1303_ + is_1308_[2] * i_1304_ + 8192) >> 14);
				int i_1329_ = ((is_1308_[3] * i_1302_ + is_1308_[4] * i_1303_ + is_1308_[5] * i_1304_ + 8192) >> 14);
				int i_1330_ = ((is_1308_[6] * i_1302_ + is_1308_[7] * i_1303_ + is_1308_[8] * i_1304_ + 8192) >> 14);
				i_1328_ += i_1320_;
				i_1329_ += i_1321_;
				i_1330_ += i_1322_;
				int[] is_1331_ = new int[9];
				for (int i_1332_ = 0; i_1332_ < 3; i_1332_++) {
					for (int i_1333_ = 0; i_1333_ < 3; i_1333_++) {
						int i_1334_ = 0;
						for (int i_1335_ = 0; i_1335_ < 3; i_1335_++)
							i_1334_ += (is_1283_[i_1332_ * 3 + i_1335_] * is_1323_[i_1333_ + i_1335_ * 3]);
						is_1331_[i_1332_ * 3 + i_1333_] = i_1334_ + 8192 >> 14;
					}
				}
				int i_1336_ = ((is_1283_[0] * i_1328_ + is_1283_[1] * i_1329_ + is_1283_[2] * i_1330_ + 8192) >> 14);
				int i_1337_ = ((is_1283_[3] * i_1328_ + is_1283_[4] * i_1329_ + is_1283_[5] * i_1330_ + 8192) >> 14);
				int i_1338_ = ((is_1283_[6] * i_1328_ + is_1283_[7] * i_1329_ + is_1283_[8] * i_1330_ + 8192) >> 14);
				i_1336_ += i_1299_;
				i_1337_ += i_1300_;
				i_1338_ += i_1301_;
				for (int i_1339_ = 0; i_1339_ < i_1284_; i_1339_++) {
					int i_1340_ = is[i_1339_];
					if (i_1340_ < anIntArrayArray9463.length) {
						int[] is_1341_ = anIntArrayArray9463[i_1340_];
						for (int i_1342_ = 0; i_1342_ < is_1341_.length; i_1342_++) {
							int i_1343_ = is_1341_[i_1342_];
							if (aShortArray9466 == null || (i_1282_ & aShortArray9466[i_1343_]) != 0) {
								int i_1344_ = ((is_1331_[0] * anIntArray9460[i_1343_] + is_1331_[1] * anIntArray9461[i_1343_] + is_1331_[2] * anIntArray9496[i_1343_] + 8192) >> 14);
								int i_1345_ = ((is_1331_[3] * anIntArray9460[i_1343_] + is_1331_[4] * anIntArray9461[i_1343_] + is_1331_[5] * anIntArray9496[i_1343_] + 8192) >> 14);
								int i_1346_ = ((is_1331_[6] * anIntArray9460[i_1343_] + is_1331_[7] * anIntArray9461[i_1343_] + is_1331_[8] * anIntArray9496[i_1343_] + 8192) >> 14);
								i_1344_ += i_1336_;
								i_1345_ += i_1337_;
								i_1346_ += i_1338_;
								anIntArray9460[i_1343_] = i_1344_;
								anIntArray9461[i_1343_] = i_1345_;
								anIntArray9496[i_1343_] = i_1346_;
							}
						}
					}
				}
			} else {
				for (int i_1347_ = 0; i_1347_ < i_1284_; i_1347_++) {
					int i_1348_ = is[i_1347_];
					if (i_1348_ < anIntArrayArray9463.length) {
						int[] is_1349_ = anIntArrayArray9463[i_1348_];
						for (int i_1350_ = 0; i_1350_ < is_1349_.length; i_1350_++) {
							int i_1351_ = is_1349_[i_1350_];
							if (aShortArray9466 == null || (i_1282_ & aShortArray9466[i_1351_]) != 0) {
								anIntArray9460[i_1351_] -= anInt9516;
								anIntArray9461[i_1351_] -= anInt9517;
								anIntArray9496[i_1351_] -= anInt9518;
								if (i_1281_ != 0) {
									int i_1352_ = Class433.anIntArray4880[i_1281_];
									int i_1353_ = Class433.anIntArray4881[i_1281_];
									int i_1354_ = ((anIntArray9461[i_1351_] * i_1352_ + anIntArray9460[i_1351_] * i_1353_ + 16383) >> 14);
									anIntArray9461[i_1351_] = (anIntArray9461[i_1351_] * i_1353_ - anIntArray9460[i_1351_] * i_1352_ + 16383) >> 14;
									anIntArray9460[i_1351_] = i_1354_;
								}
								if (i_1279_ != 0) {
									int i_1355_ = Class433.anIntArray4880[i_1279_];
									int i_1356_ = Class433.anIntArray4881[i_1279_];
									int i_1357_ = ((anIntArray9461[i_1351_] * i_1356_ - anIntArray9496[i_1351_] * i_1355_ + 16383) >> 14);
									anIntArray9496[i_1351_] = (anIntArray9461[i_1351_] * i_1355_ + anIntArray9496[i_1351_] * i_1356_ + 16383) >> 14;
									anIntArray9461[i_1351_] = i_1357_;
								}
								if (i_1280_ != 0) {
									int i_1358_ = Class433.anIntArray4880[i_1280_];
									int i_1359_ = Class433.anIntArray4881[i_1280_];
									int i_1360_ = ((anIntArray9496[i_1351_] * i_1358_ + anIntArray9460[i_1351_] * i_1359_ + 16383) >> 14);
									anIntArray9496[i_1351_] = (anIntArray9496[i_1351_] * i_1359_ - anIntArray9460[i_1351_] * i_1358_ + 16383) >> 14;
									anIntArray9460[i_1351_] = i_1360_;
								}
								anIntArray9460[i_1351_] += anInt9516;
								anIntArray9461[i_1351_] += anInt9517;
								anIntArray9496[i_1351_] += anInt9518;
							}
						}
					}
				}
				if (bool) {
					for (int i_1361_ = 0; i_1361_ < i_1284_; i_1361_++) {
						int i_1362_ = is[i_1361_];
						if (i_1362_ < anIntArrayArray9463.length) {
							int[] is_1363_ = anIntArrayArray9463[i_1362_];
							for (int i_1364_ = 0; i_1364_ < is_1363_.length; i_1364_++) {
								int i_1365_ = is_1363_[i_1364_];
								if (aShortArray9466 == null || ((i_1282_ & aShortArray9466[i_1365_]) != 0)) {
									int i_1366_ = anIntArray9503[i_1365_];
									int i_1367_ = anIntArray9503[i_1365_ + 1];
									for (int i_1368_ = i_1366_; (i_1368_ < i_1367_ && aShortArray9504[i_1368_] != 0); i_1368_++) {
										int i_1369_ = (aShortArray9504[i_1368_] & 0xffff) - 1;
										if (i_1281_ != 0) {
											int i_1370_ = (Class433.anIntArray4880[i_1281_]);
											int i_1371_ = (Class433.anIntArray4881[i_1281_]);
											int i_1372_ = (((aShortArray9467[i_1369_] * i_1370_) + (aShortArray9493[i_1369_] * i_1371_) + 16383) >> 14);
											aShortArray9467[i_1369_] = (short) ((((aShortArray9467[i_1369_]) * i_1371_) - ((aShortArray9493[i_1369_]) * i_1370_) + 16383) >> 14);
											aShortArray9493[i_1369_] = (short) i_1372_;
										}
										if (i_1279_ != 0) {
											int i_1373_ = (Class433.anIntArray4880[i_1279_]);
											int i_1374_ = (Class433.anIntArray4881[i_1279_]);
											int i_1375_ = (((aShortArray9467[i_1369_] * i_1374_) - (aShortArray9468[i_1369_] * i_1373_) + 16383) >> 14);
											aShortArray9468[i_1369_] = (short) ((((aShortArray9467[i_1369_]) * i_1373_) + ((aShortArray9468[i_1369_]) * i_1374_) + 16383) >> 14);
											aShortArray9467[i_1369_] = (short) i_1375_;
										}
										if (i_1280_ != 0) {
											int i_1376_ = (Class433.anIntArray4880[i_1280_]);
											int i_1377_ = (Class433.anIntArray4881[i_1280_]);
											int i_1378_ = (((aShortArray9468[i_1369_] * i_1376_) + (aShortArray9493[i_1369_] * i_1377_) + 16383) >> 14);
											aShortArray9468[i_1369_] = (short) ((((aShortArray9468[i_1369_]) * i_1377_) - ((aShortArray9493[i_1369_]) * i_1376_) + 16383) >> 14);
											aShortArray9493[i_1369_] = (short) i_1378_;
										}
									}
								}
							}
						}
					}
					if (aClass131_9485 == null && aClass131_9484 != null)
						aClass131_9484.anInterface15_1558 = null;
					if (aClass131_9485 != null)
						aClass131_9485.anInterface15_1558 = null;
				}
			}
		} else if (i == 3) {
			if (is_1283_ != null) {
				int i_1379_ = is_1283_[9] << 4;
				int i_1380_ = is_1283_[10] << 4;
				int i_1381_ = is_1283_[11] << 4;
				int i_1382_ = is_1283_[12] << 4;
				int i_1383_ = is_1283_[13] << 4;
				int i_1384_ = is_1283_[14] << 4;
				if (aBool9519) {
					int i_1385_ = ((is_1283_[0] * anInt9516 + is_1283_[3] * anInt9517 + is_1283_[6] * anInt9518 + 8192) >> 14);
					int i_1386_ = ((is_1283_[1] * anInt9516 + is_1283_[4] * anInt9517 + is_1283_[7] * anInt9518 + 8192) >> 14);
					int i_1387_ = ((is_1283_[2] * anInt9516 + is_1283_[5] * anInt9517 + is_1283_[8] * anInt9518 + 8192) >> 14);
					i_1385_ += i_1382_;
					i_1386_ += i_1383_;
					i_1387_ += i_1384_;
					anInt9516 = i_1385_;
					anInt9517 = i_1386_;
					anInt9518 = i_1387_;
					aBool9519 = false;
				}
				int i_1388_ = i_1279_ << 15 >> 7;
				int i_1389_ = i_1280_ << 15 >> 7;
				int i_1390_ = i_1281_ << 15 >> 7;
				int i_1391_ = i_1388_ * -anInt9516 + 8192 >> 14;
				int i_1392_ = i_1389_ * -anInt9517 + 8192 >> 14;
				int i_1393_ = i_1390_ * -anInt9518 + 8192 >> 14;
				int i_1394_ = i_1391_ + anInt9516;
				int i_1395_ = i_1392_ + anInt9517;
				int i_1396_ = i_1393_ + anInt9518;
				int[] is_1397_ = new int[9];
				is_1397_[0] = i_1388_ * is_1283_[0] + 8192 >> 14;
				is_1397_[1] = i_1388_ * is_1283_[3] + 8192 >> 14;
				is_1397_[2] = i_1388_ * is_1283_[6] + 8192 >> 14;
				is_1397_[3] = i_1389_ * is_1283_[1] + 8192 >> 14;
				is_1397_[4] = i_1389_ * is_1283_[4] + 8192 >> 14;
				is_1397_[5] = i_1389_ * is_1283_[7] + 8192 >> 14;
				is_1397_[6] = i_1390_ * is_1283_[2] + 8192 >> 14;
				is_1397_[7] = i_1390_ * is_1283_[5] + 8192 >> 14;
				is_1397_[8] = i_1390_ * is_1283_[8] + 8192 >> 14;
				int i_1398_ = i_1388_ * i_1382_ + 8192 >> 14;
				int i_1399_ = i_1389_ * i_1383_ + 8192 >> 14;
				int i_1400_ = i_1390_ * i_1384_ + 8192 >> 14;
				i_1398_ += i_1394_;
				i_1399_ += i_1395_;
				i_1400_ += i_1396_;
				int[] is_1401_ = new int[9];
				for (int i_1402_ = 0; i_1402_ < 3; i_1402_++) {
					for (int i_1403_ = 0; i_1403_ < 3; i_1403_++) {
						int i_1404_ = 0;
						for (int i_1405_ = 0; i_1405_ < 3; i_1405_++)
							i_1404_ += (is_1283_[i_1402_ * 3 + i_1405_] * is_1397_[i_1403_ + i_1405_ * 3]);
						is_1401_[i_1402_ * 3 + i_1403_] = i_1404_ + 8192 >> 14;
					}
				}
				int i_1406_ = ((is_1283_[0] * i_1398_ + is_1283_[1] * i_1399_ + is_1283_[2] * i_1400_ + 8192) >> 14);
				int i_1407_ = ((is_1283_[3] * i_1398_ + is_1283_[4] * i_1399_ + is_1283_[5] * i_1400_ + 8192) >> 14);
				int i_1408_ = ((is_1283_[6] * i_1398_ + is_1283_[7] * i_1399_ + is_1283_[8] * i_1400_ + 8192) >> 14);
				i_1406_ += i_1379_;
				i_1407_ += i_1380_;
				i_1408_ += i_1381_;
				for (int i_1409_ = 0; i_1409_ < i_1284_; i_1409_++) {
					int i_1410_ = is[i_1409_];
					if (i_1410_ < anIntArrayArray9463.length) {
						int[] is_1411_ = anIntArrayArray9463[i_1410_];
						for (int i_1412_ = 0; i_1412_ < is_1411_.length; i_1412_++) {
							int i_1413_ = is_1411_[i_1412_];
							if (aShortArray9466 == null || (i_1282_ & aShortArray9466[i_1413_]) != 0) {
								int i_1414_ = ((is_1401_[0] * anIntArray9460[i_1413_] + is_1401_[1] * anIntArray9461[i_1413_] + is_1401_[2] * anIntArray9496[i_1413_] + 8192) >> 14);
								int i_1415_ = ((is_1401_[3] * anIntArray9460[i_1413_] + is_1401_[4] * anIntArray9461[i_1413_] + is_1401_[5] * anIntArray9496[i_1413_] + 8192) >> 14);
								int i_1416_ = ((is_1401_[6] * anIntArray9460[i_1413_] + is_1401_[7] * anIntArray9461[i_1413_] + is_1401_[8] * anIntArray9496[i_1413_] + 8192) >> 14);
								i_1414_ += i_1406_;
								i_1415_ += i_1407_;
								i_1416_ += i_1408_;
								anIntArray9460[i_1413_] = i_1414_;
								anIntArray9461[i_1413_] = i_1415_;
								anIntArray9496[i_1413_] = i_1416_;
							}
						}
					}
				}
			} else {
				for (int i_1417_ = 0; i_1417_ < i_1284_; i_1417_++) {
					int i_1418_ = is[i_1417_];
					if (i_1418_ < anIntArrayArray9463.length) {
						int[] is_1419_ = anIntArrayArray9463[i_1418_];
						for (int i_1420_ = 0; i_1420_ < is_1419_.length; i_1420_++) {
							int i_1421_ = is_1419_[i_1420_];
							if (aShortArray9466 == null || (i_1282_ & aShortArray9466[i_1421_]) != 0) {
								anIntArray9460[i_1421_] -= anInt9516;
								anIntArray9461[i_1421_] -= anInt9517;
								anIntArray9496[i_1421_] -= anInt9518;
								anIntArray9460[i_1421_] = anIntArray9460[i_1421_] * i_1279_ >> 7;
								anIntArray9461[i_1421_] = anIntArray9461[i_1421_] * i_1280_ >> 7;
								anIntArray9496[i_1421_] = anIntArray9496[i_1421_] * i_1281_ >> 7;
								anIntArray9460[i_1421_] += anInt9516;
								anIntArray9461[i_1421_] += anInt9517;
								anIntArray9496[i_1421_] += anInt9518;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9475 != null) {
				for (int i_1422_ = 0; i_1422_ < i_1284_; i_1422_++) {
					int i_1423_ = is[i_1422_];
					if (i_1423_ < anIntArrayArray9475.length) {
						int[] is_1424_ = anIntArrayArray9475[i_1423_];
						for (int i_1425_ = 0; i_1425_ < is_1424_.length; i_1425_++) {
							int i_1426_ = is_1424_[i_1425_];
							if (aShortArray9482 == null || (i_1282_ & aShortArray9482[i_1426_]) != 0) {
								int i_1427_ = ((aByteArray9476[i_1426_] & 0xff) + i_1279_ * 8);
								if (i_1427_ < 0)
									i_1427_ = 0;
								else if (i_1427_ > 255)
									i_1427_ = 255;
								aByteArray9476[i_1426_] = (byte) i_1427_;
								if (aClass131_9484 != null)
									aClass131_9484.anInterface15_1558 = null;
							}
						}
					}
				}
				if (aClass161Array9508 != null) {
					for (int i_1428_ = 0; i_1428_ < anInt9507; i_1428_++) {
						Class161 class161 = aClass161Array9508[i_1428_];
						Class133 class133 = aClass133Array9479[i_1428_];
						class133.anInt1577 = (class133.anInt1577 & 0xffffff | 255 - (aByteArray9476[class161.anInt1764] & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9475 != null) {
				for (int i_1429_ = 0; i_1429_ < i_1284_; i_1429_++) {
					int i_1430_ = is[i_1429_];
					if (i_1430_ < anIntArrayArray9475.length) {
						int[] is_1431_ = anIntArrayArray9475[i_1430_];
						for (int i_1432_ = 0; i_1432_ < is_1431_.length; i_1432_++) {
							int i_1433_ = is_1431_[i_1432_];
							if (aShortArray9482 == null || (i_1282_ & aShortArray9482[i_1433_]) != 0) {
								int i_1434_ = aShortArray9489[i_1433_] & 0xffff;
								int i_1435_ = i_1434_ >> 10 & 0x3f;
								int i_1436_ = i_1434_ >> 7 & 0x7;
								int i_1437_ = i_1434_ & 0x7f;
								i_1435_ = i_1435_ + i_1279_ & 0x3f;
								i_1436_ += i_1280_ / 4;
								if (i_1436_ < 0)
									i_1436_ = 0;
								else if (i_1436_ > 7)
									i_1436_ = 7;
								i_1437_ += i_1281_;
								if (i_1437_ < 0)
									i_1437_ = 0;
								else if (i_1437_ > 127)
									i_1437_ = 127;
								aShortArray9489[i_1433_] = (short) (i_1435_ << 10 | i_1436_ << 7 | i_1437_);
								if (aClass131_9484 != null)
									aClass131_9484.anInterface15_1558 = null;
							}
						}
					}
				}
				if (aClass161Array9508 != null) {
					for (int i_1438_ = 0; i_1438_ < anInt9507; i_1438_++) {
						Class161 class161 = aClass161Array9508[i_1438_];
						Class133 class133 = aClass133Array9479[i_1438_];
						class133.anInt1577 = (class133.anInt1577 & ~0xffffff | (Class710.anIntArray8839[(aShortArray9489[class161.anInt1764] & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9480 != null) {
				for (int i_1439_ = 0; i_1439_ < i_1284_; i_1439_++) {
					int i_1440_ = is[i_1439_];
					if (i_1440_ < anIntArrayArray9480.length) {
						int[] is_1441_ = anIntArrayArray9480[i_1440_];
						for (int i_1442_ = 0; i_1442_ < is_1441_.length; i_1442_++) {
							Class133 class133 = aClass133Array9479[is_1441_[i_1442_]];
							class133.anInt1575 += i_1279_;
							class133.anInt1572 += i_1280_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9480 != null) {
				for (int i_1443_ = 0; i_1443_ < i_1284_; i_1443_++) {
					int i_1444_ = is[i_1443_];
					if (i_1444_ < anIntArrayArray9480.length) {
						int[] is_1445_ = anIntArrayArray9480[i_1444_];
						for (int i_1446_ = 0; i_1446_ < is_1445_.length; i_1446_++) {
							Class133 class133 = aClass133Array9479[is_1445_[i_1446_]];
							class133.anInt1576 = class133.anInt1576 * i_1279_ >> 7;
							class133.anInt1573 = class133.anInt1573 * i_1280_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9480 != null) {
				for (int i_1447_ = 0; i_1447_ < i_1284_; i_1447_++) {
					int i_1448_ = is[i_1447_];
					if (i_1448_ < anIntArrayArray9480.length) {
						int[] is_1449_ = anIntArrayArray9480[i_1448_];
						for (int i_1450_ = 0; i_1450_ < is_1449_.length; i_1450_++) {
							Class133 class133 = aClass133Array9479[is_1449_[i_1450_]];
							class133.anInt1574 = class133.anInt1574 + i_1279_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	public boolean method2831() {
		return aBool9469;
	}

	short method14887(Class179 class179, int i, long l, int i_1451_, int i_1452_, int i_1453_, int i_1454_, float f, float f_1455_) {
		int i_1456_ = anIntArray9503[i];
		int i_1457_ = anIntArray9503[i + 1];
		int i_1458_ = 0;
		for (int i_1459_ = i_1456_; i_1459_ < i_1457_; i_1459_++) {
			if (aShortArray9504[i_1459_] == 0) {
				i_1458_ = i_1459_;
				break;
			}
			int i_1460_ = (aShortArray9504[i_1459_] & 0xffff) - 1;
			if (aLongArray9445[i_1459_] == l)
				return (short) i_1460_;
		}
		aShortArray9504[i_1458_] = (short) (anInt9511 + 1);
		aLongArray9445[i_1458_] = l;
		aShortArray9493[anInt9511] = (short) i_1451_;
		aShortArray9467[anInt9511] = (short) i_1452_;
		aShortArray9468[anInt9511] = (short) i_1453_;
		aByteArray9487[anInt9511] = (byte) i_1454_;
		aFloatArray9453[anInt9511] = f;
		aFloatArray9472[anInt9511] = f_1455_;
		return (short) anInt9511++;
	}

	short method14888(Class179 class179, int i, long l, int i_1461_, int i_1462_, int i_1463_, int i_1464_, float f, float f_1465_) {
		int i_1466_ = anIntArray9503[i];
		int i_1467_ = anIntArray9503[i + 1];
		int i_1468_ = 0;
		for (int i_1469_ = i_1466_; i_1469_ < i_1467_; i_1469_++) {
			if (aShortArray9504[i_1469_] == 0) {
				i_1468_ = i_1469_;
				break;
			}
			int i_1470_ = (aShortArray9504[i_1469_] & 0xffff) - 1;
			if (aLongArray9445[i_1469_] == l)
				return (short) i_1470_;
		}
		aShortArray9504[i_1468_] = (short) (anInt9511 + 1);
		aLongArray9445[i_1468_] = l;
		aShortArray9493[anInt9511] = (short) i_1461_;
		aShortArray9467[anInt9511] = (short) i_1462_;
		aShortArray9468[anInt9511] = (short) i_1463_;
		aByteArray9487[anInt9511] = (byte) i_1464_;
		aFloatArray9453[anInt9511] = f;
		aFloatArray9472[anInt9511] = f_1465_;
		return (short) anInt9511++;
	}

	short method14889(Class179 class179, int i, long l, int i_1471_, int i_1472_, int i_1473_, int i_1474_, float f, float f_1475_) {
		int i_1476_ = anIntArray9503[i];
		int i_1477_ = anIntArray9503[i + 1];
		int i_1478_ = 0;
		for (int i_1479_ = i_1476_; i_1479_ < i_1477_; i_1479_++) {
			if (aShortArray9504[i_1479_] == 0) {
				i_1478_ = i_1479_;
				break;
			}
			int i_1480_ = (aShortArray9504[i_1479_] & 0xffff) - 1;
			if (aLongArray9445[i_1479_] == l)
				return (short) i_1480_;
		}
		aShortArray9504[i_1478_] = (short) (anInt9511 + 1);
		aLongArray9445[i_1478_] = l;
		aShortArray9493[anInt9511] = (short) i_1471_;
		aShortArray9467[anInt9511] = (short) i_1472_;
		aShortArray9468[anInt9511] = (short) i_1473_;
		aByteArray9487[anInt9511] = (byte) i_1474_;
		aFloatArray9453[anInt9511] = f;
		aFloatArray9472[anInt9511] = f_1475_;
		return (short) anInt9511++;
	}

	static short[] method14890(short[] is, int i) {
		short[] is_1481_ = new short[i];
		System.arraycopy(is, 0, is_1481_, 0, i);
		return is_1481_;
	}

	static short[] method14891(short[] is, int i) {
		short[] is_1482_ = new short[i];
		System.arraycopy(is, 0, is_1482_, 0, i);
		return is_1482_;
	}

	static short[] method14892(short[] is, int i) {
		short[] is_1483_ = new short[i];
		System.arraycopy(is, 0, is_1483_, 0, i);
		return is_1483_;
	}

	Class167 method14893(Class167_Sub3 class167_sub3_1484_, Class167_Sub3 class167_sub3_1485_, int i, boolean bool, boolean bool_1486_) {
		class167_sub3_1484_.aByte9454 = (byte) 0;
		class167_sub3_1484_.anInt9451 = i;
		class167_sub3_1484_.anInt9458 = anInt9458;
		class167_sub3_1484_.aShort9495 = aShort9495;
		class167_sub3_1484_.aShort9455 = aShort9455;
		class167_sub3_1484_.anInt9499 = anInt9499;
		class167_sub3_1484_.anInt9459 = anInt9459;
		class167_sub3_1484_.anInt9511 = anInt9511;
		class167_sub3_1484_.anInt9515 = anInt9515;
		class167_sub3_1484_.anInt9474 = anInt9474;
		class167_sub3_1484_.anInt9507 = anInt9507;
		if ((i & 0x100) != 0)
			class167_sub3_1484_.aBool9456 = true;
		else
			class167_sub3_1484_.aBool9456 = aBool9456;
		class167_sub3_1484_.aBool9469 = aBool9469;
		boolean bool_1487_ = Class127.method2145(i, anInt9458);
		boolean bool_1488_ = Class127.method2169(i, anInt9458);
		boolean bool_1489_ = Class127.method2193(i, anInt9458);
		boolean bool_1490_ = bool_1487_ | bool_1488_ | bool_1489_;
		if (bool_1490_) {
			if (bool_1487_) {
				if (class167_sub3_1485_.anIntArray9460 == null || class167_sub3_1485_.anIntArray9460.length < anInt9499)
					class167_sub3_1484_.anIntArray9460 = class167_sub3_1485_.anIntArray9460 = new int[anInt9499];
				else
					class167_sub3_1484_.anIntArray9460 = class167_sub3_1485_.anIntArray9460;
			} else
				class167_sub3_1484_.anIntArray9460 = anIntArray9460;
			if (bool_1488_) {
				if (class167_sub3_1485_.anIntArray9461 == null || class167_sub3_1485_.anIntArray9461.length < anInt9499)
					class167_sub3_1484_.anIntArray9461 = class167_sub3_1485_.anIntArray9461 = new int[anInt9499];
				else
					class167_sub3_1484_.anIntArray9461 = class167_sub3_1485_.anIntArray9461;
			} else
				class167_sub3_1484_.anIntArray9461 = anIntArray9461;
			if (bool_1489_) {
				if (class167_sub3_1485_.anIntArray9496 == null || class167_sub3_1485_.anIntArray9496.length < anInt9499)
					class167_sub3_1484_.anIntArray9496 = class167_sub3_1485_.anIntArray9496 = new int[anInt9499];
				else
					class167_sub3_1484_.anIntArray9496 = class167_sub3_1485_.anIntArray9496;
			} else
				class167_sub3_1484_.anIntArray9496 = anIntArray9496;
			for (int i_1491_ = 0; i_1491_ < anInt9499; i_1491_++) {
				if (bool_1487_)
					class167_sub3_1484_.anIntArray9460[i_1491_] = anIntArray9460[i_1491_];
				if (bool_1488_)
					class167_sub3_1484_.anIntArray9461[i_1491_] = anIntArray9461[i_1491_];
				if (bool_1489_)
					class167_sub3_1484_.anIntArray9496[i_1491_] = anIntArray9496[i_1491_];
			}
		} else {
			class167_sub3_1484_.anIntArray9460 = anIntArray9460;
			class167_sub3_1484_.anIntArray9461 = anIntArray9461;
			class167_sub3_1484_.anIntArray9496 = anIntArray9496;
		}
		if (Class127.method2162(i, anInt9458)) {
			if (bool)
				class167_sub3_1484_.aByte9454 |= 0x1;
			class167_sub3_1484_.aClass131_9481 = class167_sub3_1485_.aClass131_9481;
			class167_sub3_1484_.aClass131_9481.aByte1555 = aClass131_9481.aByte1555;
			class167_sub3_1484_.aClass131_9481.anInterface15_1558 = aClass131_9481.anInterface15_1558;
		} else if (Class127.method2156(i, anInt9458))
			class167_sub3_1484_.aClass131_9481 = aClass131_9481;
		else
			class167_sub3_1484_.aClass131_9481 = null;
		if (Class127.method2150(i, anInt9458)) {
			if (class167_sub3_1485_.aShortArray9489 == null || class167_sub3_1485_.aShortArray9489.length < anInt9515)
				class167_sub3_1484_.aShortArray9489 = class167_sub3_1485_.aShortArray9489 = new short[anInt9515];
			else
				class167_sub3_1484_.aShortArray9489 = class167_sub3_1485_.aShortArray9489;
			for (int i_1492_ = 0; i_1492_ < anInt9515; i_1492_++)
				class167_sub3_1484_.aShortArray9489[i_1492_] = aShortArray9489[i_1492_];
		} else
			class167_sub3_1484_.aShortArray9489 = aShortArray9489;
		if (Class127.method2194(i, anInt9458)) {
			if (class167_sub3_1485_.aByteArray9476 == null || class167_sub3_1485_.aByteArray9476.length < anInt9515)
				class167_sub3_1484_.aByteArray9476 = class167_sub3_1485_.aByteArray9476 = new byte[anInt9515];
			else
				class167_sub3_1484_.aByteArray9476 = class167_sub3_1485_.aByteArray9476;
			for (int i_1493_ = 0; i_1493_ < anInt9515; i_1493_++)
				class167_sub3_1484_.aByteArray9476[i_1493_] = aByteArray9476[i_1493_];
		} else
			class167_sub3_1484_.aByteArray9476 = aByteArray9476;
		if (Class127.method2147(i, anInt9458)) {
			if (bool)
				class167_sub3_1484_.aByte9454 |= 0x2;
			class167_sub3_1484_.aClass131_9484 = class167_sub3_1485_.aClass131_9484;
			class167_sub3_1484_.aClass131_9484.aByte1555 = aClass131_9484.aByte1555;
			class167_sub3_1484_.aClass131_9484.anInterface15_1558 = aClass131_9484.anInterface15_1558;
		} else if (Class127.method2159(i, anInt9458))
			class167_sub3_1484_.aClass131_9484 = aClass131_9484;
		else
			class167_sub3_1484_.aClass131_9484 = null;
		if (Class127.method2149(i, anInt9458)) {
			if (class167_sub3_1485_.aShortArray9493 == null || class167_sub3_1485_.aShortArray9493.length < anInt9511) {
				int i_1494_ = anInt9511;
				class167_sub3_1484_.aShortArray9493 = class167_sub3_1485_.aShortArray9493 = new short[i_1494_];
				class167_sub3_1484_.aShortArray9467 = class167_sub3_1485_.aShortArray9467 = new short[i_1494_];
				class167_sub3_1484_.aShortArray9468 = class167_sub3_1485_.aShortArray9468 = new short[i_1494_];
			} else {
				class167_sub3_1484_.aShortArray9493 = class167_sub3_1485_.aShortArray9493;
				class167_sub3_1484_.aShortArray9467 = class167_sub3_1485_.aShortArray9467;
				class167_sub3_1484_.aShortArray9468 = class167_sub3_1485_.aShortArray9468;
			}
			if (aClass151_9470 != null) {
				if (class167_sub3_1485_.aClass151_9470 == null)
					class167_sub3_1485_.aClass151_9470 = new Class151();
				Class151 class151 = (class167_sub3_1484_.aClass151_9470 = class167_sub3_1485_.aClass151_9470);
				if (class151.aShortArray1729 == null || class151.aShortArray1729.length < anInt9511) {
					int i_1495_ = anInt9511;
					class151.aShortArray1729 = new short[i_1495_];
					class151.aShortArray1726 = new short[i_1495_];
					class151.aShortArray1728 = new short[i_1495_];
					class151.aByteArray1727 = new byte[i_1495_];
				}
				for (int i_1496_ = 0; i_1496_ < anInt9511; i_1496_++) {
					class167_sub3_1484_.aShortArray9493[i_1496_] = aShortArray9493[i_1496_];
					class167_sub3_1484_.aShortArray9467[i_1496_] = aShortArray9467[i_1496_];
					class167_sub3_1484_.aShortArray9468[i_1496_] = aShortArray9468[i_1496_];
					class151.aShortArray1729[i_1496_] = aClass151_9470.aShortArray1729[i_1496_];
					class151.aShortArray1726[i_1496_] = aClass151_9470.aShortArray1726[i_1496_];
					class151.aShortArray1728[i_1496_] = aClass151_9470.aShortArray1728[i_1496_];
					class151.aByteArray1727[i_1496_] = aClass151_9470.aByteArray1727[i_1496_];
				}
			} else {
				for (int i_1497_ = 0; i_1497_ < anInt9511; i_1497_++) {
					class167_sub3_1484_.aShortArray9493[i_1497_] = aShortArray9493[i_1497_];
					class167_sub3_1484_.aShortArray9467[i_1497_] = aShortArray9467[i_1497_];
					class167_sub3_1484_.aShortArray9468[i_1497_] = aShortArray9468[i_1497_];
				}
			}
			class167_sub3_1484_.aByteArray9487 = aByteArray9487;
		} else {
			class167_sub3_1484_.aClass151_9470 = aClass151_9470;
			class167_sub3_1484_.aShortArray9493 = aShortArray9493;
			class167_sub3_1484_.aShortArray9467 = aShortArray9467;
			class167_sub3_1484_.aShortArray9468 = aShortArray9468;
			class167_sub3_1484_.aByteArray9487 = aByteArray9487;
		}
		if (Class127.method2237(i, anInt9458)) {
			if (bool)
				class167_sub3_1484_.aByte9454 |= 0x4;
			class167_sub3_1484_.aClass131_9485 = class167_sub3_1485_.aClass131_9485;
			class167_sub3_1484_.aClass131_9485.aByte1555 = aClass131_9485.aByte1555;
			class167_sub3_1484_.aClass131_9485.anInterface15_1558 = aClass131_9485.anInterface15_1558;
		} else if (Class127.method2157(i, anInt9458))
			class167_sub3_1484_.aClass131_9485 = aClass131_9485;
		else
			class167_sub3_1484_.aClass131_9485 = null;
		if (Class127.method2152(i, anInt9458)) {
			if (class167_sub3_1485_.aFloatArray9453 == null || class167_sub3_1485_.aFloatArray9453.length < anInt9515) {
				int i_1498_ = anInt9511;
				class167_sub3_1484_.aFloatArray9453 = class167_sub3_1485_.aFloatArray9453 = new float[i_1498_];
				class167_sub3_1484_.aFloatArray9472 = class167_sub3_1485_.aFloatArray9472 = new float[i_1498_];
			} else {
				class167_sub3_1484_.aFloatArray9453 = class167_sub3_1485_.aFloatArray9453;
				class167_sub3_1484_.aFloatArray9472 = class167_sub3_1485_.aFloatArray9472;
			}
			for (int i_1499_ = 0; i_1499_ < anInt9511; i_1499_++) {
				class167_sub3_1484_.aFloatArray9453[i_1499_] = aFloatArray9453[i_1499_];
				class167_sub3_1484_.aFloatArray9472[i_1499_] = aFloatArray9472[i_1499_];
			}
		} else {
			class167_sub3_1484_.aFloatArray9453 = aFloatArray9453;
			class167_sub3_1484_.aFloatArray9472 = aFloatArray9472;
		}
		if (Class127.method2165(i, anInt9458)) {
			if (bool)
				class167_sub3_1484_.aByte9454 |= 0x8;
			class167_sub3_1484_.aClass131_9457 = class167_sub3_1485_.aClass131_9457;
			class167_sub3_1484_.aClass131_9457.aByte1555 = aClass131_9457.aByte1555;
			class167_sub3_1484_.aClass131_9457.anInterface15_1558 = aClass131_9457.anInterface15_1558;
		} else if (Class127.method2189(i, anInt9458))
			class167_sub3_1484_.aClass131_9457 = aClass131_9457;
		else
			class167_sub3_1484_.aClass131_9457 = null;
		if (Class127.method2153(i, anInt9458)) {
			if (class167_sub3_1485_.aShortArray9450 == null || class167_sub3_1485_.aShortArray9450.length < anInt9515) {
				int i_1500_ = anInt9515;
				class167_sub3_1484_.aShortArray9450 = class167_sub3_1485_.aShortArray9450 = new short[i_1500_];
				class167_sub3_1484_.aShortArray9478 = class167_sub3_1485_.aShortArray9478 = new short[i_1500_];
				class167_sub3_1484_.aShortArray9464 = class167_sub3_1485_.aShortArray9464 = new short[i_1500_];
			} else {
				class167_sub3_1484_.aShortArray9450 = class167_sub3_1485_.aShortArray9450;
				class167_sub3_1484_.aShortArray9478 = class167_sub3_1485_.aShortArray9478;
				class167_sub3_1484_.aShortArray9464 = class167_sub3_1485_.aShortArray9464;
			}
			for (int i_1501_ = 0; i_1501_ < anInt9515; i_1501_++) {
				class167_sub3_1484_.aShortArray9450[i_1501_] = aShortArray9450[i_1501_];
				class167_sub3_1484_.aShortArray9478[i_1501_] = aShortArray9478[i_1501_];
				class167_sub3_1484_.aShortArray9464[i_1501_] = aShortArray9464[i_1501_];
			}
		} else {
			class167_sub3_1484_.aShortArray9450 = aShortArray9450;
			class167_sub3_1484_.aShortArray9478 = aShortArray9478;
			class167_sub3_1484_.aShortArray9464 = aShortArray9464;
		}
		if (Class127.method2183(i, anInt9458)) {
			if (bool)
				class167_sub3_1484_.aByte9454 |= 0x10;
			class167_sub3_1484_.aClass119_9509 = class167_sub3_1485_.aClass119_9509;
			class167_sub3_1484_.aClass119_9509.anInterface18_1474 = aClass119_9509.anInterface18_1474;
		} else if (Class127.method2158(i, anInt9458))
			class167_sub3_1484_.aClass119_9509 = aClass119_9509;
		else
			class167_sub3_1484_.aClass119_9509 = null;
		if (Class127.method2154(i, anInt9458)) {
			if (class167_sub3_1485_.aShortArray9473 == null || class167_sub3_1485_.aShortArray9473.length < anInt9515) {
				int i_1502_ = anInt9515;
				class167_sub3_1484_.aShortArray9473 = class167_sub3_1485_.aShortArray9473 = new short[i_1502_];
			} else
				class167_sub3_1484_.aShortArray9473 = class167_sub3_1485_.aShortArray9473;
			for (int i_1503_ = 0; i_1503_ < anInt9515; i_1503_++)
				class167_sub3_1484_.aShortArray9473[i_1503_] = aShortArray9473[i_1503_];
		} else
			class167_sub3_1484_.aShortArray9473 = aShortArray9473;
		if (Class127.method2155(i, anInt9458)) {
			if (class167_sub3_1485_.aClass133Array9479 == null || class167_sub3_1485_.aClass133Array9479.length < anInt9507) {
				int i_1504_ = anInt9507;
				class167_sub3_1484_.aClass133Array9479 = class167_sub3_1485_.aClass133Array9479 = new Class133[i_1504_];
				for (int i_1505_ = 0; i_1505_ < anInt9507; i_1505_++)
					class167_sub3_1484_.aClass133Array9479[i_1505_] = aClass133Array9479[i_1505_].method2264();
			} else {
				class167_sub3_1484_.aClass133Array9479 = class167_sub3_1485_.aClass133Array9479;
				for (int i_1506_ = 0; i_1506_ < anInt9507; i_1506_++)
					class167_sub3_1484_.aClass133Array9479[i_1506_].method2262(aClass133Array9479[i_1506_]);
			}
		} else
			class167_sub3_1484_.aClass133Array9479 = aClass133Array9479;
		class167_sub3_1484_.aClass161Array9508 = aClass161Array9508;
		if (aBool9465) {
			class167_sub3_1484_.anInt9443 = anInt9443;
			class167_sub3_1484_.anInt9492 = anInt9492;
			class167_sub3_1484_.aShort9471 = aShort9471;
			class167_sub3_1484_.aShort9497 = aShort9497;
			class167_sub3_1484_.aShort9494 = aShort9494;
			class167_sub3_1484_.aShort9505 = aShort9505;
			class167_sub3_1484_.aShort9498 = aShort9498;
			class167_sub3_1484_.aShort9491 = aShort9491;
			class167_sub3_1484_.aBool9465 = true;
		} else
			class167_sub3_1484_.aBool9465 = false;
		if (aBool9500) {
			class167_sub3_1484_.aShort9501 = aShort9501;
			class167_sub3_1484_.aBool9500 = true;
		} else
			class167_sub3_1484_.aBool9500 = false;
		class167_sub3_1484_.anIntArrayArray9463 = anIntArrayArray9463;
		class167_sub3_1484_.anIntArrayArray9475 = anIntArrayArray9475;
		class167_sub3_1484_.anIntArrayArray9480 = anIntArrayArray9480;
		class167_sub3_1484_.aShortArray9504 = aShortArray9504;
		class167_sub3_1484_.anIntArray9503 = anIntArray9503;
		class167_sub3_1484_.aShortArray9466 = aShortArray9466;
		class167_sub3_1484_.aShortArray9482 = aShortArray9482;
		class167_sub3_1484_.anIntArray9502 = anIntArray9502;
		class167_sub3_1484_.aClass184Array9449 = aClass184Array9449;
		class167_sub3_1484_.aClass143Array9506 = aClass143Array9506;
		return class167_sub3_1484_;
	}

	Class167 method14894(Class167_Sub3 class167_sub3_1507_, Class167_Sub3 class167_sub3_1508_, int i, boolean bool, boolean bool_1509_) {
		class167_sub3_1507_.aByte9454 = (byte) 0;
		class167_sub3_1507_.anInt9451 = i;
		class167_sub3_1507_.anInt9458 = anInt9458;
		class167_sub3_1507_.aShort9495 = aShort9495;
		class167_sub3_1507_.aShort9455 = aShort9455;
		class167_sub3_1507_.anInt9499 = anInt9499;
		class167_sub3_1507_.anInt9459 = anInt9459;
		class167_sub3_1507_.anInt9511 = anInt9511;
		class167_sub3_1507_.anInt9515 = anInt9515;
		class167_sub3_1507_.anInt9474 = anInt9474;
		class167_sub3_1507_.anInt9507 = anInt9507;
		if ((i & 0x100) != 0)
			class167_sub3_1507_.aBool9456 = true;
		else
			class167_sub3_1507_.aBool9456 = aBool9456;
		class167_sub3_1507_.aBool9469 = aBool9469;
		boolean bool_1510_ = Class127.method2145(i, anInt9458);
		boolean bool_1511_ = Class127.method2169(i, anInt9458);
		boolean bool_1512_ = Class127.method2193(i, anInt9458);
		boolean bool_1513_ = bool_1510_ | bool_1511_ | bool_1512_;
		if (bool_1513_) {
			if (bool_1510_) {
				if (class167_sub3_1508_.anIntArray9460 == null || class167_sub3_1508_.anIntArray9460.length < anInt9499)
					class167_sub3_1507_.anIntArray9460 = class167_sub3_1508_.anIntArray9460 = new int[anInt9499];
				else
					class167_sub3_1507_.anIntArray9460 = class167_sub3_1508_.anIntArray9460;
			} else
				class167_sub3_1507_.anIntArray9460 = anIntArray9460;
			if (bool_1511_) {
				if (class167_sub3_1508_.anIntArray9461 == null || class167_sub3_1508_.anIntArray9461.length < anInt9499)
					class167_sub3_1507_.anIntArray9461 = class167_sub3_1508_.anIntArray9461 = new int[anInt9499];
				else
					class167_sub3_1507_.anIntArray9461 = class167_sub3_1508_.anIntArray9461;
			} else
				class167_sub3_1507_.anIntArray9461 = anIntArray9461;
			if (bool_1512_) {
				if (class167_sub3_1508_.anIntArray9496 == null || class167_sub3_1508_.anIntArray9496.length < anInt9499)
					class167_sub3_1507_.anIntArray9496 = class167_sub3_1508_.anIntArray9496 = new int[anInt9499];
				else
					class167_sub3_1507_.anIntArray9496 = class167_sub3_1508_.anIntArray9496;
			} else
				class167_sub3_1507_.anIntArray9496 = anIntArray9496;
			for (int i_1514_ = 0; i_1514_ < anInt9499; i_1514_++) {
				if (bool_1510_)
					class167_sub3_1507_.anIntArray9460[i_1514_] = anIntArray9460[i_1514_];
				if (bool_1511_)
					class167_sub3_1507_.anIntArray9461[i_1514_] = anIntArray9461[i_1514_];
				if (bool_1512_)
					class167_sub3_1507_.anIntArray9496[i_1514_] = anIntArray9496[i_1514_];
			}
		} else {
			class167_sub3_1507_.anIntArray9460 = anIntArray9460;
			class167_sub3_1507_.anIntArray9461 = anIntArray9461;
			class167_sub3_1507_.anIntArray9496 = anIntArray9496;
		}
		if (Class127.method2162(i, anInt9458)) {
			if (bool)
				class167_sub3_1507_.aByte9454 |= 0x1;
			class167_sub3_1507_.aClass131_9481 = class167_sub3_1508_.aClass131_9481;
			class167_sub3_1507_.aClass131_9481.aByte1555 = aClass131_9481.aByte1555;
			class167_sub3_1507_.aClass131_9481.anInterface15_1558 = aClass131_9481.anInterface15_1558;
		} else if (Class127.method2156(i, anInt9458))
			class167_sub3_1507_.aClass131_9481 = aClass131_9481;
		else
			class167_sub3_1507_.aClass131_9481 = null;
		if (Class127.method2150(i, anInt9458)) {
			if (class167_sub3_1508_.aShortArray9489 == null || class167_sub3_1508_.aShortArray9489.length < anInt9515)
				class167_sub3_1507_.aShortArray9489 = class167_sub3_1508_.aShortArray9489 = new short[anInt9515];
			else
				class167_sub3_1507_.aShortArray9489 = class167_sub3_1508_.aShortArray9489;
			for (int i_1515_ = 0; i_1515_ < anInt9515; i_1515_++)
				class167_sub3_1507_.aShortArray9489[i_1515_] = aShortArray9489[i_1515_];
		} else
			class167_sub3_1507_.aShortArray9489 = aShortArray9489;
		if (Class127.method2194(i, anInt9458)) {
			if (class167_sub3_1508_.aByteArray9476 == null || class167_sub3_1508_.aByteArray9476.length < anInt9515)
				class167_sub3_1507_.aByteArray9476 = class167_sub3_1508_.aByteArray9476 = new byte[anInt9515];
			else
				class167_sub3_1507_.aByteArray9476 = class167_sub3_1508_.aByteArray9476;
			for (int i_1516_ = 0; i_1516_ < anInt9515; i_1516_++)
				class167_sub3_1507_.aByteArray9476[i_1516_] = aByteArray9476[i_1516_];
		} else
			class167_sub3_1507_.aByteArray9476 = aByteArray9476;
		if (Class127.method2147(i, anInt9458)) {
			if (bool)
				class167_sub3_1507_.aByte9454 |= 0x2;
			class167_sub3_1507_.aClass131_9484 = class167_sub3_1508_.aClass131_9484;
			class167_sub3_1507_.aClass131_9484.aByte1555 = aClass131_9484.aByte1555;
			class167_sub3_1507_.aClass131_9484.anInterface15_1558 = aClass131_9484.anInterface15_1558;
		} else if (Class127.method2159(i, anInt9458))
			class167_sub3_1507_.aClass131_9484 = aClass131_9484;
		else
			class167_sub3_1507_.aClass131_9484 = null;
		if (Class127.method2149(i, anInt9458)) {
			if (class167_sub3_1508_.aShortArray9493 == null || class167_sub3_1508_.aShortArray9493.length < anInt9511) {
				int i_1517_ = anInt9511;
				class167_sub3_1507_.aShortArray9493 = class167_sub3_1508_.aShortArray9493 = new short[i_1517_];
				class167_sub3_1507_.aShortArray9467 = class167_sub3_1508_.aShortArray9467 = new short[i_1517_];
				class167_sub3_1507_.aShortArray9468 = class167_sub3_1508_.aShortArray9468 = new short[i_1517_];
			} else {
				class167_sub3_1507_.aShortArray9493 = class167_sub3_1508_.aShortArray9493;
				class167_sub3_1507_.aShortArray9467 = class167_sub3_1508_.aShortArray9467;
				class167_sub3_1507_.aShortArray9468 = class167_sub3_1508_.aShortArray9468;
			}
			if (aClass151_9470 != null) {
				if (class167_sub3_1508_.aClass151_9470 == null)
					class167_sub3_1508_.aClass151_9470 = new Class151();
				Class151 class151 = (class167_sub3_1507_.aClass151_9470 = class167_sub3_1508_.aClass151_9470);
				if (class151.aShortArray1729 == null || class151.aShortArray1729.length < anInt9511) {
					int i_1518_ = anInt9511;
					class151.aShortArray1729 = new short[i_1518_];
					class151.aShortArray1726 = new short[i_1518_];
					class151.aShortArray1728 = new short[i_1518_];
					class151.aByteArray1727 = new byte[i_1518_];
				}
				for (int i_1519_ = 0; i_1519_ < anInt9511; i_1519_++) {
					class167_sub3_1507_.aShortArray9493[i_1519_] = aShortArray9493[i_1519_];
					class167_sub3_1507_.aShortArray9467[i_1519_] = aShortArray9467[i_1519_];
					class167_sub3_1507_.aShortArray9468[i_1519_] = aShortArray9468[i_1519_];
					class151.aShortArray1729[i_1519_] = aClass151_9470.aShortArray1729[i_1519_];
					class151.aShortArray1726[i_1519_] = aClass151_9470.aShortArray1726[i_1519_];
					class151.aShortArray1728[i_1519_] = aClass151_9470.aShortArray1728[i_1519_];
					class151.aByteArray1727[i_1519_] = aClass151_9470.aByteArray1727[i_1519_];
				}
			} else {
				for (int i_1520_ = 0; i_1520_ < anInt9511; i_1520_++) {
					class167_sub3_1507_.aShortArray9493[i_1520_] = aShortArray9493[i_1520_];
					class167_sub3_1507_.aShortArray9467[i_1520_] = aShortArray9467[i_1520_];
					class167_sub3_1507_.aShortArray9468[i_1520_] = aShortArray9468[i_1520_];
				}
			}
			class167_sub3_1507_.aByteArray9487 = aByteArray9487;
		} else {
			class167_sub3_1507_.aClass151_9470 = aClass151_9470;
			class167_sub3_1507_.aShortArray9493 = aShortArray9493;
			class167_sub3_1507_.aShortArray9467 = aShortArray9467;
			class167_sub3_1507_.aShortArray9468 = aShortArray9468;
			class167_sub3_1507_.aByteArray9487 = aByteArray9487;
		}
		if (Class127.method2237(i, anInt9458)) {
			if (bool)
				class167_sub3_1507_.aByte9454 |= 0x4;
			class167_sub3_1507_.aClass131_9485 = class167_sub3_1508_.aClass131_9485;
			class167_sub3_1507_.aClass131_9485.aByte1555 = aClass131_9485.aByte1555;
			class167_sub3_1507_.aClass131_9485.anInterface15_1558 = aClass131_9485.anInterface15_1558;
		} else if (Class127.method2157(i, anInt9458))
			class167_sub3_1507_.aClass131_9485 = aClass131_9485;
		else
			class167_sub3_1507_.aClass131_9485 = null;
		if (Class127.method2152(i, anInt9458)) {
			if (class167_sub3_1508_.aFloatArray9453 == null || class167_sub3_1508_.aFloatArray9453.length < anInt9515) {
				int i_1521_ = anInt9511;
				class167_sub3_1507_.aFloatArray9453 = class167_sub3_1508_.aFloatArray9453 = new float[i_1521_];
				class167_sub3_1507_.aFloatArray9472 = class167_sub3_1508_.aFloatArray9472 = new float[i_1521_];
			} else {
				class167_sub3_1507_.aFloatArray9453 = class167_sub3_1508_.aFloatArray9453;
				class167_sub3_1507_.aFloatArray9472 = class167_sub3_1508_.aFloatArray9472;
			}
			for (int i_1522_ = 0; i_1522_ < anInt9511; i_1522_++) {
				class167_sub3_1507_.aFloatArray9453[i_1522_] = aFloatArray9453[i_1522_];
				class167_sub3_1507_.aFloatArray9472[i_1522_] = aFloatArray9472[i_1522_];
			}
		} else {
			class167_sub3_1507_.aFloatArray9453 = aFloatArray9453;
			class167_sub3_1507_.aFloatArray9472 = aFloatArray9472;
		}
		if (Class127.method2165(i, anInt9458)) {
			if (bool)
				class167_sub3_1507_.aByte9454 |= 0x8;
			class167_sub3_1507_.aClass131_9457 = class167_sub3_1508_.aClass131_9457;
			class167_sub3_1507_.aClass131_9457.aByte1555 = aClass131_9457.aByte1555;
			class167_sub3_1507_.aClass131_9457.anInterface15_1558 = aClass131_9457.anInterface15_1558;
		} else if (Class127.method2189(i, anInt9458))
			class167_sub3_1507_.aClass131_9457 = aClass131_9457;
		else
			class167_sub3_1507_.aClass131_9457 = null;
		if (Class127.method2153(i, anInt9458)) {
			if (class167_sub3_1508_.aShortArray9450 == null || class167_sub3_1508_.aShortArray9450.length < anInt9515) {
				int i_1523_ = anInt9515;
				class167_sub3_1507_.aShortArray9450 = class167_sub3_1508_.aShortArray9450 = new short[i_1523_];
				class167_sub3_1507_.aShortArray9478 = class167_sub3_1508_.aShortArray9478 = new short[i_1523_];
				class167_sub3_1507_.aShortArray9464 = class167_sub3_1508_.aShortArray9464 = new short[i_1523_];
			} else {
				class167_sub3_1507_.aShortArray9450 = class167_sub3_1508_.aShortArray9450;
				class167_sub3_1507_.aShortArray9478 = class167_sub3_1508_.aShortArray9478;
				class167_sub3_1507_.aShortArray9464 = class167_sub3_1508_.aShortArray9464;
			}
			for (int i_1524_ = 0; i_1524_ < anInt9515; i_1524_++) {
				class167_sub3_1507_.aShortArray9450[i_1524_] = aShortArray9450[i_1524_];
				class167_sub3_1507_.aShortArray9478[i_1524_] = aShortArray9478[i_1524_];
				class167_sub3_1507_.aShortArray9464[i_1524_] = aShortArray9464[i_1524_];
			}
		} else {
			class167_sub3_1507_.aShortArray9450 = aShortArray9450;
			class167_sub3_1507_.aShortArray9478 = aShortArray9478;
			class167_sub3_1507_.aShortArray9464 = aShortArray9464;
		}
		if (Class127.method2183(i, anInt9458)) {
			if (bool)
				class167_sub3_1507_.aByte9454 |= 0x10;
			class167_sub3_1507_.aClass119_9509 = class167_sub3_1508_.aClass119_9509;
			class167_sub3_1507_.aClass119_9509.anInterface18_1474 = aClass119_9509.anInterface18_1474;
		} else if (Class127.method2158(i, anInt9458))
			class167_sub3_1507_.aClass119_9509 = aClass119_9509;
		else
			class167_sub3_1507_.aClass119_9509 = null;
		if (Class127.method2154(i, anInt9458)) {
			if (class167_sub3_1508_.aShortArray9473 == null || class167_sub3_1508_.aShortArray9473.length < anInt9515) {
				int i_1525_ = anInt9515;
				class167_sub3_1507_.aShortArray9473 = class167_sub3_1508_.aShortArray9473 = new short[i_1525_];
			} else
				class167_sub3_1507_.aShortArray9473 = class167_sub3_1508_.aShortArray9473;
			for (int i_1526_ = 0; i_1526_ < anInt9515; i_1526_++)
				class167_sub3_1507_.aShortArray9473[i_1526_] = aShortArray9473[i_1526_];
		} else
			class167_sub3_1507_.aShortArray9473 = aShortArray9473;
		if (Class127.method2155(i, anInt9458)) {
			if (class167_sub3_1508_.aClass133Array9479 == null || class167_sub3_1508_.aClass133Array9479.length < anInt9507) {
				int i_1527_ = anInt9507;
				class167_sub3_1507_.aClass133Array9479 = class167_sub3_1508_.aClass133Array9479 = new Class133[i_1527_];
				for (int i_1528_ = 0; i_1528_ < anInt9507; i_1528_++)
					class167_sub3_1507_.aClass133Array9479[i_1528_] = aClass133Array9479[i_1528_].method2264();
			} else {
				class167_sub3_1507_.aClass133Array9479 = class167_sub3_1508_.aClass133Array9479;
				for (int i_1529_ = 0; i_1529_ < anInt9507; i_1529_++)
					class167_sub3_1507_.aClass133Array9479[i_1529_].method2262(aClass133Array9479[i_1529_]);
			}
		} else
			class167_sub3_1507_.aClass133Array9479 = aClass133Array9479;
		class167_sub3_1507_.aClass161Array9508 = aClass161Array9508;
		if (aBool9465) {
			class167_sub3_1507_.anInt9443 = anInt9443;
			class167_sub3_1507_.anInt9492 = anInt9492;
			class167_sub3_1507_.aShort9471 = aShort9471;
			class167_sub3_1507_.aShort9497 = aShort9497;
			class167_sub3_1507_.aShort9494 = aShort9494;
			class167_sub3_1507_.aShort9505 = aShort9505;
			class167_sub3_1507_.aShort9498 = aShort9498;
			class167_sub3_1507_.aShort9491 = aShort9491;
			class167_sub3_1507_.aBool9465 = true;
		} else
			class167_sub3_1507_.aBool9465 = false;
		if (aBool9500) {
			class167_sub3_1507_.aShort9501 = aShort9501;
			class167_sub3_1507_.aBool9500 = true;
		} else
			class167_sub3_1507_.aBool9500 = false;
		class167_sub3_1507_.anIntArrayArray9463 = anIntArrayArray9463;
		class167_sub3_1507_.anIntArrayArray9475 = anIntArrayArray9475;
		class167_sub3_1507_.anIntArrayArray9480 = anIntArrayArray9480;
		class167_sub3_1507_.aShortArray9504 = aShortArray9504;
		class167_sub3_1507_.anIntArray9503 = anIntArray9503;
		class167_sub3_1507_.aShortArray9466 = aShortArray9466;
		class167_sub3_1507_.aShortArray9482 = aShortArray9482;
		class167_sub3_1507_.anIntArray9502 = anIntArray9502;
		class167_sub3_1507_.aClass184Array9449 = aClass184Array9449;
		class167_sub3_1507_.aClass143Array9506 = aClass143Array9506;
		return class167_sub3_1507_;
	}

	Class167 method14895(Class167_Sub3 class167_sub3_1530_, Class167_Sub3 class167_sub3_1531_, int i, boolean bool, boolean bool_1532_) {
		class167_sub3_1530_.aByte9454 = (byte) 0;
		class167_sub3_1530_.anInt9451 = i;
		class167_sub3_1530_.anInt9458 = anInt9458;
		class167_sub3_1530_.aShort9495 = aShort9495;
		class167_sub3_1530_.aShort9455 = aShort9455;
		class167_sub3_1530_.anInt9499 = anInt9499;
		class167_sub3_1530_.anInt9459 = anInt9459;
		class167_sub3_1530_.anInt9511 = anInt9511;
		class167_sub3_1530_.anInt9515 = anInt9515;
		class167_sub3_1530_.anInt9474 = anInt9474;
		class167_sub3_1530_.anInt9507 = anInt9507;
		if ((i & 0x100) != 0)
			class167_sub3_1530_.aBool9456 = true;
		else
			class167_sub3_1530_.aBool9456 = aBool9456;
		class167_sub3_1530_.aBool9469 = aBool9469;
		boolean bool_1533_ = Class127.method2145(i, anInt9458);
		boolean bool_1534_ = Class127.method2169(i, anInt9458);
		boolean bool_1535_ = Class127.method2193(i, anInt9458);
		boolean bool_1536_ = bool_1533_ | bool_1534_ | bool_1535_;
		if (bool_1536_) {
			if (bool_1533_) {
				if (class167_sub3_1531_.anIntArray9460 == null || class167_sub3_1531_.anIntArray9460.length < anInt9499)
					class167_sub3_1530_.anIntArray9460 = class167_sub3_1531_.anIntArray9460 = new int[anInt9499];
				else
					class167_sub3_1530_.anIntArray9460 = class167_sub3_1531_.anIntArray9460;
			} else
				class167_sub3_1530_.anIntArray9460 = anIntArray9460;
			if (bool_1534_) {
				if (class167_sub3_1531_.anIntArray9461 == null || class167_sub3_1531_.anIntArray9461.length < anInt9499)
					class167_sub3_1530_.anIntArray9461 = class167_sub3_1531_.anIntArray9461 = new int[anInt9499];
				else
					class167_sub3_1530_.anIntArray9461 = class167_sub3_1531_.anIntArray9461;
			} else
				class167_sub3_1530_.anIntArray9461 = anIntArray9461;
			if (bool_1535_) {
				if (class167_sub3_1531_.anIntArray9496 == null || class167_sub3_1531_.anIntArray9496.length < anInt9499)
					class167_sub3_1530_.anIntArray9496 = class167_sub3_1531_.anIntArray9496 = new int[anInt9499];
				else
					class167_sub3_1530_.anIntArray9496 = class167_sub3_1531_.anIntArray9496;
			} else
				class167_sub3_1530_.anIntArray9496 = anIntArray9496;
			for (int i_1537_ = 0; i_1537_ < anInt9499; i_1537_++) {
				if (bool_1533_)
					class167_sub3_1530_.anIntArray9460[i_1537_] = anIntArray9460[i_1537_];
				if (bool_1534_)
					class167_sub3_1530_.anIntArray9461[i_1537_] = anIntArray9461[i_1537_];
				if (bool_1535_)
					class167_sub3_1530_.anIntArray9496[i_1537_] = anIntArray9496[i_1537_];
			}
		} else {
			class167_sub3_1530_.anIntArray9460 = anIntArray9460;
			class167_sub3_1530_.anIntArray9461 = anIntArray9461;
			class167_sub3_1530_.anIntArray9496 = anIntArray9496;
		}
		if (Class127.method2162(i, anInt9458)) {
			if (bool)
				class167_sub3_1530_.aByte9454 |= 0x1;
			class167_sub3_1530_.aClass131_9481 = class167_sub3_1531_.aClass131_9481;
			class167_sub3_1530_.aClass131_9481.aByte1555 = aClass131_9481.aByte1555;
			class167_sub3_1530_.aClass131_9481.anInterface15_1558 = aClass131_9481.anInterface15_1558;
		} else if (Class127.method2156(i, anInt9458))
			class167_sub3_1530_.aClass131_9481 = aClass131_9481;
		else
			class167_sub3_1530_.aClass131_9481 = null;
		if (Class127.method2150(i, anInt9458)) {
			if (class167_sub3_1531_.aShortArray9489 == null || class167_sub3_1531_.aShortArray9489.length < anInt9515)
				class167_sub3_1530_.aShortArray9489 = class167_sub3_1531_.aShortArray9489 = new short[anInt9515];
			else
				class167_sub3_1530_.aShortArray9489 = class167_sub3_1531_.aShortArray9489;
			for (int i_1538_ = 0; i_1538_ < anInt9515; i_1538_++)
				class167_sub3_1530_.aShortArray9489[i_1538_] = aShortArray9489[i_1538_];
		} else
			class167_sub3_1530_.aShortArray9489 = aShortArray9489;
		if (Class127.method2194(i, anInt9458)) {
			if (class167_sub3_1531_.aByteArray9476 == null || class167_sub3_1531_.aByteArray9476.length < anInt9515)
				class167_sub3_1530_.aByteArray9476 = class167_sub3_1531_.aByteArray9476 = new byte[anInt9515];
			else
				class167_sub3_1530_.aByteArray9476 = class167_sub3_1531_.aByteArray9476;
			for (int i_1539_ = 0; i_1539_ < anInt9515; i_1539_++)
				class167_sub3_1530_.aByteArray9476[i_1539_] = aByteArray9476[i_1539_];
		} else
			class167_sub3_1530_.aByteArray9476 = aByteArray9476;
		if (Class127.method2147(i, anInt9458)) {
			if (bool)
				class167_sub3_1530_.aByte9454 |= 0x2;
			class167_sub3_1530_.aClass131_9484 = class167_sub3_1531_.aClass131_9484;
			class167_sub3_1530_.aClass131_9484.aByte1555 = aClass131_9484.aByte1555;
			class167_sub3_1530_.aClass131_9484.anInterface15_1558 = aClass131_9484.anInterface15_1558;
		} else if (Class127.method2159(i, anInt9458))
			class167_sub3_1530_.aClass131_9484 = aClass131_9484;
		else
			class167_sub3_1530_.aClass131_9484 = null;
		if (Class127.method2149(i, anInt9458)) {
			if (class167_sub3_1531_.aShortArray9493 == null || class167_sub3_1531_.aShortArray9493.length < anInt9511) {
				int i_1540_ = anInt9511;
				class167_sub3_1530_.aShortArray9493 = class167_sub3_1531_.aShortArray9493 = new short[i_1540_];
				class167_sub3_1530_.aShortArray9467 = class167_sub3_1531_.aShortArray9467 = new short[i_1540_];
				class167_sub3_1530_.aShortArray9468 = class167_sub3_1531_.aShortArray9468 = new short[i_1540_];
			} else {
				class167_sub3_1530_.aShortArray9493 = class167_sub3_1531_.aShortArray9493;
				class167_sub3_1530_.aShortArray9467 = class167_sub3_1531_.aShortArray9467;
				class167_sub3_1530_.aShortArray9468 = class167_sub3_1531_.aShortArray9468;
			}
			if (aClass151_9470 != null) {
				if (class167_sub3_1531_.aClass151_9470 == null)
					class167_sub3_1531_.aClass151_9470 = new Class151();
				Class151 class151 = (class167_sub3_1530_.aClass151_9470 = class167_sub3_1531_.aClass151_9470);
				if (class151.aShortArray1729 == null || class151.aShortArray1729.length < anInt9511) {
					int i_1541_ = anInt9511;
					class151.aShortArray1729 = new short[i_1541_];
					class151.aShortArray1726 = new short[i_1541_];
					class151.aShortArray1728 = new short[i_1541_];
					class151.aByteArray1727 = new byte[i_1541_];
				}
				for (int i_1542_ = 0; i_1542_ < anInt9511; i_1542_++) {
					class167_sub3_1530_.aShortArray9493[i_1542_] = aShortArray9493[i_1542_];
					class167_sub3_1530_.aShortArray9467[i_1542_] = aShortArray9467[i_1542_];
					class167_sub3_1530_.aShortArray9468[i_1542_] = aShortArray9468[i_1542_];
					class151.aShortArray1729[i_1542_] = aClass151_9470.aShortArray1729[i_1542_];
					class151.aShortArray1726[i_1542_] = aClass151_9470.aShortArray1726[i_1542_];
					class151.aShortArray1728[i_1542_] = aClass151_9470.aShortArray1728[i_1542_];
					class151.aByteArray1727[i_1542_] = aClass151_9470.aByteArray1727[i_1542_];
				}
			} else {
				for (int i_1543_ = 0; i_1543_ < anInt9511; i_1543_++) {
					class167_sub3_1530_.aShortArray9493[i_1543_] = aShortArray9493[i_1543_];
					class167_sub3_1530_.aShortArray9467[i_1543_] = aShortArray9467[i_1543_];
					class167_sub3_1530_.aShortArray9468[i_1543_] = aShortArray9468[i_1543_];
				}
			}
			class167_sub3_1530_.aByteArray9487 = aByteArray9487;
		} else {
			class167_sub3_1530_.aClass151_9470 = aClass151_9470;
			class167_sub3_1530_.aShortArray9493 = aShortArray9493;
			class167_sub3_1530_.aShortArray9467 = aShortArray9467;
			class167_sub3_1530_.aShortArray9468 = aShortArray9468;
			class167_sub3_1530_.aByteArray9487 = aByteArray9487;
		}
		if (Class127.method2237(i, anInt9458)) {
			if (bool)
				class167_sub3_1530_.aByte9454 |= 0x4;
			class167_sub3_1530_.aClass131_9485 = class167_sub3_1531_.aClass131_9485;
			class167_sub3_1530_.aClass131_9485.aByte1555 = aClass131_9485.aByte1555;
			class167_sub3_1530_.aClass131_9485.anInterface15_1558 = aClass131_9485.anInterface15_1558;
		} else if (Class127.method2157(i, anInt9458))
			class167_sub3_1530_.aClass131_9485 = aClass131_9485;
		else
			class167_sub3_1530_.aClass131_9485 = null;
		if (Class127.method2152(i, anInt9458)) {
			if (class167_sub3_1531_.aFloatArray9453 == null || class167_sub3_1531_.aFloatArray9453.length < anInt9515) {
				int i_1544_ = anInt9511;
				class167_sub3_1530_.aFloatArray9453 = class167_sub3_1531_.aFloatArray9453 = new float[i_1544_];
				class167_sub3_1530_.aFloatArray9472 = class167_sub3_1531_.aFloatArray9472 = new float[i_1544_];
			} else {
				class167_sub3_1530_.aFloatArray9453 = class167_sub3_1531_.aFloatArray9453;
				class167_sub3_1530_.aFloatArray9472 = class167_sub3_1531_.aFloatArray9472;
			}
			for (int i_1545_ = 0; i_1545_ < anInt9511; i_1545_++) {
				class167_sub3_1530_.aFloatArray9453[i_1545_] = aFloatArray9453[i_1545_];
				class167_sub3_1530_.aFloatArray9472[i_1545_] = aFloatArray9472[i_1545_];
			}
		} else {
			class167_sub3_1530_.aFloatArray9453 = aFloatArray9453;
			class167_sub3_1530_.aFloatArray9472 = aFloatArray9472;
		}
		if (Class127.method2165(i, anInt9458)) {
			if (bool)
				class167_sub3_1530_.aByte9454 |= 0x8;
			class167_sub3_1530_.aClass131_9457 = class167_sub3_1531_.aClass131_9457;
			class167_sub3_1530_.aClass131_9457.aByte1555 = aClass131_9457.aByte1555;
			class167_sub3_1530_.aClass131_9457.anInterface15_1558 = aClass131_9457.anInterface15_1558;
		} else if (Class127.method2189(i, anInt9458))
			class167_sub3_1530_.aClass131_9457 = aClass131_9457;
		else
			class167_sub3_1530_.aClass131_9457 = null;
		if (Class127.method2153(i, anInt9458)) {
			if (class167_sub3_1531_.aShortArray9450 == null || class167_sub3_1531_.aShortArray9450.length < anInt9515) {
				int i_1546_ = anInt9515;
				class167_sub3_1530_.aShortArray9450 = class167_sub3_1531_.aShortArray9450 = new short[i_1546_];
				class167_sub3_1530_.aShortArray9478 = class167_sub3_1531_.aShortArray9478 = new short[i_1546_];
				class167_sub3_1530_.aShortArray9464 = class167_sub3_1531_.aShortArray9464 = new short[i_1546_];
			} else {
				class167_sub3_1530_.aShortArray9450 = class167_sub3_1531_.aShortArray9450;
				class167_sub3_1530_.aShortArray9478 = class167_sub3_1531_.aShortArray9478;
				class167_sub3_1530_.aShortArray9464 = class167_sub3_1531_.aShortArray9464;
			}
			for (int i_1547_ = 0; i_1547_ < anInt9515; i_1547_++) {
				class167_sub3_1530_.aShortArray9450[i_1547_] = aShortArray9450[i_1547_];
				class167_sub3_1530_.aShortArray9478[i_1547_] = aShortArray9478[i_1547_];
				class167_sub3_1530_.aShortArray9464[i_1547_] = aShortArray9464[i_1547_];
			}
		} else {
			class167_sub3_1530_.aShortArray9450 = aShortArray9450;
			class167_sub3_1530_.aShortArray9478 = aShortArray9478;
			class167_sub3_1530_.aShortArray9464 = aShortArray9464;
		}
		if (Class127.method2183(i, anInt9458)) {
			if (bool)
				class167_sub3_1530_.aByte9454 |= 0x10;
			class167_sub3_1530_.aClass119_9509 = class167_sub3_1531_.aClass119_9509;
			class167_sub3_1530_.aClass119_9509.anInterface18_1474 = aClass119_9509.anInterface18_1474;
		} else if (Class127.method2158(i, anInt9458))
			class167_sub3_1530_.aClass119_9509 = aClass119_9509;
		else
			class167_sub3_1530_.aClass119_9509 = null;
		if (Class127.method2154(i, anInt9458)) {
			if (class167_sub3_1531_.aShortArray9473 == null || class167_sub3_1531_.aShortArray9473.length < anInt9515) {
				int i_1548_ = anInt9515;
				class167_sub3_1530_.aShortArray9473 = class167_sub3_1531_.aShortArray9473 = new short[i_1548_];
			} else
				class167_sub3_1530_.aShortArray9473 = class167_sub3_1531_.aShortArray9473;
			for (int i_1549_ = 0; i_1549_ < anInt9515; i_1549_++)
				class167_sub3_1530_.aShortArray9473[i_1549_] = aShortArray9473[i_1549_];
		} else
			class167_sub3_1530_.aShortArray9473 = aShortArray9473;
		if (Class127.method2155(i, anInt9458)) {
			if (class167_sub3_1531_.aClass133Array9479 == null || class167_sub3_1531_.aClass133Array9479.length < anInt9507) {
				int i_1550_ = anInt9507;
				class167_sub3_1530_.aClass133Array9479 = class167_sub3_1531_.aClass133Array9479 = new Class133[i_1550_];
				for (int i_1551_ = 0; i_1551_ < anInt9507; i_1551_++)
					class167_sub3_1530_.aClass133Array9479[i_1551_] = aClass133Array9479[i_1551_].method2264();
			} else {
				class167_sub3_1530_.aClass133Array9479 = class167_sub3_1531_.aClass133Array9479;
				for (int i_1552_ = 0; i_1552_ < anInt9507; i_1552_++)
					class167_sub3_1530_.aClass133Array9479[i_1552_].method2262(aClass133Array9479[i_1552_]);
			}
		} else
			class167_sub3_1530_.aClass133Array9479 = aClass133Array9479;
		class167_sub3_1530_.aClass161Array9508 = aClass161Array9508;
		if (aBool9465) {
			class167_sub3_1530_.anInt9443 = anInt9443;
			class167_sub3_1530_.anInt9492 = anInt9492;
			class167_sub3_1530_.aShort9471 = aShort9471;
			class167_sub3_1530_.aShort9497 = aShort9497;
			class167_sub3_1530_.aShort9494 = aShort9494;
			class167_sub3_1530_.aShort9505 = aShort9505;
			class167_sub3_1530_.aShort9498 = aShort9498;
			class167_sub3_1530_.aShort9491 = aShort9491;
			class167_sub3_1530_.aBool9465 = true;
		} else
			class167_sub3_1530_.aBool9465 = false;
		if (aBool9500) {
			class167_sub3_1530_.aShort9501 = aShort9501;
			class167_sub3_1530_.aBool9500 = true;
		} else
			class167_sub3_1530_.aBool9500 = false;
		class167_sub3_1530_.anIntArrayArray9463 = anIntArrayArray9463;
		class167_sub3_1530_.anIntArrayArray9475 = anIntArrayArray9475;
		class167_sub3_1530_.anIntArrayArray9480 = anIntArrayArray9480;
		class167_sub3_1530_.aShortArray9504 = aShortArray9504;
		class167_sub3_1530_.anIntArray9503 = anIntArray9503;
		class167_sub3_1530_.aShortArray9466 = aShortArray9466;
		class167_sub3_1530_.aShortArray9482 = aShortArray9482;
		class167_sub3_1530_.anIntArray9502 = anIntArray9502;
		class167_sub3_1530_.aClass184Array9449 = aClass184Array9449;
		class167_sub3_1530_.aClass143Array9506 = aClass143Array9506;
		return class167_sub3_1530_;
	}

	void method2779(int i, int[] is, int i_1553_, int i_1554_, int i_1555_, boolean bool, int i_1556_, int[] is_1557_) {
		int i_1558_ = is.length;
		if (i == 0) {
			i_1553_ <<= 4;
			i_1554_ <<= 4;
			i_1555_ <<= 4;
			int i_1559_ = 0;
			anInt9516 = 0;
			anInt9517 = 0;
			anInt9518 = 0;
			for (int i_1560_ = 0; i_1560_ < i_1558_; i_1560_++) {
				int i_1561_ = is[i_1560_];
				if (i_1561_ < anIntArrayArray9463.length) {
					int[] is_1562_ = anIntArrayArray9463[i_1561_];
					for (int i_1563_ = 0; i_1563_ < is_1562_.length; i_1563_++) {
						int i_1564_ = is_1562_[i_1563_];
						if (aShortArray9466 == null || (i_1556_ & aShortArray9466[i_1564_]) != 0) {
							anInt9516 += anIntArray9460[i_1564_];
							anInt9517 += anIntArray9461[i_1564_];
							anInt9518 += anIntArray9496[i_1564_];
							i_1559_++;
						}
					}
				}
			}
			if (i_1559_ > 0) {
				anInt9516 = anInt9516 / i_1559_ + i_1553_;
				anInt9517 = anInt9517 / i_1559_ + i_1554_;
				anInt9518 = anInt9518 / i_1559_ + i_1555_;
				aBool9519 = true;
			} else {
				anInt9516 = i_1553_;
				anInt9517 = i_1554_;
				anInt9518 = i_1555_;
			}
		} else if (i == 1) {
			if (is_1557_ != null) {
				int i_1565_ = ((is_1557_[0] * i_1553_ + is_1557_[1] * i_1554_ + is_1557_[2] * i_1555_ + 8192) >> 14);
				int i_1566_ = ((is_1557_[3] * i_1553_ + is_1557_[4] * i_1554_ + is_1557_[5] * i_1555_ + 8192) >> 14);
				int i_1567_ = ((is_1557_[6] * i_1553_ + is_1557_[7] * i_1554_ + is_1557_[8] * i_1555_ + 8192) >> 14);
				i_1553_ = i_1565_;
				i_1554_ = i_1566_;
				i_1555_ = i_1567_;
			}
			i_1553_ <<= 4;
			i_1554_ <<= 4;
			i_1555_ <<= 4;
			for (int i_1568_ = 0; i_1568_ < i_1558_; i_1568_++) {
				int i_1569_ = is[i_1568_];
				if (i_1569_ < anIntArrayArray9463.length) {
					int[] is_1570_ = anIntArrayArray9463[i_1569_];
					for (int i_1571_ = 0; i_1571_ < is_1570_.length; i_1571_++) {
						int i_1572_ = is_1570_[i_1571_];
						if (aShortArray9466 == null || (i_1556_ & aShortArray9466[i_1572_]) != 0) {
							anIntArray9460[i_1572_] += i_1553_;
							anIntArray9461[i_1572_] += i_1554_;
							anIntArray9496[i_1572_] += i_1555_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1557_ != null) {
				int i_1573_ = is_1557_[9] << 4;
				int i_1574_ = is_1557_[10] << 4;
				int i_1575_ = is_1557_[11] << 4;
				int i_1576_ = is_1557_[12] << 4;
				int i_1577_ = is_1557_[13] << 4;
				int i_1578_ = is_1557_[14] << 4;
				if (aBool9519) {
					int i_1579_ = ((is_1557_[0] * anInt9516 + is_1557_[3] * anInt9517 + is_1557_[6] * anInt9518 + 8192) >> 14);
					int i_1580_ = ((is_1557_[1] * anInt9516 + is_1557_[4] * anInt9517 + is_1557_[7] * anInt9518 + 8192) >> 14);
					int i_1581_ = ((is_1557_[2] * anInt9516 + is_1557_[5] * anInt9517 + is_1557_[8] * anInt9518 + 8192) >> 14);
					i_1579_ += i_1576_;
					i_1580_ += i_1577_;
					i_1581_ += i_1578_;
					anInt9516 = i_1579_;
					anInt9517 = i_1580_;
					anInt9518 = i_1581_;
					aBool9519 = false;
				}
				int[] is_1582_ = new int[9];
				int i_1583_ = Class433.anIntArray4881[i_1553_];
				int i_1584_ = Class433.anIntArray4880[i_1553_];
				int i_1585_ = Class433.anIntArray4881[i_1554_];
				int i_1586_ = Class433.anIntArray4880[i_1554_];
				int i_1587_ = Class433.anIntArray4881[i_1555_];
				int i_1588_ = Class433.anIntArray4880[i_1555_];
				int i_1589_ = i_1584_ * i_1587_ + 8192 >> 14;
				int i_1590_ = i_1584_ * i_1588_ + 8192 >> 14;
				is_1582_[0] = i_1585_ * i_1587_ + i_1586_ * i_1590_ + 8192 >> 14;
				is_1582_[1] = -i_1585_ * i_1588_ + i_1586_ * i_1589_ + 8192 >> 14;
				is_1582_[2] = i_1586_ * i_1583_ + 8192 >> 14;
				is_1582_[3] = i_1583_ * i_1588_ + 8192 >> 14;
				is_1582_[4] = i_1583_ * i_1587_ + 8192 >> 14;
				is_1582_[5] = -i_1584_;
				is_1582_[6] = -i_1586_ * i_1587_ + i_1585_ * i_1590_ + 8192 >> 14;
				is_1582_[7] = i_1586_ * i_1588_ + i_1585_ * i_1589_ + 8192 >> 14;
				is_1582_[8] = i_1585_ * i_1583_ + 8192 >> 14;
				int i_1591_ = ((is_1582_[0] * -anInt9516 + is_1582_[1] * -anInt9517 + is_1582_[2] * -anInt9518 + 8192) >> 14);
				int i_1592_ = ((is_1582_[3] * -anInt9516 + is_1582_[4] * -anInt9517 + is_1582_[5] * -anInt9518 + 8192) >> 14);
				int i_1593_ = ((is_1582_[6] * -anInt9516 + is_1582_[7] * -anInt9517 + is_1582_[8] * -anInt9518 + 8192) >> 14);
				int i_1594_ = i_1591_ + anInt9516;
				int i_1595_ = i_1592_ + anInt9517;
				int i_1596_ = i_1593_ + anInt9518;
				int[] is_1597_ = new int[9];
				for (int i_1598_ = 0; i_1598_ < 3; i_1598_++) {
					for (int i_1599_ = 0; i_1599_ < 3; i_1599_++) {
						int i_1600_ = 0;
						for (int i_1601_ = 0; i_1601_ < 3; i_1601_++)
							i_1600_ += (is_1582_[i_1598_ * 3 + i_1601_] * is_1557_[i_1599_ * 3 + i_1601_]);
						is_1597_[i_1598_ * 3 + i_1599_] = i_1600_ + 8192 >> 14;
					}
				}
				int i_1602_ = ((is_1582_[0] * i_1576_ + is_1582_[1] * i_1577_ + is_1582_[2] * i_1578_ + 8192) >> 14);
				int i_1603_ = ((is_1582_[3] * i_1576_ + is_1582_[4] * i_1577_ + is_1582_[5] * i_1578_ + 8192) >> 14);
				int i_1604_ = ((is_1582_[6] * i_1576_ + is_1582_[7] * i_1577_ + is_1582_[8] * i_1578_ + 8192) >> 14);
				i_1602_ += i_1594_;
				i_1603_ += i_1595_;
				i_1604_ += i_1596_;
				int[] is_1605_ = new int[9];
				for (int i_1606_ = 0; i_1606_ < 3; i_1606_++) {
					for (int i_1607_ = 0; i_1607_ < 3; i_1607_++) {
						int i_1608_ = 0;
						for (int i_1609_ = 0; i_1609_ < 3; i_1609_++)
							i_1608_ += (is_1557_[i_1606_ * 3 + i_1609_] * is_1597_[i_1607_ + i_1609_ * 3]);
						is_1605_[i_1606_ * 3 + i_1607_] = i_1608_ + 8192 >> 14;
					}
				}
				int i_1610_ = ((is_1557_[0] * i_1602_ + is_1557_[1] * i_1603_ + is_1557_[2] * i_1604_ + 8192) >> 14);
				int i_1611_ = ((is_1557_[3] * i_1602_ + is_1557_[4] * i_1603_ + is_1557_[5] * i_1604_ + 8192) >> 14);
				int i_1612_ = ((is_1557_[6] * i_1602_ + is_1557_[7] * i_1603_ + is_1557_[8] * i_1604_ + 8192) >> 14);
				i_1610_ += i_1573_;
				i_1611_ += i_1574_;
				i_1612_ += i_1575_;
				for (int i_1613_ = 0; i_1613_ < i_1558_; i_1613_++) {
					int i_1614_ = is[i_1613_];
					if (i_1614_ < anIntArrayArray9463.length) {
						int[] is_1615_ = anIntArrayArray9463[i_1614_];
						for (int i_1616_ = 0; i_1616_ < is_1615_.length; i_1616_++) {
							int i_1617_ = is_1615_[i_1616_];
							if (aShortArray9466 == null || (i_1556_ & aShortArray9466[i_1617_]) != 0) {
								int i_1618_ = ((is_1605_[0] * anIntArray9460[i_1617_] + is_1605_[1] * anIntArray9461[i_1617_] + is_1605_[2] * anIntArray9496[i_1617_] + 8192) >> 14);
								int i_1619_ = ((is_1605_[3] * anIntArray9460[i_1617_] + is_1605_[4] * anIntArray9461[i_1617_] + is_1605_[5] * anIntArray9496[i_1617_] + 8192) >> 14);
								int i_1620_ = ((is_1605_[6] * anIntArray9460[i_1617_] + is_1605_[7] * anIntArray9461[i_1617_] + is_1605_[8] * anIntArray9496[i_1617_] + 8192) >> 14);
								i_1618_ += i_1610_;
								i_1619_ += i_1611_;
								i_1620_ += i_1612_;
								anIntArray9460[i_1617_] = i_1618_;
								anIntArray9461[i_1617_] = i_1619_;
								anIntArray9496[i_1617_] = i_1620_;
							}
						}
					}
				}
			} else {
				for (int i_1621_ = 0; i_1621_ < i_1558_; i_1621_++) {
					int i_1622_ = is[i_1621_];
					if (i_1622_ < anIntArrayArray9463.length) {
						int[] is_1623_ = anIntArrayArray9463[i_1622_];
						for (int i_1624_ = 0; i_1624_ < is_1623_.length; i_1624_++) {
							int i_1625_ = is_1623_[i_1624_];
							if (aShortArray9466 == null || (i_1556_ & aShortArray9466[i_1625_]) != 0) {
								anIntArray9460[i_1625_] -= anInt9516;
								anIntArray9461[i_1625_] -= anInt9517;
								anIntArray9496[i_1625_] -= anInt9518;
								if (i_1555_ != 0) {
									int i_1626_ = Class433.anIntArray4880[i_1555_];
									int i_1627_ = Class433.anIntArray4881[i_1555_];
									int i_1628_ = ((anIntArray9461[i_1625_] * i_1626_ + anIntArray9460[i_1625_] * i_1627_ + 16383) >> 14);
									anIntArray9461[i_1625_] = (anIntArray9461[i_1625_] * i_1627_ - anIntArray9460[i_1625_] * i_1626_ + 16383) >> 14;
									anIntArray9460[i_1625_] = i_1628_;
								}
								if (i_1553_ != 0) {
									int i_1629_ = Class433.anIntArray4880[i_1553_];
									int i_1630_ = Class433.anIntArray4881[i_1553_];
									int i_1631_ = ((anIntArray9461[i_1625_] * i_1630_ - anIntArray9496[i_1625_] * i_1629_ + 16383) >> 14);
									anIntArray9496[i_1625_] = (anIntArray9461[i_1625_] * i_1629_ + anIntArray9496[i_1625_] * i_1630_ + 16383) >> 14;
									anIntArray9461[i_1625_] = i_1631_;
								}
								if (i_1554_ != 0) {
									int i_1632_ = Class433.anIntArray4880[i_1554_];
									int i_1633_ = Class433.anIntArray4881[i_1554_];
									int i_1634_ = ((anIntArray9496[i_1625_] * i_1632_ + anIntArray9460[i_1625_] * i_1633_ + 16383) >> 14);
									anIntArray9496[i_1625_] = (anIntArray9496[i_1625_] * i_1633_ - anIntArray9460[i_1625_] * i_1632_ + 16383) >> 14;
									anIntArray9460[i_1625_] = i_1634_;
								}
								anIntArray9460[i_1625_] += anInt9516;
								anIntArray9461[i_1625_] += anInt9517;
								anIntArray9496[i_1625_] += anInt9518;
							}
						}
					}
				}
				if (bool) {
					for (int i_1635_ = 0; i_1635_ < i_1558_; i_1635_++) {
						int i_1636_ = is[i_1635_];
						if (i_1636_ < anIntArrayArray9463.length) {
							int[] is_1637_ = anIntArrayArray9463[i_1636_];
							for (int i_1638_ = 0; i_1638_ < is_1637_.length; i_1638_++) {
								int i_1639_ = is_1637_[i_1638_];
								if (aShortArray9466 == null || ((i_1556_ & aShortArray9466[i_1639_]) != 0)) {
									int i_1640_ = anIntArray9503[i_1639_];
									int i_1641_ = anIntArray9503[i_1639_ + 1];
									for (int i_1642_ = i_1640_; (i_1642_ < i_1641_ && aShortArray9504[i_1642_] != 0); i_1642_++) {
										int i_1643_ = (aShortArray9504[i_1642_] & 0xffff) - 1;
										if (i_1555_ != 0) {
											int i_1644_ = (Class433.anIntArray4880[i_1555_]);
											int i_1645_ = (Class433.anIntArray4881[i_1555_]);
											int i_1646_ = (((aShortArray9467[i_1643_] * i_1644_) + (aShortArray9493[i_1643_] * i_1645_) + 16383) >> 14);
											aShortArray9467[i_1643_] = (short) ((((aShortArray9467[i_1643_]) * i_1645_) - ((aShortArray9493[i_1643_]) * i_1644_) + 16383) >> 14);
											aShortArray9493[i_1643_] = (short) i_1646_;
										}
										if (i_1553_ != 0) {
											int i_1647_ = (Class433.anIntArray4880[i_1553_]);
											int i_1648_ = (Class433.anIntArray4881[i_1553_]);
											int i_1649_ = (((aShortArray9467[i_1643_] * i_1648_) - (aShortArray9468[i_1643_] * i_1647_) + 16383) >> 14);
											aShortArray9468[i_1643_] = (short) ((((aShortArray9467[i_1643_]) * i_1647_) + ((aShortArray9468[i_1643_]) * i_1648_) + 16383) >> 14);
											aShortArray9467[i_1643_] = (short) i_1649_;
										}
										if (i_1554_ != 0) {
											int i_1650_ = (Class433.anIntArray4880[i_1554_]);
											int i_1651_ = (Class433.anIntArray4881[i_1554_]);
											int i_1652_ = (((aShortArray9468[i_1643_] * i_1650_) + (aShortArray9493[i_1643_] * i_1651_) + 16383) >> 14);
											aShortArray9468[i_1643_] = (short) ((((aShortArray9468[i_1643_]) * i_1651_) - ((aShortArray9493[i_1643_]) * i_1650_) + 16383) >> 14);
											aShortArray9493[i_1643_] = (short) i_1652_;
										}
									}
								}
							}
						}
					}
					if (aClass131_9485 == null && aClass131_9484 != null)
						aClass131_9484.anInterface15_1558 = null;
					if (aClass131_9485 != null)
						aClass131_9485.anInterface15_1558 = null;
				}
			}
		} else if (i == 3) {
			if (is_1557_ != null) {
				int i_1653_ = is_1557_[9] << 4;
				int i_1654_ = is_1557_[10] << 4;
				int i_1655_ = is_1557_[11] << 4;
				int i_1656_ = is_1557_[12] << 4;
				int i_1657_ = is_1557_[13] << 4;
				int i_1658_ = is_1557_[14] << 4;
				if (aBool9519) {
					int i_1659_ = ((is_1557_[0] * anInt9516 + is_1557_[3] * anInt9517 + is_1557_[6] * anInt9518 + 8192) >> 14);
					int i_1660_ = ((is_1557_[1] * anInt9516 + is_1557_[4] * anInt9517 + is_1557_[7] * anInt9518 + 8192) >> 14);
					int i_1661_ = ((is_1557_[2] * anInt9516 + is_1557_[5] * anInt9517 + is_1557_[8] * anInt9518 + 8192) >> 14);
					i_1659_ += i_1656_;
					i_1660_ += i_1657_;
					i_1661_ += i_1658_;
					anInt9516 = i_1659_;
					anInt9517 = i_1660_;
					anInt9518 = i_1661_;
					aBool9519 = false;
				}
				int i_1662_ = i_1553_ << 15 >> 7;
				int i_1663_ = i_1554_ << 15 >> 7;
				int i_1664_ = i_1555_ << 15 >> 7;
				int i_1665_ = i_1662_ * -anInt9516 + 8192 >> 14;
				int i_1666_ = i_1663_ * -anInt9517 + 8192 >> 14;
				int i_1667_ = i_1664_ * -anInt9518 + 8192 >> 14;
				int i_1668_ = i_1665_ + anInt9516;
				int i_1669_ = i_1666_ + anInt9517;
				int i_1670_ = i_1667_ + anInt9518;
				int[] is_1671_ = new int[9];
				is_1671_[0] = i_1662_ * is_1557_[0] + 8192 >> 14;
				is_1671_[1] = i_1662_ * is_1557_[3] + 8192 >> 14;
				is_1671_[2] = i_1662_ * is_1557_[6] + 8192 >> 14;
				is_1671_[3] = i_1663_ * is_1557_[1] + 8192 >> 14;
				is_1671_[4] = i_1663_ * is_1557_[4] + 8192 >> 14;
				is_1671_[5] = i_1663_ * is_1557_[7] + 8192 >> 14;
				is_1671_[6] = i_1664_ * is_1557_[2] + 8192 >> 14;
				is_1671_[7] = i_1664_ * is_1557_[5] + 8192 >> 14;
				is_1671_[8] = i_1664_ * is_1557_[8] + 8192 >> 14;
				int i_1672_ = i_1662_ * i_1656_ + 8192 >> 14;
				int i_1673_ = i_1663_ * i_1657_ + 8192 >> 14;
				int i_1674_ = i_1664_ * i_1658_ + 8192 >> 14;
				i_1672_ += i_1668_;
				i_1673_ += i_1669_;
				i_1674_ += i_1670_;
				int[] is_1675_ = new int[9];
				for (int i_1676_ = 0; i_1676_ < 3; i_1676_++) {
					for (int i_1677_ = 0; i_1677_ < 3; i_1677_++) {
						int i_1678_ = 0;
						for (int i_1679_ = 0; i_1679_ < 3; i_1679_++)
							i_1678_ += (is_1557_[i_1676_ * 3 + i_1679_] * is_1671_[i_1677_ + i_1679_ * 3]);
						is_1675_[i_1676_ * 3 + i_1677_] = i_1678_ + 8192 >> 14;
					}
				}
				int i_1680_ = ((is_1557_[0] * i_1672_ + is_1557_[1] * i_1673_ + is_1557_[2] * i_1674_ + 8192) >> 14);
				int i_1681_ = ((is_1557_[3] * i_1672_ + is_1557_[4] * i_1673_ + is_1557_[5] * i_1674_ + 8192) >> 14);
				int i_1682_ = ((is_1557_[6] * i_1672_ + is_1557_[7] * i_1673_ + is_1557_[8] * i_1674_ + 8192) >> 14);
				i_1680_ += i_1653_;
				i_1681_ += i_1654_;
				i_1682_ += i_1655_;
				for (int i_1683_ = 0; i_1683_ < i_1558_; i_1683_++) {
					int i_1684_ = is[i_1683_];
					if (i_1684_ < anIntArrayArray9463.length) {
						int[] is_1685_ = anIntArrayArray9463[i_1684_];
						for (int i_1686_ = 0; i_1686_ < is_1685_.length; i_1686_++) {
							int i_1687_ = is_1685_[i_1686_];
							if (aShortArray9466 == null || (i_1556_ & aShortArray9466[i_1687_]) != 0) {
								int i_1688_ = ((is_1675_[0] * anIntArray9460[i_1687_] + is_1675_[1] * anIntArray9461[i_1687_] + is_1675_[2] * anIntArray9496[i_1687_] + 8192) >> 14);
								int i_1689_ = ((is_1675_[3] * anIntArray9460[i_1687_] + is_1675_[4] * anIntArray9461[i_1687_] + is_1675_[5] * anIntArray9496[i_1687_] + 8192) >> 14);
								int i_1690_ = ((is_1675_[6] * anIntArray9460[i_1687_] + is_1675_[7] * anIntArray9461[i_1687_] + is_1675_[8] * anIntArray9496[i_1687_] + 8192) >> 14);
								i_1688_ += i_1680_;
								i_1689_ += i_1681_;
								i_1690_ += i_1682_;
								anIntArray9460[i_1687_] = i_1688_;
								anIntArray9461[i_1687_] = i_1689_;
								anIntArray9496[i_1687_] = i_1690_;
							}
						}
					}
				}
			} else {
				for (int i_1691_ = 0; i_1691_ < i_1558_; i_1691_++) {
					int i_1692_ = is[i_1691_];
					if (i_1692_ < anIntArrayArray9463.length) {
						int[] is_1693_ = anIntArrayArray9463[i_1692_];
						for (int i_1694_ = 0; i_1694_ < is_1693_.length; i_1694_++) {
							int i_1695_ = is_1693_[i_1694_];
							if (aShortArray9466 == null || (i_1556_ & aShortArray9466[i_1695_]) != 0) {
								anIntArray9460[i_1695_] -= anInt9516;
								anIntArray9461[i_1695_] -= anInt9517;
								anIntArray9496[i_1695_] -= anInt9518;
								anIntArray9460[i_1695_] = anIntArray9460[i_1695_] * i_1553_ >> 7;
								anIntArray9461[i_1695_] = anIntArray9461[i_1695_] * i_1554_ >> 7;
								anIntArray9496[i_1695_] = anIntArray9496[i_1695_] * i_1555_ >> 7;
								anIntArray9460[i_1695_] += anInt9516;
								anIntArray9461[i_1695_] += anInt9517;
								anIntArray9496[i_1695_] += anInt9518;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9475 != null) {
				for (int i_1696_ = 0; i_1696_ < i_1558_; i_1696_++) {
					int i_1697_ = is[i_1696_];
					if (i_1697_ < anIntArrayArray9475.length) {
						int[] is_1698_ = anIntArrayArray9475[i_1697_];
						for (int i_1699_ = 0; i_1699_ < is_1698_.length; i_1699_++) {
							int i_1700_ = is_1698_[i_1699_];
							if (aShortArray9482 == null || (i_1556_ & aShortArray9482[i_1700_]) != 0) {
								int i_1701_ = ((aByteArray9476[i_1700_] & 0xff) + i_1553_ * 8);
								if (i_1701_ < 0)
									i_1701_ = 0;
								else if (i_1701_ > 255)
									i_1701_ = 255;
								aByteArray9476[i_1700_] = (byte) i_1701_;
								if (aClass131_9484 != null)
									aClass131_9484.anInterface15_1558 = null;
							}
						}
					}
				}
				if (aClass161Array9508 != null) {
					for (int i_1702_ = 0; i_1702_ < anInt9507; i_1702_++) {
						Class161 class161 = aClass161Array9508[i_1702_];
						Class133 class133 = aClass133Array9479[i_1702_];
						class133.anInt1577 = (class133.anInt1577 & 0xffffff | 255 - (aByteArray9476[class161.anInt1764] & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9475 != null) {
				for (int i_1703_ = 0; i_1703_ < i_1558_; i_1703_++) {
					int i_1704_ = is[i_1703_];
					if (i_1704_ < anIntArrayArray9475.length) {
						int[] is_1705_ = anIntArrayArray9475[i_1704_];
						for (int i_1706_ = 0; i_1706_ < is_1705_.length; i_1706_++) {
							int i_1707_ = is_1705_[i_1706_];
							if (aShortArray9482 == null || (i_1556_ & aShortArray9482[i_1707_]) != 0) {
								int i_1708_ = aShortArray9489[i_1707_] & 0xffff;
								int i_1709_ = i_1708_ >> 10 & 0x3f;
								int i_1710_ = i_1708_ >> 7 & 0x7;
								int i_1711_ = i_1708_ & 0x7f;
								i_1709_ = i_1709_ + i_1553_ & 0x3f;
								i_1710_ += i_1554_ / 4;
								if (i_1710_ < 0)
									i_1710_ = 0;
								else if (i_1710_ > 7)
									i_1710_ = 7;
								i_1711_ += i_1555_;
								if (i_1711_ < 0)
									i_1711_ = 0;
								else if (i_1711_ > 127)
									i_1711_ = 127;
								aShortArray9489[i_1707_] = (short) (i_1709_ << 10 | i_1710_ << 7 | i_1711_);
								if (aClass131_9484 != null)
									aClass131_9484.anInterface15_1558 = null;
							}
						}
					}
				}
				if (aClass161Array9508 != null) {
					for (int i_1712_ = 0; i_1712_ < anInt9507; i_1712_++) {
						Class161 class161 = aClass161Array9508[i_1712_];
						Class133 class133 = aClass133Array9479[i_1712_];
						class133.anInt1577 = (class133.anInt1577 & ~0xffffff | (Class710.anIntArray8839[(aShortArray9489[class161.anInt1764] & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9480 != null) {
				for (int i_1713_ = 0; i_1713_ < i_1558_; i_1713_++) {
					int i_1714_ = is[i_1713_];
					if (i_1714_ < anIntArrayArray9480.length) {
						int[] is_1715_ = anIntArrayArray9480[i_1714_];
						for (int i_1716_ = 0; i_1716_ < is_1715_.length; i_1716_++) {
							Class133 class133 = aClass133Array9479[is_1715_[i_1716_]];
							class133.anInt1575 += i_1553_;
							class133.anInt1572 += i_1554_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9480 != null) {
				for (int i_1717_ = 0; i_1717_ < i_1558_; i_1717_++) {
					int i_1718_ = is[i_1717_];
					if (i_1718_ < anIntArrayArray9480.length) {
						int[] is_1719_ = anIntArrayArray9480[i_1718_];
						for (int i_1720_ = 0; i_1720_ < is_1719_.length; i_1720_++) {
							Class133 class133 = aClass133Array9479[is_1719_[i_1720_]];
							class133.anInt1576 = class133.anInt1576 * i_1553_ >> 7;
							class133.anInt1573 = class133.anInt1573 * i_1554_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9480 != null) {
				for (int i_1721_ = 0; i_1721_ < i_1558_; i_1721_++) {
					int i_1722_ = is[i_1721_];
					if (i_1722_ < anIntArrayArray9480.length) {
						int[] is_1723_ = anIntArrayArray9480[i_1722_];
						for (int i_1724_ = 0; i_1724_ < is_1723_.length; i_1724_++) {
							Class133 class133 = aClass133Array9479[is_1723_[i_1724_]];
							class133.anInt1574 = class133.anInt1574 + i_1553_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	public void method2685(int i) {
		int i_1725_ = Class433.anIntArray4880[i];
		int i_1726_ = Class433.anIntArray4881[i];
		for (int i_1727_ = 0; i_1727_ < anInt9459; i_1727_++) {
			int i_1728_ = ((anIntArray9496[i_1727_] * i_1725_ + anIntArray9460[i_1727_] * i_1726_) >> 14);
			anIntArray9496[i_1727_] = (anIntArray9496[i_1727_] * i_1726_ - anIntArray9460[i_1727_] * i_1725_) >> 14;
			anIntArray9460[i_1727_] = i_1728_;
		}
		if (aClass131_9481 != null)
			aClass131_9481.anInterface15_1558 = null;
		aBool9465 = false;
	}

	void method14896() {
		if (aBool9490) {
			aBool9490 = false;
			if (aClass184Array9449 == null && aClass143Array9506 == null && aClass161Array9508 == null && !Class127.method2166(anInt9451, anInt9458)) {
				boolean bool = false;
				boolean bool_1729_ = false;
				boolean bool_1730_ = false;
				if (anIntArray9460 != null && !Class127.method2167(anInt9451, anInt9458)) {
					if (aClass131_9481 == null || aClass131_9481.anInterface15_1558 != null) {
						if (!aBool9465)
							method14870();
						bool = true;
					} else
						aBool9490 = true;
				}
				if (anIntArray9461 != null && !Class127.method2168(anInt9451, anInt9458)) {
					if (aClass131_9481 == null || aClass131_9481.anInterface15_1558 != null) {
						if (!aBool9465)
							method14870();
						bool_1729_ = true;
					} else
						aBool9490 = true;
				}
				if (anIntArray9496 != null && !Class127.method2213(anInt9451, anInt9458)) {
					if (aClass131_9481 == null || aClass131_9481.anInterface15_1558 != null) {
						if (!aBool9465)
							method14870();
						bool_1730_ = true;
					} else
						aBool9490 = true;
				}
				if (bool)
					anIntArray9460 = null;
				if (bool_1729_)
					anIntArray9461 = null;
				if (bool_1730_)
					anIntArray9496 = null;
			}
			if (aShortArray9504 != null && anIntArray9460 == null && anIntArray9461 == null && anIntArray9496 == null) {
				aShortArray9504 = null;
				anIntArray9503 = null;
			}
			if (aByteArray9487 != null && !Class127.method2170(anInt9451, anInt9458)) {
				if (aClass131_9485 != null) {
					if (aClass131_9485.anInterface15_1558 != null) {
						aShortArray9468 = null;
						aShortArray9467 = null;
						aShortArray9493 = null;
						aByteArray9487 = null;
					} else
						aBool9490 = true;
				} else if (aClass131_9484 == null || aClass131_9484.anInterface15_1558 != null) {
					aShortArray9468 = null;
					aShortArray9467 = null;
					aShortArray9493 = null;
					aByteArray9487 = null;
				} else
					aBool9490 = true;
			}
			if (aShortArray9489 != null && !Class127.method2171(anInt9451, anInt9458)) {
				if (aClass131_9484 == null || aClass131_9484.anInterface15_1558 != null)
					aShortArray9489 = null;
				else
					aBool9490 = true;
			}
			if (aByteArray9476 != null && !Class127.method2242(anInt9451, anInt9458)) {
				if (aClass131_9484 == null || aClass131_9484.anInterface15_1558 != null)
					aByteArray9476 = null;
				else
					aBool9490 = true;
			}
			if (aFloatArray9453 != null && !Class127.method2172(anInt9451, anInt9458)) {
				if (aClass131_9457 == null || aClass131_9457.anInterface15_1558 != null) {
					aFloatArray9472 = null;
					aFloatArray9453 = null;
				} else
					aBool9490 = true;
			}
			if (aShortArray9473 != null && !Class127.method2177(anInt9451, anInt9458)) {
				if (aClass131_9484 == null || aClass131_9484.anInterface15_1558 != null)
					aShortArray9473 = null;
				else
					aBool9490 = true;
			}
			if (aShortArray9450 != null && !Class127.method2176(anInt9451, anInt9458)) {
				if ((aClass119_9509 == null || aClass119_9509.anInterface18_1474 != null) && (aClass131_9484 == null || aClass131_9484.anInterface15_1558 != null)) {
					aShortArray9464 = null;
					aShortArray9478 = null;
					aShortArray9450 = null;
				} else
					aBool9490 = true;
			}
			if (anIntArrayArray9475 != null && !Class127.method2201(anInt9451, anInt9458)) {
				anIntArrayArray9475 = null;
				aShortArray9482 = null;
			}
			if (anIntArrayArray9463 != null && !Class127.method2174(anInt9451, anInt9458)) {
				anIntArrayArray9463 = null;
				aShortArray9466 = null;
			}
			if (anIntArrayArray9480 != null && !Class127.method2175(anInt9451, anInt9458))
				anIntArrayArray9480 = null;
			if (anIntArray9502 != null && (anInt9451 & 0x800) == 0 && (anInt9451 & 0x40000) == 0)
				anIntArray9502 = null;
		}
	}

	public Class167 method2759(byte i, int i_1731_, boolean bool) {
		boolean bool_1732_ = false;
		Class167_Sub3 class167_sub3_1733_;
		Class167_Sub3 class167_sub3_1734_;
		if (i > 0 && i <= 8) {
			class167_sub3_1734_ = aClass178_Sub1_9486.aClass167_Sub3Array9422[i - 1];
			class167_sub3_1733_ = aClass178_Sub1_9486.aClass167_Sub3Array9358[i - 1];
			bool_1732_ = true;
		} else
			class167_sub3_1733_ = class167_sub3_1734_ = new Class167_Sub3(aClass178_Sub1_9486);
		return method14880(class167_sub3_1733_, class167_sub3_1734_, i_1731_, bool_1732_, bool);
	}

	public void method2867(byte i, byte[] is) {
		if (is == null) {
			for (int i_1735_ = 0; i_1735_ < anInt9515; i_1735_++)
				aByteArray9476[i_1735_] = i;
		} else {
			for (int i_1736_ = 0; i_1736_ < anInt9515; i_1736_++) {
				int i_1737_ = 255 - ((255 - (is[i_1736_] & 0xff)) * (255 - (i & 0xff)) / 255);
				aByteArray9476[i_1736_] = (byte) i_1737_;
			}
		}
		if (aClass131_9484 != null)
			aClass131_9484.anInterface15_1558 = null;
	}

	public void method2775(int i, int i_1738_, int i_1739_) {
		for (int i_1740_ = 0; i_1740_ < anInt9459; i_1740_++) {
			if (i != 0)
				anIntArray9460[i_1740_] += i;
			if (i_1738_ != 0)
				anIntArray9461[i_1740_] += i_1738_;
			if (i_1739_ != 0)
				anIntArray9496[i_1740_] += i_1739_;
		}
		if (aClass131_9481 != null)
			aClass131_9481.anInterface15_1558 = null;
		aBool9465 = false;
	}

	void method14897() {
		int i = 32767;
		int i_1741_ = 32767;
		int i_1742_ = 32767;
		int i_1743_ = -32768;
		int i_1744_ = -32768;
		int i_1745_ = -32768;
		int i_1746_ = 0;
		int i_1747_ = 0;
		for (int i_1748_ = 0; i_1748_ < anInt9459; i_1748_++) {
			int i_1749_ = anIntArray9460[i_1748_];
			int i_1750_ = anIntArray9461[i_1748_];
			int i_1751_ = anIntArray9496[i_1748_];
			if (i_1749_ < i)
				i = i_1749_;
			if (i_1749_ > i_1743_)
				i_1743_ = i_1749_;
			if (i_1750_ < i_1741_)
				i_1741_ = i_1750_;
			if (i_1750_ > i_1744_)
				i_1744_ = i_1750_;
			if (i_1751_ < i_1742_)
				i_1742_ = i_1751_;
			if (i_1751_ > i_1745_)
				i_1745_ = i_1751_;
			int i_1752_ = i_1749_ * i_1749_ + i_1751_ * i_1751_;
			if (i_1752_ > i_1746_)
				i_1746_ = i_1752_;
			i_1752_ = i_1749_ * i_1749_ + i_1751_ * i_1751_ + i_1750_ * i_1750_;
			if (i_1752_ > i_1747_)
				i_1747_ = i_1752_;
		}
		aShort9471 = (short) i;
		aShort9497 = (short) i_1743_;
		aShort9494 = (short) i_1741_;
		aShort9505 = (short) i_1744_;
		aShort9498 = (short) i_1742_;
		aShort9491 = (short) i_1745_;
		anInt9492 = (int) (Math.sqrt((double) i_1746_) + 0.99);
		anInt9443 = (int) (Math.sqrt((double) i_1747_) + 0.99);
		aBool9465 = true;
	}

	void method14898() {
		int i = 32767;
		int i_1753_ = 32767;
		int i_1754_ = 32767;
		int i_1755_ = -32768;
		int i_1756_ = -32768;
		int i_1757_ = -32768;
		int i_1758_ = 0;
		int i_1759_ = 0;
		for (int i_1760_ = 0; i_1760_ < anInt9459; i_1760_++) {
			int i_1761_ = anIntArray9460[i_1760_];
			int i_1762_ = anIntArray9461[i_1760_];
			int i_1763_ = anIntArray9496[i_1760_];
			if (i_1761_ < i)
				i = i_1761_;
			if (i_1761_ > i_1755_)
				i_1755_ = i_1761_;
			if (i_1762_ < i_1753_)
				i_1753_ = i_1762_;
			if (i_1762_ > i_1756_)
				i_1756_ = i_1762_;
			if (i_1763_ < i_1754_)
				i_1754_ = i_1763_;
			if (i_1763_ > i_1757_)
				i_1757_ = i_1763_;
			int i_1764_ = i_1761_ * i_1761_ + i_1763_ * i_1763_;
			if (i_1764_ > i_1758_)
				i_1758_ = i_1764_;
			i_1764_ = i_1761_ * i_1761_ + i_1763_ * i_1763_ + i_1762_ * i_1762_;
			if (i_1764_ > i_1759_)
				i_1759_ = i_1764_;
		}
		aShort9471 = (short) i;
		aShort9497 = (short) i_1755_;
		aShort9494 = (short) i_1753_;
		aShort9505 = (short) i_1756_;
		aShort9498 = (short) i_1754_;
		aShort9491 = (short) i_1757_;
		anInt9492 = (int) (Math.sqrt((double) i_1758_) + 0.99);
		anInt9443 = (int) (Math.sqrt((double) i_1759_) + 0.99);
		aBool9465 = true;
	}

	void method14899() {
		int i = 32767;
		int i_1765_ = 32767;
		int i_1766_ = 32767;
		int i_1767_ = -32768;
		int i_1768_ = -32768;
		int i_1769_ = -32768;
		int i_1770_ = 0;
		int i_1771_ = 0;
		for (int i_1772_ = 0; i_1772_ < anInt9459; i_1772_++) {
			int i_1773_ = anIntArray9460[i_1772_];
			int i_1774_ = anIntArray9461[i_1772_];
			int i_1775_ = anIntArray9496[i_1772_];
			if (i_1773_ < i)
				i = i_1773_;
			if (i_1773_ > i_1767_)
				i_1767_ = i_1773_;
			if (i_1774_ < i_1765_)
				i_1765_ = i_1774_;
			if (i_1774_ > i_1768_)
				i_1768_ = i_1774_;
			if (i_1775_ < i_1766_)
				i_1766_ = i_1775_;
			if (i_1775_ > i_1769_)
				i_1769_ = i_1775_;
			int i_1776_ = i_1773_ * i_1773_ + i_1775_ * i_1775_;
			if (i_1776_ > i_1770_)
				i_1770_ = i_1776_;
			i_1776_ = i_1773_ * i_1773_ + i_1775_ * i_1775_ + i_1774_ * i_1774_;
			if (i_1776_ > i_1771_)
				i_1771_ = i_1776_;
		}
		aShort9471 = (short) i;
		aShort9497 = (short) i_1767_;
		aShort9494 = (short) i_1765_;
		aShort9505 = (short) i_1768_;
		aShort9498 = (short) i_1766_;
		aShort9491 = (short) i_1769_;
		anInt9492 = (int) (Math.sqrt((double) i_1770_) + 0.99);
		anInt9443 = (int) (Math.sqrt((double) i_1771_) + 0.99);
		aBool9465 = true;
	}

	void method2778(int i, int[] is, int i_1777_, int i_1778_, int i_1779_, boolean bool, int i_1780_, int[] is_1781_) {
		int i_1782_ = is.length;
		if (i == 0) {
			i_1777_ <<= 4;
			i_1778_ <<= 4;
			i_1779_ <<= 4;
			int i_1783_ = 0;
			anInt9516 = 0;
			anInt9517 = 0;
			anInt9518 = 0;
			for (int i_1784_ = 0; i_1784_ < i_1782_; i_1784_++) {
				int i_1785_ = is[i_1784_];
				if (i_1785_ < anIntArrayArray9463.length) {
					int[] is_1786_ = anIntArrayArray9463[i_1785_];
					for (int i_1787_ = 0; i_1787_ < is_1786_.length; i_1787_++) {
						int i_1788_ = is_1786_[i_1787_];
						if (aShortArray9466 == null || (i_1780_ & aShortArray9466[i_1788_]) != 0) {
							anInt9516 += anIntArray9460[i_1788_];
							anInt9517 += anIntArray9461[i_1788_];
							anInt9518 += anIntArray9496[i_1788_];
							i_1783_++;
						}
					}
				}
			}
			if (i_1783_ > 0) {
				anInt9516 = anInt9516 / i_1783_ + i_1777_;
				anInt9517 = anInt9517 / i_1783_ + i_1778_;
				anInt9518 = anInt9518 / i_1783_ + i_1779_;
				aBool9519 = true;
			} else {
				anInt9516 = i_1777_;
				anInt9517 = i_1778_;
				anInt9518 = i_1779_;
			}
		} else if (i == 1) {
			if (is_1781_ != null) {
				int i_1789_ = ((is_1781_[0] * i_1777_ + is_1781_[1] * i_1778_ + is_1781_[2] * i_1779_ + 8192) >> 14);
				int i_1790_ = ((is_1781_[3] * i_1777_ + is_1781_[4] * i_1778_ + is_1781_[5] * i_1779_ + 8192) >> 14);
				int i_1791_ = ((is_1781_[6] * i_1777_ + is_1781_[7] * i_1778_ + is_1781_[8] * i_1779_ + 8192) >> 14);
				i_1777_ = i_1789_;
				i_1778_ = i_1790_;
				i_1779_ = i_1791_;
			}
			i_1777_ <<= 4;
			i_1778_ <<= 4;
			i_1779_ <<= 4;
			for (int i_1792_ = 0; i_1792_ < i_1782_; i_1792_++) {
				int i_1793_ = is[i_1792_];
				if (i_1793_ < anIntArrayArray9463.length) {
					int[] is_1794_ = anIntArrayArray9463[i_1793_];
					for (int i_1795_ = 0; i_1795_ < is_1794_.length; i_1795_++) {
						int i_1796_ = is_1794_[i_1795_];
						if (aShortArray9466 == null || (i_1780_ & aShortArray9466[i_1796_]) != 0) {
							anIntArray9460[i_1796_] += i_1777_;
							anIntArray9461[i_1796_] += i_1778_;
							anIntArray9496[i_1796_] += i_1779_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1781_ != null) {
				int i_1797_ = is_1781_[9] << 4;
				int i_1798_ = is_1781_[10] << 4;
				int i_1799_ = is_1781_[11] << 4;
				int i_1800_ = is_1781_[12] << 4;
				int i_1801_ = is_1781_[13] << 4;
				int i_1802_ = is_1781_[14] << 4;
				if (aBool9519) {
					int i_1803_ = ((is_1781_[0] * anInt9516 + is_1781_[3] * anInt9517 + is_1781_[6] * anInt9518 + 8192) >> 14);
					int i_1804_ = ((is_1781_[1] * anInt9516 + is_1781_[4] * anInt9517 + is_1781_[7] * anInt9518 + 8192) >> 14);
					int i_1805_ = ((is_1781_[2] * anInt9516 + is_1781_[5] * anInt9517 + is_1781_[8] * anInt9518 + 8192) >> 14);
					i_1803_ += i_1800_;
					i_1804_ += i_1801_;
					i_1805_ += i_1802_;
					anInt9516 = i_1803_;
					anInt9517 = i_1804_;
					anInt9518 = i_1805_;
					aBool9519 = false;
				}
				int[] is_1806_ = new int[9];
				int i_1807_ = Class433.anIntArray4881[i_1777_];
				int i_1808_ = Class433.anIntArray4880[i_1777_];
				int i_1809_ = Class433.anIntArray4881[i_1778_];
				int i_1810_ = Class433.anIntArray4880[i_1778_];
				int i_1811_ = Class433.anIntArray4881[i_1779_];
				int i_1812_ = Class433.anIntArray4880[i_1779_];
				int i_1813_ = i_1808_ * i_1811_ + 8192 >> 14;
				int i_1814_ = i_1808_ * i_1812_ + 8192 >> 14;
				is_1806_[0] = i_1809_ * i_1811_ + i_1810_ * i_1814_ + 8192 >> 14;
				is_1806_[1] = -i_1809_ * i_1812_ + i_1810_ * i_1813_ + 8192 >> 14;
				is_1806_[2] = i_1810_ * i_1807_ + 8192 >> 14;
				is_1806_[3] = i_1807_ * i_1812_ + 8192 >> 14;
				is_1806_[4] = i_1807_ * i_1811_ + 8192 >> 14;
				is_1806_[5] = -i_1808_;
				is_1806_[6] = -i_1810_ * i_1811_ + i_1809_ * i_1814_ + 8192 >> 14;
				is_1806_[7] = i_1810_ * i_1812_ + i_1809_ * i_1813_ + 8192 >> 14;
				is_1806_[8] = i_1809_ * i_1807_ + 8192 >> 14;
				int i_1815_ = ((is_1806_[0] * -anInt9516 + is_1806_[1] * -anInt9517 + is_1806_[2] * -anInt9518 + 8192) >> 14);
				int i_1816_ = ((is_1806_[3] * -anInt9516 + is_1806_[4] * -anInt9517 + is_1806_[5] * -anInt9518 + 8192) >> 14);
				int i_1817_ = ((is_1806_[6] * -anInt9516 + is_1806_[7] * -anInt9517 + is_1806_[8] * -anInt9518 + 8192) >> 14);
				int i_1818_ = i_1815_ + anInt9516;
				int i_1819_ = i_1816_ + anInt9517;
				int i_1820_ = i_1817_ + anInt9518;
				int[] is_1821_ = new int[9];
				for (int i_1822_ = 0; i_1822_ < 3; i_1822_++) {
					for (int i_1823_ = 0; i_1823_ < 3; i_1823_++) {
						int i_1824_ = 0;
						for (int i_1825_ = 0; i_1825_ < 3; i_1825_++)
							i_1824_ += (is_1806_[i_1822_ * 3 + i_1825_] * is_1781_[i_1823_ * 3 + i_1825_]);
						is_1821_[i_1822_ * 3 + i_1823_] = i_1824_ + 8192 >> 14;
					}
				}
				int i_1826_ = ((is_1806_[0] * i_1800_ + is_1806_[1] * i_1801_ + is_1806_[2] * i_1802_ + 8192) >> 14);
				int i_1827_ = ((is_1806_[3] * i_1800_ + is_1806_[4] * i_1801_ + is_1806_[5] * i_1802_ + 8192) >> 14);
				int i_1828_ = ((is_1806_[6] * i_1800_ + is_1806_[7] * i_1801_ + is_1806_[8] * i_1802_ + 8192) >> 14);
				i_1826_ += i_1818_;
				i_1827_ += i_1819_;
				i_1828_ += i_1820_;
				int[] is_1829_ = new int[9];
				for (int i_1830_ = 0; i_1830_ < 3; i_1830_++) {
					for (int i_1831_ = 0; i_1831_ < 3; i_1831_++) {
						int i_1832_ = 0;
						for (int i_1833_ = 0; i_1833_ < 3; i_1833_++)
							i_1832_ += (is_1781_[i_1830_ * 3 + i_1833_] * is_1821_[i_1831_ + i_1833_ * 3]);
						is_1829_[i_1830_ * 3 + i_1831_] = i_1832_ + 8192 >> 14;
					}
				}
				int i_1834_ = ((is_1781_[0] * i_1826_ + is_1781_[1] * i_1827_ + is_1781_[2] * i_1828_ + 8192) >> 14);
				int i_1835_ = ((is_1781_[3] * i_1826_ + is_1781_[4] * i_1827_ + is_1781_[5] * i_1828_ + 8192) >> 14);
				int i_1836_ = ((is_1781_[6] * i_1826_ + is_1781_[7] * i_1827_ + is_1781_[8] * i_1828_ + 8192) >> 14);
				i_1834_ += i_1797_;
				i_1835_ += i_1798_;
				i_1836_ += i_1799_;
				for (int i_1837_ = 0; i_1837_ < i_1782_; i_1837_++) {
					int i_1838_ = is[i_1837_];
					if (i_1838_ < anIntArrayArray9463.length) {
						int[] is_1839_ = anIntArrayArray9463[i_1838_];
						for (int i_1840_ = 0; i_1840_ < is_1839_.length; i_1840_++) {
							int i_1841_ = is_1839_[i_1840_];
							if (aShortArray9466 == null || (i_1780_ & aShortArray9466[i_1841_]) != 0) {
								int i_1842_ = ((is_1829_[0] * anIntArray9460[i_1841_] + is_1829_[1] * anIntArray9461[i_1841_] + is_1829_[2] * anIntArray9496[i_1841_] + 8192) >> 14);
								int i_1843_ = ((is_1829_[3] * anIntArray9460[i_1841_] + is_1829_[4] * anIntArray9461[i_1841_] + is_1829_[5] * anIntArray9496[i_1841_] + 8192) >> 14);
								int i_1844_ = ((is_1829_[6] * anIntArray9460[i_1841_] + is_1829_[7] * anIntArray9461[i_1841_] + is_1829_[8] * anIntArray9496[i_1841_] + 8192) >> 14);
								i_1842_ += i_1834_;
								i_1843_ += i_1835_;
								i_1844_ += i_1836_;
								anIntArray9460[i_1841_] = i_1842_;
								anIntArray9461[i_1841_] = i_1843_;
								anIntArray9496[i_1841_] = i_1844_;
							}
						}
					}
				}
			} else {
				for (int i_1845_ = 0; i_1845_ < i_1782_; i_1845_++) {
					int i_1846_ = is[i_1845_];
					if (i_1846_ < anIntArrayArray9463.length) {
						int[] is_1847_ = anIntArrayArray9463[i_1846_];
						for (int i_1848_ = 0; i_1848_ < is_1847_.length; i_1848_++) {
							int i_1849_ = is_1847_[i_1848_];
							if (aShortArray9466 == null || (i_1780_ & aShortArray9466[i_1849_]) != 0) {
								anIntArray9460[i_1849_] -= anInt9516;
								anIntArray9461[i_1849_] -= anInt9517;
								anIntArray9496[i_1849_] -= anInt9518;
								if (i_1779_ != 0) {
									int i_1850_ = Class433.anIntArray4880[i_1779_];
									int i_1851_ = Class433.anIntArray4881[i_1779_];
									int i_1852_ = ((anIntArray9461[i_1849_] * i_1850_ + anIntArray9460[i_1849_] * i_1851_ + 16383) >> 14);
									anIntArray9461[i_1849_] = (anIntArray9461[i_1849_] * i_1851_ - anIntArray9460[i_1849_] * i_1850_ + 16383) >> 14;
									anIntArray9460[i_1849_] = i_1852_;
								}
								if (i_1777_ != 0) {
									int i_1853_ = Class433.anIntArray4880[i_1777_];
									int i_1854_ = Class433.anIntArray4881[i_1777_];
									int i_1855_ = ((anIntArray9461[i_1849_] * i_1854_ - anIntArray9496[i_1849_] * i_1853_ + 16383) >> 14);
									anIntArray9496[i_1849_] = (anIntArray9461[i_1849_] * i_1853_ + anIntArray9496[i_1849_] * i_1854_ + 16383) >> 14;
									anIntArray9461[i_1849_] = i_1855_;
								}
								if (i_1778_ != 0) {
									int i_1856_ = Class433.anIntArray4880[i_1778_];
									int i_1857_ = Class433.anIntArray4881[i_1778_];
									int i_1858_ = ((anIntArray9496[i_1849_] * i_1856_ + anIntArray9460[i_1849_] * i_1857_ + 16383) >> 14);
									anIntArray9496[i_1849_] = (anIntArray9496[i_1849_] * i_1857_ - anIntArray9460[i_1849_] * i_1856_ + 16383) >> 14;
									anIntArray9460[i_1849_] = i_1858_;
								}
								anIntArray9460[i_1849_] += anInt9516;
								anIntArray9461[i_1849_] += anInt9517;
								anIntArray9496[i_1849_] += anInt9518;
							}
						}
					}
				}
				if (bool) {
					for (int i_1859_ = 0; i_1859_ < i_1782_; i_1859_++) {
						int i_1860_ = is[i_1859_];
						if (i_1860_ < anIntArrayArray9463.length) {
							int[] is_1861_ = anIntArrayArray9463[i_1860_];
							for (int i_1862_ = 0; i_1862_ < is_1861_.length; i_1862_++) {
								int i_1863_ = is_1861_[i_1862_];
								if (aShortArray9466 == null || ((i_1780_ & aShortArray9466[i_1863_]) != 0)) {
									int i_1864_ = anIntArray9503[i_1863_];
									int i_1865_ = anIntArray9503[i_1863_ + 1];
									for (int i_1866_ = i_1864_; (i_1866_ < i_1865_ && aShortArray9504[i_1866_] != 0); i_1866_++) {
										int i_1867_ = (aShortArray9504[i_1866_] & 0xffff) - 1;
										if (i_1779_ != 0) {
											int i_1868_ = (Class433.anIntArray4880[i_1779_]);
											int i_1869_ = (Class433.anIntArray4881[i_1779_]);
											int i_1870_ = (((aShortArray9467[i_1867_] * i_1868_) + (aShortArray9493[i_1867_] * i_1869_) + 16383) >> 14);
											aShortArray9467[i_1867_] = (short) ((((aShortArray9467[i_1867_]) * i_1869_) - ((aShortArray9493[i_1867_]) * i_1868_) + 16383) >> 14);
											aShortArray9493[i_1867_] = (short) i_1870_;
										}
										if (i_1777_ != 0) {
											int i_1871_ = (Class433.anIntArray4880[i_1777_]);
											int i_1872_ = (Class433.anIntArray4881[i_1777_]);
											int i_1873_ = (((aShortArray9467[i_1867_] * i_1872_) - (aShortArray9468[i_1867_] * i_1871_) + 16383) >> 14);
											aShortArray9468[i_1867_] = (short) ((((aShortArray9467[i_1867_]) * i_1871_) + ((aShortArray9468[i_1867_]) * i_1872_) + 16383) >> 14);
											aShortArray9467[i_1867_] = (short) i_1873_;
										}
										if (i_1778_ != 0) {
											int i_1874_ = (Class433.anIntArray4880[i_1778_]);
											int i_1875_ = (Class433.anIntArray4881[i_1778_]);
											int i_1876_ = (((aShortArray9468[i_1867_] * i_1874_) + (aShortArray9493[i_1867_] * i_1875_) + 16383) >> 14);
											aShortArray9468[i_1867_] = (short) ((((aShortArray9468[i_1867_]) * i_1875_) - ((aShortArray9493[i_1867_]) * i_1874_) + 16383) >> 14);
											aShortArray9493[i_1867_] = (short) i_1876_;
										}
									}
								}
							}
						}
					}
					if (aClass131_9485 == null && aClass131_9484 != null)
						aClass131_9484.anInterface15_1558 = null;
					if (aClass131_9485 != null)
						aClass131_9485.anInterface15_1558 = null;
				}
			}
		} else if (i == 3) {
			if (is_1781_ != null) {
				int i_1877_ = is_1781_[9] << 4;
				int i_1878_ = is_1781_[10] << 4;
				int i_1879_ = is_1781_[11] << 4;
				int i_1880_ = is_1781_[12] << 4;
				int i_1881_ = is_1781_[13] << 4;
				int i_1882_ = is_1781_[14] << 4;
				if (aBool9519) {
					int i_1883_ = ((is_1781_[0] * anInt9516 + is_1781_[3] * anInt9517 + is_1781_[6] * anInt9518 + 8192) >> 14);
					int i_1884_ = ((is_1781_[1] * anInt9516 + is_1781_[4] * anInt9517 + is_1781_[7] * anInt9518 + 8192) >> 14);
					int i_1885_ = ((is_1781_[2] * anInt9516 + is_1781_[5] * anInt9517 + is_1781_[8] * anInt9518 + 8192) >> 14);
					i_1883_ += i_1880_;
					i_1884_ += i_1881_;
					i_1885_ += i_1882_;
					anInt9516 = i_1883_;
					anInt9517 = i_1884_;
					anInt9518 = i_1885_;
					aBool9519 = false;
				}
				int i_1886_ = i_1777_ << 15 >> 7;
				int i_1887_ = i_1778_ << 15 >> 7;
				int i_1888_ = i_1779_ << 15 >> 7;
				int i_1889_ = i_1886_ * -anInt9516 + 8192 >> 14;
				int i_1890_ = i_1887_ * -anInt9517 + 8192 >> 14;
				int i_1891_ = i_1888_ * -anInt9518 + 8192 >> 14;
				int i_1892_ = i_1889_ + anInt9516;
				int i_1893_ = i_1890_ + anInt9517;
				int i_1894_ = i_1891_ + anInt9518;
				int[] is_1895_ = new int[9];
				is_1895_[0] = i_1886_ * is_1781_[0] + 8192 >> 14;
				is_1895_[1] = i_1886_ * is_1781_[3] + 8192 >> 14;
				is_1895_[2] = i_1886_ * is_1781_[6] + 8192 >> 14;
				is_1895_[3] = i_1887_ * is_1781_[1] + 8192 >> 14;
				is_1895_[4] = i_1887_ * is_1781_[4] + 8192 >> 14;
				is_1895_[5] = i_1887_ * is_1781_[7] + 8192 >> 14;
				is_1895_[6] = i_1888_ * is_1781_[2] + 8192 >> 14;
				is_1895_[7] = i_1888_ * is_1781_[5] + 8192 >> 14;
				is_1895_[8] = i_1888_ * is_1781_[8] + 8192 >> 14;
				int i_1896_ = i_1886_ * i_1880_ + 8192 >> 14;
				int i_1897_ = i_1887_ * i_1881_ + 8192 >> 14;
				int i_1898_ = i_1888_ * i_1882_ + 8192 >> 14;
				i_1896_ += i_1892_;
				i_1897_ += i_1893_;
				i_1898_ += i_1894_;
				int[] is_1899_ = new int[9];
				for (int i_1900_ = 0; i_1900_ < 3; i_1900_++) {
					for (int i_1901_ = 0; i_1901_ < 3; i_1901_++) {
						int i_1902_ = 0;
						for (int i_1903_ = 0; i_1903_ < 3; i_1903_++)
							i_1902_ += (is_1781_[i_1900_ * 3 + i_1903_] * is_1895_[i_1901_ + i_1903_ * 3]);
						is_1899_[i_1900_ * 3 + i_1901_] = i_1902_ + 8192 >> 14;
					}
				}
				int i_1904_ = ((is_1781_[0] * i_1896_ + is_1781_[1] * i_1897_ + is_1781_[2] * i_1898_ + 8192) >> 14);
				int i_1905_ = ((is_1781_[3] * i_1896_ + is_1781_[4] * i_1897_ + is_1781_[5] * i_1898_ + 8192) >> 14);
				int i_1906_ = ((is_1781_[6] * i_1896_ + is_1781_[7] * i_1897_ + is_1781_[8] * i_1898_ + 8192) >> 14);
				i_1904_ += i_1877_;
				i_1905_ += i_1878_;
				i_1906_ += i_1879_;
				for (int i_1907_ = 0; i_1907_ < i_1782_; i_1907_++) {
					int i_1908_ = is[i_1907_];
					if (i_1908_ < anIntArrayArray9463.length) {
						int[] is_1909_ = anIntArrayArray9463[i_1908_];
						for (int i_1910_ = 0; i_1910_ < is_1909_.length; i_1910_++) {
							int i_1911_ = is_1909_[i_1910_];
							if (aShortArray9466 == null || (i_1780_ & aShortArray9466[i_1911_]) != 0) {
								int i_1912_ = ((is_1899_[0] * anIntArray9460[i_1911_] + is_1899_[1] * anIntArray9461[i_1911_] + is_1899_[2] * anIntArray9496[i_1911_] + 8192) >> 14);
								int i_1913_ = ((is_1899_[3] * anIntArray9460[i_1911_] + is_1899_[4] * anIntArray9461[i_1911_] + is_1899_[5] * anIntArray9496[i_1911_] + 8192) >> 14);
								int i_1914_ = ((is_1899_[6] * anIntArray9460[i_1911_] + is_1899_[7] * anIntArray9461[i_1911_] + is_1899_[8] * anIntArray9496[i_1911_] + 8192) >> 14);
								i_1912_ += i_1904_;
								i_1913_ += i_1905_;
								i_1914_ += i_1906_;
								anIntArray9460[i_1911_] = i_1912_;
								anIntArray9461[i_1911_] = i_1913_;
								anIntArray9496[i_1911_] = i_1914_;
							}
						}
					}
				}
			} else {
				for (int i_1915_ = 0; i_1915_ < i_1782_; i_1915_++) {
					int i_1916_ = is[i_1915_];
					if (i_1916_ < anIntArrayArray9463.length) {
						int[] is_1917_ = anIntArrayArray9463[i_1916_];
						for (int i_1918_ = 0; i_1918_ < is_1917_.length; i_1918_++) {
							int i_1919_ = is_1917_[i_1918_];
							if (aShortArray9466 == null || (i_1780_ & aShortArray9466[i_1919_]) != 0) {
								anIntArray9460[i_1919_] -= anInt9516;
								anIntArray9461[i_1919_] -= anInt9517;
								anIntArray9496[i_1919_] -= anInt9518;
								anIntArray9460[i_1919_] = anIntArray9460[i_1919_] * i_1777_ >> 7;
								anIntArray9461[i_1919_] = anIntArray9461[i_1919_] * i_1778_ >> 7;
								anIntArray9496[i_1919_] = anIntArray9496[i_1919_] * i_1779_ >> 7;
								anIntArray9460[i_1919_] += anInt9516;
								anIntArray9461[i_1919_] += anInt9517;
								anIntArray9496[i_1919_] += anInt9518;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9475 != null) {
				for (int i_1920_ = 0; i_1920_ < i_1782_; i_1920_++) {
					int i_1921_ = is[i_1920_];
					if (i_1921_ < anIntArrayArray9475.length) {
						int[] is_1922_ = anIntArrayArray9475[i_1921_];
						for (int i_1923_ = 0; i_1923_ < is_1922_.length; i_1923_++) {
							int i_1924_ = is_1922_[i_1923_];
							if (aShortArray9482 == null || (i_1780_ & aShortArray9482[i_1924_]) != 0) {
								int i_1925_ = ((aByteArray9476[i_1924_] & 0xff) + i_1777_ * 8);
								if (i_1925_ < 0)
									i_1925_ = 0;
								else if (i_1925_ > 255)
									i_1925_ = 255;
								aByteArray9476[i_1924_] = (byte) i_1925_;
								if (aClass131_9484 != null)
									aClass131_9484.anInterface15_1558 = null;
							}
						}
					}
				}
				if (aClass161Array9508 != null) {
					for (int i_1926_ = 0; i_1926_ < anInt9507; i_1926_++) {
						Class161 class161 = aClass161Array9508[i_1926_];
						Class133 class133 = aClass133Array9479[i_1926_];
						class133.anInt1577 = (class133.anInt1577 & 0xffffff | 255 - (aByteArray9476[class161.anInt1764] & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9475 != null) {
				for (int i_1927_ = 0; i_1927_ < i_1782_; i_1927_++) {
					int i_1928_ = is[i_1927_];
					if (i_1928_ < anIntArrayArray9475.length) {
						int[] is_1929_ = anIntArrayArray9475[i_1928_];
						for (int i_1930_ = 0; i_1930_ < is_1929_.length; i_1930_++) {
							int i_1931_ = is_1929_[i_1930_];
							if (aShortArray9482 == null || (i_1780_ & aShortArray9482[i_1931_]) != 0) {
								int i_1932_ = aShortArray9489[i_1931_] & 0xffff;
								int i_1933_ = i_1932_ >> 10 & 0x3f;
								int i_1934_ = i_1932_ >> 7 & 0x7;
								int i_1935_ = i_1932_ & 0x7f;
								i_1933_ = i_1933_ + i_1777_ & 0x3f;
								i_1934_ += i_1778_ / 4;
								if (i_1934_ < 0)
									i_1934_ = 0;
								else if (i_1934_ > 7)
									i_1934_ = 7;
								i_1935_ += i_1779_;
								if (i_1935_ < 0)
									i_1935_ = 0;
								else if (i_1935_ > 127)
									i_1935_ = 127;
								aShortArray9489[i_1931_] = (short) (i_1933_ << 10 | i_1934_ << 7 | i_1935_);
								if (aClass131_9484 != null)
									aClass131_9484.anInterface15_1558 = null;
							}
						}
					}
				}
				if (aClass161Array9508 != null) {
					for (int i_1936_ = 0; i_1936_ < anInt9507; i_1936_++) {
						Class161 class161 = aClass161Array9508[i_1936_];
						Class133 class133 = aClass133Array9479[i_1936_];
						class133.anInt1577 = (class133.anInt1577 & ~0xffffff | (Class710.anIntArray8839[(aShortArray9489[class161.anInt1764] & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9480 != null) {
				for (int i_1937_ = 0; i_1937_ < i_1782_; i_1937_++) {
					int i_1938_ = is[i_1937_];
					if (i_1938_ < anIntArrayArray9480.length) {
						int[] is_1939_ = anIntArrayArray9480[i_1938_];
						for (int i_1940_ = 0; i_1940_ < is_1939_.length; i_1940_++) {
							Class133 class133 = aClass133Array9479[is_1939_[i_1940_]];
							class133.anInt1575 += i_1777_;
							class133.anInt1572 += i_1778_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9480 != null) {
				for (int i_1941_ = 0; i_1941_ < i_1782_; i_1941_++) {
					int i_1942_ = is[i_1941_];
					if (i_1942_ < anIntArrayArray9480.length) {
						int[] is_1943_ = anIntArrayArray9480[i_1942_];
						for (int i_1944_ = 0; i_1944_ < is_1943_.length; i_1944_++) {
							Class133 class133 = aClass133Array9479[is_1943_[i_1944_]];
							class133.anInt1576 = class133.anInt1576 * i_1777_ >> 7;
							class133.anInt1573 = class133.anInt1573 * i_1778_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9480 != null) {
				for (int i_1945_ = 0; i_1945_ < i_1782_; i_1945_++) {
					int i_1946_ = is[i_1945_];
					if (i_1946_ < anIntArrayArray9480.length) {
						int[] is_1947_ = anIntArrayArray9480[i_1946_];
						for (int i_1948_ = 0; i_1948_ < is_1947_.length; i_1948_++) {
							Class133 class133 = aClass133Array9479[is_1947_[i_1948_]];
							class133.anInt1574 = class133.anInt1574 + i_1777_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	public int method2814() {
		if (!aBool9465)
			method14870();
		return aShort9494;
	}

	void method2695(int i, int[] is, int i_1949_, int i_1950_, int i_1951_, int i_1952_, boolean bool) {
		int i_1953_ = is.length;
		if (i == 0) {
			i_1949_ <<= 4;
			i_1950_ <<= 4;
			i_1951_ <<= 4;
			int i_1954_ = 0;
			anInt9516 = 0;
			anInt9517 = 0;
			anInt9518 = 0;
			for (int i_1955_ = 0; i_1955_ < i_1953_; i_1955_++) {
				int i_1956_ = is[i_1955_];
				if (i_1956_ < anIntArrayArray9463.length) {
					int[] is_1957_ = anIntArrayArray9463[i_1956_];
					for (int i_1958_ = 0; i_1958_ < is_1957_.length; i_1958_++) {
						int i_1959_ = is_1957_[i_1958_];
						anInt9516 += anIntArray9460[i_1959_];
						anInt9517 += anIntArray9461[i_1959_];
						anInt9518 += anIntArray9496[i_1959_];
						i_1954_++;
					}
				}
			}
			if (i_1954_ > 0) {
				anInt9516 = anInt9516 / i_1954_ + i_1949_;
				anInt9517 = anInt9517 / i_1954_ + i_1950_;
				anInt9518 = anInt9518 / i_1954_ + i_1951_;
			} else {
				anInt9516 = i_1949_;
				anInt9517 = i_1950_;
				anInt9518 = i_1951_;
			}
		} else if (i == 1) {
			i_1949_ <<= 4;
			i_1950_ <<= 4;
			i_1951_ <<= 4;
			for (int i_1960_ = 0; i_1960_ < i_1953_; i_1960_++) {
				int i_1961_ = is[i_1960_];
				if (i_1961_ < anIntArrayArray9463.length) {
					int[] is_1962_ = anIntArrayArray9463[i_1961_];
					for (int i_1963_ = 0; i_1963_ < is_1962_.length; i_1963_++) {
						int i_1964_ = is_1962_[i_1963_];
						anIntArray9460[i_1964_] += i_1949_;
						anIntArray9461[i_1964_] += i_1950_;
						anIntArray9496[i_1964_] += i_1951_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_1965_ = 0; i_1965_ < i_1953_; i_1965_++) {
				int i_1966_ = is[i_1965_];
				if (i_1966_ < anIntArrayArray9463.length) {
					int[] is_1967_ = anIntArrayArray9463[i_1966_];
					if ((i_1952_ & 0x1) == 0) {
						for (int i_1968_ = 0; i_1968_ < is_1967_.length; i_1968_++) {
							int i_1969_ = is_1967_[i_1968_];
							anIntArray9460[i_1969_] -= anInt9516;
							anIntArray9461[i_1969_] -= anInt9517;
							anIntArray9496[i_1969_] -= anInt9518;
							if (i_1951_ != 0) {
								int i_1970_ = Class433.anIntArray4880[i_1951_];
								int i_1971_ = Class433.anIntArray4881[i_1951_];
								int i_1972_ = ((anIntArray9461[i_1969_] * i_1970_ + anIntArray9460[i_1969_] * i_1971_ + 16383) >> 14);
								anIntArray9461[i_1969_] = (anIntArray9461[i_1969_] * i_1971_ - anIntArray9460[i_1969_] * i_1970_ + 16383) >> 14;
								anIntArray9460[i_1969_] = i_1972_;
							}
							if (i_1949_ != 0) {
								int i_1973_ = Class433.anIntArray4880[i_1949_];
								int i_1974_ = Class433.anIntArray4881[i_1949_];
								int i_1975_ = ((anIntArray9461[i_1969_] * i_1974_ - anIntArray9496[i_1969_] * i_1973_ + 16383) >> 14);
								anIntArray9496[i_1969_] = (anIntArray9461[i_1969_] * i_1973_ + anIntArray9496[i_1969_] * i_1974_ + 16383) >> 14;
								anIntArray9461[i_1969_] = i_1975_;
							}
							if (i_1950_ != 0) {
								int i_1976_ = Class433.anIntArray4880[i_1950_];
								int i_1977_ = Class433.anIntArray4881[i_1950_];
								int i_1978_ = ((anIntArray9496[i_1969_] * i_1976_ + anIntArray9460[i_1969_] * i_1977_ + 16383) >> 14);
								anIntArray9496[i_1969_] = (anIntArray9496[i_1969_] * i_1977_ - anIntArray9460[i_1969_] * i_1976_ + 16383) >> 14;
								anIntArray9460[i_1969_] = i_1978_;
							}
							anIntArray9460[i_1969_] += anInt9516;
							anIntArray9461[i_1969_] += anInt9517;
							anIntArray9496[i_1969_] += anInt9518;
						}
					} else {
						for (int i_1979_ = 0; i_1979_ < is_1967_.length; i_1979_++) {
							int i_1980_ = is_1967_[i_1979_];
							anIntArray9460[i_1980_] -= anInt9516;
							anIntArray9461[i_1980_] -= anInt9517;
							anIntArray9496[i_1980_] -= anInt9518;
							if (i_1949_ != 0) {
								int i_1981_ = Class433.anIntArray4880[i_1949_];
								int i_1982_ = Class433.anIntArray4881[i_1949_];
								int i_1983_ = ((anIntArray9461[i_1980_] * i_1982_ - anIntArray9496[i_1980_] * i_1981_ + 16383) >> 14);
								anIntArray9496[i_1980_] = (anIntArray9461[i_1980_] * i_1981_ + anIntArray9496[i_1980_] * i_1982_ + 16383) >> 14;
								anIntArray9461[i_1980_] = i_1983_;
							}
							if (i_1951_ != 0) {
								int i_1984_ = Class433.anIntArray4880[i_1951_];
								int i_1985_ = Class433.anIntArray4881[i_1951_];
								int i_1986_ = ((anIntArray9461[i_1980_] * i_1984_ + anIntArray9460[i_1980_] * i_1985_ + 16383) >> 14);
								anIntArray9461[i_1980_] = (anIntArray9461[i_1980_] * i_1985_ - anIntArray9460[i_1980_] * i_1984_ + 16383) >> 14;
								anIntArray9460[i_1980_] = i_1986_;
							}
							if (i_1950_ != 0) {
								int i_1987_ = Class433.anIntArray4880[i_1950_];
								int i_1988_ = Class433.anIntArray4881[i_1950_];
								int i_1989_ = ((anIntArray9496[i_1980_] * i_1987_ + anIntArray9460[i_1980_] * i_1988_ + 16383) >> 14);
								anIntArray9496[i_1980_] = (anIntArray9496[i_1980_] * i_1988_ - anIntArray9460[i_1980_] * i_1987_ + 16383) >> 14;
								anIntArray9460[i_1980_] = i_1989_;
							}
							anIntArray9460[i_1980_] += anInt9516;
							anIntArray9461[i_1980_] += anInt9517;
							anIntArray9496[i_1980_] += anInt9518;
						}
					}
				}
			}
			if (bool) {
				for (int i_1990_ = 0; i_1990_ < i_1953_; i_1990_++) {
					int i_1991_ = is[i_1990_];
					if (i_1991_ < anIntArrayArray9463.length) {
						int[] is_1992_ = anIntArrayArray9463[i_1991_];
						for (int i_1993_ = 0; i_1993_ < is_1992_.length; i_1993_++) {
							int i_1994_ = is_1992_[i_1993_];
							int i_1995_ = anIntArray9503[i_1994_];
							int i_1996_ = anIntArray9503[i_1994_ + 1];
							for (int i_1997_ = i_1995_; (i_1997_ < i_1996_ && aShortArray9504[i_1997_] != 0); i_1997_++) {
								int i_1998_ = (aShortArray9504[i_1997_] & 0xffff) - 1;
								if (i_1951_ != 0) {
									int i_1999_ = Class433.anIntArray4880[i_1951_];
									int i_2000_ = Class433.anIntArray4881[i_1951_];
									int i_2001_ = (aShortArray9467[i_1998_] * i_1999_ + aShortArray9493[i_1998_] * i_2000_ + 16383) >> 14;
									aShortArray9467[i_1998_] = (short) (((aShortArray9467[i_1998_] * i_2000_) - (aShortArray9493[i_1998_] * i_1999_) + 16383) >> 14);
									aShortArray9493[i_1998_] = (short) i_2001_;
								}
								if (i_1949_ != 0) {
									int i_2002_ = Class433.anIntArray4880[i_1949_];
									int i_2003_ = Class433.anIntArray4881[i_1949_];
									int i_2004_ = (aShortArray9467[i_1998_] * i_2003_ - aShortArray9468[i_1998_] * i_2002_ + 16383) >> 14;
									aShortArray9468[i_1998_] = (short) (((aShortArray9467[i_1998_] * i_2002_) + (aShortArray9468[i_1998_] * i_2003_) + 16383) >> 14);
									aShortArray9467[i_1998_] = (short) i_2004_;
								}
								if (i_1950_ != 0) {
									int i_2005_ = Class433.anIntArray4880[i_1950_];
									int i_2006_ = Class433.anIntArray4881[i_1950_];
									int i_2007_ = (aShortArray9468[i_1998_] * i_2005_ + aShortArray9493[i_1998_] * i_2006_ + 16383) >> 14;
									aShortArray9468[i_1998_] = (short) (((aShortArray9468[i_1998_] * i_2006_) - (aShortArray9493[i_1998_] * i_2005_) + 16383) >> 14);
									aShortArray9493[i_1998_] = (short) i_2007_;
								}
							}
						}
					}
				}
				if (aClass131_9485 == null && aClass131_9484 != null)
					aClass131_9484.anInterface15_1558 = null;
				if (aClass131_9485 != null)
					aClass131_9485.anInterface15_1558 = null;
			}
		} else if (i == 3) {
			for (int i_2008_ = 0; i_2008_ < i_1953_; i_2008_++) {
				int i_2009_ = is[i_2008_];
				if (i_2009_ < anIntArrayArray9463.length) {
					int[] is_2010_ = anIntArrayArray9463[i_2009_];
					for (int i_2011_ = 0; i_2011_ < is_2010_.length; i_2011_++) {
						int i_2012_ = is_2010_[i_2011_];
						anIntArray9460[i_2012_] -= anInt9516;
						anIntArray9461[i_2012_] -= anInt9517;
						anIntArray9496[i_2012_] -= anInt9518;
						anIntArray9460[i_2012_] = anIntArray9460[i_2012_] * i_1949_ >> 7;
						anIntArray9461[i_2012_] = anIntArray9461[i_2012_] * i_1950_ >> 7;
						anIntArray9496[i_2012_] = anIntArray9496[i_2012_] * i_1951_ >> 7;
						anIntArray9460[i_2012_] += anInt9516;
						anIntArray9461[i_2012_] += anInt9517;
						anIntArray9496[i_2012_] += anInt9518;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9475 != null) {
				for (int i_2013_ = 0; i_2013_ < i_1953_; i_2013_++) {
					int i_2014_ = is[i_2013_];
					if (i_2014_ < anIntArrayArray9475.length) {
						int[] is_2015_ = anIntArrayArray9475[i_2014_];
						for (int i_2016_ = 0; i_2016_ < is_2015_.length; i_2016_++) {
							int i_2017_ = is_2015_[i_2016_];
							int i_2018_ = ((aByteArray9476[i_2017_] & 0xff) + i_1949_ * 8);
							if (i_2018_ < 0)
								i_2018_ = 0;
							else if (i_2018_ > 255)
								i_2018_ = 255;
							aByteArray9476[i_2017_] = (byte) i_2018_;
						}
						if (is_2015_.length > 0 && aClass131_9484 != null)
							aClass131_9484.anInterface15_1558 = null;
					}
				}
				if (aClass161Array9508 != null) {
					for (int i_2019_ = 0; i_2019_ < anInt9507; i_2019_++) {
						Class161 class161 = aClass161Array9508[i_2019_];
						Class133 class133 = aClass133Array9479[i_2019_];
						class133.anInt1577 = (class133.anInt1577 & 0xffffff | 255 - (aByteArray9476[class161.anInt1764] & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9475 != null) {
				for (int i_2020_ = 0; i_2020_ < i_1953_; i_2020_++) {
					int i_2021_ = is[i_2020_];
					if (i_2021_ < anIntArrayArray9475.length) {
						int[] is_2022_ = anIntArrayArray9475[i_2021_];
						for (int i_2023_ = 0; i_2023_ < is_2022_.length; i_2023_++) {
							int i_2024_ = is_2022_[i_2023_];
							int i_2025_ = aShortArray9489[i_2024_] & 0xffff;
							int i_2026_ = i_2025_ >> 10 & 0x3f;
							int i_2027_ = i_2025_ >> 7 & 0x7;
							int i_2028_ = i_2025_ & 0x7f;
							i_2026_ = i_2026_ + i_1949_ & 0x3f;
							i_2027_ += i_1950_ / 4;
							if (i_2027_ < 0)
								i_2027_ = 0;
							else if (i_2027_ > 7)
								i_2027_ = 7;
							i_2028_ += i_1951_;
							if (i_2028_ < 0)
								i_2028_ = 0;
							else if (i_2028_ > 127)
								i_2028_ = 127;
							aShortArray9489[i_2024_] = (short) (i_2026_ << 10 | i_2027_ << 7 | i_2028_);
						}
						if (is_2022_.length > 0 && aClass131_9484 != null)
							aClass131_9484.anInterface15_1558 = null;
					}
				}
				if (aClass161Array9508 != null) {
					for (int i_2029_ = 0; i_2029_ < anInt9507; i_2029_++) {
						Class161 class161 = aClass161Array9508[i_2029_];
						Class133 class133 = aClass133Array9479[i_2029_];
						class133.anInt1577 = (class133.anInt1577 & ~0xffffff | (Class710.anIntArray8839[(aShortArray9489[class161.anInt1764] & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9480 != null) {
				for (int i_2030_ = 0; i_2030_ < i_1953_; i_2030_++) {
					int i_2031_ = is[i_2030_];
					if (i_2031_ < anIntArrayArray9480.length) {
						int[] is_2032_ = anIntArrayArray9480[i_2031_];
						for (int i_2033_ = 0; i_2033_ < is_2032_.length; i_2033_++) {
							Class133 class133 = aClass133Array9479[is_2032_[i_2033_]];
							class133.anInt1575 += i_1949_;
							class133.anInt1572 += i_1950_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9480 != null) {
				for (int i_2034_ = 0; i_2034_ < i_1953_; i_2034_++) {
					int i_2035_ = is[i_2034_];
					if (i_2035_ < anIntArrayArray9480.length) {
						int[] is_2036_ = anIntArrayArray9480[i_2035_];
						for (int i_2037_ = 0; i_2037_ < is_2036_.length; i_2037_++) {
							Class133 class133 = aClass133Array9479[is_2036_[i_2037_]];
							class133.anInt1576 = class133.anInt1576 * i_1949_ >> 7;
							class133.anInt1573 = class133.anInt1573 * i_1950_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9480 != null) {
				for (int i_2038_ = 0; i_2038_ < i_1953_; i_2038_++) {
					int i_2039_ = is[i_2038_];
					if (i_2039_ < anIntArrayArray9480.length) {
						int[] is_2040_ = anIntArrayArray9480[i_2039_];
						for (int i_2041_ = 0; i_2041_ < is_2040_.length; i_2041_++) {
							Class133 class133 = aClass133Array9479[is_2040_[i_2041_]];
							class133.anInt1574 = class133.anInt1574 + i_1949_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	void method2838() {
		/* empty */
	}

	void method2808() {
		/* empty */
	}

	public void method2827(int i) {
		aShort9495 = (short) i;
		if (aClass131_9484 != null)
			aClass131_9484.anInterface15_1558 = null;
	}

	public void method2739(Class167 class167, int i, int i_2042_, int i_2043_, boolean bool) {
		Class167_Sub3 class167_sub3_2044_ = (Class167_Sub3) class167;
		if (anInt9515 != 0 && class167_sub3_2044_.anInt9515 != 0) {
			int i_2045_ = class167_sub3_2044_.anInt9459;
			int[] is = class167_sub3_2044_.anIntArray9460;
			int[] is_2046_ = class167_sub3_2044_.anIntArray9461;
			int[] is_2047_ = class167_sub3_2044_.anIntArray9496;
			short[] is_2048_ = class167_sub3_2044_.aShortArray9493;
			short[] is_2049_ = class167_sub3_2044_.aShortArray9467;
			short[] is_2050_ = class167_sub3_2044_.aShortArray9468;
			byte[] is_2051_ = class167_sub3_2044_.aByteArray9487;
			short[] is_2052_;
			short[] is_2053_;
			short[] is_2054_;
			byte[] is_2055_;
			if (aClass151_9470 != null) {
				is_2052_ = aClass151_9470.aShortArray1729;
				is_2053_ = aClass151_9470.aShortArray1726;
				is_2054_ = aClass151_9470.aShortArray1728;
				is_2055_ = aClass151_9470.aByteArray1727;
			} else {
				is_2052_ = null;
				is_2053_ = null;
				is_2054_ = null;
				is_2055_ = null;
			}
			short[] is_2056_;
			short[] is_2057_;
			short[] is_2058_;
			byte[] is_2059_;
			if (class167_sub3_2044_.aClass151_9470 != null) {
				is_2056_ = class167_sub3_2044_.aClass151_9470.aShortArray1729;
				is_2057_ = class167_sub3_2044_.aClass151_9470.aShortArray1726;
				is_2058_ = class167_sub3_2044_.aClass151_9470.aShortArray1728;
				is_2059_ = class167_sub3_2044_.aClass151_9470.aByteArray1727;
			} else {
				is_2056_ = null;
				is_2057_ = null;
				is_2058_ = null;
				is_2059_ = null;
			}
			int[] is_2060_ = class167_sub3_2044_.anIntArray9503;
			short[] is_2061_ = class167_sub3_2044_.aShortArray9504;
			if (!class167_sub3_2044_.aBool9465)
				class167_sub3_2044_.method14870();
			int i_2062_ = class167_sub3_2044_.aShort9494;
			int i_2063_ = class167_sub3_2044_.aShort9505;
			int i_2064_ = class167_sub3_2044_.aShort9471;
			int i_2065_ = class167_sub3_2044_.aShort9497;
			int i_2066_ = class167_sub3_2044_.aShort9498;
			int i_2067_ = class167_sub3_2044_.aShort9491;
			for (int i_2068_ = 0; i_2068_ < anInt9459; i_2068_++) {
				int i_2069_ = anIntArray9461[i_2068_] - i_2042_;
				if (i_2069_ >= i_2062_ && i_2069_ <= i_2063_) {
					int i_2070_ = anIntArray9460[i_2068_] - i;
					if (i_2070_ >= i_2064_ && i_2070_ <= i_2065_) {
						int i_2071_ = anIntArray9496[i_2068_] - i_2043_;
						if (i_2071_ >= i_2066_ && i_2071_ <= i_2067_) {
							int i_2072_ = -1;
							int i_2073_ = anIntArray9503[i_2068_];
							int i_2074_ = anIntArray9503[i_2068_ + 1];
							for (int i_2075_ = i_2073_; (i_2075_ < i_2074_ && aShortArray9504[i_2075_] != 0); i_2075_++) {
								i_2072_ = (aShortArray9504[i_2075_] & 0xffff) - 1;
								if (aByteArray9487[i_2072_] != 0)
									break;
							}
							if (i_2072_ != -1) {
								for (int i_2076_ = 0; i_2076_ < i_2045_; i_2076_++) {
									if (i_2070_ == is[i_2076_] && i_2071_ == is_2047_[i_2076_] && i_2069_ == is_2046_[i_2076_]) {
										int i_2077_ = -1;
										i_2073_ = is_2060_[i_2076_];
										i_2074_ = is_2060_[i_2076_ + 1];
										for (int i_2078_ = i_2073_; (i_2078_ < i_2074_ && is_2061_[i_2078_] != 0); i_2078_++) {
											i_2077_ = (is_2061_[i_2078_] & 0xffff) - 1;
											if (is_2051_[i_2077_] != 0)
												break;
										}
										if (i_2077_ != -1) {
											if (is_2052_ == null) {
												aClass151_9470 = new Class151();
												is_2052_ = aClass151_9470.aShortArray1729 = (Class246.method4386(aShortArray9493, 371502150));
												is_2053_ = aClass151_9470.aShortArray1726 = (Class246.method4386(aShortArray9467, -1347642525));
												is_2054_ = aClass151_9470.aShortArray1728 = (Class246.method4386(aShortArray9468, -965939854));
												is_2055_ = aClass151_9470.aByteArray1727 = (Class60.method1408(aByteArray9487, -1504087650));
											}
											if (is_2056_ == null) {
												Class151 class151 = (class167_sub3_2044_.aClass151_9470 = new Class151());
												is_2056_ = class151.aShortArray1729 = (Class246.method4386(is_2048_, -877919587));
												is_2057_ = class151.aShortArray1726 = (Class246.method4386(is_2049_, -827702973));
												is_2058_ = class151.aShortArray1728 = (Class246.method4386(is_2050_, 430961031));
												is_2059_ = class151.aByteArray1727 = (Class60.method1408(is_2051_, -1400872537));
											}
											short i_2079_ = aShortArray9493[i_2072_];
											short i_2080_ = aShortArray9467[i_2072_];
											short i_2081_ = aShortArray9468[i_2072_];
											byte i_2082_ = aByteArray9487[i_2072_];
											i_2073_ = is_2060_[i_2076_];
											i_2074_ = is_2060_[i_2076_ + 1];
											for (int i_2083_ = i_2073_; i_2083_ < i_2074_; i_2083_++) {
												int i_2084_ = is_2061_[i_2083_] - 1;
												if (i_2084_ == -1)
													break;
												if (is_2059_[i_2084_] != 0) {
													is_2056_[i_2084_] += i_2079_;
													is_2057_[i_2084_] += i_2080_;
													is_2058_[i_2084_] += i_2081_;
													is_2059_[i_2084_] += i_2082_;
												}
											}
											i_2079_ = is_2048_[i_2077_];
											i_2080_ = is_2049_[i_2077_];
											i_2081_ = is_2050_[i_2077_];
											i_2082_ = is_2051_[i_2077_];
											i_2073_ = anIntArray9503[i_2068_];
											i_2074_ = anIntArray9503[i_2068_ + 1];
											for (int i_2085_ = i_2073_; (i_2085_ < i_2074_ && (aShortArray9504[i_2085_] != 0)); i_2085_++) {
												int i_2086_ = (aShortArray9504[i_2085_] & 0xffff) - 1;
												if (is_2055_[i_2086_] != 0) {
													is_2052_[i_2086_] += i_2079_;
													is_2053_[i_2086_] += i_2080_;
													is_2054_[i_2086_] += i_2081_;
													is_2055_[i_2086_] += i_2082_;
												}
											}
											if (aClass131_9485 == null && aClass131_9484 != null)
												aClass131_9484.anInterface15_1558 = null;
											if (aClass131_9485 != null)
												aClass131_9485.anInterface15_1558 = null;
											if ((class167_sub3_2044_.aClass131_9485) == null && (class167_sub3_2044_.aClass131_9484) != null)
												class167_sub3_2044_.aClass131_9484.anInterface15_1558 = null;
											if ((class167_sub3_2044_.aClass131_9485) != null)
												class167_sub3_2044_.aClass131_9485.anInterface15_1558 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	void method2842() {
		/* empty */
	}

	short method14900(Class179 class179, int i, long l, int i_2087_, int i_2088_, int i_2089_, int i_2090_, float f, float f_2091_) {
		int i_2092_ = anIntArray9503[i];
		int i_2093_ = anIntArray9503[i + 1];
		int i_2094_ = 0;
		for (int i_2095_ = i_2092_; i_2095_ < i_2093_; i_2095_++) {
			if (aShortArray9504[i_2095_] == 0) {
				i_2094_ = i_2095_;
				break;
			}
			int i_2096_ = (aShortArray9504[i_2095_] & 0xffff) - 1;
			if (aLongArray9445[i_2095_] == l)
				return (short) i_2096_;
		}
		aShortArray9504[i_2094_] = (short) (anInt9511 + 1);
		aLongArray9445[i_2094_] = l;
		aShortArray9493[anInt9511] = (short) i_2087_;
		aShortArray9467[anInt9511] = (short) i_2088_;
		aShortArray9468[anInt9511] = (short) i_2089_;
		aByteArray9487[anInt9511] = (byte) i_2090_;
		aFloatArray9453[anInt9511] = f;
		aFloatArray9472[anInt9511] = f_2091_;
		return (short) anInt9511++;
	}

	boolean method14901(int i, int i_2097_, int i_2098_, int i_2099_, int i_2100_, int i_2101_, int i_2102_, int i_2103_) {
		if (i_2097_ < i_2098_ && i_2097_ < i_2099_ && i_2097_ < i_2100_)
			return false;
		if (i_2097_ > i_2098_ && i_2097_ > i_2099_ && i_2097_ > i_2100_)
			return false;
		if (i < i_2101_ && i < i_2102_ && i < i_2103_)
			return false;
		if (i > i_2101_ && i > i_2102_ && i > i_2103_)
			return false;
		return true;
	}

	boolean method14902(int i, int i_2104_, int i_2105_, int i_2106_, int i_2107_, int i_2108_, int i_2109_, int i_2110_) {
		if (i_2104_ < i_2105_ && i_2104_ < i_2106_ && i_2104_ < i_2107_)
			return false;
		if (i_2104_ > i_2105_ && i_2104_ > i_2106_ && i_2104_ > i_2107_)
			return false;
		if (i < i_2108_ && i < i_2109_ && i < i_2110_)
			return false;
		if (i > i_2108_ && i > i_2109_ && i > i_2110_)
			return false;
		return true;
	}

	void method14903(Class523_Sub27_Sub4_Sub1 class523_sub27_sub4_sub1) {
		if (aClass178_Sub1_9486.anIntArray9294.length < anInt9511) {
			aClass178_Sub1_9486.anIntArray9294 = new int[anInt9511];
			aClass178_Sub1_9486.anIntArray9431 = new int[anInt9511];
		}
		int[] is = aClass178_Sub1_9486.anIntArray9294;
		int[] is_2111_ = aClass178_Sub1_9486.anIntArray9431;
		for (int i = 0; i < anInt9459; i++) {
			int i_2112_ = (((anIntArray9460[i] - (anIntArray9461[i] * aClass178_Sub1_9486.anInt9372 >> 8)) >> aClass178_Sub1_9486.anInt9287) - class523_sub27_sub4_sub1.anInt12053);
			int i_2113_ = (((anIntArray9496[i] - (anIntArray9461[i] * aClass178_Sub1_9486.anInt9366 >> 8)) >> aClass178_Sub1_9486.anInt9287) - class523_sub27_sub4_sub1.anInt12054);
			int i_2114_ = anIntArray9503[i];
			int i_2115_ = anIntArray9503[i + 1];
			for (int i_2116_ = i_2114_; i_2116_ < i_2115_ && aShortArray9504[i_2116_] != 0; i_2116_++) {
				int i_2117_ = (aShortArray9504[i_2116_] & 0xffff) - 1;
				is[i_2117_] = i_2112_;
				is_2111_[i_2117_] = i_2113_;
			}
		}
		for (int i = 0; i < anInt9474; i++) {
			if (aByteArray9476 == null || aByteArray9476[i] <= 128) {
				int i_2118_ = aShortArray9450[i] & 0xffff;
				int i_2119_ = aShortArray9478[i] & 0xffff;
				int i_2120_ = aShortArray9464[i] & 0xffff;
				int i_2121_ = is[i_2118_];
				int i_2122_ = is[i_2119_];
				int i_2123_ = is[i_2120_];
				int i_2124_ = is_2111_[i_2118_];
				int i_2125_ = is_2111_[i_2119_];
				int i_2126_ = is_2111_[i_2120_];
				if (((i_2121_ - i_2122_) * (i_2125_ - i_2126_) - (i_2125_ - i_2124_) * (i_2123_ - i_2122_)) > 0)
					class523_sub27_sub4_sub1.method18503(i_2124_, i_2125_, i_2126_, i_2121_, i_2122_, i_2123_);
			}
		}
	}

	void method14904(Class523_Sub27_Sub4_Sub1 class523_sub27_sub4_sub1) {
		if (aClass178_Sub1_9486.anIntArray9294.length < anInt9511) {
			aClass178_Sub1_9486.anIntArray9294 = new int[anInt9511];
			aClass178_Sub1_9486.anIntArray9431 = new int[anInt9511];
		}
		int[] is = aClass178_Sub1_9486.anIntArray9294;
		int[] is_2127_ = aClass178_Sub1_9486.anIntArray9431;
		for (int i = 0; i < anInt9459; i++) {
			int i_2128_ = (((anIntArray9460[i] - (anIntArray9461[i] * aClass178_Sub1_9486.anInt9372 >> 8)) >> aClass178_Sub1_9486.anInt9287) - class523_sub27_sub4_sub1.anInt12053);
			int i_2129_ = (((anIntArray9496[i] - (anIntArray9461[i] * aClass178_Sub1_9486.anInt9366 >> 8)) >> aClass178_Sub1_9486.anInt9287) - class523_sub27_sub4_sub1.anInt12054);
			int i_2130_ = anIntArray9503[i];
			int i_2131_ = anIntArray9503[i + 1];
			for (int i_2132_ = i_2130_; i_2132_ < i_2131_ && aShortArray9504[i_2132_] != 0; i_2132_++) {
				int i_2133_ = (aShortArray9504[i_2132_] & 0xffff) - 1;
				is[i_2133_] = i_2128_;
				is_2127_[i_2133_] = i_2129_;
			}
		}
		for (int i = 0; i < anInt9474; i++) {
			if (aByteArray9476 == null || aByteArray9476[i] <= 128) {
				int i_2134_ = aShortArray9450[i] & 0xffff;
				int i_2135_ = aShortArray9478[i] & 0xffff;
				int i_2136_ = aShortArray9464[i] & 0xffff;
				int i_2137_ = is[i_2134_];
				int i_2138_ = is[i_2135_];
				int i_2139_ = is[i_2136_];
				int i_2140_ = is_2127_[i_2134_];
				int i_2141_ = is_2127_[i_2135_];
				int i_2142_ = is_2127_[i_2136_];
				if (((i_2137_ - i_2138_) * (i_2141_ - i_2142_) - (i_2141_ - i_2140_) * (i_2139_ - i_2138_)) > 0)
					class523_sub27_sub4_sub1.method18503(i_2140_, i_2141_, i_2142_, i_2137_, i_2138_, i_2139_);
			}
		}
	}

	void method14905(Class523_Sub27_Sub4_Sub1 class523_sub27_sub4_sub1) {
		if (aClass178_Sub1_9486.anIntArray9294.length < anInt9511) {
			aClass178_Sub1_9486.anIntArray9294 = new int[anInt9511];
			aClass178_Sub1_9486.anIntArray9431 = new int[anInt9511];
		}
		int[] is = aClass178_Sub1_9486.anIntArray9294;
		int[] is_2143_ = aClass178_Sub1_9486.anIntArray9431;
		for (int i = 0; i < anInt9459; i++) {
			int i_2144_ = (((anIntArray9460[i] - (anIntArray9461[i] * aClass178_Sub1_9486.anInt9372 >> 8)) >> aClass178_Sub1_9486.anInt9287) - class523_sub27_sub4_sub1.anInt12053);
			int i_2145_ = (((anIntArray9496[i] - (anIntArray9461[i] * aClass178_Sub1_9486.anInt9366 >> 8)) >> aClass178_Sub1_9486.anInt9287) - class523_sub27_sub4_sub1.anInt12054);
			int i_2146_ = anIntArray9503[i];
			int i_2147_ = anIntArray9503[i + 1];
			for (int i_2148_ = i_2146_; i_2148_ < i_2147_ && aShortArray9504[i_2148_] != 0; i_2148_++) {
				int i_2149_ = (aShortArray9504[i_2148_] & 0xffff) - 1;
				is[i_2149_] = i_2144_;
				is_2143_[i_2149_] = i_2145_;
			}
		}
		for (int i = 0; i < anInt9474; i++) {
			if (aByteArray9476 == null || aByteArray9476[i] <= 128) {
				int i_2150_ = aShortArray9450[i] & 0xffff;
				int i_2151_ = aShortArray9478[i] & 0xffff;
				int i_2152_ = aShortArray9464[i] & 0xffff;
				int i_2153_ = is[i_2150_];
				int i_2154_ = is[i_2151_];
				int i_2155_ = is[i_2152_];
				int i_2156_ = is_2143_[i_2150_];
				int i_2157_ = is_2143_[i_2151_];
				int i_2158_ = is_2143_[i_2152_];
				if (((i_2153_ - i_2154_) * (i_2157_ - i_2158_) - (i_2157_ - i_2156_) * (i_2155_ - i_2154_)) > 0)
					class523_sub27_sub4_sub1.method18503(i_2156_, i_2157_, i_2158_, i_2153_, i_2154_, i_2155_);
			}
		}
	}

	public int method2741() {
		if (!aBool9465)
			method14870();
		return aShort9471;
	}

	public void method2763(int i, int i_2159_, Class142 class142, Class142 class142_2160_, int i_2161_, int i_2162_, int i_2163_) {
		if (!aBool9465)
			method14870();
		int i_2164_ = i_2161_ + aShort9471;
		int i_2165_ = i_2161_ + aShort9497;
		int i_2166_ = i_2163_ + aShort9498;
		int i_2167_ = i_2163_ + aShort9491;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_2164_ >= 0 && ((i_2165_ + class142.anInt1682 * 341909049 >> class142.anInt1680 * -1193058675) < class142.anInt1683 * 692304099) && i_2166_ >= 0 && ((i_2167_ + class142.anInt1682 * 341909049 >> class142.anInt1680 * -1193058675) < class142.anInt1681 * 452998539))) {
			if (i == 4 || i == 5) {
				if (class142_2160_ == null || (i_2164_ < 0 || ((i_2165_ + class142_2160_.anInt1682 * 341909049 >> class142_2160_.anInt1680 * -1193058675) >= class142_2160_.anInt1683 * 692304099) || i_2166_ < 0 || ((i_2167_ + class142_2160_.anInt1682 * 341909049 >> class142_2160_.anInt1680 * -1193058675) >= class142_2160_.anInt1681 * 452998539)))
					return;
			} else {
				i_2164_ >>= class142.anInt1680 * -1193058675;
				i_2165_ = (i_2165_ + (class142.anInt1682 * 341909049 - 1) >> class142.anInt1680 * -1193058675);
				i_2166_ >>= class142.anInt1680 * -1193058675;
				i_2167_ = (i_2167_ + (class142.anInt1682 * 341909049 - 1) >> class142.anInt1680 * -1193058675);
				if ((class142.method2321(i_2164_, i_2166_, 1867740474) == i_2162_) && (class142.method2321(i_2165_, i_2166_, 1989285007) == i_2162_) && (class142.method2321(i_2164_, i_2167_, 1946023483) == i_2162_) && (class142.method2321(i_2165_, i_2167_, 1666713486) == i_2162_))
					return;
			}
			if (i == 1) {
				for (int i_2168_ = 0; i_2168_ < anInt9459; i_2168_++)
					anIntArray9461[i_2168_] = (anIntArray9461[i_2168_] + class142.method2327((anIntArray9460[i_2168_] + i_2161_), (anIntArray9496[i_2168_] + i_2163_), -931232644) - i_2162_);
			} else if (i == 2) {
				int i_2169_ = aShort9494;
				if (i_2169_ == 0)
					return;
				for (int i_2170_ = 0; i_2170_ < anInt9459; i_2170_++) {
					int i_2171_ = (anIntArray9461[i_2170_] << 16) / i_2169_;
					if (i_2171_ < i_2159_)
						anIntArray9461[i_2170_] = (anIntArray9461[i_2170_] + (class142.method2327((anIntArray9460[i_2170_] + i_2161_), (anIntArray9496[i_2170_] + i_2163_), -562216442) - i_2162_) * (i_2159_ - i_2171_) / i_2159_);
				}
			} else if (i == 3) {
				int i_2172_ = (i_2159_ & 0xff) * 16;
				int i_2173_ = (i_2159_ >> 8 & 0xff) * 16;
				int i_2174_ = (i_2159_ >> 16 & 0xff) << 6;
				int i_2175_ = (i_2159_ >> 24 & 0xff) << 6;
				if (i_2161_ - (i_2172_ >> 1) < 0 || ((i_2161_ + (i_2172_ >> 1) + class142.anInt1682 * 341909049) >= (class142.anInt1683 * 692304099 << class142.anInt1680 * -1193058675)) || i_2163_ - (i_2173_ >> 1) < 0 || ((i_2163_ + (i_2173_ >> 1) + class142.anInt1682 * 341909049) >= (class142.anInt1681 * 452998539 << class142.anInt1680 * -1193058675)))
					return;
				method2693(class142, i_2161_, i_2162_, i_2163_, i_2172_, i_2173_, i_2174_, i_2175_);
			} else if (i == 4) {
				int i_2176_ = aShort9505 - aShort9494;
				for (int i_2177_ = 0; i_2177_ < anInt9459; i_2177_++)
					anIntArray9461[i_2177_] = (anIntArray9461[i_2177_] + ((class142_2160_.method2327(anIntArray9460[i_2177_] + i_2161_, anIntArray9496[i_2177_] + i_2163_, -140724369)) - i_2162_) + i_2176_);
			} else if (i == 5) {
				int i_2178_ = aShort9505 - aShort9494;
				for (int i_2179_ = 0; i_2179_ < anInt9459; i_2179_++) {
					int i_2180_ = anIntArray9460[i_2179_] + i_2161_;
					int i_2181_ = anIntArray9496[i_2179_] + i_2163_;
					int i_2182_ = class142.method2327(i_2180_, i_2181_, 879319642);
					int i_2183_ = class142_2160_.method2327(i_2180_, i_2181_, 1350327079);
					int i_2184_ = i_2182_ - i_2183_ - i_2159_;
					anIntArray9461[i_2179_] = ((anIntArray9461[i_2179_] << 8) / i_2178_ * i_2184_ >> 8) - (i_2162_ - i_2182_);
				}
			}
			if (aClass131_9481 != null)
				aClass131_9481.anInterface15_1558 = null;
			aBool9465 = false;
		}
	}

	void method14906() {
		if (anInt9474 != 0) {
			if (aByte9454 != 0)
				method14876(true);
			method14876(false);
			if (aClass119_9509 != null) {
				if (aClass119_9509.anInterface18_1474 == null)
					method14868((aByte9454 & 0x10) != 0);
				if (aClass119_9509.anInterface18_1474 != null) {
					aClass178_Sub1_9486.method14682(aClass131_9485 != null);
					aClass178_Sub1_9486.method14664(aClass131_9481, aClass131_9485, aClass131_9484, aClass131_9457);
					int i = anIntArray9502.length - 1;
					for (int i_2185_ = 0; i_2185_ < i; i_2185_++) {
						int i_2186_ = anIntArray9502[i_2185_];
						int i_2187_ = anIntArray9502[i_2185_ + 1];
						int i_2188_ = (aShortArray9473[i_2186_] == -1 ? -1 : aShortArray9473[i_2186_] & 0xffff);
						aClass178_Sub1_9486.method14836(i_2188_, aClass131_9485 != null);
						aClass178_Sub1_9486.method14652((aClass119_9509.anInterface18_1474), 4, i_2186_ * 3, ((i_2187_ - i_2186_) * 3));
					}
				}
			}
			method14882();
		}
	}

	void method14907(Class441 class441) {
		if (aClass161Array9508 != null) {
			Class441 class441_2189_ = aClass178_Sub1_9486.aClass441_9362;
			aClass178_Sub1_9486.method14636();
			aClass178_Sub1_9486.method3287(!aBool9456);
			aClass178_Sub1_9486.method14682(false);
			aClass178_Sub1_9486.method14664(aClass178_Sub1_9486.aClass131_9370, null, null, (aClass178_Sub1_9486.aClass131_9425));
			for (int i = 0; i < anInt9507; i++) {
				Class161 class161 = aClass161Array9508[i];
				Class133 class133 = aClass133Array9479[i];
				if (!class161.aBool1767 || !aClass178_Sub1_9486.method3146()) {
					float f = ((float) (anIntArray9460[class161.anInt1768] + anIntArray9460[class161.anInt1761] + anIntArray9460[class161.anInt1762]) * 0.3333333F);
					float f_2190_ = ((float) (anIntArray9461[class161.anInt1768] + anIntArray9461[class161.anInt1761] + anIntArray9461[class161.anInt1762]) * 0.3333333F);
					float f_2191_ = ((float) (anIntArray9496[class161.anInt1768] + anIntArray9496[class161.anInt1761] + anIntArray9496[class161.anInt1762]) * 0.3333333F);
					float f_2192_ = (class441.aFloatArray4916[0] * f + class441.aFloatArray4916[4] * f_2190_ + class441.aFloatArray4916[8] * f_2191_ + class441.aFloatArray4916[12]);
					float f_2193_ = (class441.aFloatArray4916[1] * f + class441.aFloatArray4916[5] * f_2190_ + class441.aFloatArray4916[9] * f_2191_ + class441.aFloatArray4916[13]);
					float f_2194_ = (class441.aFloatArray4916[2] * f + class441.aFloatArray4916[6] * f_2190_ + class441.aFloatArray4916[10] * f_2191_ + class441.aFloatArray4916[14]);
					float f_2195_ = ((float) (1.0 / Math.sqrt((double) (f_2192_ * f_2192_ + f_2193_ * f_2193_ + (f_2194_ * f_2194_)))) * (float) class161.anInt1769);
					class441_2189_.method7118(class133.anInt1574, class133.anInt1576 * class161.aShort1766 >> 7, class133.anInt1573 * class161.aShort1765 >> 7, (f_2192_ + (float) class133.anInt1575 - f_2192_ * f_2195_), (f_2193_ + (float) class133.anInt1572 - f_2193_ * f_2195_), f_2194_ - f_2194_ * f_2195_);
					aClass178_Sub1_9486.method14824(class441_2189_);
					int i_2196_ = class133.anInt1577;
					OpenGL.glColor4ub((byte) (i_2196_ >> 16), (byte) (i_2196_ >> 8), (byte) i_2196_, (byte) (i_2196_ >> 24));
					aClass178_Sub1_9486.method14670(class161.aShort1763);
					aClass178_Sub1_9486.method14687(class161.aByte1760);
					aClass178_Sub1_9486.method14665(7, 0, 4);
				}
			}
			aClass178_Sub1_9486.method3287(true);
			aClass178_Sub1_9486.method14638();
		}
	}

	public void method2755(int i) {
		int i_2197_ = Class433.anIntArray4880[i];
		int i_2198_ = Class433.anIntArray4881[i];
		for (int i_2199_ = 0; i_2199_ < anInt9459; i_2199_++) {
			int i_2200_ = ((anIntArray9496[i_2199_] * i_2197_ + anIntArray9460[i_2199_] * i_2198_) >> 14);
			anIntArray9496[i_2199_] = (anIntArray9496[i_2199_] * i_2198_ - anIntArray9460[i_2199_] * i_2197_) >> 14;
			anIntArray9460[i_2199_] = i_2200_;
		}
		for (int i_2201_ = 0; i_2201_ < anInt9511; i_2201_++) {
			int i_2202_ = ((aShortArray9468[i_2201_] * i_2197_ + aShortArray9493[i_2201_] * i_2198_) >> 14);
			aShortArray9468[i_2201_] = (short) ((aShortArray9468[i_2201_] * i_2198_ - aShortArray9493[i_2201_] * i_2197_) >> 14);
			aShortArray9493[i_2201_] = (short) i_2202_;
		}
		if (aClass131_9485 == null && aClass131_9484 != null)
			aClass131_9484.anInterface15_1558 = null;
		if (aClass131_9485 != null)
			aClass131_9485.anInterface15_1558 = null;
		if (aClass131_9481 != null)
			aClass131_9481.anInterface15_1558 = null;
		aBool9465 = false;
	}

	void method14908(Class441 class441) {
		if (aClass161Array9508 != null) {
			Class441 class441_2203_ = aClass178_Sub1_9486.aClass441_9362;
			aClass178_Sub1_9486.method14636();
			aClass178_Sub1_9486.method3287(!aBool9456);
			aClass178_Sub1_9486.method14682(false);
			aClass178_Sub1_9486.method14664(aClass178_Sub1_9486.aClass131_9370, null, null, (aClass178_Sub1_9486.aClass131_9425));
			for (int i = 0; i < anInt9507; i++) {
				Class161 class161 = aClass161Array9508[i];
				Class133 class133 = aClass133Array9479[i];
				if (!class161.aBool1767 || !aClass178_Sub1_9486.method3146()) {
					float f = ((float) (anIntArray9460[class161.anInt1768] + anIntArray9460[class161.anInt1761] + anIntArray9460[class161.anInt1762]) * 0.3333333F);
					float f_2204_ = ((float) (anIntArray9461[class161.anInt1768] + anIntArray9461[class161.anInt1761] + anIntArray9461[class161.anInt1762]) * 0.3333333F);
					float f_2205_ = ((float) (anIntArray9496[class161.anInt1768] + anIntArray9496[class161.anInt1761] + anIntArray9496[class161.anInt1762]) * 0.3333333F);
					float f_2206_ = (class441.aFloatArray4916[0] * f + class441.aFloatArray4916[4] * f_2204_ + class441.aFloatArray4916[8] * f_2205_ + class441.aFloatArray4916[12]);
					float f_2207_ = (class441.aFloatArray4916[1] * f + class441.aFloatArray4916[5] * f_2204_ + class441.aFloatArray4916[9] * f_2205_ + class441.aFloatArray4916[13]);
					float f_2208_ = (class441.aFloatArray4916[2] * f + class441.aFloatArray4916[6] * f_2204_ + class441.aFloatArray4916[10] * f_2205_ + class441.aFloatArray4916[14]);
					float f_2209_ = ((float) (1.0 / Math.sqrt((double) (f_2206_ * f_2206_ + f_2207_ * f_2207_ + (f_2208_ * f_2208_)))) * (float) class161.anInt1769);
					class441_2203_.method7118(class133.anInt1574, class133.anInt1576 * class161.aShort1766 >> 7, class133.anInt1573 * class161.aShort1765 >> 7, (f_2206_ + (float) class133.anInt1575 - f_2206_ * f_2209_), (f_2207_ + (float) class133.anInt1572 - f_2207_ * f_2209_), f_2208_ - f_2208_ * f_2209_);
					aClass178_Sub1_9486.method14824(class441_2203_);
					int i_2210_ = class133.anInt1577;
					OpenGL.glColor4ub((byte) (i_2210_ >> 16), (byte) (i_2210_ >> 8), (byte) i_2210_, (byte) (i_2210_ >> 24));
					aClass178_Sub1_9486.method14670(class161.aShort1763);
					aClass178_Sub1_9486.method14687(class161.aByte1760);
					aClass178_Sub1_9486.method14665(7, 0, 4);
				}
			}
			aClass178_Sub1_9486.method3287(true);
			aClass178_Sub1_9486.method14638();
		}
	}

	void method2772() {
		for (int i = 0; i < anInt9499; i++) {
			anIntArray9460[i] = anIntArray9460[i] + 7 >> 4;
			anIntArray9461[i] = anIntArray9461[i] + 7 >> 4;
			anIntArray9496[i] = anIntArray9496[i] + 7 >> 4;
		}
		if (aClass131_9481 != null)
			aClass131_9481.anInterface15_1558 = null;
		aBool9465 = false;
	}

	void method14909(boolean bool) {
		if ((aClass178_Sub1_9486.aClass523_Sub34_Sub1_9321.aByteArray10658).length < anInt9474 * 6)
			aClass178_Sub1_9486.aClass523_Sub34_Sub1_9321 = new Class523_Sub34_Sub1((anInt9474 + 100) * 6);
		else
			aClass178_Sub1_9486.aClass523_Sub34_Sub1_9321.anInt10661 = 0;
		Class523_Sub34_Sub1 class523_sub34_sub1 = aClass178_Sub1_9486.aClass523_Sub34_Sub1_9321;
		if (aClass178_Sub1_9486.aBool9393) {
			for (int i = 0; i < anInt9474; i++) {
				class523_sub34_sub1.writeShort(aShortArray9450[i], (byte) -56);
				class523_sub34_sub1.writeShort(aShortArray9478[i], (byte) -84);
				class523_sub34_sub1.writeShort(aShortArray9464[i], (byte) -77);
			}
		} else {
			for (int i = 0; i < anInt9474; i++) {
				class523_sub34_sub1.method16262(aShortArray9450[i], -1689829590);
				class523_sub34_sub1.method16262(aShortArray9478[i], -1824852299);
				class523_sub34_sub1.method16262(aShortArray9464[i], -690869119);
			}
		}
		if (class523_sub34_sub1.anInt10661 * 2349011 != 0) {
			if (bool) {
				if (anInterface18_9488 == null)
					anInterface18_9488 = (aClass178_Sub1_9486.method14660(5123, class523_sub34_sub1.aByteArray10658, class523_sub34_sub1.anInt10661 * 2349011, true));
				else
					anInterface18_9488.method100(5123, class523_sub34_sub1.aByteArray10658, class523_sub34_sub1.anInt10661 * 2349011);
				aClass119_9509.anInterface18_1474 = anInterface18_9488;
			} else
				aClass119_9509.anInterface18_1474 = (aClass178_Sub1_9486.method14660(5123, class523_sub34_sub1.aByteArray10658, class523_sub34_sub1.anInt10661 * 2349011, false));
			if (!bool)
				aBool9490 = true;
		}
	}

	void method14910(boolean bool) {
		if ((aClass178_Sub1_9486.aClass523_Sub34_Sub1_9321.aByteArray10658).length < anInt9474 * 6)
			aClass178_Sub1_9486.aClass523_Sub34_Sub1_9321 = new Class523_Sub34_Sub1((anInt9474 + 100) * 6);
		else
			aClass178_Sub1_9486.aClass523_Sub34_Sub1_9321.anInt10661 = 0;
		Class523_Sub34_Sub1 class523_sub34_sub1 = aClass178_Sub1_9486.aClass523_Sub34_Sub1_9321;
		if (aClass178_Sub1_9486.aBool9393) {
			for (int i = 0; i < anInt9474; i++) {
				class523_sub34_sub1.writeShort(aShortArray9450[i], (byte) -94);
				class523_sub34_sub1.writeShort(aShortArray9478[i], (byte) -118);
				class523_sub34_sub1.writeShort(aShortArray9464[i], (byte) -118);
			}
		} else {
			for (int i = 0; i < anInt9474; i++) {
				class523_sub34_sub1.method16262(aShortArray9450[i], -1958628970);
				class523_sub34_sub1.method16262(aShortArray9478[i], -1101175672);
				class523_sub34_sub1.method16262(aShortArray9464[i], -793986941);
			}
		}
		if (class523_sub34_sub1.anInt10661 * 2349011 != 0) {
			if (bool) {
				if (anInterface18_9488 == null)
					anInterface18_9488 = (aClass178_Sub1_9486.method14660(5123, class523_sub34_sub1.aByteArray10658, class523_sub34_sub1.anInt10661 * 2349011, true));
				else
					anInterface18_9488.method100(5123, class523_sub34_sub1.aByteArray10658, class523_sub34_sub1.anInt10661 * 2349011);
				aClass119_9509.anInterface18_1474 = anInterface18_9488;
			} else
				aClass119_9509.anInterface18_1474 = (aClass178_Sub1_9486.method14660(5123, class523_sub34_sub1.aByteArray10658, class523_sub34_sub1.anInt10661 * 2349011, false));
			if (!bool)
				aBool9490 = true;
		}
	}

	public Class143[] method2825() {
		return aClass143Array9506;
	}

	void method14911(boolean bool) {
		if ((aClass178_Sub1_9486.aClass523_Sub34_Sub1_9321.aByteArray10658).length < anInt9474 * 6)
			aClass178_Sub1_9486.aClass523_Sub34_Sub1_9321 = new Class523_Sub34_Sub1((anInt9474 + 100) * 6);
		else
			aClass178_Sub1_9486.aClass523_Sub34_Sub1_9321.anInt10661 = 0;
		Class523_Sub34_Sub1 class523_sub34_sub1 = aClass178_Sub1_9486.aClass523_Sub34_Sub1_9321;
		if (aClass178_Sub1_9486.aBool9393) {
			for (int i = 0; i < anInt9474; i++) {
				class523_sub34_sub1.writeShort(aShortArray9450[i], (byte) -89);
				class523_sub34_sub1.writeShort(aShortArray9478[i], (byte) -23);
				class523_sub34_sub1.writeShort(aShortArray9464[i], (byte) -81);
			}
		} else {
			for (int i = 0; i < anInt9474; i++) {
				class523_sub34_sub1.method16262(aShortArray9450[i], -576281164);
				class523_sub34_sub1.method16262(aShortArray9478[i], -1051299425);
				class523_sub34_sub1.method16262(aShortArray9464[i], -1976576349);
			}
		}
		if (class523_sub34_sub1.anInt10661 * 2349011 != 0) {
			if (bool) {
				if (anInterface18_9488 == null)
					anInterface18_9488 = (aClass178_Sub1_9486.method14660(5123, class523_sub34_sub1.aByteArray10658, class523_sub34_sub1.anInt10661 * 2349011, true));
				else
					anInterface18_9488.method100(5123, class523_sub34_sub1.aByteArray10658, class523_sub34_sub1.anInt10661 * 2349011);
				aClass119_9509.anInterface18_1474 = anInterface18_9488;
			} else
				aClass119_9509.anInterface18_1474 = (aClass178_Sub1_9486.method14660(5123, class523_sub34_sub1.aByteArray10658, class523_sub34_sub1.anInt10661 * 2349011, false));
			if (!bool)
				aBool9490 = true;
		}
	}

	void method14912(boolean bool) {
		boolean bool_2211_ = (aClass131_9484 != null && aClass131_9484.anInterface15_1558 == null);
		boolean bool_2212_ = (aClass131_9485 != null && aClass131_9485.anInterface15_1558 == null);
		boolean bool_2213_ = (aClass131_9481 != null && aClass131_9481.anInterface15_1558 == null);
		boolean bool_2214_ = (aClass131_9457 != null && aClass131_9457.anInterface15_1558 == null);
		if (bool) {
			bool_2211_ = bool_2211_ & (aByte9454 & 0x2) != 0;
			bool_2212_ = bool_2212_ & (aByte9454 & 0x4) != 0;
			bool_2213_ = bool_2213_ & (aByte9454 & 0x1) != 0;
			bool_2214_ = bool_2214_ & (aByte9454 & 0x8) != 0;
		}
		byte i = 0;
		byte i_2215_ = 0;
		byte i_2216_ = 0;
		byte i_2217_ = 0;
		byte i_2218_ = 0;
		if (bool_2213_) {
			i_2215_ = i;
			i += 12;
		}
		if (bool_2211_) {
			i_2216_ = i;
			i += 4;
		}
		if (bool_2212_) {
			i_2217_ = i;
			i += 12;
		}
		if (bool_2214_) {
			i_2218_ = i;
			i += 8;
		}
		if (i != 0) {
			if ((aClass178_Sub1_9486.aClass523_Sub34_Sub1_9321.aByteArray10658).length < anInt9511 * i)
				aClass178_Sub1_9486.aClass523_Sub34_Sub1_9321 = new Class523_Sub34_Sub1((anInt9511 + 100) * i);
			else
				aClass178_Sub1_9486.aClass523_Sub34_Sub1_9321.anInt10661 = 0;
			Class523_Sub34_Sub1 class523_sub34_sub1 = aClass178_Sub1_9486.aClass523_Sub34_Sub1_9321;
			if (bool_2213_) {
				if (aClass178_Sub1_9486.aBool9393) {
					for (int i_2219_ = 0; i_2219_ < anInt9459; i_2219_++) {
						int i_2220_ = Stream.floatToRawIntBits((float) anIntArray9460[i_2219_]);
						int i_2221_ = Stream.floatToRawIntBits((float) anIntArray9461[i_2219_]);
						int i_2222_ = Stream.floatToRawIntBits((float) anIntArray9496[i_2219_]);
						int i_2223_ = anIntArray9503[i_2219_];
						int i_2224_ = anIntArray9503[i_2219_ + 1];
						for (int i_2225_ = i_2223_; (i_2225_ < i_2224_ && aShortArray9504[i_2225_] != 0); i_2225_++) {
							int i_2226_ = (aShortArray9504[i_2225_] & 0xffff) - 1;
							class523_sub34_sub1.anInt10661 = i_2226_ * i * 189765723;
							class523_sub34_sub1.writeInt(i_2220_, -1351005965);
							class523_sub34_sub1.writeInt(i_2221_, -1823916423);
							class523_sub34_sub1.writeInt(i_2222_, -1775257515);
						}
					}
				} else {
					for (int i_2227_ = 0; i_2227_ < anInt9459; i_2227_++) {
						int i_2228_ = Stream.floatToRawIntBits((float) anIntArray9460[i_2227_]);
						int i_2229_ = Stream.floatToRawIntBits((float) anIntArray9461[i_2227_]);
						int i_2230_ = Stream.floatToRawIntBits((float) anIntArray9496[i_2227_]);
						int i_2231_ = anIntArray9503[i_2227_];
						int i_2232_ = anIntArray9503[i_2227_ + 1];
						for (int i_2233_ = i_2231_; (i_2233_ < i_2232_ && aShortArray9504[i_2233_] != 0); i_2233_++) {
							int i_2234_ = (aShortArray9504[i_2233_] & 0xffff) - 1;
							class523_sub34_sub1.anInt10661 = i_2234_ * i * 189765723;
							class523_sub34_sub1.method16265(i_2228_, (short) 12756);
							class523_sub34_sub1.method16265(i_2229_, (short) 26026);
							class523_sub34_sub1.method16265(i_2230_, (short) 6432);
						}
					}
				}
			}
			if (bool_2211_) {
				if (aClass131_9485 == null) {
					short[] is;
					short[] is_2235_;
					short[] is_2236_;
					byte[] is_2237_;
					if (aClass151_9470 != null) {
						is = aClass151_9470.aShortArray1729;
						is_2235_ = aClass151_9470.aShortArray1726;
						is_2236_ = aClass151_9470.aShortArray1728;
						is_2237_ = aClass151_9470.aByteArray1727;
					} else {
						is = aShortArray9493;
						is_2235_ = aShortArray9467;
						is_2236_ = aShortArray9468;
						is_2237_ = aByteArray9487;
					}
					float f = aClass178_Sub1_9486.aFloatArray9277[0];
					float f_2238_ = aClass178_Sub1_9486.aFloatArray9277[1];
					float f_2239_ = aClass178_Sub1_9486.aFloatArray9277[2];
					float f_2240_ = aClass178_Sub1_9486.aFloat9359;
					float f_2241_ = (aClass178_Sub1_9486.aFloat9343 * 768.0F / (float) aShort9455);
					float f_2242_ = (aClass178_Sub1_9486.aFloat9250 * 768.0F / (float) aShort9455);
					for (int i_2243_ = 0; i_2243_ < anInt9515; i_2243_++) {
						int i_2244_ = method14879(aShortArray9489[i_2243_], aShortArray9473[i_2243_], aShort9495, aByteArray9476[i_2243_]);
						float f_2245_ = ((float) (i_2244_ >>> 24) * aClass178_Sub1_9486.aFloat9356);
						float f_2246_ = ((float) (i_2244_ >> 16 & 0xff) * aClass178_Sub1_9486.aFloat9357);
						float f_2247_ = ((float) (i_2244_ >> 8 & 0xff) * aClass178_Sub1_9486.aFloat9268);
						int i_2248_ = aShortArray9450[i_2243_] & 0xffff;
						short i_2249_ = (short) is_2237_[i_2248_];
						float f_2250_;
						if (i_2249_ == 0)
							f_2250_ = ((f * (float) is[i_2248_] + f_2238_ * (float) is_2235_[i_2248_] + f_2239_ * (float) is_2236_[i_2248_]) * 0.0026041667F);
						else
							f_2250_ = ((f * (float) is[i_2248_] + f_2238_ * (float) is_2235_[i_2248_] + f_2239_ * (float) is_2236_[i_2248_]) / (float) (i_2249_ * 256));
						float f_2251_ = f_2240_ + f_2250_ * (f_2250_ < 0.0F ? f_2242_ : f_2241_);
						int i_2252_ = (int) (f_2245_ * f_2251_);
						if (i_2252_ < 0)
							i_2252_ = 0;
						else if (i_2252_ > 255)
							i_2252_ = 255;
						int i_2253_ = (int) (f_2246_ * f_2251_);
						if (i_2253_ < 0)
							i_2253_ = 0;
						else if (i_2253_ > 255)
							i_2253_ = 255;
						int i_2254_ = (int) (f_2247_ * f_2251_);
						if (i_2254_ < 0)
							i_2254_ = 0;
						else if (i_2254_ > 255)
							i_2254_ = 255;
						class523_sub34_sub1.anInt10661 = (i_2216_ + i_2248_ * i) * 189765723;
						class523_sub34_sub1.writeByte(i_2252_, -673450204);
						class523_sub34_sub1.writeByte(i_2253_, 1717729195);
						class523_sub34_sub1.writeByte(i_2254_, -1199341552);
						class523_sub34_sub1.writeByte(255 - ((aByteArray9476[i_2243_]) & 0xff), -1305315150);
						i_2248_ = aShortArray9478[i_2243_] & 0xffff;
						i_2249_ = (short) is_2237_[i_2248_];
						if (i_2249_ == 0)
							f_2250_ = ((f * (float) is[i_2248_] + f_2238_ * (float) is_2235_[i_2248_] + f_2239_ * (float) is_2236_[i_2248_]) * 0.0026041667F);
						else
							f_2250_ = ((f * (float) is[i_2248_] + f_2238_ * (float) is_2235_[i_2248_] + f_2239_ * (float) is_2236_[i_2248_]) / (float) (i_2249_ * 256));
						f_2251_ = f_2240_ + f_2250_ * (f_2250_ < 0.0F ? f_2242_ : f_2241_);
						i_2252_ = (int) (f_2245_ * f_2251_);
						if (i_2252_ < 0)
							i_2252_ = 0;
						else if (i_2252_ > 255)
							i_2252_ = 255;
						i_2253_ = (int) (f_2246_ * f_2251_);
						if (i_2253_ < 0)
							i_2253_ = 0;
						else if (i_2253_ > 255)
							i_2253_ = 255;
						i_2254_ = (int) (f_2247_ * f_2251_);
						if (i_2254_ < 0)
							i_2254_ = 0;
						else if (i_2254_ > 255)
							i_2254_ = 255;
						class523_sub34_sub1.anInt10661 = (i_2216_ + i_2248_ * i) * 189765723;
						class523_sub34_sub1.writeByte(i_2252_, -1907444249);
						class523_sub34_sub1.writeByte(i_2253_, -1962349730);
						class523_sub34_sub1.writeByte(i_2254_, 485578882);
						class523_sub34_sub1.writeByte(255 - ((aByteArray9476[i_2243_]) & 0xff), 636747659);
						i_2248_ = aShortArray9464[i_2243_] & 0xffff;
						i_2249_ = (short) is_2237_[i_2248_];
						if (i_2249_ == 0)
							f_2250_ = ((f * (float) is[i_2248_] + f_2238_ * (float) is_2235_[i_2248_] + f_2239_ * (float) is_2236_[i_2248_]) * 0.0026041667F);
						else
							f_2250_ = ((f * (float) is[i_2248_] + f_2238_ * (float) is_2235_[i_2248_] + f_2239_ * (float) is_2236_[i_2248_]) / (float) (i_2249_ * 256));
						f_2251_ = f_2240_ + f_2250_ * (f_2250_ < 0.0F ? f_2242_ : f_2241_);
						i_2252_ = (int) (f_2245_ * f_2251_);
						if (i_2252_ < 0)
							i_2252_ = 0;
						else if (i_2252_ > 255)
							i_2252_ = 255;
						i_2253_ = (int) (f_2246_ * f_2251_);
						if (i_2253_ < 0)
							i_2253_ = 0;
						else if (i_2253_ > 255)
							i_2253_ = 255;
						i_2254_ = (int) (f_2247_ * f_2251_);
						if (i_2254_ < 0)
							i_2254_ = 0;
						else if (i_2254_ > 255)
							i_2254_ = 255;
						class523_sub34_sub1.anInt10661 = (i_2216_ + i_2248_ * i) * 189765723;
						class523_sub34_sub1.writeByte(i_2252_, 1658954179);
						class523_sub34_sub1.writeByte(i_2253_, -2115351355);
						class523_sub34_sub1.writeByte(i_2254_, -1722467033);
						class523_sub34_sub1.writeByte(255 - ((aByteArray9476[i_2243_]) & 0xff), 1580727387);
					}
				} else {
					for (int i_2255_ = 0; i_2255_ < anInt9515; i_2255_++) {
						int i_2256_ = method14879(aShortArray9489[i_2255_], aShortArray9473[i_2255_], aShort9495, aByteArray9476[i_2255_]);
						class523_sub34_sub1.anInt10661 = ((i_2216_ + (aShortArray9450[i_2255_] & 0xffff) * i) * 189765723);
						class523_sub34_sub1.writeInt(i_2256_, -931361889);
						class523_sub34_sub1.anInt10661 = ((i_2216_ + (aShortArray9478[i_2255_] & 0xffff) * i) * 189765723);
						class523_sub34_sub1.writeInt(i_2256_, -1019074246);
						class523_sub34_sub1.anInt10661 = ((i_2216_ + (aShortArray9464[i_2255_] & 0xffff) * i) * 189765723);
						class523_sub34_sub1.writeInt(i_2256_, -1524576235);
					}
				}
			}
			if (bool_2212_) {
				short[] is;
				short[] is_2257_;
				short[] is_2258_;
				byte[] is_2259_;
				if (aClass151_9470 != null) {
					is = aClass151_9470.aShortArray1729;
					is_2257_ = aClass151_9470.aShortArray1726;
					is_2258_ = aClass151_9470.aShortArray1728;
					is_2259_ = aClass151_9470.aByteArray1727;
				} else {
					is = aShortArray9493;
					is_2257_ = aShortArray9467;
					is_2258_ = aShortArray9468;
					is_2259_ = aByteArray9487;
				}
				float f = 3.0F / (float) aShort9455;
				float f_2260_ = 3.0F / (float) (aShort9455 + aShort9455 / 2);
				class523_sub34_sub1.anInt10661 = i_2217_ * 189765723;
				if (aClass178_Sub1_9486.aBool9393) {
					for (int i_2261_ = 0; i_2261_ < anInt9511; i_2261_++) {
						int i_2262_ = is_2259_[i_2261_] & 0xff;
						if (i_2262_ == 0) {
							class523_sub34_sub1.method18112((float) is[i_2261_] * f_2260_);
							class523_sub34_sub1.method18112((float) (is_2257_[i_2261_]) * f_2260_);
							class523_sub34_sub1.method18112((float) (is_2258_[i_2261_]) * f_2260_);
						} else {
							float f_2263_ = f / (float) i_2262_;
							class523_sub34_sub1.method18112((float) is[i_2261_] * f_2263_);
							class523_sub34_sub1.method18112((float) (is_2257_[i_2261_]) * f_2263_);
							class523_sub34_sub1.method18112((float) (is_2258_[i_2261_]) * f_2263_);
						}
						class523_sub34_sub1.anInt10661 += (i - 12) * 189765723;
					}
				} else {
					for (int i_2264_ = 0; i_2264_ < anInt9511; i_2264_++) {
						int i_2265_ = is_2259_[i_2264_] & 0xff;
						if (i_2265_ == 0) {
							class523_sub34_sub1.method18110((float) is[i_2264_] * f_2260_);
							class523_sub34_sub1.method18110((float) (is_2257_[i_2264_]) * f_2260_);
							class523_sub34_sub1.method18110((float) (is_2258_[i_2264_]) * f_2260_);
						} else {
							float f_2266_ = f / (float) i_2265_;
							class523_sub34_sub1.method18110((float) is[i_2264_] * f_2266_);
							class523_sub34_sub1.method18110((float) (is_2257_[i_2264_]) * f_2266_);
							class523_sub34_sub1.method18110((float) (is_2258_[i_2264_]) * f_2266_);
						}
						class523_sub34_sub1.anInt10661 += (i - 12) * 189765723;
					}
				}
			}
			if (bool_2214_) {
				class523_sub34_sub1.anInt10661 = i_2218_ * 189765723;
				if (aClass178_Sub1_9486.aBool9393) {
					for (int i_2267_ = 0; i_2267_ < anInt9511; i_2267_++) {
						class523_sub34_sub1.method18112(aFloatArray9453[i_2267_]);
						class523_sub34_sub1.method18112(aFloatArray9472[i_2267_]);
						class523_sub34_sub1.anInt10661 += (i - 8) * 189765723;
					}
				} else {
					for (int i_2268_ = 0; i_2268_ < anInt9511; i_2268_++) {
						class523_sub34_sub1.method18110(aFloatArray9453[i_2268_]);
						class523_sub34_sub1.method18110(aFloatArray9472[i_2268_]);
						class523_sub34_sub1.anInt10661 += (i - 8) * 189765723;
					}
				}
			}
			class523_sub34_sub1.anInt10661 = i * anInt9511 * 189765723;
			Interface15 interface15;
			if (bool) {
				if (anInterface15_9477 == null)
					anInterface15_9477 = (aClass178_Sub1_9486.method14717(i, class523_sub34_sub1.aByteArray10658, class523_sub34_sub1.anInt10661 * 2349011, true));
				else
					anInterface15_9477.method84(i, (class523_sub34_sub1.aByteArray10658), (class523_sub34_sub1.anInt10661 * 2349011));
				interface15 = anInterface15_9477;
				aByte9454 = (byte) 0;
			} else {
				interface15 = (aClass178_Sub1_9486.method14717(i, class523_sub34_sub1.aByteArray10658, class523_sub34_sub1.anInt10661 * 2349011, false));
				aBool9490 = true;
			}
			if (bool_2213_) {
				aClass131_9481.anInterface15_1558 = interface15;
				aClass131_9481.aByte1555 = i_2215_;
			}
			if (bool_2214_) {
				aClass131_9457.anInterface15_1558 = interface15;
				aClass131_9457.aByte1555 = i_2218_;
			}
			if (bool_2211_) {
				aClass131_9484.anInterface15_1558 = interface15;
				aClass131_9484.aByte1555 = i_2216_;
			}
			if (bool_2212_) {
				aClass131_9485.anInterface15_1558 = interface15;
				aClass131_9485.aByte1555 = i_2217_;
			}
		}
	}

	int method14913(int i, short i_2269_, int i_2270_, byte i_2271_) {
		int i_2272_ = Class710.anIntArray8839[method14877(i, i_2270_)];
		if (i_2269_ != -1) {
			Class177 class177 = aClass178_Sub1_9486.aClass172_1916.method2895(i_2269_ & 0xffff, -173536514);
			int i_2273_ = class177.aByte1912 & 0xff;
			if (i_2273_ != 0) {
				int i_2274_;
				if (i_2270_ < 0)
					i_2274_ = 0;
				else if (i_2270_ > 127)
					i_2274_ = 16777215;
				else
					i_2274_ = 131586 * i_2270_;
				if (i_2273_ == 256)
					i_2272_ = i_2274_;
				else {
					int i_2275_ = i_2273_;
					int i_2276_ = 256 - i_2273_;
					i_2272_ = ((((i_2274_ & 0xff00ff) * i_2275_ + (i_2272_ & 0xff00ff) * i_2276_) & ~0xff00ff) + (((i_2274_ & 0xff00) * i_2275_ + (i_2272_ & 0xff00) * i_2276_) & 0xff0000)) >> 8;
				}
			}
			int i_2277_ = class177.aByte1883 & 0xff;
			if (i_2277_ != 0) {
				i_2277_ += 256;
				int i_2278_ = ((i_2272_ & 0xff0000) >> 16) * i_2277_;
				if (i_2278_ > 65535)
					i_2278_ = 65535;
				int i_2279_ = ((i_2272_ & 0xff00) >> 8) * i_2277_;
				if (i_2279_ > 65535)
					i_2279_ = 65535;
				int i_2280_ = (i_2272_ & 0xff) * i_2277_;
				if (i_2280_ > 65535)
					i_2280_ = 65535;
				i_2272_ = (i_2278_ << 8 & 0xff0000) + (i_2279_ & 0xff00) + (i_2280_ >> 8);
			}
		}
		return i_2272_ << 8 | 255 - (i_2271_ & 0xff);
	}

	static final int method14914(int i, int i_2281_) {
		i_2281_ = i_2281_ * (i & 0x7f) >> 7;
		if (i_2281_ < 2)
			i_2281_ = 2;
		else if (i_2281_ > 126)
			i_2281_ = 126;
		return (i & 0xff80) + i_2281_;
	}

	public int method2871() {
		if (!aBool9500)
			method2719();
		return aShort9501;
	}

	public void method2754(int i) {
		int i_2282_ = Class433.anIntArray4880[i];
		int i_2283_ = Class433.anIntArray4881[i];
		for (int i_2284_ = 0; i_2284_ < anInt9459; i_2284_++) {
			int i_2285_ = ((anIntArray9461[i_2284_] * i_2283_ - anIntArray9496[i_2284_] * i_2282_) >> 14);
			anIntArray9496[i_2284_] = (anIntArray9461[i_2284_] * i_2282_ + anIntArray9496[i_2284_] * i_2283_) >> 14;
			anIntArray9461[i_2284_] = i_2285_;
		}
		if (aClass131_9481 != null)
			aClass131_9481.anInterface15_1558 = null;
		aBool9465 = false;
	}
}
