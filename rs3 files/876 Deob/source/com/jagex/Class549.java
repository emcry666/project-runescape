/* Class549 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Class549 {
	boolean aBool7323;
	int anInt7324;
	int anInt7325;
	public List aList7326 = new LinkedList();

	Class549(boolean bool) {
		aBool7323 = false;
		anInt7325 = 0;
		anInt7324 = 0;
		aBool7323 = bool;
	}

	public void method9100(int i) {
		Iterator iterator = aList7326.iterator();
		while (iterator.hasNext()) {
			Class559 class559 = (Class559) iterator.next();
			iterator.remove();
			Class478.method7893(class559, 1801998612);
		}
	}

	void method9101(Class559 class559, int i) {
		Class647_Sub1 class647_sub1 = class559.aClass647_Sub1_7492;
		boolean bool = true;
		Class180[] class180s = class559.aClass647_Sub1_7492.aClass180Array10823;
		for (int i_0_ = 0; i_0_ < class180s.length; i_0_++) {
			if (class180s[i_0_].aBool2000) {
				bool = false;
				break;
			}
		}
		if (!bool) {
			class559.aClass549_7494 = this;
			if (aBool7323) {
				Iterator iterator = aList7326.iterator();
				while (iterator.hasNext()) {
					Class559 class559_1_ = (Class559) iterator.next();
					if (class559_1_.aClass647_Sub1_7492 == class647_sub1) {
						iterator.remove();
						Class478.method7893(class559_1_, -941406525);
					}
				}
			}
			ListIterator listiterator = aList7326.listIterator();
			while (listiterator.hasNext()) {
				Class559 class559_2_ = (Class559) listiterator.next();
				if (-1529775437 * class647_sub1.anInt10820 >= (class559_2_.aClass647_Sub1_7492.anInt10820 * -1529775437)) {
					listiterator.previous();
					listiterator.add(class559);
					return;
				}
			}
			aList7326.add(class559);
		}
	}

	public void method9102() {
		Iterator iterator = aList7326.iterator();
		while (iterator.hasNext()) {
			Class559 class559 = (Class559) iterator.next();
			iterator.remove();
			Class478.method7893(class559, 1625308785);
		}
	}

	public void method9103() {
		Iterator iterator = aList7326.iterator();
		while (iterator.hasNext()) {
			Class559 class559 = (Class559) iterator.next();
			iterator.remove();
			Class478.method7893(class559, 1490172351);
		}
	}

	static final void method9104(Class669 class669, int i) {
		int i_3_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_3_, -670239934);
		Class242 class242 = Class31.aClass242Array302[i_3_ >> 16];
		Class512.method8577(class250, class242, class669, 1448984608);
	}

	static final void method9105(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class49.method1277(class250, class242, class669, 2056767653);
	}

	static final void method9106(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = client.aBool11157 ? 1 : 0;
	}

	static boolean method9107(int i, byte i_4_) {
		if (i == 9 || i == 10 || 11 == i || 12 == i || 13 == i || 1003 == i)
			return true;
		if (8 == i)
			return true;
		return false;
	}
}
