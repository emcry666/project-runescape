package com.rs.net.decoders.handlers;

import java.util.List;
import java.util.TimerTask;

import com.rs.Settings;
import com.rs.cache.loaders.Configs;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.engine.GameEngine;
import com.rs.game.Animation;
import com.rs.game.ForceTalk;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.item.MagicOnItem;
import com.rs.game.minigames.CrystalChest;
import com.rs.game.npc.NPC;
import com.rs.game.npc.familiar.Familiar.SpecialAttack;
import com.rs.game.npc.pet.Pet;
import com.rs.game.npc.vorago.Vorago;
import com.rs.game.npc.vorago.VoragoHandler;
import com.rs.game.player.ChargesManager;
import com.rs.game.player.CoordsEvent;
import com.rs.game.player.Equipment;
import com.rs.game.player.Inventory;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.AscensionBoltMaking;
import com.rs.game.player.actions.AscensionCrossbowMaking;
import com.rs.game.player.actions.FireLighter;
import com.rs.game.player.actions.FireLighter.Lighters;
import com.rs.game.player.actions.Firemaking;
import com.rs.game.player.actions.Fletching;
import com.rs.game.player.actions.Fletching.Fletch;
import com.rs.game.player.actions.GemCutting;
import com.rs.game.player.actions.GemCutting.Gem;
import com.rs.game.player.actions.HerbCleaning;
import com.rs.game.player.actions.Herblore;
import com.rs.game.player.actions.PortablePlacing;
import com.rs.game.player.actions.Summoning;
import com.rs.game.player.actions.Summoning.Pouches;
import com.rs.game.player.actions.SummoningPouch;
import com.rs.game.player.actions.TrapAction;
import com.rs.game.player.actions.divination.actions.DivinePlacing;
import com.rs.game.player.actions.fletching.BoltTipFletching;
import com.rs.game.player.actions.fletching.BoltTipFletching.BoltTips;
import com.rs.game.player.actions.hunter.BoxAction;
import com.rs.game.player.actions.hunter.BoxAction.HunterEquipment;
import com.rs.game.player.actions.hunter.ImplingLoot;
import com.rs.game.player.content.AncientEffigies;
import com.rs.game.player.content.ArmourSets;
import com.rs.game.player.content.ArmourSets.Sets;
import com.rs.game.player.content.Burying.Bone;
import com.rs.game.player.content.Dicing;
import com.rs.game.player.content.Drinkables;
import com.rs.game.player.content.Foods;
import com.rs.game.player.content.ItemSets;
import com.rs.game.player.content.LightSource;
import com.rs.game.player.content.LividFarm;
import com.rs.game.player.content.Magic;
import com.rs.game.player.content.OrnamentKits;
import com.rs.game.player.content.RepairItems.BrokenItems;
import com.rs.game.player.content.Runecrafting;
import com.rs.game.player.content.SkillCapeCustomizer;
import com.rs.game.player.content.TreeSaplings;
import com.rs.game.player.content.WeaponPoison;
import com.rs.game.player.content.XpLamps;
import com.rs.game.player.content.jobs.impl.miscellania.dialogues.FishermanFrodi;
import com.rs.game.player.content.jobs.impl.miscellania.dialogues.LumberjackLeif;
import com.rs.game.player.content.jobs.impl.miscellania.dialogues.MinerMagnus;
import com.rs.game.player.content.quest.QuestList.Quests;
import com.rs.game.player.content.quest.impl.piratestreasure.PiratesTreasure;
import com.rs.game.player.content.quest.impl.piratestreasure.interfaces.Scroll;
import com.rs.game.player.content.quest.impl.princealirescue.PrinceAliRescue;
import com.rs.game.player.controlers.Barrows;
import com.rs.game.player.controlers.FightKiln;
import com.rs.game.player.controlers.Wilderness;
import com.rs.game.player.dialogues.impl.LeatherCraftingD;
import com.rs.game.player.dialogues.impl.StealingCreationTool;
import com.rs.game.player.pathing.RouteEvent;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.io.InputStream;
import com.rs.utils.Archiver;
import com.rs.utils.Logger;
import com.rs.utils.Utils;

public class InventoryOptionsHandler {

	public static void handleItemOption2(final Player player, final int slotId,
			final int itemId, Item item) {
		if (Firemaking.isFiremaking(player, itemId))
			return;
		/*sif (itemId == 4155) {
			player.getSlayerManager().checkKillsLeft();
		}*/

		if (itemId >= 5509 && itemId <= 5514) {
			int pouch = -1;
			if (itemId == 5509)
				pouch = 0;
			if (itemId == 5510)
				pouch = 1;
			if (itemId == 5512)
				pouch = 2;
			if (itemId == 5514)
				pouch = 3;
			Runecrafting.emptyPouch(player, pouch);
			player.stopAll(false);
			if (itemId == 15262)
				ItemSets.openSkillPack(player, itemId, 12183, 5000, player.getInventory().getAmountOf(itemId));
			else if (itemId == 15362)
				ItemSets.openSkillPack(player, itemId, 230, 50, player.getInventory().getAmountOf(itemId));
			else if (itemId == 15363)
				ItemSets.openSkillPack(player, itemId, 228, 50, player.getInventory().getAmountOf(itemId));
			else if (itemId == 15364)
				ItemSets.openSkillPack(player, itemId, 222, 50, player.getInventory().getAmountOf(itemId));
			else if (itemId == 15365)
				ItemSets.openSkillPack(player, itemId, 9979, 50, player.getInventory().getAmountOf(itemId));
		} else if (itemId >= 15086 && itemId <= 15100) {
			Dicing.handleRoll(player, itemId, true); 
			return;
		} else if (item.getDefinitions().containsOption(1, "Extinguish")) {
			if (LightSource.extinguishSource(player, slotId, false)) {
				return;
			}
		} else {
			if (player.isEquipDisabled())
				return;
			long passedTime = GameEngine.CYCLE_RATE;
			WorldTasksManager.schedule(new WorldTask() {

				@Override
				public void run() {
					List<Integer> slots = player.getSwitchItemCache();
					int[] slot = new int[slots.size()];
					for (int i = 0; i < slot.length; i++)
						slot[i] = slots.get(i);
					player.getSwitchItemCache().clear();
					ButtonHandler.sendWear(player, slot);
					player.stopAll(false, true, false);
				}
			}, passedTime >= 600 ? 0 : passedTime > 330 ? 1 : 0);
			if (player.getSwitchItemCache().contains(slotId))
				return;
			player.getSwitchItemCache().add(slotId);
		}
	}

	public static void dig(final Player player) {
		player.resetWalkSteps();
		player.setNextAnimation(new Animation(830));
		player.lock();
		WorldTasksManager.schedule(new WorldTask() {

			@Override
			public void run() {
				player.unlock();
				if (Barrows.digIntoGrave(player))
					return;
				if (player.getTreasureTrailsManager().useDig())
				    return;
				if(player.getX() == 3005 && player.getY() == 3376
						|| player.getX() == 2999 && player.getY() == 3375
						|| player.getX() == 2996 && player.getY() == 3377
						|| player.getX() == 2989 && player.getY() == 3378
						|| player.getX() == 2987 && player.getY() == 3387
						|| player.getX() == 2984 && player.getY() == 3387) {
					//mole

					player.setNextWorldTile(new WorldTile(1752, 5137, 0));
					player.getPackets().sendGameMessage("You seem to have dropped down into a network of mole tunnels.");
					return;
				}
				player.getPackets().sendGameMessage("You find nothing.");
			}

		});
	}


