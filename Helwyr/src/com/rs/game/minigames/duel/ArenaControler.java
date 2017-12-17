package com.rs.game.minigames.duel;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.ForceTalk;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.minigames.duel.DuelConfiguration.AdvancedRuleSet;
import com.rs.game.minigames.duel.DuelConfiguration.RuleSet;
import com.rs.game.player.Player;
import com.rs.game.player.actions.PlayerCombat;
import com.rs.game.player.content.Drinkables;
import com.rs.game.player.content.Drinkables.Drink;
import com.rs.game.player.content.Foods.Food;
import com.rs.game.player.content.ItemConstants;
import com.rs.game.player.controlers.Controler;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.net.decoders.WorldPacketsDecoder;
import com.rs.net.decoders.handlers.ButtonHandler;
import com.rs.utils.Utils;

/**
 * @author Tom
 */
public class ArenaControler extends Controler {

	public enum DuelStage {
		DECLINED, NO_SPACE, SECOND, DONE
	}

	public enum FinishType {
		LOGOUT, TELEPORT, LOST, WON;
	}

	public enum DuelMode {
		STANDARD("Standard Fight", AdvancedRuleSet.EMPTY), DUEL_DDS("Dragon Dagger Fight", AdvancedRuleSet.DUEL_DDS), DUEL_WHIP(
				"Abyssal Whip Fight", AdvancedRuleSet.DUEL_WHIP), DUEL_RAPIER("Chaotic Rapier Fight", AdvancedRuleSet.DUEL_RAPIER), DUEL_G_MAUL(
				"Granite Maul Fight", AdvancedRuleSet.DUEL_G_MAUL), DUEL_BOX("Boxing Fight", AdvancedRuleSet.DUEL_BOX), DUEL_BOX_MAGE(
				"Mage Boxing Fight", AdvancedRuleSet.DUEL_BOX_MAGE);

		private final AdvancedRuleSet set;
		private final String weaponName;

		private DuelMode(String weaponName, AdvancedRuleSet set) {
			this.weaponName = weaponName;
			this.set = set;
		}

		public AdvancedRuleSet getSet() {
			return set;
		}

		public String formatted() {
			return weaponName;
		}
	}

	private Player target;
	private boolean staked;
	private boolean isDueling;

	private static final WorldTile[][] POSSIBLE_TILE_CENTRE = { { new WorldTile(3346, 3251, 0), new WorldTile(3376, 3232, 0) },
			{ new WorldTile(3346, 3214, 0) }, { new WorldTile(3345, 3231, 0), new WorldTile(3376, 3213, 0) } };

	private final WorldTile[] LOBBY_TELEPORTS = { new WorldTile(3367, 3275, 0), new WorldTile(3360, 3275, 0),
			new WorldTile(3358, 3270, 0), new WorldTile(3363, 3268, 0), new WorldTile(3370, 3268, 0),
			new WorldTile(3367, 3267, 0), new WorldTile(3376, 3275, 0), new WorldTile(3377, 3271, 0),
			new WorldTile(3375, 3269, 0), new WorldTile(3381, 3277, 0) };

	private final Item[] FUN_WEAPONS = { new Item(4566) };

	private DuelMode duelMode;

	@Override
	public void start() {
		target = (Player) getArguments()[0];
		staked = (boolean) getArguments()[1];
		duelMode = DuelMode.STANDARD;

		setArguments(null);
		openMainInterface();
	}

	private void openMainInterface() {
		synchronized (this) {
			player.getDuelConfig().reset();

			if (staked) {
				//sendOptions();
				player.sm("Currently disabled. Sorry for the inconvienence.");
			}

			player.getPackets().sendItems(134, false, player.getDuelConfig().getStakedItems());
			player.getPackets().sendItems(134, true, player.getDuelConfig().getStakedItems());

			player.getPackets().sendIComponentText(!staked ? 637 : 631, !staked ? 16 : 38,
					" " + Utils.formatPlayerNameForDisplay(target.getUsername()));
			player.getPackets().sendIComponentText(!staked ? 637 : 631, !staked ? 18 : 40,
					"" + (target.getSkills().getCombatLevel()));

			if (staked) {
				player.getPackets().sendIComponentText(631, 69, duelMode.formatted());
			}

			player.putAttribute("acceptedDuel", false);
			refreshScreenMessage(true, !staked);

			player.getVarsManager().sendVar(286, 0);
			player.getInterfaceManager().sendInterface(!staked ? 637 : 631);

			player.setCloseInterfacesEvent(new Runnable() {
				@Override
				public void run() {
					close(DuelStage.DECLINED);
				}
			});
		}
	}

