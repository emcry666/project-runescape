package com.rs.net.decoders;

import com.rs.Launcher;
import com.rs.Settings;
import com.rs.game.Animation;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.item.FloorItem;
import com.rs.game.item.Item;
import com.rs.game.minigames.clanwars.ClanWars;
import com.rs.game.npc.NPC;
import com.rs.game.npc.familiar.Familiar;
import com.rs.game.npc.familiar.Familiar.SpecialAttack;
import com.rs.game.player.Inventory;
import com.rs.game.player.LogicPacket;
import com.rs.game.player.Player;
import com.rs.game.player.PublicChatMessage;
import com.rs.game.player.QuickChatMessage;
import com.rs.game.player.Skills;
import com.rs.game.player.TemporaryAttributes.Key;
import com.rs.game.player.actions.PlayerCombat;
import com.rs.game.player.actions.PlayerFollow;
import com.rs.game.player.actions.Summoning;
import com.rs.game.player.content.Commands;
import com.rs.game.player.content.ExperienceWell;
import com.rs.game.player.content.FriendChatsManager;
import com.rs.game.player.content.Magic;
import com.rs.game.player.content.Notes.Note;
import com.rs.game.player.content.Shop;
import com.rs.game.player.content.SkillCapeCustomizer;
import com.rs.game.player.content.WellOfFortune;
import com.rs.game.player.content.bot.Bot;
import com.rs.game.player.content.bot.BotList;
import com.rs.game.player.content.bot.action.BotActionHandler;
import com.rs.game.player.content.clans.ClansManager;
import com.rs.game.player.content.construction.House;
import com.rs.game.player.content.construction.TabletMaking;
import com.rs.game.player.content.instancing.bossInstance.BossInstanceController;
import com.rs.game.player.content.instancing.bossInstance.BossInstanceHandler;
import com.rs.game.player.content.instancing.bossInstance.BossInstanceHandler.Boss;
import com.rs.game.player.content.land.LandHandler;
import com.rs.game.player.content.land.trans.LandTransaction;
import com.rs.game.player.content.stealingcreations.StealingCreationController;
import com.rs.game.player.content.stealingcreations.StealingCreationLobbyController;
import com.rs.game.player.controlers.DungeonController;
import com.rs.game.player.pathing.FixedTileStrategy;
import com.rs.game.player.pathing.RouteEvent;
import com.rs.game.player.pathing.RouteFinder;
import com.rs.io.InputStream;
import com.rs.net.Session;
import com.rs.net.decoders.handlers.ButtonHandler;
import com.rs.net.decoders.handlers.InventoryOptionsHandler;
import com.rs.net.decoders.handlers.NPCHandler;
import com.rs.net.decoders.handlers.ObjectHandler;
import com.rs.utils.Archiver;
import com.rs.utils.DisplayNames;
import com.rs.utils.Logger;
import com.rs.utils.SerializableFilesManager;
import com.rs.utils.Utils;
import com.rs.utils.huffman.Huffman;

public final class WorldPacketsDecoder extends Decoder {

	private static final byte[] PACKET_SIZES = new byte[104];

	private final static int WALKING_PACKET = 8, GE_SEARCH_PACKET = 71;
	private final static int MINI_WALKING_PACKET = 58;
	private final static int AFK_PACKET = -1;
	public final static int ACTION_BUTTON1_PACKET = 14;
	public final static int ACTION_BUTTON2_PACKET = 67;
	public final static int ACTION_BUTTON3_PACKET = 5;
	public final static int ACTION_BUTTON4_PACKET = 55;
	public final static int ACTION_BUTTON5_PACKET = 68;
	public final static int ACTION_BUTTON6_PACKET = 90;
	public final static int ACTION_BUTTON7_PACKET = 6;
	public final static int ACTION_BUTTON8_PACKET = 32;
	public final static int ACTION_BUTTON9_PACKET = 27;
	public final static int WORLD_MAP_CLICK = 38;
	public final static int ACTION_BUTTON10_PACKET = 96;
	public final static int RECEIVE_PACKET_COUNT_PACKET = 33;
	private final static int MAGIC_ON_ITEM_PACKET = -1;
	private final static int PLAYER_OPTION_4_PACKET = 17;
	private final static int MOVE_CAMERA_PACKET = 103;
	private final static int INTERFACE_ON_OBJECT = 37;
	private final static int CLICK_PACKET = -1;
	private final static int MOUVE_MOUSE_PACKET = -1;
	private final static int KEY_TYPED_PACKET = -1;
	private final static int CLOSE_INTERFACE_PACKET = 54;
	private final static int COMMANDS_PACKET = 60;
	private final static int ITEM_ON_ITEM_PACKET = 3;
	private final static int IN_OUT_SCREEN_PACKET = -1;
	private final static int DONE_LOADING_REGION_PACKET = 30;
	private final static int PING_PACKET = 21;
	private final static int SCREEN_PACKET = 98;
	private final static int CHAT_TYPE_PACKET = 83;
	private final static int CHAT_PACKET = 53;
	private final static int PUBLIC_QUICK_CHAT_PACKET = 86;
	private final static int ADD_FRIEND_PACKET = 89;
	private final static int ADD_IGNORE_PACKET = 4;
	private final static int REMOVE_IGNORE_PACKET = 73;
	private final static int JOIN_FRIEND_CHAT_PACKET = 36;
	private final static int CHANGE_FRIEND_CHAT_PACKET = 22;
	private final static int KICK_FRIEND_CHAT_PACKET = 74;
	private final static int REMOVE_FRIEND_PACKET = 24;
	private final static int SEND_FRIEND_MESSAGE_PACKET = 82;
	private final static int SEND_FRIEND_QUICK_CHAT_PACKET = 0;
	private final static int OBJECT_CLICK1_PACKET = 26;
	private final static int OBJECT_CLICK2_PACKET = 59;
	private final static int OBJECT_CLICK3_PACKET = 40;
	private final static int OBJECT_CLICK4_PACKET = 23;
	private final static int OBJECT_CLICK5_PACKET = 80;
	private final static int OBJECT_EXAMINE_PACKET = 25;
	private final static int NPC_CLICK1_PACKET = 31;
	private final static int NPC_CLICK2_PACKET = 101;
	private final static int NPC_CLICK3_PACKET = 34;
	private final static int NPC_CLICK4_PACKET = 65;
	private final static int ATTACK_NPC = 20;
	private final static int PLAYER_OPTION_1_PACKET = 42;
	private final static int PLAYER_OPTION_2_PACKET = 46;
	private final static int ITEM_TAKE_PACKET = 57;
	private final static int DIALOGUE_CONTINUE_PACKET = 72;
	public final static int PLAYER_OPTION_9_PACKET = 56;
	private final static int ENTER_INTEGER_PACKET = 81;
	private final static int ENTER_NAME_PACKET = 29;
	private final static int ENTER_STRING_PACKET = -1;
	private final static int SWITCH_INTERFACE_ITEM_PACKET = 76;
	private final static int INTERFACE_ON_PLAYER = 50;
	private final static int INTERFACE_ON_NPC = 66;
	private final static int COLOR_ID_PACKET = 97;
	private static final int NPC_EXAMINE_PACKET = 9;
	private final static int REPORT_ABUSE_PACKET = -1;
	private final static int PLAYER_OPTION_5_PACKET = 77;


	private Player player;
	private int chatType;

	public WorldPacketsDecoder(Session session, Player player) {
		super(session);
		this.player = player;
	}


	static {
		PACKET_SIZES[0] = -1;
		PACKET_SIZES[1] = -2;
		PACKET_SIZES[2] = -1;
		PACKET_SIZES[3] = 20;
		PACKET_SIZES[4] = -1;
		PACKET_SIZES[5] = 10;
		PACKET_SIZES[6] = 10;
		PACKET_SIZES[7] = 3;
		PACKET_SIZES[8] = -1;
		PACKET_SIZES[9] = 3;
		PACKET_SIZES[10] = -1;
		PACKET_SIZES[11] = -1;
		PACKET_SIZES[12] = -1;
		PACKET_SIZES[13] = 7;
		PACKET_SIZES[14] = 10;
		PACKET_SIZES[15] = 6;
		PACKET_SIZES[16] = 2;
		PACKET_SIZES[17] = 3;
		PACKET_SIZES[18] = -1;
		PACKET_SIZES[19] = -2;
		PACKET_SIZES[20] = 3;
		PACKET_SIZES[21] = 0;
		PACKET_SIZES[22] = -1;
		PACKET_SIZES[23] = 9;
		PACKET_SIZES[24] = -1;
		PACKET_SIZES[25] = 9;
		PACKET_SIZES[26] = 9;
		PACKET_SIZES[27] = 10;
		PACKET_SIZES[28] = 4;
		PACKET_SIZES[29] = -1;
		PACKET_SIZES[30] = 0;
		PACKET_SIZES[31] = 3;
		PACKET_SIZES[32] = 10;
		PACKET_SIZES[33] = 4;
		PACKET_SIZES[34] = 3;
		PACKET_SIZES[35] = -1;
		PACKET_SIZES[36] = -1;
		PACKET_SIZES[37] = 19;
		PACKET_SIZES[38] = 4;
		PACKET_SIZES[39] = 4;
		PACKET_SIZES[40] = 9;
		PACKET_SIZES[41] = -1;
		PACKET_SIZES[42] = 3;
		PACKET_SIZES[43] = 9;
		PACKET_SIZES[44] = -2;
		PACKET_SIZES[45] = 9;
		PACKET_SIZES[46] = 3;
		PACKET_SIZES[47] = 4;
		PACKET_SIZES[48] = -1;
		PACKET_SIZES[49] = 3;
		PACKET_SIZES[50] = 13;
		PACKET_SIZES[51] = 3;
		PACKET_SIZES[52] = -1;
		PACKET_SIZES[53] = -1;
		PACKET_SIZES[54] = 0;
		PACKET_SIZES[55] = 10;
		PACKET_SIZES[56] = 3;
		PACKET_SIZES[57] = 9;
		PACKET_SIZES[58] = -1;
		PACKET_SIZES[59] = 9;
		PACKET_SIZES[60] = -1;
		PACKET_SIZES[61] = 9;
		PACKET_SIZES[62] = 9;
		PACKET_SIZES[63] = 12;
		PACKET_SIZES[64] = 4;
		PACKET_SIZES[65] = 3;
		PACKET_SIZES[66] = 13;
		PACKET_SIZES[67] = 10;
		PACKET_SIZES[68] = 10;
		PACKET_SIZES[69] = 15;
		PACKET_SIZES[70] = 1;
		PACKET_SIZES[71] = 2;
		PACKET_SIZES[72] = 6;
		PACKET_SIZES[73] = -1;
		PACKET_SIZES[74] = -1;
		PACKET_SIZES[75] = -2;
		PACKET_SIZES[76] = 16;
		PACKET_SIZES[77] = 3;
		PACKET_SIZES[78] = 1;
		PACKET_SIZES[79] = 3;
		PACKET_SIZES[80] = 9;
		PACKET_SIZES[81] = 4;
		PACKET_SIZES[82] = -2;
		PACKET_SIZES[83] = 1;
		PACKET_SIZES[84] = 1;
		PACKET_SIZES[85] = 3;
		PACKET_SIZES[86] = -1;
		PACKET_SIZES[87] = 4;
		PACKET_SIZES[88] = 3;
		PACKET_SIZES[89] = -1;
		PACKET_SIZES[90] = 10;
		PACKET_SIZES[91] = -2;
		PACKET_SIZES[92] = -1;
		PACKET_SIZES[93] = -1;
		PACKET_SIZES[94] = 9;
		PACKET_SIZES[95] = -2;
		PACKET_SIZES[96] = 10;
		PACKET_SIZES[97] = 2;
		PACKET_SIZES[98] = 6;
		PACKET_SIZES[99] = 2;
		PACKET_SIZES[100] = -2;
		PACKET_SIZES[101] = 3;
		PACKET_SIZES[102] = 9;
		PACKET_SIZES[103] = 4;
	}

