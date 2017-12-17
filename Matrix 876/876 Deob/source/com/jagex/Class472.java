/* Class472 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;

public final class Class472 {
	Object[] anObjectArray5362;
	boolean aBool5363;
	Object[][] anObjectArrayArray5364;
	static boolean aBool5365;
	static Class79 aClass79_5366 = new Class79();
	static final int anInt5367 = 0;
	public static final int anInt5368 = 1;
	static final int anInt5369 = 2;
	JS5ReferenceTable aClass460_5370 = null;
	Class467 aClass467_5371;
	static int MAX_LENGTH;
	int anInt5373;
	public static String aString5374;
	public static client aclient5375;

	synchronized boolean method7640(short i) {
		if (aClass460_5370 == null) {
			aClass460_5370 = aClass467_5371.method7583(-1160257881);
			if (null == aClass460_5370)
				return false;
			anObjectArray5362 = new Object[aClass460_5370.archives * -132118613];
			anObjectArrayArray5364 = new Object[aClass460_5370.archives * -132118613][];
		}
		return true;
	}

	public int method7641(int i) {
		if (!method7640((short) 17171))
			return -1;
		return aClass460_5370.anIntArray5106.length;
	}

	public boolean method7642(String string, byte i) {
		if (!method7640((short) 11413))
			return false;
		string = string.toLowerCase();
		int i_0_ = (aClass460_5370.aClass283_5104.method5127(Class369.method6346(string, (short) 5000), 1864284058));
		if (i_0_ < 0)
			return false;
		return true;
	}

	public int method7643() {
		if (!method7640((short) 2786))
			return -1;
		return aClass460_5370.anIntArray5106.length;
	}

	public synchronized boolean method7644(int i, int i_1_, int i_2_) {
		if (!method7640((short) 22221))
			return false;
		if (i < 0 || i_1_ < 0 || i >= aClass460_5370.anIntArray5106.length || i_1_ >= aClass460_5370.anIntArray5106[i]) {
			if (aBool5365)
				throw new IllegalArgumentException(new StringBuilder().append(i).append(" ").append(i_1_).toString());
			return false;
		}
		return true;
	}

	public synchronized void method7645(int i) {
		if (method7718(i, (byte) -44)) {
			if (anObjectArrayArray5364 != null)
				anObjectArrayArray5364[i] = null;
		}
	}

	public int method7646(String string, byte i) {
		if (!method7640((short) 16011))
			return -1;
		string = string.toLowerCase();
		int i_3_ = (aClass460_5370.aClass283_5104.method5127(Class369.method6346(string, (short) 5000), 1661923832));
		if (!method7718(i_3_, (byte) 36))
			return -1;
		return i_3_;
	}

	public synchronized void method7647(int i, int i_4_) {
		if (method7718(i, (byte) 42)) {
			if (anObjectArrayArray5364 != null)
				anObjectArrayArray5364[i] = null;
		}
	}

	public synchronized byte[] method7648(int i, int i_5_, int[] is, int i_6_) {
		if (!method7644(i, i_5_, 1913713537))
			return null;
		byte[] is_7_ = null;
		if (anObjectArrayArray5364[i] == null || anObjectArrayArray5364[i][i_5_] == null) {
			boolean bool = method7710(i, i_5_, is, (byte) 19);
			if (!bool) {
				method7672(i, (short) 256);
				bool = method7710(i, i_5_, is, (byte) 88);
				if (!bool)
					return null;
			}
		}
		if (anObjectArrayArray5364[i] == null)
			throw new RuntimeException("");
		if (anObjectArrayArray5364[i][i_5_] != null) {
			is_7_ = Class654.method10718(anObjectArrayArray5364[i][i_5_], false, -1565613841);
			if (is_7_ == null)
				throw new RuntimeException("");
		}
		if (is_7_ != null) {
			if (1505832067 * anInt5373 == 1) {
				anObjectArrayArray5364[i][i_5_] = null;
				if (1 == aClass460_5370.anIntArray5106[i])
					anObjectArrayArray5364[i] = null;
			} else if (2 == 1505832067 * anInt5373)
				anObjectArrayArray5364[i] = null;
		}
		return is_7_;
	}

	public void method7649(boolean bool, boolean bool_8_, int i) {
		if (method7640((short) 14439)) {
			if (bool) {
				aClass460_5370.crcArray = null;
				aClass460_5370.aClass283_5104 = null;
			}
			if (bool_8_) {
				aClass460_5370.anIntArrayArray5113 = null;
				aClass460_5370.aClass283Array5115 = null;
			}
		}
	}

	public synchronized boolean method7650(int i, int i_9_) {
		if (!method7640((short) 23761))
			return false;
		if (aClass460_5370.anIntArray5106.length == 1)
			return method7663(0, i, 1089230115);
		if (!method7718(i, (byte) -17))
			return false;
		if (1 == aClass460_5370.anIntArray5106[i])
			return method7663(i, 0, 1089230115);
		throw new RuntimeException();
	}

	public synchronized boolean method7651(int i, byte i_10_) {
		if (!method7718(i, (byte) -24))
			return false;
		if (null != anObjectArray5362[i])
			return true;
		method7672(i, (short) 256);
		if (null != anObjectArray5362[i])
			return true;
		return false;
	}

	public synchronized boolean method7652(byte i) {
		if (!method7640((short) 3583))
			return false;
		boolean bool = true;
		for (int i_11_ = 0; i_11_ < aClass460_5370.validArchiveIds.length; i_11_++) {
			int i_12_ = aClass460_5370.validArchiveIds[i_11_];
			if (null == anObjectArray5362[i_12_]) {
				method7672(i_12_, (short) 256);
				if (anObjectArray5362[i_12_] == null)
					bool = false;
			}
		}
		return bool;
	}

	public synchronized int method7653(int i, int i_13_) {
		if (!method7718(i, (byte) -71))
			return 0;
		if (null != anObjectArray5362[i])
			return 100;
		return aClass467_5371.method7591(i, (byte) 0);
	}

	public synchronized int method7654(int i) {
		if (!method7640((short) 13673))
			return 0;
		int i_14_ = 0;
		int i_15_ = 0;
		for (int i_16_ = 0; i_16_ < anObjectArray5362.length; i_16_++) {
			if (aClass460_5370.size[i_16_] > 0) {
				i_14_ += 100;
				i_15_ += method7653(i_16_, -1662470422);
			}
		}
		if (i_14_ == 0)
			return 100;
		int i_17_ = i_15_ * 100 / i_14_;
		return i_17_;
	}

	public void method7655(int i) {
		aClass467_5371.method7581(i, (byte) 22);
	}

	public synchronized int[] method7656(int i, int i_18_) {
		if (!method7718(i, (byte) -60))
			return null;
		int[] is = aClass460_5370.anIntArrayArray5100[i];
		if (null == is) {
			is = new int[aClass460_5370.size[i]];
			for (int i_19_ = 0; i_19_ < is.length; i_19_++)
				is[i_19_] = i_19_;
		}
		return is;
	}

	public boolean method7657(int i, byte i_20_) {
		if (!method7640((short) 32285))
			return false;
		if (1 == aClass460_5370.anIntArray5106.length)
			return method7644(0, i, 1680722120);
		if (!method7718(i, (byte) -25))
			return false;
		if (1 == aClass460_5370.anIntArray5106[i])
			return method7644(i, 0, 1058732946);
		throw new RuntimeException();
	}

	public boolean method7658(String string, String string_21_) {
		if (!method7640((short) 7475))
			return false;
		string = string.toLowerCase();
		string_21_ = string_21_.toLowerCase();
		int i = (aClass460_5370.aClass283_5104.method5127(Class369.method6346(string, (short) 5000), 1767099750));
		if (i < 0)
			return false;
		int i_22_ = (aClass460_5370.aClass283Array5115[i].method5127(Class369.method6346(string_21_, (short) 5000), 1879043143));
		if (i_22_ < 0)
			return false;
		return true;
	}

	public boolean method7659(String string) {
		if (!method7640((short) 12055))
			return false;
		string = string.toLowerCase();
		int i = (aClass460_5370.aClass283_5104.method5127(Class369.method6346(string, (short) 5000), 1707571486));
		return method7651(i, (byte) -80);
	}

	public boolean method7660(String string) {
		int i = method7646("", (byte) -84);
		if (-1 != i)
			return method7668("", string, -210553051);
		return method7668(string, "", -186627316);
	}

	public boolean method7661(String string) {
		if (!method7640((short) 14148))
			return false;
		string = string.toLowerCase();
		int i = (aClass460_5370.aClass283_5104.method5127(Class369.method6346(string, (short) 5000), 1976411976));
		if (i < 0)
			return false;
		return true;
	}

	public boolean method7662(String string) {
		if (!method7640((short) 28238))
			return false;
		string = string.toLowerCase();
		int i = (aClass460_5370.aClass283_5104.method5127(Class369.method6346(string, (short) 5000), 1573409369));
		if (i < 0)
			return false;
		return true;
	}

	public synchronized boolean method7663(int i, int i_23_, int i_24_) {
		if (!method7644(i, i_23_, -2092560993))
			return false;
		if (anObjectArrayArray5364[i] != null && anObjectArrayArray5364[i][i_23_] != null)
			return true;
		if (anObjectArray5362[i] != null)
			return true;
		method7672(i, (short) 256);
		if (anObjectArray5362[i] != null)
			return true;
		return false;
	}

	public int method7664(int i, int i_25_) {
		if (!method7640((short) 1264))
			return -1;
		int i_26_ = aClass460_5370.aClass283_5104.method5127(i, 1917646759);
		if (!method7718(i_26_, (byte) 103))
			return -1;
		return i_26_;
	}

	public boolean method7665(String string) {
		if (!method7640((short) 8230))
			return false;
		string = string.toLowerCase();
		int i = (aClass460_5370.aClass283_5104.method5127(Class369.method6346(string, (short) 5000), 1781172516));
		if (i < 0)
			return false;
		return true;
	}

	public boolean method7666(String string, String string_27_, int i) {
		if (!method7640((short) 8583))
			return false;
		string = string.toLowerCase();
		string_27_ = string_27_.toLowerCase();
		int i_28_ = (aClass460_5370.aClass283_5104.method5127(Class369.method6346(string, (short) 5000), 1621543359));
		if (i_28_ < 0)
			return false;
		int i_29_ = (aClass460_5370.aClass283Array5115[i_28_].method5127(Class369.method6346(string_27_, (short) 5000), 2125878639));
		if (i_29_ < 0)
			return false;
		return true;
	}

	public synchronized byte[] method7667(String string, String string_30_, int i) {
		if (!method7640((short) 27842))
			return null;
		string = string.toLowerCase();
		string_30_ = string_30_.toLowerCase();
		int i_31_ = (aClass460_5370.aClass283_5104.method5127(Class369.method6346(string, (short) 5000), 1947893549));
		if (!method7718(i_31_, (byte) -11))
			return null;
		int i_32_ = (aClass460_5370.aClass283Array5115[i_31_].method5127(Class369.method6346(string_30_, (short) 5000), 1728345719));
		return method7688(i_31_, i_32_, -1725196082);
	}

	boolean method7668(String string, String string_33_, int i) {
		if (!method7640((short) 17311))
			return false;
		string = string.toLowerCase();
		string_33_ = string_33_.toLowerCase();
		int i_34_ = (aClass460_5370.aClass283_5104.method5127(Class369.method6346(string, (short) 5000), 1662439989));
		if (!method7718(i_34_, (byte) -45))
			return false;
		int i_35_ = (aClass460_5370.aClass283Array5115[i_34_].method5127(Class369.method6346(string_33_, (short) 5000), 2142665754));
		return method7663(i_34_, i_35_, 1089230115);
	}

	public boolean method7669(String string, byte i) {
		int i_36_ = method7646("", (byte) -94);
		if (-1 != i_36_)
			return method7668("", string, 350199392);
		return method7668(string, "", 434502785);
	}

	public byte[] method7670(int i, int i_37_) {
		return method7648(i, i_37_, null, 116967745);
	}

	public int method7671(String string, int i) {
		if (!method7640((short) 30857))
			return 0;
		string = string.toLowerCase();
		int i_38_ = (aClass460_5370.aClass283_5104.method5127(Class369.method6346(string, (short) 5000), 1713408294));
		return method7653(i_38_, 716979111);
	}

	static {
		aBool5365 = false;
		MAX_LENGTH = 0;
	}

	synchronized void method7672(int i, short i_39_) {
		if (aBool5363)
			anObjectArray5362[i] = aClass467_5371.method7582(i, 303378619);
		else
			anObjectArray5362[i] = Class39.method1128(aClass467_5371.method7582(i, -1963990968), false, -1388976414);
	}

	synchronized boolean method7673(int i) {
		if (!method7640((short) 9056))
			return false;
		if (i < 0 || i >= aClass460_5370.anIntArray5106.length || aClass460_5370.anIntArray5106[i] == 0) {
			if (aBool5365)
				throw new IllegalArgumentException(Integer.toString(i));
			return false;
		}
		return true;
	}

	synchronized boolean method7674(int i) {
		if (!method7640((short) 18892))
			return false;
		if (i < 0 || i >= aClass460_5370.anIntArray5106.length || aClass460_5370.anIntArray5106[i] == 0) {
			if (aBool5365)
				throw new IllegalArgumentException(Integer.toString(i));
			return false;
		}
		return true;
	}

	public int method7675() {
		if (!method7640((short) 14936))
			return -1;
		return aClass460_5370.anIntArray5106.length;
	}

	public synchronized boolean method7676(int i, int i_40_) {
		if (!method7640((short) 9333))
			return false;
		if (i < 0 || i_40_ < 0 || i >= aClass460_5370.anIntArray5106.length || i_40_ >= aClass460_5370.anIntArray5106[i]) {
			if (aBool5365)
				throw new IllegalArgumentException(new StringBuilder().append(i).append(" ").append(i_40_).toString());
			return false;
		}
		return true;
	}

	synchronized void method7677(int i) {
		if (aBool5363)
			anObjectArray5362[i] = aClass467_5371.method7582(i, -356974937);
		else
			anObjectArray5362[i] = Class39.method1128(aClass467_5371.method7582(i, 384221010), false, -1278588517);
	}

	public synchronized boolean method7678(int i, int i_41_) {
		if (!method7644(i, i_41_, 693058098))
			return false;
		if (anObjectArrayArray5364[i] != null && anObjectArrayArray5364[i][i_41_] != null)
			return true;
		if (anObjectArray5362[i] != null)
			return true;
		method7672(i, (short) 256);
		if (anObjectArray5362[i] != null)
			return true;
		return false;
	}

	public byte[] method7679(int i, int i_42_) {
		return method7648(i, i_42_, null, 1388858644);
	}

	public int method7680(int i) {
		if (!method7640((short) 5210))
			return -1;
		int i_43_ = aClass460_5370.aClass283_5104.method5127(i, 2143873890);
		if (!method7718(i_43_, (byte) 23))
			return -1;
		return i_43_;
	}

	public synchronized byte[] method7681(int i, int i_44_, int[] is) {
		if (!method7644(i, i_44_, -1704050255))
			return null;
		byte[] is_45_ = null;
		if (anObjectArrayArray5364[i] == null || anObjectArrayArray5364[i][i_44_] == null) {
			boolean bool = method7710(i, i_44_, is, (byte) 72);
			if (!bool) {
				method7672(i, (short) 256);
				bool = method7710(i, i_44_, is, (byte) 61);
				if (!bool)
					return null;
			}
		}
		if (anObjectArrayArray5364[i] == null)
			throw new RuntimeException("");
		if (anObjectArrayArray5364[i][i_44_] != null) {
			is_45_ = Class654.method10718(anObjectArrayArray5364[i][i_44_], false, -423730160);
			if (is_45_ == null)
				throw new RuntimeException("");
		}
		if (is_45_ != null) {
			if (1505832067 * anInt5373 == 1) {
				anObjectArrayArray5364[i][i_44_] = null;
				if (1 == aClass460_5370.anIntArray5106[i])
					anObjectArrayArray5364[i] = null;
			} else if (2 == 1505832067 * anInt5373)
				anObjectArrayArray5364[i] = null;
		}
		return is_45_;
	}

	public int method7682(String string) {
		if (!method7640((short) 24854))
			return -1;
		string = string.toLowerCase();
		int i = (aClass460_5370.aClass283_5104.method5127(Class369.method6346(string, (short) 5000), 1573076920));
		if (!method7718(i, (byte) 23))
			return -1;
		return i;
	}

	public synchronized boolean method7683(int i, int i_46_) {
		if (!method7644(i, i_46_, -2067436722))
			return false;
		if (anObjectArrayArray5364[i] != null && anObjectArrayArray5364[i][i_46_] != null)
			return true;
		if (anObjectArray5362[i] != null)
			return true;
		method7672(i, (short) 256);
		if (anObjectArray5362[i] != null)
			return true;
		return false;
	}

	public synchronized boolean method7684(int i) {
		if (!method7640((short) 20772))
			return false;
		if (aClass460_5370.anIntArray5106.length == 1)
			return method7663(0, i, 1089230115);
		if (!method7718(i, (byte) 31))
			return false;
		if (1 == aClass460_5370.anIntArray5106[i])
			return method7663(i, 0, 1089230115);
		throw new RuntimeException();
	}

	public synchronized boolean method7685(int i) {
		if (!method7640((short) 17503))
			return false;
		if (aClass460_5370.anIntArray5106.length == 1)
			return method7663(0, i, 1089230115);
		if (!method7718(i, (byte) 99))
			return false;
		if (1 == aClass460_5370.anIntArray5106[i])
			return method7663(i, 0, 1089230115);
		throw new RuntimeException();
	}

	public synchronized boolean method7686() {
		if (!method7640((short) 9679))
			return false;
		boolean bool = true;
		for (int i = 0; i < aClass460_5370.validArchiveIds.length; i++) {
			int i_47_ = aClass460_5370.validArchiveIds[i];
			if (null == anObjectArray5362[i_47_]) {
				method7672(i_47_, (short) 256);
				if (anObjectArray5362[i_47_] == null)
					bool = false;
			}
		}
		return bool;
	}

	public void method7687(int i, int i_48_) {
		aClass467_5371.method7581(i, (byte) 59);
	}

	public byte[] method7688(int i, int i_49_, int i_50_) {
		return method7648(i, i_49_, null, -572441993);
	}

	public synchronized int method7689(int i) {
		if (!method7718(i, (byte) -10))
			return 0;
		if (null != anObjectArray5362[i])
			return 100;
		return aClass467_5371.method7591(i, (byte) 0);
	}

	public synchronized int method7690(int i) {
		if (!method7718(i, (byte) 41))
			return 0;
		if (null != anObjectArray5362[i])
			return 100;
		return aClass467_5371.method7591(i, (byte) 0);
	}

	public synchronized int method7691(int i) {
		if (!method7718(i, (byte) 1))
			return 0;
		if (null != anObjectArray5362[i])
			return 100;
		return aClass467_5371.method7591(i, (byte) 0);
	}

	public synchronized boolean method7692(int i, int i_51_) {
		if (!method7640((short) 22361))
			return false;
		if (i < 0 || i_51_ < 0 || i >= aClass460_5370.anIntArray5106.length || i_51_ >= aClass460_5370.anIntArray5106[i]) {
			if (aBool5365)
				throw new IllegalArgumentException(new StringBuilder().append(i).append(" ").append(i_51_).toString());
			return false;
		}
		return true;
	}

	public synchronized int method7693() {
		if (!method7640((short) 4031))
			return 0;
		int i = 0;
		int i_52_ = 0;
		for (int i_53_ = 0; i_53_ < anObjectArray5362.length; i_53_++) {
			if (aClass460_5370.size[i_53_] > 0) {
				i += 100;
				i_52_ += method7653(i_53_, -338968337);
			}
		}
		if (i == 0)
			return 100;
		int i_54_ = i_52_ * 100 / i;
		return i_54_;
	}

	public synchronized byte[] method7694(int i) {
		if (!method7640((short) 17707))
			return null;
		if (1 == aClass460_5370.anIntArray5106.length)
			return method7688(0, i, -1300153170);
		if (!method7718(i, (byte) -42))
			return null;
		if (aClass460_5370.anIntArray5106[i] == 1)
			return method7688(i, 0, -1830892846);
		throw new RuntimeException();
	}

	public boolean method7695(String string) {
		int i = method7646("", (byte) -76);
		if (-1 != i)
			return method7668("", string, -1569341408);
		return method7668(string, "", -669444959);
	}

	public synchronized int[] method7696(int i) {
		if (!method7718(i, (byte) -21))
			return null;
		int[] is = aClass460_5370.anIntArrayArray5100[i];
		if (null == is) {
			is = new int[aClass460_5370.size[i]];
			for (int i_55_ = 0; i_55_ < is.length; i_55_++)
				is[i_55_] = i_55_;
		}
		return is;
	}

	public boolean method7697(int i) {
		if (!method7640((short) 30281))
			return false;
		if (1 == aClass460_5370.anIntArray5106.length)
			return method7644(0, i, 402905068);
		if (!method7718(i, (byte) 50))
			return false;
		if (1 == aClass460_5370.anIntArray5106[i])
			return method7644(i, 0, 988839933);
		throw new RuntimeException();
	}

	public boolean method7698(int i) {
		if (!method7640((short) 6762))
			return false;
		if (1 == aClass460_5370.anIntArray5106.length)
			return method7644(0, i, -1175750204);
		if (!method7718(i, (byte) 19))
			return false;
		if (1 == aClass460_5370.anIntArray5106[i])
			return method7644(i, 0, -1809494214);
		throw new RuntimeException();
	}

	public int method7699(int i) {
		if (!method7718(i, (byte) 67))
			return 0;
		return aClass460_5370.anIntArray5106[i];
	}

	public int method7700(int i) {
		if (!method7718(i, (byte) -54))
			return 0;
		return aClass460_5370.anIntArray5106[i];
	}

	public int method7701() {
		if (!method7640((short) 5666))
			return -1;
		return aClass460_5370.anIntArray5106.length;
	}

	public int method7702(int i, byte i_56_) {
		if (!method7718(i, (byte) -70))
			return 0;
		return aClass460_5370.anIntArray5106[i];
	}

	public int method7703(int i) {
		if (!method7640((short) 29323))
			return -1;
		int i_57_ = aClass460_5370.aClass283_5104.method5127(i, 1640420255);
		if (!method7718(i_57_, (byte) -88))
			return -1;
		return i_57_;
	}

	public synchronized int[] method7704(int i) {
		if (!method7718(i, (byte) -66))
			return null;
		int[] is = aClass460_5370.anIntArrayArray5100[i];
		if (null == is) {
			is = new int[aClass460_5370.size[i]];
			for (int i_58_ = 0; i_58_ < is.length; i_58_++)
				is[i_58_] = i_58_;
		}
		return is;
	}

	public synchronized boolean method7705() {
		if (!method7640((short) 9910))
			return false;
		boolean bool = true;
		for (int i = 0; i < aClass460_5370.validArchiveIds.length; i++) {
			int i_59_ = aClass460_5370.validArchiveIds[i];
			if (null == anObjectArray5362[i_59_]) {
				method7672(i_59_, (short) 256);
				if (anObjectArray5362[i_59_] == null)
					bool = false;
			}
		}
		return bool;
	}

	public void method7706(boolean bool, boolean bool_60_) {
		if (method7640((short) 10659)) {
			if (bool) {
				aClass460_5370.crcArray = null;
				aClass460_5370.aClass283_5104 = null;
			}
			if (bool_60_) {
				aClass460_5370.anIntArrayArray5113 = null;
				aClass460_5370.aClass283Array5115 = null;
			}
		}
	}

	synchronized boolean method7707(int i, int i_61_, int[] is) {
		if (!method7718(i, (byte) -45))
			return false;
		if (anObjectArray5362[i] == null)
			return false;
		int i_62_ = aClass460_5370.size[i];
		int[] is_63_ = aClass460_5370.anIntArrayArray5100[i];
		if (null == anObjectArrayArray5364[i])
			anObjectArrayArray5364[i] = new Object[aClass460_5370.anIntArray5106[i]];
		Object[] objects = anObjectArrayArray5364[i];
		boolean bool = true;
		for (int i_64_ = 0; i_64_ < i_62_; i_64_++) {
			int i_65_;
			if (is_63_ == null)
				i_65_ = i_64_;
			else
				i_65_ = is_63_[i_64_];
			if (objects[i_65_] == null) {
				bool = false;
				break;
			}
		}
		if (bool)
			return true;
		byte[] is_66_;
		if (null != is && (0 != is[0] || is[1] != 0 || is[2] != 0 || is[3] != 0)) {
			is_66_ = Class654.method10718(anObjectArray5362[i], true, -1595656965);
			RSBuffer class523_sub34 = new RSBuffer(is_66_);
			int i_67_ = class523_sub34.readUnsignedByte(1307880931);
			int i_68_ = class523_sub34.readUnsignedInt((byte) -128);
			int i_69_ = ((i_67_ == Compression.UNCOMPRESSED.method82() ? 5 : 9) + i_68_);
			class523_sub34.method16310(is, 5, i_69_, 1367001348);
		} else
			is_66_ = Class654.method10718(anObjectArray5362[i], false, 1944025153);
		byte[] is_70_;
		try {
			is_70_ = Class558.decompress(is_66_, 1774078015);
		} catch (RuntimeException runtimeexception) {
			throw Class390.method6485(runtimeexception, new StringBuilder().append(is != null).append(" ").append(i).append(" ").append(is_66_.length).append(" ").append(Class590.method9774(is_66_, is_66_.length, -560533886)).append(" ").append(Class590.method9774(is_66_, is_66_.length - 2, -560533886)).append(" ").append(aClass460_5370.anIntArray5102[i]).append(" ").append(aClass460_5370.anInt5098 * -905910563).toString());
		}
		if (aBool5363)
			anObjectArray5362[i] = null;
		if (i_62_ > 1) {
			if (anInt5373 * 1505832067 != 2) {
				int i_71_ = is_70_.length;
				int i_72_ = is_70_[--i_71_] & 0xff;
				i_71_ -= 4 * (i_72_ * i_62_);
				RSBuffer class523_sub34 = new RSBuffer(is_70_);
				int[] is_73_ = new int[i_62_];
				class523_sub34.offset = i_71_ * 189765723;
				for (int i_74_ = 0; i_74_ < i_72_; i_74_++) {
					int i_75_ = 0;
					for (int i_76_ = 0; i_76_ < i_62_; i_76_++) {
						i_75_ += class523_sub34.readUnsignedInt((byte) -78);
						is_73_[i_76_] += i_75_;
					}
				}
				byte[][] is_77_ = new byte[i_62_][];
				for (int i_78_ = 0; i_78_ < i_62_; i_78_++) {
					is_77_[i_78_] = new byte[is_73_[i_78_]];
					is_73_[i_78_] = 0;
				}
				class523_sub34.offset = i_71_ * 189765723;
				int i_79_ = 0;
				for (int i_80_ = 0; i_80_ < i_72_; i_80_++) {
					int i_81_ = 0;
					for (int i_82_ = 0; i_82_ < i_62_; i_82_++) {
						i_81_ += class523_sub34.readUnsignedInt((byte) -80);
						System.arraycopy(is_70_, i_79_, is_77_[i_82_], is_73_[i_82_], i_81_);
						is_73_[i_82_] += i_81_;
						i_79_ += i_81_;
					}
				}
				for (int i_83_ = 0; i_83_ < i_62_; i_83_++) {
					int i_84_;
					if (null == is_63_)
						i_84_ = i_83_;
					else
						i_84_ = is_63_[i_83_];
					if (anInt5373 * 1505832067 == 0)
						objects[i_84_] = Class39.method1128(is_77_[i_83_], false, 208377585);
					else
						objects[i_84_] = is_77_[i_83_];
				}
			} else {
				int i_85_ = is_70_.length;
				int i_86_ = is_70_[--i_85_] & 0xff;
				i_85_ -= 4 * (i_86_ * i_62_);
				RSBuffer class523_sub34 = new RSBuffer(is_70_);
				int i_87_ = 0;
				int i_88_ = 0;
				class523_sub34.offset = 189765723 * i_85_;
				for (int i_89_ = 0; i_89_ < i_86_; i_89_++) {
					int i_90_ = 0;
					for (int i_91_ = 0; i_91_ < i_62_; i_91_++) {
						i_90_ += class523_sub34.readUnsignedInt((byte) -40);
						int i_92_;
						if (is_63_ == null)
							i_92_ = i_91_;
						else
							i_92_ = is_63_[i_91_];
						if (i_61_ == i_92_) {
							i_87_ += i_90_;
							i_88_ = i_92_;
						}
					}
				}
				if (i_87_ == 0)
					return true;
				byte[] is_93_ = new byte[i_87_];
				i_87_ = 0;
				class523_sub34.offset = i_85_ * 189765723;
				int i_94_ = 0;
				for (int i_95_ = 0; i_95_ < i_86_; i_95_++) {
					int i_96_ = 0;
					for (int i_97_ = 0; i_97_ < i_62_; i_97_++) {
						i_96_ += class523_sub34.readUnsignedInt((byte) -28);
						int i_98_;
						if (null == is_63_)
							i_98_ = i_97_;
						else
							i_98_ = is_63_[i_97_];
						if (i_61_ == i_98_) {
							System.arraycopy(is_70_, i_94_, is_93_, i_87_, i_96_);
							i_87_ += i_96_;
						}
						i_94_ += i_96_;
					}
				}
				objects[i_88_] = is_93_;
			}
		} else {
			int i_99_;
			if (null == is_63_)
				i_99_ = 0;
			else
				i_99_ = is_63_[0];
			if (1505832067 * anInt5373 == 0)
				objects[i_99_] = Class39.method1128(is_70_, false, -2133553919);
			else
				objects[i_99_] = is_70_;
		}
		return true;
	}

	synchronized boolean method7708(int i, int i_100_, int[] is) {
		if (!method7718(i, (byte) 68))
			return false;
		if (anObjectArray5362[i] == null)
			return false;
		int i_101_ = aClass460_5370.size[i];
		int[] is_102_ = aClass460_5370.anIntArrayArray5100[i];
		if (null == anObjectArrayArray5364[i])
			anObjectArrayArray5364[i] = new Object[aClass460_5370.anIntArray5106[i]];
		Object[] objects = anObjectArrayArray5364[i];
		boolean bool = true;
		for (int i_103_ = 0; i_103_ < i_101_; i_103_++) {
			int i_104_;
			if (is_102_ == null)
				i_104_ = i_103_;
			else
				i_104_ = is_102_[i_103_];
			if (objects[i_104_] == null) {
				bool = false;
				break;
			}
		}
		if (bool)
			return true;
		byte[] is_105_;
		if (null != is && (0 != is[0] || is[1] != 0 || is[2] != 0 || is[3] != 0)) {
			is_105_ = Class654.method10718(anObjectArray5362[i], true, -436496030);
			RSBuffer class523_sub34 = new RSBuffer(is_105_);
			int i_106_ = class523_sub34.readUnsignedByte(1092036252);
			int i_107_ = class523_sub34.readUnsignedInt((byte) -85);
			int i_108_ = ((i_106_ == Compression.UNCOMPRESSED.method82() ? 5 : 9) + i_107_);
			class523_sub34.method16310(is, 5, i_108_, -534816883);
		} else
			is_105_ = Class654.method10718(anObjectArray5362[i], false, 1920975850);
		byte[] is_109_;
		try {
			is_109_ = Class558.decompress(is_105_, -1846005820);
		} catch (RuntimeException runtimeexception) {
			throw Class390.method6485(runtimeexception, new StringBuilder().append(is != null).append(" ").append(i).append(" ").append(is_105_.length).append(" ").append(Class590.method9774(is_105_, is_105_.length, -560533886)).append(" ").append(Class590.method9774(is_105_, is_105_.length - 2, -560533886)).append(" ").append(aClass460_5370.anIntArray5102[i]).append(" ").append(aClass460_5370.anInt5098 * -905910563).toString());
		}
		if (aBool5363)
			anObjectArray5362[i] = null;
		if (i_101_ > 1) {
			if (anInt5373 * 1505832067 != 2) {
				int i_110_ = is_109_.length;
				int i_111_ = is_109_[--i_110_] & 0xff;
				i_110_ -= 4 * (i_111_ * i_101_);
				RSBuffer class523_sub34 = new RSBuffer(is_109_);
				int[] is_112_ = new int[i_101_];
				class523_sub34.offset = i_110_ * 189765723;
				for (int i_113_ = 0; i_113_ < i_111_; i_113_++) {
					int i_114_ = 0;
					for (int i_115_ = 0; i_115_ < i_101_; i_115_++) {
						i_114_ += class523_sub34.readUnsignedInt((byte) -79);
						is_112_[i_115_] += i_114_;
					}
				}
				byte[][] is_116_ = new byte[i_101_][];
				for (int i_117_ = 0; i_117_ < i_101_; i_117_++) {
					is_116_[i_117_] = new byte[is_112_[i_117_]];
					is_112_[i_117_] = 0;
				}
				class523_sub34.offset = i_110_ * 189765723;
				int i_118_ = 0;
				for (int i_119_ = 0; i_119_ < i_111_; i_119_++) {
					int i_120_ = 0;
					for (int i_121_ = 0; i_121_ < i_101_; i_121_++) {
						i_120_ += class523_sub34.readUnsignedInt((byte) -54);
						System.arraycopy(is_109_, i_118_, is_116_[i_121_], is_112_[i_121_], i_120_);
						is_112_[i_121_] += i_120_;
						i_118_ += i_120_;
					}
				}
				for (int i_122_ = 0; i_122_ < i_101_; i_122_++) {
					int i_123_;
					if (null == is_102_)
						i_123_ = i_122_;
					else
						i_123_ = is_102_[i_122_];
					if (anInt5373 * 1505832067 == 0)
						objects[i_123_] = Class39.method1128(is_116_[i_122_], false, -196481469);
					else
						objects[i_123_] = is_116_[i_122_];
				}
			} else {
				int i_124_ = is_109_.length;
				int i_125_ = is_109_[--i_124_] & 0xff;
				i_124_ -= 4 * (i_125_ * i_101_);
				RSBuffer class523_sub34 = new RSBuffer(is_109_);
				int i_126_ = 0;
				int i_127_ = 0;
				class523_sub34.offset = 189765723 * i_124_;
				for (int i_128_ = 0; i_128_ < i_125_; i_128_++) {
					int i_129_ = 0;
					for (int i_130_ = 0; i_130_ < i_101_; i_130_++) {
						i_129_ += class523_sub34.readUnsignedInt((byte) -39);
						int i_131_;
						if (is_102_ == null)
							i_131_ = i_130_;
						else
							i_131_ = is_102_[i_130_];
						if (i_100_ == i_131_) {
							i_126_ += i_129_;
							i_127_ = i_131_;
						}
					}
				}
				if (i_126_ == 0)
					return true;
				byte[] is_132_ = new byte[i_126_];
				i_126_ = 0;
				class523_sub34.offset = i_124_ * 189765723;
				int i_133_ = 0;
				for (int i_134_ = 0; i_134_ < i_125_; i_134_++) {
					int i_135_ = 0;
					for (int i_136_ = 0; i_136_ < i_101_; i_136_++) {
						i_135_ += class523_sub34.readUnsignedInt((byte) -93);
						int i_137_;
						if (null == is_102_)
							i_137_ = i_136_;
						else
							i_137_ = is_102_[i_136_];
						if (i_100_ == i_137_) {
							System.arraycopy(is_109_, i_133_, is_132_, i_126_, i_135_);
							i_126_ += i_135_;
						}
						i_133_ += i_135_;
					}
				}
				objects[i_127_] = is_132_;
			}
		} else {
			int i_138_;
			if (null == is_102_)
				i_138_ = 0;
			else
				i_138_ = is_102_[0];
			if (1505832067 * anInt5373 == 0)
				objects[i_138_] = Class39.method1128(is_109_, false, 225536420);
			else
				objects[i_138_] = is_109_;
		}
		return true;
	}

	public int method7709(String string) {
		if (!method7640((short) 20478))
			return -1;
		string = string.toLowerCase();
		int i = (aClass460_5370.aClass283_5104.method5127(Class369.method6346(string, (short) 5000), 1946864884));
		if (!method7718(i, (byte) -24))
			return -1;
		return i;
	}

	synchronized boolean method7710(int i, int i_139_, int[] is, byte i_140_) {
		if (!method7718(i, (byte) 19))
			return false;
		if (anObjectArray5362[i] == null)
			return false;
		int i_141_ = aClass460_5370.size[i];
		int[] is_142_ = aClass460_5370.anIntArrayArray5100[i];
		if (null == anObjectArrayArray5364[i])
			anObjectArrayArray5364[i] = new Object[aClass460_5370.anIntArray5106[i]];
		Object[] objects = anObjectArrayArray5364[i];
		boolean bool = true;
		for (int i_143_ = 0; i_143_ < i_141_; i_143_++) {
			int i_144_;
			if (is_142_ == null)
				i_144_ = i_143_;
			else
				i_144_ = is_142_[i_143_];
			if (objects[i_144_] == null) {
				bool = false;
				break;
			}
		}
		if (bool)
			return true;
		byte[] is_145_;
		if (null != is && (0 != is[0] || is[1] != 0 || is[2] != 0 || is[3] != 0)) {
			is_145_ = Class654.method10718(anObjectArray5362[i], true, -989794348);
			RSBuffer class523_sub34 = new RSBuffer(is_145_);
			int i_146_ = class523_sub34.readUnsignedByte(1838513953);
			int i_147_ = class523_sub34.readUnsignedInt((byte) -80);
			int i_148_ = ((i_146_ == Compression.UNCOMPRESSED.method82() ? 5 : 9) + i_147_);
			class523_sub34.method16310(is, 5, i_148_, 669663339);
		} else
			is_145_ = Class654.method10718(anObjectArray5362[i], false, -1310304482);
		byte[] is_149_;
		try {
			is_149_ = Class558.decompress(is_145_, 1767529033);
		} catch (RuntimeException runtimeexception) {
			throw Class390.method6485(runtimeexception, new StringBuilder().append(is != null).append(" ").append(i).append(" ").append(is_145_.length).append(" ").append(Class590.method9774(is_145_, is_145_.length, -560533886)).append(" ").append(Class590.method9774(is_145_, is_145_.length - 2, -560533886)).append(" ").append(aClass460_5370.anIntArray5102[i]).append(" ").append(aClass460_5370.anInt5098 * -905910563).toString());
		}
		if (aBool5363)
			anObjectArray5362[i] = null;
		if (i_141_ > 1) {
			if (anInt5373 * 1505832067 != 2) {
				int i_150_ = is_149_.length;
				int i_151_ = is_149_[--i_150_] & 0xff;
				i_150_ -= 4 * (i_151_ * i_141_);
				RSBuffer class523_sub34 = new RSBuffer(is_149_);
				int[] is_152_ = new int[i_141_];
				class523_sub34.offset = i_150_ * 189765723;
				for (int i_153_ = 0; i_153_ < i_151_; i_153_++) {
					int i_154_ = 0;
					for (int i_155_ = 0; i_155_ < i_141_; i_155_++) {
						i_154_ += class523_sub34.readUnsignedInt((byte) -47);
						is_152_[i_155_] += i_154_;
					}
				}
				byte[][] is_156_ = new byte[i_141_][];
				for (int i_157_ = 0; i_157_ < i_141_; i_157_++) {
					is_156_[i_157_] = new byte[is_152_[i_157_]];
					is_152_[i_157_] = 0;
				}
				class523_sub34.offset = i_150_ * 189765723;
				int i_158_ = 0;
				for (int i_159_ = 0; i_159_ < i_151_; i_159_++) {
					int i_160_ = 0;
					for (int i_161_ = 0; i_161_ < i_141_; i_161_++) {
						i_160_ += class523_sub34.readUnsignedInt((byte) -98);
						System.arraycopy(is_149_, i_158_, is_156_[i_161_], is_152_[i_161_], i_160_);
						is_152_[i_161_] += i_160_;
						i_158_ += i_160_;
					}
				}
				for (int i_162_ = 0; i_162_ < i_141_; i_162_++) {
					int i_163_;
					if (null == is_142_)
						i_163_ = i_162_;
					else
						i_163_ = is_142_[i_162_];
					if (anInt5373 * 1505832067 == 0)
						objects[i_163_] = Class39.method1128(is_156_[i_162_], false, -1963741470);
					else
						objects[i_163_] = is_156_[i_162_];
				}
			} else {
				int i_164_ = is_149_.length;
				int i_165_ = is_149_[--i_164_] & 0xff;
				i_164_ -= 4 * (i_165_ * i_141_);
				RSBuffer class523_sub34 = new RSBuffer(is_149_);
				int i_166_ = 0;
				int i_167_ = 0;
				class523_sub34.offset = 189765723 * i_164_;
				for (int i_168_ = 0; i_168_ < i_165_; i_168_++) {
					int i_169_ = 0;
					for (int i_170_ = 0; i_170_ < i_141_; i_170_++) {
						i_169_ += class523_sub34.readUnsignedInt((byte) -13);
						int i_171_;
						if (is_142_ == null)
							i_171_ = i_170_;
						else
							i_171_ = is_142_[i_170_];
						if (i_139_ == i_171_) {
							i_166_ += i_169_;
							i_167_ = i_171_;
						}
					}
				}
				if (i_166_ == 0)
					return true;
				byte[] is_172_ = new byte[i_166_];
				i_166_ = 0;
				class523_sub34.offset = i_164_ * 189765723;
				int i_173_ = 0;
				for (int i_174_ = 0; i_174_ < i_165_; i_174_++) {
					int i_175_ = 0;
					for (int i_176_ = 0; i_176_ < i_141_; i_176_++) {
						i_175_ += class523_sub34.readUnsignedInt((byte) -27);
						int i_177_;
						if (null == is_142_)
							i_177_ = i_176_;
						else
							i_177_ = is_142_[i_176_];
						if (i_139_ == i_177_) {
							System.arraycopy(is_149_, i_173_, is_172_, i_166_, i_175_);
							i_166_ += i_175_;
						}
						i_173_ += i_175_;
					}
				}
				objects[i_167_] = is_172_;
			}
		} else {
			int i_178_;
			if (null == is_142_)
				i_178_ = 0;
			else
				i_178_ = is_142_[0];
			if (1505832067 * anInt5373 == 0)
				objects[i_178_] = Class39.method1128(is_149_, false, -1929450208);
			else
				objects[i_178_] = is_149_;
		}
		return true;
	}

	public int method7711(String string) {
		if (!method7640((short) 31285))
			return -1;
		string = string.toLowerCase();
		int i = (aClass460_5370.aClass283_5104.method5127(Class369.method6346(string, (short) 5000), 1623002067));
		if (!method7718(i, (byte) 33))
			return -1;
		return i;
	}

	public int method7712(String string) {
		if (!method7640((short) 15708))
			return -1;
		string = string.toLowerCase();
		int i = (aClass460_5370.aClass283_5104.method5127(Class369.method6346(string, (short) 5000), 1965360618));
		if (!method7718(i, (byte) 48))
			return -1;
		return i;
	}

	public int method7713(int i) {
		if (!method7640((short) 19880))
			return -1;
		int i_179_ = aClass460_5370.aClass283_5104.method5127(i, 1879530434);
		if (!method7718(i_179_, (byte) -45))
			return -1;
		return i_179_;
	}

	public int method7714(int i) {
		if (!method7640((short) 11311))
			return -1;
		int i_180_ = aClass460_5370.aClass283_5104.method5127(i, 1721151681);
		if (!method7718(i_180_, (byte) -23))
			return -1;
		return i_180_;
	}

	public int method7715(int i) {
		if (!method7640((short) 7402))
			return -1;
		int i_181_ = aClass460_5370.aClass283_5104.method5127(i, 1607230392);
		if (!method7718(i_181_, (byte) 16))
			return -1;
		return i_181_;
	}

	public boolean method7716(String string, int i) {
		if (!method7640((short) 24987))
			return false;
		string = string.toLowerCase();
		int i_182_ = (aClass460_5370.aClass283_5104.method5127(Class369.method6346(string, (short) 5000), 1905469705));
		return method7651(i_182_, (byte) -71);
	}

	public synchronized int method7717() {
		if (!method7640((short) 32012))
			return 0;
		int i = 0;
		int i_183_ = 0;
		for (int i_184_ = 0; i_184_ < anObjectArray5362.length; i_184_++) {
			if (aClass460_5370.size[i_184_] > 0) {
				i += 100;
				i_183_ += method7653(i_184_, 1956920883);
			}
		}
		if (i == 0)
			return 100;
		int i_185_ = i_183_ * 100 / i;
		return i_185_;
	}

	public Class472(Class467 class467, boolean bool, int i) {
		if (i < 0 || i > 2)
			throw new IllegalArgumentException("");
		aClass467_5371 = class467;
		aBool5363 = bool;
		anInt5373 = i * -3046869;
	}

	synchronized boolean method7718(int i, byte i_186_) {
		if (!method7640((short) 28983))
			return false;
		if (i < 0 || i >= aClass460_5370.anIntArray5106.length || aClass460_5370.anIntArray5106[i] == 0) {
			if (aBool5365)
				throw new IllegalArgumentException(Integer.toString(i));
			return false;
		}
		return true;
	}

	public int method7719(short i) {
		if (!method7640((short) 10064))
			throw new IllegalStateException("");
		return -905910563 * aClass460_5370.anInt5098;
	}

	public boolean method7720(String string) {
		if (!method7640((short) 15482))
			return false;
		string = string.toLowerCase();
		int i = (aClass460_5370.aClass283_5104.method5127(Class369.method6346(string, (short) 5000), 2038352872));
		if (i < 0)
			return false;
		return true;
	}

	public synchronized byte[] method7721(int i, int i_187_) {
		if (!method7640((short) 27599))
			return null;
		if (1 == aClass460_5370.anIntArray5106.length)
			return method7688(0, i, -1414328396);
		if (!method7718(i, (byte) 13))
			return null;
		if (aClass460_5370.anIntArray5106[i] == 1)
			return method7688(i, 0, 361874593);
		throw new RuntimeException();
	}

	public synchronized byte[] method7722(String string, String string_188_) {
		if (!method7640((short) 13825))
			return null;
		string = string.toLowerCase();
		string_188_ = string_188_.toLowerCase();
		int i = (aClass460_5370.aClass283_5104.method5127(Class369.method6346(string, (short) 5000), 1818046782));
		if (!method7718(i, (byte) -3))
			return null;
		int i_189_ = (aClass460_5370.aClass283Array5115[i].method5127(Class369.method6346(string_188_, (short) 5000), 1981080668));
		return method7688(i, i_189_, 906993402);
	}

	boolean method7723(String string, String string_190_) {
		if (!method7640((short) 30174))
			return false;
		string = string.toLowerCase();
		string_190_ = string_190_.toLowerCase();
		int i = (aClass460_5370.aClass283_5104.method5127(Class369.method6346(string, (short) 5000), 2016337292));
		if (!method7718(i, (byte) -116))
			return false;
		int i_191_ = (aClass460_5370.aClass283Array5115[i].method5127(Class369.method6346(string_190_, (short) 5000), 1781974921));
		return method7663(i, i_191_, 1089230115);
	}

	boolean method7724(String string, String string_192_) {
		if (!method7640((short) 4685))
			return false;
		string = string.toLowerCase();
		string_192_ = string_192_.toLowerCase();
		int i = (aClass460_5370.aClass283_5104.method5127(Class369.method6346(string, (short) 5000), 1723270319));
		if (!method7718(i, (byte) 55))
			return false;
		int i_193_ = (aClass460_5370.aClass283Array5115[i].method5127(Class369.method6346(string_192_, (short) 5000), 2049780250));
		return method7663(i, i_193_, 1089230115);
	}

	boolean method7725(String string, String string_194_) {
		if (!method7640((short) 1220))
			return false;
		string = string.toLowerCase();
		string_194_ = string_194_.toLowerCase();
		int i = (aClass460_5370.aClass283_5104.method5127(Class369.method6346(string, (short) 5000), 1945316396));
		if (!method7718(i, (byte) 21))
			return false;
		int i_195_ = (aClass460_5370.aClass283Array5115[i].method5127(Class369.method6346(string_194_, (short) 5000), 1703871584));
		return method7663(i, i_195_, 1089230115);
	}

	public synchronized boolean method7726(int i) {
		if (!method7718(i, (byte) -5))
			return false;
		if (null != anObjectArray5362[i])
			return true;
		method7672(i, (short) 256);
		if (null != anObjectArray5362[i])
			return true;
		return false;
	}

	public boolean method7727(String string) {
		int i = method7646("", (byte) -54);
		if (-1 != i)
			return method7668("", string, -646384972);
		return method7668(string, "", -1048980498);
	}

	synchronized boolean method7728() {
		if (aClass460_5370 == null) {
			aClass460_5370 = aClass467_5371.method7583(-1160257881);
			if (null == aClass460_5370)
				return false;
			anObjectArray5362 = new Object[aClass460_5370.archives * -132118613];
			anObjectArrayArray5364 = new Object[aClass460_5370.archives * -132118613][];
		}
		return true;
	}

	public synchronized void method7729(int i) {
		if (method7718(i, (byte) -23)) {
			if (anObjectArrayArray5364 != null)
				anObjectArrayArray5364[i] = null;
		}
	}

	public boolean method7730(String string) {
		if (!method7640((short) 18926))
			return false;
		string = string.toLowerCase();
		int i = (aClass460_5370.aClass283_5104.method5127(Class369.method6346(string, (short) 5000), 1950768011));
		return method7651(i, (byte) -2);
	}

	public int method7731(String string) {
		if (!method7640((short) 20787))
			return 0;
		string = string.toLowerCase();
		int i = (aClass460_5370.aClass283_5104.method5127(Class369.method6346(string, (short) 5000), 1819319648));
		return method7653(i, 1274956787);
	}

	public int method7732(String string) {
		if (!method7640((short) 28002))
			return 0;
		string = string.toLowerCase();
		int i = (aClass460_5370.aClass283_5104.method5127(Class369.method6346(string, (short) 5000), 1877431161));
		return method7653(i, 234710541);
	}

	static final byte[] method7733(byte[] is) {
		RSBuffer class523_sub34 = new RSBuffer(is);
		CompressionArchive class462 = new CompressionArchive(class523_sub34);
		Compression class450 = class462.getCompressionType(-1606157394);
		int i = class462.getLength((byte) 55);
		if (i < 0 || 1453975341 * MAX_LENGTH != 0 && i > 1453975341 * MAX_LENGTH)
			throw new RuntimeException();
		if (Compression.UNCOMPRESSED == class450) {
			byte[] is_196_ = new byte[i];
			class523_sub34.readBytes(is_196_, 0, i, (byte) 22);
			return is_196_;
		}
		int i_197_ = class462.getCompressedLength(-506650229);
		if (i_197_ < 0 || 0 != 1453975341 * MAX_LENGTH && i_197_ > 1453975341 * MAX_LENGTH)
			throw new RuntimeException();
		byte[] is_198_;
		if (Compression.BZIP2 == class450) {
			is_198_ = new byte[i_197_];
			BZIP2.decompress(is_198_, i_197_, is, i, 9);
		} else if (Compression.GZIP == class450) {
			is_198_ = new byte[i_197_];
			synchronized (aClass79_5366) {
				aClass79_5366.decompress(class523_sub34, is_198_, 2130182506);
			}
		} else if (class450 == Compression.LZMA) {
			try {
				is_198_ = RSStream.decompress(class523_sub34, i_197_, -2137074081);
			} catch (IOException ioexception) {
				throw new RuntimeException(ioexception);
			}
		} else
			throw new RuntimeException();
		return is_198_;
	}

	static final byte[] method7734(byte[] data) {
		RSBuffer buffer = new RSBuffer(data);
		CompressionArchive class462 = new CompressionArchive(buffer);
		Compression compressionType = class462.getCompressionType(-1427586481);
		int i = class462.getLength((byte) -8);
		if (i < 0 || 1453975341 * MAX_LENGTH != 0 && i > 1453975341 * MAX_LENGTH)
			throw new RuntimeException();
		if (Compression.UNCOMPRESSED == compressionType) {
			byte[] is_199_ = new byte[i];
			buffer.readBytes(is_199_, 0, i, (byte) -48);
			return is_199_;
		}
		int i_200_ = class462.getCompressedLength(1147587952);
		if (i_200_ < 0 || 0 != 1453975341 * MAX_LENGTH && i_200_ > 1453975341 * MAX_LENGTH)
			throw new RuntimeException();
		byte[] is_201_;
		if (Compression.BZIP2 == compressionType) {
			is_201_ = new byte[i_200_];
			BZIP2.decompress(is_201_, i_200_, data, i, 9);
		} else if (Compression.GZIP == compressionType) {
			is_201_ = new byte[i_200_];
			synchronized (aClass79_5366) {
				aClass79_5366.decompress(buffer, is_201_, 2145784036);
			}
		} else if (compressionType == Compression.LZMA) {
			try {
				is_201_ = RSStream.decompress(buffer, i_200_, -322140907);
			} catch (IOException ioexception) {
				throw new RuntimeException(ioexception);
			}
		} else
			throw new RuntimeException();
		return is_201_;
	}

	static final byte[] method7735(byte[] is) {
		RSBuffer class523_sub34 = new RSBuffer(is);
		CompressionArchive class462 = new CompressionArchive(class523_sub34);
		Compression class450 = class462.getCompressionType(-1333602216);
		int i = class462.getLength((byte) -68);
		if (i < 0 || 1453975341 * MAX_LENGTH != 0 && i > 1453975341 * MAX_LENGTH)
			throw new RuntimeException();
		if (Compression.UNCOMPRESSED == class450) {
			byte[] is_202_ = new byte[i];
			class523_sub34.readBytes(is_202_, 0, i, (byte) 105);
			return is_202_;
		}
		int i_203_ = class462.getCompressedLength(322126363);
		if (i_203_ < 0 || 0 != 1453975341 * MAX_LENGTH && i_203_ > 1453975341 * MAX_LENGTH)
			throw new RuntimeException();
		byte[] is_204_;
		if (Compression.BZIP2 == class450) {
			is_204_ = new byte[i_203_];
			BZIP2.decompress(is_204_, i_203_, is, i, 9);
		} else if (Compression.GZIP == class450) {
			is_204_ = new byte[i_203_];
			synchronized (aClass79_5366) {
				aClass79_5366.decompress(class523_sub34, is_204_, 2104901176);
			}
		} else if (class450 == Compression.LZMA) {
			try {
				is_204_ = RSStream.decompress(class523_sub34, i_203_, 291760135);
			} catch (IOException ioexception) {
				throw new RuntimeException(ioexception);
			}
		} else
			throw new RuntimeException();
		return is_204_;
	}

	static void method7736(Class669 class669, byte i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class222.method4140(-552723671);
	}

	static final void method7737(Class669 class669, int i) {
		int i_205_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		if (2 == 326760831 * client.anInt11235 && i_205_ < 1563815891 * client.anInt11287)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = client.aClass60Array11182[i_205_].aBool762 ? 1 : 0;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}
}
