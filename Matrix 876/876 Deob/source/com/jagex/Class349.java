/* Class349 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class349 {
	Class178_Sub2 aClass178_Sub2_3637;
	Interface25 anInterface25_3638;
	Class209 aClass209_3639 = new Class209(10485760, 256);

	Class349(Class178_Sub2 class178_sub2, Interface25 interface25) {
		aClass178_Sub2_3637 = class178_sub2;
		anInterface25_3638 = interface25;
	}

	Interface37 method6095(Class177 class177) {
		return method6096(class177, class177.anInt1913 * 1075916655);
	}

	Interface37 method6096(Class177 class177, int i) {
		long l = (long) (i << 16 | class177.anInt1880 * -1983177481);
		Interface37 interface37 = (Interface37) aClass209_3639.method3767(l);
		if (interface37 != null)
			return interface37;
		if (!method6097(class177, i))
			return null;
		if (i == -1)
			i = class177.anInt1913 * 1075916655;
		Interface37 interface37_0_;
		if (!class177.aBool1887 || !aClass178_Sub2_3637.method3146()) {
			int[] is;
			if (class177.aClass593_1884 != Class593.aClass593_7813 || !Class164_Sub5.method15499(class177.aByte1905, (byte) 89))
				is = anInterface25_3638.method138(Class601.aClass601_7850, (class177.anInt1880 * -1983177481), 0.7F, i, i, false, 1308329154);
			else
				is = anInterface25_3638.method137(Class601.aClass601_7850, (class177.anInt1880 * -1983177481), 0.7F, i, i, true, (byte) 0);
			if (is == null)
				return null;
			interface37_0_ = aClass178_Sub2_3637.method14991(i, i, true, is);
		} else {
			float[] fs = anInterface25_3638.method148(Class601.aClass601_7850, (class177.anInt1880 * -1983177481), 0.7F, i, i, false, -131688608);
			interface37_0_ = aClass178_Sub2_3637.method14957(Class158.aClass158_1743, i, i, true, fs);
		}
		interface37_0_.method239(class177.aByte1911 == 1, class177.aByte1875 == 1);
		aClass209_3639.method3764(interface37_0_, l, i * i, 678035859);
		return interface37_0_;
	}

	boolean method6097(Class177 class177, int i) {
		if (i == -1)
			i = class177.anInt1913 * 1075916655;
		if (!class177.aBool1887 || !aClass178_Sub2_3637.method3146()) {
			if (class177.aClass593_1884 != Class593.aClass593_7813 || !Class164_Sub5.method15499(class177.aByte1905, (byte) 89))
				return anInterface25_3638.method136(Class601.aClass601_7850, (class177.anInt1880 * -1983177481), Class608.aClass608_7988, 0.7F, i, i, false, (short) -5480);
			return anInterface25_3638.method136(Class601.aClass601_7850, (class177.anInt1880 * -1983177481), Class608.aClass608_7989, 0.7F, i, i, true, (short) -7166);
		}
		return anInterface25_3638.method136(Class601.aClass601_7850, class177.anInt1880 * -1983177481, Class608.aClass608_7990, 0.7F, i, i, false, (short) -19453);
	}

	void method6098() {
		aClass209_3639.method3772(5, (byte) -9);
	}

	void method6099() {
		aClass209_3639.method3772(5, (byte) -89);
	}

	Interface37 method6100(Class177 class177) {
		return method6096(class177, class177.anInt1913 * 1075916655);
	}

	boolean method6101(Class177 class177, int i) {
		if (i == -1)
			i = class177.anInt1913 * 1075916655;
		if (!class177.aBool1887 || !aClass178_Sub2_3637.method3146()) {
			if (class177.aClass593_1884 != Class593.aClass593_7813 || !Class164_Sub5.method15499(class177.aByte1905, (byte) 89))
				return anInterface25_3638.method136(Class601.aClass601_7850, (class177.anInt1880 * -1983177481), Class608.aClass608_7988, 0.7F, i, i, false, (short) -3537);
			return anInterface25_3638.method136(Class601.aClass601_7850, (class177.anInt1880 * -1983177481), Class608.aClass608_7989, 0.7F, i, i, true, (short) -723);
		}
		return anInterface25_3638.method136(Class601.aClass601_7850, class177.anInt1880 * -1983177481, Class608.aClass608_7990, 0.7F, i, i, false, (short) -18705);
	}

	Interface37 method6102(Class177 class177) {
		return method6096(class177, class177.anInt1913 * 1075916655);
	}

	Interface37 method6103(Class177 class177) {
		return method6096(class177, class177.anInt1913 * 1075916655);
	}

	Interface37 method6104(Class177 class177, int i) {
		long l = (long) (i << 16 | class177.anInt1880 * -1983177481);
		Interface37 interface37 = (Interface37) aClass209_3639.method3767(l);
		if (interface37 != null)
			return interface37;
		if (!method6097(class177, i))
			return null;
		if (i == -1)
			i = class177.anInt1913 * 1075916655;
		Interface37 interface37_1_;
		if (!class177.aBool1887 || !aClass178_Sub2_3637.method3146()) {
			int[] is;
			if (class177.aClass593_1884 != Class593.aClass593_7813 || !Class164_Sub5.method15499(class177.aByte1905, (byte) 89))
				is = anInterface25_3638.method138(Class601.aClass601_7850, (class177.anInt1880 * -1983177481), 0.7F, i, i, false, 1791698831);
			else
				is = anInterface25_3638.method137(Class601.aClass601_7850, (class177.anInt1880 * -1983177481), 0.7F, i, i, true, (byte) 0);
			if (is == null)
				return null;
			interface37_1_ = aClass178_Sub2_3637.method14991(i, i, true, is);
		} else {
			float[] fs = anInterface25_3638.method148(Class601.aClass601_7850, (class177.anInt1880 * -1983177481), 0.7F, i, i, false, 738047415);
			interface37_1_ = aClass178_Sub2_3637.method14957(Class158.aClass158_1743, i, i, true, fs);
		}
		interface37_1_.method239(class177.aByte1911 == 1, class177.aByte1875 == 1);
		aClass209_3639.method3764(interface37_1_, l, i * i, 832260740);
		return interface37_1_;
	}

	boolean method6105(Class177 class177, int i) {
		if (i == -1)
			i = class177.anInt1913 * 1075916655;
		if (!class177.aBool1887 || !aClass178_Sub2_3637.method3146()) {
			if (class177.aClass593_1884 != Class593.aClass593_7813 || !Class164_Sub5.method15499(class177.aByte1905, (byte) 89))
				return anInterface25_3638.method136(Class601.aClass601_7850, (class177.anInt1880 * -1983177481), Class608.aClass608_7988, 0.7F, i, i, false, (short) -7717);
			return anInterface25_3638.method136(Class601.aClass601_7850, (class177.anInt1880 * -1983177481), Class608.aClass608_7989, 0.7F, i, i, true, (short) -32271);
		}
		return anInterface25_3638.method136(Class601.aClass601_7850, class177.anInt1880 * -1983177481, Class608.aClass608_7990, 0.7F, i, i, false, (short) -18294);
	}

	void method6106() {
		aClass209_3639.method3773(-2085753818);
	}

	boolean method6107(Class177 class177, int i) {
		if (i == -1)
			i = class177.anInt1913 * 1075916655;
		if (!class177.aBool1887 || !aClass178_Sub2_3637.method3146()) {
			if (class177.aClass593_1884 != Class593.aClass593_7813 || !Class164_Sub5.method15499(class177.aByte1905, (byte) 89))
				return anInterface25_3638.method136(Class601.aClass601_7850, (class177.anInt1880 * -1983177481), Class608.aClass608_7988, 0.7F, i, i, false, (short) -8562);
			return anInterface25_3638.method136(Class601.aClass601_7850, (class177.anInt1880 * -1983177481), Class608.aClass608_7989, 0.7F, i, i, true, (short) -20580);
		}
		return anInterface25_3638.method136(Class601.aClass601_7850, class177.anInt1880 * -1983177481, Class608.aClass608_7990, 0.7F, i, i, false, (short) -17687);
	}

	void method6108() {
		aClass209_3639.method3772(5, (byte) -92);
	}

	Interface37 method6109(Class177 class177) {
		return method6096(class177, class177.anInt1913 * 1075916655);
	}

	void method6110() {
		aClass209_3639.method3773(-1889738548);
	}
}