	public static void handleItemOption1(Player player, final int slotId,
			final int itemId, Item item) {
		long time = Utils.currentTimeMillis();
		if (player.getLockDelay() >= time
				|| player.getEmotesManager().getNextEmoteEnd() >= time)
			return;
		player.stopAll(false);
		if (player.getTreasureTrailsManager().useItem(item, slotId))
		    return;
		if (Foods.eat(player, item, slotId))
			return;
		if (XpLamps.isSelectable(itemId) || XpLamps.isSkillLamp(itemId) || XpLamps.isOtherLamp(itemId)) {
			XpLamps.processLampClick(player, slotId, itemId);
			return;
		}
		if (itemId == 23127) {
			Item itemWon = null;
			Item[] gayRewards = new Item[] {
					new Item(5608, 1), new Item(5608, 1), new Item(5608, 1), new Item(5608, 1), new Item(5608, 1), new Item(5608, 1), new Item(5608, 1), new Item(5608, 1), new Item(5608, 1), new Item(5608, 1), new Item(5608, 2), new Item(5608, 2), new Item(5608, 2), new Item(5608, 2), new Item(5608, 2), new Item(5608, 2), new Item(5608, 2), new Item(5608, 2), new Item(5608, 3), new Item(5608, 3), new Item(5608, 3), new Item(5608, 3), new Item(5608, 3), new Item(5608, 3), new Item(5608, 3), new Item(5608, 4), new Item(5608, 4), new Item(5608, 4), new Item(5608, 4), new Item(5608, 4), new Item(5608, 4), new Item(5608, 5), new Item(5608, 5), new Item(5608, 5), new Item(5608, 5), new Item(5608, 5), new Item(5608, 6), new Item(5608, 6), new Item(5608, 7), new Item(5608, 7), new Item(5608, 8), new Item(5608, 10), new Item(5608, 9)
			};
			itemWon = new Item(gayRewards[Utils.random(gayRewards.length)]);
			player.getInventory().deleteItem(23127, 1);
			player.getInventory().addItem(itemWon.getId(), itemWon.getAmount());
			player.getPackets().sendGameMessage("You just recieved " + itemWon.getDefinitions().getName() + ". Congradulations!"); //this is what im wondering
		}
		
		
		if (itemId >= 15086 && itemId <= 15100) {
			Dicing.handleRoll(player, itemId, false); 
			return;
		}
		if (Drinkables.drink(player, item, slotId))
			return;
		if(GemCutting.canCut(player, itemId))
			return;
		
		/**
		 * Soulstones
		 */
		if(item.getId() == 28129) {
			player.teleport(2865, 5354, 0);
			return;
		}
		int leatherIndex = LeatherCraftingD.getIndex(item.getId());
		if (leatherIndex != -1) {
			player.getDialogueManager().startDialogue("LeatherCraftingD", leatherIndex);
			return;
		}
		if(itemId == 33830) {
			if(!player.getInventory().hasFreeSlots()) {
				player.getPackets().sendGameMessage("You do not have enough inventory space.");
				return;
			}
			player.getInventory().deleteItem(33830, 1);
			player.getInventory().addItem(33778);
			player.output("<col=ffffff>You investigate the Giant Feather and find a pet Chick'arra...");
		}
		if(itemId == 33832) {
			if(!player.getInventory().hasFreeSlots()) {
				player.getPackets().sendGameMessage("You do not have enough inventory space.");
				return;
			}
			player.getInventory().deleteItem(33780, 1);
			player.getInventory().addItem(33780);
			player.output("<col=ffffff>You investigate the Decaying Tooth and find a pet General Awwdor...");
		}
		if(itemId == 33831) {
			if(!player.getInventory().hasFreeSlots()) {
				player.getPackets().sendGameMessage("You do not have enough inventory space.");
				return;
			}
			player.getInventory().deleteItem(33779, 1);
			player.getInventory().addItem(33779);
			player.output("<col=ffffff>You investigate the Severed hoof and find a pet K'ril Tinyroth...");
		}
		if(itemId == 33850) {
			if(!player.getInventory().hasFreeSlots()) {
				player.getPackets().sendGameMessage("You do not have enough inventory space.");
				return;
			}
			player.getInventory().deleteItem(33850, 1);
			player.getInventory().addItem(33800);
			player.output("<col=ffffff>You investigate the Dagannoth Egg and find a pet Prime Hatchling...");
		}
		if (itemId == 2574) 
		    player.getTreasureTrailsManager().useSextant();
		else if (itemId == 2798 || itemId == 3565 || itemId == 3576 || itemId == 19042)
		    player.getTreasureTrailsManager().openPuzzle(itemId);
		if (itemId >= 5509 && itemId <= 5514) {
			int pouch = -1;
			if (itemId == 5509)
				pouch = 0;
			if (itemId == 5510)
				pouch = 1;
			if (itemId == 5512)
				pouch = 2;
			if (itemId == 5514)
				pouch = 3;
			Runecrafting.fillPouch(player, pouch);
			return;
		}
		if (itemId == 31041) {
			PortablePlacing.placePortable(player, itemId, 89767, PortablePlacing.FORGE);
		}
		if (itemId == 31042) {
			PortablePlacing.placePortable(player, itemId, 89768, PortablePlacing.RANGE);
		}
		if (itemId == 31043) {
			PortablePlacing.placePortable(player, itemId, 89769, PortablePlacing.SAWMILL);
		}
		if (itemId == 31044) {
			PortablePlacing.placePortable(player, itemId, 89770, PortablePlacing.WELL);
		}
		
		if (itemId == 29294) {
			DivinePlacing.placeDivine(player, itemId, 87285, 34107, 1, 14);
			// DivinePlacing.fucker = player;
			player.getPackets().sendGameMessage("You spawn a divine bronze rock.");
		} else if (itemId == 29295) {
			player.getPackets().sendGameMessage("You spawn a divine iron rock.");
			DivinePlacing.placeDivine(player, itemId, 87286, 57572, 15, 14);
		} else if (itemId == 29296) {
			DivinePlacing.placeDivine(player, itemId, 87287, 87266, 30, 14);
			player.getPackets().sendGameMessage("You spawn a divine coal rock.");
		} else if (itemId == 29297) {
			DivinePlacing.placeDivine(player, itemId, 87288, 87267, 55, 14);
			player.getPackets().sendGameMessage("You spawn a divine mithril rock.");
		} else if (itemId == 29298) {
			DivinePlacing.placeDivine(player, itemId, 87289, 87268, 70, 14);
			player.getPackets().sendGameMessage("You spawn a divine adamantite rock.");
		} else if (itemId == 29299) {
			DivinePlacing.placeDivine(player, itemId, 87290, 87269, 85, 14);
			player.getPackets().sendGameMessage("You spawn a divine runite rock.");
		}
		// divine trees
		else if (itemId == 29304) {
			DivinePlacing.placeDivine(player, itemId, 87295, 87274, 1, 8);
			player.getPackets().sendGameMessage("You spawn a divine tree.");
		} else if (itemId == 29305) {
			DivinePlacing.placeDivine(player, itemId, 87296, 87275, 15, 8);
			player.getPackets().sendGameMessage("You spawn a divine oak tree.");
		} else if (itemId == 29306) {
			DivinePlacing.placeDivine(player, itemId, 87297, 87276, 30, 8);
			player.getPackets().sendGameMessage("You spawn a divine willow tree.");
		} else if (itemId == 29307) {
			DivinePlacing.placeDivine(player, itemId, 87298, 87277, 45, 8);
			player.getPackets().sendGameMessage("You spawn a divine maple tree.");
		} else if (itemId == 29308) {
			DivinePlacing.placeDivine(player, itemId, 87299, 87278, 60, 8);
			player.getPackets().sendGameMessage("You spawn a divine yew tree.");
		} else if (itemId == 29309) {
			DivinePlacing.placeDivine(player, itemId, 87300, 87279, 75, 8);
			player.getPackets().sendGameMessage("You spawn a divine magic tree.");
		}
		// herbolore
		else if (itemId == 29310) {
			DivinePlacing.placeDivine(player, itemId, 87301, 87280, 9, 15);
			player.getPackets().sendGameMessage("You spawn a divine herb patch I.");
		} else if (itemId == 29311) {
			DivinePlacing.placeDivine(player, itemId, 87302, 87281, 44, 15);
			player.getPackets().sendGameMessage("You spawn a divine herb patch II.");
		} else if (itemId == 29312) {
			DivinePlacing.placeDivine(player, itemId, 87303, 87282, 67, 15);
			player.getPackets().sendGameMessage("You spawn a divine herb patch III.");
		}
		// hunting
		else if (itemId == 29300) {
			DivinePlacing.placeDivine(player, itemId, 87291, 87270, 1, 21);
			player.getPackets().sendGameMessage("You spawn a divine kebbit burrow.");
		} else if (itemId == 29301) {
			DivinePlacing.placeDivine(player, itemId, 87292, 87271, 1, 21);
			player.getPackets().sendGameMessage("You spawn a divine bird snare.");
		} else if (itemId == 29302) {
			DivinePlacing.placeDivine(player, itemId, 87293, 87272, 23, 21);
			player.getPackets().sendGameMessage("You spawn a divine deadfall trap.");
		} else if (itemId == 29303) {
			DivinePlacing.placeDivine(player, itemId, 87294, 87273, 53, 21);
			player.getPackets().sendGameMessage("You spawn a divine box trap.");
		}
		// fishing
		else if (itemId == 31080) {
			DivinePlacing.placeDivine(player, itemId, 90232, 90223, 10, 10);
			player.getPackets().sendGameMessage("You spawn a divine crayfish bubble.");
		} else if (itemId == 31081) {
			DivinePlacing.placeDivine(player, itemId, 90233, 90224, 10, 10);
			player.getPackets().sendGameMessage("You spawn a divine herring bubble.");
		} else if (itemId == 31082) {
			DivinePlacing.placeDivine(player, itemId, 90234, 90225, 20, 10);
			player.getPackets().sendGameMessage("You spawn a divine trout bubble.");
		} else if (itemId == 31083) {
			DivinePlacing.placeDivine(player, itemId, 90235, 90226, 30, 10);
			player.getPackets().sendGameMessage("You spawn a divine salmon bubble.");
		} else if (itemId == 31084) {
			DivinePlacing.placeDivine(player, itemId, 90236, 90227, 40, 10);
			player.getPackets().sendGameMessage("You spawn a divine lobster bubble.");
		} else if (itemId == 31085) {
			DivinePlacing.placeDivine(player, itemId, 90237, 90228, 50, 10);
			player.getPackets().sendGameMessage("You spawn a divine swordfish bubble.");
		} else if (itemId == 31086) {
			DivinePlacing.placeDivine(player, itemId, 90238, 90229, 76, 10);
			player.getPackets().sendGameMessage("You spawn a divine shark bubble.");
		} else if (itemId == 31087) {
			DivinePlacing.placeDivine(player, itemId, 90239, 90230, 85, 10);
			player.getPackets().sendGameMessage("You spawn a divine cavefish bubble.");
		} else if (itemId == 31088) {
			DivinePlacing.placeDivine(player, itemId, 90240, 90231, 90, 10);
			player.getPackets().sendGameMessage("You spawn a divine rocktail bubble.");
		}
		// div not being used
		else if (itemId == 31310) {
			DivinePlacing.placeDivine(player, itemId, 66526, 66528, 65, 1);
			player.getPackets().sendGameMessage("You spawn a divine simulacrum I.");
		} else if (itemId == 31311) {
			DivinePlacing.placeDivine(player, itemId, 66529, 66531, 65, 1);
			player.getPackets().sendGameMessage("You spawn a divine simulacrum II.");
		}

		if (itemId == 28600 || itemId == 28602 || itemId == 28604) {
			if (player.getInventory().containsItems(new Item[] { new Item(28600), new Item(28602), new Item(28604) })) { // checks inventory for 3 pieces
				player.getInventory().deleteItem(28600, 1);
				player.getInventory().deleteItem(28602, 1);
				player.getInventory().deleteItem(28604, 1);
				player.getInventory().addItem(28606, 1);
				player.getPackets().sendGameMessage("You create a Maul of Omens from your weapon pieces.");
			} else {
				player.getPackets().sendGameMessage("You require all 3 peices of the maul to create it."); // if you don't have 3 pieces
			}
		}

		if(itemId == 14098) {
			StealingCreationTool.randomTool(player);
		}

		if(itemId == 21776) {
			if(player.getInventory().containsItem(21776, 100)) {
				player.getInventory().deleteItem(21776, 100);
				player.getInventory().addItem(21775, 1);
				player.getPackets().sendGameMessage("You combine the Armadyl Shards and make an Orb of Armadyl...");
			} else {
				player.getPackets().sendGameMessage("You need 100 Armadyl Shards to make an Orb of Armadyl.");
			}
		}


		if (item.getId() == 6199) {
			int rand = Utils.random(1000);
			Item reward = null;
			if (rand <= 12) {
				reward = Settings.MYSTERY_BOX_RARE[Utils.random( Settings.MYSTERY_BOX_RARE.length)];
				World.sendWorldMessage("<img=6>[<col=ffffff><shad=ff0000>Voting</col></shad>] <col=ffffff><shad=ff0000>- " + player.getDisplayName() + " just got " + reward.getAmount() + " " + reward.getDefinitions().getName() + " from a mystery box!", false);
			} else if (rand <= 20 && !player.isADonator()) {
				player.setDonator(true);
				World.sendWorldMessage("[<img=6><col=ffffff><shad=09B01C>Voting</col></shad>] <col=ffffff><shad=09B01C>- " + player.getDisplayName() + " just got Regular Donator from the mystery box!", false);
				return;
			} else if (rand <= 450) {
				reward =  Settings.MYSTERY_BOX_MEDIUM[Utils.random( Settings.MYSTERY_BOX_MEDIUM.length)];
			} else {
				reward =  Settings.MYSTERY_BOX_COMMON[Utils.random( Settings.MYSTERY_BOX_COMMON.length)];
			}
			player.getInventory().deleteItem(6199, 1);
			player.getInventory().addItem(reward);
			return;
		}

		if (item.getDefinitions().containsOption(0, "Craft") || item.getDefinitions().containsOption(0, "Fletch")) {
			if(item.getId() == 28436) {
				if(!player.getInventory().containsItemToolBelt(946)) {
					player.getDialogueManager().startDialogue("ItemMessage", "You need a knife or chisle to complete the action.", 946);
					return;
				}
				player.getActionManager().setAction(new AscensionBoltMaking());
				return;
			}
			Fletch fletch = Fletching.isFletching(item, new Item(946));
			if(player.getInventory().containsItemToolBelt(946)) {
				if (fletch != null) {
					player.getDialogueManager().startDialogue("FletchingD", fletch);
					return;
				}
			}
			if (player.getInventory().containsItem(946, 1)) {
				if (fletch != null) {
					player.getDialogueManager().startDialogue("FletchingD", fletch);
					return;
				}
			} else if (player.getInventory().containsItem(1755, 1)) {
				if (fletch != null) {
					player.getDialogueManager().startDialogue("FletchingD", fletch);
					return;
				} else if(player.getToolbelt().containsItem(1755)) {
					player.getDialogueManager().startDialogue("FletchingD", fletch);
					return;
				}
			} else
				player.getDialogueManager().startDialogue("ItemMessage", "You need a knife or chisle to complete the action.", 946);
		}

		Pouches pouches = Pouches.forId(itemId);
		SummoningPouch pouch = SummoningPouch.get(itemId);
		if (pouches != null && pouch != null) {
			if (player.getSkills().getLevelForXp(Skills.SUMMONING) >= pouch
					.getLevelRequired())
				Summoning.spawnFamiliar(player, pouches);
			else
				player.sm("You need a summoning level of "
						+ pouch.getLevelRequired()
						+ " to summon this familiar.");
		}

		if(item.getId() == 4698) {
			if (player.getInventory().containsItem(233, 1) && player.getInventory().containsItem(4698, 15)) {
				if(player.getInventory().getFreeSlots() < 15) {
					player.getPackets().sendGameMessage("You do not have enough inventory space.");
					return;
				}
				player.sm("You crush down your mud runes.");
				player.getInventory().deleteItem(4698, 15);
				player.getInventory().addItemMoneyPouch(9594, 15);
			} else {
				player.sm("You need 15 mud runes to do this.");
			}
		}

		if (itemId == HunterEquipment.BOX.getId()) {// almost done
			player.getActionManager().setAction(
					new BoxAction(HunterEquipment.BOX));
		} else if (itemId == HunterEquipment.BRID_SNARE.getId()) {
			player.getActionManager().setAction(
					new BoxAction(HunterEquipment.BRID_SNARE));
		}

		if(item.getId() == 20936) {
			player.getDialogueManager().startDialogue("VoteReward");
		}
		if(itemId == 14106) {
			player.getDialogueManager().startDialogue("StealingCreationTool");
		}

		if (itemId == 15707) {
				player.getDungManager().openPartyInterface();
		}
		if (itemId == 7478) {
			player.getDialogueManager().startDialogue("KuradelPvmToken", 9085);
			return;
		}

		if (itemId == 6950) {
			player.getDialogueManager().startDialogue("LividOrb");
			return;
		}
		if (itemId == 20667) {
			Magic.useVecnaSkull(player);
			return;
		}
		if(itemId == PiratesTreasure.PIRATE_MESSAGE) {
			if(player.getQuestManager().get(Quests.PIRATES_TREASURE).getStage() > 7) {
				player.getQuestManager().get(Quests.PIRATES_TREASURE).setStage(9);
				Scroll.initalizeScroll(player);
			} else {
				player.output("Nothing interesting happens.");
			}
		}
		if (itemId == 15262) {
			int amountOnInv = player.getInventory().getNumerOf(15262);
			player.getInventory().addItem(12183, amountOnInv * 5000);
			player.getInventory().deleteItem(15262, amountOnInv);
		}

		if (itemId == 6) {//Cannon
				player.getDwarfCannon().cannonSetup();
		}
		if (itemId == 20498) {//Royal Cannon
			if (player.isAExtremeDonator()) {
				player.getDwarfCannon().cannonSetupRoyal();
			} else {
				player.sm("You must be an Extreme Donator to set up a Royal Cannon.");
			}
		}

		if (itemId == 4155) {
			player.getDialogueManager().startDialogue("EnchantedGemDialouge",
					player.getSlayerManager().getCurrentMaster().getNPCId());
		}

		if (itemId == 15084) {
			if (player.getInventory().containsItem(15084, 1))
				player.getInventory().deleteItem(15084, 1);
			player.getInventory().addItem(15098, 1);
		}
		/*if (itemId == 22370) {
			Summoning.openDreadnipInterface(player);
		}*/
		if (itemId == 952) {// spade
			dig(player);
			return;
		}
		if (itemId == 6950) {
			player.getDialogueManager().startDialogue("LividOrb");
		}
		else if (HerbCleaning.clean(player, item, slotId))
			return;
		else if (LividFarm.bunchPlants(player, itemId))
			return;
		else if (LightSource.lightSource(player, slotId))
			return;
		else if (LightSource.extinguishSource(player, slotId, false))
			return;
		else if (TrapAction.isTrap(player, new WorldTile(player), itemId))
			return;
		else if (itemId == 15262)
			ItemSets.openSkillPack(player, itemId, 12183, 5000, 1);
		else if (itemId == 15362)
			ItemSets.openSkillPack(player, itemId, 230, 50, 1);
		else if (itemId == 15363)
			ItemSets.openSkillPack(player, itemId, 228, 50, 1);
		else if (itemId == 15364)
			ItemSets.openSkillPack(player, itemId, 222, 50, 1);
		else if (itemId == 15365)
			ItemSets.openSkillPack(player, itemId, 9979, 50, 1);
		Bone bone = Bone.forId(itemId);
		if (bone != null) {
			Bone.bury(player, slotId);
			return;
		}
		if (Magic.useTabTeleport(player, itemId))
			return;
		if (itemId == AncientEffigies.SATED_ANCIENT_EFFIGY
				|| itemId == AncientEffigies.GORGED_ANCIENT_EFFIGY
				|| itemId == AncientEffigies.NOURISHED_ANCIENT_EFFIGY
				|| itemId == AncientEffigies.STARVED_ANCIENT_EFFIGY)
			player.getDialogueManager().startDialogue("AncientEffigiesD",
					itemId);
		else if (itemId == 23749) {
			player.getSkills().addXp(24, 75);
			player.getInventory().deleteItem(23749, 1);
		}
		if (itemId == 7509) {
			player.applyHit(new Hit(player, 10, HitLook.REGULAR_DAMAGE));
			player.setNextAnimation(new Animation(829));
			player.setNextForceTalk(new ForceTalk(
					"Ow! I nearly broke a tooth!"));
		}
		if (itemId == 5507) {
			player.getPackets().sendOpenURL("http://" + Configs.SERVER_NAME + ".org/community/index.php?/topic/456-firsts-beginners-guide/");
		}
		if (itemId == 24154) {
			player.getSquealOfFortune().setEarnedSpins(player.getSquealOfFortune().getEarnedSpins() + 1);
			player.refreshSqueal();
			player.sm("You have received spin on the Squeal of Fortune!");
			player.getInventory().deleteItem(24154, 1);
			player.refreshSqueal();
		}
		if (itemId == 24155) {
			player.getSquealOfFortune().setEarnedSpins(player.getSquealOfFortune().getEarnedSpins() + 2);
			player.refreshSqueal();
			player.sm("You have received double spins on the Squeal of Fortune!");
			player.getInventory().deleteItem(24155, 1);
			player.refreshSqueal();
		}
		if (itemId == 23750) {
			player.getSkills().addXp(24, 400);
			player.getInventory().deleteItem(23750, 1);
		}
		if (itemId == 23751) {
			player.getSkills().addXp(24, 1000);
			player.getInventory().deleteItem(23751, 1);
		}
		if (itemId == 23761) {
			player.getSkills().addXp(15, 3);
			player.getInventory().deleteItem(23761, 1);
		}
		if (itemId == 23752) {
			player.getSkills().addXp(24, 15000);
			player.getInventory().deleteItem(23752, 1);
		}
		if (itemId == 23778) {
			player.getSkills().addXp(18, 100);
			player.getInventory().deleteItem(23778, 1);
		}
		if (itemId == 23779) {
			player.getSkills().addXp(18, 500);
			player.getInventory().deleteItem(23779, 1);
		}
		if (itemId == 23780) {
			player.getSkills().addXp(18, 3000);
			player.getInventory().deleteItem(23780, 1);
		}
		if (itemId == 23781) {
			player.getSkills().addXp(18, 6500);
			player.getInventory().deleteItem(23781, 1);
		}
		if(ItemDefinitions.getItemDefinitions(itemId).getName().toLowerCase().contains("casket") ||
				itemId == 405) {
			final int[] reward = { 20000, 30000, 40000, 50000, 75000 };
			final int won = reward[Utils.random(reward.length)];
			player.getInventory().deleteItem(405, 1);
			player.getInventory().addItemMoneyPouch(new Item(995, won));
			player.sm("The casket slowly opens... You receive " + Utils.formatNumber(won) + " coins!");

		}
		if (itemId == 4155)
			player.getDialogueManager().startDialogue("EnchantedGemDialouge");
		if (itemId == 6099)
			player.getDialogueManager().startDialogue("DonorCrystal");
		else if (itemId >= 23653 && itemId <= 23658)
			FightKiln.useCrystal(player, itemId);
		else if (item.getDefinitions().getName().startsWith("Burnt")) 
			player.getDialogueManager().startDialogue("SimplePlayerMessage", "Ugh, this is inedible.");
	}


