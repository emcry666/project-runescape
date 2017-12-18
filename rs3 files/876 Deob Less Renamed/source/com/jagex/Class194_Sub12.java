/* Class194_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Arrays;

public class Class194_Sub12 extends Class194 {
	int anInt9915;
	int anInt9916;
	int[] anIntArray9917;
	int anInt9918;

	Class194_Sub12(Class523_Sub34 class523_sub34) {
		super(class523_sub34);
		anInt9918 = class523_sub34.readUnsignedShort(-733057384) * 904967651;
		anIntArray9917 = new int[4];
		anInt9915 = class523_sub34.readBigSmart((byte) -88) * 199888759;
		Arrays.fill(anIntArray9917, 0, anIntArray9917.length, -222201273 * anInt9915);
		anInt9916 = class523_sub34.readUnsignedInt((byte) -60) * -1754528289;
	}

	boolean method3655() {
		AnimationDefinitions class205 = ((AnimationDefinitions) Class248.aClass53_Sub13_2492.getDefinition(anInt9915 * -222201273, (byte) -33));
		return class205.method3719(169699403);
	}

	boolean method3650(int i) {
		AnimationDefinitions class205 = ((AnimationDefinitions) Class248.aClass53_Sub13_2492.getDefinition(anInt9915 * -222201273, (byte) -81));
		return class205.method3719(169699403);
	}

	public void method3651() {
		Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1 = Class191.aClass192Array2157[2122594251 * anInt9918].method3631(1806112036);
		if (-426117601 * anInt9916 == 0)
			Class643.method10538(class647_sub1_sub3_sub1, anIntArray9917, 0, false, -1952064036);
		else
			Class523.method8667(class647_sub1_sub3_sub1, new int[] { -222201273 * anInt9915 }, new int[] { 0 }, new int[] { -426117601 * anInt9916 }, (byte) 84);
	}

	public void method3656() {
		Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1 = Class191.aClass192Array2157[2122594251 * anInt9918].method3631(660197520);
		if (-426117601 * anInt9916 == 0)
			Class643.method10538(class647_sub1_sub3_sub1, anIntArray9917, 0, false, 1706861403);
		else
			Class523.method8667(class647_sub1_sub3_sub1, new int[] { -222201273 * anInt9915 }, new int[] { 0 }, new int[] { -426117601 * anInt9916 }, (byte) 38);
	}

	public void method3657() {
		Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1 = Class191.aClass192Array2157[2122594251 * anInt9918].method3631(204809500);
		if (-426117601 * anInt9916 == 0)
			Class643.method10538(class647_sub1_sub3_sub1, anIntArray9917, 0, false, 1487225506);
		else
			Class523.method8667(class647_sub1_sub3_sub1, new int[] { -222201273 * anInt9915 }, new int[] { 0 }, new int[] { -426117601 * anInt9916 }, (byte) 107);
	}

	boolean method3653() {
		AnimationDefinitions class205 = ((AnimationDefinitions) Class248.aClass53_Sub13_2492.getDefinition(anInt9915 * -222201273, (byte) -96));
		return class205.method3719(169699403);
	}

	boolean method3654() {
		AnimationDefinitions class205 = ((AnimationDefinitions) Class248.aClass53_Sub13_2492.getDefinition(anInt9915 * -222201273, (byte) 11));
		return class205.method3719(169699403);
	}

	public void method3648(int i) {
		Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1 = Class191.aClass192Array2157[2122594251 * anInt9918].method3631(2137576621);
		if (-426117601 * anInt9916 == 0)
			Class643.method10538(class647_sub1_sub3_sub1, anIntArray9917, 0, false, -1676886334);
		else
			Class523.method8667(class647_sub1_sub3_sub1, new int[] { -222201273 * anInt9915 }, new int[] { 0 }, new int[] { -426117601 * anInt9916 }, (byte) 71);
	}

	static boolean method15510(int i, int i_0_) {
		return i == 16 || i == 1 || 3 == i || i == 11 || i == 13 || 5 == i;
	}
}
