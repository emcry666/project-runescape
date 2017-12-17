//package com.rs.game.player.dialogues.impl.home;
//
//import com.rs.game.WorldTile;
//import com.rs.game.player.content.Magic;
//import com.rs.game.player.dialogues.Dialogue;

/**
 * 
 * @author Life
 * July 20, 2016
 */
/*public class CityTeleporter extends Dialogue {
	private int npcId;

	@Override
	public void start() {
		npcId = (Integer) parameters[0];//995
		sendNPCDialogue(npcId, 9830, "Hello, I can teleport you to cities around Vernox."
				+ "<br>Would you like to?");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (stage == -1)
		{
			sendOptionsDialogue("Would you like to?", "Yes, I would like to travel to a city", "No thanks, I'm not interested");
			stage = 1;
		}
		else if(stage == 1)
		{
			if(componentId== OPTION_1)
			{
				sendOptionsDialogue("Where would you like to go?", "Lumbridge", "Edgeville", "Varrock", "Falador", "Next Page");
				stage = 2;
			}
			else if (componentId == OPTION_2)
			{
				player.closeInterfaces();
				end();
			}
		}
		else if (stage == 2)
		{
			if (componentId == OPTION_1)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(3222, 3219, 0)); //lumbridge
			}
			if (componentId == OPTION_2)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(3222, 3219, 0)); //Edgeville
			}
			if (componentId == OPTION_3)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(3222, 3219, 0)); //Varrock
			}
			if (componentId == OPTION_4)
			{
				Magic.sendLunarTeleportSpell(player, 0, 0.0D, new WorldTile(3222, 3219, 0)); //Falador
			}
			if (componentId == OPTION_5)
			{
				sendOptionsDialogue("Where would you like to go?", ", "Next Page");
				stage = 2;
			}
		}
	}
	@Override
	public void finish() {
		// TODO Auto-generated method stub

	}

}
*/