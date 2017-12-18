/* Class241 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class Class241 {
	static HashMap aHashMap2449 = new HashMap();
	public static final long aLong2450 = 60000L;
	public static final long aLong2451 = 1000L;
	static Map aMap2452;
	public static Player aClass647_Sub1_Sub3_Sub1_Sub2_2453;
	static String aString2454;
	static int[] anIntArray2455;

	static TimeZone method4345(String string, int i) {
		synchronized (aHashMap2449) {
			TimeZone timezone = (TimeZone) aHashMap2449.get(string);
			if (timezone == null) {
				timezone = TimeZone.getTimeZone(string);
				aHashMap2449.put(string, timezone);
			}
			TimeZone timezone_0_ = timezone;
			return timezone_0_;
		}
	}

	public static String method4346(Date date, String string, short i) {
		return method4347(date, string, method4357(1332132835), Class668.aClass668_8548, -1355575356);
	}

	static String method4347(Date date, String string, TimeZone timezone, Class668 class668, int i) {
		if (null == aMap2452) {
			aMap2452 = new HashMap(7);
			Class668[] class668s = Class668.method13674(-1238756001);
			for (int i_1_ = 0; i_1_ < class668s.length; i_1_++) {
				Class668 class668_2_ = class668s[i_1_];
				aMap2452.put(class668_2_, new ConcurrentLinkedQueue());
			}
		}
		ConcurrentLinkedQueue concurrentlinkedqueue = (ConcurrentLinkedQueue) aMap2452.get(class668);
		SimpleDateFormat simpledateformat = (SimpleDateFormat) concurrentlinkedqueue.poll();
		if (simpledateformat == null)
			simpledateformat = new SimpleDateFormat(string, class668.method13680(495582537));
		else
			simpledateformat.applyPattern(string);
		simpledateformat.setTimeZone(timezone);
		String string_3_ = simpledateformat.format(date);
		concurrentlinkedqueue.add(simpledateformat);
		return string_3_;
	}

	static TimeZone method4348() {
		return method4345("Europe/London", 1745875418);
	}

	public static String method4349(Date date, String string) {
		return method4347(date, string, method4357(1332132835), Class668.aClass668_8548, -1986812858);
	}

	static {
		Calendar.getInstance(method4345("Europe/London", 1789094299));
	}

	public static String method4350(Date date, String string) {
		return method4347(date, string, method4357(1332132835), Class668.aClass668_8548, -1129832846);
	}

	static String method4351(Date date, String string, TimeZone timezone, Class668 class668) {
		if (null == aMap2452) {
			aMap2452 = new HashMap(7);
			Class668[] class668s = Class668.method13674(-1851340343);
			for (int i = 0; i < class668s.length; i++) {
				Class668 class668_4_ = class668s[i];
				aMap2452.put(class668_4_, new ConcurrentLinkedQueue());
			}
		}
		ConcurrentLinkedQueue concurrentlinkedqueue = (ConcurrentLinkedQueue) aMap2452.get(class668);
		SimpleDateFormat simpledateformat = (SimpleDateFormat) concurrentlinkedqueue.poll();
		if (simpledateformat == null)
			simpledateformat = new SimpleDateFormat(string, class668.method13680(275775057));
		else
			simpledateformat.applyPattern(string);
		simpledateformat.setTimeZone(timezone);
		String string_5_ = simpledateformat.format(date);
		concurrentlinkedqueue.add(simpledateformat);
		return string_5_;
	}

	public static String method4352(Date date, String string) {
		return method4347(date, string, method4357(1332132835), Class668.aClass668_8548, -1517235243);
	}

	static String method4353(Date date, String string, TimeZone timezone, Class668 class668) {
		if (null == aMap2452) {
			aMap2452 = new HashMap(7);
			Class668[] class668s = Class668.method13674(-72455347);
			for (int i = 0; i < class668s.length; i++) {
				Class668 class668_6_ = class668s[i];
				aMap2452.put(class668_6_, new ConcurrentLinkedQueue());
			}
		}
		ConcurrentLinkedQueue concurrentlinkedqueue = (ConcurrentLinkedQueue) aMap2452.get(class668);
		SimpleDateFormat simpledateformat = (SimpleDateFormat) concurrentlinkedqueue.poll();
		if (simpledateformat == null)
			simpledateformat = new SimpleDateFormat(string, class668.method13680(-787270487));
		else
			simpledateformat.applyPattern(string);
		simpledateformat.setTimeZone(timezone);
		String string_7_ = simpledateformat.format(date);
		concurrentlinkedqueue.add(simpledateformat);
		return string_7_;
	}

	static String method4354(Date date, String string, TimeZone timezone, Class668 class668) {
		if (null == aMap2452) {
			aMap2452 = new HashMap(7);
			Class668[] class668s = Class668.method13674(1849393884);
			for (int i = 0; i < class668s.length; i++) {
				Class668 class668_8_ = class668s[i];
				aMap2452.put(class668_8_, new ConcurrentLinkedQueue());
			}
		}
		ConcurrentLinkedQueue concurrentlinkedqueue = (ConcurrentLinkedQueue) aMap2452.get(class668);
		SimpleDateFormat simpledateformat = (SimpleDateFormat) concurrentlinkedqueue.poll();
		if (simpledateformat == null)
			simpledateformat = new SimpleDateFormat(string, class668.method13680(1866831788));
		else
			simpledateformat.applyPattern(string);
		simpledateformat.setTimeZone(timezone);
		String string_9_ = simpledateformat.format(date);
		concurrentlinkedqueue.add(simpledateformat);
		return string_9_;
	}

	static TimeZone method4355() {
		return method4345("Europe/London", 1898422438);
	}

	static String method4356(Date date, String string, TimeZone timezone, Class668 class668) {
		if (null == aMap2452) {
			aMap2452 = new HashMap(7);
			Class668[] class668s = Class668.method13674(966023081);
			for (int i = 0; i < class668s.length; i++) {
				Class668 class668_10_ = class668s[i];
				aMap2452.put(class668_10_, new ConcurrentLinkedQueue());
			}
		}
		ConcurrentLinkedQueue concurrentlinkedqueue = (ConcurrentLinkedQueue) aMap2452.get(class668);
		SimpleDateFormat simpledateformat = (SimpleDateFormat) concurrentlinkedqueue.poll();
		if (simpledateformat == null)
			simpledateformat = new SimpleDateFormat(string, class668.method13680(-1143755313));
		else
			simpledateformat.applyPattern(string);
		simpledateformat.setTimeZone(timezone);
		String string_11_ = simpledateformat.format(date);
		concurrentlinkedqueue.add(simpledateformat);
		return string_11_;
	}

	static TimeZone method4357(int i) {
		return method4345("Europe/London", 2031663319);
	}

	Class241() throws Throwable {
		throw new Error();
	}

	public static void method4358(Interface59 interface59, byte i) {
		if (Class517.anInterface59_7052 != null)
			throw new IllegalStateException("");
		Class517.anInterface59_7052 = interface59;
	}

	static final void method4359(Class669 class669, short i) {
		int i_12_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		ItemDefinitions class12 = ((ItemDefinitions) Class523_Sub37.aClass53_Sub8_10677.getDefinition(i_12_, (byte) 18));
		if (1178069929 * class12.certTemplateId >= 0 && 1322459523 * class12.certId >= 0)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 1322459523 * class12.certId;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_12_;
	}

	static void method4360(Class250 class250, int i) {
		if (5 == class250.anInt2534 * 36473529 && class250.anInt2680 * -1878986101 != -1)
			Class545.method9062(Class31.aClass178_303, class250, 1206355232);
	}

	public static void method4361(int i, int i_13_, byte i_14_) {
		Class534_Sub1.anInt10780 = (i - Class534_Sub1.anInt7168) * 1195183291;
		Class534_Sub1.anInt10779 = 465264525 * (i_13_ - Class534_Sub1.anInt7159);
	}

	public static void method4362(Class178 class178, long l) {
		class178.method3066();
		Class569.aLinkedList7645.clear();
		Class569.aLinkedList7646.clear();
		Class569.aLong7625 = 5627345227462185109L * ((long) (763085699 * Class569.anInt7618) + l);
	}

	static void method4363(int i) {
		Class43.aClass116_568.method1998(1294409033);
		Class43.aClass116_568.aClass523_Sub34_Sub2_1431.anInt10661 = 0;
		Class43.aClass116_568.currentPacket = null;
		Class43.aClass116_568.aClass409_1417 = null;
		Class43.aClass116_568.aClass409_1430 = null;
		Class43.aClass116_568.aClass409_1426 = null;
		Class43.aClass116_568.anInt1421 = 0;
		Class43.aClass116_568.anInt1423 = 0;
		client.anInt11063 = 0;
		Class636.method10448((byte) -74);
		Class100.method1794(1339548785);
		for (int i_15_ = 0; i_15_ < 2048; i_15_++)
			client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i_15_] = null;
		aClass647_Sub1_Sub3_Sub1_Sub2_2453 = null;
		for (int i_16_ = 0; i_16_ < client.anInt11049 * -1359865227; i_16_++) {
			Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1 = ((Class647_Sub1_Sub3_Sub1) client.aClass523_Sub28Array11195[i_16_].anObject10554);
			if (null != class647_sub1_sub3_sub1)
				class647_sub1_sub3_sub1.anInt11909 = 1843265241;
		}
		Class39.method1131((short) 28994);
		Class313.method5656(Class557.method9224(-1181668850), 743172261);
		Class657.method10791(9, (byte) -24);
		for (int i_17_ = 0; i_17_ < 106; i_17_++)
			client.aBoolArray11246[i_17_] = true;
		PacketsDecoder.method4264(Class43.aClass116_568, 733607002);
		Class168_Sub2.aClass640_9786 = null;
		Class520.aLong7060 = 0L;
		Class286.method5152((byte) -44);
		Class423.clientConfigsDomain.method14383((byte) 0);
	}
}
