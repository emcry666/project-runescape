package com.rs.game.player;

import java.io.Serializable;
import java.util.Arrays;

import com.rs.Settings;
import com.rs.cache.loaders.ClientScriptMap;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.cache.loaders.ItemsEquipIds;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.game.World;
import com.rs.game.item.Item;
import com.rs.game.player.content.clans.ClansManager;
import com.rs.io.OutputStream;
import com.rs.utils.Utils;

public class Appearence implements Serializable {

	private static final long serialVersionUID = 7655608569741626586L;

	private transient int renderEmote;
	private int title;
	private int[] lookI;
	private byte[] colour;
	private boolean male;
	private transient boolean glowRed;
	private transient byte[] appeareanceData;
	private transient byte[] md5AppeareanceDataHash;
	private transient short transformedNpcId;
	private transient boolean hidePlayer;

	private transient Player player;

	public Appearence() {
		male = true;
		renderEmote = -1;//-1 normal
		title = -1;
		resetAppearence();
	}

	public void setGlowRed(boolean glowRed) {
		this.glowRed = glowRed;
		generateAppearenceData();
	}

	public void setPlayer(Player player) {
		this.player = player;
		transformedNpcId = -1;
		renderEmote = 2699;
		if(lookI == null)
			resetAppearence();
	}

	public void transformIntoNPC(int id) {
		transformedNpcId = (short) id;
		generateAppearenceData();
	}

	public void switchHidden() {
		hidePlayer = !hidePlayer;
		generateAppearenceData();
	}

	public boolean isHidden() {
		return hidePlayer;
	}

	public boolean isGlowRed() {
		return glowRed;
	}

