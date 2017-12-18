/* Class274 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class274 {
	static Class274 aClass274_2892;
	public static Class274 aClass274_2893;
	static Class274 aClass274_2894 = new Class274(0);
	public static Class274 aClass274_2895;
	int anInt2896;
	public static Class274 aClass274_2897;
	static Class274 aClass274_2898;

	public static Class274 method5028(int i) {
		if (i == aClass274_2894.anInt2896 * 933737585)
			return aClass274_2894;
		if (i == aClass274_2892.anInt2896 * 933737585)
			return aClass274_2892;
		if (aClass274_2898.anInt2896 * 933737585 == i)
			return aClass274_2898;
		if (i == aClass274_2895.anInt2896 * 933737585)
			return aClass274_2895;
		if (aClass274_2893.anInt2896 * 933737585 == i)
			return aClass274_2893;
		if (aClass274_2897.anInt2896 * 933737585 == i)
			return aClass274_2897;
		return null;
	}

	Class274(int i) {
		anInt2896 = i * 522554513;
	}

	static {
		aClass274_2892 = new Class274(1);
		aClass274_2898 = new Class274(2);
		aClass274_2895 = new Class274(3);
		aClass274_2893 = new Class274(4);
		aClass274_2897 = new Class274(5);
	}

	static final void method5029(Class669 class669, byte i) {
		Class415.method6655(-602155973);
		Class526.method8725(-672774306);
		client.aClass505_11019.method8294(-889374440);
		Class211.method3824(1318768987);
		client.aBool11012 = false;
	}

	static boolean method5030(int i) {
		return Class27.aBool258;
	}

	static void method5031(Class178 class178, int i, int i_0_, InterfaceComponentDefinitions class250, int i_1_, int i_2_) {
		for (int i_3_ = 7; i_3_ >= 0; i_3_--) {
			for (int i_4_ = 127; i_4_ >= 0; i_4_--) {
				int i_5_ = (i_1_ & 0x3f) << 10 | (i_3_ & 0x7) << 7 | i_4_ & 0x7f;
				Class226.method4166(false, true, 240723773);
				int i_6_ = Class638.anIntArray8306[i_5_];
				Class305.method5552(false, true, (byte) 0);
				class178.method3193((i_4_ * (class250.anInt2581 * 365308179) >> 7) + i, i_0_ + (-1759297857 * class250.anInt2543 * (7 - i_3_) >> 3), 1 + (365308179 * class250.anInt2581 >> 7), (-1759297857 * class250.anInt2543 >> 3) + 1, ~0xffffff | i_6_, 0);
			}
		}
	}

	static final void method5032(InterfaceComponentDefinitions[] class250s, int i, int i_7_) {
		for (int i_8_ = 0; i_8_ < class250s.length; i_8_++) {
			InterfaceComponentDefinitions class250 = class250s[i_8_];
			if (null != class250 && class250.parentId * 97896203 == i && !client.method17254(class250)) {
				if (36473529 * class250.type == 0) {
					method5032(class250s, class250.interfaceHash * -1363815505, 1936588830);
					if (class250.aClass250Array2519 != null)
						method5032(class250.aClass250Array2519, -1363815505 * class250.interfaceHash, 1936588830);
					Class523_Sub36 class523_sub36 = ((Class523_Sub36) (client.aClass14_11187.getFromIndex((long) (class250.interfaceHash * -1363815505))));
					if (class523_sub36 != null)
						Class39.method1130((-1444773101 * class523_sub36.anInt10666), -1487726008);
				}
				if (6 == class250.type * 36473529 && class250.anInt2548 * -339807053 != -1) {
					if (null == class250.aClass707_2693) {
						class250.aClass707_2693 = new Class707_Sub3();
						class250.aClass707_2693.method14164((class250.anInt2548 * -339807053), (byte) 12);
					}
					if (class250.aClass707_2693.method14205((client.anInt11059 * 1673150439), (byte) 46) && class250.aClass707_2693.method14177(1357652815))
						class250.aClass707_2693.method14217(-891902453);
				}
			}
		}
	}

	static final void method5033(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (null == client.aClass250_11114 ? -1 : client.aClass250_11114.interfaceHash * -1363815505);
	}

	public static void method5034(int i, int i_9_) {
		int i_10_ = client.aList11321.indexOf(Integer.valueOf(i));
		if (i_10_ == -1)
			client.aList11321.add(Integer.valueOf(i));
	}
}
