package com.rs.game.economics.capital;

import com.rs.game.economics.Market;

import java.io.Serializable;

/**
 * Created by JTlr Frost {@skype;frostbitersps} on 7/17/2016.
 */
public class NetWorth implements Serializable {

    private static final long serialVersionUID = 7194097906678470933L;
    private Market economical;

    public NetWorth(Market economical) {
        this.economical = economical;
    }
}
