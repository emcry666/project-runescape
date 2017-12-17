package com.rs.game.player.dialogues;

import java.security.InvalidParameterException;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.game.npc.NPC;
import com.rs.game.player.Player;
import com.rs.utils.Utils;

public abstract class Dialogue {

	protected Player player;
	protected int stage = -1;

	public Dialogue() {

	}
	
	public Object[] parameters;
	protected int npcId;

	public void setPlayer(Player player) {
		this.player = player;
	}

	public int getNPCID() {
		return -1;
	}
	
	protected NPC npc;

	public abstract void start();

	public abstract void run(int interfaceId, int componentId);

	public abstract void finish();

	protected final void close() {
		player.getDialogueManager().finishDialogue();
	}
	protected final void end() {
		player.getDialogueManager().finishDialogue();
	}
	
	public String generateRandomGreetings() {
		return RANDOM_GREETINGS[Utils.random(4)];
	}

	public String generateRandomResponses() {
		return RANDOM_RESPONSES[Utils.random(2)];
	}
	
	public static final String[] RANDOM_GREETINGS = { "Hello there.", "Howdy.", "Good day.", "Salutations!", "Greetings.", "Nice to meet you." };

	public static final String[] RANDOM_RESPONSES = { "Good day to you, adventurer.", "Well met, adventurer.", "Well, hello there." };


	protected static final short SEND_1_TEXT_INFO = 210;
	protected static final short SEND_2_TEXT_INFO = 211;
	protected static final short SEND_3_TEXT_INFO = 212;
	protected static final short SEND_4_TEXT_INFO = 213;
	protected static final String DEFAULT = "Select an Option";
	protected static final String DEFAULT_OPTIONS_TITLE = "Select an Option";
	protected static final short SEND_2_OPTIONS = 236;
	protected static final short SEND_3_OPTIONS = 230;
	protected static final short SEND_4_OPTIONS = 237;
	protected static final short SEND_5_OPTIONS = 238;
	protected static final short SEND_2_LARGE_OPTIONS = 229;
	protected static final short SEND_3_LARGE_OPTIONS = 231;
	protected static final short SEND_1_TEXT_CHAT = 241;
	protected static final short SEND_2_TEXT_CHAT = 242;
	protected static final short SEND_3_TEXT_CHAT = 243;
	protected static final short SEND_4_TEXT_CHAT = 244;
	protected static final short SEND_NO_CONTINUE_1_TEXT_CHAT = 245;
	protected static final short SEND_NO_CONTINUE_2_TEXT_CHAT = 246;
	protected static final short SEND_NO_CONTINUE_3_TEXT_CHAT = 247;
	protected static final short SEND_NO_CONTINUE_4_TEXT_CHAT = 248;
	protected static final short SEND_NO_EMOTE = -1;
	protected static final byte IS_NOTHING = -1;
	protected static final byte IS_PLAYER = 0;
	public static final byte IS_NPC = 1;
	protected static final byte IS_ITEM = 2;
	public static final int HAPPY_FACE = 9843;
	public static final int ASKING_FACE = 9829;
	public static final int BLANK_FACE = 9772;
	public static final int SAD_FACE = 9768;
	public static final int UPSET_FACE = 9776;
	public static final int SCARED_FACE = 9780;
	public static final int MILDLY_ANGRY_FACE = 9784;
	public static final int ANGRY_FACE = 9788;
	public static final int VERY_ANGRY_FACE = 9792;
	public static final int MANIAC_FACE = 9800;
	public static final int NOT_TALKING_JUST_LISTENING_FACE = 9804;
	public static final int PLAIN_TALKING_FACE = 9808;
	public static final int WTF_FACE = 9820;
	public static final int SHAKING_NO_FACE = 9824;
	public static final int UNSURE_FACE = 9836;
	public static final int LISTENS_THEN_LAUGHS_FACE = 9840;
	public static final int GOOFY_LAUGH_FACE = 9851;
	public static final int THINKING_THEN_TALKING_FACE = 9859;
	public static final int NONONO_FACE = 9844;
	public static final int SAD_WTF_FACE = 9776;
	protected static final int REALLY_SAD = 9760, 
			DEPRESSED = 9770, 
			MEAN_FACE = 9785, 
			MEAN_HEAD_BANG = 9790, 
			EVIL = 9795, 
			WHAT_THE_CRAP = 9800, 
			CALM = 9805, 
			CALM_TALK = 9810, 
			TOUGH = 9815, 
			SNOBBY = 9820, 
			SNOBBY_HEAD_MOVE = 9825, 
			DRUNK_HAPPY_TIRED = 9835, 
			TALKING_ALOT = 9845, 
			HAPPY = 9850, 
			BAD_ASS = 9855, 
			THINKING = 9860, 
			COOL_YES = 9864, 
			LAUGH_EXCITED = 9851, 
			NORMAL = 9827,
			WORRIED = 9775, 
			CONFUSED = 9830,
			DRUNK = 9835, 
			MAD = 9785, 
			ANGERY = 9790, 
			SAD = 9775, 
			SCARED = 9780,
			SECRELTY_TALKING = 9838,
			ASKING = 9829,
			BLANK = 9772,
			UPSET = 9776,
			MILDLY_ANGRY = 9784,
			ANGRY = 9784,
			VERY_ANGRY = 9792,
			MANIAC = 9800,
			NOT_TALKING_JUST_LISTENING = 9804,
			PLAIN_TALKING = 9808,
			UNSURE = 9836,
			LISTENS_THEN_LAUGHS = 9840,
			GOOFY_LAUGH = 9851,
			THINKING_THEN_TALKING = 9859,
			NONONO = 9844,
			SAD_SHOCKED = 9776;


