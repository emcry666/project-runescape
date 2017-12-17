/* Class462 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class CompressionArchive {
	int length;
	Compression compressionType;
	int compressedLength;

	CompressionArchive(RSBuffer buffer) {
		compressionType = ((Compression) Class334.method5910(Compression.getId((short) 512), buffer.readUnsignedByte(-1849032494), -1873548721));
		length = buffer.readUnsignedInt((byte) -112) * 205532409;
		if (Compression.UNCOMPRESSED != compressionType)
			compressedLength = buffer.readUnsignedInt((byte) -104) * -2067394275;
		else
			compressedLength = length * -668990907;
	}

	Compression getCompressionType(int i) {
		return compressionType;
	}

	int getCompressedLength(int i) {
		return compressedLength * 1035680053;
	}

	Compression method7514() {
		return compressionType;
	}

	Compression method7515() {
		return compressionType;
	}

	int method7516() {
		return length * -125250231;
	}

	int getLength(byte i) {
		return length * -125250231;
	}

	static void method7518(Class669 class669, int i) {
		boolean bool = ((class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) != 0);
		Class585.method9690(bool, 329743456);
	}
}
