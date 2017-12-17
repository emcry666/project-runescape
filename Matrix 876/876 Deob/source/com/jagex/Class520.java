/* Class520 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class520 {
	Class518 this$0;
	static long aLong7060;

	Class520(Class518 class518) {
		this$0 = class518;
	}

	static final void method8642(Class669 class669, byte i) {
		class669.anInt8562 -= -2045027743;
	}

	static final void method8643(InterfaceComponentDefinitions class250, Class669 class669, int i) {
		class669.anInt8558 -= 2121349901;
		int i_0_ = class669.anIntArray8557[class669.anInt8558 * 1357652815] - 1;
		int i_1_ = class669.anIntArray8557[1 + class669.anInt8558 * 1357652815];
		int i_2_ = class669.anIntArray8557[2 + 1357652815 * class669.anInt8558];
		if (i_0_ < 0 || i_0_ > 9)
			throw new RuntimeException();
		Class443.method7208(class250, i_0_, i_1_, i_2_, class669, -1407427416);
	}

	static final void method8644(Class669 class669, byte i) {
		class669.anInt8558 -= 2121349901;
		int i_3_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_4_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 1];
		int i_5_ = class669.anIntArray8557[2 + 1357652815 * class669.anInt8558];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class84.method1596(i_3_, i_4_, i_5_, true, 898899415);
	}

	static final void method8645(Class669 class669, int i) {
		class669.anInt8558 -= 2121349901;
		int i_6_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_7_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1];
		int i_8_ = class669.anIntArray8557[2 + class669.anInt8558 * 1357652815];
		if (-1 == i_7_)
			throw new RuntimeException();
		ClientScriptDefinitions class37 = (ClientScriptDefinitions) Class394.aClass53_Sub16_4056.getDefinition(i_7_, (byte) -3);
		if (class37.valueType.method82() != i_6_)
			throw new RuntimeException();
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class37.method1092(Integer.valueOf(i_8_), (byte) -81) ? 1 : 0;
	}

	static final void method8646(Class669 class669, int i) {
		int i_9_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_9_, -1383729780);
		Class242 class242 = Class31.aClass242Array302[i_9_ >> 16];
		Class595.method9814(class250, class242, class669, -158115584);
	}

	static final void method8647(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class165.method2647(class250, class242, class669, (byte) -17);
	}
}
