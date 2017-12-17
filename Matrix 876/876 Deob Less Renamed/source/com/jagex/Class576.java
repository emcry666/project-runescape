/* Class576 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class576 implements Interface13, Interface6 {
	int anInt7692 = 156434417;
	int anInt7693 = -911359343;
	int[] anIntArray7694;
	Class577 aClass577_7695 = Class577.aClass577_7699;
	int anInt7696 = -1845622623;

	public void method75(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-764026005);
			if (0 == i)
				break;
			method9642(class523_sub34, i, -707692864);
		}
	}

	public void method80(Class523_Sub34 class523_sub34, int i) {
		for (;;) {
			int i_0_ = class523_sub34.readUnsignedByte(-1826898402);
			if (0 == i_0_)
				break;
			method9642(class523_sub34, i_0_, -583037994);
		}
	}

	public void method62(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-165661643);
			if (0 == i)
				break;
			method9642(class523_sub34, i, -922215724);
		}
	}

	public void method52(int i, byte i_1_) {
		/* empty */
	}

	Class576() {
		/* empty */
	}

	public void method51(int i) {
		/* empty */
	}

	public void method76(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-103478492);
			if (0 == i)
				break;
			method9642(class523_sub34, i, -36717726);
		}
	}

	void method9640(Class523_Sub34 class523_sub34, int i) {
		if (i == 1)
			anInt7692 = class523_sub34.readUnsignedShort(-740642614) * -156434417;
		else if (i == 2) {
			anIntArray7694 = new int[class523_sub34.readUnsignedByte(876512183)];
			for (int i_2_ = 0; i_2_ < anIntArray7694.length; i_2_++)
				anIntArray7694[i_2_] = class523_sub34.readUnsignedShort(-1393606656);
		} else if (i == 3)
			anInt7693 = class523_sub34.readUnsignedByte(-533542351) * 911359343;
		else if (4 == i)
			aClass577_7695 = ((Class577) Class334.method5910(Class711.method14326(-28543348), class523_sub34.readUnsignedByte(-1725788826), 1756470885));
		else if (i == 5)
			anInt7696 = class523_sub34.readBigSmart((byte) -111) * 1845622623;
		else if (i == 6)
			class523_sub34.readBigSmart((byte) -113);
	}

	public void method63(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-1803323473);
			if (0 == i)
				break;
			method9642(class523_sub34, i, -826192576);
		}
	}

	void method9641(Class523_Sub34 class523_sub34, int i) {
		if (i == 1)
			anInt7692 = class523_sub34.readUnsignedShort(-845008706) * -156434417;
		else if (i == 2) {
			anIntArray7694 = new int[class523_sub34.readUnsignedByte(1240421868)];
			for (int i_3_ = 0; i_3_ < anIntArray7694.length; i_3_++)
				anIntArray7694[i_3_] = class523_sub34.readUnsignedShort(-649618549);
		} else if (i == 3)
			anInt7693 = class523_sub34.readUnsignedByte(-168972713) * 911359343;
		else if (4 == i)
			aClass577_7695 = ((Class577) Class334.method5910(Class711.method14326(-66652396), class523_sub34.readUnsignedByte(-385511181), 1677553414));
		else if (i == 5)
			anInt7696 = class523_sub34.readBigSmart((byte) -37) * 1845622623;
		else if (i == 6)
			class523_sub34.readBigSmart((byte) 0);
	}

	public void method58(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(2051818937);
			if (0 == i)
				break;
			method9642(class523_sub34, i, -592512479);
		}
	}

	public void method60(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-1095114104);
			if (0 == i)
				break;
			method9642(class523_sub34, i, -165132215);
		}
	}

	public void method79() {
		/* empty */
	}

	public void method77() {
		/* empty */
	}

	public void method73() {
		/* empty */
	}

	public void method74(byte i) {
		/* empty */
	}

	void method9642(Class523_Sub34 class523_sub34, int i, int i_4_) {
		if (i == 1)
			anInt7692 = class523_sub34.readUnsignedShort(-7962639) * -156434417;
		else if (i == 2) {
			anIntArray7694 = new int[class523_sub34.readUnsignedByte(-607258439)];
			for (int i_5_ = 0; i_5_ < anIntArray7694.length; i_5_++)
				anIntArray7694[i_5_] = class523_sub34.readUnsignedShort(-1959961681);
		} else if (i == 3)
			anInt7693 = class523_sub34.readUnsignedByte(1964905058) * 911359343;
		else if (4 == i)
			aClass577_7695 = ((Class577) Class334.method5910(Class711.method14326(-1275512240), class523_sub34.readUnsignedByte(-376362811), -718621175));
		else if (i == 5)
			anInt7696 = class523_sub34.readBigSmart((byte) -45) * 1845622623;
		else if (i == 6)
			class523_sub34.readBigSmart((byte) -100);
	}

	public void method78() {
		/* empty */
	}

	public static Class504 method9643(int i, int i_6_, int i_7_, int i_8_, Interface12 interface12, Interface12 interface12_9_) {
		Class510[] class510s = null;
		Class576 class576 = (Class576) interface12.getDefinition(i, (byte) -35);
		if (null != class576.anIntArray7694) {
			class510s = new Class510[class576.anIntArray7694.length];
			for (int i_10_ = 0; i_10_ < class510s.length; i_10_++) {
				Class286 class286 = ((Class286) interface12_9_.getDefinition(class576.anIntArray7694[i_10_], (byte) -22));
				class510s[i_10_] = new Class510(class286.anInt3094 * 1277180001, class286.anInt3093 * 156739431, 2107416927 * class286.anInt3086, 580026927 * class286.anInt3096, -1497120019 * class286.anInt3090, class286.anInt3087 * 1756113097, class286.anInt3092 * -210612203, class286.aBool3091, class286.anInt3089 * 382505871, class286.anInt3095 * 952982467, 1347747559 * class286.anInt3088);
			}
		}
		return new Class504(class576.anInt7692 * -610144529, class510s, class576.anInt7693 * -1296973425, i_6_, i_7_, i_8_, class576.aClass577_7695, 281158815 * class576.anInt7696);
	}

	public static Class504 method9644(int i, int i_11_, int i_12_, int i_13_, Interface12 interface12, Interface12 interface12_14_) {
		Class510[] class510s = null;
		Class576 class576 = (Class576) interface12.getDefinition(i, (byte) -4);
		if (null != class576.anIntArray7694) {
			class510s = new Class510[class576.anIntArray7694.length];
			for (int i_15_ = 0; i_15_ < class510s.length; i_15_++) {
				Class286 class286 = ((Class286) interface12_14_.getDefinition(class576.anIntArray7694[i_15_], (byte) -52));
				class510s[i_15_] = new Class510(class286.anInt3094 * 1277180001, class286.anInt3093 * 156739431, 2107416927 * class286.anInt3086, 580026927 * class286.anInt3096, -1497120019 * class286.anInt3090, class286.anInt3087 * 1756113097, class286.anInt3092 * -210612203, class286.aBool3091, class286.anInt3089 * 382505871, class286.anInt3095 * 952982467, 1347747559 * class286.anInt3088);
			}
		}
		return new Class504(class576.anInt7692 * -610144529, class510s, class576.anInt7693 * -1296973425, i_11_, i_12_, i_13_, class576.aClass577_7695, 281158815 * class576.anInt7696);
	}

	static void method9645(Class523_Sub27_Sub19 class523_sub27_sub19, int i, Class669 class669, byte i_16_) {
		class669.anInt8558 = 0;
		class669.anInt8560 = 0;
		class669.anInt8579 = 1774429083;
		class669.aClass523_Sub27_Sub19_8580 = class523_sub27_sub19;
		class669.aClass514Array8553 = class669.aClass523_Sub27_Sub19_8580.aClass514Array11846;
		class669.anIntArray8577 = class669.aClass523_Sub27_Sub19_8580.anIntArray11847;
		Class514 class514 = null;
		class669.anInt8563 = 0;
		class669.aMap8573.clear();
		class669.aMap8573.put(Class470.aClass470_5354, (Class98_Sub1_Sub2.playerVarsProvider.aClass590_1348));
		class669.aMap8573.put(Class470.aClass470_5351, Class423.clientConfigsDomain);
		class669.aMap8573.put(Class470.aClass470_5348, Class636.aClass149_8300);
		if (null != class669.aClass334_8571)
			class669.aMap8573.put(Class470.aClass470_5352, Class244.method4378(class669.aClass334_8571, -1055596246));
		if (class669.aClass647_Sub1_Sub3_Sub1_8552 instanceof Class647_Sub1_Sub3_Sub1_Sub1)
			class669.aMap8573.put(Class470.aClass470_5346, (class669.aClass647_Sub1_Sub3_Sub1_8552.anInterface20_11956));
		if (class669.aClass647_Sub1_Sub3_Sub1_8552 instanceof Player)
			class669.aMap8556.put(Class470.aClass470_5354, (class669.aClass647_Sub1_Sub3_Sub1_8552.anInterface20_11956));
		if (Class461.aClass218_5122 != null)
			class669.aMap8573.put(Class470.aClass470_5345, Class461.aClass218_5122.method4024(519976705));
		try {
			try {
				Class663.anInt8516 = 0;
				for (;;) {
					Class663.anInt8516 += 126315649;
					if (Class663.anInt8516 * -61549695 > i)
						throw new RuntimeException("");
					class514 = (class669.aClass514Array8553[(class669.anInt8579 += -1774429083) * 1180759405]);
					if (Class663.aBool8518 && (null == Class663.aString8520 || (null != (class669.aClass523_Sub27_Sub19_8580.aString11844) && class669.aClass523_Sub27_Sub19_8580.aString11844.indexOf(Class663.aString8520) != -1)))
						System.out.println(new StringBuilder().append(class669.aClass523_Sub27_Sub19_8580.aString11844).append(": ").append(class514).toString());
					if ((class669.anIntArray8577[1180759405 * class669.anInt8579]) == 1)
						class669.aBool8570 = true;
					else
						class669.aBool8570 = false;
					if (Class514.aClass514_6748 == class514 && 0 == -2124697313 * class669.anInt8563) {
						Class264.method4747(118352617);
						break;
					}
					Class523_Sub27_Sub6.method17960(class514, class669, (byte) 11);
				}
			} catch (Exception exception) {
				Class67.method1454(class669, class514, exception, "S", 1810273730);
				Class264.method4747(1332556397);
			}
		} catch (Exception object) {
			Class264.method4747(-691633309);
			throw object;
		}
	}

	static final void method9646(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class7.method563(class250, class242, class669, 1549517338);
	}

	static final void method9647(Class669 class669, int i) {
		int i_17_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class523_Sub27_Sub18 class523_sub27_sub18 = Class645.aClass24_8347.method839(i_17_, (byte) -55);
		if (null == class523_sub27_sub18.anIntArray11843)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class523_sub27_sub18.anIntArray11843.length;
	}
}
