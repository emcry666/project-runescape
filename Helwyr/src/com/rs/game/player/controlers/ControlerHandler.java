package com.rs.game.player.controlers;

import java.util.HashMap;

import com.rs.game.minigames.BrimhavenAgility;
import com.rs.game.minigames.PuroPuro;
import com.rs.game.minigames.RefugeOfFear;
import com.rs.game.minigames.clanwars.FfaZone;
import com.rs.game.minigames.clanwars.RequestController;
import com.rs.game.minigames.clanwars.WarControler;
import com.rs.game.minigames.duel.ArenaControler;
import com.rs.game.minigames.duel.LobbyControler;
import com.rs.game.npc.vorago.VoragoController;
import com.rs.game.player.content.instancing.bossInstance.BossInstanceController;
import com.rs.game.player.content.stealingcreations.StealingCreationController;
import com.rs.game.player.content.stealingcreations.StealingCreationLobbyController;
import com.rs.game.player.controlers.bosses.AraxxiInstanceController;
import com.rs.game.player.controlers.bosses.KalphiteKingInstanceController;
import com.rs.game.player.controlers.bosses.SkeletalHorrorController;
import com.rs.game.player.controlers.castlewars.CastleWarsPlaying;
import com.rs.game.player.controlers.castlewars.CastleWarsWaiting;
import com.rs.game.player.controlers.events.DeathEvent;
import com.rs.game.player.controlers.fightpits.FightPitsArena;
import com.rs.game.player.controlers.fightpits.FightPitsLobby;
import com.rs.utils.Logger;

public class ControlerHandler {

	private static final HashMap<Object, Class<Controler>> handledControlers = new HashMap<Object, Class<Controler>>();

