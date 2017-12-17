package com.rs.game.player.content.pet;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.rs.Settings;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.Animation;
import com.rs.game.ForceTalk;
import com.rs.game.World;
import com.rs.game.item.Item;
import com.rs.game.npc.pet.Pet;
import com.rs.game.player.Player;
import com.rs.game.player.content.ItemConstants;
import com.rs.utils.SerializableFilesManager;

/**
 * The pet manager.
 * @author Emperor
 *
 */
public final class PetManager implements Serializable {

	/**
	 * The serial UID.
	 */
	private static final long serialVersionUID = -3379270918966667109L;

	/**
	 * The pet details mapping, sorted by item id.
	 */
	private final Map<Integer, PetDetails> petDetails = new HashMap<Integer, PetDetails>();

	/**
	 * The player.
	 */
	private Player player;

	/**
	 * The current NPC id.
	 */
	private int npcId;

	/**
	 * The current item id.
	 */
	private int itemId;

	/**
	 * The troll baby's name (if any).
	 */
	private String trollBabyName;

	/**
	 * Constructs a new {@code PetManager} {@code Object}.
	 */
	public PetManager() {
		/*
		 * empty.
		 */
	}

	/**
	 * Spawns a pet.
	 * @param itemId The item id.
	 * @param deleteItem If the item should be removed.
	 * @return {@code True} if we were dealing with a pet item id.
	 */
	public boolean spawnPet(int itemId, boolean deleteItem) {
		Pets pets = Pets.forId(itemId);
		if (pets == null) {	
			return false;
		}
		if (player.getPet() != null || player.getFamiliar() != null) {
			player.getPackets().sendGameMessage("You already have a follower.");
			return true;
		}
		if (!hasRequirements(pets)) {
			return true;
		}
		int baseItemId = pets.getBabyItemId();
		PetDetails details = petDetails.get(baseItemId);
		if (details == null) {
			details = new PetDetails(pets.getGrowthRate() == 0.0 ? 100.0 : 0.0);
			petDetails.put(baseItemId, details);
		}
		int id = pets.getItemId(details.getStage());
		if (itemId != id) {
			player.getPackets().sendGameMessage("This is not the right pet, grow the pet correctly.");
			return true;
		}
		int npcId = pets.getNpcId(details.getStage());
		if (npcId > 0) {
			Pet pet = new Pet(npcId, itemId, player, player, details);
			this.npcId = npcId;
			this.itemId = itemId;
			pet.setGrowthRate(pets.getGrowthRate());
			player.setPet(pet);
			if (deleteItem) {
				player.setNextAnimation(new Animation(827));
				player.getInventory().deleteItem(itemId, 1);
			}
			return true;
		}
		return true;
	}

	/**
	 * Checks if the player has the requirements for the pet.
	 * @param pet The pet.
	 * @return {@code True} if so.
	 */
	private boolean hasRequirements(Pets pet) {
		switch (pet) {
		case SARADOMIN_OWL:
		case GUTHIX_RAPTOR:
		case ZAMORAK_HAWK:
		case VULTURE_1:
		case VULTURE_2:
		case VULTURE_3:
		case VULTURE_4:
		case VULTURE_5:
		case CHAMELEON:
			if (!player.isDonator()) {
				player.getPackets().sendGameMessage("You need to be donator to use this pet.");
				return false;
			}
			return true;
		case SEARING_FLAME:
		case GLOWING_EMBER:
		case TWISTED_FIRESTARTER:
		case WARMING_FLAME:
			if (!player.isExtremeDonator()) {
				player.getPackets().sendGameMessage("You need to be Extreme donator to use this pet.");
				return false;
			}
			return true;
		}
		return true;
	}

	/**
	 * Initializes the pet manager.
	 */
	public void init() {
		if (npcId > 0 && itemId > 0) {
			spawnPet(itemId, false);
		}
	}
	
