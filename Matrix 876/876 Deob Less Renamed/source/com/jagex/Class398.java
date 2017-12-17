/* Class398 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import com.jagex.twitchtv.TwitchWebcamFrameData;

public final class Class398 {
	Object anObject4062;
	int anInt4063;

	Class398(Object object, int i) {
		anObject4062 = object;
		anInt4063 = 959445841 * i;
	}

	static final void method6527(Class669 class669, byte i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_0_, -1937340731);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class250.anInt2546 * 97896203;
	}

	public static int method6528(int i, int i_1_, int i_2_) {
		Class569.aTwitchWebcamFrameData7642 = new TwitchWebcamFrameData();
		if (i < 0 || i >= Class569.aTwitchWebcamDeviceArray7648.length)
			return -1;
		return (Class323.aTwitchTV3452.StartWebcamDevice((Class569.aTwitchWebcamDeviceArray7648[i].anInt1137 * -365031943), i_1_));
	}
}
