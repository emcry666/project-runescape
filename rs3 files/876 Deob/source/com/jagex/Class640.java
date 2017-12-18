/* Class640 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class640 {
	public volatile int anInt8314 = 1132818455;
	volatile String aString8315;

	Class640(String string) {
		aString8315 = string;
	}

	static final void method10526(Class669 class669, byte i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		class669.anInt8558 -= 2121349901;
		int i_0_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_1_ = class669.anIntArray8557[1 + class669.anInt8558 * 1357652815];
		int i_2_ = class669.anIntArray8557[2 + class669.anInt8558 * 1357652815];
		Class10 class10 = Class491.aClass423_5536.method6688(client.anInterface50_11044, i_1_, (byte) -72);
		String string_3_ = class10.method598(string, i_0_, Class62.aClass148Array772, i_2_, 548324083);
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = string_3_ != null ? string_3_ : "";
	}

	static final void method10527(Class669 class669, short i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class669.aClass647_Sub1_Sub3_Sub1_8552.method16740(494836154);
	}

	static void method10528(Class178 class178, int i) {
		if ((Class104.anInt1259 * 1784706919 != Class241.player.aByte10821) && client.aClass505_11019.method8241((byte) -125) != null) {
			TimeUtils.getCurrentTimeMilliseconds(1516375036);
			if (Class60.method1403(class178, (Class241.player.aByte10821), (byte) -36))
				Class104.anInt1259 = (Class241.player.aByte10821 * -440028073);
		}
	}

	public static boolean method10529(short i) {
		do {
			boolean bool;
			try {
				if (IcmpService_Sub1.available())
					break;
				bool = false;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		} while (false);
		if (Class665.anIcmpService_Sub1_8528 != null)
			throw new IllegalStateException("");
		Class665.anIcmpService_Sub1_8528 = new IcmpService_Sub1();
		Thread thread = new Thread(new Class649());
		thread.setDaemon(true);
		thread.start();
		return true;
	}
}
