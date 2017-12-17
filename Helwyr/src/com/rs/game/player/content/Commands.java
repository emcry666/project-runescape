package com.rs.game.player.content;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.TimerTask;

import com.rs.Settings;
import com.rs.cache.loaders.AnimationDefinitions;
import com.rs.cache.loaders.Configs;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.engine.GameEngine;
import com.rs.game.Animation;
import com.rs.game.ForceMovement;
import com.rs.game.ForceTalk;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.cityhandler.CityEventHandler;
import com.rs.game.cityhandler.impl.Miscellania;
import com.rs.game.events.ServerEventManager;
import com.rs.game.item.Item;
import com.rs.game.minigames.clanwars.FfaZone;
import com.rs.game.npc.NPC;
import com.rs.game.npc.pet.Pet;
import com.rs.game.npc.vorago.VoragoHandler;
import com.rs.game.player.BodyGlow;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.content.bot.Bot;
import com.rs.game.player.content.bot.BotList;
import com.rs.game.player.content.bot.action.PVPAIPActions;
import com.rs.game.player.content.bot.action.PVPAIPBuilderUtils;
import com.rs.game.player.content.grandExchange.GrandExchange;
import com.rs.game.player.content.instancing.bossInstance.BossInstanceHandler;
import com.rs.game.player.content.instancing.bossInstance.BossInstanceHandler.Boss;
import com.rs.game.player.content.land.LandHandler;
import com.rs.game.player.content.miscellania.ThroneOfMiscellania;
import com.rs.game.player.content.revents.EventConstants;
import com.rs.game.player.content.revents.EventManager;
import com.rs.game.player.content.stealingcreations.StealingCreationController;
import com.rs.game.player.content.stealingcreations.StealingCreationLobbyController;
import com.rs.game.player.content.wsminigame.WSMinigame;
import com.rs.game.player.controlers.ControlerHandler;
import com.rs.game.player.controlers.DungeonController;
import com.rs.game.player.controlers.Wilderness;
import com.rs.game.player.cutscenes.DZGuideScene;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.mysql.impl.Donation;
import com.rs.tools.ItemSearch;
import com.rs.utils.DisplayName;
import com.rs.utils.Encrypt;
import com.rs.utils.IPBanL;
import com.rs.utils.ItemBonuses;
import com.rs.utils.Logger;
import com.rs.utils.NPCBonuses;
import com.rs.utils.NPCCombatDefinitionsL;
import com.rs.utils.NPCDrops;
import com.rs.utils.NPCSpawns;
import com.rs.utils.ObjectSpawns;
import com.rs.utils.PkRank;
import com.rs.utils.SerializableFilesManager;
import com.rs.utils.ShopsHandler;
import com.rs.utils.Utils;

/*
 * doesnt let it be extended
 */
public final class Commands {

    public static final WorldTile RESPAWN = new WorldTile(3182, 5713, 0);

	/*
     * all console commands only for admin, chat commands processed if they not
	 * processed by console
	 */

    /**
     * returns if command was processed
     */
    public static boolean canVote = true;

    public static boolean processCommand(Player player, String command,
                                         boolean console, boolean clientCommand) {

        if (command.length() == 0) // if they used ::(nothing) theres no command
            return false;
        String[] cmd = command.toLowerCase().split(" ");
        if (cmd.length == 0)
            return false;
        if (!player.getPlayerPin().hasEnteredPin()) {
            player.getPackets().sendGameMessage("You have not entered your player pin.");
            return false;
        }
        if (player.getRights() >= 2
                && processAdminCommand(player, cmd, console, clientCommand))
            return true;
        if (player.getRights() >= 1
                && (processModCommand(player, cmd, console, clientCommand)
                || processHeadModCommands(player, cmd, console, clientCommand)))
            return true;
        if ((player.isSupporter() || player.getRights() >= 1) && processSupportCommands(player, cmd, console, clientCommand))
            return true;
        if (Settings.ECONOMY) {
            player.getPackets().sendGameMessage("You can't use any commands in economy mode!");
            return true;
        }
        return processNormalCommand(player, cmd, console, clientCommand);

    }


	/*
	 * extra parameters if you want to check them
	 */


