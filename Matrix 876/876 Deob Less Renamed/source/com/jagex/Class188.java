/* Class188 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class188 implements Interface58 {
	Class217 this$0;
	public static int anInt2133;
	static int anInt2134;

	public void method377(Object object, float[] fs, Object[] objects) {
		Class489 class489 = (Class489) object;
		Class437 class437 = class489.method8035(-1090802594);
		float f = class489.method7959((byte) -82);
		float f_0_ = class489.method7962(180661287);
		Class437 class437_1_ = Class437.method6932(class437, this$0.method3856(-617531974));
		float f_2_ = 0.0F;
		float f_3_ = class437_1_.method6958();
		if (f_3_ >= f_0_)
			f_2_ = 0.0F;
		if (f_3_ <= f)
			f_2_ = 1.0F;
		else {
			float f_4_ = 1.0F - 1.0F / (f_0_ - f) * (f_3_ - f);
			if ((double) f_4_ < 0.0 || (double) f_4_ > 1.0)
				f_4_ = Math.min(Math.max(f_4_, 0.0F), 1.0F);
			f_2_ = f_4_;
		}
		fs[0] = f_2_;
		fs[1] = f_2_;
	}

	public void method376(Object object, float[] fs, Object[] objects, byte i) {
		Class489 class489 = (Class489) object;
		Class437 class437 = class489.method8035(-1517419159);
		float f = class489.method7959((byte) -25);
		float f_5_ = class489.method7962(884284897);
		Class437 class437_6_ = Class437.method6932(class437, this$0.method3856(-110175059));
		float f_7_ = 0.0F;
		float f_8_ = class437_6_.method6958();
		if (f_8_ >= f_5_)
			f_7_ = 0.0F;
		if (f_8_ <= f)
			f_7_ = 1.0F;
		else {
			float f_9_ = 1.0F - 1.0F / (f_5_ - f) * (f_8_ - f);
			if ((double) f_9_ < 0.0 || (double) f_9_ > 1.0)
				f_9_ = Math.min(Math.max(f_9_, 0.0F), 1.0F);
			f_7_ = f_9_;
		}
		fs[0] = f_7_;
		fs[1] = f_7_;
	}

	Class188(Class217 class217) {
		this$0 = class217;
	}

	public void method378(Object object, float[] fs, Object[] objects) {
		Class489 class489 = (Class489) object;
		Class437 class437 = class489.method8035(1073980688);
		float f = class489.method7959((byte) -5);
		float f_10_ = class489.method7962(511198053);
		Class437 class437_11_ = Class437.method6932(class437, this$0.method3856(1499041330));
		float f_12_ = 0.0F;
		float f_13_ = class437_11_.method6958();
		if (f_13_ >= f_10_)
			f_12_ = 0.0F;
		if (f_13_ <= f)
			f_12_ = 1.0F;
		else {
			float f_14_ = 1.0F - 1.0F / (f_10_ - f) * (f_13_ - f);
			if ((double) f_14_ < 0.0 || (double) f_14_ > 1.0)
				f_14_ = Math.min(Math.max(f_14_, 0.0F), 1.0F);
			f_12_ = f_14_;
		}
		fs[0] = f_12_;
		fs[1] = f_12_;
	}

	public void method379(Object object, float[] fs, Object[] objects) {
		Class489 class489 = (Class489) object;
		Class437 class437 = class489.method8035(-1260379696);
		float f = class489.method7959((byte) -111);
		float f_15_ = class489.method7962(1732602066);
		Class437 class437_16_ = Class437.method6932(class437, this$0.method3856(21877049));
		float f_17_ = 0.0F;
		float f_18_ = class437_16_.method6958();
		if (f_18_ >= f_15_)
			f_17_ = 0.0F;
		if (f_18_ <= f)
			f_17_ = 1.0F;
		else {
			float f_19_ = 1.0F - 1.0F / (f_15_ - f) * (f_18_ - f);
			if ((double) f_19_ < 0.0 || (double) f_19_ > 1.0)
				f_19_ = Math.min(Math.max(f_19_, 0.0F), 1.0F);
			f_17_ = f_19_;
		}
		fs[0] = f_17_;
		fs[1] = f_17_;
	}

	public static Class250 method3592(int i, int i_20_) {
		int i_21_ = i >> 16;
		if (Class31.aClass242Array302[i_21_] == null || (Class31.aClass242Array302[i_21_].method4366(i, 41459288) == null)) {
			boolean bool = Class69.method1464(i_21_, null, 1929719609);
			if (!bool)
				return null;
		}
		return Class31.aClass242Array302[i_21_].method4366(i, -874716849);
	}

	static boolean method3593(Class523_Sub34_Sub2 class523_sub34_sub2, int i, int i_22_) {
		int i_23_ = class523_sub34_sub2.readBits(2, -637304580);
		if (0 == i_23_) {
			if (class523_sub34_sub2.readBits(1, -194195418) != 0)
				method3593(class523_sub34_sub2, i, -1129350300);
			int i_24_ = class523_sub34_sub2.readBits(6, -2091398050);
			int i_25_ = class523_sub34_sub2.readBits(6, 14125585);
			boolean bool = class523_sub34_sub2.readBits(1, -173908055) == 1;
			if (bool)
				Class108.anIntArray1312[(Class108.anInt1323 += -571886895) * -1962023375 - 1] = i;
			if (null != client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i])
				throw new RuntimeException();
			Class40 class40 = Class108.aClass40Array1322[i];
			Player class647_sub1_sub3_sub1_sub2 = (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i] = (new Player(client.aClass505_11019.method8241((byte) -60))));
			class647_sub1_sub3_sub1_sub2.anInt11888 = i * -1926162379;
			if (Class108.aClass523_Sub34Array1316[i] != null)
				class647_sub1_sub3_sub1_sub2.decodeAppearance(Class108.aClass523_Sub34Array1316[i], 2075687610);
			if (null != Class108.aClass523_Sub34Array1317[i])
				class647_sub1_sub3_sub1_sub2.decodeHeadIcons(Class108.aClass523_Sub34Array1317[i], -654999937);
			class647_sub1_sub3_sub1_sub2.method18332(class40.anInt554 * 1780461139, true, 1958307138);
			class647_sub1_sub3_sub1_sub2.anInt11909 = class40.anInt555 * 352379029;
			int i_26_ = 1223583977 * class40.anInt556;
			int i_27_ = i_26_ >> 28;
			int i_28_ = i_26_ >> 14 & 0xff;
			int i_29_ = i_26_ & 0xff;
			Class592 class592 = client.aClass505_11019.method8242(55538902);
			int i_30_ = i_24_ + (i_28_ << 6) - class592.localX * 235453015;
			int i_31_ = i_25_ + (i_29_ << 6) - 1704054549 * class592.localY;
			class647_sub1_sub3_sub1_sub2.aClass210_12200 = class40.aClass210_553;
			class647_sub1_sub3_sub1_sub2.aBool12202 = class40.aBool557;
			class647_sub1_sub3_sub1_sub2.aByteArray11944[0] = Class108.aByteArray1314[i];
			class647_sub1_sub3_sub1_sub2.aByte10821 = class647_sub1_sub3_sub1_sub2.aByte10818 = (byte) i_27_;
			if (client.aClass505_11019.method8243(1002612569).method7282(i_30_, i_31_, -638715901))
				class647_sub1_sub3_sub1_sub2.aByte10818++;
			class647_sub1_sub3_sub1_sub2.method18666(i_30_, i_31_, (byte) 21);
			Class108.aClass40Array1322[i] = null;
			return true;
		}
		if (1 == i_23_) {
			int i_32_ = class523_sub34_sub2.readBits(2, -122240191);
			int i_33_ = 1223583977 * Class108.aClass40Array1322[i].anInt556;
			Class108.aClass40Array1322[i].anInt556 = 206368601 * ((i_33_ & 0xfffffff) + ((i_32_ + (i_33_ >> 28) & 0x3) << 28));
			return false;
		}
		if (2 == i_23_) {
			int i_34_ = class523_sub34_sub2.readBits(5, -1814902348);
			int i_35_ = i_34_ >> 3 & 0x3;
			int i_36_ = i_34_ & 0x7;
			int i_37_ = 1223583977 * Class108.aClass40Array1322[i].anInt556;
			if (!Class108.$assertionsDisabled && (Class108.aByteArray1314[i] < 0 || Class108.aByteArray1314[i] > 3))
				throw new AssertionError();
			int i_38_ = i_35_ + (i_37_ >> 28) & 0x3;
			int i_39_ = i_37_ >> 14 & 0xff;
			int i_40_ = i_37_ & 0xff;
			if (i_36_ == 0) {
				i_39_--;
				i_40_--;
			}
			if (1 == i_36_)
				i_40_--;
			if (i_36_ == 2) {
				i_39_++;
				i_40_--;
			}
			if (3 == i_36_)
				i_39_--;
			if (4 == i_36_)
				i_39_++;
			if (5 == i_36_) {
				i_39_--;
				i_40_++;
			}
			if (6 == i_36_)
				i_40_++;
			if (7 == i_36_) {
				i_39_++;
				i_40_++;
			}
			Class334.method5910(Class666.method13653((byte) 25), Class108.aByteArray1314[i], -2094530385);
			Class108.aClass40Array1322[i].anInt556 = 206368601 * (i_40_ + ((i_39_ << 14) + (i_38_ << 28)));
			return false;
		}
		int i_41_ = class523_sub34_sub2.readBits(20, 1478387287);
		int i_42_ = i_41_ >> 18 & 0x3;
		int i_43_ = i_41_ >> 16 & 0x3;
		int i_44_ = i_41_ >> 8 & 0xff;
		int i_45_ = i_41_ & 0xff;
		int i_46_ = Class108.aClass40Array1322[i].anInt556 * 1223583977;
		Class108.aByteArray1314[i] = (byte) (i_42_ - 1);
		if (!Class108.$assertionsDisabled && (Class108.aByteArray1314[i] < 0 || Class108.aByteArray1314[i] > 3))
			throw new AssertionError();
		int i_47_ = (i_46_ >> 28) + i_43_ & 0x3;
		int i_48_ = (i_46_ >> 14) + i_44_ & 0xff;
		int i_49_ = i_46_ + i_45_ & 0xff;
		Class334.method5910(Class666.method13653((byte) 42), i_42_ - 1, 1357766608);
		Class108.aClass40Array1322[i].anInt556 = ((i_47_ << 28) + (i_48_ << 14) + i_49_) * 206368601;
		return false;
	}

	static void method3594(int i) {
		Class27.aClass298_Sub1_257 = null;
		Class27.aBool258 = false;
	}

	public static void method3595(int i, boolean bool, int i_50_, boolean bool_51_, short i_52_) {
		Class328_Sub1.method15577(0, Class6.aClass611_Sub1Array47.length - 1, i, bool, i_50_, bool_51_, (short) -24959);
		Class6.anInt45 = 0;
		Class6.aClass640_46 = null;
	}

	static String method3596(Class250 class250, int i) {
		if (client.method17252(class250).method15964(-1910035430) == 0)
			return null;
		if (class250.aString2634 == null || class250.aString2634.trim().length() == 0) {
			if (client.aBool11180)
				return "Hidden-use";
			return null;
		}
		return class250.aString2634;
	}
}