	/*
	 * returns the other
	 */
	public static Item contains(int id1, Item item1, Item item2) {
		if (item1.getId() == id1)
			return item2;
		if (item2.getId() == id1)
			return item1;
		return null;
	}

	public static boolean contains(int id1, int id2, Item... items) {
		boolean containsId1 = false;
		boolean containsId2 = false;
		for (Item item : items) {
			if (item.getId() == id1)
				containsId1 = true;
			else if (item.getId() == id2)
				containsId2 = true;
		}
		return containsId1 && containsId2;
	}

	public static void handleItemOnItem(final Player player, InputStream stream) {
		int usedWithId = stream.readInt();
		int toSlot = stream.readShortLE128();
		int hash1 = stream.readInt();
		int hash2 = stream.readInt();
		int interfaceId = hash1 >> 16;
		int interfaceId2 = hash2 >> 16;
		int comp1 = hash1 & 0xFFFF;
		int fromSlot = stream.readShort();
		int itemUsedId = stream.readInt();
		if (interfaceId == 192 && interfaceId2 == 679) {
			MagicOnItem.handleMagic(player, comp1, player.getInventory().getItem(toSlot));
			return;
		}
		if ((interfaceId == 747 || interfaceId == 662)
				&& interfaceId2 == Inventory.INVENTORY_INTERFACE) {
			if (player.getFamiliar() != null) {
				player.getFamiliar().setSpecial(true);
				if (player.getFamiliar().getSpecialAttack() == SpecialAttack.ITEM) {
					if (player.getFamiliar().hasSpecialOn())
						player.getFamiliar().submitSpecial(toSlot);
				}
			}
			return;
		}
		Sets set = ArmourSets.getArmourSet(itemUsedId, fromSlot);
		if (set != null) {
			ArmourSets.exchangeSets(player, set);
			return;
		}
		if (interfaceId == Inventory.INVENTORY_INTERFACE
				&& interfaceId == interfaceId2
				&& !player.getInterfaceManager().containsInventoryInter()) {
			if (toSlot >= 28 || fromSlot >= 28)
				return;
			Item usedOn = player.getInventory().getItem(toSlot);
			Item itemUsed = player.getInventory().getItem(fromSlot);
			if (itemUsed == null || usedOn == null || itemUsed.getId() != itemUsedId || usedOn.getId() != usedWithId)
				return;
			player.stopAll();
			if (!player.getControlerManager().canUseItemOnItem(itemUsed,
					usedOn))
				return;
			else if (Firemaking.isFiremaking(player, itemUsed, usedOn))
				return;
			else if (OrnamentKits.attachKit(player, itemUsed, usedOn, fromSlot, toSlot))
				return;
			else if (TreeSaplings.hasSaplingRequest(player, itemUsedId, usedWithId)) {
				if (itemUsedId == 5354)
					TreeSaplings.plantSeed(player, usedWithId, fromSlot);
				else
					TreeSaplings.plantSeed(player, itemUsedId, toSlot);
			} else if (Drinkables.mixPot(player, itemUsed, usedOn, fromSlot, toSlot, true) != -1)
				return;
			else if (WeaponPoison.poison(player, itemUsed, usedOn, false))
				return;
			Fletch fletch = Fletching.isFletching(usedOn, itemUsed);
			if (fletch != null) {
				player.getDialogueManager().startDialogue("FletchingD", fletch);
				return;
			}
			int herblore = Herblore.isHerbloreSkill(itemUsed, usedOn);
			if (herblore > -1) {
				player.getDialogueManager().startDialogue("HerbloreD",
						herblore, itemUsed, usedOn);
				return;
			}
			if(itemUsed.getId() == 28436 && itemUsedId == 25917) {
				player.getActionManager().setAction(new AscensionCrossbowMaking());
				return;
			}
			if(itemUsed.getId() == 30372) {
				int notedItem = usedOn.getId() + 1;
				ItemDefinitions defs = new ItemDefinitions(notedItem);
				if(defs.isNoted()) {
					player.getInventory().deleteItem(30372, 1);
					player.getInventory().deleteItem(usedOn.getId(), 1);
					player.getInventory().addItem(notedItem);
				} else {
					player.getPackets().sendGameMessage("You cannot use magic note paper on this item.");
				}
			}
			/*if(itemUsed.getId() == 1391 || usedWith.getId() == 21775) {
				player.getInventory().deleteItem(21775, 1);
				player.getInventory().addItem(21777, 1);
				player.getPackets().sendGameMessage("You combine the Orb of Armadyl with the Battlestaff and create an Armadyl Battlestaff.");
			}*/
			// Roe
			if (itemUsed.getId() == 946 || usedOn.getId() == 11328) {
				if (player.getInventory().containsItem(946, 1) && player.getInventory().containsItem(11328, 1)) {

					player.getInventory().deleteItem(11328, 1);
					player.getInventory().addItemMoneyPouch(11324, 1);
				}
			}
			if (itemUsed.getId() == 11328 || usedOn.getId() == 946) {
				if (player.getInventory().containsItem(946, 1) && player.getInventory().containsItem(11328, 1)) {

					player.getInventory().deleteItem(11328, 1);
					player.getInventory().addItemMoneyPouch(11324, 1);
				}
			}

			if (itemUsed.getId() == 946 || usedOn.getId() == 11330) {
				if (player.getInventory().containsItem(946, 1) && player.getInventory().containsItem(11330, 1)) {

					player.getInventory().deleteItem(11330, 1);
					player.getInventory().addItemMoneyPouch(11324, 1);
				}
			}
			if (itemUsed.getId() == 11330 || usedOn.getId() == 946) {
				if (player.getInventory().containsItem(946, 1) && player.getInventory().containsItem(11330, 1)) {

					player.getInventory().deleteItem(11330, 1);
					player.getInventory().addItemMoneyPouch(11324, 1);
				}
			}
			if (contains(272, 273, itemUsed, usedOn) || (contains(273, 272, itemUsed, usedOn))) {
				player.getInventory().deleteItem(272, 1);
				player.getInventory().deleteItem(273, 1);
				player.getInventory().addItemMoneyPouch(274, 1);
			}
			Lighters  lighters = FireLighter.getColoredLog(itemUsedId, fromSlot);
			if (lighters != null) {
				FireLighter.handleLighter(player, lighters);
				return;
			}
			int leatherIndex = LeatherCraftingD.getIndex(itemUsedId) == -1 ? LeatherCraftingD.getIndex(usedOn.getId()) : LeatherCraftingD.getIndex(itemUsedId);
			if (leatherIndex != -1 && ((itemUsedId == 1733 || usedOn.getId() == 1733) || LeatherCraftingD.isExtraItem(usedOn.getId()) || LeatherCraftingD.isExtraItem(itemUsedId))) {
				player.getDialogueManager().startDialogue("LeatherCraftingD", leatherIndex);
				return;
			}
			// Ganodermic robes
			if (itemUsed.getId() == 22451 && usedOn.getId() == 22452) {// Visor
				player.getDialogueManager().startDialogue("PolyVisor");
			}
			if (itemUsed.getId() == 22451 && usedOn.getId() == 22454) {// Leggings
				player.getDialogueManager().startDialogue("PolyLeggings");
			}
			if (itemUsed.getId() == 22451 && usedOn.getId() == 22456) {// poncho
				player.getDialogueManager().startDialogue("PolyPoncho");
			}
			// Grifolic Robes
			if (itemUsed.getId() == 22450 && usedOn.getId() == 22452) {// Visor
				player.getDialogueManager().startDialogue("PolyVisor");
			}
			if (itemUsed.getId() == 22450 && usedOn.getId() == 22454) {// Leggings
				player.getDialogueManager().startDialogue("PolyLeggings");
			}
			if (itemUsed.getId() == 22450 && usedOn.getId() == 22456) {// poncho
				player.getDialogueManager().startDialogue("PolyPoncho");
			}
			// Fungal Robes
			if (itemUsed.getId() == 22449 && usedOn.getId() == 22452) {// Visor
				player.getDialogueManager().startDialogue("PolyVisor");
			}
			if (itemUsed.getId() == 22449 && usedOn.getId() == 22454) {// Leggings
				player.getDialogueManager().startDialogue("PolyLeggings");
			}
			if (itemUsed.getId() == 22449 && usedOn.getId() == 22456) {// poncho
				player.getDialogueManager().startDialogue("PolyPoncho");
			}
			if ((itemUsed.getId() == 4698 && usedOn.getId() == 233) || (itemUsed.getId() == 233 && usedOn.getId() == 4698)) {
				if (player.getInventory().containsItem(233, 1) && player.getInventory().containsItem(4698, 15)) {
					if(player.getInventory().getFreeSlots() < 15) {
						player.getPackets().sendGameMessage("You do not have enough inventory space.");
						return;
					}
					player.sm("You crush down your mud runes.");
					player.getInventory().deleteItem(4698, 15);
					player.getInventory().addItemMoneyPouch(9594, 15);
				} else {
					player.sm("You need 15 mud runes to do this.");
				}
			}
			if (Firemaking.isFiremaking(player, itemUsed, usedOn))
				return;
			//Shadows
			if (itemUsed.getId() == 29915 || usedOn.getId() == 29970) {
				if (player.getInventory().containsItem(29915, 1)
						&& player.getInventory().containsItem(29970, 1)) {
					player.getInventory().deleteItem(29915, 1);
					player.getInventory().deleteItem(29970, 1);
					player.getInventory().addItem(29913, 1);
					player.getPackets().sendGameMessage("You use the dye on the " + usedOn.getName() + ".");
					return;
				}
			}
			if (itemUsed.getId() == 29915 || usedOn.getId() == 29969) {
				if (player.getInventory().containsItem(29915, 1)
						&& player.getInventory().containsItem(29969, 1)) {
					player.getInventory().deleteItem(29915, 1);
					player.getInventory().deleteItem(29969, 1);
					player.getInventory().addItem(29912, 1);
					player.getPackets().sendGameMessage("You use the dye on the " + usedOn.getName() + ".");
					return;
				}
			}
			if (itemUsed.getId() == 29915 || usedOn.getId() == 29994) {
				if (player.getInventory().containsItem(29915, 1)
						&& player.getInventory().containsItem(29994, 1)) {
					player.getInventory().deleteItem(29915, 1);
					player.getInventory().deleteItem(29994, 1);
					player.getInventory().addItem(29911, 1);
					player.getPackets().sendGameMessage("You use the dye on the " + usedOn.getName() + ".");
					return;
				}
			}
			if (itemUsed.getId() == 29915 || usedOn.getId() == 29995) {
				if (player.getInventory().containsItem(29915, 1)
						&& player.getInventory().containsItem(29995, 1)) {
					player.getInventory().deleteItem(29915, 1);
					player.getInventory().deleteItem(29995, 1);
					player.getInventory().addItem(29909, 1);
					player.getPackets().sendGameMessage("You use the dye on the " + usedOn.getName() + ".");
					return;
				}
			}
			if (itemUsed.getId() == 29915 || usedOn.getId() == 29993) {
				if (player.getInventory().containsItem(29915, 1)
						&& player.getInventory().containsItem(29993, 1)) {
					player.getInventory().deleteItem(29915, 1);
					player.getInventory().deleteItem(29993, 1);
					player.getInventory().addItem(29910, 1);
					player.getPackets().sendGameMessage("You use the dye on the " + usedOn.getName() + ".");
					return;
				}
			}
			if (itemUsed.getId() == 29915 || usedOn.getId() == 29929) {
				if (player.getInventory().containsItem(29915, 1)
						&& player.getInventory().containsItem(29929, 1)) {
					player.getInventory().deleteItem(29915, 1);
					player.getInventory().deleteItem(29929, 1);
					player.getInventory().addItem(29905, 1);
					player.getPackets().sendGameMessage("You use the dye on the " + usedOn.getName() + ".");
					return;
				}
			}
			if (itemUsed.getId() == 29915 || usedOn.getId() == 29930) {
				if (player.getInventory().containsItem(29915, 1)
						&& player.getInventory().containsItem(29930, 1)) {
					player.getInventory().deleteItem(29915, 1);
					player.getInventory().deleteItem(29930, 1);
					player.getInventory().addItem(29906, 1);
					player.getPackets().sendGameMessage("You use the dye on the " + usedOn.getName() + ".");
					return;
				}
			}
			if (itemUsed.getId() == 29915 || usedOn.getId() == 29931) {
				if (player.getInventory().containsItem(29915, 1)
						&& player.getInventory().containsItem(29931, 1)) {
					player.getInventory().deleteItem(29915, 1);
					player.getInventory().deleteItem(29931, 1);
					player.getInventory().addItem(29907, 1);
					player.getPackets().sendGameMessage("You use the dye on the " + usedOn.getName() + ".");
					return;
				}
			}
			if (itemUsed.getId() == 29915 || usedOn.getId() == 20171) {
				if (player.getInventory().containsItem(29915, 1)
						&& player.getInventory().containsItem(20171, 1)) {
					player.getInventory().deleteItem(29915, 1);
					player.getInventory().deleteItem(20171, 1);
					player.getInventory().addItem(29904, 1);
					player.getPackets().sendGameMessage("You use the dye on the " + usedOn.getName() + ".");
					return;
				}
			}
			//End Shadows
			if (itemUsed.getId() == 19333 || usedOn.getId() == 6585) {
				if (player.getInventory().containsItem(6585, 1)
						&& player.getInventory().containsItem(19333, 1)) {
					player.getInventory().deleteItem(6585, 1);
					player.getInventory().deleteItem(19333, 1);
					player.getInventory().addItem(19335, 1);
					player.getPackets().sendGameMessage("You decorate the amulet.");
				}
			}
			if (itemUsed.getId() == 18351 || usedOn.getId() == 4671) {
				if (player.getInventory().containsItem(4671, 1)
						&& player.getInventory().containsItem(18351, 1)) {
					player.getInventory().deleteItem(4671, 1);
					player.getInventory().deleteItem(18351, 1);
					player.getInventory().addItem(29949, 1);
					player.getPackets().sendGameMessage("You infuse the ice diamond with the longsword and create a Frostmourne longsword.");
				}
			}
			if (itemUsed.getId() == 4671 || usedOn.getId() == 18351) {
				if (player.getInventory().containsItem(4671, 1)
						&& player.getInventory().containsItem(18351, 1)) {
					player.getInventory().deleteItem(4671, 1);
					player.getInventory().deleteItem(18351, 1);
					player.getInventory().addItem(29949, 1);
					player.getPackets().sendGameMessage("You infuse the ice diamond with the longsword and create a Frostmourne longsword.");
				}
			}
			if (itemUsed.getId() == 13736 || usedOn.getId() == 29948) {
				if (player.getInventory().containsItem(13736, 1)
						&& player.getInventory().containsItem(29948, 1)) {
					player.getInventory().deleteItem(13736, 1);
					player.getInventory().deleteItem(29948, 1);
					player.getInventory().addItem(29950, 1);
					player.getPackets().sendGameMessage("You put the shield and sigil together, crafting a shield of mortality.");
				}
			}
			if (itemUsed.getId() == 29948 || usedOn.getId() == 13736) {
				if (player.getInventory().containsItem(29948, 1)
						&& player.getInventory().containsItem(13736, 1)) {
					player.getInventory().deleteItem(13736, 1);
					player.getInventory().deleteItem(29948, 1);
					player.getInventory().addItem(29950, 1);
					player.getPackets().sendGameMessage("You put the shield and sigil together, crafting a shield of mortality.");
				}
			}
			if (itemUsed.getId() == 6585 || usedOn.getId() == 19333) {
				if (player.getInventory().containsItem(6585, 1)
						&& player.getInventory().containsItem(19333, 1)) {
					player.getInventory().deleteItem(6585, 1);
					player.getInventory().deleteItem(19333, 1);
					player.getInventory().addItem(19335, 1);
					player.getPackets().sendGameMessage("You decorate the amulet.");
				}
			}
			if (itemUsed.getId() == 1615 || usedOn.getId() == 1755) { //dstone
				if (player.getInventory().containsItem(1755, 1)
						&& player.getInventory().containsItem(1615, 1)) {
					player.getInventory().deleteItem(1615, 1);
					//player.getInventory().deleteItem(19333, 1);
					player.getInventory().addItem(9193, 15);
					player.getPackets().sendGameMessage("You cut the dragonstone into bolt tips.");
				}
			}
			if (itemUsed.getId() == 1755 || usedOn.getId() == 1615) { //dstone
				if (player.getInventory().containsItem(1755, 1)
						&& player.getInventory().containsItem(1615, 1)) {
					player.getInventory().deleteItem(1615, 1);
					//player.getInventory().deleteItem(19333, 1);
					player.getInventory().addItem(9193, 15);
					player.getPackets().sendGameMessage("You cut the dragonstone into bolt tips.");
				}
			}
			if (itemUsed.getId() == 1601 || usedOn.getId() == 1755) { //diamond
				if (player.getInventory().containsItem(1755, 1)
						&& player.getInventory().containsItem(1601, 1)) {
					player.getInventory().deleteItem(1601, 1);
					//player.getInventory().deleteItem(19333, 1);
					player.getInventory().addItem(9192, 15);
					player.getPackets().sendGameMessage("You cut the diamond into bolt tips.");
				}
			}
			if (itemUsed.getId() == 1755 || usedOn.getId() == 1601) { //diamond
				if (player.getInventory().containsItem(1755, 1)
						&& player.getInventory().containsItem(1601, 1)) {
					player.getInventory().deleteItem(1601, 1);
					//player.getInventory().deleteItem(19333, 1);
					player.getInventory().addItem(9192, 15);
					player.getPackets().sendGameMessage("You cut the diamond into bolt tips.");
				}
			}
			if (itemUsed.getId() == 1603 || usedOn.getId() == 1755) { //ruby
				if (player.getInventory().containsItem(1755, 1)
						&& player.getInventory().containsItem(1603, 1)) {
					player.getInventory().deleteItem(1603, 1);
					//player.getInventory().deleteItem(19333, 1);
					player.getInventory().addItem(9191, 15);
					player.getPackets().sendGameMessage("You cut the ruby into bolt tips.");
				}
			}
			if (itemUsed.getId() == 1755 || usedOn.getId() == 1603) { //ruby
				if (player.getInventory().containsItem(1755, 1)
						&& player.getInventory().containsItem(1603, 1)) {
					player.getInventory().deleteItem(1603, 1);
					//player.getInventory().deleteItem(19333, 1);
					player.getInventory().addItem(9191, 15);
					player.getPackets().sendGameMessage("You cut the ruby into bolt tips.");
				}
			}
			if (itemUsed.getId() == 9193 || usedOn.getId() == 9144) { //dstone
				if (player.getInventory().containsItem(9193, 1)
						&& player.getInventory().containsItem(9144, 1)) {
					player.getInventory().deleteItem(9144, 15);
					player.getInventory().deleteItem(9193, 15);
					player.getInventory().addItem(9244, 15);
					//player.getPackets().sendGameMessage("You cut the dragonstone into bolt tips.");
				}
			}
			if (itemUsed.getId() == 9144 || usedOn.getId() == 9193) { //dstone
				if (player.getInventory().containsItem(9193, 1)
						&& player.getInventory().containsItem(9144, 1)) {
					player.getInventory().deleteItem(9144, 15);
					player.getInventory().deleteItem(9193, 15);
					player.getInventory().addItem(9244, 15);
					//player.getPackets().sendGameMessage("You cut the dragonstone into bolt tips.");
				}
			}
			if (itemUsed.getId() == 9191 || usedOn.getId() == 9143) { //ruby
				if (player.getInventory().containsItem(9191, 1)
						&& player.getInventory().containsItem(9143, 1)) {
					player.getInventory().deleteItem(9191, 15);
					player.getInventory().deleteItem(9143, 15);
					player.getInventory().addItem(9242, 15);
					//player.getPackets().sendGameMessage("You cut the dragonstone into bolt tips.");
				}
			}
			if (itemUsed.getId() == 9143 || usedOn.getId() == 9191) { //ruby
				if (player.getInventory().containsItem(9193, 1)
						&& player.getInventory().containsItem(9144, 1)) {
					player.getInventory().deleteItem(9191, 15);
					player.getInventory().deleteItem(9143, 15);
					player.getInventory().addItem(9242, 15);
					//player.getPackets().sendGameMessage("You cut the dragonstone into bolt tips.");
				}
			}
			if (itemUsed.getId() == 9192 || usedOn.getId() == 9143) { //dstone
				if (player.getInventory().containsItem(9143, 1)
						&& player.getInventory().containsItem(9192, 1)) {
					player.getInventory().deleteItem(9143, 15);
					player.getInventory().deleteItem(9192, 15);
					player.getInventory().addItem(9243, 15);
					//player.getPackets().sendGameMessage("You cut the dragonstone into bolt tips.");
				}
			}
			if (itemUsed.getId() == 9143 || usedOn.getId() == 9192) { //diamond
				if (player.getInventory().containsItem(9143, 1)
						&& player.getInventory().containsItem(9192, 1)) {
					player.getInventory().deleteItem(9143, 15);
					player.getInventory().deleteItem(9192, 15);
					player.getInventory().addItem(9243, 15);
					//player.getPackets().sendGameMessage("You cut the dragonstone into bolt tips.");
				}
			}
			if (itemUsed.getId() == 6573 || usedOn.getId() == 1755) {
				if (player.getInventory().containsItem(6573, 1)
						&& player.getInventory().containsItem(1755, 1)) {
					player.getInventory().deleteItem(6573, 1);
					player.getInventory().addItem(6585, 1);
					player.getPackets().sendGameMessage("You craft an amulet of fury.");
				}
			}
			if (itemUsed.getId() == 1755 || usedOn.getId() == 6573) {
				if (player.getInventory().containsItem(6573, 1)
						&& player.getInventory().containsItem(1755, 1)) {
					player.getInventory().deleteItem(6573, 1);
					player.getInventory().addItem(6585, 1);
					player.getPackets().sendGameMessage("You craft an amulet of fury.");
				}
			}
			if (itemUsed.getId() == 29963 || usedOn.getId() == 29964 || usedOn.getId() == 29965 || usedOn.getId() == 29966) {
				if (player.getInventory().containsItem(29963, 1)
						&& player.getInventory().containsItem(29964, 1)
						&& player.getInventory().containsItem(29965, 1)
						&& player.getInventory().containsItem(29966, 1)) {
					player.getInventory().deleteItem(29963, 1);
					player.getInventory().deleteItem(29964, 1);
					player.getInventory().deleteItem(29965, 1);
					player.getInventory().deleteItem(29966, 1);
					player.getSkills().addXp(9, 5000);
					player.getInventory().addItem(29962, 1);
					player.getPackets().sendGameMessage("You made a godsword blade.");
					World.sendWorldMessage("<img=7><col=FF9900>News: " +Utils.formatPlayerNameForDisplay(player.getDisplayName()) + " has just crafted themselves an Ascension Crossbow!", false);
				}
			}
			if (itemUsed.getId() == 11710 || usedOn.getId() == 11712 || usedOn.getId() == 11714) {
				if (player.getInventory().containsItem(11710, 1)
						&& player.getInventory().containsItem(11712, 1)
						&& player.getInventory().containsItem(11714, 1)) {
					player.getInventory().deleteItem(11710, 1);
					player.getInventory().deleteItem(11712, 1);
					player.getInventory().deleteItem(11714, 1);
					player.getInventory().addItem(11690, 1);
					player.getPackets().sendGameMessage("You made a godsword blade.");
				}
			}
			if (itemUsed.getId() == 11690 || usedOn.getId() == 11702) {
				if (player.getInventory().containsItem(11690, 1)
						&& player.getInventory().containsItem(11702, 1)) {
					player.getInventory().deleteItem(11690, 1);
					player.getInventory().deleteItem(11702, 1);
					player.getInventory().addItem(11694, 1);
					player.getPackets().sendGameMessage("You attach the hilt to the blade and make an Armadyl godsword.");
				}
			}
			if (itemUsed.getId() == 11690 || usedOn.getId() == 11704) {
				if (player.getInventory().containsItem(11690, 1)
						&& player.getInventory().containsItem(11704, 1)) {
					player.getInventory().deleteItem(11690, 1);
					player.getInventory().deleteItem(11704, 1);
					player.getInventory().addItem(11696, 1);
					player.getPackets().sendGameMessage("You attach the hilt to the blade and make an Bandos godsword.");
				}
			}
			if (itemUsed.getId() == 11690 || usedOn.getId() == 11706) {
				if (player.getInventory().containsItem(11690, 1)
						&& player.getInventory().containsItem(11706, 1)) {
					player.getInventory().deleteItem(11690, 1);
					player.getInventory().deleteItem(11706, 1);
					player.getInventory().addItem(11698, 1);
					player.getPackets().sendGameMessage("You attach the hilt to the blade and make an Saradomin godsword.");
				}
			}
			if (itemUsed.getId() == 11690 || usedOn.getId() == 11708) {
				if (player.getInventory().containsItem(11690, 1)
						&& player.getInventory().containsItem(11708, 1)) {
					player.getInventory().deleteItem(11690, 1);
					player.getInventory().deleteItem(11708, 1);
					player.getInventory().addItem(11700, 1);
					player.getPackets().sendGameMessage("You attach the hilt to the blade and make an Zamorak godsword.");
				}
			}
			else if (itemUsed.getId() == 13734 && usedOn.getId() == 13754){
				player.getInventory().deleteItem(13734, 1);
				player.getInventory().deleteItem(13754, 1);
				player.getInventory().addItem(13736, 1);
				player.getPackets().sendGameMessage("You have poured the holy elixir on a spirit shield making it unleash Blessed powers.");
			}
			else if (itemUsed.getId() == 13754 && usedOn.getId() == 13734){
				player.getInventory().deleteItem(13734, 1);
				player.getInventory().deleteItem(13754, 1);
				player.getInventory().addItem(13736, 1);
				player.getPackets().sendGameMessage("You have poured the holy elixir on a spirit shield making it unleash Blessed powers.");
			}
			else if (itemUsed.getId() == 13736 && usedOn.getId() == 13748){
				player.getInventory().deleteItem(13736, 1);
				player.getInventory().deleteItem(13748, 1);
				player.getInventory().addItem(13740, 1);
				player.getPackets().sendGameMessage("You force the sigil upon the blessed spirit shield making it unleash Divine Powers.");
			}
			else if (itemUsed.getId() == 13736 && usedOn.getId() == 13750){
				player.getInventory().deleteItem(13736, 1);
				player.getInventory().deleteItem(13750, 1);
				player.getInventory().addItem(13742, 1);
				player.getPackets().sendGameMessage("You force the sigil upon the blessed spirit shield making it unleash Elysian Powers.");
			}
			else if (itemUsed.getId() == 13736 && usedOn.getId() == 13746){
				player.getInventory().deleteItem(13736, 1);
				player.getInventory().deleteItem(13746, 1);
				player.getInventory().addItem(13738, 1);
				player.getPackets().sendGameMessage("You force the sigil upon the blessed spirit shield making it unleash Arcane Powers.");
			}
			else if (itemUsed.getId() == 13746 && usedOn.getId() == 13736){
				player.getInventory().deleteItem(13736, 1);
				player.getInventory().deleteItem(13746, 1);
				player.getInventory().addItem(13738, 1);
				player.getPackets().sendGameMessage("You force the sigil upon the blessed spirit shield making it unleash Arcane Powers.");
			}
			else if (itemUsed.getId() == 13736 && usedOn.getId() == 13752){
				player.getInventory().deleteItem(13736, 1);
				player.getInventory().deleteItem(13752, 1);
				player.getInventory().addItem(13744, 1);
				player.getPackets().sendGameMessage("You force the sigil upon the blessed spirit shield making it unleash Spectral Powers.");
			}
			else if (itemUsed.getId() == 13752 && usedOn.getId() == 13736){
				player.getInventory().deleteItem(13736, 1);
				player.getInventory().deleteItem(13752, 1);
				player.getInventory().addItem(13744, 1);
				player.getPackets().sendGameMessage("You force the sigil upon the blessed spirit shield making it unleash Spectral Powers.");
			}
			else if (itemUsed.getId() == 21369 && usedOn.getId() == 4151){
				player.getInventory().deleteItem(21369, 1);
				player.getInventory().deleteItem(4151, 1);
				player.getInventory().addItem(21371, 1);
				player.getPackets().sendGameMessage("You attach the vine, the weapon seems more powerful than before.");
			}
			else if (itemUsed.getId() == 1540 && usedOn.getId() == 11286){
				player.getInventory().deleteItem(11286, 1);
				player.getInventory().deleteItem(1540, 1);
				player.getInventory().addItem(11283, 1);
				player.getPackets().sendGameMessage("You attach the visage to the shield.");
			}
			else if (itemUsed.getId() == 11286 && usedOn.getId() == 1540){
				player.getInventory().deleteItem(11286, 1);
				player.getInventory().deleteItem(1540, 1);
				player.getInventory().addItem(11283, 1);
				player.getPackets().sendGameMessage("You attach the visage to the shield.");
			}
			if (itemUsed.getId() == CrystalChest.toothHalf()
					&& usedOn.getId() == CrystalChest.loopHalf() 
					|| itemUsed.getId() == CrystalChest.loopHalf()
					&& usedOn.getId() == CrystalChest.toothHalf()){
				CrystalChest.makeKey(player);
				return;
			}
			else if (contains(1755, Gem.OPAL.getUncut(), itemUsed, usedOn))
				GemCutting.cut(player, Gem.OPAL);
			else if (contains(1755, Gem.JADE.getUncut(), itemUsed, usedOn))
				GemCutting.cut(player, Gem.JADE);
			else if (contains(1755, Gem.RED_TOPAZ.getUncut(), itemUsed,
					usedOn))
				GemCutting.cut(player, Gem.RED_TOPAZ);
			else if (contains(1755, Gem.SAPPHIRE.getUncut(), itemUsed, usedOn))
				GemCutting.cut(player, Gem.SAPPHIRE);
			else if (contains(1755, Gem.EMERALD.getUncut(), itemUsed, usedOn))
				GemCutting.cut(player, Gem.EMERALD);
			else if (contains(1755, Gem.RUBY.getUncut(), itemUsed, usedOn))
				GemCutting.cut(player, Gem.RUBY);
			else if (contains(1755, Gem.DIAMOND.getUncut(), itemUsed, usedOn))
				GemCutting.cut(player, Gem.DIAMOND);
			else if (contains(1755, Gem.DRAGONSTONE.getUncut(), itemUsed,
					usedOn))
				GemCutting.cut(player, Gem.DRAGONSTONE);
			else if (contains(1755, Gem.ONYX.getUncut(), itemUsed, usedOn))
				GemCutting.cut(player, Gem.ONYX);

			// Bolt Tip Making
			else if (contains(1755, BoltTips.OPAL.getGemName(), itemUsed, usedOn))
				BoltTipFletching.boltFletch(player, BoltTips.OPAL);
			else if (contains(1755, BoltTips.JADE.getGemName(), itemUsed, usedOn))
				BoltTipFletching.boltFletch(player, BoltTips.JADE);
			else if (contains(1755, BoltTips.RED_TOPAZ.getGemName(), itemUsed, usedOn))
				BoltTipFletching.boltFletch(player, BoltTips.RED_TOPAZ);
			else if (contains(1755, BoltTips.SAPPHIRE.getGemName(), itemUsed, usedOn))
				BoltTipFletching.boltFletch(player, BoltTips.SAPPHIRE);
			else if (contains(1755, BoltTips.EMERALD.getGemName(), itemUsed, usedOn))
				BoltTipFletching.boltFletch(player, BoltTips.EMERALD);
			else if (contains(1755, BoltTips.RUBY.getGemName(), itemUsed, usedOn))
				BoltTipFletching.boltFletch(player, BoltTips.RUBY);
			else if (contains(1755, BoltTips.DIAMOND.getGemName(), itemUsed, usedOn))
				BoltTipFletching.boltFletch(player, BoltTips.DIAMOND);
			else if (contains(1755, BoltTips.DRAGONSTONE.getGemName(), itemUsed, usedOn))
				BoltTipFletching.boltFletch(player, BoltTips.DRAGONSTONE);
			else if (contains(1755, BoltTips.ONYX.getGemName(), itemUsed, usedOn))
				BoltTipFletching.boltFletch(player, BoltTips.ONYX);

			if (Settings.DEBUG)
				Logger.log("ItemHandler", "Used:" + itemUsed.getId()
				+ ", With:" + usedOn.getId());
		}
	}

