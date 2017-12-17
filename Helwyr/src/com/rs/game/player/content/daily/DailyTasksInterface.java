package com.rs.game.player.content.daily;

//import java.io.Serializable;

import com.rs.cache.loaders.ClientScriptMap;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.dialogues.Dialogue;

public class DailyTasksInterface {// implements Serializable {
    //private static final long serialVersionUID = -2364603321576563956L;
	private static final int[] DIALOGUE_INTERFACE_C2S = new int[] { 
		Skills.ATTACK, 
		Skills.MAGIC, 
		Skills.MINING,
		Skills.WOODCUTTING, 
		Skills.AGILITY, 
		Skills.FLETCHING, 
		Skills.THIEVING, 
		Skills.STRENGTH, 
		Skills.RANGE, 
		Skills.SMITHING, 
		Skills.FIREMAKING, 
		Skills.HERBLORE, 
		Skills.SLAYER, 
		Skills.CONSTRUCTION, 
		Skills.DEFENCE, 
		Skills.PRAYER, 
		Skills.FISHING, 
		Skills.CRAFTING, 
		Skills.FARMING, 
		Skills.HUNTER, 
		Skills.SUMMONING, 
		Skills.HITPOINTS, 
		Skills.DUNGEONEERING, 
		Skills.COOKING, 
		Skills.RUNECRAFTING 
		};
    
    public static void openTaskDialogue(Player player){//, final int slot, final int id) {
	player.getDialogueManager().startDialogue(new Dialogue() {
	    private int selectedSkill = -1;
	    
	    @Override
	    public void start() {
	    player.getPackets().sendConfig(738, 1);//0
		player.getInterfaceManager().sendInterface(1263);
		player.getPackets().sendGlobalString(358, "Which skill would you like to toggle?");
		sendSelectedSkill();
		player.getPackets().sendGlobalConfig(1797, 0); // selectable lamps don't show xp
		player.getPackets().sendGlobalConfig(1798, 1); // minimum level of 1 to show 
		//player.getPackets().sendGlobalConfig(1799, id);
		
		for (int i = 13; i < 38; i++)
		    player.getPackets().sendUnlockIComponentOptionSlots(1263, i, -1, 0, 0);
		
	    }

	    @Override
	    public void run(int interfaceId, int componentId) {	
	    	if (componentId >= 13 && componentId <= 37) {
	    		int skill = DIALOGUE_INTERFACE_C2S[componentId - 13];
	    		selectedSkill = skill;
	    		sendSelectedSkill();
	    		player.getPackets().sendUnlockIComponentOptionSlots(1263, 43, -1, 0, true, 0); // not the right way but eh
	    	} else if (componentId == 43 && selectedSkill != -1) {
	    		if (player.getSkills().getLevelForXp(selectedSkill) < 99) {
	    			player.sm("You must have atleast level 99 in a skill to toggle it.");
	    			start();
	    			return;
	    		}
	    		if (selectedSkill == Skills.CONSTRUCTION || selectedSkill == Skills.RUNECRAFTING || selectedSkill == Skills.SLAYER 
	    		|| selectedSkill == Skills.SUMMONING || selectedSkill == Skills.ATTACK || selectedSkill == Skills.DEFENCE 
	    		|| selectedSkill == Skills.STRENGTH || selectedSkill == Skills.RANGE || selectedSkill == Skills.MAGIC 
	    		|| selectedSkill == Skills.PRAYER || selectedSkill == Skills.HITPOINTS || selectedSkill == Skills.DUNGEONEERING) {
	    			player.sm("This skill has no daily tasks attributed to it and therefore cannot be toggled.");
	    			start();
	    			return;
	    		}
	    		if (player.toggledAmount >= 10 && player.settings[selectedSkill]) {
	    			player.sm("You can only filter a maximum of 10 skills.");
	    			player.getPackets().sendGameMessage("The skills that you currently have blocked are: "+getBlockedSkills(), true);
	    			start();
	    			return;
	    		}
				player.settings[selectedSkill] = !player.settings[selectedSkill];
				player.sm("You have toggled "+Skills.SKILL_NAME[selectedSkill].toLowerCase()+" tasks "+(player.settings[selectedSkill] ? "on" : "off")+".");
				if (!player.settings[selectedSkill])
					player.toggledAmount++;
				else
					player.toggledAmount--;
				start();
			} else if (componentId == 44 || componentId == 7) {
				end();
			}
	    }

	    @Override
	    public void finish() {
		if (player.getInterfaceManager().containsScreenInter())
		    player.getInterfaceManager().closeScreenInterface();
	    }
	    
	    private String getBlockedSkills() {
	    	String xyz = "";
	    	int x = 0;
			for (int i = 0; i < 24; i++) {
				if (player.settings[i])
					continue;
				x++;
				if (x < 9)
					xyz += Skills.SKILL_NAME[i]+", ";
				else if (x == 9)
					xyz += Skills.SKILL_NAME[i]+" and ";
				else if (x == 10)
					xyz += Skills.SKILL_NAME[i]+".";
			}
			return xyz.toLowerCase();
	    }
	    
	    private void sendSelectedSkill() {
		ClientScriptMap map = ClientScriptMap.getMap(681);
		if (selectedSkill == map.getDefaultIntValue()) {
		    player.getPackets().sendGlobalConfig(1796, map.getDefaultIntValue());
		    return;
		}

		long key = map.getKeyForValue(selectedSkill);
		player.getPackets().sendGlobalConfig(1796, (int)key);
	    }
	    
	});

    }
}