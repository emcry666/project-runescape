/* Class185_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class185_Sub2_Sub1 extends Class185_Sub2 {
	static int[][] anIntArrayArray11397 = new int[6][];
	Interface39 anInterface39_11398;
	int anInt11399;
	Class178_Sub2 aClass178_Sub2_11400;

	Class185_Sub2_Sub1(Class178_Sub2 class178_sub2, int i) {
		aClass178_Sub2_11400 = class178_sub2;
		anInt11399 = i;
	}

	Interface39 method15482() {
		if (anInterface39_11398 == null) {
			Interface25 interface25 = aClass178_Sub2_11400.anInterface25_1923;
			Class177 class177 = aClass178_Sub2_11400.aClass172_1916.method2895(anInt11399, -1435203782);
			if (class177 == null)
				return null;
			if (!class177.aBool1910)
				return null;
			if (!interface25.method136(Class601.aClass601_7849, anInt11399, Class608.aClass608_7989, 1.0F, class177.anInt1913 * 1075916655, class177.anInt1913 * 1075916655, false, (short) -28255))
				return null;
			int[] is = interface25.method137(Class601.aClass601_7849, anInt11399, 1.0F, class177.anInt1913 * 1075916655, class177.anInt1913 * 1075916655, false, (byte) 0);
			int i = (class177.anInt1913 * 1075916655 * (class177.anInt1913 * 1075916655));
			if (is == null)
				return null;
			for (int i_0_ = 0; i_0_ < 6; i_0_++) {
				anIntArrayArray11397[i_0_] = new int[i];
				System.arraycopy(is, i * i_0_, anIntArrayArray11397[i_0_], 0, i);
			}
			anInterface39_11398 = aClass178_Sub2_11400.method14997((class177.anInt1913 * 1075916655), class177.aByte1908 != 0, anIntArrayArray11397);
		}
		return anInterface39_11398;
	}

	Interface39 method15483() {
		if (anInterface39_11398 == null) {
			Interface25 interface25 = aClass178_Sub2_11400.anInterface25_1923;
			Class177 class177 = aClass178_Sub2_11400.aClass172_1916.method2895(anInt11399, -1596321361);
			if (class177 == null)
				return null;
			if (!class177.aBool1910)
				return null;
			if (!interface25.method136(Class601.aClass601_7849, anInt11399, Class608.aClass608_7989, 1.0F, class177.anInt1913 * 1075916655, class177.anInt1913 * 1075916655, false, (short) -17888))
				return null;
			int[] is = interface25.method137(Class601.aClass601_7849, anInt11399, 1.0F, class177.anInt1913 * 1075916655, class177.anInt1913 * 1075916655, false, (byte) 0);
			int i = (class177.anInt1913 * 1075916655 * (class177.anInt1913 * 1075916655));
			if (is == null)
				return null;
			for (int i_1_ = 0; i_1_ < 6; i_1_++) {
				anIntArrayArray11397[i_1_] = new int[i];
				System.arraycopy(is, i * i_1_, anIntArrayArray11397[i_1_], 0, i);
			}
			anInterface39_11398 = aClass178_Sub2_11400.method14997((class177.anInt1913 * 1075916655), class177.aByte1908 != 0, anIntArrayArray11397);
		}
		return anInterface39_11398;
	}
}