	public static void handleItemOption3(final Player player, int slotId, int itemId,
			final Item item) {
		long time = Utils.currentTimeMillis();
		if (player.getLockDelay() >= time
				|| player.getEmotesManager().getNextEmoteEnd() >= time)
			return;
		if (item.getDefinitions().isBindItem())
			player.getDungManager().bind(item, slotId);
		if (item.getId() == 15707) {
			Magic.daemonheimTeleport(player, new WorldTile(3449, 3698));
			return;
		}
		if (itemId == 28606) {// Finish him!
			if (VoragoHandler.vorago.pushBackDamage <= VoragoHandler.vorago.startPushBack / 10) {
				if (Utils.isOnRange(VoragoHandler.vorago, player, 1)) {
					final Vorago n = VoragoHandler.vorago;
					n.setCantInteract(true);
					WorldTasksManager.schedule(new WorldTask() {
						int count = 0;

						@Override
						public void run() {

							if (count == 1) {
								n.getCombat().removeTarget();
								n.canDie = true;
							}
							if (count == 2) {
								player.faceEntity(n);
							}
							if (count == 3) {
								player.setNextAnimation(new Animation(20387));
								n.sendDeath(player);
								player.getInventory().removeItems(item);
							}
							count++;
						}
					}, 0, 0);
				} else {
					player.getPackets().sendGameMessage("You need to be closer to Vorago");// TODO find act message
				}
			} else {
				player.getPackets().sendGameMessage("Vorago isn't in the right place");// TODO find act message
			}
		}
		player.stopAll(false);
		if (itemId == 20767 || itemId == 20769 || itemId == 20771)
			SkillCapeCustomizer.startCustomizing(player, itemId);
		else if (ImplingLoot.isJar(itemId))
			ImplingLoot.HandleItem(player, itemId);
		else if(itemId >= 15084 && itemId <= 15100)
			player.getDialogueManager().startDialogue("DiceBag", itemId);
		else if(itemId == 24437 || itemId == 24439 || itemId == 24440 || itemId == 24441) 
			player.getDialogueManager().startDialogue("FlamingSkull", item, slotId);
		else if (Equipment.getItemSlot(itemId) == Equipment.SLOT_AURA)
			player.getAuraManager().sendTimeRemaining(itemId);
		else if (itemId == 15398)
			player.getDialogueManager().startDialogue("Transportation",
					"Kuradal", new WorldTile(1741, 5312, 1), "Slayer Tower",
					new WorldTile(3428, 3526, 0));
		else if (itemId == 22444)
			player.getCharges().checkCharges("There is " + ChargesManager.REPLACE + " doses of neem oil remaining.",
					itemId);
		else if ((itemId >= 24450 && itemId <= 24454) || (itemId >= 22358 && itemId <= 22369))
			player.getCharges().checkPercentage("The gloves are " + ChargesManager.REPLACE + "% degraded.", itemId,
					true);
		else if (itemId >= 22458 && itemId <= 22497)
			player.getCharges().checkPercentage(item.getName() + ": " + ChargesManager.REPLACE + "% remaining.", itemId,
					false);
		else if (itemId == 20135 || itemId == 20137 || itemId == 20141 || itemId == 20145 || itemId == 20149
				|| itemId == 20151 || itemId == 20153 || itemId == 20157 || itemId == 20161 || itemId == 20165
				|| itemId == 20169)
			player.getCharges().checkPercentage(item.getName() + ": " + ChargesManager.REPLACE + "% remaining.", itemId,
					false);
		else if (itemId == 20171 || itemId == 20173)
			player.getCharges().checkPercentage(
					item.getName() + ": has " + player.getCharges().getCharges(item.getId()) + " shots left.", itemId,
					false);
	}

