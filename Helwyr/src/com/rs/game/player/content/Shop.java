package com.rs.game.player.content;

import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.World;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.utils.ItemExamines;
import com.rs.utils.ItemSetsKeyGenerator;

public class Shop {

	private static final int MAIN_STOCK_ITEMS_KEY = ItemSetsKeyGenerator.generateKey();

	private static final int MAX_SHOP_ITEMS = 40;
	private static final double TAX_AMOUNT = 0.10;//% of taxes being taken out
	public static final int COINS = 995, TOKKUL = 6529;


	private String name;
	private Item[] mainStock;
	private int[] defaultQuantity;
	private Item[] generalStock;
	private int money;
	private CopyOnWriteArrayList<Player> viewingPlayers;

	public Item[] getMainStock() {
		return mainStock;
	}

	public Shop(String name, int money, Item[] mainStock, boolean isGeneralStore) {
		viewingPlayers = new CopyOnWriteArrayList<Player>();
		this.name = name;
		this.money = money;
		this.mainStock = mainStock;
		defaultQuantity = new int[mainStock.length];
		for (int i = 0; i < defaultQuantity.length; i++)
			defaultQuantity[i] = mainStock[i].getAmount();
		if (isGeneralStore && mainStock.length < MAX_SHOP_ITEMS)
			generalStock = new Item[MAX_SHOP_ITEMS - mainStock.length];
	}

	public boolean isGeneralStore() {
		return generalStock != null;
	}

	public void addPlayer(final Player player) {
		viewingPlayers.add(player);
		player.getTemporaryAttributtes().put("Shop", this);
		player.setCloseInterfacesEvent(new Runnable() {
			@Override
			public void run() {
				viewingPlayers.remove(player);
				player.getTemporaryAttributtes().remove("Shop");
				player.getTemporaryAttributtes().remove("shop_transaction");
				player.getTemporaryAttributtes().remove("isShopBuying");
				player.getTemporaryAttributtes().remove("ShopSelectedSlot");
				player.getTemporaryAttributtes().remove("ShopSelectedInventory");
			}
		});
		player.refreshVerboseShopDisplayMode();
		player.getVarsManager().sendVar(118, generalStock != null ? 139 : MAIN_STOCK_ITEMS_KEY); 
		player.getVarsManager().sendVar(1496, -1); // sample items container id (TODO: add support for it)
		player.getVarsManager().sendVar(532, money);
		resetSelected(player);
		sendStore(player);
		player.getInterfaceManager().sendInterface(1265); // opens shop
		resetTransaction(player);
		setBuying(player, true);
		if (generalStock != null)
			player.getPackets().sendHideIComponent(1265, 19, false); // unlocks general store icon
		player.getPackets().sendIComponentSettings(1265, 20, 0, getStoreSize(), 1150); // unlocks stock slots
		sendInventory(player);
		player.getPackets().sendIComponentText(1265, 85, name);
	}

	public void resetTransaction(Player player) {
		setTransaction(player, 1);
	}

	public void increaseTransaction(Player player, int amount) {
		setTransaction(player, getTransaction(player) + amount);
	}

	public int getTransaction(Player player) {
		Integer transaction = (Integer) player.getTemporaryAttributtes().get("shop_transaction");
		return transaction == null ? 1 : transaction;
	}

	public void pay(Player player) {
		Integer selectedSlot = (Integer) player.getTemporaryAttributtes().get("ShopSelectedSlot");
		Boolean inventory = (Boolean) player.getTemporaryAttributtes().get("ShopSelectedInventory");
		if (selectedSlot == null || inventory == null)
			return;
		int amount = getTransaction(player);
		if (inventory)
			sell(player, selectedSlot, amount);
		else
			buy(player, selectedSlot, amount);
	}

	public int getSelectedMaxAmount(Player player) {
		Integer selectedSlot = (Integer) player.getTemporaryAttributtes().get("ShopSelectedSlot");
		Boolean inventory = (Boolean) player.getTemporaryAttributtes().get("ShopSelectedInventory");
		if (selectedSlot == null || inventory == null)
			return 1;
		if (inventory) {
			Item item = player.getInventory().getItem(selectedSlot);
			if (item == null)
				return 1;
			return player.getInventory().getNumberOf(item.getId());
		} else {
			if (selectedSlot >= getStoreSize())
				return 1;
			Item item = selectedSlot >= mainStock.length ? generalStock[selectedSlot - mainStock.length] : mainStock[selectedSlot];
			if (item == null)
				return 1;
			return item.getAmount();
		}
	}

	public void setTransaction(Player player, int amount) {
		int max = getSelectedMaxAmount(player);
		if (amount > max)
			amount = max;
		else if (amount < 1)
			amount = 1;
		player.getTemporaryAttributtes().put("shop_transaction", amount);
		player.getVarsManager().sendVar(2564, amount);
	}

