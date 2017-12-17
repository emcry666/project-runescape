package com.rs.game.player.actions.divination;

import com.rs.game.Animation;
import com.rs.game.Graphics;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Profession;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Action;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */


public class WeavingEnergy extends Action {

    /**
     * 
     * 4254 -> Teleport Animation
     */
    

    public enum Energy {

	/**
	 * WispInfo.PALE.getEnergyId() Energy Products
	 */

	DIVINE_CRAYFISH_BUBBLE(1, 1.0, new Item[] { new Item(WispInfo.PALE.getEnergyId(), 5), new Item(13435, 20) }, new Item(31080)),

	PORTENT_OF_RESTORATION_1(2, 1.0, new Item[] { new Item(WispInfo.PALE.getEnergyId(), 30), new Item(13433, 5) }, new Item(29209)),

	DIVINE_BRONZE_ROCK(3, 1.2, new Item[] { new Item(WispInfo.PALE.getEnergyId(), 20), new Item(436, 20) }, new Item(29294)),

	DIVINE_KEBBIT_BURRO(4, 1.3, new Item[] { new Item(WispInfo.PALE.getEnergyId(), 25), new Item(9986, 20) }, new Item(29300)),

	ATTUNED_PORTENT_OF_RESTORATION_1(5, 1.5, new Item[] { new Item(WispInfo.PALE.getEnergyId(), 30), new Item(13433, 1) },
		new Item(29259)),

	SIGN_OF_THE_PORTER_1(6, 1.7, new Item[] { new Item(WispInfo.PALE.getEnergyId(), 30), new Item(1656, 1) }, new Item(29275)),

	DIVINE_TREE(7, 1.8, new Item[] { new Item(WispInfo.PALE.getEnergyId(), 5), new Item(1511, 20) }, new Item(29304)),

	SIGN_OF_RESPITE_1(8, 2.0, new Item[] { new Item(WispInfo.PALE.getEnergyId(), 25), new Item(3211, 4) }, new Item(29269)),

	BOON_OF_FLICKERING_ENERGY(10, 3.0, new Item[] { new Item(WispInfo.PALE.getEnergyId(), 100) }, new Item(29373)),


	/**
	 * Flicking Energy Products
	 */
	
	DIVINE_HERRING_BUBBLE(11, 3.0, new Item[] {new Item(WispInfo.FLICKERING.getEnergyId(), 15), new Item(345, 20), }, new Item(31081)),
	
	DIVINE_HERB_PATCH_1(12, 3.1, new Item[] {new Item(WispInfo.FLICKERING.getEnergyId(), 5), new Item(249, 10), }, new Item(29310)),
	
	OAK_LOGS(13, 3.3, new Item[] {new Item(WispInfo.FLICKERING.getEnergyId(), 2), new Item(1511, 3), }, new Item(29310)),
	
	PORTENT_OF_RESTORATION_2(15, 3.4, new Item[] {new Item(WispInfo.FLICKERING.getEnergyId(), 30), new Item(333, 1), }, new Item(29259)),
	
	RAW_TROUT(16, 3.6, new Item[] {new Item(WispInfo.FLICKERING.getEnergyId(), 2), new Item(327, 3), }, new Item(335)),
	
	IRON_ORE(17, 3.7, new Item[] {new Item(WispInfo.FLICKERING.getEnergyId(), 2), new Item(436, 3), }, new Item(440)),
	
	ATTUNED_PORTENT_OF_RESTORATION(18, 3.9, new Item[] {new Item(WispInfo.FLICKERING.getEnergyId(), 30), new Item(333, 1), }, new Item(29260)),
	
	DIVINE_IRON_ROCK(19, 4.0, new Item[] {new Item(WispInfo.FLICKERING.getEnergyId(), 20), new Item(440, 15), }, new Item(29295)),
	
	BOON_OF_BRIGHT_ENERGY(20, 5.0, new Item[] {new Item(WispInfo.FLICKERING.getEnergyId(), 300) }, new Item(29374)),

