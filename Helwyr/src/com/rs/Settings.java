package com.rs;

import java.math.BigInteger;
import java.util.Calendar;

import com.rs.cache.loaders.Configs;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.utils.Utils;

public final class Settings {
	
	

	/**
	 * General client and server settings.
	 */
	
	public static final String CACHE_PATH = System.getProperty("user.home") + "//framework//cache//718//";
	public static final int RECEIVE_DATA_LIMIT = 7500;
	public static final int PACKET_SIZE_LIMIT = 7500;
	public static int SERVER_TYPE = 3;
	public static int WORLD_ID = 1;
	
	public static final String LOGIN_SERVER_IP = "127.0.0.1";
	public static final int LOGIN_SERVER_PORT = 42001;

	public static final String SQL_URL = "jdbc:mysql://" + Configs.HOST + "/" + Configs.DATABASE;
	
	
	/**
	 * Launching settings
	 */
	public static boolean DEBUG;
	public static boolean HOSTED;
	public static boolean ECONOMY;
	

	/**
	 * Graphical User Interface settings
	 */
	public static final String GUI_SIGN = "Helwyr GUI";
	public static final String LINE_SEPARATOR = System.getProperty("line.separator");
	
	/**
	 * Player settings
	 */
	public static final int START_PLAYER_HITPOINTS = 100;
	public static final WorldTile OUTSIDE_CITADEL = new WorldTile(2963, 3290, 0);
	public static final WorldTile START_PLAYER_LOCATION = new WorldTile(3491, 3482, 0);
	public static final WorldTile RESPAWN_PLAYER_LOCATION = new WorldTile(3501, 3481, 0); //new WorldTile(2966, 3387, 0);// //
	public static final long MAX_PACKETS_DECODER_PING_DELAY = 30000; // 30seconds
    public static final int WELL_MAX_AMOUNT = 325000000;


    /**
	 * Weekly Taxes
	 */
	public static final int WEEKLY_TAX_AMOUNT = 100000000;//100M

    /**
     * Drop Rate Settings
     */
    
    public static final int DROP_ROLL = 100000;
	public static int COMMON_RATE = 100000;
	public static int UNCOMMON_RATE = 30000;
	public static int RARE_RATE = 2700;
	public static int VERY_RARE_RATE = 350;
	public static int ULTRA_RARE_RATE = 200;
	
	public static int getCommonRate() {
		if(Configs.INCREASED_DROP_CHANCE)
			return (COMMON_RATE * 2);
		return COMMON_RATE;
	}
	
	public static int getUncommonRate() {
		if(Configs.INCREASED_DROP_CHANCE)
			return (COMMON_RATE * 2);
		return COMMON_RATE;
	}
	
	public static int getRareRate() {
		if(Configs.INCREASED_DROP_CHANCE)
			return (RARE_RATE * 2);
		return RARE_RATE;
	}
	
	public static int getVeryRareRate() {
		if(Configs.INCREASED_DROP_CHANCE)
			return (VERY_RARE_RATE * 2);
		return VERY_RARE_RATE;
	}
	
	public static int getUltraRareRate() {
		if(Configs.INCREASED_DROP_CHANCE)
			return (ULTRA_RARE_RATE * 2);
		return ULTRA_RARE_RATE;
	}
	
	public static int getDropRate(Player player) {
		if(player.isUltimateDonator()) 
			return (Utils.random(3) == 0 ? (Configs.DROP_RATE + 2) : 1);
		
		if (player.getEquipment().getRingId() == 2572)  //ring of wealth
			return (Utils.random(5) == 0 ? (Configs.DROP_RATE + 1) : 1);
		
		return Configs.DROP_RATE;
	}
	
	public static boolean isOwner(Player player) {
		if(player.getUsername().equalsIgnoreCase(Configs.OWNER)
				|| player.getUsername().equalsIgnoreCase(Configs.CO_OWNER))
			return true;
		return false;
	}
	
	public static int dayOfWeek() {
		Calendar cal = Calendar.getInstance();
		return cal.get(Calendar.DAY_OF_WEEK);
	}

	public static boolean isWeekend() {
		return dayOfWeek() == 1 ? true : dayOfWeek() == 6 ? true
				: dayOfWeek() == 7 ? true : false;
	}

	public static boolean isBonusWeekend() {
		if (isWeekend()) {
			return true;
		}
		return false;
	}
	
	public static int getDropRate() {
		return Configs.DROP_RATE;
	}
	
