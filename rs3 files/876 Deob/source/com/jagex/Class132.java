/* Class132 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class132 {
	Class126_Sub3 aClass126_Sub3_1559;
	static final int anInt1560 = 128;
	static final int anInt1561 = 128;
	static final int anInt1562 = 16;
	Class126_Sub2[] aClass126_Sub2Array1563;
	Class126_Sub2[] aClass126_Sub2Array1564 = null;
	static Object anObject1565;
	Class126_Sub3 aClass126_Sub3_1566;
	Class126_Sub3 aClass126_Sub3_1567;
	static Object anObject1568;
	boolean aBool1569;
	static final int anInt1570 = 4000;
	static Object anObject1571;

	Class132(Class178_Sub1 class178_sub1) {
		aClass126_Sub3_1559 = null;
		aClass126_Sub2Array1563 = null;
		aClass126_Sub3_1567 = null;
		aClass126_Sub3_1566 = null;
		aBool1569 = class178_sub1.aBool9325;
		method2260(class178_sub1);
		if (!aBool1569) {
			aClass126_Sub2Array1564 = new Class126_Sub2[16];
			for (int i = 0; i < 16; i++) {
				byte[] is = Class144.method2377(anObject1568, i * 32768, 32768, 1236733890);
				aClass126_Sub2Array1564[i] = new Class126_Sub2(class178_sub1, 3553, Class158.aClass158_1746, Class170.aClass170_1822, 128, 128, true, is, Class158.aClass158_1746, false);
			}
			aClass126_Sub2Array1563 = new Class126_Sub2[16];
			for (int i = 0; i < 16; i++) {
				byte[] is = Class144.method2377(anObject1565, i * 32768, 32768, 1754557146);
				aClass126_Sub2Array1563[i] = new Class126_Sub2(class178_sub1, 3553, Class158.aClass158_1746, Class170.aClass170_1822, 128, 128, true, is, Class158.aClass158_1746, false);
			}
		} else {
			byte[] is = Class654.method10718(anObject1568, false, 249292354);
			aClass126_Sub3_1559 = new Class126_Sub3(class178_sub1, Class158.aClass158_1746, Class170.aClass170_1822, 128, 128, 16, is, Class158.aClass158_1746);
			is = Class654.method10718(anObject1565, false, -1775452009);
			aClass126_Sub3_1567 = new Class126_Sub3(class178_sub1, Class158.aClass158_1746, Class170.aClass170_1822, 128, 128, 16, is, Class158.aClass158_1746);
			Class156 class156 = class178_sub1.aClass156_9364;
			if (class156.method2549()) {
				is = Class654.method10718(anObject1571, false, -1991186786);
				aClass126_Sub3_1566 = new Class126_Sub3(class178_sub1, Class158.aClass158_1743, Class170.aClass170_1822, 128, 128, 16);
				Class126_Sub3 class126_sub3 = new Class126_Sub3(class178_sub1, Class158.aClass158_1745, Class170.aClass170_1822, 128, 128, 16, is, Class158.aClass158_1745);
				if (!class156.method2548(aClass126_Sub3_1566, class126_sub3, 2.0F)) {
					aClass126_Sub3_1566.method2109();
					aClass126_Sub3_1566 = null;
				} else
					aClass126_Sub3_1566.method2120();
				class126_sub3.method2109();
			}
		}
	}

	static void method2259(Class178_Sub1 class178_sub1) {
		if (anObject1568 == null) {
			Class401_Sub1_Sub2 class401_sub1_sub2 = new Class401_Sub1_Sub2();
			byte[] is = class401_sub1_sub2.method17942(128, 128, 16);
			anObject1568 = Class39.method1128(is, false, -1096387327);
		}
		if (anObject1565 == null) {
			Class401_Sub2_Sub2 class401_sub2_sub2 = new Class401_Sub2_Sub2();
			byte[] is = class401_sub2_sub2.method17953(128, 128, 16);
			anObject1565 = Class39.method1128(is, false, -1315192282);
		}
		Class156 class156 = class178_sub1.aClass156_9364;
		if (class156.method2549() && anObject1571 == null) {
			byte[] is = Class538.method8945(128, 128, 16, 8, new Class521_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
			anObject1571 = Class39.method1128(is, false, -1200741104);
		}
	}

	static void method2260(Class178_Sub1 class178_sub1) {
		if (anObject1568 == null) {
			Class401_Sub1_Sub2 class401_sub1_sub2 = new Class401_Sub1_Sub2();
			byte[] is = class401_sub1_sub2.method17942(128, 128, 16);
			anObject1568 = Class39.method1128(is, false, -244968447);
		}
		if (anObject1565 == null) {
			Class401_Sub2_Sub2 class401_sub2_sub2 = new Class401_Sub2_Sub2();
			byte[] is = class401_sub2_sub2.method17953(128, 128, 16);
			anObject1565 = Class39.method1128(is, false, -1861657543);
		}
		Class156 class156 = class178_sub1.aClass156_9364;
		if (class156.method2549() && anObject1571 == null) {
			byte[] is = Class538.method8945(128, 128, 16, 8, new Class521_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
			anObject1571 = Class39.method1128(is, false, -599045020);
		}
	}

	static void method2261(Class178_Sub1 class178_sub1) {
		if (anObject1568 == null) {
			Class401_Sub1_Sub2 class401_sub1_sub2 = new Class401_Sub1_Sub2();
			byte[] is = class401_sub1_sub2.method17942(128, 128, 16);
			anObject1568 = Class39.method1128(is, false, -698588271);
		}
		if (anObject1565 == null) {
			Class401_Sub2_Sub2 class401_sub2_sub2 = new Class401_Sub2_Sub2();
			byte[] is = class401_sub2_sub2.method17953(128, 128, 16);
			anObject1565 = Class39.method1128(is, false, 161256093);
		}
		Class156 class156 = class178_sub1.aClass156_9364;
		if (class156.method2549() && anObject1571 == null) {
			byte[] is = Class538.method8945(128, 128, 16, 8, new Class521_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
			anObject1571 = Class39.method1128(is, false, -1337122613);
		}
	}
}
