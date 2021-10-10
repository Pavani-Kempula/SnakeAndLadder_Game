package com.bridgeladz;

import java.lang.*;

public class SnakeAndLadder {

	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;

	public static void main(String[] args) {

		// Displaying Welcome Message
		System.out.println("Welcome to Snake And Ladder Game");

		int start = 0;
		int roll = 0;
		/*
		 * Math.random() function generating random numbers from range 1 to 6  
		 * Converting it to nearest possible integer number using Math.floor()
		 */
		int diceValue = (int) Math.floor(Math.random() * 6) + 1;
		System.out.println("Dice value is :" + diceValue);

		// Using random to check for option of No Play, Snake or Ladder
		int option = (int) Math.floor(Math.random() * 10) % 3;
		System.out.println("Option is :" + option);

		switch (option) {
		case NO_PLAY:
			// current position
			roll = roll;
			break;
		case LADDER:
			// incrementing players current position by the random number generated on the dice
			roll = +diceValue;
			break;
		case SNAKE:
			// decrementing players current position by the random number generated on the dice
			roll -= diceValue;
			if (roll < 0) {
				roll = 0;
			}
			break;
		}
		int position = (start + roll);
		System.out.println("Current Position:" + position);

	}

}