	public static void handleItemOption4(Player player, int slotId, int itemId,
			Item item) {
	}

	public static void handleItemOption5(Player player, int slotId, int itemId,
			Item item) {
	}

	public static void handleItemOption6(Player player, int slotId, int itemId,
			Item item) {
		long time = Utils.currentTimeMillis();
		if (player.getLockDelay() >= time
				|| player.getEmotesManager().getNextEmoteEnd() >= time)
			return;
		if (player.getToolbelt().addItem(slotId, item))
			return;
		if (item.getDefinitions().isBindItem())
			player.getDungManager().bind(item, slotId);
		player.stopAll(false);
		Pouches pouches = Pouches.forId(itemId);
		SummoningPouch pouch = SummoningPouch.get(itemId);
		if (pouches != null && pouch != null) {
			if (player.getSkills().getLevelForXp(Skills.SUMMONING) >= pouch
					.getLevelRequired())
				Summoning.spawnFamiliar(player, pouches);
			else
				player.sm("You need a summoning level of "
						+ pouch.getLevelRequired()
						+ " to summon this familiar.");
		}
		if (itemId == 995 && !(player.getControlerManager().getControler() instanceof Wilderness))
			player.getMoneyPouch().sendDynamicInteraction(item.getAmount(), false, 0);
		else if (itemId == 1438)
			Runecrafting.locate(player, 3127, 3405);
		else if (itemId == 1440)
			Runecrafting.locate(player, 3306, 3474);
		else if (itemId == 1442)
			Runecrafting.locate(player, 3313, 3255);
		else if (itemId == 1444)
			Runecrafting.locate(player, 3185, 3165);
		else if (itemId == 1446)
			Runecrafting.locate(player, 3053, 3445);
		else if (itemId == 1448)
			Runecrafting.locate(player, 2982, 3514);

		else if (itemId <= 1712 && itemId >= 1706 || itemId >= 10354
				&& itemId <= 10362)
			player.getDialogueManager().startDialogue("Transportation",
					"Edgeville", new WorldTile(3087, 3496, 0), "Karamja",
					new WorldTile(2918, 3176, 0), "Draynor Village",
					new WorldTile(3105, 3251, 0), "Al Kharid",
					new WorldTile(3293, 3163, 0), itemId);
		else if (itemId == 1704 || itemId == 10352)
			player.getPackets()
			.sendGameMessage(
					"The amulet has ran out of charges. You need to recharge it if you wish it use it once more.");
		else if (itemId >= 3853 && itemId <= 3867)
			player.getDialogueManager().startDialogue("Transportation",
					"Burthrope Games Room", new WorldTile(2880, 3559, 0),
					"Barbarian Outpost", new WorldTile(2519, 3571, 0),
					"Gamers' Grotto", new WorldTile(2970, 9679, 0),
					"Corporeal Beast", new WorldTile(2886, 4377, 0), itemId);
		else if (itemId >= 2552 && itemId <= 2566)
			player.getDialogueManager().startDialogue("Transportation",
					"Duel Arena", new WorldTile(3315, 3234, 0),
					"Castle Wars", new WorldTile(2442, 3088, 0),
					"Mobilising Armies", new WorldTile(2413, 2848, 0),
					"Fist of Guthix", new WorldTile(1679, 5599, 0), itemId);
	}

