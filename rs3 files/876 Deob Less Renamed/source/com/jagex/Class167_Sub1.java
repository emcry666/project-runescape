/* Class167_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class167_Sub1 extends Class167 {
	Class99 aClass99_9045;
	boolean aBool9046 = false;
	int[] anIntArray9047;
	int[][] anIntArrayArray9048;
	Class178_Sub3 aClass178_Sub3_9049;
	static int anInt9050 = 4096;
	static final int anInt9051 = 0;
	static final int anInt9052 = -1;
	int[] anIntArray9053;
	static final int anInt9054 = 7;
	static final int anInt9055 = 4;
	static final int anInt9056 = 618520;
	static final int anInt9057 = 618648;
	int anInt9058;
	int anInt9059;
	int anInt9060;
	int anInt9061 = 0;
	int anInt9062 = 0;
	short[] aShortArray9063;
	short[] aShortArray9064;
	int[] anIntArray9065;
	short[] aShortArray9066;
	Class109[] aClass109Array9067;
	Class109[] aClass109Array9068;
	Class99 aClass99_9069;
	int anInt9070;
	static int anInt9071 = 4096;
	short[] aShortArray9072;
	byte[] aByteArray9073;
	int anInt9074 = 0;
	float[][] aFloatArrayArray9075;
	Class167_Sub1[] aClass167_Sub1Array9076;
	int[] anIntArray9077;
	short[] aShortArray9078;
	int[] anIntArray9079;
	static final int anInt9080 = 1;
	static final int anInt9081 = 2;
	short aShort9082;
	Class96[] aClass96Array9083;
	int anInt9084;
	static int anInt9085 = 0;
	byte[] aByteArray9086;
	short[] aShortArray9087;
	short[] aShortArray9088;
	Class184[] aClass184Array9089;
	short aShort9090;
	int[][] anIntArrayArray9091;
	boolean aBool9092;
	boolean aBool9093;
	boolean aBool9094;
	int anInt9095;
	int anInt9096;
	int anInt9097;
	boolean aBool9098;
	int[] anIntArray9099;
	Class143[] aClass143Array9100;
	int anInt9101;
	Class101[] aClass101Array9102;
	Class103[] aClass103Array9103;
	int[][] anIntArrayArray9104;
	boolean aBool9105;
	int[] anIntArray9106;
	short aShort9107;
	short aShort9108;
	short aShort9109;
	static final int anInt9110 = -2;
	short aShort9111;
	short aShort9112;
	short aShort9113;
	boolean aBool9114;
	short aShort9115;
	short[] aShortArray9116;
	float[][] aFloatArrayArray9117;
	Class118 aClass118_9118;
	int[] anIntArray9119;
	float[] aFloatArray9120;
	float[] aFloatArray9121;
	float[] aFloatArray9122;
	float[] aFloatArray9123;
	int[] anIntArray9124;
	int[] anIntArray9125;
	int[] anIntArray9126;
	int[] anIntArray9127;
	boolean aBool9128;
	int[] anIntArray9129;
	byte[] aByteArray9130;
	Class167_Sub1[] aClass167_Sub1Array9131;

	public void method2782(Class435 class435, int i, boolean bool) {
		if (aShortArray9066 != null) {
			Class99 class99 = aClass178_Sub3_9049.method15475(Thread.currentThread());
			Class435 class435_0_ = class99.aClass435_1214;
			class435_0_.method6803(class435);
			if (bool)
				class435_0_.method6857();
			Class441 class441 = class99.aClass441_1202;
			class441.method7090(class435_0_);
			float[] fs = new float[3];
			for (int i_1_ = 0; i_1_ < anInt9062; i_1_++) {
				if ((i & aShortArray9066[i_1_]) != 0) {
					class441.method7185((float) anIntArray9077[i_1_], (float) anIntArray9047[i_1_], (float) anIntArray9065[i_1_], fs);
					anIntArray9077[i_1_] = (int) fs[0];
					anIntArray9047[i_1_] = (int) fs[1];
					anIntArray9065[i_1_] = (int) fs[2];
				}
			}
		}
	}

	final void method14454(boolean bool, boolean bool_2_, boolean bool_3_, boolean bool_4_, boolean bool_5_) {
		if (aClass101Array9102 != null) {
			for (int i = 0; i < anInt9101; i++) {
				Class101 class101 = aClass101Array9102[i];
				anIntArray9129[class101.anInt1241 * -566359109] = i;
			}
		}
		if (aBool9128 || aClass101Array9102 != null) {
			if ((anInt9058 & 0x100) == 0 && aShortArray9116 != null) {
				for (int i = 0; i < anInt9070; i++) {
					short i_6_ = aShortArray9116[i];
					method14455(bool, bool_2_, bool_3_, i_6_, bool_4_, bool_5_);
				}
			} else {
				for (int i = 0; i < anInt9070; i++) {
					if (!method14473(i) && !method14474(i))
						method14455(bool, bool_2_, bool_3_, i, bool_4_, bool_5_);
				}
				if (aByteArray9130 == null) {
					for (int i = 0; i < anInt9070; i++) {
						if (method14473(i) || method14474(i))
							method14455(bool, bool_2_, bool_3_, i, bool_4_, bool_5_);
					}
				} else {
					for (int i = 0; i < 12; i++) {
						for (int i_7_ = 0; i_7_ < anInt9070; i_7_++) {
							if (aByteArray9130[i_7_] == i && (method14473(i_7_) || method14474(i_7_)))
								method14455(bool, bool_2_, bool_3_, i_7_, bool_4_, bool_5_);
						}
					}
				}
			}
			if (aClass101Array9102 != null)
				method14527(bool, bool_2_, bool_3_);
		} else {
			for (int i = 0; i < anInt9070; i++)
				method14455(bool, bool_2_, bool_3_, i, bool_4_, bool_5_);
		}
	}

	final void method14455(boolean bool, boolean bool_8_, boolean bool_9_, int i, boolean bool_10_, boolean bool_11_) {
		if (anIntArray9099[i] != -2) {
			short i_12_ = aShortArray9064[i];
			short i_13_ = aShortArray9072[i];
			short i_14_ = aShortArray9063[i];
			float f = aFloatArray9120[i_12_];
			float f_15_ = aFloatArray9120[i_13_];
			float f_16_ = aFloatArray9120[i_14_];
			if (!bool_10_ || f != -5000.0F && f_15_ != -5000.0F && f_16_ != -5000.0F) {
				float f_17_ = aFloatArray9121[i_12_];
				float f_18_ = aFloatArray9121[i_13_];
				float f_19_ = aFloatArray9121[i_14_];
				if (anIntArray9129[i] != -1 || ((f - f_15_) * (f_19_ - f_18_) - (f_17_ - f_18_) * (f_16_ - f_15_)) > 0.0F) {
					if (f < 0.0F || f_15_ < 0.0F || f_16_ < 0.0F || f > (float) (aClass99_9069.anInt1220 * 2050315737) || f_15_ > (float) (aClass99_9069.anInt1220 * 2050315737) || f_16_ > (float) (aClass99_9069.anInt1220 * 2050315737))
						aClass118_9118.aBool1455 = true;
					else
						aClass118_9118.aBool1455 = false;
					if (bool_11_) {
						int i_20_ = anIntArray9129[i];
						if (i_20_ == -1 || !aClass101Array9102[i_20_].aBool1243)
							method14476(bool, bool_8_, bool_9_, i);
					} else {
						int i_21_ = anIntArray9129[i];
						if (i_21_ != -1) {
							Class101 class101 = aClass101Array9102[i_21_];
							Class103 class103 = aClass103Array9103[i_21_];
							if (!class101.aBool1243)
								method14475(bool, bool_8_, bool_9_, i);
							aClass178_Sub3_9049.method15428(bool, bool_8_, bool_9_, class103.anInt1254 * 172645007, class103.anInt1255 * -1110849247, class103.aFloat1256, class103.anInt1257 * -1848872251, class103.anInt1252 * 1576186567, class101.aShort1240, class103.anInt1258 * 330457669, class101.aByte1242, class101.aByte1237);
						} else
							method14475(bool, bool_8_, bool_9_, i);
					}
				}
			}
		}
	}

	void method14456(Thread thread) {
		Class99 class99 = aClass178_Sub3_9049.method15475(thread);
		if (class99 != aClass99_9045) {
			aClass99_9045 = class99;
			aClass167_Sub1Array9076 = aClass99_9045.aClass167_Sub1Array1224;
			aClass167_Sub1Array9131 = aClass99_9045.aClass167_Sub1Array1222;
		}
	}

	void method14457() {
		if (anInt9084 == 0 && aClass109Array9067 == null) {
			if (aClass178_Sub3_9049.anInt9819 * 1353126165 > 1) {
				synchronized (this) {
					method14458();
				}
			} else
				method14458();
		}
	}

	void method14458() {
		aClass109Array9067 = new Class109[anInt9062];
		for (int i = 0; i < anInt9062; i++)
			aClass109Array9067[i] = new Class109();
		for (int i = 0; i < anInt9074; i++) {
			short i_22_ = aShortArray9064[i];
			short i_23_ = aShortArray9072[i];
			short i_24_ = aShortArray9063[i];
			int i_25_ = anIntArray9077[i_23_] - anIntArray9077[i_22_];
			int i_26_ = anIntArray9047[i_23_] - anIntArray9047[i_22_];
			int i_27_ = anIntArray9065[i_23_] - anIntArray9065[i_22_];
			int i_28_ = anIntArray9077[i_24_] - anIntArray9077[i_22_];
			int i_29_ = anIntArray9047[i_24_] - anIntArray9047[i_22_];
			int i_30_ = anIntArray9065[i_24_] - anIntArray9065[i_22_];
			int i_31_ = i_26_ * i_30_ - i_29_ * i_27_;
			int i_32_ = i_27_ * i_28_ - i_30_ * i_25_;
			int i_33_;
			for (i_33_ = i_25_ * i_29_ - i_28_ * i_26_; (i_31_ > 8192 || i_32_ > 8192 || i_33_ > 8192 || i_31_ < -8192 || i_32_ < -8192 || i_33_ < -8192); i_33_ >>= 1) {
				i_31_ >>= 1;
				i_32_ >>= 1;
			}
			int i_34_ = (int) Math.sqrt((double) (i_31_ * i_31_ + i_32_ * i_32_ + i_33_ * i_33_));
			if (i_34_ <= 0)
				i_34_ = 1;
			i_31_ = i_31_ * 256 / i_34_;
			i_32_ = i_32_ * 256 / i_34_;
			i_33_ = i_33_ * 256 / i_34_;
			byte i_35_;
			if (aByteArray9073 == null)
				i_35_ = (byte) 0;
			else
				i_35_ = aByteArray9073[i];
			if (i_35_ == 0) {
				Class109 class109 = aClass109Array9067[i_22_];
				class109.anInt1326 += i_31_;
				class109.anInt1325 += i_32_;
				class109.anInt1327 += i_33_;
				class109.anInt1328++;
				class109 = aClass109Array9067[i_23_];
				class109.anInt1326 += i_31_;
				class109.anInt1325 += i_32_;
				class109.anInt1327 += i_33_;
				class109.anInt1328++;
				class109 = aClass109Array9067[i_24_];
				class109.anInt1326 += i_31_;
				class109.anInt1325 += i_32_;
				class109.anInt1327 += i_33_;
				class109.anInt1328++;
			} else if (i_35_ == 1) {
				if (aClass96Array9083 == null)
					aClass96Array9083 = new Class96[anInt9074];
				Class96 class96 = aClass96Array9083[i] = new Class96();
				class96.anInt1181 = i_31_;
				class96.anInt1182 = i_32_;
				class96.anInt1183 = i_33_;
			}
		}
	}

	void method14459(boolean bool) {
		if (aClass178_Sub3_9049.anInt9819 * 1353126165 > 1) {
			synchronized (this) {
				method14492(bool);
			}
		} else
			method14492(bool);
	}

	public void method2691(int i, int i_36_, int i_37_) {
		if (i != 128 && (anInt9058 & 0x1) != 1)
			throw new IllegalStateException();
		if (i_36_ != 128 && (anInt9058 & 0x2) != 2)
			throw new IllegalStateException();
		if (i_37_ != 128 && (anInt9058 & 0x4) != 4)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i_38_ = 0; i_38_ < anInt9061; i_38_++) {
				anIntArray9077[i_38_] = anIntArray9077[i_38_] * i >> 7;
				anIntArray9047[i_38_] = anIntArray9047[i_38_] * i_36_ >> 7;
				anIntArray9065[i_38_] = anIntArray9065[i_38_] * i_37_ >> 7;
			}
			aBool9105 = false;
		}
	}

	int method14460(int i, short i_39_, int i_40_) {
		int i_41_ = Class710.anIntArray8839[method14461(i, i_40_)];
		Class177 class177 = aClass178_Sub3_9049.aClass172_1916.method2895(i_39_ & 0xffff, -1190198331);
		int i_42_ = class177.aByte1912 & 0xff;
		if (i_42_ != 0) {
			int i_43_ = 131586 * i_40_;
			if (i_42_ == 256)
				i_41_ = i_43_;
			else {
				int i_44_ = i_42_;
				int i_45_ = 256 - i_42_;
				i_41_ = (((i_43_ & 0xff00ff) * i_44_ + (i_41_ & 0xff00ff) * i_45_ & ~0xff00ff) + ((i_43_ & 0xff00) * i_44_ + (i_41_ & 0xff00) * i_45_ & 0xff0000)) >> 8;
			}
		}
		int i_46_ = class177.aByte1883 & 0xff;
		if (i_46_ != 0) {
			i_46_ += 256;
			int i_47_ = ((i_41_ & 0xff0000) >> 16) * i_46_;
			if (i_47_ > 65535)
				i_47_ = 65535;
			int i_48_ = ((i_41_ & 0xff00) >> 8) * i_46_;
			if (i_48_ > 65535)
				i_48_ = 65535;
			int i_49_ = (i_41_ & 0xff) * i_46_;
			if (i_49_ > 65535)
				i_49_ = 65535;
			i_41_ = (i_47_ << 8 & 0xff0000) + (i_48_ & 0xff00) + (i_49_ >> 8);
		}
		return i_41_;
	}

	int method14461(int i, int i_50_) {
		i_50_ = i_50_ * (i & 0x7f) >> 7;
		if (i_50_ < 2)
			i_50_ = 2;
		else if (i_50_ > 126)
			i_50_ = 126;
		return (i & 0xff80) + i_50_;
	}

	public int method2793() {
		if (!aBool9105)
			method14478();
		return aShort9082;
	}

	public int method2712() {
		if (!aBool9105)
			method14478();
		return aShort9090;
	}

	void method14462() {
		for (int i = 0; i < anInt9074; i++) {
			short i_51_ = aShortArray9087 != null ? aShortArray9087[i] : (short) -1;
			if (i_51_ == -1) {
				int i_52_ = aShortArray9088[i] & 0xffff;
				int i_53_ = (i_52_ & 0x7f) * anInt9059 >> 7;
				short i_54_ = Class493.method8085(i_52_ & ~0x7f | i_53_, 2091943508);
				if (anIntArray9099[i] == -1) {
					int i_55_ = anIntArray9106[i] & ~0x1ffff;
					anIntArray9106[i] = i_55_ | Class174.method2935(i_54_, i_55_ >> 17, 1530418723);
				} else if (anIntArray9099[i] != -2) {
					int i_56_ = anIntArray9106[i] & ~0x1ffff;
					anIntArray9106[i] = i_56_ | Class174.method2935(i_54_, i_56_ >> 17, 1530418723);
					i_56_ = anIntArray9079[i] & ~0x1ffff;
					anIntArray9079[i] = i_56_ | Class174.method2935(i_54_, i_56_ >> 17, 1530418723);
					i_56_ = anIntArray9099[i] & ~0x1ffff;
					anIntArray9099[i] = i_56_ | Class174.method2935(i_54_, i_56_ >> 17, 1530418723);
				}
			}
		}
		anInt9084 = 2;
	}

	public void method2735(Class167 class167, int i, int i_57_, int i_58_, boolean bool) {
		Class167_Sub1 class167_sub1_59_ = (Class167_Sub1) class167;
		if ((anInt9058 & 0x10000) != 65536)
			throw new IllegalStateException("");
		if ((class167_sub1_59_.anInt9058 & 0x10000) != 65536)
			throw new IllegalStateException("");
		method14529(aClass178_Sub3_9049.method15475(Thread.currentThread()));
		method14478();
		method14457();
		class167_sub1_59_.method14478();
		class167_sub1_59_.method14457();
		anInt9085++;
		int i_60_ = 0;
		int[] is = class167_sub1_59_.anIntArray9077;
		int i_61_ = class167_sub1_59_.anInt9062;
		for (int i_62_ = 0; i_62_ < anInt9062; i_62_++) {
			Class109 class109 = aClass109Array9067[i_62_];
			if (class109.anInt1328 != 0) {
				int i_63_ = anIntArray9047[i_62_] - i_57_;
				if (i_63_ >= class167_sub1_59_.aShort9108 && i_63_ <= class167_sub1_59_.aShort9109) {
					int i_64_ = anIntArray9077[i_62_] - i;
					if (i_64_ >= class167_sub1_59_.aShort9090 && i_64_ <= class167_sub1_59_.aShort9111) {
						int i_65_ = anIntArray9065[i_62_] - i_58_;
						if (i_65_ >= class167_sub1_59_.aShort9112 && i_65_ <= class167_sub1_59_.aShort9113) {
							for (int i_66_ = 0; i_66_ < i_61_; i_66_++) {
								Class109 class109_67_ = (class167_sub1_59_.aClass109Array9067[i_66_]);
								if (i_64_ == is[i_66_] && i_65_ == (class167_sub1_59_.anIntArray9065[i_66_]) && i_63_ == (class167_sub1_59_.anIntArray9047[i_66_]) && class109_67_.anInt1328 != 0) {
									if (aClass109Array9068 == null)
										aClass109Array9068 = new Class109[anInt9062];
									if (class167_sub1_59_.aClass109Array9068 == null)
										class167_sub1_59_.aClass109Array9068 = new Class109[i_61_];
									Class109 class109_68_ = aClass109Array9068[i_62_];
									if (class109_68_ == null)
										class109_68_ = aClass109Array9068[i_62_] = new Class109(class109);
									Class109 class109_69_ = (class167_sub1_59_.aClass109Array9068[i_66_]);
									if (class109_69_ == null)
										class109_69_ = class167_sub1_59_.aClass109Array9068[i_66_] = new Class109(class109_67_);
									class109_68_.anInt1326 += class109_67_.anInt1326;
									class109_68_.anInt1325 += class109_67_.anInt1325;
									class109_68_.anInt1327 += class109_67_.anInt1327;
									class109_68_.anInt1328 += class109_67_.anInt1328;
									class109_69_.anInt1326 += class109.anInt1326;
									class109_69_.anInt1325 += class109.anInt1325;
									class109_69_.anInt1327 += class109.anInt1327;
									class109_69_.anInt1328 += class109.anInt1328;
									i_60_++;
									anIntArray9127[i_62_] = anInt9085;
									anIntArray9053[i_66_] = anInt9085;
								}
							}
						}
					}
				}
			}
		}
		if (i_60_ >= 3 && bool) {
			for (int i_70_ = 0; i_70_ < anInt9074; i_70_++) {
				if (anIntArray9127[aShortArray9064[i_70_]] == anInt9085 && anIntArray9127[aShortArray9072[i_70_]] == anInt9085 && anIntArray9127[aShortArray9063[i_70_]] == anInt9085) {
					if (aByteArray9073 == null)
						aByteArray9073 = new byte[anInt9074];
					aByteArray9073[i_70_] = (byte) 2;
				}
			}
			for (int i_71_ = 0; i_71_ < class167_sub1_59_.anInt9074; i_71_++) {
				if ((anIntArray9053[class167_sub1_59_.aShortArray9064[i_71_]] == anInt9085) && anIntArray9053[(class167_sub1_59_.aShortArray9072[i_71_])] == anInt9085 && anIntArray9053[(class167_sub1_59_.aShortArray9063[i_71_])] == anInt9085) {
					if (class167_sub1_59_.aByteArray9073 == null)
						class167_sub1_59_.aByteArray9073 = new byte[class167_sub1_59_.anInt9074];
					class167_sub1_59_.aByteArray9073[i_71_] = (byte) 2;
				}
			}
		}
	}

	public Class167 method2681(byte i, int i_72_, boolean bool) {
		method14456(Thread.currentThread());
		boolean bool_73_ = false;
		Class167_Sub1 class167_sub1_74_;
		Class167_Sub1 class167_sub1_75_;
		if (i > 0 && i <= 8) {
			class167_sub1_75_ = aClass167_Sub1Array9131[i - 1];
			class167_sub1_74_ = aClass167_Sub1Array9076[i - 1];
			bool_73_ = true;
		} else
			class167_sub1_74_ = class167_sub1_75_ = new Class167_Sub1(aClass178_Sub3_9049);
		return method14480(class167_sub1_74_, class167_sub1_75_, i_72_, bool_73_, bool);
	}

	Class167 method14463(Class167_Sub1 class167_sub1_76_, Class167_Sub1 class167_sub1_77_, int i, boolean bool, boolean bool_78_) {
		class167_sub1_76_.aBool9105 = aBool9105;
		if (aBool9105) {
			class167_sub1_76_.aShort9111 = aShort9111;
			class167_sub1_76_.aShort9109 = aShort9109;
			class167_sub1_76_.aShort9113 = aShort9113;
			class167_sub1_76_.aShort9090 = aShort9090;
			class167_sub1_76_.aShort9108 = aShort9108;
			class167_sub1_76_.aShort9112 = aShort9112;
			class167_sub1_76_.aShort9082 = aShort9082;
			class167_sub1_76_.aShort9107 = aShort9107;
		}
		if (aBool9114) {
			class167_sub1_76_.aShort9115 = aShort9115;
			class167_sub1_76_.aBool9114 = true;
		} else
			class167_sub1_76_.aBool9114 = false;
		class167_sub1_76_.anInt9059 = anInt9059;
		class167_sub1_76_.anInt9060 = anInt9060;
		class167_sub1_76_.anInt9061 = anInt9061;
		class167_sub1_76_.anInt9062 = anInt9062;
		class167_sub1_76_.anInt9074 = anInt9074;
		class167_sub1_76_.anInt9101 = anInt9101;
		class167_sub1_76_.anInt9070 = anInt9070;
		if ((i & 0x100) != 0)
			class167_sub1_76_.aBool9128 = true;
		else
			class167_sub1_76_.aBool9128 = aBool9128;
		class167_sub1_76_.aBool9092 = aBool9092;
		boolean bool_79_ = (i & 0x7) == 7 | (i & 0x20) != 0;
		boolean bool_80_ = bool_79_ || (i & 0x1) != 0;
		boolean bool_81_ = bool_79_ || (i & 0x2) != 0;
		boolean bool_82_ = bool_79_ || (i & 0x4) != 0 || (i & 0x10) != 0;
		if (bool_80_ || bool_81_ || bool_82_) {
			if (bool_80_) {
				if (class167_sub1_77_.anIntArray9077 == null || class167_sub1_77_.anIntArray9077.length < anInt9061)
					class167_sub1_76_.anIntArray9077 = class167_sub1_77_.anIntArray9077 = new int[anInt9061];
				else
					class167_sub1_76_.anIntArray9077 = class167_sub1_77_.anIntArray9077;
				for (int i_83_ = 0; i_83_ < anInt9061; i_83_++)
					class167_sub1_76_.anIntArray9077[i_83_] = anIntArray9077[i_83_];
			} else
				class167_sub1_76_.anIntArray9077 = anIntArray9077;
			if (bool_81_) {
				if (class167_sub1_77_.anIntArray9047 == null || class167_sub1_77_.anIntArray9047.length < anInt9061)
					class167_sub1_76_.anIntArray9047 = class167_sub1_77_.anIntArray9047 = new int[anInt9061];
				else
					class167_sub1_76_.anIntArray9047 = class167_sub1_77_.anIntArray9047;
				for (int i_84_ = 0; i_84_ < anInt9061; i_84_++)
					class167_sub1_76_.anIntArray9047[i_84_] = anIntArray9047[i_84_];
			} else
				class167_sub1_76_.anIntArray9047 = anIntArray9047;
			if (bool_82_) {
				if (class167_sub1_77_.anIntArray9065 == null || class167_sub1_77_.anIntArray9065.length < anInt9061)
					class167_sub1_76_.anIntArray9065 = class167_sub1_77_.anIntArray9065 = new int[anInt9061];
				else
					class167_sub1_76_.anIntArray9065 = class167_sub1_77_.anIntArray9065;
				for (int i_85_ = 0; i_85_ < anInt9061; i_85_++)
					class167_sub1_76_.anIntArray9065[i_85_] = anIntArray9065[i_85_];
			} else
				class167_sub1_76_.anIntArray9065 = anIntArray9065;
		} else {
			class167_sub1_76_.anIntArray9077 = anIntArray9077;
			class167_sub1_76_.anIntArray9047 = anIntArray9047;
			class167_sub1_76_.anIntArray9065 = anIntArray9065;
		}
		if ((i & 0x84080) != 0) {
			if (class167_sub1_77_.aShortArray9088 == null || class167_sub1_77_.aShortArray9088.length < anInt9074) {
				int i_86_ = anInt9074;
				class167_sub1_76_.aShortArray9088 = class167_sub1_77_.aShortArray9088 = new short[i_86_];
			} else
				class167_sub1_76_.aShortArray9088 = class167_sub1_77_.aShortArray9088;
			for (int i_87_ = 0; i_87_ < anInt9074; i_87_++)
				class167_sub1_76_.aShortArray9088[i_87_] = aShortArray9088[i_87_];
		} else
			class167_sub1_76_.aShortArray9088 = aShortArray9088;
		if ((i & 0x97018) != 0) {
			class167_sub1_76_.anInt9084 = 0;
			Class167_Sub1 class167_sub1_88_ = class167_sub1_76_;
			Class167_Sub1 class167_sub1_89_ = class167_sub1_76_;
			class167_sub1_76_.anIntArray9099 = null;
			class167_sub1_89_.anIntArray9079 = null;
			class167_sub1_88_.anIntArray9106 = null;
		} else if ((i & 0x80) != 0) {
			if (bool_78_)
				method14459(false);
			if (anIntArray9106 != null) {
				if (class167_sub1_77_.anIntArray9106 == null || class167_sub1_77_.anIntArray9106.length < anInt9074) {
					int i_90_ = anInt9074;
					class167_sub1_76_.anIntArray9106 = class167_sub1_77_.anIntArray9106 = new int[i_90_];
					class167_sub1_76_.anIntArray9079 = class167_sub1_77_.anIntArray9079 = new int[i_90_];
					class167_sub1_76_.anIntArray9099 = class167_sub1_77_.anIntArray9099 = new int[i_90_];
				} else {
					class167_sub1_76_.anIntArray9106 = class167_sub1_77_.anIntArray9106;
					class167_sub1_76_.anIntArray9079 = class167_sub1_77_.anIntArray9079;
					class167_sub1_76_.anIntArray9099 = class167_sub1_77_.anIntArray9099;
				}
				for (int i_91_ = 0; i_91_ < anInt9074; i_91_++) {
					class167_sub1_76_.anIntArray9106[i_91_] = anIntArray9106[i_91_];
					class167_sub1_76_.anIntArray9079[i_91_] = anIntArray9079[i_91_];
					class167_sub1_76_.anIntArray9099[i_91_] = anIntArray9099[i_91_];
				}
			}
			class167_sub1_76_.anInt9084 = anInt9084;
		} else {
			if (bool_78_)
				method14459(false);
			class167_sub1_76_.anIntArray9106 = anIntArray9106;
			class167_sub1_76_.anIntArray9079 = anIntArray9079;
			class167_sub1_76_.anIntArray9099 = anIntArray9099;
			class167_sub1_76_.anInt9084 = anInt9084;
		}
		if ((i & 0x100) != 0) {
			if (class167_sub1_77_.aByteArray9086 == null || class167_sub1_77_.aByteArray9086.length < anInt9074) {
				int i_92_ = anInt9074;
				class167_sub1_76_.aByteArray9086 = class167_sub1_77_.aByteArray9086 = new byte[i_92_];
			} else
				class167_sub1_76_.aByteArray9086 = class167_sub1_77_.aByteArray9086;
			if (aByteArray9086 != null) {
				for (int i_93_ = 0; i_93_ < anInt9074; i_93_++)
					class167_sub1_76_.aByteArray9086[i_93_] = aByteArray9086[i_93_];
			} else {
				for (int i_94_ = 0; i_94_ < anInt9074; i_94_++)
					class167_sub1_76_.aByteArray9086[i_94_] = (byte) 0;
			}
		} else
			class167_sub1_76_.aByteArray9086 = aByteArray9086;
		if ((i & 0x8) != 0 || (i & 0x10) != 0) {
			if (class167_sub1_77_.aClass109Array9067 == null || class167_sub1_77_.aClass109Array9067.length < anInt9062) {
				int i_95_ = anInt9062;
				class167_sub1_76_.aClass109Array9067 = class167_sub1_77_.aClass109Array9067 = new Class109[i_95_];
			} else
				class167_sub1_76_.aClass109Array9067 = class167_sub1_77_.aClass109Array9067;
			if (aClass109Array9067 != null) {
				for (int i_96_ = 0; i_96_ < anInt9062; i_96_++)
					class167_sub1_76_.aClass109Array9067[i_96_] = new Class109(aClass109Array9067[i_96_]);
			} else
				class167_sub1_76_.aClass109Array9067 = null;
			if (aClass96Array9083 != null) {
				if (class167_sub1_77_.aClass96Array9083 == null || (class167_sub1_77_.aClass96Array9083.length < anInt9074)) {
					int i_97_ = anInt9074;
					class167_sub1_76_.aClass96Array9083 = class167_sub1_77_.aClass96Array9083 = new Class96[i_97_];
				} else
					class167_sub1_76_.aClass96Array9083 = class167_sub1_77_.aClass96Array9083;
				for (int i_98_ = 0; i_98_ < anInt9074; i_98_++)
					class167_sub1_76_.aClass96Array9083[i_98_] = (aClass96Array9083[i_98_] != null ? new Class96(aClass96Array9083[i_98_]) : null);
			} else
				class167_sub1_76_.aClass96Array9083 = null;
		} else {
			if (bool_78_)
				method14457();
			class167_sub1_76_.aClass109Array9067 = aClass109Array9067;
			class167_sub1_76_.aClass96Array9083 = aClass96Array9083;
		}
		if ((i & 0x8000) != 0) {
			if (aShortArray9087 == null)
				class167_sub1_76_.aShortArray9087 = null;
			else {
				if (class167_sub1_77_.aShortArray9087 == null || class167_sub1_77_.aShortArray9087.length < anInt9074) {
					int i_99_ = anInt9074;
					class167_sub1_76_.aShortArray9087 = class167_sub1_77_.aShortArray9087 = new short[i_99_];
				} else
					class167_sub1_76_.aShortArray9087 = class167_sub1_77_.aShortArray9087;
				for (int i_100_ = 0; i_100_ < anInt9074; i_100_++)
					class167_sub1_76_.aShortArray9087[i_100_] = aShortArray9087[i_100_];
			}
		} else
			class167_sub1_76_.aShortArray9087 = aShortArray9087;
		if ((i & 0x10000) != 0) {
			if (aByteArray9073 == null)
				class167_sub1_76_.aByteArray9073 = null;
			else {
				if (class167_sub1_77_.aByteArray9073 == null || class167_sub1_77_.aByteArray9073.length < anInt9074) {
					int i_101_ = bool ? anInt9074 + 100 : anInt9074;
					class167_sub1_76_.aByteArray9073 = class167_sub1_77_.aByteArray9073 = new byte[i_101_];
				} else
					class167_sub1_76_.aByteArray9073 = class167_sub1_77_.aByteArray9073;
				for (int i_102_ = 0; i_102_ < anInt9074; i_102_++)
					class167_sub1_76_.aByteArray9073[i_102_] = aByteArray9073[i_102_];
			}
		} else
			class167_sub1_76_.aByteArray9073 = aByteArray9073;
		if ((i & 0xc580) != 0) {
			if (class167_sub1_77_.aClass103Array9103 == null || class167_sub1_77_.aClass103Array9103.length < anInt9101) {
				int i_103_ = anInt9101;
				class167_sub1_76_.aClass103Array9103 = class167_sub1_77_.aClass103Array9103 = new Class103[i_103_];
				for (int i_104_ = 0; i_104_ < anInt9101; i_104_++)
					class167_sub1_76_.aClass103Array9103[i_104_] = aClass103Array9103[i_104_].method1805(2138850824);
			} else {
				class167_sub1_76_.aClass103Array9103 = class167_sub1_77_.aClass103Array9103;
				for (int i_105_ = 0; i_105_ < anInt9101; i_105_++)
					class167_sub1_76_.aClass103Array9103[i_105_].method1806(aClass103Array9103[i_105_], -1438723006);
			}
		} else
			class167_sub1_76_.aClass103Array9103 = aClass103Array9103;
		if (aFloatArrayArray9117 != null && (i & 0x10) != 0) {
			if (class167_sub1_77_.aFloatArrayArray9117 == null || class167_sub1_77_.aFloatArrayArray9117.length < anInt9074) {
				int i_106_ = bool ? anInt9074 + 100 : anInt9074;
				class167_sub1_76_.aFloatArrayArray9117 = class167_sub1_77_.aFloatArrayArray9117 = new float[i_106_][3];
			} else
				class167_sub1_76_.aFloatArrayArray9117 = class167_sub1_77_.aFloatArrayArray9117;
			for (int i_107_ = 0; i_107_ < anInt9074; i_107_++) {
				if (aFloatArrayArray9117[i_107_] != null) {
					class167_sub1_76_.aFloatArrayArray9117[i_107_][0] = aFloatArrayArray9117[i_107_][0];
					class167_sub1_76_.aFloatArrayArray9117[i_107_][1] = aFloatArrayArray9117[i_107_][1];
					class167_sub1_76_.aFloatArrayArray9117[i_107_][2] = aFloatArrayArray9117[i_107_][2];
				}
			}
			if (class167_sub1_77_.aFloatArrayArray9075 == null || class167_sub1_77_.aFloatArrayArray9075.length < anInt9074) {
				int i_108_ = bool ? anInt9074 + 100 : anInt9074;
				class167_sub1_76_.aFloatArrayArray9075 = class167_sub1_77_.aFloatArrayArray9075 = new float[i_108_][3];
			} else
				class167_sub1_76_.aFloatArrayArray9075 = class167_sub1_77_.aFloatArrayArray9075;
			for (int i_109_ = 0; i_109_ < anInt9074; i_109_++) {
				if (aFloatArrayArray9075[i_109_] != null) {
					class167_sub1_76_.aFloatArrayArray9075[i_109_][0] = aFloatArrayArray9075[i_109_][0];
					class167_sub1_76_.aFloatArrayArray9075[i_109_][1] = aFloatArrayArray9075[i_109_][1];
					class167_sub1_76_.aFloatArrayArray9075[i_109_][2] = aFloatArrayArray9075[i_109_][2];
				}
			}
		} else {
			class167_sub1_76_.aFloatArrayArray9117 = aFloatArrayArray9117;
			class167_sub1_76_.aFloatArrayArray9075 = aFloatArrayArray9075;
		}
		class167_sub1_76_.anIntArrayArray9091 = anIntArrayArray9091;
		class167_sub1_76_.anIntArrayArray9048 = anIntArrayArray9048;
		class167_sub1_76_.anIntArrayArray9104 = anIntArrayArray9104;
		class167_sub1_76_.aShortArray9066 = aShortArray9066;
		class167_sub1_76_.aShortArray9078 = aShortArray9078;
		class167_sub1_76_.aByteArray9130 = aByteArray9130;
		class167_sub1_76_.aShortArray9064 = aShortArray9064;
		class167_sub1_76_.aShortArray9072 = aShortArray9072;
		class167_sub1_76_.aShortArray9063 = aShortArray9063;
		class167_sub1_76_.aClass184Array9089 = aClass184Array9089;
		class167_sub1_76_.aClass143Array9100 = aClass143Array9100;
		class167_sub1_76_.aClass101Array9102 = aClass101Array9102;
		class167_sub1_76_.aShortArray9116 = aShortArray9116;
		class167_sub1_76_.anInt9058 = i;
		return class167_sub1_76_;
	}

	public void method2688(int i) {
		if ((anInt9058 & 0x3) != 3)
			throw new IllegalStateException();
		int i_110_ = Class433.anIntArray4880[i];
		int i_111_ = Class433.anIntArray4881[i];
		synchronized (this) {
			for (int i_112_ = 0; i_112_ < anInt9061; i_112_++) {
				int i_113_ = ((anIntArray9047[i_112_] * i_110_ + anIntArray9077[i_112_] * i_111_) >> 14);
				anIntArray9047[i_112_] = (anIntArray9047[i_112_] * i_111_ - anIntArray9077[i_112_] * i_110_) >> 14;
				anIntArray9077[i_112_] = i_113_;
			}
			method14469();
		}
	}

	public void method2738(Class167 class167, int i, int i_114_, int i_115_, boolean bool) {
		Class167_Sub1 class167_sub1_116_ = (Class167_Sub1) class167;
		if ((anInt9058 & 0x10000) != 65536)
			throw new IllegalStateException("");
		if ((class167_sub1_116_.anInt9058 & 0x10000) != 65536)
			throw new IllegalStateException("");
		method14529(aClass178_Sub3_9049.method15475(Thread.currentThread()));
		method14478();
		method14457();
		class167_sub1_116_.method14478();
		class167_sub1_116_.method14457();
		anInt9085++;
		int i_117_ = 0;
		int[] is = class167_sub1_116_.anIntArray9077;
		int i_118_ = class167_sub1_116_.anInt9062;
		for (int i_119_ = 0; i_119_ < anInt9062; i_119_++) {
			Class109 class109 = aClass109Array9067[i_119_];
			if (class109.anInt1328 != 0) {
				int i_120_ = anIntArray9047[i_119_] - i_114_;
				if (i_120_ >= class167_sub1_116_.aShort9108 && i_120_ <= class167_sub1_116_.aShort9109) {
					int i_121_ = anIntArray9077[i_119_] - i;
					if (i_121_ >= class167_sub1_116_.aShort9090 && i_121_ <= class167_sub1_116_.aShort9111) {
						int i_122_ = anIntArray9065[i_119_] - i_115_;
						if (i_122_ >= class167_sub1_116_.aShort9112 && i_122_ <= class167_sub1_116_.aShort9113) {
							for (int i_123_ = 0; i_123_ < i_118_; i_123_++) {
								Class109 class109_124_ = (class167_sub1_116_.aClass109Array9067[i_123_]);
								if (i_121_ == is[i_123_] && i_122_ == (class167_sub1_116_.anIntArray9065[i_123_]) && i_120_ == (class167_sub1_116_.anIntArray9047[i_123_]) && class109_124_.anInt1328 != 0) {
									if (aClass109Array9068 == null)
										aClass109Array9068 = new Class109[anInt9062];
									if (class167_sub1_116_.aClass109Array9068 == null)
										class167_sub1_116_.aClass109Array9068 = new Class109[i_118_];
									Class109 class109_125_ = aClass109Array9068[i_119_];
									if (class109_125_ == null)
										class109_125_ = aClass109Array9068[i_119_] = new Class109(class109);
									Class109 class109_126_ = (class167_sub1_116_.aClass109Array9068[i_123_]);
									if (class109_126_ == null)
										class109_126_ = class167_sub1_116_.aClass109Array9068[i_123_] = new Class109(class109_124_);
									class109_125_.anInt1326 += class109_124_.anInt1326;
									class109_125_.anInt1325 += class109_124_.anInt1325;
									class109_125_.anInt1327 += class109_124_.anInt1327;
									class109_125_.anInt1328 += class109_124_.anInt1328;
									class109_126_.anInt1326 += class109.anInt1326;
									class109_126_.anInt1325 += class109.anInt1325;
									class109_126_.anInt1327 += class109.anInt1327;
									class109_126_.anInt1328 += class109.anInt1328;
									i_117_++;
									anIntArray9127[i_119_] = anInt9085;
									anIntArray9053[i_123_] = anInt9085;
								}
							}
						}
					}
				}
			}
		}
		if (i_117_ >= 3 && bool) {
			for (int i_127_ = 0; i_127_ < anInt9074; i_127_++) {
				if (anIntArray9127[aShortArray9064[i_127_]] == anInt9085 && anIntArray9127[aShortArray9072[i_127_]] == anInt9085 && anIntArray9127[aShortArray9063[i_127_]] == anInt9085) {
					if (aByteArray9073 == null)
						aByteArray9073 = new byte[anInt9074];
					aByteArray9073[i_127_] = (byte) 2;
				}
			}
			for (int i_128_ = 0; i_128_ < class167_sub1_116_.anInt9074; i_128_++) {
				if ((anIntArray9053[class167_sub1_116_.aShortArray9064[i_128_]] == anInt9085) && anIntArray9053[(class167_sub1_116_.aShortArray9072[i_128_])] == anInt9085 && anIntArray9053[(class167_sub1_116_.aShortArray9063[i_128_])] == anInt9085) {
					if (class167_sub1_116_.aByteArray9073 == null)
						class167_sub1_116_.aByteArray9073 = new byte[class167_sub1_116_.anInt9074];
					class167_sub1_116_.aByteArray9073[i_128_] = (byte) 2;
				}
			}
		}
	}

	public void method2684() {
		/* empty */
	}

	public void method2685(int i) {
		if ((anInt9058 & 0x5) != 5)
			throw new IllegalStateException();
		if (i == 4096)
			method14464();
		else if (i == 8192)
			method14465();
		else if (i == 12288)
			method14466();
		else {
			int i_129_ = Class433.anIntArray4880[i];
			int i_130_ = Class433.anIntArray4881[i];
			synchronized (this) {
				for (int i_131_ = 0; i_131_ < anInt9061; i_131_++) {
					int i_132_ = ((anIntArray9065[i_131_] * i_129_ + anIntArray9077[i_131_] * i_130_) >> 14);
					anIntArray9065[i_131_] = (anIntArray9065[i_131_] * i_130_ - anIntArray9077[i_131_] * i_129_) >> 14;
					anIntArray9077[i_131_] = i_132_;
				}
				method14469();
			}
		}
	}

	public void method2755(int i) {
		if ((anInt9058 & 0xd) != 13)
			throw new IllegalStateException();
		if (aClass109Array9067 != null) {
			if (i == 4096)
				method14467();
			else if (i == 8192)
				method14468();
			else if (i == 12288)
				method14501();
			else {
				int i_133_ = Class433.anIntArray4880[i];
				int i_134_ = Class433.anIntArray4881[i];
				synchronized (this) {
					for (int i_135_ = 0; i_135_ < anInt9062; i_135_++) {
						int i_136_ = ((anIntArray9065[i_135_] * i_133_ + anIntArray9077[i_135_] * i_134_) >> 14);
						anIntArray9065[i_135_] = (anIntArray9065[i_135_] * i_134_ - anIntArray9077[i_135_] * i_133_) >> 14;
						anIntArray9077[i_135_] = i_136_;
						if (aClass109Array9067[i_135_] != null) {
							i_136_ = ((aClass109Array9067[i_135_].anInt1327 * i_133_) + (aClass109Array9067[i_135_].anInt1326 * i_134_)) >> 14;
							aClass109Array9067[i_135_].anInt1327 = ((aClass109Array9067[i_135_].anInt1327 * i_134_) - (aClass109Array9067[i_135_].anInt1326 * i_133_)) >> 14;
							aClass109Array9067[i_135_].anInt1326 = i_136_;
						}
					}
					if (aClass96Array9083 != null) {
						for (int i_137_ = 0; i_137_ < anInt9074; i_137_++) {
							if (aClass96Array9083[i_137_] != null) {
								int i_138_ = (((aClass96Array9083[i_137_].anInt1183 * i_133_) + (aClass96Array9083[i_137_].anInt1181 * i_134_)) >> 14);
								aClass96Array9083[i_137_].anInt1183 = ((aClass96Array9083[i_137_].anInt1183 * i_134_) - (aClass96Array9083[i_137_].anInt1181 * i_133_)) >> 14;
								aClass96Array9083[i_137_].anInt1181 = i_138_;
							}
						}
					}
					for (int i_139_ = anInt9062; i_139_ < anInt9061; i_139_++) {
						int i_140_ = ((anIntArray9065[i_139_] * i_133_ + anIntArray9077[i_139_] * i_134_) >> 14);
						anIntArray9065[i_139_] = (anIntArray9065[i_139_] * i_134_ - anIntArray9077[i_139_] * i_133_) >> 14;
						anIntArray9077[i_139_] = i_140_;
					}
					anInt9084 = 0;
					aBool9105 = false;
				}
			}
		} else
			method2685(i);
	}

	void method14464() {
		synchronized (this) {
			for (int i = 0; i < anInt9061; i++) {
				int i_141_ = anIntArray9077[i];
				anIntArray9077[i] = anIntArray9065[i];
				anIntArray9065[i] = -i_141_;
			}
			method14469();
		}
	}

	void method14465() {
		synchronized (this) {
			for (int i = 0; i < anInt9061; i++) {
				anIntArray9077[i] = -anIntArray9077[i];
				anIntArray9065[i] = -anIntArray9065[i];
			}
			method14469();
		}
	}

	void method14466() {
		synchronized (this) {
			for (int i = 0; i < anInt9061; i++) {
				int i_142_ = anIntArray9065[i];
				anIntArray9065[i] = anIntArray9077[i];
				anIntArray9077[i] = -i_142_;
			}
			method14469();
		}
	}

	void method14467() {
		synchronized (this) {
			for (int i = 0; i < anInt9062; i++) {
				int i_143_ = anIntArray9077[i];
				anIntArray9077[i] = anIntArray9065[i];
				anIntArray9065[i] = -i_143_;
				if (aClass109Array9067[i] != null) {
					i_143_ = aClass109Array9067[i].anInt1326;
					aClass109Array9067[i].anInt1326 = aClass109Array9067[i].anInt1327;
					aClass109Array9067[i].anInt1327 = -i_143_;
				}
			}
			if (aClass96Array9083 != null) {
				for (int i = 0; i < anInt9074; i++) {
					if (aClass96Array9083[i] != null) {
						int i_144_ = aClass96Array9083[i].anInt1181;
						aClass96Array9083[i].anInt1181 = aClass96Array9083[i].anInt1183;
						aClass96Array9083[i].anInt1183 = -i_144_;
					}
				}
			}
			for (int i = anInt9062; i < anInt9061; i++) {
				int i_145_ = anIntArray9077[i];
				anIntArray9077[i] = anIntArray9065[i];
				anIntArray9065[i] = -i_145_;
			}
			anInt9084 = 0;
			aBool9105 = false;
		}
	}

	void method14468() {
		synchronized (this) {
			for (int i = 0; i < anInt9062; i++) {
				anIntArray9077[i] = -anIntArray9077[i];
				anIntArray9065[i] = -anIntArray9065[i];
				if (aClass109Array9067[i] != null) {
					aClass109Array9067[i].anInt1326 = -aClass109Array9067[i].anInt1326;
					aClass109Array9067[i].anInt1327 = -aClass109Array9067[i].anInt1327;
				}
			}
			if (aClass96Array9083 != null) {
				for (int i = 0; i < anInt9074; i++) {
					if (aClass96Array9083[i] != null) {
						aClass96Array9083[i].anInt1181 = -aClass96Array9083[i].anInt1181;
						aClass96Array9083[i].anInt1183 = -aClass96Array9083[i].anInt1183;
					}
				}
			}
			for (int i = anInt9062; i < anInt9061; i++) {
				anIntArray9077[i] = -anIntArray9077[i];
				anIntArray9065[i] = -anIntArray9065[i];
			}
			anInt9084 = 0;
			aBool9105 = false;
		}
	}

	public byte[] method2798() {
		return aByteArray9086;
	}

	public void method2845(int i) {
		if ((anInt9058 & 0x6) != 6)
			throw new IllegalStateException();
		int i_146_ = Class433.anIntArray4880[i];
		int i_147_ = Class433.anIntArray4881[i];
		synchronized (this) {
			for (int i_148_ = 0; i_148_ < anInt9061; i_148_++) {
				int i_149_ = ((anIntArray9047[i_148_] * i_147_ - anIntArray9065[i_148_] * i_146_) >> 14);
				anIntArray9065[i_148_] = (anIntArray9047[i_148_] * i_146_ + anIntArray9065[i_148_] * i_147_) >> 14;
				anIntArray9047[i_148_] = i_149_;
			}
			method14469();
		}
	}

	public void method2826(short i, short i_150_) {
		if (aShortArray9087 != null) {
			if (!aBool9092 && i_150_ >= 0) {
				Class177 class177 = aClass178_Sub3_9049.aClass172_1916.method2895(i_150_ & 0xffff, -231393182);
				if (class177.aByte1885 != 0 || class177.aByte1886 != 0)
					aBool9092 = true;
			}
			for (int i_151_ = 0; i_151_ < anInt9074; i_151_++) {
				if (aShortArray9087[i_151_] == i)
					aShortArray9087[i_151_] = i_150_;
			}
		}
	}

	public void method2715(byte i, byte[] is) {
		if ((anInt9058 & 0x100000) == 0)
			throw new RuntimeException();
		if (aByteArray9086 == null)
			aByteArray9086 = new byte[anInt9074];
		if (is == null) {
			for (int i_152_ = 0; i_152_ < anInt9074; i_152_++)
				aByteArray9086[i_152_] = i;
		} else {
			for (int i_153_ = 0; i_153_ < anInt9074; i_153_++) {
				int i_154_ = 255 - ((255 - (is[i_153_] & 0xff)) * (255 - (i & 0xff)) / 255);
				aByteArray9086[i_153_] = (byte) i_154_;
			}
		}
		if (anInt9084 == 2)
			anInt9084 = 1;
	}

	public void method2690() {
		if ((anInt9058 & 0x10) != 16)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i = 0; i < anInt9061; i++)
				anIntArray9065[i] = -anIntArray9065[i];
			if (aClass109Array9067 != null) {
				for (int i = 0; i < anInt9062; i++) {
					if (aClass109Array9067[i] != null)
						aClass109Array9067[i].anInt1327 = -aClass109Array9067[i].anInt1327;
				}
			}
			if (aClass109Array9068 != null) {
				for (int i = 0; i < anInt9062; i++) {
					if (aClass109Array9068[i] != null)
						aClass109Array9068[i].anInt1327 = -aClass109Array9068[i].anInt1327;
				}
			}
			if (aClass96Array9083 != null) {
				for (int i = 0; i < anInt9074; i++) {
					if (aClass96Array9083[i] != null)
						aClass96Array9083[i].anInt1183 = -aClass96Array9083[i].anInt1183;
				}
			}
			short[] is = aShortArray9064;
			aShortArray9064 = aShortArray9063;
			aShortArray9063 = is;
			if (aFloatArrayArray9117 != null) {
				for (int i = 0; i < anInt9074; i++) {
					if (aFloatArrayArray9117[i] != null) {
						float f = aFloatArrayArray9117[i][0];
						aFloatArrayArray9117[i][0] = aFloatArrayArray9117[i][2];
						aFloatArrayArray9117[i][2] = f;
					}
					if (aFloatArrayArray9075[i] != null) {
						float f = aFloatArrayArray9075[i][0];
						aFloatArrayArray9075[i][0] = aFloatArrayArray9075[i][2];
						aFloatArrayArray9075[i][2] = f;
					}
				}
			}
			aBool9105 = false;
			anInt9084 = 0;
		}
	}

	void method2694() {
		if (aClass178_Sub3_9049.anInt9819 * 1353126165 > 1) {
			synchronized (this) {
				while (aBool1796) {
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBool1796 = true;
			}
		}
	}

	public void method2821(int i, int i_155_, int i_156_, int i_157_) {
		if ((anInt9058 & 0x80000) != 524288)
			throw new IllegalStateException();
		for (int i_158_ = 0; i_158_ < anInt9074; i_158_++) {
			int i_159_ = aShortArray9088[i_158_] & 0xffff;
			int i_160_ = i_159_ >> 10 & 0x3f;
			int i_161_ = i_159_ >> 7 & 0x7;
			int i_162_ = i_159_ & 0x7f;
			if (i != -1)
				i_160_ += (i - i_160_) * i_157_ >> 7;
			if (i_155_ != -1)
				i_161_ += (i_155_ - i_161_) * i_157_ >> 7;
			if (i_156_ != -1)
				i_162_ += (i_156_ - i_162_) * i_157_ >> 7;
			aShortArray9088[i_158_] = (short) (i_160_ << 10 | i_161_ << 7 | i_162_);
		}
		if (aClass101Array9102 != null) {
			for (int i_163_ = 0; i_163_ < anInt9101; i_163_++) {
				Class101 class101 = aClass101Array9102[i_163_];
				Class103 class103 = aClass103Array9103[i_163_];
				class103.anInt1258 = (class103.anInt1258 * 330457669 & ~0xffffff | ((Class638.anIntArray8306[Class493.method8085((aShortArray9088[(class101.anInt1241 * -566359109)]) & 0xffff, 1764096142) & 0xffff]) & 0xffffff)) * -1951506291;
			}
		}
		if (anInt9084 == 2)
			anInt9084 = 1;
	}

	void method14469() {
		aClass109Array9067 = null;
		aClass109Array9068 = null;
		aClass96Array9083 = null;
		aBool9105 = false;
	}

	public void method2852(Class435 class435) {
		method14529(aClass178_Sub3_9049.method15475(Thread.currentThread()));
		Class441 class441 = aClass99_9069.aClass441_1202;
		class441.method7090(class435);
		if (aClass184Array9089 != null) {
			for (int i = 0; i < aClass184Array9089.length; i++) {
				Class184 class184 = aClass184Array9089[i];
				Class184 class184_164_ = class184;
				if (class184.aClass184_2111 != null)
					class184_164_ = class184.aClass184_2111;
				class184_164_.anInt2117 = ((int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) anIntArray9077[(class184.anInt2113 * 1717084103)]) + (class441.aFloatArray4916[4] * (float) (anIntArray9047[(class184.anInt2113 * 1717084103)])) + (class441.aFloatArray4916[8] * (float) (anIntArray9065[(class184.anInt2113 * 1717084103)])))) * 1979506107);
				class184_164_.anInt2118 = (int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) (anIntArray9077[class184.anInt2113 * 1717084103])) + (class441.aFloatArray4916[5] * (float) anIntArray9047[(class184.anInt2113 * 1717084103)]) + (class441.aFloatArray4916[9] * (float) (anIntArray9065[(class184.anInt2113 * 1717084103)])))) * 546606927;
				class184_164_.anInt2119 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9077[(class184.anInt2113 * 1717084103)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9047[(class184.anInt2113 * 1717084103)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9065[(class184.anInt2113 * 1717084103)])))) * 1120011767);
				class184_164_.anInt2120 = (int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) (anIntArray9077[class184.anInt2114 * -615332511])) + (class441.aFloatArray4916[4] * (float) anIntArray9047[(class184.anInt2114 * -615332511)]) + (class441.aFloatArray4916[8] * (float) (anIntArray9065[(class184.anInt2114 * -615332511)])))) * 942705911;
				class184_164_.anInt2121 = (int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) (anIntArray9077[class184.anInt2114 * -615332511])) + (class441.aFloatArray4916[5] * (float) anIntArray9047[(class184.anInt2114 * -615332511)]) + (class441.aFloatArray4916[9] * (float) (anIntArray9065[(class184.anInt2114 * -615332511)])))) * 607651075;
				class184_164_.anInt2122 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9077[(class184.anInt2114 * -615332511)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9047[(class184.anInt2114 * -615332511)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9065[(class184.anInt2114 * -615332511)])))) * 2070256909);
				class184_164_.anInt2125 = (int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) (anIntArray9077[class184.anInt2115 * -648014401])) + (class441.aFloatArray4916[4] * (float) anIntArray9047[(class184.anInt2115 * -648014401)]) + (class441.aFloatArray4916[8] * (float) (anIntArray9065[(class184.anInt2115 * -648014401)])))) * 528708299;
				class184_164_.anInt2124 = (int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) (anIntArray9077[class184.anInt2115 * -648014401])) + (class441.aFloatArray4916[5] * (float) anIntArray9047[(class184.anInt2115 * -648014401)]) + (class441.aFloatArray4916[9] * (float) (anIntArray9065[(class184.anInt2115 * -648014401)])))) * 588958573;
				class184_164_.anInt2110 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9077[(class184.anInt2115 * -648014401)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9047[(class184.anInt2115 * -648014401)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9065[(class184.anInt2115 * -648014401)])))) * -342864097);
			}
		}
		if (aClass143Array9100 != null) {
			for (int i = 0; i < aClass143Array9100.length; i++) {
				Class143 class143 = aClass143Array9100[i];
				Class143 class143_165_ = class143;
				if (class143.aClass143_1687 != null)
					class143_165_ = class143.aClass143_1687;
				if (class143.aClass441_1692 != null)
					class143.aClass441_1692.method7086(class441);
				else
					class143.aClass441_1692 = new Class441(class441);
				class143_165_.anInt1689 = (int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) (anIntArray9077[class143.anInt1688 * -256753261])) + (class441.aFloatArray4916[4] * (float) anIntArray9047[(class143.anInt1688 * -256753261)]) + (class441.aFloatArray4916[8] * (float) (anIntArray9065[(class143.anInt1688 * -256753261)])))) * 246585729;
				class143_165_.anInt1690 = ((int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) anIntArray9077[(class143.anInt1688 * -256753261)]) + (class441.aFloatArray4916[5] * (float) (anIntArray9047[(class143.anInt1688 * -256753261)])) + (class441.aFloatArray4916[9] * (float) (anIntArray9065[(class143.anInt1688 * -256753261)])))) * 1541286973);
				class143_165_.anInt1691 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9077[(class143.anInt1688 * -256753261)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9047[(class143.anInt1688 * -256753261)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9065[(class143.anInt1688 * -256753261)])))) * -1727847879);
			}
		}
	}

	void method2703() {
		if (aClass178_Sub3_9049.anInt9819 * 1353126165 > 1) {
			synchronized (this) {
				aBool1796 = false;
				this.notifyAll();
			}
		}
	}

	boolean method2702() {
		if (anIntArrayArray9091 == null)
			return false;
		anInt9095 = 0;
		anInt9096 = 0;
		anInt9097 = 0;
		return true;
	}

	void method2819() {
		if (aBool9094) {
			for (int i = 0; i < anInt9061; i++) {
				anIntArray9077[i] = anIntArray9077[i] + 7 >> 4;
				anIntArray9047[i] = anIntArray9047[i] + 7 >> 4;
				anIntArray9065[i] = anIntArray9065[i] + 7 >> 4;
			}
			aBool9094 = false;
		}
		if (aBool9093) {
			method14503();
			aBool9093 = false;
		}
		aBool9105 = false;
	}

	void method2856(int i, int[] is, int i_166_, int i_167_, int i_168_, int i_169_, boolean bool) {
		int i_170_ = is.length;
		if (i == 0) {
			i_166_ <<= 4;
			i_167_ <<= 4;
			i_168_ <<= 4;
			if (!aBool9094) {
				for (int i_171_ = 0; i_171_ < anInt9061; i_171_++) {
					anIntArray9077[i_171_] <<= 4;
					anIntArray9047[i_171_] <<= 4;
					anIntArray9065[i_171_] <<= 4;
				}
				aBool9094 = true;
			}
			int i_172_ = 0;
			anInt9095 = 0;
			anInt9096 = 0;
			anInt9097 = 0;
			for (int i_173_ = 0; i_173_ < i_170_; i_173_++) {
				int i_174_ = is[i_173_];
				if (i_174_ < anIntArrayArray9091.length) {
					int[] is_175_ = anIntArrayArray9091[i_174_];
					for (int i_176_ = 0; i_176_ < is_175_.length; i_176_++) {
						int i_177_ = is_175_[i_176_];
						anInt9095 += anIntArray9077[i_177_];
						anInt9096 += anIntArray9047[i_177_];
						anInt9097 += anIntArray9065[i_177_];
						i_172_++;
					}
				}
			}
			if (i_172_ > 0) {
				anInt9095 = anInt9095 / i_172_ + i_166_;
				anInt9096 = anInt9096 / i_172_ + i_167_;
				anInt9097 = anInt9097 / i_172_ + i_168_;
			} else {
				anInt9095 = i_166_;
				anInt9096 = i_167_;
				anInt9097 = i_168_;
			}
		} else if (i == 1) {
			i_166_ <<= 4;
			i_167_ <<= 4;
			i_168_ <<= 4;
			if (!aBool9094) {
				for (int i_178_ = 0; i_178_ < anInt9061; i_178_++) {
					anIntArray9077[i_178_] <<= 4;
					anIntArray9047[i_178_] <<= 4;
					anIntArray9065[i_178_] <<= 4;
				}
				aBool9094 = true;
			}
			for (int i_179_ = 0; i_179_ < i_170_; i_179_++) {
				int i_180_ = is[i_179_];
				if (i_180_ < anIntArrayArray9091.length) {
					int[] is_181_ = anIntArrayArray9091[i_180_];
					for (int i_182_ = 0; i_182_ < is_181_.length; i_182_++) {
						int i_183_ = is_181_[i_182_];
						anIntArray9077[i_183_] += i_166_;
						anIntArray9047[i_183_] += i_167_;
						anIntArray9065[i_183_] += i_168_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_184_ = 0; i_184_ < i_170_; i_184_++) {
				int i_185_ = is[i_184_];
				if (i_185_ < anIntArrayArray9091.length) {
					int[] is_186_ = anIntArrayArray9091[i_185_];
					if ((i_169_ & 0x1) == 0) {
						for (int i_187_ = 0; i_187_ < is_186_.length; i_187_++) {
							int i_188_ = is_186_[i_187_];
							anIntArray9077[i_188_] -= anInt9095;
							anIntArray9047[i_188_] -= anInt9096;
							anIntArray9065[i_188_] -= anInt9097;
							if (i_168_ != 0) {
								int i_189_ = Class433.anIntArray4880[i_168_];
								int i_190_ = Class433.anIntArray4881[i_168_];
								int i_191_ = (anIntArray9047[i_188_] * i_189_ + anIntArray9077[i_188_] * i_190_ + 16383) >> 14;
								anIntArray9047[i_188_] = (anIntArray9047[i_188_] * i_190_ - anIntArray9077[i_188_] * i_189_ + 16383) >> 14;
								anIntArray9077[i_188_] = i_191_;
							}
							if (i_166_ != 0) {
								int i_192_ = Class433.anIntArray4880[i_166_];
								int i_193_ = Class433.anIntArray4881[i_166_];
								int i_194_ = (anIntArray9047[i_188_] * i_193_ - anIntArray9065[i_188_] * i_192_ + 16383) >> 14;
								anIntArray9065[i_188_] = (anIntArray9047[i_188_] * i_192_ + anIntArray9065[i_188_] * i_193_ + 16383) >> 14;
								anIntArray9047[i_188_] = i_194_;
							}
							if (i_167_ != 0) {
								int i_195_ = Class433.anIntArray4880[i_167_];
								int i_196_ = Class433.anIntArray4881[i_167_];
								int i_197_ = (anIntArray9065[i_188_] * i_195_ + anIntArray9077[i_188_] * i_196_ + 16383) >> 14;
								anIntArray9065[i_188_] = (anIntArray9065[i_188_] * i_196_ - anIntArray9077[i_188_] * i_195_ + 16383) >> 14;
								anIntArray9077[i_188_] = i_197_;
							}
							anIntArray9077[i_188_] += anInt9095;
							anIntArray9047[i_188_] += anInt9096;
							anIntArray9065[i_188_] += anInt9097;
						}
					} else {
						for (int i_198_ = 0; i_198_ < is_186_.length; i_198_++) {
							int i_199_ = is_186_[i_198_];
							anIntArray9077[i_199_] -= anInt9095;
							anIntArray9047[i_199_] -= anInt9096;
							anIntArray9065[i_199_] -= anInt9097;
							if (i_166_ != 0) {
								int i_200_ = Class433.anIntArray4880[i_166_];
								int i_201_ = Class433.anIntArray4881[i_166_];
								int i_202_ = (anIntArray9047[i_199_] * i_201_ - anIntArray9065[i_199_] * i_200_ + 16383) >> 14;
								anIntArray9065[i_199_] = (anIntArray9047[i_199_] * i_200_ + anIntArray9065[i_199_] * i_201_ + 16383) >> 14;
								anIntArray9047[i_199_] = i_202_;
							}
							if (i_168_ != 0) {
								int i_203_ = Class433.anIntArray4880[i_168_];
								int i_204_ = Class433.anIntArray4881[i_168_];
								int i_205_ = (anIntArray9047[i_199_] * i_203_ + anIntArray9077[i_199_] * i_204_ + 16383) >> 14;
								anIntArray9047[i_199_] = (anIntArray9047[i_199_] * i_204_ - anIntArray9077[i_199_] * i_203_ + 16383) >> 14;
								anIntArray9077[i_199_] = i_205_;
							}
							if (i_167_ != 0) {
								int i_206_ = Class433.anIntArray4880[i_167_];
								int i_207_ = Class433.anIntArray4881[i_167_];
								int i_208_ = (anIntArray9065[i_199_] * i_206_ + anIntArray9077[i_199_] * i_207_ + 16383) >> 14;
								anIntArray9065[i_199_] = (anIntArray9065[i_199_] * i_207_ - anIntArray9077[i_199_] * i_206_ + 16383) >> 14;
								anIntArray9077[i_199_] = i_208_;
							}
							anIntArray9077[i_199_] += anInt9095;
							anIntArray9047[i_199_] += anInt9096;
							anIntArray9065[i_199_] += anInt9097;
						}
					}
				}
			}
		} else if (i == 3) {
			for (int i_209_ = 0; i_209_ < i_170_; i_209_++) {
				int i_210_ = is[i_209_];
				if (i_210_ < anIntArrayArray9091.length) {
					int[] is_211_ = anIntArrayArray9091[i_210_];
					for (int i_212_ = 0; i_212_ < is_211_.length; i_212_++) {
						int i_213_ = is_211_[i_212_];
						anIntArray9077[i_213_] -= anInt9095;
						anIntArray9047[i_213_] -= anInt9096;
						anIntArray9065[i_213_] -= anInt9097;
						anIntArray9077[i_213_] = anIntArray9077[i_213_] * i_166_ / 128;
						anIntArray9047[i_213_] = anIntArray9047[i_213_] * i_167_ / 128;
						anIntArray9065[i_213_] = anIntArray9065[i_213_] * i_168_ / 128;
						anIntArray9077[i_213_] += anInt9095;
						anIntArray9047[i_213_] += anInt9096;
						anIntArray9065[i_213_] += anInt9097;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9048 != null && aByteArray9086 != null) {
				for (int i_214_ = 0; i_214_ < i_170_; i_214_++) {
					int i_215_ = is[i_214_];
					if (i_215_ < anIntArrayArray9048.length) {
						int[] is_216_ = anIntArrayArray9048[i_215_];
						for (int i_217_ = 0; i_217_ < is_216_.length; i_217_++) {
							int i_218_ = is_216_[i_217_];
							int i_219_ = (aByteArray9086[i_218_] & 0xff) + i_166_ * 8;
							if (i_219_ < 0)
								i_219_ = 0;
							else if (i_219_ > 255)
								i_219_ = 255;
							aByteArray9086[i_218_] = (byte) i_219_;
						}
					}
				}
				if (aClass101Array9102 != null) {
					for (int i_220_ = 0; i_220_ < anInt9101; i_220_++) {
						Class101 class101 = aClass101Array9102[i_220_];
						Class103 class103 = aClass103Array9103[i_220_];
						class103.anInt1258 = (class103.anInt1258 * 330457669 & 0xffffff | 255 - ((aByteArray9086[class101.anInt1241 * -566359109]) & 0xff) << 24) * -1951506291;
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9048 != null) {
				for (int i_221_ = 0; i_221_ < i_170_; i_221_++) {
					int i_222_ = is[i_221_];
					if (i_222_ < anIntArrayArray9048.length) {
						int[] is_223_ = anIntArrayArray9048[i_222_];
						for (int i_224_ = 0; i_224_ < is_223_.length; i_224_++) {
							int i_225_ = is_223_[i_224_];
							int i_226_ = aShortArray9088[i_225_] & 0xffff;
							int i_227_ = i_226_ >> 10 & 0x3f;
							int i_228_ = i_226_ >> 7 & 0x7;
							int i_229_ = i_226_ & 0x7f;
							i_227_ = i_227_ + i_166_ & 0x3f;
							i_228_ += i_167_;
							if (i_228_ < 0)
								i_228_ = 0;
							else if (i_228_ > 7)
								i_228_ = 7;
							i_229_ += i_168_;
							if (i_229_ < 0)
								i_229_ = 0;
							else if (i_229_ > 127)
								i_229_ = 127;
							aShortArray9088[i_225_] = (short) (i_227_ << 10 | i_228_ << 7 | i_229_);
						}
						aBool9093 = true;
					}
				}
				if (aClass101Array9102 != null) {
					for (int i_230_ = 0; i_230_ < anInt9101; i_230_++) {
						Class101 class101 = aClass101Array9102[i_230_];
						Class103 class103 = aClass103Array9103[i_230_];
						class103.anInt1258 = (class103.anInt1258 * 330457669 & ~0xffffff | ((Class638.anIntArray8306[Class493.method8085(((aShortArray9088[(class101.anInt1241 * -566359109)]) & 0xffff), -311289212) & 0xffff]) & 0xffffff)) * -1951506291;
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9104 != null) {
				for (int i_231_ = 0; i_231_ < i_170_; i_231_++) {
					int i_232_ = is[i_231_];
					if (i_232_ < anIntArrayArray9104.length) {
						int[] is_233_ = anIntArrayArray9104[i_232_];
						for (int i_234_ = 0; i_234_ < is_233_.length; i_234_++) {
							Class103 class103 = aClass103Array9103[is_233_[i_234_]];
							class103.anInt1248 += i_166_ * 356391365;
							class103.anInt1251 += i_167_ * 1938564783;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9104 != null) {
				for (int i_235_ = 0; i_235_ < i_170_; i_235_++) {
					int i_236_ = is[i_235_];
					if (i_236_ < anIntArrayArray9104.length) {
						int[] is_237_ = anIntArrayArray9104[i_236_];
						for (int i_238_ = 0; i_238_ < is_237_.length; i_238_++) {
							Class103 class103 = aClass103Array9103[is_237_[i_238_]];
							class103.aFloat1249 = (class103.aFloat1249 * (float) i_166_ / 128.0F);
							class103.aFloat1250 = (class103.aFloat1250 * (float) i_167_ / 128.0F);
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9104 != null) {
				for (int i_239_ = 0; i_239_ < i_170_; i_239_++) {
					int i_240_ = is[i_239_];
					if (i_240_ < anIntArrayArray9104.length) {
						int[] is_241_ = anIntArrayArray9104[i_240_];
						for (int i_242_ = 0; i_242_ < is_241_.length; i_242_++) {
							Class103 class103 = aClass103Array9103[is_241_[i_242_]];
							class103.anInt1253 = (class103.anInt1253 * 212895487 + i_166_ & 0x3fff) * 891189503;
						}
					}
				}
			}
		}
	}

	void method2720(int i, int[] is, int i_243_, int i_244_, int i_245_, boolean bool, int i_246_, int[] is_247_) {
		int i_248_ = is.length;
		if (i == 0) {
			i_243_ <<= 4;
			i_244_ <<= 4;
			i_245_ <<= 4;
			if (!aBool9094) {
				for (int i_249_ = 0; i_249_ < anInt9061; i_249_++) {
					anIntArray9077[i_249_] <<= 4;
					anIntArray9047[i_249_] <<= 4;
					anIntArray9065[i_249_] <<= 4;
				}
				aBool9094 = true;
			}
			int i_250_ = 0;
			anInt9095 = 0;
			anInt9096 = 0;
			anInt9097 = 0;
			for (int i_251_ = 0; i_251_ < i_248_; i_251_++) {
				int i_252_ = is[i_251_];
				if (i_252_ < anIntArrayArray9091.length) {
					int[] is_253_ = anIntArrayArray9091[i_252_];
					for (int i_254_ = 0; i_254_ < is_253_.length; i_254_++) {
						int i_255_ = is_253_[i_254_];
						if (aShortArray9066 == null || (i_246_ & aShortArray9066[i_255_]) != 0) {
							anInt9095 += anIntArray9077[i_255_];
							anInt9096 += anIntArray9047[i_255_];
							anInt9097 += anIntArray9065[i_255_];
							i_250_++;
						}
					}
				}
			}
			if (i_250_ > 0) {
				anInt9095 = anInt9095 / i_250_ + i_243_;
				anInt9096 = anInt9096 / i_250_ + i_244_;
				anInt9097 = anInt9097 / i_250_ + i_245_;
				aBool9098 = true;
			} else {
				anInt9095 = i_243_;
				anInt9096 = i_244_;
				anInt9097 = i_245_;
			}
		} else if (i == 1) {
			if (is_247_ != null) {
				int i_256_ = ((is_247_[0] * i_243_ + is_247_[1] * i_244_ + is_247_[2] * i_245_ + 8192) >> 14);
				int i_257_ = ((is_247_[3] * i_243_ + is_247_[4] * i_244_ + is_247_[5] * i_245_ + 8192) >> 14);
				int i_258_ = ((is_247_[6] * i_243_ + is_247_[7] * i_244_ + is_247_[8] * i_245_ + 8192) >> 14);
				i_243_ = i_256_;
				i_244_ = i_257_;
				i_245_ = i_258_;
			}
			i_243_ <<= 4;
			i_244_ <<= 4;
			i_245_ <<= 4;
			if (!aBool9094) {
				for (int i_259_ = 0; i_259_ < anInt9061; i_259_++) {
					anIntArray9077[i_259_] <<= 4;
					anIntArray9047[i_259_] <<= 4;
					anIntArray9065[i_259_] <<= 4;
				}
				aBool9094 = true;
			}
			for (int i_260_ = 0; i_260_ < i_248_; i_260_++) {
				int i_261_ = is[i_260_];
				if (i_261_ < anIntArrayArray9091.length) {
					int[] is_262_ = anIntArrayArray9091[i_261_];
					for (int i_263_ = 0; i_263_ < is_262_.length; i_263_++) {
						int i_264_ = is_262_[i_263_];
						if (aShortArray9066 == null || (i_246_ & aShortArray9066[i_264_]) != 0) {
							anIntArray9077[i_264_] += i_243_;
							anIntArray9047[i_264_] += i_244_;
							anIntArray9065[i_264_] += i_245_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_247_ != null) {
				if (!aBool9094) {
					for (int i_265_ = 0; i_265_ < anInt9061; i_265_++) {
						anIntArray9077[i_265_] <<= 4;
						anIntArray9047[i_265_] <<= 4;
						anIntArray9065[i_265_] <<= 4;
					}
					aBool9094 = true;
				}
				int i_266_ = is_247_[9] << 4;
				int i_267_ = is_247_[10] << 4;
				int i_268_ = is_247_[11] << 4;
				int i_269_ = is_247_[12] << 4;
				int i_270_ = is_247_[13] << 4;
				int i_271_ = is_247_[14] << 4;
				if (aBool9098) {
					int i_272_ = ((is_247_[0] * anInt9095 + is_247_[3] * anInt9096 + is_247_[6] * anInt9097 + 8192) >> 14);
					int i_273_ = ((is_247_[1] * anInt9095 + is_247_[4] * anInt9096 + is_247_[7] * anInt9097 + 8192) >> 14);
					int i_274_ = ((is_247_[2] * anInt9095 + is_247_[5] * anInt9096 + is_247_[8] * anInt9097 + 8192) >> 14);
					i_272_ += i_269_;
					i_273_ += i_270_;
					i_274_ += i_271_;
					anInt9095 = i_272_;
					anInt9096 = i_273_;
					anInt9097 = i_274_;
					aBool9098 = false;
				}
				int[] is_275_ = new int[9];
				int i_276_ = Class433.anIntArray4881[i_243_];
				int i_277_ = Class433.anIntArray4880[i_243_];
				int i_278_ = Class433.anIntArray4881[i_244_];
				int i_279_ = Class433.anIntArray4880[i_244_];
				int i_280_ = Class433.anIntArray4881[i_245_];
				int i_281_ = Class433.anIntArray4880[i_245_];
				int i_282_ = i_277_ * i_280_ + 8192 >> 14;
				int i_283_ = i_277_ * i_281_ + 8192 >> 14;
				is_275_[0] = i_278_ * i_280_ + i_279_ * i_283_ + 8192 >> 14;
				is_275_[1] = -i_278_ * i_281_ + i_279_ * i_282_ + 8192 >> 14;
				is_275_[2] = i_279_ * i_276_ + 8192 >> 14;
				is_275_[3] = i_276_ * i_281_ + 8192 >> 14;
				is_275_[4] = i_276_ * i_280_ + 8192 >> 14;
				is_275_[5] = -i_277_;
				is_275_[6] = -i_279_ * i_280_ + i_278_ * i_283_ + 8192 >> 14;
				is_275_[7] = i_279_ * i_281_ + i_278_ * i_282_ + 8192 >> 14;
				is_275_[8] = i_278_ * i_276_ + 8192 >> 14;
				int i_284_ = (is_275_[0] * -anInt9095 + is_275_[1] * -anInt9096 + is_275_[2] * -anInt9097 + 8192) >> 14;
				int i_285_ = (is_275_[3] * -anInt9095 + is_275_[4] * -anInt9096 + is_275_[5] * -anInt9097 + 8192) >> 14;
				int i_286_ = (is_275_[6] * -anInt9095 + is_275_[7] * -anInt9096 + is_275_[8] * -anInt9097 + 8192) >> 14;
				int i_287_ = i_284_ + anInt9095;
				int i_288_ = i_285_ + anInt9096;
				int i_289_ = i_286_ + anInt9097;
				int[] is_290_ = new int[9];
				for (int i_291_ = 0; i_291_ < 3; i_291_++) {
					for (int i_292_ = 0; i_292_ < 3; i_292_++) {
						int i_293_ = 0;
						for (int i_294_ = 0; i_294_ < 3; i_294_++)
							i_293_ += (is_275_[i_291_ * 3 + i_294_] * is_247_[i_292_ * 3 + i_294_]);
						is_290_[i_291_ * 3 + i_292_] = i_293_ + 8192 >> 14;
					}
				}
				int i_295_ = ((is_275_[0] * i_269_ + is_275_[1] * i_270_ + is_275_[2] * i_271_ + 8192) >> 14);
				int i_296_ = ((is_275_[3] * i_269_ + is_275_[4] * i_270_ + is_275_[5] * i_271_ + 8192) >> 14);
				int i_297_ = ((is_275_[6] * i_269_ + is_275_[7] * i_270_ + is_275_[8] * i_271_ + 8192) >> 14);
				i_295_ += i_287_;
				i_296_ += i_288_;
				i_297_ += i_289_;
				int[] is_298_ = new int[9];
				for (int i_299_ = 0; i_299_ < 3; i_299_++) {
					for (int i_300_ = 0; i_300_ < 3; i_300_++) {
						int i_301_ = 0;
						for (int i_302_ = 0; i_302_ < 3; i_302_++)
							i_301_ += (is_247_[i_299_ * 3 + i_302_] * is_290_[i_300_ + i_302_ * 3]);
						is_298_[i_299_ * 3 + i_300_] = i_301_ + 8192 >> 14;
					}
				}
				int i_303_ = ((is_247_[0] * i_295_ + is_247_[1] * i_296_ + is_247_[2] * i_297_ + 8192) >> 14);
				int i_304_ = ((is_247_[3] * i_295_ + is_247_[4] * i_296_ + is_247_[5] * i_297_ + 8192) >> 14);
				int i_305_ = ((is_247_[6] * i_295_ + is_247_[7] * i_296_ + is_247_[8] * i_297_ + 8192) >> 14);
				i_303_ += i_266_;
				i_304_ += i_267_;
				i_305_ += i_268_;
				for (int i_306_ = 0; i_306_ < i_248_; i_306_++) {
					int i_307_ = is[i_306_];
					if (i_307_ < anIntArrayArray9091.length) {
						int[] is_308_ = anIntArrayArray9091[i_307_];
						for (int i_309_ = 0; i_309_ < is_308_.length; i_309_++) {
							int i_310_ = is_308_[i_309_];
							if (aShortArray9066 == null || (i_246_ & aShortArray9066[i_310_]) != 0) {
								int i_311_ = ((is_298_[0] * anIntArray9077[i_310_] + is_298_[1] * anIntArray9047[i_310_] + is_298_[2] * anIntArray9065[i_310_] + 8192) >> 14);
								int i_312_ = ((is_298_[3] * anIntArray9077[i_310_] + is_298_[4] * anIntArray9047[i_310_] + is_298_[5] * anIntArray9065[i_310_] + 8192) >> 14);
								int i_313_ = ((is_298_[6] * anIntArray9077[i_310_] + is_298_[7] * anIntArray9047[i_310_] + is_298_[8] * anIntArray9065[i_310_] + 8192) >> 14);
								i_311_ += i_303_;
								i_312_ += i_304_;
								i_313_ += i_305_;
								anIntArray9077[i_310_] = i_311_;
								anIntArray9047[i_310_] = i_312_;
								anIntArray9065[i_310_] = i_313_;
							}
						}
					}
				}
			} else {
				for (int i_314_ = 0; i_314_ < i_248_; i_314_++) {
					int i_315_ = is[i_314_];
					if (i_315_ < anIntArrayArray9091.length) {
						int[] is_316_ = anIntArrayArray9091[i_315_];
						for (int i_317_ = 0; i_317_ < is_316_.length; i_317_++) {
							int i_318_ = is_316_[i_317_];
							if (aShortArray9066 == null || (i_246_ & aShortArray9066[i_318_]) != 0) {
								anIntArray9077[i_318_] -= anInt9095;
								anIntArray9047[i_318_] -= anInt9096;
								anIntArray9065[i_318_] -= anInt9097;
								if (i_245_ != 0) {
									int i_319_ = Class433.anIntArray4880[i_245_];
									int i_320_ = Class433.anIntArray4881[i_245_];
									int i_321_ = ((anIntArray9047[i_318_] * i_319_ + anIntArray9077[i_318_] * i_320_ + 16383) >> 14);
									anIntArray9047[i_318_] = (anIntArray9047[i_318_] * i_320_ - anIntArray9077[i_318_] * i_319_ + 16383) >> 14;
									anIntArray9077[i_318_] = i_321_;
								}
								if (i_243_ != 0) {
									int i_322_ = Class433.anIntArray4880[i_243_];
									int i_323_ = Class433.anIntArray4881[i_243_];
									int i_324_ = ((anIntArray9047[i_318_] * i_323_ - anIntArray9065[i_318_] * i_322_ + 16383) >> 14);
									anIntArray9065[i_318_] = (anIntArray9047[i_318_] * i_322_ + anIntArray9065[i_318_] * i_323_ + 16383) >> 14;
									anIntArray9047[i_318_] = i_324_;
								}
								if (i_244_ != 0) {
									int i_325_ = Class433.anIntArray4880[i_244_];
									int i_326_ = Class433.anIntArray4881[i_244_];
									int i_327_ = ((anIntArray9065[i_318_] * i_325_ + anIntArray9077[i_318_] * i_326_ + 16383) >> 14);
									anIntArray9065[i_318_] = (anIntArray9065[i_318_] * i_326_ - anIntArray9077[i_318_] * i_325_ + 16383) >> 14;
									anIntArray9077[i_318_] = i_327_;
								}
								anIntArray9077[i_318_] += anInt9095;
								anIntArray9047[i_318_] += anInt9096;
								anIntArray9065[i_318_] += anInt9097;
							}
						}
					}
				}
			}
		} else if (i == 3) {
			if (is_247_ != null) {
				if (!aBool9094) {
					for (int i_328_ = 0; i_328_ < anInt9061; i_328_++) {
						anIntArray9077[i_328_] <<= 4;
						anIntArray9047[i_328_] <<= 4;
						anIntArray9065[i_328_] <<= 4;
					}
					aBool9094 = true;
				}
				int i_329_ = is_247_[9] << 4;
				int i_330_ = is_247_[10] << 4;
				int i_331_ = is_247_[11] << 4;
				int i_332_ = is_247_[12] << 4;
				int i_333_ = is_247_[13] << 4;
				int i_334_ = is_247_[14] << 4;
				if (aBool9098) {
					int i_335_ = ((is_247_[0] * anInt9095 + is_247_[3] * anInt9096 + is_247_[6] * anInt9097 + 8192) >> 14);
					int i_336_ = ((is_247_[1] * anInt9095 + is_247_[4] * anInt9096 + is_247_[7] * anInt9097 + 8192) >> 14);
					int i_337_ = ((is_247_[2] * anInt9095 + is_247_[5] * anInt9096 + is_247_[8] * anInt9097 + 8192) >> 14);
					i_335_ += i_332_;
					i_336_ += i_333_;
					i_337_ += i_334_;
					anInt9095 = i_335_;
					anInt9096 = i_336_;
					anInt9097 = i_337_;
					aBool9098 = false;
				}
				int i_338_ = i_243_ << 15 >> 7;
				int i_339_ = i_244_ << 15 >> 7;
				int i_340_ = i_245_ << 15 >> 7;
				int i_341_ = i_338_ * -anInt9095 + 8192 >> 14;
				int i_342_ = i_339_ * -anInt9096 + 8192 >> 14;
				int i_343_ = i_340_ * -anInt9097 + 8192 >> 14;
				int i_344_ = i_341_ + anInt9095;
				int i_345_ = i_342_ + anInt9096;
				int i_346_ = i_343_ + anInt9097;
				int[] is_347_ = new int[9];
				is_347_[0] = i_338_ * is_247_[0] + 8192 >> 14;
				is_347_[1] = i_338_ * is_247_[3] + 8192 >> 14;
				is_347_[2] = i_338_ * is_247_[6] + 8192 >> 14;
				is_347_[3] = i_339_ * is_247_[1] + 8192 >> 14;
				is_347_[4] = i_339_ * is_247_[4] + 8192 >> 14;
				is_347_[5] = i_339_ * is_247_[7] + 8192 >> 14;
				is_347_[6] = i_340_ * is_247_[2] + 8192 >> 14;
				is_347_[7] = i_340_ * is_247_[5] + 8192 >> 14;
				is_347_[8] = i_340_ * is_247_[8] + 8192 >> 14;
				int i_348_ = i_338_ * i_332_ + 8192 >> 14;
				int i_349_ = i_339_ * i_333_ + 8192 >> 14;
				int i_350_ = i_340_ * i_334_ + 8192 >> 14;
				i_348_ += i_344_;
				i_349_ += i_345_;
				i_350_ += i_346_;
				int[] is_351_ = new int[9];
				for (int i_352_ = 0; i_352_ < 3; i_352_++) {
					for (int i_353_ = 0; i_353_ < 3; i_353_++) {
						int i_354_ = 0;
						for (int i_355_ = 0; i_355_ < 3; i_355_++)
							i_354_ += (is_247_[i_352_ * 3 + i_355_] * is_347_[i_353_ + i_355_ * 3]);
						is_351_[i_352_ * 3 + i_353_] = i_354_ + 8192 >> 14;
					}
				}
				int i_356_ = ((is_247_[0] * i_348_ + is_247_[1] * i_349_ + is_247_[2] * i_350_ + 8192) >> 14);
				int i_357_ = ((is_247_[3] * i_348_ + is_247_[4] * i_349_ + is_247_[5] * i_350_ + 8192) >> 14);
				int i_358_ = ((is_247_[6] * i_348_ + is_247_[7] * i_349_ + is_247_[8] * i_350_ + 8192) >> 14);
				i_356_ += i_329_;
				i_357_ += i_330_;
				i_358_ += i_331_;
				for (int i_359_ = 0; i_359_ < i_248_; i_359_++) {
					int i_360_ = is[i_359_];
					if (i_360_ < anIntArrayArray9091.length) {
						int[] is_361_ = anIntArrayArray9091[i_360_];
						for (int i_362_ = 0; i_362_ < is_361_.length; i_362_++) {
							int i_363_ = is_361_[i_362_];
							if (aShortArray9066 == null || (i_246_ & aShortArray9066[i_363_]) != 0) {
								int i_364_ = ((is_351_[0] * anIntArray9077[i_363_] + is_351_[1] * anIntArray9047[i_363_] + is_351_[2] * anIntArray9065[i_363_] + 8192) >> 14);
								int i_365_ = ((is_351_[3] * anIntArray9077[i_363_] + is_351_[4] * anIntArray9047[i_363_] + is_351_[5] * anIntArray9065[i_363_] + 8192) >> 14);
								int i_366_ = ((is_351_[6] * anIntArray9077[i_363_] + is_351_[7] * anIntArray9047[i_363_] + is_351_[8] * anIntArray9065[i_363_] + 8192) >> 14);
								i_364_ += i_356_;
								i_365_ += i_357_;
								i_366_ += i_358_;
								anIntArray9077[i_363_] = i_364_;
								anIntArray9047[i_363_] = i_365_;
								anIntArray9065[i_363_] = i_366_;
							}
						}
					}
				}
			} else {
				for (int i_367_ = 0; i_367_ < i_248_; i_367_++) {
					int i_368_ = is[i_367_];
					if (i_368_ < anIntArrayArray9091.length) {
						int[] is_369_ = anIntArrayArray9091[i_368_];
						for (int i_370_ = 0; i_370_ < is_369_.length; i_370_++) {
							int i_371_ = is_369_[i_370_];
							if (aShortArray9066 == null || (i_246_ & aShortArray9066[i_371_]) != 0) {
								anIntArray9077[i_371_] -= anInt9095;
								anIntArray9047[i_371_] -= anInt9096;
								anIntArray9065[i_371_] -= anInt9097;
								anIntArray9077[i_371_] = anIntArray9077[i_371_] * i_243_ / 128;
								anIntArray9047[i_371_] = anIntArray9047[i_371_] * i_244_ / 128;
								anIntArray9065[i_371_] = anIntArray9065[i_371_] * i_245_ / 128;
								anIntArray9077[i_371_] += anInt9095;
								anIntArray9047[i_371_] += anInt9096;
								anIntArray9065[i_371_] += anInt9097;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9048 != null && aByteArray9086 != null) {
				for (int i_372_ = 0; i_372_ < i_248_; i_372_++) {
					int i_373_ = is[i_372_];
					if (i_373_ < anIntArrayArray9048.length) {
						int[] is_374_ = anIntArrayArray9048[i_373_];
						for (int i_375_ = 0; i_375_ < is_374_.length; i_375_++) {
							int i_376_ = is_374_[i_375_];
							if (aShortArray9078 == null || (i_246_ & aShortArray9078[i_376_]) != 0) {
								int i_377_ = ((aByteArray9086[i_376_] & 0xff) + i_243_ * 8);
								if (i_377_ < 0)
									i_377_ = 0;
								else if (i_377_ > 255)
									i_377_ = 255;
								aByteArray9086[i_376_] = (byte) i_377_;
							}
						}
					}
				}
				if (aClass101Array9102 != null) {
					for (int i_378_ = 0; i_378_ < anInt9101; i_378_++) {
						Class101 class101 = aClass101Array9102[i_378_];
						Class103 class103 = aClass103Array9103[i_378_];
						class103.anInt1258 = (class103.anInt1258 * 330457669 & 0xffffff | 255 - ((aByteArray9086[class101.anInt1241 * -566359109]) & 0xff) << 24) * -1951506291;
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9048 != null) {
				for (int i_379_ = 0; i_379_ < i_248_; i_379_++) {
					int i_380_ = is[i_379_];
					if (i_380_ < anIntArrayArray9048.length) {
						int[] is_381_ = anIntArrayArray9048[i_380_];
						for (int i_382_ = 0; i_382_ < is_381_.length; i_382_++) {
							int i_383_ = is_381_[i_382_];
							if (aShortArray9078 == null || (i_246_ & aShortArray9078[i_383_]) != 0) {
								int i_384_ = aShortArray9088[i_383_] & 0xffff;
								int i_385_ = i_384_ >> 10 & 0x3f;
								int i_386_ = i_384_ >> 7 & 0x7;
								int i_387_ = i_384_ & 0x7f;
								i_385_ = i_385_ + i_243_ & 0x3f;
								i_386_ += i_244_;
								if (i_386_ < 0)
									i_386_ = 0;
								else if (i_386_ > 7)
									i_386_ = 7;
								i_387_ += i_245_;
								if (i_387_ < 0)
									i_387_ = 0;
								else if (i_387_ > 127)
									i_387_ = 127;
								aShortArray9088[i_383_] = (short) (i_385_ << 10 | i_386_ << 7 | i_387_);
							}
						}
						aBool9093 = true;
					}
				}
				if (aClass101Array9102 != null) {
					for (int i_388_ = 0; i_388_ < anInt9101; i_388_++) {
						Class101 class101 = aClass101Array9102[i_388_];
						Class103 class103 = aClass103Array9103[i_388_];
						class103.anInt1258 = (class103.anInt1258 * 330457669 & ~0xffffff | ((Class638.anIntArray8306[Class493.method8085(((aShortArray9088[(class101.anInt1241 * -566359109)]) & 0xffff), 258914355) & 0xffff]) & 0xffffff)) * -1951506291;
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9104 != null) {
				for (int i_389_ = 0; i_389_ < i_248_; i_389_++) {
					int i_390_ = is[i_389_];
					if (i_390_ < anIntArrayArray9104.length) {
						int[] is_391_ = anIntArrayArray9104[i_390_];
						for (int i_392_ = 0; i_392_ < is_391_.length; i_392_++) {
							Class103 class103 = aClass103Array9103[is_391_[i_392_]];
							class103.anInt1248 += i_243_ * 356391365;
							class103.anInt1251 += i_244_ * 1938564783;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9104 != null) {
				for (int i_393_ = 0; i_393_ < i_248_; i_393_++) {
					int i_394_ = is[i_393_];
					if (i_394_ < anIntArrayArray9104.length) {
						int[] is_395_ = anIntArrayArray9104[i_394_];
						for (int i_396_ = 0; i_396_ < is_395_.length; i_396_++) {
							Class103 class103 = aClass103Array9103[is_395_[i_396_]];
							class103.aFloat1249 = (class103.aFloat1249 * (float) i_243_ / 128.0F);
							class103.aFloat1250 = (class103.aFloat1250 * (float) i_244_ / 128.0F);
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9104 != null) {
				for (int i_397_ = 0; i_397_ < i_248_; i_397_++) {
					int i_398_ = is[i_397_];
					if (i_398_ < anIntArrayArray9104.length) {
						int[] is_399_ = anIntArrayArray9104[i_398_];
						for (int i_400_ = 0; i_400_ < is_399_.length; i_400_++) {
							Class103 class103 = aClass103Array9103[is_399_[i_400_]];
							class103.anInt1253 = (class103.anInt1253 * 212895487 + i_243_ & 0x3fff) * 891189503;
						}
					}
				}
			}
		}
	}

	final void method14470(boolean bool, boolean bool_401_, boolean bool_402_, boolean bool_403_, boolean bool_404_) {
		if (aClass101Array9102 != null) {
			for (int i = 0; i < anInt9101; i++) {
				Class101 class101 = aClass101Array9102[i];
				anIntArray9129[class101.anInt1241 * -566359109] = i;
			}
		}
		if (aBool9128 || aClass101Array9102 != null) {
			if ((anInt9058 & 0x100) == 0 && aShortArray9116 != null) {
				for (int i = 0; i < anInt9070; i++) {
					short i_405_ = aShortArray9116[i];
					method14455(bool, bool_401_, bool_402_, i_405_, bool_403_, bool_404_);
				}
			} else {
				for (int i = 0; i < anInt9070; i++) {
					if (!method14473(i) && !method14474(i))
						method14455(bool, bool_401_, bool_402_, i, bool_403_, bool_404_);
				}
				if (aByteArray9130 == null) {
					for (int i = 0; i < anInt9070; i++) {
						if (method14473(i) || method14474(i))
							method14455(bool, bool_401_, bool_402_, i, bool_403_, bool_404_);
					}
				} else {
					for (int i = 0; i < 12; i++) {
						for (int i_406_ = 0; i_406_ < anInt9070; i_406_++) {
							if (aByteArray9130[i_406_] == i && (method14473(i_406_) || method14474(i_406_)))
								method14455(bool, bool_401_, bool_402_, i_406_, bool_403_, bool_404_);
						}
					}
				}
			}
			if (aClass101Array9102 != null)
				method14527(bool, bool_401_, bool_402_);
		} else {
			for (int i = 0; i < anInt9070; i++)
				method14455(bool, bool_401_, bool_402_, i, bool_403_, bool_404_);
		}
	}

	public void method2707(Class435 class435, int i, boolean bool) {
		if (aShortArray9066 != null) {
			Class99 class99 = aClass178_Sub3_9049.method15475(Thread.currentThread());
			Class435 class435_407_ = class99.aClass435_1214;
			class435_407_.method6803(class435);
			if (bool)
				class435_407_.method6857();
			Class441 class441 = class99.aClass441_1202;
			class441.method7090(class435_407_);
			float[] fs = new float[3];
			for (int i_408_ = 0; i_408_ < anInt9062; i_408_++) {
				if ((i & aShortArray9066[i_408_]) != 0) {
					class441.method7185((float) anIntArray9077[i_408_], (float) anIntArray9047[i_408_], (float) anIntArray9065[i_408_], fs);
					anIntArray9077[i_408_] = (int) fs[0];
					anIntArray9047[i_408_] = (int) fs[1];
					anIntArray9065[i_408_] = (int) fs[2];
				}
			}
		}
	}

	public void method2708(Class435 class435, Class180 class180, int i) {
		method14510(class435, class180, i);
	}

	public int method2812() {
		return anInt9059;
	}

	final void method14471(boolean bool, boolean bool_409_, boolean bool_410_, boolean bool_411_, boolean bool_412_) {
		if (aClass101Array9102 != null) {
			for (int i = 0; i < anInt9101; i++) {
				Class101 class101 = aClass101Array9102[i];
				anIntArray9129[class101.anInt1241 * -566359109] = i;
			}
		}
		if (aBool9128 || aClass101Array9102 != null) {
			if ((anInt9058 & 0x100) == 0 && aShortArray9116 != null) {
				for (int i = 0; i < anInt9070; i++) {
					short i_413_ = aShortArray9116[i];
					method14455(bool, bool_409_, bool_410_, i_413_, bool_411_, bool_412_);
				}
			} else {
				for (int i = 0; i < anInt9070; i++) {
					if (!method14473(i) && !method14474(i))
						method14455(bool, bool_409_, bool_410_, i, bool_411_, bool_412_);
				}
				if (aByteArray9130 == null) {
					for (int i = 0; i < anInt9070; i++) {
						if (method14473(i) || method14474(i))
							method14455(bool, bool_409_, bool_410_, i, bool_411_, bool_412_);
					}
				} else {
					for (int i = 0; i < 12; i++) {
						for (int i_414_ = 0; i_414_ < anInt9070; i_414_++) {
							if (aByteArray9130[i_414_] == i && (method14473(i_414_) || method14474(i_414_)))
								method14455(bool, bool_409_, bool_410_, i_414_, bool_411_, bool_412_);
						}
					}
				}
			}
			if (aClass101Array9102 != null)
				method14527(bool, bool_409_, bool_410_);
		} else {
			for (int i = 0; i < anInt9070; i++)
				method14455(bool, bool_409_, bool_410_, i, bool_411_, bool_412_);
		}
	}

	void method14472() {
		synchronized (this) {
			for (int i = 0; i < anInt9062; i++) {
				int i_415_ = anIntArray9077[i];
				anIntArray9077[i] = anIntArray9065[i];
				anIntArray9065[i] = -i_415_;
				if (aClass109Array9067[i] != null) {
					i_415_ = aClass109Array9067[i].anInt1326;
					aClass109Array9067[i].anInt1326 = aClass109Array9067[i].anInt1327;
					aClass109Array9067[i].anInt1327 = -i_415_;
				}
			}
			if (aClass96Array9083 != null) {
				for (int i = 0; i < anInt9074; i++) {
					if (aClass96Array9083[i] != null) {
						int i_416_ = aClass96Array9083[i].anInt1181;
						aClass96Array9083[i].anInt1181 = aClass96Array9083[i].anInt1183;
						aClass96Array9083[i].anInt1183 = -i_416_;
					}
				}
			}
			for (int i = anInt9062; i < anInt9061; i++) {
				int i_417_ = anIntArray9077[i];
				anIntArray9077[i] = anIntArray9065[i];
				anIntArray9065[i] = -i_417_;
			}
			anInt9084 = 0;
			aBool9105 = false;
		}
	}

	final boolean method14473(int i) {
		if (aByteArray9086 == null)
			return false;
		if (aByteArray9086[i] == 0)
			return false;
		return true;
	}

	final boolean method14474(int i) {
		if (anIntArray9129 == null)
			return false;
		if (anIntArray9129[i] == -1)
			return false;
		return true;
	}

	public int method2787() {
		if (!aBool9105)
			method14478();
		return aShort9113;
	}

	final void method14475(boolean bool, boolean bool_418_, boolean bool_419_, int i) {
		short i_420_ = aShortArray9064[i];
		short i_421_ = aShortArray9072[i];
		short i_422_ = aShortArray9063[i];
		boolean bool_423_ = false;
		if (aShortArray9087 != null && aShortArray9087[i] != -1)
			bool_423_ = (aClass178_Sub3_9049.aClass172_1916.method2895(aShortArray9087[i] & 0xffff, -332408814).aBool1881);
		if (!bool_423_) {
			if (aByteArray9086 == null)
				aClass118_9118.anInt1438 = 0;
			else
				aClass118_9118.anInt1438 = aByteArray9086[i] & 0xff;
			if (anIntArray9099[i] == -1)
				aClass118_9118.method2037(bool, bool_418_, bool_419_, aFloatArray9121[i_420_], aFloatArray9121[i_421_], aFloatArray9121[i_422_], aFloatArray9120[i_420_], aFloatArray9120[i_421_], aFloatArray9120[i_422_], aFloatArray9122[i_420_], aFloatArray9122[i_421_], aFloatArray9122[i_422_], Class638.anIntArray8306[anIntArray9106[i] & 0xffff]);
			else
				aClass118_9118.method2033(bool, bool_418_, bool_419_, aFloatArray9121[i_420_], aFloatArray9121[i_421_], aFloatArray9121[i_422_], aFloatArray9120[i_420_], aFloatArray9120[i_421_], aFloatArray9120[i_422_], aFloatArray9122[i_420_], aFloatArray9122[i_421_], aFloatArray9122[i_422_], (float) (anIntArray9106[i] & 0xffff), (float) (anIntArray9079[i] & 0xffff), (float) (anIntArray9099[i] & 0xffff));
		} else {
			int i_424_ = -16777216;
			if (aByteArray9086 != null)
				i_424_ = 255 - (aByteArray9086[i] & 0xff) << 24;
			if (anIntArray9099[i] == -1) {
				int i_425_ = i_424_ | anIntArray9106[i] & 0xffffff;
				aClass118_9118.method2053(bool, bool_418_, bool_419_, aFloatArray9121[i_420_], aFloatArray9121[i_421_], aFloatArray9121[i_422_], aFloatArray9120[i_420_], aFloatArray9120[i_421_], aFloatArray9120[i_422_], aFloatArray9122[i_420_], aFloatArray9122[i_421_], aFloatArray9122[i_422_], aFloatArray9123[i_420_], aFloatArray9123[i_421_], aFloatArray9123[i_422_], aFloatArrayArray9117[i][0], aFloatArrayArray9117[i][1], aFloatArrayArray9117[i][2], aFloatArrayArray9075[i][0], aFloatArrayArray9075[i][1], aFloatArrayArray9075[i][2], i_425_, i_425_, i_425_, aClass99_9069.anInt1192 * 340278173, 0.0F, 0.0F, 0.0F, aShortArray9087[i] & 0xffff);
			} else
				aClass118_9118.method2053(bool, bool_418_, bool_419_, aFloatArray9121[i_420_], aFloatArray9121[i_421_], aFloatArray9121[i_422_], aFloatArray9120[i_420_], aFloatArray9120[i_421_], aFloatArray9120[i_422_], aFloatArray9122[i_420_], aFloatArray9122[i_421_], aFloatArray9122[i_422_], aFloatArray9123[i_420_], aFloatArray9123[i_421_], aFloatArray9123[i_422_], aFloatArrayArray9117[i][0], aFloatArrayArray9117[i][1], aFloatArrayArray9117[i][2], aFloatArrayArray9075[i][0], aFloatArrayArray9075[i][1], aFloatArrayArray9075[i][2], i_424_ | anIntArray9106[i] & 0xffffff, i_424_ | anIntArray9079[i] & 0xffffff, i_424_ | anIntArray9099[i] & 0xffffff, aClass99_9069.anInt1192 * 340278173, 0.0F, 0.0F, 0.0F, aShortArray9087[i] & 0xffff);
		}
	}

	final void method14476(boolean bool, boolean bool_426_, boolean bool_427_, int i) {
		boolean bool_428_ = false;
		if (aShortArray9087 != null && aShortArray9087[i] != -1)
			bool_428_ = (aClass178_Sub3_9049.aClass172_1916.method2895(aShortArray9087[i] & 0xffff, -64611034).aBool1881);
		if (!aClass99_9069.aBool1204) {
			short i_429_ = aShortArray9064[i];
			short i_430_ = aShortArray9072[i];
			short i_431_ = aShortArray9063[i];
			Class441 class441 = aClass178_Sub3_9049.aClass441_9805;
			float f = class441.aFloatArray4916[10];
			float f_432_ = class441.aFloatArray4916[14];
			float f_433_ = class441.aFloatArray4916[11];
			float f_434_ = class441.aFloatArray4916[15];
			float f_435_ = f_432_ * f_433_ - f * f_434_;
			float f_436_ = ((aFloatArray9122[i_429_] - aClass99_9069.aFloat1193) * aClass99_9069.aFloat1213);
			float f_437_ = ((aFloatArray9122[i_430_] - aClass99_9069.aFloat1193) * aClass99_9069.aFloat1213);
			float f_438_ = ((aFloatArray9122[i_431_] - aClass99_9069.aFloat1193) * aClass99_9069.aFloat1213);
			float f_439_ = f_436_ * f_435_ / (f_436_ * f_433_ - f);
			float f_440_ = f_437_ * f_435_ / (f_437_ * f_433_ - f);
			float f_441_ = f_438_ * f_435_ / (f_438_ * f_433_ - f);
			float f_442_ = ((f_439_ - aClass99_9069.aFloat1205) / aClass99_9069.aFloat1191);
			if (f_442_ > 1.0F)
				f_442_ = 1.0F;
			else if (f_442_ < 0.0F)
				f_442_ = 0.0F;
			float f_443_ = ((f_440_ - aClass99_9069.aFloat1205) / aClass99_9069.aFloat1191);
			if (f_443_ > 1.0F)
				f_443_ = 1.0F;
			else if (f_443_ < 0.0F)
				f_443_ = 0.0F;
			float f_444_ = ((f_441_ - aClass99_9069.aFloat1205) / aClass99_9069.aFloat1191);
			if (f_444_ > 1.0F)
				f_444_ = 1.0F;
			else if (f_444_ < 0.0F)
				f_444_ = 0.0F;
			float f_445_ = f_442_ + f_443_ + f_444_;
			if (!(f_445_ >= 3.0F)) {
				if (f_445_ <= 0.0F)
					method14475(bool, bool_426_, bool_427_, i);
				else {
					if (aByteArray9086 == null)
						aClass118_9118.anInt1438 = 0;
					else
						aClass118_9118.anInt1438 = aByteArray9086[i] & 0xff;
					if (!bool_428_) {
						if (anIntArray9099[i] == -1)
							aClass118_9118.method2031(bool, bool_426_, bool_427_, aFloatArray9121[i_429_], aFloatArray9121[i_430_], aFloatArray9121[i_431_], aFloatArray9120[i_429_], aFloatArray9120[i_430_], aFloatArray9120[i_431_], aFloatArray9122[i_429_], aFloatArray9122[i_430_], aFloatArray9122[i_431_], Class234.method4271((Class638.anIntArray8306[(anIntArray9106[i] & 0xffff)]), (aClass99_9069.anInt1192 * 340278173), f_442_ * 255.0F, 269456300), Class234.method4271((Class638.anIntArray8306[(anIntArray9106[i] & 0xffff)]), (aClass99_9069.anInt1192 * 340278173), f_443_ * 255.0F, -378117413), Class234.method4271((Class638.anIntArray8306[(anIntArray9106[i] & 0xffff)]), (aClass99_9069.anInt1192 * 340278173), f_444_ * 255.0F, 812257801));
						else
							aClass118_9118.method2031(bool, bool_426_, bool_427_, aFloatArray9121[i_429_], aFloatArray9121[i_430_], aFloatArray9121[i_431_], aFloatArray9120[i_429_], aFloatArray9120[i_430_], aFloatArray9120[i_431_], aFloatArray9122[i_429_], aFloatArray9122[i_430_], aFloatArray9122[i_431_], Class234.method4271((Class638.anIntArray8306[(anIntArray9106[i] & 0xffff)]), (aClass99_9069.anInt1192 * 340278173), f_442_ * 255.0F, 203588653), Class234.method4271((Class638.anIntArray8306[(anIntArray9079[i] & 0xffff)]), (aClass99_9069.anInt1192 * 340278173), f_443_ * 255.0F, -913137464), Class234.method4271((Class638.anIntArray8306[(anIntArray9099[i] & 0xffff)]), (aClass99_9069.anInt1192 * 340278173), f_444_ * 255.0F, -598812621));
					} else {
						int i_446_ = -16777216;
						if (aByteArray9086 != null)
							i_446_ = 255 - (aByteArray9086[i] & 0xff) << 24;
						if (anIntArray9099[i] == -1) {
							int i_447_ = i_446_ | anIntArray9106[i] & 0xffffff;
							aClass118_9118.method2053(bool, bool_426_, bool_427_, aFloatArray9121[i_429_], aFloatArray9121[i_430_], aFloatArray9121[i_431_], aFloatArray9120[i_429_], aFloatArray9120[i_430_], aFloatArray9120[i_431_], aFloatArray9122[i_429_], aFloatArray9122[i_430_], aFloatArray9122[i_431_], aFloatArray9123[i_429_], aFloatArray9123[i_430_], aFloatArray9123[i_431_], aFloatArrayArray9117[i][0], aFloatArrayArray9117[i][1], aFloatArrayArray9117[i][2], aFloatArrayArray9075[i][0], aFloatArrayArray9075[i][1], aFloatArrayArray9075[i][2], i_447_, i_447_, i_447_, aClass99_9069.anInt1192 * 340278173, f_442_ * 255.0F, f_443_ * 255.0F, f_444_ * 255.0F, aShortArray9087[i] & 0xffff);
						} else
							aClass118_9118.method2053(bool, bool_426_, bool_427_, aFloatArray9121[i_429_], aFloatArray9121[i_430_], aFloatArray9121[i_431_], aFloatArray9120[i_429_], aFloatArray9120[i_430_], aFloatArray9120[i_431_], aFloatArray9122[i_429_], aFloatArray9122[i_430_], aFloatArray9122[i_431_], aFloatArray9123[i_429_], aFloatArray9123[i_430_], aFloatArray9123[i_431_], aFloatArrayArray9117[i][0], aFloatArrayArray9117[i][1], aFloatArrayArray9117[i][2], aFloatArrayArray9075[i][0], aFloatArrayArray9075[i][1], aFloatArrayArray9075[i][2], i_446_ | anIntArray9106[i] & 0xffffff, i_446_ | anIntArray9079[i] & 0xffffff, i_446_ | anIntArray9099[i] & 0xffffff, aClass99_9069.anInt1192 * 340278173, f_442_ * 255.0F, f_443_ * 255.0F, f_444_ * 255.0F, aShortArray9087[i] & 0xffff);
					}
				}
			}
		} else {
			short i_448_ = aShortArray9064[i];
			short i_449_ = aShortArray9072[i];
			short i_450_ = aShortArray9063[i];
			float f = 0.0F;
			float f_451_ = 0.0F;
			float f_452_ = 0.0F;
			if (anIntArray9119[i_448_] > aClass99_9069.anInt1196 * -1631965377)
				f = 1.0F;
			else if (anIntArray9119[i_448_] > aClass99_9069.anInt1195 * 2137640809)
				f = ((float) (aClass99_9069.anInt1195 * 2137640809 - anIntArray9119[i_448_]) * 1.0F / (float) (aClass99_9069.anInt1195 * 2137640809 - aClass99_9069.anInt1196 * -1631965377));
			if (anIntArray9119[i_449_] > aClass99_9069.anInt1196 * -1631965377)
				f_451_ = 1.0F;
			else if (anIntArray9119[i_449_] > aClass99_9069.anInt1195 * 2137640809)
				f_451_ = ((float) (aClass99_9069.anInt1195 * 2137640809 - anIntArray9119[i_449_]) * 1.0F / (float) (aClass99_9069.anInt1195 * 2137640809 - aClass99_9069.anInt1196 * -1631965377));
			if (anIntArray9119[i_450_] > aClass99_9069.anInt1196 * -1631965377)
				f_452_ = 1.0F;
			else if (anIntArray9119[i_450_] > aClass99_9069.anInt1195 * 2137640809)
				f_452_ = ((float) (aClass99_9069.anInt1195 * 2137640809 - anIntArray9119[i_450_]) * 1.0F / (float) (aClass99_9069.anInt1195 * 2137640809 - aClass99_9069.anInt1196 * -1631965377));
			if (aByteArray9086 == null)
				aClass118_9118.anInt1438 = 0;
			else
				aClass118_9118.anInt1438 = aByteArray9086[i] & 0xff;
			if (!bool_428_) {
				if (anIntArray9099[i] == -1)
					aClass118_9118.method2031(bool, bool_426_, bool_427_, aFloatArray9121[i_448_], aFloatArray9121[i_449_], aFloatArray9121[i_450_], aFloatArray9120[i_448_], aFloatArray9120[i_449_], aFloatArray9120[i_450_], aFloatArray9122[i_448_], aFloatArray9122[i_449_], aFloatArray9122[i_450_], Class234.method4271((Class638.anIntArray8306[anIntArray9106[i] & 0xffff]), (aClass99_9069.anInt1192 * 340278173), f * 255.0F, -518270032), Class234.method4271((Class638.anIntArray8306[anIntArray9106[i] & 0xffff]), (aClass99_9069.anInt1192 * 340278173), f_451_ * 255.0F, -934022604), Class234.method4271((Class638.anIntArray8306[anIntArray9106[i] & 0xffff]), (aClass99_9069.anInt1192 * 340278173), f_452_ * 255.0F, -742352800));
				else
					aClass118_9118.method2031(bool, bool_426_, bool_427_, aFloatArray9121[i_448_], aFloatArray9121[i_449_], aFloatArray9121[i_450_], aFloatArray9120[i_448_], aFloatArray9120[i_449_], aFloatArray9120[i_450_], aFloatArray9122[i_448_], aFloatArray9122[i_449_], aFloatArray9122[i_450_], Class234.method4271((Class638.anIntArray8306[anIntArray9106[i] & 0xffff]), (aClass99_9069.anInt1192 * 340278173), f * 255.0F, -755023239), Class234.method4271((Class638.anIntArray8306[anIntArray9079[i] & 0xffff]), (aClass99_9069.anInt1192 * 340278173), f_451_ * 255.0F, -992529950), Class234.method4271((Class638.anIntArray8306[anIntArray9099[i] & 0xffff]), (aClass99_9069.anInt1192 * 340278173), f_452_ * 255.0F, -1783329547));
			} else {
				int i_453_ = -16777216;
				if (aByteArray9086 != null)
					i_453_ = 255 - (aByteArray9086[i] & 0xff) << 24;
				if (anIntArray9099[i] == -1) {
					int i_454_ = i_453_ | anIntArray9106[i] & 0xffffff;
					aClass118_9118.method2053(bool, bool_426_, bool_427_, aFloatArray9121[i_448_], aFloatArray9121[i_449_], aFloatArray9121[i_450_], aFloatArray9120[i_448_], aFloatArray9120[i_449_], aFloatArray9120[i_450_], aFloatArray9122[i_448_], aFloatArray9122[i_449_], aFloatArray9122[i_450_], aFloatArray9123[i_448_], aFloatArray9123[i_449_], aFloatArray9123[i_450_], aFloatArrayArray9117[i][0], aFloatArrayArray9117[i][1], aFloatArrayArray9117[i][2], aFloatArrayArray9075[i][0], aFloatArrayArray9075[i][1], aFloatArrayArray9075[i][2], i_454_, i_454_, i_454_, aClass99_9069.anInt1192 * 340278173, f * 255.0F, f_451_ * 255.0F, f_452_ * 255.0F, aShortArray9087[i] & 0xffff);
				} else
					aClass118_9118.method2053(bool, bool_426_, bool_427_, aFloatArray9121[i_448_], aFloatArray9121[i_449_], aFloatArray9121[i_450_], aFloatArray9120[i_448_], aFloatArray9120[i_449_], aFloatArray9120[i_450_], aFloatArray9122[i_448_], aFloatArray9122[i_449_], aFloatArray9122[i_450_], aFloatArray9123[i_448_], aFloatArray9123[i_449_], aFloatArray9123[i_450_], aFloatArrayArray9117[i][0], aFloatArrayArray9117[i][1], aFloatArrayArray9117[i][2], aFloatArrayArray9075[i][0], aFloatArrayArray9075[i][1], aFloatArrayArray9075[i][2], i_453_ | anIntArray9106[i] & 0xffffff, i_453_ | anIntArray9079[i] & 0xffffff, i_453_ | anIntArray9099[i] & 0xffffff, aClass99_9069.anInt1192 * 340278173, f * 255.0F, f_451_ * 255.0F, f_452_ * 255.0F, aShortArray9087[i] & 0xffff);
			}
		}
	}

	public boolean method2709(int i, int i_455_, Class435 class435, boolean bool, int i_456_) {
		method14529(aClass178_Sub3_9049.method15475(Thread.currentThread()));
		Class441 class441 = aClass99_9069.aClass441_1202;
		class441.method7090(class435);
		Class441 class441_457_ = aClass99_9069.aClass441_1203;
		class441_457_.method7086(class441);
		class441_457_.method7089(aClass178_Sub3_9049.aClass441_9821);
		boolean bool_458_ = false;
		int i_459_ = 2147483647;
		int i_460_ = -2147483648;
		int i_461_ = 2147483647;
		int i_462_ = -2147483648;
		if (!aBool9105)
			method14478();
		int i_463_ = aShort9111 - aShort9090 >> 1;
		int i_464_ = aShort9109 - aShort9108 >> 1;
		int i_465_ = aShort9113 - aShort9112 >> 1;
		int i_466_ = aShort9090 + i_463_;
		int i_467_ = aShort9108 + i_464_;
		int i_468_ = aShort9112 + i_465_;
		int i_469_ = i_466_ - (i_463_ << i_456_);
		int i_470_ = i_467_ - (i_464_ << i_456_);
		int i_471_ = i_468_ - (i_465_ << i_456_);
		int i_472_ = i_466_ + (i_463_ << i_456_);
		int i_473_ = i_467_ + (i_464_ << i_456_);
		int i_474_ = i_468_ + (i_465_ << i_456_);
		anIntArray9124[0] = i_469_;
		anIntArray9125[0] = i_470_;
		anIntArray9126[0] = i_471_;
		anIntArray9124[1] = i_472_;
		anIntArray9125[1] = i_470_;
		anIntArray9126[1] = i_471_;
		anIntArray9124[2] = i_469_;
		anIntArray9125[2] = i_473_;
		anIntArray9126[2] = i_471_;
		anIntArray9124[3] = i_472_;
		anIntArray9125[3] = i_473_;
		anIntArray9126[3] = i_471_;
		anIntArray9124[4] = i_469_;
		anIntArray9125[4] = i_470_;
		anIntArray9126[4] = i_474_;
		anIntArray9124[5] = i_472_;
		anIntArray9125[5] = i_470_;
		anIntArray9126[5] = i_474_;
		anIntArray9124[6] = i_469_;
		anIntArray9125[6] = i_473_;
		anIntArray9126[6] = i_474_;
		anIntArray9124[7] = i_472_;
		anIntArray9125[7] = i_473_;
		anIntArray9126[7] = i_474_;
		for (int i_475_ = 0; i_475_ < 8; i_475_++) {
			int i_476_ = anIntArray9124[i_475_];
			int i_477_ = anIntArray9125[i_475_];
			int i_478_ = anIntArray9126[i_475_];
			float f = (class441_457_.aFloatArray4916[2] * (float) i_476_ + class441_457_.aFloatArray4916[6] * (float) i_477_ + class441_457_.aFloatArray4916[10] * (float) i_478_ + class441_457_.aFloatArray4916[14]);
			float f_479_ = (class441_457_.aFloatArray4916[3] * (float) i_476_ + class441_457_.aFloatArray4916[7] * (float) i_477_ + class441_457_.aFloatArray4916[11] * (float) i_478_ + class441_457_.aFloatArray4916[15]);
			if (f >= -f_479_) {
				float f_480_ = (class441_457_.aFloatArray4916[0] * (float) i_476_ + class441_457_.aFloatArray4916[4] * (float) i_477_ + class441_457_.aFloatArray4916[8] * (float) i_478_ + class441_457_.aFloatArray4916[12]);
				float f_481_ = (class441_457_.aFloatArray4916[1] * (float) i_476_ + class441_457_.aFloatArray4916[5] * (float) i_477_ + class441_457_.aFloatArray4916[9] * (float) i_478_ + class441_457_.aFloatArray4916[13]);
				int i_482_ = (int) (aClass178_Sub3_9049.aFloat9828 + (aClass178_Sub3_9049.aFloat9827 * f_480_ / f_479_));
				int i_483_ = (int) (aClass178_Sub3_9049.aFloat9830 + (aClass178_Sub3_9049.aFloat9829 * f_481_ / f_479_));
				if (i_482_ < i_459_)
					i_459_ = i_482_;
				if (i_482_ > i_460_)
					i_460_ = i_482_;
				if (i_483_ < i_461_)
					i_461_ = i_483_;
				if (i_483_ > i_462_)
					i_462_ = i_483_;
				bool_458_ = true;
			}
		}
		if (bool_458_ && i > i_459_ && i < i_460_ && i_455_ > i_461_ && i_455_ < i_462_) {
			if (bool)
				return true;
			for (int i_484_ = 0; i_484_ < anInt9061; i_484_++) {
				int i_485_ = anIntArray9077[i_484_];
				int i_486_ = anIntArray9047[i_484_];
				int i_487_ = anIntArray9065[i_484_];
				float f = (class441_457_.aFloatArray4916[2] * (float) i_485_ + class441_457_.aFloatArray4916[6] * (float) i_486_ + class441_457_.aFloatArray4916[10] * (float) i_487_ + class441_457_.aFloatArray4916[14]);
				float f_488_ = (class441_457_.aFloatArray4916[3] * (float) i_485_ + class441_457_.aFloatArray4916[7] * (float) i_486_ + class441_457_.aFloatArray4916[11] * (float) i_487_ + class441_457_.aFloatArray4916[15]);
				if (f >= -f_488_) {
					float f_489_ = (class441_457_.aFloatArray4916[0] * (float) i_485_ + class441_457_.aFloatArray4916[4] * (float) i_486_ + class441_457_.aFloatArray4916[8] * (float) i_487_ + class441_457_.aFloatArray4916[12]);
					float f_490_ = (class441_457_.aFloatArray4916[1] * (float) i_485_ + class441_457_.aFloatArray4916[5] * (float) i_486_ + class441_457_.aFloatArray4916[9] * (float) i_487_ + class441_457_.aFloatArray4916[13]);
					aFloatArray9120[i_484_] = (float) (int) (aClass178_Sub3_9049.aFloat9828 + (aClass178_Sub3_9049.aFloat9827 * f_489_ / f_488_));
					aFloatArray9121[i_484_] = (float) (int) (aClass178_Sub3_9049.aFloat9830 + (aClass178_Sub3_9049.aFloat9829 * f_490_ / f_488_));
				} else
					aFloatArray9120[i_484_] = -999999.0F;
			}
			for (int i_491_ = 0; i_491_ < anInt9070; i_491_++) {
				if (aFloatArray9120[aShortArray9064[i_491_]] != -999999.0F && aFloatArray9120[aShortArray9072[i_491_]] != -999999.0F && aFloatArray9120[aShortArray9063[i_491_]] != -999999.0F && method14477(i, i_455_, aFloatArray9121[aShortArray9064[i_491_]], aFloatArray9121[aShortArray9072[i_491_]], aFloatArray9121[aShortArray9063[i_491_]], aFloatArray9120[aShortArray9064[i_491_]], aFloatArray9120[aShortArray9072[i_491_]], aFloatArray9120[aShortArray9063[i_491_]]))
					return true;
			}
		}
		return false;
	}

	boolean method14477(int i, int i_492_, float f, float f_493_, float f_494_, float f_495_, float f_496_, float f_497_) {
		if ((float) i_492_ < f && (float) i_492_ < f_493_ && (float) i_492_ < f_494_)
			return false;
		if ((float) i_492_ > f && (float) i_492_ > f_493_ && (float) i_492_ > f_494_)
			return false;
		if ((float) i < f_495_ && (float) i < f_496_ && (float) i < f_497_)
			return false;
		if ((float) i > f_495_ && (float) i > f_496_ && (float) i > f_497_)
			return false;
		return true;
	}

	public void method2732(Class435 class435) {
		method14529(aClass178_Sub3_9049.method15475(Thread.currentThread()));
		Class441 class441 = aClass99_9069.aClass441_1202;
		class441.method7090(class435);
		if (aClass184Array9089 != null) {
			for (int i = 0; i < aClass184Array9089.length; i++) {
				Class184 class184 = aClass184Array9089[i];
				Class184 class184_498_ = class184;
				if (class184.aClass184_2111 != null)
					class184_498_ = class184.aClass184_2111;
				class184_498_.anInt2117 = ((int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) anIntArray9077[(class184.anInt2113 * 1717084103)]) + (class441.aFloatArray4916[4] * (float) (anIntArray9047[(class184.anInt2113 * 1717084103)])) + (class441.aFloatArray4916[8] * (float) (anIntArray9065[(class184.anInt2113 * 1717084103)])))) * 1979506107);
				class184_498_.anInt2118 = (int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) (anIntArray9077[class184.anInt2113 * 1717084103])) + (class441.aFloatArray4916[5] * (float) anIntArray9047[(class184.anInt2113 * 1717084103)]) + (class441.aFloatArray4916[9] * (float) (anIntArray9065[(class184.anInt2113 * 1717084103)])))) * 546606927;
				class184_498_.anInt2119 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9077[(class184.anInt2113 * 1717084103)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9047[(class184.anInt2113 * 1717084103)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9065[(class184.anInt2113 * 1717084103)])))) * 1120011767);
				class184_498_.anInt2120 = (int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) (anIntArray9077[class184.anInt2114 * -615332511])) + (class441.aFloatArray4916[4] * (float) anIntArray9047[(class184.anInt2114 * -615332511)]) + (class441.aFloatArray4916[8] * (float) (anIntArray9065[(class184.anInt2114 * -615332511)])))) * 942705911;
				class184_498_.anInt2121 = (int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) (anIntArray9077[class184.anInt2114 * -615332511])) + (class441.aFloatArray4916[5] * (float) anIntArray9047[(class184.anInt2114 * -615332511)]) + (class441.aFloatArray4916[9] * (float) (anIntArray9065[(class184.anInt2114 * -615332511)])))) * 607651075;
				class184_498_.anInt2122 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9077[(class184.anInt2114 * -615332511)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9047[(class184.anInt2114 * -615332511)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9065[(class184.anInt2114 * -615332511)])))) * 2070256909);
				class184_498_.anInt2125 = (int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) (anIntArray9077[class184.anInt2115 * -648014401])) + (class441.aFloatArray4916[4] * (float) anIntArray9047[(class184.anInt2115 * -648014401)]) + (class441.aFloatArray4916[8] * (float) (anIntArray9065[(class184.anInt2115 * -648014401)])))) * 528708299;
				class184_498_.anInt2124 = (int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) (anIntArray9077[class184.anInt2115 * -648014401])) + (class441.aFloatArray4916[5] * (float) anIntArray9047[(class184.anInt2115 * -648014401)]) + (class441.aFloatArray4916[9] * (float) (anIntArray9065[(class184.anInt2115 * -648014401)])))) * 588958573;
				class184_498_.anInt2110 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9077[(class184.anInt2115 * -648014401)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9047[(class184.anInt2115 * -648014401)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9065[(class184.anInt2115 * -648014401)])))) * -342864097);
			}
		}
		if (aClass143Array9100 != null) {
			for (int i = 0; i < aClass143Array9100.length; i++) {
				Class143 class143 = aClass143Array9100[i];
				Class143 class143_499_ = class143;
				if (class143.aClass143_1687 != null)
					class143_499_ = class143.aClass143_1687;
				if (class143.aClass441_1692 != null)
					class143.aClass441_1692.method7086(class441);
				else
					class143.aClass441_1692 = new Class441(class441);
				class143_499_.anInt1689 = (int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) (anIntArray9077[class143.anInt1688 * -256753261])) + (class441.aFloatArray4916[4] * (float) anIntArray9047[(class143.anInt1688 * -256753261)]) + (class441.aFloatArray4916[8] * (float) (anIntArray9065[(class143.anInt1688 * -256753261)])))) * 246585729;
				class143_499_.anInt1690 = ((int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) anIntArray9077[(class143.anInt1688 * -256753261)]) + (class441.aFloatArray4916[5] * (float) (anIntArray9047[(class143.anInt1688 * -256753261)])) + (class441.aFloatArray4916[9] * (float) (anIntArray9065[(class143.anInt1688 * -256753261)])))) * 1541286973);
				class143_499_.anInt1691 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9077[(class143.anInt1688 * -256753261)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9047[(class143.anInt1688 * -256753261)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9065[(class143.anInt1688 * -256753261)])))) * -1727847879);
			}
		}
	}

	public Class523_Sub27_Sub4 method2710(Class523_Sub27_Sub4 class523_sub27_sub4) {
		return null;
	}

	void method14478() {
		if (!aBool9105) {
			int i = 0;
			int i_500_ = 0;
			int i_501_ = 32767;
			int i_502_ = 32767;
			int i_503_ = 32767;
			int i_504_ = -32768;
			int i_505_ = -32768;
			int i_506_ = -32768;
			for (int i_507_ = 0; i_507_ < anInt9062; i_507_++) {
				int i_508_ = anIntArray9077[i_507_];
				int i_509_ = anIntArray9047[i_507_];
				int i_510_ = anIntArray9065[i_507_];
				if (i_508_ < i_501_)
					i_501_ = i_508_;
				if (i_508_ > i_504_)
					i_504_ = i_508_;
				if (i_509_ < i_502_)
					i_502_ = i_509_;
				if (i_509_ > i_505_)
					i_505_ = i_509_;
				if (i_510_ < i_503_)
					i_503_ = i_510_;
				if (i_510_ > i_506_)
					i_506_ = i_510_;
				int i_511_ = i_508_ * i_508_ + i_510_ * i_510_;
				if (i_511_ > i)
					i = i_511_;
				i_511_ += i_509_ * i_509_;
				if (i_511_ > i_500_)
					i_500_ = i_511_;
			}
			aShort9090 = (short) i_501_;
			aShort9111 = (short) i_504_;
			aShort9108 = (short) i_502_;
			aShort9109 = (short) i_505_;
			aShort9112 = (short) i_503_;
			aShort9113 = (short) i_506_;
			aShort9082 = (short) (int) (Math.sqrt((double) i) + 0.99);
			aShort9107 = (short) (int) (Math.sqrt((double) i_500_) + 0.99);
			aBool9105 = true;
		}
	}

	public void method2867(byte i, byte[] is) {
		if ((anInt9058 & 0x100000) == 0)
			throw new RuntimeException();
		if (aByteArray9086 == null)
			aByteArray9086 = new byte[anInt9074];
		if (is == null) {
			for (int i_512_ = 0; i_512_ < anInt9074; i_512_++)
				aByteArray9086[i_512_] = i;
		} else {
			for (int i_513_ = 0; i_513_ < anInt9074; i_513_++) {
				int i_514_ = 255 - ((255 - (is[i_513_] & 0xff)) * (255 - (i & 0xff)) / 255);
				aByteArray9086[i_513_] = (byte) i_514_;
			}
		}
		if (anInt9084 == 2)
			anInt9084 = 1;
	}

	void method14479(Thread thread) {
		Class99 class99 = aClass178_Sub3_9049.method15475(thread);
		if (class99 != aClass99_9045) {
			aClass99_9045 = class99;
			aClass167_Sub1Array9076 = aClass99_9045.aClass167_Sub1Array1224;
			aClass167_Sub1Array9131 = aClass99_9045.aClass167_Sub1Array1222;
		}
	}

	public int method2834() {
		if (!aBool9105)
			method14478();
		return aShort9107;
	}

	public void method2815(short i, short i_515_) {
		for (int i_516_ = 0; i_516_ < anInt9074; i_516_++) {
			if (aShortArray9088[i_516_] == i)
				aShortArray9088[i_516_] = i_515_;
		}
		if (aClass101Array9102 != null) {
			for (int i_517_ = 0; i_517_ < anInt9101; i_517_++) {
				Class101 class101 = aClass101Array9102[i_517_];
				Class103 class103 = aClass103Array9103[i_517_];
				class103.anInt1258 = (class103.anInt1258 * 330457669 & ~0xffffff | ((Class638.anIntArray8306[Class493.method8085((aShortArray9088[(class101.anInt1241 * -566359109)]), 953417805) & 0xffff]) & 0xffffff)) * -1951506291;
			}
		}
		if (anInt9084 == 2)
			anInt9084 = 1;
	}

	public int method2713() {
		if (!aBool9105)
			method14478();
		return aShort9111;
	}

	public int method2804() {
		if (!aBool9105)
			method14478();
		return aShort9108;
	}

	public int method2847() {
		if (!aBool9105)
			method14478();
		return aShort9109;
	}

	public int method2716() {
		if (!aBool9105)
			method14478();
		return aShort9112;
	}

	void method2765() {
		if (aClass178_Sub3_9049.anInt9819 * 1353126165 > 1) {
			synchronized (this) {
				aBool1796 = false;
				this.notifyAll();
			}
		}
	}

	void method2795(int i, int i_518_, int i_519_, int i_520_) {
		if (i == 0) {
			int i_521_ = 0;
			anInt9095 = 0;
			anInt9096 = 0;
			anInt9097 = 0;
			for (int i_522_ = 0; i_522_ < anInt9061; i_522_++) {
				anInt9095 += anIntArray9077[i_522_];
				anInt9096 += anIntArray9047[i_522_];
				anInt9097 += anIntArray9065[i_522_];
				i_521_++;
			}
			if (i_521_ > 0) {
				anInt9095 = anInt9095 / i_521_ + i_518_;
				anInt9096 = anInt9096 / i_521_ + i_519_;
				anInt9097 = anInt9097 / i_521_ + i_520_;
			} else {
				anInt9095 = i_518_;
				anInt9096 = i_519_;
				anInt9097 = i_520_;
			}
		} else if (i == 1) {
			for (int i_523_ = 0; i_523_ < anInt9061; i_523_++) {
				anIntArray9077[i_523_] += i_518_;
				anIntArray9047[i_523_] += i_519_;
				anIntArray9065[i_523_] += i_520_;
			}
		} else if (i == 2) {
			for (int i_524_ = 0; i_524_ < anInt9061; i_524_++) {
				anIntArray9077[i_524_] -= anInt9095;
				anIntArray9047[i_524_] -= anInt9096;
				anIntArray9065[i_524_] -= anInt9097;
				if (i_520_ != 0) {
					int i_525_ = Class433.anIntArray4880[i_520_];
					int i_526_ = Class433.anIntArray4881[i_520_];
					int i_527_ = ((anIntArray9047[i_524_] * i_525_ + anIntArray9077[i_524_] * i_526_ + 16383) >> 14);
					anIntArray9047[i_524_] = (anIntArray9047[i_524_] * i_526_ - anIntArray9077[i_524_] * i_525_ + 16383) >> 14;
					anIntArray9077[i_524_] = i_527_;
				}
				if (i_518_ != 0) {
					int i_528_ = Class433.anIntArray4880[i_518_];
					int i_529_ = Class433.anIntArray4881[i_518_];
					int i_530_ = ((anIntArray9047[i_524_] * i_529_ - anIntArray9065[i_524_] * i_528_ + 16383) >> 14);
					anIntArray9065[i_524_] = (anIntArray9047[i_524_] * i_528_ + anIntArray9065[i_524_] * i_529_ + 16383) >> 14;
					anIntArray9047[i_524_] = i_530_;
				}
				if (i_519_ != 0) {
					int i_531_ = Class433.anIntArray4880[i_519_];
					int i_532_ = Class433.anIntArray4881[i_519_];
					int i_533_ = ((anIntArray9065[i_524_] * i_531_ + anIntArray9077[i_524_] * i_532_ + 16383) >> 14);
					anIntArray9065[i_524_] = (anIntArray9065[i_524_] * i_532_ - anIntArray9077[i_524_] * i_531_ + 16383) >> 14;
					anIntArray9077[i_524_] = i_533_;
				}
				anIntArray9077[i_524_] += anInt9095;
				anIntArray9047[i_524_] += anInt9096;
				anIntArray9065[i_524_] += anInt9097;
			}
		} else if (i == 3) {
			for (int i_534_ = 0; i_534_ < anInt9061; i_534_++) {
				anIntArray9077[i_534_] -= anInt9095;
				anIntArray9047[i_534_] -= anInt9096;
				anIntArray9065[i_534_] -= anInt9097;
				anIntArray9077[i_534_] = anIntArray9077[i_534_] * i_518_ / 128;
				anIntArray9047[i_534_] = anIntArray9047[i_534_] * i_519_ / 128;
				anIntArray9065[i_534_] = anIntArray9065[i_534_] * i_520_ / 128;
				anIntArray9077[i_534_] += anInt9095;
				anIntArray9047[i_534_] += anInt9096;
				anIntArray9065[i_534_] += anInt9097;
			}
		} else if (i == 5) {
			for (int i_535_ = 0; i_535_ < anInt9074; i_535_++) {
				int i_536_ = (aByteArray9086[i_535_] & 0xff) + i_518_ * 8;
				if (i_536_ < 0)
					i_536_ = 0;
				else if (i_536_ > 255)
					i_536_ = 255;
				aByteArray9086[i_535_] = (byte) i_536_;
			}
			if (aClass101Array9102 != null) {
				for (int i_537_ = 0; i_537_ < anInt9101; i_537_++) {
					Class101 class101 = aClass101Array9102[i_537_];
					Class103 class103 = aClass103Array9103[i_537_];
					class103.anInt1258 = (class103.anInt1258 * 330457669 & 0xffffff | 255 - ((aByteArray9086[class101.anInt1241 * -566359109]) & 0xff) << 24) * -1951506291;
				}
			}
		} else if (i == 7) {
			for (int i_538_ = 0; i_538_ < anInt9074; i_538_++) {
				int i_539_ = aShortArray9088[i_538_] & 0xffff;
				int i_540_ = i_539_ >> 10 & 0x3f;
				int i_541_ = i_539_ >> 7 & 0x7;
				int i_542_ = i_539_ & 0x7f;
				i_540_ = i_540_ + i_518_ & 0x3f;
				i_541_ += i_519_;
				if (i_541_ < 0)
					i_541_ = 0;
				else if (i_541_ > 7)
					i_541_ = 7;
				i_542_ += i_520_;
				if (i_542_ < 0)
					i_542_ = 0;
				else if (i_542_ > 127)
					i_542_ = 127;
				aShortArray9088[i_538_] = (short) (i_540_ << 10 | i_541_ << 7 | i_542_);
			}
			aBool9093 = true;
			if (aClass101Array9102 != null) {
				for (int i_543_ = 0; i_543_ < anInt9101; i_543_++) {
					Class101 class101 = aClass101Array9102[i_543_];
					Class103 class103 = aClass103Array9103[i_543_];
					class103.anInt1258 = (class103.anInt1258 * 330457669 & ~0xffffff | ((Class638.anIntArray8306[Class493.method8085(((aShortArray9088[(class101.anInt1241 * -566359109)]) & 0xffff), -944402157) & 0xffff]) & 0xffffff)) * -1951506291;
				}
			}
		} else if (i == 8) {
			for (int i_544_ = 0; i_544_ < anInt9101; i_544_++) {
				Class103 class103 = aClass103Array9103[i_544_];
				class103.anInt1248 += i_518_ * 356391365;
				class103.anInt1251 += i_519_ * 1938564783;
			}
		} else if (i == 10) {
			for (int i_545_ = 0; i_545_ < anInt9101; i_545_++) {
				Class103 class103 = aClass103Array9103[i_545_];
				class103.aFloat1249 = class103.aFloat1249 * (float) i_518_ / 128.0F;
				class103.aFloat1250 = class103.aFloat1250 * (float) i_519_ / 128.0F;
			}
		} else if (i == 9) {
			for (int i_546_ = 0; i_546_ < anInt9101; i_546_++) {
				Class103 class103 = aClass103Array9103[i_546_];
				class103.anInt1253 = (class103.anInt1253 * 212895487 + i_518_ & 0x3fff) * 891189503;
			}
		}
	}

	public void method2678(Class167 class167, int i, int i_547_, int i_548_, boolean bool) {
		Class167_Sub1 class167_sub1_549_ = (Class167_Sub1) class167;
		if ((anInt9058 & 0x10000) != 65536)
			throw new IllegalStateException("");
		if ((class167_sub1_549_.anInt9058 & 0x10000) != 65536)
			throw new IllegalStateException("");
		method14529(aClass178_Sub3_9049.method15475(Thread.currentThread()));
		method14478();
		method14457();
		class167_sub1_549_.method14478();
		class167_sub1_549_.method14457();
		anInt9085++;
		int i_550_ = 0;
		int[] is = class167_sub1_549_.anIntArray9077;
		int i_551_ = class167_sub1_549_.anInt9062;
		for (int i_552_ = 0; i_552_ < anInt9062; i_552_++) {
			Class109 class109 = aClass109Array9067[i_552_];
			if (class109.anInt1328 != 0) {
				int i_553_ = anIntArray9047[i_552_] - i_547_;
				if (i_553_ >= class167_sub1_549_.aShort9108 && i_553_ <= class167_sub1_549_.aShort9109) {
					int i_554_ = anIntArray9077[i_552_] - i;
					if (i_554_ >= class167_sub1_549_.aShort9090 && i_554_ <= class167_sub1_549_.aShort9111) {
						int i_555_ = anIntArray9065[i_552_] - i_548_;
						if (i_555_ >= class167_sub1_549_.aShort9112 && i_555_ <= class167_sub1_549_.aShort9113) {
							for (int i_556_ = 0; i_556_ < i_551_; i_556_++) {
								Class109 class109_557_ = (class167_sub1_549_.aClass109Array9067[i_556_]);
								if (i_554_ == is[i_556_] && i_555_ == (class167_sub1_549_.anIntArray9065[i_556_]) && i_553_ == (class167_sub1_549_.anIntArray9047[i_556_]) && class109_557_.anInt1328 != 0) {
									if (aClass109Array9068 == null)
										aClass109Array9068 = new Class109[anInt9062];
									if (class167_sub1_549_.aClass109Array9068 == null)
										class167_sub1_549_.aClass109Array9068 = new Class109[i_551_];
									Class109 class109_558_ = aClass109Array9068[i_552_];
									if (class109_558_ == null)
										class109_558_ = aClass109Array9068[i_552_] = new Class109(class109);
									Class109 class109_559_ = (class167_sub1_549_.aClass109Array9068[i_556_]);
									if (class109_559_ == null)
										class109_559_ = class167_sub1_549_.aClass109Array9068[i_556_] = new Class109(class109_557_);
									class109_558_.anInt1326 += class109_557_.anInt1326;
									class109_558_.anInt1325 += class109_557_.anInt1325;
									class109_558_.anInt1327 += class109_557_.anInt1327;
									class109_558_.anInt1328 += class109_557_.anInt1328;
									class109_559_.anInt1326 += class109.anInt1326;
									class109_559_.anInt1325 += class109.anInt1325;
									class109_559_.anInt1327 += class109.anInt1327;
									class109_559_.anInt1328 += class109.anInt1328;
									i_550_++;
									anIntArray9127[i_552_] = anInt9085;
									anIntArray9053[i_556_] = anInt9085;
								}
							}
						}
					}
				}
			}
		}
		if (i_550_ >= 3 && bool) {
			for (int i_560_ = 0; i_560_ < anInt9074; i_560_++) {
				if (anIntArray9127[aShortArray9064[i_560_]] == anInt9085 && anIntArray9127[aShortArray9072[i_560_]] == anInt9085 && anIntArray9127[aShortArray9063[i_560_]] == anInt9085) {
					if (aByteArray9073 == null)
						aByteArray9073 = new byte[anInt9074];
					aByteArray9073[i_560_] = (byte) 2;
				}
			}
			for (int i_561_ = 0; i_561_ < class167_sub1_549_.anInt9074; i_561_++) {
				if ((anIntArray9053[class167_sub1_549_.aShortArray9064[i_561_]] == anInt9085) && anIntArray9053[(class167_sub1_549_.aShortArray9072[i_561_])] == anInt9085 && anIntArray9053[(class167_sub1_549_.aShortArray9063[i_561_])] == anInt9085) {
					if (class167_sub1_549_.aByteArray9073 == null)
						class167_sub1_549_.aByteArray9073 = new byte[class167_sub1_549_.anInt9074];
					class167_sub1_549_.aByteArray9073[i_561_] = (byte) 2;
				}
			}
		}
	}

	public void method2739(Class167 class167, int i, int i_562_, int i_563_, boolean bool) {
		Class167_Sub1 class167_sub1_564_ = (Class167_Sub1) class167;
		if ((anInt9058 & 0x10000) != 65536)
			throw new IllegalStateException("");
		if ((class167_sub1_564_.anInt9058 & 0x10000) != 65536)
			throw new IllegalStateException("");
		method14529(aClass178_Sub3_9049.method15475(Thread.currentThread()));
		method14478();
		method14457();
		class167_sub1_564_.method14478();
		class167_sub1_564_.method14457();
		anInt9085++;
		int i_565_ = 0;
		int[] is = class167_sub1_564_.anIntArray9077;
		int i_566_ = class167_sub1_564_.anInt9062;
		for (int i_567_ = 0; i_567_ < anInt9062; i_567_++) {
			Class109 class109 = aClass109Array9067[i_567_];
			if (class109.anInt1328 != 0) {
				int i_568_ = anIntArray9047[i_567_] - i_562_;
				if (i_568_ >= class167_sub1_564_.aShort9108 && i_568_ <= class167_sub1_564_.aShort9109) {
					int i_569_ = anIntArray9077[i_567_] - i;
					if (i_569_ >= class167_sub1_564_.aShort9090 && i_569_ <= class167_sub1_564_.aShort9111) {
						int i_570_ = anIntArray9065[i_567_] - i_563_;
						if (i_570_ >= class167_sub1_564_.aShort9112 && i_570_ <= class167_sub1_564_.aShort9113) {
							for (int i_571_ = 0; i_571_ < i_566_; i_571_++) {
								Class109 class109_572_ = (class167_sub1_564_.aClass109Array9067[i_571_]);
								if (i_569_ == is[i_571_] && i_570_ == (class167_sub1_564_.anIntArray9065[i_571_]) && i_568_ == (class167_sub1_564_.anIntArray9047[i_571_]) && class109_572_.anInt1328 != 0) {
									if (aClass109Array9068 == null)
										aClass109Array9068 = new Class109[anInt9062];
									if (class167_sub1_564_.aClass109Array9068 == null)
										class167_sub1_564_.aClass109Array9068 = new Class109[i_566_];
									Class109 class109_573_ = aClass109Array9068[i_567_];
									if (class109_573_ == null)
										class109_573_ = aClass109Array9068[i_567_] = new Class109(class109);
									Class109 class109_574_ = (class167_sub1_564_.aClass109Array9068[i_571_]);
									if (class109_574_ == null)
										class109_574_ = class167_sub1_564_.aClass109Array9068[i_571_] = new Class109(class109_572_);
									class109_573_.anInt1326 += class109_572_.anInt1326;
									class109_573_.anInt1325 += class109_572_.anInt1325;
									class109_573_.anInt1327 += class109_572_.anInt1327;
									class109_573_.anInt1328 += class109_572_.anInt1328;
									class109_574_.anInt1326 += class109.anInt1326;
									class109_574_.anInt1325 += class109.anInt1325;
									class109_574_.anInt1327 += class109.anInt1327;
									class109_574_.anInt1328 += class109.anInt1328;
									i_565_++;
									anIntArray9127[i_567_] = anInt9085;
									anIntArray9053[i_571_] = anInt9085;
								}
							}
						}
					}
				}
			}
		}
		if (i_565_ >= 3 && bool) {
			for (int i_575_ = 0; i_575_ < anInt9074; i_575_++) {
				if (anIntArray9127[aShortArray9064[i_575_]] == anInt9085 && anIntArray9127[aShortArray9072[i_575_]] == anInt9085 && anIntArray9127[aShortArray9063[i_575_]] == anInt9085) {
					if (aByteArray9073 == null)
						aByteArray9073 = new byte[anInt9074];
					aByteArray9073[i_575_] = (byte) 2;
				}
			}
			for (int i_576_ = 0; i_576_ < class167_sub1_564_.anInt9074; i_576_++) {
				if ((anIntArray9053[class167_sub1_564_.aShortArray9064[i_576_]] == anInt9085) && anIntArray9053[(class167_sub1_564_.aShortArray9072[i_576_])] == anInt9085 && anIntArray9053[(class167_sub1_564_.aShortArray9063[i_576_])] == anInt9085) {
					if (class167_sub1_564_.aByteArray9073 == null)
						class167_sub1_564_.aByteArray9073 = new byte[class167_sub1_564_.anInt9074];
					class167_sub1_564_.aByteArray9073[i_576_] = (byte) 2;
				}
			}
		}
	}

	public int method2722() {
		return anInt9059;
	}

	public int method2723() {
		return anInt9060;
	}

	public byte[] method2820() {
		return aByteArray9086;
	}

	public void method2725(short i, short i_577_) {
		for (int i_578_ = 0; i_578_ < anInt9074; i_578_++) {
			if (aShortArray9088[i_578_] == i)
				aShortArray9088[i_578_] = i_577_;
		}
		if (aClass101Array9102 != null) {
			for (int i_579_ = 0; i_579_ < anInt9101; i_579_++) {
				Class101 class101 = aClass101Array9102[i_579_];
				Class103 class103 = aClass103Array9103[i_579_];
				class103.anInt1258 = (class103.anInt1258 * 330457669 & ~0xffffff | ((Class638.anIntArray8306[Class493.method8085((aShortArray9088[(class101.anInt1241 * -566359109)]), -97492687) & 0xffff]) & 0xffffff)) * -1951506291;
			}
		}
		if (anInt9084 == 2)
			anInt9084 = 1;
	}

	Class167 method14480(Class167_Sub1 class167_sub1_580_, Class167_Sub1 class167_sub1_581_, int i, boolean bool, boolean bool_582_) {
		class167_sub1_580_.aBool9105 = aBool9105;
		if (aBool9105) {
			class167_sub1_580_.aShort9111 = aShort9111;
			class167_sub1_580_.aShort9109 = aShort9109;
			class167_sub1_580_.aShort9113 = aShort9113;
			class167_sub1_580_.aShort9090 = aShort9090;
			class167_sub1_580_.aShort9108 = aShort9108;
			class167_sub1_580_.aShort9112 = aShort9112;
			class167_sub1_580_.aShort9082 = aShort9082;
			class167_sub1_580_.aShort9107 = aShort9107;
		}
		if (aBool9114) {
			class167_sub1_580_.aShort9115 = aShort9115;
			class167_sub1_580_.aBool9114 = true;
		} else
			class167_sub1_580_.aBool9114 = false;
		class167_sub1_580_.anInt9059 = anInt9059;
		class167_sub1_580_.anInt9060 = anInt9060;
		class167_sub1_580_.anInt9061 = anInt9061;
		class167_sub1_580_.anInt9062 = anInt9062;
		class167_sub1_580_.anInt9074 = anInt9074;
		class167_sub1_580_.anInt9101 = anInt9101;
		class167_sub1_580_.anInt9070 = anInt9070;
		if ((i & 0x100) != 0)
			class167_sub1_580_.aBool9128 = true;
		else
			class167_sub1_580_.aBool9128 = aBool9128;
		class167_sub1_580_.aBool9092 = aBool9092;
		boolean bool_583_ = (i & 0x7) == 7 | (i & 0x20) != 0;
		boolean bool_584_ = bool_583_ || (i & 0x1) != 0;
		boolean bool_585_ = bool_583_ || (i & 0x2) != 0;
		boolean bool_586_ = bool_583_ || (i & 0x4) != 0 || (i & 0x10) != 0;
		if (bool_584_ || bool_585_ || bool_586_) {
			if (bool_584_) {
				if (class167_sub1_581_.anIntArray9077 == null || class167_sub1_581_.anIntArray9077.length < anInt9061)
					class167_sub1_580_.anIntArray9077 = class167_sub1_581_.anIntArray9077 = new int[anInt9061];
				else
					class167_sub1_580_.anIntArray9077 = class167_sub1_581_.anIntArray9077;
				for (int i_587_ = 0; i_587_ < anInt9061; i_587_++)
					class167_sub1_580_.anIntArray9077[i_587_] = anIntArray9077[i_587_];
			} else
				class167_sub1_580_.anIntArray9077 = anIntArray9077;
			if (bool_585_) {
				if (class167_sub1_581_.anIntArray9047 == null || class167_sub1_581_.anIntArray9047.length < anInt9061)
					class167_sub1_580_.anIntArray9047 = class167_sub1_581_.anIntArray9047 = new int[anInt9061];
				else
					class167_sub1_580_.anIntArray9047 = class167_sub1_581_.anIntArray9047;
				for (int i_588_ = 0; i_588_ < anInt9061; i_588_++)
					class167_sub1_580_.anIntArray9047[i_588_] = anIntArray9047[i_588_];
			} else
				class167_sub1_580_.anIntArray9047 = anIntArray9047;
			if (bool_586_) {
				if (class167_sub1_581_.anIntArray9065 == null || class167_sub1_581_.anIntArray9065.length < anInt9061)
					class167_sub1_580_.anIntArray9065 = class167_sub1_581_.anIntArray9065 = new int[anInt9061];
				else
					class167_sub1_580_.anIntArray9065 = class167_sub1_581_.anIntArray9065;
				for (int i_589_ = 0; i_589_ < anInt9061; i_589_++)
					class167_sub1_580_.anIntArray9065[i_589_] = anIntArray9065[i_589_];
			} else
				class167_sub1_580_.anIntArray9065 = anIntArray9065;
		} else {
			class167_sub1_580_.anIntArray9077 = anIntArray9077;
			class167_sub1_580_.anIntArray9047 = anIntArray9047;
			class167_sub1_580_.anIntArray9065 = anIntArray9065;
		}
		if ((i & 0x84080) != 0) {
			if (class167_sub1_581_.aShortArray9088 == null || class167_sub1_581_.aShortArray9088.length < anInt9074) {
				int i_590_ = anInt9074;
				class167_sub1_580_.aShortArray9088 = class167_sub1_581_.aShortArray9088 = new short[i_590_];
			} else
				class167_sub1_580_.aShortArray9088 = class167_sub1_581_.aShortArray9088;
			for (int i_591_ = 0; i_591_ < anInt9074; i_591_++)
				class167_sub1_580_.aShortArray9088[i_591_] = aShortArray9088[i_591_];
		} else
			class167_sub1_580_.aShortArray9088 = aShortArray9088;
		if ((i & 0x97018) != 0) {
			class167_sub1_580_.anInt9084 = 0;
			Class167_Sub1 class167_sub1_592_ = class167_sub1_580_;
			Class167_Sub1 class167_sub1_593_ = class167_sub1_580_;
			class167_sub1_580_.anIntArray9099 = null;
			class167_sub1_593_.anIntArray9079 = null;
			class167_sub1_592_.anIntArray9106 = null;
		} else if ((i & 0x80) != 0) {
			if (bool_582_)
				method14459(false);
			if (anIntArray9106 != null) {
				if (class167_sub1_581_.anIntArray9106 == null || class167_sub1_581_.anIntArray9106.length < anInt9074) {
					int i_594_ = anInt9074;
					class167_sub1_580_.anIntArray9106 = class167_sub1_581_.anIntArray9106 = new int[i_594_];
					class167_sub1_580_.anIntArray9079 = class167_sub1_581_.anIntArray9079 = new int[i_594_];
					class167_sub1_580_.anIntArray9099 = class167_sub1_581_.anIntArray9099 = new int[i_594_];
				} else {
					class167_sub1_580_.anIntArray9106 = class167_sub1_581_.anIntArray9106;
					class167_sub1_580_.anIntArray9079 = class167_sub1_581_.anIntArray9079;
					class167_sub1_580_.anIntArray9099 = class167_sub1_581_.anIntArray9099;
				}
				for (int i_595_ = 0; i_595_ < anInt9074; i_595_++) {
					class167_sub1_580_.anIntArray9106[i_595_] = anIntArray9106[i_595_];
					class167_sub1_580_.anIntArray9079[i_595_] = anIntArray9079[i_595_];
					class167_sub1_580_.anIntArray9099[i_595_] = anIntArray9099[i_595_];
				}
			}
			class167_sub1_580_.anInt9084 = anInt9084;
		} else {
			if (bool_582_)
				method14459(false);
			class167_sub1_580_.anIntArray9106 = anIntArray9106;
			class167_sub1_580_.anIntArray9079 = anIntArray9079;
			class167_sub1_580_.anIntArray9099 = anIntArray9099;
			class167_sub1_580_.anInt9084 = anInt9084;
		}
		if ((i & 0x100) != 0) {
			if (class167_sub1_581_.aByteArray9086 == null || class167_sub1_581_.aByteArray9086.length < anInt9074) {
				int i_596_ = anInt9074;
				class167_sub1_580_.aByteArray9086 = class167_sub1_581_.aByteArray9086 = new byte[i_596_];
			} else
				class167_sub1_580_.aByteArray9086 = class167_sub1_581_.aByteArray9086;
			if (aByteArray9086 != null) {
				for (int i_597_ = 0; i_597_ < anInt9074; i_597_++)
					class167_sub1_580_.aByteArray9086[i_597_] = aByteArray9086[i_597_];
			} else {
				for (int i_598_ = 0; i_598_ < anInt9074; i_598_++)
					class167_sub1_580_.aByteArray9086[i_598_] = (byte) 0;
			}
		} else
			class167_sub1_580_.aByteArray9086 = aByteArray9086;
		if ((i & 0x8) != 0 || (i & 0x10) != 0) {
			if (class167_sub1_581_.aClass109Array9067 == null || class167_sub1_581_.aClass109Array9067.length < anInt9062) {
				int i_599_ = anInt9062;
				class167_sub1_580_.aClass109Array9067 = class167_sub1_581_.aClass109Array9067 = new Class109[i_599_];
			} else
				class167_sub1_580_.aClass109Array9067 = class167_sub1_581_.aClass109Array9067;
			if (aClass109Array9067 != null) {
				for (int i_600_ = 0; i_600_ < anInt9062; i_600_++)
					class167_sub1_580_.aClass109Array9067[i_600_] = new Class109(aClass109Array9067[i_600_]);
			} else
				class167_sub1_580_.aClass109Array9067 = null;
			if (aClass96Array9083 != null) {
				if (class167_sub1_581_.aClass96Array9083 == null || (class167_sub1_581_.aClass96Array9083.length < anInt9074)) {
					int i_601_ = anInt9074;
					class167_sub1_580_.aClass96Array9083 = class167_sub1_581_.aClass96Array9083 = new Class96[i_601_];
				} else
					class167_sub1_580_.aClass96Array9083 = class167_sub1_581_.aClass96Array9083;
				for (int i_602_ = 0; i_602_ < anInt9074; i_602_++)
					class167_sub1_580_.aClass96Array9083[i_602_] = (aClass96Array9083[i_602_] != null ? new Class96(aClass96Array9083[i_602_]) : null);
			} else
				class167_sub1_580_.aClass96Array9083 = null;
		} else {
			if (bool_582_)
				method14457();
			class167_sub1_580_.aClass109Array9067 = aClass109Array9067;
			class167_sub1_580_.aClass96Array9083 = aClass96Array9083;
		}
		if ((i & 0x8000) != 0) {
			if (aShortArray9087 == null)
				class167_sub1_580_.aShortArray9087 = null;
			else {
				if (class167_sub1_581_.aShortArray9087 == null || class167_sub1_581_.aShortArray9087.length < anInt9074) {
					int i_603_ = anInt9074;
					class167_sub1_580_.aShortArray9087 = class167_sub1_581_.aShortArray9087 = new short[i_603_];
				} else
					class167_sub1_580_.aShortArray9087 = class167_sub1_581_.aShortArray9087;
				for (int i_604_ = 0; i_604_ < anInt9074; i_604_++)
					class167_sub1_580_.aShortArray9087[i_604_] = aShortArray9087[i_604_];
			}
		} else
			class167_sub1_580_.aShortArray9087 = aShortArray9087;
		if ((i & 0x10000) != 0) {
			if (aByteArray9073 == null)
				class167_sub1_580_.aByteArray9073 = null;
			else {
				if (class167_sub1_581_.aByteArray9073 == null || class167_sub1_581_.aByteArray9073.length < anInt9074) {
					int i_605_ = bool ? anInt9074 + 100 : anInt9074;
					class167_sub1_580_.aByteArray9073 = class167_sub1_581_.aByteArray9073 = new byte[i_605_];
				} else
					class167_sub1_580_.aByteArray9073 = class167_sub1_581_.aByteArray9073;
				for (int i_606_ = 0; i_606_ < anInt9074; i_606_++)
					class167_sub1_580_.aByteArray9073[i_606_] = aByteArray9073[i_606_];
			}
		} else
			class167_sub1_580_.aByteArray9073 = aByteArray9073;
		if ((i & 0xc580) != 0) {
			if (class167_sub1_581_.aClass103Array9103 == null || class167_sub1_581_.aClass103Array9103.length < anInt9101) {
				int i_607_ = anInt9101;
				class167_sub1_580_.aClass103Array9103 = class167_sub1_581_.aClass103Array9103 = new Class103[i_607_];
				for (int i_608_ = 0; i_608_ < anInt9101; i_608_++)
					class167_sub1_580_.aClass103Array9103[i_608_] = aClass103Array9103[i_608_].method1805(1195111165);
			} else {
				class167_sub1_580_.aClass103Array9103 = class167_sub1_581_.aClass103Array9103;
				for (int i_609_ = 0; i_609_ < anInt9101; i_609_++)
					class167_sub1_580_.aClass103Array9103[i_609_].method1806(aClass103Array9103[i_609_], -1661000200);
			}
		} else
			class167_sub1_580_.aClass103Array9103 = aClass103Array9103;
		if (aFloatArrayArray9117 != null && (i & 0x10) != 0) {
			if (class167_sub1_581_.aFloatArrayArray9117 == null || (class167_sub1_581_.aFloatArrayArray9117.length < anInt9074)) {
				int i_610_ = bool ? anInt9074 + 100 : anInt9074;
				class167_sub1_580_.aFloatArrayArray9117 = class167_sub1_581_.aFloatArrayArray9117 = new float[i_610_][3];
			} else
				class167_sub1_580_.aFloatArrayArray9117 = class167_sub1_581_.aFloatArrayArray9117;
			for (int i_611_ = 0; i_611_ < anInt9074; i_611_++) {
				if (aFloatArrayArray9117[i_611_] != null) {
					class167_sub1_580_.aFloatArrayArray9117[i_611_][0] = aFloatArrayArray9117[i_611_][0];
					class167_sub1_580_.aFloatArrayArray9117[i_611_][1] = aFloatArrayArray9117[i_611_][1];
					class167_sub1_580_.aFloatArrayArray9117[i_611_][2] = aFloatArrayArray9117[i_611_][2];
				}
			}
			if (class167_sub1_581_.aFloatArrayArray9075 == null || (class167_sub1_581_.aFloatArrayArray9075.length < anInt9074)) {
				int i_612_ = bool ? anInt9074 + 100 : anInt9074;
				class167_sub1_580_.aFloatArrayArray9075 = class167_sub1_581_.aFloatArrayArray9075 = new float[i_612_][3];
			} else
				class167_sub1_580_.aFloatArrayArray9075 = class167_sub1_581_.aFloatArrayArray9075;
			for (int i_613_ = 0; i_613_ < anInt9074; i_613_++) {
				if (aFloatArrayArray9075[i_613_] != null) {
					class167_sub1_580_.aFloatArrayArray9075[i_613_][0] = aFloatArrayArray9075[i_613_][0];
					class167_sub1_580_.aFloatArrayArray9075[i_613_][1] = aFloatArrayArray9075[i_613_][1];
					class167_sub1_580_.aFloatArrayArray9075[i_613_][2] = aFloatArrayArray9075[i_613_][2];
				}
			}
		} else {
			class167_sub1_580_.aFloatArrayArray9117 = aFloatArrayArray9117;
			class167_sub1_580_.aFloatArrayArray9075 = aFloatArrayArray9075;
		}
		class167_sub1_580_.anIntArrayArray9091 = anIntArrayArray9091;
		class167_sub1_580_.anIntArrayArray9048 = anIntArrayArray9048;
		class167_sub1_580_.anIntArrayArray9104 = anIntArrayArray9104;
		class167_sub1_580_.aShortArray9066 = aShortArray9066;
		class167_sub1_580_.aShortArray9078 = aShortArray9078;
		class167_sub1_580_.aByteArray9130 = aByteArray9130;
		class167_sub1_580_.aShortArray9064 = aShortArray9064;
		class167_sub1_580_.aShortArray9072 = aShortArray9072;
		class167_sub1_580_.aShortArray9063 = aShortArray9063;
		class167_sub1_580_.aClass184Array9089 = aClass184Array9089;
		class167_sub1_580_.aClass143Array9100 = aClass143Array9100;
		class167_sub1_580_.aClass101Array9102 = aClass101Array9102;
		class167_sub1_580_.aShortArray9116 = aShortArray9116;
		class167_sub1_580_.anInt9058 = i;
		return class167_sub1_580_;
	}

	public boolean method2731() {
		return aBool9092;
	}

	public void method2839(int i, int i_614_, int i_615_, int i_616_) {
		if ((anInt9058 & 0x80000) != 524288)
			throw new IllegalStateException();
		for (int i_617_ = 0; i_617_ < anInt9074; i_617_++) {
			int i_618_ = aShortArray9088[i_617_] & 0xffff;
			int i_619_ = i_618_ >> 10 & 0x3f;
			int i_620_ = i_618_ >> 7 & 0x7;
			int i_621_ = i_618_ & 0x7f;
			if (i != -1)
				i_619_ += (i - i_619_) * i_616_ >> 7;
			if (i_614_ != -1)
				i_620_ += (i_614_ - i_620_) * i_616_ >> 7;
			if (i_615_ != -1)
				i_621_ += (i_615_ - i_621_) * i_616_ >> 7;
			aShortArray9088[i_617_] = (short) (i_619_ << 10 | i_620_ << 7 | i_621_);
		}
		if (aClass101Array9102 != null) {
			for (int i_622_ = 0; i_622_ < anInt9101; i_622_++) {
				Class101 class101 = aClass101Array9102[i_622_];
				Class103 class103 = aClass103Array9103[i_622_];
				class103.anInt1258 = (class103.anInt1258 * 330457669 & ~0xffffff | ((Class638.anIntArray8306[Class493.method8085((aShortArray9088[(class101.anInt1241 * -566359109)]) & 0xffff, 2022996064) & 0xffff]) & 0xffffff)) * -1951506291;
			}
		}
		if (anInt9084 == 2)
			anInt9084 = 1;
	}

	public Class184[] method2733() {
		return aClass184Array9089;
	}

	public Class143[] method2734() {
		return aClass143Array9100;
	}

	public boolean method2727() {
		if (aShortArray9087 == null)
			return true;
		for (int i = 0; i < aShortArray9087.length; i++) {
			if (aShortArray9087[i] != -1 && !aClass178_Sub3_9049.method15414(aShortArray9087[i]))
				return false;
		}
		return true;
	}

	public boolean method2730() {
		return aBool9128;
	}

	public int method2711() {
		if (!aBool9105)
			method14478();
		return aShort9082;
	}

	void method14481(Class99 class99) {
		aClass118_9118 = class99.aClass118_1200;
		if (class99 != aClass99_9069) {
			aClass99_9069 = class99;
			anIntArray9119 = aClass99_9069.anIntArray1197;
			aFloatArray9120 = aClass99_9069.aFloatArray1206;
			aFloatArray9121 = aClass99_9069.aFloatArray1217;
			aFloatArray9122 = aClass99_9069.aFloatArray1207;
			aFloatArray9123 = aClass99_9069.aFloatArray1225;
			anIntArray9124 = aClass99_9069.anIntArray1209;
			anIntArray9125 = aClass99_9069.anIntArray1212;
			anIntArray9126 = aClass99_9069.anIntArray1211;
			anIntArray9127 = aClass99_9069.anIntArray1208;
			anIntArray9053 = aClass99_9069.anIntArray1194;
			anIntArray9129 = aClass99_9069.anIntArray1190;
		}
	}

	void method14482(Class99 class99) {
		aClass118_9118 = class99.aClass118_1200;
		if (class99 != aClass99_9069) {
			aClass99_9069 = class99;
			anIntArray9119 = aClass99_9069.anIntArray1197;
			aFloatArray9120 = aClass99_9069.aFloatArray1206;
			aFloatArray9121 = aClass99_9069.aFloatArray1217;
			aFloatArray9122 = aClass99_9069.aFloatArray1207;
			aFloatArray9123 = aClass99_9069.aFloatArray1225;
			anIntArray9124 = aClass99_9069.anIntArray1209;
			anIntArray9125 = aClass99_9069.anIntArray1212;
			anIntArray9126 = aClass99_9069.anIntArray1211;
			anIntArray9127 = aClass99_9069.anIntArray1208;
			anIntArray9053 = aClass99_9069.anIntArray1194;
			anIntArray9129 = aClass99_9069.anIntArray1190;
		}
	}

	void method14483(Thread thread) {
		Class99 class99 = aClass178_Sub3_9049.method15475(thread);
		if (class99 != aClass99_9045) {
			aClass99_9045 = class99;
			aClass167_Sub1Array9076 = aClass99_9045.aClass167_Sub1Array1224;
			aClass167_Sub1Array9131 = aClass99_9045.aClass167_Sub1Array1222;
		}
	}

	void method14484(Thread thread) {
		Class99 class99 = aClass178_Sub3_9049.method15475(thread);
		if (class99 != aClass99_9045) {
			aClass99_9045 = class99;
			aClass167_Sub1Array9076 = aClass99_9045.aClass167_Sub1Array1224;
			aClass167_Sub1Array9131 = aClass99_9045.aClass167_Sub1Array1222;
		}
	}

	public void method2843(int i, int i_623_, int i_624_, int i_625_) {
		if ((anInt9058 & 0x80000) != 524288)
			throw new IllegalStateException();
		for (int i_626_ = 0; i_626_ < anInt9074; i_626_++) {
			int i_627_ = aShortArray9088[i_626_] & 0xffff;
			int i_628_ = i_627_ >> 10 & 0x3f;
			int i_629_ = i_627_ >> 7 & 0x7;
			int i_630_ = i_627_ & 0x7f;
			if (i != -1)
				i_628_ += (i - i_628_) * i_625_ >> 7;
			if (i_623_ != -1)
				i_629_ += (i_623_ - i_629_) * i_625_ >> 7;
			if (i_624_ != -1)
				i_630_ += (i_624_ - i_630_) * i_625_ >> 7;
			aShortArray9088[i_626_] = (short) (i_628_ << 10 | i_629_ << 7 | i_630_);
		}
		if (aClass101Array9102 != null) {
			for (int i_631_ = 0; i_631_ < anInt9101; i_631_++) {
				Class101 class101 = aClass101Array9102[i_631_];
				Class103 class103 = aClass103Array9103[i_631_];
				class103.anInt1258 = (class103.anInt1258 * 330457669 & ~0xffffff | ((Class638.anIntArray8306[Class493.method8085((aShortArray9088[(class101.anInt1241 * -566359109)]) & 0xffff, -67545545) & 0xffff]) & 0xffffff)) * -1951506291;
			}
		}
		if (anInt9084 == 2)
			anInt9084 = 1;
	}

	void method14485() {
		if (anInt9084 == 0 && aClass109Array9067 == null) {
			if (aClass178_Sub3_9049.anInt9819 * 1353126165 > 1) {
				synchronized (this) {
					method14458();
				}
			} else
				method14458();
		}
	}

	void method14486() {
		synchronized (this) {
			for (int i = 0; i < anInt9062; i++) {
				int i_632_ = anIntArray9077[i];
				anIntArray9077[i] = anIntArray9065[i];
				anIntArray9065[i] = -i_632_;
				if (aClass109Array9067[i] != null) {
					i_632_ = aClass109Array9067[i].anInt1326;
					aClass109Array9067[i].anInt1326 = aClass109Array9067[i].anInt1327;
					aClass109Array9067[i].anInt1327 = -i_632_;
				}
			}
			if (aClass96Array9083 != null) {
				for (int i = 0; i < anInt9074; i++) {
					if (aClass96Array9083[i] != null) {
						int i_633_ = aClass96Array9083[i].anInt1181;
						aClass96Array9083[i].anInt1181 = aClass96Array9083[i].anInt1183;
						aClass96Array9083[i].anInt1183 = -i_633_;
					}
				}
			}
			for (int i = anInt9062; i < anInt9061; i++) {
				int i_634_ = anIntArray9077[i];
				anIntArray9077[i] = anIntArray9065[i];
				anIntArray9065[i] = -i_634_;
			}
			anInt9084 = 0;
			aBool9105 = false;
		}
	}

	public int method2683() {
		return anInt9058;
	}

	public int method2796() {
		if (!aBool9105)
			method14478();
		return aShort9107;
	}

	void method14487(boolean bool) {
		if (anInt9084 == 1)
			method14503();
		else if (anInt9084 == 2) {
			if ((anInt9058 & 0x97098) == 0 && aFloatArrayArray9117 == null)
				aShortArray9088 = null;
			if (bool)
				aByteArray9073 = null;
		} else {
			method14457();
			int i = aClass178_Sub3_9049.anInt9839 * 1364344413;
			int i_635_ = aClass178_Sub3_9049.anInt9813 * 126842783;
			int i_636_ = aClass178_Sub3_9049.anInt9834 * 1707081643;
			int i_637_ = aClass178_Sub3_9049.anInt9817 * 424272355 >> 8;
			int i_638_ = 0;
			int i_639_ = 0;
			if (anInt9060 != 0) {
				i_638_ = aClass178_Sub3_9049.anInt9831 * 742910208 / anInt9060;
				i_639_ = aClass178_Sub3_9049.anInt9816 * -723498752 / anInt9060;
			}
			if (anIntArray9106 == null) {
				anIntArray9106 = new int[anInt9074];
				anIntArray9079 = new int[anInt9074];
				anIntArray9099 = new int[anInt9074];
			}
			for (int i_640_ = 0; i_640_ < anInt9074; i_640_++) {
				byte i_641_;
				if (aByteArray9073 == null)
					i_641_ = (byte) 0;
				else
					i_641_ = aByteArray9073[i_640_];
				byte i_642_;
				if (aByteArray9086 == null)
					i_642_ = (byte) 0;
				else
					i_642_ = aByteArray9086[i_640_];
				short i_643_;
				if (aShortArray9087 == null)
					i_643_ = (short) -1;
				else
					i_643_ = aShortArray9087[i_640_];
				if (i_642_ == -2)
					i_641_ = (byte) 3;
				if (i_642_ == -1)
					i_641_ = (byte) 2;
				if (i_643_ == -1) {
					if (i_641_ == 0) {
						int i_644_ = aShortArray9088[i_640_] & 0xffff;
						int i_645_ = (i_644_ & 0x7f) * anInt9059 >> 7;
						short i_646_ = Class493.method8085(i_644_ & ~0x7f | i_645_, -648738812);
						Class109 class109;
						if (aClass109Array9068 != null && (aClass109Array9068[aShortArray9064[i_640_]] != null))
							class109 = aClass109Array9068[aShortArray9064[i_640_]];
						else
							class109 = aClass109Array9067[aShortArray9064[i_640_]];
						int i_647_ = (((i * class109.anInt1326 + i_635_ * class109.anInt1325 + i_636_ * class109.anInt1327) / class109.anInt1328) >> 16);
						int i_648_ = i_647_ > 256 ? i_638_ : i_639_;
						int i_649_ = (i_637_ >> 1) + (i_648_ * i_647_ >> 17);
						anIntArray9106[i_640_] = i_649_ << 17 | Class174.method2935(i_646_, i_649_, 1530418723);
						if (aClass109Array9068 != null && (aClass109Array9068[aShortArray9072[i_640_]] != null))
							class109 = aClass109Array9068[aShortArray9072[i_640_]];
						else
							class109 = aClass109Array9067[aShortArray9072[i_640_]];
						i_647_ = ((i * class109.anInt1326 + i_635_ * class109.anInt1325 + i_636_ * class109.anInt1327) / class109.anInt1328) >> 16;
						i_648_ = i_647_ > 256 ? i_638_ : i_639_;
						i_649_ = (i_637_ >> 1) + (i_648_ * i_647_ >> 17);
						anIntArray9079[i_640_] = i_649_ << 17 | Class174.method2935(i_646_, i_649_, 1530418723);
						if (aClass109Array9068 != null && (aClass109Array9068[aShortArray9063[i_640_]] != null))
							class109 = aClass109Array9068[aShortArray9063[i_640_]];
						else
							class109 = aClass109Array9067[aShortArray9063[i_640_]];
						i_647_ = ((i * class109.anInt1326 + i_635_ * class109.anInt1325 + i_636_ * class109.anInt1327) / class109.anInt1328) >> 16;
						i_648_ = i_647_ > 256 ? i_638_ : i_639_;
						i_649_ = (i_637_ >> 1) + (i_648_ * i_647_ >> 17);
						anIntArray9099[i_640_] = i_649_ << 17 | Class174.method2935(i_646_, i_649_, 1530418723);
					} else if (i_641_ == 1) {
						int i_650_ = aShortArray9088[i_640_] & 0xffff;
						int i_651_ = (i_650_ & 0x7f) * anInt9059 >> 7;
						short i_652_ = Class493.method8085(i_650_ & ~0x7f | i_651_, 754729847);
						Class96 class96 = aClass96Array9083[i_640_];
						int i_653_ = ((i * class96.anInt1181 + i_635_ * class96.anInt1182 + i_636_ * class96.anInt1183) >> 16);
						int i_654_ = i_653_ > 256 ? i_638_ : i_639_;
						int i_655_ = (i_637_ >> 1) + (i_654_ * i_653_ >> 17);
						anIntArray9106[i_640_] = i_655_ << 17 | Class174.method2935(i_652_, i_655_, 1530418723);
						anIntArray9099[i_640_] = -1;
					} else if (i_641_ == 3) {
						anIntArray9106[i_640_] = 128;
						anIntArray9099[i_640_] = -1;
					} else
						anIntArray9099[i_640_] = -2;
				} else {
					int i_656_ = aShortArray9088[i_640_] & 0xffff;
					if (i_641_ == 0) {
						Class109 class109;
						if (aClass109Array9068 != null && (aClass109Array9068[aShortArray9064[i_640_]] != null))
							class109 = aClass109Array9068[aShortArray9064[i_640_]];
						else
							class109 = aClass109Array9067[aShortArray9064[i_640_]];
						int i_657_ = (((i * class109.anInt1326 + i_635_ * class109.anInt1325 + i_636_ * class109.anInt1327) / class109.anInt1328) >> 16);
						int i_658_ = i_657_ > 256 ? i_638_ : i_639_;
						int i_659_ = method14509((i_637_ >> 2) + (i_658_ * i_657_ >> 18));
						anIntArray9106[i_640_] = i_659_ << 24 | method14460(i_656_, i_643_, i_659_);
						if (aClass109Array9068 != null && (aClass109Array9068[aShortArray9072[i_640_]] != null))
							class109 = aClass109Array9068[aShortArray9072[i_640_]];
						else
							class109 = aClass109Array9067[aShortArray9072[i_640_]];
						i_657_ = ((i * class109.anInt1326 + i_635_ * class109.anInt1325 + i_636_ * class109.anInt1327) / class109.anInt1328) >> 16;
						i_658_ = i_657_ > 256 ? i_638_ : i_639_;
						i_659_ = method14509((i_637_ >> 2) + (i_658_ * i_657_ >> 18));
						anIntArray9079[i_640_] = i_659_ << 24 | method14460(i_656_, i_643_, i_659_);
						if (aClass109Array9068 != null && (aClass109Array9068[aShortArray9063[i_640_]] != null))
							class109 = aClass109Array9068[aShortArray9063[i_640_]];
						else
							class109 = aClass109Array9067[aShortArray9063[i_640_]];
						i_657_ = ((i * class109.anInt1326 + i_635_ * class109.anInt1325 + i_636_ * class109.anInt1327) / class109.anInt1328) >> 16;
						i_658_ = i_657_ > 256 ? i_638_ : i_639_;
						i_659_ = method14509((i_637_ >> 2) + (i_658_ * i_657_ >> 18));
						anIntArray9099[i_640_] = i_659_ << 24 | method14460(i_656_, i_643_, i_659_);
					} else if (i_641_ == 1) {
						Class96 class96 = aClass96Array9083[i_640_];
						int i_660_ = ((i * class96.anInt1181 + i_635_ * class96.anInt1182 + i_636_ * class96.anInt1183) >> 16);
						int i_661_ = i_660_ > 256 ? i_638_ : i_639_;
						int i_662_ = method14509((i_637_ >> 2) + (i_661_ * i_660_ >> 18));
						anIntArray9106[i_640_] = i_662_ << 24 | method14460(i_656_, i_643_, i_662_);
						anIntArray9099[i_640_] = -1;
					} else
						anIntArray9099[i_640_] = -2;
				}
			}
			aClass109Array9067 = null;
			aClass109Array9068 = null;
			aClass96Array9083 = null;
			if ((anInt9058 & 0x97098) == 0 && aFloatArrayArray9117 == null)
				aShortArray9088 = null;
			if (bool)
				aByteArray9073 = null;
			anInt9084 = 2;
		}
	}

	int method14488(int i, int i_663_) {
		i_663_ = i_663_ * (i & 0x7f) >> 7;
		if (i_663_ < 2)
			i_663_ = 2;
		else if (i_663_ > 126)
			i_663_ = 126;
		return (i & 0xff80) + i_663_;
	}

	void method2778(int i, int[] is, int i_664_, int i_665_, int i_666_, boolean bool, int i_667_, int[] is_668_) {
		int i_669_ = is.length;
		if (i == 0) {
			i_664_ <<= 4;
			i_665_ <<= 4;
			i_666_ <<= 4;
			if (!aBool9094) {
				for (int i_670_ = 0; i_670_ < anInt9061; i_670_++) {
					anIntArray9077[i_670_] <<= 4;
					anIntArray9047[i_670_] <<= 4;
					anIntArray9065[i_670_] <<= 4;
				}
				aBool9094 = true;
			}
			int i_671_ = 0;
			anInt9095 = 0;
			anInt9096 = 0;
			anInt9097 = 0;
			for (int i_672_ = 0; i_672_ < i_669_; i_672_++) {
				int i_673_ = is[i_672_];
				if (i_673_ < anIntArrayArray9091.length) {
					int[] is_674_ = anIntArrayArray9091[i_673_];
					for (int i_675_ = 0; i_675_ < is_674_.length; i_675_++) {
						int i_676_ = is_674_[i_675_];
						if (aShortArray9066 == null || (i_667_ & aShortArray9066[i_676_]) != 0) {
							anInt9095 += anIntArray9077[i_676_];
							anInt9096 += anIntArray9047[i_676_];
							anInt9097 += anIntArray9065[i_676_];
							i_671_++;
						}
					}
				}
			}
			if (i_671_ > 0) {
				anInt9095 = anInt9095 / i_671_ + i_664_;
				anInt9096 = anInt9096 / i_671_ + i_665_;
				anInt9097 = anInt9097 / i_671_ + i_666_;
				aBool9098 = true;
			} else {
				anInt9095 = i_664_;
				anInt9096 = i_665_;
				anInt9097 = i_666_;
			}
		} else if (i == 1) {
			if (is_668_ != null) {
				int i_677_ = ((is_668_[0] * i_664_ + is_668_[1] * i_665_ + is_668_[2] * i_666_ + 8192) >> 14);
				int i_678_ = ((is_668_[3] * i_664_ + is_668_[4] * i_665_ + is_668_[5] * i_666_ + 8192) >> 14);
				int i_679_ = ((is_668_[6] * i_664_ + is_668_[7] * i_665_ + is_668_[8] * i_666_ + 8192) >> 14);
				i_664_ = i_677_;
				i_665_ = i_678_;
				i_666_ = i_679_;
			}
			i_664_ <<= 4;
			i_665_ <<= 4;
			i_666_ <<= 4;
			if (!aBool9094) {
				for (int i_680_ = 0; i_680_ < anInt9061; i_680_++) {
					anIntArray9077[i_680_] <<= 4;
					anIntArray9047[i_680_] <<= 4;
					anIntArray9065[i_680_] <<= 4;
				}
				aBool9094 = true;
			}
			for (int i_681_ = 0; i_681_ < i_669_; i_681_++) {
				int i_682_ = is[i_681_];
				if (i_682_ < anIntArrayArray9091.length) {
					int[] is_683_ = anIntArrayArray9091[i_682_];
					for (int i_684_ = 0; i_684_ < is_683_.length; i_684_++) {
						int i_685_ = is_683_[i_684_];
						if (aShortArray9066 == null || (i_667_ & aShortArray9066[i_685_]) != 0) {
							anIntArray9077[i_685_] += i_664_;
							anIntArray9047[i_685_] += i_665_;
							anIntArray9065[i_685_] += i_666_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_668_ != null) {
				if (!aBool9094) {
					for (int i_686_ = 0; i_686_ < anInt9061; i_686_++) {
						anIntArray9077[i_686_] <<= 4;
						anIntArray9047[i_686_] <<= 4;
						anIntArray9065[i_686_] <<= 4;
					}
					aBool9094 = true;
				}
				int i_687_ = is_668_[9] << 4;
				int i_688_ = is_668_[10] << 4;
				int i_689_ = is_668_[11] << 4;
				int i_690_ = is_668_[12] << 4;
				int i_691_ = is_668_[13] << 4;
				int i_692_ = is_668_[14] << 4;
				if (aBool9098) {
					int i_693_ = ((is_668_[0] * anInt9095 + is_668_[3] * anInt9096 + is_668_[6] * anInt9097 + 8192) >> 14);
					int i_694_ = ((is_668_[1] * anInt9095 + is_668_[4] * anInt9096 + is_668_[7] * anInt9097 + 8192) >> 14);
					int i_695_ = ((is_668_[2] * anInt9095 + is_668_[5] * anInt9096 + is_668_[8] * anInt9097 + 8192) >> 14);
					i_693_ += i_690_;
					i_694_ += i_691_;
					i_695_ += i_692_;
					anInt9095 = i_693_;
					anInt9096 = i_694_;
					anInt9097 = i_695_;
					aBool9098 = false;
				}
				int[] is_696_ = new int[9];
				int i_697_ = Class433.anIntArray4881[i_664_];
				int i_698_ = Class433.anIntArray4880[i_664_];
				int i_699_ = Class433.anIntArray4881[i_665_];
				int i_700_ = Class433.anIntArray4880[i_665_];
				int i_701_ = Class433.anIntArray4881[i_666_];
				int i_702_ = Class433.anIntArray4880[i_666_];
				int i_703_ = i_698_ * i_701_ + 8192 >> 14;
				int i_704_ = i_698_ * i_702_ + 8192 >> 14;
				is_696_[0] = i_699_ * i_701_ + i_700_ * i_704_ + 8192 >> 14;
				is_696_[1] = -i_699_ * i_702_ + i_700_ * i_703_ + 8192 >> 14;
				is_696_[2] = i_700_ * i_697_ + 8192 >> 14;
				is_696_[3] = i_697_ * i_702_ + 8192 >> 14;
				is_696_[4] = i_697_ * i_701_ + 8192 >> 14;
				is_696_[5] = -i_698_;
				is_696_[6] = -i_700_ * i_701_ + i_699_ * i_704_ + 8192 >> 14;
				is_696_[7] = i_700_ * i_702_ + i_699_ * i_703_ + 8192 >> 14;
				is_696_[8] = i_699_ * i_697_ + 8192 >> 14;
				int i_705_ = (is_696_[0] * -anInt9095 + is_696_[1] * -anInt9096 + is_696_[2] * -anInt9097 + 8192) >> 14;
				int i_706_ = (is_696_[3] * -anInt9095 + is_696_[4] * -anInt9096 + is_696_[5] * -anInt9097 + 8192) >> 14;
				int i_707_ = (is_696_[6] * -anInt9095 + is_696_[7] * -anInt9096 + is_696_[8] * -anInt9097 + 8192) >> 14;
				int i_708_ = i_705_ + anInt9095;
				int i_709_ = i_706_ + anInt9096;
				int i_710_ = i_707_ + anInt9097;
				int[] is_711_ = new int[9];
				for (int i_712_ = 0; i_712_ < 3; i_712_++) {
					for (int i_713_ = 0; i_713_ < 3; i_713_++) {
						int i_714_ = 0;
						for (int i_715_ = 0; i_715_ < 3; i_715_++)
							i_714_ += (is_696_[i_712_ * 3 + i_715_] * is_668_[i_713_ * 3 + i_715_]);
						is_711_[i_712_ * 3 + i_713_] = i_714_ + 8192 >> 14;
					}
				}
				int i_716_ = ((is_696_[0] * i_690_ + is_696_[1] * i_691_ + is_696_[2] * i_692_ + 8192) >> 14);
				int i_717_ = ((is_696_[3] * i_690_ + is_696_[4] * i_691_ + is_696_[5] * i_692_ + 8192) >> 14);
				int i_718_ = ((is_696_[6] * i_690_ + is_696_[7] * i_691_ + is_696_[8] * i_692_ + 8192) >> 14);
				i_716_ += i_708_;
				i_717_ += i_709_;
				i_718_ += i_710_;
				int[] is_719_ = new int[9];
				for (int i_720_ = 0; i_720_ < 3; i_720_++) {
					for (int i_721_ = 0; i_721_ < 3; i_721_++) {
						int i_722_ = 0;
						for (int i_723_ = 0; i_723_ < 3; i_723_++)
							i_722_ += (is_668_[i_720_ * 3 + i_723_] * is_711_[i_721_ + i_723_ * 3]);
						is_719_[i_720_ * 3 + i_721_] = i_722_ + 8192 >> 14;
					}
				}
				int i_724_ = ((is_668_[0] * i_716_ + is_668_[1] * i_717_ + is_668_[2] * i_718_ + 8192) >> 14);
				int i_725_ = ((is_668_[3] * i_716_ + is_668_[4] * i_717_ + is_668_[5] * i_718_ + 8192) >> 14);
				int i_726_ = ((is_668_[6] * i_716_ + is_668_[7] * i_717_ + is_668_[8] * i_718_ + 8192) >> 14);
				i_724_ += i_687_;
				i_725_ += i_688_;
				i_726_ += i_689_;
				for (int i_727_ = 0; i_727_ < i_669_; i_727_++) {
					int i_728_ = is[i_727_];
					if (i_728_ < anIntArrayArray9091.length) {
						int[] is_729_ = anIntArrayArray9091[i_728_];
						for (int i_730_ = 0; i_730_ < is_729_.length; i_730_++) {
							int i_731_ = is_729_[i_730_];
							if (aShortArray9066 == null || (i_667_ & aShortArray9066[i_731_]) != 0) {
								int i_732_ = ((is_719_[0] * anIntArray9077[i_731_] + is_719_[1] * anIntArray9047[i_731_] + is_719_[2] * anIntArray9065[i_731_] + 8192) >> 14);
								int i_733_ = ((is_719_[3] * anIntArray9077[i_731_] + is_719_[4] * anIntArray9047[i_731_] + is_719_[5] * anIntArray9065[i_731_] + 8192) >> 14);
								int i_734_ = ((is_719_[6] * anIntArray9077[i_731_] + is_719_[7] * anIntArray9047[i_731_] + is_719_[8] * anIntArray9065[i_731_] + 8192) >> 14);
								i_732_ += i_724_;
								i_733_ += i_725_;
								i_734_ += i_726_;
								anIntArray9077[i_731_] = i_732_;
								anIntArray9047[i_731_] = i_733_;
								anIntArray9065[i_731_] = i_734_;
							}
						}
					}
				}
			} else {
				for (int i_735_ = 0; i_735_ < i_669_; i_735_++) {
					int i_736_ = is[i_735_];
					if (i_736_ < anIntArrayArray9091.length) {
						int[] is_737_ = anIntArrayArray9091[i_736_];
						for (int i_738_ = 0; i_738_ < is_737_.length; i_738_++) {
							int i_739_ = is_737_[i_738_];
							if (aShortArray9066 == null || (i_667_ & aShortArray9066[i_739_]) != 0) {
								anIntArray9077[i_739_] -= anInt9095;
								anIntArray9047[i_739_] -= anInt9096;
								anIntArray9065[i_739_] -= anInt9097;
								if (i_666_ != 0) {
									int i_740_ = Class433.anIntArray4880[i_666_];
									int i_741_ = Class433.anIntArray4881[i_666_];
									int i_742_ = ((anIntArray9047[i_739_] * i_740_ + anIntArray9077[i_739_] * i_741_ + 16383) >> 14);
									anIntArray9047[i_739_] = (anIntArray9047[i_739_] * i_741_ - anIntArray9077[i_739_] * i_740_ + 16383) >> 14;
									anIntArray9077[i_739_] = i_742_;
								}
								if (i_664_ != 0) {
									int i_743_ = Class433.anIntArray4880[i_664_];
									int i_744_ = Class433.anIntArray4881[i_664_];
									int i_745_ = ((anIntArray9047[i_739_] * i_744_ - anIntArray9065[i_739_] * i_743_ + 16383) >> 14);
									anIntArray9065[i_739_] = (anIntArray9047[i_739_] * i_743_ + anIntArray9065[i_739_] * i_744_ + 16383) >> 14;
									anIntArray9047[i_739_] = i_745_;
								}
								if (i_665_ != 0) {
									int i_746_ = Class433.anIntArray4880[i_665_];
									int i_747_ = Class433.anIntArray4881[i_665_];
									int i_748_ = ((anIntArray9065[i_739_] * i_746_ + anIntArray9077[i_739_] * i_747_ + 16383) >> 14);
									anIntArray9065[i_739_] = (anIntArray9065[i_739_] * i_747_ - anIntArray9077[i_739_] * i_746_ + 16383) >> 14;
									anIntArray9077[i_739_] = i_748_;
								}
								anIntArray9077[i_739_] += anInt9095;
								anIntArray9047[i_739_] += anInt9096;
								anIntArray9065[i_739_] += anInt9097;
							}
						}
					}
				}
			}
		} else if (i == 3) {
			if (is_668_ != null) {
				if (!aBool9094) {
					for (int i_749_ = 0; i_749_ < anInt9061; i_749_++) {
						anIntArray9077[i_749_] <<= 4;
						anIntArray9047[i_749_] <<= 4;
						anIntArray9065[i_749_] <<= 4;
					}
					aBool9094 = true;
				}
				int i_750_ = is_668_[9] << 4;
				int i_751_ = is_668_[10] << 4;
				int i_752_ = is_668_[11] << 4;
				int i_753_ = is_668_[12] << 4;
				int i_754_ = is_668_[13] << 4;
				int i_755_ = is_668_[14] << 4;
				if (aBool9098) {
					int i_756_ = ((is_668_[0] * anInt9095 + is_668_[3] * anInt9096 + is_668_[6] * anInt9097 + 8192) >> 14);
					int i_757_ = ((is_668_[1] * anInt9095 + is_668_[4] * anInt9096 + is_668_[7] * anInt9097 + 8192) >> 14);
					int i_758_ = ((is_668_[2] * anInt9095 + is_668_[5] * anInt9096 + is_668_[8] * anInt9097 + 8192) >> 14);
					i_756_ += i_753_;
					i_757_ += i_754_;
					i_758_ += i_755_;
					anInt9095 = i_756_;
					anInt9096 = i_757_;
					anInt9097 = i_758_;
					aBool9098 = false;
				}
				int i_759_ = i_664_ << 15 >> 7;
				int i_760_ = i_665_ << 15 >> 7;
				int i_761_ = i_666_ << 15 >> 7;
				int i_762_ = i_759_ * -anInt9095 + 8192 >> 14;
				int i_763_ = i_760_ * -anInt9096 + 8192 >> 14;
				int i_764_ = i_761_ * -anInt9097 + 8192 >> 14;
				int i_765_ = i_762_ + anInt9095;
				int i_766_ = i_763_ + anInt9096;
				int i_767_ = i_764_ + anInt9097;
				int[] is_768_ = new int[9];
				is_768_[0] = i_759_ * is_668_[0] + 8192 >> 14;
				is_768_[1] = i_759_ * is_668_[3] + 8192 >> 14;
				is_768_[2] = i_759_ * is_668_[6] + 8192 >> 14;
				is_768_[3] = i_760_ * is_668_[1] + 8192 >> 14;
				is_768_[4] = i_760_ * is_668_[4] + 8192 >> 14;
				is_768_[5] = i_760_ * is_668_[7] + 8192 >> 14;
				is_768_[6] = i_761_ * is_668_[2] + 8192 >> 14;
				is_768_[7] = i_761_ * is_668_[5] + 8192 >> 14;
				is_768_[8] = i_761_ * is_668_[8] + 8192 >> 14;
				int i_769_ = i_759_ * i_753_ + 8192 >> 14;
				int i_770_ = i_760_ * i_754_ + 8192 >> 14;
				int i_771_ = i_761_ * i_755_ + 8192 >> 14;
				i_769_ += i_765_;
				i_770_ += i_766_;
				i_771_ += i_767_;
				int[] is_772_ = new int[9];
				for (int i_773_ = 0; i_773_ < 3; i_773_++) {
					for (int i_774_ = 0; i_774_ < 3; i_774_++) {
						int i_775_ = 0;
						for (int i_776_ = 0; i_776_ < 3; i_776_++)
							i_775_ += (is_668_[i_773_ * 3 + i_776_] * is_768_[i_774_ + i_776_ * 3]);
						is_772_[i_773_ * 3 + i_774_] = i_775_ + 8192 >> 14;
					}
				}
				int i_777_ = ((is_668_[0] * i_769_ + is_668_[1] * i_770_ + is_668_[2] * i_771_ + 8192) >> 14);
				int i_778_ = ((is_668_[3] * i_769_ + is_668_[4] * i_770_ + is_668_[5] * i_771_ + 8192) >> 14);
				int i_779_ = ((is_668_[6] * i_769_ + is_668_[7] * i_770_ + is_668_[8] * i_771_ + 8192) >> 14);
				i_777_ += i_750_;
				i_778_ += i_751_;
				i_779_ += i_752_;
				for (int i_780_ = 0; i_780_ < i_669_; i_780_++) {
					int i_781_ = is[i_780_];
					if (i_781_ < anIntArrayArray9091.length) {
						int[] is_782_ = anIntArrayArray9091[i_781_];
						for (int i_783_ = 0; i_783_ < is_782_.length; i_783_++) {
							int i_784_ = is_782_[i_783_];
							if (aShortArray9066 == null || (i_667_ & aShortArray9066[i_784_]) != 0) {
								int i_785_ = ((is_772_[0] * anIntArray9077[i_784_] + is_772_[1] * anIntArray9047[i_784_] + is_772_[2] * anIntArray9065[i_784_] + 8192) >> 14);
								int i_786_ = ((is_772_[3] * anIntArray9077[i_784_] + is_772_[4] * anIntArray9047[i_784_] + is_772_[5] * anIntArray9065[i_784_] + 8192) >> 14);
								int i_787_ = ((is_772_[6] * anIntArray9077[i_784_] + is_772_[7] * anIntArray9047[i_784_] + is_772_[8] * anIntArray9065[i_784_] + 8192) >> 14);
								i_785_ += i_777_;
								i_786_ += i_778_;
								i_787_ += i_779_;
								anIntArray9077[i_784_] = i_785_;
								anIntArray9047[i_784_] = i_786_;
								anIntArray9065[i_784_] = i_787_;
							}
						}
					}
				}
			} else {
				for (int i_788_ = 0; i_788_ < i_669_; i_788_++) {
					int i_789_ = is[i_788_];
					if (i_789_ < anIntArrayArray9091.length) {
						int[] is_790_ = anIntArrayArray9091[i_789_];
						for (int i_791_ = 0; i_791_ < is_790_.length; i_791_++) {
							int i_792_ = is_790_[i_791_];
							if (aShortArray9066 == null || (i_667_ & aShortArray9066[i_792_]) != 0) {
								anIntArray9077[i_792_] -= anInt9095;
								anIntArray9047[i_792_] -= anInt9096;
								anIntArray9065[i_792_] -= anInt9097;
								anIntArray9077[i_792_] = anIntArray9077[i_792_] * i_664_ / 128;
								anIntArray9047[i_792_] = anIntArray9047[i_792_] * i_665_ / 128;
								anIntArray9065[i_792_] = anIntArray9065[i_792_] * i_666_ / 128;
								anIntArray9077[i_792_] += anInt9095;
								anIntArray9047[i_792_] += anInt9096;
								anIntArray9065[i_792_] += anInt9097;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9048 != null && aByteArray9086 != null) {
				for (int i_793_ = 0; i_793_ < i_669_; i_793_++) {
					int i_794_ = is[i_793_];
					if (i_794_ < anIntArrayArray9048.length) {
						int[] is_795_ = anIntArrayArray9048[i_794_];
						for (int i_796_ = 0; i_796_ < is_795_.length; i_796_++) {
							int i_797_ = is_795_[i_796_];
							if (aShortArray9078 == null || (i_667_ & aShortArray9078[i_797_]) != 0) {
								int i_798_ = ((aByteArray9086[i_797_] & 0xff) + i_664_ * 8);
								if (i_798_ < 0)
									i_798_ = 0;
								else if (i_798_ > 255)
									i_798_ = 255;
								aByteArray9086[i_797_] = (byte) i_798_;
							}
						}
					}
				}
				if (aClass101Array9102 != null) {
					for (int i_799_ = 0; i_799_ < anInt9101; i_799_++) {
						Class101 class101 = aClass101Array9102[i_799_];
						Class103 class103 = aClass103Array9103[i_799_];
						class103.anInt1258 = (class103.anInt1258 * 330457669 & 0xffffff | 255 - ((aByteArray9086[class101.anInt1241 * -566359109]) & 0xff) << 24) * -1951506291;
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9048 != null) {
				for (int i_800_ = 0; i_800_ < i_669_; i_800_++) {
					int i_801_ = is[i_800_];
					if (i_801_ < anIntArrayArray9048.length) {
						int[] is_802_ = anIntArrayArray9048[i_801_];
						for (int i_803_ = 0; i_803_ < is_802_.length; i_803_++) {
							int i_804_ = is_802_[i_803_];
							if (aShortArray9078 == null || (i_667_ & aShortArray9078[i_804_]) != 0) {
								int i_805_ = aShortArray9088[i_804_] & 0xffff;
								int i_806_ = i_805_ >> 10 & 0x3f;
								int i_807_ = i_805_ >> 7 & 0x7;
								int i_808_ = i_805_ & 0x7f;
								i_806_ = i_806_ + i_664_ & 0x3f;
								i_807_ += i_665_;
								if (i_807_ < 0)
									i_807_ = 0;
								else if (i_807_ > 7)
									i_807_ = 7;
								i_808_ += i_666_;
								if (i_808_ < 0)
									i_808_ = 0;
								else if (i_808_ > 127)
									i_808_ = 127;
								aShortArray9088[i_804_] = (short) (i_806_ << 10 | i_807_ << 7 | i_808_);
							}
						}
						aBool9093 = true;
					}
				}
				if (aClass101Array9102 != null) {
					for (int i_809_ = 0; i_809_ < anInt9101; i_809_++) {
						Class101 class101 = aClass101Array9102[i_809_];
						Class103 class103 = aClass103Array9103[i_809_];
						class103.anInt1258 = (class103.anInt1258 * 330457669 & ~0xffffff | ((Class638.anIntArray8306[Class493.method8085(((aShortArray9088[(class101.anInt1241 * -566359109)]) & 0xffff), 1600848788) & 0xffff]) & 0xffffff)) * -1951506291;
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9104 != null) {
				for (int i_810_ = 0; i_810_ < i_669_; i_810_++) {
					int i_811_ = is[i_810_];
					if (i_811_ < anIntArrayArray9104.length) {
						int[] is_812_ = anIntArrayArray9104[i_811_];
						for (int i_813_ = 0; i_813_ < is_812_.length; i_813_++) {
							Class103 class103 = aClass103Array9103[is_812_[i_813_]];
							class103.anInt1248 += i_664_ * 356391365;
							class103.anInt1251 += i_665_ * 1938564783;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9104 != null) {
				for (int i_814_ = 0; i_814_ < i_669_; i_814_++) {
					int i_815_ = is[i_814_];
					if (i_815_ < anIntArrayArray9104.length) {
						int[] is_816_ = anIntArrayArray9104[i_815_];
						for (int i_817_ = 0; i_817_ < is_816_.length; i_817_++) {
							Class103 class103 = aClass103Array9103[is_816_[i_817_]];
							class103.aFloat1249 = (class103.aFloat1249 * (float) i_664_ / 128.0F);
							class103.aFloat1250 = (class103.aFloat1250 * (float) i_665_ / 128.0F);
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9104 != null) {
				for (int i_818_ = 0; i_818_ < i_669_; i_818_++) {
					int i_819_ = is[i_818_];
					if (i_819_ < anIntArrayArray9104.length) {
						int[] is_820_ = anIntArrayArray9104[i_819_];
						for (int i_821_ = 0; i_821_ < is_820_.length; i_821_++) {
							Class103 class103 = aClass103Array9103[is_820_[i_821_]];
							class103.anInt1253 = (class103.anInt1253 * 212895487 + i_664_ & 0x3fff) * 891189503;
						}
					}
				}
			}
		}
	}

	int method14489(int i) {
		if (i < 2)
			i = 2;
		else if (i > 126)
			i = 126;
		return i;
	}

	int method14490(int i) {
		if (i < 2)
			i = 2;
		else if (i > 126)
			i = 126;
		return i;
	}

	void method14491() {
		if (anInt9084 == 0)
			method14459(false);
		else if (aClass178_Sub3_9049.anInt9819 * 1353126165 > 1) {
			synchronized (this) {
				method14462();
			}
		} else
			method14462();
	}

	public void method2836() {
		if ((anInt9058 & 0x10) != 16)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i = 0; i < anInt9061; i++)
				anIntArray9065[i] = -anIntArray9065[i];
			if (aClass109Array9067 != null) {
				for (int i = 0; i < anInt9062; i++) {
					if (aClass109Array9067[i] != null)
						aClass109Array9067[i].anInt1327 = -aClass109Array9067[i].anInt1327;
				}
			}
			if (aClass109Array9068 != null) {
				for (int i = 0; i < anInt9062; i++) {
					if (aClass109Array9068[i] != null)
						aClass109Array9068[i].anInt1327 = -aClass109Array9068[i].anInt1327;
				}
			}
			if (aClass96Array9083 != null) {
				for (int i = 0; i < anInt9074; i++) {
					if (aClass96Array9083[i] != null)
						aClass96Array9083[i].anInt1183 = -aClass96Array9083[i].anInt1183;
				}
			}
			short[] is = aShortArray9064;
			aShortArray9064 = aShortArray9063;
			aShortArray9063 = is;
			if (aFloatArrayArray9117 != null) {
				for (int i = 0; i < anInt9074; i++) {
					if (aFloatArrayArray9117[i] != null) {
						float f = aFloatArrayArray9117[i][0];
						aFloatArrayArray9117[i][0] = aFloatArrayArray9117[i][2];
						aFloatArrayArray9117[i][2] = f;
					}
					if (aFloatArrayArray9075[i] != null) {
						float f = aFloatArrayArray9075[i][0];
						aFloatArrayArray9075[i][0] = aFloatArrayArray9075[i][2];
						aFloatArrayArray9075[i][2] = f;
					}
				}
			}
			aBool9105 = false;
			anInt9084 = 0;
		}
	}

	void method14492(boolean bool) {
		if (anInt9084 == 1)
			method14503();
		else if (anInt9084 == 2) {
			if ((anInt9058 & 0x97098) == 0 && aFloatArrayArray9117 == null)
				aShortArray9088 = null;
			if (bool)
				aByteArray9073 = null;
		} else {
			method14457();
			int i = aClass178_Sub3_9049.anInt9839 * 1364344413;
			int i_822_ = aClass178_Sub3_9049.anInt9813 * 126842783;
			int i_823_ = aClass178_Sub3_9049.anInt9834 * 1707081643;
			int i_824_ = aClass178_Sub3_9049.anInt9817 * 424272355 >> 8;
			int i_825_ = 0;
			int i_826_ = 0;
			if (anInt9060 != 0) {
				i_825_ = aClass178_Sub3_9049.anInt9831 * 742910208 / anInt9060;
				i_826_ = aClass178_Sub3_9049.anInt9816 * -723498752 / anInt9060;
			}
			if (anIntArray9106 == null) {
				anIntArray9106 = new int[anInt9074];
				anIntArray9079 = new int[anInt9074];
				anIntArray9099 = new int[anInt9074];
			}
			for (int i_827_ = 0; i_827_ < anInt9074; i_827_++) {
				byte i_828_;
				if (aByteArray9073 == null)
					i_828_ = (byte) 0;
				else
					i_828_ = aByteArray9073[i_827_];
				byte i_829_;
				if (aByteArray9086 == null)
					i_829_ = (byte) 0;
				else
					i_829_ = aByteArray9086[i_827_];
				short i_830_;
				if (aShortArray9087 == null)
					i_830_ = (short) -1;
				else
					i_830_ = aShortArray9087[i_827_];
				if (i_829_ == -2)
					i_828_ = (byte) 3;
				if (i_829_ == -1)
					i_828_ = (byte) 2;
				if (i_830_ == -1) {
					if (i_828_ == 0) {
						int i_831_ = aShortArray9088[i_827_] & 0xffff;
						int i_832_ = (i_831_ & 0x7f) * anInt9059 >> 7;
						short i_833_ = Class493.method8085(i_831_ & ~0x7f | i_832_, -1367623486);
						Class109 class109;
						if (aClass109Array9068 != null && (aClass109Array9068[aShortArray9064[i_827_]] != null))
							class109 = aClass109Array9068[aShortArray9064[i_827_]];
						else
							class109 = aClass109Array9067[aShortArray9064[i_827_]];
						int i_834_ = (((i * class109.anInt1326 + i_822_ * class109.anInt1325 + i_823_ * class109.anInt1327) / class109.anInt1328) >> 16);
						int i_835_ = i_834_ > 256 ? i_825_ : i_826_;
						int i_836_ = (i_824_ >> 1) + (i_835_ * i_834_ >> 17);
						anIntArray9106[i_827_] = i_836_ << 17 | Class174.method2935(i_833_, i_836_, 1530418723);
						if (aClass109Array9068 != null && (aClass109Array9068[aShortArray9072[i_827_]] != null))
							class109 = aClass109Array9068[aShortArray9072[i_827_]];
						else
							class109 = aClass109Array9067[aShortArray9072[i_827_]];
						i_834_ = ((i * class109.anInt1326 + i_822_ * class109.anInt1325 + i_823_ * class109.anInt1327) / class109.anInt1328) >> 16;
						i_835_ = i_834_ > 256 ? i_825_ : i_826_;
						i_836_ = (i_824_ >> 1) + (i_835_ * i_834_ >> 17);
						anIntArray9079[i_827_] = i_836_ << 17 | Class174.method2935(i_833_, i_836_, 1530418723);
						if (aClass109Array9068 != null && (aClass109Array9068[aShortArray9063[i_827_]] != null))
							class109 = aClass109Array9068[aShortArray9063[i_827_]];
						else
							class109 = aClass109Array9067[aShortArray9063[i_827_]];
						i_834_ = ((i * class109.anInt1326 + i_822_ * class109.anInt1325 + i_823_ * class109.anInt1327) / class109.anInt1328) >> 16;
						i_835_ = i_834_ > 256 ? i_825_ : i_826_;
						i_836_ = (i_824_ >> 1) + (i_835_ * i_834_ >> 17);
						anIntArray9099[i_827_] = i_836_ << 17 | Class174.method2935(i_833_, i_836_, 1530418723);
					} else if (i_828_ == 1) {
						int i_837_ = aShortArray9088[i_827_] & 0xffff;
						int i_838_ = (i_837_ & 0x7f) * anInt9059 >> 7;
						short i_839_ = Class493.method8085(i_837_ & ~0x7f | i_838_, 155892151);
						Class96 class96 = aClass96Array9083[i_827_];
						int i_840_ = ((i * class96.anInt1181 + i_822_ * class96.anInt1182 + i_823_ * class96.anInt1183) >> 16);
						int i_841_ = i_840_ > 256 ? i_825_ : i_826_;
						int i_842_ = (i_824_ >> 1) + (i_841_ * i_840_ >> 17);
						anIntArray9106[i_827_] = i_842_ << 17 | Class174.method2935(i_839_, i_842_, 1530418723);
						anIntArray9099[i_827_] = -1;
					} else if (i_828_ == 3) {
						anIntArray9106[i_827_] = 128;
						anIntArray9099[i_827_] = -1;
					} else
						anIntArray9099[i_827_] = -2;
				} else {
					int i_843_ = aShortArray9088[i_827_] & 0xffff;
					if (i_828_ == 0) {
						Class109 class109;
						if (aClass109Array9068 != null && (aClass109Array9068[aShortArray9064[i_827_]] != null))
							class109 = aClass109Array9068[aShortArray9064[i_827_]];
						else
							class109 = aClass109Array9067[aShortArray9064[i_827_]];
						int i_844_ = (((i * class109.anInt1326 + i_822_ * class109.anInt1325 + i_823_ * class109.anInt1327) / class109.anInt1328) >> 16);
						int i_845_ = i_844_ > 256 ? i_825_ : i_826_;
						int i_846_ = method14509((i_824_ >> 2) + (i_845_ * i_844_ >> 18));
						anIntArray9106[i_827_] = i_846_ << 24 | method14460(i_843_, i_830_, i_846_);
						if (aClass109Array9068 != null && (aClass109Array9068[aShortArray9072[i_827_]] != null))
							class109 = aClass109Array9068[aShortArray9072[i_827_]];
						else
							class109 = aClass109Array9067[aShortArray9072[i_827_]];
						i_844_ = ((i * class109.anInt1326 + i_822_ * class109.anInt1325 + i_823_ * class109.anInt1327) / class109.anInt1328) >> 16;
						i_845_ = i_844_ > 256 ? i_825_ : i_826_;
						i_846_ = method14509((i_824_ >> 2) + (i_845_ * i_844_ >> 18));
						anIntArray9079[i_827_] = i_846_ << 24 | method14460(i_843_, i_830_, i_846_);
						if (aClass109Array9068 != null && (aClass109Array9068[aShortArray9063[i_827_]] != null))
							class109 = aClass109Array9068[aShortArray9063[i_827_]];
						else
							class109 = aClass109Array9067[aShortArray9063[i_827_]];
						i_844_ = ((i * class109.anInt1326 + i_822_ * class109.anInt1325 + i_823_ * class109.anInt1327) / class109.anInt1328) >> 16;
						i_845_ = i_844_ > 256 ? i_825_ : i_826_;
						i_846_ = method14509((i_824_ >> 2) + (i_845_ * i_844_ >> 18));
						anIntArray9099[i_827_] = i_846_ << 24 | method14460(i_843_, i_830_, i_846_);
					} else if (i_828_ == 1) {
						Class96 class96 = aClass96Array9083[i_827_];
						int i_847_ = ((i * class96.anInt1181 + i_822_ * class96.anInt1182 + i_823_ * class96.anInt1183) >> 16);
						int i_848_ = i_847_ > 256 ? i_825_ : i_826_;
						int i_849_ = method14509((i_824_ >> 2) + (i_848_ * i_847_ >> 18));
						anIntArray9106[i_827_] = i_849_ << 24 | method14460(i_843_, i_830_, i_849_);
						anIntArray9099[i_827_] = -1;
					} else
						anIntArray9099[i_827_] = -2;
				}
			}
			aClass109Array9067 = null;
			aClass109Array9068 = null;
			aClass96Array9083 = null;
			if ((anInt9058 & 0x97098) == 0 && aFloatArrayArray9117 == null)
				aShortArray9088 = null;
			if (bool)
				aByteArray9073 = null;
			anInt9084 = 2;
		}
	}

	void method14493() {
		for (int i = 0; i < anInt9074; i++) {
			short i_850_ = aShortArray9087 != null ? aShortArray9087[i] : (short) -1;
			if (i_850_ == -1) {
				int i_851_ = aShortArray9088[i] & 0xffff;
				int i_852_ = (i_851_ & 0x7f) * anInt9059 >> 7;
				short i_853_ = Class493.method8085(i_851_ & ~0x7f | i_852_, 1019423516);
				if (anIntArray9099[i] == -1) {
					int i_854_ = anIntArray9106[i] & ~0x1ffff;
					anIntArray9106[i] = i_854_ | Class174.method2935(i_853_, i_854_ >> 17, 1530418723);
				} else if (anIntArray9099[i] != -2) {
					int i_855_ = anIntArray9106[i] & ~0x1ffff;
					anIntArray9106[i] = i_855_ | Class174.method2935(i_853_, i_855_ >> 17, 1530418723);
					i_855_ = anIntArray9079[i] & ~0x1ffff;
					anIntArray9079[i] = i_855_ | Class174.method2935(i_853_, i_855_ >> 17, 1530418723);
					i_855_ = anIntArray9099[i] & ~0x1ffff;
					anIntArray9099[i] = i_855_ | Class174.method2935(i_853_, i_855_ >> 17, 1530418723);
				}
			}
		}
		anInt9084 = 2;
	}

	public void method2689(int i, int i_856_, int i_857_) {
		if (i != 0 && (anInt9058 & 0x1) != 1)
			throw new IllegalStateException();
		if (i_856_ != 0 && (anInt9058 & 0x2) != 2)
			throw new IllegalStateException();
		if (i_857_ != 0 && (anInt9058 & 0x4) != 4)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i_858_ = 0; i_858_ < anInt9061; i_858_++) {
				anIntArray9077[i_858_] += i;
				anIntArray9047[i_858_] += i_856_;
				anIntArray9065[i_858_] += i_857_;
			}
		}
	}

	public void method2737(Class167 class167, int i, int i_859_, int i_860_, boolean bool) {
		Class167_Sub1 class167_sub1_861_ = (Class167_Sub1) class167;
		if ((anInt9058 & 0x10000) != 65536)
			throw new IllegalStateException("");
		if ((class167_sub1_861_.anInt9058 & 0x10000) != 65536)
			throw new IllegalStateException("");
		method14529(aClass178_Sub3_9049.method15475(Thread.currentThread()));
		method14478();
		method14457();
		class167_sub1_861_.method14478();
		class167_sub1_861_.method14457();
		anInt9085++;
		int i_862_ = 0;
		int[] is = class167_sub1_861_.anIntArray9077;
		int i_863_ = class167_sub1_861_.anInt9062;
		for (int i_864_ = 0; i_864_ < anInt9062; i_864_++) {
			Class109 class109 = aClass109Array9067[i_864_];
			if (class109.anInt1328 != 0) {
				int i_865_ = anIntArray9047[i_864_] - i_859_;
				if (i_865_ >= class167_sub1_861_.aShort9108 && i_865_ <= class167_sub1_861_.aShort9109) {
					int i_866_ = anIntArray9077[i_864_] - i;
					if (i_866_ >= class167_sub1_861_.aShort9090 && i_866_ <= class167_sub1_861_.aShort9111) {
						int i_867_ = anIntArray9065[i_864_] - i_860_;
						if (i_867_ >= class167_sub1_861_.aShort9112 && i_867_ <= class167_sub1_861_.aShort9113) {
							for (int i_868_ = 0; i_868_ < i_863_; i_868_++) {
								Class109 class109_869_ = (class167_sub1_861_.aClass109Array9067[i_868_]);
								if (i_866_ == is[i_868_] && i_867_ == (class167_sub1_861_.anIntArray9065[i_868_]) && i_865_ == (class167_sub1_861_.anIntArray9047[i_868_]) && class109_869_.anInt1328 != 0) {
									if (aClass109Array9068 == null)
										aClass109Array9068 = new Class109[anInt9062];
									if (class167_sub1_861_.aClass109Array9068 == null)
										class167_sub1_861_.aClass109Array9068 = new Class109[i_863_];
									Class109 class109_870_ = aClass109Array9068[i_864_];
									if (class109_870_ == null)
										class109_870_ = aClass109Array9068[i_864_] = new Class109(class109);
									Class109 class109_871_ = (class167_sub1_861_.aClass109Array9068[i_868_]);
									if (class109_871_ == null)
										class109_871_ = class167_sub1_861_.aClass109Array9068[i_868_] = new Class109(class109_869_);
									class109_870_.anInt1326 += class109_869_.anInt1326;
									class109_870_.anInt1325 += class109_869_.anInt1325;
									class109_870_.anInt1327 += class109_869_.anInt1327;
									class109_870_.anInt1328 += class109_869_.anInt1328;
									class109_871_.anInt1326 += class109.anInt1326;
									class109_871_.anInt1325 += class109.anInt1325;
									class109_871_.anInt1327 += class109.anInt1327;
									class109_871_.anInt1328 += class109.anInt1328;
									i_862_++;
									anIntArray9127[i_864_] = anInt9085;
									anIntArray9053[i_868_] = anInt9085;
								}
							}
						}
					}
				}
			}
		}
		if (i_862_ >= 3 && bool) {
			for (int i_872_ = 0; i_872_ < anInt9074; i_872_++) {
				if (anIntArray9127[aShortArray9064[i_872_]] == anInt9085 && anIntArray9127[aShortArray9072[i_872_]] == anInt9085 && anIntArray9127[aShortArray9063[i_872_]] == anInt9085) {
					if (aByteArray9073 == null)
						aByteArray9073 = new byte[anInt9074];
					aByteArray9073[i_872_] = (byte) 2;
				}
			}
			for (int i_873_ = 0; i_873_ < class167_sub1_861_.anInt9074; i_873_++) {
				if ((anIntArray9053[class167_sub1_861_.aShortArray9064[i_873_]] == anInt9085) && anIntArray9053[(class167_sub1_861_.aShortArray9072[i_873_])] == anInt9085 && anIntArray9053[(class167_sub1_861_.aShortArray9063[i_873_])] == anInt9085) {
					if (class167_sub1_861_.aByteArray9073 == null)
						class167_sub1_861_.aByteArray9073 = new byte[class167_sub1_861_.anInt9074];
					class167_sub1_861_.aByteArray9073[i_873_] = (byte) 2;
				}
			}
		}
	}

	public int method2792() {
		if (!aBool9105)
			method14478();
		return aShort9082;
	}

	void method14494() {
		synchronized (this) {
			for (int i = 0; i < anInt9061; i++) {
				int i_874_ = anIntArray9065[i];
				anIntArray9065[i] = anIntArray9077[i];
				anIntArray9077[i] = -i_874_;
			}
			method14469();
		}
	}

	void method14495() {
		if (anInt9084 == 0 && aClass109Array9067 == null) {
			if (aClass178_Sub3_9049.anInt9819 * 1353126165 > 1) {
				synchronized (this) {
					method14458();
				}
			} else
				method14458();
		}
	}

	public void method2764(int i, int i_875_, Class142 class142, Class142 class142_876_, int i_877_, int i_878_, int i_879_) {
		if (i == 3) {
			if ((anInt9058 & 0x7) != 7)
				throw new IllegalStateException();
		} else if ((anInt9058 & 0x2) != 2)
			throw new IllegalStateException();
		if (!aBool9105)
			method14478();
		int i_880_ = i_877_ + aShort9090;
		int i_881_ = i_877_ + aShort9111;
		int i_882_ = i_879_ + aShort9112;
		int i_883_ = i_879_ + aShort9113;
		if (i == 4 || (i_880_ >= 0 && ((i_881_ + class142.anInt1682 * 341909049 >> class142.anInt1680 * -1193058675) < class142.anInt1683 * 692304099) && i_882_ >= 0 && ((i_883_ + class142.anInt1682 * 341909049 >> class142.anInt1680 * -1193058675) < class142.anInt1681 * 452998539))) {
			int[][] is = class142.anIntArrayArray1684;
			int[][] is_884_ = null;
			if (class142_876_ != null)
				is_884_ = class142_876_.anIntArrayArray1684;
			if (i == 4 || i == 5) {
				if (class142_876_ == null || (i_880_ < 0 || ((i_881_ + class142_876_.anInt1682 * 341909049 >> class142_876_.anInt1680 * -1193058675) >= class142_876_.anInt1683 * 692304099) || i_882_ < 0 || ((i_883_ + class142_876_.anInt1682 * 341909049 >> class142_876_.anInt1680 * -1193058675) >= class142_876_.anInt1681 * 452998539)))
					return;
			} else {
				i_880_ >>= class142.anInt1680 * -1193058675;
				i_881_ = (i_881_ + (class142.anInt1682 * 341909049 - 1) >> class142.anInt1680 * -1193058675);
				i_882_ >>= class142.anInt1680 * -1193058675;
				i_883_ = (i_883_ + (class142.anInt1682 * 341909049 - 1) >> class142.anInt1680 * -1193058675);
				if (is[i_880_][i_882_] == i_878_ && is[i_881_][i_882_] == i_878_ && is[i_880_][i_883_] == i_878_ && is[i_881_][i_883_] == i_878_)
					return;
			}
			synchronized (this) {
				if (i == 1) {
					int i_885_ = class142.anInt1682 * 341909049 - 1;
					for (int i_886_ = 0; i_886_ < anInt9062; i_886_++) {
						int i_887_ = anIntArray9077[i_886_] + i_877_;
						int i_888_ = anIntArray9065[i_886_] + i_879_;
						int i_889_ = i_887_ & i_885_;
						int i_890_ = i_888_ & i_885_;
						int i_891_ = i_887_ >> class142.anInt1680 * -1193058675;
						int i_892_ = i_888_ >> class142.anInt1680 * -1193058675;
						int i_893_ = (((is[i_891_][i_892_] * (class142.anInt1682 * 341909049 - i_889_)) + is[i_891_ + 1][i_892_] * i_889_) >> class142.anInt1680 * -1193058675);
						int i_894_ = (((is[i_891_][i_892_ + 1] * (class142.anInt1682 * 341909049 - i_889_)) + is[i_891_ + 1][i_892_ + 1] * i_889_) >> class142.anInt1680 * -1193058675);
						int i_895_ = (i_893_ * (class142.anInt1682 * 341909049 - i_890_) + i_894_ * i_890_ >> class142.anInt1680 * -1193058675);
						anIntArray9047[i_886_] = anIntArray9047[i_886_] + i_895_ - i_878_;
					}
					for (int i_896_ = anInt9062; i_896_ < anInt9061; i_896_++) {
						int i_897_ = anIntArray9077[i_896_] + i_877_;
						int i_898_ = anIntArray9065[i_896_] + i_879_;
						int i_899_ = i_897_ & i_885_;
						int i_900_ = i_898_ & i_885_;
						int i_901_ = i_897_ >> class142.anInt1680 * -1193058675;
						int i_902_ = i_898_ >> class142.anInt1680 * -1193058675;
						if (i_901_ >= 0 && i_901_ < is.length - 1 && i_902_ >= 0 && i_902_ < is[0].length - 1) {
							int i_903_ = (((is[i_901_][i_902_] * (class142.anInt1682 * 341909049 - i_899_)) + is[i_901_ + 1][i_902_] * i_899_) >> class142.anInt1680 * -1193058675);
							int i_904_ = (((is[i_901_][i_902_ + 1] * (class142.anInt1682 * 341909049 - i_899_)) + is[i_901_ + 1][i_902_ + 1] * i_899_) >> class142.anInt1680 * -1193058675);
							int i_905_ = (i_903_ * (class142.anInt1682 * 341909049 - i_900_) + i_904_ * i_900_ >> class142.anInt1680 * -1193058675);
							anIntArray9047[i_896_] = anIntArray9047[i_896_] + i_905_ - i_878_;
						}
					}
				} else if (i == 2) {
					if (aShort9108 == 0)
						return;
					int i_906_ = class142.anInt1682 * 341909049 - 1;
					for (int i_907_ = 0; i_907_ < anInt9062; i_907_++) {
						int i_908_ = (anIntArray9047[i_907_] << 16) / aShort9108;
						if (i_908_ < i_875_) {
							int i_909_ = anIntArray9077[i_907_] + i_877_;
							int i_910_ = anIntArray9065[i_907_] + i_879_;
							int i_911_ = i_909_ & i_906_;
							int i_912_ = i_910_ & i_906_;
							int i_913_ = i_909_ >> class142.anInt1680 * -1193058675;
							int i_914_ = i_910_ >> class142.anInt1680 * -1193058675;
							int i_915_ = (((is[i_913_][i_914_] * (class142.anInt1682 * 341909049 - i_911_)) + is[i_913_ + 1][i_914_] * i_911_) >> class142.anInt1680 * -1193058675);
							int i_916_ = (((is[i_913_][i_914_ + 1] * (class142.anInt1682 * 341909049 - i_911_)) + is[i_913_ + 1][i_914_ + 1] * i_911_) >> class142.anInt1680 * -1193058675);
							int i_917_ = (i_915_ * (class142.anInt1682 * 341909049 - i_912_) + i_916_ * i_912_ >> class142.anInt1680 * -1193058675);
							anIntArray9047[i_907_] = anIntArray9047[i_907_] + ((i_917_ - i_878_) * (i_875_ - i_908_) / i_875_);
						} else
							anIntArray9047[i_907_] = anIntArray9047[i_907_];
					}
					for (int i_918_ = anInt9062; i_918_ < anInt9061; i_918_++) {
						int i_919_ = (anIntArray9047[i_918_] << 16) / aShort9108;
						if (i_919_ < i_875_) {
							int i_920_ = anIntArray9077[i_918_] + i_877_;
							int i_921_ = anIntArray9065[i_918_] + i_879_;
							int i_922_ = i_920_ & i_906_;
							int i_923_ = i_921_ & i_906_;
							int i_924_ = i_920_ >> class142.anInt1680 * -1193058675;
							int i_925_ = i_921_ >> class142.anInt1680 * -1193058675;
							if (i_924_ >= 0 && i_924_ < class142.anInt1683 * 692304099 - 1 && i_925_ >= 0 && (i_925_ < class142.anInt1681 * 452998539 - 1)) {
								int i_926_ = (((is[i_924_][i_925_] * (class142.anInt1682 * 341909049 - i_922_)) + is[i_924_ + 1][i_925_] * i_922_) >> class142.anInt1680 * -1193058675);
								int i_927_ = (((is[i_924_][i_925_ + 1] * (class142.anInt1682 * 341909049 - i_922_)) + is[i_924_ + 1][i_925_ + 1] * i_922_) >> class142.anInt1680 * -1193058675);
								int i_928_ = (i_926_ * (class142.anInt1682 * 341909049 - i_923_) + i_927_ * i_923_ >> class142.anInt1680 * -1193058675);
								anIntArray9047[i_918_] = (anIntArray9047[i_918_] + ((i_928_ - i_878_) * (i_875_ - i_919_) / i_875_));
							}
						} else
							anIntArray9047[i_918_] = anIntArray9047[i_918_];
					}
				} else if (i == 3) {
					int i_929_ = (i_875_ & 0xff) * 16;
					int i_930_ = (i_875_ >> 8 & 0xff) * 16;
					int i_931_ = (i_875_ >> 16 & 0xff) << 6;
					int i_932_ = (i_875_ >> 24 & 0xff) << 6;
					if (i_877_ - (i_929_ >> 1) < 0 || ((i_877_ + (i_929_ >> 1) + class142.anInt1682 * 341909049) >= (class142.anInt1683 * 692304099 << class142.anInt1680 * -1193058675)) || i_879_ - (i_930_ >> 1) < 0 || ((i_879_ + (i_930_ >> 1) + class142.anInt1682 * 341909049) >= (class142.anInt1681 * 452998539 << class142.anInt1680 * -1193058675)))
						return;
					method2693(class142, i_877_, i_878_, i_879_, i_929_, i_930_, i_931_, i_932_);
				} else if (i == 4) {
					int i_933_ = class142_876_.anInt1682 * 341909049 - 1;
					int i_934_ = aShort9109 - aShort9108;
					for (int i_935_ = 0; i_935_ < anInt9062; i_935_++) {
						int i_936_ = anIntArray9077[i_935_] + i_877_;
						int i_937_ = anIntArray9065[i_935_] + i_879_;
						int i_938_ = i_936_ & i_933_;
						int i_939_ = i_937_ & i_933_;
						int i_940_ = i_936_ >> class142_876_.anInt1680 * -1193058675;
						int i_941_ = i_937_ >> class142_876_.anInt1680 * -1193058675;
						int i_942_ = (((is_884_[i_940_][i_941_] * (class142_876_.anInt1682 * 341909049 - i_938_)) + is_884_[i_940_ + 1][i_941_] * i_938_) >> class142_876_.anInt1680 * -1193058675);
						int i_943_ = (((is_884_[i_940_][i_941_ + 1] * (class142_876_.anInt1682 * 341909049 - i_938_)) + is_884_[i_940_ + 1][i_941_ + 1] * i_938_) >> class142_876_.anInt1680 * -1193058675);
						int i_944_ = (i_942_ * (class142_876_.anInt1682 * 341909049 - i_939_) + i_943_ * i_939_ >> class142_876_.anInt1680 * -1193058675);
						anIntArray9047[i_935_] = (anIntArray9047[i_935_] + (i_944_ - i_878_) + i_934_);
					}
					for (int i_945_ = anInt9062; i_945_ < anInt9061; i_945_++) {
						int i_946_ = anIntArray9077[i_945_] + i_877_;
						int i_947_ = anIntArray9065[i_945_] + i_879_;
						int i_948_ = i_946_ & i_933_;
						int i_949_ = i_947_ & i_933_;
						int i_950_ = i_946_ >> class142_876_.anInt1680 * -1193058675;
						int i_951_ = i_947_ >> class142_876_.anInt1680 * -1193058675;
						if (i_950_ >= 0 && i_950_ < class142_876_.anInt1683 * 692304099 - 1 && i_951_ >= 0 && (i_951_ < class142_876_.anInt1681 * 452998539 - 1)) {
							int i_952_ = (((is_884_[i_950_][i_951_] * (class142_876_.anInt1682 * 341909049 - i_948_)) + is_884_[i_950_ + 1][i_951_] * i_948_) >> class142_876_.anInt1680 * -1193058675);
							int i_953_ = (((is_884_[i_950_][i_951_ + 1] * (class142_876_.anInt1682 * 341909049 - i_948_)) + is_884_[i_950_ + 1][i_951_ + 1] * i_948_) >> class142_876_.anInt1680 * -1193058675);
							int i_954_ = ((i_952_ * (class142_876_.anInt1682 * 341909049 - i_949_)) + i_953_ * i_949_ >> class142_876_.anInt1680 * -1193058675);
							anIntArray9047[i_945_] = (anIntArray9047[i_945_] + (i_954_ - i_878_) + i_934_);
						}
					}
				} else if (i == 5) {
					int i_955_ = class142_876_.anInt1682 * 341909049 - 1;
					int i_956_ = aShort9109 - aShort9108;
					for (int i_957_ = 0; i_957_ < anInt9062; i_957_++) {
						int i_958_ = anIntArray9077[i_957_] + i_877_;
						int i_959_ = anIntArray9065[i_957_] + i_879_;
						int i_960_ = i_958_ & i_955_;
						int i_961_ = i_959_ & i_955_;
						int i_962_ = i_958_ >> class142.anInt1680 * -1193058675;
						int i_963_ = i_959_ >> class142.anInt1680 * -1193058675;
						int i_964_ = (((is[i_962_][i_963_] * (class142.anInt1682 * 341909049 - i_960_)) + is[i_962_ + 1][i_963_] * i_960_) >> class142.anInt1680 * -1193058675);
						int i_965_ = (((is[i_962_][i_963_ + 1] * (class142.anInt1682 * 341909049 - i_960_)) + is[i_962_ + 1][i_963_ + 1] * i_960_) >> class142.anInt1680 * -1193058675);
						int i_966_ = (i_964_ * (class142.anInt1682 * 341909049 - i_961_) + i_965_ * i_961_ >> class142.anInt1680 * -1193058675);
						i_964_ = (((is_884_[i_962_][i_963_] * (class142_876_.anInt1682 * 341909049 - i_960_)) + is_884_[i_962_ + 1][i_963_] * i_960_) >> class142_876_.anInt1680 * -1193058675);
						i_965_ = (((is_884_[i_962_][i_963_ + 1] * (class142_876_.anInt1682 * 341909049 - i_960_)) + is_884_[i_962_ + 1][i_963_ + 1] * i_960_) >> class142_876_.anInt1680 * -1193058675);
						int i_967_ = (i_964_ * (class142_876_.anInt1682 * 341909049 - i_961_) + i_965_ * i_961_ >> class142_876_.anInt1680 * -1193058675);
						int i_968_ = i_966_ - i_967_ - i_875_;
						anIntArray9047[i_957_] = ((anIntArray9047[i_957_] << 8) / i_956_ * i_968_ >> 8) - (i_878_ - i_966_);
					}
					for (int i_969_ = anInt9062; i_969_ < anInt9061; i_969_++) {
						int i_970_ = anIntArray9077[i_969_] + i_877_;
						int i_971_ = anIntArray9065[i_969_] + i_879_;
						int i_972_ = i_970_ & i_955_;
						int i_973_ = i_971_ & i_955_;
						int i_974_ = i_970_ >> class142.anInt1680 * -1193058675;
						int i_975_ = i_971_ >> class142.anInt1680 * -1193058675;
						if (i_974_ >= 0 && i_974_ < class142.anInt1683 * 692304099 - 1 && i_974_ < class142_876_.anInt1683 * 692304099 - 1 && i_975_ >= 0 && i_975_ < class142.anInt1681 * 452998539 - 1 && (i_975_ < class142_876_.anInt1681 * 452998539 - 1)) {
							int i_976_ = (((is[i_974_][i_975_] * (class142.anInt1682 * 341909049 - i_972_)) + is[i_974_ + 1][i_975_] * i_972_) >> class142.anInt1680 * -1193058675);
							int i_977_ = (((is[i_974_][i_975_ + 1] * (class142.anInt1682 * 341909049 - i_972_)) + is[i_974_ + 1][i_975_ + 1] * i_972_) >> class142.anInt1680 * -1193058675);
							int i_978_ = (i_976_ * (class142.anInt1682 * 341909049 - i_973_) + i_977_ * i_973_ >> class142.anInt1680 * -1193058675);
							i_976_ = (((is_884_[i_974_][i_975_] * (class142_876_.anInt1682 * 341909049 - i_972_)) + is_884_[i_974_ + 1][i_975_] * i_972_) >> class142_876_.anInt1680 * -1193058675);
							i_977_ = (((is_884_[i_974_][i_975_ + 1] * (class142_876_.anInt1682 * 341909049 - i_972_)) + is_884_[i_974_ + 1][i_975_ + 1] * i_972_) >> class142_876_.anInt1680 * -1193058675);
							int i_979_ = ((i_976_ * (class142_876_.anInt1682 * 341909049 - i_973_)) + i_977_ * i_973_ >> class142_876_.anInt1680 * -1193058675);
							int i_980_ = i_978_ - i_979_ - i_875_;
							anIntArray9047[i_969_] = (((anIntArray9047[i_969_] << 8) / i_956_ * i_980_) >> 8) - (i_878_ - i_978_);
						}
					}
				}
				aBool9105 = false;
			}
		}
	}

	Class167 method14496(Class167_Sub1 class167_sub1_981_, Class167_Sub1 class167_sub1_982_, int i, boolean bool, boolean bool_983_) {
		class167_sub1_981_.aBool9105 = aBool9105;
		if (aBool9105) {
			class167_sub1_981_.aShort9111 = aShort9111;
			class167_sub1_981_.aShort9109 = aShort9109;
			class167_sub1_981_.aShort9113 = aShort9113;
			class167_sub1_981_.aShort9090 = aShort9090;
			class167_sub1_981_.aShort9108 = aShort9108;
			class167_sub1_981_.aShort9112 = aShort9112;
			class167_sub1_981_.aShort9082 = aShort9082;
			class167_sub1_981_.aShort9107 = aShort9107;
		}
		if (aBool9114) {
			class167_sub1_981_.aShort9115 = aShort9115;
			class167_sub1_981_.aBool9114 = true;
		} else
			class167_sub1_981_.aBool9114 = false;
		class167_sub1_981_.anInt9059 = anInt9059;
		class167_sub1_981_.anInt9060 = anInt9060;
		class167_sub1_981_.anInt9061 = anInt9061;
		class167_sub1_981_.anInt9062 = anInt9062;
		class167_sub1_981_.anInt9074 = anInt9074;
		class167_sub1_981_.anInt9101 = anInt9101;
		class167_sub1_981_.anInt9070 = anInt9070;
		if ((i & 0x100) != 0)
			class167_sub1_981_.aBool9128 = true;
		else
			class167_sub1_981_.aBool9128 = aBool9128;
		class167_sub1_981_.aBool9092 = aBool9092;
		boolean bool_984_ = (i & 0x7) == 7 | (i & 0x20) != 0;
		boolean bool_985_ = bool_984_ || (i & 0x1) != 0;
		boolean bool_986_ = bool_984_ || (i & 0x2) != 0;
		boolean bool_987_ = bool_984_ || (i & 0x4) != 0 || (i & 0x10) != 0;
		if (bool_985_ || bool_986_ || bool_987_) {
			if (bool_985_) {
				if (class167_sub1_982_.anIntArray9077 == null || class167_sub1_982_.anIntArray9077.length < anInt9061)
					class167_sub1_981_.anIntArray9077 = class167_sub1_982_.anIntArray9077 = new int[anInt9061];
				else
					class167_sub1_981_.anIntArray9077 = class167_sub1_982_.anIntArray9077;
				for (int i_988_ = 0; i_988_ < anInt9061; i_988_++)
					class167_sub1_981_.anIntArray9077[i_988_] = anIntArray9077[i_988_];
			} else
				class167_sub1_981_.anIntArray9077 = anIntArray9077;
			if (bool_986_) {
				if (class167_sub1_982_.anIntArray9047 == null || class167_sub1_982_.anIntArray9047.length < anInt9061)
					class167_sub1_981_.anIntArray9047 = class167_sub1_982_.anIntArray9047 = new int[anInt9061];
				else
					class167_sub1_981_.anIntArray9047 = class167_sub1_982_.anIntArray9047;
				for (int i_989_ = 0; i_989_ < anInt9061; i_989_++)
					class167_sub1_981_.anIntArray9047[i_989_] = anIntArray9047[i_989_];
			} else
				class167_sub1_981_.anIntArray9047 = anIntArray9047;
			if (bool_987_) {
				if (class167_sub1_982_.anIntArray9065 == null || class167_sub1_982_.anIntArray9065.length < anInt9061)
					class167_sub1_981_.anIntArray9065 = class167_sub1_982_.anIntArray9065 = new int[anInt9061];
				else
					class167_sub1_981_.anIntArray9065 = class167_sub1_982_.anIntArray9065;
				for (int i_990_ = 0; i_990_ < anInt9061; i_990_++)
					class167_sub1_981_.anIntArray9065[i_990_] = anIntArray9065[i_990_];
			} else
				class167_sub1_981_.anIntArray9065 = anIntArray9065;
		} else {
			class167_sub1_981_.anIntArray9077 = anIntArray9077;
			class167_sub1_981_.anIntArray9047 = anIntArray9047;
			class167_sub1_981_.anIntArray9065 = anIntArray9065;
		}
		if ((i & 0x84080) != 0) {
			if (class167_sub1_982_.aShortArray9088 == null || class167_sub1_982_.aShortArray9088.length < anInt9074) {
				int i_991_ = anInt9074;
				class167_sub1_981_.aShortArray9088 = class167_sub1_982_.aShortArray9088 = new short[i_991_];
			} else
				class167_sub1_981_.aShortArray9088 = class167_sub1_982_.aShortArray9088;
			for (int i_992_ = 0; i_992_ < anInt9074; i_992_++)
				class167_sub1_981_.aShortArray9088[i_992_] = aShortArray9088[i_992_];
		} else
			class167_sub1_981_.aShortArray9088 = aShortArray9088;
		if ((i & 0x97018) != 0) {
			class167_sub1_981_.anInt9084 = 0;
			Class167_Sub1 class167_sub1_993_ = class167_sub1_981_;
			Class167_Sub1 class167_sub1_994_ = class167_sub1_981_;
			class167_sub1_981_.anIntArray9099 = null;
			class167_sub1_994_.anIntArray9079 = null;
			class167_sub1_993_.anIntArray9106 = null;
		} else if ((i & 0x80) != 0) {
			if (bool_983_)
				method14459(false);
			if (anIntArray9106 != null) {
				if (class167_sub1_982_.anIntArray9106 == null || class167_sub1_982_.anIntArray9106.length < anInt9074) {
					int i_995_ = anInt9074;
					class167_sub1_981_.anIntArray9106 = class167_sub1_982_.anIntArray9106 = new int[i_995_];
					class167_sub1_981_.anIntArray9079 = class167_sub1_982_.anIntArray9079 = new int[i_995_];
					class167_sub1_981_.anIntArray9099 = class167_sub1_982_.anIntArray9099 = new int[i_995_];
				} else {
					class167_sub1_981_.anIntArray9106 = class167_sub1_982_.anIntArray9106;
					class167_sub1_981_.anIntArray9079 = class167_sub1_982_.anIntArray9079;
					class167_sub1_981_.anIntArray9099 = class167_sub1_982_.anIntArray9099;
				}
				for (int i_996_ = 0; i_996_ < anInt9074; i_996_++) {
					class167_sub1_981_.anIntArray9106[i_996_] = anIntArray9106[i_996_];
					class167_sub1_981_.anIntArray9079[i_996_] = anIntArray9079[i_996_];
					class167_sub1_981_.anIntArray9099[i_996_] = anIntArray9099[i_996_];
				}
			}
			class167_sub1_981_.anInt9084 = anInt9084;
		} else {
			if (bool_983_)
				method14459(false);
			class167_sub1_981_.anIntArray9106 = anIntArray9106;
			class167_sub1_981_.anIntArray9079 = anIntArray9079;
			class167_sub1_981_.anIntArray9099 = anIntArray9099;
			class167_sub1_981_.anInt9084 = anInt9084;
		}
		if ((i & 0x100) != 0) {
			if (class167_sub1_982_.aByteArray9086 == null || class167_sub1_982_.aByteArray9086.length < anInt9074) {
				int i_997_ = anInt9074;
				class167_sub1_981_.aByteArray9086 = class167_sub1_982_.aByteArray9086 = new byte[i_997_];
			} else
				class167_sub1_981_.aByteArray9086 = class167_sub1_982_.aByteArray9086;
			if (aByteArray9086 != null) {
				for (int i_998_ = 0; i_998_ < anInt9074; i_998_++)
					class167_sub1_981_.aByteArray9086[i_998_] = aByteArray9086[i_998_];
			} else {
				for (int i_999_ = 0; i_999_ < anInt9074; i_999_++)
					class167_sub1_981_.aByteArray9086[i_999_] = (byte) 0;
			}
		} else
			class167_sub1_981_.aByteArray9086 = aByteArray9086;
		if ((i & 0x8) != 0 || (i & 0x10) != 0) {
			if (class167_sub1_982_.aClass109Array9067 == null || class167_sub1_982_.aClass109Array9067.length < anInt9062) {
				int i_1000_ = anInt9062;
				class167_sub1_981_.aClass109Array9067 = class167_sub1_982_.aClass109Array9067 = new Class109[i_1000_];
			} else
				class167_sub1_981_.aClass109Array9067 = class167_sub1_982_.aClass109Array9067;
			if (aClass109Array9067 != null) {
				for (int i_1001_ = 0; i_1001_ < anInt9062; i_1001_++)
					class167_sub1_981_.aClass109Array9067[i_1001_] = new Class109(aClass109Array9067[i_1001_]);
			} else
				class167_sub1_981_.aClass109Array9067 = null;
			if (aClass96Array9083 != null) {
				if (class167_sub1_982_.aClass96Array9083 == null || (class167_sub1_982_.aClass96Array9083.length < anInt9074)) {
					int i_1002_ = anInt9074;
					class167_sub1_981_.aClass96Array9083 = class167_sub1_982_.aClass96Array9083 = new Class96[i_1002_];
				} else
					class167_sub1_981_.aClass96Array9083 = class167_sub1_982_.aClass96Array9083;
				for (int i_1003_ = 0; i_1003_ < anInt9074; i_1003_++)
					class167_sub1_981_.aClass96Array9083[i_1003_] = (aClass96Array9083[i_1003_] != null ? new Class96(aClass96Array9083[i_1003_]) : null);
			} else
				class167_sub1_981_.aClass96Array9083 = null;
		} else {
			if (bool_983_)
				method14457();
			class167_sub1_981_.aClass109Array9067 = aClass109Array9067;
			class167_sub1_981_.aClass96Array9083 = aClass96Array9083;
		}
		if ((i & 0x8000) != 0) {
			if (aShortArray9087 == null)
				class167_sub1_981_.aShortArray9087 = null;
			else {
				if (class167_sub1_982_.aShortArray9087 == null || class167_sub1_982_.aShortArray9087.length < anInt9074) {
					int i_1004_ = anInt9074;
					class167_sub1_981_.aShortArray9087 = class167_sub1_982_.aShortArray9087 = new short[i_1004_];
				} else
					class167_sub1_981_.aShortArray9087 = class167_sub1_982_.aShortArray9087;
				for (int i_1005_ = 0; i_1005_ < anInt9074; i_1005_++)
					class167_sub1_981_.aShortArray9087[i_1005_] = aShortArray9087[i_1005_];
			}
		} else
			class167_sub1_981_.aShortArray9087 = aShortArray9087;
		if ((i & 0x10000) != 0) {
			if (aByteArray9073 == null)
				class167_sub1_981_.aByteArray9073 = null;
			else {
				if (class167_sub1_982_.aByteArray9073 == null || class167_sub1_982_.aByteArray9073.length < anInt9074) {
					int i_1006_ = bool ? anInt9074 + 100 : anInt9074;
					class167_sub1_981_.aByteArray9073 = class167_sub1_982_.aByteArray9073 = new byte[i_1006_];
				} else
					class167_sub1_981_.aByteArray9073 = class167_sub1_982_.aByteArray9073;
				for (int i_1007_ = 0; i_1007_ < anInt9074; i_1007_++)
					class167_sub1_981_.aByteArray9073[i_1007_] = aByteArray9073[i_1007_];
			}
		} else
			class167_sub1_981_.aByteArray9073 = aByteArray9073;
		if ((i & 0xc580) != 0) {
			if (class167_sub1_982_.aClass103Array9103 == null || class167_sub1_982_.aClass103Array9103.length < anInt9101) {
				int i_1008_ = anInt9101;
				class167_sub1_981_.aClass103Array9103 = class167_sub1_982_.aClass103Array9103 = new Class103[i_1008_];
				for (int i_1009_ = 0; i_1009_ < anInt9101; i_1009_++)
					class167_sub1_981_.aClass103Array9103[i_1009_] = aClass103Array9103[i_1009_].method1805(762582058);
			} else {
				class167_sub1_981_.aClass103Array9103 = class167_sub1_982_.aClass103Array9103;
				for (int i_1010_ = 0; i_1010_ < anInt9101; i_1010_++)
					class167_sub1_981_.aClass103Array9103[i_1010_].method1806(aClass103Array9103[i_1010_], -2134508738);
			}
		} else
			class167_sub1_981_.aClass103Array9103 = aClass103Array9103;
		if (aFloatArrayArray9117 != null && (i & 0x10) != 0) {
			if (class167_sub1_982_.aFloatArrayArray9117 == null || (class167_sub1_982_.aFloatArrayArray9117.length < anInt9074)) {
				int i_1011_ = bool ? anInt9074 + 100 : anInt9074;
				class167_sub1_981_.aFloatArrayArray9117 = class167_sub1_982_.aFloatArrayArray9117 = new float[i_1011_][3];
			} else
				class167_sub1_981_.aFloatArrayArray9117 = class167_sub1_982_.aFloatArrayArray9117;
			for (int i_1012_ = 0; i_1012_ < anInt9074; i_1012_++) {
				if (aFloatArrayArray9117[i_1012_] != null) {
					class167_sub1_981_.aFloatArrayArray9117[i_1012_][0] = aFloatArrayArray9117[i_1012_][0];
					class167_sub1_981_.aFloatArrayArray9117[i_1012_][1] = aFloatArrayArray9117[i_1012_][1];
					class167_sub1_981_.aFloatArrayArray9117[i_1012_][2] = aFloatArrayArray9117[i_1012_][2];
				}
			}
			if (class167_sub1_982_.aFloatArrayArray9075 == null || (class167_sub1_982_.aFloatArrayArray9075.length < anInt9074)) {
				int i_1013_ = bool ? anInt9074 + 100 : anInt9074;
				class167_sub1_981_.aFloatArrayArray9075 = class167_sub1_982_.aFloatArrayArray9075 = new float[i_1013_][3];
			} else
				class167_sub1_981_.aFloatArrayArray9075 = class167_sub1_982_.aFloatArrayArray9075;
			for (int i_1014_ = 0; i_1014_ < anInt9074; i_1014_++) {
				if (aFloatArrayArray9075[i_1014_] != null) {
					class167_sub1_981_.aFloatArrayArray9075[i_1014_][0] = aFloatArrayArray9075[i_1014_][0];
					class167_sub1_981_.aFloatArrayArray9075[i_1014_][1] = aFloatArrayArray9075[i_1014_][1];
					class167_sub1_981_.aFloatArrayArray9075[i_1014_][2] = aFloatArrayArray9075[i_1014_][2];
				}
			}
		} else {
			class167_sub1_981_.aFloatArrayArray9117 = aFloatArrayArray9117;
			class167_sub1_981_.aFloatArrayArray9075 = aFloatArrayArray9075;
		}
		class167_sub1_981_.anIntArrayArray9091 = anIntArrayArray9091;
		class167_sub1_981_.anIntArrayArray9048 = anIntArrayArray9048;
		class167_sub1_981_.anIntArrayArray9104 = anIntArrayArray9104;
		class167_sub1_981_.aShortArray9066 = aShortArray9066;
		class167_sub1_981_.aShortArray9078 = aShortArray9078;
		class167_sub1_981_.aByteArray9130 = aByteArray9130;
		class167_sub1_981_.aShortArray9064 = aShortArray9064;
		class167_sub1_981_.aShortArray9072 = aShortArray9072;
		class167_sub1_981_.aShortArray9063 = aShortArray9063;
		class167_sub1_981_.aClass184Array9089 = aClass184Array9089;
		class167_sub1_981_.aClass143Array9100 = aClass143Array9100;
		class167_sub1_981_.aClass101Array9102 = aClass101Array9102;
		class167_sub1_981_.aShortArray9116 = aShortArray9116;
		class167_sub1_981_.anInt9058 = i;
		return class167_sub1_981_;
	}

	void method14497() {
		for (int i = 0; i < anInt9074; i++) {
			short i_1015_ = aShortArray9087 != null ? aShortArray9087[i] : (short) -1;
			if (i_1015_ == -1) {
				int i_1016_ = aShortArray9088[i] & 0xffff;
				int i_1017_ = (i_1016_ & 0x7f) * anInt9059 >> 7;
				short i_1018_ = Class493.method8085(i_1016_ & ~0x7f | i_1017_, 1812446848);
				if (anIntArray9099[i] == -1) {
					int i_1019_ = anIntArray9106[i] & ~0x1ffff;
					anIntArray9106[i] = i_1019_ | Class174.method2935(i_1018_, i_1019_ >> 17, 1530418723);
				} else if (anIntArray9099[i] != -2) {
					int i_1020_ = anIntArray9106[i] & ~0x1ffff;
					anIntArray9106[i] = i_1020_ | Class174.method2935(i_1018_, i_1020_ >> 17, 1530418723);
					i_1020_ = anIntArray9079[i] & ~0x1ffff;
					anIntArray9079[i] = i_1020_ | Class174.method2935(i_1018_, i_1020_ >> 17, 1530418723);
					i_1020_ = anIntArray9099[i] & ~0x1ffff;
					anIntArray9099[i] = i_1020_ | Class174.method2935(i_1018_, i_1020_ >> 17, 1530418723);
				}
			}
		}
		anInt9084 = 2;
	}

	public int method2742() {
		return anInt9058;
	}

	public int method2743() {
		return anInt9058;
	}

	void method2842() {
		if (aClass178_Sub3_9049.anInt9819 * 1353126165 > 1) {
			synchronized (this) {
				while (aBool1796) {
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBool1796 = true;
			}
		}
	}

	public void method2745(int i) {
		if (aClass178_Sub3_9049.anInt9819 * 1353126165 > 1) {
			synchronized (this) {
				if ((anInt9058 & 0x10000) == 65536 && (i & 0x10000) == 0)
					method14459(true);
				anInt9058 = i;
			}
		} else {
			if ((anInt9058 & 0x10000) == 65536 && (i & 0x10000) == 0)
				method14459(true);
			anInt9058 = i;
		}
	}

	public void method2824() {
		/* empty */
	}

	public void method2761(int i) {
		if ((anInt9058 & 0x5) != 5)
			throw new IllegalStateException();
		if (i == 4096)
			method14464();
		else if (i == 8192)
			method14465();
		else if (i == 12288)
			method14466();
		else {
			int i_1021_ = Class433.anIntArray4880[i];
			int i_1022_ = Class433.anIntArray4881[i];
			synchronized (this) {
				for (int i_1023_ = 0; i_1023_ < anInt9061; i_1023_++) {
					int i_1024_ = ((anIntArray9065[i_1023_] * i_1021_ + anIntArray9077[i_1023_] * i_1022_) >> 14);
					anIntArray9065[i_1023_] = (anIntArray9065[i_1023_] * i_1022_ - anIntArray9077[i_1023_] * i_1021_) >> 14;
					anIntArray9077[i_1023_] = i_1024_;
				}
				method14469();
			}
		}
	}

	public void method2687() {
		if (!aBool9114) {
			if (!aBool9105)
				method14478();
			aShort9115 = aShort9108;
			aBool9114 = true;
		}
	}

	public void method2749(int i) {
		if ((anInt9058 & 0xd) != 13)
			throw new IllegalStateException();
		if (aClass109Array9067 != null) {
			if (i == 4096)
				method14467();
			else if (i == 8192)
				method14468();
			else if (i == 12288)
				method14501();
			else {
				int i_1025_ = Class433.anIntArray4880[i];
				int i_1026_ = Class433.anIntArray4881[i];
				synchronized (this) {
					for (int i_1027_ = 0; i_1027_ < anInt9062; i_1027_++) {
						int i_1028_ = ((anIntArray9065[i_1027_] * i_1025_ + anIntArray9077[i_1027_] * i_1026_) >> 14);
						anIntArray9065[i_1027_] = (anIntArray9065[i_1027_] * i_1026_ - anIntArray9077[i_1027_] * i_1025_) >> 14;
						anIntArray9077[i_1027_] = i_1028_;
						if (aClass109Array9067[i_1027_] != null) {
							i_1028_ = ((aClass109Array9067[i_1027_].anInt1327 * i_1025_) + (aClass109Array9067[i_1027_].anInt1326 * i_1026_)) >> 14;
							aClass109Array9067[i_1027_].anInt1327 = ((aClass109Array9067[i_1027_].anInt1327 * i_1026_) - (aClass109Array9067[i_1027_].anInt1326 * i_1025_)) >> 14;
							aClass109Array9067[i_1027_].anInt1326 = i_1028_;
						}
					}
					if (aClass96Array9083 != null) {
						for (int i_1029_ = 0; i_1029_ < anInt9074; i_1029_++) {
							if (aClass96Array9083[i_1029_] != null) {
								int i_1030_ = (((aClass96Array9083[i_1029_].anInt1183 * i_1025_) + (aClass96Array9083[i_1029_].anInt1181 * i_1026_)) >> 14);
								aClass96Array9083[i_1029_].anInt1183 = ((aClass96Array9083[i_1029_].anInt1183 * i_1026_) - (aClass96Array9083[i_1029_].anInt1181 * i_1025_)) >> 14;
								aClass96Array9083[i_1029_].anInt1181 = i_1030_;
							}
						}
					}
					for (int i_1031_ = anInt9062; i_1031_ < anInt9061; i_1031_++) {
						int i_1032_ = ((anIntArray9065[i_1031_] * i_1025_ + anIntArray9077[i_1031_] * i_1026_) >> 14);
						anIntArray9065[i_1031_] = (anIntArray9065[i_1031_] * i_1026_ - anIntArray9077[i_1031_] * i_1025_) >> 14;
						anIntArray9077[i_1031_] = i_1032_;
					}
					anInt9084 = 0;
					aBool9105 = false;
				}
			}
		} else
			method2685(i);
	}

	public void method2750(int i) {
		if ((anInt9058 & 0xd) != 13)
			throw new IllegalStateException();
		if (aClass109Array9067 != null) {
			if (i == 4096)
				method14467();
			else if (i == 8192)
				method14468();
			else if (i == 12288)
				method14501();
			else {
				int i_1033_ = Class433.anIntArray4880[i];
				int i_1034_ = Class433.anIntArray4881[i];
				synchronized (this) {
					for (int i_1035_ = 0; i_1035_ < anInt9062; i_1035_++) {
						int i_1036_ = ((anIntArray9065[i_1035_] * i_1033_ + anIntArray9077[i_1035_] * i_1034_) >> 14);
						anIntArray9065[i_1035_] = (anIntArray9065[i_1035_] * i_1034_ - anIntArray9077[i_1035_] * i_1033_) >> 14;
						anIntArray9077[i_1035_] = i_1036_;
						if (aClass109Array9067[i_1035_] != null) {
							i_1036_ = ((aClass109Array9067[i_1035_].anInt1327 * i_1033_) + (aClass109Array9067[i_1035_].anInt1326 * i_1034_)) >> 14;
							aClass109Array9067[i_1035_].anInt1327 = ((aClass109Array9067[i_1035_].anInt1327 * i_1034_) - (aClass109Array9067[i_1035_].anInt1326 * i_1033_)) >> 14;
							aClass109Array9067[i_1035_].anInt1326 = i_1036_;
						}
					}
					if (aClass96Array9083 != null) {
						for (int i_1037_ = 0; i_1037_ < anInt9074; i_1037_++) {
							if (aClass96Array9083[i_1037_] != null) {
								int i_1038_ = (((aClass96Array9083[i_1037_].anInt1183 * i_1033_) + (aClass96Array9083[i_1037_].anInt1181 * i_1034_)) >> 14);
								aClass96Array9083[i_1037_].anInt1183 = ((aClass96Array9083[i_1037_].anInt1183 * i_1034_) - (aClass96Array9083[i_1037_].anInt1181 * i_1033_)) >> 14;
								aClass96Array9083[i_1037_].anInt1181 = i_1038_;
							}
						}
					}
					for (int i_1039_ = anInt9062; i_1039_ < anInt9061; i_1039_++) {
						int i_1040_ = ((anIntArray9065[i_1039_] * i_1033_ + anIntArray9077[i_1039_] * i_1034_) >> 14);
						anIntArray9065[i_1039_] = (anIntArray9065[i_1039_] * i_1034_ - anIntArray9077[i_1039_] * i_1033_) >> 14;
						anIntArray9077[i_1039_] = i_1040_;
					}
					anInt9084 = 0;
					aBool9105 = false;
				}
			}
		} else
			method2685(i);
	}

	public int method2773() {
		if (!aBool9105)
			method14478();
		return aShort9082;
	}

	void method14498() {
		synchronized (this) {
			for (int i = 0; i < anInt9061; i++) {
				anIntArray9077[i] = -anIntArray9077[i];
				anIntArray9065[i] = -anIntArray9065[i];
			}
			method14469();
		}
	}

	void method14499() {
		synchronized (this) {
			for (int i = 0; i < anInt9061; i++) {
				int i_1041_ = anIntArray9065[i];
				anIntArray9065[i] = anIntArray9077[i];
				anIntArray9077[i] = -i_1041_;
			}
			method14469();
		}
	}

	void method14500() {
		synchronized (this) {
			for (int i = 0; i < anInt9061; i++) {
				int i_1042_ = anIntArray9065[i];
				anIntArray9065[i] = anIntArray9077[i];
				anIntArray9077[i] = -i_1042_;
			}
			method14469();
		}
	}

	void method14501() {
		synchronized (this) {
			for (int i = 0; i < anInt9062; i++) {
				int i_1043_ = anIntArray9065[i];
				anIntArray9065[i] = anIntArray9077[i];
				anIntArray9077[i] = -i_1043_;
				if (aClass109Array9067[i] != null) {
					i_1043_ = aClass109Array9067[i].anInt1327;
					aClass109Array9067[i].anInt1327 = aClass109Array9067[i].anInt1326;
					aClass109Array9067[i].anInt1326 = -i_1043_;
				}
			}
			if (aClass96Array9083 != null) {
				for (int i = 0; i < anInt9074; i++) {
					if (aClass96Array9083[i] != null) {
						int i_1044_ = aClass96Array9083[i].anInt1183;
						aClass96Array9083[i].anInt1183 = aClass96Array9083[i].anInt1181;
						aClass96Array9083[i].anInt1181 = -i_1044_;
					}
				}
			}
			for (int i = anInt9062; i < anInt9061; i++) {
				int i_1045_ = anIntArray9065[i];
				anIntArray9065[i] = anIntArray9077[i];
				anIntArray9077[i] = -i_1045_;
			}
			anInt9084 = 0;
			aBool9105 = false;
		}
	}

	void method14502() {
		aClass109Array9067 = new Class109[anInt9062];
		for (int i = 0; i < anInt9062; i++)
			aClass109Array9067[i] = new Class109();
		for (int i = 0; i < anInt9074; i++) {
			short i_1046_ = aShortArray9064[i];
			short i_1047_ = aShortArray9072[i];
			short i_1048_ = aShortArray9063[i];
			int i_1049_ = anIntArray9077[i_1047_] - anIntArray9077[i_1046_];
			int i_1050_ = anIntArray9047[i_1047_] - anIntArray9047[i_1046_];
			int i_1051_ = anIntArray9065[i_1047_] - anIntArray9065[i_1046_];
			int i_1052_ = anIntArray9077[i_1048_] - anIntArray9077[i_1046_];
			int i_1053_ = anIntArray9047[i_1048_] - anIntArray9047[i_1046_];
			int i_1054_ = anIntArray9065[i_1048_] - anIntArray9065[i_1046_];
			int i_1055_ = i_1050_ * i_1054_ - i_1053_ * i_1051_;
			int i_1056_ = i_1051_ * i_1052_ - i_1054_ * i_1049_;
			int i_1057_;
			for (i_1057_ = i_1049_ * i_1053_ - i_1052_ * i_1050_; (i_1055_ > 8192 || i_1056_ > 8192 || i_1057_ > 8192 || i_1055_ < -8192 || i_1056_ < -8192 || i_1057_ < -8192); i_1057_ >>= 1) {
				i_1055_ >>= 1;
				i_1056_ >>= 1;
			}
			int i_1058_ = (int) Math.sqrt((double) (i_1055_ * i_1055_ + i_1056_ * i_1056_ + i_1057_ * i_1057_));
			if (i_1058_ <= 0)
				i_1058_ = 1;
			i_1055_ = i_1055_ * 256 / i_1058_;
			i_1056_ = i_1056_ * 256 / i_1058_;
			i_1057_ = i_1057_ * 256 / i_1058_;
			byte i_1059_;
			if (aByteArray9073 == null)
				i_1059_ = (byte) 0;
			else
				i_1059_ = aByteArray9073[i];
			if (i_1059_ == 0) {
				Class109 class109 = aClass109Array9067[i_1046_];
				class109.anInt1326 += i_1055_;
				class109.anInt1325 += i_1056_;
				class109.anInt1327 += i_1057_;
				class109.anInt1328++;
				class109 = aClass109Array9067[i_1047_];
				class109.anInt1326 += i_1055_;
				class109.anInt1325 += i_1056_;
				class109.anInt1327 += i_1057_;
				class109.anInt1328++;
				class109 = aClass109Array9067[i_1048_];
				class109.anInt1326 += i_1055_;
				class109.anInt1325 += i_1056_;
				class109.anInt1327 += i_1057_;
				class109.anInt1328++;
			} else if (i_1059_ == 1) {
				if (aClass96Array9083 == null)
					aClass96Array9083 = new Class96[anInt9074];
				Class96 class96 = aClass96Array9083[i] = new Class96();
				class96.anInt1181 = i_1055_;
				class96.anInt1182 = i_1056_;
				class96.anInt1183 = i_1057_;
			}
		}
	}

	void method14503() {
		if (anInt9084 == 0)
			method14459(false);
		else if (aClass178_Sub3_9049.anInt9819 * 1353126165 > 1) {
			synchronized (this) {
				method14462();
			}
		} else
			method14462();
	}

	void method14504() {
		synchronized (this) {
			for (int i = 0; i < anInt9062; i++) {
				int i_1060_ = anIntArray9077[i];
				anIntArray9077[i] = anIntArray9065[i];
				anIntArray9065[i] = -i_1060_;
				if (aClass109Array9067[i] != null) {
					i_1060_ = aClass109Array9067[i].anInt1326;
					aClass109Array9067[i].anInt1326 = aClass109Array9067[i].anInt1327;
					aClass109Array9067[i].anInt1327 = -i_1060_;
				}
			}
			if (aClass96Array9083 != null) {
				for (int i = 0; i < anInt9074; i++) {
					if (aClass96Array9083[i] != null) {
						int i_1061_ = aClass96Array9083[i].anInt1181;
						aClass96Array9083[i].anInt1181 = aClass96Array9083[i].anInt1183;
						aClass96Array9083[i].anInt1183 = -i_1061_;
					}
				}
			}
			for (int i = anInt9062; i < anInt9061; i++) {
				int i_1062_ = anIntArray9077[i];
				anIntArray9077[i] = anIntArray9065[i];
				anIntArray9065[i] = -i_1062_;
			}
			anInt9084 = 0;
			aBool9105 = false;
		}
	}

	void method2767() {
		if (aClass178_Sub3_9049.anInt9819 * 1353126165 > 1) {
			synchronized (this) {
				aBool1796 = false;
				this.notifyAll();
			}
		}
	}

	void method14505() {
		synchronized (this) {
			for (int i = 0; i < anInt9062; i++) {
				int i_1063_ = anIntArray9077[i];
				anIntArray9077[i] = anIntArray9065[i];
				anIntArray9065[i] = -i_1063_;
				if (aClass109Array9067[i] != null) {
					i_1063_ = aClass109Array9067[i].anInt1326;
					aClass109Array9067[i].anInt1326 = aClass109Array9067[i].anInt1327;
					aClass109Array9067[i].anInt1327 = -i_1063_;
				}
			}
			if (aClass96Array9083 != null) {
				for (int i = 0; i < anInt9074; i++) {
					if (aClass96Array9083[i] != null) {
						int i_1064_ = aClass96Array9083[i].anInt1181;
						aClass96Array9083[i].anInt1181 = aClass96Array9083[i].anInt1183;
						aClass96Array9083[i].anInt1183 = -i_1064_;
					}
				}
			}
			for (int i = anInt9062; i < anInt9061; i++) {
				int i_1065_ = anIntArray9077[i];
				anIntArray9077[i] = anIntArray9065[i];
				anIntArray9065[i] = -i_1065_;
			}
			anInt9084 = 0;
			aBool9105 = false;
		}
	}

	void method14506() {
		synchronized (this) {
			for (int i = 0; i < anInt9062; i++) {
				anIntArray9077[i] = -anIntArray9077[i];
				anIntArray9065[i] = -anIntArray9065[i];
				if (aClass109Array9067[i] != null) {
					aClass109Array9067[i].anInt1326 = -aClass109Array9067[i].anInt1326;
					aClass109Array9067[i].anInt1327 = -aClass109Array9067[i].anInt1327;
				}
			}
			if (aClass96Array9083 != null) {
				for (int i = 0; i < anInt9074; i++) {
					if (aClass96Array9083[i] != null) {
						aClass96Array9083[i].anInt1181 = -aClass96Array9083[i].anInt1181;
						aClass96Array9083[i].anInt1183 = -aClass96Array9083[i].anInt1183;
					}
				}
			}
			for (int i = anInt9062; i < anInt9061; i++) {
				anIntArray9077[i] = -anIntArray9077[i];
				anIntArray9065[i] = -anIntArray9065[i];
			}
			anInt9084 = 0;
			aBool9105 = false;
		}
	}

	public void method2805(Class167 class167, int i, int i_1066_, int i_1067_, boolean bool) {
		Class167_Sub1 class167_sub1_1068_ = (Class167_Sub1) class167;
		if ((anInt9058 & 0x10000) != 65536)
			throw new IllegalStateException("");
		if ((class167_sub1_1068_.anInt9058 & 0x10000) != 65536)
			throw new IllegalStateException("");
		method14529(aClass178_Sub3_9049.method15475(Thread.currentThread()));
		method14478();
		method14457();
		class167_sub1_1068_.method14478();
		class167_sub1_1068_.method14457();
		anInt9085++;
		int i_1069_ = 0;
		int[] is = class167_sub1_1068_.anIntArray9077;
		int i_1070_ = class167_sub1_1068_.anInt9062;
		for (int i_1071_ = 0; i_1071_ < anInt9062; i_1071_++) {
			Class109 class109 = aClass109Array9067[i_1071_];
			if (class109.anInt1328 != 0) {
				int i_1072_ = anIntArray9047[i_1071_] - i_1066_;
				if (i_1072_ >= class167_sub1_1068_.aShort9108 && i_1072_ <= class167_sub1_1068_.aShort9109) {
					int i_1073_ = anIntArray9077[i_1071_] - i;
					if (i_1073_ >= class167_sub1_1068_.aShort9090 && i_1073_ <= class167_sub1_1068_.aShort9111) {
						int i_1074_ = anIntArray9065[i_1071_] - i_1067_;
						if (i_1074_ >= class167_sub1_1068_.aShort9112 && i_1074_ <= class167_sub1_1068_.aShort9113) {
							for (int i_1075_ = 0; i_1075_ < i_1070_; i_1075_++) {
								Class109 class109_1076_ = (class167_sub1_1068_.aClass109Array9067[i_1075_]);
								if (i_1073_ == is[i_1075_] && i_1074_ == (class167_sub1_1068_.anIntArray9065[i_1075_]) && i_1072_ == (class167_sub1_1068_.anIntArray9047[i_1075_]) && class109_1076_.anInt1328 != 0) {
									if (aClass109Array9068 == null)
										aClass109Array9068 = new Class109[anInt9062];
									if (class167_sub1_1068_.aClass109Array9068 == null)
										class167_sub1_1068_.aClass109Array9068 = new Class109[i_1070_];
									Class109 class109_1077_ = aClass109Array9068[i_1071_];
									if (class109_1077_ == null)
										class109_1077_ = aClass109Array9068[i_1071_] = new Class109(class109);
									Class109 class109_1078_ = (class167_sub1_1068_.aClass109Array9068[i_1075_]);
									if (class109_1078_ == null)
										class109_1078_ = class167_sub1_1068_.aClass109Array9068[i_1075_] = new Class109(class109_1076_);
									class109_1077_.anInt1326 += class109_1076_.anInt1326;
									class109_1077_.anInt1325 += class109_1076_.anInt1325;
									class109_1077_.anInt1327 += class109_1076_.anInt1327;
									class109_1077_.anInt1328 += class109_1076_.anInt1328;
									class109_1078_.anInt1326 += class109.anInt1326;
									class109_1078_.anInt1325 += class109.anInt1325;
									class109_1078_.anInt1327 += class109.anInt1327;
									class109_1078_.anInt1328 += class109.anInt1328;
									i_1069_++;
									anIntArray9127[i_1071_] = anInt9085;
									anIntArray9053[i_1075_] = anInt9085;
								}
							}
						}
					}
				}
			}
		}
		if (i_1069_ >= 3 && bool) {
			for (int i_1079_ = 0; i_1079_ < anInt9074; i_1079_++) {
				if (anIntArray9127[aShortArray9064[i_1079_]] == anInt9085 && anIntArray9127[aShortArray9072[i_1079_]] == anInt9085 && anIntArray9127[aShortArray9063[i_1079_]] == anInt9085) {
					if (aByteArray9073 == null)
						aByteArray9073 = new byte[anInt9074];
					aByteArray9073[i_1079_] = (byte) 2;
				}
			}
			for (int i_1080_ = 0; i_1080_ < class167_sub1_1068_.anInt9074; i_1080_++) {
				if (anIntArray9053[(class167_sub1_1068_.aShortArray9064[i_1080_])] == anInt9085 && anIntArray9053[(class167_sub1_1068_.aShortArray9072[i_1080_])] == anInt9085 && anIntArray9053[(class167_sub1_1068_.aShortArray9063[i_1080_])] == anInt9085) {
					if (class167_sub1_1068_.aByteArray9073 == null)
						class167_sub1_1068_.aByteArray9073 = new byte[class167_sub1_1068_.anInt9074];
					class167_sub1_1068_.aByteArray9073[i_1080_] = (byte) 2;
				}
			}
		}
	}

	void method14507() {
		synchronized (this) {
			for (int i = 0; i < anInt9062; i++) {
				int i_1081_ = anIntArray9065[i];
				anIntArray9065[i] = anIntArray9077[i];
				anIntArray9077[i] = -i_1081_;
				if (aClass109Array9067[i] != null) {
					i_1081_ = aClass109Array9067[i].anInt1327;
					aClass109Array9067[i].anInt1327 = aClass109Array9067[i].anInt1326;
					aClass109Array9067[i].anInt1326 = -i_1081_;
				}
			}
			if (aClass96Array9083 != null) {
				for (int i = 0; i < anInt9074; i++) {
					if (aClass96Array9083[i] != null) {
						int i_1082_ = aClass96Array9083[i].anInt1183;
						aClass96Array9083[i].anInt1183 = aClass96Array9083[i].anInt1181;
						aClass96Array9083[i].anInt1181 = -i_1082_;
					}
				}
			}
			for (int i = anInt9062; i < anInt9061; i++) {
				int i_1083_ = anIntArray9065[i];
				anIntArray9065[i] = anIntArray9077[i];
				anIntArray9077[i] = -i_1083_;
			}
			anInt9084 = 0;
			aBool9105 = false;
		}
	}

	public void method2751(int i) {
		if ((anInt9058 & 0x6) != 6)
			throw new IllegalStateException();
		int i_1084_ = Class433.anIntArray4880[i];
		int i_1085_ = Class433.anIntArray4881[i];
		synchronized (this) {
			for (int i_1086_ = 0; i_1086_ < anInt9061; i_1086_++) {
				int i_1087_ = ((anIntArray9047[i_1086_] * i_1085_ - anIntArray9065[i_1086_] * i_1084_) >> 14);
				anIntArray9065[i_1086_] = (anIntArray9047[i_1086_] * i_1084_ + anIntArray9065[i_1086_] * i_1085_) >> 14;
				anIntArray9047[i_1086_] = i_1087_;
			}
			method14469();
		}
	}

	public void method2724(int i) {
		if ((anInt9058 & 0x6) != 6)
			throw new IllegalStateException();
		int i_1088_ = Class433.anIntArray4880[i];
		int i_1089_ = Class433.anIntArray4881[i];
		synchronized (this) {
			for (int i_1090_ = 0; i_1090_ < anInt9061; i_1090_++) {
				int i_1091_ = ((anIntArray9047[i_1090_] * i_1089_ - anIntArray9065[i_1090_] * i_1088_) >> 14);
				anIntArray9065[i_1090_] = (anIntArray9047[i_1090_] * i_1088_ + anIntArray9065[i_1090_] * i_1089_) >> 14;
				anIntArray9047[i_1090_] = i_1091_;
			}
			method14469();
		}
	}

	public void method2753(int i) {
		if ((anInt9058 & 0x6) != 6)
			throw new IllegalStateException();
		int i_1092_ = Class433.anIntArray4880[i];
		int i_1093_ = Class433.anIntArray4881[i];
		synchronized (this) {
			for (int i_1094_ = 0; i_1094_ < anInt9061; i_1094_++) {
				int i_1095_ = ((anIntArray9047[i_1094_] * i_1093_ - anIntArray9065[i_1094_] * i_1092_) >> 14);
				anIntArray9065[i_1094_] = (anIntArray9047[i_1094_] * i_1092_ + anIntArray9065[i_1094_] * i_1093_) >> 14;
				anIntArray9047[i_1094_] = i_1095_;
			}
			method14469();
		}
	}

	public void method2769(int i) {
		if (aClass178_Sub3_9049.anInt9819 * 1353126165 > 1) {
			synchronized (this) {
				if ((anInt9058 & 0x10000) == 65536 && (i & 0x10000) == 0)
					method14459(true);
				anInt9058 = i;
			}
		} else {
			if ((anInt9058 & 0x10000) == 65536 && (i & 0x10000) == 0)
				method14459(true);
			anInt9058 = i;
		}
	}

	public void method2682(int i) {
		if ((anInt9058 & 0x3) != 3)
			throw new IllegalStateException();
		int i_1096_ = Class433.anIntArray4880[i];
		int i_1097_ = Class433.anIntArray4881[i];
		synchronized (this) {
			for (int i_1098_ = 0; i_1098_ < anInt9061; i_1098_++) {
				int i_1099_ = ((anIntArray9047[i_1098_] * i_1096_ + anIntArray9077[i_1098_] * i_1097_) >> 14);
				anIntArray9047[i_1098_] = (anIntArray9047[i_1098_] * i_1097_ - anIntArray9077[i_1098_] * i_1096_) >> 14;
				anIntArray9077[i_1098_] = i_1099_;
			}
			method14469();
		}
	}

	public void method2756() {
		if ((anInt9058 & 0x10) != 16)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i = 0; i < anInt9061; i++)
				anIntArray9065[i] = -anIntArray9065[i];
			if (aClass109Array9067 != null) {
				for (int i = 0; i < anInt9062; i++) {
					if (aClass109Array9067[i] != null)
						aClass109Array9067[i].anInt1327 = -aClass109Array9067[i].anInt1327;
				}
			}
			if (aClass109Array9068 != null) {
				for (int i = 0; i < anInt9062; i++) {
					if (aClass109Array9068[i] != null)
						aClass109Array9068[i].anInt1327 = -aClass109Array9068[i].anInt1327;
				}
			}
			if (aClass96Array9083 != null) {
				for (int i = 0; i < anInt9074; i++) {
					if (aClass96Array9083[i] != null)
						aClass96Array9083[i].anInt1183 = -aClass96Array9083[i].anInt1183;
				}
			}
			short[] is = aShortArray9064;
			aShortArray9064 = aShortArray9063;
			aShortArray9063 = is;
			if (aFloatArrayArray9117 != null) {
				for (int i = 0; i < anInt9074; i++) {
					if (aFloatArrayArray9117[i] != null) {
						float f = aFloatArrayArray9117[i][0];
						aFloatArrayArray9117[i][0] = aFloatArrayArray9117[i][2];
						aFloatArrayArray9117[i][2] = f;
					}
					if (aFloatArrayArray9075[i] != null) {
						float f = aFloatArrayArray9075[i][0];
						aFloatArrayArray9075[i][0] = aFloatArrayArray9075[i][2];
						aFloatArrayArray9075[i][2] = f;
					}
				}
			}
			aBool9105 = false;
			anInt9084 = 0;
		}
	}

	public void method2740() {
		if ((anInt9058 & 0x10) != 16)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i = 0; i < anInt9061; i++)
				anIntArray9065[i] = -anIntArray9065[i];
			if (aClass109Array9067 != null) {
				for (int i = 0; i < anInt9062; i++) {
					if (aClass109Array9067[i] != null)
						aClass109Array9067[i].anInt1327 = -aClass109Array9067[i].anInt1327;
				}
			}
			if (aClass109Array9068 != null) {
				for (int i = 0; i < anInt9062; i++) {
					if (aClass109Array9068[i] != null)
						aClass109Array9068[i].anInt1327 = -aClass109Array9068[i].anInt1327;
				}
			}
			if (aClass96Array9083 != null) {
				for (int i = 0; i < anInt9074; i++) {
					if (aClass96Array9083[i] != null)
						aClass96Array9083[i].anInt1183 = -aClass96Array9083[i].anInt1183;
				}
			}
			short[] is = aShortArray9064;
			aShortArray9064 = aShortArray9063;
			aShortArray9063 = is;
			if (aFloatArrayArray9117 != null) {
				for (int i = 0; i < anInt9074; i++) {
					if (aFloatArrayArray9117[i] != null) {
						float f = aFloatArrayArray9117[i][0];
						aFloatArrayArray9117[i][0] = aFloatArrayArray9117[i][2];
						aFloatArrayArray9117[i][2] = f;
					}
					if (aFloatArrayArray9075[i] != null) {
						float f = aFloatArrayArray9075[i][0];
						aFloatArrayArray9075[i][0] = aFloatArrayArray9075[i][2];
						aFloatArrayArray9075[i][2] = f;
					}
				}
			}
			aBool9105 = false;
			anInt9084 = 0;
		}
	}

	public void method2748(int i) {
		if ((anInt9058 & 0x5) != 5)
			throw new IllegalStateException();
		if (i == 4096)
			method14464();
		else if (i == 8192)
			method14465();
		else if (i == 12288)
			method14466();
		else {
			int i_1100_ = Class433.anIntArray4880[i];
			int i_1101_ = Class433.anIntArray4881[i];
			synchronized (this) {
				for (int i_1102_ = 0; i_1102_ < anInt9061; i_1102_++) {
					int i_1103_ = ((anIntArray9065[i_1102_] * i_1100_ + anIntArray9077[i_1102_] * i_1101_) >> 14);
					anIntArray9065[i_1102_] = (anIntArray9065[i_1102_] * i_1101_ - anIntArray9077[i_1102_] * i_1100_) >> 14;
					anIntArray9077[i_1102_] = i_1103_;
				}
				method14469();
			}
		}
	}

	Class167_Sub1(Class178_Sub3 class178_sub3) {
		anInt9070 = 0;
		anInt9084 = 0;
		aBool9094 = false;
		aBool9098 = false;
		aBool9105 = false;
		aBool9114 = false;
		aBool9128 = false;
		aBool9092 = false;
		aClass178_Sub3_9049 = class178_sub3;
	}

	public void method2760(int i, int i_1104_, int i_1105_) {
		if (i != 128 && (anInt9058 & 0x1) != 1)
			throw new IllegalStateException();
		if (i_1104_ != 128 && (anInt9058 & 0x2) != 2)
			throw new IllegalStateException();
		if (i_1105_ != 128 && (anInt9058 & 0x4) != 4)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i_1106_ = 0; i_1106_ < anInt9061; i_1106_++) {
				anIntArray9077[i_1106_] = anIntArray9077[i_1106_] * i >> 7;
				anIntArray9047[i_1106_] = anIntArray9047[i_1106_] * i_1104_ >> 7;
				anIntArray9065[i_1106_] = anIntArray9065[i_1106_] * i_1105_ >> 7;
			}
			aBool9105 = false;
		}
	}

	final void method14508(boolean bool, boolean bool_1107_, boolean bool_1108_, int i) {
		short i_1109_ = aShortArray9064[i];
		short i_1110_ = aShortArray9072[i];
		short i_1111_ = aShortArray9063[i];
		boolean bool_1112_ = false;
		if (aShortArray9087 != null && aShortArray9087[i] != -1)
			bool_1112_ = (aClass178_Sub3_9049.aClass172_1916.method2895(aShortArray9087[i] & 0xffff, 257651993).aBool1881);
		if (!bool_1112_) {
			if (aByteArray9086 == null)
				aClass118_9118.anInt1438 = 0;
			else
				aClass118_9118.anInt1438 = aByteArray9086[i] & 0xff;
			if (anIntArray9099[i] == -1)
				aClass118_9118.method2037(bool, bool_1107_, bool_1108_, aFloatArray9121[i_1109_], aFloatArray9121[i_1110_], aFloatArray9121[i_1111_], aFloatArray9120[i_1109_], aFloatArray9120[i_1110_], aFloatArray9120[i_1111_], aFloatArray9122[i_1109_], aFloatArray9122[i_1110_], aFloatArray9122[i_1111_], Class638.anIntArray8306[anIntArray9106[i] & 0xffff]);
			else
				aClass118_9118.method2033(bool, bool_1107_, bool_1108_, aFloatArray9121[i_1109_], aFloatArray9121[i_1110_], aFloatArray9121[i_1111_], aFloatArray9120[i_1109_], aFloatArray9120[i_1110_], aFloatArray9120[i_1111_], aFloatArray9122[i_1109_], aFloatArray9122[i_1110_], aFloatArray9122[i_1111_], (float) (anIntArray9106[i] & 0xffff), (float) (anIntArray9079[i] & 0xffff), (float) (anIntArray9099[i] & 0xffff));
		} else {
			int i_1113_ = -16777216;
			if (aByteArray9086 != null)
				i_1113_ = 255 - (aByteArray9086[i] & 0xff) << 24;
			if (anIntArray9099[i] == -1) {
				int i_1114_ = i_1113_ | anIntArray9106[i] & 0xffffff;
				aClass118_9118.method2053(bool, bool_1107_, bool_1108_, aFloatArray9121[i_1109_], aFloatArray9121[i_1110_], aFloatArray9121[i_1111_], aFloatArray9120[i_1109_], aFloatArray9120[i_1110_], aFloatArray9120[i_1111_], aFloatArray9122[i_1109_], aFloatArray9122[i_1110_], aFloatArray9122[i_1111_], aFloatArray9123[i_1109_], aFloatArray9123[i_1110_], aFloatArray9123[i_1111_], aFloatArrayArray9117[i][0], aFloatArrayArray9117[i][1], aFloatArrayArray9117[i][2], aFloatArrayArray9075[i][0], aFloatArrayArray9075[i][1], aFloatArrayArray9075[i][2], i_1114_, i_1114_, i_1114_, aClass99_9069.anInt1192 * 340278173, 0.0F, 0.0F, 0.0F, aShortArray9087[i] & 0xffff);
			} else
				aClass118_9118.method2053(bool, bool_1107_, bool_1108_, aFloatArray9121[i_1109_], aFloatArray9121[i_1110_], aFloatArray9121[i_1111_], aFloatArray9120[i_1109_], aFloatArray9120[i_1110_], aFloatArray9120[i_1111_], aFloatArray9122[i_1109_], aFloatArray9122[i_1110_], aFloatArray9122[i_1111_], aFloatArray9123[i_1109_], aFloatArray9123[i_1110_], aFloatArray9123[i_1111_], aFloatArrayArray9117[i][0], aFloatArrayArray9117[i][1], aFloatArrayArray9117[i][2], aFloatArrayArray9075[i][0], aFloatArrayArray9075[i][1], aFloatArrayArray9075[i][2], i_1113_ | anIntArray9106[i] & 0xffffff, i_1113_ | anIntArray9079[i] & 0xffffff, i_1113_ | anIntArray9099[i] & 0xffffff, aClass99_9069.anInt1192 * 340278173, 0.0F, 0.0F, 0.0F, aShortArray9087[i] & 0xffff);
		}
	}

	public void method2762(int i, int i_1115_, Class142 class142, Class142 class142_1116_, int i_1117_, int i_1118_, int i_1119_) {
		if (i == 3) {
			if ((anInt9058 & 0x7) != 7)
				throw new IllegalStateException();
		} else if ((anInt9058 & 0x2) != 2)
			throw new IllegalStateException();
		if (!aBool9105)
			method14478();
		int i_1120_ = i_1117_ + aShort9090;
		int i_1121_ = i_1117_ + aShort9111;
		int i_1122_ = i_1119_ + aShort9112;
		int i_1123_ = i_1119_ + aShort9113;
		if (i == 4 || (i_1120_ >= 0 && ((i_1121_ + class142.anInt1682 * 341909049 >> class142.anInt1680 * -1193058675) < class142.anInt1683 * 692304099) && i_1122_ >= 0 && ((i_1123_ + class142.anInt1682 * 341909049 >> class142.anInt1680 * -1193058675) < class142.anInt1681 * 452998539))) {
			int[][] is = class142.anIntArrayArray1684;
			int[][] is_1124_ = null;
			if (class142_1116_ != null)
				is_1124_ = class142_1116_.anIntArrayArray1684;
			if (i == 4 || i == 5) {
				if (class142_1116_ == null || (i_1120_ < 0 || ((i_1121_ + class142_1116_.anInt1682 * 341909049 >> class142_1116_.anInt1680 * -1193058675) >= class142_1116_.anInt1683 * 692304099) || i_1122_ < 0 || ((i_1123_ + class142_1116_.anInt1682 * 341909049 >> class142_1116_.anInt1680 * -1193058675) >= class142_1116_.anInt1681 * 452998539)))
					return;
			} else {
				i_1120_ >>= class142.anInt1680 * -1193058675;
				i_1121_ = (i_1121_ + (class142.anInt1682 * 341909049 - 1) >> class142.anInt1680 * -1193058675);
				i_1122_ >>= class142.anInt1680 * -1193058675;
				i_1123_ = (i_1123_ + (class142.anInt1682 * 341909049 - 1) >> class142.anInt1680 * -1193058675);
				if (is[i_1120_][i_1122_] == i_1118_ && is[i_1121_][i_1122_] == i_1118_ && is[i_1120_][i_1123_] == i_1118_ && is[i_1121_][i_1123_] == i_1118_)
					return;
			}
			synchronized (this) {
				if (i == 1) {
					int i_1125_ = class142.anInt1682 * 341909049 - 1;
					for (int i_1126_ = 0; i_1126_ < anInt9062; i_1126_++) {
						int i_1127_ = anIntArray9077[i_1126_] + i_1117_;
						int i_1128_ = anIntArray9065[i_1126_] + i_1119_;
						int i_1129_ = i_1127_ & i_1125_;
						int i_1130_ = i_1128_ & i_1125_;
						int i_1131_ = i_1127_ >> class142.anInt1680 * -1193058675;
						int i_1132_ = i_1128_ >> class142.anInt1680 * -1193058675;
						int i_1133_ = (((is[i_1131_][i_1132_] * (class142.anInt1682 * 341909049 - i_1129_)) + is[i_1131_ + 1][i_1132_] * i_1129_) >> class142.anInt1680 * -1193058675);
						int i_1134_ = (((is[i_1131_][i_1132_ + 1] * (class142.anInt1682 * 341909049 - i_1129_)) + is[i_1131_ + 1][i_1132_ + 1] * i_1129_) >> class142.anInt1680 * -1193058675);
						int i_1135_ = (i_1133_ * (class142.anInt1682 * 341909049 - i_1130_) + i_1134_ * i_1130_ >> class142.anInt1680 * -1193058675);
						anIntArray9047[i_1126_] = anIntArray9047[i_1126_] + i_1135_ - i_1118_;
					}
					for (int i_1136_ = anInt9062; i_1136_ < anInt9061; i_1136_++) {
						int i_1137_ = anIntArray9077[i_1136_] + i_1117_;
						int i_1138_ = anIntArray9065[i_1136_] + i_1119_;
						int i_1139_ = i_1137_ & i_1125_;
						int i_1140_ = i_1138_ & i_1125_;
						int i_1141_ = i_1137_ >> class142.anInt1680 * -1193058675;
						int i_1142_ = i_1138_ >> class142.anInt1680 * -1193058675;
						if (i_1141_ >= 0 && i_1141_ < is.length - 1 && i_1142_ >= 0 && i_1142_ < is[0].length - 1) {
							int i_1143_ = (((is[i_1141_][i_1142_] * (class142.anInt1682 * 341909049 - i_1139_)) + is[i_1141_ + 1][i_1142_] * i_1139_) >> class142.anInt1680 * -1193058675);
							int i_1144_ = (((is[i_1141_][i_1142_ + 1] * (class142.anInt1682 * 341909049 - i_1139_)) + is[i_1141_ + 1][i_1142_ + 1] * i_1139_) >> class142.anInt1680 * -1193058675);
							int i_1145_ = (i_1143_ * (class142.anInt1682 * 341909049 - i_1140_) + i_1144_ * i_1140_ >> class142.anInt1680 * -1193058675);
							anIntArray9047[i_1136_] = anIntArray9047[i_1136_] + i_1145_ - i_1118_;
						}
					}
				} else if (i == 2) {
					if (aShort9108 == 0)
						return;
					int i_1146_ = class142.anInt1682 * 341909049 - 1;
					for (int i_1147_ = 0; i_1147_ < anInt9062; i_1147_++) {
						int i_1148_ = (anIntArray9047[i_1147_] << 16) / aShort9108;
						if (i_1148_ < i_1115_) {
							int i_1149_ = anIntArray9077[i_1147_] + i_1117_;
							int i_1150_ = anIntArray9065[i_1147_] + i_1119_;
							int i_1151_ = i_1149_ & i_1146_;
							int i_1152_ = i_1150_ & i_1146_;
							int i_1153_ = i_1149_ >> class142.anInt1680 * -1193058675;
							int i_1154_ = i_1150_ >> class142.anInt1680 * -1193058675;
							int i_1155_ = (((is[i_1153_][i_1154_] * (class142.anInt1682 * 341909049 - i_1151_)) + is[i_1153_ + 1][i_1154_] * i_1151_) >> class142.anInt1680 * -1193058675);
							int i_1156_ = (((is[i_1153_][i_1154_ + 1] * (class142.anInt1682 * 341909049 - i_1151_)) + is[i_1153_ + 1][i_1154_ + 1] * i_1151_) >> class142.anInt1680 * -1193058675);
							int i_1157_ = (i_1155_ * (class142.anInt1682 * 341909049 - i_1152_) + i_1156_ * i_1152_ >> class142.anInt1680 * -1193058675);
							anIntArray9047[i_1147_] = (anIntArray9047[i_1147_] + ((i_1157_ - i_1118_) * (i_1115_ - i_1148_) / i_1115_));
						} else
							anIntArray9047[i_1147_] = anIntArray9047[i_1147_];
					}
					for (int i_1158_ = anInt9062; i_1158_ < anInt9061; i_1158_++) {
						int i_1159_ = (anIntArray9047[i_1158_] << 16) / aShort9108;
						if (i_1159_ < i_1115_) {
							int i_1160_ = anIntArray9077[i_1158_] + i_1117_;
							int i_1161_ = anIntArray9065[i_1158_] + i_1119_;
							int i_1162_ = i_1160_ & i_1146_;
							int i_1163_ = i_1161_ & i_1146_;
							int i_1164_ = i_1160_ >> class142.anInt1680 * -1193058675;
							int i_1165_ = i_1161_ >> class142.anInt1680 * -1193058675;
							if (i_1164_ >= 0 && i_1164_ < class142.anInt1683 * 692304099 - 1 && i_1165_ >= 0 && (i_1165_ < class142.anInt1681 * 452998539 - 1)) {
								int i_1166_ = (((is[i_1164_][i_1165_] * (class142.anInt1682 * 341909049 - i_1162_)) + is[i_1164_ + 1][i_1165_] * i_1162_) >> class142.anInt1680 * -1193058675);
								int i_1167_ = (((is[i_1164_][i_1165_ + 1] * (class142.anInt1682 * 341909049 - i_1162_)) + (is[i_1164_ + 1][i_1165_ + 1] * i_1162_)) >> class142.anInt1680 * -1193058675);
								int i_1168_ = ((i_1166_ * (class142.anInt1682 * 341909049 - i_1163_)) + i_1167_ * i_1163_ >> class142.anInt1680 * -1193058675);
								anIntArray9047[i_1158_] = (anIntArray9047[i_1158_] + ((i_1168_ - i_1118_) * (i_1115_ - i_1159_) / i_1115_));
							}
						} else
							anIntArray9047[i_1158_] = anIntArray9047[i_1158_];
					}
				} else if (i == 3) {
					int i_1169_ = (i_1115_ & 0xff) * 16;
					int i_1170_ = (i_1115_ >> 8 & 0xff) * 16;
					int i_1171_ = (i_1115_ >> 16 & 0xff) << 6;
					int i_1172_ = (i_1115_ >> 24 & 0xff) << 6;
					if (i_1117_ - (i_1169_ >> 1) < 0 || ((i_1117_ + (i_1169_ >> 1) + class142.anInt1682 * 341909049) >= (class142.anInt1683 * 692304099 << class142.anInt1680 * -1193058675)) || i_1119_ - (i_1170_ >> 1) < 0 || ((i_1119_ + (i_1170_ >> 1) + class142.anInt1682 * 341909049) >= (class142.anInt1681 * 452998539 << class142.anInt1680 * -1193058675)))
						return;
					method2693(class142, i_1117_, i_1118_, i_1119_, i_1169_, i_1170_, i_1171_, i_1172_);
				} else if (i == 4) {
					int i_1173_ = class142_1116_.anInt1682 * 341909049 - 1;
					int i_1174_ = aShort9109 - aShort9108;
					for (int i_1175_ = 0; i_1175_ < anInt9062; i_1175_++) {
						int i_1176_ = anIntArray9077[i_1175_] + i_1117_;
						int i_1177_ = anIntArray9065[i_1175_] + i_1119_;
						int i_1178_ = i_1176_ & i_1173_;
						int i_1179_ = i_1177_ & i_1173_;
						int i_1180_ = (i_1176_ >> class142_1116_.anInt1680 * -1193058675);
						int i_1181_ = (i_1177_ >> class142_1116_.anInt1680 * -1193058675);
						int i_1182_ = (((is_1124_[i_1180_][i_1181_] * (class142_1116_.anInt1682 * 341909049 - i_1178_)) + is_1124_[i_1180_ + 1][i_1181_] * i_1178_) >> class142_1116_.anInt1680 * -1193058675);
						int i_1183_ = (((is_1124_[i_1180_][i_1181_ + 1] * (class142_1116_.anInt1682 * 341909049 - i_1178_)) + is_1124_[i_1180_ + 1][i_1181_ + 1] * i_1178_) >> class142_1116_.anInt1680 * -1193058675);
						int i_1184_ = (i_1182_ * (class142_1116_.anInt1682 * 341909049 - i_1179_) + i_1183_ * i_1179_ >> class142_1116_.anInt1680 * -1193058675);
						anIntArray9047[i_1175_] = (anIntArray9047[i_1175_] + (i_1184_ - i_1118_) + i_1174_);
					}
					for (int i_1185_ = anInt9062; i_1185_ < anInt9061; i_1185_++) {
						int i_1186_ = anIntArray9077[i_1185_] + i_1117_;
						int i_1187_ = anIntArray9065[i_1185_] + i_1119_;
						int i_1188_ = i_1186_ & i_1173_;
						int i_1189_ = i_1187_ & i_1173_;
						int i_1190_ = (i_1186_ >> class142_1116_.anInt1680 * -1193058675);
						int i_1191_ = (i_1187_ >> class142_1116_.anInt1680 * -1193058675);
						if (i_1190_ >= 0 && (i_1190_ < class142_1116_.anInt1683 * 692304099 - 1) && i_1191_ >= 0 && (i_1191_ < class142_1116_.anInt1681 * 452998539 - 1)) {
							int i_1192_ = (((is_1124_[i_1190_][i_1191_] * (class142_1116_.anInt1682 * 341909049 - i_1188_)) + is_1124_[i_1190_ + 1][i_1191_] * i_1188_) >> class142_1116_.anInt1680 * -1193058675);
							int i_1193_ = (((is_1124_[i_1190_][i_1191_ + 1] * (class142_1116_.anInt1682 * 341909049 - i_1188_)) + (is_1124_[i_1190_ + 1][i_1191_ + 1] * i_1188_)) >> class142_1116_.anInt1680 * -1193058675);
							int i_1194_ = ((i_1192_ * (class142_1116_.anInt1682 * 341909049 - i_1189_)) + i_1193_ * i_1189_ >> class142_1116_.anInt1680 * -1193058675);
							anIntArray9047[i_1185_] = (anIntArray9047[i_1185_] + (i_1194_ - i_1118_) + i_1174_);
						}
					}
				} else if (i == 5) {
					int i_1195_ = class142_1116_.anInt1682 * 341909049 - 1;
					int i_1196_ = aShort9109 - aShort9108;
					for (int i_1197_ = 0; i_1197_ < anInt9062; i_1197_++) {
						int i_1198_ = anIntArray9077[i_1197_] + i_1117_;
						int i_1199_ = anIntArray9065[i_1197_] + i_1119_;
						int i_1200_ = i_1198_ & i_1195_;
						int i_1201_ = i_1199_ & i_1195_;
						int i_1202_ = i_1198_ >> class142.anInt1680 * -1193058675;
						int i_1203_ = i_1199_ >> class142.anInt1680 * -1193058675;
						int i_1204_ = (((is[i_1202_][i_1203_] * (class142.anInt1682 * 341909049 - i_1200_)) + is[i_1202_ + 1][i_1203_] * i_1200_) >> class142.anInt1680 * -1193058675);
						int i_1205_ = (((is[i_1202_][i_1203_ + 1] * (class142.anInt1682 * 341909049 - i_1200_)) + is[i_1202_ + 1][i_1203_ + 1] * i_1200_) >> class142.anInt1680 * -1193058675);
						int i_1206_ = (i_1204_ * (class142.anInt1682 * 341909049 - i_1201_) + i_1205_ * i_1201_ >> class142.anInt1680 * -1193058675);
						i_1204_ = (((is_1124_[i_1202_][i_1203_] * (class142_1116_.anInt1682 * 341909049 - i_1200_)) + is_1124_[i_1202_ + 1][i_1203_] * i_1200_) >> class142_1116_.anInt1680 * -1193058675);
						i_1205_ = (((is_1124_[i_1202_][i_1203_ + 1] * (class142_1116_.anInt1682 * 341909049 - i_1200_)) + is_1124_[i_1202_ + 1][i_1203_ + 1] * i_1200_) >> class142_1116_.anInt1680 * -1193058675);
						int i_1207_ = (i_1204_ * (class142_1116_.anInt1682 * 341909049 - i_1201_) + i_1205_ * i_1201_ >> class142_1116_.anInt1680 * -1193058675);
						int i_1208_ = i_1206_ - i_1207_ - i_1115_;
						anIntArray9047[i_1197_] = ((anIntArray9047[i_1197_] << 8) / i_1196_ * i_1208_ >> 8) - (i_1118_ - i_1206_);
					}
					for (int i_1209_ = anInt9062; i_1209_ < anInt9061; i_1209_++) {
						int i_1210_ = anIntArray9077[i_1209_] + i_1117_;
						int i_1211_ = anIntArray9065[i_1209_] + i_1119_;
						int i_1212_ = i_1210_ & i_1195_;
						int i_1213_ = i_1211_ & i_1195_;
						int i_1214_ = i_1210_ >> class142.anInt1680 * -1193058675;
						int i_1215_ = i_1211_ >> class142.anInt1680 * -1193058675;
						if (i_1214_ >= 0 && i_1214_ < class142.anInt1683 * 692304099 - 1 && (i_1214_ < class142_1116_.anInt1683 * 692304099 - 1) && i_1215_ >= 0 && i_1215_ < class142.anInt1681 * 452998539 - 1 && (i_1215_ < class142_1116_.anInt1681 * 452998539 - 1)) {
							int i_1216_ = (((is[i_1214_][i_1215_] * (class142.anInt1682 * 341909049 - i_1212_)) + is[i_1214_ + 1][i_1215_] * i_1212_) >> class142.anInt1680 * -1193058675);
							int i_1217_ = (((is[i_1214_][i_1215_ + 1] * (class142.anInt1682 * 341909049 - i_1212_)) + is[i_1214_ + 1][i_1215_ + 1] * i_1212_) >> class142.anInt1680 * -1193058675);
							int i_1218_ = (i_1216_ * (class142.anInt1682 * 341909049 - i_1213_) + i_1217_ * i_1213_ >> class142.anInt1680 * -1193058675);
							i_1216_ = (((is_1124_[i_1214_][i_1215_] * (class142_1116_.anInt1682 * 341909049 - i_1212_)) + is_1124_[i_1214_ + 1][i_1215_] * i_1212_) >> class142_1116_.anInt1680 * -1193058675);
							i_1217_ = (((is_1124_[i_1214_][i_1215_ + 1] * (class142_1116_.anInt1682 * 341909049 - i_1212_)) + (is_1124_[i_1214_ + 1][i_1215_ + 1] * i_1212_)) >> class142_1116_.anInt1680 * -1193058675);
							int i_1219_ = ((i_1216_ * (class142_1116_.anInt1682 * 341909049 - i_1213_)) + i_1217_ * i_1213_ >> class142_1116_.anInt1680 * -1193058675);
							int i_1220_ = i_1218_ - i_1219_ - i_1115_;
							anIntArray9047[i_1209_] = (((anIntArray9047[i_1209_] << 8) / i_1196_ * i_1220_) >> 8) - (i_1118_ - i_1218_);
						}
					}
				}
				aBool9105 = false;
			}
		}
	}

	public Class167 method2759(byte i, int i_1221_, boolean bool) {
		method14456(Thread.currentThread());
		boolean bool_1222_ = false;
		Class167_Sub1 class167_sub1_1223_;
		Class167_Sub1 class167_sub1_1224_;
		if (i > 0 && i <= 8) {
			class167_sub1_1224_ = aClass167_Sub1Array9131[i - 1];
			class167_sub1_1223_ = aClass167_Sub1Array9076[i - 1];
			bool_1222_ = true;
		} else
			class167_sub1_1223_ = class167_sub1_1224_ = new Class167_Sub1(aClass178_Sub3_9049);
		return method14480(class167_sub1_1223_, class167_sub1_1224_, i_1221_, bool_1222_, bool);
	}

	public int method2752() {
		if (!aBool9105)
			method14478();
		return aShort9082;
	}

	public void method2744(int i) {
		if (aClass178_Sub3_9049.anInt9819 * 1353126165 > 1) {
			synchronized (this) {
				if ((anInt9058 & 0x10000) == 65536 && (i & 0x10000) == 0)
					method14459(true);
				anInt9058 = i;
			}
		} else {
			if ((anInt9058 & 0x10000) == 65536 && (i & 0x10000) == 0)
				method14459(true);
			anInt9058 = i;
		}
	}

	void method2851() {
		if (aClass178_Sub3_9049.anInt9819 * 1353126165 > 1) {
			synchronized (this) {
				aBool1796 = false;
				this.notifyAll();
			}
		}
	}

	void method2757() {
		if (aClass178_Sub3_9049.anInt9819 * 1353126165 > 1) {
			synchronized (this) {
				while (aBool1796) {
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBool1796 = true;
			}
		}
	}

	int method14509(int i) {
		if (i < 2)
			i = 2;
		else if (i > 126)
			i = 126;
		return i;
	}

	boolean method2816() {
		if (anIntArrayArray9091 == null)
			return false;
		anInt9095 = 0;
		anInt9096 = 0;
		anInt9097 = 0;
		return true;
	}

	boolean method2770() {
		if (anIntArrayArray9091 == null)
			return false;
		anInt9095 = 0;
		anInt9096 = 0;
		anInt9097 = 0;
		return true;
	}

	void method2704() {
		if (aBool9094) {
			for (int i = 0; i < anInt9061; i++) {
				anIntArray9077[i] = anIntArray9077[i] + 7 >> 4;
				anIntArray9047[i] = anIntArray9047[i] + 7 >> 4;
				anIntArray9065[i] = anIntArray9065[i] + 7 >> 4;
			}
			aBool9094 = false;
		}
		if (aBool9093) {
			method14503();
			aBool9093 = false;
		}
		aBool9105 = false;
	}

	void method2772() {
		if (aBool9094) {
			for (int i = 0; i < anInt9061; i++) {
				anIntArray9077[i] = anIntArray9077[i] + 7 >> 4;
				anIntArray9047[i] = anIntArray9047[i] + 7 >> 4;
				anIntArray9065[i] = anIntArray9065[i] + 7 >> 4;
			}
			aBool9094 = false;
		}
		if (aBool9093) {
			method14503();
			aBool9093 = false;
		}
		aBool9105 = false;
	}

	public void method2771(int i, int i_1225_, int i_1226_) {
		if (i != 0 && (anInt9058 & 0x1) != 1)
			throw new IllegalStateException();
		if (i_1225_ != 0 && (anInt9058 & 0x2) != 2)
			throw new IllegalStateException();
		if (i_1226_ != 0 && (anInt9058 & 0x4) != 4)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i_1227_ = 0; i_1227_ < anInt9061; i_1227_++) {
				anIntArray9077[i_1227_] += i;
				anIntArray9047[i_1227_] += i_1225_;
				anIntArray9065[i_1227_] += i_1226_;
			}
		}
	}

	void method2774() {
		if (aBool9094) {
			for (int i = 0; i < anInt9061; i++) {
				anIntArray9077[i] = anIntArray9077[i] + 7 >> 4;
				anIntArray9047[i] = anIntArray9047[i] + 7 >> 4;
				anIntArray9065[i] = anIntArray9065[i] + 7 >> 4;
			}
			aBool9094 = false;
		}
		if (aBool9093) {
			method14503();
			aBool9093 = false;
		}
		aBool9105 = false;
	}

	public void method2832(int i, int i_1228_, int i_1229_) {
		if (i != 128 && (anInt9058 & 0x1) != 1)
			throw new IllegalStateException();
		if (i_1228_ != 128 && (anInt9058 & 0x2) != 2)
			throw new IllegalStateException();
		if (i_1229_ != 128 && (anInt9058 & 0x4) != 4)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i_1230_ = 0; i_1230_ < anInt9061; i_1230_++) {
				anIntArray9077[i_1230_] = anIntArray9077[i_1230_] * i >> 7;
				anIntArray9047[i_1230_] = anIntArray9047[i_1230_] * i_1228_ >> 7;
				anIntArray9065[i_1230_] = anIntArray9065[i_1230_] * i_1229_ >> 7;
			}
			aBool9105 = false;
		}
	}

	public int method2766() {
		if (!aBool9105)
			method14478();
		return aShort9111;
	}

	void method2777(int i, int[] is, int i_1231_, int i_1232_, int i_1233_, int i_1234_, boolean bool) {
		int i_1235_ = is.length;
		if (i == 0) {
			i_1231_ <<= 4;
			i_1232_ <<= 4;
			i_1233_ <<= 4;
			if (!aBool9094) {
				for (int i_1236_ = 0; i_1236_ < anInt9061; i_1236_++) {
					anIntArray9077[i_1236_] <<= 4;
					anIntArray9047[i_1236_] <<= 4;
					anIntArray9065[i_1236_] <<= 4;
				}
				aBool9094 = true;
			}
			int i_1237_ = 0;
			anInt9095 = 0;
			anInt9096 = 0;
			anInt9097 = 0;
			for (int i_1238_ = 0; i_1238_ < i_1235_; i_1238_++) {
				int i_1239_ = is[i_1238_];
				if (i_1239_ < anIntArrayArray9091.length) {
					int[] is_1240_ = anIntArrayArray9091[i_1239_];
					for (int i_1241_ = 0; i_1241_ < is_1240_.length; i_1241_++) {
						int i_1242_ = is_1240_[i_1241_];
						anInt9095 += anIntArray9077[i_1242_];
						anInt9096 += anIntArray9047[i_1242_];
						anInt9097 += anIntArray9065[i_1242_];
						i_1237_++;
					}
				}
			}
			if (i_1237_ > 0) {
				anInt9095 = anInt9095 / i_1237_ + i_1231_;
				anInt9096 = anInt9096 / i_1237_ + i_1232_;
				anInt9097 = anInt9097 / i_1237_ + i_1233_;
			} else {
				anInt9095 = i_1231_;
				anInt9096 = i_1232_;
				anInt9097 = i_1233_;
			}
		} else if (i == 1) {
			i_1231_ <<= 4;
			i_1232_ <<= 4;
			i_1233_ <<= 4;
			if (!aBool9094) {
				for (int i_1243_ = 0; i_1243_ < anInt9061; i_1243_++) {
					anIntArray9077[i_1243_] <<= 4;
					anIntArray9047[i_1243_] <<= 4;
					anIntArray9065[i_1243_] <<= 4;
				}
				aBool9094 = true;
			}
			for (int i_1244_ = 0; i_1244_ < i_1235_; i_1244_++) {
				int i_1245_ = is[i_1244_];
				if (i_1245_ < anIntArrayArray9091.length) {
					int[] is_1246_ = anIntArrayArray9091[i_1245_];
					for (int i_1247_ = 0; i_1247_ < is_1246_.length; i_1247_++) {
						int i_1248_ = is_1246_[i_1247_];
						anIntArray9077[i_1248_] += i_1231_;
						anIntArray9047[i_1248_] += i_1232_;
						anIntArray9065[i_1248_] += i_1233_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_1249_ = 0; i_1249_ < i_1235_; i_1249_++) {
				int i_1250_ = is[i_1249_];
				if (i_1250_ < anIntArrayArray9091.length) {
					int[] is_1251_ = anIntArrayArray9091[i_1250_];
					if ((i_1234_ & 0x1) == 0) {
						for (int i_1252_ = 0; i_1252_ < is_1251_.length; i_1252_++) {
							int i_1253_ = is_1251_[i_1252_];
							anIntArray9077[i_1253_] -= anInt9095;
							anIntArray9047[i_1253_] -= anInt9096;
							anIntArray9065[i_1253_] -= anInt9097;
							if (i_1233_ != 0) {
								int i_1254_ = Class433.anIntArray4880[i_1233_];
								int i_1255_ = Class433.anIntArray4881[i_1233_];
								int i_1256_ = ((anIntArray9047[i_1253_] * i_1254_ + anIntArray9077[i_1253_] * i_1255_ + 16383) >> 14);
								anIntArray9047[i_1253_] = (anIntArray9047[i_1253_] * i_1255_ - anIntArray9077[i_1253_] * i_1254_ + 16383) >> 14;
								anIntArray9077[i_1253_] = i_1256_;
							}
							if (i_1231_ != 0) {
								int i_1257_ = Class433.anIntArray4880[i_1231_];
								int i_1258_ = Class433.anIntArray4881[i_1231_];
								int i_1259_ = ((anIntArray9047[i_1253_] * i_1258_ - anIntArray9065[i_1253_] * i_1257_ + 16383) >> 14);
								anIntArray9065[i_1253_] = (anIntArray9047[i_1253_] * i_1257_ + anIntArray9065[i_1253_] * i_1258_ + 16383) >> 14;
								anIntArray9047[i_1253_] = i_1259_;
							}
							if (i_1232_ != 0) {
								int i_1260_ = Class433.anIntArray4880[i_1232_];
								int i_1261_ = Class433.anIntArray4881[i_1232_];
								int i_1262_ = ((anIntArray9065[i_1253_] * i_1260_ + anIntArray9077[i_1253_] * i_1261_ + 16383) >> 14);
								anIntArray9065[i_1253_] = (anIntArray9065[i_1253_] * i_1261_ - anIntArray9077[i_1253_] * i_1260_ + 16383) >> 14;
								anIntArray9077[i_1253_] = i_1262_;
							}
							anIntArray9077[i_1253_] += anInt9095;
							anIntArray9047[i_1253_] += anInt9096;
							anIntArray9065[i_1253_] += anInt9097;
						}
					} else {
						for (int i_1263_ = 0; i_1263_ < is_1251_.length; i_1263_++) {
							int i_1264_ = is_1251_[i_1263_];
							anIntArray9077[i_1264_] -= anInt9095;
							anIntArray9047[i_1264_] -= anInt9096;
							anIntArray9065[i_1264_] -= anInt9097;
							if (i_1231_ != 0) {
								int i_1265_ = Class433.anIntArray4880[i_1231_];
								int i_1266_ = Class433.anIntArray4881[i_1231_];
								int i_1267_ = ((anIntArray9047[i_1264_] * i_1266_ - anIntArray9065[i_1264_] * i_1265_ + 16383) >> 14);
								anIntArray9065[i_1264_] = (anIntArray9047[i_1264_] * i_1265_ + anIntArray9065[i_1264_] * i_1266_ + 16383) >> 14;
								anIntArray9047[i_1264_] = i_1267_;
							}
							if (i_1233_ != 0) {
								int i_1268_ = Class433.anIntArray4880[i_1233_];
								int i_1269_ = Class433.anIntArray4881[i_1233_];
								int i_1270_ = ((anIntArray9047[i_1264_] * i_1268_ + anIntArray9077[i_1264_] * i_1269_ + 16383) >> 14);
								anIntArray9047[i_1264_] = (anIntArray9047[i_1264_] * i_1269_ - anIntArray9077[i_1264_] * i_1268_ + 16383) >> 14;
								anIntArray9077[i_1264_] = i_1270_;
							}
							if (i_1232_ != 0) {
								int i_1271_ = Class433.anIntArray4880[i_1232_];
								int i_1272_ = Class433.anIntArray4881[i_1232_];
								int i_1273_ = ((anIntArray9065[i_1264_] * i_1271_ + anIntArray9077[i_1264_] * i_1272_ + 16383) >> 14);
								anIntArray9065[i_1264_] = (anIntArray9065[i_1264_] * i_1272_ - anIntArray9077[i_1264_] * i_1271_ + 16383) >> 14;
								anIntArray9077[i_1264_] = i_1273_;
							}
							anIntArray9077[i_1264_] += anInt9095;
							anIntArray9047[i_1264_] += anInt9096;
							anIntArray9065[i_1264_] += anInt9097;
						}
					}
				}
			}
		} else if (i == 3) {
			for (int i_1274_ = 0; i_1274_ < i_1235_; i_1274_++) {
				int i_1275_ = is[i_1274_];
				if (i_1275_ < anIntArrayArray9091.length) {
					int[] is_1276_ = anIntArrayArray9091[i_1275_];
					for (int i_1277_ = 0; i_1277_ < is_1276_.length; i_1277_++) {
						int i_1278_ = is_1276_[i_1277_];
						anIntArray9077[i_1278_] -= anInt9095;
						anIntArray9047[i_1278_] -= anInt9096;
						anIntArray9065[i_1278_] -= anInt9097;
						anIntArray9077[i_1278_] = anIntArray9077[i_1278_] * i_1231_ / 128;
						anIntArray9047[i_1278_] = anIntArray9047[i_1278_] * i_1232_ / 128;
						anIntArray9065[i_1278_] = anIntArray9065[i_1278_] * i_1233_ / 128;
						anIntArray9077[i_1278_] += anInt9095;
						anIntArray9047[i_1278_] += anInt9096;
						anIntArray9065[i_1278_] += anInt9097;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9048 != null && aByteArray9086 != null) {
				for (int i_1279_ = 0; i_1279_ < i_1235_; i_1279_++) {
					int i_1280_ = is[i_1279_];
					if (i_1280_ < anIntArrayArray9048.length) {
						int[] is_1281_ = anIntArrayArray9048[i_1280_];
						for (int i_1282_ = 0; i_1282_ < is_1281_.length; i_1282_++) {
							int i_1283_ = is_1281_[i_1282_];
							int i_1284_ = ((aByteArray9086[i_1283_] & 0xff) + i_1231_ * 8);
							if (i_1284_ < 0)
								i_1284_ = 0;
							else if (i_1284_ > 255)
								i_1284_ = 255;
							aByteArray9086[i_1283_] = (byte) i_1284_;
						}
					}
				}
				if (aClass101Array9102 != null) {
					for (int i_1285_ = 0; i_1285_ < anInt9101; i_1285_++) {
						Class101 class101 = aClass101Array9102[i_1285_];
						Class103 class103 = aClass103Array9103[i_1285_];
						class103.anInt1258 = (class103.anInt1258 * 330457669 & 0xffffff | 255 - ((aByteArray9086[class101.anInt1241 * -566359109]) & 0xff) << 24) * -1951506291;
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9048 != null) {
				for (int i_1286_ = 0; i_1286_ < i_1235_; i_1286_++) {
					int i_1287_ = is[i_1286_];
					if (i_1287_ < anIntArrayArray9048.length) {
						int[] is_1288_ = anIntArrayArray9048[i_1287_];
						for (int i_1289_ = 0; i_1289_ < is_1288_.length; i_1289_++) {
							int i_1290_ = is_1288_[i_1289_];
							int i_1291_ = aShortArray9088[i_1290_] & 0xffff;
							int i_1292_ = i_1291_ >> 10 & 0x3f;
							int i_1293_ = i_1291_ >> 7 & 0x7;
							int i_1294_ = i_1291_ & 0x7f;
							i_1292_ = i_1292_ + i_1231_ & 0x3f;
							i_1293_ += i_1232_;
							if (i_1293_ < 0)
								i_1293_ = 0;
							else if (i_1293_ > 7)
								i_1293_ = 7;
							i_1294_ += i_1233_;
							if (i_1294_ < 0)
								i_1294_ = 0;
							else if (i_1294_ > 127)
								i_1294_ = 127;
							aShortArray9088[i_1290_] = (short) (i_1292_ << 10 | i_1293_ << 7 | i_1294_);
						}
						aBool9093 = true;
					}
				}
				if (aClass101Array9102 != null) {
					for (int i_1295_ = 0; i_1295_ < anInt9101; i_1295_++) {
						Class101 class101 = aClass101Array9102[i_1295_];
						Class103 class103 = aClass103Array9103[i_1295_];
						class103.anInt1258 = (class103.anInt1258 * 330457669 & ~0xffffff | ((Class638.anIntArray8306[Class493.method8085(((aShortArray9088[(class101.anInt1241 * -566359109)]) & 0xffff), -382812443) & 0xffff]) & 0xffffff)) * -1951506291;
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9104 != null) {
				for (int i_1296_ = 0; i_1296_ < i_1235_; i_1296_++) {
					int i_1297_ = is[i_1296_];
					if (i_1297_ < anIntArrayArray9104.length) {
						int[] is_1298_ = anIntArrayArray9104[i_1297_];
						for (int i_1299_ = 0; i_1299_ < is_1298_.length; i_1299_++) {
							Class103 class103 = aClass103Array9103[is_1298_[i_1299_]];
							class103.anInt1248 += i_1231_ * 356391365;
							class103.anInt1251 += i_1232_ * 1938564783;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9104 != null) {
				for (int i_1300_ = 0; i_1300_ < i_1235_; i_1300_++) {
					int i_1301_ = is[i_1300_];
					if (i_1301_ < anIntArrayArray9104.length) {
						int[] is_1302_ = anIntArrayArray9104[i_1301_];
						for (int i_1303_ = 0; i_1303_ < is_1302_.length; i_1303_++) {
							Class103 class103 = aClass103Array9103[is_1302_[i_1303_]];
							class103.aFloat1249 = (class103.aFloat1249 * (float) i_1231_ / 128.0F);
							class103.aFloat1250 = (class103.aFloat1250 * (float) i_1232_ / 128.0F);
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9104 != null) {
				for (int i_1304_ = 0; i_1304_ < i_1235_; i_1304_++) {
					int i_1305_ = is[i_1304_];
					if (i_1305_ < anIntArrayArray9104.length) {
						int[] is_1306_ = anIntArrayArray9104[i_1305_];
						for (int i_1307_ = 0; i_1307_ < is_1306_.length; i_1307_++) {
							Class103 class103 = aClass103Array9103[is_1306_[i_1307_]];
							class103.anInt1253 = (class103.anInt1253 * 212895487 + i_1231_ & 0x3fff) * 891189503;
						}
					}
				}
			}
		}
	}

	void method14510(Class435 class435, Class180 class180, int i) {
		if (anInt9062 >= 1) {
			Class99 class99 = aClass178_Sub3_9049.method15475(Thread.currentThread());
			Class441 class441 = class99.aClass441_1202;
			class441.method7090(class435);
			Class441 class441_1308_ = aClass178_Sub3_9049.aClass441_9811;
			Class441 class441_1309_ = aClass178_Sub3_9049.aClass441_9805;
			if (!aBool9105)
				method14478();
			boolean bool = class441.method7094();
			float[] fs = class99.aFloatArray1231;
			class441.method7185(0.0F, (float) aShort9108, 0.0F, fs);
			float f = fs[0];
			float f_1310_ = fs[1];
			float f_1311_ = fs[2];
			class441.method7185(0.0F, (float) aShort9109, 0.0F, fs);
			float f_1312_ = fs[0];
			float f_1313_ = fs[1];
			float f_1314_ = fs[2];
			for (int i_1315_ = 0; i_1315_ < 6; i_1315_++) {
				float[] fs_1316_ = aClass178_Sub3_9049.aFloatArrayArray9822[i_1315_];
				float f_1317_ = (fs_1316_[0] * f + fs_1316_[1] * f_1310_ + fs_1316_[2] * f_1311_ + fs_1316_[3] + (float) aShort9082);
				float f_1318_ = (fs_1316_[0] * f_1312_ + fs_1316_[1] * f_1313_ + fs_1316_[2] * f_1314_ + fs_1316_[3] + (float) aShort9082);
				if (f_1317_ < 0.0F && f_1318_ < 0.0F)
					return;
			}
			float f_1319_;
			float f_1320_;
			if (bool) {
				f_1319_ = class441_1308_.aFloatArray4916[14];
				f_1320_ = class441_1308_.aFloatArray4916[6];
			} else {
				f_1319_ = ((class441.aFloatArray4916[12] * class441_1308_.aFloatArray4916[2]) + (class441.aFloatArray4916[13] * class441_1308_.aFloatArray4916[6]) + (class441.aFloatArray4916[14] * class441_1308_.aFloatArray4916[10]) + class441_1308_.aFloatArray4916[14]);
				f_1320_ = ((class441.aFloatArray4916[4] * class441_1308_.aFloatArray4916[2]) + (class441.aFloatArray4916[5] * class441_1308_.aFloatArray4916[6]) + (class441.aFloatArray4916[6] * class441_1308_.aFloatArray4916[10]));
			}
			float f_1321_ = f_1319_ + (float) aShort9108 * f_1320_;
			float f_1322_ = f_1319_ + (float) aShort9109 * f_1320_;
			float f_1323_ = (f_1321_ > f_1322_ ? f_1321_ + (float) aShort9082 : f_1322_ + (float) aShort9082);
			float f_1324_ = (class441_1309_.aFloatArray4916[10] * f_1323_ + class441_1309_.aFloatArray4916[14]);
			if (aClass178_Sub3_9049.anInt9819 * 1353126165 > 1) {
				synchronized (this) {
					while (aBool9046) {
						try {
							this.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
					}
					aBool9046 = true;
				}
			}
			method14529(class99);
			Class441 class441_1325_ = aClass99_9069.aClass441_1203;
			class441_1325_.method7086(class441);
			class441_1325_.method7089(aClass178_Sub3_9049.aClass441_9821);
			if ((i & 0x2) != 0)
				aClass118_9118.method2065(true);
			else
				aClass118_9118.method2065(false);
			boolean bool_1326_ = false;
			aClass99_9069.aFloat1215 = aClass118_9118.aFloat1469;
			aClass99_9069.aFloat1221 = aClass118_9118.aFloat1444;
			aClass99_9069.aFloat1219 = aClass118_9118.aFloat1447;
			aClass99_9069.aFloat1213 = 1.0F / aClass118_9118.aFloat1447;
			aClass99_9069.aFloat1216 = aClass118_9118.aFloat1442;
			aClass99_9069.aFloat1218 = aClass118_9118.aFloat1473;
			aClass99_9069.aFloat1193 = aClass118_9118.aFloat1458;
			aClass99_9069.anInt1220 = aClass118_9118.anInt1448 * 1091426921;
			for (int i_1327_ = 0; i_1327_ < anInt9061; i_1327_++) {
				int i_1328_ = anIntArray9077[i_1327_];
				int i_1329_ = anIntArray9047[i_1327_];
				int i_1330_ = anIntArray9065[i_1327_];
				float f_1331_ = (class441_1325_.aFloatArray4916[0] * (float) i_1328_ + class441_1325_.aFloatArray4916[4] * (float) i_1329_ + class441_1325_.aFloatArray4916[8] * (float) i_1330_ + class441_1325_.aFloatArray4916[12]);
				float f_1332_ = (class441_1325_.aFloatArray4916[1] * (float) i_1328_ + class441_1325_.aFloatArray4916[5] * (float) i_1329_ + class441_1325_.aFloatArray4916[9] * (float) i_1330_ + class441_1325_.aFloatArray4916[13]);
				float f_1333_ = (class441_1325_.aFloatArray4916[2] * (float) i_1328_ + class441_1325_.aFloatArray4916[6] * (float) i_1329_ + class441_1325_.aFloatArray4916[10] * (float) i_1330_ + class441_1325_.aFloatArray4916[14]);
				float f_1334_ = (class441_1325_.aFloatArray4916[3] * (float) i_1328_ + class441_1325_.aFloatArray4916[7] * (float) i_1329_ + class441_1325_.aFloatArray4916[11] * (float) i_1330_ + class441_1325_.aFloatArray4916[15]);
				aFloatArray9122[i_1327_] = (aClass99_9069.aFloat1193 + aClass99_9069.aFloat1219 * f_1333_ / f_1334_);
				aFloatArray9123[i_1327_] = f_1334_;
				if (f_1333_ >= -f_1334_) {
					aFloatArray9120[i_1327_] = (float) (int) (aClass99_9069.aFloat1216 + (aClass99_9069.aFloat1215 * f_1331_ / f_1334_));
					aFloatArray9121[i_1327_] = (float) (int) (aClass99_9069.aFloat1218 + (aClass99_9069.aFloat1221 * f_1332_ / f_1334_));
				} else {
					aFloatArray9120[i_1327_] = -5000.0F;
					bool_1326_ = true;
				}
				if (aClass99_9069.aBool1204)
					anIntArray9119[i_1327_] = (int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) i_1328_) + (class441.aFloatArray4916[5] * (float) i_1329_) + (class441.aFloatArray4916[9] * (float) i_1330_)));
			}
			if (aClass101Array9102 != null) {
				for (int i_1335_ = 0; i_1335_ < anInt9101; i_1335_++) {
					Class101 class101 = aClass101Array9102[i_1335_];
					Class103 class103 = aClass103Array9103[i_1335_];
					short i_1336_ = aShortArray9064[class101.anInt1241 * -566359109];
					short i_1337_ = aShortArray9072[class101.anInt1241 * -566359109];
					short i_1338_ = aShortArray9063[class101.anInt1241 * -566359109];
					int i_1339_ = ((anIntArray9077[i_1336_] + anIntArray9077[i_1337_] + anIntArray9077[i_1338_]) / 3);
					int i_1340_ = ((anIntArray9047[i_1336_] + anIntArray9047[i_1337_] + anIntArray9047[i_1338_]) / 3);
					int i_1341_ = ((anIntArray9065[i_1336_] + anIntArray9065[i_1337_] + anIntArray9065[i_1338_]) / 3);
					float f_1342_ = (class441_1325_.aFloatArray4916[0] * (float) i_1339_ + (class441_1325_.aFloatArray4916[4] * (float) i_1340_) + (class441_1325_.aFloatArray4916[8] * (float) i_1341_) + class441_1325_.aFloatArray4916[12]);
					float f_1343_ = (class441_1325_.aFloatArray4916[1] * (float) i_1339_ + (class441_1325_.aFloatArray4916[5] * (float) i_1340_) + (class441_1325_.aFloatArray4916[9] * (float) i_1341_) + class441_1325_.aFloatArray4916[13]);
					float f_1344_ = (class441_1325_.aFloatArray4916[2] * (float) i_1339_ + (class441_1325_.aFloatArray4916[6] * (float) i_1340_) + (class441_1325_.aFloatArray4916[10] * (float) i_1341_) + class441_1325_.aFloatArray4916[14]);
					float f_1345_ = (class441_1325_.aFloatArray4916[3] * (float) i_1339_ + (class441_1325_.aFloatArray4916[7] * (float) i_1340_) + (class441_1325_.aFloatArray4916[11] * (float) i_1341_) + class441_1325_.aFloatArray4916[15]);
					f_1344_ += ((class441_1309_.aFloatArray4916[2] * (float) (class103.anInt1248 * -34734835)) + (class441_1309_.aFloatArray4916[6] * (float) (class103.anInt1251 * 1665462351)));
					f_1345_ += ((class441_1309_.aFloatArray4916[3] * (float) (class103.anInt1248 * -34734835)) + (class441_1309_.aFloatArray4916[7] * (float) (class103.anInt1251 * 1665462351)));
					if (f_1344_ > -f_1345_) {
						f_1342_ += ((class441_1309_.aFloatArray4916[0] * (float) (class103.anInt1248 * -34734835)) + (class441_1309_.aFloatArray4916[4] * (float) (class103.anInt1251 * 1665462351)));
						f_1343_ += ((class441_1309_.aFloatArray4916[1] * (float) (class103.anInt1248 * -34734835)) + (class441_1309_.aFloatArray4916[5] * (float) (class103.anInt1251 * 1665462351)));
						float f_1346_ = (aClass178_Sub3_9049.aFloat9828 + (aClass178_Sub3_9049.aFloat9827 * f_1342_ / f_1345_));
						float f_1347_ = (aClass178_Sub3_9049.aFloat9830 + (aClass178_Sub3_9049.aFloat9829 * f_1343_ / f_1345_));
						float f_1348_ = (class103.aFloat1249 * (float) class101.aShort1238);
						float f_1349_ = (class103.aFloat1250 * (float) class101.aShort1239);
						float f_1350_ = (f_1342_ + class441_1309_.aFloatArray4916[0] * f_1348_ + class441_1309_.aFloatArray4916[4] * f_1349_);
						float f_1351_ = (f_1343_ + class441_1309_.aFloatArray4916[1] * f_1348_ + class441_1309_.aFloatArray4916[5] * f_1349_);
						float f_1352_ = (f_1345_ + class441_1309_.aFloatArray4916[3] * f_1348_ + class441_1309_.aFloatArray4916[7] * f_1349_);
						float f_1353_ = (aClass178_Sub3_9049.aFloat9828 + (aClass178_Sub3_9049.aFloat9827 * f_1350_ / f_1352_));
						float f_1354_ = (aClass178_Sub3_9049.aFloat9830 + (aClass178_Sub3_9049.aFloat9829 * f_1351_ / f_1352_));
						class103.anInt1254 = (int) f_1346_ * -396393361;
						class103.anInt1255 = (int) f_1347_ * -1883440415;
						class103.aFloat1256 = (aClass178_Sub3_9049.aFloat9832 + (aClass178_Sub3_9049.aFloat9833 * (f_1344_ - (class441_1309_.aFloatArray4916[10] * (float) (class101.anInt1244 * 1633012149))) / f_1345_));
						class103.anInt1257 = (int) (f_1353_ < f_1346_ ? f_1346_ - f_1353_ : f_1353_ - f_1346_) * -229098483;
						class103.anInt1252 = (int) (f_1354_ < f_1347_ ? f_1347_ - f_1354_ : f_1354_ - f_1347_) * 433876727;
					} else {
						Class103 class103_1355_ = class103;
						class103.anInt1252 = 0;
						class103_1355_.anInt1257 = 0;
					}
				}
			}
			if (class180 != null) {
				boolean bool_1356_ = false;
				boolean bool_1357_ = true;
				int i_1358_ = aShort9090 + aShort9111 >> 1;
				int i_1359_ = aShort9112 + aShort9113 >> 1;
				int i_1360_ = i_1358_;
				short i_1361_ = aShort9108;
				int i_1362_ = i_1359_;
				float f_1363_ = (class441_1325_.aFloatArray4916[0] * (float) i_1360_ + class441_1325_.aFloatArray4916[4] * (float) i_1361_ + class441_1325_.aFloatArray4916[8] * (float) i_1362_ + class441_1325_.aFloatArray4916[12]);
				float f_1364_ = (class441_1325_.aFloatArray4916[1] * (float) i_1360_ + class441_1325_.aFloatArray4916[5] * (float) i_1361_ + class441_1325_.aFloatArray4916[9] * (float) i_1362_ + class441_1325_.aFloatArray4916[13]);
				float f_1365_ = (class441_1325_.aFloatArray4916[2] * (float) i_1360_ + class441_1325_.aFloatArray4916[6] * (float) i_1361_ + class441_1325_.aFloatArray4916[10] * (float) i_1362_ + class441_1325_.aFloatArray4916[14]);
				float f_1366_ = (class441_1325_.aFloatArray4916[3] * (float) i_1360_ + class441_1325_.aFloatArray4916[7] * (float) i_1361_ + class441_1325_.aFloatArray4916[11] * (float) i_1362_ + class441_1325_.aFloatArray4916[15]);
				if (f_1365_ >= -f_1366_) {
					class180.anInt1999 = (int) (aClass178_Sub3_9049.aFloat9828 + (aClass178_Sub3_9049.aFloat9827 * f_1363_ / f_1366_));
					class180.anInt2002 = (int) (aClass178_Sub3_9049.aFloat9830 + (aClass178_Sub3_9049.aFloat9829 * f_1364_ / f_1366_));
				} else
					bool_1356_ = true;
				i_1360_ = i_1358_;
				i_1361_ = aShort9109;
				i_1362_ = i_1359_;
				float f_1367_ = (class441_1325_.aFloatArray4916[0] * (float) i_1360_ + class441_1325_.aFloatArray4916[4] * (float) i_1361_ + class441_1325_.aFloatArray4916[8] * (float) i_1362_ + class441_1325_.aFloatArray4916[12]);
				float f_1368_ = (class441_1325_.aFloatArray4916[1] * (float) i_1360_ + class441_1325_.aFloatArray4916[5] * (float) i_1361_ + class441_1325_.aFloatArray4916[9] * (float) i_1362_ + class441_1325_.aFloatArray4916[13]);
				float f_1369_ = (class441_1325_.aFloatArray4916[2] * (float) i_1360_ + class441_1325_.aFloatArray4916[6] * (float) i_1361_ + class441_1325_.aFloatArray4916[10] * (float) i_1362_ + class441_1325_.aFloatArray4916[14]);
				float f_1370_ = (class441_1325_.aFloatArray4916[3] * (float) i_1360_ + class441_1325_.aFloatArray4916[7] * (float) i_1361_ + class441_1325_.aFloatArray4916[11] * (float) i_1362_ + class441_1325_.aFloatArray4916[15]);
				if (f_1369_ >= -f_1370_) {
					class180.anInt1998 = (int) (aClass178_Sub3_9049.aFloat9828 + (aClass178_Sub3_9049.aFloat9827 * f_1367_ / f_1370_));
					class180.anInt2003 = (int) (aClass178_Sub3_9049.aFloat9830 + (aClass178_Sub3_9049.aFloat9829 * f_1368_ / f_1370_));
				} else
					bool_1356_ = true;
				if (bool_1356_) {
					if (f_1365_ < -f_1366_ && f_1369_ < -f_1370_)
						bool_1357_ = false;
					else if (f_1365_ < -f_1366_) {
						float f_1371_ = (f_1365_ + f_1366_) / (f_1369_ + f_1370_) - 1.0F;
						float f_1372_ = f_1363_ + f_1371_ * (f_1367_ - f_1363_);
						float f_1373_ = f_1364_ + f_1371_ * (f_1368_ - f_1364_);
						float f_1374_ = f_1366_ + f_1371_ * (f_1370_ - f_1366_);
						class180.anInt1999 = (int) (aClass178_Sub3_9049.aFloat9828 + (aClass178_Sub3_9049.aFloat9827 * f_1372_ / f_1374_));
						class180.anInt2002 = (int) (aClass178_Sub3_9049.aFloat9830 + (aClass178_Sub3_9049.aFloat9829 * f_1373_ / f_1374_));
					} else if (f_1369_ < -f_1370_) {
						float f_1375_ = (f_1369_ + f_1370_) / (f_1365_ + f_1366_) - 1.0F;
						float f_1376_ = f_1367_ + f_1375_ * (f_1363_ - f_1367_);
						float f_1377_ = f_1368_ + f_1375_ * (f_1364_ - f_1368_);
						float f_1378_ = f_1370_ + f_1375_ * (f_1366_ - f_1370_);
						class180.anInt1998 = (int) (aClass178_Sub3_9049.aFloat9828 + (aClass178_Sub3_9049.aFloat9827 * f_1376_ / f_1378_));
						class180.anInt2003 = (int) (aClass178_Sub3_9049.aFloat9830 + (aClass178_Sub3_9049.aFloat9829 * f_1377_ / f_1378_));
					}
				}
				if (bool_1357_) {
					if (f_1365_ / f_1366_ > f_1369_ / f_1370_) {
						float f_1379_ = (f_1363_ + (class441_1309_.aFloatArray4916[0] * (float) aShort9082) + class441_1309_.aFloatArray4916[12]);
						float f_1380_ = (f_1366_ + (class441_1309_.aFloatArray4916[3] * (float) aShort9082) + class441_1309_.aFloatArray4916[15]);
						class180.anInt2001 = (int) (aClass178_Sub3_9049.aFloat9828 - (float) class180.anInt1999 + (aClass178_Sub3_9049.aFloat9827 * f_1379_ / f_1380_));
					} else {
						float f_1381_ = (f_1367_ + (class441_1309_.aFloatArray4916[0] * (float) aShort9082) + class441_1309_.aFloatArray4916[12]);
						float f_1382_ = (f_1370_ + (class441_1309_.aFloatArray4916[3] * (float) aShort9082) + class441_1309_.aFloatArray4916[15]);
						class180.anInt2001 = (int) (aClass178_Sub3_9049.aFloat9828 - (float) class180.anInt1998 + (aClass178_Sub3_9049.aFloat9827 * f_1381_ / f_1382_));
					}
					class180.aBool2000 = true;
				}
			}
			method14459(true);
			aClass118_9118.aBool1465 = (i & 0x1) == 0;
			aClass118_9118.aBool1437 = false;
			try {
				method14471(aClass178_Sub3_9049.anIntArray9804 != null, aClass178_Sub3_9049.aFloatArray9807 != null, (i & 0x4) != 0, bool_1326_, ((aClass99_9069.aBool1189 && f_1324_ > aClass99_9069.aFloat1205) || aClass99_9069.aBool1204));
			} catch (Exception exception) {
				/* empty */
			}
			if (aClass101Array9102 != null) {
				for (int i_1383_ = 0; i_1383_ < anInt9074; i_1383_++)
					anIntArray9129[i_1383_] = -1;
			}
			aClass118_9118 = null;
			if (aClass178_Sub3_9049.anInt9819 * 1353126165 > 1) {
				synchronized (this) {
					aBool9046 = false;
					this.notifyAll();
				}
			}
		}
	}

	public int method2797() {
		if (!aBool9105)
			method14478();
		return aShort9090;
	}

	public void method2719() {
		if (!aBool9114) {
			if (!aBool9105)
				method14478();
			aShort9115 = aShort9108;
			aBool9114 = true;
		}
	}

	public void method2776(Class435 class435, int i, boolean bool) {
		if (aShortArray9066 != null) {
			Class99 class99 = aClass178_Sub3_9049.method15475(Thread.currentThread());
			Class435 class435_1384_ = class99.aClass435_1214;
			class435_1384_.method6803(class435);
			if (bool)
				class435_1384_.method6857();
			Class441 class441 = class99.aClass441_1202;
			class441.method7090(class435_1384_);
			float[] fs = new float[3];
			for (int i_1385_ = 0; i_1385_ < anInt9062; i_1385_++) {
				if ((i & aShortArray9066[i_1385_]) != 0) {
					class441.method7185((float) anIntArray9077[i_1385_], (float) anIntArray9047[i_1385_], (float) anIntArray9065[i_1385_], fs);
					anIntArray9077[i_1385_] = (int) fs[0];
					anIntArray9047[i_1385_] = (int) fs[1];
					anIntArray9065[i_1385_] = (int) fs[2];
				}
			}
		}
	}

	public int method2717() {
		if (!aBool9105)
			method14478();
		return aShort9113;
	}

	public void method2794(int i, int i_1386_, int i_1387_, int i_1388_) {
		if ((anInt9058 & 0x80000) != 524288)
			throw new IllegalStateException();
		for (int i_1389_ = 0; i_1389_ < anInt9074; i_1389_++) {
			int i_1390_ = aShortArray9088[i_1389_] & 0xffff;
			int i_1391_ = i_1390_ >> 10 & 0x3f;
			int i_1392_ = i_1390_ >> 7 & 0x7;
			int i_1393_ = i_1390_ & 0x7f;
			if (i != -1)
				i_1391_ += (i - i_1391_) * i_1388_ >> 7;
			if (i_1386_ != -1)
				i_1392_ += (i_1386_ - i_1392_) * i_1388_ >> 7;
			if (i_1387_ != -1)
				i_1393_ += (i_1387_ - i_1393_) * i_1388_ >> 7;
			aShortArray9088[i_1389_] = (short) (i_1391_ << 10 | i_1392_ << 7 | i_1393_);
		}
		if (aClass101Array9102 != null) {
			for (int i_1394_ = 0; i_1394_ < anInt9101; i_1394_++) {
				Class101 class101 = aClass101Array9102[i_1394_];
				Class103 class103 = aClass103Array9103[i_1394_];
				class103.anInt1258 = (class103.anInt1258 * 330457669 & ~0xffffff | ((Class638.anIntArray8306[Class493.method8085((aShortArray9088[(class101.anInt1241 * -566359109)]) & 0xffff, -1142316431) & 0xffff]) & 0xffffff)) * -1951506291;
			}
		}
		if (anInt9084 == 2)
			anInt9084 = 1;
	}

	public void method2784(Class435 class435, Class180 class180, int i) {
		method14510(class435, class180, i);
	}

	void method14511(Class435 class435, Class180 class180, int i) {
		if (anInt9062 >= 1) {
			Class99 class99 = aClass178_Sub3_9049.method15475(Thread.currentThread());
			Class441 class441 = class99.aClass441_1202;
			class441.method7090(class435);
			Class441 class441_1395_ = aClass178_Sub3_9049.aClass441_9811;
			Class441 class441_1396_ = aClass178_Sub3_9049.aClass441_9805;
			if (!aBool9105)
				method14478();
			boolean bool = class441.method7094();
			float[] fs = class99.aFloatArray1231;
			class441.method7185(0.0F, (float) aShort9108, 0.0F, fs);
			float f = fs[0];
			float f_1397_ = fs[1];
			float f_1398_ = fs[2];
			class441.method7185(0.0F, (float) aShort9109, 0.0F, fs);
			float f_1399_ = fs[0];
			float f_1400_ = fs[1];
			float f_1401_ = fs[2];
			for (int i_1402_ = 0; i_1402_ < 6; i_1402_++) {
				float[] fs_1403_ = aClass178_Sub3_9049.aFloatArrayArray9822[i_1402_];
				float f_1404_ = (fs_1403_[0] * f + fs_1403_[1] * f_1397_ + fs_1403_[2] * f_1398_ + fs_1403_[3] + (float) aShort9082);
				float f_1405_ = (fs_1403_[0] * f_1399_ + fs_1403_[1] * f_1400_ + fs_1403_[2] * f_1401_ + fs_1403_[3] + (float) aShort9082);
				if (f_1404_ < 0.0F && f_1405_ < 0.0F)
					return;
			}
			float f_1406_;
			float f_1407_;
			if (bool) {
				f_1406_ = class441_1395_.aFloatArray4916[14];
				f_1407_ = class441_1395_.aFloatArray4916[6];
			} else {
				f_1406_ = ((class441.aFloatArray4916[12] * class441_1395_.aFloatArray4916[2]) + (class441.aFloatArray4916[13] * class441_1395_.aFloatArray4916[6]) + (class441.aFloatArray4916[14] * class441_1395_.aFloatArray4916[10]) + class441_1395_.aFloatArray4916[14]);
				f_1407_ = ((class441.aFloatArray4916[4] * class441_1395_.aFloatArray4916[2]) + (class441.aFloatArray4916[5] * class441_1395_.aFloatArray4916[6]) + (class441.aFloatArray4916[6] * class441_1395_.aFloatArray4916[10]));
			}
			float f_1408_ = f_1406_ + (float) aShort9108 * f_1407_;
			float f_1409_ = f_1406_ + (float) aShort9109 * f_1407_;
			float f_1410_ = (f_1408_ > f_1409_ ? f_1408_ + (float) aShort9082 : f_1409_ + (float) aShort9082);
			float f_1411_ = (class441_1396_.aFloatArray4916[10] * f_1410_ + class441_1396_.aFloatArray4916[14]);
			if (aClass178_Sub3_9049.anInt9819 * 1353126165 > 1) {
				synchronized (this) {
					while (aBool9046) {
						try {
							this.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
					}
					aBool9046 = true;
				}
			}
			method14529(class99);
			Class441 class441_1412_ = aClass99_9069.aClass441_1203;
			class441_1412_.method7086(class441);
			class441_1412_.method7089(aClass178_Sub3_9049.aClass441_9821);
			if ((i & 0x2) != 0)
				aClass118_9118.method2065(true);
			else
				aClass118_9118.method2065(false);
			boolean bool_1413_ = false;
			aClass99_9069.aFloat1215 = aClass118_9118.aFloat1469;
			aClass99_9069.aFloat1221 = aClass118_9118.aFloat1444;
			aClass99_9069.aFloat1219 = aClass118_9118.aFloat1447;
			aClass99_9069.aFloat1213 = 1.0F / aClass118_9118.aFloat1447;
			aClass99_9069.aFloat1216 = aClass118_9118.aFloat1442;
			aClass99_9069.aFloat1218 = aClass118_9118.aFloat1473;
			aClass99_9069.aFloat1193 = aClass118_9118.aFloat1458;
			aClass99_9069.anInt1220 = aClass118_9118.anInt1448 * 1091426921;
			for (int i_1414_ = 0; i_1414_ < anInt9061; i_1414_++) {
				int i_1415_ = anIntArray9077[i_1414_];
				int i_1416_ = anIntArray9047[i_1414_];
				int i_1417_ = anIntArray9065[i_1414_];
				float f_1418_ = (class441_1412_.aFloatArray4916[0] * (float) i_1415_ + class441_1412_.aFloatArray4916[4] * (float) i_1416_ + class441_1412_.aFloatArray4916[8] * (float) i_1417_ + class441_1412_.aFloatArray4916[12]);
				float f_1419_ = (class441_1412_.aFloatArray4916[1] * (float) i_1415_ + class441_1412_.aFloatArray4916[5] * (float) i_1416_ + class441_1412_.aFloatArray4916[9] * (float) i_1417_ + class441_1412_.aFloatArray4916[13]);
				float f_1420_ = (class441_1412_.aFloatArray4916[2] * (float) i_1415_ + class441_1412_.aFloatArray4916[6] * (float) i_1416_ + class441_1412_.aFloatArray4916[10] * (float) i_1417_ + class441_1412_.aFloatArray4916[14]);
				float f_1421_ = (class441_1412_.aFloatArray4916[3] * (float) i_1415_ + class441_1412_.aFloatArray4916[7] * (float) i_1416_ + class441_1412_.aFloatArray4916[11] * (float) i_1417_ + class441_1412_.aFloatArray4916[15]);
				aFloatArray9122[i_1414_] = (aClass99_9069.aFloat1193 + aClass99_9069.aFloat1219 * f_1420_ / f_1421_);
				aFloatArray9123[i_1414_] = f_1421_;
				if (f_1420_ >= -f_1421_) {
					aFloatArray9120[i_1414_] = (float) (int) (aClass99_9069.aFloat1216 + (aClass99_9069.aFloat1215 * f_1418_ / f_1421_));
					aFloatArray9121[i_1414_] = (float) (int) (aClass99_9069.aFloat1218 + (aClass99_9069.aFloat1221 * f_1419_ / f_1421_));
				} else {
					aFloatArray9120[i_1414_] = -5000.0F;
					bool_1413_ = true;
				}
				if (aClass99_9069.aBool1204)
					anIntArray9119[i_1414_] = (int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) i_1415_) + (class441.aFloatArray4916[5] * (float) i_1416_) + (class441.aFloatArray4916[9] * (float) i_1417_)));
			}
			if (aClass101Array9102 != null) {
				for (int i_1422_ = 0; i_1422_ < anInt9101; i_1422_++) {
					Class101 class101 = aClass101Array9102[i_1422_];
					Class103 class103 = aClass103Array9103[i_1422_];
					short i_1423_ = aShortArray9064[class101.anInt1241 * -566359109];
					short i_1424_ = aShortArray9072[class101.anInt1241 * -566359109];
					short i_1425_ = aShortArray9063[class101.anInt1241 * -566359109];
					int i_1426_ = ((anIntArray9077[i_1423_] + anIntArray9077[i_1424_] + anIntArray9077[i_1425_]) / 3);
					int i_1427_ = ((anIntArray9047[i_1423_] + anIntArray9047[i_1424_] + anIntArray9047[i_1425_]) / 3);
					int i_1428_ = ((anIntArray9065[i_1423_] + anIntArray9065[i_1424_] + anIntArray9065[i_1425_]) / 3);
					float f_1429_ = (class441_1412_.aFloatArray4916[0] * (float) i_1426_ + (class441_1412_.aFloatArray4916[4] * (float) i_1427_) + (class441_1412_.aFloatArray4916[8] * (float) i_1428_) + class441_1412_.aFloatArray4916[12]);
					float f_1430_ = (class441_1412_.aFloatArray4916[1] * (float) i_1426_ + (class441_1412_.aFloatArray4916[5] * (float) i_1427_) + (class441_1412_.aFloatArray4916[9] * (float) i_1428_) + class441_1412_.aFloatArray4916[13]);
					float f_1431_ = (class441_1412_.aFloatArray4916[2] * (float) i_1426_ + (class441_1412_.aFloatArray4916[6] * (float) i_1427_) + (class441_1412_.aFloatArray4916[10] * (float) i_1428_) + class441_1412_.aFloatArray4916[14]);
					float f_1432_ = (class441_1412_.aFloatArray4916[3] * (float) i_1426_ + (class441_1412_.aFloatArray4916[7] * (float) i_1427_) + (class441_1412_.aFloatArray4916[11] * (float) i_1428_) + class441_1412_.aFloatArray4916[15]);
					f_1431_ += ((class441_1396_.aFloatArray4916[2] * (float) (class103.anInt1248 * -34734835)) + (class441_1396_.aFloatArray4916[6] * (float) (class103.anInt1251 * 1665462351)));
					f_1432_ += ((class441_1396_.aFloatArray4916[3] * (float) (class103.anInt1248 * -34734835)) + (class441_1396_.aFloatArray4916[7] * (float) (class103.anInt1251 * 1665462351)));
					if (f_1431_ > -f_1432_) {
						f_1429_ += ((class441_1396_.aFloatArray4916[0] * (float) (class103.anInt1248 * -34734835)) + (class441_1396_.aFloatArray4916[4] * (float) (class103.anInt1251 * 1665462351)));
						f_1430_ += ((class441_1396_.aFloatArray4916[1] * (float) (class103.anInt1248 * -34734835)) + (class441_1396_.aFloatArray4916[5] * (float) (class103.anInt1251 * 1665462351)));
						float f_1433_ = (aClass178_Sub3_9049.aFloat9828 + (aClass178_Sub3_9049.aFloat9827 * f_1429_ / f_1432_));
						float f_1434_ = (aClass178_Sub3_9049.aFloat9830 + (aClass178_Sub3_9049.aFloat9829 * f_1430_ / f_1432_));
						float f_1435_ = (class103.aFloat1249 * (float) class101.aShort1238);
						float f_1436_ = (class103.aFloat1250 * (float) class101.aShort1239);
						float f_1437_ = (f_1429_ + class441_1396_.aFloatArray4916[0] * f_1435_ + class441_1396_.aFloatArray4916[4] * f_1436_);
						float f_1438_ = (f_1430_ + class441_1396_.aFloatArray4916[1] * f_1435_ + class441_1396_.aFloatArray4916[5] * f_1436_);
						float f_1439_ = (f_1432_ + class441_1396_.aFloatArray4916[3] * f_1435_ + class441_1396_.aFloatArray4916[7] * f_1436_);
						float f_1440_ = (aClass178_Sub3_9049.aFloat9828 + (aClass178_Sub3_9049.aFloat9827 * f_1437_ / f_1439_));
						float f_1441_ = (aClass178_Sub3_9049.aFloat9830 + (aClass178_Sub3_9049.aFloat9829 * f_1438_ / f_1439_));
						class103.anInt1254 = (int) f_1433_ * -396393361;
						class103.anInt1255 = (int) f_1434_ * -1883440415;
						class103.aFloat1256 = (aClass178_Sub3_9049.aFloat9832 + (aClass178_Sub3_9049.aFloat9833 * (f_1431_ - (class441_1396_.aFloatArray4916[10] * (float) (class101.anInt1244 * 1633012149))) / f_1432_));
						class103.anInt1257 = (int) (f_1440_ < f_1433_ ? f_1433_ - f_1440_ : f_1440_ - f_1433_) * -229098483;
						class103.anInt1252 = (int) (f_1441_ < f_1434_ ? f_1434_ - f_1441_ : f_1441_ - f_1434_) * 433876727;
					} else {
						Class103 class103_1442_ = class103;
						class103.anInt1252 = 0;
						class103_1442_.anInt1257 = 0;
					}
				}
			}
			if (class180 != null) {
				boolean bool_1443_ = false;
				boolean bool_1444_ = true;
				int i_1445_ = aShort9090 + aShort9111 >> 1;
				int i_1446_ = aShort9112 + aShort9113 >> 1;
				int i_1447_ = i_1445_;
				short i_1448_ = aShort9108;
				int i_1449_ = i_1446_;
				float f_1450_ = (class441_1412_.aFloatArray4916[0] * (float) i_1447_ + class441_1412_.aFloatArray4916[4] * (float) i_1448_ + class441_1412_.aFloatArray4916[8] * (float) i_1449_ + class441_1412_.aFloatArray4916[12]);
				float f_1451_ = (class441_1412_.aFloatArray4916[1] * (float) i_1447_ + class441_1412_.aFloatArray4916[5] * (float) i_1448_ + class441_1412_.aFloatArray4916[9] * (float) i_1449_ + class441_1412_.aFloatArray4916[13]);
				float f_1452_ = (class441_1412_.aFloatArray4916[2] * (float) i_1447_ + class441_1412_.aFloatArray4916[6] * (float) i_1448_ + class441_1412_.aFloatArray4916[10] * (float) i_1449_ + class441_1412_.aFloatArray4916[14]);
				float f_1453_ = (class441_1412_.aFloatArray4916[3] * (float) i_1447_ + class441_1412_.aFloatArray4916[7] * (float) i_1448_ + class441_1412_.aFloatArray4916[11] * (float) i_1449_ + class441_1412_.aFloatArray4916[15]);
				if (f_1452_ >= -f_1453_) {
					class180.anInt1999 = (int) (aClass178_Sub3_9049.aFloat9828 + (aClass178_Sub3_9049.aFloat9827 * f_1450_ / f_1453_));
					class180.anInt2002 = (int) (aClass178_Sub3_9049.aFloat9830 + (aClass178_Sub3_9049.aFloat9829 * f_1451_ / f_1453_));
				} else
					bool_1443_ = true;
				i_1447_ = i_1445_;
				i_1448_ = aShort9109;
				i_1449_ = i_1446_;
				float f_1454_ = (class441_1412_.aFloatArray4916[0] * (float) i_1447_ + class441_1412_.aFloatArray4916[4] * (float) i_1448_ + class441_1412_.aFloatArray4916[8] * (float) i_1449_ + class441_1412_.aFloatArray4916[12]);
				float f_1455_ = (class441_1412_.aFloatArray4916[1] * (float) i_1447_ + class441_1412_.aFloatArray4916[5] * (float) i_1448_ + class441_1412_.aFloatArray4916[9] * (float) i_1449_ + class441_1412_.aFloatArray4916[13]);
				float f_1456_ = (class441_1412_.aFloatArray4916[2] * (float) i_1447_ + class441_1412_.aFloatArray4916[6] * (float) i_1448_ + class441_1412_.aFloatArray4916[10] * (float) i_1449_ + class441_1412_.aFloatArray4916[14]);
				float f_1457_ = (class441_1412_.aFloatArray4916[3] * (float) i_1447_ + class441_1412_.aFloatArray4916[7] * (float) i_1448_ + class441_1412_.aFloatArray4916[11] * (float) i_1449_ + class441_1412_.aFloatArray4916[15]);
				if (f_1456_ >= -f_1457_) {
					class180.anInt1998 = (int) (aClass178_Sub3_9049.aFloat9828 + (aClass178_Sub3_9049.aFloat9827 * f_1454_ / f_1457_));
					class180.anInt2003 = (int) (aClass178_Sub3_9049.aFloat9830 + (aClass178_Sub3_9049.aFloat9829 * f_1455_ / f_1457_));
				} else
					bool_1443_ = true;
				if (bool_1443_) {
					if (f_1452_ < -f_1453_ && f_1456_ < -f_1457_)
						bool_1444_ = false;
					else if (f_1452_ < -f_1453_) {
						float f_1458_ = (f_1452_ + f_1453_) / (f_1456_ + f_1457_) - 1.0F;
						float f_1459_ = f_1450_ + f_1458_ * (f_1454_ - f_1450_);
						float f_1460_ = f_1451_ + f_1458_ * (f_1455_ - f_1451_);
						float f_1461_ = f_1453_ + f_1458_ * (f_1457_ - f_1453_);
						class180.anInt1999 = (int) (aClass178_Sub3_9049.aFloat9828 + (aClass178_Sub3_9049.aFloat9827 * f_1459_ / f_1461_));
						class180.anInt2002 = (int) (aClass178_Sub3_9049.aFloat9830 + (aClass178_Sub3_9049.aFloat9829 * f_1460_ / f_1461_));
					} else if (f_1456_ < -f_1457_) {
						float f_1462_ = (f_1456_ + f_1457_) / (f_1452_ + f_1453_) - 1.0F;
						float f_1463_ = f_1454_ + f_1462_ * (f_1450_ - f_1454_);
						float f_1464_ = f_1455_ + f_1462_ * (f_1451_ - f_1455_);
						float f_1465_ = f_1457_ + f_1462_ * (f_1453_ - f_1457_);
						class180.anInt1998 = (int) (aClass178_Sub3_9049.aFloat9828 + (aClass178_Sub3_9049.aFloat9827 * f_1463_ / f_1465_));
						class180.anInt2003 = (int) (aClass178_Sub3_9049.aFloat9830 + (aClass178_Sub3_9049.aFloat9829 * f_1464_ / f_1465_));
					}
				}
				if (bool_1444_) {
					if (f_1452_ / f_1453_ > f_1456_ / f_1457_) {
						float f_1466_ = (f_1450_ + (class441_1396_.aFloatArray4916[0] * (float) aShort9082) + class441_1396_.aFloatArray4916[12]);
						float f_1467_ = (f_1453_ + (class441_1396_.aFloatArray4916[3] * (float) aShort9082) + class441_1396_.aFloatArray4916[15]);
						class180.anInt2001 = (int) (aClass178_Sub3_9049.aFloat9828 - (float) class180.anInt1999 + (aClass178_Sub3_9049.aFloat9827 * f_1466_ / f_1467_));
					} else {
						float f_1468_ = (f_1454_ + (class441_1396_.aFloatArray4916[0] * (float) aShort9082) + class441_1396_.aFloatArray4916[12]);
						float f_1469_ = (f_1457_ + (class441_1396_.aFloatArray4916[3] * (float) aShort9082) + class441_1396_.aFloatArray4916[15]);
						class180.anInt2001 = (int) (aClass178_Sub3_9049.aFloat9828 - (float) class180.anInt1998 + (aClass178_Sub3_9049.aFloat9827 * f_1468_ / f_1469_));
					}
					class180.aBool2000 = true;
				}
			}
			method14459(true);
			aClass118_9118.aBool1465 = (i & 0x1) == 0;
			aClass118_9118.aBool1437 = false;
			try {
				method14471(aClass178_Sub3_9049.anIntArray9804 != null, aClass178_Sub3_9049.aFloatArray9807 != null, (i & 0x4) != 0, bool_1413_, ((aClass99_9069.aBool1189 && f_1411_ > aClass99_9069.aFloat1205) || aClass99_9069.aBool1204));
			} catch (Exception exception) {
				/* empty */
			}
			if (aClass101Array9102 != null) {
				for (int i_1470_ = 0; i_1470_ < anInt9074; i_1470_++)
					anIntArray9129[i_1470_] = -1;
			}
			aClass118_9118 = null;
			if (aClass178_Sub3_9049.anInt9819 * 1353126165 > 1) {
				synchronized (this) {
					aBool9046 = false;
					this.notifyAll();
				}
			}
		}
	}

	void method2835() {
		if (aBool9094) {
			for (int i = 0; i < anInt9061; i++) {
				anIntArray9077[i] = anIntArray9077[i] + 7 >> 4;
				anIntArray9047[i] = anIntArray9047[i] + 7 >> 4;
				anIntArray9065[i] = anIntArray9065[i] + 7 >> 4;
			}
			aBool9094 = false;
		}
		if (aBool9093) {
			method14503();
			aBool9093 = false;
		}
		aBool9105 = false;
	}

	int method14512(int i, int i_1471_) {
		i_1471_ = i_1471_ * (i & 0x7f) >> 7;
		if (i_1471_ < 2)
			i_1471_ = 2;
		else if (i_1471_ > 126)
			i_1471_ = 126;
		return (i & 0xff80) + i_1471_;
	}

	boolean method14513(int i, int i_1472_, float f, float f_1473_, float f_1474_, float f_1475_, float f_1476_, float f_1477_) {
		if ((float) i_1472_ < f && (float) i_1472_ < f_1473_ && (float) i_1472_ < f_1474_)
			return false;
		if ((float) i_1472_ > f && (float) i_1472_ > f_1473_ && (float) i_1472_ > f_1474_)
			return false;
		if ((float) i < f_1475_ && (float) i < f_1476_ && (float) i < f_1477_)
			return false;
		if ((float) i > f_1475_ && (float) i > f_1476_ && (float) i > f_1477_)
			return false;
		return true;
	}

	final boolean method14514(int i) {
		if (aByteArray9086 == null)
			return false;
		if (aByteArray9086[i] == 0)
			return false;
		return true;
	}

	final boolean method14515(int i) {
		if (aByteArray9086 == null)
			return false;
		if (aByteArray9086[i] == 0)
			return false;
		return true;
	}

	public int method2726() {
		return anInt9059;
	}

	final boolean method14516(int i) {
		if (anIntArray9129 == null)
			return false;
		if (anIntArray9129[i] == -1)
			return false;
		return true;
	}

	final boolean method14517(int i) {
		if (anIntArray9129 == null)
			return false;
		if (anIntArray9129[i] == -1)
			return false;
		return true;
	}

	public void method2758() {
		if ((anInt9058 & 0x10) != 16)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i = 0; i < anInt9061; i++)
				anIntArray9065[i] = -anIntArray9065[i];
			if (aClass109Array9067 != null) {
				for (int i = 0; i < anInt9062; i++) {
					if (aClass109Array9067[i] != null)
						aClass109Array9067[i].anInt1327 = -aClass109Array9067[i].anInt1327;
				}
			}
			if (aClass109Array9068 != null) {
				for (int i = 0; i < anInt9062; i++) {
					if (aClass109Array9068[i] != null)
						aClass109Array9068[i].anInt1327 = -aClass109Array9068[i].anInt1327;
				}
			}
			if (aClass96Array9083 != null) {
				for (int i = 0; i < anInt9074; i++) {
					if (aClass96Array9083[i] != null)
						aClass96Array9083[i].anInt1183 = -aClass96Array9083[i].anInt1183;
				}
			}
			short[] is = aShortArray9064;
			aShortArray9064 = aShortArray9063;
			aShortArray9063 = is;
			if (aFloatArrayArray9117 != null) {
				for (int i = 0; i < anInt9074; i++) {
					if (aFloatArrayArray9117[i] != null) {
						float f = aFloatArrayArray9117[i][0];
						aFloatArrayArray9117[i][0] = aFloatArrayArray9117[i][2];
						aFloatArrayArray9117[i][2] = f;
					}
					if (aFloatArrayArray9075[i] != null) {
						float f = aFloatArrayArray9075[i][0];
						aFloatArrayArray9075[i][0] = aFloatArrayArray9075[i][2];
						aFloatArrayArray9075[i][2] = f;
					}
				}
			}
			aBool9105 = false;
			anInt9084 = 0;
		}
	}

	public void method2721(int i) {
		if ((anInt9058 & 0x2000) != 8192)
			throw new IllegalStateException();
		anInt9060 = i;
		anInt9084 = 0;
	}

	final void method14518(boolean bool, boolean bool_1478_, boolean bool_1479_, int i) {
		boolean bool_1480_ = false;
		if (aShortArray9087 != null && aShortArray9087[i] != -1)
			bool_1480_ = (aClass178_Sub3_9049.aClass172_1916.method2895(aShortArray9087[i] & 0xffff, -392237385).aBool1881);
		if (!aClass99_9069.aBool1204) {
			short i_1481_ = aShortArray9064[i];
			short i_1482_ = aShortArray9072[i];
			short i_1483_ = aShortArray9063[i];
			Class441 class441 = aClass178_Sub3_9049.aClass441_9805;
			float f = class441.aFloatArray4916[10];
			float f_1484_ = class441.aFloatArray4916[14];
			float f_1485_ = class441.aFloatArray4916[11];
			float f_1486_ = class441.aFloatArray4916[15];
			float f_1487_ = f_1484_ * f_1485_ - f * f_1486_;
			float f_1488_ = ((aFloatArray9122[i_1481_] - aClass99_9069.aFloat1193) * aClass99_9069.aFloat1213);
			float f_1489_ = ((aFloatArray9122[i_1482_] - aClass99_9069.aFloat1193) * aClass99_9069.aFloat1213);
			float f_1490_ = ((aFloatArray9122[i_1483_] - aClass99_9069.aFloat1193) * aClass99_9069.aFloat1213);
			float f_1491_ = f_1488_ * f_1487_ / (f_1488_ * f_1485_ - f);
			float f_1492_ = f_1489_ * f_1487_ / (f_1489_ * f_1485_ - f);
			float f_1493_ = f_1490_ * f_1487_ / (f_1490_ * f_1485_ - f);
			float f_1494_ = ((f_1491_ - aClass99_9069.aFloat1205) / aClass99_9069.aFloat1191);
			if (f_1494_ > 1.0F)
				f_1494_ = 1.0F;
			else if (f_1494_ < 0.0F)
				f_1494_ = 0.0F;
			float f_1495_ = ((f_1492_ - aClass99_9069.aFloat1205) / aClass99_9069.aFloat1191);
			if (f_1495_ > 1.0F)
				f_1495_ = 1.0F;
			else if (f_1495_ < 0.0F)
				f_1495_ = 0.0F;
			float f_1496_ = ((f_1493_ - aClass99_9069.aFloat1205) / aClass99_9069.aFloat1191);
			if (f_1496_ > 1.0F)
				f_1496_ = 1.0F;
			else if (f_1496_ < 0.0F)
				f_1496_ = 0.0F;
			float f_1497_ = f_1494_ + f_1495_ + f_1496_;
			if (!(f_1497_ >= 3.0F)) {
				if (f_1497_ <= 0.0F)
					method14475(bool, bool_1478_, bool_1479_, i);
				else {
					if (aByteArray9086 == null)
						aClass118_9118.anInt1438 = 0;
					else
						aClass118_9118.anInt1438 = aByteArray9086[i] & 0xff;
					if (!bool_1480_) {
						if (anIntArray9099[i] == -1)
							aClass118_9118.method2031(bool, bool_1478_, bool_1479_, aFloatArray9121[i_1481_], aFloatArray9121[i_1482_], aFloatArray9121[i_1483_], aFloatArray9120[i_1481_], aFloatArray9120[i_1482_], aFloatArray9120[i_1483_], aFloatArray9122[i_1481_], aFloatArray9122[i_1482_], aFloatArray9122[i_1483_], Class234.method4271((Class638.anIntArray8306[(anIntArray9106[i] & 0xffff)]), (aClass99_9069.anInt1192 * 340278173), f_1494_ * 255.0F, 1182526920), Class234.method4271((Class638.anIntArray8306[(anIntArray9106[i] & 0xffff)]), (aClass99_9069.anInt1192 * 340278173), f_1495_ * 255.0F, 204479614), Class234.method4271((Class638.anIntArray8306[(anIntArray9106[i] & 0xffff)]), (aClass99_9069.anInt1192 * 340278173), f_1496_ * 255.0F, -797718716));
						else
							aClass118_9118.method2031(bool, bool_1478_, bool_1479_, aFloatArray9121[i_1481_], aFloatArray9121[i_1482_], aFloatArray9121[i_1483_], aFloatArray9120[i_1481_], aFloatArray9120[i_1482_], aFloatArray9120[i_1483_], aFloatArray9122[i_1481_], aFloatArray9122[i_1482_], aFloatArray9122[i_1483_], Class234.method4271((Class638.anIntArray8306[(anIntArray9106[i] & 0xffff)]), (aClass99_9069.anInt1192 * 340278173), f_1494_ * 255.0F, 936103752), Class234.method4271((Class638.anIntArray8306[(anIntArray9079[i] & 0xffff)]), (aClass99_9069.anInt1192 * 340278173), f_1495_ * 255.0F, -2123035833), Class234.method4271((Class638.anIntArray8306[(anIntArray9099[i] & 0xffff)]), (aClass99_9069.anInt1192 * 340278173), f_1496_ * 255.0F, -1357373288));
					} else {
						int i_1498_ = -16777216;
						if (aByteArray9086 != null)
							i_1498_ = 255 - (aByteArray9086[i] & 0xff) << 24;
						if (anIntArray9099[i] == -1) {
							int i_1499_ = i_1498_ | anIntArray9106[i] & 0xffffff;
							aClass118_9118.method2053(bool, bool_1478_, bool_1479_, aFloatArray9121[i_1481_], aFloatArray9121[i_1482_], aFloatArray9121[i_1483_], aFloatArray9120[i_1481_], aFloatArray9120[i_1482_], aFloatArray9120[i_1483_], aFloatArray9122[i_1481_], aFloatArray9122[i_1482_], aFloatArray9122[i_1483_], aFloatArray9123[i_1481_], aFloatArray9123[i_1482_], aFloatArray9123[i_1483_], aFloatArrayArray9117[i][0], aFloatArrayArray9117[i][1], aFloatArrayArray9117[i][2], aFloatArrayArray9075[i][0], aFloatArrayArray9075[i][1], aFloatArrayArray9075[i][2], i_1499_, i_1499_, i_1499_, aClass99_9069.anInt1192 * 340278173, f_1494_ * 255.0F, f_1495_ * 255.0F, f_1496_ * 255.0F, aShortArray9087[i] & 0xffff);
						} else
							aClass118_9118.method2053(bool, bool_1478_, bool_1479_, aFloatArray9121[i_1481_], aFloatArray9121[i_1482_], aFloatArray9121[i_1483_], aFloatArray9120[i_1481_], aFloatArray9120[i_1482_], aFloatArray9120[i_1483_], aFloatArray9122[i_1481_], aFloatArray9122[i_1482_], aFloatArray9122[i_1483_], aFloatArray9123[i_1481_], aFloatArray9123[i_1482_], aFloatArray9123[i_1483_], aFloatArrayArray9117[i][0], aFloatArrayArray9117[i][1], aFloatArrayArray9117[i][2], aFloatArrayArray9075[i][0], aFloatArrayArray9075[i][1], aFloatArrayArray9075[i][2], i_1498_ | anIntArray9106[i] & 0xffffff, i_1498_ | anIntArray9079[i] & 0xffffff, i_1498_ | anIntArray9099[i] & 0xffffff, aClass99_9069.anInt1192 * 340278173, f_1494_ * 255.0F, f_1495_ * 255.0F, f_1496_ * 255.0F, aShortArray9087[i] & 0xffff);
					}
				}
			}
		} else {
			short i_1500_ = aShortArray9064[i];
			short i_1501_ = aShortArray9072[i];
			short i_1502_ = aShortArray9063[i];
			float f = 0.0F;
			float f_1503_ = 0.0F;
			float f_1504_ = 0.0F;
			if (anIntArray9119[i_1500_] > aClass99_9069.anInt1196 * -1631965377)
				f = 1.0F;
			else if (anIntArray9119[i_1500_] > aClass99_9069.anInt1195 * 2137640809)
				f = ((float) (aClass99_9069.anInt1195 * 2137640809 - anIntArray9119[i_1500_]) * 1.0F / (float) (aClass99_9069.anInt1195 * 2137640809 - aClass99_9069.anInt1196 * -1631965377));
			if (anIntArray9119[i_1501_] > aClass99_9069.anInt1196 * -1631965377)
				f_1503_ = 1.0F;
			else if (anIntArray9119[i_1501_] > aClass99_9069.anInt1195 * 2137640809)
				f_1503_ = ((float) (aClass99_9069.anInt1195 * 2137640809 - anIntArray9119[i_1501_]) * 1.0F / (float) (aClass99_9069.anInt1195 * 2137640809 - aClass99_9069.anInt1196 * -1631965377));
			if (anIntArray9119[i_1502_] > aClass99_9069.anInt1196 * -1631965377)
				f_1504_ = 1.0F;
			else if (anIntArray9119[i_1502_] > aClass99_9069.anInt1195 * 2137640809)
				f_1504_ = ((float) (aClass99_9069.anInt1195 * 2137640809 - anIntArray9119[i_1502_]) * 1.0F / (float) (aClass99_9069.anInt1195 * 2137640809 - aClass99_9069.anInt1196 * -1631965377));
			if (aByteArray9086 == null)
				aClass118_9118.anInt1438 = 0;
			else
				aClass118_9118.anInt1438 = aByteArray9086[i] & 0xff;
			if (!bool_1480_) {
				if (anIntArray9099[i] == -1)
					aClass118_9118.method2031(bool, bool_1478_, bool_1479_, aFloatArray9121[i_1500_], aFloatArray9121[i_1501_], aFloatArray9121[i_1502_], aFloatArray9120[i_1500_], aFloatArray9120[i_1501_], aFloatArray9120[i_1502_], aFloatArray9122[i_1500_], aFloatArray9122[i_1501_], aFloatArray9122[i_1502_], Class234.method4271((Class638.anIntArray8306[anIntArray9106[i] & 0xffff]), (aClass99_9069.anInt1192 * 340278173), f * 255.0F, -835243986), Class234.method4271((Class638.anIntArray8306[anIntArray9106[i] & 0xffff]), (aClass99_9069.anInt1192 * 340278173), f_1503_ * 255.0F, -1529692506), Class234.method4271((Class638.anIntArray8306[anIntArray9106[i] & 0xffff]), (aClass99_9069.anInt1192 * 340278173), f_1504_ * 255.0F, -9634799));
				else
					aClass118_9118.method2031(bool, bool_1478_, bool_1479_, aFloatArray9121[i_1500_], aFloatArray9121[i_1501_], aFloatArray9121[i_1502_], aFloatArray9120[i_1500_], aFloatArray9120[i_1501_], aFloatArray9120[i_1502_], aFloatArray9122[i_1500_], aFloatArray9122[i_1501_], aFloatArray9122[i_1502_], Class234.method4271((Class638.anIntArray8306[anIntArray9106[i] & 0xffff]), (aClass99_9069.anInt1192 * 340278173), f * 255.0F, -982443217), Class234.method4271((Class638.anIntArray8306[anIntArray9079[i] & 0xffff]), (aClass99_9069.anInt1192 * 340278173), f_1503_ * 255.0F, -1933981922), Class234.method4271((Class638.anIntArray8306[anIntArray9099[i] & 0xffff]), (aClass99_9069.anInt1192 * 340278173), f_1504_ * 255.0F, -981771645));
			} else {
				int i_1505_ = -16777216;
				if (aByteArray9086 != null)
					i_1505_ = 255 - (aByteArray9086[i] & 0xff) << 24;
				if (anIntArray9099[i] == -1) {
					int i_1506_ = i_1505_ | anIntArray9106[i] & 0xffffff;
					aClass118_9118.method2053(bool, bool_1478_, bool_1479_, aFloatArray9121[i_1500_], aFloatArray9121[i_1501_], aFloatArray9121[i_1502_], aFloatArray9120[i_1500_], aFloatArray9120[i_1501_], aFloatArray9120[i_1502_], aFloatArray9122[i_1500_], aFloatArray9122[i_1501_], aFloatArray9122[i_1502_], aFloatArray9123[i_1500_], aFloatArray9123[i_1501_], aFloatArray9123[i_1502_], aFloatArrayArray9117[i][0], aFloatArrayArray9117[i][1], aFloatArrayArray9117[i][2], aFloatArrayArray9075[i][0], aFloatArrayArray9075[i][1], aFloatArrayArray9075[i][2], i_1506_, i_1506_, i_1506_, aClass99_9069.anInt1192 * 340278173, f * 255.0F, f_1503_ * 255.0F, f_1504_ * 255.0F, aShortArray9087[i] & 0xffff);
				} else
					aClass118_9118.method2053(bool, bool_1478_, bool_1479_, aFloatArray9121[i_1500_], aFloatArray9121[i_1501_], aFloatArray9121[i_1502_], aFloatArray9120[i_1500_], aFloatArray9120[i_1501_], aFloatArray9120[i_1502_], aFloatArray9122[i_1500_], aFloatArray9122[i_1501_], aFloatArray9122[i_1502_], aFloatArray9123[i_1500_], aFloatArray9123[i_1501_], aFloatArray9123[i_1502_], aFloatArrayArray9117[i][0], aFloatArrayArray9117[i][1], aFloatArrayArray9117[i][2], aFloatArrayArray9075[i][0], aFloatArrayArray9075[i][1], aFloatArrayArray9075[i][2], i_1505_ | anIntArray9106[i] & 0xffffff, i_1505_ | anIntArray9079[i] & 0xffffff, i_1505_ | anIntArray9099[i] & 0xffffff, aClass99_9069.anInt1192 * 340278173, f * 255.0F, f_1503_ * 255.0F, f_1504_ * 255.0F, aShortArray9087[i] & 0xffff);
			}
		}
	}

	final void method14519(boolean bool, boolean bool_1507_, boolean bool_1508_, int i) {
		boolean bool_1509_ = false;
		if (aShortArray9087 != null && aShortArray9087[i] != -1)
			bool_1509_ = (aClass178_Sub3_9049.aClass172_1916.method2895(aShortArray9087[i] & 0xffff, 521973831).aBool1881);
		if (!aClass99_9069.aBool1204) {
			short i_1510_ = aShortArray9064[i];
			short i_1511_ = aShortArray9072[i];
			short i_1512_ = aShortArray9063[i];
			Class441 class441 = aClass178_Sub3_9049.aClass441_9805;
			float f = class441.aFloatArray4916[10];
			float f_1513_ = class441.aFloatArray4916[14];
			float f_1514_ = class441.aFloatArray4916[11];
			float f_1515_ = class441.aFloatArray4916[15];
			float f_1516_ = f_1513_ * f_1514_ - f * f_1515_;
			float f_1517_ = ((aFloatArray9122[i_1510_] - aClass99_9069.aFloat1193) * aClass99_9069.aFloat1213);
			float f_1518_ = ((aFloatArray9122[i_1511_] - aClass99_9069.aFloat1193) * aClass99_9069.aFloat1213);
			float f_1519_ = ((aFloatArray9122[i_1512_] - aClass99_9069.aFloat1193) * aClass99_9069.aFloat1213);
			float f_1520_ = f_1517_ * f_1516_ / (f_1517_ * f_1514_ - f);
			float f_1521_ = f_1518_ * f_1516_ / (f_1518_ * f_1514_ - f);
			float f_1522_ = f_1519_ * f_1516_ / (f_1519_ * f_1514_ - f);
			float f_1523_ = ((f_1520_ - aClass99_9069.aFloat1205) / aClass99_9069.aFloat1191);
			if (f_1523_ > 1.0F)
				f_1523_ = 1.0F;
			else if (f_1523_ < 0.0F)
				f_1523_ = 0.0F;
			float f_1524_ = ((f_1521_ - aClass99_9069.aFloat1205) / aClass99_9069.aFloat1191);
			if (f_1524_ > 1.0F)
				f_1524_ = 1.0F;
			else if (f_1524_ < 0.0F)
				f_1524_ = 0.0F;
			float f_1525_ = ((f_1522_ - aClass99_9069.aFloat1205) / aClass99_9069.aFloat1191);
			if (f_1525_ > 1.0F)
				f_1525_ = 1.0F;
			else if (f_1525_ < 0.0F)
				f_1525_ = 0.0F;
			float f_1526_ = f_1523_ + f_1524_ + f_1525_;
			if (!(f_1526_ >= 3.0F)) {
				if (f_1526_ <= 0.0F)
					method14475(bool, bool_1507_, bool_1508_, i);
				else {
					if (aByteArray9086 == null)
						aClass118_9118.anInt1438 = 0;
					else
						aClass118_9118.anInt1438 = aByteArray9086[i] & 0xff;
					if (!bool_1509_) {
						if (anIntArray9099[i] == -1)
							aClass118_9118.method2031(bool, bool_1507_, bool_1508_, aFloatArray9121[i_1510_], aFloatArray9121[i_1511_], aFloatArray9121[i_1512_], aFloatArray9120[i_1510_], aFloatArray9120[i_1511_], aFloatArray9120[i_1512_], aFloatArray9122[i_1510_], aFloatArray9122[i_1511_], aFloatArray9122[i_1512_], Class234.method4271((Class638.anIntArray8306[(anIntArray9106[i] & 0xffff)]), (aClass99_9069.anInt1192 * 340278173), f_1523_ * 255.0F, 786665872), Class234.method4271((Class638.anIntArray8306[(anIntArray9106[i] & 0xffff)]), (aClass99_9069.anInt1192 * 340278173), f_1524_ * 255.0F, 106019083), Class234.method4271((Class638.anIntArray8306[(anIntArray9106[i] & 0xffff)]), (aClass99_9069.anInt1192 * 340278173), f_1525_ * 255.0F, -1479760495));
						else
							aClass118_9118.method2031(bool, bool_1507_, bool_1508_, aFloatArray9121[i_1510_], aFloatArray9121[i_1511_], aFloatArray9121[i_1512_], aFloatArray9120[i_1510_], aFloatArray9120[i_1511_], aFloatArray9120[i_1512_], aFloatArray9122[i_1510_], aFloatArray9122[i_1511_], aFloatArray9122[i_1512_], Class234.method4271((Class638.anIntArray8306[(anIntArray9106[i] & 0xffff)]), (aClass99_9069.anInt1192 * 340278173), f_1523_ * 255.0F, -2128743535), Class234.method4271((Class638.anIntArray8306[(anIntArray9079[i] & 0xffff)]), (aClass99_9069.anInt1192 * 340278173), f_1524_ * 255.0F, 435254672), Class234.method4271((Class638.anIntArray8306[(anIntArray9099[i] & 0xffff)]), (aClass99_9069.anInt1192 * 340278173), f_1525_ * 255.0F, 646845524));
					} else {
						int i_1527_ = -16777216;
						if (aByteArray9086 != null)
							i_1527_ = 255 - (aByteArray9086[i] & 0xff) << 24;
						if (anIntArray9099[i] == -1) {
							int i_1528_ = i_1527_ | anIntArray9106[i] & 0xffffff;
							aClass118_9118.method2053(bool, bool_1507_, bool_1508_, aFloatArray9121[i_1510_], aFloatArray9121[i_1511_], aFloatArray9121[i_1512_], aFloatArray9120[i_1510_], aFloatArray9120[i_1511_], aFloatArray9120[i_1512_], aFloatArray9122[i_1510_], aFloatArray9122[i_1511_], aFloatArray9122[i_1512_], aFloatArray9123[i_1510_], aFloatArray9123[i_1511_], aFloatArray9123[i_1512_], aFloatArrayArray9117[i][0], aFloatArrayArray9117[i][1], aFloatArrayArray9117[i][2], aFloatArrayArray9075[i][0], aFloatArrayArray9075[i][1], aFloatArrayArray9075[i][2], i_1528_, i_1528_, i_1528_, aClass99_9069.anInt1192 * 340278173, f_1523_ * 255.0F, f_1524_ * 255.0F, f_1525_ * 255.0F, aShortArray9087[i] & 0xffff);
						} else
							aClass118_9118.method2053(bool, bool_1507_, bool_1508_, aFloatArray9121[i_1510_], aFloatArray9121[i_1511_], aFloatArray9121[i_1512_], aFloatArray9120[i_1510_], aFloatArray9120[i_1511_], aFloatArray9120[i_1512_], aFloatArray9122[i_1510_], aFloatArray9122[i_1511_], aFloatArray9122[i_1512_], aFloatArray9123[i_1510_], aFloatArray9123[i_1511_], aFloatArray9123[i_1512_], aFloatArrayArray9117[i][0], aFloatArrayArray9117[i][1], aFloatArrayArray9117[i][2], aFloatArrayArray9075[i][0], aFloatArrayArray9075[i][1], aFloatArrayArray9075[i][2], i_1527_ | anIntArray9106[i] & 0xffffff, i_1527_ | anIntArray9079[i] & 0xffffff, i_1527_ | anIntArray9099[i] & 0xffffff, aClass99_9069.anInt1192 * 340278173, f_1523_ * 255.0F, f_1524_ * 255.0F, f_1525_ * 255.0F, aShortArray9087[i] & 0xffff);
					}
				}
			}
		} else {
			short i_1529_ = aShortArray9064[i];
			short i_1530_ = aShortArray9072[i];
			short i_1531_ = aShortArray9063[i];
			float f = 0.0F;
			float f_1532_ = 0.0F;
			float f_1533_ = 0.0F;
			if (anIntArray9119[i_1529_] > aClass99_9069.anInt1196 * -1631965377)
				f = 1.0F;
			else if (anIntArray9119[i_1529_] > aClass99_9069.anInt1195 * 2137640809)
				f = ((float) (aClass99_9069.anInt1195 * 2137640809 - anIntArray9119[i_1529_]) * 1.0F / (float) (aClass99_9069.anInt1195 * 2137640809 - aClass99_9069.anInt1196 * -1631965377));
			if (anIntArray9119[i_1530_] > aClass99_9069.anInt1196 * -1631965377)
				f_1532_ = 1.0F;
			else if (anIntArray9119[i_1530_] > aClass99_9069.anInt1195 * 2137640809)
				f_1532_ = ((float) (aClass99_9069.anInt1195 * 2137640809 - anIntArray9119[i_1530_]) * 1.0F / (float) (aClass99_9069.anInt1195 * 2137640809 - aClass99_9069.anInt1196 * -1631965377));
			if (anIntArray9119[i_1531_] > aClass99_9069.anInt1196 * -1631965377)
				f_1533_ = 1.0F;
			else if (anIntArray9119[i_1531_] > aClass99_9069.anInt1195 * 2137640809)
				f_1533_ = ((float) (aClass99_9069.anInt1195 * 2137640809 - anIntArray9119[i_1531_]) * 1.0F / (float) (aClass99_9069.anInt1195 * 2137640809 - aClass99_9069.anInt1196 * -1631965377));
			if (aByteArray9086 == null)
				aClass118_9118.anInt1438 = 0;
			else
				aClass118_9118.anInt1438 = aByteArray9086[i] & 0xff;
			if (!bool_1509_) {
				if (anIntArray9099[i] == -1)
					aClass118_9118.method2031(bool, bool_1507_, bool_1508_, aFloatArray9121[i_1529_], aFloatArray9121[i_1530_], aFloatArray9121[i_1531_], aFloatArray9120[i_1529_], aFloatArray9120[i_1530_], aFloatArray9120[i_1531_], aFloatArray9122[i_1529_], aFloatArray9122[i_1530_], aFloatArray9122[i_1531_], Class234.method4271((Class638.anIntArray8306[anIntArray9106[i] & 0xffff]), (aClass99_9069.anInt1192 * 340278173), f * 255.0F, 286310896), Class234.method4271((Class638.anIntArray8306[anIntArray9106[i] & 0xffff]), (aClass99_9069.anInt1192 * 340278173), f_1532_ * 255.0F, 669166107), Class234.method4271((Class638.anIntArray8306[anIntArray9106[i] & 0xffff]), (aClass99_9069.anInt1192 * 340278173), f_1533_ * 255.0F, -1899940198));
				else
					aClass118_9118.method2031(bool, bool_1507_, bool_1508_, aFloatArray9121[i_1529_], aFloatArray9121[i_1530_], aFloatArray9121[i_1531_], aFloatArray9120[i_1529_], aFloatArray9120[i_1530_], aFloatArray9120[i_1531_], aFloatArray9122[i_1529_], aFloatArray9122[i_1530_], aFloatArray9122[i_1531_], Class234.method4271((Class638.anIntArray8306[anIntArray9106[i] & 0xffff]), (aClass99_9069.anInt1192 * 340278173), f * 255.0F, -1639501896), Class234.method4271((Class638.anIntArray8306[anIntArray9079[i] & 0xffff]), (aClass99_9069.anInt1192 * 340278173), f_1532_ * 255.0F, 1163803778), Class234.method4271((Class638.anIntArray8306[anIntArray9099[i] & 0xffff]), (aClass99_9069.anInt1192 * 340278173), f_1533_ * 255.0F, -1694954193));
			} else {
				int i_1534_ = -16777216;
				if (aByteArray9086 != null)
					i_1534_ = 255 - (aByteArray9086[i] & 0xff) << 24;
				if (anIntArray9099[i] == -1) {
					int i_1535_ = i_1534_ | anIntArray9106[i] & 0xffffff;
					aClass118_9118.method2053(bool, bool_1507_, bool_1508_, aFloatArray9121[i_1529_], aFloatArray9121[i_1530_], aFloatArray9121[i_1531_], aFloatArray9120[i_1529_], aFloatArray9120[i_1530_], aFloatArray9120[i_1531_], aFloatArray9122[i_1529_], aFloatArray9122[i_1530_], aFloatArray9122[i_1531_], aFloatArray9123[i_1529_], aFloatArray9123[i_1530_], aFloatArray9123[i_1531_], aFloatArrayArray9117[i][0], aFloatArrayArray9117[i][1], aFloatArrayArray9117[i][2], aFloatArrayArray9075[i][0], aFloatArrayArray9075[i][1], aFloatArrayArray9075[i][2], i_1535_, i_1535_, i_1535_, aClass99_9069.anInt1192 * 340278173, f * 255.0F, f_1532_ * 255.0F, f_1533_ * 255.0F, aShortArray9087[i] & 0xffff);
				} else
					aClass118_9118.method2053(bool, bool_1507_, bool_1508_, aFloatArray9121[i_1529_], aFloatArray9121[i_1530_], aFloatArray9121[i_1531_], aFloatArray9120[i_1529_], aFloatArray9120[i_1530_], aFloatArray9120[i_1531_], aFloatArray9122[i_1529_], aFloatArray9122[i_1530_], aFloatArray9122[i_1531_], aFloatArray9123[i_1529_], aFloatArray9123[i_1530_], aFloatArray9123[i_1531_], aFloatArrayArray9117[i][0], aFloatArrayArray9117[i][1], aFloatArrayArray9117[i][2], aFloatArrayArray9075[i][0], aFloatArrayArray9075[i][1], aFloatArrayArray9075[i][2], i_1534_ | anIntArray9106[i] & 0xffffff, i_1534_ | anIntArray9079[i] & 0xffffff, i_1534_ | anIntArray9099[i] & 0xffffff, aClass99_9069.anInt1192 * 340278173, f * 255.0F, f_1532_ * 255.0F, f_1533_ * 255.0F, aShortArray9087[i] & 0xffff);
			}
		}
	}

	public void method2872(int i) {
		if ((anInt9058 & 0x1000) != 4096)
			throw new IllegalStateException();
		anInt9059 = i;
		anInt9084 = 0;
	}

	public int method2803() {
		if (!aBool9105)
			method14478();
		return aShort9109;
	}

	public void method2692(int i, int i_1536_, Class142 class142, Class142 class142_1537_, int i_1538_, int i_1539_, int i_1540_) {
		if (i == 3) {
			if ((anInt9058 & 0x7) != 7)
				throw new IllegalStateException();
		} else if ((anInt9058 & 0x2) != 2)
			throw new IllegalStateException();
		if (!aBool9105)
			method14478();
		int i_1541_ = i_1538_ + aShort9090;
		int i_1542_ = i_1538_ + aShort9111;
		int i_1543_ = i_1540_ + aShort9112;
		int i_1544_ = i_1540_ + aShort9113;
		if (i == 4 || (i_1541_ >= 0 && ((i_1542_ + class142.anInt1682 * 341909049 >> class142.anInt1680 * -1193058675) < class142.anInt1683 * 692304099) && i_1543_ >= 0 && ((i_1544_ + class142.anInt1682 * 341909049 >> class142.anInt1680 * -1193058675) < class142.anInt1681 * 452998539))) {
			int[][] is = class142.anIntArrayArray1684;
			int[][] is_1545_ = null;
			if (class142_1537_ != null)
				is_1545_ = class142_1537_.anIntArrayArray1684;
			if (i == 4 || i == 5) {
				if (class142_1537_ == null || (i_1541_ < 0 || ((i_1542_ + class142_1537_.anInt1682 * 341909049 >> class142_1537_.anInt1680 * -1193058675) >= class142_1537_.anInt1683 * 692304099) || i_1543_ < 0 || ((i_1544_ + class142_1537_.anInt1682 * 341909049 >> class142_1537_.anInt1680 * -1193058675) >= class142_1537_.anInt1681 * 452998539)))
					return;
			} else {
				i_1541_ >>= class142.anInt1680 * -1193058675;
				i_1542_ = (i_1542_ + (class142.anInt1682 * 341909049 - 1) >> class142.anInt1680 * -1193058675);
				i_1543_ >>= class142.anInt1680 * -1193058675;
				i_1544_ = (i_1544_ + (class142.anInt1682 * 341909049 - 1) >> class142.anInt1680 * -1193058675);
				if (is[i_1541_][i_1543_] == i_1539_ && is[i_1542_][i_1543_] == i_1539_ && is[i_1541_][i_1544_] == i_1539_ && is[i_1542_][i_1544_] == i_1539_)
					return;
			}
			synchronized (this) {
				if (i == 1) {
					int i_1546_ = class142.anInt1682 * 341909049 - 1;
					for (int i_1547_ = 0; i_1547_ < anInt9062; i_1547_++) {
						int i_1548_ = anIntArray9077[i_1547_] + i_1538_;
						int i_1549_ = anIntArray9065[i_1547_] + i_1540_;
						int i_1550_ = i_1548_ & i_1546_;
						int i_1551_ = i_1549_ & i_1546_;
						int i_1552_ = i_1548_ >> class142.anInt1680 * -1193058675;
						int i_1553_ = i_1549_ >> class142.anInt1680 * -1193058675;
						int i_1554_ = (((is[i_1552_][i_1553_] * (class142.anInt1682 * 341909049 - i_1550_)) + is[i_1552_ + 1][i_1553_] * i_1550_) >> class142.anInt1680 * -1193058675);
						int i_1555_ = (((is[i_1552_][i_1553_ + 1] * (class142.anInt1682 * 341909049 - i_1550_)) + is[i_1552_ + 1][i_1553_ + 1] * i_1550_) >> class142.anInt1680 * -1193058675);
						int i_1556_ = (i_1554_ * (class142.anInt1682 * 341909049 - i_1551_) + i_1555_ * i_1551_ >> class142.anInt1680 * -1193058675);
						anIntArray9047[i_1547_] = anIntArray9047[i_1547_] + i_1556_ - i_1539_;
					}
					for (int i_1557_ = anInt9062; i_1557_ < anInt9061; i_1557_++) {
						int i_1558_ = anIntArray9077[i_1557_] + i_1538_;
						int i_1559_ = anIntArray9065[i_1557_] + i_1540_;
						int i_1560_ = i_1558_ & i_1546_;
						int i_1561_ = i_1559_ & i_1546_;
						int i_1562_ = i_1558_ >> class142.anInt1680 * -1193058675;
						int i_1563_ = i_1559_ >> class142.anInt1680 * -1193058675;
						if (i_1562_ >= 0 && i_1562_ < is.length - 1 && i_1563_ >= 0 && i_1563_ < is[0].length - 1) {
							int i_1564_ = (((is[i_1562_][i_1563_] * (class142.anInt1682 * 341909049 - i_1560_)) + is[i_1562_ + 1][i_1563_] * i_1560_) >> class142.anInt1680 * -1193058675);
							int i_1565_ = (((is[i_1562_][i_1563_ + 1] * (class142.anInt1682 * 341909049 - i_1560_)) + is[i_1562_ + 1][i_1563_ + 1] * i_1560_) >> class142.anInt1680 * -1193058675);
							int i_1566_ = (i_1564_ * (class142.anInt1682 * 341909049 - i_1561_) + i_1565_ * i_1561_ >> class142.anInt1680 * -1193058675);
							anIntArray9047[i_1557_] = anIntArray9047[i_1557_] + i_1566_ - i_1539_;
						}
					}
				} else if (i == 2) {
					if (aShort9108 == 0)
						return;
					int i_1567_ = class142.anInt1682 * 341909049 - 1;
					for (int i_1568_ = 0; i_1568_ < anInt9062; i_1568_++) {
						int i_1569_ = (anIntArray9047[i_1568_] << 16) / aShort9108;
						if (i_1569_ < i_1536_) {
							int i_1570_ = anIntArray9077[i_1568_] + i_1538_;
							int i_1571_ = anIntArray9065[i_1568_] + i_1540_;
							int i_1572_ = i_1570_ & i_1567_;
							int i_1573_ = i_1571_ & i_1567_;
							int i_1574_ = i_1570_ >> class142.anInt1680 * -1193058675;
							int i_1575_ = i_1571_ >> class142.anInt1680 * -1193058675;
							int i_1576_ = (((is[i_1574_][i_1575_] * (class142.anInt1682 * 341909049 - i_1572_)) + is[i_1574_ + 1][i_1575_] * i_1572_) >> class142.anInt1680 * -1193058675);
							int i_1577_ = (((is[i_1574_][i_1575_ + 1] * (class142.anInt1682 * 341909049 - i_1572_)) + is[i_1574_ + 1][i_1575_ + 1] * i_1572_) >> class142.anInt1680 * -1193058675);
							int i_1578_ = (i_1576_ * (class142.anInt1682 * 341909049 - i_1573_) + i_1577_ * i_1573_ >> class142.anInt1680 * -1193058675);
							anIntArray9047[i_1568_] = (anIntArray9047[i_1568_] + ((i_1578_ - i_1539_) * (i_1536_ - i_1569_) / i_1536_));
						} else
							anIntArray9047[i_1568_] = anIntArray9047[i_1568_];
					}
					for (int i_1579_ = anInt9062; i_1579_ < anInt9061; i_1579_++) {
						int i_1580_ = (anIntArray9047[i_1579_] << 16) / aShort9108;
						if (i_1580_ < i_1536_) {
							int i_1581_ = anIntArray9077[i_1579_] + i_1538_;
							int i_1582_ = anIntArray9065[i_1579_] + i_1540_;
							int i_1583_ = i_1581_ & i_1567_;
							int i_1584_ = i_1582_ & i_1567_;
							int i_1585_ = i_1581_ >> class142.anInt1680 * -1193058675;
							int i_1586_ = i_1582_ >> class142.anInt1680 * -1193058675;
							if (i_1585_ >= 0 && i_1585_ < class142.anInt1683 * 692304099 - 1 && i_1586_ >= 0 && (i_1586_ < class142.anInt1681 * 452998539 - 1)) {
								int i_1587_ = (((is[i_1585_][i_1586_] * (class142.anInt1682 * 341909049 - i_1583_)) + is[i_1585_ + 1][i_1586_] * i_1583_) >> class142.anInt1680 * -1193058675);
								int i_1588_ = (((is[i_1585_][i_1586_ + 1] * (class142.anInt1682 * 341909049 - i_1583_)) + (is[i_1585_ + 1][i_1586_ + 1] * i_1583_)) >> class142.anInt1680 * -1193058675);
								int i_1589_ = ((i_1587_ * (class142.anInt1682 * 341909049 - i_1584_)) + i_1588_ * i_1584_ >> class142.anInt1680 * -1193058675);
								anIntArray9047[i_1579_] = (anIntArray9047[i_1579_] + ((i_1589_ - i_1539_) * (i_1536_ - i_1580_) / i_1536_));
							}
						} else
							anIntArray9047[i_1579_] = anIntArray9047[i_1579_];
					}
				} else if (i == 3) {
					int i_1590_ = (i_1536_ & 0xff) * 16;
					int i_1591_ = (i_1536_ >> 8 & 0xff) * 16;
					int i_1592_ = (i_1536_ >> 16 & 0xff) << 6;
					int i_1593_ = (i_1536_ >> 24 & 0xff) << 6;
					if (i_1538_ - (i_1590_ >> 1) < 0 || ((i_1538_ + (i_1590_ >> 1) + class142.anInt1682 * 341909049) >= (class142.anInt1683 * 692304099 << class142.anInt1680 * -1193058675)) || i_1540_ - (i_1591_ >> 1) < 0 || ((i_1540_ + (i_1591_ >> 1) + class142.anInt1682 * 341909049) >= (class142.anInt1681 * 452998539 << class142.anInt1680 * -1193058675)))
						return;
					method2693(class142, i_1538_, i_1539_, i_1540_, i_1590_, i_1591_, i_1592_, i_1593_);
				} else if (i == 4) {
					int i_1594_ = class142_1537_.anInt1682 * 341909049 - 1;
					int i_1595_ = aShort9109 - aShort9108;
					for (int i_1596_ = 0; i_1596_ < anInt9062; i_1596_++) {
						int i_1597_ = anIntArray9077[i_1596_] + i_1538_;
						int i_1598_ = anIntArray9065[i_1596_] + i_1540_;
						int i_1599_ = i_1597_ & i_1594_;
						int i_1600_ = i_1598_ & i_1594_;
						int i_1601_ = (i_1597_ >> class142_1537_.anInt1680 * -1193058675);
						int i_1602_ = (i_1598_ >> class142_1537_.anInt1680 * -1193058675);
						int i_1603_ = (((is_1545_[i_1601_][i_1602_] * (class142_1537_.anInt1682 * 341909049 - i_1599_)) + is_1545_[i_1601_ + 1][i_1602_] * i_1599_) >> class142_1537_.anInt1680 * -1193058675);
						int i_1604_ = (((is_1545_[i_1601_][i_1602_ + 1] * (class142_1537_.anInt1682 * 341909049 - i_1599_)) + is_1545_[i_1601_ + 1][i_1602_ + 1] * i_1599_) >> class142_1537_.anInt1680 * -1193058675);
						int i_1605_ = (i_1603_ * (class142_1537_.anInt1682 * 341909049 - i_1600_) + i_1604_ * i_1600_ >> class142_1537_.anInt1680 * -1193058675);
						anIntArray9047[i_1596_] = (anIntArray9047[i_1596_] + (i_1605_ - i_1539_) + i_1595_);
					}
					for (int i_1606_ = anInt9062; i_1606_ < anInt9061; i_1606_++) {
						int i_1607_ = anIntArray9077[i_1606_] + i_1538_;
						int i_1608_ = anIntArray9065[i_1606_] + i_1540_;
						int i_1609_ = i_1607_ & i_1594_;
						int i_1610_ = i_1608_ & i_1594_;
						int i_1611_ = (i_1607_ >> class142_1537_.anInt1680 * -1193058675);
						int i_1612_ = (i_1608_ >> class142_1537_.anInt1680 * -1193058675);
						if (i_1611_ >= 0 && (i_1611_ < class142_1537_.anInt1683 * 692304099 - 1) && i_1612_ >= 0 && (i_1612_ < class142_1537_.anInt1681 * 452998539 - 1)) {
							int i_1613_ = (((is_1545_[i_1611_][i_1612_] * (class142_1537_.anInt1682 * 341909049 - i_1609_)) + is_1545_[i_1611_ + 1][i_1612_] * i_1609_) >> class142_1537_.anInt1680 * -1193058675);
							int i_1614_ = (((is_1545_[i_1611_][i_1612_ + 1] * (class142_1537_.anInt1682 * 341909049 - i_1609_)) + (is_1545_[i_1611_ + 1][i_1612_ + 1] * i_1609_)) >> class142_1537_.anInt1680 * -1193058675);
							int i_1615_ = ((i_1613_ * (class142_1537_.anInt1682 * 341909049 - i_1610_)) + i_1614_ * i_1610_ >> class142_1537_.anInt1680 * -1193058675);
							anIntArray9047[i_1606_] = (anIntArray9047[i_1606_] + (i_1615_ - i_1539_) + i_1595_);
						}
					}
				} else if (i == 5) {
					int i_1616_ = class142_1537_.anInt1682 * 341909049 - 1;
					int i_1617_ = aShort9109 - aShort9108;
					for (int i_1618_ = 0; i_1618_ < anInt9062; i_1618_++) {
						int i_1619_ = anIntArray9077[i_1618_] + i_1538_;
						int i_1620_ = anIntArray9065[i_1618_] + i_1540_;
						int i_1621_ = i_1619_ & i_1616_;
						int i_1622_ = i_1620_ & i_1616_;
						int i_1623_ = i_1619_ >> class142.anInt1680 * -1193058675;
						int i_1624_ = i_1620_ >> class142.anInt1680 * -1193058675;
						int i_1625_ = (((is[i_1623_][i_1624_] * (class142.anInt1682 * 341909049 - i_1621_)) + is[i_1623_ + 1][i_1624_] * i_1621_) >> class142.anInt1680 * -1193058675);
						int i_1626_ = (((is[i_1623_][i_1624_ + 1] * (class142.anInt1682 * 341909049 - i_1621_)) + is[i_1623_ + 1][i_1624_ + 1] * i_1621_) >> class142.anInt1680 * -1193058675);
						int i_1627_ = (i_1625_ * (class142.anInt1682 * 341909049 - i_1622_) + i_1626_ * i_1622_ >> class142.anInt1680 * -1193058675);
						i_1625_ = (((is_1545_[i_1623_][i_1624_] * (class142_1537_.anInt1682 * 341909049 - i_1621_)) + is_1545_[i_1623_ + 1][i_1624_] * i_1621_) >> class142_1537_.anInt1680 * -1193058675);
						i_1626_ = (((is_1545_[i_1623_][i_1624_ + 1] * (class142_1537_.anInt1682 * 341909049 - i_1621_)) + is_1545_[i_1623_ + 1][i_1624_ + 1] * i_1621_) >> class142_1537_.anInt1680 * -1193058675);
						int i_1628_ = (i_1625_ * (class142_1537_.anInt1682 * 341909049 - i_1622_) + i_1626_ * i_1622_ >> class142_1537_.anInt1680 * -1193058675);
						int i_1629_ = i_1627_ - i_1628_ - i_1536_;
						anIntArray9047[i_1618_] = ((anIntArray9047[i_1618_] << 8) / i_1617_ * i_1629_ >> 8) - (i_1539_ - i_1627_);
					}
					for (int i_1630_ = anInt9062; i_1630_ < anInt9061; i_1630_++) {
						int i_1631_ = anIntArray9077[i_1630_] + i_1538_;
						int i_1632_ = anIntArray9065[i_1630_] + i_1540_;
						int i_1633_ = i_1631_ & i_1616_;
						int i_1634_ = i_1632_ & i_1616_;
						int i_1635_ = i_1631_ >> class142.anInt1680 * -1193058675;
						int i_1636_ = i_1632_ >> class142.anInt1680 * -1193058675;
						if (i_1635_ >= 0 && i_1635_ < class142.anInt1683 * 692304099 - 1 && (i_1635_ < class142_1537_.anInt1683 * 692304099 - 1) && i_1636_ >= 0 && i_1636_ < class142.anInt1681 * 452998539 - 1 && (i_1636_ < class142_1537_.anInt1681 * 452998539 - 1)) {
							int i_1637_ = (((is[i_1635_][i_1636_] * (class142.anInt1682 * 341909049 - i_1633_)) + is[i_1635_ + 1][i_1636_] * i_1633_) >> class142.anInt1680 * -1193058675);
							int i_1638_ = (((is[i_1635_][i_1636_ + 1] * (class142.anInt1682 * 341909049 - i_1633_)) + is[i_1635_ + 1][i_1636_ + 1] * i_1633_) >> class142.anInt1680 * -1193058675);
							int i_1639_ = (i_1637_ * (class142.anInt1682 * 341909049 - i_1634_) + i_1638_ * i_1634_ >> class142.anInt1680 * -1193058675);
							i_1637_ = (((is_1545_[i_1635_][i_1636_] * (class142_1537_.anInt1682 * 341909049 - i_1633_)) + is_1545_[i_1635_ + 1][i_1636_] * i_1633_) >> class142_1537_.anInt1680 * -1193058675);
							i_1638_ = (((is_1545_[i_1635_][i_1636_ + 1] * (class142_1537_.anInt1682 * 341909049 - i_1633_)) + (is_1545_[i_1635_ + 1][i_1636_ + 1] * i_1633_)) >> class142_1537_.anInt1680 * -1193058675);
							int i_1640_ = ((i_1637_ * (class142_1537_.anInt1682 * 341909049 - i_1634_)) + i_1638_ * i_1634_ >> class142_1537_.anInt1680 * -1193058675);
							int i_1641_ = i_1639_ - i_1640_ - i_1536_;
							anIntArray9047[i_1630_] = (((anIntArray9047[i_1630_] << 8) / i_1617_ * i_1641_) >> 8) - (i_1539_ - i_1639_);
						}
					}
				}
				aBool9105 = false;
			}
		}
	}

	public void method2754(int i) {
		if ((anInt9058 & 0x6) != 6)
			throw new IllegalStateException();
		int i_1642_ = Class433.anIntArray4880[i];
		int i_1643_ = Class433.anIntArray4881[i];
		synchronized (this) {
			for (int i_1644_ = 0; i_1644_ < anInt9061; i_1644_++) {
				int i_1645_ = ((anIntArray9047[i_1644_] * i_1643_ - anIntArray9065[i_1644_] * i_1642_) >> 14);
				anIntArray9065[i_1644_] = (anIntArray9047[i_1644_] * i_1642_ + anIntArray9065[i_1644_] * i_1643_) >> 14;
				anIntArray9047[i_1644_] = i_1645_;
			}
			method14469();
		}
	}

	void method14520() {
		if (!aBool9105) {
			int i = 0;
			int i_1646_ = 0;
			int i_1647_ = 32767;
			int i_1648_ = 32767;
			int i_1649_ = 32767;
			int i_1650_ = -32768;
			int i_1651_ = -32768;
			int i_1652_ = -32768;
			for (int i_1653_ = 0; i_1653_ < anInt9062; i_1653_++) {
				int i_1654_ = anIntArray9077[i_1653_];
				int i_1655_ = anIntArray9047[i_1653_];
				int i_1656_ = anIntArray9065[i_1653_];
				if (i_1654_ < i_1647_)
					i_1647_ = i_1654_;
				if (i_1654_ > i_1650_)
					i_1650_ = i_1654_;
				if (i_1655_ < i_1648_)
					i_1648_ = i_1655_;
				if (i_1655_ > i_1651_)
					i_1651_ = i_1655_;
				if (i_1656_ < i_1649_)
					i_1649_ = i_1656_;
				if (i_1656_ > i_1652_)
					i_1652_ = i_1656_;
				int i_1657_ = i_1654_ * i_1654_ + i_1656_ * i_1656_;
				if (i_1657_ > i)
					i = i_1657_;
				i_1657_ += i_1655_ * i_1655_;
				if (i_1657_ > i_1646_)
					i_1646_ = i_1657_;
			}
			aShort9090 = (short) i_1647_;
			aShort9111 = (short) i_1650_;
			aShort9108 = (short) i_1648_;
			aShort9109 = (short) i_1651_;
			aShort9112 = (short) i_1649_;
			aShort9113 = (short) i_1652_;
			aShort9082 = (short) (int) (Math.sqrt((double) i) + 0.99);
			aShort9107 = (short) (int) (Math.sqrt((double) i_1646_) + 0.99);
			aBool9105 = true;
		}
	}

	void method14521() {
		if (!aBool9105) {
			int i = 0;
			int i_1658_ = 0;
			int i_1659_ = 32767;
			int i_1660_ = 32767;
			int i_1661_ = 32767;
			int i_1662_ = -32768;
			int i_1663_ = -32768;
			int i_1664_ = -32768;
			for (int i_1665_ = 0; i_1665_ < anInt9062; i_1665_++) {
				int i_1666_ = anIntArray9077[i_1665_];
				int i_1667_ = anIntArray9047[i_1665_];
				int i_1668_ = anIntArray9065[i_1665_];
				if (i_1666_ < i_1659_)
					i_1659_ = i_1666_;
				if (i_1666_ > i_1662_)
					i_1662_ = i_1666_;
				if (i_1667_ < i_1660_)
					i_1660_ = i_1667_;
				if (i_1667_ > i_1663_)
					i_1663_ = i_1667_;
				if (i_1668_ < i_1661_)
					i_1661_ = i_1668_;
				if (i_1668_ > i_1664_)
					i_1664_ = i_1668_;
				int i_1669_ = i_1666_ * i_1666_ + i_1668_ * i_1668_;
				if (i_1669_ > i)
					i = i_1669_;
				i_1669_ += i_1667_ * i_1667_;
				if (i_1669_ > i_1658_)
					i_1658_ = i_1669_;
			}
			aShort9090 = (short) i_1659_;
			aShort9111 = (short) i_1662_;
			aShort9108 = (short) i_1660_;
			aShort9109 = (short) i_1663_;
			aShort9112 = (short) i_1661_;
			aShort9113 = (short) i_1664_;
			aShort9082 = (short) (int) (Math.sqrt((double) i) + 0.99);
			aShort9107 = (short) (int) (Math.sqrt((double) i_1658_) + 0.99);
			aBool9105 = true;
		}
	}

	void method14522() {
		if (!aBool9105) {
			int i = 0;
			int i_1670_ = 0;
			int i_1671_ = 32767;
			int i_1672_ = 32767;
			int i_1673_ = 32767;
			int i_1674_ = -32768;
			int i_1675_ = -32768;
			int i_1676_ = -32768;
			for (int i_1677_ = 0; i_1677_ < anInt9062; i_1677_++) {
				int i_1678_ = anIntArray9077[i_1677_];
				int i_1679_ = anIntArray9047[i_1677_];
				int i_1680_ = anIntArray9065[i_1677_];
				if (i_1678_ < i_1671_)
					i_1671_ = i_1678_;
				if (i_1678_ > i_1674_)
					i_1674_ = i_1678_;
				if (i_1679_ < i_1672_)
					i_1672_ = i_1679_;
				if (i_1679_ > i_1675_)
					i_1675_ = i_1679_;
				if (i_1680_ < i_1673_)
					i_1673_ = i_1680_;
				if (i_1680_ > i_1676_)
					i_1676_ = i_1680_;
				int i_1681_ = i_1678_ * i_1678_ + i_1680_ * i_1680_;
				if (i_1681_ > i)
					i = i_1681_;
				i_1681_ += i_1679_ * i_1679_;
				if (i_1681_ > i_1670_)
					i_1670_ = i_1681_;
			}
			aShort9090 = (short) i_1671_;
			aShort9111 = (short) i_1674_;
			aShort9108 = (short) i_1672_;
			aShort9109 = (short) i_1675_;
			aShort9112 = (short) i_1673_;
			aShort9113 = (short) i_1676_;
			aShort9082 = (short) (int) (Math.sqrt((double) i) + 0.99);
			aShort9107 = (short) (int) (Math.sqrt((double) i_1670_) + 0.99);
			aBool9105 = true;
		}
	}

	void method14523() {
		if (!aBool9105) {
			int i = 0;
			int i_1682_ = 0;
			int i_1683_ = 32767;
			int i_1684_ = 32767;
			int i_1685_ = 32767;
			int i_1686_ = -32768;
			int i_1687_ = -32768;
			int i_1688_ = -32768;
			for (int i_1689_ = 0; i_1689_ < anInt9062; i_1689_++) {
				int i_1690_ = anIntArray9077[i_1689_];
				int i_1691_ = anIntArray9047[i_1689_];
				int i_1692_ = anIntArray9065[i_1689_];
				if (i_1690_ < i_1683_)
					i_1683_ = i_1690_;
				if (i_1690_ > i_1686_)
					i_1686_ = i_1690_;
				if (i_1691_ < i_1684_)
					i_1684_ = i_1691_;
				if (i_1691_ > i_1687_)
					i_1687_ = i_1691_;
				if (i_1692_ < i_1685_)
					i_1685_ = i_1692_;
				if (i_1692_ > i_1688_)
					i_1688_ = i_1692_;
				int i_1693_ = i_1690_ * i_1690_ + i_1692_ * i_1692_;
				if (i_1693_ > i)
					i = i_1693_;
				i_1693_ += i_1691_ * i_1691_;
				if (i_1693_ > i_1682_)
					i_1682_ = i_1693_;
			}
			aShort9090 = (short) i_1683_;
			aShort9111 = (short) i_1686_;
			aShort9108 = (short) i_1684_;
			aShort9109 = (short) i_1687_;
			aShort9112 = (short) i_1685_;
			aShort9113 = (short) i_1688_;
			aShort9082 = (short) (int) (Math.sqrt((double) i) + 0.99);
			aShort9107 = (short) (int) (Math.sqrt((double) i_1682_) + 0.99);
			aBool9105 = true;
		}
	}

	void method2695(int i, int[] is, int i_1694_, int i_1695_, int i_1696_, int i_1697_, boolean bool) {
		int i_1698_ = is.length;
		if (i == 0) {
			i_1694_ <<= 4;
			i_1695_ <<= 4;
			i_1696_ <<= 4;
			if (!aBool9094) {
				for (int i_1699_ = 0; i_1699_ < anInt9061; i_1699_++) {
					anIntArray9077[i_1699_] <<= 4;
					anIntArray9047[i_1699_] <<= 4;
					anIntArray9065[i_1699_] <<= 4;
				}
				aBool9094 = true;
			}
			int i_1700_ = 0;
			anInt9095 = 0;
			anInt9096 = 0;
			anInt9097 = 0;
			for (int i_1701_ = 0; i_1701_ < i_1698_; i_1701_++) {
				int i_1702_ = is[i_1701_];
				if (i_1702_ < anIntArrayArray9091.length) {
					int[] is_1703_ = anIntArrayArray9091[i_1702_];
					for (int i_1704_ = 0; i_1704_ < is_1703_.length; i_1704_++) {
						int i_1705_ = is_1703_[i_1704_];
						anInt9095 += anIntArray9077[i_1705_];
						anInt9096 += anIntArray9047[i_1705_];
						anInt9097 += anIntArray9065[i_1705_];
						i_1700_++;
					}
				}
			}
			if (i_1700_ > 0) {
				anInt9095 = anInt9095 / i_1700_ + i_1694_;
				anInt9096 = anInt9096 / i_1700_ + i_1695_;
				anInt9097 = anInt9097 / i_1700_ + i_1696_;
			} else {
				anInt9095 = i_1694_;
				anInt9096 = i_1695_;
				anInt9097 = i_1696_;
			}
		} else if (i == 1) {
			i_1694_ <<= 4;
			i_1695_ <<= 4;
			i_1696_ <<= 4;
			if (!aBool9094) {
				for (int i_1706_ = 0; i_1706_ < anInt9061; i_1706_++) {
					anIntArray9077[i_1706_] <<= 4;
					anIntArray9047[i_1706_] <<= 4;
					anIntArray9065[i_1706_] <<= 4;
				}
				aBool9094 = true;
			}
			for (int i_1707_ = 0; i_1707_ < i_1698_; i_1707_++) {
				int i_1708_ = is[i_1707_];
				if (i_1708_ < anIntArrayArray9091.length) {
					int[] is_1709_ = anIntArrayArray9091[i_1708_];
					for (int i_1710_ = 0; i_1710_ < is_1709_.length; i_1710_++) {
						int i_1711_ = is_1709_[i_1710_];
						anIntArray9077[i_1711_] += i_1694_;
						anIntArray9047[i_1711_] += i_1695_;
						anIntArray9065[i_1711_] += i_1696_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_1712_ = 0; i_1712_ < i_1698_; i_1712_++) {
				int i_1713_ = is[i_1712_];
				if (i_1713_ < anIntArrayArray9091.length) {
					int[] is_1714_ = anIntArrayArray9091[i_1713_];
					if ((i_1697_ & 0x1) == 0) {
						for (int i_1715_ = 0; i_1715_ < is_1714_.length; i_1715_++) {
							int i_1716_ = is_1714_[i_1715_];
							anIntArray9077[i_1716_] -= anInt9095;
							anIntArray9047[i_1716_] -= anInt9096;
							anIntArray9065[i_1716_] -= anInt9097;
							if (i_1696_ != 0) {
								int i_1717_ = Class433.anIntArray4880[i_1696_];
								int i_1718_ = Class433.anIntArray4881[i_1696_];
								int i_1719_ = ((anIntArray9047[i_1716_] * i_1717_ + anIntArray9077[i_1716_] * i_1718_ + 16383) >> 14);
								anIntArray9047[i_1716_] = (anIntArray9047[i_1716_] * i_1718_ - anIntArray9077[i_1716_] * i_1717_ + 16383) >> 14;
								anIntArray9077[i_1716_] = i_1719_;
							}
							if (i_1694_ != 0) {
								int i_1720_ = Class433.anIntArray4880[i_1694_];
								int i_1721_ = Class433.anIntArray4881[i_1694_];
								int i_1722_ = ((anIntArray9047[i_1716_] * i_1721_ - anIntArray9065[i_1716_] * i_1720_ + 16383) >> 14);
								anIntArray9065[i_1716_] = (anIntArray9047[i_1716_] * i_1720_ + anIntArray9065[i_1716_] * i_1721_ + 16383) >> 14;
								anIntArray9047[i_1716_] = i_1722_;
							}
							if (i_1695_ != 0) {
								int i_1723_ = Class433.anIntArray4880[i_1695_];
								int i_1724_ = Class433.anIntArray4881[i_1695_];
								int i_1725_ = ((anIntArray9065[i_1716_] * i_1723_ + anIntArray9077[i_1716_] * i_1724_ + 16383) >> 14);
								anIntArray9065[i_1716_] = (anIntArray9065[i_1716_] * i_1724_ - anIntArray9077[i_1716_] * i_1723_ + 16383) >> 14;
								anIntArray9077[i_1716_] = i_1725_;
							}
							anIntArray9077[i_1716_] += anInt9095;
							anIntArray9047[i_1716_] += anInt9096;
							anIntArray9065[i_1716_] += anInt9097;
						}
					} else {
						for (int i_1726_ = 0; i_1726_ < is_1714_.length; i_1726_++) {
							int i_1727_ = is_1714_[i_1726_];
							anIntArray9077[i_1727_] -= anInt9095;
							anIntArray9047[i_1727_] -= anInt9096;
							anIntArray9065[i_1727_] -= anInt9097;
							if (i_1694_ != 0) {
								int i_1728_ = Class433.anIntArray4880[i_1694_];
								int i_1729_ = Class433.anIntArray4881[i_1694_];
								int i_1730_ = ((anIntArray9047[i_1727_] * i_1729_ - anIntArray9065[i_1727_] * i_1728_ + 16383) >> 14);
								anIntArray9065[i_1727_] = (anIntArray9047[i_1727_] * i_1728_ + anIntArray9065[i_1727_] * i_1729_ + 16383) >> 14;
								anIntArray9047[i_1727_] = i_1730_;
							}
							if (i_1696_ != 0) {
								int i_1731_ = Class433.anIntArray4880[i_1696_];
								int i_1732_ = Class433.anIntArray4881[i_1696_];
								int i_1733_ = ((anIntArray9047[i_1727_] * i_1731_ + anIntArray9077[i_1727_] * i_1732_ + 16383) >> 14);
								anIntArray9047[i_1727_] = (anIntArray9047[i_1727_] * i_1732_ - anIntArray9077[i_1727_] * i_1731_ + 16383) >> 14;
								anIntArray9077[i_1727_] = i_1733_;
							}
							if (i_1695_ != 0) {
								int i_1734_ = Class433.anIntArray4880[i_1695_];
								int i_1735_ = Class433.anIntArray4881[i_1695_];
								int i_1736_ = ((anIntArray9065[i_1727_] * i_1734_ + anIntArray9077[i_1727_] * i_1735_ + 16383) >> 14);
								anIntArray9065[i_1727_] = (anIntArray9065[i_1727_] * i_1735_ - anIntArray9077[i_1727_] * i_1734_ + 16383) >> 14;
								anIntArray9077[i_1727_] = i_1736_;
							}
							anIntArray9077[i_1727_] += anInt9095;
							anIntArray9047[i_1727_] += anInt9096;
							anIntArray9065[i_1727_] += anInt9097;
						}
					}
				}
			}
		} else if (i == 3) {
			for (int i_1737_ = 0; i_1737_ < i_1698_; i_1737_++) {
				int i_1738_ = is[i_1737_];
				if (i_1738_ < anIntArrayArray9091.length) {
					int[] is_1739_ = anIntArrayArray9091[i_1738_];
					for (int i_1740_ = 0; i_1740_ < is_1739_.length; i_1740_++) {
						int i_1741_ = is_1739_[i_1740_];
						anIntArray9077[i_1741_] -= anInt9095;
						anIntArray9047[i_1741_] -= anInt9096;
						anIntArray9065[i_1741_] -= anInt9097;
						anIntArray9077[i_1741_] = anIntArray9077[i_1741_] * i_1694_ / 128;
						anIntArray9047[i_1741_] = anIntArray9047[i_1741_] * i_1695_ / 128;
						anIntArray9065[i_1741_] = anIntArray9065[i_1741_] * i_1696_ / 128;
						anIntArray9077[i_1741_] += anInt9095;
						anIntArray9047[i_1741_] += anInt9096;
						anIntArray9065[i_1741_] += anInt9097;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9048 != null && aByteArray9086 != null) {
				for (int i_1742_ = 0; i_1742_ < i_1698_; i_1742_++) {
					int i_1743_ = is[i_1742_];
					if (i_1743_ < anIntArrayArray9048.length) {
						int[] is_1744_ = anIntArrayArray9048[i_1743_];
						for (int i_1745_ = 0; i_1745_ < is_1744_.length; i_1745_++) {
							int i_1746_ = is_1744_[i_1745_];
							int i_1747_ = ((aByteArray9086[i_1746_] & 0xff) + i_1694_ * 8);
							if (i_1747_ < 0)
								i_1747_ = 0;
							else if (i_1747_ > 255)
								i_1747_ = 255;
							aByteArray9086[i_1746_] = (byte) i_1747_;
						}
					}
				}
				if (aClass101Array9102 != null) {
					for (int i_1748_ = 0; i_1748_ < anInt9101; i_1748_++) {
						Class101 class101 = aClass101Array9102[i_1748_];
						Class103 class103 = aClass103Array9103[i_1748_];
						class103.anInt1258 = (class103.anInt1258 * 330457669 & 0xffffff | 255 - ((aByteArray9086[class101.anInt1241 * -566359109]) & 0xff) << 24) * -1951506291;
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9048 != null) {
				for (int i_1749_ = 0; i_1749_ < i_1698_; i_1749_++) {
					int i_1750_ = is[i_1749_];
					if (i_1750_ < anIntArrayArray9048.length) {
						int[] is_1751_ = anIntArrayArray9048[i_1750_];
						for (int i_1752_ = 0; i_1752_ < is_1751_.length; i_1752_++) {
							int i_1753_ = is_1751_[i_1752_];
							int i_1754_ = aShortArray9088[i_1753_] & 0xffff;
							int i_1755_ = i_1754_ >> 10 & 0x3f;
							int i_1756_ = i_1754_ >> 7 & 0x7;
							int i_1757_ = i_1754_ & 0x7f;
							i_1755_ = i_1755_ + i_1694_ & 0x3f;
							i_1756_ += i_1695_;
							if (i_1756_ < 0)
								i_1756_ = 0;
							else if (i_1756_ > 7)
								i_1756_ = 7;
							i_1757_ += i_1696_;
							if (i_1757_ < 0)
								i_1757_ = 0;
							else if (i_1757_ > 127)
								i_1757_ = 127;
							aShortArray9088[i_1753_] = (short) (i_1755_ << 10 | i_1756_ << 7 | i_1757_);
						}
						aBool9093 = true;
					}
				}
				if (aClass101Array9102 != null) {
					for (int i_1758_ = 0; i_1758_ < anInt9101; i_1758_++) {
						Class101 class101 = aClass101Array9102[i_1758_];
						Class103 class103 = aClass103Array9103[i_1758_];
						class103.anInt1258 = (class103.anInt1258 * 330457669 & ~0xffffff | ((Class638.anIntArray8306[Class493.method8085(((aShortArray9088[(class101.anInt1241 * -566359109)]) & 0xffff), -1208146545) & 0xffff]) & 0xffffff)) * -1951506291;
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9104 != null) {
				for (int i_1759_ = 0; i_1759_ < i_1698_; i_1759_++) {
					int i_1760_ = is[i_1759_];
					if (i_1760_ < anIntArrayArray9104.length) {
						int[] is_1761_ = anIntArrayArray9104[i_1760_];
						for (int i_1762_ = 0; i_1762_ < is_1761_.length; i_1762_++) {
							Class103 class103 = aClass103Array9103[is_1761_[i_1762_]];
							class103.anInt1248 += i_1694_ * 356391365;
							class103.anInt1251 += i_1695_ * 1938564783;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9104 != null) {
				for (int i_1763_ = 0; i_1763_ < i_1698_; i_1763_++) {
					int i_1764_ = is[i_1763_];
					if (i_1764_ < anIntArrayArray9104.length) {
						int[] is_1765_ = anIntArrayArray9104[i_1764_];
						for (int i_1766_ = 0; i_1766_ < is_1765_.length; i_1766_++) {
							Class103 class103 = aClass103Array9103[is_1765_[i_1766_]];
							class103.aFloat1249 = (class103.aFloat1249 * (float) i_1694_ / 128.0F);
							class103.aFloat1250 = (class103.aFloat1250 * (float) i_1695_ / 128.0F);
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9104 != null) {
				for (int i_1767_ = 0; i_1767_ < i_1698_; i_1767_++) {
					int i_1768_ = is[i_1767_];
					if (i_1768_ < anIntArrayArray9104.length) {
						int[] is_1769_ = anIntArrayArray9104[i_1768_];
						for (int i_1770_ = 0; i_1770_ < is_1769_.length; i_1770_++) {
							Class103 class103 = aClass103Array9103[is_1769_[i_1770_]];
							class103.anInt1253 = (class103.anInt1253 * 212895487 + i_1694_ & 0x3fff) * 891189503;
						}
					}
				}
			}
		}
	}

	public void method2790() {
		if (!aBool9114) {
			if (!aBool9105)
				method14478();
			aShort9115 = aShort9108;
			aBool9114 = true;
		}
	}

	public void method2680() {
		if (!aBool9114) {
			if (!aBool9105)
				method14478();
			aShort9115 = aShort9108;
			aBool9114 = true;
		}
	}

	public void method2783(Class435 class435, Class180 class180, int i) {
		method14510(class435, class180, i);
	}

	void method2838() {
		if (aClass178_Sub3_9049.anInt9819 * 1353126165 > 1) {
			synchronized (this) {
				while (aBool1796) {
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBool1796 = true;
			}
		}
	}

	public boolean method2802(int i, int i_1771_, Class435 class435, boolean bool, int i_1772_) {
		method14529(aClass178_Sub3_9049.method15475(Thread.currentThread()));
		Class441 class441 = aClass99_9069.aClass441_1202;
		class441.method7090(class435);
		Class441 class441_1773_ = aClass99_9069.aClass441_1203;
		class441_1773_.method7086(class441);
		class441_1773_.method7089(aClass178_Sub3_9049.aClass441_9821);
		boolean bool_1774_ = false;
		int i_1775_ = 2147483647;
		int i_1776_ = -2147483648;
		int i_1777_ = 2147483647;
		int i_1778_ = -2147483648;
		if (!aBool9105)
			method14478();
		int i_1779_ = aShort9111 - aShort9090 >> 1;
		int i_1780_ = aShort9109 - aShort9108 >> 1;
		int i_1781_ = aShort9113 - aShort9112 >> 1;
		int i_1782_ = aShort9090 + i_1779_;
		int i_1783_ = aShort9108 + i_1780_;
		int i_1784_ = aShort9112 + i_1781_;
		int i_1785_ = i_1782_ - (i_1779_ << i_1772_);
		int i_1786_ = i_1783_ - (i_1780_ << i_1772_);
		int i_1787_ = i_1784_ - (i_1781_ << i_1772_);
		int i_1788_ = i_1782_ + (i_1779_ << i_1772_);
		int i_1789_ = i_1783_ + (i_1780_ << i_1772_);
		int i_1790_ = i_1784_ + (i_1781_ << i_1772_);
		anIntArray9124[0] = i_1785_;
		anIntArray9125[0] = i_1786_;
		anIntArray9126[0] = i_1787_;
		anIntArray9124[1] = i_1788_;
		anIntArray9125[1] = i_1786_;
		anIntArray9126[1] = i_1787_;
		anIntArray9124[2] = i_1785_;
		anIntArray9125[2] = i_1789_;
		anIntArray9126[2] = i_1787_;
		anIntArray9124[3] = i_1788_;
		anIntArray9125[3] = i_1789_;
		anIntArray9126[3] = i_1787_;
		anIntArray9124[4] = i_1785_;
		anIntArray9125[4] = i_1786_;
		anIntArray9126[4] = i_1790_;
		anIntArray9124[5] = i_1788_;
		anIntArray9125[5] = i_1786_;
		anIntArray9126[5] = i_1790_;
		anIntArray9124[6] = i_1785_;
		anIntArray9125[6] = i_1789_;
		anIntArray9126[6] = i_1790_;
		anIntArray9124[7] = i_1788_;
		anIntArray9125[7] = i_1789_;
		anIntArray9126[7] = i_1790_;
		for (int i_1791_ = 0; i_1791_ < 8; i_1791_++) {
			int i_1792_ = anIntArray9124[i_1791_];
			int i_1793_ = anIntArray9125[i_1791_];
			int i_1794_ = anIntArray9126[i_1791_];
			float f = (class441_1773_.aFloatArray4916[2] * (float) i_1792_ + class441_1773_.aFloatArray4916[6] * (float) i_1793_ + class441_1773_.aFloatArray4916[10] * (float) i_1794_ + class441_1773_.aFloatArray4916[14]);
			float f_1795_ = (class441_1773_.aFloatArray4916[3] * (float) i_1792_ + class441_1773_.aFloatArray4916[7] * (float) i_1793_ + class441_1773_.aFloatArray4916[11] * (float) i_1794_ + class441_1773_.aFloatArray4916[15]);
			if (f >= -f_1795_) {
				float f_1796_ = (class441_1773_.aFloatArray4916[0] * (float) i_1792_ + class441_1773_.aFloatArray4916[4] * (float) i_1793_ + class441_1773_.aFloatArray4916[8] * (float) i_1794_ + class441_1773_.aFloatArray4916[12]);
				float f_1797_ = (class441_1773_.aFloatArray4916[1] * (float) i_1792_ + class441_1773_.aFloatArray4916[5] * (float) i_1793_ + class441_1773_.aFloatArray4916[9] * (float) i_1794_ + class441_1773_.aFloatArray4916[13]);
				int i_1798_ = (int) (aClass178_Sub3_9049.aFloat9828 + (aClass178_Sub3_9049.aFloat9827 * f_1796_ / f_1795_));
				int i_1799_ = (int) (aClass178_Sub3_9049.aFloat9830 + (aClass178_Sub3_9049.aFloat9829 * f_1797_ / f_1795_));
				if (i_1798_ < i_1775_)
					i_1775_ = i_1798_;
				if (i_1798_ > i_1776_)
					i_1776_ = i_1798_;
				if (i_1799_ < i_1777_)
					i_1777_ = i_1799_;
				if (i_1799_ > i_1778_)
					i_1778_ = i_1799_;
				bool_1774_ = true;
			}
		}
		if (bool_1774_ && i > i_1775_ && i < i_1776_ && i_1771_ > i_1777_ && i_1771_ < i_1778_) {
			if (bool)
				return true;
			for (int i_1800_ = 0; i_1800_ < anInt9061; i_1800_++) {
				int i_1801_ = anIntArray9077[i_1800_];
				int i_1802_ = anIntArray9047[i_1800_];
				int i_1803_ = anIntArray9065[i_1800_];
				float f = (class441_1773_.aFloatArray4916[2] * (float) i_1801_ + class441_1773_.aFloatArray4916[6] * (float) i_1802_ + class441_1773_.aFloatArray4916[10] * (float) i_1803_ + class441_1773_.aFloatArray4916[14]);
				float f_1804_ = (class441_1773_.aFloatArray4916[3] * (float) i_1801_ + class441_1773_.aFloatArray4916[7] * (float) i_1802_ + class441_1773_.aFloatArray4916[11] * (float) i_1803_ + class441_1773_.aFloatArray4916[15]);
				if (f >= -f_1804_) {
					float f_1805_ = (class441_1773_.aFloatArray4916[0] * (float) i_1801_ + (class441_1773_.aFloatArray4916[4] * (float) i_1802_) + (class441_1773_.aFloatArray4916[8] * (float) i_1803_) + class441_1773_.aFloatArray4916[12]);
					float f_1806_ = (class441_1773_.aFloatArray4916[1] * (float) i_1801_ + (class441_1773_.aFloatArray4916[5] * (float) i_1802_) + (class441_1773_.aFloatArray4916[9] * (float) i_1803_) + class441_1773_.aFloatArray4916[13]);
					aFloatArray9120[i_1800_] = (float) (int) (aClass178_Sub3_9049.aFloat9828 + (aClass178_Sub3_9049.aFloat9827 * f_1805_ / f_1804_));
					aFloatArray9121[i_1800_] = (float) (int) (aClass178_Sub3_9049.aFloat9830 + (aClass178_Sub3_9049.aFloat9829 * f_1806_ / f_1804_));
				} else
					aFloatArray9120[i_1800_] = -999999.0F;
			}
			for (int i_1807_ = 0; i_1807_ < anInt9070; i_1807_++) {
				if (aFloatArray9120[aShortArray9064[i_1807_]] != -999999.0F && aFloatArray9120[aShortArray9072[i_1807_]] != -999999.0F && aFloatArray9120[aShortArray9063[i_1807_]] != -999999.0F && method14477(i, i_1771_, aFloatArray9121[aShortArray9064[i_1807_]], aFloatArray9121[aShortArray9072[i_1807_]], aFloatArray9121[aShortArray9063[i_1807_]], aFloatArray9120[aShortArray9064[i_1807_]], aFloatArray9120[aShortArray9072[i_1807_]], aFloatArray9120[aShortArray9063[i_1807_]]))
					return true;
			}
		}
		return false;
	}

	final boolean method14524(int i) {
		if (anIntArray9129 == null)
			return false;
		if (anIntArray9129[i] == -1)
			return false;
		return true;
	}

	public int method2718() {
		if (!aBool9114)
			method2719();
		return aShort9115;
	}

	void method2729() {
		if (aBool9094) {
			for (int i = 0; i < anInt9061; i++) {
				anIntArray9077[i] = anIntArray9077[i] + 7 >> 4;
				anIntArray9047[i] = anIntArray9047[i] + 7 >> 4;
				anIntArray9065[i] = anIntArray9065[i] + 7 >> 4;
			}
			aBool9094 = false;
		}
		if (aBool9093) {
			method14503();
			aBool9093 = false;
		}
		aBool9105 = false;
	}

	void method2808() {
		if (aClass178_Sub3_9049.anInt9819 * 1353126165 > 1) {
			synchronized (this) {
				while (aBool1796) {
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBool1796 = true;
			}
		}
	}

	public int method2799() {
		if (!aBool9105)
			method14478();
		return aShort9111;
	}

	public int method2800() {
		if (!aBool9105)
			method14478();
		return aShort9111;
	}

	public int method2801() {
		if (!aBool9105)
			method14478();
		return aShort9111;
	}

	public void method2763(int i, int i_1808_, Class142 class142, Class142 class142_1809_, int i_1810_, int i_1811_, int i_1812_) {
		if (i == 3) {
			if ((anInt9058 & 0x7) != 7)
				throw new IllegalStateException();
		} else if ((anInt9058 & 0x2) != 2)
			throw new IllegalStateException();
		if (!aBool9105)
			method14478();
		int i_1813_ = i_1810_ + aShort9090;
		int i_1814_ = i_1810_ + aShort9111;
		int i_1815_ = i_1812_ + aShort9112;
		int i_1816_ = i_1812_ + aShort9113;
		if (i == 4 || (i_1813_ >= 0 && ((i_1814_ + class142.anInt1682 * 341909049 >> class142.anInt1680 * -1193058675) < class142.anInt1683 * 692304099) && i_1815_ >= 0 && ((i_1816_ + class142.anInt1682 * 341909049 >> class142.anInt1680 * -1193058675) < class142.anInt1681 * 452998539))) {
			int[][] is = class142.anIntArrayArray1684;
			int[][] is_1817_ = null;
			if (class142_1809_ != null)
				is_1817_ = class142_1809_.anIntArrayArray1684;
			if (i == 4 || i == 5) {
				if (class142_1809_ == null || (i_1813_ < 0 || ((i_1814_ + class142_1809_.anInt1682 * 341909049 >> class142_1809_.anInt1680 * -1193058675) >= class142_1809_.anInt1683 * 692304099) || i_1815_ < 0 || ((i_1816_ + class142_1809_.anInt1682 * 341909049 >> class142_1809_.anInt1680 * -1193058675) >= class142_1809_.anInt1681 * 452998539)))
					return;
			} else {
				i_1813_ >>= class142.anInt1680 * -1193058675;
				i_1814_ = (i_1814_ + (class142.anInt1682 * 341909049 - 1) >> class142.anInt1680 * -1193058675);
				i_1815_ >>= class142.anInt1680 * -1193058675;
				i_1816_ = (i_1816_ + (class142.anInt1682 * 341909049 - 1) >> class142.anInt1680 * -1193058675);
				if (is[i_1813_][i_1815_] == i_1811_ && is[i_1814_][i_1815_] == i_1811_ && is[i_1813_][i_1816_] == i_1811_ && is[i_1814_][i_1816_] == i_1811_)
					return;
			}
			synchronized (this) {
				if (i == 1) {
					int i_1818_ = class142.anInt1682 * 341909049 - 1;
					for (int i_1819_ = 0; i_1819_ < anInt9062; i_1819_++) {
						int i_1820_ = anIntArray9077[i_1819_] + i_1810_;
						int i_1821_ = anIntArray9065[i_1819_] + i_1812_;
						int i_1822_ = i_1820_ & i_1818_;
						int i_1823_ = i_1821_ & i_1818_;
						int i_1824_ = i_1820_ >> class142.anInt1680 * -1193058675;
						int i_1825_ = i_1821_ >> class142.anInt1680 * -1193058675;
						int i_1826_ = (((is[i_1824_][i_1825_] * (class142.anInt1682 * 341909049 - i_1822_)) + is[i_1824_ + 1][i_1825_] * i_1822_) >> class142.anInt1680 * -1193058675);
						int i_1827_ = (((is[i_1824_][i_1825_ + 1] * (class142.anInt1682 * 341909049 - i_1822_)) + is[i_1824_ + 1][i_1825_ + 1] * i_1822_) >> class142.anInt1680 * -1193058675);
						int i_1828_ = (i_1826_ * (class142.anInt1682 * 341909049 - i_1823_) + i_1827_ * i_1823_ >> class142.anInt1680 * -1193058675);
						anIntArray9047[i_1819_] = anIntArray9047[i_1819_] + i_1828_ - i_1811_;
					}
					for (int i_1829_ = anInt9062; i_1829_ < anInt9061; i_1829_++) {
						int i_1830_ = anIntArray9077[i_1829_] + i_1810_;
						int i_1831_ = anIntArray9065[i_1829_] + i_1812_;
						int i_1832_ = i_1830_ & i_1818_;
						int i_1833_ = i_1831_ & i_1818_;
						int i_1834_ = i_1830_ >> class142.anInt1680 * -1193058675;
						int i_1835_ = i_1831_ >> class142.anInt1680 * -1193058675;
						if (i_1834_ >= 0 && i_1834_ < is.length - 1 && i_1835_ >= 0 && i_1835_ < is[0].length - 1) {
							int i_1836_ = (((is[i_1834_][i_1835_] * (class142.anInt1682 * 341909049 - i_1832_)) + is[i_1834_ + 1][i_1835_] * i_1832_) >> class142.anInt1680 * -1193058675);
							int i_1837_ = (((is[i_1834_][i_1835_ + 1] * (class142.anInt1682 * 341909049 - i_1832_)) + is[i_1834_ + 1][i_1835_ + 1] * i_1832_) >> class142.anInt1680 * -1193058675);
							int i_1838_ = (i_1836_ * (class142.anInt1682 * 341909049 - i_1833_) + i_1837_ * i_1833_ >> class142.anInt1680 * -1193058675);
							anIntArray9047[i_1829_] = anIntArray9047[i_1829_] + i_1838_ - i_1811_;
						}
					}
				} else if (i == 2) {
					if (aShort9108 == 0)
						return;
					int i_1839_ = class142.anInt1682 * 341909049 - 1;
					for (int i_1840_ = 0; i_1840_ < anInt9062; i_1840_++) {
						int i_1841_ = (anIntArray9047[i_1840_] << 16) / aShort9108;
						if (i_1841_ < i_1808_) {
							int i_1842_ = anIntArray9077[i_1840_] + i_1810_;
							int i_1843_ = anIntArray9065[i_1840_] + i_1812_;
							int i_1844_ = i_1842_ & i_1839_;
							int i_1845_ = i_1843_ & i_1839_;
							int i_1846_ = i_1842_ >> class142.anInt1680 * -1193058675;
							int i_1847_ = i_1843_ >> class142.anInt1680 * -1193058675;
							int i_1848_ = (((is[i_1846_][i_1847_] * (class142.anInt1682 * 341909049 - i_1844_)) + is[i_1846_ + 1][i_1847_] * i_1844_) >> class142.anInt1680 * -1193058675);
							int i_1849_ = (((is[i_1846_][i_1847_ + 1] * (class142.anInt1682 * 341909049 - i_1844_)) + is[i_1846_ + 1][i_1847_ + 1] * i_1844_) >> class142.anInt1680 * -1193058675);
							int i_1850_ = (i_1848_ * (class142.anInt1682 * 341909049 - i_1845_) + i_1849_ * i_1845_ >> class142.anInt1680 * -1193058675);
							anIntArray9047[i_1840_] = (anIntArray9047[i_1840_] + ((i_1850_ - i_1811_) * (i_1808_ - i_1841_) / i_1808_));
						} else
							anIntArray9047[i_1840_] = anIntArray9047[i_1840_];
					}
					for (int i_1851_ = anInt9062; i_1851_ < anInt9061; i_1851_++) {
						int i_1852_ = (anIntArray9047[i_1851_] << 16) / aShort9108;
						if (i_1852_ < i_1808_) {
							int i_1853_ = anIntArray9077[i_1851_] + i_1810_;
							int i_1854_ = anIntArray9065[i_1851_] + i_1812_;
							int i_1855_ = i_1853_ & i_1839_;
							int i_1856_ = i_1854_ & i_1839_;
							int i_1857_ = i_1853_ >> class142.anInt1680 * -1193058675;
							int i_1858_ = i_1854_ >> class142.anInt1680 * -1193058675;
							if (i_1857_ >= 0 && i_1857_ < class142.anInt1683 * 692304099 - 1 && i_1858_ >= 0 && (i_1858_ < class142.anInt1681 * 452998539 - 1)) {
								int i_1859_ = (((is[i_1857_][i_1858_] * (class142.anInt1682 * 341909049 - i_1855_)) + is[i_1857_ + 1][i_1858_] * i_1855_) >> class142.anInt1680 * -1193058675);
								int i_1860_ = (((is[i_1857_][i_1858_ + 1] * (class142.anInt1682 * 341909049 - i_1855_)) + (is[i_1857_ + 1][i_1858_ + 1] * i_1855_)) >> class142.anInt1680 * -1193058675);
								int i_1861_ = ((i_1859_ * (class142.anInt1682 * 341909049 - i_1856_)) + i_1860_ * i_1856_ >> class142.anInt1680 * -1193058675);
								anIntArray9047[i_1851_] = (anIntArray9047[i_1851_] + ((i_1861_ - i_1811_) * (i_1808_ - i_1852_) / i_1808_));
							}
						} else
							anIntArray9047[i_1851_] = anIntArray9047[i_1851_];
					}
				} else if (i == 3) {
					int i_1862_ = (i_1808_ & 0xff) * 16;
					int i_1863_ = (i_1808_ >> 8 & 0xff) * 16;
					int i_1864_ = (i_1808_ >> 16 & 0xff) << 6;
					int i_1865_ = (i_1808_ >> 24 & 0xff) << 6;
					if (i_1810_ - (i_1862_ >> 1) < 0 || ((i_1810_ + (i_1862_ >> 1) + class142.anInt1682 * 341909049) >= (class142.anInt1683 * 692304099 << class142.anInt1680 * -1193058675)) || i_1812_ - (i_1863_ >> 1) < 0 || ((i_1812_ + (i_1863_ >> 1) + class142.anInt1682 * 341909049) >= (class142.anInt1681 * 452998539 << class142.anInt1680 * -1193058675)))
						return;
					method2693(class142, i_1810_, i_1811_, i_1812_, i_1862_, i_1863_, i_1864_, i_1865_);
				} else if (i == 4) {
					int i_1866_ = class142_1809_.anInt1682 * 341909049 - 1;
					int i_1867_ = aShort9109 - aShort9108;
					for (int i_1868_ = 0; i_1868_ < anInt9062; i_1868_++) {
						int i_1869_ = anIntArray9077[i_1868_] + i_1810_;
						int i_1870_ = anIntArray9065[i_1868_] + i_1812_;
						int i_1871_ = i_1869_ & i_1866_;
						int i_1872_ = i_1870_ & i_1866_;
						int i_1873_ = (i_1869_ >> class142_1809_.anInt1680 * -1193058675);
						int i_1874_ = (i_1870_ >> class142_1809_.anInt1680 * -1193058675);
						int i_1875_ = (((is_1817_[i_1873_][i_1874_] * (class142_1809_.anInt1682 * 341909049 - i_1871_)) + is_1817_[i_1873_ + 1][i_1874_] * i_1871_) >> class142_1809_.anInt1680 * -1193058675);
						int i_1876_ = (((is_1817_[i_1873_][i_1874_ + 1] * (class142_1809_.anInt1682 * 341909049 - i_1871_)) + is_1817_[i_1873_ + 1][i_1874_ + 1] * i_1871_) >> class142_1809_.anInt1680 * -1193058675);
						int i_1877_ = (i_1875_ * (class142_1809_.anInt1682 * 341909049 - i_1872_) + i_1876_ * i_1872_ >> class142_1809_.anInt1680 * -1193058675);
						anIntArray9047[i_1868_] = (anIntArray9047[i_1868_] + (i_1877_ - i_1811_) + i_1867_);
					}
					for (int i_1878_ = anInt9062; i_1878_ < anInt9061; i_1878_++) {
						int i_1879_ = anIntArray9077[i_1878_] + i_1810_;
						int i_1880_ = anIntArray9065[i_1878_] + i_1812_;
						int i_1881_ = i_1879_ & i_1866_;
						int i_1882_ = i_1880_ & i_1866_;
						int i_1883_ = (i_1879_ >> class142_1809_.anInt1680 * -1193058675);
						int i_1884_ = (i_1880_ >> class142_1809_.anInt1680 * -1193058675);
						if (i_1883_ >= 0 && (i_1883_ < class142_1809_.anInt1683 * 692304099 - 1) && i_1884_ >= 0 && (i_1884_ < class142_1809_.anInt1681 * 452998539 - 1)) {
							int i_1885_ = (((is_1817_[i_1883_][i_1884_] * (class142_1809_.anInt1682 * 341909049 - i_1881_)) + is_1817_[i_1883_ + 1][i_1884_] * i_1881_) >> class142_1809_.anInt1680 * -1193058675);
							int i_1886_ = (((is_1817_[i_1883_][i_1884_ + 1] * (class142_1809_.anInt1682 * 341909049 - i_1881_)) + (is_1817_[i_1883_ + 1][i_1884_ + 1] * i_1881_)) >> class142_1809_.anInt1680 * -1193058675);
							int i_1887_ = ((i_1885_ * (class142_1809_.anInt1682 * 341909049 - i_1882_)) + i_1886_ * i_1882_ >> class142_1809_.anInt1680 * -1193058675);
							anIntArray9047[i_1878_] = (anIntArray9047[i_1878_] + (i_1887_ - i_1811_) + i_1867_);
						}
					}
				} else if (i == 5) {
					int i_1888_ = class142_1809_.anInt1682 * 341909049 - 1;
					int i_1889_ = aShort9109 - aShort9108;
					for (int i_1890_ = 0; i_1890_ < anInt9062; i_1890_++) {
						int i_1891_ = anIntArray9077[i_1890_] + i_1810_;
						int i_1892_ = anIntArray9065[i_1890_] + i_1812_;
						int i_1893_ = i_1891_ & i_1888_;
						int i_1894_ = i_1892_ & i_1888_;
						int i_1895_ = i_1891_ >> class142.anInt1680 * -1193058675;
						int i_1896_ = i_1892_ >> class142.anInt1680 * -1193058675;
						int i_1897_ = (((is[i_1895_][i_1896_] * (class142.anInt1682 * 341909049 - i_1893_)) + is[i_1895_ + 1][i_1896_] * i_1893_) >> class142.anInt1680 * -1193058675);
						int i_1898_ = (((is[i_1895_][i_1896_ + 1] * (class142.anInt1682 * 341909049 - i_1893_)) + is[i_1895_ + 1][i_1896_ + 1] * i_1893_) >> class142.anInt1680 * -1193058675);
						int i_1899_ = (i_1897_ * (class142.anInt1682 * 341909049 - i_1894_) + i_1898_ * i_1894_ >> class142.anInt1680 * -1193058675);
						i_1897_ = (((is_1817_[i_1895_][i_1896_] * (class142_1809_.anInt1682 * 341909049 - i_1893_)) + is_1817_[i_1895_ + 1][i_1896_] * i_1893_) >> class142_1809_.anInt1680 * -1193058675);
						i_1898_ = (((is_1817_[i_1895_][i_1896_ + 1] * (class142_1809_.anInt1682 * 341909049 - i_1893_)) + is_1817_[i_1895_ + 1][i_1896_ + 1] * i_1893_) >> class142_1809_.anInt1680 * -1193058675);
						int i_1900_ = (i_1897_ * (class142_1809_.anInt1682 * 341909049 - i_1894_) + i_1898_ * i_1894_ >> class142_1809_.anInt1680 * -1193058675);
						int i_1901_ = i_1899_ - i_1900_ - i_1808_;
						anIntArray9047[i_1890_] = ((anIntArray9047[i_1890_] << 8) / i_1889_ * i_1901_ >> 8) - (i_1811_ - i_1899_);
					}
					for (int i_1902_ = anInt9062; i_1902_ < anInt9061; i_1902_++) {
						int i_1903_ = anIntArray9077[i_1902_] + i_1810_;
						int i_1904_ = anIntArray9065[i_1902_] + i_1812_;
						int i_1905_ = i_1903_ & i_1888_;
						int i_1906_ = i_1904_ & i_1888_;
						int i_1907_ = i_1903_ >> class142.anInt1680 * -1193058675;
						int i_1908_ = i_1904_ >> class142.anInt1680 * -1193058675;
						if (i_1907_ >= 0 && i_1907_ < class142.anInt1683 * 692304099 - 1 && (i_1907_ < class142_1809_.anInt1683 * 692304099 - 1) && i_1908_ >= 0 && i_1908_ < class142.anInt1681 * 452998539 - 1 && (i_1908_ < class142_1809_.anInt1681 * 452998539 - 1)) {
							int i_1909_ = (((is[i_1907_][i_1908_] * (class142.anInt1682 * 341909049 - i_1905_)) + is[i_1907_ + 1][i_1908_] * i_1905_) >> class142.anInt1680 * -1193058675);
							int i_1910_ = (((is[i_1907_][i_1908_ + 1] * (class142.anInt1682 * 341909049 - i_1905_)) + is[i_1907_ + 1][i_1908_ + 1] * i_1905_) >> class142.anInt1680 * -1193058675);
							int i_1911_ = (i_1909_ * (class142.anInt1682 * 341909049 - i_1906_) + i_1910_ * i_1906_ >> class142.anInt1680 * -1193058675);
							i_1909_ = (((is_1817_[i_1907_][i_1908_] * (class142_1809_.anInt1682 * 341909049 - i_1905_)) + is_1817_[i_1907_ + 1][i_1908_] * i_1905_) >> class142_1809_.anInt1680 * -1193058675);
							i_1910_ = (((is_1817_[i_1907_][i_1908_ + 1] * (class142_1809_.anInt1682 * 341909049 - i_1905_)) + (is_1817_[i_1907_ + 1][i_1908_ + 1] * i_1905_)) >> class142_1809_.anInt1680 * -1193058675);
							int i_1912_ = ((i_1909_ * (class142_1809_.anInt1682 * 341909049 - i_1906_)) + i_1910_ * i_1906_ >> class142_1809_.anInt1680 * -1193058675);
							int i_1913_ = i_1911_ - i_1912_ - i_1808_;
							anIntArray9047[i_1902_] = (((anIntArray9047[i_1902_] << 8) / i_1889_ * i_1913_) >> 8) - (i_1811_ - i_1911_);
						}
					}
				}
				aBool9105 = false;
			}
		}
	}

	void method2705(int i, int i_1914_, int i_1915_, int i_1916_) {
		if (i == 0) {
			int i_1917_ = 0;
			anInt9095 = 0;
			anInt9096 = 0;
			anInt9097 = 0;
			for (int i_1918_ = 0; i_1918_ < anInt9061; i_1918_++) {
				anInt9095 += anIntArray9077[i_1918_];
				anInt9096 += anIntArray9047[i_1918_];
				anInt9097 += anIntArray9065[i_1918_];
				i_1917_++;
			}
			if (i_1917_ > 0) {
				anInt9095 = anInt9095 / i_1917_ + i_1914_;
				anInt9096 = anInt9096 / i_1917_ + i_1915_;
				anInt9097 = anInt9097 / i_1917_ + i_1916_;
			} else {
				anInt9095 = i_1914_;
				anInt9096 = i_1915_;
				anInt9097 = i_1916_;
			}
		} else if (i == 1) {
			for (int i_1919_ = 0; i_1919_ < anInt9061; i_1919_++) {
				anIntArray9077[i_1919_] += i_1914_;
				anIntArray9047[i_1919_] += i_1915_;
				anIntArray9065[i_1919_] += i_1916_;
			}
		} else if (i == 2) {
			for (int i_1920_ = 0; i_1920_ < anInt9061; i_1920_++) {
				anIntArray9077[i_1920_] -= anInt9095;
				anIntArray9047[i_1920_] -= anInt9096;
				anIntArray9065[i_1920_] -= anInt9097;
				if (i_1916_ != 0) {
					int i_1921_ = Class433.anIntArray4880[i_1916_];
					int i_1922_ = Class433.anIntArray4881[i_1916_];
					int i_1923_ = ((anIntArray9047[i_1920_] * i_1921_ + anIntArray9077[i_1920_] * i_1922_ + 16383) >> 14);
					anIntArray9047[i_1920_] = (anIntArray9047[i_1920_] * i_1922_ - anIntArray9077[i_1920_] * i_1921_ + 16383) >> 14;
					anIntArray9077[i_1920_] = i_1923_;
				}
				if (i_1914_ != 0) {
					int i_1924_ = Class433.anIntArray4880[i_1914_];
					int i_1925_ = Class433.anIntArray4881[i_1914_];
					int i_1926_ = ((anIntArray9047[i_1920_] * i_1925_ - anIntArray9065[i_1920_] * i_1924_ + 16383) >> 14);
					anIntArray9065[i_1920_] = (anIntArray9047[i_1920_] * i_1924_ + anIntArray9065[i_1920_] * i_1925_ + 16383) >> 14;
					anIntArray9047[i_1920_] = i_1926_;
				}
				if (i_1915_ != 0) {
					int i_1927_ = Class433.anIntArray4880[i_1915_];
					int i_1928_ = Class433.anIntArray4881[i_1915_];
					int i_1929_ = ((anIntArray9065[i_1920_] * i_1927_ + anIntArray9077[i_1920_] * i_1928_ + 16383) >> 14);
					anIntArray9065[i_1920_] = (anIntArray9065[i_1920_] * i_1928_ - anIntArray9077[i_1920_] * i_1927_ + 16383) >> 14;
					anIntArray9077[i_1920_] = i_1929_;
				}
				anIntArray9077[i_1920_] += anInt9095;
				anIntArray9047[i_1920_] += anInt9096;
				anIntArray9065[i_1920_] += anInt9097;
			}
		} else if (i == 3) {
			for (int i_1930_ = 0; i_1930_ < anInt9061; i_1930_++) {
				anIntArray9077[i_1930_] -= anInt9095;
				anIntArray9047[i_1930_] -= anInt9096;
				anIntArray9065[i_1930_] -= anInt9097;
				anIntArray9077[i_1930_] = anIntArray9077[i_1930_] * i_1914_ / 128;
				anIntArray9047[i_1930_] = anIntArray9047[i_1930_] * i_1915_ / 128;
				anIntArray9065[i_1930_] = anIntArray9065[i_1930_] * i_1916_ / 128;
				anIntArray9077[i_1930_] += anInt9095;
				anIntArray9047[i_1930_] += anInt9096;
				anIntArray9065[i_1930_] += anInt9097;
			}
		} else if (i == 5) {
			for (int i_1931_ = 0; i_1931_ < anInt9074; i_1931_++) {
				int i_1932_ = (aByteArray9086[i_1931_] & 0xff) + i_1914_ * 8;
				if (i_1932_ < 0)
					i_1932_ = 0;
				else if (i_1932_ > 255)
					i_1932_ = 255;
				aByteArray9086[i_1931_] = (byte) i_1932_;
			}
			if (aClass101Array9102 != null) {
				for (int i_1933_ = 0; i_1933_ < anInt9101; i_1933_++) {
					Class101 class101 = aClass101Array9102[i_1933_];
					Class103 class103 = aClass103Array9103[i_1933_];
					class103.anInt1258 = (class103.anInt1258 * 330457669 & 0xffffff | 255 - ((aByteArray9086[class101.anInt1241 * -566359109]) & 0xff) << 24) * -1951506291;
				}
			}
		} else if (i == 7) {
			for (int i_1934_ = 0; i_1934_ < anInt9074; i_1934_++) {
				int i_1935_ = aShortArray9088[i_1934_] & 0xffff;
				int i_1936_ = i_1935_ >> 10 & 0x3f;
				int i_1937_ = i_1935_ >> 7 & 0x7;
				int i_1938_ = i_1935_ & 0x7f;
				i_1936_ = i_1936_ + i_1914_ & 0x3f;
				i_1937_ += i_1915_;
				if (i_1937_ < 0)
					i_1937_ = 0;
				else if (i_1937_ > 7)
					i_1937_ = 7;
				i_1938_ += i_1916_;
				if (i_1938_ < 0)
					i_1938_ = 0;
				else if (i_1938_ > 127)
					i_1938_ = 127;
				aShortArray9088[i_1934_] = (short) (i_1936_ << 10 | i_1937_ << 7 | i_1938_);
			}
			aBool9093 = true;
			if (aClass101Array9102 != null) {
				for (int i_1939_ = 0; i_1939_ < anInt9101; i_1939_++) {
					Class101 class101 = aClass101Array9102[i_1939_];
					Class103 class103 = aClass103Array9103[i_1939_];
					class103.anInt1258 = (class103.anInt1258 * 330457669 & ~0xffffff | ((Class638.anIntArray8306[Class493.method8085(((aShortArray9088[(class101.anInt1241 * -566359109)]) & 0xffff), -282480102) & 0xffff]) & 0xffffff)) * -1951506291;
				}
			}
		} else if (i == 8) {
			for (int i_1940_ = 0; i_1940_ < anInt9101; i_1940_++) {
				Class103 class103 = aClass103Array9103[i_1940_];
				class103.anInt1248 += i_1914_ * 356391365;
				class103.anInt1251 += i_1915_ * 1938564783;
			}
		} else if (i == 10) {
			for (int i_1941_ = 0; i_1941_ < anInt9101; i_1941_++) {
				Class103 class103 = aClass103Array9103[i_1941_];
				class103.aFloat1249 = class103.aFloat1249 * (float) i_1914_ / 128.0F;
				class103.aFloat1250 = class103.aFloat1250 * (float) i_1915_ / 128.0F;
			}
		} else if (i == 9) {
			for (int i_1942_ = 0; i_1942_ < anInt9101; i_1942_++) {
				Class103 class103 = aClass103Array9103[i_1942_];
				class103.anInt1253 = (class103.anInt1253 * 212895487 + i_1914_ & 0x3fff) * 891189503;
			}
		}
	}

	public int method2811() {
		if (!aBool9105)
			method14478();
		return aShort9109;
	}

	public int method2736() {
		if (!aBool9105)
			method14478();
		return aShort9109;
	}

	public int method2806() {
		if (!aBool9105)
			method14478();
		return aShort9112;
	}

	public int method2807() {
		if (!aBool9105)
			method14478();
		return aShort9112;
	}

	void method14525() {
		synchronized (this) {
			for (int i = 0; i < anInt9061; i++) {
				int i_1943_ = anIntArray9077[i];
				anIntArray9077[i] = anIntArray9065[i];
				anIntArray9065[i] = -i_1943_;
			}
			method14469();
		}
	}

	public void method2809(int i) {
		if ((anInt9058 & 0x2000) != 8192)
			throw new IllegalStateException();
		anInt9060 = i;
		anInt9084 = 0;
	}

	public void method2810(int i) {
		if ((anInt9058 & 0x2000) != 8192)
			throw new IllegalStateException();
		anInt9060 = i;
		anInt9084 = 0;
	}

	void method14526() {
		synchronized (this) {
			for (int i = 0; i < anInt9062; i++) {
				int i_1944_ = anIntArray9077[i];
				anIntArray9077[i] = anIntArray9065[i];
				anIntArray9065[i] = -i_1944_;
				if (aClass109Array9067[i] != null) {
					i_1944_ = aClass109Array9067[i].anInt1326;
					aClass109Array9067[i].anInt1326 = aClass109Array9067[i].anInt1327;
					aClass109Array9067[i].anInt1327 = -i_1944_;
				}
			}
			if (aClass96Array9083 != null) {
				for (int i = 0; i < anInt9074; i++) {
					if (aClass96Array9083[i] != null) {
						int i_1945_ = aClass96Array9083[i].anInt1181;
						aClass96Array9083[i].anInt1181 = aClass96Array9083[i].anInt1183;
						aClass96Array9083[i].anInt1183 = -i_1945_;
					}
				}
			}
			for (int i = anInt9062; i < anInt9061; i++) {
				int i_1946_ = anIntArray9077[i];
				anIntArray9077[i] = anIntArray9065[i];
				anIntArray9065[i] = -i_1946_;
			}
			anInt9084 = 0;
			aBool9105 = false;
		}
	}

	void method2779(int i, int[] is, int i_1947_, int i_1948_, int i_1949_, boolean bool, int i_1950_, int[] is_1951_) {
		int i_1952_ = is.length;
		if (i == 0) {
			i_1947_ <<= 4;
			i_1948_ <<= 4;
			i_1949_ <<= 4;
			if (!aBool9094) {
				for (int i_1953_ = 0; i_1953_ < anInt9061; i_1953_++) {
					anIntArray9077[i_1953_] <<= 4;
					anIntArray9047[i_1953_] <<= 4;
					anIntArray9065[i_1953_] <<= 4;
				}
				aBool9094 = true;
			}
			int i_1954_ = 0;
			anInt9095 = 0;
			anInt9096 = 0;
			anInt9097 = 0;
			for (int i_1955_ = 0; i_1955_ < i_1952_; i_1955_++) {
				int i_1956_ = is[i_1955_];
				if (i_1956_ < anIntArrayArray9091.length) {
					int[] is_1957_ = anIntArrayArray9091[i_1956_];
					for (int i_1958_ = 0; i_1958_ < is_1957_.length; i_1958_++) {
						int i_1959_ = is_1957_[i_1958_];
						if (aShortArray9066 == null || (i_1950_ & aShortArray9066[i_1959_]) != 0) {
							anInt9095 += anIntArray9077[i_1959_];
							anInt9096 += anIntArray9047[i_1959_];
							anInt9097 += anIntArray9065[i_1959_];
							i_1954_++;
						}
					}
				}
			}
			if (i_1954_ > 0) {
				anInt9095 = anInt9095 / i_1954_ + i_1947_;
				anInt9096 = anInt9096 / i_1954_ + i_1948_;
				anInt9097 = anInt9097 / i_1954_ + i_1949_;
				aBool9098 = true;
			} else {
				anInt9095 = i_1947_;
				anInt9096 = i_1948_;
				anInt9097 = i_1949_;
			}
		} else if (i == 1) {
			if (is_1951_ != null) {
				int i_1960_ = ((is_1951_[0] * i_1947_ + is_1951_[1] * i_1948_ + is_1951_[2] * i_1949_ + 8192) >> 14);
				int i_1961_ = ((is_1951_[3] * i_1947_ + is_1951_[4] * i_1948_ + is_1951_[5] * i_1949_ + 8192) >> 14);
				int i_1962_ = ((is_1951_[6] * i_1947_ + is_1951_[7] * i_1948_ + is_1951_[8] * i_1949_ + 8192) >> 14);
				i_1947_ = i_1960_;
				i_1948_ = i_1961_;
				i_1949_ = i_1962_;
			}
			i_1947_ <<= 4;
			i_1948_ <<= 4;
			i_1949_ <<= 4;
			if (!aBool9094) {
				for (int i_1963_ = 0; i_1963_ < anInt9061; i_1963_++) {
					anIntArray9077[i_1963_] <<= 4;
					anIntArray9047[i_1963_] <<= 4;
					anIntArray9065[i_1963_] <<= 4;
				}
				aBool9094 = true;
			}
			for (int i_1964_ = 0; i_1964_ < i_1952_; i_1964_++) {
				int i_1965_ = is[i_1964_];
				if (i_1965_ < anIntArrayArray9091.length) {
					int[] is_1966_ = anIntArrayArray9091[i_1965_];
					for (int i_1967_ = 0; i_1967_ < is_1966_.length; i_1967_++) {
						int i_1968_ = is_1966_[i_1967_];
						if (aShortArray9066 == null || (i_1950_ & aShortArray9066[i_1968_]) != 0) {
							anIntArray9077[i_1968_] += i_1947_;
							anIntArray9047[i_1968_] += i_1948_;
							anIntArray9065[i_1968_] += i_1949_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1951_ != null) {
				if (!aBool9094) {
					for (int i_1969_ = 0; i_1969_ < anInt9061; i_1969_++) {
						anIntArray9077[i_1969_] <<= 4;
						anIntArray9047[i_1969_] <<= 4;
						anIntArray9065[i_1969_] <<= 4;
					}
					aBool9094 = true;
				}
				int i_1970_ = is_1951_[9] << 4;
				int i_1971_ = is_1951_[10] << 4;
				int i_1972_ = is_1951_[11] << 4;
				int i_1973_ = is_1951_[12] << 4;
				int i_1974_ = is_1951_[13] << 4;
				int i_1975_ = is_1951_[14] << 4;
				if (aBool9098) {
					int i_1976_ = ((is_1951_[0] * anInt9095 + is_1951_[3] * anInt9096 + is_1951_[6] * anInt9097 + 8192) >> 14);
					int i_1977_ = ((is_1951_[1] * anInt9095 + is_1951_[4] * anInt9096 + is_1951_[7] * anInt9097 + 8192) >> 14);
					int i_1978_ = ((is_1951_[2] * anInt9095 + is_1951_[5] * anInt9096 + is_1951_[8] * anInt9097 + 8192) >> 14);
					i_1976_ += i_1973_;
					i_1977_ += i_1974_;
					i_1978_ += i_1975_;
					anInt9095 = i_1976_;
					anInt9096 = i_1977_;
					anInt9097 = i_1978_;
					aBool9098 = false;
				}
				int[] is_1979_ = new int[9];
				int i_1980_ = Class433.anIntArray4881[i_1947_];
				int i_1981_ = Class433.anIntArray4880[i_1947_];
				int i_1982_ = Class433.anIntArray4881[i_1948_];
				int i_1983_ = Class433.anIntArray4880[i_1948_];
				int i_1984_ = Class433.anIntArray4881[i_1949_];
				int i_1985_ = Class433.anIntArray4880[i_1949_];
				int i_1986_ = i_1981_ * i_1984_ + 8192 >> 14;
				int i_1987_ = i_1981_ * i_1985_ + 8192 >> 14;
				is_1979_[0] = i_1982_ * i_1984_ + i_1983_ * i_1987_ + 8192 >> 14;
				is_1979_[1] = -i_1982_ * i_1985_ + i_1983_ * i_1986_ + 8192 >> 14;
				is_1979_[2] = i_1983_ * i_1980_ + 8192 >> 14;
				is_1979_[3] = i_1980_ * i_1985_ + 8192 >> 14;
				is_1979_[4] = i_1980_ * i_1984_ + 8192 >> 14;
				is_1979_[5] = -i_1981_;
				is_1979_[6] = -i_1983_ * i_1984_ + i_1982_ * i_1987_ + 8192 >> 14;
				is_1979_[7] = i_1983_ * i_1985_ + i_1982_ * i_1986_ + 8192 >> 14;
				is_1979_[8] = i_1982_ * i_1980_ + 8192 >> 14;
				int i_1988_ = ((is_1979_[0] * -anInt9095 + is_1979_[1] * -anInt9096 + is_1979_[2] * -anInt9097 + 8192) >> 14);
				int i_1989_ = ((is_1979_[3] * -anInt9095 + is_1979_[4] * -anInt9096 + is_1979_[5] * -anInt9097 + 8192) >> 14);
				int i_1990_ = ((is_1979_[6] * -anInt9095 + is_1979_[7] * -anInt9096 + is_1979_[8] * -anInt9097 + 8192) >> 14);
				int i_1991_ = i_1988_ + anInt9095;
				int i_1992_ = i_1989_ + anInt9096;
				int i_1993_ = i_1990_ + anInt9097;
				int[] is_1994_ = new int[9];
				for (int i_1995_ = 0; i_1995_ < 3; i_1995_++) {
					for (int i_1996_ = 0; i_1996_ < 3; i_1996_++) {
						int i_1997_ = 0;
						for (int i_1998_ = 0; i_1998_ < 3; i_1998_++)
							i_1997_ += (is_1979_[i_1995_ * 3 + i_1998_] * is_1951_[i_1996_ * 3 + i_1998_]);
						is_1994_[i_1995_ * 3 + i_1996_] = i_1997_ + 8192 >> 14;
					}
				}
				int i_1999_ = ((is_1979_[0] * i_1973_ + is_1979_[1] * i_1974_ + is_1979_[2] * i_1975_ + 8192) >> 14);
				int i_2000_ = ((is_1979_[3] * i_1973_ + is_1979_[4] * i_1974_ + is_1979_[5] * i_1975_ + 8192) >> 14);
				int i_2001_ = ((is_1979_[6] * i_1973_ + is_1979_[7] * i_1974_ + is_1979_[8] * i_1975_ + 8192) >> 14);
				i_1999_ += i_1991_;
				i_2000_ += i_1992_;
				i_2001_ += i_1993_;
				int[] is_2002_ = new int[9];
				for (int i_2003_ = 0; i_2003_ < 3; i_2003_++) {
					for (int i_2004_ = 0; i_2004_ < 3; i_2004_++) {
						int i_2005_ = 0;
						for (int i_2006_ = 0; i_2006_ < 3; i_2006_++)
							i_2005_ += (is_1951_[i_2003_ * 3 + i_2006_] * is_1994_[i_2004_ + i_2006_ * 3]);
						is_2002_[i_2003_ * 3 + i_2004_] = i_2005_ + 8192 >> 14;
					}
				}
				int i_2007_ = ((is_1951_[0] * i_1999_ + is_1951_[1] * i_2000_ + is_1951_[2] * i_2001_ + 8192) >> 14);
				int i_2008_ = ((is_1951_[3] * i_1999_ + is_1951_[4] * i_2000_ + is_1951_[5] * i_2001_ + 8192) >> 14);
				int i_2009_ = ((is_1951_[6] * i_1999_ + is_1951_[7] * i_2000_ + is_1951_[8] * i_2001_ + 8192) >> 14);
				i_2007_ += i_1970_;
				i_2008_ += i_1971_;
				i_2009_ += i_1972_;
				for (int i_2010_ = 0; i_2010_ < i_1952_; i_2010_++) {
					int i_2011_ = is[i_2010_];
					if (i_2011_ < anIntArrayArray9091.length) {
						int[] is_2012_ = anIntArrayArray9091[i_2011_];
						for (int i_2013_ = 0; i_2013_ < is_2012_.length; i_2013_++) {
							int i_2014_ = is_2012_[i_2013_];
							if (aShortArray9066 == null || (i_1950_ & aShortArray9066[i_2014_]) != 0) {
								int i_2015_ = ((is_2002_[0] * anIntArray9077[i_2014_] + is_2002_[1] * anIntArray9047[i_2014_] + is_2002_[2] * anIntArray9065[i_2014_] + 8192) >> 14);
								int i_2016_ = ((is_2002_[3] * anIntArray9077[i_2014_] + is_2002_[4] * anIntArray9047[i_2014_] + is_2002_[5] * anIntArray9065[i_2014_] + 8192) >> 14);
								int i_2017_ = ((is_2002_[6] * anIntArray9077[i_2014_] + is_2002_[7] * anIntArray9047[i_2014_] + is_2002_[8] * anIntArray9065[i_2014_] + 8192) >> 14);
								i_2015_ += i_2007_;
								i_2016_ += i_2008_;
								i_2017_ += i_2009_;
								anIntArray9077[i_2014_] = i_2015_;
								anIntArray9047[i_2014_] = i_2016_;
								anIntArray9065[i_2014_] = i_2017_;
							}
						}
					}
				}
			} else {
				for (int i_2018_ = 0; i_2018_ < i_1952_; i_2018_++) {
					int i_2019_ = is[i_2018_];
					if (i_2019_ < anIntArrayArray9091.length) {
						int[] is_2020_ = anIntArrayArray9091[i_2019_];
						for (int i_2021_ = 0; i_2021_ < is_2020_.length; i_2021_++) {
							int i_2022_ = is_2020_[i_2021_];
							if (aShortArray9066 == null || (i_1950_ & aShortArray9066[i_2022_]) != 0) {
								anIntArray9077[i_2022_] -= anInt9095;
								anIntArray9047[i_2022_] -= anInt9096;
								anIntArray9065[i_2022_] -= anInt9097;
								if (i_1949_ != 0) {
									int i_2023_ = Class433.anIntArray4880[i_1949_];
									int i_2024_ = Class433.anIntArray4881[i_1949_];
									int i_2025_ = ((anIntArray9047[i_2022_] * i_2023_ + anIntArray9077[i_2022_] * i_2024_ + 16383) >> 14);
									anIntArray9047[i_2022_] = (anIntArray9047[i_2022_] * i_2024_ - anIntArray9077[i_2022_] * i_2023_ + 16383) >> 14;
									anIntArray9077[i_2022_] = i_2025_;
								}
								if (i_1947_ != 0) {
									int i_2026_ = Class433.anIntArray4880[i_1947_];
									int i_2027_ = Class433.anIntArray4881[i_1947_];
									int i_2028_ = ((anIntArray9047[i_2022_] * i_2027_ - anIntArray9065[i_2022_] * i_2026_ + 16383) >> 14);
									anIntArray9065[i_2022_] = (anIntArray9047[i_2022_] * i_2026_ + anIntArray9065[i_2022_] * i_2027_ + 16383) >> 14;
									anIntArray9047[i_2022_] = i_2028_;
								}
								if (i_1948_ != 0) {
									int i_2029_ = Class433.anIntArray4880[i_1948_];
									int i_2030_ = Class433.anIntArray4881[i_1948_];
									int i_2031_ = ((anIntArray9065[i_2022_] * i_2029_ + anIntArray9077[i_2022_] * i_2030_ + 16383) >> 14);
									anIntArray9065[i_2022_] = (anIntArray9065[i_2022_] * i_2030_ - anIntArray9077[i_2022_] * i_2029_ + 16383) >> 14;
									anIntArray9077[i_2022_] = i_2031_;
								}
								anIntArray9077[i_2022_] += anInt9095;
								anIntArray9047[i_2022_] += anInt9096;
								anIntArray9065[i_2022_] += anInt9097;
							}
						}
					}
				}
			}
		} else if (i == 3) {
			if (is_1951_ != null) {
				if (!aBool9094) {
					for (int i_2032_ = 0; i_2032_ < anInt9061; i_2032_++) {
						anIntArray9077[i_2032_] <<= 4;
						anIntArray9047[i_2032_] <<= 4;
						anIntArray9065[i_2032_] <<= 4;
					}
					aBool9094 = true;
				}
				int i_2033_ = is_1951_[9] << 4;
				int i_2034_ = is_1951_[10] << 4;
				int i_2035_ = is_1951_[11] << 4;
				int i_2036_ = is_1951_[12] << 4;
				int i_2037_ = is_1951_[13] << 4;
				int i_2038_ = is_1951_[14] << 4;
				if (aBool9098) {
					int i_2039_ = ((is_1951_[0] * anInt9095 + is_1951_[3] * anInt9096 + is_1951_[6] * anInt9097 + 8192) >> 14);
					int i_2040_ = ((is_1951_[1] * anInt9095 + is_1951_[4] * anInt9096 + is_1951_[7] * anInt9097 + 8192) >> 14);
					int i_2041_ = ((is_1951_[2] * anInt9095 + is_1951_[5] * anInt9096 + is_1951_[8] * anInt9097 + 8192) >> 14);
					i_2039_ += i_2036_;
					i_2040_ += i_2037_;
					i_2041_ += i_2038_;
					anInt9095 = i_2039_;
					anInt9096 = i_2040_;
					anInt9097 = i_2041_;
					aBool9098 = false;
				}
				int i_2042_ = i_1947_ << 15 >> 7;
				int i_2043_ = i_1948_ << 15 >> 7;
				int i_2044_ = i_1949_ << 15 >> 7;
				int i_2045_ = i_2042_ * -anInt9095 + 8192 >> 14;
				int i_2046_ = i_2043_ * -anInt9096 + 8192 >> 14;
				int i_2047_ = i_2044_ * -anInt9097 + 8192 >> 14;
				int i_2048_ = i_2045_ + anInt9095;
				int i_2049_ = i_2046_ + anInt9096;
				int i_2050_ = i_2047_ + anInt9097;
				int[] is_2051_ = new int[9];
				is_2051_[0] = i_2042_ * is_1951_[0] + 8192 >> 14;
				is_2051_[1] = i_2042_ * is_1951_[3] + 8192 >> 14;
				is_2051_[2] = i_2042_ * is_1951_[6] + 8192 >> 14;
				is_2051_[3] = i_2043_ * is_1951_[1] + 8192 >> 14;
				is_2051_[4] = i_2043_ * is_1951_[4] + 8192 >> 14;
				is_2051_[5] = i_2043_ * is_1951_[7] + 8192 >> 14;
				is_2051_[6] = i_2044_ * is_1951_[2] + 8192 >> 14;
				is_2051_[7] = i_2044_ * is_1951_[5] + 8192 >> 14;
				is_2051_[8] = i_2044_ * is_1951_[8] + 8192 >> 14;
				int i_2052_ = i_2042_ * i_2036_ + 8192 >> 14;
				int i_2053_ = i_2043_ * i_2037_ + 8192 >> 14;
				int i_2054_ = i_2044_ * i_2038_ + 8192 >> 14;
				i_2052_ += i_2048_;
				i_2053_ += i_2049_;
				i_2054_ += i_2050_;
				int[] is_2055_ = new int[9];
				for (int i_2056_ = 0; i_2056_ < 3; i_2056_++) {
					for (int i_2057_ = 0; i_2057_ < 3; i_2057_++) {
						int i_2058_ = 0;
						for (int i_2059_ = 0; i_2059_ < 3; i_2059_++)
							i_2058_ += (is_1951_[i_2056_ * 3 + i_2059_] * is_2051_[i_2057_ + i_2059_ * 3]);
						is_2055_[i_2056_ * 3 + i_2057_] = i_2058_ + 8192 >> 14;
					}
				}
				int i_2060_ = ((is_1951_[0] * i_2052_ + is_1951_[1] * i_2053_ + is_1951_[2] * i_2054_ + 8192) >> 14);
				int i_2061_ = ((is_1951_[3] * i_2052_ + is_1951_[4] * i_2053_ + is_1951_[5] * i_2054_ + 8192) >> 14);
				int i_2062_ = ((is_1951_[6] * i_2052_ + is_1951_[7] * i_2053_ + is_1951_[8] * i_2054_ + 8192) >> 14);
				i_2060_ += i_2033_;
				i_2061_ += i_2034_;
				i_2062_ += i_2035_;
				for (int i_2063_ = 0; i_2063_ < i_1952_; i_2063_++) {
					int i_2064_ = is[i_2063_];
					if (i_2064_ < anIntArrayArray9091.length) {
						int[] is_2065_ = anIntArrayArray9091[i_2064_];
						for (int i_2066_ = 0; i_2066_ < is_2065_.length; i_2066_++) {
							int i_2067_ = is_2065_[i_2066_];
							if (aShortArray9066 == null || (i_1950_ & aShortArray9066[i_2067_]) != 0) {
								int i_2068_ = ((is_2055_[0] * anIntArray9077[i_2067_] + is_2055_[1] * anIntArray9047[i_2067_] + is_2055_[2] * anIntArray9065[i_2067_] + 8192) >> 14);
								int i_2069_ = ((is_2055_[3] * anIntArray9077[i_2067_] + is_2055_[4] * anIntArray9047[i_2067_] + is_2055_[5] * anIntArray9065[i_2067_] + 8192) >> 14);
								int i_2070_ = ((is_2055_[6] * anIntArray9077[i_2067_] + is_2055_[7] * anIntArray9047[i_2067_] + is_2055_[8] * anIntArray9065[i_2067_] + 8192) >> 14);
								i_2068_ += i_2060_;
								i_2069_ += i_2061_;
								i_2070_ += i_2062_;
								anIntArray9077[i_2067_] = i_2068_;
								anIntArray9047[i_2067_] = i_2069_;
								anIntArray9065[i_2067_] = i_2070_;
							}
						}
					}
				}
			} else {
				for (int i_2071_ = 0; i_2071_ < i_1952_; i_2071_++) {
					int i_2072_ = is[i_2071_];
					if (i_2072_ < anIntArrayArray9091.length) {
						int[] is_2073_ = anIntArrayArray9091[i_2072_];
						for (int i_2074_ = 0; i_2074_ < is_2073_.length; i_2074_++) {
							int i_2075_ = is_2073_[i_2074_];
							if (aShortArray9066 == null || (i_1950_ & aShortArray9066[i_2075_]) != 0) {
								anIntArray9077[i_2075_] -= anInt9095;
								anIntArray9047[i_2075_] -= anInt9096;
								anIntArray9065[i_2075_] -= anInt9097;
								anIntArray9077[i_2075_] = anIntArray9077[i_2075_] * i_1947_ / 128;
								anIntArray9047[i_2075_] = anIntArray9047[i_2075_] * i_1948_ / 128;
								anIntArray9065[i_2075_] = anIntArray9065[i_2075_] * i_1949_ / 128;
								anIntArray9077[i_2075_] += anInt9095;
								anIntArray9047[i_2075_] += anInt9096;
								anIntArray9065[i_2075_] += anInt9097;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9048 != null && aByteArray9086 != null) {
				for (int i_2076_ = 0; i_2076_ < i_1952_; i_2076_++) {
					int i_2077_ = is[i_2076_];
					if (i_2077_ < anIntArrayArray9048.length) {
						int[] is_2078_ = anIntArrayArray9048[i_2077_];
						for (int i_2079_ = 0; i_2079_ < is_2078_.length; i_2079_++) {
							int i_2080_ = is_2078_[i_2079_];
							if (aShortArray9078 == null || (i_1950_ & aShortArray9078[i_2080_]) != 0) {
								int i_2081_ = ((aByteArray9086[i_2080_] & 0xff) + i_1947_ * 8);
								if (i_2081_ < 0)
									i_2081_ = 0;
								else if (i_2081_ > 255)
									i_2081_ = 255;
								aByteArray9086[i_2080_] = (byte) i_2081_;
							}
						}
					}
				}
				if (aClass101Array9102 != null) {
					for (int i_2082_ = 0; i_2082_ < anInt9101; i_2082_++) {
						Class101 class101 = aClass101Array9102[i_2082_];
						Class103 class103 = aClass103Array9103[i_2082_];
						class103.anInt1258 = (class103.anInt1258 * 330457669 & 0xffffff | 255 - ((aByteArray9086[class101.anInt1241 * -566359109]) & 0xff) << 24) * -1951506291;
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9048 != null) {
				for (int i_2083_ = 0; i_2083_ < i_1952_; i_2083_++) {
					int i_2084_ = is[i_2083_];
					if (i_2084_ < anIntArrayArray9048.length) {
						int[] is_2085_ = anIntArrayArray9048[i_2084_];
						for (int i_2086_ = 0; i_2086_ < is_2085_.length; i_2086_++) {
							int i_2087_ = is_2085_[i_2086_];
							if (aShortArray9078 == null || (i_1950_ & aShortArray9078[i_2087_]) != 0) {
								int i_2088_ = aShortArray9088[i_2087_] & 0xffff;
								int i_2089_ = i_2088_ >> 10 & 0x3f;
								int i_2090_ = i_2088_ >> 7 & 0x7;
								int i_2091_ = i_2088_ & 0x7f;
								i_2089_ = i_2089_ + i_1947_ & 0x3f;
								i_2090_ += i_1948_;
								if (i_2090_ < 0)
									i_2090_ = 0;
								else if (i_2090_ > 7)
									i_2090_ = 7;
								i_2091_ += i_1949_;
								if (i_2091_ < 0)
									i_2091_ = 0;
								else if (i_2091_ > 127)
									i_2091_ = 127;
								aShortArray9088[i_2087_] = (short) (i_2089_ << 10 | i_2090_ << 7 | i_2091_);
							}
						}
						aBool9093 = true;
					}
				}
				if (aClass101Array9102 != null) {
					for (int i_2092_ = 0; i_2092_ < anInt9101; i_2092_++) {
						Class101 class101 = aClass101Array9102[i_2092_];
						Class103 class103 = aClass103Array9103[i_2092_];
						class103.anInt1258 = (class103.anInt1258 * 330457669 & ~0xffffff | ((Class638.anIntArray8306[Class493.method8085(((aShortArray9088[(class101.anInt1241 * -566359109)]) & 0xffff), -62357275) & 0xffff]) & 0xffffff)) * -1951506291;
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9104 != null) {
				for (int i_2093_ = 0; i_2093_ < i_1952_; i_2093_++) {
					int i_2094_ = is[i_2093_];
					if (i_2094_ < anIntArrayArray9104.length) {
						int[] is_2095_ = anIntArrayArray9104[i_2094_];
						for (int i_2096_ = 0; i_2096_ < is_2095_.length; i_2096_++) {
							Class103 class103 = aClass103Array9103[is_2095_[i_2096_]];
							class103.anInt1248 += i_1947_ * 356391365;
							class103.anInt1251 += i_1948_ * 1938564783;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9104 != null) {
				for (int i_2097_ = 0; i_2097_ < i_1952_; i_2097_++) {
					int i_2098_ = is[i_2097_];
					if (i_2098_ < anIntArrayArray9104.length) {
						int[] is_2099_ = anIntArrayArray9104[i_2098_];
						for (int i_2100_ = 0; i_2100_ < is_2099_.length; i_2100_++) {
							Class103 class103 = aClass103Array9103[is_2099_[i_2100_]];
							class103.aFloat1249 = (class103.aFloat1249 * (float) i_1947_ / 128.0F);
							class103.aFloat1250 = (class103.aFloat1250 * (float) i_1948_ / 128.0F);
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9104 != null) {
				for (int i_2101_ = 0; i_2101_ < i_1952_; i_2101_++) {
					int i_2102_ = is[i_2101_];
					if (i_2102_ < anIntArrayArray9104.length) {
						int[] is_2103_ = anIntArrayArray9104[i_2102_];
						for (int i_2104_ = 0; i_2104_ < is_2103_.length; i_2104_++) {
							Class103 class103 = aClass103Array9103[is_2103_[i_2104_]];
							class103.anInt1253 = (class103.anInt1253 * 212895487 + i_1947_ & 0x3fff) * 891189503;
						}
					}
				}
			}
		}
	}

	public int method2813() {
		return anInt9060;
	}

	public void method2781(short i, short i_2105_) {
		for (int i_2106_ = 0; i_2106_ < anInt9074; i_2106_++) {
			if (aShortArray9088[i_2106_] == i)
				aShortArray9088[i_2106_] = i_2105_;
		}
		if (aClass101Array9102 != null) {
			for (int i_2107_ = 0; i_2107_ < anInt9101; i_2107_++) {
				Class101 class101 = aClass101Array9102[i_2107_];
				Class103 class103 = aClass103Array9103[i_2107_];
				class103.anInt1258 = (class103.anInt1258 * 330457669 & ~0xffffff | ((Class638.anIntArray8306[Class493.method8085((aShortArray9088[(class101.anInt1241 * -566359109)]), -765327163) & 0xffff]) & 0xffffff)) * -1951506291;
			}
		}
		if (anInt9084 == 2)
			anInt9084 = 1;
	}

	final void method14527(boolean bool, boolean bool_2108_, boolean bool_2109_) {
		for (int i = 0; i < anInt9101; i++) {
			Class101 class101 = aClass101Array9102[i];
			if (class101.aBool1243) {
				Class103 class103 = aClass103Array9103[i];
				aClass178_Sub3_9049.method15428(bool, bool_2108_, bool_2109_, class103.anInt1254 * 172645007, class103.anInt1255 * -1110849247, class103.aFloat1256, class103.anInt1257 * -1848872251, class103.anInt1252 * 1576186567, class101.aShort1240, class103.anInt1258 * 330457669, class101.aByte1242, class101.aByte1237);
			}
		}
	}

	void method14528() {
		if (anInt9084 == 0)
			method14459(false);
		else if (aClass178_Sub3_9049.anInt9819 * 1353126165 > 1) {
			synchronized (this) {
				method14462();
			}
		} else
			method14462();
	}

	void method14529(Class99 class99) {
		aClass118_9118 = class99.aClass118_1200;
		if (class99 != aClass99_9069) {
			aClass99_9069 = class99;
			anIntArray9119 = aClass99_9069.anIntArray1197;
			aFloatArray9120 = aClass99_9069.aFloatArray1206;
			aFloatArray9121 = aClass99_9069.aFloatArray1217;
			aFloatArray9122 = aClass99_9069.aFloatArray1207;
			aFloatArray9123 = aClass99_9069.aFloatArray1225;
			anIntArray9124 = aClass99_9069.anIntArray1209;
			anIntArray9125 = aClass99_9069.anIntArray1212;
			anIntArray9126 = aClass99_9069.anIntArray1211;
			anIntArray9127 = aClass99_9069.anIntArray1208;
			anIntArray9053 = aClass99_9069.anIntArray1194;
			anIntArray9129 = aClass99_9069.anIntArray1190;
		}
	}

	public void method2818(short i, short i_2110_) {
		if (aShortArray9087 != null) {
			if (!aBool9092 && i_2110_ >= 0) {
				Class177 class177 = aClass178_Sub3_9049.aClass172_1916.method2895(i_2110_ & 0xffff, -1418958359);
				if (class177.aByte1885 != 0 || class177.aByte1886 != 0)
					aBool9092 = true;
			}
			for (int i_2111_ = 0; i_2111_ < anInt9074; i_2111_++) {
				if (aShortArray9087[i_2111_] == i)
					aShortArray9087[i_2111_] = i_2110_;
			}
		}
	}

	Class167_Sub1(Class178_Sub3 class178_sub3, Class179 class179, int i, int i_2112_, int i_2113_, int i_2114_) {
		anInt9070 = 0;
		anInt9084 = 0;
		aBool9094 = false;
		aBool9098 = false;
		aBool9105 = false;
		aBool9114 = false;
		aBool9128 = false;
		aBool9092 = false;
		aClass178_Sub3_9049 = class178_sub3;
		anInt9058 = i;
		anInt9059 = i_2112_;
		anInt9060 = i_2113_;
		Class172 class172 = aClass178_Sub3_9049.aClass172_1916;
		Interface46 interface46 = aClass178_Sub3_9049.anInterface46_1925;
		anInt9061 = class179.anInt1953;
		anInt9062 = class179.anInt1991;
		anIntArray9077 = class179.anIntArray1981;
		anIntArray9047 = class179.anIntArray1973;
		anIntArray9065 = class179.anIntArray1957;
		anInt9074 = class179.anInt1964;
		aShortArray9064 = class179.aShortArray1949;
		aShortArray9072 = class179.aShortArray1966;
		aShortArray9063 = class179.aShortArray1967;
		aByteArray9130 = class179.aByteArray1972;
		aShortArray9088 = class179.aShortArray1974;
		aByteArray9086 = class179.aByteArray1975;
		aShortArray9078 = class179.aShortArray1979;
		aByteArray9073 = class179.aByteArray1971;
		aClass184Array9089 = class179.aClass184Array1995;
		aClass143Array9100 = class179.aClass143Array1996;
		aShortArray9066 = class179.aShortArray1965;
		anInt9070 = anInt9074;
		int[] is = new int[anInt9074];
		for (int i_2115_ = 0; i_2115_ < anInt9074; i_2115_++)
			is[i_2115_] = i_2115_;
		long[] ls = new long[anInt9074];
		boolean bool = (anInt9058 & 0x100) != 0;
		for (int i_2116_ = 0; i_2116_ < anInt9074; i_2116_++) {
			int i_2117_ = is[i_2116_];
			Class177 class177 = null;
			int i_2118_ = 0;
			int i_2119_ = 0;
			int i_2120_ = 0;
			int i_2121_ = 0;
			if (class179.aClass176Array1997 != null) {
				boolean bool_2122_ = false;
				for (int i_2123_ = 0; i_2123_ < class179.aClass176Array1997.length; i_2123_++) {
					Class176 class176 = class179.aClass176Array1997[i_2123_];
					if (i_2117_ == class176.anInt1858 * -421198465) {
						Class386 class386 = interface46.method344((class176.anInt1861 * 837482349), (byte) -89);
						if (class386.aBool4006)
							bool_2122_ = true;
						if (class386.anInt4000 * -1163385649 != -1) {
							Class177 class177_2124_ = class172.method2895((class386.anInt4000 * -1163385649), -1507595222);
							if (class177_2124_.aClass593_1884 == Class593.aClass593_7811)
								aBool9128 = true;
						}
					}
				}
				if (bool_2122_) {
					ls[i_2116_] = 9223372036854775807L;
					anInt9070--;
					continue;
				}
			}
			if (class179.aClass184Array1995 != null) {
				boolean bool_2125_ = false;
				for (int i_2126_ = 0; i_2126_ < class179.aClass184Array1995.length; i_2126_++) {
					Class184 class184 = class179.aClass184Array1995[i_2126_];
					if (i_2117_ == class184.anInt2123 * 914118525) {
						Class400 class400 = (aClass178_Sub3_9049.anInterface48_1926.method348(class184.anInt2112 * -1864996007, 2003145818));
						if (class400.aBool4119)
							bool_2125_ = true;
					}
				}
				if (bool_2125_) {
					ls[i_2116_] = 9223372036854775807L;
					anInt9070--;
					continue;
				}
			}
			int i_2127_ = -1;
			if (class179.aShortArray1959 != null) {
				i_2127_ = class179.aShortArray1959[i_2117_];
				if (i_2127_ != -1) {
					class177 = class172.method2895(i_2127_ & 0xffff, -1381788090);
					if ((i_2114_ & 0x40) == 0 || !class177.aBool1876) {
						i_2120_ = class177.aByte1905;
						i_2121_ = class177.aByte1906;
					} else
						i_2127_ = -1;
				}
			}
			boolean bool_2128_ = (aByteArray9086 != null && aByteArray9086[i_2117_] != 0 || (class177 != null && class177.aClass593_1884 == Class593.aClass593_7811));
			if ((bool || bool_2128_) && aByteArray9130 != null)
				i_2118_ += aByteArray9130[i_2117_] << 17;
			if (bool_2128_)
				i_2118_ += 65536;
			i_2118_ += (i_2120_ & 0xff) << 8;
			i_2118_ += i_2121_ & 0xff;
			i_2119_ += (i_2127_ & 0xffff) << 16;
			i_2119_ += i_2116_ & 0xffff;
			ls[i_2116_] = ((long) i_2118_ << 32) + (long) i_2119_;
			aBool9128 |= bool_2128_;
		}
		Class528.method8734(ls, is, -1364136856);
		if (class179.aClass176Array1997 != null) {
			anInt9101 = class179.aClass176Array1997.length;
			aClass101Array9102 = new Class101[anInt9101];
			aClass103Array9103 = new Class103[anInt9101];
			for (int i_2129_ = 0; i_2129_ < class179.aClass176Array1997.length; i_2129_++) {
				Class176 class176 = class179.aClass176Array1997[i_2129_];
				Class386 class386 = interface46.method344(class176.anInt1861 * 837482349, (byte) -90);
				int i_2130_ = ((Class638.anIntArray8306[(class179.aShortArray1974[class176.anInt1858 * -421198465]) & 0xffff]) & 0xffffff);
				i_2130_ = i_2130_ | 255 - (class179.aByteArray1975 != null ? ((class179.aByteArray1975[class176.anInt1858 * -421198465]) & 0xff) : 0) << 24;
				aClass101Array9102[i_2129_] = new Class101(class176.anInt1858 * -421198465, (class179.aShortArray1949[class176.anInt1858 * -421198465]), (class179.aShortArray1966[class176.anInt1858 * -421198465]), (class179.aShortArray1967[class176.anInt1858 * -421198465]), class386.anInt4004 * 2141519961, class386.anInt3999 * 1591166335, class386.anInt4000 * -1163385649, class386.anInt4005 * 1353343391, class386.anInt4003 * -56714871, class386.aBool4006, class176.anInt1860 * 1648924969);
				aClass103Array9103[i_2129_] = new Class103(i_2130_);
			}
		}
		aFloatArrayArray9117 = new float[anInt9074][];
		aFloatArrayArray9075 = new float[anInt9074][];
		Class183 class183 = method2679(class179, is, anInt9074);
		Class99 class99 = aClass178_Sub3_9049.method15475(Thread.currentThread());
		float[] fs = class99.aFloatArray1223;
		boolean bool_2131_ = false;
		for (int i_2132_ = 0; i_2132_ < anInt9074; i_2132_++) {
			int i_2133_ = is[i_2132_];
			int i_2134_ = (class179.aShortArray1959 != null ? class179.aShortArray1959[i_2133_] : -1);
			if (i_2134_ != -1 && (i_2114_ & 0x40) != 0 && class172.method2895(i_2134_ & 0xffff, 205845064).aBool1876)
				i_2134_ = -1;
			if (i_2134_ != -1) {
				int i_2135_ = (class179.aShortArray1989 != null ? class179.aShortArray1989[i_2133_] : -1);
				bool_2131_ = true;
				float[] fs_2136_ = aFloatArrayArray9117[i_2133_] = new float[3];
				float[] fs_2137_ = aFloatArrayArray9075[i_2133_] = new float[3];
				if (i_2135_ == 32766) {
					int i_2138_ = class179.aByteArray1968[i_2133_] & 0xff;
					int i_2139_ = class179.aByteArray1969[i_2133_] & 0xff;
					int i_2140_ = class179.aByteArray1990[i_2133_] & 0xff;
					i_2138_ += (class179.anIntArray1958[class179.aShortArray1949[i_2133_]]);
					i_2139_ += (class179.anIntArray1958[class179.aShortArray1966[i_2133_]]);
					i_2140_ += (class179.anIntArray1958[class179.aShortArray1967[i_2133_]]);
					fs_2136_[0] = class179.aFloatArray1962[i_2138_];
					fs_2137_[0] = class179.aFloatArray1963[i_2138_];
					fs_2136_[1] = class179.aFloatArray1962[i_2139_];
					fs_2137_[1] = class179.aFloatArray1963[i_2139_];
					fs_2136_[2] = class179.aFloatArray1962[i_2140_];
					fs_2137_[2] = class179.aFloatArray1963[i_2140_];
				} else if (i_2135_ == -1) {
					fs_2136_[0] = 0.0F;
					fs_2137_[0] = 1.0F;
					fs_2136_[1] = 1.0F;
					fs_2137_[1] = 1.0F;
					fs_2136_[2] = 0.0F;
					fs_2137_[2] = 0.0F;
				} else {
					i_2135_ &= 0xffff;
					byte i_2141_ = class179.aByteArray1983[i_2135_];
					if (i_2141_ == 0) {
						short i_2142_ = aShortArray9064[i_2133_];
						short i_2143_ = aShortArray9072[i_2133_];
						short i_2144_ = aShortArray9063[i_2133_];
						short i_2145_ = class179.aShortArray1977[i_2135_];
						short i_2146_ = class179.aShortArray1985[i_2135_];
						short i_2147_ = class179.aShortArray1986[i_2135_];
						float f = (float) anIntArray9077[i_2145_];
						float f_2148_ = (float) anIntArray9047[i_2145_];
						float f_2149_ = (float) anIntArray9065[i_2145_];
						float f_2150_ = (float) anIntArray9077[i_2146_] - f;
						float f_2151_ = (float) anIntArray9047[i_2146_] - f_2148_;
						float f_2152_ = (float) anIntArray9065[i_2146_] - f_2149_;
						float f_2153_ = (float) anIntArray9077[i_2147_] - f;
						float f_2154_ = (float) anIntArray9047[i_2147_] - f_2148_;
						float f_2155_ = (float) anIntArray9065[i_2147_] - f_2149_;
						float f_2156_ = (float) anIntArray9077[i_2142_] - f;
						float f_2157_ = (float) anIntArray9047[i_2142_] - f_2148_;
						float f_2158_ = (float) anIntArray9065[i_2142_] - f_2149_;
						float f_2159_ = (float) anIntArray9077[i_2143_] - f;
						float f_2160_ = (float) anIntArray9047[i_2143_] - f_2148_;
						float f_2161_ = (float) anIntArray9065[i_2143_] - f_2149_;
						float f_2162_ = (float) anIntArray9077[i_2144_] - f;
						float f_2163_ = (float) anIntArray9047[i_2144_] - f_2148_;
						float f_2164_ = (float) anIntArray9065[i_2144_] - f_2149_;
						float f_2165_ = f_2151_ * f_2155_ - f_2152_ * f_2154_;
						float f_2166_ = f_2152_ * f_2153_ - f_2150_ * f_2155_;
						float f_2167_ = f_2150_ * f_2154_ - f_2151_ * f_2153_;
						float f_2168_ = f_2154_ * f_2167_ - f_2155_ * f_2166_;
						float f_2169_ = f_2155_ * f_2165_ - f_2153_ * f_2167_;
						float f_2170_ = f_2153_ * f_2166_ - f_2154_ * f_2165_;
						float f_2171_ = 1.0F / (f_2168_ * f_2150_ + f_2169_ * f_2151_ + f_2170_ * f_2152_);
						fs_2136_[0] = (f_2168_ * f_2156_ + f_2169_ * f_2157_ + f_2170_ * f_2158_) * f_2171_;
						fs_2136_[1] = (f_2168_ * f_2159_ + f_2169_ * f_2160_ + f_2170_ * f_2161_) * f_2171_;
						fs_2136_[2] = (f_2168_ * f_2162_ + f_2169_ * f_2163_ + f_2170_ * f_2164_) * f_2171_;
						f_2168_ = f_2151_ * f_2167_ - f_2152_ * f_2166_;
						f_2169_ = f_2152_ * f_2165_ - f_2150_ * f_2167_;
						f_2170_ = f_2150_ * f_2166_ - f_2151_ * f_2165_;
						f_2171_ = 1.0F / (f_2168_ * f_2153_ + f_2169_ * f_2154_ + f_2170_ * f_2155_);
						fs_2137_[0] = (f_2168_ * f_2156_ + f_2169_ * f_2157_ + f_2170_ * f_2158_) * f_2171_;
						fs_2137_[1] = (f_2168_ * f_2159_ + f_2169_ * f_2160_ + f_2170_ * f_2161_) * f_2171_;
						fs_2137_[2] = (f_2168_ * f_2162_ + f_2169_ * f_2163_ + f_2170_ * f_2164_) * f_2171_;
					} else {
						short i_2172_ = aShortArray9064[i_2133_];
						short i_2173_ = aShortArray9072[i_2133_];
						short i_2174_ = aShortArray9063[i_2133_];
						int i_2175_ = class183.anIntArray2106[i_2135_];
						int i_2176_ = class183.anIntArray2107[i_2135_];
						int i_2177_ = class183.anIntArray2108[i_2135_];
						float[] fs_2178_ = class183.aFloatArrayArray2109[i_2135_];
						byte i_2179_ = class179.aByteArray1994[i_2135_];
						float f = ((float) class179.anIntArray1960[i_2135_] / 256.0F);
						if (i_2141_ == 1) {
							float f_2180_ = ((float) class179.anIntArray1955[i_2135_] / 1024.0F);
							method2841(anIntArray9077[i_2172_], anIntArray9047[i_2172_], anIntArray9065[i_2172_], i_2175_, i_2176_, i_2177_, fs_2178_, f_2180_, i_2179_, f, fs);
							fs_2136_[0] = fs[0];
							fs_2137_[0] = fs[1];
							method2841(anIntArray9077[i_2173_], anIntArray9047[i_2173_], anIntArray9065[i_2173_], i_2175_, i_2176_, i_2177_, fs_2178_, f_2180_, i_2179_, f, fs);
							fs_2136_[1] = fs[0];
							fs_2137_[1] = fs[1];
							method2841(anIntArray9077[i_2174_], anIntArray9047[i_2174_], anIntArray9065[i_2174_], i_2175_, i_2176_, i_2177_, fs_2178_, f_2180_, i_2179_, f, fs);
							fs_2136_[2] = fs[0];
							fs_2137_[2] = fs[1];
							float f_2181_ = f_2180_ / 2.0F;
							if ((i_2179_ & 0x1) == 0) {
								if (fs_2136_[1] - fs_2136_[0] > f_2181_)
									fs_2136_[1] -= f_2180_;
								else if (fs_2136_[0] - fs_2136_[1] > f_2181_)
									fs_2136_[1] += f_2180_;
								if (fs_2136_[2] - fs_2136_[0] > f_2181_)
									fs_2136_[2] -= f_2180_;
								else if (fs_2136_[0] - fs_2136_[2] > f_2181_)
									fs_2136_[2] += f_2180_;
							} else {
								if (fs_2137_[1] - fs_2137_[0] > f_2181_)
									fs_2137_[1] -= f_2180_;
								else if (fs_2137_[0] - fs_2137_[1] > f_2181_)
									fs_2137_[1] += f_2180_;
								if (fs_2137_[2] - fs_2137_[0] > f_2181_)
									fs_2137_[2] -= f_2180_;
								else if (fs_2137_[0] - fs_2137_[2] > f_2181_)
									fs_2137_[2] += f_2180_;
							}
						} else if (i_2141_ == 2) {
							float f_2182_ = ((float) class179.anIntArray1970[i_2135_] / 256.0F);
							float f_2183_ = ((float) class179.anIntArray1992[i_2135_] / 256.0F);
							int i_2184_ = (anIntArray9077[i_2173_] - anIntArray9077[i_2172_]);
							int i_2185_ = (anIntArray9047[i_2173_] - anIntArray9047[i_2172_]);
							int i_2186_ = (anIntArray9065[i_2173_] - anIntArray9065[i_2172_]);
							int i_2187_ = (anIntArray9077[i_2174_] - anIntArray9077[i_2172_]);
							int i_2188_ = (anIntArray9047[i_2174_] - anIntArray9047[i_2172_]);
							int i_2189_ = (anIntArray9065[i_2174_] - anIntArray9065[i_2172_]);
							int i_2190_ = i_2185_ * i_2189_ - i_2188_ * i_2186_;
							int i_2191_ = i_2186_ * i_2187_ - i_2189_ * i_2184_;
							int i_2192_ = i_2184_ * i_2188_ - i_2187_ * i_2185_;
							float f_2193_ = (64.0F / (float) class179.anIntArray1987[i_2135_]);
							float f_2194_ = (64.0F / (float) class179.anIntArray1988[i_2135_]);
							float f_2195_ = (64.0F / (float) class179.anIntArray1955[i_2135_]);
							float f_2196_ = (((float) i_2190_ * fs_2178_[0] + (float) i_2191_ * fs_2178_[1] + (float) i_2192_ * fs_2178_[2]) / f_2193_);
							float f_2197_ = (((float) i_2190_ * fs_2178_[3] + (float) i_2191_ * fs_2178_[4] + (float) i_2192_ * fs_2178_[5]) / f_2194_);
							float f_2198_ = (((float) i_2190_ * fs_2178_[6] + (float) i_2191_ * fs_2178_[7] + (float) i_2192_ * fs_2178_[8]) / f_2195_);
							int i_2199_ = method2674(f_2196_, f_2197_, f_2198_);
							method2698(anIntArray9077[i_2172_], anIntArray9047[i_2172_], anIntArray9065[i_2172_], i_2175_, i_2176_, i_2177_, i_2199_, fs_2178_, i_2179_, f, f_2182_, f_2183_, fs);
							fs_2136_[0] = fs[0];
							fs_2137_[0] = fs[1];
							method2698(anIntArray9077[i_2173_], anIntArray9047[i_2173_], anIntArray9065[i_2173_], i_2175_, i_2176_, i_2177_, i_2199_, fs_2178_, i_2179_, f, f_2182_, f_2183_, fs);
							fs_2136_[1] = fs[0];
							fs_2137_[1] = fs[1];
							method2698(anIntArray9077[i_2174_], anIntArray9047[i_2174_], anIntArray9065[i_2174_], i_2175_, i_2176_, i_2177_, i_2199_, fs_2178_, i_2179_, f, f_2182_, f_2183_, fs);
							fs_2136_[2] = fs[0];
							fs_2137_[2] = fs[1];
						} else if (i_2141_ == 3) {
							method2675(anIntArray9077[i_2172_], anIntArray9047[i_2172_], anIntArray9065[i_2172_], i_2175_, i_2176_, i_2177_, fs_2178_, i_2179_, f, fs);
							fs_2136_[0] = fs[0];
							fs_2137_[0] = fs[1];
							method2675(anIntArray9077[i_2173_], anIntArray9047[i_2173_], anIntArray9065[i_2173_], i_2175_, i_2176_, i_2177_, fs_2178_, i_2179_, f, fs);
							fs_2136_[1] = fs[0];
							fs_2137_[1] = fs[1];
							method2675(anIntArray9077[i_2174_], anIntArray9047[i_2174_], anIntArray9065[i_2174_], i_2175_, i_2176_, i_2177_, fs_2178_, i_2179_, f, fs);
							fs_2136_[2] = fs[0];
							fs_2137_[2] = fs[1];
							if ((i_2179_ & 0x1) == 0) {
								if (fs_2136_[1] - fs_2136_[0] > 0.5F)
									fs_2136_[1]--;
								else if (fs_2136_[0] - fs_2136_[1] > 0.5F)
									fs_2136_[1]++;
								if (fs_2136_[2] - fs_2136_[0] > 0.5F)
									fs_2136_[2]--;
								else if (fs_2136_[0] - fs_2136_[2] > 0.5F)
									fs_2136_[2]++;
							} else {
								if (fs_2137_[1] - fs_2137_[0] > 0.5F)
									fs_2137_[1]--;
								else if (fs_2137_[0] - fs_2137_[1] > 0.5F)
									fs_2137_[1]++;
								if (fs_2137_[2] - fs_2137_[0] > 0.5F)
									fs_2137_[2]--;
								else if (fs_2137_[0] - fs_2137_[2] > 0.5F)
									fs_2137_[2]++;
							}
						}
					}
				}
			}
		}
		if (!bool_2131_) {
			aFloatArrayArray9075 = null;
			aFloatArrayArray9117 = null;
		}
		if (class179.anIntArray1956 != null && (anInt9058 & 0x20) != 0)
			anIntArrayArray9091 = class179.method3510(true);
		if (class179.anIntArray1993 != null && (anInt9058 & 0x180) != 0)
			anIntArrayArray9048 = class179.method3488();
		if (class179.aClass176Array1997 != null && (anInt9058 & 0x400) != 0)
			anIntArrayArray9104 = class179.method3489();
		if (class179.aShortArray1959 != null) {
			aShortArray9087 = new short[anInt9074];
			boolean bool_2200_ = false;
			for (int i_2201_ = 0; i_2201_ < anInt9074; i_2201_++) {
				short i_2202_ = class179.aShortArray1959[i_2201_];
				if (i_2202_ != -1) {
					Class177 class177 = aClass178_Sub3_9049.aClass172_1916.method2895(i_2202_ & 0xffff, 574012999);
					if ((i_2114_ & 0x40) == 0 || !class177.aBool1876) {
						aShortArray9087[i_2201_] = i_2202_;
						bool_2200_ = true;
						if (class177.aClass593_1884 == Class593.aClass593_7811)
							aBool9128 = true;
						if (class177.aByte1885 != 0 || class177.aByte1886 != 0)
							aBool9092 = true;
					} else
						aShortArray9087[i_2201_] = (short) -1;
				} else
					aShortArray9087[i_2201_] = (short) -1;
			}
			if (!bool_2200_)
				aShortArray9087 = null;
		} else
			aShortArray9087 = null;
		if (aBool9128 || aClass101Array9102 != null) {
			aShortArray9116 = new short[anInt9074];
			for (int i_2203_ = 0; i_2203_ < anInt9074; i_2203_++)
				aShortArray9116[i_2203_] = (short) is[i_2203_];
		}
	}

	public Class143[] method2714() {
		return aClass143Array9100;
	}

	boolean method2768() {
		if (anIntArrayArray9091 == null)
			return false;
		anInt9095 = 0;
		anInt9096 = 0;
		anInt9097 = 0;
		return true;
	}

	public void method2822(int i, int i_2204_, int i_2205_, int i_2206_) {
		if ((anInt9058 & 0x80000) != 524288)
			throw new IllegalStateException();
		for (int i_2207_ = 0; i_2207_ < anInt9074; i_2207_++) {
			int i_2208_ = aShortArray9088[i_2207_] & 0xffff;
			int i_2209_ = i_2208_ >> 10 & 0x3f;
			int i_2210_ = i_2208_ >> 7 & 0x7;
			int i_2211_ = i_2208_ & 0x7f;
			if (i != -1)
				i_2209_ += (i - i_2209_) * i_2206_ >> 7;
			if (i_2204_ != -1)
				i_2210_ += (i_2204_ - i_2210_) * i_2206_ >> 7;
			if (i_2205_ != -1)
				i_2211_ += (i_2205_ - i_2211_) * i_2206_ >> 7;
			aShortArray9088[i_2207_] = (short) (i_2209_ << 10 | i_2210_ << 7 | i_2211_);
		}
		if (aClass101Array9102 != null) {
			for (int i_2212_ = 0; i_2212_ < anInt9101; i_2212_++) {
				Class101 class101 = aClass101Array9102[i_2212_];
				Class103 class103 = aClass103Array9103[i_2212_];
				class103.anInt1258 = (class103.anInt1258 * 330457669 & ~0xffffff | ((Class638.anIntArray8306[Class493.method8085((aShortArray9088[(class101.anInt1241 * -566359109)]) & 0xffff, -281068578) & 0xffff]) & 0xffffff)) * -1951506291;
			}
		}
		if (anInt9084 == 2)
			anInt9084 = 1;
	}

	public Class184[] method2823() {
		return aClass184Array9089;
	}

	public Class143[] method2728() {
		return aClass143Array9100;
	}

	public Class143[] method2825() {
		return aClass143Array9100;
	}

	public int method2741() {
		if (!aBool9105)
			method14478();
		return aShort9090;
	}

	public Class143[] method2686() {
		return aClass143Array9100;
	}

	public boolean method2828() {
		if (aShortArray9087 == null)
			return true;
		for (int i = 0; i < aShortArray9087.length; i++) {
			if (aShortArray9087[i] != -1 && !aClass178_Sub3_9049.method15414(aShortArray9087[i]))
				return false;
		}
		return true;
	}

	public boolean method2829() {
		return aBool9128;
	}

	public boolean method2830() {
		return aBool9128;
	}

	public boolean method2831() {
		return aBool9092;
	}

	public Class523_Sub27_Sub4 method2788(Class523_Sub27_Sub4 class523_sub27_sub4) {
		return null;
	}

	public void method2833(int i, int i_2213_, int i_2214_) {
		if (i != 0 && (anInt9058 & 0x1) != 1)
			throw new IllegalStateException();
		if (i_2213_ != 0 && (anInt9058 & 0x2) != 2)
			throw new IllegalStateException();
		if (i_2214_ != 0 && (anInt9058 & 0x4) != 4)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i_2215_ = 0; i_2215_ < anInt9061; i_2215_++) {
				anIntArray9077[i_2215_] += i;
				anIntArray9047[i_2215_] += i_2213_;
				anIntArray9065[i_2215_] += i_2214_;
			}
		}
	}

	public void method2775(int i, int i_2216_, int i_2217_) {
		if (i != 0 && (anInt9058 & 0x1) != 1)
			throw new IllegalStateException();
		if (i_2216_ != 0 && (anInt9058 & 0x2) != 2)
			throw new IllegalStateException();
		if (i_2217_ != 0 && (anInt9058 & 0x4) != 4)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i_2218_ = 0; i_2218_ < anInt9061; i_2218_++) {
				anIntArray9077[i_2218_] += i;
				anIntArray9047[i_2218_] += i_2216_;
				anIntArray9065[i_2218_] += i_2217_;
			}
		}
	}

	public int method2676() {
		if (!aBool9105)
			method14478();
		return aShort9108;
	}

	public int method2814() {
		if (!aBool9105)
			method14478();
		return aShort9108;
	}

	public void method2827(int i) {
		if ((anInt9058 & 0x1000) != 4096)
			throw new IllegalStateException();
		anInt9059 = i;
		anInt9084 = 0;
	}

	final void method14530(boolean bool, boolean bool_2219_, boolean bool_2220_, boolean bool_2221_, boolean bool_2222_) {
		if (aClass101Array9102 != null) {
			for (int i = 0; i < anInt9101; i++) {
				Class101 class101 = aClass101Array9102[i];
				anIntArray9129[class101.anInt1241 * -566359109] = i;
			}
		}
		if (aBool9128 || aClass101Array9102 != null) {
			if ((anInt9058 & 0x100) == 0 && aShortArray9116 != null) {
				for (int i = 0; i < anInt9070; i++) {
					short i_2223_ = aShortArray9116[i];
					method14455(bool, bool_2219_, bool_2220_, i_2223_, bool_2221_, bool_2222_);
				}
			} else {
				for (int i = 0; i < anInt9070; i++) {
					if (!method14473(i) && !method14474(i))
						method14455(bool, bool_2219_, bool_2220_, i, bool_2221_, bool_2222_);
				}
				if (aByteArray9130 == null) {
					for (int i = 0; i < anInt9070; i++) {
						if (method14473(i) || method14474(i))
							method14455(bool, bool_2219_, bool_2220_, i, bool_2221_, bool_2222_);
					}
				} else {
					for (int i = 0; i < 12; i++) {
						for (int i_2224_ = 0; i_2224_ < anInt9070; i_2224_++) {
							if (aByteArray9130[i_2224_] == i && (method14473(i_2224_) || method14474(i_2224_)))
								method14455(bool, bool_2219_, bool_2220_, i_2224_, bool_2221_, bool_2222_);
						}
					}
				}
			}
			if (aClass101Array9102 != null)
				method14527(bool, bool_2219_, bool_2220_);
		} else {
			for (int i = 0; i < anInt9070; i++)
				method14455(bool, bool_2219_, bool_2220_, i, bool_2221_, bool_2222_);
		}
	}

	public void method2786(Class435 class435) {
		method14529(aClass178_Sub3_9049.method15475(Thread.currentThread()));
		Class441 class441 = aClass99_9069.aClass441_1202;
		class441.method7090(class435);
		if (aClass184Array9089 != null) {
			for (int i = 0; i < aClass184Array9089.length; i++) {
				Class184 class184 = aClass184Array9089[i];
				Class184 class184_2225_ = class184;
				if (class184.aClass184_2111 != null)
					class184_2225_ = class184.aClass184_2111;
				class184_2225_.anInt2117 = ((int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) anIntArray9077[(class184.anInt2113 * 1717084103)]) + (class441.aFloatArray4916[4] * (float) (anIntArray9047[(class184.anInt2113 * 1717084103)])) + (class441.aFloatArray4916[8] * (float) (anIntArray9065[(class184.anInt2113 * 1717084103)])))) * 1979506107);
				class184_2225_.anInt2118 = (int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) (anIntArray9077[class184.anInt2113 * 1717084103])) + (class441.aFloatArray4916[5] * (float) anIntArray9047[(class184.anInt2113 * 1717084103)]) + (class441.aFloatArray4916[9] * (float) (anIntArray9065[(class184.anInt2113 * 1717084103)])))) * 546606927;
				class184_2225_.anInt2119 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9077[(class184.anInt2113 * 1717084103)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9047[(class184.anInt2113 * 1717084103)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9065[(class184.anInt2113 * 1717084103)])))) * 1120011767);
				class184_2225_.anInt2120 = (int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) (anIntArray9077[class184.anInt2114 * -615332511])) + (class441.aFloatArray4916[4] * (float) anIntArray9047[(class184.anInt2114 * -615332511)]) + (class441.aFloatArray4916[8] * (float) (anIntArray9065[(class184.anInt2114 * -615332511)])))) * 942705911;
				class184_2225_.anInt2121 = (int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) (anIntArray9077[class184.anInt2114 * -615332511])) + (class441.aFloatArray4916[5] * (float) anIntArray9047[(class184.anInt2114 * -615332511)]) + (class441.aFloatArray4916[9] * (float) (anIntArray9065[(class184.anInt2114 * -615332511)])))) * 607651075;
				class184_2225_.anInt2122 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9077[(class184.anInt2114 * -615332511)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9047[(class184.anInt2114 * -615332511)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9065[(class184.anInt2114 * -615332511)])))) * 2070256909);
				class184_2225_.anInt2125 = (int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) (anIntArray9077[class184.anInt2115 * -648014401])) + (class441.aFloatArray4916[4] * (float) anIntArray9047[(class184.anInt2115 * -648014401)]) + (class441.aFloatArray4916[8] * (float) (anIntArray9065[(class184.anInt2115 * -648014401)])))) * 528708299;
				class184_2225_.anInt2124 = (int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) (anIntArray9077[class184.anInt2115 * -648014401])) + (class441.aFloatArray4916[5] * (float) anIntArray9047[(class184.anInt2115 * -648014401)]) + (class441.aFloatArray4916[9] * (float) (anIntArray9065[(class184.anInt2115 * -648014401)])))) * 588958573;
				class184_2225_.anInt2110 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9077[(class184.anInt2115 * -648014401)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9047[(class184.anInt2115 * -648014401)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9065[(class184.anInt2115 * -648014401)])))) * -342864097);
			}
		}
		if (aClass143Array9100 != null) {
			for (int i = 0; i < aClass143Array9100.length; i++) {
				Class143 class143 = aClass143Array9100[i];
				Class143 class143_2226_ = class143;
				if (class143.aClass143_1687 != null)
					class143_2226_ = class143.aClass143_1687;
				if (class143.aClass441_1692 != null)
					class143.aClass441_1692.method7086(class441);
				else
					class143.aClass441_1692 = new Class441(class441);
				class143_2226_.anInt1689 = (int) (class441.aFloatArray4916[12] + ((class441.aFloatArray4916[0] * (float) (anIntArray9077[class143.anInt1688 * -256753261])) + (class441.aFloatArray4916[4] * (float) anIntArray9047[(class143.anInt1688 * -256753261)]) + (class441.aFloatArray4916[8] * (float) (anIntArray9065[(class143.anInt1688 * -256753261)])))) * 246585729;
				class143_2226_.anInt1690 = ((int) (class441.aFloatArray4916[13] + ((class441.aFloatArray4916[1] * (float) anIntArray9077[(class143.anInt1688 * -256753261)]) + (class441.aFloatArray4916[5] * (float) (anIntArray9047[(class143.anInt1688 * -256753261)])) + (class441.aFloatArray4916[9] * (float) (anIntArray9065[(class143.anInt1688 * -256753261)])))) * 1541286973);
				class143_2226_.anInt1691 = ((int) (class441.aFloatArray4916[14] + ((class441.aFloatArray4916[2] * (float) anIntArray9077[(class143.anInt1688 * -256753261)]) + (class441.aFloatArray4916[6] * (float) (anIntArray9047[(class143.anInt1688 * -256753261)])) + (class441.aFloatArray4916[10] * (float) (anIntArray9065[(class143.anInt1688 * -256753261)])))) * -1727847879);
			}
		}
	}

	void method2840() {
		if (aClass178_Sub3_9049.anInt9819 * 1353126165 > 1) {
			synchronized (this) {
				while (aBool1796) {
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBool1796 = true;
			}
		}
	}

	public void method2817(short i, short i_2227_) {
		if (aShortArray9087 != null) {
			if (!aBool9092 && i_2227_ >= 0) {
				Class177 class177 = aClass178_Sub3_9049.aClass172_1916.method2895(i_2227_ & 0xffff, 492037732);
				if (class177.aByte1885 != 0 || class177.aByte1886 != 0)
					aBool9092 = true;
			}
			for (int i_2228_ = 0; i_2228_ < anInt9074; i_2228_++) {
				if (aShortArray9087[i_2228_] == i)
					aShortArray9087[i_2228_] = i_2227_;
			}
		}
	}

	void method14531() {
		synchronized (this) {
			for (int i = 0; i < anInt9062; i++) {
				int i_2229_ = anIntArray9065[i];
				anIntArray9065[i] = anIntArray9077[i];
				anIntArray9077[i] = -i_2229_;
				if (aClass109Array9067[i] != null) {
					i_2229_ = aClass109Array9067[i].anInt1327;
					aClass109Array9067[i].anInt1327 = aClass109Array9067[i].anInt1326;
					aClass109Array9067[i].anInt1326 = -i_2229_;
				}
			}
			if (aClass96Array9083 != null) {
				for (int i = 0; i < anInt9074; i++) {
					if (aClass96Array9083[i] != null) {
						int i_2230_ = aClass96Array9083[i].anInt1183;
						aClass96Array9083[i].anInt1183 = aClass96Array9083[i].anInt1181;
						aClass96Array9083[i].anInt1181 = -i_2230_;
					}
				}
			}
			for (int i = anInt9062; i < anInt9061; i++) {
				int i_2231_ = anIntArray9065[i];
				anIntArray9065[i] = anIntArray9077[i];
				anIntArray9077[i] = -i_2231_;
			}
			anInt9084 = 0;
			aBool9105 = false;
		}
	}

	public int method2871() {
		if (!aBool9114)
			method2719();
		return aShort9115;
	}

	void method14532(boolean bool) {
		if (aClass178_Sub3_9049.anInt9819 * 1353126165 > 1) {
			synchronized (this) {
				method14492(bool);
			}
		} else
			method14492(bool);
	}
}
