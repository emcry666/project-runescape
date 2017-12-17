/* Class534 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class Class534 {
	protected static Class209 aClass209_7136;
	protected static byte[][][] aByteArrayArrayArray7137;
	protected static int anInt7138;
	static byte[] aByteArray7139;
	static Interface12 anInterface12_7140;
	protected static Interface17 anInterface17_7141;
	protected static Interface19 anInterface19_7142;
	static int[] anIntArray7143;
	public static Class523_Sub27_Sub17 aClass523_Sub27_Sub17_7144;
	static Class472 aClass472_7145;
	protected static Class472 aClass472_7146;
	static Class14 aClass14_7147;
	static int[][] anIntArrayArray7148;
	protected static int anInt7149;
	static short[] aShortArray7150;
	protected static int anInt7151;
	static int[] anIntArray7152;
	static byte[] aByteArray7153;
	public static float aFloat7154;
	public static float aFloat7155;
	protected static Class528 aClass528_7156;
	static int[] anIntArray7157;
	public static Class624 aClass624_7158;
	public static int anInt7159;
	protected static int anInt7160;
	protected static int anInt7161;
	static int[] anIntArray7162;
	static short[] aShortArray7163;
	static byte[] aByteArray7164;
	static final int anInt7165 = 64;
	static short[] aShortArray7166;
	protected static int anInt7167;
	public static int anInt7168;
	static byte[] aByteArray7169;
	protected static boolean aBool7170;
	static boolean[][] aBoolArrayArray7171;
	static int anInt7172;
	static int anInt7173;
	static int anInt7174;
	static int anInt7175;
	static int anInt7176;
	static int anInt7177;
	static int anInt7178;
	static int anInt7179;
	static int anInt7180;
	static HashMap[][][] aHashMapArrayArrayArray7181;
	static Interface12 anInterface12_7182 = null;
	protected static Class209 aClass209_7183;
	protected static Class209 aClass209_7184;
	protected static Class53_Sub14 aClass53_Sub14_7185;
	static ArrayList anArrayList7186;
	static int anInt7187;
	static int[] anIntArray7188;
	protected static int anInt7189;
	protected static Class53_Sub18 aClass53_Sub18_7190;
	static Class523_Sub34 aClass523_Sub34_7191;
	static Class523_Sub34 aClass523_Sub34_7192;
	protected static boolean aBool7193;
	protected static Class708 aClass708_7194;
	protected static int anInt7195;
	protected static int anInt7196;
	static boolean[] aBoolArray7197;
	protected static int anInt7198;
	static Object[] anObjectArray7199;
	protected static int anInt7200;
	protected static int anInt7201;
	protected static int anInt7202;
	protected static int anInt7203;
	static int anInt7204;
	static int anInt7205;
	protected static Class53_Sub1 aClass53_Sub1_7206;

	static boolean method8806(int i, int i_0_) {
		int i_1_ = i >> 3;
		int i_2_ = i_0_ >> 3;
		if (i_1_ < 0 || i_2_ < 0 || i_1_ >= aBoolArrayArray7171.length || i_2_ >= aBoolArrayArray7171[i_1_].length)
			return false;
		return aBoolArrayArray7171[i_1_][i_2_];
	}

	public static void method8807(Class472 class472, Class472 class472_3_, Class53_Sub12 class53_sub12, Class53_Sub5 class53_sub5, Class53_Sub18 class53_sub18, Class53_Sub1 class53_sub1, Class53_Sub14 class53_sub14, Interface19 interface19, Interface17 interface17) {
		aClass472_7145 = class472;
		aClass472_7146 = class472_3_;
		anInterface12_7182 = class53_sub12;
		anInterface12_7140 = class53_sub5;
		aClass53_Sub18_7190 = class53_sub18;
		aClass53_Sub1_7206 = class53_sub1;
		aClass53_Sub14_7185 = class53_sub14;
		anInterface19_7142 = interface19;
		anInterface17_7141 = interface17;
		aClass14_7147.method733(-174445056);
		int[] is = aClass472_7145.method7656(Class643.aClass643_8340.method82(), 949522935);
		if (is != null) {
			for (int i = 0; i < is.length; i++) {
				Class523_Sub27_Sub17 class523_sub27_sub17 = Class275.method5042(aClass472_7145, is[i], (byte) 59);
				aClass14_7147.method738(class523_sub27_sub17, (long) (class523_sub27_sub17.anInt11831 * -536403473));
			}
		}
		Class226.method4166(true, false, 240723773);
	}

	static void method8808(int[] is, int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, boolean bool, boolean bool_10_, boolean bool_11_, boolean bool_12_) {
		for (int i_13_ = i; i_13_ <= i_4_; i_13_++) {
			boolean bool_14_ = (bool_10_ ? (aBoolArray7197[anInt7177] && i_4_ - i_13_ < aClass624_7158.anInt8126 * 1002542153) : false);
			boolean bool_15_ = (bool_12_ ? (aBoolArray7197[anInt7179] && i_13_ - i < aClass624_7158.anInt8126 * 1002542153) : false);
			for (int i_16_ = i_5_; i_16_ <= i_6_; i_16_++) {
				if (bool_14_ || bool_15_)
					is[(i_7_ - i_16_ - 1) * i_7_ + i_13_] = aClass624_7158.anInt8125 * -443813705;
				else {
					boolean bool_17_ = bool ? (aBoolArray7197[anInt7173] && i_6_ - i_16_ < (aClass624_7158.anInt8126 * 1002542153)) : false;
					boolean bool_18_ = (bool_11_ ? (aBoolArray7197[anInt7172] && (i_16_ - i_5_ < aClass624_7158.anInt8126 * 1002542153)) : false);
					if (bool_17_ || bool_18_)
						is[(i_7_ - i_16_ - 1) * i_7_ + i_13_] = aClass624_7158.anInt8125 * -443813705;
					else {
						int i_19_ = is[(i_7_ - i_16_ - 1) * i_7_ + i_13_];
						if (i_19_ != anInt7204) {
							anInt7204 = i_19_;
							anInt7205 = (~0xffffff | ((((aClass624_7158.anInt8130 * 1433185939 & 0xff00ff) * i_8_ + (i_19_ & 0xff00ff) * i_9_) & ~0xff00ff) + ((((aClass624_7158.anInt8130 * 1433185939) & 0xff00) * i_8_ + (i_19_ & 0xff00) * i_9_) & 0xff0000)) >> 8);
						}
						is[(i_7_ - i_16_ - 1) * i_7_ + i_13_] = anInt7205;
					}
				}
			}
		}
	}

	static void method8809() {
		aShortArray7163 = null;
		aByteArray7164 = null;
		aShortArray7150 = null;
		aShortArray7166 = null;
		aByteArray7139 = null;
		anObjectArray7199 = null;
		aByteArray7169 = null;
		aHashMapArrayArrayArray7181 = null;
		anIntArray7162 = null;
		aBoolArrayArray7171 = null;
	}

	public static Class697 method8810(int i, int i_20_) {
		Class697 class697 = new Class697();
		for (Class523_Sub27_Sub17 class523_sub27_sub17 = (Class523_Sub27_Sub17) aClass14_7147.method735(-380907255); class523_sub27_sub17 != null; class523_sub27_sub17 = ((Class523_Sub27_Sub17) aClass14_7147.method749(1640498952))) {
			if (class523_sub27_sub17.aBool11826 && class523_sub27_sub17.method18191(i, i_20_, 632146607))
				class697.method14030(class523_sub27_sub17, (byte) -28);
		}
		return class697;
	}

	static boolean method8811(Class523_Sub27_Sub17 class523_sub27_sub17) {
		if (class523_sub27_sub17 != null && class523_sub27_sub17 != aClass523_Sub27_Sub17_7144) {
			aClass523_Sub27_Sub17_7144 = class523_sub27_sub17;
			aBool7170 = (aClass523_Sub27_Sub17_7144.anInt11831 * -536403473 == aClass624_7158.anInt8118 * -1183714497);
			return true;
		}
		return false;
	}

	public static Class523_Sub27_Sub17 method8812(int i, int i_21_) {
		for (Class523_Sub27_Sub17 class523_sub27_sub17 = (Class523_Sub27_Sub17) aClass14_7147.method735(-380907255); class523_sub27_sub17 != null; class523_sub27_sub17 = ((Class523_Sub27_Sub17) aClass14_7147.method749(-1084126365))) {
			if (class523_sub27_sub17.aBool11826 && class523_sub27_sub17.method18191(i, i_21_, 632146607))
				return class523_sub27_sub17;
		}
		return null;
	}

	public static Class523_Sub27_Sub17 method8813(int i) {
		return (Class523_Sub27_Sub17) aClass14_7147.method741((long) i);
	}

	static int method8814(Interface12 interface12, Class172 class172, int i, int i_22_, int i_23_) {
		Class651 class651 = (Class651) interface12.getDefinition(i, (byte) 31);
		if (class651 == null)
			return 0;
		int i_24_ = class651.anInt8394 * 634101717;
		if (i_24_ >= 0 && class172.method2895(i_24_, -1343126460).aBool1876)
			i_24_ = -1;
		int i_25_;
		if (class651.anInt8386 * 99640975 >= 0) {
			int i_26_ = class651.anInt8386 * 99640975;
			int i_27_ = (i_26_ & 0x7f) + i_23_;
			if (i_27_ < 0)
				i_27_ = 0;
			else if (i_27_ > 127)
				i_27_ = 127;
			int i_28_ = (i_26_ + i_22_ & 0xfc00) + (i_26_ & 0x380) + i_27_;
			i_25_ = (~0xffffff | (Class638.anIntArray8306[Class493.method8085(Class500.method8118(i_28_, 96, 882495561), -367816651) & 0xffff]));
		} else if (i_24_ >= 0)
			i_25_ = (~0xffffff | (Class638.anIntArray8306[Class493.method8085(Class500.method8118((class172.method2895(i_24_, 448503014).aShort1907), 96, 882495561), 629061104) & 0xffff]));
		else if (class651.anInt8383 * -1082268879 == -1)
			i_25_ = 0;
		else {
			int i_29_ = class651.anInt8383 * -1082268879;
			int i_30_ = (i_29_ & 0x7f) + i_23_;
			if (i_30_ < 0)
				i_30_ = 0;
			else if (i_30_ > 127)
				i_30_ = 127;
			int i_31_ = (i_29_ + i_22_ & 0xfc00) + (i_29_ & 0x380) + i_30_;
			i_25_ = (~0xffffff | (Class638.anIntArray8306[Class493.method8085(Class500.method8118(i_31_, 96, 882495561), -412581766) & 0xffff]));
		}
		return i_25_;
	}

	static void method8815(int[] is, int i, int i_32_, int i_33_, int i_34_, int i_35_) {
		int i_36_ = i + (i_34_ - i_32_ - 1) * i_34_;
		for (int i_37_ = 0; i_37_ < i_33_; i_37_++)
			is[i_36_ + i_37_ * i_34_] = i_35_;
	}

	static int method8816(Class172 class172, int i, int i_38_, int i_39_) {
		return method8817(anInterface12_7182, class172, i, i_38_, i_39_);
	}

	static int method8817(Interface12 interface12, Class172 class172, int i, int i_40_, int i_41_) {
		Class651 class651 = (Class651) interface12.getDefinition(i, (byte) -24);
		if (class651 == null)
			return 0;
		int i_42_ = class651.anInt8394 * 634101717;
		if (i_42_ >= 0 && class172.method2895(i_42_, -526118017).aBool1876)
			i_42_ = -1;
		int i_43_;
		if (class651.anInt8386 * 99640975 >= 0) {
			int i_44_ = class651.anInt8386 * 99640975;
			int i_45_ = (i_44_ & 0x7f) + i_41_;
			if (i_45_ < 0)
				i_45_ = 0;
			else if (i_45_ > 127)
				i_45_ = 127;
			int i_46_ = (i_44_ + i_40_ & 0xfc00) + (i_44_ & 0x380) + i_45_;
			i_43_ = (~0xffffff | (Class638.anIntArray8306[Class493.method8085(Class500.method8118(i_46_, 96, 882495561), -531205411) & 0xffff]));
		} else if (i_42_ >= 0)
			i_43_ = (~0xffffff | (Class638.anIntArray8306[Class493.method8085(Class500.method8118((class172.method2895(i_42_, 295364078).aShort1907), 96, 882495561), 40820697) & 0xffff]));
		else if (class651.anInt8383 * -1082268879 == -1)
			i_43_ = 0;
		else {
			int i_47_ = class651.anInt8383 * -1082268879;
			int i_48_ = (i_47_ & 0x7f) + i_41_;
			if (i_48_ < 0)
				i_48_ = 0;
			else if (i_48_ > 127)
				i_48_ = 127;
			int i_49_ = (i_47_ + i_40_ & 0xfc00) + (i_47_ & 0x380) + i_48_;
			i_43_ = (~0xffffff | (Class638.anIntArray8306[Class493.method8085(Class500.method8118(i_49_, 96, 882495561), 849119467) & 0xffff]));
		}
		return i_43_;
	}

	static boolean method8818(Class178 class178, int i, int i_50_, boolean bool) {
		long l = Class248.method4401(1516375036);
		if (anInt7189 == 0) {
			if (aClass523_Sub27_Sub17_7144.anInt11831 * -536403473 == aClass624_7158.anInt8128 * 1217610883) {
				int i_51_ = aClass472_7146.method7646((aClass523_Sub27_Sub17_7144.aString11824), (byte) -11);
				if (aClass523_Sub34_7192 == null)
					aClass523_Sub34_7192 = (new Class523_Sub34(aClass472_7146.method7688(i_51_, 0, 727781809)));
				aClass523_Sub34_7191 = aClass523_Sub34_7192;
				aClass523_Sub34_7191.anInt10661 = 0;
			} else {
				int i_52_ = aClass472_7146.method7646((aClass523_Sub27_Sub17_7144.aString11824), (byte) -72);
				aClass523_Sub34_7191 = new Class523_Sub34(aClass472_7146.method7688(i_52_, 0, 96657360));
			}
			int i_53_ = aClass523_Sub34_7191.readUnsignedByte(1916844447);
			anIntArray7143 = new int[i_53_];
			for (int i_54_ = 0; i_54_ < i_53_; i_54_++)
				anIntArray7143[i_54_] = aClass523_Sub34_7191.readUnsignedSmart(368514876);
			int i_55_ = aClass523_Sub34_7191.readUnsignedByte(31223996);
			anIntArray7157 = new int[i_55_];
			for (int i_56_ = 0; i_56_ < i_55_; i_56_++)
				anIntArray7157[i_56_] = aClass523_Sub34_7191.readUnsignedSmart(368514876);
		}
		while (aClass523_Sub34_7191 != null && (aClass523_Sub34_7191.anInt10661 * 2349011 < aClass523_Sub34_7191.aByteArray10658.length) && (!bool || (Class248.method4401(1516375036) < l + (long) anInt7175))) {
			if (aClass523_Sub34_7191.readUnsignedByte(686269608) == 0) {
				int i_57_ = aClass523_Sub34_7191.readUnsignedByte(-1647765334);
				int i_58_ = aClass523_Sub34_7191.readUnsignedByte(-1806403254);
				for (int i_59_ = 0; i_59_ < 8; i_59_++) {
					int i_60_ = aClass523_Sub34_7191.readUnsignedByte(2010346161);
					int i_61_ = i_57_ * 8 + i_59_ - anInt7168 / 8;
					for (int i_62_ = 0; i_62_ < 8; i_62_++) {
						int i_63_ = i_58_ * 8 + i_62_ - anInt7159 / 8;
						aBoolArrayArray7171[i_61_][i_63_] = (i_60_ & 1 << i_62_) != 0;
					}
				}
				for (int i_64_ = 0; i_64_ < 64; i_64_++) {
					for (int i_65_ = 0; i_65_ < 64; i_65_++) {
						int i_66_ = i_57_ * 64 + i_64_ - anInt7168;
						int i_67_ = i_58_ * 64 + i_65_ - anInt7159;
						method8892(class178, aClass523_Sub34_7191, i_57_, i_58_, i_66_, i_67_, anIntArray7143, anIntArray7157);
					}
				}
			} else {
				int i_68_ = aClass523_Sub34_7191.readUnsignedByte(1179656245);
				int i_69_ = aClass523_Sub34_7191.readUnsignedByte(346541322);
				int i_70_ = aClass523_Sub34_7191.readUnsignedByte(594742088);
				int i_71_ = aClass523_Sub34_7191.readUnsignedByte(541948777);
				aBoolArrayArray7171[i_68_ * 8 + i_70_ - anInt7168 / 8][i_69_ * 8 + i_71_ - anInt7159 / 8] = aClass523_Sub34_7191.readUnsignedByte(314669914) != 0;
				for (int i_72_ = 0; i_72_ < 8; i_72_++) {
					for (int i_73_ = 0; i_73_ < 8; i_73_++) {
						int i_74_ = i_68_ * 64 + i_70_ * 8 + i_72_ - anInt7168;
						int i_75_ = i_69_ * 64 + i_71_ * 8 + i_73_ - anInt7159;
						method8892(class178, aClass523_Sub34_7191, i_68_, i_69_, i_74_, i_75_, anIntArray7143, anIntArray7157);
					}
				}
			}
		}
		if (aClass523_Sub34_7191 != null) {
			anInt7189 = aClass523_Sub34_7191.anInt10661 * 2349011;
			if (aClass523_Sub34_7191.anInt10661 * 2349011 < aClass523_Sub34_7191.aByteArray10658.length)
				return false;
		}
		aClass523_Sub34_7191 = null;
		anIntArray7157 = null;
		anIntArray7143 = null;
		if (aShortArray7163 != null) {
			aByteArray7164 = new byte[anInt7160 * anInt7138];
			aShortArray7150 = new short[anInt7160 * anInt7138];
			for (int i_76_ = 0; i_76_ < 3; i_76_++) {
				short[] is = new short[anInt7160 * anInt7138];
				for (int i_77_ = 0; i_77_ < aHashMapArrayArrayArray7181[i_76_].length; i_77_++) {
					for (int i_78_ = 0; i_78_ < aHashMapArrayArrayArray7181[i_76_][0].length; i_78_++) {
						HashMap hashmap = aHashMapArrayArrayArray7181[i_76_][i_77_][i_78_];
						if (hashmap != null) {
							Iterator iterator = hashmap.values().iterator();
							while (iterator.hasNext()) {
								Class527 class527 = (Class527) iterator.next();
								is[(i_77_ * 64 + class527.aByte7092 + ((i_78_ * 64 + class527.aByte7091) * anInt7160))] = (short) class527.anInt7093;
							}
						}
					}
				}
				method8821(is, aByteArray7164, aShortArray7150, i, i_50_);
				for (int i_79_ = 0; i_79_ < aHashMapArrayArrayArray7181[i_76_].length; i_79_++) {
					for (int i_80_ = 0; i_80_ < aHashMapArrayArrayArray7181[i_76_][0].length; i_80_++) {
						HashMap hashmap = aHashMapArrayArrayArray7181[i_76_][i_79_][i_80_];
						if (hashmap != null) {
							Iterator iterator = hashmap.values().iterator();
							while (iterator.hasNext()) {
								Class527 class527 = (Class527) iterator.next();
								int i_81_ = (i_79_ * 64 + class527.aByte7092 + ((i_80_ * 64 + class527.aByte7091) * anInt7160));
								class527.anInt7093 = ((aByteArray7164[i_81_] & 0xff) << 16 | aShortArray7150[i_81_] & 0xffff);
								if (class527.anInt7093 != 0)
									class527.anInt7093 |= ~0xffffff;
							}
						}
					}
				}
			}
			method8821(aShortArray7163, aByteArray7164, aShortArray7150, i, i_50_);
			aShortArray7163 = null;
		}
		if (!bool || Class248.method4401(1516375036) < l + (long) anInt7175) {
			method8820();
			return true;
		}
		return false;
	}

	static void method8819(int[] is, int i, int i_82_, int i_83_, int i_84_, int i_85_, int i_86_, int i_87_) {
		for (int i_88_ = i; i_88_ <= i_82_; i_88_++) {
			for (int i_89_ = i_83_; i_89_ <= i_84_; i_89_++)
				is[(i_86_ - i_89_ - 1) * i_85_ + i_88_] = i_87_;
		}
	}

	static void method8820() {
		for (int i = 0; i < anInt7160; i++) {
			for (int i_90_ = 0; i_90_ < anInt7138; i_90_++) {
				Object object = anObjectArray7199[i + i_90_ * anInt7160];
				if (object != null) {
					if (object instanceof Class523_Sub35) {
						Class523_Sub35 class523_sub35 = (Class523_Sub35) object;
						if (class523_sub35 != null) {
							for (int i_91_ = 0; i_91_ < class523_sub35.anIntArray10664.length; i_91_++) {
								Class602 class602 = ((Class602) (aClass53_Sub18_7190.getDefinition(class523_sub35.anIntArray10664[i_91_], (byte) -89)));
								int i_92_ = class602.anInt7906 * -1296551513;
								if (class602.anIntArray7912 != null) {
									class602 = (class602.method9893(anInterface19_7142, anInterface17_7141, -80343261));
									if (class602 != null)
										i_92_ = class602.anInt7906 * -1296551513;
								}
								if (i_92_ != -1) {
									Class523_Sub32 class523_sub32 = new Class523_Sub32(i_92_);
									class523_sub32.anInt10580 = i * -79680441;
									class523_sub32.anInt10581 = i_90_ * -1573818035;
									aClass708_7194.method14236(class523_sub32, -888343887);
								}
							}
						}
					} else {
						Integer integer = (Integer) object;
						Class602 class602 = ((Class602) aClass53_Sub18_7190.getDefinition(integer.intValue(), (byte) 15));
						int i_93_ = class602.anInt7906 * -1296551513;
						if (class602.anIntArray7912 != null) {
							class602 = class602.method9893(anInterface19_7142, anInterface17_7141, 886280343);
							if (class602 != null)
								i_93_ = class602.anInt7906 * -1296551513;
						}
						if (i_93_ != -1) {
							Class523_Sub32 class523_sub32 = new Class523_Sub32(i_93_);
							class523_sub32.anInt10580 = i * -79680441;
							class523_sub32.anInt10581 = i_90_ * -1573818035;
							aClass708_7194.method14236(class523_sub32, -1158549818);
						}
					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int i_94_ = 0; i_94_ < aHashMapArrayArrayArray7181[0].length; i_94_++) {
				for (int i_95_ = 0; i_95_ < aHashMapArrayArrayArray7181[0][0].length; i_95_++) {
					HashMap hashmap = aHashMapArrayArrayArray7181[i][i_94_][i_95_];
					if (hashmap != null) {
						Iterator iterator = hashmap.values().iterator();
						while (iterator.hasNext()) {
							Class527 class527 = (Class527) iterator.next();
							if (class527.anIntArray7096 != null) {
								for (int i_96_ = 0; i_96_ < class527.anIntArray7096.length; i_96_++) {
									Class602 class602 = ((Class602) (aClass53_Sub18_7190.getDefinition(class527.anIntArray7096[i_96_], (byte) 3)));
									int i_97_ = class602.anInt7906 * -1296551513;
									if (class602.anIntArray7912 != null) {
										class602 = (class602.method9893(anInterface19_7142, anInterface17_7141, 483649338));
										if (class602 != null)
											i_97_ = (class602.anInt7906 * -1296551513);
									}
									if (i_97_ != -1) {
										Class523_Sub32 class523_sub32 = new Class523_Sub32(i_97_);
										class523_sub32.anInt10580 = ((i_94_ + (anInt7168 >> 6)) * 64 + class527.aByte7092 - anInt7168) * -79680441;
										class523_sub32.anInt10581 = ((i_95_ + (anInt7159 >> 6)) * 64 + class527.aByte7091 - anInt7159) * -1573818035;
										aClass708_7194.method14236(class523_sub32, 516121500);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static void method8821(short[] is, byte[] is_98_, short[] is_99_, int i, int i_100_) {
		int[] is_101_ = new int[anInt7138];
		int[] is_102_ = new int[anInt7138];
		int[] is_103_ = new int[anInt7138];
		int[] is_104_ = new int[anInt7138];
		int[] is_105_ = new int[anInt7138];
		for (int i_106_ = -5; i_106_ < anInt7160; i_106_++) {
			int i_107_ = i_106_ + 5;
			int i_108_ = i_106_ - 5;
			for (int i_109_ = 0; i_109_ < anInt7138; i_109_++) {
				if (i_107_ < anInt7160) {
					short i_110_ = is[i_107_ + i_109_ * anInt7160];
					if (i_110_ > 0) {
						Class7 class7 = (Class7) anInterface12_7140.getDefinition(i_110_ - 1, (byte) -51);
						is_101_[i_109_] += class7.anInt54 * -95297807;
						is_102_[i_109_] += class7.anInt55 * 1400193059;
						is_103_[i_109_] += class7.anInt50 * 271765687;
						is_104_[i_109_] += class7.anInt51 * 1218541115;
						is_105_[i_109_]++;
					}
				}
				if (i_108_ >= 0) {
					short i_111_ = is[i_108_ + i_109_ * anInt7160];
					if (i_111_ > 0) {
						Class7 class7 = (Class7) anInterface12_7140.getDefinition(i_111_ - 1, (byte) -49);
						is_101_[i_109_] -= class7.anInt54 * -95297807;
						is_102_[i_109_] -= class7.anInt55 * 1400193059;
						is_103_[i_109_] -= class7.anInt50 * 271765687;
						is_104_[i_109_] -= class7.anInt51 * 1218541115;
						is_105_[i_109_]--;
					}
				}
			}
			if (i_106_ >= 0) {
				int i_112_ = 0;
				int i_113_ = 0;
				int i_114_ = 0;
				int i_115_ = 0;
				int i_116_ = 0;
				for (int i_117_ = -5; i_117_ < anInt7138; i_117_++) {
					int i_118_ = i_117_ + 5;
					if (i_118_ < anInt7138) {
						i_112_ += is_101_[i_118_];
						i_113_ += is_102_[i_118_];
						i_114_ += is_103_[i_118_];
						i_115_ += is_104_[i_118_];
						i_116_ += is_105_[i_118_];
					}
					int i_119_ = i_117_ - 5;
					if (i_119_ >= 0) {
						i_112_ -= is_101_[i_119_];
						i_113_ -= is_102_[i_119_];
						i_114_ -= is_103_[i_119_];
						i_115_ -= is_104_[i_119_];
						i_116_ -= is_105_[i_119_];
					}
					if (i_117_ >= 0 && i_116_ > 0) {
						if (is[i_106_ + i_117_ * anInt7160] == 0) {
							int i_120_ = i_106_ + i_117_ * anInt7160;
							is_98_[i_120_] = (byte) 0;
							is_99_[i_120_] = (short) 0;
						} else {
							int i_121_ = (i_115_ == 0 ? 0 : Class645.method10562((i_112_ * 256 / i_115_), i_113_ / i_116_, i_114_ / i_116_, 622121805));
							int i_122_ = (i_121_ & 0x7f) + i_100_;
							if (i_122_ < 0)
								i_122_ = 0;
							else if (i_122_ > 127)
								i_122_ = 127;
							int i_123_ = ((i_121_ + i & 0xfc00) + (i_121_ & 0x380) + i_122_);
							int i_124_ = i_106_ + i_117_ * anInt7160;
							int i_125_ = (Class638.anIntArray8306[(Class493.method8085(Class49.method1276(i_123_, 96, (byte) 0), 402911302)) & 0xffff]);
							is_98_[i_124_] = (byte) (i_125_ >> 16 & 0xff);
							is_99_[i_124_] = (short) (i_125_ & 0xffff);
						}
					}
				}
			}
		}
	}

	static void method8822() {
		int[] is = new int[3];
		for (int i = 0; i < aClass528_7156.anInt7099 * 1153952435; i++) {
			boolean bool = (aClass523_Sub27_Sub17_7144.method18193(aClass528_7156.anIntArray7098[i] >> 28 & 0x3, aClass528_7156.anIntArray7098[i] >> 14 & 0x3fff, aClass528_7156.anIntArray7098[i] & 0x3fff, is, (short) 10287));
			if (bool) {
				Class523_Sub32 class523_sub32 = new Class523_Sub32(aClass528_7156.anIntArray7100[i]);
				class523_sub32.anInt10580 = (is[1] - anInt7168) * -79680441;
				class523_sub32.anInt10581 = (is[2] - anInt7159) * -1573818035;
				aClass708_7194.method14236(class523_sub32, -158731748);
			}
		}
	}

	static void method8823(int i, int i_126_, int i_127_, int i_128_, int i_129_, int i_130_, int i_131_, int i_132_) {
		anInt7196 = i - anInt7168;
		anInt7195 = i_126_ - anInt7159;
		anInt7198 = i_127_ - anInt7168;
		anInt7167 = i_128_ - anInt7159;
		anInt7200 = i_129_;
		anInt7201 = i_130_;
		anInt7202 = i_131_;
		anInt7203 = i_132_;
	}

	static void method8824(Class178 class178, boolean bool, boolean bool_133_, boolean bool_134_, boolean bool_135_) {
		int i = anInt7198 - anInt7196;
		int i_136_ = anInt7195 - anInt7167;
		int i_137_ = (anInt7202 - anInt7200 << 16) / i;
		int i_138_ = (anInt7203 - anInt7201 << 16) / i_136_;
		method8825(class178, bool, bool_133_, i_137_, i_138_, 0, 0, bool_134_, bool_135_);
	}

	static void method8825(Class178 class178, boolean bool, boolean bool_139_, int i, int i_140_, int i_141_, int i_142_, boolean bool_143_, boolean bool_144_) {
		int i_145_ = anInt7198 - anInt7196;
		int i_146_ = anInt7195 - anInt7167;
		if (anInt7198 < anInt7160)
			i_145_++;
		if (anInt7195 < anInt7138)
			i_146_++;
		int i_147_ = anInt7196 / 64;
		int i_148_ = anInt7167 / 64;
		int i_149_ = (anInt7196 + i_145_) / 64;
		int i_150_ = (anInt7167 + i_146_) / 64;
		int i_151_;
		int i_152_;
		if (bool_144_) {
			i_151_ = (anInt7202 - anInt7200) / ((anInt7198 - anInt7196) / 64);
			i_152_ = i_151_;
		} else {
			i_151_ = method8835();
			i_152_ = (int) Math.ceil((double) (64.0F * aFloat7154 / 2.0F));
		}
		anArrayList7186.clear();
		int i_153_ = 0;
		int i_154_ = i_151_ * i_151_;
		for (int i_155_ = i_147_; i_155_ <= i_149_; i_155_++) {
			for (int i_156_ = i_148_; i_156_ <= i_150_; i_156_++) {
				int i_157_ = (i_155_ << 16) + i_156_;
				int i_158_ = method8914((long) i_157_);
				if (i_158_ != i_151_) {
					if (i_155_ < 0 || i_155_ * 64 >= anInt7160 || i_156_ < 0 || i_156_ * 64 >= anInt7138)
						method8826(class178, i_155_, i_156_, i_151_, i_157_);
					else if (i_158_ == -1) {
						method8827(i_155_, i_156_, i_151_, i_157_, bool, bool_139_, bool_143_, class178);
						i_153_ += i_154_;
					} else
						anArrayList7186.add(Integer.valueOf(i_157_));
				}
			}
		}
		if (!anArrayList7186.isEmpty() && i_153_ < anInt7187) {
			for (Iterator iterator = anArrayList7186.iterator(); i_153_ < anInt7187 && iterator.hasNext(); i_153_ += i_154_) {
				int i_159_ = ((Integer) iterator.next()).intValue();
				int i_160_ = i_159_ >> 16 & 0xffff;
				int i_161_ = i_159_ & 0xffff;
				method8827(i_160_, i_161_, i_151_, i_159_, bool, bool_139_, bool_143_, class178);
			}
		}
		for (int i_162_ = i_147_; i_162_ <= i_149_; i_162_++) {
			int i_163_ = i_162_ * 64;
			int i_164_ = i_163_ - anInt7196;
			int i_165_ = i_152_;
			int i_166_ = (i_141_ + i * i_164_ >> 16) + anInt7200;
			int i_167_ = (i_141_ + i * (i_164_ + 64) >> 16) + anInt7200;
			if (i_166_ + i_165_ != i_167_)
				i_165_ = i_167_ - i_166_;
			for (int i_168_ = i_148_; i_168_ <= i_150_; i_168_++) {
				int i_169_ = i_168_ * 64;
				int i_170_ = i_169_ - anInt7167;
				int i_171_ = (i_162_ << 16) + i_168_;
				int i_172_ = i_152_;
				int i_173_ = anInt7203 - (i_142_ + i_140_ * i_170_ >> 16);
				int i_174_ = anInt7203 - (i_142_ + i_140_ * (i_170_ + 64) >> 16);
				if (i_173_ - i_172_ != i_174_)
					i_172_ = i_173_ - i_174_;
				i_173_ -= i_172_;
				Class148 class148 = (Class148) aClass209_7184.method3767((long) i_171_);
				if (class148 == null)
					throw new RuntimeException();
				if (class148.method2504() == i_165_ && class148.method2428() == i_172_)
					class148.method2435(i_166_, i_173_);
				else
					class148.method2438(i_166_, i_173_, i_165_, i_172_);
			}
		}
	}

	static void method8826(Class178 class178, int i, int i_175_, int i_176_, int i_177_) {
		Class148 class148 = (Class148) aClass209_7184.method3767(-1L);
		if (class148 == null || class148.method2504() != i_176_) {
			int i_178_;
			if (aClass523_Sub27_Sub17_7144.anInt11834 * -761949709 != -1)
				i_178_ = ~0xffffff | (aClass523_Sub27_Sub17_7144.anInt11834 * -761949709);
			else
				i_178_ = -16777216;
			if (anIntArray7188 == null || anIntArray7188.length != i_176_ * i_176_)
				anIntArray7188 = new int[i_176_ * i_176_];
			Arrays.fill(anIntArray7188, i_178_);
			class148 = class178.method3102(anIntArray7188, 0, i_176_, i_176_, i_176_, true);
			aClass209_7184.method3770(class148, -1L);
		}
		aClass209_7184.method3770(class148, (long) i_177_);
	}

	static void method8827(int i, int i_179_, int i_180_, int i_181_, boolean bool, boolean bool_182_, boolean bool_183_, Class178 class178) {
		int i_184_ = i * 64;
		int i_185_ = i_179_ * 64;
		if (anIntArray7188 == null || anIntArray7188.length != i_180_ * i_180_)
			anIntArray7188 = new int[i_180_ * i_180_];
		boolean bool_186_ = aBool7170 && !bool_183_;
		for (int i_187_ = 0; i_187_ < 64; i_187_++) {
			int i_188_ = i_184_ + i_187_;
			int i_189_ = i_187_ * i_180_ / 64;
			int i_190_ = (i_187_ + 1) * i_180_ / 64 - 1;
			if (i_190_ < i_189_)
				i_190_ = i_189_;
			for (int i_191_ = 0; i_191_ < 64; i_191_++) {
				int i_192_ = i_185_ + i_191_;
				boolean bool_193_ = bool;
				if (bool_186_ && !method8834(i_188_, i_192_))
					bool_193_ = false;
				int i_194_ = i_188_ + i_192_ * anInt7160;
				boolean bool_195_ = false;
				boolean bool_196_ = false;
				Object object = null;
				int i_197_ = ((aByteArray7164[i_194_] & 0xff) << 16 | aShortArray7150[i_194_] & 0xffff);
				if (i_197_ != 0)
					i_197_ |= ~0xffffff;
				short i_198_ = aShortArray7166[i_194_];
				object = anObjectArray7199[i_194_];
				int i_199_ = i_191_ * i_180_ / 64;
				int i_200_ = (i_191_ + 1) * i_180_ / 64 - 1;
				if (i_200_ < i_199_)
					i_200_ = i_199_;
				if (object != null) {
					if (object instanceof Class523_Sub35) {
						Class523_Sub35 class523_sub35 = (Class523_Sub35) object;
						if (class523_sub35 != null)
							method8837(anIntArray7188, i_189_, i_190_, i_199_, i_200_, i_180_, bool_193_, i_197_, i_198_, aByteArray7139[i_194_], class523_sub35.anIntArray10664, class523_sub35.aByteArray10665, true);
					} else {
						Integer integer = (Integer) object;
						anIntArray7152[0] = integer.intValue();
						aByteArray7153[0] = aByteArray7169[i_194_];
						method8837(anIntArray7188, i_189_, i_190_, i_199_, i_200_, i_180_, bool_193_, i_197_, i_198_, aByteArray7139[i_194_], anIntArray7152, aByteArray7153, true);
					}
				} else
					method8837(anIntArray7188, i_189_, i_190_, i_199_, i_200_, i_180_, bool_193_, i_197_, i_198_, aByteArray7139[i_194_], null, null, true);
			}
		}
		if (bool_182_) {
			for (int i_201_ = 0; i_201_ < 64; i_201_++) {
				int i_202_ = i_184_ + i_201_;
				boolean bool_203_ = i_201_ == 0 && i_202_ != 0;
				for (int i_204_ = 0; i_204_ < 64; i_204_++) {
					int i_205_ = i_185_ + i_204_;
					if (!bool_186_ || method8834(i_202_, i_205_)) {
						boolean bool_206_ = i_204_ == 0 && i_205_ != 0;
						int i_207_ = i_202_ + i_205_ * anInt7160;
						if (bool_203_ && bool_206_)
							method8828(class178, anIntArray7188, i_180_, -1, -1, i_202_ - 1, i_205_ - 1, i_207_ - 1 - anInt7160);
						if (bool_203_)
							method8828(class178, anIntArray7188, i_180_, -1, i_204_, i_202_ - 1, i_205_, i_207_ - 1);
						if (bool_206_)
							method8828(class178, anIntArray7188, i_180_, i_201_, -1, i_202_, i_205_ - 1, i_207_ - anInt7160);
						method8828(class178, anIntArray7188, i_180_, i_201_, i_204_, i_202_, i_205_, i_207_);
					}
				}
			}
		}
		int i_208_ = i * 64 / 64;
		int i_209_ = i_179_ * 64 / 64;
		for (int i_210_ = 0; i_210_ < 3; i_210_++) {
			for (int i_211_ = 0; i_211_ < 64; i_211_++) {
				int i_212_ = i_184_ + i_211_;
				int i_213_ = i_212_ & 0x3f;
				int i_214_ = i_211_ * i_180_ / 64;
				int i_215_ = (i_211_ + 1) * i_180_ / 64 - 1;
				if (i_215_ < i_214_)
					i_215_ = i_214_;
				for (int i_216_ = 0; i_216_ < 64; i_216_++) {
					int i_217_ = i_185_ + i_216_;
					boolean bool_218_ = bool;
					if (bool_186_ && !method8834(i_212_, i_217_))
						bool_218_ = false;
					int i_219_ = i_217_ & 0x3f;
					int i_220_ = i_216_ * i_180_ / 64;
					int i_221_ = (i_216_ + 1) * i_180_ / 64 - 1;
					if (i_221_ < i_220_)
						i_221_ = i_220_;
					HashMap hashmap = aHashMapArrayArrayArray7181[i_210_][i_208_][i_209_];
					if (hashmap != null) {
						Class527 class527 = ((Class527) hashmap.get(Integer.valueOf((i_213_ << 8) + i_219_)));
						if (class527 != null)
							method8837(anIntArray7188, i_214_, i_215_, i_220_, i_221_, i_180_, bool_218_, class527.anInt7093, class527.aShort7097, class527.aByte7095, class527.anIntArray7096, class527.aByteArray7094, false);
					}
				}
			}
			for (int i_222_ = 0; i_222_ < 64; i_222_++) {
				int i_223_ = i_184_ + i_222_;
				int i_224_ = i_223_ & 0x3f;
				for (int i_225_ = 0; i_225_ < 64; i_225_++) {
					int i_226_ = i_185_ + i_225_;
					if (!bool_186_ || method8834(i_223_, i_226_)) {
						int i_227_ = i_226_ & 0x3f;
						HashMap hashmap = (aHashMapArrayArrayArray7181[i_210_][i_208_][i_209_]);
						if (hashmap != null) {
							Class527 class527 = ((Class527) hashmap.get(Integer.valueOf((i_224_ << 8) + i_227_)));
							if (class527 != null)
								method8829(class178, anIntArray7188, i_180_, i_222_, i_225_, class527.anIntArray7096, class527.aByteArray7094);
						}
					}
				}
			}
		}
		if (bool_186_) {
			int i_228_ = 8;
			for (int i_229_ = 0; i_229_ < i_228_; i_229_++) {
				int i_230_ = i_184_ + i_229_ * 8;
				int i_231_ = i_229_ * i_180_ / i_228_;
				int i_232_ = (i_229_ + 1) * i_180_ / i_228_ - 1;
				for (int i_233_ = 0; i_233_ < i_228_; i_233_++) {
					int i_234_ = i_185_ + i_233_ * 8;
					if (!method8834(i_230_, i_234_)) {
						int i_235_ = i_233_ * i_180_ / i_228_;
						int i_236_ = (i_233_ + 1) * i_180_ / i_228_ - 1;
						if (i_180_ < 64)
							method8839(anIntArray7188, i_231_, i_232_, i_235_, i_236_, i_180_);
						else {
							aBoolArray7197[anInt7173] = method8834(i_230_, i_234_ + 8);
							aBoolArray7197[anInt7174] = method8834(i_230_ + 8, i_234_ + 8);
							aBoolArray7197[anInt7177] = method8834(i_230_ + 8, i_234_);
							aBoolArray7197[anInt7176] = method8834(i_230_ + 8, i_234_ - 8);
							aBoolArray7197[anInt7172] = method8834(i_230_, i_234_ - 8);
							aBoolArray7197[anInt7178] = method8834(i_230_ - 8, i_234_ - 8);
							aBoolArray7197[anInt7179] = method8834(i_230_ - 8, i_234_);
							aBoolArray7197[anInt7180] = method8834(i_230_ - 8, i_234_ + 8);
							method8838(anIntArray7188, i_231_, i_232_, i_235_, i_236_, i_180_);
						}
					}
				}
			}
		}
		aClass209_7184.method3770(class178.method3102(anIntArray7188, 0, i_180_, i_180_, i_180_, true), (long) i_181_);
	}

	Class534() throws Throwable {
		throw new Error();
	}

	static void method8828(Class178 class178, int[] is, int i, int i_237_, int i_238_, int i_239_, int i_240_, int i_241_) {
		Object object = anObjectArray7199[i_241_];
		if (object != null) {
			if (object instanceof Class523_Sub35) {
				Class523_Sub35 class523_sub35 = (Class523_Sub35) object;
				if (class523_sub35 != null)
					method8829(class178, is, i, i_237_, i_238_, class523_sub35.anIntArray10664, class523_sub35.aByteArray10665);
			} else {
				Integer integer = (Integer) object;
				anIntArray7152[0] = integer.intValue();
				aByteArray7153[0] = aByteArray7169[i_239_ + i_240_ * anInt7160];
				method8829(class178, is, i, i_237_, i_238_, anIntArray7152, aByteArray7153);
			}
		}
	}

	static void method8829(Class178 class178, int[] is, int i, int i_242_, int i_243_, int[] is_244_, byte[] is_245_) {
		if (is_244_ != null) {
			for (int i_246_ = 0; i_246_ < is_244_.length; i_246_++) {
				Class602 class602 = (Class602) aClass53_Sub18_7190.getDefinition(is_244_[i_246_], (byte) -3);
				int i_247_ = class602.anInt7890 * 573415481;
				if (i_247_ != -1) {
					Class46 class46 = ((Class46) aClass53_Sub14_7185.getDefinition(i_247_, (byte) 69));
					Class148 class148 = class46.method1240(class178, (class602.aBool7891 ? is_245_[i_246_] >> 6 & 0x3 : 0), (class602.aBool7893 ? class602.aBool7908 : false), (byte) 64);
					int[] is_248_ = class46.method1238(class178, (class602.aBool7891 ? is_245_[i_246_] >> 6 & 0x3 : 0), (class602.aBool7893 ? class602.aBool7908 : false), (short) 32267);
					if (class148 != null) {
						int i_249_ = class148.method38();
						int i_250_ = class148.method2429();
						int i_251_ = i * i_249_ / 64 >> 2;
						int i_252_ = i * i_250_ / 64 >> 2;
						if (class46.aBool670) {
							int i_253_ = class602.anInt7871 * -1994552549;
							int i_254_ = class602.anInt7872 * -1564896481;
							if ((is_245_[i_246_] >> 6 & 0x1) == 1) {
								int i_255_ = i_253_;
								i_253_ = i_254_;
								i_254_ = i_255_;
							}
							i_251_ = i_253_ * i / 64;
							i_252_ = i_254_ * i / 64;
						}
						if (i_251_ != 0 && i_252_ != 0) {
							int i_256_ = i_242_ * i / 64;
							int i_257_ = (64 - i_243_) * i / 64 - i_252_ + 1;
							for (int i_258_ = 0; i_258_ < i_251_; i_258_++) {
								int i_259_ = i_258_ + i_256_;
								if (i_259_ >= 0) {
									if (i_259_ >= i)
										break;
									for (int i_260_ = 0; i_260_ < i_252_; i_260_++) {
										int i_261_ = i_260_ + i_257_;
										if (i_261_ >= 0) {
											if (i_261_ >= i)
												break;
											int i_262_ = (is_248_[(i_258_ * i_249_ / i_251_ + i_249_ * (i_260_ * i_250_ / i_252_))]);
											int i_263_ = i_262_ >> 24 & 0xff;
											if (i_263_ != 0)
												is[i_259_ + i * i_261_] = i_262_;
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

	static Class708 method8830(Class178 class178) {
		int i = anInt7198 - anInt7196;
		int i_264_ = anInt7195 - anInt7167;
		int i_265_ = (anInt7202 - anInt7200 << 16) / i;
		int i_266_ = (anInt7203 - anInt7201 << 16) / i_264_;
		return method8831(class178, i_265_, i_266_, 0, 0);
	}

	static Class708 method8831(Class178 class178, int i, int i_267_, int i_268_, int i_269_) {
		for (Class523_Sub32 class523_sub32 = (Class523_Sub32) aClass708_7194.method14240(1977975565); class523_sub32 != null; class523_sub32 = (Class523_Sub32) aClass708_7194.method14244((byte) -73))
			method8895(class178, class523_sub32, i, i_267_, i_268_, i_269_);
		return aClass708_7194;
	}

	static boolean method8832(Class523_Sub27_Sub17 class523_sub27_sub17) {
		if (class523_sub27_sub17 != null && class523_sub27_sub17 != aClass523_Sub27_Sub17_7144) {
			aClass523_Sub27_Sub17_7144 = class523_sub27_sub17;
			aBool7170 = (aClass523_Sub27_Sub17_7144.anInt11831 * -536403473 == aClass624_7158.anInt8118 * -1183714497);
			return true;
		}
		return false;
	}

	static void method8833(Class178 class178, boolean bool, boolean bool_270_, boolean bool_271_, boolean bool_272_) {
		int i = anInt7198 - anInt7196;
		int i_273_ = anInt7195 - anInt7167;
		int i_274_ = (anInt7202 - anInt7200 << 16) / i;
		int i_275_ = (anInt7203 - anInt7201 << 16) / i_273_;
		method8825(class178, bool, bool_270_, i_274_, i_275_, 0, 0, bool_271_, bool_272_);
	}

	static boolean method8834(int i, int i_276_) {
		int i_277_ = i >> 3;
		int i_278_ = i_276_ >> 3;
		if (i_277_ < 0 || i_278_ < 0 || i_277_ >= aBoolArrayArray7171.length || i_278_ >= aBoolArrayArray7171[i_277_].length)
			return false;
		return aBoolArrayArray7171[i_277_][i_278_];
	}

	static int method8835() {
		return (int) (64.0F * aFloat7155 / 2.0F);
	}

	static void method8836(int[] is, int i, int i_279_, int i_280_, int i_281_, int i_282_) {
		int i_283_ = i + (i_281_ - i_279_ - 1) * i_281_;
		for (int i_284_ = 0; i_284_ < i_280_; i_284_++)
			is[i_283_ + i_284_ * i_281_] = i_282_;
	}

	static void method8837(int[] is, int i, int i_285_, int i_286_, int i_287_, int i_288_, boolean bool, int i_289_, int i_290_, int i_291_, int[] is_292_, byte[] is_293_, boolean bool_294_) {
		if (bool_294_ || i_289_ != 0 || i_290_ > 0) {
			if (i_290_ == 0)
				method8911(is, i, i_285_, i_286_, i_287_, i_288_, i_288_, i_289_ | ~0xffffff);
			else {
				int i_295_ = i_291_ & 0x3f;
				if (i_295_ == 0 || anInt7151 == 0) {
					int i_296_ = anIntArray7162[i_290_];
					if (bool_294_ || i_296_ != 0)
						method8911(is, i, i_285_, i_286_, i_287_, i_288_, i_288_, i_296_ | ~0xffffff);
				} else {
					int i_297_ = bool_294_ ? 0 : 1;
					int i_298_ = Class328.method5786(i_291_ >> 6 & 0x3, i_295_, -2142369650);
					i_295_ = Class485.method7937(i_295_, 2630023);
					method8884(is, i, i_285_, i_286_, i_287_, i_288_, i_288_, i_289_, anIntArray7162[i_290_], aByteArrayArrayArray7137[i_295_ - 1][i_298_], anInt7151, i_297_);
				}
			}
		}
		if (bool && is_292_ != null) {
			int i_299_ = i_285_ - i + 1;
			int i_300_ = i_287_ - i_286_ + 1;
			for (int i_301_ = 0; i_301_ < is_292_.length; i_301_++) {
				int i_302_ = is_293_[i_301_] & 0x3f;
				if (i_302_ == Class607.aClass607_7974.anInt7982 * 1923531495 || i_302_ == Class607.aClass607_7965.anInt7982 * 1923531495 || i_302_ == Class607.aClass607_7966.anInt7982 * 1923531495 || (i_302_ == Class607.aClass607_7971.anInt7982 * 1923531495)) {
					Class602 class602 = ((Class602) aClass53_Sub18_7190.getDefinition(is_292_[i_301_], (byte) -65));
					if (class602.anInt7890 * 573415481 == -1) {
						int i_303_ = -3355444;
						if (class602.anInt7874 * -344567467 == 1)
							i_303_ = -3407872;
						int i_304_ = is_293_[i_301_] >> 6 & 0x3;
						if (i_302_ == (Class607.aClass607_7974.anInt7982 * 1923531495)) {
							if (i_304_ == 0)
								method8844(is, i, i_287_, i_300_, i_288_, i_303_);
							else if (i_304_ == 1)
								method8843(is, i, i_287_, i_299_, i_288_, i_303_);
							else if (i_304_ == 2)
								method8844(is, i_285_, i_287_, i_300_, i_288_, i_303_);
							else
								method8843(is, i, i_286_, i_299_, i_288_, i_303_);
						} else if (i_302_ == (Class607.aClass607_7965.anInt7982 * 1923531495)) {
							if (i_304_ == 0) {
								method8844(is, i, i_287_, i_300_, i_288_, -1);
								method8843(is, i, i_287_, i_299_, i_288_, i_303_);
							} else if (i_304_ == 1) {
								method8844(is, i_285_, i_287_, i_300_, i_288_, -1);
								method8843(is, i, i_287_, i_299_, i_288_, i_303_);
							} else if (i_304_ == 2) {
								method8844(is, i_285_, i_287_, i_300_, i_288_, -1);
								method8843(is, i, i_286_, i_299_, i_288_, i_303_);
							} else {
								method8844(is, i, i_287_, i_300_, i_288_, -1);
								method8843(is, i, i_286_, i_299_, i_288_, i_303_);
							}
						} else if (i_302_ == (Class607.aClass607_7966.anInt7982 * 1923531495)) {
							if (i_304_ == 0)
								method8843(is, i, i_287_, 1, i_288_, i_303_);
							else if (i_304_ == 1)
								method8843(is, i_285_, i_287_, 1, i_288_, i_303_);
							else if (i_304_ == 2)
								method8843(is, i_285_, i_286_, 1, i_288_, i_303_);
							else
								method8843(is, i, i_286_, 1, i_288_, i_303_);
						} else if (i_302_ == (Class607.aClass607_7971.anInt7982 * 1923531495)) {
							if (i_304_ == 0 || i_304_ == 2) {
								for (int i_305_ = 0; i_305_ < i_300_; i_305_++)
									method8843(is, i + i_305_, i_286_ + i_305_, 1, i_288_, i_303_);
							} else {
								for (int i_306_ = 0; i_306_ < i_300_; i_306_++)
									method8843(is, i + i_306_, i_287_ - i_306_, 1, i_288_, i_303_);
							}
						}
					}
				}
			}
		}
	}

	static void method8838(int[] is, int i, int i_307_, int i_308_, int i_309_, int i_310_) {
		int i_311_ = aClass624_7158.anInt8130 * 1433185939 >> 24 & 0xff;
		int i_312_ = 255 - i_311_;
		if ((!aBoolArray7197[anInt7173] || !aBoolArray7197[anInt7177] && !aBoolArray7197[anInt7179]) && (!aBoolArray7197[anInt7172] || !aBoolArray7197[anInt7177] && !aBoolArray7197[anInt7179])) {
			method8840(is, i, i_307_, i_308_, i_309_, i_310_, i_311_, i_312_, true, true, true, true);
			if (aBoolArray7197[anInt7174]) {
				is[(i_310_ - i_309_ - 1) * i_310_ + i_307_] = aClass624_7158.anInt8125 * -443813705;
				is[(i_310_ - i_309_) * i_310_ + i_307_] = aClass624_7158.anInt8125 * -443813705;
				is[(i_310_ - i_309_ - 1) * i_310_ + i_307_ - 1] = aClass624_7158.anInt8125 * -443813705;
			}
			if (aBoolArray7197[anInt7176]) {
				is[(i_310_ - i_308_ - 1) * i_310_ + i_307_] = aClass624_7158.anInt8125 * -443813705;
				is[(i_310_ - i_308_ - 2) * i_310_ + i_307_] = aClass624_7158.anInt8125 * -443813705;
				is[(i_310_ - i_308_ - 1) * i_310_ + i_307_ - 1] = aClass624_7158.anInt8125 * -443813705;
			}
			if (aBoolArray7197[anInt7178]) {
				is[(i_310_ - i_308_ - 1) * i_310_ + i] = aClass624_7158.anInt8125 * -443813705;
				is[(i_310_ - i_308_ - 2) * i_310_ + i] = aClass624_7158.anInt8125 * -443813705;
				is[(i_310_ - i_308_ - 1) * i_310_ + i + 1] = aClass624_7158.anInt8125 * -443813705;
			}
			if (aBoolArray7197[anInt7180]) {
				is[(i_310_ - i_309_ - 1) * i_310_ + i] = aClass624_7158.anInt8125 * -443813705;
				is[(i_310_ - i_309_) * i_310_ + i] = aClass624_7158.anInt8125 * -443813705;
				is[(i_310_ - i_309_ - 1) * i_310_ + i + 1] = aClass624_7158.anInt8125 * -443813705;
			}
		} else {
			if (aBoolArray7197[anInt7173] && aBoolArray7197[anInt7177])
				method8841(is, i_307_ - aClass624_7158.anInt8127 * 869969279 + 1, i_309_ - aClass624_7158.anInt8127 * 869969279 + 1, i_310_, i_311_, i_312_, anInt7174);
			else {
				method8840(is, i_307_ - aClass624_7158.anInt8127 * 869969279 + 1, i_307_, i_309_ - aClass624_7158.anInt8127 * 869969279 + 1, i_309_, i_310_, i_311_, i_312_, true, true, false, false);
				if (aBoolArray7197[anInt7174]) {
					is[(i_310_ - i_309_ - 1) * i_310_ + i_307_] = aClass624_7158.anInt8125 * -443813705;
					is[(i_310_ - i_309_) * i_310_ + i_307_] = aClass624_7158.anInt8125 * -443813705;
					is[(i_310_ - i_309_ - 1) * i_310_ + i_307_ - 1] = aClass624_7158.anInt8125 * -443813705;
				}
			}
			if (aBoolArray7197[anInt7172] && aBoolArray7197[anInt7177])
				method8841(is, i_307_ - aClass624_7158.anInt8127 * 869969279 + 1, i_308_, i_310_, i_311_, i_312_, anInt7176);
			else {
				method8840(is, i_307_ - aClass624_7158.anInt8127 * 869969279 + 1, i_307_, i_308_, i_308_ + aClass624_7158.anInt8127 * 869969279 - 1, i_310_, i_311_, i_312_, false, true, true, false);
				if (aBoolArray7197[anInt7176]) {
					is[(i_310_ - i_308_ - 1) * i_310_ + i_307_] = aClass624_7158.anInt8125 * -443813705;
					is[(i_310_ - i_308_ - 2) * i_310_ + i_307_] = aClass624_7158.anInt8125 * -443813705;
					is[(i_310_ - i_308_ - 1) * i_310_ + i_307_ - 1] = aClass624_7158.anInt8125 * -443813705;
				}
			}
			if (aBoolArray7197[anInt7172] && aBoolArray7197[anInt7179])
				method8841(is, i, i_308_, i_310_, i_311_, i_312_, anInt7178);
			else {
				method8840(is, i, i + aClass624_7158.anInt8127 * 869969279 - 1, i_308_, i_308_ + aClass624_7158.anInt8127 * 869969279 - 1, i_310_, i_311_, i_312_, false, false, true, true);
				if (aBoolArray7197[anInt7178]) {
					is[(i_310_ - i_308_ - 1) * i_310_ + i] = aClass624_7158.anInt8125 * -443813705;
					is[(i_310_ - i_308_ - 2) * i_310_ + i] = aClass624_7158.anInt8125 * -443813705;
					is[(i_310_ - i_308_ - 1) * i_310_ + i + 1] = aClass624_7158.anInt8125 * -443813705;
				}
			}
			if (aBoolArray7197[anInt7173] && aBoolArray7197[anInt7179])
				method8841(is, i, i_309_ - aClass624_7158.anInt8127 * 869969279 + 1, i_310_, i_311_, i_312_, anInt7180);
			else {
				method8840(is, i, i + aClass624_7158.anInt8127 * 869969279 - 1, i_309_ - aClass624_7158.anInt8127 * 869969279 + 1, i_309_, i_310_, i_311_, i_312_, true, false, false, true);
				if (aBoolArray7197[anInt7180]) {
					is[(i_310_ - i_309_ - 1) * i_310_ + i] = aClass624_7158.anInt8125 * -443813705;
					is[(i_310_ - i_309_) * i_310_ + i] = aClass624_7158.anInt8125 * -443813705;
					is[(i_310_ - i_309_ - 1) * i_310_ + i + 1] = aClass624_7158.anInt8125 * -443813705;
				}
			}
			if (i + aClass624_7158.anInt8127 * 869969279 < i_307_ - aClass624_7158.anInt8127 * 869969279)
				method8840(is, i + aClass624_7158.anInt8127 * 869969279, i_307_ - aClass624_7158.anInt8127 * 869969279, i_308_, i_309_, i_310_, i_311_, i_312_, true, false, true, false);
			if (i_308_ + aClass624_7158.anInt8127 * 869969279 + 1 < i_309_ - aClass624_7158.anInt8127 * 869969279 - 1) {
				method8840(is, i, i + aClass624_7158.anInt8127 * 869969279 - 1, i_308_ + aClass624_7158.anInt8127 * 869969279, i_309_ - aClass624_7158.anInt8127 * 869969279, i_310_, i_311_, i_312_, false, false, false, true);
				method8840(is, i_307_ - aClass624_7158.anInt8127 * 869969279 + 1, i_307_, i_308_ + aClass624_7158.anInt8127 * 869969279, i_309_ - aClass624_7158.anInt8127 * 869969279, i_310_, i_311_, i_312_, false, true, false, false);
			}
		}
	}

	static void method8839(int[] is, int i, int i_313_, int i_314_, int i_315_, int i_316_) {
		int i_317_ = aClass624_7158.anInt8130 * 1433185939 >> 24 & 0xff;
		int i_318_ = 255 - i_317_;
		for (int i_319_ = i; i_319_ <= i_313_; i_319_++) {
			for (int i_320_ = i_314_; i_320_ <= i_315_; i_320_++) {
				int i_321_ = is[(i_316_ - i_320_ - 1) * i_316_ + i_319_];
				if (i_321_ != anInt7204) {
					anInt7204 = i_321_;
					anInt7205 = (~0xffffff | ((((aClass624_7158.anInt8130 * 1433185939 & 0xff00ff) * i_317_ + (i_321_ & 0xff00ff) * i_318_) & ~0xff00ff) + (((aClass624_7158.anInt8130 * 1433185939 & 0xff00) * i_317_ + (i_321_ & 0xff00) * i_318_) & 0xff0000)) >> 8);
				}
				is[(i_316_ - i_320_ - 1) * i_316_ + i_319_] = anInt7205;
			}
		}
	}

	static void method8840(int[] is, int i, int i_322_, int i_323_, int i_324_, int i_325_, int i_326_, int i_327_, boolean bool, boolean bool_328_, boolean bool_329_, boolean bool_330_) {
		for (int i_331_ = i; i_331_ <= i_322_; i_331_++) {
			boolean bool_332_ = bool_328_ ? (aBoolArray7197[anInt7177] && i_322_ - i_331_ < (aClass624_7158.anInt8126 * 1002542153)) : false;
			boolean bool_333_ = (bool_330_ ? (aBoolArray7197[anInt7179] && i_331_ - i < aClass624_7158.anInt8126 * 1002542153) : false);
			for (int i_334_ = i_323_; i_334_ <= i_324_; i_334_++) {
				if (bool_332_ || bool_333_)
					is[(i_325_ - i_334_ - 1) * i_325_ + i_331_] = aClass624_7158.anInt8125 * -443813705;
				else {
					boolean bool_335_ = (bool ? (aBoolArray7197[anInt7173] && (i_324_ - i_334_ < aClass624_7158.anInt8126 * 1002542153)) : false);
					boolean bool_336_ = (bool_329_ ? (aBoolArray7197[anInt7172] && (i_334_ - i_323_ < aClass624_7158.anInt8126 * 1002542153)) : false);
					if (bool_335_ || bool_336_)
						is[(i_325_ - i_334_ - 1) * i_325_ + i_331_] = aClass624_7158.anInt8125 * -443813705;
					else {
						int i_337_ = is[(i_325_ - i_334_ - 1) * i_325_ + i_331_];
						if (i_337_ != anInt7204) {
							anInt7204 = i_337_;
							anInt7205 = (~0xffffff | ((((aClass624_7158.anInt8130 * 1433185939 & 0xff00ff) * i_326_ + (i_337_ & 0xff00ff) * i_327_) & ~0xff00ff) + ((((aClass624_7158.anInt8130 * 1433185939) & 0xff00) * i_326_ + (i_337_ & 0xff00) * i_327_) & 0xff0000)) >> 8);
						}
						is[(i_325_ - i_334_ - 1) * i_325_ + i_331_] = anInt7205;
					}
				}
			}
		}
	}

	static void method8841(int[] is, int i, int i_338_, int i_339_, int i_340_, int i_341_, int i_342_) {
		for (int i_343_ = 0; i_343_ < aClass624_7158.anInt8127 * 869969279; i_343_++) {
			int i_344_ = i_343_;
			if (i_342_ == anInt7174 || i_342_ == anInt7176)
				i_344_ = aClass624_7158.anInt8127 * 869969279 - i_343_ - 1;
			for (int i_345_ = 0; i_345_ < aClass624_7158.anInt8127 * 869969279; i_345_++) {
				int i_346_ = i_345_;
				if (i_342_ == anInt7176 || i_342_ == anInt7178)
					i_346_ = aClass624_7158.anInt8127 * 869969279 - i_345_ - 1;
				int i_347_ = anIntArrayArray7148[i_344_][i_346_];
				if (i_347_ != 0) {
					if (i_347_ == 1) {
						int i_348_ = is[((i_339_ - i_338_ - i_345_ - 1) * i_339_ + i + i_343_)];
						if (i_348_ != anInt7204) {
							anInt7204 = i_348_;
							anInt7205 = (~0xffffff | ((((aClass624_7158.anInt8130 * 1433185939 & 0xff00ff) * i_340_ + (i_348_ & 0xff00ff) * i_341_) & ~0xff00ff) + ((((aClass624_7158.anInt8130 * 1433185939) & 0xff00) * i_340_ + (i_348_ & 0xff00) * i_341_) & 0xff0000)) >> 8);
						}
						is[((i_339_ - i_338_ - i_345_ - 1) * i_339_ + i + i_343_)] = anInt7205;
					} else if (i_347_ == 2)
						is[((i_339_ - i_338_ - i_345_ - 1) * i_339_ + i + i_343_)] = aClass624_7158.anInt8125 * -443813705;
				}
			}
		}
	}

	static void method8842(int[] is, int i, int i_349_, int i_350_, int i_351_, int i_352_) {
		int i_353_ = i + (i_351_ - i_349_ - 1) * i_351_;
		for (int i_354_ = 0; i_354_ < i_350_; i_354_++)
			is[i_353_ + i_354_ * i_351_] = i_352_;
	}

	static void method8843(int[] is, int i, int i_355_, int i_356_, int i_357_, int i_358_) {
		int i_359_ = i + (i_357_ - i_355_ - 1) * i_357_;
		for (int i_360_ = 0; i_360_ < i_356_; i_360_++)
			is[i_359_ + i_360_] = i_358_;
	}

	static void method8844(int[] is, int i, int i_361_, int i_362_, int i_363_, int i_364_) {
		int i_365_ = i + (i_363_ - i_361_ - 1) * i_363_;
		for (int i_366_ = 0; i_366_ < i_362_; i_366_++)
			is[i_365_ + i_366_ * i_363_] = i_364_;
	}

	static {
		anInterface12_7140 = null;
		aClass14_7147 = new Class14(16);
		anInt7161 = (int) (Math.random() * 11.0) - 5;
		anInt7149 = (int) (Math.random() * 17.0) - 8;
		anIntArray7152 = new int[1];
		aByteArray7153 = new byte[1];
		aClass708_7194 = new Class708();
		aBool7170 = true;
		anIntArrayArray7148 = new int[][] { { 2, 2, 0, 0, 0, 0 }, { 2, 2, 2, 0, 0, 0 }, { 1, 2, 2, 2, 0, 0 }, { 1, 1, 1, 2, 2, 0 }, { 1, 1, 1, 2, 2, 2 }, { 1, 1, 1, 1, 2, 2 } };
		anInt7173 = Class682.aClass682_8654.method82();
		anInt7174 = Class682.aClass682_8650.method82();
		anInt7177 = Class682.aClass682_8659.method82();
		anInt7176 = Class682.aClass682_8653.method82();
		anInt7172 = Class682.aClass682_8651.method82();
		anInt7178 = Class682.aClass682_8655.method82();
		anInt7179 = Class682.aClass682_8656.method82();
		anInt7180 = Class682.aClass682_8657.method82();
		aClass209_7136 = new Class209(4096, 256);
		aClass209_7183 = new Class209(4096, 1024);
		aClass209_7184 = aClass209_7136;
		anArrayList7186 = new ArrayList();
		anInt7187 = 262144;
		anInt7189 = 0;
		anInt7175 = 5;
		aClass523_Sub34_7191 = null;
		aClass523_Sub34_7192 = null;
		aBool7193 = true;
		new Date();
		anInt7204 = 0;
		anInt7205 = 0;
		aBoolArray7197 = new boolean[8];
	}

	public static void method8845(Class472 class472, Class472 class472_367_, Class53_Sub12 class53_sub12, Class53_Sub5 class53_sub5, Class53_Sub18 class53_sub18, Class53_Sub1 class53_sub1, Class53_Sub14 class53_sub14, Interface19 interface19, Interface17 interface17) {
		aClass472_7145 = class472;
		aClass472_7146 = class472_367_;
		anInterface12_7182 = class53_sub12;
		anInterface12_7140 = class53_sub5;
		aClass53_Sub18_7190 = class53_sub18;
		aClass53_Sub1_7206 = class53_sub1;
		aClass53_Sub14_7185 = class53_sub14;
		anInterface19_7142 = interface19;
		anInterface17_7141 = interface17;
		aClass14_7147.method733(1292062961);
		int[] is = aClass472_7145.method7656(Class643.aClass643_8340.method82(), 991305160);
		if (is != null) {
			for (int i = 0; i < is.length; i++) {
				Class523_Sub27_Sub17 class523_sub27_sub17 = Class275.method5042(aClass472_7145, is[i], (byte) 33);
				aClass14_7147.method738(class523_sub27_sub17, (long) (class523_sub27_sub17.anInt11831 * -536403473));
			}
		}
		Class226.method4166(true, false, 240723773);
	}

	public static void method8846(Class472 class472, Class472 class472_368_, Class53_Sub12 class53_sub12, Class53_Sub5 class53_sub5, Class53_Sub18 class53_sub18, Class53_Sub1 class53_sub1, Class53_Sub14 class53_sub14, Interface19 interface19, Interface17 interface17) {
		aClass472_7145 = class472;
		aClass472_7146 = class472_368_;
		anInterface12_7182 = class53_sub12;
		anInterface12_7140 = class53_sub5;
		aClass53_Sub18_7190 = class53_sub18;
		aClass53_Sub1_7206 = class53_sub1;
		aClass53_Sub14_7185 = class53_sub14;
		anInterface19_7142 = interface19;
		anInterface17_7141 = interface17;
		aClass14_7147.method733(1681484861);
		int[] is = aClass472_7145.method7656(Class643.aClass643_8340.method82(), 1634692158);
		if (is != null) {
			for (int i = 0; i < is.length; i++) {
				Class523_Sub27_Sub17 class523_sub27_sub17 = Class275.method5042(aClass472_7145, is[i], (byte) 127);
				aClass14_7147.method738(class523_sub27_sub17, (long) (class523_sub27_sub17.anInt11831 * -536403473));
			}
		}
		Class226.method4166(true, false, 240723773);
	}

	public static void method8847(Class472 class472, Class472 class472_369_, Class53_Sub12 class53_sub12, Class53_Sub5 class53_sub5, Class53_Sub18 class53_sub18, Class53_Sub1 class53_sub1, Class53_Sub14 class53_sub14, Interface19 interface19, Interface17 interface17) {
		aClass472_7145 = class472;
		aClass472_7146 = class472_369_;
		anInterface12_7182 = class53_sub12;
		anInterface12_7140 = class53_sub5;
		aClass53_Sub18_7190 = class53_sub18;
		aClass53_Sub1_7206 = class53_sub1;
		aClass53_Sub14_7185 = class53_sub14;
		anInterface19_7142 = interface19;
		anInterface17_7141 = interface17;
		aClass14_7147.method733(-1192871209);
		int[] is = aClass472_7145.method7656(Class643.aClass643_8340.method82(), -1287861959);
		if (is != null) {
			for (int i = 0; i < is.length; i++) {
				Class523_Sub27_Sub17 class523_sub27_sub17 = Class275.method5042(aClass472_7145, is[i], (byte) 114);
				aClass14_7147.method738(class523_sub27_sub17, (long) (class523_sub27_sub17.anInt11831 * -536403473));
			}
		}
		Class226.method4166(true, false, 240723773);
	}

	public static void method8848(Class472 class472, Class472 class472_370_, Class53_Sub12 class53_sub12, Class53_Sub5 class53_sub5, Class53_Sub18 class53_sub18, Class53_Sub1 class53_sub1, Class53_Sub14 class53_sub14, Interface19 interface19, Interface17 interface17) {
		aClass472_7145 = class472;
		aClass472_7146 = class472_370_;
		anInterface12_7182 = class53_sub12;
		anInterface12_7140 = class53_sub5;
		aClass53_Sub18_7190 = class53_sub18;
		aClass53_Sub1_7206 = class53_sub1;
		aClass53_Sub14_7185 = class53_sub14;
		anInterface19_7142 = interface19;
		anInterface17_7141 = interface17;
		aClass14_7147.method733(745590085);
		int[] is = aClass472_7145.method7656(Class643.aClass643_8340.method82(), -1348209525);
		if (is != null) {
			for (int i = 0; i < is.length; i++) {
				Class523_Sub27_Sub17 class523_sub27_sub17 = Class275.method5042(aClass472_7145, is[i], (byte) 67);
				aClass14_7147.method738(class523_sub27_sub17, (long) (class523_sub27_sub17.anInt11831 * -536403473));
			}
		}
		Class226.method4166(true, false, 240723773);
	}

	public static void method8849(Class472 class472, Class472 class472_371_, Class53_Sub12 class53_sub12, Class53_Sub5 class53_sub5, Class53_Sub18 class53_sub18, Class53_Sub1 class53_sub1, Class53_Sub14 class53_sub14, Interface19 interface19, Interface17 interface17) {
		aClass472_7145 = class472;
		aClass472_7146 = class472_371_;
		anInterface12_7182 = class53_sub12;
		anInterface12_7140 = class53_sub5;
		aClass53_Sub18_7190 = class53_sub18;
		aClass53_Sub1_7206 = class53_sub1;
		aClass53_Sub14_7185 = class53_sub14;
		anInterface19_7142 = interface19;
		anInterface17_7141 = interface17;
		aClass14_7147.method733(2114306843);
		int[] is = aClass472_7145.method7656(Class643.aClass643_8340.method82(), -1921221409);
		if (is != null) {
			for (int i = 0; i < is.length; i++) {
				Class523_Sub27_Sub17 class523_sub27_sub17 = Class275.method5042(aClass472_7145, is[i], (byte) 8);
				aClass14_7147.method738(class523_sub27_sub17, (long) (class523_sub27_sub17.anInt11831 * -536403473));
			}
		}
		Class226.method4166(true, false, 240723773);
	}

	static boolean method8850(Class523_Sub27_Sub17 class523_sub27_sub17) {
		if (class523_sub27_sub17 != null && class523_sub27_sub17 != aClass523_Sub27_Sub17_7144) {
			aClass523_Sub27_Sub17_7144 = class523_sub27_sub17;
			aBool7170 = (aClass523_Sub27_Sub17_7144.anInt11831 * -536403473 == aClass624_7158.anInt8118 * -1183714497);
			return true;
		}
		return false;
	}

	static void method8851() {
		aShortArray7163 = new short[anInt7160 * anInt7138];
		aShortArray7166 = new short[anInt7160 * anInt7138];
		aByteArray7139 = new byte[anInt7160 * anInt7138];
		anObjectArray7199 = new Object[anInt7160 * anInt7138];
		aByteArray7169 = new byte[anInt7160 * anInt7138];
		aHashMapArrayArrayArray7181 = new HashMap[3][anInt7160 >> 6][anInt7138 >> 6];
		anIntArray7162 = new int[anInterface12_7182.method69(-1941367572) + 1];
		aBoolArrayArray7171 = new boolean[anInt7160 / 8][anInt7138 / 8];
	}

	static void method8852() {
		aShortArray7163 = new short[anInt7160 * anInt7138];
		aShortArray7166 = new short[anInt7160 * anInt7138];
		aByteArray7139 = new byte[anInt7160 * anInt7138];
		anObjectArray7199 = new Object[anInt7160 * anInt7138];
		aByteArray7169 = new byte[anInt7160 * anInt7138];
		aHashMapArrayArrayArray7181 = new HashMap[3][anInt7160 >> 6][anInt7138 >> 6];
		anIntArray7162 = new int[anInterface12_7182.method69(-1712498293) + 1];
		aBoolArrayArray7171 = new boolean[anInt7160 / 8][anInt7138 / 8];
	}

	static void method8853() {
		aShortArray7163 = null;
		aByteArray7164 = null;
		aShortArray7150 = null;
		aShortArray7166 = null;
		aByteArray7139 = null;
		anObjectArray7199 = null;
		aByteArray7169 = null;
		aHashMapArrayArrayArray7181 = null;
		anIntArray7162 = null;
		aBoolArrayArray7171 = null;
	}

	static void method8854(int[] is, int i, int i_372_, int i_373_, int i_374_, int i_375_) {
		int i_376_ = i + (i_374_ - i_372_ - 1) * i_374_;
		for (int i_377_ = 0; i_377_ < i_373_; i_377_++)
			is[i_376_ + i_377_] = i_375_;
	}

	static void method8855(int i) {
		Class523_Sub27_Sub17 class523_sub27_sub17 = (Class523_Sub27_Sub17) aClass14_7147.method741((long) i);
		if (class523_sub27_sub17 != null && class523_sub27_sub17 != aClass523_Sub27_Sub17_7144) {
			aClass523_Sub27_Sub17_7144 = class523_sub27_sub17;
			aBool7170 = (aClass523_Sub27_Sub17_7144.anInt11831 * -536403473 == aClass624_7158.anInt8118 * -1183714497);
		}
	}

	static void method8856(int i) {
		Class523_Sub27_Sub17 class523_sub27_sub17 = (Class523_Sub27_Sub17) aClass14_7147.method741((long) i);
		if (class523_sub27_sub17 != null && class523_sub27_sub17 != aClass523_Sub27_Sub17_7144) {
			aClass523_Sub27_Sub17_7144 = class523_sub27_sub17;
			aBool7170 = (aClass523_Sub27_Sub17_7144.anInt11831 * -536403473 == aClass624_7158.anInt8118 * -1183714497);
		}
	}

	static void method8857(int i) {
		Class523_Sub27_Sub17 class523_sub27_sub17 = (Class523_Sub27_Sub17) aClass14_7147.method741((long) i);
		if (class523_sub27_sub17 != null && class523_sub27_sub17 != aClass523_Sub27_Sub17_7144) {
			aClass523_Sub27_Sub17_7144 = class523_sub27_sub17;
			aBool7170 = (aClass523_Sub27_Sub17_7144.anInt11831 * -536403473 == aClass624_7158.anInt8118 * -1183714497);
		}
	}

	static void method8858() {
		for (int i = 0; i < anInt7160; i++) {
			for (int i_378_ = 0; i_378_ < anInt7138; i_378_++) {
				Object object = anObjectArray7199[i + i_378_ * anInt7160];
				if (object != null) {
					if (object instanceof Class523_Sub35) {
						Class523_Sub35 class523_sub35 = (Class523_Sub35) object;
						if (class523_sub35 != null) {
							for (int i_379_ = 0; (i_379_ < class523_sub35.anIntArray10664.length); i_379_++) {
								Class602 class602 = (Class602) (aClass53_Sub18_7190.getDefinition((class523_sub35.anIntArray10664[i_379_]), (byte) 45));
								int i_380_ = class602.anInt7906 * -1296551513;
								if (class602.anIntArray7912 != null) {
									class602 = (class602.method9893(anInterface19_7142, anInterface17_7141, 1556361670));
									if (class602 != null)
										i_380_ = class602.anInt7906 * -1296551513;
								}
								if (i_380_ != -1) {
									Class523_Sub32 class523_sub32 = new Class523_Sub32(i_380_);
									class523_sub32.anInt10580 = i * -79680441;
									class523_sub32.anInt10581 = i_378_ * -1573818035;
									aClass708_7194.method14236(class523_sub32, 510931282);
								}
							}
						}
					} else {
						Integer integer = (Integer) object;
						Class602 class602 = ((Class602) aClass53_Sub18_7190.getDefinition(integer.intValue(), (byte) 13));
						int i_381_ = class602.anInt7906 * -1296551513;
						if (class602.anIntArray7912 != null) {
							class602 = class602.method9893(anInterface19_7142, anInterface17_7141, 985183849);
							if (class602 != null)
								i_381_ = class602.anInt7906 * -1296551513;
						}
						if (i_381_ != -1) {
							Class523_Sub32 class523_sub32 = new Class523_Sub32(i_381_);
							class523_sub32.anInt10580 = i * -79680441;
							class523_sub32.anInt10581 = i_378_ * -1573818035;
							aClass708_7194.method14236(class523_sub32, -392435180);
						}
					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int i_382_ = 0; i_382_ < aHashMapArrayArrayArray7181[0].length; i_382_++) {
				for (int i_383_ = 0; i_383_ < aHashMapArrayArrayArray7181[0][0].length; i_383_++) {
					HashMap hashmap = aHashMapArrayArrayArray7181[i][i_382_][i_383_];
					if (hashmap != null) {
						Iterator iterator = hashmap.values().iterator();
						while (iterator.hasNext()) {
							Class527 class527 = (Class527) iterator.next();
							if (class527.anIntArray7096 != null) {
								for (int i_384_ = 0; i_384_ < class527.anIntArray7096.length; i_384_++) {
									Class602 class602 = ((Class602) (aClass53_Sub18_7190.getDefinition(class527.anIntArray7096[i_384_], (byte) 9)));
									int i_385_ = class602.anInt7906 * -1296551513;
									if (class602.anIntArray7912 != null) {
										class602 = (class602.method9893(anInterface19_7142, anInterface17_7141, -146977235));
										if (class602 != null)
											i_385_ = (class602.anInt7906 * -1296551513);
									}
									if (i_385_ != -1) {
										Class523_Sub32 class523_sub32 = new Class523_Sub32(i_385_);
										class523_sub32.anInt10580 = ((i_382_ + (anInt7168 >> 6)) * 64 + class527.aByte7092 - anInt7168) * -79680441;
										class523_sub32.anInt10581 = ((i_383_ + (anInt7159 >> 6)) * 64 + class527.aByte7091 - anInt7159) * -1573818035;
										aClass708_7194.method14236(class523_sub32, -939003143);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static void method8859() {
		aShortArray7163 = new short[anInt7160 * anInt7138];
		aShortArray7166 = new short[anInt7160 * anInt7138];
		aByteArray7139 = new byte[anInt7160 * anInt7138];
		anObjectArray7199 = new Object[anInt7160 * anInt7138];
		aByteArray7169 = new byte[anInt7160 * anInt7138];
		aHashMapArrayArrayArray7181 = new HashMap[3][anInt7160 >> 6][anInt7138 >> 6];
		anIntArray7162 = new int[anInterface12_7182.method69(-1224439240) + 1];
		aBoolArrayArray7171 = new boolean[anInt7160 / 8][anInt7138 / 8];
	}

	static boolean method8860(Class523_Sub27_Sub17 class523_sub27_sub17) {
		if (class523_sub27_sub17 != null && class523_sub27_sub17 != aClass523_Sub27_Sub17_7144) {
			aClass523_Sub27_Sub17_7144 = class523_sub27_sub17;
			aBool7170 = (aClass523_Sub27_Sub17_7144.anInt11831 * -536403473 == aClass624_7158.anInt8118 * -1183714497);
			return true;
		}
		return false;
	}

	public static Class523_Sub27_Sub17 method8861(int i, int i_386_) {
		for (Class523_Sub27_Sub17 class523_sub27_sub17 = (Class523_Sub27_Sub17) aClass14_7147.method735(-380907255); class523_sub27_sub17 != null; class523_sub27_sub17 = ((Class523_Sub27_Sub17) aClass14_7147.method749(-198717574))) {
			if (class523_sub27_sub17.aBool11826 && class523_sub27_sub17.method18191(i, i_386_, 632146607))
				return class523_sub27_sub17;
		}
		return null;
	}

	public static Class523_Sub27_Sub17 method8862(int i, int i_387_) {
		for (Class523_Sub27_Sub17 class523_sub27_sub17 = (Class523_Sub27_Sub17) aClass14_7147.method735(-380907255); class523_sub27_sub17 != null; class523_sub27_sub17 = ((Class523_Sub27_Sub17) aClass14_7147.method749(-1478161315))) {
			if (class523_sub27_sub17.aBool11826 && class523_sub27_sub17.method18191(i, i_387_, 632146607))
				return class523_sub27_sub17;
		}
		return null;
	}

	public static Class523_Sub27_Sub17 method8863(int i, int i_388_) {
		for (Class523_Sub27_Sub17 class523_sub27_sub17 = (Class523_Sub27_Sub17) aClass14_7147.method735(-380907255); class523_sub27_sub17 != null; class523_sub27_sub17 = (Class523_Sub27_Sub17) aClass14_7147.method749(773138774)) {
			if (class523_sub27_sub17.aBool11826 && class523_sub27_sub17.method18191(i, i_388_, 632146607))
				return class523_sub27_sub17;
		}
		return null;
	}

	public static Class523_Sub27_Sub17 method8864(int i) {
		return (Class523_Sub27_Sub17) aClass14_7147.method741((long) i);
	}

	static void method8865(int[] is, int i, int i_389_, int i_390_, int i_391_, int i_392_, int i_393_, int i_394_, boolean bool, boolean bool_395_, boolean bool_396_, boolean bool_397_) {
		for (int i_398_ = i; i_398_ <= i_389_; i_398_++) {
			boolean bool_399_ = bool_395_ ? (aBoolArray7197[anInt7177] && i_389_ - i_398_ < (aClass624_7158.anInt8126 * 1002542153)) : false;
			boolean bool_400_ = (bool_397_ ? (aBoolArray7197[anInt7179] && i_398_ - i < aClass624_7158.anInt8126 * 1002542153) : false);
			for (int i_401_ = i_390_; i_401_ <= i_391_; i_401_++) {
				if (bool_399_ || bool_400_)
					is[(i_392_ - i_401_ - 1) * i_392_ + i_398_] = aClass624_7158.anInt8125 * -443813705;
				else {
					boolean bool_402_ = (bool ? (aBoolArray7197[anInt7173] && (i_391_ - i_401_ < aClass624_7158.anInt8126 * 1002542153)) : false);
					boolean bool_403_ = (bool_396_ ? (aBoolArray7197[anInt7172] && (i_401_ - i_390_ < aClass624_7158.anInt8126 * 1002542153)) : false);
					if (bool_402_ || bool_403_)
						is[(i_392_ - i_401_ - 1) * i_392_ + i_398_] = aClass624_7158.anInt8125 * -443813705;
					else {
						int i_404_ = is[(i_392_ - i_401_ - 1) * i_392_ + i_398_];
						if (i_404_ != anInt7204) {
							anInt7204 = i_404_;
							anInt7205 = (~0xffffff | ((((aClass624_7158.anInt8130 * 1433185939 & 0xff00ff) * i_393_ + (i_404_ & 0xff00ff) * i_394_) & ~0xff00ff) + ((((aClass624_7158.anInt8130 * 1433185939) & 0xff00) * i_393_ + (i_404_ & 0xff00) * i_394_) & 0xff0000)) >> 8);
						}
						is[(i_392_ - i_401_ - 1) * i_392_ + i_398_] = anInt7205;
					}
				}
			}
		}
	}

	static int method8866(Class172 class172, int i, int i_405_, int i_406_) {
		return method8817(anInterface12_7182, class172, i, i_405_, i_406_);
	}

	static int method8867(Class172 class172, int i, int i_407_, int i_408_) {
		return method8817(anInterface12_7182, class172, i, i_407_, i_408_);
	}

	static int method8868(Class172 class172, int i, int i_409_, int i_410_) {
		return method8817(anInterface12_7182, class172, i, i_409_, i_410_);
	}

	static void method8869(Class178 class178, int i, int i_411_, int i_412_, int i_413_) {
		Class148 class148 = (Class148) aClass209_7184.method3767(-1L);
		if (class148 == null || class148.method2504() != i_412_) {
			int i_414_;
			if (aClass523_Sub27_Sub17_7144.anInt11834 * -761949709 != -1)
				i_414_ = ~0xffffff | (aClass523_Sub27_Sub17_7144.anInt11834 * -761949709);
			else
				i_414_ = -16777216;
			if (anIntArray7188 == null || anIntArray7188.length != i_412_ * i_412_)
				anIntArray7188 = new int[i_412_ * i_412_];
			Arrays.fill(anIntArray7188, i_414_);
			class148 = class178.method3102(anIntArray7188, 0, i_412_, i_412_, i_412_, true);
			aClass209_7184.method3770(class148, -1L);
		}
		aClass209_7184.method3770(class148, (long) i_413_);
	}

	static boolean method8870(Class178 class178, int i, int i_415_, boolean bool) {
		long l = Class248.method4401(1516375036);
		if (anInt7189 == 0) {
			if (aClass523_Sub27_Sub17_7144.anInt11831 * -536403473 == aClass624_7158.anInt8128 * 1217610883) {
				int i_416_ = aClass472_7146.method7646((aClass523_Sub27_Sub17_7144.aString11824), (byte) -34);
				if (aClass523_Sub34_7192 == null)
					aClass523_Sub34_7192 = new Class523_Sub34(aClass472_7146.method7688(i_416_, 0, -1300153861));
				aClass523_Sub34_7191 = aClass523_Sub34_7192;
				aClass523_Sub34_7191.anInt10661 = 0;
			} else {
				int i_417_ = aClass472_7146.method7646((aClass523_Sub27_Sub17_7144.aString11824), (byte) -19);
				aClass523_Sub34_7191 = (new Class523_Sub34(aClass472_7146.method7688(i_417_, 0, 1724924131)));
			}
			int i_418_ = aClass523_Sub34_7191.readUnsignedByte(2093631160);
			anIntArray7143 = new int[i_418_];
			for (int i_419_ = 0; i_419_ < i_418_; i_419_++)
				anIntArray7143[i_419_] = aClass523_Sub34_7191.readUnsignedSmart(368514876);
			int i_420_ = aClass523_Sub34_7191.readUnsignedByte(1120807159);
			anIntArray7157 = new int[i_420_];
			for (int i_421_ = 0; i_421_ < i_420_; i_421_++)
				anIntArray7157[i_421_] = aClass523_Sub34_7191.readUnsignedSmart(368514876);
		}
		while (aClass523_Sub34_7191 != null && (aClass523_Sub34_7191.anInt10661 * 2349011 < aClass523_Sub34_7191.aByteArray10658.length) && (!bool || (Class248.method4401(1516375036) < l + (long) anInt7175))) {
			if (aClass523_Sub34_7191.readUnsignedByte(-861259529) == 0) {
				int i_422_ = aClass523_Sub34_7191.readUnsignedByte(713233257);
				int i_423_ = aClass523_Sub34_7191.readUnsignedByte(-1516464959);
				for (int i_424_ = 0; i_424_ < 8; i_424_++) {
					int i_425_ = aClass523_Sub34_7191.readUnsignedByte(-497580511);
					int i_426_ = i_422_ * 8 + i_424_ - anInt7168 / 8;
					for (int i_427_ = 0; i_427_ < 8; i_427_++) {
						int i_428_ = i_423_ * 8 + i_427_ - anInt7159 / 8;
						aBoolArrayArray7171[i_426_][i_428_] = (i_425_ & 1 << i_427_) != 0;
					}
				}
				for (int i_429_ = 0; i_429_ < 64; i_429_++) {
					for (int i_430_ = 0; i_430_ < 64; i_430_++) {
						int i_431_ = i_422_ * 64 + i_429_ - anInt7168;
						int i_432_ = i_423_ * 64 + i_430_ - anInt7159;
						method8892(class178, aClass523_Sub34_7191, i_422_, i_423_, i_431_, i_432_, anIntArray7143, anIntArray7157);
					}
				}
			} else {
				int i_433_ = aClass523_Sub34_7191.readUnsignedByte(967734287);
				int i_434_ = aClass523_Sub34_7191.readUnsignedByte(-1929579233);
				int i_435_ = aClass523_Sub34_7191.readUnsignedByte(-1238473798);
				int i_436_ = aClass523_Sub34_7191.readUnsignedByte(1616483080);
				aBoolArrayArray7171[i_433_ * 8 + i_435_ - anInt7168 / 8][i_434_ * 8 + i_436_ - anInt7159 / 8] = aClass523_Sub34_7191.readUnsignedByte(-1168141244) != 0;
				for (int i_437_ = 0; i_437_ < 8; i_437_++) {
					for (int i_438_ = 0; i_438_ < 8; i_438_++) {
						int i_439_ = i_433_ * 64 + i_435_ * 8 + i_437_ - anInt7168;
						int i_440_ = i_434_ * 64 + i_436_ * 8 + i_438_ - anInt7159;
						method8892(class178, aClass523_Sub34_7191, i_433_, i_434_, i_439_, i_440_, anIntArray7143, anIntArray7157);
					}
				}
			}
		}
		if (aClass523_Sub34_7191 != null) {
			anInt7189 = aClass523_Sub34_7191.anInt10661 * 2349011;
			if (aClass523_Sub34_7191.anInt10661 * 2349011 < aClass523_Sub34_7191.aByteArray10658.length)
				return false;
		}
		aClass523_Sub34_7191 = null;
		anIntArray7157 = null;
		anIntArray7143 = null;
		if (aShortArray7163 != null) {
			aByteArray7164 = new byte[anInt7160 * anInt7138];
			aShortArray7150 = new short[anInt7160 * anInt7138];
			for (int i_441_ = 0; i_441_ < 3; i_441_++) {
				short[] is = new short[anInt7160 * anInt7138];
				for (int i_442_ = 0; i_442_ < aHashMapArrayArrayArray7181[i_441_].length; i_442_++) {
					for (int i_443_ = 0; (i_443_ < aHashMapArrayArrayArray7181[i_441_][0].length); i_443_++) {
						HashMap hashmap = (aHashMapArrayArrayArray7181[i_441_][i_442_][i_443_]);
						if (hashmap != null) {
							Iterator iterator = hashmap.values().iterator();
							while (iterator.hasNext()) {
								Class527 class527 = (Class527) iterator.next();
								is[(i_442_ * 64 + class527.aByte7092 + ((i_443_ * 64 + class527.aByte7091) * anInt7160))] = (short) class527.anInt7093;
							}
						}
					}
				}
				method8821(is, aByteArray7164, aShortArray7150, i, i_415_);
				for (int i_444_ = 0; i_444_ < aHashMapArrayArrayArray7181[i_441_].length; i_444_++) {
					for (int i_445_ = 0; (i_445_ < aHashMapArrayArrayArray7181[i_441_][0].length); i_445_++) {
						HashMap hashmap = (aHashMapArrayArrayArray7181[i_441_][i_444_][i_445_]);
						if (hashmap != null) {
							Iterator iterator = hashmap.values().iterator();
							while (iterator.hasNext()) {
								Class527 class527 = (Class527) iterator.next();
								int i_446_ = (i_444_ * 64 + class527.aByte7092 + ((i_445_ * 64 + class527.aByte7091) * anInt7160));
								class527.anInt7093 = ((aByteArray7164[i_446_] & 0xff) << 16 | aShortArray7150[i_446_] & 0xffff);
								if (class527.anInt7093 != 0)
									class527.anInt7093 |= ~0xffffff;
							}
						}
					}
				}
			}
			method8821(aShortArray7163, aByteArray7164, aShortArray7150, i, i_415_);
			aShortArray7163 = null;
		}
		if (!bool || Class248.method4401(1516375036) < l + (long) anInt7175) {
			method8820();
			return true;
		}
		return false;
	}

	static boolean method8871(Class178 class178, int i, int i_447_, boolean bool) {
		long l = Class248.method4401(1516375036);
		if (anInt7189 == 0) {
			if (aClass523_Sub27_Sub17_7144.anInt11831 * -536403473 == aClass624_7158.anInt8128 * 1217610883) {
				int i_448_ = aClass472_7146.method7646((aClass523_Sub27_Sub17_7144.aString11824), (byte) -24);
				if (aClass523_Sub34_7192 == null)
					aClass523_Sub34_7192 = (new Class523_Sub34(aClass472_7146.method7688(i_448_, 0, 1880971783)));
				aClass523_Sub34_7191 = aClass523_Sub34_7192;
				aClass523_Sub34_7191.anInt10661 = 0;
			} else {
				int i_449_ = aClass472_7146.method7646((aClass523_Sub27_Sub17_7144.aString11824), (byte) -35);
				aClass523_Sub34_7191 = (new Class523_Sub34(aClass472_7146.method7688(i_449_, 0, -1333264328)));
			}
			int i_450_ = aClass523_Sub34_7191.readUnsignedByte(-487623054);
			anIntArray7143 = new int[i_450_];
			for (int i_451_ = 0; i_451_ < i_450_; i_451_++)
				anIntArray7143[i_451_] = aClass523_Sub34_7191.readUnsignedSmart(368514876);
			int i_452_ = aClass523_Sub34_7191.readUnsignedByte(-868399182);
			anIntArray7157 = new int[i_452_];
			for (int i_453_ = 0; i_453_ < i_452_; i_453_++)
				anIntArray7157[i_453_] = aClass523_Sub34_7191.readUnsignedSmart(368514876);
		}
		while (aClass523_Sub34_7191 != null && (aClass523_Sub34_7191.anInt10661 * 2349011 < aClass523_Sub34_7191.aByteArray10658.length) && (!bool || (Class248.method4401(1516375036) < l + (long) anInt7175))) {
			if (aClass523_Sub34_7191.readUnsignedByte(-531708865) == 0) {
				int i_454_ = aClass523_Sub34_7191.readUnsignedByte(787827793);
				int i_455_ = aClass523_Sub34_7191.readUnsignedByte(2015244000);
				for (int i_456_ = 0; i_456_ < 8; i_456_++) {
					int i_457_ = aClass523_Sub34_7191.readUnsignedByte(1616729229);
					int i_458_ = i_454_ * 8 + i_456_ - anInt7168 / 8;
					for (int i_459_ = 0; i_459_ < 8; i_459_++) {
						int i_460_ = i_455_ * 8 + i_459_ - anInt7159 / 8;
						aBoolArrayArray7171[i_458_][i_460_] = (i_457_ & 1 << i_459_) != 0;
					}
				}
				for (int i_461_ = 0; i_461_ < 64; i_461_++) {
					for (int i_462_ = 0; i_462_ < 64; i_462_++) {
						int i_463_ = i_454_ * 64 + i_461_ - anInt7168;
						int i_464_ = i_455_ * 64 + i_462_ - anInt7159;
						method8892(class178, aClass523_Sub34_7191, i_454_, i_455_, i_463_, i_464_, anIntArray7143, anIntArray7157);
					}
				}
			} else {
				int i_465_ = aClass523_Sub34_7191.readUnsignedByte(1453988527);
				int i_466_ = aClass523_Sub34_7191.readUnsignedByte(-1055654976);
				int i_467_ = aClass523_Sub34_7191.readUnsignedByte(44021560);
				int i_468_ = aClass523_Sub34_7191.readUnsignedByte(-2093266945);
				aBoolArrayArray7171[i_465_ * 8 + i_467_ - anInt7168 / 8][i_466_ * 8 + i_468_ - anInt7159 / 8] = aClass523_Sub34_7191.readUnsignedByte(-23175795) != 0;
				for (int i_469_ = 0; i_469_ < 8; i_469_++) {
					for (int i_470_ = 0; i_470_ < 8; i_470_++) {
						int i_471_ = i_465_ * 64 + i_467_ * 8 + i_469_ - anInt7168;
						int i_472_ = i_466_ * 64 + i_468_ * 8 + i_470_ - anInt7159;
						method8892(class178, aClass523_Sub34_7191, i_465_, i_466_, i_471_, i_472_, anIntArray7143, anIntArray7157);
					}
				}
			}
		}
		if (aClass523_Sub34_7191 != null) {
			anInt7189 = aClass523_Sub34_7191.anInt10661 * 2349011;
			if (aClass523_Sub34_7191.anInt10661 * 2349011 < aClass523_Sub34_7191.aByteArray10658.length)
				return false;
		}
		aClass523_Sub34_7191 = null;
		anIntArray7157 = null;
		anIntArray7143 = null;
		if (aShortArray7163 != null) {
			aByteArray7164 = new byte[anInt7160 * anInt7138];
			aShortArray7150 = new short[anInt7160 * anInt7138];
			for (int i_473_ = 0; i_473_ < 3; i_473_++) {
				short[] is = new short[anInt7160 * anInt7138];
				for (int i_474_ = 0; i_474_ < aHashMapArrayArrayArray7181[i_473_].length; i_474_++) {
					for (int i_475_ = 0; (i_475_ < aHashMapArrayArrayArray7181[i_473_][0].length); i_475_++) {
						HashMap hashmap = (aHashMapArrayArrayArray7181[i_473_][i_474_][i_475_]);
						if (hashmap != null) {
							Iterator iterator = hashmap.values().iterator();
							while (iterator.hasNext()) {
								Class527 class527 = (Class527) iterator.next();
								is[(i_474_ * 64 + class527.aByte7092 + ((i_475_ * 64 + class527.aByte7091) * anInt7160))] = (short) class527.anInt7093;
							}
						}
					}
				}
				method8821(is, aByteArray7164, aShortArray7150, i, i_447_);
				for (int i_476_ = 0; i_476_ < aHashMapArrayArrayArray7181[i_473_].length; i_476_++) {
					for (int i_477_ = 0; (i_477_ < aHashMapArrayArrayArray7181[i_473_][0].length); i_477_++) {
						HashMap hashmap = (aHashMapArrayArrayArray7181[i_473_][i_476_][i_477_]);
						if (hashmap != null) {
							Iterator iterator = hashmap.values().iterator();
							while (iterator.hasNext()) {
								Class527 class527 = (Class527) iterator.next();
								int i_478_ = (i_476_ * 64 + class527.aByte7092 + ((i_477_ * 64 + class527.aByte7091) * anInt7160));
								class527.anInt7093 = ((aByteArray7164[i_478_] & 0xff) << 16 | aShortArray7150[i_478_] & 0xffff);
								if (class527.anInt7093 != 0)
									class527.anInt7093 |= ~0xffffff;
							}
						}
					}
				}
			}
			method8821(aShortArray7163, aByteArray7164, aShortArray7150, i, i_447_);
			aShortArray7163 = null;
		}
		if (!bool || Class248.method4401(1516375036) < l + (long) anInt7175) {
			method8820();
			return true;
		}
		return false;
	}

	public static Class523_Sub27_Sub17 method8872(int i) {
		return (Class523_Sub27_Sub17) aClass14_7147.method741((long) i);
	}

	static void method8873(Class178 class178, Class523_Sub34 class523_sub34, int i, int i_479_, int i_480_, int i_481_, int[] is, int[] is_482_) {
		int i_483_ = class523_sub34.readUnsignedByte(-1479371678);
		if ((i_483_ & 0x1) == 0) {
			boolean bool = (i_483_ & 0x2) == 0;
			int i_484_ = i_483_ >> 2 & 0x3f;
			if (i_484_ != 62) {
				if (i_484_ == 63)
					i_484_ = class523_sub34.readUnsignedSmart(368514876);
				else if (bool)
					i_484_ = is[i_484_];
				else
					i_484_ = is_482_[i_484_];
				if (bool) {
					aShortArray7163[i_480_ + i_481_ * anInt7160] = (short) i_484_;
					aShortArray7166[i_480_ + i_481_ * anInt7160] = (short) 0;
				} else {
					aShortArray7166[i_480_ + i_481_ * anInt7160] = (short) i_484_;
					aByteArray7139[i_480_ + i_481_ * anInt7160] = (byte) 0;
					aShortArray7163[i_480_ + i_481_ * anInt7160] = (short) class523_sub34.readUnsignedSmart(368514876);
				}
			}
		} else {
			int i_485_ = (i_483_ >> 1 & 0x3) + 1;
			boolean bool = (i_483_ & 0x8) != 0;
			boolean bool_486_ = (i_483_ & 0x10) != 0;
			for (int i_487_ = 0; i_487_ < i_485_; i_487_++) {
				int i_488_ = class523_sub34.readUnsignedSmart(368514876);
				int i_489_ = 0;
				int i_490_ = 0;
				if (bool) {
					i_489_ = class523_sub34.readUnsignedSmart(368514876);
					i_490_ = class523_sub34.readUnsignedByte(843913983);
				}
				int i_491_ = 0;
				if (bool_486_)
					i_491_ = class523_sub34.readUnsignedByte(-1717895826);
				if (i_487_ == 0) {
					aShortArray7163[i_480_ + i_481_ * anInt7160] = (short) i_488_;
					aShortArray7166[i_480_ + i_481_ * anInt7160] = (short) i_489_;
					aByteArray7139[i_480_ + i_481_ * anInt7160] = (byte) i_490_;
					if (i_491_ == 1) {
						anObjectArray7199[i_480_ + i_481_ * anInt7160] = new Integer(class523_sub34.readBigSmart((byte) -8));
						aByteArray7169[i_480_ + i_481_ * anInt7160] = class523_sub34.readByte((short) 782);
					} else if (i_491_ > 1) {
						int[] is_492_ = new int[i_491_];
						byte[] is_493_ = new byte[i_491_];
						for (int i_494_ = 0; i_494_ < i_491_; i_494_++) {
							is_492_[i_494_] = class523_sub34.readBigSmart((byte) -41);
							is_493_[i_494_] = class523_sub34.readByte((short) -604);
						}
						anObjectArray7199[i_480_ + i_481_ * anInt7160] = new Class523_Sub35(is_492_, is_493_);
					}
				} else {
					int[] is_495_ = null;
					byte[] is_496_ = null;
					if (i_491_ > 0) {
						is_495_ = new int[i_491_];
						is_496_ = new byte[i_491_];
						for (int i_497_ = 0; i_497_ < i_491_; i_497_++) {
							is_495_[i_497_] = class523_sub34.readBigSmart((byte) -119);
							is_496_[i_497_] = class523_sub34.readByte((short) -21255);
						}
					}
					if ((aHashMapArrayArrayArray7181[i_487_ - 1][i - (anInt7168 >> 6)][i_479_ - (anInt7159 >> 6)]) == null)
						aHashMapArrayArrayArray7181[i_487_ - 1][i - (anInt7168 >> 6)][i_479_ - (anInt7159 >> 6)] = new HashMap();
					int i_498_ = ((i_480_ & 0x3f) << 8) + (i_481_ & 0x3f);
					Class527 class527 = new Class527(i_480_ & 0x3f, i_481_ & 0x3f, i_488_, i_489_, i_490_, is_495_, is_496_);
					aHashMapArrayArrayArray7181[i_487_ - 1][i - (anInt7168 >> 6)][i_479_ - (anInt7159 >> 6)].put(Integer.valueOf(i_498_), class527);
				}
			}
		}
	}

	static void method8874(int[] is, int i, int i_499_, int i_500_, int i_501_, int i_502_) {
		int i_503_ = aClass624_7158.anInt8130 * 1433185939 >> 24 & 0xff;
		int i_504_ = 255 - i_503_;
		if ((!aBoolArray7197[anInt7173] || !aBoolArray7197[anInt7177] && !aBoolArray7197[anInt7179]) && (!aBoolArray7197[anInt7172] || !aBoolArray7197[anInt7177] && !aBoolArray7197[anInt7179])) {
			method8840(is, i, i_499_, i_500_, i_501_, i_502_, i_503_, i_504_, true, true, true, true);
			if (aBoolArray7197[anInt7174]) {
				is[(i_502_ - i_501_ - 1) * i_502_ + i_499_] = aClass624_7158.anInt8125 * -443813705;
				is[(i_502_ - i_501_) * i_502_ + i_499_] = aClass624_7158.anInt8125 * -443813705;
				is[(i_502_ - i_501_ - 1) * i_502_ + i_499_ - 1] = aClass624_7158.anInt8125 * -443813705;
			}
			if (aBoolArray7197[anInt7176]) {
				is[(i_502_ - i_500_ - 1) * i_502_ + i_499_] = aClass624_7158.anInt8125 * -443813705;
				is[(i_502_ - i_500_ - 2) * i_502_ + i_499_] = aClass624_7158.anInt8125 * -443813705;
				is[(i_502_ - i_500_ - 1) * i_502_ + i_499_ - 1] = aClass624_7158.anInt8125 * -443813705;
			}
			if (aBoolArray7197[anInt7178]) {
				is[(i_502_ - i_500_ - 1) * i_502_ + i] = aClass624_7158.anInt8125 * -443813705;
				is[(i_502_ - i_500_ - 2) * i_502_ + i] = aClass624_7158.anInt8125 * -443813705;
				is[(i_502_ - i_500_ - 1) * i_502_ + i + 1] = aClass624_7158.anInt8125 * -443813705;
			}
			if (aBoolArray7197[anInt7180]) {
				is[(i_502_ - i_501_ - 1) * i_502_ + i] = aClass624_7158.anInt8125 * -443813705;
				is[(i_502_ - i_501_) * i_502_ + i] = aClass624_7158.anInt8125 * -443813705;
				is[(i_502_ - i_501_ - 1) * i_502_ + i + 1] = aClass624_7158.anInt8125 * -443813705;
			}
		} else {
			if (aBoolArray7197[anInt7173] && aBoolArray7197[anInt7177])
				method8841(is, i_499_ - aClass624_7158.anInt8127 * 869969279 + 1, i_501_ - aClass624_7158.anInt8127 * 869969279 + 1, i_502_, i_503_, i_504_, anInt7174);
			else {
				method8840(is, i_499_ - aClass624_7158.anInt8127 * 869969279 + 1, i_499_, i_501_ - aClass624_7158.anInt8127 * 869969279 + 1, i_501_, i_502_, i_503_, i_504_, true, true, false, false);
				if (aBoolArray7197[anInt7174]) {
					is[(i_502_ - i_501_ - 1) * i_502_ + i_499_] = aClass624_7158.anInt8125 * -443813705;
					is[(i_502_ - i_501_) * i_502_ + i_499_] = aClass624_7158.anInt8125 * -443813705;
					is[(i_502_ - i_501_ - 1) * i_502_ + i_499_ - 1] = aClass624_7158.anInt8125 * -443813705;
				}
			}
			if (aBoolArray7197[anInt7172] && aBoolArray7197[anInt7177])
				method8841(is, i_499_ - aClass624_7158.anInt8127 * 869969279 + 1, i_500_, i_502_, i_503_, i_504_, anInt7176);
			else {
				method8840(is, i_499_ - aClass624_7158.anInt8127 * 869969279 + 1, i_499_, i_500_, i_500_ + aClass624_7158.anInt8127 * 869969279 - 1, i_502_, i_503_, i_504_, false, true, true, false);
				if (aBoolArray7197[anInt7176]) {
					is[(i_502_ - i_500_ - 1) * i_502_ + i_499_] = aClass624_7158.anInt8125 * -443813705;
					is[(i_502_ - i_500_ - 2) * i_502_ + i_499_] = aClass624_7158.anInt8125 * -443813705;
					is[(i_502_ - i_500_ - 1) * i_502_ + i_499_ - 1] = aClass624_7158.anInt8125 * -443813705;
				}
			}
			if (aBoolArray7197[anInt7172] && aBoolArray7197[anInt7179])
				method8841(is, i, i_500_, i_502_, i_503_, i_504_, anInt7178);
			else {
				method8840(is, i, i + aClass624_7158.anInt8127 * 869969279 - 1, i_500_, i_500_ + aClass624_7158.anInt8127 * 869969279 - 1, i_502_, i_503_, i_504_, false, false, true, true);
				if (aBoolArray7197[anInt7178]) {
					is[(i_502_ - i_500_ - 1) * i_502_ + i] = aClass624_7158.anInt8125 * -443813705;
					is[(i_502_ - i_500_ - 2) * i_502_ + i] = aClass624_7158.anInt8125 * -443813705;
					is[(i_502_ - i_500_ - 1) * i_502_ + i + 1] = aClass624_7158.anInt8125 * -443813705;
				}
			}
			if (aBoolArray7197[anInt7173] && aBoolArray7197[anInt7179])
				method8841(is, i, i_501_ - aClass624_7158.anInt8127 * 869969279 + 1, i_502_, i_503_, i_504_, anInt7180);
			else {
				method8840(is, i, i + aClass624_7158.anInt8127 * 869969279 - 1, i_501_ - aClass624_7158.anInt8127 * 869969279 + 1, i_501_, i_502_, i_503_, i_504_, true, false, false, true);
				if (aBoolArray7197[anInt7180]) {
					is[(i_502_ - i_501_ - 1) * i_502_ + i] = aClass624_7158.anInt8125 * -443813705;
					is[(i_502_ - i_501_) * i_502_ + i] = aClass624_7158.anInt8125 * -443813705;
					is[(i_502_ - i_501_ - 1) * i_502_ + i + 1] = aClass624_7158.anInt8125 * -443813705;
				}
			}
			if (i + aClass624_7158.anInt8127 * 869969279 < i_499_ - aClass624_7158.anInt8127 * 869969279)
				method8840(is, i + aClass624_7158.anInt8127 * 869969279, i_499_ - aClass624_7158.anInt8127 * 869969279, i_500_, i_501_, i_502_, i_503_, i_504_, true, false, true, false);
			if (i_500_ + aClass624_7158.anInt8127 * 869969279 + 1 < i_501_ - aClass624_7158.anInt8127 * 869969279 - 1) {
				method8840(is, i, i + aClass624_7158.anInt8127 * 869969279 - 1, i_500_ + aClass624_7158.anInt8127 * 869969279, i_501_ - aClass624_7158.anInt8127 * 869969279, i_502_, i_503_, i_504_, false, false, false, true);
				method8840(is, i_499_ - aClass624_7158.anInt8127 * 869969279 + 1, i_499_, i_500_ + aClass624_7158.anInt8127 * 869969279, i_501_ - aClass624_7158.anInt8127 * 869969279, i_502_, i_503_, i_504_, false, true, false, false);
			}
		}
	}

	static void method8875(Class178 class178, Class523_Sub32 class523_sub32, Class239 class239) {
		if (class239.anIntArray2445 != null) {
			int[] is = new int[class239.anIntArray2445.length];
			for (int i = 0; i < is.length / 2; i++) {
				int i_505_ = (class239.anIntArray2445[i * 2] + class523_sub32.anInt10580 * -1808941705);
				int i_506_ = (class239.anIntArray2445[i * 2 + 1] + class523_sub32.anInt10581 * -1727058043);
				is[i * 2] = anInt7200 + ((anInt7202 - anInt7200) * (i_505_ - anInt7196) / (anInt7198 - anInt7196));
				is[i * 2 + 1] = anInt7203 - ((anInt7203 - anInt7201) * (i_506_ - anInt7167) / (anInt7195 - anInt7167));
			}
			Class182.method3557(class178, is, class239.anInt2431 * -868784361);
			if (class239.anInt2432 * -873662967 > 0) {
				for (int i = 0; i < is.length / 2 - 1; i++) {
					int i_507_ = is[i * 2];
					int i_508_ = is[i * 2 + 1];
					int i_509_ = is[(i + 1) * 2];
					int i_510_ = is[(i + 1) * 2 + 1];
					if (i_509_ < i_507_) {
						int i_511_ = i_507_;
						int i_512_ = i_508_;
						i_507_ = i_509_;
						i_508_ = i_510_;
						i_509_ = i_511_;
						i_510_ = i_512_;
					} else if (i_509_ == i_507_ && i_510_ < i_508_) {
						int i_513_ = i_508_;
						i_508_ = i_510_;
						i_510_ = i_513_;
					}
					class178.method3107(i_507_, i_508_, i_509_, i_510_, (class239.anIntArray2439[class239.aByteArray2440[i] & 0xff]), 1, class239.anInt2432 * -873662967, class239.anInt2433 * 788353041, class239.anInt2434 * 1803020905);
				}
				int i = is[is.length - 2];
				int i_514_ = is[is.length - 1];
				int i_515_ = is[0];
				int i_516_ = is[1];
				if (i_515_ < i) {
					int i_517_ = i;
					int i_518_ = i_514_;
					i = i_515_;
					i_514_ = i_516_;
					i_515_ = i_517_;
					i_516_ = i_518_;
				} else if (i_515_ == i && i_516_ < i_514_) {
					int i_519_ = i_514_;
					i_514_ = i_516_;
					i_516_ = i_519_;
				}
				class178.method3107(i, i_514_, i_515_, i_516_, (class239.anIntArray2439[((class239.aByteArray2440[class239.aByteArray2440.length - 1]) & 0xff)]), 1, class239.anInt2432 * -873662967, class239.anInt2433 * 788353041, class239.anInt2434 * 1803020905);
			} else {
				for (int i = 0; i < is.length / 2 - 1; i++)
					class178.method3381(is[i * 2], is[i * 2 + 1], is[(i + 1) * 2], is[(i + 1) * 2 + 1], (class239.anIntArray2439[class239.aByteArray2440[i] & 0xff]), 1758626021);
				class178.method3381(is[is.length - 2], is[is.length - 1], is[0], is[1], (class239.anIntArray2439[((class239.aByteArray2440[class239.aByteArray2440.length - 1]) & 0xff)]), 1543842617);
			}
		}
	}

	static void method8876(short[] is, byte[] is_520_, short[] is_521_, int i, int i_522_) {
		int[] is_523_ = new int[anInt7138];
		int[] is_524_ = new int[anInt7138];
		int[] is_525_ = new int[anInt7138];
		int[] is_526_ = new int[anInt7138];
		int[] is_527_ = new int[anInt7138];
		for (int i_528_ = -5; i_528_ < anInt7160; i_528_++) {
			int i_529_ = i_528_ + 5;
			int i_530_ = i_528_ - 5;
			for (int i_531_ = 0; i_531_ < anInt7138; i_531_++) {
				if (i_529_ < anInt7160) {
					short i_532_ = is[i_529_ + i_531_ * anInt7160];
					if (i_532_ > 0) {
						Class7 class7 = (Class7) anInterface12_7140.getDefinition(i_532_ - 1, (byte) -1);
						is_523_[i_531_] += class7.anInt54 * -95297807;
						is_524_[i_531_] += class7.anInt55 * 1400193059;
						is_525_[i_531_] += class7.anInt50 * 271765687;
						is_526_[i_531_] += class7.anInt51 * 1218541115;
						is_527_[i_531_]++;
					}
				}
				if (i_530_ >= 0) {
					short i_533_ = is[i_530_ + i_531_ * anInt7160];
					if (i_533_ > 0) {
						Class7 class7 = (Class7) anInterface12_7140.getDefinition(i_533_ - 1, (byte) -9);
						is_523_[i_531_] -= class7.anInt54 * -95297807;
						is_524_[i_531_] -= class7.anInt55 * 1400193059;
						is_525_[i_531_] -= class7.anInt50 * 271765687;
						is_526_[i_531_] -= class7.anInt51 * 1218541115;
						is_527_[i_531_]--;
					}
				}
			}
			if (i_528_ >= 0) {
				int i_534_ = 0;
				int i_535_ = 0;
				int i_536_ = 0;
				int i_537_ = 0;
				int i_538_ = 0;
				for (int i_539_ = -5; i_539_ < anInt7138; i_539_++) {
					int i_540_ = i_539_ + 5;
					if (i_540_ < anInt7138) {
						i_534_ += is_523_[i_540_];
						i_535_ += is_524_[i_540_];
						i_536_ += is_525_[i_540_];
						i_537_ += is_526_[i_540_];
						i_538_ += is_527_[i_540_];
					}
					int i_541_ = i_539_ - 5;
					if (i_541_ >= 0) {
						i_534_ -= is_523_[i_541_];
						i_535_ -= is_524_[i_541_];
						i_536_ -= is_525_[i_541_];
						i_537_ -= is_526_[i_541_];
						i_538_ -= is_527_[i_541_];
					}
					if (i_539_ >= 0 && i_538_ > 0) {
						if (is[i_528_ + i_539_ * anInt7160] == 0) {
							int i_542_ = i_528_ + i_539_ * anInt7160;
							is_520_[i_542_] = (byte) 0;
							is_521_[i_542_] = (short) 0;
						} else {
							int i_543_ = (i_537_ == 0 ? 0 : Class645.method10562((i_534_ * 256 / i_537_), i_535_ / i_538_, i_536_ / i_538_, -1936463663));
							int i_544_ = (i_543_ & 0x7f) + i_522_;
							if (i_544_ < 0)
								i_544_ = 0;
							else if (i_544_ > 127)
								i_544_ = 127;
							int i_545_ = ((i_543_ + i & 0xfc00) + (i_543_ & 0x380) + i_544_);
							int i_546_ = i_528_ + i_539_ * anInt7160;
							int i_547_ = (Class638.anIntArray8306[(Class493.method8085(Class49.method1276(i_545_, 96, (byte) 0), -662840844)) & 0xffff]);
							is_520_[i_546_] = (byte) (i_547_ >> 16 & 0xff);
							is_521_[i_546_] = (short) (i_547_ & 0xffff);
						}
					}
				}
			}
		}
	}

	static void method8877() {
		int[] is = new int[3];
		for (int i = 0; i < aClass528_7156.anInt7099 * 1153952435; i++) {
			boolean bool = (aClass523_Sub27_Sub17_7144.method18193(aClass528_7156.anIntArray7098[i] >> 28 & 0x3, aClass528_7156.anIntArray7098[i] >> 14 & 0x3fff, aClass528_7156.anIntArray7098[i] & 0x3fff, is, (short) -16450));
			if (bool) {
				Class523_Sub32 class523_sub32 = new Class523_Sub32(aClass528_7156.anIntArray7100[i]);
				class523_sub32.anInt10580 = (is[1] - anInt7168) * -79680441;
				class523_sub32.anInt10581 = (is[2] - anInt7159) * -1573818035;
				aClass708_7194.method14236(class523_sub32, -850560042);
			}
		}
	}

	static void method8878() {
		int[] is = new int[3];
		for (int i = 0; i < aClass528_7156.anInt7099 * 1153952435; i++) {
			boolean bool = (aClass523_Sub27_Sub17_7144.method18193(aClass528_7156.anIntArray7098[i] >> 28 & 0x3, aClass528_7156.anIntArray7098[i] >> 14 & 0x3fff, aClass528_7156.anIntArray7098[i] & 0x3fff, is, (short) 16880));
			if (bool) {
				Class523_Sub32 class523_sub32 = new Class523_Sub32(aClass528_7156.anIntArray7100[i]);
				class523_sub32.anInt10580 = (is[1] - anInt7168) * -79680441;
				class523_sub32.anInt10581 = (is[2] - anInt7159) * -1573818035;
				aClass708_7194.method14236(class523_sub32, 886832233);
			}
		}
	}

	static void method8879(int[] is, int i, int i_548_, int i_549_, int i_550_, int i_551_, int i_552_) {
		for (int i_553_ = 0; i_553_ < aClass624_7158.anInt8127 * 869969279; i_553_++) {
			int i_554_ = i_553_;
			if (i_552_ == anInt7174 || i_552_ == anInt7176)
				i_554_ = aClass624_7158.anInt8127 * 869969279 - i_553_ - 1;
			for (int i_555_ = 0; i_555_ < aClass624_7158.anInt8127 * 869969279; i_555_++) {
				int i_556_ = i_555_;
				if (i_552_ == anInt7176 || i_552_ == anInt7178)
					i_556_ = aClass624_7158.anInt8127 * 869969279 - i_555_ - 1;
				int i_557_ = anIntArrayArray7148[i_554_][i_556_];
				if (i_557_ != 0) {
					if (i_557_ == 1) {
						int i_558_ = is[((i_549_ - i_548_ - i_555_ - 1) * i_549_ + i + i_553_)];
						if (i_558_ != anInt7204) {
							anInt7204 = i_558_;
							anInt7205 = (~0xffffff | ((((aClass624_7158.anInt8130 * 1433185939 & 0xff00ff) * i_550_ + (i_558_ & 0xff00ff) * i_551_) & ~0xff00ff) + ((((aClass624_7158.anInt8130 * 1433185939) & 0xff00) * i_550_ + (i_558_ & 0xff00) * i_551_) & 0xff0000)) >> 8);
						}
						is[((i_549_ - i_548_ - i_555_ - 1) * i_549_ + i + i_553_)] = anInt7205;
					} else if (i_557_ == 2)
						is[((i_549_ - i_548_ - i_555_ - 1) * i_549_ + i + i_553_)] = aClass624_7158.anInt8125 * -443813705;
				}
			}
		}
	}

	static void method8880(int i, int i_559_, int i_560_, int i_561_, int i_562_, int i_563_, int i_564_, int i_565_) {
		anInt7196 = i - anInt7168;
		anInt7195 = i_559_ - anInt7159;
		anInt7198 = i_560_ - anInt7168;
		anInt7167 = i_561_ - anInt7159;
		anInt7200 = i_562_;
		anInt7201 = i_563_;
		anInt7202 = i_564_;
		anInt7203 = i_565_;
	}

	static void method8881(Class178 class178, boolean bool, boolean bool_566_, boolean bool_567_, boolean bool_568_) {
		int i = anInt7198 - anInt7196;
		int i_569_ = anInt7195 - anInt7167;
		int i_570_ = (anInt7202 - anInt7200 << 16) / i;
		int i_571_ = (anInt7203 - anInt7201 << 16) / i_569_;
		method8825(class178, bool, bool_566_, i_570_, i_571_, 0, 0, bool_567_, bool_568_);
	}

	static void method8882(Class178 class178, boolean bool, boolean bool_572_, boolean bool_573_, boolean bool_574_) {
		int i = anInt7198 - anInt7196;
		int i_575_ = anInt7195 - anInt7167;
		int i_576_ = (anInt7202 - anInt7200 << 16) / i;
		int i_577_ = (anInt7203 - anInt7201 << 16) / i_575_;
		method8825(class178, bool, bool_572_, i_576_, i_577_, 0, 0, bool_573_, bool_574_);
	}

	static void method8883(int[] is, int i, int i_578_, int i_579_, int i_580_, int i_581_, int i_582_, int i_583_, boolean bool, boolean bool_584_, boolean bool_585_, boolean bool_586_) {
		for (int i_587_ = i; i_587_ <= i_578_; i_587_++) {
			boolean bool_588_ = bool_584_ ? (aBoolArray7197[anInt7177] && i_578_ - i_587_ < (aClass624_7158.anInt8126 * 1002542153)) : false;
			boolean bool_589_ = (bool_586_ ? (aBoolArray7197[anInt7179] && i_587_ - i < aClass624_7158.anInt8126 * 1002542153) : false);
			for (int i_590_ = i_579_; i_590_ <= i_580_; i_590_++) {
				if (bool_588_ || bool_589_)
					is[(i_581_ - i_590_ - 1) * i_581_ + i_587_] = aClass624_7158.anInt8125 * -443813705;
				else {
					boolean bool_591_ = (bool ? (aBoolArray7197[anInt7173] && (i_580_ - i_590_ < aClass624_7158.anInt8126 * 1002542153)) : false);
					boolean bool_592_ = (bool_585_ ? (aBoolArray7197[anInt7172] && (i_590_ - i_579_ < aClass624_7158.anInt8126 * 1002542153)) : false);
					if (bool_591_ || bool_592_)
						is[(i_581_ - i_590_ - 1) * i_581_ + i_587_] = aClass624_7158.anInt8125 * -443813705;
					else {
						int i_593_ = is[(i_581_ - i_590_ - 1) * i_581_ + i_587_];
						if (i_593_ != anInt7204) {
							anInt7204 = i_593_;
							anInt7205 = (~0xffffff | ((((aClass624_7158.anInt8130 * 1433185939 & 0xff00ff) * i_582_ + (i_593_ & 0xff00ff) * i_583_) & ~0xff00ff) + ((((aClass624_7158.anInt8130 * 1433185939) & 0xff00) * i_582_ + (i_593_ & 0xff00) * i_583_) & 0xff0000)) >> 8);
						}
						is[(i_581_ - i_590_ - 1) * i_581_ + i_587_] = anInt7205;
					}
				}
			}
		}
	}

	static void method8884(int[] is, int i, int i_594_, int i_595_, int i_596_, int i_597_, int i_598_, int i_599_, int i_600_, byte[] is_601_, int i_602_, int i_603_) {
		int i_604_ = 0;
		int i_605_ = 0;
		int i_606_ = i_594_ - i + 1;
		int i_607_ = i_596_ - i_595_ + 1;
		int i_608_ = (i_602_ << 16) / i_606_;
		int i_609_ = (is_601_.length / i_602_ << 16) / i_607_;
		int i_610_ = i + (i_598_ - i_596_ - 1) * i_597_;
		int i_611_ = i_599_ >> 24;
		int i_612_ = i_600_ >> 24;
		if (i_603_ == 0 || i_603_ == 1 && i_611_ == 255 && i_612_ == 255) {
			int i_613_ = i_604_;
			for (int i_614_ = -i_607_; i_614_ < 0; i_614_++) {
				int i_615_ = (i_605_ >> 16) * i_602_;
				for (int i_616_ = -i_606_; i_616_ < 0; i_616_++) {
					if (is_601_[(i_604_ >> 16) + i_615_] != 0)
						is[i_610_++] = i_600_;
					else
						is[i_610_++] = i_599_;
					i_604_ += i_608_;
				}
				i_605_ += i_609_;
				i_604_ = i_613_;
				i_610_ += i_597_ - i_606_;
			}
		} else if (i_603_ == 1) {
			int i_617_ = i_604_;
			for (int i_618_ = -i_607_; i_618_ < 0; i_618_++) {
				int i_619_ = (i_605_ >> 16) * i_602_;
				for (int i_620_ = -i_606_; i_620_ < 0; i_620_++) {
					int i_621_ = i_599_;
					if (is_601_[(i_604_ >> 16) + i_619_] != 0)
						i_621_ = i_600_;
					int i_622_ = i_621_ >>> 24;
					int i_623_ = 255 - i_622_;
					int i_624_ = is[i_610_];
					is[i_610_++] = ~0xffffff | ((((i_621_ & 0xff00ff) * i_622_ + (i_624_ & 0xff00ff) * i_623_) & ~0xff00ff) + (((i_621_ & 0xff00) * i_622_ + (i_624_ & 0xff00) * i_623_) & 0xff0000)) >> 8;
					i_604_ += i_608_;
				}
				i_605_ += i_609_;
				i_604_ = i_617_;
				i_610_ += i_597_ - i_606_;
			}
		} else
			throw new IllegalArgumentException();
	}

	public static void method8885(Class472 class472, Class472 class472_625_, Class53_Sub12 class53_sub12, Class53_Sub5 class53_sub5, Class53_Sub18 class53_sub18, Class53_Sub1 class53_sub1, Class53_Sub14 class53_sub14, Interface19 interface19, Interface17 interface17) {
		aClass472_7145 = class472;
		aClass472_7146 = class472_625_;
		anInterface12_7182 = class53_sub12;
		anInterface12_7140 = class53_sub5;
		aClass53_Sub18_7190 = class53_sub18;
		aClass53_Sub1_7206 = class53_sub1;
		aClass53_Sub14_7185 = class53_sub14;
		anInterface19_7142 = interface19;
		anInterface17_7141 = interface17;
		aClass14_7147.method733(-827972566);
		int[] is = aClass472_7145.method7656(Class643.aClass643_8340.method82(), -1053401967);
		if (is != null) {
			for (int i = 0; i < is.length; i++) {
				Class523_Sub27_Sub17 class523_sub27_sub17 = Class275.method5042(aClass472_7145, is[i], (byte) 54);
				aClass14_7147.method738(class523_sub27_sub17, (long) (class523_sub27_sub17.anInt11831 * -536403473));
			}
		}
		Class226.method4166(true, false, 240723773);
	}

	static void method8886(int[] is, int i, int i_626_, int i_627_, int i_628_, int i_629_, boolean bool, int i_630_, int i_631_, int i_632_, int[] is_633_, byte[] is_634_, boolean bool_635_) {
		if (bool_635_ || i_630_ != 0 || i_631_ > 0) {
			if (i_631_ == 0)
				method8911(is, i, i_626_, i_627_, i_628_, i_629_, i_629_, i_630_ | ~0xffffff);
			else {
				int i_636_ = i_632_ & 0x3f;
				if (i_636_ == 0 || anInt7151 == 0) {
					int i_637_ = anIntArray7162[i_631_];
					if (bool_635_ || i_637_ != 0)
						method8911(is, i, i_626_, i_627_, i_628_, i_629_, i_629_, i_637_ | ~0xffffff);
				} else {
					int i_638_ = bool_635_ ? 0 : 1;
					int i_639_ = Class328.method5786(i_632_ >> 6 & 0x3, i_636_, -2143987415);
					i_636_ = Class485.method7937(i_636_, 778266284);
					method8884(is, i, i_626_, i_627_, i_628_, i_629_, i_629_, i_630_, anIntArray7162[i_631_], aByteArrayArrayArray7137[i_636_ - 1][i_639_], anInt7151, i_638_);
				}
			}
		}
		if (bool && is_633_ != null) {
			int i_640_ = i_626_ - i + 1;
			int i_641_ = i_628_ - i_627_ + 1;
			for (int i_642_ = 0; i_642_ < is_633_.length; i_642_++) {
				int i_643_ = is_634_[i_642_] & 0x3f;
				if (i_643_ == Class607.aClass607_7974.anInt7982 * 1923531495 || i_643_ == Class607.aClass607_7965.anInt7982 * 1923531495 || i_643_ == Class607.aClass607_7966.anInt7982 * 1923531495 || (i_643_ == Class607.aClass607_7971.anInt7982 * 1923531495)) {
					Class602 class602 = ((Class602) aClass53_Sub18_7190.getDefinition(is_633_[i_642_], (byte) -82));
					if (class602.anInt7890 * 573415481 == -1) {
						int i_644_ = -3355444;
						if (class602.anInt7874 * -344567467 == 1)
							i_644_ = -3407872;
						int i_645_ = is_634_[i_642_] >> 6 & 0x3;
						if (i_643_ == (Class607.aClass607_7974.anInt7982 * 1923531495)) {
							if (i_645_ == 0)
								method8844(is, i, i_628_, i_641_, i_629_, i_644_);
							else if (i_645_ == 1)
								method8843(is, i, i_628_, i_640_, i_629_, i_644_);
							else if (i_645_ == 2)
								method8844(is, i_626_, i_628_, i_641_, i_629_, i_644_);
							else
								method8843(is, i, i_627_, i_640_, i_629_, i_644_);
						} else if (i_643_ == (Class607.aClass607_7965.anInt7982 * 1923531495)) {
							if (i_645_ == 0) {
								method8844(is, i, i_628_, i_641_, i_629_, -1);
								method8843(is, i, i_628_, i_640_, i_629_, i_644_);
							} else if (i_645_ == 1) {
								method8844(is, i_626_, i_628_, i_641_, i_629_, -1);
								method8843(is, i, i_628_, i_640_, i_629_, i_644_);
							} else if (i_645_ == 2) {
								method8844(is, i_626_, i_628_, i_641_, i_629_, -1);
								method8843(is, i, i_627_, i_640_, i_629_, i_644_);
							} else {
								method8844(is, i, i_628_, i_641_, i_629_, -1);
								method8843(is, i, i_627_, i_640_, i_629_, i_644_);
							}
						} else if (i_643_ == (Class607.aClass607_7966.anInt7982 * 1923531495)) {
							if (i_645_ == 0)
								method8843(is, i, i_628_, 1, i_629_, i_644_);
							else if (i_645_ == 1)
								method8843(is, i_626_, i_628_, 1, i_629_, i_644_);
							else if (i_645_ == 2)
								method8843(is, i_626_, i_627_, 1, i_629_, i_644_);
							else
								method8843(is, i, i_627_, 1, i_629_, i_644_);
						} else if (i_643_ == (Class607.aClass607_7971.anInt7982 * 1923531495)) {
							if (i_645_ == 0 || i_645_ == 2) {
								for (int i_646_ = 0; i_646_ < i_641_; i_646_++)
									method8843(is, i + i_646_, i_627_ + i_646_, 1, i_629_, i_644_);
							} else {
								for (int i_647_ = 0; i_647_ < i_641_; i_647_++)
									method8843(is, i + i_647_, i_628_ - i_647_, 1, i_629_, i_644_);
							}
						}
					}
				}
			}
		}
	}

	static void method8887(Class178 class178, boolean bool, boolean bool_648_, int i, int i_649_, int i_650_, int i_651_, boolean bool_652_, boolean bool_653_) {
		int i_654_ = anInt7198 - anInt7196;
		int i_655_ = anInt7195 - anInt7167;
		if (anInt7198 < anInt7160)
			i_654_++;
		if (anInt7195 < anInt7138)
			i_655_++;
		int i_656_ = anInt7196 / 64;
		int i_657_ = anInt7167 / 64;
		int i_658_ = (anInt7196 + i_654_) / 64;
		int i_659_ = (anInt7167 + i_655_) / 64;
		int i_660_;
		int i_661_;
		if (bool_653_) {
			i_660_ = (anInt7202 - anInt7200) / ((anInt7198 - anInt7196) / 64);
			i_661_ = i_660_;
		} else {
			i_660_ = method8835();
			i_661_ = (int) Math.ceil((double) (64.0F * aFloat7154 / 2.0F));
		}
		anArrayList7186.clear();
		int i_662_ = 0;
		int i_663_ = i_660_ * i_660_;
		for (int i_664_ = i_656_; i_664_ <= i_658_; i_664_++) {
			for (int i_665_ = i_657_; i_665_ <= i_659_; i_665_++) {
				int i_666_ = (i_664_ << 16) + i_665_;
				int i_667_ = method8914((long) i_666_);
				if (i_667_ != i_660_) {
					if (i_664_ < 0 || i_664_ * 64 >= anInt7160 || i_665_ < 0 || i_665_ * 64 >= anInt7138)
						method8826(class178, i_664_, i_665_, i_660_, i_666_);
					else if (i_667_ == -1) {
						method8827(i_664_, i_665_, i_660_, i_666_, bool, bool_648_, bool_652_, class178);
						i_662_ += i_663_;
					} else
						anArrayList7186.add(Integer.valueOf(i_666_));
				}
			}
		}
		if (!anArrayList7186.isEmpty() && i_662_ < anInt7187) {
			for (Iterator iterator = anArrayList7186.iterator(); i_662_ < anInt7187 && iterator.hasNext(); i_662_ += i_663_) {
				int i_668_ = ((Integer) iterator.next()).intValue();
				int i_669_ = i_668_ >> 16 & 0xffff;
				int i_670_ = i_668_ & 0xffff;
				method8827(i_669_, i_670_, i_660_, i_668_, bool, bool_648_, bool_652_, class178);
			}
		}
		for (int i_671_ = i_656_; i_671_ <= i_658_; i_671_++) {
			int i_672_ = i_671_ * 64;
			int i_673_ = i_672_ - anInt7196;
			int i_674_ = i_661_;
			int i_675_ = (i_650_ + i * i_673_ >> 16) + anInt7200;
			int i_676_ = (i_650_ + i * (i_673_ + 64) >> 16) + anInt7200;
			if (i_675_ + i_674_ != i_676_)
				i_674_ = i_676_ - i_675_;
			for (int i_677_ = i_657_; i_677_ <= i_659_; i_677_++) {
				int i_678_ = i_677_ * 64;
				int i_679_ = i_678_ - anInt7167;
				int i_680_ = (i_671_ << 16) + i_677_;
				int i_681_ = i_661_;
				int i_682_ = anInt7203 - (i_651_ + i_649_ * i_679_ >> 16);
				int i_683_ = anInt7203 - (i_651_ + i_649_ * (i_679_ + 64) >> 16);
				if (i_682_ - i_681_ != i_683_)
					i_681_ = i_682_ - i_683_;
				i_682_ -= i_681_;
				Class148 class148 = (Class148) aClass209_7184.method3767((long) i_680_);
				if (class148 == null)
					throw new RuntimeException();
				if (class148.method2504() == i_674_ && class148.method2428() == i_681_)
					class148.method2435(i_675_, i_682_);
				else
					class148.method2438(i_675_, i_682_, i_674_, i_681_);
			}
		}
	}

	static void method8888(Class178 class178, int[] is, int i, int i_684_, int i_685_, int[] is_686_, byte[] is_687_) {
		if (is_686_ != null) {
			for (int i_688_ = 0; i_688_ < is_686_.length; i_688_++) {
				Class602 class602 = (Class602) aClass53_Sub18_7190.getDefinition(is_686_[i_688_], (byte) -26);
				int i_689_ = class602.anInt7890 * 573415481;
				if (i_689_ != -1) {
					Class46 class46 = ((Class46) aClass53_Sub14_7185.getDefinition(i_689_, (byte) 97));
					Class148 class148 = class46.method1240(class178, (class602.aBool7891 ? is_687_[i_688_] >> 6 & 0x3 : 0), (class602.aBool7893 ? class602.aBool7908 : false), (byte) 64);
					int[] is_690_ = class46.method1238(class178, (class602.aBool7891 ? is_687_[i_688_] >> 6 & 0x3 : 0), (class602.aBool7893 ? class602.aBool7908 : false), (short) 17832);
					if (class148 != null) {
						int i_691_ = class148.method38();
						int i_692_ = class148.method2429();
						int i_693_ = i * i_691_ / 64 >> 2;
						int i_694_ = i * i_692_ / 64 >> 2;
						if (class46.aBool670) {
							int i_695_ = class602.anInt7871 * -1994552549;
							int i_696_ = class602.anInt7872 * -1564896481;
							if ((is_687_[i_688_] >> 6 & 0x1) == 1) {
								int i_697_ = i_695_;
								i_695_ = i_696_;
								i_696_ = i_697_;
							}
							i_693_ = i_695_ * i / 64;
							i_694_ = i_696_ * i / 64;
						}
						if (i_693_ != 0 && i_694_ != 0) {
							int i_698_ = i_684_ * i / 64;
							int i_699_ = (64 - i_685_) * i / 64 - i_694_ + 1;
							for (int i_700_ = 0; i_700_ < i_693_; i_700_++) {
								int i_701_ = i_700_ + i_698_;
								if (i_701_ >= 0) {
									if (i_701_ >= i)
										break;
									for (int i_702_ = 0; i_702_ < i_694_; i_702_++) {
										int i_703_ = i_702_ + i_699_;
										if (i_703_ >= 0) {
											if (i_703_ >= i)
												break;
											int i_704_ = (is_690_[(i_700_ * i_691_ / i_693_ + i_691_ * (i_702_ * i_692_ / i_694_))]);
											int i_705_ = i_704_ >> 24 & 0xff;
											if (i_705_ != 0)
												is[i_701_ + i * i_703_] = i_704_;
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

	static Class708 method8889(Class178 class178, int i, int i_706_, int i_707_, int i_708_) {
		for (Class523_Sub32 class523_sub32 = (Class523_Sub32) aClass708_7194.method14240(2025993931); class523_sub32 != null; class523_sub32 = (Class523_Sub32) aClass708_7194.method14244((byte) -4))
			method8895(class178, class523_sub32, i, i_706_, i_707_, i_708_);
		return aClass708_7194;
	}

	static Class708 method8890(Class178 class178, int i, int i_709_, int i_710_, int i_711_) {
		for (Class523_Sub32 class523_sub32 = (Class523_Sub32) aClass708_7194.method14240(1848167185); class523_sub32 != null; class523_sub32 = (Class523_Sub32) aClass708_7194.method14244((byte) 93))
			method8895(class178, class523_sub32, i, i_709_, i_710_, i_711_);
		return aClass708_7194;
	}

	static void method8891(Class178 class178, int[] is, int i, int i_712_, int i_713_, int[] is_714_, byte[] is_715_) {
		if (is_714_ != null) {
			for (int i_716_ = 0; i_716_ < is_714_.length; i_716_++) {
				Class602 class602 = (Class602) aClass53_Sub18_7190.getDefinition(is_714_[i_716_], (byte) 22);
				int i_717_ = class602.anInt7890 * 573415481;
				if (i_717_ != -1) {
					Class46 class46 = ((Class46) aClass53_Sub14_7185.getDefinition(i_717_, (byte) -34));
					Class148 class148 = class46.method1240(class178, (class602.aBool7891 ? is_715_[i_716_] >> 6 & 0x3 : 0), (class602.aBool7893 ? class602.aBool7908 : false), (byte) 64);
					int[] is_718_ = class46.method1238(class178, (class602.aBool7891 ? is_715_[i_716_] >> 6 & 0x3 : 0), (class602.aBool7893 ? class602.aBool7908 : false), (short) 30018);
					if (class148 != null) {
						int i_719_ = class148.method38();
						int i_720_ = class148.method2429();
						int i_721_ = i * i_719_ / 64 >> 2;
						int i_722_ = i * i_720_ / 64 >> 2;
						if (class46.aBool670) {
							int i_723_ = class602.anInt7871 * -1994552549;
							int i_724_ = class602.anInt7872 * -1564896481;
							if ((is_715_[i_716_] >> 6 & 0x1) == 1) {
								int i_725_ = i_723_;
								i_723_ = i_724_;
								i_724_ = i_725_;
							}
							i_721_ = i_723_ * i / 64;
							i_722_ = i_724_ * i / 64;
						}
						if (i_721_ != 0 && i_722_ != 0) {
							int i_726_ = i_712_ * i / 64;
							int i_727_ = (64 - i_713_) * i / 64 - i_722_ + 1;
							for (int i_728_ = 0; i_728_ < i_721_; i_728_++) {
								int i_729_ = i_728_ + i_726_;
								if (i_729_ >= 0) {
									if (i_729_ >= i)
										break;
									for (int i_730_ = 0; i_730_ < i_722_; i_730_++) {
										int i_731_ = i_730_ + i_727_;
										if (i_731_ >= 0) {
											if (i_731_ >= i)
												break;
											int i_732_ = (is_718_[(i_728_ * i_719_ / i_721_ + i_719_ * (i_730_ * i_720_ / i_722_))]);
											int i_733_ = i_732_ >> 24 & 0xff;
											if (i_733_ != 0)
												is[i_729_ + i * i_731_] = i_732_;
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

	static void method8892(Class178 class178, Class523_Sub34 class523_sub34, int i, int i_734_, int i_735_, int i_736_, int[] is, int[] is_737_) {
		int i_738_ = class523_sub34.readUnsignedByte(-33973950);
		if ((i_738_ & 0x1) == 0) {
			boolean bool = (i_738_ & 0x2) == 0;
			int i_739_ = i_738_ >> 2 & 0x3f;
			if (i_739_ != 62) {
				if (i_739_ == 63)
					i_739_ = class523_sub34.readUnsignedSmart(368514876);
				else if (bool)
					i_739_ = is[i_739_];
				else
					i_739_ = is_737_[i_739_];
				if (bool) {
					aShortArray7163[i_735_ + i_736_ * anInt7160] = (short) i_739_;
					aShortArray7166[i_735_ + i_736_ * anInt7160] = (short) 0;
				} else {
					aShortArray7166[i_735_ + i_736_ * anInt7160] = (short) i_739_;
					aByteArray7139[i_735_ + i_736_ * anInt7160] = (byte) 0;
					aShortArray7163[i_735_ + i_736_ * anInt7160] = (short) class523_sub34.readUnsignedSmart(368514876);
				}
			}
		} else {
			int i_740_ = (i_738_ >> 1 & 0x3) + 1;
			boolean bool = (i_738_ & 0x8) != 0;
			boolean bool_741_ = (i_738_ & 0x10) != 0;
			for (int i_742_ = 0; i_742_ < i_740_; i_742_++) {
				int i_743_ = class523_sub34.readUnsignedSmart(368514876);
				int i_744_ = 0;
				int i_745_ = 0;
				if (bool) {
					i_744_ = class523_sub34.readUnsignedSmart(368514876);
					i_745_ = class523_sub34.readUnsignedByte(1421103891);
				}
				int i_746_ = 0;
				if (bool_741_)
					i_746_ = class523_sub34.readUnsignedByte(552182049);
				if (i_742_ == 0) {
					aShortArray7163[i_735_ + i_736_ * anInt7160] = (short) i_743_;
					aShortArray7166[i_735_ + i_736_ * anInt7160] = (short) i_744_;
					aByteArray7139[i_735_ + i_736_ * anInt7160] = (byte) i_745_;
					if (i_746_ == 1) {
						anObjectArray7199[i_735_ + i_736_ * anInt7160] = new Integer(class523_sub34.readBigSmart((byte) -94));
						aByteArray7169[i_735_ + i_736_ * anInt7160] = class523_sub34.readByte((short) -1503);
					} else if (i_746_ > 1) {
						int[] is_747_ = new int[i_746_];
						byte[] is_748_ = new byte[i_746_];
						for (int i_749_ = 0; i_749_ < i_746_; i_749_++) {
							is_747_[i_749_] = class523_sub34.readBigSmart((byte) -118);
							is_748_[i_749_] = class523_sub34.readByte((short) -27477);
						}
						anObjectArray7199[i_735_ + i_736_ * anInt7160] = new Class523_Sub35(is_747_, is_748_);
					}
				} else {
					int[] is_750_ = null;
					byte[] is_751_ = null;
					if (i_746_ > 0) {
						is_750_ = new int[i_746_];
						is_751_ = new byte[i_746_];
						for (int i_752_ = 0; i_752_ < i_746_; i_752_++) {
							is_750_[i_752_] = class523_sub34.readBigSmart((byte) -30);
							is_751_[i_752_] = class523_sub34.readByte((short) -22335);
						}
					}
					if ((aHashMapArrayArrayArray7181[i_742_ - 1][i - (anInt7168 >> 6)][i_734_ - (anInt7159 >> 6)]) == null)
						aHashMapArrayArrayArray7181[i_742_ - 1][i - (anInt7168 >> 6)][i_734_ - (anInt7159 >> 6)] = new HashMap();
					int i_753_ = ((i_735_ & 0x3f) << 8) + (i_736_ & 0x3f);
					Class527 class527 = new Class527(i_735_ & 0x3f, i_736_ & 0x3f, i_743_, i_744_, i_745_, is_750_, is_751_);
					aHashMapArrayArrayArray7181[i_742_ - 1][i - (anInt7168 >> 6)][i_734_ - (anInt7159 >> 6)].put(Integer.valueOf(i_753_), class527);
				}
			}
		}
	}

	static void method8893() {
		int[] is = new int[3];
		for (int i = 0; i < aClass528_7156.anInt7099 * 1153952435; i++) {
			boolean bool = (aClass523_Sub27_Sub17_7144.method18193(aClass528_7156.anIntArray7098[i] >> 28 & 0x3, aClass528_7156.anIntArray7098[i] >> 14 & 0x3fff, aClass528_7156.anIntArray7098[i] & 0x3fff, is, (short) -14121));
			if (bool) {
				Class523_Sub32 class523_sub32 = new Class523_Sub32(aClass528_7156.anIntArray7100[i]);
				class523_sub32.anInt10580 = (is[1] - anInt7168) * -79680441;
				class523_sub32.anInt10581 = (is[2] - anInt7159) * -1573818035;
				aClass708_7194.method14236(class523_sub32, -1671721559);
			}
		}
	}

	static boolean method8894(int i, int i_754_) {
		int i_755_ = i >> 3;
		int i_756_ = i_754_ >> 3;
		if (i_755_ < 0 || i_756_ < 0 || i_755_ >= aBoolArrayArray7171.length || i_756_ >= aBoolArrayArray7171[i_755_].length)
			return false;
		return aBoolArrayArray7171[i_755_][i_756_];
	}

	static void method8895(Class178 class178, Class523_Sub32 class523_sub32, int i, int i_757_, int i_758_, int i_759_) {
		class523_sub32.anInt10583 = (anInt7200 + (i_758_ + i * (class523_sub32.anInt10580 * -1808941705 - anInt7196) >> 16)) * -803659307;
		class523_sub32.anInt10584 = (anInt7203 - (i_759_ + i_757_ * (class523_sub32.anInt10581 * -1727058043 - anInt7167) >> 16)) * 1018818543;
	}

	static int method8896(long l) {
		Class148 class148 = (Class148) aClass209_7184.method3767(l);
		if (class148 != null)
			return class148.method2504();
		return -1;
	}

	static int method8897(long l) {
		Class148 class148 = (Class148) aClass209_7184.method3767(l);
		if (class148 != null)
			return class148.method2504();
		return -1;
	}

	static void method8898(int i) {
		Class523_Sub27_Sub17 class523_sub27_sub17 = (Class523_Sub27_Sub17) aClass14_7147.method741((long) i);
		if (class523_sub27_sub17 != null && class523_sub27_sub17 != aClass523_Sub27_Sub17_7144) {
			aClass523_Sub27_Sub17_7144 = class523_sub27_sub17;
			aBool7170 = (aClass523_Sub27_Sub17_7144.anInt11831 * -536403473 == aClass624_7158.anInt8118 * -1183714497);
		}
	}

	static void method8899(Class178 class178, Class523_Sub34 class523_sub34, int i, int i_760_, int i_761_, int i_762_, int[] is, int[] is_763_) {
		int i_764_ = class523_sub34.readUnsignedByte(-1161332500);
		if ((i_764_ & 0x1) == 0) {
			boolean bool = (i_764_ & 0x2) == 0;
			int i_765_ = i_764_ >> 2 & 0x3f;
			if (i_765_ != 62) {
				if (i_765_ == 63)
					i_765_ = class523_sub34.readUnsignedSmart(368514876);
				else if (bool)
					i_765_ = is[i_765_];
				else
					i_765_ = is_763_[i_765_];
				if (bool) {
					aShortArray7163[i_761_ + i_762_ * anInt7160] = (short) i_765_;
					aShortArray7166[i_761_ + i_762_ * anInt7160] = (short) 0;
				} else {
					aShortArray7166[i_761_ + i_762_ * anInt7160] = (short) i_765_;
					aByteArray7139[i_761_ + i_762_ * anInt7160] = (byte) 0;
					aShortArray7163[i_761_ + i_762_ * anInt7160] = (short) class523_sub34.readUnsignedSmart(368514876);
				}
			}
		} else {
			int i_766_ = (i_764_ >> 1 & 0x3) + 1;
			boolean bool = (i_764_ & 0x8) != 0;
			boolean bool_767_ = (i_764_ & 0x10) != 0;
			for (int i_768_ = 0; i_768_ < i_766_; i_768_++) {
				int i_769_ = class523_sub34.readUnsignedSmart(368514876);
				int i_770_ = 0;
				int i_771_ = 0;
				if (bool) {
					i_770_ = class523_sub34.readUnsignedSmart(368514876);
					i_771_ = class523_sub34.readUnsignedByte(1537115032);
				}
				int i_772_ = 0;
				if (bool_767_)
					i_772_ = class523_sub34.readUnsignedByte(-314969208);
				if (i_768_ == 0) {
					aShortArray7163[i_761_ + i_762_ * anInt7160] = (short) i_769_;
					aShortArray7166[i_761_ + i_762_ * anInt7160] = (short) i_770_;
					aByteArray7139[i_761_ + i_762_ * anInt7160] = (byte) i_771_;
					if (i_772_ == 1) {
						anObjectArray7199[i_761_ + i_762_ * anInt7160] = new Integer(class523_sub34.readBigSmart((byte) -60));
						aByteArray7169[i_761_ + i_762_ * anInt7160] = class523_sub34.readByte((short) -16767);
					} else if (i_772_ > 1) {
						int[] is_773_ = new int[i_772_];
						byte[] is_774_ = new byte[i_772_];
						for (int i_775_ = 0; i_775_ < i_772_; i_775_++) {
							is_773_[i_775_] = class523_sub34.readBigSmart((byte) -14);
							is_774_[i_775_] = class523_sub34.readByte((short) -11955);
						}
						anObjectArray7199[i_761_ + i_762_ * anInt7160] = new Class523_Sub35(is_773_, is_774_);
					}
				} else {
					int[] is_776_ = null;
					byte[] is_777_ = null;
					if (i_772_ > 0) {
						is_776_ = new int[i_772_];
						is_777_ = new byte[i_772_];
						for (int i_778_ = 0; i_778_ < i_772_; i_778_++) {
							is_776_[i_778_] = class523_sub34.readBigSmart((byte) -30);
							is_777_[i_778_] = class523_sub34.readByte((short) -3251);
						}
					}
					if ((aHashMapArrayArrayArray7181[i_768_ - 1][i - (anInt7168 >> 6)][i_760_ - (anInt7159 >> 6)]) == null)
						aHashMapArrayArrayArray7181[i_768_ - 1][i - (anInt7168 >> 6)][i_760_ - (anInt7159 >> 6)] = new HashMap();
					int i_779_ = ((i_761_ & 0x3f) << 8) + (i_762_ & 0x3f);
					Class527 class527 = new Class527(i_761_ & 0x3f, i_762_ & 0x3f, i_769_, i_770_, i_771_, is_776_, is_777_);
					aHashMapArrayArrayArray7181[i_768_ - 1][i - (anInt7168 >> 6)][i_760_ - (anInt7159 >> 6)].put(Integer.valueOf(i_779_), class527);
				}
			}
		}
	}

	static void method8900(int[] is, int i, int i_780_, int i_781_, int i_782_, int i_783_) {
		int i_784_ = aClass624_7158.anInt8130 * 1433185939 >> 24 & 0xff;
		int i_785_ = 255 - i_784_;
		for (int i_786_ = i; i_786_ <= i_780_; i_786_++) {
			for (int i_787_ = i_781_; i_787_ <= i_782_; i_787_++) {
				int i_788_ = is[(i_783_ - i_787_ - 1) * i_783_ + i_786_];
				if (i_788_ != anInt7204) {
					anInt7204 = i_788_;
					anInt7205 = (~0xffffff | ((((aClass624_7158.anInt8130 * 1433185939 & 0xff00ff) * i_784_ + (i_788_ & 0xff00ff) * i_785_) & ~0xff00ff) + (((aClass624_7158.anInt8130 * 1433185939 & 0xff00) * i_784_ + (i_788_ & 0xff00) * i_785_) & 0xff0000)) >> 8);
				}
				is[(i_783_ - i_787_ - 1) * i_783_ + i_786_] = anInt7205;
			}
		}
	}

	static void method8901(int[] is, int i, int i_789_, int i_790_, int i_791_, int i_792_) {
		int i_793_ = aClass624_7158.anInt8130 * 1433185939 >> 24 & 0xff;
		int i_794_ = 255 - i_793_;
		for (int i_795_ = i; i_795_ <= i_789_; i_795_++) {
			for (int i_796_ = i_790_; i_796_ <= i_791_; i_796_++) {
				int i_797_ = is[(i_792_ - i_796_ - 1) * i_792_ + i_795_];
				if (i_797_ != anInt7204) {
					anInt7204 = i_797_;
					anInt7205 = (~0xffffff | ((((aClass624_7158.anInt8130 * 1433185939 & 0xff00ff) * i_793_ + (i_797_ & 0xff00ff) * i_794_) & ~0xff00ff) + (((aClass624_7158.anInt8130 * 1433185939 & 0xff00) * i_793_ + (i_797_ & 0xff00) * i_794_) & 0xff0000)) >> 8);
				}
				is[(i_792_ - i_796_ - 1) * i_792_ + i_795_] = anInt7205;
			}
		}
	}

	static void method8902(int[] is, int i, int i_798_, int i_799_, int i_800_, int i_801_) {
		int i_802_ = aClass624_7158.anInt8130 * 1433185939 >> 24 & 0xff;
		int i_803_ = 255 - i_802_;
		for (int i_804_ = i; i_804_ <= i_798_; i_804_++) {
			for (int i_805_ = i_799_; i_805_ <= i_800_; i_805_++) {
				int i_806_ = is[(i_801_ - i_805_ - 1) * i_801_ + i_804_];
				if (i_806_ != anInt7204) {
					anInt7204 = i_806_;
					anInt7205 = (~0xffffff | ((((aClass624_7158.anInt8130 * 1433185939 & 0xff00ff) * i_802_ + (i_806_ & 0xff00ff) * i_803_) & ~0xff00ff) + (((aClass624_7158.anInt8130 * 1433185939 & 0xff00) * i_802_ + (i_806_ & 0xff00) * i_803_) & 0xff0000)) >> 8);
				}
				is[(i_801_ - i_805_ - 1) * i_801_ + i_804_] = anInt7205;
			}
		}
	}

	static void method8903(int[] is, int i, int i_807_, int i_808_, int i_809_, int i_810_) {
		int i_811_ = aClass624_7158.anInt8130 * 1433185939 >> 24 & 0xff;
		int i_812_ = 255 - i_811_;
		for (int i_813_ = i; i_813_ <= i_807_; i_813_++) {
			for (int i_814_ = i_808_; i_814_ <= i_809_; i_814_++) {
				int i_815_ = is[(i_810_ - i_814_ - 1) * i_810_ + i_813_];
				if (i_815_ != anInt7204) {
					anInt7204 = i_815_;
					anInt7205 = (~0xffffff | ((((aClass624_7158.anInt8130 * 1433185939 & 0xff00ff) * i_811_ + (i_815_ & 0xff00ff) * i_812_) & ~0xff00ff) + (((aClass624_7158.anInt8130 * 1433185939 & 0xff00) * i_811_ + (i_815_ & 0xff00) * i_812_) & 0xff0000)) >> 8);
				}
				is[(i_810_ - i_814_ - 1) * i_810_ + i_813_] = anInt7205;
			}
		}
	}

	static void method8904() {
		aShortArray7163 = null;
		aByteArray7164 = null;
		aShortArray7150 = null;
		aShortArray7166 = null;
		aByteArray7139 = null;
		anObjectArray7199 = null;
		aByteArray7169 = null;
		aHashMapArrayArrayArray7181 = null;
		anIntArray7162 = null;
		aBoolArrayArray7171 = null;
	}

	static void method8905(Class172 class172, int i, int i_816_) {
		for (int i_817_ = 0; i_817_ < anInterface12_7182.method69(-1700348369); i_817_++)
			anIntArray7162[i_817_ + 1] = method8816(class172, i_817_, i, i_816_);
	}

	static void method8906() {
		for (int i = 0; i < anInt7160; i++) {
			for (int i_818_ = 0; i_818_ < anInt7138; i_818_++) {
				Object object = anObjectArray7199[i + i_818_ * anInt7160];
				if (object != null) {
					if (object instanceof Class523_Sub35) {
						Class523_Sub35 class523_sub35 = (Class523_Sub35) object;
						if (class523_sub35 != null) {
							for (int i_819_ = 0; (i_819_ < class523_sub35.anIntArray10664.length); i_819_++) {
								Class602 class602 = (Class602) (aClass53_Sub18_7190.getDefinition((class523_sub35.anIntArray10664[i_819_]), (byte) -25));
								int i_820_ = class602.anInt7906 * -1296551513;
								if (class602.anIntArray7912 != null) {
									class602 = (class602.method9893(anInterface19_7142, anInterface17_7141, 1935607597));
									if (class602 != null)
										i_820_ = class602.anInt7906 * -1296551513;
								}
								if (i_820_ != -1) {
									Class523_Sub32 class523_sub32 = new Class523_Sub32(i_820_);
									class523_sub32.anInt10580 = i * -79680441;
									class523_sub32.anInt10581 = i_818_ * -1573818035;
									aClass708_7194.method14236(class523_sub32, 122872068);
								}
							}
						}
					} else {
						Integer integer = (Integer) object;
						Class602 class602 = ((Class602) aClass53_Sub18_7190.getDefinition(integer.intValue(), (byte) -55));
						int i_821_ = class602.anInt7906 * -1296551513;
						if (class602.anIntArray7912 != null) {
							class602 = class602.method9893(anInterface19_7142, anInterface17_7141, 628055635);
							if (class602 != null)
								i_821_ = class602.anInt7906 * -1296551513;
						}
						if (i_821_ != -1) {
							Class523_Sub32 class523_sub32 = new Class523_Sub32(i_821_);
							class523_sub32.anInt10580 = i * -79680441;
							class523_sub32.anInt10581 = i_818_ * -1573818035;
							aClass708_7194.method14236(class523_sub32, -1599279221);
						}
					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int i_822_ = 0; i_822_ < aHashMapArrayArrayArray7181[0].length; i_822_++) {
				for (int i_823_ = 0; i_823_ < aHashMapArrayArrayArray7181[0][0].length; i_823_++) {
					HashMap hashmap = aHashMapArrayArrayArray7181[i][i_822_][i_823_];
					if (hashmap != null) {
						Iterator iterator = hashmap.values().iterator();
						while (iterator.hasNext()) {
							Class527 class527 = (Class527) iterator.next();
							if (class527.anIntArray7096 != null) {
								for (int i_824_ = 0; i_824_ < class527.anIntArray7096.length; i_824_++) {
									Class602 class602 = ((Class602) (aClass53_Sub18_7190.getDefinition(class527.anIntArray7096[i_824_], (byte) -1)));
									int i_825_ = class602.anInt7906 * -1296551513;
									if (class602.anIntArray7912 != null) {
										class602 = (class602.method9893(anInterface19_7142, anInterface17_7141, 129609758));
										if (class602 != null)
											i_825_ = (class602.anInt7906 * -1296551513);
									}
									if (i_825_ != -1) {
										Class523_Sub32 class523_sub32 = new Class523_Sub32(i_825_);
										class523_sub32.anInt10580 = ((i_822_ + (anInt7168 >> 6)) * 64 + class527.aByte7092 - anInt7168) * -79680441;
										class523_sub32.anInt10581 = ((i_823_ + (anInt7159 >> 6)) * 64 + class527.aByte7091 - anInt7159) * -1573818035;
										aClass708_7194.method14236(class523_sub32, -1164140642);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static void method8907(Class178 class178, Class523_Sub32 class523_sub32, int i, int i_826_, int i_827_, int i_828_) {
		class523_sub32.anInt10583 = (anInt7200 + (i_827_ + i * (class523_sub32.anInt10580 * -1808941705 - anInt7196) >> 16)) * -803659307;
		class523_sub32.anInt10584 = (anInt7203 - (i_828_ + i_826_ * (class523_sub32.anInt10581 * -1727058043 - anInt7167) >> 16)) * 1018818543;
	}

	static void method8908(int[] is, int i, int i_829_, int i_830_, int i_831_, int i_832_, int i_833_) {
		for (int i_834_ = 0; i_834_ < aClass624_7158.anInt8127 * 869969279; i_834_++) {
			int i_835_ = i_834_;
			if (i_833_ == anInt7174 || i_833_ == anInt7176)
				i_835_ = aClass624_7158.anInt8127 * 869969279 - i_834_ - 1;
			for (int i_836_ = 0; i_836_ < aClass624_7158.anInt8127 * 869969279; i_836_++) {
				int i_837_ = i_836_;
				if (i_833_ == anInt7176 || i_833_ == anInt7178)
					i_837_ = aClass624_7158.anInt8127 * 869969279 - i_836_ - 1;
				int i_838_ = anIntArrayArray7148[i_835_][i_837_];
				if (i_838_ != 0) {
					if (i_838_ == 1) {
						int i_839_ = is[((i_830_ - i_829_ - i_836_ - 1) * i_830_ + i + i_834_)];
						if (i_839_ != anInt7204) {
							anInt7204 = i_839_;
							anInt7205 = (~0xffffff | ((((aClass624_7158.anInt8130 * 1433185939 & 0xff00ff) * i_831_ + (i_839_ & 0xff00ff) * i_832_) & ~0xff00ff) + ((((aClass624_7158.anInt8130 * 1433185939) & 0xff00) * i_831_ + (i_839_ & 0xff00) * i_832_) & 0xff0000)) >> 8);
						}
						is[((i_830_ - i_829_ - i_836_ - 1) * i_830_ + i + i_834_)] = anInt7205;
					} else if (i_838_ == 2)
						is[((i_830_ - i_829_ - i_836_ - 1) * i_830_ + i + i_834_)] = aClass624_7158.anInt8125 * -443813705;
				}
			}
		}
	}

	static void method8909(int[] is, int i, int i_840_, int i_841_, int i_842_, int i_843_, int i_844_, int i_845_, int i_846_, byte[] is_847_, int i_848_, int i_849_) {
		int i_850_ = 0;
		int i_851_ = 0;
		int i_852_ = i_840_ - i + 1;
		int i_853_ = i_842_ - i_841_ + 1;
		int i_854_ = (i_848_ << 16) / i_852_;
		int i_855_ = (is_847_.length / i_848_ << 16) / i_853_;
		int i_856_ = i + (i_844_ - i_842_ - 1) * i_843_;
		int i_857_ = i_845_ >> 24;
		int i_858_ = i_846_ >> 24;
		if (i_849_ == 0 || i_849_ == 1 && i_857_ == 255 && i_858_ == 255) {
			int i_859_ = i_850_;
			for (int i_860_ = -i_853_; i_860_ < 0; i_860_++) {
				int i_861_ = (i_851_ >> 16) * i_848_;
				for (int i_862_ = -i_852_; i_862_ < 0; i_862_++) {
					if (is_847_[(i_850_ >> 16) + i_861_] != 0)
						is[i_856_++] = i_846_;
					else
						is[i_856_++] = i_845_;
					i_850_ += i_854_;
				}
				i_851_ += i_855_;
				i_850_ = i_859_;
				i_856_ += i_843_ - i_852_;
			}
		} else if (i_849_ == 1) {
			int i_863_ = i_850_;
			for (int i_864_ = -i_853_; i_864_ < 0; i_864_++) {
				int i_865_ = (i_851_ >> 16) * i_848_;
				for (int i_866_ = -i_852_; i_866_ < 0; i_866_++) {
					int i_867_ = i_845_;
					if (is_847_[(i_850_ >> 16) + i_865_] != 0)
						i_867_ = i_846_;
					int i_868_ = i_867_ >>> 24;
					int i_869_ = 255 - i_868_;
					int i_870_ = is[i_856_];
					is[i_856_++] = ~0xffffff | ((((i_867_ & 0xff00ff) * i_868_ + (i_870_ & 0xff00ff) * i_869_) & ~0xff00ff) + (((i_867_ & 0xff00) * i_868_ + (i_870_ & 0xff00) * i_869_) & 0xff0000)) >> 8;
					i_850_ += i_854_;
				}
				i_851_ += i_855_;
				i_850_ = i_863_;
				i_856_ += i_843_ - i_852_;
			}
		} else
			throw new IllegalArgumentException();
	}

	static void method8910(Class178 class178, Class523_Sub32 class523_sub32, Class239 class239) {
		if (class239.anIntArray2445 != null) {
			int[] is = new int[class239.anIntArray2445.length];
			for (int i = 0; i < is.length / 2; i++) {
				int i_871_ = (class239.anIntArray2445[i * 2] + class523_sub32.anInt10580 * -1808941705);
				int i_872_ = (class239.anIntArray2445[i * 2 + 1] + class523_sub32.anInt10581 * -1727058043);
				is[i * 2] = anInt7200 + ((anInt7202 - anInt7200) * (i_871_ - anInt7196) / (anInt7198 - anInt7196));
				is[i * 2 + 1] = anInt7203 - ((anInt7203 - anInt7201) * (i_872_ - anInt7167) / (anInt7195 - anInt7167));
			}
			Class182.method3557(class178, is, class239.anInt2431 * -868784361);
			if (class239.anInt2432 * -873662967 > 0) {
				for (int i = 0; i < is.length / 2 - 1; i++) {
					int i_873_ = is[i * 2];
					int i_874_ = is[i * 2 + 1];
					int i_875_ = is[(i + 1) * 2];
					int i_876_ = is[(i + 1) * 2 + 1];
					if (i_875_ < i_873_) {
						int i_877_ = i_873_;
						int i_878_ = i_874_;
						i_873_ = i_875_;
						i_874_ = i_876_;
						i_875_ = i_877_;
						i_876_ = i_878_;
					} else if (i_875_ == i_873_ && i_876_ < i_874_) {
						int i_879_ = i_874_;
						i_874_ = i_876_;
						i_876_ = i_879_;
					}
					class178.method3107(i_873_, i_874_, i_875_, i_876_, (class239.anIntArray2439[class239.aByteArray2440[i] & 0xff]), 1, class239.anInt2432 * -873662967, class239.anInt2433 * 788353041, class239.anInt2434 * 1803020905);
				}
				int i = is[is.length - 2];
				int i_880_ = is[is.length - 1];
				int i_881_ = is[0];
				int i_882_ = is[1];
				if (i_881_ < i) {
					int i_883_ = i;
					int i_884_ = i_880_;
					i = i_881_;
					i_880_ = i_882_;
					i_881_ = i_883_;
					i_882_ = i_884_;
				} else if (i_881_ == i && i_882_ < i_880_) {
					int i_885_ = i_880_;
					i_880_ = i_882_;
					i_882_ = i_885_;
				}
				class178.method3107(i, i_880_, i_881_, i_882_, (class239.anIntArray2439[((class239.aByteArray2440[class239.aByteArray2440.length - 1]) & 0xff)]), 1, class239.anInt2432 * -873662967, class239.anInt2433 * 788353041, class239.anInt2434 * 1803020905);
			} else {
				for (int i = 0; i < is.length / 2 - 1; i++)
					class178.method3381(is[i * 2], is[i * 2 + 1], is[(i + 1) * 2], is[(i + 1) * 2 + 1], (class239.anIntArray2439[class239.aByteArray2440[i] & 0xff]), 1300502849);
				class178.method3381(is[is.length - 2], is[is.length - 1], is[0], is[1], (class239.anIntArray2439[((class239.aByteArray2440[class239.aByteArray2440.length - 1]) & 0xff)]), -1990980402);
			}
		}
	}

	static void method8911(int[] is, int i, int i_886_, int i_887_, int i_888_, int i_889_, int i_890_, int i_891_) {
		for (int i_892_ = i; i_892_ <= i_886_; i_892_++) {
			for (int i_893_ = i_887_; i_893_ <= i_888_; i_893_++)
				is[(i_890_ - i_893_ - 1) * i_889_ + i_892_] = i_891_;
		}
	}

	static void method8912(int[] is, int i, int i_894_, int i_895_, int i_896_, int i_897_) {
		int i_898_ = i + (i_896_ - i_894_ - 1) * i_896_;
		for (int i_899_ = 0; i_899_ < i_895_; i_899_++)
			is[i_898_ + i_899_ * i_896_] = i_897_;
	}

	static void method8913(Class178 class178, Class523_Sub32 class523_sub32, Class239 class239) {
		if (class239.anIntArray2445 != null) {
			int[] is = new int[class239.anIntArray2445.length];
			for (int i = 0; i < is.length / 2; i++) {
				int i_900_ = (class239.anIntArray2445[i * 2] + class523_sub32.anInt10580 * -1808941705);
				int i_901_ = (class239.anIntArray2445[i * 2 + 1] + class523_sub32.anInt10581 * -1727058043);
				is[i * 2] = anInt7200 + ((anInt7202 - anInt7200) * (i_900_ - anInt7196) / (anInt7198 - anInt7196));
				is[i * 2 + 1] = anInt7203 - ((anInt7203 - anInt7201) * (i_901_ - anInt7167) / (anInt7195 - anInt7167));
			}
			Class182.method3557(class178, is, class239.anInt2431 * -868784361);
			if (class239.anInt2432 * -873662967 > 0) {
				for (int i = 0; i < is.length / 2 - 1; i++) {
					int i_902_ = is[i * 2];
					int i_903_ = is[i * 2 + 1];
					int i_904_ = is[(i + 1) * 2];
					int i_905_ = is[(i + 1) * 2 + 1];
					if (i_904_ < i_902_) {
						int i_906_ = i_902_;
						int i_907_ = i_903_;
						i_902_ = i_904_;
						i_903_ = i_905_;
						i_904_ = i_906_;
						i_905_ = i_907_;
					} else if (i_904_ == i_902_ && i_905_ < i_903_) {
						int i_908_ = i_903_;
						i_903_ = i_905_;
						i_905_ = i_908_;
					}
					class178.method3107(i_902_, i_903_, i_904_, i_905_, (class239.anIntArray2439[class239.aByteArray2440[i] & 0xff]), 1, class239.anInt2432 * -873662967, class239.anInt2433 * 788353041, class239.anInt2434 * 1803020905);
				}
				int i = is[is.length - 2];
				int i_909_ = is[is.length - 1];
				int i_910_ = is[0];
				int i_911_ = is[1];
				if (i_910_ < i) {
					int i_912_ = i;
					int i_913_ = i_909_;
					i = i_910_;
					i_909_ = i_911_;
					i_910_ = i_912_;
					i_911_ = i_913_;
				} else if (i_910_ == i && i_911_ < i_909_) {
					int i_914_ = i_909_;
					i_909_ = i_911_;
					i_911_ = i_914_;
				}
				class178.method3107(i, i_909_, i_910_, i_911_, (class239.anIntArray2439[((class239.aByteArray2440[class239.aByteArray2440.length - 1]) & 0xff)]), 1, class239.anInt2432 * -873662967, class239.anInt2433 * 788353041, class239.anInt2434 * 1803020905);
			} else {
				for (int i = 0; i < is.length / 2 - 1; i++)
					class178.method3381(is[i * 2], is[i * 2 + 1], is[(i + 1) * 2], is[(i + 1) * 2 + 1], (class239.anIntArray2439[class239.aByteArray2440[i] & 0xff]), -82403881);
				class178.method3381(is[is.length - 2], is[is.length - 1], is[0], is[1], (class239.anIntArray2439[((class239.aByteArray2440[class239.aByteArray2440.length - 1]) & 0xff)]), -1277858782);
			}
		}
	}

	static int method8914(long l) {
		Class148 class148 = (Class148) aClass209_7184.method3767(l);
		if (class148 != null)
			return class148.method2504();
		return -1;
	}
}