	public static final String[] WORLD_RANDOM_NEWS = new String[] { 
		    "<img=5><col=7D1616>News</col></img>:<col=7D1616>Did you know: You can give a quick suggestion? Do ;;suggest (idea description) and the developers will look at it shortly!",
		    "<img=5><col=7D1616>News</col></img>:<col=7D1616> Vote every 12 hours for a reward of your choice! Use ;;vote!</col>",
		    "<img=5><col=7D1616>News</col></img>:<col=7D1616> Speak to any banker to set a bank pin!</col>",
		    "<img=5><col=7D1616>News</col></img>:<col=7D1616> Interested in donating or want to see the benefits? Type ;;donate !</col>",
		    "<img=5><col=7D1616>News</col></img>:<col=7D1616> To keep up with the latest changes to " + Configs.SERVER_NAME  +", type ;;patchnotes</col>",
		    "<img=5><col=7D1616>News</col></img>:<col=7D1616> You can change your password using ::changepass!</col>",
		    "<img=5><col=7D1616>News</col></img>:<col=7D1616> Never use a password from another server on " + Configs.SERVER_NAME + "!</col>",
		    "<img=5><col=7D1616>News</col></img>:<col=7D1616> Want additional security? Talk to a banker to set your player pin",
		    "<img=5><col=7D1616>News</col></img>:<col=7D1616> Did you know: As you level your expereince increases?",
		    "<img=5><col=7D1616>News</col></img>:<col=7D1616> Did you know: Experience is increased until you are level 60 in that skill?",
		    "<img=5><col=7D1616>News</col></img>:<col=7D1616> Did you know: You can report a bug directly to the developers? Do ;;bug (bug description) and the bug will be viewed faster!",
		    "<img=5><col=7D1616>News</col></img>:<col=7D1616> Did you know: The 'Activate' option the home lodestone can open up general teleports around the world?",
		    "<img=5><col=7D1616>News</col></img>:<col=7D1616> Did you know: There are bonus events that happen randomly to increase your experience and gameplay?",
		    "<img=5><col=7D1616>News</col></img>:<col=7D1616> Rules: VPN voting is NOT allowed on " + Configs.SERVER_NAME + "!",
		    "<img=5><col=7D1616>News</col></img>:<col=7D1616> Rules: Asking for staff can result in a 24 hour mute.",
		    "<img=5><col=7D1616>News</col></img>:<col=7D1616> Did you know: You get increased experience while in the wilderness?",
		    "<img=5><col=7D1616>News</col></img>:<col=7D1616> Did you know: You can view the PvM store by clicking 'rub' on 'Dragon Tokens'?",
		    "<img=5><col=7D1616>News</col></img>:<col=7D1616> Did you know: You receive 'Dragon Tokens' by doing slayer, and killing bosses/mini bosses?",
		    "<img=5><col=7D1616>News</col></img>:<col=7D1616> Did you know: Did you know you can Repute for rewards, and additional experience?",
		    "<img=5><col=7D1616>News</col></img>:<col=7D1616> Did you know: You can vote for 12 hours of 5% of increased experience?"};
	
	/**
	 * World settings
	 */
	public static final int WORLD_CYCLE_TIME = 600; // the speed of world in ms
	
	/**
	 * Music & Emote settings
	 */
	public static final int AIR_GUITAR_MUSICS_COUNT = 75;
	
	/**
	 * Quest settings
	 */
	public static final int QUESTS = 183;
	
	/**
	 * Memory settings
	 */
	public static final int PLAYERS_LIMIT = 2048;
	public static final int LOCAL_PLAYERS_LIMIT = 250;
	public static final int NPCS_LIMIT = Short.MAX_VALUE;
	public static final int LOCAL_NPCS_LIMIT = 250;
	public static final int MIN_FREE_MEM_ALLOWED = 30000000; // 30mb
	
	
	/**
	 * Game constants
	 */
	
	/**
	 * Game constants
	 */
	public static final int[] MAP_SIZES = { 104, 120, 136, 168, 72 };
	

	public static final String GRAB_SERVER_TOKEN = "hAJWGrsaETglRjuwxMwnlA/d5W6EgYWx";
	public static final int[] GRAB_SERVER_KEYS = new int[] { 171, 9857, 5907, 4981, 113430, 5558, 0, 2534, 4895, 54940,
			130065, 44419, 64797, 92184, 135106, 3940, 3909, 2398, 150, 7416, 266, 15, 148327, 154034, 458, 453 };

