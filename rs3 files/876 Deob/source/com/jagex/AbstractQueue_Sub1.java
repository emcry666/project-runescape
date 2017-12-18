/* AbstractQueue_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AbstractQueue_Sub1 extends AbstractQueue {
	int anInt11877;
	Class398[] aClass398Array11878;
	int anInt11879 = 0;
	Comparator aComparator11880;
	Map aMap11881;

	public Object method18296() {
		if (0 == anInt11877 * -95472541)
			return null;
		anInt11879 += -1503616875;
		Object object = aClass398Array11878[0].anObject4062;
		aMap11881.remove(object);
		anInt11877 -= -280695477;
		if (0 == -95472541 * anInt11877)
			aClass398Array11878[anInt11877 * -95472541] = null;
		else {
			aClass398Array11878[0] = aClass398Array11878[-95472541 * anInt11877];
			aClass398Array11878[0].anInt4063 = 0;
			aClass398Array11878[-95472541 * anInt11877] = null;
			method18300(0, 882526081);
		}
		return object;
	}

	public AbstractQueue_Sub1(int i, Comparator comparator) {
		aClass398Array11878 = new Class398[i];
		aMap11881 = new HashMap();
		aComparator11880 = comparator;
	}

	void method18297(int i) {
		int i_0_ = (aClass398Array11878.length << 1) + 1;
		aClass398Array11878 = (Class398[]) Arrays.copyOf(aClass398Array11878, i_0_);
	}

	public int size() {
		return anInt11877 * -95472541;
	}

	public boolean offer(Object object) {
		if (aMap11881.containsKey(object))
			throw new IllegalArgumentException("");
		anInt11879 += -1503616875;
		int i = anInt11877 * -95472541;
		if (i >= aClass398Array11878.length)
			method18297(1954491298);
		anInt11877 += -280695477;
		if (i == 0) {
			aClass398Array11878[0] = new Class398(object, 0);
			aMap11881.put(object, aClass398Array11878[0]);
		} else {
			aClass398Array11878[i] = new Class398(object, i);
			aMap11881.put(object, aClass398Array11878[i]);
			method18299(i, 156999475);
		}
		return true;
	}

	public Object[] toArray() {
		Object[] objects = super.toArray();
		if (null != aComparator11880)
			Arrays.sort(objects, aComparator11880);
		else
			Arrays.sort(objects);
		return objects;
	}

	public Object poll() {
		if (0 == anInt11877 * -95472541)
			return null;
		anInt11879 += -1503616875;
		Object object = aClass398Array11878[0].anObject4062;
		aMap11881.remove(object);
		anInt11877 -= -280695477;
		if (0 == -95472541 * anInt11877)
			aClass398Array11878[anInt11877 * -95472541] = null;
		else {
			aClass398Array11878[0] = aClass398Array11878[-95472541 * anInt11877];
			aClass398Array11878[0].anInt4063 = 0;
			aClass398Array11878[-95472541 * anInt11877] = null;
			method18300(0, -1315989867);
		}
		return object;
	}

	void method18298() {
		int i = (aClass398Array11878.length << 1) + 1;
		aClass398Array11878 = (Class398[]) Arrays.copyOf(aClass398Array11878, i);
	}

	void method18299(int i, int i_1_) {
		Class398 class398 = aClass398Array11878[i];
		int i_2_;
		for (/**/; i > 0; i = i_2_) {
			i_2_ = i - 1 >>> 1;
			Class398 class398_3_ = aClass398Array11878[i_2_];
			if (aComparator11880 != null) {
				if (aComparator11880.compare(class398.anObject4062, class398_3_.anObject4062) >= 0)
					break;
			} else if (((Comparable) class398.anObject4062).compareTo(class398_3_.anObject4062) >= 0)
				break;
			aClass398Array11878[i] = class398_3_;
			aClass398Array11878[i].anInt4063 = 959445841 * i;
		}
		aClass398Array11878[i] = class398;
		aClass398Array11878[i].anInt4063 = i * 959445841;
	}

	void method18300(int i, int i_4_) {
		Class398 class398 = aClass398Array11878[i];
		int i_5_;
		for (int i_6_ = anInt11877 * -95472541 >>> 1; i < i_6_; i = i_5_) {
			int i_7_ = 1 + (i << 1);
			Class398 class398_8_ = aClass398Array11878[i_7_];
			int i_9_ = (i << 1) + 2;
			Class398 class398_10_ = aClass398Array11878[i_9_];
			if (null != aComparator11880) {
				if (i_9_ < anInt11877 * -95472541 && aComparator11880.compare(class398_8_.anObject4062, class398_10_.anObject4062) > 0)
					i_5_ = i_9_;
				else
					i_5_ = i_7_;
			} else if (i_9_ < -95472541 * anInt11877 && ((Comparable) class398_8_.anObject4062).compareTo(class398_10_.anObject4062) > 0)
				i_5_ = i_9_;
			else
				i_5_ = i_7_;
			if (aComparator11880 != null) {
				if (aComparator11880.compare(class398.anObject4062, (aClass398Array11878[i_5_].anObject4062)) <= 0)
					break;
			} else if (((Comparable) class398.anObject4062).compareTo(aClass398Array11878[i_5_].anObject4062) <= 0)
				break;
			aClass398Array11878[i] = aClass398Array11878[i_5_];
			aClass398Array11878[i].anInt4063 = 959445841 * i;
		}
		aClass398Array11878[i] = class398;
		aClass398Array11878[i].anInt4063 = i * 959445841;
	}

	public boolean method18301(Object object) {
		if (aMap11881.containsKey(object))
			throw new IllegalArgumentException("");
		anInt11879 += -1503616875;
		int i = anInt11877 * -95472541;
		if (i >= aClass398Array11878.length)
			method18297(965273094);
		anInt11877 += -280695477;
		if (i == 0) {
			aClass398Array11878[0] = new Class398(object, 0);
			aMap11881.put(object, aClass398Array11878[0]);
		} else {
			aClass398Array11878[i] = new Class398(object, i);
			aMap11881.put(object, aClass398Array11878[i]);
			method18299(i, 65795457);
		}
		return true;
	}

	void method18302(int i) {
		Class398 class398 = aClass398Array11878[i];
		int i_11_;
		for (int i_12_ = anInt11877 * -95472541 >>> 1; i < i_12_; i = i_11_) {
			int i_13_ = 1 + (i << 1);
			Class398 class398_14_ = aClass398Array11878[i_13_];
			int i_15_ = (i << 1) + 2;
			Class398 class398_16_ = aClass398Array11878[i_15_];
			if (null != aComparator11880) {
				if (i_15_ < anInt11877 * -95472541 && aComparator11880.compare(class398_14_.anObject4062, class398_16_.anObject4062) > 0)
					i_11_ = i_15_;
				else
					i_11_ = i_13_;
			} else if (i_15_ < -95472541 * anInt11877 && ((Comparable) class398_14_.anObject4062).compareTo(class398_16_.anObject4062) > 0)
				i_11_ = i_15_;
			else
				i_11_ = i_13_;
			if (aComparator11880 != null) {
				if (aComparator11880.compare(class398.anObject4062, (aClass398Array11878[i_11_].anObject4062)) <= 0)
					break;
			} else if (((Comparable) class398.anObject4062).compareTo(aClass398Array11878[i_11_].anObject4062) <= 0)
				break;
			aClass398Array11878[i] = aClass398Array11878[i_11_];
			aClass398Array11878[i].anInt4063 = 959445841 * i;
		}
		aClass398Array11878[i] = class398;
		aClass398Array11878[i].anInt4063 = i * 959445841;
	}

	public Iterator iterator() {
		return new Class383(this);
	}

	public Iterator method18303() {
		return new Class383(this);
	}

	void method18304() {
		int i = (aClass398Array11878.length << 1) + 1;
		aClass398Array11878 = (Class398[]) Arrays.copyOf(aClass398Array11878, i);
	}

	void method18305(int i) {
		Class398 class398 = aClass398Array11878[i];
		int i_17_;
		for (int i_18_ = anInt11877 * -95472541 >>> 1; i < i_18_; i = i_17_) {
			int i_19_ = 1 + (i << 1);
			Class398 class398_20_ = aClass398Array11878[i_19_];
			int i_21_ = (i << 1) + 2;
			Class398 class398_22_ = aClass398Array11878[i_21_];
			if (null != aComparator11880) {
				if (i_21_ < anInt11877 * -95472541 && aComparator11880.compare(class398_20_.anObject4062, class398_22_.anObject4062) > 0)
					i_17_ = i_21_;
				else
					i_17_ = i_19_;
			} else if (i_21_ < -95472541 * anInt11877 && ((Comparable) class398_20_.anObject4062).compareTo(class398_22_.anObject4062) > 0)
				i_17_ = i_21_;
			else
				i_17_ = i_19_;
			if (aComparator11880 != null) {
				if (aComparator11880.compare(class398.anObject4062, (aClass398Array11878[i_17_].anObject4062)) <= 0)
					break;
			} else if (((Comparable) class398.anObject4062).compareTo(aClass398Array11878[i_17_].anObject4062) <= 0)
				break;
			aClass398Array11878[i] = aClass398Array11878[i_17_];
			aClass398Array11878[i].anInt4063 = 959445841 * i;
		}
		aClass398Array11878[i] = class398;
		aClass398Array11878[i].anInt4063 = i * 959445841;
	}

	public int method18306() {
		return anInt11877 * -95472541;
	}

	public boolean method18307(Object object) {
		if (aMap11881.containsKey(object))
			throw new IllegalArgumentException("");
		anInt11879 += -1503616875;
		int i = anInt11877 * -95472541;
		if (i >= aClass398Array11878.length)
			method18297(-1182609663);
		anInt11877 += -280695477;
		if (i == 0) {
			aClass398Array11878[0] = new Class398(object, 0);
			aMap11881.put(object, aClass398Array11878[0]);
		} else {
			aClass398Array11878[i] = new Class398(object, i);
			aMap11881.put(object, aClass398Array11878[i]);
			method18299(i, 959002228);
		}
		return true;
	}

	public Object method18308() {
		if (0 == -95472541 * anInt11877)
			return null;
		return aClass398Array11878[0].anObject4062;
	}

	public boolean remove(Object object) {
		Class398 class398 = (Class398) aMap11881.remove(object);
		if (class398 == null)
			return false;
		anInt11879 += -1503616875;
		anInt11877 -= -280695477;
		if (-960090703 * class398.anInt4063 == anInt11877 * -95472541) {
			aClass398Array11878[-95472541 * anInt11877] = null;
			return true;
		}
		Class398 class398_23_ = aClass398Array11878[-95472541 * anInt11877];
		aClass398Array11878[-95472541 * anInt11877] = null;
		aClass398Array11878[-960090703 * class398.anInt4063] = class398_23_;
		aClass398Array11878[class398.anInt4063 * -960090703].anInt4063 = class398.anInt4063 * 1;
		method18300(-960090703 * class398.anInt4063, 677822574);
		if (aClass398Array11878[class398.anInt4063 * -960090703] == class398_23_)
			method18299(-960090703 * class398.anInt4063, 319992719);
		return true;
	}

	public boolean method18309(Object object) {
		Class398 class398 = (Class398) aMap11881.remove(object);
		if (class398 == null)
			return false;
		anInt11879 += -1503616875;
		anInt11877 -= -280695477;
		if (-960090703 * class398.anInt4063 == anInt11877 * -95472541) {
			aClass398Array11878[-95472541 * anInt11877] = null;
			return true;
		}
		Class398 class398_24_ = aClass398Array11878[-95472541 * anInt11877];
		aClass398Array11878[-95472541 * anInt11877] = null;
		aClass398Array11878[-960090703 * class398.anInt4063] = class398_24_;
		aClass398Array11878[class398.anInt4063 * -960090703].anInt4063 = class398.anInt4063 * 1;
		method18300(-960090703 * class398.anInt4063, -1217162694);
		if (aClass398Array11878[class398.anInt4063 * -960090703] == class398_24_)
			method18299(-960090703 * class398.anInt4063, 1514786096);
		return true;
	}

	public Object peek() {
		if (0 == -95472541 * anInt11877)
			return null;
		return aClass398Array11878[0].anObject4062;
	}

	public Object method18310() {
		if (0 == anInt11877 * -95472541)
			return null;
		anInt11879 += -1503616875;
		Object object = aClass398Array11878[0].anObject4062;
		aMap11881.remove(object);
		anInt11877 -= -280695477;
		if (0 == -95472541 * anInt11877)
			aClass398Array11878[anInt11877 * -95472541] = null;
		else {
			aClass398Array11878[0] = aClass398Array11878[-95472541 * anInt11877];
			aClass398Array11878[0].anInt4063 = 0;
			aClass398Array11878[-95472541 * anInt11877] = null;
			method18300(0, -836173757);
		}
		return object;
	}

	void method18311(int i) {
		Class398 class398 = aClass398Array11878[i];
		int i_25_;
		for (/**/; i > 0; i = i_25_) {
			i_25_ = i - 1 >>> 1;
			Class398 class398_26_ = aClass398Array11878[i_25_];
			if (aComparator11880 != null) {
				if (aComparator11880.compare(class398.anObject4062, class398_26_.anObject4062) >= 0)
					break;
			} else if (((Comparable) class398.anObject4062).compareTo(class398_26_.anObject4062) >= 0)
				break;
			aClass398Array11878[i] = class398_26_;
			aClass398Array11878[i].anInt4063 = 959445841 * i;
		}
		aClass398Array11878[i] = class398;
		aClass398Array11878[i].anInt4063 = i * 959445841;
	}

	void method18312(int i) {
		Class398 class398 = aClass398Array11878[i];
		int i_27_;
		for (/**/; i > 0; i = i_27_) {
			i_27_ = i - 1 >>> 1;
			Class398 class398_28_ = aClass398Array11878[i_27_];
			if (aComparator11880 != null) {
				if (aComparator11880.compare(class398.anObject4062, class398_28_.anObject4062) >= 0)
					break;
			} else if (((Comparable) class398.anObject4062).compareTo(class398_28_.anObject4062) >= 0)
				break;
			aClass398Array11878[i] = class398_28_;
			aClass398Array11878[i].anInt4063 = 959445841 * i;
		}
		aClass398Array11878[i] = class398;
		aClass398Array11878[i].anInt4063 = i * 959445841;
	}

	public Object method18313() {
		if (0 == anInt11877 * -95472541)
			return null;
		anInt11879 += -1503616875;
		Object object = aClass398Array11878[0].anObject4062;
		aMap11881.remove(object);
		anInt11877 -= -280695477;
		if (0 == -95472541 * anInt11877)
			aClass398Array11878[anInt11877 * -95472541] = null;
		else {
			aClass398Array11878[0] = aClass398Array11878[-95472541 * anInt11877];
			aClass398Array11878[0].anInt4063 = 0;
			aClass398Array11878[-95472541 * anInt11877] = null;
			method18300(0, 2033725419);
		}
		return object;
	}

	public boolean method18314(Object object) {
		return aMap11881.containsKey(object);
	}

	void method18315(int i) {
		Class398 class398 = aClass398Array11878[i];
		int i_29_;
		for (int i_30_ = anInt11877 * -95472541 >>> 1; i < i_30_; i = i_29_) {
			int i_31_ = 1 + (i << 1);
			Class398 class398_32_ = aClass398Array11878[i_31_];
			int i_33_ = (i << 1) + 2;
			Class398 class398_34_ = aClass398Array11878[i_33_];
			if (null != aComparator11880) {
				if (i_33_ < anInt11877 * -95472541 && aComparator11880.compare(class398_32_.anObject4062, class398_34_.anObject4062) > 0)
					i_29_ = i_33_;
				else
					i_29_ = i_31_;
			} else if (i_33_ < -95472541 * anInt11877 && ((Comparable) class398_32_.anObject4062).compareTo(class398_34_.anObject4062) > 0)
				i_29_ = i_33_;
			else
				i_29_ = i_31_;
			if (aComparator11880 != null) {
				if (aComparator11880.compare(class398.anObject4062, (aClass398Array11878[i_29_].anObject4062)) <= 0)
					break;
			} else if (((Comparable) class398.anObject4062).compareTo(aClass398Array11878[i_29_].anObject4062) <= 0)
				break;
			aClass398Array11878[i] = aClass398Array11878[i_29_];
			aClass398Array11878[i].anInt4063 = 959445841 * i;
		}
		aClass398Array11878[i] = class398;
		aClass398Array11878[i].anInt4063 = i * 959445841;
	}

	public boolean method18316(Object object) {
		return aMap11881.containsKey(object);
	}

	public boolean method18317(Object object) {
		return aMap11881.containsKey(object);
	}

	public AbstractQueue_Sub1(int i) {
		this(i, null);
	}

	public Object[] method18318() {
		Object[] objects = super.toArray();
		if (null != aComparator11880)
			Arrays.sort(objects, aComparator11880);
		else
			Arrays.sort(objects);
		return objects;
	}

	public boolean contains(Object object) {
		return aMap11881.containsKey(object);
	}

	public Object[] method18319() {
		Object[] objects = super.toArray();
		if (null != aComparator11880)
			Arrays.sort(objects, aComparator11880);
		else
			Arrays.sort(objects);
		return objects;
	}

	public boolean method18320(Object object) {
		Class398 class398 = (Class398) aMap11881.remove(object);
		if (class398 == null)
			return false;
		anInt11879 += -1503616875;
		anInt11877 -= -280695477;
		if (-960090703 * class398.anInt4063 == anInt11877 * -95472541) {
			aClass398Array11878[-95472541 * anInt11877] = null;
			return true;
		}
		Class398 class398_35_ = aClass398Array11878[-95472541 * anInt11877];
		aClass398Array11878[-95472541 * anInt11877] = null;
		aClass398Array11878[-960090703 * class398.anInt4063] = class398_35_;
		aClass398Array11878[class398.anInt4063 * -960090703].anInt4063 = class398.anInt4063 * 1;
		method18300(-960090703 * class398.anInt4063, -1549544294);
		if (aClass398Array11878[class398.anInt4063 * -960090703] == class398_35_)
			method18299(-960090703 * class398.anInt4063, 2106447914);
		return true;
	}

	public boolean method18321(Object object) {
		Class398 class398 = (Class398) aMap11881.remove(object);
		if (class398 == null)
			return false;
		anInt11879 += -1503616875;
		anInt11877 -= -280695477;
		if (-960090703 * class398.anInt4063 == anInt11877 * -95472541) {
			aClass398Array11878[-95472541 * anInt11877] = null;
			return true;
		}
		Class398 class398_36_ = aClass398Array11878[-95472541 * anInt11877];
		aClass398Array11878[-95472541 * anInt11877] = null;
		aClass398Array11878[-960090703 * class398.anInt4063] = class398_36_;
		aClass398Array11878[class398.anInt4063 * -960090703].anInt4063 = class398.anInt4063 * 1;
		method18300(-960090703 * class398.anInt4063, 175404885);
		if (aClass398Array11878[class398.anInt4063 * -960090703] == class398_36_)
			method18299(-960090703 * class398.anInt4063, 1572580638);
		return true;
	}
}
