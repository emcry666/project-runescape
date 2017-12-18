/* Class450 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Compression implements Interface75 {
	int id;
	static Compression BZIP2;
	static Compression GZIP;
	static Compression UNCOMPRESSED = new Compression("UNCOMPRESSED", 0);
	String name;
	static Compression LZMA;
	public static int anInt4955;

	public int method6() {
		return -1008422703 * id;
	}

	static {
		BZIP2 = new Compression("BZIP2", 1);
		GZIP = new Compression("GZIP", 2);
		LZMA = new Compression("LZMA", 3);
	}

	public int method82() {
		return -1008422703 * id;
	}

	Compression(String name, int id) {
		this.name = name;
		this.id = 241281073 * id;
	}

	public int method101() {
		return -1008422703 * id;
	}

	static Compression[] getId(short i) {
		return new Compression[] { UNCOMPRESSED, BZIP2, GZIP, LZMA };
	}

	static final void method7271(Class669 class669, int i) {
		int i_0_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		InterfaceComponentDefinitions class250 = Class188.getDefinitions(i_0_, -1745307733);
		Class242 class242 = Class31.aClass242Array302[i_0_ >> 16];
		Class327_Sub2.method15640(class250, class242, class669, -1688579239);
	}

	static final void method7272(Class669 class669, byte i) {
		Class67.method1460((class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]), (byte) -37);
	}

	static final void method7273(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = 0;
	}

	static final void method7274(Class669 class669, int i) {
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = Class449.aClass523_Sub33_4946.aClass687_Sub9_10622.method16817((byte) 7) ? 1 : 0;
	}

	static void method7275(byte i) {
		if (Class91.method1657(-2020118759 * client.anInt11136, (byte) 73)) {
			if (client.aClass116_11057.getCurrentStream(782493095) == null)
				Class657.method10791(1, (byte) -50);
			else
				Class657.method10791(0, (byte) -106);
		} else if (client.anInt11136 * -2020118759 == 1 || -2020118759 * client.anInt11136 == 3)
			Class657.method10791(16, (byte) -61);
		else if (4 == client.anInt11136 * -2020118759)
			Class657.method10791(16, (byte) -102);
	}

	static final void method7276(Class669 class669, int i) {
		class669.anInt8558 -= -17422498;
		int i_1_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_2_ = class669.anIntArray8557[class669.anInt8558 * 1357652815 + 1];
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_1_ * i_2_;
	}

	public static void method7277(int i, int i_3_) {
		Class25 class25 = (Class25) Class534_Sub1.aHashMap10787.get(Integer.valueOf(i));
		if (null == class25)
			class25 = new Class25();
		class25.anInt246 = Class534_Sub1.anInt10788 * 649231935;
		class25.anInt245 = -2045175827 * Class534_Sub1.anInt10789;
		Class534_Sub1.aHashMap10787.put(Integer.valueOf(i), class25);
	}

	static final void method7278(Class669 class669, byte i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		Class49.method1275(string, -1597764882);
	}
}
