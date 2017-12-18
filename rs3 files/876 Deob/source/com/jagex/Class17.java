/* Class17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Date;

public class Class17 implements Interface13, Interface6 {
	Class464[][] aClass464ArrayArray189;
	Object[][] anObjectArrayArray190;
	static String aString191;
	public static int anInt192;

	void method772(RSBuffer class523_sub34, int i, int i_0_) {
		if (3 == i) {
			int i_1_ = class523_sub34.readUnsignedByte(-253894589);
			if (null == anObjectArrayArray190) {
				anObjectArrayArray190 = new Object[i_1_][];
				aClass464ArrayArray189 = new Class464[i_1_][];
			}
			for (int i_2_ = class523_sub34.readUnsignedByte(800234314); 255 != i_2_; i_2_ = class523_sub34.readUnsignedByte(-88601404)) {
				int i_3_ = class523_sub34.readUnsignedByte(1994773078);
				Class464[] class464s = new Class464[i_3_];
				for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
					class464s[i_4_] = ((Class464) Class334.method5910(Class464.method7532((byte) -5), class523_sub34.readUnsignedSmart(368514876), -591798519));
				anObjectArrayArray190[i_2_] = Class525.method8709(class523_sub34, class464s, -1626409258);
				aClass464ArrayArray189[i_2_] = class464s;
			}
		}
	}

	public void readValues(RSBuffer class523_sub34, int i) {
		for (;;) {
			int i_5_ = class523_sub34.readUnsignedByte(104973570);
			if (0 == i_5_)
				break;
			method772(class523_sub34, i_5_, -1565460130);
		}
	}

	public Object[] method773(int i, byte i_6_) {
		if (null == anObjectArrayArray190)
			return null;
		return anObjectArrayArray190[i];
	}

	public void method60(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-1516056212);
			if (0 == i)
				break;
			method772(class523_sub34, i, -1565460130);
		}
	}

	public void method74(byte i) {
		/* empty */
	}

	public void method52(int i, byte i_7_) {
		/* empty */
	}

	public void method75(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-1257817366);
			if (0 == i)
				break;
			method772(class523_sub34, i, -1565460130);
		}
	}

	Class17() {
		/* empty */
	}

	public void method73() {
		/* empty */
	}

	public void method63(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(-1700200194);
			if (0 == i)
				break;
			method772(class523_sub34, i, -1565460130);
		}
	}

	public void readValues(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(1634567731);
			if (0 == i)
				break;
			method772(class523_sub34, i, -1565460130);
		}
	}

	public void method58(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(1178599844);
			if (0 == i)
				break;
			method772(class523_sub34, i, -1565460130);
		}
	}

	public void method78() {
		/* empty */
	}

	public void method79() {
		/* empty */
	}

	public void method77() {
		/* empty */
	}

	public void method76(RSBuffer class523_sub34) {
		for (;;) {
			int i = class523_sub34.readUnsignedByte(1854474466);
			if (0 == i)
				break;
			method772(class523_sub34, i, -1565460130);
		}
	}

	public void method51(int i) {
		/* empty */
	}

	public Object[] method774(int i) {
		if (null == anObjectArrayArray190)
			return null;
		return anObjectArrayArray190[i];
	}

	void method775(RSBuffer class523_sub34, int i) {
		if (3 == i) {
			int i_8_ = class523_sub34.readUnsignedByte(965739606);
			if (null == anObjectArrayArray190) {
				anObjectArrayArray190 = new Object[i_8_][];
				aClass464ArrayArray189 = new Class464[i_8_][];
			}
			for (int i_9_ = class523_sub34.readUnsignedByte(-803663641); 255 != i_9_; i_9_ = class523_sub34.readUnsignedByte(-649715283)) {
				int i_10_ = class523_sub34.readUnsignedByte(615153785);
				Class464[] class464s = new Class464[i_10_];
				for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
					class464s[i_11_] = ((Class464) Class334.method5910(Class464.method7532((byte) 22), class523_sub34.readUnsignedSmart(368514876), -531222271));
				anObjectArrayArray190[i_9_] = Class525.method8709(class523_sub34, class464s, -881642933);
				aClass464ArrayArray189[i_9_] = class464s;
			}
		}
	}

	static void method776(long l) {
		Class91.aCalendar893.setTime(new Date(l));
	}

	static final void method777(Class669 class669, int i) {
		int i_12_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_12_, -794045031);
		Class242 class242 = Class31.aClass242Array302[i_12_ >> 16];
		Class145_Sub1.method14915(class250, class242, class669, (byte) 3);
	}

	static void method778(int i, int i_13_) {
		/* empty */
	}
}