	private static int[] getIComponentsIds(short interId) {
		int[] childOptions;
		switch (interId) {
		case SEND_1_TEXT_INFO:
			childOptions = new int[1];
			childOptions[0] = 1;
			break;
		case SEND_2_TEXT_INFO:
			childOptions = new int[2];
			childOptions[0] = 1;
			childOptions[1] = 2;
			break;
		case SEND_3_TEXT_INFO:
			childOptions = new int[3];
			childOptions[0] = 1;
			childOptions[1] = 2;
			childOptions[2] = 3;
			break;
		case SEND_4_TEXT_INFO:
			childOptions = new int[4];
			childOptions[0] = 1;
			childOptions[1] = 2;
			childOptions[2] = 3;
			childOptions[3] = 4;
			break;
		case SEND_2_LARGE_OPTIONS:
			childOptions = new int[3];
			childOptions[0] = 1;
			childOptions[1] = 2;
			childOptions[2] = 3;
			break;
		case SEND_3_LARGE_OPTIONS:
			childOptions = new int[4];
			childOptions[0] = 1;
			childOptions[1] = 2;
			childOptions[2] = 3;
			childOptions[3] = 4;
			break;
		case SEND_2_OPTIONS:
			childOptions = new int[3];
			childOptions[0] = 0;
			childOptions[1] = 1;
			childOptions[2] = 2;
			break;
		case SEND_3_OPTIONS:
			childOptions = new int[4];
			childOptions[0] = 1;
			childOptions[1] = 2;
			childOptions[2] = 3;
			childOptions[3] = 4;
			break;
		case SEND_4_OPTIONS:
			childOptions = new int[5];
			childOptions[0] = 0;
			childOptions[1] = 1;
			childOptions[2] = 2;
			childOptions[3] = 3;
			childOptions[4] = 4;
			break;
		case SEND_5_OPTIONS:
			childOptions = new int[6];
			childOptions[0] = 0;
			childOptions[1] = 1;
			childOptions[2] = 2;
			childOptions[3] = 3;
			childOptions[4] = 4;
			childOptions[5] = 5;
			break;
		case SEND_1_TEXT_CHAT:
		case SEND_NO_CONTINUE_1_TEXT_CHAT:
			childOptions = new int[2];
			childOptions[0] = 3;
			childOptions[1] = 4;
			break;
		case SEND_2_TEXT_CHAT:
		case SEND_NO_CONTINUE_2_TEXT_CHAT:
			childOptions = new int[3];
			childOptions[0] = 3;
			childOptions[1] = 4;
			childOptions[2] = 5;
			break;
		case SEND_3_TEXT_CHAT:
		case SEND_NO_CONTINUE_3_TEXT_CHAT:
			childOptions = new int[4];
			childOptions[0] = 3;
			childOptions[1] = 4;
			childOptions[2] = 5;
			childOptions[3] = 6;
			break;
		case SEND_4_TEXT_CHAT:
		case SEND_NO_CONTINUE_4_TEXT_CHAT:
			childOptions = new int[5];
			childOptions[0] = 3;
			childOptions[1] = 4;
			childOptions[2] = 5;
			childOptions[3] = 6;
			childOptions[4] = 7;
			break;
		default:
			return null;
		}
		return childOptions;
	}

