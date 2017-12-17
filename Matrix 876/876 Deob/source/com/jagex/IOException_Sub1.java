/* IOException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;

import com.jagex.twitchtv.TwitchEvent;

public class IOException_Sub1 extends IOException {
	IOException_Sub1(String string) {
		super(string);
	}

	public static void method18560(int i, TwitchEvent twitchevent, int i_0_) {
		Class523_Sub27_Sub19 class523_sub27_sub19 = Class606.method9967(Class572.aClass572_7680, i, -1, 926005493);
		if (null != class523_sub27_sub19) {
			Class669 class669 = Class540.method8981(1202823883);
			if (0 != 1067897013 * class523_sub27_sub19.anInt11854)
				class669.aLongArray8554 = new long[1067897013 * class523_sub27_sub19.anInt11854];
			if (0 != class523_sub27_sub19.anInt11849 * 625565027)
				class669.anIntArray8581 = new int[625565027 * class523_sub27_sub19.anInt11849];
			if (0 != 571919215 * class523_sub27_sub19.anInt11848)
				class669.anObjectArray8565 = new String[571919215 * class523_sub27_sub19.anInt11848];
			twitchevent.method6617(class669.anIntArray8581, class669.aLongArray8554, class669.anObjectArray8565);
			Class576.method9645(class523_sub27_sub19, 500000, class669, (byte) 13);
		}
	}
}
