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

public class ClientScriptDefinitions implements Interface13, Interface6 {
	Map aMap366;
	public Class464 valueType;
	int count;
	int defaultIntValue;
	String defaultStringValue = "null";
	Object[] values;
	HashMap aHashMap372;
	public Class464 keyType;

	public void readValues(RSBuffer buffer, int i) {
		for (;;) {
			int opcode = buffer.readUnsignedByte(-1584094053);
			if (0 == opcode)
				break;
			decode(buffer, opcode, -84367723);
		}
	}

	public int getIntValue(int i, int i_1_) {
		Object object = getCSValues(i, 1001605790);
		if (object == null)
			return 427065995 * defaultIntValue;
		return ((Integer) object).intValue();
	}

	public String getStringValue(int i, int i_2_) {
		Object object = getCSValues(i, 731592856);
		if (null == object)
			return defaultStringValue;
		return (String) object;
	}

	Object getCSValues(int i, int i_3_) {
		if (null != values) {
			if (i < 0 || i >= values.length)
				return null;
			return values[i];
		}
		if (aMap366 != null)
			return aMap366.get(new Integer(i));
		return null;
	}

	public void method73() {
		/* empty */
	}

	public int[] method1091(Object object, byte i) {
		if (count * -1848052353 == 0)
			return null;
		if (null == aHashMap372)
			create(-826451194);
		return (int[]) aHashMap372.get(object);
	}

	public boolean method1092(Object object, byte i) {
		if (0 == count * -1848052353)
			return false;
		if (null == aHashMap372)
			create(-826451194);
		return aHashMap372.containsKey(object);
	}

	void create(int i) {
		HashMap hashmap = new HashMap();
		if (values != null) {
			for (int index = 0; index < values.length; index++) {
				if (null != values[index]) {
					Object object = values[index];
					List list = (List) hashmap.get(object);
					if (null == list) {
						list = new LinkedList();
						hashmap.put(object, list);
					}
					list.add(new Integer(index));
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
			if (null == values)
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

	public void method79() {
		/* empty */
	}

	Object method1094(int i) {
		if (null != values) {
			if (i < 0 || i >= values.length)
				return null;
			return values[i];
		}
		if (aMap366 != null)
			return aMap366.get(new Integer(i));
		return null;
	}

	public void method78() {
		/* empty */
	}

	void decode(RSBuffer buffer, int opcode, int i_8_) {
		if (opcode == 1) {
			char c = Class676.method13768(buffer.readByte((short) -22120), (byte) -7);
			keyType = Class464.method7533(c, 1954427445);
		} else if (2 == opcode) {
			char c = Class676.method13768(buffer.readByte((short) -12416), (byte) -49);
			valueType = Class464.method7533(c, 2005361087);
		} else if (opcode == 3)
			defaultStringValue = buffer.readString(-388253003);
		else if (4 == opcode)
			defaultIntValue = buffer.readUnsignedInt((byte) -108) * -93432541;
		else if (5 == opcode || 6 == opcode) {
			count = buffer.readUnsignedShort(-1924427102) * -262616449;
			aMap366 = new HashMap(-1848052353 * count);
			for (int index = 0; index < -1848052353 * count; index++) {
				int i_10_ = buffer.readUnsignedInt((byte) -114);
				java.io.Serializable serializable;
				if (opcode == 5)
					serializable = buffer.readString(-444924792);
				else
					serializable = new Integer(buffer.readUnsignedInt((byte) -113));
				aMap366.put(new Integer(i_10_), serializable);
			}
		} else if (opcode == 7 || opcode == 8) {
			int i_11_ = buffer.readUnsignedShort(-1444659888);
			count = buffer.readUnsignedShort(-814444122) * -262616449;
			values = new Object[i_11_];
			for (int i_12_ = 0; i_12_ < -1848052353 * count; i_12_++) {
				int i_13_ = buffer.readUnsignedShort(-924410886);
				if (7 == opcode)
					values[i_13_] = buffer.readString(-1273032422);
				else
					values[i_13_] = new Integer(buffer.readUnsignedInt((byte) -56));
			}
		} else if (opcode == 101)
			keyType = ((Class464) Class334.method5910(Class464.method7532((byte) -10), buffer.readUnsignedSmart(368514876), -1406934450));
		else if (102 == opcode)
			valueType = ((Class464) Class334.method5910(Class464.method7532((byte) -19), buffer.readUnsignedSmart(368514876), -1199906477));
	}

	ClientScriptDefinitions() {
		count = 0;
	}

	public int method1096(int i) {
		return -1848052353 * count;
	}

	static final void method1106(Class669 class669, int i) {
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = Class461.aClass218_5122.method3968(1770019369);
	}

	static final void method1107(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class520.method8643(class250, class669, -727234176);
	}
}
