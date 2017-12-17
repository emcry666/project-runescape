/* Class345_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class345_Sub2 extends Class345 {
	long aLong10149 = 0L;
	Class178_Sub2_Sub1 aClass178_Sub2_Sub1_10150;

	public void method132() {
		if (aLong10149 != 0L) {
			IUnknown.Release(aLong10149);
			aLong10149 = 0L;
		}
		aClass178_Sub2_Sub1_10150.method14917(this);
	}

	void method15696(ByteBuffer bytebuffer, short i, short i_0_, byte i_1_, byte i_2_, byte i_3_, byte i_4_) {
		bytebuffer.putShort(i);
		bytebuffer.putShort(i_0_);
		bytebuffer.put(i_1_);
		bytebuffer.put(i_2_);
		bytebuffer.put(i_3_);
		bytebuffer.put(i_4_);
	}

	public void method131() {
		if (aLong10149 != 0L) {
			IUnknown.Release(aLong10149);
			aLong10149 = 0L;
		}
		aClass178_Sub2_Sub1_10150.method14917(this);
	}

	void method15697() {
		if (aLong10149 != 0L) {
			aClass178_Sub2_Sub1_10150.method17839(aLong10149);
			aLong10149 = 0L;
		}
	}

	public void finalize() {
		method15697();
	}

	Class345_Sub2(Class178_Sub2_Sub1 class178_sub2_sub1, Class378[] class378s) {
		super(class378s);
		aClass178_Sub2_Sub1_10150 = class178_sub2_sub1;
		byte i = 0;
		ByteBuffer bytebuffer = aClass178_Sub2_Sub1_10150.aByteBuffer9539;
		bytebuffer.clear();
		for (short i_5_ = 0; i_5_ < aClass378Array3630.length; i_5_++) {
			short i_6_ = 0;
			Class378 class378 = aClass378Array3630[i_5_];
			for (int i_7_ = 0; i_7_ < class378.method6388(); i_7_++) {
				Class344 class344 = class378.method6395(i_7_);
				if (class344 == Class344.aClass344_3624)
					method15696(bytebuffer, i_5_, i_6_, (byte) 2, (byte) 0, (byte) 0, (byte) 0);
				else if (class344 == Class344.aClass344_3612)
					method15696(bytebuffer, i_5_, i_6_, (byte) 2, (byte) 0, (byte) 3, (byte) 0);
				else if (class344 == Class344.aClass344_3613)
					method15696(bytebuffer, i_5_, i_6_, (byte) 4, (byte) 0, (byte) 10, (byte) 0);
				else if (class344 == Class344.aClass344_3627) {
					Class345_Sub2 class345_sub2_8_ = this;
					ByteBuffer bytebuffer_9_ = bytebuffer;
					short i_10_ = i_5_;
					short i_11_ = i_6_;
					byte i_12_ = 0;
					byte i_13_ = 0;
					byte i_14_ = 5;
					byte i_15_ = i;
					i++;
					class345_sub2_8_.method15696(bytebuffer_9_, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_);
				} else if (class344 == Class344.aClass344_3615) {
					Class345_Sub2 class345_sub2_16_ = this;
					ByteBuffer bytebuffer_17_ = bytebuffer;
					short i_18_ = i_5_;
					short i_19_ = i_6_;
					byte i_20_ = 1;
					byte i_21_ = 0;
					byte i_22_ = 5;
					byte i_23_ = i;
					i++;
					class345_sub2_16_.method15696(bytebuffer_17_, i_18_, i_19_, i_20_, i_21_, i_22_, i_23_);
				} else if (class344 == Class344.aClass344_3617) {
					Class345_Sub2 class345_sub2_24_ = this;
					ByteBuffer bytebuffer_25_ = bytebuffer;
					short i_26_ = i_5_;
					short i_27_ = i_6_;
					byte i_28_ = 2;
					byte i_29_ = 0;
					byte i_30_ = 5;
					byte i_31_ = i;
					i++;
					class345_sub2_24_.method15696(bytebuffer_25_, i_26_, i_27_, i_28_, i_29_, i_30_, i_31_);
				} else if (class344 == Class344.aClass344_3616) {
					Class345_Sub2 class345_sub2_32_ = this;
					ByteBuffer bytebuffer_33_ = bytebuffer;
					short i_34_ = i_5_;
					short i_35_ = i_6_;
					byte i_36_ = 3;
					byte i_37_ = 0;
					byte i_38_ = 5;
					byte i_39_ = i;
					i++;
					class345_sub2_32_.method15696(bytebuffer_33_, i_34_, i_35_, i_36_, i_37_, i_38_, i_39_);
				}
				i_6_ += class344.anInt3626;
			}
		}
		method15696(bytebuffer, (short) 255, (short) 0, (byte) 17, (byte) 0, (byte) 0, (byte) 0);
		aLong10149 = (IDirect3DDevice.CreateVertexDeclaration(aClass178_Sub2_Sub1_10150.aLong11412, aClass178_Sub2_Sub1_10150.aLong9540));
		aClass178_Sub2_Sub1_10150.method15243(this);
	}

	void method15698(ByteBuffer bytebuffer, short i, short i_40_, byte i_41_, byte i_42_, byte i_43_, byte i_44_) {
		bytebuffer.putShort(i);
		bytebuffer.putShort(i_40_);
		bytebuffer.put(i_41_);
		bytebuffer.put(i_42_);
		bytebuffer.put(i_43_);
		bytebuffer.put(i_44_);
	}

	public void method130() {
		if (aLong10149 != 0L) {
			IUnknown.Release(aLong10149);
			aLong10149 = 0L;
		}
		aClass178_Sub2_Sub1_10150.method14917(this);
	}

	void method15699() {
		method15697();
	}

	void method15700(ByteBuffer bytebuffer, short i, short i_45_, byte i_46_, byte i_47_, byte i_48_, byte i_49_) {
		bytebuffer.putShort(i);
		bytebuffer.putShort(i_45_);
		bytebuffer.put(i_46_);
		bytebuffer.put(i_47_);
		bytebuffer.put(i_48_);
		bytebuffer.put(i_49_);
	}

	void method15701(ByteBuffer bytebuffer, short i, short i_50_, byte i_51_, byte i_52_, byte i_53_, byte i_54_) {
		bytebuffer.putShort(i);
		bytebuffer.putShort(i_50_);
		bytebuffer.put(i_51_);
		bytebuffer.put(i_52_);
		bytebuffer.put(i_53_);
		bytebuffer.put(i_54_);
	}

	void method15702(ByteBuffer bytebuffer, short i, short i_55_, byte i_56_, byte i_57_, byte i_58_, byte i_59_) {
		bytebuffer.putShort(i);
		bytebuffer.putShort(i_55_);
		bytebuffer.put(i_56_);
		bytebuffer.put(i_57_);
		bytebuffer.put(i_58_);
		bytebuffer.put(i_59_);
	}

	public void method78() {
		if (aLong10149 != 0L) {
			IUnknown.Release(aLong10149);
			aLong10149 = 0L;
		}
		aClass178_Sub2_Sub1_10150.method14917(this);
	}

	void method15703() {
		if (aLong10149 != 0L) {
			aClass178_Sub2_Sub1_10150.method17839(aLong10149);
			aLong10149 = 0L;
		}
	}
}