	protected void close(DuelStage stage) {
		synchronized (this) {
			final Player oldTarget = target;
			Controler controler = (oldTarget == null ? null : oldTarget.getControlerManager().getControler());

			if (controler == null || !(controler instanceof ArenaControler)) {
				return;
			}

			ArenaControler tControler = (ArenaControler) controler;
			synchronized (controler) {
				if (!hasTarget() && !tControler.hasTarget()) {
					return;
				} else if (!(controler instanceof ArenaControler)) {
					return;
				}

				player.setCloseInterfacesEvent(null);
				player.closeInterfaces();

				oldTarget.setCloseInterfacesEvent(null);
				oldTarget.closeInterfaces();

				if (stage != DuelStage.DONE) {
					reset();
					tControler.reset();

					player.getInventory().getItems().addAll(player.getDuelConfig().getStakedItems());
					oldTarget.getInventory().getItems().addAll(oldTarget.getDuelConfig().getStakedItems());

					player.getDuelConfig().reset();
					oldTarget.getDuelConfig().reset();

					oldTarget.getInventory().init();
					player.getInventory().init();

					WorldTasksManager.schedule(new WorldTask() {
						@Override
						public void run() {
							player.getControlerManager().startControler("LobbyControler");
							oldTarget.getControlerManager().startControler("LobbyControler");
						}
					}, 1);
				} else {
					removeEquipment();
					tControler.removeEquipment();

					begin(true);
					tControler.begin(false);
				}
			}
		}
	}

	private void begin(boolean started) {
		isDueling = true;
		if (started)
			teleport(player, target);

		player.stopAll();
		player.lock(2);
		player.reset();

		// disable keepsakes
		target.getAppearence().generateAppearenceData();
		player.getAppearence().generateAppearenceData();

		// reset potion effects
		Drinkables.resetOverLoadEffect(player);
		Drinkables.resetOverLoadEffect(target);

		// reset stat boosting effects
		player.setLastBonfire(0);
		target.setLastBonfire(0);

		// reset skills and other boosts
		player.getSkills().restoreSkills();
		player.setHpBoostMultiplier(0);
		player.getEquipment().refreshConfigs(false);
		target.getSkills().restoreSkills();
		target.setHpBoostMultiplier(0);
		target.getEquipment().refreshConfigs(false);

		player.putAttribute("startedDuel", true);
		player.putAttribute("canFight", false);
		player.setCanPvp(true);

		player.getHintIconsManager().addHintIcon(target, 1, -1, false);
		WorldTasksManager.schedule(new WorldTask() {
			int count = 3;

			@Override
			public void run() {
				if (count > 0)
					player.setNextForceTalk(new ForceTalk("" + count));
				else {
					player.putAttribute("canFight", true);
					player.setNextForceTalk(new ForceTalk("FIGHT!"));
					stop();
					return;
				}
				count--;
			}
		}, 0, 2);
	}

