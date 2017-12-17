/* Class101 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class101 {
	byte aByte1237;
	short aShort1238;
	short aShort1239;
	short aShort1240;
	int anInt1241;
	byte aByte1242;
	boolean aBool1243;
	int anInt1244;

	Class101(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, boolean bool, int i_8_) {
		anInt1241 = i * 577700211;
		aShort1238 = (short) i_3_;
		aShort1239 = (short) i_4_;
		aShort1240 = (short) i_5_;
		aByte1242 = (byte) i_6_;
		aByte1237 = (byte) i_7_;
		aBool1243 = bool;
		anInt1244 = i_8_ * 1362467997;
	}

	static final void method1795(Class669 class669, byte i) {
		int i_9_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_9_, -544824376);
		Class242 class242 = Class31.aClass242Array302[i_9_ >> 16];
		Class272.method5022(class250, class242, class669, (byte) 3);
	}

	static final void method1796(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	public static boolean method1797(boolean bool, int i) {
		boolean bool_10_ = Class31.aClass178_303.method3146();
		if (bool != bool_10_) {
			if (bool) {
				if (!Class31.aClass178_303.method3144())
					bool = false;
			} else
				Class31.aClass178_303.method3145();
			if (bool != bool_10_) {
				Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub30_10610, bool ? 1 : 0, -820140159);
				Class211.method3824(1810761723);
				return true;
			}
			return false;
		}
		return true;
	}

	static void method1798(InterfaceComponentDefinitions class250, int i, int i_11_, boolean bool, short i_12_) {
		int i_13_ = 365308179 * class250.anInt2581;
		int i_14_ = -1759297857 * class250.anInt2543;
		if (class250.aByte2591 == 0)
			class250.anInt2581 = class250.anInt2502 * 1403990739;
		else if (class250.aByte2591 == 1)
			class250.anInt2581 = (i - class250.anInt2502 * -480866135) * -843577061;
		else if (2 == class250.aByte2591)
			class250.anInt2581 = (-480866135 * class250.anInt2502 * i >> 14) * -843577061;
		if (class250.aByte2610 == 0)
			class250.anInt2543 = class250.anInt2686 * 186464517;
		else if (1 == class250.aByte2610)
			class250.anInt2543 = (i_11_ - class250.anInt2686 * 491503803) * 1173303615;
		else if (2 == class250.aByte2610)
			class250.anInt2543 = (491503803 * class250.anInt2686 * i_11_ >> 14) * 1173303615;
		if (class250.aByte2591 == 4)
			class250.anInt2581 = -843577061 * (class250.anInt2543 * -1759297857 * (class250.anInt2676 * 929898471) / (class250.anInt2545 * -1352490971));
		if (class250.aByte2610 == 4)
			class250.anInt2543 = (class250.anInt2545 * -1352490971 * (class250.anInt2581 * 365308179) / (929898471 * class250.anInt2676) * 1173303615);
		if (client.aBool11180 && (client.method17252(class250).settings * 747608249 != 0 || 0 == 36473529 * class250.type)) {
			if (-1759297857 * class250.anInt2543 < 5 && class250.anInt2581 * 365308179 < 5) {
				class250.anInt2543 = 1571550779;
				class250.anInt2581 = 77081991;
			} else {
				if (class250.anInt2543 * -1759297857 <= 0)
					class250.anInt2543 = 1571550779;
				if (class250.anInt2581 * 365308179 <= 0)
					class250.anInt2581 = 77081991;
			}
		}
		if (1301979947 * InterfaceComponentDefinitions.anInt2538 == class250.anInt2582 * 1963816533)
			client.aClass250_11114 = class250;
		if (bool && class250.anObjectArray2542 != null && (i_13_ != 365308179 * class250.anInt2581 || i_14_ != class250.anInt2543 * -1759297857)) {
			Class523_Sub38 class523_sub38 = new Class523_Sub38();
			class523_sub38.aClass250_10678 = class250;
			class523_sub38.anObjectArray10687 = class250.anObjectArray2542;
			client.aClass708_11239.method14236(class523_sub38, 843417937);
		}
	}
}