	public boolean sendNPCDialogue(int npcId, int animationId, String... text) {
		return sendEntityDialogue(IS_NPC, npcId, animationId, text);
	}
	
	public boolean npc(int animationId, String... text) {
		return entity(IS_NPC, npcId, animationId, text);
	}

	public boolean npc(int npcId, int animationId, String... text) {
		return entity(IS_NPC, npcId, animationId, text);
	}

	public boolean sendPlayerDialogue(int animationId, String... text) {
		return sendEntityDialogue(IS_PLAYER, -1, animationId, text);
	}
	
	public boolean player(int animationId, String... text) {
		return entity(IS_PLAYER, -1, animationId, text);
	}

	public boolean item(int itemId, String... text) {
		return entity(IS_ITEM, itemId, -1, text);
	}

	public static boolean npcNoContinue(Player player, int npcId, int animationId, String... text) {
		return entityNoContinue(player, IS_NPC, npcId, animationId, text);
	}

	public static boolean playerNoContinue(Player player, int animationId, String... text) {
		return entityNoContinue(player, IS_PLAYER, -1, animationId, text);
	}

	public static void noContinue(Player player) {
		player.getInterfaceManager().closeReplacedRealChatBoxInterface();
	}

	/*
	 * 
	 * auto selects title, new dialogues
	 */
	public boolean entity(int type, int entityId, int animationId, String... text) {
		String title = "";
		if (type == IS_PLAYER) {
			title = player.getDisplayName();
		} else if (type == IS_NPC) {
			title = NPCDefinitions.getNPCDefinitions(entityId).name;
		} else if (type == IS_ITEM)
			title = ItemDefinitions.getItemDefinitions(entityId).getName();
		return entity(type, title, entityId, animationId, text);
	}
	
	/*
	 * 
	 * auto selects title, new dialogues
	 */
	public static boolean entityNoContinue(Player player, int type, int entityId, int animationId, String... text) {
		String title = "";
		if (type == IS_PLAYER) {
			title = player.getDisplayName();
		} else if (type == IS_NPC) {
			title = NPCDefinitions.getNPCDefinitions(entityId).name;
		} else if (type == IS_ITEM)
			title = ItemDefinitions.getItemDefinitions(entityId).getName();
		return entityNoContinue(player, type, title, entityId, animationId, text);
	}

	public static boolean entityNoContinue(Player player, int type, String title, int entityId, int animationId, String... texts) {
		StringBuilder builder = new StringBuilder();
		for (int line = 0; line < texts.length; line++)
			builder.append(" " + texts[line]);
		String text = builder.toString();
		player.getInterfaceManager().replaceRealChatBoxInterface(1192);
		player.getPackets().sendIComponentText(1192, 16, title);
		player.getPackets().sendIComponentText(1192, 12, text);
		player.getPackets().sendEntityOnIComponent(type == IS_PLAYER, entityId, 1192, 11);
		if (animationId != -1)
			player.getPackets().sendIComponentAnimation(animationId, 1192, 11);
		return true;
	}
	
	public void sendNPCChat(Mood mood, String... text) {
		sendNPCDialogue(getNPCID(), mood.getIndex(), text);
	}

	public void sendPlayerChat(Mood mood, String... text) {
		StringBuilder dialogue = new StringBuilder(player.getDisplayName() + "%65%");
		for (int i = 0; i < text.length; i++)
			dialogue.append(text[i] + "%65%");
		sendEntityDialogue(SEND_1_TEXT_CHAT, dialogue.toString().split("%65%"), IS_PLAYER, player.getIndex(), mood.getIndex());
	}
	
