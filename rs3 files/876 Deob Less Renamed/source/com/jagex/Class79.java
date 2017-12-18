/* Class79 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.zip.Inflater;

public class Class79 {
	Inflater anInflater864;

	public byte[] method1556(byte[] is, int i) {
		Class523_Sub34 class523_sub34 = new Class523_Sub34(is);
		class523_sub34.anInt10661 = 189765723 * (is.length - 4);
		int i_0_ = class523_sub34.method16288(-1907251214);
		byte[] is_1_ = new byte[i_0_];
		class523_sub34.anInt10661 = 0;
		method1558(class523_sub34, is_1_, 2144075199);
		return is_1_;
	}

	Class79(int i, int i_2_, int i_3_) {
		/* empty */
	}

	public void method1557(Class523_Sub34 class523_sub34, byte[] is) {
		if (31 != (class523_sub34.aByteArray10658[2349011 * class523_sub34.anInt10661]) || -117 != (class523_sub34.aByteArray10658[1 + class523_sub34.anInt10661 * 2349011]))
			throw new RuntimeException("");
		if (anInflater864 == null)
			anInflater864 = new Inflater(true);
		try {
			anInflater864.setInput(class523_sub34.aByteArray10658, 10 + 2349011 * class523_sub34.anInt10661, (class523_sub34.aByteArray10658.length - (8 + (10 + (class523_sub34.anInt10661 * 2349011)))));
			anInflater864.inflate(is);
		} catch (Exception exception) {
			anInflater864.reset();
			throw new RuntimeException("");
		}
		anInflater864.reset();
	}

	public void method1558(Class523_Sub34 class523_sub34, byte[] is, int i) {
		if (31 != (class523_sub34.aByteArray10658[2349011 * class523_sub34.anInt10661]) || -117 != (class523_sub34.aByteArray10658[1 + class523_sub34.anInt10661 * 2349011]))
			throw new RuntimeException("");
		if (anInflater864 == null)
			anInflater864 = new Inflater(true);
		try {
			anInflater864.setInput(class523_sub34.aByteArray10658, 10 + 2349011 * class523_sub34.anInt10661, (class523_sub34.aByteArray10658.length - (8 + (10 + (class523_sub34.anInt10661 * 2349011)))));
			anInflater864.inflate(is);
		} catch (Exception exception) {
			anInflater864.reset();
			throw new RuntimeException("");
		}
		anInflater864.reset();
	}

	public byte[] method1559(byte[] is) {
		Class523_Sub34 class523_sub34 = new Class523_Sub34(is);
		class523_sub34.anInt10661 = 189765723 * (is.length - 4);
		int i = class523_sub34.method16288(-1012406061);
		byte[] is_4_ = new byte[i];
		class523_sub34.anInt10661 = 0;
		method1558(class523_sub34, is_4_, 2118423632);
		return is_4_;
	}

	public byte[] method1560(byte[] is) {
		Class523_Sub34 class523_sub34 = new Class523_Sub34(is);
		class523_sub34.anInt10661 = 189765723 * (is.length - 4);
		int i = class523_sub34.method16288(-698017977);
		byte[] is_5_ = new byte[i];
		class523_sub34.anInt10661 = 0;
		method1558(class523_sub34, is_5_, 2110594685);
		return is_5_;
	}

	public void method1561(Class523_Sub34 class523_sub34, byte[] is) {
		if (31 != (class523_sub34.aByteArray10658[2349011 * class523_sub34.anInt10661]) || -117 != (class523_sub34.aByteArray10658[1 + class523_sub34.anInt10661 * 2349011]))
			throw new RuntimeException("");
		if (anInflater864 == null)
			anInflater864 = new Inflater(true);
		try {
			anInflater864.setInput(class523_sub34.aByteArray10658, 10 + 2349011 * class523_sub34.anInt10661, (class523_sub34.aByteArray10658.length - (8 + (10 + (class523_sub34.anInt10661 * 2349011)))));
			anInflater864.inflate(is);
		} catch (Exception exception) {
			anInflater864.reset();
			throw new RuntimeException("");
		}
		anInflater864.reset();
	}

	public Class79() {
		this(-1, 1000000, 1000000);
	}

	static final void method1562(int i) {
		Class523_Sub34_Sub2 class523_sub34_sub2 = client.aClass116_11058.aClass523_Sub34_Sub2_1431;
		for (int i_6_ = 0; i_6_ < client.anInt11052 * 724589571; i_6_++) {
			int i_7_ = client.anIntArray11053[i_6_];
			Class647_Sub1_Sub3_Sub1_Sub1 class647_sub1_sub3_sub1_sub1 = ((Class647_Sub1_Sub3_Sub1_Sub1) (((Class523_Sub28) client.aClass14_11047.method741((long) i_7_)).anObject10554));
			class523_sub34_sub2.readUnsignedShort(-1866787127);
			int i_8_ = class523_sub34_sub2.readUnsignedByte(-2080031039);
			if ((i_8_ & 0x2) != 0)
				i_8_ += class523_sub34_sub2.readUnsignedByte(-303211068) << 8;
			if ((i_8_ & 0x200) != 0)
				i_8_ += class523_sub34_sub2.readUnsignedByte(1000380013) << 16;
			if ((i_8_ & 0x400000) != 0)
				i_8_ += class523_sub34_sub2.readUnsignedByte(-672657712) << 24;
			if ((i_8_ & 0x1) != 0) {
				if (class647_sub1_sub3_sub1_sub1.aClass300_12175.method5492((byte) -64))
					Class297.method5306(class647_sub1_sub3_sub1_sub1, (short) -21903);
				class647_sub1_sub3_sub1_sub1.method18623((NPCDefinition) (Class174.aClass53_Sub7_1856.getDefinition(class523_sub34_sub2.readBigSmart((byte) -62), (byte) 14)), (i_8_ & 0x800000) == 0, (i_8_ & 0x20000) == 0, true, (byte) -12);
				class647_sub1_sub3_sub1_sub1.method18344((class647_sub1_sub3_sub1_sub1.aClass300_12175.anInt3260 * 1610497933), 2026635853);
				class647_sub1_sub3_sub1_sub1.anInt11922 = ((class647_sub1_sub3_sub1_sub1.aClass300_12175.anInt3285 * 486429345) << 3) * 876423069;
				if (class647_sub1_sub3_sub1_sub1.aClass300_12175.method5492((byte) -79))
					Class451.method7292(class647_sub1_sub3_sub1_sub1.aByte10821, class647_sub1_sub3_sub1_sub1.anIntArray11885[0], class647_sub1_sub3_sub1_sub1.anIntArray11943[0], 0, null, class647_sub1_sub3_sub1_sub1, null, 1956168312);
			}
			if (0 != (i_8_ & 0x200000)) {
				int i_9_ = ((class523_sub34_sub2.aByteArray10658[((class523_sub34_sub2.anInt10661 += 189765723) * 2349011) - 1]) & 0xff);
				for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
					int i_11_ = class523_sub34_sub2.readUnsigned128Byte(2137992688);
					int i_12_ = class523_sub34_sub2.readUnsignedIntV2((short) 20762);
					int i_13_ = class523_sub34_sub2.method16334((byte) 2);
					class647_sub1_sub3_sub1_sub1.method18634(i_11_, i_12_, i_13_, 1812890736);
				}
			}
			if ((i_8_ & 0x40000) != 0) {
				int i_14_ = class523_sub34_sub2.readUnsigned128Byte(1428095698);
				int[] is = new int[8];
				short[] is_15_ = new short[8];
				for (int i_16_ = 0; i_16_ < 8; i_16_++) {
					if ((i_14_ & 1 << i_16_) != 0) {
						is[i_16_] = class523_sub34_sub2.readBigSmart((byte) -35);
						is_15_[i_16_] = (short) class523_sub34_sub2.method16301((short) -32260);
					} else {
						is[i_16_] = -1;
						is_15_[i_16_] = (short) -1;
					}
				}
				class647_sub1_sub3_sub1_sub1.aClass304_12167 = new Class304(is, is_15_);
			}
			if ((i_8_ & 0x8000000) != 0) {
				class647_sub1_sub3_sub1_sub1.aByte11926 = class523_sub34_sub2.readByte((short) -966);
				class647_sub1_sub3_sub1_sub1.aByte11927 = class523_sub34_sub2.readByte((short) -27396);
				class647_sub1_sub3_sub1_sub1.aByte11936 = class523_sub34_sub2.readByteC(-1270473922);
				class647_sub1_sub3_sub1_sub1.aByte11929 = (byte) class523_sub34_sub2.readUnsigned128Byte(1266462747);
				class647_sub1_sub3_sub1_sub1.anInt11924 = ((client.anInt11011 + class523_sub34_sub2.readUnsignedShort128((short) 23817)) * -1819254063);
				class647_sub1_sub3_sub1_sub1.anInt11925 = ((client.anInt11011 + class523_sub34_sub2.readUnsignedShortLE((byte) 14)) * -637108827);
			}
			if (0 != (i_8_ & 0x100000)) {
				int i_17_ = (class647_sub1_sub3_sub1_sub1.aClass300_12175.anIntArray3256).length;
				int i_18_ = 0;
				if (null != (class647_sub1_sub3_sub1_sub1.aClass300_12175.aShortArray3317))
					i_18_ = (class647_sub1_sub3_sub1_sub1.aClass300_12175.aShortArray3317).length;
				int i_19_ = 0;
				if ((class647_sub1_sub3_sub1_sub1.aClass300_12175.aShortArray3263) != null)
					i_18_ = (class647_sub1_sub3_sub1_sub1.aClass300_12175.aShortArray3263).length;
				int i_20_ = class523_sub34_sub2.readUnsignedByte(762831065);
				if ((i_20_ & 0x1) != 1) {
					class523_sub34_sub2.anInt10661 += 379531446;
					int[] is = null;
					if ((i_20_ & 0x2) == 2) {
						is = new int[i_17_];
						for (int i_21_ = 0; i_21_ < i_17_; i_21_++)
							is[i_21_] = class523_sub34_sub2.readBigSmart((byte) -49);
					}
					short[] is_22_ = null;
					if (4 == (i_20_ & 0x4)) {
						is_22_ = new short[i_18_];
						for (int i_23_ = 0; i_23_ < i_18_; i_23_++)
							is_22_[i_23_] = (short) class523_sub34_sub2.readUnsignedShortLE128(1842765954);
					}
					short[] is_24_ = null;
					if ((i_20_ & 0x8) == 8) {
						is_24_ = new short[i_19_];
						for (int i_25_ = 0; i_25_ < i_19_; i_25_++)
							is_24_[i_25_] = (short) class523_sub34_sub2.readUnsignedShort128((short) 15130);
					}
					long l = (long) ((Class647_Sub1_Sub3_Sub1_Sub1.anInt12165 += -763541499) * 1109148877 - 1);
					new Class302(l, is, null, null, null, is_22_, is_24_);
				}
			}
			if (0 != (i_8_ & 0x10)) {
				class647_sub1_sub3_sub1_sub1.anInt11909 = (class523_sub34_sub2.readUnsignedShort128((short) 1417) * -1843265241);
				if (65535 == class647_sub1_sub3_sub1_sub1.anInt11909 * -344760681)
					class647_sub1_sub3_sub1_sub1.anInt11909 = 1843265241;
			}
			if ((i_8_ & 0x4000) != 0) {
				int i_26_ = class523_sub34_sub2.readUnsignedByteC(1691865145);
				int[] is = new int[i_26_];
				int[] is_27_ = new int[i_26_];
				for (int i_28_ = 0; i_28_ < i_26_; i_28_++) {
					int i_29_ = class523_sub34_sub2.readUnsignedShort(-2094556025);
					if (49152 == (i_29_ & 0xc000)) {
						int i_30_ = class523_sub34_sub2.readUnsignedShort(-1428819062);
						is[i_28_] = i_29_ << 16 | i_30_;
					} else
						is[i_28_] = i_29_;
					is_27_[i_28_] = class523_sub34_sub2.readUnsignedShortLE128(1709997883);
				}
				class647_sub1_sub3_sub1_sub1.method18334(is, is_27_, -312192020);
			}
			if ((i_8_ & 0x80) != 0) {
				int i_31_ = class523_sub34_sub2.readUnsignedByte(161916853);
				if (i_31_ > 0) {
					for (int i_32_ = 0; i_32_ < i_31_; i_32_++) {
						int i_33_ = -1;
						int i_34_ = -1;
						int i_35_ = -1;
						int i_36_ = class523_sub34_sub2.readUnsignedSmart(368514876);
						if (i_36_ == 32767) {
							i_36_ = class523_sub34_sub2.readUnsignedSmart(368514876);
							i_34_ = class523_sub34_sub2.readUnsignedSmart(368514876);
							i_33_ = class523_sub34_sub2.readUnsignedSmart(368514876);
							i_35_ = class523_sub34_sub2.readUnsignedSmart(368514876);
						} else if (i_36_ != 32766)
							i_34_ = class523_sub34_sub2.readUnsignedSmart(368514876);
						else {
							i_36_ = -1;
							i_34_ = class523_sub34_sub2.readUnsignedByte128(339871479);
						}
						int i_37_ = class523_sub34_sub2.readUnsignedSmart(368514876);
						class647_sub1_sub3_sub1_sub1.method18340(i_36_, i_34_, i_33_, i_35_, (client.anInt11011), i_37_, -218812152);
					}
				}
				int i_38_ = class523_sub34_sub2.readUnsignedByteC(-1342945036);
				if (i_38_ > 0) {
					for (int i_39_ = 0; i_39_ < i_38_; i_39_++) {
						int i_40_ = class523_sub34_sub2.readUnsignedSmart(368514876);
						int i_41_ = class523_sub34_sub2.readUnsignedSmart(368514876);
						if (32767 != i_41_) {
							int i_42_ = class523_sub34_sub2.readUnsignedSmart(368514876);
							int i_43_ = class523_sub34_sub2.readUnsigned128Byte(1311458301);
							int i_44_ = (i_41_ > 0 ? class523_sub34_sub2.readUnsignedByte(-965962575) : i_43_);
							class647_sub1_sub3_sub1_sub1.method18349(i_40_, client.anInt11011, i_41_, i_42_, i_43_, i_44_, -598699848);
						} else
							class647_sub1_sub3_sub1_sub1.method18341(i_40_, 1705836913);
					}
				}
			}
			if (0 != (i_8_ & 0x10000000)) {
				int i_45_ = class523_sub34_sub2.readUnsignedShort(-1452148576);
				int i_46_ = class523_sub34_sub2.readUnsignedIntV2((short) 19328);
				if (65535 == i_45_)
					i_45_ = -1;
				int i_47_ = class523_sub34_sub2.readUnsignedByte(1468242600);
				int i_48_ = i_47_ & 0x7;
				int i_49_ = i_47_ >> 3 & 0xf;
				if (15 == i_49_)
					i_49_ = -1;
				boolean bool = (i_47_ >> 7 & 0x1) == 1;
				class647_sub1_sub3_sub1_sub1.method18337(i_45_, i_46_, i_48_, i_49_, bool, 4, -133364751);
			}
			if (0 != (i_8_ & 0x400)) {
				int i_50_ = class523_sub34_sub2.readUnsignedShort128((short) 15663);
				int i_51_ = class523_sub34_sub2.readUnsignedIntLE((short) -18989);
				if (65535 == i_50_)
					i_50_ = -1;
				int i_52_ = class523_sub34_sub2.readUnsignedByteC(1864762683);
				int i_53_ = i_52_ & 0x7;
				int i_54_ = i_52_ >> 3 & 0xf;
				if (i_54_ == 15)
					i_54_ = -1;
				boolean bool = 1 == (i_52_ >> 7 & 0x1);
				class647_sub1_sub3_sub1_sub1.method18337(i_50_, i_51_, i_53_, i_54_, bool, 1, 318853182);
			}
			if (0 != (i_8_ & 0x800000)) {
				class647_sub1_sub3_sub1_sub1.aString12169 = class523_sub34_sub2.readString(-716843961);
				if ("".equals(class647_sub1_sub3_sub1_sub1.aString12169) || (class647_sub1_sub3_sub1_sub1.aString12169.equals(class647_sub1_sub3_sub1_sub1.aClass300_12175.aString3314)))
					class647_sub1_sub3_sub1_sub1.aString12169 = (class647_sub1_sub3_sub1_sub1.aClass300_12175.aString3314);
			}
			if ((i_8_ & 0x10000) != 0) {
				class647_sub1_sub3_sub1_sub1.anInterface2_11952.method20(1702722298);
				class523_sub34_sub2.anInt10661 += 379531446;
				int i_55_ = ((class523_sub34_sub2.aByteArray10658[((class523_sub34_sub2.anInt10661 += 189765723) * 2349011) - 1]) & 0xff);
				for (int i_56_ = 0; i_56_ < i_55_; i_56_++) {
					int i_57_ = class523_sub34_sub2.readUnsigned128Byte(1834890296);
					Class474 class474 = ((Class474) Class334.method5910(Class474.method7746(726055570), i_57_, -77011585));
					Class426 class426 = (Class265.aClass98_Sub1_Sub2_2858.method14344(class523_sub34_sub2, class474, (byte) 1));
					class647_sub1_sub3_sub1_sub1.anInterface2_11952.method14(-408785679 * class426.anInt4821, class426.anObject4822, -1579515817);
				}
			}
			if ((i_8_ & 0x800) != 0) {
				class647_sub1_sub3_sub1_sub1.anInt12166 = class523_sub34_sub2.readUnsignedShortLE((byte) 55) * 507824959;
				if (class647_sub1_sub3_sub1_sub1.anInt12166 * -511138625 == 65535)
					class647_sub1_sub3_sub1_sub1.anInt12166 = -507824959;
			}
			if (0 != (i_8_ & 0x20)) {
				int[] is = new int[4];
				for (int i_58_ = 0; i_58_ < 4; i_58_++)
					is[i_58_] = class523_sub34_sub2.readBigSmart((byte) -73);
				int i_59_ = class523_sub34_sub2.readUnsigned128Byte(1654048939);
				Class643.method10538(class647_sub1_sub3_sub1_sub1, is, i_59_, true, -203589407);
			}
			if (0 != (i_8_ & 0x2000)) {
				class647_sub1_sub3_sub1_sub1.anInt11915 = (class523_sub34_sub2.readByte((short) -7980) * -25072087);
				class647_sub1_sub3_sub1_sub1.anInt11917 = class523_sub34_sub2.read128Byte(1542854725) * 245440217;
				class647_sub1_sub3_sub1_sub1.anInt11908 = (class523_sub34_sub2.readByte((short) -29668) * 1206178097);
				class647_sub1_sub3_sub1_sub1.anInt11918 = (class523_sub34_sub2.readByteC(-1270473922) * -360111831);
				class647_sub1_sub3_sub1_sub1.anInt11940 = (class523_sub34_sub2.read128Byte(1542854725) * -2133855093);
				class647_sub1_sub3_sub1_sub1.anInt11893 = (class523_sub34_sub2.readByteC(-1270473922) * -901004921);
				class647_sub1_sub3_sub1_sub1.anInt11954 = (class523_sub34_sub2.readUnsignedShortLE128(1504061531) + client.anInt11011) * -1242459571;
				class647_sub1_sub3_sub1_sub1.anInt11932 = (class523_sub34_sub2.readUnsignedShort128((short) 31204) + client.anInt11011) * 1395835143;
				class647_sub1_sub3_sub1_sub1.anInt11923 = class523_sub34_sub2.readUnsignedShortLE((byte) 94) * 272295045;
				class647_sub1_sub3_sub1_sub1.anInt11941 = -822788275;
				class647_sub1_sub3_sub1_sub1.anInt11946 = 0;
				class647_sub1_sub3_sub1_sub1.anInt11915 += (class647_sub1_sub3_sub1_sub1.anIntArray11885[0] * -25072087);
				class647_sub1_sub3_sub1_sub1.anInt11917 += (245440217 * class647_sub1_sub3_sub1_sub1.anIntArray11943[0]);
				class647_sub1_sub3_sub1_sub1.anInt11908 += (class647_sub1_sub3_sub1_sub1.anIntArray11885[0] * 1206178097);
				class647_sub1_sub3_sub1_sub1.anInt11918 += (-360111831 * class647_sub1_sub3_sub1_sub1.anIntArray11943[0]);
				class647_sub1_sub3_sub1_sub1.anInt11940 += class647_sub1_sub3_sub1_sub1.aByte10821 * -2133855093;
				class647_sub1_sub3_sub1_sub1.anInt11893 += class647_sub1_sub3_sub1_sub1.aByte10821 * -901004921;
			}
			if (0 != (i_8_ & 0x40)) {
				class647_sub1_sub3_sub1_sub1.anInt12161 = class523_sub34_sub2.readUnsignedShortLE128(1688741967) * 1973145421;
				class647_sub1_sub3_sub1_sub1.anInt12162 = class523_sub34_sub2.readUnsignedShortLE((byte) 38) * -1181559979;
			}
			if (0 != (i_8_ & 0x4000000)) {
				int i_60_ = class523_sub34_sub2.readUnsignedShortLE((byte) 6);
				int i_61_ = class523_sub34_sub2.readUnsignedInt((byte) -21);
				if (i_60_ == 65535)
					i_60_ = -1;
				int i_62_ = class523_sub34_sub2.readUnsignedByte128(-425391972);
				int i_63_ = i_62_ & 0x7;
				int i_64_ = i_62_ >> 3 & 0xf;
				if (i_64_ == 15)
					i_64_ = -1;
				boolean bool = (i_62_ >> 7 & 0x1) == 1;
				class647_sub1_sub3_sub1_sub1.method18337(i_60_, i_61_, i_63_, i_64_, bool, 3, 1038503416);
			}
			if (0 != (i_8_ & 0x20000)) {
				class647_sub1_sub3_sub1_sub1.anInt12171 = (class523_sub34_sub2.readUnsignedShort(-818822816) * -1497475163);
				if (1167898669 * class647_sub1_sub3_sub1_sub1.anInt12171 == 65535)
					class647_sub1_sub3_sub1_sub1.anInt12171 = 1584612661 * (class647_sub1_sub3_sub1_sub1.aClass300_12175.anInt3295);
			}
			if ((i_8_ & 0x2000000) != 0) {
				int i_65_ = class523_sub34_sub2.readUnsignedShortLE128(1803329715);
				int i_66_ = class523_sub34_sub2.readUnsignedInt((byte) -65);
				if (65535 == i_65_)
					i_65_ = -1;
				int i_67_ = class523_sub34_sub2.readUnsignedByteC(1274528785);
				int i_68_ = i_67_ & 0x7;
				int i_69_ = i_67_ >> 3 & 0xf;
				if (i_69_ == 15)
					i_69_ = -1;
				boolean bool = (i_67_ >> 7 & 0x1) == 1;
				class647_sub1_sub3_sub1_sub1.method18337(i_65_, i_66_, i_68_, i_69_, bool, 2, 1316973418);
			}
			if (0 != (i_8_ & 0x8))
				class647_sub1_sub3_sub1_sub1.method18636(class523_sub34_sub2.readString(601219518), 0, 0, -2099094812);
			if (0 != (i_8_ & 0x8000)) {
				int i_70_ = (class647_sub1_sub3_sub1_sub1.aClass300_12175.anIntArray3255).length;
				int i_71_ = 0;
				if ((class647_sub1_sub3_sub1_sub1.aClass300_12175.aShortArray3317) != null)
					i_71_ = (class647_sub1_sub3_sub1_sub1.aClass300_12175.aShortArray3317).length;
				int i_72_ = 0;
				if ((class647_sub1_sub3_sub1_sub1.aClass300_12175.aShortArray3263) != null)
					i_72_ = (class647_sub1_sub3_sub1_sub1.aClass300_12175.aShortArray3263).length;
				int i_73_ = class523_sub34_sub2.readUnsigned128Byte(1449198068);
				if (1 == (i_73_ & 0x1))
					class647_sub1_sub3_sub1_sub1.aClass302_12174 = null;
				else {
					class523_sub34_sub2.anInt10661 += 379531446;
					int[] is = null;
					float[] fs = null;
					int[][] is_74_ = null;
					int[][] is_75_ = null;
					if ((i_73_ & 0x2) == 2) {
						is = new int[i_70_];
						if (16 == (i_73_ & 0x10)) {
							fs = new float[i_70_];
							is_74_ = new int[i_70_][3];
							is_75_ = new int[i_70_][3];
						}
						for (int i_76_ = 0; i_76_ < i_70_; i_76_++) {
							is[i_76_] = class523_sub34_sub2.readBigSmart((byte) -12);
							if (16 == (i_73_ & 0x10) && -1 != is[i_76_]) {
								fs[i_76_] = class523_sub34_sub2.method16293(-375470481);
								for (int i_77_ = 0; i_77_ < 3; i_77_++)
									is_74_[i_76_][i_77_] = class523_sub34_sub2.method16268(337763545);
								for (int i_78_ = 0; i_78_ < 3; i_78_++)
									is_75_[i_76_][i_78_] = class523_sub34_sub2.readUnsignedShortLE(-1834933844);
							}
						}
					}
					short[] is_79_ = null;
					if ((i_73_ & 0x4) == 4) {
						is_79_ = new short[i_71_];
						for (int i_80_ = 0; i_80_ < i_71_; i_80_++)
							is_79_[i_80_] = (short) class523_sub34_sub2.readUnsignedShortLE((byte) 125);
					}
					short[] is_81_ = null;
					if (8 == (i_73_ & 0x8)) {
						is_81_ = new short[i_72_];
						for (int i_82_ = 0; i_82_ < i_72_; i_82_++)
							is_81_[i_82_] = (short) class523_sub34_sub2.readUnsignedShort(-243656084);
					}
					long l = (long) ((Class647_Sub1_Sub3_Sub1_Sub1.anInt12164 += -233645755) * -1768304243 - 1);
					class647_sub1_sub3_sub1_sub1.aClass302_12174 = new Class302(l, is, fs, is_74_, is_75_, is_79_, is_81_);
				}
			}
			if (0 != (i_8_ & 0x1000)) {
				int i_83_ = class523_sub34_sub2.readUnsignedByte128(1556341460);
				int[] is = new int[i_83_];
				int[] is_84_ = new int[i_83_];
				int[] is_85_ = new int[i_83_];
				for (int i_86_ = 0; i_86_ < i_83_; i_86_++) {
					int i_87_ = class523_sub34_sub2.readBigSmart((byte) -85);
					is[i_86_] = i_87_;
					is_84_[i_86_] = class523_sub34_sub2.readUnsigned128Byte(1499276450);
					is_85_[i_86_] = class523_sub34_sub2.readUnsignedShortLE128(1467378663);
				}
				Class523.method8667(class647_sub1_sub3_sub1_sub1, is, is_84_, is_85_, (byte) 71);
			}
			if (0 != (i_8_ & 0x20000000))
				class647_sub1_sub3_sub1_sub1.aBool11891 = class523_sub34_sub2.readUnsignedByte128(798050249) == 1;
			if ((i_8_ & 0x80000) != 0) {
				class523_sub34_sub2.anInt10661 += 379531446;
				int i_88_ = ((class523_sub34_sub2.aByteArray10658[((class523_sub34_sub2.anInt10661 += 189765723) * 2349011) - 1]) & 0xff);
				for (int i_89_ = 0; i_89_ < i_88_; i_89_++) {
					int i_90_ = class523_sub34_sub2.readUnsignedByteC(-574110408);
					Class474 class474 = ((Class474) Class334.method5910(Class474.method7746(2041046849), i_90_, -2115939625));
					Class426 class426 = (Class265.aClass98_Sub1_Sub2_2858.method14344(class523_sub34_sub2, class474, (byte) 1));
					class647_sub1_sub3_sub1_sub1.anInterface2_11952.method14(-408785679 * class426.anInt4821, class426.anObject4822, -2122651574);
				}
			}
			if ((i_8_ & 0x1000000) != 0)
				class647_sub1_sub3_sub1_sub1.anInt12176 = (class523_sub34_sub2.readUnsignedByteC(1478583236) * -1577334183);
			if (0 != (i_8_ & 0x4)) {
				int i_91_ = class523_sub34_sub2.readUnsignedShort(-1418973609);
				int i_92_ = class523_sub34_sub2.readUnsignedInt((byte) -109);
				if (65535 == i_91_)
					i_91_ = -1;
				int i_93_ = class523_sub34_sub2.readUnsignedByte(1383834664);
				int i_94_ = i_93_ & 0x7;
				int i_95_ = i_93_ >> 3 & 0xf;
				if (15 == i_95_)
					i_95_ = -1;
				boolean bool = 1 == (i_93_ >> 7 & 0x1);
				class647_sub1_sub3_sub1_sub1.method18337(i_91_, i_92_, i_94_, i_95_, bool, 0, -1534750927);
			}
		}
	}

	public static void method1563(Class242 class242, Class250 class250, int i) {
		Class250 class250_96_ = Class617.method10090(class242, class250, 2025695974);
		int i_97_;
		int i_98_;
		if (class250_96_ == null) {
			i_97_ = Class170.anInt1833 * 2141365743;
			i_98_ = Class254.anInt2742 * -495986435;
		} else {
			i_97_ = 365308179 * class250_96_.anInt2581;
			i_98_ = class250_96_.anInt2543 * -1759297857;
		}
		Class101.method1798(class250, i_97_, i_98_, false, (short) -22216);
		Class33.method924(class250, i_97_, i_98_, (byte) -44);
	}
}
