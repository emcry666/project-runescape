/* Class61 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Calendar;

public class Class61 {
	static int anInt767;
	static Class175 aClass175_768;
	public static Class633 aClass633_769;

	public Class61() {
		System.nanoTime();
	}

	public long method1412(int i) {
		return System.nanoTime();
	}

	public long method1413() {
		return System.nanoTime();
	}

	public static void method1414(boolean bool, int i) {
		if (-1616721887 * client.anInt11071 != 2 && client.anInt11071 * -1616721887 != 3) {
			if (!bool) {
				if (Class174.aClass194Array1855 != null) {
					Class194[] class194s = Class174.aClass194Array1855;
					for (int i_0_ = 0; i_0_ < class194s.length; i_0_++) {
						Class194 class194 = class194s[i_0_];
						class194.method3652(-1646445930);
					}
				}
				if (Class191.anInt2161 * 612421353 != -1)
					Class254.aClass217_2743.sendMusic((Class191.anInt2161 * 612421353), 255, (byte) -64);
			}
			client.anInt11071 = 872249282;
			Class145_Sub1.aClass523_Sub34_9522 = null;
			client.aBool11072 = false;
			if (-655720215 * Class191.anInt2155 > 0)
				Class486.method7941(Class572.aClass572_7679, -655720215 * Class191.anInt2155, -1, -886052652);
			Class112.method1945(452998539);
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4223, (client.aClass116_11058.aClass11_1413), 1370050649);
			class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(bool ? 1 : 0, 409539831);
			client.aClass116_11058.method1974(class523_sub22, (byte) 80);
		}
	}

	static final void method1415(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	static String method1416(long l, int i, boolean bool, int i_1_) {
		Calendar calendar;
		if (bool) {
			Class168_Sub2.method15410(l);
			calendar = Class91.aCalendar894;
		} else {
			Class17.method776(l);
			calendar = Class91.aCalendar893;
		}
		int i_2_ = calendar.get(5);
		int i_3_ = calendar.get(2) + 1;
		int i_4_ = calendar.get(1);
		int i_5_ = calendar.get(11);
		int i_6_ = calendar.get(12);
		return new StringBuilder().append(Integer.toString(i_2_ / 10)).append(i_2_ % 10).append("/").append(i_3_ / 10).append(i_3_ % 10).append("/").append(i_4_ % 100 / 10).append(i_4_ % 10).append(" ").append(i_5_ / 10).append(i_5_ % 10).append(":").append(i_6_ / 10).append(i_6_ % 10).toString();
	}

	static final void method1417(Class669 class669, int i) {
		Class523_Sub27_Sub17 class523_sub27_sub17 = Class534.method8813(class669.anIntArray8557[((class669.anInt8558 -= 2138772399) * 1357652815)]);
		if (class523_sub27_sub17 == null || null == class523_sub27_sub17.aString11823)
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
		else
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = class523_sub27_sub17.aString11823;
	}

	public static int method1418(byte i) {
		return Class271.anInt2875 * -706897381 - 1;
	}

	static final void method1419(Class669 class669, short i) {
		int i_7_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub16_10624.method13890(i_7_, 1966539280);
	}

	static void method1420(String[] strings, int i) {
		if (strings.length > 1) {
			for (int i_8_ = 0; i_8_ < strings.length; i_8_++) {
				if (strings[i_8_].startsWith("pause")) {
					int i_9_ = 5;
					try {
						i_9_ = Integer.parseInt(strings[i_8_].substring(6));
					} catch (Exception exception) {
						/* empty */
					}
					Class485.method7932(new StringBuilder().append("Pausing for ").append(i_9_).append(" seconds...").toString(), (byte) -31);
					Class53_Sub6.aStringArray10968 = strings;
					Class95.anInt1176 = (i_8_ + 1) * -1190962299;
					Class687_Sub24.aLong10885 = (Class248.method4401(1516375036) + (long) (i_9_ * 1000)) * 1332324763258881553L;
					break;
				}
				Class95.aString1171 = strings[i_8_];
				Class628.method10314(false, (byte) -1);
			}
		} else {
			Class95.aString1171 = new StringBuilder().append(Class95.aString1171).append(strings[0]).toString();
			Class95.anInt1173 += strings[0].length() * 331909503;
		}
	}

	static final void method1421(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_10_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_11_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class54.method1350(i_10_, i_11_, true, (byte) -38);
	}
}
