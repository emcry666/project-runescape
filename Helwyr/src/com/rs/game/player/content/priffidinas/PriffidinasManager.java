package com.rs.game.player.content.priffidinas;

import java.io.Serializable;
import java.util.Vector;

import com.rs.game.player.Player;

/**
 * 
 * @author Frostbite<Abstract>
 * @contact<skype;frostbitersps><email;frostbitersps@gmail.com>
 */

public class PriffidinasManager implements Serializable {

	private static final long serialVersionUID = -837251691746759235L;

	enum Task {

		SEREN_STONES

	}

	private Vector<Task> tasksCompleted = new Vector<Task>();
	private Player player;


	public PriffidinasManager(Player player) {
		this.player = player;
	}

	/**
	 * Returns @Tasks <Vector>
	 * @return
	 */
	public Vector<Task> getTasksCompleted() {
		return tasksCompleted;
	}

	/**
	 * Checks if the <Player> has completed @Task
	 * @param task
	 * @return
	 */
	public boolean hasCompletedTask(Task task) {
		return tasksCompleted.contains(task);
	}

	/**
	 * Adds <Task> to completed @Tasks
	 * @param task
	 * @return
	 */
	public boolean setHasCompletedTask(Task task) {
		if(tasksCompleted.contains(task))
			return false;
		tasksCompleted.add(task);
		return true;
	}

	/**
	 * Resets the <Players> @Task
	 * @param task
	 * @return
	 */
	public boolean resetTask(Task task) {
		if(!tasksCompleted.contains(task))
			return false;
		tasksCompleted.remove(task);
		return true;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Player getPlayer() {
		return player;
	}

	public void setTasksCompleted(Vector<Task> tasksCompleted) {
		this.tasksCompleted = tasksCompleted;
	}

}
