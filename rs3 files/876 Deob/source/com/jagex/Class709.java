/* Class709 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;
import java.util.Arrays;

public abstract class Class709 {
	public static byte[] method14308(Object object, boolean bool) {
		if (null == object)
			return null;
		if (object instanceof byte[]) {
			byte[] is = (byte[]) object;
			if (bool)
				return Arrays.copyOf(is, is.length);
			return is;
		}
		if (object instanceof ByteBuffer) {
			ByteBuffer bytebuffer = (ByteBuffer) object;
			byte[] is = new byte[bytebuffer.capacity()];
			bytebuffer.position(0);
			bytebuffer.get(is);
			return is;
		}
		throw new IllegalArgumentException();
	}

	public static Object method14309(byte[] is, boolean bool) {
		if (is == null)
			return null;
		if (is.length > 136) {
			ByteBuffer bytebuffer = ByteBuffer.allocateDirect(is.length);
			bytebuffer.position(0);
			bytebuffer.put(is);
			return bytebuffer;
		}
		if (bool)
			return Arrays.copyOf(is, is.length);
		return is;
	}

	public static byte[] method14310(Object object, boolean bool) {
		if (null == object)
			return null;
		if (object instanceof byte[]) {
			byte[] is = (byte[]) object;
			if (bool)
				return Arrays.copyOf(is, is.length);
			return is;
		}
		if (object instanceof ByteBuffer) {
			ByteBuffer bytebuffer = (ByteBuffer) object;
			byte[] is = new byte[bytebuffer.capacity()];
			bytebuffer.position(0);
			bytebuffer.get(is);
			return is;
		}
		throw new IllegalArgumentException();
	}

	public static byte[] method14311(Object object, boolean bool) {
		if (null == object)
			return null;
		if (object instanceof byte[]) {
			byte[] is = (byte[]) object;
			if (bool)
				return Arrays.copyOf(is, is.length);
			return is;
		}
		if (object instanceof ByteBuffer) {
			ByteBuffer bytebuffer = (ByteBuffer) object;
			byte[] is = new byte[bytebuffer.capacity()];
			bytebuffer.position(0);
			bytebuffer.get(is);
			return is;
		}
		throw new IllegalArgumentException();
	}

	public static byte[] method14312(Object object, boolean bool) {
		if (null == object)
			return null;
		if (object instanceof byte[]) {
			byte[] is = (byte[]) object;
			if (bool)
				return Arrays.copyOf(is, is.length);
			return is;
		}
		if (object instanceof ByteBuffer) {
			ByteBuffer bytebuffer = (ByteBuffer) object;
			byte[] is = new byte[bytebuffer.capacity()];
			bytebuffer.position(0);
			bytebuffer.get(is);
			return is;
		}
		throw new IllegalArgumentException();
	}

	Class709() throws Throwable {
		throw new Error();
	}

	public static byte[] method14313(Object object, boolean bool) {
		if (null == object)
			return null;
		if (object instanceof byte[]) {
			byte[] is = (byte[]) object;
			if (bool)
				return Arrays.copyOf(is, is.length);
			return is;
		}
		if (object instanceof ByteBuffer) {
			ByteBuffer bytebuffer = (ByteBuffer) object;
			byte[] is = new byte[bytebuffer.capacity()];
			bytebuffer.position(0);
			bytebuffer.get(is);
			return is;
		}
		throw new IllegalArgumentException();
	}

	public static Object method14314(byte[] is, boolean bool) {
		if (is == null)
			return null;
		if (is.length > 136) {
			ByteBuffer bytebuffer = ByteBuffer.allocateDirect(is.length);
			bytebuffer.position(0);
			bytebuffer.put(is);
			return bytebuffer;
		}
		if (bool)
			return Arrays.copyOf(is, is.length);
		return is;
	}

	public static byte[] method14315(Object object, boolean bool) {
		if (null == object)
			return null;
		if (object instanceof byte[]) {
			byte[] is = (byte[]) object;
			if (bool)
				return Arrays.copyOf(is, is.length);
			return is;
		}
		if (object instanceof ByteBuffer) {
			ByteBuffer bytebuffer = (ByteBuffer) object;
			byte[] is = new byte[bytebuffer.capacity()];
			bytebuffer.position(0);
			bytebuffer.get(is);
			return is;
		}
		throw new IllegalArgumentException();
	}

	public static byte[] method14316(Object object, int i, int i_0_) {
		if (null == object)
			return null;
		if (object instanceof byte[]) {
			byte[] is = (byte[]) object;
			return Arrays.copyOfRange(is, i, i_0_ + i);
		}
		if (object instanceof ByteBuffer) {
			ByteBuffer bytebuffer = (ByteBuffer) object;
			byte[] is = new byte[i_0_];
			bytebuffer.position(i);
			bytebuffer.get(is, 0, i_0_);
			return is;
		}
		throw new IllegalArgumentException();
	}

	static final void method14317(Class669 class669, Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1, int i) {
		class669.anInt8558 -= -34844996;
		int i_1_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_2_ = class669.anIntArray8557[1 + 1357652815 * class669.anInt8558];
		int i_3_ = class669.anIntArray8557[2 + class669.anInt8558 * 1357652815];
		boolean bool = 1 == (class669.anIntArray8557[1357652815 * class669.anInt8558 + 3]);
		if (Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5341((byte) 112) != Class294.aClass294_3164)
			throw new RuntimeException();
		Class688_Sub2 class688_sub2 = (Class688_Sub2) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5465((byte) 75);
		if (class647_sub1_sub3_sub1 != null)
			class688_sub2.method17080(class647_sub1_sub3_sub1, new Class437((float) i_1_, (float) i_2_, (float) i_3_), bool, (byte) 121);
		client.aBool11111 = true;
	}

	static final void method14318(Class669 class669, int i) {
		Class449.aClass523_Sub33_4946.method16240(Class449.aClass523_Sub33_4946.aClass687_Sub35_10617, (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) == 1 ? 1 : 0, 656085822);
		Class211.method3824(1039539743);
		client.aBool11012 = false;
	}
}
