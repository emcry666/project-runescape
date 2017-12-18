/* Class486 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class486 {
	boolean aBool5484;
	RSBuffer aClass523_Sub34_5485;
	int anInt5486;
	int anInt5487;
	Class477 this$0;

	void method7938() {
		if (null != aClass523_Sub34_5485 && false == aBool5484)
			aClass523_Sub34_5485.method16408(-1721758961);
		anInt5486 = -2060320103;
		anInt5487 = 1362575595;
	}

	void method7939(int i) {
		if (null != aClass523_Sub34_5485 && false == aBool5484)
			aClass523_Sub34_5485.method16408(-1899508667);
		anInt5486 = -2060320103;
		anInt5487 = 1362575595;
	}

	void method7940() {
		if (null != aClass523_Sub34_5485 && false == aBool5484)
			aClass523_Sub34_5485.method16408(-1740236662);
		anInt5486 = -2060320103;
		anInt5487 = 1362575595;
	}

	Class486(Class477 class477, RSBuffer class523_sub34, boolean bool) {
		this$0 = class477;
		aClass523_Sub34_5485 = class523_sub34;
		aBool5484 = bool;
		anInt5486 = -2060320103;
		anInt5487 = 1362575595;
	}

	public static void method7941(Class572 class572, int i, int i_0_, int i_1_) {
		Class669 class669 = Class540.method8981(-1336634370);
		Class687_Sub28.method16969(class572, i, i_0_, class669, -1157817464);
	}

	static final void method7942(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	public static void method7943(byte i) {
		if (Class569.aBool7643) {
			int i_2_ = Class323.aTwitchTV3452.ShutdownTTV();
			if (i_2_ == 0) {
				Class323.aTwitchTV3452 = null;
				Class569.aBool7643 = false;
			}
		}
	}

	static final void method7944(Class669 class669, int i) {
		int i_3_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		ItemDefinitions class12 = ((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(i_3_, (byte) 39));
		if (-1 == class12.certTemplateId * 1178069929 && 1322459523 * class12.certId >= 0)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1322459523 * class12.certId;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_3_;
	}
}
