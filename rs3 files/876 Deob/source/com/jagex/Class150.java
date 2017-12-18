/* Class150 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class150 {
	public static final int anInt1715 = 0;
	public static final int anInt1716 = 4318;
	public static final int anInt1717 = 4098;
	public static final int anInt1718 = 32902;
	public static final int anInt1719 = -1;
	public int anInt1720;
	public String aString1721;
	public int anInt1722;
	public String aString1723;
	public long aLong1724;
	public static short[][] aShortArrayArray1725;

	public Class150(int i, String string, int i_0_, String string_1_, long l, boolean bool) {
		anInt1720 = i * 3329447;
		aString1721 = string;
		anInt1722 = i_0_ * -1674453513;
		aString1723 = string_1_;
		aLong1724 = 872761923952928187L * l;
	}

	static final void method2519(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_2_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_3_ = class669.anIntArray8557[1 + class669.anInt8558 * 1357652815];
		ItemDefinitions class12 = ((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(i_2_, (byte) 15));
		if (i_3_ >= 1 && i_3_ <= 5 && null != class12.groundOptions[i_3_ - 1])
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = class12.groundOptions[i_3_ - 1];
		else
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
	}

	static boolean method2520(byte i) {
		if (Class36.aClass523_Sub27_Sub6_333 == null)
			return false;
		if (-2101009827 * Class36.aClass523_Sub27_Sub6_333.anInt11639 >= 2000)
			Class36.aClass523_Sub27_Sub6_333.anInt11639 -= 2026588688;
		if (1007 == -2101009827 * Class36.aClass523_Sub27_Sub6_333.anInt11639)
			return true;
		return false;
	}

	public static Class86 method2521(int i, int i_4_) {
		Class86 class86 = (Class86) client.aClass209_11045.method3767((long) i);
		if (null == class86) {
			class86 = new Class86(Class700.aClass472_8779, Class436.method6873(i, -1310203839), Class164_Sub2.method15389(i, -1842222564));
			client.aClass209_11045.method3770(class86, (long) i);
		}
		return class86;
	}

	static final void method2522(Class669 class669, int i) {
		int i_5_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class321.method5719(i_5_ >> 14 & 0x3fff, i_5_ & 0x3fff, (byte) -114);
	}
}
