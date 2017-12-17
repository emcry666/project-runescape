/* Class19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class Class19 {
	long aLong197;
	long aLong198;
	RandomAccessFile aRandomAccessFile199;

	final void method780(long l) throws IOException {
		aRandomAccessFile199.seek(l);
		aLong197 = -8169656876506990413L * l;
	}

	final void method781(long l) throws IOException {
		aRandomAccessFile199.seek(l);
		aLong197 = -8169656876506990413L * l;
	}

	public final void method782(byte[] is, int i, int i_0_, int i_1_) throws IOException {
		if ((long) i_0_ + 3636379103227295355L * aLong197 > -605482547595109403L * aLong198) {
			aRandomAccessFile199.seek(-605482547595109403L * aLong198);
			aRandomAccessFile199.write(1);
			throw new EOFException();
		}
		aRandomAccessFile199.write(is, i, i_0_);
		aLong197 += -8169656876506990413L * (long) i_0_;
	}

	public final int method783(byte[] is, int i, int i_2_) throws IOException {
		int i_3_ = aRandomAccessFile199.read(is, i, i_2_);
		if (i_3_ > 0)
			aLong197 += (long) i_3_ * -8169656876506990413L;
		return i_3_;
	}

	public Class19(File file, String string, long l) throws IOException {
		if (-1L == l)
			l = 9223372036854775807L;
		if (file.length() > l)
			file.delete();
		aRandomAccessFile199 = new RandomAccessFile(file, string);
		aLong198 = l * 5198667588013369837L;
		aLong197 = 0L;
		int i = aRandomAccessFile199.read();
		if (i != -1 && !string.equals("r")) {
			aRandomAccessFile199.seek(0L);
			aRandomAccessFile199.write(i);
		}
		aRandomAccessFile199.seek(0L);
	}

	public final int method784(byte[] is, int i, int i_4_, byte i_5_) throws IOException {
		int i_6_ = aRandomAccessFile199.read(is, i, i_4_);
		if (i_6_ > 0)
			aLong197 += (long) i_6_ * -8169656876506990413L;
		return i_6_;
	}

	public void finalize() throws Throwable {
		if (aRandomAccessFile199 != null) {
			System.out.println("");
			method786(1280480105);
		}
	}

	final void method785(long l) throws IOException {
		aRandomAccessFile199.seek(l);
		aLong197 = -8169656876506990413L * l;
	}

	public final void method786(int i) throws IOException {
		if (aRandomAccessFile199 != null) {
			aRandomAccessFile199.close();
			aRandomAccessFile199 = null;
		}
	}

	void method787() throws Throwable {
		if (aRandomAccessFile199 != null) {
			System.out.println("");
			method786(1593787036);
		}
	}

	final void method788(long l) throws IOException {
		aRandomAccessFile199.seek(l);
		aLong197 = -8169656876506990413L * l;
	}

	public final void method789(byte[] is, int i, int i_7_) throws IOException {
		if ((long) i_7_ + 3636379103227295355L * aLong197 > -605482547595109403L * aLong198) {
			aRandomAccessFile199.seek(-605482547595109403L * aLong198);
			aRandomAccessFile199.write(1);
			throw new EOFException();
		}
		aRandomAccessFile199.write(is, i, i_7_);
		aLong197 += -8169656876506990413L * (long) i_7_;
	}

	public final void method790(byte[] is, int i, int i_8_) throws IOException {
		if ((long) i_8_ + 3636379103227295355L * aLong197 > -605482547595109403L * aLong198) {
			aRandomAccessFile199.seek(-605482547595109403L * aLong198);
			aRandomAccessFile199.write(1);
			throw new EOFException();
		}
		aRandomAccessFile199.write(is, i, i_8_);
		aLong197 += -8169656876506990413L * (long) i_8_;
	}

	public final void method791() throws IOException {
		if (aRandomAccessFile199 != null) {
			aRandomAccessFile199.close();
			aRandomAccessFile199 = null;
		}
	}

	public final void method792() throws IOException {
		if (aRandomAccessFile199 != null) {
			aRandomAccessFile199.close();
			aRandomAccessFile199 = null;
		}
	}

	public final void method793() throws IOException {
		if (aRandomAccessFile199 != null) {
			aRandomAccessFile199.close();
			aRandomAccessFile199 = null;
		}
	}

	public final long method794() throws IOException {
		return aRandomAccessFile199.length();
	}

	public final long method795(int i) throws IOException {
		return aRandomAccessFile199.length();
	}

	static final void method796(Class669 class669, int i) {
		if (Class562.anInt7564 * 2097396553 == 2)
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (int) ((double) Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5348(-1505977262) * 2607.5945876176133) >> 3;
		else
			class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = (int) client.aFloat11129 >> 3;
	}
}
