package com.rs.game.player.content.misc;

import com.rs.game.World;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

public class AchievementTab {
	
	private static String rankString = null;
	private static String slayerUpdate = null;
	
	private static String getCurrentEvent() {
		// TODO Auto-generated method stub
		return null;
	}

	private static String getCurrentEventLocation() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void slayerUpdate(Player player) {
		if (player.getSlayerManager().getCurrentTask() == null) {
			slayerUpdate = "None";
		} else {
			slayerUpdate = "" + player.getSlayerManager().getCount() + " " + player.getSlayerManager().getCurrentTask().getName().toLowerCase() + "";
		}
	}

	public static void sendRank(Player player) {

		if (player.isMythicDonator())
			rankString = "<img=16>";
		
		else if (player.isUltimateDonator())
			rankString = "<img=14>";
		
		else if (player.isLegendDonator())
			rankString = "<img=11>";
		
		else if (player.isExtremeDonator())
			rankString = "<img=9>";
		
		else if (player.isSuperDonator())
			rankString = "<img=10>";

		else if (player.isDonator())
			rankString = "<img=8>";

		else
			rankString = "None";
	}
	
public static void sendTab(final Player player) {
		
		WorldTasksManager.schedule(new WorldTask() {
			public void run() {
				int minutes = (int) ((player.getTimeOnline() / (1000 * 60)) % 60);
				int hours = (int) ((player.getTimeOnline() / (1000 * 60 * 60)) % 24);
				long days = player.getTimeOnline() / (24 * 60 * 60 * 1000);
				sendRank(player);
				slayerUpdate(player);
				player.getPackets().sendIComponentText(930, 10, "<col=FFA500>Time Online:</col> " + "<col=FFFFFF>" + days + "</col> <col=FFA500>D, </col> <col=FFFFFF>" + hours + "</col> <col=FFA500>H, </col> <col=FFFFFF>" + minutes + "</col> <col=FFA500>M</col>" + " </col><br>");
				player.getPackets().sendIComponentText(930, 16,
					"<col=FFA500>helwyr.com Noticeboard</col><br><br>" +
					"<col=FFA500>-- Server Info. --</col><br>" +
					"<col=FFA500>Players Online:</col><col=FFFFFF> [ </col><col=00FF00>" + World.getPlayers().size() +"</col><col=FFFFFF> ]</col><br>" +
					"<col=FFA500>Staff Online:</col><br>" +
					"<col=FFA500>Wilderness:<col=FFFFFF> [ </col><col=00FF00>0</col><col=FFFFFF> ]</col><br>" +
					"<col=FFA500>EXP Event:</col><br> " +
					"<col=FFA500>Star Location:</col><br> " +
					"<col=FFA500>Evil Tree Location:</col><br><br> " +
					
					"<col=FFA500>-- Player Info. --</col><br>" +
					"<col=FFA500>Name: " + player.getDisplayName() + "</col><br>" +
					"<col=FFA500>Subscription:</col><col=FFFFFF> [ </col>" + rankString + "<col=FFFFFF> ]</col><br>" +
					"<col=FFA500>Donated Amount:</col><col=FFFFFF> [ </col><col=00FF00>" + player.donatorcredits + "</col><col=FFFFFF> ]</col><br>" +
					"<col=FFA500>PvP Points:</col><col=FFFFFF> [ </col><col=00FF00>" + player.getPkPoints() + "</col><col=FFFFFF> ]</col><br>" +
					"<col=FFA500>Trivia Points:</col><col=FFFFFF> [ </col><col=00FF00>" + player.getTriviaPoints() +"</col><col=FFFFFF> ]</col><br><br>" +
					"<col=FFA500>Slayer Task:</col> <col=FF0000>" + slayerUpdate + "</col><br>" + "" +
					"<col=FFA500>Slayer Points:</col><col=FFFFFF> [ </col><col=00FF00>0</col><col=FFFFFF> ]</col><br>");
			}
		}, 0, 5);
	}
}
