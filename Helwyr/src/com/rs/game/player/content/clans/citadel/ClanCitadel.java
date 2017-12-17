package com.rs.game.player.content.clans.citadel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.rs.game.WorldTile;
import com.rs.game.player.Player;
import com.rs.game.player.content.clans.Clan;
import com.rs.game.player.content.clans.citadel.generation.CitadelConstants;
import com.rs.game.player.content.clans.citadel.generation.GenerateRegion;
import com.rs.game.player.content.clans.citadel.generation.GenerationType;
import com.rs.game.player.content.clans.citadel.generation.PlotConstants;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public class ClanCitadel implements Serializable {

	private static final long serialVersionUID = 6187562651737692445L;

	private List<Player> members = new ArrayList<>();
	private List<Player> guests = new ArrayList<>();
	private transient boolean running;
	private transient boolean closing;
	public int[] boundChuncks;
	private Clan clan;

	public ClanCitadel(Clan clan) {
		this.clan = clan;
	}


	public List<Player> getMembers() {
		return members;
	}

	public List<Player> getGuests() {
		return guests;
	}

	/**
	 * Sends a message to all the players in the @members<List>
	 * @param message
	 */
	public void sendMessageToMembers(String message) {
		for(Player members : getMembers()) {
			if (members == null)
				continue;
			members.getPackets().sendGameMessage(message);
		}
	}

	/**
	 * Sends a message to all the players in the @guests<List>
	 * @param message
	 */
	public void sendMessageToGuests(String message) {
		for(Player guests : getGuests()) {
			if (guests == null)
				continue;
			guests.getPackets().sendGameMessage(message);
		}
	}

	/**
	 * Initalizes the instance of citadel.
	 * @param player
	 * @return
	 */
	public boolean enterCitadel(final Player player) {
		addMemberToList(player);
		generateRegion();
		player.getControlerManager().startControler("CitadelControler", clan);
		WorldTasksManager.schedule(new WorldTask() {
			@Override
			public void run() {
				if(boundChuncks != null)
					player.setNextWorldTile(new WorldTile(boundChuncks[0] * 21 + 10, boundChuncks[1] * 8 + 10, 0));
					player.unlock();
			}

		}, 4);
		return true;
	}

	/**
	 * Removes the entire citadel instance.
	 * @return
	 */
	public boolean removeFromCitadel(MemberType type, Player player) {
		switch(type) {
		case GUEST:
			removeGuestFromLogin(player);
			break;
		case MEMBER:
			removeMemberFromList(player);
			break;
		}
		if(getMembers().isEmpty())
			removeRegion();
		if(isClosing()) {
			if(!getGuests().isEmpty()) 
				for(Player guests : getMembers()) 
					outsideCitadel(guests);
		}
		return true;
	}

	/**
	 * Generates @new region onto Citadel region
	 */
	private void generateRegion(/*GenerationType type, int[] Rarea, int[] boundChuncks, int[] ratio*/) {
		new GenerateRegion(this, GenerationType.CITADEL, new int[] {CitadelConstants.FULL_CITADEL.getRx(), CitadelConstants.FULL_CITADEL.getRy()}, new int[] {24, 24}).generateRegion();
		new GenerateRegion(this, GenerationType.F_SKILL_PLOT, new int[] {PlotConstants.MINING_PLOT.getRx(), PlotConstants.MINING_PLOT.getRy()}).generatePlot(new int[] {1, 5, 1, 5});
		new GenerateRegion(this, GenerationType.SKILL_PLOT, new int[] { PlotConstants.WOODCUTTING_PLOT.getRx(), PlotConstants.WOODCUTTING_PLOT.getRy()}).generatePlot(new int[] {1, 10, 1, 5});
		new GenerateRegion(this, GenerationType.SKILL_PLOT, new int[] { PlotConstants.LOOM_PLOT.getRx(), PlotConstants.LOOM_PLOT.getRy() }).generatePlot(new int[] {1, 2, 1, 6});
		new GenerateRegion(this, GenerationType.SKILL_PLOT, new int[] { PlotConstants.FURNACE_PLOT.getRx(), PlotConstants.FURNACE_PLOT.getRy() }).generatePlot(new int[] {1, 4, 1, 9});
	}

	/**
	 * Removes Region
	 */
	private void removeRegion() {
		setClosing(true);
		new GenerateRegion(this, new int[] {16, 16}).destoryRegion();
	}

	/**
	 * Teleports @memberType outside of citadel
	 * @param player
	 */
	public void outsideCitadel(Player player) {
		player.setNextWorldTile(new WorldTile(-1, -1, -1));
	}

	/**
	 * Checks if the player object is inside @members<List>
	 * @param player
	 * @return
	 */
	public boolean isMember(Player player) {
		return members.contains(player);
	}

	/**
	 * 
	 * @param player
	 * @return
	 */
	private boolean addMemberToList(Player player) {
		if(members.contains(player))
			return false;
		members.add(player);
		return true;
	}

	/**
	 * 
	 * @param player
	 * @return
	 */
	private boolean removeMemberFromList(Player player) {
		if(!members.contains(player))
			return false;
		members.remove(player);
		return true;
	}


	/**
	 * Checks if the player object is inside @guests<List>
	 * @param player
	 * @return
	 */
	public boolean isGuest(Player player) {
		return guests.contains(player);
	}

	/**
	 * 
	 * @param player
	 * @return
	 */
	private boolean addGuestToList(Player player) {
		if(members.contains(player))
			return false;
		members.add(player);
		return true;
	}

	/**
	 * 
	 * @param player
	 * @return
	 */
	private boolean removeGuestFromLogin(Player player) {
		if(!members.contains(player))
			return false;
		members.add(player);
		return true;
	}

	public int[] getBoundChuncks() {
		return boundChuncks;
	}

	public int[] setBoundChuncks(int[] boundChuncks) {
		return boundChuncks;
	}

	public boolean isInstanced() {
		return running;
	}

	public boolean setInstanced(boolean running) {
		return this.running = running;
	}

	public Clan getClan() {
		return clan;
	}


	public void setClan(Clan clan) {
		this.clan = clan;
	}


	public boolean isClosing() {
		return closing;
	}


	public void setClosing(boolean closing) {
		this.closing = closing;
	}

}
