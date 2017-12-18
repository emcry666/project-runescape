/* Class149_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.EOFException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class Class149_Sub1 extends Class149 {
	Set aSet8902;
	public boolean aBool8903 = false;
	public long aLong8904 = -8792460426006770217L;
	boolean aBool8905 = false;
	long aLong8906 = 8924321158575988423L;
	static final int anInt8907 = 1;
	Class426[] aClass426Array8908;
	int anInt8909 = 0;
	Class461[] aClass461Array8910;

	public void method118(Class159 class159, Object object) {
		if (aClass461Array8910[-80020449 * class159.anInt1754] == Class461.aClass461_5117)
			aBool8903 = true;
		else if (aClass461Array8910[-80020449 * class159.anInt1754] == Class461.aClass461_5119) {
			if (object instanceof String) {
				String string = (String) object;
				if (string.length() > 80)
					object = string.substring(0, 80);
			}
			Object object_0_ = method119(class159, 1019971441);
			if (object != null && null != object_0_ && !object.equals(object_0_)) {
				aBool8905 = true;
				aSet8902.add(Integer.valueOf(class159.anInt1754 * -80020449));
			} else if ((object == null) != (null == object_0_)) {
				aBool8905 = true;
				aSet8902.add(Integer.valueOf(class159.anInt1754 * -80020449));
			}
		}
		super.method116(class159, object, -634260687);
	}

	public void method112(Class159 class159, int i, byte i_1_) {
		if (aClass461Array8910[-80020449 * class159.anInt1754] == Class461.aClass461_5117)
			aBool8903 = true;
		else if ((Class461.aClass461_5119 == aClass461Array8910[-80020449 * class159.anInt1754]) && method94(class159, 758754466) != i) {
			aBool8905 = true;
			aSet8902.add(Integer.valueOf(class159.anInt1754 * -80020449));
		}
		super.method112(class159, i, (byte) 75);
	}

	public void method114(Class159 class159, long l) {
		if (Class461.aClass461_5117 == aClass461Array8910[-80020449 * class159.anInt1754])
			aBool8903 = true;
		else if ((aClass461Array8910[class159.anInt1754 * -80020449] == Class461.aClass461_5119) && method111(class159, (byte) 110) != l) {
			aBool8905 = true;
			aSet8902.add(Integer.valueOf(class159.anInt1754 * -80020449));
		}
		super.method114(class159, l);
	}

	public void method116(Class159 class159, Object object, int i) {
		if (aClass461Array8910[-80020449 * class159.anInt1754] == Class461.aClass461_5117)
			aBool8903 = true;
		else if (aClass461Array8910[-80020449 * class159.anInt1754] == Class461.aClass461_5119) {
			if (object instanceof String) {
				String string = (String) object;
				if (string.length() > 80)
					object = string.substring(0, 80);
			}
			Object object_2_ = method119(class159, 1019971441);
			if (object != null && null != object_2_ && !object.equals(object_2_)) {
				aBool8905 = true;
				aSet8902.add(Integer.valueOf(class159.anInt1754 * -80020449));
			} else if ((object == null) != (null == object_2_)) {
				aBool8905 = true;
				aSet8902.add(Integer.valueOf(class159.anInt1754 * -80020449));
			}
		}
		super.method116(class159, object, -1142092487);
	}

	public Class149_Sub1(Class98_Sub1 class98_sub1) {
		super(class98_sub1);
		aClass461Array8910 = new Class461[class98_sub1.method69(-1320075369)];
		for (int i = 0; i < class98_sub1.method69(-1954298140); i++)
			aClass461Array8910[i] = (((Class159) class98_sub1.getDefinition(i, (byte) -58)).aClass461_1757);
		aSet8902 = new HashSet(class98_sub1.method69(-1443988776));
	}

	public void method14383(byte i) {
		anInt8909 = 0;
	}

	public void method14384(Class19 class19, byte i) {
		do {
			try {
				try {
					byte[] is = new byte[(int) class19.method795(126924997)];
					int i_3_;
					for (int i_4_ = 0; i_4_ < is.length; i_4_ += i_3_) {
						i_3_ = class19.method784(is, i_4_, is.length - i_4_, (byte) 16);
						if (i_3_ == -1)
							throw new EOFException();
					}
					Class523_Sub34 class523_sub34 = new Class523_Sub34(is);
					if ((class523_sub34.aByteArray10658.length - class523_sub34.anInt10661 * 2349011) < 1) {
						try {
							class19.method786(2017625742);
						} catch (Exception exception) {
							/* empty */
						}
						break;
					}
					int i_5_ = class523_sub34.readUnsignedByte(1154306430);
					if (i_5_ < 0 || i_5_ > 1) {
						try {
							class19.method786(2112047169);
						} catch (Exception exception) {
							/* empty */
						}
						break;
					}
					if ((class523_sub34.aByteArray10658.length - 2349011 * class523_sub34.anInt10661) < 2) {
						try {
							class19.method786(1590091830);
						} catch (Exception exception) {
							/* empty */
						}
						break;
					}
					int i_6_ = class523_sub34.readUnsignedShort(-1306980012);
					if ((class523_sub34.aByteArray10658.length - class523_sub34.anInt10661 * 2349011) < 6 * i_6_) {
						try {
							class19.method786(1519743771);
						} catch (Exception exception) {
							/* empty */
						}
						break;
					}
					for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
						Class426 class426 = Class114.aClass98_Sub1_Sub2_1405.refreshNIS(class523_sub34, -1401062796);
						if ((Class461.aClass461_5117 == (aClass461Array8910[-408785679 * class426.anInt4821])) && (((Class159) (Class114.aClass98_Sub1_Sub2_1405.getDefinition(class426.anInt4821 * -408785679, (byte) -9))).aClass464_1756.method7527(2140732327).aClass5388.isAssignableFrom(class426.anObject4822.getClass())))
							anInterface2_1714.method14((-408785679 * class426.anInt4821), class426.anObject4822, -1960828008);
					}
				} catch (Exception exception) {
					try {
						class19.method786(1277734956);
					} catch (Exception exception_8_) {
						exception = exception_8_;
					}
					break;
				}
				try {
					class19.method786(1902741756);
				} catch (Exception exception) {
					/* empty */
				}
			} catch (Exception object) {
				try {
					class19.method786(1808300658);
				} catch (Exception exception) {
					/* empty */
				}
				throw object;
			}
		} while (false);
	}

	public void method14385(Class19 class19, short i) {
		do {
			try {
				try {
					int i_9_ = 3;
					int i_10_ = 0;
					Iterator iterator = anInterface2_1714.iterator();
					while (iterator.hasNext()) {
						Class426 class426 = (Class426) iterator.next();
						if (Class461.aClass461_5117 == (aClass461Array8910[class426.anInt4821 * -408785679])) {
							i_9_ += Class114.aClass98_Sub1_Sub2_1405.method14342(class426, 1963975858);
							i_10_++;
						}
					}
					Class523_Sub34 class523_sub34 = new Class523_Sub34(i_9_);
					class523_sub34.writeByte(1, -956303323);
					class523_sub34.writeShort(i_10_, (byte) -23);
					Iterator iterator_11_ = anInterface2_1714.iterator();
					while (iterator_11_.hasNext()) {
						Class426 class426 = (Class426) iterator_11_.next();
						if (Class461.aClass461_5117 == (aClass461Array8910[-408785679 * class426.anInt4821]))
							Class114.aClass98_Sub1_Sub2_1405.method14341(class523_sub34, class426, (byte) 4);
					}
					class19.method782(class523_sub34.aByteArray10658, 0, 2349011 * class523_sub34.anInt10661, 1357652815);
				} catch (Exception exception) {
					try {
						class19.method786(1868426866);
					} catch (Exception exception_12_) {
						exception = exception_12_;
					}
					break;
				}
				try {
					class19.method786(1995158195);
				} catch (Exception exception) {
					/* empty */
				}
			} catch (Exception object) {
				try {
					class19.method786(1759278468);
				} catch (Exception exception) {
					/* empty */
				}
				throw object;
			}
		} while (false);
		aLong8904 = Class248.method4401(1516375036) * 8792460426006770217L;
		aBool8903 = false;
	}

	public void method14386(byte i) {
		if (Class248.method4401(1516375036) >= aLong8906 * -516099212067259127L) {
			if (aClass426Array8908 == null) {
				if (!aBool8905)
					return;
				aClass426Array8908 = new Class426[aSet8902.size()];
				int i_13_ = 0;
				Iterator iterator = aSet8902.iterator();
				while (iterator.hasNext()) {
					int i_14_ = ((Integer) iterator.next()).intValue();
					aClass426Array8908[i_13_++] = new Class426(i_14_, anInterface2_1714.method13(i_14_, 1959888576));
				}
				anInt8909 = 0;
				aBool8905 = false;
				aSet8902.clear();
			}
			if (null != aClass426Array8908 && anInt8909 * -1092729361 < aClass426Array8908.length) {
				Class116 class116 = Class537.method8941(-1677478992);
				if (class116.anInt1415 * -1660026723 <= 1200) {
					Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4250, class116.aClass11_1413, 1370050649);
					class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(0, (byte) -42);
					int i_15_ = 2349011 * (class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661);
					class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661 += 189765723;
					for (/**/; anInt8909 * -1092729361 < aClass426Array8908.length; anInt8909 += 1883474191) {
						Class426 class426 = aClass426Array8908[-1092729361 * anInt8909];
						if ((-1660026723 * class116.anInt1415 + (class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661) * 2349011 + Class114.aClass98_Sub1_Sub2_1405.method14342(class426, 1963975858)) > 1500)
							break;
						Class114.aClass98_Sub1_Sub2_1405.method14341(class523_sub22.aClass523_Sub34_Sub2_10525, class426, (byte) 4);
					}
					class523_sub22.aClass523_Sub34_Sub2_10525.method16275(2349011 * (class523_sub22.aClass523_Sub34_Sub2_10525.anInt10661) - i_15_, -1030357736);
					if (-1092729361 * anInt8909 >= aClass426Array8908.length)
						class523_sub22.aClass523_Sub34_Sub2_10525.aByteArray10658[i_15_] = (byte) 1;
					else
						class523_sub22.aClass523_Sub34_Sub2_10525.aByteArray10658[i_15_] = (byte) 0;
					class116.method1974(class523_sub22, (byte) 79);
					aLong8906 = ((Class248.method4401(1516375036) + 1000L) * -8924321158575988423L);
				}
			}
		}
	}

	public void method14387(int i) {
		if (aClass426Array8908 != null && anInt8909 * -1092729361 >= aClass426Array8908.length) {
			aClass426Array8908 = null;
			anInt8909 = 0;
		}
	}

	public void method14388(Class19 class19) {
		do {
			try {
				try {
					int i = 3;
					int i_16_ = 0;
					Iterator iterator = anInterface2_1714.iterator();
					while (iterator.hasNext()) {
						Class426 class426 = (Class426) iterator.next();
						if (Class461.aClass461_5117 == (aClass461Array8910[class426.anInt4821 * -408785679])) {
							i += Class114.aClass98_Sub1_Sub2_1405.method14342(class426, 1963975858);
							i_16_++;
						}
					}
					Class523_Sub34 class523_sub34 = new Class523_Sub34(i);
					class523_sub34.writeByte(1, 526740640);
					class523_sub34.writeShort(i_16_, (byte) -8);
					Iterator iterator_17_ = anInterface2_1714.iterator();
					while (iterator_17_.hasNext()) {
						Class426 class426 = (Class426) iterator_17_.next();
						if (Class461.aClass461_5117 == (aClass461Array8910[-408785679 * class426.anInt4821]))
							Class114.aClass98_Sub1_Sub2_1405.method14341(class523_sub34, class426, (byte) 4);
					}
					class19.method782(class523_sub34.aByteArray10658, 0, 2349011 * class523_sub34.anInt10661, 1357652815);
				} catch (Exception exception) {
					try {
						class19.method786(1817541797);
					} catch (Exception exception_18_) {
						exception = exception_18_;
					}
					break;
				}
				try {
					class19.method786(1641179844);
				} catch (Exception exception) {
					/* empty */
				}
			} catch (Exception object) {
				try {
					class19.method786(1856651408);
				} catch (Exception exception) {
					/* empty */
				}
				throw object;
			}
		} while (false);
		aLong8904 = Class248.method4401(1516375036) * 8792460426006770217L;
		aBool8903 = false;
	}

	public void method128(Class159 class159, int i) {
		if (aClass461Array8910[-80020449 * class159.anInt1754] == Class461.aClass461_5117)
			aBool8903 = true;
		else if ((Class461.aClass461_5119 == aClass461Array8910[-80020449 * class159.anInt1754]) && method94(class159, -697083431) != i) {
			aBool8905 = true;
			aSet8902.add(Integer.valueOf(class159.anInt1754 * -80020449));
		}
		super.method112(class159, i, (byte) 77);
	}

	public void method14389(Class19 class19) {
		do {
			try {
				try {
					byte[] is = new byte[(int) class19.method795(-1291167265)];
					int i;
					for (int i_19_ = 0; i_19_ < is.length; i_19_ += i) {
						i = class19.method784(is, i_19_, is.length - i_19_, (byte) 16);
						if (i == -1)
							throw new EOFException();
					}
					Class523_Sub34 class523_sub34 = new Class523_Sub34(is);
					if ((class523_sub34.aByteArray10658.length - class523_sub34.anInt10661 * 2349011) < 1) {
						try {
							class19.method786(1788075839);
						} catch (Exception exception) {
							/* empty */
						}
						break;
					}
					int i_20_ = class523_sub34.readUnsignedByte(-1487784144);
					if (i_20_ < 0 || i_20_ > 1) {
						try {
							class19.method786(1719880526);
						} catch (Exception exception) {
							/* empty */
						}
						break;
					}
					if ((class523_sub34.aByteArray10658.length - 2349011 * class523_sub34.anInt10661) < 2) {
						try {
							class19.method786(1551494814);
						} catch (Exception exception) {
							/* empty */
						}
						break;
					}
					int i_21_ = class523_sub34.readUnsignedShort(-39015950);
					if ((class523_sub34.aByteArray10658.length - class523_sub34.anInt10661 * 2349011) < 6 * i_21_) {
						try {
							class19.method786(1710047731);
						} catch (Exception exception) {
							/* empty */
						}
						break;
					}
					for (int i_22_ = 0; i_22_ < i_21_; i_22_++) {
						Class426 class426 = Class114.aClass98_Sub1_Sub2_1405.refreshNIS(class523_sub34, -1702679431);
						if ((Class461.aClass461_5117 == (aClass461Array8910[-408785679 * class426.anInt4821])) && (((Class159) (Class114.aClass98_Sub1_Sub2_1405.getDefinition(class426.anInt4821 * -408785679, (byte) -107))).aClass464_1756.method7527(2139620507).aClass5388.isAssignableFrom(class426.anObject4822.getClass())))
							anInterface2_1714.method14((-408785679 * class426.anInt4821), class426.anObject4822, -1363612529);
					}
				} catch (Exception exception) {
					try {
						class19.method786(1179820188);
					} catch (Exception exception_23_) {
						exception = exception_23_;
					}
					break;
				}
				try {
					class19.method786(1232231066);
				} catch (Exception exception) {
					/* empty */
				}
			} catch (Exception object) {
				try {
					class19.method786(2119696656);
				} catch (Exception exception) {
					/* empty */
				}
				throw object;
			}
		} while (false);
	}

	public void method14390() {
		anInt8909 = 0;
	}

	public void method126(Class159 class159, int i) {
		if (aClass461Array8910[-80020449 * class159.anInt1754] == Class461.aClass461_5117)
			aBool8903 = true;
		else if ((Class461.aClass461_5119 == aClass461Array8910[-80020449 * class159.anInt1754]) && method94(class159, -36314405) != i) {
			aBool8905 = true;
			aSet8902.add(Integer.valueOf(class159.anInt1754 * -80020449));
		}
		super.method112(class159, i, (byte) -62);
	}

	public void method115(Class159 class159, long l) {
		if (Class461.aClass461_5117 == aClass461Array8910[-80020449 * class159.anInt1754])
			aBool8903 = true;
		else if ((aClass461Array8910[class159.anInt1754 * -80020449] == Class461.aClass461_5119) && method111(class159, (byte) 109) != l) {
			aBool8905 = true;
			aSet8902.add(Integer.valueOf(class159.anInt1754 * -80020449));
		}
		super.method114(class159, l);
	}

	public void method113(Class159 class159, Object object) {
		if (aClass461Array8910[-80020449 * class159.anInt1754] == Class461.aClass461_5117)
			aBool8903 = true;
		else if (aClass461Array8910[-80020449 * class159.anInt1754] == Class461.aClass461_5119) {
			if (object instanceof String) {
				String string = (String) object;
				if (string.length() > 80)
					object = string.substring(0, 80);
			}
			Object object_24_ = method119(class159, 1019971441);
			if (object != null && null != object_24_ && !object.equals(object_24_)) {
				aBool8905 = true;
				aSet8902.add(Integer.valueOf(class159.anInt1754 * -80020449));
			} else if ((object == null) != (null == object_24_)) {
				aBool8905 = true;
				aSet8902.add(Integer.valueOf(class159.anInt1754 * -80020449));
			}
		}
		super.method116(class159, object, 1088074258);
	}

	public void method14391() {
		for (int i = 0; i < aClass461Array8910.length; i++) {
			if (Class461.aClass461_5118 == aClass461Array8910[i] || aClass461Array8910[i] == Class461.aClass461_5119)
				anInterface2_1714.method16(i, -1047358491);
		}
		aSet8902.clear();
		aBool8905 = false;
		aClass426Array8908 = null;
		aLong8906 = 8924321158575988423L;
	}

	public void method124(Class159 class159, long l) {
		if (Class461.aClass461_5117 == aClass461Array8910[-80020449 * class159.anInt1754])
			aBool8903 = true;
		else if ((aClass461Array8910[class159.anInt1754 * -80020449] == Class461.aClass461_5119) && method111(class159, (byte) -17) != l) {
			aBool8905 = true;
			aSet8902.add(Integer.valueOf(class159.anInt1754 * -80020449));
		}
		super.method114(class159, l);
	}

	public void method14392(Class19 class19) {
		do {
			try {
				try {
					byte[] is = new byte[(int) class19.method795(1369585945)];
					int i;
					for (int i_25_ = 0; i_25_ < is.length; i_25_ += i) {
						i = class19.method784(is, i_25_, is.length - i_25_, (byte) 16);
						if (i == -1)
							throw new EOFException();
					}
					Class523_Sub34 class523_sub34 = new Class523_Sub34(is);
					if ((class523_sub34.aByteArray10658.length - class523_sub34.anInt10661 * 2349011) < 1) {
						try {
							class19.method786(1190555458);
						} catch (Exception exception) {
							/* empty */
						}
						break;
					}
					int i_26_ = class523_sub34.readUnsignedByte(1832486399);
					if (i_26_ < 0 || i_26_ > 1) {
						try {
							class19.method786(1901030033);
						} catch (Exception exception) {
							/* empty */
						}
						break;
					}
					if ((class523_sub34.aByteArray10658.length - 2349011 * class523_sub34.anInt10661) < 2) {
						try {
							class19.method786(1457310306);
						} catch (Exception exception) {
							/* empty */
						}
						break;
					}
					int i_27_ = class523_sub34.readUnsignedShort(-1396769618);
					if ((class523_sub34.aByteArray10658.length - class523_sub34.anInt10661 * 2349011) < 6 * i_27_) {
						try {
							class19.method786(1335698574);
						} catch (Exception exception) {
							/* empty */
						}
						break;
					}
					for (int i_28_ = 0; i_28_ < i_27_; i_28_++) {
						Class426 class426 = Class114.aClass98_Sub1_Sub2_1405.refreshNIS(class523_sub34, 689077760);
						if ((Class461.aClass461_5117 == (aClass461Array8910[-408785679 * class426.anInt4821])) && (((Class159) (Class114.aClass98_Sub1_Sub2_1405.getDefinition(class426.anInt4821 * -408785679, (byte) 7))).aClass464_1756.method7527(2142282673).aClass5388.isAssignableFrom(class426.anObject4822.getClass())))
							anInterface2_1714.method14((-408785679 * class426.anInt4821), class426.anObject4822, -2105761402);
					}
				} catch (Exception exception) {
					try {
						class19.method786(1762761031);
					} catch (Exception exception_29_) {
						exception = exception_29_;
					}
					break;
				}
				try {
					class19.method786(1734847817);
				} catch (Exception exception) {
					/* empty */
				}
			} catch (Exception object) {
				try {
					class19.method786(2005146786);
				} catch (Exception exception) {
					/* empty */
				}
				throw object;
			}
		} while (false);
	}

	public void method123(Class159 class159, long l) {
		if (Class461.aClass461_5117 == aClass461Array8910[-80020449 * class159.anInt1754])
			aBool8903 = true;
		else if ((aClass461Array8910[class159.anInt1754 * -80020449] == Class461.aClass461_5119) && method111(class159, (byte) -3) != l) {
			aBool8905 = true;
			aSet8902.add(Integer.valueOf(class159.anInt1754 * -80020449));
		}
		super.method114(class159, l);
	}

	public void method14393(Class19 class19) {
		do {
			try {
				try {
					byte[] is = new byte[(int) class19.method795(-61525086)];
					int i;
					for (int i_30_ = 0; i_30_ < is.length; i_30_ += i) {
						i = class19.method784(is, i_30_, is.length - i_30_, (byte) 16);
						if (i == -1)
							throw new EOFException();
					}
					Class523_Sub34 class523_sub34 = new Class523_Sub34(is);
					if ((class523_sub34.aByteArray10658.length - class523_sub34.anInt10661 * 2349011) < 1) {
						try {
							class19.method786(1381933984);
						} catch (Exception exception) {
							/* empty */
						}
						break;
					}
					int i_31_ = class523_sub34.readUnsignedByte(1619341585);
					if (i_31_ < 0 || i_31_ > 1) {
						try {
							class19.method786(1752101045);
						} catch (Exception exception) {
							/* empty */
						}
						break;
					}
					if ((class523_sub34.aByteArray10658.length - 2349011 * class523_sub34.anInt10661) < 2) {
						try {
							class19.method786(1406112995);
						} catch (Exception exception) {
							/* empty */
						}
						break;
					}
					int i_32_ = class523_sub34.readUnsignedShort(-1142700220);
					if ((class523_sub34.aByteArray10658.length - class523_sub34.anInt10661 * 2349011) < 6 * i_32_) {
						try {
							class19.method786(1135449708);
						} catch (Exception exception) {
							/* empty */
						}
						break;
					}
					for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
						Class426 class426 = Class114.aClass98_Sub1_Sub2_1405.refreshNIS(class523_sub34, 1760049625);
						if ((Class461.aClass461_5117 == (aClass461Array8910[-408785679 * class426.anInt4821])) && (((Class159) (Class114.aClass98_Sub1_Sub2_1405.getDefinition(class426.anInt4821 * -408785679, (byte) 27))).aClass464_1756.method7527(2142357577).aClass5388.isAssignableFrom(class426.anObject4822.getClass())))
							anInterface2_1714.method14((-408785679 * class426.anInt4821), class426.anObject4822, -1994778795);
					}
				} catch (Exception exception) {
					try {
						class19.method786(1564613068);
					} catch (Exception exception_34_) {
						exception = exception_34_;
					}
					break;
				}
				try {
					class19.method786(2036316584);
				} catch (Exception exception) {
					/* empty */
				}
			} catch (Exception object) {
				try {
					class19.method786(1389416664);
				} catch (Exception exception) {
					/* empty */
				}
				throw object;
			}
		} while (false);
	}

	public void method14394(Class19 class19) {
		do {
			try {
				try {
					int i = 3;
					int i_35_ = 0;
					Iterator iterator = anInterface2_1714.iterator();
					while (iterator.hasNext()) {
						Class426 class426 = (Class426) iterator.next();
						if (Class461.aClass461_5117 == (aClass461Array8910[class426.anInt4821 * -408785679])) {
							i += Class114.aClass98_Sub1_Sub2_1405.method14342(class426, 1963975858);
							i_35_++;
						}
					}
					Class523_Sub34 class523_sub34 = new Class523_Sub34(i);
					class523_sub34.writeByte(1, 48447588);
					class523_sub34.writeShort(i_35_, (byte) -23);
					Iterator iterator_36_ = anInterface2_1714.iterator();
					while (iterator_36_.hasNext()) {
						Class426 class426 = (Class426) iterator_36_.next();
						if (Class461.aClass461_5117 == (aClass461Array8910[-408785679 * class426.anInt4821]))
							Class114.aClass98_Sub1_Sub2_1405.method14341(class523_sub34, class426, (byte) 4);
					}
					class19.method782(class523_sub34.aByteArray10658, 0, 2349011 * class523_sub34.anInt10661, 1357652815);
				} catch (Exception exception) {
					try {
						class19.method786(1370079880);
					} catch (Exception exception_37_) {
						exception = exception_37_;
					}
					break;
				}
				try {
					class19.method786(2075422754);
				} catch (Exception exception) {
					/* empty */
				}
			} catch (Exception object) {
				try {
					class19.method786(1711671519);
				} catch (Exception exception) {
					/* empty */
				}
				throw object;
			}
		} while (false);
		aLong8904 = Class248.method4401(1516375036) * 8792460426006770217L;
		aBool8903 = false;
	}

	public void method14395(int i) {
		for (int i_38_ = 0; i_38_ < aClass461Array8910.length; i_38_++) {
			if (Class461.aClass461_5118 == aClass461Array8910[i_38_] || aClass461Array8910[i_38_] == Class461.aClass461_5119)
				anInterface2_1714.method16(i_38_, -927657522);
		}
		aSet8902.clear();
		aBool8905 = false;
		aClass426Array8908 = null;
		aLong8906 = 8924321158575988423L;
	}

	public void method14396() {
		if (aClass426Array8908 != null && anInt8909 * -1092729361 >= aClass426Array8908.length) {
			aClass426Array8908 = null;
			anInt8909 = 0;
		}
	}

	static void method14397(Class250 class250, Class250 class250_39_, byte i) {
		Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.SWITCH_INTERFACE_PACKET, client.aClass116_11058.aClass11_1413, 1370050649);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(-1878986101 * class250_39_.anInt2680, (byte) 1);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeIntLE(class250.anInt2585 * -1363815505, 1225853340);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(class250.anInt2709 * 234012635, (byte) -47);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeIntV1(-1363815505 * class250_39_.anInt2585, (byte) 1);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeShort(-1878986101 * class250.anInt2680, (byte) -14);
		class523_sub22.aClass523_Sub34_Sub2_10525.writeShortLE(234012635 * class250_39_.anInt2709, (byte) 55);
		client.aClass116_11058.method1974(class523_sub22, (byte) 107);
	}

	static final void method14398(Class669 class669, int i) {
		class669.anInt8558 -= 2121349901;
		if (Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5341((byte) 108) != Class294.aClass294_3166)
			throw new RuntimeException();
		((Class688_Sub3) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5465((byte) 41)).method17104(class669.anIntArray8557[1357652815 * class669.anInt8558], class669.anIntArray8557[1 + 1357652815 * class669.anInt8558], class669.anIntArray8557[2 + class669.anInt8558 * 1357652815], 1885098353);
	}
}
