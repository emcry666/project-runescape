/* Class248 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class TimeUtils {
	static long lastTimeMillis;
	static long currentTimeMillis;
	static int anInt2491;
	public static Class53_Sub13 aClass53_Sub13_2492;

	public static final synchronized long getCurrentTimeMilliseconds(int i) {
		long current = System.currentTimeMillis();
		if (current < lastTimeMillis * 4123891831407052887L)
			currentTimeMillis += ((lastTimeMillis * 4123891831407052887L - current) * -6630643733881053103L);
		lastTimeMillis = current * -1663413125325626521L;
		return -998251357890434895L * currentTimeMillis + current;
	}

	TimeUtils() throws Throwable {
		throw new Error();
	}

	public static int method4405(byte i) {
		return Class323.aTwitchTV3452.GetStreamState();
	}
}
