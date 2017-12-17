package com.rs.cores;

import com.alex.store.Index;
import com.rs.Settings;
import com.rs.cache.Cache;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.cache.loaders.ObjectDefinitions;
import com.rs.game.Region;
import com.rs.game.RegionBuilder;
import com.rs.game.World;

public final class CleanupThread extends Thread {
	
	protected CleanupThread() {
		setPriority(Thread.MAX_PRIORITY);
		setName("Cleanup Thread");
	}

	@Override
	public final void run() {
		try {

			if (Runtime.getRuntime().freeMemory() < Settings.MIN_FREE_MEM_ALLOWED) {
				ItemDefinitions.clearItemsDefinitions();
				NPCDefinitions.clearNPCDefinitions();
				ObjectDefinitions.clearObjectDefinitions();
			}
			skip : for (Region region : World.getRegions().values()) {
				for (int regionId : RegionBuilder.FORCE_LOAD_REGIONS)
					if (regionId == region.getRegionId())
						continue skip;
				// region.unloadMap();
			}
			for (Index index : Cache.STORE.getIndexes())
				index.resetCachedFiles();

			System.gc();

		} catch (Exception e) {//ffs copy this over lol died
			e.printStackTrace();
		}
	
	}

}
