package com.rs.game.player.content.bot.action;

import java.util.List;
import java.util.TimerTask;

import com.rs.engine.GameEngine;
import com.rs.game.Animation;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.player.Equipment;
import com.rs.game.player.Player;
import com.rs.game.player.actions.PlayerCombat;
import com.rs.game.player.content.Foods.Food;
import com.rs.game.player.content.bot.Bot;
import com.rs.game.player.pathing.RouteEvent;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class PVPAIPActions {

	public static List<Bot> pvp_players = Bot.getBots();
	private boolean isFleeing;

	private static final String[] trashMessages = {
			"I'll do your bloody nan in m8",
			"Your sister smells like a tuna sandwich",
	};

	private static final String[] safeMessages = {
			"Safe up n00b"
	};

	public static void syncBotThread(final Player player) {
		if (pvp_players == null || pvp_players.size() == 0) {
			return;
		}
		for (int aip_index = 0; aip_index < pvp_players.size(); aip_index++) {
			final Bot bot = pvp_players.get(aip_index);
			final Bot[] target = {
					pvp_players.get(Utils.random(pvp_players.size() - 1))
			};
			if(pvp_players == null)
				return;
			bot.getCombatDefinitions().setAutoRelatie(true);
			GameEngine.fastExecutor.schedule(new TimerTask() {
				@Override
				public void run() {
					if (bot.isDead()) {
						pvp_players.remove(bot);
					}
					if (!bot.getInventory().containsItem(385, 1)) {
						flee(bot);
					}
					if (!pvp_players.contains(target) || !canAttack(bot, target[0])) {
						target[0] = pvp_players.get(Utils.random(pvp_players.size() - 1));
					}
					attackTarget(player, bot, target[0]);
					eat(bot, target[0]);
				}

			}, 1500, 4500);
		}
	}

	private static void attackTarget(Player player, Bot bot, Bot target) {
		//If bots target is not himself we continue.
		if(target == null) 
			return;
		if (bot != target) {
			//If they are in combat or attacking:
			if (bot.isUnderCombat() || bot.isUnderAttack()) {
				//TODO: Pray
				Item weapon = bot.getEquipment().getItem(Equipment.SLOT_WEAPON);
				if (Utils.random(25) == 1) {
					if(bot.getCombatDefinitions().getSpecialAttackPercentage() == 100) { //TODO: Change 100 to their weielded weapons spec max amount
						bot.getCombatDefinitions().switchUsingSpecialAttack();
						bot.getCombatDefinitions().refreshUsingSpecialAttack();
					}
				}
			} else {
				if (Utils.random(25) == 1) {
					bot.getActionManager().setAction(new PlayerCombat(player));
				} else {
					//If a 1/50 chance is true, the attacker screams his opponents name hoping his team will dogpile him.
					int chatRandom = Utils.random(50);
					switch(chatRandom) {
					case 1:
						String target_name = target.getName().substring(0, 1).toUpperCase() + target.getName().substring(1);
						bot.publicChat(target_name);
						break;
					case 2:
						bot.publicChat(trashMessages[Utils.random(trashMessages.length - 1)]);
						break;
					}
					bot.getActionManager().setAction(new PlayerCombat(target));
				}
			}
		}
	}

	/**
	 * A basic flee method to run them to another part of the wilderness.
	 * @param bot
	 * TODO: Possibly make them run away and hop the ditch (I did not do this because we have no other actions than pking at the moment).
	 */
	private static void flee(final Bot bot) {
		int abysX = bot.getX() - 100;
		int abysY = bot.getY() + 100;
		WorldTasksManager.schedule(new WorldTask() {
			@Override
			public void run() {
				bot.stopAll();
				//bot.getProperties().getCombatPulse().setNextAttack(Utils.random(10));
				bot.setRouteEvent(new RouteEvent(new WorldTile(abysX, abysY, 0), new Runnable() {
					@Override
					public void run() {
						if (bot.isDead()) 
							bot.realFinish();
						else
							bot.publicChat("WE FLEEIN");
					}
				}));
			}

		}, 2);
	}

	/**
	 * Handles the eating of the AI player bots.
	 * @param bot
	 * TODO: Possibly add more food choices.
	 */
	private static void eat(Player bot, Bot target) {
		Item shark = new Item(385);
		if(bot == null || target == null)
			return;
		//385 is shark, you can add more from there easier.
		if(bot.getHitpoints() <= bot.getMaxHitpoints() * 0.35 && bot.getInventory().containsItem(shark)) {
			bot.getInventory().deleteItem(shark);
			bot.heal(Food.SHARK.getHeal() * 10, Food.SHARK.getExtraHP() * 10);
			bot.setNextAnimation(new Animation(829));
			bot.lock(3);
			int chatRandom = Utils.random(50);
			if (chatRandom == 1) {
				bot.publicChat(safeMessages[Utils.random(safeMessages.length - 1)]);
			}
		}
	}

	private static boolean canAttack(Player p, Player t) {
		int level = getWildLevel(p);
		if (getWildLevel(t) < level) {
			level = getWildLevel(t);
			level = getWildLevel(p);
		}
		int combat = p.getSkills().getCombatLevel();
		int targetCombat = t.getSkills().getCombatLevel();
		if (combat - level > targetCombat || combat + level < targetCombat) {
			return false;
		}
		return true;
	}

	public static int getWildLevel(Player pw) {
		if(pw.getY() > 9900)
			return (pw.getY() - 9912) / 8 + 1;
		return (pw.getY() - 3520) / 8 + 1;
	}

}
