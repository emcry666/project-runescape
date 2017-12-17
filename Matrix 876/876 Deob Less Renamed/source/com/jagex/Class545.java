/* Class545 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.EOFException;
import java.io.IOException;

public final class Class545 {
	int anInt7280;
	Class20 aClass20_7281 = null;
	static byte[] aByteArray7282 = new byte[520];
	int anInt7283;
	Class20 aClass20_7284 = null;

	public byte[] method9047(int i, byte i_0_) {
		synchronized (aClass20_7281) {
			byte[] is;
			try {
				if (aClass20_7284.method811((byte) -75) < (long) (6 * i + 6)) {
					byte[] is_1_ = null;
					return is_1_;
				}
				aClass20_7284.method799((long) (i * 6));
				aClass20_7284.method802(aByteArray7282, 0, 6, (byte) 0);
				int i_2_ = ((aByteArray7282[2] & 0xff) + (((aByteArray7282[0] & 0xff) << 16) + ((aByteArray7282[1] & 0xff) << 8)));
				int i_3_ = ((aByteArray7282[5] & 0xff) + (((aByteArray7282[3] & 0xff) << 16) + ((aByteArray7282[4] & 0xff) << 8)));
				if (i_2_ < 0 || i_2_ > anInt7280 * -977619021) {
					byte[] is_4_ = null;
					return is_4_;
				}
				if (i_3_ <= 0 || ((long) i_3_ > aClass20_7281.method811((byte) -118) / 520L)) {
					byte[] is_5_ = null;
					return is_5_;
				}
				byte[] is_6_ = new byte[i_2_];
				int i_7_ = 0;
				int i_8_ = 0;
				while (i_7_ < i_2_) {
					if (0 == i_3_) {
						byte[] is_9_ = null;
						return is_9_;
					}
					aClass20_7281.method799(520L * (long) i_3_);
					int i_10_ = i_2_ - i_7_;
					int i_11_;
					int i_12_;
					int i_13_;
					int i_14_;
					int i_15_;
					if (i > 65535) {
						if (i_10_ > 510)
							i_10_ = 510;
						i_11_ = 10;
						aClass20_7281.method802(aByteArray7282, 0, i_11_ + i_10_, (byte) 0);
						i_12_ = (((aByteArray7282[1] & 0xff) << 16) + ((aByteArray7282[0] & 0xff) << 24) + ((aByteArray7282[2] & 0xff) << 8) + (aByteArray7282[3] & 0xff));
						i_13_ = ((aByteArray7282[5] & 0xff) + ((aByteArray7282[4] & 0xff) << 8));
						i_14_ = (((aByteArray7282[6] & 0xff) << 16) + ((aByteArray7282[7] & 0xff) << 8) + (aByteArray7282[8] & 0xff));
						i_15_ = aByteArray7282[9] & 0xff;
					} else {
						if (i_10_ > 512)
							i_10_ = 512;
						i_11_ = 8;
						aClass20_7281.method802(aByteArray7282, 0, i_11_ + i_10_, (byte) 0);
						i_12_ = (((aByteArray7282[0] & 0xff) << 8) + (aByteArray7282[1] & 0xff));
						i_13_ = ((aByteArray7282[3] & 0xff) + ((aByteArray7282[2] & 0xff) << 8));
						i_14_ = (((aByteArray7282[4] & 0xff) << 16) + ((aByteArray7282[5] & 0xff) << 8) + (aByteArray7282[6] & 0xff));
						i_15_ = aByteArray7282[7] & 0xff;
					}
					if (i != i_12_ || i_13_ != i_8_ || anInt7283 * -545856487 != i_15_) {
						byte[] is_16_ = null;
						return is_16_;
					}
					if (i_14_ < 0 || ((long) i_14_ > aClass20_7281.method811((byte) -87) / 520L)) {
						byte[] is_17_ = null;
						return is_17_;
					}
					int i_18_ = i_11_ + i_10_;
					for (int i_19_ = i_11_; i_19_ < i_18_; i_19_++)
						is_6_[i_7_++] = aByteArray7282[i_19_];
					i_3_ = i_14_;
					i_8_++;
				}
				is = is_6_;
			} catch (IOException ioexception) {
				byte[] is_20_ = null;
				return is_20_;
			}
			return is;
		}
	}

	public byte[] method9048(int i) {
		synchronized (aClass20_7281) {
			byte[] is;
			try {
				if (aClass20_7284.method811((byte) -29) < (long) (6 * i + 6)) {
					byte[] is_21_ = null;
					return is_21_;
				}
				aClass20_7284.method799((long) (i * 6));
				aClass20_7284.method802(aByteArray7282, 0, 6, (byte) 0);
				int i_22_ = ((aByteArray7282[2] & 0xff) + (((aByteArray7282[0] & 0xff) << 16) + ((aByteArray7282[1] & 0xff) << 8)));
				int i_23_ = ((aByteArray7282[5] & 0xff) + (((aByteArray7282[3] & 0xff) << 16) + ((aByteArray7282[4] & 0xff) << 8)));
				if (i_22_ < 0 || i_22_ > anInt7280 * -977619021) {
					byte[] is_24_ = null;
					return is_24_;
				}
				if (i_23_ <= 0 || ((long) i_23_ > aClass20_7281.method811((byte) -60) / 520L)) {
					byte[] is_25_ = null;
					return is_25_;
				}
				byte[] is_26_ = new byte[i_22_];
				int i_27_ = 0;
				int i_28_ = 0;
				while (i_27_ < i_22_) {
					if (0 == i_23_) {
						byte[] is_29_ = null;
						return is_29_;
					}
					aClass20_7281.method799(520L * (long) i_23_);
					int i_30_ = i_22_ - i_27_;
					int i_31_;
					int i_32_;
					int i_33_;
					int i_34_;
					int i_35_;
					if (i > 65535) {
						if (i_30_ > 510)
							i_30_ = 510;
						i_31_ = 10;
						aClass20_7281.method802(aByteArray7282, 0, i_31_ + i_30_, (byte) 0);
						i_32_ = (((aByteArray7282[1] & 0xff) << 16) + ((aByteArray7282[0] & 0xff) << 24) + ((aByteArray7282[2] & 0xff) << 8) + (aByteArray7282[3] & 0xff));
						i_33_ = ((aByteArray7282[5] & 0xff) + ((aByteArray7282[4] & 0xff) << 8));
						i_34_ = (((aByteArray7282[6] & 0xff) << 16) + ((aByteArray7282[7] & 0xff) << 8) + (aByteArray7282[8] & 0xff));
						i_35_ = aByteArray7282[9] & 0xff;
					} else {
						if (i_30_ > 512)
							i_30_ = 512;
						i_31_ = 8;
						aClass20_7281.method802(aByteArray7282, 0, i_31_ + i_30_, (byte) 0);
						i_32_ = (((aByteArray7282[0] & 0xff) << 8) + (aByteArray7282[1] & 0xff));
						i_33_ = ((aByteArray7282[3] & 0xff) + ((aByteArray7282[2] & 0xff) << 8));
						i_34_ = (((aByteArray7282[4] & 0xff) << 16) + ((aByteArray7282[5] & 0xff) << 8) + (aByteArray7282[6] & 0xff));
						i_35_ = aByteArray7282[7] & 0xff;
					}
					if (i != i_32_ || i_33_ != i_28_ || anInt7283 * -545856487 != i_35_) {
						byte[] is_36_ = null;
						return is_36_;
					}
					if (i_34_ < 0 || ((long) i_34_ > aClass20_7281.method811((byte) -108) / 520L)) {
						byte[] is_37_ = null;
						return is_37_;
					}
					int i_38_ = i_31_ + i_30_;
					for (int i_39_ = i_31_; i_39_ < i_38_; i_39_++)
						is_26_[i_27_++] = aByteArray7282[i_39_];
					i_23_ = i_34_;
					i_28_++;
				}
				is = is_26_;
			} catch (IOException ioexception) {
				byte[] is_40_ = null;
				return is_40_;
			}
			return is;
		}
	}

	public boolean method9049(int i, byte[] is, int i_41_, byte i_42_) {
		synchronized (aClass20_7281) {
			if (i_41_ < 0 || i_41_ > anInt7280 * -977619021)
				throw new IllegalArgumentException(new StringBuilder().append("").append(anInt7283 * -545856487).append(',').append(i).append(',').append(i_41_).toString());
			boolean bool = method9057(i, is, i_41_, true, 2031965858);
			if (!bool)
				bool = method9057(i, is, i_41_, false, 2031965858);
			boolean bool_43_ = bool;
			return bool_43_;
		}
	}

	public byte[] method9050(int i) {
		synchronized (aClass20_7281) {
			byte[] is;
			try {
				if (aClass20_7284.method811((byte) -68) < (long) (6 * i + 6)) {
					byte[] is_44_ = null;
					return is_44_;
				}
				aClass20_7284.method799((long) (i * 6));
				aClass20_7284.method802(aByteArray7282, 0, 6, (byte) 0);
				int i_45_ = ((aByteArray7282[2] & 0xff) + (((aByteArray7282[0] & 0xff) << 16) + ((aByteArray7282[1] & 0xff) << 8)));
				int i_46_ = ((aByteArray7282[5] & 0xff) + (((aByteArray7282[3] & 0xff) << 16) + ((aByteArray7282[4] & 0xff) << 8)));
				if (i_45_ < 0 || i_45_ > anInt7280 * -977619021) {
					byte[] is_47_ = null;
					return is_47_;
				}
				if (i_46_ <= 0 || ((long) i_46_ > aClass20_7281.method811((byte) -50) / 520L)) {
					byte[] is_48_ = null;
					return is_48_;
				}
				byte[] is_49_ = new byte[i_45_];
				int i_50_ = 0;
				int i_51_ = 0;
				while (i_50_ < i_45_) {
					if (0 == i_46_) {
						byte[] is_52_ = null;
						return is_52_;
					}
					aClass20_7281.method799(520L * (long) i_46_);
					int i_53_ = i_45_ - i_50_;
					int i_54_;
					int i_55_;
					int i_56_;
					int i_57_;
					int i_58_;
					if (i > 65535) {
						if (i_53_ > 510)
							i_53_ = 510;
						i_54_ = 10;
						aClass20_7281.method802(aByteArray7282, 0, i_54_ + i_53_, (byte) 0);
						i_55_ = (((aByteArray7282[1] & 0xff) << 16) + ((aByteArray7282[0] & 0xff) << 24) + ((aByteArray7282[2] & 0xff) << 8) + (aByteArray7282[3] & 0xff));
						i_56_ = ((aByteArray7282[5] & 0xff) + ((aByteArray7282[4] & 0xff) << 8));
						i_57_ = (((aByteArray7282[6] & 0xff) << 16) + ((aByteArray7282[7] & 0xff) << 8) + (aByteArray7282[8] & 0xff));
						i_58_ = aByteArray7282[9] & 0xff;
					} else {
						if (i_53_ > 512)
							i_53_ = 512;
						i_54_ = 8;
						aClass20_7281.method802(aByteArray7282, 0, i_54_ + i_53_, (byte) 0);
						i_55_ = (((aByteArray7282[0] & 0xff) << 8) + (aByteArray7282[1] & 0xff));
						i_56_ = ((aByteArray7282[3] & 0xff) + ((aByteArray7282[2] & 0xff) << 8));
						i_57_ = (((aByteArray7282[4] & 0xff) << 16) + ((aByteArray7282[5] & 0xff) << 8) + (aByteArray7282[6] & 0xff));
						i_58_ = aByteArray7282[7] & 0xff;
					}
					if (i != i_55_ || i_56_ != i_51_ || anInt7283 * -545856487 != i_58_) {
						byte[] is_59_ = null;
						return is_59_;
					}
					if (i_57_ < 0 || ((long) i_57_ > aClass20_7281.method811((byte) -80) / 520L)) {
						byte[] is_60_ = null;
						return is_60_;
					}
					int i_61_ = i_54_ + i_53_;
					for (int i_62_ = i_54_; i_62_ < i_61_; i_62_++)
						is_49_[i_50_++] = aByteArray7282[i_62_];
					i_46_ = i_57_;
					i_51_++;
				}
				is = is_49_;
			} catch (IOException ioexception) {
				byte[] is_63_ = null;
				return is_63_;
			}
			return is;
		}
	}

	public String toString() {
		return new StringBuilder().append("").append(-545856487 * anInt7283).toString();
	}

	public String method9051() {
		return new StringBuilder().append("").append(-545856487 * anInt7283).toString();
	}

	public byte[] method9052(int i) {
		synchronized (aClass20_7281) {
			byte[] is;
			try {
				if (aClass20_7284.method811((byte) -76) < (long) (6 * i + 6)) {
					byte[] is_64_ = null;
					return is_64_;
				}
				aClass20_7284.method799((long) (i * 6));
				aClass20_7284.method802(aByteArray7282, 0, 6, (byte) 0);
				int i_65_ = ((aByteArray7282[2] & 0xff) + (((aByteArray7282[0] & 0xff) << 16) + ((aByteArray7282[1] & 0xff) << 8)));
				int i_66_ = ((aByteArray7282[5] & 0xff) + (((aByteArray7282[3] & 0xff) << 16) + ((aByteArray7282[4] & 0xff) << 8)));
				if (i_65_ < 0 || i_65_ > anInt7280 * -977619021) {
					byte[] is_67_ = null;
					return is_67_;
				}
				if (i_66_ <= 0 || ((long) i_66_ > aClass20_7281.method811((byte) -27) / 520L)) {
					byte[] is_68_ = null;
					return is_68_;
				}
				byte[] is_69_ = new byte[i_65_];
				int i_70_ = 0;
				int i_71_ = 0;
				while (i_70_ < i_65_) {
					if (0 == i_66_) {
						byte[] is_72_ = null;
						return is_72_;
					}
					aClass20_7281.method799(520L * (long) i_66_);
					int i_73_ = i_65_ - i_70_;
					int i_74_;
					int i_75_;
					int i_76_;
					int i_77_;
					int i_78_;
					if (i > 65535) {
						if (i_73_ > 510)
							i_73_ = 510;
						i_74_ = 10;
						aClass20_7281.method802(aByteArray7282, 0, i_74_ + i_73_, (byte) 0);
						i_75_ = (((aByteArray7282[1] & 0xff) << 16) + ((aByteArray7282[0] & 0xff) << 24) + ((aByteArray7282[2] & 0xff) << 8) + (aByteArray7282[3] & 0xff));
						i_76_ = ((aByteArray7282[5] & 0xff) + ((aByteArray7282[4] & 0xff) << 8));
						i_77_ = (((aByteArray7282[6] & 0xff) << 16) + ((aByteArray7282[7] & 0xff) << 8) + (aByteArray7282[8] & 0xff));
						i_78_ = aByteArray7282[9] & 0xff;
					} else {
						if (i_73_ > 512)
							i_73_ = 512;
						i_74_ = 8;
						aClass20_7281.method802(aByteArray7282, 0, i_74_ + i_73_, (byte) 0);
						i_75_ = (((aByteArray7282[0] & 0xff) << 8) + (aByteArray7282[1] & 0xff));
						i_76_ = ((aByteArray7282[3] & 0xff) + ((aByteArray7282[2] & 0xff) << 8));
						i_77_ = (((aByteArray7282[4] & 0xff) << 16) + ((aByteArray7282[5] & 0xff) << 8) + (aByteArray7282[6] & 0xff));
						i_78_ = aByteArray7282[7] & 0xff;
					}
					if (i != i_75_ || i_76_ != i_71_ || anInt7283 * -545856487 != i_78_) {
						byte[] is_79_ = null;
						return is_79_;
					}
					if (i_77_ < 0 || ((long) i_77_ > aClass20_7281.method811((byte) -83) / 520L)) {
						byte[] is_80_ = null;
						return is_80_;
					}
					int i_81_ = i_74_ + i_73_;
					for (int i_82_ = i_74_; i_82_ < i_81_; i_82_++)
						is_69_[i_70_++] = aByteArray7282[i_82_];
					i_66_ = i_77_;
					i_71_++;
				}
				is = is_69_;
			} catch (IOException ioexception) {
				byte[] is_83_ = null;
				return is_83_;
			}
			return is;
		}
	}

	public Class545(int i, Class20 class20, Class20 class20_84_, int i_85_) {
		anInt7280 = -2016897416;
		anInt7283 = -695191511 * i;
		aClass20_7281 = class20;
		aClass20_7284 = class20_84_;
		anInt7280 = i_85_ * -2009018501;
	}

	public byte[] method9053(int i) {
		synchronized (aClass20_7281) {
			byte[] is;
			try {
				if (aClass20_7284.method811((byte) -71) < (long) (6 * i + 6)) {
					byte[] is_86_ = null;
					return is_86_;
				}
				aClass20_7284.method799((long) (i * 6));
				aClass20_7284.method802(aByteArray7282, 0, 6, (byte) 0);
				int i_87_ = ((aByteArray7282[2] & 0xff) + (((aByteArray7282[0] & 0xff) << 16) + ((aByteArray7282[1] & 0xff) << 8)));
				int i_88_ = ((aByteArray7282[5] & 0xff) + (((aByteArray7282[3] & 0xff) << 16) + ((aByteArray7282[4] & 0xff) << 8)));
				if (i_87_ < 0 || i_87_ > anInt7280 * -977619021) {
					byte[] is_89_ = null;
					return is_89_;
				}
				if (i_88_ <= 0 || ((long) i_88_ > aClass20_7281.method811((byte) -21) / 520L)) {
					byte[] is_90_ = null;
					return is_90_;
				}
				byte[] is_91_ = new byte[i_87_];
				int i_92_ = 0;
				int i_93_ = 0;
				while (i_92_ < i_87_) {
					if (0 == i_88_) {
						byte[] is_94_ = null;
						return is_94_;
					}
					aClass20_7281.method799(520L * (long) i_88_);
					int i_95_ = i_87_ - i_92_;
					int i_96_;
					int i_97_;
					int i_98_;
					int i_99_;
					int i_100_;
					if (i > 65535) {
						if (i_95_ > 510)
							i_95_ = 510;
						i_96_ = 10;
						aClass20_7281.method802(aByteArray7282, 0, i_96_ + i_95_, (byte) 0);
						i_97_ = (((aByteArray7282[1] & 0xff) << 16) + ((aByteArray7282[0] & 0xff) << 24) + ((aByteArray7282[2] & 0xff) << 8) + (aByteArray7282[3] & 0xff));
						i_98_ = ((aByteArray7282[5] & 0xff) + ((aByteArray7282[4] & 0xff) << 8));
						i_99_ = (((aByteArray7282[6] & 0xff) << 16) + ((aByteArray7282[7] & 0xff) << 8) + (aByteArray7282[8] & 0xff));
						i_100_ = aByteArray7282[9] & 0xff;
					} else {
						if (i_95_ > 512)
							i_95_ = 512;
						i_96_ = 8;
						aClass20_7281.method802(aByteArray7282, 0, i_96_ + i_95_, (byte) 0);
						i_97_ = (((aByteArray7282[0] & 0xff) << 8) + (aByteArray7282[1] & 0xff));
						i_98_ = ((aByteArray7282[3] & 0xff) + ((aByteArray7282[2] & 0xff) << 8));
						i_99_ = (((aByteArray7282[4] & 0xff) << 16) + ((aByteArray7282[5] & 0xff) << 8) + (aByteArray7282[6] & 0xff));
						i_100_ = aByteArray7282[7] & 0xff;
					}
					if (i != i_97_ || i_98_ != i_93_ || anInt7283 * -545856487 != i_100_) {
						byte[] is_101_ = null;
						return is_101_;
					}
					if (i_99_ < 0 || ((long) i_99_ > aClass20_7281.method811((byte) -22) / 520L)) {
						byte[] is_102_ = null;
						return is_102_;
					}
					int i_103_ = i_96_ + i_95_;
					for (int i_104_ = i_96_; i_104_ < i_103_; i_104_++)
						is_91_[i_92_++] = aByteArray7282[i_104_];
					i_88_ = i_99_;
					i_93_++;
				}
				is = is_91_;
			} catch (IOException ioexception) {
				byte[] is_105_ = null;
				return is_105_;
			}
			return is;
		}
	}

	public boolean method9054(int i, byte[] is, int i_106_) {
		synchronized (aClass20_7281) {
			if (i_106_ < 0 || i_106_ > anInt7280 * -977619021)
				throw new IllegalArgumentException(new StringBuilder().append("").append(anInt7283 * -545856487).append(',').append(i).append(',').append(i_106_).toString());
			boolean bool = method9057(i, is, i_106_, true, 2031965858);
			if (!bool)
				bool = method9057(i, is, i_106_, false, 2031965858);
			boolean bool_107_ = bool;
			return bool_107_;
		}
	}

	public byte[] method9055(int i) {
		synchronized (aClass20_7281) {
			byte[] is;
			try {
				if (aClass20_7284.method811((byte) -126) < (long) (6 * i + 6)) {
					byte[] is_108_ = null;
					return is_108_;
				}
				aClass20_7284.method799((long) (i * 6));
				aClass20_7284.method802(aByteArray7282, 0, 6, (byte) 0);
				int i_109_ = ((aByteArray7282[2] & 0xff) + (((aByteArray7282[0] & 0xff) << 16) + ((aByteArray7282[1] & 0xff) << 8)));
				int i_110_ = ((aByteArray7282[5] & 0xff) + (((aByteArray7282[3] & 0xff) << 16) + ((aByteArray7282[4] & 0xff) << 8)));
				if (i_109_ < 0 || i_109_ > anInt7280 * -977619021) {
					byte[] is_111_ = null;
					return is_111_;
				}
				if (i_110_ <= 0 || ((long) i_110_ > aClass20_7281.method811((byte) -3) / 520L)) {
					byte[] is_112_ = null;
					return is_112_;
				}
				byte[] is_113_ = new byte[i_109_];
				int i_114_ = 0;
				int i_115_ = 0;
				while (i_114_ < i_109_) {
					if (0 == i_110_) {
						byte[] is_116_ = null;
						return is_116_;
					}
					aClass20_7281.method799(520L * (long) i_110_);
					int i_117_ = i_109_ - i_114_;
					int i_118_;
					int i_119_;
					int i_120_;
					int i_121_;
					int i_122_;
					if (i > 65535) {
						if (i_117_ > 510)
							i_117_ = 510;
						i_118_ = 10;
						aClass20_7281.method802(aByteArray7282, 0, i_118_ + i_117_, (byte) 0);
						i_119_ = (((aByteArray7282[1] & 0xff) << 16) + ((aByteArray7282[0] & 0xff) << 24) + ((aByteArray7282[2] & 0xff) << 8) + (aByteArray7282[3] & 0xff));
						i_120_ = ((aByteArray7282[5] & 0xff) + ((aByteArray7282[4] & 0xff) << 8));
						i_121_ = (((aByteArray7282[6] & 0xff) << 16) + ((aByteArray7282[7] & 0xff) << 8) + (aByteArray7282[8] & 0xff));
						i_122_ = aByteArray7282[9] & 0xff;
					} else {
						if (i_117_ > 512)
							i_117_ = 512;
						i_118_ = 8;
						aClass20_7281.method802(aByteArray7282, 0, i_118_ + i_117_, (byte) 0);
						i_119_ = (((aByteArray7282[0] & 0xff) << 8) + (aByteArray7282[1] & 0xff));
						i_120_ = ((aByteArray7282[3] & 0xff) + ((aByteArray7282[2] & 0xff) << 8));
						i_121_ = (((aByteArray7282[4] & 0xff) << 16) + ((aByteArray7282[5] & 0xff) << 8) + (aByteArray7282[6] & 0xff));
						i_122_ = aByteArray7282[7] & 0xff;
					}
					if (i != i_119_ || i_120_ != i_115_ || anInt7283 * -545856487 != i_122_) {
						byte[] is_123_ = null;
						return is_123_;
					}
					if (i_121_ < 0 || ((long) i_121_ > aClass20_7281.method811((byte) -83) / 520L)) {
						byte[] is_124_ = null;
						return is_124_;
					}
					int i_125_ = i_118_ + i_117_;
					for (int i_126_ = i_118_; i_126_ < i_125_; i_126_++)
						is_113_[i_114_++] = aByteArray7282[i_126_];
					i_110_ = i_121_;
					i_115_++;
				}
				is = is_113_;
			} catch (IOException ioexception) {
				byte[] is_127_ = null;
				return is_127_;
			}
			return is;
		}
	}

	public boolean method9056(int i, byte[] is, int i_128_) {
		synchronized (aClass20_7281) {
			if (i_128_ < 0 || i_128_ > anInt7280 * -977619021)
				throw new IllegalArgumentException(new StringBuilder().append("").append(anInt7283 * -545856487).append(',').append(i).append(',').append(i_128_).toString());
			boolean bool = method9057(i, is, i_128_, true, 2031965858);
			if (!bool)
				bool = method9057(i, is, i_128_, false, 2031965858);
			boolean bool_129_ = bool;
			return bool_129_;
		}
	}

	boolean method9057(int i, byte[] is, int i_130_, boolean bool, int i_131_) {
		synchronized (aClass20_7281) {
			boolean bool_132_;
			try {
				int i_133_;
				if (bool) {
					if (aClass20_7284.method811((byte) -113) < (long) (6 + i * 6)) {
						boolean bool_134_ = false;
						return bool_134_;
					}
					aClass20_7284.method799((long) (6 * i));
					aClass20_7284.method802(aByteArray7282, 0, 6, (byte) 0);
					i_133_ = (((aByteArray7282[4] & 0xff) << 8) + ((aByteArray7282[3] & 0xff) << 16) + (aByteArray7282[5] & 0xff));
					if (i_133_ <= 0 || ((long) i_133_ > aClass20_7281.method811((byte) -111) / 520L)) {
						boolean bool_135_ = false;
						return bool_135_;
					}
				} else {
					i_133_ = (int) ((aClass20_7281.method811((byte) -69) + 519L) / 520L);
					if (i_133_ == 0)
						i_133_ = 1;
				}
				aByteArray7282[0] = (byte) (i_130_ >> 16);
				aByteArray7282[1] = (byte) (i_130_ >> 8);
				aByteArray7282[2] = (byte) i_130_;
				aByteArray7282[3] = (byte) (i_133_ >> 16);
				aByteArray7282[4] = (byte) (i_133_ >> 8);
				aByteArray7282[5] = (byte) i_133_;
				aClass20_7284.method799((long) (i * 6));
				aClass20_7284.method804(aByteArray7282, 0, 6, (byte) 1);
				int i_136_ = 0;
				int i_137_ = 0;
				while (i_136_ < i_130_) {
					int i_138_ = 0;
					if (bool) {
						aClass20_7281.method799(520L * (long) i_133_);
						int i_139_;
						int i_140_;
						int i_141_;
						if (i > 65535) {
							try {
								aClass20_7281.method802(aByteArray7282, 0, 10, (byte) 0);
							} catch (EOFException eofexception) {
								break;
							}
							i_139_ = ((aByteArray7282[3] & 0xff) + (((aByteArray7282[0] & 0xff) << 24) + ((aByteArray7282[1] & 0xff) << 16) + ((aByteArray7282[2] & 0xff) << 8)));
							i_140_ = (((aByteArray7282[4] & 0xff) << 8) + (aByteArray7282[5] & 0xff));
							i_138_ = (((aByteArray7282[7] & 0xff) << 8) + ((aByteArray7282[6] & 0xff) << 16) + (aByteArray7282[8] & 0xff));
							i_141_ = aByteArray7282[9] & 0xff;
						} else {
							try {
								aClass20_7281.method802(aByteArray7282, 0, 8, (byte) 0);
							} catch (EOFException eofexception) {
								break;
							}
							i_139_ = ((aByteArray7282[1] & 0xff) + ((aByteArray7282[0] & 0xff) << 8));
							i_140_ = (((aByteArray7282[2] & 0xff) << 8) + (aByteArray7282[3] & 0xff));
							i_138_ = (((aByteArray7282[5] & 0xff) << 8) + ((aByteArray7282[4] & 0xff) << 16) + (aByteArray7282[6] & 0xff));
							i_141_ = aByteArray7282[7] & 0xff;
						}
						if (i_139_ != i || i_140_ != i_137_ || -545856487 * anInt7283 != i_141_) {
							boolean bool_142_ = false;
							return bool_142_;
						}
						if (i_138_ < 0 || ((long) i_138_ > (aClass20_7281.method811((byte) -75) / 520L))) {
							boolean bool_143_ = false;
							return bool_143_;
						}
					}
					if (i_138_ == 0) {
						bool = false;
						i_138_ = (int) ((aClass20_7281.method811((byte) -118) + 519L) / 520L);
						if (i_138_ == 0)
							i_138_++;
						if (i_133_ == i_138_)
							i_138_++;
					}
					if (i > 65535) {
						if (i_130_ - i_136_ <= 510)
							i_138_ = 0;
						aByteArray7282[0] = (byte) (i >> 24);
						aByteArray7282[1] = (byte) (i >> 16);
						aByteArray7282[2] = (byte) (i >> 8);
						aByteArray7282[3] = (byte) i;
						aByteArray7282[4] = (byte) (i_137_ >> 8);
						aByteArray7282[5] = (byte) i_137_;
						aByteArray7282[6] = (byte) (i_138_ >> 16);
						aByteArray7282[7] = (byte) (i_138_ >> 8);
						aByteArray7282[8] = (byte) i_138_;
						aByteArray7282[9] = (byte) (-545856487 * anInt7283);
						aClass20_7281.method799(520L * (long) i_133_);
						aClass20_7281.method804(aByteArray7282, 0, 10, (byte) 1);
						int i_144_ = i_130_ - i_136_;
						if (i_144_ > 510)
							i_144_ = 510;
						aClass20_7281.method804(is, i_136_, i_144_, (byte) 1);
						i_136_ += i_144_;
					} else {
						if (i_130_ - i_136_ <= 512)
							i_138_ = 0;
						aByteArray7282[0] = (byte) (i >> 8);
						aByteArray7282[1] = (byte) i;
						aByteArray7282[2] = (byte) (i_137_ >> 8);
						aByteArray7282[3] = (byte) i_137_;
						aByteArray7282[4] = (byte) (i_138_ >> 16);
						aByteArray7282[5] = (byte) (i_138_ >> 8);
						aByteArray7282[6] = (byte) i_138_;
						aByteArray7282[7] = (byte) (-545856487 * anInt7283);
						aClass20_7281.method799(520L * (long) i_133_);
						aClass20_7281.method804(aByteArray7282, 0, 8, (byte) 1);
						int i_145_ = i_130_ - i_136_;
						if (i_145_ > 512)
							i_145_ = 512;
						aClass20_7281.method804(is, i_136_, i_145_, (byte) 1);
						i_136_ += i_145_;
					}
					i_133_ = i_138_;
					i_137_++;
				}
				bool_132_ = true;
			} catch (IOException ioexception) {
				boolean bool_146_ = false;
				return bool_146_;
			}
			return bool_132_;
		}
	}

	public boolean method9058(int i, byte[] is, int i_147_) {
		synchronized (aClass20_7281) {
			if (i_147_ < 0 || i_147_ > anInt7280 * -977619021)
				throw new IllegalArgumentException(new StringBuilder().append("").append(anInt7283 * -545856487).append(',').append(i).append(',').append(i_147_).toString());
			boolean bool = method9057(i, is, i_147_, true, 2031965858);
			if (!bool)
				bool = method9057(i, is, i_147_, false, 2031965858);
			boolean bool_148_ = bool;
			return bool_148_;
		}
	}

	boolean method9059(int i, byte[] is, int i_149_, boolean bool) {
		synchronized (aClass20_7281) {
			boolean bool_150_;
			try {
				int i_151_;
				if (bool) {
					if (aClass20_7284.method811((byte) -73) < (long) (6 + i * 6)) {
						boolean bool_152_ = false;
						return bool_152_;
					}
					aClass20_7284.method799((long) (6 * i));
					aClass20_7284.method802(aByteArray7282, 0, 6, (byte) 0);
					i_151_ = (((aByteArray7282[4] & 0xff) << 8) + ((aByteArray7282[3] & 0xff) << 16) + (aByteArray7282[5] & 0xff));
					if (i_151_ <= 0 || ((long) i_151_ > aClass20_7281.method811((byte) -87) / 520L)) {
						boolean bool_153_ = false;
						return bool_153_;
					}
				} else {
					i_151_ = (int) ((aClass20_7281.method811((byte) -5) + 519L) / 520L);
					if (i_151_ == 0)
						i_151_ = 1;
				}
				aByteArray7282[0] = (byte) (i_149_ >> 16);
				aByteArray7282[1] = (byte) (i_149_ >> 8);
				aByteArray7282[2] = (byte) i_149_;
				aByteArray7282[3] = (byte) (i_151_ >> 16);
				aByteArray7282[4] = (byte) (i_151_ >> 8);
				aByteArray7282[5] = (byte) i_151_;
				aClass20_7284.method799((long) (i * 6));
				aClass20_7284.method804(aByteArray7282, 0, 6, (byte) 1);
				int i_154_ = 0;
				int i_155_ = 0;
				while (i_154_ < i_149_) {
					int i_156_ = 0;
					if (bool) {
						aClass20_7281.method799(520L * (long) i_151_);
						int i_157_;
						int i_158_;
						int i_159_;
						if (i > 65535) {
							try {
								aClass20_7281.method802(aByteArray7282, 0, 10, (byte) 0);
							} catch (EOFException eofexception) {
								break;
							}
							i_157_ = ((aByteArray7282[3] & 0xff) + (((aByteArray7282[0] & 0xff) << 24) + ((aByteArray7282[1] & 0xff) << 16) + ((aByteArray7282[2] & 0xff) << 8)));
							i_158_ = (((aByteArray7282[4] & 0xff) << 8) + (aByteArray7282[5] & 0xff));
							i_156_ = (((aByteArray7282[7] & 0xff) << 8) + ((aByteArray7282[6] & 0xff) << 16) + (aByteArray7282[8] & 0xff));
							i_159_ = aByteArray7282[9] & 0xff;
						} else {
							try {
								aClass20_7281.method802(aByteArray7282, 0, 8, (byte) 0);
							} catch (EOFException eofexception) {
								break;
							}
							i_157_ = ((aByteArray7282[1] & 0xff) + ((aByteArray7282[0] & 0xff) << 8));
							i_158_ = (((aByteArray7282[2] & 0xff) << 8) + (aByteArray7282[3] & 0xff));
							i_156_ = (((aByteArray7282[5] & 0xff) << 8) + ((aByteArray7282[4] & 0xff) << 16) + (aByteArray7282[6] & 0xff));
							i_159_ = aByteArray7282[7] & 0xff;
						}
						if (i_157_ != i || i_158_ != i_155_ || -545856487 * anInt7283 != i_159_) {
							boolean bool_160_ = false;
							return bool_160_;
						}
						if (i_156_ < 0 || ((long) i_156_ > (aClass20_7281.method811((byte) -116) / 520L))) {
							boolean bool_161_ = false;
							return bool_161_;
						}
					}
					if (i_156_ == 0) {
						bool = false;
						i_156_ = (int) ((aClass20_7281.method811((byte) -61) + 519L) / 520L);
						if (i_156_ == 0)
							i_156_++;
						if (i_151_ == i_156_)
							i_156_++;
					}
					if (i > 65535) {
						if (i_149_ - i_154_ <= 510)
							i_156_ = 0;
						aByteArray7282[0] = (byte) (i >> 24);
						aByteArray7282[1] = (byte) (i >> 16);
						aByteArray7282[2] = (byte) (i >> 8);
						aByteArray7282[3] = (byte) i;
						aByteArray7282[4] = (byte) (i_155_ >> 8);
						aByteArray7282[5] = (byte) i_155_;
						aByteArray7282[6] = (byte) (i_156_ >> 16);
						aByteArray7282[7] = (byte) (i_156_ >> 8);
						aByteArray7282[8] = (byte) i_156_;
						aByteArray7282[9] = (byte) (-545856487 * anInt7283);
						aClass20_7281.method799(520L * (long) i_151_);
						aClass20_7281.method804(aByteArray7282, 0, 10, (byte) 1);
						int i_162_ = i_149_ - i_154_;
						if (i_162_ > 510)
							i_162_ = 510;
						aClass20_7281.method804(is, i_154_, i_162_, (byte) 1);
						i_154_ += i_162_;
					} else {
						if (i_149_ - i_154_ <= 512)
							i_156_ = 0;
						aByteArray7282[0] = (byte) (i >> 8);
						aByteArray7282[1] = (byte) i;
						aByteArray7282[2] = (byte) (i_155_ >> 8);
						aByteArray7282[3] = (byte) i_155_;
						aByteArray7282[4] = (byte) (i_156_ >> 16);
						aByteArray7282[5] = (byte) (i_156_ >> 8);
						aByteArray7282[6] = (byte) i_156_;
						aByteArray7282[7] = (byte) (-545856487 * anInt7283);
						aClass20_7281.method799(520L * (long) i_151_);
						aClass20_7281.method804(aByteArray7282, 0, 8, (byte) 1);
						int i_163_ = i_149_ - i_154_;
						if (i_163_ > 512)
							i_163_ = 512;
						aClass20_7281.method804(is, i_154_, i_163_, (byte) 1);
						i_154_ += i_163_;
					}
					i_151_ = i_156_;
					i_155_++;
				}
				bool_150_ = true;
			} catch (IOException ioexception) {
				boolean bool_164_ = false;
				return bool_164_;
			}
			return bool_150_;
		}
	}

	boolean method9060(int i, byte[] is, int i_165_, boolean bool) {
		synchronized (aClass20_7281) {
			boolean bool_166_;
			try {
				int i_167_;
				if (bool) {
					if (aClass20_7284.method811((byte) -22) < (long) (6 + i * 6)) {
						boolean bool_168_ = false;
						return bool_168_;
					}
					aClass20_7284.method799((long) (6 * i));
					aClass20_7284.method802(aByteArray7282, 0, 6, (byte) 0);
					i_167_ = (((aByteArray7282[4] & 0xff) << 8) + ((aByteArray7282[3] & 0xff) << 16) + (aByteArray7282[5] & 0xff));
					if (i_167_ <= 0 || ((long) i_167_ > aClass20_7281.method811((byte) -116) / 520L)) {
						boolean bool_169_ = false;
						return bool_169_;
					}
				} else {
					i_167_ = (int) ((aClass20_7281.method811((byte) -48) + 519L) / 520L);
					if (i_167_ == 0)
						i_167_ = 1;
				}
				aByteArray7282[0] = (byte) (i_165_ >> 16);
				aByteArray7282[1] = (byte) (i_165_ >> 8);
				aByteArray7282[2] = (byte) i_165_;
				aByteArray7282[3] = (byte) (i_167_ >> 16);
				aByteArray7282[4] = (byte) (i_167_ >> 8);
				aByteArray7282[5] = (byte) i_167_;
				aClass20_7284.method799((long) (i * 6));
				aClass20_7284.method804(aByteArray7282, 0, 6, (byte) 1);
				int i_170_ = 0;
				int i_171_ = 0;
				while (i_170_ < i_165_) {
					int i_172_ = 0;
					if (bool) {
						aClass20_7281.method799(520L * (long) i_167_);
						int i_173_;
						int i_174_;
						int i_175_;
						if (i > 65535) {
							try {
								aClass20_7281.method802(aByteArray7282, 0, 10, (byte) 0);
							} catch (EOFException eofexception) {
								break;
							}
							i_173_ = ((aByteArray7282[3] & 0xff) + (((aByteArray7282[0] & 0xff) << 24) + ((aByteArray7282[1] & 0xff) << 16) + ((aByteArray7282[2] & 0xff) << 8)));
							i_174_ = (((aByteArray7282[4] & 0xff) << 8) + (aByteArray7282[5] & 0xff));
							i_172_ = (((aByteArray7282[7] & 0xff) << 8) + ((aByteArray7282[6] & 0xff) << 16) + (aByteArray7282[8] & 0xff));
							i_175_ = aByteArray7282[9] & 0xff;
						} else {
							try {
								aClass20_7281.method802(aByteArray7282, 0, 8, (byte) 0);
							} catch (EOFException eofexception) {
								break;
							}
							i_173_ = ((aByteArray7282[1] & 0xff) + ((aByteArray7282[0] & 0xff) << 8));
							i_174_ = (((aByteArray7282[2] & 0xff) << 8) + (aByteArray7282[3] & 0xff));
							i_172_ = (((aByteArray7282[5] & 0xff) << 8) + ((aByteArray7282[4] & 0xff) << 16) + (aByteArray7282[6] & 0xff));
							i_175_ = aByteArray7282[7] & 0xff;
						}
						if (i_173_ != i || i_174_ != i_171_ || -545856487 * anInt7283 != i_175_) {
							boolean bool_176_ = false;
							return bool_176_;
						}
						if (i_172_ < 0 || ((long) i_172_ > (aClass20_7281.method811((byte) -63) / 520L))) {
							boolean bool_177_ = false;
							return bool_177_;
						}
					}
					if (i_172_ == 0) {
						bool = false;
						i_172_ = (int) ((aClass20_7281.method811((byte) -76) + 519L) / 520L);
						if (i_172_ == 0)
							i_172_++;
						if (i_167_ == i_172_)
							i_172_++;
					}
					if (i > 65535) {
						if (i_165_ - i_170_ <= 510)
							i_172_ = 0;
						aByteArray7282[0] = (byte) (i >> 24);
						aByteArray7282[1] = (byte) (i >> 16);
						aByteArray7282[2] = (byte) (i >> 8);
						aByteArray7282[3] = (byte) i;
						aByteArray7282[4] = (byte) (i_171_ >> 8);
						aByteArray7282[5] = (byte) i_171_;
						aByteArray7282[6] = (byte) (i_172_ >> 16);
						aByteArray7282[7] = (byte) (i_172_ >> 8);
						aByteArray7282[8] = (byte) i_172_;
						aByteArray7282[9] = (byte) (-545856487 * anInt7283);
						aClass20_7281.method799(520L * (long) i_167_);
						aClass20_7281.method804(aByteArray7282, 0, 10, (byte) 1);
						int i_178_ = i_165_ - i_170_;
						if (i_178_ > 510)
							i_178_ = 510;
						aClass20_7281.method804(is, i_170_, i_178_, (byte) 1);
						i_170_ += i_178_;
					} else {
						if (i_165_ - i_170_ <= 512)
							i_172_ = 0;
						aByteArray7282[0] = (byte) (i >> 8);
						aByteArray7282[1] = (byte) i;
						aByteArray7282[2] = (byte) (i_171_ >> 8);
						aByteArray7282[3] = (byte) i_171_;
						aByteArray7282[4] = (byte) (i_172_ >> 16);
						aByteArray7282[5] = (byte) (i_172_ >> 8);
						aByteArray7282[6] = (byte) i_172_;
						aByteArray7282[7] = (byte) (-545856487 * anInt7283);
						aClass20_7281.method799(520L * (long) i_167_);
						aClass20_7281.method804(aByteArray7282, 0, 8, (byte) 1);
						int i_179_ = i_165_ - i_170_;
						if (i_179_ > 512)
							i_179_ = 512;
						aClass20_7281.method804(is, i_170_, i_179_, (byte) 1);
						i_170_ += i_179_;
					}
					i_167_ = i_172_;
					i_171_++;
				}
				bool_166_ = true;
			} catch (IOException ioexception) {
				boolean bool_180_ = false;
				return bool_180_;
			}
			return bool_166_;
		}
	}

	static final void method9061(Class669 class669, byte i) {
		int i_181_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		int i_182_ = i_181_ >> 14 & 0x3fff;
		int i_183_ = i_181_ & 0x3fff;
		Class592 class592 = client.aClass505_11019.method8242(55538902);
		i_182_ -= class592.localX * 235453015;
		if (i_182_ < 0)
			i_182_ = 0;
		else if (i_182_ >= client.aClass505_11019.method8292((byte) 34))
			i_182_ = client.aClass505_11019.method8292((byte) 92);
		i_183_ -= class592.localY * 1704054549;
		if (i_183_ < 0)
			i_183_ = 0;
		else if (i_183_ >= client.aClass505_11019.method8235(2077335278))
			i_183_ = client.aClass505_11019.method8235(2102894200);
		client.anInt11283 = (256 + (i_182_ << 9)) * -16665115;
		client.anInt11102 = -405322899 * ((i_183_ << 9) + 256);
		Class562.anInt7564 = -1039341098;
		Class59.anInt755 = 1325954419;
		Class697.anInt8764 = -763239385;
		client.aBool11111 = true;
	}

	static void method9062(Class178 class178, Class250 class250, int i) {
		boolean bool = ((Class523_Sub37.aClass53_Sub8_10677.method17181(class178, -1878986101 * class250.anInt2680, -1263698325 * class250.anInt2681, class250.anInt2564 * -1420827883, ~0xffffff | -728754787 * class250.anInt2565, 1583576215 * class250.anInt2587, (class250.aBool2655 ? Class241.aClass647_Sub1_Sub3_Sub1_Sub2_2453.aClass623_12183 : null), 24901502)) == null);
		if (bool) {
			Class70.aClass708_795.method14236(new Class523_Sub5(-1878986101 * class250.anInt2680, -1263698325 * class250.anInt2681, -1420827883 * class250.anInt2564, ~0xffffff | -728754787 * class250.anInt2565, class250.anInt2587 * 1583576215, class250.aBool2655), -1819237877);
			Class523_Sub14.method15991(class250, (byte) -109);
		}
	}

	public static void method9063(int i) {
		Class19 class19 = Class53_Sub2.method17146("2", client.aClass681_11284.aString8645, true, 1876347403);
		Class423.clientConfigsDomain.method14385(class19, (short) -32768);
	}

	public static String method9064(Class523_Sub27_Sub6 class523_sub27_sub6, byte i) {
		if (Class36.aBool326 || null == class523_sub27_sub6)
			return "";
		int[] is = Class209.method3809(class523_sub27_sub6, 436392865);
		if (is == null)
			return "";
		return Class163.method2593(is, 1773728078);
	}

	public static int method9065(int i, int i_184_, int i_185_, byte i_186_) {
		i_185_ &= 0x3;
		if (i_185_ == 0)
			return i;
		if (i_185_ == 1)
			return i_184_;
		if (2 == i_185_)
			return 4095 - i;
		return 4095 - i_184_;
	}
}