	public boolean sendHandedItem(int item, String... text) {
		StringBuilder builder = new StringBuilder();
		for (int line = 0; line < text.length; line++)
			builder.append((line == 0 ? "<p=" + getP() + ">" : "<br>") + text[line]);
		String texts = builder.toString();
		int amount = 1;
		player.getInterfaceManager().sendChatBoxInterface(1189);
		player.getPackets().sendIComponentText(1189, 4, texts);
		player.getPackets().sendItemOnIComponent(1189, 1, item, amount);
		return true;
	}
	public boolean sendItemDialogue(int item, String... text) {
		StringBuilder builder = new StringBuilder();
		for (int line = 0; line < text.length; line++)
			builder.append((line == 0 ? "<p=" + getP() + ">" : "<br>") + text[line]);
		String texts = builder.toString();
		int amount = 1;
		player.getInterfaceManager().sendChatBoxInterface(1189);
		player.getPackets().sendIComponentText(1189, 4, texts);
		player.getPackets().sendItemOnIComponent(1189, 1, item, amount);
		return true;
	}
	

	/*
	 * new dialogues
	 */
	public boolean entity(int type, String title, int entityId,
			int animationId, String... texts) {
		StringBuilder builder = new StringBuilder();
		for (int line = 0; line < texts.length; line++)
			builder.append(" " + texts[line]);
		String text = builder.toString();
		if (type == IS_NPC) {
			player.getInterfaceManager().sendChatBoxInterface(1184);
			player.getPackets().sendIComponentText(1184, 17, title);
			player.getPackets().sendIComponentText(1184, 13, text);
			player.getPackets().sendNPCOnIComponent(1184, 11, entityId);
			if (animationId != -1)
				player.getPackets().sendIComponentAnimation(animationId, 1184,
						11);
		} else if (type == IS_PLAYER) {
			player.getInterfaceManager().sendChatBoxInterface(1191);
			player.getPackets().sendIComponentText(1191, 8, title);
			player.getPackets().sendIComponentText(1191, 17, text);
			player.getPackets().sendPlayerOnIComponent(1191, 15);
			if (animationId != -1)
				player.getPackets().sendIComponentAnimation(animationId, 1191,
						15);
		} else if (type == IS_ITEM) {
			player.getInterfaceManager().sendChatBoxInterface(1184);
			for (int i = 0; i < 3; i++)
				player.getPackets().sendHideIComponent(1184, 14 + i, true);
			player.getPackets().sendIComponentText(1184, 17, title);
			player.getPackets().sendIComponentText(1184, 13, text);
			player.getPackets().sendItemOnIComponent(1184, 11, entityId, 1); // there
			// is
			// a
			// config
			// for
			// this
			if (animationId != -1)
				player.getPackets().sendIComponentAnimation(animationId, 1184,
						11);
		}
		return true;
	}

	public boolean dialogue(String... texts) {
		StringBuilder builder = new StringBuilder();
		for (int line = 0; line < texts.length; line++)
			builder.append((line == 0 ? "<p=" + getP() + ">" : "<br>") + texts[line]);
		String text = builder.toString();
		player.getInterfaceManager().sendChatBoxInterface(1186);
		player.getPackets().sendIComponentText(1186, 1, text);
		return true;
	}

	public boolean entity(short interId, String[] talkDefinitons, byte type, int entityId, int animationId) {
		if (type == IS_PLAYER || type == IS_NPC) { // auto convert to new
			// dialogue all old
			// dialogues
			String[] texts = new String[talkDefinitons.length - 1];
			for (int i = 0; i < texts.length; i++)
				texts[i] = talkDefinitons[i + 1];
			entity(type, talkDefinitons[0], entityId, animationId, texts);
			return true;
		}
		int[] componentOptions = getIComponentsIds(interId);
		if (componentOptions == null)
			return false;
		player.getInterfaceManager().sendChatBoxInterface(interId);
		if (talkDefinitons.length != componentOptions.length)
			return false;
		for (int childOptionId = 0; childOptionId < componentOptions.length; childOptionId++)
			player.getPackets().sendIComponentText(interId, componentOptions[childOptionId], talkDefinitons[childOptionId]);
		if (type == IS_PLAYER || type == IS_NPC) {
			player.getPackets().sendEntityOnIComponent(type == IS_PLAYER, entityId, interId, 2);
			if (animationId != -1)
				player.getPackets().sendIComponentAnimation(animationId, interId, 2);
		} else if (type == IS_ITEM)
			player.getPackets().sendItemOnIComponent(interId, 2, entityId, animationId);
		return true;
	}

