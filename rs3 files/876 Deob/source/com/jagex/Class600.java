/* Class600 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class Class600 implements Iterable {
	Class631[] aClass631Array7846;
	Class618[] aClass618Array7847;

	public Iterator iterator() {
		return new Class622(aClass618Array7847);
	}

	void method9862(byte i) {
		aClass618Array7847 = null;
	}

	void method9863(byte[] is) {
		method9862((byte) 0);
		if (is == null)
			aClass618Array7847 = new Class618[0];
		else
			method9864(new RSBuffer(is), -1855761452);
	}

	void method9864(RSBuffer class523_sub34, int i) {
		for (;;) {
			int i_0_ = class523_sub34.readUnsignedByte(-1508977380);
			if (0 == i_0_)
				break;
			if (i_0_ == 1) {
				int i_1_ = class523_sub34.readUnsignedByte(-920701078);
				int i_2_ = 0;
				LinkedList linkedlist = new LinkedList();
				for (int i_3_ = 0; i_3_ < i_1_; i_3_++) {
					int i_4_ = class523_sub34.readUnsignedByte(263871593);
					int i_5_ = class523_sub34.readUnsignedShort(-1791140098);
					int i_6_ = class523_sub34.readUnsignedByte(1486014333);
					int i_7_ = 0;
					Class631 class631 = Class631.aClass631_8240;
					byte i_8_ = 1;
					boolean bool = (i_6_ & 0x1) != 0;
					if (0 != (i_6_ & 0x2))
						i_7_ = class523_sub34.readUnsignedByte(1134755058);
					if (0 != (i_6_ & 0x4))
						class631 = (aClass631Array7846[class523_sub34.readUnsignedByte(675603418)]);
					if (0 != (i_6_ & 0x8))
						i_8_ = class523_sub34.readByte((short) -923);
					boolean bool_9_ = class523_sub34.readUnsignedByte(1313593808) == 1;
					linkedlist.add(new Class618(i_4_, i_5_, bool, bool_9_, i_7_, class631, i_8_));
					if (i_4_ > i_2_)
						i_2_ = i_4_;
				}
				aClass618Array7847 = new Class618[1 + i_2_];
				Iterator iterator = linkedlist.iterator();
				while (iterator.hasNext()) {
					Class618 class618 = (Class618) iterator.next();
					aClass618Array7847[class618.method10092((byte) -92)] = class618;
				}
			} else if (2 == i_0_) {
				aClass631Array7846 = new Class631[class523_sub34.readUnsignedByte(2108423839)];
				for (int i_10_ = class523_sub34.readUnsignedByte(498924285); i_10_ != 255; i_10_ = class523_sub34.readUnsignedByte(-2054092146)) {
					int[] is = new int[class523_sub34.readUnsignedShort(-524197524)];
					for (int i_11_ = 0; i_11_ < is.length; i_11_++)
						is[i_11_] = class523_sub34.readUnsignedInt((byte) -29);
					aClass631Array7846[i_10_] = new Class631(is);
				}
			}
		}
	}

	public int method9865(int i) {
		return aClass618Array7847.length;
	}

	public Class618 method9866(int i, int i_12_) {
		return aClass618Array7847[i];
	}

	void method9867() {
		aClass618Array7847 = null;
	}

	public Iterator method9868() {
		return new Class622(aClass618Array7847);
	}

	void method9869(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-71590371);
			if (0 == i)
				break;
			if (i == 1) {
				int i_13_ = class523_sub34.readUnsignedByte(911261795);
				int i_14_ = 0;
				LinkedList linkedlist = new LinkedList();
				for (int i_15_ = 0; i_15_ < i_13_; i_15_++) {
					int i_16_ = class523_sub34.readUnsignedByte(625263698);
					int i_17_ = class523_sub34.readUnsignedShort(-1799595591);
					int i_18_ = class523_sub34.readUnsignedByte(-1465259748);
					int i_19_ = 0;
					Class631 class631 = Class631.aClass631_8240;
					byte i_20_ = 1;
					boolean bool = (i_18_ & 0x1) != 0;
					if (0 != (i_18_ & 0x2))
						i_19_ = class523_sub34.readUnsignedByte(1678822666);
					if (0 != (i_18_ & 0x4))
						class631 = (aClass631Array7846[class523_sub34.readUnsignedByte(-2134639284)]);
					if (0 != (i_18_ & 0x8))
						i_20_ = class523_sub34.readByte((short) -19615);
					boolean bool_21_ = class523_sub34.readUnsignedByte(1652813266) == 1;
					linkedlist.add(new Class618(i_16_, i_17_, bool, bool_21_, i_19_, class631, i_20_));
					if (i_16_ > i_14_)
						i_14_ = i_16_;
				}
				aClass618Array7847 = new Class618[1 + i_14_];
				Iterator iterator = linkedlist.iterator();
				while (iterator.hasNext()) {
					Class618 class618 = (Class618) iterator.next();
					aClass618Array7847[class618.method10092((byte) -53)] = class618;
				}
			} else if (2 == i) {
				aClass631Array7846 = new Class631[class523_sub34.readUnsignedByte(-293705366)];
				for (int i_22_ = class523_sub34.readUnsignedByte(-1025747166); i_22_ != 255; i_22_ = class523_sub34.readUnsignedByte(181258021)) {
					int[] is = new int[class523_sub34.readUnsignedShort(-195108334)];
					for (int i_23_ = 0; i_23_ < is.length; i_23_++)
						is[i_23_] = class523_sub34.readUnsignedInt((byte) -125);
					aClass631Array7846[i_22_] = new Class631(is);
				}
			}
		}
	}

	void method9870() {
		aClass618Array7847 = null;
	}

	void method9871() {
		aClass618Array7847 = null;
	}

	public Class618 method9872(int i) {
		return aClass618Array7847[i];
	}

	void method9873(byte[] is) {
		method9862((byte) 0);
		if (is == null)
			aClass618Array7847 = new Class618[0];
		else
			method9864(new RSBuffer(is), -1908630419);
	}

	void method9874(byte[] is) {
		method9862((byte) 0);
		if (is == null)
			aClass618Array7847 = new Class618[0];
		else
			method9864(new RSBuffer(is), -1687979734);
	}

	void method9875(byte[] is) {
		method9862((byte) 0);
		if (is == null)
			aClass618Array7847 = new Class618[0];
		else
			method9864(new RSBuffer(is), -1937355322);
	}

	void method9876(byte[] is) {
		method9862((byte) 0);
		if (is == null)
			aClass618Array7847 = new Class618[0];
		else
			method9864(new RSBuffer(is), -1785066546);
	}

	void method9877(byte[] is, int i) {
		method9862((byte) 0);
		if (is == null)
			aClass618Array7847 = new Class618[0];
		else
			method9864(new RSBuffer(is), -1778826010);
	}

	public Class618 method9878(int i) {
		return aClass618Array7847[i];
	}

	public Class600(Class472 class472) {
		method9877(class472.method7721((1325648699 * Class620.aClass620_8070.anInt8073), -387132909), 65535);
	}

	public Class618 method9879(int i) {
		return aClass618Array7847[i];
	}

	static final void method9880(InterfaceComponentDefinitions class250, int i, byte[] is, byte[] is_24_, Class669 class669, int i_25_) {
		if (class250.aByteArrayArray2530 == null) {
			if (null != is) {
				class250.aByteArrayArray2530 = new byte[11][];
				class250.aByteArrayArray2669 = new byte[11][];
				class250.anIntArray2537 = new int[11];
				class250.anIntArray2619 = new int[11];
				class250.anIntArray2620 = new int[11];
			} else
				return;
		}
		class250.aByteArrayArray2530[i] = is;
		if (is != null)
			class250.aBool2615 = true;
		else {
			class250.aBool2615 = false;
			for (int i_26_ = 0; i_26_ < class250.aByteArrayArray2530.length; i_26_++) {
				if (class250.aByteArrayArray2530[i_26_] != null || class250.anIntArray2620[i_26_] > 0) {
					class250.aBool2615 = true;
					break;
				}
			}
		}
		class250.aByteArrayArray2669[i] = is_24_;
	}

	static final void method9881(Class669 class669, byte i) {
		int i_27_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		Class523_Sub27_Sub17 class523_sub27_sub17 = Class534.method8813(i_27_);
		if (null == class523_sub27_sub17)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class523_sub27_sub17.anInt11827 * -843169111;
	}

	public static Map method9882(Class98_Sub1[] class98_sub1s, int i) {
		if (class98_sub1s == null || 0 == class98_sub1s.length)
			return null;
		HashMap hashmap = new HashMap();
		Class98_Sub1[] class98_sub1s_28_ = class98_sub1s;
		for (int i_29_ = 0; i_29_ < class98_sub1s_28_.length; i_29_++) {
			Class98_Sub1 class98_sub1 = class98_sub1s_28_[i_29_];
			hashmap.put(class98_sub1.aClass470_8890, class98_sub1);
		}
		return hashmap;
	}
}
