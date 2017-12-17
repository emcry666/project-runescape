/* Class523_Sub27_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class523_Sub27_Sub7 extends Class523_Sub27 {
	static Class14 aClass14_11647;
	static final int anInt11648 = 7;
	int anInt11649;
	String aString11650;
	static final int anInt11651 = 1;
	static final int anInt11652 = 8;
	int anInt11653;
	static final int anInt11654 = 4;
	static final int anInt11655 = 5;
	static final int anInt11656 = 2;
	static JS5FileQueue aClass697_11657;
	static final int anInt11658 = 15;
	static final int anInt11659 = 9;
	static final int anInt11660 = 10;
	static final int anInt11661 = 11;
	static final int anInt11662 = 12;
	static final int anInt11663 = 3;
	static final int anInt11664 = 14;
	int anInt11665;
	static final int anInt11666 = 17;
	static final int anInt11667 = 20;
	static final int anInt11668 = 21;
	static final int anInt11669 = 22;
	static final int anInt11670 = 23;
	static JS5FileQueue aClass697_11671 = new JS5FileQueue();
	static final int anInt11672 = 6;
	static final int anInt11673 = 13;
	static final long aLong11674 = 9223372036854775807L;
	static final long aLong11675 = -9223372036854775808L;
	static final long aLong11676 = 500L;
	static boolean aBool11677;

	public static void method17961(Class159 class159) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(2, (long) (class159.anInt1754 * -80020449));
		class523_sub27_sub7.method17962((byte) 67);
	}

	void method17962(byte i) {
		queueId = ((queueId * -8659322449062458077L & ~0x7fffffffffffffffL | TimeUtils.getCurrentTimeMilliseconds(1516375036) + 500L) * -9121445971199030645L);
		aClass697_11657.removeFromQueue(this, (byte) -80);
	}

	void method17963(int i) {
		queueId = -9121445971199030645L * (queueId * -8659322449062458077L | ~0x7fffffffffffffffL);
		if (method17966(-421495104) == 0L)
			aClass697_11671.removeFromQueue(this, (byte) -27);
	}

	int method17964(int i) {
		return (int) (aLong7065 * 1055205983951172633L >>> 56 & 0xffL);
	}

	long method17965(byte i) {
		return 1055205983951172633L * aLong7065 & 0xffffffffffffffL;
	}

	long method17966(int i) {
		return queueId * -8659322449062458077L & 0x7fffffffffffffffL;
	}

	static {
		aClass697_11657 = new JS5FileQueue();
		aClass14_11647 = new Class14(16);
		aBool11677 = false;
	}

	static void method17967(int i, int i_0_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(14, 0L);
		class523_sub27_sub7.method17963(1706403451);
		class523_sub27_sub7.anInt11653 = -1217347391 * i;
		class523_sub27_sub7.anInt11649 = -254643469 * i_0_;
	}

	public static void method17968(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(11, (long) i);
		class523_sub27_sub7.method17962((byte) 25);
	}

	static void method17969(int i, int i_1_, int i_2_, int i_3_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(4, (long) i);
		class523_sub27_sub7.method17963(1521587174);
		class523_sub27_sub7.anInt11653 = -1217347391 * i_1_;
		class523_sub27_sub7.anInt11649 = i_2_ * -254643469;
		class523_sub27_sub7.anInt11665 = i_3_ * -1024048703;
	}

	static void method17970() {
		aClass14_11647.method733(1672730409);
		aClass697_11657.removeFromQueue(1239462612);
		aClass697_11671.removeFromQueue(-234750665);
	}

	static void method17971(int i, boolean bool) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(23, (long) i);
		class523_sub27_sub7.method17963(780160738);
		class523_sub27_sub7.anInt11653 = -1217347391 * (bool ? 1 : 0);
	}

	static void method17972() {
		aClass14_11647.method733(-349908864);
		aClass697_11657.removeFromQueue(694444780);
		aClass697_11671.removeFromQueue(-202089947);
	}

	static Class523_Sub27_Sub7 method17973(int i, long l) {
		aBool11677 = false;
		Class523_Sub27_Sub7 class523_sub27_sub7 = ((Class523_Sub27_Sub7) aClass14_11647.getFromIndex((long) i << 56 | l));
		if (class523_sub27_sub7 == null) {
			class523_sub27_sub7 = new Class523_Sub27_Sub7(i, l);
			aClass14_11647.method738(class523_sub27_sub7, (1055205983951172633L * class523_sub27_sub7.aLong7065));
			aBool11677 = true;
		}
		return class523_sub27_sub7;
	}

	static Class523_Sub27_Sub7 method17974() {
		Class523_Sub27_Sub7 class523_sub27_sub7 = (Class523_Sub27_Sub7) aClass697_11671.first(-1426448868);
		if (class523_sub27_sub7 != null) {
			class523_sub27_sub7.method8661(607052656);
			class523_sub27_sub7.method16154(-261651695);
			return class523_sub27_sub7;
		}
		for (;;) {
			class523_sub27_sub7 = ((Class523_Sub27_Sub7) aClass697_11657.first(-1426448868));
			if (null == class523_sub27_sub7)
				return null;
			if (class523_sub27_sub7.method17966(-1187623694) > TimeUtils.getCurrentTimeMilliseconds(1516375036))
				return null;
			class523_sub27_sub7.method8661(607052656);
			class523_sub27_sub7.method16154(-261651695);
			if (0L != (-8659322449062458077L * class523_sub27_sub7.queueId & ~0x7fffffffffffffffL))
				return class523_sub27_sub7;
		}
	}

	public static void method17975(Class159 class159) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(1, (long) (-80020449 * class159.anInt1754));
		class523_sub27_sub7.method17962((byte) 36);
	}

	public static void method17976(Class159 class159) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(2, (long) (class159.anInt1754 * -80020449));
		class523_sub27_sub7.method17962((byte) 16);
	}

	static Class523_Sub27_Sub7 method17977(int i, long l) {
		aBool11677 = false;
		Class523_Sub27_Sub7 class523_sub27_sub7 = ((Class523_Sub27_Sub7) aClass14_11647.getFromIndex((long) i << 56 | l));
		if (class523_sub27_sub7 == null) {
			class523_sub27_sub7 = new Class523_Sub27_Sub7(i, l);
			aClass14_11647.method738(class523_sub27_sub7, (1055205983951172633L * class523_sub27_sub7.aLong7065));
			aBool11677 = true;
		}
		return class523_sub27_sub7;
	}

	static void method17978(int i, int i_4_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(12, (long) i);
		class523_sub27_sub7.method17963(917163512);
		class523_sub27_sub7.anInt11653 = -1217347391 * i_4_;
	}

	public static void method17979(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(3, (long) i);
		class523_sub27_sub7.method17962((byte) 2);
	}

	public static void method17980(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(3, (long) i);
		class523_sub27_sub7.method17962((byte) 113);
	}

	public static void method17981(Class159 class159) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(2, (long) (class159.anInt1754 * -80020449));
		class523_sub27_sub7.method17962((byte) 114);
	}

	public static void method17982(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(23, (long) i);
		class523_sub27_sub7.method17962((byte) 1);
	}

	public static void method17983(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(23, (long) i);
		class523_sub27_sub7.method17962((byte) 111);
	}

	Class523_Sub27_Sub7(int i, long l) {
		aLong7065 = ((long) i << 56 | l) * 2947252533757437993L;
	}

	public static void method17984(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(5, (long) i);
		class523_sub27_sub7.method17962((byte) 111);
	}

	public static void method17985(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(6, (long) i);
		class523_sub27_sub7.method17962((byte) 45);
	}

	public static void method17986(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(13, (long) i);
		class523_sub27_sub7.method17962((byte) 30);
	}

	public static void method17987(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(8, (long) i);
		class523_sub27_sub7.method17962((byte) 75);
	}

	static void method17988() {
		aClass14_11647.method733(1149616071);
		aClass697_11657.removeFromQueue(-533324899);
		aClass697_11671.removeFromQueue(820551460);
	}

	public static void method17989(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(7, (long) i);
		class523_sub27_sub7.method17962((byte) 126);
	}

	public static void method17990(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(9, (long) i);
		class523_sub27_sub7.method17962((byte) 112);
	}

	public static void method17991(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(9, (long) i);
		class523_sub27_sub7.method17962((byte) 10);
	}

	public static void method17992(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(10, (long) i);
		class523_sub27_sub7.method17962((byte) 21);
	}

	public static void method17993(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(4, (long) i);
		class523_sub27_sub7.method17962((byte) 59);
	}

	public static void method17994(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(11, (long) i);
		class523_sub27_sub7.method17962((byte) 83);
	}

	public static void method17995(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(3, (long) i);
		class523_sub27_sub7.method17962((byte) 51);
	}

	long method17996() {
		return queueId * -8659322449062458077L & 0x7fffffffffffffffL;
	}

	public static void method17997(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(11, (long) i);
		class523_sub27_sub7.method17962((byte) 62);
	}

	public static void method17998(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(11, (long) i);
		class523_sub27_sub7.method17962((byte) 122);
	}

	public static void method17999(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(10, (long) i);
		class523_sub27_sub7.method17962((byte) 55);
	}

	public static void method18000(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(12, (long) i);
		class523_sub27_sub7.method17962((byte) 122);
	}

	public static void method18001(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(12, (long) i);
		class523_sub27_sub7.method17962((byte) 123);
	}

	public static void method18002(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(12, (long) i);
		class523_sub27_sub7.method17962((byte) 52);
	}

	public static void method18003(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(13, (long) i);
		class523_sub27_sub7.method17962((byte) 126);
	}

	public static void method18004(int i, int i_5_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(17, (long) i_5_ << 32 | (long) i);
		class523_sub27_sub7.method17962((byte) 77);
	}

	static void method18005(int i, int i_6_, int i_7_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(9, (long) i);
		class523_sub27_sub7.method17963(367205744);
		class523_sub27_sub7.anInt11653 = i_6_ * -1217347391;
		class523_sub27_sub7.anInt11649 = -254643469 * i_7_;
	}

	public static void method18006(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(15, (long) i);
		class523_sub27_sub7.method17962((byte) 61);
	}

	public static void method18007(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(15, (long) i);
		class523_sub27_sub7.method17962((byte) 101);
	}

	public static void method18008(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(15, (long) i);
		class523_sub27_sub7.method17962((byte) 58);
	}

	public static void method18009(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(21, (long) i);
		class523_sub27_sub7.method17962((byte) 22);
	}

	public static void method18010(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(21, (long) i);
		class523_sub27_sub7.method17962((byte) 96);
	}

	public static void method18011(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(22, (long) i);
		class523_sub27_sub7.method17962((byte) 83);
	}

	static void method18012(int i, int i_8_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(15, (long) i);
		class523_sub27_sub7.method17963(1689377831);
		class523_sub27_sub7.anInt11653 = i_8_ * -1217347391;
	}

	static void method18013() {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(14, 0L);
		class523_sub27_sub7.method17962((byte) 23);
	}

	static void method18014() {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(14, 0L);
		class523_sub27_sub7.method17962((byte) 63);
	}

	public static void method18015(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(10, (long) i);
		class523_sub27_sub7.method17962((byte) 17);
	}

	public static void method18016(int i, int i_9_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(17, (long) i_9_ << 32 | (long) i);
		class523_sub27_sub7.method17962((byte) 14);
	}

	public static void method18017(int i, int i_10_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(17, (long) i_10_ << 32 | (long) i);
		class523_sub27_sub7.method17962((byte) 21);
	}

	public static void method18018(int i, int i_11_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(17, (long) i_11_ << 32 | (long) i);
		class523_sub27_sub7.method17962((byte) 101);
	}

	public static void method18019(int i, int i_12_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(17, (long) i_12_ << 32 | (long) i);
		class523_sub27_sub7.method17962((byte) 126);
	}

	public static void method18020(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(6, (long) i);
		class523_sub27_sub7.method17962((byte) 33);
	}

	public static void method18021(int i, int i_13_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(20, (long) i_13_ << 32 | (long) i);
		class523_sub27_sub7.method17962((byte) 71);
	}

	public static void method18022(int i, int i_14_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(20, (long) i_14_ << 32 | (long) i);
		class523_sub27_sub7.method17962((byte) 61);
	}

	public static void method18023(int i, int i_15_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(20, (long) i_15_ << 32 | (long) i);
		class523_sub27_sub7.method17962((byte) 116);
	}

	static void method18024(int i, int i_16_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(1, (long) i);
		class523_sub27_sub7.method17963(1539962224);
		class523_sub27_sub7.anInt11653 = i_16_ * -1217347391;
	}

	public static void method18025(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(8, (long) i);
		class523_sub27_sub7.method17962((byte) 10);
	}

	static void method18026(int i, boolean bool) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(23, (long) i);
		class523_sub27_sub7.method17963(1407268852);
		class523_sub27_sub7.anInt11653 = -1217347391 * (bool ? 1 : 0);
	}

	static void method18027(int i, int i_17_, int i_18_, int i_19_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(4, (long) i);
		class523_sub27_sub7.method17963(1964489071);
		class523_sub27_sub7.anInt11653 = -1217347391 * i_17_;
		class523_sub27_sub7.anInt11649 = i_18_ * -254643469;
		class523_sub27_sub7.anInt11665 = i_19_ * -1024048703;
	}

	static void method18028(int i, int i_20_, int i_21_, int i_22_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(4, (long) i);
		class523_sub27_sub7.method17963(526662611);
		class523_sub27_sub7.anInt11653 = -1217347391 * i_20_;
		class523_sub27_sub7.anInt11649 = i_21_ * -254643469;
		class523_sub27_sub7.anInt11665 = i_22_ * -1024048703;
	}

	static void method18029(int i, int i_23_, int i_24_, int i_25_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(4, (long) i);
		class523_sub27_sub7.method17963(815585140);
		class523_sub27_sub7.anInt11653 = -1217347391 * i_23_;
		class523_sub27_sub7.anInt11649 = i_24_ * -254643469;
		class523_sub27_sub7.anInt11665 = i_25_ * -1024048703;
	}

	int method18030() {
		return (int) (aLong7065 * 1055205983951172633L >>> 56 & 0xffL);
	}

	static void method18031(int i, int i_26_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(5, (long) i);
		class523_sub27_sub7.method17963(1854077731);
		class523_sub27_sub7.anInt11653 = i_26_ * -1217347391;
	}

	static void method18032(int i, int i_27_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(5, (long) i);
		class523_sub27_sub7.method17963(1900437411);
		class523_sub27_sub7.anInt11653 = i_27_ * -1217347391;
	}

	static void method18033(int i, int i_28_, int i_29_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(11, (long) i);
		class523_sub27_sub7.method17963(515688391);
		class523_sub27_sub7.anInt11653 = i_28_ * -1217347391;
		class523_sub27_sub7.anInt11649 = i_29_ * -254643469;
	}

	static void method18034(int i, int i_30_, int i_31_, int i_32_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(8, (long) i);
		class523_sub27_sub7.method17963(874725741);
		class523_sub27_sub7.anInt11653 = -1217347391 * i_30_;
		class523_sub27_sub7.anInt11649 = -254643469 * i_31_;
		class523_sub27_sub7.anInt11665 = i_32_ * -1024048703;
	}

	static void method18035(int i, int i_33_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(6, (long) i);
		class523_sub27_sub7.method17963(1336335019);
		class523_sub27_sub7.anInt11653 = i_33_ * -1217347391;
	}

	static void method18036(int i, int i_34_, int i_35_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(9, (long) i);
		class523_sub27_sub7.method17963(1064418688);
		class523_sub27_sub7.anInt11653 = i_34_ * -1217347391;
		class523_sub27_sub7.anInt11649 = -254643469 * i_35_;
	}

	static void method18037(int i, int i_36_, int i_37_, int i_38_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(17, (long) i_36_ << 32 | (long) i);
		class523_sub27_sub7.method17963(1279905707);
		class523_sub27_sub7.anInt11653 = -1217347391 * i_37_;
		class523_sub27_sub7.anInt11649 = -254643469 * i_38_;
	}

	public static void method18038(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(13, (long) i);
		class523_sub27_sub7.method17962((byte) 87);
	}

	static void method18039(int i, int i_39_, int i_40_, int i_41_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(10, (long) i);
		class523_sub27_sub7.method17963(1440656220);
		class523_sub27_sub7.anInt11653 = i_39_ * -1217347391;
		class523_sub27_sub7.anInt11649 = i_40_ * -254643469;
		class523_sub27_sub7.anInt11665 = -1024048703 * i_41_;
	}

	static void method18040(int i, int i_42_, int i_43_, int i_44_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(10, (long) i);
		class523_sub27_sub7.method17963(718905137);
		class523_sub27_sub7.anInt11653 = i_42_ * -1217347391;
		class523_sub27_sub7.anInt11649 = i_43_ * -254643469;
		class523_sub27_sub7.anInt11665 = -1024048703 * i_44_;
	}

	static void method18041(int i, int i_45_, int i_46_, int i_47_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(20, (long) i_45_ << 32 | (long) i);
		class523_sub27_sub7.method17963(1297908678);
		class523_sub27_sub7.anInt11653 = i_46_ * -1217347391;
		class523_sub27_sub7.anInt11649 = i_47_ * -254643469;
	}

	static void method18042(int i, int i_48_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(12, (long) i);
		class523_sub27_sub7.method17963(322770172);
		class523_sub27_sub7.anInt11653 = -1217347391 * i_48_;
	}

	static void method18043(int i, int i_49_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(13, (long) i);
		class523_sub27_sub7.method17963(1039405785);
		class523_sub27_sub7.anInt11653 = -1217347391 * i_49_;
	}

	static void method18044(int i, int i_50_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(13, (long) i);
		class523_sub27_sub7.method17963(1350081771);
		class523_sub27_sub7.anInt11653 = -1217347391 * i_50_;
	}

	static void method18045(int i, int i_51_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(13, (long) i);
		class523_sub27_sub7.method17963(1202935413);
		class523_sub27_sub7.anInt11653 = -1217347391 * i_51_;
	}

	static void method18046(int i, int i_52_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(15, (long) i);
		class523_sub27_sub7.method17963(1382087485);
		class523_sub27_sub7.anInt11653 = i_52_ * -1217347391;
	}

	static void method18047(int i, int i_53_, int i_54_, int i_55_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(8, (long) i);
		class523_sub27_sub7.method17963(482933280);
		class523_sub27_sub7.anInt11653 = -1217347391 * i_53_;
		class523_sub27_sub7.anInt11649 = -254643469 * i_54_;
		class523_sub27_sub7.anInt11665 = i_55_ * -1024048703;
	}

	static void method18048(int i, int i_56_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(14, 0L);
		class523_sub27_sub7.method17963(348529162);
		class523_sub27_sub7.anInt11653 = -1217347391 * i;
		class523_sub27_sub7.anInt11649 = -254643469 * i_56_;
	}

	static void method18049(int i, int i_57_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(14, 0L);
		class523_sub27_sub7.method17963(917564750);
		class523_sub27_sub7.anInt11653 = -1217347391 * i;
		class523_sub27_sub7.anInt11649 = -254643469 * i_57_;
	}

	static Class523_Sub27_Sub7 method18050() {
		Class523_Sub27_Sub7 class523_sub27_sub7 = (Class523_Sub27_Sub7) aClass697_11671.first(-1426448868);
		if (class523_sub27_sub7 != null) {
			class523_sub27_sub7.method8661(607052656);
			class523_sub27_sub7.method16154(-261651695);
			return class523_sub27_sub7;
		}
		for (;;) {
			class523_sub27_sub7 = ((Class523_Sub27_Sub7) aClass697_11657.first(-1426448868));
			if (null == class523_sub27_sub7)
				return null;
			if (class523_sub27_sub7.method17966(54283159) > TimeUtils.getCurrentTimeMilliseconds(1516375036))
				return null;
			class523_sub27_sub7.method8661(607052656);
			class523_sub27_sub7.method16154(-261651695);
			if (0L != (-8659322449062458077L * class523_sub27_sub7.queueId & ~0x7fffffffffffffffL))
				return class523_sub27_sub7;
		}
	}

	static void method18051(int i, int i_58_, int i_59_, int i_60_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(17, (long) i_58_ << 32 | (long) i);
		class523_sub27_sub7.method17963(1739257197);
		class523_sub27_sub7.anInt11653 = -1217347391 * i_59_;
		class523_sub27_sub7.anInt11649 = -254643469 * i_60_;
	}

	static void method18052() {
		aClass14_11647.method733(-2147421461);
		aClass697_11657.removeFromQueue(1413884847);
		aClass697_11671.removeFromQueue(906222198);
	}

	static void method18053(int i, int i_61_, int i_62_, int i_63_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(17, (long) i_61_ << 32 | (long) i);
		class523_sub27_sub7.method17963(1619515964);
		class523_sub27_sub7.anInt11653 = -1217347391 * i_62_;
		class523_sub27_sub7.anInt11649 = -254643469 * i_63_;
	}

	public static void method18054(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(11, (long) i);
		class523_sub27_sub7.method17962((byte) 120);
	}

	static void method18055(int i, int i_64_, int i_65_, int i_66_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(20, (long) i_64_ << 32 | (long) i);
		class523_sub27_sub7.method17963(1435305865);
		class523_sub27_sub7.anInt11653 = i_65_ * -1217347391;
		class523_sub27_sub7.anInt11649 = i_66_ * -254643469;
	}

	void method18056() {
		queueId = -9121445971199030645L * (queueId * -8659322449062458077L | ~0x7fffffffffffffffL);
		if (method17966(2100059323) == 0L)
			aClass697_11671.removeFromQueue(this, (byte) -29);
	}

	void method18057() {
		queueId = -9121445971199030645L * (queueId * -8659322449062458077L | ~0x7fffffffffffffffL);
		if (method17966(93387577) == 0L)
			aClass697_11671.removeFromQueue(this, (byte) -69);
	}

	public static void method18058(int i) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(22, (long) i);
		class523_sub27_sub7.method17962((byte) 67);
	}

	int method18059() {
		return (int) (aLong7065 * 1055205983951172633L >>> 56 & 0xffL);
	}

	int method18060() {
		return (int) (aLong7065 * 1055205983951172633L >>> 56 & 0xffL);
	}

	static void method18061(int i, int i_67_) {
		Class523_Sub27_Sub7 class523_sub27_sub7 = Class552.createGameTask(1, (long) i);
		class523_sub27_sub7.method17963(1255004615);
		class523_sub27_sub7.anInt11653 = i_67_ * -1217347391;
	}

	long method18062() {
		return queueId * -8659322449062458077L & 0x7fffffffffffffffL;
	}
}
