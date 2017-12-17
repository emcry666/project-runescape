package com.rs.game.player;

import com.rs.cache.loaders.Configs;
import com.rs.game.WorldTile;
import com.rs.game.player.content.Magic;
import com.rs.game.player.controlers.Wilderness;

public class TeleportManager {

	public final int[] GO_BUTTON = { 90, 206, 254, 200, 212, 248, 230, 236, 224, 266, 272, 218, 242, 260, 278, 284, 308, 290, 296, 302, 314, 326 };
	public final int[] BUTTONS = { 88, 115, 139, 112, 118, 136, 124, 130, 127, 145, 148, 121, 133, 142, 151, 154, 169, 158, 162, 166, 172, 320, 142, 121};

	private Player player;
	private TeleportType type;

	public TeleportManager(Player player) {
		player(player);
	}

	public TeleportManager player(Player player) {
		this.player = player;
		return this;
	}

	public Player player() {
		return player;
	}

	public TeleportManager open(TeleportType type) {
		type(type);
		refresh();
		sendStrings(type);
		if (!player.getInterfaceManager().containsInterface(1156))
			player.getInterfaceManager().sendInterface(1156);
		return this;
	}

	private void sendStrings(TeleportType type) {
		if (type == TeleportType.MINIGAME) {
			for (int i = 0; i < Teleports.MINIGAME_TELEPORTS.length; i++) {
				if (!player.getInterfaceManager().containsInterface(1156))
				player.getPackets().sendIComponentText(1156, GO_BUTTON[i], "Teleport");
			}
			for (int i = 0; i < Teleports.MINIGAME_TELEPORTS.length; i++) {
				player.getPackets().sendIComponentText(1156, Teleports.MINIGAME_TELEPORTS[i].config(), Teleports.MINIGAME_TELEPORTS[i].title());
				player.getPackets().sendIComponentText(1156, getConfig(Teleports.MINIGAME_TELEPORTS[i].config()), Teleports.MINIGAME_TELEPORTS[i].info());
			}
		}
		if (type == TeleportType.MONSTER) {
			for (int i = 0; i < Teleports.MONSTER_TELEPORTS.length; i++) {
				if (!player.getInterfaceManager().containsInterface(1156))
				player.getPackets().sendIComponentText(1156, GO_BUTTON[i], "Teleport");
			}
			for (int i = 0; i < Teleports.MONSTER_TELEPORTS.length; i++) {
				player.getPackets().sendIComponentText(1156, Teleports.MONSTER_TELEPORTS[i].config(), Teleports.MONSTER_TELEPORTS[i].title());
				player.getPackets().sendIComponentText(1156, getConfig(Teleports.MONSTER_TELEPORTS[i].config()), Teleports.MONSTER_TELEPORTS[i].info());
			}
		}
		if (type == TeleportType.CITY) {
			for (int i = 0; i < Teleports.CITY_TELEPORTS.length; i++) {
				if (!player.getInterfaceManager().containsInterface(1156))
				player.getPackets().sendIComponentText(1156, GO_BUTTON[i], "Teleport");
			}
			for (int i = 0; i < Teleports.CITY_TELEPORTS.length; i++) {
				player.getPackets().sendIComponentText(1156, Teleports.CITY_TELEPORTS[i].config(), Teleports.CITY_TELEPORTS[i].title());
				player.getPackets().sendIComponentText(1156, getConfig(Teleports.CITY_TELEPORTS[i].config()), Teleports.CITY_TELEPORTS[i].info());
			}
		}
		if (type == TeleportType.TRAIN) {
			for (int i = 0; i < Teleports.TRAINING_TELEPORTS.length; i++) {
				if (!player.getInterfaceManager().containsInterface(1156))
				player.getPackets().sendIComponentText(1156, GO_BUTTON[i], "Teleport");
			}
			for (int i = 0; i < Teleports.TRAINING_TELEPORTS.length; i++) {
				player.getPackets().sendIComponentText(1156, Teleports.TRAINING_TELEPORTS[i].config(), Teleports.TRAINING_TELEPORTS[i].title());
				player.getPackets().sendIComponentText(1156, getConfig(Teleports.TRAINING_TELEPORTS[i].config()), Teleports.TRAINING_TELEPORTS[i].info());
			}
		}
		if (type == TeleportType.SKILLING) {
			for (int i = 0; i < Teleports.SKILLING_TELEPORTS.length; i++) {
				if (!player.getInterfaceManager().containsInterface(1156))
				player.getPackets().sendIComponentText(1156, GO_BUTTON[i], "Teleport");
			}
			for (int i = 0; i < Teleports.SKILLING_TELEPORTS.length; i++) {
				player.getPackets().sendIComponentText(1156, Teleports.SKILLING_TELEPORTS[i].config(), Teleports.SKILLING_TELEPORTS[i].title());
				player.getPackets().sendIComponentText(1156, getConfig(Teleports.SKILLING_TELEPORTS[i].config()), Teleports.SKILLING_TELEPORTS[i].info());
			}
		}
	}

