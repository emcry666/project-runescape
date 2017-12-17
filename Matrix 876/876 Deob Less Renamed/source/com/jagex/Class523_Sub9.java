/* Class523_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.OpenGL;

public class Class523_Sub9 extends Class523 {
	float aFloat10407;
	Class142_Sub2 aClass142_Sub2_10408;
	int anInt10409;
	Stream aStream10410;
	Class178_Sub1 aClass178_Sub1_10411;
	Class131 aClass131_10412;
	Class130_Sub1 aClass130_Sub1_10413;
	Class163 aClass163_10414;
	NativeHeapBuffer aNativeHeapBuffer10415;
	int[] anIntArray10416;

	void method15926(int i) {
		aStream10410.method1699(i * 4 + 3);
		aStream10410.method1700(-1);
	}

	Class523_Sub9(Class142_Sub2 class142_sub2, int i, int i_0_, Class163 class163) {
		aClass142_Sub2_10408 = class142_sub2;
		aClass178_Sub1_10411 = aClass142_Sub2_10408.aClass178_Sub1_9729;
		anInt10409 = i;
		aFloat10407 = (float) i_0_;
		aClass163_10414 = class163;
		anIntArray10416 = new int[(aClass142_Sub2_10408.anInt1683 * 692304099 * (aClass142_Sub2_10408.anInt1681 * 452998539))];
		aClass130_Sub1_10413 = new Class130_Sub1(aClass178_Sub1_10411, 5123, null, 1);
	}

	void method15927(int i) {
		aStream10410.method1703();
		Interface15 interface15 = aClass178_Sub1_10411.method14661(4, aNativeHeapBuffer10415, i * 4, false);
		if (interface15 instanceof Class135_Sub1)
			aNativeHeapBuffer10415.method1678();
		aClass131_10412 = new Class131(interface15, 5121, 4, 0);
		aNativeHeapBuffer10415 = null;
		aStream10410 = null;
	}

	void method15928(int i) {
		aNativeHeapBuffer10415 = aClass178_Sub1_10411.aNativeHeap9289.method1905(i * 4, true);
		aStream10410 = new Stream(aNativeHeapBuffer10415);
	}

	void method15929(int i, int i_1_, int i_2_, float f) {
		if (anInt10409 != -1) {
			Class177 class177 = aClass178_Sub1_10411.aClass172_1916.method2895(anInt10409, 504655223);
			int i_3_ = class177.aByte1912 & 0xff;
			if (i_3_ != 0 && class177.aByte1905 != 4) {
				int i_4_;
				if (i_2_ < 0)
					i_4_ = 0;
				else if (i_2_ > 127)
					i_4_ = 16777215;
				else
					i_4_ = 131586 * i_2_;
				if (i_3_ == 256)
					i_1_ = i_4_;
				else {
					int i_5_ = i_3_;
					int i_6_ = 256 - i_3_;
					i_1_ = (((i_4_ & 0xff00ff) * i_5_ + (i_1_ & 0xff00ff) * i_6_ & ~0xff00ff) + ((i_4_ & 0xff00) * i_5_ + (i_1_ & 0xff00) * i_6_ & 0xff0000)) >> 8;
				}
			}
			int i_7_ = class177.aByte1883 & 0xff;
			if (i_7_ != 0) {
				i_7_ += 256;
				int i_8_ = ((i_1_ & 0xff0000) >> 16) * i_7_;
				if (i_8_ > 65535)
					i_8_ = 65535;
				int i_9_ = ((i_1_ & 0xff00) >> 8) * i_7_;
				if (i_9_ > 65535)
					i_9_ = 65535;
				int i_10_ = (i_1_ & 0xff) * i_7_;
				if (i_10_ > 65535)
					i_10_ = 65535;
				i_1_ = (i_8_ << 8 & 0xff0000) + (i_9_ & 0xff00) + (i_10_ >> 8);
			}
		}
		if (f != 1.0F) {
			int i_11_ = i_1_ >> 16 & 0xff;
			int i_12_ = i_1_ >> 8 & 0xff;
			int i_13_ = i_1_ & 0xff;
			i_11_ *= f;
			if (i_11_ < 0)
				i_11_ = 0;
			else if (i_11_ > 255)
				i_11_ = 255;
			i_12_ *= f;
			if (i_12_ < 0)
				i_12_ = 0;
			else if (i_12_ > 255)
				i_12_ = 255;
			i_13_ *= f;
			if (i_13_ < 0)
				i_13_ = 0;
			else if (i_13_ > 255)
				i_13_ = 255;
			i_1_ = i_11_ << 16 | i_12_ << 8 | i_13_;
		}
		aStream10410.method1699(i * 4);
		aStream10410.method1700((byte) (i_1_ >> 16));
		aStream10410.method1700((byte) (i_1_ >> 8));
		aStream10410.method1700((byte) i_1_);
	}

	void method15930(int i) {
		aNativeHeapBuffer10415 = aClass178_Sub1_10411.aNativeHeap9289.method1905(i * 4, true);
		aStream10410 = new Stream(aNativeHeapBuffer10415);
	}

	void method15931(int i, int i_14_, int i_15_) {
		anIntArray10416[(i_14_ * (aClass142_Sub2_10408.anInt1683 * 692304099) + i)] |= 1 << i_15_;
	}

	void method15932(int i) {
		aNativeHeapBuffer10415 = aClass178_Sub1_10411.aNativeHeap9289.method1905(i * 4, true);
		aStream10410 = new Stream(aNativeHeapBuffer10415);
	}

	void method15933(int[] is, int i) {
		int i_16_ = 0;
		Class523_Sub34_Sub1 class523_sub34_sub1 = aClass178_Sub1_10411.aClass523_Sub34_Sub1_9321;
		class523_sub34_sub1.anInt10661 = 0;
		if (aClass178_Sub1_10411.aBool9393) {
			for (int i_17_ = 0; i_17_ < i; i_17_++) {
				int i_18_ = is[i_17_];
				short[] is_19_ = aClass142_Sub2_10408.aShortArrayArray9715[i_18_];
				int i_20_ = anIntArray10416[i_18_];
				if (i_20_ != 0 && is_19_ != null) {
					int i_21_ = 0;
					int i_22_ = 0;
					while (i_22_ < is_19_.length) {
						if ((i_20_ & 1 << i_21_++) != 0) {
							class523_sub34_sub1.writeShort((is_19_[i_22_++] & 0xffff), (byte) -32);
							i_16_++;
							class523_sub34_sub1.writeShort((is_19_[i_22_++] & 0xffff), (byte) -9);
							i_16_++;
							class523_sub34_sub1.writeShort((is_19_[i_22_++] & 0xffff), (byte) -125);
							i_16_++;
						} else
							i_22_ += 3;
					}
				}
			}
		} else {
			for (int i_23_ = 0; i_23_ < i; i_23_++) {
				int i_24_ = is[i_23_];
				short[] is_25_ = aClass142_Sub2_10408.aShortArrayArray9715[i_24_];
				int i_26_ = anIntArray10416[i_24_];
				if (i_26_ != 0 && is_25_ != null) {
					int i_27_ = 0;
					int i_28_ = 0;
					while (i_28_ < is_25_.length) {
						if ((i_26_ & 1 << i_27_++) != 0) {
							class523_sub34_sub1.method16262((is_25_[i_28_++] & 0xffff), -1012632335);
							i_16_++;
							class523_sub34_sub1.method16262((is_25_[i_28_++] & 0xffff), -551415337);
							i_16_++;
							class523_sub34_sub1.method16262((is_25_[i_28_++] & 0xffff), -2099114297);
							i_16_++;
						} else
							i_28_ += 3;
					}
				}
			}
		}
		if (i_16_ > 0) {
			aClass130_Sub1_10413.method100(5123, class523_sub34_sub1.aByteArray10658, (class523_sub34_sub1.anInt10661 * 2349011));
			aClass178_Sub1_10411.method14664(aClass142_Sub2_10408.aClass131_9728, aClass142_Sub2_10408.aClass131_9730, aClass131_10412, aClass142_Sub2_10408.aClass131_9708);
			aClass178_Sub1_10411.method14672(anInt10409, (aClass142_Sub2_10408.anInt9726 & 0x7) != 0, (aClass142_Sub2_10408.anInt9726 & 0x8) != 0);
			if (aClass178_Sub1_10411.aBool9375)
				aClass178_Sub1_10411.method3150(2147483647, aClass163_10414);
			OpenGL.glMatrixMode(5890);
			OpenGL.glPushMatrix();
			OpenGL.glScalef(1.0F / aFloat10407, 1.0F / aFloat10407, 1.0F);
			OpenGL.glMatrixMode(5888);
			aClass178_Sub1_10411.method14664(aClass142_Sub2_10408.aClass131_9728, aClass142_Sub2_10408.aClass131_9730, aClass131_10412, aClass142_Sub2_10408.aClass131_9708);
			aClass178_Sub1_10411.method14652(aClass130_Sub1_10413, 4, 0, i_16_);
			OpenGL.glMatrixMode(5890);
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
		}
	}

	void method15934(int i) {
		aNativeHeapBuffer10415 = aClass178_Sub1_10411.aNativeHeap9289.method1905(i * 4, true);
		aStream10410 = new Stream(aNativeHeapBuffer10415);
	}

	void method15935(int i) {
		aStream10410.method1699(i * 4 + 3);
		aStream10410.method1700(-1);
	}

	void method15936(int i, int i_29_, int i_30_) {
		anIntArray10416[(i_29_ * (aClass142_Sub2_10408.anInt1683 * 692304099) + i)] |= 1 << i_30_;
	}

	void method15937(int i, int i_31_, int i_32_) {
		anIntArray10416[(i_31_ * (aClass142_Sub2_10408.anInt1683 * 692304099) + i)] |= 1 << i_32_;
	}

	void method15938(int i, int i_33_, int i_34_) {
		anIntArray10416[(i_33_ * (aClass142_Sub2_10408.anInt1683 * 692304099) + i)] |= 1 << i_34_;
	}

	void method15939(int i, int i_35_, int i_36_, float f) {
		if (anInt10409 != -1) {
			Class177 class177 = aClass178_Sub1_10411.aClass172_1916.method2895(anInt10409, -930763103);
			int i_37_ = class177.aByte1912 & 0xff;
			if (i_37_ != 0 && class177.aByte1905 != 4) {
				int i_38_;
				if (i_36_ < 0)
					i_38_ = 0;
				else if (i_36_ > 127)
					i_38_ = 16777215;
				else
					i_38_ = 131586 * i_36_;
				if (i_37_ == 256)
					i_35_ = i_38_;
				else {
					int i_39_ = i_37_;
					int i_40_ = 256 - i_37_;
					i_35_ = ((((i_38_ & 0xff00ff) * i_39_ + (i_35_ & 0xff00ff) * i_40_) & ~0xff00ff) + (((i_38_ & 0xff00) * i_39_ + (i_35_ & 0xff00) * i_40_) & 0xff0000)) >> 8;
				}
			}
			int i_41_ = class177.aByte1883 & 0xff;
			if (i_41_ != 0) {
				i_41_ += 256;
				int i_42_ = ((i_35_ & 0xff0000) >> 16) * i_41_;
				if (i_42_ > 65535)
					i_42_ = 65535;
				int i_43_ = ((i_35_ & 0xff00) >> 8) * i_41_;
				if (i_43_ > 65535)
					i_43_ = 65535;
				int i_44_ = (i_35_ & 0xff) * i_41_;
				if (i_44_ > 65535)
					i_44_ = 65535;
				i_35_ = (i_42_ << 8 & 0xff0000) + (i_43_ & 0xff00) + (i_44_ >> 8);
			}
		}
		if (f != 1.0F) {
			int i_45_ = i_35_ >> 16 & 0xff;
			int i_46_ = i_35_ >> 8 & 0xff;
			int i_47_ = i_35_ & 0xff;
			i_45_ *= f;
			if (i_45_ < 0)
				i_45_ = 0;
			else if (i_45_ > 255)
				i_45_ = 255;
			i_46_ *= f;
			if (i_46_ < 0)
				i_46_ = 0;
			else if (i_46_ > 255)
				i_46_ = 255;
			i_47_ *= f;
			if (i_47_ < 0)
				i_47_ = 0;
			else if (i_47_ > 255)
				i_47_ = 255;
			i_35_ = i_45_ << 16 | i_46_ << 8 | i_47_;
		}
		aStream10410.method1699(i * 4);
		aStream10410.method1700((byte) (i_35_ >> 16));
		aStream10410.method1700((byte) (i_35_ >> 8));
		aStream10410.method1700((byte) i_35_);
	}

	void method15940(int i, int i_48_, int i_49_, float f) {
		if (anInt10409 != -1) {
			Class177 class177 = aClass178_Sub1_10411.aClass172_1916.method2895(anInt10409, -906722687);
			int i_50_ = class177.aByte1912 & 0xff;
			if (i_50_ != 0 && class177.aByte1905 != 4) {
				int i_51_;
				if (i_49_ < 0)
					i_51_ = 0;
				else if (i_49_ > 127)
					i_51_ = 16777215;
				else
					i_51_ = 131586 * i_49_;
				if (i_50_ == 256)
					i_48_ = i_51_;
				else {
					int i_52_ = i_50_;
					int i_53_ = 256 - i_50_;
					i_48_ = ((((i_51_ & 0xff00ff) * i_52_ + (i_48_ & 0xff00ff) * i_53_) & ~0xff00ff) + (((i_51_ & 0xff00) * i_52_ + (i_48_ & 0xff00) * i_53_) & 0xff0000)) >> 8;
				}
			}
			int i_54_ = class177.aByte1883 & 0xff;
			if (i_54_ != 0) {
				i_54_ += 256;
				int i_55_ = ((i_48_ & 0xff0000) >> 16) * i_54_;
				if (i_55_ > 65535)
					i_55_ = 65535;
				int i_56_ = ((i_48_ & 0xff00) >> 8) * i_54_;
				if (i_56_ > 65535)
					i_56_ = 65535;
				int i_57_ = (i_48_ & 0xff) * i_54_;
				if (i_57_ > 65535)
					i_57_ = 65535;
				i_48_ = (i_55_ << 8 & 0xff0000) + (i_56_ & 0xff00) + (i_57_ >> 8);
			}
		}
		if (f != 1.0F) {
			int i_58_ = i_48_ >> 16 & 0xff;
			int i_59_ = i_48_ >> 8 & 0xff;
			int i_60_ = i_48_ & 0xff;
			i_58_ *= f;
			if (i_58_ < 0)
				i_58_ = 0;
			else if (i_58_ > 255)
				i_58_ = 255;
			i_59_ *= f;
			if (i_59_ < 0)
				i_59_ = 0;
			else if (i_59_ > 255)
				i_59_ = 255;
			i_60_ *= f;
			if (i_60_ < 0)
				i_60_ = 0;
			else if (i_60_ > 255)
				i_60_ = 255;
			i_48_ = i_58_ << 16 | i_59_ << 8 | i_60_;
		}
		aStream10410.method1699(i * 4);
		aStream10410.method1700((byte) (i_48_ >> 16));
		aStream10410.method1700((byte) (i_48_ >> 8));
		aStream10410.method1700((byte) i_48_);
	}

	void method15941(int[] is, int i) {
		int i_61_ = 0;
		Class523_Sub34_Sub1 class523_sub34_sub1 = aClass178_Sub1_10411.aClass523_Sub34_Sub1_9321;
		class523_sub34_sub1.anInt10661 = 0;
		if (aClass178_Sub1_10411.aBool9393) {
			for (int i_62_ = 0; i_62_ < i; i_62_++) {
				int i_63_ = is[i_62_];
				short[] is_64_ = aClass142_Sub2_10408.aShortArrayArray9715[i_63_];
				int i_65_ = anIntArray10416[i_63_];
				if (i_65_ != 0 && is_64_ != null) {
					int i_66_ = 0;
					int i_67_ = 0;
					while (i_67_ < is_64_.length) {
						if ((i_65_ & 1 << i_66_++) != 0) {
							class523_sub34_sub1.writeShort((is_64_[i_67_++] & 0xffff), (byte) -13);
							i_61_++;
							class523_sub34_sub1.writeShort((is_64_[i_67_++] & 0xffff), (byte) -96);
							i_61_++;
							class523_sub34_sub1.writeShort((is_64_[i_67_++] & 0xffff), (byte) -84);
							i_61_++;
						} else
							i_67_ += 3;
					}
				}
			}
		} else {
			for (int i_68_ = 0; i_68_ < i; i_68_++) {
				int i_69_ = is[i_68_];
				short[] is_70_ = aClass142_Sub2_10408.aShortArrayArray9715[i_69_];
				int i_71_ = anIntArray10416[i_69_];
				if (i_71_ != 0 && is_70_ != null) {
					int i_72_ = 0;
					int i_73_ = 0;
					while (i_73_ < is_70_.length) {
						if ((i_71_ & 1 << i_72_++) != 0) {
							class523_sub34_sub1.method16262((is_70_[i_73_++] & 0xffff), -1917931928);
							i_61_++;
							class523_sub34_sub1.method16262((is_70_[i_73_++] & 0xffff), -895005675);
							i_61_++;
							class523_sub34_sub1.method16262((is_70_[i_73_++] & 0xffff), -750921433);
							i_61_++;
						} else
							i_73_ += 3;
					}
				}
			}
		}
		if (i_61_ > 0) {
			aClass130_Sub1_10413.method100(5123, class523_sub34_sub1.aByteArray10658, (class523_sub34_sub1.anInt10661 * 2349011));
			aClass178_Sub1_10411.method14664(aClass142_Sub2_10408.aClass131_9728, aClass142_Sub2_10408.aClass131_9730, aClass131_10412, aClass142_Sub2_10408.aClass131_9708);
			aClass178_Sub1_10411.method14672(anInt10409, (aClass142_Sub2_10408.anInt9726 & 0x7) != 0, (aClass142_Sub2_10408.anInt9726 & 0x8) != 0);
			if (aClass178_Sub1_10411.aBool9375)
				aClass178_Sub1_10411.method3150(2147483647, aClass163_10414);
			OpenGL.glMatrixMode(5890);
			OpenGL.glPushMatrix();
			OpenGL.glScalef(1.0F / aFloat10407, 1.0F / aFloat10407, 1.0F);
			OpenGL.glMatrixMode(5888);
			aClass178_Sub1_10411.method14664(aClass142_Sub2_10408.aClass131_9728, aClass142_Sub2_10408.aClass131_9730, aClass131_10412, aClass142_Sub2_10408.aClass131_9708);
			aClass178_Sub1_10411.method14652(aClass130_Sub1_10413, 4, 0, i_61_);
			OpenGL.glMatrixMode(5890);
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
		}
	}

	void method15942(int i, int i_74_, int i_75_, float f) {
		if (anInt10409 != -1) {
			Class177 class177 = aClass178_Sub1_10411.aClass172_1916.method2895(anInt10409, 280003517);
			int i_76_ = class177.aByte1912 & 0xff;
			if (i_76_ != 0 && class177.aByte1905 != 4) {
				int i_77_;
				if (i_75_ < 0)
					i_77_ = 0;
				else if (i_75_ > 127)
					i_77_ = 16777215;
				else
					i_77_ = 131586 * i_75_;
				if (i_76_ == 256)
					i_74_ = i_77_;
				else {
					int i_78_ = i_76_;
					int i_79_ = 256 - i_76_;
					i_74_ = ((((i_77_ & 0xff00ff) * i_78_ + (i_74_ & 0xff00ff) * i_79_) & ~0xff00ff) + (((i_77_ & 0xff00) * i_78_ + (i_74_ & 0xff00) * i_79_) & 0xff0000)) >> 8;
				}
			}
			int i_80_ = class177.aByte1883 & 0xff;
			if (i_80_ != 0) {
				i_80_ += 256;
				int i_81_ = ((i_74_ & 0xff0000) >> 16) * i_80_;
				if (i_81_ > 65535)
					i_81_ = 65535;
				int i_82_ = ((i_74_ & 0xff00) >> 8) * i_80_;
				if (i_82_ > 65535)
					i_82_ = 65535;
				int i_83_ = (i_74_ & 0xff) * i_80_;
				if (i_83_ > 65535)
					i_83_ = 65535;
				i_74_ = (i_81_ << 8 & 0xff0000) + (i_82_ & 0xff00) + (i_83_ >> 8);
			}
		}
		if (f != 1.0F) {
			int i_84_ = i_74_ >> 16 & 0xff;
			int i_85_ = i_74_ >> 8 & 0xff;
			int i_86_ = i_74_ & 0xff;
			i_84_ *= f;
			if (i_84_ < 0)
				i_84_ = 0;
			else if (i_84_ > 255)
				i_84_ = 255;
			i_85_ *= f;
			if (i_85_ < 0)
				i_85_ = 0;
			else if (i_85_ > 255)
				i_85_ = 255;
			i_86_ *= f;
			if (i_86_ < 0)
				i_86_ = 0;
			else if (i_86_ > 255)
				i_86_ = 255;
			i_74_ = i_84_ << 16 | i_85_ << 8 | i_86_;
		}
		aStream10410.method1699(i * 4);
		aStream10410.method1700((byte) (i_74_ >> 16));
		aStream10410.method1700((byte) (i_74_ >> 8));
		aStream10410.method1700((byte) i_74_);
	}

	void method15943(int[] is, int i) {
		int i_87_ = 0;
		Class523_Sub34_Sub1 class523_sub34_sub1 = aClass178_Sub1_10411.aClass523_Sub34_Sub1_9321;
		class523_sub34_sub1.anInt10661 = 0;
		if (aClass178_Sub1_10411.aBool9393) {
			for (int i_88_ = 0; i_88_ < i; i_88_++) {
				int i_89_ = is[i_88_];
				short[] is_90_ = aClass142_Sub2_10408.aShortArrayArray9715[i_89_];
				int i_91_ = anIntArray10416[i_89_];
				if (i_91_ != 0 && is_90_ != null) {
					int i_92_ = 0;
					int i_93_ = 0;
					while (i_93_ < is_90_.length) {
						if ((i_91_ & 1 << i_92_++) != 0) {
							class523_sub34_sub1.writeShort((is_90_[i_93_++] & 0xffff), (byte) -84);
							i_87_++;
							class523_sub34_sub1.writeShort((is_90_[i_93_++] & 0xffff), (byte) -114);
							i_87_++;
							class523_sub34_sub1.writeShort((is_90_[i_93_++] & 0xffff), (byte) -121);
							i_87_++;
						} else
							i_93_ += 3;
					}
				}
			}
		} else {
			for (int i_94_ = 0; i_94_ < i; i_94_++) {
				int i_95_ = is[i_94_];
				short[] is_96_ = aClass142_Sub2_10408.aShortArrayArray9715[i_95_];
				int i_97_ = anIntArray10416[i_95_];
				if (i_97_ != 0 && is_96_ != null) {
					int i_98_ = 0;
					int i_99_ = 0;
					while (i_99_ < is_96_.length) {
						if ((i_97_ & 1 << i_98_++) != 0) {
							class523_sub34_sub1.method16262((is_96_[i_99_++] & 0xffff), -1970436768);
							i_87_++;
							class523_sub34_sub1.method16262((is_96_[i_99_++] & 0xffff), -1395678101);
							i_87_++;
							class523_sub34_sub1.method16262((is_96_[i_99_++] & 0xffff), -477866663);
							i_87_++;
						} else
							i_99_ += 3;
					}
				}
			}
		}
		if (i_87_ > 0) {
			aClass130_Sub1_10413.method100(5123, class523_sub34_sub1.aByteArray10658, (class523_sub34_sub1.anInt10661 * 2349011));
			aClass178_Sub1_10411.method14664(aClass142_Sub2_10408.aClass131_9728, aClass142_Sub2_10408.aClass131_9730, aClass131_10412, aClass142_Sub2_10408.aClass131_9708);
			aClass178_Sub1_10411.method14672(anInt10409, (aClass142_Sub2_10408.anInt9726 & 0x7) != 0, (aClass142_Sub2_10408.anInt9726 & 0x8) != 0);
			if (aClass178_Sub1_10411.aBool9375)
				aClass178_Sub1_10411.method3150(2147483647, aClass163_10414);
			OpenGL.glMatrixMode(5890);
			OpenGL.glPushMatrix();
			OpenGL.glScalef(1.0F / aFloat10407, 1.0F / aFloat10407, 1.0F);
			OpenGL.glMatrixMode(5888);
			aClass178_Sub1_10411.method14664(aClass142_Sub2_10408.aClass131_9728, aClass142_Sub2_10408.aClass131_9730, aClass131_10412, aClass142_Sub2_10408.aClass131_9708);
			aClass178_Sub1_10411.method14652(aClass130_Sub1_10413, 4, 0, i_87_);
			OpenGL.glMatrixMode(5890);
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
		}
	}

	void method15944(int i, int i_100_, int i_101_, float f) {
		if (anInt10409 != -1) {
			Class177 class177 = aClass178_Sub1_10411.aClass172_1916.method2895(anInt10409, 4664797);
			int i_102_ = class177.aByte1912 & 0xff;
			if (i_102_ != 0 && class177.aByte1905 != 4) {
				int i_103_;
				if (i_101_ < 0)
					i_103_ = 0;
				else if (i_101_ > 127)
					i_103_ = 16777215;
				else
					i_103_ = 131586 * i_101_;
				if (i_102_ == 256)
					i_100_ = i_103_;
				else {
					int i_104_ = i_102_;
					int i_105_ = 256 - i_102_;
					i_100_ = ((((i_103_ & 0xff00ff) * i_104_ + (i_100_ & 0xff00ff) * i_105_) & ~0xff00ff) + (((i_103_ & 0xff00) * i_104_ + (i_100_ & 0xff00) * i_105_) & 0xff0000)) >> 8;
				}
			}
			int i_106_ = class177.aByte1883 & 0xff;
			if (i_106_ != 0) {
				i_106_ += 256;
				int i_107_ = ((i_100_ & 0xff0000) >> 16) * i_106_;
				if (i_107_ > 65535)
					i_107_ = 65535;
				int i_108_ = ((i_100_ & 0xff00) >> 8) * i_106_;
				if (i_108_ > 65535)
					i_108_ = 65535;
				int i_109_ = (i_100_ & 0xff) * i_106_;
				if (i_109_ > 65535)
					i_109_ = 65535;
				i_100_ = (i_107_ << 8 & 0xff0000) + (i_108_ & 0xff00) + (i_109_ >> 8);
			}
		}
		if (f != 1.0F) {
			int i_110_ = i_100_ >> 16 & 0xff;
			int i_111_ = i_100_ >> 8 & 0xff;
			int i_112_ = i_100_ & 0xff;
			i_110_ *= f;
			if (i_110_ < 0)
				i_110_ = 0;
			else if (i_110_ > 255)
				i_110_ = 255;
			i_111_ *= f;
			if (i_111_ < 0)
				i_111_ = 0;
			else if (i_111_ > 255)
				i_111_ = 255;
			i_112_ *= f;
			if (i_112_ < 0)
				i_112_ = 0;
			else if (i_112_ > 255)
				i_112_ = 255;
			i_100_ = i_110_ << 16 | i_111_ << 8 | i_112_;
		}
		aStream10410.method1699(i * 4);
		aStream10410.method1700((byte) (i_100_ >> 16));
		aStream10410.method1700((byte) (i_100_ >> 8));
		aStream10410.method1700((byte) i_100_);
	}
}