	/**
	 * Makes the pet eat.
	 * @param foodId The food item id.
	 * @param npc The pet NPC.
	 */
	public void eat(int foodId, Pet npc) {
		Item item = new Item(foodId);
		if (npc != player.getPet()) {
			player.getPackets().sendGameMessage("This isn't your pet!");
			return;
		}
		if(player.getPetManager().isALegendaryPet()) {
			player.getDialogueManager().startDialogue("LegendaryPet", item);
			return;
		}
		Pets pets = Pets.forId(itemId);
		if (pets == null) {
			return;
		}
		if (pets == Pets.TROLL_BABY) {
			if (!ItemConstants.isTradeable(new Item(foodId))) {
				player.getPackets().sendGameMessage("Your troll baby won't eat this item.");
				return;
			}
			if (trollBabyName == null) {
				trollBabyName = ItemDefinitions.getItemDefinitions(foodId).getName();
				npc.setName(trollBabyName);
				npc.setNextForceTalk(new ForceTalk("YUM! Me likes " + trollBabyName + "!"));
			}
			player.getInventory().deleteItem(foodId, 1);
			npc.setName(ItemDefinitions.getItemDefinitions(foodId).getName());
			if(ItemDefinitions.getItemDefinitions(foodId).getName().contains("partyhat") || ItemDefinitions.getItemDefinitions(foodId).getName().contains("nox") 
					|| ItemDefinitions.getItemDefinitions(foodId).getName().contains("santa") || ItemDefinitions.getItemDefinitions(foodId).getName().contains("ween")
					|| ItemDefinitions.getItemDefinitions(foodId).getName().contains("torva") || ItemDefinitions.getItemDefinitions(foodId).getName().contains("pernix")
					|| ItemDefinitions.getItemDefinitions(foodId).getName().contains("hex")
					|| ItemDefinitions.getItemDefinitions(foodId).getName().contains("virtus") || ItemDefinitions.getItemDefinitions(foodId).getName().contains("third-age")
					|| ItemDefinitions.getItemDefinitions(foodId).getName().contains("3rd age") || ItemDefinitions.getItemDefinitions(foodId).getName().contains("spirit shield")
					|| ItemDefinitions.getItemDefinitions(foodId).getName().contains("malevolent") || ItemDefinitions.getItemDefinitions(foodId).getName().contains("tectonic")
					|| ItemDefinitions.getItemDefinitions(foodId).getName().contains("primal") || ItemDefinitions.getItemDefinitions(foodId).getName().contains("seismic") 
					|| ItemDefinitions.getItemDefinitions(foodId).getName().contains("zaryte") || ItemDefinitions.getItemDefinitions(foodId).getName().contains("ragefire")
					|| ItemDefinitions.getItemDefinitions(foodId).getName().contains("glaiven") || ItemDefinitions.getItemDefinitions(foodId).getName().contains("drygore")
					|| ItemDefinitions.getItemDefinitions(foodId).getName().contains("sirenic") || ItemDefinitions.getItemDefinitions(foodId).getName().contains("robin")
					|| ItemDefinitions.getItemDefinitions(foodId).getName().contains("ganodermic") || ItemDefinitions.getItemDefinitions(foodId).getName().contains("bandos")
					|| ItemDefinitions.getItemDefinitions(foodId).getName().contains("armadyl") || ItemDefinitions.getItemDefinitions(foodId).getName().contains("godsword")
					|| ItemDefinitions.getItemDefinitions(foodId).getName().contains("frostmourne") || ItemDefinitions.getItemDefinitions(foodId).getName().contains("ascension")
					|| ItemDefinitions.getItemDefinitions(foodId).getName().contains("ranger boots") || ItemDefinitions.getItemDefinitions(foodId).getName().contains("blood neck")
					|| ItemDefinitions.getItemDefinitions(foodId).getName().contains("(or)")) {

				for(int i = 0; i < Settings.RARE_DROPS.length; i++) {
					if(ItemDefinitions.getItemDefinitions(foodId).getName().toLowerCase() == Settings.RARE_DROPS[i].toLowerCase()) {
						World.sendWorldMessage("<img=5><col=ffffff><shad=ff0000> " + player.getDisplayName() + " has just fed their baby a troll a " + ItemDefinitions.getItemDefinitions(foodId).getName(), false);
					}
				}

			}
			player.getPackets().sendGameMessage("Your pet happily eats the " + ItemDefinitions.getItemDefinitions(foodId).getName() + ".");
			SerializableFilesManager.savePlayer(player);
			return;
		}
		for (int food : pets.getFood()) {
			if (food == foodId) {
				player.getInventory().deleteItem(food, 1);
				player.getPackets().sendGameMessage("Your pet happily eats the " + ItemDefinitions.getItemDefinitions(food).getName() + ".");
				player.setNextAnimation(new Animation(827));
				//npc.getDetails().updateHunger(-15.0);
				return;
			}
		}
		player.getPackets().sendGameMessage("Nothing interesting happens.");
	}

	/**
	 * Removes the details for this pet.
	 * @param npcId The item id of the pet.
	 */
	public void removeDetails(int itemId) {
		Pets pets = Pets.forId(itemId);
		if (pets == null) {	
			return;
		}
		petDetails.remove(pets.getBabyItemId());
	}

	/**
	 * Gets the player.
	 * @return The player.
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * Sets the player.
	 * @param player The player to set.
	 */
	public void setPlayer(Player player) {
		this.player = player;
	}

	/**
	 * Gets the npcId.
	 * @return The npcId.
	 */
	public int getNpcId() {
		return npcId;
	}

	/**
	 * Sets the npcId.
	 * @param npcId The npcId to set.
	 */
	public void setNpcId(int npcId) {
		this.npcId = npcId;
	}

	/**
	 * Gets the itemId.
	 * @return The itemId.
	 */
	public int getItemId() {
		return itemId;
	}

	/**
	 * Sets the itemId.
	 * @param itemId The itemId to set.
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	/**
	 * Gets the trollBabyName.
	 * @return The trollBabyName.
	 */
	public String getTrollBabyName() {
		return trollBabyName;
	}

	/**
	 * Sets the trollBabyName.
	 * @param trollBabyName The trollBabyName to set.
	 */
	public void setTrollBabyName(String trollBabyName) {
		this.trollBabyName = trollBabyName;
	}

	/**
	 * If the pet is a legendary or not
	 * @return
	 */
	public boolean isALegendaryPet() {
		switch(getNpcId()) {
		case Pet.BLAZE_HOUND:
		case Pet.BLOOD_POUNCER:
		case Pet.DRAGON_WOLF:
		case Pet.PROTOTYPE_COLOSSUS:
		case Pet.RORY_THE_REINDEER:
		case Pet.SKY_POUNDER:
		case Pet.WARBORN_BEHEMOTH:
			return true;
		}
		return false;
	}


}