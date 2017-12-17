/* Class88 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class88 implements Interface5 {
	Class472 aClass472_884;
	Class209 aClass209_885;

	void method1616(int i, byte i_0_) {
		aClass209_885 = new Class209(i);
	}

	void method1617(int i) {
		synchronized (aClass209_885) {
			aClass209_885.method3773(-1977636029);
		}
	}

	void method1618(int i) {
		aClass209_885 = new Class209(i);
	}

	void method1619(int i, int i_1_) {
		synchronized (aClass209_885) {
			aClass209_885.method3772(i, (byte) -45);
		}
	}

	void method1620(int i) {
		synchronized (aClass209_885) {
			aClass209_885.method3776(-4690944);
		}
	}

	Class88(Class472 class472, int i) {
		aClass472_884 = class472;
		aClass209_885 = new Class209(i);
	}

	void method1621(int i) {
		aClass209_885 = new Class209(i);
	}

	void method1622(int i) {
		synchronized (aClass209_885) {
			aClass209_885.method3772(i, (byte) -87);
		}
	}

	void method1623() {
		synchronized (aClass209_885) {
			aClass209_885.method3776(1215365757);
		}
	}

	void method1624() {
		synchronized (aClass209_885) {
			aClass209_885.method3776(958672783);
		}
	}

	public static JS5ArchiveReference[] getArchiveReferences(int i) {
		return new JS5ArchiveReference[] { JS5ArchiveReference.aClass44_630, JS5ArchiveReference.aClass44_653, JS5ArchiveReference.FLOOR_INDEX, JS5ArchiveReference.BASES_INDEX, JS5ArchiveReference.CONFIG_INDEX, JS5ArchiveReference.INTERFACE_INDEX, JS5ArchiveReference.SPRITES_INDEX, JS5ArchiveReference.BINARY_INDEX, JS5ArchiveReference.CLIENT_SCRIPTS_INDEX, JS5ArchiveReference.FONT_METRICS_INDEX, JS5ArchiveReference.SOUND_EFFECTS_INDEX, JS5ArchiveReference.CONFIG_LOC_INDEX, JS5ArchiveReference.CLIENT_SCRIPT_MAP_INDEX, JS5ArchiveReference.NPC_INDEX, JS5ArchiveReference.OBJECT_INDEX, JS5ArchiveReference.ANIMATION_INDEX, JS5ArchiveReference.GRAPHIC_INDEX, JS5ArchiveReference.GENERAL_MAP_INDEX, JS5ArchiveReference.WORLD_MAP_INDEX, JS5ArchiveReference.QUICK_CHAT_INDEX, JS5ArchiveReference.QUICK_CHAT_GLOBAL_INDEX, JS5ArchiveReference.MATERIALS_INDEX, JS5ArchiveReference.PARTICLE_INDEX, JS5ArchiveReference.BODY_DEFAULT_INDEX, JS5ArchiveReference.CONFIG_BILLBOARD_INDEX, JS5ArchiveReference.DLLS_INDEX, JS5ArchiveReference.SHADERS_INDEX, JS5ArchiveReference.LOADING_SPRITES_INDEX, JS5ArchiveReference.LOADING_SCREENS_INDEX, JS5ArchiveReference.LOADING_SPRITES_RAW_INDEX, JS5ArchiveReference.CUTSCENES_INDEX, JS5ArchiveReference.MUSIC_INDEX, JS5ArchiveReference.WORLD_MAP_AREA_INDEX, JS5ArchiveReference.WORLD_MAP_LABELS_INDEX, JS5ArchiveReference.TEXTURES_DIFFUSE_INDEX, JS5ArchiveReference.TEXTURES_HDR_INDEX, JS5ArchiveReference.TEXTURES_DIFFUSE_DXT_INDEX, JS5ArchiveReference.TEXTURES_HDR_MIPPED, JS5ArchiveReference.aClass44_659, JS5ArchiveReference.aClass44_660, JS5ArchiveReference.DB_TABLE_INDEX, JS5ArchiveReference.aClass44_635, JS5ArchiveReference.aClass44_663 };
	}

	public static final boolean method1626(char c, int i) {
		return (c >= '!' && c < '0' || c >= ':' && c <= '@' && c != '<' || c >= '[' && c <= '_' || c >= '{');
	}
}
