/* Class648 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Container;
import java.awt.Insets;
import java.net.InetAddress;
import java.util.LinkedList;
import java.util.Queue;

import jaclib.ping.Ping;

public class Class648 implements Runnable {
	Object anObject8375 = new Object();
	Thread aThread8376;
	Queue aQueue8377 = new LinkedList();
	public static RSSocket aClass1_8378;
	static Class10 aClass10_8379;

	public void method10602() {
		for (;;) {
			Class640 class640;
			synchronized (aQueue8377) {
				Object object;
				for (object = aQueue8377.poll(); object == null; object = aQueue8377.poll()) {
					try {
						aQueue8377.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				if (object == anObject8375)
					break;
				class640 = (Class640) object;
			}
			int i;
			try {
				byte[] is = InetAddress.getByName(class640.aString8315).getAddress();
				i = Ping.method639(is[0], is[1], is[2], is[3], 1000L);
			} catch (Throwable throwable) {
				i = 1000;
			}
			class640.anInt8314 = i * -1132818455;
		}
	}

	public Class640 method10603(String string) {
		if (null == aThread8376)
			throw new IllegalStateException("");
		if (null == string)
			throw new IllegalArgumentException("");
		Class640 class640 = new Class640(string);
		method10608(class640, 601995848);
		return class640;
	}

	public void method10604(int i) {
		if (null != aThread8376) {
			method10608(anObject8375, -624165150);
			try {
				aThread8376.join();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			aThread8376 = null;
		}
	}

	public void method10605() {
		for (;;) {
			Class640 class640;
			synchronized (aQueue8377) {
				Object object;
				for (object = aQueue8377.poll(); object == null; object = aQueue8377.poll()) {
					try {
						aQueue8377.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				if (object == anObject8375)
					break;
				class640 = (Class640) object;
			}
			int i;
			try {
				byte[] is = InetAddress.getByName(class640.aString8315).getAddress();
				i = Ping.method639(is[0], is[1], is[2], is[3], 1000L);
			} catch (Throwable throwable) {
				i = 1000;
			}
			class640.anInt8314 = i * -1132818455;
		}
	}

	public void run() {
		for (;;) {
			Class640 class640;
			synchronized (aQueue8377) {
				Object object;
				for (object = aQueue8377.poll(); object == null; object = aQueue8377.poll()) {
					try {
						aQueue8377.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				if (object == anObject8375)
					break;
				class640 = (Class640) object;
			}
			int i;
			try {
				byte[] is = InetAddress.getByName(class640.aString8315).getAddress();
				i = Ping.method639(is[0], is[1], is[2], is[3], 1000L);
			} catch (Throwable throwable) {
				i = 1000;
			}
			class640.anInt8314 = i * -1132818455;
		}
	}

	public Class640 method10606(String string, short i) {
		if (null == aThread8376)
			throw new IllegalStateException("");
		if (null == string)
			throw new IllegalArgumentException("");
		Class640 class640 = new Class640(string);
		method10608(class640, 963119989);
		return class640;
	}

	public Class648() {
		aThread8376 = new Thread(this);
		aThread8376.setDaemon(true);
		aThread8376.start();
	}

	public Class640 method10607(String string) {
		if (null == aThread8376)
			throw new IllegalStateException("");
		if (null == string)
			throw new IllegalArgumentException("");
		Class640 class640 = new Class640(string);
		method10608(class640, -1212739975);
		return class640;
	}

	void method10608(Object object, int i) {
		synchronized (aQueue8377) {
			aQueue8377.add(object);
			aQueue8377.notify();
		}
	}

	public void method10609() {
		if (null != aThread8376) {
			method10608(anObject8375, 1058022803);
			try {
				aThread8376.join();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			aThread8376 = null;
		}
	}

	void method10610(Object object) {
		synchronized (aQueue8377) {
			aQueue8377.add(object);
			aQueue8377.notify();
		}
	}

	void method10611(Object object) {
		synchronized (aQueue8377) {
			aQueue8377.add(object);
			aQueue8377.notify();
		}
	}

	public static String method10612(long l, int i, boolean bool, Class668 class668, int i_0_) {
		char c = ',';
		char c_1_ = '.';
		if (class668 == Class668.aClass668_8548) {
			c = '.';
			c_1_ = ',';
		}
		if (class668 == Class668.aClass668_8550)
			c_1_ = '\u00a0';
		boolean bool_2_ = false;
		if (l < 0L) {
			bool_2_ = true;
			l = -l;
		}
		StringBuilder stringbuilder = new StringBuilder(26);
		if (i > 0) {
			for (int i_3_ = 0; i_3_ < i; i_3_++) {
				int i_4_ = (int) l;
				l /= 10L;
				stringbuilder.append((char) (48 + i_4_ - (int) l * 10));
			}
			stringbuilder.append(c);
		}
		int i_5_ = 0;
		for (;;) {
			int i_6_ = (int) l;
			l /= 10L;
			stringbuilder.append((char) (48 + i_6_ - (int) l * 10));
			if (0L == l)
				break;
			if (bool) {
				i_5_++;
				if (0 == i_5_ % 3)
					stringbuilder.append(c_1_);
			}
		}
		if (bool_2_)
			stringbuilder.append('-');
		return stringbuilder.reverse().toString();
	}

	static final void method10613(Class669 class669, int i) {
		long l = TimeUtils.getCurrentTimeMilliseconds(1516375036);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (int) (l / 86400000L) - 11745;
	}

	public static int method10614(CharSequence charsequence, int i, int i_7_) {
		return Class221.method4136(charsequence, i, true, -1539087404);
	}

	static void method10615(int i) {
		synchronized (Class472.aclient5375) {
			if (null != Class310.aFrame3385) {
				/* empty */
			} else {
				Container container = JS5Protocol.method7486(-1849052048);
				if (container == null) {
					/* empty */
				} else {
					client.anInt5668 = container.getSize().width * -642489561;
					Class391.anInt4023 = container.getSize().height * 1795368581;
					if (container == client.aFrame5672) {
						Insets insets = client.aFrame5672.getInsets();
						client.anInt5668 -= -642489561 * (insets.left + insets.right);
						Class391.anInt4023 -= 1795368581 * (insets.bottom + insets.top);
					}
					if (-1308828521 * client.anInt5668 <= 0)
						client.anInt5668 = -642489561;
					if (60613197 * Class391.anInt4023 <= 0)
						Class391.anInt4023 = 1795368581;
					if (Class316.method5685(1208934713) != 1)
						Class431.method6787((byte) 85);
					else {
						Class170.anInt1833 = client.anInt11036 * 1587800733;
						client.anInt5660 = -2061906129 * ((-1308828521 * client.anInt5668 - 1536768403 * client.anInt11036) / 2);
						Class254.anInt2742 = client.anInt11151 * 492857679;
						client.anInt5670 = 0;
					}
					if (Class80.aClass674_865 != Class674.aClass674_8613 && Class170.anInt1833 * 2141365743 < 1024 && Class254.anInt2742 * -495986435 >= 768) {
						/* empty */
					}
					Class523_Sub18_Sub8.aCanvas11689.setSize(Class170.anInt1833 * 2141365743, -495986435 * Class254.anInt2742);
					if (null != Class31.aClass178_303) {
						Class31.aClass178_303.method3045(Class523_Sub18_Sub8.aCanvas11689, 2141365743 * Class170.anInt1833, Class254.anInt2742 * -495986435, 2045987292);
						Class241.method4362(Class31.aClass178_303, TimeUtils.getCurrentTimeMilliseconds(1516375036));
					}
					if (container == client.aFrame5672) {
						Insets insets = client.aFrame5672.getInsets();
						Class523_Sub18_Sub8.aCanvas11689.setLocation(insets.left + client.anInt5660 * -1901078577, insets.top + -1734289153 * client.anInt5670);
					} else
						Class523_Sub18_Sub8.aCanvas11689.setLocation(-1901078577 * client.anInt5660, client.anInt5670 * -1734289153);
					Class74.method1528(149074203);
					if (client.anInt11186 * -1614846429 != -1)
						Class284.method5142(true, (byte) 100);
					Class410.method6632(1913818916);
				}
			}
		}
	}

	static void method10616(int i) {
		for (Class523_Sub27_Sub8 class523_sub27_sub8 = ((Class523_Sub27_Sub8) Class36.aClass697_339.first(-1426448868)); class523_sub27_sub8 != null; class523_sub27_sub8 = ((Class523_Sub27_Sub8) Class36.aClass697_339.next(768418218))) {
			if (1060081949 * class523_sub27_sub8.anInt11719 > 1) {
				class523_sub27_sub8.anInt11719 = 0;
				Class36.aClass209_335.method3770(class523_sub27_sub8, ((((Class523_Sub27_Sub6) (class523_sub27_sub8.aClass697_11718.aClass523_Sub27_8763.aClass523_Sub27_10551)).aLong11628) * 5220346430341563535L));
				class523_sub27_sub8.aClass697_11718.removeFromQueue(-557059876);
			}
		}
		Class36.anInt336 = 0;
		Class36.anInt330 = 0;
		Class36.aClass708_342.method14235((byte) -105);
		Class36.aClass14_338.method733(-2073496441);
		Class36.aClass697_339.removeFromQueue(-528964530);
		Class232.method4258(Class36.aClass523_Sub27_Sub6_329, -2060365956);
	}

	static Class406[] method10617(int i) {
		return (new Class406[] { Class406.aClass406_4194, Class406.aClass406_4187, Class406.aClass406_4185, Class406.aClass406_4192, Class406.aClass406_4184, Class406.aClass406_4188, Class406.aClass406_4193, Class406.aClass406_4196, Class406.aClass406_4189, Class406.aClass406_4186, Class406.aClass406_4191, Class406.aClass406_4195 });
	}
}
