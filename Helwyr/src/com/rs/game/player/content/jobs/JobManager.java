package com.rs.game.player.content.jobs;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.rs.game.player.Player;
import com.rs.game.player.content.jobs.impl.bananaplantation.BananaPlantation;
import com.rs.game.player.content.jobs.impl.locations.lumbridge.ApprenticeSmith;
import com.rs.game.player.content.jobs.impl.locations.lumbridge.Cadmus;
import com.rs.game.player.content.jobs.impl.locations.lumbridge.Julian;
import com.rs.game.player.content.quest.QuestList.Quests;

public class JobManager implements Serializable {

	private static final long serialVersionUID = 8035644107355196788L;
	private Player player;
    private List<Job> jobs = new ArrayList<Job>(Quests.values().length);

    public JobManager(Player player) {
        this.setPlayer(player);
        init();
    }

    public void add(Jobs jobs, Job job) {
        getJobs().add(jobs.index(), job);
    }

    public Job get(Jobs key) {
        return getJobs().get(key.index());
    }

    public JobManager init() {
    	add(Jobs.CADMUS, new Cadmus(player));
    	add(Jobs.JULIAN, new Julian(player));
        add(Jobs.APPRENTICE_SMITH, new ApprenticeSmith(player));
        add(Jobs.BANANA_PLANTATION, new BananaPlantation(player));
        return this;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public JobManager process() {
        return this;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
