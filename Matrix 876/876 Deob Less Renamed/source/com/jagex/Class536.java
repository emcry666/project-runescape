/* Class536 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Class536 {
	static final int anInt7207 = 5;
	static Class525 aClass525_7208;

	static {
		new Class518();
		aClass525_7208 = new Class525();
	}

	static byte[] method8922(InputStream inputstream, int i) throws IOException {
		byte[] is = new byte[5];
		if (inputstream.read(is, 0, 5) != 5)
			throw new IOException("2");
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(i);
		synchronized (aClass525_7208) {
			if (!aClass525_7208.method8703(is, -119240299))
				throw new IOException("3");
			aClass525_7208.method8690(inputstream, bytearrayoutputstream, (long) i);
		}
		bytearrayoutputstream.flush();
		return bytearrayoutputstream.toByteArray();
	}

	public static byte[] method8923(Class523_Sub34 class523_sub34, int i) throws IOException {
		ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(class523_sub34.aByteArray10658);
		bytearrayinputstream.skip((long) (class523_sub34.anInt10661 * 2349011));
		return Class483.method7924(bytearrayinputstream, i, 687713301);
	}

	public static byte[] method8924(Class523_Sub34 class523_sub34, int i) throws IOException {
		ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(class523_sub34.aByteArray10658);
		bytearrayinputstream.skip((long) (class523_sub34.anInt10661 * 2349011));
		return Class483.method7924(bytearrayinputstream, i, -703536240);
	}

	Class536() throws Throwable {
		throw new Error();
	}

	static byte[] method8925(InputStream inputstream, int i) throws IOException {
		byte[] is = new byte[5];
		if (inputstream.read(is, 0, 5) != 5)
			throw new IOException("2");
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(i);
		synchronized (aClass525_7208) {
			if (!aClass525_7208.method8703(is, 174071164))
				throw new IOException("3");
			aClass525_7208.method8690(inputstream, bytearrayoutputstream, (long) i);
		}
		bytearrayoutputstream.flush();
		return bytearrayoutputstream.toByteArray();
	}

	static final void method8926(Class669 class669, byte i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		boolean bool = ((class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) == 1);
		Class170.method2892(class250, class242, class669, (bool ? PacketsDecoder.aClass233_2369 : PacketsDecoder.aClass233_2371), (byte) 0);
	}

	static final void method8927(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = client.aBool10991 ? 1 : 0;
	}

	static void method8928(int i) {
		if (-2131499789 * client.anInt11070 < 0) {
			Class10 class10 = client.method17697(2002629697);
			if (!Class36.aBool326)
				Class36.aBool327 = ((-2045228509 * Class36.anInt354 != -1 && (Class36.anInt330 * 462991943 >= -2045228509 * Class36.anInt354)) || ((462991943 * Class36.anInt330 * (1648921847 * Class36.anInt323) + (Class36.aBool353 ? 26 : 22)) > -495986435 * Class254.anInt2742));
			Class36.aClass708_340.method14235((byte) 1);
			Class36.aClass708_341.method14235((byte) -32);
			for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) Class36.aClass708_342.method14240(588512532)); null != class523_sub27_sub6; class523_sub27_sub6 = ((Class523_Sub27_Sub6) Class36.aClass708_342.method14244((byte) 44))) {
				int i_0_ = -2101009827 * class523_sub27_sub6.anInt11639;
				if (i_0_ < 1000) {
					class523_sub27_sub6.method8661(607052656);
					if (59 == i_0_ || i_0_ == 2 || i_0_ == 8 || 17 == i_0_ || i_0_ == 15 || 16 == i_0_ || 58 == i_0_)
						Class36.aClass708_341.method14236(class523_sub27_sub6, 760999608);
					else
						Class36.aClass708_340.method14236(class523_sub27_sub6, 696697863);
				}
			}
			Class36.aClass708_340.method14239(Class36.aClass708_342, 1871561141);
			Class36.aClass708_341.method14239(Class36.aClass708_342, 1871561141);
			if (Class36.anInt330 * 462991943 > 1) {
				if (Class283.method5137((byte) 0) && Class36.anInt330 * 462991943 > 2)
					Class660.aClass523_Sub27_Sub6_8507 = (Class523_Sub27_Sub6) (Class36.aClass708_342.aClass523_8838.aClass523_7064.aClass523_7064);
				else
					Class660.aClass523_Sub27_Sub6_8507 = (Class523_Sub27_Sub6) (Class36.aClass708_342.aClass523_8838.aClass523_7064);
				Class36.aClass523_Sub27_Sub6_333 = ((Class523_Sub27_Sub6) Class36.aClass708_342.aClass523_8838.aClass523_7064);
				if (462991943 * Class36.anInt330 > 2)
					Class36.aClass523_Sub27_Sub6_334 = ((Class523_Sub27_Sub6) Class36.aClass523_Sub27_Sub6_333.aClass523_7064);
				else
					Class36.aClass523_Sub27_Sub6_334 = null;
			} else {
				Class660.aClass523_Sub27_Sub6_8507 = null;
				Class36.aClass523_Sub27_Sub6_333 = null;
				Class36.aClass523_Sub27_Sub6_334 = null;
			}
			Class523_Sub39 class523_sub39 = ((Class523_Sub39) client.aClass708_11027.method14240(1648660643));
			int i_1_;
			int i_2_;
			if (null != class523_sub39) {
				i_1_ = class523_sub39.method16519(-171438885);
				i_2_ = class523_sub39.method16520((byte) 127);
			} else {
				i_1_ = Class642.aClass561_8334.method9426((byte) -13);
				i_2_ = Class642.aClass561_8334.method9432(-1156695558);
			}
			if (Class36.aBool326) {
				if (Class293.method5251((Class61.aClass633_769.anInterface68_8266), class523_sub39, 942498599)) {
					if (null != Class36.aClass523_Sub27_Sub8_328 && i_1_ >= Class523_Sub7.anInt10405 * 1464782871 && i_1_ <= (Class523_Sub7.anInt10405 * 1464782871 + Class426.anInt4824 * 805194879) && i_2_ >= Class301.anInt3330 * 534142755 && i_2_ <= (534142755 * Class301.anInt3330 + Class705.anInt8818 * 1850758193)) {
						int i_3_ = -1;
						for (int i_4_ = 0; (i_4_ < (Class36.aClass523_Sub27_Sub8_328.anInt11719 * 1060081949)); i_4_++) {
							if (Class36.aBool353) {
								int i_5_ = (1648921847 * Class36.anInt323 * i_4_ + (class10.anInt76 * -1669009881 + (534142755 * Class301.anInt3330 + 20) + 1));
								if (i_2_ > (i_5_ - class10.anInt76 * -1669009881 - 1) && (i_2_ < i_5_ + class10.anInt80 * -853549931))
									i_3_ = i_4_;
							} else {
								int i_6_ = (i_4_ * (Class36.anInt323 * 1648921847) + (31 + Class301.anInt3330 * 534142755));
								if (i_2_ > i_6_ - 13 && i_2_ < 3 + i_6_)
									i_3_ = i_4_;
							}
						}
						if (-1 != i_3_) {
							int i_7_ = 0;
							Class703 class703 = new Class703(Class36.aClass523_Sub27_Sub8_328.aClass697_11718);
							for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) class703.method14129(607454132)); class523_sub27_sub6 != null; class523_sub27_sub6 = (Class523_Sub27_Sub6) class703.next()) {
								if (i_7_ == i_3_) {
									Class381.method6407(class523_sub27_sub6, i_1_, i_2_, true, (byte) 0);
									break;
								}
								i_7_++;
							}
						}
						Class524.method8685(-522212835);
					} else if (i_1_ >= -1744502791 * Class22.anInt231 && i_1_ <= (Class474.anInt5390 * -345535891 + Class22.anInt231 * -1744502791) && i_2_ >= 14756423 * Class194_Sub17.anInt9941 && (i_2_ <= (2080544711 * Class523_Sub19.anInt10492 + (Class194_Sub17.anInt9941 * 14756423)))) {
						if (!Class36.aBool327) {
							int i_8_ = -1;
							for (int i_9_ = 0; i_9_ < Class36.anInt330 * 462991943; i_9_++) {
								if (Class36.aBool353) {
									int i_10_ = (((462991943 * Class36.anInt330 - 1 - i_9_) * (Class36.anInt323 * 1648921847)) + ((Class194_Sub17.anInt9941 * 14756423) + 20 + class10.anInt76 * -1669009881 + 1));
									if (i_2_ > (i_10_ - class10.anInt76 * -1669009881 - 1) && i_2_ < (-853549931 * class10.anInt80 + i_10_))
										i_8_ = i_9_;
								} else {
									int i_11_ = (31 + (14756423 * Class194_Sub17.anInt9941) + (1648921847 * Class36.anInt323 * (Class36.anInt330 * 462991943 - 1 - i_9_)));
									if (i_2_ > i_11_ - 13 && i_2_ < i_11_ + 3)
										i_8_ = i_9_;
								}
							}
							if (-1 != i_8_) {
								int i_12_ = 0;
								Class706 class706 = new Class706(Class36.aClass708_342);
								for (Class523_Sub27_Sub6 class523_sub27_sub6 = ((Class523_Sub27_Sub6) class706.method14146(2140738063)); class523_sub27_sub6 != null; class523_sub27_sub6 = ((Class523_Sub27_Sub6) class706.next())) {
									if (i_12_ == i_8_) {
										Class381.method6407(class523_sub27_sub6, i_1_, i_2_, true, (byte) 0);
										break;
									}
									i_12_++;
								}
							}
							Class524.method8685(-522212835);
						} else {
							int i_13_ = -1;
							for (int i_14_ = 0; i_14_ < -914479837 * Class36.anInt336; i_14_++) {
								if (Class36.aBool353) {
									int i_15_ = ((Class36.anInt323 * 1648921847 * i_14_) + (class10.anInt76 * -1669009881 + (20 + (Class194_Sub17.anInt9941 * 14756423)) + 1));
									if (i_2_ > (i_15_ - -1669009881 * class10.anInt76 - 1) && i_2_ < (-853549931 * class10.anInt80 + i_15_)) {
										i_13_ = i_14_;
										break;
									}
								} else {
									int i_16_ = (31 + (Class194_Sub17.anInt9941 * 14756423) + (Class36.anInt323 * 1648921847 * i_14_));
									if (i_2_ > i_16_ - 13 && i_2_ < i_16_ + 3) {
										i_13_ = i_14_;
										break;
									}
								}
							}
							if (i_13_ != -1) {
								int i_17_ = 0;
								Class703 class703 = new Class703(Class36.aClass697_339);
								for (Class523_Sub27_Sub8 class523_sub27_sub8 = ((Class523_Sub27_Sub8) class703.method14129(-440633774)); class523_sub27_sub8 != null; class523_sub27_sub8 = ((Class523_Sub27_Sub8) class703.next())) {
									if (i_17_ == i_13_) {
										Class381.method6407(((Class523_Sub27_Sub6) (class523_sub27_sub8.aClass697_11718.aClass523_Sub27_8763.aClass523_Sub27_10551)), i_1_, i_2_, true, (byte) 0);
										Class524.method8685(-522212835);
										break;
									}
									i_17_++;
								}
							}
						}
					}
				} else {
					boolean bool = false;
					if (null != Class36.aClass523_Sub27_Sub8_328) {
						if (i_1_ < Class523_Sub7.anInt10405 * 1464782871 - 10 || i_1_ > (Class523_Sub7.anInt10405 * 1464782871 + Class426.anInt4824 * 805194879 + 10) || i_2_ < 534142755 * Class301.anInt3330 - 10 || i_2_ > 10 + (Class705.anInt8818 * 1850758193 + 534142755 * Class301.anInt3330))
							Class529.method8769(-91511498);
						else
							bool = true;
					}
					if (!bool) {
						if (i_1_ < Class22.anInt231 * -1744502791 - 10 || i_1_ > (Class474.anInt5390 * -345535891 + -1744502791 * Class22.anInt231 + 10) || i_2_ < 14756423 * Class194_Sub17.anInt9941 - 10 || i_2_ > (2080544711 * Class523_Sub19.anInt10492 + Class194_Sub17.anInt9941 * 14756423 + 10))
							Class524.method8685(-522212835);
						else if (Class36.aBool327) {
							int i_18_ = -1;
							int i_19_ = -1;
							for (int i_20_ = 0; i_20_ < -914479837 * Class36.anInt336; i_20_++) {
								if (Class36.aBool353) {
									int i_21_ = (1 + (class10.anInt76 * -1669009881 + ((14756423 * Class194_Sub17.anInt9941) + 20)) + (1648921847 * Class36.anInt323 * i_20_));
									if (i_2_ > (i_21_ - class10.anInt76 * -1669009881 - 1) && i_2_ < (class10.anInt80 * -853549931 + i_21_)) {
										i_18_ = i_20_;
										i_19_ = i_21_ - (class10.anInt76 * -1669009881) - 1;
										break;
									}
								} else {
									int i_22_ = (31 + (Class194_Sub17.anInt9941 * 14756423) + (Class36.anInt323 * 1648921847 * i_20_));
									if (i_2_ > i_22_ - 13 && i_2_ < i_22_ + 3) {
										i_18_ = i_20_;
										i_19_ = i_22_ - 13;
										break;
									}
								}
							}
							if (i_18_ != -1) {
								int i_23_ = 0;
								Class703 class703 = new Class703(Class36.aClass697_339);
								for (Class523_Sub27_Sub8 class523_sub27_sub8 = ((Class523_Sub27_Sub8) class703.method14129(1037880285)); class523_sub27_sub8 != null; class523_sub27_sub8 = ((Class523_Sub27_Sub8) class703.next())) {
									if (i_23_ == i_18_) {
										if ((1060081949 * class523_sub27_sub8.anInt11719) > 1)
											Class199.method3682(class523_sub27_sub8, i_19_, 399367680);
										break;
									}
									i_23_++;
								}
							}
						}
					}
				}
			} else {
				boolean bool = Class293.method5251((Class61.aClass633_769.anInterface68_8269), class523_sub39, 376113126);
				boolean bool_24_ = Class293.method5251((Class61.aClass633_769.anInterface68_8261), class523_sub39, 226091474);
				boolean bool_25_ = Class293.method5251((Class61.aClass633_769.anInterface68_8262), class523_sub39, 792049643);
				if ((bool || bool_24_) && ((1 == client.anInt11176 * 247606787 && Class36.anInt330 * 462991943 > 2) || Class150.method2520((byte) 78)))
					bool_25_ = true;
				if (bool_25_ && Class36.anInt330 * 462991943 > 0) {
					if (client.aClass250_11197 == null && 0 == client.anInt11211 * 569005185)
						Class436.method6874(i_1_, i_2_, -787289987);
					else
						Class36.anInt332 = -10775390;
				} else if (bool_24_) {
					if (null != Class36.aClass523_Sub27_Sub6_334)
						Class381.method6407(Class36.aClass523_Sub27_Sub6_334, i_1_, i_2_, false, (byte) 0);
				} else if (bool) {
					if (null != Class660.aClass523_Sub27_Sub6_8507) {
						boolean bool_26_ = (client.aClass250_11197 != null || client.anInt11211 * 569005185 > 0);
						if (bool_26_) {
							Class36.anInt332 = 2142095953;
							Class474.aClass523_Sub27_Sub6_5392 = Class660.aClass523_Sub27_Sub6_8507;
						} else
							Class381.method6407((Class660.aClass523_Sub27_Sub6_8507), i_1_, i_2_, false, (byte) 0);
					} else if (client.aBool11000)
						Class399.method6533(-1399356640);
				}
				if (null == client.aClass250_11197 && 569005185 * client.anInt11211 == 0) {
					Class36.anInt332 = 0;
					Class474.aClass523_Sub27_Sub6_5392 = null;
				}
			}
		}
	}

	static final void method8929(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1969304563 * class669.aClass523_Sub19_8569.anInt10486;
	}

	static final void method8930(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		if (class669.anIntArray8557[class669.anInt8558 * 1357652815] != class669.anIntArray8557[1 + 1357652815 * class669.anInt8558])
			class669.anInt8579 += (class669.anIntArray8577[1180759405 * class669.anInt8579] * -1774429083);
	}
}
