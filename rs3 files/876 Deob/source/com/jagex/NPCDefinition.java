/* Class300 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Arrays;

public class NPCDefinition implements Interface13 {
	public byte aByte3247;
	public static final int anInt3248 = 8;
	public static short[] aShortArray3249 = new short[256];
	public byte aByte3250;
	Interface12 anInterface12_3251;
	public int anInt3252;
	int[] anIntArray3253;
	int anInt3254;
	public int[] anIntArray3255;
	public int[] anIntArray3256;
	int[][] anIntArrayArray3257;
	public int anInt3258;
	short[] aShortArray3259;
	public int anInt3260;
	public int anInt3261;
	short[] aShortArray3262;
	public short[] aShortArray3263;
	Class297 aClass297_3264;
	public byte aByte3265;
	byte aByte3266;
	byte aByte3267;
	byte aByte3268;
	public boolean aBool3269;
	public String[] aStringArray3270;
	public int anInt3271;
	public int anInt3272;
	public boolean aBool3273;
	public int anInt3274;
	int anInt3275;
	int anInt3276;
	public boolean aBool3277;
	public int anInt3278;
	public int anInt3279;
	public byte[] aByteArray3280;
	int anInt3281;
	public int[] anIntArray3282;
	public short[] aShortArray3283;
	public int anInt3284;
	public int anInt3285;
	public int[] anIntArray3286;
	public boolean aBool3287;
	int anInt3288;
	byte aByte3289;
	public boolean aBool3290;
	public byte[] aByteArray3291;
	public short aShort3292;
	public short aShort3293;
	public byte aByte3294;
	public int anInt3295;
	public short aShort3296;
	Class14 aClass14_3297;
	public boolean aBool3298;
	public static final int anInt3299 = 1;
	public int anInt3300;
	public int anInt3301;
	public int anInt3302;
	public int[] anIntArray3303;
	public int anInt3304;
	byte[] aByteArray3305;
	public int anInt3306;
	public int anInt3307;
	public boolean aBool3308;
	public int anInt3309;
	public Class682 aClass682_3310;
	int anInt3311;
	public boolean aBool3312;
	public byte aByte3313;
	public String name = "null";
	public Class430 aClass430_3315;
	static final int anInt3316 = 6;
	public short[] aShortArray3317;
	public int anInt3318;
	public boolean aBool3319;
	public int anInt3320;
	public static final int anInt3321 = 2;

	public final Class167 method5483(Class178 class178, int i, Interface19 interface19, Interface17 interface17, Class707 class707, Class302 class302, int i_0_) {
		if (anIntArray3286 != null) {
			NPCDefinition class300_1_ = method5490(interface19, interface17, (byte) 23);
			if (class300_1_ == null)
				return null;
			return class300_1_.method5483(class178, i, interface19, interface17, class707, class302, 2126224164);
		}
		if (anIntArray3256 == null && (class302 == null || null == class302.anIntArray3332))
			return null;
		int i_2_ = i;
		if (class707 != null)
			i_2_ |= class707.method14173(237080258);
		long l = (long) (anInt3252 * -1469093515 | -1144788131 * class178.anInt1922 << 16);
		if (class302 != null)
			l |= -83647787934657435L * class302.aLong3337 << 24;
		Class167 class167;
		synchronized (aClass297_3264.aClass209_3190) {
			class167 = (Class167) aClass297_3264.aClass209_3190.method3767(l);
		}
		if (null == class167 || (class167.method2683() & i_2_) != i_2_) {
			if (null != class167)
				i_2_ |= class167.method2683();
			int i_3_ = i_2_;
			if (aShortArray3259 != null)
				i_3_ |= 0x4000;
			if (aShortArray3262 != null)
				i_3_ |= 0x8000;
			if (0 != aByte3289)
				i_3_ |= 0x80000;
			int[] is = (class302 != null && class302.anIntArray3332 != null ? class302.anIntArray3332 : anIntArray3256);
			boolean bool = false;
			synchronized (aClass297_3264.aClass472_3188) {
				for (int i_4_ = 0; i_4_ < is.length; i_4_++) {
					if (!aClass297_3264.aClass472_3188.method7663(is[i_4_], 0, 1089230115))
						bool = true;
				}
			}
			if (bool)
				return null;
			Class179[] class179s = new Class179[is.length];
			synchronized (aClass297_3264.aClass472_3188) {
				for (int i_5_ = 0; i_5_ < is.length; i_5_++)
					class179s[i_5_] = Class179.method3485(aClass297_3264.aClass472_3188, is[i_5_], 0);
			}
			for (int i_6_ = 0; i_6_ < is.length; i_6_++) {
				if (class179s[i_6_] != null && class179s[i_6_].anInt1952 < 13)
					class179s[i_6_].method3494(2);
			}
			Class179 class179;
			if (class179s.length == 1)
				class179 = class179s[0];
			else
				class179 = new Class179(class179s, class179s.length);
			class167 = class178.method3115(class179, i_3_, 214717661 * aClass297_3264.anInt3191, 64, 768);
			if (aShortArray3259 != null) {
				short[] is_7_;
				if (null != class302 && null != class302.aShortArray3336)
					is_7_ = class302.aShortArray3336;
				else
					is_7_ = aShortArray3317;
				for (int i_8_ = 0; i_8_ < aShortArray3259.length; i_8_++) {
					if (null != aByteArray3305 && i_8_ < aByteArray3305.length)
						class167.method2725(aShortArray3259[i_8_], (aShortArray3249[aByteArray3305[i_8_] & 0xff]));
					else
						class167.method2725(aShortArray3259[i_8_], is_7_[i_8_]);
				}
			}
			if (null != aShortArray3262) {
				short[] is_9_;
				if (null != class302 && class302.aShortArray3333 != null)
					is_9_ = class302.aShortArray3333;
				else
					is_9_ = aShortArray3263;
				for (int i_10_ = 0; i_10_ < aShortArray3262.length; i_10_++)
					class167.method2826(aShortArray3262[i_10_], is_9_[i_10_]);
			}
			if (0 != aByte3289)
				class167.method2839(aByte3266, aByte3267, aByte3268, aByte3289 & 0xff);
			class167.method2769(i_2_);
			synchronized (aClass297_3264.aClass209_3190) {
				aClass297_3264.aClass209_3190.method3770(class167, l);
			}
		}
		if (class707 != null) {
			class167 = class167.method2681((byte) 1, i_2_, true);
			class707.method14229(class167, 0, 1724281515);
		}
		class167.method2769(i);
		return class167;
	}

	public void readValues(RSBuffer class523_sub34, int i) {
		for (;;) {
			int i_11_ = class523_sub34.readUnsignedByte(62170807);
			if (0 == i_11_)
				break;
			decode(class523_sub34, i_11_, -129466517);
		}
	}

	public final Class167 method5484(Class178 class178, int i, Class53_Sub17 class53_sub17, Interface19 interface19, Interface17 interface17, Class707 class707, Class707 class707_12_, Class707[] class707s, int[] is, int i_13_, Class302 class302) {
		return method5506(class178, i, class53_sub17, interface19, interface17, class707, class707_12_, class707s, is, i_13_, class302, -764434723 * anInt3258, true, (short) -12127);
	}

	public void method74(byte i) {
		if (anIntArray3255 == null)
			anIntArray3255 = new int[0];
		if (-1 == aByte3250) {
			if (null == aClass297_3264 || Class681.aClass681_8646 == aClass297_3264.aClass681_3192)
				aByte3250 = (byte) 1;
			else
				aByte3250 = (byte) 0;
		}
	}

	public void method60(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-382675155);
			if (0 == i)
				break;
			decode(class523_sub34, i, 1284500625);
		}
	}

	public int method5485(int i, int i_14_) {
		if (null == anIntArray3253)
			return -1;
		return anIntArray3253[i];
	}

	public int method5486(int i) {
		if (null == anIntArray3253)
			return -1;
		return anIntArray3253[i];
	}

	public final boolean method5487(int i) {
		if (null == anIntArray3255)
			return true;
		boolean bool = true;
		int[] is = anIntArray3255;
		for (int i_15_ = 0; i_15_ < is.length; i_15_++) {
			int i_16_ = is[i_15_];
			if (!aClass297_3264.aClass472_3188.method7663(i_16_, 0, 1089230115))
				bool = false;
		}
		return bool;
	}

	public int method5488(int i, int i_17_, int i_18_) {
		if (null == aClass14_3297)
			return i_17_;
		Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass14_3297.getFromIndex((long) i);
		if (null == class523_sub24)
			return i_17_;
		return class523_sub24.anInt10542 * -677457577;
	}

	public String method5489(int i, String string, byte i_19_) {
		if (aClass14_3297 == null)
			return string;
		Class523_Sub28 class523_sub28 = (Class523_Sub28) aClass14_3297.getFromIndex((long) i);
		if (null == class523_sub28)
			return string;
		return (String) class523_sub28.anObject10554;
	}

	public final NPCDefinition method5490(Interface19 interface19, Interface17 interface17, byte i) {
		int i_20_ = -1;
		if (-1 != -1756149059 * anInt3311) {
			VarBitDefinitions class309 = interface19.method106(anInt3311 * -1756149059, -1259465803);
			if (null != class309)
				i_20_ = interface17.method93(class309, -1707383740);
		} else if (-1 != -2141728441 * anInt3288) {
			Class159 class159 = interface19.method110(VarDomainType.PLAYER_CONFIGS, -2141728441 * anInt3288, 1517642402);
			if (class159 != null)
				i_20_ = interface17.method94(class159, -2051718130);
		}
		if (i_20_ < 0 || i_20_ >= anIntArray3286.length - 1) {
			int i_21_ = anIntArray3286[anIntArray3286.length - 1];
			if (i_21_ != -1)
				return ((NPCDefinition) anInterface12_3251.getDefinition(i_21_, (byte) -60));
			return null;
		}
		if (-1 == anIntArray3286[i_20_])
			return null;
		return (NPCDefinition) anInterface12_3251.getDefinition(anIntArray3286[i_20_], (byte) -43);
	}

	public boolean method5491(Interface19 interface19, Interface17 interface17, byte i) {
		if (anIntArray3286 == null)
			return true;
		int i_22_ = -1;
		if (-1 != anInt3311 * -1756149059) {
			VarBitDefinitions class309 = interface19.method106(-1756149059 * anInt3311, -437765189);
			if (class309 != null)
				i_22_ = interface17.method93(class309, -1386595128);
		} else if (-1 != anInt3288 * -2141728441) {
			Class159 class159 = interface19.method110(VarDomainType.PLAYER_CONFIGS, anInt3288 * -2141728441, 1398509566);
			if (null != class159)
				i_22_ = interface17.method94(class159, -1648276789);
		}
		if (i_22_ < 0 || i_22_ >= anIntArray3286.length - 1) {
			int i_23_ = anIntArray3286[anIntArray3286.length - 1];
			if (-1 != i_23_)
				return true;
			return false;
		}
		if (anIntArray3286[i_22_] == -1)
			return false;
		return true;
	}

	public boolean method5492(byte i) {
		if (anIntArray3286 == null)
			return (-1 != -1238207029 * anInt3301 || -1 != 76076617 * anInt3261 || -1 != 710999717 * anInt3304);
		for (int i_24_ = 0; i_24_ < anIntArray3286.length; i_24_++) {
			if (-1 != anIntArray3286[i_24_]) {
				NPCDefinition class300_25_ = ((NPCDefinition) anInterface12_3251.getDefinition(anIntArray3286[i_24_], (byte) -118));
				if (-1238207029 * class300_25_.anInt3301 != -1 || -1 != 76076617 * class300_25_.anInt3261 || -1 != 710999717 * class300_25_.anInt3304)
					return true;
			}
		}
		return false;
	}

	public final Class167 method5493(Class178 class178, int i, Class53_Sub17 class53_sub17, Interface19 interface19, Interface17 interface17, Class707 class707, Class707 class707_26_, Class707[] class707s, int[] is, int i_27_, Class302 class302, byte i_28_) {
		return method5506(class178, i, class53_sub17, interface19, interface17, class707, class707_26_, class707s, is, i_27_, class302, -764434723 * anInt3258, true, (short) -158);
	}

	public void method75(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-2081358174);
			if (0 == i)
				break;
			decode(class523_sub34, i, -556901662);
		}
	}

	public void method76(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-922994249);
			if (0 == i)
				break;
			decode(class523_sub34, i, -1560451163);
		}
	}

	public final NPCDefinition method5494(Interface19 interface19, Interface17 interface17) {
		int i = -1;
		if (-1 != -1756149059 * anInt3311) {
			VarBitDefinitions class309 = interface19.method106(anInt3311 * -1756149059, -1579963589);
			if (null != class309)
				i = interface17.method93(class309, -339941888);
		} else if (-1 != -2141728441 * anInt3288) {
			Class159 class159 = interface19.method110(VarDomainType.PLAYER_CONFIGS, -2141728441 * anInt3288, 1867374254);
			if (class159 != null)
				i = interface17.method94(class159, -1969670573);
		}
		if (i < 0 || i >= anIntArray3286.length - 1) {
			int i_29_ = anIntArray3286[anIntArray3286.length - 1];
			if (i_29_ != -1)
				return ((NPCDefinition) anInterface12_3251.getDefinition(i_29_, (byte) -66));
			return null;
		}
		if (-1 == anIntArray3286[i])
			return null;
		return ((NPCDefinition) anInterface12_3251.getDefinition(anIntArray3286[i], (byte) -26));
	}

	public void method63(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-482322130);
			if (0 == i)
				break;
			decode(class523_sub34, i, -1708299184);
		}
	}

	public final NPCDefinition method5495(Interface19 interface19, Interface17 interface17) {
		int i = -1;
		if (-1 != -1756149059 * anInt3311) {
			VarBitDefinitions class309 = interface19.method106(anInt3311 * -1756149059, -763386317);
			if (null != class309)
				i = interface17.method93(class309, -479651676);
		} else if (-1 != -2141728441 * anInt3288) {
			Class159 class159 = interface19.method110(VarDomainType.PLAYER_CONFIGS, -2141728441 * anInt3288, 1343143648);
			if (class159 != null)
				i = interface17.method94(class159, -1430585757);
		}
		if (i < 0 || i >= anIntArray3286.length - 1) {
			int i_30_ = anIntArray3286[anIntArray3286.length - 1];
			if (i_30_ != -1)
				return ((NPCDefinition) anInterface12_3251.getDefinition(i_30_, (byte) -4));
			return null;
		}
		if (-1 == anIntArray3286[i])
			return null;
		return ((NPCDefinition) anInterface12_3251.getDefinition(anIntArray3286[i], (byte) -3));
	}

	public void method58(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-445239356);
			if (0 == i)
				break;
			decode(class523_sub34, i, -348006725);
		}
	}

	public void method78() {
		if (anIntArray3255 == null)
			anIntArray3255 = new int[0];
		if (-1 == aByte3250) {
			if (null == aClass297_3264 || Class681.aClass681_8646 == aClass297_3264.aClass681_3192)
				aByte3250 = (byte) 1;
			else
				aByte3250 = (byte) 0;
		}
	}

	public void method79() {
		if (anIntArray3255 == null)
			anIntArray3255 = new int[0];
		if (-1 == aByte3250) {
			if (null == aClass297_3264 || Class681.aClass681_8646 == aClass297_3264.aClass681_3192)
				aByte3250 = (byte) 1;
			else
				aByte3250 = (byte) 0;
		}
	}

	public void method77() {
		if (anIntArray3255 == null)
			anIntArray3255 = new int[0];
		if (-1 == aByte3250) {
			if (null == aClass297_3264 || Class681.aClass681_8646 == aClass297_3264.aClass681_3192)
				aByte3250 = (byte) 1;
			else
				aByte3250 = (byte) 0;
		}
	}

	public final Class167 method5498(Class178 class178, int i, Class53_Sub17 class53_sub17, Interface19 interface19, Interface17 interface17, Class707 class707, Class707 class707_78_, Class707[] class707s, int[] is, int i_79_, Class302 class302) {
		return method5506(class178, i, class53_sub17, interface19, interface17, class707, class707_78_, class707s, is, i_79_, class302, -764434723 * anInt3258, true, (short) -16769);
	}

	public final Class167 method5499(Class178 class178, int i, Class53_Sub17 class53_sub17, Interface19 interface19, Interface17 interface17, Class707 class707, Class707 class707_80_, Class707[] class707s, int[] is, int i_81_, Class302 class302) {
		return method5506(class178, i, class53_sub17, interface19, interface17, class707, class707_80_, class707s, is, i_81_, class302, -764434723 * anInt3258, true, (short) -8716);
	}

	public String method5500(int i, String string) {
		if (aClass14_3297 == null)
			return string;
		Class523_Sub28 class523_sub28 = (Class523_Sub28) aClass14_3297.getFromIndex((long) i);
		if (null == class523_sub28)
			return string;
		return (String) class523_sub28.anObject10554;
	}

	NPCDefinition(int i, Class297 class297, Interface12 interface12) {
		anInt3260 = 1192827717;
		anInt3258 = -172712309;
		aByte3289 = (byte) 0;
		anInt3272 = -659767971;
		aBool3273 = true;
		anInt3295 = -42157745;
		anInt3275 = -1727713408;
		anInt3276 = 509903744;
		aBool3277 = false;
		aBool3312 = false;
		aBool3290 = false;
		anInt3254 = 0;
		anInt3281 = 0;
		anIntArray3282 = null;
		aShortArray3283 = null;
		anInt3284 = 1116197333;
		anInt3285 = -1933431776;
		anInt3311 = 374112107;
		anInt3288 = 805271433;
		aBool3287 = true;
		aBool3298 = true;
		aBool3269 = true;
		aShort3292 = (short) 0;
		aShort3293 = (short) 0;
		aByte3294 = (byte) -96;
		aByte3265 = (byte) -16;
		aShort3296 = (short) -1;
		aByte3247 = (byte) 0;
		aByte3313 = (byte) 0;
		anInt3301 = -1996163043;
		anInt3302 = 157573163;
		anInt3261 = 832635911;
		anInt3304 = 1948862163;
		anInt3271 = 0;
		anInt3306 = 0;
		anInt3307 = 1289591645;
		anInt3309 = -759058245;
		aClass682_3310 = Class682.aClass682_8651;
		anInt3279 = 431331547;
		aByte3250 = (byte) -1;
		anInt3274 = 1136426615;
		anInt3278 = 113348352;
		anInt3300 = -583247616;
		anInt3318 = 0;
		aBool3319 = true;
		anInt3320 = 0;
		aBool3308 = false;
		anInt3252 = 1452629725 * i;
		aClass297_3264 = class297;
		anInterface12_3251 = interface12;
		aStringArray3270 = (String[]) aClass297_3264.aStringArray3186.clone();
	}

	public final boolean method5503() {
		if (null == anIntArray3255)
			return true;
		boolean bool = true;
		int[] is = anIntArray3255;
		for (int i = 0; i < is.length; i++) {
			int i_123_ = is[i];
			if (!aClass297_3264.aClass472_3188.method7663(i_123_, 0, 1089230115))
				bool = false;
		}
		return bool;
	}

	public final boolean method5504() {
		if (null == anIntArray3255)
			return true;
		boolean bool = true;
		int[] is = anIntArray3255;
		for (int i = 0; i < is.length; i++) {
			int i_124_ = is[i];
			if (!aClass297_3264.aClass472_3188.method7663(i_124_, 0, 1089230115))
				bool = false;
		}
		return bool;
	}

	public int method5505(int i, int i_125_) {
		if (null == aClass14_3297)
			return i_125_;
		Class523_Sub24 class523_sub24 = (Class523_Sub24) aClass14_3297.getFromIndex((long) i);
		if (null == class523_sub24)
			return i_125_;
		return class523_sub24.anInt10542 * -677457577;
	}

	public final Class167 method5506(Class178 class178, int i, Class53_Sub17 class53_sub17, Interface19 interface19, Interface17 interface17, Class707 class707, Class707 class707_126_, Class707[] class707s, int[] is, int i_127_, Class302 class302, int i_128_, boolean bool, short i_129_) {
		if (null != anIntArray3286) {
			NPCDefinition class300_130_ = method5490(interface19, interface17, (byte) -21);
			if (class300_130_ == null)
				return null;
			return class300_130_.method5506(class178, i, class53_sub17, interface19, interface17, class707, class707_126_, class707s, is, i_127_, class302, i_128_, bool, (short) -28526);
		}
		int i_131_ = i;
		if (1362777271 * anInt3276 != 128)
			i_131_ |= 0x2;
		if (128 != -687025761 * anInt3275)
			i_131_ |= 0x5;
		boolean bool_132_ = false;
		int i_133_ = null != class707s ? class707s.length : 0;
		for (int i_134_ = 0; i_134_ < i_133_; i_134_++) {
			if (null != class707s[i_134_]) {
				i_131_ |= class707s[i_134_].method14173(832325776);
				bool_132_ = true;
			}
		}
		if (class707 != null) {
			i_131_ |= class707.method14173(-1628118873);
			bool_132_ = true;
		}
		if (null != class707_126_) {
			i_131_ |= class707_126_.method14173(1926939636);
			bool_132_ = true;
		}
		long l = (long) (-1469093515 * anInt3252 | class178.anInt1922 * -1144788131 << 16);
		if (null != class302)
			l |= class302.aLong3337 * -83647787934657435L << 24;
		Class167 class167;
		synchronized (aClass297_3264.aClass209_3189) {
			class167 = (Class167) aClass297_3264.aClass209_3189.method3767(l);
		}
		Class588 class588 = null;
		if (!bool && i_128_ != -1)
			class588 = (Class588) class53_sub17.getDefinition(i_128_, (byte) -64);
		else if (-1 != -764434723 * anInt3258)
			class588 = (Class588) class53_sub17.getDefinition(-764434723 * anInt3258, (byte) 42);
		if (null == class167 || (class167.method2683() & i_131_) != i_131_) {
			if (null != class167)
				i_131_ |= class167.method2683();
			int i_135_ = i_131_;
			if (aShortArray3259 != null)
				i_135_ |= 0x4000;
			if (aShortArray3262 != null)
				i_135_ |= 0x8000;
			if (aByte3289 != 0)
				i_135_ |= 0x80000;
			int[] is_136_ = (null != class302 && class302.anIntArray3332 != null ? class302.anIntArray3332 : anIntArray3255);
			boolean bool_137_ = false;
			synchronized (aClass297_3264.aClass472_3188) {
				for (int i_138_ = 0; i_138_ < is_136_.length; i_138_++) {
					if (is_136_[i_138_] != -1 && !aClass297_3264.aClass472_3188.method7663(is_136_[i_138_], 0, 1089230115))
						bool_137_ = true;
				}
			}
			if (bool_137_)
				return null;
			Class179[] class179s = new Class179[is_136_.length];
			for (int i_139_ = 0; i_139_ < is_136_.length; i_139_++) {
				if (-1 != is_136_[i_139_]) {
					synchronized (aClass297_3264.aClass472_3188) {
						class179s[i_139_] = Class179.method3485((aClass297_3264.aClass472_3188), is_136_[i_139_], 0);
					}
					if (class179s[i_139_] != null) {
						if (class179s[i_139_].anInt1952 < 13)
							class179s[i_139_].method3494(2);
						if (null != anIntArrayArray3257 && null != anIntArrayArray3257[i_139_])
							class179s[i_139_].method3492(anIntArrayArray3257[i_139_][0], anIntArrayArray3257[i_139_][1], anIntArrayArray3257[i_139_][2]);
					}
				}
			}
			if (null != class302) {
				for (int i_140_ = 0; i_140_ < class179s.length; i_140_++) {
					if (class179s[i_140_] != null) {
						if (class302.aFloatArray3331 != null && class302.aFloatArray3331[i_140_] != 0.0F)
							class179s[i_140_].method3495(class302.aFloatArray3331[i_140_]);
						if (null != class302.anIntArrayArray3334)
							class179s[i_140_].method3493(class302.anIntArrayArray3334[i_140_][0], class302.anIntArrayArray3334[i_140_][1], class302.anIntArrayArray3334[i_140_][2]);
						if (null != class302.anIntArrayArray3335)
							class179s[i_140_].method3492(class302.anIntArrayArray3335[i_140_][0], class302.anIntArrayArray3335[i_140_][1], class302.anIntArrayArray3335[i_140_][2]);
					}
				}
			}
			if (class588 != null && class588.anIntArrayArray7776 != null) {
				for (int i_141_ = 0; i_141_ < class588.anIntArrayArray7776.length; i_141_++) {
					if (i_141_ < class179s.length && null != class179s[i_141_]) {
						int i_142_ = 0;
						int i_143_ = 0;
						int i_144_ = 0;
						int i_145_ = 0;
						int i_146_ = 0;
						int i_147_ = 0;
						if (class588.anIntArrayArray7776[i_141_] != null) {
							i_142_ = class588.anIntArrayArray7776[i_141_][0];
							i_143_ = class588.anIntArrayArray7776[i_141_][1];
							i_144_ = class588.anIntArrayArray7776[i_141_][2];
							i_145_ = class588.anIntArrayArray7776[i_141_][3] << 3;
							i_146_ = class588.anIntArrayArray7776[i_141_][4] << 3;
							i_147_ = class588.anIntArrayArray7776[i_141_][5] << 3;
						}
						if (i_145_ != 0 || i_146_ != 0 || i_147_ != 0)
							class179s[i_141_].method3493(i_145_, i_146_, i_147_);
						if (i_142_ != 0 || 0 != i_143_ || 0 != i_144_)
							class179s[i_141_].method3492(i_142_, i_143_, i_144_);
					}
				}
			}
			Class179 class179;
			if (1 == class179s.length)
				class179 = class179s[0];
			else
				class179 = new Class179(class179s, class179s.length);
			class167 = class178.method3115(class179, i_135_, 214717661 * aClass297_3264.anInt3191, anInt3254 * 1886276473 + 64, anInt3281 * -1643327015 + 850);
			if (null != aShortArray3259) {
				short[] is_148_;
				if (null != class302 && class302.aShortArray3336 != null)
					is_148_ = class302.aShortArray3336;
				else
					is_148_ = aShortArray3317;
				for (int i_149_ = 0; i_149_ < aShortArray3259.length; i_149_++) {
					if (null != aByteArray3305 && i_149_ < aByteArray3305.length)
						class167.method2725(aShortArray3259[i_149_], (aShortArray3249[aByteArray3305[i_149_] & 0xff]));
					else
						class167.method2725(aShortArray3259[i_149_], is_148_[i_149_]);
				}
			}
			if (aShortArray3262 != null) {
				short[] is_150_;
				if (null != class302 && class302.aShortArray3333 != null)
					is_150_ = class302.aShortArray3333;
				else
					is_150_ = aShortArray3263;
				for (int i_151_ = 0; i_151_ < aShortArray3262.length; i_151_++)
					class167.method2826(aShortArray3262[i_151_], is_150_[i_151_]);
			}
			if (aByte3289 != 0)
				class167.method2839(aByte3266, aByte3267, aByte3268, aByte3289 & 0xff);
			class167.method2719();
			class167.method2769(i_131_);
			synchronized (aClass297_3264.aClass209_3189) {
				aClass297_3264.aClass209_3189.method3770(class167, l);
			}
		}
		Class167 class167_152_ = class167.method2681((byte) 4, i_131_, true);
		boolean bool_153_ = false;
		if (null != is) {
			for (int i_154_ = 0; i_154_ < 12; i_154_++) {
				if (-1 != is[i_154_])
					bool_153_ = true;
			}
		}
		if (!bool_132_ && !bool_153_)
			return class167_152_;
		Class435[] class435s = null;
		if (class588 != null)
			class435s = class588.method9724(-2139896504);
		if (bool_153_ && null != class435s) {
			for (int i_155_ = 0; i_155_ < 12; i_155_++) {
				if (class435s[i_155_] != null)
					class167_152_.method2707(class435s[i_155_], 1 << i_155_, true);
			}
		}
		int i_156_ = 0;
		int i_157_ = 1;
		while (i_156_ < i_133_) {
			if (class707s[i_156_] != null)
				class707s[i_156_].method14175(class167_152_, 0, i_157_, (short) 8448);
			i_156_++;
			i_157_ <<= 1;
		}
		if (bool_153_) {
			for (i_156_ = 0; i_156_ < 12; i_156_++) {
				if (is[i_156_] != -1) {
					i_157_ = is[i_156_] - i_127_;
					i_157_ &= 0x3fff;
					Class435 class435 = new Class435();
					class435.method6855(0.0F, 1.0F, 0.0F, Class433.method6799(i_157_));
					class167_152_.method2707(class435, 1 << i_156_, false);
				}
			}
		}
		if (bool_153_ && null != class435s) {
			for (i_156_ = 0; i_156_ < 12; i_156_++) {
				if (null != class435s[i_156_])
					class167_152_.method2707(class435s[i_156_], 1 << i_156_, false);
			}
		}
		if (null != class707 && null != class707_126_)
			BodyDefinitions.method10329(class167_152_, class707, class707_126_, (byte) -88);
		else if (class707 != null)
			class707.method14229(class167_152_, 0, 1953388535);
		else if (class707_126_ != null)
			class707_126_.method14229(class167_152_, 0, 1898970816);
		if (-687025761 * anInt3275 != 128 || anInt3276 * 1362777271 != 128)
			class167_152_.method2691(-687025761 * anInt3275, 1362777271 * anInt3276, anInt3275 * -687025761);
		class167_152_.method2769(i);
		return class167_152_;
	}

	public String method5507(int i, String string) {
		if (aClass14_3297 == null)
			return string;
		Class523_Sub28 class523_sub28 = (Class523_Sub28) aClass14_3297.getFromIndex((long) i);
		if (null == class523_sub28)
			return string;
		return (String) class523_sub28.anObject10554;
	}

	public void readValues(RSBuffer buffer) {
		for (;;) {
			int opcode = buffer.readUnsignedByte(1110536590);
			if (0 == opcode)
				break;
			decode(buffer, opcode, 2112284896);
		}
	}

	void decode(RSBuffer buffer, int opcode, int i_158_) {
		if (1 == opcode) {
			int i_159_ = buffer.readUnsignedByte(1483940870);
			anIntArray3255 = new int[i_159_];
			for (int i_160_ = 0; i_160_ < i_159_; i_160_++)
				anIntArray3255[i_160_] = buffer.readBigSmart((byte) -108);
		} else if (opcode == 2)
			name = buffer.readString(-1050487765);
		else if (12 == opcode)
			anInt3260 = buffer.readUnsignedByte(49524681) * 1192827717;
		else if (opcode >= 30 && opcode < 35)
			aStringArray3270[opcode - 30] = buffer.readString(-200167530);
		else if (40 == opcode) {
			int i_161_ = buffer.readUnsignedByte(-593550760);
			aShortArray3259 = new short[i_161_];
			aShortArray3317 = new short[i_161_];
			for (int i_162_ = 0; i_162_ < i_161_; i_162_++) {
				aShortArray3259[i_162_] = (short) buffer.readUnsignedShort(-89716259);
				aShortArray3317[i_162_] = (short) buffer.readUnsignedShort(-1143401917);
			}
		} else if (41 == opcode) {
			int i_163_ = buffer.readUnsignedByte(-207982674);
			aShortArray3262 = new short[i_163_];
			aShortArray3263 = new short[i_163_];
			for (int i_164_ = 0; i_164_ < i_163_; i_164_++) {
				aShortArray3262[i_164_] = (short) buffer.readUnsignedShort(-1194291299);
				aShortArray3263[i_164_] = (short) buffer.readUnsignedShort(-1137579518);
			}
		} else if (opcode == 42) {
			int i_165_ = buffer.readUnsignedByte(664026543);
			aByteArray3305 = new byte[i_165_];
			for (int i_166_ = 0; i_166_ < i_165_; i_166_++)
				aByteArray3305[i_166_] = buffer.readByte((short) -7149);
		} else if (opcode == 44) {
			int i_167_ = buffer.readUnsignedShort(-1114407563);
			int i_168_ = 0;
			for (int i_169_ = i_167_; i_169_ > 0; i_169_ >>= 1)
				i_168_++;
			aByteArray3291 = new byte[i_168_];
			byte i_170_ = 0;
			for (int i_171_ = 0; i_171_ < i_168_; i_171_++) {
				if ((i_167_ & 1 << i_171_) > 0) {
					aByteArray3291[i_171_] = i_170_;
					i_170_++;
				} else
					aByteArray3291[i_171_] = (byte) -1;
			}
		} else if (45 == opcode) {
			int i_172_ = buffer.readUnsignedShort(-1204914889);
			int i_173_ = 0;
			for (int i_174_ = i_172_; i_174_ > 0; i_174_ >>= 1)
				i_173_++;
			aByteArray3280 = new byte[i_173_];
			byte i_175_ = 0;
			for (int i_176_ = 0; i_176_ < i_173_; i_176_++) {
				if ((i_172_ & 1 << i_176_) > 0) {
					aByteArray3280[i_176_] = i_175_;
					i_175_++;
				} else
					aByteArray3280[i_176_] = (byte) -1;
			}
		} else if (opcode == 60) {
			int i_177_ = buffer.readUnsignedByte(94778174);
			anIntArray3256 = new int[i_177_];
			for (int i_178_ = 0; i_178_ < i_177_; i_178_++)
				anIntArray3256[i_178_] = buffer.readBigSmart((byte) -59);
		} else if (opcode == 93)
			aBool3273 = false;
		else if (opcode == 95)
			anInt3295 = buffer.readUnsignedShort(-2128882520) * 42157745;
		else if (97 == opcode)
			anInt3275 = buffer.readUnsignedShort(-1080392483) * -1624110497;
		else if (opcode == 98)
			anInt3276 = buffer.readUnsignedShort(-186436289) * -532887289;
		else if (99 == opcode)
			aBool3277 = true;
		else if (opcode == 100)
			anInt3254 = buffer.readByte((short) -6151) * -1446039863;
		else if (101 == opcode)
			anInt3281 = buffer.readByte((short) -25352) * -638248947;
		else if (opcode == 102) {
			int i_179_ = buffer.readUnsignedByte(-1476043191);
			int i_180_ = 0;
			for (int i_181_ = i_179_; 0 != i_181_; i_181_ >>= 1)
				i_180_++;
			anIntArray3282 = new int[i_180_];
			aShortArray3283 = new short[i_180_];
			for (int i_182_ = 0; i_182_ < i_180_; i_182_++) {
				if (0 == (i_179_ & 1 << i_182_)) {
					anIntArray3282[i_182_] = -1;
					aShortArray3283[i_182_] = (short) -1;
				} else {
					anIntArray3282[i_182_] = buffer.readBigSmart((byte) -105);
					aShortArray3283[i_182_] = (short) buffer.readUnsignedSmart((short) -27913);
				}
			}
		} else if (opcode == 103)
			anInt3285 = buffer.readUnsignedShort(-821693461) * -1268379295;
		else if (106 == opcode || opcode == 118) {
			anInt3311 = buffer.readUnsignedShort(-102300676) * -374112107;
			if (65535 == -1756149059 * anInt3311)
				anInt3311 = 374112107;
			anInt3288 = buffer.readUnsignedShort(-1953043807) * -805271433;
			if (-2141728441 * anInt3288 == 65535)
				anInt3288 = 805271433;
			int i_183_ = -1;
			if (118 == opcode) {
				i_183_ = buffer.readUnsignedShort(-1932176104);
				if (65535 == i_183_)
					i_183_ = -1;
			}
			int i_184_ = buffer.readUnsignedByte(1745390572);
			anIntArray3286 = new int[2 + i_184_];
			for (int i_185_ = 0; i_185_ <= i_184_; i_185_++) {
				anIntArray3286[i_185_] = buffer.readUnsignedShort(-2053681112);
				if (anIntArray3286[i_185_] == 65535)
					anIntArray3286[i_185_] = -1;
			}
			anIntArray3286[i_184_ + 1] = i_183_;
		} else if (107 == opcode)
			aBool3287 = false;
		else if (109 == opcode)
			aBool3298 = false;
		else if (111 == opcode)
			aBool3269 = false;
		else if (opcode == 113) {
			aShort3292 = (short) buffer.readUnsignedShort(-1860648156);
			aShort3293 = (short) buffer.readUnsignedShort(-1413490820);
		} else if (opcode == 114) {
			aByte3294 = buffer.readByte((short) -21149);
			aByte3265 = buffer.readByte((short) -5048);
		} else if (119 == opcode)
			aByte3313 = buffer.readByte((short) -428);
		else if (opcode == 121) {
			anIntArrayArray3257 = new int[anIntArray3255.length][];
			int i_186_ = buffer.readUnsignedByte(140751556);
			for (int i_187_ = 0; i_187_ < i_186_; i_187_++) {
				int i_188_ = buffer.readUnsignedByte(-1554129768);
				int[] is = anIntArrayArray3257[i_188_] = new int[3];
				is[0] = buffer.readByte((short) -14259);
				is[1] = buffer.readByte((short) -22755);
				is[2] = buffer.readByte((short) -19370);
			}
		} else if (opcode == 123)
			anInt3309 = buffer.readUnsignedShort(-1476104936) * 759058245;
		else if (125 == opcode)
			aClass682_3310 = ((Class682) Class334.method5910(Class511.method8566(1500154536), buffer.readByte((short) -9107), 242009415));
		else if (127 == opcode)
			anInt3258 = buffer.readUnsignedShort(-306917967) * 172712309;
		else if (opcode == 128)
			Class334.method5910(Class666.method13653((byte) 63), buffer.readUnsignedByte(-1824616075), 1595609658);
		else if (134 == opcode) {
			anInt3301 = buffer.readUnsignedShort(-743567539) * 1996163043;
			if (65535 == -1238207029 * anInt3301)
				anInt3301 = -1996163043;
			anInt3302 = buffer.readUnsignedShort(-213267122) * -157573163;
			if (1501995389 * anInt3302 == 65535)
				anInt3302 = 157573163;
			anInt3261 = buffer.readUnsignedShort(-481107238) * -832635911;
			if (anInt3261 * 76076617 == 65535)
				anInt3261 = 832635911;
			anInt3304 = buffer.readUnsignedShort(-481380132) * -1948862163;
			if (710999717 * anInt3304 == 65535)
				anInt3304 = 1948862163;
			anInt3271 = buffer.readUnsignedByte(1108206433) * -2001414325;
		} else if (opcode == 135 || opcode == 136) {
			buffer.readUnsignedByte(1543380665);
			buffer.readUnsignedShort(-1310847155);
		} else if (opcode == 137)
			anInt3272 = buffer.readUnsignedShort(-1529582797) * 659767971;
		else if (138 == opcode)
			anInt3284 = buffer.readBigSmart((byte) -67) * -1116197333;
		else if (opcode == 140)
			anInt3307 = buffer.readUnsignedByte(1834553456) * -584448093;
		else if (141 == opcode)
			aBool3290 = true;
		else if (142 == opcode)
			anInt3279 = buffer.readUnsignedShort(-668281496) * -431331547;
		else if (opcode == 143)
			aBool3312 = true;
		else if (opcode >= 150 && opcode < 155) {
			aStringArray3270[opcode - 150] = buffer.readString(-1755173838);
			if (!aClass297_3264.aBool3187)
				aStringArray3270[opcode - 150] = null;
		} else if (155 == opcode) {
			aByte3266 = buffer.readByte((short) -3586);
			aByte3267 = buffer.readByte((short) -31191);
			aByte3268 = buffer.readByte((short) -1649);
			aByte3289 = buffer.readByte((short) -13024);
		} else if (158 == opcode)
			aByte3250 = (byte) 1;
		else if (opcode == 159)
			aByte3250 = (byte) 0;
		else if (160 == opcode) {
			int i_189_ = buffer.readUnsignedByte(-54523843);
			anIntArray3303 = new int[i_189_];
			for (int i_190_ = 0; i_190_ < i_189_; i_190_++)
				anIntArray3303[i_190_] = buffer.readUnsignedShort(-1337330913);
		} else if (162 != opcode) {
			if (opcode == 163)
				anInt3274 = buffer.readUnsignedByte(-365790769) * -1136426615;
			else if (164 == opcode) {
				anInt3278 = buffer.readUnsignedShort(-534539240) * 1191625103;
				anInt3300 = buffer.readUnsignedShort(-1686205664) * 1004354649;
			} else if (opcode == 165)
				anInt3318 = buffer.readUnsignedByte(2101519701) * 256371133;
			else if (168 == opcode)
				anInt3306 = buffer.readUnsignedByte(1559444531) * -1561647655;
			else if (opcode == 169)
				aBool3319 = false;
			else if (opcode >= 170 && opcode < 176) {
				if (null == anIntArray3253) {
					anIntArray3253 = new int[6];
					Arrays.fill(anIntArray3253, -1);
				}
				int i_191_ = buffer.readUnsignedShort(-1440865734);
				if (i_191_ == 65535)
					i_191_ = -1;
				anIntArray3253[opcode - 170] = i_191_;
			} else if (178 != opcode) {
				if (179 == opcode) {
					aClass430_3315 = new Class430();
					aClass430_3315.aFloat4855 = (float) buffer.method16487((byte) -86);
					aClass430_3315.aFloat4859 = (float) buffer.method16487((byte) -71);
					aClass430_3315.aFloat4853 = (float) buffer.method16487((byte) -57);
					aClass430_3315.aFloat4854 = (float) buffer.method16487((byte) -91);
					aClass430_3315.aFloat4851 = (float) buffer.method16487((byte) -70);
					aClass430_3315.aFloat4856 = (float) buffer.method16487((byte) -102);
				} else if (opcode == 180)
					anInt3320 = (buffer.readUnsignedByte(-1488991156) & 0xff) * 1393045025;
				else if (181 == opcode) {
					aShort3296 = (short) buffer.readUnsignedShort(-1345203973);
					aByte3247 = (byte) buffer.readUnsignedByte(-1393485620);
				} else if (182 == opcode)
					aBool3308 = true;
				else if (249 == opcode) {
					int i_192_ = buffer.readUnsignedByte(794668207);
					if (null == aClass14_3297) {
						int i_193_ = Class628.method10313(i_192_, -1056134306);
						aClass14_3297 = new Class14(i_193_);
					}
					for (int i_194_ = 0; i_194_ < i_192_; i_194_++) {
						boolean bool = buffer.readUnsignedByte(1439637529) == 1;
						int i_195_ = buffer.read24BitInt(-105681314);
						Class523 class523;
						if (bool)
							class523 = (new Class523_Sub28(buffer.readString(-1256796190)));
						else
							class523 = (new Class523_Sub24(buffer.readUnsignedInt((byte) -64)));
						aClass14_3297.method738(class523, (long) i_195_);
					}
				}
			}
		}
	}

	public boolean method5509(Interface19 interface19, Interface17 interface17) {
		if (anIntArray3286 == null)
			return true;
		int i = -1;
		if (-1 != anInt3311 * -1756149059) {
			VarBitDefinitions class309 = interface19.method106(-1756149059 * anInt3311, -1562411427);
			if (class309 != null)
				i = interface17.method93(class309, -733079975);
		} else if (-1 != anInt3288 * -2141728441) {
			Class159 class159 = interface19.method110(VarDomainType.PLAYER_CONFIGS, anInt3288 * -2141728441, 2147030599);
			if (null != class159)
				i = interface17.method94(class159, -515959660);
		}
		if (i < 0 || i >= anIntArray3286.length - 1) {
			int i_196_ = anIntArray3286[anIntArray3286.length - 1];
			if (-1 != i_196_)
				return true;
			return false;
		}
		if (anIntArray3286[i] == -1)
			return false;
		return true;
	}

	public void method73() {
		if (anIntArray3255 == null)
			anIntArray3255 = new int[0];
		if (-1 == aByte3250) {
			if (null == aClass297_3264 || Class681.aClass681_8646 == aClass297_3264.aClass681_3192)
				aByte3250 = (byte) 1;
			else
				aByte3250 = (byte) 0;
		}
	}

	static void method5510(RSBitBuffer class523_sub34_sub2, int i) {
		boolean bool = class523_sub34_sub2.readUnsignedByte(-1462358382) == 1;
		if (bool) {
			boolean bool_197_ = false;
			int i_198_ = class523_sub34_sub2.method18220(1518609261) << 24;
			i_198_ |= class523_sub34_sub2.method18220(-2028847878) << 16;
			i_198_ |= class523_sub34_sub2.method18220(525045362) << 8;
			i_198_ |= class523_sub34_sub2.method18220(-1604363747);
			Class220.aClass57_2331.method1366((Class176.aLong1857 * -4875073953973370387L), i_198_, -929823142);
		}
	}

	static final void method5511(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class149.method2513(class250, class242, class669, (byte) -82);
	}

	static final void method5512(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub20_10616.method16908(-1698040174) ? 1 : 0;
	}

	static final void method5513(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class669.aClass334_8571.anInt3533 * -1813490907;
	}

	static final void method5514(Class669 class669, byte i) {
		class669.anInt8558 -= -17422498;
		int i_199_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		boolean bool = 1 == (class669.anIntArray8557[1 + class669.anInt8558 * 1357652815]);
		Class221.method4135(i_199_, string, bool, 1755380299);
	}

	static void method5515(Class178 class178, Class602 class602, int i, int i_200_, int i_201_, int i_202_) {
		Class46 class46 = ((Class46) Class334.aClass53_Sub14_3544.getDefinition(573415481 * class602.anInt7890, (byte) 67));
		if (-1 != -1232695553 * class46.anInt667) {
			if (class602.aBool7891) {
				i += class602.anInt7892 * -1708131931;
				i &= 0x3;
			} else
				i = 0;
			Class148 class148 = class46.method1240(class178, i, class602.aBool7893, (byte) 64);
			if (class148 != null) {
				int i_203_ = class602.anInt7871 * -1994552549;
				int i_204_ = -1564896481 * class602.anInt7872;
				if ((i & 0x1) == 1) {
					i_203_ = -1564896481 * class602.anInt7872;
					i_204_ = class602.anInt7871 * -1994552549;
				}
				int i_205_ = class148.method38();
				int i_206_ = class148.method2429();
				if (class46.aBool670) {
					i_205_ = 4 * i_203_;
					i_206_ = 4 * i_204_;
				}
				if (0 != 1857430343 * class46.anInt668)
					class148.method2439(i_200_, i_201_ - (i_204_ - 1) * 4, i_205_, i_206_, 0, (~0xffffff | class46.anInt668 * 1857430343), 1);
				else
					class148.method2438(i_200_, i_201_ - 4 * (i_204_ - 1), i_205_, i_206_);
			}
		}
	}

	static final void method5516(Class669 class669, byte i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		int i_207_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class522.method8658(string, i_207_, 230411589);
	}

	static void method5517(int i, int i_208_, int i_209_, int i_210_, int i_211_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(10, (long) i);
		class523_sub27_sub7.method17963(1076739320);
		class523_sub27_sub7.anInt11653 = i_208_ * -1217347391;
		class523_sub27_sub7.anInt11649 = i_209_ * -254643469;
		class523_sub27_sub7.anInt11665 = -1024048703 * i_210_;
	}
}
