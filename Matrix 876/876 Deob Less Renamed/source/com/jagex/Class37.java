/* Class37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Class37 implements Interface13, Interface6 {
	Map aMap366;
	public Class464 aClass464_367;
	int anInt368;
	int anInt369;
	String aString370 = "null";
	Object[] anObjectArray371;
	HashMap aHashMap372;
	public Class464 aClass464_373;

	public void method76(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(912156902);
			if (0 == i)
				break;
			method1095(class523_sub34, i, -1068038200);
		}
	}

	public void method80(Class523_Sub34 class523_sub34, int i) {
		for (;;) {
			int i_0_ = class523_sub34.readUnsignedByte(-1584094053);
			if (0 == i_0_)
				break;
			method1095(class523_sub34, i_0_, -84367723);
		}
	}

	public int method1087(int i) {
		Object object = method1090(i, 1620110289);
		if (object == null)
			return 427065995 * anInt369;
		return ((Integer) object).intValue();
	}

	public int method1088(int i, int i_1_) {
		Object object = method1090(i, 1001605790);
		if (object == null)
			return 427065995 * anInt369;
		return ((Integer) object).intValue();
	}

	public String method1089(int i, int i_2_) {
		Object object = method1090(i, 731592856);
		if (null == object)
			return aString370;
		return (String) object;
	}

	Object method1090(int i, int i_3_) {
		if (null != anObjectArray371) {
			if (i < 0 || i >= anObjectArray371.length)
				return null;
			return anObjectArray371[i];
		}
		if (aMap366 != null)
			return aMap366.get(new Integer(i));
		return null;
	}

	public void method73() {
		/* empty */
	}

	public int[] method1091(Object object, byte i) {
		if (anInt368 * -1848052353 == 0)
			return null;
		if (null == aHashMap372)
			method1093(-826451194);
		return (int[]) aHashMap372.get(object);
	}

	public boolean method1092(Object object, byte i) {
		if (0 == anInt368 * -1848052353)
			return false;
		if (null == aHashMap372)
			method1093(-826451194);
		return aHashMap372.containsKey(object);
	}

	void method1093(int i) {
		HashMap hashmap = new HashMap();
		if (anObjectArray371 != null) {
			for (int i_4_ = 0; i_4_ < anObjectArray371.length; i_4_++) {
				if (null != anObjectArray371[i_4_]) {
					Object object = anObjectArray371[i_4_];
					List list = (List) hashmap.get(object);
					if (null == list) {
						list = new LinkedList();
						hashmap.put(object, list);
					}
					list.add(new Integer(i_4_));
				}
			}
		} else if (null != aMap366) {
			Iterator iterator = aMap366.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry entry = (Map.Entry) iterator.next();
				Object object = entry.getValue();
				List list = (List) hashmap.get(object);
				if (null == list) {
					list = new LinkedList();
					hashmap.put(object, list);
				}
				list.add(entry.getKey());
			}
		} else
			throw new IllegalStateException();
		aHashMap372 = new HashMap();
		Iterator iterator = hashmap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			List list = (List) entry.getValue();
			int[] is = new int[list.size()];
			int i_5_ = 0;
			Iterator iterator_6_ = list.iterator();
			while (iterator_6_.hasNext()) {
				Integer integer = (Integer) iterator_6_.next();
				is[i_5_++] = integer.intValue();
			}
			if (null == anObjectArray371)
				Arrays.sort(is);
			aHashMap372.put(entry.getKey(), is);
		}
	}

	public void method74(byte i) {
		/* empty */
	}

	public void method52(int i, byte i_7_) {
		/* empty */
	}

	public void method75(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(1930292228);
			if (0 == i)
				break;
			method1095(class523_sub34, i, -1969840011);
		}
	}

	public void method79() {
		/* empty */
	}

	Object method1094(int i) {
		if (null != anObjectArray371) {
			if (i < 0 || i >= anObjectArray371.length)
				return null;
			return anObjectArray371[i];
		}
		if (aMap366 != null)
			return aMap366.get(new Integer(i));
		return null;
	}

	public void method63(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(596879753);
			if (0 == i)
				break;
			method1095(class523_sub34, i, -844133915);
		}
	}

	public void method60(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-860030354);
			if (0 == i)
				break;
			method1095(class523_sub34, i, -323619584);
		}
	}

	public void method58(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-804173450);
			if (0 == i)
				break;
			method1095(class523_sub34, i, -1220891797);
		}
	}

	public void method78() {
		/* empty */
	}

	void method1095(Class523_Sub34 class523_sub34, int i, int i_8_) {
		if (i == 1) {
			char c = Class676.method13768(class523_sub34.readByte((short) -22120), (byte) -7);
			aClass464_373 = Class464.method7533(c, 1954427445);
		} else if (2 == i) {
			char c = Class676.method13768(class523_sub34.readByte((short) -12416), (byte) -49);
			aClass464_367 = Class464.method7533(c, 2005361087);
		} else if (i == 3)
			aString370 = class523_sub34.readString(-388253003);
		else if (4 == i)
			anInt369 = class523_sub34.readUnsignedInt((byte) -108) * -93432541;
		else if (5 == i || 6 == i) {
			anInt368 = class523_sub34.readUnsignedShort(-1924427102) * -262616449;
			aMap366 = new HashMap(-1848052353 * anInt368);
			for (int i_9_ = 0; i_9_ < -1848052353 * anInt368; i_9_++) {
				int i_10_ = class523_sub34.readUnsignedInt((byte) -114);
				java.io.Serializable serializable;
				if (i == 5)
					serializable = class523_sub34.readString(-444924792);
				else
					serializable = new Integer(class523_sub34.readUnsignedInt((byte) -113));
				aMap366.put(new Integer(i_10_), serializable);
			}
		} else if (i == 7 || i == 8) {
			int i_11_ = class523_sub34.readUnsignedShort(-1444659888);
			anInt368 = class523_sub34.readUnsignedShort(-814444122) * -262616449;
			anObjectArray371 = new Object[i_11_];
			for (int i_12_ = 0; i_12_ < -1848052353 * anInt368; i_12_++) {
				int i_13_ = class523_sub34.readUnsignedShort(-924410886);
				if (7 == i)
					anObjectArray371[i_13_] = class523_sub34.readString(-1273032422);
				else
					anObjectArray371[i_13_] = new Integer(class523_sub34.readUnsignedInt((byte) -56));
			}
		} else if (i == 101)
			aClass464_373 = ((Class464) Class334.method5910(Class464.method7532((byte) -10), class523_sub34.readUnsignedSmart(368514876), -1406934450));
		else if (102 == i)
			aClass464_367 = ((Class464) Class334.method5910(Class464.method7532((byte) -19), class523_sub34.readUnsignedSmart(368514876), -1199906477));
	}

	Class37() {
		anInt368 = 0;
	}

	public int method1096(int i) {
		return -1848052353 * anInt368;
	}

	public void method51(int i) {
		/* empty */
	}

	public void method77() {
		/* empty */
	}

	public int method1097(int i) {
		Object object = method1090(i, 1478828048);
		if (object == null)
			return 427065995 * anInt369;
		return ((Integer) object).intValue();
	}

	Object method1098(int i) {
		if (null != anObjectArray371) {
			if (i < 0 || i >= anObjectArray371.length)
				return null;
			return anObjectArray371[i];
		}
		if (aMap366 != null)
			return aMap366.get(new Integer(i));
		return null;
	}

	Object method1099(int i) {
		if (null != anObjectArray371) {
			if (i < 0 || i >= anObjectArray371.length)
				return null;
			return anObjectArray371[i];
		}
		if (aMap366 != null)
			return aMap366.get(new Integer(i));
		return null;
	}

	void method1100() {
		HashMap hashmap = new HashMap();
		if (anObjectArray371 != null) {
			for (int i = 0; i < anObjectArray371.length; i++) {
				if (null != anObjectArray371[i]) {
					Object object = anObjectArray371[i];
					List list = (List) hashmap.get(object);
					if (null == list) {
						list = new LinkedList();
						hashmap.put(object, list);
					}
					list.add(new Integer(i));
				}
			}
		} else if (null != aMap366) {
			Iterator iterator = aMap366.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry entry = (Map.Entry) iterator.next();
				Object object = entry.getValue();
				List list = (List) hashmap.get(object);
				if (null == list) {
					list = new LinkedList();
					hashmap.put(object, list);
				}
				list.add(entry.getKey());
			}
		} else
			throw new IllegalStateException();
		aHashMap372 = new HashMap();
		Iterator iterator = hashmap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			List list = (List) entry.getValue();
			int[] is = new int[list.size()];
			int i = 0;
			Iterator iterator_14_ = list.iterator();
			while (iterator_14_.hasNext()) {
				Integer integer = (Integer) iterator_14_.next();
				is[i++] = integer.intValue();
			}
			if (null == anObjectArray371)
				Arrays.sort(is);
			aHashMap372.put(entry.getKey(), is);
		}
	}

	public void method62(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-868729809);
			if (0 == i)
				break;
			method1095(class523_sub34, i, 978798600);
		}
	}

	public int method1101() {
		return -1848052353 * anInt368;
	}

	public int method1102() {
		return -1848052353 * anInt368;
	}

	void method1103() {
		HashMap hashmap = new HashMap();
		if (anObjectArray371 != null) {
			for (int i = 0; i < anObjectArray371.length; i++) {
				if (null != anObjectArray371[i]) {
					Object object = anObjectArray371[i];
					List list = (List) hashmap.get(object);
					if (null == list) {
						list = new LinkedList();
						hashmap.put(object, list);
					}
					list.add(new Integer(i));
				}
			}
		} else if (null != aMap366) {
			Iterator iterator = aMap366.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry entry = (Map.Entry) iterator.next();
				Object object = entry.getValue();
				List list = (List) hashmap.get(object);
				if (null == list) {
					list = new LinkedList();
					hashmap.put(object, list);
				}
				list.add(entry.getKey());
			}
		} else
			throw new IllegalStateException();
		aHashMap372 = new HashMap();
		Iterator iterator = hashmap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			List list = (List) entry.getValue();
			int[] is = new int[list.size()];
			int i = 0;
			Iterator iterator_15_ = list.iterator();
			while (iterator_15_.hasNext()) {
				Integer integer = (Integer) iterator_15_.next();
				is[i++] = integer.intValue();
			}
			if (null == anObjectArray371)
				Arrays.sort(is);
			aHashMap372.put(entry.getKey(), is);
		}
	}

	void method1104() {
		HashMap hashmap = new HashMap();
		if (anObjectArray371 != null) {
			for (int i = 0; i < anObjectArray371.length; i++) {
				if (null != anObjectArray371[i]) {
					Object object = anObjectArray371[i];
					List list = (List) hashmap.get(object);
					if (null == list) {
						list = new LinkedList();
						hashmap.put(object, list);
					}
					list.add(new Integer(i));
				}
			}
		} else if (null != aMap366) {
			Iterator iterator = aMap366.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry entry = (Map.Entry) iterator.next();
				Object object = entry.getValue();
				List list = (List) hashmap.get(object);
				if (null == list) {
					list = new LinkedList();
					hashmap.put(object, list);
				}
				list.add(entry.getKey());
			}
		} else
			throw new IllegalStateException();
		aHashMap372 = new HashMap();
		Iterator iterator = hashmap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			List list = (List) entry.getValue();
			int[] is = new int[list.size()];
			int i = 0;
			Iterator iterator_16_ = list.iterator();
			while (iterator_16_.hasNext()) {
				Integer integer = (Integer) iterator_16_.next();
				is[i++] = integer.intValue();
			}
			if (null == anObjectArray371)
				Arrays.sort(is);
			aHashMap372.put(entry.getKey(), is);
		}
	}

	Object method1105(int i) {
		if (null != anObjectArray371) {
			if (i < 0 || i >= anObjectArray371.length)
				return null;
			return anObjectArray371[i];
		}
		if (aMap366 != null)
			return aMap366.get(new Integer(i));
		return null;
	}

	static final void method1106(Class669 class669, int i) {
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = Class461.aClass218_5122.method3968(1770019369);
	}

	static final void method1107(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class520.method8643(class250, class669, -727234176);
	}
}
