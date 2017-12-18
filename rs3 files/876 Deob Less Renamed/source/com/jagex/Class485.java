/* Class485 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.util.Date;

final class Class485 implements Interface11 {
	public Object method64(Class523_Sub34 class523_sub34) {
		return class523_sub34.readString(-961462150);
	}

	public Object method65(Class523_Sub34 class523_sub34, int i) {
		return class523_sub34.readString(-1372553223);
	}

	public Object method67(Class523_Sub34 class523_sub34) {
		return class523_sub34.readString(-1613491108);
	}

	public Object method66(Class523_Sub34 class523_sub34) {
		return class523_sub34.readString(-1157251460);
	}

	public static void method7932(String string, byte i) {
		if (Class95.aStringArray1165 == null)
			Class257.method4687(-2080483063);
		client.aCalendar11024.setTime(new Date(Class248.method4401(1516375036)));
		int i_0_ = client.aCalendar11024.get(11);
		int i_1_ = client.aCalendar11024.get(12);
		int i_2_ = client.aCalendar11024.get(13);
		String string_3_ = new StringBuilder().append(Integer.toString(i_0_ / 10)).append(i_0_ % 10).append(":").append(i_1_ / 10).append(i_1_ % 10).append(":").append(i_2_ / 10).append(i_2_ % 10).toString();
		String[] strings = Class194_Sub13.method15512(string, '\n', (byte) 39);
		for (int i_4_ = 0; i_4_ < strings.length; i_4_++) {
			for (int i_5_ = 1497187345 * Class95.anInt1179; i_5_ > 0; i_5_--)
				Class95.aStringArray1165[i_5_] = Class95.aStringArray1165[i_5_ - 1];
			Class95.aStringArray1165[0] = new StringBuilder().append(string_3_).append(": ").append(strings[i_4_]).toString();
			if (Class95.aFileOutputStream1169 != null) {
				try {
					Class95.aFileOutputStream1169.write(OutgoingPacket.method6623(new StringBuilder().append(Class95.aStringArray1165[0]).append("\n").toString(), 1799006967));
				} catch (IOException ioexception) {
					/* empty */
				}
			}
			if (Class95.anInt1179 * 1497187345 < Class95.aStringArray1165.length - 1) {
				Class95.anInt1179 += 1000353009;
				if (-165903669 * Class95.anInt1177 > 0)
					Class95.anInt1177 += -149335325;
			}
		}
	}

	static final void method7933(Class669 class669, int i) {
		int i_6_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = class669.aClass334_8571.aStringArray3528[i_6_];
	}

	static final void method7934(Class669 class669, byte i) {
		class669.anInt8558 -= 2121349901;
		long l = (long) class669.anIntArray8557[class669.anInt8558 * 1357652815];
		long l_7_ = (long) (class669.anIntArray8557[1 + 1357652815 * class669.anInt8558]);
		long l_8_ = (long) (class669.anIntArray8557[1357652815 * class669.anInt8558 + 2]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (int) (l_8_ * l / l_7_);
	}

	static final void method7935(Class669 class669, int i) {
		int i_9_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub19_10623), i_9_, -750402381);
		Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub19_10634), i_9_, 1187341121);
		Class449.aClass523_Sub33_4946.aClass687_Sub19_10623.method16905(1699015836);
		Class449.aClass523_Sub33_4946.aClass687_Sub19_10634.method16905(1699015836);
		Class242.method4373(-2069237134);
		Class211.method3824(1318954143);
		client.aBool11012 = false;
	}

	static final void method7936(Class669 class669, int i) {
		Class523_Sub29 class523_sub29 = ((Class523_Sub29) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]));
		if (Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5342(-1390175100) != Class291.aClass291_3151)
			throw new RuntimeException();
		Class328_Sub1 class328_sub1 = (Class328_Sub1) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5430(1611905382);
		class328_sub1.method15568(class523_sub29, (byte) 1);
		client.aBool11111 = true;
	}

	static int method7937(int i, int i_10_) {
		if (i == 9 || i == 10)
			return 1;
		if (11 == i)
			return 8;
		return i;
	}
}
