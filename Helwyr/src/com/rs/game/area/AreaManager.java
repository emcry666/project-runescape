package com.rs.game.area;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.rs.engine.GameEngine;
import com.rs.game.WorldTile;
//import com.rs.game.minigames.bounty.BountyHunterArea;
//import com.rs.game.minigames.bounty.Edgeville;
import com.rs.game.player.Player;

public class AreaManager {

	private static List<Area> areas;

	public static void init() {
		try {
			areas = new ArrayList<Area>();
			//areas().add(new BountyHunterArea());
			//areas().add(new Edgeville());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Area get(final WorldTile location) {
		try {
			Area current = null;
			boolean found = false;
			for (Area area : areas()) {

				for (Shape shape : area.shapes()) {
					if (shape.inside(location)) {
						current = area;
						found = true;
						break;
					}
					break;
				}
				if (!found)
					continue;
				return current;
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		return null;
	}

	public static void update(final Player player, final Area area) {
		System.out.println("Updating region, moving player to : " + area.name());
		player.getPackets().sendIComponentText(1073, 10, "<col=ffffff>You have reached");
		player.getPackets().sendIComponentText(1073, 11, "<col=ffcff00>" + area.name());
		player.getInterfaceManager().sendTab(player.getInterfaceManager().hasRezizableScreen() ? 1 : 11, 1073);
		GameEngine.getEngine().getScheduledExecutor().scheduleWithFixedDelay(new Runnable() {

			@Override
			public void run() {
				player.getPackets().closeInterface(player.getInterfaceManager().hasRezizableScreen() ? 1 : 11);
			}
			
		}, 2, 2, TimeUnit.SECONDS);
	}

	public static List<Area> areas() {
		return areas;
	}

	public static void areas(List<Area> list) {
		areas = list;
	}

}

