package com.rs.game.player;

import com.rs.game.World;
import com.rs.mysql.impl.Voting;
import com.rspserver.motivote.MotivoteHandler;
import com.rspserver.motivote.Reward;

public class RewardHandler extends MotivoteHandler<Reward>
{
	

	public void onCompletion(Reward reward)
	{
		if (reward.rewardName().equalsIgnoreCase("gold"))
		{
			Player player = World.get(reward.username());
			if (player == null) 
				return;
			if(!player.getInventory().hasFreeSlots()) {
				player.getBank().addItem(20936, 1, false);
				player.getPackets().sendGameMessage("Your vote reward has been sent to your bank. Thank you for your support!");
			} else {
				player.getInventory().addItem(20936, 1);
			}
			World.sendWorldMessage("<img=5><col=ffffff><shad=0000ff>" + player.getDisplayName() + " has just voted! Remember to vote every 12 hours.");
			reward.complete();
			player.refreshLastVote();
		}
		System.out.println(reward.internalID() + " | Reward received for " + reward.username() + " (" + reward.rewardName() + ", " + reward.amount() + ")");
	}

	
}

