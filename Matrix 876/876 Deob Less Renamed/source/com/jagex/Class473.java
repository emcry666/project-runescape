/* Class473 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class473 {
	static final int anInt5376 = 0;
	Class472 aClass472_5377;
	Class209 aClass209_5378 = new Class209(64);
	Class472 aClass472_5379;
	static final int anInt5380 = 32768;

	public Class523_Sub27_Sub10 method7738(int i) {
		Class523_Sub27_Sub10 class523_sub27_sub10 = (Class523_Sub27_Sub10) aClass209_5378.method3767((long) i);
		if (null != class523_sub27_sub10)
			return class523_sub27_sub10;
		byte[] is;
		if (i >= 32768)
			is = aClass472_5377.method7688(0, i & 0x7fff, -1551887191);
		else
			is = aClass472_5379.method7688(0, i, -1687837406);
		class523_sub27_sub10 = new Class523_Sub27_Sub10();
		if (is != null)
			class523_sub27_sub10.method18092(new Class523_Sub34(is), 326189351);
		if (i >= 32768)
			class523_sub27_sub10.method18098(406319113);
		aClass209_5378.method3770(class523_sub27_sub10, (long) i);
		return class523_sub27_sub10;
	}

	public Class523_Sub27_Sub10 method7739(int i, byte i_0_) {
		Class523_Sub27_Sub10 class523_sub27_sub10 = (Class523_Sub27_Sub10) aClass209_5378.method3767((long) i);
		if (null != class523_sub27_sub10)
			return class523_sub27_sub10;
		byte[] is;
		if (i >= 32768)
			is = aClass472_5377.method7688(0, i & 0x7fff, 174569905);
		else
			is = aClass472_5379.method7688(0, i, 1196707631);
		class523_sub27_sub10 = new Class523_Sub27_Sub10();
		if (is != null)
			class523_sub27_sub10.method18092(new Class523_Sub34(is), 519310859);
		if (i >= 32768)
			class523_sub27_sub10.method18098(-1619601124);
		aClass209_5378.method3770(class523_sub27_sub10, (long) i);
		return class523_sub27_sub10;
	}

	public Class523_Sub27_Sub10 method7740(int i) {
		Class523_Sub27_Sub10 class523_sub27_sub10 = (Class523_Sub27_Sub10) aClass209_5378.method3767((long) i);
		if (null != class523_sub27_sub10)
			return class523_sub27_sub10;
		byte[] is;
		if (i >= 32768)
			is = aClass472_5377.method7688(0, i & 0x7fff, 1203964638);
		else
			is = aClass472_5379.method7688(0, i, -1310902411);
		class523_sub27_sub10 = new Class523_Sub27_Sub10();
		if (is != null)
			class523_sub27_sub10.method18092(new Class523_Sub34(is), -121100580);
		if (i >= 32768)
			class523_sub27_sub10.method18098(-1586085614);
		aClass209_5378.method3770(class523_sub27_sub10, (long) i);
		return class523_sub27_sub10;
	}

	public Class473(Class668 class668, Class472 class472, Class472 class472_1_) {
		aClass472_5379 = class472;
		aClass472_5377 = class472_1_;
		if (aClass472_5379 != null)
			aClass472_5379.method7702(0, (byte) -11);
		if (null != aClass472_5377)
			aClass472_5377.method7702(0, (byte) -5);
	}

	static boolean method7741(Class250 class250, byte i) {
		Class523_Sub13 class523_sub13 = client.method17252(class250);
		if (class523_sub13.method15968(1590314918) > 0)
			return true;
		if (class523_sub13.method15967((byte) 31))
			return true;
		if (null != class250.aClass250_2685)
			return true;
		return false;
	}
}
