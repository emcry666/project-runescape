/* Class213 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class213 implements Interface69 {
	Class217 this$0;
	static int anInt2267;

	public void method440(Interface71 interface71, int i, int i_0_, boolean bool, int i_1_) {
		this$0.method3920(-409338198).add(interface71);
		if (bool)
			this$0.method3855(-16711936).method3770(interface71, (long) i_0_);
		else
			this$0.method3916((byte) 86).method3764(interface71, (long) i_0_, interface71.method453((byte) -69), 173201127);
	}

	Class213(Class217 class217) {
		this$0 = class217;
	}

	public void method438(Interface71 interface71, int i, int i_2_, boolean bool) {
		this$0.method3920(1448431942).add(interface71);
		if (bool)
			this$0.method3855(-16711936).method3770(interface71, (long) i_2_);
		else
			this$0.method3916((byte) 39).method3764(interface71, (long) i_2_, interface71.method453((byte) -26), 1666746394);
	}

	public void method437(Interface71 interface71, byte i) {
		if (interface71 != null)
			this$0.method3916((byte) 39).method3767((long) interface71.method455((byte) 25));
	}

	public void method441(Interface71 interface71, int i, int i_3_, boolean bool) {
		this$0.method3920(-914796601).add(interface71);
		if (bool)
			this$0.method3855(-16711936).method3770(interface71, (long) i_3_);
		else
			this$0.method3916((byte) 22).method3764(interface71, (long) i_3_, interface71.method453((byte) -83), 822715877);
	}

	public void method436(Interface71 interface71) {
		if (interface71 != null)
			this$0.method3916((byte) 88).method3767((long) interface71.method455((byte) 113));
	}

	public void method439(Interface71 interface71) {
		if (interface71 != null)
			this$0.method3916((byte) 104).method3767((long) interface71.method455((byte) 38));
	}

	static final void method3834(Class250 class250, Class242 class242, Class669 class669, int i) {
		class669.anInt8558 -= -34844996;
		class250.anInt2574 = (class669.anIntArray8557[class669.anInt8558 * 1357652815] * 1601670177);
		class250.anInt2507 = (class669.anIntArray8557[1 + class669.anInt8558 * 1357652815] * 444853179);
		int i_4_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 2];
		if (i_4_ < 0)
			i_4_ = 0;
		else if (i_4_ > 5)
			i_4_ = 5;
		int i_5_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 3];
		if (i_5_ < 0)
			i_5_ = 0;
		else if (i_5_ > 5)
			i_5_ = 5;
		class250.aByte2532 = (byte) i_4_;
		class250.aByte2533 = (byte) i_5_;
		Class523_Sub14.method15991(class250, (byte) -45);
		Class79.method1563(class242, class250, -1950880406);
		if (class250.anInt2534 * 36473529 == 0)
			Class644.method10553(class242, class250, false, (byte) -94);
		if (-1 == 234012635 * class250.anInt2709 && !class242.aBool2456)
			Class34.method949(class250.anInt2585 * -1363815505, (byte) 28);
	}

	static final void method3835(Class669 class669, int i) {
		int i_6_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		if (client.friendsChatName != null && i_6_ < Class365.anInt3866 * 797304521)
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = Class99.aClass115Array1232[i_6_].aString1409;
		else
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
	}
}
