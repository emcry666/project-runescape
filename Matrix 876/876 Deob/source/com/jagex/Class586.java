/* Class586 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;

public class Class586 implements Interface13 {
	public int anInt7715;
	Class571 aClass571_7716;
	int anInt7717;
	public static final int anInt7718 = 0;
	public int anInt7719;
	static final int anInt7720 = 70;
	public static final int anInt7721 = 1;
	public boolean aBool7722 = false;
	public int anInt7723 = -1430542381;
	int anInt7724;
	public int anInt7725;
	int anInt7726;
	Interface12 anInterface12_7727;
	int anInt7728;
	int anInt7729;
	public int anInt7730;
	public static final int anInt7731 = -1;
	public int anInt7732;
	String aString7733;
	public int anInt7734;
	public int anInt7735;
	static final int anInt7736 = 16777215;
	public int anInt7737;
	public int[] anIntArray7738;
	int anInt7739;
	int anInt7740;
	public int anInt7741;
	int anInt7742;

	public final Class586 method9693(Interface19 interface19, Interface17 interface17, int i) {
		int i_0_ = -1;
		if (null == anIntArray7738)
			return this;
		if (null == interface19 || interface17 == null)
			return null;
		if (-1 != anInt7739 * 1968643165) {
			VarBitDefinitions class309 = interface19.method106(1968643165 * anInt7739, -1577931439);
			if (class309 != null)
				i_0_ = interface17.method93(class309, 568995143);
		} else if (-1092754317 * anInt7740 != -1) {
			Class159 class159 = interface19.method110(VarDomainType.PLAYER_CONFIGS, anInt7740 * -1092754317, 1906673971);
			if (class159 != null)
				i_0_ = interface17.method94(class159, -1452610376);
		}
		if (i_0_ < 0 || i_0_ >= anIntArray7738.length - 1) {
			int i_1_ = anIntArray7738[anIntArray7738.length - 1];
			if (-1 != i_1_)
				return (Class586) anInterface12_7727.getDefinition(i_1_, (byte) 12);
			return null;
		}
		if (-1 == anIntArray7738[i_0_])
			return null;
		return ((Class586) anInterface12_7727.getDefinition(anIntArray7738[i_0_], (byte) 19));
	}

	public void readValues(RSBuffer class523_sub34, int i) {
		for (;;) {
			int i_2_ = class523_sub34.readUnsignedByte(1544388339);
			if (0 == i_2_)
				break;
			method9694(class523_sub34, i_2_, (byte) 0);
		}
	}

	void method9694(RSBuffer class523_sub34, int i, byte i_3_) {
		if (i == 1)
			anInt7723 = class523_sub34.readBigSmart((byte) -26) * 1430542381;
		else if (2 == i) {
			anInt7719 = class523_sub34.read24BitInt(1452740637) * 101437673;
			aBool7722 = true;
		} else if (3 == i)
			anInt7726 = class523_sub34.readBigSmart((byte) 0) * 1865736029;
		else if (4 == i)
			anInt7728 = class523_sub34.readBigSmart((byte) -52) * -1031213323;
		else if (5 == i)
			anInt7724 = class523_sub34.readBigSmart((byte) -109) * -675487749;
		else if (i == 6)
			anInt7729 = class523_sub34.readBigSmart((byte) -85) * -1967028277;
		else if (i == 7)
			anInt7730 = class523_sub34.readShort(-562089023) * -1156059769;
		else if (8 == i)
			aString7733 = class523_sub34.readVersionedString(1999450265);
		else if (9 == i)
			anInt7725 = class523_sub34.readUnsignedShort(-191413712) * -1254524845;
		else if (i == 10)
			anInt7715 = class523_sub34.readShort(588795374) * -1024991437;
		else if (11 == i)
			anInt7732 = 0;
		else if (12 == i)
			anInt7741 = class523_sub34.readUnsignedByte(533092779) * -2109340427;
		else if (i == 13)
			anInt7735 = class523_sub34.readShort(948560605) * 115559039;
		else if (i == 14)
			anInt7732 = class523_sub34.readUnsignedShort(-108690646) * -514622157;
		else if (16 == i) {
			anInt7734 = class523_sub34.readShort(933624630) * -1956871195;
			anInt7737 = class523_sub34.readShort(1880695884) * -706338625;
		} else if (17 == i || 18 == i) {
			anInt7739 = class523_sub34.readUnsignedShort(-1758693987) * -1558997003;
			if (65535 == anInt7739 * 1968643165)
				anInt7739 = 1558997003;
			anInt7740 = class523_sub34.readUnsignedShort(-995043899) * 2013618363;
			if (65535 == anInt7740 * -1092754317)
				anInt7740 = -2013618363;
			int i_4_ = -1;
			if (i == 18) {
				i_4_ = class523_sub34.readUnsignedShort(-1689933864);
				if (65535 == i_4_)
					i_4_ = -1;
			}
			int i_5_ = class523_sub34.readUnsignedByte(900251338);
			anIntArray7738 = new int[i_5_ + 2];
			for (int i_6_ = 0; i_6_ <= i_5_; i_6_++) {
				anIntArray7738[i_6_] = class523_sub34.readUnsignedShort(-438072079);
				if (65535 == anIntArray7738[i_6_])
					anIntArray7738[i_6_] = -1;
			}
			anIntArray7738[1 + i_5_] = i_4_;
		} else if (19 == i)
			anInt7742 = class523_sub34.readUnsignedShort(-320417681) * -1478934677;
		else if (20 == i)
			anInt7717 = class523_sub34.readUnsignedShort(-569170024) * -2013872751;
	}

	public Class148 method9695(Class178 class178) {
		if (anInt7724 * -1854713037 < 0)
			return null;
		Class148 class148 = ((Class148) aClass571_7716.aClass209_7660.method3767((long) (-1854713037 * anInt7724)));
		if (null == class148) {
			method9701(class178, (byte) -14);
			class148 = (Class148) aClass571_7716.aClass209_7660.method3767((long) (-1854713037 * anInt7724));
		}
		return class148;
	}

	public String method9696(int i, int i_7_) {
		String string = aString7733;
		i = i * (anInt7742 * -1525025469) / (-2051824783 * anInt7717);
		for (;;) {
			int i_8_ = string.indexOf("%1");
			if (i_8_ < 0)
				break;
			string = new StringBuilder().append(string.substring(0, i_8_)).append(Class427.method6752(i, false, -921472496)).append(string.substring(2 + i_8_)).toString();
		}
		return string;
	}

	public Class148 method9697(Class178 class178, byte i) {
		if (anInt7726 * 1629973749 < 0)
			return null;
		Class148 class148 = (Class148) aClass571_7716.aClass209_7660.method3767((long) (anInt7726 * 1629973749));
		if (null == class148) {
			method9701(class178, (byte) -34);
			class148 = (Class148) aClass571_7716.aClass209_7660.method3767((long) (1629973749 * anInt7726));
		}
		return class148;
	}

	public Class148 method9698(Class178 class178, int i) {
		if (anInt7724 * -1854713037 < 0)
			return null;
		Class148 class148 = ((Class148) aClass571_7716.aClass209_7660.method3767((long) (-1854713037 * anInt7724)));
		if (null == class148) {
			method9701(class178, (byte) -99);
			class148 = (Class148) aClass571_7716.aClass209_7660.method3767((long) (-1854713037 * anInt7724));
		}
		return class148;
	}

	public Class148 method9699(Class178 class178, int i) {
		if (anInt7728 * -890516131 < 0)
			return null;
		Class148 class148 = (Class148) aClass571_7716.aClass209_7660.method3767((long) (anInt7728 * -890516131));
		if (class148 == null) {
			method9701(class178, (byte) -15);
			class148 = (Class148) aClass571_7716.aClass209_7660.method3767((long) (-890516131 * anInt7728));
		}
		return class148;
	}

	public Class148 method9700(Class178 class178, int i) {
		if (-1840978461 * anInt7729 < 0)
			return null;
		Class148 class148 = ((Class148) aClass571_7716.aClass209_7660.method3767((long) (-1840978461 * anInt7729)));
		if (null == class148) {
			method9701(class178, (byte) -6);
			class148 = (Class148) aClass571_7716.aClass209_7660.method3767((long) (-1840978461 * anInt7729));
		}
		return class148;
	}

	void method9701(Class178 class178, byte i) {
		Class472 class472 = aClass571_7716.aClass472_7659;
		if (1629973749 * anInt7726 >= 0 && (aClass571_7716.aClass209_7660.method3767((long) (anInt7726 * 1629973749)) == null) && class472.method7650(anInt7726 * 1629973749, -772265139)) {
			Class175 class175 = Class166.method2659(class472, 1629973749 * anInt7726);
			aClass571_7716.aClass209_7660.method3770(class178.method3104(class175, true), (long) (anInt7726 * 1629973749));
		}
		if (-1854713037 * anInt7724 >= 0 && aClass571_7716.aClass209_7660.method3767((long) (anInt7724 * -1854713037)) == null && class472.method7650(-1854713037 * anInt7724, -1540085364)) {
			Class175 class175 = Class166.method2659(class472, -1854713037 * anInt7724);
			aClass571_7716.aClass209_7660.method3770(class178.method3104(class175, true), (long) (-1854713037 * anInt7724));
		}
		if (anInt7728 * -890516131 >= 0 && (aClass571_7716.aClass209_7660.method3767((long) (-890516131 * anInt7728)) == null) && class472.method7650(anInt7728 * -890516131, -1743415654)) {
			Class175 class175 = Class166.method2659(class472, -890516131 * anInt7728);
			aClass571_7716.aClass209_7660.method3770(class178.method3104(class175, true), (long) (-890516131 * anInt7728));
		}
		if (anInt7729 * -1840978461 >= 0 && aClass571_7716.aClass209_7660.method3767((long) (anInt7729 * -1840978461)) == null && class472.method7650(anInt7729 * -1840978461, 607351948)) {
			Class175 class175 = Class166.method2659(class472, anInt7729 * -1840978461);
			aClass571_7716.aClass209_7660.method3770(class178.method3104(class175, true), (long) (-1840978461 * anInt7729));
		}
	}

	public void method74(byte i) {
		/* empty */
	}

	public void method77() {
		/* empty */
	}

	public void readValues(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(1015724257);
			if (0 == i)
				break;
			method9694(class523_sub34, i, (byte) 0);
		}
	}

	void method9702(Class178 class178) {
		Class472 class472 = aClass571_7716.aClass472_7659;
		if (1629973749 * anInt7726 >= 0 && (aClass571_7716.aClass209_7660.method3767((long) (anInt7726 * 1629973749)) == null) && class472.method7650(anInt7726 * 1629973749, 1024077545)) {
			Class175 class175 = Class166.method2659(class472, 1629973749 * anInt7726);
			aClass571_7716.aClass209_7660.method3770(class178.method3104(class175, true), (long) (anInt7726 * 1629973749));
		}
		if (-1854713037 * anInt7724 >= 0 && aClass571_7716.aClass209_7660.method3767((long) (anInt7724 * -1854713037)) == null && class472.method7650(-1854713037 * anInt7724, 292790136)) {
			Class175 class175 = Class166.method2659(class472, -1854713037 * anInt7724);
			aClass571_7716.aClass209_7660.method3770(class178.method3104(class175, true), (long) (-1854713037 * anInt7724));
		}
		if (anInt7728 * -890516131 >= 0 && (aClass571_7716.aClass209_7660.method3767((long) (-890516131 * anInt7728)) == null) && class472.method7650(anInt7728 * -890516131, 1317905097)) {
			Class175 class175 = Class166.method2659(class472, -890516131 * anInt7728);
			aClass571_7716.aClass209_7660.method3770(class178.method3104(class175, true), (long) (-890516131 * anInt7728));
		}
		if (anInt7729 * -1840978461 >= 0 && aClass571_7716.aClass209_7660.method3767((long) (anInt7729 * -1840978461)) == null && class472.method7650(anInt7729 * -1840978461, 342302859)) {
			Class175 class175 = Class166.method2659(class472, anInt7729 * -1840978461);
			aClass571_7716.aClass209_7660.method3770(class178.method3104(class175, true), (long) (-1840978461 * anInt7729));
		}
	}

	public void method63(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-1220919559);
			if (0 == i)
				break;
			method9694(class523_sub34, i, (byte) 0);
		}
	}

	public Class148 method9703(Class178 class178) {
		if (anInt7728 * -890516131 < 0)
			return null;
		Class148 class148 = (Class148) aClass571_7716.aClass209_7660.method3767((long) (anInt7728 * -890516131));
		if (class148 == null) {
			method9701(class178, (byte) -58);
			class148 = (Class148) aClass571_7716.aClass209_7660.method3767((long) (-890516131 * anInt7728));
		}
		return class148;
	}

	public void method58(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(986470382);
			if (0 == i)
				break;
			method9694(class523_sub34, i, (byte) 0);
		}
	}

	public void method78() {
		/* empty */
	}

	public void method79() {
		/* empty */
	}

	public String method9704(int i) {
		String string = aString7733;
		i = i * (anInt7742 * -1525025469) / (-2051824783 * anInt7717);
		for (;;) {
			int i_9_ = string.indexOf("%1");
			if (i_9_ < 0)
				break;
			string = new StringBuilder().append(string.substring(0, i_9_)).append(Class427.method6752(i, false, -68198998)).append(string.substring(2 + i_9_)).toString();
		}
		return string;
	}

	public void method73() {
		/* empty */
	}

	public void method76(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(1914565198);
			if (0 == i)
				break;
			method9694(class523_sub34, i, (byte) 0);
		}
	}

	public final Class586 method9705(Interface19 interface19, Interface17 interface17) {
		int i = -1;
		if (null == anIntArray7738)
			return this;
		if (null == interface19 || interface17 == null)
			return null;
		if (-1 != anInt7739 * 1968643165) {
			VarBitDefinitions class309 = interface19.method106(1968643165 * anInt7739, 775461380);
			if (class309 != null)
				i = interface17.method93(class309, -1288547456);
		} else if (-1092754317 * anInt7740 != -1) {
			Class159 class159 = interface19.method110(VarDomainType.PLAYER_CONFIGS, anInt7740 * -1092754317, 1769413266);
			if (class159 != null)
				i = interface17.method94(class159, 55569350);
		}
		if (i < 0 || i >= anIntArray7738.length - 1) {
			int i_10_ = anIntArray7738[anIntArray7738.length - 1];
			if (-1 != i_10_)
				return ((Class586) anInterface12_7727.getDefinition(i_10_, (byte) -22));
			return null;
		}
		if (-1 == anIntArray7738[i])
			return null;
		return ((Class586) anInterface12_7727.getDefinition(anIntArray7738[i], (byte) 87));
	}

	public final Class586 method9706(Interface19 interface19, Interface17 interface17) {
		int i = -1;
		if (null == anIntArray7738)
			return this;
		if (null == interface19 || interface17 == null)
			return null;
		if (-1 != anInt7739 * 1968643165) {
			VarBitDefinitions class309 = interface19.method106(1968643165 * anInt7739, 1108877823);
			if (class309 != null)
				i = interface17.method93(class309, 204764981);
		} else if (-1092754317 * anInt7740 != -1) {
			Class159 class159 = interface19.method110(VarDomainType.PLAYER_CONFIGS, anInt7740 * -1092754317, 1331086331);
			if (class159 != null)
				i = interface17.method94(class159, 1843547869);
		}
		if (i < 0 || i >= anIntArray7738.length - 1) {
			int i_11_ = anIntArray7738[anIntArray7738.length - 1];
			if (-1 != i_11_)
				return ((Class586) anInterface12_7727.getDefinition(i_11_, (byte) 42));
			return null;
		}
		if (-1 == anIntArray7738[i])
			return null;
		return ((Class586) anInterface12_7727.getDefinition(anIntArray7738[i], (byte) 0));
	}

	Class586(int i, Class571 class571, Interface12 interface12) {
		anInt7719 = -487313641;
		anInt7725 = -1917393230;
		anInt7726 = -1865736029;
		anInt7724 = 675487749;
		anInt7728 = 1031213323;
		anInt7729 = 1967028277;
		anInt7730 = 0;
		anInt7715 = 0;
		anInt7732 = 514622157;
		aString7733 = "";
		anInt7741 = 2109340427;
		anInt7735 = 0;
		anInt7734 = 0;
		anInt7737 = 0;
		anInt7739 = 1558997003;
		anInt7740 = -2013618363;
		anInt7742 = -1478934677;
		anInt7717 = -2013872751;
		aClass571_7716 = class571;
		anInterface12_7727 = interface12;
	}

	public Class148 method9707(Class178 class178) {
		if (anInt7724 * -1854713037 < 0)
			return null;
		Class148 class148 = ((Class148) aClass571_7716.aClass209_7660.method3767((long) (-1854713037 * anInt7724)));
		if (null == class148) {
			method9701(class178, (byte) -5);
			class148 = (Class148) aClass571_7716.aClass209_7660.method3767((long) (-1854713037 * anInt7724));
		}
		return class148;
	}

	void method9708(Class178 class178) {
		Class472 class472 = aClass571_7716.aClass472_7659;
		if (1629973749 * anInt7726 >= 0 && (aClass571_7716.aClass209_7660.method3767((long) (anInt7726 * 1629973749)) == null) && class472.method7650(anInt7726 * 1629973749, -455294060)) {
			Class175 class175 = Class166.method2659(class472, 1629973749 * anInt7726);
			aClass571_7716.aClass209_7660.method3770(class178.method3104(class175, true), (long) (anInt7726 * 1629973749));
		}
		if (-1854713037 * anInt7724 >= 0 && aClass571_7716.aClass209_7660.method3767((long) (anInt7724 * -1854713037)) == null && class472.method7650(-1854713037 * anInt7724, 1062217546)) {
			Class175 class175 = Class166.method2659(class472, -1854713037 * anInt7724);
			aClass571_7716.aClass209_7660.method3770(class178.method3104(class175, true), (long) (-1854713037 * anInt7724));
		}
		if (anInt7728 * -890516131 >= 0 && (aClass571_7716.aClass209_7660.method3767((long) (-890516131 * anInt7728)) == null) && class472.method7650(anInt7728 * -890516131, 672167008)) {
			Class175 class175 = Class166.method2659(class472, -890516131 * anInt7728);
			aClass571_7716.aClass209_7660.method3770(class178.method3104(class175, true), (long) (-890516131 * anInt7728));
		}
		if (anInt7729 * -1840978461 >= 0 && aClass571_7716.aClass209_7660.method3767((long) (anInt7729 * -1840978461)) == null && class472.method7650(anInt7729 * -1840978461, 889645515)) {
			Class175 class175 = Class166.method2659(class472, anInt7729 * -1840978461);
			aClass571_7716.aClass209_7660.method3770(class178.method3104(class175, true), (long) (-1840978461 * anInt7729));
		}
	}

	public Class148 method9709(Class178 class178) {
		if (anInt7728 * -890516131 < 0)
			return null;
		Class148 class148 = (Class148) aClass571_7716.aClass209_7660.method3767((long) (anInt7728 * -890516131));
		if (class148 == null) {
			method9701(class178, (byte) -92);
			class148 = (Class148) aClass571_7716.aClass209_7660.method3767((long) (-890516131 * anInt7728));
		}
		return class148;
	}

	public void method75(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(453301202);
			if (0 == i)
				break;
			method9694(class523_sub34, i, (byte) 0);
		}
	}

	void method9710(RSBuffer class523_sub34, int i) {
		if (i == 1)
			anInt7723 = class523_sub34.readBigSmart((byte) -58) * 1430542381;
		else if (2 == i) {
			anInt7719 = class523_sub34.read24BitInt(-1013368224) * 101437673;
			aBool7722 = true;
		} else if (3 == i)
			anInt7726 = class523_sub34.readBigSmart((byte) -7) * 1865736029;
		else if (4 == i)
			anInt7728 = class523_sub34.readBigSmart((byte) -78) * -1031213323;
		else if (5 == i)
			anInt7724 = class523_sub34.readBigSmart((byte) -46) * -675487749;
		else if (i == 6)
			anInt7729 = class523_sub34.readBigSmart((byte) -5) * -1967028277;
		else if (i == 7)
			anInt7730 = class523_sub34.readShort(-587293393) * -1156059769;
		else if (8 == i)
			aString7733 = class523_sub34.readVersionedString(2117776697);
		else if (9 == i)
			anInt7725 = class523_sub34.readUnsignedShort(-980690407) * -1254524845;
		else if (i == 10)
			anInt7715 = class523_sub34.readShort(1638395995) * -1024991437;
		else if (11 == i)
			anInt7732 = 0;
		else if (12 == i)
			anInt7741 = class523_sub34.readUnsignedByte(-412083641) * -2109340427;
		else if (i == 13)
			anInt7735 = class523_sub34.readShort(-1552538191) * 115559039;
		else if (i == 14)
			anInt7732 = class523_sub34.readUnsignedShort(-863002560) * -514622157;
		else if (16 == i) {
			anInt7734 = class523_sub34.readShort(-1336561847) * -1956871195;
			anInt7737 = class523_sub34.readShort(575013432) * -706338625;
		} else if (17 == i || 18 == i) {
			anInt7739 = class523_sub34.readUnsignedShort(-1042535592) * -1558997003;
			if (65535 == anInt7739 * 1968643165)
				anInt7739 = 1558997003;
			anInt7740 = class523_sub34.readUnsignedShort(-1535589484) * 2013618363;
			if (65535 == anInt7740 * -1092754317)
				anInt7740 = -2013618363;
			int i_12_ = -1;
			if (i == 18) {
				i_12_ = class523_sub34.readUnsignedShort(-1454270908);
				if (65535 == i_12_)
					i_12_ = -1;
			}
			int i_13_ = class523_sub34.readUnsignedByte(453807056);
			anIntArray7738 = new int[i_13_ + 2];
			for (int i_14_ = 0; i_14_ <= i_13_; i_14_++) {
				anIntArray7738[i_14_] = class523_sub34.readUnsignedShort(-429929294);
				if (65535 == anIntArray7738[i_14_])
					anIntArray7738[i_14_] = -1;
			}
			anIntArray7738[1 + i_13_] = i_12_;
		} else if (19 == i)
			anInt7742 = class523_sub34.readUnsignedShort(-1823307649) * -1478934677;
		else if (20 == i)
			anInt7717 = class523_sub34.readUnsignedShort(-722657709) * -2013872751;
	}

	public void method60(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-1263669385);
			if (0 == i)
				break;
			method9694(class523_sub34, i, (byte) 0);
		}
	}

	public Class148 method9711(Class178 class178) {
		if (-1840978461 * anInt7729 < 0)
			return null;
		Class148 class148 = ((Class148) aClass571_7716.aClass209_7660.method3767((long) (-1840978461 * anInt7729)));
		if (null == class148) {
			method9701(class178, (byte) -18);
			class148 = (Class148) aClass571_7716.aClass209_7660.method3767((long) (-1840978461 * anInt7729));
		}
		return class148;
	}

	public Class148 method9712(Class178 class178) {
		if (-1840978461 * anInt7729 < 0)
			return null;
		Class148 class148 = ((Class148) aClass571_7716.aClass209_7660.method3767((long) (-1840978461 * anInt7729)));
		if (null == class148) {
			method9701(class178, (byte) -16);
			class148 = (Class148) aClass571_7716.aClass209_7660.method3767((long) (-1840978461 * anInt7729));
		}
		return class148;
	}

	public static boolean method9713(int i, int i_15_, int i_16_) {
		if (Class655.aClass375_8420 == null || Class655.aClass375_8420.method6357((byte) 36) == null)
			return false;
		if (i_15_ == i)
			return true;
		Class366 class366 = Class655.aClass375_8420.method6357((byte) 36).method6333(i, 1430500554);
		Class366 class366_17_ = Class655.aClass375_8420.method6357((byte) 36).method6333(i_15_, -791150520);
		Class366 class366_18_ = class366;
		while_34_: do {
			do {
				if (class366_18_ == null)
					break while_34_;
				class366_18_ = class366_18_.method6319((byte) 14);
				if (class366_17_ == class366_18_)
					return true;
			} while (class366_18_ != class366);
			return false;
		} while (false);
		class366_18_ = class366_17_;
		while_35_: do {
			do {
				if (class366_18_ == null)
					break while_35_;
				class366_18_ = class366_18_.method6319((byte) 14);
				if (class366_18_ == class366)
					return true;
			} while (class366_18_ != class366_17_);
			return false;
		} while (false);
		return false;
	}

	static final boolean method9714(RSStream class116, short i) {
		boolean bool;
		try {
			bool = PacketsDecoder.method4265(class116, 156485715);
		} catch (IOException ioexception) {
			if (8 == client.anInt11136 * -2020118759) {
				class116.method1978((byte) 0);
				return false;
			}
			Class145.method2383((byte) -31);
			return true;
		} catch (Exception exception) {
			Class592 class592 = client.aClass505_11019.method8242(55538902);
			String string = new StringBuilder().append(class116.currentPacket != null ? 942758347 * class116.currentPacket.anInt4522 : -1).append(Class31.aString300).append(null != class116.aClass409_1430 ? class116.aClass409_1430.anInt4522 * 942758347 : -1).append(Class31.aString300).append(null != class116.aClass409_1426 ? class116.aClass409_1426.anInt4522 * 942758347 : -1).append(" ").append(class116.anInt1421 * -1372959327).append(Class31.aString300).append(235453015 * class592.localX + (Class241.player.screenX[0])).append(Class31.aString300).append((Class241.player.screenY[0]) + 1704054549 * class592.localY).append(" ").toString();
			for (int i_19_ = 0; i_19_ < class116.anInt1421 * -1372959327 && i_19_ < 50; i_19_++)
				string = new StringBuilder().append(string).append(class116.updateBuffer.buffer[i_19_]).append(Class31.aString300).toString();
			Class305.method5553(string, exception, (byte) 1);
			Class669.method13691(false, -1838550041);
			return true;
		}
		return bool;
	}
}