	public static void setBuying(Player player, boolean buying) {
		player.getTemporaryAttributtes().put("isShopBuying", buying);
		player.getVarsManager().sendVar(2565, buying ? 0 : 1);
	}

	public static boolean isBuying(Player player) {
		Boolean isBuying = (Boolean) player.getTemporaryAttributtes().get("isShopBuying");
		return isBuying != null && isBuying;
	}

	public void sendInventory(Player player) {
		player.getInterfaceManager().sendInventoryInterface(1266);
		player.getPackets().sendItems(93, player.getInventory().getItems());
		player.getPackets().sendUnlockIComponentOptionSlots(1266, 0, 0, 27, 0, 1, 2, 3, 4, 5);
		player.getPackets().sendInterSetItemsOptionsScript(1266, 0, 93, 4, 7, "Value", "Sell 1", "Sell 10", "Sell 100", "Sell All", "Examine");
	}

	public void buyAll(Player player, int slotId) {
		if (slotId >= getStoreSize())
			return;
		Item item = slotId >= mainStock.length ? generalStock[slotId - mainStock.length] : mainStock[slotId];
		buy(player, slotId, item.getAmount());
	}

	public void buy(Player player, int slotId, int quantity) {
		if (slotId >= getStoreSize())
			return;
		Item item = slotId >= mainStock.length ? generalStock[slotId - mainStock.length] : mainStock[slotId];
		if (item == null) {
			return;
		}
		if (item.getAmount() == 0) {
			player.getPackets().sendGameMessage("There is no stock of that item at the moment.");
			return;
		}
		int dq = slotId >= mainStock.length ? 0 : defaultQuantity[slotId];
		int price = getBuyPrice(player, item, dq);
		int tax = (int) ((price * TAX_AMOUNT) - price);
		int amountCoins = money == COINS ? player.getInventory().getCoinsAmount() : player.getInventory().getItems().getNumberOf(money);
		int maxQuantity = amountCoins / (price == 0 ? 1 : price);
		int buyQ = item.getAmount() > quantity ? quantity : item.getAmount();

		boolean enoughCoins = maxQuantity >= buyQ;
		if (!enoughCoins) {
			player.getPackets().sendGameMessage("You don't have enough " + (money == 7478 ? ItemDefinitions.getItemDefinitions(money).getName() + "s" : ItemDefinitions.getItemDefinitions(money).getName().toLowerCase()) + ".");
			buyQ = maxQuantity;
		} else if (quantity > buyQ)
			player.getPackets().sendGameMessage("The shop has run out of stock.");
		if (item.getDefinitions().isStackable()) {
			if (player.getInventory().getFreeSlots() < 1) {
				player.getPackets().sendGameMessage("Not enough space in your inventory.");
				return;
			}
		} else {
			int freeSlots = player.getInventory().getFreeSlots();
			if (buyQ > freeSlots) {
				buyQ = freeSlots;
				player.getPackets().sendGameMessage("Not enough space in your inventory.");
			}
		}
		if (buyQ != 0) {
			int totalPrice = (money == 995 ? ((price * buyQ) + tax) : (price * buyQ));
			if(money != 995) {
				if(player.getInventory().containsItem(money, totalPrice)) {
					player.getInventory().addItem(item.getId(), buyQ);
					player.getInventory().deleteItem(money, totalPrice);
					item.setAmount(item.getAmount() - buyQ);
					if (item.getAmount() <= 0 && slotId >= mainStock.length)
						generalStock[slotId - mainStock.length] = null;
					refreshShop();
					resetSelected(player);
				}
				
			} else if (player.getInventory().checkMoneyAndRemove(totalPrice)) {
				/**
				 * Player purchased item
				 */
//				World.getMarket().getDemand().incrementDemand(item);
				//player.getTaxSystem().payTax(tax);
				player.getInventory().addItem(item.getId(), buyQ);
				item.setAmount(item.getAmount() - buyQ);
				if (item.getAmount() <= 0 && slotId >= mainStock.length)
					generalStock[slotId - mainStock.length] = null;
				refreshShop();
				resetSelected(player);

			} else {
				player.getPackets().sendGameMessage("You do not have enough coins for this purchase.");
			}
		}
	}

