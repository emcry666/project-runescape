/* Class117_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class117_Sub9 extends Class117 {
	int anInt8986;
	static final char aChar8987 = '\0';
	static final char aChar8988 = '\001';
	Class128 aClass128_8989;
	float aFloat8990;
	float[] aFloatArray8991;
	Class132 aClass132_8992;
	Class125 aClass125_8993;
	static final String aString8994 = "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND";
	static float[] aFloatArray8995 = new float[4];

	void method2028() {
		if (aClass128_8989 != null) {
			aClass128_8989.method2248('\001');
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(null);
			aClass178_Sub1_1434.method14673(0);
		}
	}

	void method2027(Class126 class126, int i) {
		aClass178_Sub1_1434.method14711(class126);
		aClass178_Sub1_1434.method14785(i);
	}

	void method2026(boolean bool) {
		if (aClass128_8989 != null) {
			aClass128_8989.method2248('\0');
			aClass178_Sub1_1434.method14673(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((aClass178_Sub1_1434.aClass441_9317.aFloatArray4916), 0);
			OpenGL.glMatrixMode(5888);
			aClass178_Sub1_1434.method14673(0);
			if (anInt8986 != aClass178_Sub1_1434.anInt9436) {
				int i = aClass178_Sub1_1434.anInt9436 % 5000 * 128 / 5000;
				for (int i_0_ = 0; i_0_ < 64; i_0_++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_0_, aFloatArray8991, i);
					i += 2;
				}
				if (aClass132_8992.aBool1569)
					aFloat8990 = (float) (aClass178_Sub1_1434.anInt9436 % 4000) / 4000.0F;
				else
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				anInt8986 = aClass178_Sub1_1434.anInt9436;
			}
		}
	}

	void method2017(boolean bool) {
		if (aClass128_8989 != null) {
			aClass128_8989.method2248('\0');
			aClass178_Sub1_1434.method14673(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((aClass178_Sub1_1434.aClass441_9317.aFloatArray4916), 0);
			OpenGL.glMatrixMode(5888);
			aClass178_Sub1_1434.method14673(0);
			if (anInt8986 != aClass178_Sub1_1434.anInt9436) {
				int i = aClass178_Sub1_1434.anInt9436 % 5000 * 128 / 5000;
				for (int i_1_ = 0; i_1_ < 64; i_1_++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_1_, aFloatArray8991, i);
					i += 2;
				}
				if (aClass132_8992.aBool1569)
					aFloat8990 = (float) (aClass178_Sub1_1434.anInt9436 % 4000) / 4000.0F;
				else
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				anInt8986 = aClass178_Sub1_1434.anInt9436;
			}
		}
	}

	void method2011(boolean bool) {
		/* empty */
	}

	void method14420() {
		aClass128_8989 = new Class128(aClass178_Sub1_1434, 2);
		aClass128_8989.method2256(0);
		aClass178_Sub1_1434.method14673(1);
		aClass178_Sub1_1434.method14679(-16777216);
		aClass178_Sub1_1434.method14676(260, 7681);
		aClass178_Sub1_1434.method14678(0, 34166, 770);
		aClass178_Sub1_1434.method14673(0);
		OpenGL.glBindProgramARB(34336, aClass125_8993.anInt1528);
		OpenGL.glEnable(34336);
		aClass128_8989.method2247();
		aClass128_8989.method2256(1);
		aClass178_Sub1_1434.method14673(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		aClass178_Sub1_1434.method14785(0);
		aClass178_Sub1_1434.method14678(0, 5890, 770);
		aClass178_Sub1_1434.method14673(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		aClass128_8989.method2247();
	}

	void method2010(int i, int i_2_) {
		if (aClass128_8989 != null) {
			aClass178_Sub1_1434.method14673(1);
			if ((i & 0x80) == 0) {
				if ((i_2_ & 0x1) == 1) {
					if (!aClass132_8992.aBool1569) {
						int i_3_ = aClass178_Sub1_1434.anInt9436 % 4000 * 16 / 4000;
						aClass178_Sub1_1434.method14711(aClass132_8992.aClass126_Sub2Array1564[i_3_]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						aClass178_Sub1_1434.method14711(aClass132_8992.aClass126_Sub3_1559);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, aFloat8990, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (aClass132_8992.aBool1569)
						aClass178_Sub1_1434.method14711(aClass132_8992.aClass126_Sub3_1559);
					else
						aClass178_Sub1_1434.method14711(aClass132_8992.aClass126_Sub2Array1564[0]);
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				aClass178_Sub1_1434.method14711(null);
			aClass178_Sub1_1434.method14673(0);
			if ((i & 0x40) == 0) {
				aFloatArray8995[0] = (aClass178_Sub1_1434.aFloat9359 * aClass178_Sub1_1434.aFloat9356);
				aFloatArray8995[1] = (aClass178_Sub1_1434.aFloat9359 * aClass178_Sub1_1434.aFloat9357);
				aFloatArray8995[2] = (aClass178_Sub1_1434.aFloat9359 * aClass178_Sub1_1434.aFloat9268);
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray8995, 0);
			} else
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			int i_4_ = i & 0x3;
			if (i_4_ == 2)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_4_ == 3)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	void method2013(Class126 class126, int i) {
		aClass178_Sub1_1434.method14711(class126);
		aClass178_Sub1_1434.method14785(i);
	}

	boolean method2014() {
		return true;
	}

	boolean method2022() {
		return true;
	}

	boolean method2016() {
		return true;
	}

	void method14421() {
		aClass128_8989 = new Class128(aClass178_Sub1_1434, 2);
		aClass128_8989.method2256(0);
		aClass178_Sub1_1434.method14673(1);
		aClass178_Sub1_1434.method14679(-16777216);
		aClass178_Sub1_1434.method14676(260, 7681);
		aClass178_Sub1_1434.method14678(0, 34166, 770);
		aClass178_Sub1_1434.method14673(0);
		OpenGL.glBindProgramARB(34336, aClass125_8993.anInt1528);
		OpenGL.glEnable(34336);
		aClass128_8989.method2247();
		aClass128_8989.method2256(1);
		aClass178_Sub1_1434.method14673(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		aClass178_Sub1_1434.method14785(0);
		aClass178_Sub1_1434.method14678(0, 5890, 770);
		aClass178_Sub1_1434.method14673(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		aClass128_8989.method2247();
	}

	boolean method2009() {
		return true;
	}

	void method2018(boolean bool) {
		if (aClass128_8989 != null) {
			aClass128_8989.method2248('\0');
			aClass178_Sub1_1434.method14673(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((aClass178_Sub1_1434.aClass441_9317.aFloatArray4916), 0);
			OpenGL.glMatrixMode(5888);
			aClass178_Sub1_1434.method14673(0);
			if (anInt8986 != aClass178_Sub1_1434.anInt9436) {
				int i = aClass178_Sub1_1434.anInt9436 % 5000 * 128 / 5000;
				for (int i_5_ = 0; i_5_ < 64; i_5_++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_5_, aFloatArray8991, i);
					i += 2;
				}
				if (aClass132_8992.aBool1569)
					aFloat8990 = (float) (aClass178_Sub1_1434.anInt9436 % 4000) / 4000.0F;
				else
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				anInt8986 = aClass178_Sub1_1434.anInt9436;
			}
		}
	}

	void method2019(boolean bool) {
		if (aClass128_8989 != null) {
			aClass128_8989.method2248('\0');
			aClass178_Sub1_1434.method14673(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((aClass178_Sub1_1434.aClass441_9317.aFloatArray4916), 0);
			OpenGL.glMatrixMode(5888);
			aClass178_Sub1_1434.method14673(0);
			if (anInt8986 != aClass178_Sub1_1434.anInt9436) {
				int i = aClass178_Sub1_1434.anInt9436 % 5000 * 128 / 5000;
				for (int i_6_ = 0; i_6_ < 64; i_6_++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_6_, aFloatArray8991, i);
					i += 2;
				}
				if (aClass132_8992.aBool1569)
					aFloat8990 = (float) (aClass178_Sub1_1434.anInt9436 % 4000) / 4000.0F;
				else
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				anInt8986 = aClass178_Sub1_1434.anInt9436;
			}
		}
	}

	void method2023(Class126 class126, int i) {
		aClass178_Sub1_1434.method14711(class126);
		aClass178_Sub1_1434.method14785(i);
	}

	void method2008(boolean bool) {
		/* empty */
	}

	void method2015() {
		if (aClass128_8989 != null) {
			aClass128_8989.method2248('\001');
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(null);
			aClass178_Sub1_1434.method14673(0);
		}
	}

	void method2012() {
		if (aClass128_8989 != null) {
			aClass128_8989.method2248('\001');
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(null);
			aClass178_Sub1_1434.method14673(0);
		}
	}

	void method2024() {
		if (aClass128_8989 != null) {
			aClass128_8989.method2248('\001');
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14711(null);
			aClass178_Sub1_1434.method14673(0);
		}
	}

	void method2025(int i, int i_7_) {
		if (aClass128_8989 != null) {
			aClass178_Sub1_1434.method14673(1);
			if ((i & 0x80) == 0) {
				if ((i_7_ & 0x1) == 1) {
					if (!aClass132_8992.aBool1569) {
						int i_8_ = aClass178_Sub1_1434.anInt9436 % 4000 * 16 / 4000;
						aClass178_Sub1_1434.method14711(aClass132_8992.aClass126_Sub2Array1564[i_8_]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						aClass178_Sub1_1434.method14711(aClass132_8992.aClass126_Sub3_1559);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, aFloat8990, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (aClass132_8992.aBool1569)
						aClass178_Sub1_1434.method14711(aClass132_8992.aClass126_Sub3_1559);
					else
						aClass178_Sub1_1434.method14711(aClass132_8992.aClass126_Sub2Array1564[0]);
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				aClass178_Sub1_1434.method14711(null);
			aClass178_Sub1_1434.method14673(0);
			if ((i & 0x40) == 0) {
				aFloatArray8995[0] = (aClass178_Sub1_1434.aFloat9359 * aClass178_Sub1_1434.aFloat9356);
				aFloatArray8995[1] = (aClass178_Sub1_1434.aFloat9359 * aClass178_Sub1_1434.aFloat9357);
				aFloatArray8995[2] = (aClass178_Sub1_1434.aFloat9359 * aClass178_Sub1_1434.aFloat9268);
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray8995, 0);
			} else
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			int i_9_ = i & 0x3;
			if (i_9_ == 2)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_9_ == 3)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	void method2021(int i, int i_10_) {
		if (aClass128_8989 != null) {
			aClass178_Sub1_1434.method14673(1);
			if ((i & 0x80) == 0) {
				if ((i_10_ & 0x1) == 1) {
					if (!aClass132_8992.aBool1569) {
						int i_11_ = aClass178_Sub1_1434.anInt9436 % 4000 * 16 / 4000;
						aClass178_Sub1_1434.method14711(aClass132_8992.aClass126_Sub2Array1564[i_11_]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						aClass178_Sub1_1434.method14711(aClass132_8992.aClass126_Sub3_1559);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, aFloat8990, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (aClass132_8992.aBool1569)
						aClass178_Sub1_1434.method14711(aClass132_8992.aClass126_Sub3_1559);
					else
						aClass178_Sub1_1434.method14711(aClass132_8992.aClass126_Sub2Array1564[0]);
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				aClass178_Sub1_1434.method14711(null);
			aClass178_Sub1_1434.method14673(0);
			if ((i & 0x40) == 0) {
				aFloatArray8995[0] = (aClass178_Sub1_1434.aFloat9359 * aClass178_Sub1_1434.aFloat9356);
				aFloatArray8995[1] = (aClass178_Sub1_1434.aFloat9359 * aClass178_Sub1_1434.aFloat9357);
				aFloatArray8995[2] = (aClass178_Sub1_1434.aFloat9359 * aClass178_Sub1_1434.aFloat9268);
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray8995, 0);
			} else
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			int i_12_ = i & 0x3;
			if (i_12_ == 2)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_12_ == 3)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	Class117_Sub9(Class178_Sub1 class178_sub1, Class132 class132) {
		super(class178_sub1);
		aClass132_8992 = class132;
		if (aClass178_Sub1_1434.aBool9412 && aClass178_Sub1_1434.anInt9241 >= 2) {
			aClass125_8993 = (Class125.method2107(aClass178_Sub1_1434, 34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND"));
			if (aClass125_8993 != null) {
				int[][] is = Class63.method1432(64, 256, 0, 4, 4, 3, 0.4F, false, -1234803579);
				int[][] is_13_ = Class63.method1432(64, 256, 8, 4, 4, 3, 0.4F, false, -1948756570);
				int i = 0;
				aFloatArray8991 = new float[32768];
				for (int i_14_ = 0; i_14_ < 256; i_14_++) {
					int[] is_15_ = is[i_14_];
					int[] is_16_ = is_13_[i_14_];
					for (int i_17_ = 0; i_17_ < 64; i_17_++) {
						aFloatArray8991[i++] = (float) is_15_[i_17_] / 4096.0F;
						aFloatArray8991[i++] = (float) is_16_[i_17_] / 4096.0F;
					}
				}
				method14420();
			}
		}
	}

	void method2020(boolean bool) {
		/* empty */
	}
}
