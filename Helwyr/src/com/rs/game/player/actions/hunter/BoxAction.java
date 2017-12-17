package com.rs.game.player.actions.hunter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.rs.game.Animation;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.item.Item;
import com.rs.game.player.OwnedObjectManager;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Action;

public class BoxAction extends Action {

	public enum HunterNPC {

		CARNIVOROUS_CHINCHOMPA(5080, new Item[] { new Item(10034, 1) }, 63,
				265, HunterEquipment.BOX, 28558, 19192, new Animation(5184),
				new Animation(5185)),

		CHINCHOMPA(5079, new Item[] { new Item(10033, 1) }, 53, 198,
				HunterEquipment.BOX, 28913, 19192, new Animation(5184),
				new Animation(5185)),
		
		FERRT(5081, new Item[] { new Item(10092) }, 27, 115,
				HunterEquipment.BOX, 19189, 19192, new Animation(5191),
				new Animation(5192)),

		SWAMP_LIZARD(5117, new Item[] { new Item(10149) }, 29, 152,
				HunterEquipment.NET_TRAP, 19675, 19677, new Animation(-1),
				new Animation(-1)),

		ORANGE_SALAMANDER(5114, new Item[] { new Item(10146) }, 47, 224,
				HunterEquipment.NET_TRAP_ORANGE, 19654, 19656,
				new Animation(-1), new Animation(-1)),

		RED_SALAMANDER(5115, new Item[] { new Item(10147) }, 59, 272,
				HunterEquipment.NET_TRAP_RED, 19659, 19661, new Animation(-1),
				new Animation(-1)),

		BLACK_SALAMANDER(5116, new Item[] { new Item(10148) }, 67, 304,
				HunterEquipment.NET_TRAP_BLACK, 19667, 19669,
				new Animation(-1), new Animation(-1)),

		GECKO(6916, new Item[] { new Item(12184) }, 27, 100,
				HunterEquipment.BOX, 19190, 19192, new Animation(8362),
				new Animation(8361)),

		RACCOON(7272, new Item[] { new Item(12487) }, 27, 100,
				HunterEquipment.BOX, 19191, 19192, new Animation(7726),
				new Animation(7727)),

		MONKEY(6942, new Item[] { new Item(2201) }, 27, 100,
				HunterEquipment.BOX, 28557, 19192, new Animation(8343),
				new Animation(8345)),
		
		GRENWALL(7010, new Item[] { new Item(12539, 5) }, 77, 
				1000, HunterEquipment.BOX, 28567, 19192, new Animation(5191),
				new Animation(5192)),

		CRIMSON_SWIFT(5073, new Item[] { new Item(10088), new Item(526, 1),
				new Item(9978, 1) }, 1, 34, HunterEquipment.BRID_SNARE, 19180,
				19174, new Animation(6775), new Animation(6774)),

		GOLDEN_WARBLER(5075, new Item[] { new Item(1583), new Item(526, 1),
				new Item(9978, 1) }, 5, 48, HunterEquipment.BRID_SNARE, 19184,
				19174, new Animation(6775), new Animation(6774)),

		COPPER_LONGTAIL(5076, new Item[] { new Item(10091), new Item(526, 1),
				new Item(9978, 1) }, 9, 61, HunterEquipment.BRID_SNARE, 19186,
				19174, new Animation(6775), new Animation(6774)),

		CERULEAN_TWITCH(5074, new Item[] { new Item(10089), new Item(526, 1),
				new Item(9978, 1) }, 11, 64.67, HunterEquipment.BRID_SNARE,
				19182, 19174, new Animation(6775), new Animation(6774)),

		TROPICAL_WAGTAIL(5072, new Item[] { new Item(10087), new Item(526, 1),
				new Item(9978, 1) }, 19, 95.2, HunterEquipment.BRID_SNARE,
				19178, 19174, new Animation(6775), new Animation(6774)),

		WIMPY_BIRD(7031, new Item[] { new Item(11525, 1), new Item(526, 1),
				new Item(9978, 1) }, 39, 167, HunterEquipment.BRID_SNARE,
				28930, 19174, new Animation(6775), new Animation(6774)),

		SPINED_LARUPIA(5104,
				new Item[] { new Item(532, 1), new Item(10093, 1) }, 31, 180,
				HunterEquipment.LARUPIA_PITFALL, 19232, -1, new Animation(-1),
				new Animation(5231)),// might
		
		SPIDER(15602, new Item[] { new Item(29931, 5) }, 35, 300,
				HunterEquipment.BOX, 28567, 19192, new Animation(5191),
				new Animation(5192)),

		GECKO1(7285, new Item[] { new Item(12738) }, 27, 100,
				HunterEquipment.BOX, 19190, 19192, new Animation(8362),
				new Animation(8361)),

		GECKO2(7286, new Item[] { new Item(12739) }, 27, 100,
				HunterEquipment.BOX, 19190, 19192, new Animation(8362),
				new Animation(8361)),

		GECKO3(7287, new Item[] { new Item(12740) }, 27, 100, 
				HunterEquipment.BOX, 19190, 19192, new Animation(8362),
				new Animation(8361)),

		GECKO4(7288, new Item[] { new Item(12741) }, 27, 100, 
				HunterEquipment.BOX, 19190, 19192, new Animation(8362), 
				new Animation(8361));

		// as
		// well
		// try
		// converting
		// it
		// lol

		private int npcId, level, successfulTransformObjectId,
				failedTransformObjectId;
		private Item[] item;
		private double xp;
		private HunterEquipment hunter;
		private Animation successCatchAnim, failCatchAnim;

		static final Map<Integer, HunterNPC> npc = new HashMap<Integer, HunterNPC>();
		static final Map<Integer, HunterNPC> object = new HashMap<Integer, HunterNPC>();

