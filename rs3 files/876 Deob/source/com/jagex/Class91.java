/* Class91 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Class91 {
	static String[][] aStringArrayArray892 = { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "M\u00e4r", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "f\u00e9v", "mars", "avr", "mai", "juin", "juil", "ao\u00fbt", "sept", "oct", "nov", "d\u00e9c" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" }, { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic" } };
	static Calendar aCalendar893 = Calendar.getInstance();
	static Calendar aCalendar894 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	static int anInt895;

	Class91() throws Throwable {
		throw new Error();
	}

	public static String method1630(long l, int i) {
		Class17.method776(l);
		int i_0_ = aCalendar893.get(5);
		int i_1_ = aCalendar893.get(2);
		int i_2_ = aCalendar893.get(1);
		if (i == 3)
			return Class477.method7890(l, i, -2030271607);
		return new StringBuilder().append(Integer.toString(i_0_ / 10)).append(i_0_ % 10).append("-").append(aStringArrayArray892[i][i_1_]).append("-").append(i_2_).toString();
	}

	public static String method1631(long l, int i) {
		Class17.method776(l);
		int i_3_ = aCalendar893.get(5);
		int i_4_ = aCalendar893.get(2);
		int i_5_ = aCalendar893.get(1);
		if (i == 3)
			return Class477.method7890(l, i, -2019184321);
		return new StringBuilder().append(Integer.toString(i_3_ / 10)).append(i_3_ % 10).append("-").append(aStringArrayArray892[i][i_4_]).append("-").append(i_5_).toString();
	}

	static void method1632(long l) {
		aCalendar893.setTime(new Date(l));
	}

	public static String method1633(long l, int i) {
		Class17.method776(l);
		int i_6_ = aCalendar893.get(5);
		int i_7_ = aCalendar893.get(2);
		int i_8_ = aCalendar893.get(1);
		if (i == 3)
			return Class477.method7890(l, i, -2058192292);
		return new StringBuilder().append(Integer.toString(i_6_ / 10)).append(i_6_ % 10).append("-").append(aStringArrayArray892[i][i_7_]).append("-").append(i_8_).toString();
	}

	public static int method1634(long l) {
		Class17.method776(l);
		return aCalendar893.get(1);
	}

	public static String method1635(long l, int i, boolean bool) {
		Calendar calendar;
		if (bool) {
			Class168_Sub2.method15410(l);
			calendar = aCalendar894;
		} else {
			Class17.method776(l);
			calendar = aCalendar893;
		}
		int i_9_ = calendar.get(5);
		int i_10_ = calendar.get(2);
		int i_11_ = calendar.get(1);
		int i_12_ = calendar.get(11);
		int i_13_ = calendar.get(12);
		if (i == 3)
			return Class61.method1416(l, i, bool, 1458500289);
		return new StringBuilder().append(Integer.toString(i_9_ / 10)).append(i_9_ % 10).append("-").append(aStringArrayArray892[i][i_10_]).append("-").append(i_11_).append(" ").append(i_12_ / 10).append(i_12_ % 10).append(":").append(i_13_ / 10).append(i_13_ % 10).toString();
	}

	public static int[] method1636(int i) {
		int[] is = new int[3];
		Class17.method776(Class524.method8684(i, 1050369988));
		is[0] = aCalendar893.get(5);
		is[1] = aCalendar893.get(2);
		is[2] = aCalendar893.get(1);
		return is;
	}

	static String method1637(long l, int i, boolean bool) {
		Calendar calendar;
		if (bool) {
			Class168_Sub2.method15410(l);
			calendar = aCalendar894;
		} else {
			Class17.method776(l);
			calendar = aCalendar893;
		}
		int i_14_ = calendar.get(5);
		int i_15_ = calendar.get(2) + 1;
		int i_16_ = calendar.get(1);
		int i_17_ = calendar.get(11);
		int i_18_ = calendar.get(12);
		return new StringBuilder().append(Integer.toString(i_14_ / 10)).append(i_14_ % 10).append("/").append(i_15_ / 10).append(i_15_ % 10).append("/").append(i_16_ % 100 / 10).append(i_16_ % 10).append(" ").append(i_17_ / 10).append(i_17_ % 10).append(":").append(i_18_ / 10).append(i_18_ % 10).toString();
	}

	static String method1638(long l, int i, boolean bool) {
		Calendar calendar;
		if (bool) {
			Class168_Sub2.method15410(l);
			calendar = aCalendar894;
		} else {
			Class17.method776(l);
			calendar = aCalendar893;
		}
		int i_19_ = calendar.get(5);
		int i_20_ = calendar.get(2) + 1;
		int i_21_ = calendar.get(1);
		int i_22_ = calendar.get(11);
		int i_23_ = calendar.get(12);
		return new StringBuilder().append(Integer.toString(i_19_ / 10)).append(i_19_ % 10).append("/").append(i_20_ / 10).append(i_20_ % 10).append("/").append(i_21_ % 100 / 10).append(i_21_ % 10).append(" ").append(i_22_ / 10).append(i_22_ % 10).append(":").append(i_23_ / 10).append(i_23_ % 10).toString();
	}

	static String method1639(long l, int i) {
		Class17.method776(l);
		int i_24_ = aCalendar893.get(5);
		int i_25_ = aCalendar893.get(2) + 1;
		int i_26_ = aCalendar893.get(1);
		return new StringBuilder().append(Integer.toString(i_24_ / 10)).append(i_24_ % 10).append("/").append(i_25_ / 10).append(i_25_ % 10).append("/").append(i_26_ % 100 / 10).append(i_26_ % 10).toString();
	}

	static String method1640(long l, int i) {
		Class17.method776(l);
		int i_27_ = aCalendar893.get(5);
		int i_28_ = aCalendar893.get(2) + 1;
		int i_29_ = aCalendar893.get(1);
		return new StringBuilder().append(Integer.toString(i_27_ / 10)).append(i_27_ % 10).append("/").append(i_28_ / 10).append(i_28_ % 10).append("/").append(i_29_ % 100 / 10).append(i_29_ % 10).toString();
	}

	public static String method1641(long l, int i) {
		Class17.method776(l);
		int i_30_ = aCalendar893.get(11);
		int i_31_ = aCalendar893.get(12);
		int i_32_ = aCalendar893.get(13);
		return new StringBuilder().append(Integer.toString(i_30_ / 10)).append(i_30_ % 10).append(":").append(i_31_ / 10).append(i_31_ % 10).append(":").append(i_32_ / 10).append(i_32_ % 10).toString();
	}

	public static String method1642(long l, int i) {
		Class17.method776(l);
		int i_33_ = aCalendar893.get(11);
		int i_34_ = aCalendar893.get(12);
		int i_35_ = aCalendar893.get(13);
		return new StringBuilder().append(Integer.toString(i_33_ / 10)).append(i_33_ % 10).append(":").append(i_34_ / 10).append(i_34_ % 10).append(":").append(i_35_ / 10).append(i_35_ % 10).toString();
	}

	public static int method1643(long l) {
		return (int) (l / 86400000L) - 11745;
	}

	public static int[] method1644(int i) {
		int[] is = new int[3];
		Class17.method776(Class524.method8684(i, 1050369988));
		is[0] = aCalendar893.get(5);
		is[1] = aCalendar893.get(2);
		is[2] = aCalendar893.get(1);
		return is;
	}

	static void method1645(long l) {
		aCalendar894.setTime(new Date(l));
	}

	public static String method1646(long l, int i) {
		Class17.method776(l);
		int i_36_ = aCalendar893.get(5);
		int i_37_ = aCalendar893.get(2);
		int i_38_ = aCalendar893.get(1);
		if (i == 3)
			return Class477.method7890(l, i, -2036961772);
		return new StringBuilder().append(Integer.toString(i_36_ / 10)).append(i_36_ % 10).append("-").append(aStringArrayArray892[i][i_37_]).append("-").append(i_38_).toString();
	}

	static void method1647(long l) {
		aCalendar894.setTime(new Date(l));
	}

	static void method1648(long l) {
		aCalendar893.setTime(new Date(l));
	}

	static void method1649(long l) {
		aCalendar893.setTime(new Date(l));
	}

	static void method1650(long l) {
		aCalendar894.setTime(new Date(l));
	}

	static void method1651(long l) {
		aCalendar894.setTime(new Date(l));
	}

	public static String method1652(long l, int i, boolean bool) {
		Calendar calendar;
		if (bool) {
			Class168_Sub2.method15410(l);
			calendar = aCalendar894;
		} else {
			Class17.method776(l);
			calendar = aCalendar893;
		}
		int i_39_ = calendar.get(5);
		int i_40_ = calendar.get(2);
		int i_41_ = calendar.get(1);
		int i_42_ = calendar.get(11);
		int i_43_ = calendar.get(12);
		if (i == 3)
			return Class61.method1416(l, i, bool, 2027727655);
		return new StringBuilder().append(Integer.toString(i_39_ / 10)).append(i_39_ % 10).append("-").append(aStringArrayArray892[i][i_40_]).append("-").append(i_41_).append(" ").append(i_42_ / 10).append(i_42_ % 10).append(":").append(i_43_ / 10).append(i_43_ % 10).toString();
	}

	public static long method1653(int i, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_) {
		aCalendar894.clear();
		aCalendar894.set(i_48_, i_47_, i_46_, i_45_, i_44_, i);
		return aCalendar894.getTime().getTime();
	}

	public static long method1654(int i) {
		return 86400000L * (long) (i + 11745);
	}

	static String method1655(long l, int i, boolean bool) {
		Calendar calendar;
		if (bool) {
			Class168_Sub2.method15410(l);
			calendar = aCalendar894;
		} else {
			Class17.method776(l);
			calendar = aCalendar893;
		}
		int i_49_ = calendar.get(5);
		int i_50_ = calendar.get(2) + 1;
		int i_51_ = calendar.get(1);
		int i_52_ = calendar.get(11);
		int i_53_ = calendar.get(12);
		return new StringBuilder().append(Integer.toString(i_49_ / 10)).append(i_49_ % 10).append("/").append(i_50_ / 10).append(i_50_ % 10).append("/").append(i_51_ % 100 / 10).append(i_51_ % 10).append(" ").append(i_52_ / 10).append(i_52_ % 10).append(":").append(i_53_ / 10).append(i_53_ % 10).toString();
	}

	public static int method1656(long l) {
		Class17.method776(l);
		return aCalendar893.get(1);
	}

	static boolean method1657(int i, byte i_54_) {
		return 8 == i || i == 6;
	}

	static final void method1658(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_55_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_56_ = class669.anIntArray8557[1 + class669.anInt8558 * 1357652815];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (58299499 * client.exchangeOfferSlots[i_56_][i_55_].anInt5471);
	}

	public static void method1659(int i, int i_57_, int i_58_, int i_59_, int i_60_) {
		for (Class523_Sub3 class523_sub3 = ((Class523_Sub3) Class523_Sub3.aClass708_10364.method14240(1310395284)); class523_sub3 != null; class523_sub3 = (Class523_Sub3) Class523_Sub3.aClass708_10364.method14244((byte) -36))
			VarBitDefinitions.method5618(class523_sub3, i, i_57_, i_58_, i_59_, -612749705);
		for (Class523_Sub3 class523_sub3 = ((Class523_Sub3) Class523_Sub3.aClass708_10365.method14240(1934237631)); null != class523_sub3; class523_sub3 = (Class523_Sub3) Class523_Sub3.aClass708_10365.method14244((byte) 32)) {
			int i_61_ = 1;
			Class588 class588 = class523_sub3.aClass647_Sub1_Sub3_Sub1_Sub1_10380.method18352(1470190885);
			int i_62_ = class523_sub3.aClass647_Sub1_Sub3_Sub1_Sub1_10380.aClass707_Sub1_11887.method14163(-1981575963);
			if (-1 == i_62_ || (class523_sub3.aClass647_Sub1_Sub3_Sub1_Sub1_10380.aClass707_Sub1_11887.aBool10956))
				i_61_ = 0;
			else if (684302799 * class588.anInt7772 == i_62_ || i_62_ == 1369343077 * class588.anInt7759 || class588.anInt7761 * 1751585825 == i_62_ || -893536895 * class588.anInt7760 == i_62_)
				i_61_ = 2;
			else if (87001555 * class588.anInt7762 == i_62_ || class588.anInt7763 * 1855181421 == i_62_ || class588.anInt7765 * -613234717 == i_62_ || i_62_ == 791380503 * class588.anInt7764)
				i_61_ = 3;
			if (-1490472817 * class523_sub3.anInt10384 != i_61_) {
				int i_63_ = (Class297_Sub1.method15556(class523_sub3.aClass647_Sub1_Sub3_Sub1_Sub1_10380, (byte) 50));
				NPCDefinition class300 = (class523_sub3.aClass647_Sub1_Sub3_Sub1_Sub1_10380.aClass300_12175);
				if (class300.anIntArray3286 != null)
					class300 = class300.method5490((Class98_Sub1_Sub2.playerVarsProvider), (Class98_Sub1_Sub2.playerVarsProvider), (byte) -93);
				if (null == class300 || i_63_ == -1) {
					class523_sub3.anInt10388 = -1504599617;
					class523_sub3.anInt10384 = 932310639 * i_61_;
				} else if (class523_sub3.anInt10388 * 2086711745 != i_63_) {
					boolean bool = false;
					if (null != class523_sub3.aClass489_10389) {
						class523_sub3.anInt10376 -= 1110050304;
						if (-815661653 * class523_sub3.anInt10376 <= 0) {
							class523_sub3.aClass489_10389.method7960(100, (byte) 52);
							Class254.aClass217_2743.method3864(class523_sub3.aClass489_10389, (byte) 24);
							class523_sub3.aClass489_10389 = null;
							bool = true;
						}
					} else
						bool = true;
					if (bool) {
						class523_sub3.anInt10376 = class300.anInt3307 * -6876383;
						class523_sub3.anInt10388 = 1504599617 * i_63_;
						class523_sub3.anInt10384 = i_61_ * 932310639;
					}
				} else {
					class523_sub3.anInt10384 = 932310639 * i_61_;
					class523_sub3.anInt10376 = class300.anInt3307 * -6876383;
				}
			}
			Class437 class437 = (class523_sub3.aClass647_Sub1_Sub3_Sub1_Sub1_10380.method10569().aClass437_4862);
			class523_sub3.anInt10378 = -106182451 * (int) class437.aFloat4903;
			class523_sub3.anInt10370 = ((int) class437.aFloat4903 + (class523_sub3.aClass647_Sub1_Sub3_Sub1_Sub1_10380.method18338(2145938564) << 8)) * -1164689503;
			class523_sub3.anInt10373 = 439720901 * (int) class437.aFloat4905;
			class523_sub3.anInt10371 = ((int) class437.aFloat4905 + (class523_sub3.aClass647_Sub1_Sub3_Sub1_Sub1_10380.method18338(2146372609) << 8)) * -979668627;
			class523_sub3.anInt10369 = (class523_sub3.aClass647_Sub1_Sub3_Sub1_Sub1_10380.aByte10821 * 1017270297);
			VarBitDefinitions.method5618(class523_sub3, i, i_57_, i_58_, i_59_, -14335431);
		}
		for (Class523_Sub3 class523_sub3 = ((Class523_Sub3) Class523_Sub3.aClass14_10390.method735(-380907255)); class523_sub3 != null; class523_sub3 = (Class523_Sub3) Class523_Sub3.aClass14_10390.method749(1290016074)) {
			int i_64_ = 1;
			Class588 class588 = class523_sub3.aClass647_Sub1_Sub3_Sub1_Sub2_10368.method18352(-443520768);
			int i_65_ = class523_sub3.aClass647_Sub1_Sub3_Sub1_Sub2_10368.aClass707_Sub1_11887.method14163(-1907793295);
			if (-1 == i_65_ || (class523_sub3.aClass647_Sub1_Sub3_Sub1_Sub2_10368.aClass707_Sub1_11887.aBool10956))
				i_64_ = 0;
			else if (i_65_ == 684302799 * class588.anInt7772 || class588.anInt7759 * 1369343077 == i_65_ || 1751585825 * class588.anInt7761 == i_65_ || class588.anInt7760 * -893536895 == i_65_)
				i_64_ = 2;
			else if (i_65_ == 87001555 * class588.anInt7762 || i_65_ == class588.anInt7763 * 1855181421 || i_65_ == class588.anInt7765 * -613234717 || class588.anInt7764 * 791380503 == i_65_)
				i_64_ = 3;
			if (i_64_ != -1490472817 * class523_sub3.anInt10384) {
				int i_66_ = (Class194_Sub3.method15489(class523_sub3.aClass647_Sub1_Sub3_Sub1_Sub2_10368, (byte) 16));
				if (2086711745 * class523_sub3.anInt10388 != i_66_) {
					boolean bool = false;
					if (null != class523_sub3.aClass489_10389) {
						class523_sub3.anInt10376 -= 1110050304;
						if (class523_sub3.anInt10376 * -815661653 <= 0) {
							class523_sub3.aClass489_10389.method7960(100, (byte) 106);
							Class254.aClass217_2743.method3864(class523_sub3.aClass489_10389, (byte) 24);
							class523_sub3.aClass489_10389 = null;
							bool = true;
						}
					} else
						bool = true;
					if (bool) {
						class523_sub3.anInt10376 = (-1398348283 * (class523_sub3.aClass647_Sub1_Sub3_Sub1_Sub2_10368.anInt12198));
						class523_sub3.anInt10388 = i_66_ * 1504599617;
						class523_sub3.anInt10384 = i_64_ * 932310639;
					}
				} else {
					class523_sub3.anInt10376 = -1398348283 * (class523_sub3.aClass647_Sub1_Sub3_Sub1_Sub2_10368.anInt12198);
					class523_sub3.anInt10384 = 932310639 * i_64_;
				}
			}
			Class437 class437 = (class523_sub3.aClass647_Sub1_Sub3_Sub1_Sub2_10368.method10569().aClass437_4862);
			class523_sub3.anInt10378 = -106182451 * (int) class437.aFloat4903;
			class523_sub3.anInt10370 = ((int) class437.aFloat4903 + (class523_sub3.aClass647_Sub1_Sub3_Sub1_Sub2_10368.method18338(2143994645) << 8)) * -1164689503;
			class523_sub3.anInt10373 = (int) class437.aFloat4905 * 439720901;
			class523_sub3.anInt10371 = ((int) class437.aFloat4905 + (class523_sub3.aClass647_Sub1_Sub3_Sub1_Sub2_10368.method18338(2143193510) << 8)) * -979668627;
			class523_sub3.anInt10369 = 1017270297 * (class523_sub3.aClass647_Sub1_Sub3_Sub1_Sub2_10368.aByte10821);
			VarBitDefinitions.method5618(class523_sub3, i, i_57_, i_58_, i_59_, -1856754118);
		}
	}

	static final void method1660(Class669 class669, int i) {
		class669.anInt8558 -= 2138772399;
	}
}
