/* Class59 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

class Class59 implements Iterator {
	int anInt754;
	Class58 this$0;
	public static int anInt755;

	public Object next() {
		return (this$0.anInterface13Array750[(anInt754 += 2146313801) * 1199221753 - 1]);
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public boolean method1394() {
		return anInt754 * 1199221753 < this$0.anInterface13Array750.length;
	}

	public boolean hasNext() {
		return anInt754 * 1199221753 < this$0.anInterface13Array750.length;
	}

	public boolean method1395() {
		return anInt754 * 1199221753 < this$0.anInterface13Array750.length;
	}

	public boolean method1396() {
		return anInt754 * 1199221753 < this$0.anInterface13Array750.length;
	}

	Class59(Class58 class58) {
		this$0 = class58;
	}

	public boolean method1397() {
		return anInt754 * 1199221753 < this$0.anInterface13Array750.length;
	}

	public Object method1398() {
		return (this$0.anInterface13Array750[(anInt754 += 2146313801) * 1199221753 - 1]);
	}

	public void method1399() {
		throw new UnsupportedOperationException();
	}

	public void method1400() {
		throw new UnsupportedOperationException();
	}

	public static void method1401(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, byte i_7_) {
		if (i_0_ >= 0 && i_1_ >= 0 && i_0_ < client.aClass505_11019.method8292((byte) 97) - 1 && i_1_ < client.aClass505_11019.method8235(2137422130) - 1) {
			if (client.aClass505_11019.method8241((byte) -104) != null) {
				if (i_2_ == 0) {
					Interface61 interface61 = ((Interface61) client.aClass505_11019.method8241((byte) -55).method9280(i, i_0_, i_1_, 485590577));
					Interface61 interface61_8_ = ((Interface61) client.aClass505_11019.method8241((byte) -76).method9395(i, i_0_, i_1_, (byte) 4));
					if (null != interface61 && i_3_ != 2) {
						if (interface61 instanceof Class647_Sub1_Sub4_Sub2)
							((Class647_Sub1_Sub4_Sub2) interface61).aClass529_12032.method8736(i_5_, i_6_, 1470924658);
						else
							Class461.method7509(i, i_2_, i_0_, i_1_, interface61.method401(-770473736), i_4_, i_3_, i_5_, i_6_, 611330696);
					}
					if (interface61_8_ != null) {
						if (interface61_8_ instanceof Class647_Sub1_Sub4_Sub2)
							((Class647_Sub1_Sub4_Sub2) interface61_8_).aClass529_12032.method8736(i_5_, i_6_, 1654087322);
						else
							Class461.method7509(i, i_2_, i_0_, i_1_, interface61_8_.method401(-770473736), i_4_, i_3_, i_5_, i_6_, 611330696);
					}
				} else if (1 == i_2_) {
					Interface61 interface61 = ((Interface61) client.aClass505_11019.method8241((byte) -1).method9284(i, i_0_, i_1_, (byte) 41));
					if (null != interface61) {
						if (interface61 instanceof Class647_Sub1_Sub1_Sub2)
							((Class647_Sub1_Sub1_Sub2) interface61).aClass529_12010.method8736(i_5_, i_6_, 1521264777);
						else {
							int i_9_ = interface61.method401(-770473736);
							if (4 == i_3_ || 5 == i_3_)
								Class461.method7509(i, i_2_, i_0_, i_1_, i_9_, i_4_, 4, i_5_, i_6_, 611330696);
							else if (6 == i_3_)
								Class461.method7509(i, i_2_, i_0_, i_1_, i_9_, i_4_ + 4, 4, i_5_, i_6_, 611330696);
							else if (7 == i_3_)
								Class461.method7509(i, i_2_, i_0_, i_1_, i_9_, 4 + (i_4_ + 2 & 0x3), 4, i_5_, i_6_, 611330696);
							else if (i_3_ == 8) {
								Class461.method7509(i, i_2_, i_0_, i_1_, i_9_, i_4_ + 4, 4, i_5_, i_6_, 611330696);
								Class461.method7509(i, i_2_, i_0_, i_1_, i_9_, (2 + i_4_ & 0x3) + 4, 4, i_5_, i_6_, 611330696);
							}
						}
					}
				} else if (2 == i_2_) {
					Interface61 interface61 = ((Interface61) (client.aClass505_11019.method8241((byte) -16).method9295(i, i_0_, i_1_, client.anInterface63_11296, (byte) -15)));
					if (interface61 != null) {
						if (i_3_ == 11)
							i_3_ = 10;
						if (interface61 instanceof Class647_Sub1_Sub3_Sub2)
							((Class647_Sub1_Sub3_Sub2) interface61).aClass529_11983.method8736(i_5_, i_6_, 1300535734);
						else
							Class461.method7509(i, i_2_, i_0_, i_1_, interface61.method401(-770473736), i_4_, i_3_, i_5_, i_6_, 611330696);
					}
				} else if (i_2_ == 3) {
					Interface61 interface61 = ((Interface61) client.aClass505_11019.method8241((byte) -113).method9398(i, i_0_, i_1_, -1623203685));
					if (null != interface61) {
						if (interface61 instanceof Class647_Sub1_Sub2_Sub1)
							((Class647_Sub1_Sub2_Sub1) interface61).aClass529_11986.method8736(i_5_, i_6_, 1654542423);
						else
							Class461.method7509(i, i_2_, i_0_, i_1_, interface61.method401(-770473736), i_4_, i_3_, i_5_, i_6_, 611330696);
					}
				}
			}
		}
	}
}
