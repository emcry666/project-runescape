/* Class523_Sub34_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaclib.memory.Stream;

public class Class523_Sub34_Sub1 extends RSBuffer {
	void method18109(float f) {
		int i = Stream.floatToRawIntBits(f);
		buffer[(offset += 189765723) * 2349011 - 1] = (byte) i;
		buffer[(offset += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		buffer[(offset += 189765723) * 2349011 - 1] = (byte) (i >> 16);
		buffer[(offset += 189765723) * 2349011 - 1] = (byte) (i >> 24);
	}

	void method18110(float f) {
		int i = Stream.floatToRawIntBits(f);
		buffer[(offset += 189765723) * 2349011 - 1] = (byte) i;
		buffer[(offset += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		buffer[(offset += 189765723) * 2349011 - 1] = (byte) (i >> 16);
		buffer[(offset += 189765723) * 2349011 - 1] = (byte) (i >> 24);
	}

	void method18111(float f) {
		int i = Stream.floatToRawIntBits(f);
		buffer[(offset += 189765723) * 2349011 - 1] = (byte) (i >> 24);
		buffer[(offset += 189765723) * 2349011 - 1] = (byte) (i >> 16);
		buffer[(offset += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		buffer[(offset += 189765723) * 2349011 - 1] = (byte) i;
	}

	Class523_Sub34_Sub1(int i) {
		super(i);
	}

	void method18112(float f) {
		int i = Stream.floatToRawIntBits(f);
		buffer[(offset += 189765723) * 2349011 - 1] = (byte) (i >> 24);
		buffer[(offset += 189765723) * 2349011 - 1] = (byte) (i >> 16);
		buffer[(offset += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		buffer[(offset += 189765723) * 2349011 - 1] = (byte) i;
	}

	void method18113(float f) {
		int i = Stream.floatToRawIntBits(f);
		buffer[(offset += 189765723) * 2349011 - 1] = (byte) i;
		buffer[(offset += 189765723) * 2349011 - 1] = (byte) (i >> 8);
		buffer[(offset += 189765723) * 2349011 - 1] = (byte) (i >> 16);
		buffer[(offset += 189765723) * 2349011 - 1] = (byte) (i >> 24);
	}
}
