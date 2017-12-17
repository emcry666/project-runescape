/* Class611 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class611 {
	static final int anInt8006 = 4;
	static final int anInt8007 = 2;
	static final int anInt8008 = 8;
	int anInt8009;
	public int anInt8010;
	static final int anInt8011 = 1;
	public int anInt8012;
	public static String aString8013;

	public boolean method10020(short i) {
		return 0 != (anInt8010 * -427096717 & 0x8);
	}

	public boolean method10021() {
		return 0 != (anInt8010 * -427096717 & 0x8);
	}

	public boolean method10022(byte i) {
		return (anInt8010 * -427096717 & 0x1) != 0;
	}

	public boolean method10023(int i) {
		return (anInt8010 * -427096717 & 0x2) != 0;
	}

	public boolean method10024(byte i) {
		return 0 != (anInt8010 * -427096717 & 0x4);
	}

	public boolean method10025() {
		return (anInt8010 * -427096717 & 0x1) != 0;
	}

	public boolean method10026() {
		return (anInt8010 * -427096717 & 0x1) != 0;
	}

	public boolean method10027() {
		return (anInt8010 * -427096717 & 0x1) != 0;
	}

	public boolean method10028() {
		return (anInt8010 * -427096717 & 0x2) != 0;
	}

	public boolean method10029() {
		return (anInt8010 * -427096717 & 0x2) != 0;
	}

	Class611() {
		/* empty */
	}

	public boolean method10030() {
		return 0 != (anInt8010 * -427096717 & 0x4);
	}

	public boolean method10031() {
		return 0 != (anInt8010 * -427096717 & 0x4);
	}

	public boolean method10032() {
		return 0 != (anInt8010 * -427096717 & 0x4);
	}

	public boolean method10033() {
		return 0 != (anInt8010 * -427096717 & 0x4);
	}

	static final void method10034(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class170.method2892(class250, class242, class669, PacketsDecoder.aClass233_2373, (byte) 0);
	}

	static final void method10035(Class669 class669, int i) {
		class669.anInt8560 -= -1823027158;
		Class172.method2897((String) (class669.anObjectArray8559[class669.anInt8560 * 240723773]), (String) (class669.anObjectArray8559[1 + class669.anInt8560 * 240723773]), "", class669.anIntArray8557[((class669.anInt8558 -= 2138772399) * 1357652815)] == 1, false, (byte) 121);
	}

	static final void method10036(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_0_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_1_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1];
		Class553.method9164(9, i_0_, i_1_, "", 353701169);
	}

	static char method10037(char c, int i) {
		switch (c) {
		default:
			return Character.toLowerCase(c);
		case '\u00d9':
		case '\u00da':
		case '\u00db':
		case '\u00dc':
		case '\u00f9':
		case '\u00fa':
		case '\u00fb':
		case '\u00fc':
			return 'u';
		case '\u00d1':
		case '\u00f1':
			return 'n';
		case '\u00ff':
		case '\u0178':
			return 'y';
		case '\u00c8':
		case '\u00c9':
		case '\u00ca':
		case '\u00cb':
		case '\u00e8':
		case '\u00e9':
		case '\u00ea':
		case '\u00eb':
			return 'e';
		case '#':
		case '[':
		case ']':
			return c;
		case '\u00c7':
		case '\u00e7':
			return 'c';
		case '\u00cd':
		case '\u00ce':
		case '\u00cf':
		case '\u00ed':
		case '\u00ee':
		case '\u00ef':
			return 'i';
		case ' ':
		case '-':
		case '_':
		case '\u00a0':
			return '_';
		case '\u00df':
			return 'b';
		case '\u00c0':
		case '\u00c1':
		case '\u00c2':
		case '\u00c3':
		case '\u00c4':
		case '\u00e0':
		case '\u00e1':
		case '\u00e2':
		case '\u00e3':
		case '\u00e4':
			return 'a';
		case '\u00d2':
		case '\u00d3':
		case '\u00d4':
		case '\u00d5':
		case '\u00d6':
		case '\u00f2':
		case '\u00f3':
		case '\u00f4':
		case '\u00f5':
		case '\u00f6':
			return 'o';
		}
	}

	static final void method10038(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub22_10651.method16930(1372802952);
	}

	static final void method10039(Class669 class669, int i) {
		int i_2_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = client.aClass220_11301.method4107(i_2_, -1567170140).method4092(498521638);
	}
}
