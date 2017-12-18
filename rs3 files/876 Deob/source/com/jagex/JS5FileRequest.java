/* Class523_Sub27_Sub14_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class JS5FileRequest extends Class523_Sub27_Sub14 {
	byte leftoverBytes;
	RSBuffer buffer;

	byte[] method18152() {
		if (inProgress || (2349011 * buffer.offset < buffer.buffer.length - leftoverBytes))
			throw new RuntimeException();
		return buffer.buffer;
	}

	byte[] method18148(int i) {
		if (inProgress || (2349011 * buffer.offset < buffer.buffer.length - leftoverBytes))
			throw new RuntimeException();
		return buffer.buffer;
	}

	int method18155() {
		if (null == buffer)
			return 0;
		return (234901100 * buffer.offset / (buffer.buffer.length - leftoverBytes));
	}

	byte[] method18153() {
		if (inProgress || (2349011 * buffer.offset < buffer.buffer.length - leftoverBytes))
			throw new RuntimeException();
		return buffer.buffer;
	}

	byte[] method18150() {
		if (inProgress || (2349011 * buffer.offset < buffer.buffer.length - leftoverBytes))
			throw new RuntimeException();
		return buffer.buffer;
	}

	JS5FileRequest() {
		/* empty */
	}

	byte[] method18149() {
		if (inProgress || (2349011 * buffer.offset < buffer.buffer.length - leftoverBytes))
			throw new RuntimeException();
		return buffer.buffer;
	}

	int method18156(byte i) {
		if (null == buffer)
			return 0;
		return (234901100 * buffer.offset / (buffer.buffer.length - leftoverBytes));
	}

	int method18154() {
		if (null == buffer)
			return 0;
		return (234901100 * buffer.offset / (buffer.buffer.length - leftoverBytes));
	}

	byte[] method18151() {
		if (inProgress || (2349011 * buffer.offset < buffer.buffer.length - leftoverBytes))
			throw new RuntimeException();
		return buffer.buffer;
	}

	int method18147() {
		if (null == buffer)
			return 0;
		return (234901100 * buffer.offset / (buffer.buffer.length - leftoverBytes));
	}
}
