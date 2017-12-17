/* Class328_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class328_Sub2 extends Class328 {
	int anInt10070;
	Class437 aClass437_10071;
	public Class440 aClass440_10072;
	boolean aBool10073;
	int anInt10074;
	Class440 aClass440_10075;
	Class437 aClass437_10076;
	Class437 aClass437_10077;
	Class437 aClass437_10078 = new Class437();
	Interface31 anInterface31_10079;

	public Class328_Sub2(Class298 class298) {
		super(class298);
		aClass440_10072 = new Class440();
		anInt10074 = -1891649816;
		aClass437_10076 = new Class437(Float.NaN, Float.NaN, Float.NaN);
		aClass437_10077 = new Class437(Float.NaN, Float.NaN, Float.NaN);
		aClass437_10071 = new Class437();
		aClass440_10075 = new Class440();
	}

	public void method15595(Interface31 interface31, Class437 class437, Class440 class440, boolean bool, int i, int[][][] is, Class451 class451, int i_0_, int i_1_, int i_2_) {
		anInterface31_10079 = interface31;
		aClass437_10078.method6886(class437);
		aClass440_10072.method7015(class440);
		aBool10073 = bool;
		anInt10074 = i * 2052126053;
		anInt10070 = (anInterface31_10079.method181(-1305464803).anInt10557 * 1751025763);
		method15607(is, class451, i_0_, i_1_, (byte) 23);
	}

	public void method15596(int i) {
		if (anInterface31_10079 != null)
			anInterface31_10079 = (aClass298_3472.method5402((byte) -8).method174(anInterface31_10079.method176((byte) 12), anInterface31_10079.method69(365587714), -1484899611));
	}

	public void method5773(float f, int[][][] is, Class451 class451, int i, int i_3_, int i_4_) {
		if (null != anInterface31_10079) {
			method15607(is, class451, i, i_3_, (byte) 104);
			Class440 class440 = method15604((byte) -114);
			aClass440_10075.method7032(class440, aClass298_3472.method5409(1298910527));
			if (Float.isNaN(aClass440_10075.aFloat4909))
				aClass440_10075.method7015(class440);
			class440.method7011();
			aClass437_10077.method6886(anInterface31_10079.method181(-236773380).method16163((byte) -86));
			aClass298_3472.method5310(true, f, aClass437_10076, aClass298_3472.method5376((short) 256), aClass437_10077, aClass437_10071, (byte) -71);
		}
	}

	public void method5760(RSBuffer class523_sub34, int i) {
		Class292 class292 = Class60.method1402(class523_sub34.readUnsignedByte(-75094604), -290009836);
		int i_5_ = class523_sub34.readUnsignedShort(-1343722719);
		aClass437_10078.method6941(class523_sub34);
		aClass440_10072.method7013(class523_sub34);
		if (class523_sub34.readUnsignedByte(58804412) == 1)
			aBool10073 = true;
		else
			aBool10073 = false;
		anInt10074 = class523_sub34.readUnsignedShort(-374037251) * 2052126053;
		anInterface31_10079 = aClass298_3472.method5402((byte) -8).method174(class292, i_5_, 1206531109);
	}

	public Class437 method15597(int i) {
		return aClass437_10076;
	}

	float method15598(int[][][] is, Class451 class451, int i, int i_6_, int i_7_, boolean bool, int i_8_) {
		Class440 class440 = method15604((byte) -117);
		Class437 class437 = method15606(class440, -42057203);
		class440.method7011();
		int i_9_ = (int) class437.aFloat4903 - i >> 9;
		int i_10_ = (int) class437.aFloat4905 - i_6_ >> 9;
		if (i_9_ >= 0 && i_10_ >= 0 && 1 + i_9_ < is[0].length && 1 + i_10_ < is[0][0].length) {
			int i_11_ = i_7_;
			if (bool && class451.method7282(i_9_, i_10_, -638715901))
				i_11_ = 1 + i_7_;
			long l = (long) class437.aFloat4903 % 512L;
			long l_12_ = (long) class437.aFloat4905 % 512L;
			long l_13_ = (long) is[i_11_][i_9_][i_10_] * (512L - l) * (512L - l_12_);
			l_13_ += (long) is[i_11_][i_9_ + 1][i_10_] * l * (512L - l_12_);
			l_13_ += l_12_ * ((512L - l) * (long) is[i_11_][i_9_][1 + i_10_]);
			l_13_ += l * (long) is[i_11_][1 + i_9_][i_10_ + 1] * l_12_;
			l_13_ /= 262144L;
			l_13_ -= 1024L;
			float f = (float) -l_13_ - class437.aFloat4904;
			class437.method6949();
			return f;
		}
		class437.method6949();
		return Float.NaN;
	}

	Class437 method15599(Class440 class440) {
		Class437 class437 = Class437.method6884(aClass437_10078);
		class437.method6907(class440);
		Class437 class437_14_ = Class437.method6892(aClass437_10077, class437);
		class437.method6949();
		return class437_14_;
	}

	public boolean method5761(int i) {
		return !Float.isNaN(aClass437_10076.aFloat4903);
	}

	public Class437 method5767(int i) {
		Class437 class437 = Class437.method6884(aClass437_10078);
		class437.method6907(aClass440_10075);
		Class437 class437_15_ = Class437.method6892(aClass437_10076, class437);
		class437.method6949();
		return class437_15_;
	}

	public double[] method5762(int i) {
		double[] ds = new double[3];
		Class437 class437 = method5767(813832029);
		ds[0] = (double) class437.aFloat4903;
		ds[1] = (double) class437.aFloat4904;
		ds[2] = (double) class437.aFloat4905;
		return ds;
	}

	public Class523_Sub29 method5763(byte i) {
		Class437 class437 = method5767(1744584698);
		Class523_Sub29 class523_sub29 = new Class523_Sub29(anInt10070 * 983005375, (int) class437.aFloat4903, (int) class437.aFloat4904, (int) class437.aFloat4905);
		class437.method6949();
		return class523_sub29;
	}

	public Class437 method15600() {
		return aClass437_10076;
	}

	public Class437 method15601(int i) {
		return aClass437_10078;
	}

	public void method15602() {
		if (anInterface31_10079 != null)
			anInterface31_10079 = (aClass298_3472.method5402((byte) -8).method174(anInterface31_10079.method176((byte) 12), anInterface31_10079.method69(365587714), 205019893));
	}

	public float method15603(int i) {
		return Class245.method4383(aClass440_10072, 871095485);
	}

	public float method5764(int i) {
		return 0.0F;
	}

	Class440 method15604(byte i) {
		Class440 class440 = Class440.method7010(aClass440_10072);
		if (aBool10073) {
			Class437 class437 = anInterface31_10079.method178(842519124);
			if (class437.method6958() < (float) (1535325293 * anInt10074)) {
				class437 = Class437.method6879(0.0F, 0.0F, 1.0F);
				Class440 class440_16_ = anInterface31_10079.method179(677953207);
				class437.method6907(class440_16_);
			}
			class437.aFloat4904 = 0.0F;
			float f = (float) Math.atan2((double) class437.aFloat4903, (double) class437.aFloat4905);
			class437.method6949();
			Class440 class440_17_ = new Class440();
			class440_17_.method7017(0.0F, 1.0F, 0.0F, f);
			class440.method7042(class440_17_);
		}
		return class440;
	}

	public void method5768(RSBuffer class523_sub34) {
		Class292 class292 = Class60.method1402(class523_sub34.readUnsignedByte(-1335085236), -290009836);
		int i = class523_sub34.readUnsignedShort(-1684621792);
		aClass437_10078.method6941(class523_sub34);
		aClass440_10072.method7013(class523_sub34);
		if (class523_sub34.readUnsignedByte(-1269831275) == 1)
			aBool10073 = true;
		else
			aBool10073 = false;
		anInt10074 = class523_sub34.readUnsignedShort(-1738374401) * 2052126053;
		anInterface31_10079 = aClass298_3472.method5402((byte) -8).method174(class292, i, -1645799174);
	}

	public void method5772(float f, int[][][] is, Class451 class451, int i, int i_18_) {
		if (null != anInterface31_10079) {
			method15607(is, class451, i, i_18_, (byte) 48);
			Class440 class440 = method15604((byte) -94);
			aClass440_10075.method7032(class440, aClass298_3472.method5409(-1449624828));
			if (Float.isNaN(aClass440_10075.aFloat4909))
				aClass440_10075.method7015(class440);
			class440.method7011();
			aClass437_10077.method6886(anInterface31_10079.method181(824230224).method16163((byte) 27));
			aClass298_3472.method5310(true, f, aClass437_10076, aClass298_3472.method5376((short) 256), aClass437_10077, aClass437_10071, (byte) -117);
		}
	}

	public void method5775(float f, int[][][] is, Class451 class451, int i, int i_19_) {
		if (null != anInterface31_10079) {
			method15607(is, class451, i, i_19_, (byte) 99);
			Class440 class440 = method15604((byte) -32);
			aClass440_10075.method7032(class440, aClass298_3472.method5409(-798053399));
			if (Float.isNaN(aClass440_10075.aFloat4909))
				aClass440_10075.method7015(class440);
			class440.method7011();
			aClass437_10077.method6886(anInterface31_10079.method181(-427557950).method16163((byte) -17));
			aClass298_3472.method5310(true, f, aClass437_10076, aClass298_3472.method5376((short) 256), aClass437_10077, aClass437_10071, (byte) -12);
		}
	}

	public float method15605() {
		return Class541.method8989(aClass440_10072, (byte) 29);
	}

	public Class437 method5780() {
		Class437 class437 = Class437.method6884(aClass437_10078);
		class437.method6907(aClass440_10075);
		Class437 class437_20_ = Class437.method6892(aClass437_10076, class437);
		class437.method6949();
		return class437_20_;
	}

	public Class437 method5771() {
		Class437 class437 = Class437.method6884(aClass437_10078);
		class437.method6907(aClass440_10075);
		Class437 class437_21_ = Class437.method6892(aClass437_10076, class437);
		class437.method6949();
		return class437_21_;
	}

	public Class437 method5759() {
		Class437 class437 = Class437.method6884(aClass437_10078);
		class437.method6907(aClass440_10075);
		Class437 class437_22_ = Class437.method6892(aClass437_10076, class437);
		class437.method6949();
		return class437_22_;
	}

	public double[] method5779() {
		double[] ds = new double[3];
		Class437 class437 = method5767(-1307414235);
		ds[0] = (double) class437.aFloat4903;
		ds[1] = (double) class437.aFloat4904;
		ds[2] = (double) class437.aFloat4905;
		return ds;
	}

	public double[] method5774() {
		double[] ds = new double[3];
		Class437 class437 = method5767(919998916);
		ds[0] = (double) class437.aFloat4903;
		ds[1] = (double) class437.aFloat4904;
		ds[2] = (double) class437.aFloat4905;
		return ds;
	}

	public double[] method5769() {
		double[] ds = new double[3];
		Class437 class437 = method5767(-509129198);
		ds[0] = (double) class437.aFloat4903;
		ds[1] = (double) class437.aFloat4904;
		ds[2] = (double) class437.aFloat4905;
		return ds;
	}

	public double[] method5776() {
		double[] ds = new double[3];
		Class437 class437 = method5767(1301399060);
		ds[0] = (double) class437.aFloat4903;
		ds[1] = (double) class437.aFloat4904;
		ds[2] = (double) class437.aFloat4905;
		return ds;
	}

	public void method5777(Class307 class307, int i, int i_23_) {
		Class437 class437 = method5767(-695015045);
		class307.anInt3352 = ((int) class437.aFloat4903 - i) * -1836718837;
		class307.anInt3353 = 1864035725 * (int) -class437.aFloat4904;
		class307.anInt3351 = 526599821 * ((int) class437.aFloat4905 - i_23_);
		class437.method6949();
	}

	public void method5770(Class307 class307, int i, int i_24_) {
		Class437 class437 = method5767(-1568587875);
		class307.anInt3352 = ((int) class437.aFloat4903 - i) * -1836718837;
		class307.anInt3353 = 1864035725 * (int) -class437.aFloat4904;
		class307.anInt3351 = 526599821 * ((int) class437.aFloat4905 - i_24_);
		class437.method6949();
	}

	public void method5765(Class307 class307, int i, int i_25_, int i_26_) {
		Class437 class437 = method5767(-624605401);
		class307.anInt3352 = ((int) class437.aFloat4903 - i) * -1836718837;
		class307.anInt3353 = 1864035725 * (int) -class437.aFloat4904;
		class307.anInt3351 = 526599821 * ((int) class437.aFloat4905 - i_25_);
		class437.method6949();
	}

	Class437 method15606(Class440 class440, int i) {
		Class437 class437 = Class437.method6884(aClass437_10078);
		class437.method6907(class440);
		Class437 class437_27_ = Class437.method6892(aClass437_10077, class437);
		class437.method6949();
		return class437_27_;
	}

	public void method5781(RSBuffer class523_sub34) {
		Class292 class292 = Class60.method1402(class523_sub34.readUnsignedByte(131675002), -290009836);
		int i = class523_sub34.readUnsignedShort(-308622369);
		aClass437_10078.method6941(class523_sub34);
		aClass440_10072.method7013(class523_sub34);
		if (class523_sub34.readUnsignedByte(1878406380) == 1)
			aBool10073 = true;
		else
			aBool10073 = false;
		anInt10074 = class523_sub34.readUnsignedShort(-385790898) * 2052126053;
		anInterface31_10079 = aClass298_3472.method5402((byte) -8).method174(class292, i, -458691653);
	}

	public Class523_Sub29 method5766() {
		Class437 class437 = method5767(912816065);
		Class523_Sub29 class523_sub29 = new Class523_Sub29(anInt10070 * 983005375, (int) class437.aFloat4903, (int) class437.aFloat4904, (int) class437.aFloat4905);
		class437.method6949();
		return class523_sub29;
	}

	void method15607(int[][][] is, Class451 class451, int i, int i_28_, byte i_29_) {
		if (method5761(-1529830923) && (aClass298_3472.method5359(-1164760089) || aClass298_3472.method5381(-633906314))) {
			Class523_Sub29 class523_sub29 = anInterface31_10079.method181(-620306846);
			anInt10070 = class523_sub29.anInt10557 * 1751025763;
			int i_30_ = 983005375 * anInt10070;
			boolean bool = true;
			if (3 == anInt10070 * 983005375)
				bool = false;
			else if (class451 != null && (class451.method7282(class523_sub29.anInt10560 * -536626413 - i >> 9, class523_sub29.anInt10555 * 169299399 - i_28_ >> 9, -638715901))) {
				i_30_ = 983005375 * anInt10070 + 1;
				bool = false;
			}
			if (aClass298_3472.method5381(-1711341596) && is != null) {
				float f = method15598(is, class451, i, i_28_, i_30_, bool, 1425633943);
				if (!Float.isNaN(f)) {
					if (f > 0.0F) {
						float f_31_ = 3.1415927F;
						Class437 class437 = Class437.method6879(0.0F, 0.0F, 1.0F);
						class437.method6907(aClass440_10072);
						Class437 class437_32_ = Class437.method6879(class437.aFloat4903, 0.0F, class437.aFloat4905);
						class437_32_.method6890();
						float f_33_ = Class437.method6899(class437, class437_32_);
						for (int i_34_ = 0; i_34_ < 10; i_34_++) {
							float f_35_ = (f_33_ + f_31_) / 2.0F - f_33_;
							float f_36_ = f_35_;
							if (f > 0.0F)
								f_36_ *= -1.0F;
							Class437 class437_37_ = Class437.method6879(1.0F, 0.0F, 0.0F);
							class437_37_.method6907(aClass440_10072);
							Class440 class440 = Class440.method7063();
							class440.method7016(class437_37_, f_36_);
							aClass440_10072.method7042(class440);
							aClass440_10072.method7041();
							class437_37_.method6949();
							class440.method7011();
							f = method15598(is, class451, i, i_28_, i_30_, bool, 934188212);
							if (Float.isNaN(f))
								break;
							if (f > 0.0F)
								f_33_ += f_35_;
							else
								f_31_ -= f_35_;
						}
					}
				}
			}
		}
	}

	public boolean method5782() {
		return !Float.isNaN(aClass437_10076.aFloat4903);
	}

	public float method15608(int i) {
		return Class541.method8989(aClass440_10072, (byte) 82);
	}

	public void method15609() {
		if (anInterface31_10079 != null)
			anInterface31_10079 = (aClass298_3472.method5402((byte) -8).method174(anInterface31_10079.method176((byte) 12), anInterface31_10079.method69(365587714), 293463170));
	}

	public void method15610() {
		if (anInterface31_10079 != null)
			anInterface31_10079 = (aClass298_3472.method5402((byte) -8).method174(anInterface31_10079.method176((byte) 12), anInterface31_10079.method69(365587714), 1365950636));
	}

	public float method5783() {
		return 0.0F;
	}

	Class440 method15611() {
		Class440 class440 = Class440.method7010(aClass440_10072);
		if (aBool10073) {
			Class437 class437 = anInterface31_10079.method178(1455092899);
			if (class437.method6958() < (float) (1535325293 * anInt10074)) {
				class437 = Class437.method6879(0.0F, 0.0F, 1.0F);
				Class440 class440_38_ = anInterface31_10079.method179(362773559);
				class437.method6907(class440_38_);
			}
			class437.aFloat4904 = 0.0F;
			float f = (float) Math.atan2((double) class437.aFloat4903, (double) class437.aFloat4905);
			class437.method6949();
			Class440 class440_39_ = new Class440();
			class440_39_.method7017(0.0F, 1.0F, 0.0F, f);
			class440.method7042(class440_39_);
		}
		return class440;
	}

	Class440 method15612() {
		Class440 class440 = Class440.method7010(aClass440_10072);
		if (aBool10073) {
			Class437 class437 = anInterface31_10079.method178(180375762);
			if (class437.method6958() < (float) (1535325293 * anInt10074)) {
				class437 = Class437.method6879(0.0F, 0.0F, 1.0F);
				Class440 class440_40_ = anInterface31_10079.method179(1331122206);
				class437.method6907(class440_40_);
			}
			class437.aFloat4904 = 0.0F;
			float f = (float) Math.atan2((double) class437.aFloat4903, (double) class437.aFloat4905);
			class437.method6949();
			Class440 class440_41_ = new Class440();
			class440_41_.method7017(0.0F, 1.0F, 0.0F, f);
			class440.method7042(class440_41_);
		}
		return class440;
	}

	void method15613(int[][][] is, Class451 class451, int i, int i_42_) {
		if (method5761(-768140) && (aClass298_3472.method5359(-1164760089) || aClass298_3472.method5381(1681742004))) {
			Class523_Sub29 class523_sub29 = anInterface31_10079.method181(-2100103569);
			anInt10070 = class523_sub29.anInt10557 * 1751025763;
			int i_43_ = 983005375 * anInt10070;
			boolean bool = true;
			if (3 == anInt10070 * 983005375)
				bool = false;
			else if (class451 != null && (class451.method7282(class523_sub29.anInt10560 * -536626413 - i >> 9, class523_sub29.anInt10555 * 169299399 - i_42_ >> 9, -638715901))) {
				i_43_ = 983005375 * anInt10070 + 1;
				bool = false;
			}
			if (aClass298_3472.method5381(-1715071828) && is != null) {
				float f = method15598(is, class451, i, i_42_, i_43_, bool, -964821204);
				if (!Float.isNaN(f)) {
					if (f > 0.0F) {
						float f_44_ = 3.1415927F;
						Class437 class437 = Class437.method6879(0.0F, 0.0F, 1.0F);
						class437.method6907(aClass440_10072);
						Class437 class437_45_ = Class437.method6879(class437.aFloat4903, 0.0F, class437.aFloat4905);
						class437_45_.method6890();
						float f_46_ = Class437.method6899(class437, class437_45_);
						for (int i_47_ = 0; i_47_ < 10; i_47_++) {
							float f_48_ = (f_46_ + f_44_) / 2.0F - f_46_;
							float f_49_ = f_48_;
							if (f > 0.0F)
								f_49_ *= -1.0F;
							Class437 class437_50_ = Class437.method6879(1.0F, 0.0F, 0.0F);
							class437_50_.method6907(aClass440_10072);
							Class440 class440 = Class440.method7063();
							class440.method7016(class437_50_, f_49_);
							aClass440_10072.method7042(class440);
							aClass440_10072.method7041();
							class437_50_.method6949();
							class440.method7011();
							f = method15598(is, class451, i, i_42_, i_43_, bool, 389464205);
							if (Float.isNaN(f))
								break;
							if (f > 0.0F)
								f_46_ += f_48_;
							else
								f_44_ -= f_48_;
						}
					}
				}
			}
		}
	}

	void method15614(int[][][] is, Class451 class451, int i, int i_51_) {
		if (method5761(1850239306) && (aClass298_3472.method5359(-1164760089) || aClass298_3472.method5381(-904038862))) {
			Class523_Sub29 class523_sub29 = anInterface31_10079.method181(-2135650550);
			anInt10070 = class523_sub29.anInt10557 * 1751025763;
			int i_52_ = 983005375 * anInt10070;
			boolean bool = true;
			if (3 == anInt10070 * 983005375)
				bool = false;
			else if (class451 != null && (class451.method7282(class523_sub29.anInt10560 * -536626413 - i >> 9, class523_sub29.anInt10555 * 169299399 - i_51_ >> 9, -638715901))) {
				i_52_ = 983005375 * anInt10070 + 1;
				bool = false;
			}
			if (aClass298_3472.method5381(1284398616) && is != null) {
				float f = method15598(is, class451, i, i_51_, i_52_, bool, -16703297);
				if (!Float.isNaN(f)) {
					if (f > 0.0F) {
						float f_53_ = 3.1415927F;
						Class437 class437 = Class437.method6879(0.0F, 0.0F, 1.0F);
						class437.method6907(aClass440_10072);
						Class437 class437_54_ = Class437.method6879(class437.aFloat4903, 0.0F, class437.aFloat4905);
						class437_54_.method6890();
						float f_55_ = Class437.method6899(class437, class437_54_);
						for (int i_56_ = 0; i_56_ < 10; i_56_++) {
							float f_57_ = (f_55_ + f_53_) / 2.0F - f_55_;
							float f_58_ = f_57_;
							if (f > 0.0F)
								f_58_ *= -1.0F;
							Class437 class437_59_ = Class437.method6879(1.0F, 0.0F, 0.0F);
							class437_59_.method6907(aClass440_10072);
							Class440 class440 = Class440.method7063();
							class440.method7016(class437_59_, f_58_);
							aClass440_10072.method7042(class440);
							aClass440_10072.method7041();
							class437_59_.method6949();
							class440.method7011();
							f = method15598(is, class451, i, i_51_, i_52_, bool, 290546332);
							if (Float.isNaN(f))
								break;
							if (f > 0.0F)
								f_55_ += f_57_;
							else
								f_53_ -= f_57_;
						}
					}
				}
			}
		}
	}

	public Class437 method15615() {
		return aClass437_10076;
	}

	public float method5784() {
		return 0.0F;
	}

	public float method5785() {
		return 0.0F;
	}

	public Class437 method15616() {
		return aClass437_10078;
	}

	public float method15617() {
		return Class541.method8989(aClass440_10072, (byte) 19);
	}

	public void method5778(RSBuffer class523_sub34) {
		Class292 class292 = Class60.method1402(class523_sub34.readUnsignedByte(698147756), -290009836);
		int i = class523_sub34.readUnsignedShort(-2081388035);
		aClass437_10078.method6941(class523_sub34);
		aClass440_10072.method7013(class523_sub34);
		if (class523_sub34.readUnsignedByte(859715769) == 1)
			aBool10073 = true;
		else
			aBool10073 = false;
		anInt10074 = class523_sub34.readUnsignedShort(-878894147) * 2052126053;
		anInterface31_10079 = aClass298_3472.method5402((byte) -8).method174(class292, i, 476398726);
	}

	public float method15618() {
		return Class245.method4383(aClass440_10072, -1006008930);
	}
}
