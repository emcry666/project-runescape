package com.rs.game.player;

import java.io.Serializable;
import java.util.List;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.item.ItemsContainer;
import com.rs.utils.ItemExamines;
import com.rs.utils.Utils;

public final class Inventory implements Serializable {

	private static final long serialVersionUID = 8842800123753277093L;

	private ItemsContainer<Item> items;

	private transient Player player;

	public static final int INVENTORY_INTERFACE = 679;

	public Inventory() {
		items = new ItemsContainer<Item>(28, false);
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public void init() {
		player.getPackets().sendItems(93, items);
	}

	public void unlockInventoryOptions() {
		player.getPackets().sendIComponentSettings(INVENTORY_INTERFACE, 0, 0,
				27, 4554126);
		player.getPackets().sendIComponentSettings(INVENTORY_INTERFACE, 0, 28,
				55, 2097152);
	}

	public void reset() {
		items.reset();
		init(); // as all slots reseted better just send all again
	}

	public void refresh(int... slots) {
		player.getPackets().sendUpdateItems(93, items, slots);
	}

	public boolean hasEnoughCoins(int amount) {
		if(containsItem(995, amount))
			return true;
		if(player.getMoneyPouch().getCoinsAmount() >= amount)
			return true;
		return false;
	}

	public boolean checkMoneyAndRemove(int amount) {
		if(player.getMoneyPouch().getCoinsAmount() >= amount) {
			player.getMoneyPouch().removeFromMoneyPouch(amount);
			return true;
		}
		if(containsItem(995, amount)) {
			deleteItem(995, amount);
			return true;
		}
		return false;
	}

	public boolean addItem(int itemId, int amount) {
		ItemDefinitions defs = new ItemDefinitions(itemId);
		if(!player.getInventory().hasFreeSlots() && (!(player.getInventory().getAmountOf(itemId) > 0)) && !defs.isStackable()) {
			player.getPackets().sendGameMessage("You do not have enough space in your inventory.");
			return false;
		} else if(!player.getInventory().hasFreeSlots()) {
			player.getPackets().sendGameMessage(
					"You do not have enough space in your inventory.");
			return false;
		}
		if (itemId < 0 || amount < 0|| !Utils.itemExists(itemId) || !player.getControlerManager().canAddInventoryItem(itemId, amount))
			return false;
		Item[] itemsBefore = items.getItemsCopy();
		if (!items.add(new Item(itemId, amount))) {
			items.add(new Item(itemId, items.getFreeSlots()));
			player.getPackets().sendGameMessage(
					"You do not have enough space in your inventory.");
			refreshItems(itemsBefore);
			return false;
		}
		refreshItems(itemsBefore);
		return true;
	}

	public boolean addItem(int itemId) {
		if(!player.getInventory().hasFreeSlots()) {
			player.getPackets().sendGameMessage(
					"You do not have enough space in your inventory.");
			return false;
		} else if (itemId < 0
				|| !Utils.itemExists(itemId)
				|| !player.getControlerManager().canAddInventoryItem(itemId,
						1))
			return false;
		Item[] itemsBefore = items.getItemsCopy();
		if (!items.add(new Item(itemId, 1))) {
			items.add(new Item(itemId, items.getFreeSlots()));
			player.getPackets().sendGameMessage(
					"You do not have enough space in your inventory.");
			refreshItems(itemsBefore);
			return false;
		}
		refreshItems(itemsBefore);
		return true;
	}


	public boolean addItem(Item item) {
		if (item.getId() < 0 || item.getAmount() < 0 || !Utils.itemExists(item.getId()) || 
				!player.getControlerManager().canAddInventoryItem(item.getId(), item.getAmount()))
			return false;
		if (item.getId() == 995) {
			return player.getMoneyPouch().sendDynamicInteraction(item.getAmount(), false);
		}
		Item[] itemsBefore = items.getItemsCopy();
		if (!items.add(item)) {
			items.add(new Item(item.getId(), items.getFreeSlots()));
			player.getPackets().sendGameMessage("Not enough space in your inventory.");
			refreshItems(itemsBefore);
			return false;
		}
		refreshItems(itemsBefore);
		return true;
	}

	public void deleteItem(int slot, Item item) {
		if (!player.getControlerManager().canDeleteInventoryItem(item.getId(),
				item.getAmount()))
			return;
		Item[] itemsBefore = items.getItemsCopy();
		items.remove(slot, item);
		refreshItems(itemsBefore);
	}

	public boolean removeItems(Item... list) {
		for (Item item : list)  {
			if(item == null)
				continue;
			deleteItem(item);
		}
		return true;
	}

	public void deleteItem(int itemId, int amount) {
		if (!player.getControlerManager().canDeleteInventoryItem(itemId, amount))
			return;
		Item[] itemsBefore = items.getItemsCopy();
		items.remove(new Item(itemId, amount));
		refreshItems(itemsBefore);
	}

	public void deleteItem(Item item) {
		if (!player.getControlerManager().canDeleteInventoryItem(item.getId(),
				item.getAmount()))
			return;
		Item[] itemsBefore = items.getItemsCopy();
		items.remove(item);
		refreshItems(itemsBefore);
	}
	
	public boolean containsItemToolBelt(Item item) {
		return containsOneItem(item.getId()) || player.getToolbelt().containsItem(item.getId());
	}

	public boolean containsItemToolBelt(int id) {
		return containsOneItem(id) || player.getToolbelt().containsItem(id);
	}

	public boolean containsItemToolBelt(int id, int amount) {
		return containsItem(id, amount) || player.getToolbelt().containsItem(id);
	}

	/*
	 * No refresh needed its client to who does it :p
	 */
	public void switchItem(int fromSlot, int toSlot) {
		Item[] itemsBefore = items.getItemsCopy();
		Item fromItem = items.get(fromSlot);
		Item toItem = items.get(toSlot);
		items.set(fromSlot, toItem);
		items.set(toSlot, fromItem);
		refreshItems(itemsBefore);
	}

	public void refreshItems(Item[] itemsBefore) {
		int[] changedSlots = new int[itemsBefore.length];
		int count = 0;
		for (int index = 0; index < itemsBefore.length; index++) {
			if (itemsBefore[index] != items.getItems()[index])
				changedSlots[count++] = index;
		}
		int[] finalChangedSlots = new int[count];
		System.arraycopy(changedSlots, 0, finalChangedSlots, 0, count);
		refresh(finalChangedSlots);
	}

	public ItemsContainer<Item> getItems() {
		return items;
	}

	public boolean hasFreeSlots() {
		return items.getFreeSlot() != -1;
	}

	public int getFreeSlots() {
		return items.getFreeSlots();
	}

	public int getNumberOf(int itemId) {
		return items.getNumberOf(itemId);
	}

	public int getNumerOf(int itemId) {
		return items.getNumberOf(itemId);
	}

	public Item getItem(int slot) {
		return items.get(slot);
	}

	public int getItemsContainerSize() {
		return items.getSize();
	}

	public boolean containsItems(Item[] item) {
		for (int i = 0; i < item.length; i++)
			if (!items.contains(item[i]))
				return false;
		return true;
	}

	public boolean containsItems(int[] itemIds, int[] ammounts) {
		int size = itemIds.length > ammounts.length ? ammounts.length
				: itemIds.length;
		for (int i = 0; i < size; i++)
			if (!items.contains(new Item(itemIds[i], ammounts[i])))
				return false;
		return true;
	}

	public boolean containsItem(int itemId, int ammount) {
		if (itemId == 995) {
			if (getCoinsAmount() >= ammount)
				return true;
			else
				return false;
		}
		return items.contains(new Item(itemId, ammount));
	}

	public boolean containsItem(int itemId) {
		if (itemId == 995) {
			if (getCoinsAmount() >= 1)
				return true;
			else
				return false;
		}
		return items.contains(new Item(itemId, 1));
	}

	public boolean containsItem(Item item) {
		if (!items.contains(item))
			return false;
		return true;
	}

	public boolean containsOneItem(int... itemIds) {
		for (int itemId : itemIds) {
			if (items.containsOne(new Item(itemId, 1)))
				return true;
		}
		return false;
	}

	public void sendExamine(int slotId) {
		if (slotId >= getItemsContainerSize())
			return;
		Item item = items.get(slotId);
		if (item == null)
			return;
		player.getPackets().sendInventoryMessage(0, slotId, ItemExamines.getExamine(item));
	}

	public void refresh() {
		player.getPackets().sendItems(93, items);
	}

	public int getAmountOf(int itemId) {
		if(itemId == 995) {
			return player.getMoneyPouch().getCoinsAmount();
		}
		return items.getNumberOf(itemId);
	}


	public boolean addItemBank(int itemId, int amount, boolean banking) {
		if (itemId < 0 || amount < 0 || !Utils.itemExists(itemId) || !player.getControlerManager().canAddInventoryItem(itemId, amount))
			return false;
		if (itemId == 995)
			return player.getMoneyPouch().sendDynamicInteraction(amount, false);
		if (banking) 
			player.getBank().addItem(itemId, amount, true);
		else
			player.getInventory().addItem(itemId, amount);
		return true;    		
	}

	public boolean addItemMoneyPouch(Item item) {
		if (item.getId() == 995)
			return player.getMoneyPouch().sendDynamicInteraction(item.getAmount(), false);
		return addItem(item);
	}

	public boolean removeItemMoneyPouch(Item item) {
		if (item.getId() == 995) {
			return player.getMoneyPouch().sendDynamicInteraction(item.getAmount(), true);
		}
		return removeItems(item);
	}

	public boolean deleteShopCurrency(int amount) {
		if (containsItem(995, amount)) {
			deleteItem(995, amount);
			return true;
		}
		else if (!containsItem(995, amount) && player.getMoneyPouch().getCoinsAmount() >= amount) {
			player.getMoneyPouch().sendDynamicInteraction(amount, true);
			return true;
		}
		return false;
	}
	public int getCoinsAmount() {
		int coins = items.getNumberOf(995) + player.getMoneyPouch().getCoinsAmount();
		return coins < 0 ? Integer.MAX_VALUE : coins;
	}

	public boolean addItemDrop(int itemId, int amount, WorldTile tile) {
		if (itemId < 0 || amount < 0 || !Utils.itemExists(itemId) || !player.getControlerManager().canAddInventoryItem(itemId, amount))
			return false;
		if (itemId == 995)
			return player.getInventory().addItem(itemId, amount);
		Item[] itemsBefore = items.getItemsCopy();
		if (!items.add(new Item(itemId, amount)))
			World.addGroundItem(new Item(itemId, amount), tile, player, true, 180);
		else
			refreshItems(itemsBefore);
		return true;
	}

	public boolean addItemMoneyPouch(int id, int amount) {
		if (id == 995)
			return player.getMoneyPouch().sendDynamicInteraction(amount, false);
		return addItem(new Item(id, amount));
	}

	public boolean contains(Item... items) {
		for (Item item : items) {
			if (item != null && !containsItem(item.getId(), item.getAmount())) {
				return false;
			}
		}
		return true;
	}

	public boolean containsItemsToolBelt(int... id) {
		for (Integer i : id) {
			if(containsOneItem(i) || player.getToolbelt().containsItem(i));
			return true;
		}
		return false;
	}

	public void replaceItem(int id, int amount, int slot) {
		Item item = items.get(slot);
		if (item == null)
			return;
		item.setId(id);
		item.setAmount(amount);
		refresh(slot);
	}

	public boolean removeItems(List<Item> list) {
		for (Item item : list) {
			if (item == null)
				continue;
			deleteItem(item);
		}
		return true;
	}

	public boolean containsItems(List<Item> list) {
		for (Item item : list)
			if (!items.contains(item))
				return false;
		return true;
	}

	public boolean addItemDrop(int itemId, int amount) {
		return addItemDrop(itemId, amount, new WorldTile(player));
	}

	public int swapIds(int id1, int id2) {
		int replaced = 0;
		for (int i = 0; i < items.getSize(); i++) {
			if (items.get(i).getId() == id1) {
				items.get(i).setId(id2);
				replaced++;
				break;
			}
		}
		refresh();
		return replaced;
	}

	public int getCoinsAmountForCalculator() {
		int coins = items.getNumberOf(995);
		return coins;
	}

	public long getCoinsAmountAsLong() {
		long coins = (long) items.getNumberOf(995)
				+ (long) player.getMoneyPouch().getCoinsAmount();
		return coins;
	}
}