	public static void handleItemOption7(Player player, int slotId, int itemId,
			Item item) {
		long time = Utils.currentTimeMillis();
		if (player.getLockDelay() >= time
				|| player.getEmotesManager().getNextEmoteEnd() >= time)
			return;
		if (!player.getControlerManager().canDropItem(item))
			return;
		if(!player.getPlayerPin().hasEnteredPin()) {
			player.getPackets().sendGameMessage("You have not entered your player pin.");
			return;
		}
		if (player.getCharges().degradeCompletly(item)) {
			return;
		}
		player.stopAll(false);
		if (item.getDefinitions().isDestroyItem() || item.getDefinitions().containsOption("destroy") || item.getDefinitions().containsOption("Destroy")) {
			player.getDialogueManager().startDialogue("DestroyItemOption", slotId, item);
			return;
		}
		if (player.getPetManager().spawnPet(itemId, true)) 
			return;
		player.getInventory().deleteItem(slotId, item);
		WorldTile temp = new WorldTile(player);
		if(!(player.getRights() == 2) && !Settings.isOwner(player))
			World.addGroundItem(item, new WorldTile(player), player, false, 180, true);
		player.getPackets().sendSound(2739, 0, 1);
		if (item != null) {
			Archiver.writeDropLog(player, item, temp);
		}
	}

