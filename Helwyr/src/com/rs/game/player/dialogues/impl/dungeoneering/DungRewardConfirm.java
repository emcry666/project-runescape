package com.rs.game.player.dialogues.impl.dungeoneering;

import com.rs.game.player.content.dungeoneering.DungeonRewardShop;
import com.rs.game.player.content.dungeoneering.DungeonRewardShop.DungeonReward;
import com.rs.game.player.dialogues.Dialogue;

public class DungRewardConfirm extends Dialogue {


	DungeonReward item;
	private int itemId;

	@Override
	public void start() {
		item = (DungeonReward) parameters[0];
		itemId = item.getId();
		switch(itemId) {
		case 18349:
			purchaseRS3Item(18349, 25991);
			break;
		case 18351:
			purchaseRS3Item(18351, 25993);
			break;
		case 18357:
			purchaseRS3Item(18357, 25995);
			break;
		default:
			player.getInterfaceManager().sendChatBoxInterface(1183);
			player.getPackets().sendIComponentText(1183,12, "It will cost " + item.getCost() + " for " + item.getName() + ".");
			player.getPackets().sendItemOnIComponent(1183, 13, item.getId(), 1);
			player.getPackets().sendIComponentText(1183, 7,"Are you sure you want to buy this?");
			player.getPackets().sendIComponentText(1183, 22, "Confirm Purchase");
			break;
		}
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (componentId == 9) {
			if(player.getRights() < 2) {
				if (player.getDungManager().getTokens() < item.getCost()) {
					player.sm("You need " + item.getCost()
					+ " dungeoneering tokens to buy this reward.");
					close();
					return;
				}
			}
			if (player.getInventory().getFreeSlots() >= 1) {
				player.getDungManager().setTokens(player.getDungManager().getTokens() - item.getCost());
				player.getInventory().addItemMoneyPouch(item.getId(), 1);
				DungeonRewardShop.refresh(player);
			} else {
				player.getPackets().sendGameMessage(
						"You need more inventory space.");
			}
		}
		close();
	}

	public void purchaseRS3Item(int mainHandId, int offHandId) {
		player.getDialogueManager().startDialogue(new Dialogue() {

			@Override
			public void start() {
				options(DEFAULT, "Main hand", "Off-hand");
			}

			@Override
			public void run(int interfaceId, int componentId) {
				switch(componentId) {
				case OPTION_1:
					close();
					confirmPurchase(mainHandId, false);
					break;
				case OPTION_2:
					close();
					confirmPurchase(offHandId, true);
					break;
				default:
					close();
					break;
				}
			}

			@Override
			public void finish() {

			}

		});
	}

	public void confirmPurchase(int itemId, final boolean isOffhand) {
		player.getDialogueManager().startDialogue(new Dialogue() {

			@Override
			public void start() {
				player.getInterfaceManager().sendChatBoxInterface(1183);
				player.getPackets().sendIComponentText(1183,12, "It will cost " + (isOffhand ? "100,000 " : "200,000 ") + "tokens for " + item.getName() + ".");
				player.getPackets().sendItemOnIComponent(1183, 13, itemId, 1);
				player.getPackets().sendIComponentText(1183, 7, "Are you sure you want to buy this?");
				player.getPackets().sendIComponentText(1183, 22, "Confirm Purchase");
			}

			@Override
			public void run(int interfaceId, int componentId) {
				if (componentId == 9) {
					if(player.getRights() < 2) {
						if (player.getDungManager().getTokens() < (isOffhand ? 100000 : 200000)) {
							player.sm("You need " + (isOffhand ? 100000 : 200000)
									+ " dungeoneering tokens to buy this reward.");
							close();
							return;
						}
					}
					if (player.getInventory().getFreeSlots() >= 1) {
						player.getDungManager().setTokens(player.getDungManager().getTokens() - (isOffhand ? 100000 : 200000));
						player.getInventory().addItemMoneyPouch(itemId, 1);
						DungeonRewardShop.refresh(player);
					} else {
						player.getPackets().sendGameMessage("You need more inventory space.");
					}
					close();
				}
			}

			@Override
			public void finish() {
				// TODO Auto-generated method stub
			}

		});
	}

	@Override
	public void finish() {

	}

}