import java.sql.SQLOutput;
import java.util.*;

public class GuessingGameApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int randomNumber = (int)((Math.random()*10)+1);
        int guessedNumber = 0;
        int guessCount = 0;
        int maxGuessCount = 3;

        System.out.print("Welcome to the Guessing Game! Please Guess a number between 1 and 10, or type 0 for instructions: ");
        do {
            guessedNumber = in.nextInt();
            guessCount++;

            if(guessedNumber == -1) {
                System.out.println("Exiting Application..");
                return;
            }
            if(guessedNumber == 0) {
                System.out.println("The goal of the game is to guess the random number between 1 and 10. Good Luck!");
                guessCount--;
            }
            else if(guessedNumber != randomNumber && guessCount < maxGuessCount) {
                if(guessCount  <= maxGuessCount - 2) {
                    System.out.print("Wrong!"+ " You can guess " + (maxGuessCount - guessCount) + " more times. (HINT) the number is ");
                }
                else if(guessCount == maxGuessCount - 1) {
                    System.out.print("Wrong!"+ " You can guess " + (maxGuessCount - guessCount) + " more time. (HINT) the number is ");
                }
                if(guessedNumber < randomNumber) {
                    System.out.print("greater than your guess of " + guessedNumber + ": ");
                }
                else {
                    System.out.print("less than your guess of " + guessedNumber + ": ");
                }
            }
            else {
                break;
            }
        } while (guessedNumber == 0 || guessCount < maxGuessCount);
        if(guessedNumber == randomNumber) {
            System.out.println("You win! " + randomNumber + " was the number!");
        }
        else {
            System.out.println("You lose! " + randomNumber + " was the number!");
        }

    }

}
