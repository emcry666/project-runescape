/* Class477 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class477 {
	float aFloat5395;
	int anInt5396;
	int anInt5397;
	int anInt5398;
	float[] aFloatArray5399;
	boolean aBool5400;
	int anInt5401;
	float aFloat5402;
	Interface56 anInterface56_5403;
	int anInt5404;
	int anInt5405;
	int anInt5406;
	int anInt5407;
	Class486[] aClass486Array5408;
	int anInt5409;
	Object anObject5410;
	boolean aBool5411;
	float aFloat5412;
	byte[] aByteArray5413;
	int anInt5414;
	int anInt5415;
	int[] anIntArray5416;
	int[] anIntArray5417;
	int[] anIntArray5418;
	int anInt5419;
	int anInt5420;
	Class479 aClass479_5421;
	Class375 aClass375_5422;
	int anInt5423;
	boolean aBool5424;
	int anInt5425;
	Object anObject5426;
	int anInt5427 = 0;
	int anInt5428 = 0;
	boolean aBool5429;
	Interface42 anInterface42_5430;
	boolean aBool5431;
	long aLong5432;
	Interface58 anInterface58_5433;
	int anInt5434;
	float aFloat5435;
	boolean aBool5436;
	float aFloat5437;
	boolean aBool5438;
	long aLong5439;
	float aFloat5440;
	int anInt5441;
	int anInt5442;
	boolean aBool5443;
	int anInt5444 = 0;
	boolean aBool5445;

	boolean method7770(byte i) {
		synchronized (this) {
			if (anObject5426 != null && anObject5426 instanceof Class489) {
				Class489 class489 = (Class489) anObject5426;
				Interface71 interface71 = class489.method7973(1718315309);
				if (interface71 != null) {
					boolean bool = interface71.method462((short) 12364);
					return bool;
				}
			}
			boolean bool = false;
			return bool;
		}
	}

	public Class479 method7771(short i) {
		return aClass479_5421;
	}

	void method7772(Class479 class479, int i) {
		aClass479_5421 = class479;
	}

	boolean method7773(int i) {
		return aClass479_5421 == Class479.aClass479_5463;
	}

	boolean method7774(byte i) {
		return Class479.aClass479_5457 == aClass479_5421;
	}

	boolean method7775() {
		return aClass479_5421 == Class479.aClass479_5463;
	}

	public void method7776(byte i) {
		if (method7771((short) -1497).anInt5465 * -260556281 < Class479.aClass479_5459.anInt5465 * -260556281)
			throw new RuntimeException("");
		anObject5426 = null;
		method7772(Class479.aClass479_5464, 1685238169);
	}

	void method7777(float f, int i, int i_0_) {
		if (i <= 0) {
			aFloat5412 = f;
			aFloat5437 = aFloat5412;
			aLong5439 = 0L;
			aLong5432 = 0L;
		} else {
			aFloat5440 = aFloat5412;
			aFloat5437 = f;
			aLong5439 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * 4923818137764526633L;
			aLong5432 = ((2293182971238531609L * aLong5439 + (long) i) * -5106198171036733009L);
		}
	}

	float method7778(int i) {
		return aFloat5412;
	}

	void method7779() {
		synchronized (this) {
			method7784((byte) 4);
		}
	}

	void method7780(byte i) {
		synchronized (this) {
			method7784((byte) 4);
		}
	}

	public void method7781(int i) {
		synchronized (this) {
			if (method7771((short) -6644) == Class479.aClass479_5463 || (method7771((short) 2866).anInt5465 * -260556281 < -260556281 * Class479.aClass479_5459.anInt5465)) {
				/* empty */
			} else
				method7772(Class479.aClass479_5463, -1904626454);
		}
	}

	void method7782(Interface58 interface58, int i) {
		anInterface58_5433 = interface58;
		if (null != anInterface58_5433)
			anInterface58_5433.method376(anObject5426, aFloatArray5399, null, (byte) 64);
	}

	boolean method7783(int i) {
		if (null == aFloatArray5399)
			return false;
		float f = 0.0F;
		float f_1_ = 0.0F;
		for (int i_2_ = 0; i_2_ < aFloatArray5399.length; i_2_++) {
			float f_3_ = aFloatArray5399[i_2_];
			if (aFloat5412 * f_3_ > f)
				f = f_3_;
			if (f_3_ > f_1_)
				f_1_ = f_3_;
		}
		if (f < 1.0E-5F) {
			if (f_1_ >= 1.0E-5F && aFloat5437 >= 1.0E-5F)
				return true;
			return false;
		}
		return true;
	}

	void method7784(byte i) {
		if (method7771((short) 8612) != Class479.aClass479_5463 && (method7771((short) 14237).anInt5465 * -260556281 < -260556281 * Class479.aClass479_5461.anInt5465)) {
			method7772(Class479.aClass479_5461, 1147999273);
			aBool5431 = true;
			method7804(-1366936979);
			method7856((byte) 10);
		}
	}

	public void method7785() {
		if (method7771((short) -10896).anInt5465 * -260556281 < Class479.aClass479_5459.anInt5465 * -260556281)
			throw new RuntimeException("");
		anObject5426 = null;
		method7772(Class479.aClass479_5464, -945763405);
	}

	void method7786(float f, byte i) {
		synchronized (this) {
			aFloat5435 = f;
		}
	}

	public Class479 method7787() {
		return aClass479_5421;
	}

	boolean method7788(byte[] is, Interface56 interface56, int i, float f, boolean bool, boolean bool_4_, int i_5_, float f_6_, Object object, byte i_7_) {
		synchronized (this) {
			if (interface56 != null) {
				aByteArray5413 = null;
				anInterface56_5403 = interface56;
			} else
				aByteArray5413 = is;
			anObject5426 = object;
			anInt5396 = i * -463045065;
			aFloat5412 = f;
			aBool5400 = bool_4_;
			anInt5401 = i_5_ * -233570767;
			aFloat5402 = f_6_;
			byte[] is_8_ = null;
			if (null != aByteArray5413)
				is_8_ = aByteArray5413;
			else if (null != anInterface56_5403) {
				anInt5404 = 0;
				is_8_ = anInterface56_5403.method374(-1079740255 * anInt5404, (byte) 1);
			}
			if (null != is_8_) {
				RSBuffer class523_sub34 = new RSBuffer(is_8_);
				if (class523_sub34.readUnsignedByte(583499037) != 74 || class523_sub34.readUnsignedByte(976174980) != 65 || class523_sub34.readUnsignedByte(8989551) != 71 || class523_sub34.readUnsignedByte(-906398833) != 65)
					throw new RuntimeException("");
				anInt5425 = class523_sub34.readUnsignedInt((byte) -4) * -2068877909;
				anInt5405 = class523_sub34.readUnsignedInt((byte) -44) * 97825141;
				anInt5423 = class523_sub34.readUnsignedInt((byte) -18) * 1781593209;
				anInt5414 = class523_sub34.readUnsignedInt((byte) -93) * 490575487;
				anInt5415 = class523_sub34.readUnsignedInt((byte) -59) * -1702643311;
				if (null == anObject5410) {
					anObject5410 = aClass375_5422.method6371(581446015 * anInt5414, 1774925257 * anInt5423, anInterface42_5430.method285(), anInterface42_5430.method314(), anInt5397 * -1477188121, aFloat5402, -1090838185);
					if (null == anObject5410) {
						method7772(Class479.aClass479_5457, 1190877757);
						boolean bool_9_ = false;
						return bool_9_;
					}
				}
				anIntArray5416 = new int[anInt5415 * 909518705];
				anIntArray5417 = new int[anInt5415 * 909518705];
				anIntArray5418 = new int[anInt5415 * 909518705];
				int i_10_ = (-1313784952 * anInt5415 + class523_sub34.offset * 2349011);
				for (int i_11_ = 0; i_11_ < anInt5415 * 909518705; i_11_++) {
					anIntArray5416[i_11_] = i_10_;
					anIntArray5417[i_11_] = class523_sub34.readUnsignedInt((byte) -53);
					anIntArray5418[i_11_] = class523_sub34.readUnsignedInt((byte) -92);
					i_10_ += anIntArray5417[i_11_];
				}
				anInt5419 = class523_sub34.offset * -1748712385;
				aClass486Array5408 = new Class486[anInt5441 * -1574124935];
				aFloatArray5399 = new float[2];
				for (int i_12_ = 0; i_12_ < aFloatArray5399.length; i_12_++)
					aFloatArray5399[i_12_] = 1.0F;
				if (anObject5426 instanceof Class489) {
					Interface71 interface71 = ((Class489) anObject5426).method7973(706027905);
					aBool5429 = interface71.method471(973336891);
					aBool5443 = !aBool5429;
				}
				anInterface42_5430.method293(aBool5443, (aBool5400 ? anInt5401 * -1106994479 : 0), -1119345405 * anInt5425, anInt5405 * 1518327517);
				if (anInterface56_5403 != null) {
					int i_13_ = (class523_sub34.buffer.length - -1860339859 * anInt5419);
					byte[] is_14_ = Class689.method13936(i_13_, true, 2047784069);
					System.arraycopy(class523_sub34.buffer, -1860339859 * anInt5419, is_14_, 0, i_13_);
					class523_sub34.buffer = is_14_;
					class523_sub34.offset = i_13_ * 189765723;
					anInterface42_5430.method63(class523_sub34);
					anInt5404 += 1046702945;
				} else
					aBool5424 = true;
				boolean bool_15_ = true;
				return bool_15_;
			}
			boolean bool_16_ = is_8_ != null;
			return bool_16_;
		}
	}

	void method7789(int i) {
		if (method7771((short) -10125).anInt5465 * -260556281 >= -260556281 * Class479.aClass479_5461.anInt5465) {
			if (method7771((short) -7697) == Class479.aClass479_5464)
				method7816(1219601462);
			else {
				method7790(-254016755);
				if (aFloat5412 != aFloat5437) {
					long l = TimeUtils.getCurrentTimeMilliseconds(1516375036);
					if (l > aLong5432 * -5988738349435665073L)
						aFloat5412 = aFloat5437;
					else {
						float f = aFloat5437 - aFloat5440;
						long l_17_ = (-5988738349435665073L * aLong5432 - 2293182971238531609L * aLong5439);
						float f_18_ = f / (float) l_17_;
						aFloat5412 = f_18_ * (float) (l - (2293182971238531609L * aLong5439)) + aFloat5440;
						aFloat5412 = Math.max(0.0F, Math.min(1.0F, aFloat5412));
					}
				}
				method7856((byte) 10);
				if (method7771((short) 13656).anInt5465 * -260556281 < Class479.aClass479_5463.anInt5465 * -260556281)
					method7804(-1366936979);
			}
		}
	}

	void method7790(int i) {
		synchronized (this) {
			int i_19_ = method7867(1117340336);
			if (aBool5429 && i_19_ > anInt5407 * 702406691 && anInterface42_5430.method291()) {
				/* empty */
			} else {
				Class372 class372 = anInterface42_5430.method282();
				if (aBool5424 && Class372.aClass372_3902 != class372) {
					if (aByteArray5413 != null) {
						if (anInt5442 * 174033627 >= 909518705 * anInt5415) {
							anInterface42_5430.method63(null);
							anInt5442 = 0;
						} else {
							if (anInt5406 * -2087784459 < anInt5419 * -1860339859)
								anInt5406 = 1378686617 * anInt5419;
							anInt5406 = ((anInt5434 * -1614053163 + anIntArray5416[174033627 * anInt5442]) * -551091107);
							int i_20_ = anIntArray5417[anInt5442 * 174033627];
							int i_21_ = i_20_;
							int i_22_ = (anInt5434 * -1614053163 + i_21_ > i_20_ ? (i_20_ + anIntArray5416[anInt5442 * 174033627]) : i_21_ + -2087784459 * anInt5406);
							Class477 class477_23_ = this;
							class477_23_.anInt5434 = (class477_23_.anInt5434 + ((i_21_ + anInt5406 * -2087784459 > aByteArray5413.length) ? (aByteArray5413.length - anInt5406 * -2087784459) : i_21_) * -580536195);
							RSBuffer class523_sub34 = new RSBuffer(i_22_ - (-2087784459 * anInt5406), true);
							if (null == aByteArray5413)
								throw new RuntimeException("");
							if (class523_sub34.buffer == null)
								throw new RuntimeException("");
							class523_sub34.readBytes(aByteArray5413, -2087784459 * anInt5406, i_22_ - (anInt5406 * -2087784459), (short) -19267);
							anInterface42_5430.method63(class523_sub34);
							method7809(false, -976874041);
							if (-1614053163 * anInt5434 >= i_20_) {
								anInt5442 += -401907373;
								anInt5434 = 0;
							}
						}
					} else if (null != anInterface56_5403) {
						if (-1079740255 * anInt5404 >= anInt5415 * 909518705) {
							anInt5404 = 0;
							anInterface42_5430.method63(null);
						} else {
							byte[] is = (anInterface56_5403.method374(anIntArray5418[-1079740255 * anInt5404], (byte) 1));
							if (is != null) {
								RSBuffer class523_sub34 = new RSBuffer(is);
								class523_sub34.offset = 189765723 * is.length;
								anInterface42_5430.method63(class523_sub34);
								method7809(false, -976874041);
								anInt5404 += 1046702945;
							}
						}
					}
				}
			}
		}
	}

	RSBuffer method7791(int i) {
		return anInterface42_5430.method289(i);
	}

	boolean method7792(int i, byte i_24_) {
		if (null != anObject5426 && anObject5426 instanceof Class489) {
			Class489 class489 = (Class489) anObject5426;
			Interface71 interface71 = class489.method7973(1338176481);
			return interface71.method457(i, -1741562750);
		}
		return false;
	}

	public void method7793(int i) {
		synchronized (this) {
			method7789(-537363304);
		}
	}

	void method7794(RSBuffer class523_sub34) {
		if (null != anObject5426 && anObject5426 instanceof Class489) {
			Class489 class489 = (Class489) anObject5426;
			Interface71 interface71 = class489.method7973(1624847952);
			byte[] is = new byte[2349011 * class523_sub34.offset];
			System.arraycopy(class523_sub34.buffer, 0, is, 0, class523_sub34.offset * 2349011);
			RSBuffer class523_sub34_25_ = new RSBuffer(is);
			class523_sub34_25_.offset = class523_sub34.offset * 1;
			interface71.method456(class523_sub34_25_, (short) 18315);
		}
	}

	void method7795(int i) {
		aBool5445 = false;
	}

	void method7796() {
		if (method7771((short) -5726) != Class479.aClass479_5463 && (method7771((short) 12832).anInt5465 * -260556281 < -260556281 * Class479.aClass479_5461.anInt5465)) {
			method7772(Class479.aClass479_5461, -1855454233);
			aBool5431 = true;
			method7804(-1366936979);
			method7856((byte) 10);
		}
	}

	void method7797(int i) {
		if (aClass486Array5408 != null) {
			boolean bool = true;
			Class372 class372 = anInterface42_5430.method282();
			if (anInterface42_5430.method291()) {
				if (aBool5429 && method7792(702406691 * anInt5407, (byte) 120)) {
					if (null == aClass486Array5408[183794387 * anInt5420]) {
						RSBuffer class523_sub34 = method7803(anInt5407 * 702406691, (byte) -35);
						if (class523_sub34 != null) {
							aClass486Array5408[183794387 * anInt5420] = new Class486(this, class523_sub34, false);
							int i_26_ = anInterface42_5430.method321();
							int i_27_ = (anInterface42_5430.method197(2349011 * (aClass486Array5408[183794387 * anInt5420].aClass523_Sub34_5485.offset) / i_26_));
							anInt5428 += i_27_ * 1597189649;
							if (false == aBool5443 && aBool5400 && -2106937721 * anInt5398 > 0) {
								if (anInt5428 * -207781135 < anInt5425 * -1119345405)
									aClass486Array5408[183794387 * anInt5420] = null;
								else if ((anInt5428 * -207781135 >= -1119345405 * anInt5425) && (-207781135 * anInt5428 - i_27_ < -1119345405 * anInt5425))
									aClass486Array5408[183794387 * anInt5420].anInt5486 = ((anInterface42_5430.method290(i_26_ * (anInt5428 * -207781135 - -1119345405 * anInt5425))) * 2060320103);
							}
							anInt5407 += 1102696331;
							if (!aBool5443 && aBool5400 && (anInt5428 * -207781135 >= anInt5405 * 1518327517) && ((-2106937721 * anInt5398 < anInt5401 * -1106994479) || -1106994479 * anInt5401 < 0)) {
								int i_28_ = (anInt5428 * -207781135 - anInt5405 * 1518327517);
								int i_29_ = i_27_ - i_28_;
								aClass486Array5408[183794387 * anInt5420].anInt5487 = (anInterface42_5430.method290(i_29_ * i_26_) * -1362575595);
								anInt5407 = 0;
								anInt5428 = 0;
								anInt5398 += 933148471;
							}
							if (aClass486Array5408[anInt5420 * 183794387] != null) {
								anInt5420 += -785257125;
								anInt5420 = (-785257125 * (183794387 * anInt5420 % aClass486Array5408.length));
							}
						}
					}
				} else if (!method7770((byte) -97) || !aBool5429) {
					int i_30_ = anInterface42_5430.method182();
					int i_31_ = anInterface42_5430.method197(-1477188121 * anInt5397);
					if (!aBool5411 && null == aClass486Array5408[183794387 * anInt5420]) {
						if (class372 != Class372.aClass372_3903 && i_30_ > 0) {
							RSBuffer class523_sub34 = method7821(i_31_, 510988759);
							aClass486Array5408[anInt5420 * 183794387] = (null != class523_sub34 ? new Class486(this, class523_sub34, false) : null);
							int i_32_ = ((aClass486Array5408[anInt5420 * 183794387] != null) ? 2349011 * (aClass486Array5408[183794387 * anInt5420].aClass523_Sub34_5485.offset) : 0);
							int i_33_ = anInterface42_5430.method321();
							int i_34_ = anInterface42_5430.method197(i_32_ / i_33_);
							anInt5444 += 560174659 * i_34_;
							if (anInt5444 * 1847649899 > -207781135 * anInt5428) {
								anInt5428 += 1597189649 * i_34_;
								i_30_ -= i_34_;
								if (!aBool5443 && aBool5400 && -2106937721 * anInt5398 > 0) {
									if (-207781135 * anInt5428 < -1119345405 * anInt5425)
										aClass486Array5408[(anInt5420 * 183794387)] = null;
									else if ((anInt5428 * -207781135 >= anInt5425 * -1119345405) && (-207781135 * anInt5428 - i_34_ < -1119345405 * anInt5425))
										aClass486Array5408[183794387 * anInt5420].anInt5486 = (anInterface42_5430.method290((anInt5428 * -207781135 - anInt5425 * -1119345405) * i_33_)) * 2060320103;
								}
								if (aClass486Array5408[anInt5420 * 183794387] != null) {
									if (aBool5429 && !method7792(702406691 * anInt5407, (byte) 28))
										method7802((aClass486Array5408[183794387 * anInt5420].aClass523_Sub34_5485), 1370816123);
									if (!aBool5443 && aBool5400 && (-207781135 * anInt5428 >= anInt5405 * 1518327517) && ((anInt5398 * -2106937721 <= anInt5401 * -1106994479) || -1106994479 * anInt5401 < 0)) {
										int i_35_ = (anInt5428 * -207781135 - anInt5405 * 1518327517);
										int i_36_ = i_34_ - i_35_;
										aClass486Array5408[183794387 * anInt5420].anInt5487 = (anInterface42_5430.method290(i_33_ * i_36_) * -1362575595);
										anInt5407 = 0;
										anInt5398 += 933148471;
										anInt5428 = 0;
									} else
										anInt5407 += 1102696331;
									anInt5420 += -785257125;
									anInt5420 = (183794387 * anInt5420 % aClass486Array5408.length * -785257125);
								}
							} else
								aClass486Array5408[anInt5420 * 183794387] = null;
						} else if (class372 == Class372.aClass372_3903 && aBool5400 && false == aBool5443 && ((-2106937721 * anInt5398 < anInt5401 * -1106994479) || anInt5401 * -1106994479 < 0))
							anInterface42_5430.method286(true);
					}
				}
			}
			int i_37_ = 0;
			for (int i_38_ = 0; i_38_ < aClass486Array5408.length; i_38_++) {
				if (aClass486Array5408[i_38_] != null) {
					i_37_++;
					bool = false;
				}
			}
			if (!aBool5438 && method7870((byte) 1) >= 0.0F && (i_37_ >= -1574124935 * anInt5441 || Class372.aClass372_3903 == class372 || class372 == Class372.aClass372_3902)) {
				aBool5438 = true;
				method7772(Class479.aClass479_5462, -1424201141);
			}
			if (anInterface42_5430.method291() && bool && (method7770((byte) -73) || aBool5411 || class372 == Class372.aClass372_3903) && (false == aBool5400 || (false == aBool5443 && -2106937721 * anInt5398 >= -1106994479 * anInt5401 && anInt5401 * -1106994479 >= 0))) {
				method7772(Class479.aClass479_5457, -623769590);
				aBool5431 = false;
				if (aBool5429)
					method7798(-2058791428);
			}
		}
	}

	void method7798(int i) {
		synchronized (this) {
			if (null != anObject5426 && anObject5426 instanceof Class489) {
				Class489 class489 = (Class489) anObject5426;
				Interface71 interface71 = class489.method7973(1157491535);
				if (null != interface71)
					interface71.method461(true, (byte) 0);
			}
		}
	}

	boolean method7799() {
		return aClass479_5421 == Class479.aClass479_5463;
	}

	public void method7800(int i) {
		if ((method7771((short) -19625).anInt5465 * -260556281 >= -260556281 * Class479.aClass479_5461.anInt5465) && (method7771((short) -9938).anInt5465 * -260556281 < -260556281 * Class479.aClass479_5463.anInt5465) && method7783(398366172)) {
			synchronized (this) {
				anInterface42_5430.method130();
				method7797(-657239869);
			}
			Thread.yield();
		}
	}

	RSBuffer method7801(int i) {
		return anInterface42_5430.method289(i);
	}

	void method7802(RSBuffer class523_sub34, int i) {
		if (null != anObject5426 && anObject5426 instanceof Class489) {
			Class489 class489 = (Class489) anObject5426;
			Interface71 interface71 = class489.method7973(830013753);
			byte[] is = new byte[2349011 * class523_sub34.offset];
			System.arraycopy(class523_sub34.buffer, 0, is, 0, class523_sub34.offset * 2349011);
			RSBuffer class523_sub34_39_ = new RSBuffer(is);
			class523_sub34_39_.offset = class523_sub34.offset * 1;
			interface71.method456(class523_sub34_39_, (short) 29960);
		}
	}

	RSBuffer method7803(int i, byte i_40_) {
		if (anObject5426 != null && anObject5426 instanceof Class489) {
			Class489 class489 = (Class489) anObject5426;
			Interface71 interface71 = class489.method7973(530101395);
			RSBuffer class523_sub34 = interface71.method469(i, 1550917273);
			RSBuffer class523_sub34_41_ = new RSBuffer(class523_sub34.offset * 2349011, true);
			class523_sub34_41_.method16290(class523_sub34, 1243327788);
			return class523_sub34_41_;
		}
		return null;
	}

	void method7804(int i) {
		if (true == aBool5431 && (method7771((short) 29490).anInt5465 * -260556281 >= -260556281 * Class479.aClass479_5461.anInt5465) && (method7771((short) -3067).anInt5465 * -260556281 < -260556281 * Class479.aClass479_5457.anInt5465) && anInterface58_5433 != null && aFloat5412 == aFloat5437)
			anInterface58_5433.method376(anObject5426, aFloatArray5399, null, (byte) 64);
	}

	public Class477(Class478 class478, int i, int i_42_, Interface42 interface42, Class375 class375) {
		anInt5442 = 0;
		anInt5420 = 0;
		anInt5434 = 0;
		aFloat5437 = 0.0F;
		aLong5432 = 0L;
		aLong5439 = 0L;
		aFloat5440 = 0.0F;
		anInt5407 = 0;
		anInt5398 = 0;
		aClass375_5422 = class375;
		method7772(Class479.aClass479_5458, -1142751841);
		anInt5397 = -1936499241 * i;
		anInt5441 = i_42_ * -346421303;
		anInterface42_5430 = interface42;
		anInt5409 = 0;
		aBool5424 = false;
		anInterface42_5430.method283(new Class495(this));
		method7808(490281547);
	}

	void method7805() {
		if (method7771((short) -25197) != Class479.aClass479_5463 && (method7771((short) -4554).anInt5465 * -260556281 < -260556281 * Class479.aClass479_5461.anInt5465)) {
			method7772(Class479.aClass479_5461, 1800345786);
			aBool5431 = true;
			method7804(-1366936979);
			method7856((byte) 10);
		}
	}

	public boolean method7806(int i) {
		return aBool5436;
	}

	Object method7807(byte i) {
		return anObject5426;
	}

	void method7808(int i) {
		synchronized (this) {
			aByteArray5413 = null;
			anInt5396 = 0;
			aFloat5412 = 0.0F;
			aFloat5395 = 0.0F;
			aBool5400 = false;
			anInt5401 = 0;
			aFloat5402 = 1.0F;
			anInterface56_5403 = null;
			anInt5404 = 0;
			anInt5406 = 0;
			if (aClass486Array5408 != null) {
				for (int i_43_ = 0; i_43_ < aClass486Array5408.length; i_43_++) {
					if (null != aClass486Array5408[i_43_])
						aClass486Array5408[i_43_].method7939(1017685129);
				}
			}
			aClass486Array5408 = null;
			aBool5429 = false;
			anInt5409 = 0;
			anInt5425 = 0;
			anInt5405 = 0;
			anInt5414 = 0;
			anInt5423 = 0;
			anInt5415 = 0;
			anIntArray5416 = null;
			anIntArray5417 = null;
			anIntArray5418 = null;
			anInt5419 = 0;
			aBool5431 = false;
			anInterface42_5430.method292();
			aBool5424 = false;
			anInterface58_5433 = null;
			anObject5426 = null;
			anInt5427 = 0;
			anInt5428 = 0;
			anInt5444 = 0;
			aBool5411 = false;
			anInt5442 = 0;
			anInt5420 = 0;
			aBool5438 = false;
			anInt5434 = 0;
			method7786(-1.0F, (byte) 71);
			aBool5436 = false;
			aFloat5437 = 0.0F;
			aLong5432 = 0L;
			aLong5439 = 0L;
			aFloat5440 = 0.0F;
			anInt5407 = 0;
			anInt5398 = 0;
		}
	}

	void method7809(boolean bool, int i) {
		aBool5424 = bool;
	}

	public Class479 method7810() {
		return aClass479_5421;
	}

	void method7811(Class479 class479) {
		aClass479_5421 = class479;
	}

	void method7812() {
		if (method7771((short) 1089) != Class479.aClass479_5463 && (method7771((short) -3353).anInt5465 * -260556281 < -260556281 * Class479.aClass479_5461.anInt5465)) {
			method7772(Class479.aClass479_5461, 637665333);
			aBool5431 = true;
			method7804(-1366936979);
			method7856((byte) 10);
		}
	}

	void method7813() {
		aBool5445 = false;
	}

	void method7814() {
		aBool5445 = true;
	}

	boolean method7815() {
		return aClass479_5421 == Class479.aClass479_5463;
	}

	void method7816(int i) {
		synchronized (this) {
			if (anInterface42_5430.method282() == Class372.aClass372_3897) {
				if (null != anObject5410) {
					int i_44_ = aClass375_5422.method6350(anObject5410, (byte) -116);
					if (i_44_ >= anInt5397 * -1477188121) {
						aClass375_5422.method6360(anObject5410, (byte) -103);
						anObject5410 = null;
						method7772(Class479.aClass479_5458, -199636392);
					}
				} else
					method7772(Class479.aClass479_5458, 275422589);
			}
		}
		method7808(745821884);
	}

	boolean method7817() {
		return aClass479_5421 == Class479.aClass479_5463;
	}

	boolean method7818() {
		return aClass479_5421 == Class479.aClass479_5463;
	}

	public void method7819() {
		if (method7771((short) 16395).anInt5465 * -260556281 >= -260556281 * Class479.aClass479_5459.anInt5465)
			throw new RuntimeException("");
		method7772(Class479.aClass479_5459, -775328951);
	}

	public float method7820() {
		return aFloat5435;
	}

	RSBuffer method7821(int i, int i_45_) {
		return anInterface42_5430.method289(i);
	}

	public void method7822() {
		if (method7771((short) 9022).anInt5465 * -260556281 < Class479.aClass479_5459.anInt5465 * -260556281)
			throw new RuntimeException("");
		anObject5426 = null;
		method7772(Class479.aClass479_5464, 1945703219);
	}

	void method7823(float f, int i) {
		if (i <= 0) {
			aFloat5412 = f;
			aFloat5437 = aFloat5412;
			aLong5439 = 0L;
			aLong5432 = 0L;
		} else {
			aFloat5440 = aFloat5412;
			aFloat5437 = f;
			aLong5439 = TimeUtils.getCurrentTimeMilliseconds(1516375036) * 4923818137764526633L;
			aLong5432 = ((2293182971238531609L * aLong5439 + (long) i) * -5106198171036733009L);
		}
	}

	float method7824() {
		return aFloat5412;
	}

	void method7825(boolean bool) {
		aBool5424 = bool;
	}

	float method7826() {
		return aFloat5412;
	}

	float method7827() {
		return aFloat5412;
	}

	float method7828() {
		return aFloat5412;
	}

	void method7829() {
		synchronized (this) {
			method7784((byte) 4);
		}
	}

	void method7830() {
		aBool5445 = true;
	}

	public void method7831() {
		synchronized (this) {
			if (method7771((short) -4704) == Class479.aClass479_5463 || (method7771((short) 16984).anInt5465 * -260556281 < -260556281 * Class479.aClass479_5459.anInt5465)) {
				/* empty */
			} else
				method7772(Class479.aClass479_5463, -1806332064);
		}
	}

	void method7832(Interface58 interface58) {
		anInterface58_5433 = interface58;
		if (null != anInterface58_5433)
			anInterface58_5433.method376(anObject5426, aFloatArray5399, null, (byte) 64);
	}

	void method7833(Interface58 interface58) {
		anInterface58_5433 = interface58;
		if (null != anInterface58_5433)
			anInterface58_5433.method376(anObject5426, aFloatArray5399, null, (byte) 64);
	}

	boolean method7834() {
		if (null == aFloatArray5399)
			return false;
		float f = 0.0F;
		float f_46_ = 0.0F;
		for (int i = 0; i < aFloatArray5399.length; i++) {
			float f_47_ = aFloatArray5399[i];
			if (aFloat5412 * f_47_ > f)
				f = f_47_;
			if (f_47_ > f_46_)
				f_46_ = f_47_;
		}
		if (f < 1.0E-5F) {
			if (f_46_ >= 1.0E-5F && aFloat5437 >= 1.0E-5F)
				return true;
			return false;
		}
		return true;
	}

	boolean method7835() {
		if (null == aFloatArray5399)
			return false;
		float f = 0.0F;
		float f_48_ = 0.0F;
		for (int i = 0; i < aFloatArray5399.length; i++) {
			float f_49_ = aFloatArray5399[i];
			if (aFloat5412 * f_49_ > f)
				f = f_49_;
			if (f_49_ > f_48_)
				f_48_ = f_49_;
		}
		if (f < 1.0E-5F) {
			if (f_48_ >= 1.0E-5F && aFloat5437 >= 1.0E-5F)
				return true;
			return false;
		}
		return true;
	}

	void method7836(boolean bool) {
		aBool5424 = bool;
	}

	boolean method7837() {
		if (null == aFloatArray5399)
			return false;
		float f = 0.0F;
		float f_50_ = 0.0F;
		for (int i = 0; i < aFloatArray5399.length; i++) {
			float f_51_ = aFloatArray5399[i];
			if (aFloat5412 * f_51_ > f)
				f = f_51_;
			if (f_51_ > f_50_)
				f_50_ = f_51_;
		}
		if (f < 1.0E-5F) {
			if (f_50_ >= 1.0E-5F && aFloat5437 >= 1.0E-5F)
				return true;
			return false;
		}
		return true;
	}

	void method7838() {
		Class366 class366 = aClass375_5422.method6357((byte) 36).method6333(-1979213945 * anInt5396, -2008725446);
		aFloat5395 = class366 != null ? class366.method6310(-658114355) : 1.0F;
		float f = class366 != null ? class366.method6302(-1091768994) : 0.1F;
		f *= aFloat5412;
		float f_52_ = aFloatArray5399.length > 0 ? 0.0F : 1.0F;
		for (int i = 0; i < aFloatArray5399.length; i++) {
			if (aFloatArray5399[i] > f_52_)
				f_52_ = aFloatArray5399[i];
		}
		f *= f_52_;
		if (!method7783(254804068))
			f = -1.0F;
		if (method7870((byte) 1) != f) {
			method7786(f, (byte) 104);
			aBool5436 = true;
		}
	}

	void method7839() {
		Class366 class366 = aClass375_5422.method6357((byte) 36).method6333(-1979213945 * anInt5396, 2068086791);
		aFloat5395 = class366 != null ? class366.method6310(-658114355) : 1.0F;
		float f = class366 != null ? class366.method6302(-1091768994) : 0.1F;
		f *= aFloat5412;
		float f_53_ = aFloatArray5399.length > 0 ? 0.0F : 1.0F;
		for (int i = 0; i < aFloatArray5399.length; i++) {
			if (aFloatArray5399[i] > f_53_)
				f_53_ = aFloatArray5399[i];
		}
		f *= f_53_;
		if (!method7783(1263438170))
			f = -1.0F;
		if (method7870((byte) 1) != f) {
			method7786(f, (byte) 36);
			aBool5436 = true;
		}
	}

	void method7840() {
		Class366 class366 = aClass375_5422.method6357((byte) 36).method6333(-1979213945 * anInt5396, -1861901347);
		aFloat5395 = class366 != null ? class366.method6310(-658114355) : 1.0F;
		float f = class366 != null ? class366.method6302(-1091768994) : 0.1F;
		f *= aFloat5412;
		float f_54_ = aFloatArray5399.length > 0 ? 0.0F : 1.0F;
		for (int i = 0; i < aFloatArray5399.length; i++) {
			if (aFloatArray5399[i] > f_54_)
				f_54_ = aFloatArray5399[i];
		}
		f *= f_54_;
		if (!method7783(1333878574))
			f = -1.0F;
		if (method7870((byte) 1) != f) {
			method7786(f, (byte) 5);
			aBool5436 = true;
		}
	}

	void method7841() {
		Class366 class366 = aClass375_5422.method6357((byte) 36).method6333(-1979213945 * anInt5396, 1022812702);
		aFloat5395 = class366 != null ? class366.method6310(-658114355) : 1.0F;
		float f = class366 != null ? class366.method6302(-1091768994) : 0.1F;
		f *= aFloat5412;
		float f_55_ = aFloatArray5399.length > 0 ? 0.0F : 1.0F;
		for (int i = 0; i < aFloatArray5399.length; i++) {
			if (aFloatArray5399[i] > f_55_)
				f_55_ = aFloatArray5399[i];
		}
		f *= f_55_;
		if (!method7783(39973659))
			f = -1.0F;
		if (method7870((byte) 1) != f) {
			method7786(f, (byte) 31);
			aBool5436 = true;
		}
	}

	public float method7842() {
		return aFloat5435;
	}

	void method7843() {
		synchronized (this) {
			aByteArray5413 = null;
			anInt5396 = 0;
			aFloat5412 = 0.0F;
			aFloat5395 = 0.0F;
			aBool5400 = false;
			anInt5401 = 0;
			aFloat5402 = 1.0F;
			anInterface56_5403 = null;
			anInt5404 = 0;
			anInt5406 = 0;
			if (aClass486Array5408 != null) {
				for (int i = 0; i < aClass486Array5408.length; i++) {
					if (null != aClass486Array5408[i])
						aClass486Array5408[i].method7939(916613645);
				}
			}
			aClass486Array5408 = null;
			aBool5429 = false;
			anInt5409 = 0;
			anInt5425 = 0;
			anInt5405 = 0;
			anInt5414 = 0;
			anInt5423 = 0;
			anInt5415 = 0;
			anIntArray5416 = null;
			anIntArray5417 = null;
			anIntArray5418 = null;
			anInt5419 = 0;
			aBool5431 = false;
			anInterface42_5430.method292();
			aBool5424 = false;
			anInterface58_5433 = null;
			anObject5426 = null;
			anInt5427 = 0;
			anInt5428 = 0;
			anInt5444 = 0;
			aBool5411 = false;
			anInt5442 = 0;
			anInt5420 = 0;
			aBool5438 = false;
			anInt5434 = 0;
			method7786(-1.0F, (byte) 15);
			aBool5436 = false;
			aFloat5437 = 0.0F;
			aLong5432 = 0L;
			aLong5439 = 0L;
			aFloat5440 = 0.0F;
			anInt5407 = 0;
			anInt5398 = 0;
		}
	}

	void method7844(float f) {
		synchronized (this) {
			aFloat5435 = f;
		}
	}

	float method7845() {
		return aFloat5412;
	}

	public void method7846() {
		synchronized (this) {
			method7789(-612005992);
		}
	}

	boolean method7847() {
		if (null == aFloatArray5399)
			return false;
		float f = 0.0F;
		float f_56_ = 0.0F;
		for (int i = 0; i < aFloatArray5399.length; i++) {
			float f_57_ = aFloatArray5399[i];
			if (aFloat5412 * f_57_ > f)
				f = f_57_;
			if (f_57_ > f_56_)
				f_56_ = f_57_;
		}
		if (f < 1.0E-5F) {
			if (f_56_ >= 1.0E-5F && aFloat5437 >= 1.0E-5F)
				return true;
			return false;
		}
		return true;
	}

	void method7848() {
		synchronized (this) {
			if (anInterface42_5430.method282() == Class372.aClass372_3897) {
				if (null != anObject5410) {
					int i = aClass375_5422.method6350(anObject5410, (byte) -127);
					if (i >= anInt5397 * -1477188121) {
						aClass375_5422.method6360(anObject5410, (byte) -46);
						anObject5410 = null;
						method7772(Class479.aClass479_5458, 219791120);
					}
				} else
					method7772(Class479.aClass479_5458, 875648240);
			}
		}
		method7808(-808325767);
	}

	public void method7849(int i) {
		synchronized (this) {
			if (aBool5445) {
				/* empty */
			} else if (anObject5410 == null) {
				/* empty */
			} else {
				int i_58_ = aClass375_5422.method6350(anObject5410, (byte) -19);
				if (i_58_ <= 0) {
					/* empty */
				} else if (null != aClass486Array5408 && (aClass486Array5408[anInt5409 * 1163138803] != null) && aBool5438) {
					int i_59_ = ((i_58_ + anInt5427 * 1997379697 > (aClass486Array5408[anInt5409 * 1163138803].aClass523_Sub34_5485.offset) * 2349011) ? (2349011 * (aClass486Array5408[1163138803 * anInt5409].aClass523_Sub34_5485.offset) - 1997379697 * anInt5427) : i_58_);
					if (1997379697 * anInt5427 < (aClass486Array5408[1163138803 * anInt5409].anInt5486) * -377827753 && (i_59_ + anInt5427 * 1997379697 > -377827753 * (aClass486Array5408[1163138803 * anInt5409].anInt5486)) && (-377827753 * (aClass486Array5408[anInt5409 * 1163138803].anInt5486) >= 0)) {
						anInt5427 += 350844743 * (aClass486Array5408[anInt5409 * 1163138803].anInt5486) - anInt5427 * 1;
						i_59_ = ((i_58_ + anInt5427 * 1997379697 > (aClass486Array5408[1163138803 * anInt5409].aClass523_Sub34_5485.offset) * 2349011) ? (2349011 * (aClass486Array5408[1163138803 * anInt5409].aClass523_Sub34_5485.offset) - 1997379697 * anInt5427) : i_58_);
					}
					if ((i_59_ + 1997379697 * anInt5427 > -1017210819 * (aClass486Array5408[1163138803 * anInt5409].anInt5487)) && (aClass486Array5408[1163138803 * anInt5409].anInt5487) * -1017210819 >= 0)
						i_59_ = ((aClass486Array5408[anInt5409 * 1163138803].anInt5487) * -1017210819 - anInt5427 * 1997379697);
					method7855((aClass486Array5408[1163138803 * anInt5409].aClass523_Sub34_5485.buffer), anInt5427 * 1997379697, anInt5427 * 1997379697 + i_59_, -1754342502);
					aClass375_5422.method6354(anObject5410, (aClass486Array5408[anInt5409 * 1163138803].aClass523_Sub34_5485.buffer), 1997379697 * anInt5427, i_59_, 1499273479);
					anInt5427 += i_59_ * 2125146257;
					i_58_ -= i_59_;
					if ((1997379697 * anInt5427 >= 2349011 * (aClass486Array5408[1163138803 * anInt5409].aClass523_Sub34_5485.offset)) || ((1997379697 * anInt5427 >= (aClass486Array5408[anInt5409 * 1163138803].anInt5487) * -1017210819) && (aClass486Array5408[1163138803 * anInt5409].anInt5487) * -1017210819 >= 0)) {
						aClass486Array5408[1163138803 * anInt5409].method7939(1826094279);
						aClass486Array5408[anInt5409 * 1163138803] = null;
						anInt5409 += 1570763323;
						anInt5409 = 1570763323 * (1163138803 * anInt5409 % aClass486Array5408.length);
						anInt5427 = 0;
					}
				}
			}
		}
	}

	public void method7850(int i) {
		if (method7771((short) 23271).anInt5465 * -260556281 >= -260556281 * Class479.aClass479_5459.anInt5465)
			throw new RuntimeException("");
		method7772(Class479.aClass479_5459, -1430326929);
	}

	void method7851(boolean bool) {
		aBool5424 = bool;
	}

	void method7852() {
		if (true == aBool5431 && (method7771((short) -18634).anInt5465 * -260556281 >= -260556281 * Class479.aClass479_5461.anInt5465) && (method7771((short) -4310).anInt5465 * -260556281 < -260556281 * Class479.aClass479_5457.anInt5465) && anInterface58_5433 != null && aFloat5412 == aFloat5437)
			anInterface58_5433.method376(anObject5426, aFloatArray5399, null, (byte) 64);
	}

	void method7853() {
		synchronized (this) {
			int i = method7867(-1971334769);
			if (aBool5429 && i > anInt5407 * 702406691 && anInterface42_5430.method291()) {
				/* empty */
			} else {
				Class372 class372 = anInterface42_5430.method282();
				if (aBool5424 && Class372.aClass372_3902 != class372) {
					if (aByteArray5413 != null) {
						if (anInt5442 * 174033627 >= 909518705 * anInt5415) {
							anInterface42_5430.method63(null);
							anInt5442 = 0;
						} else {
							if (anInt5406 * -2087784459 < anInt5419 * -1860339859)
								anInt5406 = 1378686617 * anInt5419;
							anInt5406 = ((anInt5434 * -1614053163 + anIntArray5416[174033627 * anInt5442]) * -551091107);
							int i_60_ = anIntArray5417[anInt5442 * 174033627];
							int i_61_ = i_60_;
							int i_62_ = (anInt5434 * -1614053163 + i_61_ > i_60_ ? (i_60_ + anIntArray5416[anInt5442 * 174033627]) : i_61_ + -2087784459 * anInt5406);
							Class477 class477_63_ = this;
							class477_63_.anInt5434 = (class477_63_.anInt5434 + ((i_61_ + anInt5406 * -2087784459 > aByteArray5413.length) ? (aByteArray5413.length - anInt5406 * -2087784459) : i_61_) * -580536195);
							RSBuffer class523_sub34 = new RSBuffer(i_62_ - (-2087784459 * anInt5406), true);
							if (null == aByteArray5413)
								throw new RuntimeException("");
							if (class523_sub34.buffer == null)
								throw new RuntimeException("");
							class523_sub34.readBytes(aByteArray5413, -2087784459 * anInt5406, i_62_ - (anInt5406 * -2087784459), (short) -15930);
							anInterface42_5430.method63(class523_sub34);
							method7809(false, -976874041);
							if (-1614053163 * anInt5434 >= i_60_) {
								anInt5442 += -401907373;
								anInt5434 = 0;
							}
						}
					} else if (null != anInterface56_5403) {
						if (-1079740255 * anInt5404 >= anInt5415 * 909518705) {
							anInt5404 = 0;
							anInterface42_5430.method63(null);
						} else {
							byte[] is = (anInterface56_5403.method374(anIntArray5418[-1079740255 * anInt5404], (byte) 1));
							if (is != null) {
								RSBuffer class523_sub34 = new RSBuffer(is);
								class523_sub34.offset = 189765723 * is.length;
								anInterface42_5430.method63(class523_sub34);
								method7809(false, -976874041);
								anInt5404 += 1046702945;
							}
						}
					}
				}
			}
		}
	}

	public void method7854() {
		if (method7771((short) -9594).anInt5465 * -260556281 < Class479.aClass479_5459.anInt5465 * -260556281)
			throw new RuntimeException("");
		anObject5426 = null;
		method7772(Class479.aClass479_5464, 1433487069);
	}

	void method7855(byte[] is, int i, int i_64_, int i_65_) {
		int i_66_ = i;
		int i_67_ = 0;
		int i_68_ = anInterface42_5430.method285().anInt4043 * 1552171027;
		while (i_66_ < is.length && i_66_ < i_64_) {
			float f = aFloat5395 * aFloat5412 * aFloatArray5399[i_67_];
			if (i_68_ == 16) {
				int i_69_ = (is[i_66_] & 0xff) + (is[1 + i_66_] << 8);
				i_69_ *= f * f;
				is[i_66_++] = (byte) i_69_;
				is[i_66_++] = (byte) (i_69_ >> 8);
			} else if (8 == i_68_) {
				byte i_70_ = is[i_66_];
				i_70_ *= f;
				is[i_66_++] = i_70_;
			} else
				throw new RuntimeException("");
			i_67_ = ++i_67_ % aFloatArray5399.length;
		}
	}

	void method7856(byte i) {
		Class366 class366 = aClass375_5422.method6357((byte) 36).method6333(-1979213945 * anInt5396, 690466336);
		aFloat5395 = class366 != null ? class366.method6310(-658114355) : 1.0F;
		float f = class366 != null ? class366.method6302(-1091768994) : 0.1F;
		f *= aFloat5412;
		float f_71_ = aFloatArray5399.length > 0 ? 0.0F : 1.0F;
		for (int i_72_ = 0; i_72_ < aFloatArray5399.length; i_72_++) {
			if (aFloatArray5399[i_72_] > f_71_)
				f_71_ = aFloatArray5399[i_72_];
		}
		f *= f_71_;
		if (!method7783(-198873088))
			f = -1.0F;
		if (method7870((byte) 1) != f) {
			method7786(f, (byte) 80);
			aBool5436 = true;
		}
	}

	public void method7857() {
		if ((method7771((short) -20884).anInt5465 * -260556281 >= -260556281 * Class479.aClass479_5461.anInt5465) && (method7771((short) 16866).anInt5465 * -260556281 < -260556281 * Class479.aClass479_5463.anInt5465) && method7783(1401629964)) {
			synchronized (this) {
				anInterface42_5430.method130();
				method7797(-657239869);
			}
			Thread.yield();
		}
	}

	public void method7858() {
		if ((method7771((short) -8016).anInt5465 * -260556281 >= -260556281 * Class479.aClass479_5461.anInt5465) && (method7771((short) -7404).anInt5465 * -260556281 < -260556281 * Class479.aClass479_5463.anInt5465) && method7783(870731812)) {
			synchronized (this) {
				anInterface42_5430.method130();
				method7797(-657239869);
			}
			Thread.yield();
		}
	}

	public void method7859() {
		if ((method7771((short) 5059).anInt5465 * -260556281 >= -260556281 * Class479.aClass479_5461.anInt5465) && (method7771((short) -14917).anInt5465 * -260556281 < -260556281 * Class479.aClass479_5463.anInt5465) && method7783(1578474820)) {
			synchronized (this) {
				anInterface42_5430.method130();
				method7797(-657239869);
			}
			Thread.yield();
		}
	}

	void method7860() {
		if (aClass486Array5408 != null) {
			boolean bool = true;
			Class372 class372 = anInterface42_5430.method282();
			if (anInterface42_5430.method291()) {
				if (aBool5429 && method7792(702406691 * anInt5407, (byte) -64)) {
					if (null == aClass486Array5408[183794387 * anInt5420]) {
						RSBuffer class523_sub34 = method7803(anInt5407 * 702406691, (byte) -63);
						if (class523_sub34 != null) {
							aClass486Array5408[183794387 * anInt5420] = new Class486(this, class523_sub34, false);
							int i = anInterface42_5430.method321();
							int i_73_ = (anInterface42_5430.method197(2349011 * (aClass486Array5408[183794387 * anInt5420].aClass523_Sub34_5485.offset) / i));
							anInt5428 += i_73_ * 1597189649;
							if (false == aBool5443 && aBool5400 && -2106937721 * anInt5398 > 0) {
								if (anInt5428 * -207781135 < anInt5425 * -1119345405)
									aClass486Array5408[183794387 * anInt5420] = null;
								else if ((anInt5428 * -207781135 >= -1119345405 * anInt5425) && (-207781135 * anInt5428 - i_73_ < -1119345405 * anInt5425))
									aClass486Array5408[183794387 * anInt5420].anInt5486 = ((anInterface42_5430.method290(i * (anInt5428 * -207781135 - -1119345405 * anInt5425))) * 2060320103);
							}
							anInt5407 += 1102696331;
							if (!aBool5443 && aBool5400 && (anInt5428 * -207781135 >= anInt5405 * 1518327517) && ((-2106937721 * anInt5398 < anInt5401 * -1106994479) || -1106994479 * anInt5401 < 0)) {
								int i_74_ = (anInt5428 * -207781135 - anInt5405 * 1518327517);
								int i_75_ = i_73_ - i_74_;
								aClass486Array5408[183794387 * anInt5420].anInt5487 = (anInterface42_5430.method290(i_75_ * i) * -1362575595);
								anInt5407 = 0;
								anInt5428 = 0;
								anInt5398 += 933148471;
							}
							if (aClass486Array5408[anInt5420 * 183794387] != null) {
								anInt5420 += -785257125;
								anInt5420 = (-785257125 * (183794387 * anInt5420 % aClass486Array5408.length));
							}
						}
					}
				} else if (!method7770((byte) -36) || !aBool5429) {
					int i = anInterface42_5430.method182();
					int i_76_ = anInterface42_5430.method197(-1477188121 * anInt5397);
					if (!aBool5411 && null == aClass486Array5408[183794387 * anInt5420]) {
						if (class372 != Class372.aClass372_3903 && i > 0) {
							RSBuffer class523_sub34 = method7821(i_76_, 510988759);
							aClass486Array5408[anInt5420 * 183794387] = (null != class523_sub34 ? new Class486(this, class523_sub34, false) : null);
							int i_77_ = ((aClass486Array5408[anInt5420 * 183794387] != null) ? 2349011 * (aClass486Array5408[183794387 * anInt5420].aClass523_Sub34_5485.offset) : 0);
							int i_78_ = anInterface42_5430.method321();
							int i_79_ = anInterface42_5430.method197(i_77_ / i_78_);
							anInt5444 += 560174659 * i_79_;
							if (anInt5444 * 1847649899 > -207781135 * anInt5428) {
								anInt5428 += 1597189649 * i_79_;
								i -= i_79_;
								if (!aBool5443 && aBool5400 && -2106937721 * anInt5398 > 0) {
									if (-207781135 * anInt5428 < -1119345405 * anInt5425)
										aClass486Array5408[(anInt5420 * 183794387)] = null;
									else if ((anInt5428 * -207781135 >= anInt5425 * -1119345405) && (-207781135 * anInt5428 - i_79_ < -1119345405 * anInt5425))
										aClass486Array5408[183794387 * anInt5420].anInt5486 = (anInterface42_5430.method290((anInt5428 * -207781135 - anInt5425 * -1119345405) * i_78_)) * 2060320103;
								}
								if (aClass486Array5408[anInt5420 * 183794387] != null) {
									if (aBool5429 && !method7792(702406691 * anInt5407, (byte) -34))
										method7802((aClass486Array5408[183794387 * anInt5420].aClass523_Sub34_5485), 1370816123);
									if (!aBool5443 && aBool5400 && (-207781135 * anInt5428 >= anInt5405 * 1518327517) && ((anInt5398 * -2106937721 <= anInt5401 * -1106994479) || -1106994479 * anInt5401 < 0)) {
										int i_80_ = (anInt5428 * -207781135 - anInt5405 * 1518327517);
										int i_81_ = i_79_ - i_80_;
										aClass486Array5408[183794387 * anInt5420].anInt5487 = (anInterface42_5430.method290(i_78_ * i_81_) * -1362575595);
										anInt5407 = 0;
										anInt5398 += 933148471;
										anInt5428 = 0;
									} else
										anInt5407 += 1102696331;
									anInt5420 += -785257125;
									anInt5420 = (183794387 * anInt5420 % aClass486Array5408.length * -785257125);
								}
							} else
								aClass486Array5408[anInt5420 * 183794387] = null;
						} else if (class372 == Class372.aClass372_3903 && aBool5400 && false == aBool5443 && ((-2106937721 * anInt5398 < anInt5401 * -1106994479) || anInt5401 * -1106994479 < 0))
							anInterface42_5430.method286(true);
					}
				}
			}
			int i = 0;
			for (int i_82_ = 0; i_82_ < aClass486Array5408.length; i_82_++) {
				if (aClass486Array5408[i_82_] != null) {
					i++;
					bool = false;
				}
			}
			if (!aBool5438 && method7870((byte) 1) >= 0.0F && (i >= -1574124935 * anInt5441 || Class372.aClass372_3903 == class372 || class372 == Class372.aClass372_3902)) {
				aBool5438 = true;
				method7772(Class479.aClass479_5462, 1546491552);
			}
			if (anInterface42_5430.method291() && bool && (method7770((byte) 89) || aBool5411 || class372 == Class372.aClass372_3903) && (false == aBool5400 || (false == aBool5443 && -2106937721 * anInt5398 >= -1106994479 * anInt5401 && anInt5401 * -1106994479 >= 0))) {
				method7772(Class479.aClass479_5457, 2061777364);
				aBool5431 = false;
				if (aBool5429)
					method7798(-2058791428);
			}
		}
	}

	void method7861(float f) {
		synchronized (this) {
			aFloat5435 = f;
		}
	}

	boolean method7862(int i) {
		if (null != anObject5426 && anObject5426 instanceof Class489) {
			Class489 class489 = (Class489) anObject5426;
			Interface71 interface71 = class489.method7973(1767818453);
			return interface71.method457(i, 539404488);
		}
		return false;
	}

	void method7863(byte[] is, int i, int i_83_) {
		int i_84_ = i;
		int i_85_ = 0;
		int i_86_ = anInterface42_5430.method285().anInt4043 * 1552171027;
		while (i_84_ < is.length && i_84_ < i_83_) {
			float f = aFloat5395 * aFloat5412 * aFloatArray5399[i_85_];
			if (i_86_ == 16) {
				int i_87_ = (is[i_84_] & 0xff) + (is[1 + i_84_] << 8);
				i_87_ *= f * f;
				is[i_84_++] = (byte) i_87_;
				is[i_84_++] = (byte) (i_87_ >> 8);
			} else if (8 == i_86_) {
				byte i_88_ = is[i_84_];
				i_88_ *= f;
				is[i_84_++] = i_88_;
			} else
				throw new RuntimeException("");
			i_85_ = ++i_85_ % aFloatArray5399.length;
		}
	}

	void method7864(boolean bool) {
		aBool5424 = bool;
	}

	public void method7865() {
		synchronized (this) {
			if (aBool5445) {
				/* empty */
			} else if (anObject5410 == null) {
				/* empty */
			} else {
				int i = aClass375_5422.method6350(anObject5410, (byte) -107);
				if (i <= 0) {
					/* empty */
				} else if (null != aClass486Array5408 && (aClass486Array5408[anInt5409 * 1163138803] != null) && aBool5438) {
					int i_89_ = ((i + anInt5427 * 1997379697 > (aClass486Array5408[anInt5409 * 1163138803].aClass523_Sub34_5485.offset) * 2349011) ? (2349011 * (aClass486Array5408[1163138803 * anInt5409].aClass523_Sub34_5485.offset) - 1997379697 * anInt5427) : i);
					if (1997379697 * anInt5427 < (aClass486Array5408[1163138803 * anInt5409].anInt5486) * -377827753 && (i_89_ + anInt5427 * 1997379697 > -377827753 * (aClass486Array5408[1163138803 * anInt5409].anInt5486)) && (-377827753 * (aClass486Array5408[anInt5409 * 1163138803].anInt5486) >= 0)) {
						anInt5427 += 350844743 * (aClass486Array5408[anInt5409 * 1163138803].anInt5486) - anInt5427 * 1;
						i_89_ = ((i + anInt5427 * 1997379697 > (aClass486Array5408[1163138803 * anInt5409].aClass523_Sub34_5485.offset) * 2349011) ? (2349011 * (aClass486Array5408[1163138803 * anInt5409].aClass523_Sub34_5485.offset) - 1997379697 * anInt5427) : i);
					}
					if ((i_89_ + 1997379697 * anInt5427 > -1017210819 * (aClass486Array5408[1163138803 * anInt5409].anInt5487)) && (aClass486Array5408[1163138803 * anInt5409].anInt5487) * -1017210819 >= 0)
						i_89_ = ((aClass486Array5408[anInt5409 * 1163138803].anInt5487) * -1017210819 - anInt5427 * 1997379697);
					method7855((aClass486Array5408[1163138803 * anInt5409].aClass523_Sub34_5485.buffer), anInt5427 * 1997379697, anInt5427 * 1997379697 + i_89_, -1691384260);
					aClass375_5422.method6354(anObject5410, (aClass486Array5408[anInt5409 * 1163138803].aClass523_Sub34_5485.buffer), 1997379697 * anInt5427, i_89_, 397721683);
					anInt5427 += i_89_ * 2125146257;
					i -= i_89_;
					if ((1997379697 * anInt5427 >= 2349011 * (aClass486Array5408[1163138803 * anInt5409].aClass523_Sub34_5485.offset)) || ((1997379697 * anInt5427 >= (aClass486Array5408[anInt5409 * 1163138803].anInt5487) * -1017210819) && (aClass486Array5408[1163138803 * anInt5409].anInt5487) * -1017210819 >= 0)) {
						aClass486Array5408[1163138803 * anInt5409].method7939(1101297285);
						aClass486Array5408[anInt5409 * 1163138803] = null;
						anInt5409 += 1570763323;
						anInt5409 = 1570763323 * (1163138803 * anInt5409 % aClass486Array5408.length);
						anInt5427 = 0;
					}
				}
			}
		}
	}

	void method7866() {
		aBool5445 = true;
	}

	int method7867(int i) {
		if (null != anObject5426 && anObject5426 instanceof Class489) {
			Class489 class489 = (Class489) anObject5426;
			Interface71 interface71 = class489.method7973(433096646);
			return interface71.method460(16711935);
		}
		return 0;
	}

	RSBuffer method7868(int i) {
		return anInterface42_5430.method289(i);
	}

	RSBuffer method7869(int i) {
		return anInterface42_5430.method289(i);
	}

	public float method7870(byte i) {
		return aFloat5435;
	}

	void method7871(Class479 class479) {
		aClass479_5421 = class479;
	}

	void method7872(RSBuffer class523_sub34) {
		if (null != anObject5426 && anObject5426 instanceof Class489) {
			Class489 class489 = (Class489) anObject5426;
			Interface71 interface71 = class489.method7973(2116351221);
			byte[] is = new byte[2349011 * class523_sub34.offset];
			System.arraycopy(class523_sub34.buffer, 0, is, 0, class523_sub34.offset * 2349011);
			RSBuffer class523_sub34_90_ = new RSBuffer(is);
			class523_sub34_90_.offset = class523_sub34.offset * 1;
			interface71.method456(class523_sub34_90_, (short) 12557);
		}
	}

	void method7873(RSBuffer class523_sub34) {
		if (null != anObject5426 && anObject5426 instanceof Class489) {
			Class489 class489 = (Class489) anObject5426;
			Interface71 interface71 = class489.method7973(748610651);
			byte[] is = new byte[2349011 * class523_sub34.offset];
			System.arraycopy(class523_sub34.buffer, 0, is, 0, class523_sub34.offset * 2349011);
			RSBuffer class523_sub34_91_ = new RSBuffer(is);
			class523_sub34_91_.offset = class523_sub34.offset * 1;
			interface71.method456(class523_sub34_91_, (short) 12302);
		}
	}

	RSBuffer method7874(int i) {
		if (anObject5426 != null && anObject5426 instanceof Class489) {
			Class489 class489 = (Class489) anObject5426;
			Interface71 interface71 = class489.method7973(1131543938);
			RSBuffer class523_sub34 = interface71.method469(i, -25068289);
			RSBuffer class523_sub34_92_ = new RSBuffer(class523_sub34.offset * 2349011, true);
			class523_sub34_92_.method16290(class523_sub34, -2027572851);
			return class523_sub34_92_;
		}
		return null;
	}

	RSBuffer method7875(int i) {
		if (anObject5426 != null && anObject5426 instanceof Class489) {
			Class489 class489 = (Class489) anObject5426;
			Interface71 interface71 = class489.method7973(1406772136);
			RSBuffer class523_sub34 = interface71.method469(i, 25116522);
			RSBuffer class523_sub34_93_ = new RSBuffer(class523_sub34.offset * 2349011, true);
			class523_sub34_93_.method16290(class523_sub34, -2099520745);
			return class523_sub34_93_;
		}
		return null;
	}

	boolean method7876(int i) {
		if (null != anObject5426 && anObject5426 instanceof Class489) {
			Class489 class489 = (Class489) anObject5426;
			Interface71 interface71 = class489.method7973(2116214993);
			return interface71.method457(i, -273573654);
		}
		return false;
	}

	void method7877(Class479 class479) {
		aClass479_5421 = class479;
	}

	int method7878() {
		if (null != anObject5426 && anObject5426 instanceof Class489) {
			Class489 class489 = (Class489) anObject5426;
			Interface71 interface71 = class489.method7973(1379020816);
			return interface71.method460(16711935);
		}
		return 0;
	}

	int method7879() {
		if (null != anObject5426 && anObject5426 instanceof Class489) {
			Class489 class489 = (Class489) anObject5426;
			Interface71 interface71 = class489.method7973(2049345204);
			return interface71.method460(16711935);
		}
		return 0;
	}

	int method7880() {
		if (null != anObject5426 && anObject5426 instanceof Class489) {
			Class489 class489 = (Class489) anObject5426;
			Interface71 interface71 = class489.method7973(2143195419);
			return interface71.method460(16711935);
		}
		return 0;
	}

	boolean method7881() {
		synchronized (this) {
			if (anObject5426 != null && anObject5426 instanceof Class489) {
				Class489 class489 = (Class489) anObject5426;
				Interface71 interface71 = class489.method7973(550387072);
				if (interface71 != null) {
					boolean bool = interface71.method462((short) 29853);
					return bool;
				}
			}
			boolean bool = false;
			return bool;
		}
	}

	boolean method7882() {
		synchronized (this) {
			if (anObject5426 != null && anObject5426 instanceof Class489) {
				Class489 class489 = (Class489) anObject5426;
				Interface71 interface71 = class489.method7973(916611045);
				if (interface71 != null) {
					boolean bool = interface71.method462((short) 13403);
					return bool;
				}
			}
			boolean bool = false;
			return bool;
		}
	}

	void method7883() {
		synchronized (this) {
			if (null != anObject5426 && anObject5426 instanceof Class489) {
				Class489 class489 = (Class489) anObject5426;
				Interface71 interface71 = class489.method7973(796290029);
				if (null != interface71)
					interface71.method461(true, (byte) 0);
			}
		}
	}

	void method7884() {
		synchronized (this) {
			if (null != anObject5426 && anObject5426 instanceof Class489) {
				Class489 class489 = (Class489) anObject5426;
				Interface71 interface71 = class489.method7973(938225347);
				if (null != interface71)
					interface71.method461(true, (byte) 0);
			}
		}
	}

	Object method7885() {
		return anObject5426;
	}

	void method7886(short i) {
		aBool5445 = true;
	}

	static final void method7887(Class669 class669, int i) {
		int i_94_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class98_Sub1_Sub2.playerVarsProvider.method1936(i_94_, -392919727);
	}

	static final void method7888(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	static final void method7889(InterfaceComponentDefinitions class250, Class242 class242, Class669 class669, byte i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		if (Class594.method9807(string, class669, (byte) 0) != null)
			string = string.substring(0, string.length() - 1);
		class250.anObjectArray2705 = Class78.method1554(string, class669, -68449792);
		class250.aBool2635 = true;
	}

	static String method7890(long l, int i, int i_95_) {
		Class17.method776(l);
		int i_96_ = Class91.aCalendar893.get(5);
		int i_97_ = Class91.aCalendar893.get(2) + 1;
		int i_98_ = Class91.aCalendar893.get(1);
		return new StringBuilder().append(Integer.toString(i_96_ / 10)).append(i_96_ % 10).append("/").append(i_97_ / 10).append(i_97_ % 10).append("/").append(i_98_ % 100 / 10).append(i_98_ % 10).toString();
	}
}