	public static void handleItemOption8(Player player, int slotId, int itemId,
			Item item) {
		player.getInventory().sendExamine(slotId);
		if (player.getRights() > 1 /*&& !item.getDefinitions().isTradeable()*/)
			player.sm("This item is not tradable.");
	}


	public static void handleItemOnNPC(final Player player, final NPC npc, final Item item) {
		if (item == null) {
			return;
		}
		player.setRouteEvent(new RouteEvent(npc, new Runnable() {
			@Override
			public void run() {
				if (!player.getInventory().containsItem(item.getId(), item.getAmount())) {
					return;
				}
				if (npc instanceof Pet) {
					player.faceEntity(npc);
					player.getPetManager().eat(item.getId(), (Pet) npc);
					return;
				}
				if(npc.getId() == 919 && item.getId() == PrinceAliRescue.ROPE) {
					int progress = player.getQuestManager().get(Quests.PRINCE_ALI_RESUCE).getStage();
					int ticks = 0;
					//progress > 5 && progress < 8
					if(player.getRights() > 1) {
						player.getQuestManager().get(Quests.PRINCE_ALI_RESUCE).setStage(7);
						player.getInventory().deleteItem(new Item(PrinceAliRescue.ROPE));
						player.getDialogueManager().startDialogue("SimpleMessage", "You overpower Keli, tie her up, and put her in a cupboard.");
						for (final NPC n : World.getNPCs()) {
							if (n == null || n.getId() != 919) {
								continue;
							}
							PrinceAliRescue.setLadyKeliSpawned(false);
							n.sendInstantDeath(n);
						}
					} else {
						player.getPackets().sendGameMessage("Nothing Interesting happens.");
					}
				}

				if(npc.getId() == 4494 && item.getId() == 286) {
					if(player.getQuestManager().get(Quests.GOBLIN_DIPLOMACY).getStage() > 1) {
						player.getDialogueManager().startDialogue("GeneralWartface", 4);
						return;
					}
				}
				if(npc.getId() == 1395) {
					LumberjackLeif.purchaseLogs(player, item);
				}
				if(npc.getId() == 1396) {
					MinerMagnus.purchaseOre(player, item);
				}
				if(npc.getId() == 1397) {
					FishermanFrodi.purchaseFish(player, item);
				}
				if (npc.getId() == 519) {
					if (BrokenItems.forBrokenId(item.getId()) == null && BrokenItems.forDegradedId(item.getId()) == null) {
						player.getDialogueManager().startDialogue("SimpleMessage", "You cant repair this item.");
						return;
					}
					player.getDialogueManager().startDialogue("Repair", 945, item.getId());
					return;
				}
			}
		}));
	}

