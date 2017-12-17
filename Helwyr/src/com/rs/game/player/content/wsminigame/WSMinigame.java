package com.rs.game.player.content.wsminigame;

import com.rs.cache.Cache;
import com.rs.game.player.Player;
import com.rs.utils.Utils;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by JTlr Frost {@skype;frostbitersps} on 7/14/2016.
 */
public class WSMinigame {

    private static LinkedList<Player> queuePlayers = new LinkedList<>();
    private static LinkedList<Player> gamePlayers = new LinkedList<>();
    public static final int AMOUNT_ALLOWED = 7, MINIMUM_AMOUNT = 6;
    public static boolean GAME_STARTED;

    public static void main(String[] args) {
        Cache.init();
        Player[] players = new Player[11];
        for (int i = 0; i < 10; i++) {
            players[i] = new Player("user");
            players[i].setUsername("User" + i);
        }
        for (Player n : players)
            addLobbyPlayer(n);
    }

    public static List<Player> getQueuePlayers() {
        return queuePlayers;
    }

    public static List<Player> getGamePlayers() {
        return gamePlayers;
    }

    public static boolean addLobbyPlayer(Player player) {
        if (queuePlayers.contains(player))
            return false;
        queuePlayers.add(player);
        if(!GAME_STARTED && getPosition(player) != 0)
            System.out.println("You have been added into queue for the minigame position queue: " + getPosition(player));
        if(!GAME_STARTED && queuePlayers.size() >= MINIMUM_AMOUNT)
            passToGame();
        if(GAME_STARTED && fullGame())
            System.out.println("WSMinigame has already been started, Your position in queue to join the minigame is " + getPosition(player));
        return true;
    }

    public static boolean removeQueuePlayer(Player player) {
        if (!queuePlayers.contains(player))
            return false;
        queuePlayers.remove(player);
        /*for (Player l : getQueuePlayers()) {
            int position = getPosition(l);
            if (GAME_STARTED && position > 1)
                System.out.println(("Position in Queue: " + position + "."));
        }*/
        return true;
    }

    public static boolean addGamePlayer(Player player) {
        if (gamePlayers.contains(player))
            return false;
        gamePlayers.add(player);
        return true;
    }

    public static boolean removeGamePlayer(Player player) {
        if (!gamePlayers.contains(player))
            return false;
        gamePlayers.remove(player);
        return true;
    }

    public static boolean passToGame() {
        GAME_STARTED = true;
        System.out.println("==================Game Started=============================");
        while (queuePlayers.iterator().hasNext()) {
            Player player = getFirstInQueue();
            if(player == null)
                continue;
            if (gamePlayers.size() >= AMOUNT_ALLOWED)
                System.out.println("Game is full... [Attempting] : " + player.getUsername() + ".");
            removeQueuePlayer(player);
            addGamePlayer(player);
            System.out.println("Welcome to the game " + player.getUsername() + ". =========== NEXT | " + getFirstInQueue().getUsername() + "==========");
        }
        return true;
    }

    public static Player getFirstInQueue() {
        return queuePlayers.getFirst();
    }

    public static Player getLastInQueue() {
        return queuePlayers.getLast();
    }

    public static int getPosition(Player player) {
        return queuePlayers.indexOf(player);
    }

    public static boolean fullGame() {
        return gamePlayers.size() == AMOUNT_ALLOWED;
    }


}
