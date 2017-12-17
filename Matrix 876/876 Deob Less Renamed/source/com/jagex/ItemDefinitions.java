/* Class12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Arrays;

public class ItemDefinitions implements Interface13 {
	public int anInt93;
	short[] modifiedTextureColors;
	int anInt95;
	static final int anInt96 = 6;
	int[] stackIds;
	public int anInt98;
	Interface12 anInterface12_99;
	int anInt100;
	public int anInt101;
	static final int anInt102 = 5;
	public int certTemplateId;
	public int stackable;
	short[] originalModelColors;
	int anInt106;
	byte[] aByteArray107;
	short[] originalTextureColors;
	public int anInt109;
	byte[] aByteArray110;
	public static final int anInt111 = 2;
	public static final int anInt112 = 1;
	public String itemName;
	short[] modifiedModelColors;
	public int anInt115;
	int anInt116;
	public int anInt117;
	public int anInt118;
	int[] anIntArray119;
	public int value;
	public boolean aBool121;
	public String[] groundOptions;
	Class9 aClass9_123;
	int[] anIntArray124;
	int anInt125;
	public int equipSlot;
	int anInt127;
	public int anInt128;
	public String[] inventoryOptions;
	int anInt130;
	int anInt131;
	int anInt132;
	int anInt133;
	int anInt134;
	int anInt135;
	int anInt136;
	int anInt137;
	int anInt138;
	int anInt139;
	int anInt140;
	int anInt141;
	public boolean unnoted;
	int anInt143;
	int anInt144;
	byte[] aByteArray145;
	int[] stackAmounts;
	public int anInt147;
	public int certId;
	public int anInt149;
	public int lendTemplateId;
	public int anInt151;
	public int anInt152;
	String aString153;
	public int anInt154;
	int anInt155;
	public static final int anInt156 = 0;
	int anInt157;
	int anInt158;
	public int anInt159 = 1284356987;
	public int anInt160;
	public boolean aBool161;
	public static short[] aShortArray162 = new short[256];
	Class14 aClass14_163;
	public int[] anIntArray164;
	public int anInt165;
	int anInt166;
	public int anInt167;
	int lendId;
	public int anInt169;
	public boolean aBool170;
	static String aString171 = "</col>";
	public static Class53_Sub21 aClass53_Sub21_172;

	public final boolean method653(boolean bool, Class2 class2) {
		int i;
		int i_0_;
		if (bool) {
			if (null != class2 && class2.anIntArray20 != null) {
				i = class2.anIntArray20[0];
				i_0_ = class2.anIntArray20[1];
			} else {
				i = anInt143 * -478576253;
				i_0_ = -1123046437 * anInt144;
			}
		} else if (null != class2 && class2.anIntArray23 != null) {
			i = class2.anIntArray23[0];
			i_0_ = class2.anIntArray23[1];
		} else {
			i = anInt141 * -1781791225;
			i_0_ = 1731276927 * anInt100;
		}
		if (-1 == i)
			return true;
		boolean bool_1_ = true;
		if (!aClass9_123.aClass472_68.method7663(i, 0, 1089230115))
			bool_1_ = false;
		if (-1 != i_0_ && !aClass9_123.aClass472_68.method7663(i_0_, 0, 1089230115))
			bool_1_ = false;
		return bool_1_;
	}

	public void method74(byte i) {
		if (-1 != certTemplateId * 1178069929)
			method656(((ItemDefinitions) anInterface12_99.getDefinition(certTemplateId * 1178069929, (byte) -42)), ((ItemDefinitions) anInterface12_99.getDefinition(certId * 1322459523, (byte) -35)), aClass9_123.aClass668_72, 345893107);
		else if (-1 != 128437773 * lendTemplateId)
			method657((ItemDefinitions) anInterface12_99.getDefinition(lendTemplateId * 128437773, (byte) -4), ((ItemDefinitions) anInterface12_99.getDefinition(-201387365 * lendId, (byte) -54)), aClass9_123.aClass668_72, (byte) -85);
		else if (-1670847967 * anInt167 != -1)
			method670(((ItemDefinitions) anInterface12_99.getDefinition(-1670847967 * anInt167, (byte) 21)), (ItemDefinitions) anInterface12_99.getDefinition(anInt166 * 1433776417, (byte) 5), aClass9_123.aClass668_72, (byte) -24);
		else if (anInt152 * -60850717 != -1)
			method655((ItemDefinitions) anInterface12_99.getDefinition(-60850717 * anInt152, (byte) -56), ((ItemDefinitions) anInterface12_99.getDefinition(anInt151 * 1674718533, (byte) -54)), aClass9_123.aClass668_72, -1876712480);
		if (!aClass9_123.aBool67 && aBool121) {
			anInt160 = 0;
			groundOptions = aClass9_123.aStringArray74;
			inventoryOptions = aClass9_123.aStringArray73;
			unnoted = false;
			anIntArray164 = null;
			if (null != aClass14_163) {
				boolean bool = false;
				for (Class523 class523 = aClass14_163.method735(-380907255); class523 != null; class523 = aClass14_163.method749(842831725)) {
					Class76 class76 = ((Class76) (aClass9_123.anInterface12_70.getDefinition((int) (1055205983951172633L * class523.aLong7065), (byte) 62)));
					if (class76.aBool852)
						class523.method8661(607052656);
					else
						bool = true;
				}
				if (!bool)
					aClass14_163 = null;
			}
		}
	}

	public void method80(Class523_Sub34 class523_sub34, int i) {
		for (;;) {
			int i_2_ = class523_sub34.readUnsignedByte(817366485);
			if (0 == i_2_)
				break;
			decodeItemDefinitions(class523_sub34, i_2_, (byte) 22);
		}
	}

	void decodeItemDefinitions(Class523_Sub34 buffer, int opcode, byte i_3_) {
		if (opcode == 1)
			anInt106 = buffer.readBigSmart((byte) -121) * -2115815595;
		else if (2 == opcode)
			itemName = buffer.readString(-8096366);
		else if (4 == opcode)
			anInt98 = buffer.readUnsignedShort(-1839102266) * -147627169;
		else if (5 == opcode)
			anInt128 = buffer.readUnsignedShort(-1227739416) * 1322856669;
		else if (opcode == 6)
			anInt101 = buffer.readUnsignedShort(-1972154606) * 836832185;
		else if (opcode == 7) {
			anInt118 = buffer.readUnsignedShort(-928371245) * 189475709;
			if (anInt118 * 136766933 > 32767)
				anInt118 -= 729612288;
		} else if (opcode == 8) {
			anInt117 = buffer.readUnsignedShort(-1003765024) * -13828085;
			if (-354841693 * anInt117 > 32767)
				anInt117 -= 720896;
		} else if (opcode == 11)
			stackable = -310634135;
		else if (12 == opcode)
			value = buffer.readUnsignedInt((byte) -3) * 1428695025;
		else if (opcode == 13)
			equipSlot = buffer.readUnsignedByte(-1900246158) * -2098331581;
		else if (opcode == 14)
			anInt93 = buffer.readUnsignedByte(-2001562395) * -876019101;
		else if (opcode == 16)
			aBool121 = true;
		else if (opcode == 18)
			anInt109 = buffer.readUnsignedShort(-127548965) * 1422039381;
		else if (opcode == 23)
			anInt125 = buffer.readBigSmart((byte) -88) * 1764702283;
		else if (24 == opcode)
			anInt130 = buffer.readBigSmart((byte) -120) * -725383969;
		else if (25 == opcode)
			anInt131 = buffer.readBigSmart((byte) -13) * -501834985;
		else if (opcode == 26)
			anInt132 = buffer.readBigSmart((byte) -2) * 965621719;
		else if (27 == opcode)
			anInt147 = buffer.readUnsignedByte(-1551741182) * 1541735751;
		else if (opcode >= 30 && opcode < 35)
			groundOptions[opcode - 30] = buffer.readString(-1088601075);
		else if (opcode >= 35 && opcode < 40)
			inventoryOptions[opcode - 35] = buffer.readString(-881426018);
		else if (opcode == 40) {
			int i_4_ = buffer.readUnsignedByte(420289962);
			originalModelColors = new short[i_4_];
			modifiedModelColors = new short[i_4_];
			for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
				originalModelColors[i_5_] = (short) buffer.readUnsignedShort(-1492664021);
				modifiedModelColors[i_5_] = (short) buffer.readUnsignedShort(-1999013441);
			}
		} else if (opcode == 41) {
			int i_6_ = buffer.readUnsignedByte(449871444);
			originalTextureColors = new short[i_6_];
			modifiedTextureColors = new short[i_6_];
			for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
				originalTextureColors[i_7_] = (short) buffer.readUnsignedShort(-1199361048);
				modifiedTextureColors[i_7_] = (short) buffer.readUnsignedShort(-1616698527);
			}
		} else if (opcode == 42) {
			int i_8_ = buffer.readUnsignedByte(1891518216);
			aByteArray107 = new byte[i_8_];
			for (int i_9_ = 0; i_9_ < i_8_; i_9_++)
				aByteArray107[i_9_] = buffer.readByte((short) -17263);
		} else if (opcode == 43) {
			anInt169 = buffer.readUnsignedInt((byte) -84) * 1978812681;
			aBool161 = true;
		} else if (opcode == 44) {
			int i_10_ = buffer.readUnsignedShort(-1915869585);
			int i_11_ = 0;
			for (int i_12_ = i_10_; i_12_ > 0; i_12_ >>= 1)
				i_11_++;
			aByteArray110 = new byte[i_11_];
			byte i_13_ = 0;
			for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
				if ((i_10_ & 1 << i_14_) > 0) {
					aByteArray110[i_14_] = i_13_;
					i_13_++;
				} else
					aByteArray110[i_14_] = (byte) -1;
			}
		} else if (45 == opcode) {
			int i_15_ = buffer.readUnsignedShort(-1733204926);
			int i_16_ = 0;
			for (int i_17_ = i_15_; i_17_ > 0; i_17_ >>= 1)
				i_16_++;
			aByteArray145 = new byte[i_16_];
			byte i_18_ = 0;
			for (int i_19_ = 0; i_19_ < i_16_; i_19_++) {
				if ((i_15_ & 1 << i_19_) > 0) {
					aByteArray145[i_19_] = i_18_;
					i_18_++;
				} else
					aByteArray145[i_19_] = (byte) -1;
			}
		} else if (65 == opcode)
			unnoted = true;
		else if (opcode == 78)
			anInt133 = buffer.readBigSmart((byte) -26) * -487566851;
		else if (79 == opcode)
			anInt134 = buffer.readBigSmart((byte) -61) * 341558213;
		else if (90 == opcode)
			anInt141 = buffer.readBigSmart((byte) -29) * -575240265;
		else if (91 == opcode)
			anInt143 = buffer.readBigSmart((byte) -121) * 2098369835;
		else if (opcode == 92)
			anInt100 = buffer.readBigSmart((byte) -69) * -1971417217;
		else if (93 == opcode)
			anInt144 = buffer.readBigSmart((byte) -67) * 1980258387;
		else if (opcode == 94)
			anInt159 = buffer.readUnsignedShort(-1219490509) * -1284356987;
		else if (opcode == 95)
			anInt115 = buffer.readUnsignedShort(-153216722) * 1765366771;
		else if (96 == opcode)
			anInt149 = buffer.readUnsignedByte(991189233) * -1768408769;
		else if (97 == opcode)
			certId = buffer.readUnsignedShort(-1753979919) * 134083883;
		else if (98 == opcode)
			certTemplateId = buffer.readUnsignedShort(-1282500001) * 483125401;
		else if (opcode >= 100 && opcode < 110) {
			if (stackIds == null) {
				stackIds = new int[10];
				stackAmounts = new int[10];
			}
			stackIds[opcode - 100] = buffer.readUnsignedShort(-291605398);
			stackAmounts[opcode - 100] = buffer.readUnsignedShort(-311201851);
		} else if (110 == opcode)
			anInt155 = buffer.readUnsignedShort(-315657902) * 649181085;
		else if (opcode == 111)
			anInt95 = buffer.readUnsignedShort(-377145013) * 1740617981;
		else if (112 == opcode)
			anInt157 = buffer.readUnsignedShort(-1879513525) * 124263763;
		else if (opcode == 113)
			anInt158 = buffer.readByte((short) -11060) * 909099875;
		else if (opcode == 114)
			anInt127 = buffer.readByte((short) -17273) * -664722161;
		else if (opcode == 115)
			anInt160 = buffer.readUnsignedByte(1895727779) * 1762747955;
		else if (opcode == 121)
			lendId = buffer.readUnsignedShort(-735089568) * -2068216941;
		else if (opcode == 122)
			lendTemplateId = buffer.readUnsignedShort(-641177595) * 1730949317;
		else if (125 == opcode) {
			anInt135 = ((buffer.readByte((short) -7838) << 2) * 2078263325);
			anInt137 = ((buffer.readByte((short) -12985) << 2) * -753542941);
			anInt139 = (buffer.readByte((short) 98) << 2) * -276308305;
		} else if (opcode == 126) {
			anInt136 = ((buffer.readByte((short) -20031) << 2) * -153104423);
			anInt138 = (buffer.readByte((short) -7906) << 2) * 655106519;
			anInt140 = ((buffer.readByte((short) -22653) << 2) * -1204287645);
		} else if (127 == opcode || 128 == opcode || 129 == opcode || opcode == 130) {
			buffer.readUnsignedByte(662895408);
			buffer.readUnsignedShort(-2038201123);
		} else if (132 == opcode) {
			int i_20_ = buffer.readUnsignedByte(1216336952);
			anIntArray164 = new int[i_20_];
			for (int i_21_ = 0; i_21_ < i_20_; i_21_++)
				anIntArray164[i_21_] = buffer.readUnsignedShort(-410038610);
		} else if (opcode == 134)
			anInt165 = buffer.readUnsignedByte(365116933) * 356979075;
		else if (opcode == 139)
			anInt166 = buffer.readUnsignedShort(-1154508913) * -88403231;
		else if (opcode == 140)
			anInt167 = buffer.readUnsignedShort(-1762144474) * 1665868257;
		else if (opcode >= 142 && opcode < 147) {
			if (null == anIntArray124) {
				anIntArray124 = new int[6];
				Arrays.fill(anIntArray124, -1);
			}
			anIntArray124[opcode - 142] = buffer.readUnsignedShort(-799355710);
		} else if (opcode >= 150 && opcode < 155) {
			if (anIntArray119 == null) {
				anIntArray119 = new int[5];
				Arrays.fill(anIntArray119, -1);
			}
			anIntArray119[opcode - 150] = buffer.readUnsignedShort(-974873049);
		} else if (opcode != 156) {
			if (opcode == 157)
				aBool170 = true;
			else if (161 == opcode)
				anInt151 = buffer.readUnsignedShort(-1996030760) * -791716467;
			else if (162 == opcode)
				anInt152 = buffer.readUnsignedShort(-1947855339) * 1999876043;
			else if (opcode == 163)
				anInt154 = buffer.readUnsignedShort(-706606906) * 2105619469;
			else if (opcode == 164)
				aString153 = buffer.readString(-1312309234);
			else if (165 == opcode)
				stackable = -621268270;
			else if (opcode == 249) {
				int i_22_ = buffer.readUnsignedByte(1188609510);
				if (null == aClass14_163) {
					int i_23_ = Class628.method10313(i_22_, 2014664209);
					aClass14_163 = new Class14(i_23_);
				}
				for (int i_24_ = 0; i_24_ < i_22_; i_24_++) {
					boolean bool = buffer.readUnsignedByte(268682193) == 1;
					int i_25_ = buffer.read24BitInt(-1795031857);
					Class523 class523;
					if (bool)
						class523 = new Class523_Sub28(buffer.readString(554146152));
					else
						class523 = new Class523_Sub24(buffer.readUnsignedInt((byte) -98));
					aClass14_163.method738(class523, (long) i_25_);
				}
			}
		}
	}

	void method655(ItemDefinitions class12_26_, ItemDefinitions class12_27_, Class668 class668, int i) {
		method658(Class18.aClass18_196, class12_26_, class12_27_, Class39.aClass39_525, class668, -269485448);
	}

	void method656(ItemDefinitions class12_28_, ItemDefinitions class12_29_, Class668 class668, int i) {
		method658(Class18.aClass18_193, class12_28_, class12_29_, null, class668, -269485448);
	}

	void method657(ItemDefinitions class12_30_, ItemDefinitions class12_31_, Class668 class668, byte i) {
		method658(Class18.aClass18_194, class12_30_, class12_31_, Class39.aClass39_384, class668, -269485448);
	}

	void method658(Class18 class18, ItemDefinitions class12_32_, ItemDefinitions class12_33_, Class39 class39, Class668 class668, int i) {
		anInt106 = 1 * class12_32_.anInt106;
		anInt98 = 1 * class12_32_.anInt98;
		anInt128 = 1 * class12_32_.anInt128;
		anInt101 = 1 * class12_32_.anInt101;
		anInt115 = class12_32_.anInt115 * 1;
		anInt118 = 1 * class12_32_.anInt118;
		anInt117 = 1 * class12_32_.anInt117;
		ItemDefinitions class12_34_ = class18 == Class18.aClass18_193 ? class12_32_ : class12_33_;
		originalModelColors = class12_34_.originalModelColors;
		modifiedModelColors = class12_34_.modifiedModelColors;
		aByteArray107 = class12_34_.aByteArray107;
		originalTextureColors = class12_34_.originalTextureColors;
		modifiedTextureColors = class12_34_.modifiedTextureColors;
		itemName = class12_33_.itemName;
		aBool121 = class12_33_.aBool121;
		if (Class18.aClass18_193 == class18) {
			value = class12_33_.value * 1;
			stackable = -310634135;
		} else if (class18 == Class18.aClass18_196) {
			itemName = class12_33_.aString153;
			value = ((int) Math.floor((double) (class12_33_.value * -22288111 / (1659386565 * class12_33_.anInt154))) * 1428695025);
			stackable = -310634135;
			unnoted = class12_33_.unnoted;
			anInt159 = class12_32_.anInt159 * 1;
			anIntArray124 = class12_32_.anIntArray124;
			anIntArray119 = class12_32_.anIntArray119;
			inventoryOptions = new String[5];
			inventoryOptions[0] = Class39.aClass39_400.method1124(class668, (byte) -119);
			inventoryOptions[4] = class39.method1124(class668, (byte) -27);
		} else {
			value = 0;
			stackable = class12_33_.stackable * 1;
			equipSlot = class12_33_.equipSlot * 1;
			anInt93 = class12_33_.anInt93 * 1;
			anInt147 = 1 * class12_33_.anInt147;
			anInt125 = 1 * class12_33_.anInt125;
			anInt130 = 1 * class12_33_.anInt130;
			anInt133 = class12_33_.anInt133 * 1;
			anInt131 = 1 * class12_33_.anInt131;
			anInt132 = class12_33_.anInt132 * 1;
			anInt134 = 1 * class12_33_.anInt134;
			anInt135 = 1 * class12_33_.anInt135;
			anInt136 = 1 * class12_33_.anInt136;
			anInt137 = class12_33_.anInt137 * 1;
			anInt138 = class12_33_.anInt138 * 1;
			anInt139 = class12_33_.anInt139 * 1;
			anInt140 = 1 * class12_33_.anInt140;
			anInt141 = 1 * class12_33_.anInt141;
			anInt100 = 1 * class12_33_.anInt100;
			anInt143 = class12_33_.anInt143 * 1;
			anInt144 = class12_33_.anInt144 * 1;
			anInt159 = 1 * class12_33_.anInt159;
			anInt160 = 1 * class12_33_.anInt160;
			groundOptions = class12_33_.groundOptions;
			aClass14_163 = class12_33_.aClass14_163;
			inventoryOptions = new String[5];
			if (null != class12_33_.inventoryOptions) {
				for (int i_35_ = 0; i_35_ < 4; i_35_++)
					inventoryOptions[i_35_] = class12_33_.inventoryOptions[i_35_];
			}
			inventoryOptions[4] = class39.method1124(class668, (byte) -118);
		}
	}

	public int method659(int i, int i_36_) {
		if (aClass14_163 == null)
			return i_36_;
		Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass14_163.method741((long) i);
		if (class523_sub24 == null)
			return i_36_;
		return class523_sub24.anInt10542 * -677457577;
	}

	public final Class167 method660(Class178 class178, int i, int i_37_, Class623 class623, Class707 class707, int i_38_, int i_39_, int i_40_, int i_41_, byte i_42_) {
		if (null != stackIds && i_37_ > 1) {
			int i_43_ = -1;
			for (int i_44_ = 0; i_44_ < 10; i_44_++) {
				if (i_37_ >= stackAmounts[i_44_] && stackAmounts[i_44_] != 0)
					i_43_ = stackIds[i_44_];
			}
			if (-1 != i_43_)
				return (((ItemDefinitions) anInterface12_99.getDefinition(i_43_, (byte) 61)).method660(class178, i, 1, class623, class707, i_38_, i_39_, i_40_, i_41_, (byte) 0));
		}
		int i_45_ = i;
		if (null != class707)
			i_45_ |= class707.method14173(960997946);
		Class167 class167;
		synchronized (aClass9_123.aClass209_69) {
			class167 = ((Class167) (aClass9_123.aClass209_69.method3767((long) (-1839300959 * anInt116 | -1144788131 * class178.anInt1922 << 29))));
		}
		if (class167 == null || class178.method3068(class167.method2683(), i_45_) != 0) {
			if (class167 != null)
				i_45_ = class178.method3117(i_45_, class167.method2683());
			int i_46_ = i_45_;
			if (originalTextureColors != null)
				i_46_ |= 0x8000;
			if (null != originalModelColors || null != class623)
				i_46_ |= 0x4000;
			if (anInt155 * -819886411 != 128)
				i_46_ |= 0x1;
			if (128 != 249832533 * anInt95)
				i_46_ |= 0x2;
			if (128 != anInt157 * -647090469)
				i_46_ |= 0x4;
			Class179 class179 = Class179.method3485(aClass9_123.aClass472_68, anInt106 * -1609101827, 0);
			if (null == class179)
				return null;
			if (class179.anInt1952 < 13)
				class179.method3494(2);
			class167 = class178.method3115(class179, i_46_, aClass9_123.anInt75 * -417890817, 1991235147 * anInt158 + 64, 850 + 1215680939 * anInt127);
			if (128 != -819886411 * anInt155 || anInt95 * 249832533 != 128 || -647090469 * anInt157 != 128)
				class167.method2691(anInt155 * -819886411, 249832533 * anInt95, -647090469 * anInt157);
			if (originalModelColors != null) {
				for (int i_47_ = 0; i_47_ < originalModelColors.length; i_47_++) {
					if (aByteArray107 != null && i_47_ < aByteArray107.length)
						class167.method2725(originalModelColors[i_47_], (aShortArray162[aByteArray107[i_47_] & 0xff]));
					else
						class167.method2725(originalModelColors[i_47_], modifiedModelColors[i_47_]);
				}
			}
			if (originalTextureColors != null) {
				for (int i_48_ = 0; i_48_ < originalTextureColors.length; i_48_++)
					class167.method2826(originalTextureColors[i_48_], modifiedTextureColors[i_48_]);
			}
			if (class623 != null) {
				for (int i_49_ = 0; i_49_ < 10; i_49_++) {
					for (int i_50_ = 0; i_50_ < Class150.aShortArrayArray1725[i_49_].length; i_50_++) {
						if (class623.anIntArray8102[i_49_] < (Class207.aShortArrayArrayArray2248[i_49_][i_50_]).length)
							class167.method2725(Class150.aShortArrayArray1725[i_49_][i_50_], (Class207.aShortArrayArrayArray2248[i_49_][i_50_][class623.anIntArray8102[i_49_]]));
					}
				}
				for (int i_51_ = 0; i_51_ < 10; i_51_++) {
					for (int i_52_ = 0; i_52_ < Class546.aShortArrayArray7302[i_51_].length; i_52_++) {
						if (class623.anIntArray8103[i_51_] < (Class21.aShortArrayArrayArray214[i_51_][i_52_]).length)
							class167.method2826(Class546.aShortArrayArray7302[i_51_][i_52_], (Class21.aShortArrayArrayArray214[i_51_][i_52_][class623.anIntArray8103[i_51_]]));
					}
				}
			}
			class167.method2769(i_45_);
			synchronized (aClass9_123.aClass209_69) {
				aClass9_123.aClass209_69.method3770(class167, (long) (-1839300959 * anInt116 | class178.anInt1922 * -1144788131 << 29));
			}
		}
		if (null != class707 || 0 != i_41_) {
			class167 = class167.method2681((byte) 1, i_45_, true);
			if (null != class707)
				class707.method14229(class167, 0, 1909564334);
			if (i_41_ != 0)
				class167.method2839(i_38_, i_39_, i_40_, i_41_);
		}
		class167.method2769(i);
		return class167;
	}

	public ItemDefinitions method661(int i, byte i_53_) {
		if (stackIds != null && i > 1) {
			int i_54_ = -1;
			for (int i_55_ = 0; i_55_ < 10; i_55_++) {
				if (i >= stackAmounts[i_55_] && 0 != stackAmounts[i_55_])
					i_54_ = stackIds[i_55_];
			}
			if (-1 != i_54_)
				return (ItemDefinitions) anInterface12_99.getDefinition(i_54_, (byte) 7);
		}
		return this;
	}

	int[] method662(Class178 class178, Class178 class178_56_, int i, int i_57_, int i_58_, boolean bool, int i_59_, Class164 class164, Class623 class623, Class625 class625, int i_60_) {
		Class179 class179 = Class179.method3485(aClass9_123.aClass472_68, anInt106 * -1609101827, 0);
		if (null == class179)
			return null;
		if (class179.anInt1952 < 13)
			class179.method3494(2);
		if (originalModelColors != null) {
			for (int i_61_ = 0; i_61_ < originalModelColors.length; i_61_++) {
				if (null != aByteArray107 && i_61_ < aByteArray107.length)
					class179.method3490(originalModelColors[i_61_], (aShortArray162[aByteArray107[i_61_] & 0xff]));
				else
					class179.method3490(originalModelColors[i_61_], modifiedModelColors[i_61_]);
			}
		}
		if (originalTextureColors != null) {
			for (int i_62_ = 0; i_62_ < originalTextureColors.length; i_62_++)
				class179.method3491(originalTextureColors[i_62_], modifiedTextureColors[i_62_]);
		}
		if (class623 != null) {
			for (int i_63_ = 0; i_63_ < 10; i_63_++) {
				for (int i_64_ = 0; i_64_ < Class150.aShortArrayArray1725[i_63_].length; i_64_++) {
					if (class623.anIntArray8102[i_63_] < (Class207.aShortArrayArrayArray2248[i_63_][i_64_]).length)
						class179.method3490((Class150.aShortArrayArray1725[i_63_][i_64_]), (Class207.aShortArrayArrayArray2248[i_63_][i_64_][(class623.anIntArray8102[i_63_])]));
				}
			}
			for (int i_65_ = 0; i_65_ < 10; i_65_++) {
				for (int i_66_ = 0; i_66_ < Class546.aShortArrayArray7302[i_65_].length; i_66_++) {
					if (class623.anIntArray8103[i_65_] < (Class21.aShortArrayArrayArray214[i_65_][i_66_]).length)
						class179.method3491((Class546.aShortArrayArray7302[i_65_][i_66_]), (Class21.aShortArrayArrayArray214[i_65_][i_66_][(class623.anIntArray8103[i_65_])]));
				}
			}
		}
		int i_67_ = 2048;
		boolean bool_68_ = false;
		if (128 != -819886411 * anInt155 || 128 != 249832533 * anInt95 || anInt157 * -647090469 != 128) {
			bool_68_ = true;
			i_67_ |= 0x7;
		}
		Class167 class167 = class178.method3115(class179, i_67_, 64, 64 + anInt158 * 1991235147, 1215680939 * anInt127 + 768);
		if (!class167.method2727())
			return null;
		if (bool_68_)
			class167.method2691(-819886411 * anInt155, anInt95 * 249832533, -647090469 * anInt157);
		Class148 class148 = null;
		if (certTemplateId * 1178069929 != -1) {
			class148 = aClass9_123.method571(class178, class178_56_, 1322459523 * certId, 10, 1, 0, true, true, 0, class164, class623, class625, anInterface12_99, -1825663203);
			if (class148 == null)
				return null;
		} else if (128437773 * lendTemplateId != -1) {
			class148 = aClass9_123.method571(class178, class178_56_, -201387365 * lendId, i, i_57_, i_58_, false, true, 0, class164, class623, class625, anInterface12_99, -1832710829);
			if (class148 == null)
				return null;
		} else if (-1670847967 * anInt167 != -1) {
			class148 = aClass9_123.method571(class178, class178_56_, anInt166 * 1433776417, i, i_57_, i_58_, false, true, 0, class164, class623, class625, anInterface12_99, -1593956271);
			if (class148 == null)
				return null;
		} else if (anInt152 * -60850717 != -1) {
			class148 = aClass9_123.method571(class178, class178_56_, anInt151 * 1674718533, 10, 1, 0, true, true, 0, class164, class623, class625, anInterface12_99, -630360031);
			if (null == class148)
				return null;
		}
		int i_69_;
		if (bool)
			i_69_ = (int) (1.5 * (double) (anInt98 * -1174947681)) << 2;
		else if (i_57_ == 2)
			i_69_ = (int) ((double) (anInt98 * -1174947681) * 1.04) << 2;
		else
			i_69_ = anInt98 * -1174947681 << 2;
		Class441 class441 = class178.method3125();
		Class441 class441_70_ = class178.method3112();
		class441_70_.method7136(16.0F, 16.0F, 512.0F, 512.0F, 50.0F, 2.14748365E9F, (float) class178.method3039(1418361434).method2875(), (float) class178.method3039(1584318624).method2874());
		class178.method3124(class441_70_);
		class178.method3208(0, 0, class178.method3039(1545261591).method2875(), class178.method3039(1641857576).method2874());
		Class435 class435 = new Class435();
		class178.method3300(class435);
		class178.method3126(0.95F + (float) (Math.random() / 10.0));
		class178.method3460(16777215, 0.95F + (float) (Math.random() / 10.0), 0.95F + (float) (Math.random() / 10.0), -50.0F, -10.0F, -50.0F);
		Class435 class435_71_ = class178.method3113();
		class435_71_.method6855(0.0F, 0.0F, 1.0F, Class433.method6799(-(-1050168005 * anInt115) << 3));
		class435_71_.method6814(0.0F, 1.0F, 0.0F, Class433.method6799(anInt101 * 95914633 << 3));
		class435_71_.method6819((float) (anInt118 * 136766933 << 2), (float) ((((Class433.anIntArray4880[anInt128 * -280549515 << 3]) * i_69_) >> 14) - class167.method2804() / 2 + (-354841693 * anInt117 << 2)), (float) ((-354841693 * anInt117 << 2) + (((Class433.anIntArray4881[anInt128 * -280549515 << 3]) * i_69_) >> 14)));
		class435_71_.method6814(1.0F, 0.0F, 0.0F, Class433.method6799(-280549515 * anInt128 << 3));
		class178.method3378(0, 0, 36, 32);
		class178.method3076(2, 0);
		class178.method3193(0, 0, 36, 32, 0, 0);
		class178.method3349(0, -1, 0);
		class167.method2708(class435_71_, null, 1);
		class178.method3124(class441);
		int[] is = class178.method3293(0, 0, 36, 32);
		if (i_57_ >= 1) {
			is = method663(is, -16777214, (byte) 26);
			if (i_57_ >= 2)
				is = method663(is, -1, (byte) 123);
		}
		if (i_58_ != 0)
			method664(is, i_58_, -1433944889);
		if (128437773 * lendTemplateId != -1)
			class148.method2435(0, 0);
		else if (anInt167 * -1670847967 != -1)
			class148.method2435(0, 0);
		class178.method3103(is, 0, 36, 36, 32, -1877583490).method2435(0, 0);
		if (1178069929 * certTemplateId != -1)
			class148.method2435(0, 0);
		if (-1 != anInt152 * -60850717)
			class148.method2435(0, 0);
		if (1 == i_59_ || i_59_ == 2 && (stackable * -758774055 == 1 || i != 1) && i != -1)
			class164.method2635(Class325.method5738(i, aClass9_123.aClass668_72, class625, -2027576623), 0, 9, -256, -16777215, (byte) 20);
		is = class178.method3293(0, 0, 36, 32);
		for (int i_72_ = 0; i_72_ < is.length; i_72_++) {
			if (0 == (is[i_72_] & 0xffffff))
				is[i_72_] = 0;
			else
				is[i_72_] |= ~0xffffff;
		}
		return is;
	}

	int[] method663(int[] is, int i, byte i_73_) {
		int[] is_74_ = new int[1152];
		int i_75_ = 0;
		for (int i_76_ = 0; i_76_ < 32; i_76_++) {
			for (int i_77_ = 0; i_77_ < 36; i_77_++) {
				int i_78_ = is[i_75_];
				if (0 == i_78_) {
					if (i_77_ > 0 && 0 != is[i_75_ - 1])
						i_78_ = i;
					else if (i_76_ > 0 && is[i_75_ - 36] != 0)
						i_78_ = i;
					else if (i_77_ < 35 && 0 != is[i_75_ + 1])
						i_78_ = i;
					else if (i_76_ < 31 && 0 != is[36 + i_75_])
						i_78_ = i;
				}
				is_74_[i_75_++] = i_78_;
			}
		}
		return is_74_;
	}

	void method664(int[] is, int i, int i_79_) {
		for (int i_80_ = 31; i_80_ > 0; i_80_--) {
			int i_81_ = 36 * i_80_;
			for (int i_82_ = 35; i_82_ > 0; i_82_--) {
				if (is[i_81_ + i_82_] == 0 && 0 != is[i_81_ + i_82_ - 1 - 36])
					is[i_82_ + i_81_] = i;
			}
		}
	}

	public final boolean method665(boolean bool, Class2 class2, int i) {
		int i_83_;
		int i_84_;
		int i_85_;
		if (bool) {
			if (null != class2 && null != class2.anIntArray22) {
				i_83_ = class2.anIntArray22[0];
				i_84_ = class2.anIntArray22[1];
				i_85_ = class2.anIntArray22[2];
			} else {
				i_83_ = anInt131 * -432386905;
				i_84_ = 565816295 * anInt132;
				i_85_ = anInt134 * -2015837427;
			}
		} else if (null != class2 && class2.anIntArray21 != null) {
			i_83_ = class2.anIntArray21[0];
			i_84_ = class2.anIntArray21[1];
			i_85_ = class2.anIntArray21[2];
		} else {
			i_83_ = anInt125 * -1000812189;
			i_84_ = anInt130 * -551995617;
			i_85_ = 1732973397 * anInt133;
		}
		if (-1 == i_83_)
			return true;
		boolean bool_86_ = true;
		if (!aClass9_123.aClass472_68.method7663(i_83_, 0, 1089230115))
			bool_86_ = false;
		if (i_84_ != -1 && !aClass9_123.aClass472_68.method7663(i_84_, 0, 1089230115))
			bool_86_ = false;
		if (i_85_ != -1 && !aClass9_123.aClass472_68.method7663(i_85_, 0, 1089230115))
			bool_86_ = false;
		return bool_86_;
	}

	public final Class179 method666(boolean bool, Class2 class2) {
		int i;
		int i_87_;
		int i_88_;
		if (bool) {
			if (null != class2 && null != class2.anIntArray22) {
				i = class2.anIntArray22[0];
				i_87_ = class2.anIntArray22[1];
				i_88_ = class2.anIntArray22[2];
			} else {
				i = -432386905 * anInt131;
				i_87_ = anInt132 * 565816295;
				i_88_ = anInt134 * -2015837427;
			}
		} else if (class2 != null && null != class2.anIntArray21) {
			i = class2.anIntArray21[0];
			i_87_ = class2.anIntArray21[1];
			i_88_ = class2.anIntArray21[2];
		} else {
			i = -1000812189 * anInt125;
			i_87_ = anInt130 * -551995617;
			i_88_ = 1732973397 * anInt133;
		}
		if (i == -1)
			return null;
		Class179 class179 = Class179.method3485(aClass9_123.aClass472_68, i, 0);
		if (null == class179)
			return null;
		if (class179.anInt1952 < 13)
			class179.method3494(2);
		if (i_87_ != -1) {
			Class179 class179_89_ = Class179.method3485(aClass9_123.aClass472_68, i_87_, 0);
			if (class179_89_.anInt1952 < 13)
				class179_89_.method3494(2);
			if (-1 != i_88_) {
				Class179 class179_90_ = Class179.method3485(aClass9_123.aClass472_68, i_88_, 0);
				if (class179_90_.anInt1952 < 13)
					class179_90_.method3494(2);
				Class179[] class179s = { class179, class179_89_, class179_90_ };
				class179 = new Class179(class179s, 3);
			} else {
				Class179[] class179s = { class179, class179_89_ };
				class179 = new Class179(class179s, 2);
			}
		}
		if (!bool && (anInt135 * -426165707 != 0 || anInt137 * 1289891019 != 0 || anInt139 * -1604044721 != 0))
			class179.method3492(-426165707 * anInt135, 1289891019 * anInt137, -1604044721 * anInt139);
		if (bool && (0 != -1824931735 * anInt136 || 0 != 1564303847 * anInt138 || anInt140 * 1571926603 != 0))
			class179.method3492(-1824931735 * anInt136, 1564303847 * anInt138, 1571926603 * anInt140);
		if (originalModelColors != null) {
			short[] is;
			if (null != class2 && class2.aShortArray25 != null)
				is = class2.aShortArray25;
			else
				is = modifiedModelColors;
			for (int i_91_ = 0; i_91_ < originalModelColors.length; i_91_++)
				class179.method3490(originalModelColors[i_91_], is[i_91_]);
		}
		if (originalTextureColors != null) {
			short[] is;
			if (null != class2 && class2.aShortArray26 != null)
				is = class2.aShortArray26;
			else
				is = modifiedTextureColors;
			for (int i_92_ = 0; i_92_ < originalTextureColors.length; i_92_++)
				class179.method3491(originalTextureColors[i_92_], is[i_92_]);
		}
		return class179;
	}

	public final boolean method667(boolean bool, Class2 class2, byte i) {
		int i_93_;
		int i_94_;
		if (bool) {
			if (null != class2 && class2.anIntArray20 != null) {
				i_93_ = class2.anIntArray20[0];
				i_94_ = class2.anIntArray20[1];
			} else {
				i_93_ = anInt143 * -478576253;
				i_94_ = -1123046437 * anInt144;
			}
		} else if (null != class2 && class2.anIntArray23 != null) {
			i_93_ = class2.anIntArray23[0];
			i_94_ = class2.anIntArray23[1];
		} else {
			i_93_ = anInt141 * -1781791225;
			i_94_ = 1731276927 * anInt100;
		}
		if (-1 == i_93_)
			return true;
		boolean bool_95_ = true;
		if (!aClass9_123.aClass472_68.method7663(i_93_, 0, 1089230115))
			bool_95_ = false;
		if (-1 != i_94_ && !aClass9_123.aClass472_68.method7663(i_94_, 0, 1089230115))
			bool_95_ = false;
		return bool_95_;
	}

	public final boolean method668(boolean bool, Class2 class2) {
		int i;
		int i_96_;
		int i_97_;
		if (bool) {
			if (null != class2 && null != class2.anIntArray22) {
				i = class2.anIntArray22[0];
				i_96_ = class2.anIntArray22[1];
				i_97_ = class2.anIntArray22[2];
			} else {
				i = anInt131 * -432386905;
				i_96_ = 565816295 * anInt132;
				i_97_ = anInt134 * -2015837427;
			}
		} else if (null != class2 && class2.anIntArray21 != null) {
			i = class2.anIntArray21[0];
			i_96_ = class2.anIntArray21[1];
			i_97_ = class2.anIntArray21[2];
		} else {
			i = anInt125 * -1000812189;
			i_96_ = anInt130 * -551995617;
			i_97_ = 1732973397 * anInt133;
		}
		if (-1 == i)
			return true;
		boolean bool_98_ = true;
		if (!aClass9_123.aClass472_68.method7663(i, 0, 1089230115))
			bool_98_ = false;
		if (i_96_ != -1 && !aClass9_123.aClass472_68.method7663(i_96_, 0, 1089230115))
			bool_98_ = false;
		if (i_97_ != -1 && !aClass9_123.aClass472_68.method7663(i_97_, 0, 1089230115))
			bool_98_ = false;
		return bool_98_;
	}

	public int method669(int i, int i_99_, int i_100_) {
		if (aClass14_163 == null)
			return i_99_;
		Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass14_163.method741((long) i);
		if (class523_sub24 == null)
			return i_99_;
		return class523_sub24.anInt10542 * -677457577;
	}

	void method670(ItemDefinitions class12_101_, ItemDefinitions class12_102_, Class668 class668, byte i) {
		method658(Class18.aClass18_195, class12_101_, class12_102_, Class39.aClass39_385, class668, -269485448);
	}

	public void method58(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-1400355529);
			if (0 == i)
				break;
			decodeItemDefinitions(class523_sub34, i, (byte) 82);
		}
	}

	public int method671(int i, int i_103_) {
		if (anIntArray119 == null)
			return -1;
		return anIntArray119[i];
	}

	void method672(ItemDefinitions class12_104_, ItemDefinitions class12_105_, Class668 class668) {
		method658(Class18.aClass18_196, class12_104_, class12_105_, Class39.aClass39_525, class668, -269485448);
	}

	public final Class179 method673(boolean bool, Class2 class2) {
		int i;
		int i_106_;
		if (bool) {
			if (class2 != null && class2.anIntArray20 != null) {
				i = class2.anIntArray20[0];
				i_106_ = class2.anIntArray20[1];
			} else {
				i = anInt143 * -478576253;
				i_106_ = -1123046437 * anInt144;
			}
		} else if (class2 != null && class2.anIntArray23 != null) {
			i = class2.anIntArray23[0];
			i_106_ = class2.anIntArray23[1];
		} else {
			i = anInt141 * -1781791225;
			i_106_ = anInt100 * 1731276927;
		}
		if (-1 == i)
			return null;
		Class179 class179 = Class179.method3485(aClass9_123.aClass472_68, i, 0);
		if (class179.anInt1952 < 13)
			class179.method3494(2);
		if (i_106_ != -1) {
			Class179 class179_107_ = Class179.method3485(aClass9_123.aClass472_68, i_106_, 0);
			if (class179_107_.anInt1952 < 13)
				class179_107_.method3494(2);
			Class179[] class179s = { class179, class179_107_ };
			class179 = new Class179(class179s, 2);
		}
		if (null != originalModelColors) {
			short[] is;
			if (class2 != null && null != class2.aShortArray25)
				is = class2.aShortArray25;
			else
				is = modifiedModelColors;
			for (int i_108_ = 0; i_108_ < originalModelColors.length; i_108_++)
				class179.method3490(originalModelColors[i_108_], is[i_108_]);
		}
		if (null != originalTextureColors) {
			short[] is;
			if (null != class2 && null != class2.aShortArray26)
				is = class2.aShortArray26;
			else
				is = modifiedTextureColors;
			for (int i_109_ = 0; i_109_ < originalTextureColors.length; i_109_++)
				class179.method3491(originalTextureColors[i_109_], is[i_109_]);
		}
		return class179;
	}

	public void method60(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-1212619030);
			if (0 == i)
				break;
			decodeItemDefinitions(class523_sub34, i, (byte) 111);
		}
	}

	public void method63(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(110893265);
			if (0 == i)
				break;
			decodeItemDefinitions(class523_sub34, i, (byte) 10);
		}
	}

	public int method674(int i, short i_110_) {
		if (anIntArray124 == null)
			return -1;
		return anIntArray124[i];
	}

	public final boolean method675(boolean bool, Class2 class2) {
		int i;
		int i_111_;
		if (bool) {
			if (null != class2 && class2.anIntArray20 != null) {
				i = class2.anIntArray20[0];
				i_111_ = class2.anIntArray20[1];
			} else {
				i = anInt143 * -478576253;
				i_111_ = -1123046437 * anInt144;
			}
		} else if (null != class2 && class2.anIntArray23 != null) {
			i = class2.anIntArray23[0];
			i_111_ = class2.anIntArray23[1];
		} else {
			i = anInt141 * -1781791225;
			i_111_ = 1731276927 * anInt100;
		}
		if (-1 == i)
			return true;
		boolean bool_112_ = true;
		if (!aClass9_123.aClass472_68.method7663(i, 0, 1089230115))
			bool_112_ = false;
		if (-1 != i_111_ && !aClass9_123.aClass472_68.method7663(i_111_, 0, 1089230115))
			bool_112_ = false;
		return bool_112_;
	}

	public void method78() {
		if (-1 != certTemplateId * 1178069929)
			method656(((ItemDefinitions) anInterface12_99.getDefinition(certTemplateId * 1178069929, (byte) -4)), ((ItemDefinitions) anInterface12_99.getDefinition(certId * 1322459523, (byte) -115)), aClass9_123.aClass668_72, 345893107);
		else if (-1 != 128437773 * lendTemplateId)
			method657((ItemDefinitions) anInterface12_99.getDefinition(lendTemplateId * 128437773, (byte) 113), ((ItemDefinitions) anInterface12_99.getDefinition(-201387365 * lendId, (byte) -17)), aClass9_123.aClass668_72, (byte) -1);
		else if (-1670847967 * anInt167 != -1)
			method670(((ItemDefinitions) anInterface12_99.getDefinition(-1670847967 * anInt167, (byte) -27)), ((ItemDefinitions) anInterface12_99.getDefinition(anInt166 * 1433776417, (byte) -16)), aClass9_123.aClass668_72, (byte) 50);
		else if (anInt152 * -60850717 != -1)
			method655((ItemDefinitions) anInterface12_99.getDefinition(-60850717 * anInt152, (byte) 65), ((ItemDefinitions) anInterface12_99.getDefinition(anInt151 * 1674718533, (byte) -52)), aClass9_123.aClass668_72, -1714491609);
		if (!aClass9_123.aBool67 && aBool121) {
			anInt160 = 0;
			groundOptions = aClass9_123.aStringArray74;
			inventoryOptions = aClass9_123.aStringArray73;
			unnoted = false;
			anIntArray164 = null;
			if (null != aClass14_163) {
				boolean bool = false;
				for (Class523 class523 = aClass14_163.method735(-380907255); class523 != null; class523 = aClass14_163.method749(1124695633)) {
					Class76 class76 = ((Class76) (aClass9_123.anInterface12_70.getDefinition((int) (1055205983951172633L * class523.aLong7065), (byte) 110)));
					if (class76.aBool852)
						class523.method8661(607052656);
					else
						bool = true;
				}
				if (!bool)
					aClass14_163 = null;
			}
		}
	}

	public void method79() {
		if (-1 != certTemplateId * 1178069929)
			method656(((ItemDefinitions) anInterface12_99.getDefinition(certTemplateId * 1178069929, (byte) -40)), ((ItemDefinitions) anInterface12_99.getDefinition(certId * 1322459523, (byte) -10)), aClass9_123.aClass668_72, 345893107);
		else if (-1 != 128437773 * lendTemplateId)
			method657((ItemDefinitions) anInterface12_99.getDefinition(lendTemplateId * 128437773, (byte) 80), ((ItemDefinitions) anInterface12_99.getDefinition(-201387365 * lendId, (byte) -78)), aClass9_123.aClass668_72, (byte) -34);
		else if (-1670847967 * anInt167 != -1)
			method670(((ItemDefinitions) anInterface12_99.getDefinition(-1670847967 * anInt167, (byte) -6)), ((ItemDefinitions) anInterface12_99.getDefinition(anInt166 * 1433776417, (byte) -8)), aClass9_123.aClass668_72, (byte) 68);
		else if (anInt152 * -60850717 != -1)
			method655((ItemDefinitions) anInterface12_99.getDefinition(-60850717 * anInt152, (byte) 76), ((ItemDefinitions) anInterface12_99.getDefinition(anInt151 * 1674718533, (byte) -15)), aClass9_123.aClass668_72, -1853260526);
		if (!aClass9_123.aBool67 && aBool121) {
			anInt160 = 0;
			groundOptions = aClass9_123.aStringArray74;
			inventoryOptions = aClass9_123.aStringArray73;
			unnoted = false;
			anIntArray164 = null;
			if (null != aClass14_163) {
				boolean bool = false;
				for (Class523 class523 = aClass14_163.method735(-380907255); class523 != null; class523 = aClass14_163.method749(1531812635)) {
					Class76 class76 = ((Class76) (aClass9_123.anInterface12_70.getDefinition((int) (1055205983951172633L * class523.aLong7065), (byte) 92)));
					if (class76.aBool852)
						class523.method8661(607052656);
					else
						bool = true;
				}
				if (!bool)
					aClass14_163 = null;
			}
		}
	}

	public void method77() {
		if (-1 != certTemplateId * 1178069929)
			method656(((ItemDefinitions) anInterface12_99.getDefinition(certTemplateId * 1178069929, (byte) -14)), ((ItemDefinitions) anInterface12_99.getDefinition(certId * 1322459523, (byte) 101)), aClass9_123.aClass668_72, 345893107);
		else if (-1 != 128437773 * lendTemplateId)
			method657((ItemDefinitions) anInterface12_99.getDefinition(lendTemplateId * 128437773, (byte) -23), ((ItemDefinitions) anInterface12_99.getDefinition(-201387365 * lendId, (byte) -77)), aClass9_123.aClass668_72, (byte) -15);
		else if (-1670847967 * anInt167 != -1)
			method670(((ItemDefinitions) anInterface12_99.getDefinition(-1670847967 * anInt167, (byte) -27)), ((ItemDefinitions) anInterface12_99.getDefinition(anInt166 * 1433776417, (byte) 12)), aClass9_123.aClass668_72, (byte) -29);
		else if (anInt152 * -60850717 != -1)
			method655((ItemDefinitions) anInterface12_99.getDefinition(-60850717 * anInt152, (byte) -66), ((ItemDefinitions) anInterface12_99.getDefinition(anInt151 * 1674718533, (byte) 64)), aClass9_123.aClass668_72, -1962890984);
		if (!aClass9_123.aBool67 && aBool121) {
			anInt160 = 0;
			groundOptions = aClass9_123.aStringArray74;
			inventoryOptions = aClass9_123.aStringArray73;
			unnoted = false;
			anIntArray164 = null;
			if (null != aClass14_163) {
				boolean bool = false;
				for (Class523 class523 = aClass14_163.method735(-380907255); class523 != null; class523 = aClass14_163.method749(632406506)) {
					Class76 class76 = ((Class76) (aClass9_123.anInterface12_70.getDefinition((int) (1055205983951172633L * class523.aLong7065), (byte) 39)));
					if (class76.aBool852)
						class523.method8661(607052656);
					else
						bool = true;
				}
				if (!bool)
					aClass14_163 = null;
			}
		}
	}

	public void method73() {
		if (-1 != certTemplateId * 1178069929)
			method656(((ItemDefinitions) anInterface12_99.getDefinition(certTemplateId * 1178069929, (byte) 66)), ((ItemDefinitions) anInterface12_99.getDefinition(certId * 1322459523, (byte) -30)), aClass9_123.aClass668_72, 345893107);
		else if (-1 != 128437773 * lendTemplateId)
			method657((ItemDefinitions) anInterface12_99.getDefinition(lendTemplateId * 128437773, (byte) -7), ((ItemDefinitions) anInterface12_99.getDefinition(-201387365 * lendId, (byte) -85)), aClass9_123.aClass668_72, (byte) -88);
		else if (-1670847967 * anInt167 != -1)
			method670(((ItemDefinitions) anInterface12_99.getDefinition(-1670847967 * anInt167, (byte) 19)), ((ItemDefinitions) anInterface12_99.getDefinition(anInt166 * 1433776417, (byte) -18)), aClass9_123.aClass668_72, (byte) 57);
		else if (anInt152 * -60850717 != -1)
			method655((ItemDefinitions) anInterface12_99.getDefinition(-60850717 * anInt152, (byte) 24), ((ItemDefinitions) anInterface12_99.getDefinition(anInt151 * 1674718533, (byte) -32)), aClass9_123.aClass668_72, -1972155568);
		if (!aClass9_123.aBool67 && aBool121) {
			anInt160 = 0;
			groundOptions = aClass9_123.aStringArray74;
			inventoryOptions = aClass9_123.aStringArray73;
			unnoted = false;
			anIntArray164 = null;
			if (null != aClass14_163) {
				boolean bool = false;
				for (Class523 class523 = aClass14_163.method735(-380907255); class523 != null; class523 = aClass14_163.method749(376106353)) {
					Class76 class76 = ((Class76) (aClass9_123.anInterface12_70.getDefinition((int) (1055205983951172633L * class523.aLong7065), (byte) -8)));
					if (class76.aBool852)
						class523.method8661(607052656);
					else
						bool = true;
				}
				if (!bool)
					aClass14_163 = null;
			}
		}
	}

	void method676(Class523_Sub34 class523_sub34, int i) {
		if (i == 1)
			anInt106 = class523_sub34.readBigSmart((byte) -100) * -2115815595;
		else if (2 == i)
			itemName = class523_sub34.readString(-1244773266);
		else if (4 == i)
			anInt98 = class523_sub34.readUnsignedShort(-32162605) * -147627169;
		else if (5 == i)
			anInt128 = class523_sub34.readUnsignedShort(-1057239100) * 1322856669;
		else if (i == 6)
			anInt101 = class523_sub34.readUnsignedShort(-858269453) * 836832185;
		else if (i == 7) {
			anInt118 = class523_sub34.readUnsignedShort(-1447573840) * 189475709;
			if (anInt118 * 136766933 > 32767)
				anInt118 -= 729612288;
		} else if (i == 8) {
			anInt117 = class523_sub34.readUnsignedShort(-1482367412) * -13828085;
			if (-354841693 * anInt117 > 32767)
				anInt117 -= 720896;
		} else if (i == 11)
			stackable = -310634135;
		else if (12 == i)
			value = class523_sub34.readUnsignedInt((byte) -7) * 1428695025;
		else if (i == 13)
			equipSlot = class523_sub34.readUnsignedByte(-1819140747) * -2098331581;
		else if (i == 14)
			anInt93 = class523_sub34.readUnsignedByte(1370604442) * -876019101;
		else if (i == 16)
			aBool121 = true;
		else if (i == 18)
			anInt109 = class523_sub34.readUnsignedShort(-263099264) * 1422039381;
		else if (i == 23)
			anInt125 = class523_sub34.readBigSmart((byte) -98) * 1764702283;
		else if (24 == i)
			anInt130 = class523_sub34.readBigSmart((byte) -26) * -725383969;
		else if (25 == i)
			anInt131 = class523_sub34.readBigSmart((byte) -19) * -501834985;
		else if (i == 26)
			anInt132 = class523_sub34.readBigSmart((byte) -58) * 965621719;
		else if (27 == i)
			anInt147 = class523_sub34.readUnsignedByte(-1481876681) * 1541735751;
		else if (i >= 30 && i < 35)
			groundOptions[i - 30] = class523_sub34.readString(-1148838567);
		else if (i >= 35 && i < 40)
			inventoryOptions[i - 35] = class523_sub34.readString(-1846015710);
		else if (i == 40) {
			int i_113_ = class523_sub34.readUnsignedByte(1825696938);
			originalModelColors = new short[i_113_];
			modifiedModelColors = new short[i_113_];
			for (int i_114_ = 0; i_114_ < i_113_; i_114_++) {
				originalModelColors[i_114_] = (short) class523_sub34.readUnsignedShort(-886649584);
				modifiedModelColors[i_114_] = (short) class523_sub34.readUnsignedShort(-417973526);
			}
		} else if (i == 41) {
			int i_115_ = class523_sub34.readUnsignedByte(-1968684130);
			originalTextureColors = new short[i_115_];
			modifiedTextureColors = new short[i_115_];
			for (int i_116_ = 0; i_116_ < i_115_; i_116_++) {
				originalTextureColors[i_116_] = (short) class523_sub34.readUnsignedShort(-1004284484);
				modifiedTextureColors[i_116_] = (short) class523_sub34.readUnsignedShort(-524164094);
			}
		} else if (i == 42) {
			int i_117_ = class523_sub34.readUnsignedByte(2120310887);
			aByteArray107 = new byte[i_117_];
			for (int i_118_ = 0; i_118_ < i_117_; i_118_++)
				aByteArray107[i_118_] = class523_sub34.readByte((short) -31673);
		} else if (i == 43) {
			anInt169 = class523_sub34.readUnsignedInt((byte) -17) * 1978812681;
			aBool161 = true;
		} else if (i == 44) {
			int i_119_ = class523_sub34.readUnsignedShort(-2016741115);
			int i_120_ = 0;
			for (int i_121_ = i_119_; i_121_ > 0; i_121_ >>= 1)
				i_120_++;
			aByteArray110 = new byte[i_120_];
			byte i_122_ = 0;
			for (int i_123_ = 0; i_123_ < i_120_; i_123_++) {
				if ((i_119_ & 1 << i_123_) > 0) {
					aByteArray110[i_123_] = i_122_;
					i_122_++;
				} else
					aByteArray110[i_123_] = (byte) -1;
			}
		} else if (45 == i) {
			int i_124_ = class523_sub34.readUnsignedShort(-949551670);
			int i_125_ = 0;
			for (int i_126_ = i_124_; i_126_ > 0; i_126_ >>= 1)
				i_125_++;
			aByteArray145 = new byte[i_125_];
			byte i_127_ = 0;
			for (int i_128_ = 0; i_128_ < i_125_; i_128_++) {
				if ((i_124_ & 1 << i_128_) > 0) {
					aByteArray145[i_128_] = i_127_;
					i_127_++;
				} else
					aByteArray145[i_128_] = (byte) -1;
			}
		} else if (65 == i)
			unnoted = true;
		else if (i == 78)
			anInt133 = class523_sub34.readBigSmart((byte) -98) * -487566851;
		else if (79 == i)
			anInt134 = class523_sub34.readBigSmart((byte) -9) * 341558213;
		else if (90 == i)
			anInt141 = class523_sub34.readBigSmart((byte) -4) * -575240265;
		else if (91 == i)
			anInt143 = class523_sub34.readBigSmart((byte) -121) * 2098369835;
		else if (i == 92)
			anInt100 = class523_sub34.readBigSmart((byte) -124) * -1971417217;
		else if (93 == i)
			anInt144 = class523_sub34.readBigSmart((byte) -89) * 1980258387;
		else if (i == 94)
			anInt159 = class523_sub34.readUnsignedShort(-572509606) * -1284356987;
		else if (i == 95)
			anInt115 = class523_sub34.readUnsignedShort(-128389623) * 1765366771;
		else if (96 == i)
			anInt149 = class523_sub34.readUnsignedByte(-837981619) * -1768408769;
		else if (97 == i)
			certId = class523_sub34.readUnsignedShort(-1043321785) * 134083883;
		else if (98 == i)
			certTemplateId = class523_sub34.readUnsignedShort(-613708133) * 483125401;
		else if (i >= 100 && i < 110) {
			if (stackIds == null) {
				stackIds = new int[10];
				stackAmounts = new int[10];
			}
			stackIds[i - 100] = class523_sub34.readUnsignedShort(-1372870476);
			stackAmounts[i - 100] = class523_sub34.readUnsignedShort(-1660490518);
		} else if (110 == i)
			anInt155 = class523_sub34.readUnsignedShort(-2060089620) * 649181085;
		else if (i == 111)
			anInt95 = class523_sub34.readUnsignedShort(-1429195346) * 1740617981;
		else if (112 == i)
			anInt157 = class523_sub34.readUnsignedShort(-692360011) * 124263763;
		else if (i == 113)
			anInt158 = class523_sub34.readByte((short) -4074) * 909099875;
		else if (i == 114)
			anInt127 = class523_sub34.readByte((short) -16202) * -664722161;
		else if (i == 115)
			anInt160 = class523_sub34.readUnsignedByte(-1271001619) * 1762747955;
		else if (i == 121)
			lendId = class523_sub34.readUnsignedShort(-2072982803) * -2068216941;
		else if (i == 122)
			lendTemplateId = class523_sub34.readUnsignedShort(-1377229781) * 1730949317;
		else if (125 == i) {
			anInt135 = ((class523_sub34.readByte((short) -5233) << 2) * 2078263325);
			anInt137 = ((class523_sub34.readByte((short) -22843) << 2) * -753542941);
			anInt139 = (class523_sub34.readByte((short) -646) << 2) * -276308305;
		} else if (i == 126) {
			anInt136 = ((class523_sub34.readByte((short) -30669) << 2) * -153104423);
			anInt138 = ((class523_sub34.readByte((short) -13383) << 2) * 655106519);
			anInt140 = ((class523_sub34.readByte((short) -21637) << 2) * -1204287645);
		} else if (127 == i || 128 == i || 129 == i || i == 130) {
			class523_sub34.readUnsignedByte(635959243);
			class523_sub34.readUnsignedShort(-1857756790);
		} else if (132 == i) {
			int i_129_ = class523_sub34.readUnsignedByte(1817700419);
			anIntArray164 = new int[i_129_];
			for (int i_130_ = 0; i_130_ < i_129_; i_130_++)
				anIntArray164[i_130_] = class523_sub34.readUnsignedShort(-1160833065);
		} else if (i == 134)
			anInt165 = class523_sub34.readUnsignedByte(-827395368) * 356979075;
		else if (i == 139)
			anInt166 = class523_sub34.readUnsignedShort(-1903886691) * -88403231;
		else if (i == 140)
			anInt167 = class523_sub34.readUnsignedShort(-444067733) * 1665868257;
		else if (i >= 142 && i < 147) {
			if (null == anIntArray124) {
				anIntArray124 = new int[6];
				Arrays.fill(anIntArray124, -1);
			}
			anIntArray124[i - 142] = class523_sub34.readUnsignedShort(-1472812421);
		} else if (i >= 150 && i < 155) {
			if (anIntArray119 == null) {
				anIntArray119 = new int[5];
				Arrays.fill(anIntArray119, -1);
			}
			anIntArray119[i - 150] = class523_sub34.readUnsignedShort(-1979862177);
		} else if (i != 156) {
			if (i == 157)
				aBool170 = true;
			else if (161 == i)
				anInt151 = class523_sub34.readUnsignedShort(-1549953273) * -791716467;
			else if (162 == i)
				anInt152 = class523_sub34.readUnsignedShort(-640094117) * 1999876043;
			else if (i == 163)
				anInt154 = class523_sub34.readUnsignedShort(-394573006) * 2105619469;
			else if (i == 164)
				aString153 = class523_sub34.readString(70353913);
			else if (165 == i)
				stackable = -621268270;
			else if (i == 249) {
				int i_131_ = class523_sub34.readUnsignedByte(-1123936209);
				if (null == aClass14_163) {
					int i_132_ = Class628.method10313(i_131_, 2010509991);
					aClass14_163 = new Class14(i_132_);
				}
				for (int i_133_ = 0; i_133_ < i_131_; i_133_++) {
					boolean bool = class523_sub34.readUnsignedByte(-1870410060) == 1;
					int i_134_ = class523_sub34.read24BitInt(-616365428);
					Class523 class523;
					if (bool)
						class523 = new Class523_Sub28(class523_sub34.readString(-453369597));
					else
						class523 = new Class523_Sub24(class523_sub34.readUnsignedInt((byte) -88));
					aClass14_163.method738(class523, (long) i_134_);
				}
			}
		}
	}

	void method677(Class523_Sub34 class523_sub34, int i) {
		if (i == 1)
			anInt106 = class523_sub34.readBigSmart((byte) -93) * -2115815595;
		else if (2 == i)
			itemName = class523_sub34.readString(-961894555);
		else if (4 == i)
			anInt98 = class523_sub34.readUnsignedShort(-1752422319) * -147627169;
		else if (5 == i)
			anInt128 = class523_sub34.readUnsignedShort(-1929361545) * 1322856669;
		else if (i == 6)
			anInt101 = class523_sub34.readUnsignedShort(-453454945) * 836832185;
		else if (i == 7) {
			anInt118 = class523_sub34.readUnsignedShort(-279680244) * 189475709;
			if (anInt118 * 136766933 > 32767)
				anInt118 -= 729612288;
		} else if (i == 8) {
			anInt117 = class523_sub34.readUnsignedShort(-1503436454) * -13828085;
			if (-354841693 * anInt117 > 32767)
				anInt117 -= 720896;
		} else if (i == 11)
			stackable = -310634135;
		else if (12 == i)
			value = class523_sub34.readUnsignedInt((byte) -110) * 1428695025;
		else if (i == 13)
			equipSlot = class523_sub34.readUnsignedByte(-476873977) * -2098331581;
		else if (i == 14)
			anInt93 = class523_sub34.readUnsignedByte(838504054) * -876019101;
		else if (i == 16)
			aBool121 = true;
		else if (i == 18)
			anInt109 = class523_sub34.readUnsignedShort(-524705879) * 1422039381;
		else if (i == 23)
			anInt125 = class523_sub34.readBigSmart((byte) -85) * 1764702283;
		else if (24 == i)
			anInt130 = class523_sub34.readBigSmart((byte) -5) * -725383969;
		else if (25 == i)
			anInt131 = class523_sub34.readBigSmart((byte) -98) * -501834985;
		else if (i == 26)
			anInt132 = class523_sub34.readBigSmart((byte) -34) * 965621719;
		else if (27 == i)
			anInt147 = class523_sub34.readUnsignedByte(-1478607240) * 1541735751;
		else if (i >= 30 && i < 35)
			groundOptions[i - 30] = class523_sub34.readString(-1124051183);
		else if (i >= 35 && i < 40)
			inventoryOptions[i - 35] = class523_sub34.readString(-1909285744);
		else if (i == 40) {
			int i_135_ = class523_sub34.readUnsignedByte(-1640051363);
			originalModelColors = new short[i_135_];
			modifiedModelColors = new short[i_135_];
			for (int i_136_ = 0; i_136_ < i_135_; i_136_++) {
				originalModelColors[i_136_] = (short) class523_sub34.readUnsignedShort(-1621612417);
				modifiedModelColors[i_136_] = (short) class523_sub34.readUnsignedShort(-162082558);
			}
		} else if (i == 41) {
			int i_137_ = class523_sub34.readUnsignedByte(-776771233);
			originalTextureColors = new short[i_137_];
			modifiedTextureColors = new short[i_137_];
			for (int i_138_ = 0; i_138_ < i_137_; i_138_++) {
				originalTextureColors[i_138_] = (short) class523_sub34.readUnsignedShort(-488993597);
				modifiedTextureColors[i_138_] = (short) class523_sub34.readUnsignedShort(-538691979);
			}
		} else if (i == 42) {
			int i_139_ = class523_sub34.readUnsignedByte(-916521959);
			aByteArray107 = new byte[i_139_];
			for (int i_140_ = 0; i_140_ < i_139_; i_140_++)
				aByteArray107[i_140_] = class523_sub34.readByte((short) -30777);
		} else if (i == 43) {
			anInt169 = class523_sub34.readUnsignedInt((byte) -71) * 1978812681;
			aBool161 = true;
		} else if (i == 44) {
			int i_141_ = class523_sub34.readUnsignedShort(-690767404);
			int i_142_ = 0;
			for (int i_143_ = i_141_; i_143_ > 0; i_143_ >>= 1)
				i_142_++;
			aByteArray110 = new byte[i_142_];
			byte i_144_ = 0;
			for (int i_145_ = 0; i_145_ < i_142_; i_145_++) {
				if ((i_141_ & 1 << i_145_) > 0) {
					aByteArray110[i_145_] = i_144_;
					i_144_++;
				} else
					aByteArray110[i_145_] = (byte) -1;
			}
		} else if (45 == i) {
			int i_146_ = class523_sub34.readUnsignedShort(-1781024393);
			int i_147_ = 0;
			for (int i_148_ = i_146_; i_148_ > 0; i_148_ >>= 1)
				i_147_++;
			aByteArray145 = new byte[i_147_];
			byte i_149_ = 0;
			for (int i_150_ = 0; i_150_ < i_147_; i_150_++) {
				if ((i_146_ & 1 << i_150_) > 0) {
					aByteArray145[i_150_] = i_149_;
					i_149_++;
				} else
					aByteArray145[i_150_] = (byte) -1;
			}
		} else if (65 == i)
			unnoted = true;
		else if (i == 78)
			anInt133 = class523_sub34.readBigSmart((byte) -50) * -487566851;
		else if (79 == i)
			anInt134 = class523_sub34.readBigSmart((byte) -16) * 341558213;
		else if (90 == i)
			anInt141 = class523_sub34.readBigSmart((byte) -85) * -575240265;
		else if (91 == i)
			anInt143 = class523_sub34.readBigSmart((byte) -86) * 2098369835;
		else if (i == 92)
			anInt100 = class523_sub34.readBigSmart((byte) -110) * -1971417217;
		else if (93 == i)
			anInt144 = class523_sub34.readBigSmart((byte) -94) * 1980258387;
		else if (i == 94)
			anInt159 = class523_sub34.readUnsignedShort(-660659857) * -1284356987;
		else if (i == 95)
			anInt115 = class523_sub34.readUnsignedShort(-1868346275) * 1765366771;
		else if (96 == i)
			anInt149 = class523_sub34.readUnsignedByte(-98295402) * -1768408769;
		else if (97 == i)
			certId = class523_sub34.readUnsignedShort(-1388687692) * 134083883;
		else if (98 == i)
			certTemplateId = class523_sub34.readUnsignedShort(-709604888) * 483125401;
		else if (i >= 100 && i < 110) {
			if (stackIds == null) {
				stackIds = new int[10];
				stackAmounts = new int[10];
			}
			stackIds[i - 100] = class523_sub34.readUnsignedShort(-868978299);
			stackAmounts[i - 100] = class523_sub34.readUnsignedShort(-350380254);
		} else if (110 == i)
			anInt155 = class523_sub34.readUnsignedShort(-1412075756) * 649181085;
		else if (i == 111)
			anInt95 = class523_sub34.readUnsignedShort(-531964855) * 1740617981;
		else if (112 == i)
			anInt157 = class523_sub34.readUnsignedShort(-57486039) * 124263763;
		else if (i == 113)
			anInt158 = class523_sub34.readByte((short) -19241) * 909099875;
		else if (i == 114)
			anInt127 = class523_sub34.readByte((short) -8370) * -664722161;
		else if (i == 115)
			anInt160 = class523_sub34.readUnsignedByte(2127307551) * 1762747955;
		else if (i == 121)
			lendId = class523_sub34.readUnsignedShort(-1561426643) * -2068216941;
		else if (i == 122)
			lendTemplateId = class523_sub34.readUnsignedShort(-394224056) * 1730949317;
		else if (125 == i) {
			anInt135 = ((class523_sub34.readByte((short) -14453) << 2) * 2078263325);
			anInt137 = ((class523_sub34.readByte((short) -13942) << 2) * -753542941);
			anInt139 = (class523_sub34.readByte((short) -410) << 2) * -276308305;
		} else if (i == 126) {
			anInt136 = ((class523_sub34.readByte((short) -13141) << 2) * -153104423);
			anInt138 = (class523_sub34.readByte((short) -9494) << 2) * 655106519;
			anInt140 = ((class523_sub34.readByte((short) -7134) << 2) * -1204287645);
		} else if (127 == i || 128 == i || 129 == i || i == 130) {
			class523_sub34.readUnsignedByte(1501527749);
			class523_sub34.readUnsignedShort(-540665566);
		} else if (132 == i) {
			int i_151_ = class523_sub34.readUnsignedByte(380729851);
			anIntArray164 = new int[i_151_];
			for (int i_152_ = 0; i_152_ < i_151_; i_152_++)
				anIntArray164[i_152_] = class523_sub34.readUnsignedShort(-224674696);
		} else if (i == 134)
			anInt165 = class523_sub34.readUnsignedByte(-1842824658) * 356979075;
		else if (i == 139)
			anInt166 = class523_sub34.readUnsignedShort(-323159601) * -88403231;
		else if (i == 140)
			anInt167 = class523_sub34.readUnsignedShort(-333620179) * 1665868257;
		else if (i >= 142 && i < 147) {
			if (null == anIntArray124) {
				anIntArray124 = new int[6];
				Arrays.fill(anIntArray124, -1);
			}
			anIntArray124[i - 142] = class523_sub34.readUnsignedShort(-1513211747);
		} else if (i >= 150 && i < 155) {
			if (anIntArray119 == null) {
				anIntArray119 = new int[5];
				Arrays.fill(anIntArray119, -1);
			}
			anIntArray119[i - 150] = class523_sub34.readUnsignedShort(-1455999604);
		} else if (i != 156) {
			if (i == 157)
				aBool170 = true;
			else if (161 == i)
				anInt151 = class523_sub34.readUnsignedShort(-1718718549) * -791716467;
			else if (162 == i)
				anInt152 = class523_sub34.readUnsignedShort(-515638162) * 1999876043;
			else if (i == 163)
				anInt154 = class523_sub34.readUnsignedShort(-1175022714) * 2105619469;
			else if (i == 164)
				aString153 = class523_sub34.readString(-1319214445);
			else if (165 == i)
				stackable = -621268270;
			else if (i == 249) {
				int i_153_ = class523_sub34.readUnsignedByte(866919326);
				if (null == aClass14_163) {
					int i_154_ = Class628.method10313(i_153_, -735015395);
					aClass14_163 = new Class14(i_154_);
				}
				for (int i_155_ = 0; i_155_ < i_153_; i_155_++) {
					boolean bool = class523_sub34.readUnsignedByte(-1941009532) == 1;
					int i_156_ = class523_sub34.read24BitInt(-480278688);
					Class523 class523;
					if (bool)
						class523 = new Class523_Sub28(class523_sub34.readString(-804977348));
					else
						class523 = (new Class523_Sub24(class523_sub34.readUnsignedInt((byte) -104)));
					aClass14_163.method738(class523, (long) i_156_);
				}
			}
		}
	}

	public final Class179 method678(boolean bool, Class2 class2) {
		int i;
		int i_157_;
		int i_158_;
		if (bool) {
			if (null != class2 && null != class2.anIntArray22) {
				i = class2.anIntArray22[0];
				i_157_ = class2.anIntArray22[1];
				i_158_ = class2.anIntArray22[2];
			} else {
				i = -432386905 * anInt131;
				i_157_ = anInt132 * 565816295;
				i_158_ = anInt134 * -2015837427;
			}
		} else if (class2 != null && null != class2.anIntArray21) {
			i = class2.anIntArray21[0];
			i_157_ = class2.anIntArray21[1];
			i_158_ = class2.anIntArray21[2];
		} else {
			i = -1000812189 * anInt125;
			i_157_ = anInt130 * -551995617;
			i_158_ = 1732973397 * anInt133;
		}
		if (i == -1)
			return null;
		Class179 class179 = Class179.method3485(aClass9_123.aClass472_68, i, 0);
		if (null == class179)
			return null;
		if (class179.anInt1952 < 13)
			class179.method3494(2);
		if (i_157_ != -1) {
			Class179 class179_159_ = Class179.method3485(aClass9_123.aClass472_68, i_157_, 0);
			if (class179_159_.anInt1952 < 13)
				class179_159_.method3494(2);
			if (-1 != i_158_) {
				Class179 class179_160_ = Class179.method3485(aClass9_123.aClass472_68, i_158_, 0);
				if (class179_160_.anInt1952 < 13)
					class179_160_.method3494(2);
				Class179[] class179s = { class179, class179_159_, class179_160_ };
				class179 = new Class179(class179s, 3);
			} else {
				Class179[] class179s = { class179, class179_159_ };
				class179 = new Class179(class179s, 2);
			}
		}
		if (!bool && (anInt135 * -426165707 != 0 || anInt137 * 1289891019 != 0 || anInt139 * -1604044721 != 0))
			class179.method3492(-426165707 * anInt135, 1289891019 * anInt137, -1604044721 * anInt139);
		if (bool && (0 != -1824931735 * anInt136 || 0 != 1564303847 * anInt138 || anInt140 * 1571926603 != 0))
			class179.method3492(-1824931735 * anInt136, 1564303847 * anInt138, 1571926603 * anInt140);
		if (originalModelColors != null) {
			short[] is;
			if (null != class2 && class2.aShortArray25 != null)
				is = class2.aShortArray25;
			else
				is = modifiedModelColors;
			for (int i_161_ = 0; i_161_ < originalModelColors.length; i_161_++)
				class179.method3490(originalModelColors[i_161_], is[i_161_]);
		}
		if (originalTextureColors != null) {
			short[] is;
			if (null != class2 && class2.aShortArray26 != null)
				is = class2.aShortArray26;
			else
				is = modifiedTextureColors;
			for (int i_162_ = 0; i_162_ < originalTextureColors.length; i_162_++)
				class179.method3491(originalTextureColors[i_162_], is[i_162_]);
		}
		return class179;
	}

	void method679(ItemDefinitions class12_163_, ItemDefinitions class12_164_, Class668 class668) {
		method658(Class18.aClass18_194, class12_163_, class12_164_, Class39.aClass39_384, class668, -269485448);
	}

	void method680(ItemDefinitions class12_165_, ItemDefinitions class12_166_, Class668 class668) {
		method658(Class18.aClass18_194, class12_165_, class12_166_, Class39.aClass39_384, class668, -269485448);
	}

	void method681(int[] is, int i) {
		for (int i_167_ = 31; i_167_ > 0; i_167_--) {
			int i_168_ = 36 * i_167_;
			for (int i_169_ = 35; i_169_ > 0; i_169_--) {
				if (is[i_168_ + i_169_] == 0 && 0 != is[i_168_ + i_169_ - 1 - 36])
					is[i_169_ + i_168_] = i;
			}
		}
	}

	public final Class179 method682(boolean bool, Class2 class2, int i) {
		int i_170_;
		int i_171_;
		int i_172_;
		if (bool) {
			if (null != class2 && null != class2.anIntArray22) {
				i_170_ = class2.anIntArray22[0];
				i_171_ = class2.anIntArray22[1];
				i_172_ = class2.anIntArray22[2];
			} else {
				i_170_ = -432386905 * anInt131;
				i_171_ = anInt132 * 565816295;
				i_172_ = anInt134 * -2015837427;
			}
		} else if (class2 != null && null != class2.anIntArray21) {
			i_170_ = class2.anIntArray21[0];
			i_171_ = class2.anIntArray21[1];
			i_172_ = class2.anIntArray21[2];
		} else {
			i_170_ = -1000812189 * anInt125;
			i_171_ = anInt130 * -551995617;
			i_172_ = 1732973397 * anInt133;
		}
		if (i_170_ == -1)
			return null;
		Class179 class179 = Class179.method3485(aClass9_123.aClass472_68, i_170_, 0);
		if (null == class179)
			return null;
		if (class179.anInt1952 < 13)
			class179.method3494(2);
		if (i_171_ != -1) {
			Class179 class179_173_ = Class179.method3485(aClass9_123.aClass472_68, i_171_, 0);
			if (class179_173_.anInt1952 < 13)
				class179_173_.method3494(2);
			if (-1 != i_172_) {
				Class179 class179_174_ = Class179.method3485(aClass9_123.aClass472_68, i_172_, 0);
				if (class179_174_.anInt1952 < 13)
					class179_174_.method3494(2);
				Class179[] class179s = { class179, class179_173_, class179_174_ };
				class179 = new Class179(class179s, 3);
			} else {
				Class179[] class179s = { class179, class179_173_ };
				class179 = new Class179(class179s, 2);
			}
		}
		if (!bool && (anInt135 * -426165707 != 0 || anInt137 * 1289891019 != 0 || anInt139 * -1604044721 != 0))
			class179.method3492(-426165707 * anInt135, 1289891019 * anInt137, -1604044721 * anInt139);
		if (bool && (0 != -1824931735 * anInt136 || 0 != 1564303847 * anInt138 || anInt140 * 1571926603 != 0))
			class179.method3492(-1824931735 * anInt136, 1564303847 * anInt138, 1571926603 * anInt140);
		if (originalModelColors != null) {
			short[] is;
			if (null != class2 && class2.aShortArray25 != null)
				is = class2.aShortArray25;
			else
				is = modifiedModelColors;
			for (int i_175_ = 0; i_175_ < originalModelColors.length; i_175_++)
				class179.method3490(originalModelColors[i_175_], is[i_175_]);
		}
		if (originalTextureColors != null) {
			short[] is;
			if (null != class2 && class2.aShortArray26 != null)
				is = class2.aShortArray26;
			else
				is = modifiedTextureColors;
			for (int i_176_ = 0; i_176_ < originalTextureColors.length; i_176_++)
				class179.method3491(originalTextureColors[i_176_], is[i_176_]);
		}
		return class179;
	}

	public ItemDefinitions method683(int i) {
		if (stackIds != null && i > 1) {
			int i_177_ = -1;
			for (int i_178_ = 0; i_178_ < 10; i_178_++) {
				if (i >= stackAmounts[i_178_] && 0 != stackAmounts[i_178_])
					i_177_ = stackIds[i_178_];
			}
			if (-1 != i_177_)
				return (ItemDefinitions) anInterface12_99.getDefinition(i_177_, (byte) -56);
		}
		return this;
	}

	public final boolean method684(boolean bool, Class2 class2) {
		int i;
		int i_179_;
		int i_180_;
		if (bool) {
			if (null != class2 && null != class2.anIntArray22) {
				i = class2.anIntArray22[0];
				i_179_ = class2.anIntArray22[1];
				i_180_ = class2.anIntArray22[2];
			} else {
				i = anInt131 * -432386905;
				i_179_ = 565816295 * anInt132;
				i_180_ = anInt134 * -2015837427;
			}
		} else if (null != class2 && class2.anIntArray21 != null) {
			i = class2.anIntArray21[0];
			i_179_ = class2.anIntArray21[1];
			i_180_ = class2.anIntArray21[2];
		} else {
			i = anInt125 * -1000812189;
			i_179_ = anInt130 * -551995617;
			i_180_ = 1732973397 * anInt133;
		}
		if (-1 == i)
			return true;
		boolean bool_181_ = true;
		if (!aClass9_123.aClass472_68.method7663(i, 0, 1089230115))
			bool_181_ = false;
		if (i_179_ != -1 && !aClass9_123.aClass472_68.method7663(i_179_, 0, 1089230115))
			bool_181_ = false;
		if (i_180_ != -1 && !aClass9_123.aClass472_68.method7663(i_180_, 0, 1089230115))
			bool_181_ = false;
		return bool_181_;
	}

	public final Class167 method685(Class178 class178, int i, int i_182_, Class623 class623, Class707 class707, int i_183_, int i_184_, int i_185_, int i_186_) {
		if (null != stackIds && i_182_ > 1) {
			int i_187_ = -1;
			for (int i_188_ = 0; i_188_ < 10; i_188_++) {
				if (i_182_ >= stackAmounts[i_188_] && stackAmounts[i_188_] != 0)
					i_187_ = stackIds[i_188_];
			}
			if (-1 != i_187_)
				return (((ItemDefinitions) anInterface12_99.getDefinition(i_187_, (byte) -80)).method660(class178, i, 1, class623, class707, i_183_, i_184_, i_185_, i_186_, (byte) 0));
		}
		int i_189_ = i;
		if (null != class707)
			i_189_ |= class707.method14173(1680157562);
		Class167 class167;
		synchronized (aClass9_123.aClass209_69) {
			class167 = ((Class167) (aClass9_123.aClass209_69.method3767((long) (-1839300959 * anInt116 | -1144788131 * class178.anInt1922 << 29))));
		}
		if (class167 == null || class178.method3068(class167.method2683(), i_189_) != 0) {
			if (class167 != null)
				i_189_ = class178.method3117(i_189_, class167.method2683());
			int i_190_ = i_189_;
			if (originalTextureColors != null)
				i_190_ |= 0x8000;
			if (null != originalModelColors || null != class623)
				i_190_ |= 0x4000;
			if (anInt155 * -819886411 != 128)
				i_190_ |= 0x1;
			if (128 != 249832533 * anInt95)
				i_190_ |= 0x2;
			if (128 != anInt157 * -647090469)
				i_190_ |= 0x4;
			Class179 class179 = Class179.method3485(aClass9_123.aClass472_68, anInt106 * -1609101827, 0);
			if (null == class179)
				return null;
			if (class179.anInt1952 < 13)
				class179.method3494(2);
			class167 = class178.method3115(class179, i_190_, aClass9_123.anInt75 * -417890817, 1991235147 * anInt158 + 64, 850 + 1215680939 * anInt127);
			if (128 != -819886411 * anInt155 || anInt95 * 249832533 != 128 || -647090469 * anInt157 != 128)
				class167.method2691(anInt155 * -819886411, 249832533 * anInt95, -647090469 * anInt157);
			if (originalModelColors != null) {
				for (int i_191_ = 0; i_191_ < originalModelColors.length; i_191_++) {
					if (aByteArray107 != null && i_191_ < aByteArray107.length)
						class167.method2725(originalModelColors[i_191_], (aShortArray162[aByteArray107[i_191_] & 0xff]));
					else
						class167.method2725(originalModelColors[i_191_], modifiedModelColors[i_191_]);
				}
			}
			if (originalTextureColors != null) {
				for (int i_192_ = 0; i_192_ < originalTextureColors.length; i_192_++)
					class167.method2826(originalTextureColors[i_192_], modifiedTextureColors[i_192_]);
			}
			if (class623 != null) {
				for (int i_193_ = 0; i_193_ < 10; i_193_++) {
					for (int i_194_ = 0; i_194_ < Class150.aShortArrayArray1725[i_193_].length; i_194_++) {
						if (class623.anIntArray8102[i_193_] < (Class207.aShortArrayArrayArray2248[i_193_][i_194_]).length)
							class167.method2725(Class150.aShortArrayArray1725[i_193_][i_194_], (Class207.aShortArrayArrayArray2248[i_193_][i_194_][class623.anIntArray8102[i_193_]]));
					}
				}
				for (int i_195_ = 0; i_195_ < 10; i_195_++) {
					for (int i_196_ = 0; i_196_ < Class546.aShortArrayArray7302[i_195_].length; i_196_++) {
						if (class623.anIntArray8103[i_195_] < (Class21.aShortArrayArrayArray214[i_195_][i_196_]).length)
							class167.method2826(Class546.aShortArrayArray7302[i_195_][i_196_], (Class21.aShortArrayArrayArray214[i_195_][i_196_][class623.anIntArray8103[i_195_]]));
					}
				}
			}
			class167.method2769(i_189_);
			synchronized (aClass9_123.aClass209_69) {
				aClass9_123.aClass209_69.method3770(class167, (long) (-1839300959 * anInt116 | class178.anInt1922 * -1144788131 << 29));
			}
		}
		if (null != class707 || 0 != i_186_) {
			class167 = class167.method2681((byte) 1, i_189_, true);
			if (null != class707)
				class707.method14229(class167, 0, 1819637342);
			if (i_186_ != 0)
				class167.method2839(i_183_, i_184_, i_185_, i_186_);
		}
		class167.method2769(i);
		return class167;
	}

	public String method686(int i, String string, int i_197_) {
		if (aClass14_163 == null)
			return string;
		Class523_Sub28 class523_sub28 = (Class523_Sub28) aClass14_163.method741((long) i);
		if (class523_sub28 == null)
			return string;
		return (String) class523_sub28.anObject10554;
	}

	public final Class179 method687(boolean bool, Class2 class2, int i) {
		int i_198_;
		int i_199_;
		if (bool) {
			if (class2 != null && class2.anIntArray20 != null) {
				i_198_ = class2.anIntArray20[0];
				i_199_ = class2.anIntArray20[1];
			} else {
				i_198_ = anInt143 * -478576253;
				i_199_ = -1123046437 * anInt144;
			}
		} else if (class2 != null && class2.anIntArray23 != null) {
			i_198_ = class2.anIntArray23[0];
			i_199_ = class2.anIntArray23[1];
		} else {
			i_198_ = anInt141 * -1781791225;
			i_199_ = anInt100 * 1731276927;
		}
		if (-1 == i_198_)
			return null;
		Class179 class179 = Class179.method3485(aClass9_123.aClass472_68, i_198_, 0);
		if (class179.anInt1952 < 13)
			class179.method3494(2);
		if (i_199_ != -1) {
			Class179 class179_200_ = Class179.method3485(aClass9_123.aClass472_68, i_199_, 0);
			if (class179_200_.anInt1952 < 13)
				class179_200_.method3494(2);
			Class179[] class179s = { class179, class179_200_ };
			class179 = new Class179(class179s, 2);
		}
		if (null != originalModelColors) {
			short[] is;
			if (class2 != null && null != class2.aShortArray25)
				is = class2.aShortArray25;
			else
				is = modifiedModelColors;
			for (int i_201_ = 0; i_201_ < originalModelColors.length; i_201_++)
				class179.method3490(originalModelColors[i_201_], is[i_201_]);
		}
		if (null != originalTextureColors) {
			short[] is;
			if (null != class2 && null != class2.aShortArray26)
				is = class2.aShortArray26;
			else
				is = modifiedTextureColors;
			for (int i_202_ = 0; i_202_ < originalTextureColors.length; i_202_++)
				class179.method3491(originalTextureColors[i_202_], is[i_202_]);
		}
		return class179;
	}

	ItemDefinitions(int i, Interface12 interface12, Class9 class9) {
		itemName = "null";
		anInt98 = 1098405424;
		anInt128 = 0;
		anInt101 = 0;
		anInt115 = 0;
		anInt118 = 0;
		anInt117 = 0;
		stackable = 0;
		anInt109 = -1422039381;
		value = 1428695025;
		aBool121 = false;
		equipSlot = 2098331581;
		anInt93 = 876019101;
		anInt147 = -1541735751;
		anInt125 = -1764702283;
		anInt130 = 725383969;
		anInt131 = 501834985;
		anInt132 = -965621719;
		anInt133 = 487566851;
		anInt134 = -341558213;
		anInt135 = 0;
		anInt136 = 0;
		anInt137 = 0;
		anInt138 = 0;
		anInt139 = 0;
		anInt140 = 0;
		anInt141 = 575240265;
		anInt100 = 1971417217;
		anInt143 = -2098369835;
		anInt144 = -1980258387;
		certTemplateId = -483125401;
		certId = -134083883;
		lendId = 2068216941;
		lendTemplateId = -1730949317;
		anInt151 = 791716467;
		anInt152 = -1999876043;
		aString153 = "null";
		anInt154 = 0;
		anInt155 = 1490800256;
		anInt95 = -539197824;
		anInt157 = -1274107520;
		anInt158 = 0;
		anInt127 = 0;
		anInt160 = 0;
		unnoted = false;
		anInt149 = 0;
		anInt165 = 0;
		anInt166 = 88403231;
		anInt167 = -1665868257;
		aBool161 = false;
		aBool170 = false;
		anInt116 = i * 929883489;
		anInterface12_99 = interface12;
		aClass9_123 = class9;
		groundOptions = (String[]) aClass9_123.aStringArray74.clone();
		inventoryOptions = (String[]) aClass9_123.aStringArray73.clone();
	}

	public ItemDefinitions method688(int i) {
		if (stackIds != null && i > 1) {
			int i_203_ = -1;
			for (int i_204_ = 0; i_204_ < 10; i_204_++) {
				if (i >= stackAmounts[i_204_] && 0 != stackAmounts[i_204_])
					i_203_ = stackIds[i_204_];
			}
			if (-1 != i_203_)
				return (ItemDefinitions) anInterface12_99.getDefinition(i_203_, (byte) -37);
		}
		return this;
	}

	int[] method689(Class178 class178, Class178 class178_205_, int i, int i_206_, int i_207_, boolean bool, int i_208_, Class164 class164, Class623 class623, Class625 class625) {
		Class179 class179 = Class179.method3485(aClass9_123.aClass472_68, anInt106 * -1609101827, 0);
		if (null == class179)
			return null;
		if (class179.anInt1952 < 13)
			class179.method3494(2);
		if (originalModelColors != null) {
			for (int i_209_ = 0; i_209_ < originalModelColors.length; i_209_++) {
				if (null != aByteArray107 && i_209_ < aByteArray107.length)
					class179.method3490(originalModelColors[i_209_], (aShortArray162[aByteArray107[i_209_] & 0xff]));
				else
					class179.method3490(originalModelColors[i_209_], modifiedModelColors[i_209_]);
			}
		}
		if (originalTextureColors != null) {
			for (int i_210_ = 0; i_210_ < originalTextureColors.length; i_210_++)
				class179.method3491(originalTextureColors[i_210_], modifiedTextureColors[i_210_]);
		}
		if (class623 != null) {
			for (int i_211_ = 0; i_211_ < 10; i_211_++) {
				for (int i_212_ = 0; i_212_ < Class150.aShortArrayArray1725[i_211_].length; i_212_++) {
					if (class623.anIntArray8102[i_211_] < (Class207.aShortArrayArrayArray2248[i_211_][i_212_]).length)
						class179.method3490((Class150.aShortArrayArray1725[i_211_][i_212_]), (Class207.aShortArrayArrayArray2248[i_211_][i_212_][(class623.anIntArray8102[i_211_])]));
				}
			}
			for (int i_213_ = 0; i_213_ < 10; i_213_++) {
				for (int i_214_ = 0; i_214_ < Class546.aShortArrayArray7302[i_213_].length; i_214_++) {
					if (class623.anIntArray8103[i_213_] < (Class21.aShortArrayArrayArray214[i_213_][i_214_]).length)
						class179.method3491((Class546.aShortArrayArray7302[i_213_][i_214_]), (Class21.aShortArrayArrayArray214[i_213_][i_214_][(class623.anIntArray8103[i_213_])]));
				}
			}
		}
		int i_215_ = 2048;
		boolean bool_216_ = false;
		if (128 != -819886411 * anInt155 || 128 != 249832533 * anInt95 || anInt157 * -647090469 != 128) {
			bool_216_ = true;
			i_215_ |= 0x7;
		}
		Class167 class167 = class178.method3115(class179, i_215_, 64, 64 + anInt158 * 1991235147, 1215680939 * anInt127 + 768);
		if (!class167.method2727())
			return null;
		if (bool_216_)
			class167.method2691(-819886411 * anInt155, anInt95 * 249832533, -647090469 * anInt157);
		Class148 class148 = null;
		if (certTemplateId * 1178069929 != -1) {
			class148 = aClass9_123.method571(class178, class178_205_, 1322459523 * certId, 10, 1, 0, true, true, 0, class164, class623, class625, anInterface12_99, -1389623236);
			if (class148 == null)
				return null;
		} else if (128437773 * lendTemplateId != -1) {
			class148 = aClass9_123.method571(class178, class178_205_, -201387365 * lendId, i, i_206_, i_207_, false, true, 0, class164, class623, class625, anInterface12_99, -1664737195);
			if (class148 == null)
				return null;
		} else if (-1670847967 * anInt167 != -1) {
			class148 = aClass9_123.method571(class178, class178_205_, anInt166 * 1433776417, i, i_206_, i_207_, false, true, 0, class164, class623, class625, anInterface12_99, -2144960052);
			if (class148 == null)
				return null;
		} else if (anInt152 * -60850717 != -1) {
			class148 = aClass9_123.method571(class178, class178_205_, anInt151 * 1674718533, 10, 1, 0, true, true, 0, class164, class623, class625, anInterface12_99, -865312671);
			if (null == class148)
				return null;
		}
		int i_217_;
		if (bool)
			i_217_ = (int) (1.5 * (double) (anInt98 * -1174947681)) << 2;
		else if (i_206_ == 2)
			i_217_ = (int) ((double) (anInt98 * -1174947681) * 1.04) << 2;
		else
			i_217_ = anInt98 * -1174947681 << 2;
		Class441 class441 = class178.method3125();
		Class441 class441_218_ = class178.method3112();
		class441_218_.method7136(16.0F, 16.0F, 512.0F, 512.0F, 50.0F, 2.14748365E9F, (float) class178.method3039(1565388858).method2875(), (float) class178.method3039(1503003587).method2874());
		class178.method3124(class441_218_);
		class178.method3208(0, 0, class178.method3039(1911017021).method2875(), class178.method3039(1668140526).method2874());
		Class435 class435 = new Class435();
		class178.method3300(class435);
		class178.method3126(0.95F + (float) (Math.random() / 10.0));
		class178.method3460(16777215, 0.95F + (float) (Math.random() / 10.0), 0.95F + (float) (Math.random() / 10.0), -50.0F, -10.0F, -50.0F);
		Class435 class435_219_ = class178.method3113();
		class435_219_.method6855(0.0F, 0.0F, 1.0F, Class433.method6799(-(-1050168005 * anInt115) << 3));
		class435_219_.method6814(0.0F, 1.0F, 0.0F, Class433.method6799(anInt101 * 95914633 << 3));
		class435_219_.method6819((float) (anInt118 * 136766933 << 2), (float) ((((Class433.anIntArray4880[anInt128 * -280549515 << 3]) * i_217_) >> 14) - class167.method2804() / 2 + (-354841693 * anInt117 << 2)), (float) ((-354841693 * anInt117 << 2) + (((Class433.anIntArray4881[anInt128 * -280549515 << 3]) * i_217_) >> 14)));
		class435_219_.method6814(1.0F, 0.0F, 0.0F, Class433.method6799(-280549515 * anInt128 << 3));
		class178.method3378(0, 0, 36, 32);
		class178.method3076(2, 0);
		class178.method3193(0, 0, 36, 32, 0, 0);
		class178.method3349(0, -1, 0);
		class167.method2708(class435_219_, null, 1);
		class178.method3124(class441);
		int[] is = class178.method3293(0, 0, 36, 32);
		if (i_206_ >= 1) {
			is = method663(is, -16777214, (byte) -32);
			if (i_206_ >= 2)
				is = method663(is, -1, (byte) -64);
		}
		if (i_207_ != 0)
			method664(is, i_207_, 45488376);
		if (128437773 * lendTemplateId != -1)
			class148.method2435(0, 0);
		else if (anInt167 * -1670847967 != -1)
			class148.method2435(0, 0);
		class178.method3103(is, 0, 36, 36, 32, -1824572944).method2435(0, 0);
		if (1178069929 * certTemplateId != -1)
			class148.method2435(0, 0);
		if (-1 != anInt152 * -60850717)
			class148.method2435(0, 0);
		if (1 == i_208_ || i_208_ == 2 && (stackable * -758774055 == 1 || i != 1) && i != -1)
			class164.method2635(Class325.method5738(i, aClass9_123.aClass668_72, class625, -2027576623), 0, 9, -256, -16777215, (byte) -65);
		is = class178.method3293(0, 0, 36, 32);
		for (int i_220_ = 0; i_220_ < is.length; i_220_++) {
			if (0 == (is[i_220_] & 0xffffff))
				is[i_220_] = 0;
			else
				is[i_220_] |= ~0xffffff;
		}
		return is;
	}

	int[] method690(Class178 class178, Class178 class178_221_, int i, int i_222_, int i_223_, boolean bool, int i_224_, Class164 class164, Class623 class623, Class625 class625) {
		Class179 class179 = Class179.method3485(aClass9_123.aClass472_68, anInt106 * -1609101827, 0);
		if (null == class179)
			return null;
		if (class179.anInt1952 < 13)
			class179.method3494(2);
		if (originalModelColors != null) {
			for (int i_225_ = 0; i_225_ < originalModelColors.length; i_225_++) {
				if (null != aByteArray107 && i_225_ < aByteArray107.length)
					class179.method3490(originalModelColors[i_225_], (aShortArray162[aByteArray107[i_225_] & 0xff]));
				else
					class179.method3490(originalModelColors[i_225_], modifiedModelColors[i_225_]);
			}
		}
		if (originalTextureColors != null) {
			for (int i_226_ = 0; i_226_ < originalTextureColors.length; i_226_++)
				class179.method3491(originalTextureColors[i_226_], modifiedTextureColors[i_226_]);
		}
		if (class623 != null) {
			for (int i_227_ = 0; i_227_ < 10; i_227_++) {
				for (int i_228_ = 0; i_228_ < Class150.aShortArrayArray1725[i_227_].length; i_228_++) {
					if (class623.anIntArray8102[i_227_] < (Class207.aShortArrayArrayArray2248[i_227_][i_228_]).length)
						class179.method3490((Class150.aShortArrayArray1725[i_227_][i_228_]), (Class207.aShortArrayArrayArray2248[i_227_][i_228_][(class623.anIntArray8102[i_227_])]));
				}
			}
			for (int i_229_ = 0; i_229_ < 10; i_229_++) {
				for (int i_230_ = 0; i_230_ < Class546.aShortArrayArray7302[i_229_].length; i_230_++) {
					if (class623.anIntArray8103[i_229_] < (Class21.aShortArrayArrayArray214[i_229_][i_230_]).length)
						class179.method3491((Class546.aShortArrayArray7302[i_229_][i_230_]), (Class21.aShortArrayArrayArray214[i_229_][i_230_][(class623.anIntArray8103[i_229_])]));
				}
			}
		}
		int i_231_ = 2048;
		boolean bool_232_ = false;
		if (128 != -819886411 * anInt155 || 128 != 249832533 * anInt95 || anInt157 * -647090469 != 128) {
			bool_232_ = true;
			i_231_ |= 0x7;
		}
		Class167 class167 = class178.method3115(class179, i_231_, 64, 64 + anInt158 * 1991235147, 1215680939 * anInt127 + 768);
		if (!class167.method2727())
			return null;
		if (bool_232_)
			class167.method2691(-819886411 * anInt155, anInt95 * 249832533, -647090469 * anInt157);
		Class148 class148 = null;
		if (certTemplateId * 1178069929 != -1) {
			class148 = aClass9_123.method571(class178, class178_221_, 1322459523 * certId, 10, 1, 0, true, true, 0, class164, class623, class625, anInterface12_99, -1955200894);
			if (class148 == null)
				return null;
		} else if (128437773 * lendTemplateId != -1) {
			class148 = aClass9_123.method571(class178, class178_221_, -201387365 * lendId, i, i_222_, i_223_, false, true, 0, class164, class623, class625, anInterface12_99, -1211190303);
			if (class148 == null)
				return null;
		} else if (-1670847967 * anInt167 != -1) {
			class148 = aClass9_123.method571(class178, class178_221_, anInt166 * 1433776417, i, i_222_, i_223_, false, true, 0, class164, class623, class625, anInterface12_99, -1626412799);
			if (class148 == null)
				return null;
		} else if (anInt152 * -60850717 != -1) {
			class148 = aClass9_123.method571(class178, class178_221_, anInt151 * 1674718533, 10, 1, 0, true, true, 0, class164, class623, class625, anInterface12_99, -1900721368);
			if (null == class148)
				return null;
		}
		int i_233_;
		if (bool)
			i_233_ = (int) (1.5 * (double) (anInt98 * -1174947681)) << 2;
		else if (i_222_ == 2)
			i_233_ = (int) ((double) (anInt98 * -1174947681) * 1.04) << 2;
		else
			i_233_ = anInt98 * -1174947681 << 2;
		Class441 class441 = class178.method3125();
		Class441 class441_234_ = class178.method3112();
		class441_234_.method7136(16.0F, 16.0F, 512.0F, 512.0F, 50.0F, 2.14748365E9F, (float) class178.method3039(1604698801).method2875(), (float) class178.method3039(1435602974).method2874());
		class178.method3124(class441_234_);
		class178.method3208(0, 0, class178.method3039(1948370660).method2875(), class178.method3039(1789678184).method2874());
		Class435 class435 = new Class435();
		class178.method3300(class435);
		class178.method3126(0.95F + (float) (Math.random() / 10.0));
		class178.method3460(16777215, 0.95F + (float) (Math.random() / 10.0), 0.95F + (float) (Math.random() / 10.0), -50.0F, -10.0F, -50.0F);
		Class435 class435_235_ = class178.method3113();
		class435_235_.method6855(0.0F, 0.0F, 1.0F, Class433.method6799(-(-1050168005 * anInt115) << 3));
		class435_235_.method6814(0.0F, 1.0F, 0.0F, Class433.method6799(anInt101 * 95914633 << 3));
		class435_235_.method6819((float) (anInt118 * 136766933 << 2), (float) ((((Class433.anIntArray4880[anInt128 * -280549515 << 3]) * i_233_) >> 14) - class167.method2804() / 2 + (-354841693 * anInt117 << 2)), (float) ((-354841693 * anInt117 << 2) + (((Class433.anIntArray4881[anInt128 * -280549515 << 3]) * i_233_) >> 14)));
		class435_235_.method6814(1.0F, 0.0F, 0.0F, Class433.method6799(-280549515 * anInt128 << 3));
		class178.method3378(0, 0, 36, 32);
		class178.method3076(2, 0);
		class178.method3193(0, 0, 36, 32, 0, 0);
		class178.method3349(0, -1, 0);
		class167.method2708(class435_235_, null, 1);
		class178.method3124(class441);
		int[] is = class178.method3293(0, 0, 36, 32);
		if (i_222_ >= 1) {
			is = method663(is, -16777214, (byte) -64);
			if (i_222_ >= 2)
				is = method663(is, -1, (byte) -31);
		}
		if (i_223_ != 0)
			method664(is, i_223_, -521749915);
		if (128437773 * lendTemplateId != -1)
			class148.method2435(0, 0);
		else if (anInt167 * -1670847967 != -1)
			class148.method2435(0, 0);
		class178.method3103(is, 0, 36, 36, 32, -2117934750).method2435(0, 0);
		if (1178069929 * certTemplateId != -1)
			class148.method2435(0, 0);
		if (-1 != anInt152 * -60850717)
			class148.method2435(0, 0);
		if (1 == i_224_ || i_224_ == 2 && (stackable * -758774055 == 1 || i != 1) && i != -1)
			class164.method2635(Class325.method5738(i, aClass9_123.aClass668_72, class625, -2027576623), 0, 9, -256, -16777215, (byte) -35);
		is = class178.method3293(0, 0, 36, 32);
		for (int i_236_ = 0; i_236_ < is.length; i_236_++) {
			if (0 == (is[i_236_] & 0xffffff))
				is[i_236_] = 0;
			else
				is[i_236_] |= ~0xffffff;
		}
		return is;
	}

	int[] method691(Class178 class178, Class178 class178_237_, int i, int i_238_, int i_239_, boolean bool, int i_240_, Class164 class164, Class623 class623, Class625 class625) {
		Class179 class179 = Class179.method3485(aClass9_123.aClass472_68, anInt106 * -1609101827, 0);
		if (null == class179)
			return null;
		if (class179.anInt1952 < 13)
			class179.method3494(2);
		if (originalModelColors != null) {
			for (int i_241_ = 0; i_241_ < originalModelColors.length; i_241_++) {
				if (null != aByteArray107 && i_241_ < aByteArray107.length)
					class179.method3490(originalModelColors[i_241_], (aShortArray162[aByteArray107[i_241_] & 0xff]));
				else
					class179.method3490(originalModelColors[i_241_], modifiedModelColors[i_241_]);
			}
		}
		if (originalTextureColors != null) {
			for (int i_242_ = 0; i_242_ < originalTextureColors.length; i_242_++)
				class179.method3491(originalTextureColors[i_242_], modifiedTextureColors[i_242_]);
		}
		if (class623 != null) {
			for (int i_243_ = 0; i_243_ < 10; i_243_++) {
				for (int i_244_ = 0; i_244_ < Class150.aShortArrayArray1725[i_243_].length; i_244_++) {
					if (class623.anIntArray8102[i_243_] < (Class207.aShortArrayArrayArray2248[i_243_][i_244_]).length)
						class179.method3490((Class150.aShortArrayArray1725[i_243_][i_244_]), (Class207.aShortArrayArrayArray2248[i_243_][i_244_][(class623.anIntArray8102[i_243_])]));
				}
			}
			for (int i_245_ = 0; i_245_ < 10; i_245_++) {
				for (int i_246_ = 0; i_246_ < Class546.aShortArrayArray7302[i_245_].length; i_246_++) {
					if (class623.anIntArray8103[i_245_] < (Class21.aShortArrayArrayArray214[i_245_][i_246_]).length)
						class179.method3491((Class546.aShortArrayArray7302[i_245_][i_246_]), (Class21.aShortArrayArrayArray214[i_245_][i_246_][(class623.anIntArray8103[i_245_])]));
				}
			}
		}
		int i_247_ = 2048;
		boolean bool_248_ = false;
		if (128 != -819886411 * anInt155 || 128 != 249832533 * anInt95 || anInt157 * -647090469 != 128) {
			bool_248_ = true;
			i_247_ |= 0x7;
		}
		Class167 class167 = class178.method3115(class179, i_247_, 64, 64 + anInt158 * 1991235147, 1215680939 * anInt127 + 768);
		if (!class167.method2727())
			return null;
		if (bool_248_)
			class167.method2691(-819886411 * anInt155, anInt95 * 249832533, -647090469 * anInt157);
		Class148 class148 = null;
		if (certTemplateId * 1178069929 != -1) {
			class148 = aClass9_123.method571(class178, class178_237_, 1322459523 * certId, 10, 1, 0, true, true, 0, class164, class623, class625, anInterface12_99, -2107759507);
			if (class148 == null)
				return null;
		} else if (128437773 * lendTemplateId != -1) {
			class148 = aClass9_123.method571(class178, class178_237_, -201387365 * lendId, i, i_238_, i_239_, false, true, 0, class164, class623, class625, anInterface12_99, -1627469022);
			if (class148 == null)
				return null;
		} else if (-1670847967 * anInt167 != -1) {
			class148 = aClass9_123.method571(class178, class178_237_, anInt166 * 1433776417, i, i_238_, i_239_, false, true, 0, class164, class623, class625, anInterface12_99, -1103486743);
			if (class148 == null)
				return null;
		} else if (anInt152 * -60850717 != -1) {
			class148 = aClass9_123.method571(class178, class178_237_, anInt151 * 1674718533, 10, 1, 0, true, true, 0, class164, class623, class625, anInterface12_99, -1373458123);
			if (null == class148)
				return null;
		}
		int i_249_;
		if (bool)
			i_249_ = (int) (1.5 * (double) (anInt98 * -1174947681)) << 2;
		else if (i_238_ == 2)
			i_249_ = (int) ((double) (anInt98 * -1174947681) * 1.04) << 2;
		else
			i_249_ = anInt98 * -1174947681 << 2;
		Class441 class441 = class178.method3125();
		Class441 class441_250_ = class178.method3112();
		class441_250_.method7136(16.0F, 16.0F, 512.0F, 512.0F, 50.0F, 2.14748365E9F, (float) class178.method3039(1770854707).method2875(), (float) class178.method3039(1923973237).method2874());
		class178.method3124(class441_250_);
		class178.method3208(0, 0, class178.method3039(1894897022).method2875(), class178.method3039(1769694943).method2874());
		Class435 class435 = new Class435();
		class178.method3300(class435);
		class178.method3126(0.95F + (float) (Math.random() / 10.0));
		class178.method3460(16777215, 0.95F + (float) (Math.random() / 10.0), 0.95F + (float) (Math.random() / 10.0), -50.0F, -10.0F, -50.0F);
		Class435 class435_251_ = class178.method3113();
		class435_251_.method6855(0.0F, 0.0F, 1.0F, Class433.method6799(-(-1050168005 * anInt115) << 3));
		class435_251_.method6814(0.0F, 1.0F, 0.0F, Class433.method6799(anInt101 * 95914633 << 3));
		class435_251_.method6819((float) (anInt118 * 136766933 << 2), (float) ((((Class433.anIntArray4880[anInt128 * -280549515 << 3]) * i_249_) >> 14) - class167.method2804() / 2 + (-354841693 * anInt117 << 2)), (float) ((-354841693 * anInt117 << 2) + (((Class433.anIntArray4881[anInt128 * -280549515 << 3]) * i_249_) >> 14)));
		class435_251_.method6814(1.0F, 0.0F, 0.0F, Class433.method6799(-280549515 * anInt128 << 3));
		class178.method3378(0, 0, 36, 32);
		class178.method3076(2, 0);
		class178.method3193(0, 0, 36, 32, 0, 0);
		class178.method3349(0, -1, 0);
		class167.method2708(class435_251_, null, 1);
		class178.method3124(class441);
		int[] is = class178.method3293(0, 0, 36, 32);
		if (i_238_ >= 1) {
			is = method663(is, -16777214, (byte) -93);
			if (i_238_ >= 2)
				is = method663(is, -1, (byte) 56);
		}
		if (i_239_ != 0)
			method664(is, i_239_, -1659201147);
		if (128437773 * lendTemplateId != -1)
			class148.method2435(0, 0);
		else if (anInt167 * -1670847967 != -1)
			class148.method2435(0, 0);
		class178.method3103(is, 0, 36, 36, 32, -2034255110).method2435(0, 0);
		if (1178069929 * certTemplateId != -1)
			class148.method2435(0, 0);
		if (-1 != anInt152 * -60850717)
			class148.method2435(0, 0);
		if (1 == i_240_ || i_240_ == 2 && (stackable * -758774055 == 1 || i != 1) && i != -1)
			class164.method2635(Class325.method5738(i, aClass9_123.aClass668_72, class625, -2027576623), 0, 9, -256, -16777215, (byte) -73);
		is = class178.method3293(0, 0, 36, 32);
		for (int i_252_ = 0; i_252_ < is.length; i_252_++) {
			if (0 == (is[i_252_] & 0xffffff))
				is[i_252_] = 0;
			else
				is[i_252_] |= ~0xffffff;
		}
		return is;
	}

	int[] method692(Class178 class178, Class178 class178_253_, int i, int i_254_, int i_255_, boolean bool, int i_256_, Class164 class164, Class623 class623, Class625 class625) {
		Class179 class179 = Class179.method3485(aClass9_123.aClass472_68, anInt106 * -1609101827, 0);
		if (null == class179)
			return null;
		if (class179.anInt1952 < 13)
			class179.method3494(2);
		if (originalModelColors != null) {
			for (int i_257_ = 0; i_257_ < originalModelColors.length; i_257_++) {
				if (null != aByteArray107 && i_257_ < aByteArray107.length)
					class179.method3490(originalModelColors[i_257_], (aShortArray162[aByteArray107[i_257_] & 0xff]));
				else
					class179.method3490(originalModelColors[i_257_], modifiedModelColors[i_257_]);
			}
		}
		if (originalTextureColors != null) {
			for (int i_258_ = 0; i_258_ < originalTextureColors.length; i_258_++)
				class179.method3491(originalTextureColors[i_258_], modifiedTextureColors[i_258_]);
		}
		if (class623 != null) {
			for (int i_259_ = 0; i_259_ < 10; i_259_++) {
				for (int i_260_ = 0; i_260_ < Class150.aShortArrayArray1725[i_259_].length; i_260_++) {
					if (class623.anIntArray8102[i_259_] < (Class207.aShortArrayArrayArray2248[i_259_][i_260_]).length)
						class179.method3490((Class150.aShortArrayArray1725[i_259_][i_260_]), (Class207.aShortArrayArrayArray2248[i_259_][i_260_][(class623.anIntArray8102[i_259_])]));
				}
			}
			for (int i_261_ = 0; i_261_ < 10; i_261_++) {
				for (int i_262_ = 0; i_262_ < Class546.aShortArrayArray7302[i_261_].length; i_262_++) {
					if (class623.anIntArray8103[i_261_] < (Class21.aShortArrayArrayArray214[i_261_][i_262_]).length)
						class179.method3491((Class546.aShortArrayArray7302[i_261_][i_262_]), (Class21.aShortArrayArrayArray214[i_261_][i_262_][(class623.anIntArray8103[i_261_])]));
				}
			}
		}
		int i_263_ = 2048;
		boolean bool_264_ = false;
		if (128 != -819886411 * anInt155 || 128 != 249832533 * anInt95 || anInt157 * -647090469 != 128) {
			bool_264_ = true;
			i_263_ |= 0x7;
		}
		Class167 class167 = class178.method3115(class179, i_263_, 64, 64 + anInt158 * 1991235147, 1215680939 * anInt127 + 768);
		if (!class167.method2727())
			return null;
		if (bool_264_)
			class167.method2691(-819886411 * anInt155, anInt95 * 249832533, -647090469 * anInt157);
		Class148 class148 = null;
		if (certTemplateId * 1178069929 != -1) {
			class148 = aClass9_123.method571(class178, class178_253_, 1322459523 * certId, 10, 1, 0, true, true, 0, class164, class623, class625, anInterface12_99, -682635389);
			if (class148 == null)
				return null;
		} else if (128437773 * lendTemplateId != -1) {
			class148 = aClass9_123.method571(class178, class178_253_, -201387365 * lendId, i, i_254_, i_255_, false, true, 0, class164, class623, class625, anInterface12_99, -1564347912);
			if (class148 == null)
				return null;
		} else if (-1670847967 * anInt167 != -1) {
			class148 = aClass9_123.method571(class178, class178_253_, anInt166 * 1433776417, i, i_254_, i_255_, false, true, 0, class164, class623, class625, anInterface12_99, -1909039414);
			if (class148 == null)
				return null;
		} else if (anInt152 * -60850717 != -1) {
			class148 = aClass9_123.method571(class178, class178_253_, anInt151 * 1674718533, 10, 1, 0, true, true, 0, class164, class623, class625, anInterface12_99, -1025523507);
			if (null == class148)
				return null;
		}
		int i_265_;
		if (bool)
			i_265_ = (int) (1.5 * (double) (anInt98 * -1174947681)) << 2;
		else if (i_254_ == 2)
			i_265_ = (int) ((double) (anInt98 * -1174947681) * 1.04) << 2;
		else
			i_265_ = anInt98 * -1174947681 << 2;
		Class441 class441 = class178.method3125();
		Class441 class441_266_ = class178.method3112();
		class441_266_.method7136(16.0F, 16.0F, 512.0F, 512.0F, 50.0F, 2.14748365E9F, (float) class178.method3039(1517901514).method2875(), (float) class178.method3039(1971275162).method2874());
		class178.method3124(class441_266_);
		class178.method3208(0, 0, class178.method3039(1565893133).method2875(), class178.method3039(1688256565).method2874());
		Class435 class435 = new Class435();
		class178.method3300(class435);
		class178.method3126(0.95F + (float) (Math.random() / 10.0));
		class178.method3460(16777215, 0.95F + (float) (Math.random() / 10.0), 0.95F + (float) (Math.random() / 10.0), -50.0F, -10.0F, -50.0F);
		Class435 class435_267_ = class178.method3113();
		class435_267_.method6855(0.0F, 0.0F, 1.0F, Class433.method6799(-(-1050168005 * anInt115) << 3));
		class435_267_.method6814(0.0F, 1.0F, 0.0F, Class433.method6799(anInt101 * 95914633 << 3));
		class435_267_.method6819((float) (anInt118 * 136766933 << 2), (float) ((((Class433.anIntArray4880[anInt128 * -280549515 << 3]) * i_265_) >> 14) - class167.method2804() / 2 + (-354841693 * anInt117 << 2)), (float) ((-354841693 * anInt117 << 2) + (((Class433.anIntArray4881[anInt128 * -280549515 << 3]) * i_265_) >> 14)));
		class435_267_.method6814(1.0F, 0.0F, 0.0F, Class433.method6799(-280549515 * anInt128 << 3));
		class178.method3378(0, 0, 36, 32);
		class178.method3076(2, 0);
		class178.method3193(0, 0, 36, 32, 0, 0);
		class178.method3349(0, -1, 0);
		class167.method2708(class435_267_, null, 1);
		class178.method3124(class441);
		int[] is = class178.method3293(0, 0, 36, 32);
		if (i_254_ >= 1) {
			is = method663(is, -16777214, (byte) -57);
			if (i_254_ >= 2)
				is = method663(is, -1, (byte) 19);
		}
		if (i_255_ != 0)
			method664(is, i_255_, -962972065);
		if (128437773 * lendTemplateId != -1)
			class148.method2435(0, 0);
		else if (anInt167 * -1670847967 != -1)
			class148.method2435(0, 0);
		class178.method3103(is, 0, 36, 36, 32, -1767034857).method2435(0, 0);
		if (1178069929 * certTemplateId != -1)
			class148.method2435(0, 0);
		if (-1 != anInt152 * -60850717)
			class148.method2435(0, 0);
		if (1 == i_256_ || i_256_ == 2 && (stackable * -758774055 == 1 || i != 1) && i != -1)
			class164.method2635(Class325.method5738(i, aClass9_123.aClass668_72, class625, -2027576623), 0, 9, -256, -16777215, (byte) -68);
		is = class178.method3293(0, 0, 36, 32);
		for (int i_268_ = 0; i_268_ < is.length; i_268_++) {
			if (0 == (is[i_268_] & 0xffffff))
				is[i_268_] = 0;
			else
				is[i_268_] |= ~0xffffff;
		}
		return is;
	}

	int[] method693(Class178 class178, Class178 class178_269_, int i, int i_270_, int i_271_, boolean bool, int i_272_, Class164 class164, Class623 class623, Class625 class625) {
		Class179 class179 = Class179.method3485(aClass9_123.aClass472_68, anInt106 * -1609101827, 0);
		if (null == class179)
			return null;
		if (class179.anInt1952 < 13)
			class179.method3494(2);
		if (originalModelColors != null) {
			for (int i_273_ = 0; i_273_ < originalModelColors.length; i_273_++) {
				if (null != aByteArray107 && i_273_ < aByteArray107.length)
					class179.method3490(originalModelColors[i_273_], (aShortArray162[aByteArray107[i_273_] & 0xff]));
				else
					class179.method3490(originalModelColors[i_273_], modifiedModelColors[i_273_]);
			}
		}
		if (originalTextureColors != null) {
			for (int i_274_ = 0; i_274_ < originalTextureColors.length; i_274_++)
				class179.method3491(originalTextureColors[i_274_], modifiedTextureColors[i_274_]);
		}
		if (class623 != null) {
			for (int i_275_ = 0; i_275_ < 10; i_275_++) {
				for (int i_276_ = 0; i_276_ < Class150.aShortArrayArray1725[i_275_].length; i_276_++) {
					if (class623.anIntArray8102[i_275_] < (Class207.aShortArrayArrayArray2248[i_275_][i_276_]).length)
						class179.method3490((Class150.aShortArrayArray1725[i_275_][i_276_]), (Class207.aShortArrayArrayArray2248[i_275_][i_276_][(class623.anIntArray8102[i_275_])]));
				}
			}
			for (int i_277_ = 0; i_277_ < 10; i_277_++) {
				for (int i_278_ = 0; i_278_ < Class546.aShortArrayArray7302[i_277_].length; i_278_++) {
					if (class623.anIntArray8103[i_277_] < (Class21.aShortArrayArrayArray214[i_277_][i_278_]).length)
						class179.method3491((Class546.aShortArrayArray7302[i_277_][i_278_]), (Class21.aShortArrayArrayArray214[i_277_][i_278_][(class623.anIntArray8103[i_277_])]));
				}
			}
		}
		int i_279_ = 2048;
		boolean bool_280_ = false;
		if (128 != -819886411 * anInt155 || 128 != 249832533 * anInt95 || anInt157 * -647090469 != 128) {
			bool_280_ = true;
			i_279_ |= 0x7;
		}
		Class167 class167 = class178.method3115(class179, i_279_, 64, 64 + anInt158 * 1991235147, 1215680939 * anInt127 + 768);
		if (!class167.method2727())
			return null;
		if (bool_280_)
			class167.method2691(-819886411 * anInt155, anInt95 * 249832533, -647090469 * anInt157);
		Class148 class148 = null;
		if (certTemplateId * 1178069929 != -1) {
			class148 = aClass9_123.method571(class178, class178_269_, 1322459523 * certId, 10, 1, 0, true, true, 0, class164, class623, class625, anInterface12_99, -590225615);
			if (class148 == null)
				return null;
		} else if (128437773 * lendTemplateId != -1) {
			class148 = aClass9_123.method571(class178, class178_269_, -201387365 * lendId, i, i_270_, i_271_, false, true, 0, class164, class623, class625, anInterface12_99, -2011815830);
			if (class148 == null)
				return null;
		} else if (-1670847967 * anInt167 != -1) {
			class148 = aClass9_123.method571(class178, class178_269_, anInt166 * 1433776417, i, i_270_, i_271_, false, true, 0, class164, class623, class625, anInterface12_99, -1116844255);
			if (class148 == null)
				return null;
		} else if (anInt152 * -60850717 != -1) {
			class148 = aClass9_123.method571(class178, class178_269_, anInt151 * 1674718533, 10, 1, 0, true, true, 0, class164, class623, class625, anInterface12_99, -889216731);
			if (null == class148)
				return null;
		}
		int i_281_;
		if (bool)
			i_281_ = (int) (1.5 * (double) (anInt98 * -1174947681)) << 2;
		else if (i_270_ == 2)
			i_281_ = (int) ((double) (anInt98 * -1174947681) * 1.04) << 2;
		else
			i_281_ = anInt98 * -1174947681 << 2;
		Class441 class441 = class178.method3125();
		Class441 class441_282_ = class178.method3112();
		class441_282_.method7136(16.0F, 16.0F, 512.0F, 512.0F, 50.0F, 2.14748365E9F, (float) class178.method3039(1604011452).method2875(), (float) class178.method3039(1865508331).method2874());
		class178.method3124(class441_282_);
		class178.method3208(0, 0, class178.method3039(2082895200).method2875(), class178.method3039(1898998376).method2874());
		Class435 class435 = new Class435();
		class178.method3300(class435);
		class178.method3126(0.95F + (float) (Math.random() / 10.0));
		class178.method3460(16777215, 0.95F + (float) (Math.random() / 10.0), 0.95F + (float) (Math.random() / 10.0), -50.0F, -10.0F, -50.0F);
		Class435 class435_283_ = class178.method3113();
		class435_283_.method6855(0.0F, 0.0F, 1.0F, Class433.method6799(-(-1050168005 * anInt115) << 3));
		class435_283_.method6814(0.0F, 1.0F, 0.0F, Class433.method6799(anInt101 * 95914633 << 3));
		class435_283_.method6819((float) (anInt118 * 136766933 << 2), (float) ((((Class433.anIntArray4880[anInt128 * -280549515 << 3]) * i_281_) >> 14) - class167.method2804() / 2 + (-354841693 * anInt117 << 2)), (float) ((-354841693 * anInt117 << 2) + (((Class433.anIntArray4881[anInt128 * -280549515 << 3]) * i_281_) >> 14)));
		class435_283_.method6814(1.0F, 0.0F, 0.0F, Class433.method6799(-280549515 * anInt128 << 3));
		class178.method3378(0, 0, 36, 32);
		class178.method3076(2, 0);
		class178.method3193(0, 0, 36, 32, 0, 0);
		class178.method3349(0, -1, 0);
		class167.method2708(class435_283_, null, 1);
		class178.method3124(class441);
		int[] is = class178.method3293(0, 0, 36, 32);
		if (i_270_ >= 1) {
			is = method663(is, -16777214, (byte) -28);
			if (i_270_ >= 2)
				is = method663(is, -1, (byte) 21);
		}
		if (i_271_ != 0)
			method664(is, i_271_, -2006584530);
		if (128437773 * lendTemplateId != -1)
			class148.method2435(0, 0);
		else if (anInt167 * -1670847967 != -1)
			class148.method2435(0, 0);
		class178.method3103(is, 0, 36, 36, 32, -1999365256).method2435(0, 0);
		if (1178069929 * certTemplateId != -1)
			class148.method2435(0, 0);
		if (-1 != anInt152 * -60850717)
			class148.method2435(0, 0);
		if (1 == i_272_ || i_272_ == 2 && (stackable * -758774055 == 1 || i != 1) && i != -1)
			class164.method2635(Class325.method5738(i, aClass9_123.aClass668_72, class625, -2027576623), 0, 9, -256, -16777215, (byte) 58);
		is = class178.method3293(0, 0, 36, 32);
		for (int i_284_ = 0; i_284_ < is.length; i_284_++) {
			if (0 == (is[i_284_] & 0xffffff))
				is[i_284_] = 0;
			else
				is[i_284_] |= ~0xffffff;
		}
		return is;
	}

	int[] method694(int[] is, int i) {
		int[] is_285_ = new int[1152];
		int i_286_ = 0;
		for (int i_287_ = 0; i_287_ < 32; i_287_++) {
			for (int i_288_ = 0; i_288_ < 36; i_288_++) {
				int i_289_ = is[i_286_];
				if (0 == i_289_) {
					if (i_288_ > 0 && 0 != is[i_286_ - 1])
						i_289_ = i;
					else if (i_287_ > 0 && is[i_286_ - 36] != 0)
						i_289_ = i;
					else if (i_288_ < 35 && 0 != is[i_286_ + 1])
						i_289_ = i;
					else if (i_287_ < 31 && 0 != is[36 + i_286_])
						i_289_ = i;
				}
				is_285_[i_286_++] = i_289_;
			}
		}
		return is_285_;
	}

	void method695(Class18 class18, ItemDefinitions class12_290_, ItemDefinitions class12_291_, Class39 class39, Class668 class668) {
		anInt106 = 1 * class12_290_.anInt106;
		anInt98 = 1 * class12_290_.anInt98;
		anInt128 = 1 * class12_290_.anInt128;
		anInt101 = 1 * class12_290_.anInt101;
		anInt115 = class12_290_.anInt115 * 1;
		anInt118 = 1 * class12_290_.anInt118;
		anInt117 = 1 * class12_290_.anInt117;
		ItemDefinitions class12_292_ = class18 == Class18.aClass18_193 ? class12_290_ : class12_291_;
		originalModelColors = class12_292_.originalModelColors;
		modifiedModelColors = class12_292_.modifiedModelColors;
		aByteArray107 = class12_292_.aByteArray107;
		originalTextureColors = class12_292_.originalTextureColors;
		modifiedTextureColors = class12_292_.modifiedTextureColors;
		itemName = class12_291_.itemName;
		aBool121 = class12_291_.aBool121;
		if (Class18.aClass18_193 == class18) {
			value = class12_291_.value * 1;
			stackable = -310634135;
		} else if (class18 == Class18.aClass18_196) {
			itemName = class12_291_.aString153;
			value = ((int) Math.floor((double) (class12_291_.value * -22288111 / (1659386565 * class12_291_.anInt154))) * 1428695025);
			stackable = -310634135;
			unnoted = class12_291_.unnoted;
			anInt159 = class12_290_.anInt159 * 1;
			anIntArray124 = class12_290_.anIntArray124;
			anIntArray119 = class12_290_.anIntArray119;
			inventoryOptions = new String[5];
			inventoryOptions[0] = Class39.aClass39_400.method1124(class668, (byte) -106);
			inventoryOptions[4] = class39.method1124(class668, (byte) -86);
		} else {
			value = 0;
			stackable = class12_291_.stackable * 1;
			equipSlot = class12_291_.equipSlot * 1;
			anInt93 = class12_291_.anInt93 * 1;
			anInt147 = 1 * class12_291_.anInt147;
			anInt125 = 1 * class12_291_.anInt125;
			anInt130 = 1 * class12_291_.anInt130;
			anInt133 = class12_291_.anInt133 * 1;
			anInt131 = 1 * class12_291_.anInt131;
			anInt132 = class12_291_.anInt132 * 1;
			anInt134 = 1 * class12_291_.anInt134;
			anInt135 = 1 * class12_291_.anInt135;
			anInt136 = 1 * class12_291_.anInt136;
			anInt137 = class12_291_.anInt137 * 1;
			anInt138 = class12_291_.anInt138 * 1;
			anInt139 = class12_291_.anInt139 * 1;
			anInt140 = 1 * class12_291_.anInt140;
			anInt141 = 1 * class12_291_.anInt141;
			anInt100 = 1 * class12_291_.anInt100;
			anInt143 = class12_291_.anInt143 * 1;
			anInt144 = class12_291_.anInt144 * 1;
			anInt159 = 1 * class12_291_.anInt159;
			anInt160 = 1 * class12_291_.anInt160;
			groundOptions = class12_291_.groundOptions;
			aClass14_163 = class12_291_.aClass14_163;
			inventoryOptions = new String[5];
			if (null != class12_291_.inventoryOptions) {
				for (int i = 0; i < 4; i++)
					inventoryOptions[i] = class12_291_.inventoryOptions[i];
			}
			inventoryOptions[4] = class39.method1124(class668, (byte) -27);
		}
	}

	void method696(int[] is, int i) {
		for (int i_293_ = 31; i_293_ > 0; i_293_--) {
			int i_294_ = 36 * i_293_;
			for (int i_295_ = 35; i_295_ > 0; i_295_--) {
				if (is[i_294_ + i_295_] == 0 && 0 != is[i_294_ + i_295_ - 1 - 36])
					is[i_295_ + i_294_] = i;
			}
		}
	}

	void method697(int[] is, int i) {
		for (int i_296_ = 31; i_296_ > 0; i_296_--) {
			int i_297_ = 36 * i_296_;
			for (int i_298_ = 35; i_298_ > 0; i_298_--) {
				if (is[i_297_ + i_298_] == 0 && 0 != is[i_297_ + i_298_ - 1 - 36])
					is[i_298_ + i_297_] = i;
			}
		}
	}

	static String method698(int i, Class668 class668, Class625 class625) {
		if (i < 100000)
			return new StringBuilder().append(Class288.method5163(114388337 * class625.anInt8138, 436069288)).append(i).append(aString171).toString();
		if (i < 10000000)
			return new StringBuilder().append(Class288.method5163(class625.anInt8161 * -1459907571, -68979938)).append(i / 1000).append(Class39.aClass39_520.method1124(class668, (byte) -114)).append(aString171).toString();
		return new StringBuilder().append(Class288.method5163(class625.anInt8162 * 2086406891, 1561265618)).append(i / 1000000).append(Class39.aClass39_518.method1124(class668, (byte) -128)).append(aString171).toString();
	}

	static String method699(int i, Class668 class668, Class625 class625) {
		if (i < 100000)
			return new StringBuilder().append(Class288.method5163(114388337 * class625.anInt8138, -478151071)).append(i).append(aString171).toString();
		if (i < 10000000)
			return new StringBuilder().append(Class288.method5163(class625.anInt8161 * -1459907571, -1668102800)).append(i / 1000).append(Class39.aClass39_520.method1124(class668, (byte) -55)).append(aString171).toString();
		return new StringBuilder().append(Class288.method5163(class625.anInt8162 * 2086406891, 1336245083)).append(i / 1000000).append(Class39.aClass39_518.method1124(class668, (byte) -67)).append(aString171).toString();
	}

	static String method700(int i, Class668 class668, Class625 class625) {
		if (i < 100000)
			return new StringBuilder().append(Class288.method5163(114388337 * class625.anInt8138, -1899643237)).append(i).append(aString171).toString();
		if (i < 10000000)
			return new StringBuilder().append(Class288.method5163(class625.anInt8161 * -1459907571, 1734801401)).append(i / 1000).append(Class39.aClass39_520.method1124(class668, (byte) -104)).append(aString171).toString();
		return new StringBuilder().append(Class288.method5163(class625.anInt8162 * 2086406891, 1263653570)).append(i / 1000000).append(Class39.aClass39_518.method1124(class668, (byte) -127)).append(aString171).toString();
	}

	static String method701(int i) {
		return new StringBuilder().append("<col=").append(Integer.toHexString(i)).append(">").toString();
	}

	static String method702(int i) {
		return new StringBuilder().append("<col=").append(Integer.toHexString(i)).append(">").toString();
	}

	public final boolean method703(boolean bool, Class2 class2) {
		int i;
		int i_299_;
		int i_300_;
		if (bool) {
			if (null != class2 && null != class2.anIntArray22) {
				i = class2.anIntArray22[0];
				i_299_ = class2.anIntArray22[1];
				i_300_ = class2.anIntArray22[2];
			} else {
				i = anInt131 * -432386905;
				i_299_ = 565816295 * anInt132;
				i_300_ = anInt134 * -2015837427;
			}
		} else if (null != class2 && class2.anIntArray21 != null) {
			i = class2.anIntArray21[0];
			i_299_ = class2.anIntArray21[1];
			i_300_ = class2.anIntArray21[2];
		} else {
			i = anInt125 * -1000812189;
			i_299_ = anInt130 * -551995617;
			i_300_ = 1732973397 * anInt133;
		}
		if (-1 == i)
			return true;
		boolean bool_301_ = true;
		if (!aClass9_123.aClass472_68.method7663(i, 0, 1089230115))
			bool_301_ = false;
		if (i_299_ != -1 && !aClass9_123.aClass472_68.method7663(i_299_, 0, 1089230115))
			bool_301_ = false;
		if (i_300_ != -1 && !aClass9_123.aClass472_68.method7663(i_300_, 0, 1089230115))
			bool_301_ = false;
		return bool_301_;
	}

	public final Class179 method704(boolean bool, Class2 class2) {
		int i;
		int i_302_;
		int i_303_;
		if (bool) {
			if (null != class2 && null != class2.anIntArray22) {
				i = class2.anIntArray22[0];
				i_302_ = class2.anIntArray22[1];
				i_303_ = class2.anIntArray22[2];
			} else {
				i = -432386905 * anInt131;
				i_302_ = anInt132 * 565816295;
				i_303_ = anInt134 * -2015837427;
			}
		} else if (class2 != null && null != class2.anIntArray21) {
			i = class2.anIntArray21[0];
			i_302_ = class2.anIntArray21[1];
			i_303_ = class2.anIntArray21[2];
		} else {
			i = -1000812189 * anInt125;
			i_302_ = anInt130 * -551995617;
			i_303_ = 1732973397 * anInt133;
		}
		if (i == -1)
			return null;
		Class179 class179 = Class179.method3485(aClass9_123.aClass472_68, i, 0);
		if (null == class179)
			return null;
		if (class179.anInt1952 < 13)
			class179.method3494(2);
		if (i_302_ != -1) {
			Class179 class179_304_ = Class179.method3485(aClass9_123.aClass472_68, i_302_, 0);
			if (class179_304_.anInt1952 < 13)
				class179_304_.method3494(2);
			if (-1 != i_303_) {
				Class179 class179_305_ = Class179.method3485(aClass9_123.aClass472_68, i_303_, 0);
				if (class179_305_.anInt1952 < 13)
					class179_305_.method3494(2);
				Class179[] class179s = { class179, class179_304_, class179_305_ };
				class179 = new Class179(class179s, 3);
			} else {
				Class179[] class179s = { class179, class179_304_ };
				class179 = new Class179(class179s, 2);
			}
		}
		if (!bool && (anInt135 * -426165707 != 0 || anInt137 * 1289891019 != 0 || anInt139 * -1604044721 != 0))
			class179.method3492(-426165707 * anInt135, 1289891019 * anInt137, -1604044721 * anInt139);
		if (bool && (0 != -1824931735 * anInt136 || 0 != 1564303847 * anInt138 || anInt140 * 1571926603 != 0))
			class179.method3492(-1824931735 * anInt136, 1564303847 * anInt138, 1571926603 * anInt140);
		if (originalModelColors != null) {
			short[] is;
			if (null != class2 && class2.aShortArray25 != null)
				is = class2.aShortArray25;
			else
				is = modifiedModelColors;
			for (int i_306_ = 0; i_306_ < originalModelColors.length; i_306_++)
				class179.method3490(originalModelColors[i_306_], is[i_306_]);
		}
		if (originalTextureColors != null) {
			short[] is;
			if (null != class2 && class2.aShortArray26 != null)
				is = class2.aShortArray26;
			else
				is = modifiedTextureColors;
			for (int i_307_ = 0; i_307_ < originalTextureColors.length; i_307_++)
				class179.method3491(originalTextureColors[i_307_], is[i_307_]);
		}
		return class179;
	}

	public final boolean method705(boolean bool, Class2 class2) {
		int i;
		int i_308_;
		int i_309_;
		if (bool) {
			if (null != class2 && null != class2.anIntArray22) {
				i = class2.anIntArray22[0];
				i_308_ = class2.anIntArray22[1];
				i_309_ = class2.anIntArray22[2];
			} else {
				i = anInt131 * -432386905;
				i_308_ = 565816295 * anInt132;
				i_309_ = anInt134 * -2015837427;
			}
		} else if (null != class2 && class2.anIntArray21 != null) {
			i = class2.anIntArray21[0];
			i_308_ = class2.anIntArray21[1];
			i_309_ = class2.anIntArray21[2];
		} else {
			i = anInt125 * -1000812189;
			i_308_ = anInt130 * -551995617;
			i_309_ = 1732973397 * anInt133;
		}
		if (-1 == i)
			return true;
		boolean bool_310_ = true;
		if (!aClass9_123.aClass472_68.method7663(i, 0, 1089230115))
			bool_310_ = false;
		if (i_308_ != -1 && !aClass9_123.aClass472_68.method7663(i_308_, 0, 1089230115))
			bool_310_ = false;
		if (i_309_ != -1 && !aClass9_123.aClass472_68.method7663(i_309_, 0, 1089230115))
			bool_310_ = false;
		return bool_310_;
	}

	public final Class167 method706(Class178 class178, int i, int i_311_, Class623 class623, Class707 class707, int i_312_, int i_313_, int i_314_, int i_315_) {
		if (null != stackIds && i_311_ > 1) {
			int i_316_ = -1;
			for (int i_317_ = 0; i_317_ < 10; i_317_++) {
				if (i_311_ >= stackAmounts[i_317_] && stackAmounts[i_317_] != 0)
					i_316_ = stackIds[i_317_];
			}
			if (-1 != i_316_)
				return (((ItemDefinitions) anInterface12_99.getDefinition(i_316_, (byte) -32)).method660(class178, i, 1, class623, class707, i_312_, i_313_, i_314_, i_315_, (byte) 0));
		}
		int i_318_ = i;
		if (null != class707)
			i_318_ |= class707.method14173(-354208221);
		Class167 class167;
		synchronized (aClass9_123.aClass209_69) {
			class167 = ((Class167) (aClass9_123.aClass209_69.method3767((long) (-1839300959 * anInt116 | -1144788131 * class178.anInt1922 << 29))));
		}
		if (class167 == null || class178.method3068(class167.method2683(), i_318_) != 0) {
			if (class167 != null)
				i_318_ = class178.method3117(i_318_, class167.method2683());
			int i_319_ = i_318_;
			if (originalTextureColors != null)
				i_319_ |= 0x8000;
			if (null != originalModelColors || null != class623)
				i_319_ |= 0x4000;
			if (anInt155 * -819886411 != 128)
				i_319_ |= 0x1;
			if (128 != 249832533 * anInt95)
				i_319_ |= 0x2;
			if (128 != anInt157 * -647090469)
				i_319_ |= 0x4;
			Class179 class179 = Class179.method3485(aClass9_123.aClass472_68, anInt106 * -1609101827, 0);
			if (null == class179)
				return null;
			if (class179.anInt1952 < 13)
				class179.method3494(2);
			class167 = class178.method3115(class179, i_319_, aClass9_123.anInt75 * -417890817, 1991235147 * anInt158 + 64, 850 + 1215680939 * anInt127);
			if (128 != -819886411 * anInt155 || anInt95 * 249832533 != 128 || -647090469 * anInt157 != 128)
				class167.method2691(anInt155 * -819886411, 249832533 * anInt95, -647090469 * anInt157);
			if (originalModelColors != null) {
				for (int i_320_ = 0; i_320_ < originalModelColors.length; i_320_++) {
					if (aByteArray107 != null && i_320_ < aByteArray107.length)
						class167.method2725(originalModelColors[i_320_], (aShortArray162[aByteArray107[i_320_] & 0xff]));
					else
						class167.method2725(originalModelColors[i_320_], modifiedModelColors[i_320_]);
				}
			}
			if (originalTextureColors != null) {
				for (int i_321_ = 0; i_321_ < originalTextureColors.length; i_321_++)
					class167.method2826(originalTextureColors[i_321_], modifiedTextureColors[i_321_]);
			}
			if (class623 != null) {
				for (int i_322_ = 0; i_322_ < 10; i_322_++) {
					for (int i_323_ = 0; i_323_ < Class150.aShortArrayArray1725[i_322_].length; i_323_++) {
						if (class623.anIntArray8102[i_322_] < (Class207.aShortArrayArrayArray2248[i_322_][i_323_]).length)
							class167.method2725(Class150.aShortArrayArray1725[i_322_][i_323_], (Class207.aShortArrayArrayArray2248[i_322_][i_323_][class623.anIntArray8102[i_322_]]));
					}
				}
				for (int i_324_ = 0; i_324_ < 10; i_324_++) {
					for (int i_325_ = 0; i_325_ < Class546.aShortArrayArray7302[i_324_].length; i_325_++) {
						if (class623.anIntArray8103[i_324_] < (Class21.aShortArrayArrayArray214[i_324_][i_325_]).length)
							class167.method2826(Class546.aShortArrayArray7302[i_324_][i_325_], (Class21.aShortArrayArrayArray214[i_324_][i_325_][class623.anIntArray8103[i_324_]]));
					}
				}
			}
			class167.method2769(i_318_);
			synchronized (aClass9_123.aClass209_69) {
				aClass9_123.aClass209_69.method3770(class167, (long) (-1839300959 * anInt116 | class178.anInt1922 * -1144788131 << 29));
			}
		}
		if (null != class707 || 0 != i_315_) {
			class167 = class167.method2681((byte) 1, i_318_, true);
			if (null != class707)
				class707.method14229(class167, 0, 2111812361);
			if (i_315_ != 0)
				class167.method2839(i_312_, i_313_, i_314_, i_315_);
		}
		class167.method2769(i);
		return class167;
	}

	public ItemDefinitions method707(int i) {
		if (stackIds != null && i > 1) {
			int i_326_ = -1;
			for (int i_327_ = 0; i_327_ < 10; i_327_++) {
				if (i >= stackAmounts[i_327_] && 0 != stackAmounts[i_327_])
					i_326_ = stackIds[i_327_];
			}
			if (-1 != i_326_)
				return (ItemDefinitions) anInterface12_99.getDefinition(i_326_, (byte) 23);
		}
		return this;
	}

	public final Class179 method708(boolean bool, Class2 class2) {
		int i;
		int i_328_;
		if (bool) {
			if (class2 != null && class2.anIntArray20 != null) {
				i = class2.anIntArray20[0];
				i_328_ = class2.anIntArray20[1];
			} else {
				i = anInt143 * -478576253;
				i_328_ = -1123046437 * anInt144;
			}
		} else if (class2 != null && class2.anIntArray23 != null) {
			i = class2.anIntArray23[0];
			i_328_ = class2.anIntArray23[1];
		} else {
			i = anInt141 * -1781791225;
			i_328_ = anInt100 * 1731276927;
		}
		if (-1 == i)
			return null;
		Class179 class179 = Class179.method3485(aClass9_123.aClass472_68, i, 0);
		if (class179.anInt1952 < 13)
			class179.method3494(2);
		if (i_328_ != -1) {
			Class179 class179_329_ = Class179.method3485(aClass9_123.aClass472_68, i_328_, 0);
			if (class179_329_.anInt1952 < 13)
				class179_329_.method3494(2);
			Class179[] class179s = { class179, class179_329_ };
			class179 = new Class179(class179s, 2);
		}
		if (null != originalModelColors) {
			short[] is;
			if (class2 != null && null != class2.aShortArray25)
				is = class2.aShortArray25;
			else
				is = modifiedModelColors;
			for (int i_330_ = 0; i_330_ < originalModelColors.length; i_330_++)
				class179.method3490(originalModelColors[i_330_], is[i_330_]);
		}
		if (null != originalTextureColors) {
			short[] is;
			if (null != class2 && null != class2.aShortArray26)
				is = class2.aShortArray26;
			else
				is = modifiedTextureColors;
			for (int i_331_ = 0; i_331_ < originalTextureColors.length; i_331_++)
				class179.method3491(originalTextureColors[i_331_], is[i_331_]);
		}
		return class179;
	}

	void method709(ItemDefinitions class12_332_, ItemDefinitions class12_333_, Class668 class668) {
		method658(Class18.aClass18_196, class12_332_, class12_333_, Class39.aClass39_525, class668, -269485448);
	}

	void method710(ItemDefinitions class12_334_, ItemDefinitions class12_335_, Class668 class668) {
		method658(Class18.aClass18_196, class12_334_, class12_335_, Class39.aClass39_525, class668, -269485448);
	}

	public void method62(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(367998793);
			if (0 == i)
				break;
			decodeItemDefinitions(class523_sub34, i, (byte) 112);
		}
	}

	public final boolean method711(boolean bool, Class2 class2) {
		int i;
		int i_336_;
		if (bool) {
			if (null != class2 && class2.anIntArray20 != null) {
				i = class2.anIntArray20[0];
				i_336_ = class2.anIntArray20[1];
			} else {
				i = anInt143 * -478576253;
				i_336_ = -1123046437 * anInt144;
			}
		} else if (null != class2 && class2.anIntArray23 != null) {
			i = class2.anIntArray23[0];
			i_336_ = class2.anIntArray23[1];
		} else {
			i = anInt141 * -1781791225;
			i_336_ = 1731276927 * anInt100;
		}
		if (-1 == i)
			return true;
		boolean bool_337_ = true;
		if (!aClass9_123.aClass472_68.method7663(i, 0, 1089230115))
			bool_337_ = false;
		if (-1 != i_336_ && !aClass9_123.aClass472_68.method7663(i_336_, 0, 1089230115))
			bool_337_ = false;
		return bool_337_;
	}

	void method712(ItemDefinitions class12_338_, ItemDefinitions class12_339_, Class668 class668) {
		method658(Class18.aClass18_193, class12_338_, class12_339_, null, class668, -269485448);
	}

	public final Class179 method713(boolean bool, Class2 class2) {
		int i;
		int i_340_;
		if (bool) {
			if (class2 != null && class2.anIntArray20 != null) {
				i = class2.anIntArray20[0];
				i_340_ = class2.anIntArray20[1];
			} else {
				i = anInt143 * -478576253;
				i_340_ = -1123046437 * anInt144;
			}
		} else if (class2 != null && class2.anIntArray23 != null) {
			i = class2.anIntArray23[0];
			i_340_ = class2.anIntArray23[1];
		} else {
			i = anInt141 * -1781791225;
			i_340_ = anInt100 * 1731276927;
		}
		if (-1 == i)
			return null;
		Class179 class179 = Class179.method3485(aClass9_123.aClass472_68, i, 0);
		if (class179.anInt1952 < 13)
			class179.method3494(2);
		if (i_340_ != -1) {
			Class179 class179_341_ = Class179.method3485(aClass9_123.aClass472_68, i_340_, 0);
			if (class179_341_.anInt1952 < 13)
				class179_341_.method3494(2);
			Class179[] class179s = { class179, class179_341_ };
			class179 = new Class179(class179s, 2);
		}
		if (null != originalModelColors) {
			short[] is;
			if (class2 != null && null != class2.aShortArray25)
				is = class2.aShortArray25;
			else
				is = modifiedModelColors;
			for (int i_342_ = 0; i_342_ < originalModelColors.length; i_342_++)
				class179.method3490(originalModelColors[i_342_], is[i_342_]);
		}
		if (null != originalTextureColors) {
			short[] is;
			if (null != class2 && null != class2.aShortArray26)
				is = class2.aShortArray26;
			else
				is = modifiedTextureColors;
			for (int i_343_ = 0; i_343_ < originalTextureColors.length; i_343_++)
				class179.method3491(originalTextureColors[i_343_], is[i_343_]);
		}
		return class179;
	}

	public void method75(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(1645191555);
			if (0 == i)
				break;
			decodeItemDefinitions(class523_sub34, i, (byte) 43);
		}
	}

	public int method714(int i, int i_344_) {
		if (aClass14_163 == null)
			return i_344_;
		Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass14_163.method741((long) i);
		if (class523_sub24 == null)
			return i_344_;
		return class523_sub24.anInt10542 * -677457577;
	}

	public int method715(int i, int i_345_) {
		if (aClass14_163 == null)
			return i_345_;
		Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass14_163.method741((long) i);
		if (class523_sub24 == null)
			return i_345_;
		return class523_sub24.anInt10542 * -677457577;
	}

	public int method716(int i, int i_346_) {
		if (aClass14_163 == null)
			return i_346_;
		Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass14_163.method741((long) i);
		if (class523_sub24 == null)
			return i_346_;
		return class523_sub24.anInt10542 * -677457577;
	}

	public int method717(int i, int i_347_) {
		if (aClass14_163 == null)
			return i_347_;
		Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass14_163.method741((long) i);
		if (class523_sub24 == null)
			return i_347_;
		return class523_sub24.anInt10542 * -677457577;
	}

	public int method718(int i, int i_348_) {
		if (aClass14_163 == null)
			return i_348_;
		Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass14_163.method741((long) i);
		if (class523_sub24 == null)
			return i_348_;
		return class523_sub24.anInt10542 * -677457577;
	}

	public void method76(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-353172943);
			if (0 == i)
				break;
			decodeItemDefinitions(class523_sub34, i, (byte) 33);
		}
	}

	public int method719(int i) {
		if (anIntArray124 == null)
			return -1;
		return anIntArray124[i];
	}

	public int method720(int i) {
		if (anIntArray124 == null)
			return -1;
		return anIntArray124[i];
	}

	public int method721(int i) {
		if (anIntArray119 == null)
			return -1;
		return anIntArray119[i];
	}

	static final void method722(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aClass72_11938.method1494((byte) 39);
	}
}
