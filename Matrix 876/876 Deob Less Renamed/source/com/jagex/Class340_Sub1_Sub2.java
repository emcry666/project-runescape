/* Class340_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class340_Sub1_Sub2 extends Class340_Sub1 {
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_11531;
	Class353 aClass353_11532;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_11533;
	public Class437 aClass437_11534;
	public Class429 aClass429_11535;
	public Class441 aClass441_11536 = new Class441();
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_11537;
	public Class441 aClass441_11538 = new Class441();
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_11539;
	public int anInt11540;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_11541;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_11542;
	Class429 aClass429_11543;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_11544;
	Class429 aClass429_11545;
	boolean aBool11546;
	Class429 aClass429_11547;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_11548;
	public Class429 aClass429_11549;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_11550;
	public Class437 aClass437_11551;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_11552;
	Class270 aClass270_11553;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_11554;
	public Class437 aClass437_11555;
	public int anInt11556;
	public int anInt11557;
	public int anInt11558;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_11559;
	float aFloat11560;
	boolean aBool11561;
	public int anInt11562;

	boolean method15661() throws Exception_Sub3 {
		if (!aClass353_11532.method6195())
			return false;
		aClass523_Sub4_Sub1_11533 = aClass265_10121.method4783("NormalSampler", 1234946779);
		aClass523_Sub4_Sub1_11531 = aClass265_10121.method4783("EnvMapSampler", -352411777);
		aClass523_Sub4_Sub1_11537 = aClass265_10121.method4783("WVPMatrix", -911512272);
		aClass523_Sub4_Sub1_11550 = aClass265_10121.method4783("TexCoordMatrix", 107926918);
		aClass523_Sub4_Sub1_11539 = aClass265_10121.method4783("EyePosAndTime", 600444505);
		aClass523_Sub4_Sub1_11542 = aClass265_10121.method4783("SunDirectionAndExponent", 738121199);
		aClass523_Sub4_Sub1_11544 = aClass265_10121.method4783("SunColourAndWaveExponent", 827993604);
		aClass523_Sub4_Sub1_11552 = (aClass265_10121.method4783("WaveIntensityAndBreakWaterDepthAndOffset", -690806027));
		aClass523_Sub4_Sub1_11548 = aClass265_10121.method4783("HeightFogPlane", 1312252022);
		aClass523_Sub4_Sub1_11559 = aClass265_10121.method4783("HeightFogColour", 767888335);
		aClass523_Sub4_Sub1_11541 = aClass265_10121.method4783("DistanceFogPlane", -495972080);
		aClass523_Sub4_Sub1_11554 = aClass265_10121.method4783("DistanceFogColour", -36698067);
		aClass270_11553 = aClass265_10121.method4755((aBool11561 ? "EnvMappedSea" : "EnvMappedWater"), 760427037);
		aClass265_10121.method4852(aClass270_11553);
		return true;
	}

	public boolean method17931(int i) {
		return aBool11546;
	}

	void method15658(Class441 class441) {
		Class441 class441_0_ = new Class441();
		class441_0_.method7093(aFloat11560, aFloat11560, 1.0F, 1.0F);
		class441_0_.method7088(class441, class441_0_);
		super.method15656(class441_0_);
	}

	void method15656(Class441 class441) {
		Class441 class441_1_ = new Class441();
		class441_1_.method7093(aFloat11560, aFloat11560, 1.0F, 1.0F);
		class441_1_.method7088(class441, class441_1_);
		super.method15656(class441_1_);
	}

	void method15650(boolean bool) {
		float f = 1.0F + ((1.0F - Math.abs(aClass178_Sub2_3590.aFloatArray9608[1])) * 2.0F);
		float f_2_ = aClass178_Sub2_3590.aFloat9617;
		aClass178_Sub2_3590.aFloat9617 *= f;
		super.method15650(bool);
		aClass178_Sub2_3590.aFloat9617 = f_2_;
	}

	void method15666(Class441 class441) {
		Class441 class441_3_ = new Class441();
		class441_3_.method7093(aFloat11560, aFloat11560, 1.0F, 1.0F);
		class441_3_.method7088(class441, class441_3_);
		super.method15656(class441_3_);
	}

	public void method17932(int i) {
		method17933(-1849971561);
		aClass265_10121.method4852(aClass270_11553);
		aClass265_10121.method4750();
		aClass265_10121.method4836(aClass523_Sub4_Sub1_11533, 0, aClass353_11532.anInterface34_3670, -1153730713);
		aClass265_10121.method4836(aClass523_Sub4_Sub1_11531, 1, aClass178_Sub2_3590.method14954(), -1892880830);
		aClass265_10121.method4773(aClass523_Sub4_Sub1_11537, aClass441_11536, -750616088);
		aClass265_10121.method4772(aClass523_Sub4_Sub1_11550, aClass441_11538, 590505010);
		int i_4_ = 1 << (anInt11562 * 347193731 & 0x3);
		aClass265_10121.method4767(aClass523_Sub4_Sub1_11539, aClass437_11534.aFloat4903, aClass437_11534.aFloat4904, aClass437_11534.aFloat4905, (float) (i_4_ * aClass178_Sub2_3590.anInt9556 % 40000) / 40000.0F, -997438449);
		aClass265_10121.method4769(aClass523_Sub4_Sub1_11542, aClass429_11543, -1156527410);
		aClass265_10121.method4769(aClass523_Sub4_Sub1_11544, aClass429_11545, -1156527410);
		aClass265_10121.method4769(aClass523_Sub4_Sub1_11552, aClass429_11547, -1156527410);
		aClass265_10121.method4769(aClass523_Sub4_Sub1_11548, aClass429_11549, -1156527410);
		aClass265_10121.method4768(aClass523_Sub4_Sub1_11559, aClass437_11551, (short) -8105);
		aClass265_10121.method4769(aClass523_Sub4_Sub1_11541, aClass429_11535, -1156527410);
		aClass265_10121.method4768(aClass523_Sub4_Sub1_11554, aClass437_11555, (short) -16975);
		aClass178_Sub2_3590.method15034(Class376.aClass376_3917, -196441725 * anInt11556, anInt11557 * 1441774461, 1773955489 * anInt11558, 967123037 * anInt11540);
	}

	boolean method15660() throws Exception_Sub3 {
		if (!aClass353_11532.method6195())
			return false;
		aClass523_Sub4_Sub1_11533 = aClass265_10121.method4783("NormalSampler", -552289199);
		aClass523_Sub4_Sub1_11531 = aClass265_10121.method4783("EnvMapSampler", 424993749);
		aClass523_Sub4_Sub1_11537 = aClass265_10121.method4783("WVPMatrix", -1319168591);
		aClass523_Sub4_Sub1_11550 = aClass265_10121.method4783("TexCoordMatrix", -136977109);
		aClass523_Sub4_Sub1_11539 = aClass265_10121.method4783("EyePosAndTime", 989985532);
		aClass523_Sub4_Sub1_11542 = aClass265_10121.method4783("SunDirectionAndExponent", 815109134);
		aClass523_Sub4_Sub1_11544 = aClass265_10121.method4783("SunColourAndWaveExponent", -795858565);
		aClass523_Sub4_Sub1_11552 = (aClass265_10121.method4783("WaveIntensityAndBreakWaterDepthAndOffset", -651899474));
		aClass523_Sub4_Sub1_11548 = aClass265_10121.method4783("HeightFogPlane", -1405108526);
		aClass523_Sub4_Sub1_11559 = aClass265_10121.method4783("HeightFogColour", -888544271);
		aClass523_Sub4_Sub1_11541 = aClass265_10121.method4783("DistanceFogPlane", 979056161);
		aClass523_Sub4_Sub1_11554 = aClass265_10121.method4783("DistanceFogColour", -852630944);
		aClass270_11553 = aClass265_10121.method4755((aBool11561 ? "EnvMappedSea" : "EnvMappedWater"), 760427037);
		aClass265_10121.method4852(aClass270_11553);
		return true;
	}

	void method17933(int i) {
		aFloat11560 = 2.4414062E-4F;
		int i_5_ = 256;
		float f = 0.3F;
		float f_6_ = 0.4F;
		float f_7_ = 0.1F;
		int i_8_ = 5;
		aClass441_11538.method7093(aFloat11560, aFloat11560, aFloat11560, aFloat11560);
		aClass429_11543.method6773(-aClass178_Sub2_3590.aFloatArray9608[0], -aClass178_Sub2_3590.aFloatArray9608[1], -aClass178_Sub2_3590.aFloatArray9608[2], 32.0F);
		aClass429_11545.method6773(aClass178_Sub2_3590.aFloat9689, aClass178_Sub2_3590.aFloat9614, aClass178_Sub2_3590.aFloat9704, (float) i_8_);
		aClass429_11547.method6773(f_7_, f_6_, (float) i_5_, f);
	}

	public Class340_Sub1_Sub2(Class178_Sub2 class178_sub2, Class353 class353, boolean bool) throws Exception_Sub3 {
		super(class178_sub2);
		aClass437_11534 = new Class437();
		aClass429_11543 = new Class429();
		aClass429_11545 = new Class429();
		aClass429_11547 = new Class429();
		aClass429_11549 = new Class429();
		aClass437_11551 = new Class437();
		aClass429_11535 = new Class429();
		aClass437_11555 = new Class437();
		aFloat11560 = 0.0F;
		new Class441();
		aClass353_11532 = class353;
		aBool11561 = bool;
		if (class178_sub2.method14919() && class178_sub2.method15119())
			aBool11546 = method15645("EnvMappedWater");
		else
			aBool11546 = false;
	}

	boolean method15646() throws Exception_Sub3 {
		if (!aClass353_11532.method6195())
			return false;
		aClass523_Sub4_Sub1_11533 = aClass265_10121.method4783("NormalSampler", -1027998737);
		aClass523_Sub4_Sub1_11531 = aClass265_10121.method4783("EnvMapSampler", -350532947);
		aClass523_Sub4_Sub1_11537 = aClass265_10121.method4783("WVPMatrix", -1283771224);
		aClass523_Sub4_Sub1_11550 = aClass265_10121.method4783("TexCoordMatrix", 783708779);
		aClass523_Sub4_Sub1_11539 = aClass265_10121.method4783("EyePosAndTime", -143351773);
		aClass523_Sub4_Sub1_11542 = aClass265_10121.method4783("SunDirectionAndExponent", 1182958768);
		aClass523_Sub4_Sub1_11544 = aClass265_10121.method4783("SunColourAndWaveExponent", -1300215615);
		aClass523_Sub4_Sub1_11552 = (aClass265_10121.method4783("WaveIntensityAndBreakWaterDepthAndOffset", -1564790478));
		aClass523_Sub4_Sub1_11548 = aClass265_10121.method4783("HeightFogPlane", -867223328);
		aClass523_Sub4_Sub1_11559 = aClass265_10121.method4783("HeightFogColour", 1358396106);
		aClass523_Sub4_Sub1_11541 = aClass265_10121.method4783("DistanceFogPlane", -977880608);
		aClass523_Sub4_Sub1_11554 = aClass265_10121.method4783("DistanceFogColour", 1276431780);
		aClass270_11553 = aClass265_10121.method4755((aBool11561 ? "EnvMappedSea" : "EnvMappedWater"), 760427037);
		aClass265_10121.method4852(aClass270_11553);
		return true;
	}

	void method15668(boolean bool) {
		float f = 1.0F + ((1.0F - Math.abs(aClass178_Sub2_3590.aFloatArray9608[1])) * 2.0F);
		float f_9_ = aClass178_Sub2_3590.aFloat9617;
		aClass178_Sub2_3590.aFloat9617 *= f;
		super.method15650(bool);
		aClass178_Sub2_3590.aFloat9617 = f_9_;
	}

	public boolean method17934() {
		return aBool11546;
	}

	public boolean method17935() {
		return aBool11546;
	}

	public boolean method17936() {
		return aBool11546;
	}

	public boolean method17937() {
		return aBool11546;
	}

	void method17938() {
		aFloat11560 = 2.4414062E-4F;
		int i = 256;
		float f = 0.3F;
		float f_10_ = 0.4F;
		float f_11_ = 0.1F;
		int i_12_ = 5;
		aClass441_11538.method7093(aFloat11560, aFloat11560, aFloat11560, aFloat11560);
		aClass429_11543.method6773(-aClass178_Sub2_3590.aFloatArray9608[0], -aClass178_Sub2_3590.aFloatArray9608[1], -aClass178_Sub2_3590.aFloatArray9608[2], 32.0F);
		aClass429_11545.method6773(aClass178_Sub2_3590.aFloat9689, aClass178_Sub2_3590.aFloat9614, aClass178_Sub2_3590.aFloat9704, (float) i_12_);
		aClass429_11547.method6773(f_11_, f_10_, (float) i, f);
	}

	void method17939() {
		aFloat11560 = 2.4414062E-4F;
		int i = 256;
		float f = 0.3F;
		float f_13_ = 0.4F;
		float f_14_ = 0.1F;
		int i_15_ = 5;
		aClass441_11538.method7093(aFloat11560, aFloat11560, aFloat11560, aFloat11560);
		aClass429_11543.method6773(-aClass178_Sub2_3590.aFloatArray9608[0], -aClass178_Sub2_3590.aFloatArray9608[1], -aClass178_Sub2_3590.aFloatArray9608[2], 32.0F);
		aClass429_11545.method6773(aClass178_Sub2_3590.aFloat9689, aClass178_Sub2_3590.aFloat9614, aClass178_Sub2_3590.aFloat9704, (float) i_15_);
		aClass429_11547.method6773(f_14_, f_13_, (float) i, f);
	}
}
