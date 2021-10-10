package com.bridgeladz;

import java.lang.*;

public class SnakeAndLadder {

	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static final int WINNING_POSITION = 100;
	
	public static void main(String[] args) {
		int position = 0;
		int reach = 0;
		while (reach < WINNING_POSITION) {
			reach++;
			/*
			 * Using random to get Dice number
			 * Math.random() function generating random numbers from range 1 to 6
			 * Converting it to nearest possible integer number using Math.floor()
			 */
			int diceValue = (int) Math.floor(Math.random() * 6) + 1;
			System.out.println("Dice value is :" + diceValue);

			// Using random to check for option of No Play, Snake or Ladder
			int option = (int) Math.floor(Math.random() * 10) % 3;
			System.out.println("Option is :" + option);

			// Repeating till the Player reaches the winning position
			switch (option) {
			case NO_PLAY:
				position += 0;
				break;
			case LADDER:
				if ((position + diceValue) < 100) {
					position += diceValue;
					reach = position;
				} else
					position += diceValue;
				reach = position;

				break;
			case SNAKE:
				if (position > 0) {
					position -= diceValue;
					reach = position;
				} else
					position = 0;
				reach = position;

				break;
			}
			System.out.println("Reached:" + reach);
		}
		System.out.println("Win:" + reach);

	}

}
