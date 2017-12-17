/* Class522_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class522_Sub1 extends Class522 {
	public int anInt10288;
	public int anInt10289;
	public int anInt10290;
	public int anInt10291;

	void method15781(int i, int i_0_, int i_1_, int i_2_) {
		anInt10291 = i * -216782125;
		anInt10289 = i_0_ * 1151017105;
		anInt10288 = i_1_ * 22612753;
		anInt10290 = i_2_ * -1472442937;
	}

	void method15782(int i, int i_3_, int i_4_, int i_5_, byte i_6_) {
		anInt10291 = i * -216782125;
		anInt10289 = i_3_ * 1151017105;
		anInt10288 = i_4_ * 22612753;
		anInt10290 = i_5_ * -1472442937;
	}

	Class522_Sub1(int i, int i_7_, int i_8_, int i_9_) {
		anInt10291 = i * -216782125;
		anInt10289 = i_7_ * 1151017105;
		anInt10288 = 22612753 * i_8_;
		anInt10290 = i_9_ * -1472442937;
	}

	void method15783(int i, int i_10_, int i_11_, int i_12_) {
		anInt10291 = i * -216782125;
		anInt10289 = i_10_ * 1151017105;
		anInt10288 = i_11_ * 22612753;
		anInt10290 = i_12_ * -1472442937;
	}

	public static void method15784(int i) {
		Class253.method4544(2019991621);
	}

	static void method15785(Class242 class242, Class250 class250, byte i) {
		if (null != class250) {
			if (-1 != class250.anInt2709 * 234012635) {
				Class250 class250_13_ = class242.method4366(class250.anInt2546 * 97896203, -1773101802);
				if (class250_13_ != null) {
					if (class250_13_.aClass250Array2519 == class250_13_.aClass250Array2535) {
						class250_13_.aClass250Array2519 = (new Class250[class250_13_.aClass250Array2535.length]);
						class250_13_.aClass250Array2519[class250_13_.aClass250Array2519.length - 1] = class250;
						Class698.method14052(class250_13_.aClass250Array2535, 0, class250_13_.aClass250Array2519, 0, class250.anInt2709 * 234012635);
						Class698.method14052(class250_13_.aClass250Array2535, 1 + (class250.anInt2709 * 234012635), class250_13_.aClass250Array2519, class250.anInt2709 * 234012635, ((class250_13_.aClass250Array2535).length - class250.anInt2709 * 234012635 - 1));
					} else {
						int i_14_ = 0;
						Class250[] class250s;
						for (class250s = class250_13_.aClass250Array2519; (i_14_ < class250s.length && class250 != class250s[i_14_]); i_14_++) {
							/* empty */
						}
						if (i_14_ < class250s.length) {
							Class698.method14052(class250s, i_14_ + 1, class250s, i_14_, class250s.length - i_14_ - 1);
							class250s[(class250_13_.aClass250Array2519.length - 1)] = class250;
						}
					}
				}
			} else {
				Class250[] class250s = class242.method4369(-57549096);
				int i_15_;
				for (i_15_ = 0; i_15_ < class250s.length && class250 != class250s[i_15_]; i_15_++) {
					/* empty */
				}
				if (i_15_ < class250s.length) {
					Class698.method14052(class250s, i_15_ + 1, class250s, i_15_, class250s.length - i_15_ - 1);
					class250s[class250s.length - 1] = class250;
				}
			}
		}
	}
}
