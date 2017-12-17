package com.rs.game.player.content.jobs.impl.bananaplantation;

import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.content.jobs.Job;
import com.rs.game.player.content.jobs.JobReward;
import com.rs.game.player.content.jobs.RewardType;
import com.rs.utils.Utils;

/**
 * @Author Frostbite
 * @Contact<frostbitersps@gmail.com;skype:frostbitersps>
 */
@SuppressWarnings("serial")
public class BananaPlantation extends Job {

    protected Player player;
    

    public BananaPlantation(Player player) {
        super(player);
    }

    @Override
    public JobReward[] getRewards() {
        return new JobReward[] {
                new JobReward(RewardType.ITEM, new Item(995, Utils.random(100, 1500) * JOB_PAY_RATE))
        };
    }
}
