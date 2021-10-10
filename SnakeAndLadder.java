package com.bridgeladz;

import java.lang.*;

public class SnakeAndLadder {

	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static final int WINNING_POSITION = 100;
	
	public static void main(String[] args) {
		
		// Displaying Welcome Message
		System.out.println("Welcome To Snake And Ladder Game");

		int position = 0;
		int reach = 0;
		int roll = 0;
		int start = 0;
		int counter = 0;

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
			
			switch (option) {
			case NO_PLAY:
				roll = 0;
				break;
			case LADDER:
				counter++;
				roll = +diceValue;
				break;
			case SNAKE:
				roll = -diceValue;
				break;
			}
			
			/*
			 * Repeating till the Player reaches the winning position 100
			 * Reporting the number of times the dice was played to win 
			 * Also Showing Current Position after every dice roll
			 */
			position = (position + roll);
			if ((position < start) && (option == 0)) {
				System.out.println("Current Position: " + start);
				reach = start;
				System.out.println("Reached: " + reach);
			} else if ((position > WINNING_POSITION) && ((option == 1) || (option == 2))) {
				System.out.println("Current Position: " + position);
				reach = WINNING_POSITION;
				System.out.println("Reached: " + reach);
				break;
			} else if (position < 0) {
				System.out.println("Current Position: " + start);
				reach = start;
				System.out.println("Reached: " + reach);
			} else {
				System.out.println("Current Position: " + position);
				reach = position;
				System.out.println("Reached: " + reach);
			}
		}
		System.out.println("Number of time dice was rolled to win game :" + counter);
		System.out.println("Win:" + reach);
	}

}
