package com.rs.game.economics;

import java.io.Serializable;

import com.rs.game.economics.capital.Consumption;
import com.rs.game.economics.capital.Demand;
import com.rs.game.economics.capital.NetWorth;
import com.rs.game.economics.capital.Production;
import com.rs.game.economics.capital.taxes.ServerTaxes;
import com.rs.utils.Logger;
import com.rs.utils.SerializableFilesManager;


/**
 * Created by JTlr Frost {@skype;frostbitersps} on 7/17/2016.
 */

/**
 * Common Ways of buying stocks (% of the company)
 */

//<Brokerage> is the most common way to buy stocks.

/**
 * DRIPS (Dividend reinvestment plans)
 *
 * What is a 'Dividend Reinvestment Plan - DRIP'
 * A dividend reinvestment plan (DRIP) is offered by a corporation that allows investors to reinvest their cash dividends by
 * purchasing additional shares or fractional shares on the dividend payment date. A DRIP is an excellent way to increase the
 * value of an investment. Most DRIPs allow investors to buy shares commission-free and at a significant discount to the current
 * share price, and do not allow reinvestments much lower than $10. This term is sometimes abbreviated as "DRP."
 */

/**
 * DIPS (Direct investment plans)
 *
 * Plans by which individual companies, for a min cost, allow shareholders to purchase stocks
 */


/**
 * Prices and Changes
 */

//Prices change from supply/demand. (If more people wanted to sell a stock than buy it, the price will fall.
// If more people wanted to buy it than sell it, the price will rise.

/**
 * Stop Order
 *
 * A stop order, also referred to as a stop-loss order, is an order to buy or sell a stock once the price of the stock
 * reaches a specified price, known as the stop price. When the stop price is reached, a stop order becomes a market order.
 * A buy stop order is entered at a stop price above the current market price.
 */

//When someone is willing to buy x1 share for x amount :: Then trade is executed.
//Larger Orders :: Could get less than $65 if you sell your share to more than 1 buyer.


/**
 * Market Order
 *
 * A market order is a buy or sell order to be executed immediately at current market prices. As long as there are willing
 * sellers and buyers, market orders are filled. Market orders are therefore used when certainty of execution is a priority
 * over price of execution.
 */

//When a seller wants to sell their share (stock) he will accept any price for his share and is willing to share it.
//When a buyer wants to buy a share (stock) he will accept lowest (any price) for their share.


/**
 * Limit Order
 *
 * A limit order is an order to buy or sell a stock at a specific price or better. A buy limit order can only be executed
 * at the limit price or lower, and a sell limit order can only be executed at the limit price or higher. A limit order is
 * not guaranteed to execute
 */

// MUST be > than set price or MUST be < than set price.


public class Market implements Serializable {

	private static final long serialVersionUID = 6797775047885271468L;

	private Consumption consumption;
	private NetWorth networth;
	private Production production;
	private Demand demand;
	private ServerTaxes serverTaxes;


	public Market() {
		consumption = new Consumption(this);
		networth = new NetWorth(this);
		production = new Production(this);
		demand = new Demand(this);
		serverTaxes = new ServerTaxes(this);
	}

	public void init() {
		Logger.log("Loaded Market Data...");
	}

	public void save() {
		Logger.log("Saving Market Data...");
		new SerializableFilesManager().saveEconomy(this);
	}

	public Consumption getConsumption() {
		return consumption;
	}

	public NetWorth getNetworth() {
		return networth;
	}

	public Production getProduction() {
		return production;
	}

	public Demand getDemand() { return demand; }

	public ServerTaxes getServerTaxes() {
		return serverTaxes;
	}



}