		public static HunterNPC forId(int id) {
			return npc.get(id);
		}

		static {
			for (HunterNPC npcs : HunterNPC.values())
				npc.put(npcs.npcId, npcs);
			for (HunterNPC objets : HunterNPC.values())
				object.put(objets.successfulTransformObjectId, objets);
		}

		public static HunterNPC forObjectId(int id) {
			return object.get(id);
		}

		private HunterNPC(int npcId, Item[] item, int level, double xp,
				HunterEquipment hunter, int successfulTransformObjectId,
				int failedTransformObjectId, Animation successCatchAnim,
				Animation failCatchAnim) {
			this.npcId = npcId;
			this.item = item;
			this.level = level;
			this.xp = xp;
			this.hunter = hunter;
			this.successfulTransformObjectId = successfulTransformObjectId;
			this.failedTransformObjectId = failedTransformObjectId;
			this.successCatchAnim = successCatchAnim;
			this.failCatchAnim = failCatchAnim;
		}

		public int getLevel() {
			return level;
		}

		public int getNpcId() {
			return npcId;
		}

		public double getXp() {
			return xp;
		}

		public Item[] getItems() {
			return item;
		}

		public HunterEquipment getEquipment() {
			return hunter;
		}

		public int getSuccessfulTransformObjectId() {
			return successfulTransformObjectId;
		}

		public int getFailedTransformObjectId() {
			return failedTransformObjectId;
		}

		public HunterEquipment getHunter() {
			return hunter;
		}

		public Animation getSuccessCatchAnim() {
			return successCatchAnim;
		}

		public Animation getFailCatchAnim() {
			return failCatchAnim;
		}
	}

	public enum HunterEquipment {

		BOX(10008, 19187, new Animation(5208), 27), NET_TRAP(303, 19673,
				new Animation(5208), 27), NET_TRAP_ORANGE(303, 19651,
				new Animation(5208), 47), NET_TRAP_BLACK(303, 19665,
				new Animation(5208), 67), NET_TRAP_RED(303, 19681,
				new Animation(5208), 59), BRID_SNARE(10006, 19175,
				new Animation(5207), 1), LARUPIA_PITFALL(-1, 19232,
				new Animation(5207), 31);

		private int itemId, objectId, baseLevel;
		private Animation pickUpAnimation;

		private HunterEquipment(int itemId, int objectId,
				Animation pickUpAnimation, int baseLevel) {
			this.itemId = itemId;
			this.objectId = objectId;
			this.pickUpAnimation = pickUpAnimation;
			this.baseLevel = baseLevel;
		}

		public int getId() {
			return itemId;
		}

		public int getObjectId() {
			return objectId;
		}

		public Animation getPickUpAnimation() {
			return pickUpAnimation;
		}

		public int getBaseLevel() {
			return baseLevel;
		}
	}

	private HunterEquipment hunt;

	public int getTrapAmount(Player player) {
		int level = player.getSkills().getLevel(Skills.HUNTER);
		if (level >= 80) {
			return 5;
		} else if (level >= 60) {
			return 4;
		} else if (level >= 40) {
			return 3;
		} else if (level >= 20) {
			return 2;
		}
		return 1;
	}

	public BoxAction(HunterEquipment hunt) {
		this.hunt = hunt;
	}

	@Override
	public boolean start(Player player) {
		if (!checkAll(player))
			return false;
		player.getPackets().sendGameMessage("You start setting up the trap..");
		player.setNextAnimation(new Animation(5208));
		player.lock(3);
		setActionDelay(player, 2);
		return true;
	}

	@Override
	public boolean process(Player player) {
		return true;
	}

	@Override
	public int processWithDelay(Player player) {
		if (!player.addWalkSteps(player.getX() - 1, player.getY(), 1))
			if (!player.addWalkSteps(player.getX() + 1, player.getY(), 1))
				if (!player.addWalkSteps(player.getX(), player.getY() + 1, 1))
					player.addWalkSteps(player.getX(), player.getY() - 1, 1);
		player.getInventory().deleteItem(hunt.getId(), 1);
		OwnedObjectManager.addOwnedObjectManager(player,
				new WorldObject[] { new WorldObject(hunt.getObjectId(), 10, 0,
						player.getX(), player.getY(), player.getPlane()) },
				new long[] { 600000 });
		return -1;
	}

	@Override
	public void stop(final Player player) {
		setActionDelay(player, 3);
	}

	private boolean checkAll(Player player) {
		if (player.getSkills().getLevel(Skills.HUNTER) < hunt.getBaseLevel()) {
			player.getDialogueManager().startDialogue(
					"SimpleMessage",
					"You need a Hunter level of " + hunt.getBaseLevel()
							+ " to use this.");
			return false;
		}
		int trapAmt = getTrapAmount(player);
		if (OwnedObjectManager.getObjectsforValue(player, hunt.getObjectId()) == trapAmt) {
			player.getPackets().sendGameMessage(
					"You can't setup more than " + trapAmt + " traps.");
			return false;
		}
		if (!World.isTileFree(0, player.getX(), player.getY(),
				player.getPlane())) {
			player.getPackets().sendGameMessage(
					"You can't setup your trap here.");
			return false;
		}
		List<WorldObject> objects = World.getRegion(player.getRegionId())
				.getSpawnedObjects();
		if (objects != null) {
			for (WorldObject object : objects) {
				if (object.getX() == player.getX()
						&& object.getY() == player.getY()
						&& object.getPlane() == player.getPlane()) {
					player.getPackets().sendGameMessage(
							"You can't setup your trap here.");
					return false;
				}
			}
		}
		return true;
	}
}