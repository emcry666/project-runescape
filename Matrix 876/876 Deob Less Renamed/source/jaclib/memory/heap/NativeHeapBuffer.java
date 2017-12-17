/* NativeHeapBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;

public final class NativeHeapBuffer implements Buffer, Source {
	private int anInt1113;
	public NativeHeap aNativeHeap1114;
	private int anInt1115;
	private boolean aBool1116 = true;

	NativeHeapBuffer(NativeHeap nativeheap, int i, int i_0_) {
		aNativeHeap1114 = nativeheap;
		anInt1115 = 768830075 * i;
		anInt1113 = 1415056687 * i_0_;
	}

	private final synchronized boolean method1677() {
		return aNativeHeap1114.method1904() && aBool1116;
	}

	public final long method2() {
		return aNativeHeap1114.getBufferAddress(-1764367181 * anInt1115);
	}

	public final int method1() {
		return anInt1113 * 1967675855;
	}

	public final synchronized void method3(byte[] is, int i, int i_1_, int i_2_) {
		if (!method1677() | null == is | i < 0 | i + i_2_ > is.length | i_1_ < 0 | i_1_ + i_2_ > 1967675855 * anInt1113)
			throw new RuntimeException();
		aNativeHeap1114.put(-1764367181 * anInt1115, is, i, i_1_, i_2_);
	}

	public final synchronized void method1678() {
		if (method1677())
			aNativeHeap1114.deallocateBuffer(anInt1115 * -1764367181);
		aBool1116 = false;
	}

	protected final synchronized void finalize() throws Throwable {
		super.finalize();
		method1678();
	}

	public final synchronized void method4(byte[] is, int i, int i_3_, int i_4_) {
		if (!method1677() | null == is | i < 0 | i + i_4_ > is.length | i_3_ < 0 | i_3_ + i_4_ > 1967675855 * anInt1113)
			throw new RuntimeException();
		aNativeHeap1114.put(-1764367181 * anInt1115, is, i, i_3_, i_4_);
	}

	public final synchronized void method5(byte[] is, int i, int i_5_, int i_6_) {
		if (!method1677() | null == is | i < 0 | i + i_6_ > is.length | i_5_ < 0 | i_5_ + i_6_ > 1967675855 * anInt1113)
			throw new RuntimeException();
		aNativeHeap1114.put(-1764367181 * anInt1115, is, i, i_5_, i_6_);
	}

	protected final synchronized void method1679() throws Throwable {
		super.finalize();
		method1678();
	}

	public final int method6() {
		return anInt1113 * 1967675855;
	}

	public final long method7() {
		return aNativeHeap1114.getBufferAddress(-1764367181 * anInt1115);
	}

	public final long method8() {
		return aNativeHeap1114.getBufferAddress(-1764367181 * anInt1115);
	}

	private final synchronized boolean method1680() {
		return aNativeHeap1114.method1904() && aBool1116;
	}
}
