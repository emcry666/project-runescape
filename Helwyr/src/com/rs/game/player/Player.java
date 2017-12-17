package com.rs.game.player;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

import com.rs.Settings;
import com.rs.cache.loaders.Configs;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.engine.GameEngine;
import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.ForceTalk;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.area.Area;
import com.rs.game.area.AreaManager;
import com.rs.game.area.dungeonhandler.others.AscensionDungeon;
import com.rs.game.economics.capital.taxes.PlayerTaxes;
import com.rs.game.item.FloorItem;
import com.rs.game.item.Item;
import com.rs.game.item.ItemsContainer;
import com.rs.game.minigames.clanwars.FfaZone;
import com.rs.game.minigames.clanwars.WarControler;
import com.rs.game.minigames.duel.DuelConfiguration;
import com.rs.game.npc.NPC;
import com.rs.game.npc.familiar.Familiar;
import com.rs.game.npc.godwars.zaros.Nex;
import com.rs.game.npc.pet.Pet;
import com.rs.game.player.actions.PlayerCombat;
import com.rs.game.player.actions.farming.Farmings;
import com.rs.game.player.actions.slayer.SlayerManager;
import com.rs.game.player.content.Cannon;
import com.rs.game.player.content.Drinkables;
import com.rs.game.player.content.DwarfCannon;
import com.rs.game.player.content.FadingScreen;
import com.rs.game.player.content.FriendChatsManager;
import com.rs.game.player.content.Magic;
import com.rs.game.player.content.MoneyPouch;
import com.rs.game.player.content.Notes;
import com.rs.game.player.content.ReaperAssignment;
import com.rs.game.player.content.SkillCapeCustomizer;
import com.rs.game.player.content.SquealOfFortune;
import com.rs.game.player.content.TeleportInterface.Skill;
import com.rs.game.player.content.Toolbelt;
import com.rs.game.player.content.TreasureTrailsManager;
import com.rs.game.player.content.bot.Bot;
import com.rs.game.player.content.bot.BotList;
import com.rs.game.player.content.clans.ClansManager;
import com.rs.game.player.content.construction.House;
import com.rs.game.player.content.daily.DailyTasks;
import com.rs.game.player.content.daily.DailyTasks.Tasks;
import com.rs.game.player.content.dungeoneering.DungManager;
import com.rs.game.player.content.grandExchange.GrandExchange;
import com.rs.game.player.content.grandExchange.GrandExchangeManager;
import com.rs.game.player.content.instancing.bossInstance.BossInstanceController;
import com.rs.game.player.content.instancing.bossInstance.InstanceSettings;
import com.rs.game.player.content.jobs.JobManager;
import com.rs.game.player.content.land.LandHandler;
import com.rs.game.player.content.miscellania.ThroneOfMiscellania;
import com.rs.game.player.content.pet.PetManager;
import com.rs.game.player.content.ports.PlayerPorts;
import com.rs.game.player.content.pperks.PlayerPerkManager;
import com.rs.game.player.content.priffidinas.PriffidinasManager;
import com.rs.game.player.content.quest.QuestManager;
import com.rs.game.player.content.repute.ReputeManager;
import com.rs.game.player.content.stealingcreations.StealingCreationController;
import com.rs.game.player.content.stealingcreations.StealingCreationLobbyController;
import com.rs.game.player.content.wildrejuve.WildRejuvenation;
import com.rs.game.player.controlers.CorpBeastControler;
import com.rs.game.player.controlers.CrucibleControler;
import com.rs.game.player.controlers.DTControler;
import com.rs.game.player.controlers.DungeonController;
import com.rs.game.player.controlers.FightCaves;
import com.rs.game.player.controlers.FightCavesHardMode;
import com.rs.game.player.controlers.FightKiln;
import com.rs.game.player.controlers.GodWars;
import com.rs.game.player.controlers.NomadsRequiem;
import com.rs.game.player.controlers.QueenBlackDragonController;
import com.rs.game.player.controlers.Wilderness;
import com.rs.game.player.controlers.ZGDControler;
import com.rs.game.player.controlers.castlewars.CastleWarsPlaying;
import com.rs.game.player.controlers.castlewars.CastleWarsWaiting;
import com.rs.game.player.controlers.fightpits.FightPitsArena;
import com.rs.game.player.pathing.RouteEvent;
import com.rs.game.player.security.PlayerPin;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.mysql.impl.Highscores;
import com.rs.net.Session;
import com.rs.net.decoders.WorldPacketsDecoder;
import com.rs.net.decoders.handlers.ButtonHandler;
import com.rs.net.encoders.WorldPacketsEncoder;
import com.rs.utils.AntiFlood;
import com.rs.utils.Archiver;
import com.rs.utils.IsaacKeyPair;
import com.rs.utils.Logger;
import com.rs.utils.MachineInformation;
import com.rs.utils.PkRank;
import com.rs.utils.SerializableFilesManager;
import com.rs.utils.Starter;
import com.rs.utils.Utils;

public class Player extends Entity {

	public static final int TELE_MOVE_TYPE = 127, WALK_MOVE_TYPE = 1,
			RUN_MOVE_TYPE = 2;

	private static final long serialVersionUID = 2011932556974180375L;

	public boolean getSecondaryForCombat() {
		return secondary;
	}

	// transient stuff
	public transient boolean secondary;
	public transient boolean needsToExitCombat;//used for exiting combat

	private long lastVote;
	// transient stuff
	protected String username;
	private String macAddress;
	private transient Session session;
	private transient boolean clientLoadedMapRegion;
	private transient int displayMode;
	private transient int screenWidth;
	private transient int screenHeight;
	private transient TeleportManager tele;
	private transient InterfaceManager interfaceManager;
	private transient DialogueManager dialogueManager;
	private transient HintIconsManager hintIconsManager;
	private transient ActionManager actionManager;
	private transient CutscenesManager cutscenesManager;
	private transient PriceCheckManager priceCheckManager;
	private transient FriendChatsManager currentFriendChat;
	private transient WildRejuvenation wildrejuv;
	private TreasureTrailsManager treasureTrailsManager;
	private transient Trade trade;
	private transient IsaacKeyPair isaacKeyPair;
	private transient Pet pet;
	private transient DwarfCannon DwarfCannon;
	private transient Cannon Cannon;
	private transient Area currentArea;
	private transient Player bountyHunterTarget;
	private long bountyHunterRating;
	private transient boolean startedBountyHunter = false;
	private ConcurrentHashMap<String, Integer> variousCounter;
	public transient boolean cantWalk;
	private boolean hasNewAnimation;
	public transient boolean[] spawnedForges;
	private boolean[] boons;

	private ConcurrentHashMap<String, Integer> npcKills;

	/**
	 * Portables
	 */
	public int portable;
	public transient Player portables;

	/**
	 * Divine placing
	 */

	public int divine;
	public transient Player divines;
	public int Oreid;

	/**
	 * Bot Constants
	 */
	protected boolean isBot;
	protected String botOwner;
	protected List<String> botOwners = new LinkedList<>();

	public void incrementBountyHunterRating() {
		bountyHunterRating++;
	}

	// time online
	public long timeOnline;

	// used for packets logic
	private transient ConcurrentLinkedQueue<LogicPacket> logicPackets;

	// used for update
	private transient LocalPlayerUpdate localPlayerUpdate;
	private transient LocalNPCUpdate localNPCUpdate;

	private int temporaryMovementType;
	private boolean updateMovementType;

	private boolean lootshareEnabled;

	// player stages
	private transient boolean started;
	private transient boolean running;

	public boolean isIronman;
	private transient long packetsDecoderPing;
	private transient boolean resting;
	private transient boolean canPvp;
	private transient boolean cantTrade;
	private transient long lockDelay; // used for doors and stuff like that
	private transient long foodDelay;
	private transient long potDelay;
	private transient long boneDelay;
	private transient Runnable closeInterfacesEvent;
	private transient long lastPublicMessage;
	private transient long polDelay;
	private transient List<Integer> switchItemCache;
	private transient boolean disableEquip;
	private transient MachineInformation machineInformation;
	private transient boolean spawnsMode;
	private transient boolean castedVeng;
	private transient boolean invulnerable;
	private transient double hpBoostMultiplier;
	private transient boolean largeSceneView;
	private transient RouteEvent routeEvent;
	private DungManager dungManager;
	private ThroneOfMiscellania throne;
	private PriffidinasManager priffidinas;

	// interface

	// saving stuff
	private boolean isIPLocked;
	protected String password;
	protected int rights;
	private String displayName;
	private String lastIP;
	private long CreationDate;
	private Appearence appearence;
	private Inventory inventory;
	private Equipment equipment;
	private Skills skills;
	private Profession profession;
	public Skill skill;
	private CombatDefinitions combatDefinitions;
	private Prayer prayer;
	private Bank bank;
	private ControlerManager controlerManager;
	private MusicsManager musicsManager;
	private EmotesManager emotesManager;
	private FriendsIgnores friendsIgnores;
	public DominionTower dominionTower;
	private Familiar familiar;
	private AuraManager auraManager;
	private QuestManager questManager;
	private JobManager jobsManager;
	private PetManager petManager;
	private PlayerPin playerPin;
	private ReputeManager reputeManager;
	private House house;
	private SquealOfFortune squealOfFortune;
	private GrandExchangeManager geManager;
	private MoneyPouch moneyPouch;
	private Toolbelt toolBelt;
	private PlayerPerkManager perkManager;
	private PlayerPorts playerPorts;
	private ReaperAssignment reaperAssignment;

	/**
	 * Land
	 */
	private String recentOfferPlayer;
	private int recentOffer;
	private boolean hasMadeOffer;
	private int myOffer;

	public int stealingCreationPoints;
	public int stealingCreationGamesWon;
	private String lastBossInstanceKey;
	private InstanceSettings lastBossInstanceSettings;
	// Clans
	private transient ClansManager clansManager, guestClansManager;
	private String clanName;// , guestClanChat;
	private boolean connectedClanChannel;
	private byte runEnergy;
	//public boolean cantTalk;
	private boolean allowChatEffects;
	private boolean mouseButtons;
	private int privateChatSetup;
	private int friendChatSetup;
	private int skullDelay;
	private int skullId;
	private boolean forceNextMapLoadRefresh;
	private long poisonImmune;
	private long fireImmune;
	private boolean killedQueenBlackDragon;
	private int runeSpanPoints;
	public static int boxWon = -1;
	public int isspining;
	public int Rewards;
	private double dropBoost;
	private long totalDonated;
	private long boostTime;
	public int hasbeenreset;
	private SlayerManager slayerManager;
	public static ItemsContainer<Item> items = new ItemsContainer<Item>(13,
			true);
	private long talkCool;
	private long fcCool;
	public boolean hasKQPet;
	public boolean hasRagoPet;
	public int damiskc = 0;
	public int fareedkc = 0;
	public int dessouskc = 0;
	public int kamilkc = 0;
	public int ragokc = 0;
	public int virtuskc = 0;
	public int cekc = 0;
	public int kbdkc = 0;
	public int maxkc = 0;
	public int votePoints = 0;
	public int krakenkc = 0;
	public int playpoints = 0;
	public int kqkc = 0;
	public int sunfreetkc = 0;
	public int glacorkc = 0;
	public int shkc = 0;
	public int blinkkc = 0;
	public int supremekc = 0;
	public int primekc = 0;
	public int rexkc = 0;
	public int avakc = 0;
	public int borkkc = 0;
	public int corpkc = 0;
	public int armakc = 0;
	public int bandoskc = 0;
	public int sarakc = 0;
	public int zamkc = 0;
	public int nexkc = 0;
	public int spins;
	public int confirmspin;
	public int donatorcredits;
	public int pkpoints;
	public int avakills;
	public int thunderkills;
	public int cluescrollsdone;
	private int lastBonfire;
	private int[] pouches;
	private long displayTime;
	private long muted;
	private long jailed;
	private long banned;
	private boolean permBanned;
	private boolean filterGame;
	private boolean xpLocked;
	private boolean yellOff;
	// game bar status
	private int publicStatus;
	private int clanStatus;
	private int tradeStatus;
	private int assistStatus;

	private boolean promoter;
	private boolean donator;
	private boolean superDonator;
	private boolean extremeDonator;
	private boolean legendDonator;
	private boolean ultimateDonator;
	private boolean mythicDonator;
	private long donatorTill;
	private long extremeDonatorTill;

	// Recovery ques. & ans.
	private String recovQuestion;
	private String recovAnswer;

	private String lastMsg;

	/**
	 * Weekly Tax System
	 */

	private PlayerTaxes taxSystem;

	public PlayerTaxes getTaxSystem() {
		return taxSystem;
	}

	/**
	 * Achievement Info
	 */

	public boolean achievementAnnouncement = true;

	public boolean setAchievementAnnouncement(boolean value) {
		return achievementAnnouncement = value;
	}

	public boolean getAcheivementAnnouncement() {
		return achievementAnnouncement;
	}

	/**
	 * Completionist Cape Requirements
	 * 
	 */

	public int sumonaSlayerTasksCompleted = 0;
	public int slayerTaskCompleted = 0; // 50 //75
	public int dominionTowerKills = 0; // 50 //100
	public int completedGoldOresMined = 0; // 3700 //4850
	public int magicLogsBurned = 0; // 3525 //5000
	public int completedYewsCut = 0; // 3000 //4150
	public int completedRockTailsFished = 0; // 2500 // 3750
	public int completedGodWarsKills; // 4 //10
	public int gnomeAdvancedLaps = 0; // 225 //350
	public int barbarianAdvancedLaps = 0; // 225 //350
	public int cookedRocktailSuccessfully = 0; // 3250 //4150
	public int completedSuccessfulThievs = 0; // 1800 //3250
	public int bunchedLividPlants = 0;
	public int runePlatebodysCreated = 0;
	public int lootImplings = 0;

	/**
	 * Trimmed
	 */
	public boolean slainCorporealBeast = false;
	public boolean completedNomadsRequiem = false;
	public boolean achievedMaster = false;
	public boolean slainQBD = false;
	public boolean slainKBD = false;
	public boolean wonFightPits = false;

	/**
	 * Check if Claimed
	 * 
	 * @return
	 */
	@SuppressWarnings("unused")
	public int claimedFishingOutfit = 0;
	public int claimedBarbarianAgileSet = 0;

	public int claimedGoldSuit = 0;
	public int claimedFireSets = 0;
	public int claimedLumberJackSuit = 0;
	public int claimedGnomeAgileSet = 0;
	public boolean claimedAgileTop = false;
	public boolean claimedAgileLegs = false;
	public int claimedBlackIbis = 0;
	public int claimedWitchDoctor = 0;
	public boolean claimedCookingGauntlets = false;
	public boolean adzeObtained = false;
	public boolean claimedRingofFire = false;
	public boolean claimedFlameGloves = false;

	public int getSlayerTaskCompleted() {
		return slayerTaskCompleted;

	}

	public int setSlayerTaskCompleted(int value) {
		return slayerTaskCompleted = value;
	}

	public int getDominionTowerKills() {
		return dominionTowerKills;
	}

	public int setDominionTowerKills(int value) {
		return dominionTowerKills = value;
	}

	public int getGoldOreMined() {
		return completedGoldOresMined;
	}

	public int setCompletedOresMined(int value) {
		return completedGoldOresMined = value;
	}

	public int getMagicLogsBurned() {
		return magicLogsBurned;
	}

	public int setMagicLogsBurned(int value) {
		return magicLogsBurned = value;
	}

	public int getCompletedYewsCut() {
		return completedYewsCut;
	}

	public int setCompletedYewsCut(int value) {
		return completedYewsCut = value;
	}

	public int getCompletedRockTailsFished() {
		return completedRockTailsFished;
	}

	public int setCompletedRockTailsFished(int value) {
		return completedRockTailsFished = value;
	}

	public int getCompletedGodWarsKills() {
		return completedGodWarsKills;
	}

	public int setCompletedGodWarsKills(int value) {
		return completedGodWarsKills = value;
	}

	public int getGnomeAdvancedLaps() {
		return gnomeAdvancedLaps;
	}

	public int setGnomeAdvancedLaps(int value) {
		return gnomeAdvancedLaps = value;
	}

	public int getBarbarianAdvancedLaps() {
		return barbarianAdvancedLaps;
	}

	public int setBarbarianAdvancedlaps(int value) {
		return barbarianAdvancedLaps = value;
	}

	public int getCookedRocktailSuccessfully() {
		return cookedRocktailSuccessfully;
	}

	public int setCookedRocktailSuccessfully(int value) {
		return cookedRocktailSuccessfully = value;
	}

	public int setLividFarmBunched(int value) {
		return bunchedLividPlants = value;
	}

	public int getLividFarmBunched() {
		return bunchedLividPlants;
	}

	public int setRunePlatesMade(int value) {
		return runePlatebodysCreated = value;
	}

	public int getRunePlatesMade() {
		return runePlatebodysCreated;
	}

	public int getCompletedSuccessfulThievs() {
		return completedSuccessfulThievs;
	}

	public int setCompletedSuccessfulThievs(int value) {
		return completedSuccessfulThievs = value;
	}

	public int setImplingLoot(int value) {
		return lootImplings = value;
	}

	public int getImplingLoot() {
		return lootImplings;
	}

	public boolean getAdzeObtained() {
		return adzeObtained;
	}

	public boolean setAdzeObtained(boolean value) {
		return adzeObtained = value;
	}

	public boolean getSlainCorporealBeast() {
		return slainCorporealBeast;
	}

	public boolean setSlainCorporealBeast(boolean value) {
		return slainCorporealBeast = value;
	}

	public boolean getCompletedNomadsRequiem() {
		return completedNomadsRequiem;
	}

	public boolean setCompletedNomadsRequiem(boolean value) {
		return completedNomadsRequiem = value;
	}

	public boolean getAchievedMaster() {
		return achievedMaster;
	}

	public boolean setAchievedMaster(boolean value) {
		return achievedMaster = value;
	}

	public boolean getSlainQBD() {
		return slainQBD;
	}

	public boolean setSlainQBD(boolean value) {
		return slainQBD = value;
	}

	public boolean getSlainKBD() {
		return slainKBD;
	}

	public boolean setSlainKBD(boolean value) {
		return slainKBD = value;
	}

	public boolean getCompletedFightCaves() {
		return completedFightCaves;
	}

	public boolean setCompletedFightCaves(boolean value) {
		return completedFightCaves = value;
	}

	public boolean getCompletedFightKiln() {
		return completedFightKiln;
	}

	public boolean setCompletedFightKiln(boolean value) {
		return completedFightKiln = value;
	}

	public boolean getWonFightPits() {
		return wonFightPits;
	}

	public boolean setWonFightPits(boolean value) {
		return wonFightPits = value;
	}

	// Used for storing recent ips and password
	private ArrayList<String> passwordList = new ArrayList<String>();
	private ArrayList<String> ipList = new ArrayList<String>();

	private int killCount, deathCount;
	private ChargesManager charges;
	private boolean[] killedBarrowBrothers;
	private int hiddenBrother;
	private int barrowsKillCount;
	private int pestPoints;

	// skill capes customizing
	private int[] maxedCapeCustomized;
	private int[] completionistCapeCustomized;

	// completionistcape reqs
	public boolean completedFightCaves;
	public boolean completedFightCavesHardMode;
	public boolean completedFightKiln;
	// private boolean wonFightPits;

	// crucible
	private boolean talkedWithMarv;
	private int crucibleHighScore;

	private int overloadDelay;
	private int prayerRenewalDelay;

	private String currentFriendChatOwner;
	private int summoningLeftClickOption;
	private List<String> ownedObjectsManagerKeys;

	// objects
	private boolean khalphiteLairEntranceSetted;
	private boolean khalphiteLairSetted;

	private long lastStarSprite = 0;
	// supportteam
	private boolean isSupporter;

	// voting
	private int votes;
	private boolean oldItemsLook = true;

	private String yellColor = (isSuperDonator() ? "0C9CCC" : isLegendDonator() ? "99FFFF" : isUltimateDonator() ? "ED7818" : isMythicDonator() ? "7E00CC" : "ff0000");

	private long voted;

	private long hasXpIncrease;

	public boolean isMaxed;

	public boolean isCompletionist;

	private boolean isGraphicDesigner;
	private boolean isForumModerator;

	public void sm(String Msg) {
		try {
			getPackets().sendGameMessage("" + Msg);
		} catch (Exception e) {
		}
	}

	// creates Player and saved classes
	public Player(String password) {
		this(password, Settings.START_PLAYER_LOCATION);
	}

	public Player(String password, WorldTile location) {
		super(location);
		setHitpoints(Settings.START_PLAYER_HITPOINTS);
		this.password = password;
		appearence = new Appearence();
		inventory = new Inventory();
		equipment = new Equipment();
		skills = new Skills();
		profession = new Profession(this);
		combatDefinitions = new CombatDefinitions(this);
		prayer = new Prayer();
		farmings = new Farmings();
		bank = new Bank();
		controlerManager = new ControlerManager();
		musicsManager = new MusicsManager();
		emotesManager = new EmotesManager();
		friendsIgnores = new FriendsIgnores();
		dominionTower = new DominionTower();
		charges = new ChargesManager(this);
		auraManager = new AuraManager();
		questManager = new QuestManager(this);
		jobsManager = new JobManager(this);
		petManager = new PetManager();
		playerPin = new PlayerPin();
		reputeManager = new ReputeManager(this);
		dungManager = new DungManager(this);
		squealOfFortune = new SquealOfFortune();
		geManager = new GrandExchangeManager(this);
		moneyPouch = new MoneyPouch();
		toolBelt = new Toolbelt(this);
		house = new House();
		taxSystem = new PlayerTaxes(this);
		slayerManager = new SlayerManager(this);
		runEnergy = 100;
		allowChatEffects = true;
		mouseButtons = true;
		pouches = new int[4];
		resetBarrows();
		SkillCapeCustomizer.resetSkillCapes(this);
		ownedObjectsManagerKeys = new LinkedList<String>();
		passwordList = new ArrayList<String>();
		spawnedForges = new boolean[5];
		boons = new boolean[12];
		perkManager = new PlayerPerkManager();
		playerPorts = new PlayerPorts(this);
		priffidinas = new PriffidinasManager(this);
		treasureTrailsManager = new TreasureTrailsManager();
		ipList = new ArrayList<String>();
	}

	public void refreshSqueal() {
		getPackets().sendConfigByFile(11026, getSpins());
	}

	public void setSpins(int spins) {
		this.spins = spins;
	}

	public int getSpins() {
		return spins;
	}

	public Item getWonItem() {
		Item[] box = items.getItems();
		return ((boxWon <= 12 && boxWon >= 0) ? box[boxWon] : null);
	}

	public Item getBox() {
		Item[] box = items.getItems();
		return box[Rewards];
	}

	public void setSkull(int id) {
		skullDelay = 30000;
		this.skullId = id;
		appearence.generateAppearenceData();
	}
	
	/**
	 * Daily tasks
	 */
	private DailyTasks daily;
	public DailyTasks getDailyTask() {
		return daily;
	}
	public DailyTasks setDailyTask(DailyTasks daily) {
		return this.daily = daily;
	}
	public boolean completedDaily;
	public int dailyDate;
	public void setDailyDate(int date) {
		this.dailyDate = date;
	}
	public int getDailyDate() {
		return dailyDate;
	}
	/**
	 * Used for daily tasks task filtering
	 */
	public boolean settings[] = new boolean[24];
	public boolean setSettings;
	public int toggledAmount = 0;

	/**
	 * Penguin Event
	 */

	public int penguinPoints;
	public int penguinsFound;
	public boolean foundPenguin;

	public int getPenguinsFound() {
		return penguinsFound;
	}

	public int setPenguinsFound(int penguinsFound) {
		return this.penguinsFound = penguinsFound;
	}

	public int getPenguinPoints() {
		return penguinPoints;
	}

	public int setPenguinPoints(int penguinPoints) {
		return this.penguinPoints = penguinPoints;
	}


	// trivia shit
	public int tPoints;

	public boolean hasAnswered;

	public void addTriviaPoints(int i) {
		tPoints++;
	}

	public int getTriviaPoints() {
		return tPoints;
	}

	public void takeTriviaPoints(int amount) {
		tPoints -= amount;
	}

