/**
 * 
 */
package com.rs.game.player.actions.divination;

import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Action;
import com.rs.game.Animation;
import com.rs.game.Graphics;
import com.rs.game.item.Item;

/**
 * @author Dylan || Mystic Wolf & yaboi Life || Jul 14, 2016
 *
 */
public class WeaveAction extends Action {
    
    public enum Weaves {
	CRAY_FISH_BUBBLE(1, 10, new Item[] { new Item(29313, 5) }, new Item(31080), new Item(13435, 20)),
	DIVINE_BRONZE_ROCK(1, 15, new Item[] { new Item(29313, 5) }, new Item(29294), new Item(436, 20)),
	DIVINE_KEBBIT_BURROW(4, 17, new Item[] { new Item(29313, 25) }, new Item(29300), new Item(9986, 20)),
	DIVINE_TREE(7, 20, new Item[] { new Item(29313, 5) }, new Item(29304), new Item(1511, 20)),
	BOON_OF_FLICKERING_ENERGY(10, 30, new Item[] { new Item(29313, 99) }, new Item(29314), new Item(29313, 1)),
	DIVINE_HERRING_BUBBLE(11, 30, new Item[] { new Item(29314, 15) }, new Item(31081), new Item(345, 20)),
	OAK_LOGS(13, 33, new Item[] { new Item(29314, 2) }, new Item(1521), new Item(1511, 3)),
	RAW_TROUT(16, 36, new Item[] { new Item(29314, 2) }, new Item(335), new Item(327, 3)),
	IRON_ORE(17, 37, new Item[] { new Item(29314, 2) }, new Item(440), new Item(436, 3)),
	DIVINE_IRON_ROCK(19, 40, new Item[] { new Item(29314, 20) }, new Item(29295), new Item(440, 15)),
	BOON_OF_BRIGHT_ENERGY(20, 50, new Item[] { new Item(29314, 299) }, new Item(29315), new Item(29190, 1)),
	DIVINE_TROUT_BUBBLE(20, 50, new Item[] { new Item(29315, 15) }, new Item(31082), new Item(335, 20)),
	DIVINE_OAK_TREE(21, 51, new Item[] { new Item(29315, 15) }, new Item(29305), new Item(1521, 20)),
	SILVER_ORE(22, 52, new Item[] { new Item(29315, 2) }, new Item(442), new Item(440, 3)),
	DIVINE_BIRD_SNARE(24, 54, new Item[] { new Item(29315, 30) }, new Item(29301), new Item(9978, 20)),
	UNCUT_EMERALD(26, 57, new Item[] { new Item(29315, 2) }, new Item(1621), new Item(1623, 3)),
	COAL(29, 60, new Item[] { new Item(29315, 2) }, new Item(453), new Item(440, 3)),
	BOON_OF_GLOWING_ENERGY(30, 70, new Item[] { new Item(29315, 499) }, new Item(29375), new Item(29315, 1)),
	DIVINE_SALMON_BUBBLE(30, 70, new Item[] { new Item(29316, 45) }, new Item(31085), new Item(331, 20)),
	DIVINE_WILLOW_TREE(31, 72, new Item[] { new Item(29316, 20) }, new Item(29306), new Item(1519, 20)),
	DIVINE_COAL_ROCK(31, 72, new Item[] { new Item(29316, 30) }, new Item(29296), new Item(453, 20)),
	WILLOW_LOGS(32, 73, new Item[] { new Item(29316, 2) }, new Item(1519), new Item(1521, 3)),
	UNCUT_RUBY(33, 74, new Item[] { new Item(29316, 2) }, new Item(1619), new Item(1621, 3)),
	DIVINE_DEADFALL_TRAP(34, 75, new Item[] { new Item(29316, 45) }, new Item(29302), new Item(10113, 24)),
	RAW_TUNA(36, 77, new Item[] { new Item(29316, 2) }, new Item(359), new Item(335, 4)),
	GOLD_ORE(39, 80, new Item[] { new Item(29316, 2) }, new Item(444), new Item(442, 3)),
	BOON_OF_SPARKLING_ENERGY(40, 90, new Item[] { new Item(29316, 599) }, new Item(29376), new Item(29316, 1)),
	DIVINE_LOBSTER_BUBBLE(41, 100, new Item[] { new Item(29317, 70) }, new Item(31084), new Item(377, 20)),
	UNCUT_DIAMOND(42, 91, new Item[] { new Item(29317, 2) }, new Item(1617), new Item(1619, 3)),
	DIVINE_MAPLE_TREE(44, 93, new Item[] { new Item(29317, 25) }, new Item(29307), new Item(1517, 20)),
	RAW_BASS(46, 96, new Item[] { new Item(29317, 2) }, new Item(363), new Item(359, 3)),
	MAPLE_LOGS(49, 100, new Item[] { new Item(29317, 2) }, new Item(1517), new Item(1519, 3)),
	BOON_OF_GLEAMING_ENERGY(50, 111, new Item[] { new Item(29317, 799) }, new Item(29377), new Item(29317, 1)),
	DIVINE_SWORDFISH_BUBLE(53, 130, new Item[] { new Item(29318, 70) }, new Item(31085), new Item(371, 20)),
	UNCUT_DRAGONSTONE(58, 120, new Item[] { new Item(29319, 2) }, new Item(1631), new Item(1617, 5)),
	BOON_OF_VIBRANT_ENERGY(60, 130, new Item[] { new Item(29312, 999) }, new Item(29378), new Item(29312, 1)),
	DIVINE_MITHRIL_ROCK(61, 131, new Item[] { new Item(29319, 30) }, new Item(29297), new Item(447, 20)),
	DIVINE_YEW_TREE(62, 132, new Item[] { new Item(29319, 30) }, new Item(29308), new Item(1515, 20)),
	MITHRIL_ORE(63, 133, new Item[] { new Item(29319, 2) }, new Item(447), new Item(453, 3)),
	GREEN_CHARM(64, 134, new Item[] { new Item(29319, 250) }, new Item(22159, 20), new Item(12158, 20)),
	DIVINE_BOX_TRAP(64, 134, new Item[] { new Item(29319, 45) }, new Item(29303), new Item(9976, 20)),
	RAW_MONKFISH(66, 137, new Item[] { new Item(29319, 2) }, new Item(7944), new Item(363, 3)),
	BOON_OF_LUSTROUS_ENERGY(70, 150, new Item[] { new Item(29319, 1249) }, new Item(29379), new Item(29312, 1)),
	YEW_LOGS(72, 152, new Item[] { new Item(29320, 2) }, new Item(1515), new Item(363, 3)),
	DIVINE_ADAMANTITE_ROCK(73, 153, new Item[] { new Item(29320, 40) }, new Item(29298), new Item(449, 25)),
	CRIMSON_CHARM(74, 154, new Item[] { new Item(29320, 750) }, new Item(12160, 10), new Item(12159, 30)),
	ADAMANITE_ORE(76, 157, new Item[] { new Item(29320, 2) }, new Item(449), new Item(447, 3)),
	DIVINE_SHARK_BUBBLE(66, 137, new Item[] { new Item(29320, 60) }, new Item(31086), new Item(383, 20)),
	BOON_OF_BRILLIANT_ENERGY(66, 137, new Item[] { new Item(29320, 1499) }, new Item(29380), new Item(29320, 1)),
	DIVINE_HERB_PATCH_III(82, 175, new Item[] { new Item(29321, 10) }, new Item(29312), new Item(265, 5)),
	DIVINE_MAGIC_TREE(82, 175, new Item[] { new Item(29321, 40) }, new Item(29309), new Item(1513, 5)),
	BLUE_CHARM(84, 175, new Item[] { new Item(29321, 1500) }, new Item(12163), new Item(12160, 20)),
	BOON_OF_RADIANT_ENERGY(82, 175, new Item[] { new Item(29321, 1749) }, new Item(29381), new Item(29321, 1)),
	DIVINE_CAVEFISH_BUBBLE(89, 200, new Item[] { new Item(29322, 70) }, new Item(31087), new Item(15264, 15)),
	BOON_OF_LUMINOUS_ENERGY(90, 210, new Item[] { new Item(29322, 1999) }, new Item(29382), new Item(29322, 1)),
	DIVINE_ROCKTAIL_BUBBLE(91, 210, new Item[] { new Item(29323, 80) }, new Item(12163), new Item(15270, 10)),
	MAGIC_LOGS(93, 217, new Item[] { new Item(29323, 2) }, new Item(1513), new Item(1515, 3)),
	DIVINE_RUNITE_ROCK(94, 220, new Item[] { new Item(29323, 80) }, new Item(29299), new Item(451, 6)),
	BOON_OF_INCANDESCENT_ENERGY(95, 230, new Item[] { new Item(29323, 2249) }, new Item(29383), new Item(29322, 1)),
	RUNITE_ORE(96, 232, new Item[] { new Item(29324, 10) }, new Item(12163), new Item(449, 6))
	;
	
