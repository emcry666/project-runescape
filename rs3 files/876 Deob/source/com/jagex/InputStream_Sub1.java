/* InputStream_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.InputStream;

public class InputStream_Sub1 extends InputStream {
	InputStream_Sub1() {
		/* empty */
	}

	public int read() {
		Class653.method10656(30000L);
		return -1;
	}

	static void method17232(boolean bool, byte i) {
		Class592 class592 = Class241.player.method18399((byte) 1);
		Class523_Sub27_Sub17 class523_sub27_sub17 = Class534_Sub1.method8812(class592.localX * 235453015, class592.localY * 1704054549);
		if (null == class523_sub27_sub17)
			class523_sub27_sub17 = Class534_Sub1.method8813((Class534_Sub1.aClass624_7158.anInt8128) * 1217610883);
		if (Class523_Sub2.aClass523_Sub27_Sub17_10362 != class523_sub27_sub17 || bool) {
			Class523_Sub2.aClass523_Sub27_Sub17_10362 = class523_sub27_sub17;
			boolean bool_0_ = Class534_Sub1.method8811(class523_sub27_sub17);
			if (bool_0_) {
				Class534_Sub1.aBool7193 = true;
				Class42.method1147((short) -3403);
			}
		}
	}
}
