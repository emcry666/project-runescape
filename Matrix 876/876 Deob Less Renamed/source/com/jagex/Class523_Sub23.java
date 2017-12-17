/* Class523_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

public class Class523_Sub23 extends Class523 {
	int[] anIntArray10528;
	Class142_Sub1 aClass142_Sub1_10529;
	int anInt10530;
	int anInt10531;
	Class163 aClass163_10532;
	Interface36 anInterface36_10533;
	int anInt10534 = 0;
	int anInt10535 = 0;
	ByteBuffer aByteBuffer10536;
	Class178_Sub2 aClass178_Sub2_10537;
	int anInt10538;
	long aLong10539;
	float aFloat10540;

	void method16116(int i) {
		anInterface36_10533 = aClass178_Sub2_10537.method15030(false);
		anInterface36_10533.method215(i * 4, 4);
		anInterface36_10533.method265(0, i * 4, aLong10539);
		aByteBuffer10536.clear();
		aByteBuffer10536 = null;
		aLong10539 = 0L;
	}

	void method16117(int[] is, int i) {
		anInt10535 = 0;
		anInt10531 = 32767;
		anInt10538 = -32768;
		ByteBuffer bytebuffer = aClass178_Sub2_10537.aByteBuffer9539;
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			int i_1_ = is[i_0_];
			short[] is_2_ = aClass142_Sub1_10529.aShortArrayArray9006[i_1_];
			int i_3_ = anIntArray10528[i_1_];
			if (i_3_ != 0 && is_2_ != null) {
				int i_4_ = 0;
				int i_5_ = 0;
				while (i_5_ < is_2_.length) {
					if ((i_3_ & 1 << i_4_++) != 0) {
						for (int i_6_ = 0; i_6_ < 3; i_6_++) {
							int i_7_ = is_2_[i_5_++] & 0xffff;
							if (i_7_ > anInt10538)
								anInt10538 = i_7_;
							if (i_7_ < anInt10531)
								anInt10531 = i_7_;
							bytebuffer.putShort((short) i_7_);
						}
						anInt10535 += 3;
					} else
						i_5_ += 3;
				}
			}
		}
	}

	void method16118(int i) {
		aClass178_Sub2_10537.anUnsafe9538.putByte(aLong10539 + (long) (i * 4) + 3L, (byte) -1);
	}

	void method16119(int i, int i_8_, int i_9_) {
		anIntArray10528[(i_8_ * (aClass142_Sub1_10529.anInt1683 * 692304099) + i)] |= 1 << i_9_;
		anInt10534++;
	}

	void method16120(int i, int i_10_, int i_11_, float f) {
		if (anInt10530 != -1) {
			Class177 class177 = aClass178_Sub2_10537.aClass172_1916.method2895(anInt10530, -1493451908);
			int i_12_ = class177.aByte1912 & 0xff;
			if (i_12_ != 0 && class177.aByte1905 != 4) {
				int i_13_;
				if (i_11_ < 0)
					i_13_ = 0;
				else if (i_11_ > 127)
					i_13_ = 16777215;
				else
					i_13_ = 131586 * i_11_;
				if (i_12_ == 256)
					i_10_ = i_13_;
				else {
					int i_14_ = i_12_;
					int i_15_ = 256 - i_12_;
					i_10_ = ((((i_13_ & 0xff00ff) * i_14_ + (i_10_ & 0xff00ff) * i_15_) & ~0xff00ff) + (((i_13_ & 0xff00) * i_14_ + (i_10_ & 0xff00) * i_15_) & 0xff0000)) >> 8;
				}
			}
			int i_16_ = class177.aByte1883 & 0xff;
			if (i_16_ != 0) {
				i_16_ += 256;
				int i_17_ = ((i_10_ & 0xff0000) >> 16) * i_16_;
				if (i_17_ > 65535)
					i_17_ = 65535;
				int i_18_ = ((i_10_ & 0xff00) >> 8) * i_16_;
				if (i_18_ > 65535)
					i_18_ = 65535;
				int i_19_ = (i_10_ & 0xff) * i_16_;
				if (i_19_ > 65535)
					i_19_ = 65535;
				i_10_ = (i_17_ << 8 & 0xff0000) + (i_18_ & 0xff00) + (i_19_ >> 8);
			}
		}
		if (f != 1.0F) {
			int i_20_ = i_10_ >> 16 & 0xff;
			int i_21_ = i_10_ >> 8 & 0xff;
			int i_22_ = i_10_ & 0xff;
			i_20_ *= f;
			if (i_20_ < 0)
				i_20_ = 0;
			else if (i_20_ > 255)
				i_20_ = 255;
			i_21_ *= f;
			if (i_21_ < 0)
				i_21_ = 0;
			else if (i_21_ > 255)
				i_21_ = 255;
			i_22_ *= f;
			if (i_22_ < 0)
				i_22_ = 0;
			else if (i_22_ > 255)
				i_22_ = 255;
			i_10_ = i_20_ << 16 | i_21_ << 8 | i_22_;
		}
		if (aClass178_Sub2_10537.anInt9670 == 0) {
			aByteBuffer10536.put(i * 4 + 0, (byte) (i_10_ >> 16));
			aByteBuffer10536.put(i * 4 + 1, (byte) (i_10_ >> 8));
			aByteBuffer10536.put(i * 4 + 2, (byte) (i_10_ >> 0));
		} else {
			aByteBuffer10536.put(i * 4 + 0, (byte) (i_10_ >> 0));
			aByteBuffer10536.put(i * 4 + 1, (byte) (i_10_ >> 8));
			aByteBuffer10536.put(i * 4 + 2, (byte) (i_10_ >> 16));
		}
	}

	void method16121(int i) {
		anInterface36_10533 = aClass178_Sub2_10537.method15030(false);
		anInterface36_10533.method215(i * 4, 4);
		anInterface36_10533.method265(0, i * 4, aLong10539);
		aByteBuffer10536.clear();
		aByteBuffer10536 = null;
		aLong10539 = 0L;
	}

	void method16122(int[] is, int i) {
		anInt10535 = 0;
		anInt10531 = 32767;
		anInt10538 = -32768;
		ByteBuffer bytebuffer = aClass178_Sub2_10537.aByteBuffer9539;
		for (int i_23_ = 0; i_23_ < i; i_23_++) {
			int i_24_ = is[i_23_];
			short[] is_25_ = aClass142_Sub1_10529.aShortArrayArray9006[i_24_];
			int i_26_ = anIntArray10528[i_24_];
			if (i_26_ != 0 && is_25_ != null) {
				int i_27_ = 0;
				int i_28_ = 0;
				while (i_28_ < is_25_.length) {
					if ((i_26_ & 1 << i_27_++) != 0) {
						for (int i_29_ = 0; i_29_ < 3; i_29_++) {
							int i_30_ = is_25_[i_28_++] & 0xffff;
							if (i_30_ > anInt10538)
								anInt10538 = i_30_;
							if (i_30_ < anInt10531)
								anInt10531 = i_30_;
							bytebuffer.putShort((short) i_30_);
						}
						anInt10535 += 3;
					} else
						i_28_ += 3;
				}
			}
		}
	}

	void method16123(int[] is, int i) {
		anInt10535 = 0;
		anInt10531 = 32767;
		anInt10538 = -32768;
		ByteBuffer bytebuffer = aClass178_Sub2_10537.aByteBuffer9539;
		for (int i_31_ = 0; i_31_ < i; i_31_++) {
			int i_32_ = is[i_31_];
			short[] is_33_ = aClass142_Sub1_10529.aShortArrayArray9006[i_32_];
			int i_34_ = anIntArray10528[i_32_];
			if (i_34_ != 0 && is_33_ != null) {
				int i_35_ = 0;
				int i_36_ = 0;
				while (i_36_ < is_33_.length) {
					if ((i_34_ & 1 << i_35_++) != 0) {
						for (int i_37_ = 0; i_37_ < 3; i_37_++) {
							int i_38_ = is_33_[i_36_++] & 0xffff;
							if (i_38_ > anInt10538)
								anInt10538 = i_38_;
							if (i_38_ < anInt10531)
								anInt10531 = i_38_;
							bytebuffer.putShort((short) i_38_);
						}
						anInt10535 += 3;
					} else
						i_36_ += 3;
				}
			}
		}
	}

	void method16124(int i) {
		aByteBuffer10536 = aClass178_Sub2_10537.method14922(i * 4);
		aLong10539 = aClass178_Sub2_10537.method15037(aByteBuffer10536);
		for (int i_39_ = 3; i_39_ < i * 4; i_39_ += 4)
			aClass178_Sub2_10537.anUnsafe9538.putByte(aLong10539 + (long) i_39_, (byte) 0);
	}

	void method16125(int i, int i_40_, int i_41_, float f) {
		if (anInt10530 != -1) {
			Class177 class177 = aClass178_Sub2_10537.aClass172_1916.method2895(anInt10530, -1823681350);
			int i_42_ = class177.aByte1912 & 0xff;
			if (i_42_ != 0 && class177.aByte1905 != 4) {
				int i_43_;
				if (i_41_ < 0)
					i_43_ = 0;
				else if (i_41_ > 127)
					i_43_ = 16777215;
				else
					i_43_ = 131586 * i_41_;
				if (i_42_ == 256)
					i_40_ = i_43_;
				else {
					int i_44_ = i_42_;
					int i_45_ = 256 - i_42_;
					i_40_ = ((((i_43_ & 0xff00ff) * i_44_ + (i_40_ & 0xff00ff) * i_45_) & ~0xff00ff) + (((i_43_ & 0xff00) * i_44_ + (i_40_ & 0xff00) * i_45_) & 0xff0000)) >> 8;
				}
			}
			int i_46_ = class177.aByte1883 & 0xff;
			if (i_46_ != 0) {
				i_46_ += 256;
				int i_47_ = ((i_40_ & 0xff0000) >> 16) * i_46_;
				if (i_47_ > 65535)
					i_47_ = 65535;
				int i_48_ = ((i_40_ & 0xff00) >> 8) * i_46_;
				if (i_48_ > 65535)
					i_48_ = 65535;
				int i_49_ = (i_40_ & 0xff) * i_46_;
				if (i_49_ > 65535)
					i_49_ = 65535;
				i_40_ = (i_47_ << 8 & 0xff0000) + (i_48_ & 0xff00) + (i_49_ >> 8);
			}
		}
		if (f != 1.0F) {
			int i_50_ = i_40_ >> 16 & 0xff;
			int i_51_ = i_40_ >> 8 & 0xff;
			int i_52_ = i_40_ & 0xff;
			i_50_ *= f;
			if (i_50_ < 0)
				i_50_ = 0;
			else if (i_50_ > 255)
				i_50_ = 255;
			i_51_ *= f;
			if (i_51_ < 0)
				i_51_ = 0;
			else if (i_51_ > 255)
				i_51_ = 255;
			i_52_ *= f;
			if (i_52_ < 0)
				i_52_ = 0;
			else if (i_52_ > 255)
				i_52_ = 255;
			i_40_ = i_50_ << 16 | i_51_ << 8 | i_52_;
		}
		if (aClass178_Sub2_10537.anInt9670 == 0) {
			aByteBuffer10536.put(i * 4 + 0, (byte) (i_40_ >> 16));
			aByteBuffer10536.put(i * 4 + 1, (byte) (i_40_ >> 8));
			aByteBuffer10536.put(i * 4 + 2, (byte) (i_40_ >> 0));
		} else {
			aByteBuffer10536.put(i * 4 + 0, (byte) (i_40_ >> 0));
			aByteBuffer10536.put(i * 4 + 1, (byte) (i_40_ >> 8));
			aByteBuffer10536.put(i * 4 + 2, (byte) (i_40_ >> 16));
		}
	}

	void method16126(int i) {
		aByteBuffer10536 = aClass178_Sub2_10537.method14922(i * 4);
		aLong10539 = aClass178_Sub2_10537.method15037(aByteBuffer10536);
		for (int i_53_ = 3; i_53_ < i * 4; i_53_ += 4)
			aClass178_Sub2_10537.anUnsafe9538.putByte(aLong10539 + (long) i_53_, (byte) 0);
	}

	void method16127(int i) {
		aClass178_Sub2_10537.anUnsafe9538.putByte(aLong10539 + (long) (i * 4) + 3L, (byte) -1);
	}

	void method16128(int i) {
		aClass178_Sub2_10537.anUnsafe9538.putByte(aLong10539 + (long) (i * 4) + 3L, (byte) -1);
	}

	void method16129(int i) {
		aClass178_Sub2_10537.anUnsafe9538.putByte(aLong10539 + (long) (i * 4) + 3L, (byte) -1);
	}

	void method16130(int i) {
		aClass178_Sub2_10537.anUnsafe9538.putByte(aLong10539 + (long) (i * 4) + 3L, (byte) -1);
	}

	Class523_Sub23(Class142_Sub1 class142_sub1, int i, int i_54_, Class163 class163) {
		anInt10531 = 0;
		anInt10538 = 0;
		aClass142_Sub1_10529 = class142_sub1;
		aClass178_Sub2_10537 = aClass142_Sub1_10529.aClass178_Sub2_8999;
		anInt10530 = i;
		aFloat10540 = (float) i_54_;
		aClass163_10532 = class163;
		anIntArray10528 = new int[(aClass142_Sub1_10529.anInt1683 * 692304099 * (aClass142_Sub1_10529.anInt1681 * 452998539))];
	}

	void method16131(int i, int i_55_, int i_56_) {
		anIntArray10528[(i_55_ * (aClass142_Sub1_10529.anInt1683 * 692304099) + i)] |= 1 << i_56_;
		anInt10534++;
	}

	void method16132(int i, int i_57_, int i_58_, float f) {
		if (anInt10530 != -1) {
			Class177 class177 = aClass178_Sub2_10537.aClass172_1916.method2895(anInt10530, 108301842);
			int i_59_ = class177.aByte1912 & 0xff;
			if (i_59_ != 0 && class177.aByte1905 != 4) {
				int i_60_;
				if (i_58_ < 0)
					i_60_ = 0;
				else if (i_58_ > 127)
					i_60_ = 16777215;
				else
					i_60_ = 131586 * i_58_;
				if (i_59_ == 256)
					i_57_ = i_60_;
				else {
					int i_61_ = i_59_;
					int i_62_ = 256 - i_59_;
					i_57_ = ((((i_60_ & 0xff00ff) * i_61_ + (i_57_ & 0xff00ff) * i_62_) & ~0xff00ff) + (((i_60_ & 0xff00) * i_61_ + (i_57_ & 0xff00) * i_62_) & 0xff0000)) >> 8;
				}
			}
			int i_63_ = class177.aByte1883 & 0xff;
			if (i_63_ != 0) {
				i_63_ += 256;
				int i_64_ = ((i_57_ & 0xff0000) >> 16) * i_63_;
				if (i_64_ > 65535)
					i_64_ = 65535;
				int i_65_ = ((i_57_ & 0xff00) >> 8) * i_63_;
				if (i_65_ > 65535)
					i_65_ = 65535;
				int i_66_ = (i_57_ & 0xff) * i_63_;
				if (i_66_ > 65535)
					i_66_ = 65535;
				i_57_ = (i_64_ << 8 & 0xff0000) + (i_65_ & 0xff00) + (i_66_ >> 8);
			}
		}
		if (f != 1.0F) {
			int i_67_ = i_57_ >> 16 & 0xff;
			int i_68_ = i_57_ >> 8 & 0xff;
			int i_69_ = i_57_ & 0xff;
			i_67_ *= f;
			if (i_67_ < 0)
				i_67_ = 0;
			else if (i_67_ > 255)
				i_67_ = 255;
			i_68_ *= f;
			if (i_68_ < 0)
				i_68_ = 0;
			else if (i_68_ > 255)
				i_68_ = 255;
			i_69_ *= f;
			if (i_69_ < 0)
				i_69_ = 0;
			else if (i_69_ > 255)
				i_69_ = 255;
			i_57_ = i_67_ << 16 | i_68_ << 8 | i_69_;
		}
		if (aClass178_Sub2_10537.anInt9670 == 0) {
			aByteBuffer10536.put(i * 4 + 0, (byte) (i_57_ >> 16));
			aByteBuffer10536.put(i * 4 + 1, (byte) (i_57_ >> 8));
			aByteBuffer10536.put(i * 4 + 2, (byte) (i_57_ >> 0));
		} else {
			aByteBuffer10536.put(i * 4 + 0, (byte) (i_57_ >> 0));
			aByteBuffer10536.put(i * 4 + 1, (byte) (i_57_ >> 8));
			aByteBuffer10536.put(i * 4 + 2, (byte) (i_57_ >> 16));
		}
	}

	void method16133(int i) {
		aByteBuffer10536 = aClass178_Sub2_10537.method14922(i * 4);
		aLong10539 = aClass178_Sub2_10537.method15037(aByteBuffer10536);
		for (int i_70_ = 3; i_70_ < i * 4; i_70_ += 4)
			aClass178_Sub2_10537.anUnsafe9538.putByte(aLong10539 + (long) i_70_, (byte) 0);
	}

	void method16134(int i) {
		anInterface36_10533 = aClass178_Sub2_10537.method15030(false);
		anInterface36_10533.method215(i * 4, 4);
		anInterface36_10533.method265(0, i * 4, aLong10539);
		aByteBuffer10536.clear();
		aByteBuffer10536 = null;
		aLong10539 = 0L;
	}

	void method16135(int i) {
		aByteBuffer10536 = aClass178_Sub2_10537.method14922(i * 4);
		aLong10539 = aClass178_Sub2_10537.method15037(aByteBuffer10536);
		for (int i_71_ = 3; i_71_ < i * 4; i_71_ += 4)
			aClass178_Sub2_10537.anUnsafe9538.putByte(aLong10539 + (long) i_71_, (byte) 0);
	}

	void method16136(int i) {
		anInterface36_10533 = aClass178_Sub2_10537.method15030(false);
		anInterface36_10533.method215(i * 4, 4);
		anInterface36_10533.method265(0, i * 4, aLong10539);
		aByteBuffer10536.clear();
		aByteBuffer10536 = null;
		aLong10539 = 0L;
	}

	void method16137(int i) {
		aByteBuffer10536 = aClass178_Sub2_10537.method14922(i * 4);
		aLong10539 = aClass178_Sub2_10537.method15037(aByteBuffer10536);
		for (int i_72_ = 3; i_72_ < i * 4; i_72_ += 4)
			aClass178_Sub2_10537.anUnsafe9538.putByte(aLong10539 + (long) i_72_, (byte) 0);
	}

	void method16138(int i) {
		anInterface36_10533 = aClass178_Sub2_10537.method15030(false);
		anInterface36_10533.method215(i * 4, 4);
		anInterface36_10533.method265(0, i * 4, aLong10539);
		aByteBuffer10536.clear();
		aByteBuffer10536 = null;
		aLong10539 = 0L;
	}

	void method16139(int i, int i_73_, int i_74_) {
		anIntArray10528[(i_73_ * (aClass142_Sub1_10529.anInt1683 * 692304099) + i)] |= 1 << i_74_;
		anInt10534++;
	}

	void method16140(int i) {
		anInterface36_10533 = aClass178_Sub2_10537.method15030(false);
		anInterface36_10533.method215(i * 4, 4);
		anInterface36_10533.method265(0, i * 4, aLong10539);
		aByteBuffer10536.clear();
		aByteBuffer10536 = null;
		aLong10539 = 0L;
	}

	void method16141(int[] is, int i) {
		anInt10535 = 0;
		anInt10531 = 32767;
		anInt10538 = -32768;
		ByteBuffer bytebuffer = aClass178_Sub2_10537.aByteBuffer9539;
		for (int i_75_ = 0; i_75_ < i; i_75_++) {
			int i_76_ = is[i_75_];
			short[] is_77_ = aClass142_Sub1_10529.aShortArrayArray9006[i_76_];
			int i_78_ = anIntArray10528[i_76_];
			if (i_78_ != 0 && is_77_ != null) {
				int i_79_ = 0;
				int i_80_ = 0;
				while (i_80_ < is_77_.length) {
					if ((i_78_ & 1 << i_79_++) != 0) {
						for (int i_81_ = 0; i_81_ < 3; i_81_++) {
							int i_82_ = is_77_[i_80_++] & 0xffff;
							if (i_82_ > anInt10538)
								anInt10538 = i_82_;
							if (i_82_ < anInt10531)
								anInt10531 = i_82_;
							bytebuffer.putShort((short) i_82_);
						}
						anInt10535 += 3;
					} else
						i_80_ += 3;
				}
			}
		}
	}
}
