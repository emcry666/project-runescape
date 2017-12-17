/* Class644 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Class644 {
	static Class637_Sub2 aClass637_Sub2_8341;
	static int anInt8342;
	static Class637_Sub1 aClass637_Sub1_8343;
	static long aLong8344 = 743130525740469675L;
	static boolean aBool8345;
	static Queue aQueue8346;

	public static void method10540() {
		synchronized (aQueue8346) {
			for (;;) {
				Class523_Sub39_Sub2 class523_sub39_sub2 = (Class523_Sub39_Sub2) aQueue8346.poll();
				if (class523_sub39_sub2 == null)
					break;
				class523_sub39_sub2.method16523((byte) -21);
			}
		}
	}

	static {
		anInt8342 = 0;
		aBool8345 = true;
		aClass637_Sub2_8341 = new Class637_Sub2();
		aClass637_Sub1_8343 = new Class637_Sub1();
		aQueue8346 = new LinkedList();
	}

	Class644() throws Throwable {
		throw new Error();
	}

	public static void method10541() {
		Class566.method9501(-1089179754);
		aClass637_Sub2_8341.method10450((byte) 0);
		aClass637_Sub1_8343.method10450((byte) 0);
		if (client.anInt11184 * -751939039 > 0) {
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4302, (client.aClass116_11058.aClass11_1413), 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(client.anInt11184 * 1287211140, (byte) -100);
			for (int i = 0; i < -751939039 * client.anInt11184; i++) {
				Interface64 interface64 = client.anInterface64Array11194[i];
				long l = (interface64.method424(2012421592) - 3538733483904203517L * aLong8344);
				if (l > 16777215L)
					l = 16777215L;
				aLong8344 = interface64.method424(1968546753) * -743130525740469675L;
				class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(interface64.method390(-807442837), -2114791926);
				class523_sub22.aClass523_Sub34_Sub2_10525.method16330((int) l, (byte) 0);
			}
			client.aClass116_11058.method1974(class523_sub22, (byte) 86);
		}
		if (-136327131 * anInt8342 > 0)
			anInt8342 -= 1895287725;
		if (client.aBool11111 && anInt8342 * -136327131 <= 0) {
			anInt8342 = -748951164;
			client.aBool11111 = false;
			int i;
			int i_0_;
			if (Class562.anInt7564 * 2097396553 == 2) {
				if (Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5342(-1390175100) == Class291.aClass291_3148) {
					Class328_Sub2 class328_sub2 = ((Class328_Sub2) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5430(1444372513));
					i = Class673.method13726(class328_sub2.aClass440_10072, (byte) 0) >> 3;
					int i_1_ = 1024;
					i_0_ = (i_1_ * 3 - (Class67.method1457(class328_sub2.aClass440_10072, (byte) 16) >> 3)) % (i_1_ * 2);
				} else {
					i = 0;
					i_0_ = 0;
				}
			} else {
				i = (int) client.aFloat11214 >> 3;
				i_0_ = (int) client.aFloat11129 >> 3;
			}
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.MOVE_CAMERA_PACKET, (client.aClass116_11058.aClass11_1413), 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(i, -1262882661);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE128(i_0_, 554059891);
			client.aClass116_11058.method1974(class523_sub22, (byte) 69);
		}
		if (Class341.aBool3608 != aBool8345) {
			aBool8345 = Class341.aBool3608;
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4229, (client.aClass116_11058.aClass11_1413), 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(Class341.aBool3608 ? 1 : 0, 1485164420);
			client.aClass116_11058.method1974(class523_sub22, (byte) 33);
		}
		if (!client.aBool11012) {
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4208, (client.aClass116_11058.aClass11_1413), 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(0, -1428779286);
			int i = (2349011 * class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661);
			Class523_Sub34 class523_sub34 = Class449.aClass523_Sub33_4946.method16233((short) 29671);
			class523_sub22.aClass523_Sub34_Sub2_10525.readBytes(class523_sub34.aByteArray10658, 0, class523_sub34.anInt10661 * 2349011, (short) -8352);
			class523_sub22.aClass523_Sub34_Sub2_10525.method16276((class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 * 2349011) - i, 1488010779);
			client.aClass116_11058.method1974(class523_sub22, (byte) 38);
			client.aBool11012 = true;
		}
		if (!client.aBool11013 && Class449.aClass523_Sub33_4946.aClass687_Sub1_10629.method16678((byte) -115) == 1) {
			int[] is = Class31.aClass178_303.method3418();
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4263, (client.aClass116_11058.aClass11_1413), 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(0, (byte) -64);
			int i = (2349011 * class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661);
			if (null != is && 0 != is.length) {
				class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(1, 371886155);
				Class137[] class137s = Class137.method2280((byte) 86);
				HashSet hashset = new HashSet();
				ArrayList arraylist = new ArrayList();
				for (int i_2_ = 0; i_2_ < is.length; i_2_++) {
					boolean bool = false;
					for (int i_3_ = 0; i_3_ < class137s.length; i_3_++) {
						if (is[i_2_] == class137s[i_3_].anInt1631) {
							hashset.add(class137s[i_3_]);
							bool = true;
							break;
						}
					}
					if (!bool)
						arraylist.add(Integer.valueOf(is[i_2_]));
				}
				Class650.method10626(hashset, class523_sub22.aClass523_Sub34_Sub2_10525, (short) -25675);
				class523_sub22.aClass523_Sub34_Sub2_10525.method16277(arraylist.size(), (byte) 8);
				if (arraylist.size() > 0) {
					int i_4_ = 2147483647;
					Iterator iterator = arraylist.iterator();
					while (iterator.hasNext()) {
						Integer integer = (Integer) iterator.next();
						if (integer.intValue() < i_4_)
							i_4_ = integer.intValue();
					}
					class523_sub22.aClass523_Sub34_Sub2_10525.method16459(i_4_, (byte) 0);
					iterator = arraylist.iterator();
					while (iterator.hasNext()) {
						Integer integer = (Integer) iterator.next();
						if (integer.intValue() != i_4_)
							class523_sub22.aClass523_Sub34_Sub2_10525.method16459(integer.intValue() - i_4_, (byte) 0);
					}
				}
			} else
				class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(0, 590789257);
			class523_sub22.aClass523_Sub34_Sub2_10525.method16275((class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 * 2349011) - i, 959875061);
			client.aClass116_11058.method1974(class523_sub22, (byte) 59);
			client.aBool11013 = true;
		}
	}

	public static void method10542() {
		Class418.method6665(-822627482);
	}

	public static void method10543(Class523_Sub39 class523_sub39) {
		if (!Class474.method7761(client.anInt11136 * -2020118759, (byte) 43))
			class523_sub39.method16523((byte) -29);
		else
			aClass637_Sub2_8341.method10455(class523_sub39, -2055908356);
	}

	public static void method10544() {
		Class418.method6665(-1486481705);
	}

	public static void method10545() {
		if (Class640.method10529((short) -31213))
			Class219.method4103(new Class628(), 1294249668);
	}

	static void method10546() {
		synchronized (aQueue8346) {
			Point point;
			if (Class523_Sub18_Sub8.aCanvas11689.isShowing())
				point = Class523_Sub18_Sub8.aCanvas11689.getLocationOnScreen();
			else
				point = null;
			for (;;) {
				Class523_Sub39_Sub2 class523_sub39_sub2 = (Class523_Sub39_Sub2) aQueue8346.poll();
				if (class523_sub39_sub2 == null)
					break;
				if (null == point || !Class523_Sub18_Sub8.aCanvas11689.isShowing() || !Class341.aBool3608)
					class523_sub39_sub2.method16523((byte) 17);
				else {
					class523_sub39_sub2.method18167(point, (byte) -103);
					if (!class523_sub39_sub2.method18180(339208237) && (class523_sub39_sub2.method16519(-1710127427) < 2141365743 * Class170.anInt1833) && (class523_sub39_sub2.method16520((byte) 127) < Class254.anInt2742 * -495986435) && class523_sub39_sub2.method16519(934243404) >= 0 && class523_sub39_sub2.method16520((byte) 127) >= 0) {
						int i = class523_sub39_sub2.method16518(-1905499279);
						if (class523_sub39_sub2.method16518(-1905499279) == -1)
							aClass637_Sub1_8343.method10455(class523_sub39_sub2, -2117255032);
						else if (Class597.method9848(i, -1513548844))
							aClass637_Sub1_8343.method16689(class523_sub39_sub2, (byte) 9);
					}
				}
			}
		}
	}

	public static void method10547() {
		synchronized (aQueue8346) {
			for (;;) {
				Class523_Sub39_Sub2 class523_sub39_sub2 = (Class523_Sub39_Sub2) aQueue8346.poll();
				if (class523_sub39_sub2 == null)
					break;
				class523_sub39_sub2.method16523((byte) 28);
			}
		}
	}

	static void method10548() {
		synchronized (aQueue8346) {
			Point point;
			if (Class523_Sub18_Sub8.aCanvas11689.isShowing())
				point = Class523_Sub18_Sub8.aCanvas11689.getLocationOnScreen();
			else
				point = null;
			for (;;) {
				Class523_Sub39_Sub2 class523_sub39_sub2 = (Class523_Sub39_Sub2) aQueue8346.poll();
				if (class523_sub39_sub2 == null)
					break;
				if (null == point || !Class523_Sub18_Sub8.aCanvas11689.isShowing() || !Class341.aBool3608)
					class523_sub39_sub2.method16523((byte) 18);
				else {
					class523_sub39_sub2.method18167(point, (byte) 22);
					if (!class523_sub39_sub2.method18180(-1461359207) && (class523_sub39_sub2.method16519(870801352) < 2141365743 * Class170.anInt1833) && (class523_sub39_sub2.method16520((byte) 127) < Class254.anInt2742 * -495986435) && class523_sub39_sub2.method16519(-31162597) >= 0 && class523_sub39_sub2.method16520((byte) 127) >= 0) {
						int i = class523_sub39_sub2.method16518(-1905499279);
						if (class523_sub39_sub2.method16518(-1905499279) == -1)
							aClass637_Sub1_8343.method10455(class523_sub39_sub2, -2136602462);
						else if (Class597.method9848(i, -1952596207))
							aClass637_Sub1_8343.method16689(class523_sub39_sub2, (byte) -28);
					}
				}
			}
		}
	}

	public static void method10549() {
		Class566.method9501(-726575699);
		aClass637_Sub2_8341.method10450((byte) 0);
		aClass637_Sub1_8343.method10450((byte) 0);
		if (client.anInt11184 * -751939039 > 0) {
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4302, (client.aClass116_11058.aClass11_1413), 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(client.anInt11184 * 1287211140, (byte) -16);
			for (int i = 0; i < -751939039 * client.anInt11184; i++) {
				Interface64 interface64 = client.anInterface64Array11194[i];
				long l = (interface64.method424(1957824745) - 3538733483904203517L * aLong8344);
				if (l > 16777215L)
					l = 16777215L;
				aLong8344 = interface64.method424(1854620418) * -743130525740469675L;
				class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(interface64.method390(-625988426), -339596785);
				class523_sub22.aClass523_Sub34_Sub2_10525.method16330((int) l, (byte) 0);
			}
			client.aClass116_11058.method1974(class523_sub22, (byte) 120);
		}
		if (-136327131 * anInt8342 > 0)
			anInt8342 -= 1895287725;
		if (client.aBool11111 && anInt8342 * -136327131 <= 0) {
			anInt8342 = -748951164;
			client.aBool11111 = false;
			int i;
			int i_5_;
			if (Class562.anInt7564 * 2097396553 == 2) {
				if (Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5342(-1390175100) == Class291.aClass291_3148) {
					Class328_Sub2 class328_sub2 = ((Class328_Sub2) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5430(2044975438));
					i = Class673.method13726(class328_sub2.aClass440_10072, (byte) 0) >> 3;
					int i_6_ = 1024;
					i_5_ = (i_6_ * 3 - (Class67.method1457(class328_sub2.aClass440_10072, (byte) 16) >> 3)) % (i_6_ * 2);
				} else {
					i = 0;
					i_5_ = 0;
				}
			} else {
				i = (int) client.aFloat11214 >> 3;
				i_5_ = (int) client.aFloat11129 >> 3;
			}
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.MOVE_CAMERA_PACKET, (client.aClass116_11058.aClass11_1413), 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeShort128(i, -1262882661);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE128(i_5_, 2054378373);
			client.aClass116_11058.method1974(class523_sub22, (byte) 22);
		}
		if (Class341.aBool3608 != aBool8345) {
			aBool8345 = Class341.aBool3608;
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4229, (client.aClass116_11058.aClass11_1413), 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(Class341.aBool3608 ? 1 : 0, 1552263674);
			client.aClass116_11058.method1974(class523_sub22, (byte) 73);
		}
		if (!client.aBool11012) {
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4208, (client.aClass116_11058.aClass11_1413), 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(0, -1497320384);
			int i = (2349011 * class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661);
			Class523_Sub34 class523_sub34 = Class449.aClass523_Sub33_4946.method16233((short) 9256);
			class523_sub22.aClass523_Sub34_Sub2_10525.readBytes(class523_sub34.aByteArray10658, 0, class523_sub34.anInt10661 * 2349011, (short) -29303);
			class523_sub22.aClass523_Sub34_Sub2_10525.method16276((class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 * 2349011) - i, 840041915);
			client.aClass116_11058.method1974(class523_sub22, (byte) 101);
			client.aBool11012 = true;
		}
		if (!client.aBool11013 && Class449.aClass523_Sub33_4946.aClass687_Sub1_10629.method16678((byte) 10) == 1) {
			int[] is = Class31.aClass178_303.method3418();
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4263, (client.aClass116_11058.aClass11_1413), 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(0, (byte) -102);
			int i = (2349011 * class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661);
			if (null != is && 0 != is.length) {
				class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(1, -953707918);
				Class137[] class137s = Class137.method2280((byte) 114);
				HashSet hashset = new HashSet();
				ArrayList arraylist = new ArrayList();
				for (int i_7_ = 0; i_7_ < is.length; i_7_++) {
					boolean bool = false;
					for (int i_8_ = 0; i_8_ < class137s.length; i_8_++) {
						if (is[i_7_] == class137s[i_8_].anInt1631) {
							hashset.add(class137s[i_8_]);
							bool = true;
							break;
						}
					}
					if (!bool)
						arraylist.add(Integer.valueOf(is[i_7_]));
				}
				Class650.method10626(hashset, class523_sub22.aClass523_Sub34_Sub2_10525, (short) -14157);
				class523_sub22.aClass523_Sub34_Sub2_10525.method16277(arraylist.size(), (byte) 8);
				if (arraylist.size() > 0) {
					int i_9_ = 2147483647;
					Iterator iterator = arraylist.iterator();
					while (iterator.hasNext()) {
						Integer integer = (Integer) iterator.next();
						if (integer.intValue() < i_9_)
							i_9_ = integer.intValue();
					}
					class523_sub22.aClass523_Sub34_Sub2_10525.method16459(i_9_, (byte) 0);
					iterator = arraylist.iterator();
					while (iterator.hasNext()) {
						Integer integer = (Integer) iterator.next();
						if (integer.intValue() != i_9_)
							class523_sub22.aClass523_Sub34_Sub2_10525.method16459(integer.intValue() - i_9_, (byte) 0);
					}
				}
			} else
				class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(0, -652607016);
			class523_sub22.aClass523_Sub34_Sub2_10525.method16275((class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 * 2349011) - i, -801116874);
			client.aClass116_11058.method1974(class523_sub22, (byte) 99);
			client.aBool11013 = true;
		}
	}

	static Class523_Sub27_Sub19 method10550(byte[] is, byte i) {
		return new Class523_Sub27_Sub19(new Class523_Sub34(is), Class570.anInterface19_7657);
	}

	static final void method10551(Class669 class669, byte i) {
		Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub10_10619, (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]), -567754656);
		client.aClass505_11019.method8294(-889374440);
		Class211.method3824(1273365044);
		client.aBool11012 = false;
	}

	public static void method10552(int i, int i_10_, String string, String string_11_, String string_12_, String string_13_, String string_14_, int i_15_, Class421 class421, byte i_16_) {
		Class261 class261 = (Class261) Class271.aMap2878.get(Integer.valueOf(i));
		if (null == class261) {
			class261 = new Class261();
			Class271.aMap2878.put(Integer.valueOf(i), class261);
		}
		Class523_Sub27_Sub15 class523_sub27_sub15 = class261.method4713(i, i_10_, string, string_11_, string_12_, string_13_, string_14_, i_15_, class421, 2093091354);
		Class271.aClass14_2876.method738(class523_sub27_sub15, (long) (1066462451 * (class523_sub27_sub15.anInt11762)));
		Class271.aClass697_2877.method14030(class523_sub27_sub15, (byte) -14);
		client.anInt11229 = client.anInt11251 * -208551861;
	}

	public static void method10553(Class242 class242, Class250 class250, boolean bool, byte i) {
		Class170.method2890(class242.aClass250Array2457, class250, bool, -1982972251);
	}

	public static void method10554(int[] is, Object[] objects, int i, int i_17_, byte i_18_) {
		if (i < i_17_) {
			int i_19_ = (i + i_17_) / 2;
			int i_20_ = i;
			int i_21_ = is[i_19_];
			is[i_19_] = is[i_17_];
			is[i_17_] = i_21_;
			Object object = objects[i_19_];
			objects[i_19_] = objects[i_17_];
			objects[i_17_] = object;
			int i_22_ = 2147483647 == i_21_ ? 0 : 1;
			for (int i_23_ = i; i_23_ < i_17_; i_23_++) {
				if (is[i_23_] < (i_23_ & i_22_) + i_21_) {
					int i_24_ = is[i_23_];
					is[i_23_] = is[i_20_];
					is[i_20_] = i_24_;
					Object object_25_ = objects[i_23_];
					objects[i_23_] = objects[i_20_];
					objects[i_20_++] = object_25_;
				}
			}
			is[i_17_] = is[i_20_];
			is[i_20_] = i_21_;
			objects[i_17_] = objects[i_20_];
			objects[i_20_] = object;
			method10554(is, objects, i, i_20_ - 1, (byte) 55);
			method10554(is, objects, i_20_ + 1, i_17_, (byte) 22);
		}
	}

	static void method10555(Class178 class178, Class523_Sub32 class523_sub32, Class239 class239, byte i) {
		Class148 class148 = class239.method4316(class178, -2133737187);
		if (null != class148) {
			int i_26_ = class148.method2504();
			if (class148.method2428() > i_26_)
				i_26_ = class148.method2428();
			int i_27_ = 10;
			int i_28_ = -800911491 * class523_sub32.anInt10583;
			int i_29_ = class523_sub32.anInt10584 * 1992498959;
			int i_30_ = 0;
			int i_31_ = 0;
			if (null != class239.aString2441) {
				i_31_ = Class305.aClass10_3347.method605(class239.aString2441, (2141365743 * Class170.anInt1833), 0, null, 717498534);
				i_30_ = Class305.aClass10_3347.method602(class239.aString2441, (2141365743 * Class170.anInt1833), null, 622545099);
			}
			int i_32_ = i_26_ / 2 + class523_sub32.anInt10583 * -800911491;
			int i_33_ = 1992498959 * class523_sub32.anInt10584;
			if (i_28_ < i_26_ + Class534_Sub1.anInt7200) {
				i_28_ = Class534_Sub1.anInt7200;
				i_32_ = 5 + (i_30_ / 2 + (Class534_Sub1.anInt7200 + i_26_ / 2 + i_27_));
			} else if (i_28_ > Class534_Sub1.anInt7202 - i_26_) {
				i_28_ = Class534_Sub1.anInt7202 - i_26_;
				i_32_ = (Class534_Sub1.anInt7202 - i_26_ / 2 - i_27_ - i_30_ / 2 - 5);
			}
			if (i_29_ < i_26_ + Class534_Sub1.anInt7201) {
				i_29_ = Class534_Sub1.anInt7201;
				i_33_ = i_26_ / 2 + (Class534_Sub1.anInt7201 + i_27_);
			} else if (i_29_ > Class534_Sub1.anInt7203 - i_26_) {
				i_29_ = Class534_Sub1.anInt7203 - i_26_;
				i_33_ = Class534_Sub1.anInt7203 - i_26_ / 2 - i_27_ - i_31_;
			}
			int i_34_ = ((int) (Math.atan2((double) (i_28_ - (class523_sub32.anInt10583 * -800911491)), (double) (i_29_ - 1992498959 * (class523_sub32.anInt10584))) / 3.141592653589793 * 32767.0) & 0xffff);
			class148.method2444((float) i_26_ / 2.0F + (float) i_28_, (float) i_29_ + (float) i_26_ / 2.0F, 4096, i_34_);
			int i_35_ = -2;
			int i_36_ = -2;
			int i_37_ = -2;
			int i_38_ = -2;
			if (class239.aString2441 != null) {
				i_35_ = i_32_ - i_30_ / 2 - 5;
				i_36_ = i_33_;
				i_37_ = 10 + (i_35_ + i_30_);
				i_38_ = i_31_ + i_36_ + 3;
				if (0 != class239.anInt2428 * 1211490045)
					class178.method3354(i_35_, i_36_, i_37_ - i_35_, i_38_ - i_36_, 1211490045 * class239.anInt2428, (byte) 55);
				if (789268719 * class239.anInt2406 != 0)
					class178.method3077(i_35_, i_36_, i_37_ - i_35_, i_38_ - i_36_, 789268719 * class239.anInt2406, 1890072767);
				Class162.aClass164_1771.method2628(class239.aString2441, i_32_, i_33_, i_30_, i_31_, ~0xffffff | class239.anInt2404 * 488894273, Class534_Sub1.aClass624_7158.anInt8121 * 248301987, 1, 0, 0, null, null, null, 0, 0, -736946658);
			}
			if (class239.anInt2410 * 924656729 != -1 || null != class239.aString2441) {
				Class523_Sub16 class523_sub16 = new Class523_Sub16(class523_sub32);
				class523_sub16.anInt10478 = (i_28_ - i_26_ / 2) * 869645037;
				class523_sub16.anInt10476 = (i_28_ + i_26_ / 2) * 939278321;
				class523_sub16.anInt10474 = -1186220603 * (i_29_ - i_26_);
				class523_sub16.anInt10475 = -1175464923 * i_29_;
				class523_sub16.anInt10477 = i_35_ * -226965029;
				class523_sub16.anInt10480 = i_37_ * 721391071;
				class523_sub16.anInt10473 = -72187705 * i_36_;
				class523_sub16.anInt10479 = i_38_ * 481175931;
				Class629.aClass708_8229.method14236(class523_sub16, 46358633);
			}
		}
	}
}