	public int getConfig(int input) {
		int config = 0;
		switch (input) {
		case 159:
		case 155:
		case 163:
			config = input + 2;
			break;
		default:
			config = input + 1;
			break;
		}
		return config;
	}

	public void handleMainButtons(final Player player, int componentId, int slotId) {
		try {
			sendStrings(type);
			switch (componentId) {
			case 105:
			case 106:
			case 100:
			case 102:
			case 103:
			case 104:
				return;
			}
			for (int i = 0; i < BUTTONS.length; i++) {
				if (componentId == BUTTONS[i]) {
					if (type == TeleportType.MINIGAME) {
						if (Teleports.MINIGAME_TELEPORTS[i].disabled()) {
							player.sm("This is currently disabled and will be enabled very soon.");
							return;
						}
						teleport(Teleports.MINIGAME_TELEPORTS[i].place());
						if (Teleports.MINIGAME_TELEPORTS[i].info().toLowerCase().contains("wilderness"))
							player.getControlerManager().startControler("Wilderness");
					}
					if (type == TeleportType.MONSTER) {
						if (Teleports.MONSTER_TELEPORTS[i].disabled()) {
							player.sm("This is currently disabled and will be enabled very soon.");
							return;
						}
						teleport(Teleports.MONSTER_TELEPORTS[i].place());
						if (Teleports.MINIGAME_TELEPORTS[i].info().toLowerCase().contains("wilderness"))
							player.getControlerManager().startControler("Wilderness");
					}
					if (type == TeleportType.CITY) {
						if (Teleports.CITY_TELEPORTS[i].disabled()) {
							player.sm("This is currently disabled and will be enabled very soon.");
							return;
						}
						teleport(Teleports.CITY_TELEPORTS[i].place());
						if (Teleports.MINIGAME_TELEPORTS[i].info().toLowerCase().contains("wilderness"))
							player.getControlerManager().startControler("Wilderness");
					}
					if (type == TeleportType.TRAIN) {
						if (Teleports.TRAINING_TELEPORTS[i].disabled()) {
							player.sm("This is currently disabled and will be enabled very soon.");
							return;
						}
						teleport(Teleports.TRAINING_TELEPORTS[i].place());
						if (Teleports.MINIGAME_TELEPORTS[i].info().toLowerCase().contains("wilderness"))
							player.getControlerManager().startControler("Wilderness");
					}
					if (type == TeleportType.SKILLING) {
						if (Teleports.SKILLING_TELEPORTS[i].disabled()) {
							player.sm("This is currently disabled and will be enabled very soon.");
							return;
						}
						teleport(Teleports.SKILLING_TELEPORTS[i].place());
						if (Teleports.MINIGAME_TELEPORTS[i].info().toLowerCase().contains("wilderness"))
							player.getControlerManager().startControler("Wilderness");
					}
				}
			}
		} catch (Exception e) {
		}
	}
	
	public TeleportManager refresh() {
		for (int i = 0; i < 327; i++) {
			player.getPackets().sendIComponentText(1156, i, " ");
		}
		player.getPackets().sendIComponentText(1156, 278, " ");
		player.getPackets().sendIComponentText(1156, 284, " ");
		player.getPackets().sendIComponentText(1156, 156, " ");
		player.getPackets().sendIComponentText(1156, 160, " ");
		player.getPackets().sendIComponentText(1156, 164, " ");
		return this;
	}

	private void teleport(WorldTile l) {
		if (!player.getControlerManager().processMagicTeleport(l))
			return;
		if (Wilderness.isAtWild(player))
			player.sm("You cannot use this teleport in the Wilderness.");
		Magic.sendNormalTeleportSpell(player, 0, 0, l);
	}
	
	public TeleportType type() {
		return type;
	}

	public void type(TeleportType type) {
		this.type = type;
	}

	public enum TeleportType {
		MINIGAME,
		MONSTER,
		CITY,
		TRAIN,
		SKILLING;
	}
	
	public static class Teleports {

