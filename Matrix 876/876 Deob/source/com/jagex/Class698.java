/* Class698 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class698 {
	static void method14044(double[] ds, int i, double[] ds_0_, int i_1_, int i_2_) {
		if (ds == ds_0_) {
			if (i == i_1_)
				return;
			if (i_1_ > i && i_1_ < i + i_2_) {
				i_2_--;
				i += i_2_;
				i_1_ += i_2_;
				i_2_ = i - i_2_;
				i_2_ += 3;
				while (i >= i_2_) {
					ds_0_[i_1_--] = ds[i--];
					ds_0_[i_1_--] = ds[i--];
					ds_0_[i_1_--] = ds[i--];
					ds_0_[i_1_--] = ds[i--];
				}
				i_2_ -= 3;
				while (i >= i_2_)
					ds_0_[i_1_--] = ds[i--];
				return;
			}
		}
		i_2_ += i;
		i_2_ -= 3;
		while (i < i_2_) {
			ds_0_[i_1_++] = ds[i++];
			ds_0_[i_1_++] = ds[i++];
			ds_0_[i_1_++] = ds[i++];
			ds_0_[i_1_++] = ds[i++];
		}
		i_2_ += 3;
		while (i < i_2_)
			ds_0_[i_1_++] = ds[i++];
	}

	static void method14045(boolean[] bools, int i, boolean[] bools_3_, int i_4_, int i_5_) {
		if (bools == bools_3_) {
			if (i == i_4_)
				return;
			if (i_4_ > i && i_4_ < i + i_5_) {
				i_5_--;
				i += i_5_;
				i_4_ += i_5_;
				i_5_ = i - i_5_;
				i_5_ += 7;
				while (i >= i_5_) {
					bools_3_[i_4_--] = bools[i--];
					bools_3_[i_4_--] = bools[i--];
					bools_3_[i_4_--] = bools[i--];
					bools_3_[i_4_--] = bools[i--];
					bools_3_[i_4_--] = bools[i--];
					bools_3_[i_4_--] = bools[i--];
					bools_3_[i_4_--] = bools[i--];
					bools_3_[i_4_--] = bools[i--];
				}
				i_5_ -= 7;
				while (i >= i_5_)
					bools_3_[i_4_--] = bools[i--];
				return;
			}
		}
		i_5_ += i;
		i_5_ -= 7;
		while (i < i_5_) {
			bools_3_[i_4_++] = bools[i++];
			bools_3_[i_4_++] = bools[i++];
			bools_3_[i_4_++] = bools[i++];
			bools_3_[i_4_++] = bools[i++];
			bools_3_[i_4_++] = bools[i++];
			bools_3_[i_4_++] = bools[i++];
			bools_3_[i_4_++] = bools[i++];
			bools_3_[i_4_++] = bools[i++];
		}
		i_5_ += 7;
		while (i < i_5_)
			bools_3_[i_4_++] = bools[i++];
	}

	static void method14046(short[] is, int i, short[] is_6_, int i_7_, int i_8_) {
		if (is == is_6_) {
			if (i == i_7_)
				return;
			if (i_7_ > i && i_7_ < i + i_8_) {
				i_8_--;
				i += i_8_;
				i_7_ += i_8_;
				i_8_ = i - i_8_;
				i_8_ += 7;
				while (i >= i_8_) {
					is_6_[i_7_--] = is[i--];
					is_6_[i_7_--] = is[i--];
					is_6_[i_7_--] = is[i--];
					is_6_[i_7_--] = is[i--];
					is_6_[i_7_--] = is[i--];
					is_6_[i_7_--] = is[i--];
					is_6_[i_7_--] = is[i--];
					is_6_[i_7_--] = is[i--];
				}
				i_8_ -= 7;
				while (i >= i_8_)
					is_6_[i_7_--] = is[i--];
				return;
			}
		}
		i_8_ += i;
		i_8_ -= 7;
		while (i < i_8_) {
			is_6_[i_7_++] = is[i++];
			is_6_[i_7_++] = is[i++];
			is_6_[i_7_++] = is[i++];
			is_6_[i_7_++] = is[i++];
			is_6_[i_7_++] = is[i++];
			is_6_[i_7_++] = is[i++];
			is_6_[i_7_++] = is[i++];
			is_6_[i_7_++] = is[i++];
		}
		i_8_ += 7;
		while (i < i_8_)
			is_6_[i_7_++] = is[i++];
	}

	static void method14047(short[] is, int i, short[] is_9_, int i_10_, int i_11_) {
		if (is == is_9_) {
			if (i == i_10_)
				return;
			if (i_10_ > i && i_10_ < i + i_11_) {
				i_11_--;
				i += i_11_;
				i_10_ += i_11_;
				i_11_ = i - i_11_;
				i_11_ += 7;
				while (i >= i_11_) {
					is_9_[i_10_--] = is[i--];
					is_9_[i_10_--] = is[i--];
					is_9_[i_10_--] = is[i--];
					is_9_[i_10_--] = is[i--];
					is_9_[i_10_--] = is[i--];
					is_9_[i_10_--] = is[i--];
					is_9_[i_10_--] = is[i--];
					is_9_[i_10_--] = is[i--];
				}
				i_11_ -= 7;
				while (i >= i_11_)
					is_9_[i_10_--] = is[i--];
				return;
			}
		}
		i_11_ += i;
		i_11_ -= 7;
		while (i < i_11_) {
			is_9_[i_10_++] = is[i++];
			is_9_[i_10_++] = is[i++];
			is_9_[i_10_++] = is[i++];
			is_9_[i_10_++] = is[i++];
			is_9_[i_10_++] = is[i++];
			is_9_[i_10_++] = is[i++];
			is_9_[i_10_++] = is[i++];
			is_9_[i_10_++] = is[i++];
		}
		i_11_ += 7;
		while (i < i_11_)
			is_9_[i_10_++] = is[i++];
	}

	public static void method14048(int[] is, int i, int i_12_, int i_13_) {
		i_12_ = i + i_12_ - 7;
		while (i < i_12_) {
			is[i++] = i_13_;
			is[i++] = i_13_;
			is[i++] = i_13_;
			is[i++] = i_13_;
			is[i++] = i_13_;
			is[i++] = i_13_;
			is[i++] = i_13_;
			is[i++] = i_13_;
		}
		i_12_ += 7;
		while (i < i_12_)
			is[i++] = i_13_;
	}

	static void method14049(long[] ls, int i, long[] ls_14_, int i_15_, int i_16_) {
		if (ls == ls_14_) {
			if (i == i_15_)
				return;
			if (i_15_ > i && i_15_ < i + i_16_) {
				i_16_--;
				i += i_16_;
				i_15_ += i_16_;
				i_16_ = i - i_16_;
				i_16_ += 3;
				while (i >= i_16_) {
					ls_14_[i_15_--] = ls[i--];
					ls_14_[i_15_--] = ls[i--];
					ls_14_[i_15_--] = ls[i--];
					ls_14_[i_15_--] = ls[i--];
				}
				i_16_ -= 3;
				while (i >= i_16_)
					ls_14_[i_15_--] = ls[i--];
				return;
			}
		}
		i_16_ += i;
		i_16_ -= 3;
		while (i < i_16_) {
			ls_14_[i_15_++] = ls[i++];
			ls_14_[i_15_++] = ls[i++];
			ls_14_[i_15_++] = ls[i++];
			ls_14_[i_15_++] = ls[i++];
		}
		i_16_ += 3;
		while (i < i_16_)
			ls_14_[i_15_++] = ls[i++];
	}

	public static void method14050(float[] fs, int i, float[] fs_17_, int i_18_, int i_19_) {
		if (fs == fs_17_) {
			if (i == i_18_)
				return;
			if (i_18_ > i && i_18_ < i + i_19_) {
				i_19_--;
				i += i_19_;
				i_18_ += i_19_;
				i_19_ = i - i_19_;
				i_19_ += 7;
				while (i >= i_19_) {
					fs_17_[i_18_--] = fs[i--];
					fs_17_[i_18_--] = fs[i--];
					fs_17_[i_18_--] = fs[i--];
					fs_17_[i_18_--] = fs[i--];
					fs_17_[i_18_--] = fs[i--];
					fs_17_[i_18_--] = fs[i--];
					fs_17_[i_18_--] = fs[i--];
					fs_17_[i_18_--] = fs[i--];
				}
				i_19_ -= 7;
				while (i >= i_19_)
					fs_17_[i_18_--] = fs[i--];
				return;
			}
		}
		i_19_ += i;
		i_19_ -= 7;
		while (i < i_19_) {
			fs_17_[i_18_++] = fs[i++];
			fs_17_[i_18_++] = fs[i++];
			fs_17_[i_18_++] = fs[i++];
			fs_17_[i_18_++] = fs[i++];
			fs_17_[i_18_++] = fs[i++];
			fs_17_[i_18_++] = fs[i++];
			fs_17_[i_18_++] = fs[i++];
			fs_17_[i_18_++] = fs[i++];
		}
		i_19_ += 7;
		while (i < i_19_)
			fs_17_[i_18_++] = fs[i++];
	}

	Class698() throws Throwable {
		throw new Error();
	}

	static void method14051(boolean[] bools, int i, boolean[] bools_20_, int i_21_, int i_22_) {
		if (bools == bools_20_) {
			if (i == i_21_)
				return;
			if (i_21_ > i && i_21_ < i + i_22_) {
				i_22_--;
				i += i_22_;
				i_21_ += i_22_;
				i_22_ = i - i_22_;
				i_22_ += 7;
				while (i >= i_22_) {
					bools_20_[i_21_--] = bools[i--];
					bools_20_[i_21_--] = bools[i--];
					bools_20_[i_21_--] = bools[i--];
					bools_20_[i_21_--] = bools[i--];
					bools_20_[i_21_--] = bools[i--];
					bools_20_[i_21_--] = bools[i--];
					bools_20_[i_21_--] = bools[i--];
					bools_20_[i_21_--] = bools[i--];
				}
				i_22_ -= 7;
				while (i >= i_22_)
					bools_20_[i_21_--] = bools[i--];
				return;
			}
		}
		i_22_ += i;
		i_22_ -= 7;
		while (i < i_22_) {
			bools_20_[i_21_++] = bools[i++];
			bools_20_[i_21_++] = bools[i++];
			bools_20_[i_21_++] = bools[i++];
			bools_20_[i_21_++] = bools[i++];
			bools_20_[i_21_++] = bools[i++];
			bools_20_[i_21_++] = bools[i++];
			bools_20_[i_21_++] = bools[i++];
			bools_20_[i_21_++] = bools[i++];
		}
		i_22_ += 7;
		while (i < i_22_)
			bools_20_[i_21_++] = bools[i++];
	}

	public static void method14052(Object[] objects, int i, Object[] objects_23_, int i_24_, int i_25_) {
		if (objects == objects_23_) {
			if (i == i_24_)
				return;
			if (i_24_ > i && i_24_ < i + i_25_) {
				i_25_--;
				i += i_25_;
				i_24_ += i_25_;
				i_25_ = i - i_25_;
				i_25_ += 7;
				while (i >= i_25_) {
					objects_23_[i_24_--] = objects[i--];
					objects_23_[i_24_--] = objects[i--];
					objects_23_[i_24_--] = objects[i--];
					objects_23_[i_24_--] = objects[i--];
					objects_23_[i_24_--] = objects[i--];
					objects_23_[i_24_--] = objects[i--];
					objects_23_[i_24_--] = objects[i--];
					objects_23_[i_24_--] = objects[i--];
				}
				i_25_ -= 7;
				while (i >= i_25_)
					objects_23_[i_24_--] = objects[i--];
				return;
			}
		}
		i_25_ += i;
		i_25_ -= 7;
		while (i < i_25_) {
			objects_23_[i_24_++] = objects[i++];
			objects_23_[i_24_++] = objects[i++];
			objects_23_[i_24_++] = objects[i++];
			objects_23_[i_24_++] = objects[i++];
			objects_23_[i_24_++] = objects[i++];
			objects_23_[i_24_++] = objects[i++];
			objects_23_[i_24_++] = objects[i++];
			objects_23_[i_24_++] = objects[i++];
		}
		i_25_ += 7;
		while (i < i_25_)
			objects_23_[i_24_++] = objects[i++];
	}

	public static void method14053(int[] is, int i, int i_26_, int i_27_) {
		i_26_ = i + i_26_ - 7;
		while (i < i_26_) {
			is[i++] = i_27_;
			is[i++] = i_27_;
			is[i++] = i_27_;
			is[i++] = i_27_;
			is[i++] = i_27_;
			is[i++] = i_27_;
			is[i++] = i_27_;
			is[i++] = i_27_;
		}
		i_26_ += 7;
		while (i < i_26_)
			is[i++] = i_27_;
	}

	static void method14054(boolean[] bools, int i, boolean[] bools_28_, int i_29_, int i_30_) {
		if (bools == bools_28_) {
			if (i == i_29_)
				return;
			if (i_29_ > i && i_29_ < i + i_30_) {
				i_30_--;
				i += i_30_;
				i_29_ += i_30_;
				i_30_ = i - i_30_;
				i_30_ += 7;
				while (i >= i_30_) {
					bools_28_[i_29_--] = bools[i--];
					bools_28_[i_29_--] = bools[i--];
					bools_28_[i_29_--] = bools[i--];
					bools_28_[i_29_--] = bools[i--];
					bools_28_[i_29_--] = bools[i--];
					bools_28_[i_29_--] = bools[i--];
					bools_28_[i_29_--] = bools[i--];
					bools_28_[i_29_--] = bools[i--];
				}
				i_30_ -= 7;
				while (i >= i_30_)
					bools_28_[i_29_--] = bools[i--];
				return;
			}
		}
		i_30_ += i;
		i_30_ -= 7;
		while (i < i_30_) {
			bools_28_[i_29_++] = bools[i++];
			bools_28_[i_29_++] = bools[i++];
			bools_28_[i_29_++] = bools[i++];
			bools_28_[i_29_++] = bools[i++];
			bools_28_[i_29_++] = bools[i++];
			bools_28_[i_29_++] = bools[i++];
			bools_28_[i_29_++] = bools[i++];
			bools_28_[i_29_++] = bools[i++];
		}
		i_30_ += 7;
		while (i < i_30_)
			bools_28_[i_29_++] = bools[i++];
	}

	static void method14055(byte[] is, int i, byte[] is_31_, int i_32_, int i_33_) {
		if (is == is_31_) {
			if (i == i_32_)
				return;
			if (i_32_ > i && i_32_ < i + i_33_) {
				i_33_--;
				i += i_33_;
				i_32_ += i_33_;
				i_33_ = i - i_33_;
				i_33_ += 7;
				while (i >= i_33_) {
					is_31_[i_32_--] = is[i--];
					is_31_[i_32_--] = is[i--];
					is_31_[i_32_--] = is[i--];
					is_31_[i_32_--] = is[i--];
					is_31_[i_32_--] = is[i--];
					is_31_[i_32_--] = is[i--];
					is_31_[i_32_--] = is[i--];
					is_31_[i_32_--] = is[i--];
				}
				i_33_ -= 7;
				while (i >= i_33_)
					is_31_[i_32_--] = is[i--];
				return;
			}
		}
		i_33_ += i;
		i_33_ -= 7;
		while (i < i_33_) {
			is_31_[i_32_++] = is[i++];
			is_31_[i_32_++] = is[i++];
			is_31_[i_32_++] = is[i++];
			is_31_[i_32_++] = is[i++];
			is_31_[i_32_++] = is[i++];
			is_31_[i_32_++] = is[i++];
			is_31_[i_32_++] = is[i++];
			is_31_[i_32_++] = is[i++];
		}
		i_33_ += 7;
		while (i < i_33_)
			is_31_[i_32_++] = is[i++];
	}

	static void method14056(byte[] is, int i, byte[] is_34_, int i_35_, int i_36_) {
		if (is == is_34_) {
			if (i == i_35_)
				return;
			if (i_35_ > i && i_35_ < i + i_36_) {
				i_36_--;
				i += i_36_;
				i_35_ += i_36_;
				i_36_ = i - i_36_;
				i_36_ += 7;
				while (i >= i_36_) {
					is_34_[i_35_--] = is[i--];
					is_34_[i_35_--] = is[i--];
					is_34_[i_35_--] = is[i--];
					is_34_[i_35_--] = is[i--];
					is_34_[i_35_--] = is[i--];
					is_34_[i_35_--] = is[i--];
					is_34_[i_35_--] = is[i--];
					is_34_[i_35_--] = is[i--];
				}
				i_36_ -= 7;
				while (i >= i_36_)
					is_34_[i_35_--] = is[i--];
				return;
			}
		}
		i_36_ += i;
		i_36_ -= 7;
		while (i < i_36_) {
			is_34_[i_35_++] = is[i++];
			is_34_[i_35_++] = is[i++];
			is_34_[i_35_++] = is[i++];
			is_34_[i_35_++] = is[i++];
			is_34_[i_35_++] = is[i++];
			is_34_[i_35_++] = is[i++];
			is_34_[i_35_++] = is[i++];
			is_34_[i_35_++] = is[i++];
		}
		i_36_ += 7;
		while (i < i_36_)
			is_34_[i_35_++] = is[i++];
	}

	static void method14057(byte[] is, int i, byte[] is_37_, int i_38_, int i_39_) {
		if (is == is_37_) {
			if (i == i_38_)
				return;
			if (i_38_ > i && i_38_ < i + i_39_) {
				i_39_--;
				i += i_39_;
				i_38_ += i_39_;
				i_39_ = i - i_39_;
				i_39_ += 7;
				while (i >= i_39_) {
					is_37_[i_38_--] = is[i--];
					is_37_[i_38_--] = is[i--];
					is_37_[i_38_--] = is[i--];
					is_37_[i_38_--] = is[i--];
					is_37_[i_38_--] = is[i--];
					is_37_[i_38_--] = is[i--];
					is_37_[i_38_--] = is[i--];
					is_37_[i_38_--] = is[i--];
				}
				i_39_ -= 7;
				while (i >= i_39_)
					is_37_[i_38_--] = is[i--];
				return;
			}
		}
		i_39_ += i;
		i_39_ -= 7;
		while (i < i_39_) {
			is_37_[i_38_++] = is[i++];
			is_37_[i_38_++] = is[i++];
			is_37_[i_38_++] = is[i++];
			is_37_[i_38_++] = is[i++];
			is_37_[i_38_++] = is[i++];
			is_37_[i_38_++] = is[i++];
			is_37_[i_38_++] = is[i++];
			is_37_[i_38_++] = is[i++];
		}
		i_39_ += 7;
		while (i < i_39_)
			is_37_[i_38_++] = is[i++];
	}

	public static void method14058(int[] is, int i, int[] is_40_, int i_41_, int i_42_) {
		if (is == is_40_) {
			if (i == i_41_)
				return;
			if (i_41_ > i && i_41_ < i + i_42_) {
				i_42_--;
				i += i_42_;
				i_41_ += i_42_;
				i_42_ = i - i_42_;
				i_42_ += 7;
				while (i >= i_42_) {
					is_40_[i_41_--] = is[i--];
					is_40_[i_41_--] = is[i--];
					is_40_[i_41_--] = is[i--];
					is_40_[i_41_--] = is[i--];
					is_40_[i_41_--] = is[i--];
					is_40_[i_41_--] = is[i--];
					is_40_[i_41_--] = is[i--];
					is_40_[i_41_--] = is[i--];
				}
				i_42_ -= 7;
				while (i >= i_42_)
					is_40_[i_41_--] = is[i--];
				return;
			}
		}
		i_42_ += i;
		i_42_ -= 7;
		while (i < i_42_) {
			is_40_[i_41_++] = is[i++];
			is_40_[i_41_++] = is[i++];
			is_40_[i_41_++] = is[i++];
			is_40_[i_41_++] = is[i++];
			is_40_[i_41_++] = is[i++];
			is_40_[i_41_++] = is[i++];
			is_40_[i_41_++] = is[i++];
			is_40_[i_41_++] = is[i++];
		}
		i_42_ += 7;
		while (i < i_42_)
			is_40_[i_41_++] = is[i++];
	}

	static void method14059(byte[] is, int i, byte[] is_43_, int i_44_, int i_45_) {
		if (is == is_43_) {
			if (i == i_44_)
				return;
			if (i_44_ > i && i_44_ < i + i_45_) {
				i_45_--;
				i += i_45_;
				i_44_ += i_45_;
				i_45_ = i - i_45_;
				i_45_ += 7;
				while (i >= i_45_) {
					is_43_[i_44_--] = is[i--];
					is_43_[i_44_--] = is[i--];
					is_43_[i_44_--] = is[i--];
					is_43_[i_44_--] = is[i--];
					is_43_[i_44_--] = is[i--];
					is_43_[i_44_--] = is[i--];
					is_43_[i_44_--] = is[i--];
					is_43_[i_44_--] = is[i--];
				}
				i_45_ -= 7;
				while (i >= i_45_)
					is_43_[i_44_--] = is[i--];
				return;
			}
		}
		i_45_ += i;
		i_45_ -= 7;
		while (i < i_45_) {
			is_43_[i_44_++] = is[i++];
			is_43_[i_44_++] = is[i++];
			is_43_[i_44_++] = is[i++];
			is_43_[i_44_++] = is[i++];
			is_43_[i_44_++] = is[i++];
			is_43_[i_44_++] = is[i++];
			is_43_[i_44_++] = is[i++];
			is_43_[i_44_++] = is[i++];
		}
		i_45_ += 7;
		while (i < i_45_)
			is_43_[i_44_++] = is[i++];
	}

	static void method14060(short[] is, int i, short[] is_46_, int i_47_, int i_48_) {
		if (is == is_46_) {
			if (i == i_47_)
				return;
			if (i_47_ > i && i_47_ < i + i_48_) {
				i_48_--;
				i += i_48_;
				i_47_ += i_48_;
				i_48_ = i - i_48_;
				i_48_ += 7;
				while (i >= i_48_) {
					is_46_[i_47_--] = is[i--];
					is_46_[i_47_--] = is[i--];
					is_46_[i_47_--] = is[i--];
					is_46_[i_47_--] = is[i--];
					is_46_[i_47_--] = is[i--];
					is_46_[i_47_--] = is[i--];
					is_46_[i_47_--] = is[i--];
					is_46_[i_47_--] = is[i--];
				}
				i_48_ -= 7;
				while (i >= i_48_)
					is_46_[i_47_--] = is[i--];
				return;
			}
		}
		i_48_ += i;
		i_48_ -= 7;
		while (i < i_48_) {
			is_46_[i_47_++] = is[i++];
			is_46_[i_47_++] = is[i++];
			is_46_[i_47_++] = is[i++];
			is_46_[i_47_++] = is[i++];
			is_46_[i_47_++] = is[i++];
			is_46_[i_47_++] = is[i++];
			is_46_[i_47_++] = is[i++];
			is_46_[i_47_++] = is[i++];
		}
		i_48_ += 7;
		while (i < i_48_)
			is_46_[i_47_++] = is[i++];
	}

	static void method14061(char[] cs, int i, char[] cs_49_, int i_50_, int i_51_) {
		if (cs == cs_49_) {
			if (i == i_50_)
				return;
			if (i_50_ > i && i_50_ < i + i_51_) {
				i_51_--;
				i += i_51_;
				i_50_ += i_51_;
				i_51_ = i - i_51_;
				i_51_ += 7;
				while (i >= i_51_) {
					cs_49_[i_50_--] = cs[i--];
					cs_49_[i_50_--] = cs[i--];
					cs_49_[i_50_--] = cs[i--];
					cs_49_[i_50_--] = cs[i--];
					cs_49_[i_50_--] = cs[i--];
					cs_49_[i_50_--] = cs[i--];
					cs_49_[i_50_--] = cs[i--];
					cs_49_[i_50_--] = cs[i--];
				}
				i_51_ -= 7;
				while (i >= i_51_)
					cs_49_[i_50_--] = cs[i--];
				return;
			}
		}
		i_51_ += i;
		i_51_ -= 7;
		while (i < i_51_) {
			cs_49_[i_50_++] = cs[i++];
			cs_49_[i_50_++] = cs[i++];
			cs_49_[i_50_++] = cs[i++];
			cs_49_[i_50_++] = cs[i++];
			cs_49_[i_50_++] = cs[i++];
			cs_49_[i_50_++] = cs[i++];
			cs_49_[i_50_++] = cs[i++];
			cs_49_[i_50_++] = cs[i++];
		}
		i_51_ += 7;
		while (i < i_51_)
			cs_49_[i_50_++] = cs[i++];
	}

	static void method14062(char[] cs, int i, char[] cs_52_, int i_53_, int i_54_) {
		if (cs == cs_52_) {
			if (i == i_53_)
				return;
			if (i_53_ > i && i_53_ < i + i_54_) {
				i_54_--;
				i += i_54_;
				i_53_ += i_54_;
				i_54_ = i - i_54_;
				i_54_ += 7;
				while (i >= i_54_) {
					cs_52_[i_53_--] = cs[i--];
					cs_52_[i_53_--] = cs[i--];
					cs_52_[i_53_--] = cs[i--];
					cs_52_[i_53_--] = cs[i--];
					cs_52_[i_53_--] = cs[i--];
					cs_52_[i_53_--] = cs[i--];
					cs_52_[i_53_--] = cs[i--];
					cs_52_[i_53_--] = cs[i--];
				}
				i_54_ -= 7;
				while (i >= i_54_)
					cs_52_[i_53_--] = cs[i--];
				return;
			}
		}
		i_54_ += i;
		i_54_ -= 7;
		while (i < i_54_) {
			cs_52_[i_53_++] = cs[i++];
			cs_52_[i_53_++] = cs[i++];
			cs_52_[i_53_++] = cs[i++];
			cs_52_[i_53_++] = cs[i++];
			cs_52_[i_53_++] = cs[i++];
			cs_52_[i_53_++] = cs[i++];
			cs_52_[i_53_++] = cs[i++];
			cs_52_[i_53_++] = cs[i++];
		}
		i_54_ += 7;
		while (i < i_54_)
			cs_52_[i_53_++] = cs[i++];
	}

	public static void method14063(int[] is, int i, int[] is_55_, int i_56_, int i_57_) {
		if (is == is_55_) {
			if (i == i_56_)
				return;
			if (i_56_ > i && i_56_ < i + i_57_) {
				i_57_--;
				i += i_57_;
				i_56_ += i_57_;
				i_57_ = i - i_57_;
				i_57_ += 7;
				while (i >= i_57_) {
					is_55_[i_56_--] = is[i--];
					is_55_[i_56_--] = is[i--];
					is_55_[i_56_--] = is[i--];
					is_55_[i_56_--] = is[i--];
					is_55_[i_56_--] = is[i--];
					is_55_[i_56_--] = is[i--];
					is_55_[i_56_--] = is[i--];
					is_55_[i_56_--] = is[i--];
				}
				i_57_ -= 7;
				while (i >= i_57_)
					is_55_[i_56_--] = is[i--];
				return;
			}
		}
		i_57_ += i;
		i_57_ -= 7;
		while (i < i_57_) {
			is_55_[i_56_++] = is[i++];
			is_55_[i_56_++] = is[i++];
			is_55_[i_56_++] = is[i++];
			is_55_[i_56_++] = is[i++];
			is_55_[i_56_++] = is[i++];
			is_55_[i_56_++] = is[i++];
			is_55_[i_56_++] = is[i++];
			is_55_[i_56_++] = is[i++];
		}
		i_57_ += 7;
		while (i < i_57_)
			is_55_[i_56_++] = is[i++];
	}

	static void method14064(long[] ls, int i, long[] ls_58_, int i_59_, int i_60_) {
		if (ls == ls_58_) {
			if (i == i_59_)
				return;
			if (i_59_ > i && i_59_ < i + i_60_) {
				i_60_--;
				i += i_60_;
				i_59_ += i_60_;
				i_60_ = i - i_60_;
				i_60_ += 3;
				while (i >= i_60_) {
					ls_58_[i_59_--] = ls[i--];
					ls_58_[i_59_--] = ls[i--];
					ls_58_[i_59_--] = ls[i--];
					ls_58_[i_59_--] = ls[i--];
				}
				i_60_ -= 3;
				while (i >= i_60_)
					ls_58_[i_59_--] = ls[i--];
				return;
			}
		}
		i_60_ += i;
		i_60_ -= 3;
		while (i < i_60_) {
			ls_58_[i_59_++] = ls[i++];
			ls_58_[i_59_++] = ls[i++];
			ls_58_[i_59_++] = ls[i++];
			ls_58_[i_59_++] = ls[i++];
		}
		i_60_ += 3;
		while (i < i_60_)
			ls_58_[i_59_++] = ls[i++];
	}

	static void method14065(long[] ls, int i, long[] ls_61_, int i_62_, int i_63_) {
		if (ls == ls_61_) {
			if (i == i_62_)
				return;
			if (i_62_ > i && i_62_ < i + i_63_) {
				i_63_--;
				i += i_63_;
				i_62_ += i_63_;
				i_63_ = i - i_63_;
				i_63_ += 3;
				while (i >= i_63_) {
					ls_61_[i_62_--] = ls[i--];
					ls_61_[i_62_--] = ls[i--];
					ls_61_[i_62_--] = ls[i--];
					ls_61_[i_62_--] = ls[i--];
				}
				i_63_ -= 3;
				while (i >= i_63_)
					ls_61_[i_62_--] = ls[i--];
				return;
			}
		}
		i_63_ += i;
		i_63_ -= 3;
		while (i < i_63_) {
			ls_61_[i_62_++] = ls[i++];
			ls_61_[i_62_++] = ls[i++];
			ls_61_[i_62_++] = ls[i++];
			ls_61_[i_62_++] = ls[i++];
		}
		i_63_ += 3;
		while (i < i_63_)
			ls_61_[i_62_++] = ls[i++];
	}

	static void method14066(char[] cs, int i, char[] cs_64_, int i_65_, int i_66_) {
		if (cs == cs_64_) {
			if (i == i_65_)
				return;
			if (i_65_ > i && i_65_ < i + i_66_) {
				i_66_--;
				i += i_66_;
				i_65_ += i_66_;
				i_66_ = i - i_66_;
				i_66_ += 7;
				while (i >= i_66_) {
					cs_64_[i_65_--] = cs[i--];
					cs_64_[i_65_--] = cs[i--];
					cs_64_[i_65_--] = cs[i--];
					cs_64_[i_65_--] = cs[i--];
					cs_64_[i_65_--] = cs[i--];
					cs_64_[i_65_--] = cs[i--];
					cs_64_[i_65_--] = cs[i--];
					cs_64_[i_65_--] = cs[i--];
				}
				i_66_ -= 7;
				while (i >= i_66_)
					cs_64_[i_65_--] = cs[i--];
				return;
			}
		}
		i_66_ += i;
		i_66_ -= 7;
		while (i < i_66_) {
			cs_64_[i_65_++] = cs[i++];
			cs_64_[i_65_++] = cs[i++];
			cs_64_[i_65_++] = cs[i++];
			cs_64_[i_65_++] = cs[i++];
			cs_64_[i_65_++] = cs[i++];
			cs_64_[i_65_++] = cs[i++];
			cs_64_[i_65_++] = cs[i++];
			cs_64_[i_65_++] = cs[i++];
		}
		i_66_ += 7;
		while (i < i_66_)
			cs_64_[i_65_++] = cs[i++];
	}

	public static void method14067(float[] fs, int i, float[] fs_67_, int i_68_, int i_69_) {
		if (fs == fs_67_) {
			if (i == i_68_)
				return;
			if (i_68_ > i && i_68_ < i + i_69_) {
				i_69_--;
				i += i_69_;
				i_68_ += i_69_;
				i_69_ = i - i_69_;
				i_69_ += 7;
				while (i >= i_69_) {
					fs_67_[i_68_--] = fs[i--];
					fs_67_[i_68_--] = fs[i--];
					fs_67_[i_68_--] = fs[i--];
					fs_67_[i_68_--] = fs[i--];
					fs_67_[i_68_--] = fs[i--];
					fs_67_[i_68_--] = fs[i--];
					fs_67_[i_68_--] = fs[i--];
					fs_67_[i_68_--] = fs[i--];
				}
				i_69_ -= 7;
				while (i >= i_69_)
					fs_67_[i_68_--] = fs[i--];
				return;
			}
		}
		i_69_ += i;
		i_69_ -= 7;
		while (i < i_69_) {
			fs_67_[i_68_++] = fs[i++];
			fs_67_[i_68_++] = fs[i++];
			fs_67_[i_68_++] = fs[i++];
			fs_67_[i_68_++] = fs[i++];
			fs_67_[i_68_++] = fs[i++];
			fs_67_[i_68_++] = fs[i++];
			fs_67_[i_68_++] = fs[i++];
			fs_67_[i_68_++] = fs[i++];
		}
		i_69_ += 7;
		while (i < i_69_)
			fs_67_[i_68_++] = fs[i++];
	}

	static void method14068(double[] ds, int i, double[] ds_70_, int i_71_, int i_72_) {
		if (ds == ds_70_) {
			if (i == i_71_)
				return;
			if (i_71_ > i && i_71_ < i + i_72_) {
				i_72_--;
				i += i_72_;
				i_71_ += i_72_;
				i_72_ = i - i_72_;
				i_72_ += 3;
				while (i >= i_72_) {
					ds_70_[i_71_--] = ds[i--];
					ds_70_[i_71_--] = ds[i--];
					ds_70_[i_71_--] = ds[i--];
					ds_70_[i_71_--] = ds[i--];
				}
				i_72_ -= 3;
				while (i >= i_72_)
					ds_70_[i_71_--] = ds[i--];
				return;
			}
		}
		i_72_ += i;
		i_72_ -= 3;
		while (i < i_72_) {
			ds_70_[i_71_++] = ds[i++];
			ds_70_[i_71_++] = ds[i++];
			ds_70_[i_71_++] = ds[i++];
			ds_70_[i_71_++] = ds[i++];
		}
		i_72_ += 3;
		while (i < i_72_)
			ds_70_[i_71_++] = ds[i++];
	}

	static void method14069(double[] ds, int i, double[] ds_73_, int i_74_, int i_75_) {
		if (ds == ds_73_) {
			if (i == i_74_)
				return;
			if (i_74_ > i && i_74_ < i + i_75_) {
				i_75_--;
				i += i_75_;
				i_74_ += i_75_;
				i_75_ = i - i_75_;
				i_75_ += 3;
				while (i >= i_75_) {
					ds_73_[i_74_--] = ds[i--];
					ds_73_[i_74_--] = ds[i--];
					ds_73_[i_74_--] = ds[i--];
					ds_73_[i_74_--] = ds[i--];
				}
				i_75_ -= 3;
				while (i >= i_75_)
					ds_73_[i_74_--] = ds[i--];
				return;
			}
		}
		i_75_ += i;
		i_75_ -= 3;
		while (i < i_75_) {
			ds_73_[i_74_++] = ds[i++];
			ds_73_[i_74_++] = ds[i++];
			ds_73_[i_74_++] = ds[i++];
			ds_73_[i_74_++] = ds[i++];
		}
		i_75_ += 3;
		while (i < i_75_)
			ds_73_[i_74_++] = ds[i++];
	}

	static void method14070(boolean[] bools, int i, boolean[] bools_76_, int i_77_, int i_78_) {
		if (bools == bools_76_) {
			if (i == i_77_)
				return;
			if (i_77_ > i && i_77_ < i + i_78_) {
				i_78_--;
				i += i_78_;
				i_77_ += i_78_;
				i_78_ = i - i_78_;
				i_78_ += 7;
				while (i >= i_78_) {
					bools_76_[i_77_--] = bools[i--];
					bools_76_[i_77_--] = bools[i--];
					bools_76_[i_77_--] = bools[i--];
					bools_76_[i_77_--] = bools[i--];
					bools_76_[i_77_--] = bools[i--];
					bools_76_[i_77_--] = bools[i--];
					bools_76_[i_77_--] = bools[i--];
					bools_76_[i_77_--] = bools[i--];
				}
				i_78_ -= 7;
				while (i >= i_78_)
					bools_76_[i_77_--] = bools[i--];
				return;
			}
		}
		i_78_ += i;
		i_78_ -= 7;
		while (i < i_78_) {
			bools_76_[i_77_++] = bools[i++];
			bools_76_[i_77_++] = bools[i++];
			bools_76_[i_77_++] = bools[i++];
			bools_76_[i_77_++] = bools[i++];
			bools_76_[i_77_++] = bools[i++];
			bools_76_[i_77_++] = bools[i++];
			bools_76_[i_77_++] = bools[i++];
			bools_76_[i_77_++] = bools[i++];
		}
		i_78_ += 7;
		while (i < i_78_)
			bools_76_[i_77_++] = bools[i++];
	}

	static void method14071(byte[] is, int i, byte[] is_79_, int i_80_, int i_81_) {
		if (is == is_79_) {
			if (i == i_80_)
				return;
			if (i_80_ > i && i_80_ < i + i_81_) {
				i_81_--;
				i += i_81_;
				i_80_ += i_81_;
				i_81_ = i - i_81_;
				i_81_ += 7;
				while (i >= i_81_) {
					is_79_[i_80_--] = is[i--];
					is_79_[i_80_--] = is[i--];
					is_79_[i_80_--] = is[i--];
					is_79_[i_80_--] = is[i--];
					is_79_[i_80_--] = is[i--];
					is_79_[i_80_--] = is[i--];
					is_79_[i_80_--] = is[i--];
					is_79_[i_80_--] = is[i--];
				}
				i_81_ -= 7;
				while (i >= i_81_)
					is_79_[i_80_--] = is[i--];
				return;
			}
		}
		i_81_ += i;
		i_81_ -= 7;
		while (i < i_81_) {
			is_79_[i_80_++] = is[i++];
			is_79_[i_80_++] = is[i++];
			is_79_[i_80_++] = is[i++];
			is_79_[i_80_++] = is[i++];
			is_79_[i_80_++] = is[i++];
			is_79_[i_80_++] = is[i++];
			is_79_[i_80_++] = is[i++];
			is_79_[i_80_++] = is[i++];
		}
		i_81_ += 7;
		while (i < i_81_)
			is_79_[i_80_++] = is[i++];
	}

	static void method14072(short[] is, int i, short[] is_82_, int i_83_, int i_84_) {
		if (is == is_82_) {
			if (i == i_83_)
				return;
			if (i_83_ > i && i_83_ < i + i_84_) {
				i_84_--;
				i += i_84_;
				i_83_ += i_84_;
				i_84_ = i - i_84_;
				i_84_ += 7;
				while (i >= i_84_) {
					is_82_[i_83_--] = is[i--];
					is_82_[i_83_--] = is[i--];
					is_82_[i_83_--] = is[i--];
					is_82_[i_83_--] = is[i--];
					is_82_[i_83_--] = is[i--];
					is_82_[i_83_--] = is[i--];
					is_82_[i_83_--] = is[i--];
					is_82_[i_83_--] = is[i--];
				}
				i_84_ -= 7;
				while (i >= i_84_)
					is_82_[i_83_--] = is[i--];
				return;
			}
		}
		i_84_ += i;
		i_84_ -= 7;
		while (i < i_84_) {
			is_82_[i_83_++] = is[i++];
			is_82_[i_83_++] = is[i++];
			is_82_[i_83_++] = is[i++];
			is_82_[i_83_++] = is[i++];
			is_82_[i_83_++] = is[i++];
			is_82_[i_83_++] = is[i++];
			is_82_[i_83_++] = is[i++];
			is_82_[i_83_++] = is[i++];
		}
		i_84_ += 7;
		while (i < i_84_)
			is_82_[i_83_++] = is[i++];
	}

	static void method14073(long[] ls, int i, long[] ls_85_, int i_86_, int i_87_) {
		if (ls == ls_85_) {
			if (i == i_86_)
				return;
			if (i_86_ > i && i_86_ < i + i_87_) {
				i_87_--;
				i += i_87_;
				i_86_ += i_87_;
				i_87_ = i - i_87_;
				i_87_ += 3;
				while (i >= i_87_) {
					ls_85_[i_86_--] = ls[i--];
					ls_85_[i_86_--] = ls[i--];
					ls_85_[i_86_--] = ls[i--];
					ls_85_[i_86_--] = ls[i--];
				}
				i_87_ -= 3;
				while (i >= i_87_)
					ls_85_[i_86_--] = ls[i--];
				return;
			}
		}
		i_87_ += i;
		i_87_ -= 3;
		while (i < i_87_) {
			ls_85_[i_86_++] = ls[i++];
			ls_85_[i_86_++] = ls[i++];
			ls_85_[i_86_++] = ls[i++];
			ls_85_[i_86_++] = ls[i++];
		}
		i_87_ += 3;
		while (i < i_87_)
			ls_85_[i_86_++] = ls[i++];
	}

	public static void method14074(Object[] objects, int i, Object[] objects_88_, int i_89_, int i_90_) {
		if (objects == objects_88_) {
			if (i == i_89_)
				return;
			if (i_89_ > i && i_89_ < i + i_90_) {
				i_90_--;
				i += i_90_;
				i_89_ += i_90_;
				i_90_ = i - i_90_;
				i_90_ += 7;
				while (i >= i_90_) {
					objects_88_[i_89_--] = objects[i--];
					objects_88_[i_89_--] = objects[i--];
					objects_88_[i_89_--] = objects[i--];
					objects_88_[i_89_--] = objects[i--];
					objects_88_[i_89_--] = objects[i--];
					objects_88_[i_89_--] = objects[i--];
					objects_88_[i_89_--] = objects[i--];
					objects_88_[i_89_--] = objects[i--];
				}
				i_90_ -= 7;
				while (i >= i_90_)
					objects_88_[i_89_--] = objects[i--];
				return;
			}
		}
		i_90_ += i;
		i_90_ -= 7;
		while (i < i_90_) {
			objects_88_[i_89_++] = objects[i++];
			objects_88_[i_89_++] = objects[i++];
			objects_88_[i_89_++] = objects[i++];
			objects_88_[i_89_++] = objects[i++];
			objects_88_[i_89_++] = objects[i++];
			objects_88_[i_89_++] = objects[i++];
			objects_88_[i_89_++] = objects[i++];
			objects_88_[i_89_++] = objects[i++];
		}
		i_90_ += 7;
		while (i < i_90_)
			objects_88_[i_89_++] = objects[i++];
	}

	public static void method14075(int[] is, int i, int i_91_, int i_92_) {
		i_91_ = i + i_91_ - 7;
		while (i < i_91_) {
			is[i++] = i_92_;
			is[i++] = i_92_;
			is[i++] = i_92_;
			is[i++] = i_92_;
			is[i++] = i_92_;
			is[i++] = i_92_;
			is[i++] = i_92_;
			is[i++] = i_92_;
		}
		i_91_ += 7;
		while (i < i_91_)
			is[i++] = i_92_;
	}

	public static void method14076(int[] is, int i, int i_93_, int i_94_) {
		i_93_ = i + i_93_ - 7;
		while (i < i_93_) {
			is[i++] = i_94_;
			is[i++] = i_94_;
			is[i++] = i_94_;
			is[i++] = i_94_;
			is[i++] = i_94_;
			is[i++] = i_94_;
			is[i++] = i_94_;
			is[i++] = i_94_;
		}
		i_93_ += 7;
		while (i < i_93_)
			is[i++] = i_94_;
	}

	static void method14077(boolean[] bools, int i, boolean[] bools_95_, int i_96_, int i_97_) {
		if (bools == bools_95_) {
			if (i == i_96_)
				return;
			if (i_96_ > i && i_96_ < i + i_97_) {
				i_97_--;
				i += i_97_;
				i_96_ += i_97_;
				i_97_ = i - i_97_;
				i_97_ += 7;
				while (i >= i_97_) {
					bools_95_[i_96_--] = bools[i--];
					bools_95_[i_96_--] = bools[i--];
					bools_95_[i_96_--] = bools[i--];
					bools_95_[i_96_--] = bools[i--];
					bools_95_[i_96_--] = bools[i--];
					bools_95_[i_96_--] = bools[i--];
					bools_95_[i_96_--] = bools[i--];
					bools_95_[i_96_--] = bools[i--];
				}
				i_97_ -= 7;
				while (i >= i_97_)
					bools_95_[i_96_--] = bools[i--];
				return;
			}
		}
		i_97_ += i;
		i_97_ -= 7;
		while (i < i_97_) {
			bools_95_[i_96_++] = bools[i++];
			bools_95_[i_96_++] = bools[i++];
			bools_95_[i_96_++] = bools[i++];
			bools_95_[i_96_++] = bools[i++];
			bools_95_[i_96_++] = bools[i++];
			bools_95_[i_96_++] = bools[i++];
			bools_95_[i_96_++] = bools[i++];
			bools_95_[i_96_++] = bools[i++];
		}
		i_97_ += 7;
		while (i < i_97_)
			bools_95_[i_96_++] = bools[i++];
	}
}
