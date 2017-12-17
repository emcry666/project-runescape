/* Class117_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class117_Sub8 extends Class117 {
	static float[] aFloatArray8972 = { 0.0F, -1.0F, 0.0F, 0.0F };
	Class126_Sub2 aClass126_Sub2_8973;
	static final String aString8974 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";
	static final String aString8975 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";
	boolean aBool8976;
	Class125 aClass125_8977;
	boolean aBool8978;
	boolean aBool8979 = false;
	static final String aString8980 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";
	Class125 aClass125_8981;
	Class125 aClass125_8982;
	Class125 aClass125_8983;
	static final String aString8984 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";
	boolean aBool8985;

	void method2020(boolean bool) {
		/* empty */
	}

	void method2027(Class126 class126, int i) {
		if (class126 == null) {
			if (!aBool8979) {
				aClass178_Sub1_1434.method14711(aClass178_Sub1_1434.aClass126_Sub2_9387);
				aClass178_Sub1_1434.method14785(1);
				aClass178_Sub1_1434.method14677(0, 34168, 768);
				aClass178_Sub1_1434.method14678(0, 34168, 770);
				aBool8979 = true;
			}
		} else {
			if (aBool8979) {
				aClass178_Sub1_1434.method14677(0, 5890, 768);
				aClass178_Sub1_1434.method14678(0, 5890, 770);
				aBool8979 = false;
			}
			aClass178_Sub1_1434.method14711(class126);
			aClass178_Sub1_1434.method14785(i);
		}
	}

	void method2026(boolean bool) {
		aBool8978 = bool;
		aClass178_Sub1_1434.method14673(1);
		aClass178_Sub1_1434.method14711(aClass126_Sub2_8973);
		aClass178_Sub1_1434.method14676(34165, 7681);
		aClass178_Sub1_1434.method14677(0, 34166, 768);
		aClass178_Sub1_1434.method14677(2, 5890, 770);
		aClass178_Sub1_1434.method14678(0, 34168, 770);
		aClass178_Sub1_1434.method14673(0);
		method14414();
	}

	Class117_Sub8(Class178_Sub1 class178_sub1) {
		super(class178_sub1);
		if (aClass178_Sub1_1434.aBool9412) {
			aClass125_8977 = (Class125.method2107(aClass178_Sub1_1434, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n"));
			aClass125_8983 = (Class125.method2107(aClass178_Sub1_1434, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n"));
			aClass125_8982 = (Class125.method2107(aClass178_Sub1_1434, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n"));
			aClass125_8981 = (Class125.method2107(aClass178_Sub1_1434, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n"));
			if (aClass125_8977 != null & aClass125_8983 != null & aClass125_8982 != null & aClass125_8981 != null) {
				aClass126_Sub2_8973 = new Class126_Sub2(class178_sub1, 3553, Class158.aClass158_1747, Class170.aClass170_1822, 2, 1, false, new byte[] { 0, -1 }, Class158.aClass158_1747, false);
				aClass126_Sub2_8973.method14363(false, false);
				aBool8976 = true;
			} else
				aBool8976 = false;
		} else
			aBool8976 = false;
	}

	void method2021(int i, int i_0_) {
		/* empty */
	}

	void method14414() {
		Class441 class441 = aClass178_Sub1_1434.aClass441_9316;
		if (aBool8978)
			OpenGL.glBindProgramARB(34336, ((aClass178_Sub1_1434.anInt9228 == 2147483647) ? aClass125_8983.anInt1528 : aClass125_8981.anInt1528));
		else
			OpenGL.glBindProgramARB(34336, ((aClass178_Sub1_1434.anInt9228 == 2147483647) ? aClass125_8977.anInt1528 : aClass125_8982.anInt1528));
		float f = (float) aClass178_Sub1_1434.anInt9228;
		float f_1_ = class441.aFloatArray4916[4] * f + class441.aFloatArray4916[12];
		float f_2_ = class441.aFloatArray4916[5] * f + class441.aFloatArray4916[13];
		float f_3_ = class441.aFloatArray4916[6] * f + class441.aFloatArray4916[14];
		aFloatArray8972[0] = -class441.aFloatArray4916[4];
		aFloatArray8972[1] = -class441.aFloatArray4916[5];
		aFloatArray8972[2] = -class441.aFloatArray4916[6];
		aFloatArray8972[3] = -(aFloatArray8972[0] * f_1_ + aFloatArray8972[1] * f_2_ + aFloatArray8972[2] * f_3_);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray8972[0], aFloatArray8972[1], aFloatArray8972[2], aFloatArray8972[3]);
		OpenGL.glEnable(34336);
		aBool8985 = true;
		method14415();
	}

	void method14415() {
		if (aBool8985) {
			float f = aClass178_Sub1_1434.aFloat9313;
			float f_4_ = aClass178_Sub1_1434.aFloat9340;
			float f_5_ = f - (f - f_4_) * 0.125F;
			float f_6_ = f - (f - f_4_) * 0.25F;
			OpenGL.glProgramLocalParameter4fARB(34336, 0, f_6_, f_5_, 256.0F / (float) (aClass178_Sub1_1434.aClass163_9377.anInt1775 * -118212955), (float) (aClass178_Sub1_1434.aClass163_9377.anInt1774 * -1046224519) / 255.0F);
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14679((aClass178_Sub1_1434.aClass163_9377.anInt1776) * -319632409);
			aClass178_Sub1_1434.method14673(0);
		}
	}

	void method2024() {
		if (aBool8985) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			aBool8985 = false;
		}
		aClass178_Sub1_1434.method14673(1);
		aClass178_Sub1_1434.method14711(null);
		aClass178_Sub1_1434.method14676(8448, 8448);
		aClass178_Sub1_1434.method14677(0, 5890, 768);
		aClass178_Sub1_1434.method14677(2, 34166, 770);
		aClass178_Sub1_1434.method14678(0, 5890, 770);
		aClass178_Sub1_1434.method14673(0);
		if (aBool8979) {
			aClass178_Sub1_1434.method14677(0, 5890, 768);
			aClass178_Sub1_1434.method14678(0, 5890, 770);
			aBool8979 = false;
		}
	}

	void method2010(int i, int i_7_) {
		/* empty */
	}

	void method14416() {
		if (aBool8985) {
			float f = aClass178_Sub1_1434.aFloat9313;
			float f_8_ = aClass178_Sub1_1434.aFloat9340;
			float f_9_ = f - (f - f_8_) * 0.125F;
			float f_10_ = f - (f - f_8_) * 0.25F;
			OpenGL.glProgramLocalParameter4fARB(34336, 0, f_10_, f_9_, 256.0F / (float) (aClass178_Sub1_1434.aClass163_9377.anInt1775 * -118212955), (float) (aClass178_Sub1_1434.aClass163_9377.anInt1774 * -1046224519) / 255.0F);
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14679((aClass178_Sub1_1434.aClass163_9377.anInt1776) * -319632409);
			aClass178_Sub1_1434.method14673(0);
		}
	}

	boolean method2022() {
		return aBool8976;
	}

	boolean method2016() {
		return aBool8976;
	}

	void method2017(boolean bool) {
		aBool8978 = bool;
		aClass178_Sub1_1434.method14673(1);
		aClass178_Sub1_1434.method14711(aClass126_Sub2_8973);
		aClass178_Sub1_1434.method14676(34165, 7681);
		aClass178_Sub1_1434.method14677(0, 34166, 768);
		aClass178_Sub1_1434.method14677(2, 5890, 770);
		aClass178_Sub1_1434.method14678(0, 34168, 770);
		aClass178_Sub1_1434.method14673(0);
		method14414();
	}

	void method2018(boolean bool) {
		aBool8978 = bool;
		aClass178_Sub1_1434.method14673(1);
		aClass178_Sub1_1434.method14711(aClass126_Sub2_8973);
		aClass178_Sub1_1434.method14676(34165, 7681);
		aClass178_Sub1_1434.method14677(0, 34166, 768);
		aClass178_Sub1_1434.method14677(2, 5890, 770);
		aClass178_Sub1_1434.method14678(0, 34168, 770);
		aClass178_Sub1_1434.method14673(0);
		method14414();
	}

	void method2019(boolean bool) {
		aBool8978 = bool;
		aClass178_Sub1_1434.method14673(1);
		aClass178_Sub1_1434.method14711(aClass126_Sub2_8973);
		aClass178_Sub1_1434.method14676(34165, 7681);
		aClass178_Sub1_1434.method14677(0, 34166, 768);
		aClass178_Sub1_1434.method14677(2, 5890, 770);
		aClass178_Sub1_1434.method14678(0, 34168, 770);
		aClass178_Sub1_1434.method14673(0);
		method14414();
	}

	void method2013(Class126 class126, int i) {
		if (class126 == null) {
			if (!aBool8979) {
				aClass178_Sub1_1434.method14711(aClass178_Sub1_1434.aClass126_Sub2_9387);
				aClass178_Sub1_1434.method14785(1);
				aClass178_Sub1_1434.method14677(0, 34168, 768);
				aClass178_Sub1_1434.method14678(0, 34168, 770);
				aBool8979 = true;
			}
		} else {
			if (aBool8979) {
				aClass178_Sub1_1434.method14677(0, 5890, 768);
				aClass178_Sub1_1434.method14678(0, 5890, 770);
				aBool8979 = false;
			}
			aClass178_Sub1_1434.method14711(class126);
			aClass178_Sub1_1434.method14785(i);
		}
	}

	void method2008(boolean bool) {
		/* empty */
	}

	void method2015() {
		if (aBool8985) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			aBool8985 = false;
		}
		aClass178_Sub1_1434.method14673(1);
		aClass178_Sub1_1434.method14711(null);
		aClass178_Sub1_1434.method14676(8448, 8448);
		aClass178_Sub1_1434.method14677(0, 5890, 768);
		aClass178_Sub1_1434.method14677(2, 34166, 770);
		aClass178_Sub1_1434.method14678(0, 5890, 770);
		aClass178_Sub1_1434.method14673(0);
		if (aBool8979) {
			aClass178_Sub1_1434.method14677(0, 5890, 768);
			aClass178_Sub1_1434.method14678(0, 5890, 770);
			aBool8979 = false;
		}
	}

	void method2012() {
		if (aBool8985) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			aBool8985 = false;
		}
		aClass178_Sub1_1434.method14673(1);
		aClass178_Sub1_1434.method14711(null);
		aClass178_Sub1_1434.method14676(8448, 8448);
		aClass178_Sub1_1434.method14677(0, 5890, 768);
		aClass178_Sub1_1434.method14677(2, 34166, 770);
		aClass178_Sub1_1434.method14678(0, 5890, 770);
		aClass178_Sub1_1434.method14673(0);
		if (aBool8979) {
			aClass178_Sub1_1434.method14677(0, 5890, 768);
			aClass178_Sub1_1434.method14678(0, 5890, 770);
			aBool8979 = false;
		}
	}

	void method2028() {
		if (aBool8985) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			aBool8985 = false;
		}
		aClass178_Sub1_1434.method14673(1);
		aClass178_Sub1_1434.method14711(null);
		aClass178_Sub1_1434.method14676(8448, 8448);
		aClass178_Sub1_1434.method14677(0, 5890, 768);
		aClass178_Sub1_1434.method14677(2, 34166, 770);
		aClass178_Sub1_1434.method14678(0, 5890, 770);
		aClass178_Sub1_1434.method14673(0);
		if (aBool8979) {
			aClass178_Sub1_1434.method14677(0, 5890, 768);
			aClass178_Sub1_1434.method14678(0, 5890, 770);
			aBool8979 = false;
		}
	}

	void method2025(int i, int i_11_) {
		/* empty */
	}

	boolean method2014() {
		return aBool8976;
	}

	boolean method2009() {
		return aBool8976;
	}

	void method2023(Class126 class126, int i) {
		if (class126 == null) {
			if (!aBool8979) {
				aClass178_Sub1_1434.method14711(aClass178_Sub1_1434.aClass126_Sub2_9387);
				aClass178_Sub1_1434.method14785(1);
				aClass178_Sub1_1434.method14677(0, 34168, 768);
				aClass178_Sub1_1434.method14678(0, 34168, 770);
				aBool8979 = true;
			}
		} else {
			if (aBool8979) {
				aClass178_Sub1_1434.method14677(0, 5890, 768);
				aClass178_Sub1_1434.method14678(0, 5890, 770);
				aBool8979 = false;
			}
			aClass178_Sub1_1434.method14711(class126);
			aClass178_Sub1_1434.method14785(i);
		}
	}

	void method2011(boolean bool) {
		/* empty */
	}

	void method14417() {
		if (aBool8985) {
			float f = aClass178_Sub1_1434.aFloat9313;
			float f_12_ = aClass178_Sub1_1434.aFloat9340;
			float f_13_ = f - (f - f_12_) * 0.125F;
			float f_14_ = f - (f - f_12_) * 0.25F;
			OpenGL.glProgramLocalParameter4fARB(34336, 0, f_14_, f_13_, 256.0F / (float) (aClass178_Sub1_1434.aClass163_9377.anInt1775 * -118212955), (float) (aClass178_Sub1_1434.aClass163_9377.anInt1774 * -1046224519) / 255.0F);
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14679((aClass178_Sub1_1434.aClass163_9377.anInt1776) * -319632409);
			aClass178_Sub1_1434.method14673(0);
		}
	}

	void method14418() {
		if (aBool8985) {
			float f = aClass178_Sub1_1434.aFloat9313;
			float f_15_ = aClass178_Sub1_1434.aFloat9340;
			float f_16_ = f - (f - f_15_) * 0.125F;
			float f_17_ = f - (f - f_15_) * 0.25F;
			OpenGL.glProgramLocalParameter4fARB(34336, 0, f_17_, f_16_, 256.0F / (float) (aClass178_Sub1_1434.aClass163_9377.anInt1775 * -118212955), (float) (aClass178_Sub1_1434.aClass163_9377.anInt1774 * -1046224519) / 255.0F);
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14679((aClass178_Sub1_1434.aClass163_9377.anInt1776) * -319632409);
			aClass178_Sub1_1434.method14673(0);
		}
	}

	void method14419() {
		if (aBool8985) {
			float f = aClass178_Sub1_1434.aFloat9313;
			float f_18_ = aClass178_Sub1_1434.aFloat9340;
			float f_19_ = f - (f - f_18_) * 0.125F;
			float f_20_ = f - (f - f_18_) * 0.25F;
			OpenGL.glProgramLocalParameter4fARB(34336, 0, f_20_, f_19_, 256.0F / (float) (aClass178_Sub1_1434.aClass163_9377.anInt1775 * -118212955), (float) (aClass178_Sub1_1434.aClass163_9377.anInt1774 * -1046224519) / 255.0F);
			aClass178_Sub1_1434.method14673(1);
			aClass178_Sub1_1434.method14679((aClass178_Sub1_1434.aClass163_9377.anInt1776) * -319632409);
			aClass178_Sub1_1434.method14673(0);
		}
	}
}