		public static final Teleport[] MINIGAME_TELEPORTS = { 
				new Teleport(108, "Duel Arena", "Stake duel other players here.", new WorldTile(3365, 3275, 0), false),
				new Teleport(113, "Barrows", "Earn your barrows pieces here.", new WorldTile(3565, 3313, 0), false),
				new Teleport(137, "Dominion Tower", "Rewards: Access to Goliath, Spellcaster, Swift gloves", new WorldTile(3366, 3083, 0), false),
				new Teleport(110, "Fight Pits", "Fight against other players here.", new WorldTile(2399, 5177, 0), false),
				new Teleport(116, "Castle Wars", "Capture the flag, " + Configs.SERVER_NAME + " style.", new WorldTile(2442, 3090, 0), false),
				new Teleport(134, "Pest Control", "Earn your Void/Elite Void here.", new WorldTile(2657, 2649, 0), true),
				new Teleport(122, "Fight Caves", "Take down Tz-Tok Jad for a fire cape.", new WorldTile(4610, 5130, 0), false),
				new Teleport(128, "Soul Wars", "Earn Zeal here.", new WorldTile(3083, 3476, 0), true),
				new Teleport(125, "The Crucible", "Fight other players here.", new WorldTile(4744, 5172, 0), false),
				new Teleport(143, "Fight Kiln", "Take down Har-Aken for a kiln cape.", new WorldTile(4744, 5172, 0), false),
				new Teleport(146, "Runespan", "Train RuneCrafting here.", new WorldTile(2970, 9678, 0), true),
				new Teleport(119, "Gamers Grotto", "Clan wars, Stealing creation, Fist of Guthix", new WorldTile(2879, 3542, 0), false),
				new Teleport(131, "Warrior's Guild", "Earn your defenders here.", new WorldTile(2879, 3542, 0), false),
				new Teleport(140, "Soceress's Garden", "Nothing interesting here.", new WorldTile(3322, 3140, 0), false) };
		
