/* Class522_Sub2_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class522_Sub2_Sub1_Sub1 extends Class522_Sub2_Sub1 {
	Class629 aClass629_12040;
	short aShort12041;
	short aShort12042;
	short aShort12043;
	int anInt12044;
	int anInt12045;
	short aShort12046;
	short aShort12047;
	short aShort12048;
	short aShort12049;

	void method18475(long l, int i) {
		aShort12043 -= i;
		if (aShort12043 <= 0)
			method18487();
		else {
			int i_0_ = anInt11564 >> 12;
			int i_1_ = anInt11568 >> 12;
			int i_2_ = anInt11569 >> 12;
			Class621 class621 = aClass629_12040.aClass621_8212;
			Class400 class400 = aClass629_12040.aClass400_8215;
			if (class400.anInt4087 * -596628363 != 0) {
				if (aShort12049 - aShort12043 <= class400.anInt4133 * -360459897) {
					int i_3_ = ((anInt11570 >> 8 & 0xff00) + (anInt12044 >> 16 & 0xff) + class400.anInt4135 * -638763627 * i);
					int i_4_ = ((anInt11570 & 0xff00) + (anInt12044 >> 8 & 0xff) + class400.anInt4079 * -1873456319 * i);
					int i_5_ = ((anInt11570 << 8 & 0xff00) + (anInt12044 & 0xff) + class400.anInt4137 * -250040861 * i);
					if (i_3_ < 0)
						i_3_ = 0;
					else if (i_3_ > 65535)
						i_3_ = 65535;
					if (i_4_ < 0)
						i_4_ = 0;
					else if (i_4_ > 65535)
						i_4_ = 65535;
					if (i_5_ < 0)
						i_5_ = 0;
					else if (i_5_ > 65535)
						i_5_ = 65535;
					anInt11570 &= ~0xffffff;
					anInt11570 |= (((i_3_ & 0xff00) << 8) + (i_4_ & 0xff00) + ((i_5_ & 0xff00) >> 8));
					anInt12044 &= ~0xffffff;
					anInt12044 |= (((i_3_ & 0xff) << 16) + ((i_4_ & 0xff) << 8) + (i_5_ & 0xff));
				}
				if (aShort12049 - aShort12043 <= class400.anInt4127 * -1795095311) {
					int i_6_ = ((anInt11570 >> 16 & 0xff00) + (anInt12044 >> 24 & 0xff) + class400.anInt4118 * -839993895 * i);
					if (i_6_ < 0)
						i_6_ = 0;
					else if (i_6_ > 65535)
						i_6_ = 65535;
					anInt11570 &= 0xffffff;
					anInt11570 |= (i_6_ & 0xff00) << 16;
					anInt12044 &= 0xffffff;
					anInt12044 |= (i_6_ & 0xff) << 24;
				}
			}
			if (class400.anInt4078 * -1999803311 != -1 && (aShort12049 - aShort12043 <= class400.anInt4139 * -1019013679))
				anInt12045 += class400.anInt4140 * 543822579 * i;
			if (class400.anInt4101 * 1045162335 != -1 && (aShort12049 - aShort12043 <= class400.anInt4141 * 1618707877))
				anInt11567 += class400.anInt4096 * 920157663 * i;
			if (aShort12041 != 0)
				aShort11566 = (short) (aShort11566 + aShort12041 * i & 0x3fff);
			double d = (double) aShort12046;
			double d_7_ = (double) aShort12047;
			double d_8_ = (double) aShort12048;
			boolean bool = false;
			if (class400.anInt4076 * 470214331 == 1) {
				int i_9_ = i_0_ - (aClass629_12040.aClass615_8218.anInt8035 * -1837265295);
				int i_10_ = i_1_ - (aClass629_12040.aClass615_8218.anInt8036 * -1093322781);
				int i_11_ = i_2_ - (aClass629_12040.aClass615_8218.anInt8037 * -2092830719);
				int i_12_ = ((int) Math.sqrt((double) (i_9_ * i_9_ + i_10_ * i_10_ + i_11_ * i_11_)) >> 2);
				long l_13_ = (long) (class400.anInt4131 * 1047381923 * i_12_ * i);
				anInt12045 -= (long) anInt12045 * l_13_ >> 18;
			} else if (class400.anInt4076 * 470214331 == 2) {
				int i_14_ = i_0_ - (aClass629_12040.aClass615_8218.anInt8035 * -1837265295);
				int i_15_ = i_1_ - (aClass629_12040.aClass615_8218.anInt8036 * -1093322781);
				int i_16_ = i_2_ - (aClass629_12040.aClass615_8218.anInt8037 * -2092830719);
				int i_17_ = i_14_ * i_14_ + i_15_ * i_15_ + i_16_ * i_16_;
				long l_18_ = (long) (class400.anInt4131 * 1047381923 * i_17_ * i);
				anInt12045 -= (long) anInt12045 * l_18_ >> 28;
			}
			if (class400.anIntArray4095 != null) {
				Iterator iterator = class621.aList8081.iterator();
				while (iterator.hasNext()) {
					Class523_Sub42 class523_sub42 = (Class523_Sub42) iterator.next();
					Class385 class385 = class523_sub42.aClass385_10768;
					if (class385.anInt3997 * -129006153 != 1) {
						boolean bool_19_ = false;
						for (int i_20_ = 0; i_20_ < class400.anIntArray4095.length; i_20_++) {
							if (class400.anIntArray4095[i_20_] == class385.anInt3985 * 2122254919) {
								bool_19_ = true;
								break;
							}
						}
						if (bool_19_) {
							double d_21_ = (double) (i_0_ - (class523_sub42.anInt10765 * -118135017));
							double d_22_ = (double) (i_1_ - (class523_sub42.anInt10766 * -1895504351));
							double d_23_ = (double) (i_2_ - (class523_sub42.anInt10767 * 1369188941));
							double d_24_ = (d_21_ * d_21_ + d_22_ * d_22_ + d_23_ * d_23_);
							if (!(d_24_ > (double) (class385.aLong3990 * 3985433919679583819L))) {
								double d_25_ = Math.sqrt(d_24_);
								if (d_25_ == 0.0)
									d_25_ = 1.0;
								double d_26_ = (((d_21_ * (double) class523_sub42.aFloat10763) + d_22_ * (double) (class385.anInt3998 * 115051131) + d_23_ * (double) (class523_sub42.aFloat10769)) * 65535.0 / ((double) (class385.anInt3986 * -1388591415) * d_25_));
								if (!(d_26_ < (double) (class385.anInt3992 * 301949093))) {
									double d_27_ = 0.0;
									if (class385.anInt3991 * -1544966299 == 1)
										d_27_ = (d_25_ / 16.0 * (double) (class385.anInt3984 * -353417911));
									else if (class385.anInt3991 * -1544966299 == 2)
										d_27_ = (d_25_ / 16.0 * (d_25_ / 16.0) * (double) (class385.anInt3984 * -353417911));
									if (class385.anInt3994 * -514992433 == 0) {
										if (class385.anInt3993 * -1363218973 == 0) {
											d += ((double) (class523_sub42.aFloat10763) - d_27_) * (double) i;
											d_7_ += ((double) ((class385.anInt3998) * 115051131) - d_27_) * (double) i;
											d_8_ += ((double) (class523_sub42.aFloat10769) - d_27_) * (double) i;
											bool = true;
										} else {
											anInt11564 += ((double) (class523_sub42.aFloat10763) - d_27_) * (double) i;
											anInt11568 += ((double) ((class385.anInt3998) * 115051131) - d_27_) * (double) i;
											anInt11569 += ((double) (class523_sub42.aFloat10769) - d_27_) * (double) i;
										}
									} else {
										double d_28_ = (d_21_ / d_25_ * (double) (class385.anInt3986 * -1388591415));
										double d_29_ = (d_22_ / d_25_ * (double) (class385.anInt3986 * -1388591415));
										double d_30_ = (d_23_ / d_25_ * (double) (class385.anInt3986 * -1388591415));
										if (class385.anInt3993 * -1363218973 == 0) {
											d += d_28_ * (double) i;
											d_7_ += d_29_ * (double) i;
											d_8_ += d_30_ * (double) i;
											bool = true;
										} else {
											anInt11564 += d_28_ * (double) i;
											anInt11568 += d_29_ * (double) i;
											anInt11569 += d_30_ * (double) i;
										}
									}
								}
							}
						}
					}
				}
			}
			if (class400.anIntArray4108 != null) {
				for (int i_31_ = 0; i_31_ < class400.anIntArray4108.length; i_31_++) {
					Class523_Sub42 class523_sub42 = ((Class523_Sub42) (Class617.aClass14_8042.getFromIndex((long) class400.anIntArray4108[i_31_])));
					while (class523_sub42 != null) {
						Class385 class385 = class523_sub42.aClass385_10768;
						double d_32_ = (double) (i_0_ - (class523_sub42.anInt10765 * -118135017));
						double d_33_ = (double) (i_1_ - (class523_sub42.anInt10766 * -1895504351));
						double d_34_ = (double) (i_2_ - (class523_sub42.anInt10767 * 1369188941));
						double d_35_ = d_32_ * d_32_ + d_33_ * d_33_ + d_34_ * d_34_;
						if (d_35_ > (double) (class385.aLong3990 * 3985433919679583819L))
							class523_sub42 = (Class523_Sub42) Class617.aClass14_8042.method740(231172810);
						else {
							double d_36_ = Math.sqrt(d_35_);
							if (d_36_ == 0.0)
								d_36_ = 1.0;
							if (class385.anInt3987 * 296655169 > 0 && class385.anInt3987 * 296655169 < 2047) {
								double d_37_ = (((d_32_ * (double) class523_sub42.aFloat10763) + d_33_ * (double) (class385.anInt3998 * 115051131) + d_34_ * (double) (class523_sub42.aFloat10769)) * 16384.0 / ((double) (class385.anInt3986 * -1388591415) * d_36_));
								if (d_37_ < (double) (class385.anInt3992 * 301949093)) {
									class523_sub42 = ((Class523_Sub42) Class617.aClass14_8042.method740(231172810));
									continue;
								}
							}
							double d_38_ = 0.0;
							if (class385.anInt3991 * -1544966299 == 1)
								d_38_ = (d_36_ / 16.0 * (double) (class385.anInt3984 * -353417911));
							else if (class385.anInt3991 * -1544966299 == 2)
								d_38_ = (d_36_ / 16.0 * (d_36_ / 16.0) * (double) (class385.anInt3984 * -353417911));
							if (class385.anInt3994 * -514992433 == 0) {
								if (class385.anInt3993 * -1363218973 == 0) {
									d += ((double) class523_sub42.aFloat10763 - d_38_) * (double) i;
									d_7_ += ((double) (class385.anInt3998 * 115051131) - d_38_) * (double) i;
									d_8_ += ((double) class523_sub42.aFloat10769 - d_38_) * (double) i;
									bool = true;
								} else {
									anInt11564 += ((double) class523_sub42.aFloat10763 - d_38_) * (double) i;
									anInt11568 += ((double) (class385.anInt3998 * 115051131) - d_38_) * (double) i;
									anInt11569 += ((double) class523_sub42.aFloat10769 - d_38_) * (double) i;
								}
							} else {
								double d_39_ = (d_32_ / d_36_ * (double) (class385.anInt3986 * -1388591415));
								double d_40_ = (d_33_ / d_36_ * (double) (class385.anInt3986 * -1388591415));
								double d_41_ = (d_34_ / d_36_ * (double) (class385.anInt3986 * -1388591415));
								if (class385.anInt3993 * -1363218973 == 0) {
									d += d_39_ * (double) i;
									d_7_ += d_40_ * (double) i;
									d_8_ += d_41_ * (double) i;
									bool = true;
								} else {
									anInt11564 += d_39_ * (double) i;
									anInt11568 += d_40_ * (double) i;
									anInt11569 += d_41_ * (double) i;
								}
							}
							class523_sub42 = (Class523_Sub42) Class617.aClass14_8042.method740(231172810);
						}
					}
				}
			}
			if (class400.anIntArray4097 != null) {
				if (class400.anIntArray4098 == null) {
					class400.anIntArray4098 = new int[class400.anIntArray4097.length];
					for (int i_42_ = 0; i_42_ < class400.anIntArray4097.length; i_42_++) {
						Class425.anInterface45_4820.method343((class400.anIntArray4097[i_42_]), (byte) -24);
						class400.anIntArray4098[i_42_] = Class70.method1476((class400.anIntArray4097[i_42_]), (short) 31198);
					}
				}
				for (int i_43_ = 0; i_43_ < class400.anIntArray4098.length; i_43_++) {
					Class385 class385 = (Class617.aClass385Array8049[class400.anIntArray4098[i_43_]]);
					if (class385.anInt3993 * -1363218973 == 0) {
						d += (double) (class385.anInt3988 * 1200555199 * i);
						d_7_ += (double) (class385.anInt3998 * 115051131 * i);
						d_8_ += (double) (class385.anInt3979 * 1618918775 * i);
						bool = true;
					} else {
						anInt11564 += class385.anInt3988 * 1200555199 * i;
						anInt11568 += class385.anInt3998 * 115051131 * i;
						anInt11569 += class385.anInt3979 * 1618918775 * i;
					}
				}
			}
			if (bool) {
				while (d > 32767.0 || d_7_ > 32767.0 || d_8_ > 32767.0 || d < -32767.0 || d_7_ < -32767.0 || d_8_ < -32767.0) {
					d /= 2.0;
					d_7_ /= 2.0;
					d_8_ /= 2.0;
					anInt12045 <<= 1;
				}
				aShort12046 = (short) (int) d;
				aShort12047 = (short) (int) d_7_;
				aShort12048 = (short) (int) d_8_;
			}
			anInt11564 += ((long) aShort12046 * (long) (anInt12045 << 2) >> 23) * (long) i;
			anInt11568 += ((long) aShort12047 * (long) (anInt12045 << 2) >> 23) * (long) i;
			anInt11569 += ((long) aShort12048 * (long) (anInt12045 << 2) >> 23) * (long) i;
		}
	}

	void method18476(Class629 class629, int i, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_, boolean bool, boolean bool_56_) {
		aClass629_12040 = class629;
		anInt11564 = i << 12;
		anInt11568 = i_44_ << 12;
		anInt11569 = i_45_ << 12;
		anInt11570 = i_51_;
		aShort12049 = aShort12043 = (short) i_50_;
		anInt11567 = i_52_;
		aShort11566 = (short) i_53_;
		aShort12041 = (short) i_54_;
		anInt11571 = i_55_;
		aBool11573 = bool_56_;
		aShort12046 = (short) i_46_;
		aShort12047 = (short) i_47_;
		aShort12048 = (short) i_48_;
		anInt12045 = i_49_;
		method18477();
	}

	void method18477() {
		int i = aClass629_12040.aClass621_8212.anInt8077;
		if (aClass629_12040.aClass621_8212.aClass522_Sub2_Sub1_Sub1Array8080[i] != null)
			aClass629_12040.aClass621_8212.aClass522_Sub2_Sub1_Sub1Array8080[i].method18487();
		aClass629_12040.aClass621_8212.aClass522_Sub2_Sub1_Sub1Array8080[i] = this;
		aShort12042 = (short) aClass629_12040.aClass621_8212.anInt8077;
		aClass629_12040.aClass621_8212.anInt8077 = i + 1 & 0x1fff;
		aClass629_12040.aClass701_8211.method14084(this, -1730819217);
	}

	void method18478() {
		aClass629_12040.aClass621_8212.aClass522_Sub2_Sub1_Sub1Array8080[aShort12042] = null;
		Class617.aClass522_Sub2_Sub1_Sub1Array8050[(Class617.anInt8043 * -1872122863)] = this;
		Class617.anInt8043 = (Class617.anInt8043 * -1872122863 + 1 & 0x3ff) * -1068972815;
		method8652((byte) -17);
		method15788(-2066696757);
	}

	void method18479(long l, int i) {
		aShort12043 -= i;
		if (aShort12043 <= 0)
			method18487();
		else {
			int i_57_ = anInt11564 >> 12;
			int i_58_ = anInt11568 >> 12;
			int i_59_ = anInt11569 >> 12;
			Class621 class621 = aClass629_12040.aClass621_8212;
			Class400 class400 = aClass629_12040.aClass400_8215;
			if (class400.anInt4087 * -596628363 != 0) {
				if (aShort12049 - aShort12043 <= class400.anInt4133 * -360459897) {
					int i_60_ = ((anInt11570 >> 8 & 0xff00) + (anInt12044 >> 16 & 0xff) + class400.anInt4135 * -638763627 * i);
					int i_61_ = ((anInt11570 & 0xff00) + (anInt12044 >> 8 & 0xff) + class400.anInt4079 * -1873456319 * i);
					int i_62_ = ((anInt11570 << 8 & 0xff00) + (anInt12044 & 0xff) + class400.anInt4137 * -250040861 * i);
					if (i_60_ < 0)
						i_60_ = 0;
					else if (i_60_ > 65535)
						i_60_ = 65535;
					if (i_61_ < 0)
						i_61_ = 0;
					else if (i_61_ > 65535)
						i_61_ = 65535;
					if (i_62_ < 0)
						i_62_ = 0;
					else if (i_62_ > 65535)
						i_62_ = 65535;
					anInt11570 &= ~0xffffff;
					anInt11570 |= (((i_60_ & 0xff00) << 8) + (i_61_ & 0xff00) + ((i_62_ & 0xff00) >> 8));
					anInt12044 &= ~0xffffff;
					anInt12044 |= (((i_60_ & 0xff) << 16) + ((i_61_ & 0xff) << 8) + (i_62_ & 0xff));
				}
				if (aShort12049 - aShort12043 <= class400.anInt4127 * -1795095311) {
					int i_63_ = ((anInt11570 >> 16 & 0xff00) + (anInt12044 >> 24 & 0xff) + class400.anInt4118 * -839993895 * i);
					if (i_63_ < 0)
						i_63_ = 0;
					else if (i_63_ > 65535)
						i_63_ = 65535;
					anInt11570 &= 0xffffff;
					anInt11570 |= (i_63_ & 0xff00) << 16;
					anInt12044 &= 0xffffff;
					anInt12044 |= (i_63_ & 0xff) << 24;
				}
			}
			if (class400.anInt4078 * -1999803311 != -1 && (aShort12049 - aShort12043 <= class400.anInt4139 * -1019013679))
				anInt12045 += class400.anInt4140 * 543822579 * i;
			if (class400.anInt4101 * 1045162335 != -1 && (aShort12049 - aShort12043 <= class400.anInt4141 * 1618707877))
				anInt11567 += class400.anInt4096 * 920157663 * i;
			if (aShort12041 != 0)
				aShort11566 = (short) (aShort11566 + aShort12041 * i & 0x3fff);
			double d = (double) aShort12046;
			double d_64_ = (double) aShort12047;
			double d_65_ = (double) aShort12048;
			boolean bool = false;
			if (class400.anInt4076 * 470214331 == 1) {
				int i_66_ = i_57_ - (aClass629_12040.aClass615_8218.anInt8035 * -1837265295);
				int i_67_ = i_58_ - (aClass629_12040.aClass615_8218.anInt8036 * -1093322781);
				int i_68_ = i_59_ - (aClass629_12040.aClass615_8218.anInt8037 * -2092830719);
				int i_69_ = ((int) Math.sqrt((double) (i_66_ * i_66_ + i_67_ * i_67_ + i_68_ * i_68_)) >> 2);
				long l_70_ = (long) (class400.anInt4131 * 1047381923 * i_69_ * i);
				anInt12045 -= (long) anInt12045 * l_70_ >> 18;
			} else if (class400.anInt4076 * 470214331 == 2) {
				int i_71_ = i_57_ - (aClass629_12040.aClass615_8218.anInt8035 * -1837265295);
				int i_72_ = i_58_ - (aClass629_12040.aClass615_8218.anInt8036 * -1093322781);
				int i_73_ = i_59_ - (aClass629_12040.aClass615_8218.anInt8037 * -2092830719);
				int i_74_ = i_71_ * i_71_ + i_72_ * i_72_ + i_73_ * i_73_;
				long l_75_ = (long) (class400.anInt4131 * 1047381923 * i_74_ * i);
				anInt12045 -= (long) anInt12045 * l_75_ >> 28;
			}
			if (class400.anIntArray4095 != null) {
				Iterator iterator = class621.aList8081.iterator();
				while (iterator.hasNext()) {
					Class523_Sub42 class523_sub42 = (Class523_Sub42) iterator.next();
					Class385 class385 = class523_sub42.aClass385_10768;
					if (class385.anInt3997 * -129006153 != 1) {
						boolean bool_76_ = false;
						for (int i_77_ = 0; i_77_ < class400.anIntArray4095.length; i_77_++) {
							if (class400.anIntArray4095[i_77_] == class385.anInt3985 * 2122254919) {
								bool_76_ = true;
								break;
							}
						}
						if (bool_76_) {
							double d_78_ = (double) (i_57_ - (class523_sub42.anInt10765 * -118135017));
							double d_79_ = (double) (i_58_ - (class523_sub42.anInt10766 * -1895504351));
							double d_80_ = (double) (i_59_ - (class523_sub42.anInt10767 * 1369188941));
							double d_81_ = (d_78_ * d_78_ + d_79_ * d_79_ + d_80_ * d_80_);
							if (!(d_81_ > (double) (class385.aLong3990 * 3985433919679583819L))) {
								double d_82_ = Math.sqrt(d_81_);
								if (d_82_ == 0.0)
									d_82_ = 1.0;
								double d_83_ = (((d_78_ * (double) class523_sub42.aFloat10763) + d_79_ * (double) (class385.anInt3998 * 115051131) + d_80_ * (double) (class523_sub42.aFloat10769)) * 65535.0 / ((double) (class385.anInt3986 * -1388591415) * d_82_));
								if (!(d_83_ < (double) (class385.anInt3992 * 301949093))) {
									double d_84_ = 0.0;
									if (class385.anInt3991 * -1544966299 == 1)
										d_84_ = (d_82_ / 16.0 * (double) (class385.anInt3984 * -353417911));
									else if (class385.anInt3991 * -1544966299 == 2)
										d_84_ = (d_82_ / 16.0 * (d_82_ / 16.0) * (double) (class385.anInt3984 * -353417911));
									if (class385.anInt3994 * -514992433 == 0) {
										if (class385.anInt3993 * -1363218973 == 0) {
											d += ((double) (class523_sub42.aFloat10763) - d_84_) * (double) i;
											d_64_ += ((double) ((class385.anInt3998) * 115051131) - d_84_) * (double) i;
											d_65_ += ((double) (class523_sub42.aFloat10769) - d_84_) * (double) i;
											bool = true;
										} else {
											anInt11564 += ((double) (class523_sub42.aFloat10763) - d_84_) * (double) i;
											anInt11568 += ((double) ((class385.anInt3998) * 115051131) - d_84_) * (double) i;
											anInt11569 += ((double) (class523_sub42.aFloat10769) - d_84_) * (double) i;
										}
									} else {
										double d_85_ = (d_78_ / d_82_ * (double) (class385.anInt3986 * -1388591415));
										double d_86_ = (d_79_ / d_82_ * (double) (class385.anInt3986 * -1388591415));
										double d_87_ = (d_80_ / d_82_ * (double) (class385.anInt3986 * -1388591415));
										if (class385.anInt3993 * -1363218973 == 0) {
											d += d_85_ * (double) i;
											d_64_ += d_86_ * (double) i;
											d_65_ += d_87_ * (double) i;
											bool = true;
										} else {
											anInt11564 += d_85_ * (double) i;
											anInt11568 += d_86_ * (double) i;
											anInt11569 += d_87_ * (double) i;
										}
									}
								}
							}
						}
					}
				}
			}
			if (class400.anIntArray4108 != null) {
				for (int i_88_ = 0; i_88_ < class400.anIntArray4108.length; i_88_++) {
					Class523_Sub42 class523_sub42 = ((Class523_Sub42) (Class617.aClass14_8042.getFromIndex((long) class400.anIntArray4108[i_88_])));
					while (class523_sub42 != null) {
						Class385 class385 = class523_sub42.aClass385_10768;
						double d_89_ = (double) (i_57_ - (class523_sub42.anInt10765 * -118135017));
						double d_90_ = (double) (i_58_ - (class523_sub42.anInt10766 * -1895504351));
						double d_91_ = (double) (i_59_ - (class523_sub42.anInt10767 * 1369188941));
						double d_92_ = d_89_ * d_89_ + d_90_ * d_90_ + d_91_ * d_91_;
						if (d_92_ > (double) (class385.aLong3990 * 3985433919679583819L))
							class523_sub42 = (Class523_Sub42) Class617.aClass14_8042.method740(231172810);
						else {
							double d_93_ = Math.sqrt(d_92_);
							if (d_93_ == 0.0)
								d_93_ = 1.0;
							if (class385.anInt3987 * 296655169 > 0 && class385.anInt3987 * 296655169 < 2047) {
								double d_94_ = (((d_89_ * (double) class523_sub42.aFloat10763) + d_90_ * (double) (class385.anInt3998 * 115051131) + d_91_ * (double) (class523_sub42.aFloat10769)) * 16384.0 / ((double) (class385.anInt3986 * -1388591415) * d_93_));
								if (d_94_ < (double) (class385.anInt3992 * 301949093)) {
									class523_sub42 = ((Class523_Sub42) Class617.aClass14_8042.method740(231172810));
									continue;
								}
							}
							double d_95_ = 0.0;
							if (class385.anInt3991 * -1544966299 == 1)
								d_95_ = (d_93_ / 16.0 * (double) (class385.anInt3984 * -353417911));
							else if (class385.anInt3991 * -1544966299 == 2)
								d_95_ = (d_93_ / 16.0 * (d_93_ / 16.0) * (double) (class385.anInt3984 * -353417911));
							if (class385.anInt3994 * -514992433 == 0) {
								if (class385.anInt3993 * -1363218973 == 0) {
									d += ((double) class523_sub42.aFloat10763 - d_95_) * (double) i;
									d_64_ += ((double) (class385.anInt3998 * 115051131) - d_95_) * (double) i;
									d_65_ += ((double) class523_sub42.aFloat10769 - d_95_) * (double) i;
									bool = true;
								} else {
									anInt11564 += ((double) class523_sub42.aFloat10763 - d_95_) * (double) i;
									anInt11568 += ((double) (class385.anInt3998 * 115051131) - d_95_) * (double) i;
									anInt11569 += ((double) class523_sub42.aFloat10769 - d_95_) * (double) i;
								}
							} else {
								double d_96_ = (d_89_ / d_93_ * (double) (class385.anInt3986 * -1388591415));
								double d_97_ = (d_90_ / d_93_ * (double) (class385.anInt3986 * -1388591415));
								double d_98_ = (d_91_ / d_93_ * (double) (class385.anInt3986 * -1388591415));
								if (class385.anInt3993 * -1363218973 == 0) {
									d += d_96_ * (double) i;
									d_64_ += d_97_ * (double) i;
									d_65_ += d_98_ * (double) i;
									bool = true;
								} else {
									anInt11564 += d_96_ * (double) i;
									anInt11568 += d_97_ * (double) i;
									anInt11569 += d_98_ * (double) i;
								}
							}
							class523_sub42 = (Class523_Sub42) Class617.aClass14_8042.method740(231172810);
						}
					}
				}
			}
			if (class400.anIntArray4097 != null) {
				if (class400.anIntArray4098 == null) {
					class400.anIntArray4098 = new int[class400.anIntArray4097.length];
					for (int i_99_ = 0; i_99_ < class400.anIntArray4097.length; i_99_++) {
						Class425.anInterface45_4820.method343((class400.anIntArray4097[i_99_]), (byte) 1);
						class400.anIntArray4098[i_99_] = Class70.method1476((class400.anIntArray4097[i_99_]), (short) 17750);
					}
				}
				for (int i_100_ = 0; i_100_ < class400.anIntArray4098.length; i_100_++) {
					Class385 class385 = (Class617.aClass385Array8049[class400.anIntArray4098[i_100_]]);
					if (class385.anInt3993 * -1363218973 == 0) {
						d += (double) (class385.anInt3988 * 1200555199 * i);
						d_64_ += (double) (class385.anInt3998 * 115051131 * i);
						d_65_ += (double) (class385.anInt3979 * 1618918775 * i);
						bool = true;
					} else {
						anInt11564 += class385.anInt3988 * 1200555199 * i;
						anInt11568 += class385.anInt3998 * 115051131 * i;
						anInt11569 += class385.anInt3979 * 1618918775 * i;
					}
				}
			}
			if (bool) {
				while (d > 32767.0 || d_64_ > 32767.0 || d_65_ > 32767.0 || d < -32767.0 || d_64_ < -32767.0 || d_65_ < -32767.0) {
					d /= 2.0;
					d_64_ /= 2.0;
					d_65_ /= 2.0;
					anInt12045 <<= 1;
				}
				aShort12046 = (short) (int) d;
				aShort12047 = (short) (int) d_64_;
				aShort12048 = (short) (int) d_65_;
			}
			anInt11564 += ((long) aShort12046 * (long) (anInt12045 << 2) >> 23) * (long) i;
			anInt11568 += ((long) aShort12047 * (long) (anInt12045 << 2) >> 23) * (long) i;
			anInt11569 += ((long) aShort12048 * (long) (anInt12045 << 2) >> 23) * (long) i;
		}
	}

	void method18480(Class560 class560, Class178 class178, long l) {
		int i = anInt11564 >> 12 + class560.anInt7496 * -906898059;
		int i_101_ = anInt11569 >> 12 + class560.anInt7496 * -906898059;
		int i_102_ = anInt11568 >> 12;
		if (i_102_ > 262144 || i_102_ < -262144 || i < 0 || i >= class560.anInt7546 * -957102653 || i_101_ < 0 || i_101_ >= class560.anInt7507 * -34274863)
			method18487();
		else {
			Class621 class621 = aClass629_12040.aClass621_8212;
			Class400 class400 = aClass629_12040.aClass400_8215;
			Class142[] class142s = class560.aClass142Array7509;
			int i_103_ = class621.anInt8079;
			Class565 class565 = (class560.aClass565ArrayArrayArray7508[class621.anInt8079][i][i_101_]);
			if (class565 != null)
				i_103_ = class565.aByte7595;
			int i_104_ = class142s[i_103_].method2321(i, i_101_, 2030350022);
			int i_105_;
			if (i_103_ < class560.anInt7505 * -1277045625 - 1)
				i_105_ = class142s[i_103_ + 1].method2321(i, i_101_, 1704920259);
			else
				i_105_ = i_104_ - (8 << class560.anInt7496 * -906898059);
			if (class400.aBool4120) {
				if (class400.anInt4144 * -1185178175 == -1 && i_102_ > i_104_) {
					method18487();
					return;
				}
				if (class400.anInt4144 * -1185178175 >= 0 && i_102_ > class142s[class400.anInt4144 * -1185178175].method2321(i, i_101_, 2014898157)) {
					method18487();
					return;
				}
				if (class400.anInt4122 * -1472726047 == -1 && i_102_ < i_105_) {
					method18487();
					return;
				}
				if (class400.anInt4122 * -1472726047 >= 0 && i_102_ < class142s[class400.anInt4122 * -1472726047 + 1].method2321(i, i_101_, 1775829911)) {
					method18487();
					return;
				}
			}
			int i_106_;
			for (i_106_ = class560.anInt7505 * -1277045625 - 1; (i_106_ > 0 && i_102_ > class142s[i_106_].method2321(i, i_101_, 1921564628)); i_106_--) {
				/* empty */
			}
			if (class400.aBool4134 && i_106_ == 0 && i_102_ > class142s[0].method2321(i, i_101_, 1735017791))
				method18487();
			else if (i_106_ == class560.anInt7505 * -1277045625 - 1 && (class142s[i_106_].method2321(i, i_101_, 2016695049) - i_102_) > 8 << class560.anInt7496 * -906898059)
				method18487();
			else {
				class565 = class560.aClass565ArrayArrayArray7508[i_106_][i][i_101_];
				if (class565 == null) {
					if (i_106_ == 0 || (class560.aClass565ArrayArrayArray7508[0][i][i_101_] == null))
						class565 = class560.aClass565ArrayArrayArray7508[0][i][i_101_] = new Class565(0);
					boolean bool = ((class560.aClass565ArrayArrayArray7508[0][i][i_101_].aClass565_7586) != null);
					if (i_106_ == 3 && bool)
						i_106_--;
					for (int i_107_ = 1; i_107_ <= i_106_; i_107_++) {
						if ((class560.aClass565ArrayArrayArray7508[i_107_][i][i_101_]) == null) {
							class565 = class560.aClass565ArrayArrayArray7508[i_107_][i][i_101_] = new Class565(i_107_);
							if (bool)
								class565.aByte7595++;
						}
					}
					if (class565 == null)
						class565 = (class560.aClass565ArrayArrayArray7508[i_106_][i][i_101_]);
				}
				if (class400.aBool4117) {
					int i_108_ = anInt11564 >> 12;
					int i_109_ = anInt11569 >> 12;
					if (class565.aClass647_Sub1_Sub4_7587 != null) {
						Class564 class564 = class565.aClass647_Sub1_Sub4_7587.method16707(class178, (byte) 10);
						if (class564 != null && class564.method9477(i_108_, i_102_, i_109_)) {
							method18487();
							return;
						}
					}
					if (class565.aClass647_Sub1_Sub4_7596 != null) {
						Class564 class564 = class565.aClass647_Sub1_Sub4_7596.method16707(class178, (byte) 10);
						if (class564 != null && class564.method9477(i_108_, i_102_, i_109_)) {
							method18487();
							return;
						}
					}
					if (class565.aClass647_Sub1_Sub2_7591 != null) {
						Class564 class564 = class565.aClass647_Sub1_Sub2_7591.method16707(class178, (byte) 10);
						if (class564 != null && class564.method9477(i_108_, i_102_, i_109_)) {
							method18487();
							return;
						}
					}
					for (Class548 class548 = class565.aClass548_7593; class548 != null; class548 = class548.aClass548_7319) {
						Class564 class564 = class548.aClass647_Sub1_Sub3_7318.method16707(class178, (byte) 10);
						if (class564 != null && class564.method9477(i_108_, i_102_, i_109_)) {
							method18487();
							return;
						}
					}
				}
				class621.aClass171_8087.aClass686_1836.method13877(this, (byte) 38);
			}
		}
	}

	void method18481(Class560 class560, Class178 class178, long l) {
		int i = anInt11564 >> 12 + class560.anInt7496 * -906898059;
		int i_110_ = anInt11569 >> 12 + class560.anInt7496 * -906898059;
		int i_111_ = anInt11568 >> 12;
		if (i_111_ > 262144 || i_111_ < -262144 || i < 0 || i >= class560.anInt7546 * -957102653 || i_110_ < 0 || i_110_ >= class560.anInt7507 * -34274863)
			method18487();
		else {
			Class621 class621 = aClass629_12040.aClass621_8212;
			Class400 class400 = aClass629_12040.aClass400_8215;
			Class142[] class142s = class560.aClass142Array7509;
			int i_112_ = class621.anInt8079;
			Class565 class565 = (class560.aClass565ArrayArrayArray7508[class621.anInt8079][i][i_110_]);
			if (class565 != null)
				i_112_ = class565.aByte7595;
			int i_113_ = class142s[i_112_].method2321(i, i_110_, 1600686971);
			int i_114_;
			if (i_112_ < class560.anInt7505 * -1277045625 - 1)
				i_114_ = class142s[i_112_ + 1].method2321(i, i_110_, 1963445558);
			else
				i_114_ = i_113_ - (8 << class560.anInt7496 * -906898059);
			if (class400.aBool4120) {
				if (class400.anInt4144 * -1185178175 == -1 && i_111_ > i_113_) {
					method18487();
					return;
				}
				if (class400.anInt4144 * -1185178175 >= 0 && i_111_ > class142s[class400.anInt4144 * -1185178175].method2321(i, i_110_, 2133721762)) {
					method18487();
					return;
				}
				if (class400.anInt4122 * -1472726047 == -1 && i_111_ < i_114_) {
					method18487();
					return;
				}
				if (class400.anInt4122 * -1472726047 >= 0 && i_111_ < class142s[class400.anInt4122 * -1472726047 + 1].method2321(i, i_110_, 2085931253)) {
					method18487();
					return;
				}
			}
			int i_115_;
			for (i_115_ = class560.anInt7505 * -1277045625 - 1; (i_115_ > 0 && i_111_ > class142s[i_115_].method2321(i, i_110_, 2097168372)); i_115_--) {
				/* empty */
			}
			if (class400.aBool4134 && i_115_ == 0 && i_111_ > class142s[0].method2321(i, i_110_, 1941809460))
				method18487();
			else if (i_115_ == class560.anInt7505 * -1277045625 - 1 && (class142s[i_115_].method2321(i, i_110_, 1721795519) - i_111_) > 8 << class560.anInt7496 * -906898059)
				method18487();
			else {
				class565 = class560.aClass565ArrayArrayArray7508[i_115_][i][i_110_];
				if (class565 == null) {
					if (i_115_ == 0 || (class560.aClass565ArrayArrayArray7508[0][i][i_110_] == null))
						class565 = class560.aClass565ArrayArrayArray7508[0][i][i_110_] = new Class565(0);
					boolean bool = ((class560.aClass565ArrayArrayArray7508[0][i][i_110_].aClass565_7586) != null);
					if (i_115_ == 3 && bool)
						i_115_--;
					for (int i_116_ = 1; i_116_ <= i_115_; i_116_++) {
						if ((class560.aClass565ArrayArrayArray7508[i_116_][i][i_110_]) == null) {
							class565 = class560.aClass565ArrayArrayArray7508[i_116_][i][i_110_] = new Class565(i_116_);
							if (bool)
								class565.aByte7595++;
						}
					}
					if (class565 == null)
						class565 = (class560.aClass565ArrayArrayArray7508[i_115_][i][i_110_]);
				}
				if (class400.aBool4117) {
					int i_117_ = anInt11564 >> 12;
					int i_118_ = anInt11569 >> 12;
					if (class565.aClass647_Sub1_Sub4_7587 != null) {
						Class564 class564 = class565.aClass647_Sub1_Sub4_7587.method16707(class178, (byte) 10);
						if (class564 != null && class564.method9477(i_117_, i_111_, i_118_)) {
							method18487();
							return;
						}
					}
					if (class565.aClass647_Sub1_Sub4_7596 != null) {
						Class564 class564 = class565.aClass647_Sub1_Sub4_7596.method16707(class178, (byte) 10);
						if (class564 != null && class564.method9477(i_117_, i_111_, i_118_)) {
							method18487();
							return;
						}
					}
					if (class565.aClass647_Sub1_Sub2_7591 != null) {
						Class564 class564 = class565.aClass647_Sub1_Sub2_7591.method16707(class178, (byte) 10);
						if (class564 != null && class564.method9477(i_117_, i_111_, i_118_)) {
							method18487();
							return;
						}
					}
					for (Class548 class548 = class565.aClass548_7593; class548 != null; class548 = class548.aClass548_7319) {
						Class564 class564 = class548.aClass647_Sub1_Sub3_7318.method16707(class178, (byte) 10);
						if (class564 != null && class564.method9477(i_117_, i_111_, i_118_)) {
							method18487();
							return;
						}
					}
				}
				class621.aClass171_8087.aClass686_1836.method13877(this, (byte) 34);
			}
		}
	}

	void method18482(Class629 class629, int i, int i_119_, int i_120_, int i_121_, int i_122_, int i_123_, int i_124_, int i_125_, int i_126_, int i_127_, int i_128_, int i_129_, int i_130_, boolean bool, boolean bool_131_) {
		aClass629_12040 = class629;
		anInt11564 = i << 12;
		anInt11568 = i_119_ << 12;
		anInt11569 = i_120_ << 12;
		anInt11570 = i_126_;
		aShort12049 = aShort12043 = (short) i_125_;
		anInt11567 = i_127_;
		aShort11566 = (short) i_128_;
		aShort12041 = (short) i_129_;
		anInt11571 = i_130_;
		aBool11573 = bool_131_;
		aShort12046 = (short) i_121_;
		aShort12047 = (short) i_122_;
		aShort12048 = (short) i_123_;
		anInt12045 = i_124_;
		method18477();
	}

	void method18483() {
		int i = aClass629_12040.aClass621_8212.anInt8077;
		if (aClass629_12040.aClass621_8212.aClass522_Sub2_Sub1_Sub1Array8080[i] != null)
			aClass629_12040.aClass621_8212.aClass522_Sub2_Sub1_Sub1Array8080[i].method18487();
		aClass629_12040.aClass621_8212.aClass522_Sub2_Sub1_Sub1Array8080[i] = this;
		aShort12042 = (short) aClass629_12040.aClass621_8212.anInt8077;
		aClass629_12040.aClass621_8212.anInt8077 = i + 1 & 0x1fff;
		aClass629_12040.aClass701_8211.method14084(this, -1762888402);
	}

	void method18484() {
		int i = aClass629_12040.aClass621_8212.anInt8077;
		if (aClass629_12040.aClass621_8212.aClass522_Sub2_Sub1_Sub1Array8080[i] != null)
			aClass629_12040.aClass621_8212.aClass522_Sub2_Sub1_Sub1Array8080[i].method18487();
		aClass629_12040.aClass621_8212.aClass522_Sub2_Sub1_Sub1Array8080[i] = this;
		aShort12042 = (short) aClass629_12040.aClass621_8212.anInt8077;
		aClass629_12040.aClass621_8212.anInt8077 = i + 1 & 0x1fff;
		aClass629_12040.aClass701_8211.method14084(this, -1341798003);
	}

	void method18485() {
		int i = aClass629_12040.aClass621_8212.anInt8077;
		if (aClass629_12040.aClass621_8212.aClass522_Sub2_Sub1_Sub1Array8080[i] != null)
			aClass629_12040.aClass621_8212.aClass522_Sub2_Sub1_Sub1Array8080[i].method18487();
		aClass629_12040.aClass621_8212.aClass522_Sub2_Sub1_Sub1Array8080[i] = this;
		aShort12042 = (short) aClass629_12040.aClass621_8212.anInt8077;
		aClass629_12040.aClass621_8212.anInt8077 = i + 1 & 0x1fff;
		aClass629_12040.aClass701_8211.method14084(this, -1392369745);
	}

	void method18486() {
		int i = aClass629_12040.aClass621_8212.anInt8077;
		if (aClass629_12040.aClass621_8212.aClass522_Sub2_Sub1_Sub1Array8080[i] != null)
			aClass629_12040.aClass621_8212.aClass522_Sub2_Sub1_Sub1Array8080[i].method18487();
		aClass629_12040.aClass621_8212.aClass522_Sub2_Sub1_Sub1Array8080[i] = this;
		aShort12042 = (short) aClass629_12040.aClass621_8212.anInt8077;
		aClass629_12040.aClass621_8212.anInt8077 = i + 1 & 0x1fff;
		aClass629_12040.aClass701_8211.method14084(this, -2100259197);
	}

	void method18487() {
		aClass629_12040.aClass621_8212.aClass522_Sub2_Sub1_Sub1Array8080[aShort12042] = null;
		Class617.aClass522_Sub2_Sub1_Sub1Array8050[(Class617.anInt8043 * -1872122863)] = this;
		Class617.anInt8043 = (Class617.anInt8043 * -1872122863 + 1 & 0x3ff) * -1068972815;
		method8652((byte) -127);
		method15788(-1555261881);
	}

	void method18488(long l, int i) {
		aShort12043 -= i;
		if (aShort12043 <= 0)
			method18487();
		else {
			int i_132_ = anInt11564 >> 12;
			int i_133_ = anInt11568 >> 12;
			int i_134_ = anInt11569 >> 12;
			Class621 class621 = aClass629_12040.aClass621_8212;
			Class400 class400 = aClass629_12040.aClass400_8215;
			if (class400.anInt4087 * -596628363 != 0) {
				if (aShort12049 - aShort12043 <= class400.anInt4133 * -360459897) {
					int i_135_ = ((anInt11570 >> 8 & 0xff00) + (anInt12044 >> 16 & 0xff) + class400.anInt4135 * -638763627 * i);
					int i_136_ = ((anInt11570 & 0xff00) + (anInt12044 >> 8 & 0xff) + class400.anInt4079 * -1873456319 * i);
					int i_137_ = ((anInt11570 << 8 & 0xff00) + (anInt12044 & 0xff) + class400.anInt4137 * -250040861 * i);
					if (i_135_ < 0)
						i_135_ = 0;
					else if (i_135_ > 65535)
						i_135_ = 65535;
					if (i_136_ < 0)
						i_136_ = 0;
					else if (i_136_ > 65535)
						i_136_ = 65535;
					if (i_137_ < 0)
						i_137_ = 0;
					else if (i_137_ > 65535)
						i_137_ = 65535;
					anInt11570 &= ~0xffffff;
					anInt11570 |= (((i_135_ & 0xff00) << 8) + (i_136_ & 0xff00) + ((i_137_ & 0xff00) >> 8));
					anInt12044 &= ~0xffffff;
					anInt12044 |= (((i_135_ & 0xff) << 16) + ((i_136_ & 0xff) << 8) + (i_137_ & 0xff));
				}
				if (aShort12049 - aShort12043 <= class400.anInt4127 * -1795095311) {
					int i_138_ = ((anInt11570 >> 16 & 0xff00) + (anInt12044 >> 24 & 0xff) + class400.anInt4118 * -839993895 * i);
					if (i_138_ < 0)
						i_138_ = 0;
					else if (i_138_ > 65535)
						i_138_ = 65535;
					anInt11570 &= 0xffffff;
					anInt11570 |= (i_138_ & 0xff00) << 16;
					anInt12044 &= 0xffffff;
					anInt12044 |= (i_138_ & 0xff) << 24;
				}
			}
			if (class400.anInt4078 * -1999803311 != -1 && (aShort12049 - aShort12043 <= class400.anInt4139 * -1019013679))
				anInt12045 += class400.anInt4140 * 543822579 * i;
			if (class400.anInt4101 * 1045162335 != -1 && (aShort12049 - aShort12043 <= class400.anInt4141 * 1618707877))
				anInt11567 += class400.anInt4096 * 920157663 * i;
			if (aShort12041 != 0)
				aShort11566 = (short) (aShort11566 + aShort12041 * i & 0x3fff);
			double d = (double) aShort12046;
			double d_139_ = (double) aShort12047;
			double d_140_ = (double) aShort12048;
			boolean bool = false;
			if (class400.anInt4076 * 470214331 == 1) {
				int i_141_ = i_132_ - (aClass629_12040.aClass615_8218.anInt8035 * -1837265295);
				int i_142_ = i_133_ - (aClass629_12040.aClass615_8218.anInt8036 * -1093322781);
				int i_143_ = i_134_ - (aClass629_12040.aClass615_8218.anInt8037 * -2092830719);
				int i_144_ = ((int) Math.sqrt((double) (i_141_ * i_141_ + i_142_ * i_142_ + i_143_ * i_143_)) >> 2);
				long l_145_ = (long) (class400.anInt4131 * 1047381923 * i_144_ * i);
				anInt12045 -= (long) anInt12045 * l_145_ >> 18;
			} else if (class400.anInt4076 * 470214331 == 2) {
				int i_146_ = i_132_ - (aClass629_12040.aClass615_8218.anInt8035 * -1837265295);
				int i_147_ = i_133_ - (aClass629_12040.aClass615_8218.anInt8036 * -1093322781);
				int i_148_ = i_134_ - (aClass629_12040.aClass615_8218.anInt8037 * -2092830719);
				int i_149_ = i_146_ * i_146_ + i_147_ * i_147_ + i_148_ * i_148_;
				long l_150_ = (long) (class400.anInt4131 * 1047381923 * i_149_ * i);
				anInt12045 -= (long) anInt12045 * l_150_ >> 28;
			}
			if (class400.anIntArray4095 != null) {
				Iterator iterator = class621.aList8081.iterator();
				while (iterator.hasNext()) {
					Class523_Sub42 class523_sub42 = (Class523_Sub42) iterator.next();
					Class385 class385 = class523_sub42.aClass385_10768;
					if (class385.anInt3997 * -129006153 != 1) {
						boolean bool_151_ = false;
						for (int i_152_ = 0; i_152_ < class400.anIntArray4095.length; i_152_++) {
							if (class400.anIntArray4095[i_152_] == class385.anInt3985 * 2122254919) {
								bool_151_ = true;
								break;
							}
						}
						if (bool_151_) {
							double d_153_ = (double) (i_132_ - (class523_sub42.anInt10765 * -118135017));
							double d_154_ = (double) (i_133_ - (class523_sub42.anInt10766 * -1895504351));
							double d_155_ = (double) (i_134_ - (class523_sub42.anInt10767 * 1369188941));
							double d_156_ = (d_153_ * d_153_ + d_154_ * d_154_ + d_155_ * d_155_);
							if (!(d_156_ > (double) (class385.aLong3990 * 3985433919679583819L))) {
								double d_157_ = Math.sqrt(d_156_);
								if (d_157_ == 0.0)
									d_157_ = 1.0;
								double d_158_ = (((d_153_ * (double) class523_sub42.aFloat10763) + d_154_ * (double) (class385.anInt3998 * 115051131) + d_155_ * (double) (class523_sub42.aFloat10769)) * 65535.0 / ((double) (class385.anInt3986 * -1388591415) * d_157_));
								if (!(d_158_ < (double) (class385.anInt3992 * 301949093))) {
									double d_159_ = 0.0;
									if (class385.anInt3991 * -1544966299 == 1)
										d_159_ = (d_157_ / 16.0 * (double) (class385.anInt3984 * -353417911));
									else if (class385.anInt3991 * -1544966299 == 2)
										d_159_ = (d_157_ / 16.0 * (d_157_ / 16.0) * (double) (class385.anInt3984 * -353417911));
									if (class385.anInt3994 * -514992433 == 0) {
										if (class385.anInt3993 * -1363218973 == 0) {
											d += ((double) (class523_sub42.aFloat10763) - d_159_) * (double) i;
											d_139_ += ((double) ((class385.anInt3998) * 115051131) - d_159_) * (double) i;
											d_140_ += ((double) (class523_sub42.aFloat10769) - d_159_) * (double) i;
											bool = true;
										} else {
											anInt11564 += ((double) (class523_sub42.aFloat10763) - d_159_) * (double) i;
											anInt11568 += ((double) ((class385.anInt3998) * 115051131) - d_159_) * (double) i;
											anInt11569 += ((double) (class523_sub42.aFloat10769) - d_159_) * (double) i;
										}
									} else {
										double d_160_ = (d_153_ / d_157_ * (double) (class385.anInt3986 * -1388591415));
										double d_161_ = (d_154_ / d_157_ * (double) (class385.anInt3986 * -1388591415));
										double d_162_ = (d_155_ / d_157_ * (double) (class385.anInt3986 * -1388591415));
										if (class385.anInt3993 * -1363218973 == 0) {
											d += d_160_ * (double) i;
											d_139_ += d_161_ * (double) i;
											d_140_ += d_162_ * (double) i;
											bool = true;
										} else {
											anInt11564 += d_160_ * (double) i;
											anInt11568 += d_161_ * (double) i;
											anInt11569 += d_162_ * (double) i;
										}
									}
								}
							}
						}
					}
				}
			}
			if (class400.anIntArray4108 != null) {
				for (int i_163_ = 0; i_163_ < class400.anIntArray4108.length; i_163_++) {
					Class523_Sub42 class523_sub42 = ((Class523_Sub42) (Class617.aClass14_8042.getFromIndex((long) class400.anIntArray4108[i_163_])));
					while (class523_sub42 != null) {
						Class385 class385 = class523_sub42.aClass385_10768;
						double d_164_ = (double) (i_132_ - (class523_sub42.anInt10765 * -118135017));
						double d_165_ = (double) (i_133_ - (class523_sub42.anInt10766 * -1895504351));
						double d_166_ = (double) (i_134_ - (class523_sub42.anInt10767 * 1369188941));
						double d_167_ = (d_164_ * d_164_ + d_165_ * d_165_ + d_166_ * d_166_);
						if (d_167_ > (double) (class385.aLong3990 * 3985433919679583819L))
							class523_sub42 = (Class523_Sub42) Class617.aClass14_8042.method740(231172810);
						else {
							double d_168_ = Math.sqrt(d_167_);
							if (d_168_ == 0.0)
								d_168_ = 1.0;
							if (class385.anInt3987 * 296655169 > 0 && class385.anInt3987 * 296655169 < 2047) {
								double d_169_ = (((d_164_ * (double) class523_sub42.aFloat10763) + d_165_ * (double) (class385.anInt3998 * 115051131) + d_166_ * (double) (class523_sub42.aFloat10769)) * 16384.0 / ((double) (class385.anInt3986 * -1388591415) * d_168_));
								if (d_169_ < (double) (class385.anInt3992 * 301949093)) {
									class523_sub42 = ((Class523_Sub42) Class617.aClass14_8042.method740(231172810));
									continue;
								}
							}
							double d_170_ = 0.0;
							if (class385.anInt3991 * -1544966299 == 1)
								d_170_ = (d_168_ / 16.0 * (double) (class385.anInt3984 * -353417911));
							else if (class385.anInt3991 * -1544966299 == 2)
								d_170_ = (d_168_ / 16.0 * (d_168_ / 16.0) * (double) (class385.anInt3984 * -353417911));
							if (class385.anInt3994 * -514992433 == 0) {
								if (class385.anInt3993 * -1363218973 == 0) {
									d += ((double) class523_sub42.aFloat10763 - d_170_) * (double) i;
									d_139_ += ((double) (class385.anInt3998 * 115051131) - d_170_) * (double) i;
									d_140_ += ((double) class523_sub42.aFloat10769 - d_170_) * (double) i;
									bool = true;
								} else {
									anInt11564 += ((double) class523_sub42.aFloat10763 - d_170_) * (double) i;
									anInt11568 += ((double) (class385.anInt3998 * 115051131) - d_170_) * (double) i;
									anInt11569 += ((double) class523_sub42.aFloat10769 - d_170_) * (double) i;
								}
							} else {
								double d_171_ = (d_164_ / d_168_ * (double) (class385.anInt3986 * -1388591415));
								double d_172_ = (d_165_ / d_168_ * (double) (class385.anInt3986 * -1388591415));
								double d_173_ = (d_166_ / d_168_ * (double) (class385.anInt3986 * -1388591415));
								if (class385.anInt3993 * -1363218973 == 0) {
									d += d_171_ * (double) i;
									d_139_ += d_172_ * (double) i;
									d_140_ += d_173_ * (double) i;
									bool = true;
								} else {
									anInt11564 += d_171_ * (double) i;
									anInt11568 += d_172_ * (double) i;
									anInt11569 += d_173_ * (double) i;
								}
							}
							class523_sub42 = (Class523_Sub42) Class617.aClass14_8042.method740(231172810);
						}
					}
				}
			}
			if (class400.anIntArray4097 != null) {
				if (class400.anIntArray4098 == null) {
					class400.anIntArray4098 = new int[class400.anIntArray4097.length];
					for (int i_174_ = 0; i_174_ < class400.anIntArray4097.length; i_174_++) {
						Class425.anInterface45_4820.method343((class400.anIntArray4097[i_174_]), (byte) -73);
						class400.anIntArray4098[i_174_] = Class70.method1476((class400.anIntArray4097[i_174_]), (short) 25669);
					}
				}
				for (int i_175_ = 0; i_175_ < class400.anIntArray4098.length; i_175_++) {
					Class385 class385 = (Class617.aClass385Array8049[class400.anIntArray4098[i_175_]]);
					if (class385.anInt3993 * -1363218973 == 0) {
						d += (double) (class385.anInt3988 * 1200555199 * i);
						d_139_ += (double) (class385.anInt3998 * 115051131 * i);
						d_140_ += (double) (class385.anInt3979 * 1618918775 * i);
						bool = true;
					} else {
						anInt11564 += class385.anInt3988 * 1200555199 * i;
						anInt11568 += class385.anInt3998 * 115051131 * i;
						anInt11569 += class385.anInt3979 * 1618918775 * i;
					}
				}
			}
			if (bool) {
				while (d > 32767.0 || d_139_ > 32767.0 || d_140_ > 32767.0 || d < -32767.0 || d_139_ < -32767.0 || d_140_ < -32767.0) {
					d /= 2.0;
					d_139_ /= 2.0;
					d_140_ /= 2.0;
					anInt12045 <<= 1;
				}
				aShort12046 = (short) (int) d;
				aShort12047 = (short) (int) d_139_;
				aShort12048 = (short) (int) d_140_;
			}
			anInt11564 += ((long) aShort12046 * (long) (anInt12045 << 2) >> 23) * (long) i;
			anInt11568 += ((long) aShort12047 * (long) (anInt12045 << 2) >> 23) * (long) i;
			anInt11569 += ((long) aShort12048 * (long) (anInt12045 << 2) >> 23) * (long) i;
		}
	}

	Class522_Sub2_Sub1_Sub1(Class629 class629, int i, int i_176_, int i_177_, int i_178_, int i_179_, int i_180_, int i_181_, int i_182_, int i_183_, int i_184_, int i_185_, int i_186_, int i_187_, boolean bool, boolean bool_188_) {
		aClass629_12040 = class629;
		anInt11564 = i << 12;
		anInt11568 = i_176_ << 12;
		anInt11569 = i_177_ << 12;
		anInt11570 = i_183_;
		aShort12049 = aShort12043 = (short) i_182_;
		anInt11567 = i_184_;
		aShort11566 = (short) i_185_;
		aShort12041 = (short) i_186_;
		anInt11571 = i_187_;
		aBool11573 = bool_188_;
		aShort12046 = (short) i_178_;
		aShort12047 = (short) i_179_;
		aShort12048 = (short) i_180_;
		anInt12045 = i_181_;
		method18477();
	}

	void method18489() {
		int i = aClass629_12040.aClass621_8212.anInt8077;
		if (aClass629_12040.aClass621_8212.aClass522_Sub2_Sub1_Sub1Array8080[i] != null)
			aClass629_12040.aClass621_8212.aClass522_Sub2_Sub1_Sub1Array8080[i].method18487();
		aClass629_12040.aClass621_8212.aClass522_Sub2_Sub1_Sub1Array8080[i] = this;
		aShort12042 = (short) aClass629_12040.aClass621_8212.anInt8077;
		aClass629_12040.aClass621_8212.anInt8077 = i + 1 & 0x1fff;
		aClass629_12040.aClass701_8211.method14084(this, -2092386090);
	}

	void method18490(Class560 class560, Class178 class178, long l) {
		int i = anInt11564 >> 12 + class560.anInt7496 * -906898059;
		int i_189_ = anInt11569 >> 12 + class560.anInt7496 * -906898059;
		int i_190_ = anInt11568 >> 12;
		if (i_190_ > 262144 || i_190_ < -262144 || i < 0 || i >= class560.anInt7546 * -957102653 || i_189_ < 0 || i_189_ >= class560.anInt7507 * -34274863)
			method18487();
		else {
			Class621 class621 = aClass629_12040.aClass621_8212;
			Class400 class400 = aClass629_12040.aClass400_8215;
			Class142[] class142s = class560.aClass142Array7509;
			int i_191_ = class621.anInt8079;
			Class565 class565 = (class560.aClass565ArrayArrayArray7508[class621.anInt8079][i][i_189_]);
			if (class565 != null)
				i_191_ = class565.aByte7595;
			int i_192_ = class142s[i_191_].method2321(i, i_189_, 1731962747);
			int i_193_;
			if (i_191_ < class560.anInt7505 * -1277045625 - 1)
				i_193_ = class142s[i_191_ + 1].method2321(i, i_189_, 1862037209);
			else
				i_193_ = i_192_ - (8 << class560.anInt7496 * -906898059);
			if (class400.aBool4120) {
				if (class400.anInt4144 * -1185178175 == -1 && i_190_ > i_192_) {
					method18487();
					return;
				}
				if (class400.anInt4144 * -1185178175 >= 0 && i_190_ > class142s[class400.anInt4144 * -1185178175].method2321(i, i_189_, 1845212170)) {
					method18487();
					return;
				}
				if (class400.anInt4122 * -1472726047 == -1 && i_190_ < i_193_) {
					method18487();
					return;
				}
				if (class400.anInt4122 * -1472726047 >= 0 && i_190_ < class142s[class400.anInt4122 * -1472726047 + 1].method2321(i, i_189_, 2082761334)) {
					method18487();
					return;
				}
			}
			int i_194_;
			for (i_194_ = class560.anInt7505 * -1277045625 - 1; (i_194_ > 0 && i_190_ > class142s[i_194_].method2321(i, i_189_, 2107759662)); i_194_--) {
				/* empty */
			}
			if (class400.aBool4134 && i_194_ == 0 && i_190_ > class142s[0].method2321(i, i_189_, 1899349584))
				method18487();
			else if (i_194_ == class560.anInt7505 * -1277045625 - 1 && (class142s[i_194_].method2321(i, i_189_, 1901859333) - i_190_) > 8 << class560.anInt7496 * -906898059)
				method18487();
			else {
				class565 = class560.aClass565ArrayArrayArray7508[i_194_][i][i_189_];
				if (class565 == null) {
					if (i_194_ == 0 || (class560.aClass565ArrayArrayArray7508[0][i][i_189_] == null))
						class565 = class560.aClass565ArrayArrayArray7508[0][i][i_189_] = new Class565(0);
					boolean bool = ((class560.aClass565ArrayArrayArray7508[0][i][i_189_].aClass565_7586) != null);
					if (i_194_ == 3 && bool)
						i_194_--;
					for (int i_195_ = 1; i_195_ <= i_194_; i_195_++) {
						if ((class560.aClass565ArrayArrayArray7508[i_195_][i][i_189_]) == null) {
							class565 = class560.aClass565ArrayArrayArray7508[i_195_][i][i_189_] = new Class565(i_195_);
							if (bool)
								class565.aByte7595++;
						}
					}
					if (class565 == null)
						class565 = (class560.aClass565ArrayArrayArray7508[i_194_][i][i_189_]);
				}
				if (class400.aBool4117) {
					int i_196_ = anInt11564 >> 12;
					int i_197_ = anInt11569 >> 12;
					if (class565.aClass647_Sub1_Sub4_7587 != null) {
						Class564 class564 = class565.aClass647_Sub1_Sub4_7587.method16707(class178, (byte) 10);
						if (class564 != null && class564.method9477(i_196_, i_190_, i_197_)) {
							method18487();
							return;
						}
					}
					if (class565.aClass647_Sub1_Sub4_7596 != null) {
						Class564 class564 = class565.aClass647_Sub1_Sub4_7596.method16707(class178, (byte) 10);
						if (class564 != null && class564.method9477(i_196_, i_190_, i_197_)) {
							method18487();
							return;
						}
					}
					if (class565.aClass647_Sub1_Sub2_7591 != null) {
						Class564 class564 = class565.aClass647_Sub1_Sub2_7591.method16707(class178, (byte) 10);
						if (class564 != null && class564.method9477(i_196_, i_190_, i_197_)) {
							method18487();
							return;
						}
					}
					for (Class548 class548 = class565.aClass548_7593; class548 != null; class548 = class548.aClass548_7319) {
						Class564 class564 = class548.aClass647_Sub1_Sub3_7318.method16707(class178, (byte) 10);
						if (class564 != null && class564.method9477(i_196_, i_190_, i_197_)) {
							method18487();
							return;
						}
					}
				}
				class621.aClass171_8087.aClass686_1836.method13877(this, (byte) 12);
			}
		}
	}

	void method18491() {
		aClass629_12040.aClass621_8212.aClass522_Sub2_Sub1_Sub1Array8080[aShort12042] = null;
		Class617.aClass522_Sub2_Sub1_Sub1Array8050[(Class617.anInt8043 * -1872122863)] = this;
		Class617.anInt8043 = (Class617.anInt8043 * -1872122863 + 1 & 0x3ff) * -1068972815;
		method8652((byte) -92);
		method15788(-910548712);
	}

	void method18492() {
		aClass629_12040.aClass621_8212.aClass522_Sub2_Sub1_Sub1Array8080[aShort12042] = null;
		Class617.aClass522_Sub2_Sub1_Sub1Array8050[(Class617.anInt8043 * -1872122863)] = this;
		Class617.anInt8043 = (Class617.anInt8043 * -1872122863 + 1 & 0x3ff) * -1068972815;
		method8652((byte) -36);
		method15788(-1033872414);
	}

	void method18493(Class629 class629, int i, int i_198_, int i_199_, int i_200_, int i_201_, int i_202_, int i_203_, int i_204_, int i_205_, int i_206_, int i_207_, int i_208_, int i_209_, boolean bool, boolean bool_210_) {
		aClass629_12040 = class629;
		anInt11564 = i << 12;
		anInt11568 = i_198_ << 12;
		anInt11569 = i_199_ << 12;
		anInt11570 = i_205_;
		aShort12049 = aShort12043 = (short) i_204_;
		anInt11567 = i_206_;
		aShort11566 = (short) i_207_;
		aShort12041 = (short) i_208_;
		anInt11571 = i_209_;
		aBool11573 = bool_210_;
		aShort12046 = (short) i_200_;
		aShort12047 = (short) i_201_;
		aShort12048 = (short) i_202_;
		anInt12045 = i_203_;
		method18477();
	}
}
