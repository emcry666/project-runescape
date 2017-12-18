/* NativeBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public class NativeBuffer implements Buffer, Source {
	private int anInt2256 = -1500383413;
	private long aLong2257;

	protected NativeBuffer() {
		/* empty */
	}

	public final int method1() {
		return 1162388893 * anInt2256;
	}

	public final long method2() {
		return aLong2257 * 1876393231861812053L;
	}

	public void method3(byte[] is, int i, int i_0_, int i_1_) {
		if (0L == 1876393231861812053L * aLong2257 | null == is | i < 0 | i + i_1_ > is.length | i_0_ < 0 | i_0_ + i_1_ > anInt2256 * 1162388893)
			throw new RuntimeException();
		put(1876393231861812053L * aLong2257, is, i, i_0_, i_1_);
	}

	private final native void get(long l, byte[] is, int i, int i_2_, int i_3_);

	private final native void put(long l, byte[] is, int i, int i_4_, int i_5_);

	public void method4(byte[] is, int i, int i_6_, int i_7_) {
		if (0L == 1876393231861812053L * aLong2257 | null == is | i < 0 | i + i_7_ > is.length | i_6_ < 0 | i_6_ + i_7_ > anInt2256 * 1162388893)
			throw new RuntimeException();
		put(1876393231861812053L * aLong2257, is, i, i_6_, i_7_);
	}

	public void method5(byte[] is, int i, int i_8_, int i_9_) {
		if (0L == 1876393231861812053L * aLong2257 | null == is | i < 0 | i + i_9_ > is.length | i_8_ < 0 | i_8_ + i_9_ > anInt2256 * 1162388893)
			throw new RuntimeException();
		put(1876393231861812053L * aLong2257, is, i, i_8_, i_9_);
	}

	public final int method6() {
		return 1162388893 * anInt2256;
	}

	public final long method7() {
		return aLong2257 * 1876393231861812053L;
	}

	public final long method8() {
		return aLong2257 * 1876393231861812053L;
	}
}