	@SuppressWarnings("unchecked")
	public static final void init() {
		try {
			Class<Controler> value122 = (Class<Controler>) Class
					.forName(SkeletalHorrorController.class.getCanonicalName());
			handledControlers.put("SkeletalHorrorController", value122);
			Class<Controler> value1 = (Class<Controler>) Class
					.forName(Wilderness.class.getCanonicalName());
			handledControlers.put("Wilderness", value1);
			Class<Controler> value4 = (Class<Controler>) Class
					.forName(GodWars.class.getCanonicalName());
			handledControlers.put("GodWars", value4);
			Class<Controler> value5 = (Class<Controler>) Class
					.forName(ZGDControler.class.getCanonicalName());
			handledControlers.put("ZGDControler", value5);
			Class<Controler> value6 = (Class<Controler>) Class
					.forName(TutorialIsland.class.getCanonicalName());
			handledControlers.put("TutorialIsland", value6);
			Class<Controler> value7 = (Class<Controler>) Class
					.forName(StartTutorial.class.getCanonicalName());
			handledControlers.put("StartTutorial", value7);
			
			Class<Controler> value11 = (Class<Controler>) Class
					.forName(CorpBeastControler.class.getCanonicalName());
			handledControlers.put("CorpBeastControler", value11);
			Class<Controler> value14 = (Class<Controler>) Class
					.forName(DTControler.class.getCanonicalName());
			handledControlers.put("DTControler", value14);
			Class<Controler> value15 = (Class<Controler>) Class
					.forName(JailControler.class.getCanonicalName());
			handledControlers.put("JailControler", value15);
			Class<Controler> value17 = (Class<Controler>) Class
					.forName(CastleWarsPlaying.class.getCanonicalName());
			handledControlers.put("CastleWarsPlaying", value17);
			Class<Controler> value18 = (Class<Controler>) Class
					.forName(CastleWarsWaiting.class.getCanonicalName());
			handledControlers.put("CastleWarsWaiting", value18);
			
			Class<Controler> value25 = (Class<Controler>) Class
					.forName(SafeFree.class.getCanonicalName());
			handledControlers.put("SafeFree", value25);
			
			Class<Controler> value26 = (Class<Controler>) Class
					.forName(DungeonController.class.getCanonicalName());
			handledControlers.put("DungeonController", value26);

			Class<Controler> value29 = (Class<Controler>) Class
					.forName(SawmillController.class.getCanonicalName());
			handledControlers.put("SawmillController", value29);
			
			Class<Controler> value30 = (Class<Controler>) Class
					.forName(PuroPuro.class.getCanonicalName());
			handledControlers.put("PuroPuro", value30);
			
			Class<Controler> value31 = (Class<Controler>) Class
					.forName(VoragoController.class.getCanonicalName());
			handledControlers.put("VoragoController", value31);
			
			Class<Controler> value32 = (Class<Controler>) Class
					.forName(KalphiteKingInstanceController.class.getCanonicalName());
			handledControlers.put("KalphiteKingInstanceController", value32);
			
			Class<Controler> value33 = (Class<Controler>) Class
					.forName(BossInstanceController.class.getCanonicalName());
			handledControlers.put("BossInstanceController", value33);
			
			Class<Controler> value34 = (Class<Controler>) Class
					.forName(AraxxiInstanceController.class.getCanonicalName());
			handledControlers.put("AraxxiInstanceController", value34);
			
			Class<Controler> value35 = (Class<Controler>) Class
					.forName(Kalaboss.class.getCanonicalName());
			handledControlers.put("Kalaboss", value35);
			
			handledControlers.put("UnderGroundDungeon",
					(Class<Controler>) Class.forName(UnderGroundDungeon.class
							.getCanonicalName()));
			Class<Controler> value20 = (Class<Controler>) Class
					.forName(NewHomeControler.class.getCanonicalName());
			handledControlers.put("NewHomeControler", value20);
			handledControlers.put("RecipeforDisaster", (Class<Controler>) Class.forName(RecipeforDisaster.class.getCanonicalName()));
			handledControlers.put("clan_wars_request", (Class<Controler>) Class.forName(RequestController.class.getCanonicalName()));
			handledControlers.put("clan_war", (Class<Controler>) Class.forName(WarControler.class.getCanonicalName()));
			handledControlers.put("clan_wars_ffa", (Class<Controler>) Class.forName(FfaZone.class.getCanonicalName()));
			handledControlers.put("NomadsRequiem", (Class<Controler>) Class.forName(NomadsRequiem.class.getCanonicalName()));
			handledControlers.put("BorkControler", (Class<Controler>) Class.forName(BorkControler.class.getCanonicalName()));	
			handledControlers.put("BrimhavenAgility", (Class<Controler>) Class.forName(BrimhavenAgility.class.getCanonicalName()));
			handledControlers.put("FightCavesControler", (Class<Controler>) Class.forName(FightCaves.class.getCanonicalName()));
			handledControlers.put("FightKilnControler", (Class<Controler>) Class.forName(FightKiln.class.getCanonicalName()));
			handledControlers.put("FightPitsLobby", (Class<Controler>) Class.forName(FightPitsLobby.class.getCanonicalName()));
			handledControlers.put("FightPitsArena", (Class<Controler>) Class.forName(FightPitsArena.class.getCanonicalName()));
			handledControlers.put("Barrows", (Class<Controler>) Class.forName(Barrows.class.getCanonicalName()));
			handledControlers.put("RefugeOfFear", (Class<Controler>) Class.forName(RefugeOfFear.class.getCanonicalName()));
			handledControlers.put("Falconry", (Class<Controler>) Class.forName(Falconry.class.getCanonicalName()));
			handledControlers.put("QueenBlackDragonControler", (Class<Controler>) Class.forName(QueenBlackDragonController.class.getCanonicalName()));
			handledControlers.put("HouseControler", (Class<Controler>) Class.forName(HouseControler.class.getCanonicalName()));
			handledControlers.put("RuneSpanControler", (Class<Controler>) Class.forName(RunespanControler.class.getCanonicalName()));
			handledControlers.put("DeathEvent", (Class<Controler>) Class.forName(DeathEvent.class.getCanonicalName()));
			handledControlers.put("SorceressGarden", (Class<Controler>) Class.forName(SorceressGarden.class.getCanonicalName()));
			handledControlers.put("CrucibleControler", (Class<Controler>) Class.forName(CrucibleControler.class.getCanonicalName()));
			handledControlers.put("LobbyControler", (Class<Controler>) Class.forName(LobbyControler.class.getCanonicalName()));
			handledControlers.put("ArenaControler", (Class<Controler>) Class.forName(ArenaControler.class.getCanonicalName()));
			handledControlers.put("StealingCreationLobby", (Class<Controler>) Class.forName(StealingCreationLobbyController.class.getCanonicalName()));
		    handledControlers.put("StealingCreationGame", (Class<Controler>) Class.forName(StealingCreationController.class.getCanonicalName()));
		    handledControlers.put("BossInstanceController", (Class<Controler>) Class.forName(BossInstanceController.class.getCanonicalName()));
		    handledControlers.put("CitadelControler", (Class<Controler>) Class.forName(CitadelControler.class.getCanonicalName()));
		} catch (Throwable e) {
			Logger.handle(e);
		}
	}

	public static final void reload() {
		handledControlers.clear();
		init();
	}

	public static final Controler getControler(Object key) {
		if (key instanceof Controler)
			return (Controler) key;
		Class<Controler> classC = handledControlers.get(key);
		if (classC == null)
			return null;
		try {
			return classC.newInstance();
		} catch (Throwable e) {
			Logger.handle(e);
		}
		return null;
	}
}
