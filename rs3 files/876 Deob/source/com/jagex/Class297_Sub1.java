/* Class297_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class297_Sub1 extends Class297 {
	public static int anInt10002;

	public Interface13 method50(int i, Interface12 interface12) {
		return new NPCDefinition(i, this, interface12);
	}

	public Interface13 method48(int i, Interface12 interface12, int i_0_) {
		return new NPCDefinition(i, this, interface12);
	}

	public Class method49(int i) {
		return com.jagex.NPCDefinition.class;
	}

	Class297_Sub1(boolean bool, Class472 class472, Class668 class668, Class681 class681) {
		super(bool, class472, class668, class681);
	}

	public Class method47() {
		return com.jagex.NPCDefinition.class;
	}

	static int method15556(NPC class647_sub1_sub3_sub1_sub1, byte i) {
		NPCDefinition class300 = class647_sub1_sub3_sub1_sub1.aClass300_12175;
		if (class300.anIntArray3286 != null) {
			class300 = class300.method5490(Class98_Sub1_Sub2.playerVarsProvider, Class98_Sub1_Sub2.playerVarsProvider, (byte) -4);
			if (class300 == null)
				return -1;
		}
		int i_1_ = 76076617 * class300.anInt3261;
		Class588 class588 = class647_sub1_sub3_sub1_sub1.method18352(-509095300);
		int i_2_ = class647_sub1_sub3_sub1_sub1.aClass707_Sub1_11887.method14163(-2055125780);
		if (-1 == i_2_ || class647_sub1_sub3_sub1_sub1.aClass707_Sub1_11887.aBool10956)
			i_1_ = -1238207029 * class300.anInt3301;
		else if (i_2_ == 684302799 * class588.anInt7772 || class588.anInt7759 * 1369343077 == i_2_ || i_2_ == 1751585825 * class588.anInt7761 || i_2_ == class588.anInt7760 * -893536895)
			i_1_ = class300.anInt3304 * 710999717;
		else if (i_2_ == 87001555 * class588.anInt7762 || i_2_ == 1855181421 * class588.anInt7763 || -613234717 * class588.anInt7765 == i_2_ || class588.anInt7764 * 791380503 == i_2_)
			i_1_ = class300.anInt3302 * 1501995389;
		return i_1_;
	}

	static final void method15557(Class669 class669, int i) {
		int i_3_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_3_, -794772779);
		Class242 class242 = Class31.aClass242Array302[i_3_ >> 16];
		Class39.method1126(class250, class242, class669, 921444067);
	}

	static final void method15558(Class669 class669, int i) {
		int i_4_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		if (client.anInt11235 * 326760831 != 0 && i_4_ < client.anInt11078 * 54287651)
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = client.aClass51Array11294[i_4_].aString714;
		else
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
	}
}
