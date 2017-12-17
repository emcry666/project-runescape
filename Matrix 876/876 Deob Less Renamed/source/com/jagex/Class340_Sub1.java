/* Class340_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class340_Sub1 extends Class340 {
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10113;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10114;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10115;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10116;
	static final int anInt10117 = 2;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10118;
	static final int anInt10119 = 1;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10120;
	protected Class265 aClass265_10121;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10122;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10123;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10124;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10125;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10126;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10127;
	static final int anInt10128 = 64;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10129;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10130;
	Class441[] aClass441Array10131;
	static final int anInt10132 = 4;
	static final int anInt10133 = 8;
	int anInt10134;
	static final int anInt10135 = 32;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10136;
	static final int anInt10137 = 128;
	Class523_Sub4_Sub1 aClass523_Sub4_Sub1_10138;
	int[] anIntArray10139;
	static Class441 aClass441_10140 = new Class441();
	static final int anInt10141 = 16;
	float[] aFloatArray10142 = new float[3];

	void method5966() {
		if (aClass265_10121 != null)
			aClass265_10121.method4809();
	}

	boolean method15645(String string) throws Exception_Sub3 {
		aClass265_10121 = aClass178_Sub2_3590.method15073(string);
		if (aClass265_10121 == null)
			throw new Exception_Sub3("");
		aClass523_Sub4_Sub1_10114 = aClass265_10121.method4878("textureMatrix", 660898716);
		aClass523_Sub4_Sub1_10115 = aClass265_10121.method4878("modelMatrix", 583367828);
		aClass523_Sub4_Sub1_10136 = aClass265_10121.method4878("viewMatrix", 1562980634);
		aClass523_Sub4_Sub1_10113 = aClass265_10121.method4878("projectionMatrix", 1465630322);
		aClass523_Sub4_Sub1_10116 = aClass265_10121.method4878("modelViewMatrix", 474251846);
		aClass523_Sub4_Sub1_10120 = aClass265_10121.method4878("modelViewProjectionMatrix", 1192331507);
		aClass523_Sub4_Sub1_10123 = aClass265_10121.method4878("viewProjectionMatrix", 1037463828);
		aClass523_Sub4_Sub1_10125 = aClass265_10121.method4878("ambientColour", 981454848);
		aClass523_Sub4_Sub1_10138 = aClass265_10121.method4878("sunDirection", 926117722);
		aClass523_Sub4_Sub1_10126 = aClass265_10121.method4878("sunColour", 1839084072);
		aClass523_Sub4_Sub1_10127 = aClass265_10121.method4878("antiSunColour", 354683896);
		aClass523_Sub4_Sub1_10129 = aClass265_10121.method4878("sunExponent", 163110289);
		aClass523_Sub4_Sub1_10122 = aClass265_10121.method4878("eyePosition", 1541912323);
		aClass523_Sub4_Sub1_10130 = aClass265_10121.method4878("eyePositionOS", 1926812747);
		aClass523_Sub4_Sub1_10124 = aClass265_10121.method4878("sunDirectionOS", 994845487);
		if (!method15646()) {
			aClass265_10121 = null;
			aClass523_Sub4_Sub1_10114 = null;
			aClass523_Sub4_Sub1_10115 = null;
			aClass523_Sub4_Sub1_10136 = null;
			aClass523_Sub4_Sub1_10113 = null;
			aClass523_Sub4_Sub1_10116 = null;
			aClass523_Sub4_Sub1_10120 = null;
			aClass523_Sub4_Sub1_10123 = null;
			aClass523_Sub4_Sub1_10125 = null;
			aClass523_Sub4_Sub1_10138 = null;
			aClass523_Sub4_Sub1_10126 = null;
			aClass523_Sub4_Sub1_10127 = null;
			aClass523_Sub4_Sub1_10129 = null;
			aClass523_Sub4_Sub1_10122 = null;
			aClass523_Sub4_Sub1_10130 = null;
			aClass523_Sub4_Sub1_10124 = null;
			return false;
		}
		if (aClass265_10121.method4760((short) 897) == null) {
			Class270 class270 = aClass265_10121.method4759(-1043037508);
			if (class270 == null)
				throw new Exception_Sub3(new StringBuilder().append(aClass265_10121.method4753(-2098343196)).append("").toString());
			aClass265_10121.method4852(class270);
		}
		anInt10134 = aClass265_10121.method4756((byte) -127);
		anIntArray10139 = new int[anInt10134];
		return true;
	}

	abstract boolean method15646() throws Exception_Sub3;

	void method5955() {
		aClass265_10121.method4750();
		anIntArray10139[aClass265_10121.method4796(1276226299)] = -1;
		method15654(0);
		method15647();
	}

	void method15647() {
		method15650(aClass178_Sub2_3590.aBool9674);
		method15656(aClass178_Sub2_3590.method15009());
		method15648();
		method5979();
	}

	void method5970() {
		if (aClass265_10121 != null)
			aClass265_10121.method4809();
	}

	void method5980() {
		/* empty */
	}

	void method15648() {
		if (aClass265_10121 != null && aClass265_10121.method4865()) {
			int i = aClass265_10121.method4796(-368137207);
			int i_0_ = anIntArray10139[i];
			if ((i_0_ & 0x1) != 0 && aClass523_Sub4_Sub1_10115 != null)
				aClass265_10121.method4773(aClass523_Sub4_Sub1_10115, aClass178_Sub2_3590.method14966(), -381839687);
			if ((i_0_ & 0x2) != 0) {
				if (aClass523_Sub4_Sub1_10136 != null)
					aClass265_10121.method4773(aClass523_Sub4_Sub1_10136, aClass178_Sub2_3590.method15090(), -339022821);
				if (aClass523_Sub4_Sub1_10122 != null) {
					aFloatArray10142[0] = 0.0F;
					aFloatArray10142[1] = 0.0F;
					aFloatArray10142[2] = 0.0F;
					aClass178_Sub2_3590.method3122().method6823(aFloatArray10142[0], aFloatArray10142[1], aFloatArray10142[2], aFloatArray10142);
					aClass265_10121.method4766(aClass523_Sub4_Sub1_10122, aFloatArray10142[0], aFloatArray10142[1], aFloatArray10142[2], -1208852106);
				}
			}
			if ((i_0_ & 0x10) != 0 && aClass523_Sub4_Sub1_10116 != null)
				aClass265_10121.method4773(aClass523_Sub4_Sub1_10116, aClass178_Sub2_3590.method14952(), -847479920);
			if ((i_0_ & 0x8) != 0 && aClass523_Sub4_Sub1_10118 != null)
				aClass265_10121.method4773(aClass523_Sub4_Sub1_10118, aClass178_Sub2_3590.method14963(), -55655643);
			if ((i_0_ & 0x4) != 0 && aClass523_Sub4_Sub1_10113 != null)
				aClass265_10121.method4773(aClass523_Sub4_Sub1_10113, aClass178_Sub2_3590.method14969(), -541728380);
			if ((i_0_ & 0x20) != 0 && aClass523_Sub4_Sub1_10120 != null) {
				aClass441_10140.method7088(aClass178_Sub2_3590.method14952(), aClass178_Sub2_3590.method14969());
				aClass265_10121.method4773(aClass523_Sub4_Sub1_10120, aClass441_10140, -621182539);
			}
			if ((i_0_ & 0x40) != 0 && aClass523_Sub4_Sub1_10123 != null) {
				aClass441_10140.method7088(aClass178_Sub2_3590.method15090(), aClass178_Sub2_3590.method14969());
				aClass265_10121.method4773(aClass523_Sub4_Sub1_10123, aClass441_10140, -590480304);
			}
			if (aClass178_Sub2_3590.method15051() == 0 && (anIntArray10139[i] & 0x80) != 0 && aClass523_Sub4_Sub1_10114 != null) {
				aClass265_10121.method4772(aClass523_Sub4_Sub1_10114, aClass178_Sub2_3590.method15009(), 762173549);
				anIntArray10139[i] &= ~0x80;
			}
			anIntArray10139[i] = 0;
		}
	}

	void method5954() {
		aClass265_10121.method4750();
		anIntArray10139[aClass265_10121.method4796(-1563161413)] = -1;
		method15654(0);
		method15647();
	}

	void method15649(int i, Class435 class435) {
		if (aClass523_Sub4_Sub1_10124 != null) {
			float[] fs = { aClass178_Sub2_3590.aFloatArray9608[0], aClass178_Sub2_3590.aFloatArray9608[1], aClass178_Sub2_3590.aFloatArray9608[2] };
			class435.method6828(fs);
			aClass265_10121.method4766(aClass523_Sub4_Sub1_10124, fs[0], fs[1], fs[2], 1435466897);
		}
	}

	void method15650(boolean bool) {
		if (aClass265_10121 != null && aClass265_10121.method4865()) {
			if (aClass523_Sub4_Sub1_10125 != null)
				aClass265_10121.method4766(aClass523_Sub4_Sub1_10125, (aClass178_Sub2_3590.aFloat9689 * aClass178_Sub2_3590.aFloat9643), (aClass178_Sub2_3590.aFloat9614 * aClass178_Sub2_3590.aFloat9643), (aClass178_Sub2_3590.aFloat9704 * aClass178_Sub2_3590.aFloat9643), -903251131);
			if (aClass523_Sub4_Sub1_10138 != null)
				aClass265_10121.method4766(aClass523_Sub4_Sub1_10138, aClass178_Sub2_3590.aFloatArray9608[0], aClass178_Sub2_3590.aFloatArray9608[1], aClass178_Sub2_3590.aFloatArray9608[2], -143148753);
			if (aClass523_Sub4_Sub1_10126 != null)
				aClass265_10121.method4766(aClass523_Sub4_Sub1_10126, (aClass178_Sub2_3590.aFloat9689 * aClass178_Sub2_3590.aFloat9617), (aClass178_Sub2_3590.aFloat9614 * aClass178_Sub2_3590.aFloat9617), (aClass178_Sub2_3590.aFloat9704 * aClass178_Sub2_3590.aFloat9617), 1677974345);
			if (aClass523_Sub4_Sub1_10127 != null)
				aClass265_10121.method4766(aClass523_Sub4_Sub1_10127, (-aClass178_Sub2_3590.aFloat9689 * aClass178_Sub2_3590.aFloat9618), (-aClass178_Sub2_3590.aFloat9614 * aClass178_Sub2_3590.aFloat9618), (-aClass178_Sub2_3590.aFloat9704 * aClass178_Sub2_3590.aFloat9618), -363720905);
			if (aClass523_Sub4_Sub1_10129 != null)
				aClass265_10121.method4764(aClass523_Sub4_Sub1_10129, 64.0F + Math.abs(aClass178_Sub2_3590.aFloatArray9608[1]) * 928.0F, (byte) 0);
		}
	}

	void method15651(int i, Class435 class435) {
		if (aClass523_Sub4_Sub1_10130 != null) {
			Class441 class441 = aClass178_Sub2_3590.method14963();
			float[] fs = { class441.aFloatArray4916[12], class441.aFloatArray4916[13], class441.aFloatArray4916[14] };
			float[] fs_1_ = { 0.0F, 0.0F, 0.0F };
			class441.method7096(fs_1_);
			float[] fs_2_ = { 0.0F, 0.0F, 0.0F };
			aClass178_Sub2_3590.method3122().method6858(0.0F, 0.0F, 0.0F, fs_2_);
			class435.method6853(fs);
			aClass265_10121.method4766(aClass523_Sub4_Sub1_10130, fs[0], fs[1], fs[2], -1480355068);
		}
	}

	void method15652(int i) {
		for (int i_3_ = 0; i_3_ < anInt10134; i_3_++)
			anIntArray10139[i_3_] |= 128 << i;
	}

	void method15653(Class435 class435) {
		Class441 class441 = aClass178_Sub2_3590.aClass441_9560;
		class441.method7090(class435);
		int i = aClass265_10121.method4796(-537164083);
		if (aClass523_Sub4_Sub1_10115 != null) {
			aClass265_10121.method4773(aClass523_Sub4_Sub1_10115, class441, -1014773247);
			anIntArray10139[i] &= ~0x1;
		}
		if (aClass523_Sub4_Sub1_10116 != null) {
			aClass441_10140.method7088(class441, aClass178_Sub2_3590.method15090());
			aClass265_10121.method4773(aClass523_Sub4_Sub1_10116, aClass441_10140, -713353200);
			anIntArray10139[i] &= ~0x10;
		}
		if (aClass523_Sub4_Sub1_10120 != null) {
			aClass441_10140.method7088(class441, aClass178_Sub2_3590.method14968());
			aClass265_10121.method4773(aClass523_Sub4_Sub1_10120, aClass441_10140, -550190101);
			anIntArray10139[i] &= ~0x20;
		}
		method15651(i, class435);
		method15649(i, class435);
	}

	void method5960() {
		method15653(Class435.aClass435_4890);
	}

	void method15654(int i) {
		aClass441Array10131[0].method7085();
		method15652(i);
	}

	void method5964() {
		if (aClass265_10121 != null)
			aClass265_10121.method4809();
	}

	void method15655(int i, Class435 class435) {
		if (aClass523_Sub4_Sub1_10130 != null) {
			Class441 class441 = aClass178_Sub2_3590.method14963();
			float[] fs = { class441.aFloatArray4916[12], class441.aFloatArray4916[13], class441.aFloatArray4916[14] };
			float[] fs_4_ = { 0.0F, 0.0F, 0.0F };
			class441.method7096(fs_4_);
			float[] fs_5_ = { 0.0F, 0.0F, 0.0F };
			aClass178_Sub2_3590.method3122().method6858(0.0F, 0.0F, 0.0F, fs_5_);
			class435.method6853(fs);
			aClass265_10121.method4766(aClass523_Sub4_Sub1_10130, fs[0], fs[1], fs[2], 224712418);
		}
	}

	void method5961() {
		aClass265_10121.method4750();
		anIntArray10139[aClass265_10121.method4796(-1241922932)] = -1;
		method15654(0);
		method15647();
	}

	Class340_Sub1(Class178_Sub2 class178_sub2) {
		super(class178_sub2);
		new Class435();
		aClass441Array10131 = new Class441[aClass178_Sub2_3590.anInt9680];
		for (int i = 0; i < aClass178_Sub2_3590.anInt9680; i++)
			aClass441Array10131[i] = new Class441();
	}

	void method5967() {
		if (aClass265_10121 != null)
			aClass265_10121.method4809();
	}

	void method5977() {
		method15653(Class435.aClass435_4890);
	}

	void method15656(Class441 class441) {
		if (aClass265_10121 != null && aClass265_10121.method4865() && aClass178_Sub2_3590.method15051() == 0) {
			int i = aClass265_10121.method4796(1975053029);
			if ((anIntArray10139[i] & 0x80) != 0 && aClass523_Sub4_Sub1_10114 != null) {
				aClass265_10121.method4772(aClass523_Sub4_Sub1_10114, class441, 1615792376);
				anIntArray10139[i] &= ~0x80;
			}
		}
	}

	void method5957() {
		if (aClass265_10121 != null)
			aClass265_10121.method4809();
	}

	void method5965() {
		method15653(Class435.aClass435_4890);
	}

	void method15657(int i, Class435 class435) {
		if (aClass523_Sub4_Sub1_10124 != null) {
			float[] fs = { aClass178_Sub2_3590.aFloatArray9608[0], aClass178_Sub2_3590.aFloatArray9608[1], aClass178_Sub2_3590.aFloatArray9608[2] };
			class435.method6828(fs);
			aClass265_10121.method4766(aClass523_Sub4_Sub1_10124, fs[0], fs[1], fs[2], -1219243622);
		}
	}

	void method15658(Class441 class441) {
		if (aClass265_10121 != null && aClass265_10121.method4865() && aClass178_Sub2_3590.method15051() == 0) {
			int i = aClass265_10121.method4796(-1211253968);
			if ((anIntArray10139[i] & 0x80) != 0 && aClass523_Sub4_Sub1_10114 != null) {
				aClass265_10121.method4772(aClass523_Sub4_Sub1_10114, class441, 2028953962);
				anIntArray10139[i] &= ~0x80;
			}
		}
	}

	void method5976() {
		method15653(Class435.aClass435_4890);
	}

	boolean method15659(String string) throws Exception_Sub3 {
		aClass265_10121 = aClass178_Sub2_3590.method15073(string);
		if (aClass265_10121 == null)
			throw new Exception_Sub3("");
		aClass523_Sub4_Sub1_10114 = aClass265_10121.method4878("textureMatrix", 1339585723);
		aClass523_Sub4_Sub1_10115 = aClass265_10121.method4878("modelMatrix", 1264932746);
		aClass523_Sub4_Sub1_10136 = aClass265_10121.method4878("viewMatrix", 1454343964);
		aClass523_Sub4_Sub1_10113 = aClass265_10121.method4878("projectionMatrix", 1294476686);
		aClass523_Sub4_Sub1_10116 = aClass265_10121.method4878("modelViewMatrix", 987950641);
		aClass523_Sub4_Sub1_10120 = aClass265_10121.method4878("modelViewProjectionMatrix", 1371212705);
		aClass523_Sub4_Sub1_10123 = aClass265_10121.method4878("viewProjectionMatrix", 667671588);
		aClass523_Sub4_Sub1_10125 = aClass265_10121.method4878("ambientColour", 1735901389);
		aClass523_Sub4_Sub1_10138 = aClass265_10121.method4878("sunDirection", 1528912351);
		aClass523_Sub4_Sub1_10126 = aClass265_10121.method4878("sunColour", 1226619041);
		aClass523_Sub4_Sub1_10127 = aClass265_10121.method4878("antiSunColour", 587802829);
		aClass523_Sub4_Sub1_10129 = aClass265_10121.method4878("sunExponent", 1991268288);
		aClass523_Sub4_Sub1_10122 = aClass265_10121.method4878("eyePosition", 1574974973);
		aClass523_Sub4_Sub1_10130 = aClass265_10121.method4878("eyePositionOS", 298172403);
		aClass523_Sub4_Sub1_10124 = aClass265_10121.method4878("sunDirectionOS", 1505595183);
		if (!method15646()) {
			aClass265_10121 = null;
			aClass523_Sub4_Sub1_10114 = null;
			aClass523_Sub4_Sub1_10115 = null;
			aClass523_Sub4_Sub1_10136 = null;
			aClass523_Sub4_Sub1_10113 = null;
			aClass523_Sub4_Sub1_10116 = null;
			aClass523_Sub4_Sub1_10120 = null;
			aClass523_Sub4_Sub1_10123 = null;
			aClass523_Sub4_Sub1_10125 = null;
			aClass523_Sub4_Sub1_10138 = null;
			aClass523_Sub4_Sub1_10126 = null;
			aClass523_Sub4_Sub1_10127 = null;
			aClass523_Sub4_Sub1_10129 = null;
			aClass523_Sub4_Sub1_10122 = null;
			aClass523_Sub4_Sub1_10130 = null;
			aClass523_Sub4_Sub1_10124 = null;
			return false;
		}
		if (aClass265_10121.method4760((short) 897) == null) {
			Class270 class270 = aClass265_10121.method4759(-1043037508);
			if (class270 == null)
				throw new Exception_Sub3(new StringBuilder().append(aClass265_10121.method4753(-2103810361)).append("").toString());
			aClass265_10121.method4852(class270);
		}
		anInt10134 = aClass265_10121.method4756((byte) -14);
		anIntArray10139 = new int[anInt10134];
		return true;
	}

	abstract boolean method15660() throws Exception_Sub3;

	abstract boolean method15661() throws Exception_Sub3;

	void method15662() {
		method15650(aClass178_Sub2_3590.aBool9674);
		method15656(aClass178_Sub2_3590.method15009());
		method15648();
		method5979();
	}

	void method15663(int i) {
		aClass441Array10131[0].method7085();
		method15652(i);
	}

	void method5979() {
		/* empty */
	}

	void method15664() {
		if (aClass265_10121 != null && aClass265_10121.method4865()) {
			int i = aClass265_10121.method4796(-187009908);
			int i_6_ = anIntArray10139[i];
			if ((i_6_ & 0x1) != 0 && aClass523_Sub4_Sub1_10115 != null)
				aClass265_10121.method4773(aClass523_Sub4_Sub1_10115, aClass178_Sub2_3590.method14966(), -1605227618);
			if ((i_6_ & 0x2) != 0) {
				if (aClass523_Sub4_Sub1_10136 != null)
					aClass265_10121.method4773(aClass523_Sub4_Sub1_10136, aClass178_Sub2_3590.method15090(), -1557978608);
				if (aClass523_Sub4_Sub1_10122 != null) {
					aFloatArray10142[0] = 0.0F;
					aFloatArray10142[1] = 0.0F;
					aFloatArray10142[2] = 0.0F;
					aClass178_Sub2_3590.method3122().method6823(aFloatArray10142[0], aFloatArray10142[1], aFloatArray10142[2], aFloatArray10142);
					aClass265_10121.method4766(aClass523_Sub4_Sub1_10122, aFloatArray10142[0], aFloatArray10142[1], aFloatArray10142[2], -436806085);
				}
			}
			if ((i_6_ & 0x10) != 0 && aClass523_Sub4_Sub1_10116 != null)
				aClass265_10121.method4773(aClass523_Sub4_Sub1_10116, aClass178_Sub2_3590.method14952(), -1807538733);
			if ((i_6_ & 0x8) != 0 && aClass523_Sub4_Sub1_10118 != null)
				aClass265_10121.method4773(aClass523_Sub4_Sub1_10118, aClass178_Sub2_3590.method14963(), -448718561);
			if ((i_6_ & 0x4) != 0 && aClass523_Sub4_Sub1_10113 != null)
				aClass265_10121.method4773(aClass523_Sub4_Sub1_10113, aClass178_Sub2_3590.method14969(), -1587457465);
			if ((i_6_ & 0x20) != 0 && aClass523_Sub4_Sub1_10120 != null) {
				aClass441_10140.method7088(aClass178_Sub2_3590.method14952(), aClass178_Sub2_3590.method14969());
				aClass265_10121.method4773(aClass523_Sub4_Sub1_10120, aClass441_10140, -1259687674);
			}
			if ((i_6_ & 0x40) != 0 && aClass523_Sub4_Sub1_10123 != null) {
				aClass441_10140.method7088(aClass178_Sub2_3590.method15090(), aClass178_Sub2_3590.method14969());
				aClass265_10121.method4773(aClass523_Sub4_Sub1_10123, aClass441_10140, -510080411);
			}
			if (aClass178_Sub2_3590.method15051() == 0 && (anIntArray10139[i] & 0x80) != 0 && aClass523_Sub4_Sub1_10114 != null) {
				aClass265_10121.method4772(aClass523_Sub4_Sub1_10114, aClass178_Sub2_3590.method15009(), 527871319);
				anIntArray10139[i] &= ~0x80;
			}
			anIntArray10139[i] = 0;
		}
	}

	void method15665() {
		if (aClass265_10121 != null && aClass265_10121.method4865()) {
			int i = aClass265_10121.method4796(179647986);
			int i_7_ = anIntArray10139[i];
			if ((i_7_ & 0x1) != 0 && aClass523_Sub4_Sub1_10115 != null)
				aClass265_10121.method4773(aClass523_Sub4_Sub1_10115, aClass178_Sub2_3590.method14966(), -1009857654);
			if ((i_7_ & 0x2) != 0) {
				if (aClass523_Sub4_Sub1_10136 != null)
					aClass265_10121.method4773(aClass523_Sub4_Sub1_10136, aClass178_Sub2_3590.method15090(), -41346072);
				if (aClass523_Sub4_Sub1_10122 != null) {
					aFloatArray10142[0] = 0.0F;
					aFloatArray10142[1] = 0.0F;
					aFloatArray10142[2] = 0.0F;
					aClass178_Sub2_3590.method3122().method6823(aFloatArray10142[0], aFloatArray10142[1], aFloatArray10142[2], aFloatArray10142);
					aClass265_10121.method4766(aClass523_Sub4_Sub1_10122, aFloatArray10142[0], aFloatArray10142[1], aFloatArray10142[2], -33977132);
				}
			}
			if ((i_7_ & 0x10) != 0 && aClass523_Sub4_Sub1_10116 != null)
				aClass265_10121.method4773(aClass523_Sub4_Sub1_10116, aClass178_Sub2_3590.method14952(), -630298390);
			if ((i_7_ & 0x8) != 0 && aClass523_Sub4_Sub1_10118 != null)
				aClass265_10121.method4773(aClass523_Sub4_Sub1_10118, aClass178_Sub2_3590.method14963(), -2014089088);
			if ((i_7_ & 0x4) != 0 && aClass523_Sub4_Sub1_10113 != null)
				aClass265_10121.method4773(aClass523_Sub4_Sub1_10113, aClass178_Sub2_3590.method14969(), -634964171);
			if ((i_7_ & 0x20) != 0 && aClass523_Sub4_Sub1_10120 != null) {
				aClass441_10140.method7088(aClass178_Sub2_3590.method14952(), aClass178_Sub2_3590.method14969());
				aClass265_10121.method4773(aClass523_Sub4_Sub1_10120, aClass441_10140, -1434611154);
			}
			if ((i_7_ & 0x40) != 0 && aClass523_Sub4_Sub1_10123 != null) {
				aClass441_10140.method7088(aClass178_Sub2_3590.method15090(), aClass178_Sub2_3590.method14969());
				aClass265_10121.method4773(aClass523_Sub4_Sub1_10123, aClass441_10140, -865457138);
			}
			if (aClass178_Sub2_3590.method15051() == 0 && (anIntArray10139[i] & 0x80) != 0 && aClass523_Sub4_Sub1_10114 != null) {
				aClass265_10121.method4772(aClass523_Sub4_Sub1_10114, aClass178_Sub2_3590.method15009(), 1727866244);
				anIntArray10139[i] &= ~0x80;
			}
			anIntArray10139[i] = 0;
		}
	}

	void method15666(Class441 class441) {
		if (aClass265_10121 != null && aClass265_10121.method4865() && aClass178_Sub2_3590.method15051() == 0) {
			int i = aClass265_10121.method4796(1104123525);
			if ((anIntArray10139[i] & 0x80) != 0 && aClass523_Sub4_Sub1_10114 != null) {
				aClass265_10121.method4772(aClass523_Sub4_Sub1_10114, class441, 577019518);
				anIntArray10139[i] &= ~0x80;
			}
		}
	}

	void method15667(int i, Class435 class435) {
		if (aClass523_Sub4_Sub1_10124 != null) {
			float[] fs = { aClass178_Sub2_3590.aFloatArray9608[0], aClass178_Sub2_3590.aFloatArray9608[1], aClass178_Sub2_3590.aFloatArray9608[2] };
			class435.method6828(fs);
			aClass265_10121.method4766(aClass523_Sub4_Sub1_10124, fs[0], fs[1], fs[2], -1558221471);
		}
	}

	void method15668(boolean bool) {
		if (aClass265_10121 != null && aClass265_10121.method4865()) {
			if (aClass523_Sub4_Sub1_10125 != null)
				aClass265_10121.method4766(aClass523_Sub4_Sub1_10125, (aClass178_Sub2_3590.aFloat9689 * aClass178_Sub2_3590.aFloat9643), (aClass178_Sub2_3590.aFloat9614 * aClass178_Sub2_3590.aFloat9643), (aClass178_Sub2_3590.aFloat9704 * aClass178_Sub2_3590.aFloat9643), 800763046);
			if (aClass523_Sub4_Sub1_10138 != null)
				aClass265_10121.method4766(aClass523_Sub4_Sub1_10138, aClass178_Sub2_3590.aFloatArray9608[0], aClass178_Sub2_3590.aFloatArray9608[1], aClass178_Sub2_3590.aFloatArray9608[2], 2131573604);
			if (aClass523_Sub4_Sub1_10126 != null)
				aClass265_10121.method4766(aClass523_Sub4_Sub1_10126, (aClass178_Sub2_3590.aFloat9689 * aClass178_Sub2_3590.aFloat9617), (aClass178_Sub2_3590.aFloat9614 * aClass178_Sub2_3590.aFloat9617), (aClass178_Sub2_3590.aFloat9704 * aClass178_Sub2_3590.aFloat9617), 108758270);
			if (aClass523_Sub4_Sub1_10127 != null)
				aClass265_10121.method4766(aClass523_Sub4_Sub1_10127, (-aClass178_Sub2_3590.aFloat9689 * aClass178_Sub2_3590.aFloat9618), (-aClass178_Sub2_3590.aFloat9614 * aClass178_Sub2_3590.aFloat9618), (-aClass178_Sub2_3590.aFloat9704 * aClass178_Sub2_3590.aFloat9618), 212588587);
			if (aClass523_Sub4_Sub1_10129 != null)
				aClass265_10121.method4764(aClass523_Sub4_Sub1_10129, 64.0F + Math.abs(aClass178_Sub2_3590.aFloatArray9608[1]) * 928.0F, (byte) 0);
		}
	}

	void method5978() {
		/* empty */
	}

	void method5972() {
		/* empty */
	}

	boolean method15669(String string) throws Exception_Sub3 {
		aClass265_10121 = aClass178_Sub2_3590.method15073(string);
		if (aClass265_10121 == null)
			throw new Exception_Sub3("");
		aClass523_Sub4_Sub1_10114 = aClass265_10121.method4878("textureMatrix", 590631830);
		aClass523_Sub4_Sub1_10115 = aClass265_10121.method4878("modelMatrix", 1526822446);
		aClass523_Sub4_Sub1_10136 = aClass265_10121.method4878("viewMatrix", 2109954013);
		aClass523_Sub4_Sub1_10113 = aClass265_10121.method4878("projectionMatrix", 1210515806);
		aClass523_Sub4_Sub1_10116 = aClass265_10121.method4878("modelViewMatrix", 865145333);
		aClass523_Sub4_Sub1_10120 = aClass265_10121.method4878("modelViewProjectionMatrix", 1791124472);
		aClass523_Sub4_Sub1_10123 = aClass265_10121.method4878("viewProjectionMatrix", 1919540190);
		aClass523_Sub4_Sub1_10125 = aClass265_10121.method4878("ambientColour", 665311226);
		aClass523_Sub4_Sub1_10138 = aClass265_10121.method4878("sunDirection", 1532486628);
		aClass523_Sub4_Sub1_10126 = aClass265_10121.method4878("sunColour", 1010046529);
		aClass523_Sub4_Sub1_10127 = aClass265_10121.method4878("antiSunColour", 1908504590);
		aClass523_Sub4_Sub1_10129 = aClass265_10121.method4878("sunExponent", 1003753548);
		aClass523_Sub4_Sub1_10122 = aClass265_10121.method4878("eyePosition", 2034227648);
		aClass523_Sub4_Sub1_10130 = aClass265_10121.method4878("eyePositionOS", 279705375);
		aClass523_Sub4_Sub1_10124 = aClass265_10121.method4878("sunDirectionOS", 1567817067);
		if (!method15646()) {
			aClass265_10121 = null;
			aClass523_Sub4_Sub1_10114 = null;
			aClass523_Sub4_Sub1_10115 = null;
			aClass523_Sub4_Sub1_10136 = null;
			aClass523_Sub4_Sub1_10113 = null;
			aClass523_Sub4_Sub1_10116 = null;
			aClass523_Sub4_Sub1_10120 = null;
			aClass523_Sub4_Sub1_10123 = null;
			aClass523_Sub4_Sub1_10125 = null;
			aClass523_Sub4_Sub1_10138 = null;
			aClass523_Sub4_Sub1_10126 = null;
			aClass523_Sub4_Sub1_10127 = null;
			aClass523_Sub4_Sub1_10129 = null;
			aClass523_Sub4_Sub1_10122 = null;
			aClass523_Sub4_Sub1_10130 = null;
			aClass523_Sub4_Sub1_10124 = null;
			return false;
		}
		if (aClass265_10121.method4760((short) 897) == null) {
			Class270 class270 = aClass265_10121.method4759(-1043037508);
			if (class270 == null)
				throw new Exception_Sub3(new StringBuilder().append(aClass265_10121.method4753(-2120470781)).append("").toString());
			aClass265_10121.method4852(class270);
		}
		anInt10134 = aClass265_10121.method4756((byte) -45);
		anIntArray10139 = new int[anInt10134];
		return true;
	}

	void method15670(int i) {
		for (int i_8_ = 0; i_8_ < anInt10134; i_8_++)
			anIntArray10139[i_8_] |= 128 << i;
	}

	void method15671(Class435 class435) {
		Class441 class441 = aClass178_Sub2_3590.aClass441_9560;
		class441.method7090(class435);
		int i = aClass265_10121.method4796(-1241544872);
		if (aClass523_Sub4_Sub1_10115 != null) {
			aClass265_10121.method4773(aClass523_Sub4_Sub1_10115, class441, -509697455);
			anIntArray10139[i] &= ~0x1;
		}
		if (aClass523_Sub4_Sub1_10116 != null) {
			aClass441_10140.method7088(class441, aClass178_Sub2_3590.method15090());
			aClass265_10121.method4773(aClass523_Sub4_Sub1_10116, aClass441_10140, -311730132);
			anIntArray10139[i] &= ~0x10;
		}
		if (aClass523_Sub4_Sub1_10120 != null) {
			aClass441_10140.method7088(class441, aClass178_Sub2_3590.method14968());
			aClass265_10121.method4773(aClass523_Sub4_Sub1_10120, aClass441_10140, -1238027533);
			anIntArray10139[i] &= ~0x20;
		}
		method15651(i, class435);
		method15649(i, class435);
	}

	void method15672(int i) {
		for (int i_9_ = 0; i_9_ < anInt10134; i_9_++)
			anIntArray10139[i_9_] |= 128 << i;
	}

	void method15673(Class435 class435) {
		Class441 class441 = aClass178_Sub2_3590.aClass441_9560;
		class441.method7090(class435);
		int i = aClass265_10121.method4796(1859748491);
		if (aClass523_Sub4_Sub1_10115 != null) {
			aClass265_10121.method4773(aClass523_Sub4_Sub1_10115, class441, -206526039);
			anIntArray10139[i] &= ~0x1;
		}
		if (aClass523_Sub4_Sub1_10116 != null) {
			aClass441_10140.method7088(class441, aClass178_Sub2_3590.method15090());
			aClass265_10121.method4773(aClass523_Sub4_Sub1_10116, aClass441_10140, -1917088478);
			anIntArray10139[i] &= ~0x10;
		}
		if (aClass523_Sub4_Sub1_10120 != null) {
			aClass441_10140.method7088(class441, aClass178_Sub2_3590.method14968());
			aClass265_10121.method4773(aClass523_Sub4_Sub1_10120, aClass441_10140, -1692428421);
			anIntArray10139[i] &= ~0x20;
		}
		method15651(i, class435);
		method15649(i, class435);
	}

	void method15674(Class435 class435) {
		Class441 class441 = aClass178_Sub2_3590.aClass441_9560;
		class441.method7090(class435);
		int i = aClass265_10121.method4796(1843755309);
		if (aClass523_Sub4_Sub1_10115 != null) {
			aClass265_10121.method4773(aClass523_Sub4_Sub1_10115, class441, -1520994607);
			anIntArray10139[i] &= ~0x1;
		}
		if (aClass523_Sub4_Sub1_10116 != null) {
			aClass441_10140.method7088(class441, aClass178_Sub2_3590.method15090());
			aClass265_10121.method4773(aClass523_Sub4_Sub1_10116, aClass441_10140, -115992986);
			anIntArray10139[i] &= ~0x10;
		}
		if (aClass523_Sub4_Sub1_10120 != null) {
			aClass441_10140.method7088(class441, aClass178_Sub2_3590.method14968());
			aClass265_10121.method4773(aClass523_Sub4_Sub1_10120, aClass441_10140, -1198375158);
			anIntArray10139[i] &= ~0x20;
		}
		method15651(i, class435);
		method15649(i, class435);
	}

	void method15675(Class435 class435) {
		Class441 class441 = aClass178_Sub2_3590.aClass441_9560;
		class441.method7090(class435);
		int i = aClass265_10121.method4796(280165144);
		if (aClass523_Sub4_Sub1_10115 != null) {
			aClass265_10121.method4773(aClass523_Sub4_Sub1_10115, class441, -111648349);
			anIntArray10139[i] &= ~0x1;
		}
		if (aClass523_Sub4_Sub1_10116 != null) {
			aClass441_10140.method7088(class441, aClass178_Sub2_3590.method15090());
			aClass265_10121.method4773(aClass523_Sub4_Sub1_10116, aClass441_10140, -1124840432);
			anIntArray10139[i] &= ~0x10;
		}
		if (aClass523_Sub4_Sub1_10120 != null) {
			aClass441_10140.method7088(class441, aClass178_Sub2_3590.method14968());
			aClass265_10121.method4773(aClass523_Sub4_Sub1_10120, aClass441_10140, -1257961817);
			anIntArray10139[i] &= ~0x20;
		}
		method15651(i, class435);
		method15649(i, class435);
	}

	void method15676(int i) {
		aClass441Array10131[0].method7085();
		method15652(i);
	}

	void method15677(int i) {
		aClass441Array10131[0].method7085();
		method15652(i);
	}

	void method5962() {
		aClass265_10121.method4750();
		anIntArray10139[aClass265_10121.method4796(947906289)] = -1;
		method15654(0);
		method15647();
	}
}