	public void generateAppearenceData() {
		OutputStream stream = new OutputStream();
		int flag = 0;
		
		if (!male)
			flag |= 0x1;
		
		if (transformedNpcId >= 0 && NPCDefinitions.getNPCDefinitions(transformedNpcId).aBoolean3190)
			flag |= 0x2;
		
		if (title != 0)
			flag |= title >= 32 && title <= 37 || title == 43 || title == 40 || title >= 59 && title <= 67 || title >= 45 && title >= 47 || title >= 51 ? 0x80 : 0x40; // after/before
			stream.writeByte(flag);
			if (title != 0) {
				String titleName =
						title == 8000 ? "<col=00E600> #TeamAdam </col>" : 
							title == 900 ? "<col=" + player.getTitleColor() + "> " + player.getTitle() + "</col>" :
							
							ClientScriptMap.getMap(male ? 1093 : 3872).getStringValue(title);
				stream.writeVersionedString(titleName);
			}
			
			
			stream.writeByte(player.hasSkull() ? player.getSkullId() : getSkullId());
			stream.writeByte(player.getPrayer().getPrayerHeadIcon()); // prayer icon
			stream.writeByte(hidePlayer ? 1 : 0);
			
			
			// npc
			if (transformedNpcId >= 0) {
				stream.writeShort(-1); // 65535 tells it a npc
				stream.writeShort(transformedNpcId);
				stream.writeByte(0);
				
				
			} else {
			//player
				for (int index = 0; index < 4; index++) {
					Item item = player.getEquipment().getItems().get(index);
					if (glowRed) {
						if (index == 0) {
							stream.writeShort(16384 + -50);
							continue;
						}
						if (index == 1) {
							stream.writeShort(16384 + -50);
							continue;
						}
					}
					if (item == null)
						stream.writeByte(0);
					else
						stream.writeShort(16384 + item.getId());
				}
				Item item = player.getEquipment().getItems().get(Equipment.SLOT_CHEST);
				stream.writeShort(item == null ? 0x100 + lookI[2] : 16384 + item.getId());
				item = player.getEquipment().getItems().get(Equipment.SLOT_SHIELD);
				if (item == null)
					stream.writeByte(0);
				else
					stream.writeShort(16384 + item.getId());
				item = player.getEquipment().getItems().get(Equipment.SLOT_CHEST);
				if (item == null || !Equipment.hideArms(item))
					stream.writeShort(0x100 + lookI[3]);
				else
					stream.writeByte(0);
				item = player.getEquipment().getItems().get(Equipment.SLOT_LEGS);
				stream.writeShort(glowRed ? 16384 + -50 : item == null ? 0x100 + lookI[5] : 16384 + item.getId());
				item = player.getEquipment().getItems().get(Equipment.SLOT_HAT);
				if (!glowRed && (item == null || !Equipment.hideHair(item)))
					stream.writeShort(0x100 + lookI[0]);
				else
					stream.writeByte(0);
				item = player.getEquipment().getItems().get(Equipment.SLOT_HANDS);
				stream.writeShort(glowRed ? 16384 + -50 : item == null ? 0x100 + lookI[4] : 16384 + item.getId());
				item = player.getEquipment().getItems().get(Equipment.SLOT_FEET);
				stream.writeShort(glowRed ? 16384 + -50 : item == null ? 0x100 + lookI[6] : 16384 + item.getId());
				item = player.getEquipment().getItems().get(male ? Equipment.SLOT_HAT : Equipment.SLOT_CHEST);
				if (item == null || (male && Equipment.showBear(item)))
					stream.writeShort(0x100 + lookI[1]);
				else
					stream.writeByte(0);
				item = player.getEquipment().getItems().get(Equipment.SLOT_AURA);
				if (item == null)
					stream.writeByte(0);
				else
					stream.writeShort(16384 + item.getId()); // Fixes the
				int pos = stream.getOffset();
				stream.writeShort(0);
				int hash = 0;
				int slotFlag = -1;
				for (int slotId = 0; slotId < player.getEquipment().getItems().getSize(); slotId++) {
					if (Equipment.DISABLED_SLOTS[slotId] != 0)
						continue;
					slotFlag++;
					if (slotId == Equipment.SLOT_HAT) {
						int hatId = player.getEquipment().getHatId();
						if (hatId == 20768 || hatId == 20770 || hatId == 20772) {
							ItemDefinitions defs = ItemDefinitions.getItemDefinitions(hatId - 1);
							if ((hatId == 20768 && Arrays.equals(player.getMaxedCapeCustomized(), defs.originalModelColors) || ((hatId == 20770 || hatId == 20772) && Arrays.equals(player.getCompletionistCapeCustomized(), defs.originalModelColors))))
								continue;
							hash |= 1 << slotFlag;
							stream.writeByte(0x4); // modify 4 model colors
							int[] hat = hatId == 20768 ? player.getMaxedCapeCustomized() : player.getCompletionistCapeCustomized();
							int slots = 0 | 1 << 4 | 2 << 8 | 3 << 12;
							stream.writeShort(slots);
							for (int i = 0; i < 4; i++)
								stream.writeShort(hat[i]);
						}
					} else if (slotId == Equipment.SLOT_WEAPON) {
						int weaponId = player.getEquipment().getWeaponId();
						if (weaponId == 20709) {
							ClansManager manager = player.getClanManager();
							if (manager == null)
								continue;
							int[] colors = manager.getClan().getMottifColors();
							ItemDefinitions defs = ItemDefinitions.getItemDefinitions(20709);
							boolean modifyColor = !Arrays.equals(colors, defs.originalModelColors);
							int bottom = manager.getClan().getMottifBottom();
							int top = manager.getClan().getMottifTop();
							if (bottom == 0 && top == 0 && !modifyColor)
								continue;
							hash |= 1 << slotFlag;
							stream.writeByte((modifyColor ? 0x4 : 0) | (bottom != 0 || top != 0 ? 0x8 : 0));
							if (modifyColor) {
								int slots = 0 | 1 << 4 | 2 << 8 | 3 << 12;
								stream.writeShort(slots);
								for (int i = 0; i < 4; i++)
									stream.writeShort(colors[i]);
							}
							if (bottom != 0 || top != 0) {
								int slots = 0 | 1 << 4;
								stream.writeByte(slots);
								stream.writeShort(ClansManager.getMottifTexture(top));
								stream.writeShort(ClansManager.getMottifTexture(bottom));
							}

						}
					} else if (slotId == Equipment.SLOT_CAPE) {
						int capeId = player.getEquipment().getCapeId();
						if (capeId == 20767 || capeId == 20769 || capeId == 20771 || capeId == 32152 || capeId == 32153) {
							ItemDefinitions defs = ItemDefinitions.getItemDefinitions(capeId);
							if ((capeId == 20767 && Arrays.equals(player.getMaxedCapeCustomized(), defs.originalModelColors) || ((capeId == 20769 || capeId == 20771 || capeId == 32152 || capeId == 32153) && Arrays.equals(player.getCompletionistCapeCustomized(), defs.originalModelColors))))
								continue;
							hash |= 1 << slotFlag;
							stream.writeByte(0x4); // modify 4 model colors
							int[] cape = capeId == 20767 ? player.getMaxedCapeCustomized() : player.getCompletionistCapeCustomized();
							int slots = 0 | 1 << 4 | 2 << 8 | 3 << 12;
							stream.writeShort(slots);
							for (int i = 0; i < 4; i++)
								stream.writeShort(cape[i]);
						} else if (capeId == 20708) {
							ClansManager manager = player.getClanManager();
							if (manager == null)
								continue;
							int[] colors = manager.getClan().getMottifColors();
							ItemDefinitions defs = ItemDefinitions.getItemDefinitions(20709);
							boolean modifyColor = !Arrays.equals(colors, defs.originalModelColors);
							int bottom = manager.getClan().getMottifBottom();
							int top = manager.getClan().getMottifTop();
							if (bottom == 0 && top == 0 && !modifyColor)
								continue;
							hash |= 1 << slotFlag;
							stream.writeByte((modifyColor ? 0x4 : 0) | (bottom != 0 || top != 0 ? 0x8 : 0));
							if (modifyColor) {
								int slots = 0 | 1 << 4 | 2 << 8 | 3 << 12;
								stream.writeShort(slots);
								for (int i = 0; i < 4; i++)
									stream.writeShort(colors[i]);
							}
							if (bottom != 0 || top != 0) {
								int slots = 0 | 1 << 4;
								stream.writeByte(slots);
								stream.writeShort(ClansManager.getMottifTexture(top));
								stream.writeShort(ClansManager.getMottifTexture(bottom));
							}

						}
					} else if (slotId == Equipment.SLOT_AURA) {
						int auraId = player.getEquipment().getAuraId();
						if (auraId == -1 || !player.getAuraManager().isActivated())
							continue;
						ItemDefinitions auraDefs = ItemDefinitions.getItemDefinitions(auraId);
						if (auraDefs.getMaleWornModelId1() == -1 || auraDefs.getFemaleWornModelId1() == -1)
							continue;
						hash |= 1 << slotFlag;
						stream.writeByte(0x1); // modify model ids
						int modelId = player.getAuraManager().getAuraModelId();
						stream.writeBigSmart(modelId); // male modelid1
						stream.writeBigSmart(modelId); // female modelid1
						if (auraDefs.getMaleWornModelId2() != -1 || auraDefs.getFemaleWornModelId2() != -1) {
							int modelId2 = player.getAuraManager().getAuraModelId2();
							stream.writeBigSmart(modelId2);
							stream.writeBigSmart(modelId2);
						}
					}
				}
				int pos2 = stream.getOffset();
				stream.setOffset(pos);
				stream.writeShort(hash);
				stream.setOffset(pos2);
			}

			for (int index = 0; index < colour.length; index++)
				// colour length 10
				stream.writeByte(colour[index]);

			stream.writeShort(getRenderEmote());
			stream.writeString(player.getDisplayName());
			boolean pvpArea = World.isPvpArea(player);
			stream.writeByte(pvpArea ? player.getSkills().getCombatLevel() : player.getSkills().getCombatLevelWithSummoning());
			stream.writeByte(pvpArea ? player.getSkills().getCombatLevelWithSummoning() : 0);
			stream.writeByte(-1); // higher level acc name appears in front :P
			stream.writeByte(transformedNpcId >= 0 ? 1 : 0); // to end here else id
			// need to send more
			// data
			if (transformedNpcId >= 0) {
				NPCDefinitions defs = NPCDefinitions.getNPCDefinitions(transformedNpcId);
				stream.writeShort(defs.anInt876);
				stream.writeShort(defs.anInt842);
				stream.writeShort(defs.anInt884);
				stream.writeShort(defs.anInt875);
				stream.writeByte(defs.anInt875);
			}

			stream.writeByte(0);

			// done separated for safe because of synchronization
			byte[] appeareanceData = new byte[stream.getOffset()];
			System.arraycopy(stream.getBuffer(), 0, appeareanceData, 0, appeareanceData.length);
			byte[] md5Hash = Utils.encryptUsingMD5(appeareanceData);
			this.appeareanceData = appeareanceData;
			md5AppeareanceDataHash = md5Hash;
	}

