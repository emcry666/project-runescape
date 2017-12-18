/* Class674 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashSet;
import java.util.Set;

public class Class674 implements Interface75 {
	public static Class674 aClass674_8613 = new Class674("", 0, new Class662[] { Class662.aClass662_8511 });
	Set aSet8614;
	public static Class674 aClass674_8615;
	public static Class674 aClass674_8616;
	public static Class674 aClass674_8617;
	public static Class674 aClass674_8618 = new Class674("", 1, new Class662[] { Class662.aClass662_8513, Class662.aClass662_8511 });
	static Class674 aClass674_8619;
	static Class674 aClass674_8620;
	static Class674 aClass674_8621;
	public static Class674 aClass674_8622;
	public static Class674 aClass674_8623;
	static Class674 aClass674_8624;
	static Class674 aClass674_8625;
	int anInt8626;
	static Class674 aClass674_8627;
	static int anInt8628;

	public boolean method13728(Class662 class662, int i) {
		return aSet8614.contains(class662);
	}

	Class674(String string, int i) {
		aSet8614 = new HashSet();
		anInt8626 = i * 1119811457;
	}

	Class674(String string, int i, Class662[] class662s) {
		aSet8614 = new HashSet();
		anInt8626 = i * 1119811457;
		Class662[] class662s_0_ = class662s;
		for (int i_1_ = 0; i_1_ < class662s_0_.length; i_1_++) {
			Class662 class662 = class662s_0_[i_1_];
			aSet8614.add(class662);
		}
	}

	public int method6() {
		return anInt8626 * 1151944833;
	}

	static {
		aClass674_8615 = new Class674("", 2, new Class662[] { Class662.aClass662_8513, Class662.aClass662_8512 });
		aClass674_8616 = new Class674("", 3, new Class662[] { Class662.aClass662_8513 });
		aClass674_8617 = new Class674("", 4);
		aClass674_8623 = new Class674("", 5, new Class662[] { Class662.aClass662_8513, Class662.aClass662_8511 });
		aClass674_8621 = new Class674("", 6, new Class662[] { Class662.aClass662_8511 });
		aClass674_8619 = new Class674("", 8, new Class662[] { Class662.aClass662_8513, Class662.aClass662_8511 });
		aClass674_8620 = new Class674("", 9, new Class662[] { Class662.aClass662_8513, Class662.aClass662_8512 });
		aClass674_8622 = new Class674("", 10, new Class662[] { Class662.aClass662_8513 });
		aClass674_8627 = new Class674("", 11, new Class662[] { Class662.aClass662_8513 });
		aClass674_8624 = new Class674("", 12, new Class662[] { Class662.aClass662_8513, Class662.aClass662_8511 });
		aClass674_8625 = new Class674("", 13, new Class662[] { Class662.aClass662_8513 });
		method13733(886027334);
	}

	static void method13729(Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class562.method9458(string, 1361017644);
	}

	public int method82() {
		return anInt8626 * 1151944833;
	}

	public int method101() {
		return anInt8626 * 1151944833;
	}

	public static Class674[] method13730() {
		return new Class674[] { aClass674_8625, aClass674_8616, aClass674_8613, aClass674_8624, aClass674_8619, aClass674_8627, aClass674_8622, aClass674_8617, aClass674_8620, aClass674_8621, aClass674_8615, aClass674_8618, aClass674_8623 };
	}

	public static Class674[] method13731() {
		return new Class674[] { aClass674_8625, aClass674_8616, aClass674_8613, aClass674_8624, aClass674_8619, aClass674_8627, aClass674_8622, aClass674_8617, aClass674_8620, aClass674_8621, aClass674_8615, aClass674_8618, aClass674_8623 };
	}

	public static Class674[] method13732() {
		return new Class674[] { aClass674_8625, aClass674_8616, aClass674_8613, aClass674_8624, aClass674_8619, aClass674_8627, aClass674_8622, aClass674_8617, aClass674_8620, aClass674_8621, aClass674_8615, aClass674_8618, aClass674_8623 };
	}

	public static Class674[] method13733(int i) {
		return new Class674[] { aClass674_8625, aClass674_8616, aClass674_8613, aClass674_8624, aClass674_8619, aClass674_8627, aClass674_8622, aClass674_8617, aClass674_8620, aClass674_8621, aClass674_8615, aClass674_8618, aClass674_8623 };
	}

	static final void method13734(Class669 class669, int i) {
		int i_2_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_2_, -1227415182);
		Class242 class242 = Class31.aClass242Array302[i_2_ >> 16];
		Class572.method9623(class250, class242, class669, 1695978568);
	}

	static final void method13735(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class682.method13857(class250, class669, (short) 19271);
	}
}