	// an exeption(grab server has his own keyset unlike rest of client)
	public static final BigInteger GRAB_SERVER_PRIVATE_EXPONENT = new BigInteger("95776340111155337321344029627634178888626101791582245228586750697996713454019354716577077577558156976177994479837760989691356438974879647293064177555518187567327659793331431421153203931914933858526857396428052266926507860603166705084302845740310178306001400777670591958466653637275131498866778592148380588481");
	public static final BigInteger GRAB_SERVER_MODULUS = new BigInteger("119555331260995530494627322191654816613155476612603817103079689925995402263457895890829148093414135342420807287820032417458428763496565605970163936696811485500553506743979521465489801746973392901885588777462023165252483988431877411021816445058706597607453280166045122971960003629860919338852061972113876035333");
	public static final BigInteger PRIVATE_EXPONENT = new BigInteger("90587072701551327129007891668787349509347630408215045082807628285770049664232156776755654198505412956586289981306433146503308411067358680117206732091608088418458220580479081111360656446804397560752455367862620370537461050334224448167071367743407184852057833323917170323302797356352672118595769338616589092625");
	public static final BigInteger MODULUS = new BigInteger("102876637271116124732338500663639643113504464789339249490399312659674772039314875904176809267475033772367707882873773291786014475222178654932442254125731622781524413208523465520758537060408541610254619166907142593731337618490879831401461945679478046811438574041131738117063340726565226753787565780501845348613");
	
	/**
	 * Donator settings
	 */
	public static String[] DONATOR_ITEMS = { " 12675, 15016 " };
	
	public static String[] EXTREME_DONATOR_ITEMS = {" "};

	/**
	 * Item settings
	 */
	
	public static final Item[] MYSTERY_BOX_COMMON = new Item[] { new Item(537, 50), new Item(533, 150), 
			new Item(8779, 175), new Item(8781, 100), new Item(448, 200), new Item(450, 175), new Item(452, 125),
			new Item(15271, 100), new Item(384, 150)},

	 MYSTERY_BOX_MEDIUM = new Item[] { new Item(18831, 30), new Item(15126, 1),
			 new Item(11732, 1), new Item(7158, 1) },

	 MYSTERY_BOX_RARE = new Item[] { new Item(962, 1), new Item(1050, 1), new Item(1053, 1),
			 new Item(1055, 1), new Item(1057, 1) };

	
	public static int[] BOSS_NPCS = { 15172, 19098, 19121, 11872, 8597, 8596, 7134, 3200, 6247, 8133, 2883, 2882, 2881, 6260, 3340, 
								14301, 50, 6222, 6203, 5363, 13447, 13448, 13449, 13450, 8549, 15454, 9176, 8349, 2745, 3334 };
	
	public static String[] RARE_DROPS = { "Ancient effigy", "spirit shield", "sigil", "Dark bow", "Draconic visage", "Hexcrest", "Focus sight", "Staff of light",
		"Dragon pickaxe", " hilt", "Bandos boots", "Bandos tassets", "Bandos chestplate", "Armadyl chestplate", "Armadyl chainskirt", "Armadyl helmet",
		"Saradomin sword", "Leaf-bladed sword", "Dragon claws", "Ruined Dragon Armour", "Dragon hatchet", "Fremennik rings", "Amulet of ranging",
		"Dragon full helm", "Whip vine", "Glaiven boots", "Steadfast boots", "Ragefire boots", "Zaryte bow", "Pernix", "Pernix", "Pernix",  "Virtus", "Torva", "Torva",
		"Torva platelegs", "Dragon kiteshield", "Dragonbone upgrade kit", "Third-age armour", "Ranger boots", "Gilded platebody", "Gilded platelegs", "Robin hood hat",
		"Gold-trimmed wizard robes", "Pet", "Spirit roots", "Ancient symbol", "Vanguard", "Drygore", "Ice diamond", "(i)", "Hexhunter bow", "Blood necklace", "fury", " pet", "Primal", "Malevolent", "Varrock armour", "Falador shield", "Hourglass",
		"Ascension", "Seismic wand", "Seismic singularity", "Ganodermic poncho", "Ganodermic leggings", "Ganodermic visor", "Polypore staff", "Dragon chainbody", "statuette", "Zamorakian spear", "Vanguard body", "Vanguard legs"};
	
	public static String[] UNTRADEABLE_ITEMS = { "(i)", "(deg", "(class", "sacred clay", "null", "flaming skull", "overload", "extreme", "korasi", "chaotic", 
		"dreadnip", "max hood", "max cape", "dungeoneering", "vine whip", "tokhaar-kal", "culinaromancer", "spin ticket", "tokkul", "fighter", "fire cape",
		"lamp",  "completion", "arcane stream", "arcane pulse", "arcane blast", "magical blastbox", "cape (t)", "penance", "defender", "charm",
		"keenblade", "quickbow", "mindspike", "baby troll" };
	