	private int levelReq;
	private int exp;
	private Item[] energyReq;
	private Item produceItem;
	private Item extraItem;
	
	private Weaves(int levelReq, int exp, Item[] energyReq, Item produceItem, Item extraItem)
	{
	    this.levelReq = levelReq;
	    this.exp = exp;
	    this.energyReq = energyReq;
	    this.produceItem = produceItem;
	    this.extraItem = extraItem;
	}
	
	public int getLevelReq(){
	    return levelReq;
	}
	public int getXP(){
	    return exp;
	}
	public Item[] getEnergy(){
	    return energyReq;
	}
	
	public Item getProduceItem(){
	    return produceItem;
	}
	
	public Item getExtraItem() {
	    return extraItem;
	}
	
	public static Weaves getWeaveByProduce(int id) {
	    for(Weaves weaves : Weaves.values()) {
		if(weaves.getProduceItem().getId() == id)
		    return weaves;
	    }
	    return null;
	}
	
	public static Weaves getEnergy(int id) {
	    for (Weaves weaves : Weaves.values()) {
		for(Item item : weaves.getEnergy())
		{
		    if(item.getId() == id)
		    return weaves;
		}
	    }
	    return null;
	    
	}

    }
    public Weaves weave;
    public int ticks;
    
    public WeaveAction(Weaves weave, int ticks)
    {
	this.weave = weave;
	this.ticks = ticks;
    }
    


