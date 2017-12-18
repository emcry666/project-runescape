/* Class522_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamDeviceCapability;

public class Class522_Sub5 extends Class522 {
	int anInt10341 = (int) (Class248.method4401(1516375036) / 1000L) * 1126491617;
	String aString10342;
	short aShort10343;

	Class522_Sub5(String string, int i) {
		aString10342 = string;
		aShort10343 = (short) i;
	}

	static final void method15865(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class303.method5535(class250, class242, class669, (byte) 95);
	}

	static void method15866(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_0_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_1_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 1];
		TwitchWebcamDevice twitchwebcamdevice = Class447.method7244(i_0_, 96287051);
		TwitchWebcamDeviceCapability twitchwebcamdevicecapability = null;
		if (twitchwebcamdevice != null)
			twitchwebcamdevicecapability = twitchwebcamdevice.method1688(i_1_);
		if (null == twitchwebcamdevicecapability) {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
		} else {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 2108711675 * twitchwebcamdevicecapability.anInt1145;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = twitchwebcamdevicecapability.anInt1146 * 2027935125;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1868294541 * twitchwebcamdevicecapability.anInt1147;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1823180013 * twitchwebcamdevicecapability.anInt1148;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = twitchwebcamdevicecapability.anInt1149 * 746279771;
		}
	}
}
