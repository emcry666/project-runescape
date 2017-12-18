/* Class525 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Class525 {
	short[] aShortArray7071;
	short[] aShortArray7072;
	int anInt7073;
	short[] aShortArray7074;
	short[] aShortArray7075;
	short[] aShortArray7076;
	short[] aShortArray7077;
	short[] aShortArray7078;
	Class524 aClass524_7079;
	int anInt7080;
	Class332[] aClass332Array7081;
	Class524 aClass524_7082;
	Class516 aClass516_7083 = new Class516();
	Class537 aClass537_7084;
	Class332 aClass332_7085;
	Class315 aClass315_7086 = new Class315();
	int anInt7087;
	static File aFile7088;
	static int anInt7089;

	boolean method8686(InputStream inputstream, OutputStream outputstream, long l) throws IOException {
		aClass315_7086.method5665(inputstream, -357812157);
		aClass516_7083.method8610(outputstream, -199853381);
		method8687(1316383522);
		int i = Class478.method7894((byte) 16);
		int i_0_ = 0;
		int i_1_ = 0;
		int i_2_ = 0;
		int i_3_ = 0;
		long l_4_ = 0L;
		byte i_5_ = 0;
		while (l < 0L || l_4_ < l) {
			int i_6_ = (int) l_4_ & anInt7087 * -972598369;
			if (aClass315_7086.method5669(aShortArray7072, i_6_ + (i << 4), (byte) -46) == 0) {
				Class526 class526 = aClass537_7084.method8934((int) l_4_, i_5_, (byte) 96);
				if (!Class447.method7246(i, -1723223003))
					i_5_ = class526.method8716(aClass315_7086, aClass516_7083.method8603(i_0_, (byte) 34), -1638619856);
				else
					i_5_ = class526.method8713(aClass315_7086, 1443387952);
				aClass516_7083.method8602(i_5_, 348589501);
				i = Class6.method554(i, 2138772399);
				l_4_++;
			} else {
				int i_7_;
				if (aClass315_7086.method5669(aShortArray7074, i, (byte) 7) == 1) {
					i_7_ = 0;
					if (aClass315_7086.method5669(aShortArray7075, i, (byte) -111) == 0) {
						if (aClass315_7086.method5669(aShortArray7078, i_6_ + (i << 4), (byte) -23) == 0) {
							i = RSA.method912(i, (byte) 2);
							i_7_ = 1;
						}
					} else {
						int i_8_;
						if (aClass315_7086.method5669(aShortArray7076, i, (byte) 24) == 0)
							i_8_ = i_1_;
						else {
							if (aClass315_7086.method5669(aShortArray7077, i, (byte) 32) == 0)
								i_8_ = i_2_;
							else {
								i_8_ = i_3_;
								i_3_ = i_2_;
							}
							i_2_ = i_1_;
						}
						i_1_ = i_0_;
						i_0_ = i_8_;
					}
					if (i_7_ == 0) {
						i_7_ = aClass524_7079.method8675(aClass315_7086, i_6_, -1831888702) + 2;
						i = Class203.method3701(i, 818005841);
					}
				} else {
					i_3_ = i_2_;
					i_2_ = i_1_;
					i_1_ = i_0_;
					i_7_ = 2 + aClass524_7082.method8675(aClass315_7086, i_6_, -1739577188);
					i = Class214.method3843(i, (byte) -70);
					int i_9_ = aClass332Array7081[Class168_Sub2_Sub2.method17785(i_7_, (short) 5282)].method5827(aClass315_7086, 2078737529);
					if (i_9_ >= 4) {
						int i_10_ = (i_9_ >> 1) - 1;
						i_0_ = (0x2 | i_9_ & 0x1) << i_10_;
						if (i_9_ < 14)
							i_0_ += Class605.method9961(aShortArray7071, i_0_ - i_9_ - 1, aClass315_7086, i_10_, (byte) 7);
						else {
							i_0_ += aClass315_7086.method5668(i_10_ - 4, 573830552) << 4;
							i_0_ += aClass332_7085.method5828(aClass315_7086, 316282362);
							if (i_0_ < 0) {
								if (-1 != i_0_)
									return false;
								break;
							}
						}
					} else
						i_0_ = i_9_;
				}
				if ((long) i_0_ >= l_4_ || i_0_ >= -908783735 * anInt7080)
					return false;
				aClass516_7083.method8601(i_0_, i_7_, (byte) 68);
				l_4_ += (long) i_7_;
				i_5_ = aClass516_7083.method8603(0, (byte) 33);
			}
		}
		aClass516_7083.method8600(-960343801);
		aClass516_7083.method8615(2126806010);
		aClass315_7086.method5672(507560820);
		return true;
	}

	void method8687(int i) throws IOException {
		aClass516_7083.method8599(false, -777286863);
		Class304.method5544(aShortArray7072, (byte) -32);
		Class304.method5544(aShortArray7078, (byte) -63);
		Class304.method5544(aShortArray7074, (byte) -22);
		Class304.method5544(aShortArray7075, (byte) -33);
		Class304.method5544(aShortArray7076, (byte) 3);
		Class304.method5544(aShortArray7077, (byte) 31);
		Class304.method5544(aShortArray7071, (byte) -72);
		aClass537_7084.method8933((byte) 14);
		for (int i_11_ = 0; i_11_ < 4; i_11_++)
			aClass332Array7081[i_11_].method5829(-1681927203);
		aClass524_7082.method8670(1235387772);
		aClass524_7079.method8670(-114404547);
		aClass332_7085.method5829(-81677204);
		aClass315_7086.method5666(1305569615);
	}

	boolean method8688(int i, int i_12_, int i_13_, int i_14_) {
		if (i > 8 || i_12_ > 4 || i_13_ > 4)
			return false;
		aClass537_7084.method8932(i_12_, i, 1533933225);
		int i_15_ = 1 << i_13_;
		aClass524_7082.method8669(i_15_, (short) 2863);
		aClass524_7079.method8669(i_15_, (short) 21892);
		anInt7087 = (i_15_ - 1) * 1333069919;
		return true;
	}

	boolean method8689(byte[] is) {
		if (is.length < 5)
			return false;
		int i = is[0] & 0xff;
		int i_16_ = i % 9;
		int i_17_ = i / 9;
		int i_18_ = i_17_ % 5;
		int i_19_ = i_17_ / 5;
		int i_20_ = 0;
		for (int i_21_ = 0; i_21_ < 4; i_21_++)
			i_20_ += (is[1 + i_21_] & 0xff) << 8 * i_21_;
		if (!method8688(i_16_, i_18_, i_19_, 99875681))
			return false;
		return method8706(i_20_, -504122611);
	}

	boolean codeLZMA(InputStream inputstream, OutputStream outputstream, long l) throws IOException {
		aClass315_7086.method5665(inputstream, 721770444);
		aClass516_7083.method8610(outputstream, -199853381);
		method8687(1316383522);
		int i = Class478.method7894((byte) 16);
		int i_22_ = 0;
		int i_23_ = 0;
		int i_24_ = 0;
		int i_25_ = 0;
		long l_26_ = 0L;
		byte i_27_ = 0;
		while (l < 0L || l_26_ < l) {
			int i_28_ = (int) l_26_ & anInt7087 * -972598369;
			if (aClass315_7086.method5669(aShortArray7072, i_28_ + (i << 4), (byte) -16) == 0) {
				Class526 class526 = aClass537_7084.method8934((int) l_26_, i_27_, (byte) 20);
				if (!Class447.method7246(i, -1955938720))
					i_27_ = (class526.method8716(aClass315_7086, aClass516_7083.method8603(i_22_, (byte) 79), -1245930207));
				else
					i_27_ = class526.method8713(aClass315_7086, 1358250037);
				aClass516_7083.method8602(i_27_, 2034370251);
				i = Class6.method554(i, 2138772399);
				l_26_++;
			} else {
				int i_29_;
				if (aClass315_7086.method5669(aShortArray7074, i, (byte) -2) == 1) {
					i_29_ = 0;
					if (aClass315_7086.method5669(aShortArray7075, i, (byte) -27) == 0) {
						if (aClass315_7086.method5669(aShortArray7078, i_28_ + (i << 4), (byte) 11) == 0) {
							i = RSA.method912(i, (byte) 2);
							i_29_ = 1;
						}
					} else {
						int i_30_;
						if (aClass315_7086.method5669(aShortArray7076, i, (byte) -43) == 0)
							i_30_ = i_23_;
						else {
							if (aClass315_7086.method5669(aShortArray7077, i, (byte) -15) == 0)
								i_30_ = i_24_;
							else {
								i_30_ = i_25_;
								i_25_ = i_24_;
							}
							i_24_ = i_23_;
						}
						i_23_ = i_22_;
						i_22_ = i_30_;
					}
					if (i_29_ == 0) {
						i_29_ = aClass524_7079.method8675(aClass315_7086, i_28_, -1919267533) + 2;
						i = Class203.method3701(i, 661555620);
					}
				} else {
					i_25_ = i_24_;
					i_24_ = i_23_;
					i_23_ = i_22_;
					i_29_ = 2 + aClass524_7082.method8675(aClass315_7086, i_28_, -1545741194);
					i = Class214.method3843(i, (byte) -8);
					int i_31_ = aClass332Array7081[Class168_Sub2_Sub2.method17785(i_29_, (short) -25145)].method5827(aClass315_7086, 1625275805);
					if (i_31_ >= 4) {
						int i_32_ = (i_31_ >> 1) - 1;
						i_22_ = (0x2 | i_31_ & 0x1) << i_32_;
						if (i_31_ < 14)
							i_22_ += Class605.method9961(aShortArray7071, i_22_ - i_31_ - 1, aClass315_7086, i_32_, (byte) 7);
						else {
							i_22_ += aClass315_7086.method5668(i_32_ - 4, 573830552) << 4;
							i_22_ += aClass332_7085.method5828(aClass315_7086, -1974551189);
							if (i_22_ < 0) {
								if (-1 != i_22_)
									return false;
								break;
							}
						}
					} else
						i_22_ = i_31_;
				}
				if ((long) i_22_ >= l_26_ || i_22_ >= -908783735 * anInt7080)
					return false;
				aClass516_7083.method8601(i_22_, i_29_, (byte) 72);
				l_26_ += (long) i_29_;
				i_27_ = aClass516_7083.method8603(0, (byte) 75);
			}
		}
		aClass516_7083.method8600(-179379778);
		aClass516_7083.method8615(2143068443);
		aClass315_7086.method5672(1863153722);
		return true;
	}

	boolean method8691(InputStream inputstream, OutputStream outputstream, long l) throws IOException {
		aClass315_7086.method5665(inputstream, 24598203);
		aClass516_7083.method8610(outputstream, -199853381);
		method8687(1316383522);
		int i = Class478.method7894((byte) 16);
		int i_33_ = 0;
		int i_34_ = 0;
		int i_35_ = 0;
		int i_36_ = 0;
		long l_37_ = 0L;
		byte i_38_ = 0;
		while (l < 0L || l_37_ < l) {
			int i_39_ = (int) l_37_ & anInt7087 * -972598369;
			if (aClass315_7086.method5669(aShortArray7072, i_39_ + (i << 4), (byte) -65) == 0) {
				Class526 class526 = aClass537_7084.method8934((int) l_37_, i_38_, (byte) 44);
				if (!Class447.method7246(i, -1726230411))
					i_38_ = (class526.method8716(aClass315_7086, aClass516_7083.method8603(i_33_, (byte) 108), -1741683790));
				else
					i_38_ = class526.method8713(aClass315_7086, 1699414925);
				aClass516_7083.method8602(i_38_, 2134198013);
				i = Class6.method554(i, 2138772399);
				l_37_++;
			} else {
				int i_40_;
				if (aClass315_7086.method5669(aShortArray7074, i, (byte) 25) == 1) {
					i_40_ = 0;
					if (aClass315_7086.method5669(aShortArray7075, i, (byte) 63) == 0) {
						if (aClass315_7086.method5669(aShortArray7078, i_39_ + (i << 4), (byte) 38) == 0) {
							i = RSA.method912(i, (byte) 2);
							i_40_ = 1;
						}
					} else {
						int i_41_;
						if (aClass315_7086.method5669(aShortArray7076, i, (byte) -4) == 0)
							i_41_ = i_34_;
						else {
							if (aClass315_7086.method5669(aShortArray7077, i, (byte) -6) == 0)
								i_41_ = i_35_;
							else {
								i_41_ = i_36_;
								i_36_ = i_35_;
							}
							i_35_ = i_34_;
						}
						i_34_ = i_33_;
						i_33_ = i_41_;
					}
					if (i_40_ == 0) {
						i_40_ = aClass524_7079.method8675(aClass315_7086, i_39_, -1700873912) + 2;
						i = Class203.method3701(i, 44894107);
					}
				} else {
					i_36_ = i_35_;
					i_35_ = i_34_;
					i_34_ = i_33_;
					i_40_ = 2 + aClass524_7082.method8675(aClass315_7086, i_39_, -1642985764);
					i = Class214.method3843(i, (byte) -2);
					int i_42_ = aClass332Array7081[Class168_Sub2_Sub2.method17785(i_40_, (short) 7644)].method5827(aClass315_7086, 1565529370);
					if (i_42_ >= 4) {
						int i_43_ = (i_42_ >> 1) - 1;
						i_33_ = (0x2 | i_42_ & 0x1) << i_43_;
						if (i_42_ < 14)
							i_33_ += Class605.method9961(aShortArray7071, i_33_ - i_42_ - 1, aClass315_7086, i_43_, (byte) 7);
						else {
							i_33_ += aClass315_7086.method5668(i_43_ - 4, 573830552) << 4;
							i_33_ += aClass332_7085.method5828(aClass315_7086, 672175773);
							if (i_33_ < 0) {
								if (-1 != i_33_)
									return false;
								break;
							}
						}
					} else
						i_33_ = i_42_;
				}
				if ((long) i_33_ >= l_37_ || i_33_ >= -908783735 * anInt7080)
					return false;
				aClass516_7083.method8601(i_33_, i_40_, (byte) 28);
				l_37_ += (long) i_40_;
				i_38_ = aClass516_7083.method8603(0, (byte) 71);
			}
		}
		aClass516_7083.method8600(-802727457);
		aClass516_7083.method8615(2131426154);
		aClass315_7086.method5672(1044015779);
		return true;
	}

	boolean method8692(int i, int i_44_, int i_45_) {
		if (i > 8 || i_44_ > 4 || i_45_ > 4)
			return false;
		aClass537_7084.method8932(i_44_, i, 1533933225);
		int i_46_ = 1 << i_45_;
		aClass524_7082.method8669(i_46_, (short) 19325);
		aClass524_7079.method8669(i_46_, (short) 954);
		anInt7087 = (i_46_ - 1) * 1333069919;
		return true;
	}

	boolean method8693(int i) {
		if (i < 0)
			return false;
		if (1652953257 * anInt7073 != i) {
			anInt7073 = -566783079 * i;
			anInt7080 = Math.max(anInt7073 * 1652953257, 1) * -1180559687;
			aClass516_7083.method8618(Math.max(anInt7080 * -908783735, 4096), (byte) -82);
		}
		return true;
	}

	boolean method8694(int i) {
		if (i < 0)
			return false;
		if (1652953257 * anInt7073 != i) {
			anInt7073 = -566783079 * i;
			anInt7080 = Math.max(anInt7073 * 1652953257, 1) * -1180559687;
			aClass516_7083.method8618(Math.max(anInt7080 * -908783735, 4096), (byte) -17);
		}
		return true;
	}

	boolean method8695(int i) {
		if (i < 0)
			return false;
		if (1652953257 * anInt7073 != i) {
			anInt7073 = -566783079 * i;
			anInt7080 = Math.max(anInt7073 * 1652953257, 1) * -1180559687;
			aClass516_7083.method8618(Math.max(anInt7080 * -908783735, 4096), (byte) -23);
		}
		return true;
	}

	Class525() {
		aShortArray7072 = new short[192];
		aShortArray7074 = new short[12];
		aShortArray7075 = new short[12];
		aShortArray7076 = new short[12];
		aShortArray7077 = new short[12];
		aShortArray7078 = new short[192];
		aClass332Array7081 = new Class332[4];
		aShortArray7071 = new short[114];
		aClass332_7085 = new Class332(4);
		aClass524_7082 = new Class524(this);
		aClass524_7079 = new Class524(this);
		aClass537_7084 = new Class537(this);
		anInt7073 = 566783079;
		anInt7080 = 1180559687;
		for (int i = 0; i < 4; i++)
			aClass332Array7081[i] = new Class332(6);
	}

	boolean method8696(int i, int i_47_, int i_48_) {
		if (i > 8 || i_47_ > 4 || i_48_ > 4)
			return false;
		aClass537_7084.method8932(i_47_, i, 1533933225);
		int i_49_ = 1 << i_48_;
		aClass524_7082.method8669(i_49_, (short) 19811);
		aClass524_7079.method8669(i_49_, (short) 12240);
		anInt7087 = (i_49_ - 1) * 1333069919;
		return true;
	}

	boolean method8697(int i, int i_50_, int i_51_) {
		if (i > 8 || i_50_ > 4 || i_51_ > 4)
			return false;
		aClass537_7084.method8932(i_50_, i, 1533933225);
		int i_52_ = 1 << i_51_;
		aClass524_7082.method8669(i_52_, (short) 11504);
		aClass524_7079.method8669(i_52_, (short) 15249);
		anInt7087 = (i_52_ - 1) * 1333069919;
		return true;
	}

	boolean method8698(InputStream inputstream, OutputStream outputstream, long l) throws IOException {
		aClass315_7086.method5665(inputstream, 899042233);
		aClass516_7083.method8610(outputstream, -199853381);
		method8687(1316383522);
		int i = Class478.method7894((byte) 16);
		int i_53_ = 0;
		int i_54_ = 0;
		int i_55_ = 0;
		int i_56_ = 0;
		long l_57_ = 0L;
		byte i_58_ = 0;
		while (l < 0L || l_57_ < l) {
			int i_59_ = (int) l_57_ & anInt7087 * -972598369;
			if (aClass315_7086.method5669(aShortArray7072, i_59_ + (i << 4), (byte) -56) == 0) {
				Class526 class526 = aClass537_7084.method8934((int) l_57_, i_58_, (byte) 18);
				if (!Class447.method7246(i, -1082705345))
					i_58_ = (class526.method8716(aClass315_7086, aClass516_7083.method8603(i_53_, (byte) 56), -1673821306));
				else
					i_58_ = class526.method8713(aClass315_7086, 1096704159);
				aClass516_7083.method8602(i_58_, -892005346);
				i = Class6.method554(i, 2138772399);
				l_57_++;
			} else {
				int i_60_;
				if (aClass315_7086.method5669(aShortArray7074, i, (byte) -62) == 1) {
					i_60_ = 0;
					if (aClass315_7086.method5669(aShortArray7075, i, (byte) 38) == 0) {
						if (aClass315_7086.method5669(aShortArray7078, i_59_ + (i << 4), (byte) -30) == 0) {
							i = RSA.method912(i, (byte) 2);
							i_60_ = 1;
						}
					} else {
						int i_61_;
						if (aClass315_7086.method5669(aShortArray7076, i, (byte) 68) == 0)
							i_61_ = i_54_;
						else {
							if (aClass315_7086.method5669(aShortArray7077, i, (byte) 7) == 0)
								i_61_ = i_55_;
							else {
								i_61_ = i_56_;
								i_56_ = i_55_;
							}
							i_55_ = i_54_;
						}
						i_54_ = i_53_;
						i_53_ = i_61_;
					}
					if (i_60_ == 0) {
						i_60_ = aClass524_7079.method8675(aClass315_7086, i_59_, -1725493174) + 2;
						i = Class203.method3701(i, 298910214);
					}
				} else {
					i_56_ = i_55_;
					i_55_ = i_54_;
					i_54_ = i_53_;
					i_60_ = 2 + aClass524_7082.method8675(aClass315_7086, i_59_, -1872008752);
					i = Class214.method3843(i, (byte) -23);
					int i_62_ = aClass332Array7081[Class168_Sub2_Sub2.method17785(i_60_, (short) 4216)].method5827(aClass315_7086, 1669449572);
					if (i_62_ >= 4) {
						int i_63_ = (i_62_ >> 1) - 1;
						i_53_ = (0x2 | i_62_ & 0x1) << i_63_;
						if (i_62_ < 14)
							i_53_ += Class605.method9961(aShortArray7071, i_53_ - i_62_ - 1, aClass315_7086, i_63_, (byte) 7);
						else {
							i_53_ += aClass315_7086.method5668(i_63_ - 4, 573830552) << 4;
							i_53_ += aClass332_7085.method5828(aClass315_7086, 1134480420);
							if (i_53_ < 0) {
								if (-1 != i_53_)
									return false;
								break;
							}
						}
					} else
						i_53_ = i_62_;
				}
				if ((long) i_53_ >= l_57_ || i_53_ >= -908783735 * anInt7080)
					return false;
				aClass516_7083.method8601(i_53_, i_60_, (byte) 50);
				l_57_ += (long) i_60_;
				i_58_ = aClass516_7083.method8603(0, (byte) 42);
			}
		}
		aClass516_7083.method8600(-491643955);
		aClass516_7083.method8615(2120524391);
		aClass315_7086.method5672(-1187702312);
		return true;
	}

	boolean method8699(int i, int i_64_, int i_65_) {
		if (i > 8 || i_64_ > 4 || i_65_ > 4)
			return false;
		aClass537_7084.method8932(i_64_, i, 1533933225);
		int i_66_ = 1 << i_65_;
		aClass524_7082.method8669(i_66_, (short) 9075);
		aClass524_7079.method8669(i_66_, (short) 28584);
		anInt7087 = (i_66_ - 1) * 1333069919;
		return true;
	}

	void method8700() throws IOException {
		aClass516_7083.method8599(false, -777286863);
		Class304.method5544(aShortArray7072, (byte) 82);
		Class304.method5544(aShortArray7078, (byte) 24);
		Class304.method5544(aShortArray7074, (byte) 25);
		Class304.method5544(aShortArray7075, (byte) 5);
		Class304.method5544(aShortArray7076, (byte) -82);
		Class304.method5544(aShortArray7077, (byte) 52);
		Class304.method5544(aShortArray7071, (byte) 32);
		aClass537_7084.method8933((byte) 14);
		for (int i = 0; i < 4; i++)
			aClass332Array7081[i].method5829(-1895971437);
		aClass524_7082.method8670(644522087);
		aClass524_7079.method8670(1093479959);
		aClass332_7085.method5829(-965170513);
		aClass315_7086.method5666(-766223464);
	}

	void method8701() throws IOException {
		aClass516_7083.method8599(false, -777286863);
		Class304.method5544(aShortArray7072, (byte) 23);
		Class304.method5544(aShortArray7078, (byte) 25);
		Class304.method5544(aShortArray7074, (byte) -24);
		Class304.method5544(aShortArray7075, (byte) 69);
		Class304.method5544(aShortArray7076, (byte) -9);
		Class304.method5544(aShortArray7077, (byte) 61);
		Class304.method5544(aShortArray7071, (byte) -67);
		aClass537_7084.method8933((byte) 14);
		for (int i = 0; i < 4; i++)
			aClass332Array7081[i].method5829(1251984146);
		aClass524_7082.method8670(407698809);
		aClass524_7079.method8670(-318040530);
		aClass332_7085.method5829(-289726464);
		aClass315_7086.method5666(-103545958);
	}

	boolean method8702(int i) {
		if (i < 0)
			return false;
		if (1652953257 * anInt7073 != i) {
			anInt7073 = -566783079 * i;
			anInt7080 = Math.max(anInt7073 * 1652953257, 1) * -1180559687;
			aClass516_7083.method8618(Math.max(anInt7080 * -908783735, 4096), (byte) -118);
		}
		return true;
	}

	boolean setDecoderProperties(byte[] is, int i) {
		if (is.length < 5)
			return false;
		int i_67_ = is[0] & 0xff;
		int i_68_ = i_67_ % 9;
		int i_69_ = i_67_ / 9;
		int i_70_ = i_69_ % 5;
		int i_71_ = i_69_ / 5;
		int i_72_ = 0;
		for (int i_73_ = 0; i_73_ < 4; i_73_++)
			i_72_ += (is[1 + i_73_] & 0xff) << 8 * i_73_;
		if (!method8688(i_68_, i_70_, i_71_, 608691043))
			return false;
		return method8706(i_72_, -504122611);
	}

	boolean method8704(int i, int i_74_, int i_75_) {
		if (i > 8 || i_74_ > 4 || i_75_ > 4)
			return false;
		aClass537_7084.method8932(i_74_, i, 1533933225);
		int i_76_ = 1 << i_75_;
		aClass524_7082.method8669(i_76_, (short) 7465);
		aClass524_7079.method8669(i_76_, (short) 16293);
		anInt7087 = (i_76_ - 1) * 1333069919;
		return true;
	}

	boolean method8705(byte[] is) {
		if (is.length < 5)
			return false;
		int i = is[0] & 0xff;
		int i_77_ = i % 9;
		int i_78_ = i / 9;
		int i_79_ = i_78_ % 5;
		int i_80_ = i_78_ / 5;
		int i_81_ = 0;
		for (int i_82_ = 0; i_82_ < 4; i_82_++)
			i_81_ += (is[1 + i_82_] & 0xff) << 8 * i_82_;
		if (!method8688(i_77_, i_79_, i_80_, -748312718))
			return false;
		return method8706(i_81_, -504122611);
	}

	boolean method8706(int i, int i_83_) {
		if (i < 0)
			return false;
		if (1652953257 * anInt7073 != i) {
			anInt7073 = -566783079 * i;
			anInt7080 = Math.max(anInt7073 * 1652953257, 1) * -1180559687;
			aClass516_7083.method8618(Math.max(anInt7080 * -908783735, 4096), (byte) -123);
		}
		return true;
	}

	boolean method8707(InputStream inputstream, OutputStream outputstream, long l) throws IOException {
		aClass315_7086.method5665(inputstream, 406284848);
		aClass516_7083.method8610(outputstream, -199853381);
		method8687(1316383522);
		int i = Class478.method7894((byte) 16);
		int i_84_ = 0;
		int i_85_ = 0;
		int i_86_ = 0;
		int i_87_ = 0;
		long l_88_ = 0L;
		byte i_89_ = 0;
		while (l < 0L || l_88_ < l) {
			int i_90_ = (int) l_88_ & anInt7087 * -972598369;
			if (aClass315_7086.method5669(aShortArray7072, i_90_ + (i << 4), (byte) -65) == 0) {
				Class526 class526 = aClass537_7084.method8934((int) l_88_, i_89_, (byte) 18);
				if (!Class447.method7246(i, -1710296081))
					i_89_ = (class526.method8716(aClass315_7086, aClass516_7083.method8603(i_84_, (byte) 69), -1001201531));
				else
					i_89_ = class526.method8713(aClass315_7086, 1365882710);
				aClass516_7083.method8602(i_89_, -1211488283);
				i = Class6.method554(i, 2138772399);
				l_88_++;
			} else {
				int i_91_;
				if (aClass315_7086.method5669(aShortArray7074, i, (byte) -9) == 1) {
					i_91_ = 0;
					if (aClass315_7086.method5669(aShortArray7075, i, (byte) 70) == 0) {
						if (aClass315_7086.method5669(aShortArray7078, i_90_ + (i << 4), (byte) -11) == 0) {
							i = RSA.method912(i, (byte) 2);
							i_91_ = 1;
						}
					} else {
						int i_92_;
						if (aClass315_7086.method5669(aShortArray7076, i, (byte) 64) == 0)
							i_92_ = i_85_;
						else {
							if (aClass315_7086.method5669(aShortArray7077, i, (byte) -35) == 0)
								i_92_ = i_86_;
							else {
								i_92_ = i_87_;
								i_87_ = i_86_;
							}
							i_86_ = i_85_;
						}
						i_85_ = i_84_;
						i_84_ = i_92_;
					}
					if (i_91_ == 0) {
						i_91_ = aClass524_7079.method8675(aClass315_7086, i_90_, -1833642955) + 2;
						i = Class203.method3701(i, -113039386);
					}
				} else {
					i_87_ = i_86_;
					i_86_ = i_85_;
					i_85_ = i_84_;
					i_91_ = 2 + aClass524_7082.method8675(aClass315_7086, i_90_, -1858098036);
					i = Class214.method3843(i, (byte) -73);
					int i_93_ = aClass332Array7081[Class168_Sub2_Sub2.method17785(i_91_, (short) -3548)].method5827(aClass315_7086, 1663410157);
					if (i_93_ >= 4) {
						int i_94_ = (i_93_ >> 1) - 1;
						i_84_ = (0x2 | i_93_ & 0x1) << i_94_;
						if (i_93_ < 14)
							i_84_ += Class605.method9961(aShortArray7071, i_84_ - i_93_ - 1, aClass315_7086, i_94_, (byte) 7);
						else {
							i_84_ += aClass315_7086.method5668(i_94_ - 4, 573830552) << 4;
							i_84_ += aClass332_7085.method5828(aClass315_7086, -1616155659);
							if (i_84_ < 0) {
								if (-1 != i_84_)
									return false;
								break;
							}
						}
					} else
						i_84_ = i_93_;
				}
				if ((long) i_84_ >= l_88_ || i_84_ >= -908783735 * anInt7080)
					return false;
				aClass516_7083.method8601(i_84_, i_91_, (byte) 38);
				l_88_ += (long) i_91_;
				i_89_ = aClass516_7083.method8603(0, (byte) 105);
			}
		}
		aClass516_7083.method8600(-1491097514);
		aClass516_7083.method8615(2137861690);
		aClass315_7086.method5672(814894887);
		return true;
	}

	static final void method8708(Class669 class669, byte i) {
		int i_95_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class455.method7413((char) i_95_, (short) 947) ? 1 : 0;
	}

	public static Object[] method8709(RSBuffer class523_sub34, Class464[] class464s, int i) {
		int i_96_ = class523_sub34.readUnsignedSmart(368514876);
		Object[] objects = new Object[i_96_ * class464s.length];
		for (int i_97_ = 0; i_97_ < i_96_; i_97_++) {
			for (int i_98_ = 0; i_98_ < class464s.length; i_98_++) {
				int i_99_ = i_98_ + i_97_ * class464s.length;
				objects[i_99_] = class464s[i_98_].aClass474_5169.method7749(class523_sub34, -1528713828);
			}
		}
		return objects;
	}

	static final void method8710(Class669 class669, int i) {
		int i_100_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_100_, -1686059044);
		Class242 class242 = Class31.aClass242Array302[i_100_ >> 16];
		Class213.method3834(class250, class242, class669, 2023351844);
	}

	static final void method8711(Class669 class669, byte i) {
		int i_101_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_101_, -1018549530);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class250.anInt2578 * 533045263;
	}

	public static void method8712(Class159 class159, int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(1, (long) (-80020449 * class159.anInt1754));
		class523_sub27_sub7.method17962((byte) 106);
	}
}
