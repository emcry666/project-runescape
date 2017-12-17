package com.rs.game.player.content.stealingcreations;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.ForceMovement;
import com.rs.game.Graphics;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.item.FloorItem;
import com.rs.game.item.Item;
import com.rs.game.npc.NPC;
import com.rs.game.npc.familiar.Familiar;
import com.rs.game.player.Equipment;
import com.rs.game.player.Inventory;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Action;
import com.rs.game.player.actions.PlayerCombat;
import com.rs.game.player.controlers.Controler;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.net.decoders.WorldPacketsDecoder;
import com.rs.utils.Utils;

public class StealingCreationController extends Controler {

	enum CreationChunks {

		FRAGMENTS(10602, -1, Skills.HUNTER),

		TREE(10603, 14132, Skills.WOODCUTTING),

		ROCK(10608, 14122, Skills.MINING),

		POOL(10613, 14142, Skills.FISHING),

		SWARM(10618, 14152, Skills.HUNTER);

		private final int baseAnimation, baseItem, skillRequested;

		private CreationChunks(int baseAnimation, int baseItem,
				int skillRequested) {
			this.baseAnimation = baseAnimation;
			this.baseItem = baseItem;
			this.skillRequested = skillRequested;
		}

		public int getBaseAnimation() {
			return baseAnimation;
		}

		public int getBaseItem() {
			return baseItem;
		}

		public int getRequestedSkill() {
			return skillRequested;
		}
	}

	private StealingCreationGame game;

	private boolean team;
	
	@Override
	public boolean canUseCommands() {
		player.getPackets().sendGameMessage("You cannot use commands in here.");
		return false;
	}
	
	@Override
	public boolean processMagicTeleport(WorldTile toTile) {
		player.getPackets().sendGameMessage("You cannot teleport out of here.");
		return false;
	}
	
	@Override
	public boolean processItemTeleport(WorldTile toTile) {
		player.getPackets().sendGameMessage("You cannot teleport out of here.");
		return false;
	}
	
	@Override
	public boolean processObjectTeleport(WorldTile toTile) {
		player.getPackets().sendGameMessage("You cannot teleport out of here.");
		return false;
	}
	
	@Override
	public boolean processDragonStoneTeleport(WorldTile toTile) {
		player.getPackets().sendGameMessage("You cannot teleport out of here.");
		return false;
	}
	

