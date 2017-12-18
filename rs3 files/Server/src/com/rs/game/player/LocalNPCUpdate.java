package com.rs.game.player;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.rs.Settings;
import com.rs.game.Graphics;
import com.rs.game.HeadIcon;
import com.rs.game.Hit;
import com.rs.game.HitBar;
import com.rs.game.World;
import com.rs.game.npc.NPC;
import com.rs.io.OutputStream;
import com.rs.utils.Utils;

public final class LocalNPCUpdate {

	private Player player;
	private LinkedList<NPC> localNPCs;

	public void reset() {
		localNPCs.clear();
	}

	public LocalNPCUpdate(Player player) {
		this.player = player;
		localNPCs = new LinkedList<NPC>();
	}

	public OutputStream createPacketAndProcess() {
		OutputStream stream = new OutputStream();
		OutputStream updateBlockData = new OutputStream();
		stream.writePacketVarShort(player, 39);
		processLocalNPCsInform(stream, updateBlockData);
		stream.writeBytes(updateBlockData.getBuffer(), 0, updateBlockData.getOffset());
		stream.endPacketVarShort();
		return stream;
	}

	private void processLocalNPCsInform(OutputStream stream, OutputStream updateBlockData) {
		stream.initBitAccess();
		processInScreenNPCs(stream, updateBlockData);
		addInScreenNPCs(stream, updateBlockData);
		if (updateBlockData.getOffset() > 0)
			stream.writeBits(15, 32767);
		stream.finishBitAccess();
	}

	private void processInScreenNPCs(OutputStream stream, OutputStream updateBlockData) {
		stream.writeBits(8, localNPCs.size());
		// for (NPC n : localNPCs.toArray(new NPC[localNPCs.size()])) {
		for (Iterator<NPC> it = localNPCs.iterator(); it.hasNext();) {
			NPC n = it.next();
			if (n.hasFinished() || !(n.withinDistance(player, 14) && (/* !player.hasLargeSceneView() || */player.getMapRegionsIds().contains(n.getRegionId()))) || n.hasTeleported()) {
				stream.writeBits(1, 1);
				stream.writeBits(2, 3);
				it.remove();
				continue;
			}
			boolean needUpdate = n.needMasksUpdate() || player.getCombatDefinitions().isNeedTargetReticuleUpdate(n);
			boolean walkUpdate = n.getNextWalkDirection() != -1;
			stream.writeBits(1, (needUpdate || walkUpdate) ? 1 : 0);
			if (walkUpdate) {
				stream.writeBits(2, n.getNextRunDirection() == -1 ? 1 : 2);
				if (n.getNextRunDirection() != -1)
					stream.writeBits(1, 1);
				stream.writeBits(3, Utils.getNpcMoveDirection(n.getNextWalkDirection()));
				if (n.getNextRunDirection() != -1)
					stream.writeBits(3, Utils.getNpcMoveDirection(n.getNextRunDirection()));
				stream.writeBits(1, needUpdate ? 1 : 0);
			} else if (needUpdate)
				stream.writeBits(2, 0);
			if (needUpdate)
				appendUpdateBlock(n, updateBlockData, false);
		}
	}

	private void addInScreenNPCs(OutputStream stream, OutputStream updateBlockData) {
		for (int regionId : player.getMapRegionsIds()) {
			List<Integer> indexes = World.getRegion(regionId).getNPCsIndexes();
			if (indexes == null)
				continue;
			for (int npcIndex : indexes) {
				if (localNPCs.size() == Settings.LOCAL_NPCS_LIMIT)
					break;
				NPC n = World.getNPCs().get(npcIndex);
				if (n == null || n.hasFinished() || localNPCs.contains(n)
						|| !(n.withinDistance(player, 14) && (/* !player.hasLargeSceneView() || */player.getMapRegionsIds().contains(n.getRegionId()))) || n.isDead())
					continue;
				stream.writeBits(15, n.getIndex());
				// now always true because of hp
				boolean needUpdate = true;// n.needMasksUpdate() ||
											// n.getLastFaceEntity() != -1 ||
											// n.getCustomCombatLevel() >= 0 ||
											// n.getCustomName() != null ||
											// player.getCombatDefinitions().isNeedTargetReticleUpdate(n);
				int x = n.getX() - player.getX();
				int y = n.getY() - player.getY();
				// if (x < 15)
				// x += 32;
				// if (y < 15)
				// y += 32;
				stream.writeBits(2, n.getPlane());
				stream.writeBits(5, y);
				stream.writeBits(1, n.hasTeleported() ? 1 : 0);// +;
				stream.writeBits(3, (n.getDirection() >> 11) - 4);
				stream.writeBits(15, n.getId());
				stream.writeBits(5, x);
				stream.writeBits(1, needUpdate ? 1 : 0);// +;

				localNPCs.add(n);
				if (needUpdate)
					appendUpdateBlock(n, updateBlockData, true);
			}
		}
	}

