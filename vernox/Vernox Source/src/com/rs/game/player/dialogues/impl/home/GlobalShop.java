package com.rs.game.player.dialogues.impl.home;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

/**
 * 
 * @author Dylan Doldersum || Mystic Wolf
 * Apr 1, 2016
 */
public class GlobalShop extends Dialogue {

    @Override
    public void start() {
	sendEntityDialogue(IS_NPC, "Shop Manager", 13930, 9827, "Hello, im Ariane <br> The shop manager of Vernox.");
	
    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1)
	{
	    sendOptionsDialogue("Open a shop", "Melee category", "Magic category", "Ranged category", "General Store", "Next Page");
	    stage = 1;
	}
	else if (stage == 1)
	{
	    if(componentId == OPTION_1)
	    {
		sendOptionsDialogue("Melee category", "Melee weapons", "Melee armour");
		stage = 2;
	    }
	    else if (componentId == OPTION_2)
	    {
		sendOptionsDialogue("Magic category", "Magic runes", "Magic armour");
		stage = 3;
	    }
	    else if (componentId == OPTION_3)
	    {
		sendOptionsDialogue("Ranged category", "Ranged armour", "Ranged weapons");
		stage = 5;

	    }
	    else if (componentId == OPTION_4)
	    {
		ShopsHandler.openShop(player, 1);
		end();
	    }
	    else if (componentId == OPTION_5)
	    {
		sendOptionsDialogue("Open a shop", "Skilling supplies", "Skillcapes");
		stage = 6;
	    }
	}
	else if (stage == 2)
	{
	    if (componentId == OPTION_1)
	    {
		ShopsHandler.openShop(player, 1202);
		end();
	    }
	    else if (componentId == OPTION_2)
	    {
		ShopsHandler.openShop(player, 1205);
		end();
	    }
	}
	else if (stage == 3)
	{
	    if (componentId == OPTION_1)
	    {
		ShopsHandler.openShop(player, 1210);
		end();
	    }
	    else if (componentId == OPTION_2)
	    {
		ShopsHandler.openShop(player, 1208);
		end();
	    }
	}
	else if (stage == 5)
	{
	    if (componentId == OPTION_1)
	    {
		ShopsHandler.openShop(player, 1207);
		end();
	    }
	    else if (componentId == OPTION_2)
	    {
		ShopsHandler.openShop(player, 1203);
		end();
	    }
	}
	else if (stage == 6)
	{
	    if (componentId == OPTION_1)
	    {
		sendOptionsDialogue("Skilling supplies", "Skilling supplies 1", "Skilling supplies 2", "Herblore Ingredients 1", "Herblore Ingredients 2", "Next Page");
		stage =7;
	    }
	    else if (componentId == OPTION_2)
	    {
		sendOptionsDialogue("Capes", "Skill capes", "Master capes");
		stage = 8;
	    }
	}
	else if (stage == 7)
	{
	    if (componentId == OPTION_1)
	    {
		ShopsHandler.openShop(player, 1216);
		end();
	    }
	    else if (componentId == OPTION_2)
	    {
		ShopsHandler.openShop(player, 1217);
		end();
	    }
	    else if (componentId == OPTION_3)
	    {
		ShopsHandler.openShop(player, 1218);
		end();
	    }
	    else if (componentId == OPTION_4)
	    {
		ShopsHandler.openShop(player, 1219);
		end();
	    }
	    else if (componentId == OPTION_5)
	    {
		sendOptionsDialogue("Skilling supplies", "Hunter Tools", "Summoning Shop", "Construction Shop");
		stage = 9;
	    }
	}
	else if (stage == 8)
	{
	    if (componentId == OPTION_1)
	    {
		ShopsHandler.openShop(player, 1213);
		end();
	    }
	    else if (componentId == OPTION_2)
	    {
		ShopsHandler.openShop(player, 4931);
		end();
	    }
	}
	 else if (stage == 9)
	    {
	     if (componentId == OPTION_1)
	     {
		ShopsHandler.openShop(player, 22);//hunter
		end();
	    }
	     else if (componentId == OPTION_2)
	     {
		 sendOptionsDialogue("Summoning", "Beginner Summoning", "Intermediate Summoning", "Expert Summoning");
		 stage = 10;
	     }
	     if (componentId == OPTION_3)
	     {
		ShopsHandler.openShop(player, 504);//construction
		end();
	    }
	    }
	 else if (stage == 10)
	 {
	     if (componentId == OPTION_1)
	     {
		 ShopsHandler.openShop(player, 39);//begsummoning shop
		 end();
	     }
	     else if (componentId == OPTION_2)
	     {
		 ShopsHandler.openShop(player, 502);//summoning shop
		 end();
	     }
	     else if (componentId == OPTION_3)
	     {
		 ShopsHandler.openShop(player, 503);//summoning shop
		 end();
	     }
	 }

    }

    @Override
    public void finish() {
	// TODO Auto-generated method stub
	
    }
    
}
