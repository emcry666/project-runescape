package com.rs.tools;

import java.io.IOException;

import com.alex.store.Store;
import com.rs.Settings;

/**
 * @author _jordan <citellumrsps@gmail.com>
 */
public class CacheEditor {

	public static void main(String[] args) throws IOException {
		boolean result;
		Store from = new Store(Settings.CACHE_PATH);
		Store to = new Store(Settings.CACHE_PATH);
		for (int i = 0; i < to.getIndexes().length; i++) {
			if (i == 12 || i == 5) {
				result = to.getIndexes()[i].packIndex(from, true);
				System.out.println("Packed index archive: " + i + ", " + result);
			}
		}
	}

}