	public static final char[] VALID_CHARS = { '_', 'a', 'A', 'b', 'B', 'c', 'C', 'd', 'D', 'e', 'E',
			   'f', 'F', 'g', 'G', 'h', 'H', 'i', 'I', 'j', 'J', 'k', 'K', 'l', 'L', 'm', 'M', 'n', 'N', 'o', 'O', 'p', 'P', 'q', 'Q', 'r', 'R',
			   's', 'S', 't', 'T', 'u', 'U', 'v', 'V', 'w', 'W', 'x', 'X', 'y', 'Y', 'z', 'Z', '0', '1', '2', '3', '4',
			   '5', '6', '7', '8', '9' , ' '};
	
	public static String[] EARNED_ITEMS = { " " };
	
	public static String[] REMOVING_ITEMS = { "(class",
		"sacred clay", "dominion", "sled"};
	
	public static String[] VOTE_REQUIRED_ITEMS = {
		" "
	};
	
	public static String SONG_OF_THE_DAY = "https://www.youtube.com/watch?v=n8Zvm9wLdmg";
	
	
	public static final boolean SQUEAL_OF_FORTUNE_ENABLED = true;
	public static final double[] SOF_CHANCES = new double[] { 1.0D, 0.35D, 0.0089D, 0.0058D };
	public static final int[] SOF_COMMON_CASH_AMOUNTS = new int[] { 100, 250, 500, 1000, 5000 };
	public static final int[] SOF_UNCOMMON_CASH_AMOUNTS = new int[] { 10000, 25000, 50000, 100000, 500000 };
	public static final int[] SOF_RARE_CASH_AMOUNTS = new int[] { 1000000, 2500000, 5000000, 10000000, 25000000 };
	public static final int[] SOF_JACKPOT_CASH_AMOUNTS = new int[] { 50 * 1000000, 50 * 1000000, 75 * 1000000, 100 * 1000000 };
	public static final int[] SOF_COMMON_LAMPS = new int[] { 23713, 23717, 23721, 23725, 23729, 23737, 23733, 23741, 23745, 23749, 23753, 23757, 23761, 23765, 23769, 23778, 23774, 23786, 23782, 23794, 23790, 23802, 23798, 23810, 23806, 23814 };
	public static final int[] SOF_UNCOMMON_LAMPS = new int[] { 34030, 34031, 34032, 34033, 34034, 34035, 34036, 23714, 23718, 23722, 23726, 23730, 23738, 23734, 23742, 23746, 23750, 23754, 23758, 23762, 23766, 23770, 23779, 23775, 23787, 23783, 23795, 23791, 23803, 23799, 23811, 23807, 23815 };
	public static final int[] SOF_RARE_LAMPS = new int[] { 23715, 23719, 23723, 23727, 23731, 23739, 23735, 23743, 23747, 23751, 23755, 23759, 23763, 23767, 23771, 23780, 23776, 23788, 23784, 23796, 23792, 23804, 23800, 23812, 23808, 23816 };
	public static final int[] SOF_JACKPOT_LAMPS = new int[] { 23716, 23720, 23724, 23728, 23732, 23740, 23736, 23744, 23748, 23752, 23756, 23760, 23764, 23768, 23773, 23781, 23777, 23789, 23785, 23797, 23793, 23805, 23801, 23813, 23809, 23817 };
	public static final int[] SOF_COMMON_OTHERS = new int[] { 1511, 1205, 438, 4097, 13508, 556, 18830, 25758, 25755, 1127, 7394, 4587 };//todo
	public static final int[] SOF_UNCOMMON_OTHERS = new int[] { 24154, 24154, 24155, 24155, 1119, 1125, 1121, 1123, 1127, 1131, 1133, 6322, 1135, 12971, 4091, 1295, 1297, 1299, 1303, 1301, 1327, 1325, 1331, 1329, 1311, 1333, 1315, 1313, 1319, 1317, 1367, 1365, 1371, 1369, 1273, 1373, 1361, 1271, 1275, 843, 849, 1355, 1357, 9174, 9177, 853, 857, 9183, 9181, 9179 };
	public static final int[] SOF_RARE_OTHERS = new int[] { 995, 995, 995, 995, 23665, 23666, 23667, 4151, 10491, 23668, 23690, 23692, 23695, 23698, 23688,23669, 23670, 23671, 23672, 23673, 23674, 23675, 23676, 23677, 23678, 23679, 23680, 23681, 23682, 23691, 23692, 23693, 23694, 23695, 23696, 23687, 23688, 23689, 23684, 23686, 23685, 23697, 23690, 23699, 23700, 23683, 23698 };
	public static final int[] SOF_JACKPOT_OTHERS = new int[] { 995, 995, 995, 995, 20929, 23671, 11286, 23672, 25202, 11732, 1050, 26568, 26569, 1050, 1053, 1056, 6859, 6861, 10836, 5608, 5608, 12681, 962, 20929, 23674, 24433, 26568, 26569 };

	private Settings() {

	}
}
