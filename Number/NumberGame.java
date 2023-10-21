package Number; //create a package

import java.util.Random;
import java.util.Scanner;

public class NumberGame {   //create class
	public static void main(String[] args) {
		int i = 1, num, ch;

		Random rand = new Random();
		Scanner sobjr = new Scanner(System.in);
		int rNo = rand.nextInt(1, 100);

		while (true) {
			System.out.println("Welcome to the Guessing Game");
			System.out.println("--------------------------------");
			System.out.println("Option 1, For Play Again Game");
			System.out.println("Option 2, For Exit The Game");
			System.out.println("Please select any one option");
			System.out.println("--------------------------------");
			ch = sobjr.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Please Guess the number");

				while (i < 5) {
					num = sobjr.nextInt(); //input for value
					if (rNo == num) {      // check the condition
						System.out.println("High ");
						System.out.println("You won the Game in " + i + " Attempts");
						break;

					} else {
						System.out.println("Low ");
					}
					i++; // increament the value
					System.out.println("Guess Again any Number"); //input number again and again
				}
				if (i == 5) { 
					System.out.println("You have Lost the Game");  // print lost game
				}
				break;
			case 2:

				System.out.println("Thank You For Exit the Game"); // exit game
				System.out.println("--------------------------------");
				return;

			default:
				System.out.println("Invalid Choice Please Select Correct  Option"); // if invalid choice
				System.out.println("--------------------------------");

			}

			System.out.println("Game Over"); //game over
			System.out.println("Thank for Playing Game"); //thank you for playing game
			System.out.println("--------------------------------");
		}

	}
}