/* Class195 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Class195 {
	static Class195 aClass195_2188;
	static Class195 aClass195_2189 = new Class195();
	static Class195 aClass195_2190 = new Class195();
	public static Class472 aClass472_2191;

	Class195() {
		/* empty */
	}

	static {
		aClass195_2188 = new Class195();
	}

	public static final void method3661(int i, String string, Color color, Color color_0_, Color color_1_, int i_2_) {
		try {
			Graphics graphics = Class523_Sub18_Sub8.aCanvas11689.getGraphics();
			if (Class220.aFont2330 == null)
				Class220.aFont2330 = new Font("Helvetica", 1, 13);
			if (color == null)
				color = new Color(140, 17, 17);
			if (null == color_0_)
				color_0_ = new Color(140, 17, 17);
			if (null == color_1_)
				color_1_ = new Color(255, 255, 255);
			try {
				if (null == Class268.anImage2868)
					Class268.anImage2868 = (Class523_Sub18_Sub8.aCanvas11689.createImage(Class170.anInt1833 * 2141365743, Class254.anInt2742 * -495986435));
				Graphics graphics_3_ = Class268.anImage2868.getGraphics();
				graphics_3_.setColor(Color.black);
				graphics_3_.fillRect(0, 0, 2141365743 * Class170.anInt1833, Class254.anInt2742 * -495986435);
				int i_4_ = Class170.anInt1833 * 2141365743 / 2 - 152;
				int i_5_ = -495986435 * Class254.anInt2742 / 2 - 18;
				graphics_3_.setColor(color_0_);
				graphics_3_.drawRect(i_4_, i_5_, 303, 33);
				graphics_3_.setColor(color);
				graphics_3_.fillRect(i_4_ + 2, i_5_ + 2, 3 * i, 30);
				graphics_3_.setColor(Color.black);
				graphics_3_.drawRect(i_4_ + 1, i_5_ + 1, 301, 31);
				graphics_3_.fillRect(3 * i + (2 + i_4_), i_5_ + 2, 300 - i * 3, 30);
				graphics_3_.setFont(Class220.aFont2330);
				graphics_3_.setColor(color_1_);
				graphics_3_.drawString(string, i_4_ + (304 - string.length() * 6) / 2, 22 + i_5_);
				if (null != Class506.aString5671) {
					graphics_3_.setFont(Class220.aFont2330);
					graphics_3_.setColor(color_1_);
					graphics_3_.drawString(Class506.aString5671, (2141365743 * Class170.anInt1833 / 2 - (Class506.aString5671.length() * 6 / 2)), (Class254.anInt2742 * -495986435 / 2 - 26));
				}
				graphics.drawImage(Class268.anImage2868, 0, 0, null);
			} catch (Exception exception) {
				graphics.setColor(Color.black);
				graphics.fillRect(0, 0, 2141365743 * Class170.anInt1833, Class254.anInt2742 * -495986435);
				int i_6_ = 2141365743 * Class170.anInt1833 / 2 - 152;
				int i_7_ = Class254.anInt2742 * -495986435 / 2 - 18;
				graphics.setColor(color_0_);
				graphics.drawRect(i_6_, i_7_, 303, 33);
				graphics.setColor(color);
				graphics.fillRect(2 + i_6_, 2 + i_7_, 3 * i, 30);
				graphics.setColor(Color.black);
				graphics.drawRect(1 + i_6_, i_7_ + 1, 301, 31);
				graphics.fillRect(2 + i_6_ + 3 * i, i_7_ + 2, 300 - i * 3, 30);
				graphics.setFont(Class220.aFont2330);
				graphics.setColor(color_1_);
				if (Class506.aString5671 != null) {
					graphics.setFont(Class220.aFont2330);
					graphics.setColor(color_1_);
					graphics.drawString(Class506.aString5671, (Class170.anInt1833 * 2141365743 / 2 - (Class506.aString5671.length() * 6 / 2)), (-495986435 * Class254.anInt2742 / 2 - 26));
				}
				graphics.drawString(string, i_6_ + (304 - string.length() * 6) / 2, 22 + i_7_);
			}
		} catch (Exception exception) {
			Class523_Sub18_Sub8.aCanvas11689.repaint();
		}
	}

	static final void method3662(Class669 class669, byte i) {
		int i_8_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_8_, -405694475);
		Class242 class242 = Class31.aClass242Array302[i_8_ >> 16];
		Class30.method894(class250, class242, class669, -881495820);
	}

	static final void method3663(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class613.method10054(class250, class242, class669, -1448299598);
	}

	static final void method3664(Class669 class669, int i) {
		int i_9_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub6_10620.method13890(i_9_, 2078531136);
	}

	static void method3665(byte i) {
		Class43.aClass116_568.method1998(1499231543);
		Class43.aClass116_568.updateBuffer.offset = 0;
		Class43.aClass116_568.aClass409_1417 = null;
		Class43.aClass116_568.aClass409_1430 = null;
		Class43.aClass116_568.aClass409_1426 = null;
		Class43.aClass116_568.anInt1423 = 0;
		client.anInt11063 = 0;
		client.anInt11235 = 0;
		client.anInt11287 = 0;
		client.anInt11078 = 0;
		client.friendsChatName = null;
		Class365.anInt3866 = 0;
		Class99.aClass115Array1232 = null;
		Class143.aClass334_1693 = null;
		Class194_Sub6.aClass334_9900 = null;
		client.aBool11302 = true;
		Class523_Sub27_Sub5.method17954(-420143751);
		for (int i_10_ = 0; (i_10_ < Class98_Sub1_Sub2.playerVarsProvider.aClass635Array1349.length); i_10_++) {
			Class635 class635 = new Class635(Class551.aClass600_7467.method9866(i_10_, 1539175566), false);
			class635.method10421(0, (byte) -25);
			class635.method10420(0, -2053234813);
			Class98_Sub1_Sub2.playerVarsProvider.aClass635Array1349[i_10_] = class635;
		}
		Class98_Sub1_Sub2.playerVarsProvider.aClass590_1348.method9755(-352566129);
		Class493.method8089(-1792528392);
		PacketsDecoder.method4264(Class43.aClass116_568, 990108506);
	}
}
