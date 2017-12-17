/**
 * Copyright 2015 - 2015 (C) Project-Arrow
 * 
 * File name : GypsyAris.java
 * Created on : Aug 9, 2015
 * Author     : Ethan
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * Contributors:
 * Tristan Swasey / Abexlry
 * Brandon / Frostbite
 * Ethan Millard / Fate
 * Yassin / Displee / Maffia-rpg
 * Austin Owens / Whitelight
 */
package com.rs.game.player.content.quest.impl.demonslayer.dialogues;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.game.player.dialogues.Mood;

/**
 * The Class GypsyAris.
 */
public class GypsyAris extends Dialogue {
	
	

	/* (non-Javadoc)
	 * @see com.arrow.game.content.dialogues.Dialogue#start()
	 */
	@Override
	public void start() {
		stage = (Integer) parameters[0];
		sendNPCChat(Mood.HAPPY, "Hello young one.");
		stage = -1;
	}

	/* (non-Javadoc)
	 * @see com.arrow.game.content.dialogues.Dialogue#run(int, int)
	 */
	@Override
	public void run(int interfaceId, int componentId) {
		switch (stage) {
		case -1:
			sendNPCChat(Mood.CHEERFULLY_TALK, "Cross my palm with silver and the future will be", "revealed to you.");
			stage = 0;
			break;
		case 0:
			sendOptionsDialogue(DEFAULT, "Ok, here you go.", "Who are you calling young one?!", "No, I don't believe in that stuff.", "With silver?");
			stage = 1;
			break;
		case 1:
			switch(componentId) {
			case OPTION_1:
				break;
			case OPTION_2:
				sendPlayerChat(Mood.MAD, "Who are you calling young one?!");
				stage = 3;
				break;
			case OPTION_3:
				sendPlayerChat(Mood.CONFUSED, "No, I don't believe in that stuff.");
				stage = 2;
				break;
			case OPTION_4:
				sendPlayerChat(Mood.QUESTIONING, "With silver?");
				stage = 13;
				break;
			}
			break;
		case 2:
			sendNPCChat(Mood.SAD, "Ok suit yourself.");
			stage = -2;
			break;
		case 3:
			sendNPCChat(Mood.PLAIN_TALKING, "You have been on this world a relatively short time. At", "least compared to me.");
			stage = 4;
			break;
		case 4:
			sendNPCChat(Mood.ASKING, "So, do you want your fortune told or not?");
			stage = 5;
			break;
		case 5:
			sendOptionsDialogue(DEFAULT, "Yes please.", "No, I don't believe in that stuff.", "Ooh, how old are you then?");
			stage = 6;
			break;
		case 6:
			switch(componentId) {
			case OPTION_1:
				break;
			case OPTION_2:
				sendPlayerChat(Mood.CONFUSED, "No, I don't believe in that stuff.");
				stage = 2;
				break;
			case OPTION_3:
				sendPlayerChat(Mood.ASKING, "Ooh, how old are you then?");
				stage = 7;
				break;
			}
			break;
		case 7:
			sendNPCChat(Mood.CHEERFULLY_TALK, "Older than you imagine.");
			stage = 8;
			break;
		case 8:
			sendOptionsDialogue(DEFAULT, "Believe me, I have a good imagination.", "How do you know how old I think you are?", "Oh, pretty old then.");
			stage = 9;
			break;
		case 9:
			switch(componentId) {
			case OPTION_1:
				sendPlayerChat(Mood.CHEERFULLY_TALK, "Believe me, I have a good imagination.");
				stage = 12;
				break;
			case OPTION_2:
				sendPlayerChat(Mood.CONFUSED, "How do you know how old I think you are?");
				stage = 11;
				break;
			case OPTION_3:
				sendPlayerChat(Mood.QUESTIONING, "Oh, pretty old then.");
				stage = 10;
				break;
			}
			break;
		case 10:
			sendNPCChat(Mood.SAD, "Yes I am old. Don't rub it in.");
			stage = -2;
			break;
		case 11:
			sendNPCChat(Mood.CHEERFULLY_TALK, "I have the power to know, just as I have the power to", "see the future.");
			stage = -2;
			break;
		case 12:
			sendNPCChat(Mood.HAPPY, "You seem like just the sort of person who would want", "their fortune told then.");
			break;
		case 13:
			sendNPCChat(Mood.CHEERFULLY_TALK, "Oh, sorry, I forgot. With gold, I mean. They haven't", "used silver coins since before you were born!", "So, do", "you want your fortune told?");
			stage = 14;
			break;
		case 14:
			sendOptionsDialogue(DEFAULT, "Ok, here you go.", "No, I don't believe in that stuff.");
			stage = 15;
			break;
		case 15:
			switch(componentId) {
			case OPTION_1:
				break;
			case OPTION_2:
				break;
			}
			break;
		case -2:
			end();
			break;
		}
	}

	/* (non-Javadoc)
	 * @see com.arrow.game.content.dialogues.Dialogue#finish()
	 */
	@Override
	public void finish() {

	}

}
