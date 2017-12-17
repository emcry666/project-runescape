/* Class660 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamDeviceCapability;

public final class Class660 {
	static boolean aBool8506 = false;
	static Class523_Sub27_Sub6 aClass523_Sub27_Sub6_8507;
	public static int anInt8508;

	static void method10811(Class669 class669) {
		int i = Class675.method13753(class669.anIntArray8557[((class669.anInt8558 -= 2138772399) * 1357652815)], -1257470474);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i;
	}

	static void method10812(Class669 class669) {
		class669.anInt8560 -= -1823027158;
		String string = ((String) class669.anObjectArray8559[class669.anInt8560 * 240723773]);
		String string_0_ = ((String) class669.anObjectArray8559[1 + class669.anInt8560 * 240723773]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class39.method1127(string, string_0_, -1693550662);
	}

	static void method10813(Class669 class669) {
		class669.anInt8558 -= -17422498;
		boolean bool = class669.anIntArray8557[1357652815 * class669.anInt8558] != 0;
		boolean bool_1_ = 0 != (class669.anIntArray8557[1357652815 * class669.anInt8558 + 1]);
		Class426.method6749(bool, bool_1_, (byte) 70);
	}

	static void method10814(Class669 class669) {
		int i = Class468.method7607(1925898793);
		if (i < 0) {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
		} else {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class292.aTwitchEventLiveStreams3159.viewerCounts[i];
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = Class292.aTwitchEventLiveStreams3159.channelUrls[i];
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = Class292.aTwitchEventLiveStreams3159.previewUrlTemplates[i];
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = Class292.aTwitchEventLiveStreams3159.streamTitles[i];
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = Class292.aTwitchEventLiveStreams3159.channelDisplayNames[i];
		}
	}

	static void method10815(Class669 class669) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class553.method9161(351119742);
	}

	static void method10816(Class669 class669) {
		class669.anInt8560 -= -1823027158;
		String string = ((String) class669.anObjectArray8559[class669.anInt8560 * 240723773]);
		String string_2_ = ((String) class669.anObjectArray8559[1 + class669.anInt8560 * 240723773]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class39.method1127(string, string_2_, -160653064);
	}

	static void method10817(Class669 class669) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class385.method6444(2141982555);
	}

	static void method10818(Class669 class669) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class553.method9161(77417014);
	}

	static void method10819(Class669 class669) {
		int i = Class468.method7607(1940266945);
		if (i < 0) {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
		} else {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class292.aTwitchEventLiveStreams3159.viewerCounts[i];
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = Class292.aTwitchEventLiveStreams3159.channelUrls[i];
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = Class292.aTwitchEventLiveStreams3159.previewUrlTemplates[i];
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = Class292.aTwitchEventLiveStreams3159.streamTitles[i];
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = Class292.aTwitchEventLiveStreams3159.channelDisplayNames[i];
		}
	}

	static void method10820(Class669 class669) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class7.method564((byte) -128);
	}

	static void method10821(Class669 class669) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class7.method564((byte) -68);
	}

	static void method10822(Class669 class669) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class248.method4405((byte) 124);
	}

	static void method10823(Class669 class669) {
		class669.anInt8558 -= -34844996;
		int i = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_3_ = class669.anIntArray8557[1 + class669.anInt8558 * 1357652815];
		int i_4_ = class669.anIntArray8557[2 + class669.anInt8558 * 1357652815];
		int i_5_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 3];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class38.method1121(i, i_3_, i_4_, i_5_ != 0, (byte) 41);
	}

	static void method10824(Class669 class669) {
		class669.anInt8558 -= -17422498;
		int i = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_6_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 1];
		TwitchWebcamDevice twitchwebcamdevice = Class447.method7244(i, 664034159);
		TwitchWebcamDeviceCapability twitchwebcamdevicecapability = null;
		if (twitchwebcamdevice != null)
			twitchwebcamdevicecapability = twitchwebcamdevice.method1688(i_6_);
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

	static void method10825(Class669 class669) {
		boolean bool = ((class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) != 0);
		Class585.method9690(bool, -1675777494);
	}

	static void method10826(Class669 class669) {
		boolean bool = ((class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) != 0);
		Class585.method9690(bool, 1462706612);
	}

	static void method10827(Class669 class669) {
		int i = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		TwitchWebcamDevice twitchwebcamdevice = Class447.method7244(i, 1241397366);
		if (null == twitchwebcamdevice)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = twitchwebcamdevice.method1689();
	}

	static void method10828(Class669 class669) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class260.method4706(-1604696706);
	}

	static void method10829(Class669 class669) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class98_Sub1_Sub2.method17731((byte) -14);
	}

	static void method10830(Class669 class669) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class98_Sub1_Sub2.method17731((byte) -47);
	}

	static void method10831(Class669 class669) {
		class669.anInt8560 -= -1823027158;
		String string = ((String) class669.anObjectArray8559[class669.anInt8560 * 240723773]);
		String string_7_ = ((String) class669.anObjectArray8559[1 + class669.anInt8560 * 240723773]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class39.method1127(string, string_7_, 826051871);
	}

	static void method10832(Class669 class669) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class553.method9161(59221634);
	}

	static void method10833(Class669 class669) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class562.method9458(string, 1361017644);
	}

	static void method10834(Class669 class669) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class158.method2555(92454587);
	}

	static void method10835(Class669 class669) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class158.method2555(-950254755);
	}

	static void method10836(Class669 class669) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class158.method2555(1114016643);
	}

	static void method10837(Class669 class669) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class464.method7545(859607303) ? 1 : 0;
	}

	static void method10838(Class669 class669) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class464.method7545(899232835) ? 1 : 0;
	}

	static void method10839(Class669 class669) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class562.method9458(string, 1361017644);
	}

	static void method10840(Class669 class669) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class315.method5681(-886624023);
	}

	static void method10841(Class669 class669) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class315.method5681(-886624023);
	}

	static void method10842(Class669 class669) {
		int i = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		TwitchWebcamDevice twitchwebcamdevice = Class447.method7244(i, 269006012);
		if (twitchwebcamdevice == null) {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
		} else {
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -2015039365 * twitchwebcamdevice.anInt1136;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = twitchwebcamdevice.aString1134;
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = twitchwebcamdevice.aString1135;
		}
	}

	static void method10843(Class669 class669) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class562.method9458(string, 1361017644);
	}

	static void method10844(Class669 class669) {
		class669.anInt8558 -= -17422498;
		boolean bool = class669.anIntArray8557[1357652815 * class669.anInt8558] != 0;
		boolean bool_8_ = 0 != (class669.anIntArray8557[1357652815 * class669.anInt8558 + 1]);
		Class426.method6749(bool, bool_8_, (byte) 47);
	}

	static void method10845(Class669 class669) {
		class669.anInt8558 -= -17422498;
		int i = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_9_ = class669.anIntArray8557[1 + 1357652815 * class669.anInt8558];
		TwitchWebcamDevice twitchwebcamdevice = Class447.method7244(i, 1977796151);
		TwitchWebcamDeviceCapability twitchwebcamdevicecapability = null;
		if (null != twitchwebcamdevice)
			twitchwebcamdevicecapability = twitchwebcamdevice.method1687(i_9_);
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

	static void method10846(Class669 class669) {
		class669.anInt8558 -= -17422498;
		int i = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_10_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 1];
		TwitchWebcamDevice twitchwebcamdevice = Class447.method7244(i, 1794396162);
		TwitchWebcamDeviceCapability twitchwebcamdevicecapability = null;
		if (twitchwebcamdevice != null)
			twitchwebcamdevicecapability = twitchwebcamdevice.method1688(i_10_);
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

	static void method10847(Class669 class669) {
		class669.anInt8558 -= -17422498;
		int i = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_11_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 1];
		TwitchWebcamDevice twitchwebcamdevice = Class447.method7244(i, 1420497540);
		TwitchWebcamDeviceCapability twitchwebcamdevicecapability = null;
		if (twitchwebcamdevice != null)
			twitchwebcamdevicecapability = twitchwebcamdevice.method1688(i_11_);
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

	static void method10848(Class669 class669) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class193.method3646(Class31.aClass178_303, 336297659);
	}

	static void method10849(Class669 class669) {
		class669.anInt8558 -= -17422498;
		int i = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_12_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 1];
		TwitchWebcamDevice twitchwebcamdevice = Class447.method7244(i, 758123905);
		TwitchWebcamDeviceCapability twitchwebcamdevicecapability = null;
		if (twitchwebcamdevice != null)
			twitchwebcamdevicecapability = twitchwebcamdevice.method1688(i_12_);
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

	static void method10850(Class669 class669) {
		class669.anInt8558 -= -17422498;
		class669.anIntArray8557[class669.anInt8558 * 1357652815] = Class398.method6528((class669.anIntArray8557[class669.anInt8558 * 1357652815]), (class669.anIntArray8557[1357652815 * class669.anInt8558 + 1]), 1013077751);
		class669.anInt8558 += 2138772399;
	}

	static void method10851(Class669 class669) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class511.method8561(-1850608859);
	}

	static void method10852(Class669 class669) {
		int i = Class675.method13753(class669.anIntArray8557[((class669.anInt8558 -= 2138772399) * 1357652815)], 1574307242);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i;
	}

	static void method10853(Class669 class669) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class315.method5681(-886624023);
	}

	static void method10854(Class669 class669) {
		class669.anInt8558 -= -17422498;
		int i = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_13_ = class669.anIntArray8557[1 + 1357652815 * class669.anInt8558];
		TwitchWebcamDevice twitchwebcamdevice = Class447.method7244(i, 2057868377);
		TwitchWebcamDeviceCapability twitchwebcamdevicecapability = null;
		if (null != twitchwebcamdevice)
			twitchwebcamdevicecapability = twitchwebcamdevice.method1687(i_13_);
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

	static void method10855(Class669 class669) {
		class669.anInt8558 -= -17422498;
		boolean bool = class669.anIntArray8557[1357652815 * class669.anInt8558] != 0;
		boolean bool_14_ = 0 != (class669.anIntArray8557[1357652815 * class669.anInt8558 + 1]);
		Class426.method6749(bool, bool_14_, (byte) -55);
	}

	static void method10856(Class669 class669) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class173.method2904((byte) 0);
	}

	static void method10857(Class669 class669) {
		Class645.method10561(-1122826684);
		Class226.method4165(class669, 652351244);
	}

	static void method10858(Class669 class669) {
		boolean bool = ((class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) != 0);
		Class585.method9690(bool, -1925134663);
	}

	Class660() throws Throwable {
		throw new Error();
	}

	static void method10859(Class669 class669) {
		class669.anInt8558 -= 2121349901;
		if (aBool8506) {
			Class380.method6405((class669.anIntArray8557[class669.anInt8558 * 1357652815]) != 0, -1967416248);
			Class322.method5721((class669.anIntArray8557[1357652815 * class669.anInt8558 + 1]) != 0, (byte) 50);
			Class164_Sub2.method15391(((class669.anIntArray8557[2 + class669.anInt8558 * 1357652815]) != 0), 1422942824);
		}
	}

	static final void method10860(Class669 class669, byte i) {
		int i_15_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_15_, -1939643538);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 345997065 * class250.anInt2561;
	}

	static void method10861(int i, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, Class523_Sub27_Sub8 class523_sub27_sub8, Class164 class164, Class10 class10, int i_22_, int i_23_, int i_24_) {
		if (i > i_17_ && i < i_17_ + i_19_ && i_16_ > i_21_ - -1669009881 * class10.anInt76 - 1 && i_16_ < class10.anInt80 * -853549931 + i_21_)
			i_22_ = i_23_;
		String string = BodyDefinitions.method10330(class523_sub27_sub8, (short) -20897);
		class164.method2602(string, i_17_ + 3, i_21_, i_22_, 0, client.aRandom11099, Class330.anInt3500, Class62.aClass148Array772, null, -1003167613);
	}
}
