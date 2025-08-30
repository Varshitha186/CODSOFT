import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = rand.nextInt(100) + 1; // random between 1-100
            int attempts = 0;
            int guess = 0;
            int maxAttempts = 10; // optional limit

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have picked a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess it!");

            // Game loop
            while (guess != numberToGuess && attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("🎉 Correct! You guessed it in " + attempts + " attempts.");
                }
            }

            if (guess != numberToGuess) {
                System.out.println("❌ Out of attempts! The number was: " + numberToGuess);
            }

            // Ask if the player wants another round
            System.out.print("Do you want to play again? (yes/no): ");
            String response = sc.next().toLowerCase();
            playAgain = response.equals("yes");
        }

        System.out.println("Thanks for playing! Goodbye.");
        sc.close();
    }
}
