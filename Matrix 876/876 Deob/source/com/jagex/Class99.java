/* Class99 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class99 {
	boolean aBool1186;
	Runnable aRunnable1187;
	static final float aFloat1188 = 255.0F;
	boolean aBool1189;
	int[] anIntArray1190;
	float aFloat1191;
	int anInt1192;
	float aFloat1193;
	int[] anIntArray1194;
	int anInt1195;
	int anInt1196;
	int[] anIntArray1197;
	Class441 aClass441_1198;
	Class435 aClass435_1199;
	Class118 aClass118_1200;
	float[] aFloatArray1201;
	Class441 aClass441_1202;
	Class441 aClass441_1203;
	boolean aBool1204;
	float aFloat1205 = 0.85F;
	float[] aFloatArray1206;
	float[] aFloatArray1207;
	int[] anIntArray1208;
	int[] anIntArray1209;
	int anInt1210;
	int[] anIntArray1211;
	int[] anIntArray1212;
	float aFloat1213;
	Class435 aClass435_1214;
	float aFloat1215;
	float aFloat1216;
	float[] aFloatArray1217;
	float aFloat1218;
	float aFloat1219;
	int anInt1220;
	float aFloat1221;
	Class167_Sub1[] aClass167_Sub1Array1222;
	float[] aFloatArray1223;
	Class167_Sub1[] aClass167_Sub1Array1224;
	float[] aFloatArray1225;
	Class178_Sub3 aClass178_Sub3_1226;
	float[] aFloatArray1227;
	float[] aFloatArray1228;
	float[] aFloatArray1229;
	float[] aFloatArray1230;
	float[] aFloatArray1231;
	public static Class115[] aClass115Array1232;

	void method1781(short i) {
		aClass118_1200 = new Class118(aClass178_Sub3_1226, this);
	}

	void method1782(Runnable runnable, int i) {
		aRunnable1187 = runnable;
	}

	void method1783(Runnable runnable) {
		aRunnable1187 = runnable;
	}

	Class99(Class178_Sub3 class178_sub3) {
		aFloat1191 = 1.0F - aFloat1205;
		anInt1192 = 0;
		anInt1210 = 0;
		aBool1204 = false;
		anInt1195 = 0;
		anInt1196 = 0;
		aBool1186 = true;
		aClass441_1198 = new Class441();
		aClass435_1199 = new Class435();
		aClass435_1214 = new Class435();
		aClass441_1202 = new Class441();
		aClass441_1203 = new Class441();
		anIntArray1197 = new int[Class167_Sub1.anInt9050];
		aFloatArray1206 = new float[Class167_Sub1.anInt9050];
		aFloatArray1217 = new float[Class167_Sub1.anInt9050];
		aFloatArray1207 = new float[Class167_Sub1.anInt9050];
		aFloatArray1225 = new float[Class167_Sub1.anInt9050];
		anIntArray1209 = new int[8];
		anIntArray1212 = new int[8];
		anIntArray1211 = new int[8];
		anIntArray1208 = new int[10000];
		anIntArray1194 = new int[10000];
		aFloat1219 = 1.0F;
		aFloat1193 = 0.0F;
		aFloat1213 = 1.0F;
		aFloatArray1223 = new float[2];
		aClass167_Sub1Array1224 = new Class167_Sub1[8];
		aClass167_Sub1Array1222 = new Class167_Sub1[8];
		aFloatArray1201 = new float[64];
		aFloatArray1227 = new float[64];
		aFloatArray1228 = new float[64];
		aFloatArray1229 = new float[64];
		aFloatArray1230 = new float[64];
		aFloatArray1231 = new float[3];
		aClass178_Sub3_1226 = class178_sub3;
		aClass118_1200 = new Class118(class178_sub3, this);
		for (int i = 0; i < 8; i++) {
			aClass167_Sub1Array1224[i] = new Class167_Sub1(aClass178_Sub3_1226);
			aClass167_Sub1Array1222[i] = new Class167_Sub1(aClass178_Sub3_1226);
		}
		anIntArray1190 = new int[Class167_Sub1.anInt9071];
		for (int i = 0; i < Class167_Sub1.anInt9071; i++)
			anIntArray1190[i] = -1;
	}

	void method1784(Runnable runnable) {
		aRunnable1187 = runnable;
	}

	void method1785(Runnable runnable) {
		aRunnable1187 = runnable;
	}

	public static void method1786(byte i) {
		if (client.anInt11136 * -2020118759 == 11) {
			Class523_Sub22 class523_sub22 = Class523_Sub18.method16042(OutgoingPacket.aClass408_4261, (client.aClass116_11057.aClass11_1413), 1370050649);
			client.aClass116_11057.method1974(class523_sub22, (byte) 112);
			Class523_Sub27_Sub2.aClass700_11334 = Class700.aClass700_8774;
			Class54.aString725 = null;
		}
	}
}
