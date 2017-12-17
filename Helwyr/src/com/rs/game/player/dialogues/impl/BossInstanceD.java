package com.rs.game.player.dialogues.impl;

import com.rs.game.player.content.instancing.bossInstance.BossInstance;
import com.rs.game.player.content.instancing.bossInstance.BossInstanceHandler;
import com.rs.game.player.content.instancing.bossInstance.BossInstanceHandler.Boss;
import com.rs.game.player.content.instancing.bossInstance.InstanceSettings;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.Utils;

public class BossInstanceD extends Dialogue {

	private Boss boss;
	
	@Override
	public void start() {
		boss = (Boss) parameters[0];
		if(boss.hasPublicVersion()) 
			sendOptionsDialogue("Select an Option", "Enter an encounter", "Start/Join custom encounter");
		else {
			sendCustomEncounter();
		}
			
	}
	
	private void sendCustomEncounter() {
		stage = 0;
		sendOptionsDialogue("Select an Option", "Start", "Join", "Rejoin");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch (stage) {
		case -1:
			switch(componentId) {
				case OPTION_1:
					BossInstanceHandler.joinInstance(player, boss, "", false);
					close();
					break;
				default:
					sendCustomEncounter();
					break;
			}
			break;
		case 0:
			switch(componentId) {
				case OPTION_1:
					stage = 1;
					player.setLastBossInstanceSettings(new InstanceSettings(boss)); //the settings
					sendOptionsDialogue("Enable practise mode?", "Yes.", "No.");
					break;
				case OPTION_2:
					close();
					player.getTemporaryAttributtes().put("JOIN_BOSS_INSTANCE", boss);
					player.getPackets().sendInputNameScript("Enter the name of a player in a battle you wish to join.");
					break;
				default:
					String key = player.getLastBossInstanceKey();
					if(key == null) {
						stage = -2;
						sendDialogue("You do not have a battle to rejoin.");
						return;
					}
					if(BossInstanceHandler.findInstance(boss, key) == null) {
						
						if(key.equals(player.getUsername()) && player.getLastBossInstanceSettings() != null && player.getLastBossInstanceSettings().getBoss() == boss && player.getLastBossInstanceSettings().hasTimeRemaining()) {
							close();
							BossInstanceHandler.createInstance(player, player.getLastBossInstanceSettings());
							return;
						}
						
						stage = -2;
						sendDialogue("You do not have a battle to rejoin.");
						return;
					}
					close();
					BossInstanceHandler.joinInstance(player, boss, key, false);
					break;
			}
			break;
		case 1:
			if(player.getLastBossInstanceSettings() == null) {
				close();
				return;
			}
			player.getLastBossInstanceSettings().setPractiseMode(componentId == OPTION_1);
			if(boss.isHasHM()) {
				stage = 2;
				sendOptionsDialogue("Enable hard mode?", "Yes.", "No.");
			}else
				sendSelectMaxPlayers();
			break;
		case 2:
			if(player.getLastBossInstanceSettings() == null) {
				close();
				return;
			}
			player.getLastBossInstanceSettings().setHardMode(componentId == OPTION_1);
			sendSelectMaxPlayers();
			break;
		default:
			close();
			break;
		}

	}
	
	public void sendSelectMaxPlayers() {
		close();
		InstanceSettings settings = player.getLastBossInstanceSettings();
		if(settings == null) 
			return;
		settings.setMaxPlayers(settings.getBoss().getMaxPlayers());
		settings.setMinCombat(1);
		settings.setSpawnSpeed(BossInstance.FASTEST);
		settings.setProtection(BossInstance.FFA);
		startInstance();
		
	//	player.getTemporaryAttributtes().put(Key.JOIN_BOSS_INSTANCE, boss);
	//	player.getPackets().sendInputNameScript("Enter the minimum combat level.");
		
	}
	
	public void startInstance() {
		InstanceSettings settings = player.getLastBossInstanceSettings();
		if(settings == null) 
			return;
		int initialCost = settings.getBoss().getInitialCost();
		if(player.getMoneyPouch().getCoinsAmount() < initialCost) {
			player.getPackets().sendGameMessage("You don't have enough coins to start this battle.");
			player.setLastBossInstanceSettings(null);
			return;
		}
		if(initialCost > 0)
			player.getMoneyPouch().removeFromMoneyPouch(initialCost);
		settings.setCreationTime(Utils.currentTimeMillis());
		BossInstanceHandler.createInstance(player, settings);
	}

	@Override
	public void finish() {
		// TODO Auto-generated method stub

	}

}
