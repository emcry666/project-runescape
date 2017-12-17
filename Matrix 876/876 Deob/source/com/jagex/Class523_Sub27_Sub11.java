/* Class523_Sub27_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class523_Sub27_Sub11 extends Class523_Sub27 {
	int anInt11741;
	byte[][] aByteArrayArray11742;
	Class169[] aClass169Array11743;

	public boolean method18114(int i) {
		return aClass169Array11743[i].aBool1818;
	}

	public boolean method18115(int i) {
		return aClass169Array11743[i].aBool1817;
	}

	public boolean method18116(int i, int i_0_) {
		return aClass169Array11743[i].aBool1811;
	}

	public Class523_Sub27_Sub11(int i) {
		anInt11741 = i * -693734371;
	}

	public boolean method18117(int i, byte i_1_) {
		return aClass169Array11743[i].aBool1818;
	}

	public boolean method18118() {
		if (null != aClass169Array11743)
			return true;
		if (null == aByteArrayArray11742) {
			synchronized (Class635.aClass472_8281) {
				if (!Class635.aClass472_8281.method7651(anInt11741 * 1547955765, (byte) -91)) {
					boolean bool = false;
					return bool;
				}
				int[] is = Class635.aClass472_8281.method7656(anInt11741 * 1547955765, -1311684553);
				aByteArrayArray11742 = new byte[is.length][];
				for (int i = 0; i < is.length; i++)
					aByteArrayArray11742[i] = Class635.aClass472_8281.method7688((anInt11741 * 1547955765), is[i], 1854117704);
			}
		}
		boolean bool = true;
		for (int i = 0; i < aByteArrayArray11742.length; i++) {
			byte[] is = aByteArrayArray11742[i];
			RSBuffer class523_sub34 = new RSBuffer(is);
			class523_sub34.offset = 189765723;
			int i_2_ = class523_sub34.readUnsignedShort(-581422856);
			synchronized (Class449.aClass472_4948) {
				bool &= Class449.aClass472_4948.method7650(i_2_, -206571634);
			}
		}
		if (!bool)
			return false;
		Class708 class708 = new Class708();
		int[] is;
		synchronized (Class635.aClass472_8281) {
			int i = Class635.aClass472_8281.method7702(1547955765 * anInt11741, (byte) 65);
			aClass169Array11743 = new Class169[i];
			is = Class635.aClass472_8281.method7656(anInt11741 * 1547955765, -1630027363);
		}
		for (int i = 0; i < is.length; i++) {
			byte[] is_3_ = aByteArrayArray11742[i];
			RSBuffer class523_sub34 = new RSBuffer(is_3_);
			class523_sub34.offset = 189765723;
			int i_4_ = class523_sub34.readUnsignedShort(-1057504267);
			Class523_Sub15 class523_sub15 = null;
			for (Class523_Sub15 class523_sub15_5_ = (Class523_Sub15) class708.method14240(1824362232); class523_sub15_5_ != null; class523_sub15_5_ = (Class523_Sub15) class708.method14244((byte) -85)) {
				if (i_4_ == class523_sub15_5_.anInt10458 * -384894989) {
					class523_sub15 = class523_sub15_5_;
					break;
				}
			}
			if (class523_sub15 == null) {
				synchronized (Class449.aClass472_4948) {
					class523_sub15 = new Class523_Sub15(i_4_, (Class449.aClass472_4948.method7721(i_4_, -387132909)));
				}
				class708.method14236(class523_sub15, -568919792);
			}
			aClass169Array11743[is[i]] = new Class169(is_3_, class523_sub15);
		}
		aByteArrayArray11742 = null;
		return true;
	}

	public boolean method18119(int i) {
		return aClass169Array11743[i].aBool1811;
	}

	public boolean method18120(int i) {
		return aClass169Array11743[i].aBool1811;
	}

	public boolean method18121(int i) {
		return aClass169Array11743[i].aBool1811;
	}

	public boolean method18122(int i) {
		return aClass169Array11743[i].aBool1817;
	}

	public boolean method18123(int i, byte i_6_) {
		return aClass169Array11743[i].aBool1817;
	}

	public boolean method18124(int i) {
		return aClass169Array11743[i].aBool1818;
	}

	public boolean method18125(int i) {
		return aClass169Array11743[i].aBool1818;
	}

	public boolean method18126(int i) {
		return aClass169Array11743[i].aBool1818;
	}

	public boolean method18127(int i) {
		return aClass169Array11743[i].aBool1818;
	}

	public boolean method18128(byte i) {
		if (null != aClass169Array11743)
			return true;
		if (null == aByteArrayArray11742) {
			synchronized (Class635.aClass472_8281) {
				if (!Class635.aClass472_8281.method7651(anInt11741 * 1547955765, (byte) -67)) {
					boolean bool = false;
					return bool;
				}
				int[] is = Class635.aClass472_8281.method7656(anInt11741 * 1547955765, -1149205251);
				aByteArrayArray11742 = new byte[is.length][];
				for (int i_7_ = 0; i_7_ < is.length; i_7_++)
					aByteArrayArray11742[i_7_] = Class635.aClass472_8281.method7688((anInt11741 * 1547955765), is[i_7_], 1442994589);
			}
		}
		boolean bool = true;
		for (int i_8_ = 0; i_8_ < aByteArrayArray11742.length; i_8_++) {
			byte[] is = aByteArrayArray11742[i_8_];
			RSBuffer class523_sub34 = new RSBuffer(is);
			class523_sub34.offset = 189765723;
			int i_9_ = class523_sub34.readUnsignedShort(-1484500208);
			synchronized (Class449.aClass472_4948) {
				bool &= Class449.aClass472_4948.method7650(i_9_, -933638213);
			}
		}
		if (!bool)
			return false;
		Class708 class708 = new Class708();
		int[] is;
		synchronized (Class635.aClass472_8281) {
			int i_10_ = Class635.aClass472_8281.method7702(1547955765 * anInt11741, (byte) 75);
			aClass169Array11743 = new Class169[i_10_];
			is = Class635.aClass472_8281.method7656(anInt11741 * 1547955765, -1350998527);
		}
		for (int i_11_ = 0; i_11_ < is.length; i_11_++) {
			byte[] is_12_ = aByteArrayArray11742[i_11_];
			RSBuffer class523_sub34 = new RSBuffer(is_12_);
			class523_sub34.offset = 189765723;
			int i_13_ = class523_sub34.readUnsignedShort(-311856182);
			Class523_Sub15 class523_sub15 = null;
			for (Class523_Sub15 class523_sub15_14_ = (Class523_Sub15) class708.method14240(2137604308); class523_sub15_14_ != null; class523_sub15_14_ = (Class523_Sub15) class708.method14244((byte) -40)) {
				if (i_13_ == class523_sub15_14_.anInt10458 * -384894989) {
					class523_sub15 = class523_sub15_14_;
					break;
				}
			}
			if (class523_sub15 == null) {
				synchronized (Class449.aClass472_4948) {
					class523_sub15 = new Class523_Sub15(i_13_, (Class449.aClass472_4948.method7721(i_13_, -387132909)));
				}
				class708.method14236(class523_sub15, 360054116);
			}
			aClass169Array11743[is[i_11_]] = new Class169(is_12_, class523_sub15);
		}
		aByteArrayArray11742 = null;
		return true;
	}

	static void method18129(Class669 class669, byte i) {
		class669.anInt8558 -= 2121349901;
		if (Class660.aBool8506) {
			Class380.method6405((class669.anIntArray8557[class669.anInt8558 * 1357652815]) != 0, -1967416248);
			Class322.method5721((class669.anIntArray8557[1357652815 * class669.anInt8558 + 1]) != 0, (byte) -23);
			Class164_Sub2.method15391(((class669.anIntArray8557[2 + class669.anInt8558 * 1357652815]) != 0), 1922859517);
		}
	}
}
