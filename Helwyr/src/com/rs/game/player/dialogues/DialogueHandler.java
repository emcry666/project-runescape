package com.rs.game.player.dialogues;

import java.util.HashMap;

import com.rs.utils.Logger;
import com.rs.utils.Utils;

public final class DialogueHandler {

	private static final HashMap<Object, Class<? extends Dialogue>> handledDialogues = new HashMap<Object, Class<? extends Dialogue>>();

	@SuppressWarnings({ "unchecked" })
	public static final void init() {
		try {
			
			Class<Dialogue>[] impl = Utils.
					getClasses("com.rs.game.player.dialogues.impl");
			
			Class<Dialogue>[] workers = Utils.
					getClasses("com.rs.game.player.actions.priffidinas.workers");
			
			Class<Dialogue>[] cooksassistant = Utils
					.getClasses("com.rs.game.player.content.quest.impl.cooksassistant.dialogues");
	
			Class<Dialogue>[] miscellania = Utils
					.getClasses("com.rs.game.player.content.jobs.impl.miscellania.dialogues");

			Class<Dialogue>[] druidicritual = Utils
					.getClasses("com.rs.game.player.content.quest.impl.druidicritual.dialogues");

			Class<Dialogue>[] doricsquest = Utils
					.getClasses("com.rs.game.player.content.quest.impl.doricsquest.dialogues");
			
			Class<Dialogue>[] restlessghost = Utils
					.getClasses("com.rs.game.player.content.quest.impl.restlessghost.dialogues");

			Class<Dialogue>[] impcatcher = Utils
					.getClasses("com.rs.game.player.content.quest.impl.impcatcher.dialogues");

			Class<Dialogue>[] runemysteries = Utils
					.getClasses("com.rs.game.player.content.quest.impl.runemysteries.dialogues");

			Class<Dialogue>[] goblindiplomacy = Utils
					.getClasses("com.rs.game.player.content.quest.impl.goblindiplomacy.dialogues");

			Class<Dialogue>[] piratestreasure = Utils
					.getClasses("com.rs.game.player.content.quest.impl.piratestreasure.dialogues");

			Class<Dialogue>[] princealiresuce = Utils
					.getClasses("com.rs.game.player.content.quest.impl.princealirescue.dialogues");
			
			Class<Dialogue>[] vampireslayer = Utils
					.getClasses("com.rs.game.player.content.quest.impl.vampireslayer.dialogues");
			
			for (Class<Dialogue> c : miscellania) {
				if (c.isAnonymousClass()) {
					continue;
				}
				DialogueHandler.handledDialogues.put(c.getSimpleName(), c);
			}
			for (Class<Dialogue> c : cooksassistant) {
				if (c.isAnonymousClass()) {
					continue;
				}
				DialogueHandler.handledDialogues.put(c.getSimpleName(), c);
			}
			for (Class<Dialogue> c : druidicritual) {
				if (c.isAnonymousClass()) {
					continue;
				}
				DialogueHandler.handledDialogues.put(c.getSimpleName(), c);
			}
			for (Class<Dialogue> c : doricsquest) {
				if (c.isAnonymousClass()) {
					continue;
				}
				DialogueHandler.handledDialogues.put(c.getSimpleName(), c);
			}
			for (Class<Dialogue> c : restlessghost) {
				if (c.isAnonymousClass()) {
					continue;
				}
				DialogueHandler.handledDialogues.put(c.getSimpleName(), c);
			}
			for (Class<Dialogue> c : impcatcher) {
				if (c.isAnonymousClass()) {
					continue;
				}
				DialogueHandler.handledDialogues.put(c.getSimpleName(), c);
			}
			for (Class<Dialogue> c : runemysteries) {
				if (c.isAnonymousClass()) {
					continue;
				}
				DialogueHandler.handledDialogues.put(c.getSimpleName(), c);
			}
			for (Class<Dialogue> c : goblindiplomacy) {
				if (c.isAnonymousClass()) {
					continue;
				}
				DialogueHandler.handledDialogues.put(c.getSimpleName(), c);
			}
			for (Class<Dialogue> c : piratestreasure) {
				if (c.isAnonymousClass()) {
					continue;
				}
				DialogueHandler.handledDialogues.put(c.getSimpleName(), c);
			}
			for (Class<Dialogue> c : princealiresuce) {
				if (c.isAnonymousClass()) {
					continue;
				}
				DialogueHandler.handledDialogues.put(c.getSimpleName(), c);
			}
			for (Class<Dialogue> c : vampireslayer) {
				if (c.isAnonymousClass()) {
					continue;
				}
				DialogueHandler.handledDialogues.put(c.getSimpleName(), c);
			}
			for (Class<Dialogue> c : impl) {
				if (c.isAnonymousClass())
					continue;
				handledDialogues.put(c.getSimpleName(), c);
			}
			for (Class<Dialogue> c : workers) {
				if (c.isAnonymousClass())
					continue;
				handledDialogues.put(c.getSimpleName(), c);
			}
			
		} catch (Throwable e) {
			Logger.handle(e);
		}
	}

	public static final void reload() {
		handledDialogues.clear();
		init();
	}

	public static final Dialogue getDialogue(Object key) {
		if (key instanceof Dialogue)
			return (Dialogue) key;
		Class<? extends Dialogue> classD = handledDialogues.get(key);
		if (classD == null)
			return null;
		try {
			return classD.newInstance();
		} catch (Throwable e) {
			Logger.handle(e);
		}
		return null;
	}
}
