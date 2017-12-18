/* Class95 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Class95 {
	static int anInt1162;
	static int anInt1163;
	static boolean aBool1164;
	static String[] aStringArray1165;
	static int anInt1166;
	static int anInt1167;
	static final int anInt1168 = 100;
	static FileOutputStream aFileOutputStream1169;
	static int[] anIntArray1170;
	static String aString1171;
	static final String aString1172 = "Success";
	static int anInt1173;
	static boolean aBool1174;
	static final int anInt1175 = 350;
	static int anInt1176;
	static int anInt1177;
	static final String aString1178 = "\\/.:, _-+[]~@";
	static int anInt1179 = 0;
	static final String aString1180 = "Failure";

	static void method1723() {
		/* empty */
	}

	static {
		anInt1177 = 0;
		aBool1174 = true;
		aString1171 = "";
		anInt1166 = 0;
		anInt1173 = 0;
		anInt1162 = 0;
		aBool1164 = false;
		anInt1176 = 1190962299;
	}

	static void method1724() {
		if (aFileOutputStream1169 != null) {
			try {
				aFileOutputStream1169.close();
			} catch (IOException ioexception) {
				/* empty */
			}
		}
		aFileOutputStream1169 = null;
	}

	static void method1725() {
		if (Class70.method1479(-2143799019)) {
			if (aStringArray1165 == null)
				Class257.method4687(1082478968);
			aBool1164 = true;
			anInt1162 = 0;
			anIntArray1170 = new int[100];
			Class15.anIntArray184 = new int[100];
			Class338.anIntArray3574 = new int[100];
			Class318.anIntArray3430 = new int[100];
			for (int i = 0; i < 100; i++) {
				anIntArray1170[i] = ((int) (Math.random() * (double) (2141365743 * Class170.anInt1833)) << 4) + (int) (Math.random() * 15.0);
				Class15.anIntArray184[i] = (int) (Math.random() * 350.0) << 4;
				Class338.anIntArray3574[i] = (int) (Math.random() * 102.0) + 51;
				Class318.anIntArray3430[i] = 8 + (int) (Math.random() * 48.0);
			}
			Class241.anIntArray2455 = new int[Class170.anInt1833 * 2141365743 >> 1];
		}
	}

	static void method1726() {
		anInt1163 = (-812688309 * Class655.aClass10_8421.anInt80 + Class655.aClass10_8421.anInt76 * -1664963719 + 410155710);
		anInt1167 = -1709923630 + (Class46.aClass10_672.anInt80 * 632200733 + Class46.aClass10_672.anInt76 * -899283713);
		aStringArray1165 = new String[500];
		for (int i = 0; i < aStringArray1165.length; i++)
			aStringArray1165[i] = "";
		Class485.method7932(Class39.aClass39_418.method1124((Class53_Sub20.aClass668_10979), (byte) -26), (byte) -115);
	}

	static void method1727(Class178 class178) {
		if (Class423.method6714(-1789475398) && Class220.method4130((byte) 0))
			Class197.method3670(0, 0, Class170.anInt1833 * 2141365743, 350, 65280);
		class178.method3378(0, 0, 2141365743 * Class170.anInt1833, 350);
		class178.method3193(0, 0, Class170.anInt1833 * 2141365743, 350, anInt1162 * -15297265 << 24 | 0x332277, 1);
		if (aBool1174) {
			for (int i = 0; i < 100; i++) {
				int i_0_ = anIntArray1170[i] >> 4;
				int i_1_ = Class15.anIntArray184[i] >> 4;
				i_0_ += (Class433.anIntArray4880[64 * (i_1_ + (i_0_ & 0x40)) & 0x3fff]) >> 10;
				if (i_0_ >= 0 && i_0_ >> 1 < Class241.anIntArray2455.length && Class241.anIntArray2455[i_0_ >> 1] >> 2 < 350 - i_1_)
					class178.method3193(i_0_, i_1_, 2, 2, (Class338.anIntArray3574[i] << 24 | 0xffffff), 1);
			}
			for (int i = 0; i < Class241.anIntArray2455.length; i++) {
				int i_2_ = Class241.anIntArray2455[i] >> 2;
				class178.method3193(i << 1, 350 - i_2_, 2, i_2_, -2130706433, 1);
			}
		}
		int i = 350 / (1887129305 * anInt1167);
		if (anInt1179 * 1497187345 > 0) {
			int i_3_ = 346 - 1887129305 * anInt1167 - 4;
			int i_4_ = i * i_3_ / (1497187345 * anInt1179 + i - 1);
			int i_5_ = 4;
			if (1497187345 * anInt1179 > 1)
				i_5_ += ((anInt1179 * 1497187345 - 1 - anInt1177 * -165903669) * (i_3_ - i_4_) / (anInt1179 * 1497187345 - 1));
			class178.method3193(2141365743 * Class170.anInt1833 - 16, i_5_, 12, i_4_, -15297265 * anInt1162 << 24 | 0x332277, 2);
			for (int i_6_ = anInt1177 * -165903669; (i_6_ < i + -165903669 * anInt1177 && i_6_ < anInt1179 * 1497187345); i_6_++) {
				String[] strings = Class194_Sub13.method15512(aStringArray1165[i_6_], '\010', (byte) 89);
				int i_7_ = ((Class170.anInt1833 * 2141365743 - 8 - 16) / strings.length);
				for (int i_8_ = 0; i_8_ < strings.length; i_8_++) {
					int i_9_ = i_8_ * i_7_ + 8;
					class178.method3378(i_9_, 0, i_7_ + i_9_ - 8, 350);
					Class10.aClass164_83.method2635(Class108.method1903(strings[i_8_], -704633865), i_9_, (350 - -95002977 * anInt1163 - 2 - -853549931 * Class46.aClass10_672.anInt80 - (1887129305 * anInt1167 * (i_6_ - anInt1177 * -165903669))), -1, -16777216, (byte) -21);
				}
			}
		}
		Class34.aClass164_318.method2596("876 1", 2141365743 * Class170.anInt1833 - 25, 330, -1, -16777216, -998351197);
		class178.method3378(0, 0, 2141365743 * Class170.anInt1833, 350);
		class178.method3080(0, 350 - anInt1163 * -95002977, 2141365743 * Class170.anInt1833, -1, -530913675);
		Class34.aClass164_319.method2635(new StringBuilder().append("--> ").append(Class108.method1903(aString1171, 484545120)).toString(), 10, 350 - -853549931 * Class655.aClass10_8421.anInt80 - 1, -1, -16777216, (byte) 66);
		if (Class341.aBool3608) {
			int i_10_ = -1;
			if (client.cycles % 30 > 15)
				i_10_ = 16777215;
			class178.method3387(10 + (Class655.aClass10_8421.method597(new StringBuilder().append("--> ").append(Class108.method1903(aString1171, -940028364).substring(0, anInt1173 * 16594559)).toString(), -1759656773)), 350 - -853549931 * Class655.aClass10_8421.anInt80 - 11, 12, i_10_, 159828926);
		}
		class178.method3071();
		Class707_Sub2.method17205((byte) 0);
	}

	static void method1728() {
		aBool1164 = false;
		anIntArray1170 = null;
		Class15.anIntArray184 = null;
		Class338.anIntArray3574 = null;
		Class318.anIntArray3430 = null;
		Class676_Sub1.method16781(-1240802613);
	}

	static void method1729() {
		if (Class449.aClass523_Sub33_4946.aClass687_Sub29_10647.method16971((byte) 38) == 1)
			Class329_Sub2.aClass511_10050.method8556(new Class496(Class500.aClass500_5574, null), (short) -7231);
		else {
			client.aClass505_11019.method8294(-889374440);
			Class321.method5720((byte) -53);
		}
	}

	static void method1730() {
		if (aFileOutputStream1169 != null) {
			try {
				aFileOutputStream1169.close();
			} catch (IOException ioexception) {
				/* empty */
			}
		}
		aFileOutputStream1169 = null;
	}

	static boolean method1731() {
		if (JS5ConfigStruct.method10755(-2020118759 * client.anInt11136, 2005224112))
			return false;
		return true;
	}

	public static void method1732(String string) {
		if (aStringArray1165 == null)
			Class257.method4687(1059543829);
		client.aCalendar11024.setTime(new Date(TimeUtils.getCurrentTimeMilliseconds(1516375036)));
		int i = client.aCalendar11024.get(11);
		int i_11_ = client.aCalendar11024.get(12);
		int i_12_ = client.aCalendar11024.get(13);
		String string_13_ = new StringBuilder().append(Integer.toString(i / 10)).append(i % 10).append(":").append(i_11_ / 10).append(i_11_ % 10).append(":").append(i_12_ / 10).append(i_12_ % 10).toString();
		String[] strings = Class194_Sub13.method15512(string, '\n', (byte) -94);
		for (int i_14_ = 0; i_14_ < strings.length; i_14_++) {
			for (int i_15_ = 1497187345 * anInt1179; i_15_ > 0; i_15_--)
				aStringArray1165[i_15_] = aStringArray1165[i_15_ - 1];
			aStringArray1165[0] = new StringBuilder().append(string_13_).append(": ").append(strings[i_14_]).toString();
			if (aFileOutputStream1169 != null) {
				try {
					aFileOutputStream1169.write(OutgoingPacket.method6623(new StringBuilder().append(aStringArray1165[0]).append("\n").toString(), -2012752511));
				} catch (IOException ioexception) {
					/* empty */
				}
			}
			if (anInt1179 * 1497187345 < aStringArray1165.length - 1) {
				anInt1179 += 1000353009;
				if (-165903669 * anInt1177 > 0)
					anInt1177 += -149335325;
			}
		}
	}

	static void method1733() {
		if (aFileOutputStream1169 != null) {
			try {
				aFileOutputStream1169.close();
			} catch (IOException ioexception) {
				/* empty */
			}
		}
		aFileOutputStream1169 = null;
	}

	static void method1734() {
		if (aFileOutputStream1169 != null) {
			try {
				aFileOutputStream1169.close();
			} catch (IOException ioexception) {
				/* empty */
			}
		}
		aFileOutputStream1169 = null;
	}

	static boolean method1735() {
		return aBool1164;
	}

	static void method1736() {
		aBool1164 = false;
		anIntArray1170 = null;
		Class15.anIntArray184 = null;
		Class338.anIntArray3574 = null;
		Class318.anIntArray3430 = null;
		Class676_Sub1.method16781(-1240802613);
	}

	static void method1737(String[] strings) {
		if (strings.length > 1) {
			for (int i = 0; i < strings.length; i++) {
				if (strings[i].startsWith("pause")) {
					int i_16_ = 5;
					try {
						i_16_ = Integer.parseInt(strings[i].substring(6));
					} catch (Exception exception) {
						/* empty */
					}
					Class485.method7932(new StringBuilder().append("Pausing for ").append(i_16_).append(" seconds...").toString(), (byte) -23);
					Class53_Sub6.aStringArray10968 = strings;
					anInt1176 = (i + 1) * -1190962299;
					Class687_Sub24.aLong10885 = (TimeUtils.getCurrentTimeMilliseconds(1516375036) + (long) (i_16_ * 1000)) * 1332324763258881553L;
					break;
				}
				aString1171 = strings[i];
				Class628.method10314(false, (byte) -1);
			}
		} else {
			aString1171 = new StringBuilder().append(aString1171).append(strings[0]).toString();
			anInt1173 += strings[0].length() * 331909503;
		}
	}

	static void method1738() {
		if (-15297265 * anInt1162 < 102)
			anInt1162 += 263347098;
		if (-1 != anInt1176 * 1006265677 && (7528894964442540785L * Class687_Sub24.aLong10885 < TimeUtils.getCurrentTimeMilliseconds(1516375036))) {
			for (int i = 1006265677 * anInt1176; i < Class53_Sub6.aStringArray10968.length; i++) {
				if (Class53_Sub6.aStringArray10968[i].startsWith("pause")) {
					int i_17_ = 5;
					try {
						i_17_ = Integer.parseInt(Class53_Sub6.aStringArray10968[i].substring(6));
					} catch (Exception exception) {
						/* empty */
					}
					Class485.method7932(new StringBuilder().append("Pausing for ").append(i_17_).append(" seconds...").toString(), (byte) -114);
					anInt1176 = (1 + i) * -1190962299;
					Class687_Sub24.aLong10885 = (TimeUtils.getCurrentTimeMilliseconds(1516375036) + (long) (1000 * i_17_)) * 1332324763258881553L;
					return;
				}
				aString1171 = Class53_Sub6.aStringArray10968[i];
				Class628.method10314(false, (byte) -1);
			}
			anInt1176 = 1190962299;
		}
		if (203206237 * client.anInt11028 != 0) {
			anInt1177 -= 1825767507 * client.anInt11028;
			if (-165903669 * anInt1177 >= anInt1179 * 1497187345)
				anInt1177 = -842412781 * anInt1179 - -149335325;
			if (-165903669 * anInt1177 < 0)
				anInt1177 = 0;
			client.anInt11028 = 0;
		}
		for (int i = 0; i < -1614747943 * client.anInt11030; i++) {
			Interface64 interface64 = client.anInterface64Array11031[i];
			int i_18_ = interface64.method390(-612919826);
			char c = interface64.method425((byte) -87);
			int i_19_ = interface64.method426(-1791086776);
			if (i_18_ == 84)
				Class628.method10314(false, (byte) -1);
			if (i_18_ == 80)
				Class628.method10314(true, (byte) -1);
			else if (66 == i_18_ && (i_19_ & 0x4) != 0) {
				if (NetworkStream.aClipboard7479 != null) {
					String string = "";
					for (int i_20_ = aStringArray1165.length - 1; i_20_ >= 0; i_20_--) {
						if (null != aStringArray1165[i_20_] && aStringArray1165[i_20_].length() > 0)
							string = new StringBuilder().append(string).append(aStringArray1165[i_20_]).append('\n').toString();
					}
					NetworkStream.aClipboard7479.setContents(new StringSelection(string), null);
				}
			} else if (67 == i_18_ && (i_19_ & 0x4) != 0) {
				if (NetworkStream.aClipboard7479 != null) {
					try {
						Transferable transferable = NetworkStream.aClipboard7479.getContents(null);
						if (null != transferable) {
							String string = (String) (transferable.getTransferData(DataFlavor.stringFlavor));
							if (string != null) {
								String[] strings = Class194_Sub13.method15512(string, '\n', (byte) -30);
								Class61.method1420(strings, -1925032817);
							}
						}
					} catch (Exception exception) {
						/* empty */
					}
				}
			} else if (i_18_ == 85 && 16594559 * anInt1173 > 0) {
				aString1171 = new StringBuilder().append(aString1171.substring(0, anInt1173 * 16594559 - 1)).append(aString1171.substring(16594559 * anInt1173)).toString();
				anInt1173 -= 331909503;
			} else if (i_18_ == 101 && 16594559 * anInt1173 < aString1171.length())
				aString1171 = new StringBuilder().append(aString1171.substring(0, 16594559 * anInt1173)).append(aString1171.substring(1 + anInt1173 * 16594559)).toString();
			else if (96 == i_18_ && 16594559 * anInt1173 > 0)
				anInt1173 -= 331909503;
			else if (i_18_ == 97 && anInt1173 * 16594559 < aString1171.length())
				anInt1173 += 331909503;
			else if (102 == i_18_)
				anInt1173 = 0;
			else if (103 == i_18_)
				anInt1173 = aString1171.length() * 331909503;
			else if (i_18_ == 104 && -1422624261 * anInt1166 < aStringArray1165.length) {
				anInt1166 += 234858803;
				Class246.method4388(-1189628840);
				anInt1173 = aString1171.length() * 331909503;
			} else if (i_18_ == 105 && anInt1166 * -1422624261 > 0) {
				anInt1166 -= 234858803;
				Class246.method4388(-1189628840);
				anInt1173 = aString1171.length() * 331909503;
			} else if (Class615.method10068(c, 530847186) || "\\/.:, _-+[]~@".indexOf(c) != -1) {
				aString1171 = new StringBuilder().append(aString1171.substring(0, 16594559 * anInt1173)).append(client.anInterface64Array11031[i].method425((byte) 55)).append(aString1171.substring(anInt1173 * 16594559)).toString();
				anInt1173 += 331909503;
			}
		}
		client.anInt11030 = 0;
		client.anInt11184 = 0;
		if (Class241.anIntArray2455.length != 2141365743 * Class170.anInt1833 >> 1)
			Class241.anIntArray2455 = new int[2141365743 * Class170.anInt1833 >> 1];
		for (int i = 0; i < 100; i++) {
			Class15.anIntArray184[i] += Class318.anIntArray3430[i];
			if (Class15.anIntArray184[i] >> 4 >= 350) {
				int i_21_ = anIntArray1170[i] >> 4;
				int i_22_ = anIntArray1170[i] & 0xf;
				i_21_ += ((Class433.anIntArray4880[i_22_ * 1023 + 64 * (350 + (i_21_ & 0x40)) & 0x3fff]) >> 10);
				i_21_ >>= 1;
				for (int i_23_ = -3; i_23_ <= 3; i_23_++) {
					if (i_21_ + i_23_ >= 0 && i_23_ + i_21_ < Class241.anIntArray2455.length)
						Class241.anIntArray2455[i_23_ + i_21_] += 4 - Math.abs(i_23_);
				}
				anIntArray1170[i] = ((int) (Math.random() * (double) (Class170.anInt1833 * 2141365743)) << 4) + (int) (Math.random() * 15.0);
				Class15.anIntArray184[i] = 0;
				Class338.anIntArray3574[i] = (int) (Math.random() * 102.0) + 51;
				Class318.anIntArray3430[i] = 8 + (int) (Math.random() * 48.0);
			}
		}
		Class676_Sub1.method16781(-1240802613);
	}

	static void method1739() {
		if (-15297265 * anInt1162 < 102)
			anInt1162 += 263347098;
		if (-1 != anInt1176 * 1006265677 && (7528894964442540785L * Class687_Sub24.aLong10885 < TimeUtils.getCurrentTimeMilliseconds(1516375036))) {
			for (int i = 1006265677 * anInt1176; i < Class53_Sub6.aStringArray10968.length; i++) {
				if (Class53_Sub6.aStringArray10968[i].startsWith("pause")) {
					int i_24_ = 5;
					try {
						i_24_ = Integer.parseInt(Class53_Sub6.aStringArray10968[i].substring(6));
					} catch (Exception exception) {
						/* empty */
					}
					Class485.method7932(new StringBuilder().append("Pausing for ").append(i_24_).append(" seconds...").toString(), (byte) -52);
					anInt1176 = (1 + i) * -1190962299;
					Class687_Sub24.aLong10885 = (TimeUtils.getCurrentTimeMilliseconds(1516375036) + (long) (1000 * i_24_)) * 1332324763258881553L;
					return;
				}
				aString1171 = Class53_Sub6.aStringArray10968[i];
				Class628.method10314(false, (byte) -1);
			}
			anInt1176 = 1190962299;
		}
		if (203206237 * client.anInt11028 != 0) {
			anInt1177 -= 1825767507 * client.anInt11028;
			if (-165903669 * anInt1177 >= anInt1179 * 1497187345)
				anInt1177 = -842412781 * anInt1179 - -149335325;
			if (-165903669 * anInt1177 < 0)
				anInt1177 = 0;
			client.anInt11028 = 0;
		}
		for (int i = 0; i < -1614747943 * client.anInt11030; i++) {
			Interface64 interface64 = client.anInterface64Array11031[i];
			int i_25_ = interface64.method390(-1988965965);
			char c = interface64.method425((byte) 30);
			int i_26_ = interface64.method426(-923116947);
			if (i_25_ == 84)
				Class628.method10314(false, (byte) -1);
			if (i_25_ == 80)
				Class628.method10314(true, (byte) -1);
			else if (66 == i_25_ && (i_26_ & 0x4) != 0) {
				if (NetworkStream.aClipboard7479 != null) {
					String string = "";
					for (int i_27_ = aStringArray1165.length - 1; i_27_ >= 0; i_27_--) {
						if (null != aStringArray1165[i_27_] && aStringArray1165[i_27_].length() > 0)
							string = new StringBuilder().append(string).append(aStringArray1165[i_27_]).append('\n').toString();
					}
					NetworkStream.aClipboard7479.setContents(new StringSelection(string), null);
				}
			} else if (67 == i_25_ && (i_26_ & 0x4) != 0) {
				if (NetworkStream.aClipboard7479 != null) {
					try {
						Transferable transferable = NetworkStream.aClipboard7479.getContents(null);
						if (null != transferable) {
							String string = (String) (transferable.getTransferData(DataFlavor.stringFlavor));
							if (string != null) {
								String[] strings = Class194_Sub13.method15512(string, '\n', (byte) -43);
								Class61.method1420(strings, 1614238327);
							}
						}
					} catch (Exception exception) {
						/* empty */
					}
				}
			} else if (i_25_ == 85 && 16594559 * anInt1173 > 0) {
				aString1171 = new StringBuilder().append(aString1171.substring(0, anInt1173 * 16594559 - 1)).append(aString1171.substring(16594559 * anInt1173)).toString();
				anInt1173 -= 331909503;
			} else if (i_25_ == 101 && 16594559 * anInt1173 < aString1171.length())
				aString1171 = new StringBuilder().append(aString1171.substring(0, 16594559 * anInt1173)).append(aString1171.substring(1 + anInt1173 * 16594559)).toString();
			else if (96 == i_25_ && 16594559 * anInt1173 > 0)
				anInt1173 -= 331909503;
			else if (i_25_ == 97 && anInt1173 * 16594559 < aString1171.length())
				anInt1173 += 331909503;
			else if (102 == i_25_)
				anInt1173 = 0;
			else if (103 == i_25_)
				anInt1173 = aString1171.length() * 331909503;
			else if (i_25_ == 104 && -1422624261 * anInt1166 < aStringArray1165.length) {
				anInt1166 += 234858803;
				Class246.method4388(-1189628840);
				anInt1173 = aString1171.length() * 331909503;
			} else if (i_25_ == 105 && anInt1166 * -1422624261 > 0) {
				anInt1166 -= 234858803;
				Class246.method4388(-1189628840);
				anInt1173 = aString1171.length() * 331909503;
			} else if (Class615.method10068(c, 530847186) || "\\/.:, _-+[]~@".indexOf(c) != -1) {
				aString1171 = new StringBuilder().append(aString1171.substring(0, 16594559 * anInt1173)).append(client.anInterface64Array11031[i].method425((byte) 4)).append(aString1171.substring(anInt1173 * 16594559)).toString();
				anInt1173 += 331909503;
			}
		}
		client.anInt11030 = 0;
		client.anInt11184 = 0;
		if (Class241.anIntArray2455.length != 2141365743 * Class170.anInt1833 >> 1)
			Class241.anIntArray2455 = new int[2141365743 * Class170.anInt1833 >> 1];
		for (int i = 0; i < 100; i++) {
			Class15.anIntArray184[i] += Class318.anIntArray3430[i];
			if (Class15.anIntArray184[i] >> 4 >= 350) {
				int i_28_ = anIntArray1170[i] >> 4;
				int i_29_ = anIntArray1170[i] & 0xf;
				i_28_ += ((Class433.anIntArray4880[i_29_ * 1023 + 64 * (350 + (i_28_ & 0x40)) & 0x3fff]) >> 10);
				i_28_ >>= 1;
				for (int i_30_ = -3; i_30_ <= 3; i_30_++) {
					if (i_28_ + i_30_ >= 0 && i_30_ + i_28_ < Class241.anIntArray2455.length)
						Class241.anIntArray2455[i_30_ + i_28_] += 4 - Math.abs(i_30_);
				}
				anIntArray1170[i] = ((int) (Math.random() * (double) (Class170.anInt1833 * 2141365743)) << 4) + (int) (Math.random() * 15.0);
				Class15.anIntArray184[i] = 0;
				Class338.anIntArray3574[i] = (int) (Math.random() * 102.0) + 51;
				Class318.anIntArray3430[i] = 8 + (int) (Math.random() * 48.0);
			}
		}
		Class676_Sub1.method16781(-1240802613);
	}

	static void method1740() {
		if (-15297265 * anInt1162 < 102)
			anInt1162 += 263347098;
		if (-1 != anInt1176 * 1006265677 && (7528894964442540785L * Class687_Sub24.aLong10885 < TimeUtils.getCurrentTimeMilliseconds(1516375036))) {
			for (int i = 1006265677 * anInt1176; i < Class53_Sub6.aStringArray10968.length; i++) {
				if (Class53_Sub6.aStringArray10968[i].startsWith("pause")) {
					int i_31_ = 5;
					try {
						i_31_ = Integer.parseInt(Class53_Sub6.aStringArray10968[i].substring(6));
					} catch (Exception exception) {
						/* empty */
					}
					Class485.method7932(new StringBuilder().append("Pausing for ").append(i_31_).append(" seconds...").toString(), (byte) -91);
					anInt1176 = (1 + i) * -1190962299;
					Class687_Sub24.aLong10885 = (TimeUtils.getCurrentTimeMilliseconds(1516375036) + (long) (1000 * i_31_)) * 1332324763258881553L;
					return;
				}
				aString1171 = Class53_Sub6.aStringArray10968[i];
				Class628.method10314(false, (byte) -1);
			}
			anInt1176 = 1190962299;
		}
		if (203206237 * client.anInt11028 != 0) {
			anInt1177 -= 1825767507 * client.anInt11028;
			if (-165903669 * anInt1177 >= anInt1179 * 1497187345)
				anInt1177 = -842412781 * anInt1179 - -149335325;
			if (-165903669 * anInt1177 < 0)
				anInt1177 = 0;
			client.anInt11028 = 0;
		}
		for (int i = 0; i < -1614747943 * client.anInt11030; i++) {
			Interface64 interface64 = client.anInterface64Array11031[i];
			int i_32_ = interface64.method390(-1454233286);
			char c = interface64.method425((byte) -94);
			int i_33_ = interface64.method426(-1860988750);
			if (i_32_ == 84)
				Class628.method10314(false, (byte) -1);
			if (i_32_ == 80)
				Class628.method10314(true, (byte) -1);
			else if (66 == i_32_ && (i_33_ & 0x4) != 0) {
				if (NetworkStream.aClipboard7479 != null) {
					String string = "";
					for (int i_34_ = aStringArray1165.length - 1; i_34_ >= 0; i_34_--) {
						if (null != aStringArray1165[i_34_] && aStringArray1165[i_34_].length() > 0)
							string = new StringBuilder().append(string).append(aStringArray1165[i_34_]).append('\n').toString();
					}
					NetworkStream.aClipboard7479.setContents(new StringSelection(string), null);
				}
			} else if (67 == i_32_ && (i_33_ & 0x4) != 0) {
				if (NetworkStream.aClipboard7479 != null) {
					try {
						Transferable transferable = NetworkStream.aClipboard7479.getContents(null);
						if (null != transferable) {
							String string = (String) (transferable.getTransferData(DataFlavor.stringFlavor));
							if (string != null) {
								String[] strings = Class194_Sub13.method15512(string, '\n', (byte) 59);
								Class61.method1420(strings, -1735910438);
							}
						}
					} catch (Exception exception) {
						/* empty */
					}
				}
			} else if (i_32_ == 85 && 16594559 * anInt1173 > 0) {
				aString1171 = new StringBuilder().append(aString1171.substring(0, anInt1173 * 16594559 - 1)).append(aString1171.substring(16594559 * anInt1173)).toString();
				anInt1173 -= 331909503;
			} else if (i_32_ == 101 && 16594559 * anInt1173 < aString1171.length())
				aString1171 = new StringBuilder().append(aString1171.substring(0, 16594559 * anInt1173)).append(aString1171.substring(1 + anInt1173 * 16594559)).toString();
			else if (96 == i_32_ && 16594559 * anInt1173 > 0)
				anInt1173 -= 331909503;
			else if (i_32_ == 97 && anInt1173 * 16594559 < aString1171.length())
				anInt1173 += 331909503;
			else if (102 == i_32_)
				anInt1173 = 0;
			else if (103 == i_32_)
				anInt1173 = aString1171.length() * 331909503;
			else if (i_32_ == 104 && -1422624261 * anInt1166 < aStringArray1165.length) {
				anInt1166 += 234858803;
				Class246.method4388(-1189628840);
				anInt1173 = aString1171.length() * 331909503;
			} else if (i_32_ == 105 && anInt1166 * -1422624261 > 0) {
				anInt1166 -= 234858803;
				Class246.method4388(-1189628840);
				anInt1173 = aString1171.length() * 331909503;
			} else if (Class615.method10068(c, 530847186) || "\\/.:, _-+[]~@".indexOf(c) != -1) {
				aString1171 = new StringBuilder().append(aString1171.substring(0, 16594559 * anInt1173)).append(client.anInterface64Array11031[i].method425((byte) -40)).append(aString1171.substring(anInt1173 * 16594559)).toString();
				anInt1173 += 331909503;
			}
		}
		client.anInt11030 = 0;
		client.anInt11184 = 0;
		if (Class241.anIntArray2455.length != 2141365743 * Class170.anInt1833 >> 1)
			Class241.anIntArray2455 = new int[2141365743 * Class170.anInt1833 >> 1];
		for (int i = 0; i < 100; i++) {
			Class15.anIntArray184[i] += Class318.anIntArray3430[i];
			if (Class15.anIntArray184[i] >> 4 >= 350) {
				int i_35_ = anIntArray1170[i] >> 4;
				int i_36_ = anIntArray1170[i] & 0xf;
				i_35_ += ((Class433.anIntArray4880[i_36_ * 1023 + 64 * (350 + (i_35_ & 0x40)) & 0x3fff]) >> 10);
				i_35_ >>= 1;
				for (int i_37_ = -3; i_37_ <= 3; i_37_++) {
					if (i_35_ + i_37_ >= 0 && i_37_ + i_35_ < Class241.anIntArray2455.length)
						Class241.anIntArray2455[i_37_ + i_35_] += 4 - Math.abs(i_37_);
				}
				anIntArray1170[i] = ((int) (Math.random() * (double) (Class170.anInt1833 * 2141365743)) << 4) + (int) (Math.random() * 15.0);
				Class15.anIntArray184[i] = 0;
				Class338.anIntArray3574[i] = (int) (Math.random() * 102.0) + 51;
				Class318.anIntArray3430[i] = 8 + (int) (Math.random() * 48.0);
			}
		}
		Class676_Sub1.method16781(-1240802613);
	}

	static void method1741() {
		if (anInt1166 * -1422624261 > 0) {
			int i = 0;
			for (int i_38_ = 0; i_38_ < aStringArray1165.length; i_38_++) {
				if (aStringArray1165[i_38_].indexOf("--> ") != -1 && ++i == -1422624261 * anInt1166) {
					aString1171 = aStringArray1165[i_38_].substring(aStringArray1165[i_38_].indexOf('>') + 2);
					break;
				}
			}
		} else
			aString1171 = "";
	}

	public static void method1742(String string, boolean bool, boolean bool_39_) {
		do {
			try {
				if (string.equalsIgnoreCase("commands") || string.equalsIgnoreCase("help")) {
					Class485.method7932("commands - This command", (byte) -49);
					Class485.method7932("cls - Clear console", (byte) -69);
					Class485.method7932("displayfps - Toggle FPS and other information", (byte) -103);
					Class485.method7932("renderer - Print graphics renderer information", (byte) -50);
					Class485.method7932("heap - Print java memory information", (byte) -81);
					Class485.method7932("getcamerapos - Print location and direction of camera for use in bug reports", (byte) -26);
				} else if (string.equalsIgnoreCase("cls")) {
					anInt1179 = 0;
					anInt1177 = 0;
				} else if (string.equalsIgnoreCase("displayfps")) {
					client.aBool11096 = !client.aBool11096;
					if (client.aBool11096)
						Class485.method7932("FPS on", (byte) -50);
					else
						Class485.method7932("FPS off", (byte) -2);
				} else if (string.equals("renderer")) {
					Class150 class150 = Class31.aClass178_303.method3401();
					Class485.method7932(new StringBuilder().append("Toolkit ID: ").append(Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) 29)).toString(), (byte) -106);
					Class485.method7932(new StringBuilder().append("Vendor: ").append(class150.anInt1720 * -129955305).toString(), (byte) -30);
					Class485.method7932(new StringBuilder().append("Name: ").append(class150.aString1721).toString(), (byte) -4);
					Class485.method7932(new StringBuilder().append("Version: ").append(1443754951 * class150.anInt1722).toString(), (byte) -9);
					Class485.method7932(new StringBuilder().append("Device: ").append(class150.aString1723).toString(), (byte) -47);
					Class485.method7932(new StringBuilder().append("Driver Version: ").append(class150.aLong1724 * 7027606198026803059L).toString(), (byte) -14);
					String string_40_ = Class31.aClass178_303.method3036();
					if (string_40_.length() > 0)
						Class485.method7932(string_40_, (byte) -3);
				} else if (string.equals("heap"))
					Class485.method7932(new StringBuilder().append("Heap: ").append(Class506.anInt5695 * -518382423).append("MB").toString(), (byte) -16);
				else {
					if (!string.equalsIgnoreCase("getcamerapos"))
						break;
					Class592 class592 = client.aClass505_11019.method8242(55538902);
					if (2 == Class562.anInt7564 * 2097396553) {
						Class437 class437 = Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5378(2004496189);
						Class437 class437_41_ = Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5397(-982170458);
						Class485.method7932(new StringBuilder().append("Pos: ").append(new Class592((Class241.player.aByte10821), (int) class437.aFloat4903 >> 9, (int) class437.aFloat4905 >> 9).toString()).append(" Height: ").append((Class53_Sub17.method17220(((int) class437.aFloat4903 - (235453015 * class592.localX << 9)), ((int) class437.aFloat4905 - (class592.localY * 1704054549 << 9)), (Class241.player.aByte10821), 796895371)) + (int) class437.aFloat4904).toString(), (byte) -53);
						Class485.method7932(new StringBuilder().append("Look: ").append(new Class592((Class241.player.aByte10821), (int) class437_41_.aFloat4903 >> 9, (int) class437_41_.aFloat4905 >> 9).toString()).append(" Height: ").append((Class53_Sub17.method17220(((int) class437_41_.aFloat4903 - (235453015 * class592.localX << 9)), ((int) class437.aFloat4905 - (class592.localY * 1704054549 << 9)), (Class241.player.aByte10821), 746616669)) + (int) class437.aFloat4904).toString(), (byte) -50);
					} else {
						Class485.method7932(new StringBuilder().append("Pos: ").append(Class241.player.aByte10821).append(",").append(((760427037 * Class77.anInt858 >> 9) + class592.localX * 235453015) >> 6).append(",").append((1704054549 * class592.localY + (-1221225203 * Class497.anInt5563 >> 9)) >> 6).append(",").append((class592.localX * 235453015 + (760427037 * Class77.anInt858 >> 9)) & 0x3f).append(",").append(((-1221225203 * Class497.anInt5563 >> 9) + class592.localY * 1704054549) & 0x3f).append(" Height: ").append((Class53_Sub17.method17220(760427037 * Class77.anInt858, -1221225203 * Class497.anInt5563, (Class241.player.aByte10821), 1821980115)) - Class285.anInt3085 * 805779207).toString(), (byte) -24);
						Class485.method7932(new StringBuilder().append("Look: ").append(Class241.player.aByte10821).append(",").append((-1744666137 * Class602.anInt7934 + class592.localX * 235453015) >> 6).append(",").append((1704054549 * class592.localY + Class42.anInt564 * -479513739) >> 6).append(",").append((class592.localX * 235453015 + -1744666137 * Class602.anInt7934) & 0x3f).append(",").append((class592.localY * 1704054549 + Class42.anInt564 * -479513739) & 0x3f).append(" Height: ").append((Class53_Sub17.method17220(-1744666137 * Class602.anInt7934, -479513739 * Class42.anInt564, (Class241.player.aByte10821), 890548620)) - Class290.anInt3146 * 1734327845).toString(), (byte) 0);
					}
				}
			} catch (Exception exception) {
				Class485.method7932((Class39.aClass39_437.method1124(Class53_Sub20.aClass668_10979, (byte) -14)), (byte) -73);
			}
			return;
		} while (false);
		if (Class674.aClass674_8613 != Class80.aClass674_865 || -1746920271 * client.rights >= 2) {
			try {
				if (string.equalsIgnoreCase("wm1")) {
					Class82.method1585(1, -1, -1, false, -1011984276);
					if (Class316.method5685(1174445857) == 1)
						Class485.method7932("Success", (byte) -120);
					else
						Class485.method7932("Failure", (byte) -68);
					return;
				}
				if (string.equalsIgnoreCase("wm2")) {
					Class82.method1585(2, -1, -1, false, -1011984276);
					if (Class316.method5685(-233619049) == 2)
						Class485.method7932("Success", (byte) -113);
					else
						Class485.method7932("Failure", (byte) -6);
					return;
				}
				if (Class710.aBool8840 && string.equalsIgnoreCase("wm3")) {
					Class82.method1585(3, 1024, 768, false, -1011984276);
					if (Class316.method5685(-711467677) == 3)
						Class485.method7932("Success", (byte) -26);
					else
						Class485.method7932("Failure", (byte) -27);
					return;
				}
				if (string.startsWith("setlobby ")) {
					if (16 != -2020118759 * client.anInt11136)
						Class485.method7932("Failure", (byte) -42);
					else {
						int i = -1;
						Object object = null;
						string = string.substring(9);
						int i_42_ = string.indexOf(' ');
						if (-1 == i_42_)
							Class485.method7932("Failure", (byte) -24);
						else {
							try {
								i = Integer.parseInt(string.substring(0, i_42_));
							} catch (NumberFormatException numberformatexception) {
								/* empty */
							}
							if (-1 == i)
								Class485.method7932("Failure", (byte) -72);
							else {
								String string_43_ = new StringBuilder().append(string.substring(i_42_ + 1).trim()).append(".runescape.com").toString();
								Class30.method898(string_43_, i, (byte) 12);
								Class485.method7932("Success", (byte) -20);
								return;
							}
							return;
						}
						return;
					}
					return;
				}
				if (string.equalsIgnoreCase("tk0")) {
					Class535.method8921(0, false, (byte) -29);
					if (Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) 67) == 0) {
						Class485.method7932("Success", (byte) -15);
						Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub1_10629), 0, -64845976);
						Class211.method3824(1857391930);
						client.aBool11012 = false;
					} else
						Class485.method7932("Failure", (byte) -93);
					return;
				}
				if (string.equalsIgnoreCase("tk1")) {
					Class535.method8921(1, false, (byte) -45);
					if (Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) 74) == 1) {
						Class485.method7932("Success", (byte) -18);
						Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub1_10629), 1, -1059176568);
						Class211.method3824(1517852788);
						client.aBool11012 = false;
					} else
						Class485.method7932("Failure", (byte) -20);
					return;
				}
				if (string.equalsIgnoreCase("tk3")) {
					Class535.method8921(3, false, (byte) -11);
					if (Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) -9) == 3) {
						Class485.method7932("Success", (byte) -127);
						Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub1_10629), 3, 123391467);
						Class211.method3824(1272987512);
						client.aBool11012 = false;
					} else
						Class485.method7932("Failure", (byte) -20);
					return;
				}
				if (string.equalsIgnoreCase("tk5")) {
					Class535.method8921(5, false, (byte) -57);
					if (Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) 12) == 5) {
						Class485.method7932("Success", (byte) -121);
						Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub1_10629), 5, 380969075);
						Class211.method3824(1906240532);
						client.aBool11012 = false;
					} else
						Class485.method7932("Failure", (byte) -32);
					return;
				}
				if (string.equalsIgnoreCase("clientdrop")) {
					if (9 == -2020118759 * client.anInt11136)
						Class145.method2383((byte) -71);
					else if (10 == client.anInt11136 * -2020118759)
						client.aClass116_11058.aBool1432 = true;
					return;
				}
				if (string.equalsIgnoreCase("breakcon")) {
					RSStream[] class116s = client.aClass116Array11210;
					for (int i = 0; i < class116s.length; i++) {
						RSStream class116 = class116s[i];
						if (class116.getCurrentStream(782493095) != null)
							class116.getCurrentStream(782493095).drop(733237503);
					}
					Class572.aClass458_7684.disconnect(65535);
					return;
				}
				if (string.startsWith("getclientvarpbit")) {
					int i = Integer.parseInt(string.substring(17));
					Class485.method7932(new StringBuilder().append("varpbit=").append(Class98_Sub1_Sub2.playerVarsProvider.method93(Class98_Sub1_Sub2.playerVarsProvider.method106(i, -690254753), 288570665)).toString(), (byte) -56);
					return;
				}
				if (string.startsWith("getclientvarp")) {
					int i = Integer.parseInt(string.substring(14));
					Class485.method7932(new StringBuilder().append("varp=").append(Class98_Sub1_Sub2.playerVarsProvider.method94((Class98_Sub1_Sub2.playerVarsProvider.method110(VarDomainType.PLAYER_CONFIGS, i, 1965983800)), -1712283688)).toString(), (byte) -3);
					return;
				}
				if (string.startsWith("directlogin")) {
					String[] strings = Class194_Sub13.method15512(string.substring(12), ' ', (byte) 19);
					if (strings.length == 2 || strings.length == 3) {
						if (Class366.method6324(-380209650))
							Class173.method2902(563639683);
						Class223.method4147(strings[0], strings[1], (strings.length > 2 ? strings[2] : ""), true, (byte) -13);
					}
					return;
				}
				if (string.startsWith("snlogin ")) {
					String[] strings = Class194_Sub13.method15512(string.substring(8), ' ', (byte) -28);
					int i = Integer.parseInt(strings[0]);
					String string_44_ = strings.length > 1 ? strings[1] : "";
					Class164_Sub1.method14452(i, string_44_, true, 1071864885);
					return;
				}
				if (string.startsWith("setoutput ")) {
					File file = new File(string.substring(10));
					if (file.exists()) {
						file = new File(new StringBuilder().append(string.substring(10)).append(".").append(TimeUtils.getCurrentTimeMilliseconds(1516375036)).append(".log").toString());
						if (file.exists()) {
							Class485.method7932("file already exists!", (byte) -30);
							return;
						}
					}
					if (aFileOutputStream1169 != null) {
						aFileOutputStream1169.close();
						aFileOutputStream1169 = null;
					}
					try {
						aFileOutputStream1169 = new FileOutputStream(file);
					} catch (FileNotFoundException filenotfoundexception) {
						Class485.method7932(new StringBuilder().append("Could not create ").append(file.getName()).toString(), (byte) -24);
					} catch (SecurityException securityexception) {
						Class485.method7932(new StringBuilder().append("Cannot write to ").append(file.getName()).toString(), (byte) -123);
					}
					return;
				}
				if (string.equals("closeoutput")) {
					if (aFileOutputStream1169 != null)
						aFileOutputStream1169.close();
					aFileOutputStream1169 = null;
					return;
				}
				if (string.startsWith("runscript ")) {
					File file = new File(string.substring(10));
					if (!file.exists()) {
						Class485.method7932("No such file", (byte) -101);
						return;
					}
					byte[] is = Class578.method9654(file, (short) 1028);
					if (null == is) {
						Class485.method7932("Failed to read file", (byte) -93);
						return;
					}
					String[] strings = (Class194_Sub13.method15512(Class598.method9852(Class238.method4310(is, (byte) 15), '\r', "", 2063350764), '\n', (byte) -25));
					Class61.method1420(strings, -1343605758);
				}
				if (string.equalsIgnoreCase("togglesnow")) {
					aBool1174 = !aBool1174;
					Class485.method7932("Success", (byte) -72);
					return;
				}
				if (9 == client.anInt11136 * -2020118759 || -2020118759 * client.anInt11136 == 0) {
					RSStream class116 = Class537.method8941(-1478559692);
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.COMMANDS_PACKET, class116.aClass11_1413, 1370050649);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(string.length() + 3, 1519523307);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(bool ? 1 : 0, 2032942667);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(bool_39_ ? 1 : 0, 1168956281);
					class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string, (byte) 9);
					class116.method1974(class523_sub22, (byte) 41);
				}
			} catch (Exception exception) {
				Class485.method7932((Class39.aClass39_437.method1124(Class53_Sub20.aClass668_10979, (byte) -39)), (byte) -32);
				return;
			}
		}
		if (9 != client.anInt11136 * -2020118759 && 0 != client.anInt11136 * -2020118759)
			Class485.method7932(new StringBuilder().append(Class39.aClass39_502.method1124(Class53_Sub20.aClass668_10979, (byte) -98)).append(string).toString(), (byte) -20);
	}

	static void method1743() {
		anInt1163 = (-812688309 * Class655.aClass10_8421.anInt80 + Class655.aClass10_8421.anInt76 * -1664963719 + 410155710);
		anInt1167 = -1709923630 + (Class46.aClass10_672.anInt80 * 632200733 + Class46.aClass10_672.anInt76 * -899283713);
		aStringArray1165 = new String[500];
		for (int i = 0; i < aStringArray1165.length; i++)
			aStringArray1165[i] = "";
		Class485.method7932(Class39.aClass39_418.method1124((Class53_Sub20.aClass668_10979), (byte) -94), (byte) -71);
	}

	static void method1744(boolean bool) {
		aString1171 = aString1171.trim();
		anInt1166 = 0;
		if (aString1171.length() == 0)
			anInt1173 = 0;
		else {
			Class485.method7932(new StringBuilder().append("--> ").append(aString1171).toString(), (byte) -38);
			Class264.method4746(aString1171, false, bool, -563702114);
			if (!bool) {
				anInt1173 = 0;
				aString1171 = "";
			} else
				anInt1173 = aString1171.length() * 331909503;
		}
	}

	public static void method1745(String string) {
		aString1171 = string;
		anInt1173 = aString1171.length() * 331909503;
	}

	static void method1746(boolean bool) {
		aString1171 = aString1171.trim();
		anInt1166 = 0;
		if (aString1171.length() == 0)
			anInt1173 = 0;
		else {
			Class485.method7932(new StringBuilder().append("--> ").append(aString1171).toString(), (byte) -16);
			Class264.method4746(aString1171, false, bool, -1819450984);
			if (!bool) {
				anInt1173 = 0;
				aString1171 = "";
			} else
				anInt1173 = aString1171.length() * 331909503;
		}
	}

	public static void method1747(String string) {
		if (aStringArray1165 == null)
			Class257.method4687(-1260952507);
		client.aCalendar11024.setTime(new Date(TimeUtils.getCurrentTimeMilliseconds(1516375036)));
		int i = client.aCalendar11024.get(11);
		int i_45_ = client.aCalendar11024.get(12);
		int i_46_ = client.aCalendar11024.get(13);
		String string_47_ = new StringBuilder().append(Integer.toString(i / 10)).append(i % 10).append(":").append(i_45_ / 10).append(i_45_ % 10).append(":").append(i_46_ / 10).append(i_46_ % 10).toString();
		String[] strings = Class194_Sub13.method15512(string, '\n', (byte) 8);
		for (int i_48_ = 0; i_48_ < strings.length; i_48_++) {
			for (int i_49_ = 1497187345 * anInt1179; i_49_ > 0; i_49_--)
				aStringArray1165[i_49_] = aStringArray1165[i_49_ - 1];
			aStringArray1165[0] = new StringBuilder().append(string_47_).append(": ").append(strings[i_48_]).toString();
			if (aFileOutputStream1169 != null) {
				try {
					aFileOutputStream1169.write(OutgoingPacket.method6623(new StringBuilder().append(aStringArray1165[0]).append("\n").toString(), 215129724));
				} catch (IOException ioexception) {
					/* empty */
				}
			}
			if (anInt1179 * 1497187345 < aStringArray1165.length - 1) {
				anInt1179 += 1000353009;
				if (-165903669 * anInt1177 > 0)
					anInt1177 += -149335325;
			}
		}
	}

	static void method1748(String[] strings) {
		if (strings.length > 1) {
			for (int i = 0; i < strings.length; i++) {
				if (strings[i].startsWith("pause")) {
					int i_50_ = 5;
					try {
						i_50_ = Integer.parseInt(strings[i].substring(6));
					} catch (Exception exception) {
						/* empty */
					}
					Class485.method7932(new StringBuilder().append("Pausing for ").append(i_50_).append(" seconds...").toString(), (byte) -61);
					Class53_Sub6.aStringArray10968 = strings;
					anInt1176 = (i + 1) * -1190962299;
					Class687_Sub24.aLong10885 = (TimeUtils.getCurrentTimeMilliseconds(1516375036) + (long) (i_50_ * 1000)) * 1332324763258881553L;
					break;
				}
				aString1171 = strings[i];
				Class628.method10314(false, (byte) -1);
			}
		} else {
			aString1171 = new StringBuilder().append(aString1171).append(strings[0]).toString();
			anInt1173 += strings[0].length() * 331909503;
		}
	}

	static void method1749(Class178 class178) {
		if (Class423.method6714(-1193915731) && Class220.method4130((byte) 0))
			Class197.method3670(0, 0, Class170.anInt1833 * 2141365743, 350, 65280);
		class178.method3378(0, 0, 2141365743 * Class170.anInt1833, 350);
		class178.method3193(0, 0, Class170.anInt1833 * 2141365743, 350, anInt1162 * -15297265 << 24 | 0x332277, 1);
		if (aBool1174) {
			for (int i = 0; i < 100; i++) {
				int i_51_ = anIntArray1170[i] >> 4;
				int i_52_ = Class15.anIntArray184[i] >> 4;
				i_51_ += (Class433.anIntArray4880[64 * (i_52_ + (i_51_ & 0x40)) & 0x3fff]) >> 10;
				if (i_51_ >= 0 && i_51_ >> 1 < Class241.anIntArray2455.length && Class241.anIntArray2455[i_51_ >> 1] >> 2 < 350 - i_52_)
					class178.method3193(i_51_, i_52_, 2, 2, (Class338.anIntArray3574[i] << 24 | 0xffffff), 1);
			}
			for (int i = 0; i < Class241.anIntArray2455.length; i++) {
				int i_53_ = Class241.anIntArray2455[i] >> 2;
				class178.method3193(i << 1, 350 - i_53_, 2, i_53_, -2130706433, 1);
			}
		}
		int i = 350 / (1887129305 * anInt1167);
		if (anInt1179 * 1497187345 > 0) {
			int i_54_ = 346 - 1887129305 * anInt1167 - 4;
			int i_55_ = i * i_54_ / (1497187345 * anInt1179 + i - 1);
			int i_56_ = 4;
			if (1497187345 * anInt1179 > 1)
				i_56_ += ((anInt1179 * 1497187345 - 1 - anInt1177 * -165903669) * (i_54_ - i_55_) / (anInt1179 * 1497187345 - 1));
			class178.method3193(2141365743 * Class170.anInt1833 - 16, i_56_, 12, i_55_, -15297265 * anInt1162 << 24 | 0x332277, 2);
			for (int i_57_ = anInt1177 * -165903669; (i_57_ < i + -165903669 * anInt1177 && i_57_ < anInt1179 * 1497187345); i_57_++) {
				String[] strings = Class194_Sub13.method15512(aStringArray1165[i_57_], '\010', (byte) 21);
				int i_58_ = ((Class170.anInt1833 * 2141365743 - 8 - 16) / strings.length);
				for (int i_59_ = 0; i_59_ < strings.length; i_59_++) {
					int i_60_ = i_59_ * i_58_ + 8;
					class178.method3378(i_60_, 0, i_58_ + i_60_ - 8, 350);
					Class10.aClass164_83.method2635(Class108.method1903(strings[i_59_], 60800033), i_60_, (350 - -95002977 * anInt1163 - 2 - -853549931 * Class46.aClass10_672.anInt80 - (1887129305 * anInt1167 * (i_57_ - anInt1177 * -165903669))), -1, -16777216, (byte) -25);
				}
			}
		}
		Class34.aClass164_318.method2596("876 1", 2141365743 * Class170.anInt1833 - 25, 330, -1, -16777216, 2131161997);
		class178.method3378(0, 0, 2141365743 * Class170.anInt1833, 350);
		class178.method3080(0, 350 - anInt1163 * -95002977, 2141365743 * Class170.anInt1833, -1, -1461550066);
		Class34.aClass164_319.method2635(new StringBuilder().append("--> ").append(Class108.method1903(aString1171, 505941025)).toString(), 10, 350 - -853549931 * Class655.aClass10_8421.anInt80 - 1, -1, -16777216, (byte) -101);
		if (Class341.aBool3608) {
			int i_61_ = -1;
			if (client.cycles % 30 > 15)
				i_61_ = 16777215;
			class178.method3387(10 + (Class655.aClass10_8421.method597(new StringBuilder().append("--> ").append(Class108.method1903(aString1171, -494934520).substring(0, anInt1173 * 16594559)).toString(), -1759656773)), 350 - -853549931 * Class655.aClass10_8421.anInt80 - 11, 12, i_61_, 159828926);
		}
		class178.method3071();
		Class707_Sub2.method17205((byte) 0);
	}

	Class95() throws Throwable {
		throw new Error();
	}

	static void method1750(Class178 class178) {
		if (Class423.method6714(721800989) && Class220.method4130((byte) 0))
			Class197.method3670(0, 0, Class170.anInt1833 * 2141365743, 350, 65280);
		class178.method3378(0, 0, 2141365743 * Class170.anInt1833, 350);
		class178.method3193(0, 0, Class170.anInt1833 * 2141365743, 350, anInt1162 * -15297265 << 24 | 0x332277, 1);
		if (aBool1174) {
			for (int i = 0; i < 100; i++) {
				int i_62_ = anIntArray1170[i] >> 4;
				int i_63_ = Class15.anIntArray184[i] >> 4;
				i_62_ += (Class433.anIntArray4880[64 * (i_63_ + (i_62_ & 0x40)) & 0x3fff]) >> 10;
				if (i_62_ >= 0 && i_62_ >> 1 < Class241.anIntArray2455.length && Class241.anIntArray2455[i_62_ >> 1] >> 2 < 350 - i_63_)
					class178.method3193(i_62_, i_63_, 2, 2, (Class338.anIntArray3574[i] << 24 | 0xffffff), 1);
			}
			for (int i = 0; i < Class241.anIntArray2455.length; i++) {
				int i_64_ = Class241.anIntArray2455[i] >> 2;
				class178.method3193(i << 1, 350 - i_64_, 2, i_64_, -2130706433, 1);
			}
		}
		int i = 350 / (1887129305 * anInt1167);
		if (anInt1179 * 1497187345 > 0) {
			int i_65_ = 346 - 1887129305 * anInt1167 - 4;
			int i_66_ = i * i_65_ / (1497187345 * anInt1179 + i - 1);
			int i_67_ = 4;
			if (1497187345 * anInt1179 > 1)
				i_67_ += ((anInt1179 * 1497187345 - 1 - anInt1177 * -165903669) * (i_65_ - i_66_) / (anInt1179 * 1497187345 - 1));
			class178.method3193(2141365743 * Class170.anInt1833 - 16, i_67_, 12, i_66_, -15297265 * anInt1162 << 24 | 0x332277, 2);
			for (int i_68_ = anInt1177 * -165903669; (i_68_ < i + -165903669 * anInt1177 && i_68_ < anInt1179 * 1497187345); i_68_++) {
				String[] strings = Class194_Sub13.method15512(aStringArray1165[i_68_], '\010', (byte) 1);
				int i_69_ = ((Class170.anInt1833 * 2141365743 - 8 - 16) / strings.length);
				for (int i_70_ = 0; i_70_ < strings.length; i_70_++) {
					int i_71_ = i_70_ * i_69_ + 8;
					class178.method3378(i_71_, 0, i_69_ + i_71_ - 8, 350);
					Class10.aClass164_83.method2635(Class108.method1903(strings[i_70_], -1136285441), i_71_, (350 - -95002977 * anInt1163 - 2 - -853549931 * Class46.aClass10_672.anInt80 - (1887129305 * anInt1167 * (i_68_ - anInt1177 * -165903669))), -1, -16777216, (byte) 42);
				}
			}
		}
		Class34.aClass164_318.method2596("876 1", 2141365743 * Class170.anInt1833 - 25, 330, -1, -16777216, 555518891);
		class178.method3378(0, 0, 2141365743 * Class170.anInt1833, 350);
		class178.method3080(0, 350 - anInt1163 * -95002977, 2141365743 * Class170.anInt1833, -1, -1798623166);
		Class34.aClass164_319.method2635(new StringBuilder().append("--> ").append(Class108.method1903(aString1171, -336542534)).toString(), 10, 350 - -853549931 * Class655.aClass10_8421.anInt80 - 1, -1, -16777216, (byte) 57);
		if (Class341.aBool3608) {
			int i_72_ = -1;
			if (client.cycles % 30 > 15)
				i_72_ = 16777215;
			class178.method3387(10 + (Class655.aClass10_8421.method597(new StringBuilder().append("--> ").append(Class108.method1903(aString1171, -428000138).substring(0, anInt1173 * 16594559)).toString(), -1759656773)), 350 - -853549931 * Class655.aClass10_8421.anInt80 - 11, 12, i_72_, 159828926);
		}
		class178.method3071();
		Class707_Sub2.method17205((byte) 0);
	}

	static void method1751(Class178 class178) {
		if (Class423.method6714(-1702710455) && Class220.method4130((byte) 0))
			Class197.method3670(0, 0, Class170.anInt1833 * 2141365743, 350, 65280);
		class178.method3378(0, 0, 2141365743 * Class170.anInt1833, 350);
		class178.method3193(0, 0, Class170.anInt1833 * 2141365743, 350, anInt1162 * -15297265 << 24 | 0x332277, 1);
		if (aBool1174) {
			for (int i = 0; i < 100; i++) {
				int i_73_ = anIntArray1170[i] >> 4;
				int i_74_ = Class15.anIntArray184[i] >> 4;
				i_73_ += (Class433.anIntArray4880[64 * (i_74_ + (i_73_ & 0x40)) & 0x3fff]) >> 10;
				if (i_73_ >= 0 && i_73_ >> 1 < Class241.anIntArray2455.length && Class241.anIntArray2455[i_73_ >> 1] >> 2 < 350 - i_74_)
					class178.method3193(i_73_, i_74_, 2, 2, (Class338.anIntArray3574[i] << 24 | 0xffffff), 1);
			}
			for (int i = 0; i < Class241.anIntArray2455.length; i++) {
				int i_75_ = Class241.anIntArray2455[i] >> 2;
				class178.method3193(i << 1, 350 - i_75_, 2, i_75_, -2130706433, 1);
			}
		}
		int i = 350 / (1887129305 * anInt1167);
		if (anInt1179 * 1497187345 > 0) {
			int i_76_ = 346 - 1887129305 * anInt1167 - 4;
			int i_77_ = i * i_76_ / (1497187345 * anInt1179 + i - 1);
			int i_78_ = 4;
			if (1497187345 * anInt1179 > 1)
				i_78_ += ((anInt1179 * 1497187345 - 1 - anInt1177 * -165903669) * (i_76_ - i_77_) / (anInt1179 * 1497187345 - 1));
			class178.method3193(2141365743 * Class170.anInt1833 - 16, i_78_, 12, i_77_, -15297265 * anInt1162 << 24 | 0x332277, 2);
			for (int i_79_ = anInt1177 * -165903669; (i_79_ < i + -165903669 * anInt1177 && i_79_ < anInt1179 * 1497187345); i_79_++) {
				String[] strings = Class194_Sub13.method15512(aStringArray1165[i_79_], '\010', (byte) -114);
				int i_80_ = ((Class170.anInt1833 * 2141365743 - 8 - 16) / strings.length);
				for (int i_81_ = 0; i_81_ < strings.length; i_81_++) {
					int i_82_ = i_81_ * i_80_ + 8;
					class178.method3378(i_82_, 0, i_80_ + i_82_ - 8, 350);
					Class10.aClass164_83.method2635(Class108.method1903(strings[i_81_], -437443633), i_82_, (350 - -95002977 * anInt1163 - 2 - -853549931 * Class46.aClass10_672.anInt80 - (1887129305 * anInt1167 * (i_79_ - anInt1177 * -165903669))), -1, -16777216, (byte) 35);
				}
			}
		}
		Class34.aClass164_318.method2596("876 1", 2141365743 * Class170.anInt1833 - 25, 330, -1, -16777216, -1657865702);
		class178.method3378(0, 0, 2141365743 * Class170.anInt1833, 350);
		class178.method3080(0, 350 - anInt1163 * -95002977, 2141365743 * Class170.anInt1833, -1, -636116480);
		Class34.aClass164_319.method2635(new StringBuilder().append("--> ").append(Class108.method1903(aString1171, 1797542559)).toString(), 10, 350 - -853549931 * Class655.aClass10_8421.anInt80 - 1, -1, -16777216, (byte) -30);
		if (Class341.aBool3608) {
			int i_83_ = -1;
			if (client.cycles % 30 > 15)
				i_83_ = 16777215;
			class178.method3387(10 + (Class655.aClass10_8421.method597(new StringBuilder().append("--> ").append(Class108.method1903(aString1171, 666919127).substring(0, anInt1173 * 16594559)).toString(), -1759656773)), 350 - -853549931 * Class655.aClass10_8421.anInt80 - 11, 12, i_83_, 159828926);
		}
		class178.method3071();
		Class707_Sub2.method17205((byte) 0);
	}

	static String method1752(String string) {
		String string_84_ = null;
		int i = string.indexOf("--> ");
		if (i >= 0) {
			string_84_ = string.substring(0, 4 + i);
			string = string.substring(i + 4);
		}
		int i_85_ = -1;
		if (string.startsWith("directlogin "))
			i_85_ = string.indexOf(" ", "directlogin ".length());
		if (i_85_ >= 0) {
			int i_86_ = string.length();
			string = new StringBuilder().append(string.substring(0, i_85_)).append(" ").toString();
			for (int i_87_ = 1 + i_85_; i_87_ < i_86_; i_87_++)
				string = new StringBuilder().append(string).append("*").toString();
		}
		if (string_84_ != null)
			return new StringBuilder().append(string_84_).append(string).toString();
		return string;
	}

	public static void method1753(String string) {
		aString1171 = string;
		anInt1173 = aString1171.length() * 331909503;
	}

	static void method1754() {
		/* empty */
	}

	public static void method1755(String string, boolean bool, boolean bool_88_) {
		do {
			try {
				if (string.equalsIgnoreCase("commands") || string.equalsIgnoreCase("help")) {
					Class485.method7932("commands - This command", (byte) -15);
					Class485.method7932("cls - Clear console", (byte) -85);
					Class485.method7932("displayfps - Toggle FPS and other information", (byte) -59);
					Class485.method7932("renderer - Print graphics renderer information", (byte) -99);
					Class485.method7932("heap - Print java memory information", (byte) -31);
					Class485.method7932("getcamerapos - Print location and direction of camera for use in bug reports", (byte) -71);
				} else if (string.equalsIgnoreCase("cls")) {
					anInt1179 = 0;
					anInt1177 = 0;
				} else if (string.equalsIgnoreCase("displayfps")) {
					client.aBool11096 = !client.aBool11096;
					if (client.aBool11096)
						Class485.method7932("FPS on", (byte) -81);
					else
						Class485.method7932("FPS off", (byte) -18);
				} else if (string.equals("renderer")) {
					Class150 class150 = Class31.aClass178_303.method3401();
					Class485.method7932(new StringBuilder().append("Toolkit ID: ").append(Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) 66)).toString(), (byte) -92);
					Class485.method7932(new StringBuilder().append("Vendor: ").append(class150.anInt1720 * -129955305).toString(), (byte) -103);
					Class485.method7932(new StringBuilder().append("Name: ").append(class150.aString1721).toString(), (byte) -64);
					Class485.method7932(new StringBuilder().append("Version: ").append(1443754951 * class150.anInt1722).toString(), (byte) -112);
					Class485.method7932(new StringBuilder().append("Device: ").append(class150.aString1723).toString(), (byte) -5);
					Class485.method7932(new StringBuilder().append("Driver Version: ").append(class150.aLong1724 * 7027606198026803059L).toString(), (byte) -114);
					String string_89_ = Class31.aClass178_303.method3036();
					if (string_89_.length() > 0)
						Class485.method7932(string_89_, (byte) -91);
				} else if (string.equals("heap"))
					Class485.method7932(new StringBuilder().append("Heap: ").append(Class506.anInt5695 * -518382423).append("MB").toString(), (byte) -47);
				else {
					if (!string.equalsIgnoreCase("getcamerapos"))
						break;
					Class592 class592 = client.aClass505_11019.method8242(55538902);
					if (2 == Class562.anInt7564 * 2097396553) {
						Class437 class437 = Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5378(1657450137);
						Class437 class437_90_ = Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5397(844377960);
						Class485.method7932(new StringBuilder().append("Pos: ").append(new Class592((Class241.player.aByte10821), (int) class437.aFloat4903 >> 9, (int) class437.aFloat4905 >> 9).toString()).append(" Height: ").append((Class53_Sub17.method17220(((int) class437.aFloat4903 - (235453015 * class592.localX << 9)), ((int) class437.aFloat4905 - (class592.localY * 1704054549 << 9)), (Class241.player.aByte10821), 1198302975)) + (int) class437.aFloat4904).toString(), (byte) -89);
						Class485.method7932(new StringBuilder().append("Look: ").append(new Class592((Class241.player.aByte10821), (int) class437_90_.aFloat4903 >> 9, (int) class437_90_.aFloat4905 >> 9).toString()).append(" Height: ").append((Class53_Sub17.method17220(((int) class437_90_.aFloat4903 - (235453015 * class592.localX << 9)), ((int) class437.aFloat4905 - (class592.localY * 1704054549 << 9)), (Class241.player.aByte10821), -812158457)) + (int) class437.aFloat4904).toString(), (byte) -11);
					} else {
						Class485.method7932(new StringBuilder().append("Pos: ").append(Class241.player.aByte10821).append(",").append(((760427037 * Class77.anInt858 >> 9) + class592.localX * 235453015) >> 6).append(",").append((1704054549 * class592.localY + (-1221225203 * Class497.anInt5563 >> 9)) >> 6).append(",").append((class592.localX * 235453015 + (760427037 * Class77.anInt858 >> 9)) & 0x3f).append(",").append(((-1221225203 * Class497.anInt5563 >> 9) + class592.localY * 1704054549) & 0x3f).append(" Height: ").append((Class53_Sub17.method17220(760427037 * Class77.anInt858, -1221225203 * Class497.anInt5563, (Class241.player.aByte10821), 520910818)) - Class285.anInt3085 * 805779207).toString(), (byte) -91);
						Class485.method7932(new StringBuilder().append("Look: ").append(Class241.player.aByte10821).append(",").append((-1744666137 * Class602.anInt7934 + class592.localX * 235453015) >> 6).append(",").append((1704054549 * class592.localY + Class42.anInt564 * -479513739) >> 6).append(",").append((class592.localX * 235453015 + -1744666137 * Class602.anInt7934) & 0x3f).append(",").append((class592.localY * 1704054549 + Class42.anInt564 * -479513739) & 0x3f).append(" Height: ").append((Class53_Sub17.method17220(-1744666137 * Class602.anInt7934, -479513739 * Class42.anInt564, (Class241.player.aByte10821), 2112550796)) - Class290.anInt3146 * 1734327845).toString(), (byte) -27);
					}
				}
			} catch (Exception exception) {
				Class485.method7932((Class39.aClass39_437.method1124(Class53_Sub20.aClass668_10979, (byte) -62)), (byte) -63);
			}
			return;
		} while (false);
		if (Class674.aClass674_8613 != Class80.aClass674_865 || -1746920271 * client.rights >= 2) {
			try {
				if (string.equalsIgnoreCase("wm1")) {
					Class82.method1585(1, -1, -1, false, -1011984276);
					if (Class316.method5685(-149280278) == 1)
						Class485.method7932("Success", (byte) -61);
					else
						Class485.method7932("Failure", (byte) -108);
					return;
				}
				if (string.equalsIgnoreCase("wm2")) {
					Class82.method1585(2, -1, -1, false, -1011984276);
					if (Class316.method5685(-902355136) == 2)
						Class485.method7932("Success", (byte) -63);
					else
						Class485.method7932("Failure", (byte) -47);
					return;
				}
				if (Class710.aBool8840 && string.equalsIgnoreCase("wm3")) {
					Class82.method1585(3, 1024, 768, false, -1011984276);
					if (Class316.method5685(-417749859) == 3)
						Class485.method7932("Success", (byte) -84);
					else
						Class485.method7932("Failure", (byte) -35);
					return;
				}
				if (string.startsWith("setlobby ")) {
					if (16 != -2020118759 * client.anInt11136)
						Class485.method7932("Failure", (byte) -104);
					else {
						int i = -1;
						Object object = null;
						string = string.substring(9);
						int i_91_ = string.indexOf(' ');
						if (-1 == i_91_)
							Class485.method7932("Failure", (byte) -66);
						else {
							try {
								i = Integer.parseInt(string.substring(0, i_91_));
							} catch (NumberFormatException numberformatexception) {
								/* empty */
							}
							if (-1 == i)
								Class485.method7932("Failure", (byte) -61);
							else {
								String string_92_ = new StringBuilder().append(string.substring(i_91_ + 1).trim()).append(".runescape.com").toString();
								Class30.method898(string_92_, i, (byte) 71);
								Class485.method7932("Success", (byte) -44);
								return;
							}
							return;
						}
						return;
					}
					return;
				}
				if (string.equalsIgnoreCase("tk0")) {
					Class535.method8921(0, false, (byte) -37);
					if (Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) 46) == 0) {
						Class485.method7932("Success", (byte) -122);
						Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub1_10629), 0, 1822788470);
						Class211.method3824(1639143395);
						client.aBool11012 = false;
					} else
						Class485.method7932("Failure", (byte) -103);
					return;
				}
				if (string.equalsIgnoreCase("tk1")) {
					Class535.method8921(1, false, (byte) -54);
					if (Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) 1) == 1) {
						Class485.method7932("Success", (byte) -100);
						Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub1_10629), 1, 1118630198);
						Class211.method3824(1682945703);
						client.aBool11012 = false;
					} else
						Class485.method7932("Failure", (byte) -61);
					return;
				}
				if (string.equalsIgnoreCase("tk3")) {
					Class535.method8921(3, false, (byte) -93);
					if (Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) -83) == 3) {
						Class485.method7932("Success", (byte) -90);
						Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub1_10629), 3, 50554549);
						Class211.method3824(1348677694);
						client.aBool11012 = false;
					} else
						Class485.method7932("Failure", (byte) -69);
					return;
				}
				if (string.equalsIgnoreCase("tk5")) {
					Class535.method8921(5, false, (byte) -68);
					if (Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) -96) == 5) {
						Class485.method7932("Success", (byte) -40);
						Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub1_10629), 5, 1688148911);
						Class211.method3824(1861649856);
						client.aBool11012 = false;
					} else
						Class485.method7932("Failure", (byte) -2);
					return;
				}
				if (string.equalsIgnoreCase("clientdrop")) {
					if (9 == -2020118759 * client.anInt11136)
						Class145.method2383((byte) -14);
					else if (10 == client.anInt11136 * -2020118759)
						client.aClass116_11058.aBool1432 = true;
					return;
				}
				if (string.equalsIgnoreCase("breakcon")) {
					RSStream[] class116s = client.aClass116Array11210;
					for (int i = 0; i < class116s.length; i++) {
						RSStream class116 = class116s[i];
						if (class116.getCurrentStream(782493095) != null)
							class116.getCurrentStream(782493095).drop(396789312);
					}
					Class572.aClass458_7684.disconnect(65535);
					return;
				}
				if (string.startsWith("getclientvarpbit")) {
					int i = Integer.parseInt(string.substring(17));
					Class485.method7932(new StringBuilder().append("varpbit=").append(Class98_Sub1_Sub2.playerVarsProvider.method93(Class98_Sub1_Sub2.playerVarsProvider.method106(i, 1169261806), 627310264)).toString(), (byte) -67);
					return;
				}
				if (string.startsWith("getclientvarp")) {
					int i = Integer.parseInt(string.substring(14));
					Class485.method7932(new StringBuilder().append("varp=").append(Class98_Sub1_Sub2.playerVarsProvider.method94((Class98_Sub1_Sub2.playerVarsProvider.method110(VarDomainType.PLAYER_CONFIGS, i, 1649070888)), -1540436978)).toString(), (byte) -103);
					return;
				}
				if (string.startsWith("directlogin")) {
					String[] strings = Class194_Sub13.method15512(string.substring(12), ' ', (byte) -9);
					if (strings.length == 2 || strings.length == 3) {
						if (Class366.method6324(776464567))
							Class173.method2902(400413206);
						Class223.method4147(strings[0], strings[1], (strings.length > 2 ? strings[2] : ""), true, (byte) -9);
					}
					return;
				}
				if (string.startsWith("snlogin ")) {
					String[] strings = Class194_Sub13.method15512(string.substring(8), ' ', (byte) 58);
					int i = Integer.parseInt(strings[0]);
					String string_93_ = strings.length > 1 ? strings[1] : "";
					Class164_Sub1.method14452(i, string_93_, true, -983039560);
					return;
				}
				if (string.startsWith("setoutput ")) {
					File file = new File(string.substring(10));
					if (file.exists()) {
						file = new File(new StringBuilder().append(string.substring(10)).append(".").append(TimeUtils.getCurrentTimeMilliseconds(1516375036)).append(".log").toString());
						if (file.exists()) {
							Class485.method7932("file already exists!", (byte) -69);
							return;
						}
					}
					if (aFileOutputStream1169 != null) {
						aFileOutputStream1169.close();
						aFileOutputStream1169 = null;
					}
					try {
						aFileOutputStream1169 = new FileOutputStream(file);
					} catch (FileNotFoundException filenotfoundexception) {
						Class485.method7932(new StringBuilder().append("Could not create ").append(file.getName()).toString(), (byte) -60);
					} catch (SecurityException securityexception) {
						Class485.method7932(new StringBuilder().append("Cannot write to ").append(file.getName()).toString(), (byte) -44);
					}
					return;
				}
				if (string.equals("closeoutput")) {
					if (aFileOutputStream1169 != null)
						aFileOutputStream1169.close();
					aFileOutputStream1169 = null;
					return;
				}
				if (string.startsWith("runscript ")) {
					File file = new File(string.substring(10));
					if (!file.exists()) {
						Class485.method7932("No such file", (byte) -98);
						return;
					}
					byte[] is = Class578.method9654(file, (short) 1028);
					if (null == is) {
						Class485.method7932("Failed to read file", (byte) -56);
						return;
					}
					String[] strings = (Class194_Sub13.method15512((Class598.method9852(Class238.method4310(is, (byte) -11), '\r', "", -465354146)), '\n', (byte) -28));
					Class61.method1420(strings, 1525766259);
				}
				if (string.equalsIgnoreCase("togglesnow")) {
					aBool1174 = !aBool1174;
					Class485.method7932("Success", (byte) -65);
					return;
				}
				if (9 == client.anInt11136 * -2020118759 || -2020118759 * client.anInt11136 == 0) {
					RSStream class116 = Class537.method8941(-1524463155);
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.COMMANDS_PACKET, class116.aClass11_1413, 1370050649);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(string.length() + 3, 364396372);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(bool ? 1 : 0, -1228895082);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(bool_88_ ? 1 : 0, 268398484);
					class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string, (byte) 25);
					class116.method1974(class523_sub22, (byte) 125);
				}
			} catch (Exception exception) {
				Class485.method7932((Class39.aClass39_437.method1124(Class53_Sub20.aClass668_10979, (byte) -49)), (byte) -21);
				return;
			}
		}
		if (9 != client.anInt11136 * -2020118759 && 0 != client.anInt11136 * -2020118759)
			Class485.method7932(new StringBuilder().append(Class39.aClass39_502.method1124(Class53_Sub20.aClass668_10979, (byte) -31)).append(string).toString(), (byte) 1);
	}

	public static void method1756(String string, boolean bool, boolean bool_94_) {
		do {
			try {
				if (string.equalsIgnoreCase("commands") || string.equalsIgnoreCase("help")) {
					Class485.method7932("commands - This command", (byte) -101);
					Class485.method7932("cls - Clear console", (byte) -73);
					Class485.method7932("displayfps - Toggle FPS and other information", (byte) -41);
					Class485.method7932("renderer - Print graphics renderer information", (byte) -87);
					Class485.method7932("heap - Print java memory information", (byte) -19);
					Class485.method7932("getcamerapos - Print location and direction of camera for use in bug reports", (byte) -58);
				} else if (string.equalsIgnoreCase("cls")) {
					anInt1179 = 0;
					anInt1177 = 0;
				} else if (string.equalsIgnoreCase("displayfps")) {
					client.aBool11096 = !client.aBool11096;
					if (client.aBool11096)
						Class485.method7932("FPS on", (byte) -6);
					else
						Class485.method7932("FPS off", (byte) -26);
				} else if (string.equals("renderer")) {
					Class150 class150 = Class31.aClass178_303.method3401();
					Class485.method7932(new StringBuilder().append("Toolkit ID: ").append(Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) 33)).toString(), (byte) -29);
					Class485.method7932(new StringBuilder().append("Vendor: ").append(class150.anInt1720 * -129955305).toString(), (byte) -126);
					Class485.method7932(new StringBuilder().append("Name: ").append(class150.aString1721).toString(), (byte) -112);
					Class485.method7932(new StringBuilder().append("Version: ").append(1443754951 * class150.anInt1722).toString(), (byte) -102);
					Class485.method7932(new StringBuilder().append("Device: ").append(class150.aString1723).toString(), (byte) -56);
					Class485.method7932(new StringBuilder().append("Driver Version: ").append(class150.aLong1724 * 7027606198026803059L).toString(), (byte) -90);
					String string_95_ = Class31.aClass178_303.method3036();
					if (string_95_.length() > 0)
						Class485.method7932(string_95_, (byte) -82);
				} else if (string.equals("heap"))
					Class485.method7932(new StringBuilder().append("Heap: ").append(Class506.anInt5695 * -518382423).append("MB").toString(), (byte) 0);
				else {
					if (!string.equalsIgnoreCase("getcamerapos"))
						break;
					Class592 class592 = client.aClass505_11019.method8242(55538902);
					if (2 == Class562.anInt7564 * 2097396553) {
						Class437 class437 = Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5378(1615454952);
						Class437 class437_96_ = Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5397(1880662747);
						Class485.method7932(new StringBuilder().append("Pos: ").append(new Class592((Class241.player.aByte10821), (int) class437.aFloat4903 >> 9, (int) class437.aFloat4905 >> 9).toString()).append(" Height: ").append((Class53_Sub17.method17220(((int) class437.aFloat4903 - (235453015 * class592.localX << 9)), ((int) class437.aFloat4905 - (class592.localY * 1704054549 << 9)), (Class241.player.aByte10821), 640370539)) + (int) class437.aFloat4904).toString(), (byte) -7);
						Class485.method7932(new StringBuilder().append("Look: ").append(new Class592((Class241.player.aByte10821), (int) class437_96_.aFloat4903 >> 9, (int) class437_96_.aFloat4905 >> 9).toString()).append(" Height: ").append((Class53_Sub17.method17220(((int) class437_96_.aFloat4903 - (235453015 * class592.localX << 9)), ((int) class437.aFloat4905 - (class592.localY * 1704054549 << 9)), (Class241.player.aByte10821), -111955903)) + (int) class437.aFloat4904).toString(), (byte) -45);
					} else {
						Class485.method7932(new StringBuilder().append("Pos: ").append(Class241.player.aByte10821).append(",").append(((760427037 * Class77.anInt858 >> 9) + class592.localX * 235453015) >> 6).append(",").append((1704054549 * class592.localY + (-1221225203 * Class497.anInt5563 >> 9)) >> 6).append(",").append((class592.localX * 235453015 + (760427037 * Class77.anInt858 >> 9)) & 0x3f).append(",").append(((-1221225203 * Class497.anInt5563 >> 9) + class592.localY * 1704054549) & 0x3f).append(" Height: ").append((Class53_Sub17.method17220(760427037 * Class77.anInt858, -1221225203 * Class497.anInt5563, (Class241.player.aByte10821), 1515559866)) - Class285.anInt3085 * 805779207).toString(), (byte) -56);
						Class485.method7932(new StringBuilder().append("Look: ").append(Class241.player.aByte10821).append(",").append((-1744666137 * Class602.anInt7934 + class592.localX * 235453015) >> 6).append(",").append((1704054549 * class592.localY + Class42.anInt564 * -479513739) >> 6).append(",").append((class592.localX * 235453015 + -1744666137 * Class602.anInt7934) & 0x3f).append(",").append((class592.localY * 1704054549 + Class42.anInt564 * -479513739) & 0x3f).append(" Height: ").append((Class53_Sub17.method17220(-1744666137 * Class602.anInt7934, -479513739 * Class42.anInt564, (Class241.player.aByte10821), 1969786159)) - Class290.anInt3146 * 1734327845).toString(), (byte) -124);
					}
				}
			} catch (Exception exception) {
				Class485.method7932((Class39.aClass39_437.method1124(Class53_Sub20.aClass668_10979, (byte) -117)), (byte) -85);
			}
			return;
		} while (false);
		if (Class674.aClass674_8613 != Class80.aClass674_865 || -1746920271 * client.rights >= 2) {
			try {
				if (string.equalsIgnoreCase("wm1")) {
					Class82.method1585(1, -1, -1, false, -1011984276);
					if (Class316.method5685(-1823623300) == 1)
						Class485.method7932("Success", (byte) -29);
					else
						Class485.method7932("Failure", (byte) -23);
					return;
				}
				if (string.equalsIgnoreCase("wm2")) {
					Class82.method1585(2, -1, -1, false, -1011984276);
					if (Class316.method5685(-72909734) == 2)
						Class485.method7932("Success", (byte) -8);
					else
						Class485.method7932("Failure", (byte) -118);
					return;
				}
				if (Class710.aBool8840 && string.equalsIgnoreCase("wm3")) {
					Class82.method1585(3, 1024, 768, false, -1011984276);
					if (Class316.method5685(550389604) == 3)
						Class485.method7932("Success", (byte) 1);
					else
						Class485.method7932("Failure", (byte) -37);
					return;
				}
				if (string.startsWith("setlobby ")) {
					if (16 != -2020118759 * client.anInt11136)
						Class485.method7932("Failure", (byte) -109);
					else {
						int i = -1;
						Object object = null;
						string = string.substring(9);
						int i_97_ = string.indexOf(' ');
						if (-1 == i_97_)
							Class485.method7932("Failure", (byte) -1);
						else {
							try {
								i = Integer.parseInt(string.substring(0, i_97_));
							} catch (NumberFormatException numberformatexception) {
								/* empty */
							}
							if (-1 == i)
								Class485.method7932("Failure", (byte) -48);
							else {
								String string_98_ = new StringBuilder().append(string.substring(i_97_ + 1).trim()).append(".runescape.com").toString();
								Class30.method898(string_98_, i, (byte) 74);
								Class485.method7932("Success", (byte) -70);
								return;
							}
							return;
						}
						return;
					}
					return;
				}
				if (string.equalsIgnoreCase("tk0")) {
					Class535.method8921(0, false, (byte) -115);
					if (Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) -16) == 0) {
						Class485.method7932("Success", (byte) -13);
						Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub1_10629), 0, 656498003);
						Class211.method3824(1665765455);
						client.aBool11012 = false;
					} else
						Class485.method7932("Failure", (byte) -40);
					return;
				}
				if (string.equalsIgnoreCase("tk1")) {
					Class535.method8921(1, false, (byte) -61);
					if (Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) 0) == 1) {
						Class485.method7932("Success", (byte) -104);
						Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub1_10629), 1, 662467622);
						Class211.method3824(1295021038);
						client.aBool11012 = false;
					} else
						Class485.method7932("Failure", (byte) -25);
					return;
				}
				if (string.equalsIgnoreCase("tk3")) {
					Class535.method8921(3, false, (byte) -52);
					if (Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) 89) == 3) {
						Class485.method7932("Success", (byte) -42);
						Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub1_10629), 3, 1877563795);
						Class211.method3824(1574969116);
						client.aBool11012 = false;
					} else
						Class485.method7932("Failure", (byte) -116);
					return;
				}
				if (string.equalsIgnoreCase("tk5")) {
					Class535.method8921(5, false, (byte) -87);
					if (Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) -9) == 5) {
						Class485.method7932("Success", (byte) -42);
						Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub1_10629), 5, 1907206371);
						Class211.method3824(1834274734);
						client.aBool11012 = false;
					} else
						Class485.method7932("Failure", (byte) -10);
					return;
				}
				if (string.equalsIgnoreCase("clientdrop")) {
					if (9 == -2020118759 * client.anInt11136)
						Class145.method2383((byte) -128);
					else if (10 == client.anInt11136 * -2020118759)
						client.aClass116_11058.aBool1432 = true;
					return;
				}
				if (string.equalsIgnoreCase("breakcon")) {
					RSStream[] class116s = client.aClass116Array11210;
					for (int i = 0; i < class116s.length; i++) {
						RSStream class116 = class116s[i];
						if (class116.getCurrentStream(782493095) != null)
							class116.getCurrentStream(782493095).drop(-1313569718);
					}
					Class572.aClass458_7684.disconnect(65535);
					return;
				}
				if (string.startsWith("getclientvarpbit")) {
					int i = Integer.parseInt(string.substring(17));
					Class485.method7932(new StringBuilder().append("varpbit=").append(Class98_Sub1_Sub2.playerVarsProvider.method93(Class98_Sub1_Sub2.playerVarsProvider.method106(i, -753186886), -1935821495)).toString(), (byte) -44);
					return;
				}
				if (string.startsWith("getclientvarp")) {
					int i = Integer.parseInt(string.substring(14));
					Class485.method7932(new StringBuilder().append("varp=").append(Class98_Sub1_Sub2.playerVarsProvider.method94((Class98_Sub1_Sub2.playerVarsProvider.method110(VarDomainType.PLAYER_CONFIGS, i, 2021902050)), 1190344443)).toString(), (byte) -97);
					return;
				}
				if (string.startsWith("directlogin")) {
					String[] strings = Class194_Sub13.method15512(string.substring(12), ' ', (byte) 35);
					if (strings.length == 2 || strings.length == 3) {
						if (Class366.method6324(80572474))
							Class173.method2902(232593884);
						Class223.method4147(strings[0], strings[1], (strings.length > 2 ? strings[2] : ""), true, (byte) -55);
					}
					return;
				}
				if (string.startsWith("snlogin ")) {
					String[] strings = Class194_Sub13.method15512(string.substring(8), ' ', (byte) -44);
					int i = Integer.parseInt(strings[0]);
					String string_99_ = strings.length > 1 ? strings[1] : "";
					Class164_Sub1.method14452(i, string_99_, true, 2076641700);
					return;
				}
				if (string.startsWith("setoutput ")) {
					File file = new File(string.substring(10));
					if (file.exists()) {
						file = new File(new StringBuilder().append(string.substring(10)).append(".").append(TimeUtils.getCurrentTimeMilliseconds(1516375036)).append(".log").toString());
						if (file.exists()) {
							Class485.method7932("file already exists!", (byte) -101);
							return;
						}
					}
					if (aFileOutputStream1169 != null) {
						aFileOutputStream1169.close();
						aFileOutputStream1169 = null;
					}
					try {
						aFileOutputStream1169 = new FileOutputStream(file);
					} catch (FileNotFoundException filenotfoundexception) {
						Class485.method7932(new StringBuilder().append("Could not create ").append(file.getName()).toString(), (byte) -124);
					} catch (SecurityException securityexception) {
						Class485.method7932(new StringBuilder().append("Cannot write to ").append(file.getName()).toString(), (byte) -99);
					}
					return;
				}
				if (string.equals("closeoutput")) {
					if (aFileOutputStream1169 != null)
						aFileOutputStream1169.close();
					aFileOutputStream1169 = null;
					return;
				}
				if (string.startsWith("runscript ")) {
					File file = new File(string.substring(10));
					if (!file.exists()) {
						Class485.method7932("No such file", (byte) -26);
						return;
					}
					byte[] is = Class578.method9654(file, (short) 1028);
					if (null == is) {
						Class485.method7932("Failed to read file", (byte) -103);
						return;
					}
					String[] strings = (Class194_Sub13.method15512((Class598.method9852(Class238.method4310(is, (byte) -72), '\r', "", 274415055)), '\n', (byte) -9));
					Class61.method1420(strings, 2058038160);
				}
				if (string.equalsIgnoreCase("togglesnow")) {
					aBool1174 = !aBool1174;
					Class485.method7932("Success", (byte) -120);
					return;
				}
				if (9 == client.anInt11136 * -2020118759 || -2020118759 * client.anInt11136 == 0) {
					RSStream class116 = Class537.method8941(-2057665203);
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.COMMANDS_PACKET, class116.aClass11_1413, 1370050649);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(string.length() + 3, 1847382466);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(bool ? 1 : 0, 1523089905);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(bool_94_ ? 1 : 0, 1716335695);
					class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string, (byte) -30);
					class116.method1974(class523_sub22, (byte) 21);
				}
			} catch (Exception exception) {
				Class485.method7932((Class39.aClass39_437.method1124(Class53_Sub20.aClass668_10979, (byte) -45)), (byte) -74);
				return;
			}
		}
		if (9 != client.anInt11136 * -2020118759 && 0 != client.anInt11136 * -2020118759)
			Class485.method7932(new StringBuilder().append(Class39.aClass39_502.method1124(Class53_Sub20.aClass668_10979, (byte) -98)).append(string).toString(), (byte) -111);
	}

	static boolean method1757() {
		return aBool1164;
	}

	static void method1758(int i) {
		if (21 == i)
			throw new Error();
		if (i == 9)
			throw new OutOfMemoryError();
		try {
			if (i == 6)
				Class56.method1363(-1723841892);
			else if (16 == i)
				Class485.method7932(new StringBuilder().append("").append(Class506.anInt5662 * -1307622225).toString(), (byte) -4);
			else if (i == 3) {
				Class544 class544 = (client.aClass505_11019.method8241((byte) -99).aClass544_7541);
				class544.aBool7277 = !class544.aBool7277;
			} else if (24 == i)
				client.aBool11096 = true;
			else if (i == 23)
				client.aBool11096 = false;
			else if (19 == i)
				client.aClass701_11132.method14082((byte) -6);
			else if (i == 29) {
				Class550.method9123((byte) 3);
				for (int i_100_ = 0; i_100_ < 10; i_100_++)
					System.gc();
				Runtime runtime = Runtime.getRuntime();
				int i_101_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class485.method7932(new StringBuilder().append("").append(i_101_).toString(), (byte) -1);
			} else if (i == 27) {
				Class550.method9123((byte) 15);
				for (int i_102_ = 0; i_102_ < 10; i_102_++)
					System.gc();
				Runtime runtime = Runtime.getRuntime();
				int i_103_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class485.method7932(new StringBuilder().append("").append(i_103_).toString(), (byte) -30);
				Class468.method7608((short) -1558);
				Class550.method9123((byte) 6);
				for (int i_104_ = 0; i_104_ < 10; i_104_++)
					System.gc();
				i_103_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class485.method7932(new StringBuilder().append("").append(i_103_).toString(), (byte) -120);
			} else if (5 == i)
				Class485.method7932((Class194_Sub19.aClass532_9953.method380(-911394970) ? "Success" : "Failure"), (byte) -51);
			else if (i == 28)
				Class155.aClass1_1735.method497((byte) 3);
			else if (i == 22)
				Class572.aClass458_7684.close(-628144884);
			else if (13 == i)
				Class572.aClass458_7684.finishGrabServer(2002437890);
			else if (i == 7)
				Class523_Sub18_Sub8.aCanvas11689.setLocation(50, 50);
			else if (i == 25)
				Class523_Sub18_Sub8.aCanvas11689.setLocation(Class506.anInt5660 * -1901078577, Class506.anInt5670 * -1734289153);
			else if (i == 17)
				Class87.method1615(1444609703);
			else if (i == 8) {
				client.aClass505_11019.aLong5656 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * -7546729170109173589L;
				client.aClass505_11019.aBool5655 = true;
				Class87.method1615(1444609703);
			} else if (10 == i) {
				Class437 class437 = (Class241.player.method10569().aClass437_4862);
				Class485.method7932(new StringBuilder().append((int) class437.aFloat4903 >> 9).append(" ").append((int) class437.aFloat4905 >> 9).toString(), (byte) -4);
			} else if (11 == i) {
				Class437 class437 = (Class241.player.method10569().aClass437_4862);
				Class485.method7932(new StringBuilder().append("").append(client.aClass505_11019.method8241((byte) -59).aClass142Array7509[(Class241.player.aByte10821)].method2321((int) class437.aFloat4903 >> 9, (int) class437.aFloat4905 >> 9, 1677620402)).toString(), (byte) -64);
			} else if (1 == i) {
				Class485.method7932(new StringBuilder().append(InterfaceComponentDefinitions.aClass209_2521.method3780(30105747)).append(" ").append(InterfaceComponentDefinitions.aClass209_2521.method3774((short) 12141)).toString(), (byte) -59);
				Class485.method7932(new StringBuilder().append(InterfaceComponentDefinitions.aClass209_2524.method3780(30105747)).append(" ").append(InterfaceComponentDefinitions.aClass209_2524.method3774((short) 8756)).toString(), (byte) -109);
			} else if (4 == i)
				Class679.method13827(false, (byte) -38);
			else if (20 == i) {
				client.aBool11280 = !client.aBool11280;
				Class31.aClass178_303.method3157(client.aBool11280);
				Class170.method2889(-1009972049);
			} else if (14 == i) {
				client.anInt11228 = 0;
				client.aClass505_11019.method8294(-889374440);
			} else if (i == 15) {
				client.anInt11228 = -965789903;
				client.aClass505_11019.method8294(-889374440);
			} else if (i == 26) {
				client.anInt11228 = -1931579806;
				client.aClass505_11019.method8294(-889374440);
			}
		} catch (Exception exception) {
			Class485.method7932(Class39.aClass39_437.method1124(Class53_Sub20.aClass668_10979, (byte) -59), (byte) -97);
		}
	}

	static void method1759(int i) {
		if (21 == i)
			throw new Error();
		if (i == 9)
			throw new OutOfMemoryError();
		try {
			if (i == 6)
				Class56.method1363(-1638784719);
			else if (16 == i)
				Class485.method7932(new StringBuilder().append("").append(Class506.anInt5662 * -1307622225).toString(), (byte) -5);
			else if (i == 3) {
				Class544 class544 = (client.aClass505_11019.method8241((byte) -90).aClass544_7541);
				class544.aBool7277 = !class544.aBool7277;
			} else if (24 == i)
				client.aBool11096 = true;
			else if (i == 23)
				client.aBool11096 = false;
			else if (19 == i)
				client.aClass701_11132.method14082((byte) -85);
			else if (i == 29) {
				Class550.method9123((byte) 67);
				for (int i_105_ = 0; i_105_ < 10; i_105_++)
					System.gc();
				Runtime runtime = Runtime.getRuntime();
				int i_106_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class485.method7932(new StringBuilder().append("").append(i_106_).toString(), (byte) -30);
			} else if (i == 27) {
				Class550.method9123((byte) -60);
				for (int i_107_ = 0; i_107_ < 10; i_107_++)
					System.gc();
				Runtime runtime = Runtime.getRuntime();
				int i_108_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class485.method7932(new StringBuilder().append("").append(i_108_).toString(), (byte) -38);
				Class468.method7608((short) -10473);
				Class550.method9123((byte) -60);
				for (int i_109_ = 0; i_109_ < 10; i_109_++)
					System.gc();
				i_108_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class485.method7932(new StringBuilder().append("").append(i_108_).toString(), (byte) -66);
			} else if (5 == i)
				Class485.method7932((Class194_Sub19.aClass532_9953.method380(-842052594) ? "Success" : "Failure"), (byte) -101);
			else if (i == 28)
				Class155.aClass1_1735.method497((byte) -75);
			else if (i == 22)
				Class572.aClass458_7684.close(-645958205);
			else if (13 == i)
				Class572.aClass458_7684.finishGrabServer(2002437890);
			else if (i == 7)
				Class523_Sub18_Sub8.aCanvas11689.setLocation(50, 50);
			else if (i == 25)
				Class523_Sub18_Sub8.aCanvas11689.setLocation(Class506.anInt5660 * -1901078577, Class506.anInt5670 * -1734289153);
			else if (i == 17)
				Class87.method1615(1444609703);
			else if (i == 8) {
				client.aClass505_11019.aLong5656 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * -7546729170109173589L;
				client.aClass505_11019.aBool5655 = true;
				Class87.method1615(1444609703);
			} else if (10 == i) {
				Class437 class437 = (Class241.player.method10569().aClass437_4862);
				Class485.method7932(new StringBuilder().append((int) class437.aFloat4903 >> 9).append(" ").append((int) class437.aFloat4905 >> 9).toString(), (byte) -108);
			} else if (11 == i) {
				Class437 class437 = (Class241.player.method10569().aClass437_4862);
				Class485.method7932(new StringBuilder().append("").append(client.aClass505_11019.method8241((byte) -106).aClass142Array7509[(Class241.player.aByte10821)].method2321((int) class437.aFloat4903 >> 9, (int) class437.aFloat4905 >> 9, 1602875264)).toString(), (byte) -9);
			} else if (1 == i) {
				Class485.method7932(new StringBuilder().append(InterfaceComponentDefinitions.aClass209_2521.method3780(30105747)).append(" ").append(InterfaceComponentDefinitions.aClass209_2521.method3774((short) 26197)).toString(), (byte) -30);
				Class485.method7932(new StringBuilder().append(InterfaceComponentDefinitions.aClass209_2524.method3780(30105747)).append(" ").append(InterfaceComponentDefinitions.aClass209_2524.method3774((short) 20585)).toString(), (byte) -32);
			} else if (4 == i)
				Class679.method13827(false, (byte) -101);
			else if (20 == i) {
				client.aBool11280 = !client.aBool11280;
				Class31.aClass178_303.method3157(client.aBool11280);
				Class170.method2889(-1009972049);
			} else if (14 == i) {
				client.anInt11228 = 0;
				client.aClass505_11019.method8294(-889374440);
			} else if (i == 15) {
				client.anInt11228 = -965789903;
				client.aClass505_11019.method8294(-889374440);
			} else if (i == 26) {
				client.anInt11228 = -1931579806;
				client.aClass505_11019.method8294(-889374440);
			}
		} catch (Exception exception) {
			Class485.method7932(Class39.aClass39_437.method1124(Class53_Sub20.aClass668_10979, (byte) -93), (byte) -4);
		}
	}

	static void method1760() {
		if (Class449.aClass523_Sub33_4946.aClass687_Sub29_10647.method16971((byte) 61) == 1)
			Class329_Sub2.aClass511_10050.method8556(new Class496(Class500.aClass500_5574, null), (short) -8628);
		else {
			client.aClass505_11019.method8294(-889374440);
			Class321.method5720((byte) -12);
		}
	}

	static void method1761(boolean bool) {
		aString1171 = aString1171.trim();
		anInt1166 = 0;
		if (aString1171.length() == 0)
			anInt1173 = 0;
		else {
			Class485.method7932(new StringBuilder().append("--> ").append(aString1171).toString(), (byte) -105);
			Class264.method4746(aString1171, false, bool, -1864172088);
			if (!bool) {
				anInt1173 = 0;
				aString1171 = "";
			} else
				anInt1173 = aString1171.length() * 331909503;
		}
	}

	static final void method1762(Class669 class669, int i) {
		int i_110_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		if (326760831 * client.anInt11235 != 0 && i_110_ < client.anInt11078 * 54287651) {
			Class51 class51 = client.aClass51Array11294[i_110_];
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = class51.aString714;
			if (null != class51.aString712)
				class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = class51.aString712;
			else
				class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
		} else {
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
		}
	}

	public static int method1763(int i, int i_111_) {
		Class523_Sub27_Sub15 class523_sub27_sub15 = ((Class523_Sub27_Sub15) Class271.aClass14_2876.getFromIndex((long) i));
		if (class523_sub27_sub15 == null)
			return -1;
		if (class523_sub27_sub15.aClass523_Sub27_10553 == Class271.aClass697_2877.aClass523_Sub27_8763)
			return -1;
		return (((Class523_Sub27_Sub15) class523_sub27_sub15.aClass523_Sub27_10553).anInt11762 * 1066462451);
	}

	public static Interface75 method1764(Class var_class, int i, int i_112_) {
		synchronized (Class685.aMap8665) {
			Map map = (Map) Class685.aMap8665.get(var_class);
			if (map == null) {
				map = new HashMap();
				Interface75[] interface75s = (Interface75[]) var_class.getEnumConstants();
				for (int i_113_ = 0; i_113_ < interface75s.length; i_113_++) {
					Interface75 interface75 = interface75s[i_113_];
					map.put(Integer.valueOf(interface75.method82()), interface75);
				}
				Class685.aMap8665.put(var_class, map);
			}
			Interface75 interface75 = (Interface75) map.get(Integer.valueOf(i));
			return interface75;
		}
	}

	static final void method1765(Class669 class669, byte i) {
		int i_114_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_114_, -624347397);
		Class242 class242 = Class31.aClass242Array302[i_114_ >> 16];
		Class308.method5593(class250, class242, class669, (short) -7989);
	}

	static final void method1766(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_115_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_116_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_115_ & i_116_;
	}

	static void method1767(Interface66 interface66, int i) {
		while (Class584.aLinkedList7714.size() > 10)
			Class584.aLinkedList7714.remove();
		Class584.aLinkedList7714.add(interface66);
	}
}
