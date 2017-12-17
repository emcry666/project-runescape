package com.rs.game.item;


import java.util.TimerTask;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.engine.GameEngine;
import com.rs.game.Animation;
import com.rs.game.Graphics;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.content.Enchanting;
import com.rs.game.player.content.Shop;


public class MagicOnItem {


    public static final int LOW_ALCHEMY = 38;
    public static final int HIGH_ALCHEMY = 59;
    public static final int SUPER_HEAT = 50;
    public static final int LV1_ENCHANT = 29;
    public static final int LV2_ENCHANT = 41;
    public static final int LV3_ENCHANT = 53;
    public static final int LV4_ENCHANT = 61;
    public static final int LV5_ENCHANT = 76;
    public static final int LV6_ENCHANT = 88;

    public static void handleMagic(Player player, int magicId, Item item) {
        int itemId = item.getId();
        switch (magicId) {
        
            case LOW_ALCHEMY:
                processLowAlchemy(player, item.getId());
                break;
                
            case HIGH_ALCHEMY:
                processHighAlchemy(player, item.getId());
                break;
                
            case SUPER_HEAT:
            	break;

            case LV1_ENCHANT:
            	Enchanting.startEnchant(player, itemId, 1);
            	break;

            case LV2_ENCHANT:
            	Enchanting.startEnchant(player, itemId, 2);
            	break;

            case LV3_ENCHANT:
            	Enchanting.startEnchant(player, itemId, 3);
            	break;

            case LV4_ENCHANT:
            	Enchanting.startEnchant(player, itemId, 4);
            	break;

            case LV5_ENCHANT:
            	Enchanting.startEnchant(player, itemId, 5);
            	break;

            case LV6_ENCHANT:
            	Enchanting.startEnchant(player, itemId, 6);
            	break;

            default:
                player.sm("Invalid Magic Id: "+magicId+"");
                break;
        }
    }
    
    public static final void processHighAlchemy(final Player player,
			final int itemId) {
    	if(player.getRights() < 2)
    		return;
		if (player.getSkills().getLevel(Skills.MAGIC) < 55) {
			player.getPackets().sendGameMessage(
					"You do not have the required level to cast this spell.");
			return;
		}
		if (itemId == 995) {
			player.getPackets().sendGameMessage("You cannot alch gold!");
			return;
		}
		if (player.getEquipment().getWeaponId() == 1401
				|| player.getEquipment().getWeaponId() == 3054
				|| player.getEquipment().getWeaponId() == 19323
				|| player.getEquipment().getWeaponId() == 1393
				|| player.getEquipment().getWeaponId() == 1387) {
			if (!player.getInventory().containsItem(561, 1)) {
				player.getPackets()
				.sendGameMessage(
						"You do not have the required runes to cast this spell.");
				return;
			}
			GameEngine.getEngine().fastExecutor().schedule(new TimerTask() {
				int time = 0;

				@Override
				public void run() {
					if (time == 1) {
						int alchPrice = ItemDefinitions.getItemDefinitions(itemId).getValue(itemId);
						alchPrice = (alchPrice / (int) 2.5);
						player.getTemporaryAttributtes().put("alching",
								Boolean.TRUE);
						player.setNextAnimation(new Animation(9633));
						player.setNextGraphics(new Graphics(1693));
						player.getInventory().deleteItem(561, 1);
						player.getInventory().deleteItem(itemId, 1);
						player.getInventory().addItem(995, alchPrice);
						player.getSkills().addXp(Skills.MAGIC, 65);
					} else if(time == 4) {
						player.getInterfaceManager().openGameTab(7);
					} else if (time == 11) {
						player.getTemporaryAttributtes().put("alching",
								Boolean.FALSE);
					}
					time++;
				}
			}, 0, 250L);
		} else {
			if (!player.getInventory().containsItem(561, 1)
					|| !player.getInventory().containsItem(554, 3)) {
				player.getPackets()
				.sendGameMessage(
						"You do not have the required runes to cast this spell.");
				return;
			}
			GameEngine.getEngine().fastExecutor().schedule(new TimerTask() {
				int time = 0;
				@Override
				public void run() {
					if (time == 1) {
						int alchPrice = ItemDefinitions.getItemDefinitions(itemId).getValue(itemId);
						alchPrice = (alchPrice / (int) 2.5);
						player.getTemporaryAttributtes().put("alching",
								Boolean.TRUE);
						player.setNextAnimation(new Animation(713));
						player.setNextGraphics(new Graphics(764));
						player.getInventory().deleteItem(561, 1);
						player.getInventory().deleteItem(554, 5);
						player.getInventory().deleteItem(itemId, 1);
						player.getInventory().addItem(995, alchPrice);
						player.getSkills().addXp(Skills.MAGIC, 65);
					} else if(time == 4) {
						player.getInterfaceManager().openGameTab(7);
						
					} else if (time == 11) {
						player.getTemporaryAttributtes().put("alching",
								Boolean.FALSE);
					}
					time++;
				}
			}, 0, 250L);
		}
	}

