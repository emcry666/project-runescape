package com.rs.game.player.dialogues.impl;

import com.rs.cache.loaders.NPCDefinitions;
import com.rs.game.Animation;
import com.rs.game.ForceTalk;
import com.rs.game.Graphics;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.player.content.Magic;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

public class PrestigeOne extends Dialogue {

        private int npcId = 13333;

        @Override
        public void start() {
                sendEntityDialogue(SEND_2_TEXT_CHAT,
                                new String[] { NPCDefinitions.getNPCDefinitions(npcId).name,
                                                "Hello "+player.getDisplayName()+" Would you like to learn about the Prestige system?"}, IS_NPC, npcId, 9827);
        }
        
        @Override
        public void run(int interfaceId, int componentId) {
                if (stage == -1) {
                        sendOptionsDialogue("Choose an option", "Yes", "No.", "I'd like to check my Prestige tokens please.", "I would like to recieve my prestige title please.", "Nevermind.");
                        stage = 1;
                } else if (stage == 1) {
                        if (componentId == OPTION_1) {
                        	sendNPCDialogue(npcId, 9827, "The prestige system allows you to reset your combat experience in exchange for a prestige level when you reach 200M in all your combat skills. (Not summoning and prayer)");
                                stage = 2;
                                }
                        else if (componentId == OPTION_2) {
                                close();
                                }
                        else if (componentId == OPTION_3) {
                        	player.getPackets().sendGameMessage("You currently have: "+player.prestigeTokens+" prestige tokens.");
                        	//player.setNextForceTalk(new ForceTalk("I currently have: "+player.prestigeTokens+" prestige tokens."));
                            close();
                            }
                        else if (componentId == OPTION_4) {
            				if (player.prestigeTokens == 1) {
            					player.getAppearence().setTitle(676);
            				} else if (player.prestigeTokens == 2) {
            					player.getAppearence().setTitle(6575);
            				} else if (player.prestigeTokens == 3) {
            					player.getAppearence().setTitle(1657);
            				} else if (player.prestigeTokens == 4) {
            					player.getAppearence().setTitle(345);
            				} else if (player.prestigeTokens == 5) {
            					player.getAppearence().setTitle(999);
            				} else {
            					player.getPackets().sendGameMessage("You need to have prestiged to use this command.");
            				}
                            close();
                            }
                        else if (componentId == OPTION_5) {
                        	//player.prestigeShops();
                            close();
                            }
                } else if (stage == 2) {
                	sendPlayerDialogue(9827, "Wow sounds amazing!");
                	stage = 3;
                } else if (stage == 3) {
                	sendNPCDialogue(npcId, 9827, "Prestiging requires 200M in all combat stats except for Summoning and Prayer.");
                	stage = 4;
                } else if (stage == 4) { 
        			sendOptionsDialogue("Would you like to prestige?", "Yes", "No");
                	stage = 5;
                } else if (stage == 5) { 
        			if (componentId == OPTION_1)
        				player.prestige();
        			if(!player.isPrestige1()) {
        				player.getPackets().sendGameMessage("You need 200M exp in Attack, Strength, Defence, Hitpoints, Range and Magic to prestige!");
        			}
        			else if (player.isPrestige1()) {
        				if (player.prestigeTokens == 0) {
        				player.setCompletedPrestigeOne();
        				}
        				else if (player.prestigeTokens == 5) {
        					player.nothing();
        				} else {
        					player.setCompletedPrestige2();
        				}
        			}
        			else if (componentId == OPTION_2) {
                    	close();
                    }
                close();
                }
            }


        @Override
        public void finish() {

        }
}