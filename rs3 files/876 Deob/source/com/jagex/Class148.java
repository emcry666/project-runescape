/* Class148 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class148 implements Interface3 {
	public final void method2423(float f, float f_0_, float f_1_, float f_2_, int i, int i_3_) {
		method2455(f, f_0_, f_1_, f_2_, i, i_3_, 1, -1, 1);
	}

	public abstract void method2424(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_);

	public abstract void method2425(int[] is);

	public abstract void method2426(int i, int i_10_, int i_11_, int i_12_);

	abstract void method2427(float f, float f_13_, float f_14_, float f_15_, float f_16_, float f_17_, int i, int i_18_, int i_19_, int i_20_);

	public abstract int method2428();

	public abstract int method2429();

	public abstract Interface22 method2430();

	public abstract void method2431(int i, int i_21_, int i_22_, int i_23_, int[] is, int i_24_, int i_25_);

	public abstract void method2432(int i, int i_26_, int i_27_, int i_28_, int[] is, int[] is_29_, int i_30_, int i_31_);

	public abstract void method2433(int i, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_);

	public abstract void method2434(int i, int i_37_, int i_38_);

	public final void method2435(int i, int i_39_) {
		method2436(i, i_39_, 1, -1, 1);
	}

	public abstract void method2436(int i, int i_40_, int i_41_, int i_42_, int i_43_);

	public abstract void method2437(int i, int i_44_, int i_45_, int i_46_, int[] is, int i_47_, int i_48_);

	public final void method2438(int i, int i_49_, int i_50_, int i_51_) {
		method2461(i, i_49_, i_50_, i_51_, 1, -1, 1, 1);
	}

	public final void method2439(int i, int i_52_, int i_53_, int i_54_, int i_55_, int i_56_, int i_57_) {
		method2461(i, i_52_, i_53_, i_54_, i_55_, i_56_, i_57_, 1);
	}

	public final void method2440(int i, int i_58_, int i_59_, int i_60_) {
		method2464(i, i_58_, i_59_, i_60_, 1, -1, 1);
	}

	public abstract void method2441(int i, int i_61_, int i_62_, int i_63_, int[] is, int[] is_64_, int i_65_, int i_66_);

	public abstract void method2442(int[] is);

	public final void method2443(int i, int i_67_, int i_68_, int i_69_) {
		method2464(i, i_67_, i_68_, i_69_, 1, -1, 1);
	}

	public final void method2444(float f, float f_70_, int i, int i_71_) {
		method2455(f, f_70_, (float) method38() / 2.0F, (float) method2429() / 2.0F, i, i_71_, 1, -1, 1);
	}

	public final void method2445(float f, float f_72_, int i, int i_73_, int i_74_, int i_75_, int i_76_) {
		method2455(f, f_72_, (float) method38() / 2.0F, (float) method2429() / 2.0F, i, i_73_, i_74_, i_75_, i_76_);
	}

	public final void method2446(float f, float f_77_, float f_78_, float f_79_, int i, int i_80_, int i_81_, int i_82_, int i_83_, int i_84_) {
		if (i != 0 && i_80_ != 0) {
			double d = (double) (i_81_ & 0xffff) * 9.587379924285257E-5;
			float f_85_ = (float) Math.sin(d) * (float) i_80_;
			float f_86_ = (float) Math.cos(d) * (float) i_80_;
			float f_87_ = (float) Math.sin(d) * (float) i;
			float f_88_ = (float) Math.cos(d) * (float) i;
			float f_89_ = (-f_78_ * f_88_ + -f_79_ * f_85_) / 4096.0F + f;
			float f_90_ = (--f_78_ * f_87_ + -f_79_ * f_86_) / 4096.0F + f_77_;
			float f_91_ = ((((float) method38() - f_78_) * f_88_ + -f_79_ * f_85_) / 4096.0F + f);
			float f_92_ = ((-((float) method38() - f_78_) * f_87_ + -f_79_ * f_86_) / 4096.0F + f_77_);
			float f_93_ = ((-f_78_ * f_88_ + ((float) method2429() - f_79_) * f_85_) / 4096.0F + f);
			float f_94_ = ((--f_78_ * f_87_ + ((float) method2429() - f_79_) * f_86_) / 4096.0F + f_77_);
			method2469(f_89_, f_90_, f_91_, f_92_, f_93_, f_94_, i_82_, i_83_, i_84_);
		}
	}

	public abstract int method38();

	public final void method2447(float f, float f_95_, int i, int i_96_, Class145 class145, int i_97_, int i_98_) {
		method2448(f, f_95_, (float) method38() / 2.0F, (float) method2429() / 2.0F, i, i_96_, class145, i_97_, i_98_);
	}

	public final void method2448(float f, float f_99_, float f_100_, float f_101_, int i, int i_102_, Class145 class145, int i_103_, int i_104_) {
		if (i != 0) {
			double d = (double) (i_102_ & 0xffff) * 9.587379924285257E-5;
			float f_105_ = (float) Math.sin(d) * (float) i;
			float f_106_ = (float) Math.cos(d) * (float) i;
			float f_107_ = (-f_100_ * f_106_ + -f_101_ * f_105_) / 4096.0F + f;
			float f_108_ = (--f_100_ * f_105_ + -f_101_ * f_106_) / 4096.0F + f_99_;
			float f_109_ = ((((float) method38() - f_100_) * f_106_ + -f_101_ * f_105_) / 4096.0F + f);
			float f_110_ = ((-((float) method38() - f_100_) * f_105_ + -f_101_ * f_106_) / 4096.0F + f_99_);
			float f_111_ = ((-f_100_ * f_106_ + ((float) method2429() - f_101_) * f_105_) / 4096.0F + f);
			float f_112_ = ((--f_100_ * f_105_ + ((float) method2429() - f_101_) * f_106_) / 4096.0F + f_99_);
			method2450(f_107_, f_108_, f_109_, f_110_, f_111_, f_112_, class145, i_103_, i_104_);
		}
	}

	Class148() {
		/* empty */
	}

	abstract void method2449(float f, float f_113_, float f_114_, float f_115_, float f_116_, float f_117_, int i, int i_118_, int i_119_, int i_120_);

	final void method2450(float f, float f_121_, float f_122_, float f_123_, float f_124_, float f_125_, Class145 class145, int i, int i_126_) {
		method2475(f, f_121_, f_122_, f_123_, f_124_, f_125_, 1, class145, i, i_126_);
	}

	final void method2451(float f, float f_127_, float f_128_, float f_129_, float f_130_, float f_131_, Class145 class145, int i, int i_132_) {
		method2475(f, f_127_, f_128_, f_129_, f_130_, f_131_, 1, class145, i, i_132_);
	}

	public abstract void method2452(int i, int i_133_, int i_134_, int i_135_, int[] is, int i_136_, int i_137_);

	abstract void method2453(int i, int i_138_, int i_139_, int i_140_, int i_141_, int i_142_, int i_143_, int i_144_);

	public abstract void method2454(int i, int i_145_, int i_146_, int i_147_, int[] is, int i_148_, int i_149_);

	public final void method2455(float f, float f_150_, float f_151_, float f_152_, int i, int i_153_, int i_154_, int i_155_, int i_156_) {
		if (i != 0) {
			double d = (double) (i_153_ & 0xffff) * 9.587379924285257E-5;
			float f_157_ = (float) Math.sin(d) * (float) i;
			float f_158_ = (float) Math.cos(d) * (float) i;
			float f_159_ = (-f_151_ * f_158_ + -f_152_ * f_157_) / 4096.0F + f;
			float f_160_ = (--f_151_ * f_157_ + -f_152_ * f_158_) / 4096.0F + f_150_;
			float f_161_ = ((((float) method38() - f_151_) * f_158_ + -f_152_ * f_157_) / 4096.0F + f);
			float f_162_ = ((-((float) method38() - f_151_) * f_157_ + -f_152_ * f_158_) / 4096.0F + f_150_);
			float f_163_ = ((-f_151_ * f_158_ + ((float) method2429() - f_152_) * f_157_) / 4096.0F + f);
			float f_164_ = ((--f_151_ * f_157_ + ((float) method2429() - f_152_) * f_158_) / 4096.0F + f_150_);
			method2469(f_159_, f_160_, f_161_, f_162_, f_163_, f_164_, i_154_, i_155_, i_156_);
		}
	}

	public abstract void method2456(int i, int i_165_, int i_166_, int i_167_, int[] is, int[] is_168_, int i_169_, int i_170_);

	public abstract void method2457(int i, int i_171_, int i_172_, int i_173_);

	public abstract void method2458(int[] is);

	public abstract void method2459(int i, int i_174_, int i_175_, int i_176_, int[] is, int[] is_177_, int i_178_, int i_179_);

	public abstract void method2460(int i, int i_180_, int i_181_, int i_182_, int i_183_, int i_184_);

	abstract void method2461(int i, int i_185_, int i_186_, int i_187_, int i_188_, int i_189_, int i_190_, int i_191_);

	public abstract void method2462(int i, int i_192_, int i_193_);

	public abstract void method2463(int i, int i_194_, int i_195_, int i_196_, int i_197_);

	public abstract void method2464(int i, int i_198_, int i_199_, int i_200_, int i_201_, int i_202_, int i_203_);

	public abstract int method2465();

	public abstract void method2466(int i, int i_204_, Class145 class145, int i_205_, int i_206_);

	public abstract void method2467(int i, int i_207_, Class145 class145, int i_208_, int i_209_);

	public final void method2468(float f, float f_210_, int i, int i_211_, int i_212_, int i_213_, int i_214_) {
		method2455(f, f_210_, (float) method38() / 2.0F, (float) method2429() / 2.0F, i, i_211_, i_212_, i_213_, i_214_);
	}

	public final void method2469(float f, float f_215_, float f_216_, float f_217_, float f_218_, float f_219_, int i, int i_220_, int i_221_) {
		method2449(f, f_215_, f_216_, f_217_, f_218_, f_219_, i, i_220_, i_221_, 1);
	}

	public abstract Interface22 method2470();

	public abstract Interface22 method2471();

	public abstract void method2472(int i, int i_222_, int i_223_, int i_224_);

	public final void method2473(float f, float f_225_, float f_226_, float f_227_, int i, int i_228_, int i_229_, int i_230_, int i_231_, int i_232_) {
		if (i != 0 && i_228_ != 0) {
			double d = (double) (i_229_ & 0xffff) * 9.587379924285257E-5;
			float f_233_ = (float) Math.sin(d) * (float) i_228_;
			float f_234_ = (float) Math.cos(d) * (float) i_228_;
			float f_235_ = (float) Math.sin(d) * (float) i;
			float f_236_ = (float) Math.cos(d) * (float) i;
			float f_237_ = (-f_226_ * f_236_ + -f_227_ * f_233_) / 4096.0F + f;
			float f_238_ = (--f_226_ * f_235_ + -f_227_ * f_234_) / 4096.0F + f_225_;
			float f_239_ = ((((float) method38() - f_226_) * f_236_ + -f_227_ * f_233_) / 4096.0F + f);
			float f_240_ = ((-((float) method38() - f_226_) * f_235_ + -f_227_ * f_234_) / 4096.0F + f_225_);
			float f_241_ = ((-f_226_ * f_236_ + ((float) method2429() - f_227_) * f_233_) / 4096.0F + f);
			float f_242_ = ((--f_226_ * f_235_ + ((float) method2429() - f_227_) * f_234_) / 4096.0F + f_225_);
			method2469(f_237_, f_238_, f_239_, f_240_, f_241_, f_242_, i_230_, i_231_, i_232_);
		}
	}

	public abstract int method2474();

	abstract void method2475(float f, float f_243_, float f_244_, float f_245_, float f_246_, float f_247_, int i, Class145 class145, int i_248_, int i_249_);

	public abstract void method2476(int[] is);

	public abstract int method2477();

	public abstract int method2478();

	public abstract int method2479();

	public final void method2480(float f, float f_250_, int i, int i_251_) {
		method2455(f, f_250_, (float) method38() / 2.0F, (float) method2429() / 2.0F, i, i_251_, 1, -1, 1);
	}

	public abstract int method39();

	public abstract void method2481(int i, int i_252_, int i_253_, int i_254_, int i_255_, int i_256_);

	public abstract int method37();

	public abstract void method2482(int i, int i_257_, Class145 class145, int i_258_, int i_259_);

	public abstract void method2483(int i, int i_260_, int i_261_, int i_262_, int[] is, int i_263_, int i_264_);

	public abstract void method2484(int i, int i_265_, int i_266_, int i_267_, int i_268_, int i_269_, int i_270_);

	public abstract int method40();

	public abstract int method2485();

	public abstract void method2486(int i, int i_271_, int i_272_, int i_273_, int i_274_);

	abstract void method2487(float f, float f_275_, float f_276_, float f_277_, float f_278_, float f_279_, int i, Class145 class145, int i_280_, int i_281_);

	public abstract void method2488(int i, int i_282_, Class145 class145, int i_283_, int i_284_);

	public final void method2489(int i, int i_285_) {
		method2436(i, i_285_, 1, -1, 1);
	}

	public final void method2490(int i, int i_286_) {
		method2436(i, i_286_, 1, -1, 1);
	}

	public final void method2491(int i, int i_287_, int i_288_, int i_289_, int i_290_, int i_291_, int i_292_) {
		method2461(i, i_287_, i_288_, i_289_, i_290_, i_291_, i_292_, 1);
	}

	public final void method2492(int i, int i_293_, int i_294_, int i_295_) {
		method2464(i, i_293_, i_294_, i_295_, 1, -1, 1);
	}

	public abstract void method2493(int i, int i_296_, int i_297_, int i_298_, int i_299_);

	public final void method2494(int i, int i_300_, int i_301_, int i_302_) {
		method2464(i, i_300_, i_301_, i_302_, 1, -1, 1);
	}

	abstract void method2495(float f, float f_303_, float f_304_, float f_305_, float f_306_, float f_307_, int i, Class145 class145, int i_308_, int i_309_);

	public final void method2496(float f, float f_310_, float f_311_, float f_312_, int i, int i_313_) {
		method2455(f, f_310_, f_311_, f_312_, i, i_313_, 1, -1, 1);
	}

	public final void method2497(float f, float f_314_, int i, int i_315_) {
		method2455(f, f_314_, (float) method38() / 2.0F, (float) method2429() / 2.0F, i, i_315_, 1, -1, 1);
	}

	public final void method2498(float f, float f_316_, int i, int i_317_) {
		method2455(f, f_316_, (float) method38() / 2.0F, (float) method2429() / 2.0F, i, i_317_, 1, -1, 1);
	}

	public final void method2499(float f, float f_318_, float f_319_, float f_320_, int i, int i_321_) {
		method2455(f, f_318_, f_319_, f_320_, i, i_321_, 1, -1, 1);
	}

	public final void method2500(float f, float f_322_, int i, int i_323_) {
		method2455(f, f_322_, (float) method38() / 2.0F, (float) method2429() / 2.0F, i, i_323_, 1, -1, 1);
	}

	public final void method2501(float f, float f_324_, int i, int i_325_) {
		method2455(f, f_324_, (float) method38() / 2.0F, (float) method2429() / 2.0F, i, i_325_, 1, -1, 1);
	}

	public final void method2502(float f, float f_326_, int i, int i_327_, Class145 class145, int i_328_, int i_329_) {
		method2448(f, f_326_, (float) method38() / 2.0F, (float) method2429() / 2.0F, i, i_327_, class145, i_328_, i_329_);
	}

	public final void method2503(float f, float f_330_, int i, int i_331_, int i_332_, int i_333_, int i_334_) {
		method2455(f, f_330_, (float) method38() / 2.0F, (float) method2429() / 2.0F, i, i_331_, i_332_, i_333_, i_334_);
	}

	public abstract int method2504();

	public final void method2505(float f, float f_335_, float f_336_, float f_337_, int i, int i_338_, int i_339_, int i_340_, int i_341_) {
		if (i != 0) {
			double d = (double) (i_338_ & 0xffff) * 9.587379924285257E-5;
			float f_342_ = (float) Math.sin(d) * (float) i;
			float f_343_ = (float) Math.cos(d) * (float) i;
			float f_344_ = (-f_336_ * f_343_ + -f_337_ * f_342_) / 4096.0F + f;
			float f_345_ = (--f_336_ * f_342_ + -f_337_ * f_343_) / 4096.0F + f_335_;
			float f_346_ = ((((float) method38() - f_336_) * f_343_ + -f_337_ * f_342_) / 4096.0F + f);
			float f_347_ = ((-((float) method38() - f_336_) * f_342_ + -f_337_ * f_343_) / 4096.0F + f_335_);
			float f_348_ = ((-f_336_ * f_343_ + ((float) method2429() - f_337_) * f_342_) / 4096.0F + f);
			float f_349_ = ((--f_336_ * f_342_ + ((float) method2429() - f_337_) * f_343_) / 4096.0F + f_335_);
			method2469(f_344_, f_345_, f_346_, f_347_, f_348_, f_349_, i_339_, i_340_, i_341_);
		}
	}

	public abstract void method2506(int i, int i_350_, int i_351_, int i_352_, int[] is, int i_353_, int i_354_);

	public final void method2507(float f, float f_355_, float f_356_, float f_357_, int i, int i_358_, Class145 class145, int i_359_, int i_360_) {
		if (i != 0) {
			double d = (double) (i_358_ & 0xffff) * 9.587379924285257E-5;
			float f_361_ = (float) Math.sin(d) * (float) i;
			float f_362_ = (float) Math.cos(d) * (float) i;
			float f_363_ = (-f_356_ * f_362_ + -f_357_ * f_361_) / 4096.0F + f;
			float f_364_ = (--f_356_ * f_361_ + -f_357_ * f_362_) / 4096.0F + f_355_;
			float f_365_ = ((((float) method38() - f_356_) * f_362_ + -f_357_ * f_361_) / 4096.0F + f);
			float f_366_ = ((-((float) method38() - f_356_) * f_361_ + -f_357_ * f_362_) / 4096.0F + f_355_);
			float f_367_ = ((-f_356_ * f_362_ + ((float) method2429() - f_357_) * f_361_) / 4096.0F + f);
			float f_368_ = ((--f_356_ * f_361_ + ((float) method2429() - f_357_) * f_362_) / 4096.0F + f_355_);
			method2450(f_363_, f_364_, f_365_, f_366_, f_367_, f_368_, class145, i_359_, i_360_);
		}
	}

	public final void method2508(float f, float f_369_, float f_370_, float f_371_, int i, int i_372_, Class145 class145, int i_373_, int i_374_) {
		if (i != 0) {
			double d = (double) (i_372_ & 0xffff) * 9.587379924285257E-5;
			float f_375_ = (float) Math.sin(d) * (float) i;
			float f_376_ = (float) Math.cos(d) * (float) i;
			float f_377_ = (-f_370_ * f_376_ + -f_371_ * f_375_) / 4096.0F + f;
			float f_378_ = (--f_370_ * f_375_ + -f_371_ * f_376_) / 4096.0F + f_369_;
			float f_379_ = ((((float) method38() - f_370_) * f_376_ + -f_371_ * f_375_) / 4096.0F + f);
			float f_380_ = ((-((float) method38() - f_370_) * f_375_ + -f_371_ * f_376_) / 4096.0F + f_369_);
			float f_381_ = ((-f_370_ * f_376_ + ((float) method2429() - f_371_) * f_375_) / 4096.0F + f);
			float f_382_ = ((--f_370_ * f_375_ + ((float) method2429() - f_371_) * f_376_) / 4096.0F + f_369_);
			method2450(f_377_, f_378_, f_379_, f_380_, f_381_, f_382_, class145, i_373_, i_374_);
		}
	}

	public final void method2509(float f, float f_383_, float f_384_, float f_385_, int i, int i_386_, Class145 class145, int i_387_, int i_388_) {
		if (i != 0) {
			double d = (double) (i_386_ & 0xffff) * 9.587379924285257E-5;
			float f_389_ = (float) Math.sin(d) * (float) i;
			float f_390_ = (float) Math.cos(d) * (float) i;
			float f_391_ = (-f_384_ * f_390_ + -f_385_ * f_389_) / 4096.0F + f;
			float f_392_ = (--f_384_ * f_389_ + -f_385_ * f_390_) / 4096.0F + f_383_;
			float f_393_ = ((((float) method38() - f_384_) * f_390_ + -f_385_ * f_389_) / 4096.0F + f);
			float f_394_ = ((-((float) method38() - f_384_) * f_389_ + -f_385_ * f_390_) / 4096.0F + f_383_);
			float f_395_ = ((-f_384_ * f_390_ + ((float) method2429() - f_385_) * f_389_) / 4096.0F + f);
			float f_396_ = ((--f_384_ * f_389_ + ((float) method2429() - f_385_) * f_390_) / 4096.0F + f_383_);
			method2450(f_391_, f_392_, f_393_, f_394_, f_395_, f_396_, class145, i_387_, i_388_);
		}
	}

	public final void method2510(float f, float f_397_, float f_398_, float f_399_, float f_400_, float f_401_, int i, int i_402_, int i_403_) {
		method2449(f, f_397_, f_398_, f_399_, f_400_, f_401_, i, i_402_, i_403_, 1);
	}

	public final void method2511(int i, int i_404_) {
		method2436(i, i_404_, 1, -1, 1);
	}

	final void method2512(float f, float f_405_, float f_406_, float f_407_, float f_408_, float f_409_, Class145 class145, int i, int i_410_) {
		method2475(f, f_405_, f_406_, f_407_, f_408_, f_409_, 1, class145, i, i_410_);
	}
}
