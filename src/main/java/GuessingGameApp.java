import java.sql.SQLOutput;
import java.util.*;

public class GuessingGameApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int randomNumber = 7;
        int guessedNumber = 0;
        int guessCount = 0;

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
            else if(guessedNumber != randomNumber && guessCount < 2) {
                System.out.print("Wrong! You can guess 1 more time: ");
            }
            else {
                break;
            }
        } while (guessedNumber == 0 || guessCount < 2);
        if(guessedNumber == randomNumber) {
            System.out.println("You win! " + randomNumber + " was the number!");
        }
        else {
            System.out.println("You lose! " + randomNumber + " was the number!");
        }

    }

}
