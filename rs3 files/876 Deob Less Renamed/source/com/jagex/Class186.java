/* Class186 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class186 {
	static Class186 aClass186_2127;
	static Class186 aClass186_2128;
	static Class186 aClass186_2129;
	public static Class186 aClass186_2130 = new Class186();
	public static Class186 aClass186_2131;

	static {
		aClass186_2128 = new Class186();
		aClass186_2129 = new Class186();
		aClass186_2127 = new Class186();
		aClass186_2131 = new Class186();
	}

	Class186() {
		/* empty */
	}

	static final void method3584(Class250 class250, Class242 class242, Class669 class669, short i) {
		class250.anInt2627 = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) * 403024039;
	}

	static final void method3585(Class669 class669, int i) {
		class669.anInt8560 -= -1823027158;
		String string = ((String) class669.anObjectArray8559[240723773 * class669.anInt8560]);
		String string_0_ = ((String) class669.anObjectArray8559[1 + class669.anInt8560 * 240723773]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = BodyDefinitions.method10328(string, string_0_, (byte) 49);
	}

	static final void method3586(Class669 class669, byte i) {
		class669.anInt8558 -= -17422498;
		int i_1_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_2_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 1];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (Class380.aClass473_3938.method7739(i_1_, (byte) -50).anIntArray11724[i_2_]);
	}

	static final void method3587(Class669 class669, short i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class170.method2892(class250, class242, class669, PacketsDecoder.aClass233_2368, (byte) 0);
	}
}
