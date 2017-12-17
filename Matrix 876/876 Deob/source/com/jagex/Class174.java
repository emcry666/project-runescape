/* Class174 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class Class174 implements Interface25 {
	static int[] anIntArray1853;
	static double aDouble1854 = -1.0;
	public static Class194[] aClass194Array1855;
	public static Class53_Sub7 aClass53_Sub7_1856;

	public float[] method146(Class601 class601, int i, float f, int i_0_, int i_1_, boolean bool) {
		return method2912(class601, i, (double) f);
	}

	public static int[] method2910(BufferedImage bufferedimage) {
		if (bufferedimage.getType() == 10 || bufferedimage.getType() == 0) {
			int[] is = null;
			is = bufferedimage.getRaster().getPixels(0, 0, bufferedimage.getWidth(), bufferedimage.getHeight(), is);
			int[] is_2_ = (new int[bufferedimage.getWidth() * bufferedimage.getHeight()]);
			if (bufferedimage.getType() == 10) {
				for (int i = 0; i < is_2_.length; i++)
					is_2_[i] = -16777216 + (is[i] + ((is[i] << 16) + (is[i] << 8)));
			} else {
				for (int i = 0; i < is_2_.length; i++) {
					int i_3_ = 2 * i;
					is_2_[i] = ((is[1 + i_3_] << 24) + is[i_3_] + ((is[i_3_] << 8) + (is[i_3_] << 16)));
				}
			}
			return is_2_;
		}
		return bufferedimage.getRGB(0, 0, bufferedimage.getWidth(), bufferedimage.getHeight(), null, 0, bufferedimage.getWidth());
	}

	public abstract boolean method136(Class601 class601, int i, Class608 class608, float f, int i_4_, int i_5_, boolean bool, short i_6_);

	int[] method2911(Class601 class601, int i, double d) {
		int[] is = method2923(class601, i, d);
		if (is == null)
			return null;
		for (int i_7_ = 0; i_7_ < is.length; i_7_++) {
			if ((is[i_7_] & 0xffffff) != 0)
				is[i_7_] = is[i_7_] | ~0xffffff;
			else
				is[i_7_] = is[i_7_] & 0xffffff;
		}
		return is;
	}

	Class174() {
		/* empty */
	}

	float[] method2912(Class601 class601, int i, double d) {
		if (class601 != Class601.aClass601_7850)
			return null;
		int[] is = method2923(class601, i, d);
		if (is == null)
			return null;
		int[] is_8_ = null;
		byte[] is_9_ = method2924(Class601.aClass601_7848, i, -845945285);
		if (is_9_ != null) {
			try {
				byte i_10_ = (byte) (is_9_[0] & 0xff);
				if (1 != i_10_)
					return null;
				byte[] is_11_ = new byte[is_9_.length - 5];
				System.arraycopy(is_9_, 5, is_11_, 0, is_9_.length - 5);
				is_8_ = method2915(is_11_, false, (byte) -102);
				for (int i_12_ = 0; i_12_ < is_8_.length; i_12_++)
					is_8_[i_12_] = is_8_[i_12_] & 0xff;
			} catch (IOException ioexception) {
				/* empty */
			}
		}
		if (is_8_ == null)
			is_8_ = new int[is.length];
		float[] fs = new float[is.length * 4];
		int i_13_ = 0;
		for (int i_14_ = 0; i_14_ < is.length; i_14_++) {
			int i_15_ = is[i_14_];
			int i_16_ = i_15_ >>> 24;
			int i_17_ = (i_15_ & 0xff0000) >> 16;
			int i_18_ = (i_15_ & 0xff00) >> 8;
			int i_19_ = i_15_ & 0xff;
			float f = 1.0F + 31.0F * (float) is_8_[i_14_] / 255.0F;
			fs[i_13_++] = f * (float) i_17_ / 255.0F;
			fs[i_13_++] = (float) i_18_ * f / 255.0F;
			fs[i_13_++] = f * (float) i_19_ / 255.0F;
			fs[i_13_++] = (float) i_16_ / 255.0F;
		}
		return fs;
	}

	public void method20(int i) {
		/* empty */
	}

	int[] method2913(Class601 class601, int i, double d) {
		byte[] is = method2924(class601, i, -760232841);
		if (null == is)
			return null;
		int[] is_20_;
		try {
			byte i_21_ = (byte) (is[0] & 0xff);
			if (Class601.aClass601_7849 == class601) {
				if (i_21_ != 6)
					return null;
				int[] is_22_ = null;
				int i_23_ = 1;
				for (int i_24_ = 0; i_24_ < 6; i_24_++) {
					int i_25_ = ((is[i_23_] & 0xff) << 24 | (is[1 + i_23_] & 0xff) << 16 | (is[i_23_ + 2] & 0xff) << 8 | is[i_23_ + 3] & 0xff);
					byte[] is_26_ = new byte[i_25_];
					System.arraycopy(is, 4 + i_23_, is_26_, 0, i_25_);
					int[] is_27_ = method2915(is_26_, false, (byte) -65);
					if (i_24_ == 0)
						is_22_ = new int[6 * is_27_.length];
					System.arraycopy(is_27_, 0, is_22_, is_27_.length * i_24_, is_27_.length);
					i_23_ += i_25_ + 4;
				}
				if (d != 1.0)
					Class69.method1465(is_22_, d);
				return is_22_;
			}
			if (1 != i_21_)
				return null;
			byte[] is_28_ = new byte[is.length - 5];
			System.arraycopy(is, 5, is_28_, 0, is.length - 5);
			int[] is_29_ = method2915(is_28_, false, (byte) -44);
			if (null == is_29_)
				return null;
			if (d != 1.0)
				Class69.method1465(is_29_, d);
			is_20_ = is_29_;
		} catch (IOException ioexception) {
			return null;
		}
		return is_20_;
	}

	public int[] method138(Class601 class601, int i, float f, int i_30_, int i_31_, boolean bool, int i_32_) {
		return method2923(class601, i, (double) f);
	}

	float[] method2914(Class601 class601, int i, double d) {
		if (class601 != Class601.aClass601_7850)
			return null;
		int[] is = method2923(class601, i, d);
		if (is == null)
			return null;
		int[] is_33_ = null;
		byte[] is_34_ = method2924(Class601.aClass601_7848, i, -1995428947);
		if (is_34_ != null) {
			try {
				byte i_35_ = (byte) (is_34_[0] & 0xff);
				if (1 != i_35_)
					return null;
				byte[] is_36_ = new byte[is_34_.length - 5];
				System.arraycopy(is_34_, 5, is_36_, 0, is_34_.length - 5);
				is_33_ = method2915(is_36_, false, (byte) -105);
				for (int i_37_ = 0; i_37_ < is_33_.length; i_37_++)
					is_33_[i_37_] = is_33_[i_37_] & 0xff;
			} catch (IOException ioexception) {
				/* empty */
			}
		}
		if (is_33_ == null)
			is_33_ = new int[is.length];
		float[] fs = new float[is.length * 4];
		int i_38_ = 0;
		for (int i_39_ = 0; i_39_ < is.length; i_39_++) {
			int i_40_ = is[i_39_];
			int i_41_ = i_40_ >>> 24;
			int i_42_ = (i_40_ & 0xff0000) >> 16;
			int i_43_ = (i_40_ & 0xff00) >> 8;
			int i_44_ = i_40_ & 0xff;
			float f = 1.0F + 31.0F * (float) is_33_[i_39_] / 255.0F;
			fs[i_38_++] = f * (float) i_42_ / 255.0F;
			fs[i_38_++] = (float) i_43_ * f / 255.0F;
			fs[i_38_++] = f * (float) i_44_ / 255.0F;
			fs[i_38_++] = (float) i_41_ / 255.0F;
		}
		return fs;
	}

	int[] method2915(byte[] is, boolean bool, byte i) throws IOException {
		BufferedImage bufferedimage = ImageIO.read(new ByteArrayInputStream(is));
		if (bufferedimage == null)
			return null;
		int[] is_45_ = Class427.method6756(bufferedimage, 1718037186);
		if (bool) {
			for (int i_46_ = bufferedimage.getHeight() - 1; i_46_ >= 0; i_46_--) {
				int i_47_ = i_46_ * bufferedimage.getWidth();
				for (int i_48_ = (i_46_ + 1) * bufferedimage.getWidth(); i_47_ < i_48_; i_47_++) {
					i_48_--;
					int i_49_ = is_45_[i_47_];
					is_45_[i_47_] = is_45_[i_48_];
					is_45_[i_48_] = i_49_;
				}
			}
		}
		return is_45_;
	}

	static {
		anIntArray1853 = new int[256];
	}

	public int[] method137(Class601 class601, int i, float f, int i_50_, int i_51_, boolean bool, byte i_52_) {
		return method2911(class601, i, (double) f);
	}

	int[] method2916(byte[] is, boolean bool) throws IOException {
		BufferedImage bufferedimage = ImageIO.read(new ByteArrayInputStream(is));
		if (bufferedimage == null)
			return null;
		int[] is_53_ = Class427.method6756(bufferedimage, -355029566);
		if (bool) {
			for (int i = bufferedimage.getHeight() - 1; i >= 0; i--) {
				int i_54_ = i * bufferedimage.getWidth();
				for (int i_55_ = (i + 1) * bufferedimage.getWidth(); i_54_ < i_55_; i_54_++) {
					i_55_--;
					int i_56_ = is_53_[i_54_];
					is_53_[i_54_] = is_53_[i_55_];
					is_53_[i_55_] = i_56_;
				}
			}
		}
		return is_53_;
	}

	static void method2917(int[] is, double d) {
		if (aDouble1854 != d) {
			for (int i = 0; i < 256; i++) {
				int i_57_ = (int) (Math.pow((double) i / 255.0, d) * 255.0);
				anIntArray1853[i] = i_57_ > 255 ? 255 : i_57_;
			}
			aDouble1854 = d;
		}
		for (int i = 0; i < is.length; i++) {
			int i_58_ = anIntArray1853[is[i] >> 16 & 0xff];
			int i_59_ = anIntArray1853[is[i] >> 8 & 0xff];
			int i_60_ = anIntArray1853[is[i] >> 0 & 0xff];
			is[i] = is[i] & ~0xffffff | i_58_ << 16 | i_59_ << 8 | i_60_;
		}
	}

	int[] method2918(Class601 class601, int i, double d) {
		int[] is = method2923(class601, i, d);
		if (is == null)
			return null;
		for (int i_61_ = 0; i_61_ < is.length; i_61_++) {
			if ((is[i_61_] & 0xffffff) != 0)
				is[i_61_] = is[i_61_] | ~0xffffff;
			else
				is[i_61_] = is[i_61_] & 0xffffff;
		}
		return is;
	}

	public float[] method145(Class601 class601, int i, float f, int i_62_, int i_63_, boolean bool) {
		return method2912(class601, i, (double) f);
	}

	int[] method2919(Class601 class601, int i, double d) {
		int[] is = method2923(class601, i, d);
		if (is == null)
			return null;
		for (int i_64_ = 0; i_64_ < is.length; i_64_++) {
			if ((is[i_64_] & 0xffffff) != 0)
				is[i_64_] = is[i_64_] | ~0xffffff;
			else
				is[i_64_] = is[i_64_] & 0xffffff;
		}
		return is;
	}

	public int[] method144(Class601 class601, int i, float f, int i_65_, int i_66_, boolean bool) {
		return method2923(class601, i, (double) f);
	}

	abstract byte[] method2920(Class601 class601, int i);

	float[] method2921(Class601 class601, int i, double d) {
		if (class601 != Class601.aClass601_7850)
			return null;
		int[] is = method2923(class601, i, d);
		if (is == null)
			return null;
		int[] is_67_ = null;
		byte[] is_68_ = method2924(Class601.aClass601_7848, i, -595435989);
		if (is_68_ != null) {
			try {
				byte i_69_ = (byte) (is_68_[0] & 0xff);
				if (1 != i_69_)
					return null;
				byte[] is_70_ = new byte[is_68_.length - 5];
				System.arraycopy(is_68_, 5, is_70_, 0, is_68_.length - 5);
				is_67_ = method2915(is_70_, false, (byte) -34);
				for (int i_71_ = 0; i_71_ < is_67_.length; i_71_++)
					is_67_[i_71_] = is_67_[i_71_] & 0xff;
			} catch (IOException ioexception) {
				/* empty */
			}
		}
		if (is_67_ == null)
			is_67_ = new int[is.length];
		float[] fs = new float[is.length * 4];
		int i_72_ = 0;
		for (int i_73_ = 0; i_73_ < is.length; i_73_++) {
			int i_74_ = is[i_73_];
			int i_75_ = i_74_ >>> 24;
			int i_76_ = (i_74_ & 0xff0000) >> 16;
			int i_77_ = (i_74_ & 0xff00) >> 8;
			int i_78_ = i_74_ & 0xff;
			float f = 1.0F + 31.0F * (float) is_67_[i_73_] / 255.0F;
			fs[i_72_++] = f * (float) i_76_ / 255.0F;
			fs[i_72_++] = (float) i_77_ * f / 255.0F;
			fs[i_72_++] = f * (float) i_78_ / 255.0F;
			fs[i_72_++] = (float) i_75_ / 255.0F;
		}
		return fs;
	}

	public void method141() {
		/* empty */
	}

	public void method142() {
		/* empty */
	}

	public int[] method143(Class601 class601, int i, float f, int i_79_, int i_80_, boolean bool) {
		return method2911(class601, i, (double) f);
	}

	int[] method2922(Class601 class601, int i, double d) {
		int[] is = method2923(class601, i, d);
		if (is == null)
			return null;
		for (int i_81_ = 0; i_81_ < is.length; i_81_++) {
			if ((is[i_81_] & 0xffffff) != 0)
				is[i_81_] = is[i_81_] | ~0xffffff;
			else
				is[i_81_] = is[i_81_] & 0xffffff;
		}
		return is;
	}

	public int[] method147(Class601 class601, int i, float f, int i_82_, int i_83_, boolean bool) {
		return method2923(class601, i, (double) f);
	}

	int[] method2923(Class601 class601, int i, double d) {
		byte[] is = method2924(class601, i, -1541775845);
		if (null == is)
			return null;
		int[] is_84_;
		try {
			byte i_85_ = (byte) (is[0] & 0xff);
			if (Class601.aClass601_7849 == class601) {
				if (i_85_ != 6)
					return null;
				int[] is_86_ = null;
				int i_87_ = 1;
				for (int i_88_ = 0; i_88_ < 6; i_88_++) {
					int i_89_ = ((is[i_87_] & 0xff) << 24 | (is[1 + i_87_] & 0xff) << 16 | (is[i_87_ + 2] & 0xff) << 8 | is[i_87_ + 3] & 0xff);
					byte[] is_90_ = new byte[i_89_];
					System.arraycopy(is, 4 + i_87_, is_90_, 0, i_89_);
					int[] is_91_ = method2915(is_90_, false, (byte) -119);
					if (i_88_ == 0)
						is_86_ = new int[6 * is_91_.length];
					System.arraycopy(is_91_, 0, is_86_, is_91_.length * i_88_, is_91_.length);
					i_87_ += i_89_ + 4;
				}
				if (d != 1.0)
					Class69.method1465(is_86_, d);
				return is_86_;
			}
			if (1 != i_85_)
				return null;
			byte[] is_92_ = new byte[is.length - 5];
			System.arraycopy(is, 5, is_92_, 0, is.length - 5);
			int[] is_93_ = method2915(is_92_, false, (byte) -71);
			if (null == is_93_)
				return null;
			if (d != 1.0)
				Class69.method1465(is_93_, d);
			is_84_ = is_93_;
		} catch (IOException ioexception) {
			return null;
		}
		return is_84_;
	}

	public abstract boolean method139(Class601 class601, int i, Class608 class608, float f, int i_94_, int i_95_, boolean bool);

	public int[] method140(Class601 class601, int i, float f, int i_96_, int i_97_, boolean bool) {
		return method2923(class601, i, (double) f);
	}

	abstract byte[] method2924(Class601 class601, int i, int i_98_);

	int[] method2925(byte[] is, boolean bool) throws IOException {
		BufferedImage bufferedimage = ImageIO.read(new ByteArrayInputStream(is));
		if (bufferedimage == null)
			return null;
		int[] is_99_ = Class427.method6756(bufferedimage, 130117723);
		if (bool) {
			for (int i = bufferedimage.getHeight() - 1; i >= 0; i--) {
				int i_100_ = i * bufferedimage.getWidth();
				for (int i_101_ = (i + 1) * bufferedimage.getWidth(); i_100_ < i_101_; i_100_++) {
					i_101_--;
					int i_102_ = is_99_[i_100_];
					is_99_[i_100_] = is_99_[i_101_];
					is_99_[i_101_] = i_102_;
				}
			}
		}
		return is_99_;
	}

	public float[] method148(Class601 class601, int i, float f, int i_103_, int i_104_, boolean bool, int i_105_) {
		return method2912(class601, i, (double) f);
	}

	public static int[] method2926(BufferedImage bufferedimage) {
		if (bufferedimage.getType() == 10 || bufferedimage.getType() == 0) {
			int[] is = null;
			is = bufferedimage.getRaster().getPixels(0, 0, bufferedimage.getWidth(), bufferedimage.getHeight(), is);
			int[] is_106_ = (new int[bufferedimage.getWidth() * bufferedimage.getHeight()]);
			if (bufferedimage.getType() == 10) {
				for (int i = 0; i < is_106_.length; i++)
					is_106_[i] = -16777216 + (is[i] + ((is[i] << 16) + (is[i] << 8)));
			} else {
				for (int i = 0; i < is_106_.length; i++) {
					int i_107_ = 2 * i;
					is_106_[i] = ((is[1 + i_107_] << 24) + is[i_107_] + ((is[i_107_] << 8) + (is[i_107_] << 16)));
				}
			}
			return is_106_;
		}
		return bufferedimage.getRGB(0, 0, bufferedimage.getWidth(), bufferedimage.getHeight(), null, 0, bufferedimage.getWidth());
	}

	public static int[] method2927(BufferedImage bufferedimage) {
		if (bufferedimage.getType() == 10 || bufferedimage.getType() == 0) {
			int[] is = null;
			is = bufferedimage.getRaster().getPixels(0, 0, bufferedimage.getWidth(), bufferedimage.getHeight(), is);
			int[] is_108_ = (new int[bufferedimage.getWidth() * bufferedimage.getHeight()]);
			if (bufferedimage.getType() == 10) {
				for (int i = 0; i < is_108_.length; i++)
					is_108_[i] = -16777216 + (is[i] + ((is[i] << 16) + (is[i] << 8)));
			} else {
				for (int i = 0; i < is_108_.length; i++) {
					int i_109_ = 2 * i;
					is_108_[i] = ((is[1 + i_109_] << 24) + is[i_109_] + ((is[i_109_] << 8) + (is[i_109_] << 16)));
				}
			}
			return is_108_;
		}
		return bufferedimage.getRGB(0, 0, bufferedimage.getWidth(), bufferedimage.getHeight(), null, 0, bufferedimage.getWidth());
	}

	public static int[] method2928(BufferedImage bufferedimage) {
		if (bufferedimage.getType() == 10 || bufferedimage.getType() == 0) {
			int[] is = null;
			is = bufferedimage.getRaster().getPixels(0, 0, bufferedimage.getWidth(), bufferedimage.getHeight(), is);
			int[] is_110_ = (new int[bufferedimage.getWidth() * bufferedimage.getHeight()]);
			if (bufferedimage.getType() == 10) {
				for (int i = 0; i < is_110_.length; i++)
					is_110_[i] = -16777216 + (is[i] + ((is[i] << 16) + (is[i] << 8)));
			} else {
				for (int i = 0; i < is_110_.length; i++) {
					int i_111_ = 2 * i;
					is_110_[i] = ((is[1 + i_111_] << 24) + is[i_111_] + ((is[i_111_] << 8) + (is[i_111_] << 16)));
				}
			}
			return is_110_;
		}
		return bufferedimage.getRGB(0, 0, bufferedimage.getWidth(), bufferedimage.getHeight(), null, 0, bufferedimage.getWidth());
	}

	static final void method2929(Class669 class669, byte i) {
		int i_112_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_112_, -1975579323);
		Class242 class242 = Class31.aClass242Array302[i_112_ >> 16];
		Class29.method874(class250, class242, class669, (byte) -110);
	}

	static final void method2930(Class669 class669, int i) {
		int i_113_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_113_, -1142337391);
		Class242 class242 = Class31.aClass242Array302[i_113_ >> 16];
		Class193.method3642(class250, class242, class669, (byte) 86);
	}

	static final void method2931(InterfaceComponentDefinitions class250, Class669 class669, short i) {
		int i_114_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		int i_115_ = ((class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) - 1);
		if (class250.modelType * -428962391 != 2)
			throw new RuntimeException("");
		NPCDefinition class300 = ((NPCDefinition) aClass53_Sub7_1856.getDefinition(class250.anInt2571 * -2080195333, (byte) -26));
		if (class250.aClass302_2553 == null)
			class250.aClass302_2553 = new Class302(class300, false);
		class250.aClass302_2553.aLong3337 = Class547.method9086((byte) -6) * 1634705471692094829L;
		if (i_115_ < 0 || i_115_ >= class300.anIntArray3256.length)
			throw new RuntimeException("");
		class250.aClass302_2553.anIntArray3332[i_115_] = i_114_;
		Login.method15991(class250, (byte) -7);
	}

	static final void method2932(Class669 class669, int i) {
		int i_116_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_116_, -556724612);
		int i_117_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		i_117_--;
		if (null == class250.aStringArray2626 || i_117_ >= class250.aStringArray2626.length || class250.aStringArray2626[i_117_] == null)
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = "";
		else
			class669.anObjectArray8559[(class669.anInt8560 += 1235970069) * 240723773 - 1] = class250.aStringArray2626[i_117_];
	}

	static final void method2933(Class669 class669, byte i) {
		class669.anInt8558 -= -17422498;
		int i_118_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_119_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (Class645.aClass24_8347.method839(i_118_, (byte) -81).quickReplyOptions[i_119_]);
	}

	static final void method2934(Class669 class669, int i) {
		float f = Class433.method6799(class669.anIntArray8557[((class669.anInt8558 -= 2138772399) * 1357652815)]);
		Class523_Sub27_Sub13_Sub1 class523_sub27_sub13_sub1 = new Class523_Sub27_Sub13_Sub1(Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method15548(420984133), f);
		Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5366(class523_sub27_sub13_sub1, (byte) 2);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1056957445 * class523_sub27_sub13_sub1.anInt11745;
	}

	public static int method2935(int i, int i_120_, int i_121_) {
		i_120_ = (i & 0x7f) * i_120_ >> 7;
		if (i_120_ < 2)
			i_120_ = 2;
		else if (i_120_ > 126)
			i_120_ = 126;
		return (i & 0xff80) + i_120_;
	}

	static int method2936(int i, int i_122_, int i_123_) {
		if (1923531495 * Class607.aClass607_7964.anInt7982 == i || i == 1923531495 * Class607.aClass607_7966.anInt7982)
			return Class647_Sub1_Sub4_Sub1.anIntArray12016[i_122_ & 0x3];
		return Class647_Sub1_Sub4_Sub1.anIntArray12015[i_122_ & 0x3];
	}

	static final void method2937(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = -2037861517 * Class178_Sub3.anInt9841;
	}

	static final void method2938(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class519.method8640(class250, class242, class669, (byte) 6);
	}

	static Class523_Sub27_Sub7 method2939(byte i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = ((Class523_Sub27_Sub7) Class523_Sub27_Sub7.aClass697_11671.first(-1426448868));
		if (class523_sub27_sub7 != null) {
			class523_sub27_sub7.method8661(607052656);
			class523_sub27_sub7.method16154(-261651695);
			return class523_sub27_sub7;
		}
		for (;;) {
			class523_sub27_sub7 = (Class523_Sub27_Sub7) Class523_Sub27_Sub7.aClass697_11657.first(-1426448868);
			if (null == class523_sub27_sub7)
				return null;
			if (class523_sub27_sub7.method17966(835321300) > TimeUtils.getCurrentTimeMilliseconds(1516375036))
				return null;
			class523_sub27_sub7.method8661(607052656);
			class523_sub27_sub7.method16154(-261651695);
			if (0L != (-8659322449062458077L * class523_sub27_sub7.queueId & ~0x7fffffffffffffffL))
				return class523_sub27_sub7;
		}
	}

	static final void method2940(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class572.method9623(class250, class242, class669, 145639111);
	}
}
