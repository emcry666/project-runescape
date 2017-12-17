/* Class179 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class179 {
	public short[] aShortArray1949;
	static final int anInt1950 = 26;
	static final int anInt1951 = 1;
	public int anInt1952 = 12;
	public int anInt1953 = 0;
	byte[] aByteArray1954;
	public int[] anIntArray1955;
	public int[] anIntArray1956;
	public int[] anIntArray1957;
	public int[] anIntArray1958;
	public short[] aShortArray1959;
	public int[] anIntArray1960;
	int anInt1961;
	public float[] aFloatArray1962;
	public float[] aFloatArray1963;
	public int anInt1964;
	public short[] aShortArray1965;
	public short[] aShortArray1966;
	public short[] aShortArray1967;
	public byte[] aByteArray1968;
	public byte[] aByteArray1969;
	public int[] anIntArray1970;
	public byte[] aByteArray1971;
	public byte[] aByteArray1972;
	public int[] anIntArray1973;
	public short[] aShortArray1974;
	public byte[] aByteArray1975;
	static final int anInt1976 = 3;
	public short[] aShortArray1977;
	byte aByte1978;
	public short[] aShortArray1979;
	public static final short aShort1980 = -1;
	public int[] anIntArray1981;
	int anInt1982;
	public byte[] aByteArray1983;
	public static final short aShort1984 = 32766;
	public short[] aShortArray1985;
	public short[] aShortArray1986;
	public int[] anIntArray1987;
	public int[] anIntArray1988;
	public short[] aShortArray1989;
	public byte[] aByteArray1990;
	public int anInt1991 = 0;
	public int[] anIntArray1992;
	public int[] anIntArray1993;
	public byte[] aByteArray1994;
	public Class184[] aClass184Array1995;
	public Class143[] aClass143Array1996;
	public Class176[] aClass176Array1997;

	public void method3478(short i, short i_0_) {
		if (aShortArray1959 != null) {
			for (int i_1_ = 0; i_1_ < anInt1964; i_1_++) {
				if (aShortArray1959[i_1_] == i)
					aShortArray1959[i_1_] = i_0_;
			}
		}
	}

	public Class179(byte[] is) {
		anInt1964 = 0;
		aByte1978 = (byte) 0;
		anInt1982 = 0;
		Class523_Sub34 class523_sub34 = new Class523_Sub34(is);
		Class523_Sub34 class523_sub34_2_ = new Class523_Sub34(is);
		Class523_Sub34 class523_sub34_3_ = new Class523_Sub34(is);
		Class523_Sub34 class523_sub34_4_ = new Class523_Sub34(is);
		Class523_Sub34 class523_sub34_5_ = new Class523_Sub34(is);
		Class523_Sub34 class523_sub34_6_ = new Class523_Sub34(is);
		Class523_Sub34 class523_sub34_7_ = new Class523_Sub34(is);
		int i = class523_sub34.readUnsignedByte(-1374520562);
		if (i != 1)
			System.out.println(new StringBuilder().append("").append(i).toString());
		else {
			class523_sub34.readUnsignedByte(1045158869);
			anInt1952 = class523_sub34.readUnsignedByte(642745071);
			class523_sub34.anInt10661 = (is.length - 26) * 189765723;
			anInt1953 = class523_sub34.readUnsignedShort(-101431258);
			anInt1964 = class523_sub34.readUnsignedShort(-581905573);
			anInt1982 = class523_sub34.readUnsignedShort(-1694254170);
			int i_8_ = class523_sub34.readUnsignedByte(802423914);
			boolean bool = (i_8_ & 0x1) == 1;
			boolean bool_9_ = (i_8_ & 0x2) == 2;
			boolean bool_10_ = (i_8_ & 0x4) == 4;
			boolean bool_11_ = (i_8_ & 0x10) == 16;
			boolean bool_12_ = (i_8_ & 0x20) == 32;
			boolean bool_13_ = (i_8_ & 0x40) == 64;
			boolean bool_14_ = (i_8_ & 0x80) == 128;
			int i_15_ = class523_sub34.readUnsignedByte(906972677);
			int i_16_ = class523_sub34.readUnsignedByte(-1496177772);
			int i_17_ = class523_sub34.readUnsignedByte(131721110);
			int i_18_ = class523_sub34.readUnsignedByte(2028055835);
			int i_19_ = class523_sub34.readUnsignedByte(-393894623);
			int i_20_ = class523_sub34.readUnsignedShort(-1221953072);
			int i_21_ = class523_sub34.readUnsignedShort(-425564304);
			int i_22_ = class523_sub34.readUnsignedShort(-97271727);
			int i_23_ = class523_sub34.readUnsignedShort(-1141725899);
			int i_24_ = class523_sub34.readUnsignedShort(-1320842403);
			int i_25_ = class523_sub34.readUnsignedShort(-1698739289);
			int i_26_ = class523_sub34.readUnsignedShort(-1736212442);
			if (!bool_11_) {
				if (i_19_ == 1)
					i_25_ = anInt1953;
				else
					i_25_ = 0;
			}
			if (!bool_12_) {
				if (i_17_ == 1)
					i_26_ = anInt1964;
				else
					i_26_ = 0;
			}
			int i_27_ = 0;
			int i_28_ = 0;
			int i_29_ = 0;
			if (anInt1982 > 0) {
				aByteArray1983 = new byte[anInt1982];
				class523_sub34.anInt10661 = 569297169;
				for (int i_30_ = 0; i_30_ < anInt1982; i_30_++) {
					byte i_31_ = (aByteArray1983[i_30_] = class523_sub34.readByte((short) -23957));
					if (i_31_ == 0)
						i_27_++;
					if (i_31_ >= 1 && i_31_ <= 3)
						i_28_++;
					if (i_31_ == 2)
						i_29_++;
				}
			}
			int i_32_ = 3 + anInt1982;
			int i_33_ = i_32_;
			i_32_ += anInt1953;
			int i_34_ = i_32_;
			if (bool)
				i_32_ += anInt1964;
			int i_35_ = i_32_;
			i_32_ += anInt1964;
			int i_36_ = i_32_;
			if (i_15_ == 255)
				i_32_ += anInt1964;
			int i_37_ = i_32_;
			i_32_ += i_26_;
			int i_38_ = i_32_;
			i_32_ += i_25_;
			int i_39_ = i_32_;
			if (i_16_ == 1)
				i_32_ += anInt1964;
			int i_40_ = i_32_;
			i_32_ += i_23_;
			int i_41_ = i_32_;
			if (i_18_ == 1)
				i_32_ += anInt1964 * 2;
			int i_42_ = i_32_;
			i_32_ += i_24_;
			int i_43_ = i_32_;
			i_32_ += anInt1964 * 2;
			int i_44_ = i_32_;
			i_32_ += i_20_;
			int i_45_ = i_32_;
			i_32_ += i_21_;
			int i_46_ = i_32_;
			i_32_ += i_22_;
			int i_47_ = i_32_;
			i_32_ += i_27_ * 6;
			int i_48_ = i_32_;
			i_32_ += i_28_ * 6;
			int i_49_ = 6;
			if (anInt1952 == 14)
				i_49_ = 7;
			else if (anInt1952 >= 15)
				i_49_ = 9;
			int i_50_ = i_32_;
			i_32_ += i_28_ * i_49_;
			int i_51_ = i_32_;
			i_32_ += i_28_;
			int i_52_ = i_32_;
			i_32_ += i_28_;
			int i_53_ = i_32_;
			i_32_ += i_28_ + i_29_ * 2;
			int i_54_ = i_32_;
			int i_55_ = is.length;
			int i_56_ = is.length;
			int i_57_ = is.length;
			int i_58_ = is.length;
			if (bool_14_) {
				Class523_Sub34 class523_sub34_59_ = new Class523_Sub34(is);
				class523_sub34_59_.anInt10661 = (is.length - 26) * 189765723;
				class523_sub34_59_.anInt10661 -= (is[class523_sub34_59_.anInt10661 * 2349011 - 1] * 189765723);
				anInt1961 = class523_sub34_59_.readUnsignedShort(-2133554529);
				int i_60_ = class523_sub34_59_.readUnsignedShort(-1871680677);
				int i_61_ = class523_sub34_59_.readUnsignedShort(-1861792131);
				i_55_ = i_54_ + i_60_;
				i_56_ = i_55_ + i_61_;
				i_57_ = i_56_ + anInt1953;
				i_58_ = i_57_ + anInt1961 * 2;
			}
			anIntArray1981 = new int[anInt1953];
			anIntArray1973 = new int[anInt1953];
			anIntArray1957 = new int[anInt1953];
			aShortArray1949 = new short[anInt1964];
			aShortArray1966 = new short[anInt1964];
			aShortArray1967 = new short[anInt1964];
			if (i_19_ == 1)
				anIntArray1956 = new int[anInt1953];
			if (bool)
				aByteArray1971 = new byte[anInt1964];
			if (i_15_ == 255)
				aByteArray1972 = new byte[anInt1964];
			else
				aByte1978 = (byte) i_15_;
			if (i_16_ == 1)
				aByteArray1975 = new byte[anInt1964];
			if (i_17_ == 1)
				anIntArray1993 = new int[anInt1964];
			if (i_18_ == 1)
				aShortArray1959 = new short[anInt1964];
			if (i_18_ == 1 && (anInt1982 > 0 || anInt1961 > 0))
				aShortArray1989 = new short[anInt1964];
			aShortArray1974 = new short[anInt1964];
			if (anInt1982 > 0) {
				aShortArray1977 = new short[anInt1982];
				aShortArray1985 = new short[anInt1982];
				aShortArray1986 = new short[anInt1982];
				if (i_28_ > 0) {
					anIntArray1987 = new int[i_28_];
					anIntArray1988 = new int[i_28_];
					anIntArray1955 = new int[i_28_];
					aByteArray1954 = new byte[i_28_];
					aByteArray1994 = new byte[i_28_];
					anIntArray1960 = new int[i_28_];
				}
				if (i_29_ > 0) {
					anIntArray1970 = new int[i_29_];
					anIntArray1992 = new int[i_29_];
				}
			}
			class523_sub34.anInt10661 = i_33_ * 189765723;
			class523_sub34_2_.anInt10661 = i_44_ * 189765723;
			class523_sub34_3_.anInt10661 = i_45_ * 189765723;
			class523_sub34_4_.anInt10661 = i_46_ * 189765723;
			class523_sub34_5_.anInt10661 = i_38_ * 189765723;
			int i_62_ = 0;
			int i_63_ = 0;
			int i_64_ = 0;
			for (int i_65_ = 0; i_65_ < anInt1953; i_65_++) {
				int i_66_ = class523_sub34.readUnsignedByte(-1266641275);
				int i_67_ = 0;
				if ((i_66_ & 0x1) != 0)
					i_67_ = class523_sub34_2_.method16487((byte) -6);
				int i_68_ = 0;
				if ((i_66_ & 0x2) != 0)
					i_68_ = class523_sub34_3_.method16487((byte) -100);
				int i_69_ = 0;
				if ((i_66_ & 0x4) != 0)
					i_69_ = class523_sub34_4_.method16487((byte) -109);
				anIntArray1981[i_65_] = i_62_ + i_67_;
				anIntArray1973[i_65_] = i_63_ + i_68_;
				anIntArray1957[i_65_] = i_64_ + i_69_;
				i_62_ = anIntArray1981[i_65_];
				i_63_ = anIntArray1973[i_65_];
				i_64_ = anIntArray1957[i_65_];
				if (i_19_ == 1) {
					if (bool_11_)
						anIntArray1956[i_65_] = class523_sub34_5_.method16301((short) -9898);
					else {
						anIntArray1956[i_65_] = class523_sub34_5_.readUnsignedByte(-574524249);
						if (anIntArray1956[i_65_] == 255)
							anIntArray1956[i_65_] = -1;
					}
				}
			}
			if (anInt1961 > 0) {
				class523_sub34.anInt10661 = i_56_ * 189765723;
				class523_sub34_2_.anInt10661 = i_57_ * 189765723;
				class523_sub34_3_.anInt10661 = i_58_ * 189765723;
				anIntArray1958 = new int[anInt1953];
				int i_70_ = 0;
				int i_71_ = 0;
				for (/**/; i_70_ < anInt1953; i_70_++) {
					anIntArray1958[i_70_] = i_71_;
					i_71_ += class523_sub34.readUnsignedByte(1691915749);
				}
				aByteArray1968 = new byte[anInt1964];
				aByteArray1969 = new byte[anInt1964];
				aByteArray1990 = new byte[anInt1964];
				aFloatArray1962 = new float[anInt1961];
				aFloatArray1963 = new float[anInt1961];
				for (i_70_ = 0; i_70_ < anInt1961; i_70_++) {
					aFloatArray1962[i_70_] = ((float) class523_sub34_2_.readShort(1751907492) / 4096.0F);
					aFloatArray1963[i_70_] = ((float) class523_sub34_3_.readShort(-615259199) / 4096.0F);
				}
			}
			class523_sub34.anInt10661 = i_43_ * 189765723;
			class523_sub34_2_.anInt10661 = i_34_ * 189765723;
			class523_sub34_3_.anInt10661 = i_36_ * 189765723;
			class523_sub34_4_.anInt10661 = i_39_ * 189765723;
			class523_sub34_5_.anInt10661 = i_37_ * 189765723;
			class523_sub34_6_.anInt10661 = i_41_ * 189765723;
			class523_sub34_7_.anInt10661 = i_42_ * 189765723;
			for (int i_72_ = 0; i_72_ < anInt1964; i_72_++) {
				aShortArray1974[i_72_] = (short) class523_sub34.readUnsignedShort(-318153448);
				if (bool)
					aByteArray1971[i_72_] = class523_sub34_2_.readByte((short) -15666);
				if (i_15_ == 255)
					aByteArray1972[i_72_] = class523_sub34_3_.readByte((short) -9028);
				if (i_16_ == 1)
					aByteArray1975[i_72_] = class523_sub34_4_.readByte((short) 994);
				if (i_17_ == 1) {
					if (bool_12_)
						anIntArray1993[i_72_] = class523_sub34_5_.method16301((short) -2712);
					else {
						anIntArray1993[i_72_] = class523_sub34_5_.readUnsignedByte(-1642872831);
						if (anIntArray1993[i_72_] == 255)
							anIntArray1993[i_72_] = -1;
					}
				}
				if (i_18_ == 1)
					aShortArray1959[i_72_] = (short) (class523_sub34_6_.readUnsignedShort(-670615241) - 1);
				if (aShortArray1989 != null) {
					if (aShortArray1959[i_72_] != -1) {
						if (anInt1952 >= 16)
							aShortArray1989[i_72_] = (short) (class523_sub34_7_.readUnsignedSmart(368514876) - 1);
						else
							aShortArray1989[i_72_] = (short) (class523_sub34_7_.readUnsignedByte(-1138000470) - 1);
					} else
						aShortArray1989[i_72_] = (short) -1;
				}
			}
			anInt1991 = -1;
			class523_sub34.anInt10661 = i_40_ * 189765723;
			class523_sub34_2_.anInt10661 = i_35_ * 189765723;
			class523_sub34_3_.anInt10661 = i_55_ * 189765723;
			method3481(class523_sub34, class523_sub34_2_, class523_sub34_3_);
			class523_sub34.anInt10661 = i_47_ * 189765723;
			class523_sub34_2_.anInt10661 = i_48_ * 189765723;
			class523_sub34_3_.anInt10661 = i_50_ * 189765723;
			class523_sub34_4_.anInt10661 = i_51_ * 189765723;
			class523_sub34_5_.anInt10661 = i_52_ * 189765723;
			class523_sub34_6_.anInt10661 = i_53_ * 189765723;
			method3482(class523_sub34, class523_sub34_2_, class523_sub34_3_, class523_sub34_4_, class523_sub34_5_, class523_sub34_6_);
			class523_sub34.anInt10661 = i_54_ * 189765723;
			if (bool_9_) {
				int i_73_ = class523_sub34.readUnsignedByte(-522046165);
				if (i_73_ > 0) {
					aClass184Array1995 = new Class184[i_73_];
					for (int i_74_ = 0; i_74_ < i_73_; i_74_++) {
						int i_75_ = class523_sub34.readUnsignedShort(-986643554);
						int i_76_ = class523_sub34.readUnsignedShort(-1095510898);
						byte i_77_;
						if (i_15_ == 255)
							i_77_ = aByteArray1972[i_76_];
						else
							i_77_ = (byte) i_15_;
						aClass184Array1995[i_74_] = new Class184(i_75_, i_76_, aShortArray1949[i_76_], aShortArray1966[i_76_], aShortArray1967[i_76_], i_77_);
					}
				}
				int i_78_ = class523_sub34.readUnsignedByte(-1831369358);
				if (i_78_ > 0) {
					aClass143Array1996 = new Class143[i_78_];
					for (int i_79_ = 0; i_79_ < i_78_; i_79_++) {
						int i_80_ = class523_sub34.readUnsignedShort(-1613611059);
						int i_81_ = class523_sub34.readUnsignedShort(-1503161804);
						aClass143Array1996[i_79_] = new Class143(i_80_, i_81_);
					}
				}
			}
			if (bool_10_) {
				int i_82_ = class523_sub34.readUnsignedByte(806077332);
				if (i_82_ > 0) {
					aClass176Array1997 = new Class176[i_82_];
					for (int i_83_ = 0; i_83_ < i_82_; i_83_++) {
						int i_84_ = class523_sub34.readUnsignedShort(-1879859785);
						int i_85_ = class523_sub34.readUnsignedShort(-107677740);
						int i_86_;
						if (bool_13_)
							i_86_ = class523_sub34.method16301((short) -14911);
						else {
							i_86_ = class523_sub34.readUnsignedByte(-1587195945);
							if (i_86_ == 255)
								i_86_ = -1;
						}
						byte i_87_ = class523_sub34.readByte((short) -10851);
						aClass176Array1997[i_83_] = new Class176(i_84_, i_85_, i_86_, i_87_);
					}
				}
			}
		}
	}

	public Class179(int i, int i_88_, int i_89_) {
		anInt1964 = 0;
		aByte1978 = (byte) 0;
		anInt1982 = 0;
		anIntArray1981 = new int[i];
		anIntArray1973 = new int[i];
		anIntArray1957 = new int[i];
		anIntArray1956 = new int[i];
		aShortArray1949 = new short[i_88_];
		aShortArray1966 = new short[i_88_];
		aShortArray1967 = new short[i_88_];
		aByteArray1971 = new byte[i_88_];
		aByteArray1972 = new byte[i_88_];
		aByteArray1975 = new byte[i_88_];
		aShortArray1989 = new short[i_88_];
		aShortArray1974 = new short[i_88_];
		aShortArray1959 = new short[i_88_];
		anIntArray1993 = new int[i_88_];
		if (i_89_ > 0) {
			aByteArray1983 = new byte[i_89_];
			aShortArray1977 = new short[i_89_];
			aShortArray1985 = new short[i_89_];
			aShortArray1986 = new short[i_89_];
			anIntArray1987 = new int[i_89_];
			anIntArray1988 = new int[i_89_];
			anIntArray1955 = new int[i_89_];
			aByteArray1954 = new byte[i_89_];
			aByteArray1994 = new byte[i_89_];
			anIntArray1960 = new int[i_89_];
			anIntArray1970 = new int[i_89_];
			anIntArray1992 = new int[i_89_];
		}
	}

	public void method3479(int i, int i_90_, int i_91_) {
		if (i_91_ != 0) {
			int i_92_ = Class433.anIntArray4880[i_91_];
			int i_93_ = Class433.anIntArray4881[i_91_];
			for (int i_94_ = 0; i_94_ < anInt1953; i_94_++) {
				int i_95_ = ((anIntArray1973[i_94_] * i_92_ + anIntArray1981[i_94_] * i_93_) >> 14);
				anIntArray1973[i_94_] = (anIntArray1973[i_94_] * i_93_ - anIntArray1981[i_94_] * i_92_) >> 14;
				anIntArray1981[i_94_] = i_95_;
			}
		}
		if (i != 0) {
			int i_96_ = Class433.anIntArray4880[i];
			int i_97_ = Class433.anIntArray4881[i];
			for (int i_98_ = 0; i_98_ < anInt1953; i_98_++) {
				int i_99_ = ((anIntArray1973[i_98_] * i_97_ - anIntArray1957[i_98_] * i_96_) >> 14);
				anIntArray1957[i_98_] = (anIntArray1973[i_98_] * i_96_ + anIntArray1957[i_98_] * i_97_) >> 14;
				anIntArray1973[i_98_] = i_99_;
			}
		}
		if (i_90_ != 0) {
			int i_100_ = Class433.anIntArray4880[i_90_];
			int i_101_ = Class433.anIntArray4881[i_90_];
			for (int i_102_ = 0; i_102_ < anInt1953; i_102_++) {
				int i_103_ = ((anIntArray1957[i_102_] * i_100_ + anIntArray1981[i_102_] * i_101_) >> 14);
				anIntArray1957[i_102_] = (anIntArray1957[i_102_] * i_101_ - anIntArray1981[i_102_] * i_100_) >> 14;
				anIntArray1981[i_102_] = i_103_;
			}
		}
	}

	final int method3480(Class179 class179_104_, int i, short i_105_) {
		int i_106_ = class179_104_.anIntArray1981[i];
		int i_107_ = class179_104_.anIntArray1973[i];
		int i_108_ = class179_104_.anIntArray1957[i];
		for (int i_109_ = 0; i_109_ < anInt1953; i_109_++) {
			if (i_106_ == anIntArray1981[i_109_] && i_107_ == anIntArray1973[i_109_] && i_108_ == anIntArray1957[i_109_]) {
				aShortArray1965[i_109_] |= i_105_;
				return i_109_;
			}
		}
		anIntArray1981[anInt1953] = i_106_;
		anIntArray1973[anInt1953] = i_107_;
		anIntArray1957[anInt1953] = i_108_;
		aShortArray1965[anInt1953] = i_105_;
		anIntArray1956[anInt1953] = (class179_104_.anIntArray1956 != null ? class179_104_.anIntArray1956[i] : -1);
		return anInt1953++;
	}

	void method3481(Class523_Sub34 class523_sub34, Class523_Sub34 class523_sub34_110_, Class523_Sub34 class523_sub34_111_) {
		short i = 0;
		short i_112_ = 0;
		short i_113_ = 0;
		int i_114_ = 0;
		for (int i_115_ = 0; i_115_ < anInt1964; i_115_++) {
			int i_116_ = class523_sub34_110_.readUnsignedByte(-1310515595);
			int i_117_ = i_116_ & 0x7;
			if (i_117_ == 1) {
				aShortArray1949[i_115_] = i = (short) (class523_sub34.method16487((byte) -122) + i_114_);
				i_114_ = i;
				aShortArray1966[i_115_] = i_112_ = (short) (class523_sub34.method16487((byte) -37) + i_114_);
				i_114_ = i_112_;
				aShortArray1967[i_115_] = i_113_ = (short) (class523_sub34.method16487((byte) -81) + i_114_);
				i_114_ = i_113_;
				if (i > anInt1991)
					anInt1991 = i;
				if (i_112_ > anInt1991)
					anInt1991 = i_112_;
				if (i_113_ > anInt1991)
					anInt1991 = i_113_;
			}
			if (i_117_ == 2) {
				i_112_ = i_113_;
				i_113_ = (short) (class523_sub34.method16487((byte) -35) + i_114_);
				i_114_ = i_113_;
				aShortArray1949[i_115_] = i;
				aShortArray1966[i_115_] = i_112_;
				aShortArray1967[i_115_] = i_113_;
				if (i_113_ > anInt1991)
					anInt1991 = i_113_;
			}
			if (i_117_ == 3) {
				i = i_113_;
				i_113_ = (short) (class523_sub34.method16487((byte) -50) + i_114_);
				i_114_ = i_113_;
				aShortArray1949[i_115_] = i;
				aShortArray1966[i_115_] = i_112_;
				aShortArray1967[i_115_] = i_113_;
				if (i_113_ > anInt1991)
					anInt1991 = i_113_;
			}
			if (i_117_ == 4) {
				short i_118_ = i;
				i = i_112_;
				i_112_ = i_118_;
				i_113_ = (short) (class523_sub34.method16487((byte) 13) + i_114_);
				i_114_ = i_113_;
				aShortArray1949[i_115_] = i;
				aShortArray1966[i_115_] = i_112_;
				aShortArray1967[i_115_] = i_113_;
				if (i_113_ > anInt1991)
					anInt1991 = i_113_;
			}
			if (anInt1961 > 0 && (i_116_ & 0x8) != 0) {
				aByteArray1968[i_115_] = (byte) class523_sub34_111_.readUnsignedByte(1063157054);
				aByteArray1969[i_115_] = (byte) class523_sub34_111_.readUnsignedByte(518853656);
				aByteArray1990[i_115_] = (byte) class523_sub34_111_.readUnsignedByte(-1681351764);
			}
		}
		anInt1991++;
	}

	void method3482(Class523_Sub34 class523_sub34, Class523_Sub34 class523_sub34_119_, Class523_Sub34 class523_sub34_120_, Class523_Sub34 class523_sub34_121_, Class523_Sub34 class523_sub34_122_, Class523_Sub34 class523_sub34_123_) {
		for (int i = 0; i < anInt1982; i++) {
			int i_124_ = aByteArray1983[i] & 0xff;
			if (i_124_ == 0) {
				aShortArray1977[i] = (short) class523_sub34.readUnsignedShort(-48583428);
				aShortArray1985[i] = (short) class523_sub34.readUnsignedShort(-1132859314);
				aShortArray1986[i] = (short) class523_sub34.readUnsignedShort(-1468262560);
			}
			if (i_124_ == 1) {
				aShortArray1977[i] = (short) class523_sub34_119_.readUnsignedShort(-225451768);
				aShortArray1985[i] = (short) class523_sub34_119_.readUnsignedShort(-82096838);
				aShortArray1986[i] = (short) class523_sub34_119_.readUnsignedShort(-1279626831);
				if (anInt1952 < 15) {
					anIntArray1987[i] = class523_sub34_120_.readUnsignedShort(-1077534532);
					if (anInt1952 < 14)
						anIntArray1988[i] = class523_sub34_120_.readUnsignedShort(-2001969727);
					else
						anIntArray1988[i] = class523_sub34_120_.read24BitInt(-152178685);
					anIntArray1955[i] = class523_sub34_120_.readUnsignedShort(-1549012987);
				} else {
					anIntArray1987[i] = class523_sub34_120_.read24BitInt(1144960566);
					anIntArray1988[i] = class523_sub34_120_.read24BitInt(576096054);
					anIntArray1955[i] = class523_sub34_120_.read24BitInt(-1802436248);
				}
				aByteArray1954[i] = class523_sub34_121_.readByte((short) 490);
				aByteArray1994[i] = class523_sub34_122_.readByte((short) -1089);
				anIntArray1960[i] = class523_sub34_123_.readByte((short) 546);
			}
			if (i_124_ == 2) {
				aShortArray1977[i] = (short) class523_sub34_119_.readUnsignedShort(-236548689);
				aShortArray1985[i] = (short) class523_sub34_119_.readUnsignedShort(-414743642);
				aShortArray1986[i] = (short) class523_sub34_119_.readUnsignedShort(-1258607948);
				if (anInt1952 < 15) {
					anIntArray1987[i] = class523_sub34_120_.readUnsignedShort(-1718249208);
					if (anInt1952 < 14)
						anIntArray1988[i] = class523_sub34_120_.readUnsignedShort(-1375290222);
					else
						anIntArray1988[i] = class523_sub34_120_.read24BitInt(934330197);
					anIntArray1955[i] = class523_sub34_120_.readUnsignedShort(-2088185959);
				} else {
					anIntArray1987[i] = class523_sub34_120_.read24BitInt(-863153976);
					anIntArray1988[i] = class523_sub34_120_.read24BitInt(-2007409960);
					anIntArray1955[i] = class523_sub34_120_.read24BitInt(-1923728886);
				}
				aByteArray1954[i] = class523_sub34_121_.readByte((short) 697);
				aByteArray1994[i] = class523_sub34_122_.readByte((short) -20825);
				anIntArray1960[i] = class523_sub34_123_.readByte((short) -8304);
				anIntArray1970[i] = class523_sub34_123_.readByte((short) 1026);
				anIntArray1992[i] = class523_sub34_123_.readByte((short) -7403);
			}
			if (i_124_ == 3) {
				aShortArray1977[i] = (short) class523_sub34_119_.readUnsignedShort(-1347075286);
				aShortArray1985[i] = (short) class523_sub34_119_.readUnsignedShort(-1633003948);
				aShortArray1986[i] = (short) class523_sub34_119_.readUnsignedShort(-1790812628);
				if (anInt1952 < 15) {
					anIntArray1987[i] = class523_sub34_120_.readUnsignedShort(-817797433);
					if (anInt1952 < 14)
						anIntArray1988[i] = class523_sub34_120_.readUnsignedShort(-1288706399);
					else
						anIntArray1988[i] = class523_sub34_120_.read24BitInt(386320033);
					anIntArray1955[i] = class523_sub34_120_.readUnsignedShort(-1327822485);
				} else {
					anIntArray1987[i] = class523_sub34_120_.read24BitInt(-1604507570);
					anIntArray1988[i] = class523_sub34_120_.read24BitInt(804993861);
					anIntArray1955[i] = class523_sub34_120_.read24BitInt(390014451);
				}
				aByteArray1954[i] = class523_sub34_121_.readByte((short) -22774);
				aByteArray1994[i] = class523_sub34_122_.readByte((short) -15635);
				anIntArray1960[i] = class523_sub34_123_.readByte((short) -16954);
			}
		}
	}

	public int method3483(int i, int i_125_, int i_126_) {
		for (int i_127_ = 0; i_127_ < anInt1953; i_127_++) {
			if (anIntArray1981[i_127_] == i && anIntArray1973[i_127_] == i_125_ && anIntArray1957[i_127_] == i_126_)
				return i_127_;
		}
		anIntArray1981[anInt1953] = i;
		anIntArray1973[anInt1953] = i_125_;
		anIntArray1957[anInt1953] = i_126_;
		anInt1991 = anInt1953 + 1;
		return anInt1953++;
	}

	public int method3484(int i, int i_128_, int i_129_, byte i_130_, byte i_131_, short i_132_, byte i_133_, short i_134_) {
		aShortArray1949[anInt1964] = (short) i;
		aShortArray1966[anInt1964] = (short) i_128_;
		aShortArray1967[anInt1964] = (short) i_129_;
		aByteArray1971[anInt1964] = i_130_;
		aShortArray1989[anInt1964] = (short) i_131_;
		aShortArray1974[anInt1964] = i_132_;
		aByteArray1975[anInt1964] = i_133_;
		aShortArray1959[anInt1964] = i_134_;
		return anInt1964++;
	}

	public static Class179 method3485(Class472 class472, int i, int i_135_) {
		byte[] is = class472.method7688(i, i_135_, -1112654386);
		if (is == null)
			return null;
		return new Class179(is);
	}

	void method3486(Class523_Sub34 class523_sub34, Class523_Sub34 class523_sub34_136_, Class523_Sub34 class523_sub34_137_, Class523_Sub34 class523_sub34_138_, Class523_Sub34 class523_sub34_139_, Class523_Sub34 class523_sub34_140_) {
		for (int i = 0; i < anInt1982; i++) {
			int i_141_ = aByteArray1983[i] & 0xff;
			if (i_141_ == 0) {
				aShortArray1977[i] = (short) class523_sub34.readUnsignedShort(-435999081);
				aShortArray1985[i] = (short) class523_sub34.readUnsignedShort(-58001251);
				aShortArray1986[i] = (short) class523_sub34.readUnsignedShort(-794970084);
			}
			if (i_141_ == 1) {
				aShortArray1977[i] = (short) class523_sub34_136_.readUnsignedShort(-966568514);
				aShortArray1985[i] = (short) class523_sub34_136_.readUnsignedShort(-894011359);
				aShortArray1986[i] = (short) class523_sub34_136_.readUnsignedShort(-1987728861);
				if (anInt1952 < 15) {
					anIntArray1987[i] = class523_sub34_137_.readUnsignedShort(-582896232);
					if (anInt1952 < 14)
						anIntArray1988[i] = class523_sub34_137_.readUnsignedShort(-1097719579);
					else
						anIntArray1988[i] = class523_sub34_137_.read24BitInt(1942534541);
					anIntArray1955[i] = class523_sub34_137_.readUnsignedShort(-1506569134);
				} else {
					anIntArray1987[i] = class523_sub34_137_.read24BitInt(544828470);
					anIntArray1988[i] = class523_sub34_137_.read24BitInt(-550891521);
					anIntArray1955[i] = class523_sub34_137_.read24BitInt(-812835640);
				}
				aByteArray1954[i] = class523_sub34_138_.readByte((short) -23718);
				aByteArray1994[i] = class523_sub34_139_.readByte((short) -22541);
				anIntArray1960[i] = class523_sub34_140_.readByte((short) -25859);
			}
			if (i_141_ == 2) {
				aShortArray1977[i] = (short) class523_sub34_136_.readUnsignedShort(-779469144);
				aShortArray1985[i] = (short) class523_sub34_136_.readUnsignedShort(-1430093271);
				aShortArray1986[i] = (short) class523_sub34_136_.readUnsignedShort(-1564876175);
				if (anInt1952 < 15) {
					anIntArray1987[i] = class523_sub34_137_.readUnsignedShort(-1232406352);
					if (anInt1952 < 14)
						anIntArray1988[i] = class523_sub34_137_.readUnsignedShort(-2039447677);
					else
						anIntArray1988[i] = class523_sub34_137_.read24BitInt(-1911349522);
					anIntArray1955[i] = class523_sub34_137_.readUnsignedShort(-1953816503);
				} else {
					anIntArray1987[i] = class523_sub34_137_.read24BitInt(1399729616);
					anIntArray1988[i] = class523_sub34_137_.read24BitInt(726546480);
					anIntArray1955[i] = class523_sub34_137_.read24BitInt(-1253533251);
				}
				aByteArray1954[i] = class523_sub34_138_.readByte((short) -17962);
				aByteArray1994[i] = class523_sub34_139_.readByte((short) -28290);
				anIntArray1960[i] = class523_sub34_140_.readByte((short) -23869);
				anIntArray1970[i] = class523_sub34_140_.readByte((short) -32087);
				anIntArray1992[i] = class523_sub34_140_.readByte((short) -14933);
			}
			if (i_141_ == 3) {
				aShortArray1977[i] = (short) class523_sub34_136_.readUnsignedShort(-1743546524);
				aShortArray1985[i] = (short) class523_sub34_136_.readUnsignedShort(-1739786675);
				aShortArray1986[i] = (short) class523_sub34_136_.readUnsignedShort(-1830265617);
				if (anInt1952 < 15) {
					anIntArray1987[i] = class523_sub34_137_.readUnsignedShort(-1361624359);
					if (anInt1952 < 14)
						anIntArray1988[i] = class523_sub34_137_.readUnsignedShort(-706254996);
					else
						anIntArray1988[i] = class523_sub34_137_.read24BitInt(-1176800831);
					anIntArray1955[i] = class523_sub34_137_.readUnsignedShort(-79871104);
				} else {
					anIntArray1987[i] = class523_sub34_137_.read24BitInt(-673234899);
					anIntArray1988[i] = class523_sub34_137_.read24BitInt(-177036525);
					anIntArray1955[i] = class523_sub34_137_.read24BitInt(1589767097);
				}
				aByteArray1954[i] = class523_sub34_138_.readByte((short) -32104);
				aByteArray1994[i] = class523_sub34_139_.readByte((short) -14682);
				anIntArray1960[i] = class523_sub34_140_.readByte((short) -31219);
			}
		}
	}

	public static Class179 method3487(Class472 class472, int i, int i_142_) {
		byte[] is = class472.method7688(i, i_142_, -800562466);
		if (is == null)
			return null;
		return new Class179(is);
	}

	public int[][] method3488() {
		int[] is = new int[256];
		int i = 0;
		for (int i_143_ = 0; i_143_ < anInt1964; i_143_++) {
			int i_144_ = anIntArray1993[i_143_];
			if (i_144_ >= 0) {
				is[i_144_]++;
				if (i_144_ > i)
					i = i_144_;
			}
		}
		int[][] is_145_ = new int[i + 1][];
		for (int i_146_ = 0; i_146_ <= i; i_146_++) {
			is_145_[i_146_] = new int[is[i_146_]];
			is[i_146_] = 0;
		}
		for (int i_147_ = 0; i_147_ < anInt1964; i_147_++) {
			int i_148_ = anIntArray1993[i_147_];
			if (i_148_ >= 0)
				is_145_[i_148_][is[i_148_]++] = i_147_;
		}
		return is_145_;
	}

	public int[][] method3489() {
		int[] is = new int[256];
		int i = 0;
		for (int i_149_ = 0; i_149_ < aClass176Array1997.length; i_149_++) {
			int i_150_ = aClass176Array1997[i_149_].anInt1859 * 1357208487;
			if (i_150_ >= 0) {
				is[i_150_]++;
				if (i_150_ > i)
					i = i_150_;
			}
		}
		int[][] is_151_ = new int[i + 1][];
		for (int i_152_ = 0; i_152_ <= i; i_152_++) {
			is_151_[i_152_] = new int[is[i_152_]];
			is[i_152_] = 0;
		}
		for (int i_153_ = 0; i_153_ < aClass176Array1997.length; i_153_++) {
			int i_154_ = aClass176Array1997[i_153_].anInt1859 * 1357208487;
			if (i_154_ >= 0)
				is_151_[i_154_][is[i_154_]++] = i_153_;
		}
		return is_151_;
	}

	public void method3490(short i, short i_155_) {
		for (int i_156_ = 0; i_156_ < anInt1964; i_156_++) {
			if (aShortArray1974[i_156_] == i)
				aShortArray1974[i_156_] = i_155_;
		}
	}

	public void method3491(short i, short i_157_) {
		if (aShortArray1959 != null) {
			for (int i_158_ = 0; i_158_ < anInt1964; i_158_++) {
				if (aShortArray1959[i_158_] == i)
					aShortArray1959[i_158_] = i_157_;
			}
		}
	}

	public void method3492(int i, int i_159_, int i_160_) {
		for (int i_161_ = 0; i_161_ < anInt1953; i_161_++) {
			anIntArray1981[i_161_] += i;
			anIntArray1973[i_161_] += i_159_;
			anIntArray1957[i_161_] += i_160_;
		}
	}

	public void method3493(int i, int i_162_, int i_163_) {
		if (i_163_ != 0) {
			int i_164_ = Class433.anIntArray4880[i_163_];
			int i_165_ = Class433.anIntArray4881[i_163_];
			for (int i_166_ = 0; i_166_ < anInt1953; i_166_++) {
				int i_167_ = ((anIntArray1973[i_166_] * i_164_ + anIntArray1981[i_166_] * i_165_) >> 14);
				anIntArray1973[i_166_] = (anIntArray1973[i_166_] * i_165_ - anIntArray1981[i_166_] * i_164_) >> 14;
				anIntArray1981[i_166_] = i_167_;
			}
		}
		if (i != 0) {
			int i_168_ = Class433.anIntArray4880[i];
			int i_169_ = Class433.anIntArray4881[i];
			for (int i_170_ = 0; i_170_ < anInt1953; i_170_++) {
				int i_171_ = ((anIntArray1973[i_170_] * i_169_ - anIntArray1957[i_170_] * i_168_) >> 14);
				anIntArray1957[i_170_] = (anIntArray1973[i_170_] * i_168_ + anIntArray1957[i_170_] * i_169_) >> 14;
				anIntArray1973[i_170_] = i_171_;
			}
		}
		if (i_162_ != 0) {
			int i_172_ = Class433.anIntArray4880[i_162_];
			int i_173_ = Class433.anIntArray4881[i_162_];
			for (int i_174_ = 0; i_174_ < anInt1953; i_174_++) {
				int i_175_ = ((anIntArray1957[i_174_] * i_172_ + anIntArray1981[i_174_] * i_173_) >> 14);
				anIntArray1957[i_174_] = (anIntArray1957[i_174_] * i_173_ - anIntArray1981[i_174_] * i_172_) >> 14;
				anIntArray1981[i_174_] = i_175_;
			}
		}
	}

	public void method3494(int i) {
		for (int i_176_ = 0; i_176_ < anInt1953; i_176_++) {
			anIntArray1981[i_176_] <<= i;
			anIntArray1973[i_176_] <<= i;
			anIntArray1957[i_176_] <<= i;
		}
		if (anInt1982 > 0 && anIntArray1987 != null) {
			for (int i_177_ = 0; i_177_ < anIntArray1987.length; i_177_++) {
				anIntArray1987[i_177_] <<= i;
				anIntArray1988[i_177_] <<= i;
				if (aByteArray1983[i_177_] != 1)
					anIntArray1955[i_177_] <<= i;
			}
		}
	}

	public void method3495(float f) {
		for (int i = 0; i < anInt1953; i++) {
			anIntArray1981[i] *= f;
			anIntArray1973[i] *= f;
			anIntArray1957[i] *= f;
		}
		if (anInt1982 > 0 && anIntArray1987 != null) {
			for (int i = 0; i < anIntArray1987.length; i++) {
				anIntArray1987[i] *= f;
				anIntArray1988[i] *= f;
				if (aByteArray1983[i] != 1)
					anIntArray1955[i] *= f;
			}
		}
	}

	public byte method3496(short i, short i_178_, short i_179_) {
		if (anInt1982 >= 255)
			throw new IllegalStateException();
		aByteArray1983[anInt1982] = (byte) 0;
		aShortArray1977[anInt1982] = i;
		aShortArray1985[anInt1982] = i_178_;
		aShortArray1986[anInt1982] = i_179_;
		return (byte) anInt1982++;
	}

	public void method3497(short i, short i_180_) {
		if (aShortArray1959 != null) {
			for (int i_181_ = 0; i_181_ < anInt1964; i_181_++) {
				if (aShortArray1959[i_181_] == i)
					aShortArray1959[i_181_] = i_180_;
			}
		}
	}

	public byte method3498(short i, short i_182_, short i_183_) {
		if (anInt1982 >= 255)
			throw new IllegalStateException();
		aByteArray1983[anInt1982] = (byte) 0;
		aShortArray1977[anInt1982] = i;
		aShortArray1985[anInt1982] = i_182_;
		aShortArray1986[anInt1982] = i_183_;
		return (byte) anInt1982++;
	}

	public int method3499(int i, int i_184_, int i_185_, byte i_186_, byte i_187_, short i_188_, byte i_189_, short i_190_) {
		aShortArray1949[anInt1964] = (short) i;
		aShortArray1966[anInt1964] = (short) i_184_;
		aShortArray1967[anInt1964] = (short) i_185_;
		aByteArray1971[anInt1964] = i_186_;
		aShortArray1989[anInt1964] = (short) i_187_;
		aShortArray1974[anInt1964] = i_188_;
		aByteArray1975[anInt1964] = i_189_;
		aShortArray1959[anInt1964] = i_190_;
		return anInt1964++;
	}

	final int method3500(Class179 class179_191_, int i, short i_192_) {
		int i_193_ = class179_191_.anIntArray1981[i];
		int i_194_ = class179_191_.anIntArray1973[i];
		int i_195_ = class179_191_.anIntArray1957[i];
		for (int i_196_ = 0; i_196_ < anInt1953; i_196_++) {
			if (i_193_ == anIntArray1981[i_196_] && i_194_ == anIntArray1973[i_196_] && i_195_ == anIntArray1957[i_196_]) {
				aShortArray1965[i_196_] |= i_192_;
				return i_196_;
			}
		}
		anIntArray1981[anInt1953] = i_193_;
		anIntArray1973[anInt1953] = i_194_;
		anIntArray1957[anInt1953] = i_195_;
		aShortArray1965[anInt1953] = i_192_;
		anIntArray1956[anInt1953] = (class179_191_.anIntArray1956 != null ? class179_191_.anIntArray1956[i] : -1);
		return anInt1953++;
	}

	void method3501(Class523_Sub34 class523_sub34, Class523_Sub34 class523_sub34_197_, Class523_Sub34 class523_sub34_198_) {
		short i = 0;
		short i_199_ = 0;
		short i_200_ = 0;
		int i_201_ = 0;
		for (int i_202_ = 0; i_202_ < anInt1964; i_202_++) {
			int i_203_ = class523_sub34_197_.readUnsignedByte(-408221137);
			int i_204_ = i_203_ & 0x7;
			if (i_204_ == 1) {
				aShortArray1949[i_202_] = i = (short) (class523_sub34.method16487((byte) -16) + i_201_);
				i_201_ = i;
				aShortArray1966[i_202_] = i_199_ = (short) (class523_sub34.method16487((byte) -108) + i_201_);
				i_201_ = i_199_;
				aShortArray1967[i_202_] = i_200_ = (short) (class523_sub34.method16487((byte) -61) + i_201_);
				i_201_ = i_200_;
				if (i > anInt1991)
					anInt1991 = i;
				if (i_199_ > anInt1991)
					anInt1991 = i_199_;
				if (i_200_ > anInt1991)
					anInt1991 = i_200_;
			}
			if (i_204_ == 2) {
				i_199_ = i_200_;
				i_200_ = (short) (class523_sub34.method16487((byte) -111) + i_201_);
				i_201_ = i_200_;
				aShortArray1949[i_202_] = i;
				aShortArray1966[i_202_] = i_199_;
				aShortArray1967[i_202_] = i_200_;
				if (i_200_ > anInt1991)
					anInt1991 = i_200_;
			}
			if (i_204_ == 3) {
				i = i_200_;
				i_200_ = (short) (class523_sub34.method16487((byte) -10) + i_201_);
				i_201_ = i_200_;
				aShortArray1949[i_202_] = i;
				aShortArray1966[i_202_] = i_199_;
				aShortArray1967[i_202_] = i_200_;
				if (i_200_ > anInt1991)
					anInt1991 = i_200_;
			}
			if (i_204_ == 4) {
				short i_205_ = i;
				i = i_199_;
				i_199_ = i_205_;
				i_200_ = (short) (class523_sub34.method16487((byte) 10) + i_201_);
				i_201_ = i_200_;
				aShortArray1949[i_202_] = i;
				aShortArray1966[i_202_] = i_199_;
				aShortArray1967[i_202_] = i_200_;
				if (i_200_ > anInt1991)
					anInt1991 = i_200_;
			}
			if (anInt1961 > 0 && (i_203_ & 0x8) != 0) {
				aByteArray1968[i_202_] = (byte) class523_sub34_198_.readUnsignedByte(67978130);
				aByteArray1969[i_202_] = (byte) class523_sub34_198_.readUnsignedByte(1760489244);
				aByteArray1990[i_202_] = (byte) class523_sub34_198_.readUnsignedByte(1607807389);
			}
		}
		anInt1991++;
	}

	void method3502(Class523_Sub34 class523_sub34, Class523_Sub34 class523_sub34_206_, Class523_Sub34 class523_sub34_207_) {
		short i = 0;
		short i_208_ = 0;
		short i_209_ = 0;
		int i_210_ = 0;
		for (int i_211_ = 0; i_211_ < anInt1964; i_211_++) {
			int i_212_ = class523_sub34_206_.readUnsignedByte(901443661);
			int i_213_ = i_212_ & 0x7;
			if (i_213_ == 1) {
				aShortArray1949[i_211_] = i = (short) (class523_sub34.method16487((byte) -92) + i_210_);
				i_210_ = i;
				aShortArray1966[i_211_] = i_208_ = (short) (class523_sub34.method16487((byte) -59) + i_210_);
				i_210_ = i_208_;
				aShortArray1967[i_211_] = i_209_ = (short) (class523_sub34.method16487((byte) -66) + i_210_);
				i_210_ = i_209_;
				if (i > anInt1991)
					anInt1991 = i;
				if (i_208_ > anInt1991)
					anInt1991 = i_208_;
				if (i_209_ > anInt1991)
					anInt1991 = i_209_;
			}
			if (i_213_ == 2) {
				i_208_ = i_209_;
				i_209_ = (short) (class523_sub34.method16487((byte) -126) + i_210_);
				i_210_ = i_209_;
				aShortArray1949[i_211_] = i;
				aShortArray1966[i_211_] = i_208_;
				aShortArray1967[i_211_] = i_209_;
				if (i_209_ > anInt1991)
					anInt1991 = i_209_;
			}
			if (i_213_ == 3) {
				i = i_209_;
				i_209_ = (short) (class523_sub34.method16487((byte) -92) + i_210_);
				i_210_ = i_209_;
				aShortArray1949[i_211_] = i;
				aShortArray1966[i_211_] = i_208_;
				aShortArray1967[i_211_] = i_209_;
				if (i_209_ > anInt1991)
					anInt1991 = i_209_;
			}
			if (i_213_ == 4) {
				short i_214_ = i;
				i = i_208_;
				i_208_ = i_214_;
				i_209_ = (short) (class523_sub34.method16487((byte) -124) + i_210_);
				i_210_ = i_209_;
				aShortArray1949[i_211_] = i;
				aShortArray1966[i_211_] = i_208_;
				aShortArray1967[i_211_] = i_209_;
				if (i_209_ > anInt1991)
					anInt1991 = i_209_;
			}
			if (anInt1961 > 0 && (i_212_ & 0x8) != 0) {
				aByteArray1968[i_211_] = (byte) class523_sub34_207_.readUnsignedByte(-655807095);
				aByteArray1969[i_211_] = (byte) class523_sub34_207_.readUnsignedByte(-1987820162);
				aByteArray1990[i_211_] = (byte) class523_sub34_207_.readUnsignedByte(-762802708);
			}
		}
		anInt1991++;
	}

	public Class179(Class179[] class179s, int i) {
		anInt1964 = 0;
		aByte1978 = (byte) 0;
		anInt1982 = 0;
		anInt1953 = 0;
		anInt1964 = 0;
		anInt1982 = 0;
		anInt1961 = 0;
		int i_215_ = 0;
		int i_216_ = 0;
		int i_217_ = 0;
		boolean bool = false;
		boolean bool_218_ = false;
		boolean bool_219_ = false;
		boolean bool_220_ = false;
		boolean bool_221_ = false;
		boolean bool_222_ = false;
		aByte1978 = (byte) -1;
		for (int i_223_ = 0; i_223_ < i; i_223_++) {
			Class179 class179_224_ = class179s[i_223_];
			if (class179_224_ != null) {
				anInt1953 += class179_224_.anInt1953;
				anInt1964 += class179_224_.anInt1964;
				anInt1982 += class179_224_.anInt1982;
				anInt1961 += class179_224_.anInt1961;
				if (class179_224_.aClass184Array1995 != null)
					i_215_ += class179_224_.aClass184Array1995.length;
				if (class179_224_.aClass143Array1996 != null)
					i_216_ += class179_224_.aClass143Array1996.length;
				if (class179_224_.aClass176Array1997 != null)
					i_217_ += class179_224_.aClass176Array1997.length;
				bool = bool | class179_224_.aByteArray1971 != null;
				if (class179_224_.aByteArray1972 != null)
					bool_218_ = true;
				else {
					if (aByte1978 == -1)
						aByte1978 = class179_224_.aByte1978;
					if (aByte1978 != class179_224_.aByte1978)
						bool_218_ = true;
				}
				bool_219_ = bool_219_ | class179_224_.aByteArray1975 != null;
				bool_220_ = bool_220_ | class179_224_.aShortArray1989 != null;
				bool_221_ = bool_221_ | class179_224_.aShortArray1959 != null;
				bool_222_ = bool_222_ | class179_224_.anIntArray1993 != null;
			}
		}
		anIntArray1981 = new int[anInt1953];
		anIntArray1973 = new int[anInt1953];
		anIntArray1957 = new int[anInt1953];
		anIntArray1956 = new int[anInt1953];
		aShortArray1965 = new short[anInt1953];
		aShortArray1949 = new short[anInt1964];
		aShortArray1966 = new short[anInt1964];
		aShortArray1967 = new short[anInt1964];
		if (bool)
			aByteArray1971 = new byte[anInt1964];
		if (bool_218_)
			aByteArray1972 = new byte[anInt1964];
		if (bool_219_)
			aByteArray1975 = new byte[anInt1964];
		if (bool_220_)
			aShortArray1989 = new short[anInt1964];
		aShortArray1974 = new short[anInt1964];
		if (bool_221_)
			aShortArray1959 = new short[anInt1964];
		if (bool_222_)
			anIntArray1993 = new int[anInt1964];
		aShortArray1979 = new short[anInt1964];
		if (anInt1982 > 0) {
			aByteArray1983 = new byte[anInt1982];
			aShortArray1977 = new short[anInt1982];
			aShortArray1985 = new short[anInt1982];
			aShortArray1986 = new short[anInt1982];
			anIntArray1987 = new int[anInt1982];
			anIntArray1988 = new int[anInt1982];
			anIntArray1955 = new int[anInt1982];
			aByteArray1954 = new byte[anInt1982];
			aByteArray1994 = new byte[anInt1982];
			anIntArray1960 = new int[anInt1982];
			anIntArray1970 = new int[anInt1982];
			anIntArray1992 = new int[anInt1982];
		}
		if (i_217_ > 0)
			aClass176Array1997 = new Class176[i_217_];
		if (i_215_ > 0)
			aClass184Array1995 = new Class184[i_215_];
		if (i_216_ > 0)
			aClass143Array1996 = new Class143[i_216_];
		if (anInt1961 > 0) {
			aFloatArray1962 = new float[anInt1961];
			aFloatArray1963 = new float[anInt1961];
			anIntArray1958 = new int[anInt1953];
			aByteArray1968 = new byte[anInt1964];
			aByteArray1969 = new byte[anInt1964];
			aByteArray1990 = new byte[anInt1964];
		}
		int[] is = new int[anInt1953];
		int[] is_225_ = new int[anInt1961];
		int[] is_226_ = new int[anInt1953];
		int[] is_227_ = new int[anInt1953];
		int[] is_228_ = new int[3];
		anInt1953 = 0;
		anInt1964 = 0;
		anInt1982 = 0;
		anInt1961 = 0;
		i_215_ = 0;
		i_216_ = 0;
		i_217_ = 0;
		for (int i_229_ = 0; i_229_ < i; i_229_++) {
			short i_230_ = (short) (1 << i_229_);
			Class179 class179_231_ = class179s[i_229_];
			int i_232_ = anInt1964;
			if (class179_231_ != null) {
				boolean[] bools = new boolean[class179_231_.anInt1953];
				if (class179_231_.aClass176Array1997 != null) {
					for (int i_233_ = 0; i_233_ < class179_231_.aClass176Array1997.length; i_233_++) {
						Class176 class176 = class179_231_.aClass176Array1997[i_233_];
						aClass176Array1997[i_217_++] = class176.method3007((class176.anInt1858 * -421198465) + anInt1964, -595104633);
					}
				}
				for (int i_234_ = 0; i_234_ < class179_231_.anInt1964; i_234_++) {
					is_228_[0] = class179_231_.aShortArray1949[i_234_];
					is_228_[1] = class179_231_.aShortArray1966[i_234_];
					is_228_[2] = class179_231_.aShortArray1967[i_234_];
					for (int i_235_ = 0; i_235_ < 3; i_235_++) {
						int i_236_ = is_228_[i_235_];
						int i_237_ = class179_231_.anIntArray1981[i_236_];
						int i_238_ = class179_231_.anIntArray1973[i_236_];
						int i_239_ = class179_231_.anIntArray1957[i_236_];
						int i_240_;
						for (i_240_ = 0; i_240_ < anInt1953; i_240_++) {
							if (i_237_ == anIntArray1981[i_240_] && i_238_ == anIntArray1973[i_240_] && i_239_ == anIntArray1957[i_240_]) {
								aShortArray1965[i_240_] |= i_230_;
								is_226_[i_236_] = i_240_;
								break;
							}
						}
						if (class179_231_.anInt1961 > 0 && !bools[i_236_]) {
							int i_241_ = ((i_236_ < class179_231_.anInt1953 - 1 ? class179_231_.anIntArray1958[i_236_ + 1] : class179_231_.anInt1961) - class179_231_.anIntArray1958[i_236_]);
							for (int i_242_ = 0; i_242_ < i_241_; i_242_++) {
								aFloatArray1962[anInt1961] = (class179_231_.aFloatArray1962[(class179_231_.anIntArray1958[i_236_] + i_242_)]);
								aFloatArray1963[anInt1961] = (class179_231_.aFloatArray1963[(class179_231_.anIntArray1958[i_236_] + i_242_)]);
								is_225_[anInt1961] = i_240_ << 16 | is[i_240_] + i_242_;
								anInt1961++;
							}
							is_227_[i_236_] = is[i_240_];
							is[i_240_] += i_241_;
							bools[i_236_] = true;
						}
						if (i_240_ >= anInt1953) {
							anIntArray1981[anInt1953] = i_237_;
							anIntArray1973[anInt1953] = i_238_;
							anIntArray1957[anInt1953] = i_239_;
							aShortArray1965[anInt1953] = i_230_;
							anIntArray1956[anInt1953] = (class179_231_.anIntArray1956 != null ? class179_231_.anIntArray1956[i_236_] : -1);
							is_226_[i_236_] = anInt1953;
							anInt1953++;
						}
					}
				}
				for (int i_243_ = 0; i_243_ < class179_231_.anInt1964; i_243_++) {
					if (bool && class179_231_.aByteArray1971 != null)
						aByteArray1971[anInt1964] = class179_231_.aByteArray1971[i_243_];
					if (bool_218_) {
						if (class179_231_.aByteArray1972 != null)
							aByteArray1972[anInt1964] = class179_231_.aByteArray1972[i_243_];
						else
							aByteArray1972[anInt1964] = class179_231_.aByte1978;
					}
					if (bool_219_ && class179_231_.aByteArray1975 != null)
						aByteArray1975[anInt1964] = class179_231_.aByteArray1975[i_243_];
					if (bool_221_) {
						if (class179_231_.aShortArray1959 != null)
							aShortArray1959[anInt1964] = class179_231_.aShortArray1959[i_243_];
						else
							aShortArray1959[anInt1964] = (short) -1;
					}
					if (bool_222_) {
						if (class179_231_.anIntArray1993 != null)
							anIntArray1993[anInt1964] = class179_231_.anIntArray1993[i_243_];
						else
							anIntArray1993[anInt1964] = -1;
					}
					if (class179_231_.anInt1961 > 0) {
						aByteArray1968[anInt1964] = (byte) (class179_231_.aByteArray1968[i_243_] + is_227_[(class179_231_.aShortArray1949[i_243_])]);
						aByteArray1969[anInt1964] = (byte) (class179_231_.aByteArray1969[i_243_] + is_227_[(class179_231_.aShortArray1966[i_243_])]);
						aByteArray1990[anInt1964] = (byte) (class179_231_.aByteArray1990[i_243_] + is_227_[(class179_231_.aShortArray1967[i_243_])]);
					}
					aShortArray1949[anInt1964] = (short) (is_226_[class179_231_.aShortArray1949[i_243_]]);
					aShortArray1966[anInt1964] = (short) (is_226_[class179_231_.aShortArray1966[i_243_]]);
					aShortArray1967[anInt1964] = (short) (is_226_[class179_231_.aShortArray1967[i_243_]]);
					aShortArray1979[anInt1964] = i_230_;
					aShortArray1974[anInt1964] = class179_231_.aShortArray1974[i_243_];
					anInt1964++;
				}
				if (class179_231_.aClass184Array1995 != null) {
					for (int i_244_ = 0; i_244_ < class179_231_.aClass184Array1995.length; i_244_++) {
						int i_245_ = is_226_[(class179_231_.aClass184Array1995[i_244_].anInt2113) * 1717084103];
						int i_246_ = is_226_[(class179_231_.aClass184Array1995[i_244_].anInt2114) * -615332511];
						int i_247_ = is_226_[(class179_231_.aClass184Array1995[i_244_].anInt2115) * -648014401];
						aClass184Array1995[i_215_] = (class179_231_.aClass184Array1995[i_244_].method3576((class179_231_.aClass184Array1995[i_244_].anInt2123) * 914118525 + i_232_, i_245_, i_246_, i_247_, (byte) -54));
						i_215_++;
					}
				}
				if (class179_231_.aClass143Array1996 != null) {
					for (int i_248_ = 0; i_248_ < class179_231_.aClass143Array1996.length; i_248_++) {
						int i_249_ = is_226_[(class179_231_.aClass143Array1996[i_248_].anInt1688) * -256753261];
						aClass143Array1996[i_216_] = class179_231_.aClass143Array1996[i_248_].method2363(i_249_, 950835594);
						i_216_++;
					}
				}
			}
		}
		anInt1991 = anInt1953;
		if (anInt1961 > 0) {
			Class232.method4252(is_225_, aFloatArray1962, aFloatArray1963, -1172179243);
			int i_250_ = 0;
			int i_251_ = 0;
			for (/**/; i_250_ < anInt1953; i_250_++) {
				anIntArray1958[i_250_] = i_251_;
				i_251_ += is[i_250_];
			}
		}
		int i_252_ = 0;
		int i_253_ = 0;
		for (/**/; i_252_ < i; i_252_++) {
			short i_254_ = (short) (1 << i_252_);
			Class179 class179_255_ = class179s[i_252_];
			if (class179_255_ != null) {
				if (bool_220_) {
					int i_256_ = 0;
					while (i_256_ < class179_255_.anInt1964) {
						aShortArray1989[i_253_] = (class179_255_.aShortArray1989 != null ? class179_255_.aShortArray1989[i_256_] : (short) -1);
						if (aShortArray1989[i_253_] > -1 && aShortArray1989[i_253_] < 32766)
							aShortArray1989[i_253_] = (short) (aShortArray1989[i_253_] + anInt1982);
						i_256_++;
						i_253_++;
					}
				}
				for (int i_257_ = 0; i_257_ < class179_255_.anInt1982; i_257_++) {
					byte i_258_ = (aByteArray1983[anInt1982] = class179_255_.aByteArray1983[i_257_]);
					if (i_258_ == 0) {
						aShortArray1977[anInt1982] = (short) method3480(class179_255_, (class179_255_.aShortArray1977[i_257_]), i_254_);
						aShortArray1985[anInt1982] = (short) method3480(class179_255_, (class179_255_.aShortArray1985[i_257_]), i_254_);
						aShortArray1986[anInt1982] = (short) method3480(class179_255_, (class179_255_.aShortArray1986[i_257_]), i_254_);
					} else if (i_258_ >= 1 && i_258_ <= 3) {
						aShortArray1977[anInt1982] = class179_255_.aShortArray1977[i_257_];
						aShortArray1985[anInt1982] = class179_255_.aShortArray1985[i_257_];
						aShortArray1986[anInt1982] = class179_255_.aShortArray1986[i_257_];
						anIntArray1987[anInt1982] = class179_255_.anIntArray1987[i_257_];
						anIntArray1988[anInt1982] = class179_255_.anIntArray1988[i_257_];
						anIntArray1955[anInt1982] = class179_255_.anIntArray1955[i_257_];
						aByteArray1954[anInt1982] = class179_255_.aByteArray1954[i_257_];
						aByteArray1994[anInt1982] = class179_255_.aByteArray1994[i_257_];
						anIntArray1960[anInt1982] = class179_255_.anIntArray1960[i_257_];
					} else if (i_258_ == 2) {
						anIntArray1970[anInt1982] = class179_255_.anIntArray1970[i_257_];
						anIntArray1992[anInt1982] = class179_255_.anIntArray1992[i_257_];
					}
					anInt1982++;
				}
			}
		}
	}

	void method3503(Class523_Sub34 class523_sub34, Class523_Sub34 class523_sub34_259_, Class523_Sub34 class523_sub34_260_) {
		short i = 0;
		short i_261_ = 0;
		short i_262_ = 0;
		int i_263_ = 0;
		for (int i_264_ = 0; i_264_ < anInt1964; i_264_++) {
			int i_265_ = class523_sub34_259_.readUnsignedByte(89866017);
			int i_266_ = i_265_ & 0x7;
			if (i_266_ == 1) {
				aShortArray1949[i_264_] = i = (short) (class523_sub34.method16487((byte) -20) + i_263_);
				i_263_ = i;
				aShortArray1966[i_264_] = i_261_ = (short) (class523_sub34.method16487((byte) -123) + i_263_);
				i_263_ = i_261_;
				aShortArray1967[i_264_] = i_262_ = (short) (class523_sub34.method16487((byte) -105) + i_263_);
				i_263_ = i_262_;
				if (i > anInt1991)
					anInt1991 = i;
				if (i_261_ > anInt1991)
					anInt1991 = i_261_;
				if (i_262_ > anInt1991)
					anInt1991 = i_262_;
			}
			if (i_266_ == 2) {
				i_261_ = i_262_;
				i_262_ = (short) (class523_sub34.method16487((byte) -118) + i_263_);
				i_263_ = i_262_;
				aShortArray1949[i_264_] = i;
				aShortArray1966[i_264_] = i_261_;
				aShortArray1967[i_264_] = i_262_;
				if (i_262_ > anInt1991)
					anInt1991 = i_262_;
			}
			if (i_266_ == 3) {
				i = i_262_;
				i_262_ = (short) (class523_sub34.method16487((byte) -107) + i_263_);
				i_263_ = i_262_;
				aShortArray1949[i_264_] = i;
				aShortArray1966[i_264_] = i_261_;
				aShortArray1967[i_264_] = i_262_;
				if (i_262_ > anInt1991)
					anInt1991 = i_262_;
			}
			if (i_266_ == 4) {
				short i_267_ = i;
				i = i_261_;
				i_261_ = i_267_;
				i_262_ = (short) (class523_sub34.method16487((byte) -115) + i_263_);
				i_263_ = i_262_;
				aShortArray1949[i_264_] = i;
				aShortArray1966[i_264_] = i_261_;
				aShortArray1967[i_264_] = i_262_;
				if (i_262_ > anInt1991)
					anInt1991 = i_262_;
			}
			if (anInt1961 > 0 && (i_265_ & 0x8) != 0) {
				aByteArray1968[i_264_] = (byte) class523_sub34_260_.readUnsignedByte(1473185497);
				aByteArray1969[i_264_] = (byte) class523_sub34_260_.readUnsignedByte(243762278);
				aByteArray1990[i_264_] = (byte) class523_sub34_260_.readUnsignedByte(-918609473);
			}
		}
		anInt1991++;
	}

	void method3504(Class523_Sub34 class523_sub34, Class523_Sub34 class523_sub34_268_, Class523_Sub34 class523_sub34_269_, Class523_Sub34 class523_sub34_270_, Class523_Sub34 class523_sub34_271_, Class523_Sub34 class523_sub34_272_) {
		for (int i = 0; i < anInt1982; i++) {
			int i_273_ = aByteArray1983[i] & 0xff;
			if (i_273_ == 0) {
				aShortArray1977[i] = (short) class523_sub34.readUnsignedShort(-1820067275);
				aShortArray1985[i] = (short) class523_sub34.readUnsignedShort(-1759292796);
				aShortArray1986[i] = (short) class523_sub34.readUnsignedShort(-381975317);
			}
			if (i_273_ == 1) {
				aShortArray1977[i] = (short) class523_sub34_268_.readUnsignedShort(-1986806093);
				aShortArray1985[i] = (short) class523_sub34_268_.readUnsignedShort(-835263087);
				aShortArray1986[i] = (short) class523_sub34_268_.readUnsignedShort(-1109991690);
				if (anInt1952 < 15) {
					anIntArray1987[i] = class523_sub34_269_.readUnsignedShort(-1682000291);
					if (anInt1952 < 14)
						anIntArray1988[i] = class523_sub34_269_.readUnsignedShort(-2083153895);
					else
						anIntArray1988[i] = class523_sub34_269_.read24BitInt(141927262);
					anIntArray1955[i] = class523_sub34_269_.readUnsignedShort(-1922248285);
				} else {
					anIntArray1987[i] = class523_sub34_269_.read24BitInt(-1206750365);
					anIntArray1988[i] = class523_sub34_269_.read24BitInt(6854364);
					anIntArray1955[i] = class523_sub34_269_.read24BitInt(-1790657817);
				}
				aByteArray1954[i] = class523_sub34_270_.readByte((short) -8346);
				aByteArray1994[i] = class523_sub34_271_.readByte((short) -32209);
				anIntArray1960[i] = class523_sub34_272_.readByte((short) -25637);
			}
			if (i_273_ == 2) {
				aShortArray1977[i] = (short) class523_sub34_268_.readUnsignedShort(-1031433516);
				aShortArray1985[i] = (short) class523_sub34_268_.readUnsignedShort(-1317253284);
				aShortArray1986[i] = (short) class523_sub34_268_.readUnsignedShort(-1432824649);
				if (anInt1952 < 15) {
					anIntArray1987[i] = class523_sub34_269_.readUnsignedShort(-1578150510);
					if (anInt1952 < 14)
						anIntArray1988[i] = class523_sub34_269_.readUnsignedShort(-206521121);
					else
						anIntArray1988[i] = class523_sub34_269_.read24BitInt(1218689875);
					anIntArray1955[i] = class523_sub34_269_.readUnsignedShort(-738437215);
				} else {
					anIntArray1987[i] = class523_sub34_269_.read24BitInt(810987890);
					anIntArray1988[i] = class523_sub34_269_.read24BitInt(68213068);
					anIntArray1955[i] = class523_sub34_269_.read24BitInt(-1128336265);
				}
				aByteArray1954[i] = class523_sub34_270_.readByte((short) -31115);
				aByteArray1994[i] = class523_sub34_271_.readByte((short) -5340);
				anIntArray1960[i] = class523_sub34_272_.readByte((short) 42);
				anIntArray1970[i] = class523_sub34_272_.readByte((short) -10858);
				anIntArray1992[i] = class523_sub34_272_.readByte((short) -26407);
			}
			if (i_273_ == 3) {
				aShortArray1977[i] = (short) class523_sub34_268_.readUnsignedShort(-231869928);
				aShortArray1985[i] = (short) class523_sub34_268_.readUnsignedShort(-859468735);
				aShortArray1986[i] = (short) class523_sub34_268_.readUnsignedShort(-1425972270);
				if (anInt1952 < 15) {
					anIntArray1987[i] = class523_sub34_269_.readUnsignedShort(-741081413);
					if (anInt1952 < 14)
						anIntArray1988[i] = class523_sub34_269_.readUnsignedShort(-462717133);
					else
						anIntArray1988[i] = class523_sub34_269_.read24BitInt(23787157);
					anIntArray1955[i] = class523_sub34_269_.readUnsignedShort(-956828427);
				} else {
					anIntArray1987[i] = class523_sub34_269_.read24BitInt(-1861552972);
					anIntArray1988[i] = class523_sub34_269_.read24BitInt(-1192573549);
					anIntArray1955[i] = class523_sub34_269_.read24BitInt(-319701498);
				}
				aByteArray1954[i] = class523_sub34_270_.readByte((short) -19064);
				aByteArray1994[i] = class523_sub34_271_.readByte((short) -4430);
				anIntArray1960[i] = class523_sub34_272_.readByte((short) -3834);
			}
		}
	}

	public int method3505(int i, int i_274_, int i_275_) {
		for (int i_276_ = 0; i_276_ < anInt1953; i_276_++) {
			if (anIntArray1981[i_276_] == i && anIntArray1973[i_276_] == i_274_ && anIntArray1957[i_276_] == i_275_)
				return i_276_;
		}
		anIntArray1981[anInt1953] = i;
		anIntArray1973[anInt1953] = i_274_;
		anIntArray1957[anInt1953] = i_275_;
		anInt1991 = anInt1953 + 1;
		return anInt1953++;
	}

	void method3506(Class523_Sub34 class523_sub34, Class523_Sub34 class523_sub34_277_, Class523_Sub34 class523_sub34_278_, Class523_Sub34 class523_sub34_279_, Class523_Sub34 class523_sub34_280_, Class523_Sub34 class523_sub34_281_) {
		for (int i = 0; i < anInt1982; i++) {
			int i_282_ = aByteArray1983[i] & 0xff;
			if (i_282_ == 0) {
				aShortArray1977[i] = (short) class523_sub34.readUnsignedShort(-1340310204);
				aShortArray1985[i] = (short) class523_sub34.readUnsignedShort(-119986981);
				aShortArray1986[i] = (short) class523_sub34.readUnsignedShort(-490462291);
			}
			if (i_282_ == 1) {
				aShortArray1977[i] = (short) class523_sub34_277_.readUnsignedShort(-792344149);
				aShortArray1985[i] = (short) class523_sub34_277_.readUnsignedShort(-1051469667);
				aShortArray1986[i] = (short) class523_sub34_277_.readUnsignedShort(-1545355990);
				if (anInt1952 < 15) {
					anIntArray1987[i] = class523_sub34_278_.readUnsignedShort(-192868799);
					if (anInt1952 < 14)
						anIntArray1988[i] = class523_sub34_278_.readUnsignedShort(-100683692);
					else
						anIntArray1988[i] = class523_sub34_278_.read24BitInt(-1310333092);
					anIntArray1955[i] = class523_sub34_278_.readUnsignedShort(-609274416);
				} else {
					anIntArray1987[i] = class523_sub34_278_.read24BitInt(-993270583);
					anIntArray1988[i] = class523_sub34_278_.read24BitInt(1422390504);
					anIntArray1955[i] = class523_sub34_278_.read24BitInt(-1094262434);
				}
				aByteArray1954[i] = class523_sub34_279_.readByte((short) -25617);
				aByteArray1994[i] = class523_sub34_280_.readByte((short) -29881);
				anIntArray1960[i] = class523_sub34_281_.readByte((short) -29392);
			}
			if (i_282_ == 2) {
				aShortArray1977[i] = (short) class523_sub34_277_.readUnsignedShort(-1418704847);
				aShortArray1985[i] = (short) class523_sub34_277_.readUnsignedShort(-222694635);
				aShortArray1986[i] = (short) class523_sub34_277_.readUnsignedShort(-1843924005);
				if (anInt1952 < 15) {
					anIntArray1987[i] = class523_sub34_278_.readUnsignedShort(-1672687907);
					if (anInt1952 < 14)
						anIntArray1988[i] = class523_sub34_278_.readUnsignedShort(-354415813);
					else
						anIntArray1988[i] = class523_sub34_278_.read24BitInt(-711026331);
					anIntArray1955[i] = class523_sub34_278_.readUnsignedShort(-106543322);
				} else {
					anIntArray1987[i] = class523_sub34_278_.read24BitInt(653992428);
					anIntArray1988[i] = class523_sub34_278_.read24BitInt(186559291);
					anIntArray1955[i] = class523_sub34_278_.read24BitInt(-1070429408);
				}
				aByteArray1954[i] = class523_sub34_279_.readByte((short) -605);
				aByteArray1994[i] = class523_sub34_280_.readByte((short) -28087);
				anIntArray1960[i] = class523_sub34_281_.readByte((short) -6055);
				anIntArray1970[i] = class523_sub34_281_.readByte((short) 577);
				anIntArray1992[i] = class523_sub34_281_.readByte((short) -11199);
			}
			if (i_282_ == 3) {
				aShortArray1977[i] = (short) class523_sub34_277_.readUnsignedShort(-852598763);
				aShortArray1985[i] = (short) class523_sub34_277_.readUnsignedShort(-1891591736);
				aShortArray1986[i] = (short) class523_sub34_277_.readUnsignedShort(-954405217);
				if (anInt1952 < 15) {
					anIntArray1987[i] = class523_sub34_278_.readUnsignedShort(-1119940034);
					if (anInt1952 < 14)
						anIntArray1988[i] = class523_sub34_278_.readUnsignedShort(-2102379895);
					else
						anIntArray1988[i] = class523_sub34_278_.read24BitInt(-1267482669);
					anIntArray1955[i] = class523_sub34_278_.readUnsignedShort(-304034110);
				} else {
					anIntArray1987[i] = class523_sub34_278_.read24BitInt(1866566835);
					anIntArray1988[i] = class523_sub34_278_.read24BitInt(963311341);
					anIntArray1955[i] = class523_sub34_278_.read24BitInt(914728254);
				}
				aByteArray1954[i] = class523_sub34_279_.readByte((short) -14468);
				aByteArray1994[i] = class523_sub34_280_.readByte((short) -20159);
				anIntArray1960[i] = class523_sub34_281_.readByte((short) -9336);
			}
		}
	}

	final int method3507(Class179 class179_283_, int i, short i_284_) {
		int i_285_ = class179_283_.anIntArray1981[i];
		int i_286_ = class179_283_.anIntArray1973[i];
		int i_287_ = class179_283_.anIntArray1957[i];
		for (int i_288_ = 0; i_288_ < anInt1953; i_288_++) {
			if (i_285_ == anIntArray1981[i_288_] && i_286_ == anIntArray1973[i_288_] && i_287_ == anIntArray1957[i_288_]) {
				aShortArray1965[i_288_] |= i_284_;
				return i_288_;
			}
		}
		anIntArray1981[anInt1953] = i_285_;
		anIntArray1973[anInt1953] = i_286_;
		anIntArray1957[anInt1953] = i_287_;
		aShortArray1965[anInt1953] = i_284_;
		anIntArray1956[anInt1953] = (class179_283_.anIntArray1956 != null ? class179_283_.anIntArray1956[i] : -1);
		return anInt1953++;
	}

	public void method3508(int i, int i_289_, int i_290_) {
		for (int i_291_ = 0; i_291_ < anInt1953; i_291_++) {
			anIntArray1981[i_291_] += i;
			anIntArray1973[i_291_] += i_289_;
			anIntArray1957[i_291_] += i_290_;
		}
	}

	public int method3509(int i, int i_292_, int i_293_, byte i_294_, byte i_295_, short i_296_, byte i_297_, short i_298_) {
		aShortArray1949[anInt1964] = (short) i;
		aShortArray1966[anInt1964] = (short) i_292_;
		aShortArray1967[anInt1964] = (short) i_293_;
		aByteArray1971[anInt1964] = i_294_;
		aShortArray1989[anInt1964] = (short) i_295_;
		aShortArray1974[anInt1964] = i_296_;
		aByteArray1975[anInt1964] = i_297_;
		aShortArray1959[anInt1964] = i_298_;
		return anInt1964++;
	}

	public int[][] method3510(boolean bool) {
		int[] is = new int[400];
		int i = 0;
		int i_299_ = bool ? anInt1953 : anInt1991;
		for (int i_300_ = 0; i_300_ < i_299_; i_300_++) {
			int i_301_ = anIntArray1956[i_300_];
			if (i_301_ >= 0) {
				is[i_301_]++;
				if (i_301_ > i)
					i = i_301_;
			}
		}
		int[][] is_302_ = new int[i + 1][];
		for (int i_303_ = 0; i_303_ <= i; i_303_++) {
			is_302_[i_303_] = new int[is[i_303_]];
			is[i_303_] = 0;
		}
		for (int i_304_ = 0; i_304_ < i_299_; i_304_++) {
			int i_305_ = anIntArray1956[i_304_];
			if (i_305_ >= 0)
				is_302_[i_305_][is[i_305_]++] = i_304_;
		}
		return is_302_;
	}

	public static Class179 method3511(Class472 class472, int i, int i_306_) {
		byte[] is = class472.method7688(i, i_306_, 1373716922);
		if (is == null)
			return null;
		return new Class179(is);
	}

	public byte method3512(short i, short i_307_, short i_308_) {
		if (anInt1982 >= 255)
			throw new IllegalStateException();
		aByteArray1983[anInt1982] = (byte) 0;
		aShortArray1977[anInt1982] = i;
		aShortArray1985[anInt1982] = i_307_;
		aShortArray1986[anInt1982] = i_308_;
		return (byte) anInt1982++;
	}

	public int[][] method3513() {
		int[] is = new int[256];
		int i = 0;
		for (int i_309_ = 0; i_309_ < anInt1964; i_309_++) {
			int i_310_ = anIntArray1993[i_309_];
			if (i_310_ >= 0) {
				is[i_310_]++;
				if (i_310_ > i)
					i = i_310_;
			}
		}
		int[][] is_311_ = new int[i + 1][];
		for (int i_312_ = 0; i_312_ <= i; i_312_++) {
			is_311_[i_312_] = new int[is[i_312_]];
			is[i_312_] = 0;
		}
		for (int i_313_ = 0; i_313_ < anInt1964; i_313_++) {
			int i_314_ = anIntArray1993[i_313_];
			if (i_314_ >= 0)
				is_311_[i_314_][is[i_314_]++] = i_313_;
		}
		return is_311_;
	}

	public int[][] method3514() {
		int[] is = new int[256];
		int i = 0;
		for (int i_315_ = 0; i_315_ < anInt1964; i_315_++) {
			int i_316_ = anIntArray1993[i_315_];
			if (i_316_ >= 0) {
				is[i_316_]++;
				if (i_316_ > i)
					i = i_316_;
			}
		}
		int[][] is_317_ = new int[i + 1][];
		for (int i_318_ = 0; i_318_ <= i; i_318_++) {
			is_317_[i_318_] = new int[is[i_318_]];
			is[i_318_] = 0;
		}
		for (int i_319_ = 0; i_319_ < anInt1964; i_319_++) {
			int i_320_ = anIntArray1993[i_319_];
			if (i_320_ >= 0)
				is_317_[i_320_][is[i_320_]++] = i_319_;
		}
		return is_317_;
	}

	public int[][] method3515() {
		int[] is = new int[256];
		int i = 0;
		for (int i_321_ = 0; i_321_ < aClass176Array1997.length; i_321_++) {
			int i_322_ = aClass176Array1997[i_321_].anInt1859 * 1357208487;
			if (i_322_ >= 0) {
				is[i_322_]++;
				if (i_322_ > i)
					i = i_322_;
			}
		}
		int[][] is_323_ = new int[i + 1][];
		for (int i_324_ = 0; i_324_ <= i; i_324_++) {
			is_323_[i_324_] = new int[is[i_324_]];
			is[i_324_] = 0;
		}
		for (int i_325_ = 0; i_325_ < aClass176Array1997.length; i_325_++) {
			int i_326_ = aClass176Array1997[i_325_].anInt1859 * 1357208487;
			if (i_326_ >= 0)
				is_323_[i_326_][is[i_326_]++] = i_325_;
		}
		return is_323_;
	}

	public void method3516(int i, int i_327_, int i_328_) {
		if (i_328_ != 0) {
			int i_329_ = Class433.anIntArray4880[i_328_];
			int i_330_ = Class433.anIntArray4881[i_328_];
			for (int i_331_ = 0; i_331_ < anInt1953; i_331_++) {
				int i_332_ = ((anIntArray1973[i_331_] * i_329_ + anIntArray1981[i_331_] * i_330_) >> 14);
				anIntArray1973[i_331_] = (anIntArray1973[i_331_] * i_330_ - anIntArray1981[i_331_] * i_329_) >> 14;
				anIntArray1981[i_331_] = i_332_;
			}
		}
		if (i != 0) {
			int i_333_ = Class433.anIntArray4880[i];
			int i_334_ = Class433.anIntArray4881[i];
			for (int i_335_ = 0; i_335_ < anInt1953; i_335_++) {
				int i_336_ = ((anIntArray1973[i_335_] * i_334_ - anIntArray1957[i_335_] * i_333_) >> 14);
				anIntArray1957[i_335_] = (anIntArray1973[i_335_] * i_333_ + anIntArray1957[i_335_] * i_334_) >> 14;
				anIntArray1973[i_335_] = i_336_;
			}
		}
		if (i_327_ != 0) {
			int i_337_ = Class433.anIntArray4880[i_327_];
			int i_338_ = Class433.anIntArray4881[i_327_];
			for (int i_339_ = 0; i_339_ < anInt1953; i_339_++) {
				int i_340_ = ((anIntArray1957[i_339_] * i_337_ + anIntArray1981[i_339_] * i_338_) >> 14);
				anIntArray1957[i_339_] = (anIntArray1957[i_339_] * i_338_ - anIntArray1981[i_339_] * i_337_) >> 14;
				anIntArray1981[i_339_] = i_340_;
			}
		}
	}

	public void method3517(short i, short i_341_) {
		for (int i_342_ = 0; i_342_ < anInt1964; i_342_++) {
			if (aShortArray1974[i_342_] == i)
				aShortArray1974[i_342_] = i_341_;
		}
	}

	public int method3518(int i, int i_343_, int i_344_) {
		for (int i_345_ = 0; i_345_ < anInt1953; i_345_++) {
			if (anIntArray1981[i_345_] == i && anIntArray1973[i_345_] == i_343_ && anIntArray1957[i_345_] == i_344_)
				return i_345_;
		}
		anIntArray1981[anInt1953] = i;
		anIntArray1973[anInt1953] = i_343_;
		anIntArray1957[anInt1953] = i_344_;
		anInt1991 = anInt1953 + 1;
		return anInt1953++;
	}

	public byte method3519(short i, short i_346_, short i_347_, short i_348_, short i_349_, short i_350_, byte i_351_, byte i_352_, byte i_353_) {
		if (anInt1982 >= 255)
			throw new IllegalStateException();
		aByteArray1983[anInt1982] = (byte) 3;
		aShortArray1977[anInt1982] = i;
		aShortArray1985[anInt1982] = i_346_;
		aShortArray1986[anInt1982] = i_347_;
		anIntArray1987[anInt1982] = i_348_;
		anIntArray1988[anInt1982] = i_349_;
		anIntArray1955[anInt1982] = i_350_;
		aByteArray1954[anInt1982] = i_351_;
		aByteArray1994[anInt1982] = i_352_;
		anIntArray1960[anInt1982] = i_353_;
		return (byte) anInt1982++;
	}

	public void method3520(short i, short i_354_) {
		for (int i_355_ = 0; i_355_ < anInt1964; i_355_++) {
			if (aShortArray1974[i_355_] == i)
				aShortArray1974[i_355_] = i_354_;
		}
	}

	public void method3521(int i, int i_356_, int i_357_) {
		for (int i_358_ = 0; i_358_ < anInt1953; i_358_++) {
			anIntArray1981[i_358_] += i;
			anIntArray1973[i_358_] += i_356_;
			anIntArray1957[i_358_] += i_357_;
		}
	}

	public void method3522(int i, int i_359_, int i_360_) {
		for (int i_361_ = 0; i_361_ < anInt1953; i_361_++) {
			anIntArray1981[i_361_] += i;
			anIntArray1973[i_361_] += i_359_;
			anIntArray1957[i_361_] += i_360_;
		}
	}

	void method3523(Class523_Sub34 class523_sub34, Class523_Sub34 class523_sub34_362_, Class523_Sub34 class523_sub34_363_) {
		short i = 0;
		short i_364_ = 0;
		short i_365_ = 0;
		int i_366_ = 0;
		for (int i_367_ = 0; i_367_ < anInt1964; i_367_++) {
			int i_368_ = class523_sub34_362_.readUnsignedByte(-908762859);
			int i_369_ = i_368_ & 0x7;
			if (i_369_ == 1) {
				aShortArray1949[i_367_] = i = (short) (class523_sub34.method16487((byte) 9) + i_366_);
				i_366_ = i;
				aShortArray1966[i_367_] = i_364_ = (short) (class523_sub34.method16487((byte) -116) + i_366_);
				i_366_ = i_364_;
				aShortArray1967[i_367_] = i_365_ = (short) (class523_sub34.method16487((byte) -57) + i_366_);
				i_366_ = i_365_;
				if (i > anInt1991)
					anInt1991 = i;
				if (i_364_ > anInt1991)
					anInt1991 = i_364_;
				if (i_365_ > anInt1991)
					anInt1991 = i_365_;
			}
			if (i_369_ == 2) {
				i_364_ = i_365_;
				i_365_ = (short) (class523_sub34.method16487((byte) 15) + i_366_);
				i_366_ = i_365_;
				aShortArray1949[i_367_] = i;
				aShortArray1966[i_367_] = i_364_;
				aShortArray1967[i_367_] = i_365_;
				if (i_365_ > anInt1991)
					anInt1991 = i_365_;
			}
			if (i_369_ == 3) {
				i = i_365_;
				i_365_ = (short) (class523_sub34.method16487((byte) -87) + i_366_);
				i_366_ = i_365_;
				aShortArray1949[i_367_] = i;
				aShortArray1966[i_367_] = i_364_;
				aShortArray1967[i_367_] = i_365_;
				if (i_365_ > anInt1991)
					anInt1991 = i_365_;
			}
			if (i_369_ == 4) {
				short i_370_ = i;
				i = i_364_;
				i_364_ = i_370_;
				i_365_ = (short) (class523_sub34.method16487((byte) -17) + i_366_);
				i_366_ = i_365_;
				aShortArray1949[i_367_] = i;
				aShortArray1966[i_367_] = i_364_;
				aShortArray1967[i_367_] = i_365_;
				if (i_365_ > anInt1991)
					anInt1991 = i_365_;
			}
			if (anInt1961 > 0 && (i_368_ & 0x8) != 0) {
				aByteArray1968[i_367_] = (byte) class523_sub34_363_.readUnsignedByte(-925751027);
				aByteArray1969[i_367_] = (byte) class523_sub34_363_.readUnsignedByte(-809446036);
				aByteArray1990[i_367_] = (byte) class523_sub34_363_.readUnsignedByte(735675052);
			}
		}
		anInt1991++;
	}

	public static Class179 method3524(Class472 class472, int i, int i_371_) {
		byte[] is = class472.method7688(i, i_371_, -1055533597);
		if (is == null)
			return null;
		return new Class179(is);
	}

	public void method3525(int i, int i_372_, int i_373_) {
		if (i_373_ != 0) {
			int i_374_ = Class433.anIntArray4880[i_373_];
			int i_375_ = Class433.anIntArray4881[i_373_];
			for (int i_376_ = 0; i_376_ < anInt1953; i_376_++) {
				int i_377_ = ((anIntArray1973[i_376_] * i_374_ + anIntArray1981[i_376_] * i_375_) >> 14);
				anIntArray1973[i_376_] = (anIntArray1973[i_376_] * i_375_ - anIntArray1981[i_376_] * i_374_) >> 14;
				anIntArray1981[i_376_] = i_377_;
			}
		}
		if (i != 0) {
			int i_378_ = Class433.anIntArray4880[i];
			int i_379_ = Class433.anIntArray4881[i];
			for (int i_380_ = 0; i_380_ < anInt1953; i_380_++) {
				int i_381_ = ((anIntArray1973[i_380_] * i_379_ - anIntArray1957[i_380_] * i_378_) >> 14);
				anIntArray1957[i_380_] = (anIntArray1973[i_380_] * i_378_ + anIntArray1957[i_380_] * i_379_) >> 14;
				anIntArray1973[i_380_] = i_381_;
			}
		}
		if (i_372_ != 0) {
			int i_382_ = Class433.anIntArray4880[i_372_];
			int i_383_ = Class433.anIntArray4881[i_372_];
			for (int i_384_ = 0; i_384_ < anInt1953; i_384_++) {
				int i_385_ = ((anIntArray1957[i_384_] * i_382_ + anIntArray1981[i_384_] * i_383_) >> 14);
				anIntArray1957[i_384_] = (anIntArray1957[i_384_] * i_383_ - anIntArray1981[i_384_] * i_382_) >> 14;
				anIntArray1981[i_384_] = i_385_;
			}
		}
	}

	public void method3526(int i, int i_386_, int i_387_) {
		if (i_387_ != 0) {
			int i_388_ = Class433.anIntArray4880[i_387_];
			int i_389_ = Class433.anIntArray4881[i_387_];
			for (int i_390_ = 0; i_390_ < anInt1953; i_390_++) {
				int i_391_ = ((anIntArray1973[i_390_] * i_388_ + anIntArray1981[i_390_] * i_389_) >> 14);
				anIntArray1973[i_390_] = (anIntArray1973[i_390_] * i_389_ - anIntArray1981[i_390_] * i_388_) >> 14;
				anIntArray1981[i_390_] = i_391_;
			}
		}
		if (i != 0) {
			int i_392_ = Class433.anIntArray4880[i];
			int i_393_ = Class433.anIntArray4881[i];
			for (int i_394_ = 0; i_394_ < anInt1953; i_394_++) {
				int i_395_ = ((anIntArray1973[i_394_] * i_393_ - anIntArray1957[i_394_] * i_392_) >> 14);
				anIntArray1957[i_394_] = (anIntArray1973[i_394_] * i_392_ + anIntArray1957[i_394_] * i_393_) >> 14;
				anIntArray1973[i_394_] = i_395_;
			}
		}
		if (i_386_ != 0) {
			int i_396_ = Class433.anIntArray4880[i_386_];
			int i_397_ = Class433.anIntArray4881[i_386_];
			for (int i_398_ = 0; i_398_ < anInt1953; i_398_++) {
				int i_399_ = ((anIntArray1957[i_398_] * i_396_ + anIntArray1981[i_398_] * i_397_) >> 14);
				anIntArray1957[i_398_] = (anIntArray1957[i_398_] * i_397_ - anIntArray1981[i_398_] * i_396_) >> 14;
				anIntArray1981[i_398_] = i_399_;
			}
		}
	}

	public void method3527(float f) {
		for (int i = 0; i < anInt1953; i++) {
			anIntArray1981[i] *= f;
			anIntArray1973[i] *= f;
			anIntArray1957[i] *= f;
		}
		if (anInt1982 > 0 && anIntArray1987 != null) {
			for (int i = 0; i < anIntArray1987.length; i++) {
				anIntArray1987[i] *= f;
				anIntArray1988[i] *= f;
				if (aByteArray1983[i] != 1)
					anIntArray1955[i] *= f;
			}
		}
	}
}
