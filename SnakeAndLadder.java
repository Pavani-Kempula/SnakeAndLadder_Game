package com.bridgeladz;

public class SnakeAndLadder {

	final static int NO_OF_PLAYER = 1;
	final static int START_POSITION = 0;

	public static void main(String[] args) {

		// Displaying Welcome Message
		System.out.println("Welcome to Snake And Ladder Game");
		int position = 0;

		/**
		 * using Math.random() function generating random numbers from range 1 to 6
		 * Converting it to nearest possible integer number using Math.floor()
		 */
		int diceValue = (int) Math.floor(Math.random() * 6) + 1;
		System.out.println("Player start position : " + position);
		System.out.println("Number of player is:" + NO_OF_PLAYER);
		System.out.println("Player rolls the dice and get :" + diceValue);

	}

}
