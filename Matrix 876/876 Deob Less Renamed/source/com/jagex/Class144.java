/* Class144 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

class Class144 implements Runnable {
	Class375_Sub2 this$0;
	static Class690 aClass690_1694;
	public static int anInt1695;

	public void method2373() {
		try {
			while (!this$0.aBool10187) {
				HashMap hashmap = this$0.method15717((byte) 0);
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class478 class478 = (Class478) iterator.next();
					if (!class478.aBool5453) {
						Class477[] class477s = (Class477[]) hashmap.get(class478);
						for (int i = 0; i < class477s.length; i++)
							class477s[i].method7800(-2079462639);
					}
				}
				Class653.method10656(25L);
			}
		} catch (Exception exception) {
			Class305.method5553(null, exception, (byte) 1);
		}
	}

	public void run() {
		try {
			while (!this$0.aBool10187) {
				HashMap hashmap = this$0.method15717((byte) 0);
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class478 class478 = (Class478) iterator.next();
					if (!class478.aBool5453) {
						Class477[] class477s = (Class477[]) hashmap.get(class478);
						for (int i = 0; i < class477s.length; i++)
							class477s[i].method7800(-2076815343);
					}
				}
				Class653.method10656(25L);
			}
		} catch (Exception exception) {
			Class305.method5553(null, exception, (byte) 1);
		}
	}

	public void method2374() {
		try {
			while (!this$0.aBool10187) {
				HashMap hashmap = this$0.method15717((byte) 0);
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class478 class478 = (Class478) iterator.next();
					if (!class478.aBool5453) {
						Class477[] class477s = (Class477[]) hashmap.get(class478);
						for (int i = 0; i < class477s.length; i++)
							class477s[i].method7800(-2060475861);
					}
				}
				Class653.method10656(25L);
			}
		} catch (Exception exception) {
			Class305.method5553(null, exception, (byte) 1);
		}
	}

	Class144(Class375_Sub2 class375_sub2) {
		this$0 = class375_sub2;
	}

	static void method2375(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class74.method1529(-1939429477) ? 1 : 0;
	}

	static final void method2376(Class669 class669, int i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_0_, -1363942778);
		Class242 class242 = Class31.aClass242Array302[i_0_ >> 16];
		Class194_Sub18.method15522(class250, class242, class669, (byte) 63);
	}

	public static byte[] method2377(Object object, int i, int i_1_, int i_2_) {
		if (null == object)
			return null;
		if (object instanceof byte[]) {
			byte[] is = (byte[]) object;
			return Arrays.copyOfRange(is, i, i_1_ + i);
		}
		if (object instanceof ByteBuffer) {
			ByteBuffer bytebuffer = (ByteBuffer) object;
			byte[] is = new byte[i_1_];
			bytebuffer.position(i);
			bytebuffer.get(is, 0, i_1_);
			return is;
		}
		throw new IllegalArgumentException();
	}

	static void method2378(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class260.method4706(-1816893771);
	}

	static boolean method2379(int i) {
		boolean bool = true;
		if (null == Class61.aClass175_768) {
			if (Class523_Sub8.aClass472_10406.method7650(Class114.anInt1403 * 919794579, 564915778))
				Class61.aClass175_768 = Class166.method2659(Class523_Sub8.aClass472_10406, 919794579 * Class114.anInt1403);
			else
				bool = false;
		}
		if (null == Class114.aClass175_1404) {
			if (Class523_Sub8.aClass472_10406.method7650((-407163741 * (Class194_Sub22.anInt9965)), 109037387))
				Class114.aClass175_1404 = Class166.method2659(Class523_Sub8.aClass472_10406, (-407163741 * Class194_Sub22.anInt9965));
			else
				bool = false;
		}
		if (Class330.aClass175_3499 == null) {
			if (Class523_Sub8.aClass472_10406.method7650(-2093088401 * Class614.anInt8024, 572980857))
				Class330.aClass175_3499 = Class166.method2659(Class523_Sub8.aClass472_10406, -2093088401 * Class614.anInt8024);
			else
				bool = false;
		}
		if (null == Class648.aClass10_8379) {
			if (Class272.aClass472_2886.method7650((Class312_Sub3.anInt10069 * 1886219455), -1372797447))
				Class648.aClass10_8379 = (Class491.aClass423_5536.method6688(client.anInterface50_11044, 1886219455 * Class312_Sub3.anInt10069, (byte) -20));
			else
				bool = false;
		}
		if (Class523_Sub14_Sub3.aClass175_Sub2Array11699 == null) {
			if (Class523_Sub8.aClass472_10406.method7650(((Class312_Sub3.anInt10069) * 1886219455), -81447317))
				Class523_Sub14_Sub3.aClass175_Sub2Array11699 = ((Class175_Sub2[]) Class166.method2662(Class523_Sub8.aClass472_10406, (Class312_Sub3.anInt10069 * 1886219455)));
			else
				bool = false;
		}
		return bool;
	}
}
