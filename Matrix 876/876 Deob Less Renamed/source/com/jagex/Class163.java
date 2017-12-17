/* Class163 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class163 {
	int anInt1772;
	public int anInt1773;
	public int anInt1774;
	public int anInt1775;
	public int anInt1776;
	public int anInt1777;
	public int anInt1778;

	public Class163(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		anInt1776 = i * -780986409;
		anInt1775 = i_0_ * 2053161261;
		anInt1774 = 1512945865 * i_1_;
		anInt1772 = i_2_ * -2120444671;
		anInt1778 = -923094865 * i_3_;
		anInt1777 = i_4_ * -320151975;
		anInt1773 = -58453511 * i_5_;
	}

	public boolean method2590(Class163 class163_6_) {
		return (class163_6_.anInt1776 * -319632409 == anInt1776 * -319632409 && anInt1775 * -118212955 == class163_6_.anInt1775 * -118212955 && (anInt1774 * -1046224519 == -1046224519 * class163_6_.anInt1774) && (-1071879423 * anInt1772 == class163_6_.anInt1772 * -1071879423) && 93234767 * anInt1778 == class163_6_.anInt1778 * 93234767 && anInt1777 * -613512727 == class163_6_.anInt1777 * -613512727 && (anInt1773 * -356130743 == -356130743 * class163_6_.anInt1773));
	}

	public boolean method2591(Class163 class163_7_, int i) {
		return (class163_7_.anInt1776 * -319632409 == anInt1776 * -319632409 && anInt1775 * -118212955 == class163_7_.anInt1775 * -118212955 && (anInt1774 * -1046224519 == -1046224519 * class163_7_.anInt1774) && (-1071879423 * anInt1772 == class163_7_.anInt1772 * -1071879423) && 93234767 * anInt1778 == class163_7_.anInt1778 * 93234767 && anInt1777 * -613512727 == class163_7_.anInt1777 * -613512727 && (anInt1773 * -356130743 == -356130743 * class163_7_.anInt1773));
	}

	public Class163() {
		/* empty */
	}

	static final void method2592(Class669 class669, int i) {
		int i_8_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_8_, -407394819);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 907343347 * class250.anInt2554;
	}

	static String method2593(int[] is, int i) {
		StringBuilder stringbuilder = new StringBuilder();
		for (int i_9_ = 0; i_9_ < is.length; i_9_++) {
			Class280 class280 = ((Class280) Class655.aClass58_Sub1_8422.getDefinition(is[i_9_], (byte) -51));
			if (class280.anInt3064 * -447328581 != -1)
				stringbuilder.append(" <sprite=").append(-447328581 * class280.anInt3064).append(">");
		}
		return stringbuilder.toString();
	}
}