	public boolean options(String title, String... options) {
		 int i = 0;
		  player.getInterfaceManager().sendChatBoxInterface(1188);
		  Object[] params = new Object[options.length + 1];
		  params[i++] = options.length;
		  for (int j = 0; j < options.length; j++)
		   params[options.length - j] = options[j];
		  player.getPackets().sendIComponentText(1188, 20, title);
		  player.getPackets().sendRunScript(5589, params);
		  return true;
	}


	/*
	 * 
	 * auto selects title, new dialogues
	 */
	public boolean sendEntityDialogue(int type, int entityId, int animationId, String... text) {
		String title = "";
		if(type == IS_PLAYER) {
			title = player.getDisplayName();
		}else if(type == IS_NPC) {
			title = NPCDefinitions.getNPCDefinitions(entityId).name;
		}else if (type == IS_ITEM) 
			title = ItemDefinitions.getItemDefinitions(entityId).getName();
		return sendEntityDialogue(type, title, entityId, animationId, text);
	}

	/*
	 * idk what it for
	 */
	public int getP() {
		return 1;
	}


	public static final int OPTION_1 = 11, OPTION_2 = 13, OPTION_3 = 14, OPTION_4 = 15, OPTION_5 = 16;

	public static boolean sendOptionsDialogue(Player player, String title, String... options) {
		 int i = 0;
		  player.getInterfaceManager().sendChatBoxInterface(1188);
		  Object[] params = new Object[options.length + 1];
		  params[i++] = options.length;
		  for (int j = 0; j < options.length; j++)
		   params[options.length - j] = options[j];
		  player.getPackets().sendIComponentText(1188, 20, title);
		  player.getPackets().sendRunScript(5589, params);
		  return true;
	}


	public boolean sendOptionsDialogue(String title, String... options) {
		player.getInterfaceManager().sendChatBoxInterface(1188);
		player.getPackets().sendIComponentText(1188, 20, title);
		for(int line = 0; line < 5; line++) {
			if(line < options.length) {
				if(line == 0)
					player.getPackets().sendIComponentText(1188, 3, options[line]);
				else if(line == 1)
					player.getPackets().sendIComponentText(1188, 24, options[line]);
				else if(line == 2)
					player.getPackets().sendIComponentText(1188, 29, options[line]);
				else if(line == 3)
					player.getPackets().sendIComponentText(1188, 34, options[line]);
				else if(line == 4)
					player.getPackets().sendIComponentText(1188, 39, options[line]);
			}else {
				if (line == 2) {
					player.getPackets().sendHideIComponent(1188, 14, true);
				}else if (line == 3) {
					player.getPackets().sendHideIComponent(1188, 15, true);
				}else if (line == 4) {
					player.getPackets().sendHideIComponent(1188, 16, true);
				}
			}
		}
		return true;
	}

	public static boolean sendNPCDialogueNoContinue(Player player, int npcId, int animationId, String... text) {
		return sendEntityDialogueNoContinue(player, IS_NPC, npcId, animationId, text);
	}

	public static boolean sendPlayerDialogueNoContinue(Player player, int animationId, String... text) {
		return sendEntityDialogueNoContinue(player, IS_PLAYER, -1, animationId, text);
	}

