/* Class145 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class145 {
	Class145() {
		/* empty */
	}

	static void method2380(Class700 class700, int i) {
		Class523_Sub27_Sub2.aClass700_11334 = class700;
		Class54.aString725 = null;
	}

	static final void method2381(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class537.method8942(class250, class669, 1270173165);
	}

	public static boolean method2382(char c, byte i) {
		if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
			return true;
		if ('\0' != c) {
			char[] cs = Class664.aCharArray8526;
			for (int i_0_ = 0; i_0_ < cs.length; i_0_++) {
				char c_1_ = cs[i_0_];
				if (c_1_ == c)
					return true;
			}
		}
		return false;
	}

	static final void method2383(byte i) {
		if (Class691.method13965(-2020118759 * client.anInt11136, (byte) 5) || Class616.method10074(-2020118759 * client.anInt11136, (byte) 55))
			Class669.method13691(false, -1838550041);
		else {
			Class246.aClass557_2480 = client.aClass116_11058.method1979(782493095);
			client.aClass116_11058.method1978((byte) 0);
			Class657.method10791(17, (byte) -91);
		}
	}
}
