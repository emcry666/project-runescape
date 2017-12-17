package com.rs.game.player.content.jobs.impl.miscellania;

import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.content.jobs.Job;
import com.rs.game.player.content.jobs.JobReward;
import com.rs.game.player.content.jobs.RewardType;

@SuppressWarnings("serial")
public class GathererJob extends Job {

	public GathererJob(Player player) {
		super(player);
	}

	@Override
	public JobReward[] getRewards() {
		return new JobReward[] { new JobReward(RewardType.ITEM, new Item(995, 24)) };//TODO
	}

}
