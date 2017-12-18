/* Class369 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class369 {
	Map aMap3882 = new HashMap();
	Class375 aClass375_3883;
	static int anInt3884;

	public void method6331() {
		Iterator iterator = aMap3882.values().iterator();
		while (iterator.hasNext()) {
			Class366 class366 = (Class366) iterator.next();
			class366.method6303((byte) -31);
		}
	}

	public Class366 method6332(int i, int i_0_, float f, Interface44 interface44) {
		if (method6333(i, -2030527882) != null)
			return null;
		Class366 class366 = null;
		if (-1 != i_0_)
			class366 = method6333(i_0_, 438786910);
		Object object = aClass375_3883.method6356(class366, -1861725895);
		Class366 class366_1_ = new Class366(i, f, object, this, interface44, class366);
		aMap3882.put(Integer.valueOf(i), class366_1_);
		return class366_1_;
	}

	public Class366 method6333(int i, int i_2_) {
		return (Class366) aMap3882.get(Integer.valueOf(i));
	}

	public void method6334(int i) {
		Iterator iterator = aMap3882.values().iterator();
		while (iterator.hasNext()) {
			Class366 class366 = (Class366) iterator.next();
			class366.method6303((byte) -54);
		}
	}

	public void method6335() {
		Iterator iterator = aMap3882.values().iterator();
		while (iterator.hasNext()) {
			Class366 class366 = (Class366) iterator.next();
			class366.method6303((byte) -62);
		}
	}

	public Class366 method6336(int i, int i_3_, float f, Interface44 interface44, int i_4_) {
		if (method6333(i, -2130801427) != null)
			return null;
		Class366 class366 = null;
		if (-1 != i_3_)
			class366 = method6333(i_3_, 2119343420);
		Object object = aClass375_3883.method6356(class366, -1811965661);
		Class366 class366_5_ = new Class366(i, f, object, this, interface44, class366);
		aMap3882.put(Integer.valueOf(i), class366_5_);
		return class366_5_;
	}

	public Class366 method6337(int i, int i_6_, float f, Interface44 interface44) {
		if (method6333(i, 1278623007) != null)
			return null;
		Class366 class366 = null;
		if (-1 != i_6_)
			class366 = method6333(i_6_, 869912027);
		Object object = aClass375_3883.method6356(class366, -1780574849);
		Class366 class366_7_ = new Class366(i, f, object, this, interface44, class366);
		aMap3882.put(Integer.valueOf(i), class366_7_);
		return class366_7_;
	}

	public Class369(Class375 class375) {
		aClass375_3883 = class375;
	}

	public Class366 method6338(int i, int i_8_, float f, Interface44 interface44) {
		if (method6333(i, 1499253640) != null)
			return null;
		Class366 class366 = null;
		if (-1 != i_8_)
			class366 = method6333(i_8_, -25563615);
		Object object = aClass375_3883.method6356(class366, -2142746385);
		Class366 class366_9_ = new Class366(i, f, object, this, interface44, class366);
		aMap3882.put(Integer.valueOf(i), class366_9_);
		return class366_9_;
	}

	public Class366 method6339(int i, int i_10_, float f, Interface44 interface44) {
		if (method6333(i, 2115471599) != null)
			return null;
		Class366 class366 = null;
		if (-1 != i_10_)
			class366 = method6333(i_10_, 1044726928);
		Object object = aClass375_3883.method6356(class366, -1842715804);
		Class366 class366_11_ = new Class366(i, f, object, this, interface44, class366);
		aMap3882.put(Integer.valueOf(i), class366_11_);
		return class366_11_;
	}

	public Class366 method6340(int i, int i_12_, float f, Interface44 interface44) {
		if (method6333(i, 1365252252) != null)
			return null;
		Class366 class366 = null;
		if (-1 != i_12_)
			class366 = method6333(i_12_, 1391355633);
		Object object = aClass375_3883.method6356(class366, -1789968098);
		Class366 class366_13_ = new Class366(i, f, object, this, interface44, class366);
		aMap3882.put(Integer.valueOf(i), class366_13_);
		return class366_13_;
	}

	public Class366 method6341(int i) {
		return (Class366) aMap3882.get(Integer.valueOf(i));
	}

	public Class366 method6342(int i) {
		return (Class366) aMap3882.get(Integer.valueOf(i));
	}

	public Class366 method6343(int i) {
		return (Class366) aMap3882.get(Integer.valueOf(i));
	}

	static final void method6344(Class669 class669, int i) {
		int i_14_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_14_, -2018578417);
		Class242 class242 = Class31.aClass242Array302[i_14_ >> 16];
		Class616.method10070(class250, class242, class669, -99816331);
	}

	static final void method6345(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_15_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_16_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 1];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = client.aClass220_11301.method4107(i_15_, -1325279452).method4054(i_16_, 850944907);
	}

	public static int method6346(CharSequence charsequence, short i) {
		int i_17_ = charsequence.length();
		int i_18_ = 0;
		for (int i_19_ = 0; i_19_ < i_17_; i_19_++)
			i_18_ = ((i_18_ << 5) - i_18_ + Class523_Sub33.method16255(charsequence.charAt(i_19_), -74173527));
		return i_18_;
	}
}