	public void restoreItems() {
		boolean needRefresh = false;
		for (int i = 0; i < mainStock.length; i++) {
			if (mainStock[i].getAmount() < defaultQuantity[i]) {
				mainStock[i].setAmount(mainStock[i].getAmount() + 1);
				needRefresh = true;
			} else if (mainStock[i].getAmount() > defaultQuantity[i]) {
				mainStock[i].setAmount(mainStock[i].getAmount() + -1);
				needRefresh = true;
			}
		}
		if (generalStock != null) {
			for (int i = 0; i < generalStock.length; i++) {
				Item item = generalStock[i];
				if (item == null)
					continue;
				item.setAmount(item.getAmount() - 1);
				if (item.getAmount() <= 0)
					generalStock[i] = null;
				needRefresh = true;
			}
		}
		if (needRefresh)
			refreshShop();
	}

	private boolean addItem(int itemId, int quantity) {
		for (Item item : mainStock) {
			if (item.getId() == itemId) {
				item.setAmount(item.getAmount() + quantity);
				refreshShop();
				return true;
			}
		}
		if (generalStock != null) {
			for (Item item : generalStock) {
				if (item == null)
					continue;
				if (item.getId() == itemId) {
					item.setAmount(item.getAmount() + quantity);
					refreshShop();
					return true;
				}
			}
			for (int i = 0; i < generalStock.length; i++) {
				if (generalStock[i] == null) {
					generalStock[i] = new Item(itemId, quantity);
					refreshShop();
					return true;
				}
			}
		}
		return false;
	}

	public void sell(Player player, int slotId, int quantity) {
		if (player.getInventory().getItemsContainerSize() < slotId)
			return;
		Item item = player.getInventory().getItem(slotId);
		if (item == null)
			return;
		int originalId = item.getId();
		if (item.getDefinitions().isNoted() && item.getDefinitions().getCertId() != -1)
			item = new Item(item.getDefinitions().getCertId(), item.getAmount());
		if (!ItemConstants.isTradeable(item) || item.getId() == money) {
			player.getPackets().sendGameMessage("You can't sell this item.");
			return;
		}
		int dq = getDefaultQuantity(item.getId());
		if (dq == -1 && generalStock == null) {
			player.getPackets().sendGameMessage("You can't sell this item to this shop.");
			return;
		}
		int price = getSellPrice(item, dq, player);
		int tax = (int) (price * TAX_AMOUNT);
		price = (price + tax);
		if(player.getMoneyPouch().getCoinsAmount() + price > Integer.MAX_VALUE) {
			player.getPackets().sendGameMessage("Your money pouch does not have enough space.");
			return;
		}
		int numberOff = player.getInventory().getItems().getNumberOf(originalId);
		if (quantity > numberOff)
			quantity = numberOff;
		if (!addItem(item.getId(), quantity)) {
			player.getPackets().sendGameMessage("Shop is currently full.");
			return;
		}
		player.getInventory().deleteItem(originalId, quantity);
		refreshShop();
		resetSelected(player);
		if (price == 0)
			return;
		/**
		 * Player has Sold an Item
		 */
		//World.getMarket().getProduction().incrementStock(item);
		player.getInventory().addItemMoneyPouch(new Item(money, price * quantity));
	}

	public void sendValue(Player player, int slotId) {
		if (player.getInventory().getItemsContainerSize() < slotId)
			return;
		Item item = player.getInventory().getItem(slotId);
		if (item == null)
			return;
		if (item.getDefinitions().isNoted())
			item = new Item(item.getDefinitions().getCertId(), item.getAmount());
		if (!ItemConstants.isTradeable(item) || item.getId() == money) {
			player.getPackets().sendGameMessage("You can't sell this item.");
			return;
		}
		int dq = getDefaultQuantity(item.getId());
		if (dq == -1 && generalStock == null) {
			player.getPackets().sendGameMessage("You can't sell this item to this shop.");
			return;
		}
		int price = getSellPrice(item, dq, player);
		player.getPackets().sendGameMessage(item.getDefinitions().getName() + ": shop will buy for: " + price + " " + ItemDefinitions.getItemDefinitions(money).getName().toLowerCase() + ". Right-click the item to sell.");
	}

	public int getDefaultQuantity(int itemId) {
		for (int i = 0; i < mainStock.length; i++)
			if (mainStock[i].getId() == itemId)
				return defaultQuantity[i];
		return -1;
	}

	public void resetSelected(Player player) {
		player.getTemporaryAttributtes().remove("ShopSelectedSlot");
		player.getVarsManager().sendVar(2563, -1);
	}

