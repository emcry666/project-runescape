/* Class599 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class599 implements Interface75 {
	static Class599 aClass599_7842;
	static Class599 aClass599_7843;
	static Class599 aClass599_7844 = new Class599(0);
	int anInt7845;

	public int method6() {
		return 1390620253 * anInt7845;
	}

	public int method82() {
		return 1390620253 * anInt7845;
	}

	static {
		aClass599_7843 = new Class599(1);
		aClass599_7842 = new Class599(2);
	}

	public static Class599[] method9853() {
		return (new Class599[] { aClass599_7843, aClass599_7842, aClass599_7844 });
	}

	public int method101() {
		return 1390620253 * anInt7845;
	}

	public static Class599[] method9854() {
		return (new Class599[] { aClass599_7843, aClass599_7842, aClass599_7844 });
	}

	Class599(int i) {
		anInt7845 = -1368189451 * i;
	}

	public static Class599[] method9855() {
		return (new Class599[] { aClass599_7843, aClass599_7842, aClass599_7844 });
	}

	static final void method9856(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class250.anInt2544 * -1904547845;
	}

	static final void method9857(Class669 class669, int i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_0_, -1457999480);
		Class10.method638(class250, class669, -2086641508);
	}

	static final void method9858(Class669 class669, byte i) {
		class669.anInt8558 -= -17422498;
		int i_1_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_2_ = class669.anIntArray8557[1 + 1357652815 * class669.anInt8558];
		if (-1 == i_2_)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -1;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class380.aClass473_3938.method7739(i_1_, (byte) -106).method18095((char) i_2_, (byte) 46);
	}

	static String method9859(byte[] is, int i, int i_3_, short i_4_) {
		StringBuilder stringbuilder = new StringBuilder();
		for (int i_5_ = i; i_5_ < i_3_ + i; i_5_ += 3) {
			int i_6_ = is[i_5_] & 0xff;
			stringbuilder.append(Class684.aCharArray8663[i_6_ >>> 2]);
			if (i_5_ < i_3_ - 1) {
				int i_7_ = is[i_5_ + 1] & 0xff;
				stringbuilder.append(Class684.aCharArray8663[(i_6_ & 0x3) << 4 | i_7_ >>> 4]);
				if (i_5_ < i_3_ - 2) {
					int i_8_ = is[2 + i_5_] & 0xff;
					stringbuilder.append(Class684.aCharArray8663[(i_7_ & 0xf) << 2 | i_8_ >>> 6]).append(Class684.aCharArray8663[i_8_ & 0x3f]);
				} else
					stringbuilder.append(Class684.aCharArray8663[(i_7_ & 0xf) << 2]).append('=');
			} else
				stringbuilder.append(Class684.aCharArray8663[(i_6_ & 0x3) << 4]).append('=').append('=');
		}
		return stringbuilder.toString();
	}

	static final void method9860(Class523_Sub36 class523_sub36, int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_) {
		if (Class69.method1464(i, null, 1388891557)) {
			if (null != class523_sub36 && !class523_sub36.method16510(117981077))
				Class579.method9657(class523_sub36, true, false, -1566889811);
			else {
				Class242 class242 = Class31.aClass242Array302[i];
				client.method17431(class242, class242.method4365((byte) -89), -1, i_9_, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_, i_16_);
			}
		}
	}

	static final void method9861(Class669 class669, byte i) {
		int i_18_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_18_, -564482669);
		Class242 class242 = Class31.aClass242Array302[i_18_ >> 16];
		Class328.method5787(class250, class242, class669, -361765999);
	}
}