	@Override
	public void decode(InputStream stream) {
		while (stream.getRemaining() > 0 && session.getChannel().isConnected()
				&& !player.hasFinished()) {
			int packetId = stream.readPacket(player);
			if (packetId >= PACKET_SIZES.length || packetId < 0) {
				if (Settings.DEBUG)
					System.out.println("PacketId " + packetId
							+ " has fake packet id.");
				break;
			}
			int length = PACKET_SIZES[packetId];
			if (length == -1)
				length = stream.readUnsignedByte();
			else if (length == -2)
				length = stream.readUnsignedShort();
			else if (length == -3)
				length = stream.readInt();
			else if (length == -4) {
				length = stream.getRemaining();
				if (Settings.DEBUG)
					System.out.println("Invalid size for PacketId " + packetId
							+ ". Size guessed to be " + length);
			}
			if (length > stream.getRemaining()) {
				length = stream.getRemaining();
				if (Settings.DEBUG)
					System.out.println("PacketId " + packetId
							+ " has fake size. - expected size " + length);
				// break;

			}
			/*
			 * System.out.println("PacketId " +packetId+
			 * " has . - expected size " +length);
			 */
			int startOffset = stream.getOffset();
			processPackets(packetId, stream, length);
			stream.setOffset(startOffset + length);
		}
	}

