/* Class269 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class269 {
	Class523_Sub4[] aClass523_Sub4Array2869;
	Class14 aClass14_2870;
	Interface29 anInterface29_2871;

	public void method4907(int i, String string, Class523_Sub4 class523_sub4, byte i_0_) {
		Class523_Sub4 class523_sub4_1_ = method4910(string, (byte) -6);
		if (null != class523_sub4_1_ && i != -1061827849 * class523_sub4_1_.anInt10396)
			throw new IllegalArgumentException(string);
		method4909(i, (byte) -86);
		if (i >= aClass523_Sub4Array2869.length) {
			int i_2_;
			for (i_2_ = aClass523_Sub4Array2869.length; i >= i_2_; i_2_ += i_2_) {
				/* empty */
			}
			aClass14_2870 = new Class14(i_2_);
			for (int i_3_ = 0; i_3_ < aClass523_Sub4Array2869.length; i_3_++) {
				Class523_Sub4 class523_sub4_4_ = aClass523_Sub4Array2869[i_3_];
				if (null != class523_sub4_4_)
					aClass14_2870.method738(class523_sub4_4_, (class523_sub4_4_.aLong7065 * 1055205983951172633L));
			}
			Class523_Sub4[] class523_sub4s = new Class523_Sub4[i_2_];
			for (int i_5_ = 0; i_5_ < aClass523_Sub4Array2869.length; i_5_++)
				class523_sub4s[i_5_] = aClass523_Sub4Array2869[i_5_];
			aClass523_Sub4Array2869 = class523_sub4s;
		}
		class523_sub4.anInt10396 = i * -919464249;
		class523_sub4.aString10395 = string;
		aClass14_2870.method738(class523_sub4, anInterface29_2871.method167(string, 2144161769));
		aClass523_Sub4Array2869[i] = class523_sub4;
	}

	public Class523_Sub4 method4908(int i, int i_6_) {
		if (i >= aClass523_Sub4Array2869.length)
			return null;
		return aClass523_Sub4Array2869[i];
	}

	public Class269(int i, Interface29 interface29) {
		int i_7_;
		for (i_7_ = 1; i_7_ < i; i_7_ += i_7_) {
			/* empty */
		}
		aClass14_2870 = new Class14(i_7_);
		aClass523_Sub4Array2869 = new Class523_Sub4[i_7_];
		anInterface29_2871 = interface29;
	}

	void method4909(int i, byte i_8_) {
		Class523_Sub4 class523_sub4 = method4908(i, 2000392618);
		if (class523_sub4 != null) {
			class523_sub4.method8661(607052656);
			aClass523_Sub4Array2869[-1061827849 * class523_sub4.anInt10396] = null;
		}
	}

	public Class523_Sub4 method4910(String string, byte i) {
		long l = anInterface29_2871.method167(string, 2143726475);
		for (Class523_Sub4 class523_sub4 = (Class523_Sub4) aClass14_2870.method741(l); null != class523_sub4; class523_sub4 = (Class523_Sub4) aClass14_2870.method740(231172810)) {
			if (class523_sub4.aString10395.equals(string))
				return class523_sub4;
		}
		return null;
	}

	public Class523_Sub4 method4911(int i) {
		if (i >= aClass523_Sub4Array2869.length)
			return null;
		return aClass523_Sub4Array2869[i];
	}

	public Class523_Sub4 method4912(int i) {
		if (i >= aClass523_Sub4Array2869.length)
			return null;
		return aClass523_Sub4Array2869[i];
	}

	void method4913(int i) {
		Class523_Sub4 class523_sub4 = method4908(i, 1867778873);
		if (class523_sub4 != null) {
			class523_sub4.method8661(607052656);
			aClass523_Sub4Array2869[-1061827849 * class523_sub4.anInt10396] = null;
		}
	}

	void method4914(int i) {
		Class523_Sub4 class523_sub4 = method4908(i, 1674206700);
		if (class523_sub4 != null) {
			class523_sub4.method8661(607052656);
			aClass523_Sub4Array2869[-1061827849 * class523_sub4.anInt10396] = null;
		}
	}

	public void method4915(int i, String string, Class523_Sub4 class523_sub4) {
		Class523_Sub4 class523_sub4_9_ = method4910(string, (byte) 101);
		if (null != class523_sub4_9_ && i != -1061827849 * class523_sub4_9_.anInt10396)
			throw new IllegalArgumentException(string);
		method4909(i, (byte) -64);
		if (i >= aClass523_Sub4Array2869.length) {
			int i_10_;
			for (i_10_ = aClass523_Sub4Array2869.length; i >= i_10_; i_10_ += i_10_) {
				/* empty */
			}
			aClass14_2870 = new Class14(i_10_);
			for (int i_11_ = 0; i_11_ < aClass523_Sub4Array2869.length; i_11_++) {
				Class523_Sub4 class523_sub4_12_ = aClass523_Sub4Array2869[i_11_];
				if (null != class523_sub4_12_)
					aClass14_2870.method738(class523_sub4_12_, (class523_sub4_12_.aLong7065 * 1055205983951172633L));
			}
			Class523_Sub4[] class523_sub4s = new Class523_Sub4[i_10_];
			for (int i_13_ = 0; i_13_ < aClass523_Sub4Array2869.length; i_13_++)
				class523_sub4s[i_13_] = aClass523_Sub4Array2869[i_13_];
			aClass523_Sub4Array2869 = class523_sub4s;
		}
		class523_sub4.anInt10396 = i * -919464249;
		class523_sub4.aString10395 = string;
		aClass14_2870.method738(class523_sub4, anInterface29_2871.method167(string, 2144727103));
		aClass523_Sub4Array2869[i] = class523_sub4;
	}

	public void method4916(int i, String string, Class523_Sub4 class523_sub4) {
		Class523_Sub4 class523_sub4_14_ = method4910(string, (byte) -9);
		if (null != class523_sub4_14_ && i != -1061827849 * class523_sub4_14_.anInt10396)
			throw new IllegalArgumentException(string);
		method4909(i, (byte) -82);
		if (i >= aClass523_Sub4Array2869.length) {
			int i_15_;
			for (i_15_ = aClass523_Sub4Array2869.length; i >= i_15_; i_15_ += i_15_) {
				/* empty */
			}
			aClass14_2870 = new Class14(i_15_);
			for (int i_16_ = 0; i_16_ < aClass523_Sub4Array2869.length; i_16_++) {
				Class523_Sub4 class523_sub4_17_ = aClass523_Sub4Array2869[i_16_];
				if (null != class523_sub4_17_)
					aClass14_2870.method738(class523_sub4_17_, (class523_sub4_17_.aLong7065 * 1055205983951172633L));
			}
			Class523_Sub4[] class523_sub4s = new Class523_Sub4[i_15_];
			for (int i_18_ = 0; i_18_ < aClass523_Sub4Array2869.length; i_18_++)
				class523_sub4s[i_18_] = aClass523_Sub4Array2869[i_18_];
			aClass523_Sub4Array2869 = class523_sub4s;
		}
		class523_sub4.anInt10396 = i * -919464249;
		class523_sub4.aString10395 = string;
		aClass14_2870.method738(class523_sub4, anInterface29_2871.method167(string, 2146838498));
		aClass523_Sub4Array2869[i] = class523_sub4;
	}

	public void method4917(int i, String string, Class523_Sub4 class523_sub4) {
		Class523_Sub4 class523_sub4_19_ = method4910(string, (byte) -98);
		if (null != class523_sub4_19_ && i != -1061827849 * class523_sub4_19_.anInt10396)
			throw new IllegalArgumentException(string);
		method4909(i, (byte) -90);
		if (i >= aClass523_Sub4Array2869.length) {
			int i_20_;
			for (i_20_ = aClass523_Sub4Array2869.length; i >= i_20_; i_20_ += i_20_) {
				/* empty */
			}
			aClass14_2870 = new Class14(i_20_);
			for (int i_21_ = 0; i_21_ < aClass523_Sub4Array2869.length; i_21_++) {
				Class523_Sub4 class523_sub4_22_ = aClass523_Sub4Array2869[i_21_];
				if (null != class523_sub4_22_)
					aClass14_2870.method738(class523_sub4_22_, (class523_sub4_22_.aLong7065 * 1055205983951172633L));
			}
			Class523_Sub4[] class523_sub4s = new Class523_Sub4[i_20_];
			for (int i_23_ = 0; i_23_ < aClass523_Sub4Array2869.length; i_23_++)
				class523_sub4s[i_23_] = aClass523_Sub4Array2869[i_23_];
			aClass523_Sub4Array2869 = class523_sub4s;
		}
		class523_sub4.anInt10396 = i * -919464249;
		class523_sub4.aString10395 = string;
		aClass14_2870.method738(class523_sub4, anInterface29_2871.method167(string, 2145443955));
		aClass523_Sub4Array2869[i] = class523_sub4;
	}

	static void method4918(byte i) {
		if (null == Class710.anIntArray8839) {
			Class710.anIntArray8839 = new int[65536];
			Class638.anIntArray8307 = new int[65536];
			double d = 0.7 + (Math.random() * 0.03 - 0.015);
			for (int i_24_ = 0; i_24_ < 65536; i_24_++) {
				double d_25_ = 0.0078125 + (double) (i_24_ >> 10 & 0x3f) / 64.0;
				double d_26_ = 0.0625 + (double) (i_24_ >> 7 & 0x7) / 8.0;
				double d_27_ = (double) (i_24_ & 0x7f) / 128.0;
				double d_28_ = d_27_;
				double d_29_ = d_27_;
				double d_30_ = d_27_;
				if (0.0 != d_26_) {
					double d_31_;
					if (d_27_ < 0.5)
						d_31_ = d_27_ * (1.0 + d_26_);
					else
						d_31_ = d_26_ + d_27_ - d_26_ * d_27_;
					double d_32_ = 2.0 * d_27_ - d_31_;
					double d_33_ = d_25_ + 0.3333333333333333;
					if (d_33_ > 1.0)
						d_33_--;
					double d_34_ = d_25_;
					double d_35_ = d_25_ - 0.3333333333333333;
					if (d_35_ < 0.0)
						d_35_++;
					if (d_33_ * 6.0 < 1.0)
						d_28_ = d_32_ + 6.0 * (d_31_ - d_32_) * d_33_;
					else if (d_33_ * 2.0 < 1.0)
						d_28_ = d_31_;
					else if (d_33_ * 3.0 < 2.0)
						d_28_ = 6.0 * ((d_31_ - d_32_) * (0.6666666666666666 - d_33_)) + d_32_;
					else
						d_28_ = d_32_;
					if (d_34_ * 6.0 < 1.0)
						d_29_ = d_32_ + 6.0 * (d_31_ - d_32_) * d_34_;
					else if (2.0 * d_34_ < 1.0)
						d_29_ = d_31_;
					else if (d_34_ * 3.0 < 2.0)
						d_29_ = d_32_ + 6.0 * ((0.6666666666666666 - d_34_) * (d_31_ - d_32_));
					else
						d_29_ = d_32_;
					if (d_35_ * 6.0 < 1.0)
						d_30_ = d_32_ + 6.0 * (d_31_ - d_32_) * d_35_;
					else if (2.0 * d_35_ < 1.0)
						d_30_ = d_31_;
					else if (3.0 * d_35_ < 2.0)
						d_30_ = d_32_ + ((0.6666666666666666 - d_35_) * (d_31_ - d_32_) * 6.0);
					else
						d_30_ = d_32_;
				}
				d_28_ = Math.pow(d_28_, d);
				d_29_ = Math.pow(d_29_, d);
				d_30_ = Math.pow(d_30_, d);
				int i_36_ = (int) (256.0 * d_28_);
				int i_37_ = (int) (256.0 * d_29_);
				int i_38_ = (int) (256.0 * d_30_);
				int i_39_ = (i_37_ << 8) + (i_36_ << 16) + i_38_;
				Class710.anIntArray8839[i_24_] = i_39_ & 0xffffff;
				int i_40_ = (i_38_ << 16) + (i_37_ << 8) + i_36_;
				Class638.anIntArray8307[i_24_] = i_40_;
			}
		}
	}

	static final void method4919(Class669 class669, int i) {
		class669.aLongArray8561[(class669.anInt8562 += -2045027743) * 2056702369 - 1] = ((Long) (class669.aClass523_Sub27_Sub19_8580.anObjectArray11845[1180759405 * class669.anInt8579])).longValue();
	}

	static final void method4920(Class250 class250, Class242 class242, Class669 class669, byte i) {
		class250.anInt2565 = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]) * 1180833973;
		Class523_Sub14.method15991(class250, (byte) -97);
	}

	static final void method4921(Class669 class669, byte i) {
		class669.anInt8558 -= -17422498;
		int i_41_ = class669.anIntArray8557[1357652815 * class669.anInt8558];
		int i_42_ = class669.anIntArray8557[1 + 1357652815 * class669.anInt8558];
		String string = (String) (class669.anObjectArray8559[(class669.anInt8560 -= 1235970069) * 240723773]);
		if (i_41_ == 99)
			Class485.method7932(string, (byte) -15);
		else if (i_41_ == 98)
			Class500.method8122(string, 825317588);
		else
			Class515.method8593(i_41_, i_42_, "", "", "", string, null, -391008642);
	}

	static final void method4922(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class242 class242 = class677.aClass242_8637;
		Class523_Sub28.method16157(class250, class242, class669, (byte) 71);
	}

	static void method4923(byte i) {
		ItemsContainer.aClass209_10324.method3773(-2063739201);
	}

	static int method4924(Class523_Sub27_Sub6 class523_sub27_sub6, Class10 class10, int i) {
		String string = Class48.method1257(class523_sub27_sub6, -250134702);
		int[] is = Class209.method3809(class523_sub27_sub6, -746990576);
		if (null != is)
			string = new StringBuilder().append(string).append(Class163.method2593(is, 1792883890)).toString();
		int i_43_ = class10.method626(string, Class62.aClass148Array772, -1942791872);
		if (class523_sub27_sub6.aBool11636)
			i_43_ += Class707_Sub2.aClass148_10972.method2504() + 4;
		return i_43_;
	}
}