		public static final Teleport[] MONSTER_TELEPORTS = { 
				new Teleport(108, "Chaos Elemental", "<col=ff0000>Warning: High-level Wilderness!", new WorldTile(3258, 3947, 0), false),
				new Teleport(113, "Dagannoth Kings", "Drops: Combat rings, Dragon axe, DK pets.", new WorldTile(2915, 4446, 0), false),
				new Teleport(137, "Nex", "Drops: Torva, Virtus, and Pernix armours, Zaryte bow", new WorldTile(2905, 5203, 0), false),
				new Teleport(110, "Godwars Dungeon", "Fight the Generals here.", new WorldTile(2921, 3747, 0), false),
				new Teleport(116, "King Black Dragon", "<col=ff0000>Warning: High-Level Wilderness!", new WorldTile(3001, 3852, 0), false),
				new Teleport(134, "Kalphite Queen", "Drops: Drygore weapons, Dragon chainbody, KQ Pet", new WorldTile(3504, 9494, 0), false),
				new Teleport(122, "Tormented Demons", "Drops: Dragon claws, Ruined armour shards", new WorldTile(2569, 5736, 0), false),
				new Teleport(128, "Bork", "Drops: Vanguard, Doomcore staff, Blood necklace", new WorldTile(1807, 3217, 0), false),
				new Teleport(125, "Glacors", "Drops: Glacor boots, Pet Glacyte", new WorldTile(4183, 5726, 0), false),
				new Teleport(143, "Kraken Boss", "<col=ff0000>Warning: Mid-level Wilderness & Multi-Combat zone!", new WorldTile(3284, 3615, 0), false),
				new Teleport(146, "Corporeal Beast", "Drops: Sigils, Holy elixir, Corp pet, Core pet", new WorldTile(2964, 4382, 2), false),
				new Teleport(119, "Queen Black Dragon", "Drops: Dragon kiteshield, Royal crossbow parts", new WorldTile(1191, 6501, 0), false),
				new Teleport(131, "Forinthry Dungeon", "<col=ff0000>Warning: High-Level Wilderness & Multi-Combat zone!", new WorldTile(3038, 10168, 0), false),
				new Teleport(140, "Skeleton Monkies", "Popular training spot from Monkey Madness.", new WorldTile(2768, 9102, 0), false),
				new Teleport(149, "Enhanced Ice Titans", "Drops: Ice diamond, other high valued items.", new WorldTile(2724, 3804, 1), false),
				new Teleport(152, "Ascension Dungeon", "Drops: Ascension shards 1-4", new WorldTile(3297, 9824, 0), false),
				new Teleport(167, "Vorago", "Drops: Seismic wand, Seismic singularity, Tectonic armour.", new WorldTile(3564, 9501, 0), false),
				new Teleport(155, "Sunfreet", "Drops: Malevolent, Merciless, and Vengeful kiteshields.", new WorldTile(3194, 4569, 0), false),
				new Teleport(159, "Blink", "Drops: Dragonfire shield, Dragon full helm, and more.", new WorldTile(4679, 5144, 0), false),
				new Teleport(163, "Ganodermic Beasts", "About as ugly as it gets.", new WorldTile(4627, 5467, 0), false),
				new Teleport(170, "Thunderous", "Drops: Primal battleaxe, Anchor, and more!", new WorldTile(2394, 10300, 1), false),
				new Teleport(318, "Avatar of Destruction", "Drops: Primal 2h, Soul wars capes, and more!", new WorldTile(1967, 3238, 0), false),

		};
		public static final Teleport[] CITY_TELEPORTS = { 
				new Teleport(108, "Al Kharid", "Camels and shit.", new WorldTile(3293, 3182, 0), false),
				new Teleport(113, "Ape Atoll", "Here be monkeys.", new WorldTile(2758, 2781, 0), false), 
				new Teleport(137, "Ardougne", "City of thievs.", new WorldTile(2664, 3305, 0), false),
				new Teleport(110, "Brimhaven", "Like a tropical vacation, but not.", new WorldTile(2796, 3176, 0), false),
				new Teleport(116, "Camelot", "Sir, sir, sir?", new WorldTile(2725, 3485, 0), false),
				new Teleport(134, "Canifis", "Werewolves, vampires, what else could you want?", new WorldTile(3494, 3490, 0), false),
				new Teleport(122, "Draynor Village", "So I heard you like willow logs.", new WorldTile(3093, 3262, 0), false),
				new Teleport(128, "Edgeville", "The famous.", new WorldTile(3086, 3499, 0), false),
				new Teleport(125, "Falador", "City of the knights.", new WorldTile(2965, 3380, 0), false),
				new Teleport(143, "Keldagrim", "City of the dwarves.", new WorldTile(2879, 10233, 0), false),
				new Teleport(146, "Lumbridge", "Oh dear, you have died!", new WorldTile(3221, 3219, 0), false),
				new Teleport(119, "Lletya", "Where my elves at?", new WorldTile(2340, 3172, 0), false),
				new Teleport(131, "Lunar Isle", "Residence of the moonclan.", new WorldTile(2091, 3914, 0), false),
				new Teleport(140, "Mort'ton", "Swamps and shit.", new WorldTile(3490, 3289, 0), false),
				new Teleport(149, "Rellekka", "Home of the Fremmenik.", new WorldTile(2661, 3652, 0), false),
				new Teleport(152, "Neitiznot", "Yak city skank.", new WorldTile(2343, 3806, 0), false),
				new Teleport(167, "Rimmington", "*insert shrek reference*", new WorldTile(2956, 3225, 0), false),
				new Teleport(155, "Piscatoris Fishing Colony", "Catch some monkfish.", new WorldTile(2344, 3691, 0), false),
				new Teleport(159, "Shilo Village", "The city everyone hates getting to.", new WorldTile(2855, 2960, 0), false),
				new Teleport(163, "Varrock", "The one and only.", new WorldTile(3213, 3428, 0), false),
				new Teleport(170, "Tree Gnome Stronghold", "Chillin' with my gnomies.", new WorldTile(2459, 3431, 0), false),
				new Teleport(318, "Yanille", "All along the watchtower.", new WorldTile(2579, 3094, 0), false) };