	private void appendUpdateBlock(NPC n, OutputStream data, boolean added) {
		int mask = 0;
		if (n.getNextTransformation() != null) {
			mask |= 0x1;
		}
		if (added || n.isNeedTargetInformationUpdate()) {
			mask |= 0x200000;
		}
		if (added || n.isRefreshHeadIcon()) {
			mask |= 0x40000;
		}
		if (n.getNextFaceEntity() != -2 || (added && n.getLastFaceEntity() != -1)) {
			mask |= 0x10;
		}
		if (!n.getNextHits().isEmpty() || !n.getNextHitBars().isEmpty()) {
			mask |= 0x80;
		}
		if (player.getCombatDefinitions().isNeedTargetReticuleUpdate(n)) {
			mask |= 0x10000000;
		}
		if (n.getNextGraphics2() != null) {
			mask |= 0x400;
		}
		if (n.getCustomName() != null) {
			mask |= 0x800000;
		}
		if (n.getNextAnimation() != null) {
			mask |= 0x20;
		}
		if (n.getNextForceMovement() != null) {
			mask |= 0x2000;
		}
		if (n.getNextFaceWorldTile() != null && n.getNextRunDirection() == -1 && n.getNextWalkDirection() == -1) {
			mask |= 0x40;
		}
		if (n.getNextGraphics4() != null) {
			mask |= 0x4000000;
		}
		if (n.getCustomCombatLevel() >= 0) {
			mask |= 0x20000;
		}
		if (n.getNextGraphics3() != null) {
			mask |= 0x2000000;
		}
		if (n.getNextForceTalk() != null) {
			mask |= 0x8;
		}
		if (n.getNextGraphics1() != null) {
			mask |= 0x4;
		}
		if (mask >= 0xff) {
			mask |= 0x2;
		}
		if (mask >= 0xffff) {
			mask |= 0x200;
		}
		if (mask >= 0xffffff) {
			mask |= 0x400000;
		}
		data.writeShort(0); // rs doesnt use this lol
		data.writeByte(mask);

		if (mask >= 0xff) {
			data.writeByte(mask >> 8);
		}
		if (mask >= 0xffff) {
			data.writeByte(mask >> 16);
		}
		if (mask >= 0xffffff) {
			data.writeByte(mask >> 24);
		}
		if (n.getNextTransformation() != null) {
			applyTransformationMask(n, data);
		}
		if (added || n.isNeedTargetInformationUpdate()) {
			applyTargetInformationMask(n, data);
		}
		if (added || n.isRefreshHeadIcon()) {
			applyIconMask(n, data);
		}
		if (n.getNextFaceEntity() != -2 || (added && n.getLastFaceEntity() != -1)) {
			applyFaceEntityMask(n, data);
		}
		if (!n.getNextHits().isEmpty() || !n.getNextHitBars().isEmpty()) {
			applyHitsMask(n, data);
		}
		if (player.getCombatDefinitions().isNeedTargetReticuleUpdate(n)) {
			applyTargetReticuleMask(n, data);
		}
		if (n.getNextGraphics2() != null) {
			applyGraphicsMask2(n, data);
		}
		if (n.getCustomName() != null) {
			applyNameChangeMask(n, data);
		}
		if (n.getNextAnimation() != null) {
			applyAnimationMask(n, data);
		}
		if (n.getNextForceMovement() != null) {
			applyForceMovementMask(n, data);
		}
		if (n.getNextFaceWorldTile() != null && n.getNextRunDirection() == -1 && n.getNextWalkDirection() == -1) {
			applyFaceWorldTileMask(n, data);
		}
		if (n.getNextGraphics4() != null) {
			applyGraphicsMask4(n, data);
		}
		if (n.getCustomCombatLevel() >= 0) {
			applyChangeLevelMask(n, data);
		}
		if (n.getNextGraphics3() != null) {
			applyGraphicsMask3(n, data);
		}
		if (n.getNextForceTalk() != null) {
			applyForceTalkMask(n, data);
		}
		if (n.getNextGraphics1() != null) {
			applyGraphicsMask1(n, data);
		}
	}

	private void applyTargetInformationMask(NPC n, OutputStream data) {
		data.writeByte(1);
		data.write128Byte(3);
		data.writeIntV2(n.getHitpoints());
		data.write24BitIntegerV3(n.getMaxHitpoints());
	}

	private void applyTargetReticuleMask(NPC n, OutputStream data) {
		Graphics reticle = player.getCombatDefinitions().getTargetReticule(n);
		data.writeShort(reticle.getId());
		data.writeIntV2(reticle.getSettingsHash());
		data.writeByte(reticle.getSettings2Hash());
	}

	private void applyChangeLevelMask(NPC n, OutputStream data) {
		data.writeShort(n.getCombatLevel());
	}

	private void applyNameChangeMask(NPC npc, OutputStream data) {
		data.writeString(npc.getName());
	}

	private void applyTransformationMask(NPC n, OutputStream data) {
		data.writeBigSmart(n.getNextTransformation().getToNPCId());
	}

