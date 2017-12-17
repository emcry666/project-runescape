/* Class189 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class189 {
	static Class189 aClass189_2135;
	static Class189 aClass189_2136;
	static Class189 aClass189_2137;
	static Class189 aClass189_2138;
	static Class189 aClass189_2139;
	static Class189 aClass189_2140;
	static Class189 aClass189_2141 = new Class189();
	static Class189 aClass189_2142;
	public static Class189 aClass189_2143;
	public static Class189 aClass189_2144;
	static Class189 aClass189_2145;
	static Class189 aClass189_2146;
	static Class189 aClass189_2147 = new Class189();

	Class189() {
		/* empty */
	}

	static {
		aClass189_2137 = new Class189();
		aClass189_2138 = new Class189();
		aClass189_2139 = new Class189();
		aClass189_2140 = new Class189();
		aClass189_2136 = new Class189();
		aClass189_2135 = new Class189();
		aClass189_2143 = new Class189();
		aClass189_2144 = new Class189();
		aClass189_2145 = new Class189();
		aClass189_2146 = new Class189();
		aClass189_2142 = new Class189();
	}

	static Class295 method3597(int i, int i_0_) {
		if (i == 224471727 * Class295.aClass295_3174.anInt3175)
			return Class295.aClass295_3174;
		if (i == Class295.aClass295_3172.anInt3175 * 224471727)
			return Class295.aClass295_3172;
		if (i == Class295.aClass295_3173.anInt3175 * 224471727)
			return Class295.aClass295_3173;
		return null;
	}

	static final void method3598(Class669 class669, byte i) {
		int i_1_ = (class669.anIntArray8557[(class669.anInt8558 -= 2138772399) * 1357652815]);
		if (i_1_ < 0 || i_1_ > 5 || 2 == i_1_)
			i_1_ = 3;
		Class535.method8921(i_1_, false, (byte) -2);
	}

	static final void method3599(Class669 class669, int i) {
		Class677 class677 = (class669.aBool8570 ? class669.aClass677_8566 : class669.aClass677_8574);
		Class250 class250 = class677.aClass250_8638;
		Class685.method13875(class250, class669, (byte) 87);
	}

	static final void method3600(Class647_Sub1_Sub3_Sub1 class647_sub1_sub3_sub1, int i) {
		if (class647_sub1_sub3_sub1.anIntArray11894 != null || class647_sub1_sub3_sub1.anIntArray11934 != null) {
			boolean bool = true;
			Class592 class592 = client.aClass505_11019.method8242(55538902);
			for (int i_2_ = 0; i_2_ < class647_sub1_sub3_sub1.anIntArray11894.length; i_2_++) {
				int i_3_ = -1;
				if (class647_sub1_sub3_sub1.anIntArray11894 != null)
					i_3_ = class647_sub1_sub3_sub1.anIntArray11894[i_2_];
				if (-1 == i_3_) {
					if (!class647_sub1_sub3_sub1.method18335(i_2_, -1, -860261103))
						bool = false;
				} else {
					bool = false;
					boolean bool_4_ = false;
					boolean bool_5_ = false;
					Class437 class437 = class647_sub1_sub3_sub1.method10569().aClass437_4862;
					int i_6_;
					int i_7_;
					if ((i_3_ & ~0x3fffffff) == -1073741824) {
						int i_8_ = i_3_ & 0xfffffff;
						int i_9_ = i_8_ >> 14;
						int i_10_ = i_8_ & 0x3fff;
						i_6_ = ((int) class437.aFloat4903 - (256 + ((i_9_ - 235453015 * class592.localX) * 512)));
						i_7_ = ((int) class437.aFloat4905 - (256 + 512 * (i_10_ - (1704054549 * class592.localY))));
					} else if ((i_3_ & 0x8000) != 0) {
						int i_11_ = i_3_ & 0x7fff;
						Player class647_sub1_sub3_sub1_sub2 = (client.aClass647_Sub1_Sub3_Sub1_Sub2Array11153[i_11_]);
						if (null != class647_sub1_sub3_sub1_sub2) {
							Class437 class437_12_ = (class647_sub1_sub3_sub1_sub2.method10569().aClass437_4862);
							i_6_ = ((int) class437.aFloat4903 - (int) class437_12_.aFloat4903);
							i_7_ = ((int) class437.aFloat4905 - (int) class437_12_.aFloat4905);
						} else {
							class647_sub1_sub3_sub1.method18335(i_2_, -1, -668515784);
							continue;
						}
					} else {
						Class523_Sub28 class523_sub28 = ((Class523_Sub28) client.aClass14_11047.method741((long) i_3_));
						if (null != class523_sub28) {
							Class647_Sub1_Sub3_Sub1_Sub1 class647_sub1_sub3_sub1_sub1 = ((Class647_Sub1_Sub3_Sub1_Sub1) class523_sub28.anObject10554);
							Class437 class437_13_ = (class647_sub1_sub3_sub1_sub1.method10569().aClass437_4862);
							i_6_ = ((int) class437.aFloat4903 - (int) class437_13_.aFloat4903);
							i_7_ = ((int) class437.aFloat4905 - (int) class437_13_.aFloat4905);
						} else {
							class647_sub1_sub3_sub1.method18335(i_2_, -1, -2044808738);
							continue;
						}
					}
					if (i_6_ != 0 || 0 != i_7_)
						class647_sub1_sub3_sub1.method18335(i_2_, (int) (Math.atan2((double) i_6_, (double) i_7_) * 2607.5945876176133) & 0x3fff, -1638493006);
				}
			}
			if (bool) {
				class647_sub1_sub3_sub1.anIntArray11894 = null;
				class647_sub1_sub3_sub1.anIntArray11934 = null;
			}
		}
	}

	public static IncomingPacket[] method3601(int i) {
		return (new IncomingPacket[] { IncomingPacket.aClass409_4350, IncomingPacket.aClass409_4330, IncomingPacket.aClass409_4331, IncomingPacket.SET_SPRITE_PACKET, IncomingPacket.aClass409_4358, IncomingPacket.SKILLS_UPDATE_PACKET, IncomingPacket.SEND_OBJECT_PACKET, IncomingPacket.aClass409_4336, IncomingPacket.INTERFACE_PACKET, IncomingPacket.aClass409_4338, IncomingPacket.aClass409_4450, IncomingPacket.aClass409_4340, IncomingPacket.aClass409_4459, IncomingPacket.SET_PLAYER_INTERFACE_PACKET, IncomingPacket.CONTAINER_UPDATE_PACKET, IncomingPacket.aClass409_4458, IncomingPacket.aClass409_4345, IncomingPacket.aClass409_4346, IncomingPacket.aClass409_4347, IncomingPacket.aClass409_4480, IncomingPacket.aClass409_4349, IncomingPacket.OTHER_GAMEBAR_UPDATE_PACKET, IncomingPacket.aClass409_4351, IncomingPacket.FRIENDS_CHAT_PACKET, IncomingPacket.aClass409_4353, IncomingPacket.PLAYER_WEIGHT_PACKET, IncomingPacket.aClass409_4355, IncomingPacket.CAMERA_SHAKE_PACKET, IncomingPacket.SEND_QC_PRIVATE_MESSAGE, IncomingPacket.RUN_ENERGY_PACKET, IncomingPacket.aClass409_4367, IncomingPacket.aClass409_4360, IncomingPacket.aClass409_4361, IncomingPacket.aClass409_4362, IncomingPacket.TEXT_ON_ICOMPONENT_PACKET, IncomingPacket.PUBLIC_CHAT_PACKET, IncomingPacket.aClass409_4365, IncomingPacket.aClass409_4366, IncomingPacket.aClass409_4376, IncomingPacket.NPC_UPDATE_PACKET, IncomingPacket.STOP_CAMERA_SHAKE_PACKET, IncomingPacket.CS_VAR_1_PACKET, IncomingPacket.aClass409_4371, IncomingPacket.GAME_MESSAGE_PACKET, IncomingPacket.aClass409_4500, IncomingPacket.CS2_SCRIPT_PACKET, IncomingPacket.aClass409_4375, IncomingPacket.aClass409_4356, IncomingPacket.CLOSE_INTERFACE_PACKET, IncomingPacket.aClass409_4378, IncomingPacket.aClass409_4379, IncomingPacket.aClass409_4380, IncomingPacket.aClass409_4381, IncomingPacket.aClass409_4382, IncomingPacket.PLAYER_UPDATE_PACKET, IncomingPacket.aClass409_4384, IncomingPacket.VAR_SMALL_STRING_PACKET, IncomingPacket.VAR_BIG_STRING_PACKET, IncomingPacket.aClass409_4387, IncomingPacket.aClass409_4501, IncomingPacket.SYSTEM_UPDATE_PACKET, IncomingPacket.PLAYER_UNDER_NPC_PACKET, IncomingPacket.aClass409_4391, IncomingPacket.CUTSCENE_PACKET, IncomingPacket.aClass409_4444, IncomingPacket.aClass409_4394, IncomingPacket.GAME_SCENE_PACKET, IncomingPacket.SEND_NIS_VAR_PACKET, IncomingPacket.aClass409_4372, IncomingPacket.aClass409_4398, IncomingPacket.SEND_MUSIC_PACKET, IncomingPacket.aClass409_4400, IncomingPacket.aClass409_4401, IncomingPacket.ROOT_INTERFACE_PACKET, IncomingPacket.MESSAGE_STATUS_UPDATE_PACKET, IncomingPacket.aClass409_4402, IncomingPacket.aClass409_4405, IncomingPacket.aClass409_4443, IncomingPacket.ADD_IGNORE_PACKET, IncomingPacket.PLAYER_ON_ICOMPONENT_PACKET, IncomingPacket.aClass409_4409, IncomingPacket.LOBBY_INFO_PACKET, IncomingPacket.GRAPHICS_PACKET, IncomingPacket.SEND_PRIVATE_MESSAGE, IncomingPacket.PLAYER_OPTION_PACKET, IncomingPacket.aClass409_4457, IncomingPacket.aClass409_4445, IncomingPacket.CS_VAR_2_PACKET, IncomingPacket.aClass409_4417, IncomingPacket.CLIENT_COMMAND_PACKET, IncomingPacket.aClass409_4419, IncomingPacket.aClass409_4420, IncomingPacket.ANIMATION_ON_ICOMPONENT_PACKET, IncomingPacket.aClass409_4422, IncomingPacket.aClass409_4454, IncomingPacket.aClass409_4333, IncomingPacket.REMOVE_GROUND_ITEM_PACKET, IncomingPacket.aClass409_4426, IncomingPacket.aClass409_4414, IncomingPacket.aClass409_4428, IncomingPacket.aClass409_4429, IncomingPacket.aClass409_4430, IncomingPacket.aClass409_4373, IncomingPacket.REMOVE_OBJECT_PACKET, IncomingPacket.NPC_ON_ICOMPONENT_PACKET, IncomingPacket.aClass409_4434, IncomingPacket.aClass409_4435, IncomingPacket.aClass409_4388, IncomingPacket.aClass409_4492, IncomingPacket.ITEM_ON_ICOMPONENT_PACKET, IncomingPacket.ADJUSTED_PROJECTILE_PACKET, IncomingPacket.MINIMAP_FLAG_PACKET, IncomingPacket.PROJECTILE_PACKET, IncomingPacket.ADD_FRIEND_PACKET, IncomingPacket.aClass409_4393, IncomingPacket.aClass409_4455, IncomingPacket.aClass409_4397, IncomingPacket.aClass409_4446, IncomingPacket.aClass409_4436, IncomingPacket.aClass409_4448, IncomingPacket.aClass409_4449, IncomingPacket.aClass409_4337, IncomingPacket.aClass409_4451, IncomingPacket.aClass409_4439, IncomingPacket.ACCESS_MASK_PACKET, IncomingPacket.aClass409_4502, IncomingPacket.RECIEVE_PRIVATE_MESSAGE_PACKET, IncomingPacket.aClass409_4456, IncomingPacket.VAR_2_PACKET, IncomingPacket.HINT_ICON_PACKET, IncomingPacket.OPEN_URL_PACKET, IncomingPacket.GRAND_EXCHANGE_PACKET, IncomingPacket.aClass409_4461, IncomingPacket.aClass409_4462, IncomingPacket.HIDE_ICOMPONENT_PACKET, IncomingPacket.aClass409_4464, IncomingPacket.aClass409_4396, IncomingPacket.aClass409_4370, IncomingPacket.aClass409_4467, IncomingPacket.aClass409_4343, IncomingPacket.SLOT_CONTAINER_UPDATE_PACKET, IncomingPacket.aClass409_4470, IncomingPacket.VAR_1_PACKET, IncomingPacket.aClass409_4344, IncomingPacket.aClass409_4473, IncomingPacket.aClass409_4474, IncomingPacket.aClass409_4475, IncomingPacket.RESET_NIS_VARS_PACKET, IncomingPacket.aClass409_4477, IncomingPacket.aClass409_4478, IncomingPacket.GAME_LOGOUT_PACKET, IncomingPacket.aClass409_4377, IncomingPacket.aClass409_4481, IncomingPacket.OTHER_PLAYER_ON_ICOMPONENT_PACKET, IncomingPacket.aClass409_4483, IncomingPacket.aClass409_4404, IncomingPacket.aClass409_4485, IncomingPacket.CHUNK_STREAM_PACKET, IncomingPacket.OBJECT_ANIMATION_PACKET, IncomingPacket.aClass409_4488, IncomingPacket.PLAYER_HEAD_ON_ICOMPONENT_PACKET, IncomingPacket.aClass409_4490, IncomingPacket.aClass409_4468, IncomingPacket.aClass409_4499, IncomingPacket.aClass409_4493, IncomingPacket.BLACK_OUT_PACKET, IncomingPacket.aClass409_4495, IncomingPacket.aClass409_4496, IncomingPacket.aClass409_4339, IncomingPacket.aClass409_4498, IncomingPacket.aClass409_4415, IncomingPacket.aClass409_4329, IncomingPacket.aClass409_4466, IncomingPacket.DYNAMIC_REGION_PACKET, IncomingPacket.aClass409_4487, IncomingPacket.aClass409_4437, IncomingPacket.aClass409_4390, IncomingPacket.aClass409_4506, IncomingPacket.aClass409_4507, IncomingPacket.aClass409_4508, IncomingPacket.APPEARANCE_LOOK_PACKET, IncomingPacket.LOBBY_LOGOUT_PACKET, IncomingPacket.aClass409_4511, IncomingPacket.aClass409_4406, IncomingPacket.aClass409_4513, IncomingPacket.aClass409_4514, IncomingPacket.aClass409_4515, IncomingPacket.SELECT_TARGET_PACKET, IncomingPacket.aClass409_4517, IncomingPacket.aClass409_4471, IncomingPacket.aClass409_4519, IncomingPacket.SEND_GROUND_ITEM_PACKET, IncomingPacket.aClass409_4411 });
	}
}