	private void teleport(Player player, Player target) {
		boolean noMovement = player.getDuelConfig().isRuleEnabled(RuleSet.NO_MOVEMENT);
		boolean enableSummoning = player.getDuelConfig().isRuleEnabled(RuleSet.ENABLE_SUMMONING);
		boolean obstacles = player.getDuelConfig().isRuleEnabled(RuleSet.OBSTACLES);

		WorldTile tile = enableSummoning ? POSSIBLE_TILE_CENTRE[1][0] : obstacles ? POSSIBLE_TILE_CENTRE[2][Utils
				.random(POSSIBLE_TILE_CENTRE[2].length)] : POSSIBLE_TILE_CENTRE[0][Utils.random(POSSIBLE_TILE_CENTRE[0].length)];
		WorldTile teleport = null;
		for (int count = 0; count < 10; count++) {
			teleport = new WorldTile(tile, 7);
			if (World.isTileFree(teleport.getPlane(), teleport.getX(), teleport.getY(), player.getSize()))
				break;
			teleport = tile;
		}

		player.setNextWorldTile(teleport);

		final WorldTile location = teleport;
		for (int count = 0; count < 10; count++) {
			teleport = new WorldTile(noMovement ? location : tile, noMovement ? 1 : 7);
			if (World.isTileFree(teleport.getPlane(), teleport.getX(), teleport.getY(), player.getSize())
					&& !teleport.withinDistance(location, 0))
				break;
			teleport = tile;
		}

		target.setNextWorldTile(teleport);
	}

	@Override
	public boolean processObjectClick1(WorldObject object) {
		player.getDialogueManager().startDialogue("ForfeitDialouge");
		return true;
	}

	private void removeEquipment() {
		for (RuleSet rule : RuleSet.values()) {
			if (!player.getDuelConfig().isRuleEnabled(rule))
				continue;

			int slot = rule.getSlot();
			if (slot < 0 || slot > 14)
				continue;

			ButtonHandler.sendRemove(player, slot);
		}
	}

	@Override
	public boolean processMagicTeleport(WorldTile toTile) {
		player.getDialogueManager().startDialogue("SimpleMessage",
				"A magical force prevents you from teleporting from the arena.");
		return false;
	}

	@Override
	public boolean processItemTeleport(WorldTile toTile) {
		player.getDialogueManager().startDialogue("SimpleMessage",
				"A magical force prevents you from teleporting from the arena.");
		return false;
	}

	@Override
	public boolean login() {
		return true;
	}

	@Override
	public void process() {
		if (!hasTarget() || target.getControlerManager().getControler() != null
				&& !(target.getControlerManager().getControler() instanceof ArenaControler)) {
			finish(FinishType.LOST);
			return;
		}
	}

	@Override
	public void forceClose() {
		finish(FinishType.LOST);
	}

	private void finish(FinishType type) {
		if (isDueling) {
			if (type.equals(FinishType.LOGOUT) || type.equals(FinishType.LOST) || type.equals(FinishType.TELEPORT))
				finish(target, player);
			else if (type.equals(FinishType.WON))
				finish(player, target);
		} else {
			close(DuelStage.DECLINED);
		}
	}

	private void finish(final Player victor, final Player loser) {
		Controler controler = target == null ? null : target.getControlerManager().getControler();
		if (controler == null || !(controler instanceof ArenaControler))
			return;

		boolean isDraw = false;
		if (victor.isDead() && loser.isDead()) {
			isDraw = true;
		}

		finishTeleport(victor, false);
		finishTeleport(loser, false);

		if (!isDueling)
			return;

		ArenaControler tControler = (ArenaControler) controler;
		tControler.isDueling = false;
		isDueling = false;

		sendRewards(victor, loser, isDraw);

		loser.getPackets().sendGameMessage(
				isDraw ? "The battle has ended in a draw." : "Oh dear, it seems you have lost to " + victor.getDisplayName()
						+ ".");
		victor.getPackets().sendGameMessage(
				isDraw ? "The battle has ended in a draw." : "Congratulations! You easily defeated " + loser.getDisplayName()
						+ ".");

		loser.setCanPvp(false);
		loser.getHintIconsManager().removeUnsavedHintIcon();
		loser.reset();
		loser.closeInterfaces();
		loser.getControlerManager().removeControlerWithoutCheck();

		victor.setCanPvp(false);
		victor.getHintIconsManager().removeUnsavedHintIcon();
		victor.reset();
		victor.closeInterfaces();
		victor.getControlerManager().removeControlerWithoutCheck();

		WorldTasksManager.schedule(new WorldTask() {
			@Override
			public void run() {
				loser.getControlerManager().startControler("LobbyControler");
				victor.getControlerManager().startControler("LobbyControler");
			}
		});
	}

