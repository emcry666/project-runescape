package com.rs.game.player.content.jobs;

import java.io.Serializable;

import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.player.Player;

/**
 * @Author arrow
 * @Contact<arrowrsps@gmail.com;skype:arrowrsps>
 */
public abstract class Job implements Serializable {

	private static final long serialVersionUID = 123217802254773040L;
	protected Player player;
    protected int stage = 0;
    private JobState state = JobState.NOT_STARTED;
    protected final int JOB_PAY_RATE = 1;

    public abstract JobReward[] getRewards();

    public Job(Player player) {
        this.player = player;
    }

    public void sendReward() {
        for (JobReward reward : getRewards()) {
            switch (reward.getType()) {
                case EXPERIENCE:
                    player.getSkills().addXp((Integer) reward.getData()[0], (Integer) reward.getData()[1]);
                    break;
                case ITEM:
                    Item item = (Item) reward.getData()[0];
                    if (player.getInventory().getFreeSlots() >= 1) {
                        player.getInventory().addItem(item);
                    } else {
                        World.addGroundItem(item, new WorldTile(player));
                    }
                    break;
                default:
                    break;
            }
        }
        stage = 0;
        state = JobState.NOT_STARTED;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }
    
    public void progressStage(int stage) {
    	this.stage += stage;
    }

    public JobState getState() {
        return state;
    }

    public void setState(JobState state) {
        this.state = state;
    }

}
