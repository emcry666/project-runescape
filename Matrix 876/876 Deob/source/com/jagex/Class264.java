/* Class264 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Class264 {
	public Class267[] aClass267Array2845;
	public String aString2846;
	public String aString2847;
	public String aString2848;
	public Class267[] aClass267Array2849;

	Class264() {
		/* empty */
	}

	void method4744(Class259 class259, int i) {
		aString2848 = class259.method4692(2016978264);
		aString2846 = class259.method4692(1627599838);
		aString2847 = class259.method4692(1678691682);
		int i_0_ = class259.method4689(-436580489);
		int i_1_ = class259.method4689(-1219074422);
		aClass267Array2849 = i_0_ == 0 ? null : new Class267[i_0_];
		aClass267Array2845 = i_1_ == 0 ? null : new Class267[i_1_];
		for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
			aClass267Array2849[i_2_] = new Class267();
			aClass267Array2849[i_2_].method4892(class259, (byte) -103);
		}
		for (int i_3_ = 0; i_3_ < i_1_; i_3_++) {
			aClass267Array2845[i_3_] = new Class267();
			aClass267Array2845[i_3_].method4892(class259, (byte) -29);
		}
	}

	void method4745(Class259 class259) {
		aString2848 = class259.method4692(1327980133);
		aString2846 = class259.method4692(1842640507);
		aString2847 = class259.method4692(1990280550);
		int i = class259.method4689(500583066);
		int i_4_ = class259.method4689(1490681140);
		aClass267Array2849 = i == 0 ? null : new Class267[i];
		aClass267Array2845 = i_4_ == 0 ? null : new Class267[i_4_];
		for (int i_5_ = 0; i_5_ < i; i_5_++) {
			aClass267Array2849[i_5_] = new Class267();
			aClass267Array2849[i_5_].method4892(class259, (byte) -8);
		}
		for (int i_6_ = 0; i_6_ < i_4_; i_6_++) {
			aClass267Array2845[i_6_] = new Class267();
			aClass267Array2845[i_6_].method4892(class259, (byte) -35);
		}
	}

	public static void method4746(String string, boolean bool, boolean bool_7_, int i) {
		do {
			try {
				if (string.equalsIgnoreCase("commands") || string.equalsIgnoreCase("help")) {
					Class485.method7932("commands - This command", (byte) -105);
					Class485.method7932("cls - Clear console", (byte) -78);
					Class485.method7932("displayfps - Toggle FPS and other information", (byte) -126);
					Class485.method7932("renderer - Print graphics renderer information", (byte) -77);
					Class485.method7932("heap - Print java memory information", (byte) -116);
					Class485.method7932("getcamerapos - Print location and direction of camera for use in bug reports", (byte) -11);
				} else if (string.equalsIgnoreCase("cls")) {
					Class95.anInt1179 = 0;
					Class95.anInt1177 = 0;
				} else if (string.equalsIgnoreCase("displayfps")) {
					client.aBool11096 = !client.aBool11096;
					if (client.aBool11096)
						Class485.method7932("FPS on", (byte) -65);
					else
						Class485.method7932("FPS off", (byte) -96);
				} else if (string.equals("renderer")) {
					Class150 class150 = Class31.aClass178_303.method3401();
					Class485.method7932(new StringBuilder().append("Toolkit ID: ").append(Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) -49)).toString(), (byte) -107);
					Class485.method7932(new StringBuilder().append("Vendor: ").append(class150.anInt1720 * -129955305).toString(), (byte) -40);
					Class485.method7932(new StringBuilder().append("Name: ").append(class150.aString1721).toString(), (byte) -23);
					Class485.method7932(new StringBuilder().append("Version: ").append(1443754951 * class150.anInt1722).toString(), (byte) 1);
					Class485.method7932(new StringBuilder().append("Device: ").append(class150.aString1723).toString(), (byte) -61);
					Class485.method7932(new StringBuilder().append("Driver Version: ").append(class150.aLong1724 * 7027606198026803059L).toString(), (byte) -18);
					String string_8_ = Class31.aClass178_303.method3036();
					if (string_8_.length() > 0)
						Class485.method7932(string_8_, (byte) -62);
				} else if (string.equals("heap"))
					Class485.method7932(new StringBuilder().append("Heap: ").append(Class506.anInt5695 * -518382423).append("MB").toString(), (byte) -111);
				else {
					if (!string.equalsIgnoreCase("getcamerapos"))
						break;
					Class592 class592 = client.aClass505_11019.method8242(55538902);
					if (2 == Class562.anInt7564 * 2097396553) {
						Class437 class437 = Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5378(1278469075);
						Class437 class437_9_ = Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5397(1013238619);
						Class485.method7932(new StringBuilder().append("Pos: ").append(new Class592((Class241.player.aByte10821), (int) class437.aFloat4903 >> 9, (int) class437.aFloat4905 >> 9).toString()).append(" Height: ").append((Class53_Sub17.method17220(((int) class437.aFloat4903 - (235453015 * class592.localX << 9)), ((int) class437.aFloat4905 - (class592.localY * 1704054549 << 9)), (Class241.player.aByte10821), -726146514)) + (int) class437.aFloat4904).toString(), (byte) -40);
						Class485.method7932(new StringBuilder().append("Look: ").append(new Class592((Class241.player.aByte10821), (int) class437_9_.aFloat4903 >> 9, (int) class437_9_.aFloat4905 >> 9).toString()).append(" Height: ").append((Class53_Sub17.method17220(((int) class437_9_.aFloat4903 - (235453015 * class592.localX << 9)), ((int) class437.aFloat4905 - (class592.localY * 1704054549 << 9)), (Class241.player.aByte10821), -1025268105)) + (int) class437.aFloat4904).toString(), (byte) -16);
					} else {
						Class485.method7932(new StringBuilder().append("Pos: ").append(Class241.player.aByte10821).append(",").append(((760427037 * Class77.anInt858 >> 9) + class592.localX * 235453015) >> 6).append(",").append((1704054549 * class592.localY + (-1221225203 * Class497.anInt5563 >> 9)) >> 6).append(",").append((class592.localX * 235453015 + (760427037 * Class77.anInt858 >> 9)) & 0x3f).append(",").append(((-1221225203 * Class497.anInt5563 >> 9) + class592.localY * 1704054549) & 0x3f).append(" Height: ").append((Class53_Sub17.method17220(760427037 * Class77.anInt858, -1221225203 * Class497.anInt5563, (Class241.player.aByte10821), -486089866)) - Class285.anInt3085 * 805779207).toString(), (byte) -16);
						Class485.method7932(new StringBuilder().append("Look: ").append(Class241.player.aByte10821).append(",").append((-1744666137 * Class602.anInt7934 + class592.localX * 235453015) >> 6).append(",").append((1704054549 * class592.localY + Class42.anInt564 * -479513739) >> 6).append(",").append((class592.localX * 235453015 + -1744666137 * Class602.anInt7934) & 0x3f).append(",").append((class592.localY * 1704054549 + Class42.anInt564 * -479513739) & 0x3f).append(" Height: ").append((Class53_Sub17.method17220(-1744666137 * Class602.anInt7934, -479513739 * Class42.anInt564, (Class241.player.aByte10821), -1038587401)) - Class290.anInt3146 * 1734327845).toString(), (byte) -107);
					}
				}
			} catch (Exception exception) {
				Class485.method7932((Class39.aClass39_437.method1124(Class53_Sub20.aClass668_10979, (byte) -118)), (byte) -44);
			}
			return;
		} while (false);
		if (Class674.aClass674_8613 != Class80.aClass674_865 || -1746920271 * client.rights >= 2) {
			try {
				if (string.equalsIgnoreCase("wm1")) {
					Class82.method1585(1, -1, -1, false, -1011984276);
					if (Class316.method5685(-1872120024) == 1)
						Class485.method7932("Success", (byte) -115);
					else
						Class485.method7932("Failure", (byte) -13);
					return;
				}
				if (string.equalsIgnoreCase("wm2")) {
					Class82.method1585(2, -1, -1, false, -1011984276);
					if (Class316.method5685(-1219208247) == 2)
						Class485.method7932("Success", (byte) -116);
					else
						Class485.method7932("Failure", (byte) -79);
					return;
				}
				if (Class710.aBool8840 && string.equalsIgnoreCase("wm3")) {
					Class82.method1585(3, 1024, 768, false, -1011984276);
					if (Class316.method5685(-957334532) == 3)
						Class485.method7932("Success", (byte) -36);
					else
						Class485.method7932("Failure", (byte) -28);
					return;
				}
				if (string.startsWith("setlobby ")) {
					if (16 != -2020118759 * client.anInt11136)
						Class485.method7932("Failure", (byte) -39);
					else {
						int i_10_ = -1;
						Object object = null;
						string = string.substring(9);
						int i_11_ = string.indexOf(' ');
						if (-1 == i_11_)
							Class485.method7932("Failure", (byte) -18);
						else {
							try {
								i_10_ = (Integer.parseInt(string.substring(0, i_11_)));
							} catch (NumberFormatException numberformatexception) {
								/* empty */
							}
							if (-1 == i_10_)
								Class485.method7932("Failure", (byte) -95);
							else {
								String string_12_ = new StringBuilder().append(string.substring(i_11_ + 1).trim()).append(".runescape.com").toString();
								Class30.method898(string_12_, i_10_, (byte) 4);
								Class485.method7932("Success", (byte) -71);
								return;
							}
							return;
						}
						return;
					}
					return;
				}
				if (string.equalsIgnoreCase("tk0")) {
					Class535.method8921(0, false, (byte) -85);
					if (Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) -5) == 0) {
						Class485.method7932("Success", (byte) -58);
						Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub1_10629), 0, 1568527822);
						Class211.method3824(1331776245);
						client.aBool11012 = false;
					} else
						Class485.method7932("Failure", (byte) -31);
					return;
				}
				if (string.equalsIgnoreCase("tk1")) {
					Class535.method8921(1, false, (byte) -36);
					if (Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) -23) == 1) {
						Class485.method7932("Success", (byte) -48);
						Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub1_10629), 1, 2040958234);
						Class211.method3824(959391126);
						client.aBool11012 = false;
					} else
						Class485.method7932("Failure", (byte) -77);
					return;
				}
				if (string.equalsIgnoreCase("tk3")) {
					Class535.method8921(3, false, (byte) -75);
					if (Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) -68) == 3) {
						Class485.method7932("Success", (byte) -127);
						Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub1_10629), 3, 1176412023);
						Class211.method3824(2061924305);
						client.aBool11012 = false;
					} else
						Class485.method7932("Failure", (byte) -1);
					return;
				}
				if (string.equalsIgnoreCase("tk5")) {
					Class535.method8921(5, false, (byte) -68);
					if (Class449.aClass523_Sub33_4946.aClass687_Sub1_10630.method16678((byte) 66) == 5) {
						Class485.method7932("Success", (byte) -36);
						Class449.aClass523_Sub33_4946.method16240((Class449.aClass523_Sub33_4946.aClass687_Sub1_10629), 5, -1312489199);
						Class211.method3824(1472016997);
						client.aBool11012 = false;
					} else
						Class485.method7932("Failure", (byte) -120);
					return;
				}
				if (string.equalsIgnoreCase("clientdrop")) {
					if (9 == -2020118759 * client.anInt11136)
						Class145.method2383((byte) -50);
					else if (10 == client.anInt11136 * -2020118759)
						client.aClass116_11058.aBool1432 = true;
					return;
				}
				if (string.equalsIgnoreCase("breakcon")) {
					RSStream[] streamarray = client.aClass116Array11210;
					for (int i_13_ = 0; i_13_ < streamarray.length; i_13_++) {
						RSStream streams = streamarray[i_13_];
						if (streams.getCurrentStream(782493095) != null)
							streams.getCurrentStream(782493095).drop(-574844400);
					}
					Class572.aClass458_7684.disconnect(65535);
					return;
				}
				if (string.startsWith("getclientvarpbit")) {
					int i_14_ = Integer.parseInt(string.substring(17));
					Class485.method7932(new StringBuilder().append("varpbit=").append(Class98_Sub1_Sub2.playerVarsProvider.method93(Class98_Sub1_Sub2.playerVarsProvider.method106(i_14_, 979675867), 142892501)).toString(), (byte) -47);
					return;
				}
				if (string.startsWith("getclientvarp")) {
					int i_15_ = Integer.parseInt(string.substring(14));
					Class485.method7932(new StringBuilder().append("varp=").append(Class98_Sub1_Sub2.playerVarsProvider.method94((Class98_Sub1_Sub2.playerVarsProvider.method110(VarDomainType.PLAYER_CONFIGS, i_15_, 1916119467)), 758882264)).toString(), (byte) -100);
					return;
				}
				if (string.startsWith("directlogin")) {
					String[] strings = Class194_Sub13.method15512(string.substring(12), ' ', (byte) 3);
					if (strings.length == 2 || strings.length == 3) {
						if (Class366.method6324(-1833081624))
							Class173.method2902(323985385);
						Class223.method4147(strings[0], strings[1], (strings.length > 2 ? strings[2] : ""), true, (byte) 9);
					}
					return;
				}
				if (string.startsWith("snlogin ")) {
					String[] strings = Class194_Sub13.method15512(string.substring(8), ' ', (byte) -81);
					int i_16_ = Integer.parseInt(strings[0]);
					String string_17_ = strings.length > 1 ? strings[1] : "";
					Class164_Sub1.method14452(i_16_, string_17_, true, -62431690);
					return;
				}
				if (string.startsWith("setoutput ")) {
					File file = new File(string.substring(10));
					if (file.exists()) {
						file = new File(new StringBuilder().append(string.substring(10)).append(".").append(TimeUtils.getCurrentTimeMilliseconds(1516375036)).append(".log").toString());
						if (file.exists()) {
							Class485.method7932("file already exists!", (byte) -127);
							return;
						}
					}
					if (Class95.aFileOutputStream1169 != null) {
						Class95.aFileOutputStream1169.close();
						Class95.aFileOutputStream1169 = null;
					}
					try {
						Class95.aFileOutputStream1169 = new FileOutputStream(file);
					} catch (FileNotFoundException filenotfoundexception) {
						Class485.method7932(new StringBuilder().append("Could not create ").append(file.getName()).toString(), (byte) -58);
					} catch (SecurityException securityexception) {
						Class485.method7932(new StringBuilder().append("Cannot write to ").append(file.getName()).toString(), (byte) -55);
					}
					return;
				}
				if (string.equals("closeoutput")) {
					if (Class95.aFileOutputStream1169 != null)
						Class95.aFileOutputStream1169.close();
					Class95.aFileOutputStream1169 = null;
					return;
				}
				if (string.startsWith("runscript ")) {
					File file = new File(string.substring(10));
					if (!file.exists()) {
						Class485.method7932("No such file", (byte) -44);
						return;
					}
					byte[] is = Class578.method9654(file, (short) 1028);
					if (null == is) {
						Class485.method7932("Failed to read file", (byte) -96);
						return;
					}
					String[] strings = (Class194_Sub13.method15512((Class598.method9852(Class238.method4310(is, (byte) -35), '\r', "", 704605438)), '\n', (byte) -13));
					Class61.method1420(strings, -2060876718);
				}
				if (string.equalsIgnoreCase("togglesnow")) {
					Class95.aBool1174 = !Class95.aBool1174;
					Class485.method7932("Success", (byte) -124);
					return;
				}
				if (9 == client.anInt11136 * -2020118759 || -2020118759 * client.anInt11136 == 0) {
					RSStream class116 = Class537.method8941(-2032440421);
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.COMMANDS_PACKET, class116.aClass11_1413, 1370050649);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(string.length() + 3, -862421288);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(bool ? 1 : 0, -2047077335);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeByte(bool_7_ ? 1 : 0, -309702263);
					class523_sub22.aClass523_Sub34_Sub2_10525.method16270(string, (byte) 32);
					class116.method1974(class523_sub22, (byte) 119);
				}
			} catch (Exception exception) {
				Class485.method7932((Class39.aClass39_437.method1124(Class53_Sub20.aClass668_10979, (byte) -120)), (byte) -9);
				return;
			}
		}
		if (9 != client.anInt11136 * -2020118759 && 0 != client.anInt11136 * -2020118759)
			Class485.method7932(new StringBuilder().append(Class39.aClass39_502.method1124(Class53_Sub20.aClass668_10979, (byte) -94)).append(string).toString(), (byte) -126);
	}

	static final void method4747(int i) {
		Class663.anInt8523 -= -705410749;
	}

	static final void method4748(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class193.method3641(class250, class242, class669, 796744307);
	}
}
