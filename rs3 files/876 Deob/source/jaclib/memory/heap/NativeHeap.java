/* NativeHeap - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;

public final class NativeHeap {
	long peer;
	private int anInt1329;
	private boolean aBool1330;

	public NativeHeap(int i) {
		anInt1329 = i * 674440179;
		allocateHeap(anInt1329 * 1070017851);
		aBool1330 = true;
	}

	synchronized boolean method1904() {
		return aBool1330;
	}

	public NativeHeapBuffer method1905(int i, boolean bool) {
		if (!aBool1330)
			throw new IllegalStateException();
		return new NativeHeapBuffer(this, allocateBuffer(i, bool), i);
	}

	public synchronized void method1906() {
		if (aBool1330)
			deallocateHeap();
		aBool1330 = false;
	}

	private native void allocateHeap(int i);

	private native void deallocateHeap();

	synchronized native int allocateBuffer(int i, boolean bool);

	synchronized native long getBufferAddress(int i);

	synchronized native void get(int i, byte[] is, int i_0_, int i_1_, int i_2_);

	synchronized native void put(int i, byte[] is, int i_3_, int i_4_, int i_5_);

	synchronized native void deallocateBuffer(int i);

	public synchronized native void copy(long l, long l_6_, int i);

	protected synchronized void finalize() throws Throwable {
		super.finalize();
		method1906();
	}

	protected synchronized void method1907() throws Throwable {
		super.finalize();
		method1906();
	}

	synchronized boolean method1908() {
		return aBool1330;
	}

	synchronized boolean method1909() {
		return aBool1330;
	}

	synchronized boolean method1910() {
		return aBool1330;
	}

	public NativeHeapBuffer method1911(int i, boolean bool) {
		if (!aBool1330)
			throw new IllegalStateException();
		return new NativeHeapBuffer(this, allocateBuffer(i, bool), i);
	}

	public NativeHeapBuffer method1912(int i, boolean bool) {
		if (!aBool1330)
			throw new IllegalStateException();
		return new NativeHeapBuffer(this, allocateBuffer(i, bool), i);
	}

	public NativeHeapBuffer method1913(int i, boolean bool) {
		if (!aBool1330)
			throw new IllegalStateException();
		return new NativeHeapBuffer(this, allocateBuffer(i, bool), i);
	}

	public synchronized void method1914() {
		if (aBool1330)
			deallocateHeap();
		aBool1330 = false;
	}

	public synchronized void method1915() {
		if (aBool1330)
			deallocateHeap();
		aBool1330 = false;
	}
}
