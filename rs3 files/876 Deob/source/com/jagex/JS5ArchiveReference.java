/* Class44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class JS5ArchiveReference {
	public static JS5ArchiveReference TEXTURES_HDR_INDEX;
	public static JS5ArchiveReference WORLD_MAP_INDEX;
	public static JS5ArchiveReference FLOOR_INDEX;
	public static JS5ArchiveReference BASES_INDEX;
	public static JS5ArchiveReference CONFIG_INDEX;
	public static JS5ArchiveReference INTERFACE_INDEX;
	public static JS5ArchiveReference SPRITES_INDEX;
	public static JS5ArchiveReference BINARY_INDEX;
	static int count;
	public static JS5ArchiveReference aClass44_630 = new JS5ArchiveReference(0, false);
	public static JS5ArchiveReference SOUND_EFFECTS_INDEX;
	public static JS5ArchiveReference CONFIG_LOC_INDEX;
	public static JS5ArchiveReference CLIENT_SCRIPT_MAP_INDEX;
	public static JS5ArchiveReference NPC_INDEX;
	static JS5ArchiveReference aClass44_635;
	public static JS5ArchiveReference ANIMATION_INDEX;
	public static JS5ArchiveReference GRAPHIC_INDEX;
	public static JS5ArchiveReference WORLD_MAP_AREA_INDEX;
	public static JS5ArchiveReference BODY_DEFAULT_INDEX;
	public static JS5ArchiveReference GENERAL_MAP_INDEX;
	public static JS5ArchiveReference QUICK_CHAT_INDEX;
	public static JS5ArchiveReference MATERIALS_INDEX;
	public static JS5ArchiveReference PARTICLE_INDEX;
	public static JS5ArchiveReference QUICK_CHAT_GLOBAL_INDEX;
	public static JS5ArchiveReference OBJECT_INDEX;
	static JS5ArchiveReference TEXTURES_DIFFUSE_DXT_INDEX;
	public static JS5ArchiveReference FONT_METRICS_INDEX;
	public static JS5ArchiveReference LOADING_SPRITES_INDEX;
	public static JS5ArchiveReference LOADING_SCREENS_INDEX;
	public static JS5ArchiveReference LOADING_SPRITES_RAW_INDEX;
	public static JS5ArchiveReference CUTSCENES_INDEX;
	public static JS5ArchiveReference MUSIC_INDEX;
	public static JS5ArchiveReference aClass44_653 = new JS5ArchiveReference(1, false);
	static JS5ArchiveReference WORLD_MAP_LABELS_INDEX;
	public static JS5ArchiveReference CLIENT_SCRIPTS_INDEX;
	public static JS5ArchiveReference TEXTURES_DIFFUSE_INDEX;
	public static JS5ArchiveReference CONFIG_BILLBOARD_INDEX;
	static JS5ArchiveReference TEXTURES_HDR_MIPPED;
	static JS5ArchiveReference aClass44_659;
	static JS5ArchiveReference aClass44_660;
	public static JS5ArchiveReference DB_TABLE_INDEX;
	boolean isStreamed;
	static JS5ArchiveReference aClass44_663;
	int indexId;
	public static JS5ArchiveReference DLLS_INDEX;
	public static JS5ArchiveReference SHADERS_INDEX;

	public boolean isStreamed(byte i) {
		return isStreamed;
	}

	public int getIndexId(int i) {
		return -538819837 * indexId;
	}

	static {
		FLOOR_INDEX = new JS5ArchiveReference(2, false);
		BASES_INDEX = new JS5ArchiveReference(3, false);
		CONFIG_INDEX = new JS5ArchiveReference(5, false);
		INTERFACE_INDEX = new JS5ArchiveReference(7, false);
		SPRITES_INDEX = new JS5ArchiveReference(8, false);
		BINARY_INDEX = new JS5ArchiveReference(10, false);
		CLIENT_SCRIPTS_INDEX = new JS5ArchiveReference(12, false);
		FONT_METRICS_INDEX = new JS5ArchiveReference(13, false);
		SOUND_EFFECTS_INDEX = new JS5ArchiveReference(14, false);
		CONFIG_LOC_INDEX = new JS5ArchiveReference(16, false);
		CLIENT_SCRIPT_MAP_INDEX = new JS5ArchiveReference(17, false);
		NPC_INDEX = new JS5ArchiveReference(18, false);
		OBJECT_INDEX = new JS5ArchiveReference(19, false);
		ANIMATION_INDEX = new JS5ArchiveReference(20, false);
		GRAPHIC_INDEX = new JS5ArchiveReference(21, false);
		GENERAL_MAP_INDEX = new JS5ArchiveReference(22, false);
		WORLD_MAP_INDEX = new JS5ArchiveReference(23, false);
		QUICK_CHAT_INDEX = new JS5ArchiveReference(24, false);
		QUICK_CHAT_GLOBAL_INDEX = new JS5ArchiveReference(25, false);
		MATERIALS_INDEX = new JS5ArchiveReference(26, false);
		PARTICLE_INDEX = new JS5ArchiveReference(27, false);
		BODY_DEFAULT_INDEX = new JS5ArchiveReference(28, false);
		CONFIG_BILLBOARD_INDEX = new JS5ArchiveReference(29, false);
		DLLS_INDEX = new JS5ArchiveReference(30, false);
		SHADERS_INDEX = new JS5ArchiveReference(31, false);
		LOADING_SPRITES_INDEX = new JS5ArchiveReference(32, false);
		LOADING_SCREENS_INDEX = new JS5ArchiveReference(33, false);
		LOADING_SPRITES_RAW_INDEX = new JS5ArchiveReference(34, false);
		CUTSCENES_INDEX = new JS5ArchiveReference(35, false);
		MUSIC_INDEX = new JS5ArchiveReference(40, true);
		WORLD_MAP_AREA_INDEX = new JS5ArchiveReference(41, false);
		WORLD_MAP_LABELS_INDEX = new JS5ArchiveReference(42, false);
		TEXTURES_DIFFUSE_INDEX = new JS5ArchiveReference(43, false);
		TEXTURES_HDR_INDEX = new JS5ArchiveReference(44, false);
		TEXTURES_DIFFUSE_DXT_INDEX = new JS5ArchiveReference(45, false);
		TEXTURES_HDR_MIPPED = new JS5ArchiveReference(46, false);
		aClass44_659 = new JS5ArchiveReference(47, false);
		aClass44_660 = new JS5ArchiveReference(48, false);
		DB_TABLE_INDEX = new JS5ArchiveReference(49, false);
		aClass44_635 = new JS5ArchiveReference(50, false);
		aClass44_663 = new JS5ArchiveReference(51, false);
		count = -1489038167;
	}

	JS5ArchiveReference(int indexId, boolean isStreamed) {
		this.indexId = indexId * 390774699;
		this.isStreamed = isStreamed;
	}

	static final void method1232(InterfaceComponentDefinitions definitions, Class669 class669, int i) {
		Class10 class10 = definitions.method4427(Class491.aClass423_5536, client.anInterface50_11044, -386881645);
		int i_2_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		int i_3_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		int i_4_ = class10.method607(definitions.aString2607, 365308179 * definitions.anInt2581, definitions.anInt2608 * 1021292849, i_3_, i_2_, Class62.aClass148Array772, 1207705869);
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = i_4_;
	}

	static void method1233(byte i) {
		if (Class575.anInt7691 * 158908775 < 0) {
			Class575.anInt7691 = 0;
			Class534_Sub1.anInt10780 = -1195183291;
			Class534_Sub1.anInt10779 = -465264525;
		}
		if (158908775 * Class575.anInt7691 > Class534_Sub1.anInt7160) {
			Class575.anInt7691 = Class534_Sub1.anInt7160 * 367905367;
			Class534_Sub1.anInt10780 = -1195183291;
			Class534_Sub1.anInt10779 = -465264525;
		}
		if (Class597.anInt7835 * -217599855 < 0) {
			Class597.anInt7835 = 0;
			Class534_Sub1.anInt10780 = -1195183291;
			Class534_Sub1.anInt10779 = -465264525;
		}
		if (Class597.anInt7835 * -217599855 > Class534_Sub1.anInt7138) {
			Class597.anInt7835 = -1099820943 * Class534_Sub1.anInt7138;
			Class534_Sub1.anInt10780 = -1195183291;
			Class534_Sub1.anInt10779 = -465264525;
		}
	}

	static final void method1234(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		InterfaceComponentDefinitions class250 = class677.aClass250_8638;
		class669.anIntArray8557[(class669.anInt8558 += 2138772399) * 1357652815 - 1] = class250.anInt2556 * -293786715;
	}
}
