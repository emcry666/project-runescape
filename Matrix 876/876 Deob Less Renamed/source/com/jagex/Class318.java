/* Class318 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Container;
import java.awt.Insets;

public class Class318 {
	String aString3427;
	String aString3428;
	String aString3429;
	static int[] anIntArray3430;
	static boolean aBool3431;

	Class318(String string, String string_0_, String string_1_) {
		aString3427 = string;
		aString3428 = string_0_;
		aString3429 = string_1_;
	}

	static final void method5690(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class213.method3834(class250, class242, class669, 1918409087);
	}

	public static boolean method5691(int i, int i_2_) {
		return i == (i & -i);
	}

	public static void method5692(byte i) {
		Container container = Class458.method7486(-1675585370);
		int i_3_ = container.getSize().width;
		int i_4_ = container.getSize().height;
		if (container == client.aFrame5672) {
			Insets insets = client.aFrame5672.getInsets();
			i_3_ -= insets.left + insets.right;
			i_4_ -= insets.bottom + insets.top;
		}
		if (i_3_ != -1308828521 * client.anInt5668 || 60613197 * Class391.anInt4023 != i_4_ || client.aBool11133) {
			if (null == Class31.aClass178_303 || Class31.aClass178_303.method3244())
				Class648.method10615(-1265533506);
			else {
				client.anInt5668 = i_3_ * -642489561;
				Class391.anInt4023 = i_4_ * 1795368581;
			}
			client.aLong11146 = ((Class248.method4401(1516375036) + 500L) * -7429034141385127915L);
			client.aBool11133 = false;
		}
	}

	static final void method5693(Class250 class250, Class242 class242, Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		if (Class594.method9807(string, class669, (byte) 0) != null)
			string = string.substring(0, string.length() - 1);
		class250.anObjectArray2638 = Class78.method1554(string, class669, -68449792);
		class250.aBool2635 = true;
	}

	static boolean method5694(byte i) {
		return 462991943 * Class36.anInt330 > 0;
	}
}
