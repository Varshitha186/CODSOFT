import java.util.Scanner;
import java.util.Random;

public class NumberGame {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    int min = 1, max = 100;
    int attempts = 0;
    boolean playAgain;

    System.out.println("Welcome to the Number Guessing game!");

    do {
      int numberToGuess = rand.nextInt(max - min + 1) + min;
      int guess;
      int maxAttempts = 5;
      attempts = 0;
      boolean guessedCorrectly = false;

      System.out.println("\nGuess a number between" + min + " and " + max);

      while (attempts<maxAttempts) {
        System.out.print("Enter your guess:");
        guess = sc.nextInt();
        attempts++;

        if(guess < numberToGuess) {
          System.out.println("Too low!");
        } else if (guess > numberToGuess) {
          System.out.println("Too high!");
        } else {
          System.out.println("Correct! You guessed it in " + attempts + "attempts.");
          guessedCorrectly = true;
          break;
        }
      }

      if(!guessedCorrectly) {
        System.out.println("You used all attempts. The number was: " + numberToGuess);
      }

      System.out.print("\nDo you want to play again? (yes/no):");
      sc.nextLine();
      String again = sc.nextLine();
      playAgain = again.equalsIgnoreCase("yes");

    }while (playAgain);

    System.out.println("Thank for playing!");
    sc.close();
  }
}
      
