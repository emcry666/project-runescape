package com.rs.game.economics.capital;

import com.rs.game.economics.Market;

import java.io.Serializable;

/**
 * Created by JTlr Frost {@skype;frostbitersps} on 7/17/2016.
 */
public class Consumption implements Serializable {

    private static final long serialVersionUID = -1184730932519034076L;
    /**
     * Using up resources (resources depleted)
     *
     * When a player wastes (or uses a resource this will be called
     */

    private Market economical;

    public Consumption(Market economical) {
        this.economical = economical;
    }
}