	private void sendRewards(final Player victor, final Player loser, boolean isDraw) {
		if (victor.getDuelConfig().isRewarded() && loser.getDuelConfig().isRewarded()) {
			return;
		}

		if (victor.getDuelConfig().getStakedItems().getUsedSlots() > 0) {
			for (Item item : victor.getDuelConfig().getStakedItems().getItems()) {
				if (item == null)
					continue;
				victor.getInventory().addItemDrop(item.getId(), item.getAmount());
			}
		}

		if (loser.getDuelConfig().getStakedItems().getUsedSlots() > 0) {
			for (final Item item : loser.getDuelConfig().getStakedItems().getItems()) {
				if (item == null)
					continue;
				if (isDraw) {
					WorldTasksManager.schedule(new WorldTask() {
						@Override
						public void run() {
							loser.getInventory().addItemDrop(item.getId(), item.getAmount());
						}
					}, 1);
				} else {
					WorldTasksManager.schedule(new WorldTask() {
						@Override
						public void run() {
							victor.getInventory().addItemDrop(item.getId(), item.getAmount());
						}
					}, 1);
				}

			}
		}
		
		victor.getDuelConfig().setRewarded(true);
		loser.getDuelConfig().setRewarded(true);

		victor.getDuelConfig().getStakedItems().clear();
		loser.getDuelConfig().getStakedItems().clear();
	}

	private void finishTeleport(Player player, boolean loggedOut) {
		WorldTile tile = LOBBY_TELEPORTS[Utils.random(LOBBY_TELEPORTS.length)];
		WorldTile teleTile = tile;
		for (int trycount = 0; trycount < 10; trycount++) {
			teleTile = new WorldTile(tile, 2);
			if (World.isTileFree(tile.getPlane(), teleTile.getX(), teleTile.getY(), player.getSize()))
				break;
			teleTile = tile;
		}
		if (loggedOut) {
			player.setLocation(teleTile);
			return;
		}
		player.setNextWorldTile(teleTile);
	}

