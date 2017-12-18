/* Class29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class29 implements Interface75 {
	public static Class29 aClass29_262;
	int anInt263;
	public static Class29 aClass29_264 = new Class29(0);

	public int method6() {
		return anInt263 * -1951793501;
	}

	public int method82() {
		return anInt263 * -1951793501;
	}

	static {
		aClass29_262 = new Class29(1);
	}

	public int method101() {
		return anInt263 * -1951793501;
	}

	Class29(int i) {
		anInt263 = i * 2136057099;
	}

	static final void method874(InterfaceComponentDefinitions class250, Class242 class242, Class669 class669, byte i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		int[] is = Class594.method9807(string, class669, (byte) 0);
		if (is != null)
			string = string.substring(0, string.length() - 1);
		class250.anObjectArray2650 = Class78.method1554(string, class669, -68449792);
		class250.anIntArray2651 = is;
		class250.aBool2635 = true;
	}

	static final void method875(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class512.method8577(class250, class242, class669, 1448984608);
	}

	static final void method876(InterfaceComponentDefinitions class250, int i, int i_0_, Class669 class669, int i_1_) {
		if (class250.anIntArray2620 == null) {
			if (i_0_ > 0) {
				class250.aByteArrayArray2530 = new byte[11][];
				class250.aByteArrayArray2669 = new byte[11][];
				class250.anIntArray2537 = new int[11];
				class250.anIntArray2619 = new int[11];
				class250.anIntArray2620 = new int[11];
			} else
				return;
		}
		class250.anIntArray2620[i] = i_0_;
		if (i_0_ > 0)
			class250.aBool2615 = true;
		else {
			class250.aBool2615 = false;
			for (int i_2_ = 0; i_2_ < class250.aByteArrayArray2530.length; i_2_++) {
				if (class250.aByteArrayArray2530[i_2_] != null || class250.anIntArray2620[i_2_] > 0) {
					class250.aBool2615 = true;
					break;
				}
			}
		}
	}
}
