/* Class539 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamDeviceCapability;

public class Class539 {
	Class518 this$0;
	public static Class53_Sub3 aClass53_Sub3_7213;

	Class539(Class518 class518) {
		this$0 = class518;
	}

	static final void method8954(Class669 class669, short i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_0_, -1915099893);
		Class242 class242 = Class31.aClass242Array302[i_0_ >> 16];
		Class529.method8772(class250, class242, class669, 1632825502);
	}

	static final void method8955(Class669 class669, short i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class396.method6513(class250, class242, class669, -1446718085);
	}

	static final void method8956(Class669 class669, byte i) {
		class669.anInt8558 -= -17422498;
		int i_1_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		boolean bool = (class669.anIntArray8557[1 + class669.anInt8558 * 1357652815] == 1);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub1_10629), i_1_, -518906029);
		if (!bool)
			Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub31_10643), 0, -1311899065);
		Class211.method3824(877762720);
		client.aBool11012 = false;
	}

	static final void method8957(Class669 class669, int i) {
		int i_2_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_2_, -974960071);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 319619511 * class250.anInt2707;
	}

	static void method8958(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_3_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_4_ = class669.anIntArray8557[1 + 1357652815 * class669.anInt8558];
		TwitchWebcamDevice twitchwebcamdevice = Class447.method7244(i_3_, 617446715);
		TwitchWebcamDeviceCapability twitchwebcamdevicecapability = null;
		if (null != twitchwebcamdevice)
			twitchwebcamdevicecapability = twitchwebcamdevice.method1687(i_4_);
		if (twitchwebcamdevicecapability == null) {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
		} else {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = twitchwebcamdevicecapability.anInt1145 * 2108711675;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = twitchwebcamdevicecapability.anInt1146 * 2027935125;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = twitchwebcamdevicecapability.anInt1147 * -1868294541;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1823180013 * twitchwebcamdevicecapability.anInt1148;
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = twitchwebcamdevicecapability.anInt1149 * 746279771;
		}
	}
}
