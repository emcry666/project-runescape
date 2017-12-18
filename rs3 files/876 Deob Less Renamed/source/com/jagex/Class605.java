/* Class605 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Class605 implements Interface71 {
	byte[] aByteArray7946;
	Class597 aClass597_7947 = Class597.aClass597_7833;
	Class375 aClass375_7948;
	int anInt7949;
	Interface69 anInterface69_7950;
	boolean aBool7951;
	boolean aBool7952;
	int anInt7953;
	Class209 aClass209_7954;
	Class472 aClass472_7955;

	public boolean method254() {
		return false;
	}

	public int method460(int i) {
		if (null == aClass209_7954)
			return 0;
		int i_0_ = 0;
		synchronized (aClass209_7954) {
			List list = method9957(918698074);
			if (null != list)
				i_0_ = list.size();
		}
		return i_0_;
	}

	public Class489 method466(int i) {
		Class489 class489 = new Class489(aClass375_7948);
		class489.method7956(this, 1939022271);
		return class489;
	}

	public Class597 method474(short i) {
		return aClass597_7947;
	}

	public boolean method477(short i) {
		return false;
	}

	void method9947(int i) {
		/* empty */
	}

	public Class489 method463() {
		Class489 class489 = new Class489(aClass375_7948);
		class489.method7956(this, 1939022271);
		return class489;
	}

	public int method453(byte i) {
		if (aByteArray7946 != null)
			return aByteArray7946.length;
		return 0;
	}

	List method9948() {
		if (null == aClass209_7954 || false == aBool7952)
			return null;
		Object object = null;
		List list;
		synchronized (aClass209_7954) {
			list = (List) aClass209_7954.method3767((long) (anInt7949 * -38146553));
			if (null == list && aBool7952) {
				list = new ArrayList();
				aClass209_7954.method3764(list, (long) (anInt7949 * -38146553), 0, 1950516361);
			}
		}
		return list;
	}

	public int method455(byte i) {
		return anInt7949 * -38146553;
	}

	public void method456(Class523_Sub34 class523_sub34, short i) {
		if (null != aClass209_7954) {
			if (null != anInterface69_7950)
				anInterface69_7950.method437(this, (byte) 104);
			if (aBool7951)
				throw new RuntimeException("");
			synchronized (aClass209_7954) {
				List list = method9957(-574027832);
				if (null != list) {
					list.add(class523_sub34);
					anInt7953 += -1395805875 * class523_sub34.aByteArray10658.length;
					method9949(list, anInt7953 * -452137083, -2026491163);
				}
			}
		}
	}

	public Class523_Sub34 method469(int i, int i_1_) {
		if (null == aClass209_7954)
			return null;
		Class523_Sub34 class523_sub34 = null;
		if (anInterface69_7950 != null)
			anInterface69_7950.method437(this, (byte) 13);
		synchronized (aClass209_7954) {
			List list = method9957(-578637934);
			if (list.size() > i)
				class523_sub34 = (Class523_Sub34) list.get(i);
		}
		return class523_sub34;
	}

	public boolean method457(int i, int i_2_) {
		if (null == aClass209_7954)
			return false;
		boolean bool = false;
		synchronized (aClass209_7954) {
			List list = method9957(918921157);
			if (null != list && list.size() > i)
				bool = list.get(i) != null;
		}
		return bool;
	}

	public boolean method471(int i) {
		return aClass209_7954 != null && aBool7952;
	}

	public int method450() {
		return anInt7949 * -38146553;
	}

	public Class478 method458(int i) {
		return Class478.aClass478_5447;
	}

	public byte[] method452(int i, byte i_3_) {
		if (null != anInterface69_7950)
			anInterface69_7950.method437(this, (byte) -54);
		return aByteArray7946;
	}

	public void method461(boolean bool, byte i) {
		if (null != anInterface69_7950)
			anInterface69_7950.method437(this, (byte) 45);
		aBool7951 = bool;
	}

	void method9949(List list, int i, int i_4_) {
		if (null != aClass209_7954 && null != list && i >= 0) {
			synchronized (aClass209_7954) {
				aClass209_7954.method3791((long) (-38146553 * anInt7949));
				if (i <= aClass209_7954.method3774((short) 22967))
					aClass209_7954.method3764(list, (long) (-38146553 * anInt7949), i, 1993937404);
				else {
					aBool7952 = false;
					aBool7951 = false;
					anInt7953 = 0;
				}
			}
		}
	}

	public void method266() {
		if (aClass597_7947 == Class597.aClass597_7832) {
			byte[] is = aClass472_7955.method7721(-38146553 * anInt7949, -387132909);
			if (is != null) {
				aByteArray7946 = is;
				method9947(203609721);
				aClass597_7947 = Class597.aClass597_7834;
				if (null != anInterface69_7950)
					anInterface69_7950.method440(this, is.length, anInt7949 * -38146553, false, 939247281);
			}
		}
	}

	public void method478(boolean bool) {
		if (null != anInterface69_7950)
			anInterface69_7950.method437(this, (byte) 27);
		aBool7951 = bool;
	}

	public Class597 method464() {
		return aClass597_7947;
	}

	public boolean method476() {
		return aClass209_7954 != null && aBool7952;
	}

	public Class597 method470() {
		return aClass597_7947;
	}

	public Class597 method467() {
		return aClass597_7947;
	}

	public int method483() {
		if (null == aClass209_7954)
			return 0;
		int i = 0;
		synchronized (aClass209_7954) {
			List list = method9957(-911201556);
			if (null != list)
				i = list.size();
		}
		return i;
	}

	public boolean method462(short i) {
		if (null == aClass209_7954)
			return false;
		List list = method9957(-1339137257);
		if (list == null || list.size() <= 0)
			aBool7951 = false;
		return aBool7951;
	}

	void method9950() {
		/* empty */
	}

	public byte[] method468(int i) {
		if (null != anInterface69_7950)
			anInterface69_7950.method437(this, (byte) 114);
		return aByteArray7946;
	}

	public Class478 method449() {
		return Class478.aClass478_5447;
	}

	public boolean method475() {
		return aClass209_7954 != null && aBool7952;
	}

	public void method454(Class523_Sub34 class523_sub34) {
		if (null != aClass209_7954) {
			if (null != anInterface69_7950)
				anInterface69_7950.method437(this, (byte) 53);
			if (aBool7951)
				throw new RuntimeException("");
			synchronized (aClass209_7954) {
				List list = method9957(-359480225);
				if (null != list) {
					list.add(class523_sub34);
					anInt7953 += -1395805875 * class523_sub34.aByteArray10658.length;
					method9949(list, anInt7953 * -452137083, -1308775343);
				}
			}
		}
	}

	public Class523_Sub34 method472(int i) {
		if (null == aClass209_7954)
			return null;
		Class523_Sub34 class523_sub34 = null;
		if (anInterface69_7950 != null)
			anInterface69_7950.method437(this, (byte) -15);
		synchronized (aClass209_7954) {
			List list = method9957(155987948);
			if (list.size() > i)
				class523_sub34 = (Class523_Sub34) list.get(i);
		}
		return class523_sub34;
	}

	public Class605(Class472 class472, int i, Class375 class375, Interface69 interface69, Class209 class209) {
		aClass472_7955 = class472;
		anInt7949 = 1889279927 * i;
		aClass375_7948 = class375;
		anInterface69_7950 = interface69;
		aClass209_7954 = class209;
		aBool7952 = null != aClass209_7954;
		aClass597_7947 = Class597.aClass597_7832;
	}

	public boolean method479(int i) {
		if (null == aClass209_7954)
			return false;
		boolean bool = false;
		synchronized (aClass209_7954) {
			List list = method9957(-619668217);
			if (null != list && list.size() > i)
				bool = list.get(i) != null;
		}
		return bool;
	}

	public boolean method482() {
		return aClass209_7954 != null && aBool7952;
	}

	public Class597 method465() {
		return aClass597_7947;
	}

	List method9951() {
		if (null == aClass209_7954 || false == aBool7952)
			return null;
		Object object = null;
		List list;
		synchronized (aClass209_7954) {
			list = (List) aClass209_7954.method3767((long) (anInt7949 * -38146553));
			if (null == list && aBool7952) {
				list = new ArrayList();
				aClass209_7954.method3764(list, (long) (anInt7949 * -38146553), 0, 2043039087);
			}
		}
		return list;
	}

	public Class523_Sub34 method473(int i) {
		if (null == aClass209_7954)
			return null;
		Class523_Sub34 class523_sub34 = null;
		if (anInterface69_7950 != null)
			anInterface69_7950.method437(this, (byte) 31);
		synchronized (aClass209_7954) {
			List list = method9957(-1806468791);
			if (list.size() > i)
				class523_sub34 = (Class523_Sub34) list.get(i);
		}
		return class523_sub34;
	}

	public boolean method459() {
		if (null == aClass209_7954)
			return false;
		List list = method9957(-1026765596);
		if (list == null || list.size() <= 0)
			aBool7951 = false;
		return aBool7951;
	}

	void method9952() {
		/* empty */
	}

	void method9953(List list, int i) {
		if (null != aClass209_7954 && null != list && i >= 0) {
			synchronized (aClass209_7954) {
				aClass209_7954.method3791((long) (-38146553 * anInt7949));
				if (i <= aClass209_7954.method3774((short) 11758))
					aClass209_7954.method3764(list, (long) (-38146553 * anInt7949), i, 940891639);
				else {
					aBool7952 = false;
					aBool7951 = false;
					anInt7953 = 0;
				}
			}
		}
	}

	void method9954(List list, int i) {
		if (null != aClass209_7954 && null != list && i >= 0) {
			synchronized (aClass209_7954) {
				aClass209_7954.method3791((long) (-38146553 * anInt7949));
				if (i <= aClass209_7954.method3774((short) 15484))
					aClass209_7954.method3764(list, (long) (-38146553 * anInt7949), i, 1978725019);
				else {
					aBool7952 = false;
					aBool7951 = false;
					anInt7953 = 0;
				}
			}
		}
	}

	void method9955(List list, int i) {
		if (null != aClass209_7954 && null != list && i >= 0) {
			synchronized (aClass209_7954) {
				aClass209_7954.method3791((long) (-38146553 * anInt7949));
				if (i <= aClass209_7954.method3774((short) 25237))
					aClass209_7954.method3764(list, (long) (-38146553 * anInt7949), i, 1590169604);
				else {
					aBool7952 = false;
					aBool7951 = false;
					anInt7953 = 0;
				}
			}
		}
	}

	List method9956() {
		if (null == aClass209_7954 || false == aBool7952)
			return null;
		Object object = null;
		List list;
		synchronized (aClass209_7954) {
			list = (List) aClass209_7954.method3767((long) (anInt7949 * -38146553));
			if (null == list && aBool7952) {
				list = new ArrayList();
				aClass209_7954.method3764(list, (long) (anInt7949 * -38146553), 0, 1981791458);
			}
		}
		return list;
	}

	public void method210(int i) {
		if (aClass597_7947 == Class597.aClass597_7832) {
			byte[] is = aClass472_7955.method7721(-38146553 * anInt7949, -387132909);
			if (is != null) {
				aByteArray7946 = is;
				method9947(-1736075877);
				aClass597_7947 = Class597.aClass597_7834;
				if (null != anInterface69_7950)
					anInterface69_7950.method440(this, is.length, anInt7949 * -38146553, false, 1567329048);
			}
		}
	}

	List method9957(int i) {
		if (null == aClass209_7954 || false == aBool7952)
			return null;
		Object object = null;
		List list;
		synchronized (aClass209_7954) {
			list = (List) aClass209_7954.method3767((long) (anInt7949 * -38146553));
			if (null == list && aBool7952) {
				list = new ArrayList();
				aClass209_7954.method3764(list, (long) (anInt7949 * -38146553), 0, 1841498196);
			}
		}
		return list;
	}

	List method9958() {
		if (null == aClass209_7954 || false == aBool7952)
			return null;
		Object object = null;
		List list;
		synchronized (aClass209_7954) {
			list = (List) aClass209_7954.method3767((long) (anInt7949 * -38146553));
			if (null == list && aBool7952) {
				list = new ArrayList();
				aClass209_7954.method3764(list, (long) (anInt7949 * -38146553), 0, 1516696755);
			}
		}
		return list;
	}

	public int method481() {
		if (aByteArray7946 != null)
			return aByteArray7946.length;
		return 0;
	}

	public boolean method480() {
		if (null == aClass209_7954)
			return false;
		List list = method9957(-1877354588);
		if (list == null || list.size() <= 0)
			aBool7951 = false;
		return aBool7951;
	}

	public int method451() {
		if (aByteArray7946 != null)
			return aByteArray7946.length;
		return 0;
	}

	public int method484() {
		if (null == aClass209_7954)
			return 0;
		int i = 0;
		synchronized (aClass209_7954) {
			List list = method9957(761179880);
			if (null != list)
				i = list.size();
		}
		return i;
	}

	static final void method9959(Class669 class669, byte i) {
		if (!Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5342(-1390175100).method5222(-875968759))
			throw new RuntimeException();
		Class328_Sub3 class328_sub3 = (Class328_Sub3) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5430(1276134485);
		class328_sub3.method15678(Class162.aClass444_1770, -1, 0.0F, (byte) -17);
		client.aBool11111 = true;
	}

	static final void method9960(Class669 class669, int i) {
		if (Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5341((byte) 99) != Class294.aClass294_3166)
			throw new RuntimeException();
		((Class688_Sub3) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5465((byte) 40)).method17101((class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]), (byte) 29);
	}

	public static int method9961(short[] is, int i, Class315 class315, int i_5_, byte i_6_) throws IOException {
		int i_7_ = 1;
		int i_8_ = 0;
		for (int i_9_ = 0; i_9_ < i_5_; i_9_++) {
			int i_10_ = class315.method5669(is, i_7_ + i, (byte) 0);
			i_7_ <<= 1;
			i_7_ += i_10_;
			i_8_ |= i_10_ << i_9_;
		}
		return i_8_;
	}

	static boolean method9962(int i, int i_11_, int i_12_) {
		if (i_11_ >= 1000 && i < 1000)
			return true;
		if (i_11_ < 1000 && i < 1000) {
			if (Class250.method4518(i, 991233810))
				return true;
			if (Class250.method4518(i_11_, 1145921376))
				return false;
			return true;
		}
		if (i_11_ >= 1000 && i >= 1000)
			return true;
		return false;
	}
}