	public static final void processLowAlchemy(final Player player,
			final int itemId) {
		if(player.getRights() < 2)
    		return;
		if (player.getSkills().getLevel(Skills.MAGIC) < 21) {
			player.getPackets().sendGameMessage(
					"You do not have the required level to cast this spell.");
			return;
		}
		if (itemId == 995) {
			player.getPackets().sendGameMessage("You cannot alch gold!");
			return;
		}
		if (player.getEquipment().getWeaponId() == 1401
				|| player.getEquipment().getWeaponId() == 3054
				|| player.getEquipment().getWeaponId() == 19323
				|| player.getEquipment().getWeaponId() == 1393
				|| player.getEquipment().getWeaponId() == 1387) {
			if (!player.getInventory().containsItem(561, 1)) {
				player.getPackets()
				.sendGameMessage(
						"You do not have the required runes to cast this spell.");
				return;
			}
			GameEngine.getEngine().fastExecutor().schedule(new TimerTask() {
				int time = 0;

				@Override
				public void run() {
					if (time == 1) {
						int alchPrice = ItemDefinitions.getItemDefinitions(itemId).getValue(itemId);
						alchPrice = (alchPrice / 5);
						player.getTemporaryAttributtes().put("alching",
								Boolean.TRUE);
						player.setNextAnimation(new Animation(9625));
						player.setNextGraphics(new Graphics(1692));
						player.getInventory().deleteItem(561, 1);
						player.getInventory().deleteItem(itemId, 1);
						player.getInventory().addItem(995, alchPrice);
						player.getSkills().addXp(Skills.MAGIC, 25);
					} else if(time == 4) {
						player.getInterfaceManager().openGameTab(7);
					} else if (time == 5) {
						player.getTemporaryAttributtes().put("alching",
								Boolean.FALSE);
					}
					time++;
				}
			}, 0, 250L);
		} else {
			if (!player.getInventory().containsItem(561, 1)
					|| !player.getInventory().containsItem(554, 3)) {
				player.getPackets()
				.sendGameMessage(
						"You do not have the required runes to cast this spell.");
				return;
			}
			GameEngine.getEngine().fastExecutor().schedule(new TimerTask() {
				int time = 0;

				@Override
				public void run() {
					if (time == 1) {
						int alchPrice = ItemDefinitions.getItemDefinitions(itemId).getValue(itemId);
						alchPrice = (alchPrice / 5);
						player.getTemporaryAttributtes().put("alching",
								Boolean.TRUE);
						player.setNextAnimation(new Animation(712));
						player.setNextGraphics(new Graphics(112));
						player.getInventory().deleteItem(561, 1);
						player.getInventory().deleteItem(554, 5);
						player.getInventory().deleteItem(itemId, 1);
						player.getInventory().addItem(995, alchPrice);
						player.getSkills().addXp(Skills.MAGIC, 25);
					} else if(time == 4) {
						player.getInterfaceManager().openGameTab(7);
					} else if (time == 5) {
						player.getTemporaryAttributtes().put("alching",
								Boolean.FALSE);
					}
					time++;
				}
			}, 0, 250L);
		}
	}
    
}