/* Class50 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class50 {
	static byte[] method1280(Class472 class472, JS5ConfigStruct class656, int i) {
		if (class656.method10741(2040117518) > 1)
			return class472.method7688(class656.method10744(i, -1093182525), class656.method10745(i, 1913219376), 217201515);
		return class472.method7688(class656.anInt8501 * 1688317219, i, 1850987371);
	}

	static byte[] method1281(Class472 class472, JS5ConfigStruct class656, int i) {
		if (class656.method10741(1972162368) > 1)
			return class472.method7688(class656.method10744(i, -1093182525), class656.method10745(i, 1926248149), 1487791922);
		return class472.method7688(class656.anInt8501 * 1688317219, i, 1384695022);
	}

	Class50() throws Throwable {
		throw new Error();
	}

	public static Class167 method1282(Class178 class178, int i, int i_0_, int i_1_, int i_2_, int i_3_, byte i_4_) {
		long l = (long) i_3_;
		Class167 class167 = (Class167) Class111.aClass209_1340.method3767(l);
		int i_5_ = 2055;
		if (class167 == null) {
			Class179 class179 = Class179.method3485(Class413.aClass472_4583, i_3_, 0);
			if (class179 == null)
				return null;
			if (class179.anInt1952 < 13)
				class179.method3494(2);
			class167 = class178.method3115(class179, i_5_, -150377627 * Class111.anInt1345, 64, 768);
			Class111.aClass209_1340.method3770(class167, l);
		}
		class167 = class167.method2681((byte) 6, i_5_, true);
		if (i != 0)
			class167.method2685(i);
		if (0 != i_0_)
			class167.method2845(i_0_);
		if (i_1_ != 0)
			class167.method2688(i_1_);
		if (0 != i_2_)
			class167.method2689(0, i_2_, 0);
		return class167;
	}
}
