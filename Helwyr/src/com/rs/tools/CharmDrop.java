package com.rs.tools;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

import com.rs.game.npc.Drop;
import com.rs.game.npc.Drop.Rarity;
import com.rs.utils.Logger;
import com.rs.utils.Utils;

public class CharmDrop {

    private final static String PACKED_PATH = "data/npcs/charmDrops.txt";
    private static HashMap<String, int[]> charmDrops;
    final static Charset ENCODING = StandardCharsets.UTF_8;

    public static int[] charmIds = new int[] { 12158, 12159, 12160, 12163 };

    public static int getCharmAmount(String npcName) {
	if (npcName.equals("black dragon") || npcName.equals("giant rock crab") || npcName.equals("glacor")
		|| npcName.equals("steel dragon") || npcName.equals("tormented demon"))
	    return 3;
	else if (npcName.equals("brutal green dragon") || npcName.equals("iron dragon")
		|| npcName.equals("rock lobster") || npcName.equals("skeletal wyvern"))
	    return 2;
	else if (npcName.equals("king black dragon") || npcName.equals("mithril dragon"))
	    return 4;
	else if (npcName.equals("corporeal beast"))
	    return 13;
	else if (npcName.equals("nex"))
	    return 20;
	return 1;
    }

    public static int getCharmType(int[] chances) {
	int goldRate = chances[0];
	int greenRate = chances[1];
	int crimRate = chances[2];
	int blueRate = chances[3];

	ArrayList<Integer> possibleCharms = new ArrayList<Integer>();

	int rand = Utils.random(100);
	if (rand <= (blueRate) && blueRate != 0)
	    possibleCharms.add(3);
	if (rand <= (crimRate) && crimRate != 0)
	    possibleCharms.add(2);
	if (rand <= (greenRate) && greenRate != 0)
	    possibleCharms.add(1);
	if (rand <= (goldRate) && goldRate != 0)
	    possibleCharms.add(0);
	if (possibleCharms.isEmpty())
	    return -1;
	else {
	    Collections.shuffle(possibleCharms);
	    return possibleCharms.get(Utils.random(possibleCharms.size()));
	}
    }

    public static Drop getCharmDrop(String npcName) {

    	int[] chances = charmDrops.get(npcName.toLowerCase().replace(" ", "_"));
    	if (chances == null)
    		return null;
    	int charmIndex = getCharmType(chances);
    	int amount = getCharmAmount(npcName.toLowerCase());

    	if (charmIndex == -1)
    		return null;

    	Drop charm = new Drop(Rarity.COMMON, charmIds[charmIndex], amount, amount);
    	return charm;
    }

    public static void loadCharmDrops() {
	try {
	    charmDrops = new HashMap<String, int[]>();
	    Path path = Paths.get(PACKED_PATH);
	    try (Scanner scanner = new Scanner(path, ENCODING.name())) {
		int lineNumber = 0;

		String npcName = null;
		int[] charmPerc = new int[4];

		while (scanner.hasNextLine()) {
		    String line = scanner.nextLine();
		    lineNumber++;

		    if (line.startsWith("//") || line.isEmpty())
			continue;

		    String[] subs = line.split(":");
		    String[] info = subs[1].split("-");

		    npcName = subs[0];
		    charmPerc[0] = Integer.parseInt(info[0]);
		    charmPerc[1] = Integer.parseInt(info[1]);
		    charmPerc[2] = Integer.parseInt(info[2]);
		    charmPerc[3] = Integer.parseInt(info[3]);

		    charmDrops.put(npcName, new int[] { charmPerc[0], charmPerc[1], charmPerc[2], charmPerc[3] });
		}
		System.out.println("Parsed " + lineNumber + " lines of NPC charm drops.");

	    }
	} catch (Throwable e) {
	    Logger.handle(e);
	}
    }

}