/* IcmpService - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.ping;

public abstract class IcmpService implements Runnable {
	protected IcmpService() {
		/* empty */
	}

	protected abstract void notify(int i);

	protected abstract void notify(int i, int i_0_, int i_1_);

	public native void run();

	public native void quit();

	public static native boolean available();

	public native void i();

	public native void z();

	protected abstract void method1681(int i);

	protected abstract void method1682(int i);

	protected abstract void method1683(int i, int i_2_, int i_3_);

	protected abstract void method1684(int i, int i_4_, int i_5_);

	protected abstract void method1685(int i, int i_6_, int i_7_);

	protected abstract void method1686(int i, int i_8_, int i_9_);
}
