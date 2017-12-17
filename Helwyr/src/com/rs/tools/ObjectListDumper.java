package com.rs.tools;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.rs.cache.Cache;
import com.rs.cache.loaders.ObjectDefinitions;
import com.rs.utils.Utils;

public class ObjectListDumper {

	public static void main(String[] args) throws IOException {
		Cache.init();
		File file = new File("./data/objectlist.txt");
		if (file.exists())
		    file.delete();
		else {
		    file.createNewFile();
		    System.out.println("Creating New File");
		}
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		for (int id = 0; id < Utils.getObjectDefinitionsSize(); id++) {
		    ObjectDefinitions def = ObjectDefinitions.getObjectDefinitions(id);
		    // writer.append(id + " - " + def.name);
		    writer.write(id + " - " + def.name);
		    System.out.println("WritingId" + id + " - " + def.name);
		    writer.newLine();
		    writer.flush();
		}
		System.out.println("Done.");
		writer.close();
	    }

}