	/**
	 * Bright Energy Products
	 */
	
	DIVINE_TROUT_BUBBLE(20, 5.0, new Item[] {new Item(WispInfo.BRIGHT.getEnergyId(), 15), new Item(335, 20) }, new Item(31082)),
	
	DIVINE_OAK_TREE(21, 5.1, new Item[] {new Item(WispInfo.BRIGHT.getEnergyId(), 15), new Item(1521, 20)}, new Item(29305)),
	
	SILVER_ORE(22, 5.2, new Item[] {new Item(WispInfo.BRIGHT.getEnergyId(), 2), new Item(440, 3) }, new Item(442)),
	
	SIGN_OF_RESPITE_2(23, 5.3, new Item[] {new Item(WispInfo.BRIGHT.getEnergyId(), 30), new Item(3211, 4) }, new Item(29271)),
	
	DIVINE_BIRD_SNARE(24, 5.4, new Item[] {new Item(WispInfo.BRIGHT.getEnergyId(), 30), new Item(9978, 20) }, new Item(29301)),
	
	PORTENT_OF_RESTORATION_3(25, 5.6, new Item[] {new Item(WispInfo.BRIGHT.getEnergyId(), 30), new Item(329, 1) }, new Item(29241)),
	
	UNCUT_EMERALD(26, 5.7, new Item[] {new Item(WispInfo.BRIGHT.getEnergyId(), 2), new Item(1631) }, new Item(1621)),
	
	ATTUNED_PORTENT_OF_RESTORATION_3(28, 5.8, new Item[] {new Item(WispInfo.BRIGHT.getEnergyId(), 30), new Item(329)}, new Item(29261)),
	
	SIGN_OF_THE_PORTER_2(28, 5.9, new Item[] {new Item(WispInfo.BRIGHT.getEnergyId(), 35), new Item(1656) }, new Item(29277)),
	
	COAL(29, 6.0, new Item[] {new Item(WispInfo.BRIGHT.getEnergyId(), 2), new Item(440, 3) }, new Item(453)),
	
	BOON_OF_GLOWING_ENERGY(30, 7.0, new Item[] {new Item(WispInfo.BRIGHT.getEnergyId(), 500)}, new Item(29375)),	
	
	/**
	 * Glowing Energy Products
	 */
	
	DIVINE_SALMON_BUBBLE(30, 7.0, new Item[] { new Item(WispInfo.GLOWING.getEnergyId(), 45), new Item(331, 20) }, new Item(31083)),
	
	DIVINE_WILLOW_TREE(31, 7.2, new Item[] { new Item(WispInfo.GLOWING.getEnergyId(), 20), new Item(1519, 20) }, new Item(29306)),
	
	DIVINE_COAL_ROCK(31, 7.2, new Item[] { new Item(WispInfo.GLOWING.getEnergyId(), 20), new Item(453, 20) }, new Item(29296)),
	
	WILLOW_LOGS(32, 7.3, new Item[] { new Item(WispInfo.GLOWING.getEnergyId(), 2), new Item(1521, 3) }, new Item(1519)),
	
	UNCUT_RUBY(33, 7.4, new Item[] { new Item(WispInfo.GLOWING.getEnergyId(), 2), new Item(1621, 3) }, new Item(1619)),
	
	DIVINE_DEADFALL_TRAP(34, 7.5, new Item[] { new Item(WispInfo.GLOWING.getEnergyId(), 45), new Item(10113, 24) }, new Item(29302)),
	
	PORTENT_OF_RESTORATION_IV(35, 7.6, new Item[] { new Item(WispInfo.GLOWING.getEnergyId(), 30), new Item(361) }, new Item(29245)),
	
	RAW_TUNA(36, 7.7, new Item[] { new Item(WispInfo.GLOWING.getEnergyId(), 2), new Item(335, 4) }, new Item(359)),
	
