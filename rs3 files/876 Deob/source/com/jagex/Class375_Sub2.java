/* Class375_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Class375_Sub2 extends Class375 {
	Thread aThread10183;
	static final float aFloat10184 = 2.0F;
	Class369 aClass369_10185;
	Runnable aRunnable10186;
	volatile boolean aBool10187 = false;
	Thread aThread10188;
	long aLong10189 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * -5777179053309338227L;
	HashMap aHashMap10190;
	Runnable aRunnable10191;
	public static Class148 aClass148_10192;

	public void method6359() {
		if (null != aClass369_10185)
			aClass369_10185.method6334(-1062533375);
		Iterator iterator = aHashMap10190.keySet().iterator();
		while (iterator.hasNext()) {
			Class478 class478 = (Class478) iterator.next();
			Class477[] class477s = (Class477[]) aHashMap10190.get(class478);
			if (!class478.aBool5453) {
				boolean bool = false;
				for (int i = 0; i < class477s.length; i++) {
					class477s[i].method7793(-1592408312);
					bool |= class477s[i].method7806(-1821799505);
				}
				if (bool)
					Arrays.sort(class477s, new Class155(this));
			}
			int i = 3;
			boolean bool = false;
			int i_0_ = class477s.length - 1;
			while (!bool) {
				float f = class477s[i_0_].method7870((byte) 1);
				Class479 class479 = class477s[i_0_].method7771((short) 1956);
				if (f < 0.0F) {
					if (class479 == Class479.aClass479_5462 || class479 == Class479.aClass479_5461 || class479 == Class479.aClass479_5466)
						class477s[i_0_].method7781(1579730826);
				} else
					bool = true;
				if (--i_0_ < 0)
					bool = true;
			}
			if (i_0_ >= class477s.length - i) {
				for (/**/; i_0_ >= class477s.length - i; i_0_--) {
					Class479 class479 = class477s[i_0_].method7771((short) -14014);
					if (Class479.aClass479_5462 == class479)
						class477s[i_0_].method7781(-2028760630);
				}
			}
		}
	}

	public Class375_Sub2(Class652 class652) {
		aRunnable10186 = new Class160(this);
		aRunnable10191 = new Class144(this);
		aClass369_10185 = new Class369(this);
		aHashMap10190 = new HashMap();
		Iterator iterator = class652.aHashMap8398.keySet().iterator();
		while (iterator.hasNext()) {
			Class478 class478 = (Class478) iterator.next();
			aHashMap10190.put(class478, (new Class477[((Integer) class652.aHashMap8398.get(class478)).intValue()]));
		}
		iterator = aHashMap10190.keySet().iterator();
		while (iterator.hasNext()) {
			Class478 class478 = (Class478) iterator.next();
			Class477[] class477s = (Class477[]) aHashMap10190.get(class478);
			for (int i = 0; i < class477s.length; i++) {
				Class256 class256 = new Class256(2.0F);
				class256.method288(0, Class393.aClass393_4038, Class365.aClass365_3864, 2);
				class477s[i] = new Class477(class478, 32768, 3, class256, this);
			}
		}
		aThread10183 = new Thread(aRunnable10191);
		aThread10188 = new Thread(aRunnable10186);
		aThread10183.setPriority(1);
		aThread10188.setPriority(1);
		aThread10183.start();
		aThread10188.start();
	}

	public Class369 method6377() {
		return aClass369_10185;
	}

	public int method6350(Object object, byte i) {
		long l = TimeUtils.getCurrentTimeMilliseconds(1516375036);
		int i_1_ = (int) (180000.0F / ((float) (l - aLong10189 * -1469363118724993723L) / 1000.0F));
		aLong10189 = -5777179053309338227L * l;
		return i_1_;
	}

	public Object method6371(int i, int i_2_, Class393 class393, Class365 class365, int i_3_, float f, int i_4_) {
		return new Object();
	}

	HashMap method15714() {
		return aHashMap10190;
	}

	public Object method6362(int i, int i_5_, Class393 class393, Class365 class365, int i_6_, float f) {
		return new Object();
	}

	public Class477 method6355(Class478 class478, int i) {
		synchronized (aHashMap10190) {
			Class477[] class477s = (Class477[]) aHashMap10190.get(class478);
			if (class477s == null) {
				Class477 class477 = null;
				return class477;
			}
			for (int i_7_ = 0; i_7_ < class477s.length; i_7_++) {
				Class477 class477 = class477s[i_7_];
				Class479 class479 = class477.method7771((short) 8952);
				if (Class479.aClass479_5458 == class479) {
					class477.method7850(2129894657);
					Class477 class477_8_ = class477;
					return class477_8_;
				}
			}
		}
		return null;
	}

	Object method6356(Class366 class366, int i) {
		return null;
	}

	public Class369 method6357(byte i) {
		return aClass369_10185;
	}

	public void method6369(int i) {
		HashMap hashmap = method15717((byte) 0);
		synchronized (hashmap) {
			Iterator iterator = hashmap.keySet().iterator();
			while (iterator.hasNext()) {
				Class478 class478 = (Class478) iterator.next();
				Class477[] class477s = (Class477[]) hashmap.get(class478);
				for (int i_9_ = 0; i_9_ < class477s.length; i_9_++) {
					if (class477s[i_9_].method7771((short) -9519) != Class479.aClass479_5458) {
						class477s[i_9_].method7781(991957329);
						class477s[i_9_].method7776((byte) -13);
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
					for (int i_10_ = 0; i_10_ < class477s.length; i_10_++) {
						if (class477s[i_10_].method7771((short) 20045) != Class479.aClass479_5458) {
							class477s[i_10_].method7793(-1592408312);
							bool = false;
						}
					}
				}
			}
			Class653.method10656(10L);
		}
		aBool10187 = true;
		try {
			aThread10183.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
		try {
			aThread10188.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
	}

	public void method6368(int i) {
		if (null != aClass369_10185)
			aClass369_10185.method6334(-1976399392);
		Iterator iterator = aHashMap10190.keySet().iterator();
		while (iterator.hasNext()) {
			Class478 class478 = (Class478) iterator.next();
			Class477[] class477s = (Class477[]) aHashMap10190.get(class478);
			if (!class478.aBool5453) {
				boolean bool = false;
				for (int i_11_ = 0; i_11_ < class477s.length; i_11_++) {
					class477s[i_11_].method7793(-1592408312);
					bool |= class477s[i_11_].method7806(-754857953);
				}
				if (bool)
					Arrays.sort(class477s, new Class155(this));
			}
			int i_12_ = 3;
			boolean bool = false;
			int i_13_ = class477s.length - 1;
			while (!bool) {
				float f = class477s[i_13_].method7870((byte) 1);
				Class479 class479 = class477s[i_13_].method7771((short) -25151);
				if (f < 0.0F) {
					if (class479 == Class479.aClass479_5462 || class479 == Class479.aClass479_5461 || class479 == Class479.aClass479_5466)
						class477s[i_13_].method7781(-459140763);
				} else
					bool = true;
				if (--i_13_ < 0)
					bool = true;
			}
			if (i_13_ >= class477s.length - i_12_) {
				for (/**/; i_13_ >= class477s.length - i_12_; i_13_--) {
					Class479 class479 = class477s[i_13_].method7771((short) -9832);
					if (Class479.aClass479_5462 == class479)
						class477s[i_13_].method7781(-418861557);
				}
			}
		}
	}

	HashMap method15715() {
		return aHashMap10190;
	}

	public Class369 method6379() {
		return aClass369_10185;
	}

	public void method6360(Object object, byte i) {
		/* empty */
	}

	public void method6381() {
		if (null != aClass369_10185)
			aClass369_10185.method6334(-1192217956);
		Iterator iterator = aHashMap10190.keySet().iterator();
		while (iterator.hasNext()) {
			Class478 class478 = (Class478) iterator.next();
			Class477[] class477s = (Class477[]) aHashMap10190.get(class478);
			if (!class478.aBool5453) {
				boolean bool = false;
				for (int i = 0; i < class477s.length; i++) {
					class477s[i].method7793(-1592408312);
					bool |= class477s[i].method7806(624862801);
				}
				if (bool)
					Arrays.sort(class477s, new Class155(this));
			}
			int i = 3;
			boolean bool = false;
			int i_14_ = class477s.length - 1;
			while (!bool) {
				float f = class477s[i_14_].method7870((byte) 1);
				Class479 class479 = class477s[i_14_].method7771((short) -7729);
				if (f < 0.0F) {
					if (class479 == Class479.aClass479_5462 || class479 == Class479.aClass479_5461 || class479 == Class479.aClass479_5466)
						class477s[i_14_].method7781(613767215);
				} else
					bool = true;
				if (--i_14_ < 0)
					bool = true;
			}
			if (i_14_ >= class477s.length - i) {
				for (/**/; i_14_ >= class477s.length - i; i_14_--) {
					Class479 class479 = class477s[i_14_].method7771((short) -21420);
					if (Class479.aClass479_5462 == class479)
						class477s[i_14_].method7781(1679737387);
				}
			}
		}
	}

	public void method6353() {
		if (null != aClass369_10185)
			aClass369_10185.method6334(-1997526036);
		Iterator iterator = aHashMap10190.keySet().iterator();
		while (iterator.hasNext()) {
			Class478 class478 = (Class478) iterator.next();
			Class477[] class477s = (Class477[]) aHashMap10190.get(class478);
			if (!class478.aBool5453) {
				boolean bool = false;
				for (int i = 0; i < class477s.length; i++) {
					class477s[i].method7793(-1592408312);
					bool |= class477s[i].method7806(408552763);
				}
				if (bool)
					Arrays.sort(class477s, new Class155(this));
			}
			int i = 3;
			boolean bool = false;
			int i_15_ = class477s.length - 1;
			while (!bool) {
				float f = class477s[i_15_].method7870((byte) 1);
				Class479 class479 = class477s[i_15_].method7771((short) 13845);
				if (f < 0.0F) {
					if (class479 == Class479.aClass479_5462 || class479 == Class479.aClass479_5461 || class479 == Class479.aClass479_5466)
						class477s[i_15_].method7781(1820918132);
				} else
					bool = true;
				if (--i_15_ < 0)
					bool = true;
			}
			if (i_15_ >= class477s.length - i) {
				for (/**/; i_15_ >= class477s.length - i; i_15_--) {
					Class479 class479 = class477s[i_15_].method7771((short) 4721);
					if (Class479.aClass479_5462 == class479)
						class477s[i_15_].method7781(1206067152);
				}
			}
		}
	}

	public int method6352(Object object) {
		long l = TimeUtils.getCurrentTimeMilliseconds(1516375036);
		int i = (int) (180000.0F / ((float) (l - aLong10189 * -1469363118724993723L) / 1000.0F));
		aLong10189 = -5777179053309338227L * l;
		return i;
	}

	public int method6363(Object object) {
		long l = TimeUtils.getCurrentTimeMilliseconds(1516375036);
		int i = (int) (180000.0F / ((float) (l - aLong10189 * -1469363118724993723L) / 1000.0F));
		aLong10189 = -5777179053309338227L * l;
		return i;
	}

	public int method6364(Object object) {
		long l = TimeUtils.getCurrentTimeMilliseconds(1516375036);
		int i = (int) (180000.0F / ((float) (l - aLong10189 * -1469363118724993723L) / 1000.0F));
		aLong10189 = -5777179053309338227L * l;
		return i;
	}

	public Object method6365(int i, int i_16_, Class393 class393, Class365 class365, int i_17_, float f) {
		return new Object();
	}

	HashMap method15716() {
		return aHashMap10190;
	}

	public Object method6367(int i, int i_18_, Class393 class393, Class365 class365, int i_19_, float f) {
		return new Object();
	}

	public void method6366(Object object) {
		/* empty */
	}

	public void method6378(Object object) {
		/* empty */
	}

	public void method6370(Object object) {
		/* empty */
	}

	public void method6358(Object object, byte[] is, int i, int i_20_) {
		/* empty */
	}

	public void method6372(Object object, byte[] is, int i, int i_21_) {
		/* empty */
	}

	public Class477 method6373(Class478 class478) {
		synchronized (aHashMap10190) {
			Class477[] class477s = (Class477[]) aHashMap10190.get(class478);
			if (class477s == null) {
				Class477 class477 = null;
				return class477;
			}
			for (int i = 0; i < class477s.length; i++) {
				Class477 class477 = class477s[i];
				Class479 class479 = class477.method7771((short) 16285);
				if (Class479.aClass479_5458 == class479) {
					class477.method7850(2137072203);
					Class477 class477_22_ = class477;
					return class477_22_;
				}
			}
		}
		return null;
	}

	Object method6351(Class366 class366) {
		return null;
	}

	Object method6375(Class366 class366) {
		return null;
	}

	Object method6376(Class366 class366) {
		return null;
	}

	public Class369 method6361() {
		return aClass369_10185;
	}

	public void method6354(Object object, byte[] is, int i, int i_23_, int i_24_) {
		/* empty */
	}

	HashMap method15717(byte i) {
		return aHashMap10190;
	}

	public void method6380() {
		HashMap hashmap = method15717((byte) 0);
		synchronized (hashmap) {
			Iterator iterator = hashmap.keySet().iterator();
			while (iterator.hasNext()) {
				Class478 class478 = (Class478) iterator.next();
				Class477[] class477s = (Class477[]) hashmap.get(class478);
				for (int i = 0; i < class477s.length; i++) {
					if (class477s[i].method7771((short) -4740) != Class479.aClass479_5458) {
						class477s[i].method7781(1494523464);
						class477s[i].method7776((byte) -93);
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
						if (class477s[i].method7771((short) -5526) != Class479.aClass479_5458) {
							class477s[i].method7793(-1592408312);
							bool = false;
						}
					}
				}
			}
			Class653.method10656(10L);
		}
		aBool10187 = true;
		try {
			aThread10183.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
		try {
			aThread10188.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
	}

	public void method6374() {
		HashMap hashmap = method15717((byte) 0);
		synchronized (hashmap) {
			Iterator iterator = hashmap.keySet().iterator();
			while (iterator.hasNext()) {
				Class478 class478 = (Class478) iterator.next();
				Class477[] class477s = (Class477[]) hashmap.get(class478);
				for (int i = 0; i < class477s.length; i++) {
					if (class477s[i].method7771((short) 1364) != Class479.aClass479_5458) {
						class477s[i].method7781(-1982930015);
						class477s[i].method7776((byte) -32);
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
						if (class477s[i].method7771((short) -10712) != Class479.aClass479_5458) {
							class477s[i].method7793(-1592408312);
							bool = false;
						}
					}
				}
			}
			Class653.method10656(10L);
		}
		aBool10187 = true;
		try {
			aThread10183.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
		try {
			aThread10188.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
	}

	public static void method15718(int i, int i_25_) {
		Class391.aBoolArray4024[i] = false;
		Class236.method4285(i, (byte) -55);
	}

	static void method15719(Class669 class669, int i) {
		class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = ((Class280) Class655.aClass58_Sub1_8422.getDefinition((class669.anIntArray8557[((class669.anInt8558 -= 2138772399) * 1357652815)]), (byte) 62)).aString3044;
	}
}