	/*
	 * 
	 * auto selects title, new dialogues
	 */
	public static boolean sendEntityDialogueNoContinue(Player player, int type, int entityId, int animationId, String... text) {
		String title = "";
		if(type == IS_PLAYER) {
			title = player.getDisplayName();
		}else if(type == IS_NPC) {
			title = NPCDefinitions.getNPCDefinitions(entityId).name;
		}else if (type == IS_ITEM) 
			title = ItemDefinitions.getItemDefinitions(entityId).getName();
		return sendEntityDialogueNoContinue(player, type, title, entityId, animationId, text);
	}

	public static boolean sendEntityDialogueNoContinue(Player player, int type, String title, int entityId, int animationId, String... texts) {
		StringBuilder builder = new StringBuilder();
		for(int line = 0; line < texts.length; line++) 
			builder.append(" " + texts[line]);
		String text = builder.toString();
		player.getInterfaceManager().replaceRealChatBoxInterface(1192);
		player.getPackets().sendIComponentText(1192, 16, title);
		player.getPackets().sendIComponentText(1192, 12, text);
		player.getPackets().sendEntityOnIComponent(type == IS_PLAYER, entityId, 1192, 11);
		if(animationId != -1)
			player.getPackets().sendIComponentAnimation(animationId, 1192, 11);
		return true;
	}

	public static void closeNoContinueDialogue(Player player) {
		player.getInterfaceManager().closeReplacedRealChatBoxInterface();
	}

	/*
	 * new dialogues
	 */
	public boolean sendEntityDialogue(int type, String title, int entityId, int animationId, String... texts) {
		StringBuilder builder = new StringBuilder();
		for(int line = 0; line < texts.length; line++) 
			builder.append(" " + texts[line]);
		String text = builder.toString();
		if(type == IS_NPC) {
			player.getInterfaceManager().sendChatBoxInterface(1184);
			player.getPackets().sendIComponentText(1184, 17, title);
			player.getPackets().sendIComponentText(1184, 13, text);
			player.getPackets().sendNPCOnIComponent(1184, 11, entityId);
			if(animationId != -1)
				player.getPackets().sendIComponentAnimation(animationId, 1184, 11);
		}else if(type == IS_PLAYER) {
			player.getInterfaceManager().sendChatBoxInterface(1191);
			player.getPackets().sendIComponentText(1191, 8, title);
			player.getPackets().sendIComponentText(1191, 17, text);
			player.getPackets().sendPlayerOnIComponent(1191, 15);
			if(animationId != -1)
				player.getPackets().sendIComponentAnimation(animationId, 1191, 15);
		}
		return true;
	}

	public boolean sendDialogue(String... texts) {
		StringBuilder builder = new StringBuilder();
		for(int line = 0; line < texts.length; line++) 
			builder.append((line == 0 ? "<p="+getP()+">" : "<br>") + texts[line]);
		String text = builder.toString();
		player.getInterfaceManager().sendChatBoxInterface(1186);
		player.getPackets().sendIComponentText(1186, 1, text);
		return true;
	}

	public boolean sendEntityDialogue(short interId, String[] talkDefinitons,
			byte type, int entityId, int animationId) {
		if(type == IS_PLAYER || type == IS_NPC) { //auto convert to new dialogue all old dialogues
			String[] texts = new String[talkDefinitons.length-1];
			for(int i = 0; i < texts.length; i++)
				texts[i] = talkDefinitons[i+1];
			sendEntityDialogue(type, talkDefinitons[0], entityId, animationId, texts);
			return true;
		}
		int[] componentOptions = getIComponentsIds(interId);
		if (componentOptions == null)
			return false;
		player.getInterfaceManager().sendChatBoxInterface(interId);
		if (talkDefinitons.length != componentOptions.length)
			return false;
		for (int childOptionId = 0; childOptionId < componentOptions.length; childOptionId++)
			player.getPackets().sendIComponentText(interId,
					componentOptions[childOptionId],
					talkDefinitons[childOptionId]);
		if (type == IS_PLAYER || type == IS_NPC) {
			player.getPackets().sendEntityOnIComponent(type == IS_PLAYER,
					entityId, interId, 2);
			if (animationId != -1)
				player.getPackets().sendIComponentAnimation(animationId,
						interId, 2);
		} else if (type == IS_ITEM)
			player.getPackets().sendItemOnIComponent(interId, 2, entityId,
					animationId);
		return true;
	}


}
