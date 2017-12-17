/* Class296 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class296 implements Interface32 {
	boolean aBool3178;
	String aString3179;
	List aList3180 = new ArrayList();
	boolean aBool3181;
	boolean aBool3182;
	AffineTransform anAffineTransform3183 = new AffineTransform();
	String aString3184;
	boolean aBool3185;

	public boolean method205(long l) {
		return true;
	}

	public void method195(int i) {
		Class210.method3820(-991717092);
	}

	final int method5269(int i, byte i_0_) {
		if (aBool3182)
			return (Class254.anInt2742 * -495986435 - i) / 2;
		return 0;
	}

	public void method201(boolean bool, int i) {
		if (!aBool3178 && !aBool3185) {
			aBool3185 = true;
			try {
				String[] strings = Class194_Sub13.method15512(client.aString11171, '|', (byte) 3);
				if (strings.length < 3)
					aBool3178 = true;
				else {
					MediaTracker mediatracker = new MediaTracker(Class523_Sub18_Sub8.aCanvas11689);
					int i_1_ = 0;
					for (int i_2_ = 0; i_2_ < strings.length; i_2_++) {
						String[] strings_3_ = Class194_Sub13.method15512(strings[i_2_].trim(), '=', (byte) -15);
						if (strings_3_[0].equals("halign"))
							aBool3181 = Boolean.parseBoolean(strings_3_[1]);
						else if (strings_3_[0].equals("valign"))
							aBool3182 = Boolean.parseBoolean(strings_3_[1]);
						else if (strings_3_[0].equals("image")) {
							String[] strings_4_ = Class194_Sub13.method15512(strings_3_[1], ',', (byte) 92);
							Image image;
							try {
								image = method5272(strings_4_[0], 1000081634);
							} catch (Exception exception) {
								image = null;
							}
							if (image != null) {
								mediatracker.addImage(image, i_1_++);
								aList3180.add(new Class333_Sub2(this, image, Class458_Sub1.method15856(strings_4_[1], (byte) 17), Class458_Sub1.method15856(strings_4_[2], (byte) 40)));
							}
						} else if (strings_3_[0].equals("rotatingimage")) {
							String[] strings_5_ = Class194_Sub13.method15512(strings_3_[1], ',', (byte) 47);
							Image image;
							try {
								image = method5272(strings_5_[0], 1495989384);
							} catch (Exception exception) {
								image = null;
							}
							if (null != image) {
								mediatracker.addImage(image, i_1_++);
								aList3180.add(new Class333_Sub2_Sub1(this, image, Class458_Sub1.method15856(strings_5_[1], (byte) 95), Class458_Sub1.method15856(strings_5_[2], (byte) 125), Float.parseFloat(strings_5_[3])));
							}
						} else if (strings_3_[0].equals("progress")) {
							String[] strings_6_ = Class194_Sub13.method15512(strings_3_[1], ',', (byte) 58);
							aList3180.add(new Class333_Sub1(this, Boolean.parseBoolean(strings_6_[0]), strings_6_[1], Class458_Sub1.method15856(strings_6_[2], (byte) 103), Integer.decode(strings_6_[3]).intValue(), Class458_Sub1.method15856(strings_6_[4], (byte) 17), Class458_Sub1.method15856(strings_6_[5], (byte) 52)));
						}
					}
					mediatracker.waitForAll();
				}
			} catch (Exception exception) {
				aBool3178 = true;
			}
		}
		if (aBool3178)
			method5270((byte) 2);
		else {
			Graphics graphics = Class523_Sub18_Sub8.aCanvas11689.getGraphics();
			if (null != graphics) {
				try {
					aString3184 = new StringBuilder().append("").append(Class661.aClass289_8509.method5197((byte) 11)).append("%").toString();
					aString3179 = Class661.aClass289_8509.method5190((byte) 125);
					if (Class268.anImage2868 == null)
						Class268.anImage2868 = (Class523_Sub18_Sub8.aCanvas11689.createImage(2141365743 * Class170.anInt1833, -495986435 * Class254.anInt2742));
					Graphics graphics_7_ = Class268.anImage2868.getGraphics();
					graphics_7_.setColor(Color.BLACK);
					graphics_7_.fillRect(0, 0, Class170.anInt1833 * 2141365743, -495986435 * Class254.anInt2742);
					Iterator iterator = aList3180.iterator();
					while (iterator.hasNext()) {
						Class333 class333 = (Class333) iterator.next();
						class333.method5845(graphics_7_, -1261460818);
					}
					graphics.drawImage(Class268.anImage2868, 0, 0, null);
				} catch (Exception exception) {
					aBool3178 = true;
				}
			} else
				Class523_Sub18_Sub8.aCanvas11689.repaint();
		}
	}

	public void method200() {
		/* empty */
	}

	void method5270(byte i) {
		Class195.method3661(Class661.aClass289_8509.method5197((byte) 11), Class661.aClass289_8509.method5190((byte) 114), client.aColorArray11035[client.anInt11188 * 1871015145], client.aColorArray11128[1871015145 * client.anInt11188], client.aColorArray11037[client.anInt11188 * 1871015145], -805161290);
	}

	public void method199(boolean bool) {
		if (!aBool3178 && !aBool3185) {
			aBool3185 = true;
			try {
				String[] strings = Class194_Sub13.method15512(client.aString11171, '|', (byte) 83);
				if (strings.length < 3)
					aBool3178 = true;
				else {
					MediaTracker mediatracker = new MediaTracker(Class523_Sub18_Sub8.aCanvas11689);
					int i = 0;
					for (int i_8_ = 0; i_8_ < strings.length; i_8_++) {
						String[] strings_9_ = Class194_Sub13.method15512(strings[i_8_].trim(), '=', (byte) -62);
						if (strings_9_[0].equals("halign"))
							aBool3181 = Boolean.parseBoolean(strings_9_[1]);
						else if (strings_9_[0].equals("valign"))
							aBool3182 = Boolean.parseBoolean(strings_9_[1]);
						else if (strings_9_[0].equals("image")) {
							String[] strings_10_ = Class194_Sub13.method15512(strings_9_[1], ',', (byte) -33);
							Image image;
							try {
								image = method5272(strings_10_[0], 1888159448);
							} catch (Exception exception) {
								image = null;
							}
							if (image != null) {
								mediatracker.addImage(image, i++);
								aList3180.add(new Class333_Sub2(this, image, Class458_Sub1.method15856(strings_10_[1], (byte) 93), Class458_Sub1.method15856(strings_10_[2], (byte) 76)));
							}
						} else if (strings_9_[0].equals("rotatingimage")) {
							String[] strings_11_ = Class194_Sub13.method15512(strings_9_[1], ',', (byte) -31);
							Image image;
							try {
								image = method5272(strings_11_[0], -283184685);
							} catch (Exception exception) {
								image = null;
							}
							if (null != image) {
								mediatracker.addImage(image, i++);
								aList3180.add(new Class333_Sub2_Sub1(this, image, Class458_Sub1.method15856(strings_11_[1], (byte) 17), Class458_Sub1.method15856(strings_11_[2], (byte) 1), Float.parseFloat(strings_11_[3])));
							}
						} else if (strings_9_[0].equals("progress")) {
							String[] strings_12_ = Class194_Sub13.method15512(strings_9_[1], ',', (byte) -10);
							aList3180.add(new Class333_Sub1(this, Boolean.parseBoolean(strings_12_[0]), strings_12_[1], Class458_Sub1.method15856(strings_12_[2], (byte) 57), Integer.decode(strings_12_[3]).intValue(), Class458_Sub1.method15856(strings_12_[4], (byte) 87), Class458_Sub1.method15856(strings_12_[5], (byte) 43)));
						}
					}
					mediatracker.waitForAll();
				}
			} catch (Exception exception) {
				aBool3178 = true;
			}
		}
		if (aBool3178)
			method5270((byte) 2);
		else {
			Graphics graphics = Class523_Sub18_Sub8.aCanvas11689.getGraphics();
			if (null != graphics) {
				try {
					aString3184 = new StringBuilder().append("").append(Class661.aClass289_8509.method5197((byte) 11)).append("%").toString();
					aString3179 = Class661.aClass289_8509.method5190((byte) 113);
					if (Class268.anImage2868 == null)
						Class268.anImage2868 = (Class523_Sub18_Sub8.aCanvas11689.createImage(2141365743 * Class170.anInt1833, -495986435 * Class254.anInt2742));
					Graphics graphics_13_ = Class268.anImage2868.getGraphics();
					graphics_13_.setColor(Color.BLACK);
					graphics_13_.fillRect(0, 0, Class170.anInt1833 * 2141365743, -495986435 * Class254.anInt2742);
					Iterator iterator = aList3180.iterator();
					while (iterator.hasNext()) {
						Class333 class333 = (Class333) iterator.next();
						class333.method5845(graphics_13_, -1919809239);
					}
					graphics.drawImage(Class268.anImage2868, 0, 0, null);
				} catch (Exception exception) {
					aBool3178 = true;
				}
			} else
				Class523_Sub18_Sub8.aCanvas11689.repaint();
		}
	}

	public void method193(short i) {
		/* empty */
	}

	public int method192(int i) {
		return 100;
	}

	public boolean method196(long l) {
		return true;
	}

	Image method5271(String string) throws IOException {
		InputStream inputstream = null;
		try {
			Image image;
			try {
				inputstream = Class305.anApplet3346.getClass().getClassLoader().getResourceAsStream(string);
				byte[] is = new byte[12000];
				int i = 0;
				int i_14_;
				while ((i_14_ = inputstream.read()) != -1)
					is[i++] = (byte) i_14_;
				Image image_15_ = Toolkit.getDefaultToolkit().createImage(is);
				inputstream.close();
				image = image_15_;
			} catch (Exception exception) {
				throw new IOException();
			}
			if (inputstream != null)
				inputstream.close();
			return image;
		} catch (Exception object) {
			if (inputstream != null)
				inputstream.close();
			throw object;
		}
	}

	Image method5272(String string, int i) throws IOException {
		InputStream inputstream = null;
		try {
			Image image;
			try {
				inputstream = Class305.anApplet3346.getClass().getClassLoader().getResourceAsStream(string);
				byte[] is = new byte[12000];
				int i_16_ = 0;
				int i_17_;
				while ((i_17_ = inputstream.read()) != -1)
					is[i_16_++] = (byte) i_17_;
				Image image_18_ = Toolkit.getDefaultToolkit().createImage(is);
				inputstream.close();
				image = image_18_;
			} catch (Exception exception) {
				throw new IOException();
			}
			if (inputstream != null)
				inputstream.close();
			return image;
		} catch (Exception object) {
			if (inputstream != null)
				inputstream.close();
			throw object;
		}
	}

	public void method203(boolean bool) {
		if (!aBool3178 && !aBool3185) {
			aBool3185 = true;
			try {
				String[] strings = Class194_Sub13.method15512(client.aString11171, '|', (byte) 76);
				if (strings.length < 3)
					aBool3178 = true;
				else {
					MediaTracker mediatracker = new MediaTracker(Class523_Sub18_Sub8.aCanvas11689);
					int i = 0;
					for (int i_19_ = 0; i_19_ < strings.length; i_19_++) {
						String[] strings_20_ = Class194_Sub13.method15512(strings[i_19_].trim(), '=', (byte) 108);
						if (strings_20_[0].equals("halign"))
							aBool3181 = Boolean.parseBoolean(strings_20_[1]);
						else if (strings_20_[0].equals("valign"))
							aBool3182 = Boolean.parseBoolean(strings_20_[1]);
						else if (strings_20_[0].equals("image")) {
							String[] strings_21_ = Class194_Sub13.method15512(strings_20_[1], ',', (byte) -3);
							Image image;
							try {
								image = method5272(strings_21_[0], -1145840203);
							} catch (Exception exception) {
								image = null;
							}
							if (image != null) {
								mediatracker.addImage(image, i++);
								aList3180.add(new Class333_Sub2(this, image, Class458_Sub1.method15856(strings_21_[1], (byte) 5), Class458_Sub1.method15856(strings_21_[2], (byte) 20)));
							}
						} else if (strings_20_[0].equals("rotatingimage")) {
							String[] strings_22_ = Class194_Sub13.method15512(strings_20_[1], ',', (byte) 20);
							Image image;
							try {
								image = method5272(strings_22_[0], 984883399);
							} catch (Exception exception) {
								image = null;
							}
							if (null != image) {
								mediatracker.addImage(image, i++);
								aList3180.add(new Class333_Sub2_Sub1(this, image, Class458_Sub1.method15856(strings_22_[1], (byte) 36), Class458_Sub1.method15856(strings_22_[2], (byte) 18), Float.parseFloat(strings_22_[3])));
							}
						} else if (strings_20_[0].equals("progress")) {
							String[] strings_23_ = Class194_Sub13.method15512(strings_20_[1], ',', (byte) 31);
							aList3180.add(new Class333_Sub1(this, Boolean.parseBoolean(strings_23_[0]), strings_23_[1], Class458_Sub1.method15856(strings_23_[2], (byte) 116), Integer.decode(strings_23_[3]).intValue(), Class458_Sub1.method15856(strings_23_[4], (byte) 66), Class458_Sub1.method15856(strings_23_[5], (byte) 17)));
						}
					}
					mediatracker.waitForAll();
				}
			} catch (Exception exception) {
				aBool3178 = true;
			}
		}
		if (aBool3178)
			method5270((byte) 2);
		else {
			Graphics graphics = Class523_Sub18_Sub8.aCanvas11689.getGraphics();
			if (null != graphics) {
				try {
					aString3184 = new StringBuilder().append("").append(Class661.aClass289_8509.method5197((byte) 11)).append("%").toString();
					aString3179 = Class661.aClass289_8509.method5190((byte) 121);
					if (Class268.anImage2868 == null)
						Class268.anImage2868 = (Class523_Sub18_Sub8.aCanvas11689.createImage(2141365743 * Class170.anInt1833, -495986435 * Class254.anInt2742));
					Graphics graphics_24_ = Class268.anImage2868.getGraphics();
					graphics_24_.setColor(Color.BLACK);
					graphics_24_.fillRect(0, 0, Class170.anInt1833 * 2141365743, -495986435 * Class254.anInt2742);
					Iterator iterator = aList3180.iterator();
					while (iterator.hasNext()) {
						Class333 class333 = (Class333) iterator.next();
						class333.method5845(graphics_24_, -1958808320);
					}
					graphics.drawImage(Class268.anImage2868, 0, 0, null);
				} catch (Exception exception) {
					aBool3178 = true;
				}
			} else
				Class523_Sub18_Sub8.aCanvas11689.repaint();
		}
	}

	Class296() {
		/* empty */
	}

	Image method5273(String string) throws IOException {
		InputStream inputstream = null;
		try {
			Image image;
			try {
				inputstream = Class305.anApplet3346.getClass().getClassLoader().getResourceAsStream(string);
				byte[] is = new byte[12000];
				int i = 0;
				int i_25_;
				while ((i_25_ = inputstream.read()) != -1)
					is[i++] = (byte) i_25_;
				Image image_26_ = Toolkit.getDefaultToolkit().createImage(is);
				inputstream.close();
				image = image_26_;
			} catch (Exception exception) {
				throw new IOException();
			}
			if (inputstream != null)
				inputstream.close();
			return image;
		} catch (Exception object) {
			if (inputstream != null)
				inputstream.close();
			throw object;
		}
	}

	final int method5274(int i) {
		if (aBool3181)
			return (Class170.anInt1833 * 2141365743 - i) / 2;
		return 0;
	}

	final int method5275(int i, int i_27_) {
		if (aBool3181)
			return (Class170.anInt1833 * 2141365743 - i) / 2;
		return 0;
	}

	Image method5276(String string) throws IOException {
		InputStream inputstream = null;
		try {
			Image image;
			try {
				inputstream = Class305.anApplet3346.getClass().getClassLoader().getResourceAsStream(string);
				byte[] is = new byte[12000];
				int i = 0;
				int i_28_;
				while ((i_28_ = inputstream.read()) != -1)
					is[i++] = (byte) i_28_;
				Image image_29_ = Toolkit.getDefaultToolkit().createImage(is);
				inputstream.close();
				image = image_29_;
			} catch (Exception exception) {
				throw new IOException();
			}
			if (inputstream != null)
				inputstream.close();
			return image;
		} catch (Exception object) {
			if (inputstream != null)
				inputstream.close();
			throw object;
		}
	}

	void method5277() {
		Class195.method3661(Class661.aClass289_8509.method5197((byte) 11), Class661.aClass289_8509.method5190((byte) 116), client.aColorArray11035[client.anInt11188 * 1871015145], client.aColorArray11128[1871015145 * client.anInt11188], client.aColorArray11037[client.anInt11188 * 1871015145], -1620222752);
	}

	void method5278() {
		Class195.method3661(Class661.aClass289_8509.method5197((byte) 11), Class661.aClass289_8509.method5190((byte) 119), client.aColorArray11035[client.anInt11188 * 1871015145], client.aColorArray11128[1871015145 * client.anInt11188], client.aColorArray11037[client.anInt11188 * 1871015145], -902351289);
	}

	public void method194() {
		Class210.method3820(342175621);
	}

	public int method204() {
		return 100;
	}

	public int method202() {
		return 100;
	}

	public int method198() {
		return 100;
	}

	Image method5279(String string) throws IOException {
		InputStream inputstream = null;
		try {
			Image image;
			try {
				inputstream = Class305.anApplet3346.getClass().getClassLoader().getResourceAsStream(string);
				byte[] is = new byte[12000];
				int i = 0;
				int i_30_;
				while ((i_30_ = inputstream.read()) != -1)
					is[i++] = (byte) i_30_;
				Image image_31_ = Toolkit.getDefaultToolkit().createImage(is);
				inputstream.close();
				image = image_31_;
			} catch (Exception exception) {
				throw new IOException();
			}
			if (inputstream != null)
				inputstream.close();
			return image;
		} catch (Exception object) {
			if (inputstream != null)
				inputstream.close();
			throw object;
		}
	}

	public int method197(int i) {
		return 0;
	}

	public boolean method206(long l) {
		return true;
	}

	public int method207() {
		return 0;
	}

	static final void method5280(Class669 class669, int i) {
		int i_32_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_32_, -471791907);
		Class242 class242 = Class31.aClass242Array302[i_32_ >> 16];
		Class681.method13846(class250, class242, class669, 1188566107);
	}

	static final void method5281(Class669 class669, int i) {
		int i_33_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_33_, -657367349);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1765340581 * class250.anInt2541;
	}

	static final void method5282(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_34_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		boolean bool = (class669.anIntArray8557[1 + 1357652815 * class669.anInt8558] == 1);
		if (Class534_Sub1.aClass14_10793 != null) {
			Class523 class523 = Class534_Sub1.aClass14_10793.method741((long) i_34_);
			if (null != class523 && !bool)
				class523.method8661(607052656);
			else if (class523 == null && bool) {
				class523 = new Class523();
				Class534_Sub1.aClass14_10793.method738(class523, (long) i_34_);
			}
		}
	}

	static final void method5283(Class669 class669, byte i) {
		int i_35_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class250 class250 = Class188.method3592(i_35_, -1334421569);
		Class242 class242 = Class31.aClass242Array302[i_35_ >> 16];
		Class252.method4538(class250, class242, class669, 715189773);
	}

	static final void method5284(Class669 class669, short i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class529.method8772(class250, class242, class669, 1322326765);
	}
}
