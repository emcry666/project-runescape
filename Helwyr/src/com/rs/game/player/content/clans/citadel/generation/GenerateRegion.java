package com.rs.game.player.content.clans.citadel.generation;

import com.rs.game.RegionBuilder;
import com.rs.game.player.content.clans.citadel.ClanCitadel;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Logger;
import com.rs.utils.Utils;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public class GenerateRegion implements CitadelGenerate {

	private ClanCitadel citadel;
	private GenerationType type;
	public int[] area;
	public int[] ratio;

	/**
	 * Creates Region
	 * @param type
	 * @param area
	 * @param boundChuncks
	 * @param ratio
	 */
	public GenerateRegion(ClanCitadel citadel, GenerationType type, int[] area, int[] ratio) {
		this.citadel = citadel;
		this.area = area;
		this.type = type;
		this.ratio = ratio;
	}

	@SuppressWarnings("incomplete-switch")
	public GenerateRegion(ClanCitadel citadel, GenerationType type, int[] area) {
		this.citadel = citadel;
		this.area = area;
		this.type = type;
		switch(type) {
		case F_SKILL_PLOT:
		case SKILL_PLOT:
			this.ratio = new int[] {1, 2};
			break;
		}
	}

	/**
	 * Destroys Region 
	 * @param boundChuncks
	 * @param ratio
	 */
	public GenerateRegion(ClanCitadel citadel, int[] ratio) {
		this.citadel = citadel;
		this.ratio = ratio;
	}


	@Override
	public void generateRegion() {
		WorldTasksManager.schedule(new WorldTask() {
			@SuppressWarnings("incomplete-switch")
			@Override
			public void run() {
				citadel.boundChuncks = RegionBuilder.findEmptyChunkBound(ratio[0], ratio[1]);
				if(citadel.boundChuncks == null)
					return;
				switch(type) {
				case CITADEL:
					RegionBuilder.copyAllPlanesMap(area[0], area[1], citadel.boundChuncks[0], citadel.boundChuncks[1], ratio[0], ratio[1]);
					break;
				}
				Logger.log(GenerateRegion.class.getName(), "Generated Dynamic Region Size: [" + ratio[0] + ", " + ratio[1] + "]; Type: [" + Utils.formatString(type.toString()) + "];");
			}

		}, 2);
	}

	@Override
	public void generatePlot(int[] areaRatio) {
		WorldTasksManager.schedule(new WorldTask() {
			@SuppressWarnings("incomplete-switch")
			@Override
			public void run() {
				if(citadel.boundChuncks == null)
					return;
				switch(type) {
				case F_SKILL_PLOT:
					RegionBuilder.copyAllPlanesMap(area[0], area[1], citadel.boundChuncks[0] * areaRatio[0] + areaRatio[1], citadel.boundChuncks[1] * areaRatio[2] + areaRatio[3], ratio[0], ratio[1]);
					break;
				case SKILL_PLOT:
					RegionBuilder.copyMap(area[0], area[1], citadel.boundChuncks[0] * areaRatio[0] + areaRatio[1], citadel.boundChuncks[1] * areaRatio[2] + areaRatio[3], ratio[0], ratio[1], new int[1], new int[1]);
					break;
				}
				Logger.log(GenerateRegion.class.getName(), "Generated Dynamic Region Size: [" + ratio[0] + ", " + ratio[1] + "]; Type: [" + Utils.formatString(type.toString()) + "];");
			}

		}, 2);
	}

	@Override
	public void destoryRegion() {
		WorldTasksManager.schedule(new WorldTask() {
			@Override
			public void run() {
				if(citadel == null || citadel.boundChuncks == null)
					return;
				RegionBuilder.destroyMap(citadel.boundChuncks[0], citadel.boundChuncks[1], ratio[0], ratio[1]);
				System.out.println("Destroyed Map Region Width:[" + ratio[0] + "] - Height:[" + ratio[1] + "];");
			}

		}, 4);
	}

	public ClanCitadel getCitadel() {
		return citadel;
	}

	public void setCitadel(ClanCitadel citadel) {
		this.citadel = citadel;
	}

}