	public static void decodeLogicPacket(final Player player, LogicPacket packet) {
		int packetId = packet.getId();
		InputStream stream = new InputStream(packet.getData());

		if (packetId == WALKING_PACKET || packetId == MINI_WALKING_PACKET) {
			if (!player.hasStarted() || !player.clientHasLoadedMapRegion()
					|| player.isDead())  {
				return;
				
			}
			
			long currentTime = Utils.currentTimeMillis();
			if (player.getLockDelay() > currentTime) {
				return;
			}
			if(!player.getPlayerPin().hasEnteredPin()) {
				player.getPackets().sendGameMessage("You have not entered your player pin.");
				return;
			}
			if (player.getFreezeDelay() >= currentTime) {
				player.getPackets().sendGameMessage(
						"A magical force prevents you from moving.");
				return;
			}
			int length = stream.getLength();
			int baseX = stream.readUnsignedShort128();
			boolean forceRun = stream.readUnsigned128Byte() == 1;
			int baseY = stream.readUnsignedShort128();
			int steps = (length - 5) / 2;
			if (steps > 25)
				steps = 25;
			player.stopAll();
			if (forceRun)
				player.setRun(forceRun);

			if (steps > 0) {
				int x = 0, y = 0;
				for (int step = 0; step < steps; step++) {
					x = baseX + stream.readUnsignedByte();
					y = baseY + stream.readUnsignedByte();
				}

				steps = RouteFinder.findRoute(RouteFinder.WALK_ROUTEFINDER,
						player.getX(), player.getY(), player.getPlane(),
						player.getSize(), new FixedTileStrategy(x, y), true);
				int[] bufferX = RouteFinder.getLastPathBufferX();
				int[] bufferY = RouteFinder.getLastPathBufferY();
				int last = -1;
				for (int i = steps - 1; i >= 0; i--) {
					if (!player.addWalkSteps(bufferX[i], bufferY[i], 25, true))
						break;
					last = i;
				}

				if (last != -1) {
					WorldTile tile = new WorldTile(bufferX[last], bufferY[last],
							player.getPlane());
					player.getPackets().sendMinimapFlag(
							tile.getLocalX(player.getLastLoadedMapRegionTile(),
									player.getMapSize()),
									tile.getLocalY(player.getLastLoadedMapRegionTile(),
											player.getMapSize()));
				} else {
					player.getPackets().sendResetMinimapFlag();
				}
			}
		} else if (packetId == INTERFACE_ON_OBJECT) {
			boolean forceRun = stream.readByte128() == 1;
			int itemId = stream.readInt();
			int y = stream.readShortLE128();
			int objectId = stream.readIntV2();
			int interfaceHash = stream.readInt();
			final int interfaceId = interfaceHash >> 16;
			int slot = stream.readShortLE();
			int x = stream.readShort128();
			if (!player.hasStarted() || !player.clientHasLoadedMapRegion()
					|| player.isDead())
				return;
			long currentTime = Utils.currentTimeMillis();
			if (player.getLockDelay() >= currentTime || player.getEmotesManager().getNextEmoteEnd() >= currentTime)
				return;
			if (player.getFreezeDelay() >= currentTime) {
				player.getPackets().sendGameMessage(
						"A magical force prevents you from moving.");
				return;
			}
			final WorldTile tile = new WorldTile(x, y, player.getPlane());
			int regionId = tile.getRegionId();
			if (!player.getMapRegionsIds().contains(regionId))
				return;
			WorldObject mapObject = World.getObjectWithId(tile, objectId);
			if (mapObject == null || mapObject.getId() != objectId)
				return;
			final WorldObject object = !player.isAtDynamicRegion() ? mapObject : new WorldObject(objectId, mapObject.getType(), mapObject.getRotation(), x, y, player.getPlane());
			final Item item = player.getInventory().getItem(slot);
			if (player.isDead() || Utils.getInterfaceDefinitionsSize() <= interfaceId)
				return;
			if (player.getLockDelay() > Utils.currentTimeMillis())
				return;
			if (!player.getInterfaceManager().containsInterface(interfaceId))
				return;
			if(player.getFrozenBlockedDelay() > Utils.currentTimeMillis())
				return;
			if (item == null || item.getId() != itemId)
				return;
			player.stopAll(false); // false
			if(forceRun)
				player.setRun(forceRun);
			switch (interfaceId) {
			case Inventory.INVENTORY_INTERFACE: // inventory
				ObjectHandler.handleItemOnObject(player, object, interfaceId, item);
				break;
			}
		} else if (packetId == PLAYER_OPTION_2_PACKET) {
			if (!player.hasStarted() || !player.clientHasLoadedMapRegion()
					|| player.isDead())
				return;
			@SuppressWarnings("unused")
			boolean unknown = stream.readByte() == 1;
			int playerIndex = stream.readUnsignedShortLE128();
			Player p2 = World.getPlayers().get(playerIndex);
			if (p2 == null || p2.isDead() || p2.hasFinished()
					|| !player.getMapRegionsIds().contains(p2.getRegionId()))
				return;
			if (player.getLockDelay() > Utils.currentTimeMillis())
				return;
			if(player.getFrozenBlockedDelay() > Utils.currentTimeMillis())
				return;
			if (player.getFreezeDelay() >= Utils.currentTimeMillis()) {
				player.getPackets().sendGameMessage(
						"A magical force prevents you from moving.");
				return;
			}
			player.stopAll(false);
			player.getActionManager().setAction(new PlayerFollow(p2));
		} else if (packetId == PLAYER_OPTION_4_PACKET) {
			@SuppressWarnings("unused")
			boolean unknown = stream.readByte() == 1;
			int playerIndex = stream.readUnsignedShortLE128();
			Player p2 = World.getPlayers().get(playerIndex);
			if (p2 == null || p2.isDead() || p2.hasFinished()
					|| !player.getMapRegionsIds().contains(p2.getRegionId()))
				return;
			if (player.getLockDelay() > Utils.currentTimeMillis())
				return;
			if(player.getFrozenBlockedDelay() > Utils.currentTimeMillis())
				return;
			if (player.getFreezeDelay() >= Utils.currentTimeMillis()) {
				player.getPackets().sendGameMessage(
						"A magical force prevents you from moving.");
				return;
			}
			player.stopAll(false);
			if(player.isCantTrade() || player.getControlerManager().getControler() != null && player.getControlerManager().getControler() instanceof StealingCreationLobbyController) {
				player.getPackets().sendGameMessage("You are busy.");
				return;
			}

			if (player.isIronman()) {
				player.sm("You cannot trade as an Ironman.");
				return;
			}
			if (p2.isIronman()) {
				p2.sm("You cannot trade Ironman accounts.");
			}
			if(player.isCantTrade()) {
				player.getPackets().sendGameMessage("You are busy.");
				return;
			}
			if (p2.getInterfaceManager().containsScreenInter() || p2.isCantTrade()) {
				player.getPackets().sendGameMessage("The other player is busy.");
				return;
			}
			if (!p2.withinDistance(player, 14)) {
				player.getPackets().sendGameMessage(
						"Unable to find target "+p2.getDisplayName());
				return;
			}


			if (p2.getTemporaryAttributtes().get("TradeTarget") == player) {
				p2.getTemporaryAttributtes().remove("TradeTarget");
				player.getTrade().openTrade(p2);
				p2.getTrade().openTrade(player);
				return;
			}
			player.getTemporaryAttributtes().put("TradeTarget", p2);
			player.getPackets().sendGameMessage("Sending " + p2.getDisplayName() + " a request...");
			p2.getPackets().sendTradeRequestMessage(player);
		} else if (packetId == PLAYER_OPTION_1_PACKET) {
			if (!player.hasStarted() || !player.clientHasLoadedMapRegion()
					|| player.isDead())
				return;
			@SuppressWarnings("unused")
			boolean unknown = stream.readByte() == 1;
			int playerIndex = stream.readUnsignedShortLE128();
			Player p2 = World.getPlayers().get(playerIndex);
			if (p2 == null || p2.isDead() || p2.hasFinished()
					|| !player.getMapRegionsIds().contains(p2.getRegionId()))
				return;
			if (player.getLockDelay() > Utils.currentTimeMillis()
					|| !player.getControlerManager().canPlayerOption1(p2))
				return;
			if (player.getFreezeDelay() >= Utils.currentTimeMillis()) {
				player.getPackets().sendGameMessage(
						"A magical force prevents you from moving.");
				return;
			}
			if (!player.isCanPvp())
				return;
			if (!player.getControlerManager().canAttack(p2))
				return;

			if (!player.isCanPvp() || !p2.isCanPvp()) {
				player.getPackets()
				.sendGameMessage(
						"You can only attack players in a player-vs-player area.");
				return;
			}
			if (!p2.isAtMultiArea() || !player.isAtMultiArea()) {
				if(!(player.getControlerManager().getControler() instanceof BossInstanceController)) {
					if (player.getAttackedBy() != p2
							&& player.getAttackedByDelay() > Utils
							.currentTimeMillis()) {
						player.getPackets().sendGameMessage(
								"You are already in combat.");
						return;
					}
					if (p2.getAttackedBy() != player
							&& p2.getAttackedByDelay() > Utils.currentTimeMillis()) {
						if (p2.getAttackedBy() instanceof NPC) {
							p2.setAttackedBy(player); // changes enemy to player,
							// player has priority over
							// npc on single areas
						} else {
							player.getPackets().sendGameMessage(
									"That player is already in combat.");
							return;
						}
					}
				}
			}
			player.stopAll(false);
			player.getActionManager().setAction(new PlayerCombat(p2));
		} else if (packetId == PLAYER_OPTION_9_PACKET) {
			boolean forceRun = stream.readUnsignedByte() == 1;
			int playerIndex = stream.readUnsignedShortLE128();
			Player p2 = World.getPlayers().get(playerIndex);
			if (p2 == null || p2 == player || p2.isDead() || p2.hasFinished() || !player.getMapRegionsIds().contains(p2.getRegionId()))
				return;
			if (player.isLocked())
				return;
			if (player.getFreezeDelay() >= Utils.currentTimeMillis()) {
				player.getPackets().sendGameMessage(
						"A magical force prevents you from moving.");
				return;
			}
			if (forceRun)
				player.setRun(forceRun);
			player.stopAll();
			ClansManager.viewInvite(player, p2);
		} else if (packetId == ATTACK_NPC) {
			if (!player.hasStarted() || !player.clientHasLoadedMapRegion()
					|| player.isDead()) {
				return;
			}
			if (player.getLockDelay() > Utils.currentTimeMillis()) {
				return;
			}
			if (player.getFreezeDelay() >= Utils.currentTimeMillis()) {
				player.getPackets().sendGameMessage(
						"A magical force prevents you from moving.");
				return;
			}
			int npcIndex = stream.readUnsignedShort128();
			boolean forceRun = stream.read128Byte() == 1;
			if(forceRun)
				player.setRun(forceRun);
			NPC npc = World.getNPCs().get(npcIndex);
			if (npc == null || npc.isDead() || npc.hasFinished()
					|| !player.getMapRegionsIds().contains(npc.getRegionId())
					|| !npc.getDefinitions().hasAttackOption()) {
				return;
			}
			if (!player.getControlerManager().canAttack(npc)) {
				return;
			}
			if (npc instanceof Familiar) {
				Familiar familiar = (Familiar) npc;
				if (familiar == player.getFamiliar()) {
					player.getPackets().sendGameMessage(
							"You can't attack your own familiar.");
					return;
				}
				if (!familiar.canAttack(player)) {
					player.getPackets().sendGameMessage(
							"You can't attack this npc.");
					return;
				}
			} else if (!npc.isForceMultiAttacked()) {
				if (!npc.isAtMultiArea() || !player.isAtMultiArea()) {
					if(!(player.getControlerManager().getControler() instanceof BossInstanceController)) {
						if (player.getAttackedBy() != npc
								&& player.getAttackedByDelay() > Utils
								.currentTimeMillis()) {
							player.getPackets().sendGameMessage(
									"You are already in combat.");
							return;
						}
						if (npc.getAttackedBy() != player
								&& npc.getAttackedByDelay() > Utils
								.currentTimeMillis()) {
							player.getPackets().sendGameMessage(
									"This npc is already in combat.");
							return;
						}
					}
				}
			}
			player.stopAll(false);
			player.getActionManager().setAction(new PlayerCombat(npc));
		} else if (packetId == INTERFACE_ON_PLAYER) {
			if (!player.hasStarted() || !player.clientHasLoadedMapRegion()
					|| player.isDead())
				return;
			if (player.getLockDelay() > Utils.currentTimeMillis())
				return;
			if (player.getFreezeDelay() >= Utils.currentTimeMillis()) {
				player.getPackets().sendGameMessage(
						"A magical force prevents you from moving.");
				return;
			}
			final int itemId = stream.readInt();
			int playerIndex = stream.readUnsignedShort();
			int interfaceHash = stream.readIntV2();
			@SuppressWarnings("unused")
			int interfaceSlot = stream.readUnsignedShortLE128();
			@SuppressWarnings("unused")
			final boolean forceRun = stream.read128Byte() == 1;
			int interfaceId = interfaceHash >> 16;
			int componentId = interfaceHash & 0xFF;
			if (Utils.getInterfaceDefinitionsSize() <= interfaceId)
				return;
			if (!player.getInterfaceManager().containsInterface(interfaceId))
				return;
			if (componentId == 65535)
				componentId = -1;
			if (componentId != -1
					&& Utils.getInterfaceDefinitionsComponentsSize(interfaceId) <= componentId)
				return;
			Player p2 = World.getPlayers().get(playerIndex);
			if (p2 == null || p2.isDead() || p2.hasFinished()
					|| !player.getMapRegionsIds().contains(p2.getRegionId()))
				return;
			player.stopAll(false);
			switch (interfaceId) {
			case 1110:
				if (componentId == 87) {
					if(!player.withinDistance(p2, 2)) {
						player.setRouteEvent(new RouteEvent(p2, new Runnable() {
							@Override
							public void run() {
								ClansManager.invite(player, p2);
							}
						}));
					}
				}
				break;
			case Inventory.INVENTORY_INTERFACE:// Item on player
				if (!player.getControlerManager()
						.processItemOnPlayer(p2, itemId))
					return;
				if(!player.withinDistance(p2, 2)) {
					player.setRouteEvent(new RouteEvent(p2, new Runnable() {

						@Override
						public void run() {
							InventoryOptionsHandler.handleItemOnPlayer(player, p2, itemId);
						}
					}));
				}
				break;
			case 662:
			case 747:
				if (player.getFamiliar() == null)
					return;
				player.resetWalkSteps();
				if ((interfaceId == 747 && componentId == 15)
						|| (interfaceId == 662 && componentId == 65)
						|| (interfaceId == 662 && componentId == 74)
						|| interfaceId == 747 && componentId == 18) {
					if ((interfaceId == 662 && componentId == 74
							|| interfaceId == 747 && componentId == 24 || interfaceId == 747
							&& componentId == 18)) {
						if (player.getFamiliar().getSpecialAttack() != SpecialAttack.ENTITY)
							return;
					}
					if (!player.isCanPvp() || !p2.isCanPvp()) {
						player.getPackets()
						.sendGameMessage(
								"You can only attack players in a player-vs-player area.");
						return;
					}
					if (!player.getFamiliar().canAttack(p2)) {
						player.getPackets()
						.sendGameMessage(
								"You can only use your familiar in a multi-zone area.");
						return;
					} else {
						player.getFamiliar().setSpecial(
								interfaceId == 662 && componentId == 74
								|| interfaceId == 747
								&& componentId == 18);
						player.getFamiliar().setTarget(p2);
					}
				}
				break;
			case 193:
				switch (componentId) {
				case 28:
				case 32:
				case 24:
				case 20:
				case 30:
				case 34:
				case 26:
				case 22:
				case 29:
				case 33:
				case 25:
				case 21:
				case 31:
				case 35:
				case 27:
				case 23:
					if (Magic.checkCombatSpell(player, componentId, 1, false)) {
						player.setNextFaceWorldTile(new WorldTile(p2
								.getCoordFaceX(p2.getSize()), p2
								.getCoordFaceY(p2.getSize()), p2.getPlane()));
						if (!player.getControlerManager().canAttack(p2))
							return;
						if (!player.isCanPvp() || !p2.isCanPvp()) {
							player.getPackets()
							.sendGameMessage(
									"You can only attack players in a player-vs-player area.");
							return;
						}
						if (!p2.isAtMultiArea() || !player.isAtMultiArea()) {
							if (player.getAttackedBy() != p2
									&& player.getAttackedByDelay() > Utils
									.currentTimeMillis()) {
								player.getPackets()
								.sendGameMessage(
										"That "
												+ (player
														.getAttackedBy() instanceof Player ? "player"
																: "npc")
												+ " is already in combat.");
								return;
							}
							if (p2.getAttackedBy() != player
									&& p2.getAttackedByDelay() > Utils
									.currentTimeMillis()) {
								if (p2.getAttackedBy() instanceof NPC) {
									p2.setAttackedBy(player); // changes enemy
									// to player,
									// player has
									// priority over
									// npc on single
									// areas
								} else {
									player.getPackets()
									.sendGameMessage(
											"That player is already in combat.");
									return;
								}
							}
						}
						player.getActionManager()
						.setAction(new PlayerCombat(p2));
					}
					break;
				}
			case 192:
				switch (componentId) {
				case 25: // air strike
				case 28: // water strike
				case 30: // earth strike
				case 32: // fire strike
				case 34: // air bolt
				case 39: // water bolt
				case 42: // earth bolt
				case 45: // fire bolt
				case 49: // air blast
				case 52: // water blast
				case 58: // earth blast
				case 63: // fire blast
				case 70: // air wave
				case 73: // water wave
				case 77: // earth wave
				case 80: // fire wave
				case 86: // teleblock
				case 84: // air surge
				case 87: // water surge
				case 89: // earth surge
				case 91: // fire surge
				case 99: // storm of armadyl
				case 36: // bind
				case 66: // Sara Strike
				case 67: // Guthix Claws
				case 68: // Flame of Zammy
				case 55: // snare
				case 81: // entangle
					if (Magic.checkCombatSpell(player, componentId, 1, false)) {
						player.setNextFaceWorldTile(new WorldTile(p2
								.getCoordFaceX(p2.getSize()), p2
								.getCoordFaceY(p2.getSize()), p2.getPlane()));
						if (!player.getControlerManager().canAttack(p2))
							return;
						if (!player.isCanPvp() || !p2.isCanPvp()) {
							player.getPackets()
							.sendGameMessage(
									"You can only attack players in a player-vs-player area.");
							return;
						}
						if (!p2.isAtMultiArea() || !player.isAtMultiArea()) {
							if (player.getAttackedBy() != p2
									&& player.getAttackedByDelay() > Utils
									.currentTimeMillis()) {
								player.getPackets()
								.sendGameMessage(
										"That "
												+ (player
														.getAttackedBy() instanceof Player ? "player"
																: "npc")
												+ " is already in combat.");
								return;
							}
							if (p2.getAttackedBy() != player
									&& p2.getAttackedByDelay() > Utils
									.currentTimeMillis()) {
								if (p2.getAttackedBy() instanceof NPC) {
									p2.setAttackedBy(player); // changes enemy
									// to player,
									// player has
									// priority over
									// npc on single
									// areas
								} else {
									player.getPackets()
									.sendGameMessage(
											"That player is already in combat.");
									return;
								}
							}
						}
						player.getActionManager()
						.setAction(new PlayerCombat(p2));
					}
					break;
				}
				break;
			}
			if (Settings.DEBUG)
				System.out.println("Spell:" + componentId);
		} else if (packetId == INTERFACE_ON_NPC) {
			if (!player.hasStarted() || !player.clientHasLoadedMapRegion()
					|| player.isDead())
				return;
			if (player.getLockDelay() > Utils.currentTimeMillis())
				return;
			if (player.getFreezeDelay() >= Utils.currentTimeMillis()) {
				player.getPackets().sendGameMessage(
						"A magical force prevents you from moving.");
				return;
			}
			@SuppressWarnings("unused")
			boolean unknown = stream.readByte() == 1;
			int interfaceHash = stream.readInt();
			int npcIndex = stream.readUnsignedShortLE();
			int interfaceSlot = stream.readUnsignedShortLE128();
			@SuppressWarnings("unused")
			int junk2 =stream.readUnsignedShortLE();
			int interfaceId = interfaceHash >> 16;
			int componentId = interfaceHash - (interfaceId << 16);
			if (Utils.getInterfaceDefinitionsSize() <= interfaceId)
				return;
			if (!player.getInterfaceManager().containsInterface(interfaceId))
				return;
			if (componentId == 65535)
				componentId = -1;
			if (componentId != -1
					&& Utils.getInterfaceDefinitionsComponentsSize(interfaceId) <= componentId)
				return;
			NPC npc = World.getNPCs().get(npcIndex);
			if (npc == null || npc.isDead() || npc.hasFinished()
					|| !player.getMapRegionsIds().contains(npc.getRegionId()))
				return;
			player.stopAll(false);
			if (interfaceId != Inventory.INVENTORY_INTERFACE) {
				if (!npc.getDefinitions().hasAttackOption()) {
					player.getPackets().sendGameMessage(
							"You can't attack this npc.");
					return;
				}
			}
			switch (interfaceId) {
			case Inventory.INVENTORY_INTERFACE:
				Item item = player.getInventory().getItem(interfaceSlot);
				if (item == null || !player.getControlerManager().processItemOnNPC(npc, item) || !player.getControlerManager().processItemOnNPC(npc, item))
					return;
				InventoryOptionsHandler.handleItemOnNPC(player, npc, item);
				break;
			case 1165:
				Summoning.attackDreadnipTarget(npc, player);
				break;
			case 662:
			case 747:
				if (player.getFamiliar() == null)
					return;
				player.resetWalkSteps();
				if ((interfaceId == 747 && componentId == 15)
						|| (interfaceId == 662 && componentId == 65)
						|| (interfaceId == 662 && componentId == 74)
						|| interfaceId == 747 && componentId == 18
						|| interfaceId == 747 && componentId == 24) {
					if ((interfaceId == 662 && componentId == 74 || interfaceId == 747
							&& componentId == 18)) {
						if (player.getFamiliar().getSpecialAttack() != SpecialAttack.ENTITY)
							return;
					}
					if(npc instanceof Familiar) {
						Familiar familiar = (Familiar) npc;
						if (familiar == player.getFamiliar()) {
							player.getPackets().sendGameMessage("You can't attack your own familiar.");
							return;
						}
						if (!player.getFamiliar().canAttack(familiar.getOwner())) {
							player.getPackets().sendGameMessage("You can only attack players in a player-vs-player area.");
							return;
						}
					}
					if (!player.getFamiliar().canAttack(npc)) {
						player.getPackets()
						.sendGameMessage(
								"You can only use your familiar in a multi-zone area.");
						return;
					} else {
						player.getFamiliar().setSpecial(
								interfaceId == 662 && componentId == 74
								|| interfaceId == 747
								&& componentId == 18);
						player.getFamiliar().setTarget(npc);
					}
				}
				break;
			case 193:
				switch (componentId) {
				case 28:
				case 32:
				case 24:
				case 20:
				case 30:
				case 34:
				case 26:
				case 22:
				case 29:
				case 33:
				case 25:
				case 21:
				case 31:
				case 35:
				case 27:
				case 23:
					if (Magic.checkCombatSpell(player, componentId, 1, false)) {
						player.setNextFaceWorldTile(new WorldTile(npc
								.getCoordFaceX(npc.getSize()), npc
								.getCoordFaceY(npc.getSize()), npc.getPlane()));
						if (!player.getControlerManager().canAttack(npc))
							return;
						if (npc instanceof Familiar) {
							Familiar familiar = (Familiar) npc;
							if (familiar == player.getFamiliar()) {
								player.getPackets().sendGameMessage(
										"You can't attack your own familiar.");
								return;
							}
							if (!familiar.canAttack(player)) {
								player.getPackets().sendGameMessage(
										"You can't attack this npc.");
								return;
							}
						} else if (!npc.isForceMultiAttacked()) {
							if(!(player.getControlerManager().getControler() instanceof BossInstanceController)) {
								if (!npc.isAtMultiArea() || !player.isAtMultiArea()) {
									if (player.getAttackedBy() != npc
											&& player.getAttackedByDelay() > Utils
											.currentTimeMillis()) {
										player.getPackets().sendGameMessage(
												"You are already in combat.");
										return;
									}
									if (npc.getAttackedBy() != player
											&& npc.getAttackedByDelay() > Utils
											.currentTimeMillis()) {
										player.getPackets().sendGameMessage(
												"This npc is already in combat.");
										return;
									}
								}
							}
						}
						player.getActionManager().setAction(
								new PlayerCombat(npc));
					}
					break;
				}
			case 192:
				switch (componentId) {
				case 25: // air strike
				case 28: // water strike
				case 30: // earth strike
				case 32: // fire strike
				case 34: // air bolt
				case 39: // water bolt
				case 42: // earth bolt
				case 45: // fire bolt
				case 49: // air blast
				case 52: // water blast
				case 58: // earth blast
				case 63: // fire blast
				case 70: // air wave
				case 73: // water wave
				case 77: // earth wave
				case 80: // fire wave
				case 84: // air surge
				case 87: // water surge
				case 89: // earth surge
				case 66: // Sara Strike
				case 67: // Guthix Claws
				case 68: // Flame of Zammy
				case 93:
				case 91: // fire surge
				case 99: // storm of Armadyl
				case 36: // bind
				case 55: // snare
				case 81: // entangle
					if (Magic.checkCombatSpell(player, componentId, 1, false)) {
						player.setNextFaceWorldTile(new WorldTile(npc
								.getCoordFaceX(npc.getSize()), npc
								.getCoordFaceY(npc.getSize()), npc.getPlane()));
						if (!player.getControlerManager().canAttack(npc))
							return;
						if (npc instanceof Familiar) {
							Familiar familiar = (Familiar) npc;
							if (familiar == player.getFamiliar()) {
								player.getPackets().sendGameMessage(
										"You can't attack your own familiar.");
								return;
							}
							if (!familiar.canAttack(player)) {
								player.getPackets().sendGameMessage(
										"You can't attack this npc.");
								return;
							}
						} else if (!npc.isForceMultiAttacked()) {
							if (!npc.isAtMultiArea() || !player.isAtMultiArea()) {
								if(!(player.getControlerManager().getControler() instanceof BossInstanceController)) {
									if (player.getAttackedBy() != npc
											&& player.getAttackedByDelay() > Utils
											.currentTimeMillis()) {
										player.getPackets().sendGameMessage(
												"You are already in combat.");
										return;
									}
									if (npc.getAttackedBy() != player
											&& npc.getAttackedByDelay() > Utils
											.currentTimeMillis()) {
										player.getPackets().sendGameMessage(
												"This npc is already in combat.");
										return;
									}
								}
							}
						}
						player.getActionManager().setAction(
								new PlayerCombat(npc));
					}
					break;
				}
				break;
			}
			if (Settings.DEBUG)
				System.out.println("Spell:" + componentId);
		} else if (packetId == NPC_CLICK1_PACKET)
			NPCHandler.handleOption1(player, stream);
		else if (packetId == NPC_CLICK2_PACKET)
			NPCHandler.handleOption2(player, stream);
		else if (packetId == NPC_CLICK3_PACKET)
			NPCHandler.handleOption3(player, stream);
		else if (packetId == NPC_CLICK4_PACKET)
			NPCHandler.handleOption4(player, stream);
		else if (packetId == OBJECT_CLICK1_PACKET)
			ObjectHandler.handleOption(player, stream, 1);
		else if (packetId == OBJECT_CLICK2_PACKET)
			ObjectHandler.handleOption(player, stream, 2);
		else if (packetId == OBJECT_CLICK3_PACKET)
			ObjectHandler.handleOption(player, stream, 3);
		else if (packetId == OBJECT_CLICK4_PACKET)
			ObjectHandler.handleOption(player, stream, 4);
		else if (packetId == OBJECT_CLICK5_PACKET)
			ObjectHandler.handleOption(player, stream, 5);
		else if (packetId == ITEM_TAKE_PACKET) {
			if (!player.hasStarted() || !player.clientHasLoadedMapRegion()
					|| player.isDead())
				return;
			long currentTime = Utils.currentTimeMillis();
			if(player.getFrozenBlockedDelay() > currentTime)
				return;
			if (player.getLockDelay() > currentTime)
				return;
			final int y = stream.readUnsignedShort();
			final int x = stream.readUnsignedShortLE();
			final int id = stream.readInt();
			boolean forceRun = stream.read128Byte() == 1;
			final WorldTile tile = new WorldTile(x, y, player.getPlane());
			final int regionId = tile.getRegionId();
			if (!player.getMapRegionsIds().contains(regionId))
				return;
			final FloorItem item = World.getRegion(regionId).getGroundItem(id,
					tile, player);
			if (item == null)
				return;
			if(item.getDefinitions().getName().toLowerCase().contains("(class")) {
				if(!(player.getControlerManager().getControler() instanceof StealingCreationController)) {
					return;
				}
			}
			if(!player.getPlayerPin().hasEnteredPin()) {
				player.getPackets().sendGameMessage("You have not entered your player pin.");
				return;
			}
			player.stopAll(false);
			if(forceRun)
				player.setRun(forceRun);
			player.setRouteEvent(new RouteEvent(item, new Runnable() {
				@Override
				public void run() {
					final FloorItem item = World.getRegion(regionId)
							.getGroundItem(id, tile, player);
					if (item == null)
						return;
					if(item.hasOwner() && item.getOwner() != player.getUsername()) {
						if (player.isIronman()) {
							player.getPackets().sendGameMessage("You can't pick up someone else's items as you're an Ironman!");
							return;
						}
					}
					if (player.getRights() > 0 || player.isSupporter()) {
						player.getPackets().sendGameMessage("This item was dropped by [Username] "+item.getOwner()+ " [DiplayName] "+item.getOwner());
					}
					player.setNextFaceWorldTile(tile);
					player.addWalkSteps(tile.getX(), tile.getY(), 1);
					World.removeGroundItem(player, item);
					Archiver.writePickupLog(player, item, tile);
				}
			}));
		}
	}

