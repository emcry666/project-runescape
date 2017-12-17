/* Class298 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public abstract class Class298 {
	Interface30 anInterface30_3194;
	Class293 aClass293_3195;
	int anInt3196;
	float aFloat3197;
	float aFloat3198;
	Class291 aClass291_3199;
	Class328 aClass328_3200;
	Class688 aClass688_3201;
	Class303 aClass303_3202;
	Class437 aClass437_3203;
	float aFloat3204;
	Class437 aClass437_3205 = new Class437();
	Class306 aClass306_3206;
	public static final float aFloat3207 = Float.POSITIVE_INFINITY;
	Class437 aClass437_3208;
	Class437 aClass437_3209;
	boolean aBool3210;
	float aFloat3211 = 10.0F;
	float aFloat3212 = 1.0F;
	float aFloat3213;
	float aFloat3214;
	float aFloat3215 = 5120.0F;
	Class437 aClass437_3216;
	Class295 aClass295_3217;
	float aFloat3218;
	float aFloat3219;
	float aFloat3220;
	Class437 aClass437_3221 = new Class437();
	static final int anInt3222 = 50;
	static final int anInt3223 = 10000;
	float aFloat3224;
	float aFloat3225;
	Class294 aClass294_3226;
	boolean aBool3227;
	int anInt3228;
	float aFloat3229;
	Class14 aClass14_3230;

	public void method5307(int i, float f) throws Exception_Sub7 {
		if (!method5314((short) 21707) || !aClass303_3202.aBool3342)
			throw new Exception_Sub7();
		anInt3228 = i * -436452313;
		aFloat3229 = f;
	}

	public void method5308(Class437 class437, int i) throws Exception_Sub7 {
		if (!method5314((short) 23105) || !aClass303_3202.aBool3342)
			throw new Exception_Sub7();
		aClass437_3205.method6886(class437);
	}

	public Class437 method5309(int i) {
		return aClass437_3203;
	}

	public void method5310(boolean bool, float f, Class437 class437, Class440 class440, Class437 class437_0_, Class437 class437_1_, byte i) {
		if (Class303.aClass303_3338 == aClass303_3202)
			Class581.method9663(f, class437, class437_0_, class437_1_, bool ? aClass437_3209 : aClass437_3203, bool ? aClass437_3221 : aClass437_3205, (float) (anInt3228 * 532474775), aFloat3229, aFloat3213, aFloat3214, -1028007366);
		else if (aClass303_3202 == Class303.aClass303_3339)
			Class311_Sub1.method15544(f, class437, class440, class437_0_, class437_1_, bool ? aClass437_3209 : aClass437_3203, bool ? aClass437_3221 : aClass437_3205, (float) (anInt3228 * 532474775), aFloat3229, aFloat3213, aFloat3214, 580783049);
		else if (aClass303_3202 == Class303.aClass303_3340)
			Class468.method7606(f, class437, class440, class437_0_, class437_1_, bool ? aClass437_3216 : aClass437_3208, bool ? aFloat3219 : aFloat3218, aFloat3213, aFloat3197, -683719031);
	}

	public void method5311(Class293 class293, int i) {
		aClass293_3195 = class293;
	}

	public void method5312(int i) {
		aClass14_3230.method733(1917581838);
	}

	public Class328 method5313(Class291 class291, boolean bool, byte i) throws Exception_Sub7 {
		if (Class293.aClass293_3161 == aClass293_3195 && !bool)
			throw new Exception_Sub7();
		aClass291_3199 = class291;
		if (Class291.aClass291_3148 == class291)
			aClass328_3200 = new Class328_Sub2(this);
		else if (class291 == Class291.aClass291_3151)
			aClass328_3200 = new Class328_Sub1(this);
		else if (class291 == Class291.aClass291_3147)
			aClass328_3200 = new Class328_Sub3_Sub1(this);
		else if (Class291.aClass291_3150 == class291)
			aClass328_3200 = new Class328_Sub3_Sub2(this);
		else if (class291 == Class291.aClass291_3149)
			aClass328_3200 = new Class328_Sub3_Sub3(this);
		return aClass328_3200;
	}

	boolean method5314(short i) {
		if (Class306.aClass306_3348 == aClass306_3206 && Class293.aClass293_3161 == aClass293_3195)
			return true;
		if (Class306.aClass306_3349 == aClass306_3206 && aClass293_3195 == Class293.aClass293_3160)
			return true;
		return false;
	}

	public void method5315(float f, byte i) throws Exception_Sub7 {
		if (!method5314((short) 23364))
			throw new Exception_Sub7();
	}

	public void method5316(float f, int i) throws Exception_Sub7 {
		if (!method5314((short) 1389))
			throw new Exception_Sub7();
		aFloat3204 = f;
	}

	public void method5317(Class303 class303, int i) throws Exception_Sub7 {
		if (!method5314((short) 11139))
			throw new Exception_Sub7();
		aClass303_3202 = class303;
	}

	public void method5318(Class437 class437, int i) throws Exception_Sub7 {
		if (!method5314((short) 12493) || !aClass303_3202.aBool3342)
			throw new Exception_Sub7();
		aClass437_3203.method6886(class437);
	}

	public void method5319(Class437 class437, int i) throws Exception_Sub7 {
		if (!method5314((short) 12681) || !aClass303_3202.aBool3342)
			throw new Exception_Sub7();
		aClass437_3209.method6886(class437);
	}

	public void method5320(float f, float f_2_, float f_3_, int i) throws Exception_Sub7 {
		if (!method5314((short) 18897))
			throw new Exception_Sub7();
		aFloat3213 = f;
		aFloat3214 = f_2_;
		aFloat3197 = f_3_;
	}

	public void method5321(byte i) throws Exception_Sub7 {
		if (!method5314((short) 14619))
			throw new Exception_Sub7();
		aFloat3213 = 5120.0F;
		aFloat3214 = 10.0F;
		aFloat3197 = 1.0F;
	}

	public Class523_Sub29 method5322() {
		if (null == aClass328_3200 || !aClass328_3200.method5761(-1412407626))
			return null;
		return aClass328_3200.method5763((byte) -14);
	}

	public void method5323(Class437 class437, int i) throws Exception_Sub7 {
		if (!method5314((short) 16141) || !aClass303_3202.aBool3342)
			throw new Exception_Sub7();
		aClass437_3221.method6886(class437);
	}

	public void method5324(Class437 class437, float f, int i) throws Exception_Sub7 {
		if (!method5314((short) 590) || aClass303_3202.aBool3342)
			throw new Exception_Sub7();
		aClass437_3208.method6886(class437);
		aClass437_3216.method6886(class437);
		aFloat3218 = f;
		aFloat3219 = f;
	}

	public Class437 method5325(int i) {
		return aClass437_3221;
	}

	public void method5326(Class437 class437, float f, byte i) throws Exception_Sub7 {
		if (!method5314((short) 15964) || aClass303_3202.aBool3342)
			throw new Exception_Sub7();
		aClass437_3216.method6886(class437);
		aFloat3219 = f;
	}

	public void method5327(float f, float f_4_, int i) throws Exception_Sub7 {
		if (!method5314((short) 24925))
			throw new Exception_Sub7();
		if (f < 1.0F)
			f = 50.0F;
		if (f_4_ < 1.0F)
			f_4_ = 10000.0F;
		if (f >= f_4_)
			throw new Exception_Sub7();
		aFloat3220 = f;
		aFloat3198 = f_4_;
	}

	public Class688 method5328(Class294 class294, boolean bool, short i) throws Exception_Sub7 {
		if (Class293.aClass293_3161 == aClass293_3195 && !bool)
			throw new Exception_Sub7();
		aClass294_3226 = class294;
		if (class294 == Class294.aClass294_3164)
			aClass688_3201 = new Class688_Sub2(this);
		else if (Class294.aClass294_3166 == class294)
			aClass688_3201 = new Class688_Sub3(this);
		else if (class294 == Class294.aClass294_3165)
			aClass688_3201 = new Class688_Sub1(this);
		else if (class294 == Class294.aClass294_3168)
			aClass688_3201 = new Class688_Sub4_Sub2(this);
		else if (Class294.aClass294_3167 == class294)
			aClass688_3201 = new Class688_Sub4_Sub3(this);
		else if (class294 == Class294.aClass294_3169)
			aClass688_3201 = new Class688_Sub5(this);
		else if (class294 == Class294.aClass294_3170)
			aClass688_3201 = new Class688_Sub4_Sub1(this);
		return aClass688_3201;
	}

	public void method5329(boolean bool, boolean bool_5_, int i) throws Exception_Sub7 {
		if (!method5314((short) 19754))
			throw new Exception_Sub7();
		aBool3210 = bool;
		aBool3227 = bool_5_;
	}

	public void method5330(int i, float f, int i_6_) throws Exception_Sub7 {
		if (!method5314((short) 28215) || !aClass303_3202.aBool3342)
			throw new Exception_Sub7();
		anInt3228 = i * -436452313;
		aFloat3229 = f;
	}

	public float method5331() {
		return aFloat3204;
	}

	public Class440 method5332() {
		Class440 class440 = Class440.method7063();
		class440.method7018(method5348(-1481815339), method5347(782055274), method5349(-1608633699));
		return class440;
	}

	public Class523_Sub27_Sub13 method5333(int i, int i_7_) {
		return (Class523_Sub27_Sub13) aClass14_3230.method741((long) i);
	}

	public void method5334(boolean bool, boolean bool_8_) throws Exception_Sub7 {
		if (!method5314((short) 12927))
			throw new Exception_Sub7();
		aBool3210 = bool;
		aBool3227 = bool_8_;
	}

	public boolean method5335(int i) {
		if (null == aClass688_3201 || null == aClass328_3200)
			return false;
		if (!aClass688_3201.method13906(10267966))
			return false;
		if (!aClass328_3200.method5761(686956397))
			return false;
		return true;
	}

	public Class294 method5336() {
		return aClass294_3226;
	}

	public Class293 method5337(int i) {
		return aClass293_3195;
	}

	public void method5338(Class307 class307, Class435 class435, Class441 class441, int i, int i_9_) {
		if (method5335(-231586787)) {
			aClass688_3201.method13904(class307, class435, i, i_9_, aClass328_3200.method5764(1293241632), -1697416059);
			aClass328_3200.method5765(class307, i, i_9_, -1385577949);
			if (aClass295_3217 == Class295.aClass295_3174)
				class441.method7115(aFloat3220, aFloat3198, aFloat3224, aFloat3225);
			else
				class441.method7100(aFloat3220, aFloat3198, (float) (2068929341 * anInt3196));
			Iterator iterator = aClass14_3230.iterator();
			while (iterator.hasNext()) {
				Class523_Sub27_Sub13 class523_sub27_sub13 = (Class523_Sub27_Sub13) iterator.next();
				class523_sub27_sub13.method18142(class307, class435, class441, (short) 1093);
			}
		}
	}

	public void method5339(Class437 class437, float f) throws Exception_Sub7 {
		if (!method5314((short) 20065) || aClass303_3202.aBool3342)
			throw new Exception_Sub7();
		aClass437_3208.method6886(class437);
		aClass437_3216.method6886(class437);
		aFloat3218 = f;
		aFloat3219 = f;
	}

	public void method5340() throws Exception_Sub7 {
		if (!method5314((short) 2417))
			throw new Exception_Sub7();
		aFloat3213 = 5120.0F;
		aFloat3214 = 10.0F;
		aFloat3197 = 1.0F;
	}

	public Class294 method5341(byte i) {
		return aClass294_3226;
	}

	public Class291 method5342(int i) {
		return aClass291_3199;
	}

	public void method5343(Class437 class437) throws Exception_Sub7 {
		if (!method5314((short) 11677) || !aClass303_3202.aBool3342)
			throw new Exception_Sub7();
		aClass437_3203.method6886(class437);
	}

	public double[] method5344(byte i) {
		if (aClass328_3200 == null || !aClass328_3200.method5761(2031440898))
			return null;
		return aClass328_3200.method5762(-1218994021);
	}

	public Interface30 method5345() {
		return anInterface30_3194;
	}

	public Class523_Sub29 method5346(byte i) {
		if (null == aClass328_3200 || !aClass328_3200.method5761(-2100524975))
			return null;
		return aClass328_3200.method5763((byte) 0);
	}

	public float method5347(int i) {
		Class437 class437 = method5378(669208620);
		Class437 class437_10_ = method5397(-534457062);
		float f = 0.0F;
		if (null != class437 && class437_10_ != null) {
			Class437 class437_11_ = Class437.method6932(class437_10_, class437);
			float f_12_ = (float) Math.sqrt((double) ((class437_11_.aFloat4905 * class437_11_.aFloat4905) + (class437_11_.aFloat4903 * class437_11_.aFloat4903)));
			f = (float) Math.atan2((double) -class437_11_.aFloat4904, (double) f_12_);
			class437.method6949();
			class437_10_.method6949();
		}
		return f;
	}

	public float method5348(int i) {
		Class437 class437 = method5378(1124676544);
		Class437 class437_13_ = method5397(738130747);
		float f = 0.0F;
		if (null != class437 && null != class437_13_) {
			Class437 class437_14_ = Class437.method6932(class437, class437_13_);
			class437_14_.aFloat4904 = 0.0F;
			f = (float) Math.atan2((double) class437_14_.aFloat4903, (double) class437_14_.aFloat4905);
			class437.method6949();
			class437_13_.method6949();
		}
		return (float) (3.141592653589793 - (double) f);
	}

	float method5349(int i) {
		return 0.0F;
	}

	public void method5350(int i, float f) throws Exception_Sub7 {
		if (!method5314((short) 3964) || !aClass303_3202.aBool3342)
			throw new Exception_Sub7();
		anInt3228 = i * -436452313;
		aFloat3229 = f;
	}

	public Class688 method5351() {
		return aClass688_3201;
	}

	public Class437 method5352(byte i) {
		return aClass437_3209;
	}

	public void method5353(boolean bool, float f, Class437 class437, Class440 class440, Class437 class437_15_, Class437 class437_16_) {
		if (Class303.aClass303_3338 == aClass303_3202)
			Class581.method9663(f, class437, class437_15_, class437_16_, bool ? aClass437_3209 : aClass437_3203, bool ? aClass437_3221 : aClass437_3205, (float) (anInt3228 * 532474775), aFloat3229, aFloat3213, aFloat3214, -1028007366);
		else if (aClass303_3202 == Class303.aClass303_3339)
			Class311_Sub1.method15544(f, class437, class440, class437_15_, class437_16_, bool ? aClass437_3209 : aClass437_3203, bool ? aClass437_3221 : aClass437_3205, (float) (anInt3228 * 532474775), aFloat3229, aFloat3213, aFloat3214, 682782491);
		else if (aClass303_3202 == Class303.aClass303_3340)
			Class468.method7606(f, class437, class440, class437_15_, class437_16_, bool ? aClass437_3216 : aClass437_3208, bool ? aFloat3219 : aFloat3218, aFloat3213, aFloat3197, -683719031);
	}

	public Class437 method5354(int i) {
		return aClass437_3205;
	}

	public void method5355(Class307 class307, Class435 class435, Class441 class441, int i, int i_17_, int i_18_) {
		if (method5335(-231586787)) {
			aClass688_3201.method13904(class307, class435, i, i_17_, aClass328_3200.method5764(1293241632), -1881571073);
			aClass328_3200.method5765(class307, i, i_17_, -1385577949);
			if (aClass295_3217 == Class295.aClass295_3174)
				class441.method7115(aFloat3220, aFloat3198, aFloat3224, aFloat3225);
			else
				class441.method7100(aFloat3220, aFloat3198, (float) (2068929341 * anInt3196));
			Iterator iterator = aClass14_3230.iterator();
			while (iterator.hasNext()) {
				Class523_Sub27_Sub13 class523_sub27_sub13 = (Class523_Sub27_Sub13) iterator.next();
				class523_sub27_sub13.method18142(class307, class435, class441, (short) 1093);
			}
		}
	}

	public float method5356(int i) {
		return aFloat3220;
	}

	public float method5357(byte i) {
		return aFloat3198;
	}

	public float method5358(int i) {
		return aFloat3224;
	}

	public boolean method5359(int i) {
		return aBool3210;
	}

	public Class440 method5360() {
		Class440 class440 = Class440.method7063();
		class440.method7018(method5348(-1977039227), method5347(-1443946557), method5349(-1865484646));
		return class440;
	}

	public void method5361(boolean bool) {
		aClass295_3217 = Class295.aClass295_3174;
		aClass294_3226 = null;
		aClass688_3201 = null;
		aClass291_3199 = null;
		aClass328_3200 = null;
		if (Class306.aClass306_3348 == aClass306_3206 || !bool)
			aClass293_3195 = Class293.aClass293_3161;
		else
			aClass293_3195 = Class293.aClass293_3160;
		aClass303_3202 = Class303.aClass303_3339;
		aClass437_3205.method6972(100.0F, 100.0F, 100.0F);
		aClass437_3221.method6972(100.0F, 100.0F, 100.0F);
		aFloat3204 = 0.05F;
		aClass437_3203.method6972(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		aClass437_3209.method6972(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		aClass437_3208.method6972(1.0F, 1.0F, 1.0F);
		aClass437_3216.method6972(1.0F, 1.0F, 1.0F);
		aFloat3218 = 1.1F;
		aFloat3219 = 1.1F;
		aFloat3220 = 50.0F;
		aFloat3198 = 10000.0F;
		aFloat3225 = 1.5707964F;
		aFloat3224 = 1.5707964F;
		anInt3196 = 1456546921;
		aBool3210 = true;
		aBool3227 = true;
		anInt3228 = 0;
		aFloat3229 = 1.0F;
		aClass14_3230.method733(1946101933);
	}

	public void method5362(Class437 class437) throws Exception_Sub7 {
		if (!method5314((short) 7461) || !aClass303_3202.aBool3342)
			throw new Exception_Sub7();
		aClass437_3221.method6886(class437);
	}

	public void method5363(float f, float f_19_) throws Exception_Sub7 {
		if (!method5314((short) 20705))
			throw new Exception_Sub7();
		if (f < 1.0F)
			f = 50.0F;
		if (f_19_ < 1.0F)
			f_19_ = 10000.0F;
		if (f >= f_19_)
			throw new Exception_Sub7();
		aFloat3220 = f;
		aFloat3198 = f_19_;
	}

	public void method5364(float f, int[][][] is, Class451 class451, int i, int i_20_) {
		if (aClass688_3201 != null)
			aClass688_3201.method13924(f, (byte) 1);
		if (aClass328_3200 != null)
			aClass328_3200.method5773(f, is, class451, i, i_20_, 2143835141);
		Iterator iterator = aClass14_3230.iterator();
		while (iterator.hasNext()) {
			Class523_Sub27_Sub13 class523_sub27_sub13 = (Class523_Sub27_Sub13) iterator.next();
			class523_sub27_sub13.method18141(f, (byte) 9);
		}
	}

	public void method5365(float f, int[][][] is, Class451 class451, int i, int i_21_) {
		if (aClass688_3201 != null)
			aClass688_3201.method13924(f, (byte) 1);
		if (aClass328_3200 != null)
			aClass328_3200.method5773(f, is, class451, i, i_21_, 2136010448);
		Iterator iterator = aClass14_3230.iterator();
		while (iterator.hasNext()) {
			Class523_Sub27_Sub13 class523_sub27_sub13 = (Class523_Sub27_Sub13) iterator.next();
			class523_sub27_sub13.method18141(f, (byte) 9);
		}
	}

	public void method5366(Class523_Sub27_Sub13 class523_sub27_sub13, byte i) {
		aClass14_3230.method738(class523_sub27_sub13, (long) (class523_sub27_sub13.anInt11745 * 1056957445));
	}

	public Class437 method5367() {
		return aClass437_3203;
	}

	public void method5368(float f, float f_22_) throws Exception_Sub7 {
		if (!method5314((short) 4951))
			throw new Exception_Sub7();
		aFloat3224 = f;
		aFloat3225 = f_22_;
	}

	public void method5369(Class437 class437) throws Exception_Sub7 {
		if (!method5314((short) 25278) || !aClass303_3202.aBool3342)
			throw new Exception_Sub7();
		aClass437_3205.method6886(class437);
	}

	boolean method5370() {
		if (Class306.aClass306_3348 == aClass306_3206 && Class293.aClass293_3161 == aClass293_3195)
			return true;
		if (Class306.aClass306_3349 == aClass306_3206 && aClass293_3195 == Class293.aClass293_3160)
			return true;
		return false;
	}

	public void method5371(Class293 class293) {
		aClass293_3195 = class293;
	}

	public void method5372(Class293 class293) {
		aClass293_3195 = class293;
	}

	public Class688 method5373(Class294 class294, boolean bool) throws Exception_Sub7 {
		if (Class293.aClass293_3161 == aClass293_3195 && !bool)
			throw new Exception_Sub7();
		aClass294_3226 = class294;
		if (class294 == Class294.aClass294_3164)
			aClass688_3201 = new Class688_Sub2(this);
		else if (Class294.aClass294_3166 == class294)
			aClass688_3201 = new Class688_Sub3(this);
		else if (class294 == Class294.aClass294_3165)
			aClass688_3201 = new Class688_Sub1(this);
		else if (class294 == Class294.aClass294_3168)
			aClass688_3201 = new Class688_Sub4_Sub2(this);
		else if (Class294.aClass294_3167 == class294)
			aClass688_3201 = new Class688_Sub4_Sub3(this);
		else if (class294 == Class294.aClass294_3169)
			aClass688_3201 = new Class688_Sub5(this);
		else if (class294 == Class294.aClass294_3170)
			aClass688_3201 = new Class688_Sub4_Sub1(this);
		return aClass688_3201;
	}

	public Class328 method5374(Class291 class291, boolean bool) throws Exception_Sub7 {
		if (Class293.aClass293_3161 == aClass293_3195 && !bool)
			throw new Exception_Sub7();
		aClass291_3199 = class291;
		if (Class291.aClass291_3148 == class291)
			aClass328_3200 = new Class328_Sub2(this);
		else if (class291 == Class291.aClass291_3151)
			aClass328_3200 = new Class328_Sub1(this);
		else if (class291 == Class291.aClass291_3147)
			aClass328_3200 = new Class328_Sub3_Sub1(this);
		else if (Class291.aClass291_3150 == class291)
			aClass328_3200 = new Class328_Sub3_Sub2(this);
		else if (class291 == Class291.aClass291_3149)
			aClass328_3200 = new Class328_Sub3_Sub3(this);
		return aClass328_3200;
	}

	boolean method5375() {
		if (Class306.aClass306_3348 == aClass306_3206 && Class293.aClass293_3161 == aClass293_3195)
			return true;
		if (Class306.aClass306_3349 == aClass306_3206 && aClass293_3195 == Class293.aClass293_3160)
			return true;
		return false;
	}

	public Class440 method5376(short i) {
		Class440 class440 = Class440.method7063();
		class440.method7018(method5348(-746344497), method5347(-1929538059), method5349(-1674512510));
		return class440;
	}

	public void method5377(Class437 class437) throws Exception_Sub7 {
		if (!method5314((short) 29326) || !aClass303_3202.aBool3342)
			throw new Exception_Sub7();
		aClass437_3205.method6886(class437);
	}

	public Class437 method5378(int i) {
		if (null == aClass328_3200 || !aClass328_3200.method5761(-333928687))
			return null;
		return aClass328_3200.method5767(-1150669218);
	}

	public void method5379(float f) throws Exception_Sub7 {
		if (!method5314((short) 11584))
			throw new Exception_Sub7();
	}

	public void method5380(float f) throws Exception_Sub7 {
		if (!method5314((short) 6257))
			throw new Exception_Sub7();
	}

	public boolean method5381(int i) {
		return aBool3227;
	}

	public void method5382(float f) throws Exception_Sub7 {
		if (!method5314((short) 27551))
			throw new Exception_Sub7();
		aFloat3204 = f;
	}

	public void method5383(Class303 class303) throws Exception_Sub7 {
		if (!method5314((short) 17371))
			throw new Exception_Sub7();
		aClass303_3202 = class303;
	}

	public void method5384(Class303 class303) throws Exception_Sub7 {
		if (!method5314((short) 24109))
			throw new Exception_Sub7();
		aClass303_3202 = class303;
	}

	public void method5385(boolean bool, int i) {
		aClass295_3217 = Class295.aClass295_3174;
		aClass294_3226 = null;
		aClass688_3201 = null;
		aClass291_3199 = null;
		aClass328_3200 = null;
		if (Class306.aClass306_3348 == aClass306_3206 || !bool)
			aClass293_3195 = Class293.aClass293_3161;
		else
			aClass293_3195 = Class293.aClass293_3160;
		aClass303_3202 = Class303.aClass303_3339;
		aClass437_3205.method6972(100.0F, 100.0F, 100.0F);
		aClass437_3221.method6972(100.0F, 100.0F, 100.0F);
		aFloat3204 = 0.05F;
		aClass437_3203.method6972(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		aClass437_3209.method6972(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		aClass437_3208.method6972(1.0F, 1.0F, 1.0F);
		aClass437_3216.method6972(1.0F, 1.0F, 1.0F);
		aFloat3218 = 1.1F;
		aFloat3219 = 1.1F;
		aFloat3220 = 50.0F;
		aFloat3198 = 10000.0F;
		aFloat3225 = 1.5707964F;
		aFloat3224 = 1.5707964F;
		anInt3196 = 1456546921;
		aBool3210 = true;
		aBool3227 = true;
		anInt3228 = 0;
		aFloat3229 = 1.0F;
		aClass14_3230.method733(1513280568);
	}

	public void method5386(Class437 class437) throws Exception_Sub7 {
		if (!method5314((short) 12991) || !aClass303_3202.aBool3342)
			throw new Exception_Sub7();
		aClass437_3203.method6886(class437);
	}

	public void method5387(Class437 class437, float f) throws Exception_Sub7 {
		if (!method5314((short) 12081) || aClass303_3202.aBool3342)
			throw new Exception_Sub7();
		aClass437_3208.method6886(class437);
		aClass437_3216.method6886(class437);
		aFloat3218 = f;
		aFloat3219 = f;
	}

	public void method5388(Class437 class437) throws Exception_Sub7 {
		if (!method5314((short) 21621) || !aClass303_3202.aBool3342)
			throw new Exception_Sub7();
		aClass437_3203.method6886(class437);
	}

	public void method5389(int i, byte i_23_) {
		Class523_Sub27_Sub13 class523_sub27_sub13 = (Class523_Sub27_Sub13) aClass14_3230.method741((long) i);
		if (null != class523_sub27_sub13)
			class523_sub27_sub13.method8661(607052656);
	}

	public void method5390(Class437 class437) throws Exception_Sub7 {
		if (!method5314((short) 8623) || !aClass303_3202.aBool3342)
			throw new Exception_Sub7();
		aClass437_3209.method6886(class437);
	}

	public void method5391(float f, float f_24_, float f_25_) throws Exception_Sub7 {
		if (!method5314((short) 18822))
			throw new Exception_Sub7();
		aFloat3213 = f;
		aFloat3214 = f_24_;
		aFloat3197 = f_25_;
	}

	public float method5392() {
		return aFloat3204;
	}

	public void method5393(boolean bool, float f, Class437 class437, Class440 class440, Class437 class437_26_, Class437 class437_27_) {
		if (Class303.aClass303_3338 == aClass303_3202)
			Class581.method9663(f, class437, class437_26_, class437_27_, bool ? aClass437_3209 : aClass437_3203, bool ? aClass437_3221 : aClass437_3205, (float) (anInt3228 * 532474775), aFloat3229, aFloat3213, aFloat3214, -1028007366);
		else if (aClass303_3202 == Class303.aClass303_3339)
			Class311_Sub1.method15544(f, class437, class440, class437_26_, class437_27_, bool ? aClass437_3209 : aClass437_3203, bool ? aClass437_3221 : aClass437_3205, (float) (anInt3228 * 532474775), aFloat3229, aFloat3213, aFloat3214, -222324063);
		else if (aClass303_3202 == Class303.aClass303_3340)
			Class468.method7606(f, class437, class440, class437_26_, class437_27_, bool ? aClass437_3216 : aClass437_3208, bool ? aFloat3219 : aFloat3218, aFloat3213, aFloat3197, -683719031);
	}

	public void method5394(Class307 class307, Class435 class435, Class441 class441, int i, int i_28_) {
		if (method5335(-231586787)) {
			aClass688_3201.method13904(class307, class435, i, i_28_, aClass328_3200.method5764(1293241632), -2136733838);
			aClass328_3200.method5765(class307, i, i_28_, -1385577949);
			if (aClass295_3217 == Class295.aClass295_3174)
				class441.method7115(aFloat3220, aFloat3198, aFloat3224, aFloat3225);
			else
				class441.method7100(aFloat3220, aFloat3198, (float) (2068929341 * anInt3196));
			Iterator iterator = aClass14_3230.iterator();
			while (iterator.hasNext()) {
				Class523_Sub27_Sub13 class523_sub27_sub13 = (Class523_Sub27_Sub13) iterator.next();
				class523_sub27_sub13.method18142(class307, class435, class441, (short) 1093);
			}
		}
	}

	public void method5395(float f, float f_29_, float f_30_) throws Exception_Sub7 {
		if (!method5314((short) 7942))
			throw new Exception_Sub7();
		aFloat3213 = f;
		aFloat3214 = f_29_;
		aFloat3197 = f_30_;
	}

	public void method5396(boolean bool, float f, Class437 class437, Class440 class440, Class437 class437_31_, Class437 class437_32_) {
		if (Class303.aClass303_3338 == aClass303_3202)
			Class581.method9663(f, class437, class437_31_, class437_32_, bool ? aClass437_3209 : aClass437_3203, bool ? aClass437_3221 : aClass437_3205, (float) (anInt3228 * 532474775), aFloat3229, aFloat3213, aFloat3214, -1028007366);
		else if (aClass303_3202 == Class303.aClass303_3339)
			Class311_Sub1.method15544(f, class437, class440, class437_31_, class437_32_, bool ? aClass437_3209 : aClass437_3203, bool ? aClass437_3221 : aClass437_3205, (float) (anInt3228 * 532474775), aFloat3229, aFloat3213, aFloat3214, -774885691);
		else if (aClass303_3202 == Class303.aClass303_3340)
			Class468.method7606(f, class437, class440, class437_31_, class437_32_, bool ? aClass437_3216 : aClass437_3208, bool ? aFloat3219 : aFloat3218, aFloat3213, aFloat3197, -683719031);
	}

	public Class437 method5397(int i) {
		if (aClass688_3201 == null || !aClass688_3201.method13906(1778022866))
			return null;
		return aClass688_3201.method13909(-695103189);
	}

	public void method5398() throws Exception_Sub7 {
		if (!method5314((short) 24886))
			throw new Exception_Sub7();
		aFloat3213 = 5120.0F;
		aFloat3214 = 10.0F;
		aFloat3197 = 1.0F;
	}

	public void method5399(float f, int[][][] is, Class451 class451, int i, int i_33_, byte i_34_) {
		if (aClass688_3201 != null)
			aClass688_3201.method13924(f, (byte) 1);
		if (aClass328_3200 != null)
			aClass328_3200.method5773(f, is, class451, i, i_33_, 2127749048);
		Iterator iterator = aClass14_3230.iterator();
		while (iterator.hasNext()) {
			Class523_Sub27_Sub13 class523_sub27_sub13 = (Class523_Sub27_Sub13) iterator.next();
			class523_sub27_sub13.method18141(f, (byte) 9);
		}
	}

	public float method5400() {
		return aFloat3198;
	}

	public void method5401(Class437 class437) throws Exception_Sub7 {
		if (!method5314((short) 22582) || !aClass303_3202.aBool3342)
			throw new Exception_Sub7();
		aClass437_3205.method6886(class437);
	}

	public Interface30 method5402(byte i) {
		return anInterface30_3194;
	}

	public void method5403(float f, float f_35_, float f_36_) throws Exception_Sub7 {
		if (!method5314((short) 30265))
			throw new Exception_Sub7();
		aFloat3213 = f;
		aFloat3214 = f_35_;
		aFloat3197 = f_36_;
	}

	public void method5404(Class437 class437, float f) throws Exception_Sub7 {
		if (!method5314((short) 23635) || aClass303_3202.aBool3342)
			throw new Exception_Sub7();
		aClass437_3208.method6886(class437);
		aClass437_3216.method6886(class437);
		aFloat3218 = f;
		aFloat3219 = f;
	}

	public void method5405(float f, float f_37_, float f_38_) throws Exception_Sub7 {
		if (!method5314((short) 10127))
			throw new Exception_Sub7();
		aFloat3213 = f;
		aFloat3214 = f_37_;
		aFloat3197 = f_38_;
	}

	Class298(Class306 class306, Interface30 interface30) {
		aClass437_3203 = new Class437();
		aClass437_3209 = new Class437();
		aFloat3215 = 5120.0F;
		aFloat3211 = 10.0F;
		aFloat3212 = 1.0F;
		aFloat3213 = 5120.0F;
		aFloat3214 = 10.0F;
		aFloat3197 = 1.0F;
		aClass437_3208 = new Class437();
		aClass437_3216 = new Class437();
		anInt3228 = 0;
		aFloat3229 = 1.0F;
		aClass14_3230 = new Class14(8);
		aClass306_3206 = class306;
		anInterface30_3194 = interface30;
		method5385(true, -635494046);
	}

	public void method5406(boolean bool) {
		aClass295_3217 = Class295.aClass295_3174;
		aClass294_3226 = null;
		aClass688_3201 = null;
		aClass291_3199 = null;
		aClass328_3200 = null;
		if (Class306.aClass306_3348 == aClass306_3206 || !bool)
			aClass293_3195 = Class293.aClass293_3161;
		else
			aClass293_3195 = Class293.aClass293_3160;
		aClass303_3202 = Class303.aClass303_3339;
		aClass437_3205.method6972(100.0F, 100.0F, 100.0F);
		aClass437_3221.method6972(100.0F, 100.0F, 100.0F);
		aFloat3204 = 0.05F;
		aClass437_3203.method6972(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		aClass437_3209.method6972(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		aClass437_3208.method6972(1.0F, 1.0F, 1.0F);
		aClass437_3216.method6972(1.0F, 1.0F, 1.0F);
		aFloat3218 = 1.1F;
		aFloat3219 = 1.1F;
		aFloat3220 = 50.0F;
		aFloat3198 = 10000.0F;
		aFloat3225 = 1.5707964F;
		aFloat3224 = 1.5707964F;
		anInt3196 = 1456546921;
		aBool3210 = true;
		aBool3227 = true;
		anInt3228 = 0;
		aFloat3229 = 1.0F;
		aClass14_3230.method733(-1822777779);
	}

	public void method5407(Class437 class437, float f) throws Exception_Sub7 {
		if (!method5314((short) 1834) || aClass303_3202.aBool3342)
			throw new Exception_Sub7();
		aClass437_3216.method6886(class437);
		aFloat3219 = f;
	}

	public void method5408(float f, float f_39_) throws Exception_Sub7 {
		if (!method5314((short) 26704))
			throw new Exception_Sub7();
		if (f < 1.0F)
			f = 50.0F;
		if (f_39_ < 1.0F)
			f_39_ = 10000.0F;
		if (f >= f_39_)
			throw new Exception_Sub7();
		aFloat3220 = f;
		aFloat3198 = f_39_;
	}

	public float method5409(int i) {
		return aFloat3204;
	}

	public void method5410(float f, float f_40_) throws Exception_Sub7 {
		if (!method5314((short) 5773))
			throw new Exception_Sub7();
		aFloat3224 = f;
		aFloat3225 = f_40_;
	}

	public Class328 method5411() {
		return aClass328_3200;
	}

	boolean method5412() {
		if (Class306.aClass306_3348 == aClass306_3206 && Class293.aClass293_3161 == aClass293_3195)
			return true;
		if (Class306.aClass306_3349 == aClass306_3206 && aClass293_3195 == Class293.aClass293_3160)
			return true;
		return false;
	}

	public void method5413(boolean bool, boolean bool_41_) throws Exception_Sub7 {
		if (!method5314((short) 31055))
			throw new Exception_Sub7();
		aBool3210 = bool;
		aBool3227 = bool_41_;
	}

	public Class328 method5414() {
		return aClass328_3200;
	}

	public void method5415(Class437 class437) throws Exception_Sub7 {
		if (!method5314((short) 7007) || !aClass303_3202.aBool3342)
			throw new Exception_Sub7();
		aClass437_3205.method6886(class437);
	}

	public Class437 method5416() {
		return aClass437_3221;
	}

	public void method5417(Class523_Sub27_Sub13 class523_sub27_sub13) {
		aClass14_3230.method738(class523_sub27_sub13, (long) (class523_sub27_sub13.anInt11745 * 1056957445));
	}

	public void method5418(Class523_Sub27_Sub13 class523_sub27_sub13) {
		aClass14_3230.method738(class523_sub27_sub13, (long) (class523_sub27_sub13.anInt11745 * 1056957445));
	}

	public void method5419(int i) {
		Class523_Sub27_Sub13 class523_sub27_sub13 = (Class523_Sub27_Sub13) aClass14_3230.method741((long) i);
		if (null != class523_sub27_sub13)
			class523_sub27_sub13.method8661(607052656);
	}

	public void method5420(int i) {
		Class523_Sub27_Sub13 class523_sub27_sub13 = (Class523_Sub27_Sub13) aClass14_3230.method741((long) i);
		if (null != class523_sub27_sub13)
			class523_sub27_sub13.method8661(607052656);
	}

	public Class523_Sub27_Sub13 method5421(int i) {
		return (Class523_Sub27_Sub13) aClass14_3230.method741((long) i);
	}

	public void method5422(float f, float f_42_, float f_43_) throws Exception_Sub7 {
		if (!method5314((short) 7321))
			throw new Exception_Sub7();
		aFloat3213 = f;
		aFloat3214 = f_42_;
		aFloat3197 = f_43_;
	}

	public void method5423() {
		aClass14_3230.method733(-885272166);
	}

	public void method5424() {
		aClass14_3230.method733(886633447);
	}

	public void method5425() {
		aClass14_3230.method733(-777181383);
	}

	public void method5426() {
		aClass14_3230.method733(-530094877);
	}

	public boolean method5427() {
		if (null == aClass688_3201 || null == aClass328_3200)
			return false;
		if (!aClass688_3201.method13906(-1078291228))
			return false;
		if (!aClass328_3200.method5761(-729423902))
			return false;
		return true;
	}

	public void method5428(Class307 class307, Class435 class435, Class441 class441, int i, int i_44_) {
		if (method5335(-231586787)) {
			aClass688_3201.method13904(class307, class435, i, i_44_, aClass328_3200.method5764(1293241632), -1937175848);
			aClass328_3200.method5765(class307, i, i_44_, -1385577949);
			if (aClass295_3217 == Class295.aClass295_3174)
				class441.method7115(aFloat3220, aFloat3198, aFloat3224, aFloat3225);
			else
				class441.method7100(aFloat3220, aFloat3198, (float) (2068929341 * anInt3196));
			Iterator iterator = aClass14_3230.iterator();
			while (iterator.hasNext()) {
				Class523_Sub27_Sub13 class523_sub27_sub13 = (Class523_Sub27_Sub13) iterator.next();
				class523_sub27_sub13.method18142(class307, class435, class441, (short) 1093);
			}
		}
	}

	public void method5429(boolean bool, float f, Class437 class437, Class440 class440, Class437 class437_45_, Class437 class437_46_) {
		if (Class303.aClass303_3338 == aClass303_3202)
			Class581.method9663(f, class437, class437_45_, class437_46_, bool ? aClass437_3209 : aClass437_3203, bool ? aClass437_3221 : aClass437_3205, (float) (anInt3228 * 532474775), aFloat3229, aFloat3213, aFloat3214, -1028007366);
		else if (aClass303_3202 == Class303.aClass303_3339)
			Class311_Sub1.method15544(f, class437, class440, class437_45_, class437_46_, bool ? aClass437_3209 : aClass437_3203, bool ? aClass437_3221 : aClass437_3205, (float) (anInt3228 * 532474775), aFloat3229, aFloat3213, aFloat3214, -1448871883);
		else if (aClass303_3202 == Class303.aClass303_3340)
			Class468.method7606(f, class437, class440, class437_45_, class437_46_, bool ? aClass437_3216 : aClass437_3208, bool ? aFloat3219 : aFloat3218, aFloat3213, aFloat3197, -683719031);
	}

	public Class328 method5430(int i) {
		return aClass328_3200;
	}

	public void method5431(int i, float f) throws Exception_Sub7 {
		if (!method5314((short) 5258) || !aClass303_3202.aBool3342)
			throw new Exception_Sub7();
		anInt3228 = i * -436452313;
		aFloat3229 = f;
	}

	public Class293 method5432() {
		return aClass293_3195;
	}

	public Class293 method5433() {
		return aClass293_3195;
	}

	public void method5434(Class437 class437) throws Exception_Sub7 {
		if (!method5314((short) 5183) || !aClass303_3202.aBool3342)
			throw new Exception_Sub7();
		aClass437_3203.method6886(class437);
	}

	public void method5435(float f, float f_47_, float f_48_) throws Exception_Sub7 {
		if (!method5314((short) 25115))
			throw new Exception_Sub7();
		aFloat3213 = f;
		aFloat3214 = f_47_;
		aFloat3197 = f_48_;
	}

	public Class437 method5436() {
		return aClass437_3203;
	}

	public void method5437(float f, int[][][] is, Class451 class451, int i, int i_49_) {
		if (aClass688_3201 != null)
			aClass688_3201.method13924(f, (byte) 1);
		if (aClass328_3200 != null)
			aClass328_3200.method5773(f, is, class451, i, i_49_, 2141525834);
		Iterator iterator = aClass14_3230.iterator();
		while (iterator.hasNext()) {
			Class523_Sub27_Sub13 class523_sub27_sub13 = (Class523_Sub27_Sub13) iterator.next();
			class523_sub27_sub13.method18141(f, (byte) 9);
		}
	}

	public Interface30 method5438() {
		return anInterface30_3194;
	}

	public Class437 method5439() {
		if (aClass688_3201 == null || !aClass688_3201.method13906(2129613307))
			return null;
		return aClass688_3201.method13909(1499659759);
	}

	public Class291 method5440() {
		return aClass291_3199;
	}

	public Class291 method5441() {
		return aClass291_3199;
	}

	public Class291 method5442() {
		return aClass291_3199;
	}

	public double[] method5443() {
		if (aClass328_3200 == null || !aClass328_3200.method5761(-960756678))
			return null;
		return aClass328_3200.method5762(668763938);
	}

	public Class437 method5444() {
		if (aClass688_3201 == null || !aClass688_3201.method13906(-1660357807))
			return null;
		return aClass688_3201.method13909(310213437);
	}

	public void method5445(Class437 class437, float f) throws Exception_Sub7 {
		if (!method5314((short) 12038) || aClass303_3202.aBool3342)
			throw new Exception_Sub7();
		aClass437_3208.method6886(class437);
		aClass437_3216.method6886(class437);
		aFloat3218 = f;
		aFloat3219 = f;
	}

	boolean method5446() {
		if (Class306.aClass306_3348 == aClass306_3206 && Class293.aClass293_3161 == aClass293_3195)
			return true;
		if (Class306.aClass306_3349 == aClass306_3206 && aClass293_3195 == Class293.aClass293_3160)
			return true;
		return false;
	}

	public Class523_Sub29 method5447() {
		if (null == aClass328_3200 || !aClass328_3200.method5761(-882536353))
			return null;
		return aClass328_3200.method5763((byte) -76);
	}

	public float method5448() {
		Class437 class437 = method5378(854115654);
		Class437 class437_50_ = method5397(1403290878);
		float f = 0.0F;
		if (null != class437 && class437_50_ != null) {
			Class437 class437_51_ = Class437.method6932(class437_50_, class437);
			float f_52_ = (float) Math.sqrt((double) ((class437_51_.aFloat4905 * class437_51_.aFloat4905) + (class437_51_.aFloat4903 * class437_51_.aFloat4903)));
			f = (float) Math.atan2((double) -class437_51_.aFloat4904, (double) f_52_);
			class437.method6949();
			class437_50_.method6949();
		}
		return f;
	}

	public float method5449() {
		Class437 class437 = method5378(697489516);
		Class437 class437_53_ = method5397(1466960887);
		float f = 0.0F;
		if (null != class437 && class437_53_ != null) {
			Class437 class437_54_ = Class437.method6932(class437_53_, class437);
			float f_55_ = (float) Math.sqrt((double) ((class437_54_.aFloat4905 * class437_54_.aFloat4905) + (class437_54_.aFloat4903 * class437_54_.aFloat4903)));
			f = (float) Math.atan2((double) -class437_54_.aFloat4904, (double) f_55_);
			class437.method6949();
			class437_53_.method6949();
		}
		return f;
	}

	public float method5450() {
		Class437 class437 = method5378(1197564215);
		Class437 class437_56_ = method5397(49948976);
		float f = 0.0F;
		if (null != class437 && class437_56_ != null) {
			Class437 class437_57_ = Class437.method6932(class437_56_, class437);
			float f_58_ = (float) Math.sqrt((double) ((class437_57_.aFloat4905 * class437_57_.aFloat4905) + (class437_57_.aFloat4903 * class437_57_.aFloat4903)));
			f = (float) Math.atan2((double) -class437_57_.aFloat4904, (double) f_58_);
			class437.method6949();
			class437_56_.method6949();
		}
		return f;
	}

	public float method5451() {
		Class437 class437 = method5378(1136788495);
		Class437 class437_59_ = method5397(535804641);
		float f = 0.0F;
		if (null != class437 && null != class437_59_) {
			Class437 class437_60_ = Class437.method6932(class437, class437_59_);
			class437_60_.aFloat4904 = 0.0F;
			f = (float) Math.atan2((double) class437_60_.aFloat4903, (double) class437_60_.aFloat4905);
			class437.method6949();
			class437_59_.method6949();
		}
		return (float) (3.141592653589793 - (double) f);
	}

	public float method5452() {
		Class437 class437 = method5378(946073190);
		Class437 class437_61_ = method5397(1261853006);
		float f = 0.0F;
		if (null != class437 && null != class437_61_) {
			Class437 class437_62_ = Class437.method6932(class437, class437_61_);
			class437_62_.aFloat4904 = 0.0F;
			f = (float) Math.atan2((double) class437_62_.aFloat4903, (double) class437_62_.aFloat4905);
			class437.method6949();
			class437_61_.method6949();
		}
		return (float) (3.141592653589793 - (double) f);
	}

	float method5453() {
		return 0.0F;
	}

	float method5454() {
		return 0.0F;
	}

	public void method5455(float f, float f_63_, int i) throws Exception_Sub7 {
		if (!method5314((short) 8819))
			throw new Exception_Sub7();
		aFloat3224 = f;
		aFloat3225 = f_63_;
	}

	public Class440 method5456() {
		Class440 class440 = Class440.method7063();
		class440.method7018(method5348(-1260338363), method5347(843820588), method5349(-1952987720));
		return class440;
	}

	public Class440 method5457() {
		Class440 class440 = Class440.method7063();
		class440.method7018(method5348(-1175309559), method5347(-1604941532), method5349(-1959171867));
		return class440;
	}

	public void method5458(Class437 class437, float f, byte i) throws Exception_Sub7 {
		if (!method5314((short) 9779) || aClass303_3202.aBool3342)
			throw new Exception_Sub7();
		aClass437_3208.method6886(class437);
		aFloat3218 = f;
	}

	public void method5459(boolean bool, float f, Class437 class437, Class440 class440, Class437 class437_64_, Class437 class437_65_) {
		if (Class303.aClass303_3338 == aClass303_3202)
			Class581.method9663(f, class437, class437_64_, class437_65_, bool ? aClass437_3209 : aClass437_3203, bool ? aClass437_3221 : aClass437_3205, (float) (anInt3228 * 532474775), aFloat3229, aFloat3213, aFloat3214, -1028007366);
		else if (aClass303_3202 == Class303.aClass303_3339)
			Class311_Sub1.method15544(f, class437, class440, class437_64_, class437_65_, bool ? aClass437_3209 : aClass437_3203, bool ? aClass437_3221 : aClass437_3205, (float) (anInt3228 * 532474775), aFloat3229, aFloat3213, aFloat3214, -874974340);
		else if (aClass303_3202 == Class303.aClass303_3340)
			Class468.method7606(f, class437, class440, class437_64_, class437_65_, bool ? aClass437_3216 : aClass437_3208, bool ? aFloat3219 : aFloat3218, aFloat3213, aFloat3197, -683719031);
	}

	public void method5460(float f) throws Exception_Sub7 {
		if (!method5314((short) 1555))
			throw new Exception_Sub7();
	}

	public Class437 method5461() {
		return aClass437_3203;
	}

	public Class437 method5462() {
		return aClass437_3209;
	}

	public Class437 method5463() {
		return aClass437_3209;
	}

	public void method5464(Class437 class437) throws Exception_Sub7 {
		if (!method5314((short) 12609) || !aClass303_3202.aBool3342)
			throw new Exception_Sub7();
		aClass437_3209.method6886(class437);
	}

	public Class688 method5465(byte i) {
		return aClass688_3201;
	}

	public Class437 method5466() {
		return aClass437_3205;
	}

	public Class437 method5467() {
		return aClass437_3205;
	}

	public Class437 method5468() {
		return aClass437_3221;
	}

	public Class437 method5469() {
		return aClass437_3221;
	}

	public Class523_Sub27_Sub13 method5470(int i) {
		return (Class523_Sub27_Sub13) aClass14_3230.method741((long) i);
	}

	public float method5471() {
		return aFloat3220;
	}

	public float method5472() {
		return aFloat3220;
	}

	public void method5473(Class307 class307, Class435 class435, Class441 class441, int i, int i_66_) {
		if (method5335(-231586787)) {
			aClass688_3201.method13904(class307, class435, i, i_66_, aClass328_3200.method5764(1293241632), -1558190739);
			aClass328_3200.method5765(class307, i, i_66_, -1385577949);
			if (aClass295_3217 == Class295.aClass295_3174)
				class441.method7115(aFloat3220, aFloat3198, aFloat3224, aFloat3225);
			else
				class441.method7100(aFloat3220, aFloat3198, (float) (2068929341 * anInt3196));
			Iterator iterator = aClass14_3230.iterator();
			while (iterator.hasNext()) {
				Class523_Sub27_Sub13 class523_sub27_sub13 = (Class523_Sub27_Sub13) iterator.next();
				class523_sub27_sub13.method18142(class307, class435, class441, (short) 1093);
			}
		}
	}

	public float method5474() {
		return aFloat3198;
	}

	public boolean method5475() {
		return aBool3210;
	}

	public boolean method5476() {
		return aBool3210;
	}

	public boolean method5477() {
		return aBool3227;
	}

	static void method5478(int i, int i_67_, int i_68_, int i_69_, int i_70_) {
		float f = ((float) Class534_Sub1.anInt7138 / (float) Class534_Sub1.anInt7160);
		int i_71_ = i_68_;
		int i_72_ = i_69_;
		if (f < 1.0F)
			i_72_ = (int) ((float) i_68_ * f);
		else
			i_71_ = (int) ((float) i_69_ / f);
		i -= (i_68_ - i_71_) / 2;
		i_67_ -= (i_69_ - i_72_) / 2;
		Class575.anInt7691 = Class534_Sub1.anInt7160 * i / i_71_ * 367905367;
		Class597.anInt7835 = -1099820943 * (Class534_Sub1.anInt7138 - Class534_Sub1.anInt7138 * i_67_ / i_72_);
		Class534_Sub1.anInt10780 = -1195183291;
		Class534_Sub1.anInt10779 = -465264525;
		Archive.method1233((byte) -1);
	}
}