	public void sendInfo(Player player, int slotId, boolean inventory) {
		if (!inventory && slotId >= getStoreSize())
			return;
		Item item = inventory ? player.getInventory().getItem(slotId) : slotId >= mainStock.length ? generalStock[slotId - mainStock.length] : mainStock[slotId];
		if (item == null)
			return;
		if (item.getDefinitions().isNoted())
			item = new Item(item.getDefinitions().getCertId(), item.getAmount());
		if (inventory && (!ItemConstants.isTradeable(item) || item.getId() == money)) {
			player.getPackets().sendGameMessage("You can't sell this item.");
			resetSelected(player);
			return;
		}
		resetTransaction(player);
		player.getTemporaryAttributtes().put("ShopSelectedSlot", slotId);
		player.getTemporaryAttributtes().put("ShopSelectedInventory", inventory);
		player.getVarsManager().sendVar(2561, inventory ? 93 : generalStock != null ? 139 : MAIN_STOCK_ITEMS_KEY); // inv key
		player.getVarsManager().sendVar(2562, item.getId());
		player.getVarsManager().sendVar(2563, slotId);
		player.getPackets().sendGlobalString(362, ItemExamines.getExamine(item));
		player.getPackets().sendGlobalConfig(1876, item.getDefinitions().isWearItem() ? 0 : -1); // TODO item  pos or usage if has one, setting 0 to allow see stats
		int price = inventory ? getSellPrice(item, getDefaultQuantity(item.getId()), player) : getBuyPrice(player, item, slotId >= mainStock.length ? 0 : defaultQuantity[slotId]);
		player.getPackets().sendGameMessage(item.getDefinitions().getName() + ": shop will " + (inventory ? "buy" : "sell") + " for: " + price + " " + (money == 7478 ? ItemDefinitions.getItemDefinitions(money).getName() + "s" : ItemDefinitions.getItemDefinitions(money).getName().toLowerCase()));
	}

	public static int getBuyPrice(Player player, Item item, int dq) {
		int price = item.getDefinitions().getValue(item.getId());
		if(item.getDefinitions().getName().toLowerCase().contains("master cape"))
			price = 180000;
		else if(item.getDefinitions().getName().toLowerCase().contains("cape (t"))
			price = 99000;
		else if(item.getDefinitions().getName().toLowerCase().contains("void"))
			price = 350;
		else if(item.getDefinitions().getName().toLowerCase().contains("fighter"))
			price = 200;
		else if(item.getDefinitions().getName().toLowerCase().contains("dominion"))
			price = 400;
		else if(item.getDefinitions().getName().toLowerCase().contains("goliath"))
			price = 400;
		else if(item.getDefinitions().getName().toLowerCase().contains("spellcaster"))
			price = 400;
		else if(item.getDefinitions().getName().toLowerCase().contains("swift glove"))
			price = 400;
		switch(item.getId()) {
		case 11674:
		case 11675:
		case 11676:
			price = 175;
			break;
		case 8842:
			price = 50;
			break;
		case 7462:
			price = 115;
			break;
		case 7461:
			price = 75;
			break;
		case 20072:
			price = 50;
			break;
		case 8850:
			price = 25;
			break;
		case 10499:
			price = 20;
			break;
		}

		return price;
	}
	
	public static int getBuyPrice(Item item) {
		int price = item.getDefinitions().getValue();
		return price;
	}

	public int getSellPrice(Item item, int dq, Player player) {
		int price;
		if(item.getName().equalsIgnoreCase("spirit shards"))
			return price = (int) (item.getDefinitions().getValue(item.getId()));
		price = (int) (item.getDefinitions().getValue((int) (item.getId())));
		if(price > 250000000)
			return 0;
		return price;
	}
	
	public static int getSellPrice(Item item, Player player) {
		int price;
		if(item.getName().equalsIgnoreCase("spirit shards"))
			return price = (int) (item.getDefinitions().getValue(item.getId()));
		price = (int) (item.getDefinitions().getValue((int) (item.getId())));
		if(price > 250000000)
			return 0;
		return price;
	}

	public String getName() {
		return name;
	}

	public int getCurrency() {
		return money;
	}

	public void sendExamine(Player player, int slotId) {
		if (slotId >= getStoreSize())
			return;
		Item item = slotId >= mainStock.length ? generalStock[slotId - mainStock.length] : mainStock[slotId];
		if (item == null)
			return;
		player.getPackets().sendGameMessage(ItemExamines.getExamine(item));
	}

	public void refreshShop() {
		for (Player player : viewingPlayers) {
			sendStore(player);
			player.getPackets().sendIComponentSettings(620, 25, 0, getStoreSize() * 6, 1150);
		}
	}

	public int getStoreSize() {
		return mainStock.length + (generalStock != null ? generalStock.length : 0);
	}

	public void sendStore(Player player) {
		Item[] stock = new Item[mainStock.length + (generalStock != null ? generalStock.length : 0)];
		System.arraycopy(mainStock, 0, stock, 0, mainStock.length);
		if (generalStock != null)
			System.arraycopy(generalStock, 0, stock, mainStock.length, generalStock.length);
		player.getPackets().sendItems(generalStock != null ? 139 : MAIN_STOCK_ITEMS_KEY, stock);
	}

}