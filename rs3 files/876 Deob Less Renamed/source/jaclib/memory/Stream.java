/* Stream - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public final class Stream {
	private Buffer aBuffer1139;
	private int anInt1140;
	private int anInt1141;
	private int anInt1142;
	private byte[] aByteArray1143;
	private static boolean aBool1144 = getLSB(-65536) == -1;

	public Stream() {
		this(4096);
	}

	private Stream(int i) {
		aByteArray1143 = new byte[i];
	}

	public Stream(Buffer buffer) {
		this(buffer, 0, buffer.method1());
	}

	private Stream(Buffer buffer, int i, int i_0_) {
		this(buffer.method1() < 4096 ? buffer.method1() : 4096);
		method1697(buffer, i, i_0_);
	}

	private void method1697(Buffer buffer, int i, int i_1_) {
		method1703();
		aBuffer1139 = buffer;
		anInt1141 = i * 758309429;
		anInt1140 = -662973787 * (i_1_ + i);
		if (-1440234195 * anInt1140 > buffer.method1())
			throw new RuntimeException();
	}

	public int method1698() {
		return anInt1142 * -175442391 + anInt1141 * -1747525603;
	}

	public void method1699(int i) {
		method1703();
		anInt1141 = 758309429 * i;
	}

	public void method1700(int i) {
		if (anInt1142 * -175442391 >= aByteArray1143.length)
			method1703();
		aByteArray1143[(anInt1142 += 293668377) * -175442391 - 1] = (byte) i;
	}

	public void method1701(float f) {
		if (3 + -175442391 * anInt1142 >= aByteArray1143.length)
			method1703();
		int i = floatToRawIntBits(f);
		aByteArray1143[(anInt1142 += 293668377) * -175442391 - 1] = (byte) (i >> 24);
		aByteArray1143[(anInt1142 += 293668377) * -175442391 - 1] = (byte) (i >> 16);
		aByteArray1143[(anInt1142 += 293668377) * -175442391 - 1] = (byte) (i >> 8);
		aByteArray1143[(anInt1142 += 293668377) * -175442391 - 1] = (byte) i;
	}

	public void method1702(float f) {
		if (anInt1142 * -175442391 + 3 >= aByteArray1143.length)
			method1703();
		int i = floatToRawIntBits(f);
		aByteArray1143[(anInt1142 += 293668377) * -175442391 - 1] = (byte) i;
		aByteArray1143[(anInt1142 += 293668377) * -175442391 - 1] = (byte) (i >> 8);
		aByteArray1143[(anInt1142 += 293668377) * -175442391 - 1] = (byte) (i >> 16);
		aByteArray1143[(anInt1142 += 293668377) * -175442391 - 1] = (byte) (i >> 24);
	}

	public void method1703() {
		if (anInt1142 * -175442391 > 0) {
			if (anInt1142 * -175442391 + -1747525603 * anInt1141 > anInt1140 * -1440234195)
				throw new RuntimeException();
			aBuffer1139.method3(aByteArray1143, 0, anInt1141 * -1747525603, -175442391 * anInt1142);
			anInt1141 += anInt1142 * -870897539;
			anInt1142 = 0;
		}
	}

	public static final boolean method1704() {
		return aBool1144;
	}

	public static native int floatToRawIntBits(float f);

	private static final native byte getLSB(int i);

	private void method1705(Buffer buffer, int i, int i_2_) {
		method1703();
		aBuffer1139 = buffer;
		anInt1141 = i * 758309429;
		anInt1140 = -662973787 * (i_2_ + i);
		if (-1440234195 * anInt1140 > buffer.method1())
			throw new RuntimeException();
	}

	public int method1706() {
		return anInt1142 * -175442391 + anInt1141 * -1747525603;
	}

	public int method1707() {
		return anInt1142 * -175442391 + anInt1141 * -1747525603;
	}

	public int method1708() {
		return anInt1142 * -175442391 + anInt1141 * -1747525603;
	}

	public void method1709(int i) {
		method1703();
		anInt1141 = 758309429 * i;
	}

	public void method1710(int i) {
		method1703();
		anInt1141 = 758309429 * i;
	}

	public void method1711(int i) {
		method1703();
		anInt1141 = 758309429 * i;
	}

	public void method1712(int i) {
		if (anInt1142 * -175442391 >= aByteArray1143.length)
			method1703();
		aByteArray1143[(anInt1142 += 293668377) * -175442391 - 1] = (byte) i;
	}

	public void method1713(int i) {
		if (anInt1142 * -175442391 >= aByteArray1143.length)
			method1703();
		aByteArray1143[(anInt1142 += 293668377) * -175442391 - 1] = (byte) i;
	}

	public void method1714(int i) {
		if (anInt1142 * -175442391 >= aByteArray1143.length)
			method1703();
		aByteArray1143[(anInt1142 += 293668377) * -175442391 - 1] = (byte) i;
	}

	public void method1715(float f) {
		if (3 + -175442391 * anInt1142 >= aByteArray1143.length)
			method1703();
		int i = floatToRawIntBits(f);
		aByteArray1143[(anInt1142 += 293668377) * -175442391 - 1] = (byte) (i >> 24);
		aByteArray1143[(anInt1142 += 293668377) * -175442391 - 1] = (byte) (i >> 16);
		aByteArray1143[(anInt1142 += 293668377) * -175442391 - 1] = (byte) (i >> 8);
		aByteArray1143[(anInt1142 += 293668377) * -175442391 - 1] = (byte) i;
	}

	public void method1716(float f) {
		if (3 + -175442391 * anInt1142 >= aByteArray1143.length)
			method1703();
		int i = floatToRawIntBits(f);
		aByteArray1143[(anInt1142 += 293668377) * -175442391 - 1] = (byte) (i >> 24);
		aByteArray1143[(anInt1142 += 293668377) * -175442391 - 1] = (byte) (i >> 16);
		aByteArray1143[(anInt1142 += 293668377) * -175442391 - 1] = (byte) (i >> 8);
		aByteArray1143[(anInt1142 += 293668377) * -175442391 - 1] = (byte) i;
	}

	public void method1717(float f) {
		if (anInt1142 * -175442391 + 3 >= aByteArray1143.length)
			method1703();
		int i = floatToRawIntBits(f);
		aByteArray1143[(anInt1142 += 293668377) * -175442391 - 1] = (byte) i;
		aByteArray1143[(anInt1142 += 293668377) * -175442391 - 1] = (byte) (i >> 8);
		aByteArray1143[(anInt1142 += 293668377) * -175442391 - 1] = (byte) (i >> 16);
		aByteArray1143[(anInt1142 += 293668377) * -175442391 - 1] = (byte) (i >> 24);
	}

	public void method1718() {
		if (anInt1142 * -175442391 > 0) {
			if (anInt1142 * -175442391 + -1747525603 * anInt1141 > anInt1140 * -1440234195)
				throw new RuntimeException();
			aBuffer1139.method3(aByteArray1143, 0, anInt1141 * -1747525603, -175442391 * anInt1142);
			anInt1141 += anInt1142 * -870897539;
			anInt1142 = 0;
		}
	}

	public void method1719() {
		if (anInt1142 * -175442391 > 0) {
			if (anInt1142 * -175442391 + -1747525603 * anInt1141 > anInt1140 * -1440234195)
				throw new RuntimeException();
			aBuffer1139.method3(aByteArray1143, 0, anInt1141 * -1747525603, -175442391 * anInt1142);
			anInt1141 += anInt1142 * -870897539;
			anInt1142 = 0;
		}
	}

	public void method1720() {
		if (anInt1142 * -175442391 > 0) {
			if (anInt1142 * -175442391 + -1747525603 * anInt1141 > anInt1140 * -1440234195)
				throw new RuntimeException();
			aBuffer1139.method3(aByteArray1143, 0, anInt1141 * -1747525603, -175442391 * anInt1142);
			anInt1141 += anInt1142 * -870897539;
			anInt1142 = 0;
		}
	}

	public void method1721() {
		if (anInt1142 * -175442391 > 0) {
			if (anInt1142 * -175442391 + -1747525603 * anInt1141 > anInt1140 * -1440234195)
				throw new RuntimeException();
			aBuffer1139.method3(aByteArray1143, 0, anInt1141 * -1747525603, -175442391 * anInt1142);
			anInt1141 += anInt1142 * -870897539;
			anInt1142 = 0;
		}
	}

	public static final boolean method1722() {
		return aBool1144;
	}
}
