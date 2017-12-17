package com.rs.game.player.actions.priffidinas.workers;

import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.content.revents.EventConstants;
import com.rs.game.player.content.revents.EventManager;
import com.rs.game.player.content.revents.EventType;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.Utils;
/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public class LadyTrahaearn extends Dialogue {

	/**
	 * Represents the Corrupted Ore Id
	 */
	public static final int CORRUPTED_ORE = 32262;

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		options(DEFAULT, "Ask about Lady Trahaearn", "Ask about the Seren Stones", "Ask about Clan Trahaearn", "Ask about Trahaearn skills", "Nothing, thanks");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage) {
		case -1:
			switch(componentId) {
			case OPTION_1:
				player(ASKING, "Can you tell me about yourself?");
				stage = 1;
				break;
			case OPTION_2:
				if(player.getSkills().getLevel(Skills.MINING) < 89) {
					npc(NORMAL, "Forgive me, but you do not yet possess the skill required to delicately remove the corruption. Perhaps with more training, but not now.");
					player.getPackets().sendGameMessage("You need 89 mining to mine the Seren Stones.");
					stage = -2;
				} else {
					npc(NORMAL, "What are the Seren Stones?");
					stage = 16;
				}
				break;
			case OPTION_3:
				player(ASKING, "What can you tell me about Clan Trahaearn's skills?");
				stage = 12;
				break;
			case OPTION_4:
				player(ASKING, "What can you tell me about Clan Trahaearn?");
				stage = 22;
				break;
			case OPTION_5:
				player(NORMAL, "Nothing, thanks.");
				stage = -2;
				break;
			}
			break;

		case 1:
			npc(UNSURE, "Huh? What?");
			stage = 2;
			break;

		case 2:
			player(ASKING, "Erm... can you tell me about yourself?");
			stage = 3;
			break;

		case 3:
			npc(ANGRY, "What? Speak up! I can't hear you.");
			stage = 4;
			break;

		case 4:
			player(ANGRY, "Can - you - tell - me - ab..");
			stage = 5;
			break;

		case 5:
			npc(LAUGH_EXCITED, "AHAHAHAHAHAHAAA! Ahem, sorry, it was too easy to pass up. I can hear you fine. I am Lady Trahaearn, leader of Clan Trahaearn. And yes, I am the oldest living elf in the city...likely the world. Traditionally when the lord of a clan dies, they are succeeded by another who then leads the clan.");
			stage = 6;
			break;

		case 6:
			npc(LAUGH_EXCITED, "But look around you. Look at the youngsters these days. No sense of decorum, or of how things should be. How could I leave my beloved clan to these children? No no no, it will not do.");
			stage = 7;
			break;

		case 7:
			npc(LAUGH_EXCITED, "So I built this device - my masterpiece! It extends my life through a combination of crystal vapours and precise enchantments. With it I can continue to govern my beloved Trahaearn until a more suitable successor arrives.");
			stage = 8;
			break;

		case 8:
			npc(LAUGH_EXCITED, "Until then, my automatons and I will watch over the clan.");
			stage = 9;
			break;

		case 9:
			player(ASKING, "You would trust machines over your own clan?");
			stage = 10;
			break;

		case 10:
			player(NORMAL, "t's not a matter of trust, but a matter of efficiency. My automatons get things done. They are efficient and unquestioning.");
			stage = 11;
			break;

		case 11:
			npc(NORMAL, "They do not destroy with 'improvements', nor add features that only serve to ruin the overall design. They do what is asked of them and they do it well. Unlike some of these youngsters.");
			stage = -3;
			break;

		case 12:
			npc(NORMAL, "We focus on the skills that lead to true creation: mining and smithing. We draw our raw materials from the very depths of the earth itself and then we refine them in the heat of our forges. Is there a greater art?");
			stage = 13;
			break;

		case 13:
			npc(NORMAL, "We find new purpose for dirt and metal, beyond just something pretty to look at. Oh, we are more than just artists. We are also the chosen ones, who cleanse the corruption from Seren's broken body.");
			stage = 14;
			break;

		case 14:
			npc(NORMAL, "We are the ones who chip the corrupted ore away from Seren's stones.");
			stage = 15;
			break;

		case 15:
			player(ASKING, "What are the Seren Stones?");
			stage = 16;
			break;

		case 16:
			npc(NORMAL, "After Seren, in her grief and love for the elves, shattered herself. Pieces of her grow in the elven lands. But there is a darkness that grows there as well - a corruption. We find these stones and we bring them here.");
			stage = 17;
			break;

		case 17:
			npc(NORMAL, "Then we spend our time carefully chipping the corruption away, purifying the stones. Oh, Hefin will say that they are the ones doing the purification, but they merely handle the final stage.");
			stage = 18;
			break;

		case 18:
			npc(NORMAL, "It is through the sweat and toil of Trahaearn that the stones are purified.");
			stage = 19;
			break;

		case 19:
			if(player.getSkills().getLevel(Skills.MINING) > 88) {
				player(ASKING, "What can I do with these corrupted ore from the Seren Stones...?");
				stage = 25;
			} else {
				options(DEFAULT, "Ask about Lady Trahaearn", "Ask about the Seren Stones", "Ask about Clan Trahaearn", "Ask about Trahaearn skills", "Nothing, thanks");
				stage = -1;
			}
			break;

		case 20:
			player(ASKING, "Can I help?");
			stage = 21;
			break;

		case 21:
			if(player.getSkills().getLevel(Skills.MINING) < 89) {
				npc(NORMAL, "Forgive me, but you do not yet possess the skill required to delicately remove the corruption. Perhaps with more training, but not now.");
				player.getPackets().sendGameMessage("You need 89 mining to mine the Seren Stones.");
				stage = -2;
			} else {
				npc(NORMAL, "What are the Seren Stones?");
				stage = 16;
			}
			break;

		case 22:
			npc(NORMAL, "We are an ancient and noble clan of workers. We reshape the earth itself according to our designs. Oh but we are much the same as the earth we shape, strong and each shaped to serve their purpose.");
			stage = 23;
			break;

		case 23:
			npc(NORMAL, "Like an anvil we hold firm the ways of the elves. Like a hammer, we force shape upon elvenkind, giving it purpose and meaning. Seren herself saw in us the future of the elves and she honoured our malleability and durability.");
			stage = 24;
			break;

		case 24:
			npc(NORMAL, "I like to think she would be proud of what we have achieved.");
			stage = -3;
			break;

		case 25:
			npc(HAPPY, "Our nobel and ancient clan of workers have been collecting Corrupted Ore since the beginning of time, Any recovered pieces can be returned to our workers for a nice reward.");
			stage = 26;
			break;

		case 26:
			options(DEFAULT, "What type of reward?", "I have some right here.");
			stage = 27;
			break;

		case 27:
			switch (componentId) {
			case OPTION_1:
				npc(NORMAL, "We have valued corrupted ore to be around 2314-2983gp as our exchange rates...");
				stage = 26;
				break;
			case OPTION_2:
				int amountOf = player.getInventory().getAmountOf(CORRUPTED_ORE);
				if (amountOf > 0) {
					npc(HAPPY, "Magnificent... Our workers will be pleased to know of recovered corrupted ore!");
					stage = 28;
				} else {
					close();
				}
				break;
			}
			break;

		case 28:
			npc(HAPPY, "Here is your reward " + player.getDisplayName() + "...");
			giveReward(player);
			stage = -2;
			break;


			/**
			 * Ending Dialogues.
			 */

		case -2:
			end();
			break;

		case -3:
			options(DEFAULT, "Ask about Lady Trahaearn", "Ak about the Seren Stones", "Ask about Clan Trahaearn", "Ask about Trahaearn skills");
			stage = -2;
			break;

		}
	}

	public static void giveReward(Player player) {
		int amountOf = player.getInventory().getAmountOf(CORRUPTED_ORE);
		int totalReceived = 0;
		int lampChance = Utils.random(15);
		if(amountOf > 1) {
			for(int i = 0; i < amountOf; i++) {
				int random = Utils.random(2314, 2983);
				if(EventManager.eventStarted(EventType.SKILL_EVENT, EventConstants.VOICE_OF_SEREN))
					random *= 2;
				player.getInventory().deleteItem(CORRUPTED_ORE, 1);
				player.getInventory().addItem(995, random);
				totalReceived += random;
			}
			if(player.getLastGivenLamp() > Utils.currentTimeMillis()) {
				if(lampChance == 0) {
					if(player.getInventory().hasFreeSlots())
						player.getInventory().addItem(1, 1);
					player.setLastGivenLamp(900000);
				}
			}
		}
		if(totalReceived > 1)
			player.getPackets().sendGameMessage("You receive " + Utils.formatNumber(totalReceived) + " coins as your reward!");
	}

	@Override
	public void finish() {
		// TODO Auto-generated method stub

	}

}