	private int getSkullId() {
		return -1;
	}

	public int getSize() {
		if (transformedNpcId >= 0)
			return NPCDefinitions.getNPCDefinitions(transformedNpcId).size;
		return 1;
	}

	public void setRenderEmote(int id) {
		setRenderEmote(id, true);
	}
	
	public void setRenderEmote(int id, boolean update) {
		this.renderEmote = id;
		if (update)
			generateAppearenceData();
	}

	public int getRenderEmote() {
		if (renderEmote >= 0)
			return renderEmote;
		if (transformedNpcId >= 0)
			return NPCDefinitions.getNPCDefinitions(transformedNpcId).renderEmote;
		return player.getEquipment().getWeaponRenderEmote();
	}

	public void resetAppearence() {
		lookI = new int[7];
		colour = new byte[10];
		male();
	}

	public void male() {
		lookI[0] = 3; // Hair
		lookI[1] = 14; // Beard
		lookI[2] = 18; // Torso
		lookI[3] = 26; // Arms
		lookI[4] = 34; // Bracelets
		lookI[5] = 38; // Legs
		lookI[6] = 42; // Shoes~

		colour[2] = 16;
		colour[1] = 16;
		colour[0] = 3;
		male = true;
	}

	public void female() {
		lookI[0] = 48; // Hair
		lookI[1] = 57; // Beard
		lookI[2] = 57; // Torso
		lookI[3] = 65; // Arms
		lookI[4] = 68; // Bracelets
		lookI[5] = 77; // Legs
		lookI[6] = 80; // Shoes

		colour[2] = 16;
		colour[1] = 16;
		colour[0] = 3;
		male = false;
	}

