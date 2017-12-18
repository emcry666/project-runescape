/* Class639 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class639 implements Interface13 {
	int anInt8310;
	public int anInt8311;
	Class653 aClass653_8312;
	public int anInt8313;

	public void method76(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-1144424309);
			if (0 == i)
				break;
			method10517(class523_sub34, i, (byte) 29);
		}
	}

	public void readValues(RSBuffer class523_sub34, int i) {
		for (;;) {
			int i_0_ = class523_sub34.readUnsignedByte(-678869621);
			if (0 == i_0_)
				break;
			method10517(class523_sub34, i_0_, (byte) 103);
		}
	}

	public void method73() {
		/* empty */
	}

	void method10517(RSBuffer class523_sub34, int i, byte i_1_) {
		if (1 == i)
			anInt8310 = class523_sub34.readBigSmart((byte) -126) * 140958177;
		else if (i == 2) {
			anInt8311 = class523_sub34.readUnsignedByte(-1208715364) * -1444633071;
			anInt8313 = class523_sub34.readUnsignedByte(-1145510795) * 708687869;
		}
	}

	public void method74(byte i) {
		/* empty */
	}

	public void method75(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(2106077354);
			if (0 == i)
				break;
			method10517(class523_sub34, i, (byte) -12);
		}
	}

	public synchronized Class175 method10518(byte i) {
		Class175 class175 = (Class175) aClass653_8312.aClass209_8399.method3767((long) (anInt8310 * 1088367137));
		if (class175 != null)
			return class175;
		class175 = Class166.method2658(aClass653_8312.aClass472_8400, anInt8310 * 1088367137, 0);
		if (class175 != null)
			aClass653_8312.aClass209_8399.method3770(class175, (long) (anInt8310 * 1088367137));
		return class175;
	}

	public void method60(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(338501866);
			if (0 == i)
				break;
			method10517(class523_sub34, i, (byte) -47);
		}
	}

	public void method63(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-802850820);
			if (0 == i)
				break;
			method10517(class523_sub34, i, (byte) -7);
		}
	}

	public void readValues(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-1495697806);
			if (0 == i)
				break;
			method10517(class523_sub34, i, (byte) 22);
		}
	}

	public void method58(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-1762607650);
			if (0 == i)
				break;
			method10517(class523_sub34, i, (byte) -40);
		}
	}

	Class639(int i, Class653 class653) {
		aClass653_8312 = class653;
	}

	public void method79() {
		/* empty */
	}

	public void method77() {
		/* empty */
	}

	public void method78() {
		/* empty */
	}

	void method10519(RSBuffer class523_sub34, int i) {
		if (1 == i)
			anInt8310 = class523_sub34.readBigSmart((byte) -69) * 140958177;
		else if (i == 2) {
			anInt8311 = class523_sub34.readUnsignedByte(341771921) * -1444633071;
			anInt8313 = class523_sub34.readUnsignedByte(-3224567) * 708687869;
		}
	}

	void method10520(RSBuffer class523_sub34, int i) {
		if (1 == i)
			anInt8310 = class523_sub34.readBigSmart((byte) -63) * 140958177;
		else if (i == 2) {
			anInt8311 = class523_sub34.readUnsignedByte(273574936) * -1444633071;
			anInt8313 = class523_sub34.readUnsignedByte(1178163677) * 708687869;
		}
	}

	public synchronized Class175 method10521() {
		Class175 class175 = (Class175) aClass653_8312.aClass209_8399.method3767((long) (anInt8310 * 1088367137));
		if (class175 != null)
			return class175;
		class175 = Class166.method2658(aClass653_8312.aClass472_8400, anInt8310 * 1088367137, 0);
		if (class175 != null)
			aClass653_8312.aClass209_8399.method3770(class175, (long) (anInt8310 * 1088367137));
		return class175;
	}

	static final void method10522(Class669 class669, int i) {
		int i_2_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_2_, -1768613999);
		Class242 class242 = Class31.aClass242Array302[i_2_ >> 16];
		Class303.method5535(class250, class242, class669, (byte) 36);
	}

	static final void method10523(Class669 class669, byte i) {
		class669.anInt8558 -= 2138772399;
		int i_3_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class204.method3708(i_3_, (byte) 123);
	}

	static final void method10524(InterfaceComponentDefinitions class250, Class242 class242, Class669 class669, int i) {
		class250.anInt2549 = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) * 1509241607;
		class250.anInt2552 = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) * 596934093;
	}

	static final void method10525(Class669 class669, int i) {
		int i_4_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_4_, -1682506051);
		Class242 class242 = Class31.aClass242Array302[i_4_ >> 16];
		Class547.method9090(class250, class242, class669, -1871587308);
	}
}
