/* Class159 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class159 implements Interface14 {
	public int anInt1754;
	public Class470 aClass470_1755;
	public Class464 aClass464_1756;
	public Class461 aClass461_1757 = Class461.aClass461_5118;
	public boolean aBool1758 = true;
	public static Class98_Sub1_Sub2 aClass98_Sub1_Sub2_1759;

	abstract void method2558(Class523_Sub34 class523_sub34, int i, int i_0_);

	Class159(Class470 class470, int i) {
		aClass470_1755 = class470;
		anInt1754 = i * 169181151;
	}

	public void method63(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-1524541904);
			if (i == 0)
				break;
			Class146 class146 = ((Class146) Class334.method5910(Class177.method3015(-742944400), i, 1426890105));
			if (class146 != null) {
				switch (class146.anInt1700 * 1305146603) {
				default:
					throw new IllegalStateException("");
				case 0:
					aBool1758 = false;
					break;
				case 3:
					class523_sub34.readVersionedString(2115066488);
					break;
				case 1: {
					int i_1_ = class523_sub34.readUnsignedByte(-1549279940);
					aClass464_1756 = ((Class464) Class334.method5910(Class464.method7532((byte) 98), i_1_, 1476322637));
					if (aClass464_1756 == null)
						throw new IllegalStateException("");
					break;
				}
				case 4:
					break;
				case 2:
					aClass461_1757 = ((Class461) Class334.method5910(Class212.method3827(1071639504), class523_sub34.readUnsignedByte(2115671531), 963526142));
					break;
				case 5:
					Class334.method5910(Class365.method6297(-1634093016), class523_sub34.readUnsignedByte(-92997079), 291337490);
				}
			} else
				method2558(class523_sub34, i, -682676781);
		}
	}

	boolean method2559(byte i) {
		if (aClass470_1755 == null || aClass464_1756 == null)
			return false;
		return true;
	}

	public void method80(Class523_Sub34 class523_sub34, int i) {
		for (;;) {
			int i_2_ = class523_sub34.readUnsignedByte(1503284216);
			if (i_2_ == 0)
				break;
			Class146 class146 = ((Class146) Class334.method5910(Class177.method3015(-742944400), i_2_, -1224425613));
			if (class146 != null) {
				switch (class146.anInt1700 * 1305146603) {
				default:
					throw new IllegalStateException("");
				case 0:
					aBool1758 = false;
					break;
				case 3:
					class523_sub34.readVersionedString(2087074323);
					break;
				case 1: {
					int i_3_ = class523_sub34.readUnsignedByte(1450740695);
					aClass464_1756 = ((Class464) Class334.method5910(Class464.method7532((byte) -94), i_3_, 1500115646));
					if (aClass464_1756 == null)
						throw new IllegalStateException("");
					break;
				}
				case 4:
					break;
				case 2:
					aClass461_1757 = ((Class461) Class334.method5910(Class212.method3827(-1779781856), class523_sub34.readUnsignedByte(-346763700), -732497404));
					break;
				case 5:
					Class334.method5910(Class365.method6297(-1195886193), class523_sub34.readUnsignedByte(649395278), -717150590);
				}
			} else
				method2558(class523_sub34, i_2_, 1737438740);
		}
	}

	public void method75(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-700190588);
			if (i == 0)
				break;
			Class146 class146 = ((Class146) Class334.method5910(Class177.method3015(-742944400), i, 1335810002));
			if (class146 != null) {
				switch (class146.anInt1700 * 1305146603) {
				default:
					throw new IllegalStateException("");
				case 0:
					aBool1758 = false;
					break;
				case 3:
					class523_sub34.readVersionedString(2138539360);
					break;
				case 1: {
					int i_4_ = class523_sub34.readUnsignedByte(431145806);
					aClass464_1756 = ((Class464) Class334.method5910(Class464.method7532((byte) -34), i_4_, -416607337));
					if (aClass464_1756 == null)
						throw new IllegalStateException("");
					break;
				}
				case 4:
					break;
				case 2:
					aClass461_1757 = ((Class461) Class334.method5910(Class212.method3827(-461210883), class523_sub34.readUnsignedByte(1992872522), 435894722));
					break;
				case 5:
					Class334.method5910(Class365.method6297(63276690), class523_sub34.readUnsignedByte(611483551), 1516298278);
				}
			} else
				method2558(class523_sub34, i, 596695409);
		}
	}

	public Object method2560(int i) {
		return aClass470_1755.method7619(this, 2128881654);
	}

	public void method60(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(1308724078);
			if (i == 0)
				break;
			Class146 class146 = ((Class146) Class334.method5910(Class177.method3015(-742944400), i, 370676096));
			if (class146 != null) {
				switch (class146.anInt1700 * 1305146603) {
				default:
					throw new IllegalStateException("");
				case 0:
					aBool1758 = false;
					break;
				case 3:
					class523_sub34.readVersionedString(2114338235);
					break;
				case 1: {
					int i_5_ = class523_sub34.readUnsignedByte(1338467402);
					aClass464_1756 = ((Class464) Class334.method5910(Class464.method7532((byte) -68), i_5_, -1865686986));
					if (aClass464_1756 == null)
						throw new IllegalStateException("");
					break;
				}
				case 4:
					break;
				case 2:
					aClass461_1757 = ((Class461) Class334.method5910(Class212.method3827(1344086715), class523_sub34.readUnsignedByte(-978293953), 1342207394));
					break;
				case 5:
					Class334.method5910(Class365.method6297(1721749068), class523_sub34.readUnsignedByte(-857456146), -794687298);
				}
			} else
				method2558(class523_sub34, i, -315732433);
		}
	}

	boolean method2561() {
		if (aClass470_1755 == null || aClass464_1756 == null)
			return false;
		return true;
	}

	public void method62(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(782505156);
			if (i == 0)
				break;
			Class146 class146 = ((Class146) Class334.method5910(Class177.method3015(-742944400), i, -821696579));
			if (class146 != null) {
				switch (class146.anInt1700 * 1305146603) {
				default:
					throw new IllegalStateException("");
				case 0:
					aBool1758 = false;
					break;
				case 3:
					class523_sub34.readVersionedString(2121255572);
					break;
				case 1: {
					int i_6_ = class523_sub34.readUnsignedByte(-1279261282);
					aClass464_1756 = ((Class464) Class334.method5910(Class464.method7532((byte) -14), i_6_, -756781126));
					if (aClass464_1756 == null)
						throw new IllegalStateException("");
					break;
				}
				case 4:
					break;
				case 2:
					aClass461_1757 = ((Class461) Class334.method5910(Class212.method3827(1328446883), class523_sub34.readUnsignedByte(142449547), -2018013471));
					break;
				case 5:
					Class334.method5910(Class365.method6297(163791524), class523_sub34.readUnsignedByte(-1443328054), -966609932);
				}
			} else
				method2558(class523_sub34, i, -684824515);
		}
	}

	public void method58(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-1599529886);
			if (i == 0)
				break;
			Class146 class146 = ((Class146) Class334.method5910(Class177.method3015(-742944400), i, -1371175863));
			if (class146 != null) {
				switch (class146.anInt1700 * 1305146603) {
				default:
					throw new IllegalStateException("");
				case 0:
					aBool1758 = false;
					break;
				case 3:
					class523_sub34.readVersionedString(2034064824);
					break;
				case 1: {
					int i_7_ = class523_sub34.readUnsignedByte(-2077353104);
					aClass464_1756 = ((Class464) Class334.method5910(Class464.method7532((byte) -48), i_7_, -287699188));
					if (aClass464_1756 == null)
						throw new IllegalStateException("");
					break;
				}
				case 4:
					break;
				case 2:
					aClass461_1757 = ((Class461) Class334.method5910(Class212.method3827(393940417), class523_sub34.readUnsignedByte(1964825220), -1375211630));
					break;
				case 5:
					Class334.method5910(Class365.method6297(849242721), class523_sub34.readUnsignedByte(-810511816), -1014698631);
				}
			} else
				method2558(class523_sub34, i, 877282430);
		}
	}

	public void method76(Class523_Sub34 class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(1257656852);
			if (i == 0)
				break;
			Class146 class146 = ((Class146) Class334.method5910(Class177.method3015(-742944400), i, 110129384));
			if (class146 != null) {
				switch (class146.anInt1700 * 1305146603) {
				default:
					throw new IllegalStateException("");
				case 0:
					aBool1758 = false;
					break;
				case 3:
					class523_sub34.readVersionedString(2140994043);
					break;
				case 1: {
					int i_8_ = class523_sub34.readUnsignedByte(-1339026406);
					aClass464_1756 = ((Class464) Class334.method5910(Class464.method7532((byte) 12), i_8_, 1796776052));
					if (aClass464_1756 == null)
						throw new IllegalStateException("");
					break;
				}
				case 4:
					break;
				case 2:
					aClass461_1757 = ((Class461) Class334.method5910(Class212.method3827(-1957440498), class523_sub34.readUnsignedByte(431426804), -17993573));
					break;
				case 5:
					Class334.method5910(Class365.method6297(1342396610), class523_sub34.readUnsignedByte(1391899650), 1039892333);
				}
			} else
				method2558(class523_sub34, i, 992010566);
		}
	}

	abstract void method2562(Class523_Sub34 class523_sub34, int i);

	abstract void method2563(Class523_Sub34 class523_sub34, int i);

	boolean method2564() {
		if (aClass470_1755 == null || aClass464_1756 == null)
			return false;
		return true;
	}

	boolean method2565() {
		if (aClass470_1755 == null || aClass464_1756 == null)
			return false;
		return true;
	}

	public Object method2566() {
		return aClass470_1755.method7619(this, -297824181);
	}

	public Object method2567() {
		return aClass470_1755.method7619(this, 1658999686);
	}

	public static Class387 method2568(Class523_Sub34 class523_sub34, int i) {
		Class387 class387 = new Class387();
		class387.anInt4010 = class523_sub34.readUnsignedShort(-1013383917) * 266937769;
		class387.aClass523_Sub27_Sub18_4009 = Class645.aClass24_8347.method839(-1038659943 * class387.anInt4010, (byte) 57);
		return class387;
	}

	static final void method2569(Class669 class669, int i) {
		class669.anInt8558 -= 2121349901;
		int i_9_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_10_ = class669.anIntArray8557[1 + 1357652815 * class669.anInt8558];
		int i_11_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 2];
		Class188.method3592(i_9_, -1328619467);
		Class290.method5216(Class31.aClass242Array302[i_9_ >>> 16], i_9_ & 0xffff, i_10_, i_11_, class669.aBool8570, class669, -2140692976);
	}

	static boolean method2570(boolean bool, boolean bool_12_, String string, String string_13_, long l) {
		Class43.aBool574 = bool;
		if (!bool_12_)
			Class43.anInt572 = 1907326441;
		Class43.aBool579 = bool_12_;
		Class43.aString603 = string;
		Class43.aString594 = string_13_;
		Class43.aLong573 = 9083684963104943157L * l;
		if (!Class43.aBool579 && (Class43.aString603.equals("") || Class43.aString594.equals(""))) {
			Class645.method10563(3, 1852231456);
			Class450.method7275((byte) 0);
			return false;
		}
		if (142 != 1566115167 * Class43.anInt567) {
			Class43.anInt614 = 0;
			Class43.anInt616 = 234297499;
			Class43.anInt578 = 1142124537;
		}
		Class43.aClass116_568.aBool1432 = false;
		Class645.method10563(-3, -1553776284);
		Class43.anInt601 = -1901992645;
		Class43.anInt607 = 0;
		Class43.anInt575 = 0;
		return true;
	}
}