	private void applyForceTalkMask(NPC n, OutputStream data) {
		data.writeString(n.getNextForceTalk().getText());
	}

	private void applyForceMovementMask(NPC n, OutputStream data) {
		data.writeByte(n.getNextForceMovement().getToFirstTile().getX() - n.getX());
		data.write128Byte(n.getNextForceMovement().getToFirstTile().getY() - n.getY());
		data.writeByte(n.getNextForceMovement().getToSecondTile() == null ? 0 : n.getNextForceMovement().getToSecondTile().getX() - n.getX());
		data.writeByteC(n.getNextForceMovement().getToSecondTile() == null ? 0 : n.getNextForceMovement().getToSecondTile().getY() - n.getY());
		data.write128Byte(0);// new in 876
		data.writeByteC(0);// new in 876
		data.writeShortLE128((n.getNextForceMovement().getFirstTileTicketDelay() * 600) / 20);
		data.writeShort128(n.getNextForceMovement().getToSecondTile() == null ? 0 : ((n.getNextForceMovement().getSecondTileTicketDelay() * 600) / 20));
		data.writeShortLE(n.getNextForceMovement().getDirection());
	}

	private void applyFaceWorldTileMask(NPC n, OutputStream data) {
		data.writeShortLE128((n.getNextFaceWorldTile().getX() * 2) + n.getNextFaceWorldTile().getSizeX());
		data.writeShortLE((n.getNextFaceWorldTile().getY() * 2) + n.getNextFaceWorldTile().getSizeY());
	}

	private void applyHitsMask(NPC n, OutputStream data) {
		data.writeByte(n.getNextHits().size());
		for (Hit hit : n.getNextHits()) {
			boolean interactingWith = hit.interactingWith(player, n);
			if (hit.missed() && !interactingWith) {
				data.writeSmart(32766);
				data.writeByte128(hit.getDamageDisplay(player)); // dont ask me
																	// why, 32766
																	// sets dmg but
																	// no hitmark.
			} else {
				if (hit.getSoaking() != null) {
					data.writeSmart(32767);
					data.writeSmart(hit.getMark(player, n));
					data.writeSmart(hit.getDamageDisplay(player));
					data.writeSmart(hit.getSoaking().getMark(player, n));
					data.writeSmart(hit.getSoaking().getDamageDisplay(player));
				} else {
					data.writeSmart(hit.getMark(player, n));
					data.writeSmart(hit.getDamageDisplay(player));
				}
			}
			data.writeSmart(hit.getDelay());
		}
		data.writeByteC(n.getNextHitBars().size());
		for (HitBar bar : n.getNextHitBars()) {
			data.writeSmart(bar.getType());
			int perc = bar.getPercentage();
			int toPerc = bar.getToPercentage();
			boolean display = bar.display(player);
			data.writeSmart(display ? perc != toPerc ? 1 : 0 : 32767);
			if (display) {
				data.writeSmart(bar.getDelay());
				data.write128Byte(perc);
				if (toPerc != perc)
					data.writeByte(toPerc);
			}
		}
	}

	private void applyFaceEntityMask(NPC n, OutputStream data) {
		data.writeShort128(n.getNextFaceEntity() == -2 ? n.getLastFaceEntity() : n.getNextFaceEntity());
	}

	private void applyAnimationMask(NPC n, OutputStream data) {
		for (int id : n.getNextAnimation().getIds())
			data.writeBigSmart(id);
		data.write128Byte(n.getNextAnimation().getDelay());
	}

	private void applyGraphicsMask4(NPC n, OutputStream data) {
		data.writeShortLE(n.getNextGraphics4().getId());
		data.writeInt(n.getNextGraphics4().getSettingsHash());
		data.writeByte128(n.getNextGraphics4().getSettings2Hash());
	}

	private void applyGraphicsMask3(NPC n, OutputStream data) {
		data.writeShortLE128(n.getNextGraphics3().getId());
		data.writeInt(n.getNextGraphics3().getSettingsHash());
		data.writeByteC(n.getNextGraphics3().getSettings2Hash());
	}

	private void applyGraphicsMask2(NPC n, OutputStream data) {
		data.writeShort128(n.getNextGraphics2().getId());
		data.writeIntLE(n.getNextGraphics2().getSettingsHash());
		data.writeByteC(n.getNextGraphics2().getSettings2Hash());
	}

	private void applyGraphicsMask1(NPC n, OutputStream data) {
		data.writeShort(n.getNextGraphics1().getId());
		data.writeInt(n.getNextGraphics1().getSettingsHash());
		data.writeByte(n.getNextGraphics1().getSettings2Hash());
	}

	private void applyIconMask(NPC n, OutputStream data) {
		HeadIcon[] icons = n.getIcons();
		int mask = 0;
		for (int i = 0; i < icons.length; i++)
			mask |= 1 << i;
		data.write128Byte(mask);
		for (HeadIcon icon : icons) {
			data.writeBigSmart(icon.getSpriteId());
			data.writeSmart(icon.getFileId() + 1);
		}
	}
}