    @Override
    public boolean start(Player player) {
	if(weave == null || player == null)
	{
	    return false;
	}
	if(weave.getEnergy().length > 1) 
	{
	    if(!player.getInventory().containsItem(weave.getEnergy()[0].getId(), weave.getEnergy()[0].getAmount())) {
		player.getPackets().sendGameMessage("You need " + weave.getEnergy()[0].getAmount() + " " + weave.getEnergy()[0].getDefinitions().getName() + "'s to create a " + weave.getProduceItem().getDefinitions().getName() + ".");
		return false;
	    }
	}
	if(player.getSkills().getLevel(Skills.DIVINATION) < weave.getLevelReq())
	{
	    player.sendMessage("You need a Divination level of at least " + weave.getLevelReq() + " to create " + weave.getProduceItem().getDefinitions().getName() + ".");
	    return false;
	}
	if(!player.getInventory().containsItem(weave.getExtraItem().getId(), weave.getExtraItem().getAmount()))
	{
	    return false;
	}
	
	player.sendMessage("You converted your energys into a "+weave.getProduceItem().getDefinitions().getName() + ".");
	return true;
    }

    @Override
    public boolean process(Player player) {
	if(weave == null || player == null)
	{
	    return false;
	}
	if(weave.getEnergy().length > 1) 
	{
	    if(!player.getInventory().containsItem(weave.getEnergy()[0].getId(), weave.getEnergy()[0].getAmount())) {
		player.getPackets().sendGameMessage("You need " + weave.getEnergy()[0].getAmount() + " " + weave.getEnergy()[0].getDefinitions().getName() + "'s to create a " + weave.getProduceItem().getDefinitions().getName() + ".");
		return false;
	    }
	}
	if(player.getSkills().getLevel(Skills.DIVINATION) < weave.getLevelReq())
	{
	    player.sendMessage("You need a Divination level of at least " + weave.getLevelReq() + " to create " + weave.getProduceItem().getDefinitions().getName() + ".");
	    return false;
	}
	return true;
    }
    
    

 
    @Override
    public int processWithDelay(Player player) {
	ticks--;
	int exp = weave.getXP() * 1;
	player.setNextAnimation(new Animation(898));
	player.getSkills().addXp(Skills.DIVINATION, exp);
	for(int i =0; i < weave.getEnergy().length; i++)
	player.getInventory().deleteItem(weave.getEnergy()[i].getId(), weave.getEnergy()[i].getAmount());  
	player.getInventory().deleteItem(weave.getExtraItem().getId(), weave.getExtraItem().getAmount());
	player.getInventory().addItem(weave.getProduceItem().getId(), weave.getProduceItem().getAmount() * 1);
	player.setNextAnimation(new Animation(21251));
	player.setNextGraphics(new Graphics(4250));
	player.sendMessage("You have succesfully created " + weave.getProduceItem().getDefinitions().getName() + ".");
	if (ticks > 0) {
	    return 3;
	}
	return -1;
    }

 
    @Override
    public void stop(Player player) {
	setActionDelay(player, 3);
    }

}
