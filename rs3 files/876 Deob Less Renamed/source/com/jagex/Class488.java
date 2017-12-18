/* Class488 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Class488 {
	public static Class488 aClass488_5489;
	static Class488 aClass488_5490 = new Class488(0);
	public static Class488 aClass488_5491;
	public static Class488 aClass488_5492;
	public static Class488 aClass488_5493;
	public static Class488 aClass488_5494;
	public static Class488 aClass488_5495;
	public static Class488 aClass488_5496 = new Class488(1);
	static Class488 aClass488_5497;
	public static Class488 aClass488_5498;
	int anInt5499;
	public static Map aMap5500;

	Class488(int i) {
		anInt5499 = i * -1929105471;
	}

	static {
		aClass488_5491 = new Class488(2);
		aClass488_5489 = new Class488(3);
		aClass488_5492 = new Class488(4);
		aClass488_5494 = new Class488(5);
		aClass488_5495 = new Class488(6);
		aClass488_5493 = new Class488(7);
		aClass488_5497 = new Class488(8);
		aClass488_5498 = new Class488(9);
	}

	static final void method7948(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class618.method10117(class250, class242, class669, -1084389583);
	}

	static final void method7949(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1106916417 * Class194_Sub14.anInt9931 & 0x1;
	}

	static final void method7950(Class669 class669, int i) {
		long l = Class248.method4401(1516375036);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (int) (l / 60000L);
	}

	public static Class705 method7951(int i, int i_0_) {
		Class705[] class705s = Class218.method4036(1069384412);
		for (int i_1_ = 0; i_1_ < class705s.length; i_1_++) {
			Class705 class705 = class705s[i_1_];
			if (i == class705.anInt8817 * 1594679277)
				return class705;
		}
		return null;
	}

	public static void method7952(int i) {
		Class566.method9501(1264539920);
		Class644.aClass637_Sub2_8341.method10450((byte) 0);
		Class644.aClass637_Sub1_8343.method10450((byte) 0);
		if (client.anInt11184 * -751939039 > 0) {
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4302, (client.aClass116_11058.aClass11_1413), 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(client.anInt11184 * 1287211140, (byte) -88);
			for (int i_2_ = 0; i_2_ < -751939039 * client.anInt11184; i_2_++) {
				Interface64 interface64 = client.anInterface64Array11194[i_2_];
				long l = (interface64.method424(1769655379) - 3538733483904203517L * Class644.aLong8344);
				if (l > 16777215L)
					l = 16777215L;
				Class644.aLong8344 = interface64.method424(1966531046) * -743130525740469675L;
				class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(interface64.method390(-1291614564), -1425378598);
				class523_sub22.aClass523_Sub34_Sub2_10525.method16330((int) l, (byte) 0);
			}
			client.aClass116_11058.method1974(class523_sub22, (byte) 29);
		}
		if (-136327131 * Class644.anInt8342 > 0)
			Class644.anInt8342 -= 1895287725;
		if (client.aBool11111 && Class644.anInt8342 * -136327131 <= 0) {
			Class644.anInt8342 = -748951164;
			client.aBool11111 = false;
			int i_3_;
			int i_4_;
			if (Class562.anInt7564 * 2097396553 == 2) {
				if (Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5342(-1390175100) == Class291.aClass291_3148) {
					Class328_Sub2 class328_sub2 = ((Class328_Sub2) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5430(1962552205));
					i_3_ = Class673.method13726(class328_sub2.aClass440_10072, (byte) 0) >> 3;
					int i_5_ = 1024;
					i_4_ = (i_5_ * 3 - (Class67.method1457(class328_sub2.aClass440_10072, (byte) 16) >> 3)) % (i_5_ * 2);
				} else {
					i_3_ = 0;
					i_4_ = 0;
				}
			} else {
				i_3_ = (int) client.aFloat11214 >> 3;
				i_4_ = (int) client.aFloat11129 >> 3;
			}
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.MOVE_CAMERA_PACKET, (client.aClass116_11058.aClass11_1413), 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(i_3_, -1262882661);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE128(i_4_, -917185759);
			client.aClass116_11058.method1974(class523_sub22, (byte) 85);
		}
		if (Class341.aBool3608 != Class644.aBool8345) {
			Class644.aBool8345 = Class341.aBool3608;
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4229, (client.aClass116_11058.aClass11_1413), 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(Class341.aBool3608 ? 1 : 0, -1320325760);
			client.aClass116_11058.method1974(class523_sub22, (byte) 118);
		}
		if (!client.aBool11012) {
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4208, (client.aClass116_11058.aClass11_1413), 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(0, 1360750191);
			int i_6_ = (2349011 * class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661);
			Class523_Sub34 class523_sub34 = Class449.aClass523_Sub33_4946.method16233((short) 20653);
			class523_sub22.aClass523_Sub34_Sub2_10525.readBytes(class523_sub34.aByteArray10658, 0, class523_sub34.anInt10661 * 2349011, (short) -30954);
			class523_sub22.aClass523_Sub34_Sub2_10525.method16276((class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 * 2349011) - i_6_, 1218198077);
			client.aClass116_11058.method1974(class523_sub22, (byte) 39);
			client.aBool11012 = true;
		}
		if (!client.aBool11013 && Class449.aClass523_Sub33_4946.aClass687_Sub1_10629.method16678((byte) 25) == 1) {
			int[] is = Class31.aClass178_303.method3418();
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4263, (client.aClass116_11058.aClass11_1413), 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(0, (byte) -81);
			int i_7_ = (2349011 * class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661);
			if (null != is && 0 != is.length) {
				class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(1, 470258408);
				Class137[] class137s = Class137.method2280((byte) 11);
				HashSet hashset = new HashSet();
				ArrayList arraylist = new ArrayList();
				for (int i_8_ = 0; i_8_ < is.length; i_8_++) {
					boolean bool = false;
					for (int i_9_ = 0; i_9_ < class137s.length; i_9_++) {
						if (is[i_8_] == class137s[i_9_].anInt1631) {
							hashset.add(class137s[i_9_]);
							bool = true;
							break;
						}
					}
					if (!bool)
						arraylist.add(Integer.valueOf(is[i_8_]));
				}
				Class650.method10626(hashset, class523_sub22.aClass523_Sub34_Sub2_10525, (short) -9169);
				class523_sub22.aClass523_Sub34_Sub2_10525.method16277(arraylist.size(), (byte) 8);
				if (arraylist.size() > 0) {
					int i_10_ = 2147483647;
					Iterator iterator = arraylist.iterator();
					while (iterator.hasNext()) {
						Integer integer = (Integer) iterator.next();
						if (integer.intValue() < i_10_)
							i_10_ = integer.intValue();
					}
					class523_sub22.aClass523_Sub34_Sub2_10525.method16459(i_10_, (byte) 0);
					iterator = arraylist.iterator();
					while (iterator.hasNext()) {
						Integer integer = (Integer) iterator.next();
						if (integer.intValue() != i_10_)
							class523_sub22.aClass523_Sub34_Sub2_10525.method16459(integer.intValue() - i_10_, (byte) 0);
					}
				}
			} else
				class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(0, -1798757056);
			class523_sub22.aClass523_Sub34_Sub2_10525.method16275((class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 * 2349011) - i_7_, 206079909);
			client.aClass116_11058.method1974(class523_sub22, (byte) 118);
			client.aBool11013 = true;
		}
	}

	static final void method7953(int i, byte i_11_) {
		Class8.method566((byte) -27);
		int i_12_ = ((((Class159_Sub2) Class669.aClass98_Sub1_Sub1_8582.getDefinition(i, (byte) 15)).anInt8891) * -1142985525);
		if (0 != i_12_) {
			int i_13_ = (Class98_Sub1_Sub2.playerVarsProvider.method94((Class159) Class669.aClass98_Sub1_Sub1_8582.getDefinition(i, (byte) 11), -1028851437));
			if (5 == i_12_)
				client.anInt11176 = 1458990251 * i_13_;
			if (i_12_ == 6)
				client.anInt11159 = i_13_ * 1835708207;
		}
	}
}
