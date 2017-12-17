package com.rs.game.player.dialogues.impl.cities.keldagrim;

import java.util.TimerTask;

import com.rs.engine.GameEngine;
import com.rs.game.Animation;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.dialogues.Dialogue;

public class DragonPlatebody extends Dialogue {
	Player player;

	@Override
	public void start() {
		player = (Player) parameters[0];
		sendDialogue("Are you sure you want to make a dragon platebody? <col=FF0000> You will lose your pickaxe.");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (stage == -1) {
			sendOptionsDialogue("Choose an option", "Yes, make the platebody.",
					"Nevermind.");
			stage++;
		} else if (stage == 0) {
			switch (componentId) {
			case (OPTION_1):
				end();
				player.lock();
				player.getPackets().sendGameMessage(
						"Your blast fusion hammer crumbles into dust.");
				player.getInventory().removeItems(new Item(14472),
						new Item(14474), new Item(14476), new Item(14478));
				GameEngine.fastExecutor.schedule(new TimerTask() {
					int time = 0;

					@Override
					public void run() {
						player.setNextAnimation(new Animation(898));
						if (time == 4) {
							player.getInventory().addItem(14479, 1);
							cancel();
							player.unlock();
						} else
							time++;
					}
				}, 250L, 1000L);
				break;
			case (OPTION_2):
				end();
				break;
			}
		} else
			end();

	}

	@Override
	public void finish() {

	}
}
