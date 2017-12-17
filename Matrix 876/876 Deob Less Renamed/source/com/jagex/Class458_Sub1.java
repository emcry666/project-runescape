/* Class458_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.util.Iterator;

public class Class458_Sub1 extends Class458 {
	Class557 aClass557_10325;
	static int anInt10326;

	public void method7484() {
		if (aClass557_10325 != null)
			aClass557_10325.method9204(-1721904998);
	}

	public void method7479() {
		if (aClass557_10325 != null) {
			try {
				aClass523_Sub34_5085.anInt10661 = 0;
				aClass523_Sub34_5085.writeByte(7, -1937637810);
				aClass523_Sub34_5085.method16494(0L);
				aClass557_10325.method9214(aClass523_Sub34_5085.aByteArray10658, 0, aClass523_Sub34_5085.aByteArray10658.length, (byte) 43);
			} catch (IOException ioexception) {
				try {
					aClass557_10325.method9203(1876125093);
				} catch (Exception exception) {
					/* empty */
				}
				aClass557_10325 = null;
				anInt5084 += -1392367399;
				anInt5088 = -1146404478;
			}
		}
	}

	public void method7473(Object object, boolean bool) {
		if (aClass557_10325 != null) {
			try {
				aClass557_10325.method9203(1157165048);
			} catch (Exception exception) {
				/* empty */
			}
			aClass557_10325 = null;
		}
		aClass557_10325 = (Class557) object;
		method15854((short) 14754);
		method7468(bool, 1126154533);
		aClass523_Sub34_5091.anInt10661 = 0;
		aClass523_Sub34_5077.anInt10661 = 0;
		aClass523_Sub27_Sub14_Sub2_5094 = null;
		for (;;) {
			Class523_Sub27_Sub14_Sub2 class523_sub27_sub14_sub2 = ((Class523_Sub27_Sub14_Sub2) aClass697_5075.method14015((byte) -18));
			if (null == class523_sub27_sub14_sub2)
				break;
			class523_sub27_sub14_sub2.aClass523_Sub34_12156 = null;
			aClass697_5092.method14030(class523_sub27_sub14_sub2, (byte) -86);
		}
		for (;;) {
			Class523_Sub27_Sub14_Sub2 class523_sub27_sub14_sub2 = ((Class523_Sub27_Sub14_Sub2) aClass697_5082.method14015((byte) -71));
			if (class523_sub27_sub14_sub2 == null)
				break;
			class523_sub27_sub14_sub2.aClass523_Sub34_12156 = null;
			aClass697_5087.method14030(class523_sub27_sub14_sub2, (byte) -125);
		}
		if (aByte5086 != 0) {
			try {
				aClass523_Sub34_5085.anInt10661 = 0;
				aClass523_Sub34_5085.writeByte(4, -1366192831);
				aClass523_Sub34_5085.writeByte(aByte5086, -20551523);
				aClass523_Sub34_5085.writeInt(0, -1584524645);
				aClass557_10325.method9214(aClass523_Sub34_5085.aByteArray10658, 0, aClass523_Sub34_5085.aByteArray10658.length, (byte) 24);
			} catch (IOException ioexception) {
				try {
					aClass557_10325.method9203(2026826224);
				} catch (Exception exception) {
					/* empty */
				}
				aClass557_10325 = null;
				anInt5084 += -1392367399;
				anInt5088 = -1146404478;
			}
		}
		anInt5083 = 0;
		aLong5080 = Class248.method4401(1516375036) * 3835168026948747853L;
	}

	void method15854(short i) {
		if (aClass557_10325 != null) {
			try {
				aClass523_Sub34_5085.anInt10661 = 0;
				aClass523_Sub34_5085.writeByte(6, 1315459058);
				aClass523_Sub34_5085.method16330(4, (byte) 0);
				aClass523_Sub34_5085.writeShort(0, (byte) -41);
				aClass557_10325.method9214(aClass523_Sub34_5085.aByteArray10658, 0, aClass523_Sub34_5085.aByteArray10658.length, (byte) 4);
			} catch (IOException ioexception) {
				try {
					aClass557_10325.method9203(1984339043);
				} catch (Exception exception) {
					/* empty */
				}
				aClass557_10325 = null;
				anInt5084 += -1392367399;
				anInt5088 = -1146404478;
			}
		}
	}

	public boolean method7455(int i) {
		if (aClass557_10325 != null) {
			long l = Class248.method4401(1516375036);
			int i_0_ = (int) (l - aLong5080 * -7066998226560235899L);
			aLong5080 = l * 3835168026948747853L;
			if (i_0_ > 200)
				i_0_ = 200;
			anInt5083 += i_0_ * -81723103;
			if (1237566177 * anInt5083 > 30000) {
				try {
					aClass557_10325.method9203(1972604063);
				} catch (Exception exception) {
					/* empty */
				}
				aClass557_10325 = null;
			}
		}
		if (null == aClass557_10325) {
			if (method7453((byte) 31) == 0 && method7452(-2130548103) == 0)
				return true;
			return false;
		}
		boolean bool;
		try {
			for (Class523_Sub27_Sub14_Sub2 class523_sub27_sub14_sub2 = ((Class523_Sub27_Sub14_Sub2) aClass697_5092.method14016(-1426448868)); null != class523_sub27_sub14_sub2; class523_sub27_sub14_sub2 = ((Class523_Sub27_Sub14_Sub2) aClass697_5092.method14018(768418218))) {
				aClass523_Sub34_5085.anInt10661 = 0;
				aClass523_Sub34_5085.writeByte(1, -1867765680);
				aClass523_Sub34_5085.method16494(-8659322449062458077L * (class523_sub27_sub14_sub2.aLong10552));
				aClass557_10325.method9214(aClass523_Sub34_5085.aByteArray10658, 0, aClass523_Sub34_5085.aByteArray10658.length, (byte) -2);
				aClass697_5075.method14030(class523_sub27_sub14_sub2, (byte) -49);
			}
			for (Class523_Sub27_Sub14_Sub2 class523_sub27_sub14_sub2 = ((Class523_Sub27_Sub14_Sub2) aClass697_5087.method14016(-1426448868)); null != class523_sub27_sub14_sub2; class523_sub27_sub14_sub2 = ((Class523_Sub27_Sub14_Sub2) aClass697_5087.method14018(768418218))) {
				aClass523_Sub34_5085.anInt10661 = 0;
				aClass523_Sub34_5085.writeByte(0, -988117908);
				aClass523_Sub34_5085.method16494((class523_sub27_sub14_sub2.aLong10552) * -8659322449062458077L);
				aClass557_10325.method9214(aClass523_Sub34_5085.aByteArray10658, 0, aClass523_Sub34_5085.aByteArray10658.length, (byte) -11);
				aClass697_5082.method14030(class523_sub27_sub14_sub2, (byte) -7);
			}
			for (int i_1_ = 0; i_1_ < 100; i_1_++) {
				int i_2_ = aClass557_10325.method9202(511737428);
				if (i_2_ < 0)
					throw new IOException();
				if (i_2_ == 0)
					break;
				anInt5083 = 0;
				if (null == aClass523_Sub27_Sub14_Sub2_5094) {
					int i_3_ = 5 - aClass523_Sub34_5091.anInt10661 * 2349011;
					if (i_3_ > i_2_)
						i_3_ = i_2_;
					aClass557_10325.method9201((aClass523_Sub34_5091.aByteArray10658), 2349011 * (aClass523_Sub34_5091.anInt10661), i_3_, (short) 20711);
					if (0 != aByte5086) {
						for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
							aClass523_Sub34_5091.aByteArray10658[(2349011 * aClass523_Sub34_5091.anInt10661 + i_4_)] ^= aByte5086;
					}
					aClass523_Sub34_5091.anInt10661 += i_3_ * 189765723;
					if (aClass523_Sub34_5091.anInt10661 * 2349011 >= 5) {
						aClass523_Sub34_5091.anInt10661 = 0;
						int i_5_ = aClass523_Sub34_5091.readUnsignedByte(-899672469);
						int i_6_ = aClass523_Sub34_5091.readUnsignedInt((byte) -126);
						boolean bool_7_ = 0 != (i_6_ & ~0x7fffffff);
						int i_8_ = i_6_ & 0x7fffffff;
						long l = ((long) i_5_ << 32) + (long) i_8_;
						if (bool_7_) {
							Iterator iterator = aClass697_5082.iterator();
							while (iterator.hasNext()) {
								Class523_Sub27_Sub14_Sub2 class523_sub27_sub14_sub2 = ((Class523_Sub27_Sub14_Sub2) iterator.next());
								if (l == (class523_sub27_sub14_sub2.aLong10552 * -8659322449062458077L)) {
									aClass523_Sub27_Sub14_Sub2_5094 = class523_sub27_sub14_sub2;
									break;
								}
							}
						} else {
							Iterator iterator = aClass697_5075.iterator();
							while (iterator.hasNext()) {
								Class523_Sub27_Sub14_Sub2 class523_sub27_sub14_sub2 = ((Class523_Sub27_Sub14_Sub2) iterator.next());
								if ((-8659322449062458077L * class523_sub27_sub14_sub2.aLong10552) == l) {
									aClass523_Sub27_Sub14_Sub2_5094 = class523_sub27_sub14_sub2;
									break;
								}
							}
						}
						if (null == aClass523_Sub27_Sub14_Sub2_5094)
							throw new IOException();
						anInt5093 = -1352914929;
						aClass523_Sub34_5091.anInt10661 = 0;
						aClass523_Sub34_5077.anInt10661 = 0;
					}
				} else {
					Class523_Sub34 class523_sub34 = (aClass523_Sub27_Sub14_Sub2_5094.aClass523_Sub34_12156);
					if (class523_sub34 == null) {
						int i_9_ = 5 - 2349011 * aClass523_Sub34_5077.anInt10661;
						if (i_9_ > i_2_)
							i_9_ = i_2_;
						aClass557_10325.method9201((aClass523_Sub34_5077.aByteArray10658), (aClass523_Sub34_5077.anInt10661) * 2349011, i_9_, (short) 30147);
						if (aByte5086 != 0) {
							for (int i_10_ = 0; i_10_ < i_9_; i_10_++)
								aClass523_Sub34_5077.aByteArray10658[(aClass523_Sub34_5077.anInt10661 * 2349011 + i_10_)] ^= aByte5086;
						}
						aClass523_Sub34_5077.anInt10661 += 189765723 * i_9_;
						if (2349011 * aClass523_Sub34_5077.anInt10661 >= 5) {
							aClass523_Sub34_5077.anInt10661 = 0;
							int i_11_ = aClass523_Sub34_5077.readUnsignedByte(1461394598);
							int i_12_ = aClass523_Sub34_5077.readUnsignedInt((byte) -88);
							int i_13_ = 5;
							if (i_11_ != Class450.aClass450_4952.method82())
								i_13_ = 9;
							class523_sub34 = aClass523_Sub27_Sub14_Sub2_5094.aClass523_Sub34_12156 = (new Class523_Sub34(aClass523_Sub27_Sub14_Sub2_5094.aByte12155 + (i_12_ + i_13_)));
							class523_sub34.writeByte(i_11_, 94309533);
							class523_sub34.writeInt(i_12_, -935380546);
							anInt5093 += -1352914929;
						}
					} else {
						int i_14_ = (class523_sub34.aByteArray10658.length - aClass523_Sub27_Sub14_Sub2_5094.aByte12155);
						int i_15_ = 102400 - anInt5093 * -391322965;
						if (i_15_ > i_14_ - 2349011 * class523_sub34.anInt10661)
							i_15_ = i_14_ - class523_sub34.anInt10661 * 2349011;
						if (i_15_ > i_2_)
							i_15_ = i_2_;
						aClass557_10325.method9201((class523_sub34.aByteArray10658), 2349011 * (class523_sub34.anInt10661), i_15_, (short) 30965);
						if (aByte5086 != 0) {
							for (int i_16_ = 0; i_16_ < i_15_; i_16_++)
								class523_sub34.aByteArray10658[(2349011 * class523_sub34.anInt10661 + i_16_)] ^= aByte5086;
						}
						class523_sub34.anInt10661 += 189765723 * i_15_;
						anInt5093 += i_15_ * -1129576445;
						if (2349011 * class523_sub34.anInt10661 == i_14_) {
							aClass523_Sub27_Sub14_Sub2_5094.method16154(-261651695);
							aClass523_Sub27_Sub14_Sub2_5094.aBool11748 = false;
							aClass523_Sub27_Sub14_Sub2_5094 = null;
						} else if (anInt5093 * -391322965 == 102400) {
							anInt5093 = 0;
							aClass523_Sub27_Sub14_Sub2_5094 = null;
						}
					}
				}
			}
			bool = true;
		} catch (IOException ioexception) {
			try {
				aClass557_10325.method9203(1765527118);
			} catch (Exception exception) {
				/* empty */
			}
			aClass557_10325 = null;
			anInt5084 += -1392367399;
			anInt5088 = -1146404478;
			if (method7453((byte) 112) == 0 && method7452(-2096128030) == 0)
				return true;
			return false;
		}
		return bool;
	}

	public void method7458(int i) {
		if (aClass557_10325 != null) {
			try {
				aClass523_Sub34_5085.anInt10661 = 0;
				aClass523_Sub34_5085.writeByte(7, 345162058);
				aClass523_Sub34_5085.method16494(0L);
				aClass557_10325.method9214(aClass523_Sub34_5085.aByteArray10658, 0, aClass523_Sub34_5085.aByteArray10658.length, (byte) -17);
			} catch (IOException ioexception) {
				try {
					aClass557_10325.method9203(1665834155);
				} catch (Exception exception) {
					/* empty */
				}
				aClass557_10325 = null;
				anInt5084 += -1392367399;
				anInt5088 = -1146404478;
			}
		}
	}

	public void method7459(int i) {
		if (null != aClass557_10325)
			aClass557_10325.method9203(1157821531);
	}

	public void method7460(int i) {
		if (aClass557_10325 != null)
			aClass557_10325.method9204(592980569);
	}

	public void method7476(boolean bool) {
		if (aClass557_10325 != null) {
			try {
				aClass523_Sub34_5085.anInt10661 = 0;
				aClass523_Sub34_5085.writeByte(bool ? 2 : 3, 1909333381);
				aClass523_Sub34_5085.method16494(0L);
				aClass557_10325.method9214(aClass523_Sub34_5085.aByteArray10658, 0, aClass523_Sub34_5085.aByteArray10658.length, (byte) -21);
			} catch (IOException ioexception) {
				try {
					aClass557_10325.method9203(1246645054);
				} catch (Exception exception) {
					/* empty */
				}
				aClass557_10325 = null;
				anInt5084 += -1392367399;
				anInt5088 = -1146404478;
			}
		}
	}

	public void method7469() {
		if (aClass557_10325 != null)
			aClass557_10325.method9204(1867754870);
	}

	public boolean method7470() {
		if (aClass557_10325 != null) {
			long l = Class248.method4401(1516375036);
			int i = (int) (l - aLong5080 * -7066998226560235899L);
			aLong5080 = l * 3835168026948747853L;
			if (i > 200)
				i = 200;
			anInt5083 += i * -81723103;
			if (1237566177 * anInt5083 > 30000) {
				try {
					aClass557_10325.method9203(1891126030);
				} catch (Exception exception) {
					/* empty */
				}
				aClass557_10325 = null;
			}
		}
		if (null == aClass557_10325) {
			if (method7453((byte) 44) == 0 && method7452(-2143743306) == 0)
				return true;
			return false;
		}
		boolean bool;
		try {
			for (Class523_Sub27_Sub14_Sub2 class523_sub27_sub14_sub2 = ((Class523_Sub27_Sub14_Sub2) aClass697_5092.method14016(-1426448868)); null != class523_sub27_sub14_sub2; class523_sub27_sub14_sub2 = ((Class523_Sub27_Sub14_Sub2) aClass697_5092.method14018(768418218))) {
				aClass523_Sub34_5085.anInt10661 = 0;
				aClass523_Sub34_5085.writeByte(1, 956606271);
				aClass523_Sub34_5085.method16494(-8659322449062458077L * (class523_sub27_sub14_sub2.aLong10552));
				aClass557_10325.method9214(aClass523_Sub34_5085.aByteArray10658, 0, aClass523_Sub34_5085.aByteArray10658.length, (byte) -67);
				aClass697_5075.method14030(class523_sub27_sub14_sub2, (byte) -30);
			}
			for (Class523_Sub27_Sub14_Sub2 class523_sub27_sub14_sub2 = ((Class523_Sub27_Sub14_Sub2) aClass697_5087.method14016(-1426448868)); null != class523_sub27_sub14_sub2; class523_sub27_sub14_sub2 = ((Class523_Sub27_Sub14_Sub2) aClass697_5087.method14018(768418218))) {
				aClass523_Sub34_5085.anInt10661 = 0;
				aClass523_Sub34_5085.writeByte(0, 752561788);
				aClass523_Sub34_5085.method16494((class523_sub27_sub14_sub2.aLong10552) * -8659322449062458077L);
				aClass557_10325.method9214(aClass523_Sub34_5085.aByteArray10658, 0, aClass523_Sub34_5085.aByteArray10658.length, (byte) 34);
				aClass697_5082.method14030(class523_sub27_sub14_sub2, (byte) -17);
			}
			for (int i = 0; i < 100; i++) {
				int i_17_ = aClass557_10325.method9202(-355485924);
				if (i_17_ < 0)
					throw new IOException();
				if (i_17_ == 0)
					break;
				anInt5083 = 0;
				if (null == aClass523_Sub27_Sub14_Sub2_5094) {
					int i_18_ = 5 - aClass523_Sub34_5091.anInt10661 * 2349011;
					if (i_18_ > i_17_)
						i_18_ = i_17_;
					aClass557_10325.method9201((aClass523_Sub34_5091.aByteArray10658), 2349011 * (aClass523_Sub34_5091.anInt10661), i_18_, (short) 7466);
					if (0 != aByte5086) {
						for (int i_19_ = 0; i_19_ < i_18_; i_19_++)
							aClass523_Sub34_5091.aByteArray10658[(2349011 * aClass523_Sub34_5091.anInt10661 + i_19_)] ^= aByte5086;
					}
					aClass523_Sub34_5091.anInt10661 += i_18_ * 189765723;
					if (aClass523_Sub34_5091.anInt10661 * 2349011 >= 5) {
						aClass523_Sub34_5091.anInt10661 = 0;
						int i_20_ = aClass523_Sub34_5091.readUnsignedByte(-1879251513);
						int i_21_ = aClass523_Sub34_5091.readUnsignedInt((byte) -100);
						boolean bool_22_ = 0 != (i_21_ & ~0x7fffffff);
						int i_23_ = i_21_ & 0x7fffffff;
						long l = ((long) i_20_ << 32) + (long) i_23_;
						if (bool_22_) {
							Iterator iterator = aClass697_5082.iterator();
							while (iterator.hasNext()) {
								Class523_Sub27_Sub14_Sub2 class523_sub27_sub14_sub2 = ((Class523_Sub27_Sub14_Sub2) iterator.next());
								if (l == (class523_sub27_sub14_sub2.aLong10552 * -8659322449062458077L)) {
									aClass523_Sub27_Sub14_Sub2_5094 = class523_sub27_sub14_sub2;
									break;
								}
							}
						} else {
							Iterator iterator = aClass697_5075.iterator();
							while (iterator.hasNext()) {
								Class523_Sub27_Sub14_Sub2 class523_sub27_sub14_sub2 = ((Class523_Sub27_Sub14_Sub2) iterator.next());
								if ((-8659322449062458077L * class523_sub27_sub14_sub2.aLong10552) == l) {
									aClass523_Sub27_Sub14_Sub2_5094 = class523_sub27_sub14_sub2;
									break;
								}
							}
						}
						if (null == aClass523_Sub27_Sub14_Sub2_5094)
							throw new IOException();
						anInt5093 = -1352914929;
						aClass523_Sub34_5091.anInt10661 = 0;
						aClass523_Sub34_5077.anInt10661 = 0;
					}
				} else {
					Class523_Sub34 class523_sub34 = (aClass523_Sub27_Sub14_Sub2_5094.aClass523_Sub34_12156);
					if (class523_sub34 == null) {
						int i_24_ = 5 - 2349011 * aClass523_Sub34_5077.anInt10661;
						if (i_24_ > i_17_)
							i_24_ = i_17_;
						aClass557_10325.method9201((aClass523_Sub34_5077.aByteArray10658), (aClass523_Sub34_5077.anInt10661) * 2349011, i_24_, (short) 12145);
						if (aByte5086 != 0) {
							for (int i_25_ = 0; i_25_ < i_24_; i_25_++)
								aClass523_Sub34_5077.aByteArray10658[(aClass523_Sub34_5077.anInt10661 * 2349011 + i_25_)] ^= aByte5086;
						}
						aClass523_Sub34_5077.anInt10661 += 189765723 * i_24_;
						if (2349011 * aClass523_Sub34_5077.anInt10661 >= 5) {
							aClass523_Sub34_5077.anInt10661 = 0;
							int i_26_ = aClass523_Sub34_5077.readUnsignedByte(-307117765);
							int i_27_ = aClass523_Sub34_5077.readUnsignedInt((byte) -79);
							int i_28_ = 5;
							if (i_26_ != Class450.aClass450_4952.method82())
								i_28_ = 9;
							class523_sub34 = aClass523_Sub27_Sub14_Sub2_5094.aClass523_Sub34_12156 = (new Class523_Sub34(aClass523_Sub27_Sub14_Sub2_5094.aByte12155 + (i_27_ + i_28_)));
							class523_sub34.writeByte(i_26_, 2094755416);
							class523_sub34.writeInt(i_27_, -742892746);
							anInt5093 += -1352914929;
						}
					} else {
						int i_29_ = (class523_sub34.aByteArray10658.length - aClass523_Sub27_Sub14_Sub2_5094.aByte12155);
						int i_30_ = 102400 - anInt5093 * -391322965;
						if (i_30_ > i_29_ - 2349011 * class523_sub34.anInt10661)
							i_30_ = i_29_ - class523_sub34.anInt10661 * 2349011;
						if (i_30_ > i_17_)
							i_30_ = i_17_;
						aClass557_10325.method9201((class523_sub34.aByteArray10658), 2349011 * (class523_sub34.anInt10661), i_30_, (short) 19913);
						if (aByte5086 != 0) {
							for (int i_31_ = 0; i_31_ < i_30_; i_31_++)
								class523_sub34.aByteArray10658[(2349011 * class523_sub34.anInt10661 + i_31_)] ^= aByte5086;
						}
						class523_sub34.anInt10661 += 189765723 * i_30_;
						anInt5093 += i_30_ * -1129576445;
						if (2349011 * class523_sub34.anInt10661 == i_29_) {
							aClass523_Sub27_Sub14_Sub2_5094.method16154(-261651695);
							aClass523_Sub27_Sub14_Sub2_5094.aBool11748 = false;
							aClass523_Sub27_Sub14_Sub2_5094 = null;
						} else if (anInt5093 * -391322965 == 102400) {
							anInt5093 = 0;
							aClass523_Sub27_Sub14_Sub2_5094 = null;
						}
					}
				}
			}
			bool = true;
		} catch (IOException ioexception) {
			try {
				aClass557_10325.method9203(1790120566);
			} catch (Exception exception) {
				/* empty */
			}
			aClass557_10325 = null;
			anInt5084 += -1392367399;
			anInt5088 = -1146404478;
			if (method7453((byte) 66) == 0 && method7452(-2090488898) == 0)
				return true;
			return false;
		}
		return bool;
	}

	public boolean method7471() {
		if (aClass557_10325 != null) {
			long l = Class248.method4401(1516375036);
			int i = (int) (l - aLong5080 * -7066998226560235899L);
			aLong5080 = l * 3835168026948747853L;
			if (i > 200)
				i = 200;
			anInt5083 += i * -81723103;
			if (1237566177 * anInt5083 > 30000) {
				try {
					aClass557_10325.method9203(1400385715);
				} catch (Exception exception) {
					/* empty */
				}
				aClass557_10325 = null;
			}
		}
		if (null == aClass557_10325) {
			if (method7453((byte) 86) == 0 && method7452(-2103696074) == 0)
				return true;
			return false;
		}
		boolean bool;
		try {
			for (Class523_Sub27_Sub14_Sub2 class523_sub27_sub14_sub2 = ((Class523_Sub27_Sub14_Sub2) aClass697_5092.method14016(-1426448868)); null != class523_sub27_sub14_sub2; class523_sub27_sub14_sub2 = ((Class523_Sub27_Sub14_Sub2) aClass697_5092.method14018(768418218))) {
				aClass523_Sub34_5085.anInt10661 = 0;
				aClass523_Sub34_5085.writeByte(1, -420581466);
				aClass523_Sub34_5085.method16494(-8659322449062458077L * (class523_sub27_sub14_sub2.aLong10552));
				aClass557_10325.method9214(aClass523_Sub34_5085.aByteArray10658, 0, aClass523_Sub34_5085.aByteArray10658.length, (byte) 101);
				aClass697_5075.method14030(class523_sub27_sub14_sub2, (byte) -111);
			}
			for (Class523_Sub27_Sub14_Sub2 class523_sub27_sub14_sub2 = ((Class523_Sub27_Sub14_Sub2) aClass697_5087.method14016(-1426448868)); null != class523_sub27_sub14_sub2; class523_sub27_sub14_sub2 = ((Class523_Sub27_Sub14_Sub2) aClass697_5087.method14018(768418218))) {
				aClass523_Sub34_5085.anInt10661 = 0;
				aClass523_Sub34_5085.writeByte(0, -1369382176);
				aClass523_Sub34_5085.method16494((class523_sub27_sub14_sub2.aLong10552) * -8659322449062458077L);
				aClass557_10325.method9214(aClass523_Sub34_5085.aByteArray10658, 0, aClass523_Sub34_5085.aByteArray10658.length, (byte) -100);
				aClass697_5082.method14030(class523_sub27_sub14_sub2, (byte) -98);
			}
			for (int i = 0; i < 100; i++) {
				int i_32_ = aClass557_10325.method9202(725424020);
				if (i_32_ < 0)
					throw new IOException();
				if (i_32_ == 0)
					break;
				anInt5083 = 0;
				if (null == aClass523_Sub27_Sub14_Sub2_5094) {
					int i_33_ = 5 - aClass523_Sub34_5091.anInt10661 * 2349011;
					if (i_33_ > i_32_)
						i_33_ = i_32_;
					aClass557_10325.method9201((aClass523_Sub34_5091.aByteArray10658), 2349011 * (aClass523_Sub34_5091.anInt10661), i_33_, (short) 27055);
					if (0 != aByte5086) {
						for (int i_34_ = 0; i_34_ < i_33_; i_34_++)
							aClass523_Sub34_5091.aByteArray10658[(2349011 * aClass523_Sub34_5091.anInt10661 + i_34_)] ^= aByte5086;
					}
					aClass523_Sub34_5091.anInt10661 += i_33_ * 189765723;
					if (aClass523_Sub34_5091.anInt10661 * 2349011 >= 5) {
						aClass523_Sub34_5091.anInt10661 = 0;
						int i_35_ = aClass523_Sub34_5091.readUnsignedByte(427800737);
						int i_36_ = aClass523_Sub34_5091.readUnsignedInt((byte) -20);
						boolean bool_37_ = 0 != (i_36_ & ~0x7fffffff);
						int i_38_ = i_36_ & 0x7fffffff;
						long l = ((long) i_35_ << 32) + (long) i_38_;
						if (bool_37_) {
							Iterator iterator = aClass697_5082.iterator();
							while (iterator.hasNext()) {
								Class523_Sub27_Sub14_Sub2 class523_sub27_sub14_sub2 = ((Class523_Sub27_Sub14_Sub2) iterator.next());
								if (l == (class523_sub27_sub14_sub2.aLong10552 * -8659322449062458077L)) {
									aClass523_Sub27_Sub14_Sub2_5094 = class523_sub27_sub14_sub2;
									break;
								}
							}
						} else {
							Iterator iterator = aClass697_5075.iterator();
							while (iterator.hasNext()) {
								Class523_Sub27_Sub14_Sub2 class523_sub27_sub14_sub2 = ((Class523_Sub27_Sub14_Sub2) iterator.next());
								if ((-8659322449062458077L * class523_sub27_sub14_sub2.aLong10552) == l) {
									aClass523_Sub27_Sub14_Sub2_5094 = class523_sub27_sub14_sub2;
									break;
								}
							}
						}
						if (null == aClass523_Sub27_Sub14_Sub2_5094)
							throw new IOException();
						anInt5093 = -1352914929;
						aClass523_Sub34_5091.anInt10661 = 0;
						aClass523_Sub34_5077.anInt10661 = 0;
					}
				} else {
					Class523_Sub34 class523_sub34 = (aClass523_Sub27_Sub14_Sub2_5094.aClass523_Sub34_12156);
					if (class523_sub34 == null) {
						int i_39_ = 5 - 2349011 * aClass523_Sub34_5077.anInt10661;
						if (i_39_ > i_32_)
							i_39_ = i_32_;
						aClass557_10325.method9201((aClass523_Sub34_5077.aByteArray10658), (aClass523_Sub34_5077.anInt10661) * 2349011, i_39_, (short) 13881);
						if (aByte5086 != 0) {
							for (int i_40_ = 0; i_40_ < i_39_; i_40_++)
								aClass523_Sub34_5077.aByteArray10658[(aClass523_Sub34_5077.anInt10661 * 2349011 + i_40_)] ^= aByte5086;
						}
						aClass523_Sub34_5077.anInt10661 += 189765723 * i_39_;
						if (2349011 * aClass523_Sub34_5077.anInt10661 >= 5) {
							aClass523_Sub34_5077.anInt10661 = 0;
							int i_41_ = aClass523_Sub34_5077.readUnsignedByte(1414730327);
							int i_42_ = aClass523_Sub34_5077.readUnsignedInt((byte) -92);
							int i_43_ = 5;
							if (i_41_ != Class450.aClass450_4952.method82())
								i_43_ = 9;
							class523_sub34 = aClass523_Sub27_Sub14_Sub2_5094.aClass523_Sub34_12156 = (new Class523_Sub34(aClass523_Sub27_Sub14_Sub2_5094.aByte12155 + (i_42_ + i_43_)));
							class523_sub34.writeByte(i_41_, 894540031);
							class523_sub34.writeInt(i_42_, -1537047740);
							anInt5093 += -1352914929;
						}
					} else {
						int i_44_ = (class523_sub34.aByteArray10658.length - aClass523_Sub27_Sub14_Sub2_5094.aByte12155);
						int i_45_ = 102400 - anInt5093 * -391322965;
						if (i_45_ > i_44_ - 2349011 * class523_sub34.anInt10661)
							i_45_ = i_44_ - class523_sub34.anInt10661 * 2349011;
						if (i_45_ > i_32_)
							i_45_ = i_32_;
						aClass557_10325.method9201((class523_sub34.aByteArray10658), 2349011 * (class523_sub34.anInt10661), i_45_, (short) 16730);
						if (aByte5086 != 0) {
							for (int i_46_ = 0; i_46_ < i_45_; i_46_++)
								class523_sub34.aByteArray10658[(2349011 * class523_sub34.anInt10661 + i_46_)] ^= aByte5086;
						}
						class523_sub34.anInt10661 += 189765723 * i_45_;
						anInt5093 += i_45_ * -1129576445;
						if (2349011 * class523_sub34.anInt10661 == i_44_) {
							aClass523_Sub27_Sub14_Sub2_5094.method16154(-261651695);
							aClass523_Sub27_Sub14_Sub2_5094.aBool11748 = false;
							aClass523_Sub27_Sub14_Sub2_5094 = null;
						} else if (anInt5093 * -391322965 == 102400) {
							anInt5093 = 0;
							aClass523_Sub27_Sub14_Sub2_5094 = null;
						}
					}
				}
			}
			bool = true;
		} catch (IOException ioexception) {
			try {
				aClass557_10325.method9203(1193089646);
			} catch (Exception exception) {
				/* empty */
			}
			aClass557_10325 = null;
			anInt5084 += -1392367399;
			anInt5088 = -1146404478;
			if (method7453((byte) 122) == 0 && method7452(-2096247248) == 0)
				return true;
			return false;
		}
		return bool;
	}

	public void method7481(Object object, boolean bool) {
		if (aClass557_10325 != null) {
			try {
				aClass557_10325.method9203(2093695464);
			} catch (Exception exception) {
				/* empty */
			}
			aClass557_10325 = null;
		}
		aClass557_10325 = (Class557) object;
		method15854((short) -4218);
		method7468(bool, -630336305);
		aClass523_Sub34_5091.anInt10661 = 0;
		aClass523_Sub34_5077.anInt10661 = 0;
		aClass523_Sub27_Sub14_Sub2_5094 = null;
		for (;;) {
			Class523_Sub27_Sub14_Sub2 class523_sub27_sub14_sub2 = ((Class523_Sub27_Sub14_Sub2) aClass697_5075.method14015((byte) -121));
			if (null == class523_sub27_sub14_sub2)
				break;
			class523_sub27_sub14_sub2.aClass523_Sub34_12156 = null;
			aClass697_5092.method14030(class523_sub27_sub14_sub2, (byte) -67);
		}
		for (;;) {
			Class523_Sub27_Sub14_Sub2 class523_sub27_sub14_sub2 = ((Class523_Sub27_Sub14_Sub2) aClass697_5082.method14015((byte) -37));
			if (class523_sub27_sub14_sub2 == null)
				break;
			class523_sub27_sub14_sub2.aClass523_Sub34_12156 = null;
			aClass697_5087.method14030(class523_sub27_sub14_sub2, (byte) -74);
		}
		if (aByte5086 != 0) {
			try {
				aClass523_Sub34_5085.anInt10661 = 0;
				aClass523_Sub34_5085.writeByte(4, 19515328);
				aClass523_Sub34_5085.writeByte(aByte5086, -1651793428);
				aClass523_Sub34_5085.writeInt(0, -1038405120);
				aClass557_10325.method9214(aClass523_Sub34_5085.aByteArray10658, 0, aClass523_Sub34_5085.aByteArray10658.length, (byte) 33);
			} catch (IOException ioexception) {
				try {
					aClass557_10325.method9203(1113999832);
				} catch (Exception exception) {
					/* empty */
				}
				aClass557_10325 = null;
				anInt5084 += -1392367399;
				anInt5088 = -1146404478;
			}
		}
		anInt5083 = 0;
		aLong5080 = Class248.method4401(1516375036) * 3835168026948747853L;
	}

	public boolean method7483() {
		if (aClass557_10325 != null) {
			long l = Class248.method4401(1516375036);
			int i = (int) (l - aLong5080 * -7066998226560235899L);
			aLong5080 = l * 3835168026948747853L;
			if (i > 200)
				i = 200;
			anInt5083 += i * -81723103;
			if (1237566177 * anInt5083 > 30000) {
				try {
					aClass557_10325.method9203(1786473056);
				} catch (Exception exception) {
					/* empty */
				}
				aClass557_10325 = null;
			}
		}
		if (null == aClass557_10325) {
			if (method7453((byte) 110) == 0 && method7452(-2132515032) == 0)
				return true;
			return false;
		}
		boolean bool;
		try {
			for (Class523_Sub27_Sub14_Sub2 class523_sub27_sub14_sub2 = ((Class523_Sub27_Sub14_Sub2) aClass697_5092.method14016(-1426448868)); null != class523_sub27_sub14_sub2; class523_sub27_sub14_sub2 = ((Class523_Sub27_Sub14_Sub2) aClass697_5092.method14018(768418218))) {
				aClass523_Sub34_5085.anInt10661 = 0;
				aClass523_Sub34_5085.writeByte(1, 766775979);
				aClass523_Sub34_5085.method16494(-8659322449062458077L * (class523_sub27_sub14_sub2.aLong10552));
				aClass557_10325.method9214(aClass523_Sub34_5085.aByteArray10658, 0, aClass523_Sub34_5085.aByteArray10658.length, (byte) -95);
				aClass697_5075.method14030(class523_sub27_sub14_sub2, (byte) -15);
			}
			for (Class523_Sub27_Sub14_Sub2 class523_sub27_sub14_sub2 = ((Class523_Sub27_Sub14_Sub2) aClass697_5087.method14016(-1426448868)); null != class523_sub27_sub14_sub2; class523_sub27_sub14_sub2 = ((Class523_Sub27_Sub14_Sub2) aClass697_5087.method14018(768418218))) {
				aClass523_Sub34_5085.anInt10661 = 0;
				aClass523_Sub34_5085.writeByte(0, 1415369730);
				aClass523_Sub34_5085.method16494((class523_sub27_sub14_sub2.aLong10552) * -8659322449062458077L);
				aClass557_10325.method9214(aClass523_Sub34_5085.aByteArray10658, 0, aClass523_Sub34_5085.aByteArray10658.length, (byte) 68);
				aClass697_5082.method14030(class523_sub27_sub14_sub2, (byte) -52);
			}
			for (int i = 0; i < 100; i++) {
				int i_47_ = aClass557_10325.method9202(-1839386728);
				if (i_47_ < 0)
					throw new IOException();
				if (i_47_ == 0)
					break;
				anInt5083 = 0;
				if (null == aClass523_Sub27_Sub14_Sub2_5094) {
					int i_48_ = 5 - aClass523_Sub34_5091.anInt10661 * 2349011;
					if (i_48_ > i_47_)
						i_48_ = i_47_;
					aClass557_10325.method9201((aClass523_Sub34_5091.aByteArray10658), 2349011 * (aClass523_Sub34_5091.anInt10661), i_48_, (short) 9619);
					if (0 != aByte5086) {
						for (int i_49_ = 0; i_49_ < i_48_; i_49_++)
							aClass523_Sub34_5091.aByteArray10658[(2349011 * aClass523_Sub34_5091.anInt10661 + i_49_)] ^= aByte5086;
					}
					aClass523_Sub34_5091.anInt10661 += i_48_ * 189765723;
					if (aClass523_Sub34_5091.anInt10661 * 2349011 >= 5) {
						aClass523_Sub34_5091.anInt10661 = 0;
						int i_50_ = aClass523_Sub34_5091.readUnsignedByte(409340130);
						int i_51_ = aClass523_Sub34_5091.readUnsignedInt((byte) -19);
						boolean bool_52_ = 0 != (i_51_ & ~0x7fffffff);
						int i_53_ = i_51_ & 0x7fffffff;
						long l = ((long) i_50_ << 32) + (long) i_53_;
						if (bool_52_) {
							Iterator iterator = aClass697_5082.iterator();
							while (iterator.hasNext()) {
								Class523_Sub27_Sub14_Sub2 class523_sub27_sub14_sub2 = ((Class523_Sub27_Sub14_Sub2) iterator.next());
								if (l == (class523_sub27_sub14_sub2.aLong10552 * -8659322449062458077L)) {
									aClass523_Sub27_Sub14_Sub2_5094 = class523_sub27_sub14_sub2;
									break;
								}
							}
						} else {
							Iterator iterator = aClass697_5075.iterator();
							while (iterator.hasNext()) {
								Class523_Sub27_Sub14_Sub2 class523_sub27_sub14_sub2 = ((Class523_Sub27_Sub14_Sub2) iterator.next());
								if ((-8659322449062458077L * class523_sub27_sub14_sub2.aLong10552) == l) {
									aClass523_Sub27_Sub14_Sub2_5094 = class523_sub27_sub14_sub2;
									break;
								}
							}
						}
						if (null == aClass523_Sub27_Sub14_Sub2_5094)
							throw new IOException();
						anInt5093 = -1352914929;
						aClass523_Sub34_5091.anInt10661 = 0;
						aClass523_Sub34_5077.anInt10661 = 0;
					}
				} else {
					Class523_Sub34 class523_sub34 = (aClass523_Sub27_Sub14_Sub2_5094.aClass523_Sub34_12156);
					if (class523_sub34 == null) {
						int i_54_ = 5 - 2349011 * aClass523_Sub34_5077.anInt10661;
						if (i_54_ > i_47_)
							i_54_ = i_47_;
						aClass557_10325.method9201((aClass523_Sub34_5077.aByteArray10658), (aClass523_Sub34_5077.anInt10661) * 2349011, i_54_, (short) 19978);
						if (aByte5086 != 0) {
							for (int i_55_ = 0; i_55_ < i_54_; i_55_++)
								aClass523_Sub34_5077.aByteArray10658[(aClass523_Sub34_5077.anInt10661 * 2349011 + i_55_)] ^= aByte5086;
						}
						aClass523_Sub34_5077.anInt10661 += 189765723 * i_54_;
						if (2349011 * aClass523_Sub34_5077.anInt10661 >= 5) {
							aClass523_Sub34_5077.anInt10661 = 0;
							int i_56_ = aClass523_Sub34_5077.readUnsignedByte(1098695716);
							int i_57_ = aClass523_Sub34_5077.readUnsignedInt((byte) -8);
							int i_58_ = 5;
							if (i_56_ != Class450.aClass450_4952.method82())
								i_58_ = 9;
							class523_sub34 = aClass523_Sub27_Sub14_Sub2_5094.aClass523_Sub34_12156 = (new Class523_Sub34(aClass523_Sub27_Sub14_Sub2_5094.aByte12155 + (i_57_ + i_58_)));
							class523_sub34.writeByte(i_56_, 2079251029);
							class523_sub34.writeInt(i_57_, -1824185872);
							anInt5093 += -1352914929;
						}
					} else {
						int i_59_ = (class523_sub34.aByteArray10658.length - aClass523_Sub27_Sub14_Sub2_5094.aByte12155);
						int i_60_ = 102400 - anInt5093 * -391322965;
						if (i_60_ > i_59_ - 2349011 * class523_sub34.anInt10661)
							i_60_ = i_59_ - class523_sub34.anInt10661 * 2349011;
						if (i_60_ > i_47_)
							i_60_ = i_47_;
						aClass557_10325.method9201((class523_sub34.aByteArray10658), 2349011 * (class523_sub34.anInt10661), i_60_, (short) 10826);
						if (aByte5086 != 0) {
							for (int i_61_ = 0; i_61_ < i_60_; i_61_++)
								class523_sub34.aByteArray10658[(2349011 * class523_sub34.anInt10661 + i_61_)] ^= aByte5086;
						}
						class523_sub34.anInt10661 += 189765723 * i_60_;
						anInt5093 += i_60_ * -1129576445;
						if (2349011 * class523_sub34.anInt10661 == i_59_) {
							aClass523_Sub27_Sub14_Sub2_5094.method16154(-261651695);
							aClass523_Sub27_Sub14_Sub2_5094.aBool11748 = false;
							aClass523_Sub27_Sub14_Sub2_5094 = null;
						} else if (anInt5093 * -391322965 == 102400) {
							anInt5093 = 0;
							aClass523_Sub27_Sub14_Sub2_5094 = null;
						}
					}
				}
			}
			bool = true;
		} catch (IOException ioexception) {
			try {
				aClass557_10325.method9203(1332309694);
			} catch (Exception exception) {
				/* empty */
			}
			aClass557_10325 = null;
			anInt5084 += -1392367399;
			anInt5088 = -1146404478;
			if (method7453((byte) 121) == 0 && method7452(-2130778001) == 0)
				return true;
			return false;
		}
		return bool;
	}

	public void method7474(boolean bool) {
		if (aClass557_10325 != null) {
			try {
				aClass523_Sub34_5085.anInt10661 = 0;
				aClass523_Sub34_5085.writeByte(bool ? 2 : 3, -265804263);
				aClass523_Sub34_5085.method16494(0L);
				aClass557_10325.method9214(aClass523_Sub34_5085.aByteArray10658, 0, aClass523_Sub34_5085.aByteArray10658.length, (byte) -67);
			} catch (IOException ioexception) {
				try {
					aClass557_10325.method9203(1240965309);
				} catch (Exception exception) {
					/* empty */
				}
				aClass557_10325 = null;
				anInt5084 += -1392367399;
				anInt5088 = -1146404478;
			}
		}
	}

	void method7465(int i, int i_62_) {
		try {
			aClass557_10325.method9203(1295240940);
		} catch (Exception exception) {
			/* empty */
		}
		aClass557_10325 = null;
		anInt5084 += -1392367399;
		anInt5088 = 1574281409;
		aByte5086 = (byte) (int) (Math.random() * 255.0 + 1.0);
		anInt5089 = -1123781699 * i;
		anInt5073 = -824923659 * i_62_;
	}

	void method7454(int i, int i_63_, int i_64_) {
		try {
			aClass557_10325.method9203(1203805030);
		} catch (Exception exception) {
			/* empty */
		}
		aClass557_10325 = null;
		anInt5084 += -1392367399;
		anInt5088 = 1574281409;
		aByte5086 = (byte) (int) (Math.random() * 255.0 + 1.0);
		anInt5089 = -1123781699 * i;
		anInt5073 = -824923659 * i_63_;
	}

	public void method7478(boolean bool) {
		if (aClass557_10325 != null) {
			try {
				aClass523_Sub34_5085.anInt10661 = 0;
				aClass523_Sub34_5085.writeByte(bool ? 2 : 3, 441509966);
				aClass523_Sub34_5085.method16494(0L);
				aClass557_10325.method9214(aClass523_Sub34_5085.aByteArray10658, 0, aClass523_Sub34_5085.aByteArray10658.length, (byte) 1);
			} catch (IOException ioexception) {
				try {
					aClass557_10325.method9203(1499551693);
				} catch (Exception exception) {
					/* empty */
				}
				aClass557_10325 = null;
				anInt5084 += -1392367399;
				anInt5088 = -1146404478;
			}
		}
	}

	public void method7468(boolean bool, int i) {
		if (aClass557_10325 != null) {
			try {
				aClass523_Sub34_5085.anInt10661 = 0;
				aClass523_Sub34_5085.writeByte(bool ? 2 : 3, 263366935);
				aClass523_Sub34_5085.method16494(0L);
				aClass557_10325.method9214(aClass523_Sub34_5085.aByteArray10658, 0, aClass523_Sub34_5085.aByteArray10658.length, (byte) -13);
			} catch (IOException ioexception) {
				try {
					aClass557_10325.method9203(1081641993);
				} catch (Exception exception) {
					/* empty */
				}
				aClass557_10325 = null;
				anInt5084 += -1392367399;
				anInt5088 = -1146404478;
			}
		}
	}

	public void method7457() {
		if (null != aClass557_10325)
			aClass557_10325.method9203(2052654187);
	}

	public void method7480() {
		if (null != aClass557_10325)
			aClass557_10325.method9203(1078519512);
	}

	public void method7451() {
		if (null != aClass557_10325)
			aClass557_10325.method9203(1878246820);
	}

	public void method7449() {
		if (null != aClass557_10325)
			aClass557_10325.method9203(1476880940);
	}

	public void method7472() {
		if (aClass557_10325 != null)
			aClass557_10325.method9204(1414963900);
	}

	public void method7475(boolean bool) {
		if (aClass557_10325 != null) {
			try {
				aClass523_Sub34_5085.anInt10661 = 0;
				aClass523_Sub34_5085.writeByte(bool ? 2 : 3, -1188186728);
				aClass523_Sub34_5085.method16494(0L);
				aClass557_10325.method9214(aClass523_Sub34_5085.aByteArray10658, 0, aClass523_Sub34_5085.aByteArray10658.length, (byte) 63);
			} catch (IOException ioexception) {
				try {
					aClass557_10325.method9203(1185233128);
				} catch (Exception exception) {
					/* empty */
				}
				aClass557_10325 = null;
				anInt5084 += -1392367399;
				anInt5088 = -1146404478;
			}
		}
	}

	public void method7456(Object object, boolean bool, int i) {
		if (aClass557_10325 != null) {
			try {
				aClass557_10325.method9203(1178582705);
			} catch (Exception exception) {
				/* empty */
			}
			aClass557_10325 = null;
		}
		aClass557_10325 = (Class557) object;
		method15854((short) 8919);
		method7468(bool, -1307082319);
		aClass523_Sub34_5091.anInt10661 = 0;
		aClass523_Sub34_5077.anInt10661 = 0;
		aClass523_Sub27_Sub14_Sub2_5094 = null;
		for (;;) {
			Class523_Sub27_Sub14_Sub2 class523_sub27_sub14_sub2 = ((Class523_Sub27_Sub14_Sub2) aClass697_5075.method14015((byte) -113));
			if (null == class523_sub27_sub14_sub2)
				break;
			class523_sub27_sub14_sub2.aClass523_Sub34_12156 = null;
			aClass697_5092.method14030(class523_sub27_sub14_sub2, (byte) -119);
		}
		for (;;) {
			Class523_Sub27_Sub14_Sub2 class523_sub27_sub14_sub2 = ((Class523_Sub27_Sub14_Sub2) aClass697_5082.method14015((byte) -120));
			if (class523_sub27_sub14_sub2 == null)
				break;
			class523_sub27_sub14_sub2.aClass523_Sub34_12156 = null;
			aClass697_5087.method14030(class523_sub27_sub14_sub2, (byte) -41);
		}
		if (aByte5086 != 0) {
			try {
				aClass523_Sub34_5085.anInt10661 = 0;
				aClass523_Sub34_5085.writeByte(4, -1589443590);
				aClass523_Sub34_5085.writeByte(aByte5086, -783310411);
				aClass523_Sub34_5085.writeInt(0, -859088471);
				aClass557_10325.method9214(aClass523_Sub34_5085.aByteArray10658, 0, aClass523_Sub34_5085.aByteArray10658.length, (byte) -22);
			} catch (IOException ioexception) {
				try {
					aClass557_10325.method9203(1305397587);
				} catch (Exception exception) {
					/* empty */
				}
				aClass557_10325 = null;
				anInt5084 += -1392367399;
				anInt5088 = -1146404478;
			}
		}
		anInt5083 = 0;
		aLong5080 = Class248.method4401(1516375036) * 3835168026948747853L;
	}

	void method15855() {
		if (aClass557_10325 != null) {
			try {
				aClass523_Sub34_5085.anInt10661 = 0;
				aClass523_Sub34_5085.writeByte(6, 1734925481);
				aClass523_Sub34_5085.method16330(4, (byte) 0);
				aClass523_Sub34_5085.writeShort(0, (byte) -109);
				aClass557_10325.method9214(aClass523_Sub34_5085.aByteArray10658, 0, aClass523_Sub34_5085.aByteArray10658.length, (byte) 42);
			} catch (IOException ioexception) {
				try {
					aClass557_10325.method9203(1486312418);
				} catch (Exception exception) {
					/* empty */
				}
				aClass557_10325 = null;
				anInt5084 += -1392367399;
				anInt5088 = -1146404478;
			}
		}
	}

	public static int method15856(CharSequence charsequence, byte i) {
		return Class221.method4136(charsequence, 10, true, 652399542);
	}

	static final void method15857(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class216.method3851((byte) 29);
	}
}
