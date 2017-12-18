/* Class523_Sub41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;

import jaclib.hardware_info.HardwareInfo;

public class Class523_Sub41 extends Class523 {
	static final int anInt10707 = 5;
	static final int anInt10708 = 1;
	static final int anInt10709 = 3;
	static final int anInt10710 = 5;
	static final int anInt10711 = 4;
	int anInt10712;
	boolean aBool10713;
	static final int anInt10714 = 2;
	String aString10715;
	static final int anInt10716 = 3;
	String aString10717;
	static final int anInt10718 = 2;
	static final int anInt10719 = 6;
	static final int anInt10720 = 7;
	int anInt10721;
	static final int anInt10722 = 9;
	boolean aBool10723;
	static final int anInt10724 = 11;
	static final int anInt10725 = 20;
	static final int anInt10726 = 21;
	static final int anInt10727 = 22;
	static final int anInt10728 = 23;
	static final int anInt10729 = 24;
	static final int anInt10730 = 1;
	static final int anInt10731 = 26;
	int anInt10732;
	int anInt10733;
	static final int anInt10734 = 1;
	static final int anInt10735 = 2;
	static final int anInt10736 = 27;
	static final int anInt10737 = 25;
	static final int anInt10738 = 4;
	int anInt10739;
	int anInt10740;
	static final int anInt10741 = 4;
	int anInt10742;
	static final int anInt10743 = 8;
	int anInt10744;
	static final int anInt10745 = 0;
	int anInt10746;
	public static final int anInt10747 = 0;
	int anInt10748;
	int anInt10749;
	String aString10750;
	String aString10751;
	static final int anInt10752 = 10;
	static final int anInt10753 = 3;
	static final int anInt10754 = 7;
	int anInt10755;
	int anInt10756;
	String aString10757;
	public int anInt10758;
	String aString10759;
	int[] anIntArray10760 = new int[3];
	int anInt10761;
	String aString10762;

	void method16564(byte i) {
		if (aString10750.length() > 40)
			aString10750 = aString10750.substring(0, 40);
		if (aString10751.length() > 40)
			aString10751 = aString10751.substring(0, 40);
		if (aString10757.length() > 10)
			aString10757 = aString10757.substring(0, 10);
		if (aString10715.length() > 10)
			aString10715 = aString10715.substring(0, 10);
		if (aString10762.length() > 120)
			aString10762 = aString10762.substring(0, 120);
	}

	public Class523_Sub41(boolean bool) {
		if (bool) {
			if (Class611.aString8013.startsWith("win"))
				anInt10712 = -1756639023;
			else if (Class611.aString8013.startsWith("mac"))
				anInt10712 = 781689250;
			else if (Class611.aString8013.startsWith("linux"))
				anInt10712 = -974949773;
			else
				anInt10712 = 1563378500;
			if (Class319.aString3435.startsWith("amd64") || Class319.aString3435.startsWith("x86_64"))
				aBool10713 = true;
			else
				aBool10713 = false;
			if (-567375823 * anInt10712 == 1) {
				if (Class506.aString5664.indexOf("4.0") != -1)
					anInt10733 = 369617789;
				else if (Class506.aString5664.indexOf("4.1") != -1)
					anInt10733 = 739235578;
				else if (Class506.aString5664.indexOf("4.9") != -1)
					anInt10733 = 1108853367;
				else if (Class506.aString5664.indexOf("5.0") != -1)
					anInt10733 = 1478471156;
				else if (Class506.aString5664.indexOf("5.1") != -1)
					anInt10733 = 1848088945;
				else if (Class506.aString5664.indexOf("5.2") != -1)
					anInt10733 = -1338024984;
				else if (Class506.aString5664.indexOf("6.0") != -1)
					anInt10733 = -2077260562;
				else if (Class506.aString5664.indexOf("6.1") != -1)
					anInt10733 = -1707642773;
				else if (Class506.aString5664.indexOf("6.2") != -1)
					anInt10733 = -968407195;
				else if (Class506.aString5664.indexOf("6.3") != -1)
					anInt10733 = -598789406;
				else if (Class506.aString5664.indexOf("10.0") != -1)
					anInt10733 = -229171617;
			} else if (anInt10712 * -567375823 == 2) {
				if (Class506.aString5664.indexOf("10.4") != -1)
					anInt10733 = -1197578812;
				else if (Class506.aString5664.indexOf("10.5") != -1)
					anInt10733 = -827961023;
				else if (Class506.aString5664.indexOf("10.6") != -1)
					anInt10733 = -458343234;
				else if (Class506.aString5664.indexOf("10.7") != -1)
					anInt10733 = -88725445;
				else if (Class506.aString5664.indexOf("10.8") != -1)
					anInt10733 = 280892344;
				else if (Class506.aString5664.indexOf("10.9") != -1)
					anInt10733 = 650510133;
				else if (Class506.aString5664.indexOf("10.10") != -1)
					anInt10733 = 1020127922;
				else if (Class506.aString5664.indexOf("10.11") != -1)
					anInt10733 = 1389745711;
			}
			if (Class236.aString2394.toLowerCase().indexOf("sun") != -1)
				anInt10739 = -153634849;
			else if (Class236.aString2394.toLowerCase().indexOf("microsoft") != -1)
				anInt10739 = -307269698;
			else if (Class236.aString2394.toLowerCase().indexOf("apple") != -1)
				anInt10739 = -460904547;
			else if (Class236.aString2394.toLowerCase().indexOf("oracle") != -1)
				anInt10739 = -768174245;
			else
				anInt10739 = -614539396;
			int i = 2;
			int i_0_ = 0;
			try {
				for (/**/; i < Class472.aString5374.length(); i++) {
					int i_1_ = Class472.aString5374.charAt(i);
					if (i_1_ < 48 || i_1_ > 57)
						break;
					i_0_ = i_1_ - 48 + i_0_ * 10;
				}
			} catch (Exception exception) {
				/* empty */
			}
			anInt10740 = i_0_ * 1281712333;
			i = Class472.aString5374.indexOf('.', 2) + 1;
			i_0_ = 0;
			try {
				for (/**/; i < Class472.aString5374.length(); i++) {
					int i_2_ = Class472.aString5374.charAt(i);
					if (i_2_ < 48 || i_2_ > 57)
						break;
					i_0_ = i_0_ * 10 + (i_2_ - 48);
				}
			} catch (Exception exception) {
				/* empty */
			}
			anInt10761 = i_0_ * -1348750199;
			i = Class472.aString5374.indexOf('_', 4) + 1;
			i_0_ = 0;
			try {
				for (/**/; i < Class472.aString5374.length(); i++) {
					int i_3_ = Class472.aString5374.charAt(i);
					if (i_3_ < 48 || i_3_ > 57)
						break;
					i_0_ = 10 * i_0_ + (i_3_ - 48);
				}
			} catch (Exception exception) {
				/* empty */
			}
			anInt10748 = 1952208283 * i_0_;
			aBool10723 = false;
			anInt10744 = 13833235 * Class506.anInt5695;
			if (-781612027 * anInt10740 > 3)
				anInt10746 = Class506.anInt5696 * 879354245;
			else
				anInt10746 = 0;
			try {
				int[] is = HardwareInfo.getCPUInfo();
				if (is != null && 3 == is.length) {
					anInt10756 = is[0] * -1312826093;
					anInt10749 = is[1] * 1065029341;
					anInt10758 = 1171685459 * is[2];
				}
				int[] is_4_ = HardwareInfo.getRawCPUInfo();
				if (null != is_4_ && 0 == is_4_.length % 5) {
					HashMap hashmap = new HashMap();
					for (int i_5_ = 0; i_5_ < is_4_.length / 5; i_5_++) {
						int i_6_ = is_4_[5 * i_5_];
						int i_7_ = is_4_[i_5_ * 5 + 1];
						int i_8_ = is_4_[5 * i_5_ + 2];
						int i_9_ = is_4_[3 + i_5_ * 5];
						int i_10_ = is_4_[5 * i_5_ + 4];
						Class56 class56 = new Class56(i_6_, i_7_, i_8_, i_9_, i_10_);
						hashmap.put(Integer.valueOf(i_6_), class56);
					}
					Class56 class56 = (Class56) hashmap.get(Integer.valueOf(0));
					if (null != class56) {
						RSBuffer class523_sub34 = new RSBuffer(13);
						class523_sub34.method16265(class56.anInt742 * 98560099, (short) 19661);
						class523_sub34.method16265((class56.anInt741 * -1007804377), (short) 23588);
						class523_sub34.method16265((-548859457 * class56.anInt738), (short) 7435);
						class523_sub34.offset = 0;
						aString10717 = class523_sub34.readString(-898864097);
					}
					Class56 class56_11_ = (Class56) hashmap.get(Integer.valueOf(1));
					if (class56_11_ != null) {
						anInt10742 = -467868123 * class56_11_.anInt739;
						int i_12_ = class56_11_.anInt742 * 98560099;
						anInt10732 = (i_12_ >> 16 & 0xff) * 585710505;
						anIntArray10760[0] = class56_11_.anInt738 * -548859457;
						anIntArray10760[1] = -1007804377 * class56_11_.anInt741;
					}
					Class56 class56_13_ = (Class56) hashmap.get(Integer.valueOf(-2147483647));
					if (null != class56_13_)
						anIntArray10760[2] = class56_13_.anInt741 * -1007804377;
					RSBuffer class523_sub34 = new RSBuffer(49);
					for (int i_14_ = -2147483646; i_14_ <= -2147483644; i_14_++) {
						Class56 class56_15_ = (Class56) hashmap.get(Integer.valueOf(i_14_));
						if (class56_15_ != null) {
							class523_sub34.method16265((-143806447 * (class56_15_.anInt739)), (short) 9026);
							class523_sub34.method16265((class56_15_.anInt742 * 98560099), (short) 21403);
							class523_sub34.method16265((class56_15_.anInt738 * -548859457), (short) 30502);
							class523_sub34.method16265((-1007804377 * (class56_15_.anInt741)), (short) 4173);
						}
					}
					class523_sub34.offset = 0;
					aString10759 = class523_sub34.readString(-856952826);
				}
				String[][] strings = HardwareInfo.getDXDiagDisplayDevicesProps();
				if (null != strings && strings.length > 0 && strings[0] != null) {
					for (int i_16_ = 0; i_16_ < strings[0].length; i_16_ += 2) {
						if (strings[0][i_16_].equalsIgnoreCase("szDescription"))
							aString10750 = strings[0][i_16_ + 1];
						else if (strings[0][i_16_].equalsIgnoreCase("szDriverDateEnglish")) {
							String string = strings[0][i_16_ + 1];
							try {
								int i_17_ = string.indexOf("/");
								int i_18_ = string.indexOf("/", i_17_ + 1);
								anInt10755 = ((Integer.parseInt(string.substring(0, i_17_))) * 1847917767);
								anInt10721 = ((Integer.parseInt(string.substring(1 + i_18_, string.indexOf(" ", i_18_)))) * 486408027);
							} catch (Exception exception) {
								/* empty */
							}
						}
					}
				}
				String[] strings_19_ = HardwareInfo.getDXDiagSystemProps();
				if (null != strings_19_) {
					String string = "";
					String string_20_ = "";
					String string_21_ = "";
					for (int i_22_ = 0; i_22_ < strings_19_.length; i_22_ += 2) {
						if (strings_19_[i_22_].equalsIgnoreCase("dwDirectXVersionMajor"))
							string = strings_19_[i_22_ + 1];
						else if (strings_19_[i_22_].equalsIgnoreCase("dwDirectXVersionMinor"))
							string_20_ = strings_19_[i_22_ + 1];
						else if (strings_19_[i_22_].equalsIgnoreCase("dwDirectXVersionLetter"))
							string_21_ = strings_19_[1 + i_22_];
					}
					aString10757 = new StringBuilder().append(string).append(".").append(string_20_).append(string_21_).toString();
				}
			} catch (Throwable throwable) {
				anInt10758 = 0;
			}
		}
		if (aString10750 == null)
			aString10750 = "";
		if (null == aString10751)
			aString10751 = "";
		if (aString10757 == null)
			aString10757 = "";
		if (null == aString10715)
			aString10715 = "";
		if (aString10717 == null)
			aString10717 = "";
		if (null == aString10759)
			aString10759 = "";
		if (null == aString10762)
			aString10762 = "";
		method16564((byte) 76);
	}

	public void method16565(RSBuffer class523_sub34, int i) {
		class523_sub34.writeByte(7, -1029510969);
		class523_sub34.writeByte(anInt10712 * -567375823, -2026437645);
		class523_sub34.writeByte(aBool10713 ? 1 : 0, 637572364);
		class523_sub34.writeByte(-1377819179 * anInt10733, 1275057139);
		class523_sub34.writeByte(anInt10739 * 1478935583, 2042381982);
		class523_sub34.writeByte(-781612027 * anInt10740, -1887489474);
		class523_sub34.writeByte(-250216007 * anInt10761, -341332301);
		class523_sub34.writeByte(1086982291 * anInt10748, 525922264);
		class523_sub34.writeByte(aBool10723 ? 1 : 0, 1505988955);
		class523_sub34.writeShort(1688554451 * anInt10744, (byte) -21);
		class523_sub34.writeByte(-946145655 * anInt10746, -2003037505);
		class523_sub34.writeMedium(anInt10758 * -1222917157, (byte) 0);
		class523_sub34.writeShort(1569667445 * anInt10749, (byte) -104);
		class523_sub34.method16266(aString10750, 938978683);
		class523_sub34.method16266(aString10751, 1921199855);
		class523_sub34.method16266(aString10757, 1259286842);
		class523_sub34.method16266(aString10715, 1771884348);
		class523_sub34.writeByte(anInt10755 * 2008745207, -377783792);
		class523_sub34.writeShort(-1543366445 * anInt10721, (byte) -100);
		class523_sub34.method16266(aString10717, -267983608);
		class523_sub34.method16266(aString10759, 712623408);
		class523_sub34.writeByte(1168012571 * anInt10756, 1783465226);
		class523_sub34.writeByte(anInt10732 * -753428327, 861808962);
		for (int i_23_ = 0; i_23_ < anIntArray10760.length; i_23_++)
			class523_sub34.writeInt(anIntArray10760[i_23_], -654345354);
		class523_sub34.writeInt(1518538877 * anInt10742, -894178168);
		class523_sub34.method16266(aString10762, -1405906098);
	}

	public void method16566(RSBuffer class523_sub34) {
		class523_sub34.writeByte(7, 1464137907);
		class523_sub34.writeByte(anInt10712 * -567375823, 378406282);
		class523_sub34.writeByte(aBool10713 ? 1 : 0, 219976734);
		class523_sub34.writeByte(-1377819179 * anInt10733, -693678712);
		class523_sub34.writeByte(anInt10739 * 1478935583, 874663578);
		class523_sub34.writeByte(-781612027 * anInt10740, 156325391);
		class523_sub34.writeByte(-250216007 * anInt10761, -394612671);
		class523_sub34.writeByte(1086982291 * anInt10748, 309265931);
		class523_sub34.writeByte(aBool10723 ? 1 : 0, -71189158);
		class523_sub34.writeShort(1688554451 * anInt10744, (byte) -54);
		class523_sub34.writeByte(-946145655 * anInt10746, -769733828);
		class523_sub34.writeMedium(anInt10758 * -1222917157, (byte) 0);
		class523_sub34.writeShort(1569667445 * anInt10749, (byte) -33);
		class523_sub34.method16266(aString10750, -1433324146);
		class523_sub34.method16266(aString10751, -1017756857);
		class523_sub34.method16266(aString10757, -258995258);
		class523_sub34.method16266(aString10715, 2053601910);
		class523_sub34.writeByte(anInt10755 * 2008745207, 161607648);
		class523_sub34.writeShort(-1543366445 * anInt10721, (byte) -29);
		class523_sub34.method16266(aString10717, 1826883713);
		class523_sub34.method16266(aString10759, 1803250104);
		class523_sub34.writeByte(1168012571 * anInt10756, -765028798);
		class523_sub34.writeByte(anInt10732 * -753428327, -1321780710);
		for (int i = 0; i < anIntArray10760.length; i++)
			class523_sub34.writeInt(anIntArray10760[i], -1152774884);
		class523_sub34.writeInt(1518538877 * anInt10742, -694282576);
		class523_sub34.method16266(aString10762, -1623387361);
	}

	void method16567() {
		if (aString10750.length() > 40)
			aString10750 = aString10750.substring(0, 40);
		if (aString10751.length() > 40)
			aString10751 = aString10751.substring(0, 40);
		if (aString10757.length() > 10)
			aString10757 = aString10757.substring(0, 10);
		if (aString10715.length() > 10)
			aString10715 = aString10715.substring(0, 10);
		if (aString10762.length() > 120)
			aString10762 = aString10762.substring(0, 120);
	}

	void method16568() {
		if (aString10750.length() > 40)
			aString10750 = aString10750.substring(0, 40);
		if (aString10751.length() > 40)
			aString10751 = aString10751.substring(0, 40);
		if (aString10757.length() > 10)
			aString10757 = aString10757.substring(0, 10);
		if (aString10715.length() > 10)
			aString10715 = aString10715.substring(0, 10);
		if (aString10762.length() > 120)
			aString10762 = aString10762.substring(0, 120);
	}

	public void method16569(RSBuffer class523_sub34) {
		class523_sub34.writeByte(7, -296442645);
		class523_sub34.writeByte(anInt10712 * -567375823, 1606765290);
		class523_sub34.writeByte(aBool10713 ? 1 : 0, -848902713);
		class523_sub34.writeByte(-1377819179 * anInt10733, -1686632929);
		class523_sub34.writeByte(anInt10739 * 1478935583, -1789939131);
		class523_sub34.writeByte(-781612027 * anInt10740, -964889188);
		class523_sub34.writeByte(-250216007 * anInt10761, 113655643);
		class523_sub34.writeByte(1086982291 * anInt10748, -1542907562);
		class523_sub34.writeByte(aBool10723 ? 1 : 0, -371392413);
		class523_sub34.writeShort(1688554451 * anInt10744, (byte) -25);
		class523_sub34.writeByte(-946145655 * anInt10746, 700600588);
		class523_sub34.writeMedium(anInt10758 * -1222917157, (byte) 0);
		class523_sub34.writeShort(1569667445 * anInt10749, (byte) -78);
		class523_sub34.method16266(aString10750, -501688222);
		class523_sub34.method16266(aString10751, 1746182869);
		class523_sub34.method16266(aString10757, 2142508304);
		class523_sub34.method16266(aString10715, 1288345676);
		class523_sub34.writeByte(anInt10755 * 2008745207, 1594895395);
		class523_sub34.writeShort(-1543366445 * anInt10721, (byte) -40);
		class523_sub34.method16266(aString10717, 1377536664);
		class523_sub34.method16266(aString10759, -942092375);
		class523_sub34.writeByte(1168012571 * anInt10756, 1868885973);
		class523_sub34.writeByte(anInt10732 * -753428327, 938656488);
		for (int i = 0; i < anIntArray10760.length; i++)
			class523_sub34.writeInt(anIntArray10760[i], -653125815);
		class523_sub34.writeInt(1518538877 * anInt10742, -763297447);
		class523_sub34.method16266(aString10762, 1101148395);
	}

	public int method16570(int i) {
		int i_24_ = 38;
		i_24_ += Class57.method1388(aString10750, 1399579027);
		i_24_ += Class57.method1388(aString10751, 1399579027);
		i_24_ += Class57.method1388(aString10757, 1399579027);
		i_24_ += Class57.method1388(aString10715, 1399579027);
		i_24_ += Class57.method1388(aString10717, 1399579027);
		i_24_ += Class57.method1388(aString10759, 1399579027);
		i_24_ += Class57.method1388(aString10762, 1399579027);
		return i_24_;
	}

	public int method16571() {
		int i = 38;
		i += Class57.method1388(aString10750, 1399579027);
		i += Class57.method1388(aString10751, 1399579027);
		i += Class57.method1388(aString10757, 1399579027);
		i += Class57.method1388(aString10715, 1399579027);
		i += Class57.method1388(aString10717, 1399579027);
		i += Class57.method1388(aString10759, 1399579027);
		i += Class57.method1388(aString10762, 1399579027);
		return i;
	}

	public int method16572() {
		int i = 38;
		i += Class57.method1388(aString10750, 1399579027);
		i += Class57.method1388(aString10751, 1399579027);
		i += Class57.method1388(aString10757, 1399579027);
		i += Class57.method1388(aString10715, 1399579027);
		i += Class57.method1388(aString10717, 1399579027);
		i += Class57.method1388(aString10759, 1399579027);
		i += Class57.method1388(aString10762, 1399579027);
		return i;
	}

	public int method16573() {
		int i = 38;
		i += Class57.method1388(aString10750, 1399579027);
		i += Class57.method1388(aString10751, 1399579027);
		i += Class57.method1388(aString10757, 1399579027);
		i += Class57.method1388(aString10715, 1399579027);
		i += Class57.method1388(aString10717, 1399579027);
		i += Class57.method1388(aString10759, 1399579027);
		i += Class57.method1388(aString10762, 1399579027);
		return i;
	}

	static void method16574(Class178 class178, int i, int i_25_, int i_26_, int i_27_, int i_28_) {
		class178.method3378(i, i_25_, i_26_ + i, i_27_ + i_25_);
		if (-1547856073 * Class534_Sub1.anInt10795 < 100) {
			int i_29_ = 20;
			int i_30_ = i_26_ / 2 + i;
			int i_31_ = i_27_ / 2 + i_25_ - 18 - i_29_;
			class178.method3193(i, i_25_, i_26_, i_27_, -16777216, 0);
			class178.method3083(i_30_ - 152, i_31_, 304, 34, client.aColorArray11128[1871015145 * client.anInt11188].getRGB(), 0);
			class178.method3193(i_30_ - 150, i_31_ + 2, -348600923 * Class534_Sub1.anInt10795, 30, client.aColorArray11035[client.anInt11188 * 1871015145].getRGB(), 0);
			Class34.aClass164_319.method2624(Class39.aClass39_513.method1124(Class53_Sub20.aClass668_10979, (byte) -106), i_30_, i_29_ + i_31_, client.aColorArray11037[client.anInt11188 * 1871015145].getRGB(), -1, 1539440313);
		} else {
			int i_32_ = (Class575.anInt7691 * 158908775 - (int) ((float) i_26_ / Class534_Sub1.aFloat7154));
			int i_33_ = (-217599855 * Class597.anInt7835 + (int) ((float) i_27_ / Class534_Sub1.aFloat7154));
			int i_34_ = (158908775 * Class575.anInt7691 + (int) ((float) i_26_ / Class534_Sub1.aFloat7154));
			int i_35_ = (-217599855 * Class597.anInt7835 - (int) ((float) i_27_ / Class534_Sub1.aFloat7154));
			Class333_Sub2.anInt10000 = ((158908775 * Class575.anInt7691 - (int) ((float) i_26_ / Class534_Sub1.aFloat7154)) * 5449309);
			Class322_Sub1.anInt10068 = -1544714241 * (Class597.anInt7835 * -217599855 - (int) ((float) i_27_ / Class534_Sub1.aFloat7154));
			Class686.anInt8669 = 1270838601 * (int) ((float) (2 * i_26_) / Class534_Sub1.aFloat7154);
			Class239.anInt2446 = 1827129815 * (int) ((float) (2 * i_27_) / Class534_Sub1.aFloat7154);
			Class534_Sub1.aClass209_7184 = Class534_Sub1.aClass209_7136;
			Class534_Sub1.method8823(i_32_ + Class534_Sub1.anInt7168, i_33_ + Class534_Sub1.anInt7159, i_34_ + Class534_Sub1.anInt7168, Class534_Sub1.anInt7159 + i_35_, i, i_25_, i_26_ + i, i_27_ + i_25_ + 1);
			Class534_Sub1.method8824(class178, !Class534_Sub1.aBool10773, !Class534_Sub1.aBool10799, client.aBool11157, false);
			Class708 class708 = Class534_Sub1.method8830(class178);
			Class688.method13934(class178, class708, 0, 0, (byte) -35);
			if (client.aBool11096) {
				int i_36_ = i + i_26_ - 5;
				int i_37_ = i_25_ + i_27_ - 8;
				Class10.aClass164_83.method2596(new StringBuilder().append("Fps: ").append(Class506.anInt5662 * -1307622225).append(" (").append(Class506.anInt5663 * 760293275).append(" ms)").toString(), i_36_, i_37_, 16776960, -1, -945878298);
				i_37_ -= 15;
				Runtime runtime = Runtime.getRuntime();
				int i_38_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				int i_39_ = 16776960;
				if (i_38_ > 65536)
					i_39_ = 16711680;
				Class10.aClass164_83.method2596(new StringBuilder().append("Mem:").append(i_38_).append("k").toString(), i_36_, i_37_, i_39_, -1, 542366837);
				i_37_ -= 15;
			}
			Class534_Sub1.aClass209_7136.method3772(5, (byte) -90);
		}
	}
}
