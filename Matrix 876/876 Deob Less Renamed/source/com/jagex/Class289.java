/* Class289 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;

public class Class289 implements Runnable {
	Interface32 anInterface32_3107;
	String aString3108;
	boolean aBool3109;
	volatile boolean aBool3110;
	long aLong3111;
	Interface32 anInterface32_3112 = new Class296();
	long aLong3113;
	String aString3114;
	int anInt3115;
	int anInt3116;
	Class290 aClass290_3117;
	static Interface25 anInterface25_3118;
	static int[] anIntArray3119;
	public static String aString3120;

	void method5168() {
		aBool3110 = true;
	}

	public int method5169() {
		return 1401254831 * anInt3116;
	}

	synchronized void method5170(int i) {
		aBool3109 = true;
	}

	synchronized boolean method5171(byte i) {
		return anInterface32_3112.method196(-6442094405149488907L * aLong3111);
	}

	synchronized void method5172(Interface32 interface32, int i) {
		anInterface32_3107 = anInterface32_3112;
		anInterface32_3112 = interface32;
		aLong3111 = Class248.method4401(1516375036) * -2501391559681776803L;
	}

	synchronized void method5173(long l, String string, String string_0_, int i, Class290 class290, byte i_1_) {
		aLong3113 = l * -8549708702685400907L;
		aString3108 = string;
		aString3114 = string_0_;
		anInt3116 = -1640119473 * i;
		aClass290_3117 = class290;
	}

	public int method5174(byte i) {
		if (null == aClass290_3117)
			return 0;
		int i_2_ = 1533974855 * aClass290_3117.anInt3139;
		if (aClass290_3117.aBool3145 && anInt3116 * 1401254831 < aClass290_3117.anInt3141 * 2000069113)
			return 1401254831 * anInt3116 + 1;
		if (i_2_ < 0 || i_2_ >= Class308.aClass290Array3361.length - 1)
			return 100;
		if (anInt3116 * 1401254831 == aClass290_3117.anInt3142 * 536005863)
			return aClass290_3117.anInt3141 * 2000069113;
		return 536005863 * aClass290_3117.anInt3142;
	}

	public int method5175() {
		return 1401254831 * anInt3116;
	}

	public int method5176() {
		return 1401254831 * anInt3116;
	}

	public String method5177(int i) {
		return aString3108;
	}

	public long method5178(int i) {
		return 4081628257660075421L * aLong3113;
	}

	public Class290 method5179(int i) {
		return aClass290_3117;
	}

	public long method5180() {
		return 4081628257660075421L * aLong3113;
	}

	public void run() {
		while (!aBool3110) {
			long l = Class248.method4401(1516375036);
			synchronized (this) {
				try {
					anInt3115 += -355441607;
					if (anInterface32_3112 instanceof Class296)
						anInterface32_3112.method201(aBool3109, -319632409);
					else {
						long l_3_ = Class248.method4401(1516375036);
						if (null != Class31.aClass178_303 && anInterface32_3107 != null && anInterface32_3107.method197(969102158) != 0 && (-6442094405149488907L * aLong3111 >= l_3_ - (long) anInterface32_3107.method197(1049980923))) {
							int i = (int) ((l_3_ - aLong3111 * -6442094405149488907L) * 255L / (long) anInterface32_3107.method197(685070555));
							int i_4_ = 255 - i;
							i = i << 24 | 0xffffff;
							i_4_ = i_4_ << 24 | 0xffffff;
							Class410.method6632(1389731197);
							Class31.aClass178_303.method3076(1, 0);
							Class148 class148 = (Class31.aClass178_303.method3116(Class170.anInt1833 * 2141365743, -495986435 * Class254.anInt2742, true, -1884815618));
							Class168_Sub1 class168_sub1 = Class31.aClass178_303.method3248();
							class168_sub1.method14424(0, class148.method2430());
							Class31.aClass178_303.method3353(class168_sub1, -1323424545);
							anInterface32_3107.method201(true, -319632409);
							Class31.aClass178_303.method3047(class168_sub1, (short) -11484);
							class148.method2436(0, 0, 0, i_4_, 1);
							Class31.aClass178_303.method3353(class168_sub1, 628746028);
							Class31.aClass178_303.method3076(1, 0);
							anInterface32_3112.method201(true, -319632409);
							Class31.aClass178_303.method3047(class168_sub1, (short) -7956);
							class148.method2436(0, 0, 0, i, 1);
						} else {
							if (anInterface32_3107 != null) {
								aBool3109 = true;
								anInterface32_3107.method195(-2072204904);
								anInterface32_3107 = null;
							}
							if (aBool3109) {
								Class410.method6632(-1166786404);
								if (null != Class31.aClass178_303)
									Class31.aClass178_303.method3076(1, 0);
							}
							anInterface32_3112.method201((aBool3109 || (null != Class31.aClass178_303 && Class31.aClass178_303.method3027())), -319632409);
						}
						try {
							if (Class31.aClass178_303 != null && !(anInterface32_3112 instanceof Class296))
								Class31.aClass178_303.method3019(1725945622);
						} catch (Exception_Sub4 exception_sub4) {
							Class305.method5553(new StringBuilder().append(exception_sub4.getMessage()).append(Class472.aclient5375.method8397((byte) 0)).toString(), exception_sub4, (byte) 1);
							Class535.method8921(0, true, (byte) -50);
						}
					}
					aBool3109 = false;
					if (null != Class31.aClass178_303 && !(anInterface32_3112 instanceof Class296) && (1533974855 * aClass290_3117.anInt3139 < Class290.aClass290_3136.anInt3139 * 1533974855))
						Class318.method5692((byte) 11);
				} catch (Exception exception) {
					continue;
				}
			}
			long l_5_ = Class248.method4401(1516375036);
			int i = (int) (20L - (l_5_ - l));
			if (i > 0)
				Class653.method10656((long) i);
		}
	}

	public void method5181() {
		while (!aBool3110) {
			long l = Class248.method4401(1516375036);
			synchronized (this) {
				try {
					anInt3115 += -355441607;
					if (anInterface32_3112 instanceof Class296)
						anInterface32_3112.method201(aBool3109, -319632409);
					else {
						long l_6_ = Class248.method4401(1516375036);
						if (null != Class31.aClass178_303 && anInterface32_3107 != null && anInterface32_3107.method197(2044756793) != 0 && (-6442094405149488907L * aLong3111 >= l_6_ - (long) anInterface32_3107.method197(1533848414))) {
							int i = (int) ((l_6_ - aLong3111 * -6442094405149488907L) * 255L / (long) anInterface32_3107.method197(20664044));
							int i_7_ = 255 - i;
							i = i << 24 | 0xffffff;
							i_7_ = i_7_ << 24 | 0xffffff;
							Class410.method6632(-1251594356);
							Class31.aClass178_303.method3076(1, 0);
							Class148 class148 = (Class31.aClass178_303.method3116(Class170.anInt1833 * 2141365743, -495986435 * Class254.anInt2742, true, 791296736));
							Class168_Sub1 class168_sub1 = Class31.aClass178_303.method3248();
							class168_sub1.method14424(0, class148.method2430());
							Class31.aClass178_303.method3353(class168_sub1, 382096836);
							anInterface32_3107.method201(true, -319632409);
							Class31.aClass178_303.method3047(class168_sub1, (short) -18928);
							class148.method2436(0, 0, 0, i_7_, 1);
							Class31.aClass178_303.method3353(class168_sub1, 1617843292);
							Class31.aClass178_303.method3076(1, 0);
							anInterface32_3112.method201(true, -319632409);
							Class31.aClass178_303.method3047(class168_sub1, (short) -28990);
							class148.method2436(0, 0, 0, i, 1);
						} else {
							if (anInterface32_3107 != null) {
								aBool3109 = true;
								anInterface32_3107.method195(-2017897910);
								anInterface32_3107 = null;
							}
							if (aBool3109) {
								Class410.method6632(-2053260106);
								if (null != Class31.aClass178_303)
									Class31.aClass178_303.method3076(1, 0);
							}
							anInterface32_3112.method201((aBool3109 || (null != Class31.aClass178_303 && Class31.aClass178_303.method3027())), -319632409);
						}
						try {
							if (Class31.aClass178_303 != null && !(anInterface32_3112 instanceof Class296))
								Class31.aClass178_303.method3019(1834704857);
						} catch (Exception_Sub4 exception_sub4) {
							Class305.method5553(new StringBuilder().append(exception_sub4.getMessage()).append(Class472.aclient5375.method8397((byte) -2)).toString(), exception_sub4, (byte) 1);
							Class535.method8921(0, true, (byte) -88);
						}
					}
					aBool3109 = false;
					if (null != Class31.aClass178_303 && !(anInterface32_3112 instanceof Class296) && (1533974855 * aClass290_3117.anInt3139 < Class290.aClass290_3136.anInt3139 * 1533974855))
						Class318.method5692((byte) -42);
				} catch (Exception exception) {
					continue;
				}
			}
			long l_8_ = Class248.method4401(1516375036);
			int i = (int) (20L - (l_8_ - l));
			if (i > 0)
				Class653.method10656((long) i);
		}
	}

	Class289() {
		anInterface32_3107 = null;
	}

	int method5182() {
		return anInt3115 * -1756083703;
	}

	void method5183(int i) {
		aBool3110 = true;
	}

	public int method5184() {
		return 1401254831 * anInt3116;
	}

	int method5185() {
		return anInt3115 * -1756083703;
	}

	synchronized void method5186() {
		aBool3109 = true;
	}

	int method5187(int i) {
		return anInt3115 * -1756083703;
	}

	public int method5188() {
		if (null == aClass290_3117)
			return 0;
		int i = 1533974855 * aClass290_3117.anInt3139;
		if (aClass290_3117.aBool3145 && anInt3116 * 1401254831 < aClass290_3117.anInt3141 * 2000069113)
			return 1401254831 * anInt3116 + 1;
		if (i < 0 || i >= Class308.aClass290Array3361.length - 1)
			return 100;
		if (anInt3116 * 1401254831 == aClass290_3117.anInt3142 * 536005863)
			return aClass290_3117.anInt3141 * 2000069113;
		return 536005863 * aClass290_3117.anInt3142;
	}

	public int method5189() {
		if (null == aClass290_3117)
			return 0;
		int i = 1533974855 * aClass290_3117.anInt3139;
		if (aClass290_3117.aBool3145 && anInt3116 * 1401254831 < aClass290_3117.anInt3141 * 2000069113)
			return 1401254831 * anInt3116 + 1;
		if (i < 0 || i >= Class308.aClass290Array3361.length - 1)
			return 100;
		if (anInt3116 * 1401254831 == aClass290_3117.anInt3142 * 536005863)
			return aClass290_3117.anInt3141 * 2000069113;
		return 536005863 * aClass290_3117.anInt3142;
	}

	public String method5190(byte i) {
		return aString3114;
	}

	synchronized void method5191() {
		aBool3109 = true;
	}

	int method5192() {
		return anInt3115 * -1756083703;
	}

	public int method5193() {
		return 1401254831 * anInt3116;
	}

	void method5194() {
		aBool3110 = true;
	}

	public String method5195() {
		return aString3108;
	}

	public String method5196() {
		return aString3108;
	}

	public int method5197(byte i) {
		return 1401254831 * anInt3116;
	}

	public Class290 method5198() {
		return aClass290_3117;
	}

	public void method5199() {
		while (!aBool3110) {
			long l = Class248.method4401(1516375036);
			synchronized (this) {
				try {
					anInt3115 += -355441607;
					if (anInterface32_3112 instanceof Class296)
						anInterface32_3112.method201(aBool3109, -319632409);
					else {
						long l_9_ = Class248.method4401(1516375036);
						if (null != Class31.aClass178_303 && anInterface32_3107 != null && anInterface32_3107.method197(1664762423) != 0 && (-6442094405149488907L * aLong3111 >= l_9_ - (long) anInterface32_3107.method197(447624962))) {
							int i = (int) ((l_9_ - aLong3111 * -6442094405149488907L) * 255L / (long) anInterface32_3107.method197(1463768195));
							int i_10_ = 255 - i;
							i = i << 24 | 0xffffff;
							i_10_ = i_10_ << 24 | 0xffffff;
							Class410.method6632(189961417);
							Class31.aClass178_303.method3076(1, 0);
							Class148 class148 = (Class31.aClass178_303.method3116(Class170.anInt1833 * 2141365743, -495986435 * Class254.anInt2742, true, 1809988503));
							Class168_Sub1 class168_sub1 = Class31.aClass178_303.method3248();
							class168_sub1.method14424(0, class148.method2430());
							Class31.aClass178_303.method3353(class168_sub1, 15407352);
							anInterface32_3107.method201(true, -319632409);
							Class31.aClass178_303.method3047(class168_sub1, (short) -22914);
							class148.method2436(0, 0, 0, i_10_, 1);
							Class31.aClass178_303.method3353(class168_sub1, -486884743);
							Class31.aClass178_303.method3076(1, 0);
							anInterface32_3112.method201(true, -319632409);
							Class31.aClass178_303.method3047(class168_sub1, (short) -2591);
							class148.method2436(0, 0, 0, i, 1);
						} else {
							if (anInterface32_3107 != null) {
								aBool3109 = true;
								anInterface32_3107.method195(-1955959926);
								anInterface32_3107 = null;
							}
							if (aBool3109) {
								Class410.method6632(2071663358);
								if (null != Class31.aClass178_303)
									Class31.aClass178_303.method3076(1, 0);
							}
							anInterface32_3112.method201((aBool3109 || (null != Class31.aClass178_303 && Class31.aClass178_303.method3027())), -319632409);
						}
						try {
							if (Class31.aClass178_303 != null && !(anInterface32_3112 instanceof Class296))
								Class31.aClass178_303.method3019(981906001);
						} catch (Exception_Sub4 exception_sub4) {
							Class305.method5553(new StringBuilder().append(exception_sub4.getMessage()).append(Class472.aclient5375.method8397((byte) -9)).toString(), exception_sub4, (byte) 1);
							Class535.method8921(0, true, (byte) -10);
						}
					}
					aBool3109 = false;
					if (null != Class31.aClass178_303 && !(anInterface32_3112 instanceof Class296) && (1533974855 * aClass290_3117.anInt3139 < Class290.aClass290_3136.anInt3139 * 1533974855))
						Class318.method5692((byte) 39);
				} catch (Exception exception) {
					continue;
				}
			}
			long l_11_ = Class248.method4401(1516375036);
			int i = (int) (20L - (l_11_ - l));
			if (i > 0)
				Class653.method10656((long) i);
		}
	}

	public int method5200() {
		return 1401254831 * anInt3116;
	}

	void method5201() {
		aBool3110 = true;
	}

	void method5202() {
		aBool3110 = true;
	}

	void method5203() {
		aBool3110 = true;
	}

	public static void method5204(Class523_Sub34 class523_sub34, int i) {
		byte[] is = new byte[24];
		try {
			Class506.aClass20_5685.method799(0L);
			Class506.aClass20_5685.method801(is, (byte) -95);
			int i_12_;
			for (i_12_ = 0; i_12_ < 24 && 0 == is[i_12_]; i_12_++) {
				/* empty */
			}
			if (i_12_ >= 24)
				throw new IOException();
		} catch (Exception exception) {
			for (int i_13_ = 0; i_13_ < 24; i_13_++)
				is[i_13_] = (byte) -1;
		}
		class523_sub34.readBytes(is, 0, 24, (short) -20705);
	}

	static Class570 method5205(Class523_Sub34 class523_sub34, short i) {
		int i_14_ = class523_sub34.readUnsignedByte(-1486844925);
		int i_15_ = class523_sub34.readUnsignedByte(-2125224153);
		int i_16_ = class523_sub34.readUnsignedByte(1889063005);
		int[] is = new int[i_16_];
		for (int i_17_ = 0; i_17_ < i_16_; i_17_++)
			is[i_17_] = class523_sub34.readUnsignedByte(452420278);
		return new Class570(i_14_, i_15_, is);
	}

	static final void method5206(Class669 class669, int i) {
		int i_18_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		int i_19_ = Class307.method5559(Class80.aClass674_865, Class670.aClass670_8584, i_18_, 1755267611);
		int i_20_ = Class542.method9003(Class80.aClass674_865, Class670.aClass670_8584, i_18_, (byte) -56);
		if (client.anInt11136 * -2020118759 != 0 || Class366.method6324(-2043176385))
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (Class28.method873(i_18_, string, i_19_, i_20_, -762740138) ? 1 : 0);
	}

	static final void method5207(Class669 class669, int i) {
		class669.anInt8558 -= -34844996;
		int i_21_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		boolean bool = 1 == (class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1]);
		int i_22_ = class669.anIntArray8557[2 + class669.anInt8558 * 1357652815];
		boolean bool_23_ = (class669.anIntArray8557[1357652815 * class669.anInt8558 + 3] == 1);
		Class188.method3595(i_21_, bool, i_22_, bool_23_, (short) 256);
	}

	static final void method5208(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class312_Sub2_Sub1.method17946(class250, class242, class669, -327028753);
	}

	static final void method5209(Class669 class669, int i) {
		if (null != Class675.aClass523_Sub19_8632) {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1;
			class669.aClass523_Sub19_8569 = Class675.aClass523_Sub19_8632;
		} else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	static void method5210(Class669 class669, short i) {
		class669.anInt8558 -= -34844996;
		int i_24_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_25_ = class669.anIntArray8557[1 + class669.anInt8558 * 1357652815];
		int i_26_ = class669.anIntArray8557[2 + class669.anInt8558 * 1357652815];
		int i_27_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 3];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class38.method1121(i_24_, i_25_, i_26_, i_27_ != 0, (byte) -47);
	}
}
