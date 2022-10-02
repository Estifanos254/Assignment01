package RandomNumberGuesser;
/*
 * Class: CMSC203 
 * Instructor: Professor Gregoriy Grinberg
 * Description: (The first class, RNG contains the methods that are responsible to generate a random integer numbers between
 *      0 and 99. Whenever RNG.rand() is called in the main, it automatically generates numbers. and the other three methods resetCount,
 *     getCount, and inputValidation are also used. the second class is the driver class, named randomNumberGuesser, it is responsible
 *     to hold the main method that asks user for guesses, allow to make multiple guess until they the maximum count, 7; and it also prints out other the
 *     result of guess, and display the number of guesses and finally terminates the program after the 7th guess while in the do while loop.
 * Due: 09/26/2022
 * Platform/compiler: Eclipse, and online compiler
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: _Estifanos Kebebew_________
*/

import java.util.Random;
import java.util.Scanner;

//creating a class named RandomNumberGuesses. it holds the main method
public class RandomNumberGuesser {
	public static void main(String[] args) {
		// Declare variables

		int playerGuess = 0, lowGuess = 0, highGuess = 0;
		boolean bool = false;
		String choice = null;
		/*
		 * scanner class object to get input from the user
		 */
		Scanner scanner = new Scanner(System.in);

		// the loops runs until user enters no
		while (true) {
			lowGuess = 1;
			highGuess = 100;
			int randomNum = RNG.rand();
			System.out.println("This application generates a random number between 0 and 100"
					+ "\nand asks the user to repeatedly guess until they guess correctly");
			System.out.println("\n Enter the first guess: ");
			playerGuess = scanner.nextInt();

			if (playerGuess == randomNum) {
				System.out.println("Congratulaions, you guessed correctly");
			} else {
				while (true) {
					do {
						bool = RNG.inputValidation(playerGuess, lowGuess, highGuess);
						if (bool) {
							break;
						}
						playerGuess = scanner.nextInt();
					} while (!bool);
					if (playerGuess < randomNum) {
						lowGuess = playerGuess + 1;
						System.out.println("your guess is too low");
					} else if (playerGuess > randomNum) {
						System.out.println("your guess is too high");
					} else {
						System.out.println("Congratulations, you guessed correct!");
						break;
					}
					if (RNG.getCount() == 8) {
						System.out.println("You have exceeded the maximum number of guesses, 7" + ". Try again");
						System.exit(0);
					}
					System.out.println("Number of guess is: " + RNG.getCount());
					System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
					playerGuess = scanner.nextInt();

				}

			}
			System.out.println("Try again? (Yes or no)");
			scanner.nextLine();
			choice = scanner.nextLine();
			if ("no".equalsIgnoreCase(choice)) {
				System.out.println("Thanks for playing");
				break;
			} else {
				RNG.resetCount();
			}

		}

		System.out.println("Programmer name: Estifanos Kebebew");
	}

}

// creating a class
class RNG {
	// declaring a static variable
	private static int count = 0;

	// Zero argument constructor
	public RNG() {
		count = 0;
	}

	// This method will reset the value of the count to 0
	public static void resetCount() {
		count = 0;
	}

	// This method will generate a random number number between 1 and 99
	public static int rand() {
		Random rand = new Random();
		int randInteger = rand.nextInt(100);
		return randInteger;
	}

	// This method will return the count value
	public static int getCount() {
		return count;
	}

	/*
	 * This method validate whether the user entered number is with in the required
	 * range
	 * 
	 */
	public static boolean inputValidation(int nextGuess, int lowGuess, int highGuess) {
		boolean returnValue = true;
		if (nextGuess > highGuess || nextGuess < lowGuess) {
			System.out.println(">>> Guess must be between " + lowGuess + " and " + highGuess + ". Try again");
			returnValue = false;
		}
		if (returnValue) {
			count++;
		}
		return returnValue;

	}

}