	public static void handleItemOnPlayer(final Player player,
			final Player usedOn, final int itemId) {
		player.setRouteEvent(new RouteEvent(usedOn, new Runnable() {
			public void run() {
				player.faceEntity(usedOn);
				if (usedOn.getInterfaceManager().containsScreenInter()) {
					player.sendMessage(usedOn.getDisplayName() + " is busy.");
					return;
				}
				if (player.getAttackedByDelay() + 10000 > Utils.currentTimeMillis()) {
					player.sm("You can't do this during combat.");
					return;
				}
				if (usedOn.getAttackedByDelay() + 10000 > Utils.currentTimeMillis()) {
					player.sm("You cannot send a request to a player in combat.");
					return;
				}
				switch (itemId) {
				/*case 4155:
					player.getSlayerManager().invitePlayer(usedOn);
					break;*/
				case 962:// Christmas cracker
					if (player.getInventory().getFreeSlots() < 3
							|| usedOn.getInventory().getFreeSlots() < 3) {
						player.sendMessage((player.getInventory()
								.getFreeSlots() < 3 ? "You do"
										: "The other player does")
								+ " not have enough inventory space to open this cracker.");
						return;
					}
					player.getDialogueManager().startDialogue(
							"ChristmasCrackerD", usedOn, itemId);
					break;
				case 11951:
					player.getInventory().deleteItem(11951, 1);
					player.faceEntity(usedOn);
					player.setNextAnimation(new Animation(7530));
					World.sendProjectile(player, player, usedOn, 1281, 21, 21, 90, 65, 50, 0);
					GameEngine.getEngine().getScheduler().schedule(new TimerTask() {
						int snowballtime = 3;
						public void run() {
							try {
								if(snowballtime==1){
									usedOn.setNextGraphics(new Graphics(1282));
								}
								if (this == null || snowballtime <= 0) {
									cancel();
									return; 
								}
								if (snowballtime >= 0) {
									snowballtime--;
								}
							} catch (Throwable e) {
								Logger.handle(e);
							}
						}
					}, 0, 600);
					break;
				default:
					//player.sendMessage("Nothing interesting happens.");
					break;
				}
			}
		}));
	}

}