    public static boolean processAdminCommand(final Player player,
                                              String[] cmd, boolean console, boolean clientCommand) {
        if (clientCommand) {

            switch (cmd[0]) {

                case "tele":
                    cmd = cmd[1].split(",");
                    int plane = Integer.valueOf(cmd[0]);
                    int x = Integer.valueOf(cmd[1]) << 6 | Integer.valueOf(cmd[3]);
                    int y = Integer.valueOf(cmd[2]) << 6 | Integer.valueOf(cmd[4]);
                    player.setNextWorldTile(new WorldTile(x, y, plane));
                    return true;

            }
        } else {
            String name = null;
            Player target = null;
            WorldObject object;
            boolean loggedIn;
            switch (cmd[0]) {
            
            case "clanc":
            	player.getClanManager().getClan().getCitadel().enterCitadel(player);
            	return true;

                case "kkk":
                    BossInstanceHandler.enterInstance(player, Boss.King_Black_Dragon);
                    player.getPackets().sendGameMessage("Starting...");
                    return true;
                case "kk":
                    BossInstanceHandler.enterInstance(player, Boss.Kalphite_King);
                    player.getPackets().sendGameMessage("Starting...");
                    return true;
                case "vorg":
                    BossInstanceHandler.enterInstance(player, Boss.Vorago);
                    player.getPackets().sendGameMessage("Starting...");
                    return true;
                case "arax":
                    BossInstanceHandler.enterInstance(player, Boss.Araxxi);
                    return true;

                case "rago":
                    VoragoHandler.CHALLENGER_NAME = player.getDisplayName();
                    final List<Player> players = Collections.synchronizedList(new ArrayList<Player>());
                    for (Player p : World.getPlayers()) {
                        if (p.getX() >= 3029 && p.getX() <= 3055 && p.getY() >= 6117 && p.getY() <= 6136) {
                            players.add(p);
                            if (p != player) {
                                p.getTemporaryAttributtes().put("accRagoChall", false);
                                //p.getDialogueManager().execute(new VoragoAccChallenge(), true);
                            } else {
                                p.getTemporaryAttributtes().put("accRagoChall", true);
                            }
                        }
                    }
                    if (players.size() > 1) {
                        WorldTasksManager.schedule(new WorldTask() {
                            int count = 0;

                            @Override
                            public void run() {
                                for (Player p : players) {
                                    if (p.getTemporaryAttributtes().get("accRagoChall") != null && ((boolean) p.getTemporaryAttributtes().get("accRagoChall") == true)) {
                                        if (count == 0) {
                                            p.setNextFaceWorldTile(new WorldTile(3040, 6131, 0));
                                        }
                                        if (count == 1) {
                                            p.setNextAnimation(new Animation(10070));
                                            p.applyHit(new Hit(p, (50000 / players.size()), HitLook.REGULAR_DAMAGE));
                                            WorldTile toTile = p.transform(0, -8, 0);
                                            p.setNextForceMovement(new ForceMovement(new WorldTile(p), 1, toTile, 2, ForceMovement.SOUTH));
                                        }
                                        if (count == 3) {
                                            p.setNextAnimation(new Animation(-1));
                                        }
                                    }
                                }
                                count++;
                            }

                        }, 6, 1);
                        WorldTasksManager.schedule(new WorldTask() {

                            @Override
                            public void run() {
                                for (Player p : players) {
                                    if (p.getTemporaryAttributtes().get("accRagoChall") != null && ((boolean) p.getTemporaryAttributtes().get("accRagoChall") == true)) {
                                        p.getControlerManager().startControler("VoragoController");
                                    }
                                }
                                VoragoHandler.beginFight();
                            }

                        }, 11);
                    }
                    return true;

                case "vorago":
                    player.getPackets().sendGameMessage("Vorago's power forces you off the edge!");
                    player.setNextWorldTile(new WorldTile(3037, 6120, 0));
                    WorldTasksManager.schedule(new WorldTask() {
                        int count = 0;

                        @Override
                        public void run() {
                            if (count == 1) {
                                player.setNextFaceWorldTile(new WorldTile(3037, 6125, 0));
                            }
                            if (count == 2) {
                                player.setNextAnimation(new Animation(20389));
                                player.applyHit(new Hit(player, 100, HitLook.REGULAR_DAMAGE));
                            }
                            if (count == 3) {
                                player.setNextAnimation(new Animation(-1));
                                VoragoHandler.beginFight();
                                player.getControlerManager().startControler("VoragoController");
                            }
                            if (count == 4) {
                                player.setNextAnimation(new Animation(20401));
                            }
                            count++;
                        }
                    }, 0, 1);
                    return true;

                case "reloadshops":
                    ShopsHandler.loadShops();
                    return true;

                case "restoreconfigs":
                case "reloadconfigs":
                    Configs.init();
                    return true;

                case "restorereqs":
                case "restoreallconfs":
                    TrimCompletionistRequirements.init();
                    CompletionistRequirements.init();
                    return true;

                case "t1":
                    player.getThrone().displayInterface();
                    return true;

                case "test2":
                    for (int i = 0; i < 50; i++) {
                        player.getThrone().addResource(new Item(i, 1));
                    }
                    return true;

                case "cloop":
                    if (cmd.length < 3)
                        return false;
                    int loopTime = Integer.parseInt(cmd[1]);
                    int fileId = Integer.parseInt(cmd[2]);
                    for (int i = 0; i < loopTime; i++) {
                        player.getPackets().sendConfig(fileId, i);
                        player.sm("config: " + i);
                    }
                    player.sm("done");
                    break;
                case "chide":
                    if (cmd.length < 3)
                        return false;
                    loopTime = Integer.parseInt(cmd[1]);
                    fileId = Integer.parseInt(cmd[2]);
                    int cid = Integer.parseInt(cmd[3]);
                    boolean h = Boolean.parseBoolean(cmd[4]);
                    for (int i = 0; i < loopTime; i++) {
                        player.getPackets().sendHideIComponent(fileId, cid, h);
                        player.sm("config: " + i);
                    }
                    player.sm("done");
                    break;

                case "ctloop":
                    if (cmd.length < 3)
                        return false;
                    loopTime = Integer.parseInt(cmd[1]);
                    fileId = Integer.parseInt(cmd[2]);
                    for (int i = 0; i < loopTime; i++) {
                        player.getPackets().sendConfig(fileId, i);
                        player.sm("config: " + i);
                    }
                    player.sm("done");
                    break;

                case "gcloop":
                    if (cmd.length < 3)
                        return false;
                    loopTime = Integer.parseInt(cmd[1]);
                    fileId = Integer.parseInt(cmd[2]);
                    for (int i = 0; i < loopTime; i++) {
                        player.getPackets().sendGlobalConfig(fileId, i);
                        player.sm("config: " + i);
                    }
                    player.sm("done");
                    break;
                case "sloop":
                    if (cmd.length < 3)
                        return false;
                    loopTime = Integer.parseInt(cmd[1]);
                    fileId = Integer.parseInt(cmd[2]);
                    for (int i = 0; i < loopTime; i++) {
                        player.getPackets().sendRunScript(fileId, i);
                        player.sm("config: " + i);
                    }
                    player.sm("done");
                    break;

                case "reputetest":
                    for (int i = 0; i < 100; i++) {
                        player.getReputeManager().repute();
                    }
                    return true;

                case "reloadevents":
                    CityEventHandler.registerCitys();
                    return true;

                case "recalcge":
                    GrandExchange.recalcPrices();
                    player.getPackets().sendGameMessage("Recalculating ge prices.");
                    return true;

                case "reloadcontrollers":
                    ControlerHandler.init();
                    return true;

                case "teleports":
                case "teleport":
                case "train":
                    TeleportInterface.openSelectSkill(player);
                    return true;


                case "getnpc":
                case "searchnpc":
                    List<NPCDefinitions> defz = new LinkedList<NPCDefinitions>();
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    player.sm("Conducting NPC search for term '" + name + "'.");
                    for (int i = 0; i < 20000; i++) {
                        if (NPCDefinitions.getNPCDefinitions(i).name.toLowerCase().contains(name) || NPCDefinitions.getNPCDefinitions(i).name.toLowerCase().startsWith(name) || NPCDefinitions.getNPCDefinitions(i).name.toLowerCase().endsWith(name)
                                || NPCDefinitions.getNPCDefinitions(i).name.toLowerCase().equalsIgnoreCase(name))
                            defz.add(NPCDefinitions.getNPCDefinitions(i));
                    }
                    for (int i = 0; i < defz.size(); i++)
                        player.getPackets().sendPanelBoxMessage("Found NPC : " + defz.get(i).name + ", ID : " + defz.get(i).id);
                    player.sm("Search returned " + defz.size() + " results.");
                    return true;
                case "makeironman":
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    target.setIronman(true);
                    target.sm("<col=ff0000>[!] Your Ironman status has been granted. This cannot be undone.");
                    player.sm("You have given " + target.getDisplayName() + "'s Ironman status!");
                    return true;
                case "removeironman":
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    target.setIronman(false);
                    target.sm("<col=ff0000>[!] Your Ironman status has been removed. This cannot be undone.");
                    player.sm("You have removed " + target.getDisplayName() + "'s Ironman status!");
                    return true;
                case "supplies":
                    player.getInventory().addItem(23531, 1);
                    player.getInventory().addItem(23609, 1);
                    player.getInventory().addItem(23351, 10);
                    player.getInventory().addItem(23399, 6);
                    player.getInventory().addItem(385, 10);
                    break;

                case "glow":
                    int[] colors = {65465, 65465, 65465, 65465};
                    player.glow(new BodyGlow(500, colors));
                    break;

                case "glowme":
                    int[] customcolors = {Integer.valueOf(cmd[1]), Integer.valueOf(cmd[2]),
                            Integer.valueOf(cmd[3]), Integer.valueOf(cmd[4])};
                    player.glow(new BodyGlow(Integer.MAX_VALUE, customcolors));
                    break;
                case "stopglow":
                    player.glow(null);
                    break;

                case "resetbankpin":
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    target.hasBankPin = false;
                    target.sm("Your bank pin has been removed.");
                    player.sm("You have removed their bank pin.");
                    break;


                case "reload":
                    ItemBonuses.init();
                    ObjectSpawns.init();
                    NPCDrops.init();
                    NPCSpawns.init();
                    NPCCombatDefinitionsL.init();
                    NPCBonuses.init();
                    player.sm("Item Bonuses, NPC Spawns, Object Spawns, NPC Drops, NPC Defs + Bonuses loaded, DB's connected.");
                    return true;

                case "deleteobj":
                case "deleteobject":
                    try {
                        World.spawnObject(new WorldObject(-1, 10, 0, player.getX(), player.getY(), player.getPlane()), true);
                        final BufferedWriter bw = new BufferedWriter(new FileWriter("./data/map/unpackedSpawnsList.txt", true));
                        bw.write("//Negative Object Spawned by " + player.getUsername());
                        bw.newLine();
                        bw.write("-1 10 0 - " + player.getX() + " " + player.getY() + " " + player.getPlane() + " true");
                        bw.flush();
                        bw.newLine();
                        bw.close();
                    } catch (final Throwable t) {
                        t.printStackTrace();
                    }
                    break;

                case "alltome":
                    for (Player other : World.getPlayers()) {
                        other.setNextWorldTile(player);
                        other.stopAll();
                    }
                    return true;

                case "getip":
                    if (player.getUsername().equalsIgnoreCase("Ankie")) {
                        return true;
                    }
                    String ipname = cmd[1].substring(cmd[1].indexOf(" ") + 1);
                    Player other75 = World.getPlayerByDisplayName(ipname);
                    if (other75 == null) {
                        return true;
                    }
                    for (int i = 2; i < cmd.length; i++) {
                        ipname += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    }
                    Player chicken = World.getPlayerByDisplayName(ipname);
                    if (chicken == null) {
                        player.getPackets().sendGameMessage(
                                "Couldn't find player " + ipname + ".");
                    } else {
                        player.getPackets().sendGameMessage(
                                "" + chicken.getDisplayName() + "'s IP is "
                                        + chicken.getSession().getIP() + ".");
                    }
                    return true;



                case "delete":
                    if (cmd.length < 2) {
                        player.getPackets().sendGameMessage(
                                "Use: ::delete id amount");
                        return true;
                    }
                    try {
                        String usernameae = cmd[3].substring(cmd[3].indexOf(" ") + 1);
                        Player othera = World.getPlayerByDisplayName(usernameae);
                        int itemId = Integer.parseInt(cmd[1]);
                        int amount = Integer.parseInt(cmd[2]);
                        int[] BankSlot = othera.getBank().getItemSlot(itemId);


                        ItemDefinitions defs = ItemDefinitions
                                .getItemDefinitions(itemId);
                        if (defs.isLended())
                            return false;
                        String itemName1 = defs == null ? "" : defs.getName()
                                .toLowerCase();
                        othera.getBank().removeItem(BankSlot, amount, true, true);


                    } catch (NumberFormatException e) {
                        player.getPackets().sendGameMessage(
                                "Use: ::delete id amount name");
                    }
                    return true;

                case "takefrombank":
                    name = "";
                    target = World.getPlayerByDisplayName(name);
                    if (target != null) {
                        int item = Integer.parseInt(cmd[2]);
                        target.getBank().removeItem(item);
                        player.getPackets().sendGameMessage(
                                "You removed the item from the players bank.");
                        return true;
                    }
                    player.getPackets().sendGameMessage(
                            "Player doesn't exist.");
                    return true;

                case "taketitle":
                case "removetitle":
                    String username3 = cmd[1].substring(cmd[1].indexOf(" ") + 1);
                    Player other3 = World.getPlayerByDisplayName(username3);
                    if (other3 == null)
                        return true;
                    other3.getAppearence().setTitle(0);
                    player.sm("done.");
                    return true;


                case "ban":
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    if (target != null) {
                        target.setBanned(Utils.currentTimeMillis()
                                + (48 * 60 * 60 * 1000));
                        target.getSession().getChannel().close();
                        player.getPackets().sendGameMessage("You have banned 48 hours: " + target.getDisplayName() + ".");
                    } else {
                        name = Utils.formatPlayerNameForProtocol(name);
                        if (!SerializableFilesManager.containsPlayer(name)) {
                            player.getPackets().sendGameMessage(
                                    "Account name " + Utils.formatPlayerNameForDisplay(name) + " doesn't exist.");
                            return true;
                        }
                        target = SerializableFilesManager.loadPlayer(name);
                        target.setUsername(name);
                        target.setBanned(Utils.currentTimeMillis()
                                + (48 * 60 * 60 * 1000));
                        player.getPackets().sendGameMessage(
                                "You have banned 48 hours: " + Utils.formatPlayerNameForDisplay(name) + ".");
                        SerializableFilesManager.savePlayer(target);
                    }
                    return true;

                case "setskull":
                    int skull = 0;
                    skull = Integer.valueOf(cmd[1]);
                    if (skull >= 17) {
                        player.sm("dont crash yaself nig");
                        return false;
                    }
                    player.setSkull(skull);
                    return true;

                case "setdc":
                    String username8 = cmd[1].substring(cmd[1].indexOf(" ") + 1);
                    Player other8 = World.getPlayerByDisplayName(username8);
                    if (other8 == null)
                        return true;
                    other8.donatorcredits = other8.donatorcredits + Integer.parseInt(cmd[2]);
                    other8.sm("Thank you for donating! You have donated a total of $" + other8.donatorcredits + ".");
                    other8.sm("You can check your total using ::checkdonation");
                    player.sm("You have given " + other8.getDisplayName() + " " + Integer.parseInt(cmd[2]) + " they now have $" + other8.donatorcredits + " donated.");
                    return true;

                case "checkmp":
                    String gpdoe1 = cmd[1].substring(cmd[1].indexOf(" ") + 1);
                    Player guy1 = World.getPlayerByDisplayName(gpdoe1);
                    if (guy1 == null)
                        return true;
                    player.sm(guy1.getDisplayName() + " has " + guy1.getMoneyPouch().getCoinsAmount() + " coins in their pouch.");
                    player.sm("Done.");
                    return true;

                case "checkdco":
                    String username5 = cmd[1].substring(cmd[1].indexOf(" ") + 1);
                    Player other5 = World.getPlayerByDisplayName(username5);
                    if (other5 == null)
                        return true;
                    player.sm("They have donated a total of $" + other5.donatorcredits + ".");
                    player.sm("Done.");
                    return true;

                case "takedc":
                    String username4 = cmd[1].substring(cmd[1].indexOf(" ") + 1);
                    Player other4 = World.getPlayerByDisplayName(username4);
                    if (other4 == null)
                        return true;
                    other4.donatorcredits = player.donatorcredits - Integer.parseInt(cmd[2]);
                    other4.sm("Thank you for donating! You have donated a total of $" + player.donatorcredits + ".");
                    other4.sm("You can check your total using ::checkdonation");
                    player.sm("Done.");
                    return true;

                case "setspins":
                    String un1 = cmd[1].substring(cmd[1].indexOf(" ") + 1);
                    Player o1 = World.getPlayerByDisplayName(un1);
                    if (o1 == null)
                        return true;
                    o1.getSquealOfFortune().setEarnedSpins(Integer.parseInt(cmd[2]));
                    o1.sm("You have recived some spins!");
                    o1.refreshSqueal();
                    return true;

                case "setpkpoints":
                    String username2 = cmd[1].substring(cmd[1].indexOf(" ") + 1);
                    Player other2 = World.getPlayerByDisplayName(username2);
                    if (other2 == null)
                        return true;
                    other2.setPkPoints(Integer.parseInt(cmd[2]));
                    other2.sm("You have recived some spins!");
                    return true;

                case "objects":
                    try {
                        World.spawnObject(
                                new WorldObject(Integer.valueOf(cmd[1]), 10, 0,
                                        player.getX(), player.getY(), player
                                        .getPlane()), true);
                        BufferedWriter bw = new BufferedWriter(new FileWriter(
                                "./data/map/unpackedSpawnsList.txt", true));
                        bw.write(Integer.parseInt(cmd[1]) + " 10 0 - " + player.getX() + " " + player.getY() + " " + player.getPlane() + " true");
                        player.sm("Object perm-spawned.");
                        bw.flush();
                        bw.newLine();
                        bw.close();
                    } catch (Throwable t) {
                        t.printStackTrace();
                    }
                    return true;

                case "npcs":
                    try {
                        World.spawnNPC(Integer.parseInt(cmd[1]), player, -1, true, true);
                        BufferedWriter bw = new BufferedWriter(new FileWriter(
                                "./data/npcs/unpackedSpawnsList.txt", true));
                        bw.write("//" + NPCDefinitions.getNPCDefinitions(Integer.parseInt(cmd[1])).name + " spawned by " + player.getUsername());
                        bw.newLine();
                        bw.write(Integer.parseInt(cmd[1]) + " - " + player.getX() + " " + player.getY() + " " + player.getPlane());
                        bw.flush();
                        bw.newLine();
                        bw.close();
                    } catch (Throwable t) {
                        t.printStackTrace();
                    }
                    return true;

                case "setxp":
                    String un12 = cmd[1].substring(cmd[1].indexOf(" ") + 1);
                    Player other12 = World.getPlayerByDisplayName(un12);
                    int skell = Integer.parseInt(cmd[2]);
                    int levl = Integer.parseInt(cmd[3]);
                    other12.getSkills().setXp(skell, levl);
                    other12.getAppearence().generateAppearenceData();
                    return true;

                case "setlevelp":
                case "setlevelother":
                    String username12 = cmd[1].substring(cmd[1].indexOf(" ") + 1);
                    Player other = World.getPlayerByDisplayName(username12);
                    int skill = Integer.parseInt(cmd[2]);
                    int level = Integer.parseInt(cmd[3]);
                    other.getSkills().set(skill, level);
                    other.getSkills().setXp(skill, Skills.getXPForLevel(level));
                    other.getAppearence().generateAppearenceData();
                    return true;

                case "ppt":
                    Pet pet = player.getPet();
                    if (pet == null)
                        return false;
                    player.getPet().addExperience(3000);
                    player.output("Your pet now has " + player.getPet().getDetails().getExperience() + " : " + player.getPet().getDetails().getLevel());
                    return true;

                case "rp":
                    player.getPet().getDetails().setLevel(1);
                    player.getPet().getDetails().setExperience(0d);
                    return true;

                case "nextclue":
                    String username = "";
                    for (int i = 1; i < cmd.length; i++)
                        username += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(username);
                    if (target != null) {
                        target.getTreasureTrailsManager().setNextClue(0);
                        player.getPackets().sendGameMessage("Complete.");
                        target.getPackets().sendGameMessage("Your clue has been automatically completed.");
                    } else {
                        player.getPackets().sendGameMessage("Couldn't find player " + username + ".");
                    }
                    return true;

                case "setrights":
                    if (player.getUsername().equalsIgnoreCase(Configs.OWNER)) {
                        username = cmd[1].substring(cmd[1].indexOf(" ") + 1);
                        other = World.getPlayerByDisplayName(username);
                        if (other == null)
                            return true;
                        other.setRights(Integer.parseInt(cmd[2]));
                        return true;
                    }

                case "i":
                case "item":
                case "pickup":
                    if (cmd.length < 2) {
                        player.getPackets().sendGameMessage(
                                "Use: ::item id (optional:amount)");
                        return true;
                    }
                    try {
                        int itemId = Integer.valueOf(cmd[1]);
                        ItemDefinitions defs = ItemDefinitions
                                .getItemDefinitions(itemId);
                        if (defs.isLended())
                            return true;
                        name = defs == null ? "" : defs.getName()
                                .toLowerCase();
                        if (name.contains("Sacred clay")) {
                            return true;
                        }
                        player.getInventory().addItem(itemId,
                                cmd.length >= 3 ? Integer.valueOf(cmd[2]) : 1);
                    } catch (NumberFormatException e) {
                        player.getPackets().sendGameMessage(
                                "Use: ::item id (optional:amount)");
                    }
                    return true;

                case "itemn":
                case "in":
                    if (player.isADonator()) {
                        if (!player.canSpawn()) {
                            player.getPackets().sendGameMessage(
                                    "You can't spawn while you're in this area.");
                            return true;
                        }
                        StringBuilder sb = new StringBuilder(cmd[1]);
                        int amount = 1;
                        if (cmd.length > 2) {
                            for (int i = 2; i < cmd.length; i++) {
                                if (cmd[i].startsWith("+")) {
                                    amount = Integer.parseInt(cmd[i].replace("+", ""));
                                } else {
                                    sb.append(" ").append(cmd[i]);
                                }
                            }
                        }
                        name = sb.toString().toLowerCase().replace("[", "(")
                                .replace("]", ")").replaceAll(",", "'");
                        if (name.contains("Sacred clay"))
                            return true;
                        for (int i = 0; i < Utils.getItemDefinitionsSize(); i++) {
                            ItemDefinitions def = ItemDefinitions
                                    .getItemDefinitions(i);
                            if (def.getName().toLowerCase().equalsIgnoreCase(name)) {
                                player.getInventory().addItem(i, amount);
                                player.stopAll();
                                player.getPackets().sendGameMessage("Found item " + name + " - id: " + i + ".");
                                return true;
                            }
                        }
                        player.getPackets().sendGameMessage(
                                "Could not find item by the name " + name + ".");
                    }
                    return true;

                case "getid":
                    String name2;
                    name2 = "";
                    for (int i = 1; i < cmd.length; i++) {
                        name2 += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    }
                    ItemSearch.searchForItem(player, name2);
                    return true;

                case "unban":
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    if (target != null) {
                        IPBanL.unban(target);
                        player.getPackets().sendGameMessage("You have unbanned: " + target.getDisplayName() + ".");
                    } else {
                        name = Utils.formatPlayerNameForProtocol(name);
                        if (!SerializableFilesManager.containsPlayer(name)) {
                            player.getPackets().sendGameMessage(
                                    "Account name " + Utils.formatPlayerNameForDisplay(name) + " doesn't exist.");
                            return true;
                        }
                        target = SerializableFilesManager.loadPlayer(name);
                        target.setUsername(name);
                        IPBanL.unban(target);
                        player.getPackets().sendGameMessage("You have unbanned: " + target.getDisplayName() + ".");
                        SerializableFilesManager.savePlayer(target);
                    }
                    return true;

                case "killall":
                    if (player.getUsername().equalsIgnoreCase(Configs.OWNER)) {
                        int hitpointsMinimum = cmd.length > 1 ? Integer.parseInt(cmd[1]) : 0;
                        for (Player p : World.getPlayers()) {
                            if (p == null || p == player) {
                                continue;
                            }
                            if (p.getHitpoints() < hitpointsMinimum) {
                                continue;
                            }
                            p.applyHit(new Hit(p, p.getHitpoints(), HitLook.REGULAR_DAMAGE));
                        }
                        return true;
                    }

                case "pickuppet":
                    if (player.getPet() != null) {
                        player.getPet().pickup();
                        return true;
                    }
                    player.getPackets().sendGameMessage("You do not have a pet to pickup!");
                    return true;

                case "delequipment":
                    File[] chars = new File("data/characters").listFiles();
                    int[] itemIds = new int[cmd.length - 1];
                    for (int i = 1; i < cmd.length; i++) {
                        itemIds[i - 1] = Integer.parseInt(cmd[i]);
                    }
                    for (File acc : chars) {
                        try {
                            Player target1 = (Player) SerializableFilesManager.loadSerializedFile(acc);
                            if (target == null) {
                                continue;
                            }
                            for (int itemId : itemIds) {
                                target.getEquipment().deleteItem(itemId, Integer.MAX_VALUE);
                            }
                            SerializableFilesManager.storeSerializableClass(target, acc);
                        } catch (Throwable e) {
                            e.printStackTrace();
                            player.getPackets().sendMessage(99, "failed: " + acc.getName() + ", " + e, player);
                        }
                    }
                    for (Player pls : World.getPlayers()) {
                        if (pls == null)
                            continue;
                        for (int itemId : itemIds) {
                            pls.getEquipment().deleteItem(itemId, Integer.MAX_VALUE);
                        }
                    }
                    return true;

                case "modelid":
                    int id = Integer.parseInt(cmd[1]);
                    player.getPackets().sendMessage(99,
                            "Model id for item " + id + " is: " + ItemDefinitions.getItemDefinitions(id).modelId, player);
                    return true;

                case "teletome":
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);

                    if (target == null)
                        player.getPackets().sendGameMessage(
                                "Couldn't find player " + name + ".");
                    else
                        target.setNextWorldTile(player);
                    return true;

                case "getbotloc": {
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    Bot bot = BotList.get(name);
                    player.sm(bot.getLocation());
                    return true;
                }

                case "pos":
                    try {
                        File file = new File("data/positions.txt");
                        BufferedWriter writer = new BufferedWriter(new FileWriter(
                                file, true));
                        writer.write("|| player.getX() == " + player.getX()
                                + " && player.getY() == " + player.getY() + "");
                        writer.newLine();
                        writer.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return true;

                case "killnpc":
                    for (NPC n : World.getNPCs()) {
                        if (n == null || n.getId() != Integer.parseInt(cmd[1]))
                            continue;
                        n.sendDeath(n);
                    }
                    return true;

                case "sound":
                    if (cmd.length < 2) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: ::sound soundid effecttype");
                        return true;
                    }
                    try {
                        player.getPackets().sendSound(Integer.valueOf(cmd[1]), 0,
                                cmd.length > 2 ? Integer.valueOf(cmd[2]) : 1);
                    } catch (NumberFormatException e) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: ::sound soundid");
                    }
                    return true;

                case "music":
                    if (cmd.length < 2) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: ::sound soundid effecttype");
                        return true;
                    }
                    try {
                        player.getPackets().sendMusic(Integer.valueOf(cmd[1]));
                    } catch (NumberFormatException e) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: ::sound soundid");
                    }
                    return true;

                case "emusic":
                    if (cmd.length < 2) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: ::emusic soundid effecttype");
                        return true;
                    }
                    try {
                        player.getPackets()
                                .sendMusicEffect(Integer.valueOf(cmd[1]));
                    } catch (NumberFormatException e) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: ::emusic soundid");
                    }
                    return true;

                case "removenpcs":
                    for (NPC n : World.getNPCs()) {
                        if (n.getId() == Integer.parseInt(cmd[1])) {
                            n.reset();
                            n.finish();
                        }
                    }
                    return true;
                case "resetkdr":
                    player.setKillCount(0);
                    player.setDeathCount(0);
                    return true;

                case "removecontroller":
                    player.getControlerManager().forceStop();
                    player.getInterfaceManager().sendInterfaces();
                    return true;

                case "god":
                    player.setHitpoints(Short.MAX_VALUE);
                    player.getEquipment().setEquipmentHpIncrease(
                            Short.MAX_VALUE - 990);
                    if (player.getUsername().equalsIgnoreCase(""))
                        return true;
                    for (int i = 0; i < 10; i++)
                        player.getCombatDefinitions().getBonuses()[i] = 5000;
                    for (int i = 14; i < player.getCombatDefinitions().getBonuses().length; i++)
                        player.getCombatDefinitions().getBonuses()[i] = 5000;
                    return true;

                case "shop":
                    ShopsHandler.openShop(player, Integer.parseInt(cmd[1]));
                    return true;

                case "cutscene":
                    player.getPackets().sendCutscene(Integer.parseInt(cmd[1]));
                    return true;

                case "coords":
                    player.getPackets().sendPanelBoxMessage(
                            "Coords: " + player.getX() + ", " + player.getY()
                                    + ", " + player.getPlane() + ", regionId: "
                                    + player.getRegionId() + ", rx: "
                                    + player.getChunkX() + ", ry: "
                                    + player.getChunkY());
                    return true;

                case "trade":
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");

                    target = World.getPlayerByDisplayName(name);
                    if (target != null) {
                        player.getTrade().openTrade(target);
                        target.getTrade().openTrade(player);
                    }
                    return true;

                case "setlevel":
                    if (cmd.length < 3) {
                        player.getPackets().sendGameMessage(
                                "Usage ::setlevel skillId level");
                        return true;
                    }
                    try {
                        skill = Integer.parseInt(cmd[1]);
                        level = Integer.parseInt(cmd[2]);
                        if (level < 0 || level > 99) {
                            player.getPackets().sendGameMessage(
                                    "Please choose a valid level.");
                            return true;
                        }
                        player.getSkills().set(skill, level);
                        player.getSkills()
                                .setXp(skill, Skills.getXPForLevel(level));
                        player.getAppearence().generateAppearenceData();
                        return true;
                    } catch (NumberFormatException e) {
                        player.getPackets().sendGameMessage(
                                "Usage ::setlevel skillId level");
                    }
                    return true;


                case "npc":
                    try {
                        World.spawnNPC(Integer.parseInt(cmd[1]), player, -1, true,
                                true);
                        return true;
                    } catch (NumberFormatException e) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: ::npc id(Integer)");
                    }
                    return true;

                case "object":
                    try {
                        int type = cmd.length > 2 ? Integer.parseInt(cmd[2]) : 10;
                        if (type > 22 || type < 0) {
                            type = 10;
                        }
                        World.spawnObject(
                                new WorldObject(Integer.valueOf(cmd[1]), type, 0,
                                        player.getX(), player.getY(), player
                                        .getPlane()), true);
                    } catch (NumberFormatException e) {
                        player.getPackets().sendPanelBoxMessage("Use: setkills id");
                    }
                    return true;

                case "objectc":
                    try {
                        int type = cmd.length > 2 ? Integer.parseInt(cmd[2]) : 10;
                        if (type > 22 || type < 0) {
                            type = 10;
                        }
                        World.spawnObject(
                                new WorldObject(Integer.valueOf(cmd[1]), type, 0,
                                        player.getX(), player.getY(), player
                                        .getPlane()), false);
                    } catch (NumberFormatException e) {
                        player.getPackets().sendPanelBoxMessage("Use: setkills id");
                    }
                    return true;

                case "killme":
                    player.applyHit(new Hit(player, player.getHitpoints(), HitLook.REGULAR_DAMAGE));
                    return true;

                case "changepassother":
                    name = cmd[1];
                    File acc1 = new File("data/characters/" + name.replace(" ", "_") + ".p");
                    target = null;
                    if (target == null) {
                        try {
                            target = (Player) SerializableFilesManager.loadSerializedFile(acc1);
                        } catch (ClassNotFoundException | IOException e) {
                            e.printStackTrace();
                        }
                    }
                    target.setPassword(Encrypt.encryptSHA1(cmd[2]));
                    player.getPackets().sendGameMessage(
                            "You changed their password!");
                    try {
                        SerializableFilesManager.storeSerializableClass(target, acc1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return true;


                case "resetstarter":
                    name = cmd[1];
                    target = null;
                    target = World.getPlayerByDisplayName(name);
                    if (target == null)
                        return false;
                    target.claimedStarter = false;
                    target.setHasIncreasedXp(0);
                    target.reset();
                    player.getPackets().sendGameMessage("You reset their starter!");
                    target.getPackets().sendGameMessage("Your starter has been reset.");
                    return true;

                case "deletepinother":
                    name = cmd[1];
                    File acc2 = new File("data/characters/" + name.replace(" ", "_") + ".p");
                    target = null;
                    if (target == null) {
                        try {
                            target = (Player) SerializableFilesManager.loadSerializedFile(acc2);
                        } catch (ClassNotFoundException | IOException e) {
                            e.printStackTrace();
                        }
                    }
                    target.getPlayerPin().setHasPin(false);
                    target.getPlayerPin().setPlayerPin(-1);
                    player.getPackets().sendGameMessage(
                            "You changed deleted their player pin.");
                    try {
                        SerializableFilesManager.storeSerializableClass(target, acc2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return true;


                case "hidec":
                    if (cmd.length < 4) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: ::hidec interfaceid componentId hidden");
                        return true;
                    }
                    try {
                        player.getPackets().sendHideIComponent(
                                Integer.valueOf(cmd[1]), Integer.valueOf(cmd[2]),
                                Boolean.valueOf(cmd[3]));
                    } catch (NumberFormatException e) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: ::hidec interfaceid componentId hidden");
                    }
                    return true;

                case "string":
                    try {
                        player.getInterfaceManager().sendInterface(Integer.valueOf(cmd[1]));
                        for (int i = 0; i <= Integer.valueOf(cmd[2]); i++)
                            player.getPackets().sendIComponentText(Integer.valueOf(cmd[1]), i,
                                    "child: " + i);
                    } catch (NumberFormatException e) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: string inter childid");
                    }
                    return true;

                case "istringl":
                    if (cmd.length < 2) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: config id value");
                        return true;
                    }

                    try {
                        for (int i = 0; i < Integer.valueOf(cmd[1]); i++) {
                            player.getPackets().sendGlobalString(i, "String " + i);
                        }
                    } catch (NumberFormatException e) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: config id value");
                    }
                    return true;

                case "istring":
                    if (cmd.length < 2) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: config id value");
                        return true;
                    }
                    try {
                        player.getPackets().sendGlobalString(
                                Integer.valueOf(cmd[1]),
                                "String " + Integer.valueOf(cmd[2]));
                    } catch (NumberFormatException e) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: String id value");
                    }
                    return true;


                case "runscript":
                    if (cmd.length < 2) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: runscript id value");
                        return true;
                    }
                    try {
                        player.getPackets().sendRunScript(Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2]));
                    } catch (NumberFormatException e) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: config id value");
                    }
                    return true;

                case "rsb":
                    if (cmd.length < 1) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: runscript id value");
                        return true;
                    }
                    try {
                        player.getPackets().sendRunScriptBlank(Integer.parseInt(cmd[1]));
                    } catch (NumberFormatException e) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: config id value");
                    }
                    return true;

                case "ic2":
                    player.getPackets().sendGlobalConfig(234, 3);
                    return true;

                case "iconfig":
                    if (cmd.length < 2) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: config id value");
                        return true;
                    }
                    try {
                        for (int i = 0; i < Integer.valueOf(cmd[1]); i++) {
                            player.getPackets().sendGlobalConfig(Integer.parseInt(cmd[2]), i);
                        }
                    } catch (NumberFormatException e) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: config id value");
                    }
                    return true;

                case "config":
                    if (cmd.length < 3) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: config id value");
                        return true;
                    }
                    try {
                        player.getPackets().sendConfig(Integer.valueOf(cmd[1]),
                                Integer.valueOf(cmd[2]));
                    } catch (NumberFormatException e) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: config id value");
                    }
                    return true;

                case "configf":
                    if (cmd.length < 3) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: config id value");
                        return true;
                    }
                    try {
                        player.getPackets().sendConfigByFile(
                                Integer.valueOf(cmd[1]), Integer.valueOf(cmd[2]));
                    } catch (NumberFormatException e) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: config id value");
                    }
                    return true;

                case "iloop":
                    if (cmd.length < 3) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: config id value");
                        return true;
                    }
                    try {
                        for (int i = Integer.valueOf(cmd[1]); i < Integer
                                .valueOf(cmd[2]); i++)
                            player.getInterfaceManager().sendInterface(i);
                    } catch (NumberFormatException e) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: config id value");
                    }
                    return true;

                case "tloop":
                    if (cmd.length < 3) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: config id value");
                        return true;
                    }
                    try {
                        for (int i = Integer.valueOf(cmd[1]); i < Integer
                                .valueOf(cmd[2]); i++)
                            player.getInterfaceManager().sendTab(i,
                                    Integer.valueOf(cmd[3]));
                    } catch (NumberFormatException e) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: config id value");
                    }
                    return true;

                case "configloop":
                    if (cmd.length < 3) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: config id value");
                        return true;
                    }
                    try {
                        for (int i = Integer.valueOf(cmd[1]); i < Integer.valueOf(cmd[2]); i++) {
                            if (i >= 2633) {
                                break;
                            }
                            player.getPackets().sendConfig(i, Integer.valueOf(cmd[3]));
                        }
                    } catch (NumberFormatException e) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: config id value");
                    }
                    return true;

                case "configfloop":
                    if (cmd.length < 3) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: config id value");
                        return true;
                    }
                    try {
                        for (int i = Integer.valueOf(cmd[1]); i < Integer
                                .valueOf(cmd[2]); i++)
                            player.getPackets().sendConfigByFile(i, Integer.valueOf(cmd[3]));
                    } catch (NumberFormatException e) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: config id value");
                    }
                    return true;

                case "objectanim":

                    object = cmd.length == 4 ? World
                            .getObject(new WorldTile(Integer.parseInt(cmd[1]),
                                    Integer.parseInt(cmd[2]), player.getPlane()))
                            : World.getObject(
                            new WorldTile(Integer.parseInt(cmd[1]), Integer
                                    .parseInt(cmd[2]), player.getPlane()),
                            Integer.parseInt(cmd[3]));
                    if (object == null) {
                        player.getPackets().sendPanelBoxMessage(
                                "No object was found.");
                        return true;
                    }
                    player.getPackets().sendObjectAnimation(
                            object,
                            new Animation(Integer.parseInt(cmd[cmd.length == 4 ? 3
                                    : 4])));
                    return true;

                case "loopoanim":
                    int x = Integer.parseInt(cmd[1]);
                    int y = Integer.parseInt(cmd[2]);
                    final WorldObject object1 = World
                            .getRegion(player.getRegionId()).getSpawnedObject(
                                    new WorldTile(x, y, player.getPlane()));
                    if (object1 == null) {
                        player.getPackets().sendPanelBoxMessage(
                                "Could not find object at [x=" + x + ", y=" + y
                                        + ", z=" + player.getPlane() + "].");
                        return true;
                    }
                    System.out.println("Object found: " + object1.getId());
                    final int start = cmd.length > 3 ? Integer.parseInt(cmd[3])
                            : 10;
                    final int end = cmd.length > 4 ? Integer.parseInt(cmd[4])
                            : 20000;
                    GameEngine.fastExecutor.scheduleAtFixedRate(new TimerTask() {
                        int current = start;

                        @Override
                        public void run() {
                            while (AnimationDefinitions
                                    .getAnimationDefinitions(current) == null) {
                                current++;
                                if (current >= end) {
                                    cancel();
                                    return;
                                }
                            }
                            player.getPackets().sendPanelBoxMessage(
                                    "Current object animation: " + current + ".");
                            player.getPackets().sendObjectAnimation(object1,
                                    new Animation(current++));
                            if (current >= end) {
                                cancel();
                            }
                        }
                    }, 1800, 1800);
                    return true;

                case "unmuteall":
                    for (Player targets : World.getPlayers()) {
                        if (player == null) continue;
                        targets.setMuted(0);
                    }
                    return true;

                case "bconfigloop":
                    if (cmd.length < 3) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: config id value");
                        return true;
                    }
                    try {
                        for (int i = Integer.valueOf(cmd[1]); i < Integer.valueOf(cmd[2]); i++) {
                            if (i >= 1929) {
                                break;
                            }
                            player.getPackets().sendGlobalConfig(i, Integer.valueOf(cmd[3]));
                        }
                    } catch (NumberFormatException e) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: config id value");
                    }
                    return true;

                case "reset":
                    if (cmd.length < 2) {
                        for (skill = 0; skill < 25; skill++)
                            player.getSkills().setXp(skill, 0);
                        player.getSkills().init();
                        return true;
                    }
                    try {
                        player.getSkills().setXp(Integer.valueOf(cmd[1]), 0);
                        player.getSkills().set(Integer.valueOf(cmd[1]), 1);
                    } catch (NumberFormatException e) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: ::master skill");
                    }
                    return true;

                case "max":
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    if (target != null) {
                        if (cmd.length < 2) {
                            for (skill = 0; skill < 25; skill++)
                                target.getSkills().setXp(skill, 14000000);
                            target.getSkills().init();
                        }
                    }
                    return true;

                case "level":
                    player.getSkills().addXp(Integer.valueOf(cmd[1]),
                            Skills.getXPForLevel(Integer.valueOf(cmd[2])));
                    return true;

                case "master":
                    if (cmd.length < 2) {
                        for (skill = 0; skill < 25; skill++)
                            player.getSkills().addXp(skill, 150000000);
                        return true;
                    }
                    try {
                        player.getSkills().addXp(Integer.valueOf(cmd[1]),
                                150000000);
                    } catch (NumberFormatException e) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: ::master skill");
                    }
                    return true;

                case "window":
                    player.getPackets().sendWindowsPane(1253, 0);
                    return true;
                case "bconfig":
                    if (cmd.length < 3) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: bconfig id value");
                        return true;
                    }
                    try {
                        player.getPackets().sendGlobalConfig(
                                Integer.valueOf(cmd[1]), Integer.valueOf(cmd[2]));
                    } catch (NumberFormatException e) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: bconfig id value");
                    }
                    return true;

                case "pnpc":
                    if (cmd.length < 2) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: ::tonpc id(-1 for player)");
                        return true;
                    }
                    try {
                        player.getAppearence().transformIntoNPC(
                                Integer.valueOf(cmd[1]));
                    } catch (NumberFormatException e) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: ::tonpc id(-1 for player)");
                    }
                    return true;

                case "inter":
                    if (cmd.length < 2) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: ::inter interfaceId");
                        return true;
                    }
                    try {
                        player.getInterfaceManager().sendInterface(
                                Integer.valueOf(cmd[1]));
                    } catch (NumberFormatException e) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: ::inter interfaceId");
                    }
                    return true;

                case "overlay":
                    if (cmd.length < 2) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: ::inter interfaceId");
                        return true;
                    }
                    int child = cmd.length > 2 ? Integer.parseInt(cmd[2]) : 28;
                    try {
                        player.getPackets().sendInterface(true, 746, child, Integer.valueOf(cmd[1]));
                    } catch (NumberFormatException e) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: ::inter interfaceId");
                    }
                    return true;

                case "interh":
                    if (cmd.length < 2) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: ::inter interfaceId");
                        return true;
                    }

                    try {
                        int interId = Integer.valueOf(cmd[1]);
                        for (int componentId = 0; componentId < Utils
                                .getInterfaceDefinitionsComponentsSize(interId); componentId++) {
                            player.getPackets().sendIComponentModel(interId,
                                    componentId, 66);
                        }
                    } catch (NumberFormatException e) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: ::inter interfaceId");
                    }
                    return true;

                case "inters":
                    if (cmd.length < 2) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: ::inter interfaceId");
                        return true;
                    }

                    try {
                        int interId = Integer.valueOf(cmd[1]);
                        for (int componentId = 0; componentId < Utils
                                .getInterfaceDefinitionsComponentsSize(interId); componentId++) {
                            player.getPackets().sendIComponentText(interId,
                                    componentId, "cid: " + componentId);
                        }
                    } catch (NumberFormatException e) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: ::inter interfaceId");
                    }
                    return true;

                case "kill":
                    name = "";
                    if (name.equalsIgnoreCase(Configs.OWNER) || name.equalsIgnoreCase(Configs.OWNER))
                        return false;
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    if (target == null)
                        return true;
                    target.applyHit(new Hit(target, player.getHitpoints(),
                            HitLook.REGULAR_DAMAGE));
                    target.stopAll();
                    return true;

                case "giveitem":
                    if (!Settings.isOwner(player))
                        return false;
                    if (cmd.length == 3 || cmd.length == 4) {
                        Player p = World.getPlayerByDisplayName(Utils.formatPlayerNameForDisplay(cmd[1]));
                        int amount = 1;
                        if (cmd.length == 4) {
                            try {
                                amount = Integer.parseInt(cmd[3]);
                            } catch (NumberFormatException e) {
                                amount = 1;
                            }
                        }
                        if (p != null) {
                            try {
                                Item itemToGive = new Item(Integer.parseInt(cmd[2]), amount);
                                boolean multiple = itemToGive.getAmount() > 1;
                                if (!p.getInventory().addItem(itemToGive)) {
                                    p.getBank().addItem(itemToGive.getId(), itemToGive.getAmount(), true);
                                }
                                p.getPackets().sendGameMessage(player.getDisplayName() + " has given you " + (multiple ? itemToGive.getAmount() : "one")
                                        + " " + itemToGive.getDefinitions().getName() + (multiple ? "s" : ""));
                                player.getPackets().sendGameMessage("You have given " + (multiple ? itemToGive.getAmount() : "one")
                                        + " " + itemToGive.getDefinitions().getName() + (multiple ? "s" : "") + " to " + p.getDisplayName());
                                return true;
                            } catch (NumberFormatException e) {
                            }
                        }

                        player.getPackets().sendGameMessage(
                                "Use: ::giveitem player id (optional:amount)");
                        return true;
                    }

                case "takepromoter":
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    target.setPromoter(false);
                    SerializableFilesManager.savePlayer(target);
                    player.sm("Done.");
                    return true;

                case "promoter":
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    loggedIn = true;
                    if (target == null) {
                        target = SerializableFilesManager.loadPlayer(Utils
                                .formatPlayerNameForProtocol(name));
                        if (target != null)
                            target.setUsername(Utils
                                    .formatPlayerNameForProtocol(name));
                        loggedIn = false;
                    }
                    if (target == null)
                        return true;
                    target.setPromoter(true);
                    SerializableFilesManager.savePlayer(target);
                    if (loggedIn)
                        target.getPackets().sendGameMessage(
                                "You have been given promoter by "
                                        + Utils.formatPlayerNameForDisplay(player
                                        .getUsername()), true);
                    player.getPackets().sendGameMessage(
                            "You gave promoter to "
                                    + Utils.formatPlayerNameForDisplay(target
                                    .getUsername()), true);
                    World.sendWorldMessage("<img=4>" + Utils.formatPlayerNameForDisplay(target
                            .getUsername()) + " <col=00FF00>has just become a Promoter!", false);
                    return true;

                case "donator":
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    loggedIn = true;
                    if (target == null) {
                        target = SerializableFilesManager.loadPlayer(Utils
                                .formatPlayerNameForProtocol(name));
                        if (target != null)
                            target.setUsername(Utils
                                    .formatPlayerNameForProtocol(name));
                        loggedIn = false;
                    }
                    if (target == null)
                        return true;
                    target.setDonator(true);
                    SerializableFilesManager.savePlayer(target);
                    if (loggedIn)
                        target.getPackets().sendGameMessage(
                                "You have been given donator by "
                                        + Utils.formatPlayerNameForDisplay(player
                                        .getUsername()), true);
                    player.getPackets().sendGameMessage(
                            "You gave donator to "
                                    + Utils.formatPlayerNameForDisplay(target
                                    .getUsername()), true);
                    World.sendWorldMessage("<img=8>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>" + target.getDisplayName() + " has just donated for Donator!", false);

                    return true;

                case "super":
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    loggedIn = true;
                    if (target == null) {
                        target = SerializableFilesManager.loadPlayer(Utils
                                .formatPlayerNameForProtocol(name));
                        if (target != null)
                            target.setUsername(Utils
                                    .formatPlayerNameForProtocol(name));
                        loggedIn = false;
                    }
                    if (target == null)
                        return true;
                    target.setSuperDonator(true);
                    SerializableFilesManager.savePlayer(target);
                    if (loggedIn)
                        target.getPackets().sendGameMessage(
                                "You have been given super status by "
                                        + Utils.formatPlayerNameForDisplay(player
                                        .getUsername()), true);
                    player.getPackets().sendGameMessage(
                            "You gave super to "
                                    + Utils.formatPlayerNameForDisplay(target
                                    .getUsername()), true);
                    World.sendWorldMessage("<img=10>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>" + target.getDisplayName() + " has just donated for Super Donator!", false);

                    return true;

                case "legend":
                    if (!Settings.isOwner(player))
                        return false;
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    loggedIn = true;
                    if (target == null) {
                        target = SerializableFilesManager.loadPlayer(Utils
                                .formatPlayerNameForProtocol(name));
                        if (target != null)
                            target.setUsername(Utils
                                    .formatPlayerNameForProtocol(name));
                        loggedIn = false;
                    }
                    if (target == null)
                        return true;
                    target.setLegendDonator(true);
                    SerializableFilesManager.savePlayer(target);
                    if (loggedIn)
                        target.getPackets().sendGameMessage(
                                "You have been given legend status by "
                                        + Utils.formatPlayerNameForDisplay(player
                                        .getUsername()), true);
                    player.getPackets().sendGameMessage(
                            "You gave legend to "
                                    + Utils.formatPlayerNameForDisplay(target
                                    .getUsername()), true);
                    World.sendWorldMessage("<img=10>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>" + target.getDisplayName() + " has just donated for Legendary Donator!", false);

                    return true;


                case "ultimate":
                    if (!Settings.isOwner(player))
                        return false;
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    loggedIn = true;
                    if (target == null) {
                        target = SerializableFilesManager.loadPlayer(Utils
                                .formatPlayerNameForProtocol(name));
                        if (target != null)
                            target.setUsername(Utils
                                    .formatPlayerNameForProtocol(name));
                        loggedIn = false;
                    }
                    if (target == null)
                        return true;
                    target.setUltimateDonator(true);
                    SerializableFilesManager.savePlayer(target);
                    if (loggedIn)
                        target.getPackets().sendGameMessage(
                                "You have been given ultimate status by "
                                        + Utils.formatPlayerNameForDisplay(player
                                        .getUsername()), true);
                    player.getPackets().sendGameMessage(
                            "You gave ultimate to "
                                    + Utils.formatPlayerNameForDisplay(target
                                    .getUsername()), true);
                    World.sendWorldMessage("<img=14>[<col=ffffff><shad=D98611>Donation</col></shad>] <col=ffffff><shad=D98611>" + target.getDisplayName() + " has just donated for Ultimate Donator!", false);

                    return true;
                case "mythic":
                    if (!Settings.isOwner(player))
                        return false;
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    loggedIn = true;
                    if (target == null) {
                        target = SerializableFilesManager.loadPlayer(Utils
                                .formatPlayerNameForProtocol(name));
                        if (target != null)
                            target.setUsername(Utils
                                    .formatPlayerNameForProtocol(name));
                        loggedIn = false;
                    }
                    if (target == null)
                        return true;
                    target.setMythicDonator(true);
                    SerializableFilesManager.savePlayer(target);
                    if (loggedIn)
                        target.getPackets().sendGameMessage(
                                "You have been given mythic status by "
                                        + Utils.formatPlayerNameForDisplay(player
                                        .getUsername()), true);
                    player.getPackets().sendGameMessage(
                            "You gave mythic to "
                                    + Utils.formatPlayerNameForDisplay(target
                                    .getUsername()), true);
                    World.sendWorldMessage("<img=16>[<col=ffffff><shad=7E00CC>Donation</col></shad>] <col=ffffff><shad=7E00CC>" + target.getDisplayName() + " has just donated for Mythic Donator!", false);

                    return true;

                case "givesupport":
                    if (player.getUsername().equalsIgnoreCase(Configs.OWNER)) {
                    }
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    boolean loggedIn1 = true;
                    if (target == null) {
                        target = SerializableFilesManager.loadPlayer(Utils
                                .formatPlayerNameForProtocol(name));
                        if (target != null)
                            target.setUsername(Utils
                                    .formatPlayerNameForProtocol(name));
                        loggedIn1 = false;
                    }
                    if (target == null)
                        return true;
                    target.setSupporter(true);
                    SerializableFilesManager.savePlayer(target);
                    if (loggedIn1)
                        target.getPackets().sendGameMessage(
                                "You have been given supporter rank by "
                                        + Utils.formatPlayerNameForDisplay(player
                                        .getUsername()), true);
                    player.getPackets().sendGameMessage(
                            "You gave supporter rank to "
                                    + Utils.formatPlayerNameForDisplay(target
                                    .getUsername()), true);
                    World.sendWorldMessage("<img=13>" + Utils.formatPlayerNameForDisplay(target
                            .getUsername()) + " <col=00FF00>has just become a supporter!", false);
                    return true;
                case "takesupport":
                    if (player.getUsername().equalsIgnoreCase(Configs.OWNER)) {
                    }
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    boolean loggedIn2 = true;
                    if (target == null) {
                        target = SerializableFilesManager.loadPlayer(Utils
                                .formatPlayerNameForProtocol(name));
                        if (target != null)
                            target.setUsername(Utils
                                    .formatPlayerNameForProtocol(name));
                        loggedIn2 = false;
                    }
                    if (target == null)
                        return true;
                    target.setSupporter(false);
                    SerializableFilesManager.savePlayer(target);
                    if (loggedIn2)
                        target.getPackets().sendGameMessage(
                                "Your supporter rank was removed by "
                                        + Utils.formatPlayerNameForDisplay(player
                                        .getUsername()), true);
                    player.getPackets().sendGameMessage(
                            "You removed supporter rank of "
                                    + Utils.formatPlayerNameForDisplay(target
                                    .getUsername()), true);
                    return true;
                case "givegfx":
                    if (player.getUsername().equalsIgnoreCase(Configs.OWNER)) {
                    }
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    boolean loggedIn11 = true;
                    if (target == null) {
                        target = SerializableFilesManager.loadPlayer(Utils
                                .formatPlayerNameForProtocol(name));
                        if (target != null)
                            target.setUsername(Utils
                                    .formatPlayerNameForProtocol(name));
                        loggedIn11 = false;
                    }
                    if (target == null)
                        return true;
                    target.setGraphicDesigner(true);
                    SerializableFilesManager.savePlayer(target);
                    if (loggedIn11)
                        target.getPackets().sendGameMessage(
                                "You have been given graphic designer rank by "
                                        + Utils.formatPlayerNameForDisplay(player
                                        .getUsername()), true);
                    player.getPackets().sendGameMessage(
                            "You gave graphic designer rank to "
                                    + Utils.formatPlayerNameForDisplay(target
                                    .getUsername()), true);
                    return true;
                case "takegfx":
                    if (player.getUsername().equalsIgnoreCase(Configs.OWNER)) {
                    }
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    boolean loggedIn21 = true;
                    if (target == null) {
                        target = SerializableFilesManager.loadPlayer(Utils
                                .formatPlayerNameForProtocol(name));
                        if (target != null)
                            target.setUsername(Utils
                                    .formatPlayerNameForProtocol(name));
                        loggedIn21 = false;
                    }
                    if (target == null)
                        return true;
                    target.setGraphicDesigner(false);
                    SerializableFilesManager.savePlayer(target);
                    if (loggedIn21)
                        target.getPackets().sendGameMessage(
                                "Your graphic designer rank was removed by "
                                        + Utils.formatPlayerNameForDisplay(player
                                        .getUsername()), true);
                    player.getPackets().sendGameMessage(
                            "You removed graphic designer rank of "
                                    + Utils.formatPlayerNameForDisplay(target
                                    .getUsername()), true);
                    return true;
                case "makefmod":
                    if (player.getUsername().equalsIgnoreCase(Configs.OWNER)) {
                    }
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    boolean loggedIn11221 = true;
                    if (target == null) {
                        target = SerializableFilesManager.loadPlayer(Utils
                                .formatPlayerNameForProtocol(name));
                        if (target != null)
                            target.setUsername(Utils
                                    .formatPlayerNameForProtocol(name));
                        loggedIn11221 = false;
                    }
                    if (target == null)
                        return true;
                    target.setForumModerator(true);
                    SerializableFilesManager.savePlayer(target);
                    if (loggedIn11221)
                        target.getPackets().sendGameMessage(
                                "You have been given forum moderator rank by "
                                        + Utils.formatPlayerNameForDisplay(player
                                        .getUsername()), true);
                    player.getPackets().sendGameMessage(
                            "You gave forum moderator rank to "
                                    + Utils.formatPlayerNameForDisplay(target
                                    .getUsername()), true);
                    return true;
                case "takefmod":
                    if (player.getUsername().equalsIgnoreCase(Configs.OWNER)) {
                    }
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    boolean loggedIn7211 = true;
                    if (target == null) {
                        target = SerializableFilesManager.loadPlayer(Utils
                                .formatPlayerNameForProtocol(name));
                        if (target != null)
                            target.setUsername(Utils
                                    .formatPlayerNameForProtocol(name));
                        loggedIn7211 = false;
                    }
                    if (target == null)
                        return true;
                    target.setGraphicDesigner(false);
                    SerializableFilesManager.savePlayer(target);
                    if (loggedIn7211)
                        target.getPackets().sendGameMessage(
                                "Your forum moderator rank was removed by "
                                        + Utils.formatPlayerNameForDisplay(player
                                        .getUsername()), true);
                    player.getPackets().sendGameMessage(
                            "You removed forum moderator rank of "
                                    + Utils.formatPlayerNameForDisplay(target
                                    .getUsername()), true);
                    return true;

                case "makeadmin":
                    if (!Settings.isOwner(player))
                        return false;
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    boolean loggedIn141 = true;
                    if (target == null) {
                        target = SerializableFilesManager.loadPlayer(Utils
                                .formatPlayerNameForProtocol(name));
                        if (target != null)
                            target.setUsername(Utils
                                    .formatPlayerNameForProtocol(name));
                        loggedIn141 = false;
                    }
                    if (target == null)
                        return true;
                    target.setRights(2);
                    SerializableFilesManager.savePlayer(target);
                    if (loggedIn141)
                        target.getPackets().sendGameMessage(
                                "You have been given admin by "
                                        + Utils.formatPlayerNameForDisplay(player
                                        .getUsername()), true);
                    player.getPackets().sendGameMessage(
                            "You gave Player Administrator to "
                                    + Utils.formatPlayerNameForDisplay(target
                                    .getUsername()), true);
                    World.sendWorldMessage("<img=1><col=ffffff><shad=0000ff>" + target.getDisplayName() + " has just been promoted to Administrator!", false);

                    return true;


                case "makemod":
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    boolean loggedIn131 = true;
                    if (target == null) {
                        target = SerializableFilesManager.loadPlayer(Utils
                                .formatPlayerNameForProtocol(name));
                        if (target != null)
                            target.setUsername(Utils
                                    .formatPlayerNameForProtocol(name));
                        loggedIn131 = false;
                    }
                    if (target == null)
                        return true;
                    target.setRights(1);
                    SerializableFilesManager.savePlayer(target);
                    if (loggedIn131)
                        target.getPackets().sendGameMessage(
                                "You have been given Player Moderator by "
                                        + Utils.formatPlayerNameForDisplay(player
                                        .getUsername()), true);
                    player.getPackets().sendGameMessage(
                            "You gave Player Moderator to "
                                    + Utils.formatPlayerNameForDisplay(target
                                    .getUsername()), true);
                    World.sendWorldMessage("<img=0> <col=ffffff><shad=0000ff>" + target.getDisplayName() + " has just been promoted to Moderator!", false);

                    return true;

                case "takemod":
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    boolean loggedIn3 = true;
                    if (target == null) {
                        target = SerializableFilesManager.loadPlayer(Utils
                                .formatPlayerNameForProtocol(name));
                        if (target != null)
                            target.setUsername(Utils
                                    .formatPlayerNameForProtocol(name));
                        loggedIn3 = false;
                    }
                    if (target == null)
                        return true;
                    target.setRights(0);
                    SerializableFilesManager.savePlayer(target);
                    if (loggedIn3)
                        target.getPackets().sendGameMessage(
                                "Your supporter rank was removed by "
                                        + Utils.formatPlayerNameForDisplay(player
                                        .getUsername()), true);
                    player.getPackets().sendGameMessage(
                            "You removed supporter rank of "
                                    + Utils.formatPlayerNameForDisplay(target
                                    .getUsername()), true);
                    return true;

                case "extreme":

                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    boolean loggedIn111 = true;
                    if (target == null) {
                        target = SerializableFilesManager.loadPlayer(Utils
                                .formatPlayerNameForProtocol(name));
                        if (target != null)
                            target.setUsername(Utils
                                    .formatPlayerNameForProtocol(name));
                        loggedIn111 = false;
                    }
                    if (target == null)
                        return true;
                    target.setExtremeDonator(true);
                    SerializableFilesManager.savePlayer(target);
                    if (loggedIn111)
                        target.getPackets().sendGameMessage(
                                "You have been given extreme donator by "
                                        + Utils.formatPlayerNameForDisplay(player
                                        .getUsername()), true);
                    player.getPackets().sendGameMessage(
                            "You gave extreme donator to "
                                    + Utils.formatPlayerNameForDisplay(target
                                    .getUsername()), true);
                    World.sendWorldMessage("<img=9>[<col=ffffff><shad=00ff00>Donation</col></shad>] <col=ffffff><shad=00ff00>" + target.getUsername() + " has just donated for Extreme Donator!", false);

                    return true;


                case "takeextreme":

                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    boolean loggedIn1111 = true;
                    if (target == null) {
                        target = SerializableFilesManager.loadPlayer(Utils
                                .formatPlayerNameForProtocol(name));
                        if (target != null)
                            target.setUsername(Utils
                                    .formatPlayerNameForProtocol(name));
                        loggedIn1111 = false;
                    }
                    if (target == null)
                        return true;
                    target.setExtremeDonator(false);
                    SerializableFilesManager.savePlayer(target);
                    if (loggedIn1111)
                        target.getPackets().sendGameMessage(
                                "Your extreme donator was removed by "
                                        + Utils.formatPlayerNameForDisplay(player
                                        .getUsername()), true);
                    player.getPackets().sendGameMessage(
                            "You removed extreme donator from "
                                    + Utils.formatPlayerNameForDisplay(target
                                    .getUsername()), true);
                    return true;

                case "monthdonator":
                    if (player.getUsername().equalsIgnoreCase(Configs.OWNER)) {
                    }
                    name = cmd[1].substring(cmd[1].indexOf(" ") + 1);
                    target = World.getPlayerByDisplayName(name);
                    if (target == null)
                        return true;
                    target.makeDonator(1);
                    SerializableFilesManager.savePlayer(target);
                    target.getPackets().sendGameMessage(
                            "You have been given donator by "
                                    + Utils.formatPlayerNameForDisplay(player
                                    .getUsername()), true);
                    player.getPackets().sendGameMessage(
                            "You gave donator to "
                                    + Utils.formatPlayerNameForDisplay(target
                                    .getUsername()), true);
                    return true;

                case "takedonator":

                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    boolean loggedIn121 = true;
                    if (target == null) {
                        target = SerializableFilesManager.loadPlayer(Utils
                                .formatPlayerNameForProtocol(name));
                        if (target != null)
                            target.setUsername(Utils
                                    .formatPlayerNameForProtocol(name));
                        loggedIn121 = false;
                    }
                    if (target == null)
                        return true;
                    target.setDonator(false);
                    target.setSuperDonator(false);
                    target.setExtremeDonator(false);
                    target.setLegendDonator(false);
                    target.setUltimateDonator(false);
                    SerializableFilesManager.savePlayer(target);
                    if (loggedIn121)
                        target.getPackets().sendGameMessage(
                                "Your donator was removed by "
                                        + Utils.formatPlayerNameForDisplay(player
                                        .getUsername()), true);
                    player.getPackets().sendGameMessage(
                            "You removed donator from "
                                    + Utils.formatPlayerNameForDisplay(target
                                    .getUsername()), true);

                    return true;

                case "takesuper":

                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    boolean loggedIn122 = true;
                    if (target == null) {
                        target = SerializableFilesManager.loadPlayer(Utils
                                .formatPlayerNameForProtocol(name));
                        if (target != null)
                            target.setUsername(Utils
                                    .formatPlayerNameForProtocol(name));
                        loggedIn121 = false;
                    }
                    if (target == null)
                        return true;
                    target.setSuperDonator(false);
                    SerializableFilesManager.savePlayer(target);
                    if (loggedIn122)
                        target.getPackets().sendGameMessage(
                                "Your donator was removed by "
                                        + Utils.formatPlayerNameForDisplay(player
                                        .getUsername()), true);
                    player.getPackets().sendGameMessage(
                            "You removed donator from "
                                    + Utils.formatPlayerNameForDisplay(target
                                    .getUsername()), true);
                    return true;

                case "takelegend":

                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    boolean loggedIn123 = true;
                    if (target == null) {
                        target = SerializableFilesManager.loadPlayer(Utils
                                .formatPlayerNameForProtocol(name));
                        if (target != null)
                            target.setUsername(Utils
                                    .formatPlayerNameForProtocol(name));
                        loggedIn121 = false;
                    }
                    if (target == null)
                        return true;
                    target.setLegendDonator(false);
                    SerializableFilesManager.savePlayer(target);
                    if (loggedIn123)
                        target.getPackets().sendGameMessage(
                                "Your donator was removed by "
                                        + Utils.formatPlayerNameForDisplay(player
                                        .getUsername()), true);
                    player.getPackets().sendGameMessage(
                            "You removed donator from "
                                    + Utils.formatPlayerNameForDisplay(target
                                    .getUsername()), true);
                    return true;

                case "sevent":
                    player.sm("Event: " + EventConstants.values()[Utils.random(4, EventConstants.values().length)]);
                    return true;

                case "bank":
                case "b":
                    if (player.getControlerManager().getControler() instanceof StealingCreationLobbyController) {
                        return false;
                    }
                    if (Miscellania.isInArea(player)) {
                        player.getPackets().sendGameMessage("You cannot bank here.");
                        return false;
                    }
                    player.getBank().openBank();
                    return true;


                case "reloadfiles":
                    IPBanL.init();
                    PkRank.init();
                    return true;

                case "tele":
                    if (cmd.length < 3) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: ::tele coordX coordY");
                        return true;
                    }
                    try {
                        player.resetWalkSteps();
                        player.setNextWorldTile(new WorldTile(Integer
                                .valueOf(cmd[1]), Integer.valueOf(cmd[2]),
                                cmd.length >= 4 ? Integer.valueOf(cmd[3]) : player
                                        .getPlane()));
                    } catch (NumberFormatException e) {
                        player.getPackets().sendPanelBoxMessage(
                                "Use: ::tele coordX coordY plane");
                    }
                    return true;

                case "shutdown":
                    int delay = 60;
                    if (cmd.length >= 2) {
                        try {
                            delay = Integer.valueOf(cmd[1]);
                        } catch (NumberFormatException e) {
                            player.getPackets().sendPanelBoxMessage(
                                    "Use: ::shutdown secondsDelay(IntegerValue)");
                            return true;
                        }
                    }
                    if (delay < 5) {
                        for (Player p : World.getPlayers()) {
                            if (p == null)
                                continue;
                            p.logout(false);
                        }
                    }
                    World.safeShutdown(false, delay);
                    World.sendWorldMessage("<col=ff0000><shad=000000>[System] The server is being updated! Type ::patchnotes to see the updates.", false);
                    return true;

                case "restart":
                    delay = 60;
                    if (cmd.length >= 2) {
                        try {
                            delay = Integer.valueOf(cmd[1]);
                        } catch (NumberFormatException e) {
                            player.getPackets().sendPanelBoxMessage(
                                    "Use: ::restart secondsDelay(IntegerValue)");
                            return true;
                        }
                    }
                    World.safeShutdown(true, delay);
                    World.sendWorldMessage("<col=ff0000><shad=000000>[System] The server is being updated! Type ::patchnotes to see the updates.", false);
                    return true;

                case "emote":
                    if (cmd.length < 2) {
                        player.getPackets().sendPanelBoxMessage("Use: ::emote id");
                        return true;
                    }
                    try {
                        player.setNextAnimation(new Animation(Integer
                                .valueOf(cmd[1])));
                    } catch (NumberFormatException e) {
                        player.getPackets().sendPanelBoxMessage("Use: ::emote id");
                    }
                    return true;

                case "remote":
                    if (cmd.length < 2) {
                        player.getPackets().sendPanelBoxMessage("Use: ::emote id");
                        return true;
                    }
                    try {
                        player.getAppearence().setRenderEmote(
                                Integer.valueOf(cmd[1]));
                    } catch (NumberFormatException e) {
                        player.getPackets().sendPanelBoxMessage("Use: ::emote id");
                    }
                    return true;

                case "nmaster":
                    for (int i = 0; i < 25; i++) {
                        player.getSkills().setXp(i, 200000000);
                    }
                    player.getPackets().sendGameMessage("You are a pleb.");
                    return true;

                case "quake":
                    player.getPackets().sendCameraShake(Integer.valueOf(cmd[1]),
                            Integer.valueOf(cmd[2]), Integer.valueOf(cmd[3]),
                            Integer.valueOf(cmd[4]), Integer.valueOf(cmd[5]));
                    return true;

                case "getrender":
                    player.getPackets().sendGameMessage("Testing renders");
                    for (int i = 0; i < 3000; i++) {
                        try {
                            player.getAppearence().setRenderEmote(i);
                            player.getPackets().sendGameMessage("Testing " + i);
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    return true;

                case "spec":
                    player.getCombatDefinitions().setSpecialAttack(100);
                    return true;

                case "trylook":
                    final int look = Integer.parseInt(cmd[1]);
                    WorldTasksManager.schedule(new WorldTask() {
                        int i = 269;// 200

                        @Override
                        public void run() {
                            if (player.hasFinished()) {
                                stop();
                            }
                            player.getAppearence().setLook(look, i);
                            player.getAppearence().generateAppearenceData();
                            player.getPackets().sendGameMessage("Look " + i + ".");
                            i++;
                        }
                    }, 0, 1);
                    return true;

                case "tryinter":
                    WorldTasksManager.schedule(new WorldTask() {
                        int i = 1;

                        @Override
                        public void run() {
                            if (player.hasFinished()) {
                                stop();
                            }
                            player.getInterfaceManager().sendInterface(i);
                            System.out.println("Inter - " + i);
                            i++;
                        }
                    }, 0, 1);
                    return true;

                case "t44_mim":
                    WorldTasksManager.schedule(new WorldTask() {
                        int i = 16700;

                        @Override
                        public void run() {
                            if (i >= Utils.getAnimationDefinitionsSize()) {
                                stop();
                                return;
                            }
                            if (player.getLastAnimationEnd() > System
                                    .currentTimeMillis()) {
                                player.setNextAnimation(new Animation(-1));
                            }
                            if (player.hasFinished()) {
                                stop();
                            }
                            player.setNextAnimation(new Animation(i));
                            System.out.println("Anim - " + i);
                            i++;
                        }
                    }, 0, 3);
                    return true;

                case "animcount":
                    System.out.println(Utils.getAnimationDefinitionsSize() + " anims.");
                    return true;

                case "trygfx":
                    WorldTasksManager.schedule(new WorldTask() {
                        int i = 1500;

                        @Override
                        public void run() {
                            if (i >= Utils.getGraphicDefinitionsSize()) {
                                stop();
                            }
                            if (player.hasFinished()) {
                                stop();
                            }
                            player.setNextGraphics(new Graphics(i));
                            System.out.println("GFX - " + i);
                            i++;
                        }
                    }, 0, 3);
                    return true;

                case "gfx":
                    if (cmd.length < 2) {
                        player.getPackets().sendPanelBoxMessage("Use: ::gfx id");
                        return true;
                    }
                    try {
                        player.setNextGraphics(new Graphics(Integer.valueOf(cmd[1]), 0, 0));
                    } catch (NumberFormatException e) {
                        player.getPackets().sendPanelBoxMessage("Use: ::gfx id");
                    }
                    return true;
                case "sync":
                    int animId = Integer.parseInt(cmd[1]);
                    int gfxId = Integer.parseInt(cmd[2]);
                    int height = cmd.length > 3 ? Integer.parseInt(cmd[3]) : 0;
                    player.setNextAnimation(new Animation(animId));
                    player.setNextGraphics(new Graphics(gfxId, 0, height));
                    return true;

                case "mess":
                    player.getPackets().sendMessage(Integer.valueOf(cmd[1]), "",
                            player);
                    return true;
                case "unpermban":
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    File acc = new File("data/characters/" + name.replace(" ", "_") + ".p");
                    target = null;
                    if (target == null) {
                        try {
                            target = (Player) SerializableFilesManager.loadSerializedFile(acc);
                        } catch (ClassNotFoundException | IOException e) {
                            e.printStackTrace();
                        }
                    }
                    target.setPermBanned(false);
                    target.setBanned(0);
                    player.getPackets().sendGameMessage(
                            "You've unbanned " + Utils.formatPlayerNameForDisplay(target.getUsername()) + ".");
                    try {
                        SerializableFilesManager.storeSerializableClass(target, acc);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return true;

                case "permban":
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    if (target != null) {
                        target.setPermBanned(true);
                        target.getPackets().sendGameMessage(
                                "You've been perm banned by " + Utils.formatPlayerNameForDisplay(player.getUsername()) + ".");
                        player.getPackets().sendGameMessage(
                                "You have perm banned: " + target.getDisplayName() + ".");
                        target.getSession().getChannel().close();
                        SerializableFilesManager.savePlayer(target);
                    } else {
                        File acc11 = new File("data/characters/" + name.replace(" ", "_") + ".p");
                        try {
                            target = (Player) SerializableFilesManager.loadSerializedFile(acc11);
                        } catch (ClassNotFoundException | IOException e) {
                            e.printStackTrace();
                        }
                        if (target.getRights() == 2)
                            return true;
                        target.setPermBanned(true);
                        player.getPackets().sendGameMessage(
                                "You have perm banned: " + Utils.formatPlayerNameForDisplay(name) + ".");
                        try {
                            SerializableFilesManager.storeSerializableClass(target, acc11);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    return true;

                case "scscsc":
                    player.getControlerManager().startControler("StealingCreationController");
                    break;

                case "ipban":
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    boolean loggedIn11111 = true;
                    if (target == null) {
                        target = SerializableFilesManager.loadPlayer(Utils
                                .formatPlayerNameForProtocol(name));
                        if (target != null)
                            target.setUsername(Utils
                                    .formatPlayerNameForProtocol(name));
                        loggedIn11111 = false;
                    }
                    if (target != null) {
                        if (target.getRights() == 2)
                            return true;
                        IPBanL.ban(target, loggedIn11111);
                        player.getPackets().sendGameMessage(
                                "You've permanently ipbanned "
                                        + (loggedIn11111 ? target.getDisplayName()
                                        : name) + ".");
                    } else {
                        player.getPackets().sendGameMessage(
                                "Couldn't find player " + name + ".");
                    }
                    return true;

                case "unipban":
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    File acc11 = new File("data/characters/" + name.replace(" ", "_") + ".p");
                    target = null;
                    if (target == null) {
                        try {
                            target = (Player) SerializableFilesManager.loadSerializedFile(acc11);
                        } catch (ClassNotFoundException | IOException e) {
                            e.printStackTrace();
                        }
                    }
                    IPBanL.unban(target);
                    player.getPackets().sendGameMessage(
                            "You've unipbanned " + Utils.formatPlayerNameForDisplay(target.getUsername()) + ".");
                    try {
                        SerializableFilesManager.storeSerializableClass(target, acc11);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return true;

                case "staffmeeting":
                    for (Player staff : World.getPlayers()) {
                        if (staff.getRights() == 0)
                            continue;
                        staff.setNextWorldTile(new WorldTile(2675, 10418, 0));
                        staff.getPackets().sendGameMessage("You been teleported for a staff meeting by " + player.getDisplayName());
                    }
                    return true;

                case "demote":
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    if (target == null)
                        target = SerializableFilesManager.loadPlayer(Utils
                                .formatPlayerNameForProtocol(name));
                    if (target != null) {
                        if (target.getRights() >= 2)
                            return true;
                        target.setRights(0);
                        target.setSupporter(false);
                        player.getPackets().sendGameMessage(
                                "You demote "
                                        + Utils.formatPlayerNameForDisplay(target
                                        .getUsername()));
                    } else {
                        player.getPackets().sendGameMessage(
                                "Couldn't find player " + name + ".");
                    }
                    SerializableFilesManager.savePlayer(target);
                    return true;
                case "fightkiln":
                    player.getControlerManager().startControler("FightKilnControler", 1);
                    return true;
                case "setfirecapes":
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    if (target == null)
                        target = SerializableFilesManager.loadPlayer(Utils
                                .formatPlayerNameForProtocol(name));
                    if (target != null) {
                        target.setCompletedFightKiln();
                        target.setCompletedFightCaves();
                        target.getInventory().addItem(23659, 1);
                        target.getInventory().addItem(6570, 1);
                    } else {
                        player.getPackets().sendGameMessage(
                                "Couldn't find player " + name + ".");
                    }
                    SerializableFilesManager.savePlayer(target);
                    return true;
                case "setkiln":
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    if (target == null)
                        target = SerializableFilesManager.loadPlayer(Utils
                                .formatPlayerNameForProtocol(name));
                    if (target != null) {
                        target.setCompletedFightKiln();
                        //target.setCompletedFightCaves();
                        target.getInventory().addItem(23659, 1);
                        //target.getInventory().addItem(6570, 1);
                    } else {
                        player.getPackets().sendGameMessage(
                                "Couldn't find player " + name + ".");
                    }
                    SerializableFilesManager.savePlayer(target);
                    return true;
                case "setfirecape":
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    if (target == null)
                        target = SerializableFilesManager.loadPlayer(Utils
                                .formatPlayerNameForProtocol(name));
                    if (target != null) {
                        target.setCompletedFightCaves();
                        //target.setCompletedFightCaves();
                        target.getInventory().addItem(6570, 1);
                        //target.getInventory().addItem(6570, 1);
                    } else {
                        player.getPackets().sendGameMessage(
                                "Couldn't find player " + name + ".");
                    }
                    SerializableFilesManager.savePlayer(target);
                    return true;
                case "setkilledqbd":
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    if (target == null)
                        target = SerializableFilesManager.loadPlayer(Utils
                                .formatPlayerNameForProtocol(name));
                    if (target != null) {
                        target.setKilledQueenBlackDragon(true);
                        //target.setCompletedFightCaves();
                        //target.getInventory().addItem(23659, 1);
                        //target.getInventory().addItem(6570, 1);
                    } else {
                        player.getPackets().sendGameMessage(
                                "Couldn't find player " + name + ".");
                    }
                    SerializableFilesManager.savePlayer(target);
                    return true;

                case "viewbank":
                case "checkbank":
                    name = cmd[1].substring(cmd[1].indexOf(" ") + 1);
                    target = World.getPlayerByDisplayName(name);
                    try {
                        player.getPackets().sendItems(95, target.getBank().getContainerCopy());
                        player.getBank().openPlayerBank(target);
                    } catch (Exception e) {
                        player.getPackets().sendGameMessage("The player " + name + " is currently unavailable.");
                    }
                    return true;

                case "setdomtower":
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    if (target == null)
                        target = SerializableFilesManager.loadPlayer(Utils
                                .formatPlayerNameForProtocol(name));
                    if (target != null) {
                        target.setDominionTowerKills(100);

                    } else {
                        player.getPackets().sendGameMessage(
                                "Couldn't find player " + name + ".");
                    }
                    SerializableFilesManager.savePlayer(target);
                    return true;

                case "setprestige":
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    if (target == null)
                        target = SerializableFilesManager.loadPlayer(Utils
                                .formatPlayerNameForProtocol(name));
                    if (target != null) {
                        target.prestigeTokens = 5;

                    } else {
                        player.getPackets().sendGameMessage(
                                "Couldn't find player " + name + ".");
                    }
                    SerializableFilesManager.savePlayer(target);
                    return true;

            }
        }
        return false;
    }

    public static boolean processHeadModCommands(Player player, String[] cmd,
                                                 boolean console, boolean clientCommand) {
        if (clientCommand) {

        } else {
            String name;
            Player target;

            switch (cmd[0]) {
                case "jail":
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    if (target != null) {
                        target.setJailed(Utils.currentTimeMillis()
                                + (24 * 60 * 60 * 1000));
                        target.getControlerManager()
                                .startControler("JailControler");
                        target.getPackets().sendGameMessage(
                                "You've been Jailed for 24 hours by " + Utils.formatPlayerNameForDisplay(player.getUsername()) + ".");
                        player.getPackets().sendGameMessage(
                                "You have Jailed 24 hours: " + target.getDisplayName() + ".");
                        SerializableFilesManager.savePlayer(target);
                    } else {
                        File acc1 = new File("data/characters/" + name.replace(" ", "_") + ".p");
                        try {
                            target = (Player) SerializableFilesManager.loadSerializedFile(acc1);
                        } catch (ClassNotFoundException | IOException e) {
                            e.printStackTrace();
                        }
                        target.setJailed(Utils.currentTimeMillis()
                                + (24 * 60 * 60 * 1000));
                        player.getPackets().sendGameMessage(
                                "You have muted 24 hours: " + Utils.formatPlayerNameForDisplay(name) + ".");
                        try {
                            SerializableFilesManager.storeSerializableClass(target, acc1);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    return true;

                case "viewbank":
                    name = cmd[1].substring(cmd[1].indexOf(" ") + 1);
                    target = World.getPlayerByDisplayName(name);
                    try {
                        player.getPackets().sendItems(95, target.getBank().getContainerCopy());
                        player.getBank().openPlayerBank(target);
                    } catch (Exception e) {
                        player.getPackets().sendGameMessage("The player " + name + " is currently unavailable.");
                    }
                    return true;


                case "kick":
                    if (player.getRights() < 1) {
                        player.getPackets().sendGameMessage(
                                "You cannot use this command.");
                        return false;
                    }
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    if (target == null) {
                        player.getPackets().sendGameMessage(
                                Utils.formatPlayerNameForDisplay(name) + " is not logged in.");
                        return true;
                    }
                    target.getSession().getChannel().close();
                    player.getPackets().sendGameMessage("You have kicked: " + target.getDisplayName() + ".");
                    return true;

                case "mute":
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    if (target != null) {
                        target.setMuted(Utils.currentTimeMillis()
                                + (player.getRights() >= 1 ? (48 * 60 * 60 * 1000) : (1 * 60 * 60 * 1000)));
                        target.getPackets().sendGameMessage(
                                "You've been muted for " + (player.getRights() >= 1 ? " 48 hours by " : "1 hour by ") + Utils.formatPlayerNameForDisplay(player.getUsername()) + ".");
                        player.getPackets().sendGameMessage(
                                "You have muted " + (player.getRights() >= 1 ? " 48 hours by " : "1 hour by ") + target.getDisplayName() + ".");
                    } else {
                        name = Utils.formatPlayerNameForProtocol(name);
                        if (!SerializableFilesManager.containsPlayer(name)) {
                            player.getPackets().sendGameMessage(
                                    "Account name " + Utils.formatPlayerNameForDisplay(name) + " doesn't exist.");
                            return true;
                        }
                        target = SerializableFilesManager.loadPlayer(name);
                        target.setUsername(name);
                        target.setMuted(Utils.currentTimeMillis()
                                + (player.getRights() >= 1 ? (48 * 60 * 60 * 1000) : (1 * 60 * 60 * 1000)));
                        player.getPackets().sendGameMessage(
                                "You have muted " + (player.getRights() >= 1 ? " 48 hours by " : "1 hour by ") + target.getDisplayName() + ".");
                        SerializableFilesManager.savePlayer(target);
                    }
                    return true;

            }
        }
        return false;
    }

    public static boolean processSupportCommands(Player player, String[] cmd,
                                                 boolean console, boolean clientCommand) {
        String name = "";
        Player target;
        if (clientCommand) {

        } else {
            switch (cmd[0]) {
                case "sz":
                    if (player.isLocked() || player.getControlerManager().getControler() != null) {
                        player.getPackets().sendGameMessage("You cannot tele anywhere from here.");
                        return true;
                    }
                    player.setNextWorldTile(new WorldTile(2977, 5792, 1));
                    return true;

                case "ticket":
                    TicketSystem.answerTicket(player);
                    return true;

                case "finishticket":
                    TicketSystem.removeTicket(player);
                    return true;

                case "info":
                    String namecheckcmd = cmd[1].substring(cmd[1].indexOf(" ") + 1);
                    Player displayname = World.getPlayerByDisplayName(namecheckcmd);
                    if (namecheckcmd == null)
                        return true;
                    if (displayname == null)
                        return false;
                    if (displayname.getRights() > 0)
                        return true;
                    player.sm("Information for " + displayname.getDisplayName() + ":");
                    player.sm("Original name: " + displayname.getUsername() + ".");
                    player.sm("Players IP Address: " + displayname.getSession().getIP() + ".");
                    player.getPackets().sendItems(95, displayname.getBank().getContainerCopy());
                    player.getBank().openPlayerBank(displayname);
                    player.sm("Here is their bank.");
                    return true;

                case "removedisplay":
                    String name1 = "";
                    for (int i = 1; i < cmd.length; i++)
                        name1 += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    Player target1 = World.getPlayerByDisplayName(name1);
                    if (target1 != null) {
                        target1.setDisplayName(Utils.formatPlayerNameForDisplay(target1.getUsername()));
                        target1.getPackets().sendGameMessage(
                                "Your display name was removed by " + Utils.formatPlayerNameForDisplay(player.getUsername()) + ".");
                        player.getPackets().sendGameMessage(
                                "You have removed display name of " + target1.getDisplayName() + ".");
                        SerializableFilesManager.savePlayer(target1);
                    } else {
                        File acc1 = new File("data/characters/" + name1.replace(" ", "_") + ".p");
                        try {
                            target1 = (Player) SerializableFilesManager.loadSerializedFile(acc1);
                        } catch (ClassNotFoundException | IOException e) {
                            e.printStackTrace();
                        }
                        target1.setDisplayName(Utils.formatPlayerNameForDisplay(target1.getUsername()));
                        player.getPackets().sendGameMessage(
                                "You have removed display name of " + target1.getDisplayName() + ".");
                        try {
                            SerializableFilesManager.storeSerializableClass(target1, acc1);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    return true;


                case "unmute":
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    if (target != null) {
                        target.setMuted(0);
                        target.getPackets().sendGameMessage(
                                "You've been unmuted by " + Utils.formatPlayerNameForDisplay(player.getUsername()) + ".");
                        player.getPackets().sendGameMessage(
                                "You have unmuted: " + target.getDisplayName() + ".");
                        SerializableFilesManager.savePlayer(target);
                    } else {
                        File acc1 = new File("data/characters/" + name.replace(" ", "_") + ".p");
                        try {
                            target = (Player) SerializableFilesManager.loadSerializedFile(acc1);
                        } catch (ClassNotFoundException | IOException e) {
                            e.printStackTrace();
                        }
                        target.setMuted(0);
                        player.getPackets().sendGameMessage(
                                "You have unmuted: " + Utils.formatPlayerNameForDisplay(name) + ".");
                        try {
                            SerializableFilesManager.storeSerializableClass(target, acc1);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    return true;

                case "jail":
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    if (target != null) {
                        target.setJailed(Utils.currentTimeMillis()
                                + (24 * 60 * 60 * 1000));
                        target.getControlerManager()
                                .startControler("JailControler");
                        target.getPackets().sendGameMessage(
                                "You've been Jailed for 24 hours by " + Utils.formatPlayerNameForDisplay(player.getUsername()) + ".");
                        player.getPackets().sendGameMessage(
                                "You have Jailed 24 hours: " + target.getDisplayName() + ".");
                        SerializableFilesManager.savePlayer(target);
                    } else {
                        File acc1 = new File("data/characters/" + name.replace(" ", "_") + ".p");
                        try {
                            target = (Player) SerializableFilesManager.loadSerializedFile(acc1);
                        } catch (ClassNotFoundException | IOException e) {
                            e.printStackTrace();
                        }
                        target.setJailed(Utils.currentTimeMillis()
                                + (24 * 60 * 60 * 1000));
                        player.getPackets().sendGameMessage(
                                "You have muted 24 hours: " + Utils.formatPlayerNameForDisplay(name) + ".");
                        try {
                            SerializableFilesManager.storeSerializableClass(target, acc1);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    return true;

                case "kick":
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    if (target == null) {
                        player.getPackets().sendGameMessage(
                                Utils.formatPlayerNameForDisplay(name) + " is not logged in.");
                        return true;
                    }
                    target.getSession().getChannel().close();
                    player.getPackets().sendGameMessage("You have kicked: " + target.getDisplayName() + ".");
                    return true;

                case "staffyell":
                    String message = "";
                    for (int i = 1; i < cmd.length; i++)
                        message += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    sendYell(player, Utils.fixChatMessage(message), true);
                    return true;

                case "forcekick":
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    if (target == null) {
                        player.getPackets().sendGameMessage(
                                Utils.formatPlayerNameForDisplay(name) + " is not logged in.");
                        return true;
                    }
                    target.forceLogout();
                    player.getPackets().sendGameMessage("You have kicked: " + target.getDisplayName() + ".");
                    return true;

                case "unjail":
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    if (target != null) {
                        target.setJailed(0);
                        target.getControlerManager()
                                .startControler("JailControler");
                        target.getPackets().sendGameMessage(
                                "You've been unjailed by " + Utils.formatPlayerNameForDisplay(player.getUsername()) + ".");
                        player.getPackets().sendGameMessage(
                                "You have unjailed: " + target.getDisplayName() + ".");
                        SerializableFilesManager.savePlayer(target);
                    } else {
                        File acc1 = new File("data/characters/" + name.replace(" ", "_") + ".p");
                        try {
                            target = (Player) SerializableFilesManager.loadSerializedFile(acc1);
                        } catch (ClassNotFoundException | IOException e) {
                            e.printStackTrace();
                        }
                        target.setJailed(0);
                        player.getPackets().sendGameMessage(
                                "You have unjailed: " + Utils.formatPlayerNameForDisplay(name) + ".");
                        try {
                            SerializableFilesManager.storeSerializableClass(target, acc1);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    return true;

                case "teleto":
                    if (player.isLocked() || player.getControlerManager().getControler() != null) {
                        player.getPackets().sendGameMessage("You cannot tele anywhere from here.");
                        return true;
                    }
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    if (target == null)
                        player.getPackets().sendGameMessage(
                                "Couldn't find player " + name + ".");
                    else
                        player.setNextWorldTile(target);
                    return true;
            }
        }
        return false;
    }

    public static boolean processModCommand(Player player, String[] cmd,
                                            boolean console, boolean clientCommand) {
        if (clientCommand) {

        } else {
            switch (cmd[0]) {

                case "voteon":
                    canVote = true;
                    player.sm("Voting has been enabled.");
                    return true;
                case "voteoff":
                    canVote = false;
                    player.sm("Voting has been disabled.");
                    return true;
                case "checkinv":
                    if (cmd[1].length() == 0) {
                        return false;
                    }
                    Player pl2 = World.getPlayer(cmd[1]);
                    if (pl2 == null)
                        return false;
                    int freeslots = pl2.getInventory().getFreeSlots();
                    int usedslots = 28 - freeslots;
                    int total;
                    player.getPackets().sendGameMessage("<img=1>Inventory Information<img=1>");
                    player.getPackets().sendGameMessage("<col=DF7401>" + Utils.formatPlayerNameForDisplay(cmd[1]) + "</col> has used <col=DF7401>" + (28 - freeslots) + " </col>of <col=DF7401>" + freeslots + "</col> inventory slots.");
                    player.getPackets().sendGameMessage("Inventory contains:");
                    for (int i = 0; i < usedslots; i++) {
                        total = pl2.getInventory().getItems().getNumberOf(pl2.getInventory().getItems().get(i).getId());
                        player.getPackets().sendGameMessage("<col=088A08>" + total + "</col><col=BDBDBD> x </col><col=088A08>" + pl2.getInventory().getItems().get(i).getName());

                    }
                    return true;

                case "hide":
                    player.getAppearence().switchHidden();
                    player.getPackets().sendGameMessage("Hidden? " + player.getAppearence().isHidden());
                    return true;


                case "addsc":
                    if (Configs.DEVELOPER_WORLD) {
                        player.setStealingCreationPoints(player.getStealingCreationPoints() + 1000);
                    }
                    return true;

                case "teletome":
                    String name = "";
                    Player target = null;
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    if (target == null)
                        player.getPackets().sendGameMessage(
                                "Couldn't find player " + name + ".");
                    else {
                        if (target.isLocked() || target.getControlerManager().getControler() != null) {
                            player.getPackets().sendGameMessage("You cannot teleport this player.");
                            return true;
                        }
                        if (target.getRights() > 1) {
                            player.getPackets().sendGameMessage(
                                    "Unable to teleport a developer to you.");
                            return true;
                        }
                        target.setNextWorldTile(player);
                    }
                    return true;
                case "unnull":
                case "sendhome":
                    name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    target = World.getPlayerByDisplayName(name);
                    if (target == null)
                        player.getPackets().sendGameMessage(
                                "Couldn't find player " + name + ".");
                    else {
                        target.unlock();
                        target.getControlerManager().forceStop();
                        if (target.getNextWorldTile() == null) //if controler wont tele the player
                            target.setNextWorldTile(Settings.RESPAWN_PLAYER_LOCATION);
                        player.getPackets().sendGameMessage("You have unnulled: " + target.getDisplayName() + ".");
                        return true;
                    }
                    return true;
            }
        }
        return false;
    }

    public static void sendYell(Player player, String message, boolean staffYell) {
        if (!player.isADonator() && !player.isExtremeDonator() && player.getRights() == 0 && !player.isLegendDonator() && !player.isSuperDonator())
            return;
        if (player.getMuted() > Utils.currentTimeMillis()) {
            player.getPackets().sendGameMessage("You temporary muted. Recheck in 48 hours.");
            return;
        }
        if (staffYell) {
            World.sendWorldMessage("[<col=00ffff>Staff</col>] "
                    + (player.getRights() > 1 ? "<img=1>" : (player.isSupporter() ? "<img=13>" : "<img=0>"))
                    + player.getDisplayName() + ": <col=00ffff>"
                    + message + "</col>", true);
            return;
        }
        if (message.length() > 100)
            message = message.substring(0, 100);
        if (message.toLowerCase().equals("eco") && player.getRights() == 0) {
            return;
        }
        if (player.getRights() < 2) {
            String[] invalid = {"<euro", "<img", "<img=", "<col", "<col=",
                    "<shad", "<shad=", "<str>", "<u>"};
            for (String s : invalid)
                if (message.contains(s)) {
                    player.getPackets().sendGameMessage("You cannot add additional code to the message.");
                    return;
                }

            if (player.isForumModerator())
                World.sendWorldMessage("[<img=0><col=FFFFFF><shad=F5D00C>Forum Moderator</shad></col>] <img=0>" + player.getDisplayName() + ": <col=FFFFFF><shad=F5D00C>" + message + "", false);

            else if (player.getRights() == 1)
                World.sendWorldMessage("[<col=808080><shad=515756>Moderator</shad></col>] <img=0>" + player.getDisplayName() + ": <col=808080><shad=515756>" + message + "", false);

            else if (player.isSupporter() && player.getRights() == 0)
                World.sendWorldMessage("[<img=13><col=58ACFA><shad=2E2EFE>Support Team</shad></col>] <img=13> " + player.getDisplayName() + ": <col=58ACFA><shad=2E2EFE>" + message + "</shad></col>.", false);

            else if (player.isPromoter())
                World.sendWorldMessage("[<col=99FFFF>Promoter</shad></col>] <img=4>" + player.getDisplayName() + ": <col=99FFFF><shad=000000>" + message + "", false);

            else if (player.isMythicDonator())
                World.sendWorldMessage("<img=15>[<col=FFFFFF><shad=" + (player.getYellColor() == "ff0000" || player.getYellColor() == null ? "7E00CC" : player.getYellColor()) + ">Mythic Donator</shad></col>] "
                        + player.getDisplayName() + ": <col=FFFFFF><shad=" + (player.getYellColor() == "ff0000" || player.getYellColor() == null ? "7E00CC" : player.getYellColor()) + ">" + message + "</shad></col>", false);

            else if (player.isUltimateDonator())
                World.sendWorldMessage("<img=14>[<col=FFFFFF><shad=" + (player.getYellColor() == "ff0000" || player.getYellColor() == null ? "ED7818" : player.getYellColor()) + ">Ultimate Donator</shad></col>] "
                        + player.getDisplayName() + ": <col=FFFFFF><shad=" + (player.getYellColor() == "ff0000" || player.getYellColor() == null ? "ED7818" : player.getYellColor()) + ">" + message + "</shad></col>", false);

            else if (player.isLegendDonator())
                World.sendWorldMessage("<img=11>[<col=FFFFFF><shad=" + (player.getYellColor() == "ff0000" || player.getYellColor() == null ? "99FFFF" : player.getYellColor()) + ">Legendary Donator</shad></col>] "
                        + player.getDisplayName() + ": <col=FFFFFF><shad=" + (player.getYellColor() == "ff0000" || player.getYellColor() == null ? "99FFFF" : player.getYellColor()) + ">" + message + "</shad></col>", false);

            else if (player.isExtremeDonator() && player.getRights() == 0)
                World.sendWorldMessage("<img=9>[<col=FFFFFF><shad=" + (player.getYellColor() == "ff0000" || player.getYellColor() == null ? "ff0000" : player.getYellColor()) + ">Extreme Donator</shad></col>] "
                        + player.getDisplayName() + ": <col=" + (player.getYellColor() == "ff0000" || player.getYellColor() == null ? "ff0000" : player.getYellColor()) + ">" + message + "</shad></col>", false);

            else if (player.isSuperDonator())
                World.sendWorldMessage("<img=10>[<col=FFFFFF><shad=" + (player.getYellColor() == "ff0000" || player.getYellColor() == null ? "0C9CCC" : player.getYellColor()) + ">Super Donator</col></shad>] "
                        + player.getDisplayName() + ": <col=FFFFFF><shad=" + (player.getYellColor() == "ff0000" || player.getYellColor() == null ? "0C9CCC" : player.getYellColor()) + ">" + message + "</shad></col>", false);

            else if (player.isADonator() && player.getRights() == 0)
                World.sendWorldMessage("<img=8>[<col=02ab2f>Donator</col>] " + player.getDisplayName() + ": <col=02ab2f>" + message + "</col>", false);

            else
                World.sendWorldMessage("[<col=FFFFFF><shad=" + (player.getYellColor() == "ff0000" || player.getYellColor() == null ? "000099" : player.getYellColor()) + ">"
                        + ((player.getRights() == 1 && player.getUsername().contains("")) ? "Moderator" : "Global Mod") + "</shad></col>] <img=0>"
                        + player.getDisplayName() + ": <col=FFFFFF><shad=" + (player.getYellColor() == "ff0000" || player.getYellColor() == null ? "000099" : player.getYellColor()) + ">" + message + "</shad></col>", false);
            return;

        } else if (player.getUsername().equalsIgnoreCase(Configs.OWNER)) {
            World.sendWorldMessage("[<col=FFFFFF><shad=7F61BA>Owner</col></shad>] <img=1>" + player.getDisplayName() + ": <col=FFFFFF><shad=7F61BA>" + message + "</col></shad>", false);
        } else if (player.getRights() == 2) {
            World.sendWorldMessage("[<col=EDE909><shad=000000>Administrator</col></shad>] <img=1>" + player.getDisplayName() + ": <col=EDE909>" + message + "</col>", false);
        }
    }

    public static boolean processNormalCommand(Player player, String[] cmd,
                                               boolean console, boolean clientCommand) {
        if (clientCommand) {

        } else {
            String message;
            switch (cmd[0]) {

                /**
                 * WSMinigame
                 */

                case "ws":
                    WSMinigame.addLobbyPlayer(player);
                    return true;

                /**
                 * Tax Commands
                 */

                case "taxes":
                    if (cmd.length < 1)
                        return false;
                    //player.getTaxSystem().payTax(Integer.parseInt(cmd[1]));
                    return true;

                /**
                 * Land Commands
                 */

                case "tland":
                    if (LandHandler.playerHasLand(player))
                        LandHandler.teleportPlayerToLand(player);
                    else
                        player.output("You do not have any land to teleport to.");
                    return true;

                case "ct":
                    player.setHasMadeOffer(false);
                    player.setMyOffer(-1);
                    player.output("Cleared Transactions.");
                    return true;

                case "pports":
                    player.getPlayerPorts().initalizePort();
                    break;

                case "house":
                    if (!player.canSpawn())
                        return false;
                    player.getHouse().enterMyHouse();
                    return true;

                case "setpp":
                case "changepp":
                    if (!player.getPlayerPin().hasEnteredPin()) {
                        return false;
                    }
                    player.getPlayerPin().promptChange();
                    break;


                case "empty":
                    player.getDialogueManager().startDialogue("ConfirmEmpty");
                    return true;

                case "topic":
                case "thread":
                    if (cmd.length < 2) {
                        player.sm("SYNTAX - ::thread (id)");
                        return false;
                    }
                    try {
                        final int id = Integer.parseInt(cmd[1]);
                        //http://theHelwyr.org/community/index.php?showtopic=26
                        player.getPackets().sendOpenURL(Configs.FORUM + "index.php?showtopic=" + id);
                    } catch (final NumberFormatException e) {
                        player.sm("SYNTAX - ::thread (id)");
                    }
                    break;
                case "forum":
                case "community":
                    player.getPackets().sendOpenURL(Configs.FORUM);
                    break;
                case "hs":
                case "highscores":
                case "leaderboards":
                    player.getPackets().sendOpenURL(Configs.WEBSITE + "/highscores/");
                    break;
                case "vote":
                    player.getPackets().sendOpenURL(Configs.VOTE);
                    return true;
                case "donate":
                    player.getPackets().sendOpenURL(Configs.SHOP);
                    return true;
                case "donatebenefits":
                case "db":
                    player.getPackets().sendOpenURL("http://theHelwyr.org/community/index.php?/topic/25-donation-information/");
                    return true;
                case "website":
                    player.getPackets().sendOpenURL(Configs.WEBSITE);
                    return true;
                case "rrr333":
                    player.getPackets().functionRender();
                    return true;
                case "setyellcolor":
                case "changeyellcolor":
                case "yellcolor":
                    if (player.isASuperDonator()) {
                        player.getPackets().sendRunScript(109, new Object[]{"Please enter the yell color in HEX format."});
                        player.getTemporaryAttributtes().put("yellcolor", Boolean.TRUE);
                    } else {
                        player.sm("You cannot use this command.");
                    }
                    return true;

                case "cannon":
                    if (player.isAExtremeDonator()) {
                        for (int i = 0; i < player.getDwarfCannon().ROYAL_ITEMS.length; i++) {
                            if (player.hasItem(player.getDwarfCannon().ROYAL_CANNON[i]))
                                continue;
                            if (player.getInventory().hasFreeSlots()) {
                                player.getInventory().addItem(player.getDwarfCannon().ROYAL_ITEMS[i]);
                            } else {
                                player.getBank().addItem(player.getDwarfCannon().ROYAL_ITEMS[i], 1, false);
                            }
                        }
                        player.sm("You have retreived your dwarf cannon.");
                    }
                    break;

                case "donatorhelm":
                case "donorhelm":
                    if (!player.isALegendDonator()) {
                        player.getPackets().sendGameMessage("You must be a legendary donator to use this command.");
                        return false;
                    }
                    if (player.hasItem(12681)) {
                        player.getPackets().sendGameMessage("You already have a donator helm");
                        return false;
                    }
                    if (player.getInventory().hasFreeSlots()) {
                        player.getInventory().addItem(12681);
                    }
                    return true;

                case "darkbeasts":
                    if (player.isLocked() || player.getControlerManager().getControler() != null) {
                        player.getPackets().sendGameMessage("You cannot tele anywhere from here.");
                        return true;
                    }
                    Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(1650, 5301, 0));
                    return true;


                case "checkpkpoints":
                case "checkpkp":
                case "pkpoints":
                case "pkp":
                    player.getPackets().sendGameMessage("You currently have " + player.pkpoints + " pk points.");
                    return true;


                case "checkdonation":
                    player.sm("You currently have donated a total of $" + player.donatorcredits + ".");
                    return true;


                case "i":
                case "item":
                case "pickup":
                    if (cmd.length < 2) {
                        player.getPackets().sendGameMessage(
                                "Use: ::item id (optional:amount)");
                        return false;
                    }
                    if (!Configs.DEVELOPER_WORLD) {
                        return false;
                    }
                    try {
                        int itemId = Integer.valueOf(cmd[1]);
                        ItemDefinitions defs = ItemDefinitions
                                .getItemDefinitions(itemId);
                        if (defs.isLended())
                            return false;
                        String name = defs == null ? "" : defs.getName()
                                .toLowerCase();
                        if (name.contains("Sacred clay")) {
                            return false;
                        }
                        player.getInventory().addItem(itemId,
                                cmd.length >= 3 ? Integer.valueOf(cmd[2]) : 1);
                    } catch (NumberFormatException e) {
                        player.getPackets().sendGameMessage(
                                "Use: ::item id (optional:amount)");
                    }
                    return true;

                case "sc":
                case "creations":
                case "stealingcreations":
                case "stealing":
                    if (player.isLocked() || player.getControlerManager().getControler() != null) {
                        player.getPackets().sendGameMessage("You cannot tele anywhere from here.");
                        return false;
                    }
                    Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2968, 9693, 0));
                    return true;


                case "chill":
                    Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3041, 4532, 0));
                    return true;

                case "wcourse":
                case "wildycourse":
                    player.getDialogueManager().startDialogue("WildernessCourse");
                    return true;

                case "connect": {
                    Bot bot = null;
                    String name = "";//;;connect username, password
                    String password = "";
                    if (cmd.length < 3) {
                        player.getPackets().sendGameMessage("Incorect syntax: ;;connect username password");
                        return false;
                    }
                    name = cmd[1];
                    password = cmd[2];
                    if (World.containsPlayer(name)) {
                        player.getPackets().sendGameMessage("This bot is already logged in.");
                        return false;
                    }
                    if (SerializableFilesManager.containsPlayer(cmd[1])) {
                        bot = (Bot) SerializableFilesManager.loadPlayer(name);
                        if (!password.equalsIgnoreCase(bot.getPassword())) {
                            player.getPackets().sendGameMessage("You have entered the bots password incorrectly.");
                            return false;
                        }
                        bot.setUsername(name);
                        bot.startup();
                        player.sm("Bot logged in!: " + bot.getInfo() + ".");
                    } else {
                        player.sm(Utils.formatPlayerNameForDisplay(name) + " does not exist.");
                    }
                    return true;
                }

                case "pvplegion":
                    if (cmd.length < 2)
                        return false;
                    int size = Integer.parseInt(cmd[1]);
                    for (int i = 0; i < size; i++) {
                        String aipName = PVPAIPBuilderUtils.names[i];
                        Bot aip = null;
                        aip = new Bot(aipName, "", new WorldTile(generateLocation(player))).startup();
                        aip.setControler(player);
                        aip.setCanPvp(true);
                        PVPAIPBuilderUtils.generateClass(aip);
                        //aip.setUsername(aipName);
                        aip.getControlerManager().startControler("Wilderness");
                    }
                    return true;

                case "pvpfight":
                    PVPAIPActions.syncBotThread(player);
                    return true;

                case "wildyall":
                    for (Player pls : World.getPlayers()) {
                        pls.getControlerManager().startControler("Wilderness");
                    }
                    return true;

                case "createbot": {//1, 2, 3, 4
                    String username = "";
                    String password = "";
                    String opassword = "";
                    Bot bot = null;
                    if (cmd.length < 4) {
                        player.getPackets().sendGameMessage("Incorect syntax: ;;newbot username password repeat-password");
                        return false;
                    }
                    username = cmd[1];
                    password = cmd[2];
                    opassword = cmd[3];
                    if (!password.equalsIgnoreCase(opassword)) {
                        player.getPackets().sendGameMessage("Both passwords do not match.");
                        return false;
                    }
                    if (SerializableFilesManager.containsPlayer(username)) {
                        player.sm(Utils.formatString(username) + " already exists!");
                        return false;
                    }
                    bot = new Bot(username, password, new WorldTile(Settings.START_PLAYER_LOCATION)).startup();
                    player.sm("Bot created!: " + bot.getInfo() + ".");
                    return true;
                }

                case "givemax": {
                    String name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    Bot bot = BotList.get(name);
                    if (bot == null)
                        return false;
                    for (int skill = 0; skill < 25; skill++)
                        bot.getSkills().addXp(skill, 150000000);
                    bot.friendsChat("WOOT! " + player.getDisplayName() + " finally mastered me!");
                    return true;
                }

                case "fcbot": {
                    String name = "";
                    if (cmd.length < 2)
                        return false;
                    name = cmd[1];
                    message = cmd[2];
                    Bot bot = BotList.get(name);
                    if (bot == null)
                        return false;
                    for (int i = 2; i < cmd.length; i++) {
                        bot.friendsChat(Utils.fixChatMessage(cmd[i]));
                    }
                    return true;
                }

                case "ftbot": {
                    String name = "";
                    if (cmd.length < 2)
                        return false;
                    name = cmd[1];
                    message = cmd[2];
                    Bot bot = BotList.get(name);
                    if (bot == null)
                        return false;
                    for (int i = 2; i < cmd.length; i++) {
                        bot.publicChat(Utils.fixChatMessage(cmd[i]));
                    }
                    return true;
                }

                case "disconnect": {
                    String name = "";
                    String password = "";
                    if (cmd.length < 3) {
                        player.sm("Incorrect Syntax: ;;disconnect username password");
                        return false;
                    }
                    Bot bot = BotList.get(name);
                    if (bot != null) {
                        bot.finish();
                        player.sm("Bot disconnected: " + bot.getInfo());
                    } else
                        player.sm("That bot is not online.");
                    return true;
                }

                case "market":
                    Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3165, 3476, 0));
                    return true;


                case "getid":
                    String name2;
                    name2 = "";
                    for (int i = 1; i < cmd.length; i++) {
                        name2 += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    }
                    ItemSearch.searchForItem(player, name2);
                    return true;

                case "imid":
                    int id = Integer.parseInt(cmd[1]);
                    player.getPackets().sendMessage(99,
                            "<col=0f00ff>ModelID Drop Model</col> for <col=ff00ff>Item " + id + " </col>is:<col=00ff00> " + ItemDefinitions.getItemDefinitions(id).modelId, player);
                    player.getPackets().sendMessage(99,
                            "<col=0f00ff>ModelID Male Model 1</col> for <col=ff00ff>Item " + id + " </col>is:<col=00ff00> " + ItemDefinitions.getItemDefinitions(id).maleEquip1, player);
                    player.getPackets().sendMessage(99,
                            "<col=0f00ff>ModelID Female Model 1</col> for <col=ff00ff>Item " + id + " </col>is:<col=00ff00> " + ItemDefinitions.getItemDefinitions(id).femaleEquip1, player);
                    player.getPackets().sendMessage(99,
                            "<col=0f00ff>ModelName</col> for <col=ff00ff>Item " + id + " </col>is:<col=00ff00> " + ItemDefinitions.getItemDefinitions(id).getName(), player);
                    return true;

                case "ge":
                    if (!player.isUltimateDonator()) {
                        player.getPackets().sendGameMessage("You need to be an Ultimate Donator to use this command.");
                        return false;
                    }
                    player.getGeManager().openGrandExchange();
                    return true;

                case "geh":
                    if (!player.isUltimateDonator()) {
                        player.getPackets().sendGameMessage("You need to be an Ultimate Donator to use this command.");
                        return false;
                    }
                    player.getGeManager().openHistory();
                    return true;

                case "gec":
                    if (!player.isUltimateDonator()) {
                        player.getPackets().sendGameMessage("You need to be an Ultimate Donator to use this command.");
                        return false;
                    }
                    player.getGeManager().openCollectionBox();
                    return true;

                case "mrwheelyspinwilly":
                case "spinall":
                    if (player.getSquealOfFortune().getTotalSpins() < 1)
                        return false;
                    for (int i = 0; i < 100; i++) {
                        player.getSquealOfFortune().procesSpins();
                    }
                    return true;

                case "ra":
                    player.getAppearence().setRenderEmote(-1);
                    return true;

                case "ri":
                    player.getThrone().setBarStage(ThroneOfMiscellania.IDLE, 15);
                    return true;

                case "ppickup":
                case "pp":
                    if (player.getInventory().hasFreeSlots()) {
                        player.setNextAnimation(new Animation(827));
                        player.getPet().pickup();
                    }
                    return true;
                    
                case "discord":
                	player.getPackets().sendOpenURL("https://discord.gg/5M2kqqA");
                	return true;


                case "home":
                    if (player.getControlerManager().getControler() instanceof Wilderness) {
                        player.getPackets().sendGameMessage("You cannot teleport out of the wilderness");
                        return false;
                    }
                    if (player.getControlerManager().getControler() instanceof DungeonController) {
                    	player.getPackets().sendGameMessage("You cannot teleport while inside a dungeon.");
                        return false;
                    }
                    player.getControlerManager().removeControlerWithoutCheck();
                    player.getControlerManager().forceStop();
                    player.getInterfaceManager().removeScreenInterface();
                    Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(Settings.RESPAWN_PLAYER_LOCATION));
                    return true;

                case "prif":
                case "priffidinas":
                case "priff":
                	if (player.getSkills().getTotalLevel() > 1849)
                        Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2208, 3359, 1));
                    else
                        player.getPackets().sendGameMessage("You need a total level of 1850 in order to visit priffidinas.");
                    return true;

                case "setbeam":
                case "editbeam":
                case "lootbeam":
                    player.getPackets().sendInputIntegerScript("What would you like to set the minimum value of loot beams to? (0 to disable)");
                    player.getTemporaryAttributtes().put("loot_beam", Boolean.TRUE);
                    return true;

                case "dr":
                    player.getBank().removeItem(0);
                    return true;

                case "44mstream":
                    player.getPackets().sendOpenURL("http://www.hitbox.tv/44m");
                    return true;

                case "starter":
                    if (!player.claimedStarter) {
                        player.getDialogueManager().startDialogue("StarterChoice");
                    } else {
                        player.sm("You have already claimed your starter.");
                    }
                    return true;

                case "edit":
                case "account":
                case "update":
                    if (!player.isASuperDonator()) {
                        player.sm("You need to be a Premium Donator to use this feature.");
                        return true;
                    }
                    player.getDialogueManager().startDialogue("EditAccount");
                    return true;


                case "claimsuit":
                    int mined = player.getGoldOreMined();
                    if (mined >= 100) {
                        if (!player.hasItem(20787)) {
                            player.getBank().addItem(20787, 1, true);
                        }
                    }
                    if (mined >= 200) {
                        if (!player.hasItem(20788)) {
                            player.getBank().addItem(20788, 1, true);
                        }
                    }
                    if (mined >= 500) {
                        if (!player.hasItem(20790)) {
                            player.getBank().addItem(20790, 1, true);
                        }
                    }
                    if (mined >= 750) {
                        if (!player.hasItem(20791)) {
                            player.getBank().addItem(20791, 1, true);
                        }
                    }
                    if (mined >= 1000) {
                        if (!player.hasItem(20789)) {
                            player.getBank().addItem(20789, 1, true);
                        }
                    }
                    return true;

                case "events":
                    player.getPackets().sendGameMessage("<col=F08C00>Active Events: " + (EventManager.getActiveEvents() == null ? "None." : Utils.formatString(EventManager.getActiveEvents().toString().trim())) + "\n");
                    return true;

                case "serverevents":
                case "sevents":
                    player.getPackets().sendGameMessage("<col=F08C00>Active Server Events " + (ServerEventManager.getEvents() == null ? "None." : Utils.formatString(ServerEventManager.getEvents().toString().trim())) + "\n");
                    return true;

                case "newdung":
                    player.getDungManager().enterDungeon(true);
                    return true;

                case "edge":
                    if (player.isLocked() || player.getControlerManager().getControler() != null) {
                        player.getPackets().sendGameMessage("You cannot tele anywhere from here.");
                        return true;
                    }
                    Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3090, 3520, 0));
                    return true;

                case "fire":
                    Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2574, 4848, 0));
                    return true;

                case "chaos":
                    Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2281, 4837, 0));
                    return true;

                case "nature":
                    Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2400, 4835, 0));
                    return true;

                case "death":
                    Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2208, 4830, 0));
                    return true;

                case "blood":
                    Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2468, 4889, 1));
                    return true;


                case "setdisplay":
                    String name = "";
                    for (int i = 1; i < cmd.length; i++)
                        name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    if (!player.isSuperDonator()) {
                        player.getPackets().sendGameMessage(
                                "You need to be a Super Donator to use this feature");
                        return true;
                    }
                    if (name.length() > 12 || name.length() <= 3) {
                        player.getPackets()
                                .sendGameMessage(
                                        "You cannot have more than 12 & less than 2 chars in a display.");
                        return true;
                    }
                    if (name.contains("#") || name.contains("~")
                            || name.contains("?") || name.contains(":")
                            || name.startsWith(" ") || name.endsWith(" ")
                            || name.contains("  ") || name.endsWith("_")
                            || name.startsWith("_") || name.startsWith(" ")
                            || name.contains("/") || name.contains("/")) {
                        player.getPackets().sendGameMessage(
                                "Your name cannot contain illegal characters.");
                        return true;
                    }
                    if (name.equalsIgnoreCase(player.getUsername())) {
                        player.setDisplayName(null);
                        player.getAppearence().generateAppearenceData();
                        player.getPackets().sendGameMessage(
                                "You changed your display name back to default.");
                        return true;
                    }
                    if (SerializableFilesManager.containsPlayer(name) || DisplayName.containsDisplay(name)) {
                        player.getPackets().sendGameMessage("This name has already been taken.");
                        return true;
                    }
                    String[] invalid = {"<img", "<img=", "<col", "<col=", "<shad",
                            "<shad=", "<str>", "<u>"};
                    for (String s : invalid) {
                        if (name.contains(s)) {
                            name = name.replace(s, "");
                            player.getPackets().sendGameMessage(
                                    "You cannot add additional code to your name.");
                            return true;
                        }
                    }
                    Utils.formatPlayerNameForDisplay(name);
                    DisplayName.writeDisplayName(name);
                    player.getPackets().sendGameMessage(
                            "You changed your display name to "
                                    + name + ".");
                    player.getPackets().sendGameMessage("Remember this can only be done once every 30 days.");
                    player.setDisplayName(name);
                    player.addDisplayTime(2592000 * 1000);
                    player.getAppearence().generateAppearenceData();
                    return true;

                case "runespan":
                    Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(4297, 6040, 1));
                    player.getControlerManager().startControler("RuneSpanControler");
                    return true;

                case "ticket":
                    if (player.getMuted() > Utils.currentTimeMillis()) {
                        player.getPackets().sendGameMessage(
                                "You temporary muted. Recheck in 48 hours.");
                        return true;
                    }
                    TicketSystem.requestTicket(player);
                    player.getPackets().sendGameMessage("You have sent a ticket, please wait for a staff member to get to you.");
                    return true;

                case "ranks":
                    PkRank.showRanks(player);
                    return true;
                case "score":
                case "kdr":
                    double kill = player.getKillCount();
                    double death = player.getDeathCount();
                    double dr = kill / death;
                    player.setNextForceTalk(new ForceTalk(
                            "<col=ff0000>I've killed " + player.getKillCount()
                                    + " players and have been killed "
                                    + player.getDeathCount() + " times."));
                    return true;
                case "players":
                    player.getInterfaceManager().sendInterface(1245);
                    player.getPackets().sendRunScript(4017,
                            World.getPlayers().size() + 2);
                    int number = 0;
                    for (int i = 0; i < 100; i++) {
                        player.getPackets().sendIComponentText(1245, i, "");
                    }
                    for (Player p : World.getPlayers()) {
                        if (p == null) {
                            continue;
                        }
                        number++;
                        String titles = "";
                        if (p.isADonator()) {
                            titles = "[<img=8><col=1A7009>Regular Donator</col>]";
                        }
                        if (p.isSuperDonator()) {
                            titles = "[<img=10><col=1323D1>Super Donator</col>]";
                        }
                        if (p.isExtremeDonator()) {
                            titles = "[<img=9><col=ffffff><shad=FF0000>Extreme Donator</col></shad>]";
                        }
                        if (p.isLegendDonator()) {
                            titles = "[<img=11><col=ffffff><shad=DB8F0B>Legendary Donator</col></shad>]";
                        }
                        if (p.isUltimateDonator()) {
                            titles = "[<img=14><col=ffffff><shad=ED7818>Ultimate Donator</col></shad>]";
                        }
                        if (p.isMythicDonator()) {
                            titles = "[<img=16><col=ffffff><shad=7E00CC>Mythic Donator</col></shad>]";
                        }
                        if (p.isIronman()) {
                            titles = "[<img=12><col=757778><shad=A7A8A8>Ironman</col>]";
                        }
                        if (p.isSupporter()) {
                            titles = "[<img=13><col=0C87C4>Support Team</col>]";
                        }
                        if (p.isForumModerator()) {
                            titles = "[<img=0><shad=F5D00C><col=ffffff>Forum Moderator</shad></col>]";
                        }
                        if (p.getRights() == 1) {
                            titles = "[<img=0><shad=515756><col=ffffff>Moderator</shad></col>]";
                        }
                        if (p.getRights() == 2) {
                            titles = "[<img=1><col=EDE909>Administrator</col>]";
                        }
                        if (p.getUsername().equalsIgnoreCase(Configs.OWNER)) {
                            titles = "[<img=1><col=ffffff><shad=0000ff>Helwyr Owner</col></shad>]";
                        }
                        if (p.getUsername().equalsIgnoreCase(Configs.CO_OWNER)) {
                            titles = "[<img=1><col=ffffff><shad=0000ff>Helwyr Co-Owner</col></shad>]";
                        }
                        if (p.getUsername().equalsIgnoreCase(Configs.SERVER_MANAGER)) {
                            titles = "[<img=1><col=ffffff><shad=0000ff>Helwyr Manager</col></shad>]";
                        }
                        if (p.getUsername().equalsIgnoreCase(Configs.SERVER_DEVELOPER)) {
                            titles = "[<img=1><col=ffffff><shad=7A0996>Helwyr Developer</col></shad>]";
                        }
                        if (p.getUsername().equalsIgnoreCase(Configs.WEB_DEVELOPER)) {
                            titles = "[<img=1><col=ffffff><shad=7A0996>Helwyr Web Developer</col></shad>]";
                        }
                        if (p.getUsername().equalsIgnoreCase(Configs.HEAD_MODERATOR)) {
                            titles = "[<img=0><col=515756>Head Moderator</col>]";
                        }
                        if (p.getUsername().equalsIgnoreCase(Configs.HEAD_SUPPORT)) {
                            titles = "[<img=13><col=0C87C4>Head Support</col>]";
                        }
                        if (p.getRights() == 0) {
                            //titles = "[" + p.getClassManager().getClassNameWithColor() + "]";
                        }
                        player.getPackets().sendIComponentText(1245, 14 + number,
                                titles + p.getDisplayName());
                    }
                    player.getPackets().sendIComponentText(1245, 330,
                            "Helwyr Players Online");
                    player.getPackets().sendIComponentText(1245, 13,
                            "Players Online: " + number);
                    player.getPackets().sendGameMessage(
                            "There are currently " + World.getPlayers().size()
                                    + " players online.");
                    return true;

                case "title":
                    if (!player.isADonator()) {
                        player.getPackets().sendGameMessage(
                                "You do not have the privileges to use this.");
                        return true;
                    }
                    if (Integer.valueOf(cmd[1]) > 90) {
                        player.sm("You are restricted from using this title.");
                    }
                    if (cmd.length < 2) {
                        player.getPackets().sendGameMessage("Use: ::title id");
                        return true;
                    }
                    try {
                        player.getAppearence().setTitle(Integer.valueOf(cmd[1]));
                    } catch (NumberFormatException e) {
                        player.getPackets().sendGameMessage("Use: ::title id");
                    }
                    return true;

                case "setname":
                    if (!player.isSuperDonator()) {
                        player.getPackets().sendGameMessage(
                                "You must be a Super Donator to use this feature.");
                        player.sm("To remove your current display name, type ::removedisplay.");
                        return true;
                    }
                    player.getTemporaryAttributtes().put("setdisplay", Boolean.TRUE);
                    player.getPackets().sendInputNameScript("Enter the display name you wish:");
                    return true;

                case "bank":
                case "b":
                    if (player.getControlerManager().getControler() instanceof StealingCreationLobbyController ||
                            player.getControlerManager().getControler() instanceof StealingCreationController) {
                        return false;
                    }
                    if (Miscellania.isInArea(player)) {
                        player.getPackets().sendGameMessage("You can't bank while you're in this area.");
                        return false;
                    }
                    if (!player.canSpawn()) {
                        player.getPackets().sendGameMessage(
                                "You can't bank while you're in this area.");
                        return false;
                    }
                    if (!player.isASuperDonator()) {
                        player.getPackets().sendGameMessage(
                                "You do not have the privileges to use this.");
                        return false;
                    }
                    if (player.isSuperDonator() || player.isLegendDonator()) {
                        if (!Wilderness.isAtWild(player) && !FfaZone.inShadowBoss(player)) {
                            player.stopAll();
                            player.getBank().openBank();
                            return true;
                        } else {
                            player.sm("You cannot bank here..");
                            return false;
                        }
                    }
                    player.stopAll();
                    player.getBank().openBank();
                    return true;

                case "blueskin":
                    if (!player.isADonator()) {
                        player.getPackets().sendGameMessage(
                                "You do not have the privileges to use this.");
                        return true;
                    }
                    player.getAppearence().setSkinColor(12);
                    player.getAppearence().generateAppearenceData();
                    return true;

                case "greenskin":
                    if (!player.isADonator()) {
                        player.getPackets().sendGameMessage(
                                "You do not have the privileges to use this.");
                        return true;
                    }
                    player.getAppearence().setSkinColor(13);
                    player.getAppearence().generateAppearenceData();
                    return true;

                case "beforename":
                    if (!player.isSuperDonator() || !player.isLegendDonator()) {
                        player.getPackets().sendGameMessage(
                                "You do not have the privileges to use this.");
                        return true;
                    }
                    player.getAppearence().setTitle(900);
                    player.getAppearence().generateAppearenceData();
                    return true;

                case "aftername":
                    if (!player.isSuperDonator() || !player.isLegendDonator()) {
                        player.getPackets().sendGameMessage(
                                "You do not have the privileges to use this.");
                        return true;
                    }
                    player.getAppearence().setTitle(901);
                    player.getAppearence().generateAppearenceData();
                    return true;


                case "claimdonation":
                case "donated":
                    try {
                        //player.rspsdata(player, player.getUsername());
                        new Thread(new Donation(player)).start();
                    } catch (Exception e) {
                    }
                    break;

                case "makeover":
                    PlayerLook.openCharacterCustomizing(player);
                    break;

                case "authcode":
                case "auth":
                case "claim":
                case "claimvote":
                case "voted":
                case "redeem":
                    if (cmd.length < 2) {
                        player.output("Incorrect Syntax: ;;claim (auth code)");
                        return false;
                    }
				/*String auth = cmd[1];
				boolean success = Launcher.motivote.redeemVote(auth);
				if(success) {
					if(!player.getInventory().hasFreeSlots()) {
						player.getBank().addItem(20936, 1, false);
						player.getPackets().sendGameMessage("Your vote reward has been sent to your bank. Thank you for your support!");
					} else {
						player.getInventory().addItem(20936, 1);
					}
					World.sendWorldMessage("<img=5><col=ffffff><shad=0000ff>" + player.getDisplayName() + " has just voted! Remember to vote every 12 hours.");
					player.refreshLastVote();
				} else {
					player.getPackets().sendGameMessage("Invalid auth supplied, please try again later.");
				}*/
                    return true;

                case "bosskills":
                    player.showBossKills(player);
                    break;
                case "patchnotes":
                    Player.openPatchNotes(player);
                    return true;
                case "report":
                case "bug":
                    if (cmd.length < 2) {
                        player.getPackets().sendGameMessage("Incorect Syntax: ;;bug/report (description of bug)");
                        return false;
                    }
                    String bug = "";
                    bug = cmd[1];
                    Logger.report(player, bug, true);
                    break;
                case "suggest":
                case "idea":
                    if (cmd.length < 2) {
                        player.getPackets().sendGameMessage("Incorect Syntax: ;;bug/report (description of bug)");
                        return false;
                    }
                    String idea = "";
                    for (int i = 1; i < cmd.length; i++)
                        idea += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    Logger.report(player, idea, false);
                    break;
                case "dzs":
                    player.getCutscenesManager().play(new DZGuideScene());
                    return true;
                case "dz":
                    player.teleport(3787, 4359, 1);
                    return true;
                case "songoftheday":
                    player.getPackets().sendOpenURL(Settings.SONG_OF_THE_DAY);
                    break;
                case "commands":
                    String list = "::Home"
                            + " <br>"
                            + "::Market"
                            + "<br>"
                            + "::Train/Teleport"
                            + "<br>"
                            + "::Events (Shows active skill/minigame events)"
                            + "<br>"
                            + "::Players"
                            + "<br>"
                            + "::Empty"
                            + "<br>"
                            + "::Ticket"
                            + "<br>"
                            + "::Answer (Trivia answer)"
                            + "<br>"
                            + "::Claim (Voting reward)"
                            + "<br>"
                            + "::Pricecheck/::pc (itemId) [Shows sell back price to shops]"
                            + "<br>"
                            + "::Gepricecheck/::gpc (itemId) [Shows sell/buy price in ge]"
                            + "<br>"
                            + "::Website"
                            + "<br>"
                            + "::Vote"
                            + "<br>"
                            + "::Highscores/::Leaderboards"
                            + "<br>"
                            + "::Forum"
                            + "<br>"
                            + "::Donate"
                            + "<br>"
                            + "::Db/::donatorbenefits (view the benefits of being a donator)"
                            + "<br>"
                            + "::Topic (id)/::Thread (id)"
                            + "<br>"
                            + "::Quests (Shows which quests are fully working)"
                            + "<br>"
                            + "::Edge (teleports you to edgeville)"
                            + "<br>"
                            + "::Makeover"
                            + "<br>"
                            + "::Task (Tells you your current slayer task"
                            + "<br>"
                            + "::Tts/rtime (Shows the time left until server restart)"
                            + "<br>"
                            + "";
                    player.getInterfaceManager().sendInterface(1166);
                    player.getPackets().sendIComponentText(1166, 23, "Helwyr Commands");
                    player.getPackets().sendIComponentText(1166, 1, list);
                    player.getPackets().sendIComponentText(1166, 2, "");
                    break;
                case "pricecheck":
                case "pc":
                    if (cmd.length < 2) {
                        player.getPackets().sendGameMessage("Syntax: pc: id");
                        return false;
                    }
                    int price = Integer.valueOf(cmd[1]);
                    Item item = new Item(price);
                    player.getPackets().sendGameMessage(Utils.formatString(item.getName()) + " is currently selling for " + Utils.formatNumber(Shop.getSellPrice(item, player)) + " coins in the general store.");
                    break;
                case "gepricecheck":
                case "gpc":
                    if (cmd.length < 2) {
                        player.getPackets().sendGameMessage("Syntax: gpc: id");
                        return false;
                    }
                    price = Integer.valueOf(cmd[1]);
                    item = new Item(price);
                    player.getPackets().sendGameMessage(Utils.formatString(item.getName()) + " is currently selling for " + ItemDefinitions.getItemDefinitions(item.getId()).getValue(item.getId()) + " coins in the grand exchange.");
                    break;
                case "quests":
                    String quests = "Rune Mysteries"
                            + "<br>"
                            + "Pirates Treasure"
                            + "<br>"
                            + "Prince ali Rescue"
                            + "<br>"
                            + "";
                    player.getInterfaceManager().sendInterface(1166);
                    player.getPackets().sendIComponentText(1166, 23, "Helwyr Commands");
                    player.getPackets().sendIComponentText(1166, 1, quests);
                    player.getPackets().sendIComponentText(1166, 2, "");
                    break;
                case "tts":
                case "rtime":
                case "restartt":
                    player.getPackets().sendGameMessage("<img=5>[<col=FFFFFF><shad=EB901A>Server Restart Reminder</shad></col>] - <col=FFFFFF><shad=EB901A>" + Configs.SERVER_NAME + " will restart in " + World.restartTimerLeft + (World.restartTimerLeft == 1 ? " hour" : " hours") + ".");
                    break;
                case "teleports":
                case "teleport":
                case "train":
                    TeleportInterface.openSelectSkill(player);
                    break;
                case "answer":
                    if (cmd.length >= 2) {
                        String answer = cmd[1];
                        if (cmd.length == 3) {
                            answer = cmd[1] + " " + cmd[2];
                        }
                        if (cmd.length == 4) {
                            answer = cmd[1] + " " + cmd[2] + " " + cmd[3];
                        }
                        if (cmd.length == 5) {
                            answer = cmd[1] + " " + cmd[2] + " " + cmd[3] + " " + cmd[4];
                        }
                        if (cmd.length == 6) {
                            answer = cmd[1] + " " + cmd[2] + " " + cmd[3] + " " + cmd[4] + " " + cmd[5];
                        }
                        TriviaBot.verifyAnswer(player, answer);
                    } else {
                        player.sm("Syntax is ::" + cmd[0] + " <answer input>.");
                    }
                    return true;
                case "hideyell":
                    player.setYellOff(!player.isYellOff());
                    player.getPackets().sendGameMessage("You have turned " + (player.isYellOff() ? "off" : "on") + " yell.");
                    return true;

                case "changepass":
                case "changepassword":
                case "password":
                    message = "";
                    for (int i = 1; i < cmd.length; i++)
                        message += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    if (message.length() > 15 || message.length() < 5) {
                        player.getPackets().sendGameMessage(
                                "You cannot set your password to over 15 chars.");
                        return true;
                    }
                    player.setPassword(Encrypt.encryptSHA1(cmd[1]));
                    player.getPackets().sendGameMessage(
                            "You changed your password! Your password is " + cmd[1]
                                    + ".");
                    return true;

                case "yell":
                    message = "";
                    for (int i = 1; i < cmd.length; i++)
                        message += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
                    sendYell(player, Utils.fixChatMessage(message), false);
                    return true;

                case "switchitemslook":
                case "itemslook":
                    player.switchItemsLook();
                    player.getPackets().sendGameMessage("You are now playing with " + (player.isOldItemsLook() ? "old" : "new") + " item looks.");
                    return true;

            }
        }
        return true;
    }

    //final AIPlayer aip = AIPBuilder.create(aipName, generateLocation(player));
    private static WorldTile generateLocation(Player player) {
        WorldTile random_location = player.getLastWorldTile().transform(Utils.random(-15, 15), Utils.random(-15, 15), 0);
		/*if (!RegionManager.isTeleportPermitted(random_location)) {
			return generateLocation(player);
		}*/
        if (!World.canMoveNPC(random_location, player.getSize())) {
            return generateLocation(player);
        }
        return random_location;
    }


    public static void archiveLogs(Player player, String[] cmd) {
        try {
            if (player.getRights() < 1)
                return;
            String location = "";
            if (player.getRights() == 2) {
                location = "data/logs/admin/" + player.getUsername() + ".txt";
            } else if (player.getRights() == 1) {
                location = "data/logs/mod/" + player.getUsername() + ".txt";
            }
            String afterCMD = "";
            for (int i = 1; i < cmd.length; i++)
                afterCMD += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
            BufferedWriter writer = new BufferedWriter(new FileWriter(location,
                    true));
            writer.write("[" + currentTime("dd MMMMM yyyy 'at' hh:mm:ss z") + "] - ::"
                    + cmd[0] + " " + afterCMD);
            writer.newLine();
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String currentTime(String dateFormat) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        return sdf.format(cal.getTime());
    }

    /*
	 * doesnt let it be instanced
	 */
    private Commands() {

    }
}