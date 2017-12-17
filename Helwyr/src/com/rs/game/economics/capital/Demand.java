package com.rs.game.economics.capital;

import com.rs.game.economics.Market;
import com.rs.game.item.Item;

import java.io.Serializable;

/**
 * Created by JTlr Frost {@skype;frostbitersps} on 7/18/2016.
 */
public class Demand implements Serializable {

    private static final long serialVersionUID = 1967740839090330710L;
    private Market market;

    public Demand(Market market) {
        this.market = market;
    }

    public void incrementDemand(Item item) {

    }
}
