/* Class197 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class197 implements Interface58 {
	Class217 this$0;
	static int anInt2192;

	public void method379(Object object, float[] fs, Object[] objects) {
		Class489 class489 = (Class489) object;
		Class437 class437 = class489.method8035(278260143);
		float f = class489.method7959((byte) 64);
		float f_0_ = class489.method7962(-47694031);
		Class437 class437_1_ = this$0.method3856(-147121196);
		Class437 class437_2_ = Class437.method6932(class437, class437_1_);
		float f_3_ = 0.0F;
		int i = 8192;
		float f_4_ = class437_2_.method6958();
		float f_5_ = 0.0F;
		if (f_4_ >= f_0_)
			f_3_ = 0.0F;
		else {
			float f_6_ = ((Float) objects[0]).floatValue();
			float f_7_ = ((Float) objects[1]).floatValue();
			if (class437_1_.aFloat4903 > class437.aFloat4903 - f_6_ / 2.0F && class437_1_.aFloat4903 < f_6_ / 2.0F + class437.aFloat4903 && class437_1_.aFloat4905 > class437.aFloat4905 - f_7_ / 2.0F && (class437_1_.aFloat4905 < f_7_ / 2.0F + class437.aFloat4905)) {
				float f_8_ = Math.abs(class437_1_.aFloat4903 - (f_6_ / 2.0F + class437.aFloat4903));
				float f_9_ = Math.abs(class437_1_.aFloat4903 - (class437.aFloat4903 - f_6_ / 2.0F));
				float f_10_ = Math.abs(class437_1_.aFloat4905 - (f_7_ / 2.0F + class437.aFloat4903));
				float f_11_ = Math.abs(class437_1_.aFloat4905 - (class437.aFloat4903 - f_7_ / 2.0F));
				float f_12_ = f_0_ - f;
				float f_13_ = Math.min(f_8_, f_9_);
				float f_14_ = Math.min(f_10_, f_11_);
				float f_15_ = 1.0F / f_12_ * f_13_;
				float f_16_ = 1.0F / f_12_ * f_14_;
				f_15_ = Math.min(Math.max(f_15_, 0.0F), 1.0F);
				f_16_ = Math.min(Math.max(f_16_, 0.0F), 1.0F);
				f_3_ = Math.min(f_15_, f_16_);
			}
			if (class437_2_.aFloat4903 != 0.0F || 0.0F != class437_2_.aFloat4905) {
				if (2 == 2097396553 * Class562.anInt7564) {
					float f_17_ = Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5348(-607217017);
					if (0.0F != class437_2_.aFloat4903 || 0.0F != class437_2_.aFloat4905) {
						int i_18_ = (((int) ((double) (f_17_ * -1.0F) * 2607.5945876176133) - (int) (Math.atan2((double) (class437_2_.aFloat4903), (double) (class437_2_.aFloat4905)) * 2607.5945876176133) - 4096) & 0x3fff);
						if (i_18_ > 8192)
							i_18_ = 16384 - i_18_;
						int i_19_;
						if (f_4_ <= 0.0F)
							i_19_ = 8192;
						else if (f_4_ >= 4096.0F)
							i_19_ = 16384;
						else
							i_19_ = (int) (f_4_ * 8192.0F / 4096.0F + 8192.0F);
						i = i_19_ * i_18_ / 8192 + (16384 - i_19_ >> 1);
					}
					f_5_ = (float) i * 6.1035156E-5F;
				} else {
					int i_20_ = (-(Class424.anInt4817 * 325333285) - (int) (Math.atan2((double) class437_2_.aFloat4903, (double) class437_2_.aFloat4905) * 2607.5945876176133) - 4096) & 0x3fff;
					if (i_20_ > 8192)
						i_20_ = 16384 - i_20_;
					int i_21_;
					if (f_4_ <= 0.0F)
						i_21_ = 8192;
					else if (f_4_ >= 4096.0F)
						i_21_ = 16384;
					else
						i_21_ = (int) (f_4_ * 8192.0F / 4096.0F + 8192.0F);
					i = (16384 - i_21_ >> 1) + i_21_ * i_20_ / 8192;
					f_5_ = 6.1035156E-5F * (float) i;
				}
			}
		}
		fs[0] = (float) (i < 0 ? (double) f_3_ : (double) f_3_ * Math.sqrt((double) (1.0F - f_5_)));
		fs[1] = (float) (i < 0 ? (double) -f_3_ : (double) f_3_ * Math.sqrt((double) f_5_));
	}

	public void method376(Object object, float[] fs, Object[] objects, byte i) {
		Class489 class489 = (Class489) object;
		Class437 class437 = class489.method8035(-761997807);
		float f = class489.method7959((byte) 86);
		float f_22_ = class489.method7962(1317766628);
		Class437 class437_23_ = this$0.method3856(-1864538743);
		Class437 class437_24_ = Class437.method6932(class437, class437_23_);
		float f_25_ = 0.0F;
		int i_26_ = 8192;
		float f_27_ = class437_24_.method6958();
		float f_28_ = 0.0F;
		if (f_27_ >= f_22_)
			f_25_ = 0.0F;
		else {
			float f_29_ = ((Float) objects[0]).floatValue();
			float f_30_ = ((Float) objects[1]).floatValue();
			if (class437_23_.aFloat4903 > class437.aFloat4903 - f_29_ / 2.0F && class437_23_.aFloat4903 < f_29_ / 2.0F + class437.aFloat4903 && class437_23_.aFloat4905 > class437.aFloat4905 - f_30_ / 2.0F && (class437_23_.aFloat4905 < f_30_ / 2.0F + class437.aFloat4905)) {
				float f_31_ = Math.abs(class437_23_.aFloat4903 - (f_29_ / 2.0F + class437.aFloat4903));
				float f_32_ = Math.abs(class437_23_.aFloat4903 - (class437.aFloat4903 - f_29_ / 2.0F));
				float f_33_ = Math.abs(class437_23_.aFloat4905 - (f_30_ / 2.0F + class437.aFloat4903));
				float f_34_ = Math.abs(class437_23_.aFloat4905 - (class437.aFloat4903 - f_30_ / 2.0F));
				float f_35_ = f_22_ - f;
				float f_36_ = Math.min(f_31_, f_32_);
				float f_37_ = Math.min(f_33_, f_34_);
				float f_38_ = 1.0F / f_35_ * f_36_;
				float f_39_ = 1.0F / f_35_ * f_37_;
				f_38_ = Math.min(Math.max(f_38_, 0.0F), 1.0F);
				f_39_ = Math.min(Math.max(f_39_, 0.0F), 1.0F);
				f_25_ = Math.min(f_38_, f_39_);
			}
			if (class437_24_.aFloat4903 != 0.0F || 0.0F != class437_24_.aFloat4905) {
				if (2 == 2097396553 * Class562.anInt7564) {
					float f_40_ = Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5348(-1669649071);
					if (0.0F != class437_24_.aFloat4903 || 0.0F != class437_24_.aFloat4905) {
						int i_41_ = (((int) ((double) (f_40_ * -1.0F) * 2607.5945876176133) - (int) (Math.atan2((double) (class437_24_.aFloat4903), (double) (class437_24_.aFloat4905)) * 2607.5945876176133) - 4096) & 0x3fff);
						if (i_41_ > 8192)
							i_41_ = 16384 - i_41_;
						int i_42_;
						if (f_27_ <= 0.0F)
							i_42_ = 8192;
						else if (f_27_ >= 4096.0F)
							i_42_ = 16384;
						else
							i_42_ = (int) (f_27_ * 8192.0F / 4096.0F + 8192.0F);
						i_26_ = i_42_ * i_41_ / 8192 + (16384 - i_42_ >> 1);
					}
					f_28_ = (float) i_26_ * 6.1035156E-5F;
				} else {
					int i_43_ = ((-(Class424.anInt4817 * 325333285) - (int) (Math.atan2((double) (class437_24_.aFloat4903), (double) (class437_24_.aFloat4905)) * 2607.5945876176133) - 4096) & 0x3fff);
					if (i_43_ > 8192)
						i_43_ = 16384 - i_43_;
					int i_44_;
					if (f_27_ <= 0.0F)
						i_44_ = 8192;
					else if (f_27_ >= 4096.0F)
						i_44_ = 16384;
					else
						i_44_ = (int) (f_27_ * 8192.0F / 4096.0F + 8192.0F);
					i_26_ = (16384 - i_44_ >> 1) + i_44_ * i_43_ / 8192;
					f_28_ = 6.1035156E-5F * (float) i_26_;
				}
			}
		}
		fs[0] = (float) (i_26_ < 0 ? (double) f_25_ : (double) f_25_ * Math.sqrt((double) (1.0F - f_28_)));
		fs[1] = (float) (i_26_ < 0 ? (double) -f_25_ : (double) f_25_ * Math.sqrt((double) f_28_));
	}

	public void method377(Object object, float[] fs, Object[] objects) {
		Class489 class489 = (Class489) object;
		Class437 class437 = class489.method8035(-637846363);
		float f = class489.method7959((byte) 11);
		float f_45_ = class489.method7962(2016922264);
		Class437 class437_46_ = this$0.method3856(1478498472);
		Class437 class437_47_ = Class437.method6932(class437, class437_46_);
		float f_48_ = 0.0F;
		int i = 8192;
		float f_49_ = class437_47_.method6958();
		float f_50_ = 0.0F;
		if (f_49_ >= f_45_)
			f_48_ = 0.0F;
		else {
			float f_51_ = ((Float) objects[0]).floatValue();
			float f_52_ = ((Float) objects[1]).floatValue();
			if (class437_46_.aFloat4903 > class437.aFloat4903 - f_51_ / 2.0F && class437_46_.aFloat4903 < f_51_ / 2.0F + class437.aFloat4903 && class437_46_.aFloat4905 > class437.aFloat4905 - f_52_ / 2.0F && (class437_46_.aFloat4905 < f_52_ / 2.0F + class437.aFloat4905)) {
				float f_53_ = Math.abs(class437_46_.aFloat4903 - (f_51_ / 2.0F + class437.aFloat4903));
				float f_54_ = Math.abs(class437_46_.aFloat4903 - (class437.aFloat4903 - f_51_ / 2.0F));
				float f_55_ = Math.abs(class437_46_.aFloat4905 - (f_52_ / 2.0F + class437.aFloat4903));
				float f_56_ = Math.abs(class437_46_.aFloat4905 - (class437.aFloat4903 - f_52_ / 2.0F));
				float f_57_ = f_45_ - f;
				float f_58_ = Math.min(f_53_, f_54_);
				float f_59_ = Math.min(f_55_, f_56_);
				float f_60_ = 1.0F / f_57_ * f_58_;
				float f_61_ = 1.0F / f_57_ * f_59_;
				f_60_ = Math.min(Math.max(f_60_, 0.0F), 1.0F);
				f_61_ = Math.min(Math.max(f_61_, 0.0F), 1.0F);
				f_48_ = Math.min(f_60_, f_61_);
			}
			if (class437_47_.aFloat4903 != 0.0F || 0.0F != class437_47_.aFloat4905) {
				if (2 == 2097396553 * Class562.anInt7564) {
					float f_62_ = Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5348(-1792315496);
					if (0.0F != class437_47_.aFloat4903 || 0.0F != class437_47_.aFloat4905) {
						int i_63_ = (((int) ((double) (f_62_ * -1.0F) * 2607.5945876176133) - (int) (Math.atan2((double) (class437_47_.aFloat4903), (double) (class437_47_.aFloat4905)) * 2607.5945876176133) - 4096) & 0x3fff);
						if (i_63_ > 8192)
							i_63_ = 16384 - i_63_;
						int i_64_;
						if (f_49_ <= 0.0F)
							i_64_ = 8192;
						else if (f_49_ >= 4096.0F)
							i_64_ = 16384;
						else
							i_64_ = (int) (f_49_ * 8192.0F / 4096.0F + 8192.0F);
						i = i_64_ * i_63_ / 8192 + (16384 - i_64_ >> 1);
					}
					f_50_ = (float) i * 6.1035156E-5F;
				} else {
					int i_65_ = ((-(Class424.anInt4817 * 325333285) - (int) (Math.atan2((double) (class437_47_.aFloat4903), (double) (class437_47_.aFloat4905)) * 2607.5945876176133) - 4096) & 0x3fff);
					if (i_65_ > 8192)
						i_65_ = 16384 - i_65_;
					int i_66_;
					if (f_49_ <= 0.0F)
						i_66_ = 8192;
					else if (f_49_ >= 4096.0F)
						i_66_ = 16384;
					else
						i_66_ = (int) (f_49_ * 8192.0F / 4096.0F + 8192.0F);
					i = (16384 - i_66_ >> 1) + i_66_ * i_65_ / 8192;
					f_50_ = 6.1035156E-5F * (float) i;
				}
			}
		}
		fs[0] = (float) (i < 0 ? (double) f_48_ : (double) f_48_ * Math.sqrt((double) (1.0F - f_50_)));
		fs[1] = (float) (i < 0 ? (double) -f_48_ : (double) f_48_ * Math.sqrt((double) f_50_));
	}

	Class197(Class217 class217) {
		this$0 = class217;
	}

	public void method378(Object object, float[] fs, Object[] objects) {
		Class489 class489 = (Class489) object;
		Class437 class437 = class489.method8035(60589990);
		float f = class489.method7959((byte) 14);
		float f_67_ = class489.method7962(-517658775);
		Class437 class437_68_ = this$0.method3856(1908769125);
		Class437 class437_69_ = Class437.method6932(class437, class437_68_);
		float f_70_ = 0.0F;
		int i = 8192;
		float f_71_ = class437_69_.method6958();
		float f_72_ = 0.0F;
		if (f_71_ >= f_67_)
			f_70_ = 0.0F;
		else {
			float f_73_ = ((Float) objects[0]).floatValue();
			float f_74_ = ((Float) objects[1]).floatValue();
			if (class437_68_.aFloat4903 > class437.aFloat4903 - f_73_ / 2.0F && class437_68_.aFloat4903 < f_73_ / 2.0F + class437.aFloat4903 && class437_68_.aFloat4905 > class437.aFloat4905 - f_74_ / 2.0F && (class437_68_.aFloat4905 < f_74_ / 2.0F + class437.aFloat4905)) {
				float f_75_ = Math.abs(class437_68_.aFloat4903 - (f_73_ / 2.0F + class437.aFloat4903));
				float f_76_ = Math.abs(class437_68_.aFloat4903 - (class437.aFloat4903 - f_73_ / 2.0F));
				float f_77_ = Math.abs(class437_68_.aFloat4905 - (f_74_ / 2.0F + class437.aFloat4903));
				float f_78_ = Math.abs(class437_68_.aFloat4905 - (class437.aFloat4903 - f_74_ / 2.0F));
				float f_79_ = f_67_ - f;
				float f_80_ = Math.min(f_75_, f_76_);
				float f_81_ = Math.min(f_77_, f_78_);
				float f_82_ = 1.0F / f_79_ * f_80_;
				float f_83_ = 1.0F / f_79_ * f_81_;
				f_82_ = Math.min(Math.max(f_82_, 0.0F), 1.0F);
				f_83_ = Math.min(Math.max(f_83_, 0.0F), 1.0F);
				f_70_ = Math.min(f_82_, f_83_);
			}
			if (class437_69_.aFloat4903 != 0.0F || 0.0F != class437_69_.aFloat4905) {
				if (2 == 2097396553 * Class562.anInt7564) {
					float f_84_ = Class647_Sub1_Sub3_Sub1.aClass298_Sub1_11957.method5348(-1224519788);
					if (0.0F != class437_69_.aFloat4903 || 0.0F != class437_69_.aFloat4905) {
						int i_85_ = (((int) ((double) (f_84_ * -1.0F) * 2607.5945876176133) - (int) (Math.atan2((double) (class437_69_.aFloat4903), (double) (class437_69_.aFloat4905)) * 2607.5945876176133) - 4096) & 0x3fff);
						if (i_85_ > 8192)
							i_85_ = 16384 - i_85_;
						int i_86_;
						if (f_71_ <= 0.0F)
							i_86_ = 8192;
						else if (f_71_ >= 4096.0F)
							i_86_ = 16384;
						else
							i_86_ = (int) (f_71_ * 8192.0F / 4096.0F + 8192.0F);
						i = i_86_ * i_85_ / 8192 + (16384 - i_86_ >> 1);
					}
					f_72_ = (float) i * 6.1035156E-5F;
				} else {
					int i_87_ = ((-(Class424.anInt4817 * 325333285) - (int) (Math.atan2((double) (class437_69_.aFloat4903), (double) (class437_69_.aFloat4905)) * 2607.5945876176133) - 4096) & 0x3fff);
					if (i_87_ > 8192)
						i_87_ = 16384 - i_87_;
					int i_88_;
					if (f_71_ <= 0.0F)
						i_88_ = 8192;
					else if (f_71_ >= 4096.0F)
						i_88_ = 16384;
					else
						i_88_ = (int) (f_71_ * 8192.0F / 4096.0F + 8192.0F);
					i = (16384 - i_88_ >> 1) + i_88_ * i_87_ / 8192;
					f_72_ = 6.1035156E-5F * (float) i;
				}
			}
		}
		fs[0] = (float) (i < 0 ? (double) f_70_ : (double) f_70_ * Math.sqrt((double) (1.0F - f_72_)));
		fs[1] = (float) (i < 0 ? (double) -f_70_ : (double) f_70_ * Math.sqrt((double) f_72_));
	}

	public static void method3670(int i, int i_89_, int i_90_, int i_91_, int i_92_) {
		Class569.aLinkedList7645.addLast(new Class575(i, i_89_, i_90_ - i, i_91_ - i_89_));
	}

	static final void method3671(Class669 class669, int i) {
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		class669.anInt8558 -= -17422498;
		int i_93_ = class669.anIntArray8557[class669.anInt8558 * 1357652815];
		int i_94_ = class669.anIntArray8557[1357652815 * class669.anInt8558 + 1];
		Class10 class10 = Class491.aClass423_5536.method6688(client.anInterface50_11044, i_94_, (byte) -87);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class10.method602(string, i_93_, Class62.aClass148Array772, 1279410449);
	}
}
