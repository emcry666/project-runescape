package com.rs.game.player.dialogues.impl;

import com.rs.game.player.content.PenguinEvent;
import com.rs.game.player.dialogues.Dialogue;

/**
 * @author Danny
 */

public class PenguinRewards extends Dialogue {

	public PenguinRewards() {
	}

	@Override
	public void finish() {

	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (stage == 1) {
			if (componentId == OPTION_1) {
				player.getInterfaceManager().closeChatBoxInterface();
				player.sm("You currently have " + player.penguinPoints
						+ " penguins points.");
			} else if (componentId == OPTION_2) {
				player.getInterfaceManager().closeChatBoxInterface();
				player.sm("Hint: " + (PenguinEvent.current == null ? "No current penguins." : PenguinEvent.current) + ".");
			} else if (componentId == OPTION_3) {
				stage = 2;
				options("Pick an Option.", "Coins and Spins",
						"Skill Exp", "Masks and Cosmetics", "None");
			} else if (componentId == OPTION_4) {
				player.getInterfaceManager().closeChatBoxInterface();
			}
		} else if (stage == 2) {
			if (componentId == OPTION_1) {
				stage = 3;
				options("Pick an Option.",
						"10k + 1 Spin (1 point)", "100k + 5 Spins (8 points)",
						"200k + 10 Spins (15 points)", "None");
			} else if (componentId == OPTION_2) {
				stage = 4;
				options("Pick an Option.", "Small Exp (1 point)",
						"Medium Exp (2 points)", "Large Exp (3 points)", "None");
			} else if (componentId == OPTION_3) {
				stage = 5;
				options("Pick an Option.",
						"Botanist's Mask (35 points)",
						"Scarecrow Mask (45 points)",
						"Scabaras Mask (50 points)",
						"Scabaras Mask (50 points)", "More");
			} else if (componentId == OPTION_4) {
				player.getInterfaceManager().closeChatBoxInterface();
			}
		} else if (stage == 3) {
			if (componentId == OPTION_1) {
				player.getInterfaceManager().closeChatBoxInterface();
				if (player.penguinPoints >= 1) {
					player.penguinPoints -= 1;
					player.getInventory().addItem(995, 10000);
					player.getSquealOfFortune().giveEarnedSpins(1);
				} else {
					player.sm("You do not have enough penguin points to purchase this.");
				}
			} else if (componentId == OPTION_2) {
				player.getInterfaceManager().closeChatBoxInterface();
				if (player.penguinPoints >= 8) {
					player.penguinPoints -= 8;
					player.getInventory().addItem(995, 100000);
					player.getSquealOfFortune().giveEarnedSpins(5);
				} else {
					player.sm("You do not have enough penguin points to purchase this.");
				}
			} else if (componentId == OPTION_3) {
				player.getInterfaceManager().closeChatBoxInterface();
				if (player.penguinPoints >= 15) {
					player.penguinPoints -= 15;
					player.getInventory().addItem(995, 200000);
					player.getSquealOfFortune().giveEarnedSpins(10);
				} else {
					player.sm("You do not have enough penguin points to purchase this.");
				}
			} else if (componentId == OPTION_4) {
				player.getInterfaceManager().closeChatBoxInterface();
			}
		} else if (stage == 4) {
			if (componentId == OPTION_1) {
				player.getInterfaceManager().closeChatBoxInterface();
				if (player.penguinPoints >= 1) {
					player.penguinPoints -= 1;
					player.getInventory().addItem(23713, 1);
				} else {
					player.sm("You do not have enough penguin points to purchase this.");
				}
			} else if (componentId == OPTION_2) {
				player.getInterfaceManager().closeChatBoxInterface();
				if (player.penguinPoints >= 2) {
					player.penguinPoints -= 2;
					player.getInventory().addItem(23714, 1);
				} else {
					player.sm("You do not have enough penguin points to purchase this.");
				}
			} else if (componentId == OPTION_3) {
				player.getInterfaceManager().closeChatBoxInterface();
				if (player.penguinPoints >= 3) {
					player.penguinPoints -= 3;
					player.getInventory().addItem(23715, 1);
				} else {
					player.sm("You do not have enough penguin points to purchase this.");
				}
			} else if (componentId == OPTION_4) {
				player.getInterfaceManager().closeChatBoxInterface();
			}
		} else if (stage == 5) {
			if (componentId == OPTION_1) {
				player.getInterfaceManager().closeChatBoxInterface();
				if (player.penguinPoints >= 35) {
					player.penguinPoints -= 35;
					player.getInventory().addItem(25190, 1);
				} else {
					player.sm("You do not have enough penguin points to purchase this.");
				}
			} else if (componentId == OPTION_2) {
				player.getInterfaceManager().closeChatBoxInterface();
				if (player.penguinPoints >= 45) {
					player.penguinPoints -= 45;
					player.getInventory().addItem(25322, 1);
				} else {
					player.sm("You do not have enough penguin points to purchase this.");
				}
			} else if (componentId == OPTION_3) {
				player.getInterfaceManager().closeChatBoxInterface();
				if (player.penguinPoints >= 50) {
					player.penguinPoints -= 50;
					player.getInventory().addItem(25124, 1);
				} else {
					player.sm("You do not have enough penguin points to purchase this.");
				}
			} else if (componentId == OPTION_4) {
				player.getInterfaceManager().closeChatBoxInterface();
				if (player.penguinPoints >= 20) {
					player.penguinPoints -= 20;
					player.getInventory().addItem(7003, 1);
				} else {
					player.sm("You do not have enough penguin points to purchase this.");
				}
			} else if (componentId == OPTION_5) {
				stage = 6;
				options("Pick an Option.",
						"Apmeken Mask (45 points)", "Factory Mask (40 points)",
						"Gorilla Mask (50 points)", "Sheep Mask (15 points)",
						"More");
			}
		} else if (stage == 6) {
			if (componentId == OPTION_1) {
				player.getInterfaceManager().closeChatBoxInterface();
				if (player.penguinPoints >= 45) {
					player.penguinPoints -= 45;
					player.getInventory().addItem(25122, 1);
				} else {
					player.sm("You do not have enough penguin points to purchase this.");
				}
			} else if (componentId == OPTION_2) {
				player.getInterfaceManager().closeChatBoxInterface();
				if (player.penguinPoints >= 40) {
					player.penguinPoints -= 40;
					player.getInventory().addItem(22959, 1);
				} else {
					player.sm("You do not have enough penguin points to purchase this.");
				}
			} else if (componentId == OPTION_3) {
				player.getInterfaceManager().closeChatBoxInterface();
				if (player.penguinPoints >= 50) {
					player.penguinPoints -= 50;
					player.getInventory().addItem(22314, 1);
				} else {
					player.sm("You do not have enough penguin points to purchase this.");
				}
			} else if (componentId == OPTION_4) {
				player.getInterfaceManager().closeChatBoxInterface();
				if (player.penguinPoints >= 15) {
					player.penguinPoints -= 15;
					player.getInventory().addItem(13107, 1);
				} else {
					player.sm("You do not have enough penguin points to purchase this.");
				}
			} else if (componentId == OPTION_5) {
				stage = 7;
				options("Pick an Option.", "Bat Mask (17 points)",
						"Penguin Mask (20 points)", "Cat Mask (23 points)",
						"Wolf Mask (25 points)", "More");
			}
		} else if (stage == 7) {
			if (componentId == OPTION_1) {
				player.getInterfaceManager().closeChatBoxInterface();
				if (player.penguinPoints >= 17) {
					player.penguinPoints -= 17;
					player.getInventory().addItem(13109, 1);
				} else {
					player.sm("You do not have enough penguin points to purchase this.");
				}
			} else if (componentId == OPTION_2) {
				player.getInterfaceManager().closeChatBoxInterface();
				if (player.penguinPoints >= 20) {
					player.penguinPoints -= 20;
					player.getInventory().addItem(13111, 1);
				} else {
					player.sm("You do not have enough penguin points to purchase this.");
				}
			} else if (componentId == OPTION_3) {
				player.getInterfaceManager().closeChatBoxInterface();
				if (player.penguinPoints >= 23) {
					player.penguinPoints -= 23;
					player.getInventory().addItem(13113, 1);
				} else {
					player.sm("You do not have enough penguin points to purchase this.");
				}
			} else if (componentId == OPTION_4) {
				player.getInterfaceManager().closeChatBoxInterface();
				if (player.penguinPoints >= 25) {
					player.penguinPoints -= 25;
					player.getInventory().addItem(13115, 1);
				} else {
					player.sm("You do not have enough penguin points to purchase this.");
				}
			} else if (componentId == OPTION_5) {
				stage = 8;
				options("Pick an Option.","White Unicorn Mask (40 points)",
						"Black Unicorn Mask (40 points)", "None");
			}
		} else if (stage == 8) {
			 if (componentId == OPTION_1) {
				player.getInterfaceManager().closeChatBoxInterface();
				if (player.penguinPoints >= 45) {
					player.penguinPoints -= 45;
					player.getInventory().addItem(19275, 1);
				} else {
					player.sm("You do not have enough penguin points to purchase this.");
				}
			} else if (componentId == OPTION_2) {
				player.getInterfaceManager().closeChatBoxInterface();
				if (player.penguinPoints >= 45) {
					player.penguinPoints -= 45;
					player.getInventory().addItem(19278, 1);
				} else {
					player.sm("You do not have enough penguin points to purchase this.");
				}
			} else if (componentId == OPTION_3) {
				player.getInterfaceManager().closeChatBoxInterface();
			}
		}

	}

	@Override
	public void start() {
		stage = 1;
		options("Pick an Option.", "Check Penguin Points",
				"Current Hint", "Rewards Shop", "None");
	}

}