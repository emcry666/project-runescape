/* Class57 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.EOFException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Class57 {
	static final int anInt743 = 10;
	LinkedHashMap aLinkedHashMap744 = new LinkedHashMap();
	static final int anInt745 = 1;
	static int anInt746;

	Class57(RSBuffer class523_sub34) {
		if (null != class523_sub34 && class523_sub34.buffer != null) {
			int i = class523_sub34.readUnsignedByte(663912327);
			if (i > 0 && i <= 1) {
				int i_0_ = class523_sub34.readUnsignedByte(-1915970973);
				for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
					long l = class523_sub34.readLong((byte) -25);
					int i_2_ = class523_sub34.readUnsignedInt((byte) -74);
					aLinkedHashMap744.put(Long.valueOf(l), Integer.valueOf(i_2_));
				}
			}
		}
	}

	public static Class57 method1364() {
		Class19 class19 = null;
		try {
			Class57 class57;
			try {
				class19 = Class53_Sub2.method17146("3", (client.aClass681_11284.aString8645), false, 2050841179);
				byte[] is = new byte[(int) class19.method795(-682434455)];
				int i;
				for (int i_3_ = 0; i_3_ < is.length; i_3_ += i) {
					i = class19.method784(is, i_3_, is.length - i_3_, (byte) 16);
					if (i == -1)
						throw new EOFException();
				}
				class57 = new Class57(new RSBuffer(is));
			} catch (Exception exception) {
				Class57 class57_4_ = new Class57();
				try {
					if (class19 != null)
						class19.method786(1964372941);
				} catch (Exception exception_5_) {
					/* empty */
				}
				return class57_4_;
			}
			try {
				if (class19 != null)
					class19.method786(1397655618);
			} catch (Exception exception) {
				/* empty */
			}
			return class57;
		} catch (Exception object) {
			try {
				if (class19 != null)
					class19.method786(2056054659);
			} catch (Exception exception) {
				/* empty */
			}
			throw object;
		}
	}

	void method1365() {
		Class19 class19 = null;
		do {
			try {
				try {
					class19 = Class53_Sub2.method17146("3", (client.aClass681_11284.aString8645), true, 2011572867);
					RSBuffer class523_sub34 = new RSBuffer(5000);
					method1368(class523_sub34, (byte) 94);
					class19.method782(class523_sub34.buffer, 0, 2349011 * class523_sub34.offset, 1357652815);
				} catch (Exception exception) {
					try {
						if (class19 != null)
							class19.method786(1186540658);
					} catch (Exception exception_6_) {
						exception = exception_6_;
					}
					break;
				}
				try {
					if (class19 != null)
						class19.method786(1712381317);
				} catch (Exception exception) {
					/* empty */
				}
			} catch (Exception object) {
				try {
					if (class19 != null)
						class19.method786(2045967346);
				} catch (Exception exception) {
					/* empty */
				}
				throw object;
			}
		} while (false);
	}

	void method1366(long l, int i, int i_7_) {
		if (aLinkedHashMap744.size() >= 10 && !aLinkedHashMap744.containsKey(Long.valueOf(l))) {
			Iterator iterator = aLinkedHashMap744.entrySet().iterator();
			iterator.next();
			iterator.remove();
		}
		aLinkedHashMap744.put(Long.valueOf(l), Integer.valueOf(i));
		method1381((short) -9226);
	}

	boolean method1367(long l) {
		return aLinkedHashMap744.containsKey(Long.valueOf(l));
	}

	void method1368(RSBuffer class523_sub34, byte i) {
		class523_sub34.writeByte(1, 2124655308);
		class523_sub34.writeByte(aLinkedHashMap744.size(), -1016479402);
		Iterator iterator = aLinkedHashMap744.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			class523_sub34.method16441(((Long) entry.getKey()).longValue());
			class523_sub34.writeInt(((Integer) entry.getValue()).intValue(), -1957341535);
		}
	}

	public static Class57 method1369() {
		Class19 class19 = null;
		try {
			Class57 class57;
			try {
				class19 = Class53_Sub2.method17146("3", (client.aClass681_11284.aString8645), false, 1583205935);
				byte[] is = new byte[(int) class19.method795(1504125812)];
				int i;
				for (int i_8_ = 0; i_8_ < is.length; i_8_ += i) {
					i = class19.method784(is, i_8_, is.length - i_8_, (byte) 16);
					if (i == -1)
						throw new EOFException();
				}
				class57 = new Class57(new RSBuffer(is));
			} catch (Exception exception) {
				Class57 class57_9_ = new Class57();
				try {
					if (class19 != null)
						class19.method786(2055086086);
				} catch (Exception exception_10_) {
					/* empty */
				}
				return class57_9_;
			}
			try {
				if (class19 != null)
					class19.method786(1696215015);
			} catch (Exception exception) {
				/* empty */
			}
			return class57;
		} catch (Exception object) {
			try {
				if (class19 != null)
					class19.method786(1529933359);
			} catch (Exception exception) {
				/* empty */
			}
			throw object;
		}
	}

	void method1370(RSBuffer class523_sub34) {
		class523_sub34.writeByte(1, -1609867432);
		class523_sub34.writeByte(aLinkedHashMap744.size(), 1197464723);
		Iterator iterator = aLinkedHashMap744.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			class523_sub34.method16441(((Long) entry.getKey()).longValue());
			class523_sub34.writeInt(((Integer) entry.getValue()).intValue(), -951946260);
		}
	}

	void method1371(RSBuffer class523_sub34) {
		class523_sub34.writeByte(1, 2065529790);
		class523_sub34.writeByte(aLinkedHashMap744.size(), 283932134);
		Iterator iterator = aLinkedHashMap744.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			class523_sub34.method16441(((Long) entry.getKey()).longValue());
			class523_sub34.writeInt(((Integer) entry.getValue()).intValue(), -2093768877);
		}
	}

	void method1372(long l, int i) {
		if (aLinkedHashMap744.size() >= 10 && !aLinkedHashMap744.containsKey(Long.valueOf(l))) {
			Iterator iterator = aLinkedHashMap744.entrySet().iterator();
			iterator.next();
			iterator.remove();
		}
		aLinkedHashMap744.put(Long.valueOf(l), Integer.valueOf(i));
		method1381((short) 23355);
	}

	Class57() {
		this(null);
	}

	void method1373(long l, int i) {
		if (aLinkedHashMap744.size() >= 10 && !aLinkedHashMap744.containsKey(Long.valueOf(l))) {
			Iterator iterator = aLinkedHashMap744.entrySet().iterator();
			iterator.next();
			iterator.remove();
		}
		aLinkedHashMap744.put(Long.valueOf(l), Integer.valueOf(i));
		method1381((short) 17709);
	}

	int method1374(long l) {
		return ((Integer) aLinkedHashMap744.get(Long.valueOf(l))).intValue();
	}

	int method1375(long l) {
		return ((Integer) aLinkedHashMap744.get(Long.valueOf(l))).intValue();
	}

	public static Class57 method1376() {
		Class19 class19 = null;
		try {
			Class57 class57;
			try {
				class19 = Class53_Sub2.method17146("3", (client.aClass681_11284.aString8645), false, 1756856850);
				byte[] is = new byte[(int) class19.method795(-1625718226)];
				int i;
				for (int i_11_ = 0; i_11_ < is.length; i_11_ += i) {
					i = class19.method784(is, i_11_, is.length - i_11_, (byte) 16);
					if (i == -1)
						throw new EOFException();
				}
				class57 = new Class57(new RSBuffer(is));
			} catch (Exception exception) {
				Class57 class57_12_ = new Class57();
				try {
					if (class19 != null)
						class19.method786(1300048645);
				} catch (Exception exception_13_) {
					/* empty */
				}
				return class57_12_;
			}
			try {
				if (class19 != null)
					class19.method786(1181680738);
			} catch (Exception exception) {
				/* empty */
			}
			return class57;
		} catch (Exception object) {
			try {
				if (class19 != null)
					class19.method786(1425973818);
			} catch (Exception exception) {
				/* empty */
			}
			throw object;
		}
	}

	boolean method1377(long l) {
		return aLinkedHashMap744.containsKey(Long.valueOf(l));
	}

	void method1378(long l, int i) {
		if (aLinkedHashMap744.size() >= 10 && !aLinkedHashMap744.containsKey(Long.valueOf(l))) {
			Iterator iterator = aLinkedHashMap744.entrySet().iterator();
			iterator.next();
			iterator.remove();
		}
		aLinkedHashMap744.put(Long.valueOf(l), Integer.valueOf(i));
		method1381((short) -45);
	}

	void method1379() {
		Class19 class19 = null;
		do {
			try {
				try {
					class19 = Class53_Sub2.method17146("3", (client.aClass681_11284.aString8645), true, 1502738682);
					RSBuffer class523_sub34 = new RSBuffer(5000);
					method1368(class523_sub34, (byte) 90);
					class19.method782(class523_sub34.buffer, 0, 2349011 * class523_sub34.offset, 1357652815);
				} catch (Exception exception) {
					try {
						if (class19 != null)
							class19.method786(1663402070);
					} catch (Exception exception_14_) {
						exception = exception_14_;
					}
					break;
				}
				try {
					if (class19 != null)
						class19.method786(1948657800);
				} catch (Exception exception) {
					/* empty */
				}
			} catch (Exception object) {
				try {
					if (class19 != null)
						class19.method786(2121428231);
				} catch (Exception exception) {
					/* empty */
				}
				throw object;
			}
		} while (false);
	}

	void method1380() {
		Class19 class19 = null;
		do {
			try {
				try {
					class19 = Class53_Sub2.method17146("3", (client.aClass681_11284.aString8645), true, 1774870927);
					RSBuffer class523_sub34 = new RSBuffer(5000);
					method1368(class523_sub34, (byte) 75);
					class19.method782(class523_sub34.buffer, 0, 2349011 * class523_sub34.offset, 1357652815);
				} catch (Exception exception) {
					try {
						if (class19 != null)
							class19.method786(1390424408);
					} catch (Exception exception_15_) {
						exception = exception_15_;
					}
					break;
				}
				try {
					if (class19 != null)
						class19.method786(1557531088);
				} catch (Exception exception) {
					/* empty */
				}
			} catch (Exception object) {
				try {
					if (class19 != null)
						class19.method786(1645213060);
				} catch (Exception exception) {
					/* empty */
				}
				throw object;
			}
		} while (false);
	}

	void method1381(short i) {
		Class19 class19 = null;
		do {
			try {
				try {
					class19 = Class53_Sub2.method17146("3", (client.aClass681_11284.aString8645), true, 1621274665);
					RSBuffer class523_sub34 = new RSBuffer(5000);
					method1368(class523_sub34, (byte) 40);
					class19.method782(class523_sub34.buffer, 0, 2349011 * class523_sub34.offset, 1357652815);
				} catch (Exception exception) {
					try {
						if (class19 != null)
							class19.method786(2083522952);
					} catch (Exception exception_16_) {
						exception = exception_16_;
					}
					break;
				}
				try {
					if (class19 != null)
						class19.method786(2133110004);
				} catch (Exception exception) {
					/* empty */
				}
			} catch (Exception object) {
				try {
					if (class19 != null)
						class19.method786(1909785655);
				} catch (Exception exception) {
					/* empty */
				}
				throw object;
			}
		} while (false);
	}

	void method1382() {
		Class19 class19 = null;
		do {
			try {
				try {
					class19 = Class53_Sub2.method17146("3", (client.aClass681_11284.aString8645), true, 2003328590);
					RSBuffer class523_sub34 = new RSBuffer(5000);
					method1368(class523_sub34, (byte) 15);
					class19.method782(class523_sub34.buffer, 0, 2349011 * class523_sub34.offset, 1357652815);
				} catch (Exception exception) {
					try {
						if (class19 != null)
							class19.method786(1482672295);
					} catch (Exception exception_17_) {
						exception = exception_17_;
					}
					break;
				}
				try {
					if (class19 != null)
						class19.method786(2143782328);
				} catch (Exception exception) {
					/* empty */
				}
			} catch (Exception object) {
				try {
					if (class19 != null)
						class19.method786(1384187254);
				} catch (Exception exception) {
					/* empty */
				}
				throw object;
			}
		} while (false);
	}

	void method1383() {
		Class19 class19 = null;
		do {
			try {
				try {
					class19 = Class53_Sub2.method17146("3", (client.aClass681_11284.aString8645), true, 1715673387);
					RSBuffer class523_sub34 = new RSBuffer(5000);
					method1368(class523_sub34, (byte) 79);
					class19.method782(class523_sub34.buffer, 0, 2349011 * class523_sub34.offset, 1357652815);
				} catch (Exception exception) {
					try {
						if (class19 != null)
							class19.method786(2114858478);
					} catch (Exception exception_18_) {
						exception = exception_18_;
					}
					break;
				}
				try {
					if (class19 != null)
						class19.method786(1493317386);
				} catch (Exception exception) {
					/* empty */
				}
			} catch (Exception object) {
				try {
					if (class19 != null)
						class19.method786(1834854449);
				} catch (Exception exception) {
					/* empty */
				}
				throw object;
			}
		} while (false);
	}

	static int method1384(int i) {
		int i_19_ = Class308.aClass290_3356.anInt3139 * 1533974855;
		if (i_19_ < Class308.aClass290Array3361.length - 1)
			Class308.aClass290_3356 = Class308.aClass290Array3361[i_19_ + 1];
		return 100;
	}

	static final void method1385(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class457.method7443(class250, class242, true, 0, class669, 742109948);
	}

	static final void method1386(Class669 class669, int i) {
		Class668.method13676((Class647_Sub1) class669.anInterface61_8572, class669, (byte) 0);
	}

	static Class589[] method1387(byte i) {
		return (new Class589[] { Class589.aClass589_7794, Class589.aClass589_7792, Class589.aClass589_7793 });
	}

	public static int method1388(String string, int i) {
		return string.length() + 2;
	}
}