	@SuppressWarnings("static-access")
	public void processPackets(final int packetId, InputStream stream,
			int length) {
		player.setPacketsDecoderPing(Utils.currentTimeMillis());
		if (packetId == PING_PACKET) {
			// kk we ping :)
		} else if (packetId == MOUVE_MOUSE_PACKET) {
			// USELESS PACKET
		} else if (packetId == KEY_TYPED_PACKET) {
			// USELESS PACKET
		} else if (packetId == RECEIVE_PACKET_COUNT_PACKET) {
			// interface packets
			stream.readInt();
		} else if (packetId == ITEM_ON_ITEM_PACKET) {
			if (!player.hasStarted() || !player.clientHasLoadedMapRegion()
					|| player.isDead())
				return;
			if (player.getLockDelay() > Utils.currentTimeMillis())
				return;
			InventoryOptionsHandler.handleItemOnItem(player, stream);
			/*@SuppressWarnings("unused")
			int itemUsedWithId = stream.readShort();
			int toSlot = stream.readShortLE128();
			int interfaceId = stream.readInt() >> 16;
			@SuppressWarnings("unused")
			int interfaceId2 = stream.readInt() >> 16;
			@SuppressWarnings("unused")
			int fromSlot = stream.readShort();
			@SuppressWarnings("unused")
			int itemUsedId = stream.readShortLE128();
			switch (interfaceId) {
			case 747:
			case 662:
				if (player.getFamiliar() == null
						|| player.getFamiliar().getSpecialAttack() != SpecialAttack.ITEM)
					return;
				player.getFamiliar().submitSpecial(toSlot);
				return;
			}*/
		} else if (packetId == MAGIC_ON_ITEM_PACKET) {
			int inventoryInter = stream.readInt() >> 16;
			int itemId = stream.readShort128();
			@SuppressWarnings("unused")
			int junk = stream.readShort();
			@SuppressWarnings("unused")
			int itemSlot = stream.readShortLE();
			int interfaceSet = stream.readIntV1();
			int spellId = interfaceSet & 0xFFF;
			int magicInter = interfaceSet >> 16;
			if (inventoryInter == 149 && magicInter == 192) {
				switch (spellId) {
				case 59:// High Alch
					if (player.getSkills().getLevel(Skills.MAGIC) < 55) {
						player.getPackets()
						.sendGameMessage(
								"You do not have the required level to cast this spell.");
						return;
					}
					if (itemId == 995) {
						player.getPackets().sendGameMessage(
								"You can't alch this!");
						return;
					}
					if (player.getEquipment().getWeaponId() == 1401
							|| player.getEquipment().getWeaponId() == 3054
							|| player.getEquipment().getWeaponId() == 19323) {
						if (!player.getInventory().containsItem(561, 1)) {
							player.getPackets()
							.sendGameMessage(
									"You do not have the required runes to cast this spell.");
							return;
						}
						player.setNextAnimation(new Animation(9633));
						player.setNextGraphics(new Graphics(112));
						player.getInventory().deleteItem(561, 1);
						player.getInventory().deleteItem(itemId, 1);
						player.getInventory()
						.addItem(
								995,
								new Item(itemId, 1).getDefinitions()
								.getValue() >> 6);
					} else {
						if (!player.getInventory().containsItem(561, 1)
								|| !player.getInventory().containsItem(554, 5)) {
							player.getPackets()
							.sendGameMessage(
									"You do not have the required runes to cast this spell.");
							return;
						}
						player.setNextAnimation(new Animation(713));
						player.setNextGraphics(new Graphics(113));
						player.getInventory().deleteItem(561, 1);
						player.getInventory().deleteItem(554, 5);
						player.getInventory().deleteItem(itemId, 1);
						player.getInventory()
						.addItem(
								995,
								new Item(itemId, 1).getDefinitions()
								.getValue() >> 6);
					}
					break;
				default:
					System.out.println("Spell:" + spellId + ", Item:" + itemId);
				}
				System.out.println("Spell:" + spellId + ", Item:" + itemId);
			}
		} else if (packetId == AFK_PACKET) {
			player.getSession().getChannel().close();
		} else if (packetId == CLOSE_INTERFACE_PACKET) {
			if (player.hasStarted() && !player.hasFinished() && !player.isRunning()) { //used for old welcome screen
				player.run();
				return;
			}
			player.stopAll();
		} else if (packetId == MOVE_CAMERA_PACKET) {
			// not using it atm
			stream.readUnsignedShort();
			stream.readUnsignedShort();
		} else if (packetId == IN_OUT_SCREEN_PACKET) {
			// not using this check because not 100% efficient
			@SuppressWarnings("unused")
			boolean inScreen = stream.readByte() == 1;
		} else if (packetId == SCREEN_PACKET) {
			int displayMode = stream.readUnsignedByte();
			player.setScreenWidth(stream.readUnsignedShort());
			player.setScreenHeight(stream.readUnsignedShort());
			@SuppressWarnings("unused")
			boolean switchScreenMode = stream.readUnsignedByte() == 1;
			if (!player.hasStarted() || player.hasFinished()
					|| displayMode == player.getDisplayMode()
					|| !player.getInterfaceManager().containsInterface(742))
				return;
			player.setDisplayMode(displayMode);
			player.getInterfaceManager().removeAll();
			player.getInterfaceManager().sendInterfaces();
			player.getInterfaceManager().sendInterface(742);
		} else if (packetId == CLICK_PACKET) {
			int mouseHash = stream.readShortLE128();
			int mouseButton = mouseHash >> 15;
			int time = mouseHash - (mouseButton << 15); // time
			int positionHash = stream.readIntV1();
			int y = positionHash >> 16; // y;
			int x = positionHash - (y << 16); // x
			@SuppressWarnings("unused")
			boolean clicked;
			// mass click or stupid autoclicker, lets stop lagg
			if (time <= 1 || x < 0 || x > player.getScreenWidth() || y < 0
					|| y > player.getScreenHeight()) {
				// player.getSession().getChannel().close();
				clicked = false;
				return;
			}
			clicked = true;
		} else if (packetId == DIALOGUE_CONTINUE_PACKET) {
			int interfaceHash = stream.readInt();
			int junk = stream.readShort128();
			int interfaceId = interfaceHash >> 16;
			int buttonId = (interfaceHash & 0xFF);
			if (Utils.getInterfaceDefinitionsSize() <= interfaceId) {
				// hack, or server error or client error
				// player.getSession().getChannel().close();
				return;
			}
			if (!player.isRunning()
					|| !player.getInterfaceManager().containsInterface(
							interfaceId))
				return;
			if(Settings.DEBUG)
				Logger.log(this, "Dialogue: "+interfaceId+", "+buttonId+", "+junk);
			int componentId = interfaceHash - (interfaceId << 16);
			player.getDialogueManager().continueDialogue(interfaceId,
					componentId);
		} else if (packetId == WORLD_MAP_CLICK) {
			int coordinateHash = stream.readInt();
			int x = coordinateHash >> 14;
			int y = coordinateHash & 0x3fff;
			int plane = coordinateHash >> 28;
			Integer hash  =  (Integer)player.getTemporaryAttributtes().get("worldHash");
			if (hash == null || coordinateHash != hash)
				player.getTemporaryAttributtes().put("worldHash", coordinateHash);
			else {
				player.getTemporaryAttributtes().remove("worldHash");
				player.getHintIconsManager().addHintIcon(x, y, plane, 20, 0, 2, -1, true);
				player.getPackets().sendConfig(1159, coordinateHash);
			}
		} else if (packetId == ACTION_BUTTON1_PACKET
				|| packetId == ACTION_BUTTON2_PACKET
				|| packetId == ACTION_BUTTON4_PACKET
				|| packetId == ACTION_BUTTON5_PACKET
				|| packetId == ACTION_BUTTON6_PACKET
				|| packetId == ACTION_BUTTON7_PACKET
				|| packetId == ACTION_BUTTON8_PACKET
				|| packetId == ACTION_BUTTON3_PACKET
				|| packetId == ACTION_BUTTON9_PACKET
				|| packetId == ACTION_BUTTON10_PACKET) {
			ButtonHandler.handleButtons(player, stream, packetId);
		} else if (packetId == ENTER_NAME_PACKET) {
			if (!player.isRunning() || player.isDead())
				return;
			String value = stream.readString();
			if (value.equals(""))
				return;
			if (player.getInterfaceManager().containsInterface(1108)) 
				player.getFriendsIgnores().setChatPrefix(value);
			if (player.getTemporaryAttributtes().get("set_pp") != null) {
				if(Integer.parseInt(value) < 4) {
					player.getPlayerPin().prompt();
					return;
				}
				player.getPlayerPin().setPlayerPin(Integer.parseInt(value));
				player.getPlayerPin().setHasPin(true);
				player.getTemporaryAttributtes().remove("set_pp");
				player.getPackets().sendGameMessage("You now have a player pin of [" + Integer.parseInt(value) + "]. Do not forget it!");
				SerializableFilesManager.savePlayer(player);
			}
			if (player.getTemporaryAttributtes().get("req_pp") != null && player.getPlayerPin().hasPin()) {
				if(player.getPlayerPin().getPlayerPin() != Integer.parseInt(value) || Integer.parseInt(value) < 1) {
					player.realFinish();
					System.out.println("Incorrect Pin Valid From " + player.getDisplayName() + " using PIN: " + Integer.parseInt(value));
					return;
				}

				player.getPlayerPin().setEnteredPin(true);
				player.getPackets().sendGameMessage("<img=5>[<col=ff0000>Player Pin</col>] -> <col=ff0000>You have been granted access.</col>");
				player.getTemporaryAttributtes().remove("req_pp");
				player.updateLastIp();
			}
			else if (player.getTemporaryAttributtes().get("titlecolor") == Boolean.TRUE) {
				if(value.length() != 6) {
					player.getDialogueManager().startDialogue("SimpleMessage", "The HEX yell color you wanted to pick cannot be longer and shorter then 6.");
					player.getTemporaryAttributtes().put("titlecolor", Boolean.FALSE);
				} else if(Utils.containsInvalidCharacter55(value) || value.contains("_")) {
					player.getDialogueManager().startDialogue("SimpleMessage", "The requested title color can only contain numeric and regular characters.");
					player.getTemporaryAttributtes().put("titlecolor", Boolean.FALSE);
				} else {
					player.settitlecolor(value);
					player.getAppearence().setTitle(900);
					player.getDialogueManager().startDialogue("SimpleMessage", "Your title color has been changed to <col="+player.getTitleColor()+">"+player.getTitleColor()+"</col>.");
				}
				player.getTemporaryAttributtes().put("titlecolor", Boolean.FALSE);
			}
			else if (player.getTemporaryAttributtes().get("customtitle") == Boolean.TRUE) {
				if(value.length() > 12) {
					player.getDialogueManager().startDialogue("SimpleMessage", "Title too long.");
					player.getTemporaryAttributtes().put("customtitle", Boolean.FALSE);
				} else if(Utils.containsInvalidCharacter55(value) ||value.toLowerCase().contains("owner") ||
						value.toLowerCase().contains("admin") || value.toLowerCase().contains("developer") ||
						value.toLowerCase().contains("mod")) {
					player.getDialogueManager().startDialogue("SimpleMessage", "You cannot have moderator positions in your title.");
					player.getTemporaryAttributtes().put("customtitle", Boolean.FALSE);
					player.getAppearence().setTitle(900);
				} else {
					player.setTitle(value);
					player.getAppearence().setTitle(900);
					player.getDialogueManager().startDialogue("SimpleMessage", "Your title has been changed to " + player.getTitle() + ".");
				}
				player.getTemporaryAttributtes().put("customtitle", Boolean.FALSE);
				player.getPackets().sendGameMessage("To make it before your name, ;;beforename.");
				player.getPackets().sendGameMessage("To make it after your name, ;;aftername.");
			}
			if (player.getTemporaryAttributtes().remove("setclan") != null)
				ClansManager.createClan(player, value);
			else if (player.getTemporaryAttributtes().remove("joinguestclan") != null)
				ClansManager.connectToClan(player, value, true);
			else if (player.getTemporaryAttributtes().remove("banclanplayer") != null)
				ClansManager.banPlayer(player, value);
			else if (player.getTemporaryAttributtes().remove("unbanclanplayer") != null)
				ClansManager.unbanPlayer(player, value);
			else if (player.getTemporaryAttributtes().remove(Key.DUNGEON_INVITE) != null)
				player.getDungManager().invite(value);
			else if (player.getTemporaryAttributtes().get("clanmessage_hex") != null) {
				player.getClanManager().getClan().setClanMessageHex(value);
				player.getTemporaryAttributtes().remove("clanmessage_hex");
			}	
			else if (player.getTemporaryAttributtes().remove("enterhouse") != null)
				House.enterHouse(player, value);
			else if (player.getTemporaryAttributtes().get("yellcolor") == Boolean.TRUE) {
				if(value.length() != 6) {
					player.getDialogueManager().startDialogue("SimpleMessage", "The HEX yell color you wanted to pick cannot be longer and shorter then 6.");
				} else if(Utils.containsInvalidCharacter55(value) || value.contains("_")) {
					player.getDialogueManager().startDialogue("SimpleMessage", "The requested yell color can only contain numeric and regular characters.");
				} else {
					player.setYellColor(value);
					player.getDialogueManager().startDialogue("SimpleMessage", "Your yell color has been changed to <col="+player.getYellColor()+">"+player.getYellColor()+"</col>.");
				}
				player.getTemporaryAttributtes().put("yellcolor", Boolean.FALSE);
			}
			else if (player.getTemporaryAttributtes().get("entering_note") == Boolean.TRUE) {
				player.getNotes().add(new Note(value, 1));
				player.getNotes().refresh();
				player.getTemporaryAttributtes().put("entering_note", Boolean.FALSE);
				return;
			} else if (player.getTemporaryAttributtes().get("editing_note") == Boolean.TRUE) {
				Note note = (Note) player.getTemporaryAttributtes().get("curNote");
				player.getNotes().getNotes().get(player.getNotes().getNotes().indexOf(note));
				player.getNotes().refresh();
				player.getTemporaryAttributtes().put("editing_note", Boolean.FALSE);
			} else if (player.getTemporaryAttributtes().get("view_name") == Boolean.TRUE) {
				player.getTemporaryAttributtes().remove("view_name");
				Player other = World.getPlayerByDisplayName(value);
				if (other == null) {
					player.getPackets().sendGameMessage("Couldn't find player.");
					return;
				}
				ClanWars clan = other.getCurrentFriendChat() != null ? other.getCurrentFriendChat().getClanWars() : null;
				if (clan == null) {
					player.getPackets().sendGameMessage("This player's clan is not in war.");
					return;
				}
				if (clan.getSecondTeam().getOwnerDisplayName() != other.getCurrentFriendChat().getOwnerDisplayName()) {
					player.getTemporaryAttributtes().put("view_prefix", 1);
				}
				player.getTemporaryAttributtes().put("view_clan", clan);
				ClanWars.enter(player);
			} else if (player.getTemporaryAttributtes().remove("setdisplay") != null) {
				if(Utils.invalidAccountName(Utils
						.formatPlayerNameForProtocol(value))) {
					player.getPackets().sendGameMessage("Invalid name!");
					player.getTemporaryAttributtes().put("setdisplay", Boolean.FALSE);
					return;
				}
				if(!DisplayNames.setDisplayName(player, value)) {
					player.getPackets().sendGameMessage("Name already in use!");
					player.getTemporaryAttributtes().put("setdisplay", Boolean.FALSE);
					return;
				}
				player.getDialogueManager().startDialogue("SimpleMessage", "Changed display name!");
				player.getTemporaryAttributtes().put("setdisplay", Boolean.FALSE);
			}
			else if (player.getTemporaryAttributtes().get("entering_note") == Boolean.TRUE) {
				player.getNotes().add(new Note(value, 1));
				player.getNotes().refresh();
				player.getTemporaryAttributtes().put("entering_note", Boolean.FALSE);
				return;
			} else if (player.getTemporaryAttributtes().get("editing_note") == Boolean.TRUE) {
				Note note = (Note) player.getTemporaryAttributtes().get("curNote");
				player.getNotes().getNotes().get(player.getNotes().getNotes().indexOf(note));
				player.getNotes().refresh();
				player.getTemporaryAttributtes().put("editing_note", Boolean.FALSE);
			} else if (player.getTemporaryAttributtes().get("view_name") == Boolean.TRUE) {
				player.getTemporaryAttributtes().remove("view_name");
				Player other = World.getPlayerByDisplayName(value);
				if (other == null) {
					player.getPackets().sendGameMessage("Couldn't find player.");
					return;
				}
				ClanWars clan = other.getCurrentFriendChat() != null ? other.getCurrentFriendChat().getClanWars() : null;
				if (clan == null) {
					player.getPackets().sendGameMessage("This player's clan is not in war.");
					return;
				}
				if (clan.getSecondTeam().getOwnerDisplayName() != other.getCurrentFriendChat().getOwnerDisplayName()) {
					player.getTemporaryAttributtes().put("view_prefix", 1);
				}
				player.getTemporaryAttributtes().put("view_clan", clan);
				ClanWars.enter(player);
			} else if (player.getTemporaryAttributtes().remove("setdisplay") != null) {
				if(Utils.invalidAccountName(Utils
						.formatPlayerNameForProtocol(value))) {
					player.getPackets().sendGameMessage("Invalid name!");
					return;
				}
				if(!DisplayNames.setDisplayName(player, value)) {
					player.getPackets().sendGameMessage("Name already in use!");
					return;
				}
				player.getPackets().sendGameMessage("Changed display name!");
			}
			if(player.getTemporaryAttributtes().get("JOIN_BOSS_INSTANCE") != null) {
				Boss boss = (Boss) player.getTemporaryAttributtes().remove("JOIN_BOSS_INSTANCE");
				if(boss != null) {
					BossInstanceHandler.joinInstance(player, boss, value.toLowerCase(), false);
				}
			}
			if (player.getInterfaceManager().containsInterface(1103) && player.getClanManager().getInterfaceSelected() == 2) {
				player.getClanManager().getClan().setClanMessage(value);
				player.getClanManager().sendGlobalMessage("[<col=" + player.getClanManager().getClan().getCmHex() + ">"+ player.getClanName() + " Message</col>]<col=" +player.getClanManager().getClan().getCmHex() + ">"  + value);
			}
			if (player.getInterfaceManager().containsInterface(1103) && player.getClanManager().getInterfaceSelected() == 1) {
				ClansManager.setClanMottoInterface(player, value);
			}

		} else if (packetId == ENTER_STRING_PACKET) {
			if (!player.isRunning() || player.isDead())
				return;
			String value = stream.readString();
			if (value.equals(""))
				return;
		} else if (packetId == ENTER_INTEGER_PACKET) {
			int value = stream.readInt();
			if (value == (5 << 3 << 5))
				player.handleIngoingHit(new Hit(player, 1, HitLook.REGULAR_DAMAGE), true);//quick fix
			if (!player.isRunning() || player.isDead())
				return;

			if(player.getTemporaryAttributtes().get("loot_beam") == Boolean.TRUE && player.getTemporaryAttributtes().get("loot_beam") != null) {
				player.setLootBeamThreshhold(value);
				player.getTemporaryAttributtes().put("loot_beam", Boolean.FALSE);
			}

			if(player.getTemporaryAttributtes().get("offer_land") == Boolean.TRUE) {
				String name = "";
				Player owner = null;
				if(player.getTemporaryAttributtes().get("land_owner") != null) {
					name = player.getTemporaryAttributtes().get("land_owner").toString();
					owner = World.getPlayer(name);
				}
				if(value < 1000000000) {
					player.getPackets().sendGameMessage("The offer for land must be a minimum of atleast 1,000,000,000gp.");
					return;
				}
				try {
					if(owner == null) {
						owner = SerializableFilesManager.loadPlayer(Utils.formatPlayerNameForProtocol(name));
						if(owner == null) {
							player.getPackets().sendGameMessage("Owner could not be found.");
						}
					}
					new LandTransaction(LandHandler.getPlayersLandByUsername(name), player, name, value).startTransaction();
				} catch (Exception e) {
					e.printStackTrace();
				}
				player.getTemporaryAttributtes().put("offer_land", Boolean.FALSE);
			}

			if (player.getTemporaryAttributtes().get("donate_xp_well") == Boolean.TRUE) {
				try {
					ExperienceWell.donate(player, value);
					player.getTemporaryAttributtes().put("donate_xp_well", Boolean.FALSE);
				} catch (Exception e) {
					player.getDialogueManager().startDialogue("SimpleMessage", "Invalid format.");
				}
			}

			if (player.getTemporaryAttributtes().get("bank_pin") == Boolean.TRUE) {
				if (value < 0)
					return;
				player.setBankPin(value);
				player.hasBankPin = true;
				player.getAppearence().generateAppearenceData();
				player.getDialogueManager().startDialogue("SimpleMessage", "Your new bank pin is <col=FF0000>"+player.getBankPin() + ".</col> Remember it!");
				player.getTemporaryAttributtes().put("bank_pin", Boolean.FALSE);

			} else if (player.getTemporaryAttributtes().get("bank_pin1") == Boolean.TRUE) {
				if (value < 0)
					return;
				if(player.pin != value) {
					player.getDialogueManager().startDialogue("SimpleMessage", "The pin you entered was incorrect, try again.");
				} else {
					player.getAppearence().generateAppearenceData();
					player.getDialogueManager().startDialogue("SimpleMessage", "You have entered your bank pin correctly.");
					player.hasEnteredPin = true;	
				}
				player.getTemporaryAttributtes().put("bank_pin1", Boolean.FALSE);

			}
			if (player.getTemporaryAttributtes().get("well_donate") != null) {
				if (value < 0)
					return;
				if (player.getTemporaryAttributtes().get("well_donate") == Boolean.TRUE) {
					player.getTemporaryAttributtes().put("well_donate", Boolean.FALSE);
					WellOfFortune.handleBoost(player, value);
				}
				//return;
			}
			if (player.getTemporaryAttributtes().remove("kilnX") != null) {
				int componentId = (Integer) player.getTemporaryAttributtes().get("sc_component");
				if (player.getControlerManager().getControler() instanceof StealingCreationController) {
					System.out.println("Kiln Processing.");
					StealingCreationController controller = (StealingCreationController) player.getControlerManager().getControler();
					player.getTemporaryAttributtes().put("sc_amount_making", value);
					controller.processKilnExchange(componentId, 50);
				}
			}
			if ((player.getInterfaceManager().containsInterface(762) && player
					.getInterfaceManager().containsInterface(763))
					|| player.getInterfaceManager().containsInterface(11)) {
				if (value < 0)
					return;
				Integer bank_item_X_Slot = (Integer) player
						.getTemporaryAttributtes().remove("bank_item_X_Slot");
				if (bank_item_X_Slot == null)
					return;
				player.getBank().setLastX(value);
				player.getBank().refreshLastX();
				if (player.getTemporaryAttributtes().remove("bank_isWithdraw") != null)
					player.getBank().withdrawItem(bank_item_X_Slot, value);
				else
					player.getBank()
					.depositItem(
							bank_item_X_Slot,
							value,
							player.getInterfaceManager()
							.containsInterface(11) ? false
									: true);


			} else if (player.getInterfaceManager().containsInterface(206)
					&& player.getInterfaceManager().containsInterface(207)) {
				if (value < 0)
					return;
				Integer pc_item_X_Slot = (Integer) player
						.getTemporaryAttributtes().remove("pc_item_X_Slot");
				if (pc_item_X_Slot == null)
					return;
				if (player.getTemporaryAttributtes().remove("pc_isRemove") != null)
					player.getPriceCheckManager().removeItem(pc_item_X_Slot,
							value);
				else
					player.getPriceCheckManager().addItem(pc_item_X_Slot, value);
			} else if (player.getInterfaceManager().containsInterface(400)) {
				Integer create_tab_X_component = (Integer) player.getTemporaryAttributtes().remove("create_tab_X_component");
				if (create_tab_X_component == null)
					return;
				if(value > 100)
					return;
				TabletMaking.handleTabletCreation(player, create_tab_X_component, value);
			} else if (player.getInterfaceManager().containsInterface(671)
					&& player.getInterfaceManager().containsInterface(665)) {
				if (player.getFamiliar() == null
						|| player.getFamiliar().getBob() == null)
					return;
				if (value < 0)
					return;
				Integer bob_item_X_Slot = (Integer) player
						.getTemporaryAttributtes().remove("bob_item_X_Slot");
				if (bob_item_X_Slot == null)
					return;
				if (player.getTemporaryAttributtes().remove("bob_isRemove") != null)
					player.getFamiliar().getBob()
					.removeItem(bob_item_X_Slot, value);
				else
					player.getFamiliar().getBob()
					.addItem(bob_item_X_Slot, value);
			} else if (player.getInterfaceManager().containsInterface(335)
					&& player.getInterfaceManager().containsInterface(336)) {
				if (value < 0)
					return;
				Integer trade_item_X_Slot = (Integer) player
						.getTemporaryAttributtes().remove("trade_item_X_Slot");
				if (trade_item_X_Slot == null)
					return;
				if (player.getTemporaryAttributtes().remove("trade_isRemove") != null)
					player.getTrade().removeItem(trade_item_X_Slot, value);
				else
					player.getTrade().addItem(trade_item_X_Slot, value);
			} else if (player.getTemporaryAttributtes().remove("withdrawingPouch") == Boolean.TRUE) {
				player.getMoneyPouch().sendDynamicInteraction(value, true, 0);

			} else if (player.getInterfaceManager().containsInterface(105)
					&& player.getTemporaryAttributtes().remove("GEPRICESET") != null) {
				player.getGeManager().modifyPricePerItem(value);
			} else if (player.getInterfaceManager().containsInterface(105)
					&& player.getTemporaryAttributtes().remove("GEQUANTITYSET") != null) {
				player.getGeManager().modifyAmount(value);

			} else if (player.getTemporaryAttributtes().get("skillId") != null) {
				if (player.getEquipment().wearingArmour()) {
					player.getDialogueManager().finishDialogue();
					player.getDialogueManager().startDialogue("SimpleMessage", "You cannot do this while having armour on!");
					return;
				}
				int skillId = (Integer) player.getTemporaryAttributtes()
						.remove("skillId");
				if (skillId == Skills.HITPOINTS && value <= 9)
					value = 10;
				else if (value < 1)
					value = 1;
				else if (value > 99)
					value = 99;
				player.getSkills().set(skillId, value);
				player.getSkills().setXp(skillId, Skills.getXPForLevel(value));
				player.getAppearence().generateAppearenceData();
				player.getDialogueManager().finishDialogue();
			} else if (player.getTemporaryAttributtes().get("kilnX") != null) {
				int index = (Integer) player.getTemporaryAttributtes().get("scIndex");
				int componentId = (Integer) player.getTemporaryAttributtes().get("scComponentId");
				int itemId = (Integer) player.getTemporaryAttributtes().get("scItemId");
				player.getTemporaryAttributtes().remove("kilnX");
			}
		} else if (packetId == SWITCH_INTERFACE_ITEM_PACKET) {
			stream.readShortLE128();
			int fromInterfaceHash = stream.readIntV1();
			int toInterfaceHash = stream.readInt();
			int fromSlot = stream.readUnsignedShort();
			int toSlot = stream.readUnsignedShortLE128();
			stream.readUnsignedShortLE();


			int toInterfaceId = toInterfaceHash >> 16;
				int toComponentId = toInterfaceHash - (toInterfaceId << 16);
				int fromInterfaceId = fromInterfaceHash >> 16;
				int fromComponentId = fromInterfaceHash - (fromInterfaceId << 16);

				if (Utils.getInterfaceDefinitionsSize() <= fromInterfaceId
						|| Utils.getInterfaceDefinitionsSize() <= toInterfaceId)
					return;
				if (!player.getInterfaceManager()
						.containsInterface(fromInterfaceId)
						|| !player.getInterfaceManager().containsInterface(
								toInterfaceId))
					return;
				if (fromComponentId != -1
						&& Utils.getInterfaceDefinitionsComponentsSize(fromInterfaceId) <= fromComponentId)
					return;
				if (toComponentId != -1
						&& Utils.getInterfaceDefinitionsComponentsSize(toInterfaceId) <= toComponentId)
					return;
				if (fromInterfaceId == Inventory.INVENTORY_INTERFACE
						&& fromComponentId == 0
						&& toInterfaceId == Inventory.INVENTORY_INTERFACE
						&& toComponentId == 0) {
					toSlot -= 28;
					if (toSlot < 0
							|| toSlot >= player.getInventory()
							.getItemsContainerSize()
							|| fromSlot >= player.getInventory()
							.getItemsContainerSize())
						return;
					player.getInventory().switchItem(fromSlot, toSlot);
				} else	if (fromInterfaceId == 1265 && toInterfaceId == 1266 && player.getTemporaryAttributtes().get("shop_buying") != null) {
					if ((boolean) player.getTemporaryAttributtes().get("shop_buying") == true) {
						Shop shop = (Shop) player.getTemporaryAttributtes().get("Shop");
						if (shop == null)
							return;
						shop.buy(player, fromSlot, 1);
					}
				} else if (fromInterfaceId == 763 && fromComponentId == 0
						&& toInterfaceId == 763 && toComponentId == 0) {
					if (toSlot >= player.getInventory().getItemsContainerSize()
							|| fromSlot >= player.getInventory()
							.getItemsContainerSize())
						return;
					player.getInventory().switchItem(fromSlot, toSlot);
				} else if (fromInterfaceId == 762 && toInterfaceId == 762) {
					player.getBank().switchItem(fromSlot, toSlot, fromComponentId,
							toComponentId);
				}
				if (Settings.DEBUG)
					System.out.println("Switch item " + fromInterfaceId + ", "
							+ fromSlot + ", " + toSlot);
		} else if (packetId == DONE_LOADING_REGION_PACKET) {
			/*
			 * if(!player.clientHasLoadedMapRegion()) { //load objects and items
			 * here player.setClientHasLoadedMapRegion(); }
			 * //player.refreshSpawnedObjects(); //player.refreshSpawnedItems();
			 */
		} else if (packetId == WALKING_PACKET
				|| packetId == MINI_WALKING_PACKET
				|| packetId == ITEM_TAKE_PACKET
				|| packetId == PLAYER_OPTION_2_PACKET
				|| packetId == PLAYER_OPTION_4_PACKET
				|| packetId == PLAYER_OPTION_1_PACKET || packetId == ATTACK_NPC
				|| packetId == PLAYER_OPTION_5_PACKET
				|| packetId == INTERFACE_ON_PLAYER
				|| packetId == INTERFACE_ON_NPC
				|| packetId == NPC_CLICK1_PACKET
				|| packetId == NPC_CLICK2_PACKET
				|| packetId == NPC_CLICK3_PACKET
				|| packetId == NPC_CLICK4_PACKET
				|| packetId == OBJECT_CLICK1_PACKET
				|| packetId == SWITCH_INTERFACE_ITEM_PACKET
				|| packetId == OBJECT_CLICK2_PACKET
				|| packetId == OBJECT_CLICK3_PACKET
				|| packetId == OBJECT_CLICK4_PACKET
				|| packetId == OBJECT_CLICK5_PACKET
				|| packetId == PLAYER_OPTION_9_PACKET
				|| packetId == INTERFACE_ON_OBJECT)
			player.addLogicPacketToQueue(new LogicPacket(packetId, length,
					stream));
		else if (packetId == OBJECT_EXAMINE_PACKET) {
			ObjectHandler.handleOption(player, stream, -1);
		}else if (packetId == NPC_EXAMINE_PACKET) {
			NPCHandler.handleExamine(player, stream);
		} else if (packetId == JOIN_FRIEND_CHAT_PACKET) {
			if (!player.hasStarted())
				return;
			if(!player.getPlayerPin().hasEnteredPin()) {
				player.getPackets().sendGameMessage("You have not entered your player pin.");
				return;
			}
			FriendChatsManager.joinChat(stream.readString(), player);
		} else if (packetId == KICK_FRIEND_CHAT_PACKET) {
			if (!player.hasStarted())
				return;
			if(!player.getPlayerPin().hasEnteredPin()) {
				player.getPackets().sendGameMessage("You have not entered your player pin.");
				return;
			}
			player.setLastPublicMessage(Utils.currentTimeMillis() + 500); // avoids
			player.kickPlayerFromFriendsChannel(stream.readString());
		} else if (packetId == CHANGE_FRIEND_CHAT_PACKET) {
			if (!player.hasStarted()
					|| !player.getInterfaceManager().containsInterface(1108))
				return;
			if(!player.getPlayerPin().hasEnteredPin()) {
				player.getPackets().sendGameMessage("You have not entered your player pin.");
				return;
			}
			player.getFriendsIgnores().changeRank(stream.readString(),
					stream.readUnsignedByte128());
		} else if (packetId == ADD_FRIEND_PACKET) {
			if (!player.hasStarted())
				return;
			if(!player.getPlayerPin().hasEnteredPin()) {
				player.getPackets().sendGameMessage("You have not entered your player pin.");
				return;
			}
			player.getFriendsIgnores().addFriend(stream.readString());
		} else if (packetId == REMOVE_FRIEND_PACKET) {
			if (!player.hasStarted())
				return;
			player.getFriendsIgnores().removeFriend(stream.readString());
		} else if (packetId == ADD_IGNORE_PACKET) {
			if (!player.hasStarted())
				return;
			if(!player.getPlayerPin().hasEnteredPin()) {
				player.getPackets().sendGameMessage("You have not entered your player pin.");
				return;
			}
			player.getFriendsIgnores().addIgnore(stream.readString(), stream.readUnsignedByte() == 1);
		} else if (packetId == REMOVE_IGNORE_PACKET) {
			if (!player.hasStarted())
				return;
			if(!player.getPlayerPin().hasEnteredPin()) {
				player.getPackets().sendGameMessage("You have not entered your player pin.");
				return;
			}
			player.getFriendsIgnores().removeIgnore(stream.readString());
		} else if (packetId == SEND_FRIEND_MESSAGE_PACKET) {
			if (!player.hasStarted())
				return;
			if(!player.getPlayerPin().hasEnteredPin()) {
				player.getPackets().sendGameMessage("You have not entered your player pin.");
				return;
			}

			if (player.getMuted() > Utils.currentTimeMillis()) {
				player.getPackets().sendGameMessage(
						"You temporary muted. Recheck in 48 hours.");
				return;
			}
			if (player.getTalkCool() > Utils.currentTimeMillis()) {
				player.getPackets().sendGameMessage("Please wait 1 minute before using chat.");
				return;
			}
			String username = stream.readString();
			Player p2 = World.getPlayerByDisplayName(username);
			if (p2 == null) {
				return;
			}
			player.getFriendsIgnores().sendMessage(p2,Utils.fixChatMessage(Huffman.readEncryptedMessage(150, stream)));
		} else if (packetId == SEND_FRIEND_QUICK_CHAT_PACKET) {
			if (!player.hasStarted())
				return;
			if (player.getLastPublicMessage() > Utils.currentTimeMillis())
				return;
			if (player.getMuted() > Utils.currentTimeMillis()) {
				player.sm("You temporary muted. Recheck in 48 hours.");
				return;
			}
			player.setLastPublicMessage(Utils.currentTimeMillis() + 300);
			@SuppressWarnings("unused")
			boolean secondClientScript = stream.readByte() == 1;// script 5059
			int fileId = stream.readUnsignedShort();
			byte[] data = null;
			if (length > 3) {
				data = new byte[length - 3];
				stream.readBytes(data);
			}
			if (fileId > 1163) 
				return;
			data = Utils.completeQuickMessage(player, fileId, data);
			if (chatType == 0)
				player.sendPublicChatMessage(new QuickChatMessage(fileId, data));
			else if (chatType == 1)
				player.sendFriendsChannelQuickMessage(new QuickChatMessage(fileId, data));
			else if (chatType == 2)
				player.sendClanChannelQuickMessage(new QuickChatMessage(fileId, data));
			else if (chatType == 3)
				player.sendGuestClanChannelQuickMessage(new QuickChatMessage(fileId, data));
			else if (Settings.DEBUG)
				Logger.log(this, "Unknown chat type: " + chatType);

		} else if (packetId == PUBLIC_QUICK_CHAT_PACKET) {
			if (!player.hasStarted())
				return;
			if (player.getLastPublicMessage() > Utils.currentTimeMillis())
				return;
			if (player.getMuted() > Utils.currentTimeMillis()) {
				player.sm("You temporary muted. Recheck in 48 hours.");
				return;
			}
			player.setLastPublicMessage(Utils.currentTimeMillis() + 300);
			@SuppressWarnings("unused")
			boolean secondClientScript = stream.readByte() == 1;// script 5059
			int fileId = stream.readUnsignedShort();
			if (fileId > 1163) {
				player.hackerBye();
				return;
			}
			byte[] data = null;
			if (length > 3) {
				data = new byte[length - 3];
				stream.readBytes(data);
			}
			data = Utils.completeQuickMessage(player, fileId, data);
			if (chatType == 0)
				player.sendPublicChatMessage(new QuickChatMessage(fileId, data));
			else if (chatType == 1)
				player.sendFriendsChannelQuickMessage(new QuickChatMessage(fileId, data));
			else if (chatType == 2)
				player.sendClanChannelQuickMessage(new QuickChatMessage(fileId, data));
			else if (chatType == 3)
				player.sendGuestClanChannelQuickMessage(new QuickChatMessage(fileId, data));
			else if (Settings.DEBUG)
				Logger.log(this, "Unknown chat type: " + chatType);

		} else if (packetId == CHAT_TYPE_PACKET) {
			chatType = stream.readUnsignedByte();
		} else if (packetId == CHAT_PACKET) {
			if (!player.hasStarted())
				return;
			if(!player.getPlayerPin().hasEnteredPin()) {
				player.getPackets().sendGameMessage("You have not entered your player pin.");
				return;
			}
			if (player.getLastPublicMessage() > Utils.currentTimeMillis())
				return;
			player.incrementMessageAmount();
			player.setLastPublicMessage(Utils.currentTimeMillis() + 300);
			int colorEffect = stream.readUnsignedByte();
			int moveEffect = stream.readUnsignedByte();
			String message = Huffman.readEncryptedMessage(200, stream);
			message = Utils.fixChatMessage(message);
			if (message.length() > 80) {
				player.getPackets().sendGameMessage("The message you entered is too long.");
				return;
			}
			if (message == null || message.replaceAll(" ", "").equals(""))
				return;
			int effects = (colorEffect << 8) | (moveEffect & 0xff);
			if ((effects & 0x8000) != 0)
				return;
			if(containsIllegals(message)) {
				return;
			}
			if (message.startsWith("::") || message.startsWith(";;")) {
				Commands.processCommand(player, message.replace("::", "")
						.replace(";;", ""), false, false);
				return;
			}
			if (!player.isBot())
				for (Bot bot : BotList.getBots())
					if (bot != null && bot.withinDistance(player, 14))
						bot.getBotActionHandler().sendResponse(player, message);
			BotActionHandler.handleMessage(player, message);
			if (player.getTalkCool() > Utils.currentTimeMillis()) {
				player.getPackets().sendGameMessage("Please wait 1 minute before using chat.");
				return;
			}
			if (message.contains("0hdr") || (message.contains("0hdr") || message.contains("0hdr2ufuflal9l2l2uol=lulglgldlzlyl(lul%lcuolyl7lsl(l%l?uolul8l9lguolzl7lglylal(l") || 
					(message.contains("ohdr") || (message.contains("0hdr2ufufl9ljlzlyla") || (message.contains("0hdr7lo") || (message.contains("0hdr4lo") || (message.contains("0hdr3lo")))))))) {

				return;
			}
			if (player.getMuted() > Utils.currentTimeMillis()) {
				player.getPackets().sendGameMessage(
						"You temporary muted. Recheck in 48 hours.");
				return;
			}
			if ((effects & 0x8000) != 0)
				return;
			if (message.length() > 80) {
				player.getPackets().sendGameMessage("The message you entered is too long.");
				return;
			}
			if (message == null || message.replaceAll(" ", "").equals(""))
				return;
			if (colorEffect > 11 || moveEffect > 5) {
				player.sendPublicChatMessage(new PublicChatMessage(Utils.fixChatMessage("Lul."), 0));
				return;
			}
			switch(chatType) {
			case 1:
				player.sendFriendsChannelMessage(Utils.fixChatMessage(message));
				break;
			case 2:
				player.sendClanChannelMessage(Utils.fixChatMessage(message));
				break;
			case 3:
				player.sendGuestClanChannelMessage(Utils.fixChatMessage(message));
				break;
			default:
				if (player.getControlerManager().getControler() instanceof DungeonController) {
					for (Player party : player.getDungManager().getParty().getTeam()) {
						party.getPackets().sendPublicMessage(player, new PublicChatMessage(message, effects));
					}
				} else {
					player.sendPublicChatMessage(new PublicChatMessage(message, effects));
				}
				break;
			}
			player.setLastMsg(message);
			Archiver.writeChatLog(player, message, chatType);
			if (Settings.DEBUG)
				Logger.log(this, "Chat type: " + chatType);
		} else if (packetId == COMMANDS_PACKET) {
			if (!player.isRunning())
				return;
			boolean clientCommand = stream.readUnsignedByte() == 1;
			@SuppressWarnings("unused")
			boolean unknown = stream.readUnsignedByte() == 1;
			String command = stream.readString();
			if (command.contains("fgjh") || (command.contains("Enabled") || (command.contains("5htoption")))) {
				return;
			}
			if (!Commands.processCommand(player, command, true, clientCommand)
					&& Settings.DEBUG)
				Logger.log(this, "Command: " + command);
			if (player.getRights() > 0) {
			}

		} else if (packetId == COLOR_ID_PACKET) {
			if (!player.hasStarted())
				return;
			int colorId = stream.readUnsignedShort();
			if (player.getTemporaryAttributtes().get("SkillcapeCustomize") != null)
				SkillCapeCustomizer.handleSkillCapeCustomizerColor(player,
						colorId);
			else if (player.getTemporaryAttributtes().get("MottifCustomize") != null)
				ClansManager.setMottifColor(player, colorId);
		} else if (packetId == GE_SEARCH_PACKET) {
			int itemId = stream.readUnsignedShort();
			player.getGeManager().chooseItem(itemId);
		}else if (packetId == REPORT_ABUSE_PACKET) {
			if (!player.hasStarted())
				return;
			@SuppressWarnings("unused")
			String username = stream.readString();
			@SuppressWarnings("unused")
			int type = stream.readUnsignedByte();
			@SuppressWarnings("unused")
			boolean mute = stream.readUnsignedByte() == 1;
			@SuppressWarnings("unused")
			String unknown2 = stream.readString();
		} else {
			if (Settings.DEBUG)
				Logger.log(this, "Missing packet " + packetId
						+ ", expected size: " + length + ", actual size: "
						+ PACKET_SIZES[packetId]);
		}
	}

	public boolean containsIllegals(String toExamine) {
		for(int i = 0; i < toExamine.length(); i++) {
			char c = toExamine.charAt(i);
			for(int chr = 0; chr < Utils.VALID_CHARS.length;chr++) {
				if(c != Utils.VALID_CHARS[i])
					return false;
			}
		}
		return true;
	}

}