	@Override
	public boolean processButtonClick(int interfaceId, int componentId, int slotId, int packetId) {
		synchronized (this) {
			if (target == null || target.getControlerManager().getControler() == null
					|| !(target.getControlerManager().getControler() instanceof ArenaControler)
					|| player.getControlerManager().getControler() == null
					|| !(player.getControlerManager().getControler() instanceof ArenaControler))
				return false;

			synchronized (target.getControlerManager().getControler()) {
				if (interfaceId == 631) {
					if (componentId == 107)
						close(DuelStage.DECLINED);
					else if (componentId == 46)
						accept(true);
					else if (componentId == 47) {
						if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET) {
							remove(slotId, 1);
						} else if (packetId == WorldPacketsDecoder.ACTION_BUTTON2_PACKET) {
							remove(slotId, 5);
						} else if (packetId == WorldPacketsDecoder.ACTION_BUTTON3_PACKET) {
							remove(slotId, 10);
						} else if (packetId == WorldPacketsDecoder.ACTION_BUTTON4_PACKET) {
							Item item = player.getInventory().getItems().get(slotId);
							if (item == null)
								return false;
							remove(slotId, player.getInventory().getItems().getNumberOf(item));
						}
					} else if (componentId == 53) {
						player.sm("This feature is currently disabled, try again later.");
					} else if (componentId == 68) {
						int nextModeOrdinal = (duelMode.ordinal() + 1);
						DuelMode nextDuelMode = null;

						if (nextModeOrdinal >= DuelMode.values().length) {
							nextDuelMode = DuelMode.STANDARD;
						} else {
							nextDuelMode = DuelMode.values()[nextModeOrdinal];
						}

						synchronized (this) {
							Controler controler = target.getControlerManager().getControler();
							if (controler == null || !(controler instanceof ArenaControler))
								return false;

							synchronized (controler) {
								ArenaControler tControler = (ArenaControler) controler;

								this.duelMode = nextDuelMode;
								tControler.duelMode = nextDuelMode;

								player.getPackets().sendIComponentText(631, 69, duelMode.formatted());
								target.getPackets().sendIComponentText(631, 69, tControler.duelMode.formatted());

								player.getDuelConfig().resetRules();
								target.getDuelConfig().resetRules();

								if (!nextDuelMode.equals(DuelMode.STANDARD)) {
									AdvancedRuleSet ruleSet = nextDuelMode.getSet();
									for (RuleSet set : ruleSet.getRules()) {
										player.getDuelConfig().setRule(set);
										target.getDuelConfig().setRule(set);
									}
								}

								this.cancelAccepted();
								tControler.cancelAccepted();
							}
						}
					} else {
						RuleSet rule = RuleSet.forComponent(componentId, true);
						if (rule == null) {
							return false;
						} else if (!duelMode.equals(DuelMode.STANDARD)) {
							player.sm("You can not modify rules in the currrent mode.");
							return false;
						}

						setRule(rule);
					}
					return false;
				} else if (interfaceId == 193 || interfaceId == 430 || interfaceId == 192) {
					if (player.getDuelConfig().isRuleEnabled(RuleSet.NO_MAGIC) && isDueling) {
						player.sm("You can not use magic in this duel.");
						return false;
					}
				} else if (interfaceId == 749) {
					if (player.getDuelConfig().isRuleEnabled(RuleSet.NO_PRAYER)) {
						if (componentId == 4) {
							player.sm("You can not use prayer in this duel.");
							return false;
						}
					}
				} else if (interfaceId == 271) {
					if (player.getDuelConfig().isRuleEnabled(RuleSet.NO_PRAYER)) {
						player.sm("You can not use prayer in this duel.");
						return false;
					}
				} else if (interfaceId == 884) {
					if (player.getDuelConfig().isRuleEnabled(RuleSet.NO_SPECIAL)) {
						if (componentId == 4) {
							player.sm("You can not use special attack in this duel.");
							return false;
						}
					}
				} else if (interfaceId == 637) {
					if (componentId == 86)
						close(DuelStage.DECLINED);
					else if (componentId == 21)
						accept(true);
					else {
						RuleSet rule = RuleSet.forComponent(componentId, false);
						if (rule == null) {
							return false;
						}

						setRule(rule);
					}
					return false;
				} else if (interfaceId == 628) {
					if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET) {
						add(slotId, 1);
					} else if (packetId == WorldPacketsDecoder.ACTION_BUTTON2_PACKET) {
						add(slotId, 5);
					} else if (packetId == WorldPacketsDecoder.ACTION_BUTTON3_PACKET) {
						add(slotId, 10);
					} else if (packetId == WorldPacketsDecoder.ACTION_BUTTON4_PACKET) {
						Item item = player.getInventory().getItems().get(slotId);
						if (item == null)
							return false;
						add(slotId, player.getInventory().getItems().getNumberOf(item));
					}
					return false;
				} else if (interfaceId == 626) {
					if (componentId == 43) {
						accept(false);
					}
					return false;
				} else if (interfaceId == 639) {
					if (componentId == 25) {
						accept(false);
					}
					return false;
				}
			}
		}
		return true;
	}

	public void remove(final int slot, int amount) {
		synchronized (this) {
			if (!hasTarget())
				return;
			Controler controler = target.getControlerManager().getControler();
			if (controler == null || !(controler instanceof ArenaControler))
				return;
			synchronized (target.getControlerManager().getControler()) {
				Item item = player.getDuelConfig().getStakedItems().get(slot);
				if (item == null)
					return;
				Item[] itemsBefore = player.getDuelConfig().getStakedItems().getItemsCopy();
				int maxAmount = player.getDuelConfig().getStakedItems().getNumberOf(item);
				item = new Item(item.getId(), amount < maxAmount ? amount : maxAmount);
				player.getDuelConfig().getStakedItems().remove(slot, item);
				player.getInventory().addItem(item);
				refreshItems(itemsBefore);
				cancelAccepted();
			}
		}
	}

	private void setRule(RuleSet rule) {
		player.getDuelConfig().setRule(rule);
		target.getDuelConfig().setRule(rule);
		((ArenaControler) target.getControlerManager().getControler()).cancelAccepted();
	}

	private void accept(boolean main) {
		synchronized (this) {
			if (!hasTarget())
				return;
			else if (!player.getDuelConfig().isValid(target, duelMode))
				return;

			boolean targetAccepted = (Boolean) target.getAttribute("acceptedDuel");
			synchronized (target.getControlerManager().getControler()) {
				if (targetAccepted) {
					if (main) {
						if (nextStage()) {
							((ArenaControler) target.getControlerManager().getControler()).nextStage();
						}
					} else {
						player.setCloseInterfacesEvent(null);
						player.closeInterfaces();
						close(DuelStage.DONE);
					}
					return;
				}

				player.putAttribute("acceptedDuel", true);
				refreshScreenMessages(main, !staked);
			}
		}
	}

	private boolean nextStage() {
		if (!hasTarget())
			return false;

		player.putAttribute("acceptedDuel", false);
		openConfirm(!staked);
		player.getInterfaceManager().removeInventoryInterface();

		return true;
	}

	private void openConfirm(boolean friendly) {
		if (staked && player.getDuelConfig().getStakedItems().getUsedSlots() > 0) {
			player.getPackets().sendIComponentText(626, 25, "");
			target.getPackets().sendIComponentText(626, 25, "");
		}
		if (staked && target.getDuelConfig().getStakedItems().getUsedSlots() > 0) {
			player.getPackets().sendIComponentText(626, 26, "");
			target.getPackets().sendIComponentText(626, 26, "");
		}
		player.getInterfaceManager().sendInterface(friendly ? 639 : 626);
		refreshScreenMessages(false, friendly);
	}

	private void add(int slotId, int count) {
		synchronized (this) {
			if (!hasTarget())
				return;

			Controler controler = target.getControlerManager().getControler();
			if (controler == null || !(controler instanceof ArenaControler))
				return;

			synchronized (target.getControlerManager().getControler()) {
				Item item = player.getInventory().getItem(slotId);
				if (item == null)
					return;
				else if (!ItemConstants.isTradeable(item)) {
					player.sm("This item cannot be staked.");
					return;
				} else if (item.getDefinitions().isNoted()) {
					player.sm("Noted items cannot be staked.");
					return;
				}

				Item[] itemsBefore = player.getDuelConfig().getStakedItems().getItemsCopy();

				int maxCount = player.getInventory().getNumerOf(item.getId());
				item = new Item(item.getId(), count < maxCount ? count : maxCount);

				if (item.getId() == 12183 || item.getId() == 18768) {
					player.sm("This item cannot be staked.");
					return;
				}

				if (item.getId() == 995 && item.getAmount() > 500_000_000) {
					player.sm("You cannot stake more than 500 million coins.");
					return;
				}

				if (player.getDuelConfig().getStakedItems().contains(item) && item.getId() != 995) {
					player.sm("You cannot stake more than one of any item.");
					return;
				}

				if (!player.getDuelConfig().getStakedItems().add(item)) {
					player.sm("You cannot add anymore items to this stake.");
					return;
				}

				player.getInventory().deleteItem(slotId, item);

				refreshItems(itemsBefore);
				cancelAccepted();
			}
		}
	}

	private void refreshItems(Item[] itemsBefore) {
		int[] changedSlots = new int[itemsBefore.length];
		int count = 0;
		for (int index = 0; index < itemsBefore.length; index++) {
			Item item = player.getDuelConfig().getStakedItems().getItems()[index];
			if (itemsBefore[index] != item) {
				changedSlots[count++] = index;
			}
		}
		int[] finalChangedSlots = new int[count];
		System.arraycopy(changedSlots, 0, finalChangedSlots, 0, count);
		refresh(finalChangedSlots);
	}

	private void cancelAccepted() {
		boolean canceled = false;
		if ((Boolean) player.getTemporaryAttributtes().get("acceptedDuel")) {
			player.getTemporaryAttributtes().put("acceptedDuel", false);
			canceled = true;
		}
		if ((Boolean) target.getTemporaryAttributtes().get("acceptedDuel")) {
			target.getTemporaryAttributtes().put("acceptedDuel", false);
			canceled = true;
		}

		if (canceled)
			refreshScreenMessages(canceled, !staked);
	}

	private void refreshScreenMessages(boolean firstStage, boolean ifFriendly) {
		refreshScreenMessage(firstStage, ifFriendly);
		((ArenaControler) target.getControlerManager().getControler()).refreshScreenMessage(firstStage, ifFriendly);
	}

	private void refresh(int... slots) {
		player.getPackets().sendUpdateItems(134, player.getDuelConfig().getStakedItems(), slots);
		target.getPackets().sendUpdateItems(134, true, player.getDuelConfig().getStakedItems().getItems(), slots);
	}

	private void reset() {
		target = null;
		player.putAttribute("acceptedDuel", false);
	}

	private boolean hasTarget() {
		return target != null;
	}

	private void refreshScreenMessage(boolean firstStage, boolean ifFriendly) {
		player.getPackets().sendIComponentText(firstStage ? (ifFriendly ? 637 : 631) : (ifFriendly ? 639 : 626),
				firstStage ? (ifFriendly ? 20 : 41) : (ifFriendly ? 23 : 35), "<col=ff0000>" + getAcceptMessage(firstStage));
	}

	private String getAcceptMessage(boolean firstStage) {
		if (target.getAttribute("acceptedDuel") == Boolean.TRUE)
			return "Other player has accepted.";
		else if (player.getAttribute("acceptedDuel") == Boolean.TRUE)
			return "Waiting for other player...";
		return firstStage ? "" : "Please look over the agreements to the duel.";
	}

	private void sendOptions() {
		player.getInterfaceManager().sendInventoryInterface(628);
		player.getPackets().sendUnlockIComponentOptionSlots(628, 0, 0, 27, 0, 1, 2, 3, 4, 5);
		player.getPackets().sendInterSetItemsOptionsScript(628, 0, 93, 4, 7, "Stake 1", "Stake 5", "Stake 10", "Stake All",
				"Examine");
		player.getPackets().sendUnlockIComponentOptionSlots(631, 47, 0, 27, 0, 1, 2, 3, 4, 5);
		player.getPackets().sendInterSetItemsOptionsScript(631, 0, 120, 4, 7, "Remove 1", "Remove 5", "Remove 10", "Remove All",
				"Examine");
	}

	@Override
	public boolean canEat(Food food) {
		if (player.getDuelConfig().isRuleEnabled(RuleSet.NO_FOOD) && isDueling) {
			player.getPackets().sendGameMessage("You cannot eat during this duel.", true);
			return false;
		}
		return true;
	}

	@Override
	public boolean canPot(Drink pot) {
		if (player.getDuelConfig().isRuleEnabled(RuleSet.NO_DRINKS) && isDueling) {
			player.getPackets().sendGameMessage("You cannot drink during this duel.");
			return false;
		}
		return true;
	}

	@Override
	public boolean canMove(int dir) {
		if (player.getDuelConfig().isRuleEnabled(RuleSet.NO_MOVEMENT) && isDueling) {
			player.getPackets().sendGameMessage("You cannot move during this duel!");
			return false;
		}
		return true;
	}

	@Override
	public boolean canSummonFamiliar() {
		if (player.getDuelConfig().isRuleEnabled(RuleSet.ENABLE_SUMMONING) && isDueling)
			return true;
		player.getPackets().sendGameMessage("Summoning has been disabled during this duel!");
		return false;
	}

	@Override
	public void magicTeleported(int type) {
		finish(FinishType.TELEPORT);
	}

	@Override
	public boolean logout() {
		finish(FinishType.LOGOUT);
		finishTeleport(player, true);
		return false;
	}

	@Override
	public boolean sendDeath() {
		player.lock(7);
		player.stopAll();
		WorldTasksManager.schedule(new WorldTask() {
			int loop;

			@Override
			public void run() {
				player.stopAll();
				if (loop == 0) {
					player.setNextAnimation(new Animation(836));
				} else if (loop == 1) {
					player.getPackets().sendGameMessage("Oh dear, you have died.");
				} else if (loop == 3) {
					player.setNextAnimation(new Animation(-1));
					finish(FinishType.LOST);
					this.stop();
				}
				loop++;
			}
		}, 0, 1);
		return false;
	}

	@Override
	public boolean canEquip(int slotId, int itemId) {
		if (isDueling) {
			RuleSet rule = null;
			for (RuleSet set : RuleSet.values()) {
				int slot = set.getSlot();
				if (slot < 0 || slot > 14)
					continue;

				if (slot == slotId) {
					rule = set;
					break;
				}
			}

			if (!duelMode.equals(DuelMode.STANDARD)) {
				if (duelMode.equals(DuelMode.DUEL_DDS)) {
					if (itemId != AdvancedRuleSet.DUEL_DDS.getWeapon()) {
						player.getPackets().sendGameMessage(
								"You can't equip " + ItemDefinitions.getItemDefinitions(itemId).getName().toLowerCase()
										+ " during this duel.");
						return false;
					}
				} else if (duelMode.equals(DuelMode.DUEL_WHIP)) {
					if (itemId != AdvancedRuleSet.DUEL_WHIP.getWeapon()) {
						player.getPackets().sendGameMessage(
								"You can't equip " + ItemDefinitions.getItemDefinitions(itemId).getName().toLowerCase()
										+ " during this duel.");
						return false;
					}
				} else if (duelMode.equals(DuelMode.DUEL_RAPIER)) {
					if (itemId != AdvancedRuleSet.DUEL_RAPIER.getWeapon()) {
						player.getPackets().sendGameMessage(
								"You can't equip " + ItemDefinitions.getItemDefinitions(itemId).getName().toLowerCase()
										+ " during this duel.");
						return false;
					}
				}
			}

			if (player.getDuelConfig().isRuleEnabled(rule)) {
				player.getPackets().sendGameMessage(
						"You can't equip " + ItemDefinitions.getItemDefinitions(itemId).getName().toLowerCase()
								+ " during this duel.");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean keepCombating(Entity victim) {
		boolean isRanging = PlayerCombat.isRanging(player) != 0;
		if (player.getTemporaryAttributtes().get("canFight") == Boolean.FALSE) {
			player.getPackets().sendGameMessage("The duel hasn't started yet.");
			return false;
		}
		if (target != victim) {
			player.getPackets().sendGameMessage(
					"You may only attack your target, you can find your target by following the hint icon on your map.");
			return false;
		}
		if ((player.getEquipment().getWeaponId() == 22496 || player.getCombatDefinitions().getSpellId() > 0)
				&& player.getDuelConfig().isRuleEnabled(RuleSet.NO_MAGIC) && isDueling) {
			player.getPackets().sendGameMessage("You cannot use Magic in this duel!");
			return false;
		} else if (isRanging && player.getDuelConfig().isRuleEnabled(RuleSet.NO_RANGED) && isDueling) {
			player.getPackets().sendGameMessage("You cannot use Range in this duel!");
			return false;
		} else if (!isRanging && player.getDuelConfig().isRuleEnabled(RuleSet.NO_MELEE)
				&& player.getCombatDefinitions().getSpellId() <= 0 && isDueling) {
			player.getPackets().sendGameMessage("You cannot use Melee in this duel!");
			return false;
		} else {
			for (Item item : FUN_WEAPONS) {
				if (player.getDuelConfig().isRuleEnabled(RuleSet.FUN_WEAPONS)
						&& !player.getInventory().containsItem(item.getId(), item.getAmount())) {
					player.getPackets().sendGameMessage("You can only use fun weapons in this duel!");
					return false;
				}
			}
		}
		return true;
	}
}