	ATTUNED_PORTENT_OF_RESTORATION_IV(37, 7.8, new Item[] { new Item(WispInfo.GLOWING.getEnergyId(), 30), new Item(361) }, new Item(29261)),
	
	SIGN_OF_RESPITE_III(38, 7.9, new Item[] { new Item(WispInfo.GLOWING.getEnergyId(), 35), new Item(321, 4) }, new Item(29273)),
	
	COAL_ORE(39, 8.0, new Item[] { new Item(WispInfo.GLOWING.getEnergyId(), 2), new Item(442, 3) }, new Item(453)),
	
	BOON_OF_SPARKLING_ENERGY(40, 9.0, new Item[] { new Item(WispInfo.GLOWING.getEnergyId(), 600) }, new Item(29376)),
	
	/**
	 * Sparkling Energy Products
	 */
	
	DIVINE_LOBSTER_BUBBLE(41, 10.0, new Item[] { new Item(WispInfo.SPARKLING.getEnergyId(), 70), new Item(377, 20) }, new Item(31084)),
	
	UNCUT_DIAMOND(42, 9.1, new Item[] { new Item(WispInfo.SPARKLING.getEnergyId(), 2), new Item(1619, 3) }, new Item(1617)),
	
	DIVINE_MAPLE_TREE(44, 9.3, new Item[] { new Item(WispInfo.SPARKLING.getEnergyId(), 25), new Item(1517, 20) }, new Item(1517)),
	
	PORTENT_OF_RESTORATION_V(45, 9.4, new Item[] { new Item(WispInfo.SPARKLING.getEnergyId(), 35), new Item(301), }, new Item(29248)),
	
	RAW_BASS(46, 9.6, new Item[] { new Item(WispInfo.SPARKLING.getEnergyId(), 2), new Item(359, 3) }, new Item(363)),
	
	ATTUNED_PORTENT_OF_RESTORATION_V(47, 9.7, new Item[] { new Item(WispInfo.SPARKLING.getEnergyId(), 35), new Item(379) }, new Item(29263)),
	
	SIGN_OF_THE_PORTER_V(48, 9.9, new Item[] { new Item(WispInfo.SPARKLING.getEnergyId(), 40), new Item(1658) }, new Item(29279)),
	
	MAPLE_LOGS(49, 10.0, new Item[] { new Item(WispInfo.SPARKLING.getEnergyId(), 2), new Item(1519, 3) }, new Item(1517)),
	
	BOON_OF_GLEAMING_ENERGY(50, 11, new Item[] { new Item(WispInfo.SPARKLING.getEnergyId(), 800)}, new Item(29377)),
	
	/**
	 * Gleaming Energy Products
	 */
	
	;

	public static Energy getEnergyProduce(int id) {
	    for (Energy ener : Energy.values()) {
		if (ener.getProduceEnergy().getId() == id)
		    return ener;
	    }
	    return null;
	}

	public static Energy getEnergy(int id) {
	    for (Energy ener : Energy.values()) {
		for (Item item : ener.getItemsRequired())
		    if (item.getId() == id)
			return ener;
	    }
	    return null;
	}

	private int levelRequired;
	private double experience;
	private Item[] itemsRequired;
	private Item energyProduce;

	private Energy(int levelRequired, double experience, Item[] itemsRequired, Item energyProduce) {
	    this.levelRequired = levelRequired;
	    this.experience = experience;
	    this.itemsRequired = itemsRequired;
	    this.energyProduce = energyProduce;
	}

	public Item[] getItemsRequired() {
	    return itemsRequired;
	}

	public int getLevelRequired() {
	    return levelRequired;
	}

	public Item getProduceEnergy() {
	    return energyProduce;
	}

	public double getExperience() {
	    return experience;
	}

    }

    public Energy energy;
    public Item item;
    public int ticks;

    public WeavingEnergy(Energy bar, Item item, int ticks) {
	this.item = item;
	this.energy = bar;
	this.ticks = ticks;
    }