	@Override
	public boolean canAttack(Entity target) {
		if (target instanceof Player) {
			final Player playerTarget = (Player) target;
			if (playerTarget.getEquipment().getCapeId() == player
					.getEquipment().getCapeId()) {
				player.getPackets().sendGameMessage(
						"You cannot attack players on your team!");
				return false;
			} else if (playerTarget.getInterfaceManager().containsScreenInter()) {
				player.getPackets().sendGameMessage(
						"You cannot attack players protected by the kiln!");
				return false;
			} else if (playerTarget.getAppearence().isHidden()) {
				player.getPackets().sendGameMessage(
						"You cannot attack players inside of a bubble!");
				return false;
			} else if (player.getAppearence().isHidden()) {
				player.getPackets().sendGameMessage(
						"You cannot attack players from inside of a bubble!");
				return false;
			}
		} else if (target instanceof Familiar) {
			final Familiar familiar = (Familiar) target;
			final Player owner = familiar.getOwner();
			if (owner.getEquipment().getCapeId() == player.getEquipment()
					.getCapeId()) {
				player.getPackets()
						.sendGameMessage(
								"You cannot attack a familiar on the same side as you!");
				return false;
			} else if (owner.getAppearence().isHidden()) {
				player.getPackets()
				.sendGameMessage(
						"You cannot attack familiars inside of a bubble!");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean canEquip(int slot, int item) {
		if (slot == Equipment.SLOT_CAPE) {
			player.getPackets().sendGameMessage(
					"You can't remove your team's colours.");
			return false;
		}
		return true;
	}

	@Override
	public boolean canHit(Entity target) {
		if (target instanceof Player) {
			final Player playerTarget = (Player) target;
			if (playerTarget.getEquipment().getCapeId() == player
					.getEquipment().getCapeId()
					|| Helper.withinSafeArea(playerTarget, game.getArea(),
							!getTeam())) {
				return false;
			}
		} else if (target instanceof Familiar) {
			final Familiar familiar = (Familiar) target;
			final Player owner = familiar.getOwner();
			if (owner.getEquipment().getCapeId() == player.getEquipment()
					.getCapeId()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean canPlayerOption3(final Player target) {
		final int thievingLevel = player.getSkills().getLevel(Skills.THIEVING);
		final Long PICKPOCK_DELAY = (Long) player.getTemporaryAttributtes()
				.get("PICKPOCK_DELAY");
		if (PICKPOCK_DELAY != null
				&& PICKPOCK_DELAY + 1500 > Utils.currentTimeMillis()) {
			return false;
		} else if (player.getAttackedBy() != null
				&& player.getAttackedByDelay() > Utils.currentTimeMillis()) {
			player.getPackets().sendGameMessage(
					"You can't do this while you're under combat.");
			return false;
		} else if (target.getEquipment().getCapeId() == player.getEquipment()
				.getCapeId()) {
			player.getPackets().sendGameMessage(
					"You cannot pickpocket player that is on the same team!");
			return false;
		} else if (target.getSkills().getLevel(Skills.THIEVING) - thievingLevel >= 20) {
			player.getPackets()
					.sendGameMessage(
							"You need a theiving level of at least "
									+ (target.getSkills().getLevel(
											Skills.THIEVING) - 20)
									+ " to pickpocket "
									+ Utils.formatPlayerNameForDisplay(target
											.getDisplayName() + "."));
			return false;
		} else if (target.getInventory().getFreeSlots() == 28) {
			player.getPackets().sendGameMessage(
					Utils.formatPlayerNameForDisplay(target.getDisplayName()
							+ " appears to have nothing in his pockets."));
			return false;
		} else if (!player.withinDistance(target, 3)) {
			return false;
		} else if (player.getInventory().getFreeSlots() == 0) {
			player.getPackets()
					.sendGameMessage(
							"You don't have enough space in your inventory to steal from your target.");
			return false;
		} else if (target.isDead()) {
			player.getPackets().sendGameMessage("Too late.");
			return false;
		} else if (target.getControlerManager().getControler() == null) {
			return false;
		} else if (!(target.getControlerManager().getControler() instanceof StealingCreationController)) {
			return false;
		}
		player.faceEntity(target);
		player.setNextAnimation(new Animation(881));
		player.getPackets().sendGameMessage(
				"You attempt to pickpocket from "
						+ Utils.formatPlayerNameForDisplay(target
								.getDisplayName()) + "'s pockets.");
		player.getPackets().sendGameMessage(
				"You pick "
						+ Utils.formatPlayerNameForDisplay(target
								.getDisplayName()) + "'s pocket.");
		player.getTemporaryAttributtes().put("PICKPOCK_DELAY",
				Utils.currentTimeMillis());
		final int level = Utils.getRandom(thievingLevel);
		final double ratio = level
				/ (Utils.random(target.getSkills().getLevel(Skills.THIEVING)) + 6);
		if (!(Math.round(ratio * thievingLevel) > target.getSkills().getLevel(
				Skills.THIEVING))) {
			player.getPackets().sendGameMessage(
					"You fail to pickpocket "
							+ Utils.formatPlayerNameForDisplay(target
									.getDisplayName()) + ".");
		} else {
			Item caughtItem = getCalculatedItem(target);
			itemLoop: for (int i = 0; i < 100; i++) {
				if (caughtItem == null)
					caughtItem = getCalculatedItem(target);
				else {
					if (player.getInventory().addItem(caughtItem))
						target.getInventory().deleteItem(caughtItem);
					break itemLoop;
				}
			}
			player.getPackets().sendGameMessage(
					"You sucessfully pickpocket an item from "
							+ Utils.formatPlayerNameForDisplay(target
									.getDisplayName()) + "'s pockets!");
		}
		return false;
	}

	@Override
	public boolean canPlayerOption4(Player target) {
		if (target.getEquipment().getCapeId() != player.getEquipment()
				.getCapeId()) {
			player.getPackets()
					.sendGameMessage(
							"You cannot give an item to a player on the opposite team!");
			return false;
		/*} else if (!target.isAcceptingAid()) {
			player.getPackets().sendGameMessage(
					"That player currently does not want your aid.");
			return false;*/
		}
		return true;
	}

	@Override
	public boolean canTakeItem(FloorItem item) {
		final Score score = game.getScore(player);
		if (!item.hasOwner()) {
			final String name = item.getName().toLowerCase();
			final int nameIndex = name.indexOf("(class");
			int clayQuality = 1;
			if (nameIndex != -1)
				clayQuality = name.contains("potion") ? 1 : Integer
						.parseInt(name.substring(nameIndex)
								.replace("(class ", "").replace(")", ""));
			score.updateDepositing(-2
					* (((item.getDefinitions().isStackable() ? 1 : 30) * clayQuality) * item
							.getAmount()));
			sendScore(score);
		}
		return true;
	}

	private void doFoodEffect(Item item, int itemTier) {
		if (player.getFoodDelay() > Utils.currentTimeMillis())
			return;
		player.setNextAnimation(new Animation(829));
		player.addFoodDelay(1800);
		player.getPackets().sendGameMessage("You eat the food.");
		final int hp = player.getHitpoints();
		player.heal(40 * itemTier);
		if (player.getHitpoints() > hp)
			player.getPackets().sendGameMessage("It heals some health.");
		player.getActionManager().setActionDelay(
				player.getActionManager().getActionDelay() + 3);
		player.getInventory().deleteItem(item);
	}

	@Override
	public void forceClose() {
		player.getInterfaceManager().closeOverlay(false);
	}

	public Item getCalculatedItem(Player target) {
		return target.getInventory().getItem(
				Utils.random(target.getInventory().getItemsContainerSize()));
	}

	public StealingCreationGame getGame() {
		return game;
	}

	public boolean getTeam() {
		return team;
	}

	@Override
	public boolean handleItemOnObject(WorldObject object, Item item) {
		if (object.getId() == 39533) {
			game.sendItemToBase(player, item, getTeam(), false);
			return true;
		}
		return true;
	}

	@Override
	public boolean keepCombating(Entity target) {
		if (target instanceof Player) {
			final Player playerTarget = (Player) target;
			if (playerTarget.getAppearence().isNPC()) {
				player.getPackets().sendGameMessage(
						"Your target is nowhere to be found.");
				return false;
			} else if (Helper.withinSafeArea(playerTarget, game.getArea(),
					!getTeam())
					|| Helper.withinSafeArea(player, game.getArea(), getTeam())) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean login() {
		Helper.sendHome(player);
		return true;
	}

	@Override
	public boolean logout() {
		game.remove(player);
		player.setLocation(Helper.EXIT);
		Helper.reset(player);
		return true;
	}

	@Override
	public void magicTeleported(int type) {
		game.remove(player);
	}

	/**
	 * Edit*
	 */
	@Override
	public void moved() {
		final GameArea area = game.getArea();
		if (area.getFlags() != null) {
			final int flagX = player.getChunkX() - (area.getMinX() >> 3);
			final int flagY = player.getChunkY() - (area.getMinY() >> 3);
			if (area.getType(flagX, flagY) == 5) {
				if (Helper.withinArea2(player, area, flagX, flagY, new int[] {
						1, 1, 4, 4 })) {
					if (!player.getAppearence().isNPC()) {
						player.getAppearence().setHidden(true, false);
						player.getAppearence().transformIntoNPC(1957);
						if (player.getFamiliar() != null)
							player.getFamiliar().transformIntoNPC(1957);
						// player.setRunHidden(false);
					}
				} else {
					resetFOG();
				}
			} else
				resetFOG();
		}
	}

	/*
	 * Edit*
	 */
	public void passWall(WorldObject object) {
		player.lock();
		if (!Helper.setWalkToGate(object, player)) {
			player.unlock();
		}
		final Player p = player;
		final WorldObject o = object;
		if (Helper.isAtGate(o, p)) {
			final WorldTile fromTile = new WorldTile(p.getX(), p.getY(),
					p.getPlane());
			final WorldTile faceTile = Helper.getFaceTile(o, p);
			p.getPackets().sendGameMessage("You pass through the barrier.");
			p.setNextWorldTile(faceTile);
			p.setNextForceMovement(new ForceMovement(fromTile, 0, faceTile, 1,
					Helper.getFaceDirection(faceTile, p)));
			p.setNextAnimation(new Animation(10584));
			p.setNextGraphics(new Graphics(getTeam() ? 1871 : 1870));
			WorldTasksManager.schedule(new WorldTask() {
				@Override
				public void run() {
					stop();
					p.unlock();
				}
			}, 1, 1);
		} else {
			WorldTasksManager.schedule(new WorldTask() {
				private int step = 0;

				@Override
				public void run() {
					if (step == 0 && !Helper.isAtGate(o, p)) {
						if (!p.hasWalkSteps() && p.getNextWalkDirection() == -1) {
							// unstuck
							stop();
							p.unlock();
						}
						return;
					}
					if (step == 0) {
						final WorldTile fromTile = new WorldTile(p.getX(), p
								.getY(), p.getPlane());
						final WorldTile faceTile = Helper.getFaceTile(o, p);
						p.getPackets().sendGameMessage(
								"You pass through the barrier.");
						p.setNextWorldTile(faceTile);
						p.setNextForceMovement(new ForceMovement(fromTile, 0,
								faceTile, 1, Helper.getFaceDirection(faceTile,
										p)));
						p.setNextAnimation(new Animation(10584));
						p.setNextGraphics(new Graphics(getTeam() ? 1871 : 1870));
						step++;
					} else if (step == 1) {
						stop();
						p.unlock();
					}
				}
			}, 1, 1);
		}
	}

	@Override
	public void process() {
		if (game == null
				|| (getPlayer().getX() < game.getArea().getMinX()
						|| getPlayer().getX() > game.getArea().getMaxX()
						|| player.getY() < game.getArea().getMinY() || player
						.getY() > game.getArea().getMaxY())) {
			getPlayer().getPackets().sendGameMessage(
					"An error has occured, please submit bug report.");
			game.remove(player);
			return;
		}
	}

	@Override
	public boolean processButtonClick(int interfaceId, int componentId,
			int slotId, int slotId2, int packetId) {
		if(interfaceId == 506) {
			return false;
		}
		if (interfaceId == 813) {
			if (componentId >= 37 && componentId <= 71)
				processKilnExchange(componentId, packetId);
			else if (componentId >= 99)
				processKilnQualities(componentId);
			return true;
		} else if (interfaceId == 387) {
			if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET && componentId == 9) {
				player.getPackets().sendGameMessage(
						"You can't remove your team's colours.");
				return false;
			}
		} else if (interfaceId == Inventory.INVENTORY_INTERFACE) {
			final Item item = player.getInventory().getItem(slotId);
			if (item != null) {
				final String itemName = item.getName().toLowerCase();
				if (itemName.contains("food (class")) {
					doFoodEffect(item, Integer.parseInt(item.getName()
							.substring(item.getName().indexOf("(class"))
							.replace("(class ", "").replace(")", "")));
					return false;
				} else if (itemName.contains("potion (")
						|| itemName.contains("super")) {
					final boolean superPotion = itemName.contains("super");
					int index = 0;
					for (final String name : Skills.SKILL_NAME) {
						final int doses = Integer.parseInt(itemName
								.substring(itemName.indexOf("("))
								.replace("(", "").replace(")", ""));
						final String skill = superPotion ? item.getName()
								.toLowerCase().replace("super ", "")
								.replace(" (" + doses + ")", "") : item
								.getName().toLowerCase()
								.replace(" potion (" + doses + ")", "");
						if (!name.toLowerCase().equals(skill)) {
							index++;
							continue;
						}
						player.getPackets().sendGameMessage(
								"You drink a dose of the "
										+ item.getName().toLowerCase()
												.replace("(" + doses + ")", "")
										+ ".");
						if (doses == 1) {
							player.getInventory().deleteItem(item);
							player.getPackets()
									.sendGameMessage(
											"The glass shatters as you drink the last dose of the potion.");
						} else {
							player.getInventory().getItems()
									.set(slotId, new Item(item.getId() + 2, 1));
							player.getInventory().refresh(slotId);
						}
						final int actualLevel = player.getSkills().getLevel(
								index);
						final int realLevel = player.getSkills().getLevelForXp(
								index);
						if (!skill.equals("prayer")) {
							final int level = actualLevel > realLevel ? realLevel
									: actualLevel;
							player.getSkills().set(index,
									level + (superPotion ? 7 : 4));
						} else
							player.getPrayer().restorePrayer(
									(int) (Math.floor(player.getSkills()
											.getLevelForXp(Skills.PRAYER)
											* .5
											+ (superPotion ? 70 : 100))));
						player.setNextAnimation(new Animation(829));
						player.getPackets().sendSound(4580, 0, 1);
					}
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public boolean processItemOnPlayer(Player target, Item item) {
		if (player.withinDistance(target, 3)) {
			if (target.isDead() || player.isDead()) {
				return false;
			} else if (target.getEquipment().getCapeId() != player
					.getEquipment().getCapeId()) {
				player.getPackets()
						.sendGameMessage(
								"You cannot give an item to a player on the opposite team!");
				return false;
			/*} else if (!target.isAcceptingAid()) {
				player.getPackets().sendGameMessage(
						"That player currently does not want your aid.");
				return false;*/
			} else {
				if (target.getInventory().addItem(item)) {
					player.getInventory().deleteItem(item);
					target.getPackets().sendGameMessage(
							Utils.formatPlayerNameForDisplay(player
									.getDisplayName())
									+ " has given you an item.");
					return false;
				} else {
					player.getPackets()
							.sendGameMessage(
									Utils.formatPlayerNameForDisplay(player
											.getDisplayName())
											+ " has insufficient room in their inventory.");
					return false;
				}
			}
		}
		return false;
	}

	public void processKilnExchange(int componentId, int packetId) {
		final int quality = player.getTemporaryAttributtes().get(
				"sc_kiln_quality") != null ? (int) player
				.getTemporaryAttributtes().get("sc_kiln_quality") : 0;
		final int clayId = Helper.SACRED_CLAY[quality];
		int amount = 0;
		if (packetId == WorldPacketsDecoder.ACTION_BUTTON1_PACKET)
			amount = 1;
		else if (packetId == WorldPacketsDecoder.ACTION_BUTTON2_PACKET)
			amount = 5;
		else if (packetId == WorldPacketsDecoder.ACTION_BUTTON3_PACKET) {
			player.getTemporaryAttributtes().put("sc_component", componentId);
			player.getTemporaryAttributtes().put("kilnX", true);
			player.getPackets().sendRunScript(108,
					new Object[] { "Enter Amount:" });
		} else if (packetId == WorldPacketsDecoder.ACTION_BUTTON4_PACKET)
			amount = player.getInventory().getAmountOf(clayId);
		else
			amount = (int) player.getTemporaryAttributtes().get(
					"sc_amount_making");
		if (Helper.checkSkillRequriments(player,
				Helper.getRequestedKilnSkill(componentId - 37), quality)) {
			if ((amount != 0 && Helper.proccessKilnItems(player, componentId,
					quality, clayId, amount))) {
				final Score score = game.getScore(player);
				if (score == null)
					return;
				score.updateProcessing(15 * quality);
				sendScore(score);
				return;
			}
		}
	}

	public void processKilnQualities(int componentId) {
		final int quality = (componentId - 99) / 2;
		if (!player.getInventory().containsOneItem(Helper.SACRED_CLAY[quality])) {
			player.getPackets().sendGameMessage(
					"You don't have any class " + (quality + 1) + " clay.");
			return;
		}
		Helper.setKilnQuality(player, quality);
	}

	@Override
	public boolean processNPCClick1(NPC n) {
		for (int i = 0; i < Helper.MANAGER_NPCS.length; i++) {
			if (n.getId() == Helper.MANAGER_NPCS[i]) {
				n.faceEntity(player);
				player.getDialogueManager().startDialogue(
						"StealingCreationManagerD", n);
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean processNPCClick2(NPC n) {
		for (int i = 0; i < Helper.MANAGER_NPCS.length; i++) {
			if (n.getId() == Helper.MANAGER_NPCS[i]) {
				n.faceEntity(player);
				Helper.displayClayStatus(game.getArea(), player);
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean processObjectClick1(final WorldObject object) {
		try {
			final GameArea area = game.getArea();
			final int flagX = player.getChunkX() - (area.getMinX() >> 3);
			final int flagY = player.getChunkY() - (area.getMinY() >> 3);

			boolean isEnemySCGate = false;
			boolean isEnemySCWall = false;

			gateLoop: for (final int[] wallIDS : (getTeam() ? Helper.BLUE_BARRIER_GATES
					: Helper.RED_BARRIER_GATES)) {
				for (final int id : wallIDS) {
					if (object.getId() == id) {
						isEnemySCGate = true;
						break gateLoop;
					}
				}
			}
			wallLoop: for (final int[] wallIDS : (getTeam() ? Helper.BLUE_BARRIER_WALLS
					: Helper.RED_BARRIER_WALLS)) {
				for (final int id : wallIDS) {
					if (object.getId() == id) {
						isEnemySCWall = true;
						break wallLoop;
					}
				}
			}

			if (object.getId() == Helper.KILN) {
				Helper.displayKiln(player);
				return false;
			} else if (object.getId() == 39533) {
				for (final Item item : player.getInventory().getItems()
						.getItems()) {
					if (item == null)
						continue;
					game.sendItemToBase(player, item, getTeam(), false);
				}
				return false;
			} else if ((!getTeam() && (object.getId() == Helper.BLUE_DOOR_1 || object
					.getId() == Helper.BLUE_DOOR_2))
					|| (getTeam() && (object.getId() == Helper.RED_DOOR_1 || object
							.getId() == Helper.RED_DOOR_2))) {
				passWall(object);
				return false;
			} else if (isEnemySCGate || isEnemySCWall) {
				final int x = object.getChunkX()
						- (game.getArea().getMinX() >> 3);
				final int y = object.getChunkY()
						- (game.getArea().getMinY() >> 3);
				final int xInChunk = object.getXInChunk();
				final int yInChunk = object.getYInChunk();
				final int playerXInChunk = player.getXInChunk();
				final int playerYInChunk = player.getYInChunk();

				player.getActionManager().setAction(new Action() {

					public boolean checkClipping() {
						final boolean frozen = player.getFreezeDelay() >= Utils
								.currentTimeMillis();
						if (xInChunk == 1 && playerXInChunk != 0) {
							if (frozen)
								return false;
							player.addWalkSteps(object.getX() - 1,
									player.getY());
						} else if (xInChunk == 7 && playerXInChunk != 8) {
							if (frozen)
								return false;
							player.addWalkSteps(object.getX() + 1,
									player.getY());
						} else if (yInChunk == 1 && playerYInChunk != 0) {
							if (frozen)
								return false;
							player.addWalkSteps(player.getX(),
									object.getY() - 1);
						} else if (yInChunk == 7 && playerYInChunk != 8) {
							if (frozen)
								return false;
							player.addWalkSteps(player.getX(),
									object.getY() + 1);
						}
						return true;
					}

					private int getActionDelay() {
						if (player.getActionManager().getAction() instanceof PlayerCombat) {
							PlayerCombat combat = (PlayerCombat) player.getActionManager().getAction();
							return combat.getMeleeCombatDelay(player, player.getEquipment().getWeaponId());
						}
						return 3;
					}

					@Override
					public boolean process(Player player) {
						if (player.isDead() || player.hasFinished()) {
							return false;
						}
						player.setNextAnimation(new Animation(PlayerCombat.getWeaponAttackEmote(player.getEquipment().getWeaponId(), player.getCombatDefinitions().getAttackStyle(), player)));
						player.setNextFaceWorldTile(object);
						return true;
					}

					@Override
					public int processWithDelay(Player player) {
						if (!game.damageBarrier(x, y))
							return -1;
						return getActionDelay();
					}

					@Override
					public boolean start(Player player) {
						if (!checkClipping())
							return false;
						setActionDelay(player, getActionDelay());
						return true;
					}

					@Override
					public void stop(Player player) {
						setActionDelay(player, 3);
					}
				});

				return false;
			} else if (object.getId() == Helper.PRAYER_ALTAR) {
				final boolean runEnergy = Utils.getRandom(1) == 0;
				if (runEnergy)
					player.setRunEnergy(100);
				return true;// return !runEnergy;
			} else if (object.getId() >= 39534 && object.getId() <= 39545) {
				return false;
			} else if (object.getId() == 39602 || object.getId() == 39613
					|| object.getId() == 39612 || object.getId() == 39611) {
				final boolean isWall = object.getId() == 39613
						|| object.getId() == 39612 || object.getId() == 39611;
				if (isWall) {
					if (player.getSkills().getLevel(Skills.AGILITY) < 60) {
						player.getPackets()
								.sendGameMessage(
										"You need to have an Agility level of 60 to clim over the wall.");
						return false;
					}
				}
				final int rotation = object.getRotation();
				int xExtra = 0, yExtra = 0, direction = 0;
				final int totalDistance = isWall ? 2 : 3;
				final int DX = object.getX() - player.getX();
				final int DY = object.getY() - player.getY();
				if (!isWall && (rotation == 1 || rotation == 3) || isWall
						&& (rotation == 0 || rotation == 2)) {
					if (!isWall && (Math.abs(DY) > 1 || DY == 1))
						return false;
					if (isWall && Math.abs(DY) > 0)
						return false;
					if (DX >= 0) {
						xExtra += totalDistance;
						direction = ForceMovement.EAST;
					} else if (DX < 0) {
						xExtra -= totalDistance;
						direction = ForceMovement.WEST;
					}
				} else {
					if (!isWall && (Math.abs(DX) > 1 || DX == 1))
						return false;
					if (isWall && Math.abs(DX) > 0)
						return false;
					if (DY >= 0) {
						yExtra += totalDistance;
						direction = ForceMovement.NORTH;
					} else if (DY < 0) {
						yExtra -= totalDistance;
						direction = ForceMovement.SOUTH;
					}
				}
				final WorldTile toTile = new WorldTile(player.getX() + xExtra,
						player.getY() + yExtra, player.getPlane());
				ForceMovement nextForceMovement;
				if (isWall)
					nextForceMovement = new ForceMovement(toTile, 2, direction);
				else
					nextForceMovement = new ForceMovement(player, 0, toTile, 2,
							direction);
				player.setNextForceMovement(nextForceMovement);
				player.setNextAnimation(new Animation(
						object.getId() == 39602 ? 6132 : 10590));
				player.lock();
				final int finalDirection = direction;
				WorldTasksManager.schedule(new WorldTask() {

					@Override
					public void run() {
						player.unlock();
						player.setDirection(finalDirection);
						player.setNextWorldTile(toTile);
					}
				}, 1);
			} else {
				final String name = object.getId() == 39569 ? "pool (class 2)"
						: object.getDefinitions().name.toLowerCase();// pool
																		// (class
																		// 2)
				if (name.indexOf("(class") == -1)
					System.out.println(object.getId()+": "+name);
				final int clayQuality = Integer.parseInt(name
						.substring(name.indexOf("(class"))
						.replace("(class ", "").replace(")", "")) - 1;//
				final CreationChunks skill = CreationChunks.valueOf(name
						.replace(" (class " + (clayQuality + 1) + ")", "")
						.toUpperCase());

				player.getActionManager().setAction(new Action() {

					Item bestItem;
					int itemTier;

					/*
					 * Edit*
					 */
					private int getActionDelay() {
						if (clayQuality == 0)
							return 2;
						int baseTime = Helper.OBJECT_TIERS[clayQuality];
						baseTime = (baseTime / 2) + (Utils.random(baseTime) / 2);// 0.5
																				// -
																				// 1
																				// times
																				// the
																				// baseTime
						int mineTimer = baseTime
								- player.getSkills().getLevel(
										skill.getRequestedSkill())
								- (bestItem == null ? 1
										: Helper.TOOL_TIERS[itemTier]);
						if (mineTimer < 2)
							mineTimer = 2;
						return mineTimer;
					}

					@Override
					public boolean process(Player player) {
						if (game.isEmpty(flagX, flagY)
								|| player.getInventory().getFreeSlots() == 0)
							return false;
						player.setNextAnimation(bestItem != null ? new Animation(
								skill.getBaseAnimation() + itemTier)
								: new Animation(10602));
						player.setNextFaceWorldTile(object);
						return true;
					}

					@Override
					public int processWithDelay(Player player) {
						final Score score = game.getScore(player);
						if (score == null)
							return -1;
						if (Utils.getRandom(clayQuality + 1) == 0)
							game.useSkillPlot(flagX, flagY);
						player.getInventory().addItem(
								new Item(Helper.SACRED_CLAY[clayQuality], 1));
						score.updateGathering(15 * (clayQuality + 1));
						sendScore(score);
						return getActionDelay();
					}

					@Override
					public boolean start(Player player) {
						if (name.contains(("empty")))
							return false;
						else if (player.getSkills().getLevel(
								skill.getRequestedSkill()) < clayQuality * 20) {
							player.getPackets()
									.sendGameMessage(
											"You need a "
													+ Skills.SKILL_NAME[skill
															.getRequestedSkill()]
													+ " level of "
													+ clayQuality
													* 20
													+ " to collect this level of clay.");
							return false;
						}
						itemLoop: for (int index = 4; index >= 0; index--) {
							final int baseItem = skill.getBaseItem();
							if (baseItem == -1)
								break itemLoop;
							final Item bestItem = new Item(baseItem
									+ (index * 2), 1);
							if (player.getEquipment().getWeaponId() == bestItem
									.getId()
									|| player.getInventory().containsItem(
											bestItem.getId(),
											bestItem.getAmount())) {
								if (player.getSkills().getLevel(
										skill.getRequestedSkill()) >= index * 20) {
									this.bestItem = bestItem;
									this.itemTier = index;
									break itemLoop;
								}
							}
						}
						setActionDelay(player, getActionDelay());
						return true;
					}

					@Override
					public void stop(Player player) {
						setActionDelay(player, 3);
					}
				});
			}
			return false;
		} catch (final StringIndexOutOfBoundsException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean processObjectClick2(WorldObject object) {
		boolean isFriendlySCGate = false;

		gateLoop: for (final int[] gateIDS : (getTeam() ? Helper.RED_BARRIER_GATES
				: Helper.BLUE_BARRIER_GATES)) {
			for (final int id : gateIDS) {
				if (object.getId() == id) {
					isFriendlySCGate = true;
					break gateLoop;
				}
			}
		}

		if (object.getId() == Helper.EMPTY_BARRIER1
				|| object.getId() == Helper.EMPTY_BARRIER2
				|| object.getId() == Helper.EMPTY_BARRIER3) {
			final boolean redTeam = getTeam();
			int tier = -1;
			for (int i = 4; i >= 0; i--) {
				if (player.getInventory().containsItem(Helper.BARRIER_ITEMS[i],
						4)) {
					tier = i;
					break;
				}
			}
			if (tier == -1) {
				player.getPackets().sendGameMessage(
						"You don't have enough barrier items to build.");
				return false;
			}
			final int t = tier;
			final int x = object.getChunkX() - (game.getArea().getMinX() >> 3);
			final int y = object.getChunkY() - (game.getArea().getMinY() >> 3);
			for (final Player otherPlayer : redTeam ? game.getBlueTeam() : game
					.getRedTeam()) {
				if (otherPlayer == null
						|| !otherPlayer.withinDistance(object, 6))
					continue;
				if (Helper.withinArea(otherPlayer, game.getArea(), x, y,
						new int[] { 2, 2 })) {
					player.getPackets()
							.sendGameMessage(
									"You cannot build a barrier while players from the other team are near the pallet.");
					return false;
				}
				otherPlayer.resetWalkSteps();
				otherPlayer.lock(3);
			}
			player.lock();
			WorldTasksManager.schedule(new WorldTask() {
				private int step = 0;

				@Override
				public void run() {
					if (step == 0) {
						player.setNextAnimation(new Animation(10589));
						step++;
					} else if (step == 1) {
						if (player.getInventory().removeItems(
								new Item(Helper.BARRIER_ITEMS[t], 4))
								&& !game.buildBarrier(getTeam(), t + 1, x, y)) {
							player.getInventory().addItem(
									new Item(Helper.BARRIER_ITEMS[t], 4));
						}
						player.unlock();
						stop();
					}
				}

			}, 0, 0);
			return false;
		} else if (isFriendlySCGate) {
			passWall(object);
			return false;
		}
		return true;
	}

	@Override
	public boolean processObjectClick3(WorldObject object) {
		boolean isFriendlySCGate = false;
		boolean isFriendlySCWall = false;

		gateLoop: for (final int[] gateIDS : (getTeam() ? Helper.RED_BARRIER_GATES
				: Helper.BLUE_BARRIER_GATES)) {
			for (final int id : gateIDS) {
				if (object.getId() == id) {
					isFriendlySCGate = true;
					break gateLoop;
				}
			}
		}
		wallLoop: for (final int[] gateIDS : (getTeam() ? Helper.RED_BARRIER_WALLS
				: Helper.BLUE_BARRIER_WALLS)) {
			for (final int id : gateIDS) {
				if (object.getId() == id) {
					isFriendlySCWall = true;
					break wallLoop;
				}
			}
		}

		if (isFriendlySCGate || isFriendlySCWall) {
			final int x = object.getChunkX() - (game.getArea().getMinX() >> 3);
			final int y = object.getChunkY() - (game.getArea().getMinY() >> 3);
			synchronized (game.getLock()) {
				final int team = game.getArea().getWallTeam(x, y);
				final int tier = game.getArea().getWallTier(x, y);
				final int health = game.getArea().getWallStatus(x, y);
				if (team != (getTeam() ? 2 : 1))
					return false;
				if (health <= 0 || health >= (tier * 4)) {
					player.getPackets().sendGameMessage(
							"This barrier doesn't need any repairing.");
					return false;
				}
				if (!player.getInventory().containsItem(
						Helper.BARRIER_ITEMS[tier - 1], 1)) {
					player.getPackets()
							.sendGameMessage(
									"You don't have enough barriers of required type to repair this barrier.");
					return false;
				}
				player.lock();
				WorldTasksManager.schedule(new WorldTask() {
					private int step = 0;

					@Override
					public void run() {
						if (step == 0) {
							player.setNextAnimation(new Animation(10589));
							step++;
						} else if (step == 1) {
							if (player
									.getInventory()
									.removeItems(
											new Item(
													Helper.BARRIER_ITEMS[tier - 1],
													1))
									&& !game.repairBarrier(x, y)) {
								player.getInventory().addItem(
										new Item(
												Helper.BARRIER_ITEMS[tier - 1],
												1));
							}
							player.unlock();
							stop();
						}
					}

				}, 0, 0);
			}

			return false;
		}
		return true;
	}

	/**
	 * Edit*
	 */
	private void resetFOG() {
		if (player.getAppearence().isNPC()) {
			player.getAppearence().setHidden(false, false);
			player.getAppearence().transformIntoNPC(-1);
			if (player.getFamiliar() != null)
				player.getFamiliar().transformIntoNPC(
						player.getFamiliar().getId());
			/*
			 * if (!player.getRun()) { WorldTasksManager.schedule(new
			 * WorldTask() {
			 * 
			 * @Override public void run() { player.setRunHidden(true); } }); }
			 */
		}
	}

	@Override
	public boolean sendDeath() {
		WorldTasksManager.schedule(new WorldTask() {
			int loop;

			@Override
			public void run() {
				if (loop == 0) {
					player.setNextAnimation(new Animation(836));
				} else if (loop == 1) {
					if (player.getFamiliar() != null)
						player.getFamiliar().sendDeath(player);
					player.getPackets().sendGameMessage(
							"Oh dear, you have died.");
				} else if (loop == 3) {
					final Score score = game.getScore(player);
					final Player killer = player
							.getMostDamageReceivedSourcePlayer();
					if (killer != null)
						killer.removeDamage(player);
					player.getEquipment().getItems()
							.set(Equipment.SLOT_CAPE, null);
					player.sendItemsOnDeath(killer);
					player.setNextWorldTile(Helper.getNearestRespawnPoint(
							player, game.getArea(), getTeam()));
					player.stopAll();
					player.reset();
					player.getInventory().reset();
					score.updateDied(300);
					sendScore(score);
					player.setNextAnimation(new Animation(-1));
				} else if (loop == 4) {
					Helper.giveCape(player, getTeam());
					player.getPackets().sendMusicEffect(90);
					player.resetWalkSteps();
					stop();
				}
				loop++;
			}
		}, 0, 1);
		return false;
	}

	@Override
	public void sendInterfaces() {
		player.getInterfaceManager().sendOverlay(809, false);
		player.getPackets().sendGlobalConfig(558,
				(int) ((game.getEndTime() - Utils.currentTimeMillis()) / 600)); // sync
		// time
		player.getPackets().sendConfigByFile(5493, getTeam() ? 2 : 1); // unlock
		// portal
		// opts
	}

	public void sendScore(Score score) {
		player.getPackets().sendConfig(1332, score.getGathering());
		player.getPackets().sendConfig(1333, score.getDepositing());
		player.getPackets().sendConfig(1334, score.getProcessing());
		player.getPackets().sendConfig(1335, score.getWithdrawing());
		player.getPackets().sendConfig(1337, score.getDamaging());
	}

	@Override
	public void start() {
		game = (StealingCreationGame) getArguments()[0];
		team = (Boolean) getArguments()[1];
		setArguments(null);
		sendInterfaces();
	}

	@Override
	public void trackXP(int skillId, int addedXp) {
		if (skillId == 3) {
			final Score score = game.getScore(player);
			if (score == null)
				return;
			score.updateDamaging((int) (addedXp * 7.2148148148148148148148148148148));
			sendScore(score);
		}
	}
}
