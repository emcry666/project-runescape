/* Class4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class4 implements Interface2 {
	Map aMap34;
	Interface54 anInterface54_35;

	public void method31(int i, long l) {
		if (null == aMap34) {
			aMap34 = new HashMap();
			aMap34.put(Integer.valueOf(i), new Class426(i, Long.valueOf(l)));
		} else {
			Class426 class426 = (Class426) aMap34.get(Integer.valueOf(i));
			if (null == class426)
				aMap34.put(Integer.valueOf(i), new Class426(i, Long.valueOf(l)));
			else
				class426.anObject4822 = Long.valueOf(l);
		}
	}

	public int method21(int i, int i_0_) {
		if (aMap34 != null) {
			Class426 class426 = (Class426) aMap34.get(Integer.valueOf(i));
			if (null != class426)
				return ((Integer) class426.anObject4822).intValue();
		}
		return ((Integer) anInterface54_35.method372(i, (byte) -88)).intValue();
	}

	public void method10(int i, int i_1_, byte i_2_) {
		if (null == aMap34) {
			aMap34 = new HashMap();
			aMap34.put(Integer.valueOf(i), new Class426(i, Integer.valueOf(i_1_)));
		} else {
			Class426 class426 = (Class426) aMap34.get(Integer.valueOf(i));
			if (class426 == null)
				aMap34.put(Integer.valueOf(i), new Class426(i, Integer.valueOf(i_1_)));
			else
				class426.anObject4822 = Integer.valueOf(i_1_);
		}
	}

	public long method24(int i, int i_3_) {
		if (null != aMap34) {
			Class426 class426 = (Class426) aMap34.get(Integer.valueOf(i));
			if (null != class426)
				return ((Long) class426.anObject4822).longValue();
		}
		return ((Long) anInterface54_35.method372(i, (byte) -98)).longValue();
	}

	public void method12(int i, long l) {
		if (null == aMap34) {
			aMap34 = new HashMap();
			aMap34.put(Integer.valueOf(i), new Class426(i, Long.valueOf(l)));
		} else {
			Class426 class426 = (Class426) aMap34.get(Integer.valueOf(i));
			if (null == class426)
				aMap34.put(Integer.valueOf(i), new Class426(i, Long.valueOf(l)));
			else
				class426.anObject4822 = Long.valueOf(l);
		}
	}

	public Object method13(int i, int i_4_) {
		if (aMap34 != null) {
			Class426 class426 = (Class426) aMap34.get(Integer.valueOf(i));
			if (null != class426)
				return class426.anObject4822;
		}
		return anInterface54_35.method372(i, (byte) -84);
	}

	public void method14(int i, Object object, int i_5_) {
		if (aMap34 == null) {
			aMap34 = new HashMap();
			aMap34.put(Integer.valueOf(i), new Class426(i, object));
		} else {
			Class426 class426 = (Class426) aMap34.get(Integer.valueOf(i));
			if (null == class426)
				aMap34.put(Integer.valueOf(i), new Class426(i, object));
			else
				class426.anObject4822 = object;
		}
	}

	public void method33() {
		if (aMap34 != null)
			aMap34.clear();
	}

	public void method16(int i, int i_6_) {
		if (aMap34 != null)
			aMap34.remove(Integer.valueOf(i));
	}

	public Iterator iterator() {
		if (aMap34 == null)
			return Collections.emptyList().iterator();
		return aMap34.values().iterator();
	}

	public void method32(int i, Object object) {
		if (aMap34 == null) {
			aMap34 = new HashMap();
			aMap34.put(Integer.valueOf(i), new Class426(i, object));
		} else {
			Class426 class426 = (Class426) aMap34.get(Integer.valueOf(i));
			if (null == class426)
				aMap34.put(Integer.valueOf(i), new Class426(i, object));
			else
				class426.anObject4822 = object;
		}
	}

	public int method17(int i) {
		if (aMap34 != null) {
			Class426 class426 = (Class426) aMap34.get(Integer.valueOf(i));
			if (null != class426)
				return ((Integer) class426.anObject4822).intValue();
		}
		return ((Integer) anInterface54_35.method372(i, (byte) -81)).intValue();
	}

	public void method18(int i, int i_7_) {
		if (null == aMap34) {
			aMap34 = new HashMap();
			aMap34.put(Integer.valueOf(i), new Class426(i, Integer.valueOf(i_7_)));
		} else {
			Class426 class426 = (Class426) aMap34.get(Integer.valueOf(i));
			if (class426 == null)
				aMap34.put(Integer.valueOf(i), new Class426(i, Integer.valueOf(i_7_)));
			else
				class426.anObject4822 = Integer.valueOf(i_7_);
		}
	}

	public void method20(int i) {
		if (aMap34 != null)
			aMap34.clear();
	}

	public long method25(int i) {
		if (null != aMap34) {
			Class426 class426 = (Class426) aMap34.get(Integer.valueOf(i));
			if (null != class426)
				return ((Long) class426.anObject4822).longValue();
		}
		return ((Long) anInterface54_35.method372(i, (byte) -50)).longValue();
	}

	public long method22(int i) {
		if (null != aMap34) {
			Class426 class426 = (Class426) aMap34.get(Integer.valueOf(i));
			if (null != class426)
				return ((Long) class426.anObject4822).longValue();
		}
		return ((Long) anInterface54_35.method372(i, (byte) -121)).longValue();
	}

	public Object method27(int i) {
		if (aMap34 != null) {
			Class426 class426 = (Class426) aMap34.get(Integer.valueOf(i));
			if (null != class426)
				return class426.anObject4822;
		}
		return anInterface54_35.method372(i, (byte) -51);
	}

	public void method23(int i, long l) {
		if (null == aMap34) {
			aMap34 = new HashMap();
			aMap34.put(Integer.valueOf(i), new Class426(i, Long.valueOf(l)));
		} else {
			Class426 class426 = (Class426) aMap34.get(Integer.valueOf(i));
			if (null == class426)
				aMap34.put(Integer.valueOf(i), new Class426(i, Long.valueOf(l)));
			else
				class426.anObject4822 = Long.valueOf(l);
		}
	}

	public void method28(int i, long l) {
		if (null == aMap34) {
			aMap34 = new HashMap();
			aMap34.put(Integer.valueOf(i), new Class426(i, Long.valueOf(l)));
		} else {
			Class426 class426 = (Class426) aMap34.get(Integer.valueOf(i));
			if (null == class426)
				aMap34.put(Integer.valueOf(i), new Class426(i, Long.valueOf(l)));
			else
				class426.anObject4822 = Long.valueOf(l);
		}
	}

	public void method34(int i) {
		if (aMap34 != null)
			aMap34.remove(Integer.valueOf(i));
	}

	public void method26(int i, long l) {
		if (null == aMap34) {
			aMap34 = new HashMap();
			aMap34.put(Integer.valueOf(i), new Class426(i, Long.valueOf(l)));
		} else {
			Class426 class426 = (Class426) aMap34.get(Integer.valueOf(i));
			if (null == class426)
				aMap34.put(Integer.valueOf(i), new Class426(i, Long.valueOf(l)));
			else
				class426.anObject4822 = Long.valueOf(l);
		}
	}

	public void method29(int i, Object object) {
		if (aMap34 == null) {
			aMap34 = new HashMap();
			aMap34.put(Integer.valueOf(i), new Class426(i, object));
		} else {
			Class426 class426 = (Class426) aMap34.get(Integer.valueOf(i));
			if (null == class426)
				aMap34.put(Integer.valueOf(i), new Class426(i, object));
			else
				class426.anObject4822 = object;
		}
	}

	public Object method9(int i) {
		if (aMap34 != null) {
			Class426 class426 = (Class426) aMap34.get(Integer.valueOf(i));
			if (null != class426)
				return class426.anObject4822;
		}
		return anInterface54_35.method372(i, (byte) -128);
	}

	public Class4(Interface54 interface54) {
		anInterface54_35 = interface54;
	}

	public void method11(int i, Object object) {
		if (aMap34 == null) {
			aMap34 = new HashMap();
			aMap34.put(Integer.valueOf(i), new Class426(i, object));
		} else {
			Class426 class426 = (Class426) aMap34.get(Integer.valueOf(i));
			if (null == class426)
				aMap34.put(Integer.valueOf(i), new Class426(i, object));
			else
				class426.anObject4822 = object;
		}
	}

	public void method19(int i, int i_8_) {
		if (null == aMap34) {
			aMap34 = new HashMap();
			aMap34.put(Integer.valueOf(i), new Class426(i, Integer.valueOf(i_8_)));
		} else {
			Class426 class426 = (Class426) aMap34.get(Integer.valueOf(i));
			if (class426 == null)
				aMap34.put(Integer.valueOf(i), new Class426(i, Integer.valueOf(i_8_)));
			else
				class426.anObject4822 = Integer.valueOf(i_8_);
		}
	}

	public long method30(int i) {
		if (null != aMap34) {
			Class426 class426 = (Class426) aMap34.get(Integer.valueOf(i));
			if (null != class426)
				return ((Long) class426.anObject4822).longValue();
		}
		return ((Long) anInterface54_35.method372(i, (byte) -52)).longValue();
	}

	public void method15(int i, Object object) {
		if (aMap34 == null) {
			aMap34 = new HashMap();
			aMap34.put(Integer.valueOf(i), new Class426(i, object));
		} else {
			Class426 class426 = (Class426) aMap34.get(Integer.valueOf(i));
			if (null == class426)
				aMap34.put(Integer.valueOf(i), new Class426(i, object));
			else
				class426.anObject4822 = object;
		}
	}

	public Iterator method520() {
		if (aMap34 == null)
			return Collections.emptyList().iterator();
		return aMap34.values().iterator();
	}

	public void method36(int i) {
		if (aMap34 != null)
			aMap34.remove(Integer.valueOf(i));
	}

	public void method35(int i) {
		if (aMap34 != null)
			aMap34.remove(Integer.valueOf(i));
	}

	static final void method521(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class76.anInt853 * 1662648339;
	}
}
