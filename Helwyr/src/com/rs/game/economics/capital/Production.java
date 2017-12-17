package com.rs.game.economics.capital;

import com.rs.game.economics.Market;
import com.rs.game.item.Item;

import java.io.Serializable;

/**
 * Created by JTlr Frost {@skype;frostbitersps} on 7/17/2016.
 */
public class Production implements Serializable {

    private static final long serialVersionUID = 487468323282756924L;
    /**
     * How many Resources are being created.
     *
     * This is the supply of resources being created.
     */

    private Market economical;

    public Production(Market economical) {
        this.economical = economical;
    }

    public void incrementStock(Item item) {

    }

    public StockIdentifier getStockIdentifierByItem(Item item) {
        if (item.getName().toLowerCase().contains("raw"))
            return StockIdentifier.FISH;
        if (item.getName().toLowerCase().contains("ore"))
            return StockIdentifier.ORE;
        return null;
    }

    public enum StockIdentifier {
        FISH, ORE
    }
}
