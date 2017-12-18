/* Class454 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Comparator;

class Class454 implements Comparator {
	Class466 this$0;
	public static Class63 aClass63_4979;

	public int method7320(Object object, Object object_0_) {
		return method7321((Class465) object, (Class465) object_0_, -970539112);
	}

	int method7321(Class465 class465, Class465 class465_1_, int i) {
		if (7637676821688511515L * class465.aLong5321 > 7637676821688511515L * class465_1_.aLong5321)
			return 1;
		if (7637676821688511515L * class465.aLong5321 < 7637676821688511515L * class465_1_.aLong5321)
			return -1;
		return 0;
	}

	public int compare(Object object, Object object_2_) {
		return method7321((Class465) object, (Class465) object_2_, 2065525282);
	}

	Class454(Class466 class466) {
		this$0 = class466;
	}

	public boolean equals(Object object) {
		return super.equals(object);
	}

	public boolean method7322(Object object) {
		return super.equals(object);
	}

	static Class578 method7323(Class523_Sub34 class523_sub34, int i) {
		int i_3_ = class523_sub34.readUnsignedByte(1805443187);
		int i_4_ = class523_sub34.readUnsignedByte(1173838827);
		return new Class578(i_3_, i_4_);
	}

	static final void method7324(Class669 class669, int i) {
		int i_5_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_5_, -1039206229);
		Class242 class242 = Class31.aClass242Array302[i_5_ >> 16];
		Class423.method6716(class250, class242, class669, -1486193456);
	}

	static final void method7325(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	static final void method7326(Class669 class669, int i) {
		long l = Class248.method4401(1516375036);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class602.method9938(l);
	}
}