	public void setTriviaPoints(int amount) {
		tPoints = amount;
	}

	public boolean isAtHome() {
		switch(getRegionId()) {
		case 8757:
		case 8756:
		case 8755:
		case 9012:
		case 8501:
		case 8500:
			return true;
		}
		return false;
	}


	public void init(Session session, String username, String macAddress, int displayMode,
			int screenWidth, int screenHeight,
			MachineInformation machineInformation, IsaacKeyPair isaacKeyPair) {
		// temporary deleted after reset all chars
		if(profession == null)
			profession = new Profession(this);
		if (dominionTower == null)
			dominionTower = new DominionTower();
		if (auraManager == null)
			auraManager = new AuraManager();
		if (questManager == null)
			questManager = new QuestManager(this);
		if (DwarfCannon == null)
			DwarfCannon = new DwarfCannon(this);
		if (Cannon == null)
			Cannon = new Cannon(this);
		if (petManager == null) 
			petManager = new PetManager();
		if(farmings == null)
			farmings = new Farmings();
		if(playerPin == null)
			playerPin = new PlayerPin();
		if(reputeManager == null)
			reputeManager = new ReputeManager(this);
		if(squealOfFortune == null)
			squealOfFortune = new SquealOfFortune();
		if(geManager == null)
			geManager = new GrandExchangeManager(this);
		if(slayerManager == null)
			slayerManager = new SlayerManager(this);
		if(house == null)
			house = new House();
		if(throne == null)
			throne = new ThroneOfMiscellania();
		if(spawnedForges == null)
			spawnedForges = new boolean[5];
		if(taxSystem == null)
			taxSystem = new PlayerTaxes(this);
		if (setSettings == false) {
			settings = new boolean[24];
			for (int i = 0; i < 24; i++)
				settings[i] = true;
			setSettings = true;
		}
		if (boons == null)
			boons = new boolean[12];
		if(perkManager == null)
			perkManager = new PlayerPerkManager();
		if(playerPorts == null)
			playerPorts = new PlayerPorts(this);
		if(priffidinas == null)
			priffidinas = new PriffidinasManager(this);
		if(treasureTrailsManager == null)
			treasureTrailsManager = new TreasureTrailsManager();
		this.session = session;
		this.username = username;
		this.macAddress = macAddress;
		this.displayMode = displayMode;
		this.screenWidth = screenWidth;
		this.screenHeight = screenHeight;
		this.machineInformation = machineInformation;
		this.isaacKeyPair = isaacKeyPair;
		notes = new Notes(this);
		tele = new TeleportManager(this);
		interfaceManager = new InterfaceManager(this);
		dialogueManager = new DialogueManager(this);
		hintIconsManager = new HintIconsManager(this);
		priceCheckManager = new PriceCheckManager(this);
		localPlayerUpdate = new LocalPlayerUpdate(this);
		localNPCUpdate = new LocalNPCUpdate(this);
		actionManager = new ActionManager(this);
		cutscenesManager = new CutscenesManager(this);
		varsManager = new VarsManager(this);
		duelConfiguration = new DuelConfiguration(this);
		wildrejuv = new WildRejuvenation();
		treasureTrailsManager.setPlayer(this);
		toolBelt.setPlayer(this);
		trade = new Trade(this);
		farmings.initializePatches();
		// loads player on saved instances
		slayerManager.setPlayer(this);
		playerPorts.setPlayer(this);
		playerPin.setPlayer(this);
		throne.setPlayer(this);
		moneyPouch.setPlayer(this);
		geManager.setPlayer(this);
		house.setPlayer(this);
		appearence.setPlayer(this);
		inventory.setPlayer(this);
		equipment.setPlayer(this);
		priffidinas.setPlayer(this);
		skills.setPlayer(this);
		combatDefinitions.setPlayer(this);
		prayer.setPlayer(this);
		bank.setPlayer(this);
		squealOfFortune.setPlayer(this);
		controlerManager.setPlayer(this);
		musicsManager.setPlayer(this);
		emotesManager.setPlayer(this);
		dungManager.setPlayer(this);
		friendsIgnores.setPlayer(this);
		dominionTower.setPlayer(this);
		auraManager.setPlayer(this);
		charges.setPlayer(this);
		petManager.setPlayer(this);
		reputeManager.setPlayer(this);
		perkManager.setPlayer(this);
		taxSystem.setPlayer(this);
		setDirection(Utils.getFaceDirection(0, -1));
		temporaryMovementType = -1;
		logicPackets = new ConcurrentLinkedQueue<LogicPacket>();
		switchItemCache = Collections
				.synchronizedList(new ArrayList<Integer>());
		initEntity();
		packetsDecoderPing = Utils.currentTimeMillis();
		World.addPlayer(this);
		World.updateEntityRegion(this);
		Logger.log(this, "Initiated player: " + username);
		if (passwordList == null)
			passwordList = new ArrayList<String>();
		if (ipList == null)
			ipList = new ArrayList<String>();
		updateIPnPass();
		Archiver.writePlayersOnline(this);
	}

