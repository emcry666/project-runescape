/* Class308 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class308 {
	static int anInt3354 = 1204765285;
	static Interface32[] anInterface32Array3355;
	static Class290 aClass290_3356;
	static Thread aThread3357;
	static Class82 aClass82_3358;
	static boolean aBool3359 = false;
	static final String aString3360 = " - ";
	static Class290[] aClass290Array3361;
	static int anInt3362 = -681219729;
	static boolean aBool3363;
	public static int anInt3364;

	static void method5560() {
		if (aClass290_3356 != null) {
			Class661.aClass289_8509 = new Class289();
			Class661.aClass289_8509.method5173(-7839201569249075137L * Class85.aLong877, aClass290_3356.aClass39_3140.method1124(Class53_Sub20.aClass668_10979, (byte) -123), aClass290_3356.aClass39_3140.method1124(Class53_Sub20.aClass668_10979, (byte) -4), 536005863 * aClass290_3356.anInt3142, aClass290_3356, (byte) 56);
			aThread3357 = new Thread(Class661.aClass289_8509, "");
			aThread3357.start();
		}
	}

	public static void method5561() {
		if (Class661.aClass289_8509 != null)
			Class661.aClass289_8509.method5183(-800911491);
		if (null != aThread3357) {
			for (;;) {
				try {
					aThread3357.join();
					break;
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
		}
	}

	public static void method5562() {
		aBool3359 = true;
		Class260.aString2838 = Class43.aString603;
		Class691.aString8701 = Class43.aString594;
		Class669.method13691(false, -1838550041);
		Class659.method10809(869356760);
		aClass290Array3361 = null;
		Class90.aClass424_890 = null;
		Class657.method10791(18, (byte) -96);
	}

	public static void method5563() {
		aBool3359 = true;
		Class260.aString2838 = Class43.aString603;
		Class691.aString8701 = Class43.aString594;
		Class669.method13691(false, -1838550041);
		Class659.method10809(1798407399);
		aClass290Array3361 = null;
		Class90.aClass424_890 = null;
		Class657.method10791(18, (byte) -25);
	}

	public static void method5564() {
		aBool3359 = true;
		Class260.aString2838 = Class43.aString603;
		Class691.aString8701 = Class43.aString594;
		Class669.method13691(false, -1838550041);
		Class659.method10809(1725120102);
		aClass290Array3361 = null;
		Class90.aClass424_890 = null;
		Class657.method10791(18, (byte) -43);
	}

	public static void method5565(boolean bool) {
		if (null == Class661.aClass289_8509)
			Class181.method3541(1777787388);
		if (bool)
			Class661.aClass289_8509.method5170(-2147248031);
	}

	public static boolean method5566() {
		return aBool3359;
	}

	public static boolean method5567() {
		return aBool3359;
	}

	public static void method5568() {
		if (aClass290Array3361 == null) {
			aClass290Array3361 = Class290.method5211(-736413572);
			aClass290_3356 = aClass290Array3361[0];
			Class85.aLong877 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * 6537004408873586623L;
		}
		if (null == Class661.aClass289_8509)
			Class181.method3541(1817961153);
		Class290 class290 = aClass290_3356;
		int i = Class304.method5546(1681926558);
		if (class290 == aClass290_3356) {
			Class241.aString2454 = aClass290_3356.aClass39_3140.method1124(Class53_Sub20.aClass668_10979, (byte) -97);
			Class523_Sub27_Sub1.aString11329 = Class241.aString2454;
			if (aClass290_3356.aBool3145)
				Class188.anInt2134 = (1137185207 * (i * (aClass290_3356.anInt3141 * 2000069113 - 536005863 * aClass290_3356.anInt3142) / 100 + aClass290_3356.anInt3142 * 536005863));
			if (aClass290_3356.aBool3127)
				Class523_Sub27_Sub1.aString11329 = new StringBuilder().append(Class523_Sub27_Sub1.aString11329).append(" - ").append(Class188.anInt2134 * 723819527).append("%").toString();
		} else if (aClass290_3356 == Class290.aClass290_3138) {
			Class661.aClass289_8509 = null;
			Class657.method10791(16, (byte) -103);
			if (aBool3359) {
				aBool3359 = false;
				Class223.method4147(Class260.aString2838, Class691.aString8701, "", false, (byte) -31);
			}
		} else {
			Class241.aString2454 = class290.aClass39_3123.method1124(Class53_Sub20.aClass668_10979, (byte) -118);
			Class523_Sub27_Sub1.aString11329 = Class241.aString2454;
			if (aClass290_3356.aBool3127)
				Class523_Sub27_Sub1.aString11329 = new StringBuilder().append(Class523_Sub27_Sub1.aString11329).append(" - ").append(class290.anInt3141 * 2000069113).append("%").toString();
			Class188.anInt2134 = -1906880001 * class290.anInt3141;
			if (aClass290_3356.aBool3145 || class290.aBool3145)
				Class85.aLong877 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * 6537004408873586623L;
		}
		if (null != Class661.aClass289_8509) {
			Class661.aClass289_8509.method5173(-7839201569249075137L * Class85.aLong877, Class241.aString2454, Class523_Sub27_Sub1.aString11329, Class188.anInt2134 * 723819527, aClass290_3356, (byte) 89);
			if (null != anInterface32Array3355) {
				for (int i_0_ = 1 + anInt3354 * 30105747; i_0_ < anInterface32Array3355.length; i_0_++) {
					if ((anInterface32Array3355[i_0_].method192(-1546333624) >= 100) && 30105747 * anInt3354 == i_0_ - 1 && -2020118759 * client.anInt11136 != 18 && Class661.aClass289_8509.method5171((byte) 89)) {
						try {
							anInterface32Array3355[i_0_].method193((short) -16731);
						} catch (Exception exception) {
							anInterface32Array3355 = null;
							break;
						}
						Class661.aClass289_8509.method5172(anInterface32Array3355[i_0_], -600254875);
						anInt3354 += -1204765285;
						if ((30105747 * anInt3354 >= anInterface32Array3355.length - 1) && anInterface32Array3355.length > 1)
							anInt3354 = (aClass82_3358.method1573((byte) 37) ? 0 : -1) * -1204765285;
					}
				}
			}
		}
	}

	public static int method5569() {
		return Class661.aClass289_8509.method5187(-376392128);
	}

	static void method5570() {
		Class19 class19 = Class53_Sub2.method17146("2", client.aClass681_11284.aString8645, false, 1650314495);
		Class423.clientConfigsDomain.method14384(class19, (byte) 47);
	}

	static void method5571() {
		if (aClass290_3356 != null) {
			Class661.aClass289_8509 = new Class289();
			Class661.aClass289_8509.method5173(-7839201569249075137L * Class85.aLong877, aClass290_3356.aClass39_3140.method1124(Class53_Sub20.aClass668_10979, (byte) -8), aClass290_3356.aClass39_3140.method1124(Class53_Sub20.aClass668_10979, (byte) -67), 536005863 * aClass290_3356.anInt3142, aClass290_3356, (byte) 20);
			aThread3357 = new Thread(Class661.aClass289_8509, "");
			aThread3357.start();
		}
	}

	static void method5572() {
		if (aClass290_3356 != null) {
			Class661.aClass289_8509 = new Class289();
			Class661.aClass289_8509.method5173(-7839201569249075137L * Class85.aLong877, aClass290_3356.aClass39_3140.method1124(Class53_Sub20.aClass668_10979, (byte) -88), aClass290_3356.aClass39_3140.method1124(Class53_Sub20.aClass668_10979, (byte) -66), 536005863 * aClass290_3356.anInt3142, aClass290_3356, (byte) 5);
			aThread3357 = new Thread(Class661.aClass289_8509, "");
			aThread3357.start();
		}
	}

	Class308() throws Throwable {
		throw new Error();
	}

	public static void method5573(boolean bool) {
		if (null == Class661.aClass289_8509)
			Class181.method3541(2109648820);
		if (bool)
			Class661.aClass289_8509.method5170(-465648016);
	}

	public static void method5574(boolean bool) {
		if (null == Class661.aClass289_8509)
			Class181.method3541(1712153244);
		if (bool)
			Class661.aClass289_8509.method5170(937051458);
	}

	public static int method5575() {
		return Class661.aClass289_8509.method5187(-500396904);
	}

	public static void method5576() {
		if (anInterface32Array3355 != null) {
			Interface32[] interface32s = anInterface32Array3355;
			for (int i = 0; i < interface32s.length; i++) {
				Interface32 interface32 = interface32s[i];
				interface32.method193((short) -6828);
			}
		}
	}

	public static int method5577() {
		return Class661.aClass289_8509.method5187(588042828);
	}

	public static void method5578() {
		aBool3359 = true;
		Class260.aString2838 = Class43.aString603;
		Class691.aString8701 = Class43.aString594;
		Class669.method13691(false, -1838550041);
		Class659.method10809(1941670544);
		aClass290Array3361 = null;
		Class90.aClass424_890 = null;
		Class657.method10791(18, (byte) -106);
	}

	public static void method5579() {
		if (Class661.aClass289_8509 != null)
			Class661.aClass289_8509.method5183(-800911491);
		if (null != aThread3357) {
			for (;;) {
				try {
					aThread3357.join();
					break;
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
		}
	}

	static int method5580() {
		int i = aClass290_3356.anInt3139 * 1533974855;
		if (i < aClass290Array3361.length - 1)
			aClass290_3356 = aClass290Array3361[i + 1];
		return 100;
	}

	static void method5582(byte[] is) {
		RSBuffer class523_sub34 = new RSBuffer(is);
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-1730476027);
			if (i == 0)
				break;
			if (i == 1)
				Class627.anInt8198 = class523_sub34.readUnsignedShort(-168164166) * 1190790947;
			else if (10 == i)
				class523_sub34.readUnsignedShort(-1605469568);
		}
	}

	static void method5583(byte[] is) {
		RSBuffer class523_sub34 = new RSBuffer(is);
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-1331940755);
			if (i == 0)
				break;
			if (i == 1)
				Class627.anInt8198 = class523_sub34.readUnsignedShort(-1494080965) * 1190790947;
			else if (10 == i)
				class523_sub34.readUnsignedShort(-101149405);
		}
	}

	static void method5584(byte[] is) {
		RSBuffer class523_sub34 = new RSBuffer(is);
		for (;;) {
			int i = class523_sub34.readUnsignedByte(384039903);
			if (i == 0)
				break;
			if (i == 1) {
				int i_8_ = class523_sub34.readUnsignedShort(-2065378350);
				Class254.aClass217_2743.method3937(i_8_, 1023805550);
			}
		}
	}

	static void method5585(byte[] is) {
		RSBuffer class523_sub34 = new RSBuffer(is);
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-1823185808);
			if (i == 0)
				break;
			if (i == 1) {
				int i_9_ = class523_sub34.readUnsignedShort(-1662722122);
				Class254.aClass217_2743.method3937(i_9_, -2101014058);
			}
		}
	}

	public static void method5586() {
		if (anInterface32Array3355 != null) {
			Interface32[] interface32s = anInterface32Array3355;
			for (int i = 0; i < interface32s.length; i++) {
				Interface32 interface32 = interface32s[i];
				interface32.method193((short) -11498);
			}
		}
	}

	static void method5587() {
		Class19 class19 = Class53_Sub2.method17146("2", client.aClass681_11284.aString8645, false, 1588337531);
		Class423.clientConfigsDomain.method14384(class19, (byte) 89);
	}

	public static void method5588() {
		if (Class661.aClass289_8509 != null)
			Class661.aClass289_8509.method5183(-800911491);
		if (null != aThread3357) {
			for (;;) {
				try {
					aThread3357.join();
					break;
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
		}
	}

	static void method5589() {
		if (aClass290_3356 != null) {
			Class661.aClass289_8509 = new Class289();
			Class661.aClass289_8509.method5173(-7839201569249075137L * Class85.aLong877, aClass290_3356.aClass39_3140.method1124(Class53_Sub20.aClass668_10979, (byte) -43), aClass290_3356.aClass39_3140.method1124(Class53_Sub20.aClass668_10979, (byte) -67), 536005863 * aClass290_3356.anInt3142, aClass290_3356, (byte) 55);
			aThread3357 = new Thread(Class661.aClass289_8509, "");
			aThread3357.start();
		}
	}

	static void method5590() {
		Class19 class19 = Class53_Sub2.method17146("2", client.aClass681_11284.aString8645, false, 1899685168);
		Class423.clientConfigsDomain.method14384(class19, (byte) 4);
	}

	public static void method5591() {
		if (Class661.aClass289_8509 != null)
			Class661.aClass289_8509.method5183(-800911491);
		if (null != aThread3357) {
			for (;;) {
				try {
					aThread3357.join();
					break;
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
		}
	}

	public static boolean method5592() {
		return aBool3359;
	}

	static final void method5593(InterfaceComponentDefinitions class250, Class242 class242, Class669 class669, short i) {
		class250.aBool2632 = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) == 1;
		Login.method15991(class250, (byte) -75);
	}

	static final void method5594(Class669 class669, int i) {
		int i_10_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_10_, -866647657);
		Class242 class242 = Class31.aClass242Array302[i_10_ >> 16];
		Class279.method5063(class250, class242, class669, 1951983931);
	}

	static final void method5595(Class669 class669, int i) {
		int i_11_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class615.method10068((char) i_11_, 530847186) ? 1 : 0;
	}

	static final void method5596(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	static final void method5597(Class669 class669, byte i) throws Exception_Sub7 {
		int i_12_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class303 class303 = Class194_Sub9.method15505(i_12_, (byte) 0);
		if (class303 == null)
			throw new RuntimeException();
		Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5317(class303, -772856578);
	}

	static void method5598(Class523_Sub27_Sub8 class523_sub27_sub8, int i) {
		boolean bool = false;
		class523_sub27_sub8.method16154(-261651695);
		for (Class523_Sub27_Sub8 class523_sub27_sub8_13_ = ((Class523_Sub27_Sub8) Class36.aClass697_339.first(-1426448868)); class523_sub27_sub8_13_ != null; class523_sub27_sub8_13_ = ((Class523_Sub27_Sub8) Class36.aClass697_339.next(768418218))) {
			if (Class605.method9962(class523_sub27_sub8.method18083(-1305900588), class523_sub27_sub8_13_.method18083(-319527085), -1801586972)) {
				Class379.method6398(class523_sub27_sub8, class523_sub27_sub8_13_, 1937018438);
				bool = true;
				break;
			}
		}
		if (!bool)
			Class36.aClass697_339.removeFromQueue(class523_sub27_sub8, (byte) -22);
	}

	public static void method5599(Class178 class178, Class472 class472, int i) {
		Class175[] class175s = Class166.method2672(class472, Class34.anInt312 * -665608001, 0);
		Class566.aClass148Array7606 = new Class148[class175s.length];
		for (int i_14_ = 0; i_14_ < class175s.length; i_14_++)
			Class566.aClass148Array7606[i_14_] = class178.method3104(class175s[i_14_], true);
		class175s = Class166.method2672(class472, Class34.anInt316 * 983253521, 0);
		Class82.aClass148Array872 = new Class148[class175s.length];
		for (int i_15_ = 0; i_15_ < class175s.length; i_15_++)
			Class82.aClass148Array872[i_15_] = class178.method3104(class175s[i_15_], true);
		class175s = Class166.method2672(class472, 113310459 * Class34.anInt311, 0);
		Class523_Sub27_Sub14_Sub3.aClass148Array12157 = new Class148[class175s.length];
		int i_16_ = 25;
		for (int i_17_ = 0; i_17_ < class175s.length; i_17_++) {
			class175s[i_17_].method2980(-i_16_ + (int) (Math.random() * (double) i_16_ * 2.0), -i_16_ + (int) (Math.random() * (double) i_16_ * 2.0), -i_16_ + (int) (Math.random() * (double) i_16_ * 2.0));
			Class523_Sub27_Sub14_Sub3.aClass148Array12157[i_17_] = class178.method3104(class175s[i_17_], true);
		}
		class175s = Class166.method2672(class472, -592609649 * Class471.anInt5361, 0);
		Class365.aClass148Array3867 = new Class148[class175s.length];
		for (int i_18_ = 0; i_18_ < class175s.length; i_18_++)
			Class365.aClass148Array3867[i_18_] = class178.method3104(class175s[i_18_], true);
		class175s = Class166.method2672(class472, Class34.anInt313 * -213715169, 0);
		Class501.aClass148Array5584 = new Class148[class175s.length];
		i_16_ = 12;
		for (int i_19_ = 0; i_19_ < class175s.length; i_19_++) {
			class175s[i_19_].method2980(-i_16_ + (int) (Math.random() * (double) i_16_ * 2.0), -i_16_ + (int) (Math.random() * (double) i_16_ * 2.0), -i_16_ + (int) (Math.random() * (double) i_16_ * 2.0));
			Class501.aClass148Array5584[i_19_] = class178.method3104(class175s[i_19_], true);
		}
		class175s = Class166.method2672(class472, Class100.anInt1236 * -588291819, 0);
		Class62.aClass148Array772 = new Class148[class175s.length];
		i_16_ = 12;
		for (int i_20_ = 0; i_20_ < class175s.length; i_20_++) {
			class175s[i_20_].method2980(-i_16_ + (int) (Math.random() * (double) i_16_ * 2.0), -i_16_ + (int) (Math.random() * (double) i_16_ * 2.0), -i_16_ + (int) (Math.random() * (double) i_16_ * 2.0));
			Class62.aClass148Array772[i_20_] = class178.method3104(class175s[i_20_], true);
		}
		Class168.aClass148_1800 = class178.method3104(Class166.method2658(class472, (Class333.anInt3511 * -1239632437), 0), true);
		Class707_Sub2.aClass148_10972 = class178.method3104(Class166.method2658(class472, (Class228.anInt2348 * -867357877), 0), true);
		class175s = Class166.method2672(class472, -863569379 * Class34.anInt317, 0);
		Class194_Sub3.aClass148Array9885 = new Class148[class175s.length];
		for (int i_21_ = 0; i_21_ < class175s.length; i_21_++)
			Class194_Sub3.aClass148Array9885[i_21_] = class178.method3104(class175s[i_21_], true);
	}

	public static final void method5600(byte i) {
		for (Class523_Sub2 class523_sub2 = ((Class523_Sub2) Class523_Sub2.aClass708_10359.method14240(1567656591)); class523_sub2 != null; class523_sub2 = (Class523_Sub2) Class523_Sub2.aClass708_10359.method14244((byte) 24)) {
			if (!class523_sub2.aBool10358) {
				class523_sub2.aBool10357 = true;
				if (class523_sub2.anInt10348 * 1813697231 >= 0 && class523_sub2.anInt10355 * 1818669861 >= 0 && (1813697231 * class523_sub2.anInt10348 < client.aClass505_11019.method8292((byte) 63)) && (class523_sub2.anInt10355 * 1818669861 < client.aClass505_11019.method8235(2069923648)))
					Class283.method5134(class523_sub2, 1161227235);
			} else
				class523_sub2.method8661(607052656);
		}
		for (Class523_Sub2 class523_sub2 = ((Class523_Sub2) Class523_Sub2.aClass708_10360.method14240(1713231258)); null != class523_sub2; class523_sub2 = (Class523_Sub2) Class523_Sub2.aClass708_10360.method14244((byte) -92)) {
			if (!class523_sub2.aBool10358)
				class523_sub2.aBool10357 = true;
			else
				class523_sub2.method8661(607052656);
		}
	}

	static final void method5601(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub40_10615.method17071(-2039525998) ? 1 : 0;
	}
}
