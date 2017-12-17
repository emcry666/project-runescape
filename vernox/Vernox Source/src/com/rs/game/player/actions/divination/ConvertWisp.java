package com.rs.game.player.actions.divination;

import com.rs.game.WorldObject;
import com.rs.game.player.Player;

public class ConvertWisp {

    public static void handleOption2(Player player, WorldObject object)
    {
	if (object.getId() == 87306){
	    if(player.getInventory().containsItem(29384, 1)){
		final int memId = 29384;
		HarvestWisp.converytoenergy(player, memId, 29313, 1);
	    }
	    if(player.getInventory().containsItem(29385, 1)){
		final int memId = 29385;
		HarvestWisp.converytoenergy(player, memId, 29190, 1);
	    }
	    if(player.getInventory().containsItem(29386, 1)){
		final int memId = 29386;
		HarvestWisp.converytoenergy(player, memId, 29315, 1);
	    }
	    if(player.getInventory().containsItem(29387, 1)){
		final int memId = 29387;
		HarvestWisp.converytoenergy(player, memId, 29316, 1);
	    }
	    if(player.getInventory().containsItem(29388, 1)){
		final int memId = 29388;
		HarvestWisp.converytoenergy(player, memId, 29193, 1);
	    }
	    if(player.getInventory().containsItem(29389, 1)){
		final int memId = 29389;
		HarvestWisp.converytoenergy(player, memId, 29194, 1);
	    }
	    if(player.getInventory().containsItem(29390, 1)){
		final int memId = 29390;
		HarvestWisp.converytoenergy(player, memId, 29195, 1);
	    }
	    if(player.getInventory().containsItem(29391, 1)){
		final int memId = 29391;
		HarvestWisp.converytoenergy(player, memId, 29196, 1);
	    }
	    if(player.getInventory().containsItem(31326, 1)){
		final int memId = 31326;
		HarvestWisp.converytoenergy(player, memId, 31312, 1);
	    }
	    if(player.getInventory().containsItem(29392, 1)){
		final int memId = 29392;
		HarvestWisp.converytoenergy(player, memId, 29197, 1);
	    }
	    if(player.getInventory().containsItem(29393, 1)){
		final int memId = 29393;
		HarvestWisp.converytoenergy(player, memId, 29198, 1);
	    }
	    if(player.getInventory().containsItem(29394, 1)){
		final int memId = 29394;
		HarvestWisp.converytoenergy(player, memId, 29323, 1);
	    }
	    if(player.getInventory().containsItem(29395, 1)){
		final int memId = 29395;
		HarvestWisp.converytoenergy(player, memId, 29324, 1);
	    }
	}
    }

    public static void handleOption3 (Player player, WorldObject object)
    {
	if (object.getId() == 87306){
	    if(player.getInventory().containsItem(29384, 1)){
		final int memId = 29384;
		HarvestWisp.convertexp(player, memId, 3);
	    }
	    if(player.getInventory().containsItem(29385, 1)){
		final int memId = 29385;
		HarvestWisp.convertexp(player, memId, 3);
	    }
	    if(player.getInventory().containsItem(29386, 1)){
		final int memId = 29386;
		HarvestWisp.convertexp(player, memId, 3);
	    }
	    if(player.getInventory().containsItem(29387, 1)){
		final int memId = 29387;
		HarvestWisp.convertexp(player, memId, 5);
	    }
	    if(player.getInventory().containsItem(29388, 1)){
		final int memId = 29388;
		HarvestWisp.convertexp(player, memId, 6);
	    }
	    if(player.getInventory().containsItem(29389, 1)){
		final int memId = 29389;
		HarvestWisp.convertexp(player, memId, 8);
	    }
	    if(player.getInventory().containsItem(29390, 1)){
		final int memId = 29390;
		HarvestWisp.convertexp(player, memId, 10);
	    }
	    if(player.getInventory().containsItem(29391, 1)){
		final int memId = 29391;
		HarvestWisp.convertexp(player, memId, 12);
	    }
	    if(player.getInventory().containsItem(31326, 1)){
		final int memId = 31326;
		HarvestWisp.convertexp(player, memId, 14);
	    }
	    if(player.getInventory().containsItem(29392, 1)){
		final int memId = 29392;
		HarvestWisp.convertexp(player, memId, 16);
	    }
	    if(player.getInventory().containsItem(29393, 1)){
		final int memId = 29393;
		HarvestWisp.convertexp(player, memId, 18);
	    }
	    if(player.getInventory().containsItem(29394, 1)){
		final int memId = 29394;
		HarvestWisp.convertexp(player, memId, 22);
	    }
	    if(player.getInventory().containsItem(29395, 2)){
		final int memId = 29395;
		HarvestWisp.convertexp(player, memId, 24);
	    }				
	}


    }
    public static void handleOption4(Player player, WorldObject object)
    {

    }
}
