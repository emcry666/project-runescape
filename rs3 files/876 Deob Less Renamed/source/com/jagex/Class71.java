/* Class71 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

class Class71 implements Iterator {
	int anInt796;
	Class53 this$0;

	public boolean method1482() {
		return -1765098993 * anInt796 < 787510181 * this$0.anInt721;
	}

	public boolean hasNext() {
		return -1765098993 * anInt796 < 787510181 * this$0.anInt721;
	}

	public boolean method1483() {
		return -1765098993 * anInt796 < 787510181 * this$0.anInt721;
	}

	Class71(Class53 class53) {
		this$0 = class53;
	}

	public void method1484() {
		throw new UnsupportedOperationException();
	}

	public boolean method1485() {
		return -1765098993 * anInt796 < 787510181 * this$0.anInt721;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public boolean method1486() {
		return -1765098993 * anInt796 < 787510181 * this$0.anInt721;
	}

	public Object method1487() {
		int i = (anInt796 += -1472531217) * -1765098993 - 1;
		synchronized (this$0.aClass209_719) {
			Interface13 interface13 = (Interface13) this$0.aClass209_719.method3767((long) i);
			if (interface13 != null) {
				Interface13 interface13_0_ = interface13;
				return interface13_0_;
			}
		}
		return this$0.method1291(i, 2125566745);
	}

	public Object next() {
		int i = (anInt796 += -1472531217) * -1765098993 - 1;
		synchronized (this$0.aClass209_719) {
			Interface13 interface13 = (Interface13) this$0.aClass209_719.method3767((long) i);
			if (interface13 != null) {
				Interface13 interface13_1_ = interface13;
				return interface13_1_;
			}
		}
		return this$0.method1291(i, 2125566745);
	}

	public void method1488() {
		throw new UnsupportedOperationException();
	}

	static void method1489(int i, int i_2_) {
		Class104.anInt1264 = 0;
		int i_3_ = client.aClass505_11019.method8292((byte) 85);
		int i_4_ = client.aClass505_11019.method8235(2098330376);
		Class451 class451 = client.aClass505_11019.method8243(-1184460352);
		Class560 class560 = client.aClass505_11019.method8241((byte) -92);
		Class53_Sub18 class53_sub18 = client.aClass505_11019.method8244(1031688852);
		int i_5_ = i;
		if (Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453 != null) {
			int i_6_ = ((Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.anIntArray11885[0]) >> 3);
			int i_7_ = ((Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.anIntArray11943[0]) >> 3);
			if (i_6_ >= 0 && i_6_ < Class223.aBoolArrayArray2336.length && i_7_ >= 0 && i_7_ < Class223.aBoolArrayArray2336[i_6_].length && Class223.aBoolArrayArray2336[i_6_][i_7_])
				i_5_ = 0;
		}
		for (int i_8_ = 0; i_8_ < i_3_; i_8_++) {
			for (int i_9_ = 0; i_9_ < i_4_; i_9_++) {
				for (int i_10_ = i_5_; i_10_ <= i + 1 && i_10_ <= 3; i_10_++) {
					if ((i_10_ < i || class451.method7283(i, i_10_, i_8_, i_9_, 1917886481)) && !(Class257.method4686((Interface61) class560.method9398(i_10_, i_8_, i_9_, -1383568495), class53_sub18, i_8_, i_9_, (byte) -86)) && !(Class257.method4686(((Interface61) class560.method9295(i_10_, i_8_, i_9_, client.anInterface63_11296, (byte) -25)), class53_sub18, i_8_, i_9_, (byte) -84)) && !(Class257.method4686((Interface61) class560.method9280(i_10_, i_8_, i_9_, 1040112090), class53_sub18, i_8_, i_9_, (byte) -25)) && !(Class257.method4686((Interface61) class560.method9284(i_10_, i_8_, i_9_, (byte) 25), class53_sub18, i_8_, i_9_, (byte) -107))) {
						/* empty */
					}
				}
			}
		}
	}

	static final void method1490(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class48.method1259(class250, class242, class669, 301592794);
	}
}
