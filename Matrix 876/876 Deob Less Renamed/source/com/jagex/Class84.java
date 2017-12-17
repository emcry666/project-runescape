/* Class84 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class84 implements Interface13, Interface6 {
	public Object[][] anObjectArrayArray874;
	public Class464[][] aClass464ArrayArray875;

	public void method80(Class523_Sub34 class523_sub34, int i) {
		for (;;) {
			int i_0_ = class523_sub34.readUnsignedByte(1061837639);
			if (i_0_ == 0)
				break;
			method1593(class523_sub34, i_0_, (byte) -14);
		}
	}

	Class84() {
		/* empty */
	}

	void method1593(Class523_Sub34 class523_sub34, int i, byte i_1_) {
		if (i == 1) {
			int i_2_ = class523_sub34.readUnsignedByte(-1642729811);
			if (null == aClass464ArrayArray875)
				aClass464ArrayArray875 = new Class464[i_2_][];
			for (int i_3_ = class523_sub34.readUnsignedByte(712714526); i_3_ != 255; i_3_ = class523_sub34.readUnsignedByte(1857609305)) {
				int i_4_ = i_3_ & 0x7f;
				boolean bool = (i_3_ & 0x80) != 0;
				Class464[] class464s = new Class464[class523_sub34.readUnsignedByte(1474614927)];
				for (int i_5_ = 0; i_5_ < class464s.length; i_5_++)
					class464s[i_5_] = ((Class464) Class334.method5910(Class464.method7532((byte) -15), class523_sub34.readUnsignedSmart(368514876), -1975407371));
				aClass464ArrayArray875[i_4_] = class464s;
				if (bool) {
					if (null == anObjectArrayArray874)
						anObjectArrayArray874 = new Object[aClass464ArrayArray875.length][];
					anObjectArrayArray874[i_4_] = Class525.method8709(class523_sub34, class464s, -1529961680);
				}
			}
		}
	}

	public void method79() {
		/* empty */
	}

	public void method52(int i, byte i_6_) {
		/* empty */
	}

	public void method74(byte i) {
		/* empty */
	}

	public void method76(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(702830739);
			if (i == 0)
				break;
			method1593(class523_sub34, i, (byte) 11);
		}
	}

	public void method60(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-347433211);
			if (i == 0)
				break;
			method1593(class523_sub34, i, (byte) -56);
		}
	}

	public void method77() {
		/* empty */
	}

	public void method62(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-1490077316);
			if (i == 0)
				break;
			method1593(class523_sub34, i, (byte) -79);
		}
	}

	public void method58(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(2040079245);
			if (i == 0)
				break;
			method1593(class523_sub34, i, (byte) -97);
		}
	}

	public void method78() {
		/* empty */
	}

	public void method51(int i) {
		/* empty */
	}

	public void method75(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(1916496163);
			if (i == 0)
				break;
			method1593(class523_sub34, i, (byte) -6);
		}
	}

	public void method63(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-948665789);
			if (i == 0)
				break;
			method1593(class523_sub34, i, (byte) -89);
		}
	}

	public void method73() {
		/* empty */
	}

	void method1594(Class523_Sub34 class523_sub34, int i) {
		if (i == 1) {
			int i_7_ = class523_sub34.readUnsignedByte(157407167);
			if (null == aClass464ArrayArray875)
				aClass464ArrayArray875 = new Class464[i_7_][];
			for (int i_8_ = class523_sub34.readUnsignedByte(-1010307052); i_8_ != 255; i_8_ = class523_sub34.readUnsignedByte(368746951)) {
				int i_9_ = i_8_ & 0x7f;
				boolean bool = (i_8_ & 0x80) != 0;
				Class464[] class464s = new Class464[class523_sub34.readUnsignedByte(-1189383857)];
				for (int i_10_ = 0; i_10_ < class464s.length; i_10_++)
					class464s[i_10_] = ((Class464) Class334.method5910(Class464.method7532((byte) 21), class523_sub34.readUnsignedSmart(368514876), 527293647));
				aClass464ArrayArray875[i_9_] = class464s;
				if (bool) {
					if (null == anObjectArrayArray874)
						anObjectArrayArray874 = new Object[aClass464ArrayArray875.length][];
					anObjectArrayArray874[i_9_] = Class525.method8709(class523_sub34, class464s, -1187978163);
				}
			}
		}
	}

	void method1595(Class523_Sub34 class523_sub34, int i) {
		if (i == 1) {
			int i_11_ = class523_sub34.readUnsignedByte(148544829);
			if (null == aClass464ArrayArray875)
				aClass464ArrayArray875 = new Class464[i_11_][];
			for (int i_12_ = class523_sub34.readUnsignedByte(1937895601); i_12_ != 255; i_12_ = class523_sub34.readUnsignedByte(415119308)) {
				int i_13_ = i_12_ & 0x7f;
				boolean bool = (i_12_ & 0x80) != 0;
				Class464[] class464s = new Class464[class523_sub34.readUnsignedByte(-828813695)];
				for (int i_14_ = 0; i_14_ < class464s.length; i_14_++)
					class464s[i_14_] = ((Class464) Class334.method5910(Class464.method7532((byte) 100), class523_sub34.readUnsignedSmart(368514876), 470155984));
				aClass464ArrayArray875[i_13_] = class464s;
				if (bool) {
					if (null == anObjectArrayArray874)
						anObjectArrayArray874 = new Object[aClass464ArrayArray875.length][];
					anObjectArrayArray874[i_13_] = Class525.method8709(class523_sub34, class464s, -1285296786);
				}
			}
		}
	}

	public static int method1596(int i, int i_15_, int i_16_, boolean bool, int i_17_) {
		Class309 class309 = ((Class309) Class539.aClass53_Sub3_7213.getDefinition(i_16_, (byte) -39));
		Class159 class159 = class309.aClass159_3367;
		ItemsContainer class523_sub1 = Class72.method1507(i, bool, -1683907325);
		int i_18_;
		if (class523_sub1 == null || i_15_ < 0 || i_15_ >= class523_sub1.itemAmounts.length || null == class523_sub1.aClass4Array10322 || class523_sub1.aClass4Array10322[i_15_] == null)
			i_18_ = ((Integer) class159.method2560(740519457)).intValue();
		else
			i_18_ = class523_sub1.aClass4Array10322[i_15_].method21(class159.anInt1754 * -80020449, 1209567924);
		return class309.method5604(i_18_, 1320304360);
	}

	static void method1597(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(14, 0L);
		class523_sub27_sub7.method17962((byte) 65);
	}
}