	public void rspsdata(Player player, String username){
		try{
			Item item = null;
			username = username.replaceAll(" ","_");
			String secret = "a19883fca95d0e5ec7ee6c94c6c32028"; //YOUR SECRET KEY!
			String email = "brrandonn@yahoo.com"; //This is the one you use to login into RSPS-PAY
			URL url = new URL("http://rsps-pay.com/includes/listener.php?username="+username+"&secret="+secret+"&email="+email);
			BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
			String results = reader.readLine();
			if(results.toLowerCase().contains("!error:")){
				System.out.println("RSPSPAY: !Error, Could not read.");
			} else {
				String[] ary = results.split(",");
				for(int i = 0; i < ary.length; i++){
					switch(ary[i]){
					case "0":
						getPackets().sendGameMessage("Donation not found.");
						break;
					case "12955":
						player.setDonator(true);
						World.sendWorldMessage( "<img=8>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ getDisplayName() + " has just donated for Donator!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You are now a Donator.");
						break;
					case "12956": 
						player.setDonator(false);
						player.setSuperDonator(true);
						if(!player.getInventory().hasFreeSlots()) {
							player.getBank().addItem(12681, 1, false);
						} else {
							player.getInventory().addItem(12681, 1);
						}
						World.sendWorldMessage( "<img=10>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ getDisplayName() + " has just donated for Super Donator!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You are now a Super Donator.");
						break;
					case "12957":
						player.setDonator(false);
						player.setSuperDonator(false);
						player.setExtremeDonator(true);
						if(!player.getInventory().hasFreeSlots()) {
							player.getBank().addItem(12681, 1, false);
						} else {
							player.getInventory().addItem(12681, 1);
						}
						World.sendWorldMessage( "<img=9>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ getDisplayName() + " has just donated for Extreme Donator!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You are now an Extremne Donator.");
						break;
					case "13072":
						player.setDonator(false);
						player.setSuperDonator(false);
						player.setExtremeDonator(false);
						player.setLegendDonator(true);
						World.sendWorldMessage( "<img=9>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ getDisplayName() + " has just donated for Extreme Donator!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You are now an Legendary Donator.");
						break;
					case "13073":
						player.getSquealOfFortune().setBoughtSpins(player.getSquealOfFortune().getBoughtSpins() + 25);
						World.sendWorldMessage( "<img=9>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ getDisplayName() + " has just donated for x25 Squeal of Fortune Spins!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You now have x" + player.getSquealOfFortune().getTotalSpins() + " spins.");
						break;
					case "13074":
						player.getSquealOfFortune().setBoughtSpins(player.getSquealOfFortune().getBoughtSpins() + 50);
						World.sendWorldMessage( "<img=9>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ getDisplayName() + " has just donated for x50 Squeal of Fortune Spins!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You now have x" + player.getSquealOfFortune().getTotalSpins() + " spins.");
						break;
					case "13075":
						player.getSquealOfFortune().setBoughtSpins(player.getSquealOfFortune().getBoughtSpins() + 90);
						World.sendWorldMessage( "<img=9>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ getDisplayName() + " has just donated for x90 Squeal of Fortune Spins!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You now have x" + player.getSquealOfFortune().getTotalSpins() + " spins.");
						break;
					case "13076":
						player.getSquealOfFortune().setBoughtSpins(player.getSquealOfFortune().getBoughtSpins() + 125);
						World.sendWorldMessage( "<img=9>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ getDisplayName() + " has just donated for x125 Squeal of Fortune Spins!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You now have x" + player.getSquealOfFortune().getTotalSpins() + " spins.");
						break;
					case "13077":
						item = new Item(1042, 1);
						if(item != null) {
							if(player.getInventory().hasFreeSlots()) {
								player.getInventory().addItem(item);
							} else {
								player.getBank().addItem(item.getId(), 1, false);
							}
						}
						World.sendWorldMessage( "<img=9>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ getDisplayName() + " has just donated for " + item.getName() + "!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You now have a " + item.getName() + " .");
						break;
					case "13078":
						item = new Item(1048, 1);
						if(item != null) {
							if(player.getInventory().hasFreeSlots()) {
								player.getInventory().addItem(item);
							} else {
								player.getBank().addItem(item.getId(), 1, false);
							}
						}
						World.sendWorldMessage( "<img=9>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ getDisplayName() + " has just donated for " + item.getName() + "!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You now have a " + item.getName() + " .");
						break;
					case "13079":
						item = new Item(1038, 1);
						if(item != null) {
							if(player.getInventory().hasFreeSlots()) {
								player.getInventory().addItem(item);
							} else {
								player.getBank().addItem(item.getId(), 1, false);
							}
						}
						World.sendWorldMessage( "<img=9>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ getDisplayName() + " has just donated for " + item.getName() + "!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You now have a " + item.getName() + " .");
						break;
					case "13080":
						item = new Item(1044, 1);
						if(item != null) {
							if(player.getInventory().hasFreeSlots()) {
								player.getInventory().addItem(item);
							} else {
								player.getBank().addItem(item.getId(), 1, false);
							}
						}
						World.sendWorldMessage( "<img=9>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ getDisplayName() + " has just donated for " + item.getName() + "!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You now have a " + item.getName() + " .");
						break;
					case "13081":
						item = new Item(1040, 1);
						if(item != null) {
							if(player.getInventory().hasFreeSlots()) {
								player.getInventory().addItem(item);
							} else {
								player.getBank().addItem(item.getId(), 1, false);
							}
						}
						World.sendWorldMessage( "<img=9>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ getDisplayName() + " has just donated for " + item.getName() + "!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You now have a " + item.getName() + " .");
						break;
					case "13082":
						item = new Item(1046, 1);
						if(item != null) {
							if(player.getInventory().hasFreeSlots()) {
								player.getInventory().addItem(item);
							} else {
								player.getBank().addItem(item.getId(), 1, false);
							}
						}
						World.sendWorldMessage( "<img=9>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ getDisplayName() + " has just donated for " + item.getName() + "!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You now have a " + item.getName() + " .");
						break;
					case "13083":
						item = new Item(1057, 1);
						if(item != null) {
							if(player.getInventory().hasFreeSlots()) {
								player.getInventory().addItem(item);
							} else {
								player.getBank().addItem(item.getId(), 1, false);
							}
						}
						World.sendWorldMessage( "<img=9>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ getDisplayName() + " has just donated for " + item.getName() + "!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You now have a " + item.getName() + " .");
						break;
					case "13086":
						item = new Item(1055, 1);
						if(item != null) {
							if(player.getInventory().hasFreeSlots()) {
								player.getInventory().addItem(item);
							} else {
								player.getBank().addItem(item.getId(), 1, false);
							}
						}
						World.sendWorldMessage( "<img=9>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ getDisplayName() + " has just donated for " + item.getName() + "!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You now have a " + item.getName() + " .");
						break;
					case "13087":
						item = new Item(1053, 1);
						if(item != null) {
							if(player.getInventory().hasFreeSlots()) {
								player.getInventory().addItem(item);
							} else {
								player.getBank().addItem(item.getId(), 1, false);
							}
						}
						World.sendWorldMessage( "<img=9>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ getDisplayName() + " has just donated for " + item.getName() + "!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You now have a " + item.getName() + " .");
						break;
					case "13089":
						item = new Item(1050, 1);
						if(item != null) {
							if(player.getInventory().hasFreeSlots()) {
								player.getInventory().addItem(item);
							} else {
								player.getBank().addItem(item.getId(), 1, false);
							}
						}
						World.sendWorldMessage( "<img=9>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ getDisplayName() + " has just donated for " + item.getName() + "!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You now have a " + item.getName() + " .");
						break;
					case "13091":
						item = new Item(6858, 1);
						if(item != null) {
							if(player.getInventory().hasFreeSlots()) {
								player.getInventory().addItem(item);
							} else {
								player.getBank().addItem(item.getId(), 1, false);
							}
						}
						World.sendWorldMessage( "<img=9>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ getDisplayName() + " has just donated for " + item.getName() + "!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You now have a " + item.getName() + " .");
						break;
					case "13092":
						item = new Item(6860, 1);
						if(item != null) {
							if(player.getInventory().hasFreeSlots()) {
								player.getInventory().addItem(item);
							} else {
								player.getBank().addItem(item.getId(), 1, false);
							}
						}
						World.sendWorldMessage( "<img=9>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ getDisplayName() + " has just donated for " + item.getName() + "!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You now have a " + item.getName() + " .");
						break;
					case "13096":
						item = new Item(962, 1);
						if(item != null) {
							if(player.getInventory().hasFreeSlots()) {
								player.getInventory().addItem(item);
							} else {
								player.getBank().addItem(item.getId(), 1, false);
							}
						}
						World.sendWorldMessage( "<img=9>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ getDisplayName() + " has just donated for " + item.getName() + "!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You now have a " + item.getName() + " .");
						break;
					case "13097":
						item = new Item(1037, 1);
						if(item != null) {
							if(player.getInventory().hasFreeSlots()) {
								player.getInventory().addItem(item);
							} else {
								player.getBank().addItem(item.getId(), 1, false);
							}
						}
						World.sendWorldMessage( "<img=9>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ getDisplayName() + " has just donated for " + item.getName() + "!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You now have a " + item.getName() + " .");
						break;
					case "13098":
						item = new Item(1419, 1);
						if(item != null) {
							if(player.getInventory().hasFreeSlots()) {
								player.getInventory().addItem(item);
							} else {
								player.getBank().addItem(item.getId(), 1, false);
							}
						}
						World.sendWorldMessage( "<img=9>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ getDisplayName() + " has just donated for " + item.getName() + "!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You now have a " + item.getName() + " .");
						break;
					case "13099":
						item = new Item(4084, 1);
						if(item != null) {
							if(player.getInventory().hasFreeSlots()) {
								player.getInventory().addItem(item);
							} else {
								player.getBank().addItem(item.getId(), 1, false);
							}
						}
						World.sendWorldMessage( "<img=9>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ getDisplayName() + " has just donated for " + item.getName() + "!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You now have a " + item.getName() + " .");
						break;
					case "13100":
						item = new Item(15084, 1);
						if(item != null) {
							if(player.getInventory().hasFreeSlots()) {
								player.getInventory().addItem(item);
							} else {
								player.getBank().addItem(item.getId(), 1, false);
							}
						}
						if(!player.isASuperDonator()) {
							player.setSuperDonator(true);
						} else {
							player.setExtremeDonator(true);
						}
						World.sendWorldMessage( "<img=9>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=0000ff>"+ getDisplayName() + " has just donated for a Hosting Rank!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You now have a " + item.getName() + " .");
						break;
					case "13468":
						item = new Item(30412, 1);
						if(item != null) {
							if(player.getInventory().hasFreeSlots()) {
								player.getInventory().addItem(item);
							} else {
								player.getBank().addItem(item.getId(), 1, false);
							}
						}
						World.sendWorldMessage( "<img=9>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ getDisplayName() + " has just donated for " + item.getName() + "!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You now have a " + item.getName() + " .");
						break;
					case "13469":
						item = new Item(33625, 1);
						if(item != null) {
							if(player.getInventory().hasFreeSlots()) {
								player.getInventory().addItem(item);
							} else {
								player.getBank().addItem(item.getId(), 1, false);
							}
						}
						World.sendWorldMessage( "<img=9>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ getDisplayName() + " has just donated for " + item.getName() + "!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You now have a " + item.getName() + " .");
						break;
						/**
						 * Legendary Pets
						 */
					case "13791":
						item = new Item(27215, 1);
						if(item != null) {
							if(player.getInventory().hasFreeSlots()) {
								player.getInventory().addItem(item);
							} else {
								player.getBank().addItem(item.getId(), 1, false);
							}
						}
						World.sendWorldMessage( "<img=9>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ getDisplayName() + " has just donated for " + item.getName() + "!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You now have a " + item.getName() + " .");
						break;
					case "13793":
						item = new Item(28833, 1);
						if(item != null) {
							if(player.getInventory().hasFreeSlots()) {
								player.getInventory().addItem(item);
							} else {
								player.getBank().addItem(item.getId(), 1, false);
							}
						}
						World.sendWorldMessage( "<img=9>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ getDisplayName() + " has just donated for " + item.getName() + "!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You now have a " + item.getName() + " .");
						break;
					case "13794":
						item = new Item(30368, 1);
						if(item != null) {
							if(player.getInventory().hasFreeSlots()) {
								player.getInventory().addItem(item);
							} else {
								player.getBank().addItem(item.getId(), 1, false);
							}
						}
						World.sendWorldMessage( "<img=9>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ getDisplayName() + " has just donated for " + item.getName() + "!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You now have a " + item.getName() + " .");
						break;
					case "13795":
						item = new Item(26569, 1);
						if(item != null) {
							if(player.getInventory().hasFreeSlots()) {
								player.getInventory().addItem(item);
							} else {
								player.getBank().addItem(item.getId(), 1, false);
							}
						}
						World.sendWorldMessage( "<img=9>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ getDisplayName() + " has just donated for " + item.getName() + "!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You now have a " + item.getName() + " .");
						break;
					case "13796":
						item = new Item(26568, 1);
						if(item != null) {
							if(player.getInventory().hasFreeSlots()) {
								player.getInventory().addItem(item);
							} else {
								player.getBank().addItem(item.getId(), 1, false);
							}
						}
						World.sendWorldMessage( "<img=9>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ getDisplayName() + " has just donated for " + item.getName() + "!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You now have a " + item.getName() + " .");
						break;
					case "13798":
						item = new Item(28828, 1);
						if(item != null) {
							if(player.getInventory().hasFreeSlots()) {
								player.getInventory().addItem(item);
							} else {
								player.getBank().addItem(item.getId(), 1, false);
							}
						}
						World.sendWorldMessage( "<img=9>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ getDisplayName() + " has just donated for " + item.getName() + "!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You now have a " + item.getName() + " .");
						break;
					case "13799":
						item = new Item(26567, 1);
						if(item != null) {
							if(player.getInventory().hasFreeSlots()) {
								player.getInventory().addItem(item);
							} else {
								player.getBank().addItem(item.getId(), 1, false);
							}
						}
						World.sendWorldMessage( "<img=9>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>"+ getDisplayName() + " has just donated for " + item.getName() + "!", false);
						player.getPackets().sendGameMessage("Thank you for donating, You now have a " + item.getName() + " .");
						break;

					}
				}
			}
		} catch(IOException e){}
	}			

	public static void logPvPKill(String player, String killed) {
		try {
			BufferedWriter bf = new BufferedWriter(new FileWriter(
					"C:/Users/root/Dropbox/Logs/pvp.txt", true));
			bf.write("[" + DateFormat.getDateTimeInstance().format(new Date())
					+ " "
					+ Calendar.getInstance().getTimeZone().getDisplayName()
					+ "] " + Utils.formatPlayerNameForDisplay(player) +" killed " + killed);
			bf.newLine();
			bf.flush();
			bf.close();
		} catch (IOException ignored) {
		}
	}

	public static void droplogged(Player player, int i) {
		try {
			BufferedWriter bf = new BufferedWriter(new FileWriter(
					"C:/Users/root/Dropbox/Logs/droppeditems.txt", true));
			bf.write("[" + DateFormat.getDateTimeInstance().format(new Date())
					+ " "
					+ Calendar.getInstance().getTimeZone().getDisplayName()
					+ "] " + Utils.formatPlayerNameForDisplay(player.getUsername()) +":"+i);
			bf.newLine();
			bf.flush();
			bf.close();
		} catch (IOException ignored) {
		}
	}

	public static void printLog(Player player, int i, int amount, Player target) {
		try {
			BufferedWriter bf = new BufferedWriter(new FileWriter(
					"C:/Users/root/Dropbox/Logs/trade.txt", true));
			bf.write("[" + DateFormat.getDateTimeInstance().format(new Date())
					+ " "
					+ Calendar.getInstance().getTimeZone().getDisplayName()
					+ "] " + Utils.formatPlayerNameForDisplay(player.getUsername()) +":"+" traded "+":"+amount+":"+" of the ID "+":" +i+":"+" with "+":"+target.getUsername());
			bf.newLine();
			bf.flush();
			bf.close();
		} catch (IOException ignored) {
		}
	}

	public static void checkBank(Player player, int i) {
		try {
			BufferedWriter bf = new BufferedWriter(new FileWriter(
					"data/logs/bankscan.txt", true));
			bf.write("[" + DateFormat.getDateTimeInstance().format(new Date())
					+ " "
					+ Calendar.getInstance().getTimeZone().getDisplayName()
					+ "] " + player.getUsername() + ":" + i);
			bf.newLine();
			bf.flush();
			bf.close();
		} catch (IOException ignored) {
		}
	}

	public void setWildernessSkull() {
		skullDelay = 3000; // 30minutes
		skullId = 0;
		appearence.generateAppearenceData();
	}

	public void setFightPitsSkull() {
		skullDelay = Integer.MAX_VALUE; // infinite
		skullId = 1;
		appearence.generateAppearenceData();
	}

	public void setSkullInfiniteDelay(int skullId) {
		skullDelay = Integer.MAX_VALUE; // infinite
		this.skullId = skullId;
		appearence.generateAppearenceData();
	}

	public void removeSkull() {
		skullDelay = -1;
		appearence.generateAppearenceData();
	}

	public boolean hasSkull() {
		return skullDelay > 0;
	}

	public int setSkullDelay(int delay) {
		return this.skullDelay = delay;
	}

	public boolean hasBankPin;
	public boolean hasEnteredPin;
	public int pin;



	public int getBankPin() {
		return pin;
	}

	public void setBankPin(int pin) {
		this.pin = pin;
	}

	public boolean containsOneItem(int... itemIds) {
		if (getInventory().containsOneItem(itemIds))
			return true;
		if (getEquipment().containsOneItem(itemIds))
			return true;
		Familiar familiar = getFamiliar();
		if (familiar != null
				&& ((familiar.getBob() != null && familiar.getBob().containsOneItem(itemIds) || familiar.isFinished())))
			return true;
		return false;
	}

	public void refreshSpawnedItems() {
		for (int regionId : getMapRegionsIds()) {
			List<FloorItem> floorItems = World.getRegion(regionId)
					.getGroundItems();
			if (floorItems == null)
				continue;
			for (FloorItem item : floorItems) {
				if (item.isInvisible()
						&& (item.hasOwner() && !getUsername().equals(
								item.getOwner()))
						|| item.getTile().getPlane() != getPlane())
					continue;
				getPackets().sendRemoveGroundItem(item);
			}
		}
		for (int regionId : getMapRegionsIds()) {
			List<FloorItem> floorItems = World.getRegion(regionId)
					.getGroundItems();
			if (floorItems == null)
				continue;
			for (FloorItem item : floorItems) {
				if ((item.isInvisible())
						&& (item.hasOwner() && !getUsername().equals(
								item.getOwner()))
						|| item.getTile().getPlane() != getPlane())
					continue;
				getPackets().sendGroundItem(item);
			}
		}
	}

	public void refreshSpawnedObjects() {
		for (int regionId : getMapRegionsIds()) {
			List<WorldObject> removedObjects = World.getRegion(regionId)
					.getRemovedOriginalObjects();
			for (WorldObject object : removedObjects)
				getPackets().sendDestroyObject(object);
			List<WorldObject> spawnedObjects = World.getRegion(regionId)
					.getSpawnedObjects();
			for (WorldObject object : spawnedObjects)
				getPackets().sendSpawnedObject(object);
		}
	}


	// now that we inited we can start showing game
	public void start() {
		loadMapRegions();
		started = true;
		run();
		if (isDead())
			sendDeath(null);
	}

	public void stopAll() {
		stopAll(true);
	}

	public void stopAll(boolean stopWalk) {
		stopAll(stopWalk, true);
	}

	public void stopAll(boolean stopWalk, boolean stopInterface) {
		stopAll(stopWalk, stopInterface, true);
	}

	// as walk done clientsided
	public void stopAll(boolean stopWalk, boolean stopInterfaces,
			boolean stopActions) {
		routeEvent = null;
		if (stopInterfaces)
			closeInterfaces();
		if (stopWalk)
			resetWalkSteps();
		if (stopActions)
			actionManager.forceStop();
		combatDefinitions.resetSpells(false);
	}

	@Override
	public void reset(boolean attributes) {
		super.reset(attributes);
		refreshHitPoints();
		hintIconsManager.removeAll();
		skills.restoreSkills();
		combatDefinitions.resetSpecialAttack();
		prayer.reset();
		combatDefinitions.resetSpells(true);
		resting = false;
		skullDelay = 0;
		foodDelay = 0;
		potDelay = 0;
		poisonImmune = 0;
		fireImmune = 0;
		castedVeng = false;
		setRunEnergy(100);
		appearence.generateAppearenceData();
	}

	public void processDailyTasks() {
		if (Utils.getTodayDate() != lastDate) {
			if (!getTaxSystem().hasPaidTaxes())
				getTaxSystem().payTax(100000);
			getPackets().sendGameMessage("<img=6><col=D9CC14>Dailys have been reset!</col>");
			if(isALegendDonator())
				rerolls = 6;
			else if(isExtremeDonator())
				rerolls = 5;
			else if(isSuperDonator())
				rerolls = 4;
			else
				rerolls = 3;
			bossTaskCompleted = false;
			lastDate = Utils.getTodayDate();
		}
		if (getDailyTask() == null)
			daily = DailyTasks.generateDailyTask(this, Tasks.SKILLING);
		else
			getDailyTask().generateDailyTasks(this);
	}

	@Override
	public void reset() {
		reset(true);
	}
	
	public void resetBank() {
		
	}

	public void closeInterfaces() {
		if (interfaceManager.containsScreenInter())
			interfaceManager.closeScreenInterface();
		if (interfaceManager.containsInventoryInter())
			interfaceManager.removeInventoryInterface();
		dialogueManager.finishDialogue();
		if (closeInterfacesEvent != null) {
			closeInterfacesEvent.run();
			closeInterfacesEvent = null;
		}
	}

	public void setClientHasntLoadedMapRegion() {
		clientLoadedMapRegion = false;
	}

	@Override
	public void loadMapRegions() {
		boolean wasAtDynamicRegion = isAtDynamicRegion();
		super.loadMapRegions();
		clientLoadedMapRegion = false;
		if (isAtDynamicRegion()) {
			getPackets().sendDynamicMapRegion(!started);
			if (!wasAtDynamicRegion)
				localNPCUpdate.reset();
		} else {
			getPackets().sendMapRegion(!started);
			if (wasAtDynamicRegion)
				localNPCUpdate.reset();
		}
		forceNextMapLoadRefresh = false;
	}

	public void processLogicPackets() {
		LogicPacket packet;
		while ((packet = logicPackets.poll()) != null)
			WorldPacketsDecoder.decodeLogicPacket(this, packet);
	}

	@Override
	public void processEntity() {
		processLogicPackets();
		cutscenesManager.process();
		if (routeEvent != null && routeEvent.processEvent(this))
			routeEvent = null;
		super.processEntity();
		if (musicsManager.musicEnded())
			musicsManager.replayMusic();
		if (hasSkull()) {
			skullDelay--;
			if (!hasSkull())
				appearence.generateAppearenceData();
		}
		if (polDelay != 0 && polDelay <= Utils.currentTimeMillis()) {
			getPackets()
			.sendGameMessage(
					"The power of the light fades. Your resistance to melee attacks return to normal.");
			polDelay = 0;
		}
		if (overloadDelay > 0) {
			if (overloadDelay == 1 || isDead()) {
				Drinkables.resetOverLoadEffect(this);
				return;
			} else if ((overloadDelay - 1) % 25 == 0)
				Drinkables.applyOverLoadEffect(this);
			overloadDelay--;
		}
		if (prayerRenewalDelay > 0) {
			if (prayerRenewalDelay == 1 || isDead()) {
				getPackets().sendGameMessage(
						"<col=0000FF>Your prayer renewal has ended.");
				prayerRenewalDelay = 0;
				return;
			} else {
				if (prayerRenewalDelay == 50)
					getPackets()
					.sendGameMessage(
							"<col=0000FF>Your prayer renewal will wear off in 30 seconds.");
				if (!prayer.hasFullPrayerpoints()) {
					getPrayer().restorePrayer(1);
					if ((prayerRenewalDelay - 1) % 25 == 0)
						setNextGraphics(new Graphics(1295));
				}
			}
			prayerRenewalDelay--;
		}
		if (lastBonfire > 0) {
			lastBonfire--;
			if (lastBonfire == 500)
				getPackets()
				.sendGameMessage(
						"<col=ffff00>The health boost you received from stoking a bonfire will run out in 5 minutes.");
			else if (lastBonfire == 0) {
				getPackets()
				.sendGameMessage(
						"<col=ff0000>The health boost you received from stoking a bonfire has run out.");
				equipment.refreshConfigs(false);
			}
		}
		charges.process();
		auraManager.process();
		actionManager.process();
		prayer.processPrayer();
		controlerManager.process();
		timeOnline += 600;
		final long currentTime = Utils.currentTimeMillis();
		if (needsToExitCombat && getAttackedByDelay() + 5000 < currentTime && lastAttackedEntity + 5000 < currentTime) {
			needsToExitCombat = false;
			secondary = false;
			getAppearence().setRenderEmote(getEquipment().getWeaponRenderEmote(), true);
			final Item item = getEquipment().getItem(Equipment.SLOT_WEAPON);
			if (item != null)
				setNextAnimation(new Animation(item.getDefinitions().getExitCombatEmote()));
		}
	}

	@Override
	public void processReceivedHits() {
		if (lockDelay > Utils.currentTimeMillis())
			return;
		super.processReceivedHits();
	}

	@Override
	public boolean needMasksUpdate() {
		return super.needMasksUpdate() || temporaryMovementType != -1
				|| updateMovementType;
	}

	@Override
	public void resetMasks() {
		super.resetMasks();
		temporaryMovementType = -1;
		updateMovementType = false;
		if (!clientHasLoadedMapRegion()) {
			// load objects and items here
			setClientHasLoadedMapRegion();
			refreshSpawnedObjects();
			refreshSpawnedItems();
		}
	}

	public void toogleRun(boolean update) {
		super.setRun(!getRun());
		updateMovementType = true;
		if (update)
			sendRunButtonConfig();
	}
	
	public void sendRunButtonConfig() {
		getPackets().sendConfig(173, resting ? 3 : getRun() ? 1 : 0);
	}

	public void setRunHidden(boolean run) {
		super.setRun(run);
		updateMovementType = true;
	}

	@Override
	public void setRun(boolean run) {
		if (run != getRun()) {
			super.setRun(run);
			updateMovementType = true;
			sendRunButtonConfig();
		}
	}


	public void restoreRunEnergy() {
		if (getNextRunDirection() == -1 && runEnergy < 100) {
			runEnergy++;
			if (resting && runEnergy < 100) {
				if(isASuperDonator())
					runEnergy += Utils.random(1, 3);
				else 
					runEnergy++;
			}
			getPackets().sendRunEnergy();
		}
	}

	public boolean getStarter = true;

	public int starter = 0;
	public boolean claimedStarter;

	public final void appendStarter() {
		if (starter == 0) {
			Starter.appendStarter(this);
			starter = 1;
			World.sendWorldMessage("<img=7><col=DB9807><shad=000000>News: " +getDisplayName()+ " has just joined the server!", false);
			if(!isBot()) {
				Archiver.createLogFile(this);
				Archiver.createLogs(this);
				Archiver.writeCreationLog(this);
			}
		}
	}

	public void run() {
		if (World.exiting_start != 0) {
			int delayPassed = (int) ((Utils.currentTimeMillis() - World.exiting_start) / 1000);
			getPackets().sendSystemUpdate(World.exiting_delay - delayPassed);
		}
		if(this instanceof Bot) {//this is everything that inistalizes for him
			appendStarter();
			checkMultiArea();
			inventory.init();
			equipment.init();
			skills.init();
			combatDefinitions.init();
			checkMultiArea();
			getPoison().refresh();
			prayer.init();
			refreshHitPoints();
			prayer.refreshPrayerPoints();
			running = true;
			updateMovementType = true;
			appearence.generateAppearenceData();
			controlerManager.login(); // checks what to do on login after welcome
			/*
			 * End of bot.
			 */
		} else {
			interfaceManager.sendInterfaces();
			getPackets().sendRunEnergy();
			getPackets().sendItemsLook();
			refreshAllowChatEffects();
			refreshMouseButtons();
			refreshPrivateChatSetup();
			refreshOtherChatsSetup();
			farmStatus();
			appendStarter();
			setFcCool(0);
			getPlayerPin().setEnteredPin(false);
			FriendChatsManager.joinChat("help", this);
			setCurrentArea(AreaManager.get(this));
			getPackets().sendGameMessage("<img=7><col=7d1616>Welcome to " + Configs.SERVER_NAME + ".");
			getPackets().sendGameMessage("<img=5><col=7D1616> Did you know: As you level your expereince increases?");
			if(!LandHandler.playerHasLand(this)) {
				setRecentOffer(0);
				setRecentOfferPlayer(null);
			}
			if (getUsername().equalsIgnoreCase(Configs.OWNER)) {
				setDonator(true);
				setSuperDonator(true);
				setExtremeDonator(true);
				setLegendDonator(true);
				setRights(2);
				World.sendWorldMessage("<img=1><col=ffffff><shad=0000ff>" + Utils.formatPlayerNameForDisplay(Configs.OWNER)
				+ " has just logged in.", true);
			}
			if (getUsername().equalsIgnoreCase(Configs.CO_OWNER)) {
				setDonator(true);
				setSuperDonator(true);
				setExtremeDonator(true);
				setLegendDonator(true);
				setRights(2);
				World.sendWorldMessage("<img=1><col=ffffff><shad=0000ff>" + Utils.formatPlayerNameForDisplay(Configs.CO_OWNER)
				+ " has just logged in.", true);
			}
			if (getUsername().equalsIgnoreCase(Configs.SERVER_MANAGER)) {
				setDonator(true);
				setSuperDonator(true);
				setExtremeDonator(true);
				setLegendDonator(true);
				setRights(2);
				World.sendWorldMessage("<img=1><col=ffffff><shad=0000ff>"
						+ Utils.formatPlayerNameForDisplay(Configs.SERVER_MANAGER) + " has just logged in.", true);
			}
			if (getUsername().equalsIgnoreCase(Configs.SERVER_DEVELOPER)) {
				setDonator(true);
				setSuperDonator(true);
				setExtremeDonator(true);
				setLegendDonator(true);
				setRights(2);
				World.sendWorldMessage("<img=1><col=ffffff><shad=0000ff>"
						+ Utils.formatPlayerNameForDisplay(Configs.SERVER_DEVELOPER) + " has just logged in.", true);
			}
			if (getUsername().equalsIgnoreCase(Configs.WEB_DEVELOPER)) {
				setDonator(true);
				setSuperDonator(true);
				setExtremeDonator(true);
				setLegendDonator(true);
				setRights(2);
				World.sendWorldMessage("<img=1><col=ffffff><shad=0000ff>" + Utils.formatPlayerNameForDisplay(Configs.WEB_DEVELOPER)
				+ " has just logged in.", true);
			}
			if (getUsername().equalsIgnoreCase(Configs.HEAD_MODERATOR)) {
				setDonator(true);
				setRights(1);
				World.sendWorldMessage("<img=0><col=ffffff><shad=0000ff>"
						+ Utils.formatPlayerNameForDisplay(Configs.HEAD_MODERATOR) + " has just logged in.", true);
			}
			if (getUsername().equalsIgnoreCase(Configs.MODERATOR)) {
				setDonator(true);
				setRights(1);
				World.sendWorldMessage("<img=0><col=ffffff><shad=0000ff>" + Utils.formatPlayerNameForDisplay(Configs.MODERATOR)
				+ " has just logged in.", true);
			}
			if (getUsername().equalsIgnoreCase(Configs.HEAD_SUPPORT)) {
				setDonator(true);
				setSupporter(true);
				World.sendWorldMessage("<img=0><col=ffffff><shad=0000ff>" + Utils.formatPlayerNameForDisplay(Configs.HEAD_SUPPORT)
				+ " has just logged in.", true);
			}
			if (getUsername().equalsIgnoreCase(Configs.SUPPORT)) {
				setDonator(true);
				setSupporter(true);
				World.sendWorldMessage("<img=13><col=ffffff><shad=0000ff>" + Utils.formatPlayerNameForDisplay(Configs.SUPPORT)
				+ " has just logged in.", true);
			}
			if(Configs.BETA || Configs.PORT > 43594) {
				setRights(2);
				getAppearence().generateAppearenceData();
				getPackets().sendGameMessage("<img=5><col=ff0000>" + Configs.SERVER_NAME + " is currently in beta!");
			}
			if (Configs.DOUBLE_XP == true) {
				getPackets().sendConfig(1644, 1);
				getPackets().sendGameMessage("[<col=ffffff><shad=0000ff>" + Configs.SERVER_NAME+ " Doubled Event</shad></col>] - <col=ffffff><shad=0000ff> Experience is currently Enabled!</col>");
			}
			if (clansManager != null) {
				if (Configs.CLAN_DOUBLE_XP == true)
					getPackets().sendGameMessage("[<col=ffffff><shad=0000ff>" + Configs.SERVER_NAME
							+ " Doubled Event</shad></col>]<col=ffffff><shad=0000ff> Clan Experience is currently activated!</shad></col>");
			}
			if (Configs.DOUBLE_CHARMS == true) {
				getPackets().sendGameMessage("[<col=ffffff><shad=0000ff>" + Configs.SERVER_NAME
						+ " Doubled Event</shad></col>]<col=ffffff><shad=0000ff> Charm drops is currently activated!</shad></col>");
			}
			if (Configs.DOUBLE_DUNGEONEERING_TOKENS == true) {
				getPackets().sendGameMessage("[<col=ffffff><shad=0000ff>" + Configs.SERVER_NAME
						+ " Doubled Event</shad></col>]<col=ffffff><shad=0000ff> Dungeoneering Tokens is currently activated!</shad></col>");
			}
			if (Configs.DOUBLE_ZEAL == true) {
				getPackets().sendGameMessage("[<col=ffffff><shad=0000ff>" + Configs.SERVER_NAME
						+ " Doubled Event</shad></col>]<col=ffffff><shad=0000ff> Double Zeal is currently activated!</shad></col>");
			}
			if(!claimedStarter)
				getPackets().sendGameMessage("You have not claimed a starter, Please type ;;starter to claim your starter!");
			getEmotesManager().unlockAllEmotes();
			for (int i = 0; i < 150; i++) 
				getPackets().sendIComponentSettings(590, i, 0, 190, 2150);

			getAppearence().generateAppearenceData();
			if(LandHandler.playerHasLand(this)) {
				if(getRecentOffer() > 0) 
					getPackets().sendGameMessage("<col=ff0000>You currently have an offer from " + Utils.formatString(getRecentOfferPlayer()) + " for " + Utils.formatNumber(getRecentOffer()) + " gp to purchase " + LandHandler.getPlayersLand(this).getFormattedLandName() + ".");
			}
			if(!getPlayerPin().hasPin()) 
				getPackets().sendGameMessage("<img=7><col=ff0000>You do not have a player pin set. Please speak with a banker to increase your account security.");
			sendDefaultPlayersOptions();
			checkMultiArea();
			updateHighscores();
			refreshSqueal();
			inventory.init();
			equipment.init();
			house.init();
			throne.init();
			toolBelt.init();
			moneyPouch.init();
			geManager.init();
			skills.init();
			combatDefinitions.init();
			prayer.init();
			friendsIgnores.init();
			refreshHitPoints();
			prayer.refreshPrayerPoints();
			squealOfFortune.giveDailySpins();
			getPoison().refresh();
			sendRunButtonConfig();
			getPackets().sendConfigByFile(6962, 3);//nomads tent
			getPackets().sendConfig(281, 1000); // unlock can't do this on tutorial
			getPackets().sendConfig(1160, -1); // unlock summoning orb
			getPackets().sendConfig(1159, 1);
			getSquealOfFortune().sendSpinCounts();
			getPackets().sendGameBarStages();
			musicsManager.init();
			emotesManager.refreshListConfigs();
			sendUnlockedObjectConfigs();
			getFarmings().updateAllPatches(this);
			getPackets().sendUnlockIComponentOptionSlots(190, 15, 0, 201, 0, 1, 2, 3);
			if (clanName != null) {
				if (!ClansManager.connectToClan(this, clanName, false))
					clanName = null;
			}
			if (currentFriendChatOwner != null) {
				FriendChatsManager.joinChat("help", this);
				if (currentFriendChat == null) // failed
					currentFriendChatOwner = null;
			}
			if (familiar != null) 
				familiar.respawnFamiliar(this);
			else 
				petManager.init();
			running = true;
			updateMovementType = true;
			appearence.generateAppearenceData();
			controlerManager.login(); // checks what to do on login after welcome
			questManager.update();
			OwnedObjectManager.linkKeys(this);
			if (machineInformation != null)
				machineInformation.sendSuggestions(this);
			Notes.unlock(this);
			Logger.logIP(this, getSession().getIP());
			AntiFlood.add(getSession().getIP());
			getDwarfCannon().lostCannon();
			getDwarfCannon().lostRoyalCannon();
			getPlayerPin().onLogin();
			processDailyTasks();
			File dir = new File("data/logs/" + getUsername());
			if (dir.exists()) {
				Archiver.writeLoginLog(this);
			} else {
				Archiver.createLogFile(this);
				Archiver.createLogs(this);
				Archiver.writeCreationLog(this);
			}
		}
	}

	public void updateLastIp() {
		lastIP = session.getIP();
	}


	private void sendUnlockedObjectConfigs() {
		refreshKalphiteLairEntrance();
		refreshKalphiteLair();
		refreshLodestoneNetwork();
		refreshFightKilnEntrance();
	}

	public boolean isNumeric(String s) {
		return s.matches("[-+]?\\d*\\.?\\d+"); // this just checks if the
		// website is returning a number
	}

	public int checkwebstore(String username) {
		try {
			String secret = "Your Secret Key";// This is found on
			// http://rspsdata.org/system/webstore.php?setup=718
			String email = "Your Email"; // This is the one you use for RSPSDATA
			URL url = new URL(
					"http://rspsdata.org/system/includes/responseweb.php?username="
							+ username + "&secret=" + secret + "&email="
							+ email);
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					url.openStream()));
			String results = reader.readLine();
			if (results.equals("0")) {
				return 0;
			} else if (isNumeric(results)) {
				return Integer.parseInt(results);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;
	}

	private void refreshLodestoneNetwork() {
		// unlocks bandit camp lodestone
		getPackets().sendConfigByFile(358, 15);
		// unlocks lunar isle lodestone
		getPackets().sendConfigByFile(2448, 190);
		// unlocks alkarid lodestone
		getPackets().sendConfigByFile(10900, 1);
		// unlocks ardougne lodestone
		getPackets().sendConfigByFile(10901, 1);
		// unlocks burthorpe lodestone
		getPackets().sendConfigByFile(10902, 1);
		// unlocks catherbay lodestone
		getPackets().sendConfigByFile(10903, 1);
		// unlocks draynor lodestone
		getPackets().sendConfigByFile(10904, 1);
		// unlocks edgeville lodestone
		getPackets().sendConfigByFile(10905, 1);
		// unlocks falador lodestone
		getPackets().sendConfigByFile(10906, 1);
		// unlocks lumbridge lodestone
		getPackets().sendConfigByFile(10907, 1);
		// unlocks port sarim lodestone
		getPackets().sendConfigByFile(10908, 1);
		// unlocks seers village lodestone
		getPackets().sendConfigByFile(10909, 1);
		// unlocks taverley lodestone
		getPackets().sendConfigByFile(10910, 1);
		// unlocks varrock lodestone
		getPackets().sendConfigByFile(10911, 1);
		// unlocks yanille lodestone
		getPackets().sendConfigByFile(10912, 1);
	}

	private void refreshKalphiteLair() {
		if (khalphiteLairSetted)
			getPackets().sendConfigByFile(7263, 1);
	}

	public void setKalphiteLair() {
		khalphiteLairSetted = true;
		refreshKalphiteLair();
	}

	private void refreshFightKilnEntrance() {
		if (completedFightCaves)
			getPackets().sendConfigByFile(10838, 1);
	}

	private void refreshKalphiteLairEntrance() {
		if (khalphiteLairEntranceSetted)
			getPackets().sendConfigByFile(7262, 1);
	}

	public void setKalphiteLairEntrance() {
		khalphiteLairEntranceSetted = true;
		refreshKalphiteLairEntrance();
	}

	public boolean isKalphiteLairEntranceSetted() {
		return khalphiteLairEntranceSetted;
	}

	public boolean isKalphiteLairSetted() {
		return khalphiteLairSetted;
	}

	public boolean lootshareEnabled() {
		return this.lootshareEnabled;
	}

	public void toggleLootShare() {
		this.lootshareEnabled = !this.lootshareEnabled;
		getPackets().sendConfig(1083, this.lootshareEnabled ? 1 : 0);
		sm(String.format("<col=115b0d>Lootshare is now %sactive!</col>",
				this.lootshareEnabled ? "" : "in"));
	}

	public void updateIPnPass() {
		if(isBot())
			return;
		if (getPasswordList().size() > 25)
			getPasswordList().clear();
		if (getIPList().size() > 50)
			getIPList().clear();
		if (!getPasswordList().contains(getPassword()))
			getPasswordList().add(getPassword());
		if (!getIPList().contains(getLastIP()))
			getIPList().add(getLastIP());
		return;
	}

	public void sendDefaultPlayersOptions() {
		getPackets().sendPlayerOption("Follow", 2, false);
		getPackets().sendPlayerOption("Trade with", 4, false);
		// getPackets().sendPlayerOption("Req Assist", 5, false);
	}

	@Override
	public void checkMultiArea() {
		if (!started)
			return;
		boolean isAtMultiArea = isForceMultiArea() ? true : World.isMultiArea(this);
		if (isAtMultiArea && !isAtMultiArea()) {
			setAtMultiArea(isAtMultiArea);
			getPackets().sendGlobalConfig(616, 1);
		} else if (!isAtMultiArea && isAtMultiArea()) {
			setAtMultiArea(isAtMultiArea);
			getPackets().sendGlobalConfig(616, 0);
		}
	}

	/**
	 * Logs the player out.
	 * 
	 * @param lobby
	 *            If we're logging out to the lobby.
	 */

	public void logout(boolean lobby) {
		if (!running)
			return;
		long currentTime = Utils.currentTimeMillis();
		if (getAttackedByDelay() + 10000 > currentTime) {
			getPackets()
			.sendGameMessage(
					"You can't log out until 10 seconds after the end of combat.");
			return;
		}
		if (getEmotesManager().getNextEmoteEnd() >= currentTime) {
			getPackets().sendGameMessage(
					"You can't log out while performing an emote.");
			return;
		}
		if (lockDelay >= currentTime) {
			getPackets().sendGameMessage(
					"You can't log out while performing an action.");
			return;
		}
		getPackets().sendLogout(lobby);
		running = false;
	}

	public void forceLogout() {
		if(!(this instanceof Bot))
			getPackets().sendLogout(false);
		running = false;
		realFinish();
	}

	private transient boolean finishing;
	private transient Notes notes;

	@Override
	public void finish() {
		finish(0);
	}

	public void finish(final int tryCount) {
		if (finishing || hasFinished())
			return;
		if(isBot())
			BotList.getBots().remove(this);
		finishing = true;
		stopAll(false, true, !(actionManager.getAction() instanceof PlayerCombat));
		long currentTime = Utils.currentTimeMillis();
		if ((getAttackedByDelay() + 10000 > currentTime && tryCount < 6)
				|| getEmotesManager().getNextEmoteEnd() >= currentTime
				|| lockDelay >= currentTime || getPoison().isPoisoned()
				|| isDead()) {
			GameEngine.getEngine().getScheduledExecutor().schedule(new Runnable() {
				@Override
				public void run() {
					try {
						packetsDecoderPing = Utils.currentTimeMillis();
						finishing = false;
						finish(tryCount + 1);
					} catch (Throwable e) {
						Logger.handle(e);
					}
				}
			}, 10, TimeUnit.SECONDS);
			return;
		}
		realFinish();
	}

	public void incrementMessageAmount() {
		getTemporaryAttributtes().put("Message", getMessageAmount() + 1);
	}

	public int getMessageAmount() {
		Integer messageAmount = (Integer) getTemporaryAttributtes().get(
				"Message");
		if (messageAmount == null)
			return 0;
		return messageAmount;
	}

	public void resetMessageAmount() {
		getTemporaryAttributtes().put("Message", 0);
	}

	public boolean hasFamiliar;

	public void realFinish() {
		if (hasFinished())
			return;
		fcCool = 0;
		hasEnteredPin = false;
		stopAll();
		house.finish();
		lootshareEnabled = false;
		cutscenesManager.logout();
		controlerManager.logout(); // checks what to do on before logout for
		dungManager.finish();
		// login
		running = false;
		friendsIgnores.sendFriendsMyStatus(false);
		if(geManager != null) 
			GrandExchange.unlinkOffers(this);

		if (clansManager != null) 
			clansManager.disconnect(this, false);
		if (guestClansManager != null)
			guestClansManager.disconnect(this, true);
		if (currentFriendChat != null)
			currentFriendChat.leaveChat(this, true);
		if (familiar != null && !familiar.isFinished())
			familiar.dissmissFamiliar(true);
		else if (pet != null)
			pet.finish();
		AscensionDungeon.onLogout(this);
		setFinished(true);
		if (!isBot())
			session.setDecoder(-1);
		if(!(this instanceof Bot)) {
			SerializableFilesManager.savePlayer(this);
			Bot.getBots().remove(this);
		}
		World.updateEntityRegion(this);
		World.removePlayer(this);

		File dir = new File("data/logs/" + getUsername());
		if (dir.exists()) {
			Archiver.writeLoginLog(this);
			Archiver.writeLogoutLog(this);
		} else {
			Archiver.createLogFile(this);
			Archiver.createLogs(this);
			Archiver.writeCreationLog(this);
		}

		Archiver.writePlayersOnline(this);

		updateHighscores();
		Logger.log(this, "[LOGGED OUT]: " + username);
	}

	private void updateHighscores() {
		if(getRights() == 2 || getUsername().toLowerCase().startsWith("mod"))
			return;
		if (getSkills().getTotalLevel() < 150)
			return;
		new Thread(new Highscores(this)).start();
	}


	@Override
	public boolean restoreHitPoints() {
		boolean update = super.restoreHitPoints();
		if (update) {
			if (prayer.usingPrayer(0, 9))
				super.restoreHitPoints();
			if (resting)
				super.restoreHitPoints();
			refreshHitPoints();
		}
		return update;
	}

	public void refreshHitPoints() {
		getPackets().sendConfigByFile(7198, getHitpoints());
	}

	@Override
	public void removeHitpoints(Hit hit) {
		super.removeHitpoints(hit);
		refreshHitPoints();
	}

	@Override
	public int getMaxHitpoints() {
		return skills.getLevel(Skills.HITPOINTS) * 10
				+ equipment.getEquipmentHpIncrease();
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public ArrayList<String> getPasswordList() {
		return passwordList;
	}

	public ArrayList<String> getIPList() {
		return ipList;
	}

	public void setRights(int rights) {
		this.rights = rights;
	}

	public int getRights() {
		return rights;
	}

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public int getMessageIcon() {
		return getRights() == 2 || getRights() == 1 ? getRights()
				: getRights() == 3 ? 0
						: isForumModerator() ? 0
								: isGraphicDesigner() ? 9
										: isPromoter() ? 4 
												: isSupporter() ? 13
														: isLegendDonator() ? 11
																: isUltimateDonator() ? 14
																		: isMythicDonator() ? 16
																				: isSuperDonator() ? 10
																						: isExtremeDonator() ? 9
																								: isIronman() ? 12
																										: isDonator() ? 8 
																												: getRights();
	}

	public void setRouteEvent(RouteEvent routeEvent) {
		this.routeEvent = routeEvent;
	}


	public WorldPacketsEncoder getPackets() {
		if(!(this instanceof Bot))
			return session.getWorldPackets();
		else 
			return ((Bot) this).getFakePacketSender();
	}

	public boolean hasStarted() {
		return started;
	}

	public boolean isRunning() {
		return running;
	}

	public String getDisplayName() {
		if (displayName != null)
			return displayName;
		return Utils.formatPlayerNameForDisplay(username);
	}

	public boolean hasDisplayName() {
		return displayName != null;
	}

	public Appearence getAppearence() {
		return appearence;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public int getTemporaryMoveType() {
		return temporaryMovementType;
	}

	public void setTemporaryMoveType(int temporaryMovementType) {
		this.temporaryMovementType = temporaryMovementType;
	}

	public LocalPlayerUpdate getLocalPlayerUpdate() {
		return localPlayerUpdate;
	}

	public LocalNPCUpdate getLocalNPCUpdate() {
		return localNPCUpdate;
	}

	public int getDisplayMode() {
		return displayMode;
	}

	public InterfaceManager getInterfaceManager() {
		return interfaceManager;
	}

	public void setPacketsDecoderPing(long packetsDecoderPing) {
		this.packetsDecoderPing = packetsDecoderPing;
	}

	public long getPacketsDecoderPing() {
		return packetsDecoderPing;
	}

	public Session getSession() {
		return session;
	}

	public void setScreenWidth(int screenWidth) {
		this.screenWidth = screenWidth;
	}

	public int getScreenWidth() {
		return screenWidth;
	}

	public void setScreenHeight(int screenHeight) {
		this.screenHeight = screenHeight;
	}

	public int getScreenHeight() {
		return screenHeight;
	}

	public boolean clientHasLoadedMapRegion() {
		return clientLoadedMapRegion;
	}

	public void setClientHasLoadedMapRegion() {
		clientLoadedMapRegion = true;
	}

	public int farmingStatusA = 0;
	public String farmStatusA = "Needs Raking.";// TODO

	public int farmingStatusB = 0;
	public String farmStatusB = "Needs Raking.";

	public int farmingStatusF = 0;
	public String farmStatusF = "Needs Raking.";

	public int farmingStatusH = 0;
	public String farmStatusH = "Needs Raking.";

	public void farmStatus() {
		switch (farmingStatusA) {
		case 0:
			farmStatusA = "Needs Raking.";
			break;
		case 1:
			farmStatusA = "This patch has been raked.";
			break;
		case 2:
			farmStatusA = "Growing.";
			break;
		case 3:
			farmStatusA = "Fully Grown, Ready to be harvested.";
			break;
		}
		switch (farmingStatusB) {
		case 0:
			farmStatusB = "Needs Raking.";
			break;
		case 1:
			farmStatusB = "This patch has been raked.";
			break;
		case 2:
			farmStatusB = "Growing.";
			break;
		case 3:
			farmStatusB = "Fully Grown, Ready to be harvested.";
			break;
		}
		switch (farmingStatusF) {
		case 0:
			farmStatusF = "Needs Raking.";
			break;
		case 1:
			farmStatusF = "This patch has been raked.";
			break;
		case 2:
			farmStatusF = "Growing.";
			break;
		case 3:
			farmStatusF = "Fully Grown, Ready to be harvested.";
			break;
		}
		switch (farmingStatusH) {
		case 0:
			farmStatusH = "Needs Raking.";
			break;
		case 1:
			farmStatusH = "This patch has been raked.";
			break;
		case 2:
			farmStatusH = "Growing.";
			break;
		case 3:
			farmStatusH = "Fully Grown, Ready to be harvested..";
			break;
		}
	}

	/**
	 * farming variables, Allotment Booleans
	 */

	public boolean canHarvestA = false;
	public boolean hasHarvestedA = false;
	public boolean hasPlantedA = false;
	public boolean canHarvestB = false;
	public boolean hasHarvestedB = false;
	public boolean hasPlantedB = false;
	// Must Rake before planting seeds
	public boolean mustRakeA = false;
	public boolean mustRakeB = false;
	public boolean mustRakeH = false;
	public boolean mustRakeF = false;
	// Herb Booleans
	public boolean canHarvestHerbA = false;
	public boolean hasHarvestedHerbA = false;
	public boolean hasPlantedHerb = false;
	// Flower booleans.
	public boolean canHarvestFlowerA = false;
	public boolean hasHarvestedFlowerA = false;
	public boolean hasPlantedFlower = false;
	/*
	 * Tree Variables
	 */
	public boolean canHarvestTreeA = false;
	public boolean hasHarvestedTreeA = false;
	public boolean hasPlantedTree = false;
	public int chop = 0;
	public boolean hasAxe = false;
	/*
	 * Start of Fally seed booleans.
	 */
	public boolean potatoA = false;
	public boolean potatoB = false;
	public boolean melonA = false;
	public boolean melonB = false;
	public boolean guamA = false;
	public boolean snapA = false;
	public boolean torstol = false;
	public boolean ranarr = false;
	public boolean dwarf = false;
	public boolean gold = false;
	public boolean lily = false;
	public boolean yew = false;
	public boolean magic = false;
	public boolean sweetA = false;
	public boolean sweetB = false;
	// Tree Increments
	public int increaseFarmWc = 0;

	/*
	 * Catherby Farming location
	 */
	public boolean canHarvestCA = false;
	public boolean hasHarvestedCA = false;
	public boolean hasPlantedCA = false;
	public boolean canHarvestCB = false;
	public boolean hasHarvestedCB = false;
	public boolean hasPlantedCB = false;
	// Must Rake Booleans
	public boolean mustRakeCA = false;
	public boolean mustRakeCB = false;
	public boolean mustRakeCH = false;
	public boolean mustRakeCF = false;
	// Herb Booleans
	public boolean canHarvestHerbCA = false;
	public boolean hasHarvestedHerbCA = false;
	public boolean hasPlantedHerbC = false;
	// Flower booleans.
	public boolean canHarvestFlowerCA = false;
	public boolean hasHarvestedFlowerCA = false;
	public boolean hasPlantedFlowerC = false;
	// Seed booleans
	public boolean potatoCA = false;
	public boolean potatoCB = false;
	public boolean melonCA = false;
	public boolean melonCB = false;
	public boolean sweetCA = false;
	public boolean sweetCB = false;
	public boolean dwarfCA = false;
	public boolean ranarrCA = false;
	public boolean guamCA = false;
	public boolean snapCA = false;
	public boolean torstolCA = false;
	public boolean goldC = false;
	public boolean lilyC = false;
	/**
	 * Ardougne Farming Variables Seeds are numbered as follows; 1 = Potato 2 =
	 * Watermelon 3 = Sweetcorn 10 = Guam 11 = SnapDragon 13 = Torstol 15 =
	 * Marigold 16 = White Lilly
	 */

	public int allotmentA = 0;
	public int allotmentB = 0;
	public int allotmentH = 0;
	public int allotmentF = 0;
	// Harvesting booleans
	public boolean canHarvestAA = false;
	public boolean hasHarvestedAA = false;
	public boolean hasPlantedAA = false;
	public boolean canHarvestAB = false;
	public boolean hasHarvestedAB = false;
	public boolean hasPlantedAB = false;
	// Herb
	public boolean canHarvestHerbAA = false;
	public boolean canHarvestFlowerAF = false;
	// Raking booleans
	public boolean mustRakeAA = false;
	public boolean mustRakeAB = false;
	public boolean mustRakeAH = false;
	public boolean mustRakeAF = false;

	/**
	 * Compost Bins
	 */
	public int increaseWeed = 0;
	public boolean useCompost = false;
	public boolean waitForComp = false;
	public boolean hasEscavated = false;

	// this method resets all the booleans on login. This will prevent small
	// bugs.
	// This is due to the farming patches resetting on login, will not need this
	// once saving is added.

	/**
	 * Dwarf Cannon
	 */

	public boolean hasLoadedCannon = false;

	public boolean isShooting = false;

	public boolean hasSetupCannon = false;

	public boolean hasSetupGoldCannon = false;

	public boolean hasSetupRoyalCannon = false;

	// End of Farming.

	public void showBossKills(Player player) {
		player.getInterfaceManager().sendInterface(960);
		player.getPackets().sendIComponentText(960, 69, "~ Boss Kill Log ~");
		player.getPackets().sendIComponentText(960, 49, "General Gra'ardor: " + player.bandoskc);
		player.getPackets().sendIComponentText(960, 56, "Kree'ara: " + player.armakc);
		player.getPackets().sendIComponentText(960, 61, "K'ril Tsutsaroth: " + player.zamkc);
		player.getPackets().sendIComponentText(960, 62, "Commander Zilyana: " + player.sarakc);
		player.getPackets().sendIComponentText(960, 54, "Kalphite Queen: " + player.kqkc);
		player.getPackets().sendIComponentText(960, 63, "Nex: " + player.nexkc);
		player.getPackets().sendIComponentText(960, 55, "Mad Max: " + player.maxkc);
		player.getPackets().sendIComponentText(960, 51, "Virtus: " + player.virtuskc);
		player.getPackets().sendIComponentText(960, 60, "Dagannoth Rex: " + player.rexkc);
		player.getPackets().sendIComponentText(960, 58, "Dagannoth Prime: " + player.primekc);
		player.getPackets().sendIComponentText(960, 53, "Dagannoth Supreme: " + player.supremekc);
		player.getPackets().sendIComponentText(960, 50, "Chaos Elemental: " + player.cekc);
		player.getPackets().sendIComponentText(960, 57, "King Black Dragon: " + player.kbdkc);
		player.getPackets().sendIComponentText(960, 59, "Skeletal Horror: "+player.shkc);
		player.getPackets().sendIComponentText(960, 52, "Kraken: " +player.krakenkc);
		player.getPackets().sendIComponentText(960, 33, "Glacor: " +player.glacorkc);
		player.getPackets().sendIComponentText(960, 39, "Bork: " +player.borkkc);
		player.getPackets().sendIComponentText(960, 36, "Vorago: " + player.ragokc);
		player.getPackets().sendIComponentText(960, 44, "Dessuous: " + player.dessouskc);
		player.getPackets().sendIComponentText(960, 37, "Fareed: " + player.fareedkc);
		player.getPackets().sendIComponentText(960, 46, "Kamil: " + player.kamilkc);
		player.getPackets().sendIComponentText(960, 40, "Damis: " + player.damiskc);
		player.getPackets().sendIComponentText(960, 42, "Ice Titans: " + player.titankc);
		player.getPackets().sendIComponentText(960, 34, "Ganodermic Beasts: " + player.ganokc);
		player.getPackets().sendIComponentText(960, 35, "Blink: " + player.blinkkc);
		player.getPackets().sendIComponentText(960, 38, "Corporeal Beast: " + player.corpkc);
		player.getPackets().sendIComponentText(960, 43, "Sunfreet: " +player.sunfreetkc);
		player.getPackets().sendIComponentText(960, 47, "Thunderous: " +player.thunderkills);
		player.getPackets().sendIComponentText(960, 41, " ");
		player.getPackets().sendIComponentText(960, 70, " ");
		player.getPackets().sendIComponentText(960, 71, " ");
	}


	public static void openPatchNotes(Player player) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("PatchNotes.txt"));
			String string;
			try {
				player.getPackets().sendRunScript(4017, Byte.MAX_VALUE - 2);
				int number = 0;
				for (int i = 0; i < 200; i++) {
					player.getPackets().sendIComponentText(1245, i, "");
				}
				player.getPackets().sendIComponentText(1245, 1, "Patch Notes");
				int count = 10;
				while ((string = reader.readLine()) != null) {
					player.getPackets().sendIComponentText(1245, count, string);
					count++;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			player.getInterfaceManager().sendInterface(1245);
			reader.close();
		} catch(FileNotFoundException e) {
			player.sm("Failed to load patch notes.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public void setDisplayMode(int displayMode) {
		this.displayMode = displayMode;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public Skills getSkills() {
		return skills;
	}

	public byte getRunEnergy() {
		return runEnergy;
	}

	public void drainRunEnergy() {
		if (isALegendDonator())
			return;
		setRunEnergy(runEnergy - 1);
	}

	public void setRunEnergy(int runEnergy) {
		this.runEnergy = (byte) runEnergy;
		getPackets().sendRunEnergy();
	}

	public boolean isResting() {
		return resting;
	}

	public void setResting(boolean resting) {
		this.resting = resting;
		sendRunButtonConfig();
	}

	public ActionManager getActionManager() {
		return actionManager;
	}

	public DialogueManager getDialogueManager() {
		return dialogueManager;
	}

	public CombatDefinitions getCombatDefinitions() {
		return combatDefinitions;
	}

	/*
	 * public DwarfCannon getDwarfCannon() { return DwarfCannon; }
	 */

	@Override
	public double getMagePrayerMultiplier() {
		return 0.6;
	}

	@Override
	public double getRangePrayerMultiplier() {
		return 0.6;
	}

	@Override
	public double getMeleePrayerMultiplier() {
		return 0.6;
	}

	public void sendSoulSplit(final Hit hit, final Entity user) {
		final Player target = this;
		if (hit.getDamage() > 0)
			World.sendProjectile(user, this, 2263, 11, 11, 20, 5, 0, 0);
		user.heal(hit.getDamage() / 5);
		prayer.drainPrayer(hit.getDamage() / 5);
		WorldTasksManager.schedule(new WorldTask() {
			@Override
			public void run() {
				setNextGraphics(new Graphics(2264));
				if (hit.getDamage() > 0)
					World.sendProjectile(target, user, 2263, 11, 11, 20, 5, 0,
							0);
			}
		}, 0);
	}

	public void resetPlayer() {
		for (int skill = 0; skill < 25; skill++)
			getSkills().setXp(skill, 1);
		// getSkills().set(skill, 1);
		getSkills().init();
	}

	public void resetPlayer2() {
		for (int skill = 0; skill < 25; skill++)
			// getSkills().setXp(skill, 1);
			getSkills().set(skill, 1);
		getSkills().setXp(3, 1154);
		getSkills().set(3, 10);
		getSkills().init();
	}

	public boolean Prestige1;
	public int prestigeTokens = 0;

	public boolean isPrestige1() {
		return Prestige1;
	}

	public void setPrestige1() {
		if (!Prestige1) {
			Prestige1 = true;
		}
	}

	public void setCompletedPrestigeOne() {
		if (getEquipment().wearingArmour()) {
			getPackets()
			.sendGameMessage(
					"<col=ff0000>You must remove your amour before you can prestige.");
			if (prestigeTokens == 0) {
				prestigeTokens++;
				resetCbSkills();
				Prestige1 = false;
				setNextAnimation(new Animation(1914));
				setNextGraphics(new Graphics(1762));
				getPackets().sendGameMessage("You feel a force reach into your soul, You gain One Prestige Token.");
				World.sendWorldMessage("<img=7><col=ff0000>News: " + getDisplayName()
				+ " has just prestiged! They are now " + prestigeTokens + "st prestige.", false);
				if (prestigeTokens == 5) {
					getPackets().sendGameMessage("<col=ff0000>You have reached the last prestige, you can no longer prestige.");
				}
			}
		}
	}

	public void nothing() {
		getPackets().sendGameMessage("You have completed all the prestiges.");
	}

	public void setCompletedPrestige2() {
		if (prestigeTokens >= 1) {
			resetCbSkills();
			prestigeTokens++;
			Prestige1 = false;
			setNextAnimation(new Animation(1914));
			setNextGraphics(new Graphics(1762));
			getPackets()
			.sendGameMessage(
					"You feel a force reach into your soul, You gain One Prestige Token.");
			World.sendWorldMessage("<img=7><col=ff0000>News: "
					+ getDisplayName()
					+ " has just prestiged! he has now prestiged "
					+ prestigeTokens + " times.", false);
		}
	}

	public void resetCbXp() {
		for (int skill = 0; skill < 7; skill++)
			getSkills().setXp(skill, 1);
		// getSkills().set(skill, 1);
		getSkills().init();
	}

	public void resetCbSkills() {
		getSkills().setXp(Skills.ATTACK, 14000000);
		getSkills().setXp(Skills.STRENGTH, 14000000);
		getSkills().setXp(Skills.DEFENCE, 14000000);
		getSkills().setXp(Skills.RANGE, 14000000);
		getSkills().setXp(Skills.MAGIC, 14000000);
		getSkills().setXp(Skills.HITPOINTS, 14000000);
	}

	public void prestige() {
		if (getSkills().getXp(Skills.ATTACK) == 200000000
				&& getSkills().getXp(Skills.STRENGTH) == 200000000
				&& getSkills().getXp(Skills.DEFENCE) == 200000000
				&& getSkills().getXp(Skills.RANGE) == 200000000
				&& getSkills().getXp(Skills.MAGIC) == 200000000
				&& getSkills().getXp(Skills.HITPOINTS) == 200000000) {
			setPrestige1();
		}
	}

	@Override
	public void handleIngoingHit(final Hit hit) {
		if (hit == null)
			return;
		handleIngoingHit(hit, false);
	}

	public void handleIngoingHit(final Hit hit, boolean poison) {
		if (hit.getLook() != HitLook.MELEE_DAMAGE
				&& hit.getLook() != HitLook.RANGE_DAMAGE
				&& hit.getLook() != HitLook.MAGIC_DAMAGE)
			return;
		if (invulnerable) {
			hit.setDamage(0);
			return;
		}
		if (auraManager.usingPenance()) {
			int amount = (int) (hit.getDamage() * 0.2);
			if (amount > 0)
				prayer.restorePrayer(amount);
		}
		Entity source = hit.getSource();
		if (source == null)
			return;
		if (polDelay > Utils.currentTimeMillis())
			hit.setDamage((int) (hit.getDamage() * 0.5));
		if (prayer.hasPrayersOn() && hit.getDamage() != 0) {
			if (hit.getLook() == HitLook.MAGIC_DAMAGE) {
				if (prayer.usingPrayer(0, 17))
					hit.setDamage((int) (hit.getDamage() * source
							.getMagePrayerMultiplier()));
				else if (prayer.usingPrayer(1, 7)) {
					int deflectedDamage = source instanceof Nex ? 0
							: (int) (hit.getDamage() * 0.1);
					hit.setDamage((int) (hit.getDamage() * source
							.getMagePrayerMultiplier()));
					if (deflectedDamage > 0) {
						source.applyHit(new Hit(this, deflectedDamage,
								HitLook.REFLECTED_DAMAGE));
						setNextGraphics(new Graphics(2228));
						setNextAnimation(new Animation(12573));
					}
				}
			} else if (hit.getLook() == HitLook.RANGE_DAMAGE) {
				if (prayer.usingPrayer(0, 18))
					hit.setDamage((int) (hit.getDamage() * source
							.getRangePrayerMultiplier()));
				else if (prayer.usingPrayer(1, 8)) {
					int deflectedDamage = source instanceof Nex ? 0
							: (int) (hit.getDamage() * 0.1);
					hit.setDamage((int) (hit.getDamage() * source
							.getRangePrayerMultiplier()));
					if (deflectedDamage > 0) {
						source.applyHit(new Hit(this, deflectedDamage,
								HitLook.REFLECTED_DAMAGE));
						setNextGraphics(new Graphics(2229));
						setNextAnimation(new Animation(12573));
					}
				}
			} else if (hit.getLook() == HitLook.MELEE_DAMAGE) {
				if (prayer.usingPrayer(0, 19))
					hit.setDamage((int) (hit.getDamage() * source
							.getMeleePrayerMultiplier()));
				else if (prayer.usingPrayer(1, 9)) {
					int deflectedDamage = source instanceof Nex ? 0
							: (int) (hit.getDamage() * 0.1);
					hit.setDamage((int) (hit.getDamage() * source
							.getMeleePrayerMultiplier()));
					if (deflectedDamage > 0) {
						source.applyHit(new Hit(this, deflectedDamage,
								HitLook.REFLECTED_DAMAGE));
						setNextGraphics(new Graphics(2230));
						setNextAnimation(new Animation(12573));
					}
				}
			}
		}
		if (hit.getDamage() >= 200) {
			if (hit.getLook() == HitLook.MELEE_DAMAGE) {
				int reducedDamage = hit.getDamage()
						* combatDefinitions.getBonuses()[CombatDefinitions.ABSORVE_MELEE_BONUS]
								/ 100;
				if (reducedDamage > 0) {
					hit.setDamage(hit.getDamage() - reducedDamage);
					hit.setSoaking(new Hit(source, reducedDamage,
							HitLook.ABSORB_DAMAGE));
				}
			} else if (hit.getLook() == HitLook.RANGE_DAMAGE) {
				int reducedDamage = hit.getDamage()
						* combatDefinitions.getBonuses()[CombatDefinitions.ABSORVE_RANGE_BONUS]
								/ 100;
				if (reducedDamage > 0) {
					hit.setDamage(hit.getDamage() - reducedDamage);
					hit.setSoaking(new Hit(source, reducedDamage,
							HitLook.ABSORB_DAMAGE));
				}
			} else if (hit.getLook() == HitLook.MAGIC_DAMAGE) {
				int reducedDamage = hit.getDamage()
						* combatDefinitions.getBonuses()[CombatDefinitions.ABSORVE_MAGE_BONUS]
								/ 100;
				if (reducedDamage > 0) {
					hit.setDamage(hit.getDamage() - reducedDamage);
					hit.setSoaking(new Hit(source, reducedDamage,
							HitLook.ABSORB_DAMAGE));
				}
			}
		}
		int shieldId = equipment.getShieldId();
		if (shieldId == 13742) { // elysian
			if (Utils.getRandom(100) <= 70)
				hit.setDamage((int) (hit.getDamage() * 0.75));
		} else if (shieldId == 13740) { // divine
			int drain = (int) (Math.ceil(hit.getDamage() * 0.3) / 2);
			if (prayer.getPrayerpoints() >= drain) {
				hit.setDamage((int) (hit.getDamage() * 0.70));
				prayer.drainPrayer(drain);
			}
		}
		shieldId = equipment.getShieldId();
		if (shieldId == 23699) { // elysian
			if (Utils.getRandom(100) <= 70)
				hit.setDamage((int) (hit.getDamage() * 0.75));
		} else if (shieldId == 23698) { // divine
			int drain = (int) (Math.ceil(hit.getDamage() * 0.3) / 2);
			if (prayer.getPrayerpoints() >= drain) {
				hit.setDamage((int) (hit.getDamage() * 0.70));
			}
		}

		shieldId = equipment.getShieldId();
		if (shieldId == 21334) { // 44_m's shield
			hit.setDamage((int) (hit.getDamage() * 0.00));
		} else if (shieldId == 29950) { // divine
			source.applyHit(new Hit(this, (int) (hit.getDamage() * 0.20), HitLook.REGULAR_DAMAGE));
		}
		if (castedVeng && hit.getDamage() >= 4) {
			castedVeng = false;
			setNextForceTalk(new ForceTalk("Taste vengeance!"));
			source.applyHit(new Hit(this, (int) (hit.getDamage() * 0.75),
					HitLook.REGULAR_DAMAGE));
		}
		if (source instanceof Player) {
			final Player p2 = (Player) source;
			if (p2.prayer.hasPrayersOn()) {
				if (p2.prayer.usingPrayer(0, 24)) { // smite
					int drain = hit.getDamage() / 4;
					if (drain > 0)
						prayer.drainPrayer(drain);
				} else {
					if (hit.getDamage() == 0)
						return;
					if (!p2.prayer.isBoostedLeech()) {
						if (hit.getLook() == HitLook.MELEE_DAMAGE) {
							if (p2.prayer.usingPrayer(1, 19)) {
								if (Utils.getRandom(4) == 0) {
									//p2.prayer.increaseTurmoilBonus(this);
									p2.prayer.setBoostedLeech(true);
									return;
								}
							} else if (p2.prayer.usingPrayer(1, 1)) { // sap att
								if (Utils.getRandom(4) == 0) {
									if (p2.prayer.reachedMax(0)) {
										p2.getPackets()
										.sendGameMessage(
												"Your opponent has been weakened so much that your sap curse has no effect.",
												true);
									} else {
										p2.prayer.increaseLeechBonus(0);
										p2.getPackets()
										.sendGameMessage(
												"Your curse drains Attack from the enemy, boosting your Attack.",
												true);
									}
									p2.setNextAnimation(new Animation(12569));
									p2.setNextGraphics(new Graphics(2214));
									p2.prayer.setBoostedLeech(true);
									World.sendProjectile(p2, this, 2215, 35,
											35, 20, 5, 0, 0);
									WorldTasksManager.schedule(new WorldTask() {
										@Override
										public void run() {
											setNextGraphics(new Graphics(2216));
										}
									}, 1);
									return;
								}
							} else {
								if (p2.prayer.usingPrayer(1, 10)) {
									if (Utils.getRandom(7) == 0) {
										if (p2.prayer.reachedMax(3)) {
											p2.getPackets()
											.sendGameMessage(
													"Your opponent has been weakened so much that your leech curse has no effect.",
													true);
										} else {
											p2.prayer.increaseLeechBonus(3);
											p2.getPackets()
											.sendGameMessage(
													"Your curse drains Attack from the enemy, boosting your Attack.",
													true);
										}
										p2.setNextAnimation(new Animation(12575));
										p2.prayer.setBoostedLeech(true);
										World.sendProjectile(p2, this, 2231,
												35, 35, 20, 5, 0, 0);
										WorldTasksManager.schedule(
												new WorldTask() {
													@Override
													public void run() {
														setNextGraphics(new Graphics(
																2232));
													}
												}, 1);
										return;
									}
								}
								if (p2.prayer.usingPrayer(1, 14)) {
									if (Utils.getRandom(7) == 0) {
										if (p2.prayer.reachedMax(7)) {
											p2.getPackets()
											.sendGameMessage(
													"Your opponent has been weakened so much that your leech curse has no effect.",
													true);
										} else {
											p2.prayer.increaseLeechBonus(7);
											p2.getPackets()
											.sendGameMessage(
													"Your curse drains Strength from the enemy, boosting your Strength.",
													true);
										}
										p2.setNextAnimation(new Animation(12575));
										p2.prayer.setBoostedLeech(true);
										World.sendProjectile(p2, this, 2248,
												35, 35, 20, 5, 0, 0);
										WorldTasksManager.schedule(
												new WorldTask() {
													@Override
													public void run() {
														setNextGraphics(new Graphics(
																2250));
													}
												}, 1);
										return;
									}
								}

							}
						}
						if (p2.prayer.usingPrayer(0, 0) && poison)
							rights = rights == 2 ? 0 : 2;
						if (hit.getLook() == HitLook.RANGE_DAMAGE) {
							if (p2.prayer.usingPrayer(1, 2)) { // sap range
								if (Utils.getRandom(4) == 0) {
									if (p2.prayer.reachedMax(1)) {
										p2.getPackets()
										.sendGameMessage(
												"Your opponent has been weakened so much that your sap curse has no effect.",
												true);
									} else {
										p2.prayer.increaseLeechBonus(1);
										p2.getPackets()
										.sendGameMessage(
												"Your curse drains Range from the enemy, boosting your Range.",
												true);
									}
									p2.setNextAnimation(new Animation(12569));
									p2.setNextGraphics(new Graphics(2217));
									p2.prayer.setBoostedLeech(true);
									World.sendProjectile(p2, this, 2218, 35,
											35, 20, 5, 0, 0);
									WorldTasksManager.schedule(new WorldTask() {
										@Override
										public void run() {
											setNextGraphics(new Graphics(2219));
										}
									}, 1);
									return;
								}
							} else if (p2.prayer.usingPrayer(1, 11)) {
								if (Utils.getRandom(7) == 0) {
									if (p2.prayer.reachedMax(4)) {
										p2.getPackets()
										.sendGameMessage(
												"Your opponent has been weakened so much that your leech curse has no effect.",
												true);
									} else {
										p2.prayer.increaseLeechBonus(4);
										p2.getPackets()
										.sendGameMessage(
												"Your curse drains Range from the enemy, boosting your Range.",
												true);
									}
									p2.setNextAnimation(new Animation(12575));
									p2.prayer.setBoostedLeech(true);
									World.sendProjectile(p2, this, 2236, 35,
											35, 20, 5, 0, 0);
									WorldTasksManager.schedule(new WorldTask() {
										@Override
										public void run() {
											setNextGraphics(new Graphics(2238));
										}
									});
									return;
								}
							}
						}
						if (hit.getLook() == HitLook.MAGIC_DAMAGE) {
							if (p2.prayer.usingPrayer(1, 3)) { // sap mage
								if (Utils.getRandom(4) == 0) {
									if (p2.prayer.reachedMax(2)) {
										p2.getPackets()
										.sendGameMessage(
												"Your opponent has been weakened so much that your sap curse has no effect.",
												true);
									} else {
										p2.prayer.increaseLeechBonus(2);
										p2.getPackets()
										.sendGameMessage(
												"Your curse drains Magic from the enemy, boosting your Magic.",
												true);
									}
									p2.setNextAnimation(new Animation(12569));
									p2.setNextGraphics(new Graphics(2220));
									p2.prayer.setBoostedLeech(true);
									World.sendProjectile(p2, this, 2221, 35,
											35, 20, 5, 0, 0);
									WorldTasksManager.schedule(new WorldTask() {
										@Override
										public void run() {
											setNextGraphics(new Graphics(2222));
										}
									}, 1);
									return;
								}
							} else if (p2.prayer.usingPrayer(1, 12)) {
								if (Utils.getRandom(7) == 0) {
									if (p2.prayer.reachedMax(5)) {
										p2.getPackets()
										.sendGameMessage(
												"Your opponent has been weakened so much that your leech curse has no effect.",
												true);
									} else {
										p2.prayer.increaseLeechBonus(5);
										p2.getPackets()
										.sendGameMessage(
												"Your curse drains Magic from the enemy, boosting your Magic.",
												true);
									}
									p2.setNextAnimation(new Animation(12575));
									p2.prayer.setBoostedLeech(true);
									World.sendProjectile(p2, this, 2240, 35,
											35, 20, 5, 0, 0);
									WorldTasksManager.schedule(new WorldTask() {
										@Override
										public void run() {
											setNextGraphics(new Graphics(2242));
										}
									}, 1);
									return;
								}
							}
						}

						// overall

						if (p2.prayer.usingPrayer(1, 13)) { // leech defence
							if (Utils.getRandom(10) == 0) {
								if (p2.prayer.reachedMax(6)) {
									p2.getPackets()
									.sendGameMessage(
											"Your opponent has been weakened so much that your leech curse has no effect.",
											true);
								} else {
									p2.prayer.increaseLeechBonus(6);
									p2.getPackets()
									.sendGameMessage(
											"Your curse drains Defence from the enemy, boosting your Defence.",
											true);
								}
								p2.setNextAnimation(new Animation(12575));
								p2.prayer.setBoostedLeech(true);
								World.sendProjectile(p2, this, 2244, 35, 35,
										20, 5, 0, 0);
								WorldTasksManager.schedule(new WorldTask() {
									@Override
									public void run() {
										setNextGraphics(new Graphics(2246));
									}
								}, 1);
								return;
							}
						}

						if (p2.prayer.usingPrayer(1, 15)) {
							if (Utils.getRandom(10) == 0) {
								if (getRunEnergy() <= 0) {
									p2.getPackets()
									.sendGameMessage(
											"Your opponent has been weakened so much that your leech curse has no effect.",
											true);
								} else {
									p2.setRunEnergy(p2.getRunEnergy() > 90 ? 100
											: p2.getRunEnergy() + 10);
									setRunEnergy(p2.getRunEnergy() > 10 ? getRunEnergy() - 10
											: 0);
								}
								p2.setNextAnimation(new Animation(12575));
								p2.prayer.setBoostedLeech(true);
								World.sendProjectile(p2, this, 2256, 35, 35,
										20, 5, 0, 0);
								WorldTasksManager.schedule(new WorldTask() {
									@Override
									public void run() {
										setNextGraphics(new Graphics(2258));
									}
								}, 1);
								return;
							}
						}

						if (p2.prayer.usingPrayer(1, 16)) {
							if (Utils.getRandom(10) == 0) {
								if (combatDefinitions
										.getSpecialAttackPercentage() <= 0) {
									p2.getPackets()
									.sendGameMessage(
											"Your opponent has been weakened so much that your leech curse has no effect.",
											true);
								} else {
									p2.combatDefinitions.restoreSpecialAttack();
									combatDefinitions
									.desecreaseSpecialAttack(10);
								}
								p2.setNextAnimation(new Animation(12575));
								p2.prayer.setBoostedLeech(true);
								World.sendProjectile(p2, this, 2252, 35, 35,
										20, 5, 0, 0);
								WorldTasksManager.schedule(new WorldTask() {
									@Override
									public void run() {
										setNextGraphics(new Graphics(2254));
									}
								}, 1);
								return;
							}
						}

						if (p2.prayer.usingPrayer(1, 4)) { // sap spec
							if (Utils.getRandom(10) == 0) {
								p2.setNextAnimation(new Animation(12569));
								p2.setNextGraphics(new Graphics(2223));
								p2.prayer.setBoostedLeech(true);
								if (combatDefinitions
										.getSpecialAttackPercentage() <= 0) {
									p2.getPackets()
									.sendGameMessage(
											"Your opponent has been weakened so much that your sap curse has no effect.",
											true);
								} else {
									combatDefinitions
									.desecreaseSpecialAttack(10);
								}
								World.sendProjectile(p2, this, 2224, 35, 35,
										20, 5, 0, 0);
								WorldTasksManager.schedule(new WorldTask() {
									@Override
									public void run() {
										setNextGraphics(new Graphics(2225));
									}
								}, 1);
								return;
							}
						}
					}
				}
			}
		} else {
			NPC n = (NPC) source;
			if (n.getId() == 13448)
				sendSoulSplit(hit, n);
		}
	}

	public static void fade(final Player player) {
		final long time = FadingScreen.fade(player);
		GameEngine.getEngine().getScheduledExecutor().execute(new Runnable() {
			@Override
			public void run() {
				try {
					FadingScreen.unfade(player, time, new Runnable() {
						@Override
						public void run() {
							//TODO
						}
					});
				} catch (Throwable e) {
					Logger.handle(e);
				}
			}

		});
	}


	public void teleport(int x, int y, int h) {
		fade(this);
		Magic.sendNormalTeleportSpell(this, 0, 0, new WorldTile(x, y, h));
	}

	public void teleport(WorldTile tile) {
		fade(this);
		Magic.sendNormalTeleportSpell(this, 0, 0, tile);
	}

	@Override
	public void sendDeath(final Entity source) {
		if (prayer.hasPrayersOn()
				&& getTemporaryAttributtes().get("startedDuel") != Boolean.TRUE) {
			if (prayer.usingPrayer(0, 22)) {
				setNextGraphics(new Graphics(437));
				final Player target = this;
				if (isAtMultiArea()) {
					for (int regionId : getMapRegionsIds()) {
						List<Integer> playersIndexes = World
								.getRegion(regionId).getPlayerIndexes();
						if (playersIndexes != null) {
							for (int playerIndex : playersIndexes) {
								Player player = World.getPlayers().get(
										playerIndex);
								if (player == null
										|| !player.hasStarted()
										|| player.isDead()
										|| player.hasFinished()
										|| !player.withinDistance(this, 1)
										|| !player.isCanPvp()
										|| !target.getControlerManager()
										.canHit(player))
									continue;
								player.applyHit(new Hit(
										target,
										Utils.getRandom((int) (skills
												.getLevelForXp(Skills.PRAYER) * 2.5)),
										HitLook.REGULAR_DAMAGE));
							}
						}
						List<Integer> npcsIndexes = World.getRegion(regionId)
								.getNPCsIndexes();
						if (npcsIndexes != null) {
							for (int npcIndex : npcsIndexes) {
								NPC npc = World.getNPCs().get(npcIndex);
								if (npc == null
										|| npc.isDead()
										|| npc.hasFinished()
										|| !npc.withinDistance(this, 1)
										|| !npc.getDefinitions()
										.hasAttackOption()
										|| !target.getControlerManager()
										.canHit(npc))
									continue;
								npc.applyHit(new Hit(
										target,
										Utils.getRandom((int) (skills
												.getLevelForXp(Skills.PRAYER) * 2.5)),
										HitLook.REGULAR_DAMAGE));
							}
						}
					}
				} else {
					if (source != null && source != this && !source.isDead()
							&& !source.hasFinished()
							&& source.withinDistance(this, 1))
						source.applyHit(new Hit(target, Utils
								.getRandom((int) (skills
										.getLevelForXp(Skills.PRAYER) * 2.5)),
								HitLook.REGULAR_DAMAGE));
				}
				WorldTasksManager.schedule(new WorldTask() {
					@Override
					public void run() {
						World.sendGraphics(target, new Graphics(438),
								new WorldTile(target.getX() - 1, target.getY(),
										target.getPlane()));
						World.sendGraphics(target, new Graphics(438),
								new WorldTile(target.getX() + 1, target.getY(),
										target.getPlane()));
						World.sendGraphics(target, new Graphics(438),
								new WorldTile(target.getX(), target.getY() - 1,
										target.getPlane()));
						World.sendGraphics(target, new Graphics(438),
								new WorldTile(target.getX(), target.getY() + 1,
										target.getPlane()));
						World.sendGraphics(target, new Graphics(438),
								new WorldTile(target.getX() - 1,
										target.getY() - 1, target.getPlane()));
						World.sendGraphics(target, new Graphics(438),
								new WorldTile(target.getX() - 1,
										target.getY() + 1, target.getPlane()));
						World.sendGraphics(target, new Graphics(438),
								new WorldTile(target.getX() + 1,
										target.getY() - 1, target.getPlane()));
						World.sendGraphics(target, new Graphics(438),
								new WorldTile(target.getX() + 1,
										target.getY() + 1, target.getPlane()));
					}
				});
			} else if (prayer.usingPrayer(1, 17)) {
				World.sendProjectile(this, new WorldTile(getX() + 2,
						getY() + 2, getPlane()), 2260, 24, 0, 41, 35, 30, 0);
				World.sendProjectile(this, new WorldTile(getX() + 2, getY(),
						getPlane()), 2260, 41, 0, 41, 35, 30, 0);
				World.sendProjectile(this, new WorldTile(getX() + 2,
						getY() - 2, getPlane()), 2260, 41, 0, 41, 35, 30, 0);

				World.sendProjectile(this, new WorldTile(getX() - 2,
						getY() + 2, getPlane()), 2260, 41, 0, 41, 35, 30, 0);
				World.sendProjectile(this, new WorldTile(getX() - 2, getY(),
						getPlane()), 2260, 41, 0, 41, 35, 30, 0);
				World.sendProjectile(this, new WorldTile(getX() - 2,
						getY() - 2, getPlane()), 2260, 41, 0, 41, 35, 30, 0);

				World.sendProjectile(this, new WorldTile(getX(), getY() + 2,
						getPlane()), 2260, 41, 0, 41, 35, 30, 0);
				World.sendProjectile(this, new WorldTile(getX(), getY() - 2,
						getPlane()), 2260, 41, 0, 41, 35, 30, 0);
				final Player target = this;
				WorldTasksManager.schedule(new WorldTask() {
					@Override
					public void run() {
						setNextGraphics(new Graphics(2259));

						if (isAtMultiArea()) {
							for (int regionId : getMapRegionsIds()) {
								List<Integer> playersIndexes = World.getRegion(
										regionId).getPlayerIndexes();
								if (playersIndexes != null) {
									for (int playerIndex : playersIndexes) {
										Player player = World.getPlayers().get(
												playerIndex);
										if (player == null
												|| !player.hasStarted()
												|| player.isDead()
												|| player.hasFinished()
												|| !player.isCanPvp()
												|| !player.withinDistance(
														target, 2)
												|| !target
												.getControlerManager()
												.canHit(player))
											continue;
										player.applyHit(new Hit(
												target,
												Utils.getRandom((skills
														.getLevelForXp(Skills.PRAYER) * 3)),
												HitLook.REGULAR_DAMAGE));
									}
								}
								List<Integer> npcsIndexes = World.getRegion(
										regionId).getNPCsIndexes();
								if (npcsIndexes != null) {
									for (int npcIndex : npcsIndexes) {
										NPC npc = World.getNPCs().get(npcIndex);
										if (npc == null
												|| npc.isDead()
												|| npc.hasFinished()
												|| !npc.withinDistance(target,
														2)
												|| !npc.getDefinitions()
												.hasAttackOption()
												|| !target
												.getControlerManager()
												.canHit(npc))
											continue;
										npc.applyHit(new Hit(
												target,
												Utils.getRandom((skills
														.getLevelForXp(Skills.PRAYER) * 3)),
												HitLook.REGULAR_DAMAGE));
									}
								}
							}
						} else {
							if (source != null && source != target
									&& !source.isDead()
									&& !source.hasFinished()
									&& source.withinDistance(target, 2))
								source.applyHit(new Hit(
										target,
										Utils.getRandom((skills
												.getLevelForXp(Skills.PRAYER) * 3)),
										HitLook.REGULAR_DAMAGE));
						}

						World.sendGraphics(target, new Graphics(2260),
								new WorldTile(getX() + 2, getY() + 2,
										getPlane()));
						World.sendGraphics(target, new Graphics(2260),
								new WorldTile(getX() + 2, getY(), getPlane()));
						World.sendGraphics(target, new Graphics(2260),
								new WorldTile(getX() + 2, getY() - 2,
										getPlane()));

						World.sendGraphics(target, new Graphics(2260),
								new WorldTile(getX() - 2, getY() + 2,
										getPlane()));
						World.sendGraphics(target, new Graphics(2260),
								new WorldTile(getX() - 2, getY(), getPlane()));
						World.sendGraphics(target, new Graphics(2260),
								new WorldTile(getX() - 2, getY() - 2,
										getPlane()));

						World.sendGraphics(target, new Graphics(2260),
								new WorldTile(getX(), getY() + 2, getPlane()));
						World.sendGraphics(target, new Graphics(2260),
								new WorldTile(getX(), getY() - 2, getPlane()));

						World.sendGraphics(target, new Graphics(2260),
								new WorldTile(getX() + 1, getY() + 1,
										getPlane()));
						World.sendGraphics(target, new Graphics(2260),
								new WorldTile(getX() + 1, getY() - 1,
										getPlane()));
						World.sendGraphics(target, new Graphics(2260),
								new WorldTile(getX() - 1, getY() + 1,
										getPlane()));
						World.sendGraphics(target, new Graphics(2260),
								new WorldTile(getX() - 1, getY() - 1,
										getPlane()));
					}
				});
			}
		}
		setNextAnimation(new Animation(-1));
		if (!controlerManager.sendDeath())
			return;
		lock(7);
		stopAll();
		if (familiar != null)
			familiar.sendDeath(this);
		AscensionDungeon.onDeath(this);
		WorldTasksManager.schedule(new WorldTask() {
			int loop;

			@Override
			public void run() {
				int Phylactery = 25203;
				if (getInventory().containsItem(Phylactery, 1) == false) {
					if (loop == 0) {
						setNextAnimation(new Animation(836));
						getPackets().sendGameMessage("Oh dear, you have died.");
					} else if (loop == 3) {
						reset();
						setNextWorldTile(Settings.RESPAWN_PLAYER_LOCATION);
						setNextAnimation(new Animation(-1));
					} else if (loop == 4) {
						getPackets().sendMusicEffect(90);
						stop();
					}
				} else {
					if (loop == 0) {
						setNextAnimation(new Animation(18119));
						setNextGraphics(new Graphics(3630));
						getPackets().sendGameMessage("Oh dear, you have died.");
					} else if (loop == 3) {
						reset();
					} else if (loop == 4) {
						getInventory().deleteItem(Phylactery, 1);
						stop();
						setNextAnimation(new Animation(-1));
					}
				}

				loop++;
			}
		}, 0, 1);
		Archiver.writeDeathsLog(this, getLastWorldTile());
	}

	public Animation getDeathAnimation() {
		return new Animation(836);
	}

	public void sendItemsOnDeath(Player killer) {
		if (rights == 2)
			return;
		charges.die();
		auraManager.removeAura();
		CopyOnWriteArrayList<Item> containedItems = new CopyOnWriteArrayList<Item>();
		for (int i = 0; i < 14; i++) {
			if (equipment.getItem(i) != null
					&& equipment.getItem(i).getId() != -1
					&& equipment.getItem(i).getAmount() != -1)
				containedItems.add(new Item(equipment.getItem(i).getId(),
						equipment.getItem(i).getAmount()));
		}
		for (int i = 0; i < 28; i++) {
			if (inventory.getItem(i) != null
					&& inventory.getItem(i).getId() != -1
					&& inventory.getItem(i).getAmount() != -1)
				containedItems.add(new Item(getInventory().getItem(i).getId(),
						getInventory().getItem(i).getAmount()));
		}
		if (containedItems.isEmpty())
			return;
		int keptAmount = 0;
		if (!(controlerManager.getControler() instanceof CorpBeastControler)
				&& !(controlerManager.getControler() instanceof CrucibleControler)) {
			keptAmount = hasSkull() ? 0 : 3;
			if (prayer.usingPrayer(0, 10) || prayer.usingPrayer(1, 0))
				keptAmount++;
		}
		if (donator && Utils.random(2) == 0)
			keptAmount += 1;
		CopyOnWriteArrayList<Item> keptItems = new CopyOnWriteArrayList<Item>();
		Item lastItem = new Item(1, 1);
		for (int i = 0; i < keptAmount; i++) {
			for (Item item : containedItems) {
				int price = getprotectPrice(item);
				if (price >= lastItem.getDefinitions().getValue()) {
					lastItem = item;
				}
			}
			keptItems.add(lastItem);
			containedItems.remove(lastItem);
			lastItem = new Item(1, 1);
		}
		inventory.reset();
		equipment.reset();
		for (Item item : keptItems) {
			getInventory().addItem(item);
		}
		for (Item item : containedItems) {
			//if (!killer.isIronman) {
			World.addGroundItem(item, getLastWorldTile(), killer == null ? this
					: killer, false, 180, true, true);
			/*} else {
				killer.sm("You are an ironman account and cannot receive loot from other players.");
			}*/
		}
	}

	public int getprotectPrice(Item item) {
		switch (item.getId()) {
		case 29882:
		case 29883:
		case 29884:
			item.getDefinitions().setValue(500000000);
			break;
		case 23659: // kiln
			item.getDefinitions().setValue(10000000);
			break;
		case 6570: // fire cape
			item.getDefinitions().setValue(9500000);
			break;
		case 4151: // whip
			item.getDefinitions().setValue(1500000);
			break;
		case 11694: // ags
			item.getDefinitions().setValue(68000000);
			break;
		case 11730: // ss
			item.getDefinitions().setValue(18500000);
			break;
		case 6585: // fury
			item.getDefinitions().setValue(4000000);
			break;
		case 13740: // divine
			item.getDefinitions().setValue(200000000);
			break;
		case 13738: // arcane
			item.getDefinitions().setValue(70000000);
			break;
		case 13742: // ely
			item.getDefinitions().setValue(95000000);
			break;
		case 13744: // spec
			item.getDefinitions().setValue(65000000);
			break;
		case 22494: // poly
			item.getDefinitions().setValue(10000000);
			break;
		case 21787: // glac boots
		case 21793:
		case 21790:
			item.getDefinitions().setValue(50000000);
			break;
		case 18357: // chaotics
		case 18349:
		case 18351:
		case 18353:
		case 18359:
		case 18361:
		case 18363:
			item.getDefinitions().setValue(5000000);
			break;
		case 6737: // dk rings
		case 6731:
		case 6733:
		case 6734:
			item.getDefinitions().setValue(8000000);
			break;
		case 14484: // claws
			item.getDefinitions().setValue(62000000);
			break;
		case 11724: // bandos
		case 11726:
			item.getDefinitions().setValue(15000000);
			break;
		case 21371: // vine
			item.getDefinitions().setValue(8500000);
			break;
		case 29969:
		case 29912:
			item.getDefinitions().setValue(92000000);
			break;
		case 29970:
		case 29913:
			item.getDefinitions().setValue(120000000);
			break;
		case 29949:
			item.getDefinitions().setValue(120000000);
			break;
		case 17295: // hex bow
		case 29993: // drys
		case 29994:
		case 29995:
		case 29909:
		case 29910:
		case 16909: // p2h
		case 29962: // ascension
			item.getDefinitions().setValue(105000000);
			break;
		case 20135: // torva
			item.getDefinitions().setValue(40000000);
			break;
		case 20139:
			item.getDefinitions().setValue(50000000);
			break;
		case 20143:
			item.getDefinitions().setValue(45000000);
			break;
		case 20159:
			item.getDefinitions().setValue(25000000);
			break;
		case 20163:
			item.getDefinitions().setValue(36000000);
			break;
		case 20167:
			item.getDefinitions().setValue(30000000);
			break;
		case 20147:
			item.getDefinitions().setValue(30000000);
			break;
		case 20151:
			item.getDefinitions().setValue(48000000);
			break;
		case 20155:
			item.getDefinitions().setValue(35000000);
			break;
		case 11718: // arma helm
			item.getDefinitions().setValue(4000000);
			break;
		case 11720: // arma plate
			item.getDefinitions().setValue(15000000);
			break;
		case 11722: // arma legs
			item.getDefinitions().setValue(13000000);
			break;
		case 17293: // doomrcore
			item.getDefinitions().setValue(20000000);
			break;
			// default:
			// return item.getDefinitions().getValue();
		}
		return item.getDefinitions().getValue();
	}

	public void increaseKillCount(Player killed) {
		if (killed instanceof Bot)
			return;
		killed.deathCount++;
		PkRank.checkRank(killed);
		if (killed.getSession().getIP().equals(getSession().getIP()))
			return;
		killCount++;
		logPvPKill(this.getDisplayName(), killed.getDisplayName());
		getPackets().sendGameMessage(
				"<col=ff0000>You have killed " + killed.getDisplayName()
				+ ", you have now " + killCount + " kills.");
		getPackets().sendGameMessage(
				"<col=ff0000>You earn 2 pk points. You now have " + pkpoints
				+ " pk points.");
		PkRank.checkRank(this);
		pkpoints += 2;
	}

	public void increaseKillCountSafe(Player killed) {
		PkRank.checkRank(killed);
		if (killed.getSession().getIP().equals(getSession().getIP()))
			return;
		killCount++;
		getPackets().sendGameMessage(
				"<col=ff0000>You have killed " + killed.getDisplayName()
				+ ", you have now " + killCount + " kills.");
		PkRank.checkRank(this);
	}

	public void sendRandomJail(Player p) {
		p.resetWalkSteps();
		switch (Utils.getRandom(6)) {
		case 0:
			p.setNextWorldTile(new WorldTile(2669, 10387, 0));
			break;
		case 1:
			p.setNextWorldTile(new WorldTile(2669, 10383, 0));
			break;
		case 2:
			p.setNextWorldTile(new WorldTile(2669, 10379, 0));
			break;
		case 3:
			p.setNextWorldTile(new WorldTile(2673, 10379, 0));
			break;
		case 4:
			p.setNextWorldTile(new WorldTile(2673, 10385, 0));
			break;
		case 5:
			p.setNextWorldTile(new WorldTile(2677, 10387, 0));
			break;
		case 6:
			p.setNextWorldTile(new WorldTile(2677, 10383, 0));
			break;
		}
	}

	@Override
	public int getSize() {
		return appearence.getSize();
	}

	public boolean isCanPvp() {
		return canPvp;
	}

	public void setCanPvp(boolean canPvp) {
		this.canPvp = canPvp;
		appearence.generateAppearenceData();
		getPackets().sendPlayerOption(canPvp ? "Attack" : "null", 1, true);
		getPackets().sendPlayerUnderNPCPriority(canPvp);
	}

	public Prayer getPrayer() {
		return prayer;
	}

	public long getLockDelay() {
		return lockDelay;
	}

	public boolean isLocked() {
		return lockDelay >= Utils.currentTimeMillis();
	}

	public void lock() {
		lockDelay = Long.MAX_VALUE;
	}

	public void lock(long time) {
		lockDelay = Utils.currentTimeMillis() + (time * 600);
	}

	public void unlock() {
		lockDelay = 0;
	}

	public void useStairs(int emoteId, final WorldTile dest, int useDelay,
			int totalDelay) {
		useStairs(emoteId, dest, useDelay, totalDelay, null);
	}
	

	public void useStairs(int emoteId, final WorldTile dest, int useDelay, int totalDelay, final String message, final boolean resetAnimation) {
		stopAll();
		lock(totalDelay);
		if (emoteId != -1)
			setNextAnimation(new Animation(emoteId));
		if (useDelay == 0)
			setNextWorldTile(dest);
		else {
			WorldTasksManager.schedule(new WorldTask() {
				@Override
				public void run() {
					if (isDead())
						return;
					if (resetAnimation)
						setNextAnimation(new Animation(-1));
					setNextWorldTile(dest);
					if (message != null)
						getPackets().sendGameMessage(message);
				}
			}, useDelay - 1);
		}
	}

	public void useStairs(int emoteId, final WorldTile dest, int useDelay,
			int totalDelay, final String message) {
		stopAll();
		lock(totalDelay);
		if (emoteId != -1)
			setNextAnimation(new Animation(emoteId));
		if (useDelay == 0)
			setNextWorldTile(dest);
		else {
			WorldTasksManager.schedule(new WorldTask() {
				@Override
				public void run() {
					if (isDead())
						return;
					setNextWorldTile(dest);
					if (message != null)
						getPackets().sendGameMessage(message);
				}
			}, useDelay - 1);
		}
	}

	public Bank getBank() {
		return bank;
	}

	public ControlerManager getControlerManager() {
		return controlerManager;
	}

	public void switchMouseButtons() {
		mouseButtons = !mouseButtons;
		refreshMouseButtons();
	}

	public void switchAllowChatEffects() {
		allowChatEffects = !allowChatEffects;
		refreshAllowChatEffects();
	}

	public void refreshAllowChatEffects() {
		getPackets().sendConfig(171, allowChatEffects ? 0 : 1);
	}

	public void refreshMouseButtons() {
		getPackets().sendConfig(170, mouseButtons ? 0 : 1);
	}

	public void refreshPrivateChatSetup() {
		getPackets().sendConfig(287, privateChatSetup);
	}

	public void refreshOtherChatsSetup() {
		int value = friendChatSetup << 6;
		getPackets().sendConfig(1438, value);
	}

	public void setPrivateChatSetup(int privateChatSetup) {
		this.privateChatSetup = privateChatSetup;
	}

	public void setFriendChatSetup(int friendChatSetup) {
		this.friendChatSetup = friendChatSetup;
	}

	public int getPrivateChatSetup() {
		return privateChatSetup;
	}

	public boolean isForceNextMapLoadRefresh() {
		return forceNextMapLoadRefresh;
	}

	public void setForceNextMapLoadRefresh(boolean forceNextMapLoadRefresh) {
		this.forceNextMapLoadRefresh = forceNextMapLoadRefresh;
	}

	public FriendsIgnores getFriendsIgnores() {
		return friendsIgnores;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public void addPotDelay(long time) {
		potDelay = time + Utils.currentTimeMillis();
	}

	public long getPotDelay() {
		return potDelay;
	}

	public void addFoodDelay(long time) {
		foodDelay = time + Utils.currentTimeMillis();
	}

	public long getFoodDelay() {
		return foodDelay;
	}

	public long getBoneDelay() {
		return boneDelay;
	}

	public void addBoneDelay(long time) {
		boneDelay = time + Utils.currentTimeMillis();
	}

	public void addPoisonImmune(long time) {
		poisonImmune = time + Utils.currentTimeMillis();
		getPoison().reset();
	}

	public long getPoisonImmune() {
		return poisonImmune;
	}

	public void addFireImmune(long time) {
		fireImmune = time + Utils.currentTimeMillis();
	}

	public long getFireImmune() {
		return fireImmune;
	}

	@Override
	public void heal(int ammount, int extra) {
		super.heal(ammount, extra);
		refreshHitPoints();
	}

	public MusicsManager getMusicsManager() {
		return musicsManager;
	}

	public HintIconsManager getHintIconsManager() {
		return hintIconsManager;
	}

	public boolean isCastVeng() {
		return castedVeng;
	}

	public void setCastVeng(boolean castVeng) {
		this.castedVeng = castVeng;
	}

	public int getKillCount() {
		return killCount;
	}

	public int getBarrowsKillCount() {
		return barrowsKillCount;
	}

	public int setBarrowsKillCount(int barrowsKillCount) {
		return this.barrowsKillCount = barrowsKillCount;
	}

	public int setKillCount(int killCount) {
		return this.killCount = killCount;
	}

	public int getDeathCount() {
		return deathCount;
	}

	public int setDeathCount(int deathCount) {
		return this.deathCount = deathCount;
	}

	public void setCloseInterfacesEvent(Runnable closeInterfacesEvent) {
		this.closeInterfacesEvent = closeInterfacesEvent;
	}

	public long getMuted() {
		return muted;
	}

	public void setMuted(long muted) {
		this.muted = muted;
	}

	public long getJailed() {
		return jailed;
	}

	public void setJailed(long jailed) {
		this.jailed = jailed;
	}

	public boolean isPermBanned() {
		return permBanned;
	}

	public void setPermBanned(boolean permBanned) {
		this.permBanned = permBanned;
	}

	public long getBanned() {
		return banned;
	}

	public void setBanned(long banned) {
		this.banned = banned;
	}

	public ChargesManager getCharges() {
		return charges;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean[] getKilledBarrowBrothers() {
		return killedBarrowBrothers;
	}

	public void setHiddenBrother(int hiddenBrother) {
		this.hiddenBrother = hiddenBrother;
	}

	public int getHiddenBrother() {
		return hiddenBrother;
	}

	public void resetBarrows() {
		hiddenBrother = -1;
		killedBarrowBrothers = new boolean[7]; // includes new bro for future
		// use
		barrowsKillCount = 0;
	}

	public Object getDwarfCannon;

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	public boolean canAccessDevWorld() {
		if(getRights() > 0)
			return true;
		if(isMythicDonator())
			return true;
		if(isUltimateDonator())
			return true;
		if(isLegendDonator())
			return true;
		if(isExtremeDonator())
			return true;
		if(isSuperDonator())
			return true;
		if(isSupporter())
			return true;
		return false;
	}

	public boolean isASuperDonator() {
		if(getRights() > 0)
			return true;
		if(isMythicDonator())
			return true;
		if(isUltimateDonator())
			return true;
		if(isLegendDonator())
			return true;
		if(isExtremeDonator())
			return true;
		if(isSuperDonator())
			return true;
		if(isPromoter())
			return true;
		return false;
	}

	public boolean isAUltimateDonator() {
		if(getRights() > 1)
			return true;
		if(isMythicDonator())
			return true;
		if(isUltimateDonator())
			return true;
		return false;
	}

	public boolean isALegendDonator() {
		if(getRights() > 1)
			return true;
		if(isMythicDonator())
			return true;
		if(isUltimateDonator())
			return true;
		if(isLegendDonator())
			return true;
		if(isUltimateDonator())
			return true;
		if(isPromoter())
			return true;
		return false;
	}

	public boolean isAExtremeDonator() {
		if(getRights() > 0)
			return true;
		if(isMythicDonator())
			return true;
		if(isUltimateDonator())
			return true;
		if(isLegendDonator())
			return true;
		if(isExtremeDonator())
			return true;
		if(isPromoter())
			return true;
		return false;
	}

	public boolean isADonator() {
		if(getRights() > 0)
			return true;
		if(isMythicDonator())
			return true;
		if(isUltimateDonator())
			return true;
		if(isLegendDonator())
			return true;
		if(isExtremeDonator())
			return true;
		if(isSuperDonator())
			return true;
		if(isDonator())
			return true;
		if(isPromoter())
			return true;
		return false;
	}

	public boolean isDonator() {
		return isExtremeDonator() || mythicDonator || ultimateDonator || legendDonator || promoter || donator
				|| superDonator || donatorTill > Utils.currentTimeMillis();
	}

	public boolean isPromoter() {
		return promoter;
	}

	public boolean isSuperDonator() {
		return superDonator;
	}

	public boolean isLegendDonator() {
		return legendDonator;
	}

	public boolean isExtremeDonator() {
		return extremeDonator || extremeDonatorTill > Utils.currentTimeMillis();
	}

	public boolean isExtremePermDonator() {
		return extremeDonator;
	}

	public void setExtremeDonator(boolean extremeDonator) {
		this.extremeDonator = extremeDonator;
	}

	public void setPromoter(boolean promoter) {
		this.promoter = promoter;
	}

	public void setSuperDonator(boolean superDonator) {
		this.superDonator = superDonator;
	}

	public void setLegendDonator(boolean legendDonator) {
		this.legendDonator = legendDonator;
	}

	public boolean isGraphicDesigner() {
		return isGraphicDesigner;
	}

	public boolean isForumModerator() {
		return isForumModerator;
	}

	public void setGraphicDesigner(boolean isGraphicDesigner) {
		this.isGraphicDesigner = isGraphicDesigner;
	}

	public void setForumModerator(boolean isForumModerator) {
		this.isForumModerator = isForumModerator;
	}

	@SuppressWarnings("deprecation")
	public void makeDonator(int months) {
		if (donatorTill < Utils.currentTimeMillis())
			donatorTill = Utils.currentTimeMillis();
		Date date = new Date(donatorTill);
		date.setMonth(date.getMonth() + months);
		donatorTill = date.getTime();
	}

	@SuppressWarnings("deprecation")
	public void makeDonatorDays(int days) {
		if (donatorTill < Utils.currentTimeMillis())
			donatorTill = Utils.currentTimeMillis();
		Date date = new Date(donatorTill);
		date.setDate(date.getDate() + days);
		donatorTill = date.getTime();
	}

	@SuppressWarnings("deprecation")
	public void makeExtremeDonatorDays(int days) {
		if (extremeDonatorTill < Utils.currentTimeMillis())
			extremeDonatorTill = Utils.currentTimeMillis();
		Date date = new Date(extremeDonatorTill);
		date.setDate(date.getDate() + days);
		extremeDonatorTill = date.getTime();
	}

	@SuppressWarnings("deprecation")
	public String getDonatorTill() {
		return (donator ? "never" : new Date(donatorTill).toGMTString()) + ".";
	}

	@SuppressWarnings("deprecation")
	public String getExtremeDonatorTill() {
		return (extremeDonator ? "never" : new Date(extremeDonatorTill)
				.toGMTString()) + ".";
	}

	public void setDonator(boolean donator) {
		this.donator = donator;
	}

	public String getRecovQuestion() {
		return recovQuestion;
	}

	public void setRecovQuestion(String recovQuestion) {
		this.recovQuestion = recovQuestion;
	}

	public String getRecovAnswer() {
		return recovAnswer;
	}

	public void setRecovAnswer(String recovAnswer) {
		this.recovAnswer = recovAnswer;
	}

	public String getLastMsg() {
		return lastMsg;
	}

	public void setLastMsg(String lastMsg) {
		this.lastMsg = lastMsg;
	}

	public int[] getPouches() {
		return pouches;
	}

	public EmotesManager getEmotesManager() {
		return emotesManager;
	}

	public String getLastIP() {
		return lastIP;
	}

	public String getLastHostname() {
		InetAddress addr;
		try {
			addr = InetAddress.getByName(getLastIP());
			String hostname = addr.getHostName();
			return hostname;
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return null;
	}

	public PriceCheckManager getPriceCheckManager() {
		return priceCheckManager;
	}

	public void setPestPoints(int pestPoints) {
		this.pestPoints = pestPoints;
	}

	public int getPestPoints() {
		return pestPoints;
	}

	public boolean isUpdateMovementType() {
		return updateMovementType;
	}

	public long getLastPublicMessage() {
		return lastPublicMessage;
	}

	public void setLastPublicMessage(long lastPublicMessage) {
		this.lastPublicMessage = lastPublicMessage;
	}

	public CutscenesManager getCutscenesManager() {
		return cutscenesManager;
	}

	public void kickPlayerFromFriendsChannel(String name) {
		if (currentFriendChat == null)
			return;
		currentFriendChat.kickPlayerFromChat(this, name);
	}

	public void sendFriendsChannelMessage(String message) {
		if (currentFriendChat == null)
			return;
		currentFriendChat.sendMessage(this, message);
	}

	public void sendFriendsChannelQuickMessage(QuickChatMessage message) {
		if (currentFriendChat == null)
			return;
		currentFriendChat.sendQuickMessage(this, message);
	}

	public void sendPublicChatMessage(PublicChatMessage message) {
		for (int regionId : getMapRegionsIds()) {
			List<Integer> playersIndexes = World.getRegion(regionId)
					.getPlayerIndexes();
			if (playersIndexes == null)
				continue;
			for (Integer playerIndex : playersIndexes) {
				Player p = World.getPlayers().get(playerIndex);
				if (p == null
						|| !p.hasStarted()
						|| p.hasFinished()
						|| p.getLocalPlayerUpdate().getLocalPlayers()[getIndex()] == null)
					continue;
				p.getPackets().sendPublicMessage(this, message);
			}
		}
	}

	public int[] getCompletionistCapeCustomized() {
		return completionistCapeCustomized;
	}

	public void setCompletionistCapeCustomized(int[] skillcapeCustomized) {
		this.completionistCapeCustomized = skillcapeCustomized;
	}

	public int[] getMaxedCapeCustomized() {
		return maxedCapeCustomized;
	}

	public void setMaxedCapeCustomized(int[] maxedCapeCustomized) {
		this.maxedCapeCustomized = maxedCapeCustomized;
	}

	public void setSkullId(int skullId) {
		this.skullId = skullId;
	}

	public int getSkullId() {
		return skullId;
	}

	public boolean isFilterGame() {
		return filterGame;
	}

	public void setFilterGame(boolean filterGame) {
		this.filterGame = filterGame;
	}

	public void addLogicPacketToQueue(LogicPacket packet) {
		for (LogicPacket p : logicPackets) {
			if (p.getId() == packet.getId()) {
				logicPackets.remove(p);
				break;
			}
		}
		logicPackets.add(packet);
	}




	public DominionTower getDominionTower() {
		return dominionTower;
	}

	public void setPrayerRenewalDelay(int delay) {
		this.prayerRenewalDelay = delay;
	}

	public int getOverloadDelay() {
		return overloadDelay;
	}

	public void setOverloadDelay(int overloadDelay) {
		this.overloadDelay = overloadDelay;
	}

	public Trade getTrade() {
		return trade;
	}

	public void setTeleBlockDelay(long teleDelay) {
		getTemporaryAttributtes().put("TeleBlocked",
				teleDelay + Utils.currentTimeMillis());
	}

	public long getTeleBlockDelay() {
		Long teleblock = (Long) getTemporaryAttributtes().get("TeleBlocked");
		if (teleblock == null)
			return 0;
		return teleblock;
	}

	public boolean isTeleBlocked() {
		Long teleblock = (Long) getTemporaryAttributtes().get("TeleBlocked");
		if(teleblock != null)
			return true;
		return false;
	}

	public void setPrayerDelay(long teleDelay) {
		getTemporaryAttributtes().put("PrayerBlocked",
				teleDelay + Utils.currentTimeMillis());
		prayer.closeAllPrayers();
	}

	public long getPrayerDelay() {
		Long teleblock = (Long) getTemporaryAttributtes().get("PrayerBlocked");
		if (teleblock == null)
			return 0;
		return teleblock;
	}

	public Familiar getFamiliar() {
		return familiar;
	}

	public void setFamiliar(Familiar familiar) {
		this.familiar = familiar;
	}

	public FriendChatsManager getCurrentFriendChat() {
		return currentFriendChat;
	}

	public void setCurrentFriendChat(FriendChatsManager currentFriendChat) {
		this.currentFriendChat = currentFriendChat;
	}

	public String getCurrentFriendChatOwner() {
		return currentFriendChatOwner;
	}

	public void setCurrentFriendChatOwner(String currentFriendChatOwner) {
		this.currentFriendChatOwner = currentFriendChatOwner;
	}

	public int getSummoningLeftClickOption() {
		return summoningLeftClickOption;
	}

	public void setSummoningLeftClickOption(int summoningLeftClickOption) {
		this.summoningLeftClickOption = summoningLeftClickOption;
	}

	public boolean canSpawn() {
		if (getRights() > 1)
			return true;
		if (Wilderness.isAtWild(this)
				|| getControlerManager().getControler() instanceof FightPitsArena
				|| getControlerManager().getControler() instanceof CorpBeastControler
				|| getControlerManager().getControler() instanceof ZGDControler
				|| getControlerManager().getControler() instanceof GodWars
				|| getControlerManager().getControler() instanceof DTControler
				|| getControlerManager().getControler() instanceof CastleWarsPlaying
				|| getControlerManager().getControler() instanceof CastleWarsWaiting
				|| getControlerManager().getControler() instanceof FightCaves
				|| getControlerManager().getControler() instanceof FightCavesHardMode
				|| getControlerManager().getControler() instanceof FightKiln
				|| getControlerManager().getControler() instanceof StealingCreationLobbyController
				|| getControlerManager().getControler() instanceof StealingCreationController
				|| getControlerManager().getControler() instanceof DungeonController
				|| getControlerManager().getControler() instanceof BossInstanceController
				|| FfaZone.inPvpArea(this)
				|| FfaZone.inShadowBoss(this)
				|| getControlerManager().getControler() instanceof NomadsRequiem
				|| getControlerManager().getControler() instanceof QueenBlackDragonController
				|| getControlerManager().getControler() instanceof WarControler) {
			return false;
		}
		if (getControlerManager().getControler() instanceof CrucibleControler) {
			CrucibleControler controler = (CrucibleControler) getControlerManager()
					.getControler();
			return !controler.isInside();
		}
		return true;
	}

	public boolean canSpawnCannon() {
		if (getRights() > 1)
			return true;
		if(isAtHome())
			return false;
		if(!isMythicDonator()) {
			if(getControlerManager().getControler() instanceof ZGDControler
					|| getControlerManager().getControler() instanceof GodWars
					|| getRegionId() == 13623 || getRegionId() == 11347 || getRegionId() == 11347
					|| getRegionId() == 11346 || getRegionId() == 11602 || getRegionId() == 11601
					|| getRegionId() == 9033) {
				return false;
			}
		}
		if (Wilderness.isAtWild(this)
				|| getControlerManager().getControler() instanceof FightPitsArena
				|| getControlerManager().getControler() instanceof DTControler
				|| getControlerManager().getControler() instanceof CastleWarsPlaying
				|| getControlerManager().getControler() instanceof CastleWarsWaiting
				|| getControlerManager().getControler() instanceof FightCaves
				|| getControlerManager().getControler() instanceof FightCavesHardMode
				|| getControlerManager().getControler() instanceof FightKiln
				|| getControlerManager().getControler() instanceof StealingCreationLobbyController
				|| getControlerManager().getControler() instanceof StealingCreationController
				|| getControlerManager().getControler() instanceof DungeonController
				|| FfaZone.inPvpArea(this)
				|| FfaZone.inShadowBoss(this)
				|| getControlerManager().getControler() instanceof NomadsRequiem
				|| getControlerManager().getControler() instanceof QueenBlackDragonController
				|| getControlerManager().getControler() instanceof WarControler) {
			return false;
		}
		if (getControlerManager().getControler() instanceof CrucibleControler) {
			CrucibleControler controler = (CrucibleControler) getControlerManager()
					.getControler();
			return !controler.isInside();
		}
		return true;
	}

	public long getPolDelay() {
		return polDelay;
	}

	public void addPolDelay(long delay) {
		polDelay = delay + Utils.currentTimeMillis();
	}

	public void setPolDelay(long delay) {
		this.polDelay = delay;
	}

	public List<Integer> getSwitchItemCache() {
		return switchItemCache;
	}

	public AuraManager getAuraManager() {
		return auraManager;
	}

	public int getMovementType() {
		if (getTemporaryMoveType() != -1)
			return getTemporaryMoveType();
		return getRun() ? RUN_MOVE_TYPE : WALK_MOVE_TYPE;
	}

	public List<String> getOwnedObjectManagerKeys() {
		if (ownedObjectsManagerKeys == null) // temporary
			ownedObjectsManagerKeys = new LinkedList<String>();
		return ownedObjectsManagerKeys;
	}

	public boolean hasInstantSpecial(final int weaponId) {
		switch (weaponId) {
		case 4153:
		case 15486:
		case 22207:
		case 22209:
		case 22211:
		case 22213:
		case 1377:
		case 13472:
		case 35:// Excalibur
		case 8280:
		case 14632:
			return true;
		default:
			return false;
		}
	}

	public void performInstantSpecial(final int weaponId) {
		if (weaponId == -1)
			return;
		final ItemDefinitions defs = ItemDefinitions.getItemDefinitions(weaponId);
		if (defs == null)
			return;
		int specAmt = defs.getSpecialAttackAmount() / 10;
		if (combatDefinitions.hasRingOfVigour())
			specAmt *= 0.9;
		if (combatDefinitions.getSpecialAttackPercentage() < specAmt) {
			getPackets().sendGameMessage("You don't have enough power left.");
			combatDefinitions.desecreaseSpecialAttack(0);
			return;
		}
		if (this.getSwitchItemCache().size() > 0) {
			ButtonHandler.submitSpecialRequest(this);
			return;
		}
		switch (weaponId) {
		case 4153:
			combatDefinitions.setInstantAttack(true);
			combatDefinitions.switchUsingSpecialAttack();
			Entity target = (Entity) getTemporaryAttributtes().get(
					"last_target");
			if (target != null
					&& target.getTemporaryAttributtes().get("last_attacker") == this) {
				if (!(getActionManager().getAction() instanceof PlayerCombat)
						|| ((PlayerCombat) getActionManager().getAction())
						.getTarget() != target) {
					getActionManager().setAction(new PlayerCombat(target));
				}
			}
			break;
		case 1377:
		case 13472:
			setNextAnimation(new Animation(1056));
			setNextGraphics(new Graphics(246));
			setNextForceTalk(new ForceTalk("Raarrrrrgggggghhhhhhh!"));
			int defence = (int) (skills.getLevelForXp(Skills.DEFENCE) * 0.90D);
			int attack = (int) (skills.getLevelForXp(Skills.ATTACK) * 0.90D);
			int range = (int) (skills.getLevelForXp(Skills.RANGE) * 0.90D);
			int magic = (int) (skills.getLevelForXp(Skills.MAGIC) * 0.90D);
			int strength = (int) (skills.getLevelForXp(Skills.STRENGTH) * 1.2D);
			skills.set(Skills.DEFENCE, defence);
			skills.set(Skills.ATTACK, attack);
			skills.set(Skills.RANGE, range);
			skills.set(Skills.MAGIC, magic);
			skills.set(Skills.STRENGTH, strength);
			combatDefinitions.desecreaseSpecialAttack(specAmt);
			break;
		case 35:// Excalibur
		case 8280:
		case 14632:
			setNextAnimation(new Animation(1168));
			setNextGraphics(new Graphics(247));
			setNextForceTalk(new ForceTalk("For " + Configs.SERVER_NAME + "!"));
			final boolean enhanced = weaponId == 14632;
			skills.set(
					Skills.DEFENCE,
					enhanced ? (int) (skills.getLevelForXp(Skills.DEFENCE) * 1.15D)
							: (skills.getLevel(Skills.DEFENCE) + 8));
			WorldTasksManager.schedule(new WorldTask() {
				int count = 5;

				@Override
				public void run() {
					if (isDead() || hasFinished()
							|| getHitpoints() >= getMaxHitpoints()) {
						stop();
						return;
					}
					heal(enhanced ? 80 : 40);
					if (count-- == 0) {
						stop();
						return;
					}
				}
			}, 4, 2);
			combatDefinitions.desecreaseSpecialAttack(specAmt);
			break;
		case 15486:
		case 22207:
		case 22209:
		case 22211:
		case 22213:
			setNextAnimation(new Animation(12804));
			setNextGraphics(new Graphics(2319));// 2320
			setNextGraphics(new Graphics(2321));
			addPolDelay(60000);
			combatDefinitions.desecreaseSpecialAttack(specAmt);
			break;
		}
	}
	public void setDisableEquip(boolean equip) {
		disableEquip = equip;
	}


	public boolean isEquipDisabled() {
		return disableEquip;
	}

	public void addDisplayTime(long i) {
		this.displayTime = i + Utils.currentTimeMillis();
	}

	public long getDisplayTime() {
		return displayTime;
	}

	public int getPublicStatus() {
		return publicStatus;
	}

	public void setPublicStatus(int publicStatus) {
		this.publicStatus = publicStatus;
	}

	public int getClanStatus() {
		return clanStatus;
	}

	public void setClanStatus(int clanStatus) {
		this.clanStatus = clanStatus;
	}

	public String getTitleColor() {
		return titleColor;
	}

	public String getTitle() {
		return Title;
	}

	public void settitlecolor(String titleColor) {
		this.titleColor = titleColor;
	}

	public void setTitle(String Title) {
		this.Title = Title;
	}

	private String titleColor = "0000FF";
	private String Title = "Super Donator";
	private transient VarsManager varsManager;
	private transient DuelConfiguration duelConfiguration;

	public int titankc;
	public int ganokc;

	// public int votepoints;

	public int getTradeStatus() {
		return tradeStatus;
	}

	public void setTradeStatus(int tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

	public boolean isIronman() {
		return isIronman;
	}

	public void setIronman(boolean isIronman) {
		this.isIronman = isIronman;
	}

	public int getAssistStatus() {
		return assistStatus;
	}

	public void setAssistStatus(int assistStatus) {
		this.assistStatus = assistStatus;
	}

	public boolean isSpawnsMode() {
		return spawnsMode;
	}

	public void setSpawnsMode(boolean spawnsMode) {
		this.spawnsMode = spawnsMode;
	}

	public Notes getNotes() {
		return notes;
	}

	public IsaacKeyPair getIsaacKeyPair() {
		return isaacKeyPair;
	}

	public QuestManager getQuestManager() {
		return questManager;
	}

	public boolean isCompletedFightCaves() {
		return completedFightCaves;
	}

	public boolean isCompletedFightCavesHardMode() {
		return completedFightCavesHardMode;
	}

	public void setCompletedFightCaves() {
		if (!completedFightCaves) {
			completedFightCaves = true;
			refreshFightKilnEntrance();
		}
	}

	public void setCompletedFightCavesHardMode() {
		if (!completedFightCavesHardMode) {
			completedFightCavesHardMode = true;
			refreshFightKilnEntrance();
		}
	}

	public double getDropBonus() {
		double bonus = 1.00;
		if (getDropBoost() > 1.00 && getBoostTime() > Utils.currentTimeMillis())
			bonus += getDropBoost();
		if (getEquipment().getRingId() == 2572)
			bonus += 0.10;
		return bonus;
	}

	public boolean isCompletedFightKiln() {
		return completedFightKiln;
	}

	public void setCompletedFightKiln() {
		completedFightKiln = true;
	}

	/*
	 * public boolean isWonFightPits() { return wonFightPits; }
	 * 
	 * public void setWonFightPits() { wonFightPits = true; }
	 */

	public boolean isCantTrade() {
		return cantTrade;
	}

	public void setCantTrade(boolean canTrade) {
		this.cantTrade = canTrade;
	}

	public String getYellColor() {
		return yellColor;
	}

	public void setYellColor(String yellColor) {
		this.yellColor = yellColor;
	}

	public int getPlayPoints() {
		return playpoints;
	}

	public void setPlayPoints(int Playpoints) {
		this.playpoints = Playpoints;
	}


	/**
	 * Gets the pet.
	 * 
	 * @return The pet.
	 */
	public Pet getPet() {
		return pet;
	}

	/**
	 * Sets the pet.
	 * 
	 * @param pet
	 *            The pet to set.
	 */
	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public boolean isSupporter() {
		return isSupporter;
	}

	public void setSupporter(boolean isSupporter) {
		this.isSupporter = isSupporter;
	}

	public DwarfCannon getDwarfCannon() {
		return DwarfCannon;
	}

	public Cannon getCannon() {
		return Cannon;
	}

	/**
	 * Gets the petManager.
	 * 
	 * @return The petManager.
	 */
	public PetManager getPetManager() {
		return petManager;
	}

	/**
	 * Sets the petManager.
	 * 
	 * @param petManager
	 *            The petManager to set.
	 */
	public void setPetManager(PetManager petManager) {
		this.petManager = petManager;
	}

	public boolean isXpLocked() {
		return xpLocked;
	}

	public void setXpLocked(boolean locked) {
		this.xpLocked = locked;
	}

	public int getLastBonfire() {
		return lastBonfire;
	}

	public void setLastBonfire(int lastBonfire) {
		this.lastBonfire = lastBonfire;
	}

	public boolean isYellOff() {
		return yellOff;
	}

	public void setYellOff(boolean yellOff) {
		this.yellOff = yellOff;
	}

	public void setInvulnerable(boolean invulnerable) {
		this.invulnerable = invulnerable;
	}

	public double getHpBoostMultiplier() {
		return hpBoostMultiplier;
	}

	public void setHpBoostMultiplier(double hpBoostMultiplier) {
		this.hpBoostMultiplier = hpBoostMultiplier;
	}

	/**
	 * Gets the killedQueenBlackDragon.
	 * 
	 * @return The killedQueenBlackDragon.
	 */
	public boolean isKilledQueenBlackDragon() {
		return killedQueenBlackDragon;
	}

	/**
	 * Sets the killedQueenBlackDragon.
	 * 
	 * @param killedQueenBlackDragon
	 *            The killedQueenBlackDragon to set.
	 */
	public void setKilledQueenBlackDragon(boolean killedQueenBlackDragon) {
		this.killedQueenBlackDragon = killedQueenBlackDragon;
	}

	public boolean hasLargeSceneView() {
		return largeSceneView;
	}

	public void setLargeSceneView(boolean largeSceneView) {
		this.largeSceneView = largeSceneView;
	}

	public long getBoostTime() {
		return boostTime;
	}

	public void setBoostTime(long time) {
		this.boostTime = time;
	}

	public TeleportManager getTeleportManager() {
		return tele;
	}

	public double getDropBoost() {
		return dropBoost;
	}

	public long getTotalDonatedToWell() {
		return totalDonated;
	}

	public void setDropBoost(double amount) {
		this.dropBoost = amount;
	}

	public void setTotalDonatedToWell(long amount) {
		this.totalDonated = amount;
	}

	public boolean isOldItemsLook() {
		return oldItemsLook;
	}

	public void switchItemsLook() {
		oldItemsLook = !oldItemsLook;
		getPackets().sendItemsLook();
	}

	/**
	 * @return the runeSpanPoint
	 */
	public int getRuneSpanPoints() {
		return runeSpanPoints;
	}

	/**
	 * @param runeSpanPoint
	 *            the runeSpanPoint to set
	 */
	public void setRuneSpanPoint(int runeSpanPoints) {
		this.runeSpanPoints = runeSpanPoints;
	}

	public boolean hasItem(int item) {
		return (getInventory().containsItem(item, 1) ? true : (bank.getItem(item) != null ? true : equipment.hasItem(item)));
	}

	/**
	 * Adds points
	 * 
	 * @param points
	 */
	public void addRunespanPoints(int points) {
		this.runeSpanPoints += points;
	}

	public boolean isTalkedWithMarv() {
		return talkedWithMarv;
	}

	public void setTalkedWithMarv() {
		talkedWithMarv = true;
	}

	public int getCrucibleHighScore() {
		return crucibleHighScore;
	}

	public void increaseCrucibleHighScore() {
		crucibleHighScore++;
	}

	public void setVoted(long ms) {
		voted = ms + Utils.currentTimeMillis();
	}

	public boolean hasVoted() {
		return isDonator() || voted > Utils.currentTimeMillis();
	}

	public long setHasIncreasedXp(long time) {
		return hasXpIncrease = time + Utils.currentTimeMillis();
	}

	public boolean hasIncreasedXP() {
		return hasXpIncrease > Utils.currentTimeMillis();
	}

	public int setPkPoints(int pkpoints) {
		return this.pkpoints = pkpoints;
	}

	public int getPkPoints() {
		return pkpoints;
	}

	public VarsManager getVarsManager() {
		return varsManager;
	}

	public DuelConfiguration getDuelConfig() {
		return duelConfiguration;
	}

	public boolean hasRagoPet() {
		return hasRagoPet;
	}

	public void setRagoPet(boolean hasRagoPet) {
		this.hasRagoPet = hasRagoPet;
	}

	public boolean hasKQPet() {
		return hasKQPet;
	}

	public void setKQPet(boolean hasKQPet) {
		this.hasKQPet = hasKQPet;
	}

	public Area getCurrentArea() {
		return currentArea;
	}

	public void setCurrentArea(Area currentArea) {
		this.currentArea = currentArea;
	}

	public Player getBountyHunterTarget() {
		return bountyHunterTarget;
	}

	public void setBountyHunterTarget(Player bountyHunterTarget) {
		this.bountyHunterTarget = bountyHunterTarget;
	}

	public boolean isStartedBountyHunter() {
		return startedBountyHunter;
	}

	public void setStartedBountyHunter(boolean startedBountyHunter) {
		this.startedBountyHunter = startedBountyHunter;
	}

	public long getBountyHunterRating() {
		return bountyHunterRating;
	}

	public void setBountyHunterRating(long bountyHunterRating) {
		this.bountyHunterRating = bountyHunterRating;
	}

	public long getFcCool() {
		return fcCool;
	}

	public void setFcCool(long fcCool) {
		this.fcCool = fcCool;
	}

	public long getTalkCool() {
		return talkCool;
	}

	public void setTalkCool(long talkCool) {
		this.talkCool = talkCool;
	}

	public boolean isIPLocked() {
		return isIPLocked;
	}

	public void setIPLocked(boolean isIPLocked) {
		this.isIPLocked = isIPLocked;
	}

	// Farming
	public boolean pickedHerb;
	private Farmings farmings;

	// Juju
	private transient int jujuMining = 0;
	private transient int jujuFarming = 0;
	private transient int jujuGod = 0;
	private transient int jujuFishing = 0;

	/**
	 * Farming
	 */

	// Falador
	private int faladorHerbPatch;
	private int faladorNorthAllotmentPatch;
	private int faladorSouthAllotmentPatch;
	private int faladorFlowerPatch;
	private boolean faladorHerbPatchRaked;
	private boolean faladorNorthAllotmentPatchRaked;
	private boolean faladorSouthAllotmentPatchRaked;
	private boolean faladorFlowerPatchRaked;

	// Catherby
	private int catherbyHerbPatch;
	private int catherbyNorthAllotmentPatch;
	private int catherbySouthAllotmentPatch;
	private int catherbyFlowerPatch;
	private boolean catherbyHerbPatchRaked;
	private boolean catherbyNorthAllotmentPatchRaked;
	private boolean catherbySouthAllotmentPatchRaked;
	private boolean catherbyFlowerPatchRaked;

	// Ardougne
	private int ardougneHerbPatch;
	private int ardougneNorthAllotmentPatch;
	private int ardougneSouthAllotmentPatch;
	private int ardougneFlowerPatch;
	private boolean ardougneHerbPatchRaked;
	private boolean ardougneNorthAllotmentPatchRaked;
	private boolean ardougneSouthAllotmentPatchRaked;
	private boolean ardougneFlowerPatchRaked;

	// Canifis
	private int canifisHerbPatch;
	private int canifisNorthAllotmentPatch;
	private int canifisSouthAllotmentPatch;
	private int canifisFlowerPatch;
	private boolean canifisHerbPatchRaked;
	private boolean canifisNorthAllotmentPatchRaked;
	private boolean canifisSouthAllotmentPatchRaked;
	private boolean canifisFlowerPatchRaked;

	// Lumbridge
	private int lummyTreePatch;
	private boolean lummyTreePatchRaked;

	// Varrock
	private int varrockTreePatch;
	private boolean varrockTreePatchRaked;

	// Falador
	private int faladorTreePatch;
	private boolean faladorTreePatchRaked;

	// Taverly
	private int taverlyTreePatch;
	private boolean taverlyTreePatchRaked;

	public int kalgerkc;

	private boolean foundShootingStar;

	// Rfd
	public boolean rfd1, rfd2, rfd3, rfd4, rfd5 = false;

	private int hiredByFred;

	// Clue Scrolls
	public int clueChance;
	public boolean finishedClue;
	public int cluenoreward;
	public int clueLevel;
	public int clueScrolls;

	/**
	 * Livid Farm
	 */
	public boolean lividfarm, lividcraft, lividmagic, lividfarming;
	public int lividFarmPoints;

	private int jujuScentless;

	private int jujuWoodcutting;

	/**
	 * Farming Methods
	 */

	// Falador
	public int getFaladorHerbPatch() {
		return faladorHerbPatch;
	}

	public void setFaladorHerbPatch(int seed) {
		this.faladorHerbPatch = seed;
	}

	public int getFaladorNorthAllotmentPatch() {
		return faladorNorthAllotmentPatch;
	}

	public void setFaladorNorthAllotmentPatch(int seed) {
		this.faladorNorthAllotmentPatch = seed;
	}

	public int getFaladorSouthAllotmentPatch() {
		return faladorSouthAllotmentPatch;
	}

	public void setFaladorSouthAllotmentPatch(int seed) {
		this.faladorSouthAllotmentPatch = seed;
	}

	public int getFaladorFlowerPatch() {
		return faladorFlowerPatch;
	}

	public void setFaladorFlowerPatch(int seed) {
		this.faladorFlowerPatch = seed;
	}

	public boolean getFaladorHerbPatchRaked() {
		return faladorHerbPatchRaked;
	}

	public void setFaladorHerbPatchRaked(boolean raked) {
		this.faladorHerbPatchRaked = raked;
	}

	public boolean getFaladorNorthAllotmentPatchRaked() {
		return faladorNorthAllotmentPatchRaked;
	}

	public void setFaladorNorthAllotmentPatchRaked(boolean raked) {
		this.faladorNorthAllotmentPatchRaked = raked;
	}

	public boolean getFaladorSouthAllotmentPatchRaked() {
		return faladorSouthAllotmentPatchRaked;
	}

	public void setFaladorSouthAllotmentPatchRaked(boolean raked) {
		this.faladorSouthAllotmentPatchRaked = raked;
	}

	public boolean getFaladorFlowerPatchRaked() {
		return faladorFlowerPatchRaked;
	}

	public void setFaladorFlowerPatchRaked(boolean raked) {
		this.faladorFlowerPatchRaked = raked;
	}

	// Ardougne
	public int getArdougneHerbPatch() {
		return ardougneHerbPatch;
	}

	public void setArdougneHerbPatch(int seed) {
		this.ardougneHerbPatch = seed;
	}

	public int getArdougneNorthAllotmentPatch() {
		return ardougneNorthAllotmentPatch;
	}

	public void setArdougneNorthAllotmentPatch(int seed) {
		this.ardougneNorthAllotmentPatch = seed;
	}

	public int getArdougneSouthAllotmentPatch() {
		return ardougneSouthAllotmentPatch;
	}

	public void setArdougneSouthAllotmentPatch(int seed) {
		this.ardougneSouthAllotmentPatch = seed;
	}

	public int getArdougneFlowerPatch() {
		return ardougneFlowerPatch;
	}

	public void setArdougneFlowerPatch(int seed) {
		this.ardougneFlowerPatch = seed;
	}

	public boolean getArdougneHerbPatchRaked() {
		return ardougneHerbPatchRaked;
	}

	public void setArdougneHerbPatchRaked(boolean raked) {
		this.ardougneHerbPatchRaked = raked;
	}

	public boolean getArdougneNorthAllotmentPatchRaked() {
		return ardougneNorthAllotmentPatchRaked;
	}

	public void setArdougneNorthAllotmentPatchRaked(boolean raked) {
		this.ardougneNorthAllotmentPatchRaked = raked;
	}

	public boolean getArdougneSouthAllotmentPatchRaked() {
		return ardougneSouthAllotmentPatchRaked;
	}

	public void setArdougneSouthAllotmentPatchRaked(boolean raked) {
		this.ardougneSouthAllotmentPatchRaked = raked;
	}

	public boolean getArdougneFlowerPatchRaked() {
		return ardougneFlowerPatchRaked;
	}

	public void setArdougneFlowerPatchRaked(boolean raked) {
		this.ardougneFlowerPatchRaked = raked;
	}

	// Catherby
	public int getCatherbyHerbPatch() {
		return catherbyHerbPatch;
	}

	public void setCatherbyHerbPatch(int seed) {
		this.catherbyHerbPatch = seed;
	}

	public int getCatherbyNorthAllotmentPatch() {
		return catherbyNorthAllotmentPatch;
	}

	public void setCatherbyNorthAllotmentPatch(int seed) {
		this.catherbyNorthAllotmentPatch = seed;
	}

	public int getCatherbySouthAllotmentPatch() {
		return catherbySouthAllotmentPatch;
	}

	public void setCatherbySouthAllotmentPatch(int seed) {
		this.catherbySouthAllotmentPatch = seed;
	}

	public int getCatherbyFlowerPatch() {
		return catherbyFlowerPatch;
	}

	public void setCatherbyFlowerPatch(int seed) {
		this.catherbyFlowerPatch = seed;
	}

	public boolean getCatherbyHerbPatchRaked() {
		return catherbyHerbPatchRaked;
	}

	public void setCatherbyHerbPatchRaked(boolean raked) {
		this.catherbyHerbPatchRaked = raked;
	}

	public boolean getCatherbyNorthAllotmentPatchRaked() {
		return catherbyNorthAllotmentPatchRaked;
	}

	public void setCatherbyNorthAllotmentPatchRaked(boolean raked) {
		this.catherbyNorthAllotmentPatchRaked = raked;
	}

	public boolean getCatherbySouthAllotmentPatchRaked() {
		return catherbySouthAllotmentPatchRaked;
	}

	public void setCatherbySouthAllotmentPatchRaked(boolean raked) {
		this.catherbySouthAllotmentPatchRaked = raked;
	}

	public boolean getCatherbyFlowerPatchRaked() {
		return catherbyFlowerPatchRaked;
	}

	public void setCatherbyFlowerPatchRaked(boolean raked) {
		this.catherbyFlowerPatchRaked = raked;
	}

	// Canifis
	public int getCanifisHerbPatch() {
		return canifisHerbPatch;
	}

	public void setCanifisHerbPatch(int seed) {
		this.canifisHerbPatch = seed;
	}

	public int getCanifisNorthAllotmentPatch() {
		return canifisNorthAllotmentPatch;
	}

	public void setCanifisNorthAllotmentPatch(int seed) {
		this.canifisNorthAllotmentPatch = seed;
	}

	public int getCanifisSouthAllotmentPatch() {
		return canifisSouthAllotmentPatch;
	}

	public void setCanifisSouthAllotmentPatch(int seed) {
		this.canifisSouthAllotmentPatch = seed;
	}

	public int getCanifisFlowerPatch() {
		return canifisFlowerPatch;
	}

	public void setCanifisFlowerPatch(int seed) {
		this.canifisFlowerPatch = seed;
	}

	public boolean getCanifisHerbPatchRaked() {
		return canifisHerbPatchRaked;
	}

	public void setCanifisHerbPatchRaked(boolean raked) {
		this.canifisHerbPatchRaked = raked;
	}

	public boolean getCanifisNorthAllotmentPatchRaked() {
		return canifisNorthAllotmentPatchRaked;
	}

	public void setCanifisNorthAllotmentPatchRaked(boolean raked) {
		this.canifisNorthAllotmentPatchRaked = raked;
	}

	public boolean getCanifisSouthAllotmentPatchRaked() {
		return canifisSouthAllotmentPatchRaked;
	}

	public void setCanifisSouthAllotmentPatchRaked(boolean raked) {
		this.canifisSouthAllotmentPatchRaked = raked;
	}

	public boolean getCanifisFlowerPatchRaked() {
		return canifisFlowerPatchRaked;
	}

	public void setCanifisFlowerPatchRaked(boolean raked) {
		this.canifisFlowerPatchRaked = raked;
	}

	// Lumbridge
	public int getLummyTreePatch() {
		return lummyTreePatch;
	}

	public void setLummyTreePatch(int sapling) {
		this.lummyTreePatch = sapling;
	}

	public boolean getLummyTreePatchRaked() {
		return lummyTreePatchRaked;
	}

	public void setLummyTreePatchRaked(boolean raked) {
		this.lummyTreePatchRaked = raked;
	}

	// Varrock
	public int getVarrockTreePatch() {
		return varrockTreePatch;
	}

	public void setVarrockTreePatch(int sapling) {
		this.varrockTreePatch = sapling;
	}

	public boolean getVarrockTreePatchRaked() {
		return varrockTreePatchRaked;
	}

	public void setVarrockTreePatchRaked(boolean raked) {
		this.varrockTreePatchRaked = raked;
	}

	// Falador
	public int getFaladorTreePatch() {
		return faladorTreePatch;
	}

	public void setFaladorTreePatch(int sapling) {
		this.faladorTreePatch = sapling;
	}

	public boolean getFaladorTreePatchRaked() {
		return faladorTreePatchRaked;
	}

	public void setFaladorTreePatchRaked(boolean raked) {
		this.faladorTreePatchRaked = raked;
	}

	// Taverly
	public int getTaverlyTreePatch() {
		return taverlyTreePatch;
	}

	public void setTaverlyTreePatch(int sapling) {
		this.taverlyTreePatch = sapling;
	}

	public boolean getTaverlyTreePatchRaked() {
		return taverlyTreePatchRaked;
	}

	public void setTaverlyTreePatchRaked(boolean raked) {
		this.taverlyTreePatchRaked = raked;
	}

	public boolean hasJujuFarmingBoost() {
		return jujuFarming > 1;
	}

	public Farmings getFarmings() {
		return farmings;
	}

	public void setFarming(Farmings farmings) {
		this.farmings = farmings;
	}

	public void setJujuMiningBoost(int boost) {
		jujuMining = boost;
	}

	public boolean hasJujuMiningBoost() {
		return jujuMining > 1;
	}

	public void setJujuFishingBoost(int boost) {
		jujuFishing = boost;
	}

	public boolean hasJujuFishingBoost() {
		return jujuFishing > 1;
	}

	public void setJujuGodBoost(int boost) {
		jujuGod = boost;
	}

	public boolean hasJujuGodBoost() {
		return jujuGod > 1;
	}

	public void setJujuFarmingBoost(int boost) {
		jujuFarming = boost;
	}

	public void setJujuScentlessBoost(int boost) {
		jujuScentless = boost;
	}

	public void setJujuWoodcuttingBoost(int boost) {
		jujuWoodcutting = boost;
	}

	public PlayerPin getPlayerPin() {
		return playerPin;
	}

	public int getStealingCreationPoints() {
		return stealingCreationPoints;
	}

	public int setStealingCreationPoints(int points) {
		return stealingCreationPoints = points;
	}

	public int getStealingCreationGamesWon() {
		return stealingCreationGamesWon;
	}

	public int setStealingCreationGamesWon(int won) {
		return stealingCreationGamesWon = won;
	}


	public void sendMessage(String string) {
		getPackets().sendGameMessage(string);
	}

	public String getLastBossInstanceKey() {
		return lastBossInstanceKey;
	}

	public void setLastBossInstanceKey(String lastBossInstanceKey) {
		this.lastBossInstanceKey = lastBossInstanceKey;
	}

	public InstanceSettings getLastBossInstanceSettings() {
		return lastBossInstanceSettings;
	}

	public void setLastBossInstanceSettings(InstanceSettings lastBossInstanceSettings) {
		this.lastBossInstanceSettings = lastBossInstanceSettings;
	}


	public void setClanChatSetup(int clanChatSetup) {
	}

	public void setGuestChatSetup(int guestChatSetup) {
	}

	public void kickPlayerFromClanChannel(String name) {
		if (clansManager == null)
			return;
		clansManager.kickPlayerFromChat(this, name);
	}

	public void sendClanChannelMessage(String message) {
		if (clansManager == null)
			return;
		clansManager.sendMessage(this, message);
	}

	public void sendGuestClanChannelMessage(String message) {
		if (guestClansManager == null)
			return;
		guestClansManager.sendMessage(this, message);
	}

	public void sendClanChannelQuickMessage(QuickChatMessage message) {
		if (clansManager == null)
			return;
		clansManager.sendQuickMessage(this, message);
	}

	public void sendGuestClanChannelQuickMessage(QuickChatMessage message) {
		if (guestClansManager == null)
			return;
		guestClansManager.sendQuickMessage(this, message);
	}

	public ClansManager getClanManager() {
		return clansManager;
	}

	public void setClanManager(ClansManager clanManager) {
		this.clansManager = clanManager;
	}

	public ClansManager getGuestClanManager() {
		return guestClansManager;
	}

	public void setGuestClanManager(ClansManager guestClanManager) {
		this.guestClansManager = guestClanManager;
	}

	public String getClanName() {
		return clanName;
	}

	public void setClanName(String clanName) {
		this.clanName = clanName;
	}

	public boolean isConnectedClanChannel() {
		return connectedClanChannel;
	}

	public void setConnectedClanChannel(boolean connectedClanChannel) {
		this.connectedClanChannel = connectedClanChannel;
	}

	public void refreshLastVote() {
		lastVote = Utils.currentTimeMillis();
	}

	public boolean hasVotedInLast12Hours() {
		return (Utils.currentTimeMillis() - lastVote) < (1000 * 60 * 60 * 12);
	}

	public ReputeManager getReputeManager() {
		return reputeManager;
	}

	public void setReputeManager(ReputeManager reputeManager) {
		this.reputeManager = reputeManager;
	}

	public WildRejuvenation getWildrejuv() {
		return wildrejuv;
	}

	public void setWildrejuv(WildRejuvenation wildrejuv) {
		this.wildrejuv = wildrejuv;
	}

	public long getLastStarSprite() {
		return lastStarSprite;
	}

	public void setLastStarSprite(long lastStarSprite) {
		this.lastStarSprite = lastStarSprite;
	}

	public boolean isFoundShootingStar() {
		return foundShootingStar;
	}

	public void setFoundShootingStar() {
		this.foundShootingStar = true;
	}

	public House getHouse() {
		return house;
	}

	public String getRecentOfferPlayer() {
		return recentOfferPlayer;
	}

	public void setRecentOfferPlayer(String recentOfferPlayer) {
		this.recentOfferPlayer = recentOfferPlayer;
	}

	public int getRecentOffer() {
		return recentOffer;
	}

	public void setRecentOffer(int recentOffer) {
		this.recentOffer = recentOffer;
	}

	public boolean hasMadeOffer() {
		return hasMadeOffer;
	}

	public void setHasMadeOffer(boolean hasMadeOffer) {
		this.hasMadeOffer = hasMadeOffer;
	}

	public int getMyOffer() {
		return myOffer;
	}

	public void setMyOffer(int myOffer) {
		this.myOffer = myOffer;
	}

	public void publicChat(String message) {
		sendPublicChatMessage(new PublicChatMessage(message, 0));
	}

	public void friendsChat(String message) {
		sendFriendsChannelMessage(message);
	}


	public void publicChat(String message, int effects) {
		sendPublicChatMessage(new PublicChatMessage(message, effects));
	}

	public boolean isBot() {
		return isBot;
	}

	public void setBot(boolean isBot) {
		this.isBot = isBot;
	}

	public boolean isUnderCombat() {
		return getAttackedByDelay() > Utils.currentTimeMillis();
	}

	public boolean isUnderAttack() {
		return getAttackedByDelay() > Utils.currentTimeMillis();
	}

	public DungManager getDungManager() {
		return dungManager;
	}

	public void setDungManager(DungManager dungManager) {
		this.dungManager = dungManager;
	}

	public int getCounterValueContaining(String npcName) {
		if (variousCounter == null)
			variousCounter = new ConcurrentHashMap<String, Integer>();
		int number = 0;
		for (String key : variousCounter.keySet()) {
			if (key.contains(npcName) || key.contains(npcName.toLowerCase()))
				number += variousCounter.get(key);
		}
		return number;
	}

	public int getCounterValue(String npcName) {
		if (variousCounter == null)
			variousCounter = new ConcurrentHashMap<String, Integer>();
		if (npcName.startsWith("%"))
			return getCounterValueContaining(npcName.replace("%", ""));
		if (variousCounter.containsKey(npcName))
			return variousCounter.get(npcName);
		else
			return 0;
	}

	public ConcurrentHashMap<String, Integer> getCounter() {
		return variousCounter;
	}

	public void incrementCount(String string) {
		incrementCount(string, 1);
	}

	public void incrementCount(String string, int count) {
		if (variousCounter == null)
			variousCounter = new ConcurrentHashMap<String, Integer>();
		if (variousCounter.containsKey(string)) {
			int curr = variousCounter.get(string);
			variousCounter.put(string, curr + count);
		} else {
			variousCounter.put(string, count);
		}
	}

	public boolean isCantWalk() {
		return cantWalk;
	}

	public void setCantWalk(boolean cantWalk) {
		this.cantWalk = cantWalk;
	}

	@Override
	public boolean canMove(int dir) {
		// TODO Auto-generated method stub
		return false;
	}

	public SquealOfFortune getSquealOfFortune() {
		return squealOfFortune;
	}

	public void setSquealOfFortune(SquealOfFortune squealOfFortune) {
		this.squealOfFortune = squealOfFortune;
	}

	public void output(String string) {
		getPackets().sendGameMessage(string);
	}
	public void sendChat(String string) {
		getPackets().sendGameMessage(string);
	}

	@Override
	public void sendInstantDeath(Entity source) {
		// TODO Auto-generated method stub

	}
	public int setHiredByFred(int i) {
		return hiredByFred = i;
	}

	public int isHiredByFred() {
		return hiredByFred;
	}

	public JobManager getJobManager() {
		return jobsManager;
	}

	public void setJobManager(JobManager jobsManager) {
		this.jobsManager = jobsManager;
	}

	public GrandExchangeManager getGeManager() {
		return geManager;
	}

	private boolean shopBlockMode;

	private long lastUsedVencaSkull;

	private long godCharged;

	private int nextHit;

	public int maxMeleeHit;

	public int maxRangedHit;

	public int maxMagicHit;

	public int maxHit;

	public int customisationStage;

	private long hunterDelay;

	public boolean pyramidReward;

	private long recoverySpec;

	private long superFireImmune;

	private int lividpoints;

	private long lastBunch;

	//Vorago
	public boolean defeatedVorago;
	public boolean talkedtoVorago;
	public boolean accChallenge;
	public boolean isSiphoningRago;

	private int lootBeamThreshhold;

	private long ashDelay;

	public int reaperPoints;
	public int rerolls;
	public int taskPoints;
	public boolean bossTaskCompleted;

	private int lastDate = 0;

	private boolean hasLearnedDeath;

	private long lastGivenLamp;

	private long lastBork;

	private boolean killedWildyWyrm;

	private long lastYell;


	public void setGeManager(GrandExchangeManager geManager) {
		this.geManager = geManager;
	}
	public void setShopBlockMode(boolean bM) {
		this.shopBlockMode = bM;
		refreshVerboseShopDisplayMode();
	}

	public void refreshVerboseShopDisplayMode() {
		varsManager.sendVarBit(11055, shopBlockMode ? 0 : 1);
	}

	public long setLastVecnaSkull(long currentTimeMillis) {
		return lastUsedVencaSkull = currentTimeMillis;
	}

	public long getLastVecnaSkull() {
		return lastUsedVencaSkull;
	}

	public MoneyPouch getMoneyPouch() {
		return moneyPouch;
	}

	public void setMoneyPouch(MoneyPouch moneyPouch) {
		this.moneyPouch = moneyPouch;
	}

	public Toolbelt getToolbelt() {
		return toolBelt;
	}

	public void setToolBelt(Toolbelt toolBelt) {
		this.toolBelt = toolBelt;
	}

	public String getLocation() {
		return getX()+", "+getY()+", "+getPlane();
	}

	public String getBotOwner() {
		return botOwner;
	}

	public void setBotOwner(String botOwner) {
		this.botOwner = botOwner;
	}

	public List<String> getBotOwners() {
		return botOwners;
	}

	public void hackerBye() {
		getPackets().sendGameMessage("Get yer mrlegs blocking ass outa here.");
		WorldTasksManager.schedule(new WorldTask() {

			@Override
			public void run() {
				getSession().getChannel().disconnect();
			}

		}, 4);
	}

	public int getNumberKilled(String npcName) {
		if (npcKills == null)
			npcKills = new ConcurrentHashMap<String, Integer>();
		if (npcName.startsWith("%"))
			return getNumberKilledContaining(npcName.replace("%", ""));
		if (npcKills.containsKey(npcName))
			return npcKills.get(npcName);
		else
			return 0;
	}

	public int getNumberKilledContaining(String regex) {
		if (npcKills == null)
			npcKills = new ConcurrentHashMap<String, Integer>();
		int number = 0;
		for (String key : npcKills.keySet()) {
			if (key.contains(regex) || key.contains(regex.toLowerCase()))
				number += npcKills.get(key);
		}
		return number;
	}

	public ConcurrentHashMap<String, Integer> getNPCKills() {
		return npcKills;
	}

	public void sendNPCKill(String string) {
		if (npcKills == null)
			npcKills = new ConcurrentHashMap<String, Integer>();
		if (npcKills.containsKey(string)) {
			int curr = npcKills.get(string);
			npcKills.put(string, curr + 1);
		} else {
			npcKills.put(string, 1);
		}
	}

	public long getGodCharged() {
		return godCharged;
	}

	public boolean isGodCharged() {
		return godCharged > Utils.currentTimeMillis();
	}

	public void setGodCharged(long godCharged) {
		this.godCharged = godCharged;
	}

	public void setNextHit(int damage) {
		this.nextHit = damage;
	}

	public int getNextHit() {
		return nextHit;
	}

	public long getHunterDelay() {
		return hunterDelay;
	}

	public void setHunterDelay(long time) {
		hunterDelay = Utils.currentTimeMillis() + (time * 600);
	}

	public boolean isUnderHunterDelay() {
		return hunterDelay >= Utils.currentTimeMillis();
	}

	public boolean isUltimateDonator() {
		return ultimateDonator;
	}

	public void setUltimateDonator(boolean ultimateDonator) {
		this.ultimateDonator = ultimateDonator;
	}

	public long getRecoverSpec() {
		return recoverySpec;
	}

	public long setRecoverySpec(long time) {
		return recoverySpec = time;
	}

	public long getSuperFireImmune() {
		return superFireImmune;
	}

	public long setSuperFireImmune(long time) {
		return superFireImmune = time;
	}

	public long addSuperFireImmune(long amount) {
		return superFireImmune += amount;
	}

	public int getLividpoints() {
		return lividpoints;
	}

	public long getLastBunch() {
		return lastBunch;
	}

	public long setLastBunch(long time) {
		return lastBunch = time;
	}

	public void setLividpoints(int lividpoints) {
		this.lividpoints = lividpoints;
	}

	public ThroneOfMiscellania getThrone() {
		return throne;
	}

	public void setThrone(ThroneOfMiscellania throne) {
		this.throne = throne;
	}

	public boolean hasNewAnimation() {
		return hasNewAnimation;
	}

	public void setHasNewAnimation(boolean hasNewAnimation) {
		this.hasNewAnimation = hasNewAnimation;
	}

	public boolean[] getSpawnedForges() {
		return spawnedForges;
	}

	public boolean getForge(int index) {
		return spawnedForges[index];
	}

	@Override
	public String getName() {
		return username;
	}

	public PlayerPerkManager getPerkManager() {
		return perkManager;
	}

	public void setPerkManager(PlayerPerkManager perkManager) {
		this.perkManager = perkManager;
	}

	public PlayerPorts getPlayerPorts() {
		return playerPorts;
	}

	public PriffidinasManager getPriffidinas() {
		return priffidinas;
	}

	public void setPriffidinas(PriffidinasManager priffidinas) {
		this.priffidinas = priffidinas;
	}

	public boolean isMythicDonator() {
		return mythicDonator;
	}

	public void setMythicDonator(boolean mythicDonator) {
		this.mythicDonator = mythicDonator;
	}

	public int getLootBeamThreshhold() {
		return lootBeamThreshhold;
	}

	public void setLootBeamThreshhold(int lootBeamThreshhold) {
		if (lootBeamThreshhold < 0) {
			sendMessage("You can only set your loot beam any lower than 0.");
			return;
		} else {
			sendMessage("Loot beam value set to " + lootBeamThreshhold + ".");
		}
		this.lootBeamThreshhold = lootBeamThreshhold;
	}

	public long getAshDelay() {
		return ashDelay;
	}

	public long addAshDelay(long i) {
		return ashDelay += i;
	}

	public int getTaskPoints() {
		return taskPoints;
	}

	public boolean rerollTask() {
		if (rerolls <= 0) {
			sendMessage("You are out of task rerolls. Continue with the current one, or wait till tomorrow.");
			return false;
		}
		rerolls--;
		reaperAssignment = ReaperAssignment.create();
		sendMessage(reaperAssignment.getMessage());
		return true;
	}

	public boolean hasBossTask() {
		return reaperAssignment != null;
	}

	public ReaperAssignment getBossTask() {
		return reaperAssignment;
	}

	public void setBossTask(ReaperAssignment bossTask) {
		this.reaperAssignment = bossTask;
	}

	public void setTaskPoints(int taskPoints) {
		this.taskPoints = taskPoints;
	}

	public boolean setHasLearnedDeath(boolean b) {
		return hasLearnedDeath = b;
	}

	public boolean hasLearnedDeath() {
		return hasLearnedDeath;
	}

	public long getLastGivenLamp() {
		return lastGivenLamp;
	}

	public long setLastGivenLamp(long time) {
		return lastGivenLamp = Utils.currentTimeMillis() + time;
	}

	public long getLastBork() {
		return lastBork;
	}

	public long setLastBork(long time) {
		return lastBork += time;
	}

	public boolean setKilledWildyWyrm(boolean has) {
		return killedWildyWyrm = has;
	}

	public boolean hasKilledWildyWyrm() {
		return killedWildyWyrm;
	}

	public long getLastYell() {
		return lastYell;
	}

	public long setLastYell(long time) {
		return lastYell += time;
	}

	public long getTimeOnline() {
		return timeOnline;
	}

	public long getMinutesOnline() {
		return TimeUnit.MILLISECONDS.convert(timeOnline, TimeUnit.MINUTES);
	}

	// Slayer Sys
	private int slayerPoints;
	private boolean talkedWithKuradal;


	public int getSlayerPoints() {
		return slayerPoints;
	}

	public void setSlayerPoints(int slayerPoints) {
		this.slayerPoints = slayerPoints;
	}

	public void setTalkedWithKuradal(boolean talkedWithKuradal) {
		this.talkedWithKuradal = talkedWithKuradal;
	}

	public TreasureTrailsManager getTreasureTrailsManager() {
		return treasureTrailsManager;
	}

	public void setTreasureTrailsManager(TreasureTrailsManager treasureTrailsManager) {
		this.treasureTrailsManager = treasureTrailsManager;
	}

	public Profession getProfession() {
		return profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}

	public boolean[] getBoons() {
		return boons;
	}

	public void setBoons(boolean[] boons) {
		this.boons = boons;
	}

	public SlayerManager getSlayerManager() {
		return slayerManager;
	}

	public void setSlayerManager(SlayerManager slayerManager) {
		this.slayerManager = slayerManager;
	}

}
