/* Class74 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;

public final class Class74 {
	WeakReference_Sub1[] aWeakReference_Sub1Array812;
	ReferenceQueue aReferenceQueue813 = new ReferenceQueue();
	int anInt814;
	static int anInt815;

	void method1510(int i) {
		for (;;) {
			WeakReference_Sub1 weakreference_sub1 = (WeakReference_Sub1) aReferenceQueue813.poll();
			if (weakreference_sub1 == null)
				break;
			int i_0_ = (weakreference_sub1.anInt11883 * 1368990721 & aWeakReference_Sub1Array812.length - 1);
			WeakReference_Sub1 weakreference_sub1_1_ = aWeakReference_Sub1Array812[i_0_];
			if (weakreference_sub1_1_ == weakreference_sub1) {
				aWeakReference_Sub1Array812[i_0_] = weakreference_sub1.aWeakReference_Sub1_11882;
				anInt814 -= -842271715;
			} else {
				for (/**/; (null != weakreference_sub1_1_ && (weakreference_sub1_1_.aWeakReference_Sub1_11882 != weakreference_sub1)); weakreference_sub1_1_ = weakreference_sub1_1_.aWeakReference_Sub1_11882) {
					/* empty */
				}
				if (null != weakreference_sub1_1_) {
					weakreference_sub1_1_.aWeakReference_Sub1_11882 = weakreference_sub1.aWeakReference_Sub1_11882;
					anInt814 -= -842271715;
				}
			}
		}
	}

	public void method1511(Object object, Object object_2_, int i) {
		if (object == null)
			throw new NullPointerException();
		method1510(-1344775229);
		int i_3_ = System.identityHashCode(object);
		int i_4_ = i_3_ & aWeakReference_Sub1Array812.length - 1;
		WeakReference_Sub1 weakreference_sub1 = aWeakReference_Sub1Array812[i_4_];
		if (null == weakreference_sub1) {
			aWeakReference_Sub1Array812[i_4_] = new WeakReference_Sub1(object, aReferenceQueue813, i_3_, object_2_);
			anInt814 += -842271715;
			if (anInt814 * 1070231093 >= aWeakReference_Sub1Array812.length)
				method1514(816617827);
		} else {
			for (/**/; weakreference_sub1.get() != object; weakreference_sub1 = weakreference_sub1.aWeakReference_Sub1_11882) {
				if (null == weakreference_sub1.aWeakReference_Sub1_11882) {
					weakreference_sub1.aWeakReference_Sub1_11882 = new WeakReference_Sub1(object, aReferenceQueue813, i_3_, object_2_);
					anInt814 += -842271715;
					if (1070231093 * anInt814 >= aWeakReference_Sub1Array812.length)
						method1514(1396973833);
					break;
				}
			}
		}
	}

	public ArrayList method1512() {
		method1510(-1344775229);
		ArrayList arraylist = new ArrayList(1070231093 * anInt814);
		WeakReference_Sub1[] weakreference_sub1s = aWeakReference_Sub1Array812;
		for (int i = 0; i < weakreference_sub1s.length; i++) {
			for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s[i]; weakreference_sub1 != null; weakreference_sub1 = weakreference_sub1.aWeakReference_Sub1_11882) {
				Object object = weakreference_sub1.get();
				if (null != object)
					arraylist.add(object);
			}
		}
		return arraylist;
	}

	public ArrayList method1513(int i) {
		method1510(-1344775229);
		ArrayList arraylist = new ArrayList(1070231093 * anInt814);
		WeakReference_Sub1[] weakreference_sub1s = aWeakReference_Sub1Array812;
		for (int i_5_ = 0; i_5_ < weakreference_sub1s.length; i_5_++) {
			for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s[i_5_]; weakreference_sub1 != null; weakreference_sub1 = weakreference_sub1.aWeakReference_Sub1_11882) {
				Object object = weakreference_sub1.get();
				if (null != object)
					arraylist.add(object);
			}
		}
		return arraylist;
	}

	void method1514(int i) {
		WeakReference_Sub1[] weakreference_sub1s = aWeakReference_Sub1Array812;
		aWeakReference_Sub1Array812 = new WeakReference_Sub1[2 * weakreference_sub1s.length];
		WeakReference_Sub1[] weakreference_sub1s_6_ = weakreference_sub1s;
		for (int i_7_ = 0; i_7_ < weakreference_sub1s_6_.length; i_7_++) {
			WeakReference_Sub1 weakreference_sub1_8_;
			for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s_6_[i_7_]; weakreference_sub1 != null; weakreference_sub1 = weakreference_sub1_8_) {
				weakreference_sub1_8_ = weakreference_sub1.aWeakReference_Sub1_11882;
				int i_9_ = (weakreference_sub1.anInt11883 * 1368990721 & aWeakReference_Sub1Array812.length - 1);
				weakreference_sub1.aWeakReference_Sub1_11882 = aWeakReference_Sub1Array812[i_9_];
				aWeakReference_Sub1Array812[i_9_] = weakreference_sub1;
			}
		}
	}

	void method1515() {
		for (;;) {
			WeakReference_Sub1 weakreference_sub1 = (WeakReference_Sub1) aReferenceQueue813.poll();
			if (weakreference_sub1 == null)
				break;
			int i = (weakreference_sub1.anInt11883 * 1368990721 & aWeakReference_Sub1Array812.length - 1);
			WeakReference_Sub1 weakreference_sub1_10_ = aWeakReference_Sub1Array812[i];
			if (weakreference_sub1_10_ == weakreference_sub1) {
				aWeakReference_Sub1Array812[i] = weakreference_sub1.aWeakReference_Sub1_11882;
				anInt814 -= -842271715;
			} else {
				for (/**/; (null != weakreference_sub1_10_ && (weakreference_sub1_10_.aWeakReference_Sub1_11882 != weakreference_sub1)); weakreference_sub1_10_ = weakreference_sub1_10_.aWeakReference_Sub1_11882) {
					/* empty */
				}
				if (null != weakreference_sub1_10_) {
					weakreference_sub1_10_.aWeakReference_Sub1_11882 = weakreference_sub1.aWeakReference_Sub1_11882;
					anInt814 -= -842271715;
				}
			}
		}
	}

	public void method1516(Object object, Object object_11_) {
		if (object == null)
			throw new NullPointerException();
		method1510(-1344775229);
		int i = System.identityHashCode(object);
		int i_12_ = i & aWeakReference_Sub1Array812.length - 1;
		WeakReference_Sub1 weakreference_sub1 = aWeakReference_Sub1Array812[i_12_];
		if (null == weakreference_sub1) {
			aWeakReference_Sub1Array812[i_12_] = new WeakReference_Sub1(object, aReferenceQueue813, i, object_11_);
			anInt814 += -842271715;
			if (anInt814 * 1070231093 >= aWeakReference_Sub1Array812.length)
				method1514(2005880576);
		} else {
			for (/**/; weakreference_sub1.get() != object; weakreference_sub1 = weakreference_sub1.aWeakReference_Sub1_11882) {
				if (null == weakreference_sub1.aWeakReference_Sub1_11882) {
					weakreference_sub1.aWeakReference_Sub1_11882 = new WeakReference_Sub1(object, aReferenceQueue813, i, object_11_);
					anInt814 += -842271715;
					if (1070231093 * anInt814 >= aWeakReference_Sub1Array812.length)
						method1514(614255653);
					break;
				}
			}
		}
	}

	void method1517() {
		for (;;) {
			WeakReference_Sub1 weakreference_sub1 = (WeakReference_Sub1) aReferenceQueue813.poll();
			if (weakreference_sub1 == null)
				break;
			int i = (weakreference_sub1.anInt11883 * 1368990721 & aWeakReference_Sub1Array812.length - 1);
			WeakReference_Sub1 weakreference_sub1_13_ = aWeakReference_Sub1Array812[i];
			if (weakreference_sub1_13_ == weakreference_sub1) {
				aWeakReference_Sub1Array812[i] = weakreference_sub1.aWeakReference_Sub1_11882;
				anInt814 -= -842271715;
			} else {
				for (/**/; (null != weakreference_sub1_13_ && (weakreference_sub1_13_.aWeakReference_Sub1_11882 != weakreference_sub1)); weakreference_sub1_13_ = weakreference_sub1_13_.aWeakReference_Sub1_11882) {
					/* empty */
				}
				if (null != weakreference_sub1_13_) {
					weakreference_sub1_13_.aWeakReference_Sub1_11882 = weakreference_sub1.aWeakReference_Sub1_11882;
					anInt814 -= -842271715;
				}
			}
		}
	}

	public void method1518(Object object) {
		if (null == object)
			throw new NullPointerException();
		method1510(-1344775229);
		int i = System.identityHashCode(object);
		int i_14_ = i & aWeakReference_Sub1Array812.length - 1;
		WeakReference_Sub1 weakreference_sub1 = aWeakReference_Sub1Array812[i_14_];
		if (null != weakreference_sub1) {
			if (weakreference_sub1.get() == object) {
				aWeakReference_Sub1Array812[i_14_] = weakreference_sub1.aWeakReference_Sub1_11882;
				anInt814 -= -842271715;
			} else {
				for (;;) {
					WeakReference_Sub1 weakreference_sub1_15_ = weakreference_sub1.aWeakReference_Sub1_11882;
					if (null == weakreference_sub1_15_)
						break;
					if (weakreference_sub1_15_.get() == object) {
						weakreference_sub1.aWeakReference_Sub1_11882 = weakreference_sub1_15_.aWeakReference_Sub1_11882;
						anInt814 -= -842271715;
						break;
					}
					weakreference_sub1 = weakreference_sub1_15_;
				}
			}
		}
	}

	public void method1519(Object object) {
		if (null == object)
			throw new NullPointerException();
		method1510(-1344775229);
		int i = System.identityHashCode(object);
		int i_16_ = i & aWeakReference_Sub1Array812.length - 1;
		WeakReference_Sub1 weakreference_sub1 = aWeakReference_Sub1Array812[i_16_];
		if (null != weakreference_sub1) {
			if (weakreference_sub1.get() == object) {
				aWeakReference_Sub1Array812[i_16_] = weakreference_sub1.aWeakReference_Sub1_11882;
				anInt814 -= -842271715;
			} else {
				for (;;) {
					WeakReference_Sub1 weakreference_sub1_17_ = weakreference_sub1.aWeakReference_Sub1_11882;
					if (null == weakreference_sub1_17_)
						break;
					if (weakreference_sub1_17_.get() == object) {
						weakreference_sub1.aWeakReference_Sub1_11882 = weakreference_sub1_17_.aWeakReference_Sub1_11882;
						anInt814 -= -842271715;
						break;
					}
					weakreference_sub1 = weakreference_sub1_17_;
				}
			}
		}
	}

	public void method1520(Object object) {
		if (null == object)
			throw new NullPointerException();
		method1510(-1344775229);
		int i = System.identityHashCode(object);
		int i_18_ = i & aWeakReference_Sub1Array812.length - 1;
		WeakReference_Sub1 weakreference_sub1 = aWeakReference_Sub1Array812[i_18_];
		if (null != weakreference_sub1) {
			if (weakreference_sub1.get() == object) {
				aWeakReference_Sub1Array812[i_18_] = weakreference_sub1.aWeakReference_Sub1_11882;
				anInt814 -= -842271715;
			} else {
				for (;;) {
					WeakReference_Sub1 weakreference_sub1_19_ = weakreference_sub1.aWeakReference_Sub1_11882;
					if (null == weakreference_sub1_19_)
						break;
					if (weakreference_sub1_19_.get() == object) {
						weakreference_sub1.aWeakReference_Sub1_11882 = weakreference_sub1_19_.aWeakReference_Sub1_11882;
						anInt814 -= -842271715;
						break;
					}
					weakreference_sub1 = weakreference_sub1_19_;
				}
			}
		}
	}

	public ArrayList method1521() {
		method1510(-1344775229);
		ArrayList arraylist = new ArrayList(1070231093 * anInt814);
		WeakReference_Sub1[] weakreference_sub1s = aWeakReference_Sub1Array812;
		for (int i = 0; i < weakreference_sub1s.length; i++) {
			for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s[i]; weakreference_sub1 != null; weakreference_sub1 = weakreference_sub1.aWeakReference_Sub1_11882) {
				Object object = weakreference_sub1.get();
				if (null != object)
					arraylist.add(object);
			}
		}
		return arraylist;
	}

	public ArrayList method1522() {
		method1510(-1344775229);
		ArrayList arraylist = new ArrayList(1070231093 * anInt814);
		WeakReference_Sub1[] weakreference_sub1s = aWeakReference_Sub1Array812;
		for (int i = 0; i < weakreference_sub1s.length; i++) {
			for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s[i]; weakreference_sub1 != null; weakreference_sub1 = weakreference_sub1.aWeakReference_Sub1_11882) {
				Object object = weakreference_sub1.get();
				if (null != object)
					arraylist.add(object);
			}
		}
		return arraylist;
	}

	void method1523() {
		WeakReference_Sub1[] weakreference_sub1s = aWeakReference_Sub1Array812;
		aWeakReference_Sub1Array812 = new WeakReference_Sub1[2 * weakreference_sub1s.length];
		WeakReference_Sub1[] weakreference_sub1s_20_ = weakreference_sub1s;
		for (int i = 0; i < weakreference_sub1s_20_.length; i++) {
			WeakReference_Sub1 weakreference_sub1_21_;
			for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s_20_[i]; weakreference_sub1 != null; weakreference_sub1 = weakreference_sub1_21_) {
				weakreference_sub1_21_ = weakreference_sub1.aWeakReference_Sub1_11882;
				int i_22_ = (weakreference_sub1.anInt11883 * 1368990721 & aWeakReference_Sub1Array812.length - 1);
				weakreference_sub1.aWeakReference_Sub1_11882 = aWeakReference_Sub1Array812[i_22_];
				aWeakReference_Sub1Array812[i_22_] = weakreference_sub1;
			}
		}
	}

	void method1524() {
		WeakReference_Sub1[] weakreference_sub1s = aWeakReference_Sub1Array812;
		aWeakReference_Sub1Array812 = new WeakReference_Sub1[2 * weakreference_sub1s.length];
		WeakReference_Sub1[] weakreference_sub1s_23_ = weakreference_sub1s;
		for (int i = 0; i < weakreference_sub1s_23_.length; i++) {
			WeakReference_Sub1 weakreference_sub1_24_;
			for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s_23_[i]; weakreference_sub1 != null; weakreference_sub1 = weakreference_sub1_24_) {
				weakreference_sub1_24_ = weakreference_sub1.aWeakReference_Sub1_11882;
				int i_25_ = (weakreference_sub1.anInt11883 * 1368990721 & aWeakReference_Sub1Array812.length - 1);
				weakreference_sub1.aWeakReference_Sub1_11882 = aWeakReference_Sub1Array812[i_25_];
				aWeakReference_Sub1Array812[i_25_] = weakreference_sub1;
			}
		}
	}

	void method1525() {
		WeakReference_Sub1[] weakreference_sub1s = aWeakReference_Sub1Array812;
		aWeakReference_Sub1Array812 = new WeakReference_Sub1[2 * weakreference_sub1s.length];
		WeakReference_Sub1[] weakreference_sub1s_26_ = weakreference_sub1s;
		for (int i = 0; i < weakreference_sub1s_26_.length; i++) {
			WeakReference_Sub1 weakreference_sub1_27_;
			for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s_26_[i]; weakreference_sub1 != null; weakreference_sub1 = weakreference_sub1_27_) {
				weakreference_sub1_27_ = weakreference_sub1.aWeakReference_Sub1_11882;
				int i_28_ = (weakreference_sub1.anInt11883 * 1368990721 & aWeakReference_Sub1Array812.length - 1);
				weakreference_sub1.aWeakReference_Sub1_11882 = aWeakReference_Sub1Array812[i_28_];
				aWeakReference_Sub1Array812[i_28_] = weakreference_sub1;
			}
		}
	}

	void method1526() {
		for (;;) {
			WeakReference_Sub1 weakreference_sub1 = (WeakReference_Sub1) aReferenceQueue813.poll();
			if (weakreference_sub1 == null)
				break;
			int i = (weakreference_sub1.anInt11883 * 1368990721 & aWeakReference_Sub1Array812.length - 1);
			WeakReference_Sub1 weakreference_sub1_29_ = aWeakReference_Sub1Array812[i];
			if (weakreference_sub1_29_ == weakreference_sub1) {
				aWeakReference_Sub1Array812[i] = weakreference_sub1.aWeakReference_Sub1_11882;
				anInt814 -= -842271715;
			} else {
				for (/**/; (null != weakreference_sub1_29_ && (weakreference_sub1_29_.aWeakReference_Sub1_11882 != weakreference_sub1)); weakreference_sub1_29_ = weakreference_sub1_29_.aWeakReference_Sub1_11882) {
					/* empty */
				}
				if (null != weakreference_sub1_29_) {
					weakreference_sub1_29_.aWeakReference_Sub1_11882 = weakreference_sub1.aWeakReference_Sub1_11882;
					anInt814 -= -842271715;
				}
			}
		}
	}

	public void method1527(Object object, byte i) {
		if (null == object)
			throw new NullPointerException();
		method1510(-1344775229);
		int i_30_ = System.identityHashCode(object);
		int i_31_ = i_30_ & aWeakReference_Sub1Array812.length - 1;
		WeakReference_Sub1 weakreference_sub1 = aWeakReference_Sub1Array812[i_31_];
		if (null != weakreference_sub1) {
			if (weakreference_sub1.get() == object) {
				aWeakReference_Sub1Array812[i_31_] = weakreference_sub1.aWeakReference_Sub1_11882;
				anInt814 -= -842271715;
			} else {
				for (;;) {
					WeakReference_Sub1 weakreference_sub1_32_ = weakreference_sub1.aWeakReference_Sub1_11882;
					if (null == weakreference_sub1_32_)
						break;
					if (weakreference_sub1_32_.get() == object) {
						weakreference_sub1.aWeakReference_Sub1_11882 = weakreference_sub1_32_.aWeakReference_Sub1_11882;
						anInt814 -= -842271715;
						break;
					}
					weakreference_sub1 = weakreference_sub1_32_;
				}
			}
		}
	}

	public Class74() {
		aWeakReference_Sub1Array812 = new WeakReference_Sub1[16];
	}

	static void method1528(int i) {
		int i_33_ = Class170.anInt1833 * 2141365743;
		int i_34_ = Class254.anInt2742 * -495986435;
		if (-1308828521 * client.anInt5668 < i_33_)
			i_33_ = -1308828521 * client.anInt5668;
		if (Class391.anInt4023 * 60613197 < i_34_)
			i_34_ = Class391.anInt4023 * 60613197;
		try {
			if (Class449.aClass523_Sub33_4946 != null)
				Class402.aClass402_4160.method6581((new Object[] { Integer.valueOf(i_33_), Integer.valueOf(i_34_), Integer.valueOf(Class316.method5685(-674060660)), Integer.valueOf(Class449.aClass523_Sub33_4946.aClass687_Sub42_10612.method17130(953947574)) }), 1110911038);
		} catch (Throwable throwable) {
			/* empty */
		}
	}

	public static boolean method1529(int i) {
		if (Class509.aString5723.startsWith("win")) {
			String string = "msvcr110.dll";
			String string_35_ = "msvcp110.dll";
			String[] strings = { string, string_35_ };
			String string_36_ = System.getenv("WINDIR");
			if (string_36_ == "")
				return false;
			for (int i_37_ = 0; i_37_ < strings.length; i_37_++) {
				File file = new File(new StringBuilder().append(string_36_).append("\\system32\\").append(strings[i_37_]).toString());
				if (!file.exists() || file.isDirectory())
					return false;
			}
			return true;
		}
		if (Class509.aString5723.startsWith("mac")) {
			boolean bool;
			try {
				Process process = Runtime.getRuntime().exec("ps -few");
				BufferedReader bufferedreader = (new BufferedReader(new InputStreamReader(process.getInputStream())));
				do {
					boolean bool_38_;
					try {
						int i_39_ = process.waitFor();
						if (i_39_ == 0)
							break;
						bool_38_ = false;
					} catch (InterruptedException interruptedexception) {
						return false;
					}
					return bool_38_;
				} while (false);
				boolean bool_40_ = false;
				while_175_: do {
					String string;
					do {
						if ((string = bufferedreader.readLine()) == null)
							break while_175_;
					} while (string.toLowerCase().indexOf("soundflowerbed") == -1);
					bool_40_ = true;
				} while (false);
				bufferedreader.close();
				bool = bool_40_;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		return false;
	}
}
