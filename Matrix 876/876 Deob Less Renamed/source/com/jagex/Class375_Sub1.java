/* Class375_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Class375_Sub1 extends Class375 {
	static final float aFloat10154 = 2.0F;
	HashMap aHashMap10155;
	Class369 aClass369_10156;
	volatile boolean aBool10157 = false;
	Thread aThread10158;
	Thread aThread10159;
	List aList10160 = new ArrayList();
	Runnable aRunnable10161 = new Class556(this);
	Runnable aRunnable10162 = new Class553(this);
	public static int anInt10163;

	Object method6375(Class366 class366) {
		return null;
	}

	HashMap method15704(byte i) {
		return aHashMap10155;
	}

	public Class375_Sub1(Class652 class652) {
		aClass369_10156 = new Class369(this);
		aHashMap10155 = new HashMap();
		Iterator iterator = class652.aHashMap8398.keySet().iterator();
		while (iterator.hasNext()) {
			Class478 class478 = (Class478) iterator.next();
			aHashMap10155.put(class478, (new Class477[((Integer) class652.aHashMap8398.get(class478)).intValue()]));
		}
		iterator = aHashMap10155.keySet().iterator();
		while (iterator.hasNext()) {
			Class478 class478 = (Class478) iterator.next();
			Class477[] class477s = (Class477[]) aHashMap10155.get(class478);
			for (int i = 0; i < class477s.length; i++) {
				Class256 class256 = new Class256(2.0F);
				class256.method288(0, Class393.aClass393_4038, Class365.aClass365_3864, 2);
				class477s[i] = new Class477(class478, 8192, 3, class256, this);
			}
		}
		Class567 class567 = new Class567(this, 44100.0F, 32768);
		Class567 class567_0_ = new Class567(this, 22050.0F, 16384);
		aList10160.add(class567);
		aList10160.add(class567_0_);
		aThread10159 = new Thread(aRunnable10162);
		aThread10158 = new Thread(aRunnable10161);
		aThread10159.setPriority(10);
		aThread10158.setPriority(10);
		aThread10159.start();
		aThread10158.start();
	}

	public int method6350(Object object, byte i) {
		if (null != object && object instanceof Class558) {
			Class558 class558 = (Class558) object;
			synchronized (class558.aClass567_7483) {
				int i_1_ = class558.method9228(1471142759);
				return i_1_;
			}
		}
		return 0;
	}

	Class567 method15705(float f, byte i) {
		float f_2_ = -1.0F;
		float f_3_ = 3.4028235E38F;
		Class567 class567 = null;
		Iterator iterator = aList10160.iterator();
		while (iterator.hasNext()) {
			Class567 class567_4_ = (Class567) iterator.next();
			float f_5_ = class567_4_.aFloat7614;
			float f_6_ = Math.abs(f_5_ - f);
			if (f_2_ < 0.0F || f_6_ < f_3_) {
				f_2_ = f_5_;
				f_3_ = f_6_;
				class567 = class567_4_;
			}
		}
		return class567;
	}

	public Object method6371(int i, int i_7_, Class393 class393, Class365 class365, int i_8_, float f, int i_9_) {
		Class567 class567 = method15705(f * (float) i_7_, (byte) -22);
		Class558 class558 = new Class558(this, class567, i_8_, (float) i_7_ * f, 1552171027 * class393.anInt4043, i < 2 ? 2 : i, (class393 == Class393.aClass393_4038 || Class393.aClass393_4040 == class393), class365 == Class365.aClass365_3865);
		synchronized (class558.aClass567_7483) {
			class558.aClass567_7483.method9508(class558, (byte) 53);
		}
		return class558;
	}

	Object method6376(Class366 class366) {
		return null;
	}

	public void method6354(Object object, byte[] is, int i, int i_10_, int i_11_) {
		if (null != object && object instanceof Class558) {
			Class558 class558 = (Class558) object;
			synchronized (class558.aClass567_7483) {
				class558.method9226(is, i, i_10_, 1990585737);
			}
		}
	}

	public Class477 method6355(Class478 class478, int i) {
		synchronized (aHashMap10155) {
			Class477[] class477s = (Class477[]) aHashMap10155.get(class478);
			if (null == class477s) {
				Class477 class477 = null;
				return class477;
			}
			for (int i_12_ = 0; i_12_ < class477s.length; i_12_++) {
				Class477 class477 = class477s[i_12_];
				Class479 class479 = class477.method7771((short) 6615);
				if (class479 == Class479.aClass479_5458) {
					class477.method7850(2131160027);
					Class477 class477_13_ = class477;
					return class477_13_;
				}
			}
		}
		return null;
	}

	Object method6356(Class366 class366, int i) {
		return null;
	}

	public Class369 method6357(byte i) {
		return aClass369_10156;
	}

	public void method6369(int i) {
		HashMap hashmap = method15704((byte) 99);
		synchronized (hashmap) {
			Iterator iterator = hashmap.keySet().iterator();
			while (iterator.hasNext()) {
				Class478 class478 = (Class478) iterator.next();
				Class477[] class477s = (Class477[]) hashmap.get(class478);
				for (int i_14_ = 0; i_14_ < class477s.length; i_14_++) {
					if (class477s[i_14_].method7771((short) 29523) != Class479.aClass479_5458) {
						class477s[i_14_].method7781(1420265706);
						class477s[i_14_].method7776((byte) -74);
					}
				}
			}
		}
		boolean bool = false;
		while (!bool) {
			bool = true;
			synchronized (hashmap) {
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class478 class478 = (Class478) iterator.next();
					Class477[] class477s = (Class477[]) hashmap.get(class478);
					for (int i_15_ = 0; i_15_ < class477s.length; i_15_++) {
						if (class477s[i_15_].method7771((short) -20929) != Class479.aClass479_5458) {
							class477s[i_15_].method7793(-1592408312);
							bool = false;
						}
					}
				}
			}
			Class653.method10656(10L);
		}
		aBool10157 = true;
		try {
			aThread10159.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
		try {
			aThread10158.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
	}

	public void method6359() {
		if (null != aClass369_10156)
			aClass369_10156.method6334(-1668437863);
		Iterator iterator = aHashMap10155.keySet().iterator();
		while (iterator.hasNext()) {
			Class478 class478 = (Class478) iterator.next();
			Class477[] class477s = (Class477[]) aHashMap10155.get(class478);
			if (!class478.aBool5453) {
				boolean bool = false;
				for (int i = 0; i < class477s.length; i++) {
					class477s[i].method7793(-1592408312);
					bool |= class477s[i].method7806(-1960376675);
				}
				if (bool)
					Arrays.sort(class477s, new Class554(this));
			}
			int i = 6;
			boolean bool = false;
			int i_16_ = class477s.length - 1;
			while (!bool) {
				float f = class477s[i_16_].method7870((byte) 1);
				Class479 class479 = class477s[i_16_].method7771((short) 23422);
				if (f < 0.0F) {
					if (Class479.aClass479_5462 == class479 || class479 == Class479.aClass479_5461 || class479 == Class479.aClass479_5466)
						class477s[i_16_].method7781(626101071);
				} else
					bool = true;
				if (--i_16_ < 0)
					bool = true;
			}
			if (i_16_ >= class477s.length - i) {
				for (/**/; i_16_ >= class477s.length - i; i_16_--) {
					Class479 class479 = class477s[i_16_].method7771((short) -10806);
					if (Class479.aClass479_5462 == class479)
						class477s[i_16_].method7781(-1310685266);
				}
			}
		}
	}

	public Object method6365(int i, int i_17_, Class393 class393, Class365 class365, int i_18_, float f) {
		Class567 class567 = method15705(f * (float) i_17_, (byte) -46);
		Class558 class558 = new Class558(this, class567, i_18_, (float) i_17_ * f, 1552171027 * class393.anInt4043, i < 2 ? 2 : i, (class393 == Class393.aClass393_4038 || Class393.aClass393_4040 == class393), class365 == Class365.aClass365_3865);
		synchronized (class558.aClass567_7483) {
			class558.aClass567_7483.method9508(class558, (byte) -34);
		}
		return class558;
	}

	public void method6353() {
		if (null != aClass369_10156)
			aClass369_10156.method6334(-1573522197);
		Iterator iterator = aHashMap10155.keySet().iterator();
		while (iterator.hasNext()) {
			Class478 class478 = (Class478) iterator.next();
			Class477[] class477s = (Class477[]) aHashMap10155.get(class478);
			if (!class478.aBool5453) {
				boolean bool = false;
				for (int i = 0; i < class477s.length; i++) {
					class477s[i].method7793(-1592408312);
					bool |= class477s[i].method7806(-971322784);
				}
				if (bool)
					Arrays.sort(class477s, new Class554(this));
			}
			int i = 6;
			boolean bool = false;
			int i_19_ = class477s.length - 1;
			while (!bool) {
				float f = class477s[i_19_].method7870((byte) 1);
				Class479 class479 = class477s[i_19_].method7771((short) 3236);
				if (f < 0.0F) {
					if (Class479.aClass479_5462 == class479 || class479 == Class479.aClass479_5461 || class479 == Class479.aClass479_5466)
						class477s[i_19_].method7781(1443516234);
				} else
					bool = true;
				if (--i_19_ < 0)
					bool = true;
			}
			if (i_19_ >= class477s.length - i) {
				for (/**/; i_19_ >= class477s.length - i; i_19_--) {
					Class479 class479 = class477s[i_19_].method7771((short) -11771);
					if (Class479.aClass479_5462 == class479)
						class477s[i_19_].method7781(-677998564);
				}
			}
		}
	}

	public int method6352(Object object) {
		if (null != object && object instanceof Class558) {
			Class558 class558 = (Class558) object;
			synchronized (class558.aClass567_7483) {
				int i = class558.method9228(1471142759);
				return i;
			}
		}
		return 0;
	}

	public int method6363(Object object) {
		if (null != object && object instanceof Class558) {
			Class558 class558 = (Class558) object;
			synchronized (class558.aClass567_7483) {
				int i = class558.method9228(1471142759);
				return i;
			}
		}
		return 0;
	}

	public void method6360(Object object, byte i) {
		if (object != null && object instanceof Class558) {
			Class558 class558 = (Class558) object;
			synchronized (class558.aClass567_7483) {
				class558.aClass567_7483.method9509(class558, -1227048823);
			}
		}
	}

	public void method6378(Object object) {
		if (object != null && object instanceof Class558) {
			Class558 class558 = (Class558) object;
			synchronized (class558.aClass567_7483) {
				class558.aClass567_7483.method9509(class558, 919404277);
			}
		}
	}

	public Object method6362(int i, int i_20_, Class393 class393, Class365 class365, int i_21_, float f) {
		Class567 class567 = method15705(f * (float) i_20_, (byte) -97);
		Class558 class558 = new Class558(this, class567, i_21_, (float) i_20_ * f, 1552171027 * class393.anInt4043, i < 2 ? 2 : i, (class393 == Class393.aClass393_4038 || Class393.aClass393_4040 == class393), class365 == Class365.aClass365_3865);
		synchronized (class558.aClass567_7483) {
			class558.aClass567_7483.method9508(class558, (byte) 68);
		}
		return class558;
	}

	public Object method6367(int i, int i_22_, Class393 class393, Class365 class365, int i_23_, float f) {
		Class567 class567 = method15705(f * (float) i_22_, (byte) -8);
		Class558 class558 = new Class558(this, class567, i_23_, (float) i_22_ * f, 1552171027 * class393.anInt4043, i < 2 ? 2 : i, (class393 == Class393.aClass393_4038 || Class393.aClass393_4040 == class393), class365 == Class365.aClass365_3865);
		synchronized (class558.aClass567_7483) {
			class558.aClass567_7483.method9508(class558, (byte) 39);
		}
		return class558;
	}

	public void method6366(Object object) {
		if (object != null && object instanceof Class558) {
			Class558 class558 = (Class558) object;
			synchronized (class558.aClass567_7483) {
				class558.aClass567_7483.method9509(class558, 1700836824);
			}
		}
	}

	public void method6381() {
		if (null != aClass369_10156)
			aClass369_10156.method6334(-2143467115);
		Iterator iterator = aHashMap10155.keySet().iterator();
		while (iterator.hasNext()) {
			Class478 class478 = (Class478) iterator.next();
			Class477[] class477s = (Class477[]) aHashMap10155.get(class478);
			if (!class478.aBool5453) {
				boolean bool = false;
				for (int i = 0; i < class477s.length; i++) {
					class477s[i].method7793(-1592408312);
					bool |= class477s[i].method7806(-1761164734);
				}
				if (bool)
					Arrays.sort(class477s, new Class554(this));
			}
			int i = 6;
			boolean bool = false;
			int i_24_ = class477s.length - 1;
			while (!bool) {
				float f = class477s[i_24_].method7870((byte) 1);
				Class479 class479 = class477s[i_24_].method7771((short) 4443);
				if (f < 0.0F) {
					if (Class479.aClass479_5462 == class479 || class479 == Class479.aClass479_5461 || class479 == Class479.aClass479_5466)
						class477s[i_24_].method7781(-1349198430);
				} else
					bool = true;
				if (--i_24_ < 0)
					bool = true;
			}
			if (i_24_ >= class477s.length - i) {
				for (/**/; i_24_ >= class477s.length - i; i_24_--) {
					Class479 class479 = class477s[i_24_].method7771((short) -6868);
					if (Class479.aClass479_5462 == class479)
						class477s[i_24_].method7781(-2141552619);
				}
			}
		}
	}

	public void method6370(Object object) {
		if (object != null && object instanceof Class558) {
			Class558 class558 = (Class558) object;
			synchronized (class558.aClass567_7483) {
				class558.aClass567_7483.method9509(class558, -566617939);
			}
		}
	}

	public Class369 method6379() {
		return aClass369_10156;
	}

	public void method6372(Object object, byte[] is, int i, int i_25_) {
		if (null != object && object instanceof Class558) {
			Class558 class558 = (Class558) object;
			synchronized (class558.aClass567_7483) {
				class558.method9226(is, i, i_25_, 1551554773);
			}
		}
	}

	public void method6368(int i) {
		if (null != aClass369_10156)
			aClass369_10156.method6334(-1906335850);
		Iterator iterator = aHashMap10155.keySet().iterator();
		while (iterator.hasNext()) {
			Class478 class478 = (Class478) iterator.next();
			Class477[] class477s = (Class477[]) aHashMap10155.get(class478);
			if (!class478.aBool5453) {
				boolean bool = false;
				for (int i_26_ = 0; i_26_ < class477s.length; i_26_++) {
					class477s[i_26_].method7793(-1592408312);
					bool |= class477s[i_26_].method7806(36311259);
				}
				if (bool)
					Arrays.sort(class477s, new Class554(this));
			}
			int i_27_ = 6;
			boolean bool = false;
			int i_28_ = class477s.length - 1;
			while (!bool) {
				float f = class477s[i_28_].method7870((byte) 1);
				Class479 class479 = class477s[i_28_].method7771((short) -11807);
				if (f < 0.0F) {
					if (Class479.aClass479_5462 == class479 || class479 == Class479.aClass479_5461 || class479 == Class479.aClass479_5466)
						class477s[i_28_].method7781(844919655);
				} else
					bool = true;
				if (--i_28_ < 0)
					bool = true;
			}
			if (i_28_ >= class477s.length - i_27_) {
				for (/**/; i_28_ >= class477s.length - i_27_; i_28_--) {
					Class479 class479 = class477s[i_28_].method7771((short) -2912);
					if (Class479.aClass479_5462 == class479)
						class477s[i_28_].method7781(174141482);
				}
			}
		}
	}

	Object method6351(Class366 class366) {
		return null;
	}

	HashMap method15706() {
		return aHashMap10155;
	}

	public void method6358(Object object, byte[] is, int i, int i_29_) {
		if (null != object && object instanceof Class558) {
			Class558 class558 = (Class558) object;
			synchronized (class558.aClass567_7483) {
				class558.method9226(is, i, i_29_, 2053817946);
			}
		}
	}

	public Class369 method6377() {
		return aClass369_10156;
	}

	public Class369 method6361() {
		return aClass369_10156;
	}

	public int method6364(Object object) {
		if (null != object && object instanceof Class558) {
			Class558 class558 = (Class558) object;
			synchronized (class558.aClass567_7483) {
				int i = class558.method9228(1471142759);
				return i;
			}
		}
		return 0;
	}

	public void method6380() {
		HashMap hashmap = method15704((byte) 93);
		synchronized (hashmap) {
			Iterator iterator = hashmap.keySet().iterator();
			while (iterator.hasNext()) {
				Class478 class478 = (Class478) iterator.next();
				Class477[] class477s = (Class477[]) hashmap.get(class478);
				for (int i = 0; i < class477s.length; i++) {
					if (class477s[i].method7771((short) -14438) != Class479.aClass479_5458) {
						class477s[i].method7781(-1140518731);
						class477s[i].method7776((byte) -67);
					}
				}
			}
		}
		boolean bool = false;
		while (!bool) {
			bool = true;
			synchronized (hashmap) {
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class478 class478 = (Class478) iterator.next();
					Class477[] class477s = (Class477[]) hashmap.get(class478);
					for (int i = 0; i < class477s.length; i++) {
						if (class477s[i].method7771((short) -15647) != Class479.aClass479_5458) {
							class477s[i].method7793(-1592408312);
							bool = false;
						}
					}
				}
			}
			Class653.method10656(10L);
		}
		aBool10157 = true;
		try {
			aThread10159.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
		try {
			aThread10158.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
	}

	public void method6374() {
		HashMap hashmap = method15704((byte) 65);
		synchronized (hashmap) {
			Iterator iterator = hashmap.keySet().iterator();
			while (iterator.hasNext()) {
				Class478 class478 = (Class478) iterator.next();
				Class477[] class477s = (Class477[]) hashmap.get(class478);
				for (int i = 0; i < class477s.length; i++) {
					if (class477s[i].method7771((short) 16154) != Class479.aClass479_5458) {
						class477s[i].method7781(-1664151003);
						class477s[i].method7776((byte) -125);
					}
				}
			}
		}
		boolean bool = false;
		while (!bool) {
			bool = true;
			synchronized (hashmap) {
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class478 class478 = (Class478) iterator.next();
					Class477[] class477s = (Class477[]) hashmap.get(class478);
					for (int i = 0; i < class477s.length; i++) {
						if (class477s[i].method7771((short) -4055) != Class479.aClass479_5458) {
							class477s[i].method7793(-1592408312);
							bool = false;
						}
					}
				}
			}
			Class653.method10656(10L);
		}
		aBool10157 = true;
		try {
			aThread10159.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
		try {
			aThread10158.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
	}

	public Class477 method6373(Class478 class478) {
		synchronized (aHashMap10155) {
			Class477[] class477s = (Class477[]) aHashMap10155.get(class478);
			if (null == class477s) {
				Class477 class477 = null;
				return class477;
			}
			for (int i = 0; i < class477s.length; i++) {
				Class477 class477 = class477s[i];
				Class479 class479 = class477.method7771((short) 156);
				if (class479 == Class479.aClass479_5458) {
					class477.method7850(2139823170);
					Class477 class477_30_ = class477;
					return class477_30_;
				}
			}
		}
		return null;
	}

	HashMap method15707() {
		return aHashMap10155;
	}

	HashMap method15708() {
		return aHashMap10155;
	}

	static final void method15709(Class669 class669, byte i) {
		int i_31_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub9_10622.method13890(i_31_, 1959088938);
	}
}