    @Override
    public boolean start(Player player) {
	if (energy == null || player == null || item == null) {
	    return false;
	}
	if (!player.getInventory().containsItemToolBelt(energy.getItemsRequired()[0].getId(),
		energy.getItemsRequired()[0].getAmount())) {
	    player.getPackets().sendGameMessage("You need " + energy.getItemsRequired()[0].getDefinitions().getName()
		    + " to create a " + energy.getProduceEnergy().getDefinitions().getName() + ".");
	    return false;
	}
	if (energy.getItemsRequired().length > 1) {
	    if (!player.getInventory().containsItemToolBelt(energy.getItemsRequired()[1].getId(),
		    energy.getItemsRequired()[1].getAmount())) {
		player.getPackets()
			.sendGameMessage("You need " + energy.getItemsRequired()[1].getDefinitions().getName()
				+ " to create a " + energy.getProduceEnergy().getDefinitions().getName() + ".");
		return false;
	    }
	}
	if (player.getProfession().getLevel(Profession.DIVINATION) < energy.getLevelRequired()) {
	    player.getPackets().sendGameMessage("You need a Divination level of at least " + energy.getLevelRequired()
		    + " to weave " + energy.getProduceEnergy().getDefinitions().getName());
	    return false;
	}
	player.getPackets()
		.sendGameMessage("You being to weave the energy and attempt to create a "
			+ energy.getProduceEnergy().getDefinitions().getName().toLowerCase().replace(" bar", "") + ".",
		true);
	return true;
    }

    @Override
    public boolean process(Player player) {
	if (energy == null || player == null || item == null) {
	    return false;
	}
	if (!player.getInventory().containsItemToolBelt(energy.getItemsRequired()[0].getId(),
		energy.getItemsRequired()[0].getAmount())) {
	    player.getPackets().sendGameMessage("You need " + energy.getItemsRequired()[0].getDefinitions().getName()
		    + " to create a " + energy.getProduceEnergy().getDefinitions().getName() + ".");
	    return false;
	}
	if (energy.getItemsRequired().length > 1) {
	    if (!player.getInventory().containsItemToolBelt(energy.getItemsRequired()[1].getId(),
		    energy.getItemsRequired()[1].getAmount())) {
		player.getPackets()
			.sendGameMessage("You need " + energy.getItemsRequired()[1].getDefinitions().getName()
				+ " to create a " + energy.getProduceEnergy().getDefinitions().getName() + ".");
		return false;
	    }
	}
	if (player.getProfession().getLevel(Profession.DIVINATION) < energy.getLevelRequired()) {
	    player.getPackets().sendGameMessage("You need a Divination level of at least " + energy.getLevelRequired()
		    + " to smelt " + energy.getProduceEnergy().getDefinitions().getName());
	    return false;
	}
	return true;
    }

    @Override
    public int processWithDelay(Player player) {
	ticks--;
	player.setNextAnimation(new Animation(21225));
	player.setNextGraphics(new Graphics(4249));
	double xp = energy.getExperience();
	player.getProfession().addExperience(Profession.DIVINATION, xp);
	for (Item required : energy.getItemsRequired()) {
	    if (required.getId() == 4 || required.getId() == 2976 || required.getId() == 1594
		    || required.getId() == 1599 || required.getId() == 5523)
		continue;
	    player.getInventory().deleteItem(required.getId(), required.getAmount());
	}
	int amount = energy.getProduceEnergy().getAmount();
	player.getInventory().addItem(energy.getProduceEnergy().getId(), amount);
	player.getPackets().sendGameMessage("You successfully weave the energy into a "
		+ energy.getProduceEnergy().getDefinitions().getName().toLowerCase() + ".", true);
	if (ticks > 0) {
	    return 1;
	}
	return -1;
    }

    @Override
    public void stop(Player player) {
	setActionDelay(player, 3);
    }
}
