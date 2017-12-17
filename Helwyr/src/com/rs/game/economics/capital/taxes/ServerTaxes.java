package com.rs.game.economics.capital.taxes;

import com.rs.game.economics.Market;

import java.io.Serializable;

/**
 * Created by JTlr Frost {@skype;frostbitersps} on 7/17/2016.
 */
public class ServerTaxes implements Serializable {

    private static final long serialVersionUID = 1266928346518102652L;
    private Market economical;

    public ServerTaxes(Market economical) {
        this.economical = economical;
    }
}