		public static final Teleport[] TRAINING_TELEPORTS = { 
				new Teleport(108, "Rock Crabs", "Just getting started?", new WorldTile(2706, 3730, 0), false),
				new Teleport(113, "Hellhounds", "You don't want to adopt these dogs.", new WorldTile(1655, 5257, 0), false),
				new Teleport(137, "Dust Devils", "(65 Slayer) Drops: Dragon chainbody.", new WorldTile(1606, 5269, 0), false),
				new Teleport(110, "Abyssal Demons", "(85 Slayer) Drops: Abyssal whip", new WorldTile(1633, 5295, 0), false),
				new Teleport(116, "Taverley Dungeon", "Many slayer creatures can be found here.", new WorldTile(2885, 9796, 0), false),
				new Teleport(134, "Frost Dragons", "Drops: Draconic visage, Frost dragon bones.", new WorldTile(1297, 4510, 0), false),
				new Teleport(122, "Dark Beasts", "(90 Slayer) Drops: Dark bow", new WorldTile(1654, 5301, 0), false),
				new Teleport(128, "Brimhaven Dungeon", "Lessers, Greaters, Fire Giants, Metal Dragons", new WorldTile(2647, 9555, 0), false),
				new Teleport(125, "Bandits", "Desert Bandit Camp.", new WorldTile(3175, 2981, 0), false),
				new Teleport(143, "Skeleton Monkeys", "Ape Atoll dungeon.", new WorldTile(2786, 9102, 0), false),
				new Teleport(146, "Slayer Tower", "Many slayer creatures can be found here.", new WorldTile(3424, 3538, 0), false),
				new Teleport(119, "Chaos Dwarf Battlefield", "Drops: Dragon pickaxe, Handcannon", new WorldTile(1520, 4704, 0), false),
				new Teleport(131, "Varrock & Edgeville Dungeon", "Low to mid level training.", new WorldTile(3117, 9852, 0), false),
				new Teleport(140, "Dungeoneering", "Earn tokens to purchase Chaotic items.", new WorldTile(3168, 9572, 0), false),
				new Teleport(149, "Monkey Guards", "Classic training spot. You know what to do here.", new WorldTile(2788, 2794, 0), false),
				new Teleport(152, "Rellekka Slayer Cave", "High-level slayer dungeon.", new WorldTile(2791, 3616, 0), false),
				new Teleport(167, "Cave Horrors", "(58 Slayer) Drops: Black mask", new WorldTile(3748, 9373, 0), false),};

		public static final Teleport[] SKILLING_TELEPORTS = { 
				new Teleport(108, "Seers' Trees", "Yew trees south of Camelot.", new WorldTile(2755, 3424, 0), false),
				new Teleport(113, "Sorc Tower Trees", "Magic trees located at the Sorcerors Tower.", new WorldTile(2701, 3392, 0), false),
				new Teleport(137, "Mahogany & Teak Reserve", "Trees located in Tai Bwo Wannai.", new WorldTile(2818, 3084, 0), false),
				new Teleport(110, "Catherby Fishing", "Fishing spots on the shore of Catherby.", new WorldTile(2848, 3435, 0), false),
				new Teleport(116, "Lumber Yard", "Teleport just south of the lumber yard.", new WorldTile(3295, 3462, 0), false),
				new Teleport(134, "Falador Mine", "Mine under Falador.", new WorldTile(3058, 9777, 0), false),
				new Teleport(122, "Feldip Hills", "Various hunter NPCs.", new WorldTile(2525, 2915, 0), false),
				new Teleport(128, "Gnome Agility Course", "Agility training course for low levels.", new WorldTile(2469, 3438, 0), false),
				new Teleport(125, "Barbarian Agility Course", "Agility training course for mid/high levels.", new WorldTile(2552, 3562, 0), false),
				new Teleport(143, "Al-Kharid Mine", "Mine located near the Duel Arena.", new WorldTile(3298, 3286, 0), false),
				new Teleport(146, "Brimhaven Gold Deposits", "Ten gold rocks located on Brimhaven.", new WorldTile(2733, 3225, 0), false),
				new Teleport(119, "Fishing Guild", "For only the finest of fishermen.", new WorldTile(2596, 3410, 0), false),
				new Teleport(131, "Quarry", "Desert quarry near the bandit camp.", new WorldTile(3170, 2911, 0), false),
				new Teleport(140, "Farming", "No, you cannot grow marijuana.", new WorldTile(3050, 3306, 0), false),
				new Teleport(149, "Living Rock Caverns", "Mine concentrated coal and gold deposits.", new WorldTile(3015, 9831, 0), false)};
		
	}
	
	public static class Teleport {

		private int config;
		private String title;
		private String info;
		private WorldTile place;
		private boolean disabled;

		public int config() {
			return config;
		}

		public void config(int config) {
			this.config = config;
		}

		public String title() {
			return title;
		}

		public String info() {
			return info;
		}

		public void title(String title) {
			this.title = title;
		}

		public void info(String info) {
			this.info = info;
		}

		public WorldTile place() {
			return place;
		}

		public void place(WorldTile place) {
			this.place = place;
		}
		
		public Teleport(int config, String title, String info, WorldTile WorldTile, boolean disabled) {
			this.config = config;
			this.title = title;
			this.info = info;
			this.place = WorldTile;
			this.disabled(disabled);
		}

		public boolean disabled() {
			return disabled;
		}

		public void disabled(boolean disabled) {
			this.disabled = disabled;
		}

	}

}