	public byte[] getAppeareanceData() {
		return appeareanceData;
	}

	public byte[] getMD5AppeareanceDataHash() {
		return md5AppeareanceDataHash;
	}

	public boolean isMale() {
		return male;
	}

	public void setBootsColor(int color) {
		colour[3] = (byte) color;
	}

	public void setBootsStyle(int i) {
		lookI[6] = i;
	}


	public void setLook(int i, int i2) {
		lookI[i] = i2;
	}

	public void setColor(int i, int i2) {
		colour[i] = (byte) i2;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	public void setHairStyle(int i) {
		lookI[0] = i;
	}

	public void setTopStyle(int i) {
		lookI[2] = i;
	}

	public int getTopStyle() {
		return lookI[2];
	}


	public void setArmsStyle(int i) {
		lookI[3] = i;
	}

	public void setWristsStyle(int i) {
		lookI[4] = i;
	}

	public void setLegsStyle(int i) {
		lookI[5] = i;
	}

	public int getHairStyle() {
		return lookI[0];
	}

	public void setBeardStyle(int i) {
		lookI[1] = i;
	}

	public int getBeardStyle() {
		return lookI[1];
	}

	public void setFacialHair(int i) {
		lookI[1] = i;
	}

	public int getFacialHair() {
		return lookI[1];
	}

	public void setSkinColor(int color) {
		colour[4] = (byte) color;
	}

	public int getSkinColor() {
		return colour[4];
	}

	public void setHairColor(int color) {
		colour[0] = (byte) color;
	}

	public void setTopColor(int color) {
		colour[1] = (byte) color;
	}

	public void setLegsColor(int color) {
		colour[2] = (byte) color;
	}

	public int getHairColor() {
		return colour[0];
	}

	public void setTitle(int title) {
		this.title = title;
		generateAppearenceData();
	}

	public void setHidden(boolean hidePlayer, boolean... update) {
		this.hidePlayer = hidePlayer;
		if (update.length == 0 || (update.length == 1 && update[0]))
			generateAppearenceData();
	}
	public boolean setHidden(boolean value) {
		return hidePlayer = value;
	}


	public boolean isNPC() {
		return transformedNpcId != -1;
	}

	public int getTransformedNpcId() {
		return transformedNpcId;
	}
}
