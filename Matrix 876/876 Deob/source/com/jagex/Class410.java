/* Class410 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

public class Class410 {
	static final int anInt4524 = 2;
	static final int anInt4525 = 3;
	static final int anInt4526 = 4;
	static final int anInt4527 = 6;
	static final int anInt4528 = 10;
	static final int anInt4529 = 9;
	static final int anInt4530 = 11;
	static final int anInt4531 = 13;
	static final int anInt4532 = 12;
	static final int anInt4533 = 7;
	static final int anInt4534 = 5;
	static final int anInt4535 = 1;
	static final int anInt4536 = 8;

	Class410() throws Throwable {
		throw new Error();
	}

	static final void method6631(Class669 class669, byte i) {
		class669.anInt8558 -= -17422498;
		int i_0_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_1_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 1];
		Class677 class677;
		if (class669.aBool8570)
			class677 = class669.aClass677_8566;
		else
			class677 = class669.aClass677_8574;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (i_1_ != -1 && class677.method13770(i_0_, i_1_, (short) -644) ? 1 : 0);
	}

	public static void method6632(int i) {
		if (Class310.aFrame3385 == null) {
			int i_2_ = client.anInt5660 * -1901078577;
			int i_3_ = -1734289153 * client.anInt5670;
			int i_4_ = (-1308828521 * client.anInt5668 - 2141365743 * Class170.anInt1833 - i_2_);
			int i_5_ = (Class391.anInt4023 * 60613197 - -495986435 * Class254.anInt2742 - i_3_);
			if (i_2_ > 0 || i_4_ > 0 || i_3_ > 0 || i_5_ > 0) {
				try {
					Container container = JS5Protocol.method7486(-1815101702);
					int i_6_ = 0;
					int i_7_ = 0;
					if (client.aFrame5672 == container) {
						Insets insets = client.aFrame5672.getInsets();
						i_6_ = insets.left;
						i_7_ = insets.top;
					}
					Graphics graphics = container.getGraphics();
					graphics.setColor(Color.black);
					if (i_2_ > 0)
						graphics.fillRect(i_6_, i_7_, i_2_, 60613197 * Class391.anInt4023);
					if (i_3_ > 0)
						graphics.fillRect(i_6_, i_7_, -1308828521 * client.anInt5668, i_3_);
					if (i_4_ > 0)
						graphics.fillRect((i_6_ + -1308828521 * client.anInt5668 - i_4_), i_7_, i_4_, Class391.anInt4023 * 60613197);
					if (i_5_ > 0)
						graphics.fillRect(i_6_, (i_7_ + 60613197 * Class391.anInt4023 - i_5_), client.anInt5668 * -1308828521, i_5_);
				} catch (Exception exception) {
					/* empty */
				}
			}
		}
	}

	static final void method6633(Class669 class669, int i) {
		int i_8_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_8_, -2030081177);
		JS5ArchiveReference.method1232(class250, class669, 639524436);
	}

	static final void method6634(Class669 class669, int i) throws Exception_Sub7 {
		class669.anInt8558 -= -34844996;
		float f = (float) class669.anIntArray8557[1357652815 * class669.anInt8558];
		float f_9_ = (float) (class669.anIntArray8557[1 + class669.anInt8558 * 1357652815]);
		float f_10_ = (float) (class669.anIntArray8557[1357652815 * class669.anInt8558 + 2]);
		float f_11_ = ((float) (class669.anIntArray8557[3 + 1357652815 * class669.anInt8558]) / 1000.0F);
		Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5458(Class437.method6879(f, f_9_, f_10_), f_11_, (byte) -10);
	}
}
