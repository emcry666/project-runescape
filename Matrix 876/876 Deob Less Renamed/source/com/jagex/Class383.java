/* Class383 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Class383 implements Iterator {
	int anInt3964;
	int anInt3965 = 0;
	AbstractQueue_Sub1 anAbstractQueue_Sub1_3966;

	public boolean method6416() {
		return (-2038463183 * anInt3965 < anAbstractQueue_Sub1_3966.anInt11877 * -95472541);
	}

	public boolean method6417() {
		return (-2038463183 * anInt3965 < anAbstractQueue_Sub1_3966.anInt11877 * -95472541);
	}

	public Object next() {
		if (-1781716291 * anAbstractQueue_Sub1_3966.anInt11879 != -1379004817 * anInt3964)
			throw new ConcurrentModificationException();
		if (anInt3965 * -2038463183 < anAbstractQueue_Sub1_3966.anInt11877 * -95472541) {
			Object object = (anAbstractQueue_Sub1_3966.aClass398Array11878[anInt3965 * -2038463183].anObject4062);
			anInt3965 += -1355566127;
			return object;
		}
		throw new NoSuchElementException();
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public boolean method6418() {
		return (-2038463183 * anInt3965 < anAbstractQueue_Sub1_3966.anInt11877 * -95472541);
	}

	public boolean hasNext() {
		return (-2038463183 * anInt3965 < anAbstractQueue_Sub1_3966.anInt11877 * -95472541);
	}

	public boolean method6419() {
		return (-2038463183 * anInt3965 < anAbstractQueue_Sub1_3966.anInt11877 * -95472541);
	}

	Class383(AbstractQueue_Sub1 abstractqueue_sub1) {
		anInt3964 = -72110189 * anAbstractQueue_Sub1_3966.anInt11879;
		anAbstractQueue_Sub1_3966 = abstractqueue_sub1;
	}

	public Object method6420() {
		if (-1781716291 * anAbstractQueue_Sub1_3966.anInt11879 != -1379004817 * anInt3964)
			throw new ConcurrentModificationException();
		if (anInt3965 * -2038463183 < anAbstractQueue_Sub1_3966.anInt11877 * -95472541) {
			Object object = (anAbstractQueue_Sub1_3966.aClass398Array11878[anInt3965 * -2038463183].anObject4062);
			anInt3965 += -1355566127;
			return object;
		}
		throw new NoSuchElementException();
	}

	public void method6421() {
		throw new UnsupportedOperationException();
	}

	public void method6422() {
		throw new UnsupportedOperationException();
	}

	static void method6423(Class242 class242, Class250 class250, int i) {
		if (class250 != null) {
			if (-1 != class250.anInt2709 * 234012635) {
				Class250 class250_0_ = (class242.aClass250Array2457[97896203 * class250.anInt2546 & 0xffff]);
				if (class250_0_ != null) {
					if (class250_0_.aClass250Array2519 == class250_0_.aClass250Array2535) {
						class250_0_.aClass250Array2519 = (new Class250[class250_0_.aClass250Array2535.length]);
						class250_0_.aClass250Array2519[0] = class250;
						Class698.method14052(class250_0_.aClass250Array2535, 0, class250_0_.aClass250Array2519, 1, 234012635 * class250.anInt2709);
						Class698.method14052(class250_0_.aClass250Array2535, 1 + 234012635 * class250.anInt2709, class250_0_.aClass250Array2519, 234012635 * class250.anInt2709 + 1, (class250_0_.aClass250Array2535.length - class250.anInt2709 * 234012635 - 1));
					} else {
						int i_1_ = 0;
						Class250[] class250s;
						for (class250s = class250_0_.aClass250Array2519; (i_1_ < class250s.length && class250 != class250s[i_1_]); i_1_++) {
							/* empty */
						}
						if (i_1_ < class250s.length) {
							Class698.method14052(class250s, 0, class250s, 1, i_1_);
							class250s[0] = class250;
						}
					}
				}
			} else {
				Class250[] class250s = class242.method4369(1053820722);
				int i_2_;
				for (i_2_ = 0; i_2_ < class250s.length && class250s[i_2_] != class250; i_2_++) {
					/* empty */
				}
				if (i_2_ < class250s.length) {
					Class698.method14052(class250s, 0, class250s, 1, i_2_);
					class250s[0] = class250;
				}
			}
		}
	}

	static final void method6424(Class669 class669, byte i) {
		int i_3_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (int) (Math.random() * (double) i_3_);
	}
}
